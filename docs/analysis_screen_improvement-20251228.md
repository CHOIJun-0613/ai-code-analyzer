# 코드 정적 분석 화면 개선 작업

## 작업 개요

코드 정적 분석 화면(`Code Static Analysis`)에서 프로젝트 이름 입력 필드의 폭을 줄이고, 그 우측에 "어플리케이션 이름(Application Name)" 입력 필드를 추가하였습니다. 또한, 해당 값이 백엔드 분석 API로 정상적으로 전달되도록 서버와 클라이언트 코드를 모두 수정하였습니다.

## 주요 변경 사항

### 1. Frontend UI 개선 (`Analysis.tsx`)

- **레이아웃 변경**: 기존 단일 컬럼 형태였던 "프로젝트 이름" 영역을 2컬럼 그리드(`grid-cols-2`)로 변경하여 공간 효율성을 높였습니다.
- **필드 추가**: "어플리케이션 이름" 입력 필드를 추가하고, 최대 30자 제한을 설정하였습니다.
- **상태 관리**: `applicationName` 상태 변수를 추가하고, 분석 요청 시 API payload에 포함되도록 로직을 수정했습니다.

```tsx
// 변경 후 레이아웃 예시
<div className="grid grid-cols-1 md:grid-cols-2 gap-6">
    <div>{/* 프로젝트 이름 */}</div>
    <div>{/* 어플리케이션 이름 */}</div>
</div>
```

### 2. 다국어 처리 (`translation.json`)

- 한국어 리소스 파일에 "어플리케이션 이름" 라벨과 플레이스홀더 텍스트를 추가하였습니다.
  - `"applicationName": "어플리케이션 이름"`
  - `"applicationNamePlaceholder": "예: MyApp"`

### 3. Backend API 확장 (`server/app/api/v1/endpoints/analysis.py`)

- `/analyze/upload` (ZIP 업로드 분석) 엔드포인트에 `application_name` 파라미터를 추가하여 폼 데이터로 전달받을 수 있도록 수정하였습니다.
- 전달받은 `application_name`이 분석 서비스(`data` 딕셔너리)로 올바르게 전달되도록 매핑 로직을 보완했습니다.
- `/analyze` (서버 경로 분석) 엔드포인트는 기존 `AnalysisRequest` 모델이 이미 해당 필드를 지원하고 있어 별도 수정 없이 연동되었습니다.

## 검증 방법

1. 클라이언트와 서버를 재시작합니다.
2. "코드 정적 분석" 메뉴로 이동합니다.
3. "프로젝트 이름" 옆에 "어플리케이션 이름" 입력 필드가 표시되는지 확인합니다.
4. 두 필드에 값을 입력하고 분석을 시작합니다.
5. 분석 완료 후 Neo4j 데이터베이스에서 해당 `Project` 노드의 `application_name` 속성이 입력한 값으로 저장되었는지 확인하거나, 대시보드에서 확인합니다.
