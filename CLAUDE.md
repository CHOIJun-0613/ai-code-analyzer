# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## 프로젝트 개요

**CSA (Code Static Analyzer)**는 Spring Boot 기반 Java 애플리케이션을 자동으로 정적 분석하여 다음을 수행하는 Python 기반 도구입니다:

- **Java 코드 분석**: 패키지, 클래스, 메서드, 필드, 내부 클래스 추출 및 Spring Bean/Endpoint 식별
- **JPA & MyBatis 분석**: 엔티티, 매퍼, SQL 문 파싱 및 데이터베이스 매핑
- **데이터베이스 분석**: DDL 파싱으로 Database/Table/Column/Index/Constraint 추출
- **호출 관계 추적**: Method → SQL → Table 호출 체인 분석
- **Neo4j 저장**: 모든 분석 결과를 그래프 데이터베이스에 저장
- **시각화 생성**: PlantUML/Mermaid 시퀀스 다이어그램, CRUD 매트릭스, 호출 체인 다이어그램 생성

**핵심 특징:**
- **NO-Configuration**: 프로젝트 구조를 자동으로 인식
- **Scalable**: 스트리밍 모드로 대규모 프로젝트 지원 (`USE_STREAMING_PARSE=true`)
- **Customizable**: 규칙 기반 논리명/설명 추출 (`csa/rules/`)
- **Multi-Format**: Neo4j, Excel, Markdown, PlantUML, Mermaid 등 다양한 출력

## 핵심 아키텍처

### 모듈 구성

```
csa/
├── cli/                          # Click 기반 CLI 진입점 및 명령어 핸들러
│   ├── main.py                   # CLI 그룹 및 명령어 등록
│   ├── commands/                 # 각 명령어별 핸들러
│   │   ├── analyze.py            # Java/DB 정적 분석 명령
│   │   ├── sequence.py           # 시퀀스 다이어그램 생성 명령
│   │   ├── crud.py               # CRUD 매트릭스/교차표 생성 명령
│   │   ├── db_calls.py           # DB 호출 관계 분석 명령
│   │   ├── graph_queries.py      # Neo4j 그래프 쿼리 명령
│   │   ├── class_spec.py         # 클래스 명세서 생성 명령
│   │   ├── impact.py             # 영향도 분석 명령
│   │   └── ai_enrich.py          # AI Enrichment 명령
│   └── core/                     # 명령어 공용 로직
│       ├── lifecycle.py          # 명령어 라이프사이클 관리
│       └── storage.py            # 저장소 관리
│
├── models/                       # Pydantic 데이터 모델
│   ├── graph_entities.py         # Neo4j 그래프 엔티티
│   │                            # (Project, Package, Class, Method, Field, Annotation)
│   │                            # (Bean, Endpoint, BeanDependency)
│   │                            # (MyBatisMapper, MyBatisSqlStatement, SqlStatement)
│   │                            # (JpaEntity, JpaRepository, JpaQuery)
│   │                            # (Database, Table, Column, Index, Constraint)
│   ├── analysis.py              # 분석 통계 모델
│   ├── class_spec.py            # 클래스 명세서 모델
│   └── impact.py                # 영향도 분석 모델
│
├── services/                     # 핵심 분석 엔진
│   ├── analyze_service.py        # 분석 파사드 (진입점)
│   │
│   ├── analysis/                 # 분석 파이프라인 오케스트레이션
│   │   ├── handlers.py           # Java/DB 파이프라인 실행 및 초기화
│   │   ├── java_pipeline.py      # 배치/스트리밍 Java 파서 관리
│   │   ├── db_pipeline.py        # DDL 디렉터리 분석 및 저장
│   │   ├── neo4j_writer.py       # Neo4j 데이터 저장 및 통계 계산
│   │   ├── options.py            # CLI 옵션 검증
│   │   └── summary.py            # 분석 결과 요약 통계
│   │
│   ├── java_analysis/            # Java 파싱 세부 모듈
│   │   ├── project.py            # 패키지, 클래스, 메서드, 필드, 내부 클래스 분석
│   │   ├── spring.py             # Spring 어노테이션 (@Component, @Autowired 등)
│   │   ├── jpa.py                # JPA 엔티티, 레포지토리, 쿼리 분석
│   │   ├── mybatis.py            # MyBatis 매퍼 및 SQL 추출
│   │   ├── config.py             # application.yml/properties 분석
│   │   ├── tests.py              # 테스트 코드 식별
│   │   ├── bean_dependency_resolver.py  # Bean 의존성 재구성
│   │   └── utils.py              # 파싱 유틸리티 함수
│   │
│   ├── graph_db/                 # Neo4j 데이터베이스 CRUD 및 분석
│   │   ├── base.py               # 기본 연결, 트랜잭션 관리
│   │   ├── project_nodes.py      # Project 노드 CRUD
│   │   ├── application_nodes.py  # Class/Method/Field 노드 CRUD
│   │   ├── persistence_nodes.py  # Bean/Endpoint/Mapper/SQL 노드 CRUD
│   │   ├── database_nodes.py     # Database/Table/Column 노드 CRUD
│   │   ├── analytics.py          # 분석 쿼리 (SQL 복잡도, 테이블 사용량)
│   │   ├── maintenance.py        # 유지보수 작업
│   │   └── indexes.py            # 인덱스 관리
│   │
│   ├── db_call_analysis/         # DB 호출 관계 분석
│   │   ├── base.py               # 기본 클래스
│   │   ├── call_chain.py         # Controller→Service→Repository→SQL→Table 체인
│   │   ├── crud.py               # CRUD 매트릭스 생성
│   │   ├── diagrams.py           # 호출 체인 Markdown/이미지 다이어그램
│   │   ├── impact.py             # 영향도 분석
│   │   ├── impact_reporter.py    # 영향도 분석 리포트 생성
│   │   ├── reverse_impact.py     # 역방향 영향도 분석 (테이블→메서드)
│   │   └── reports.py            # 리포트 생성
│   │
│   ├── class_spec/               # 클래스 명세서 생성
│   │   ├── generator.py          # 명세서 생성 오케스트레이션
│   │   ├── repository.py         # 클래스 정보 저장소
│   │   └── template.py           # 명세서 템플릿
│   │
│   ├── ai_enrichment_service.py  # AI Enrichment 서비스
│   │
│   ├── java_parser.py            # Java 파싱 파사드
│   ├── java_parser_addon_r001.py # 논리명 추출 규칙 엔진
│   ├── sql_parser.py             # SQL 문 분석 헬퍼
│   └── db_parser.py              # DDL 디렉터리 파서
│
├── parsers/                      # 저수준 파싱 엔진
│   ├── java/
│   │   ├── logical_name.py       # 클래스/메서드/필드 논리명 추출
│   │   ├── description.py        # 설명 추출
│   │   └── class_subtype.py      # 클래스 하위 타입 추출 (Controller, Service 등)
│   ├── db/
│   │   └── ddl_parser.py         # DDL 구조 분석
│   ├── sql/
│   │   └── parser.py             # SQL 문 파싱
│   ├── base.py                   # 기본 파서 인터페이스
│   └── vendor/javalang/          # Java AST 파서 라이브러리
│
├── diagrams/                     # 시각화 생성
│   ├── sequence/
│   │   ├── generator.py          # 다이어그램 생성 오케스트레이션
│   │   ├── mermaid.py            # Mermaid 형식 생성기
│   │   ├── plantuml.py           # PlantUML 형식 생성기
│   │   └── repository.py         # 호출 체인 저장소
│   └── impact/
│       └── mermaid_generator.py  # 영향도 다이어그램 생성
│
├── dbwork/                       # Neo4j 연결풀 관리
│   └── connection_pool.py        # 커넥션 풀 (스레드 안전, 트랜잭션)
│
├── utils/                        # 공용 유틸리티
│   ├── logger.py                 # 커스텀 로거 (명령별 분리, 7일 자동 정리)
│   ├── rules_manager.py          # 규칙 매니저
│   ├── class_helpers.py          # 클래스 유틸리티 함수
│   ├── cognitive_complexity.py   # 인지 복잡도 계산
│   ├── loc_calculator.py         # LOC 계산 (PLOC/LLOC/CLOC)
│   ├── code_complexity.py        # 코드 복잡도 계산
│   └── project_statistics.py     # 프로젝트 통계
│
├── aiwork/                       # AI 분석 작업
│   ├── ai_analyzer.py            # AI 분석 엔진 (배치 처리)
│   ├── ai_providers.py           # 다중 AI 제공자 (Google, Groq, LM Studio, OpenAI)
│   ├── prompt.py                 # 프롬프트 템플릿
│   └── ai_config.py              # AI 설정 관리
│
├── rules/                        # 논리명/설명 추출 규칙 정의 (Markdown)
│   ├── rule000_analysis_rule.md  # Bxm Framework 분석 규칙
│   ├── rule001_extraction_logical_name.md
│   ├── rule002_extraction_description.md
│   └── rule003_extraction_class_subtype.md  # 클래스 하위 타입 추출
│
└── vendor/                       # 외부 라이브러리
    └── javalang/                 # Java 파싱 라이브러리 (AST 생성)
```

### 핵심 데이터 플로우

#### 1. **배치 모드 Java 분석 (기본값)**
```
사용자 명령
    ↓
analyze.py → analyze_service.py
    ↓
handlers.py: validate_analyze_options() & prepare_neo4j()
    ↓
java_pipeline.py: parse_java_project_full()
    │
    ├─→ java_analysis/project.py: 패키지, 클래스, 메서드, 필드, 내부 클래스 추출
    ├─→ java_analysis/spring.py: Spring Bean/Endpoint/Config 식별
    ├─→ java_analysis/jpa.py: JPA 엔티티/레포지토리 분석
    ├─→ java_analysis/mybatis.py: MyBatis 매퍼/SQL 추출
    └─→ java_analysis/bean_dependency_resolver.py: Bean 의존성 재구성
    ↓
java_analysis/utils.py: 논리명/설명 추출
    ↓
neo4j_writer.py: 수집된 모든 데이터를 Neo4j에 저장
    ↓
Neo4j 그래프 데이터베이스
```

#### 2. **스트리밍 모드 Java 분석 (대규모 프로젝트용)**
```
java_pipeline.py: parse_java_project_streaming()
    ↓
파일 단위 처리 (병렬 워커 활용)
    ↓
각 파일마다 Neo4j 즉시 갱신 (메모리 절감)
    ↓
Neo4j 그래프 데이터베이스
```
**활성화**: `USE_STREAMING_PARSE=true` 환경 변수 설정

#### 3. **DB 분석**
```
DBParser.parse_ddl_directory()
    ↓
DDL 파일 (CREATE TABLE, ALTER 등) 파싱
    ↓
Database, Table, Column, Index, Constraint 객체 생성
    ↓
neo4j_writer.py: Database 노드 저장
    ↓
Neo4j 그래프 데이터베이스
```

#### 4. **호출 관계 분석**
```
Neo4j 쿼리
    ↓
db_call_analysis/call_chain.py: Method → SQL → Table 추적
    ↓
관계 그래프 생성 (CALLS, USES_TABLE, MAPS_TO)
    ↓
영향도 분석 (impact.py)
    ↓
리포트/다이어그램 생성
```

#### 5. **시각화 생성**
```
diagrams/sequence/generator.py
    ↓
Neo4j 데이터 쿼리
    ↓
├─→ mermaid.py: Mermaid 형식 (.md)
├─→ plantuml.py: PlantUML 형식 (.puml)
└─→ (옵션) PlantUML/Mermaid CLI로 이미지 변환
    ↓
output/sequence-diagram/ 에 저장
```

#### 6. **AI 분석 아키텍처**
```
Option 1: AI 분석 없이 빠른 파싱 (기본값)
analyze 명령어 (--use-ai 옵션 없음)
    ↓
Java/DB 파싱 (AI 분석 건너뜀)
    ↓
Neo4j에 저장 (ai_description은 빈 문자열)
    ↓
파싱 완료 (빠른 속도)

Option 2: AI 분석 포함 파싱 (--use-ai 옵션)
analyze 명령어 --use-ai
    ↓
Java/DB 파싱 + 실시간 AI 분석
    ↓
Neo4j에 저장 (ai_description 포함)
    ↓
파싱 완료 (느림, LLM API 호출 포함)

Option 3: AI Enrichment (사후 AI 분석)
ai-enrich 명령어
    ↓
Neo4j에서 ai_description 없는 노드 조회
    ↓
배치 처리로 AI 분석 (진행률 표시)
    │
    ├─→ Class AI 분석 → ai_description 업데이트
    ├─→ Method AI 분석 → ai_description 업데이트
    └─→ SQL AI 분석 → ai_description 업데이트
    ↓
Neo4j 업데이트 (ai_description 채움)
```

**권장 사용 시나리오:**
- **빠른 개발**: Option 1 (기본) → 필요시 Option 3
- **완전 자동화**: Option 2 (파싱과 AI 분석 동시)
- **선택적 AI**: Option 1 → ai-enrich로 특정 노드만 처리

#### 7. **클래스 명세서 생성**
```
class-spec 명령어
    ↓
Neo4j에서 클래스 정보 조회
    ↓
class_spec/repository.py: 데이터 수집
    ├─→ 클래스 기본 정보 (이름, 패키지, 타입, 하위 타입)
    ├─→ 메서드 목록 (시그니처, 논리명, 복잡도)
    ├─→ 필드 목록 (타입, 논리명)
    ├─→ Bean 의존성
    └─→ CRUD 정보 (사용하는 테이블)
    ↓
class_spec/template.py: Markdown 템플릿 적용
    ↓
class_spec/generator.py: 파일 생성
    ↓
output/class-spec/ 에 저장
```

#### 8. **영향도 분석**
```
impact-analysis 명령어
    ↓
[테이블 영향도 분석]
reverse_impact.py: analyze_table_impact_reverse()
    ├─→ 테이블 사용하는 SQL 조회
    ├─→ SQL 호출하는 메서드 추적 (역방향)
    ├─→ 메서드 호출하는 상위 메서드 추적 (재귀, max_depth)
    └─→ 영향받는 클래스/패키지 집계
    ↓
[메서드 영향도 분석]
reverse_impact.py: analyze_method_impact_reverse()
    ├─→ 메서드 호출하는 상위 메서드 추적 (역방향)
    ├─→ 재귀적 호출 체인 분석 (max_depth)
    └─→ 영향받는 클래스/패키지 집계
    ↓
impact_reporter.py: 리포트 생성
    ├─→ Markdown 리포트 (상세 정보)
    ├─→ Excel 리포트 (표 형식)
    ├─→ JSON 리포트 (선택사항)
    └─→ Mermaid 다이어그램 (선택사항)
    ↓
output/impact-analysis/ 에 저장
```

### Neo4j 그래프 모델

- **프로젝트 노드**: `Project`
- **코드 노드**: `Class`, `Method`, `Field`, `Package`, `Annotation`
- **Spring Boot 노드**: `Bean`, `Endpoint`, `BeanDependency`
- **영속성 노드**: `MyBatisMapper`, `MyBatisSqlStatement`, `SqlStatement`, `JpaEntity`, `JpaRepository`, `JpaQuery`
- **데이터베이스 노드**: `Database`, `Table`, `Column`, `Index`, `Constraint`
- **관계**: `BELONGS_TO`, `HAS_METHOD`, `CALLS`, `USES_TABLE`, `INJECTS`, `MAPS_TO` 등

## 개발 환경 설정

### 초기 설정

```bash
# 가상 환경 생성 및 활성화
python -m venv .venv
.venv\Scripts\activate  # Windows
# source .venv/bin/activate  # Linux/Mac

# 의존성 설치
pip install -r requirements.txt

# 환경 변수 설정 (.env 파일 생성)
cp env.example .env
```

### 필수 환경 변수

```
# Neo4j 연결 설정 (필수)
NEO4J_URI=neo4j://127.0.0.1:7687
NEO4J_DATABASE=csadb01
NEO4J_USER=csauser
NEO4J_PASSWORD=csauser123

# 분석 대상 경로 (필수)
JAVA_SOURCE_FOLDER=target_src/car-center-devlab
DB_SCRIPT_FOLDER=target_src/car-center-devlab/src/main/resources/db/prod

# 출력 디렉터리 (선택사항)
LOG_LEVEL=INFO
SEQUENCE_DIAGRAM_OUTPUT_DIR=./output/sequence-diagram
CRUD_MATRIX_OUTPUT_DIR=./output/crud-matrix
CLASS_SPEC_OUTPUT_DIR=./output/class-spec
IMPACT_ANALYSIS_OUTPUT_DIR=./output/impact-analysis

# 성능 최적화 (선택사항)
USE_STREAMING_PARSE=true                # 스트리밍 모드 활성화 (대규모 프로젝트용)
JAVA_PARSE_WORKERS=자동 설정            # 병렬 워커 수 (기본값: max(4, CPU 코어수-2), 수동 설정 가능)
JAVA_FILE_PARSE_TIMEOUT=120.0           # 파일 파싱 타임아웃 (초, 기본값: 120.0)
JAVA_COMPLEXITY_THRESHOLD=50000         # 파일 복잡도 임계값 (초과 시 분석 제외)
SKIP_DTO_SOURCE=true                    # DTO 소스 코드 저장 건너뛰기 (성능 향상, 기본값: false)
SKIP_DTO_METHODS=true                   # DTO 메서드 분석 생략 (기본값: true)

# AI 분석 설정 (선택사항)
USE_AI_ANALYSIS=true                    # AI 분석 시스템 활성화 (기본값: false)
CONCURRENT_AI_REQUESTS=15               # AI enrichment 동시 요청 수 (기본값: 10, 로컬: 10-20, 클라우드: 5-10)
AI_PROVIDER=lmstudio                    # AI provider (google, groq, lmstudio, openai)

# 외부 도구 경로 (선택사항)
MMDC_PATH=/path/to/mmdc                 # Mermaid CLI 경로
```

## 주요 명령어

### 분석 명령어

```bash
# 전체 재분석 (Java + DB, 기존 데이터 삭제)
python -m csa.cli.main analyze --all-objects --clean --project-name myproject

# Java 소스만 재분석 (스트리밍 모드)
python -m csa.cli.main analyze --java-object --clean --project-name myproject

# DB 스키마만 재분석
python -m csa.cli.main analyze --db-object --clean --project-name myproject

# 특정 클래스만 분석
python -m csa.cli.main analyze --java-object --class-name UserController --project-name myproject

# 업데이트 모드 (기존 데이터 유지, 신규 항목만 추가)
python -m csa.cli.main analyze --all-objects --update --project-name myproject

# 드라이런 (Neo4j 연결 없이 파싱만 수행, 디버깅용)
python -m csa.cli.main analyze --java-object --dry-run

# 병렬 처리 워커 수 지정
python -m csa.cli.main analyze --all-objects --project-name myproject

# AI 분석 포함 (느림)
python -m csa.cli.main analyze --all-objects --clean --use-ai --project-name myproject
```

**옵션 설명:**
- `--all-objects`: Java + DB 모두 분석
- `--java-object`: Java 소스만 분석
- `--db-object`: DB 스키마만 분석
- `--clean`: 기존 프로젝트 노드 삭제 후 재분석
- `--update`: 기존 데이터 유지하고 새로운 항목만 추가
- `--use-ai`: AI 분석 포함 (느림, 나중에 ai-enrich로 보완 가능)
- 병렬 처리는 `.env`의 `JAVA_PARSE_WORKERS` 등 환경 변수로 제어합니다.
- `--class-name <이름>`: 특정 클래스만 분석
- `--project-name <이름>`: Neo4j에 저장할 프로젝트명
- `--dry-run`: Neo4j 연결 없이 파싱만 수행

### AI Enrichment (Phase 2)

```bash
# 모든 노드 타입에 AI 설명 추가
python -m csa.cli.main ai-enrich --project-name myproject

# Class 노드만 AI enrichment
python -m csa.cli.main ai-enrich --project-name myproject --node-type class

# Method 노드만 AI enrichment
python -m csa.cli.main ai-enrich --project-name myproject --node-type method

# SQL 노드만 AI enrichment
python -m csa.cli.main ai-enrich --project-name myproject --node-type sql

# 동시 요청 수 조절 (비동기 병렬 처리, 성능 향상)
python -m csa.cli.main ai-enrich --project-name myproject --concurrent 20

# 최대 처리 노드 수 제한
python -m csa.cli.main ai-enrich --project-name myproject --limit 100

# 로컬 LLM (LM Studio) 사용 시 권장 설정
python -m csa.cli.main ai-enrich --project-name myproject --concurrent 15
```

**옵션 설명:**
- `--project-name`: 프로젝트명 (필수)
- `--node-type`: 처리할 노드 타입 (all, class, method, sql, 기본값: all)
- `--concurrent`: 동시 AI 요청 수 (기본값: 10 또는 CONCURRENT_AI_REQUESTS, 로컬: 10-20, 클라우드: 5-10)
- `--limit`: 최대 처리 노드 수 (기본값: 전체)
- `--batch-size`: (deprecated) --concurrent 사용 권장

**사용 시나리오:**
1. 빠른 파싱: `analyze` (AI 분석 없음, 기본값)
2. AI enrichment: `ai-enrich`로 선택적으로 AI 설명 추가
3. Rate Limit 발생 시 `--concurrent`로 조절하여 재시도

### 시퀀스 다이어그램 생성

```bash
# Mermaid 형식 (기본)
python -m csa.cli.main sequence --class-name UserController

# 특정 메서드만 분석
python -m csa.cli.main sequence --class-name UserController --method-name getUser

# PlantUML 형식
python -m csa.cli.main sequence --class-name UserController --format plantuml

# 이미지로 변환 (PNG/SVG/PDF)
python -m csa.cli.main sequence --class-name UserController --image-format png

# 호출 깊이 제한
python -m csa.cli.main sequence --class-name UserController --max-depth 5
```

### DB 호출 관계 분석

```bash
# 전체 프로젝트 호출 체인 분석
python -m csa.cli.main db_call_chain --project-name myproject

# 특정 클래스부터 시작하는 호출 체인
python -m csa.cli.main db_call_chain --project-name myproject --start-class UserController

# CRUD 매트릭스 생성
python -m csa.cli.main crud-matrix --project-name myproject --output-format excel

# DB 호출 체인 다이어그램 생성
python -m csa.cli.main db_call_diagram --project-name myproject --output-image diagram.png
```

### 클래스 명세서 생성

```bash
# 클래스 명세서 생성 (기본)
python -m csa.cli.main class-spec --project-name myproject --class-name UserController

# CRUD 정보 포함
python -m csa.cli.main class-spec --project-name myproject --class-name UserService --include-crud-info

# 출력 디렉터리 지정
python -m csa.cli.main class-spec --project-name myproject --class-name UserRepository --output-dir ./docs/specs
```

**옵션 설명:**
- `--project-name`: 프로젝트명 (필수)
- `--class-name`: 클래스명 (단순명 또는 FQCN, 필수)
- `--output-dir`: 출력 디렉터리 (기본값: output/class-spec)
- `--include-crud-info`: CRUD 정보 포함 (기본값: True)
- `--include-diagram`: 클래스 다이어그램 포함 (미구현)

### 영향도 분석

```bash
# 테이블 영향도 분석 (기본)
python -m csa.cli.main impact-analysis --table-name USER

# 특정 프로젝트의 테이블 영향도 분석
python -m csa.cli.main impact-analysis --table-name USER --project-name myproject

# 테이블 영향도 분석 (JSON + 다이어그램 포함)
python -m csa.cli.main impact-analysis --table-name USER --include-json --generate-diagram

# 메서드 영향도 분석
python -m csa.cli.main impact-analysis --class-name UserService --method-name getUser --project-name myproject

# 클래스의 모든 public 메서드 영향도 분석
python -m csa.cli.main impact-analysis --class-name UserService --project-name myproject

# 호출 깊이 제한 및 다이어그램 생성
python -m csa.cli.main impact-analysis --table-name ORDER --max-depth 5 --generate-diagram
```

**옵션 설명:**
- `--table-name`: 테이블명 (테이블 영향도 분석 시 필수)
- `--class-name`: 클래스명 (메서드 영향도 분석 시 필수)
- `--method-name`: 메서드명 (선택사항, 생략 시 모든 public 메서드)
- `--project-name`: 프로젝트명 (선택사항, 생략 시 전체 프로젝트)
- `--max-depth`: 최대 호출 깊이 (기본값: 10)
- `--include-json`: JSON 파일 추가 생성 (기본값: False)
- `--generate-diagram`: Mermaid 다이어그램 생성 (기본값: False)
- `--output-dir`: 출력 디렉터리 (기본값: output/impact-analysis)

**출력 파일:**
- Markdown 리포트: 상세 정보 (항상 생성)
- Excel 리포트: 표 형식 (항상 생성)
- JSON 리포트: 구조화된 데이터 (선택사항)
- Mermaid 다이어그램: 시각화 (선택사항)

### 배치 스크립트 (Windows)

```bash
commands\1-1.전체재분석.bat           # 전체 재분석
commands\1-2.자바재분석.bat           # Java만 재분석
commands\1-3.DB재분석.bat             # DB만 재분석
commands\2-1.시퀀스-PlantUML-SVG.bat  # 시퀀스 다이어그램 생성
commands\2-2.CRUD-Matrix.bat          # CRUD 매트릭스 생성
```

### 테스트

```bash
# 전체 테스트 실행 (가상환경 활성화 필수)
.venv\Scripts\activate  # Windows
pytest

# 단위 테스트만 실행
pytest tests/unit

# 통합 테스트만 실행
pytest tests/integration

# 계약 테스트만 실행 (CLI 인터페이스 테스트)
pytest tests/contract

# 특정 테스트 파일 실행
pytest tests/unit/test_java_parser.py

# 특정 테스트 메서드 실행
pytest tests/unit/test_java_parser.py::test_parse_simple_class

# 테스트명 패턴 매칭
pytest tests/integration -k end_to_end

# 상세한 로그 출력
pytest -v --tb=short

# 테스트 커버리지 확인
pytest --cov=csa tests/
```

**테스트 구조:**
- `tests/unit/`: 개별 모듈 단위 테스트
- `tests/integration/`: 엔드-투-엔드 통합 테스트
- `tests/contract/`: CLI 인터페이스 및 외부 계약 테스트
- `tests/sample_java_project/`: Java 파싱 테스트용 샘플 코드
- `tests/sample_jpa_project/`: JPA 분석 테스트용 샘플 코드

## 코딩 가이드라인

### 스타일 및 네이밍

- **PEP 8 준수**: 4칸 들여쓰기, `snake_case` 함수/모듈, `PascalCase` 클래스
- **타입 힌트 사용**: 모든 함수 시그니처에 타입 힌트 추가
- **Pydantic 모델 활용**: 데이터 검증 및 직렬화에 Pydantic 사용
- **로깅**: `csa.utils.logger.get_logger(__name__)` 사용
- **환경 변수**: `.env` 파일과 헬퍼 함수를 통해 주입, 하드코딩 금지

### 코드 구조

- **함수 모듈화**: 하나의 함수는 100줄 이내 유지
- **파일 크기**: 하나의 파일은 1000줄 이내 유지 (초과 시 분리)
- **의존성 주입**: 전역 변수 대신 헬퍼를 통해 의존성 주입
- **에러 핸들링**: 명확한 예외 처리 및 로깅

### 주석 및 문서화

- **Docstring**: 모든 public 함수/클래스에 한국어 docstring 작성
- **인라인 주석**: 복잡한 로직에는 한국어 주석 추가
- **타입 힌트**: 코드의 자기 문서화를 위해 타입 힌트 필수

### 테스트 가이드

- **가상 환경 활성화**: Python 프로그램 실행 시 반드시 `.venv\Scripts\activate` 또는 `runvenv.bat` 실행
- **임시 테스트**: `./tests` 폴더에 생성
- **Neo4j 테스트 연결**:
  - URI: `neo4j://127.0.0.1:7687`
  - Database: `csadb01`
  - User: `csauser`
  - Password: `csauser123`

## 주요 분석 대상

### Java 코드 분석

- **클래스**: 일반 클래스, 인터페이스, 추상 클래스, Enum
- **메서드**: 시그니처, 접근 제어자, 메서드 호출 체인
- **필드**: 타입, 어노테이션, 초기값
- **어노테이션**: Spring Boot, JPA, MyBatis, 테스트 프레임워크
- **패키지**: 구조 및 논리적 그룹핑

### Spring Boot 특화 분석

- **Bean**: `@Component`, `@Service`, `@Repository`, `@Controller`, `@Configuration`
- **의존성 주입**: `@Autowired`, `@Inject`, 생성자 주입
- **Endpoint**: `@RestController`, `@RequestMapping`, HTTP 메서드
- **JPA**: `@Entity`, `@Table`, `@Column`, 관계 어노테이션
- **MyBatis**: `@Mapper`, XML 매퍼, SQL 문
- **설정**: `application.yml`, `application.properties`

### 데이터베이스 분석

- **DDL 파싱**: `CREATE TABLE`, `ALTER TABLE`, `CREATE INDEX`
- **테이블**: 컬럼, 제약조건, 인덱스
- **SQL 문**: SELECT, INSERT, UPDATE, DELETE (MyBatis/JPA Native Query)
- **호출 관계**: Controller → Service → Repository → SQL → Table

## 논리명 추출 규칙

프로젝트는 `java_parser_addon_r001.py` 및 `csa/parsers/java/logical_name.py`를 통해 Java 코드의 논리명을 추출합니다. 규칙 정의는 `csa/rules/` 디렉토리에 저장됩니다.

- **패키지 논리명**: 패키지명 → 한글 논리명 매핑
- **클래스 논리명**: 주석, JavaDoc, 어노테이션에서 추출
- **메서드 논리명**: 주석, 메서드명 패턴 분석
- **필드 논리명**: 주석, 변수명 분석

## 최근 구현 완료 기능

### 핵심 기능
- **Inner Class 지원** (`csa/services/java_analysis/project.py`): 내부 클래스 중복 제거 및 선언부만 추출
- **Bean Dependency Resolver** (`csa/services/java_analysis/bean_dependency_resolver.py`): Constructor/Setter/Field Injection 지원
- **스트리밍 모드** (`USE_STREAMING_PARSE=true`): 대규모 프로젝트 메모리 효율성
- **로그 파일 분리** (`csa/utils/logger.py`): 명령별 로그 파일 분리 및 7일 자동 정리
- **병렬 처리** (`JAVA_PARSE_WORKERS`): 멀티코어 활용으로 분석 속도 향상 (자동 설정: max(4, CPU-2))

### 새로운 메트릭 및 분석
- **인지 복잡도** (`csa/utils/cognitive_complexity.py`): 메서드 인지 복잡도 계산 (Method.cognitive_complexity)
- **코드 복잡도** (`csa/utils/code_complexity.py`): 클래스 코드 복잡도 계산 (Class.code_complexity)
- **LOC 메트릭** (`csa/utils/loc_calculator.py`): PLOC (Physical LOC), LLOC (Logical LOC), CLOC (Comment LOC)
- **클래스 하위 타입** (`csa/parsers/java/class_subtype.py`): Controller, Service, Repository 등 자동 식별

### 새로운 CLI 명령어
- **클래스 명세서 생성** (`class-spec`): 클래스 상세 명세서 자동 생성 (Markdown)
- **영향도 분석** (`impact-analysis`): 테이블/메서드 변경 시 영향도 역추적 분석
- **AI Enrichment** (`ai-enrich`): 사후 AI 분석으로 노드에 AI 설명 추가

### AI 통합
- **다중 AI 제공자** (`csa/aiwork/ai_providers.py`): Google Gemini, Groq, LM Studio, OpenAI 지원
- **비동기 병렬 처리** (`CONCURRENT_AI_REQUESTS`): AI enrichment 동시 요청 수 조절
- **선택적 AI 분석**: 파싱 시 (`--use-ai`) 또는 사후 (`ai-enrich`) 선택 가능

### Bxm Framework 지원
- **Bxm 어노테이션 분석** (`rule000`): @BxmCategory, @BxmDataAccess, @BxmOmm_Field 등
- **MyBatis 확장**: .dbio 파일 지원 (Bxm Framework 전용 매퍼 확장자)

### ⚡ 성능 개선 v0.6 (2025-11-04)

**문제점:**
- 739개 파일 분석에 44분 20초 소요 (1개 파일이 42분 소요)
- 워크로드 불균형으로 7개 워커 유휴
- 배치 저장 시간 과다 (1개 클래스에 27초)
- 메모리 사용량 2.1배 증가 (181MB → 382MB)

**개선 내용:**

1. **파일 복잡도 기반 정렬** (`estimate_file_complexity()`)
   - 복잡도 높은 파일을 먼저 워커에 배정
   - 라인 수, 필드 수, 메서드 수, Inner class 수, 어노테이션 수 기반 점수 계산
   - 워크로드 균형 개선으로 전체 처리 시간 단축

2. **파일 파싱 타임아웃 설정**
   - 환경 변수 `JAVA_FILE_PARSE_TIMEOUT` (기본값: 60초)
   - 느린 파일 타임아웃 처리 및 재시도 가능
   - 단일 파일이 전체 분석을 블록하는 문제 해결

3. **동적 배치 크기 조정** (`AdaptiveBatchSizer`)
   - Neo4j 저장 성능에 따라 배치 크기 자동 조정 (20-200)
   - 저장 시간 5초 미만: 배치 크기 10% 증가
   - 저장 시간 20초 초과: 배치 크기 20% 감소
   - 최적의 처리 속도 자동 유지

4. **메모리 명시적 해제**
   - 배치 저장 후 `gc.collect()` 호출
   - 파싱 데이터 즉시 해제로 메모리 사용량 감소
   - 대규모 프로젝트 분석 시 OOM 방지

5. **복잡도 상위 파일 로깅**
   - 분석 전 복잡도 상위 10개 파일 출력
   - 느린 파일 사전 식별 및 모니터링
   - 성능 문제 예측 가능

**예상 효과:**
- 전체 분석 시간: 44분 → **2-5분** (89-95% 개선)
- 워커 활용률: 12.5% → **100%**
- 메모리 사용량: **40% 감소**
- 배치 저장 시간: **80% 개선**

**사용 방법:**
```bash
# .env 파일에 추가
JAVA_FILE_PARSE_TIMEOUT=60.0  # 파일 파싱 타임아웃 (초)
JAVA_PARSE_WORKERS=8          # 병렬 워커 수
NEO4J_BATCH_SIZE=50           # 초기 배치 크기 (자동 조정됨)
```

### ⚡ 성능 개선 v0.7 (2025-11-04): DTO 최적화 (소스 저장 + 필드 논리명 추출 건너뛰기)

**문제점:**
- DTO 클래스(100+ 필드)가 파싱과 저장 모두에서 병목 발생
- 파싱 시간: 60-380초 (일반 클래스 대비 10-50배)
- DB 저장 시간: 1개 클래스에 26-33초 (정상 20-46개 클래스 3-5초)

**실제 분석 결과 (SKIP_DTO_SOURCE=true 테스트):**
- 소스 저장 건너뛰어도 여전히 느림 (379초 파일 존재)
- **진짜 병목**: 필드 논리명 추출 (각 필드마다 전체 파일 검색)
- 100개 필드 × 2초/필드 = 200초 소요
- O(n²) 복잡도로 필드 많을수록 기하급수적 증가

**개선 내용:**

1. **DTO 클래스 자동 판별** (`is_dto_class()`)
   - 클래스명 패턴: DTO, DODT, DIDT, ODT, IDT, VO, Entity, Grid 등
   - 내용 기반: 필드 20개 이상 & 비즈니스 메서드 3개 이하
   - Inner class도 동일하게 적용

2. **조건부 소스 저장**
   - 환경 변수 `SKIP_DTO_SOURCE=true` 설정 시 DTO 소스 저장 안 함
   - 클래스 메타데이터(이름, 타입, 어노테이션 등)는 정상 저장
   - 필드/메서드 정보는 모두 저장 (분석에 필요)

3. **필드 논리명 추출 건너뛰기 (v0.7 추가)**
   - `SKIP_DTO_SOURCE=true` 시 DTO 필드 논리명 추출 건너뛰기
   - 100개 필드: 200초 → 5초 (95% 단축)
   - DTO는 자동 생성 코드로 필드명이 이미 명확하므로 논리명 불필요

4. **성능 영향 (v0.7 개선)**
   - 파싱 시간: **70-90% 절감** (필드 논리명 추출 제거로 획기적 개선)
     - 예: 380초 → 38-114초
   - DB 저장 시간: **40-60% 절감** (대용량 문자열 저장 제거)
   - 메모리 사용량: **30-40% 감소** (배치 메모리 절약)
   - 전체 분석 시간: **70-80% 단축** (9분 37초 → 2-3분 예상)

**트레이드오프:**
- ✅ 성능 대폭 향상 (파싱 시간 10배 단축)
- ✅ 메모리 효율성 개선
- ❌ DTO 클래스 소스 코드 조회 불가
- ❌ DTO 필드 논리명 없음 (필드명만 표시)

**사용 방법:**
```bash
# .env 파일에 추가
SKIP_DTO_SOURCE=true  # DTO 소스 저장 건너뛰기 (기본값: false)

# 분석 실행
python -m csa.cli.main analyze --all-objects --clean --project-name myproject

# DTO 소스가 필요한 경우
SKIP_DTO_SOURCE=false  # 모든 클래스 소스 저장
```

**적용 기준:**
- 성능 우선: `SKIP_DTO_SOURCE=true` (권장)
- 완전성 우선: `SKIP_DTO_SOURCE=false` (소스 조회 필요 시)
- 선택적 적용: DTO 패턴 수정하여 특정 클래스만 제외 가능

**구현 위치:**
- `csa/services/java_analysis/project.py`: `is_dto_class()`, 조건부 소스 저장
- `env.example`: `SKIP_DTO_SOURCE` 환경 변수 문서화

## 주의사항

### 개발 원칙

- **구조 변경 금지**: 임의로 애플리케이션 구조를 변경하지 말 것
- **확인 절차**: 수정 전 영향도 분석 후 사용자에게 확인
- **한국어 소통**: 모든 답변 및 주석은 한국어로 작성
- **수정 내역 공유**: 수정 후 이유와 내용을 명확히 설명

### 분석 대상 제외 폴더

다음 폴더/파일은 분석 시 반드시 제외합니다:
- `.`으로 시작하는 폴더 (.git, .venv, .pytest_cache, .vscode 등)
- `commands/` - Windows Batch 스크립트 디렉터리
- `logs/` - 분석 로그 디렉터리
- `neo4j/` - Neo4j 설정 파일
- `src/` - 기타 소스
- `target_src/` - 분석 대상 소스 (별도로 구성)

### 분석 대상 파일 필터링 (.csaignore)

프로젝트 루트에 `.csaignore` 파일을 생성하여 Java 분석에서 제외할 파일/폴더를 지정할 수 있습니다.

**.csaignore 규칙:**
- .gitignore와 동일한 패턴 문법 사용 (pathspec 라이브러리)
- `#`로 시작하는 줄은 주석
- `**/path/**` 패턴으로 디렉터리 제외
- `**/*Pattern.java` 패턴으로 파일명 패턴 매칭
- `!` 접두사로 예외 지정 (제외 대상에서 다시 포함)

**예제:**
```
# 생성된 코드
**/generated/**
**/target/generated-sources/**

# 대용량 DTO 클래스
**/*DODT.java
**/*DIDT.java
**/*Grid.java

# 특정 패키지
**/com/example/deprecated/**

# Lombok 생성 코드
**/*$*.java

# 예외 (다시 포함)
!**/com/example/deprecated/ImportantClass.java
```

**사용 방법:**
1. 프로젝트 루트에 `.csaignore` 파일 생성 (.env 파일과 같은 위치)
2. 제외할 패턴 추가
3. 분석 실행 시 자동으로 적용됨

**로그 확인:**
```
[INFO] .csaignore 패턴 적용 중...
[INFO] .csaignore로 XX개 파일 제외됨
```

**필수 라이브러리:**
- `pathspec` 라이브러리 필요: `pip install pathspec`
- 이미 requirements.txt에 포함되어 있음

**주의사항:**
- `.csaignore` 파일은 버전 관리에 포함됨 (.gitignore에 없음)
- Unix 스타일 경로 사용 (Windows에서도 `/` 사용)
- 패턴은 JAVA_SOURCE_FOLDER 기준 상대 경로로 매칭
- `.csaignore` 파일이 없으면 모든 파일 분석 (기본 동작)

**상세 가이드:**
- `docs/.csaignore 기능 적용 가이드.md` 참조
- project.py 통합 방법 포함

### 보안

- **민감 정보 커밋 금지**: `.env` 파일, 자격 증명, API 키 등
- **env.example 사용**: 기본값만 `env.example`에 남기기
- **Neo4j 스키마 변경**: `docs/` 디렉토리에 SQL 스크립트로 버전 관리

### Neo4j 연결

- **연결 풀 사용**: `csa.dbwork.connection_pool.get_connection_pool()` 사용
- **트랜잭션 관리**: 작업 후 반드시 커밋/롤백
- **연결 종료**: 프로그램 종료 시 `pool.close_all()` 호출

## 출력 결과

### Neo4j 그래프 데이터베이스

- 모든 코드 요소와 관계를 그래프로 저장
- Neo4j 브라우저에서 시각적 탐색 가능 (http://localhost:7474)
- Cypher 쿼리를 통한 복잡한 관계 분석

### 시퀀스 다이어그램

- **위치**: `output/sequence-diagram/<프로젝트명>/`
- **형식**: PlantUML (`.puml`), Mermaid (`.md`)
- **이미지**: PNG, SVG, PDF (선택적)

### CRUD 매트릭스

- **위치**: `output/crud-matrix/`
- **형식**: Excel (`.xlsx`), Markdown (`.md`)
- **내용**: 테이블별 CRUD 작업 매핑

### 클래스 명세서

- **위치**: `output/class-spec/<프로젝트명>/`
- **형식**: Markdown (`.md`)
- **내용**:
  - 클래스 기본 정보 (이름, 패키지, 타입, 하위 타입)
  - 메서드 목록 (시그니처, 논리명, 복잡도)
  - 필드 목록 (타입, 논리명)
  - Bean 의존성
  - CRUD 정보 (사용하는 테이블)

### 영향도 분석

- **위치**: `output/impact-analysis/`
- **형식**: Markdown (`.md`), Excel (`.xlsx`), JSON (`.json`, 선택), Mermaid 다이어그램 (`.md`, 선택)
- **내용**:
  - 테이블 영향도: 테이블 변경 시 영향받는 메서드/클래스
  - 메서드 영향도: 메서드 변경 시 영향받는 상위 메서드/클래스
  - 호출 체인 (최대 깊이 제한 가능)
  - 리스크 등급 (HIGH, MEDIUM, LOW)
  - 순환 참조 감지

## 문제 해결

### 일반적인 문제

1. **Neo4j 연결 오류**: Neo4j 서비스 실행 상태 및 `.env` 설정 확인
2. **Java 파싱 오류**: `javalang` 버전 확인 (>= 0.13.0)
3. **PlantUML 이미지 생성 실패**: `libs/plantuml.jar` 존재 여부 확인
4. **Mermaid 이미지 생성 실패**: `mmdc` 설치 및 `MMDC_PATH` 환경 변수 확인

### 디버깅

```bash
# DEBUG 레벨 로그 활성화
LOG_LEVEL=DEBUG python -m csa.cli.main analyze --all-objects

# 로그 파일 확인
tail -f logs/csa.log
```

### 데이터베이스 초기화

```bash
# Neo4j 브라우저에서 모든 노드 삭제
MATCH (n) DETACH DELETE n

# 전체 재분석
python -m csa.cli.main analyze --all-objects --clean --project-name myproject
```

## 확장 가능성

새로운 기능 추가 시 다음 패턴을 따르세요:

- **새 파서**: `csa/parsers/` 아래 추가
- **새 분석 서비스**: `csa/services/` 아래 기능별로 추가
- **새 CLI 명령어**: `csa/cli/commands/` 아래 추가 후 `main.py`에 등록
- **새 Neo4j 노드**: `csa/models/graph_entities.py`에 Pydantic 모델 추가
- **새 그래프 작업**: `csa/services/graph_db/` 아래 적절한 모듈에 추가