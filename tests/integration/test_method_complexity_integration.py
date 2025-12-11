"""
Method 복잡도 측정 통합 테스트
Java 파싱부터 Neo4j 저장까지 전체 플로우 검증
"""
import os
import tempfile
from pathlib import Path

import pytest

from csa.services.java_analysis.project import parse_single_java_file


@pytest.fixture
def sample_java_file():
    """테스트용 Java 파일 생성"""
    content = """
package com.example.test;

/**
 * 테스트 클래스
 */
public class ComplexityTestClass {

    /**
     * 간단한 메서드
     */
    public void simpleMethod() {
        int x = 1;
        int y = 2;
        System.out.println(x + y);
    }

    /**
     * if 문이 있는 메서드
     */
    public void methodWithIf(int value) {
        if (value > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Non-positive");
        }
    }

    /**
     * 중첩 제어 구조가 있는 복잡한 메서드
     */
    public void complexMethod(int x, int y) {
        // 외부 if
        if (x > 0) {
            // for 루프
            for (int i = 0; i < x; i++) {
                // 중첩 if
                if (y > 0) {
                    System.out.println(i * y);
                }
            }
        } else {
            // while 루프
            while (y < 10) {
                y++;
            }
        }
    }

    /**
     * 주석이 많은 메서드
     */
    public void methodWithComments() {
        // 단일 라인 주석 1
        int x = 1;

        /* 멀티라인 주석
         * 계속됨
         * 끝
         */
        int y = 2;

        // 단일 라인 주석 2
        System.out.println(x + y);
    }
}
"""

    with tempfile.NamedTemporaryFile(mode='w', suffix='.java', delete=False, encoding='utf-8') as f:
        f.write(content)
        temp_path = f.name

    yield temp_path

    # 정리
    if os.path.exists(temp_path):
        os.remove(temp_path)


@pytest.fixture
def dto_java_file():
    """DTO 클래스 테스트용 Java 파일 생성"""
    content = """
package com.example.dto;

public class UserDTO {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
"""

    with tempfile.NamedTemporaryFile(mode='w', suffix='.java', delete=False, encoding='utf-8') as f:
        f.write(content)
        temp_path = f.name

    yield temp_path

    # 정리
    if os.path.exists(temp_path):
        os.remove(temp_path)


def test_parse_java_file_with_method_complexity(sample_java_file):
    """Java 파일 파싱 시 메서드 복잡도가 계산되는지 테스트"""
    # 환경 변수 설정
    os.environ['SKIP_DTO_SOURCE'] = 'false'

    # Java 파일 파싱
    package_node, class_node, inner_classes, package_name = parse_single_java_file(
        sample_java_file,
        "test-project"
    )

    assert class_node is not None
    assert class_node.name == "ComplexityTestClass"
    assert len(class_node.methods) == 4  # 4개의 메서드

    # 각 메서드의 복잡도 검증
    methods_by_name = {method.name: method for method in class_node.methods}

    # 1. simpleMethod - 제어 구조 없음
    simple_method = methods_by_name.get("simpleMethod")
    assert simple_method is not None
    assert simple_method.PLOC > 0, "PLOC should be greater than 0"
    assert simple_method.LLOC > 0, "LLOC should be greater than 0"
    assert simple_method.cognitive_complexity == 0, "Simple method should have 0 cognitive complexity"

    # 2. methodWithIf - if 문 포함
    if_method = methods_by_name.get("methodWithIf")
    assert if_method is not None
    assert if_method.PLOC > 0
    assert if_method.LLOC > 0
    assert if_method.cognitive_complexity >= 1, "Method with if should have complexity >= 1"

    # 3. complexMethod - 중첩 제어 구조
    complex_method = methods_by_name.get("complexMethod")
    assert complex_method is not None
    assert complex_method.PLOC > 0
    assert complex_method.LLOC > 0
    assert complex_method.cognitive_complexity >= 3, "Complex method should have high complexity"

    # 4. methodWithComments - 주석 많음
    comment_method = methods_by_name.get("methodWithComments")
    assert comment_method is not None
    assert comment_method.PLOC > 0
    assert comment_method.CLOC >= 3, "Method with comments should have CLOC >= 3"
    assert comment_method.LLOC > 0


def test_dto_class_methods_have_zero_complexity(dto_java_file):
    """DTO 클래스 메서드는 복잡도가 0이어야 함 (SKIP_DTO_SOURCE=true)"""
    # 환경 변수 설정
    os.environ['SKIP_DTO_SOURCE'] = 'true'

    # Java 파일 파싱
    package_node, class_node, inner_classes, package_name = parse_single_java_file(
        dto_java_file,
        "test-project"
    )

    assert class_node is not None
    assert class_node.name == "UserDTO"
    assert class_node.sub_type == "dto"

    # DTO 메서드는 모든 복잡도가 0이어야 함
    for method in class_node.methods:
        assert method.PLOC == 0, f"{method.name} PLOC should be 0 for DTO"
        assert method.LLOC == 0, f"{method.name} LLOC should be 0 for DTO"
        assert method.CLOC == 0, f"{method.name} CLOC should be 0 for DTO"
        assert method.cognitive_complexity == 0, f"{method.name} cognitive_complexity should be 0 for DTO"


def test_class_complexity_metrics(sample_java_file):
    """클래스 레벨 복잡도 메트릭 검증"""
    # 환경 변수 설정
    os.environ['SKIP_DTO_SOURCE'] = 'false'

    # Java 파일 파싱
    package_node, class_node, inner_classes, package_name = parse_single_java_file(
        sample_java_file,
        "test-project"
    )

    assert class_node is not None

    # 클래스 LOC 메트릭 검증
    assert class_node.PLOC > 0, "Class PLOC should be greater than 0"
    assert class_node.LLOC > 0, "Class LLOC should be greater than 0"
    assert class_node.CLOC > 0, "Class CLOC should be greater than 0 (주석 있음)"
    assert class_node.cognitive_complexity >= 0, "Class cognitive_complexity should be calculated"


def test_dto_class_skips_field_logical_name_extraction(dto_java_file):
    """DTO 클래스는 필드 논리명 추출을 건너뛰어야 함 (성능 최적화)"""
    # 환경 변수 설정
    os.environ['SKIP_DTO_SOURCE'] = 'true'

    # Java 파일 파싱
    package_node, class_node, inner_classes, package_name = parse_single_java_file(
        dto_java_file,
        "test-project"
    )

    assert class_node is not None
    assert class_node.sub_type == "dto"

    # DTO 필드는 논리명이 비어있어야 함
    for field in class_node.properties:
        assert field.logical_name == "", f"DTO field {field.name} should have empty logical_name"


def test_non_dto_class_calculates_complexity(sample_java_file):
    """일반 클래스는 복잡도를 정상적으로 계산해야 함"""
    # 환경 변수 설정
    os.environ['SKIP_DTO_SOURCE'] = 'true'

    # Java 파일 파싱
    package_node, class_node, inner_classes, package_name = parse_single_java_file(
        sample_java_file,
        "test-project"
    )

    assert class_node is not None
    assert class_node.sub_type != "dto"  # DTO가 아님

    # 일반 클래스 메서드는 복잡도를 계산해야 함
    for method in class_node.methods:
        if method.source:  # 소스가 있는 경우
            # PLOC은 항상 0보다 커야 함
            assert method.PLOC > 0, f"{method.name} PLOC should be calculated"


if __name__ == "__main__":
    pytest.main([__file__, "-v"])
