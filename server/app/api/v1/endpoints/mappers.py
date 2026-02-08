from fastapi import APIRouter, Depends, Query
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
