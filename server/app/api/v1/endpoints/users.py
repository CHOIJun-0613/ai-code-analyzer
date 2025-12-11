from fastapi import APIRouter, Depends, HTTPException
from typing import List
from app.models.user import User, UserCreate, Group, GroupCreate
from app.services.user_service import user_service

router = APIRouter()

@router.post("/users/", response_model=User)
def create_user(user: UserCreate):
    db_user = user_service.get_user_by_username(user.username)
    if db_user:
        raise HTTPException(status_code=400, detail="Username already registered")
    return user_service.create_user(user)

@router.get("/users/{user_id}", response_model=User)
def read_user(user_id: str):
    db_user = user_service.get_user(user_id)
    if db_user is None:
        raise HTTPException(status_code=404, detail="User not found")
    return db_user

@router.post("/groups/", response_model=Group)
def create_group(group: GroupCreate):
    return user_service.create_group(group)
