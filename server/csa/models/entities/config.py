from pydantic import BaseModel
from typing import Any

class ConfigFile(BaseModel):
    """Represents a configuration file."""
    
    name: str
    file_path: str
    file_type: str  # "yaml", "yml", "properties"
    properties: dict[str, Any] = {}
    sections: list[dict] = []  # Configuration sections
    profiles: list[str] = []  # Active profiles
    environment: str = ""  # Environment (dev, prod, test)
    description: str = ""  # Brief description of the config file
    ai_description: str = ""  # AI-generated description of the config file


class DatabaseConfig(BaseModel):
    """Represents database configuration."""
    
    driver: str = ""
    url: str = ""
    username: str = ""
    password: str = ""
    dialect: str = ""
    hibernate_ddl_auto: str = ""
    show_sql: bool = False
    format_sql: bool = False
    jpa_properties: dict[str, Any] = {}
    description: str = ""  # Brief description of the database config
    ai_description: str = ""  # AI-generated description of the database config


class ServerConfig(BaseModel):
    """Represents server configuration."""
    
    port: int = 8080
    context_path: str = ""
    servlet_path: str = ""
    ssl_enabled: bool = False
    ssl_key_store: str = ""
    ssl_key_store_password: str = ""
    ssl_key_store_type: str = ""
    description: str = ""  # Brief description of the server config
    ai_description: str = ""  # AI-generated description of the server config


class SecurityConfig(BaseModel):
    """Represents security configuration."""
    
    enabled: bool = False
    authentication_type: str = ""  # "jwt", "session", "oauth2"
    jwt_secret: str = ""
    jwt_expiration: int = 0
    cors_allowed_origins: list[str] = []
    cors_allowed_methods: list[str] = []
    cors_allowed_headers: list[str] = []
    description: str = ""  # Brief description of the security config
    ai_description: str = ""  # AI-generated description of the security config


class LoggingConfig(BaseModel):
    """Represents logging configuration."""
    
    level: str = "INFO"
    pattern: str = ""
    file_path: str = ""
    max_file_size: str = ""
    max_history: int = 0
    console_output: bool = True
    description: str = ""  # Brief description of the logging config
    ai_description: str = ""  # AI-generated description of the logging config
