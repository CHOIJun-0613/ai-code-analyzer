# AI Code Analyzer - Server

**FastAPI**와 **Neo4j**로 구축된 AI Code Analyzer의 백엔드 서버입니다.

## 개요
이 서버는 다음의 핵심 로직을 제공합니다:
- **정적 코드 분석**: Java/DB 파일을 파싱하여 Neo4j에 저장 (`csa` 모듈 기반).
- **사용자 관리**: JWT 기반 인증, 사용자/그룹/권한 관리.
- **프로젝트 관리**: 대시보드 통계, 프로젝트 계층 구조 조회.
- **분석 실행**: API를 통한 분석 트리거 (로컬 경로 및 파일 업로드 지원).

## 디렉토리 구조
```
server/
├── app/
│   ├── api/            # API 라우트 정의 (v1)
│   ├── core/           # 핵심 설정, 데이터베이스, 보안 로직
│   ├── models/         # API 요청/응답용 Pydantic 모델
│   ├── services/       # 비즈니스 로직 (사용자 서비스, 분석 래퍼)
│   └── main.py         # FastAPI 진입점
├── csa/                # 핵심 분석 엔진 (레거시/공유 로직)
│   ├── models/         # 그래프 엔티티 모델
│   │   └── entities/   # 모듈화된 엔티티 정의 (project.py, class_model.py 등)
├── requirements.txt    # Python 의존성
├── .env.example        # 환경 변수 템플릿
└── README.md           # 이 파일
```

## 설정 및 설치

### 1. 사전 요구사항
- Python 3.10 이상
- Neo4j 데이터베이스 (버전 5.x 권장)

### 2. 가상 환경
`server` 디렉토리 내에서 가상 환경을 생성하고 사용하는 것을 권장합니다.

```bash
# server 디렉토리로 이동
cd server

# 가상 환경 생성
python -m venv .venv

# 활성화 (Windows)
.venv\Scripts\activate

# 활성화 (Linux/Mac)
source .venv/bin/activate
```

### 3. 의존성 설치
```bash
pip install -r requirements.txt
```

### 4. 환경 설정
`server/` 디렉토리에 `.env` 파일을 생성하세요. `.env.example`을 복사하여 사용할 수 있습니다.
```ini
# 프로젝트 설정
PROJECT_NAME="AI Code Analyzer"
API_V1_STR="/api/v1"

# Neo4j 설정
NEO4J_URI=bolt://localhost:7687
NEO4J_USER=neo4j
NEO4J_PASSWORD=your_password
NEO4J_DATABASE=neo4j

# 분석 설정
# JAVA_SOURCE_FOLDER=... (선택 사항, 기본값 사용)
# LOG_LEVEL=INFO
```

## 서버 실행

### 개발 모드
가상 환경을 활성화한 상태에서 실행해야 합니다.

```bash
# 가상 환경 활성화 (Windows)
.venv\Scripts\activate

# 서버 실행
uvicorn app.main:app --reload --port 8000
```
서버는 `http://localhost:8000`에서 시작됩니다.

### API 문서
서버 실행 후 대화형 API 문서를 확인할 수 있습니다:
- **Swagger UI**: `http://localhost:8000/docs`
- **ReDoc**: `http://localhost:8000/redoc`

## 주요 기능 및 엔드포인트

### 인증 (Authentication)
- `POST /api/v1/login/access-token`: JWT 토큰 발급.

### 사용자 (Users)
- `POST /api/v1/users/users/`: 새 사용자 생성.
- `GET /api/v1/users/users/{user_id}`: 사용자 상세 정보 조회.

### 분석 (Analysis)
- `POST /api/v1/analysis/analyze`: 서버 측 경로에 대한 분석 트리거.
- `POST /api/v1/analysis/analyze/upload`: Zip 파일 업로드 및 분석 트리거.
- `GET /api/v1/analysis/analyze/{job_id}`: 분석 상태 확인.

### 프로젝트 (Projects)
- `GET /api/v1/projects/`: 분석된 모든 프로젝트 목록 조회.
- `GET /api/v1/projects/{project_name}/stats`: 프로젝트 통계 조회.
- `GET /api/v1/projects/{project_name}/hierarchy`: 패키지/클래스 계층 구조 조회.

## 개발 참고 사항
- `csa/` 디렉토리는 기존 CLI 도구에서 포팅된 핵심 로직을 포함합니다.
- `app/services/analysis_wrapper.py`는 FastAPI 환경과 `csa` 로직을 연결하는 역할을 합니다.
- **주요 리팩토링 사항 (2025.12)**:
    - `graph_entities.py`: 거대한 모델 파일을 `server/csa/models/entities/` 아래에 도메인별로 분리하여 유지보수성을 개선했습니다.
    - `project_nodes.py` & `class_nodes.py`: 데이터 변환 로직을 분리하고, DB 저장 로직을 배치 처리 방식으로 통합하여 중복을 제거하고 성능을 최적화했습니다.
    - **테스트**: `server/tests/` 디렉토리에 리팩토링 검증을 위한 테스트 케이스가 추가되었습니다.

