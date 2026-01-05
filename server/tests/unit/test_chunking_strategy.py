"""
단위 테스트: Chunking 전략
"""
import pytest
import logging
from csa.aiwork.ai_analyzer import AIAnalyzer


# 테스트용 로거 설정
@pytest.fixture
def test_logger():
    """테스트용 로거 생성"""
    logger = logging.getLogger("test_chunking")
    logger.setLevel(logging.DEBUG)
    if not logger.handlers:
        handler = logging.StreamHandler()
        handler.setFormatter(logging.Formatter('%(levelname)s - %(message)s'))
        logger.addHandler(handler)
    return logger


def test_chunk_class_source_small(test_logger):
    """작은 클래스는 청크 분할 안 함"""
    analyzer = AIAnalyzer()
    source_code = """
public class SmallClass {
    public void method1() { /* hidden */ }
    public void method2() { /* hidden */ }
}
    """.strip()

    chunks = analyzer._chunk_class_source(source_code, max_chars=10000, logger=test_logger)
    assert len(chunks) == 1, f"Expected 1 chunk, but got {len(chunks)}"
    assert source_code in chunks[0], "Original source should be in the single chunk"


def test_chunk_class_source_large(test_logger):
    """큰 클래스는 여러 청크로 분할"""
    analyzer = AIAnalyzer()

    # 100개 메서드 생성
    methods = [f"    public void method{i}() {{ /* hidden */ }}" for i in range(100)]
    source_code = f"""
public class LargeClass {{
{chr(10).join(methods)}
}}
    """.strip()

    chunks = analyzer._chunk_class_source(source_code, max_chars=5000, logger=test_logger)
    assert len(chunks) > 1, f"Expected multiple chunks, but got {len(chunks)}"

    # 각 청크가 완전한 클래스 구조 유지
    for i, chunk in enumerate(chunks):
        assert "public class LargeClass" in chunk, f"Chunk {i+1} should contain class declaration"
        assert chunk.strip().endswith("}"), f"Chunk {i+1} should end with closing brace"


def test_chunk_class_source_with_fields(test_logger):
    """필드가 있는 클래스 청크 분할"""
    analyzer = AIAnalyzer()

    fields = [f"    private String field{i};" for i in range(10)]
    methods = [f"    public void method{i}() {{ /* hidden */ }}" for i in range(50)]
    source_code = f"""
public class ClassWithFields {{
{chr(10).join(fields)}

{chr(10).join(methods)}
}}
    """.strip()

    chunks = analyzer._chunk_class_source(source_code, max_chars=3000, logger=test_logger)

    # 모든 청크에 필드가 포함되어야 함 (Header에 포함)
    for i, chunk in enumerate(chunks):
        assert "private String field0;" in chunk, f"Chunk {i+1} should contain fields in header"


def test_merge_chunk_results_single(test_logger):
    """단일 청크 결과 병합"""
    analyzer = AIAnalyzer()
    chunk_results = [
        "## Class Description\nThis is a test class."
    ]

    merged = analyzer._merge_chunk_results(chunk_results, "TestClass", logger=test_logger)
    assert merged == chunk_results[0], "Single chunk should return as-is"


def test_merge_chunk_results_multiple(test_logger):
    """여러 청크 결과 병합"""
    analyzer = AIAnalyzer()
    chunk_results = [
        "## Part 1\nMethods: method1, method2",
        "## Part 2\nMethods: method3, method4"
    ]

    merged = analyzer._merge_chunk_results(chunk_results, "TestClass", logger=test_logger)
    assert "Part 1" in merged, "Merged result should contain Part 1"
    assert "Part 2" in merged, "Merged result should contain Part 2"
    assert "TestClass" in merged, "Merged result should contain class name"
    assert "분할 분석" in merged, "Merged result should indicate chunked analysis"


def test_merge_chunk_results_empty(test_logger):
    """빈 청크 결과 병합"""
    analyzer = AIAnalyzer()
    chunk_results = []

    merged = analyzer._merge_chunk_results(chunk_results, "TestClass", logger=test_logger)
    assert merged == "", "Empty chunks should return empty string"


def test_chunk_class_source_header_overflow(test_logger):
    """Header/Footer만으로 제한 초과 시 Truncation"""
    analyzer = AIAnalyzer()

    # 매우 긴 필드 리스트 (Header가 max_chars 초과)
    fields = [f"    private String veryLongFieldName{i} = \"default value for field {i}\";" for i in range(1000)]
    source_code = f"""
public class VeryLargeHeader {{
{chr(10).join(fields)}

    public void method1() {{ /* hidden */ }}
}}
    """.strip()

    # max_chars를 작게 설정
    chunks = analyzer._chunk_class_source(source_code, max_chars=1000, logger=test_logger)

    # Truncation이 적용되어 단일 청크만 반환
    assert len(chunks) == 1, "Header overflow should trigger truncation (single chunk)"


if __name__ == "__main__":
    pytest.main([__file__, "-v"])
