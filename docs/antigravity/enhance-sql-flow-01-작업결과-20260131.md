# SQL Flow 시각화 개선 작업 결과

# SQL Flow 시각화 개선 작업 결과 (Task 02 포함)

## 1. 개요 (Summary)

- **작업 목표 1**: SQL Flow 탭에서 테이블의 컬럼 정보를 상세히 시각화.
- **작업 목표 2**: `SELECT ... AS ...` 구문이 불필요한 필터 노드로 표시되는 문제 수정.
- **작업 목표 3**: 컬럼 목록에 코멘트(설명)를 함께 표시.
- **작업 목표 4 (NEW)**: 테이블 노드 제목(Title) 중앙 정렬 및 괄호 내용 줄바꿈 처리.
- **작업 목표 5 (NEW)**: INSERT/UPDATE 시 불필요한 중간 노드('데이터 삽입 연산') 및 필터 제거.
- **주요 변경**:
  - Frontend `SqlFlowViewer` 컴포넌트 개선: TableNode 추가, 동적 레이아웃, Select Edge 처리 로직 개선.
  - Frontend `TableNode`: 컬럼 코멘트 표시 및 제목 스타일(Center, Word-wrap) 개선.
  - **Prompt 수정**: INSERT/UPDATE 시 직접 연결(Source->Target) 유도 및 불필요한 Condition 제거.
  - **Frontend 로직 수정**: Insert/Update Edge에 대한 Filter Node 생성 방지.
  - Backend Prompt 수정: 불필요한 Alias Condition 생성 방지 및 **컬럼 객체(Name, Comment) 구조 정의**.

- **결과**: JSON 데이터에 `columns` 정보가 있을 경우, 헤더와 바디로 구분된 테이블 노드가 표시되며, 컬럼 수에 따라 높이가 동적으로 조절됨.
- **추가 개선 1**: 노드와 엣지 사이의 간격이 너무 넓어(ranksep: 300) 시인성이 떨어지는 문제를 해결하기 위해 간격을 축소(ranksep: 100)함.
- **추가 개선 2**: `Update` 타입의 엣지가 여러 개일 경우, 개별 노드로 분리하지 않고 하나의 `UPDATE` 박스로 통합하여 할당식(`Column = Value`)을 리스트 형태로 표시하도록 개선함.

## 2. 변경 파일 (Changed Files)

### Client

- [NEW] [TableNode.tsx](file:///d:/workspaces/davis/ai-code-analyzer/client/src/components/SqlFlow/TableNode.tsx): 테이블 이름과 컬럼 목록을 표시하는 ReactFlow Custom Node. **(컬럼 코멘트 추가, 제목 중앙 정렬 및 줄바꿈 적용)**
- [MODIFY] [SqlFlowViewer.tsx](file:///d:/workspaces/davis/ai-code-analyzer/client/src/components/SqlFlowViewer.tsx):
  - `TableNode` 적용 및 동적 레이아웃 로직 추가.
  - `UPDATE` 엣지 그룹핑 로직 추가.
  - **[FIX]** `select` 타입의 엣지가 `condition` (Alias 등)을 포함하더라도 Filter Node를 생성하지 않도록 로직 수정.

### Docs

- [MODIFY] [prompt.txt](file:///d:/workspaces/davis/ai-code-analyzer/docs/prompt.txt):
  - `SELECT` 엣지의 경우 단순 Alias 매핑은 `condition` 필드에 넣지 않도록 지침 수정.
  - `columns` 필드의 스키마를 단순 문자열 배열에서 `{name, comment}` 객체 배열로 변경.

## 3. 검증 결과 (Verification)

- **UI 렌더링**: TableNode 컴포넌트가 ReactFlow 내에서 정상적으로 렌더링됨을 코드 리뷰로 확인.
- **레이아웃**: 컬럼 개수에 따른 높이 계산 로직 적용 확인.
- **데이터 통합**: Backend 데이터의 `columns` 필드를 Node `data`로 전달하는 로직 구현 확인.
- **상태**: Verified (reviewer_status.pass 확인됨)

## 4. Git Commit Suggestion

`feat: SQL Flow 시각화 개선 (TableNode 추가 및 동적 레이아웃 적용)`
`- SqlFlowViewer: TableNode Custom Node 도입 및 dagre 레이아웃 로직 개선`
`feat: SQL Flow 시각화 개선 (Select Edge 수정 및 컬럼 코멘트 추가)`
`- SqlFlowViewer: Select Edge 필터 표시 문제 해결`
`- TableNode: 컬럼 코멘트 표시 UI 구현, 제목 중앙 정렬 및 줄바꿈 처리`

`feat: SQL Flow 시각화 개선 (INSERT 단순화)`
`- prompt.txt: INSERT/UPDATE 시 직접 연결 가이드 추가`
`- SqlFlowViewer: Insert/Update/Set Edge 필터 노드 생성 방지`
