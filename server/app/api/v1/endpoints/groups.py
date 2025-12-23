from typing import List, Dict
from fastapi import APIRouter, HTTPException
from app.models.user import Group, GroupCreate, Permission
from app.services.user_service import UserService

router = APIRouter()

@router.post("/", response_model=Group)
def create_group(group: GroupCreate):
    try:
        new_group = UserService.create_group(group.id, group.name, [p.value for p in group.permissions])
        if group.projects:
            UserService.update_group_projects(new_group.id, group.projects)
            new_group.projects = group.projects
        return new_group
    except ValueError as e:
        raise HTTPException(status_code=409, detail=str(e))
    except Exception as e:
        raise HTTPException(status_code=500, detail=str(e))

@router.get("/check/{group_id}")
def check_group_exists(group_id: str):
    try:
        return {"exists": UserService.check_group_exists(group_id)}
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

@router.put("/{group_id}", response_model=Group)
def update_group(group_id: str, group_update: GroupCreate):
    try:
        # Update Name
        updated_group = UserService.update_group(group_id, group_update.name)
        
        # Update Permissions if provided
        UserService.update_group_permissions(group_id, group_update.permissions)
        
        # Update Projects if provided
        if group_update.projects is not None:
             UserService.update_group_projects(group_id, group_update.projects)
        
        return updated_group
    except Exception as e:
        raise HTTPException(status_code=500, detail=str(e))

@router.delete("/{group_id}")
def delete_group(group_id: str):
    try:
        UserService.delete_group(group_id)
        return {"message": "Group deleted successfully"}
    except Exception as e:
        raise HTTPException(status_code=500, detail=str(e))
