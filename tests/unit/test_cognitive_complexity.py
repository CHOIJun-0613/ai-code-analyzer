"""
Cognitive Complexity Calculator 유닛 테스트
"""

import pytest
from csa.utils.cognitive_complexity import calculate_class_cognitive_complexity


def test_simple_class_no_complexity():
    """복잡도가 없는 간단한 클래스를 테스트합니다."""
    source = """
public class SimpleClass {
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}"""

    complexity = calculate_class_cognitive_complexity(source)

    assert complexity == 0, "간단한 getter/setter는 복잡도가 0이어야 합니다"


def test_class_with_if_statement():
    """if 문이 포함된 클래스를 테스트합니다."""
    source = """
public class ConditionalClass {
    public String checkValue(int value) {
        if (value > 0) {
            return "positive";
        } else {
            return "negative";
        }
    }
}"""

    complexity = calculate_class_cognitive_complexity(source)

    assert complexity > 0, "if 문이 있으면 복잡도가 증가해야 합니다"


def test_class_with_loop():
    """반복문이 포함된 클래스를 테스트합니다."""
    source = """
public class LoopClass {
    public int sum(int[] numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }
}"""

    complexity = calculate_class_cognitive_complexity(source)

    assert complexity > 0, "for 루프가 있으면 복잡도가 증가해야 합니다"


def test_class_with_nested_conditions():
    """중첩된 조건문이 포함된 클래스를 테스트합니다."""
    source = """
public class NestedClass {
    public String checkValue(int value) {
        if (value > 0) {
            if (value > 10) {
                return "big positive";
            }
            return "small positive";
        }
        return "negative";
    }
}"""

    complexity = calculate_class_cognitive_complexity(source)

    # 중첩된 조건문은 더 높은 복잡도를 가져야 함
    assert complexity > 1, "중첩된 if 문은 더 높은 복잡도를 가져야 합니다"


def test_class_with_switch_statement():
    """switch 문이 포함된 클래스를 테스트합니다."""
    source = """
public class SwitchClass {
    public String getDayName(int day) {
        switch (day) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            default:
                return "Unknown";
        }
    }
}"""

    complexity = calculate_class_cognitive_complexity(source)

    assert complexity > 0, "switch 문이 있으면 복잡도가 증가해야 합니다"


def test_empty_source():
    """빈 소스 코드를 테스트합니다."""
    complexity = calculate_class_cognitive_complexity("")

    assert complexity == 0, "빈 소스는 복잡도가 0이어야 합니다"


def test_class_with_multiple_methods():
    """여러 메서드가 있는 클래스를 테스트합니다."""
    source = """
public class MultiMethodClass {
    public boolean isPositive(int value) {
        if (value > 0) {
            return true;
        }
        return false;
    }

    public boolean isEven(int value) {
        if (value % 2 == 0) {
            return true;
        }
        return false;
    }
}"""

    complexity = calculate_class_cognitive_complexity(source)

    # 두 메서드 모두 if 문을 포함하므로 복잡도가 2 이상이어야 함
    assert complexity >= 2, "여러 메서드의 복잡도가 합산되어야 합니다"


if __name__ == "__main__":
    pytest.main([__file__, "-v"])
