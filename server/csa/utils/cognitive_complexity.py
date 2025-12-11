"""
Cognitive Complexity 계산 모듈

SonarSource의 Cognitive Complexity 메트릭을 계산합니다.
Cognitive Complexity는 코드가 사람이 이해하고 유지보수하기에 얼마나 어려운지를 측정하는 지표입니다.

참고: https://www.sonarsource.com/resources/cognitive-complexity/

주요 규칙:
1. 제어 구조마다 +1 (if, for, while, catch 등)
2. 중첩된 제어 구조는 중첩 레벨만큼 추가 점수
3. 논리 연산자 시퀀스마다 +1 (&&, ||)
4. 재귀 호출 +1
"""

from typing import Any, Optional
from csa.vendor import javalang


class CognitiveComplexityCalculator:
    """Cognitive Complexity를 계산하는 클래스"""

    def __init__(self):
        self.complexity = 0
        self.nesting_level = 0

    def calculate(self, tree: Any) -> int:
        """
        Java AST로부터 Cognitive Complexity를 계산합니다.

        Args:
            tree: javalang AST 트리

        Returns:
            int: Cognitive Complexity 점수
        """
        self.complexity = 0
        self.nesting_level = 0

        if tree:
            self._visit(tree)

        return self.complexity

    def _visit(self, node: Any):
        """AST 노드를 재귀적으로 방문하며 복잡도를 계산합니다."""
        if node is None:
            return

        # 노드 타입에 따른 복잡도 계산
        node_type = type(node).__name__

        # 제어 구조 체크
        if self._is_control_flow_statement(node):
            # 기본 +1 + 중첩 레벨
            increment = 1 + self.nesting_level
            self.complexity += increment

            # 중첩 레벨 증가
            self.nesting_level += 1
            self._visit_children(node)
            self.nesting_level -= 1
            return

        # else if, else 처리
        if node_type == 'IfStatement' and hasattr(node, 'else_statement'):
            # if 처리
            self.complexity += 1 + self.nesting_level
            self.nesting_level += 1
            self._visit_children(node.then_statement if hasattr(node, 'then_statement') else None)
            self.nesting_level -= 1

            # else 처리
            if node.else_statement:
                # else if는 +1, 단순 else는 +0
                if isinstance(node.else_statement, javalang.tree.IfStatement):
                    # else if로 처리 (재귀)
                    self._visit(node.else_statement)
                else:
                    # 단순 else는 복잡도 증가 없음, 중첩만 증가
                    self.nesting_level += 1
                    self._visit(node.else_statement)
                    self.nesting_level -= 1
            return

        # switch 문의 case는 복잡도 증가 없음 (switch 자체만 +1)
        if node_type == 'SwitchStatement':
            self.complexity += 1 + self.nesting_level
            self.nesting_level += 1
            self._visit_children(node)
            self.nesting_level -= 1
            return

        # 논리 연산자 체크 (&&, ||)
        if node_type == 'BinaryOperation' and hasattr(node, 'operator'):
            if node.operator in ('&&', '||'):
                # 같은 연산자가 연속되지 않으면 +1
                self.complexity += 1

        # 재귀 호출 체크는 메서드 이름과 클래스 정보가 필요하므로 상위에서 처리
        # (여기서는 간단하게 구현)

        # 자식 노드 방문
        self._visit_children(node)

    def _is_control_flow_statement(self, node: Any) -> bool:
        """제어 흐름 구문인지 체크합니다."""
        node_type = type(node).__name__

        control_flow_types = [
            'IfStatement',
            'ForStatement',
            'WhileStatement',
            'DoStatement',
            'TernaryExpression',
            'CatchClause',
            # break, continue with label
        ]

        return node_type in control_flow_types

    def _visit_children(self, node: Any):
        """노드의 자식을 방문합니다."""
        if node is None:
            return

        if isinstance(node, list):
            for child in node:
                self._visit(child)
        elif hasattr(node, '__dict__'):
            for attr_name, attr_value in node.__dict__.items():
                if attr_name.startswith('_'):
                    continue
                if isinstance(attr_value, list):
                    for item in attr_value:
                        self._visit(item)
                else:
                    self._visit(attr_value)


def calculate_cognitive_complexity(tree: Any) -> int:
    """
    Java AST로부터 Cognitive Complexity를 계산합니다.

    Args:
        tree: javalang AST 트리 (CompilationUnit 또는 MethodDeclaration)

    Returns:
        int: Cognitive Complexity 점수
    """
    calculator = CognitiveComplexityCalculator()
    return calculator.calculate(tree)


def calculate_class_cognitive_complexity(source_code: str) -> int:
    """
    Java 소스 코드로부터 클래스 전체의 Cognitive Complexity를 계산합니다.

    Args:
        source_code: Java 소스 코드 문자열

    Returns:
        int: Cognitive Complexity 점수
    """
    if not source_code:
        return 0

    try:
        tree = javalang.parse.parse(source_code)
        return calculate_cognitive_complexity(tree)
    except Exception:
        # 파싱 실패 시 0 반환
        return 0


def calculate_method_cognitive_complexity(method_node: Any) -> int:
    """
    메서드 노드로부터 Cognitive Complexity를 계산합니다.

    Args:
        method_node: javalang MethodDeclaration 노드

    Returns:
        int: Cognitive Complexity 점수
    """
    if not method_node:
        return 0

    calculator = CognitiveComplexityCalculator()
    return calculator.calculate(method_node)


# 클래스의 모든 메서드 복잡도를 합산하여 클래스 복잡도 계산
def calculate_class_complexity_from_methods(class_tree: Any) -> int:
    """
    클래스의 모든 메서드 복잡도를 합산합니다.

    Args:
        class_tree: javalang ClassDeclaration 노드

    Returns:
        int: 클래스 전체 Cognitive Complexity 점수
    """
    if not class_tree or not hasattr(class_tree, 'body'):
        return 0

    total_complexity = 0

    for declaration in class_tree.body:
        if isinstance(declaration, javalang.tree.MethodDeclaration):
            complexity = calculate_method_cognitive_complexity(declaration)
            total_complexity += complexity

    return total_complexity
