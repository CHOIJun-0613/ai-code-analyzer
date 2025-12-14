from pydantic import BaseModel

class JpaEntity(BaseModel):
    """Represents a JPA Entity."""
    
    name: str
    table_name: str = ""
    columns: list[dict] = []  # Column mappings
    relationships: list[dict] = []  # Entity relationships
    annotations: list[str] = []  # JPA annotations
    package_name: str = ""
    file_path: str = ""
    description: str = ""  # Brief description of the entity
    ai_description: str = ""  # AI-generated description of the entity


class JpaColumn(BaseModel):
    """Represents a JPA Column mapping."""
    
    property_name: str
    column_name: str = ""
    data_type: str = ""
    nullable: bool = True
    unique: bool = False
    length: int = 0
    precision: int = 0
    scale: int = 0
    annotations: list[str] = []  # Column annotations
    description: str = ""  # Brief description of the column
    ai_description: str = ""  # AI-generated description of the column


class JpaRelationship(BaseModel):
    """Represents a JPA Entity relationship."""
    
    type: str  # "OneToOne", "OneToMany", "ManyToOne", "ManyToMany"
    target_entity: str = ""
    mapped_by: str = ""
    join_column: str = ""
    join_table: str = ""
    cascade: list[str] = []  # Cascade types
    fetch: str = "LAZY"  # Fetch type
    annotations: list[str] = []  # Relationship annotations
    description: str = ""  # Brief description of the relationship
    ai_description: str = ""  # AI-generated description of the relationship


class JpaRepository(BaseModel):
    """Represents a JPA Repository interface."""
    
    name: str
    entity_type: str = ""  # The entity type this repository manages
    methods: list[dict] = []  # Repository methods
    package_name: str = ""
    file_path: str = ""
    annotations: list[str] = []  # Repository annotations
    description: str = ""  # Brief description of the repository
    ai_description: str = ""  # AI-generated description of the repository


class JpaQuery(BaseModel):
    """Represents a JPA Query (JPQL, Native SQL, or Method Query)."""
    
    name: str
    query_type: str = ""  # "JPQL", "NATIVE", "METHOD", "NAMED"
    query_content: str = ""
    return_type: str = ""
    parameters: list[dict] = []  # Query parameters
    repository_name: str = ""
    method_name: str = ""
    annotations: list[str] = []  # Query annotations (@Query, @Modifying, etc.)
    description: str = ""  # Brief description of the query
    ai_description: str = ""  # AI-generated description of the query
