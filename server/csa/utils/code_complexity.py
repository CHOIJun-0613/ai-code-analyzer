"""
Code Complexity 계산 모듈

Java 클래스의 코드 복잡도를 계산합니다.
Code Complexity는 라인수, 필드, 메서드 수 등을 종합하여 분석 및 유지보수 난이도를 수치화한 지표입니다.

계산 공식:
    code_complexity = lines*1 + fields*2 + methods*5 + inner_classes*10 + annotations*1

주요 규칙:
1. 라인 수 (1점/라인): 전체 줄 바꿈(\n) 개수
2. 필드 수 (2점/필드): private, public, protected 키워드 개수
3. 메서드 수 (5점/메서드): private, public, protected 키워드 개수
4. Inner Class 수 (10점/클래스): static class, class 키워드 개수
5. 어노테이션 수 (1점/어노테이션): @ 심볼 개수
"""

import re
from typing import Optional


def calculate_code_complexity(source_code: str) -> int:
    """
    Java 소스 코드로부터 Code Complexity를 계산합니다.

    Args:
        source_code: Java 소스 코드 문자열

    Returns:
        int: Code Complexity 점수
    """
    if not source_code:
        return 0

    # 1. 라인 수 (1점/라인)
    lines = source_code.count('\n')

    # 2. 필드 수 (2점/필드)
    # private, public, protected 키워드 다음에 타입과 변수명이 오는 패턴
    # 단, 메서드 선언이 아닌 경우만 (괄호가 없는 경우)
    field_pattern = r'\b(private|public|protected)\s+(?:static\s+)?(?:final\s+)?[\w<>\[\],\s]+\s+\w+\s*(?:=|;)'
    fields = len(re.findall(field_pattern, source_code))

    # 3. 메서드 수 (5점/메서드)
    # private, public, protected 키워드 다음에 반환 타입과 메서드명(괄호 포함)이 오는 패턴
    method_pattern = r'\b(private|public|protected)\s+(?:static\s+)?(?:final\s+)?(?:synchronized\s+)?[\w<>\[\],\s]+\s+\w+\s*\('
    methods = len(re.findall(method_pattern, source_code))

    # 4. Inner Class 수 (10점/클래스)
    # 클래스 선언 패턴 (top-level 제외를 위해 들여쓰기가 있는 경우)
    # static class, class 키워드 (interface, enum 포함)
    inner_class_pattern = r'\s+(static\s+)?(class|interface|enum)\s+\w+'
    inner_classes = len(re.findall(inner_class_pattern, source_code))

    # 5. 어노테이션 수 (1점/어노테이션)
    annotations = source_code.count('@')

    # 복잡도 계산
    complexity = (
        lines * 1 +
        fields * 2 +
        methods * 5 +
        inner_classes * 10 +
        annotations * 1
    )

    return complexity


def calculate_code_complexity_from_components(
    lines: int,
    fields: int,
    methods: int,
    inner_classes: int,
    annotations: int
) -> int:
    """
    개별 구성 요소로부터 Code Complexity를 계산합니다.

    Args:
        lines: 라인 수
        fields: 필드 수
        methods: 메서드 수
        inner_classes: Inner class 수
        annotations: 어노테이션 수

    Returns:
        int: Code Complexity 점수
    """
    complexity = (
        lines * 1 +
        fields * 2 +
        methods * 5 +
        inner_classes * 10 +
        annotations * 1
    )
    return complexity


def calculate_code_complexity_from_class_node(class_node) -> int:
    """
    Class 노드 객체로부터 Code Complexity를 계산합니다.

    Args:
        class_node: Class 모델 인스턴스

    Returns:
        int: Code Complexity 점수
    """
    lines = class_node.PLOC if hasattr(class_node, 'PLOC') else 0
    fields = len(class_node.properties) if hasattr(class_node, 'properties') else 0
    methods = len(class_node.methods) if hasattr(class_node, 'methods') else 0

    # Inner class 수 계산 (소스 코드에서 직접 카운트)
    inner_classes = 0
    if hasattr(class_node, 'source') and class_node.source:
        inner_class_pattern = r'\s+(static\s+)?(class|interface|enum)\s+\w+'
        inner_classes = len(re.findall(inner_class_pattern, class_node.source))

    # 어노테이션 수
    annotations = len(class_node.annotations) if hasattr(class_node, 'annotations') else 0

    return calculate_code_complexity_from_components(
        lines=lines,
        fields=fields,
        methods=methods,
        inner_classes=inner_classes,
        annotations=annotations
    )


class CodeComplexityCalculator:
    """Code Complexity 계산을 위한 헬퍼 클래스"""

    @staticmethod
    def estimate_from_source(source_code: str) -> int:
        """
        소스 코드로부터 Code Complexity를 추정합니다.

        Args:
            source_code: Java 소스 코드

        Returns:
            int: 추정된 Code Complexity
        """
        return calculate_code_complexity(source_code)

    @staticmethod
    def estimate_from_components(
        lines: int = 0,
        fields: int = 0,
        methods: int = 0,
        inner_classes: int = 0,
        annotations: int = 0
    ) -> int:
        """
        개별 구성 요소로부터 Code Complexity를 추정합니다.

        Args:
            lines: 라인 수
            fields: 필드 수
            methods: 메서드 수
            inner_classes: Inner class 수
            annotations: 어노테이션 수

        Returns:
            int: 추정된 Code Complexity
        """
        return calculate_code_complexity_from_components(
            lines, fields, methods, inner_classes, annotations
        )

    @staticmethod
    def get_complexity_level(complexity: int) -> str:
        """
        복잡도 점수에 따른 레벨을 반환합니다.

        Args:
            complexity: Code Complexity 점수

        Returns:
            str: 복잡도 레벨 ('low', 'moderate', 'high', 'very_high')
        """
        if complexity < 1000:
            return 'low'
        elif complexity < 5000:
            return 'moderate'
        elif complexity < 10000:
            return 'high'
        else:
            return 'very_high'

    @staticmethod
    def should_skip_file(complexity: int, threshold: int = 50000) -> bool:
        """
        복잡도가 임계값을 초과하여 파일을 건너뛰어야 하는지 판단합니다.

        Args:
            complexity: Code Complexity 점수
            threshold: 임계값 (기본값: 50000)

        Returns:
            bool: 건너뛰어야 하면 True
        """
        return complexity > threshold
