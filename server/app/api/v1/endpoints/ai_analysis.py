from typing import Optional, Dict, Any, List
from fastapi import APIRouter, HTTPException, Depends, BackgroundTasks
from pydantic import BaseModel
import logging
import os
import datetime
import random
import json

from app.api import deps
from app.models.user import UserInDB
from app.services.user_service import UserService

from csa.aiwork.ai_config import AIConfig
from csa.aiwork.ai_analyzer import AIAnalyzer
from csa.services.graph_db import GraphDB
from csa.services.ai_enrichment_service import AIEnrichmentService

router = APIRouter()

# In-memory job store
jobs: Dict[str, dict] = {}

class AIConfigOverride(BaseModel):
    provider: Optional[str] = None
    model_name: Optional[str] = None
    api_key: Optional[str] = None
    api_endpoint: Optional[str] = None

class AIEnrichRequest(BaseModel):
    project_name: str
    node_type: str = "all"
    limit: Optional[int] = None
    clean: bool = False
    class_name: Optional[str] = None
    concurrent_requests: Optional[int] = None
    log_level: str = "INFO"
    
    # Custom AI Config Override (Optional)
    # If provided, these values override saved user preferences for this specific run
    ai_config: Optional[AIConfigOverride] = None

class AIEnrichResponse(BaseModel):
    message: str
    job_id: str

class JobLogHandler(logging.Handler):
    """Custom handler to capture logs for a specific job."""
    def __init__(self, job_id: str):
        super().__init__()
        self.job_id = job_id

    def emit(self, record):
        try:
            msg = self.format(record)
            if self.job_id in jobs:
                if "logs" not in jobs[self.job_id]:
                    jobs[self.job_id]["logs"] = []
                jobs[self.job_id]["logs"].append(msg)
        except Exception:
            self.handleError(record)

def _get_cancel_flag_path(job_id: str) -> str:
    """Get the path for the job cancellation flag file."""
    current_dir = os.path.dirname(os.path.abspath(__file__))
    # Go up 4 levels: endpoints -> v1 -> api -> app -> server
    server_root = os.path.dirname(os.path.dirname(os.path.dirname(os.path.dirname(current_dir))))
    logs_dir = os.path.join(server_root, "logs")
    os.makedirs(logs_dir, exist_ok=True)
    return os.path.join(logs_dir, f"{job_id}.cancel")

def run_enrichment_task(
    job_id: str,
    request: AIEnrichRequest,
    user_ai_prefs: Dict[str, Any],
    neo4j_config: Dict[str, str],
    user_id: str
):
    """Background task to run AI enrichment."""
    
    if job_id in jobs:
        jobs[job_id]["status"] = "running"
    
    # 1. Setup Logging
    log_handler = JobLogHandler(job_id)
    formatter = logging.Formatter('%(asctime)s - %(levelname)s - %(message)s')
    log_handler.setFormatter(formatter)
    
    # Task specific logger
    task_logger = logging.getLogger(f"ai_enrichment_{job_id}")
    task_logger.setLevel(getattr(logging, request.log_level.upper(), logging.INFO))
    
    # Avoid duplicate handlers if logger is reused (though job_id should be unique)
    if task_logger.handlers:
        task_logger.handlers = []
        
    task_logger.addHandler(log_handler)
    
    # File Handler
    current_dir = os.path.dirname(os.path.abspath(__file__))
    # Go up 4 levels: endpoints -> v1 -> api -> app -> server
    server_root = os.path.dirname(os.path.dirname(os.path.dirname(os.path.dirname(current_dir))))
    logs_dir = os.path.join(server_root, "logs")
    os.makedirs(logs_dir, exist_ok=True)
    analysis_log_path = os.path.join(logs_dir, f"analysis-ai-{job_id}.log")
    
    file_handler = logging.FileHandler(analysis_log_path, encoding='utf-8')
    file_handler.setFormatter(formatter)
    task_logger.addHandler(file_handler)

    db = None
    try:
        task_logger.info(f"Starting AI Enrichment task for project: {request.project_name} (Job ID: {job_id})")
        task_logger.info(f"Log Level: {request.log_level}")

        # 2. Configure AI Analyzer
        # Base options from saved prefs
        ai_options = {
            "provider": user_ai_prefs.get("ai_provider"),
            "model_name": user_ai_prefs.get("model_name"),
            "api_key": user_ai_prefs.get("api_key"),
            "api_endpoint": user_ai_prefs.get("api_endpoint"),
        }
        
        # Override with request specific config if provided
        if request.ai_config:
            if request.ai_config.provider:
                ai_options["provider"] = request.ai_config.provider
            if request.ai_config.model_name:
                ai_options["model_name"] = request.ai_config.model_name
            if request.ai_config.api_key:
                ai_options["api_key"] = request.ai_config.api_key
            if request.ai_config.api_endpoint:
                ai_options["api_endpoint"] = request.ai_config.api_endpoint
        
        concurrent = request.concurrent_requests
        if concurrent is None:
            concurrent = user_ai_prefs.get("concurrent_ai_requests", 10)
            
        task_logger.info(f"AI Provider: {ai_options.get('provider')}")
        task_logger.info(f"Model Name: {ai_options.get('model_name')}")
        
        ai_config = AIConfig(options=ai_options)
        
        analyzer = AIAnalyzer(config=ai_config)
        
        # Force re-initialization of provider manager/LLM if config changed
        # AIAnalyzer(config=...) does create new ProviderManager call, so this should be fine.
        
        if not analyzer.is_available():
            raise Exception("AI Analyzer is not available with current configuration.")

        # 3. Initialize GraphDB
        db = GraphDB(
            uri=neo4j_config["uri"],
            user=neo4j_config["user"],
            password=neo4j_config["password"],
            database=neo4j_config["database"]
        )

        # 4. Run Enrichment Service
        service = AIEnrichmentService(db, analyzer, task_logger)
        
        target_class_name = request.class_name
        force_mode = bool(target_class_name)
        
        def check_stop():
            # 1. 파일 기반 확인 (멀티 프로세스 호환)
            cancel_path = _get_cancel_flag_path(job_id)
            if os.path.exists(cancel_path):
                task_logger.warning(f"Cancellation flag file detected: {cancel_path}")
                return True

            # 2. 메모리 기반 확인 (fallback)
            current_job = jobs.get(job_id, {})
            status = current_job.get("status")
            if status == "cancelling":
                return True
                
            return False

        stats = service.enrich_project(
            project_name=request.project_name,
            node_type=request.node_type,
            batch_size=concurrent, # This maps to concurrent_requests in the service
            limit=request.limit,
            clean=request.clean,
            target_class_name=target_class_name,
            target_method_name=None,
            target_mapper_name=None, 
            target_sql_id=None,

            force=force_mode,
            stop_check_callback=check_stop
        )
        
        if job_id in jobs:
            current_status = jobs[job_id]["status"]
            if current_status == "cancelling":
                jobs[job_id]["status"] = "cancelled"
                task_logger.warning("Job cancelled by user request.")
            else:
                jobs[job_id]["status"] = "completed"
                jobs[job_id]["result"] = stats
        
        # Cleanup cancellation flag file
        try:
            cancel_path = _get_cancel_flag_path(job_id)
            if os.path.exists(cancel_path):
                os.remove(cancel_path)
        except Exception:
            pass
        
        # Summary log
        task_logger.info("========== AI ANALYSIS SUMMARY ==========")
        task_logger.info(f"Project: {request.project_name}")
        task_logger.info(f"Total Processed: {stats.get('total_processed', 0)}")
        task_logger.info(f"Success: {stats.get('success_count', 0)}")
        task_logger.info(f"Failed: {stats.get('fail_count', 0)}")
        task_logger.info(f"Skipped: {stats.get('skipped_count', 0)}")
        task_logger.info("=========================================")

    except Exception as e:
        task_logger.error(f"AI Enrichment task failed: {e}", exc_info=True)
        if job_id in jobs:
            jobs[job_id]["status"] = "failed"
            jobs[job_id]["error"] = str(e)
    finally:
        if db:
            db.close()
        # Clean up handlers
        task_logger.removeHandler(log_handler)
        if file_handler:
             task_logger.removeHandler(file_handler)
             file_handler.close()

@router.post("/enrich", response_model=AIEnrichResponse)
def trigger_ai_enrichment(
    request: AIEnrichRequest,
    background_tasks: BackgroundTasks,
    current_user: UserInDB = Depends(deps.get_current_user),
):
    # Fetch preferences
    user_ai_prefs_str = UserService.get_user_ai_preferences(current_user.username)
    try:
        user_ai_prefs = json.loads(user_ai_prefs_str)
    except:
        user_ai_prefs = {}

    neo4j_config = {
        "uri": os.getenv("NEO4J_URI", "bolt://localhost:7687"),
        "user": os.getenv("NEO4J_USER", "neo4j"),
        "password": os.getenv("NEO4J_PASSWORD", ""),
        "database": os.getenv("NEO4J_DATABASE", "neo4j"),
    }
    
    if not neo4j_config["password"]:
         raise HTTPException(status_code=500, detail="Server misconfiguration: NEO4J_PASSWORD not set.")

    # Generate Job ID: YYYYMMDD-HHMMSS-mmm-USERID-RAND5
    now = datetime.datetime.now()
    timestamp = now.strftime("%Y%m%d-%H%M%S")
    millis = f"{int(now.microsecond / 1000):03d}"
    user_id = current_user.username
    rand = f"{random.randint(0, 99999):05d}"
    job_id = f"{timestamp}-{millis}-{user_id}-{rand}"

    jobs[job_id] = {
        "id": job_id,
        "user_id": user_id,
        "status": "pending",
        "params": request.dict(),
        "logs": [],
        "created_at": now.isoformat()
    }

    background_tasks.add_task(
        run_enrichment_task,
        job_id,
        request,
        user_ai_prefs,
        neo4j_config,
        user_id
    )

    return AIEnrichResponse(
        message="AI Enrichment task started in background.",
        job_id=job_id
    )

@router.get("/active")
def get_active_job(current_user: UserInDB = Depends(deps.get_current_user)):
    user_jobs = [
        job for job in jobs.values() 
        if job.get("user_id") == current_user.username and job.get("status") in ["pending", "running"]
    ]
    user_jobs.sort(key=lambda x: x["id"], reverse=True)
    if user_jobs:
        return {"job_id": user_jobs[0]["id"], "status": user_jobs[0]["status"]}
    return None

@router.get("/{job_id}")
def get_job_status(job_id: str):
    if job_id not in jobs:
        raise HTTPException(status_code=404, detail="Job not found")
    return {"job_id": job_id, "status": jobs[job_id]["status"]}

@router.get("/{job_id}/logs")
def get_job_logs(job_id: str):
    if job_id not in jobs:
        raise HTTPException(status_code=404, detail="Job not found")
    return {"logs": jobs[job_id].get("logs", [])}

@router.post("/{job_id}/cancel")
def cancel_job(job_id: str):
    if job_id not in jobs:
        raise HTTPException(status_code=404, detail="Job not found")
    
    # Update status in memory (for current process visibility)
    jobs[job_id]["status"] = "cancelling"
    jobs[job_id]["result"] = {"status": "cancelling"}
    
    # Create cancellation flag file (for cross-process visibility)
    try:
        cancel_path = _get_cancel_flag_path(job_id)
        with open(cancel_path, 'w') as f:
            f.write(f"cancelled at {datetime.datetime.now()}")
    except Exception as e:
        logging.error(f"Failed to create cancellation flag file: {e}")
        # Continue anyway, as we updated memory status
        
    return {"message": "Cancellation requested", "job_id": job_id}
