from typing import List, Dict, Any
import json
from fastapi import APIRouter, HTTPException, Depends
from app.models.user import User, UserCreate, UserInDB, UserUpdate
from app.services.user_service import UserService
from app.api import deps

router = APIRouter()

@router.post("/", response_model=User)
def create_user(user: UserCreate):
    try:
        existing_user = UserService.get_user_by_username(user.username)
        if existing_user:
            raise HTTPException(status_code=400, detail="Username already registered")
        return UserService.create_user(user)
    except Exception as e:
        raise HTTPException(status_code=500, detail=str(e))

@router.get("/check/{username}")
def check_username_exists(username: str):
    """
    Check if a username already exists.
    """
    try:
        user = UserService.get_user_by_username(username)
        return {"exists": user is not None}
    except Exception as e:
        raise HTTPException(status_code=500, detail=str(e))

@router.get("/", response_model=List[User])
def list_users():
    try:
        return UserService.list_users()
    except Exception as e:
        raise HTTPException(status_code=500, detail=str(e))

@router.get("/me", response_model=User)
def read_user_me(
    current_user: UserInDB = Depends(deps.get_current_user),
):
    """
    Get current user.
    """
    return current_user

@router.get("/me/preferences", response_model=Dict[str, Any])
def read_user_preferences(
    current_user: UserInDB = Depends(deps.get_current_user),
):
    prefs_str = UserService.get_user_preferences(current_user.username)
    try:
        return json.loads(prefs_str)
    except json.JSONDecodeError:
        return {}

@router.put("/me/preferences", response_model=Dict[str, Any])
def update_user_preferences(
    preferences: Dict[str, Any],
    current_user: UserInDB = Depends(deps.get_current_user),
):
    prefs_str = json.dumps(preferences)
    UserService.update_user_preferences(current_user.username, prefs_str)
    return preferences

@router.get("/me/preferences/ai", response_model=Dict[str, Any])
def read_user_ai_preferences(
    current_user: UserInDB = Depends(deps.get_current_user),
):
    """사용자의 AI 설정 조회"""
    prefs_str = UserService.get_user_ai_preferences(current_user.username)

    if prefs_str:
        try:
            prefs = json.loads(prefs_str)
            # 기본값 보장
            if "max_tokens" not in prefs:
                prefs["max_tokens"] = 8192
            if "use_llm_merge" not in prefs:
                prefs["use_llm_merge"] = False
            return prefs
        except json.JSONDecodeError:
            pass

    # 기본값 반환
    return {
        "use_analysis": True,
        "ai_provider": "google",
        "model_name": "gemini-2.0-flash",
        "max_tokens": 8192,
        "use_llm_merge": False,
        "api_key": "",
        "api_endpoint": "",
        "concurrent_ai_requests": 15,
        "ai_enrichment_batch_size": 50
    }

@router.put("/me/preferences/ai", response_model=Dict[str, Any])
def update_user_ai_preferences(
    preferences: Dict[str, Any],
    current_user: UserInDB = Depends(deps.get_current_user),
):
    """사용자의 AI 설정 업데이트"""
    # max_tokens 검증
    max_tokens = preferences.get("max_tokens", 8192)
    if not isinstance(max_tokens, int) or max_tokens < 1024 or max_tokens > 1000000:
        raise HTTPException(
            status_code=400,
            detail="max_tokens must be an integer between 1024 and 1000000"
        )

    # JSON 문자열로 변환하여 저장
    prefs_str = json.dumps(preferences)
    UserService.update_user_ai_preferences(current_user.username, prefs_str)

    return preferences


@router.put("/{user_id}", response_model=User)
def update_user(user_id: str, user_update: UserUpdate):
    try:
        return UserService.update_user(user_id, user_update)
    except Exception as e:
        raise HTTPException(status_code=500, detail=str(e))

@router.delete("/{user_id}")
def delete_user(user_id: str):
    try:
        UserService.delete_user(user_id)
        return {"status": "success"}
    except Exception as e:
        raise HTTPException(status_code=500, detail=str(e))
