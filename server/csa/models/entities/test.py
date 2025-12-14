from pydantic import BaseModel
from typing import Any

class TestClass(BaseModel):
    """Represents a test class."""
    
    name: str
    package_name: str = ""
    test_framework: str = ""  # "junit", "testng", "spock"
    test_type: str = ""  # "unit", "integration", "end-to-end"
    annotations: list[str] = []  # Test annotations
    test_methods: list[dict] = []  # Test methods
    setup_methods: list[dict] = []  # Setup/teardown methods
    mock_dependencies: list[dict] = []  # Mocked dependencies
    test_configurations: list[dict] = []  # Test configurations
    file_path: str = ""
    description: str = ""  # Brief description of the test class
    ai_description: str = ""  # AI-generated description of the test class


class TestMethod(BaseModel):
    """Represents a test method."""
    
    name: str
    return_type: str = "void"
    annotations: list[str] = []  # Test method annotations
    assertions: list[dict] = []  # Assertions in the test
    mock_calls: list[dict] = []  # Mock method calls
    test_data: list[dict] = []  # Test data setup
    expected_exceptions: list[str] = []  # Expected exceptions
    timeout: int = 0  # Test timeout
    display_name: str = ""  # @DisplayName value
    description: str = ""  # Brief description of the test method
    ai_description: str = ""  # AI-generated description of the test method


class TestConfiguration(BaseModel):
    """Represents test configuration."""
    
    name: str
    type: str = ""  # "configuration", "profile", "property"
    properties: dict[str, Any] = {}
    active_profiles: list[str] = []
    test_slices: list[str] = []  # @WebMvcTest, @DataJpaTest, etc.
    mock_beans: list[dict] = []  # @MockBean definitions
    spy_beans: list[dict] = []  # @SpyBean definitions
    description: str = ""  # Brief description of the test configuration
    ai_description: str = ""  # AI-generated description of the test configuration
