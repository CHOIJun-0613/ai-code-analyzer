from pydantic import BaseModel

class MyBatisMapper(BaseModel):
    """Represents a MyBatis Mapper interface or XML file."""

    name: str
    logical_name: str = ""
    type: str  # "interface", "xml"
    file_extension: str = ""  # File extension (e.g., "xml", "dbio", "java")
    namespace: str = ""
    methods: list[dict] = []  # Mapper methods
    sql_statements: list[dict] = []  # SQL statements
    file_path: str = ""
    package_name: str = ""
    source: str = ""  # Mapper 파일 원본 소스 코드
    description: str = ""  # Brief description of the mapper
    ai_description: str = ""  # AI-generated description of the mapper


class MyBatisSqlStatement(BaseModel):
    """Represents a MyBatis SQL statement."""

    id: str  # Method name or statement ID
    logical_name: str = ""
    sql_type: str  # "SELECT", "INSERT", "UPDATE", "DELETE"
    sql_content: str = ""
    parameter_type: str = ""
    result_type: str = ""
    result_map: str = ""
    mapper_name: str = ""
    annotations: list[str] = []  # MyBatis annotations
    description: str = ""  # Brief description of the SQL statement
    ai_description: str = ""  # AI-generated description of the SQL statement
    flow_json: dict = {}  # SQL Flow JSON (정적 분석 또는 AI 생성)


class MyBatisResultMap(BaseModel):
    """Represents a MyBatis ResultMap."""
    
    id: str
    type: str
    properties: list[dict] = []  # Property mappings
    associations: list[dict] = []  # Association mappings
    collections: list[dict] = []  # Collection mappings
    mapper_name: str = ""
    description: str = ""  # Brief description of the result map
    ai_description: str = ""  # AI-generated description of the result map
