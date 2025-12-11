"""
LOC Calculator 유닛 테스트
"""

import pytest
from csa.utils.loc_calculator import calculate_loc, LOCMetrics


def test_calculate_loc_simple():
    """간단한 Java 코드의 LOC를 계산합니다."""
    source = """package com.example;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}"""

    result = calculate_loc(source)

    assert result.ploc == 7  # 전체 라인 수
    assert result.cloc == 0  # 주석 없음
    assert result.lloc > 0   # 실행 가능한 코드가 있음


def test_calculate_loc_with_comments():
    """주석이 포함된 Java 코드의 LOC를 계산합니다."""
    source = """package com.example;

// 단일 라인 주석
public class HelloWorld {
    /*
     * 멀티라인 주석
     * 두 번째 라인
     */
    public static void main(String[] args) {
        System.out.println("Hello, World!"); // 코드와 주석 섞임
    }
}"""

    result = calculate_loc(source)

    assert result.ploc == 12  # 전체 라인 수
    assert result.cloc >= 3   # 주석 라인 최소 3개
    assert result.lloc > 0    # 실행 가능한 코드가 있음


def test_calculate_loc_empty():
    """빈 소스 코드의 LOC를 계산합니다."""
    result = calculate_loc("")

    assert result.ploc == 0
    assert result.cloc == 0
    assert result.lloc == 0


def test_calculate_loc_only_whitespace():
    """공백만 있는 소스 코드의 LOC를 계산합니다."""
    source = """



"""

    result = calculate_loc(source)

    assert result.ploc == 5  # 빈 라인 포함 전체 라인
    assert result.cloc == 0  # 주석 없음
    assert result.lloc == 0  # 실행 가능한 코드 없음


def test_calculate_loc_javadoc():
    """JavaDoc 주석이 포함된 코드의 LOC를 계산합니다."""
    source = """package com.example;

/**
 * HelloWorld 클래스
 * @author John Doe
 */
public class HelloWorld {
    /**
     * 메인 메서드
     * @param args 커맨드라인 인자
     */
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}"""

    result = calculate_loc(source)

    assert result.ploc >= 14  # 전체 라인 수 (최소값)
    assert result.cloc >= 6   # JavaDoc 주석 라인
    assert result.lloc > 0    # 실행 가능한 코드가 있음


def test_loc_metrics_to_dict():
    """LOCMetrics의 to_dict 메서드를 테스트합니다."""
    metrics = LOCMetrics(100, 80, 15)

    result = metrics.to_dict()

    assert result['PLOC'] == 100
    assert result['LLOC'] == 80
    assert result['CLOC'] == 15


if __name__ == "__main__":
    pytest.main([__file__, "-v"])
