from typing import List
from fastapi import APIRouter, HTTPException
from app.models.user import Group, GroupCreate, Permission
from app.services.user_service import UserService

router = APIRouter()

@router.post("/", response_model=Group)
def create_group(group: GroupCreate):
    try:
        return UserService.create_group(group)
    except Exception as e:
        raise HTTPException(status_code=500, detail=str(e))

@router.get("/", response_model=List[Group])
def list_groups():
    try:
        return UserService.list_groups()
    except Exception as e:
        raise HTTPException(status_code=500, detail=str(e))

@router.put("/{group_id}/permissions", response_model=Group)
def update_group_permissions(group_id: str, permissions: List[Permission]):
    try:
        return UserService.update_group_permissions(group_id, permissions)
    except Exception as e:
        raise HTTPException(status_code=500, detail=str(e))

@router.post("/{group_id}/users/{user_id}")
def add_user_to_group(group_id: str, user_id: str):
    try:
        UserService.add_user_to_group(user_id, group_id)
        return {"message": "User added to group successfully"}
    except Exception as e:
        raise HTTPException(status_code=500, detail=str(e))
