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
  - Mac/Linux: `cd server && source venv/bin/activate && python main.py` (또는 이에 준하는 스크립트)

## 3. 구현 계획 문서 (Implementation Plan)
- **언어:** 한국어
- **파일명 규칙:** `docs/antigravity/ImplementationPlan-{Title}-{YYYYMMDD}.md`
  - *주의:* `{Title}`은 공백 없이 영문/한글 혼용 가능하며, 띄어쓰기는 하이픈(`-`)으로 대체한다.
- **필수 포함 내용:**
  1.  **목표 (Goal):** 무엇을 구현하는가?
  2.  **변경 범위 (Scope):** 수정되는 파일 목록 및 영향도.
  3.  **단계별 계획 (Steps):** 논리적인 구현 순서.

## 4. 결과 및 가이드 문서 (Walkthrough)
- **언어:** 한국어
- **파일명 규칙:** `docs/antigravity/Walkthrough-{Title}-{YYYYMMDD}.md`
  - *주의:* `{Title}`은 구현 계획 문서의 제목과 일치시킨다.
- **필수 포함 내용:**
  1.  **요약 (Summary):** 구현된 기능 설명.
  2.  **테스트 방법 (Verification):** 기능 동작을 확인하는 방법 (curl 예시 등).
  3.  **코드 리뷰 포인트:** 특히 주의 깊게 봐야 할 로직.