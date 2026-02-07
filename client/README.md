# AI Code Analyzer Client

`client/`는 AI Code Analyzer의 프론트엔드 애플리케이션입니다.

## 1. 기술 스택
- React 18
- Vite 6
- TypeScript
- React Router DOM
- TanStack Query
- Zustand
- Axios
- Tailwind CSS
- i18next

## 2. 디렉터리 구조
```text
client/
├─ src/
│  ├─ api/                    # API 클라이언트/엔드포인트
│  ├─ components/             # 공통 UI 컴포넌트
│  ├─ hooks/                  # 커스텀 훅
│  ├─ locales/                # 다국어 리소스
│  ├─ machines/               # 상태 머신(XState)
│  ├─ pages/                  # 페이지 컴포넌트
│  ├─ schemas/                # Zod 스키마
│  ├─ store/                  # Zustand 스토어
│  ├─ App.tsx                 # 라우팅
│  └─ main.tsx                # 진입점
├─ vite.config.ts
├─ env.example
└─ README.md
```

## 3. 환경 변수 설정
`client/.env`를 생성하고 아래 값을 설정합니다.

```env
VITE_CLIENT_PORT=5173
VITE_SERVER_HOST=localhost
VITE_SERVER_PORT=8000
```

설명:
- `VITE_CLIENT_PORT`: 프론트 개발 서버 포트
- `VITE_SERVER_HOST`: 프록시 대상 백엔드 호스트
- `VITE_SERVER_PORT`: 프록시 대상 백엔드 포트

참고:
- 예시 파일은 `client/env.example`에 있습니다.
- 백엔드 포트를 변경했다면 `VITE_SERVER_PORT`도 같은 값으로 맞춰야 합니다.

## 4. 실행 방법
```bash
cd client
npm install
npm run dev
```

기본 접속 주소:
- `http://localhost:5173` (`VITE_CLIENT_PORT` 값에 따라 변경)

## 5. 스크립트
```bash
npm run dev
npm run build
npm run lint
npm run preview
```

## 6. API 연동
- 공용 Axios 클라이언트: `src/api/client.ts`
- 기본 Base URL: `/api/v1`
- Vite 프록시: `/api` -> `http://{VITE_SERVER_HOST}:{VITE_SERVER_PORT}`

## 7. 개발 시 유의사항
- API 호출은 가능하면 `src/api/client.ts`를 통해 일관되게 사용해 주세요.
- 로컬 개발 시 백엔드(`server`)가 먼저 실행되어야 정상 동작합니다.
