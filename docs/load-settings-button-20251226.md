# 분석 화면 '설정 불러오기' 기능 추가 및 버그 수정

**작성일:** 2025년 12월 26일
**작성자:** Antigravity

## 1. 개요

분석 화면(Analysis Page)에서 사용자가 저장된 설정을 다시 불러올 수 있는 '설정 불러오기' 버튼을 추가하고, 초기 버전에서 빈 값(empty string)이나 0 등의 값이 제대로 반영되지 않던 문제와 User 노드에 설정이 저장되지 않던 문제를 수정하였습니다.

## 2. 변경 사항

### Frontend

- **파일**: `client/src/pages/Analysis.tsx`
- **변경 내용**:
    1. `loadPreferences` 함수 분리 및 로직 개선:
        - 기존 `useEffect` 내 로직을 별도 함수로 추출.
        - **수정 사항**: `if (res.data.key)` 형태의 Truthy 체크를 `if (res.data.key !== undefined)` 형태로 변경.
        - **이유**: 빈 문자열(`""`)이나 `0`, `false` 같은 유효한 설정값이 "거짓"으로 평가되어 상태 업데이트가 무시되는 문제를 해결하기 위함.
    2. '설정 불러오기' 버튼 추가: "소스 코드 분석 옵션" 헤더 우측에 배치.

- **파일**: `client/src/locales/ko/translation.json`, `client/src/locales/en/translation.json`
- **변경 내용**: `loadSettings` 다국어 키 추가.

### Backend

- **파일**: `server/app/services/user_service.py`
- **변경 내용**:
  - `get_user_preferences` 및 `update_user_preferences` 메서드 수정.
  - **수정 사항**: DB 쿼리 시 `MATCH (u:User {username: $username})`를 `MATCH (u:User {id: $username})`으로 변경.
  - **이유**: 실제 데이터베이스 상의 User 노드는 `username`이라는 속성 대신 `id` 속성에 식별자(username 값)를 저장하고 있음. 잘못된 속성 매칭으로 인해 설정값 저장 쿼리가 실패(대상 노드 없음)하고 있었음.

## 3. UI 변경

**설정 불러오기 버튼 위치**:

```tsx
<div className="flex items-center gap-2">
    <button onClick={loadPreferences} ... >
        {t('analysis.loadSettings')}
    </button>
    <button onClick={savePreferences} ... >
        {t('analysis.saveSettings')}
    </button>
</div>
```

## 4. 문제 해결 (Troubleshooting)

### 문제 1: 빈 설정값이 화면에 반영되지 않음

- **증상**: '설정 저장' 후 값을 변경하고 '설정 불러오기'를 해도 원래대로 돌아오지 않음 (특히 필드를 지운 경우).
- **원인**: Javascript에서 빈 문자열 `""`은 `false`로 취급됨. 따라서 서버에서 `api_key: ""`를 반환해도 `if (res.data.api_key)` 조건문이 실패하여 로컬 상태(`api_key: "some_value"`)가 덮어씌워지지 않았음.
- **해결**: 모든 설정값 할당 로직을 `undefined` 여부만 확인하도록 수정하여, 빈 값도 정확히 반영되도록 조치함.

### 문제 2: 설정값이 DB에 저장되지 않음

- **증상**: '설정 저장' 버튼을 눌러도 `preferences` 속성이 DB에 생성되지 않음.
- **원인**: `UserService`에서 사용자를 찾을 때 `username` 속성을 조회했으나, 실제 DB에는 `id` 속성만 존재함.
- **해결**: 쿼리 대상을 `username`에서 `id`로 변경하여 정상적으로 User 노드를 찾아 업데이트하도록 수정함.
