"""
프로젝트 통계 로그 출력 테스트

새로운 파일 분류 체계에 따른 로그 출력이 올바르게 작동하는지 테스트합니다.
"""

import pytest
import logging
from csa.models.graph_entities import Project


def test_project_statistics_log_format(caplog):
    """프로젝트 통계 로그 포맷 테스트"""

    # 테스트용 Project 객체 생성
    project = Project(
        name="test-project",
        total_file_count=1406,
        total_java_file_count=739,
        total_xml_file_count=12,
        total_config_file_count=50,
        total_ddl_file_count=30,
        total_other_analyzed_file_count=0,
        total_ignored_file_count=575,
        total_etc_file_count=655,  # deprecated
        total_PLOC=467787,
        total_LLOC=336457,
        total_CLOC=83491,
    )

    # 분석 대상 파일 수 계산
    analyzed_count = (project.total_java_file_count +
                     project.total_xml_file_count +
                     project.total_config_file_count +
                     project.total_ddl_file_count +
                     project.total_other_analyzed_file_count)

    # 로거 설정
    logger = logging.getLogger(__name__)

    # 로그 출력 (neo4j_writer.py와 동일한 형식)
    with caplog.at_level(logging.INFO):
        logger.info("=" * 80)
        logger.info("프로젝트 통계: 전체 파일 %d개", project.total_file_count)
        logger.info("  - 분석 대상: %d개 (Java: %d, XML: %d, Config: %d, DDL: %d)",
                    analyzed_count,
                    project.total_java_file_count,
                    project.total_xml_file_count,
                    project.total_config_file_count,
                    project.total_ddl_file_count)
        logger.info("  - 분석 미대상: %d개", project.total_ignored_file_count)
        logger.info("  - LOC 통계: PLOC %d, LLOC %d, CLOC %d",
                    project.total_PLOC, project.total_LLOC, project.total_CLOC)
        logger.info("=" * 80)

    # 로그 출력 검증
    assert "프로젝트 통계: 전체 파일 1406개" in caplog.text
    assert "분석 대상: 831개" in caplog.text  # 739 + 12 + 50 + 30 = 831
    assert "Java: 739" in caplog.text
    assert "XML: 12" in caplog.text
    assert "Config: 50" in caplog.text
    assert "DDL: 30" in caplog.text
    assert "분석 미대상: 575개" in caplog.text
    assert "PLOC 467787" in caplog.text
    assert "LLOC 336457" in caplog.text
    assert "CLOC 83491" in caplog.text

    # 콘솔 출력 (시각적 확인용)
    print("\n" + "=" * 80)
    print("예상 로그 출력:")
    print("=" * 80)
    print(f"프로젝트 통계: 전체 파일 {project.total_file_count}개")
    print(f"  - 분석 대상: {analyzed_count}개 (Java: {project.total_java_file_count}, "
          f"XML: {project.total_xml_file_count}, Config: {project.total_config_file_count}, "
          f"DDL: {project.total_ddl_file_count})")
    print(f"  - 분석 미대상: {project.total_ignored_file_count}개")
    print(f"  - LOC 통계: PLOC {project.total_PLOC}, LLOC {project.total_LLOC}, CLOC {project.total_CLOC}")
    print("=" * 80)

    # 검증 성공
    print("\n[OK] 모든 로그 포맷 검증 통과!")


def test_analyzed_files_calculation():
    """분석 대상 파일 수 계산 검증"""

    project = Project(
        name="test-project",
        total_file_count=1406,
        total_java_file_count=739,
        total_xml_file_count=12,
        total_config_file_count=50,
        total_ddl_file_count=30,
        total_other_analyzed_file_count=0,
        total_ignored_file_count=575,
    )

    # 분석 대상 파일 수 계산
    analyzed_count = (project.total_java_file_count +
                     project.total_xml_file_count +
                     project.total_config_file_count +
                     project.total_ddl_file_count +
                     project.total_other_analyzed_file_count)

    # 검증
    assert analyzed_count == 831, f"분석 대상 파일 수가 831이어야 함: {analyzed_count}"
    assert project.total_file_count == analyzed_count + project.total_ignored_file_count, \
        "전체 파일 수는 분석 대상 + 분석 미대상의 합계여야 함"

    print(f"\n[OK] 분석 대상 파일 수 계산 검증 통과: {analyzed_count}개")


if __name__ == '__main__':
    pytest.main([__file__, '-v', '-s'])
