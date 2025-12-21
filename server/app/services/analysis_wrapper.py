import threading
import uuid
from typing import Dict, Optional
from csa.services.analyze_service import analyze_project
from csa.utils.logger import get_logger
from app.core.config import settings

logger = get_logger(__name__)

import logging

# Simple in-memory job store
jobs: Dict[str, dict] = {}

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

def run_analysis_task(job_id: str, params: dict):
    jobs[job_id]["status"] = "running"
    
    # Setup log capture
    log_handler = JobLogHandler(job_id)
    formatter = logging.Formatter('%(asctime)s - %(levelname)s - %(message)s')
    log_handler.setFormatter(formatter)
    
    # Attach to root logger or specific csa logger
    root_logger = logging.getLogger()
    root_logger.addHandler(log_handler)
    
    # Also attach to csa logger specifically to be sure
    csa_logger = logging.getLogger("csa")
    csa_logger.addHandler(log_handler)
    
    try:
        # Initial log
        logger.info(f"Starting analysis job: {job_id}")
        
        result = analyze_project(
            java_source_folder=params.get("source_folder"),
            project_name=params.get("project_name"),
            application_name=params.get("application_name"),
            db_script_folder=params.get("db_script_folder"),
            neo4j_uri=settings.NEO4J_URI,
            neo4j_user=settings.NEO4J_USER,
            neo4j_password=settings.NEO4J_PASSWORD,
            neo4j_database="neo4j", # TODO: Make configurable
            clean=params.get("clean", False),
            dry_run=params.get("dry_run", False),
            java_object=params.get("java_object", False),
            db_object=params.get("db_object", False),
            all_objects=params.get("all_objects", True),
            class_name=None,
            update=False,
            logger=logger,
            use_ai=params.get("use_ai", False),
            skip_dto_source=params.get("skip_dto_source", True),
            skip_dto_methods=params.get("skip_dto_methods", True),
            scope=params.get("scope", 'all'),
            ai_options=params.get("ai_options"),
        )
        jobs[job_id]["status"] = "completed" if result.get("success") else "failed"
        jobs[job_id]["result"] = result
        logger.info(f"Analysis job {job_id} completed with status: {jobs[job_id]['status']}")
        
    except Exception as e:
        logger.error(f"Analysis failed: {e}")
        jobs[job_id]["status"] = "failed"
        jobs[job_id]["error"] = str(e)
    finally:
        # Clean up handlers
        root_logger.removeHandler(log_handler)
        csa_logger.removeHandler(log_handler)
        log_handler.close()

def start_analysis(params: dict) -> str:
    job_id = str(uuid.uuid4())
    jobs[job_id] = {
        "id": job_id,
        "status": "pending",
        "params": params,
        "logs": [],
        "created_at": str(uuid.uuid1()) # timestamp
    }
    thread = threading.Thread(target=run_analysis_task, args=(job_id, params))
    thread.start()
    return job_id

def get_job_status(job_id: str) -> Optional[dict]:
    return jobs.get(job_id)
