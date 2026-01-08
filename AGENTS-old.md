# AGENTS.md

본 문서는 ChatGPT, Claude Code, GitHub Copilot 등 모든 에이전트가 `CSA (Code Static Analyzer)` 저장소를 일관되게 다룰 수 있도록 제공하는 작업 안내서입니다. Spring Boot 기반 Java 프로젝트를 자동 분석해 Neo4j에 투영하고, 시각화·리포트를 생성하는 Python 도구이므로 아래 절차와 규칙을 반드시 준수하세요.

**중요**: 모든 대화는 한국어로 공손하게 한다.

## 1. 프로젝트 스냅샷
- Python CLI가 Spring Boot Java 소스 + DDL을 정적 분석하여 패키지/클래스/메서드/Bean/SQL/DB 스키마를 추출하고 Neo4j에 저장합니다.
- 출력물: Neo4j 그래프, Mermaid/PlantUML 시퀀스 다이어그램, CRUD 매트릭스, 영향도 리포트, 클래스 명세서.
- 주요 강점: 자동 구조 인식(NO-Config), 스트리밍 파서로 대규모 프로젝트 처리, 규칙 기반 한글 논리명 추출, AI Enrichment 옵션.
- 대상 경로는 `.env`의 `JAVA_SOURCE_FOLDER`, `DB_SCRIPT_FOLDER`로 제어하며, Neo4j 연결 정보도 환경 변수에서 주입합니다.

## 2. 리포지토리 지도
| 경로 | 역할 |
| --- | --- |
| `csa/cli` | Click 기반 CLI 진입점과 명령어 (`main.py`, `commands/`). |
| `csa/services` | 분석 파사드, 파이프라인, Neo4j writer, AI/diagram/impact/class-spec 서비스. |
| `csa/services/java_analysis` | Java 파서(프로젝트, Spring, JPA, MyBatis, bean dependency, utils). |
| `csa/services/analysis` | 파이프라인 orchestrator, 옵션 검증, 통계 요약. |
| `csa/services/graph_db` | Neo4j CRUD 및 분석 쿼리. |
| `csa/services/db_call_analysis` | Controller→Service→Repository→SQL→Table 체인/CRUD/다이어그램/영향도. |
| `csa/models` | Pydantic 데이터 모델(그래프 엔티티, 분석 통계, 클래스 명세, 영향도). |
| `csa/parsers` | Java/SQL/DDL 파서와 vendor `javalang`. |
| `csa/diagrams` | 시퀀스/영향도 다이어그램 생성기 (Mermaid/PlantUML). |
| `csa/aiwork` | AI 분석 실행기, provider, prompt, 설정. |
| `utils/` | 로거, 규칙 매니저, 복잡도/LOC 계산, 프로젝트 통계. |
| `rules/` | 한글 논리명·설명·클래스 subtype 규칙 (rule000~003). |
| `commands/` | Windows 배치 스크립트(전체 재분석, CRUD matrix, 다이어그램 등). |
| `docs/`, `gui-design/` | 사용자 가이드와 GUI 초안. |
| `target_src/` | 실제 분석 대상 소스 스냅샷. |
| `output/` | analyze/sequence/crud/class-spec/impact 결과물 저장소. |
| `tests/` | unit, integration, contract, 샘플 Java/JPA 프로젝트.

## 3. 실행 준비
### 3.1 가상환경 & 의존성
```
python -m venv .venv
.venv\Scripts\activate        # Windows
# source .venv/bin/activate    # Linux/Mac
pip install -r requirements.txt
```

### 3.2 환경 변수 (.env 기반)
필수 항목: `NEO4J_URI`, `NEO4J_DATABASE`, `NEO4J_USER`, `NEO4J_PASSWORD`, `JAVA_SOURCE_FOLDER`, `DB_SCRIPT_FOLDER`.
선택/튜닝: `LOG_LEVEL`, `USE_STREAMING_PARSE`, `JAVA_PARSE_WORKERS`, `JAVA_FILE_PARSE_TIMEOUT`, `NEO4J_BATCH_SIZE`, `SKIP_DTO_SOURCE`, `SKIP_DTO_METHODS`, `SEQUENCE_DIAGRAM_OUTPUT_DIR`, `CRUD_MATRIX_OUTPUT_DIR`, `CLASS_SPEC_OUTPUT_DIR`, `IMPACT_ANALYSIS_OUTPUT_DIR`, `USE_AI_ANALYSIS`, `CONCURRENT_AI_REQUESTS`, `AI_PROVIDER`, `MMDC_PATH`.
`.env`는 `env.example`을 복사해 채웁니다.

## 4. CLI 워크플로
### analyze
```
python -m csa.cli.main analyze --all-objects --clean --project-name myproject
```
- 주요 플래그: `--java-object`, `--db-object`, `--all-objects`, `--clean`, `--update`, `--class-name`, `--dry-run`, `--use-ai`, `--project-name`.
- 스트리밍 모드: `USE_STREAMING_PARSE=true` + `JAVA_PARSE_WORKERS` 조정.

### ai-enrich
```
python -m csa.cli.main ai-enrich --project-name myproject --node-type class --concurrent 15 --limit 200
```
- `--node-type`(all/class/method/sql), `--concurrent`, `--limit`로 제어. analyze 이후 누락된 `ai_description` 채움.

### sequence
```
python -m csa.cli.main sequence --class-name UserController --method-name getUser --format mermaid --max-depth 5 --image-format png
```
- Mermaid 기본, `--format plantuml`, `--image-format png|svg|pdf` 옵션.

### crud-matrix / db_call_chain / db_call_diagram
```
python -m csa.cli.main crud-matrix --project-name myproject --output-format excel
python -m csa.cli.main db_call_chain --project-name myproject --start-class UserController
python -m csa.cli.main db_call_diagram --project-name myproject --output-image diagram.png
```

### class-spec
```
python -m csa.cli.main class-spec --project-name myproject --class-name UserService --include-crud-info --output-dir ./docs/specs
```

### impact-analysis
```
python -m csa.cli.main impact-analysis --table-name USER --project-name myproject --max-depth 5 --include-json --generate-diagram
python -m csa.cli.main impact-analysis --class-name UserService --method-name getUser
```
- 테이블 영향도(`--table-name`)와 메서드 영향도(`--class-name`, `--method-name`) 모두 지원.

## 5. 데이터 파이프라인 요약
1. `analyze`: CLI → `analyze_service.py` → `analysis/handlers.py` 옵션 검증/Neo4j 준비 → `java_pipeline.py` (batch or streaming) + `db_pipeline.py` → Java 분석 서브모듈(Spring/JPA/MyBatis/Bean Dependency, utils) → `neo4j_writer.py` 저장.
2. DB 분석: `DBParser.parse_ddl_directory()`로 CREATE/ALTER/INDEX 파싱 후 Database/Table/Column/Constraint 노드 작성.
3. 호출 관계: Neo4j 쿼리 → `db_call_analysis/call_chain.py`, `crud.py`, `diagrams.py`, `impact.py`.
4. 시각화: `diagrams/sequence/generator.py` → Mermaid/PlantUML → 옵션에 따라 이미지 변환.
5. AI Enrichment: `aiwork/ai_analyzer.py`가 Neo4j에서 ai_description 누락 노드 조회 후 provider(`ai_providers.py`)로 병렬 처리.
6. 클래스 명세서: `class_spec/generator.py`가 Neo4j → 템플릿 → Markdown 출력.
7. 영향도 분석: `impact_analysis` 명령이 역방향 호출 체인 추적(`reverse_impact.py`) 후 Markdown/Excel/JSON/Mermaid 리포트 생성.

## 6. 산출물 & Neo4j
- Neo4j: http://localhost:7474, 데이터베이스명은 `.env`의 `NEO4J_DATABASE`. 필요 시 `MATCH (n) DETACH DELETE n`으로 초기화.
- 출력 경로: `output/sequence-diagram/`, `output/crud-matrix/`, `output/class-spec/`, `output/impact-analysis/`.
- 시퀀스 다이어그램은 `.md/.puml` + 선택 이미지, CRUD 매트릭스는 `.xlsx/.md`, 영향도는 `.md/.xlsx/(.json)/Mermaid`, 클래스 명세서는 Markdown.

## 7. 성능 & 튜닝 메모
### v0.6 (2025-11-04)
- `estimate_file_complexity()`로 복잡도 높은 Java 파일을 먼저 배정, 워커 활용률 100% 근접.
- `JAVA_FILE_PARSE_TIMEOUT`(기본 60~120초)으로 느린 파일 타임아웃/재시도.
- `AdaptiveBatchSizer`가 Neo4j 저장 속도를 관찰하여 배치 크기 20~200 동적 조정(+10%/-20%).
- 배치 완료 후 `gc.collect()` 호출, 메모리 급증 억제.
- 분석 전 복잡도 상위 10개 파일을 로깅하여 병목 추적.

### v0.7 DTO 최적화 (2025-11-04)
- `SKIP_DTO_SOURCE=true`시 DTO 클래스 소스 저장 생략, `SKIP_DTO_METHODS=true`로 DTO 메서드 분석 스킵.
- DTO 필드 논리명 추출을 비활성화하여 100+ 필드 DTO 처리 시간을 대폭 단축.
- 옵션은 `.env`에 추가 후 analyze 실행; 필요 시만 false.

## 8. `.csaignore` 사용법
- 위치: 리포지토리 루트. `.gitignore`와 동일한 pathspec 문법.
- 목적: Java 분석에서 제외할 디렉터리/파일 패턴 정의.
- 예시:
```
# 생성 코드
**/generated/**
**/target/generated-sources/**

# 대용량 DTO
**/*DODT.java
**/*DIDT.java
**/*Grid.java

# 패키지 제외
**/com/example/deprecated/**

# Lombok 생성 클래스
**/*$*.java

# 특정 파일 다시 포함
!**/com/example/deprecated/ImportantClass.java
```
- 적용 여부는 로그에 `[INFO] .csaignore 패턴 적용`으로 확인.

## 9. 개발 가이드라인
- PEP 8 + 타입 힌트 필수, public 클래스/함수에는 한국어 Docstring.
- 복잡 로직에만 한국어 인라인 주석을 추가, 불필요한 설명은 금지.
- 한 파일 1000줄, 함수 100줄 이내 유지. 필요 시 모듈 분리.
- 로깅은 `csa.utils.logger.get_logger(__name__)`를 사용; 명령별로 로그 파일이 분리되고 7일 뒤 자동 정리.
- 설정값은 `.env` 또는 헬퍼를 통해 주입하고 하드코딩하지 않습니다.
- Neo4j, 외부 도구 자격 정보는 절대 커밋 금지. 민감 값은 `env.example`에 기본값만 기록.
- DTO/데이터용 대형 파일을 건드릴 때는 `.csaignore` 또는 `SKIP_DTO_*` 옵션으로 범위를 제어.

## 10. 테스트 전략
- 전체: `pytest`
- 단위: `pytest tests/unit`
- 통합: `pytest tests/integration`
- CLI 계약: `pytest tests/contract`
- 특정 파일/테스트: `pytest tests/unit/test_java_parser.py::test_parse_simple_class`
- 커버리지: `pytest --cov=csa tests/`
가상환경 활성화 후 실행, Neo4j 테스트용 기본 계정은 (`neo4j://127.0.0.1:7687`, DB `csadb01`, user `csauser`, pwd `csauser123`).

## 11. Neo4j & DB 주의사항
- `csa.dbwork.connection_pool`을 통해 연결/트랜잭션을 관리하고, 작업 후 `pool.close_all()` 호출.
- 배치 저장 시 트랜잭션 시간이 길어지면 `NEO4J_BATCH_SIZE` 조정.
- 로컬 Neo4j에 데이터가 많을수록 analyze 전 `--clean`으로 초기화하는 것이 안전.

## 12. 문제 해결 팁
1. **Neo4j 연결 오류**: 서버 구동 상태 및 `.env` 자격 증명 확인.
2. **Java 파싱 실패**: `javalang>=0.13.0`인지 확인, `JAVA_FILE_PARSE_TIMEOUT` 증가.
3. **PlantUML/Mermaid 이미지 실패**: `libs/plantuml.jar` 또는 `MMDC_PATH` 점검.
4. **메모리 부족**: 스트리밍 모드 + DTO 스킵 + `.csaignore`로 대상 축소.
5. **로그 확인**: `LOG_LEVEL=DEBUG python -m csa.cli.main analyze ...` 또는 `tail -f logs/csa.log`.

## 13. 작업 체크리스트
- [ ] `.venv` 활성화, 필수 env 설정.
- [ ] `.csaignore`/튜닝 옵션 검토 후 analyze 실행.
- [ ] 변경 전후 Neo4j/출력 경로 영향 파악.
- [ ] 코딩 규칙(타입 힌트, Docstring, 주석 정책) 준수.
- [ ] 필요한 테스트 실행 및 결과 공유.
- [ ] 민감 정보나 대용량 산출물은 커밋에서 제외.

이 가이드를 따르면 어떤 에이전트든 동일한 방식으로 CSA 프로젝트를 분석·확장·디버깅할 수 있습니다.
