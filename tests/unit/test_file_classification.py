"""
파일 분류 로직 테스트

옵션 3 (하이브리드) 방식으로 파일을 분석 대상과 미대상으로 구분하는지 테스트합니다.
"""

import pytest
import tempfile
import os
from csa.utils.project_statistics import aggregate_file_statistics


def test_file_classification():
    """파일 분류가 올바르게 작동하는지 테스트"""

    # 임시 디렉터리 생성
    with tempfile.TemporaryDirectory() as tmpdir:
        # 테스트 파일 생성
        test_files = {
            'Test.java': 'java_files',
            'Mapper.xml': 'xml_files',
            'DataAccess.dbio': 'xml_files',
            'application.yml': 'config_files',
            'application.yaml': 'config_files',
            'application.properties': 'config_files',
            'schema.sql': 'ddl_files',
            'data.omm': 'ignored_files',
            'image.png': 'ignored_files',
            'README.md': 'ignored_files',
        }

        for filename in test_files.keys():
            filepath = os.path.join(tmpdir, filename)
            with open(filepath, 'w', encoding='utf-8') as f:
                f.write(f"# Test content for {filename}\n")

        # 통계 집계
        stats = aggregate_file_statistics(tmpdir)

        # 검증
        assert stats['total_files'] == 10, f"전체 파일 수가 10이어야 함: {stats['total_files']}"
        assert stats['java_files'] == 1, f"Java 파일 수가 1이어야 함: {stats['java_files']}"
        assert stats['xml_files'] == 2, f"XML 파일 수가 2여야 함 (.xml + .dbio): {stats['xml_files']}"
        assert stats['config_files'] == 3, f"설정 파일 수가 3이어야 함: {stats['config_files']}"
        assert stats['ddl_files'] == 1, f"DDL 파일 수가 1이어야 함: {stats['ddl_files']}"
        assert stats['ignored_files'] == 3, f"무시된 파일 수가 3이어야 함 (.omm, .png, .md): {stats['ignored_files']}"

        # 하위 호환성 검증
        expected_etc = stats['config_files'] + stats['ddl_files'] + stats['other_analyzed_files'] + stats['ignored_files']
        assert stats['etc_files'] == expected_etc, f"etc_files는 config + ddl + other + ignored의 합계여야 함"
        assert stats['etc_files'] == 7, f"etc_files는 7이어야 함 (3 config + 1 ddl + 0 other + 3 ignored): {stats['etc_files']}"

        # 전체 합계 검증
        calculated_total = stats['java_files'] + stats['xml_files'] + stats['etc_files']
        assert stats['total_files'] == calculated_total, "전체 파일 수는 java + xml + etc의 합계여야 함"

        print("✓ 모든 테스트 통과!")
        print(f"  - Java 파일: {stats['java_files']}")
        print(f"  - XML 파일: {stats['xml_files']} (.xml + .dbio)")
        print(f"  - 설정 파일: {stats['config_files']} (.yml + .yaml + .properties)")
        print(f"  - DDL 파일: {stats['ddl_files']} (.sql)")
        print(f"  - 무시된 파일: {stats['ignored_files']} (.omm + .png + .md)")
        print(f"  - 기타 파일 (deprecated): {stats['etc_files']}")
        print(f"  - 전체 파일: {stats['total_files']}")


def test_analyzed_vs_ignored_classification():
    """분석 대상과 미대상 파일이 정확히 구분되는지 테스트"""

    with tempfile.TemporaryDirectory() as tmpdir:
        # 분석 대상 파일
        analyzed_files = [
            'Test.java',
            'Mapper.xml',
            'Data.dbio',
            'application.yml',
            'config.yaml',
            'app.properties',
            'schema.sql',
        ]

        # 분석 미대상 파일
        ignored_files = [
            'data.omm',
            'image.png',
            'doc.md',
            'data.json',
            'style.css',
        ]

        # 파일 생성
        for filename in analyzed_files + ignored_files:
            filepath = os.path.join(tmpdir, filename)
            with open(filepath, 'w', encoding='utf-8') as f:
                f.write(f"# {filename}\n")

        stats = aggregate_file_statistics(tmpdir)

        # 분석 대상 파일 수 계산
        analyzed_count = (
            stats['java_files'] +
            stats['xml_files'] +
            stats['config_files'] +
            stats['ddl_files'] +
            stats['other_analyzed_files']
        )

        assert analyzed_count == len(analyzed_files), \
            f"분석 대상 파일 수가 {len(analyzed_files)}여야 함: {analyzed_count}"

        assert stats['ignored_files'] == len(ignored_files), \
            f"무시된 파일 수가 {len(ignored_files)}여야 함: {stats['ignored_files']}"

        print("✓ 분석/미분석 분류 테스트 통과!")
        print(f"  - 분석 대상: {analyzed_count}개")
        print(f"  - 분석 미대상: {stats['ignored_files']}개")


if __name__ == '__main__':
    test_file_classification()
    print()
    test_analyzed_vs_ignored_classification()
