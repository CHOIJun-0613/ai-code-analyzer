# SQL Flow 정규화 스키마 (Normalized Schema)

> **작성일**: 2026-02-01
> **목적**: AI 프롬프트, Server 정규화, Client 렌더링을 위한 일관된 스키마 정의

---

## 1. 문제점 분석

### 현재 상태
- AI가 생성하는 JSON 형식이 SQL 패턴마다 다름
- Client(`SqlFlowViewer.tsx`)가 모든 케이스를 처리하려다 보니 복잡해짐
- 새로운 SQL 패턴마다 Client 코드 수정 필요

### 비일관성 예시

**케이스 A**: 컬럼 레벨 연결 포함
```json
{
  "edges": [
    { "source": "table.COL_A", "target": "result.col_a", "type": "select" }
  ]
}
```

**케이스 B**: 노드 레벨 연결만
```json
{
  "edges": [
    { "source": "table", "target": "result", "type": "filter", "condition": "WHERE..." }
  ]
}
```

---

## 2. 정규화된 스키마

### 2.1 전체 구조

```typescript
interface NormalizedSqlFlow {
  summary: string;           // SQL 요약 설명
  nodes: NormalizedNode[];   // 노드 목록
  edges: NormalizedEdge[];   // 엣지 목록 (노드 레벨만)
}
```

### 2.2 노드 타입

| Type | 설명 | 예시 |
|------|------|------|
| `inputParams` | 입력 파라미터 그룹 | `#{userId}`, `#{status}` |
| `table` | 데이터베이스 테이블 | `USER_TABLE`, `ORDER_TABLE` |
| `subquery` | 서브쿼리 결과셋 | 인라인 뷰, CTE |
| `operation` | SQL 연산 노드 | WHERE, ORDER BY, LIMIT, GROUP BY |
| `result` | 최종 결과 | SELECT 결과셋 |

```typescript
interface NormalizedNode {
  id: string;                // 고유 ID (snake_case)
  type: 'inputParams' | 'table' | 'subquery' | 'operation' | 'result';
  label: string;             // 표시명 (한글/영문)
  columns?: Column[];        // 컬럼 목록 (table, subquery, result만 해당)

  // operation 노드 전용
  operationType?: 'WHERE' | 'ORDER_BY' | 'LIMIT' | 'GROUP_BY' | 'HAVING';
  condition?: string;        // 조건식
}

interface Column {
  name: string;              // 컬럼명
  comment?: string;          // 코멘트 (한글)
}
```

### 2.3 엣지 규칙

**핵심 원칙**: 엣지는 항상 **노드 ID** 간 연결 (컬럼 레벨 연결 X)

| Type | 설명 | Source → Target |
|------|------|-----------------|
| `input_ref` | 입력 파라미터 참조 | `inputParams` → `operation(WHERE)` |
| `data_flow` | 데이터 흐름 | 모든 노드 간 데이터 이동 |

```typescript
interface NormalizedEdge {
  source: string;            // 소스 노드 ID (컬럼 X)
  target: string;            // 타겟 노드 ID (컬럼 X)
  type: 'input_ref' | 'data_flow';
  label?: string;            // 엣지 라벨 (선택)
}
```

---

## 3. SQL 패턴별 변환 규칙

### 3.1 단순 SELECT

**SQL:**
```sql
SELECT * FROM USER WHERE user_id = #{userId}
```

**정규화 JSON:**
```json
{
  "summary": "USER 테이블에서 특정 사용자 조회",
  "nodes": [
    {
      "id": "input_params",
      "type": "inputParams",
      "label": "Input Parameters",
      "columns": [{ "name": "#{userId}", "comment": "사용자 ID" }]
    },
    {
      "id": "user_table",
      "type": "table",
      "label": "USER",
      "columns": [
        { "name": "user_id", "comment": "사용자 ID" },
        { "name": "user_name", "comment": "사용자명" }
      ]
    },
    {
      "id": "where_op",
      "type": "operation",
      "label": "WHERE",
      "operationType": "WHERE",
      "condition": "user_id = #{userId}"
    },
    {
      "id": "result",
      "type": "result",
      "label": "Result",
      "columns": [
        { "name": "user_id", "comment": "사용자 ID" },
        { "name": "user_name", "comment": "사용자명" }
      ]
    }
  ],
  "edges": [
    { "source": "input_params", "target": "where_op", "type": "input_ref" },
    { "source": "user_table", "target": "where_op", "type": "data_flow" },
    { "source": "where_op", "target": "result", "type": "data_flow", "label": "result" }
  ]
}
```

### 3.2 서브쿼리 + ORDER BY + LIMIT

**SQL:**
```sql
SELECT * FROM (
  SELECT * FROM USER WHERE status = #{status}
  ORDER BY created_at DESC
) WHERE ROWNUM <= 1
```

**정규화 JSON:**
```json
{
  "summary": "조건에 맞는 최신 사용자 1건 조회",
  "nodes": [
    {
      "id": "input_params",
      "type": "inputParams",
      "label": "Input Parameters",
      "columns": [{ "name": "#{status}", "comment": "상태" }]
    },
    {
      "id": "user_table",
      "type": "table",
      "label": "USER",
      "columns": [...]
    },
    {
      "id": "where_op",
      "type": "operation",
      "label": "WHERE",
      "operationType": "WHERE",
      "condition": "status = #{status}"
    },
    {
      "id": "order_op",
      "type": "operation",
      "label": "ORDER BY",
      "operationType": "ORDER_BY",
      "condition": "created_at DESC"
    },
    {
      "id": "subquery_result",
      "type": "subquery",
      "label": "서브쿼리 결과",
      "columns": [...]
    },
    {
      "id": "limit_op",
      "type": "operation",
      "label": "LIMIT",
      "operationType": "LIMIT",
      "condition": "ROWNUM <= 1"
    },
    {
      "id": "result",
      "type": "result",
      "label": "Result (Top 1)",
      "columns": [...]
    }
  ],
  "edges": [
    { "source": "input_params", "target": "where_op", "type": "input_ref" },
    { "source": "user_table", "target": "where_op", "type": "data_flow" },
    { "source": "where_op", "target": "order_op", "type": "data_flow" },
    { "source": "order_op", "target": "subquery_result", "type": "data_flow" },
    { "source": "subquery_result", "target": "limit_op", "type": "data_flow" },
    { "source": "limit_op", "target": "result", "type": "data_flow", "label": "result" }
  ]
}
```

### 3.3 JOIN

**SQL:**
```sql
SELECT a.*, b.name
FROM TABLE_A a
INNER JOIN TABLE_B b ON a.id = b.ref_id
WHERE a.status = #{status}
```

**정규화 JSON:**
```json
{
  "summary": "TABLE_A와 TABLE_B 조인 후 조건 필터링",
  "nodes": [
    { "id": "input_params", "type": "inputParams", "label": "Input Parameters", ... },
    { "id": "table_a", "type": "table", "label": "TABLE_A", ... },
    { "id": "table_b", "type": "table", "label": "TABLE_B", ... },
    {
      "id": "join_op",
      "type": "operation",
      "label": "INNER JOIN",
      "operationType": "JOIN",
      "condition": "a.id = b.ref_id"
    },
    {
      "id": "where_op",
      "type": "operation",
      "label": "WHERE",
      "operationType": "WHERE",
      "condition": "a.status = #{status}"
    },
    { "id": "result", "type": "result", "label": "Result", ... }
  ],
  "edges": [
    { "source": "table_a", "target": "join_op", "type": "data_flow" },
    { "source": "table_b", "target": "join_op", "type": "data_flow" },
    { "source": "input_params", "target": "where_op", "type": "input_ref" },
    { "source": "join_op", "target": "where_op", "type": "data_flow" },
    { "source": "where_op", "target": "result", "type": "data_flow", "label": "result" }
  ]
}
```

### 3.4 UPDATE/INSERT

**SQL:**
```sql
UPDATE USER SET name = #{name} WHERE id = #{id}
```

**정규화 JSON:**
```json
{
  "summary": "USER 테이블 특정 레코드 수정",
  "nodes": [
    { "id": "input_params", "type": "inputParams", "label": "Input Parameters", ... },
    { "id": "user_table", "type": "table", "label": "USER (Target)", ... },
    {
      "id": "where_op",
      "type": "operation",
      "label": "WHERE",
      "operationType": "WHERE",
      "condition": "id = #{id}"
    },
    {
      "id": "set_op",
      "type": "operation",
      "label": "SET",
      "operationType": "UPDATE_SET",
      "condition": "name = #{name}"
    }
  ],
  "edges": [
    { "source": "input_params", "target": "where_op", "type": "input_ref" },
    { "source": "input_params", "target": "set_op", "type": "input_ref" },
    { "source": "where_op", "target": "user_table", "type": "data_flow", "label": "filter" },
    { "source": "set_op", "target": "user_table", "type": "data_flow", "label": "update" }
  ]
}
```

---

## 4. 시각화 규칙

### 4.1 노드 색상

| 노드 타입 | Light Mode | Dark Mode |
|----------|------------|-----------|
| `inputParams` | 파란색 (`bg-blue-50`) | `bg-slate-800 border-blue-700` |
| `table` | 흰색 (기본) | `bg-slate-800` |
| `subquery` | 흰색 (기본) | `bg-slate-800` |
| `operation` | 오렌지색 (`bg-orange-50`) | `bg-orange-900/30` |
| `result` | 초록색 (`bg-emerald-50`) | `bg-slate-800 border-emerald-700` |

### 4.2 레이아웃

- **방향**: Left → Right (LR)
- **흐름**: `inputParams` / `table` → `operation` → `subquery` / `result`
- **컬럼 표시**: `table`, `subquery`, `result` 노드에만 컬럼 목록 표시

### 4.3 엣지 스타일

| 타입 | 스타일 |
|------|--------|
| `input_ref` | 점선, 파란색 |
| `data_flow` | 실선, 회색 |

---

## 5. 구현 전략

### 5.1 AI Prompt 개선
- 위 스키마를 명확하게 프롬프트에 포함
- 컬럼 레벨 연결 금지 규칙 명시
- 패턴별 예시 제공

### 5.2 Server 정규화 레이어
- AI 결과를 검증하고 정규화하는 함수 추가
- 비정규화된 엣지 → 정규화된 엣지 변환
- 컬럼 레벨 연결 → 노드 레벨 연결 변환

### 5.3 Client 단순화
- 정규화된 데이터만 처리
- 복잡한 케이스 처리 로직 제거
- 노드 타입별 렌더링만 담당

---

## 6. 변환 규칙 (Server)

### 6.1 비정규화 → 정규화 변환

```python
def normalize_sql_flow(raw_json: dict) -> dict:
    """AI 결과를 정규화된 형식으로 변환"""

    normalized = {
        "summary": raw_json.get("summary", ""),
        "nodes": [],
        "edges": []
    }

    # 1. 노드 정규화
    for node in raw_json.get("nodes", []):
        normalized_node = normalize_node(node)
        normalized["nodes"].append(normalized_node)

    # 2. 엣지 정규화 (컬럼 레벨 → 노드 레벨)
    for edge in raw_json.get("edges", []):
        normalized_edge = normalize_edge(edge, normalized["nodes"])
        if normalized_edge:  # 컬럼 매핑 엣지는 제외
            normalized["edges"].append(normalized_edge)

    # 3. Operation 노드 생성 (WHERE, ORDER BY 등)
    normalized = extract_operation_nodes(normalized)

    return normalized
```

### 6.2 컬럼 레벨 엣지 처리

```python
def normalize_edge(edge: dict, nodes: list) -> dict | None:
    source = edge.get("source", "")
    target = edge.get("target", "")
    edge_type = edge.get("type", "").lower()

    # 컬럼 레벨 연결 감지 (table.column 형식)
    if "." in source:
        source = source.split(".")[0]  # 노드 ID만 추출
    if "." in target:
        target = target.split(".")[0]

    # select 타입 + condition 없음 = 단순 컬럼 매핑 → 제외
    if edge_type == "select" and not edge.get("condition"):
        return None

    # 엣지 타입 정규화
    normalized_type = "data_flow"
    if edge_type in ("reference", "filter_condition"):
        normalized_type = "input_ref"

    return {
        "source": source,
        "target": target,
        "type": normalized_type,
        "label": edge.get("label")
    }
```

---

## 7. 마이그레이션 계획

1. **Phase 1**: 정규화 스키마 정의 (이 문서) ✅
2. **Phase 2**: AI Prompt 개선
3. **Phase 3**: Server 정규화 레이어 추가
4. **Phase 4**: Client 단순화
5. **Phase 5**: 테스트 및 검증
