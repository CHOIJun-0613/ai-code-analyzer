from typing import List
from fastapi import APIRouter, HTTPException
from app.models.user import User, UserCreate
from app.services.user_service import UserService

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
