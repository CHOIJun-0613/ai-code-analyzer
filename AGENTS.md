# AGENTS.md

본 문서는 ChatGPT, Claude Code, Copilot 등 에이전트가 `ai-code-analyzer` 저장소를 일관되게 작업하기 위한 운영 가이드입니다.

중요: 모든 대화와 설명은 한국어로 공손하게 작성합니다.

## 1. 프로젝트 개요
- 본 저장소는 **웹 애플리케이션 + 정적 분석 엔진(CSA CLI)** 구조입니다.
- `server/`는 FastAPI 백엔드와 CSA 분석 엔진(`server/csa`)을 포함합니다.
- `client/`는 React + Vite + TypeScript 프론트엔드입니다.
- 핵심 기능: Java/DB 정적 분석, Neo4j 그래프 적재, DB 호출 체인/CRUD/영향도 분석, 시퀀스 다이어그램, AI 설명 보강.

## 2. 디렉터리 맵 (실제 기준)
- `server/app`: FastAPI API 레이어 (`api/v1/endpoints`), 설정/보안/DB 연결, 서비스.
- `server/csa`: CLI/파서/분석 파이프라인/Neo4j 저장/리포트/AI 분석 코어.
- `server/tests`: 서버 중심 테스트.
- `server/scripts`: 운영/관리 스크립트(관리자 생성, 규칙 import/export 등).
- `client/src/pages`: 페이지 단위 UI.
- `client/src/components`: 공통 UI 컴포넌트(테이블, 다이어그램, 모달 등).
- `client/src/api`: Axios 기반 API 클라이언트.
- `client/src/store`: Zustand 상태 관리.
- `tests`(루트): 단위/통합/계약 테스트와 샘플 프로젝트 픽스처.
- `commands`: 자주 쓰는 Windows 배치 실행 스크립트.
- `neo4j`: 로컬 Neo4j 초기화/운영 보조 파일.

## 3. 빠른 시작
### 3.1 백엔드
```bash
cd server
python -m venv .venv
.venv\Scripts\activate
pip install -r requirements.txt
uvicorn app.main:app --reload --port 8000
```

### 3.2 프론트엔드
```bash
cd client
npm install
npm run dev
```
- 기본 접속: `http://localhost:5173`
- Vite 프록시: `/api` -> `http://localhost:8000`

### 3.3 배치 실행(Windows)
- 서버: `start_server.bat`
- 클라이언트: `start_client.bat`

## 4. 환경 변수 가이드
- 기본 템플릿: `server/env.example`
- 실행 컨텍스트: CLI/FastAPI 모두 `server/.env`를 기준으로 동작하도록 `cd server` 후 실행 권장.

주요 변수:
- Neo4j: `NEO4J_URI`, `NEO4J_USER`, `NEO4J_PASSWORD`, `NEO4J_DATABASE`
- 분석 입력: `JAVA_SOURCE_FOLDER`, `DB_SCRIPT_FOLDER`
- 성능: `USE_STREAMING_PARSE`, `JAVA_PARSE_WORKERS`, `JAVA_FILE_PARSE_TIMEOUT`, `NEO4J_BATCH_SIZE`
- 출력: `SEQUENCE_DIAGRAM_OUTPUT_DIR`, `CRUD_MATRIX_OUTPUT_DIR`, `CLASS_SPEC_OUTPUT_DIR`, `IMPACT_ANALYSIS_OUTPUT_DIR`
- AI: `USE_AI_ANALYSIS`, `AI_PROVIDER`, `CONCURRENT_AI_REQUESTS`, `MAX_TOKENS`

## 5. CLI 명령 (실제 명령명 기준)
CLI 진입:
```bash
cd server
python -m csa.cli.main --help
```

핵심 명령:
- 분석: `analyze`
- AI 보강: `ai-enrich`
- 시퀀스 다이어그램: `sequence`
- CRUD 계열: `crud-matrix`, `table-summary`, `crud-analysis`, `crud-visualization`, `table-impact`
- DB 호출 계열: `db-analysis`, `db-call-chain`, `db-call-diagram`, `db-statistics`
- 영향도: `impact-analysis`
- 클래스 명세: `class-spec`
- 그래프 조회: `query`, `list-classes`, `list-methods`

자주 쓰는 예시:
```bash
python -m csa.cli.main analyze --all-objects --clean --project-name <project>
python -m csa.cli.main sequence --class-name UserController --method-name getUser --format mermaid
python -m csa.cli.main crud-matrix --project-name <project> --output-format excel
python -m csa.cli.main impact-analysis --table-name USER --project-name <project> --generate-diagram
python -m csa.cli.main ai-enrich --project-name <project> --node-type class --concurrent 10
```

## 6. 테스트 실행
백엔드/루트 테스트를 분리해 실행합니다.

```bash
cd server
pytest
```

```bash
cd ..
pytest tests/unit
pytest tests/integration
pytest tests/contract
```

특정 테스트:
```bash
pytest tests/unit/test_java_parser.py::test_parse_simple_class
```

## 7. 작업 원칙
- Python: PEP 8, 타입 힌트 필수, `snake_case`/`PascalCase` 규칙 준수.
- TypeScript/React: 함수형 컴포넌트, 명시적 타입, `PascalCase` 컴포넌트.
- API 호출은 `client/src/api/client.ts`의 공용 axios 클라이언트를 우선 사용.
- 민감정보(`.env`, 키, 토큰) 커밋 금지.

## 8. 실무 주의사항
- `target_src/`는 대용량 분석 대상이므로 전체 재귀 스캔/변경은 비용이 큽니다. 범위를 명확히 제한하세요.
- Neo4j 데이터 정리 후 재분석 시 `--clean` 옵션을 우선 검토하세요.
- AI 분석은 비용/시간 영향이 커서 기본 비활성으로 두고 필요할 때만 `--use-ai` 또는 `ai-enrich`를 사용하세요.
- 산출물(`output/*`, 다이어그램/엑셀/리포트)은 커밋 전 필요 여부를 확인하세요.

## 9. PR/커밋 가이드
- Conventional Commits: `feat:`, `fix:`, `refactor:`, `docs:`, `test:`.
- PR에는 아래를 포함합니다.
  - 변경 목적/범위
  - 영향 파일 경로
  - 실행한 테스트 명령과 결과
  - UI 변경 시 스크린샷

위 규칙을 따르면 어떤 에이전트든 동일한 기준으로 안전하게 분석/수정/검증할 수 있습니다.
