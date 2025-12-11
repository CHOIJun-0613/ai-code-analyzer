"""
LOC (Lines of Code) 계산 유틸리티 모듈

이 모듈은 Java 소스 코드의 다양한 LOC 메트릭을 계산합니다:
- PLOC (Physical LOC): 파일의 모든 라인 수
- LLOC (Logical LOC): 실제 실행 가능한 구문 라인 수 (주석과 공백 제외)
- CLOC (Comment LOC): 주석 라인 수
"""

import re
from typing import Dict


class LOCMetrics:
    """LOC 메트릭 결과를 담는 데이터 클래스"""

    def __init__(self, ploc: int = 0, lloc: int = 0, cloc: int = 0):
        self.ploc = ploc  # Physical LOC
        self.lloc = lloc  # Logical LOC
        self.cloc = cloc  # Comment LOC

    def to_dict(self) -> Dict[str, int]:
        """딕셔너리로 변환"""
        return {
            'PLOC': self.ploc,
            'LLOC': self.lloc,
            'CLOC': self.cloc
        }


def calculate_loc(source_code: str) -> LOCMetrics:
    """
    Java 소스 코드의 LOC 메트릭을 계산합니다.

    Args:
        source_code: Java 소스 코드 문자열

    Returns:
        LOCMetrics: PLOC, LLOC, CLOC 값을 포함하는 객체
    """
    if not source_code:
        return LOCMetrics(0, 0, 0)

    lines = source_code.split('\n')
    ploc = len(lines)

    # 주석 라인과 공백 라인을 추적
    cloc = 0
    blank_lines = 0
    in_multiline_comment = False

    for line in lines:
        stripped = line.strip()

        # 공백 라인 체크
        if not stripped:
            blank_lines += 1
            continue

        # 멀티라인 주석 처리
        if in_multiline_comment:
            cloc += 1
            if '*/' in stripped:
                in_multiline_comment = False
            continue

        # 멀티라인 주석 시작 체크
        if stripped.startswith('/*') or stripped.startswith('/**'):
            cloc += 1
            # 같은 라인에서 끝나는지 체크
            if '*/' not in stripped:
                in_multiline_comment = True
            continue

        # 단일 라인 주석 체크
        if stripped.startswith('//'):
            cloc += 1
            continue

        # 코드와 주석이 섞인 경우 (예: int x = 1; // comment)
        # 이 경우는 코드 라인으로 간주 (LLOC에 포함)

    # LLOC = 전체 라인 - 주석 라인 - 공백 라인
    lloc = ploc - cloc - blank_lines

    return LOCMetrics(ploc, lloc, cloc)


def calculate_loc_from_file(file_path: str) -> LOCMetrics:
    """
    파일 경로로부터 LOC 메트릭을 계산합니다.

    Args:
        file_path: Java 소스 파일 경로

    Returns:
        LOCMetrics: PLOC, LLOC, CLOC 값을 포함하는 객체
    """
    try:
        with open(file_path, 'r', encoding='utf-8') as f:
            source_code = f.read()
        return calculate_loc(source_code)
    except Exception as e:
        # 파일 읽기 실패 시 0 반환
        return LOCMetrics(0, 0, 0)


def calculate_loc_advanced(source_code: str) -> LOCMetrics:
    """
    고급 LOC 계산 (더 정확한 주석 처리).

    이 함수는 다음을 더 정확하게 처리합니다:
    - 문자열 리터럴 내의 주석 패턴 무시
    - 코드와 주석이 섞인 라인 처리

    Args:
        source_code: Java 소스 코드 문자열

    Returns:
        LOCMetrics: PLOC, LLOC, CLOC 값을 포함하는 객체
    """
    if not source_code:
        return LOCMetrics(0, 0, 0)

    lines = source_code.split('\n')
    ploc = len(lines)

    cloc = 0
    blank_lines = 0
    in_multiline_comment = False
    in_string = False
    string_delimiter = None

    for line in lines:
        stripped = line.strip()

        # 공백 라인 체크
        if not stripped:
            blank_lines += 1
            continue

        # 멀티라인 주석 내부인 경우
        if in_multiline_comment:
            cloc += 1
            # 주석 종료 체크
            for i, char in enumerate(stripped):
                if char == '*' and i + 1 < len(stripped) and stripped[i + 1] == '/':
                    in_multiline_comment = False
                    break
            continue

        # 라인 분석
        is_comment_line = False
        has_code = False

        i = 0
        while i < len(stripped):
            char = stripped[i]

            # 문자열 리터럴 처리
            if char in ('"', "'") and (i == 0 or stripped[i - 1] != '\\'):
                if not in_string:
                    in_string = True
                    string_delimiter = char
                elif char == string_delimiter:
                    in_string = False
                    string_delimiter = None
                i += 1
                continue

            # 문자열 내부면 주석 체크 건너뛰기
            if in_string:
                has_code = True
                i += 1
                continue

            # 단일 라인 주석 체크
            if char == '/' and i + 1 < len(stripped) and stripped[i + 1] == '/':
                # 이 라인에 코드가 있으면 코드 라인, 없으면 주석 라인
                if not has_code:
                    is_comment_line = True
                break

            # 멀티라인 주석 시작 체크
            if char == '/' and i + 1 < len(stripped) and stripped[i + 1] == '*':
                if not has_code:
                    is_comment_line = True
                # 주석 종료 위치 찾기
                end_idx = stripped.find('*/', i + 2)
                if end_idx == -1:
                    # 다음 라인으로 계속됨
                    in_multiline_comment = True
                    break
                else:
                    # 같은 라인에서 종료
                    i = end_idx + 2
                    continue

            # 기타 문자는 코드로 간주
            if char not in (' ', '\t'):
                has_code = True

            i += 1

        if is_comment_line:
            cloc += 1

    # LLOC = 전체 라인 - 주석 라인 - 공백 라인
    lloc = ploc - cloc - blank_lines

    return LOCMetrics(ploc, lloc, cloc)


# 기본 함수는 간단한 버전 사용 (성능과 정확도 균형)
# 필요 시 calculate_loc_advanced로 변경 가능
