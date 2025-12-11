from fastapi import APIRouter, HTTPException, BackgroundTasks, UploadFile, File, Form
from pydantic import BaseModel
from typing import Optional
import shutil
import os
import tempfile
import zipfile
from app.services.analysis_wrapper import start_analysis, get_job_status

router = APIRouter()

class AnalysisRequest(BaseModel):
    source_folder: str
    project_name: Optional[str] = None
    application_name: Optional[str] = None
    db_script_folder: Optional[str] = None
    clean: bool = False
    use_ai: bool = False

@router.post("/analyze")
def trigger_analysis(request: AnalysisRequest):
    # TODO: Validate path exists
    job_id = start_analysis(request.dict())
    return {"job_id": job_id, "status": "pending"}

@router.get("/analyze/{job_id}")
def get_analysis_status(job_id: str):
    status = get_job_status(job_id)
    if not status:
        raise HTTPException(status_code=404, detail="Job not found")
    return status

@router.post("/analyze/upload")
def upload_and_analyze(
    file: UploadFile = File(...),
    project_name: Optional[str] = Form(None),
    clean: bool = Form(False),
    use_ai: bool = Form(False)
):
    # Create temp directory
    temp_dir = tempfile.mkdtemp()
    file_path = os.path.join(temp_dir, file.filename)
    
    with open(file_path, "wb") as buffer:
        shutil.copyfileobj(file.file, buffer)
        
    # If zip, extract
    source_folder = temp_dir
    if file.filename.endswith(".zip"):
        with zipfile.ZipFile(file_path, 'r') as zip_ref:
            zip_ref.extractall(temp_dir)
        # Try to find the inner folder if it exists
        # For simplicity, just use temp_dir for now, or logic to find root
        source_folder = temp_dir # TODO: Improve logic to find source root
        
    job_id = start_analysis({
        "source_folder": source_folder,
        "project_name": project_name or file.filename,
        "clean": clean,
        "use_ai": use_ai
    })
    
    return {"job_id": job_id, "status": "pending", "temp_path": source_folder}

