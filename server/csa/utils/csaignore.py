"""
.csaignore 파일 파싱 및 필터링 유틸리티

.gitignore와 동일한 규칙을 사용하여 분석 대상에서 제외할 파일/폴더를 지정합니다.
"""
import os
from pathlib import Path
from typing import List, Optional

try:
    import pathspec
    PATHSPEC_AVAILABLE = True
except ImportError:
    PATHSPEC_AVAILABLE = False

from csa.utils.logger import get_logger
from csa.utils.i18n import _t

logger = get_logger(__name__)


class CSAIgnoreFilter:
    """
    .csaignore 파일을 파싱하여 파일/폴더 필터링 기능을 제공하는 클래스
    """

    def __init__(self, project_root: str | Path, additional_patterns: Optional[List[str]] = None, use_file: bool = True):
        """
        Args:
            project_root: 프로젝트 루트 디렉터리 (.csaignore 파일이 위치한 곳)
            additional_patterns: 추가로 적용할 제외 패턴 목록 (UI 등에서 전달됨)
            use_file: .csaignore 파일 사용 여부 (False면 파일 무시하고 additional_patterns만 사용)
        """
        self.project_root = Path(project_root)
        self.csaignore_path = self.project_root / ".csaignore"
        self.spec: Optional[pathspec.PathSpec] = None
        self.patterns: List[str] = []
        self.additional_patterns = additional_patterns or []
        self.use_file = use_file

        self._load_csaignore()

    def _load_csaignore(self) -> None:
        """
        .csaignore 파일을 로드하고 추가 패턴과 합쳐서 파싱합니다.
        """
        if not PATHSPEC_AVAILABLE:
            logger.warning(_t("csaignore.pathspec_required"))
            return

        patterns = []

        # 1. 파일에서 로드 (use_file=True일 때만)
        if self.use_file:
            if self.csaignore_path.exists():
                try:
                    with open(self.csaignore_path, "r", encoding="utf-8") as f:
                        lines = f.readlines()

                    for line in lines:
                        line = line.strip()
                        # 빈 줄이나 주석 제외
                        if line and not line.startswith("#"):
                            patterns.append(line)
                except Exception as e:
                    logger.error(_t("csaignore.load_failed", error=str(e)))
            else:
                logger.debug(_t("csaignore.file_not_exist", path=str(self.csaignore_path)))
        else:
            logger.debug(_t("csaignore.file_loading_skipped"))

        # 2. 추가 패턴 병합
        if self.additional_patterns:
            logger.info(_t("csaignore.ui_patterns_applied", count=len(self.additional_patterns)))
            patterns.extend(self.additional_patterns)

        # 3. PathSpec 생성
        if patterns:
            # 중복 제거
            patterns = list(set(patterns))
            self.patterns = patterns
            self.spec = pathspec.PathSpec.from_lines(
                pathspec.patterns.GitWildMatchPattern,
                patterns
            )
            logger.info(_t("csaignore.patterns_loaded", count=len(patterns)))
            logger.debug(_t("csaignore.applied_patterns", patterns=str(patterns)))
        else:
            logger.debug(_t("csaignore.no_patterns"))

    def should_ignore(self, file_path: str | Path) -> bool:
        """
        주어진 파일이 .csaignore 규칙에 의해 제외되어야 하는지 확인합니다.

        Args:
            file_path: 확인할 파일 경로 (절대 경로 또는 상대 경로)

        Returns:
            제외해야 하면 True, 아니면 False
        """
        if not self.spec:
            return False

        try:
            # 파일 경로를 프로젝트 루트 기준 상대 경로로 변환
            file_path = Path(file_path)
            if file_path.is_absolute():
                try:
                    relative_path = file_path.relative_to(self.project_root)
                except ValueError:
                    # 프로젝트 루트 외부 파일은 무시하지 않음
                    return False
            else:
                relative_path = file_path

            # Unix 스타일 경로로 변환 (pathspec은 / 구분자 사용)
            relative_path_str = relative_path.as_posix()

            # pathspec으로 매칭 확인
            is_ignored = self.spec.match_file(relative_path_str)

            if is_ignored:
                logger.debug(_t("csaignore.file_excluded", path=relative_path_str))

            return is_ignored

        except Exception as e:
            logger.error(_t("csaignore.check_failed", path=str(file_path), error=str(e)))
            return False

    def filter_files(self, file_paths: List[str | Path]) -> List[str | Path]:
        """
        파일 목록에서 .csaignore 규칙에 의해 제외되지 않은 파일만 필터링합니다.

        Args:
            file_paths: 파일 경로 목록

        Returns:
            제외되지 않은 파일 경로 목록
        """
        if not self.spec:
            return file_paths

        filtered = [f for f in file_paths if not self.should_ignore(f)]

        excluded_count = len(file_paths) - len(filtered)
        if excluded_count > 0:
            logger.info(_t("csaignore.files_excluded", excluded=excluded_count, total=len(file_paths)))

        return filtered

    def has_patterns(self) -> bool:
        """
        .csaignore 파일에 유효한 패턴이 있는지 확인합니다.

        Returns:
            패턴이 있으면 True, 없으면 False
        """
        return bool(self.spec and self.patterns)


def load_csaignore_filter(project_root: Optional[str | Path] = None, additional_patterns: Optional[List[str]] = None, use_file: bool = True) -> CSAIgnoreFilter:
    """
    .csaignore 필터를 로드합니다.

    Args:
        project_root: 프로젝트 루트 디렉터리 (None이면 현재 작업 디렉터리)
        additional_patterns: 추가로 적용할 제외 패턴 목록 (UI 등에서 전달됨)
        use_file: .csaignore 파일 사용 여부 (False면 파일 무시하고 additional_patterns만 사용)

    Returns:
        CSAIgnoreFilter 인스턴스
    """
    if project_root is None:
        project_root = os.getcwd()

    return CSAIgnoreFilter(project_root, additional_patterns, use_file)


__all__ = ["CSAIgnoreFilter", "load_csaignore_filter"]
