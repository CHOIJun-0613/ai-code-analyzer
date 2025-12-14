from pydantic import BaseModel

class Package(BaseModel):
    """Represents a Java package."""

    name: str
    logical_name: str = ""
    description: str = ""  # Brief description of the package
    ai_description: str = ""  # AI-generated description of the package
