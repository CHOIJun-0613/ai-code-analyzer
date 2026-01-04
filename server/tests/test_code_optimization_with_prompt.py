"""
AI Analyzer의 프롬프트를 포함한 전체 입력 크기 최적화 로직을 테스트합니다.
"""
import sys
from pathlib import Path
import asyncio

# 프로젝트 루트를 sys.path에 추가
project_root = Path(__file__).parent.parent
sys.path.insert(0, str(project_root))

from csa.aiwork.ai_analyzer import AIAnalyzer
from csa.aiwork.prompt import get_prompt


def test_prompt_overhead_calculation():
    """프롬프트 오버헤드 계산이 정확한지 테스트"""
    print("=== Test 1: Prompt Overhead Calculation ===")

    # 프롬프트 가져오기
    class_prompt = get_prompt("class_doc")
    method_prompt = get_prompt("method_doc")
    sql_prompt = get_prompt("sql_doc")

    # 마크다운 오버헤드
    java_overhead = len('\n\n```java\n') + len('\n```')
    sql_overhead = len('\n\n```sql\n') + len('\n```')

    print(f"class_doc 프롬프트: {len(class_prompt)} chars")
    print(f"  + Java 마크다운: {java_overhead} chars")
    print(f"  = 총 오버헤드: {len(class_prompt) + java_overhead} chars")
    print()

    print(f"method_doc 프롬프트: {len(method_prompt)} chars")
    print(f"  + Java 마크다운: {java_overhead} chars")
    print(f"  = 총 오버헤드: {len(method_prompt) + java_overhead} chars")
    print()

    print(f"sql_doc 프롬프트: {len(sql_prompt)} chars")
    print(f"  + SQL 마크다운: {sql_overhead} chars")
    print(f"  = 총 오버헤드: {len(sql_prompt) + sql_overhead} chars")
    print()

    # 소스 코드 최대 크기 계산
    max_total_chars = 30000
    class_source_max = max_total_chars - len(class_prompt) - java_overhead
    method_source_max = max_total_chars - len(method_prompt) - java_overhead
    sql_max = max_total_chars - len(sql_prompt) - sql_overhead

    print(f"최대 입력 제한: {max_total_chars} chars")
    print(f"class 소스 코드 최대: {class_source_max} chars")
    print(f"method 소스 코드 최대: {method_source_max} chars")
    print(f"SQL 최대: {sql_max} chars")
    print()

    # 검증
    assert class_source_max > 0, "class 소스 코드 최대 크기가 0보다 커야 함"
    assert method_source_max > 0, "method 소스 코드 최대 크기가 0보다 커야 함"
    assert sql_max > 0, "SQL 최대 크기가 0보다 커야 함"

    print("[PASS] Prompt Overhead Calculation 테스트 성공\n")
    return class_source_max, method_source_max, sql_max


def test_total_input_size():
    """전체 입력 크기가 제한을 초과하지 않는지 테스트"""
    print("=== Test 2: Total Input Size Verification ===")

    analyzer = AIAnalyzer()

    # 프롬프트 가져오기
    prompt = get_prompt("class_doc")
    markdown_overhead = len('\n\n```java\n') + len('\n```')
    prompt_overhead = len(prompt) + markdown_overhead

    # 전체 입력 제한
    max_total_chars = 30000

    # 소스 코드 최대 크기
    source_code_max = max_total_chars - prompt_overhead

    print(f"전체 입력 제한: {max_total_chars} chars")
    print(f"프롬프트 오버헤드: {prompt_overhead} chars")
    print(f"소스 코드 최대: {source_code_max} chars")
    print()

    # 큰 소스 코드 생성
    large_code = """
public class LargeClass {
    private String name;

    public void processData(String input) {
""" + ("        String line = \"data\" + i;\n" * 5000) + """
        return result;
    }
}
"""

    print(f"원본 소스 코드 크기: {len(large_code)} chars")

    # 최적화
    optimized_code, optimization_level = analyzer._optimize_source_code(
        large_code,
        max_chars=source_code_max
    )

    print(f"최적화 후 크기: {len(optimized_code)} chars")
    print(f"최적화 레벨: {optimization_level}")

    # 전체 입력 텍스트 생성
    input_text = f"{prompt}\n\n```java\n{optimized_code}\n```"
    total_size = len(input_text)

    print(f"전체 입력 크기: {total_size} chars")
    print(f"제한 준수 여부: {total_size <= max_total_chars}")
    print()

    # 검증
    assert total_size <= max_total_chars, \
        f"전체 입력 크기가 제한을 초과함 ({total_size} > {max_total_chars})"

    print("[PASS] Total Input Size Verification 테스트 성공\n")


def test_realistic_scenario():
    """실제 시나리오: 대용량 Service 클래스 + 프롬프트"""
    print("=== Test 3: Realistic Scenario (Service Class + Prompt) ===")

    analyzer = AIAnalyzer()

    # 프롬프트 가져오기
    prompt = get_prompt("class_doc")
    markdown_overhead = len('\n\n```java\n') + len('\n```')
    prompt_overhead = len(prompt) + markdown_overhead

    max_total_chars = 30000
    source_code_max = max_total_chars - prompt_overhead

    # 실제 Spring Service 클래스 시뮬레이션
    service_class = """
package com.example.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class UserService {
    private final UserRepository userRepository;
    private final EmailService emailService;

    public UserDto createUser(UserCreateRequest request) {
""" + ("        // Complex validation and processing\n" * 2000) + """
        return userDto;
    }

    public Optional<UserDto> getUserById(Long id) {
""" + ("        // Repository access\n" * 1000) + """
        return Optional.of(userDto);
    }
}
"""

    print(f"원본 Service 클래스 크기: {len(service_class)} chars")
    print(f"프롬프트 오버헤드: {prompt_overhead} chars")
    print(f"소스 코드 최대: {source_code_max} chars")
    print()

    # 최적화
    optimized_code, optimization_level = analyzer._optimize_source_code(
        service_class,
        max_chars=source_code_max
    )

    print(f"최적화 후 크기: {len(optimized_code)} chars")
    print(f"최적화 레벨: {optimization_level}")

    # 전체 입력 생성
    input_text = f"{prompt}\n\n```java\n{optimized_code}\n```"
    total_size = len(input_text)

    print(f"전체 입력 크기: {total_size} chars")
    print(f"제한 준수 여부: {total_size <= max_total_chars}")
    print()

    # 검증
    assert total_size <= max_total_chars, \
        f"전체 입력 크기가 제한을 초과함 ({total_size} > {max_total_chars})"

    # 메서드 시그니처 보존 확인
    assert "UserService" in optimized_code, "클래스명 보존 확인"
    assert "createUser" in optimized_code, "메서드 시그니처 보존 확인"

    print("[PASS] Realistic Scenario 테스트 성공\n")


def test_edge_case_exact_limit():
    """경계 케이스: 정확히 제한에 맞는 소스 코드"""
    print("=== Test 4: Edge Case (Exact Limit) ===")

    analyzer = AIAnalyzer()

    # 프롬프트 가져오기
    prompt = get_prompt("class_doc")
    markdown_overhead = len('\n\n```java\n') + len('\n```')
    prompt_overhead = len(prompt) + markdown_overhead

    max_total_chars = 30000
    source_code_max = max_total_chars - prompt_overhead

    # 정확히 source_code_max 크기의 코드 생성
    exact_code = "public class ExactClass {\n"
    exact_code += "    // " + "X" * (source_code_max - len(exact_code) - 3)
    exact_code += "\n}"

    print(f"소스 코드 크기: {len(exact_code)} chars")
    print(f"소스 코드 최대: {source_code_max} chars")
    print(f"차이: {len(exact_code) - source_code_max} chars")
    print()

    # 최적화 (최적화 없이 통과해야 함)
    optimized_code, optimization_level = analyzer._optimize_source_code(
        exact_code,
        max_chars=source_code_max
    )

    print(f"최적화 레벨: {optimization_level}")

    # 검증
    if len(exact_code) <= source_code_max:
        assert optimization_level == "none", "정확히 제한 이내면 최적화 불필요"
        print("[PASS] Edge Case 테스트 성공 (최적화 없음)\n")
    else:
        assert optimization_level != "none", "제한 초과 시 최적화 필요"
        print("[PASS] Edge Case 테스트 성공 (최적화 적용)\n")


def main():
    """모든 테스트 실행"""
    print("=" * 60)
    print("프롬프트 포함 전체 입력 크기 최적화 테스트")
    print("=" * 60 + "\n")

    try:
        test_prompt_overhead_calculation()
        test_total_input_size()
        test_realistic_scenario()
        test_edge_case_exact_limit()

        print("=" * 60)
        print("[SUCCESS] 모든 테스트 통과!")
        print("=" * 60)

    except AssertionError as e:
        print(f"\n[FAIL] 테스트 실패: {e}")
        sys.exit(1)
    except Exception as e:
        print(f"\n[ERROR] 예외 발생: {e}")
        import traceback
        traceback.print_exc()
        sys.exit(1)


if __name__ == "__main__":
    main()
