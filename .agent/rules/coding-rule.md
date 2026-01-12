---
trigger: always_on
---

# Antigravity Project Rules

## 1. 코딩 스타일 및 아키텍처 (Coding Style & Architecture)
- **표준 준수:**
  - PEP 8(4칸 들여쓰기)을 엄격히 준수한다.
  - 네이밍: 변수/함수는 `snake_case`, 클래스는 `PascalCase`, 상수는 `UPPER_CASE`를 사용한다.
- **문서화 (Docstring):**
  - **Google Style Docstring** 포맷을 사용한다.
  - 내용은 한국어로 작성하며, 핵심 로직 위주로 간결하게 기술한다.
- **타입 안정성 & 데이터 모델링:**
  - `typing` 모듈과 Python 3.10+ 문법(예: `Optional[str]` 대신 `str | None`)을 적극 활용한다.
  - 데이터 유효성 검증에는 반드시 **Pydantic Model**을 사용한다.
- **의존성 주입 (Dependency Injection):**
  - 전역 변수(Global state) 사용을 지양한다.
  - 필요한 의존성(Config, DB Session 등)은 **Helper 함수**나 **Dependency Injection 패턴**을 통해 주입받는다.
- **설정 관리:**
  - 비밀번호, API Key, 경로는 코드에 하드코딩하지 않는다.
  - `.env` 파일과 `pydantic-settings` (혹은 유사 Helper)를 통해 환경 변수로 관리한다.

## 2. 서버 실행 및 환경 관리 (Server Execution)
- **가상환경 필수:** 모든 실행은 가상환경(venv)이 활성화된 상태에서 수행되어야 한다.
- **실행 명령:**
  - Windows: `cd server && runvenv.bat`