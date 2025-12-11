"""
MyBatis 파일 확장자 추출 통합 테스트
"""
import pytest
import tempfile
import os
from csa.services.java_analysis.mybatis import (
    parse_mybatis_xml_file,
    extract_mybatis_mappers_from_classes
)
from csa.models.graph_entities import Class, Annotation


def test_parse_mybatis_xml_file_extension():
    """XML 파일 파싱 시 file_extension이 올바르게 추출되는지 테스트"""
    xml_content = """<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
  "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="com.example.mapper.UserMapper">
    <select id="selectUser" resultType="User">
        SELECT * FROM users WHERE id = #{id}
    </select>
</mapper>
"""

    # 임시 XML 파일 생성
    with tempfile.NamedTemporaryFile(mode='w', suffix='.xml', delete=False, encoding='utf-8') as f:
        f.write(xml_content)
        temp_xml_path = f.name

    try:
        mapper = parse_mybatis_xml_file(temp_xml_path)

        assert mapper is not None
        assert mapper.file_extension == "xml"
        assert mapper.type == "xml"
        assert mapper.name == "UserMapper"
        assert mapper.file_path == temp_xml_path
    finally:
        # 임시 파일 삭제
        if os.path.exists(temp_xml_path):
            os.unlink(temp_xml_path)


def test_parse_mybatis_dbio_file_extension():
    """DBIO 파일 파싱 시 file_extension이 올바르게 추출되는지 테스트"""
    dbio_content = """<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
  "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="com.example.mapper.ProductMapper">
    <insert id="insertProduct" parameterType="Product">
        INSERT INTO products (name, price) VALUES (#{name}, #{price})
    </insert>
</mapper>
"""

    # 임시 DBIO 파일 생성
    with tempfile.NamedTemporaryFile(mode='w', suffix='.dbio', delete=False, encoding='utf-8') as f:
        f.write(dbio_content)
        temp_dbio_path = f.name

    try:
        mapper = parse_mybatis_xml_file(temp_dbio_path)

        assert mapper is not None
        assert mapper.file_extension == "dbio"
        assert mapper.type == "xml"
        assert mapper.name == "ProductMapper"
        assert mapper.file_path == temp_dbio_path
    finally:
        # 임시 파일 삭제
        if os.path.exists(temp_dbio_path):
            os.unlink(temp_dbio_path)


def test_extract_mybatis_mappers_from_java_classes():
    """Java 인터페이스 매퍼에서 file_extension이 올바르게 추출되는지 테스트"""

    # @Mapper 어노테이션이 있는 Java 클래스 모의 객체 생성
    test_class = Class(
        name="OrderMapper",
        file_path="/path/to/OrderMapper.java",
        type="interface",
        package_name="com.example.mapper",
        annotations=[
            Annotation(name="Mapper", parameters={}, category="mybatis")
        ],
        methods=[]
    )

    mappers = extract_mybatis_mappers_from_classes([test_class])

    assert len(mappers) == 1
    mapper = mappers[0]

    assert mapper.name == "OrderMapper"
    assert mapper.file_extension == "java"
    assert mapper.type == "interface"
    assert mapper.file_path == "/path/to/OrderMapper.java"
    assert mapper.namespace == "com.example.mapper.OrderMapper"


def test_extract_mybatis_mappers_file_extension_empty():
    """file_path가 비어있을 때 file_extension이 빈 문자열인지 테스트"""

    test_class = Class(
        name="EmptyMapper",
        file_path="",  # 빈 파일 경로
        type="interface",
        package_name="com.example.mapper",
        annotations=[
            Annotation(name="Mapper", parameters={}, category="mybatis")
        ],
        methods=[]
    )

    mappers = extract_mybatis_mappers_from_classes([test_class])

    assert len(mappers) == 1
    mapper = mappers[0]

    assert mapper.name == "EmptyMapper"
    assert mapper.file_extension == ""
    assert mapper.file_path == ""


if __name__ == "__main__":
    pytest.main([__file__, "-v"])
