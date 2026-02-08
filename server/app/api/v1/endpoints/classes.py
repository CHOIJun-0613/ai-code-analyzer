from fastapi import APIRouter, Depends, HTTPException, Request
from pydantic import BaseModel
from typing import Optional
from app.api import deps
from app.api.deps import get_current_user, get_language_from_header
from app.models.user import UserInDB
from app.services.analysis_wrapper import start_analysis
from csa.services.analysis.neo4j_writer import connect_to_neo4j_db
from app.core.config import settings
from app.core.database import get_db
from csa.utils.logger import get_logger

router = APIRouter()
logger = get_logger(__name__)

class AnalysisRequest(BaseModel):
    include_ai: bool = False
    skip_dto_source: bool = True
    skip_dto_methods: bool = True
    ai_options: Optional[dict] = None

@router.post("/projects/{project_name}/classes/{class_name}/analyze")
def trigger_class_analysis(
    project_name: str,
    class_name: str,
    request: AnalysisRequest,
    current_user: UserInDB = Depends(deps.verify_project_access),
    language: str = Depends(get_language_from_header),
):
    # 1. Lookup file path
    file_path = None
    try:
        db = connect_to_neo4j_db(
            settings.NEO4J_URI,
            settings.NEO4J_USER, 
            settings.NEO4J_PASSWORD,
            settings.NEO4J_DATABASE or "neo4j",
            logger
        )
        file_path = db.get_file_path_for_class(class_name, project_name)
        # db.close() # GraphDB shares connection pool, no need to close
    except Exception as e:
        logger.error(f"Database lookup failed: {e}")
        raise HTTPException(status_code=500, detail="Database connection error")

    if not file_path:
         raise HTTPException(status_code=404, detail=f"Class {class_name} not found in project {project_name}")

    # 2. Start Analysis
    params = {
        "analysis_target": "target_file",
        "target_file_path": file_path,
        "project_name": project_name,
        "use_ai": request.include_ai,
        "skip_dto_source": request.skip_dto_source,
        "skip_dto_methods": request.skip_dto_methods,
        "ai_options": request.ai_options,
        "clean": False # Ensure clean is false
    }

    job_id = start_analysis(params, current_user.username, language=language)
    return {"job_id": job_id}

@router.get("/classes")
def search_classes(
    project_name: Optional[str] = None,
    package_name: Optional[str] = None,
    class_name: Optional[str] = None,
    skip: int = 0,
    limit: int = 50,
    current_user: UserInDB = Depends(get_current_user)
):
    pool = get_db()
    
    where_clauses = []
    params = {}
    
    query = """
    MATCH (p:Project)-[:CONTAINS]->(pkg:Package)-[:CONTAINS]->(c:Class)
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
         
    if where_clauses:
        query += " WHERE " + " AND ".join(where_clauses)
        
    query += """
    RETURN p.name as project_name, 
           pkg.name as package_name, 
           c.name as class_name, 
           c.logical_name as logical_name
    ORDER BY p.name, pkg.name, c.name
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
        logger.error(f"Search classes failed: {e}")
        raise HTTPException(status_code=500, detail="Database error during search")
