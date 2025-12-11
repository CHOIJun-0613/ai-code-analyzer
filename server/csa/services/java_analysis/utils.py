"""
Utility helpers for Java parsing.
"""
from __future__ import annotations

import re
from pathlib import Path
from typing import List

from csa.vendor import javalang

from csa.models.graph_entities import Annotation, Class, Field, Method, MethodCall


def extract_project_name(java_source_folder: str) -> str:
    """
    JAVA_SOURCE_FOLDER 경로에서 프로젝트 이름을 추출합니다.
    
    Args:
        java_source_folder: Java 소스 폴더 경로
        
    Returns:
        프로젝트 이름 (마지막 디렉토리명)
    """
    path = Path(java_source_folder).resolve()
    return path.name

def extract_sub_type(package_name: str, class_name: str, annotations: list[Annotation]) -> str:
    """
    rule003 기반으로 클래스의 sub_type을 추출합니다.

    rule003에 따라 다음 순서로 sub-type 판별:
    1. @RestController 또는 @Controller -> "controller"
    2. @Service -> "service"
    3. @Component -> "component"
    4. @BxmDataAccess -> "dbio"
    5. @XmlType + @XmlRootElement -> "dto"
    6. 위 조건에 해당하지 않으면 -> "utility"

    Args:
        package_name: 패키지명 (사용하지 않음, 하위 호환성을 위해 유지)
        class_name: 클래스명 (사용하지 않음, 하위 호환성을 위해 유지)
        annotations: 클래스 어노테이션 리스트

    Returns:
        sub_type (controller, service, component, dbio, dto, utility)
    """
    # rule003 기반 subtype 추출 함수 사용
    from csa.parsers.java.class_subtype import extract_class_subtype_from_annotations

    return extract_class_subtype_from_annotations(annotations, project_name=None)

__all__ = [
    "classify_springboot_annotation",
    "classify_test_annotation",
    "extract_project_name",
    "extract_sub_type",
    "generate_lombok_methods",
    "parse_annotations",
]
def parse_annotations(annotations, target_type: str = "class") -> list[Annotation]:
    """Parse Java annotations into Annotation objects.
    
    Args:
        annotations: List of annotation nodes from javalang
        target_type: Type of target ("class", "method", "field")
    """
    result = []
    for annotation in annotations:
        annotation_name = annotation.name
        parameters = {}
        
        if hasattr(annotation, 'element') and annotation.element:
            for element in annotation.element:
                if hasattr(element, 'name') and hasattr(element, 'value'):
                    parameters[element.name] = element.value.value if hasattr(element.value, 'value') else str(element.value)
        
        result.append(Annotation(
            name=annotation_name,
            parameters=parameters,
            target_type=target_type,
            category=classify_springboot_annotation(annotation_name)
        ))
    
    return result

def classify_springboot_annotation(annotation_name: str) -> str:
    """Classify SpringBoot annotations into categories.
    
    Args:
        annotation_name: Name of the annotation (e.g., "@Component", "@Service")
        
    Returns:
        Category of the annotation
    """
    component_annotations = {
        "Component", "Service", "Repository", "Controller", 
        "RestController", "Configuration", "Bean"
    }
    
    injection_annotations = {
        "Autowired", "Resource", "Value", "Qualifier", "Primary"
    }
    
    web_annotations = {
        "RequestMapping", "GetMapping", "PostMapping", "PutMapping", 
        "DeleteMapping", "PatchMapping", "RequestParam", "PathVariable",
        "RequestBody", "ResponseBody", "ResponseStatus"
    }
    
    jpa_annotations = {
        "Entity", "Table", "MappedSuperclass", "Embeddable", "Embedded",
        
        "Id", "GeneratedValue", "SequenceGenerator", "TableGenerator",
        
        "Column", "Basic", "Transient", "Enumerated", "Temporal", "Lob",
        
        "OneToOne", "OneToMany", "ManyToOne", "ManyToMany",
        "JoinColumn", "JoinColumns", "JoinTable", "PrimaryKeyJoinColumn", "PrimaryKeyJoinColumns",
        
        "ElementCollection", "CollectionTable", "OrderBy", "OrderColumn",
        "MapKey", "MapKeyClass", "MapKeyColumn", "MapKeyJoinColumn", "MapKeyJoinColumns",
        "MapKeyTemporal", "MapKeyEnumerated",
        
        "Inheritance", "DiscriminatorColumn", "DiscriminatorValue",
        
        "SecondaryTable", "SecondaryTables", "AttributeOverride", "AttributeOverrides",
        "AssociationOverride", "AssociationOverrides",
        
        "NamedQuery", "NamedQueries", "NamedNativeQuery", "NamedNativeQueries",
        "SqlResultSetMapping", "SqlResultSetMappings", "ConstructorResult", "ColumnResult",
        "FieldResult", "EntityResult", "EntityResults",
        
        "Cacheable",
        
        "Version",
        
        "Access",
        
        "UniqueConstraint", "Index", "ForeignKey"
    }
    
    test_annotations = {
        "Test", "SpringBootTest", "DataJpaTest", "WebMvcTest",
        "MockBean", "SpyBean", "TestPropertySource"
    }
    
    security_annotations = {
        "PreAuthorize", "PostAuthorize", "Secured", "RolesAllowed",
        "EnableWebSecurity", "EnableGlobalMethodSecurity"
    }
    
    validation_annotations = {
        "Valid", "NotNull", "NotBlank", "NotEmpty", "Size", "Min", "Max",
        "Pattern", "Email", "AssertTrue", "AssertFalse"
    }
    
    mybatis_annotations = {
        "Mapper", "Select", "Insert", "Update", "Delete", "SelectProvider",
        "InsertProvider", "UpdateProvider", "DeleteProvider", "Results",
        "Result", "One", "Many", "MapKey", "Options", "SelectKey"
    }

    # Bxm Framework 특화 어노테이션
    bxm_annotations = {
        "BxmCategory", "BxmDataAccess", "BXMType", "BxmOmm_Field"
    }

    if annotation_name in component_annotations:
        return "component"
    elif annotation_name in injection_annotations:
        return "injection"
    elif annotation_name in web_annotations:
        return "web"
    elif annotation_name in jpa_annotations:
        return "jpa"
    elif annotation_name in test_annotations:
        return "test"
    elif annotation_name in security_annotations:
        return "security"
    elif annotation_name in validation_annotations:
        return "validation"
    elif annotation_name in mybatis_annotations:
        return "mybatis"
    elif annotation_name in bxm_annotations:
        return "bxm"
    else:
        return "other"

def classify_test_annotation(annotation_name: str) -> str:
    """Classify test annotations into categories.
    
    Args:
        annotation_name: Name of the annotation
        
    Returns:
        Category of the test annotation
    """
    junit_annotations = {
        "Test", "BeforeEach", "AfterEach", "BeforeAll", "AfterAll",
        "DisplayName", "ParameterizedTest", "ValueSource", "CsvSource",
        "MethodSource", "Timeout", "Disabled", "Nested", "RepeatedTest",
        "Order", "TestMethodOrder", "TestInstance", "TestClassOrder"
    }
    
    spring_test_annotations = {
        "SpringBootTest", "WebMvcTest", "DataJpaTest", "DataJdbcTest",
        "JdbcTest", "JsonTest", "RestClientTest", "WebFluxTest",
        "MockBean", "SpyBean", "TestConfiguration", "ActiveProfiles",
        "TestPropertySource", "DirtiesContext", "Transactional",
        "Rollback", "Commit", "Sql", "SqlGroup", "AutoConfigureTestDatabase",
        "AutoConfigureMockMvc", "AutoConfigureWebMvc", "AutoConfigureWebClient",
        "MockMvc", "TestEntityManager", "TestContainers", "DynamicPropertySource"
    }
    
    testng_annotations = {
        "TestNG", "BeforeMethod", "AfterMethod", "BeforeClass", "AfterClass",
        "BeforeSuite", "AfterSuite", "BeforeGroups", "AfterGroups",
        "DataProvider", "Parameters", "Groups", "Priority", "DependsOnMethods",
        "DependsOnGroups", "ExpectedExceptions", "InvocationCount",
        "SuccessPercentage", "TimeOut"
    }
    
    mockito_annotations = {
        "Mock", "Spy", "InjectMocks", "Captor", "MockedStatic"
    }
    
    assertj_annotations = {
        "AssertJ"
    }
    
    other_test_annotations = {
        "Ignore", "Category", "RunWith", "ExtendWith", "ContextConfiguration"
    }
    
    if annotation_name in junit_annotations:
        return "junit"
    elif annotation_name in spring_test_annotations:
        return "spring_test"
    elif annotation_name in testng_annotations:
        return "testng"
    elif annotation_name in mockito_annotations:
        return "mockito"
    elif annotation_name in assertj_annotations:
        return "assertj"
    elif annotation_name in other_test_annotations:
        return "other_test"
    else:
        return "other"

def generate_lombok_methods(properties: list[Field], class_name: str, package_name: str) -> list[Method]:
    """Generate Lombok @Data methods (getters, setters, equals, hashCode, toString) for properties."""
    methods = []
    
    for prop in properties:
        getter_name = f"get{prop.name[0].upper()}{prop.name[1:]}"
        if prop.type == "Boolean" and prop.name.startswith("is"):
            getter_name = prop.name
        
        getter = Method(
            name=getter_name,
            logical_name=f"{package_name}.{class_name}.{getter_name}",
            return_type=prop.type,
            parameters=[],
            modifiers=["public"],
            source="",  # Generated method, no source
            package_name=package_name,
            annotations=[],
            description=f"Generated getter for {prop.name} field",  # Generated method description
            ai_description=""
        )
        methods.append(getter)
        
        setter_name = f"set{prop.name[0].upper()}{prop.name[1:]}"
        setter_param = Field(
            name=prop.name,
            logical_name="",
            type=prop.type,
            package_name=package_name,
            class_name=class_name
        )
        
        setter = Method(
            name=setter_name,
            logical_name=f"{package_name}.{class_name}.{setter_name}",
            return_type="void",
            parameters=[setter_param],
            modifiers=["public"],
            source="",  # Generated method, no source
            package_name=package_name,
            annotations=[],
            description=f"Generated setter for {prop.name} field",  # Generated method description
            ai_description=""
        )
        methods.append(setter)
    
    equals_method = Method(
        name="equals",
        logical_name=f"{package_name}.{class_name}.equals",
        return_type="boolean",
        parameters=[Field(name="obj", logical_name="", type="Object", package_name=package_name, class_name=class_name)],
        modifiers=["public"],
        source="",  # Generated method, no source
        package_name=package_name,
        annotations=[],
        description="Generated equals method for object comparison",  # Generated method description
        ai_description="",
        is_lombok_generated=True  # Lombok generated method flag
    )
    methods.append(equals_method)
    
    hashcode_method = Method(
        name="hashCode",
        logical_name=f"{package_name}.{class_name}.hashCode",
        return_type="int",
        parameters=[],
        modifiers=["public"],
        source="",  # Generated method, no source
        package_name=package_name,
        annotations=[],
        description="Generated hashCode method for object hashing",  # Generated method description
        ai_description="",
        is_lombok_generated=True  # Lombok generated method flag
    )
    methods.append(hashcode_method)
    
    tostring_method = Method(
        name="toString",
        logical_name=f"{package_name}.{class_name}.toString",
        return_type="String",
        parameters=[],
        modifiers=["public"],
        source="",  # Generated method, no source
        package_name=package_name,
        annotations=[],
        description="Generated toString method for string representation",  # Generated method description
        ai_description="",
        is_lombok_generated=True  # Lombok generated method flag
    )
    methods.append(tostring_method)
    
    return methods

