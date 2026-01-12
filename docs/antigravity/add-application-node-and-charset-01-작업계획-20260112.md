# [작업계획] Application 노드 및 Project 캐릭터셋 속성 추가

## 개요

Neo4j 데이터베이스에 `Application` 노드를 추가하여 `Project`와의 계층 구조(`Application` -[HAS_PROJECT]-> `Project`)를 정립하고, `Project` 노드에 `charset` 속성을 추가하여 소스 코드 분석 시 지정된 인코딩을 사용하도록 개선한다. 또한, 이를 지원하기 위한 API 및 UI를 수정한다.

## User Review Required

- **Breaking Change**: 기존 프로젝트 데이터에는 `charset` 속성이 없으므로, 기본값 'UTF-8'로 간주하거나 마이그레이션이 필요할 수 있음. 코드에서는 기본값을 'UTF-8'로 처리할 예정.
- **Application Node**: 기존 프로젝트들은 `application_name` 속성은 가지고 있으나 `Application` 노드와 연결되어 있지 않음. 재분석 시 또는 별도 마이그레이션을 통해 노드를 생성하고 연결할 예정. 여기서는 "분석 시" 생성/연결하는 방식을 채택함.

## Proposed Changes

### Backend (Server)

#### [MODIFY] [project.py](file:///d:/workspaces/davis/ai-code-analyzer/server/csa/models/entities/project.py)

- `Project` Pydantic 모델에 `charset: str = "UTF-8"` 필드 추가.

#### [MODIFY] [analysis.py](file:///d:/workspaces/davis/ai-code-analyzer/server/app/api/v1/endpoints/analysis.py)

- `AnalysisRequest` 모델에 `charset` 필드 추가.
- `upload_and_analyze` 함수에 `charset` Form 파라미터 추가.
- `ai_options` 또는 `source_options` 딕셔너리에 `charset` 정보를 담아 서비스 레이어로 전달.

#### [MODIFY] [handlers.py](file:///d:/workspaces/davis/ai-code-analyzer/server/csa/services/analysis/handlers.py)

- `analyze_project` 함수에서 `source_options['charset']`을 읽어 `Project` 엔티티 생성 시 설정.
- `db.add_project` 호출 전/후에 `Application` 노드 처리 로직 확인 (GraphDB 서비스 수정 필요).

#### [MODIFY] [graph_db](file:///d:/workspaces/davis/ai-code-analyzer/server/csa/services/graph_db) (Folder)

- `GraphDB` 클래스 (또는 관련 서비스 파일)에 `add_application` 및 `Application` 노드 관련 메서드 추가.
- `add_project` 메서드 수정: `Application` 노드가 있으면 생성(MERGE)하고 관계 연결.

#### [MODIFY] [project.py](file:///d:/workspaces/davis/ai-code-analyzer/server/csa/services/java_analysis/project.py)

- `parse_single_java_file`, `estimate_file_complexity` 등 파일 읽는 함수에 `encoding=charset` 적용.
- `parse_java_project_streaming` 등 상위 함수에서 `charset` 인자 전달 받도록 수정.

#### [NEW] [applications.py](file:///d:/workspaces/davis/ai-code-analyzer/server/app/api/v1/endpoints/applications.py)

- `GET /applications`: 등록된 모든 Application 목록 반환 API 구현.

#### [MODIFY] [api.py](file:///d:/workspaces/davis/ai-code-analyzer/server/app/api/v1/api.py)

- `applications` 라우터 등록.

### Frontend (Client)

#### [MODIFY] [Home.tsx](file:///d:/workspaces/davis/ai-code-analyzer/client/src/pages/Home.tsx) (추정)

- 분석 실행 화면(또는 모달)에 'Application Name' 콤보박스 및 'Charset' 셀렉트 박스 추가.
- Application Name:
  - 서버에서 목록 가져오기 (`GET /api/v1/applications`)
  - 기존 목록에서 선택하거나 직접 입력 가능 (CreatableSelect 등 사용)
- Charset:
  - 옵션: 'UTF-8', 'EUC-KR', 'MS949' 등.
- API 호출 시 해당 값 포함하여 전송.

## Verification Plan

### Automated Tests

- 없음 (현재 단위 테스트 환경 구성 확인 필요).

### Manual Verification

1. **Application 목록 확인**:
    - 브라우저에서 `/api/v1/applications` 호출하여 빈 목록(최초) 또는 기존 목록 확인.
2. **분석 실행**:
    - UI에서 Application Name 입력 ("NewApp"), Project Name 입력 ("NewProj"), Charset 선택 ("UTF-8").
    - 분석 실행.
3. **데이터 검증**:
    - Neo4j Browser 접속.
    - `MATCH (a:Application {name: "NewApp"})-[:HAS_PROJECT]->(p:Project {name: "NewProj"}) RETURN a, p` 쿼리 실행하여 노드 및 관계 생성 확인.
    - `MATCH (p:Project {name: "NewProj"}) RETURN p.charset` 실행하여 속성 값 확인.
