"""
하위 호환성을 위한 re-export 모듈.

실제 구현은 다음 모듈로 분리되었습니다:
- single_file_parser: 단일 파일 파싱 (parse_single_java_file 등)
- project_orchestration: 배치 모드 오케스트레이션 (parse_java_project_full 등)
- streaming_parser: 스트리밍 모드 파싱 (parse_java_project_streaming 등)
"""
from .single_file_parser import (
    extract_inner_class_source,
    is_dto_class,
    parse_inner_classes,
    parse_single_java_file,
)
from .project_orchestration import (
    parse_java_project,
    parse_java_project_full,
    _collect_java_files_with_csaignore,
)
from .streaming_parser import (
    AdaptiveBatchSizer,
    estimate_file_complexity,
    parse_java_project_streaming,
)
from .utils import extract_project_name

__all__ = [
    "parse_java_project",
    "parse_java_project_full",
    "parse_java_project_streaming",
    "parse_single_java_file",
    "extract_project_name",
    "estimate_file_complexity",
    "is_dto_class",
]
