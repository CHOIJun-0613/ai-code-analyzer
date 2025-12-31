from fastapi import APIRouter, HTTPException, BackgroundTasks, UploadFile, File, Form
from pydantic import BaseModel
from typing import Optional
import shutil
import os
import tempfile
import zipfile
from app.services.analysis_wrapper import start_analysis, get_job_status, get_active_job
from fastapi import Depends
from app.api.deps import get_current_user
from app.models.user import UserInDB
from csa.utils.context import set_client_id

from app.core.database import get_db
from csa.services.graph_db import GraphDB
from app.core.config import settings

router = APIRouter()

def _get_cancel_flag_path(job_id: str) -> str:
    """Get the path for the job cancellation flag file."""
    current_dir = os.path.dirname(os.path.abspath(__file__))
    # Go up 4 levels: endpoints -> v1 -> api -> app -> server
    server_root = os.path.dirname(os.path.dirname(os.path.dirname(os.path.dirname(current_dir))))
    logs_dir = os.path.join(server_root, "logs")
    os.makedirs(logs_dir, exist_ok=True)
    return os.path.join(logs_dir, f"{job_id}.cancel")

class AnalysisRequest(BaseModel):
    source_folder: str
    project_name: Optional[str] = None
    application_name: Optional[str] = None
    db_script_folder: Optional[str] = None
    clean: bool = False
    use_ai: bool = False
    skip_dto_source: bool = True
    skip_dto_methods: bool = True
    scope: str = 'all'
    ai_provider: Optional[str] = 'google'
    api_key: Optional[str] = None
    model_name: Optional[str] = None
    api_endpoint: Optional[str] = None
    
    # Advanced Source Options
    use_streaming_parse: bool = True
    java_parse_workers: int = 8
    java_file_parse_timeout: float = 120.0
    java_complexity_threshold: int = 50000
    sequence_diagram_include_packages: Optional[str] = None
    log_level: str = 'INFO'
    exclude_patterns: Optional[str] = None
    
    # Advanced AI Options
    use_ai_analysis: bool = False # Explicit toggle for AI system
    concurrent_ai_requests: int = 15
    ai_enrichment_batch_size: int = 50

@router.post("/analyze")
def trigger_analysis(
    request: AnalysisRequest,
    current_user: UserInDB = Depends(get_current_user)
):
    # Set client_id context for this request (used for logging and job ID)
    set_client_id(current_user.username)

    # TODO: Validate path exists
    data = request.dict()
    ai_options = {
        "provider": data.pop("ai_provider", None),
        "api_key": data.pop("api_key", None),
        "model_name": data.pop("model_name", None),
        "api_endpoint": data.pop("api_endpoint", None),
        "concurrent_requests": data.pop("concurrent_ai_requests", 15),
        "batch_size": data.pop("ai_enrichment_batch_size", 50),
    }
    
    # Group source options
    source_options = {
        "use_streaming_parse": data.pop("use_streaming_parse", True),
        "java_parse_workers": data.pop("java_parse_workers", 8),
        "java_file_parse_timeout": data.pop("java_file_parse_timeout", 120.0),
        "java_complexity_threshold": data.pop("java_complexity_threshold", 50000),
        "sequence_diagram_include_packages": data.pop("sequence_diagram_include_packages", None),
        "log_level": data.pop("log_level", "INFO"),
        "exclude_patterns": data.pop("exclude_patterns", None),
    }
    
    data["ai_options"] = ai_options
    data["source_options"] = source_options
    
    job_id = start_analysis(data, user_id=current_user.username)
    return {"job_id": job_id, "status": "pending"}

@router.get("/active")
def get_active_analysis(
    current_user: UserInDB = Depends(get_current_user)
):
    """Get the current active analysis job for the user."""
    job = get_active_job(current_user.username)
    if not job:
        # Return empty response (200 OK) instead of 404 to avoid log spam
        return None
    
    # Return limited info to avoid huge logs payload if not needed
    return {
        "job_id": job["id"],
        "status": job["status"],
        "created_at": job.get("created_at")
    }

@router.get("/analyze/{job_id}")
def get_analysis_status(job_id: str):
    status = get_job_status(job_id)
    if not status:
        raise HTTPException(status_code=404, detail="Job not found")
    return status

@router.get("/analyze/{job_id}/logs")
def get_analysis_logs(job_id: str):
    job = get_job_status(job_id)
    if not job:
        raise HTTPException(status_code=404, detail="Job not found")
    return {"logs": job.get("logs", [])}

@router.post("/analyze/{job_id}/cancel")
def cancel_analysis(job_id: str):
    job = get_job_status(job_id)
    if not job:
        raise HTTPException(status_code=404, detail="Job not found")
    
    # Create cancellation flag file
    try:
        cancel_path = _get_cancel_flag_path(job_id)
        with open(cancel_path, 'w') as f:
            import datetime
            f.write(f"cancelled at {datetime.datetime.now()}")
            
        # Update in-memory status
        from app.services.analysis_wrapper import cancel_job_status
        cancel_job_status(job_id)
        
    except Exception as e:
        raise HTTPException(status_code=500, detail=f"Failed to create cancellation flag: {str(e)}")
        
    return {"message": "Cancellation requested", "job_id": job_id}

@router.post("/analyze/upload")
def upload_and_analyze(
    file: UploadFile = File(...),
    project_name: Optional[str] = Form(None),
    application_name: Optional[str] = Form(None),
    clean: bool = Form(False),
    use_ai: bool = Form(False),
    skip_dto_source: bool = Form(True),
    skip_dto_methods: bool = Form(True),
    scope: str = Form('all'),
    ai_provider: Optional[str] = Form('google'),
    api_key: Optional[str] = Form(None),
    model_name: Optional[str] = Form(None),
    api_endpoint: Optional[str] = Form(None),
    
    # Advanced Options (Form)
    use_streaming_parse: bool = Form(True),
    java_parse_workers: int = Form(8),
    java_file_parse_timeout: float = Form(120.0),
    java_complexity_threshold: int = Form(50000),
    sequence_diagram_include_packages: Optional[str] = Form(None),
    log_level: str = Form('INFO'),
    exclude_patterns: Optional[str] = Form(None),
    use_ai_analysis: bool = Form(False),
    concurrent_ai_requests: int = Form(15),
    ai_enrichment_batch_size: int = Form(50),
    current_user: UserInDB = Depends(get_current_user)
):
    # Set client_id context for this request (used for logging and job ID)
    set_client_id(current_user.username)

    # Create temp file
    temp_dir = tempfile.mkdtemp()
    zip_path = os.path.join(temp_dir, file.filename)
    
    try:
        with open(zip_path, "wb") as buffer:
            shutil.copyfileobj(file.file, buffer)
            
        # Unzip
        extract_path = os.path.join(temp_dir, "source")
        with zipfile.ZipFile(zip_path, 'r') as zip_ref:
            zip_ref.extractall(extract_path)
            
        # Prepare data dict
        ai_options = {
            "provider": ai_provider,
            "api_key": api_key,
            "model_name": model_name,
            "api_endpoint": api_endpoint,
            "concurrent_requests": concurrent_ai_requests,
            "batch_size": ai_enrichment_batch_size,
        }
        
        source_options = {
            "use_streaming_parse": use_streaming_parse,
            "java_parse_workers": java_parse_workers,
            "java_file_parse_timeout": java_file_parse_timeout,
            "java_complexity_threshold": java_complexity_threshold,
            "sequence_diagram_include_packages": sequence_diagram_include_packages,
            "log_level": log_level,
            "exclude_patterns": exclude_patterns,
        }
            
        data = {
            "source_folder": extract_path,
            "project_name": project_name or file.filename,
            "application_name": application_name,
            "clean": clean,
            "use_ai": use_ai,
            "skip_dto_source": skip_dto_source,
            "skip_dto_methods": skip_dto_methods,
            "scope": scope,
            "ai_options": ai_options,
            "source_options": source_options,
            "use_ai_analysis": use_ai_analysis
        }
        
        job_id = start_analysis(data, user_id=current_user.username)
        
        # Cleanup is handled by background task eventually, 
        # but here we just return the job_id. 
        # Note: In a real app, we shouldn't delete temp_dir immediately 
        # because start_analysis runs in background. 
        # Ideally start_analysis should handle cleanup or we rely on OS diff.
        
        return {"job_id": job_id, "status": "pending"}
        
    except Exception as e:
        shutil.rmtree(temp_dir, ignore_errors=True)
        raise HTTPException(status_code=500, detail=str(e))


@router.get("/history")
def get_analysis_history(
    limit: int = 100,
    current_user: UserInDB = Depends(get_current_user)
):
    """Retrieve list of past analysis jobs."""
    # Optional: check if user is admin
    # if not any(g.name == 'Administrators' for g in current_user.groups):
    #     raise HTTPException(status_code=403, detail="Not authorized")
    
    # db = get_db()  <-- Incorrect, returns Neo4jConnectionPool
    db = GraphDB(settings.NEO4J_URI, settings.NEO4J_USER, settings.NEO4J_PASSWORD, settings.NEO4J_DATABASE)
    try:
        history = db.get_analysis_history(limit=limit)
        return history
    except Exception as e:
        import traceback
        traceback.print_exc()
        raise HTTPException(status_code=500, detail=f"Failed to fetch history: {str(e)}")
    finally:
        db.close()


@router.delete("/history/{history_id}")
def delete_analysis_history(
    history_id: str,
    current_user: UserInDB = Depends(get_current_user)
):
    """Delete an analysis history record."""
    # Check admin permission
    is_admin = False
    if current_user.groups:
        for group in current_user.groups:
             # Dictionary or object? It's likely Pydantic model or dict from UserInDB
             # UserInDB definition in app/models/user.py says groups is List[UserGroup]
             # Let's assume attribute access.
             if hasattr(group, 'name') and group.name == 'Administrators':
                 is_admin = True
                 break
             elif isinstance(group, dict) and group.get('name') == 'Administrators':
                 is_admin = True
                 break
                 
    if not is_admin:
        raise HTTPException(status_code=403, detail="Only administrators can delete history")

    # db = get_db()
    db = GraphDB(settings.NEO4J_URI, settings.NEO4J_USER, settings.NEO4J_PASSWORD, settings.NEO4J_DATABASE)
    try:
        deleted = db.delete_analysis_history(history_id)
        if not deleted:
            raise HTTPException(status_code=404, detail="History record not found")
        return {"success": True, "message": "History record deleted"}
    except HTTPException:
        raise
    except Exception as e:
        raise HTTPException(status_code=500, detail=f"Failed to delete history: {str(e)}")
    finally:
        db.close()

