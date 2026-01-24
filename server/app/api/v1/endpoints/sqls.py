from typing import Any, Dict, List, Optional

from fastapi import APIRouter, Depends, HTTPException
from pydantic import BaseModel

from app.api import deps
from app.core.database import get_db
from csa.utils.logger import get_logger

logger = get_logger(__name__)

router = APIRouter()


@router.get("/sqls")
def search_sqls(
    project_name: Optional[str] = None,
    mapper_name: Optional[str] = None,
    sql_id: Optional[str] = None,
    limit: int = 100,
    current_user: Any = Depends(deps.get_current_user)
):
    """
    Search SQL statements globally or by project.
    """
    pool = get_db()
    
    where_clauses = []
    params = {"limit": limit}
    
    query = """
    MATCH (s:SqlStatement)
    """
    
    # We want to join with Mapper optionally to get logical name
    # But if we filter by mapper_name, we should MATCH it.
    # Let's keep it simple: MATCH (s) OPTIONAL MATCH (m)
    
    query += """
    OPTIONAL MATCH (m:MyBatisMapper {name: s.mapper_name})
    """
    # Note: Mapper might rely on project_name to be unique? 
    # Usually mapper name is unique enough, but let's be careful multiple projects don't double count if they share mapper name but different node?
    # In our model, we key by project_name too. So `m` match should strict on project if s has it.
    
    # Actually, simpler:
    # MATCH (s:SqlStatement)
    # WHERE ...
    # OPTIONAL MATCH (m:MyBatisMapper {name: s.mapper_name, project_name: s.project_name})
    
    if project_name:
        where_clauses.append("toLower(s.project_name) CONTAINS toLower($project_name)")
        params["project_name"] = project_name
        
    if mapper_name:
        where_clauses.append("(toLower(s.mapper_name) CONTAINS toLower($mapper_name) OR (m IS NOT NULL AND toLower(m.logical_name) CONTAINS toLower($mapper_name)))")
        params["mapper_name"] = mapper_name
        
    if sql_id:
        where_clauses.append("(toLower(s.id) CONTAINS toLower($sql_id) OR toLower(s.logical_name) CONTAINS toLower($sql_id))")
        params["sql_id"] = sql_id

    if where_clauses:
        query += " WHERE " + " AND ".join(where_clauses)

    query += """
    RETURN s, m.logical_name as mapper_logical_name
    ORDER BY s.project_name, s.mapper_name, s.id
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
        
        return sql_data
