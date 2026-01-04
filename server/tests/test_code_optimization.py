"""
AI Analyzer의 소스 코드 최적화 로직을 테스트합니다.
"""
import sys
from pathlib import Path

# 프로젝트 루트를 sys.path에 추가
project_root = Path(__file__).parent.parent
sys.path.insert(0, str(project_root))

from csa.aiwork.ai_analyzer import AIAnalyzer


def test_pass_through():
    """작은 소스 코드는 그대로 통과하는지 테스트"""
    print("=== Test 1: Pass-through (작은 코드) ===")

    analyzer = AIAnalyzer()
    small_code = """
public class SmallClass {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
"""

    optimized, level = analyzer._optimize_source_code(small_code, max_chars=30000)

    print(f"원본 크기: {len(small_code)} chars")
    print(f"최적화 후: {len(optimized)} chars")
    print(f"최적화 레벨: {level}")
    assert level == "none", f"Expected 'none', got '{level}'"
    assert optimized == small_code, "Small code should not be modified"
    print("[PASS] Pass-through 테스트 성공\n")


def test_body_stripping():
    """큰 소스 코드는 메서드 Body가 제거되는지 테스트"""
    print("=== Test 2: Body Stripping (큰 코드) ===")

    analyzer = AIAnalyzer()

    # 큰 메서드를 포함한 코드 생성 (30,000자 초과)
    large_code = """
public class LargeClass {
    private String name;
    private int age;

    public String processData(String input) {
        // Very long method body
""" + ("        String line = \"data\" + i;\n" * 5000) + """
        return result;
    }

    public void anotherMethod() {
""" + ("        // More code\n" * 1000) + """
    }
}
"""

    optimized, level = analyzer._optimize_source_code(large_code, max_chars=30000)

    print(f"원본 크기: {len(large_code)} chars")
    print(f"최적화 후: {len(optimized)} chars")
    print(f"최적화 레벨: {level}")
    print(f"감소율: {(1 - len(optimized)/len(large_code))*100:.1f}%")

    # Body Stripping이 적용되었거나 Truncation이 적용됨
    assert level in ["body_stripped", "truncated"], f"Expected 'body_stripped' or 'truncated', got '{level}'"
    assert len(optimized) < len(large_code), "Optimized code should be smaller"

    # 메서드 시그니처는 남아있어야 함
    assert "processData" in optimized, "Method signature should be preserved"

    print("[PASS] Body Stripping 테스트 성공\n")


def test_truncation():
    """매우 큰 소스 코드는 Truncation이 적용되는지 테스트"""
    print("=== Test 3: Truncation (매우 큰 코드) ===")

    analyzer = AIAnalyzer()

    # 매우 큰 코드 생성 (100,000자 이상)
    very_large_code = "public class HugeClass {\n"
    for i in range(10000):
        very_large_code += f"    private String field{i};\n"
    very_large_code += "\n}"

    optimized, level = analyzer._optimize_source_code(very_large_code, max_chars=30000)

    print(f"원본 크기: {len(very_large_code)} chars")
    print(f"최적화 후: {len(optimized)} chars")
    print(f"최적화 레벨: {level}")
    print(f"감소율: {(1 - len(optimized)/len(very_large_code))*100:.1f}%")

    # 최종적으로는 max_chars 이내로 줄어들어야 함
    assert len(optimized) <= 30000, f"Optimized code should be <= 30000 chars, got {len(optimized)}"
    assert level in ["body_stripped", "truncated"], f"Expected optimization, got '{level}'"

    # Truncation 마커가 있어야 함 (truncated인 경우)
    if level == "truncated":
        assert "skipped" in optimized, "Truncation marker should be present"

    print("[PASS] Truncation 테스트 성공\n")


def test_real_world_scenario():
    """실제 시나리오: 대용량 Service 클래스"""
    print("=== Test 4: Real-world Scenario (Service 클래스) ===")

    analyzer = AIAnalyzer()

    # 실제 Spring Service 클래스 시뮬레이션
    service_class = """
package com.example.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserService {

    private final UserRepository userRepository;
    private final EmailService emailService;
    private final AuditService auditService;

    public UserService(UserRepository userRepository,
                      EmailService emailService,
                      AuditService auditService) {
        this.userRepository = userRepository;
        this.emailService = emailService;
        this.auditService = auditService;
    }

    public UserDto createUser(UserCreateRequest request) {
""" + ("        // Complex validation and processing logic\n" * 2000) + """
        return userDto;
    }

    public Optional<UserDto> getUserById(Long id) {
""" + ("        // Repository access and transformation\n" * 1000) + """
        return Optional.of(userDto);
    }

    public void deleteUser(Long id) {
""" + ("        // Soft delete logic\n" * 500) + """
    }
}
"""

    optimized, level = analyzer._optimize_source_code(service_class, max_chars=30000)

    print(f"원본 크기: {len(service_class)} chars")
    print(f"최적화 후: {len(optimized)} chars")
    print(f"최적화 레벨: {level}")

    # 클래스 선언부와 필드는 유지되어야 함
    assert "UserService" in optimized, "Class name should be preserved"
    assert "UserRepository" in optimized or "userRepository" in optimized, "Fields should be preserved"

    # 메서드 시그니처는 남아있어야 함
    assert "createUser" in optimized, "Method signature should be preserved"
    assert "getUserById" in optimized, "Method signature should be preserved"

    print("[PASS] Real-world Scenario 테스트 성공\n")


def main():
    """모든 테스트 실행"""
    print("=" * 60)
    print("AI Analyzer 소스 코드 최적화 테스트")
    print("=" * 60 + "\n")

    try:
        test_pass_through()
        test_body_stripping()
        test_truncation()
        test_real_world_scenario()

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
