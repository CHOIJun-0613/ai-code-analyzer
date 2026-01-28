# SQL Flow 시각화 개선 작업 계획

## 1. 개요 (Goal Description)

- **목표**: SQL 분석 결과를 시각화하는 'SQL Flow' 탭에서 테이블의 컬럼 정보를 포함하여 상세하게 표시하도록 UI를 개선합니다.
- **배경**: 현재는 테이블 이름만 단순 노드로 표시되고 있어, 구체적인 데이터 흐름을 파악하기 어렵습니다.
- **범위**: Client Side (Frontend) `SqlFlowViewer` 컴포넌트 및 관련 로직. (Backend는 제외)

## 2. 사용자 리뷰 필요 사항 (User Review Required)
>
> [!NOTE]
> Backend 수정 없이 Frontend만 수정하므로, Server에서 전달하는 JSON 데이터에 `columns` 배열이 포함되어 있어야 실제 컬럼 목록이 표시됩니다. 현재 작업은 Frontend 렌더링 로직 개선에 집중합니다.

## 3. 변경 제안 (Proposed Changes)

### Client

#### [NEW] [TableNode.tsx](file:///d:/workspaces/davis/ai-code-analyzer/client/src/components/SqlFlow/TableNode.tsx)

- **설명**: ReactFlow의 Custom Node 컴포넌트입니다.
- **기능**:
  - 테이블 헤더 (이름) 표시
  - 컬럼 목록 (이름, 타입 등) 표시
  - Tailwind CSS를 이용한 스타일링 (Header 구분, Shadow 처리)

#### [MODIFY] [SqlFlowViewer.tsx](file:///d:/workspaces/davis/ai-code-analyzer/client/src/components/SqlFlowViewer.tsx)

- **설명**: 메인 그래프 뷰어 컴포넌트입니다.
- **변경 내용**:
  - `nodeTypes` prop에 `TableNode` 등록.
  - `dagre` 레이아웃 계산 함수(`getLayoutedElements`) 수정:
    - 고정 높이(`nodeHeight`) 대신, 컬럼 개수에 비례하는 동적 높이 계산 로직 적용.
  - 데이터 매핑 로직 수정:
    - Backend 데이터에서 `columns` 정보를 추출하여 Node data로 전달.

## 4. 검증 계획 (Verification Plan)

### 자동화 테스트 (Automated Tests)

- 해당 사항 없음 (UI 렌더링 변경 건)

### 수동 검증 (Manual Verification)

1. 클라이언트 애플리케이션 실행 (`npm run dev`)
2. 웹 브라우저 접속
3. 'SQL 분석' 결과 상세 화면 진입
4. 'SQL Flow' 탭 클릭
5. 각 테이블 노드가 헤더와 바디(컬럼 목록)로 구분되어 표시되는지 확인
6. 컬럼이 많은 테이블의 노드 높이가 적절하게 늘어나 겹치지 않고 레이아웃이 잡히는지 확인
