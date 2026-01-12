# 작업 결과 보고서: 어플리케이션 노드 및 Charset 추가

## 1. 개요 (Overview)

- **Task Title**: add-application-node-and-charset
- **Task Number**: 01
- **작업 일자**: 2026-01-12
- **작업 범위**: Server & Client

## 2. 작업 내용 요약

AI 코드 분석기의 데이터 모델을 확장하여 'Application' 개념을 도입하고, 프로젝트 분석 시 소스 파일의 인코딩(Charset)을 지원하도록 개선하였습니다.

### 주요 변경 사항

1. **Neo4j 데이터 모델 확장**:
    - `Application` 노드 추가 및 `Project`와 `HAS_PROJECT` 관계(1:N) 정의.
    - `Project` 노드에 `charset` 속성 추가 (기본값: 'UTF-8').
2. **서버 API 개선**:
    - `GET /api/v1/applications`: 기존 등록된 어플리케이션 목록 조회 API 신설.
    - 분석 시작 API (`/analyze`, `/analyze/upload`)에 `application_name` 및 `charset` 파라미터 처리 로직 추가.
3. **파일 분석 로직 개선**:
    - 사용자가 지정한 Charset으로 소스 파일을 읽어 UTF-8로 변환하여 처리.
    - EUC-KR, MS949 등 다양한 인코딩 지원.
4. **클라이언트 UI 개선**:
    - 분석 화면(Analysis.tsx) 입력 필드 재구성: 어플리케이션 명 -> 프로젝트 명 -> 문자셋.
    - 어플리케이션 명 입력에 `DataList`를 적용하여 기존 목록 선택 및 신규 입력 지원.
    - 문자셋 선택 콤보박스 추가 (UTF-8, EUC-KR, MS949, ISO-8859-1).
    - 다국어(i18n) 처리 완료 (한국어, 영어).

## 3. 변경된 파일 목록

### Server

- `server/csa/services/graph_db/application_nodes.py`: [NEW] Application 노드 관리 로직 구현 (ApplicationMixin).
- `server/app/api/v1/endpoints/applications.py`: [NEW] Application 조회 API 구현.
- `server/app/api/v1/api.py`: Applications 라우터 등록.
- `server/csa/models/entities/project.py`: Project 모델에 `charset` 필드 추가.
- `server/app/api/v1/endpoints/analysis.py`: 분석 요청 모델(AnalysisRequest)에 파라미터 추가.
- `server/csa/services/analysis/handlers.py`: 분석 핸들러에서 Charset 처리 로직 추가.
- `server/csa/services/java_analysis/project.py`: 파일 파싱 시 인코딩 적용.
- `server/csa/services/graph_db/project_nodes.py`: Project 생성 시 Charset 속성 저장 및 Application 관계 생성.

### Client

- `client/src/pages/Analysis.tsx`: UI 레이아웃 변경, DataList 적용, API 호출 연동.
- `client/src/schemas/analysisSchema.ts`: Charset 필드 검증 추가.
- `client/src/locales/ko/translation.json`: UI 다국어 메시지 추가.
- `client/src/locales/en/translation.json`: UI 다국어 메시지 추가.

## 4. 검증 결과

- **서버**: `verify_changes.py` 스크립트를 통해 주요 모듈(Entity, API, Service)의 의존성 및 로직 정상 로드 확인.
- **클라이언트**: UI 컴포넌트 렌더링 로직(조건부 렌더링, 반복문) 및 API Payload 구성 로직 검증 완료.
- **통합**: 클라이언트에서 전송하는 필드(`application_name`, `charset`)가 서버 API 명세와 일치함을 확인.

## 5. Git Commit 메시지 제안

```text
feat(analysis): Application 노드 및 프로젝트 Charset 지원 추가

- GraphDB에 Application 노드 관리를 위한 ApplicationMixin 추가
- Project 엔티티 및 분석 API에 'charset' 필드 추가 (기본값: UTF-8)
- Java 분석 시 지정된 charset으로 파일을 읽는 로직 구현
- 기존 Application 목록을 조회하는 /api/v1/applications 엔드포인트 추가
- Analysis UI 업데이트: Application 이름 입력(datalist) 및 Charset 선택 지원
- 분석 폼 필드 순서 재배치: Application -> Project -> Charset
- 신규 UI 요소에 다국어(i18n) 적용
```
