from app.api.v1.endpoints import auth, users, analysis

api_router = APIRouter()
api_router.include_router(auth.router, tags=["login"])
api_router.include_router(users.router, prefix="/users", tags=["users"])
api_router.include_router(analysis.router, prefix="/analysis", tags=["analysis"])
from app.api.v1.endpoints import projects
api_router.include_router(projects.router, prefix="/projects", tags=["projects"])

