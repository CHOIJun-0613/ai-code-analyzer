import threading
import uuid
from typing import Dict, Optional
from csa.services.analyze_service import analyze_project
from csa.utils.logger import get_logger
from app.core.config import settings

logger = get_logger(__name__)

# Simple in-memory job store
jobs: Dict[str, dict] = {}

def run_analysis_task(job_id: str, params: dict):
    jobs[job_id]["status"] = "running"
    try:
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
            use_ai=params.get("use_ai", False)
        )
        jobs[job_id]["status"] = "completed" if result.get("success") else "failed"
        jobs[job_id]["result"] = result
    except Exception as e:
        logger.error(f"Analysis failed: {e}")
        jobs[job_id]["status"] = "failed"
        jobs[job_id]["error"] = str(e)

def start_analysis(params: dict) -> str:
    job_id = str(uuid.uuid4())
    jobs[job_id] = {
        "id": job_id,
        "status": "pending",
        "params": params,
        "created_at": str(uuid.uuid1()) # timestamp
    }
    thread = threading.Thread(target=run_analysis_task, args=(job_id, params))
    thread.start()
    return job_id

def get_job_status(job_id: str) -> Optional[dict]:
    return jobs.get(job_id)
