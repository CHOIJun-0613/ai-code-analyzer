from pydantic import BaseModel
from typing import Any
from .base import Annotation

class SqlStatement(BaseModel):
    """Represents a SQL statement node in the graph database."""

    id: str  # Statement ID
    logical_name: str = ""
    sql_type: str  # "SELECT", "INSERT", "UPDATE", "DELETE"
    sql_content: str = ""
    parameter_type: str = ""
    result_type: str = ""
    result_map: str = ""
    mapper_name: str = ""
    namespace: str = ""  # MyBatis Mapper namespace
    annotations: list[Annotation] = []  # MyBatis annotations as Annotation objects
    project_name: str = ""
    description: str = ""  # Brief description of the SQL statement
    ai_description: str = ""  # AI-generated description of the SQL statement

    # SQL 분석 결과 추가 속성들
    sql_analysis: dict[str, Any] = {}  # SQL 파서 분석 결과
    tables: list[dict[str, str]] = []  # 테이블 정보
    columns: list[dict[str, str]] = []  # 컬럼 정보
    complexity_score: int = 0  # SQL 복잡도 점수


class Database(BaseModel):
    """Represents a database."""
    
    name: str
    version: str = ""
    environment: str = ""  # "development", "production", "test"
    description: str = ""
    ai_description: str = ""
    updated_at: str = ""


class Table(BaseModel):
    """Represents a database table."""
    
    name: str
    schema_name: str = "public"
    comment: str = ""
    ai_description: str = ""
    updated_at: str = ""


class Column(BaseModel):
    """Represents a database column."""
    
    name: str
    data_type: str
    nullable: bool = True
    unique: bool = False
    primary_key: bool = False
    default_value: str = ""
    constraints: list[str] = []
    table_name: str = ""  # Add table_name for relationship
    comment: str = ""
    ai_description: str = ""
    updated_at: str = ""


class Index(BaseModel):
    """Represents a database index."""
    
    name: str
    type: str = "B-tree"  # "B-tree", "UNIQUE", "GIN", "GIST" 등
    columns: list[str] = []
    table_name: str = ""  # Add table_name for relationship
    # columns: list[str] = []  # Redefinition removed
    reference_table: str = ""
    reference_columns: list[str] = []
    description: str = ""
    ai_description: str = ""
    updated_at: str = ""


class Constraint(BaseModel):
    """Represents a database constraint."""
    
    name: str
    type: str  # "CHECK", "FOREIGN KEY", "UNIQUE", "PRIMARY KEY" 등
    definition: str = ""
    table_name: str = ""  # Add table_name for relationship
    columns: list[str] = []
    reference_table: str = ""
    reference_columns: list[str] = []
    description: str = ""
    ai_description: str = ""
    updated_at: str = ""
