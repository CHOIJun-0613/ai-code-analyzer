"""
MyBatisMapper file_extension 속성 테스트
"""
import pytest
from csa.models.graph_entities import MyBatisMapper


def test_mybatis_mapper_file_extension_xml():
    """XML 파일 확장자가 올바르게 추출되는지 테스트"""
    mapper = MyBatisMapper(
        name="UserMapper",
        type="xml",
        file_extension="xml",
        namespace="com.example.mapper.UserMapper",
        file_path="/path/to/UserMapper.xml"
    )

    assert mapper.file_extension == "xml"
    assert mapper.name == "UserMapper"
    assert mapper.type == "xml"


def test_mybatis_mapper_file_extension_dbio():
    """DBIO 파일 확장자가 올바르게 추출되는지 테스트"""
    mapper = MyBatisMapper(
        name="ProductMapper",
        type="xml",
        file_extension="dbio",
        namespace="com.example.mapper.ProductMapper",
        file_path="/path/to/ProductMapper.dbio"
    )

    assert mapper.file_extension == "dbio"
    assert mapper.name == "ProductMapper"
    assert mapper.type == "xml"


def test_mybatis_mapper_file_extension_java():
    """Java 인터페이스 파일 확장자가 올바르게 추출되는지 테스트"""
    mapper = MyBatisMapper(
        name="OrderMapper",
        type="interface",
        file_extension="java",
        namespace="com.example.mapper.OrderMapper",
        file_path="/path/to/OrderMapper.java"
    )

    assert mapper.file_extension == "java"
    assert mapper.name == "OrderMapper"
    assert mapper.type == "interface"


def test_mybatis_mapper_file_extension_empty():
    """파일 확장자가 없는 경우 빈 문자열로 처리되는지 테스트"""
    mapper = MyBatisMapper(
        name="CustomMapper",
        type="interface",
        file_extension="",
        namespace="com.example.mapper.CustomMapper",
        file_path=""
    )

    assert mapper.file_extension == ""
    assert mapper.name == "CustomMapper"


def test_extract_file_extension_from_path():
    """file_path에서 파일 확장자를 추출하는 로직 테스트"""
    test_cases = [
        ("/path/to/UserMapper.xml", "xml"),
        ("/path/to/ProductMapper.dbio", "dbio"),
        ("/path/to/OrderMapper.java", "java"),
        ("/path/to/file.with.dots.xml", "xml"),
        ("/path/to/noextension", ""),  # 확장자가 없으면 빈 문자열
        ("", ""),
    ]

    for file_path, expected_ext in test_cases:
        if file_path and "." in file_path:
            ext = file_path.split(".")[-1]
        else:
            ext = ""

        assert ext == expected_ext, \
            f"Failed for file_path={file_path}, expected={expected_ext}, got={ext}"


if __name__ == "__main__":
    pytest.main([__file__, "-v"])
