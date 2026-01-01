"""
WebSocket endpoints for real-time analysis monitoring.

이 모듈은 분석 작업 및 AI enrichment 작업의 실시간 모니터링을 위한
WebSocket 엔드포인트를 제공합니다.
"""

from fastapi import APIRouter, WebSocket, WebSocketDisconnect
from typing import Dict, Set, Any
import asyncio
import json
import logging
from datetime import datetime, date

router = APIRouter()
logger = logging.getLogger(__name__)


def serialize_for_json(obj: Any) -> Any:
    """
    datetime 객체를 JSON 직렬화 가능한 형태로 변환합니다.

    Args:
        obj: 변환할 객체 (dict, list, datetime 등)

    Returns:
        JSON 직렬화 가능한 객체
    """
    if isinstance(obj, (datetime, date)):
        return obj.isoformat()
    elif isinstance(obj, dict):
        return {key: serialize_for_json(value) for key, value in obj.items()}
    elif isinstance(obj, list):
        return [serialize_for_json(item) for item in obj]
    elif isinstance(obj, tuple):
        return tuple(serialize_for_json(item) for item in obj)
    elif isinstance(obj, set):
        return [serialize_for_json(item) for item in obj]
    else:
        return obj


class ConnectionManager:
    """WebSocket 연결을 관리하는 싱글톤 클래스"""

    def __init__(self):
        # job_id -> Set[WebSocket] 매핑
        self.active_connections: Dict[str, Set[WebSocket]] = {}

    async def connect(self, websocket: WebSocket, job_id: str):
        """
        WebSocket 연결을 수락하고 활성 연결 목록에 추가합니다.

        Args:
            websocket: WebSocket 연결 객체
            job_id: 작업 ID
        """
        await websocket.accept()
        if job_id not in self.active_connections:
            self.active_connections[job_id] = set()
        self.active_connections[job_id].add(websocket)
        logger.info(f"WebSocket connected for job: {job_id}")

    def disconnect(self, websocket: WebSocket, job_id: str):
        """
        WebSocket 연결을 활성 연결 목록에서 제거합니다.

        Args:
            websocket: WebSocket 연결 객체
            job_id: 작업 ID
        """
        if job_id in self.active_connections:
            self.active_connections[job_id].discard(websocket)
            if not self.active_connections[job_id]:
                del self.active_connections[job_id]
        logger.info(f"WebSocket disconnected for job: {job_id}")

    async def send_message(self, job_id: str, message: dict):
        """
        특정 작업 ID에 연결된 모든 WebSocket에 메시지를 브로드캐스트합니다.

        Args:
            job_id: 작업 ID
            message: 전송할 메시지 (dict)
        """
        if job_id in self.active_connections:
            disconnected = []
            for connection in self.active_connections[job_id]:
                try:
                    await connection.send_json(message)
                except Exception as e:
                    logger.warning(f"Failed to send message to WebSocket: {e}")
                    disconnected.append(connection)

            # 연결 실패한 WebSocket 제거
            for conn in disconnected:
                self.disconnect(conn, job_id)


# 싱글톤 인스턴스
manager = ConnectionManager()


def extract_progress(logs: list) -> dict:
    """
    로그 목록에서 진행률 정보를 추출합니다.

    Args:
        logs: 로그 문자열 리스트

    Returns:
        진행률 정보 dict (current, total, percent) 또는 None
    """
    if not logs:
        return None

    # 마지막 로그부터 역순으로 검색
    for log in reversed(logs):
        # 표준 형식: [current/total] (percent%)
        import re
        match = re.search(r'\[(\d+)/(\d+)\] \((\d+)%\)', log)
        if match:
            return {
                "current": int(match.group(1)),
                "total": int(match.group(2)),
                "percent": int(match.group(3)),
                "raw": log
            }
    return None


@router.websocket("/ws/analysis/{job_id}")
async def websocket_analysis(websocket: WebSocket, job_id: str):
    """
    코드 분석 작업의 실시간 모니터링을 위한 WebSocket 엔드포인트.

    Args:
        websocket: WebSocket 연결 객체
        job_id: 분석 작업 ID

    메시지 프로토콜:
        - connected: 연결 확인
        - log: 새 로그 라인
        - status: 상태 업데이트
        - progress: 진행률 업데이트
        - complete: 작업 완료
        - error: 에러 발생
    """
    from app.services.analysis_wrapper import get_job_status

    # 연결 수락
    await manager.connect(websocket, job_id)
    logger.info(f"WebSocket connected for analysis job: {job_id}")

    # 연결 확인 메시지
    await websocket.send_json({"type": "connected", "job_id": job_id})

    try:
        # 작업 상태 모니터링
        last_log_index = 0
        last_status = None
        loop_count = 0

        while True:
            loop_count += 1

            # 작업 상태 조회
            job = get_job_status(job_id)
            if not job:
                logger.warning(f"Job not found: {job_id}")
                await websocket.send_json({
                    "type": "error",
                    "message": "Job not found"
                })
                break

            # 새 로그 전송 (증분만)
            logs = job.get("logs", [])
            total_logs = len(logs)

            if total_logs > last_log_index:
                new_logs = logs[last_log_index:]
                logger.debug(
                    f"[{job_id}] Sending {len(new_logs)} new logs "
                    f"(index: {last_log_index} -> {total_logs})"
                )

                for log in new_logs:
                    await websocket.send_json({
                        "type": "log",
                        "data": log
                    })

                last_log_index = total_logs
            else:
                # 로그 변화 없음 (디버깅 시에만)
                if loop_count % 100 == 0:  # 100번에 한 번만 로그
                    logger.debug(f"[{job_id}] No new logs (total: {total_logs})")

            # 상태 변경 시에만 전송
            current_status = job.get("status")
            if current_status != last_status:
                await websocket.send_json({
                    "type": "status",
                    "data": current_status
                })
                last_status = current_status

            # 진행률 파싱 및 전송
            progress = extract_progress(logs)
            if progress:
                await websocket.send_json({
                    "type": "progress",
                    "data": progress
                })

            # 작업 완료 확인
            if current_status in ["completed", "failed", "cancelled"]:
                await websocket.send_json({
                    "type": "complete",
                    "data": {
                        "status": current_status,
                        "result": serialize_for_json(job.get("result"))
                    }
                })
                # 정상 종료 (code: 1000)
                await websocket.close(code=1000, reason="Job completed")
                break

            # 100ms 대기
            await asyncio.sleep(0.1)

    except WebSocketDisconnect:
        logger.info(f"WebSocket disconnected by client for job: {job_id}")
    except Exception as e:
        logger.error(f"WebSocket error for job {job_id}: {e}", exc_info=True)
        try:
            await websocket.send_json({
                "type": "error",
                "message": str(e)
            })
        except:
            pass
    finally:
        manager.disconnect(websocket, job_id)


@router.websocket("/ws/ai/{job_id}")
async def websocket_ai_analysis(websocket: WebSocket, job_id: str):
    """
    AI Enrichment 작업의 실시간 모니터링을 위한 WebSocket 엔드포인트.

    Args:
        websocket: WebSocket 연결 객체
        job_id: AI 작업 ID

    메시지 프로토콜:
        - connected: 연결 확인
        - log: 새 로그 라인
        - status: 상태 업데이트
        - progress: 진행률 업데이트
        - complete: 작업 완료
        - error: 에러 발생
    """
    from app.api.v1.endpoints.ai_analysis import jobs

    # 연결 수락
    await manager.connect(websocket, job_id)
    logger.info(f"WebSocket connected for AI job: {job_id}")

    # 연결 확인 메시지
    await websocket.send_json({"type": "connected", "job_id": job_id})

    try:
        # 작업 상태 모니터링
        last_log_index = 0
        last_status = None
        loop_count = 0

        while True:
            loop_count += 1

            # 작업 상태 조회
            job = jobs.get(job_id)
            if not job:
                logger.warning(f"AI job not found: {job_id}")
                await websocket.send_json({
                    "type": "error",
                    "message": "Job not found"
                })
                break

            # 새 로그 전송 (증분만)
            logs = job.get("logs", [])
            total_logs = len(logs)

            if total_logs > last_log_index:
                new_logs = logs[last_log_index:]
                logger.debug(
                    f"[AI-{job_id}] Sending {len(new_logs)} new logs "
                    f"(index: {last_log_index} -> {total_logs})"
                )

                for log in new_logs:
                    await websocket.send_json({
                        "type": "log",
                        "data": log
                    })

                last_log_index = total_logs
            else:
                # 로그 변화 없음 (디버깅 시에만)
                if loop_count % 100 == 0:  # 100번에 한 번만 로그
                    logger.debug(f"[AI-{job_id}] No new logs (total: {total_logs})")

            # 상태 변경 시에만 전송
            current_status = job.get("status")
            if current_status != last_status:
                await websocket.send_json({
                    "type": "status",
                    "data": current_status
                })
                last_status = current_status

            # 진행률 파싱 및 전송
            progress = extract_progress(logs)
            if progress:
                await websocket.send_json({
                    "type": "progress",
                    "data": progress
                })

            # 작업 완료 확인
            if current_status in ["completed", "failed", "cancelled", "success", "error"]:
                await websocket.send_json({
                    "type": "complete",
                    "data": {
                        "status": current_status,
                        "result": serialize_for_json(job.get("result"))
                    }
                })
                # 정상 종료 (code: 1000)
                await websocket.close(code=1000, reason="Job completed")
                break

            # 100ms 대기
            await asyncio.sleep(0.1)

    except WebSocketDisconnect:
        logger.info(f"WebSocket disconnected by client for AI job: {job_id}")
    except Exception as e:
        logger.error(f"WebSocket error for AI job {job_id}: {e}", exc_info=True)
        try:
            await websocket.send_json({
                "type": "error",
                "message": str(e)
            })
        except:
            pass
    finally:
        manager.disconnect(websocket, job_id)
