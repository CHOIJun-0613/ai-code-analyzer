from pydantic import BaseModel, EmailStr, Field
from typing import List, Optional
from enum import Enum

class Permission(str, Enum):
    MANAGE_USERS = "manage_users"
    ANALYZE_CODE = "analyze_code"
    VIEW_PROJECT = "view_project"
    MANAGE_PROJECT = "manage_project"

class GroupBase(BaseModel):
    name: str
    permissions: List[Permission] = []

class GroupCreate(GroupBase):
    pass

class Group(GroupBase):
    id: str

class UserBase(BaseModel):
    username: str
    email: EmailStr
    is_active: bool = True

class UserCreate(UserBase):
    password: str
    group_ids: List[str] = []

class User(UserBase):
    id: str
    groups: List[Group] = []
