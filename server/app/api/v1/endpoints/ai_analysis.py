from typing import Optional, Dict, Any, List
from fastapi import APIRouter, HTTPException, Depends, BackgroundTasks
from pydantic import BaseModel
import logging
import os
import datetime
import random
import json

from fastapi import Request

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
    sql_id: Optional[str] = None  # 특정 SQL만 분석
    mapper_name: Optional[str] = None  # 특정 Mapper의 SQL만 분석
    concurrent_requests: Optional[int] = None
    batch_size: Optional[int] = None
    use_llm_merge: bool = False
    log_level: str = "INFO"
    max_tokens: Optional[int] = None

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
    user_id: str,
    is_reanalysis: bool = False,
    language: str = "ko"
):
    """Background task to run AI enrichment."""
    from csa.utils.context import set_language
    set_language(language)

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
        from csa.utils.i18n import _t
        task_logger.info(_t("ai.enrichment.start", project_name=request.project_name, job_id=job_id))
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

        batch_size = request.batch_size
        if batch_size is None:
            batch_size = user_ai_prefs.get("batch_size", 5)

        # max_tokens 추출
        max_tokens = request.max_tokens
        if max_tokens is None:
            max_tokens = user_ai_prefs.get("max_tokens", 8192)

        task_logger.info(f"AI Provider: {ai_options.get('provider')}")
        task_logger.info(f"Model Name: {ai_options.get('model_name')}")
        task_logger.info(f"Max Tokens: {max_tokens}")
        task_logger.info(f"Concurrency: {concurrent}")
        task_logger.info(f"Batch Size: {batch_size}")
        
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
                task_logger.debug(f"Cancellation detected via memory status: {job_id}")
                return True
                
            return False

        stats = service.enrich_project(
            project_name=request.project_name,
            node_type=request.node_type,
            concurrent_requests=concurrent,
            batch_size=batch_size,
            limit=request.limit,
            clean=request.clean,
            max_tokens=max_tokens,
            use_llm_merge=request.use_llm_merge,
            target_class_name=target_class_name,
            target_method_name=None,
            target_mapper_name=request.mapper_name,
            target_sql_id=request.sql_id,
            force=force_mode,
            stop_check_callback=check_stop
        )
        
    except Exception as e:
        task_logger.error(_t("ai.enrichment.failed", error=str(e)), exc_info=True)
        if job_id in jobs:
            jobs[job_id]["status"] = "failed"
            jobs[job_id]["error"] = str(e)
    finally:
        # Calculate summary data
        end_time = datetime.datetime.now()
        start_time = datetime.datetime.fromisoformat(jobs[job_id]["created_at"])
        duration_delta = end_time - start_time
        total_seconds = int(duration_delta.total_seconds())
        hours, remainder = divmod(total_seconds, 3600)
        minutes, seconds = divmod(remainder, 60)
        duration_str = f"{hours:02d}:{minutes:02d}:{seconds:02d}"

        # Determine result status for summary
        if job_id in jobs:
            current_status = jobs[job_id]["status"]
            if current_status == "cancelling" or current_status == "cancelled":
                result_status = "Canceled"
            elif current_status == "failed":
                result_status = "Failed"
            else:
                # If it's running/pending, we assume it will be completed successfully
                result_status = "Completed"
        else:
            result_status = "Unknown"

        # Safe access to stats
        s_total = stats.get('total_processed', 0) if 'stats' in locals() else 0
        s_success = stats.get('success_count', 0) if 'stats' in locals() else 0
        s_failed = stats.get('fail_count', 0) if 'stats' in locals() else 0
        s_skipped = stats.get('skipped_count', 0) if 'stats' in locals() else 0

        # 재분석 여부에 따라 summary 제목 변경
        if is_reanalysis:
            summary_title = "REANALYSIS SUMMARY (STATIC + AI)"
        else:
            summary_title = "AI ANALYSIS SUMMARY"

        summary_lines = [
            "=" * 80,
            f"                    {summary_title}",
            "=" * 80,
            "",
            f"Project: {request.project_name}",
            f"Target Node Type: {request.node_type.upper()}",
            f"Status: {result_status}",
            f"Start Time: {start_time.strftime('%Y-%m-%d %H:%M:%S')}",
            f"End Time: {end_time.strftime('%Y-%m-%d %H:%M:%S')}",
            f"Duration: {duration_str}",
            "",
        ]

        # 재분석 시 대상 정보 추가
        if is_reanalysis:
            if request.class_name:
                summary_lines.append(f"Target Class: {request.class_name}")
            if request.sql_id:
                summary_lines.append(f"Target SQL ID: {request.sql_id}")
            if request.mapper_name:
                summary_lines.append(f"Target Mapper: {request.mapper_name}")
            if request.class_name or request.sql_id or request.mapper_name:
                summary_lines.append("")

        summary_lines.extend([
            "[AI Configuration]",
            f"  - AI Provider: {ai_options.get('provider', 'Unknown')}",
            f"  - Model Name: {ai_options.get('model_name', 'Unknown')}",
            f"  - Max Tokens: {max_tokens}",
            f"  - Use LLM Merge: {request.use_llm_merge}",
            "",
            "[Analysis Results]",
            f"  - Total Processed: {s_total}",
            f"  - Success: {s_success}",
            f"  - Failed: {s_failed}",
            f"  - Skipped: {s_skipped}",
            "",
            "=" * 80
        ])
        
        if result_status == "Failed":
             summary_lines.insert(3, f"Error: {jobs[job_id].get('error', 'Unknown error')}")
             
        summary_text = "\n".join(summary_lines)
        
        # Log the unified summary to the file/task logger
        # Log each line individually to ensure proper timestamping/indentation
        for line in summary_lines:
            task_logger.info(line)

        # UPDATE STATUS TO COMPLETED AFTER LOGGING
        if job_id in jobs:
            current_status = jobs[job_id]["status"]
            if current_status == "running" or current_status == "pending":
                 jobs[job_id]["status"] = "completed"
                 jobs[job_id]["result"] = stats if 'stats' in locals() else {}
            elif current_status == "cancelling":
                 jobs[job_id]["status"] = "cancelled"
                 jobs[job_id]["result"] = stats if 'stats' in locals() else {}
        
        # Cleanup cancellation flag file
        try:
            cancel_path = _get_cancel_flag_path(job_id)
            if os.path.exists(cancel_path):
                os.remove(cancel_path)
        except Exception:
            pass

        if db:
            try:
                # Construct AI preferences JSON
                ai_prefs_to_save = {
                    "provider": ai_options.get("provider"),
                    "model_name": ai_options.get("model_name"),
                    "api_endpoint": ai_options.get("api_endpoint"),
                    "max_tokens": max_tokens,
                    "use_llm_merge": request.use_llm_merge,
                    "concurrent_requests": concurrent,
                    "batch_size": batch_size,
                    "target_node_type": request.node_type,
                    "clean": request.clean,
                    "limit": request.limit,
                    "class_name": request.class_name,
                    "log_level": request.log_level
                }
                
                try:
                    preferences_ai_json = json.dumps(ai_prefs_to_save, ensure_ascii=False)
                except:
                    preferences_ai_json = "{}"

                # 분석 타입 결정
                # - AI: 전체 프로젝트 일괄 AI 분석
                # - Reanalysis: 개별 항목 재분석 (클래스, SQL 등)
                analysis_type = "Reanalysis" if is_reanalysis else "AI"

                db.save_analysis_history(
                    job_id=job_id,
                    start_time=start_time,
                    end_time=end_time,
                    duration=duration_str,
                    file_count=stats.get('total_processed', 0) if 'stats' in locals() else 0,
                    result=result_status,
                    user_id=user_id,
                    summary=summary_text,
                    project_name=request.project_name,
                    preferences="{}", # Static options empty for AI-only run
                    preferences_ai=preferences_ai_json,
                    analysis_type=analysis_type,
                )
            except Exception as history_exc:
                task_logger.error(f"Failed to save analysis history: {history_exc}")

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
    http_request: Request,
    current_user: UserInDB = Depends(deps.get_current_user),
):
    # Set language context from Accept-Language header
    language = deps.get_language_from_header(http_request)
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
        user_id,
        language=language
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
        return {
            "job_id": user_jobs[0]["id"], 
            "status": user_jobs[0]["status"],
            "params": user_jobs[0].get("params", {})
        }
    return None

@router.get("/{job_id}")
def get_job_status(job_id: str):
    if job_id not in jobs:
        raise HTTPException(status_code=404, detail="Job not found")
    return {
        "job_id": job_id, 
        "status": jobs[job_id]["status"],
        "params": jobs[job_id].get("params", {})
    }

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
    logging.info(f"Job {job_id} status updated to 'cancelling' in memory")
    
    # Create cancellation flag file (for cross-process visibility)
    try:
        cancel_path = _get_cancel_flag_path(job_id)
        with open(cancel_path, 'w') as f:
            f.write(f"cancelled at {datetime.datetime.now()}")
    except Exception as e:
        logging.error(f"Failed to create cancellation flag file: {e}")
        # Continue anyway, as we updated memory status
        
    return {"message": "Cancellation requested", "job_id": job_id}
