import json
from fastapi import APIRouter, Depends, Query, HTTPException
from app.api import deps
from typing import Optional, List, Dict, Any
from app.core.database import get_db
from csa.utils.logger import get_logger

router = APIRouter()
logger = get_logger(__name__)


@router.get("")
def search_mappers(
    project_name: Optional[str] = Query(None),
    package_name: Optional[str] = Query(None),
    mapper_name: Optional[str] = Query(None),
    skip: int = 0,
    limit: int = 50,
    current_user: Any = Depends(deps.get_current_user)
) -> List[Dict[str, Any]]:
    """
    Search MyBatis Mappers across projects with filters.
    Returns list of mappers with their SQL count.
    """
    pool = get_db()

    where_clauses = []
    params = {"skip": skip, "limit": limit}

    # Mapper 노드는 Package/Project와 CONTAINS 관계를 가짐
    query = """
    MATCH (p:Project)-[:CONTAINS]->(pkg:Package)-[:CONTAINS]->(m:MyBatisMapper)
    """

    # Access Control
    allowed_projects = deps.get_allowed_projects(current_user)
    if allowed_projects is not None:
        where_clauses.append("p.name IN $allowed_projects")
        params["allowed_projects"] = list(allowed_projects)

    if project_name:
        where_clauses.append("toLower(p.name) CONTAINS toLower($project_name)")
        params["project_name"] = project_name

    if package_name:
        where_clauses.append("toLower(pkg.name) CONTAINS toLower($package_name)")
        params["package_name"] = package_name

    if mapper_name:
        where_clauses.append("toLower(m.name) CONTAINS toLower($mapper_name)")
        params["mapper_name"] = mapper_name

    if where_clauses:
        query += " WHERE " + " AND ".join(where_clauses)

    # Count SQL statements for each mapper
    query += """
    OPTIONAL MATCH (m)-[:HAS_SQL_STATEMENT]->(s:SqlStatement)
    WITH p, pkg, m, count(s) as sql_count
    RETURN
        p.name as project_name,
        pkg.name as package_name,
        m.name as mapper_name,
        m.logical_name as mapper_logical_name,
        m.type as mapper_type,
        sql_count
    ORDER BY p.name, pkg.name, m.name
    SKIP $skip
    LIMIT $limit
    """

    with pool.session() as session:
        result = session.run(query, **params)
        mappers = []
        for record in result:
            mappers.append({
                "project_name": record["project_name"],
                "package_name": record["package_name"],
                "mapper_name": record["mapper_name"],
                "mapper_logical_name": record.get("mapper_logical_name"),
                "mapper_type": record.get("mapper_type"),
                "sql_count": record.get("sql_count", 0)
            })

    return mappers


@router.get("/projects/{project_name}/mappers/{mapper_name}")
def get_mapper_details(
    project_name: str,
    mapper_name: str,
    package_name: Optional[str] = Query(None),
    current_user: Any = Depends(deps.verify_project_access)
) -> Dict[str, Any]:
    """
    MyBatis Mapper 상세 정보를 조회한다.
    Mapper 노드의 전체 속성과 등록된 SQL 목록을 반환한다.
    """
    pool = get_db()

    query = """
    MATCH (m:MyBatisMapper {name: $mapper_name, project_name: $project_name})
    """
    params: Dict[str, Any] = {
        "mapper_name": mapper_name,
        "project_name": project_name,
    }

    if package_name:
        query += " WHERE m.package_name = $package_name"
        params["package_name"] = package_name

    query += """
    OPTIONAL MATCH (m)-[:HAS_SQL_STATEMENT]->(s:SqlStatement)
    WITH m, count(s) as sql_count
    RETURN m, sql_count
    """

    with pool.session() as session:
        result = session.run(query, **params).data()

        if not result:
            raise HTTPException(
                status_code=404,
                detail=f"Mapper '{mapper_name}' not found in project '{project_name}'"
            )

        mapper_node = result[0]["m"]
        sql_count = result[0]["sql_count"]

        # sql_statements는 JSON 문자열로 저장되어 있으므로 파싱
        sql_statements_raw = mapper_node.get("sql_statements", "[]")
        try:
            sql_statements = json.loads(sql_statements_raw) if isinstance(sql_statements_raw, str) else sql_statements_raw
        except (json.JSONDecodeError, TypeError):
            sql_statements = []

        # methods도 JSON 문자열로 저장
        methods_raw = mapper_node.get("methods", "[]")
        try:
            methods = json.loads(methods_raw) if isinstance(methods_raw, str) else methods_raw
        except (json.JSONDecodeError, TypeError):
            methods = []

        return {
            "name": mapper_node.get("name"),
            "logical_name": mapper_node.get("logical_name", ""),
            "type": mapper_node.get("type", ""),
            "file_extension": mapper_node.get("file_extension", ""),
            "namespace": mapper_node.get("namespace", ""),
            "file_path": mapper_node.get("file_path", ""),
            "package_name": mapper_node.get("package_name", ""),
            "source": mapper_node.get("source", ""),
            "description": mapper_node.get("description", ""),
            "ai_description": mapper_node.get("ai_description", ""),
            "updated_at": mapper_node.get("updated_at", ""),
            "project_name": mapper_node.get("project_name", ""),
            "sql_statements": sql_statements,
            "methods": methods,
            "sql_count": sql_count,
        }
