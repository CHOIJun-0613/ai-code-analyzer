# WebSocket 보안 강화 (선택사항)

**작성일**: 2026-01-01
**상태**: 제안 (미구현)

---

## 현재 상황

### 브로드캐스팅 범위

현재 WebSocket 구현은 **job_id별로 격리**되어 있습니다:

- ✅ 동일한 job_id로 연결한 클라이언트들끼리만 로그 공유
- ✅ 다른 job_id의 로그는 수신하지 않음
- ⚠️ job_id만 알면 누구나 해당 작업 모니터링 가능 (보안 취약)

### 코드 분석

```python
# websocket.py
@router.websocket("/ws/analysis/{job_id}")
async def websocket_analysis(websocket: WebSocket, job_id: str):
    # job_id만 검증, 사용자 권한은 검증하지 않음
    await manager.connect(websocket, job_id)
```

**문제점**:
- JWT 토큰 검증 없음
- 사용자가 자신의 작업인지 확인하지 않음
- job_id를 추측하면 다른 사용자의 작업 모니터링 가능

---

## 보안 강화 방안

### 1. WebSocket JWT 인증

#### 구현 방법

**Server (websocket.py)**:

```python
from fastapi import WebSocket, WebSocketException, status, Query
from app.api.deps import get_current_user_ws

async def get_current_user_ws(token: str) -> UserInDB:
    """WebSocket용 JWT 검증"""
    from jose import JWTError, jwt
    from app.core.config import settings
    from app.services.user_service import UserService

    try:
        payload = jwt.decode(
            token,
            settings.SECRET_KEY,
            algorithms=["HS256"]
        )
        username: str = payload.get("sub")
        if username is None:
            raise WebSocketException(code=status.WS_1008_POLICY_VIOLATION)

        user = UserService.get_user(username)
        if user is None:
            raise WebSocketException(code=status.WS_1008_POLICY_VIOLATION)

        return user
    except JWTError:
        raise WebSocketException(code=status.WS_1008_POLICY_VIOLATION)


@router.websocket("/ws/analysis/{job_id}")
async def websocket_analysis(
    websocket: WebSocket,
    job_id: str,
    token: str = Query(...)  # URL 쿼리 파라미터로 토큰 전달
):
    # 1. JWT 인증
    try:
        user = await get_current_user_ws(token)
    except WebSocketException:
        await websocket.close(code=1008, reason="Unauthorized")
        return

    # 2. 작업 소유권 확인
    from app.services.analysis_wrapper import get_job_status
    job = get_job_status(job_id)

    if not job:
        await websocket.close(code=1008, reason="Job not found")
        return

    if job.get("user_id") != user.username:
        # 관리자는 모든 작업 모니터링 가능
        is_admin = any(g.name == "Administrators" for g in user.groups)
        if not is_admin:
            await websocket.close(code=1008, reason="Access denied")
            return

    # 3. 연결 수락
    await manager.connect(websocket, job_id)
    logger.info(f"Authenticated WebSocket for {user.username}, job: {job_id}")

    # ... 나머지 로직 ...
```

**Client (useAnalysisWebSocket.ts)**:

```typescript
// JWT 토큰을 URL 쿼리 파라미터로 전달
const token = localStorage.getItem('token');
if (!token) {
  console.error('[WebSocket] No token found');
  return;
}

const wsUrl = `${protocol}//${host}/api/v1/ws/${jobType}/${jobId}?token=${encodeURIComponent(token)}`;
```

#### 장점

- ✅ JWT 기반 인증으로 일관성 유지
- ✅ 사용자 소유권 검증
- ✅ 관리자는 모든 작업 모니터링 가능

#### 단점

- ⚠️ 토큰이 URL에 노출됨 (WebSocket은 Header 전송 제한)
- ⚠️ 토큰 만료 시 재연결 필요

---

### 2. 대안: Ticket 기반 인증

#### 구현 방법

**흐름**:

1. 클라이언트: `POST /api/v1/analysis/analyze/{job_id}/ticket` → Ticket 발급
2. 클라이언트: `ws://.../ws/analysis/{job_id}?ticket={ticket}` → WebSocket 연결
3. 서버: Ticket 검증 (1회용, 5분 유효)

**장점**:

- ✅ JWT 토큰을 URL에 노출하지 않음
- ✅ 1회용 티켓으로 보안 강화
- ✅ 짧은 유효 시간 (5분)

**단점**:

- ⚠️ 추가 API 엔드포인트 필요
- ⚠️ 티켓 저장소 관리 필요 (Redis 권장)

---

### 3. 대안: Secure WebSocket (wss://)

프로덕션 환경에서는 **반드시 wss:// (SSL)** 사용:

```typescript
// 프로덕션 환경
const protocol = window.location.protocol === 'https:' ? 'wss:' : 'ws:';
const wsUrl = `${protocol}://${host}/api/v1/ws/${jobType}/${jobId}`;
```

**Nginx 설정**:

```nginx
location /api/v1/ws/ {
    proxy_pass http://backend;
    proxy_http_version 1.1;
    proxy_set_header Upgrade $http_upgrade;
    proxy_set_header Connection "upgrade";
    proxy_set_header Host $host;
    proxy_set_header X-Real-IP $remote_addr;
}
```

---

## 결론

### 현재 상태 (2026-01-01)

- ✅ job_id별 격리: 정상 작동
- ⚠️ 인증 없음: 보안 취약점

### 권장 사항

**즉시 적용 (필수)**:
1. ✅ wss:// (SSL) 사용 (프로덕션)
2. ✅ job_id를 예측 불가능하게 생성 (UUID 또는 랜덤 토큰 추가)

**단기 적용 (권장)**:
3. ✅ JWT 인증 추가 (방안 1)
4. ✅ 사용자 소유권 검증

**장기 적용 (선택)**:
5. Ticket 기반 인증 (방안 2)
6. Redis 기반 티켓 저장소

---

**작성자**: Claude Code Agent
**최종 수정일**: 2026-01-01
