from pydantic import BaseModel, EmailStr, Field
from typing import List, Optional
from enum import Enum
from datetime import datetime

class Permission(str, Enum):
    MANAGE_USERS = "manage_users"
    ANALYZE_CODE = "analyze_code"
    VIEW_PROJECT = "view_project"
    MANAGE_PROJECT = "manage_project"

class GroupBase(BaseModel):
    name: str
    permissions: List[Permission] = []
    projects: List[str] = []  # List of project names or IDs

class GroupCreate(GroupBase):
    pass

class Group(GroupBase):
    id: str

class UserBase(BaseModel):
    username: str
    name: Optional[str] = None
    email: EmailStr
    phone_number: Optional[str] = None
    is_active: bool = True

class UserCreate(UserBase):
    password: str
    group_ids: List[str] = []

class UserUpdate(BaseModel):
    name: Optional[str] = None
    email: Optional[EmailStr] = None
    password: Optional[str] = None
    is_active: Optional[bool] = None
    phone_number: Optional[str] = None
    group_ids: Optional[List[str]] = None

class User(UserBase):
    id: str
    groups: List[Group] = []
    created_at: Optional[datetime] = None
    updated_at: Optional[datetime] = None

class UserInDB(User):
    password: str
