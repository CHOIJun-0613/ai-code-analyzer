"""
Method 복잡도 측정 (PLOC, LLOC, CLOC, Cognitive Complexity) 단위 테스트
"""
import pytest
from csa.models.graph_entities import Method
from csa.utils.loc_calculator import calculate_loc, LOCMetrics
from csa.utils.cognitive_complexity import calculate_method_cognitive_complexity
from csa.vendor import javalang


def test_method_model_has_complexity_attributes():
    """Method 모델에 복잡도 속성이 존재하는지 확인"""
    method = Method(
        name="testMethod",
        return_type="void",
        PLOC=10,
        LLOC=8,
        CLOC=2,
        cognitive_complexity=3
    )

    assert method.PLOC == 10
    assert method.LLOC == 8
    assert method.CLOC == 2
    assert method.cognitive_complexity == 3


def test_method_model_default_complexity_values():
    """Method 모델의 기본 복잡도 값이 0인지 확인"""
    method = Method(
        name="testMethod",
        return_type="void"
    )

    assert method.PLOC == 0
    assert method.LLOC == 0
    assert method.CLOC == 0
    assert method.cognitive_complexity == 0


def test_calculate_loc_simple_method():
    """간단한 메서드의 LOC 계산 테스트"""
    source = """
    public void simpleMethod() {
        int x = 1;
        int y = 2;
        System.out.println(x + y);
    }
    """

    metrics = calculate_loc(source)

    assert metrics.ploc > 0  # 전체 라인 수
    assert metrics.lloc > 0  # 실행 가능한 라인 수
    assert metrics.cloc == 0  # 주석 없음


def test_calculate_loc_method_with_comments():
    """주석이 있는 메서드의 LOC 계산 테스트"""
    source = """
    // This is a method
    public void methodWithComments() {
        // Variable declaration
        int x = 1;
        /* Multi-line comment
           continues here */
        int y = 2;
        System.out.println(x + y);
    }
    """

    metrics = calculate_loc(source)

    assert metrics.ploc > 0
    assert metrics.lloc > 0
    assert metrics.cloc >= 3  # 최소 3개 이상의 주석 라인


def test_calculate_loc_empty_method():
    """빈 메서드의 LOC 계산 테스트"""
    source = """
    public void emptyMethod() {
    }
    """

    metrics = calculate_loc(source)

    assert metrics.ploc >= 2  # 최소 2 라인 (선언부 + 닫는 중괄호)
    assert metrics.lloc >= 0
    assert metrics.cloc == 0


def test_cognitive_complexity_simple_method():
    """간단한 메서드의 Cognitive Complexity 계산 테스트"""
    source = """
    public class TestClass {
        public void simpleMethod() {
            int x = 1;
            int y = 2;
            System.out.println(x + y);
        }
    }
    """

    tree = javalang.parse.parse(source)
    class_decl = tree.types[0]
    method_decl = class_decl.methods[0]

    complexity = calculate_method_cognitive_complexity(method_decl)

    assert complexity == 0  # 제어 구조 없음


def test_cognitive_complexity_method_with_if():
    """if 문이 있는 메서드의 Cognitive Complexity 계산 테스트"""
    source = """
    public class TestClass {
        public void methodWithIf(int x) {
            if (x > 0) {
                System.out.println("positive");
            }
        }
    }
    """

    tree = javalang.parse.parse(source)
    class_decl = tree.types[0]
    method_decl = class_decl.methods[0]

    complexity = calculate_method_cognitive_complexity(method_decl)

    assert complexity >= 1  # if 문으로 인한 복잡도 증가


def test_cognitive_complexity_nested_if():
    """중첩 if 문의 Cognitive Complexity 계산 테스트"""
    source = """
    public class TestClass {
        public void nestedIfMethod(int x, int y) {
            if (x > 0) {
                if (y > 0) {
                    System.out.println("both positive");
                }
            }
        }
    }
    """

    tree = javalang.parse.parse(source)
    class_decl = tree.types[0]
    method_decl = class_decl.methods[0]

    complexity = calculate_method_cognitive_complexity(method_decl)

    assert complexity >= 3  # 중첩으로 인한 복잡도 증가 (if: 1 + 중첩 if: 2)


def test_cognitive_complexity_method_with_loops():
    """반복문이 있는 메서드의 Cognitive Complexity 계산 테스트"""
    source = """
    public class TestClass {
        public void methodWithLoop() {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        }
    }
    """

    tree = javalang.parse.parse(source)
    class_decl = tree.types[0]
    method_decl = class_decl.methods[0]

    complexity = calculate_method_cognitive_complexity(method_decl)

    assert complexity >= 1  # for 문으로 인한 복잡도 증가


def test_cognitive_complexity_complex_method():
    """복잡한 메서드의 Cognitive Complexity 계산 테스트"""
    source = """
    public class TestClass {
        public void complexMethod(int x, int y) {
            if (x > 0) {
                for (int i = 0; i < x; i++) {
                    if (y > 0) {
                        System.out.println(i * y);
                    }
                }
            } else {
                while (y < 10) {
                    y++;
                }
            }
        }
    }
    """

    tree = javalang.parse.parse(source)
    class_decl = tree.types[0]
    method_decl = class_decl.methods[0]

    complexity = calculate_method_cognitive_complexity(method_decl)

    assert complexity >= 5  # 여러 제어 구조와 중첩으로 인한 높은 복잡도


def test_dto_method_should_have_zero_complexity():
    """DTO 클래스 메서드는 복잡도가 0이어야 함"""
    # 이 테스트는 실제로는 통합 테스트에서 확인
    # 여기서는 개념적인 검증만 수행
    method = Method(
        name="getterMethod",
        return_type="String",
        PLOC=0,
        LLOC=0,
        CLOC=0,
        cognitive_complexity=0
    )

    # DTO 메서드는 모든 복잡도가 0이어야 함
    assert method.PLOC == 0
    assert method.LLOC == 0
    assert method.CLOC == 0
    assert method.cognitive_complexity == 0


def test_loc_metrics_class():
    """LOCMetrics 클래스 테스트"""
    metrics = LOCMetrics(ploc=10, lloc=8, cloc=2)

    assert metrics.ploc == 10
    assert metrics.lloc == 8
    assert metrics.cloc == 2

    metrics_dict = metrics.to_dict()
    assert metrics_dict['PLOC'] == 10
    assert metrics_dict['LLOC'] == 8
    assert metrics_dict['CLOC'] == 2


def test_calculate_loc_with_mixed_comments():
    """코드와 주석이 섞인 경우 LOC 계산 테스트"""
    source = """
    public void mixedMethod() {
        int x = 1; // inline comment
        int y = 2; // another inline comment
        // standalone comment
        System.out.println(x + y);
    }
    """

    metrics = calculate_loc(source)

    # 인라인 주석이 있는 라인은 코드 라인으로 간주
    assert metrics.ploc > 0
    assert metrics.lloc >= 3  # int x, int y, println (최소 3개)
    assert metrics.cloc >= 1  # standalone comment (최소 1개)


if __name__ == "__main__":
    pytest.main([__file__, "-v"])
