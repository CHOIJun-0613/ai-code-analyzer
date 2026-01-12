from pydantic import BaseModel

class Project(BaseModel):
    """Represents a project in the system."""

    name: str = ""  # 프로젝트 이름 (고유 식별자)
    description: str = ""  # 프로젝트 설명
    ai_description: str = ""  # AI 생성 설명
    application_name: str = ""  # 애플리케이션 이름
    number_of_files: int = 0  # 프로젝트에 속한 파일 수
    path: str = ""  # 프로젝트 경로
    framework: str = ""  # 프레임워크 (예: Spring, BXM)
    repository: str = ""  # 저장소 (예: Github URL)
    charset: str = "UTF-8"  # 소스 코드 캐릭터셋 (기본값: UTF-8)
    created_at: str = ""  # 생성 시간
    updated_at: str = ""  # 마지막 업데이트 시간

    # 파일 통계
    total_file_count: int = 0  # 프로젝트에 속한 모든 파일 수
    total_java_file_count: int = 0  # 프로젝트에 속한 모든 자바 파일 수 (분석됨)
    total_xml_file_count: int = 0  # 프로젝트에 속한 XML 파일 수 (.xml, .dbio - 분석됨)
    total_config_file_count: int = 0  # 프로젝트에 속한 설정 파일 수 (.yml, .yaml, .properties - 분석됨)
    total_ddl_file_count: int = 0  # 프로젝트에 속한 DDL 파일 수 (.sql - 분석됨)
    total_other_analyzed_file_count: int = 0  # 기타 분석된 파일 수 (향후 확장용)
    total_ignored_file_count: int = 0  # 분석되지 않은 파일 수 (.omm, .png, .md 등)
    total_etc_file_count: int = 0  # (deprecated, 하위 호환용) java파일과 xml파일을 제외한 기타 파일 수

    # LOC 통계 (자바 파일만 집계)
    total_PLOC: int = 0  # 프로젝트에 속한 모든 자바 파일의 모든 라인 수 합계
    total_LLOC: int = 0  # 프로젝트에 속한 모든 자바 파일의 실제 실행 가능한 구문 수 합계
    total_CLOC: int = 0  # 프로젝트에 속한 모든 자바 파일의 주석라인 수 합계
    
    # Configuration
    sequence_diagram_include_packages: str = "" # 시퀀스 다이어그램 생성 시 포함할 외부 패키지 목록
