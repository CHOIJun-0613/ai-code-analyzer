# AI Code Analyzer

AI Code Analyzer는 Spring Boot 기반 Java 애플리케이션과 데이터베이스 스키마를 분석하여 코드 구조, DB 호출 관계, 영향도를 시각화하고 AI로 설명을 보강하는 도구입니다.
기존의 CLI 도구를 확장하여 **웹 기반의 클라이언트/서버 아키텍처**를 제공합니다.

## 아키텍처

이 프로젝트는 다음과 같이 구성되어 있습니다:

- **Server (`server/`)**: FastAPI 기반의 백엔드 서버.
    - Neo4j를 사용하여 코드 및 사용자 데이터를 관리합니다.
    - 기존 CSA(Code Static Analyzer) 로직을 통합하여 분석을 수행합니다.
    - 사용자 인증 및 권한 관리(RBAC)를 제공합니다.
- **Client (`client/`)**: React + Vite 기반의 프론트엔드 웹 애플리케이션.
    - 대시보드, 분석 요청, 결과 조회, 관리자 기능을 제공합니다.
    - Tailwind CSS로 스타일링되었습니다.

## 사전 요구사항 (Prerequisites)

- **Python**: 3.10 이상
- **Node.js**: 18 이상
- **Neo4j**: 5.x 이상 (Bolt 포트 7687 활성화 필요)

## 설치 및 설정

### 1. 저장소 클론
```bash
git clone <repository-url>
cd ai-code-analyzer
```

### 2. 백엔드 (Server) 설정
```bash
cd server
python -m venv .venv
# Windows
.venv\Scripts\activate
# Linux/Mac
source .venv/bin/activate

pip install -r requirements.txt
```
`.env` 파일을 `server` 디렉토리에 생성하고 Neo4j 설정을 확인하세요 (기본값 사용 시 생략 가능).

### 3. 프론트엔드 (Client) 설정
```bash
cd client
npm install
```

## 실행 방법

### 간편 실행 (Windows)
프로젝트 루트에서 다음 배치 파일을 실행하세요.
- **서버 시작**: `start_server.bat`
- **클라이언트 시작**: `start_client.bat`

### 수동 실행

**Server:**
```bash
cd server
uvicorn app.main:app --reload --port 8000
```

**Client:**
```bash
cd client
npm run dev
```
브라우저에서 `http://localhost:5173`으로 접속합니다.

## 주요 기능

1.  **대시보드**: 프로젝트 분석 현황 및 통계 확인.
2.  **코드 분석**:
    - **서버 경로 분석**: 서버에 위치한 소스 코드 경로를 지정하여 분석.
    - **파일 업로드**: Zip 파일로 소스 코드를 업로드하여 분석.
3.  **관리자 기능**: 사용자 및 그룹 관리, 권한 설정.
4.  **시각화**: Mermaid.js를 이용한 시퀀스 다이어그램 및 클래스 구조 시각화.

## 레거시 CLI 사용
기존의 CLI 도구도 여전히 사용할 수 있습니다.
```bash
cd server
python -m csa.cli.main --help
```

## 라이선스
MIT License
