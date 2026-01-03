from typing import Any, List

from fastapi import APIRouter, HTTPException, Body, Depends

from csa.services.ai_prompt_service import ai_prompt_service
from csa.models.entities.ai_prompt import AiPrompt

router = APIRouter()

@router.get("/", response_model=List[AiPrompt])
def read_prompts() -> Any:
    """
    Retrieve all AI prompts.
    """
    try:
        return ai_prompt_service.get_all_prompts()
    except Exception as e:
        raise HTTPException(status_code=500, detail=str(e))

@router.get("/{name}", response_model=AiPrompt)
def read_prompt(name: str) -> Any:
    """
    Retrieve a specific AI prompt by name.
    """
    prompt = ai_prompt_service.get_prompt_detail(name)
    if not prompt:
        raise HTTPException(status_code=404, detail="Prompt not found")
    return prompt

@router.put("/{name}", response_model=AiPrompt)
def update_prompt(
    name: str,
    content: str = Body(..., embed=True),
    description: str = Body(None, embed=True),
    # user_id should be extracted from token in real implementation
    user_id: str = "admin" 
) -> Any:
    """
    Update an AI prompt.
    """
    # Validation logic can be added here (e.g. checking for required placeholders)
    try:
        updated_prompt = ai_prompt_service.update_prompt(name, content, description, user_id)
        if not updated_prompt:
             raise HTTPException(status_code=404, detail="Prompt not found to update")
        return updated_prompt
    except Exception as e:
        raise HTTPException(status_code=500, detail=str(e))
