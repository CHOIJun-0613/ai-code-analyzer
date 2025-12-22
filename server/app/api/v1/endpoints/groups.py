from typing import List, Dict
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

@router.put("/{group_id}/projects", response_model=Dict[str, str])
def update_group_projects(group_id: str, projects: List[str]):
    try:
        UserService.update_group_projects(group_id, projects)
        # Return updated group
        # In a real scenario we'd refetch the group, but here we can just iterate list_groups or strictly fetch one.
        # For simplicity, let's fetch the specific group logic or just return success message.
        # But the response model is Group. Let's reuse list logic or fetch by id logic which is missing in service public API for single ID (except update return).
        # Actually UserService.update_group_projects doesn't return Group.
        # Let's change this to return a simple message for now or fetch the group if possible.
        # UserService.list_groups() is available.
        # Let's just return a success message and change response_model to dict.
        return {"message": "Group projects updated successfully"}
    except Exception as e:
        raise HTTPException(status_code=500, detail=str(e))
