# CSA (Code Static Analyzer) 모듈

AI Code Analyzer의 핵심 분석 엔진입니다. 이 모듈은 소스 코드를 파싱하고 메타데이터를 추출하여 그래프 데이터베이스(Neo4j)에 저장하는 역할을 담당합니다.

## 디렉토리 구조

```
csa/
├── cli/                # 커맨드 라인 인터페이스 (Click 기반)
├── models/             # 그래프 엔티티용 Pydantic 데이터 모델
├── parsers/            # 소스 코드 파서 (Java, SQL, DDL)
├── services/           # 핵심 비즈니스 로직 및 분석 파이프라인
├── utils/              # 헬퍼 유틸리티 (로거, 규칙 등)
├── dbwork/             # 데이터베이스 연결 관리
├── diagrams/           # 다이어그램 생성 로직 (Mermaid, PlantUML)
└── vendor/             # 서드파티 의존성 또는 벤더링된 코드
```

## CLI 레퍼런스

`python -m csa.cli.main <command> [options]` 명령어로 실행할 수 있습니다.

### 1. 분석 (`analyze`)
Java 소스 코드와 데이터베이스 스크립트를 파싱하여 결과를 Neo4j에 저장합니다.

```bash
python -m csa.cli.main analyze [OPTIONS]
```

| 옵션 | 설명 | 기본값 |
|---|---|---|
| `--java-source-folder` | Java 소스 폴더 경로 | 현재 디렉토리 |
| `--project-name` | 프로젝트 이름 (생략 시 폴더명에서 추출) | 자동 감지 |
| `--application-name` | 프로젝트의 애플리케이션 이름 메타데이터 | None |
| `--db-script-folder` | DDL/SQL 스크립트 폴더 경로 | None |
| `--clean` | 분석 전 데이터베이스 초기화 | False |
| `--dry-run` | DB 연결 없이 파싱만 수행 | False |
| `--use-ai` | AI 설명 생성 활성화 (속도 느림) | False |
| `--java-object` | Java 객체만 분석 | False |
| `--db-object` | 데이터베이스 객체만 분석 | False |
| `--all-objects` | Java 및 DB 객체 모두 분석 | False |
| `--class-name` | 특정 클래스만 분석 | None |
| `--update` | 기존 클래스 업데이트 | False |

### 2. 시퀀스 다이어그램 (`sequence`)
특정 클래스나 메서드에 대한 시퀀스 다이어그램을 생성합니다.

```bash
python -m csa.cli.main sequence [OPTIONS]
```

| 옵션 | 설명 | 기본값 |
|---|---|---|
| `--class-name` | **필수**. 대상 클래스 이름 | - |
| `--method-name` | 대상 메서드 이름 | None |
| `--max-depth` | 최대 호출 체인 깊이 | 10 |
| `--include-external` | 외부 라이브러리 호출 포함 | False |
| `--format` | 다이어그램 포맷 (`mermaid`, `plantuml`) | `mermaid` |
| `--image-format` | 이미지 내보내기 (`png`, `svg`, `pdf`, `none`) | `none` |
| `--output-dir` | 출력 디렉토리 | `output/sequence-diagram` |

### 3. 영향도 분석 (`impact-analysis`)
테이블이나 메서드 변경에 따른 영향도를 분석합니다 (역방향 영향도).

```bash
python -m csa.cli.main impact-analysis [OPTIONS]
```

| 옵션 | 설명 | 기본값 |
|---|---|---|
| `--table-name` | 대상 테이블 이름 (class-name과 상호 배타적) | None |
| `--class-name` | 대상 클래스 이름 (table-name과 상호 배타적) | None |
| `--method-name` | 대상 메서드 이름 (class-name과 함께 사용 시 선택 사항) | None |
| `--max-depth` | 최대 호출 깊이 | 10 |
| `--include-json` | JSON 리포트 생성 | False |
| `--generate-diagram` | Mermaid 다이어그램 생성 | False |

### 4. AI 보강 (`ai-enrich`)
그래프의 기존 노드에 AI가 생성한 설명을 추가합니다.

```bash
python -m csa.cli.main ai-enrich [OPTIONS]
```

| 옵션 | 설명 | 기본값 |
|---|---|---|
| `--project-name` | **필수**. 대상 프로젝트 | - |
| `--node-type` | 노드 유형 (`all`, `class`, `method`, `sql`) | `all` |
| `--concurrent` | 동시 AI 요청 수 | 10 |
| `--limit` | 처리할 최대 노드 수 | None |
| `--clean` | 처리 전 기존 설명 삭제 | False |
| `--class-name` | 특정 클래스 대상 | None |

### 5. 클래스 명세서 (`class-spec`)
클래스에 대한 상세 마크다운 명세서를 생성합니다.

```bash
python -m csa.cli.main class-spec [OPTIONS]
```

| 옵션 | 설명 | 기본값 |
|---|---|---|
| `--project-name` | **필수**. 프로젝트 이름 | - |
| `--class-name` | **필수**. 클래스 이름 | - |
| `--include-crud-info` | CRUD 작업 포함 | True |
| `--output-dir` | 출력 디렉토리 | `output/class-spec` |

### 6. CRUD 매트릭스 (`crud-matrix`)
클래스가 테이블에 수행하는 생성/조회/수정/삭제 작업을 매트릭스로 생성합니다.

```bash
python -m csa.cli.main crud-matrix [OPTIONS]
```

| 옵션 | 설명 | 기본값 |
|---|---|---|
| `--project-name` | **필수**. 프로젝트 이름 | - |
| `--output-format` | 출력 포맷 (`excel`, `svg`, `png`) | `excel` |
| `--auto-create-relationships` | 누락된 경우 메서드-SQL 연결 자동 생성 | True |

### 7. 데이터베이스 분석 (`db-analysis`, `db-call-chain`, `db-call-diagram`)
데이터베이스 사용량 및 호출 체인을 분석하는 다양한 명령어입니다.

- `db-analysis`: SQL 통계(개수, 유형)를 보여줍니다.
- `db-call-chain`: 시작 지점부터의 호출 체인 다이어그램을 생성합니다.
- `db-call-diagram`: 전체 프로젝트의 DB 호출 다이어그램을 생성합니다.

## 공통 옵션
대부분의 명령어는 표준 Neo4j 연결 옵션을 지원합니다:
- `--neo4j-uri`: 기본값 `bolt://localhost:7687`
- `--neo4j-user`: 기본값 `neo4j`
- `--neo4j-password`: 기본값은 환경 변수 `NEO4J_PASSWORD`
- `--neo4j-database`: 기본값 `neo4j`

## 라이브러리로 사용하기

```python
from csa.services.analyze_service import analyze_project

result = analyze_project(
    java_source_folder="/path/to/source",
    project_name="MyProject",
    neo4j_uri="bolt://localhost:7687",
    neo4j_user="neo4j",
    neo4j_password="password",
)
```
