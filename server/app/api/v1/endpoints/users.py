from typing import List, Dict, Any
import json
from fastapi import APIRouter, HTTPException, Depends
from app.models.user import User, UserCreate, UserInDB
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


