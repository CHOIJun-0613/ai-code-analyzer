# SQL Flow 정적 분석 가능성 검토

**작성일**: 2026-02-01
**목적**: 코드 정적 분석을 통해 SQL Flow JSON을 생성할 수 있는지 검토

---

## 1. 현황 분석

### 1.1 현재 SQL Flow 생성 방식

```
SQL 문 → AI 프롬프트 (sql_doc) → LLM → SQL Flow JSON + Markdown 보고서
```

- AI가 SQL을 이해하고 데이터 흐름을 분석
- 노드/엣지 구조와 함께 한국어 설명(comment) 생성
- 요약(summary) 자동 생성

### 1.2 기존 SQL 파서 현황

**파일**: `server/csa/parsers/sql/parser.py`

**SQLAnalysisResult 데이터 구조:**
```python
@dataclass
class SQLAnalysisResult:
    sql_type: str                           # SELECT, INSERT, UPDATE, DELETE
    tables: List[Dict[str, str]]            # [{name, alias, schema}]
    columns: List[Dict[str, str]]           # [{name, table}]
    joins: List[Dict[str, str]]             # [{type, table, alias, condition}]
    where_conditions: List[str]             # WHERE 조건 목록
    order_by_columns: List[str]             # ORDER BY 컬럼
    group_by_columns: List[str]             # GROUP BY 컬럼
    having_conditions: List[str]            # HAVING 조건
    subqueries: List[str]                   # 서브쿼리 문자열
    parameters: List[Dict[str, str]]        # [{type, name}] - mybatis, named, positional
    complexity_score: int                   # 복잡도 점수
```

---

## 2. SQL Flow JSON 스키마 분석

### 2.1 노드 구조

| 노드 타입 | 필수 필드 | 정적 분석 가능 여부 |
|---------|----------|-------------------|
| `inputParams` | id, type, label, columns | **가능** - parameters에서 추출 |
| `table` | id, type, label, columns | **부분 가능** - 테이블명 O, 컬럼 comment X |
| `subquery` | id, type, label, columns | **부분 가능** - 구조 O, 의미있는 라벨 X |
| `operation` | id, type, label, operationType, condition | **가능** - WHERE/ORDER BY 등 추출 |
| `result` | id, type, label, columns | **부분 가능** - 컬럼 O, 의미있는 라벨 X |

### 2.2 엣지 구조

| 엣지 타입 | 설명 | 정적 분석 가능 여부 |
|---------|------|-------------------|
| `input_ref` | 입력 파라미터 → Operation | **가능** - 파라미터 사용 위치 분석 |
| `data_flow` | 노드 간 데이터 흐름 | **가능** - SQL 절 순서 기반 |

---

## 3. 정적 분석 가능 항목 상세

### 3.1 완전히 가능한 항목 (✅)

#### 3.1.1 입력 파라미터 노드 (inputParams)

**현재 파서 코드:**
```python
def _extract_parameters(self, sql: str) -> List[Dict[str, str]]:
    parameters = []
    if "?" in sql:
        parameters.append({"type": "positional", "count": sql.count("?")})
    for param in re.findall(r"#\{([^}]+)\}", sql):
        parameters.append({"type": "mybatis", "name": param})
    for param in re.findall(r":(\w+)", sql):
        parameters.append({"type": "named", "name": param})
    return parameters
```

**정적 분석 결과 예시:**
```json
{
  "id": "input_params",
  "type": "inputParams",
  "label": "Input Parameters",
  "columns": [
    { "name": "#{metMngNo}" },
    { "name": "#{metCrtfMbhSrno}" },
    { "name": "#{itcsno}" },
    { "name": "#{esnsMbhNo}" }
  ]
}
```

**한계**: `comment` (한국어 설명) 생성 불가

---

#### 3.1.2 테이블 노드 (table)

**현재 파서 코드:**
```python
def _extract_tables(self, sql: str) -> List[Dict[str, Optional[str]]]:
    # FROM 절에서 테이블명, alias 추출
    tables.append({"name": table_name, "alias": alias, "schema": schema})
```

**정적 분석 결과 예시:**
```json
{
  "id": "main_table",
  "type": "table",
  "label": "MET_PBOK_MBH_CRTF_MNG_LDG",
  "columns": [
    { "name": "MET_MNG_NO" },
    { "name": "MET_CRTF_MBH_SRNO" },
    { "name": "ITCSNO" }
  ]
}
```

**한계**:
- 컬럼 `comment` 생성 불가
- SELECT * 사용 시 컬럼 목록 불완전

---

#### 3.1.3 Operation 노드 (WHERE, ORDER BY, GROUP BY, LIMIT)

**파서에서 추출 가능한 정보:**
```python
where_conditions: List[str]      # WHERE 조건
order_by_columns: List[str]      # ORDER BY 컬럼
group_by_columns: List[str]      # GROUP BY 컬럼
having_conditions: List[str]     # HAVING 조건
```

**ROWNUM/LIMIT 감지 (추가 구현 필요):**
```python
# 정규식으로 감지 가능
ROWNUM <= N
LIMIT N
FETCH FIRST N ROWS ONLY
TOP N
```

**정적 분석 결과 예시:**
```json
{
  "id": "where_op",
  "type": "operation",
  "label": "WHERE",
  "operationType": "WHERE",
  "condition": "MET_MNG_NO = #{metMngNo} AND (...)"
}
```

---

#### 3.1.4 엣지 연결

**데이터 흐름 규칙 (정적 분석 가능):**

| SQL 타입 | 엣지 흐름 |
|---------|----------|
| SELECT | table → [join] → [where] → [group] → [having] → [order] → [limit] → result |
| UPDATE | input_params → where, table → where → result |
| DELETE | input_params → where, table → where → result |
| INSERT | input_params → table → result |

**엣지 생성 로직:**
```python
edges = []

# 1. 입력 파라미터 → 첫 번째 Operation 노드
if has_parameters and has_where:
    edges.append({"source": "input_params", "target": "where_op", "type": "input_ref"})

# 2. 테이블 → JOIN 또는 WHERE
if has_join:
    edges.append({"source": table_id, "target": "join_op", "type": "data_flow"})
else:
    edges.append({"source": table_id, "target": "where_op", "type": "data_flow"})

# 3. Operation 체인
# where → order → limit → result (존재하는 것만)
```

---

### 3.2 부분적으로 가능한 항목 (⚠️)

#### 3.2.1 서브쿼리 노드 (subquery)

**현재 파서 코드:**
```python
def _extract_subqueries(self, sql: str) -> List[str]:
    subquery_pattern = r"\((\s*SELECT .*?)\)"
    return [match.group(1).strip() for match in re.finditer(...)]
```

**가능한 부분:**
- 서브쿼리 존재 감지 ✅
- 서브쿼리 SQL 추출 ✅
- 중첩 서브쿼리 개별 분석 ✅ (재귀 파싱)

**불가능한 부분:**
- 의미있는 라벨 생성 (예: "정렬된 회원 인증 정보") ❌
- 서브쿼리 목적 요약 ❌

**정적 분석 결과:**
```json
{
  "id": "subquery_1",
  "type": "subquery",
  "label": "Subquery #1",  // 기본 라벨만 가능
  "columns": [...]
}
```

**AI 분석 결과:**
```json
{
  "id": "subquery_result",
  "type": "subquery",
  "label": "정렬된 회원 인증 정보",  // 의미있는 라벨
  "columns": [...]
}
```

---

#### 3.2.2 결과 노드 (result)

**가능한 부분:**
- SELECT 컬럼 목록 추출 ✅
- 별칭(AS) 추출 ✅

**불가능한 부분:**
- 의미있는 라벨 생성 (예: "Result (Top 1)") ❌
- 컬럼 comment 생성 ❌

---

### 3.3 불가능한 항목 (❌)

#### 3.3.1 Summary (요약)

**AI 생성 예시:**
```json
"summary": "모임통장회원인증관리원장에서 조건에 맞는 최신 회원 인증 정보 1건 조회"
```

- SQL의 비즈니스 목적 이해 필요
- 테이블명/컬럼명의 의미 파악 필요
- 자연어 생성 능력 필요

**정적 분석**: 완전 불가능

---

#### 3.3.2 컬럼 Comment (한국어 설명)

**AI 생성 예시:**
```json
{ "name": "MET_MNG_NO", "comment": "모임관리번호" }
{ "name": "metCrtfMbhSrno", "comment": "모임인증회원일련번호" }
```

**정적 분석**: 불가능 (단, 아래 대안 존재)

**대안 1**: SQL 주석에서 추출
```sql
MET_MNG_NO AS metMngNo /* 모임관리번호 */
```
→ 주석 파싱으로 추출 가능

**대안 2**: DDL 메타데이터 연동
```sql
COMMENT ON COLUMN MET_PBOK_MBH_CRTF_MNG_LDG.MET_MNG_NO IS '모임관리번호';
```
→ 분석된 DB 스키마에서 조회

---

## 4. 샘플 SQL 정적 분석 시뮬레이션

### 4.1 입력 SQL

```sql
SELECT *
  FROM ( SELECT MET_MNG_NO AS metMngNo /* 모임관리번호 */
               , MET_CRTF_MBH_SRNO AS metCrtfMbhSrno /* 모임인증회원일련번호 */
               ...
           FROM MET_PBOK_MBH_CRTF_MNG_LDG
          WHERE MET_MNG_NO = #{metMngNo}
            AND (MET_CRTF_MBH_SRNO = #{metCrtfMbhSrno} OR ...)
          ORDER BY MET_CRTF_MBH_SRNO DESC
       )
 WHERE ROWNUM <= 1
```

### 4.2 정적 분석 결과 (예상)

```json
{
  "summary": "",
  "nodes": [
    {
      "id": "input_params",
      "type": "inputParams",
      "label": "Input Parameters",
      "columns": [
        { "name": "#{metMngNo}" },
        { "name": "#{metCrtfMbhSrno}" },
        { "name": "#{itcsno}" },
        { "name": "#{esnsMbhNo}" }
      ]
    },
    {
      "id": "table_MET_PBOK_MBH_CRTF_MNG_LDG",
      "type": "table",
      "label": "MET_PBOK_MBH_CRTF_MNG_LDG",
      "columns": [
        { "name": "MET_MNG_NO" },
        { "name": "MET_CRTF_MBH_SRNO" },
        { "name": "ITCSNO" },
        { "name": "ESNS_MBH_NO" },
        { "name": "UTZPE_NO_CFCD" },
        { "name": "MET_MBH_SRNO" },
        { "name": "MET_MBH_NM" },
        { "name": "MET_MBH_STCD" },
        { "name": "MET_MBH_DSCD" },
        { "name": "MET_MBH_HP_NO" },
        { "name": "LST_DB_CHG_ID" },
        { "name": "LST_DB_CHG_DTM" }
      ]
    },
    {
      "id": "where_op",
      "type": "operation",
      "label": "WHERE",
      "operationType": "WHERE",
      "condition": "MET_MNG_NO = #{metMngNo} AND (MET_CRTF_MBH_SRNO = #{metCrtfMbhSrno} OR ITCSNO = #{itcsno} OR ESNS_MBH_NO = #{esnsMbhNo})"
    },
    {
      "id": "order_op",
      "type": "operation",
      "label": "ORDER BY",
      "operationType": "ORDER_BY",
      "condition": "MET_CRTF_MBH_SRNO DESC"
    },
    {
      "id": "subquery_1",
      "type": "subquery",
      "label": "Subquery #1",
      "columns": [
        { "name": "metMngNo" },
        { "name": "metCrtfMbhSrno" },
        { "name": "itcsno" },
        { "name": "esnsMbhNo" },
        { "name": "utzpeNoCfcd" },
        { "name": "metMbhSrno" },
        { "name": "metMbhNm" },
        { "name": "metMbhStcd" },
        { "name": "metMbhDscd" },
        { "name": "metMbhHpNo" },
        { "name": "lstDbChgId" },
        { "name": "lstDbChgDtm" }
      ]
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
      "label": "Result",
      "columns": [
        { "name": "metMngNo" },
        { "name": "metCrtfMbhSrno" },
        { "name": "itcsno" },
        { "name": "esnsMbhNo" },
        { "name": "utzpeNoCfcd" },
        { "name": "metMbhSrno" },
        { "name": "metMbhNm" },
        { "name": "metMbhStcd" },
        { "name": "metMbhDscd" },
        { "name": "metMbhHpNo" },
        { "name": "lstDbChgId" },
        { "name": "lstDbChgDtm" }
      ]
    }
  ],
  "edges": [
    { "source": "input_params", "target": "where_op", "type": "input_ref" },
    { "source": "table_MET_PBOK_MBH_CRTF_MNG_LDG", "target": "where_op", "type": "data_flow" },
    { "source": "where_op", "target": "order_op", "type": "data_flow" },
    { "source": "order_op", "target": "subquery_1", "type": "data_flow" },
    { "source": "subquery_1", "target": "limit_op", "type": "data_flow" },
    { "source": "limit_op", "target": "result", "type": "data_flow", "label": "result" }
  ]
}
```

### 4.3 AI 분석 결과와 비교

| 항목 | 정적 분석 | AI 분석 | 차이점 |
|-----|----------|---------|-------|
| **summary** | (빈 문자열) | "모임통장회원인증관리원장에서..." | AI만 생성 가능 |
| **노드 구조** | 동일 | 동일 | - |
| **엣지 구조** | 동일 | 동일 | - |
| **테이블 라벨** | "MET_PBOK_MBH_CRTF_MNG_LDG" | "MET_PBOK_MBH_CRTF_MNG_LDG" | 동일 |
| **컬럼 comment** | (없음) | "모임관리번호" 등 | AI만 생성 가능 |
| **서브쿼리 라벨** | "Subquery #1" | "정렬된 회원 인증 정보" | AI가 의미 파악 |
| **Result 라벨** | "Result" | "Result (Top 1)" | AI가 목적 파악 |

---

## 5. 구현 방안 비교

### 5.1 방안 A: 순수 정적 분석

**장점:**
- AI API 비용 절감 (100%)
- 분석 속도 빠름
- 일관된 결과 보장
- 오프라인 환경 지원

**단점:**
- summary 생성 불가
- comment(한국어 설명) 생성 불가
- 의미있는 라벨 생성 불가
- 복잡한 서브쿼리/CTE 파싱 한계

**적합한 경우:**
- 단순한 SQL이 대부분인 프로젝트
- AI 비용이 제약인 환경
- 빠른 분석이 필요한 경우

---

### 5.2 방안 B: 하이브리드 (정적 분석 + AI 보강)

```
SQL 문 → 정적 분석 → 기본 Flow JSON 생성 → AI 보강 → 최종 Flow JSON
```

**1단계: 정적 분석**
- 노드/엣지 구조 생성
- 테이블명, 컬럼명, 조건문 추출
- 파라미터 추출

**2단계: AI 보강 (선택적)**
- summary 생성
- comment 추가
- 라벨 개선

**장점:**
- AI 토큰 사용량 대폭 감소 (구조 생성 제외)
- 구조적 정확성 보장
- AI는 "의미 부여"에만 집중

**단점:**
- 두 단계 처리로 구현 복잡도 증가
- AI 프롬프트 수정 필요

**AI 프롬프트 (보강용 - 간소화):**
```
입력된 SQL Flow JSON에 다음을 추가하세요:
1. summary: SQL의 목적을 한 문장으로 요약
2. 각 노드의 columns에 comment 추가 (한국어 설명)
3. subquery/result 노드의 label을 의미있게 수정
```

**토큰 절감 예상:**
- 현재 프롬프트: ~500 토큰 + SQL + 응답
- 보강 프롬프트: ~100 토큰 + 기본 JSON + 응답 (응답 크기 감소)
- 예상 절감: 40-60%

---

### 5.3 방안 C: 정적 분석 + DDL 메타데이터

**요구사항:**
- 분석된 DDL에서 테이블/컬럼 comment 조회
- Neo4j에 저장된 Table/Column 노드 활용

**흐름:**
```
SQL → 정적 분석 → 테이블명 추출 → Neo4j에서 컬럼 comment 조회 → Flow JSON 생성
```

**장점:**
- AI 없이도 comment 생성 가능 (DDL에 있는 경우)
- 일관된 용어 사용 (DB 정의 기준)

**단점:**
- DDL 분석이 선행되어야 함
- DDL에 comment가 없으면 불가능
- summary, 라벨 개선은 여전히 불가능

---

### 5.4 방안 D: SQL 주석 활용

**요구사항:**
- 개발자가 SQL에 주석으로 설명을 작성하는 경우

```sql
SELECT MET_MNG_NO AS metMngNo /* 모임관리번호 */
     , MET_CRTF_MBH_SRNO AS metCrtfMbhSrno /* 모임인증회원일련번호 */
```

**파싱 로직:**
```python
# 컬럼 별칭 뒤의 /* ... */ 주석 추출
pattern = r"(\w+)\s+AS\s+(\w+)\s*/\*\s*(.+?)\s*\*/"
matches = re.findall(pattern, sql)
# → [("MET_MNG_NO", "metMngNo", "모임관리번호"), ...]
```

**장점:**
- 개발자 의도 그대로 반영
- AI 불필요
- 정확한 설명

**단점:**
- 주석이 없는 SQL에는 적용 불가
- 주석 형식이 일정해야 함
- 기존 SQL 수정 필요

---

## 6. 권장 방안

### 6.1 단기 권장: 방안 B (하이브리드)

**이유:**
1. 기존 AI 분석 결과와 호환성 유지
2. 구조적 정확성 향상 (정적 분석 기반)
3. AI 비용 절감 (40-60%)
4. 점진적 적용 가능

**구현 단계:**
1. 정적 분석으로 기본 Flow JSON 생성 기능 구현
2. AI 보강 프롬프트 작성 (간소화 버전)
3. 옵션으로 "정적 분석만" / "정적 분석 + AI" 선택 가능하게

---

### 6.2 중장기 권장: 방안 C+D 병행

**DDL 메타데이터 활용:**
- 테이블/컬럼 comment를 DDL에서 가져오기
- Neo4j에 저장된 스키마 정보 활용

**SQL 주석 활용:**
- 주석 파싱 로직 추가
- 개발자 주석 우선 적용

**최종 형태:**
```
SQL → 정적 분석 → DDL 메타데이터 조회 → SQL 주석 파싱 → [선택적 AI 보강] → Flow JSON
```

---

## 7. 구현 난이도 및 예상 공수

| 방안 | 난이도 | 예상 공수 | 효과 |
|-----|-------|----------|------|
| A. 순수 정적 분석 | 중 | 3-5일 | AI 비용 100% 절감, 품질 저하 |
| B. 하이브리드 | 중 | 5-7일 | AI 비용 50% 절감, 품질 유지 |
| C. DDL 메타데이터 | 중상 | 5-7일 | 일부 comment 자동화 |
| D. SQL 주석 활용 | 하 | 1-2일 | 주석 있는 경우만 적용 |

---

## 8. 결론

### 8.1 요약

| 구분 | 정적 분석 가능 여부 |
|-----|-------------------|
| **노드 구조 (테이블, 파라미터, Operation)** | ✅ 완전 가능 |
| **엣지 구조 (데이터 흐름)** | ✅ 완전 가능 |
| **Summary (요약)** | ❌ 불가능 |
| **Column Comment (한국어 설명)** | ⚠️ 조건부 가능 (DDL/주석) |
| **의미있는 라벨** | ❌ 불가능 |

### 8.2 최종 권장

**"하이브리드 방안 (B)"을 권장합니다.**

- 정적 분석으로 구조적 정확성 확보
- AI는 의미 부여(summary, comment, label)에만 사용
- 비용 절감과 품질 유지의 균형점

### 8.3 추가 고려사항

1. **정적 분석 단독 모드 옵션 제공**
   - AI 비용을 절감하고 싶은 경우
   - 빠른 분석이 필요한 경우
   - 오프라인 환경

2. **점진적 마이그레이션**
   - 기존 AI 분석 결과는 그대로 유지
   - 신규 분석부터 하이브리드 방식 적용

3. **SQL 파서 개선 필요 사항**
   - ROWNUM/LIMIT 절 감지 추가
   - CTE (WITH 절) 파싱 추가
   - 중첩 서브쿼리 계층 구조 파싱 개선

---

*본 문서는 검토 목적으로 작성되었으며, 실제 구현 전 추가 논의가 필요합니다.*
