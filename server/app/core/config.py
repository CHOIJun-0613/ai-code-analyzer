from typing import Optional
from pydantic_settings import BaseSettings

class Settings(BaseSettings):
    PROJECT_NAME: str = "AI Code Analyzer"
    API_V1_STR: str = "/api/v1"
    
    # Neo4j Config
    NEO4J_URI: str = "bolt://localhost:7687"
    NEO4J_USER: str = "neo4j"
    NEO4J_PASSWORD: str = "password"
    NEO4J_INSTANCE: Optional[str] = None
    NEO4J_DATABASE: Optional[str] = None
    NEO4J_POOL_SIZE: int = 10
    NEO4J_BATCH_SIZE: int = 25

    # Java Parser Config
    JAVA_SOURCE_FOLDER: Optional[str] = None
    USE_NEO4J_BEAN_RESOLVER: bool = True
    USE_STREAMING_PARSE: bool = True
    JAVA_PARSE_WORKERS: Optional[int] = None
    JAVA_FILE_PARSE_TIMEOUT: float = 120.0
    JAVA_COMPLEXITY_THRESHOLD: int = 50000
    SKIP_DTO_SOURCE: bool = False
    SKIP_DTO_METHODS: bool = True

    # Logging
    LOG_LEVEL: str = "INFO"

    # Output Directories
    SEQUENCE_DIAGRAM_OUTPUT_DIR: str = "output/sequence-diagram"
    CRUD_MATRIX_OUTPUT_DIR: str = "output/crud-matrix"
    CLASS_SPEC_OUTPUT_DIR: str = "output/class-spec"
    IMPACT_ANALYSIS_OUTPUT_DIR: str = "output/impact-analysis"

    # AI Analysis Config
    USE_AI_ANALYSIS: bool = False
    CONCURRENT_AI_REQUESTS: int = 15
    AI_ENRICHMENT_BATCH_SIZE: int = 50
    AI_PROVIDER: str = "lmstudio"

    # Google Gemini
    GOOGLE_API_KEY: Optional[str] = None
    GEMINI_MODEL_NAME: str = "gemini-2.5-flash"
    GOOGLE_CENAI_USE_VERTEXAI: bool = False

    # Groq
    GROQ_API_KEY: Optional[str] = None
    GROQ_MODEL_NAME: str = "qwen/qwen3-32b"

    # LM Studio
    LMSTUDIO_BASE_URL: str = "http://localhost:1234/v1"
    LMSTUDIO_MODEL_NAME: str = "a.x-4.0-light"

    # OpenAI
    OPENAI_API_KEY: Optional[str] = None
    OPENAI_MODEL_NAME: str = "gpt-oss:20b"
    OPENAI_BASE_URL: Optional[str] = None

    class Config:
        env_file = ".env"
        extra = "ignore"  # Allow extra fields in .env that are not defined here, just in case

settings = Settings()
