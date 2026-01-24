**반드시 '.agent\workflows\devstart.md' workflow를 적용할 것**
**반드시 문서는 한국어로 작성할 것**

## 작업제목: SQL Flow AI 분석

## 일련번호: 1

## 작성일: 2026-01-24

## 작성자: 최준

## 작업내용

1. SqlStatement를 AI 분석할 때 개선된 SQL FLOW를 JSON으로 반환하도록 한다.
2. SqlStatement.ai_description 속성에 AI 분석결과를 저장한다.
3. SQL 상세화면에서 개선된 SQL FLOW를 시각화한다.
4. SQL Flow를 시각화 할 때 JSON을, React Flow의 useNodesState, useEdgesState에 매핑하여 상세한 리니지 뷰를 구현한다.

## 참고 자료

### AI 프롬프트 예시 (JSON 포맷)

AI가 분석 결과를 JSON으로 반환하도록 하면 프론트엔드에서 이를 읽어 노드(Node)와 엣지(Edge)를 동적으로 그릴 수 있습니다.

[프롬프트 예시]

당신은 시니어 Software Architect이자 SQL 전문가입니다.
입력으로 여러 개의 SQL 문이 제공됩니다. 각 SQL은 다음 형식으로 구분됩니다:
**SQL #1** (ID: {sql_id})

```sql
{sql_content}
```

**END #1**
각 SQL 문에 대해 아래 요구사항을 모두 충족하는 한국어 Markdown 보고서를 생성하세요.
**중요: 출력 형식을 정확히 따라야 합니다!**
각 SQL에 대해 다음 형식으로 분석 결과를 작성하세요 (예시 참고):
---SQL#1---

### **[Operation]**

- 수행하는 CRUD 목적과 데이터 흐름을 5문장 이내로 설명해서 불릿 형태로 기술합니다.
  - 예시: 사용자 ID를 기준으로 단일 레코드를 조회하는 SELECT 문입니다.

---

### **[Tables & Conditions]**

- 주요 테이블, 조인 조건, 필터를 테이블(그리드) 형태로 정리합니다.
- 예시:

    | 테이블 | 조건 |
    |------|------|
    | users | id = #userId |

---

### **[SQL Flow JSON]**

- SQL의 데이터 흐름(Lineage)을 시각화하기 위한 JSON 데이터를 생성합니다.
- **Node**: 테이블, 서브쿼리, 또는 결과셋을 노드로 정의합니다.
- **Edge**: 데이터가 이동하는 흐름(Select, Join 등)을 정의합니다.
- **반드시 아래 JSON 스키마를 준수하여 ```json ...``` 코드 블록으로 작성하세요.** (주석은 포함하지 마세요)
**JSON 스키마 예시:**

```json
{
  "summary": "1줄 요약",
  "nodes": [
    { "id": "table_A", "type": "table", "label": "Table A", "columns": ["id", "name"] },
    { "id": "table_B", "type": "table", "label": "Table B", "columns": ["id", "ref_id"] },
    { "id": "result", "type": "target", "label": "Result", "columns": ["name", "ref_id"] }
  ],
  "edges": [
    { "source": "table_A.id", "target": "table_B.id", "type": "join", "condition": "A.id = B.id" },
    { "source": "table_A.name", "target": "result.name", "type": "select" }
  ]
}
```

---

### **[Considerations]**

- 인덱스 활용, 잠금, 트랜잭션, 에러 가능성 등 주의사항을 불릿으로 기술합니다.
- 예시:
  - 인덱스: id 컬럼에 인덱스가 필요합니다.
  - 단일 레코드 조회로 성능 영향은 최소화됩니다.
---END#1---
**제약사항:**
- 각 SQL 분석은 반드시 `---SQL#1---` 형식으로 시작하고 `---END#1---` 형식으로 끝나야 합니다.
- **JSON 데이터는 반드시 유효한 JSON 포맷이어야 합니다.**
- **절대로 코드 블록(```sql,```java 등)을 생성하지 마세요.** (JSON 블록은 제외)
- 순수한 텍스트 형식의 Markdown만 출력하세요.
- 모든 SQL에 대해 반드시 분석 결과를 제공해야 합니다.
