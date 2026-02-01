import json
from typing import Any, Dict, List, Optional

from fastapi import APIRouter, Depends, HTTPException
from pydantic import BaseModel

from app.api import deps
from app.core.database import get_db
from csa.utils.logger import get_logger
from csa.utils.sql_flow_normalizer import normalize_and_extract

logger = get_logger(__name__)

router = APIRouter()


@router.get("/sqls")
def search_sqls(
    project_name: Optional[str] = None,
    mapper_name: Optional[str] = None,
    sql_id: Optional[str] = None,
    limit: int = 100,
    skip: int = 0,
    current_user: Any = Depends(deps.get_current_user)
):
    """
    Search SQL statements globally or by project.
    """
    pool = get_db()
    
    where_clauses = []
    params = {"limit": limit, "skip": skip}
    
    query = """
    MATCH (s:SqlStatement)
    """
    
    # Check if we have filters that apply to SqlStatement (s) only
    s_filters = []
    if project_name:
        s_filters.append("toLower(s.project_name) CONTAINS toLower($project_name)")
        params["project_name"] = project_name
    
    # For sql_id, we check s.id and s.logical_name. logical_name is on s.
    if sql_id:
         s_filters.append("(toLower(s.id) CONTAINS toLower($sql_id) OR (s.logical_name IS NOT NULL AND toLower(s.logical_name) CONTAINS toLower($sql_id)))")
         params["sql_id"] = sql_id
         
    if s_filters:
        query += " WHERE " + " AND ".join(s_filters)
        
    query += """
    OPTIONAL MATCH (m:MyBatisMapper {name: s.mapper_name})
    """
    
    # Mapper name filter is tricky because it involves 'm' (optional) or 's' (mapper_name property)
    # If we filter by mapper_name, we want to match:
    # 1. s.mapper_name contains keyword
    # 2. OR m.logical_name contains keyword
    if mapper_name:
        query += " WITH s, m WHERE (toLower(s.mapper_name) CONTAINS toLower($mapper_name) OR (m IS NOT NULL AND toLower(m.logical_name) CONTAINS toLower($mapper_name)))"
        params["mapper_name"] = mapper_name

    if where_clauses:
        query += " WHERE " + " AND ".join(where_clauses)

    query += """
    RETURN s, m.logical_name as mapper_logical_name
    ORDER BY s.project_name, s.mapper_name, s.id
    SKIP $skip
    LIMIT $limit
    """
    
    with pool.session() as session:
        result = session.run(query, **params)
        sqls = []
        for record in result:
            sql_node = record["s"]
            if not sql_node:
                continue
                
            sql_data = dict(sql_node)
            
            # Enrich with mapper logical name if available
            if record["mapper_logical_name"]:
                sql_data["mapper_logical_name"] = record["mapper_logical_name"]
            
            sqls.append(sql_data)
            
    return sqls


@router.get("/projects/{project_name}/sqls/{sql_id}")
def get_sql_details(project_name: str, sql_id: str, mapper_name: str = None):
    """
    Get details for a specific SQL statement.
    """
    pool = get_db()
    
    # 1. Fetch SQL Node Info
    query_sql = """
    MATCH (s:SqlStatement {id: $sql_id})
    WHERE toLower(s.project_name) = toLower($project_name)
    """
    
    if mapper_name:
        query_sql += " AND s.mapper_name = $mapper_name"
    
    query_sql += """
    RETURN s
    """
    
    # 2. Fetch Calling Methods (Reverse Impact)
    query_calls = """
    MATCH (s:SqlStatement {id: $sql_id})
    WHERE toLower(s.project_name) = toLower($project_name)
    """
    if mapper_name:
        query_calls += " AND s.mapper_name = $mapper_name"
        
    query_calls += """
    MATCH (s)<-[:CALLS]-(m:Method)<-[:HAS_METHOD]-(c:Class)
    RETURN m.name as method_name, c.name as class_name, c.package_name as package_name, c.logical_name as class_logical_name
    """

    with pool.session() as session:
        params = {"sql_id": sql_id, "project_name": project_name}
        if mapper_name:
             params["mapper_name"] = mapper_name

        result_sql = session.run(query_sql, **params).data()
        
        if not result_sql:
            detail = f"SQL {sql_id} not found in project {project_name}"
            if mapper_name:
                detail += f" and mapper {mapper_name}"
            raise HTTPException(status_code=404, detail=detail)
        
        sql_data = result_sql[0]["s"]
        
        # Execute Calling Methods query
        result_calls = session.run(query_calls, **params)
        called_by = []
        for record in result_calls:
            called_by.append({
                "method_name": record["method_name"],
                "class_name": record["class_name"],
                "package_name": record["package_name"],
                "class_logical_name": record["class_logical_name"]
            })
            
        sql_data["called_by"] = called_by

        # SQL Flow JSON 처리
        # 1. DB에 저장된 flow_json 우선 사용
        flow_json_str = sql_data.get("flow_json")
        if flow_json_str and flow_json_str.strip():
            try:
                flow_json = json.loads(flow_json_str) if isinstance(flow_json_str, str) else flow_json_str
                if flow_json and isinstance(flow_json, dict) and flow_json.get("nodes"):
                    sql_data["flow_json"] = flow_json
                else:
                    # 빈 객체이거나 유효하지 않으면 ai_description에서 추출 시도
                    flow_json = None
            except (json.JSONDecodeError, TypeError):
                flow_json = None
        else:
            flow_json = None

        # 2. DB에 flow_json이 없으면 ai_description에서 추출 (fallback)
        if not flow_json:
            ai_description = sql_data.get("ai_description")
            if ai_description:
                flow_json = normalize_and_extract(ai_description)
                if flow_json:
                    sql_data["flow_json"] = flow_json

        return sql_data
