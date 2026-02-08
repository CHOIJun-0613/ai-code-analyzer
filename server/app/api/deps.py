from fastapi import Depends, HTTPException, status, Request
from fastapi.security import OAuth2PasswordBearer
from jose import jwt, JWTError
from pydantic import ValidationError

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
