from contextvars import ContextVar
from typing import Optional

# 요청별 클라이언트 식별자 (IP, UserID 등) 저장을 위한 ContextVar
# 스레드 및 비동기 태스크 간에 안전하게 격리됨
client_id_ctx: ContextVar[Optional[str]] = ContextVar("client_id", default=None)

def get_client_id() -> str:
    """현재 컨텍스트의 클라이언트 ID를 반환 (없으면 빈 문자열)"""
    return client_id_ctx.get() or ""

def set_client_id(client_id: str):
    """현재 컨텍스트의 클라이언트 ID 설정"""
    client_id_ctx.set(client_id)

# 작업 ID 저장을 위한 ContextVar
job_id_ctx: ContextVar[Optional[str]] = ContextVar("job_id", default=None)

def get_job_id() -> str:
    """현재 컨텍스트의 작업 ID를 반환 (없으면 빈 문자열)"""
    return job_id_ctx.get() or ""

def set_job_id(job_id: str):
    """현재 컨텍스트의 작업 ID 설정"""
    job_id_ctx.set(job_id)

# 로그 언어 저장을 위한 ContextVar
language_ctx: ContextVar[Optional[str]] = ContextVar("language", default=None)

def get_language() -> str:
    """현재 컨텍스트의 언어를 반환 (없으면 'ko')"""
    return language_ctx.get() or "ko"

def set_language(language: str):
    """현재 컨텍스트의 언어 설정"""
    language_ctx.set(language)
