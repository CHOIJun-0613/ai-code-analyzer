# SQL Flow 컬럼 레벨 시각화 검토 의견

## 1. 현황 분석 (Current Status)

### 1) Frontend (`SqlFlowViewer.tsx`)

- 현재 **ReactFlow** 라이브러리를 사용하여 그래프를 렌더링하고 있습니다.
- 노드 렌더링 방식이 단순한 텍스트 라벨(Table Name)만 표시하도록 구현되어 있습니다.
- 상위 컴포넌트(`SqlDetails.tsx`)에서 JSON 데이터를 파싱하여 넘겨주지만, `SqlFlowViewer` 내부에서 **컬럼(`columns`) 정보가 있어도 이를 무시**하고 있습니다.

### 2) Backend & Data (`ai_analyzer.py`, `default_prompts.py`)

- **불일치 존재**:
  - **단건 분석(`sql_doc` 프롬프트)**: 현재 **Mermaid** 다이어그램을 생성하도록 설정되어 있습니다. 이 경우 `SqlDetails` 화면의 'Overview' 탭에는 다이어그램이 나오지만, 'SQL Flow' 탭은 JSON 데이터가 없어 비활성화됩니다.
  - **배치 분석(`sql_batch_doc` 프롬프트)**: **JSON** 포맷을 생성하며, 이미 스키마에 `columns` 배열을 포함하도록 요청하고 있습니다.

## 2. 구현 방향 제안 (Proposal)

첨부해주신 이미지와 같이 테이블 내 컬럼까지 표현하기 위해 다음과 같은 수정을 제안합니다.

### 1) Frontend 수정 (필수)

- **Custom Node 컴포넌트 개발**:
  - ReactFlow의 `Custom Node` 기능을 사용하여, **테이블 헤더(이름)**와 **컬럼 리스트(Body)**를 포함하는 새로운 노드 컴포넌트(`TableNode`)를 구현해야 합니다.
  - 디자인은 Tailwind CSS를 활용하여 첨부 이미지와 유사하게(헤더 색상 구분, 그림자 효과 등) 스타일링 가능합니다.
- **데이터 매핑 로직 개선**:
  - `SqlFlowViewer`가 전달받은 데이터에서 `columns` 정보를 Custom Node의 `data` 프로퍼티로 올바르게 전달하도록 수정해야 합니다.
- **레이아웃 계산 (`dagre`) 수정**:
  - 현재는 고정된 노드 크기(`nodeWidth`, `nodeHeight`)를 기준으로 레이아웃을 계산합니다.
  - 컬럼 개수에 따라 노드 높이가 가변적으로 변하므로, 이를 레이아웃 엔진에 반영하는 로직 추가가 필요합니다.

### 2) Backend 수정 (권장)

- **프롬프트 통일**:
  - 단건 분석(`sql_doc`) 시에도 **JSON 포맷**을 반환하도록 프롬프트를 수정해야 합니다.
  - 이를 통해 단건 분석 후에도 'SQL Flow' 탭에서 인터랙티브한 컬럼 단위 그래프를 확인할 수 있게 됩니다.
- **컬럼 정보 강화**:
  - AI가 SQL 분석 시 테이블의 컬럼 정보를 최대한 상세히 JSON에 포함하도록 프롬프트를 미세 조정할 필요가 있습니다.

## 3. 결론

- **가능 여부**: **가능함**. 현재 사용 중인 ReactFlow 라이브러리는 해당 기능을 완벽하게 지원합니다.
- **작업 범위**:
  1. Frontend: `SqlFlowViewer` 컴포넌트 대폭 수정 (Custom Node, Layout)
  2. Backend: `default_prompts.py` 내 `sql_doc` 프롬프트 수정
- **소요 예상**: Frontend Customization에 주된 공수가 들어갈 것으로 예상됩니다.

위 내용을 바탕으로 진행 승인을 주시면, **소스 코드 수정 단계(Implementation Phase)**로 넘어갈 수 있습니다.
