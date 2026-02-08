from fastapi import Depends, HTTPException, status, Request
from fastapi.security import OAuth2PasswordBearer
from jose import jwt, JWTError
from pydantic import ValidationError
from typing import Optional, Set

from app.core.config import settings
from app.core import security
from app.models.user import UserInDB
from app.services.user_service import UserService
from csa.utils.context import set_language

reusable_oauth2 = OAuth2PasswordBearer(
    tokenUrl=f"{settings.API_V1_STR}/login/access-token"
)

def get_current_user(
    request: Request
) -> UserInDB:
    token = request.cookies.get("access_token")
    if not token:
         raise HTTPException(
            status_code=status.HTTP_401_UNAUTHORIZED,
            detail="Not authenticated",
            headers={"WWW-Authenticate": "Bearer"},
        )
    try:
        payload = jwt.decode(
            token, settings.SECRET_KEY, algorithms=[security.ALGORITHM]
        )
        username: str = payload.get("sub")
        if username is None:
            raise HTTPException(
                status_code=status.HTTP_401_UNAUTHORIZED,
                detail="Could not validate credentials",
                headers={"WWW-Authenticate": "Bearer"},
            )
    except (JWTError, ValidationError):
        raise HTTPException(
            status_code=status.HTTP_401_UNAUTHORIZED,
            detail="Could not validate credentials",
            headers={"WWW-Authenticate": "Bearer"},
        )
    
    user = UserService.get_user_by_username(username)
    if not user:
        raise HTTPException(status_code=404, detail="User not found")

    return user


def get_language_from_header(request: Request) -> str:
    """
    Accept-Language 헤더에서 언어를 추출하고 컨텍스트에 설정합니다.

    지원 언어: ko, en (기본값: ko)
    """
    accept_language = request.headers.get("accept-language", "ko")
    # 간단한 파싱: 첫 번째 언어 코드만 추출 (예: "en-US,en;q=0.9" → "en")
    lang = accept_language.split(",")[0].split("-")[0].strip().lower()
    if lang not in ("ko", "en"):
        lang = "ko"
    set_language(lang)
    return lang


def get_allowed_projects(user: UserInDB) -> Optional[set[str]]:
    """
    Returns a set of allowed project names for the user.
    Returns None if the user is an Administrator (access to all projects).
    """
    # Check for Admin
    if any(g.name.lower() == "administrators" for g in user.groups):
        return None
        
    allowed_projects = set()
    for group in user.groups:
        if group.projects:
            allowed_projects.update(group.projects)
            
    return allowed_projects


def verify_project_access(
    project_name: str,
    current_user: UserInDB = Depends(get_current_user)
) -> UserInDB:
    """
    Dependency to verify if the current user has access to the requested project.
    Raises 403 Forbidden if access is denied.
    Returns the current user if allowed.
    """
    allowed_projects = get_allowed_projects(current_user)
    
    # If None, it means Admin -> Allow
    if allowed_projects is None:
        return current_user
        
    if project_name not in allowed_projects:
        raise HTTPException(
            status_code=status.HTTP_403_FORBIDDEN,
            detail=f"You do not have access to project '{project_name}'"
        )
        
    return current_user
