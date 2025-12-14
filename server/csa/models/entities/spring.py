from pydantic import BaseModel

class Bean(BaseModel):
    """Represents a Spring Bean."""

    name: str
    type: str  # "component", "service", "repository", "controller", "configuration"
    scope: str  # "singleton", "prototype", "request", "session"
    class_name: str
    package_name: str = ""
    annotation_names: list[str] = []  # Just store annotation names
    method_count: int = 0  # Number of methods
    property_count: int = 0  # Number of properties
    description: str = ""  # Brief description of the bean
    ai_description: str = ""  # AI-generated description of the bean
    bxm_datasource: str = ""  # Bxm Framework: @BxmDataAccess 값


class BeanDependency(BaseModel):
    """Represents a dependency between Spring Beans."""
    
    source_bean: str
    target_bean: str
    injection_type: str  # "field", "constructor", "setter"
    field_name: str = ""
    method_name: str = ""
    parameter_name: str = ""
    description: str = ""  # Brief description of the dependency
    ai_description: str = ""  # AI-generated description of the dependency


class Endpoint(BaseModel):
    """Represents a REST API endpoint."""
    
    path: str
    method: str  # "GET", "POST", "PUT", "DELETE", "PATCH"
    controller_class: str
    handler_method: str
    parameters: list[dict] = []  # Request parameters
    return_type: str = ""
    annotations: list[str] = []  # Web annotations on the method
    full_path: str = ""  # Complete URL path including class-level mapping
    description: str = ""  # Brief description of the endpoint
    ai_description: str = ""  # AI-generated description of the endpoint
