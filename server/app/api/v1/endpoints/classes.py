from fastapi import APIRouter, Depends, HTTPException
from pydantic import BaseModel
from typing import Optional
from app.api.deps import get_current_user
from app.models.user import UserInDB
from app.services.analysis_wrapper import start_analysis
from csa.services.analysis.neo4j_writer import connect_to_neo4j_db
from app.core.config import settings
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
    current_user: UserInDB = Depends(get_current_user)
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

    job_id = start_analysis(params, current_user.username) 
    return {"job_id": job_id}
