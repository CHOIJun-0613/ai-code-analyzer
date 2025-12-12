# AI Code Analyzer - Client

**React**, **Vite**, **TypeScript**로 구축된 AI Code Analyzer의 프론트엔드 웹 애플리케이션입니다.

## 개요
이 클라이언트는 다음 기능을 위한 최신 웹 인터페이스를 제공합니다:
- **대시보드**: 프로젝트 통계 및 분석 상태 조회.
- **분석**: 서버 경로 또는 파일 업로드를 통한 새 분석 트리거.
- **시각화**: 대화형 시퀀스 다이어그램 및 클래스 구조 확인.
- **관리**: 사용자 및 권한 관리.

## 기술 스택
- **프레임워크**: React 18 + Vite
- **언어**: TypeScript
- **스타일링**: Tailwind CSS
- **상태 관리**: Zustand
- **HTTP 클라이언트**: Axios
- **라우팅**: React Router DOM
- **아이콘**: Lucide React

## 디렉토리 구조
```
client/
├── src/
│   ├── components/     # 재사용 가능한 UI 컴포넌트 (Layout 등)
│   ├── pages/          # 페이지 컴포넌트 (Login, Dashboard, Analysis, Admin)
│   ├── store/          # 전역 상태 관리 (AuthStore)
│   ├── App.tsx         # 라우팅이 포함된 메인 애플리케이션 컴포넌트
│   └── main.tsx        # 진입점
├── public/             # 정적 자산
├── index.html          # HTML 템플릿
├── package.json        # 의존성 및 스크립트
├── tailwind.config.js  # Tailwind 설정
└── vite.config.ts      # Vite 설정 (API 프록시 포함)
```

## 설정 및 설치

### 1. 사전 요구사항
- Node.js 18 이상
- npm

### 2. 의존성 설치
```bash
cd client
npm install
```

## 클라이언트 실행

### 개발 모드
```bash
npm run dev
```
애플리케이션은 `http://localhost:5173`에서 시작됩니다.
`/api`로 시작하는 API 요청을 `http://localhost:8000` (백엔드 서버)으로 프록시하도록 설정되어 있습니다.

### 프로덕션 빌드
```bash
npm run build
```
결과물은 `dist/` 디렉토리에 생성됩니다.

## 주요 기능

### 인증 (Authentication)
- JWT 토큰 저장을 포함한 로그인 페이지.
- 인증이 필요한 보호된 라우트.

### 대시보드 (Dashboard)
- 분석된 모든 프로젝트 목록 표시.
- 파일 수 및 마지막 업데이트 시간 표시.

### 분석 페이지 (Analysis Page)
- **업로드 모드**: 소스 코드가 포함된 `.zip` 파일 업로드.
- **경로 모드**: 서버의 디렉토리 경로 지정.
- 실시간 상태 추적 (Job ID).

### 관리자 페이지 (Admin Page)
- 새 사용자 생성.
- 사용자 권한 관리 (RBAC).
