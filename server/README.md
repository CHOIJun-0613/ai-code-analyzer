# AI Code Analyzer Server

`server/`는 AI Code Analyzer의 백엔드(FastAPI)와 정적 분석 엔진(CSA CLI)을 포함하는 실행 단위입니다.

## 1. 구성 개요
- FastAPI API 서버: `app/`
- 정적 분석 엔진/CLI: `csa/`
- 마이그레이션/운영 스크립트: `migrations/`, `scripts/`
- 서버 테스트: `tests/`
- 환경 변수 예시: `env.example`

## 2. 디렉터리 구조
```text
server/
├─ app/                      # FastAPI 애플리케이션
│  ├─ api/v1/endpoints/      # API 엔드포인트
│  ├─ core/                  # 설정, 보안, DB 연결
│  ├─ models/                # API 모델
│  └─ services/              # API 서비스 레이어
├─ csa/                      # 정적 분석 엔진 + CLI
│  ├─ cli/                   # Click 기반 CLI
│  ├─ parsers/               # Java/SQL/DDL 파서
│  ├─ services/              # 분석 파이프라인/리포트/그래프 저장
│  ├─ diagrams/              # 시퀀스/영향도 다이어그램 생성
│  ├─ aiwork/                # AI 분석/프롬프트/프로바이더
│  └─ models/                # 분석 엔티티 모델
├─ migrations/               # DB/설정 마이그레이션 스크립트
├─ scripts/                  # 운영/관리 스크립트
├─ tests/                    # 서버 테스트
├─ requirements.txt
└─ env.example
```

## 3. 사전 요구사항
- Python 3.10+
- Neo4j 5.x 권장

## 4. 설치 및 실행
`server` 폴더에서 작업하는 것을 권장합니다.

```bash
cd server
python -m venv .venv
.venv\Scripts\activate
pip install -r requirements.txt
```

`.env` 파일을 준비합니다.

```bash
copy env.example .env
```

서버 실행(`.env`의 `SERVER_HOST`, `SERVER_PORT`, `SERVER_RELOAD` 사용):

```bash
python run_server.py
```

또는 Windows 배치 파일:

```bash
start_server.bat
```

## 5. API 진입점
- 앱 엔트리: `app/main.py`
- API 라우터: `app/api/v1/api.py`
- 기본 Prefix: `/api/v1`

문서 URL:
- Swagger UI: `http://localhost:8000/docs`
- ReDoc: `http://localhost:8000/redoc`

주요 라우터 그룹:
- `auth`, `users`, `groups`
- `analysis`, `projects`, `reports`, `class-reports`
- `applications`, `classes`, `methods`, `sqls`
- `ai`, `ai-prompts`, `analysis-rules`, `websocket`

## 6. CLI 사용
CSA CLI 엔트리:

```bash
cd server
python -m csa.cli.main --help
```

주요 명령:
- `analyze`
- `ai-enrich`
- `sequence`
- `class-spec`
- `impact-analysis`
- `crud-matrix`, `crud-analysis`, `crud-visualization`, `table-summary`, `table-impact`
- `db-analysis`, `db-call-chain`, `db-call-diagram`, `db-statistics`
- `query`, `list-classes`, `list-methods`

예시:

```bash
python -m csa.cli.main analyze --all-objects --clean --project-name <project>
python -m csa.cli.main sequence --class-name UserController --method-name getUser --format mermaid
python -m csa.cli.main crud-matrix --project-name <project> --output-format excel
python -m csa.cli.main impact-analysis --table-name USER --project-name <project> --generate-diagram
python -m csa.cli.main ai-enrich --project-name <project> --node-type class --concurrent 10
```

## 7. 환경 변수 핵심 항목
주요 키(상세는 `env.example` 참고):
- Neo4j: `NEO4J_URI`, `NEO4J_USER`, `NEO4J_PASSWORD`, `NEO4J_DATABASE`
- 서버 기동: `SERVER_HOST`, `SERVER_PORT`, `SERVER_RELOAD`
- 분석 입력: `JAVA_SOURCE_FOLDER`, `DB_SCRIPT_FOLDER`
- 파싱/성능: `USE_STREAMING_PARSE`, `JAVA_PARSE_WORKERS`, `JAVA_FILE_PARSE_TIMEOUT`, `NEO4J_BATCH_SIZE`
- 출력 경로: `SEQUENCE_DIAGRAM_OUTPUT_DIR`, `CRUD_MATRIX_OUTPUT_DIR`, `CLASS_SPEC_OUTPUT_DIR`, `IMPACT_ANALYSIS_OUTPUT_DIR`
- AI: `USE_AI_ANALYSIS`, `AI_PROVIDER`, `CONCURRENT_AI_REQUESTS`, `MAX_TOKENS`

## 8. 테스트 실행
서버 디렉터리 기준:

```bash
cd server
pytest
```

특정 테스트 예시:

```bash
pytest tests/unit/test_chunking_strategy.py
```

## 9. 운영 시 주의사항
- 대용량 소스(`target_src/`) 분석 시 시간/메모리 사용량이 큽니다.
- 재분석 전 그래프 정리가 필요하면 `analyze --clean` 사용을 검토해 주세요.
- AI 분석은 비용/시간 영향이 커서 필요 시에만 활성화하는 것을 권장합니다.
- `.env` 및 API 키/토큰은 커밋하지 마세요.
