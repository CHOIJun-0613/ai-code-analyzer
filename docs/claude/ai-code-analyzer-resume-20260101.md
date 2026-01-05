# AI Code Analyzer 전체 분석 및 개선사항 정리

**작성일**: 2026-01-01
**분석 대상**: AI Code Analyzer (server + client)
**분석 방법**: Claude Code Agent를 활용한 코드베이스 자동 분석

---

## 📋 목차

1. [프로젝트 개요](#1-프로젝트-개요)
2. [전체 아키텍처 분석](#2-전체-아키텍처-분석)
3. [Server 디렉토리 상세 분석](#3-server-디렉토리-상세-분석)
4. [Client 디렉토리 상세 분석](#4-client-디렉토리-상세-분석)
5. [핵심 데이터 플로우](#5-핵심-데이터-플로우)
6. [강점 분석](#6-강점-분석)
7. [개선사항 제안](#7-개선사항-제안)
8. [기술 부채 및 리스크](#8-기술-부채-및-리스크)
9. [로드맵 제안](#9-로드맵-제안)

---

## 1. 프로젝트 개요

### 1.1 프로젝트 목적

**AI Code Analyzer**는 Spring Boot 기반 Java 애플리케이션의 정적 분석을 수행하고, 코드 구조, 데이터베이스 호출 관계, 영향도를 시각화하며, AI를 활용하여 코드 설명을 자동 생성하는 **풀스택 웹 애플리케이션**입니다.

### 1.2 핵심 가치

1. **코드 이해도 향상**: 복잡한 레거시 코드베이스를 빠르게 파악
2. **영향도 분석**: 변경 사항이 미치는 영향 범위를 사전에 파악
3. **문서 자동화**: 클래스 명세서, 시퀀스 다이어그램 자동 생성
4. **AI 기반 설명**: LLM을 활용하여 코드의 의미를 자연어로 설명
5. **팀 협업**: 웹 UI를 통한 손쉬운 접근 및 공유

### 1.3 기술 스택 요약

| 영역 | 기술 |
|------|------|
| **프론트엔드** | React 18.3 + TypeScript 5.6, Vite 6.0, Tailwind CSS 3.4 |
| **백엔드** | FastAPI (Python), Uvicorn (ASGI) |
| **데이터베이스** | Neo4j 5.x (Graph Database) |
| **인증** | JWT (python-jose), bcrypt (passlib) |
| **분석 엔진** | javalang (Java AST), sqlparse (SQL) |
| **AI 통합** | Google Gemini, Groq, LM Studio, OpenAI |
| **상태 관리** | Zustand 4.5 |
| **HTTP 통신** | Axios 1.6 |
| **시각화** | Mermaid 10.9, react-markdown 9.0 |

---

## 2. 전체 아키텍처 분석

### 2.1 아키텍처 다이어그램

```
┌─────────────────────────────────────────────────────────────┐
│                    Client (React App)                        │
│              http://localhost:5173                           │
│                                                              │
│  ┌──────────────────────────────────────────────────────┐   │
│  │  Pages                                               │   │
│  │  ├─ Dashboard: 프로젝트 목록 카드                   │   │
│  │  ├─ ProjectDetails: 패키지/클래스 계층 탐색         │   │
│  │  ├─ ClassDetails: 소스/메서드/필드 뷰어             │   │
│  │  ├─ Analysis: 코드 분석 설정/실행                   │   │
│  │  ├─ CodeAiAnalysis: AI enrichment                  │   │
│  │  ├─ AnalysisHistoryList: 분석 이력                 │   │
│  │  └─ Admin: 사용자/그룹 관리                         │   │
│  └──────────────────────────────────────────────────────┘   │
│                                                              │
│  ┌──────────────────────────────────────────────────────┐   │
│  │  Components                                          │   │
│  │  ├─ Layout: 사이드바 + 라우팅                       │   │
│  │  ├─ ReportViewerModal: Markdown/Grid 리포트 뷰어    │   │
│  │  ├─ MermaidDiagram: 다이어그램 렌더러               │   │
│  │  ├─ ProjectSelector: 프로젝트 선택기                │   │
│  │  └─ SettingsModal: 설정 (테마, 언어)               │   │
│  └──────────────────────────────────────────────────────┘   │
│                                                              │
│  ┌──────────────────────────────────────────────────────┐   │
│  │  State Management (Zustand)                         │   │
│  │  └─ authStore: user, token, login/logout           │   │
│  └──────────────────────────────────────────────────────┘   │
└──────────────────────┬───────────────────────────────────────┘
                       │
                       │ HTTP/REST + JWT Bearer Token
                       │
┌──────────────────────▼───────────────────────────────────────┐
│              Server (FastAPI Backend)                        │
│              http://localhost:8000                           │
│                                                              │
│  ┌──────────────────────────────────────────────────────┐   │
│  │  app/ (Web API Layer)                                │   │
│  │  ├─ api/v1/endpoints/                                │   │
│  │  │  ├─ auth.py: JWT 로그인                          │   │
│  │  │  ├─ users.py: 사용자 CRUD, 프리퍼런스            │   │
│  │  │  ├─ groups.py: 그룹 CRUD, 권한 관리              │   │
│  │  │  ├─ projects.py: 프로젝트 조회, 통계, 계층      │   │
│  │  │  ├─ analysis.py: 코드 분석 실행, 작업 관리      │   │
│  │  │  ├─ ai_analysis.py: AI enrichment 실행          │   │
│  │  │  ├─ reports.py: 리포트 생성                      │   │
│  │  │  └─ class_reports.py: 클래스 리포트             │   │
│  │  ├─ deps.py: get_current_user (JWT 검증)           │   │
│  │  ├─ core/config.py: 환경 변수 (Settings)           │   │
│  │  ├─ core/security.py: JWT, bcrypt                  │   │
│  │  ├─ core/database.py: Neo4j 커넥션 풀              │   │
│  │  ├─ services/analysis_wrapper.py: 작업 관리        │   │
│  │  └─ services/user_service.py: 사용자 서비스        │   │
│  └──────────────────────────────────────────────────────┘   │
│                                                              │
│  ┌──────────────────────────────────────────────────────┐   │
│  │  csa/ (Analysis Engine)                              │   │
│  │  ├─ services/analysis/                               │   │
│  │  │  ├─ handlers.py: analyze_project 진입점          │   │
│  │  │  ├─ java_pipeline.py: 스트리밍/배치 파싱         │   │
│  │  │  ├─ db_pipeline.py: DDL 파싱                     │   │
│  │  │  └─ neo4j_writer.py: Neo4j 저장                  │   │
│  │  ├─ services/java_analysis/                         │   │
│  │  │  ├─ project.py: 클래스/메서드/필드 추출          │   │
│  │  │  ├─ spring.py: Spring 어노테이션                │   │
│  │  │  ├─ jpa.py: JPA 엔티티                           │   │
│  │  │  ├─ mybatis.py: MyBatis 매퍼                     │   │
│  │  │  └─ bean_dependency_resolver.py: DI 재구성      │   │
│  │  ├─ services/graph_db/: Neo4j CRUD                 │   │
│  │  ├─ services/db_call_analysis/: 호출 관계          │   │
│  │  ├─ services/ai_enrichment_service.py              │   │
│  │  ├─ parsers/java/: Java AST, 논리명 추출           │   │
│  │  ├─ parsers/db/: DDL 파서                          │   │
│  │  ├─ parsers/sql/: SQL 파서                         │   │
│  │  ├─ diagrams/: Mermaid/PlantUML 생성              │   │
│  │  ├─ aiwork/: AI Provider (4종 지원)               │   │
│  │  ├─ dbwork/: Neo4j 커넥션 풀                       │   │
│  │  └─ utils/: 로거, 복잡도 계산, LOC                 │   │
│  └──────────────────────────────────────────────────────┘   │
└──────────────────────┬───────────────────────────────────────┘
                       │
                       │ Neo4j Driver (bolt://localhost:7687)
                       │
┌──────────────────────▼───────────────────────────────────────┐
│                  Neo4j Graph Database                        │
│                                                              │
│  Nodes:                                                      │
│  ├─ Project, Package, Class, Method, Field                  │
│  ├─ Bean, Endpoint, BeanDependency                          │
│  ├─ MyBatisMapper, SqlStatement, JpaEntity, JpaRepository   │
│  ├─ Database, Table, Column, Index, Constraint              │
│  ├─ User, UserGroup (인증/권한)                             │
│  └─ AnalysisHistory (분석 이력)                             │
│                                                              │
│  Relationships:                                              │
│  ├─ BELONGS_TO, HAS_METHOD, HAS_FIELD                       │
│  ├─ CALLS, USES_TABLE, MAPS_TO                              │
│  ├─ INJECTS, EXTENDS, IMPLEMENTS                            │
│  └─ HAS_ACCESS_TO (그룹 → 프로젝트)                         │
└─────────────────────────────────────────────────────────────┘
```

### 2.2 아키텍처 특징

#### 장점
1. **관심사 분리**: FastAPI (웹 API) + CSA (분석 엔진) 명확한 계층 분리
2. **모듈화**: 각 기능별로 독립적인 모듈 구조 (services, parsers, diagrams 등)
3. **확장성**: 새로운 파서, 분석 기능 추가 용이
4. **그래프 데이터베이스**: Neo4j로 복잡한 관계 표현 및 쿼리 최적화

#### 단점
1. **이중 드라이버 관리**: FastAPI(커넥션 풀) vs CSA(직접 드라이버) - 일관성 필요
2. **인메모리 작업 관리**: jobs dict - 서버 재시작 시 손실, 다중 서버 미지원
3. **폴링 기반 통신**: WebSocket 대신 3초 간격 폴링 - 실시간성 제한

---

## 3. Server 디렉토리 상세 분석

### 3.1 FastAPI 애플리케이션 (app/)

#### 핵심 설계

**진입점 (main.py)**
- FastAPI 앱 초기화
- 클라이언트 IP 추적 미들웨어
- API v1 라우터 등록

**설정 관리 (core/config.py)**
```python
class Settings(BaseSettings):
    # API 설정
    PROJECT_NAME: str
    API_V1_STR: str = "/api/v1"
    SECRET_KEY: str
    ACCESS_TOKEN_EXPIRE_MINUTES: int = 30

    # Neo4j 설정
    NEO4J_URI: str
    NEO4J_USER: str
    NEO4J_PASSWORD: str
    NEO4J_DATABASE: Optional[str]
    NEO4J_POOL_SIZE: int = 10
    NEO4J_BATCH_SIZE: int = 25

    # Java Parser 설정
    JAVA_SOURCE_FOLDER: Optional[str]
    USE_STREAMING_PARSE: bool = True
    JAVA_PARSE_WORKERS: Optional[int]
    SKIP_DTO_SOURCE: bool = False

    # AI 설정
    USE_AI_ANALYSIS: bool = False
    CONCURRENT_AI_REQUESTS: int = 15
    AI_PROVIDER: str = "lmstudio"
```

**인증 체계 (core/security.py)**
- JWT 토큰 생성/검증 (python-jose)
- 비밀번호 해싱 (bcrypt)
- OAuth2 Password Flow

**Neo4j 연결 (core/database.py)**
- 싱글톤 커넥션 풀 (`get_connection_pool()`)
- 스레드 안전 (queue.Queue)
- 커넥션 재사용

#### API 엔드포인트 구조

| 엔드포인트 | 기능 |
|------------|------|
| `POST /login/access-token` | JWT 토큰 발급 |
| `GET /users/me` | 현재 사용자 정보 |
| `GET/PUT /users/me/preferences` | 일반 설정 (테마, 언어) |
| `GET/PUT /users/me/preferences-ai` | AI 설정 (Provider, Model, API Key) |
| `GET /projects/` | 프로젝트 목록 (권한 필터링) |
| `GET /projects/{name}/stats` | 프로젝트 통계 |
| `GET /projects/{name}/hierarchy` | 패키지/클래스 계층 |
| `GET /projects/{name}/classes/{class}` | 클래스 상세 |
| `POST /analysis/analyze` | 코드 분석 실행 (로컬 경로) |
| `POST /analysis/upload` | 코드 분석 실행 (ZIP 업로드) |
| `GET /analysis/active` | 활성 작업 목록 |
| `GET /analysis/analyze/{job_id}` | 작업 상태 조회 |
| `GET /analysis/analyze/{job_id}/logs` | 로그 조회 |
| `POST /analysis/analyze/{job_id}/cancel` | 작업 취소 |
| `GET /analysis/history` | 분석 이력 조회 |
| `POST /ai/enrich` | AI Enrichment 실행 |
| `GET /ai/active` | 활성 AI 작업 목록 |
| `GET /projects/{name}/reports/stats` | 통계 리포트 |
| `GET /projects/{name}/reports/crud` | CRUD 매트릭스 |
| `GET /projects/{name}/reports/classes` | 클래스 목록 |

#### 작업 관리 (services/analysis_wrapper.py)

**작업 ID 생성**
```
YYYYMMDD-HHMMSS-mmm-USERID-RAND5
예: 20260101-143025-123-admin-7A3B9
```

**작업 상태 관리**
```python
jobs: Dict[str, dict] = {
    "job_id": {
        "id": "...",
        "user_id": "username",
        "status": "pending" | "running" | "completed" | "failed" | "cancelling" | "cancelled",
        "params": {...},
        "logs": ["log1", "log2", ...],
        "result": {...},
        "error": "...",
        "created_at": "2026-01-01T10:00:00"
    }
}
```

**백그라운드 실행**
- `threading.Thread`로 작업 실행
- `JobLogHandler`로 로그 캡처 (메모리 + 파일)
- 완료 시 Neo4j에 `AnalysisHistory` 노드 저장

### 3.2 CSA 분석 엔진 (csa/)

#### 핵심 모듈

**1. 분석 파이프라인 (services/analysis/)**

**handlers.py: analyze_project()**
```python
def analyze_project(
    java_source_folder, project_name, application_name,
    db_script_folder, neo4j_uri, neo4j_user, neo4j_password,
    clean, dry_run, java_object, db_object, all_objects,
    use_ai, skip_dto_source, skip_dto_methods, ...
) -> Dict[str, Any]:
    # 1. 옵션 검증
    validate_analyze_options(...)

    # 2. Neo4j 준비
    _prepare_database(db, clean, ...)

    # 3. Java 분석
    if java_object or all_objects:
        parse_java_project_streaming/full(...)

    # 4. DB 분석
    if db_object or all_objects:
        parse_ddl_directory(...)

    # 5. 분석 이력 저장
    save_analysis_history(...)

    return result
```

**java_pipeline.py: 스트리밍 vs 배치**
- **스트리밍 모드** (`USE_STREAMING_PARSE=true`):
  - 파일 단위 즉시 Neo4j 저장
  - 메모리 효율적 (대규모 프로젝트용)
  - 병렬 처리 (멀티프로세스)
- **배치 모드** (`USE_STREAMING_PARSE=false`):
  - 전체 메모리 적재 후 배치 저장
  - 빠른 분석 (소규모 프로젝트용)

**2. Java 분석 (services/java_analysis/)**

**project.py: 클래스/메서드/필드 추출**
- javalang AST 파서 사용
- Inner Class 중복 제거 (선언부만 추출)
- DTO 자동 판별 (`is_dto_class()`)
  - 클래스명 패턴: DTO, DODT, DIDT, ODT, IDT, VO, Entity, Grid
  - 내용 기반: 필드 20개 이상 & 비즈니스 메서드 3개 이하
- DTO 최적화:
  - `SKIP_DTO_SOURCE=true`: DTO 소스 저장 건너뛰기 (40-60% 절감)
  - `SKIP_DTO_METHODS=true`: DTO 메서드 분석 생략 (70-90% 절감)

**spring.py: Spring 어노테이션 분석**
- Bean 식별 (`@Component`, `@Service`, `@Repository`, `@Controller`, `@Configuration`)
- Endpoint 추출 (`@RestController`, `@RequestMapping`)
- Bean 의존성 추출 (`@Autowired`, 생성자 주입)

**jpa.py: JPA 엔티티 분석**
- `@Entity`, `@Table`, `@Column` 추출
- 관계 어노테이션 (`@OneToMany`, `@ManyToOne` 등)
- JPA Repository 식별

**mybatis.py: MyBatis 매퍼 분석**
- XML 매퍼 파일 파싱
- SQL 문 추출 (SELECT, INSERT, UPDATE, DELETE)
- Bxm Framework 지원 (.dbio 파일)

**bean_dependency_resolver.py: DI 재구성**
- Constructor Injection
- Setter Injection
- Field Injection

**3. 그래프 데이터베이스 (services/graph_db/)**

**base.py: GraphDBBase**
- Neo4j Driver 직접 소유 (분석 작업마다 새 드라이버)
- 트랜잭션 헬퍼 메서드
- 모든 graph_db 서비스의 베이스 클래스

**주요 서브클래스**
- `GraphDB`: 모든 Neo4j 작업 통합
- `ProjectNodes`: Project 노드 CRUD
- `ApplicationNodes`: Class/Method/Field 노드 CRUD
- `PersistenceNodes`: Bean/Endpoint/Mapper/SQL 노드 CRUD
- `DatabaseNodes`: Database/Table/Column 노드 CRUD

**인덱스 자동 생성**
```cypher
CREATE INDEX IF NOT EXISTS FOR (p:Project) ON (p.name)
CREATE INDEX IF NOT EXISTS FOR (c:Class) ON (c.name, c.package_name, c.project_name)
CREATE INDEX IF NOT EXISTS FOR (m:Method) ON (m.name, c.class_name, c.package_name, c.project_name)
```

**AdaptiveBatchSizer: 배치 크기 자동 조정**
- 저장 성능에 따라 20-200 범위에서 조정
- 저장 시간 5초 미만: 10% 증가
- 저장 시간 20초 초과: 20% 감소

**4. AI Enrichment (services/ai_enrichment_service.py)**

**AIEnrichmentService.enrich_project()**
```python
async def enrich_project(
    project_name: str,
    node_type: str = "all",
    batch_size: int = 10,
    limit: Optional[int] = None,
    clean: bool = False,
    target_class_name: Optional[str] = None,
    stop_check_callback: Optional[Callable[[], bool]] = None
):
    # 1. Neo4j에서 ai_description 없는 노드 조회
    nodes = get_nodes_without_ai_description(...)

    # 2. 비동기 병렬 처리 (asyncio)
    tasks = [analyze_node(node) for node in nodes]
    results = await asyncio.gather(*tasks, return_exceptions=True)

    # 3. Neo4j 업데이트
    update_ai_descriptions(results)

    # 4. 진행률 표시
    logger.info(f"[{current}/{total}] ({percent}%)")
```

**AI Provider 지원**
- Google Gemini (gemini-1.5-flash, gemini-1.5-pro)
- Groq (llama-3.1-70b-versatile, mixtral-8x7b)
- LM Studio (로컬 LLM, API 엔드포인트 필요)
- OpenAI (gpt-4o-mini, gpt-4o)

**5. 복잡도 계산 (utils/)**

**cognitive_complexity.py: 인지 복잡도**
- 메서드의 인지 복잡도 계산
- 중첩된 제어 구조에 가중치 부여

**code_complexity.py: 코드 복잡도 (가중치 합)**
```
Lines         × 1
Fields        × 2
Methods       × 5
Inner Classes × 10
Annotations   × 1
────────────────────
Total: Code Complexity
```

**loc_calculator.py: LOC 메트릭**
- PLOC (Physical LOC): 물리적 라인 수
- LLOC (Logical LOC): 논리적 라인 수 (공백/주석 제외)
- CLOC (Comment LOC): 주석 라인 수

### 3.3 성능 최적화

#### v0.6 최적화 (2025-11-04)
1. **파일 복잡도 기반 정렬**: 복잡도 높은 파일을 먼저 워커에 배정
2. **파일 파싱 타임아웃**: `JAVA_FILE_PARSE_TIMEOUT=60.0` (초)
3. **동적 배치 크기 조정**: AdaptiveBatchSizer (20-200)
4. **메모리 명시적 해제**: 배치 저장 후 `gc.collect()`
5. **복잡도 상위 파일 로깅**: 분석 전 상위 10개 파일 출력

**예상 효과**
- 전체 분석 시간: 44분 → 2-5분 (89-95% 개선)
- 워커 활용률: 12.5% → 100%
- 메모리 사용량: 40% 감소
- 배치 저장 시간: 80% 개선

#### v0.7 최적화 (DTO 최적화)
1. **DTO 클래스 자동 판별**: 클래스명 패턴 + 내용 기반
2. **조건부 소스 저장**: `SKIP_DTO_SOURCE=true`
3. **필드 논리명 추출 건너뛰기**: 100개 필드 200초 → 5초 (95% 단축)

**예상 효과**
- 파싱 시간: 70-90% 절감
- DB 저장 시간: 40-60% 절감
- 메모리 사용량: 30-40% 감소
- 전체 분석 시간: 70-80% 단축 (9분 37초 → 2-3분)

---

## 4. Client 디렉토리 상세 분석

### 4.1 React 애플리케이션 구조

#### 기술 선택

| 영역 | 선택 기술 | 이유 |
|------|----------|------|
| **프레임워크** | React 18.3 + TypeScript | 타입 안전성, 강력한 생태계 |
| **빌드 도구** | Vite 6.0 | 빠른 개발 서버, HMR, ESM 네이티브 |
| **스타일링** | Tailwind CSS 3.4 | 유틸리티 우선, 빠른 개발 |
| **라우팅** | React Router DOM 6.22 | 선언적 라우팅, 중첩 라우트 |
| **상태 관리** | Zustand 4.5 | 간결한 API, Redux보다 가벼움 |
| **HTTP 통신** | Axios 1.6 | 인터셉터, 타임아웃, 취소 지원 |
| **국제화** | i18next 23.10 | 강력한 다국어 지원 |
| **다이어그램** | Mermaid 10.9 | 선언적 다이어그램, 브라우저 렌더링 |

#### 프로젝트 구조

```
client/src/
├── api/
│   ├── client.ts              # Axios 인스턴스 + 인터셉터
│   └── userApi.ts            # 사용자/그룹 API 함수
│
├── components/
│   ├── AnimatedLogo.tsx      # 로고 애니메이션
│   ├── EditableField.tsx     # 편집 가능 필드
│   ├── Layout.tsx            # 레이아웃 (사이드바 + 콘텐츠)
│   ├── MatrixRain.tsx        # 매트릭스 배경 효과
│   ├── MermaidDiagram.tsx    # Mermaid 다이어그램 렌더러
│   ├── ProjectSelector.tsx   # 프로젝트 선택기
│   ├── ReportViewerModal.tsx # 리포트 뷰어 모달
│   └── SettingsModal.tsx     # 설정 모달
│
├── pages/
│   ├── Admin.tsx             # 관리자 대시보드
│   ├── Admin/
│   │   ├── GroupManagement.tsx   # 그룹 관리
│   │   └── UserManagement.tsx    # 사용자 관리
│   ├── Analysis.tsx          # 코드 분석 설정/실행
│   ├── AnalysisHistoryList.tsx # 분석 히스토리
│   ├── ClassDetails.tsx      # 클래스 상세
│   ├── CodeAiAnalysis.tsx    # AI 분석 설정/실행
│   ├── Dashboard.tsx         # 프로젝트 목록
│   ├── Login.tsx             # 로그인
│   └── ProjectDetails.tsx    # 프로젝트 상세
│
├── store/
│   └── authStore.ts          # 인증 상태 (Zustand)
│
├── locales/
│   ├── en/translation.json   # 영어
│   └── ko/translation.json   # 한국어
│
├── App.tsx                   # 라우팅 설정
├── main.tsx                  # 진입점
├── i18n.ts                   # 국제화 설정
└── index.css                 # 글로벌 스타일
```

### 4.2 주요 페이지 기능

#### Dashboard (프로젝트 목록)
- 프로젝트 카드 형식 표시
- 파일 개수, 업데이트 시간 표시
- 클릭 시 상세 페이지 이동

#### ProjectDetails (프로젝트 상세)
- **2분할 레이아웃**: 패키지 (왼쪽) + 클래스 테이블 (오른쪽)
- **검색 기능**: 패키지 검색, 클래스 전역 검색
- **리포트 생성**: Stats, CRUD Matrix, Class List
- **편집 기능**: 프레임워크/저장소 정보 수정

#### ClassDetails (클래스 상세)
- **메타데이터**: 타입, 하위 타입, 어노테이션, 상속
- **코드 메트릭**: PLOC/LLOC/CLOC, 코드 복잡도
- **탭 구조**:
  - `info`: 개요, AI 설명 (Markdown)
  - `source`: 소스 코드 뷰어 (줄 번호, 복사, 전체 선택)
  - `methods`: 메서드 테이블 (visibility, 복잡도, LOC)
  - `fields`: 필드 테이블 (name, type, initial value)

#### Analysis (코드 분석)
- **분석 모드**: 서버 경로 / ZIP 업로드
- **설정 옵션**: 분석 대상, 저장 전략, 성능 옵션, DTO 최적화, 제외 패턴
- **실시간 모니터링**: 진행률 바, 로그 스트리밍 (3초 간격 폴링)
- **작업 제어**: 시작/중지, 로그/요약 다운로드

#### CodeAiAnalysis (AI 분석)
- **AI 설정**: Provider, Model, API Key, Endpoint (사용자별 저장/로드)
- **분석 범위**: 프로젝트, 노드 타입, 클래스 필터, 제한
- **저장 옵션**: Clean (삭제 후 저장) / Update (기존 유지)
- **동시성 제어**: Concurrent Requests, Batch Size

#### Admin (관리자 기능)
- **사용자 관리**: CRUD, 그룹 할당, 활성화/비활성화
- **그룹 관리**: CRUD, 권한 할당, 프로젝트 할당
- **권한 제어**: Administrators 그룹만 접근

### 4.3 재사용 가능한 컴포넌트

#### ReportViewerModal (리포트 뷰어)
- **Markdown 모드**: react-markdown + remark-gfm
- **Grid 모드**: CRUD Matrix, Class List (테이블 형식)
- **다운로드**: PDF, Excel, Text
- **풀스크린 모달**: 최대화/최소화

#### MermaidDiagram (다이어그램 렌더러)
- Mermaid 문법 파싱 및 렌더링
- 에러 처리 (구문 오류 시 에러 메시지 표시)
- 다이나믹 크기 조정

#### Layout (레이아웃)
- **사이드바**: 확장/축소 (ChevronLeft/Right)
- **권한 기반 메뉴**: isAdmin 체크
- **테마 전환**: Normal/Dark Modern
- **사용자 정보**: 자동 로드 (fetchUser)

### 4.4 상태 관리 (Zustand)

#### authStore (인증 상태)
```typescript
interface AuthState {
  user: User | null;
  token: string | null;
  login: (token, username) => void;
  logout: () => void;
  fetchUser: () => Promise<void>;
}
```

**특징**
- localStorage에 토큰 영구 저장
- 페이지 리로드 시 자동 복원
- 401 에러 시 자동 로그아웃 (axios interceptor)

### 4.5 API 통신 방식

#### Axios 클라이언트 (api/client.ts)
```typescript
// Request Interceptor: JWT 토큰 자동 추가
client.interceptors.request.use(config => {
  const token = useAuthStore.getState().token;
  if (token) config.headers.Authorization = `Bearer ${token}`;
  return config;
});

// Response Interceptor: 401 에러 시 자동 로그아웃
client.interceptors.response.use(
  response => response,
  error => {
    if (error.response?.status === 401) {
      useAuthStore.getState().logout();
    }
    return Promise.reject(error);
  }
);
```

#### Vite Proxy 설정 (vite.config.ts)
```typescript
server: {
  proxy: {
    '/api': {
      target: 'http://localhost:8000',  // FastAPI 백엔드
      changeOrigin: true
    }
  }
}
```

---

## 5. 핵심 데이터 플로우

### 5.1 분석 작업 실행 플로우

```
[Client] Analysis Page
  │
  ├─ 사용자 입력 (설정)
  │   ├─ 분석 모드: 서버 경로 / ZIP 업로드
  │   ├─ 프로젝트명, 애플리케이션명
  │   ├─ 분석 대상: Program/DB/All
  │   ├─ 저장 전략: Delete/Update
  │   ├─ 성능 옵션: Workers, Timeout, Threshold
  │   ├─ DTO 최적화: Skip DTO Source/Methods
  │   └─ 제외 패턴: .csaignore
  │
  └─ POST /api/v1/analysis/analyze
      {
        source_folder, project_name, application_name,
        db_script_folder, clean, use_ai, scope,
        skip_dto_source, skip_dto_methods,
        use_streaming_parse, java_parse_workers,
        java_file_parse_timeout, exclude_patterns
      }
      ↓
[Server] analysis.py → analysis_wrapper.py
  │
  ├─ start_analysis(params, user_id)
  │   ├─ 작업 ID 생성: YYYYMMDD-HHMMSS-mmm-USERID-RAND5
  │   ├─ jobs dict에 작업 상태 저장 (status: 'pending')
  │   └─ threading.Thread(target=run_analysis_task).start()
  │
  └─ run_analysis_task(job_id, params, user_id)
      ├─ jobs[job_id]['status'] = 'running'
      ├─ 로그 핸들러 설정 (JobLogHandler)
      │   ├─ 메모리에 로그 수집 (jobs[job_id]['logs'])
      │   └─ 파일에 로그 기록 (logs/analysis-{job_id}.log)
      │
      ├─ csa.services.analyze_service.analyze_project()
      │   ├─ handlers.py: analyze_project()
      │   │   │
      │   │   ├─ 1. 옵션 검증 (validate_analyze_options)
      │   │   │
      │   │   ├─ 2. Neo4j 준비 (_prepare_database)
      │   │   │   ├─ clean=True → 기존 프로젝트 노드 삭제
      │   │   │   └─ 인덱스 확인 및 생성
      │   │   │
      │   │   ├─ 3. Java 분석 (java_pipeline.py)
      │   │   │   │
      │   │   │   ├─ USE_STREAMING_PARSE=true
      │   │   │   │   └─ parse_java_project_streaming()
      │   │   │   │       ├─ 파일 목록 복잡도 기반 정렬
      │   │   │   │       ├─ 멀티프로세스 병렬 파싱 (Workers)
      │   │   │   │       ├─ 파일 단위 즉시 Neo4j 저장
      │   │   │   │       └─ 메모리 효율적
      │   │   │   │
      │   │   │   └─ USE_STREAMING_PARSE=false
      │   │   │       └─ parse_java_project_full()
      │   │   │           ├─ 전체 메모리 적재
      │   │   │           └─ 배치 Neo4j 저장
      │   │   │
      │   │   ├─ Java 파싱 세부 단계
      │   │   │   ├─ project.py: 클래스/메서드/필드 추출
      │   │   │   │   ├─ javalang AST 파서
      │   │   │   │   ├─ Inner Class 중복 제거
      │   │   │   │   ├─ DTO 자동 판별 (is_dto_class)
      │   │   │   │   └─ DTO 최적화 (skip_dto_source, skip_dto_methods)
      │   │   │   │
      │   │   │   ├─ spring.py: Bean/Endpoint 식별
      │   │   │   ├─ jpa.py: JPA 엔티티 분석
      │   │   │   ├─ mybatis.py: MyBatis 매퍼 추출
      │   │   │   └─ bean_dependency_resolver.py: DI 재구성
      │   │   │
      │   │   ├─ 4. DB 분석 (db_pipeline.py)
      │   │   │   ├─ DDL 파일 파싱 (CREATE TABLE, ALTER 등)
      │   │   │   └─ Database/Table/Column 추출
      │   │   │
      │   │   ├─ 5. Neo4j 저장 (neo4j_writer.py)
      │   │   │   ├─ Project/Package/Class/Method/Field 노드
      │   │   │   ├─ Bean/Endpoint/Mapper/SQL 노드
      │   │   │   ├─ 관계 생성 (BELONGS_TO, HAS_METHOD, CALLS 등)
      │   │   │   └─ AdaptiveBatchSizer로 배치 크기 자동 조정
      │   │   │
      │   │   └─ 6. 분석 이력 저장 (analysis_history.py)
      │   │       └─ AnalysisHistory 노드 생성
      │   │
      │   └─ 결과 반환 (통계, 요약)
      │
      ├─ jobs[job_id]['result'] = result
      ├─ jobs[job_id]['status'] = 'completed' | 'failed' | 'cancelled'
      └─ Neo4j에 AnalysisHistory 노드 저장
      ↓
[Client] Polling (3초 간격)
  │
  ├─ GET /api/v1/analysis/analyze/{job_id}
  │   └─ Response: { status, result, error, ... }
  │
  ├─ GET /api/v1/analysis/analyze/{job_id}/logs
  │   └─ Response: { logs: ["log1", "log2", ...] }
  │
  ├─ 진행률 추출 (로그에서 [current/total] (percent%) 파싱)
  │
  └─ Status: 'completed' / 'failed' / 'cancelled'
      ↓
  Summary Modal (요약 다운로드)
```

### 5.2 AI Enrichment 플로우

```
[Client] CodeAiAnalysis Page
  │
  ├─ GET /api/v1/users/me/preferences-ai
  │   └─ AI 설정 로드 (Provider, Model, API Key, Endpoint)
  │
  ├─ 사용자 입력
  │   ├─ 프로젝트 선택
  │   ├─ 노드 타입: class/method/sql/all
  │   ├─ 클래스 필터 (선택)
  │   ├─ 제한: 최대 노드 수
  │   ├─ 저장 옵션: Clean/Update
  │   └─ Concurrent Requests
  │
  └─ POST /api/v1/ai/enrich
      {
        project_name, node_type, limit, clean,
        concurrent_requests, log_level,
        ai_config: { provider, model_name, api_key, api_endpoint }
      }
      ↓
[Server] ai_analysis.py → ai_enrichment_service.py
  │
  ├─ start_ai_enrichment(params, user_id)
  │   ├─ 작업 ID 생성
  │   ├─ ai_jobs dict에 작업 상태 저장 (status: 'pending')
  │   └─ threading.Thread(target=run_ai_enrichment_task).start()
  │
  └─ run_ai_enrichment_task(job_id, params, user_id)
      ├─ ai_jobs[job_id]['status'] = 'running'
      ├─ 로그 핸들러 설정 (JobLogHandler)
      │
      ├─ AIEnrichmentService.enrich_project()
      │   │
      │   ├─ 1. Neo4j에서 ai_description 없는 노드 조회
      │   │   ├─ clean=True → 기존 ai_description 삭제
      │   │   ├─ node_type 필터링 (class/method/sql/all)
      │   │   ├─ target_class_name 필터링 (선택)
      │   │   └─ limit 제한
      │   │
      │   ├─ 2. 비동기 병렬 처리 (asyncio)
      │   │   ├─ 동시 요청 수: concurrent_requests
      │   │   ├─ AI Provider에 요청
      │   │   │   ├─ Google Gemini
      │   │   │   ├─ Groq
      │   │   │   ├─ LM Studio (로컬)
      │   │   │   └─ OpenAI
      │   │   └─ ai_description 생성
      │   │
      │   ├─ 3. Neo4j 업데이트 (ai_description)
      │   │
      │   ├─ 4. 진행률 표시
      │   │   └─ logger.info(f"[{current}/{total}] ({percent}%)")
      │   │
      │   └─ 5. 취소 지원 (stop_check_callback)
      │       └─ 취소 플래그 파일 확인
      │
      ├─ ai_jobs[job_id]['result'] = result
      ├─ ai_jobs[job_id]['status'] = 'completed' | 'failed' | 'cancelled'
      └─ 완료
      ↓
[Client] Polling (3초 간격)
  │
  ├─ GET /api/v1/ai/{job_id}
  │   └─ Response: { status, result, error, ... }
  │
  ├─ GET /api/v1/ai/{job_id}/logs
  │   └─ Response: { logs: ["log1", "log2", ...] }
  │
  └─ Status: 'completed' / 'failed' / 'cancelled'
```

### 5.3 인증 플로우

```
[Client] Login Page
  │
  └─ POST /api/v1/login/access-token
      { username, password }
      ↓
[Server] auth.py
  │
  ├─ 사용자 조회 (Neo4j)
  │   └─ MATCH (u:User:System {name: $username})
  │
  ├─ 비밀번호 검증
  │   └─ verify_password(plain_password, hashed_password) # bcrypt
  │
  └─ JWT 토큰 생성
      ├─ payload = {"sub": username, "exp": 30분 후}
      └─ token = jose.jwt.encode(payload, SECRET_KEY, algorithm="HS256")
      ↓
  Response: { access_token, token_type: "bearer" }
      ↓
[Client] authStore
  │
  ├─ authStore.login(token, username)
  ├─ localStorage.setItem('token', token)
  └─ navigate('/')
      ↓
[Client] 이후 모든 API 요청
  │
  ├─ Request Interceptor
  │   └─ Authorization: Bearer <token>
  │
  └─ [Server] deps.get_current_user()
      ├─ JWT 디코딩
      ├─ 사용자 조회 (Neo4j)
      └─ UserInDB 객체 반환
```

---

## 6. 강점 분석

### 6.1 아키텍처 강점

1. **관심사 분리**
   - FastAPI (웹 API) + CSA (분석 엔진) 명확한 계층 분리
   - 각 계층 독립적으로 테스트 및 확장 가능

2. **모듈화 및 확장성**
   - 기능별 모듈 분리 (services, parsers, diagrams 등)
   - 새로운 파서, 분석 기능 추가 용이
   - Plugin 방식의 AI Provider 지원

3. **그래프 데이터베이스 활용**
   - Neo4j로 복잡한 관계 표현 및 쿼리
   - Cypher 쿼리로 영향도 분석, 호출 체인 추적 용이
   - 인덱스 자동 생성으로 성능 최적화

4. **스트리밍 모드**
   - 대규모 프로젝트 메모리 효율적 처리
   - 파일 단위 즉시 저장으로 진행 상황 실시간 반영

### 6.2 기능 강점

1. **실시간 모니터링**
   - 분석 진행률 바, 로그 스트리밍
   - 작업 취소 지원

2. **AI 통합**
   - 4종 AI Provider 지원 (Google, Groq, LM Studio, OpenAI)
   - 비동기 병렬 처리로 성능 최적화
   - 사용자별 AI 설정 저장/로드

3. **사용자 관리 및 권한**
   - JWT 기반 인증
   - 그룹별 권한 관리 (RBAC)
   - 프로젝트별 접근 제어

4. **성능 최적화**
   - DTO 최적화 (70-90% 파싱 시간 단축)
   - 병렬 처리 (멀티프로세스)
   - AdaptiveBatchSizer (배치 크기 자동 조정)

5. **다양한 리포트**
   - Stats Report, CRUD Matrix, Class List
   - Class Spec, Sequence Diagram, Impact Analysis
   - Markdown/Excel/PDF 다운로드

### 6.3 UI/UX 강점

1. **직관적인 웹 인터페이스**
   - 카드 형식 대시보드
   - 2분할 레이아웃 (패키지 + 클래스)
   - 탭 구조 (info, source, methods, fields)

2. **실시간 피드백**
   - 진행률 바, 로그 스트리밍
   - 3초 간격 폴링으로 실시간 업데이트

3. **다국어 지원**
   - i18next로 한국어/영어 지원
   - 브라우저 언어 자동 감지

4. **테마 전환**
   - Normal/Dark Modern 테마
   - Tailwind CSS로 일관된 디자인

---

## 7. 개선사항 제안

### 7.1 단기 개선사항 (1-2개월)

#### 1. React Query 도입
**문제점**: 서버 상태 관리가 컴포넌트 내 useEffect + axios로 분산되어 있음
- 캐싱 부재 (매번 API 요청)
- 로딩/에러 상태 수동 관리
- 자동 재시도 미지원

**해결 방안**:
```typescript
// Before
const [projects, setProjects] = useState([]);
const [loading, setLoading] = useState(false);
const [error, setError] = useState(null);

useEffect(() => {
  const fetchProjects = async () => {
    setLoading(true);
    try {
      const response = await client.get('/projects/');
      setProjects(response.data);
    } catch (err) {
      setError(err);
    } finally {
      setLoading(false);
    }
  };
  fetchProjects();
}, []);

// After (React Query)
const { data: projects, isLoading, error } = useQuery({
  queryKey: ['projects'],
  queryFn: () => client.get('/projects/').then(res => res.data),
  staleTime: 5 * 60 * 1000, // 5분 캐싱
  retry: 3,
});
```

**예상 효과**:
- 자동 캐싱으로 불필요한 API 요청 감소
- 로딩/에러 상태 자동 관리
- 자동 재시도 및 무효화 (Invalidation)

#### 2. Lazy Loading (코드 스플리팅)
**문제점**: 전체 번들을 한 번에 로드 (초기 로딩 시간 증가)

**해결 방안**:
```typescript
// Before
import Dashboard from './pages/Dashboard';
import ProjectDetails from './pages/ProjectDetails';
import ClassDetails from './pages/ClassDetails';

// After
const Dashboard = lazy(() => import('./pages/Dashboard'));
const ProjectDetails = lazy(() => import('./pages/ProjectDetails'));
const ClassDetails = lazy(() => import('./pages/ClassDetails'));

<Routes>
  <Route path="/" element={
    <Suspense fallback={<LoadingSpinner />}>
      <Dashboard />
    </Suspense>
  } />
</Routes>
```

**예상 효과**:
- 초기 번들 크기 30-50% 감소
- 초기 로딩 시간 단축
- 페이지별 독립적 로딩

#### 3. Error Boundary
**문제점**: 컴포넌트 에러 시 전체 앱 크래시

**해결 방안**:
```typescript
class ErrorBoundary extends React.Component {
  state = { hasError: false, error: null };

  static getDerivedStateFromError(error) {
    return { hasError: true, error };
  }

  componentDidCatch(error, errorInfo) {
    console.error('Error:', error, errorInfo);
    // Sentry 등 모니터링 도구에 전송
  }

  render() {
    if (this.state.hasError) {
      return <ErrorFallback error={this.state.error} />;
    }
    return this.props.children;
  }
}

// 사용
<ErrorBoundary>
  <App />
</ErrorBoundary>
```

**예상 효과**:
- 부분적 에러로 전체 앱 다운 방지
- 에러 로깅 및 모니터링 용이
- 사용자 친화적 에러 메시지

#### 4. Toast 알림 (react-hot-toast)
**문제점**: alert()로 알림 표시 (UX 저하)

**해결 방안**:
```typescript
// Before
alert('분석이 완료되었습니다.');

// After
import toast, { Toaster } from 'react-hot-toast';

toast.success('분석이 완료되었습니다.', {
  duration: 4000,
  position: 'top-right',
});

// App.tsx에 추가
<Toaster />
```

**예상 효과**:
- 비침습적 알림 (앱 플로우 방해 없음)
- 다양한 스타일 (success, error, loading)
- 자동 사라짐 (타이머)

#### 5. WebSocket 실시간 통신
**문제점**: 3초 간격 폴링으로 실시간성 제한, 불필요한 API 요청

**해결 방안**:
```python
# Server (FastAPI WebSocket)
from fastapi import WebSocket

@app.websocket("/ws/analysis/{job_id}")
async def analysis_websocket(websocket: WebSocket, job_id: str):
    await websocket.accept()
    while True:
        log = get_latest_log(job_id)
        await websocket.send_json({"log": log})
        await asyncio.sleep(0.1)  # 100ms 간격
```

```typescript
// Client (React)
const ws = new WebSocket(`ws://localhost:8000/ws/analysis/${jobId}`);
ws.onmessage = (event) => {
  const data = JSON.parse(event.data);
  setLogs(prev => [...prev, data.log]);
};
```

**예상 효과**:
- 실시간 로그 스트리밍 (100ms 지연)
- 불필요한 HTTP 요청 감소 (80% 절감)
- 서버 부하 감소

### 7.2 중기 개선사항 (3-6개월)

#### 1. Virtual Scrolling (react-window)
**문제점**: 대규모 테이블 (1000+ 행) 렌더링 시 성능 저하

**해결 방안**:
```typescript
import { FixedSizeList as List } from 'react-window';

const ClassList = ({ classes }) => (
  <List
    height={600}
    itemCount={classes.length}
    itemSize={50}
    width="100%"
  >
    {({ index, style }) => (
      <div style={style}>
        {classes[index].name}
      </div>
    )}
  </List>
);
```

**예상 효과**:
- 렌더링 시간 10배 단축 (1000행: 2초 → 0.2초)
- 메모리 사용량 90% 감소
- 스크롤 성능 향상

#### 2. Form Validation (React Hook Form + Zod)
**문제점**: 수동 폼 검증 (코드 중복, 에러 처리 복잡)

**해결 방안**:
```typescript
import { useForm } from 'react-hook-form';
import { zodResolver } from '@hookform/resolvers/zod';
import { z } from 'zod';

const schema = z.object({
  projectName: z.string().min(1, '프로젝트명 필수'),
  sourceFolder: z.string().min(1, '소스 폴더 필수'),
});

const { register, handleSubmit, formState: { errors } } = useForm({
  resolver: zodResolver(schema),
});

const onSubmit = (data) => {
  // 검증된 데이터
};

<form onSubmit={handleSubmit(onSubmit)}>
  <input {...register('projectName')} />
  {errors.projectName && <span>{errors.projectName.message}</span>}
</form>
```

**예상 효과**:
- 타입 안전성 (Zod 스키마)
- 에러 메시지 자동 표시
- 코드 중복 감소

#### 3. State Machine (XState)
**문제점**: 복잡한 상태 관리 (Analysis 페이지)
- 여러 상태 (idle, analyzing, completed, failed, cancelled)
- 상태 전환 조건 복잡

**해결 방안**:
```typescript
import { createMachine } from 'xstate';

const analysisMachine = createMachine({
  id: 'analysis',
  initial: 'idle',
  states: {
    idle: {
      on: { START: 'analyzing' }
    },
    analyzing: {
      on: {
        COMPLETE: 'completed',
        FAIL: 'failed',
        CANCEL: 'cancelled'
      }
    },
    completed: {
      on: { RESET: 'idle' }
    },
    failed: {
      on: { RETRY: 'analyzing', RESET: 'idle' }
    },
    cancelled: {
      on: { RESET: 'idle' }
    }
  }
});
```

**예상 효과**:
- 상태 전환 명확화
- 시각화 가능 (상태 다이어그램)
- 버그 감소 (불가능한 상태 전환 방지)

#### 4. Redis/RabbitMQ 작업 큐
**문제점**: 인메모리 jobs dict
- 서버 재시작 시 작업 이력 손실
- 다중 서버 환경 미지원
- 작업 우선순위 미지원

**해결 방안**:
```python
# Server (Celery + Redis)
from celery import Celery

app = Celery('csa', broker='redis://localhost:6379/0')

@app.task(bind=True)
def analyze_task(self, params):
    self.update_state(state='PROGRESS', meta={'current': 0, 'total': 100})
    # 분석 수행
    return result

# 작업 실행
task = analyze_task.delay(params)
task_id = task.id

# 작업 상태 조회
result = AsyncResult(task_id)
status = result.status  # PENDING, STARTED, SUCCESS, FAILURE
```

**예상 효과**:
- 작업 영구 저장 (서버 재시작 시 복구)
- 다중 서버 환경 지원
- 작업 우선순위 및 재시도 지원
- 모니터링 용이 (Flower 등 도구)

#### 5. Celery 분산 작업 프레임워크
**문제점**: threading.Thread로 백그라운드 작업
- 서버 재시작 시 작업 손실
- 워커 수 제한 (서버 CPU 코어 수)
- 작업 분산 미지원

**해결 방안**:
```python
# Celery 워커 실행
celery -A csa.celery worker --loglevel=info --concurrency=10

# Celery Beat (주기적 작업)
celery -A csa.celery beat --loglevel=info
```

**예상 효과**:
- 무한 확장 (워커 추가로 처리량 증가)
- 주기적 작업 지원 (일일 통계 생성 등)
- 모니터링 및 관리 용이

### 7.3 장기 개선사항 (6-12개월)

#### 1. Micro Frontend
**문제점**: 모놀리식 프론트엔드 (배포 단위 큼)

**해결 방안**:
- Module Federation (Webpack 5)
- 독립 배포 가능한 모듈
  - Dashboard 모듈
  - Analysis 모듈
  - Admin 모듈

**예상 효과**:
- 독립 배포 (전체 앱 재배포 불필요)
- 팀별 독립 개발
- 번들 크기 최적화

#### 2. PWA (Progressive Web App)
**문제점**: 오프라인 미지원, 설치 불가

**해결 방안**:
- Service Worker 등록
- Manifest 파일 추가
- 캐싱 전략 (Cache-First, Network-First)

**예상 효과**:
- 오프라인 조회 가능
- 홈 화면에 설치 가능
- 푸시 알림 지원

#### 3. E2E 테스트 (Playwright/Cypress)
**문제점**: 수동 테스트 의존

**해결 방안**:
```typescript
// Playwright
test('분석 실행', async ({ page }) => {
  await page.goto('/analysis');
  await page.fill('[name="projectName"]', 'test-project');
  await page.click('button:has-text("분석 시작")');
  await expect(page.locator('.progress-bar')).toBeVisible();
});
```

**예상 효과**:
- 회귀 테스트 자동화
- UI 버그 조기 발견
- 리팩토링 안전성 향상

#### 4. 성능 모니터링 (Web Vitals, Sentry)
**문제점**: 성능 문제 사후 대응

**해결 방안**:
```typescript
// Web Vitals
import { getCLS, getFID, getFCP, getLCP, getTTFB } from 'web-vitals';

getCLS(console.log);
getFID(console.log);
getFCP(console.log);
getLCP(console.log);
getTTFB(console.log);

// Sentry
import * as Sentry from "@sentry/react";

Sentry.init({
  dsn: "...",
  integrations: [new Sentry.BrowserTracing()],
  tracesSampleRate: 1.0,
});
```

**예상 효과**:
- 실시간 성능 모니터링
- 에러 자동 수집 및 알림
- 성능 병목 지점 식별

#### 5. 멀티 서버 (로드 밸런싱, 스케일링)
**문제점**: 단일 서버 (SPOF, 성능 한계)

**해결 방안**:
```
          ┌─────────────┐
          │   Nginx     │
          │ (Load LB)   │
          └──────┬──────┘
                 │
        ┌────────┴────────┐
        │                 │
   ┌────▼────┐      ┌────▼────┐
   │ FastAPI │      │ FastAPI │
   │ Server1 │      │ Server2 │
   └────┬────┘      └────┬────┘
        │                 │
        └────────┬────────┘
                 │
          ┌──────▼──────┐
          │   Redis     │
          │ (Session)   │
          └─────────────┘
```

**예상 효과**:
- 고가용성 (HA)
- 성능 향상 (부하 분산)
- 무중단 배포

---

## 8. 기술 부채 및 리스크

### 8.1 기술 부채

#### 1. 이중 드라이버 관리
**문제**: FastAPI(커넥션 풀) vs CSA(직접 드라이버)
- 일관성 부족
- 유지보수 복잡도 증가

**해결 방안**:
- CSA 엔진도 커넥션 풀 사용하도록 통일
- GraphDBBase 클래스 리팩토링

#### 2. 인메모리 작업 관리
**문제**: jobs dict
- 서버 재시작 시 작업 이력 손실
- 다중 서버 환경 미지원

**해결 방안**:
- Redis/RabbitMQ + Celery 도입
- 작업 상태를 영구 저장소에 저장

#### 3. 폴링 기반 통신
**문제**: 3초 간격 폴링
- 실시간성 제한
- 불필요한 API 요청 (서버 부하)

**해결 방안**:
- WebSocket 도입
- Server-Sent Events (SSE) 고려

#### 4. JWT 토큰 localStorage 저장
**문제**: XSS 공격 위험

**해결 방안**:
- HttpOnly Cookie 사용 (XSS 방어)
- Refresh Token 도입 (Access Token 수명 단축)

#### 5. Pagination 미구현
**문제**: 대규모 데이터 조회 시 성능 저하

**해결 방안**:
```typescript
// Before
GET /projects/  // 전체 프로젝트

// After
GET /projects?page=1&limit=20  // 페이지네이션
```

### 8.2 보안 리스크

#### 1. JWT Secret Key 관리
**리스크**: 하드코딩 시 유출 위험

**해결 방안**:
- 환경 변수 (.env)로 관리
- 주기적 로테이션
- AWS Secrets Manager 등 활용

#### 2. API 키 노출
**리스크**: 클라이언트에서 AI API 키 전송

**해결 방안**:
- 서버 측에서 API 키 관리
- 클라이언트는 Provider/Model만 선택

#### 3. SQL Injection (DDL 파싱)
**리스크**: DDL 파일에 악의적인 SQL

**해결 방안**:
- DDL 파일 검증
- 파싱 라이브러리 업데이트

#### 4. 파일 업로드 제한
**리스크**: ZIP 폭탄 등 악의적인 파일

**해결 방안**:
- 파일 크기 제한 (예: 100MB)
- 압축 해제 깊이 제한
- 바이러스 스캔

### 8.3 성능 리스크

#### 1. 대규모 프로젝트 (10,000+ 파일)
**리스크**: 메모리 부족, 타임아웃

**해결 방안**:
- 스트리밍 모드 활성화
- 파일 복잡도 기반 정렬
- 타임아웃 설정 조정

#### 2. Neo4j 쿼리 최적화
**리스크**: 복잡한 쿼리 시 성능 저하

**해결 방안**:
- 인덱스 추가
- 쿼리 프로파일링 (EXPLAIN)
- 쿼리 캐싱

#### 3. AI API Rate Limit
**리스크**: AI 요청 과다 시 API 차단

**해결 방안**:
- Concurrent Requests 조절 (기본값: 15)
- 재시도 로직 (Exponential Backoff)
- 로컬 LLM (LM Studio) 활용

---

## 9. 로드맵 제안

### 9.1 Q1 2026 (1-3월)

**목표**: 사용자 경험 개선 및 안정성 향상

| 주차 | 작업 | 담당 | 우선순위 |
|------|------|------|---------|
| 1-2 | React Query 도입 | 프론트엔드 | 높음 |
| 3-4 | Lazy Loading (코드 스플리팅) | 프론트엔드 | 높음 |
| 5-6 | Error Boundary + Toast 알림 | 프론트엔드 | 중간 |
| 7-8 | WebSocket 실시간 통신 | 풀스택 | 높음 |
| 9-10 | JWT HttpOnly Cookie 전환 | 백엔드 | 높음 |
| 11-12 | 성능 모니터링 (Sentry) 도입 | DevOps | 중간 |

**주요 지표**:
- 초기 로딩 시간: 3초 → 1.5초 (50% 개선)
- API 요청 수: 80% 감소 (React Query 캐싱)
- 실시간 로그 지연: 3초 → 100ms (WebSocket)

### 9.2 Q2 2026 (4-6월)

**목표**: 확장성 및 성능 최적화

| 주차 | 작업 | 담당 | 우선순위 |
|------|------|------|---------|
| 1-2 | Virtual Scrolling (react-window) | 프론트엔드 | 중간 |
| 3-4 | Form Validation (React Hook Form + Zod) | 프론트엔드 | 중간 |
| 5-8 | Redis + Celery 작업 큐 도입 | 백엔드 | 높음 |
| 9-10 | Neo4j 쿼리 최적화 (인덱스, 프로파일링) | 백엔드 | 중간 |
| 11-12 | Pagination 구현 (프로젝트 목록 등) | 풀스택 | 중간 |

**주요 지표**:
- 대규모 테이블 렌더링: 2초 → 0.2초 (10배 개선)
- 서버 재시작 시 작업 복구율: 0% → 100%
- 다중 서버 지원: 가능

### 9.3 Q3 2026 (7-9월)

**목표**: 장기 안정성 및 테스트 자동화

| 주차 | 작업 | 담당 | 우선순위 |
|------|------|------|---------|
| 1-3 | E2E 테스트 (Playwright) 구축 | QA | 높음 |
| 4-6 | State Machine (XState) 도입 | 프론트엔드 | 중간 |
| 7-9 | PWA 전환 (오프라인 지원) | 프론트엔드 | 낮음 |
| 10-12 | 멀티 서버 아키텍처 (Nginx 로드 밸런싱) | DevOps | 높음 |

**주요 지표**:
- E2E 테스트 커버리지: 0% → 80%
- 오프라인 조회 가능
- 무중단 배포 가능

### 9.4 Q4 2026 (10-12월)

**목표**: 차세대 아키텍처 전환

| 주차 | 작업 | 담당 | 우선순위 |
|------|------|------|---------|
| 1-4 | Micro Frontend 설계 및 PoC | 프론트엔드 | 중간 |
| 5-8 | 성능 모니터링 대시보드 구축 (Web Vitals) | DevOps | 중간 |
| 9-12 | 문서화 및 온보딩 자료 작성 | 전체 | 높음 |

**주요 지표**:
- 독립 배포 가능한 모듈: 3개 이상
- 성능 지표 실시간 모니터링
- 신규 개발자 온보딩 시간: 1주 → 2일

---

## 10. 결론

### 10.1 프로젝트 현황 요약

**AI Code Analyzer**는 **강력한 분석 엔진**과 **직관적인 웹 UI**를 갖춘 풀스택 애플리케이션으로, 다음과 같은 강점을 보유하고 있습니다:

1. ✅ **모듈화된 아키텍처**: FastAPI (웹 API) + CSA (분석 엔진) 명확한 계층 분리
2. ✅ **Neo4j 그래프 DB**: 복잡한 관계 표현 및 영향도 분석 최적화
3. ✅ **AI 통합**: 4종 AI Provider 지원, 비동기 병렬 처리
4. ✅ **성능 최적화**: DTO 최적화 (70-90% 단축), 스트리밍 모드, 병렬 처리
5. ✅ **실시간 모니터링**: 진행률 바, 로그 스트리밍, 작업 제어
6. ✅ **사용자 관리**: JWT 인증, 그룹 기반 권한 관리 (RBAC)

### 10.2 주요 개선 기회

단기적으로 다음 개선 사항을 우선적으로 적용하면 **사용자 경험**과 **성능**을 크게 향상시킬 수 있습니다:

1. 🚀 **React Query**: 서버 상태 관리, 캐싱 (API 요청 80% 감소)
2. 🚀 **WebSocket**: 실시간 로그 스트리밍 (3초 → 100ms)
3. 🚀 **Lazy Loading**: 초기 로딩 시간 50% 단축
4. 🚀 **Error Boundary + Toast**: UX 개선, 전역 에러 처리
5. 🚀 **Redis + Celery**: 작업 영구 저장, 다중 서버 지원

### 10.3 최종 권장 사항

#### 즉시 적용 (1개월 이내)
1. React Query 도입 (사용자 경험 개선)
2. Error Boundary + Toast 알림 (안정성 향상)
3. JWT HttpOnly Cookie 전환 (보안 강화)

#### 단기 적용 (3개월 이내)
1. WebSocket 실시간 통신 (성능 개선)
2. Lazy Loading (초기 로딩 개선)
3. Sentry 모니터링 도입 (운영 안정성)

#### 중기 적용 (6개월 이내)
1. Redis + Celery 작업 큐 (확장성)
2. Virtual Scrolling (대규모 데이터 처리)
3. E2E 테스트 자동화 (품질 보증)

이러한 개선 사항을 단계적으로 적용하면, **AI Code Analyzer**는 더욱 강력하고 안정적인 엔터프라이즈급 애플리케이션으로 성장할 수 있습니다.

---

**작성자**: Claude Code Agent
**버전**: 1.0
**최종 수정일**: 2026-01-01
