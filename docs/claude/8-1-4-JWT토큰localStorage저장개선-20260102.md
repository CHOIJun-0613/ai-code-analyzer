# JWT 토큰 localStorage 저장 개선 (XSS 방어)

## 1. 개요
기존의 `localStorage` 기반 JWT 저장 방식은 XSS(Cross-Site Scripting) 공격에 취약하여 토큰 탈취 위험이 있습니다. 이를 해결하기 위해 `HttpOnly Cookie`와 `Refresh Token`을 사용하는 방식으로 인증 구조를 개선합니다.

## 2. 개선 방안

### 2.1 핵심 전략
*   **HttpOnly Cookie**: JavaScript로 접근 불가능한 쿠키에 토큰을 저장하여 XSS 방어.
*   **Refresh Token**: Access Token의 수명을 단축하고, Refresh Token으로 투명하게 갱신하여 보안성과 편의성 확보.

### 2.2 상세 구현

#### Backend (FastAPI)
1.  **로그인 (`/login/access-token`)**: 응답 Body 대신 `Set-Cookie` 헤더로 `access_token`, `refresh_token` 전달.
2.  **토큰 갱신 (`/login/refresh`)**: `refresh_token` 쿠키를 검증하여 새로운 `access_token` 발급.
3.  **로그아웃 (`/login/logout`)**: 쿠키 삭제.
4.  **인증 미들웨어 (`deps.py`)**: 헤더 대신 쿠키에서 토큰 추출.

#### Frontend (React)
1.  **API Client**: `Authorization` 헤더 주입 로직 제거. `401` 에러 시 자동 갱신 로직 추가.
2.  **Auth Store**: `localStorage` 의존성 제거.

## 3. 진행 결과
### 3.1 구현 완료 사항
*   **Backend**:
    *   `config.py`: Refresh Token 만료 기간 설정 추가.
    *   `security.py`: Refresh Token 생성 로직 추가.
    *   `auth.py`: 로그인 시 HttpOnly Cookie(access_token, refresh_token) 발급, 토큰 갱신 및 로그아웃 API 구현.
    *   `deps.py`: 쿠키에서 토큰 추출하도록 인증 의존성 수정.
*   **Frontend**:
    *   `client.ts`: Authorization 헤더 주입 로직 제거, 401 에러 시 자동 토큰 갱신 로직 추가.
    *   `authStore.ts`: localStorage 사용 제거, 로그인/로그아웃 액션 수정.
    *   `Login.tsx`: 로그인 성공 시 토큰 처리 로직 제거 (쿠키로 자동 처리).

### 3.2 검증 포인트
1.  로그인 후 브라우저 개발자 도구 > Application > Cookies에서 `access_token`, `refresh_token` 확인 (HttpOnly 체크됨).
2.  API 요청 헤더에 `Authorization`이 없어도 정상 응답 확인.
3.  `access_token` 쿠키 삭제 후 API 요청 시, 자동으로 `/login/refresh` 호출되고 원래 요청이 성공하는지 확인.
4.  로그아웃 시 쿠키가 삭제되는지 확인.
