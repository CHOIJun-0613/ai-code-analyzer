# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## 프로젝트 개요

**AI Code Analyzer**는 Spring Boot 기반 Java 애플리케이션을 정적 분석하여 코드 구조, 데이터베이스 호출 관계, 영향도를 시각화하고 AI로 설명을 보강하는 **풀스택 웹 애플리케이션**입니다.

### 핵심 특징

- **웹 기반 UI**: React + TypeScript로 구현된 직관적인 웹 인터페이스
- **실시간 모니터링**: 분석 작업 진행률 및 로그를 실시간으로 확인
- **사용자 관리**: JWT 기반 인증 및 그룹별 권한 관리 (RBAC)
- **AI 통합**: Google Gemini, Groq, LM Studio, OpenAI를 활용한 코드 설명 자동 생성
- **강력한 분석 엔진**: Java 코드, JPA/MyBatis, 데이터베이스 스키마 분석
- **시각화**: Mermaid 다이어그램, CRUD 매트릭스, 영향도 분석 리포트

## 아키텍처

### 전체 구조

```
┌─────────────────────────────────────────────────────────────┐
│                    Client (React App)                        │
│              http://localhost:5173                           │
│  ┌──────────────┐  ┌──────────────┐  ┌──────────────┐      │
│  │  Dashboard   │  │   Analysis   │  │    Admin     │      │
│  │  Project     │  │   AI Enrich  │  │  User/Group  │      │
│  │  Class View  │  │   History    │  │              │      │
│  └──────────────┘  └──────────────┘  └──────────────┘      │
└──────────────────────┬──────────────────────────────────────┘
                       │ HTTP/REST + JWT
┌──────────────────────▼──────────────────────────────────────┐
│              Server (FastAPI Backend)                        │
│              http://localhost:8000                           │
│  ┌────────────────────────────────────────────────────┐     │
│  │  app/ (Web API Layer)                              │     │
│  │  ├─ JWT 인증 (OAuth2 Password Flow)               │     │
│  │  ├─ 사용자/그룹 관리 (RBAC)                       │     │
│  │  ├─ 분석 작업 관리 (백그라운드 스레드)            │     │
│  │  └─ 리포트 생성 (Stats, CRUD Matrix, Class Spec)  │     │
│  └────────────────────────────────────────────────────┘     │
│  ┌────────────────────────────────────────────────────┐     │
│  │  csa/ (Analysis Engine)                            │     │
│  │  ├─ Java Parser (javalang AST)                     │     │
│  │  ├─ Spring/JPA/MyBatis Analyzer                    │     │
│  │  ├─ DB DDL Parser                                  │     │
│  │  ├─ AI Enrichment (비동기 병렬 처리)               │     │
│  │  └─ Call Chain & Impact Analysis                   │     │
│  └────────────────────────────────────────────────────┘     │
└──────────────────────┬──────────────────────────────────────┘
                       │ Neo4j Driver
┌──────────────────────▼──────────────────────────────────────┐
│                  Neo4j Graph Database                        │
│              bolt://localhost:7687                           │
│  - Project, Class, Method, Field, Package                    │
│  - Bean, Endpoint, Mapper, SQL, Table                        │
│  - User, UserGroup, AnalysisHistory                          │
└─────────────────────────────────────────────────────────────┘
```

### 디렉토리 구조

```
ai-code-analyzer/
├── client/                         # React 프론트엔드
│   ├── src/
│   │   ├── api/                   # API 클라이언트 (Axios)
│   │   ├── components/            # 공통 컴포넌트
│   │   ├── pages/                 # 페이지 컴포넌트
│   │   ├── store/                 # 상태 관리 (Zustand)
│   │   └── locales/               # 다국어 (i18n)
│   ├── package.json
│   └── vite.config.ts
│
├── server/                         # FastAPI 백엔드
│   ├── app/                       # 웹 API 레이어
│   │   ├── api/v1/               # REST API 엔드포인트
│   │   │   ├── endpoints/        # 기능별 라우터
│   │   │   │   ├── auth.py       # 로그인/인증
│   │   │   │   ├── users.py      # 사용자 관리
│   │   │   │   ├── groups.py     # 그룹 관리
│   │   │   │   ├── projects.py   # 프로젝트 조회
│   │   │   │   ├── analysis.py   # 코드 분석 실행
│   │   │   │   ├── ai_analysis.py # AI enrichment
│   │   │   │   ├── reports.py    # 리포트 생성
│   │   │   │   └── class_reports.py # 클래스 리포트
│   │   │   └── deps.py           # 의존성 주입 (JWT 검증)
│   │   ├── core/                 # 핵심 설정
│   │   │   ├── config.py         # 환경 변수 (Settings)
│   │   │   ├── security.py       # JWT, 비밀번호 해싱
│   │   │   └── database.py       # Neo4j 커넥션 풀
│   │   ├── models/               # Pydantic 모델
│   │   │   └── user.py          # User, Group, Permission
│   │   ├── services/             # 비즈니스 로직
│   │   │   ├── analysis_wrapper.py # 분석 작업 관리
│   │   │   └── user_service.py  # 사용자 서비스
│   │   └── main.py               # FastAPI 앱 진입점
│   │
│   ├── csa/                       # 코드 분석 엔진
│   │   ├── cli/                  # CLI 명령어 (레거시)
│   │   ├── models/               # 그래프 엔티티 모델
│   │   ├── services/             # 분석 서비스
│   │   │   ├── analysis/         # 분석 파이프라인
│   │   │   ├── java_analysis/    # Java 파싱 모듈
│   │   │   ├── graph_db/         # Neo4j CRUD
│   │   │   ├── db_call_analysis/ # 호출 관계 분석
│   │   │   ├── class_spec/       # 클래스 명세서
│   │   │   ├── ai_enrichment_service.py
│   │   │   ├── class_report_service.py
│   │   │   └── report_service.py
│   │   ├── parsers/              # 저수준 파서
│   │   │   ├── java/            # Java 논리명/설명 추출
│   │   │   ├── db/              # DDL 파서
│   │   │   ├── sql/             # SQL 파서
│   │   │   └── vendor/javalang/ # Java AST 파서
│   │   ├── diagrams/             # 시각화 생성
│   │   ├── aiwork/               # AI 분석
│   │   ├── dbwork/               # Neo4j 커넥션 풀
│   │   └── utils/                # 유틸리티
│   │
│   ├── requirements.txt
│   └── .env                      # 환경 변수
│
├── docs/                          # 문서
├── neo4j/                         # Neo4j 설정
├── README.md
└── CLAUDE.md
```

## 핵심 기술 스택

### 프론트엔드 (client/)

- **프레임워크**: React 18.3.1 + TypeScript 5.6.2
- **빌드 도구**: Vite 6.0.5
- **스타일링**: Tailwind CSS 3.4.17
- **라우팅**: React Router DOM 6.22.3
- **상태 관리**: Zustand 4.5.2 (인증 상태)
- **HTTP 클라이언트**: Axios 1.6.8
- **국제화**: i18next 23.10.0, react-i18next 14.1.0
- **다이어그램**: Mermaid 10.9.0
- **마크다운**: react-markdown 9.0.1, remark-gfm 4.0.0
- **데이터 처리**: ExcelJS 4.4.0
- **PDF/이미지**: jsPDF 3.0.4, html2canvas 1.4.1
- **아이콘**: Lucide React 0.363.0

### 백엔드 (server/)

- **웹 프레임워크**: FastAPI (비동기 REST API)
- **ASGI 서버**: Uvicorn
- **데이터 검증**: Pydantic, pydantic-settings
- **인증**: python-jose (JWT), passlib (bcrypt)
- **데이터베이스**: neo4j (Neo4j Driver)
- **Java 파싱**: javalang (AST 파서)
- **SQL 파싱**: sqlparse
- **AI 통합**: google-generativeai, groq, openai
- **유틸리티**: pathspec (.csaignore), pyyaml (설정 파일)

## 주요 기능

### 1. 사용자 관리 및 인증

#### 사용자 인증 (JWT)
- OAuth2 Password Flow 기반 로그인
- JWT 토큰 발급 (30분 만료)
- 토큰 기반 API 인증 (Bearer Token)
- 자동 로그아웃 (401 에러 시)

#### 권한 관리 (RBAC)
- **Permission 타입**: MANAGE_USERS, ANALYZE_CODE, VIEW_PROJECT, MANAGE_PROJECT
- **그룹 기반 권한**: 사용자 → 그룹 → 권한 + 프로젝트
- **Administrators 그룹**: 모든 프로젝트 접근, 사용자/그룹 관리
- **일반 그룹**: 지정된 프로젝트만 접근

#### 사용자 프리퍼런스
- **일반 설정**: 테마(Normal/Dark Modern), 언어(한국어/English)
- **AI 설정**: Provider, Model, API Key, Endpoint (사용자별 저장)

### 2. 코드 정적 분석

#### 분석 모드
- **서버 경로**: 서버에 있는 소스 코드 경로 지정
- **ZIP 업로드**: 압축 파일 업로드 후 자동 압축 해제

#### 분석 범위
- **Program**: Java 소스만 분석
- **DB**: 데이터베이스 스키마만 분석
- **All**: Java + DB 전체 분석

#### 저장 전략
- **Delete**: 기존 프로젝트 데이터 삭제 후 재분석 (--clean)
- **Update**: 기존 데이터 유지, 신규 항목만 추가 (--update)

#### 성능 옵션
- **Workers**: 병렬 파싱 워커 수 (기본값: max(4, CPU-2))
- **Timeout**: 파일 파싱 타임아웃 (초, 기본값: 120)
- **Complexity Threshold**: 파일 복잡도 임계값 (초과 시 제외)
- **Skip DTO Source**: DTO 소스 저장 건너뛰기 (성능 향상)
- **Skip DTO Methods**: DTO 메서드 분석 생략
- **Exclude Patterns**: .csaignore 패턴 (gitignore 문법)

#### 실시간 모니터링
- **진행률 바**: 전체 진행률 % 표시
- **로그 스트리밍**: 3초 간격 폴링으로 로그 표시
- **작업 제어**: 시작/중지 (Cancellation)
- **로그/요약 다운로드**: 텍스트 파일로 다운로드

### 3. AI Enrichment

#### AI Provider 지원
- **Google Gemini**: gemini-1.5-flash, gemini-1.5-pro
- **Groq**: llama-3.1-70b-versatile, mixtral-8x7b
- **LM Studio**: 로컬 LLM (API 엔드포인트 필요)
- **OpenAI**: gpt-4o-mini, gpt-4o

#### 분석 범위
- **프로젝트**: 드롭다운에서 선택
- **노드 타입**: class, method, sql, all
- **클래스 필터**: 특정 클래스만 분석 (선택사항)
- **제한**: 최대 노드 수 (0 = 전체)

#### 저장 옵션
- **Clean**: 기존 ai_description 삭제 후 재분석
- **Update**: 기존 ai_description 유지, 빈 노드만 채움

#### 성능 제어
- **Concurrent Requests**: 동시 AI 요청 수 (기본값: 15, 로컬: 10-20, 클라우드: 5-10)
- **Batch Size**: (Deprecated) Concurrent Requests 사용 권장
- **비동기 병렬 처리**: asyncio로 성능 최적화

### 4. 프로젝트 탐색

#### 대시보드
- 프로젝트 목록 (카드 형식)
- 파일 개수, 업데이트 시간 표시
- 프로젝트 클릭 시 상세 페이지 이동

#### 프로젝트 상세
- **프로젝트 정보**: 이름, 프레임워크, 저장소, 경로 (편집 가능)
- **코드 통계**: PLOC, LLOC, CLOC, 파일 개수
- **패키지/클래스 계층**: 2분할 레이아웃
  - 왼쪽: 패키지 목록 (검색 가능)
  - 오른쪽: 클래스 테이블 (Physical/Logical 이름)
- **전역 검색**: 모든 패키지에서 클래스 검색

#### 클래스 상세
- **메타데이터**: 타입, 하위 타입, 어노테이션, 상속 정보
- **코드 메트릭**: PLOC/LLOC/CLOC, 코드 복잡도 (가중치 기반)
- **탭 구조**:
  - `info`: 개요, AI 설명 (Markdown)
  - `source`: 소스 코드 뷰어 (줄 번호, 복사, 전체 선택)
  - `methods`: 메서드 테이블 (visibility, 복잡도, LOC)
  - `fields`: 필드 테이블 (name, type, initial value)

### 5. 리포트 생성

#### Project Reports
- **Stats Report**: 프로젝트 통계 (Markdown)
- **CRUD Matrix**: 클래스별 테이블 CRUD 작업 매핑 (Grid 뷰, Excel 다운로드)
- **Class List**: 패키지별 클래스 목록 (Grid 뷰, Excel 다운로드)

#### Class Reports
- **Class Spec**: 클래스 명세서 (Markdown)
- **Sequence Diagram**: 시퀀스 다이어그램 (Mermaid)
- **Impact Analysis**: 영향도 분석 (Markdown, Excel)

#### 리포트 뷰어 모달
- Markdown 렌더링 (react-markdown + remark-gfm)
- Grid 뷰 (CRUD Matrix, Class List)
- 다운로드 (PDF, Excel, Text)
- 풀스크린 모달

### 6. 분석 히스토리

- 분석 이력 조회 (최근 100개)
- 프로젝트별 필터링
- 작업 정보: 시작/종료 시간, 소요 시간, 파일 개수, 결과
- 분석 옵션 저장 (preferences, preferences_ai)

### 7. 관리자 기능

#### 사용자 관리
- CRUD (생성, 조회, 수정, 삭제)
- 그룹 할당
- 활성화/비활성화
- Administrators 그룹만 접근 가능

#### 그룹 관리
- CRUD
- 권한 할당 (Permission)
- 프로젝트 접근 권한 할당
- Administrators 그룹만 접근 가능

## 핵심 데이터 플로우

### 분석 작업 실행 플로우

```
Client (Analysis Page)
  ↓
POST /api/v1/analysis/analyze
  {
    source_folder, project_name, application_name,
    db_script_folder, clean, use_ai, scope,
    skip_dto_source, skip_dto_methods,
    use_streaming_parse, java_parse_workers,
    java_file_parse_timeout, exclude_patterns
  }
  ↓
Server (analysis.py → analysis_wrapper.py)
  ↓
1. 작업 ID 생성: YYYYMMDD-HHMMSS-mmm-USERID-RAND5
2. jobs dict에 작업 상태 저장
3. 백그라운드 스레드 시작: run_analysis_task()
  ↓
run_analysis_task()
  ├─ 로그 핸들러 설정 (JobLogHandler)
  ├─ csa.services.analyze_service.analyze_project() 호출
  │   ├─ handlers.py: analyze_project()
  │   │   ├─ 옵션 검증 (validate_analyze_options)
  │   │   ├─ Neo4j 준비 (clean 시 데이터 삭제, 인덱스 생성)
  │   │   ├─ Java 분석 (java_pipeline.py)
  │   │   │   ├─ 스트리밍 모드: 파일 단위 처리, 즉시 Neo4j 저장
  │   │   │   └─ 배치 모드: 전체 메모리 적재 후 배치 저장
  │   │   ├─ DB 분석 (db_pipeline.py)
  │   │   │   └─ DDL 파일 파싱 → Database/Table/Column 추출
  │   │   └─ Neo4j 저장 (neo4j_writer.py)
  │   │       ├─ Project/Package/Class/Method/Field 노드
  │   │       ├─ Bean/Endpoint/Mapper/SQL 노드
  │   │       └─ 관계 생성 (BELONGS_TO, HAS_METHOD, CALLS 등)
  │   └─ 분석 이력 저장 (analysis_history.py)
  ├─ 결과를 jobs dict에 저장
  └─ Neo4j에 AnalysisHistory 노드 저장
  ↓
Client (Polling, 3초 간격)
  ├─ GET /api/v1/analysis/analyze/{job_id} → status
  └─ GET /api/v1/analysis/analyze/{job_id}/logs → logs[]
  ↓
Status: 'completed' / 'failed' / 'cancelled'
  ↓
Client (Summary Modal)
```

### AI Enrichment 플로우

```
Client (CodeAiAnalysis Page)
  ↓
POST /api/v1/ai/enrich
  {
    project_name, node_type, limit, clean,
    concurrent_requests, log_level,
    ai_config: { provider, model_name, api_key, api_endpoint }
  }
  ↓
Server (ai_analysis.py → ai_enrichment_service.py)
  ↓
1. 작업 ID 생성
2. ai_jobs dict에 작업 상태 저장
3. 백그라운드 스레드 시작
  ↓
run_ai_enrichment_task()
  ├─ 로그 핸들러 설정
  ├─ AIEnrichmentService.enrich_project() 호출
  │   ├─ Neo4j에서 ai_description 없는 노드 조회
  │   ├─ 비동기 병렬 처리 (asyncio)
  │   │   ├─ 동시 요청 수: concurrent_requests
  │   │   └─ AI Provider에 요청 → ai_description 생성
  │   └─ Neo4j 업데이트 (ai_description)
  ├─ 진행률 표시 ([current/total] (percent%))
  └─ 취소 지원 (stop_check_callback)
  ↓
Client (Polling, 3초 간격)
  ├─ GET /api/v1/ai/{job_id} → status
  └─ GET /api/v1/ai/{job_id}/logs → logs[]
  ↓
Status: 'completed' / 'failed' / 'cancelled'
```

### 인증 플로우

```
Client (Login Page)
  ↓
POST /api/v1/login/access-token
  { username, password }
  ↓
Server (auth.py)
  ├─ 사용자 조회 (Neo4j)
  ├─ 비밀번호 검증 (bcrypt)
  └─ JWT 토큰 생성 (30분 만료)
  ↓
Response: { access_token, token_type: "bearer" }
  ↓
Client (authStore)
  ├─ localStorage.setItem('token', token)
  └─ navigate('/')
  ↓
이후 모든 API 요청
  ├─ Request Interceptor: Authorization: Bearer <token>
  └─ deps.get_current_user()로 토큰 검증
```

## 환경 설정

### 필수 환경 변수 (server/.env)

```ini
# Neo4j 연결 설정 (필수)
NEO4J_URI=bolt://localhost:7687
NEO4J_USER=neo4j
NEO4J_PASSWORD=your_password
NEO4J_DATABASE=neo4j
NEO4J_POOL_SIZE=10
NEO4J_BATCH_SIZE=25

# JWT 설정 (필수)
SECRET_KEY=your-secret-key-here
ACCESS_TOKEN_EXPIRE_MINUTES=30

# 분석 대상 경로 (선택사항, 기본값 사용 가능)
JAVA_SOURCE_FOLDER=/path/to/source
DB_SCRIPT_FOLDER=/path/to/db/scripts

# 성능 최적화 (선택사항)
USE_STREAMING_PARSE=true
JAVA_PARSE_WORKERS=8
JAVA_FILE_PARSE_TIMEOUT=120.0
JAVA_COMPLEXITY_THRESHOLD=50000
SKIP_DTO_SOURCE=true
SKIP_DTO_METHODS=true

# AI 분석 설정 (선택사항)
USE_AI_ANALYSIS=false
CONCURRENT_AI_REQUESTS=15
AI_PROVIDER=lmstudio
GOOGLE_API_KEY=
GROQ_API_KEY=
LM_STUDIO_API_ENDPOINT=http://localhost:1234/v1
OPENAI_API_KEY=

# 로그 레벨
LOG_LEVEL=INFO
```

## 개발 가이드라인

### 코드 스타일

#### Python (server/)
- **PEP 8 준수**: 4칸 들여쓰기, `snake_case` 함수/모듈, `PascalCase` 클래스
- **타입 힌트**: 모든 함수 시그니처에 타입 힌트 추가
- **Pydantic 모델**: 데이터 검증 및 직렬화
- **Docstring**: 모든 public 함수/클래스에 한국어 docstring

#### TypeScript (client/)
- **함수 컴포넌트**: React Hooks 사용
- **타입 정의**: interface 또는 type 명시
- **Props 타입**: 모든 컴포넌트에 Props 인터페이스
- **상태 관리**: Zustand (전역), useState (로컬)

### 보안 원칙

- **민감 정보 커밋 금지**: `.env`, API 키, JWT 시크릿
- **JWT 토큰**: localStorage 저장 (HttpOnly Cookie 대안 고려)
- **비밀번호**: bcrypt 해싱 (평문 저장 금지)
- **CORS**: Vite Proxy 사용 (개발 환경)
- **권한 확인**: 모든 API에서 get_current_user() 사용

### 테스트

```bash
# Python 테스트 (server/)
cd server
.venv\Scripts\activate  # Windows
pytest tests/

# 단위 테스트만
pytest tests/unit

# 통합 테스트만
pytest tests/integration
```

### 로깅

- **작업별 로그 분리**: `logs/analysis-{job_id}.log`, `logs/analysis-ai-{job_id}.log`
- **전역 로그**: `logs/csa.log`
- **로그 레벨**: DEBUG, INFO, WARNING, ERROR
- **자동 정리**: 7일 이상 된 로그 파일 삭제

## 주의사항

### 개발 원칙
- **구조 변경 금지**: 임의로 애플리케이션 구조를 변경하지 말 것
- **확인 절차**: 수정 전 영향도 분석 후 사용자에게 확인
- **한국어 소통**: 모든 답변 및 주석은 한국어로 작성
- **수정 내역 공유**: 수정 후 이유와 내용을 명확히 설명

### Neo4j 연결
- **커넥션 풀**: FastAPI에서는 싱글톤 커넥션 풀 사용 (app/core/database.py)
- **직접 드라이버**: CSA 엔진에서는 분석 작업마다 새 드라이버 생성 (csa/services/graph_db/base.py)
- **트랜잭션 관리**: 작업 후 반드시 커밋/롤백
- **연결 종료**: 프로그램 종료 시 명시적으로 close()

### 분석 대상 제외
- `.`으로 시작하는 폴더 (.git, .venv, .pytest_cache, .vscode 등)
- `commands/` (Windows Batch 스크립트)
- `logs/` (분석 로그)
- `neo4j/` (Neo4j 설정 파일)
- `target_src/` (분석 대상 소스, 별도 구성)

### .csaignore 패턴
- .gitignore와 동일한 문법 (pathspec 라이브러리)
- 프로젝트 루트에 `.csaignore` 파일 생성
- 예제:
  ```
  # 생성된 코드
  **/generated/**
  **/target/generated-sources/**

  # 대용량 DTO
  **/*DODT.java
  **/*DIDT.java

  # 특정 패키지
  **/com/example/deprecated/**

  # 예외 (다시 포함)
  !**/com/example/deprecated/ImportantClass.java
  ```

## 확장 가능성

### 새 기능 추가 패턴

#### 백엔드 (server/)
- **새 API 엔드포인트**: `app/api/v1/endpoints/` 아래 추가 후 `app/api/v1/api.py`에 등록
- **새 서비스**: `app/services/` 또는 `csa/services/` 아래 기능별로 추가
- **새 Pydantic 모델**: `app/models/` 또는 `csa/models/` 아래 추가
- **새 Neo4j 노드**: `csa/models/graph_entities.py`에 Pydantic 모델 추가
- **새 그래프 작업**: `csa/services/graph_db/` 아래 적절한 모듈에 추가

#### 프론트엔드 (client/)
- **새 페이지**: `src/pages/` 아래 추가 후 `App.tsx`에 라우트 등록
- **새 컴포넌트**: `src/components/` 아래 추가
- **새 API 함수**: `src/api/` 아래 추가 (또는 컴포넌트에서 직접 `client` 사용)
- **새 상태**: Zustand store 추가 (`src/store/`)
- **새 다국어 키**: `src/locales/en/translation.json`, `src/locales/ko/translation.json`에 추가

### 개선 제안

#### 단기
1. **React Query 도입**: 서버 상태 관리, 캐싱, 자동 재시도
2. **Lazy Loading**: 페이지 컴포넌트 코드 스플리팅
3. **Error Boundary**: 전역 에러 처리
4. **Toast 알림**: alert 대신 우아한 알림 (react-hot-toast)
5. **WebSocket**: 실시간 로그 스트리밍 (polling 대신)

#### 중기
1. **Virtual Scrolling**: 대규모 테이블 (react-window)
2. **Form Validation**: React Hook Form + Zod
3. **State Machine**: XState (복잡한 상태 관리)
4. **Redis/RabbitMQ**: 작업 큐 관리 (인메모리 jobs dict 대신)
5. **Celery**: 분산 작업 프레임워크

#### 장기
1. **Micro Frontend**: 독립 배포 가능한 모듈
2. **PWA**: 오프라인 지원, 설치 가능
3. **E2E 테스트**: Playwright/Cypress
4. **성능 모니터링**: Web Vitals, Sentry
5. **멀티 서버**: 로드 밸런싱, 스케일링

## 문제 해결

### 일반적인 문제

1. **Neo4j 연결 오류**: Neo4j 서비스 실행 상태 및 `.env` 설정 확인
2. **JWT 토큰 오류**: SECRET_KEY 설정 확인, 토큰 만료 시간 확인
3. **파싱 오류**: Java 버전, javalang 버전 확인
4. **AI API 오류**: API 키, 엔드포인트 확인, Rate Limit 확인

### 디버깅

```bash
# Python 디버깅 (server/)
LOG_LEVEL=DEBUG python -m csa.cli.main analyze --all-objects

# 로그 확인
tail -f logs/csa.log
tail -f logs/analysis-{job_id}.log

# FastAPI 디버깅
uvicorn app.main:app --reload --log-level debug

# React 디버깅 (client/)
npm run dev
# 브라우저 콘솔 (F12) 확인
```

### 데이터베이스 초기화

```bash
# Neo4j 브라우저 (http://localhost:7474)
MATCH (n) DETACH DELETE n

# 전체 재분석
python -m csa.cli.main analyze --all-objects --clean --project-name myproject
```

## 라이선스

MIT License
