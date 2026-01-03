from pydantic import BaseModel
from typing import Optional

class AiPrompt(BaseModel):
    """Represents an AI Prompt managed in Neo4j."""
    
    name: str
    content: str
    description: str = ""
    updated_at: str = ""
    updated_by: str = ""
    is_system: bool = False  # If true, adds :System label
    
    # Optional metadata
    version: int = 1
