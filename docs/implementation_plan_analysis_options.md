# 분석 옵션 개선

## 목표 설명

분석 시작 화면에 "분석 대상"과 "분석 결과 저장"을 위한 새로운 옵션을 추가하여 기능을 개선합니다. 이 옵션들은 사용자가 설정할 수 있어야 하며, 선택한 설정은 Neo4j의 User 노드 내 `preferences` 속성에 저장되어야 합니다.

## 사용자 리뷰 필요 사항

주요 변경 사항 중 기존 기능을 저해하는 요소는 없습니다. Neo4j `User` 노드의 `preferences` 속성은 JSON 문자열 형태이므로, 새로운 키를 추가하더라도 하위 호환성이 유지됩니다.

## 변경 제안

### 프론트엔드 (`client/src/pages/Analysis.tsx`)

#### [수정] [Analysis.tsx](file:///d:/workspaces/davis/ai-code-analyzer/client/src/pages/Analysis.tsx)

1. **상태 관리 (State Management)**: 새로운 옵션을 위한 상태 변수를 추가합니다:
    * `analysisTarget`: 'program', 'db', 'all' (기본값: 'all')
    * `saveStrategy`: 'delete', 'update' (기본값: 'delete')
2. **UI 구현**: "소스 코드 분석 옵션(Source Code Analysis Configuration)" 섹션에 라디오 버튼 그룹을 추가합니다.
    * **분석 대상**:
        * 프로그램만 분석 (`java_object=true`, `db_object=false`)
        * Data base만 분석 (`java_object=false`, `db_object=true`)
        * 전체 분석 (`all_objects=true`)
    * **분석 결과 저장**:
        * 삭제 후 저장 (`clean=true`, `update=false`)
        * 업데이트 저장 (`clean=false`, `update=true`)
3. **환경설정 로드/저장**: `loadPreferences` 및 `executeAnalysis` 함수를 업데이트하여 새로운 키(`analysis_target`, `save_strategy`)를 처리하도록 합니다.
4. **페이로드 생성**: `executeAnalysis`에서 API 호출 시, 상태 변수를 적절한 파라미터로 매핑합니다.
    * `analysisTarget` == 'program' 인 경우: `java_object=true`, `db_object=false`
    * `analysisTarget` == 'db' 인 경우: `java_object=false`, `db_object=true`
    * `analysisTarget` == 'all' 인 경우: `all_objects=true`
    * `saveStrategy` == 'delete' 인 경우: `clean=true`, `update=false`
    * `saveStrategy` == 'update' 인 경우: `clean=false`, `update=true`

### 백엔드 (`server`)

* **백엔드 로직 변경 불필요**: 백엔드의 `preferences`는 JSON 문자열을 그대로 저장하고 반환합니다. `analyze` 엔드포인트는 이미 `clean`, `update`, `java_object`, `db_object` 플래그를 지원하므로, 프론트엔드에서 적절한 조합을 전송하기만 하면 됩니다.

## 검증 계획

### 수동 검증

1. 분석 페이지를 엽니다.
2. 새로운 라디오 버튼들이 정상적으로 표시되는지 확인합니다.
3. 기본값이 아닌 옵션(예: "Data base만 분석", "업데이트 저장")을 선택합니다.
4. "설정 저장(Save Settings)"을 클릭하거나 분석을 실행합니다.
5. 페이지를 새로고침하여 설정이 유지되는지 확인합니다.
6. 분석을 실행하고, 서버로 전송되는 페이로드(Network 탭 또는 로그 확인)에 올바른 플래그가 포함되어 있는지 확인합니다.
    * `clean`, `update`, `java_object`, `db_object`, `all_objects` 파라미터 확인.
