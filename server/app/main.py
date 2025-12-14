from fastapi import FastAPI, Request
from app.core.config import settings
from csa.utils.context import set_client_id

app = FastAPI(
    title=settings.PROJECT_NAME,
    openapi_url=f"{settings.API_V1_STR}/openapi.json"
)

@app.middleware("http")
async def logging_context_middleware(request: Request, call_next):
    # 클라이언트 IP 추출 (X-Forwarded-For 헤더 우선)
    forwarded = request.headers.get("X-Forwarded-For")
    if forwarded:
        client_ip = forwarded.split(",")[0].strip()
    else:
        client_ip = request.client.host if request.client else "unknown"
        
    # Context에 설정
    set_client_id(client_ip)
    
    response = await call_next(request)
    return response

from app.api.v1.api import api_router
app.include_router(api_router, prefix=settings.API_V1_STR)


@app.get("/")
def root():
    return {"message": "Welcome to AI Code Analyzer API"}
