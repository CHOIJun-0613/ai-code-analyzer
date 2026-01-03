from fastapi import APIRouter
from app.api.v1.endpoints import auth, users, analysis, groups, websocket

api_router = APIRouter()
api_router.include_router(auth.router, tags=["login"])
api_router.include_router(users.router, prefix="/users", tags=["users"])
api_router.include_router(analysis.router, prefix="/analysis", tags=["analysis"])
api_router.include_router(groups.router, prefix="/groups", tags=["groups"])
from app.api.v1.endpoints import projects, reports, class_reports, ai_analysis
api_router.include_router(projects.router, prefix="/projects", tags=["projects"])
api_router.include_router(reports.router, tags=["reports"])
api_router.include_router(class_reports.router, tags=["class-reports"])
api_router.include_router(ai_analysis.router, prefix="/ai", tags=["ai-analysis"])
from app.api.v1.endpoints import ai_prompts
api_router.include_router(ai_prompts.router, prefix="/ai-prompts", tags=["ai-prompts"])
api_router.include_router(websocket.router, tags=["websocket"])

