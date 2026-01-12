from fastapi import APIRouter, Depends, HTTPException
from typing import List
from app.api.deps import get_current_user
from app.models.user import UserInDB
from app.core.config import settings
from csa.services.graph_db import GraphDB

router = APIRouter()

@router.get("/", response_model=List[dict])
def get_applications(
    current_user: UserInDB = Depends(get_current_user)
):
    """
    Retrieve all application names.
    """
    db = GraphDB(settings.NEO4J_URI, settings.NEO4J_USER, settings.NEO4J_PASSWORD, settings.NEO4J_DATABASE)
    try:
        applications = db.get_all_applications()
        return applications
    except Exception as e:
        raise HTTPException(status_code=500, detail=f"Failed to fetch applications: {str(e)}")
    finally:
        db.close()
