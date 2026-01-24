# 작업계획: SQL Flow AI 분석

## 1. 개요

- **작업 제목**: SQL Flow AI 분석 개선 및 시각화
- **작업 일련번호**: 01
- **작성일**: 2026-01-24
- **작성자**: Antigravity

## 2. 작업 목표

1. **AI 분석 개선**: SQL 분석 시 단순 텍스트가 아닌, 구조화된 JSON 데이터(Node/Edge)를 포함하도록 프롬프트를 개선합니다.
2. **데이터 저장**: 개선된 분석 결과를 `SqlStatement.ai_description` 필드에 저장합니다.
3. **시각화 구현**: 프론트엔드에서 분석된 JSON 데이터를 파싱하여 `React Flow`를 이용해 SQL Lineage(데이터 흐름)를 시각화합니다.

## 3. 작업 범위 (Scope: BOTH)

### Backend (Server)

- **파일**: `server/csa/aiwork/default_prompts.py`
- **내용**:
  - `sql_batch_doc` 프롬프트 수정.
  - 출력 포맷에 `[SQL Flow JSON]` 섹션 추가.
  - JSON 스키마 명시 (Nodes, Edges).

### Frontend (Client)

- **라이브러리 추가**: `reactflow` (또는 `@xyflow/react`), `dagre` (Layout 용).
- **파일**: `client/src/pages/SqlDetails.tsx` (또는 신규 컴포넌트 `client/src/components/SqlFlowViewer.tsx`)
- **내용**:
  - `ai_description` 필드 파싱 로직 구현.
  - JSON 데이터가 존재할 경우 `React Flow`로 그래프 렌더링.
  - `dagre`를 이용한 자동 레이아웃(Auto Layout) 적용.
  - 기존 텍스트 분석 결과도 함께 표시 (Markdown Viewer).

## 4. 상세 구현 계획

### 4.1. Server Side

- `default_prompts.py`의 `sql_batch_doc` 템플릿을 사용자 요청 프롬프트로 교체합니다.
- 스키마 예시:

```json
{
  "summary": "1줄 요약",
  "nodes": [{ "id": "...", "label": "...", "type": "table|target" }],
  "edges": [{ "source": "...", "target": "...", "type": "select|join" }]
}
```

### 4.2. Client Side

- **패키지 설치**:
  - `npm install reactflow dagre`
  - `npm install --save-dev @types/dagre`
- **컴포넌트 구현**:
  - `SqlDetails` 컴포넌트 내 `Tab` 또는 섹션 추가.
  - `SQL Flow` 탭에서 시각화 제공.
  - JSON 파싱 실패 시 원본 Markdown 텍스트 표시.

## 5. 검증 계획 (Verification Plan)

### 5.1. Automated / Manual Verification

- **Backend Test**:
  - `debug_service.py` 또는 `verify_analysis_log.py`를 사용하여 SQL 파일 1개를 대상으로 분석 실행 (`analyze_project` 또는 `analyze_single_class`).
  - 로그 파일(`logs/analysis-*.log`)에서 AI 응답이 JSON 포맷을 포함하는지 확인.
- **Frontend Test**:
  - 웹 애플리케이션 실행 (`npm run dev`).
  - SQL 상세 화면 진입.
  - `ai_description`이 JSON을 포함하고 있을 때, 그래프가 정상적으로 렌더링되는지 확인.
  - 노드 드래그, 줌/팬 동작 확인.

## 6. 특이사항

- 기존에 분석된 데이터는 포맷이 다르므로(텍스트), 파싱 로직에서 JSON 포맷인지 감지하여 분기 처리해야 함 (Backward Compatibility).
- `dagre` 레이아웃 계산 시 노드 크기를 적절히 계산해야 함.
