# CSA (Code Static Analyzer) for Spring Boot

> Spring Boot 기반 Java 애플리케이션과 데이터베이스 스키마를 자동으로 분석해 **코드 구조 · DB 호출 관계 · 시각화 리포트**를 생성하는 Python 기반 정적 분석 도구입니다.

![Python](https://img.shields.io/badge/Python-3.8+-blue.svg)
![License](https://img.shields.io/badge/License-MIT-green.svg)
![Status](https://img.shields.io/badge/Status-Production-brightgreen.svg)

---

## 개요
- **CSA (Code Static Analyzer)** 는 Java 소스와 DDL을 동시에 읽어 패키지/클래스/메서드/Bean/SQL/테이블 노드를 추출하고 Neo4j 그래프로 저장합니다.
- MyBatis/JPA, Spring Bean, REST Endpoint, Bxm 프레임워크 규칙 등을 자동 식별하며 PlantUML/Mermaid/Excel/Markdown 포맷의 결과물을 생성합니다.
- `.env` 의 `JAVA_SOURCE_FOLDER`, `DB_SCRIPT_FOLDER`, `NEO4J_*` 를 통해 분석 대상과 저장소를 제어합니다.

---

## 주요 기능
1. **Java 정적 분석**: 패키지 → 클래스 → 메서드/필드/내부 클래스, Spring Bean/Endpoint, Lombok, Config 파일까지 추적.
2. **JPA & MyBatis 통합**: Repository/Mapper/SQL 문, ResultMap, CRUD 액션을 Neo4j 관계로 연결.
3. **DB 스키마 파싱**: CREATE/ALTER/INDEX DDL에서 Database·Table·Column·Constraint를 생성.
4. **호출 체인/영향도 분석**: Controller→Service→Repository→SQL→Table 체인, 역방향 영향도, CRUD 매트릭스.
5. **시각화**: Mermaid/PlantUML 시퀀스 다이어그램, CRUD 매트릭스, 영향도 리포트, 클래스 명세서.
6. **AI Enrichment**: LLM으로 Class/Method/SqlStatement에 `ai_description`을 채우고, 필요 시 개별 노드만 강제 재분석.
7. **성능 최적화**: 스트리밍 파서, 파일 복잡도 정렬, DTO 스킵, 동적 배치 사이즈, `.csaignore` 패턴.

---

## 아키텍처 한눈에
| 경로 | 역할 |
| --- | --- |
| `csa/cli` | Click CLI 진입점 (`main.py`, `commands/`). |
| `csa/services` | 분석 파이프라인, Java/DB 파서, Neo4j writer, AI/diagram/impact/class-spec 서비스. |
| `csa/services/java_analysis` | Spring/JPA/MyBatis/Bean Dependency, 스트리밍 파서 등 세부 모듈. |
| `csa/services/db_call_analysis` | Controller→SQL→Table 호출 체인, CRUD, 영향도, 다이어그램. |
| `csa/models` | Pydantic 그래프 엔티티/통계 모델. |
| `csa/parsers` | Java/SQL/DDL 파서 및 vendor `javalang`. |
| `csa/diagrams` | Mermaid/PlantUML 생성기. |
| `utils/`, `rules/` | 로거, 규칙 매니저, 복잡도/LOC 계산, 한글 논리명 규칙.

---

## 빠른 시작 (5단계)
1. **클론 & 이동**
   ```bash
   git clone <repository-url>
   cd lang-parser-bxm5
   ```
2. **가상환경 & 의존성**
   ```bash
   python -m venv .venv
   .venv\Scripts\activate      # Windows
   pip install -r requirements.txt
   ```
3. **환경 변수 설정**
   ```bash
   cp env.example .env
   # .env 편집: NEO4J_URI / NEO4J_DATABASE / NEO4J_USER / NEO4J_PASSWORD
   #           JAVA_SOURCE_FOLDER / DB_SCRIPT_FOLDER / LOG_LEVEL 등
   ```
4. **분석 실행**
   ```bash
   python -m csa.cli.main analyze --all-objects --clean --project-name myproject
   ```
5. **결과 확인**
   - Neo4j 브라우저: `http://localhost:7474`
   - 산출물: `output/sequence-diagram`, `output/crud-matrix`, `output/class-spec`, `output/impact-analysis`

---

## CLI 명령 모음
### analyze
```bash
python -m csa.cli.main analyze --all-objects --clean --project-name myproject
python -m csa.cli.main analyze --java-object --class-name UserController --project-name myproject
python -m csa.cli.main analyze --db-object --project-name myproject --update
```
주요 옵션: `--java-object`, `--db-object`, `--all-objects`, `--clean`, `--update`, `--class-name`, `--use-ai`, `--dry-run`, `--project-name`.

### ai-enrich (AI 설명 추가)
```bash
python -m csa.cli.main ai-enrich --project-name myproject --node-type all --concurrent 15
python -m csa.cli.main ai-enrich --project-name myproject --node-type sql --limit 200
```
- `--node-type`: all/class/method/sql
- `--concurrent`: 동시 AI 요청 수 (`CONCURRENT_AI_REQUESTS` 기본값)
- `--limit`: 최대 처리 노드 수
- `--clean`: 지정한 node-type(또는 all)의 `ai_description`을 모두 지우고 전체 재분석

**전체 클린 + 재분석 예시**
```bash
python -m csa.cli.main ai-enrich --clean --project-name myproject --node-type all
python -m csa.cli.main ai-enrich --clean --project-name myproject --node-type class
python -m csa.cli.main ai-enrich --clean --project-name myproject --node-type method
python -m csa.cli.main ai-enrich --clean --project-name myproject --node-type sql
```

#### ✅ 개별 노드 강제 재분석 예시
이미 `ai_description` 이 채워져 있어도 아래 명령으로 덮어쓸 수 있습니다.
```bash
# 1) 특정 클래스 전체를 재분석
python -m csa.cli.main ai-enrich --project-name myproject --class-name UserService

# 2) 특정 메서드를 재분석 (클래스명 필수)
python -m csa.cli.main ai-enrich --project-name myproject \
  --class-name UserService --method-name getUser

# 3) 특정 SqlStatement (mapper + sql-id 동시 지정)
python -m csa.cli.main ai-enrich --project-name myproject \
  --mapper-name UserMapper --sql-id selectUser
```
CLI가 자동으로 `node-type` 을 전환하고, 해당 노드의 `ai_description` 을 즉시 덮어씁니다.

### sequence
```bash
python -m csa.cli.main sequence --class-name UserController --max-depth 5 --format mermaid
python -m csa.cli.main sequence --class-name OrderController --method-name approve --format plantuml --image-format png
```

### db_call_chain / crud-matrix / db_call_diagram
```bash
python -m csa.cli.main db_call_chain --project-name myproject --start-class UserController
python -m csa.cli.main crud-matrix --project-name myproject --output-format excel
python -m csa.cli.main db_call_diagram --project-name myproject --output-image diagram.png
```

### class-spec / impact-analysis
```bash
python -m csa.cli.main class-spec --project-name myproject --class-name UserService --include-crud-info
python -m csa.cli.main impact-analysis --table-name USER --project-name myproject --include-json --generate-diagram
python -m csa.cli.main impact-analysis --class-name UserService --method-name getUser --max-depth 5
```

---

## 출력 & 리포트
| 출력물 | 경로 | 포맷 |
| --- | --- | --- |
| 시퀀스 다이어그램 | `output/sequence-diagram/<project>/` | Mermaid(.md), PlantUML(.puml), PNG/SVG/PDF |
| CRUD 매트릭스 | `output/crud-matrix/` | Excel(.xlsx), Markdown(.md) |
| 클래스 명세서 | `output/class-spec/<project>/` | Markdown |
| 영향도 리포트 | `output/impact-analysis/` | Markdown, Excel, (옵션) JSON, Mermaid |
| Neo4j 그래프 | `NEO4J_DATABASE` | CALLS / USES_TABLE / MAPS_TO 등 관계 |

---

## 성능 & 튜닝
- `USE_STREAMING_PARSE=true`: 대규모 프로젝트에서 파일 단위로 즉시 저장.
- `JAVA_PARSE_WORKERS`: 기본 max(4, CPU-2). 필요 시 수동 조정.
- `JAVA_FILE_PARSE_TIMEOUT`: 느린 파일 타임아웃(초) 설정.
- `SKIP_DTO_SOURCE=true`, `SKIP_DTO_METHODS=true`: 100+ 필드 DTO 저장/분석을 생략해 속도 향상.
- `.csaignore`: 분석 제외 패턴 정의 (`pathspec` 규칙). 예시는 `docs/.csaignore 기능 활용 가이드.md` 참조.

---

## 테스트
```bash
.venv\Scripts\activate
pytest                       # 전체
pytest tests/unit            # 단위
pytest tests/integration     # 통합
pytest tests/contract        # CLI 계약
pytest --cov=csa tests/      # 커버리지
```
Neo4j 테스트 기본 값: `neo4j://127.0.0.1:7687`, DB `csadb01`, user `csauser`, password `csauser123`.

---

## 문제 해결 FAQ
| 증상 | 점검/해결 |
| --- | --- |
| Neo4j 연결 오류 | `docker ps` 로 DB 실행 여부 확인 → `.env` 의 `NEO4J_*` 재확인 → 브라우저 로그인 테스트 |
| Java 파싱 실패 | Lombok/커스텀 어노테이션 확인, `--dry-run` 으로 재현, `LOG_LEVEL=DEBUG` 로 상세 로그 확인 |
| 메모리 부족 | `USE_STREAMING_PARSE=true`, `JAVA_PARSE_WORKERS` 축소, `.csaignore` 로 제외, DTO 스킵 옵션 적용 |
| Mermaid 이미지 생성 실패 | `npm install -g @mermaid-js/mermaid-cli`, `MMDC_PATH` 설정, Node.js 버전 확인 |
| 기존 데이터 유지하며 분석 | `python -m csa.cli.main analyze --all-objects --update --project-name myproject` |

---

## 문서 & 참고
- [CLAUDE.md](./CLAUDE.md): Claude Code 가이드 (한국어)
- [AGENTS.md](./AGENTS.md): 모든 에이전트를 위한 작업 규칙
- [docs/](./docs/): CLI 옵션, .csaignore, 규칙 템플릿 등 상세 문서
- [rules/](./rules/): 한글 논리명/설명/클래스 subtype 규칙

---

## 라이선스 & 기여
- **License**: [MIT](./LICENSE)
- **기여**: Feature 브랜치 생성 → 변경 → 테스트 → PR 생성

```
git checkout -b feature/amazing-feature
# edit / test
git commit -m "feat: add amazing feature"
git push origin feature/amazing-feature
```

이 문서를 기준으로 CSA 프로젝트를 분석 · 시각화 · AI 보강 workflows 를 일관되게 수행할 수 있습니다. Happy analyzing! :tada:
