# SQL AI 분석 배치 처리 오류 수정

## 1. 문제 상황

- **증상**: SQL AI 분석 실행 시 로그에 `ERROR - SQL batch enrichment failed (batch 1): 'sql_id'` 오류가 발생하며 분석이 실패함.
- **원인**: `server/csa/services/ai_enrichment_service.py` 파일의 `_enrich_sql_statements_async` 메서드에서 로그 메시지를 생성할 때 `node_id_map`의 값에서 `sql_id` 키를 참조하지만, 해당 딕셔너리에 `sql_id`가 포함되어 있지 않음.

## 2. 해결 방안

- **대상 파일**: `server/csa/services/ai_enrichment_service.py`
- **수정 내용**: `_enrich_sql_statements_async` 메서드 내에서 `node_id_map` 딕셔너리를 구성할 때 `sql_id` 정보를 추가함.

```python
node_id_map[sql_id_val] = {
    "node_id": node_id_val,
    "mapper_name": record["mapper_name"],
    "sql_id": sql_id_val  # 추가
}
```

## 3. 검증 계획

- 소스 코드 수정 후 정적 분석을 통해 문법 및 참조 오류 확인.
- (사용자 측) 수정 패치 적용 후 SQL AI 분석 재실행하여 오류 발생 여부 확인.
