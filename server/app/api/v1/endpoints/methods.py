from fastapi import APIRouter, HTTPException, Query, Depends
from app.api import deps
from typing import Optional, List, Dict, Any
from app.core.database import get_db
from csa.utils.logger import get_logger

router = APIRouter()
logger = get_logger(__name__)

@router.get("/methods")
def search_methods(
    project_name: Optional[str] = None,
    package_name: Optional[str] = None,
    class_name: Optional[str] = None,
    method_name: Optional[str] = None,
    skip: int = 0,
    limit: int = 50,
    current_user: Any = Depends(deps.get_current_user)
) -> List[Dict[str, Any]]:
    """
    Search methods across projects with filters.
    Supports filtering by project, package, class (physical/logical), and method (physical/logical).
    """
    pool = get_db()
    
    where_clauses = []
    params = {}
    
    query = """
    MATCH (p:Project)-[:CONTAINS]->(pkg:Package)-[:CONTAINS]->(c:Class)-[:HAS_METHOD]->(m:Method)
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

    if class_name:
        where_clauses.append("(toLower(c.name) CONTAINS toLower($class_name) OR toLower(c.logical_name) CONTAINS toLower($class_name))")
        params["class_name"] = class_name
        
    if method_name:
        where_clauses.append("(toLower(m.name) CONTAINS toLower($method_name) OR toLower(m.logical_name) CONTAINS toLower($method_name))")
        params["method_name"] = method_name
    
    # Exclude unwanted methods if necessary (e.g., getters/setters if requested, but not in requirements yet)
    # where_clauses.append("NOT m.name STARTS WITH 'get'") 
         
    if where_clauses:
        query += " WHERE " + " AND ".join(where_clauses)
        
    query += """
    RETURN p.name as project_name, 
           pkg.name as package_name, 
           c.name as class_name, 
           c.logical_name as class_logical_name,
           m.name as method_name,
           m.logical_name as logical_name,
           m.return_type as return_type,
           m.visibility as visibility,
           m.cyclomatic_complexity as complexity
    ORDER BY p.name, pkg.name, c.name, m.name
    SKIP $skip
    LIMIT $limit
    """
    params["skip"] = skip
    params["limit"] = limit

    try:
        with pool.session() as session:
            result = session.run(query, **params)
            return [dict(record) for record in result]
    except Exception as e:
        logger.error(f"Search methods failed: {e}")
        raise HTTPException(status_code=500, detail=f"Database error during search: {str(e)}")
