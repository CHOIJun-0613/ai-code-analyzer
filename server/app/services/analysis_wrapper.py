import threading
import uuid
from typing import Dict, Optional
from csa.services.analyze_service import analyze_project, analyze_single_class
from csa.services.analyze_service import analyze_project
from csa.utils.logger import get_logger, JobIdFilter
from csa.utils.context import get_client_id, set_job_id, set_client_id
from app.core.config import settings
import datetime
import random

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

def run_analysis_task(job_id: str, params: dict, user_id: str):
    # Set job context
    set_job_id(job_id)
    # Set client context for this thread using the passed user_id
    set_client_id(user_id)

    jobs[job_id]["status"] = "running"
    
    # Setup log capture
    log_handler = JobLogHandler(job_id)
    formatter = logging.Formatter('%(asctime)s - %(levelname)s - %(message)s')
    log_handler.setFormatter(formatter)
    
    # Attach to root logger or specific csa logger
    root_logger = logging.getLogger()
    root_logger.addHandler(log_handler)
    
    
    # Also attach to csa logger specifically to be sure - REMOVED to avoid double logging with propagate=True
    # csa_logger = logging.getLogger("csa")
    # csa_logger.addHandler(log_handler)
    
    # Job-specific File Handler
    analysis_log_file = f"../logs/analysis-{job_id}.log" 
    # Adjust path relative to execution or use absolute path logic like setup_logger
    # setup_logger uses: current_dir = os.path.dirname(os.path.abspath(__file__)) ... project_root/logs
    import os
    current_dir = os.path.dirname(os.path.abspath(__file__))
    project_root = os.path.dirname(os.path.dirname(current_dir)) # server root (app/services -> app -> server)
    logs_dir = os.path.join(project_root, "logs")
    os.makedirs(logs_dir, exist_ok=True)
    analysis_log_path = os.path.join(logs_dir, f"analysis-{job_id}.log")
    
    analysis_file_handler = logging.FileHandler(analysis_log_path, encoding='utf-8')
    analysis_file_handler.setFormatter(formatter)
    analysis_file_handler.addFilter(JobIdFilter(job_id))
    
    root_logger.addHandler(analysis_file_handler)
    
    try:
        # Initial log
        logger.info(f"Starting analysis job: {job_id}")
        
        if params.get('analysis_target') == 'target_file':
             result = analyze_single_class(
                project_name=params.get("project_name"),
                target_file_path=params.get("target_file_path"),
                logger=logger,
                # graph_db=None, # Will be connected inside
                ai_options=params.get("ai_options"),
                use_ai_analysis=params.get("use_ai", False),
                skip_dto_source=params.get("skip_dto_source", True),
                skip_dto_methods=params.get("skip_dto_methods", True),
             )
        else:
            result = analyze_project(
                java_source_folder=params.get("source_folder"),
                project_name=params.get("project_name"),
                application_name=params.get("application_name"),
                db_script_folder=params.get("db_script_folder"),
                neo4j_uri=settings.NEO4J_URI,
                neo4j_user=settings.NEO4J_USER,
                neo4j_password=settings.NEO4J_PASSWORD,
                neo4j_database=settings.NEO4J_DATABASE or "neo4j",
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
        
    except KeyboardInterrupt:
        logger.warning(f"Analysis job {job_id} canceled by user")
        jobs[job_id]["status"] = "canceled"
        jobs[job_id]["error"] = "Analysis canceled by user"
    except Exception as e:
        logger.error(f"Analysis failed: {e}")
        jobs[job_id]["status"] = "failed"
        jobs[job_id]["error"] = str(e)
    finally:
        # Clean up handlers
        root_logger.removeHandler(log_handler)
        root_logger.removeHandler(analysis_file_handler)
        log_handler.close()
        analysis_file_handler.close()

def start_analysis(params: dict, user_id: str = None) -> str:
    # YYYYMMDD-HHMMSS-mmm-USERID-RAND5
    now = datetime.datetime.now()
    timestamp = now.strftime("%Y%m%d-%H%M%S")
    millis = f"{int(now.microsecond / 1000):03d}"
    
    if not user_id:
        user_id = get_client_id()
    
    if not user_id:
        user_id = "unknown"
        
    rand = f"{random.randint(0, 99999):05d}"
    
    job_id = f"{timestamp}-{millis}-{user_id}-{rand}"
    
    jobs[job_id] = {
        "id": job_id,
        "user_id": user_id,
        "status": "pending",
        "params": params,
        "logs": [],
        "created_at": str(uuid.uuid1()) # timestamp
    }
    thread = threading.Thread(target=run_analysis_task, args=(job_id, params, user_id))
    thread.start()
    return job_id

def get_job_status(job_id: str) -> Optional[dict]:
    return jobs.get(job_id)

def get_active_job(user_id: str) -> Optional[dict]:
    """Find the most recent running or pending job for a user."""
    user_jobs = [
        job for job in jobs.values() 
        if job.get("user_id") == user_id and job.get("status") in ["pending", "running"]
    ]
    # Sort by ID (which starts with timestamp) descending
    user_jobs.sort(key=lambda x: x["id"], reverse=True)
    
    if user_jobs:
        return user_jobs[0]
    return None

def cancel_job_status(job_id: str):
    """Update job status to cancelling."""
    if job_id in jobs:
        jobs[job_id]["status"] = "cancelling"
        if "logs" not in jobs[job_id]:
            jobs[job_id]["logs"] = []
        jobs[job_id]["logs"].append("Cancellation requested by user...")


def start_ai_analysis(
    project_name: str,
    node_type: str = "all",
    limit: Optional[int] = None,
    clean: bool = False,
    ai_config: Optional[Dict] = None,
    user_id: Optional[str] = None,
    target_class_name: Optional[str] = None,
    target_method_name: Optional[str] = None,
    target_mapper_name: Optional[str] = None,
    target_sql_id: Optional[str] = None,
    concurrent_requests: Optional[int] = None,
) -> str:
    """
    AI 재분석 작업 시작

    Args:
        project_name: 프로젝트 이름
        node_type: 노드 타입 (class, method, sql, all)
        limit: 최대 처리 노드 수
        clean: 기존 ai_description 덮어쓰기
        ai_config: AI 설정 (provider, model_name, api_key, api_endpoint)
        user_id: 사용자 ID
        target_class_name: 특정 클래스만 분석 (선택)
        target_method_name: 특정 메서드만 분석 (선택)
        target_mapper_name: 특정 Mapper만 분석 (선택)
        target_sql_id: 특정 SQL만 분석 (선택)
        concurrent_requests: 동시 요청 수

    Returns:
        job_id: 작업 ID
    """
    import json
    from app.api.v1.endpoints.ai_analysis import AIEnrichRequest, run_enrichment_task
    from app.services.user_service import UserService
    from app.core.config import settings

    # Generate Job ID
    now = datetime.datetime.now()
    timestamp = now.strftime("%Y%m%d-%H%M%S")
    millis = f"{int(now.microsecond / 1000):03d}"

    if not user_id:
        user_id = get_client_id() or "unknown"

    rand = f"{random.randint(0, 99999):05d}"
    job_id = f"{timestamp}-{millis}-{user_id}-{rand}"

    # AI Enrichment용 jobs dict 가져오기 (ai_analysis.py에서)
    from app.api.v1.endpoints.ai_analysis import jobs as ai_jobs

    # 사용자 AI 설정 로드
    try:
        user_ai_prefs_str = UserService.get_user_ai_preferences(user_id)
        user_ai_prefs = json.loads(user_ai_prefs_str)
    except:
        user_ai_prefs = {}

    # AI 설정 준비
    ai_config_override = None
    if ai_config:
        from app.api.v1.endpoints.ai_analysis import AIConfigOverride
        ai_config_override = AIConfigOverride(**ai_config)

    # Request 객체 생성
    request = AIEnrichRequest(
        project_name=project_name,
        node_type=node_type,
        limit=limit,
        clean=clean,
        class_name=target_class_name,
        concurrent_requests=concurrent_requests,
        ai_config=ai_config_override,
        log_level="INFO"
    )

    # Neo4j 설정
    neo4j_config = {
        "uri": settings.NEO4J_URI,
        "user": settings.NEO4J_USER,
        "password": settings.NEO4J_PASSWORD,
        "database": settings.NEO4J_DATABASE or "neo4j",
    }

    # Job 등록
    ai_jobs[job_id] = {
        "id": job_id,
        "user_id": user_id,
        "status": "pending",
        "params": request.dict(),
        "logs": [],
        "created_at": now.isoformat()
    }

    # 백그라운드 스레드 시작
    thread = threading.Thread(
        target=run_enrichment_task,
        args=(job_id, request, user_ai_prefs, neo4j_config, user_id)
    )
    thread.start()

    return job_id
