from pydantic import BaseModel
from typing import Any, Literal, TYPE_CHECKING, Optional

if TYPE_CHECKING:
    from typing import List

class Annotation(BaseModel):
    """Represents a Java annotation."""
    
    name: str
    parameters: dict[str, Any] = {}
    target_type: str = "class"  # "class", "method", "field"
    category: str = "other"  # "component", "injection", "web", "jpa", "test", "security", "validation", "other"
    description: str = ""  # Brief description of the annotation
    ai_description: str = ""  # AI-generated description of the annotation
