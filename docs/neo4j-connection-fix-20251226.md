# Neo4j DB 연결 오류 수정

**작성일:** 2025년 12월 26일
**작성자:** Antigravity

## 1. 개요

분석 작업 실행 시 `Graph not found: neo4j` 오류가 발생하며 작업이 중단되는 현상을 해결함.

## 2. 문제 상황

- **증상**: 로그에 `Neo.ClientError.Database.DatabaseNotFound: Graph not found: neo4j` 에러 기록.
- **환경**: `.env` 파일에는 `NEO4J_DATABASE=csadb01`로 올바르게 설정되어 있음.
- **분석**: CLI 실행과 달리 API 서버를 통한 실행 시, 설정된 DB 이름 대신 기본값 `neo4j`가 사용되고 있었음.

## 3. 원인 분석

- `server/app/services/analysis_wrapper.py` 파일 내 `run_analysis_task` 함수에서 `analyze_project` 서비스를 호출할 때, `neo4j_database` 파라미터가 `"neo4j"` 문자열로 **하드코딩**되어 있었음.
- 이로 인해 `app/core/config.py`를 통해 로드된 `settings.NEO4J_DATABASE` 값이 무시됨.

## 4. 해결 방법

### 소스 코드 수정

**대상 파일**: `server/app/services/analysis_wrapper.py`

**수정 내용**: 하드코딩된 값을 `settings` 객체의 값으로 대체.

```python
# 수정 전
neo4j_database="neo4j", # TODO: Make configurable

# 수정 후
neo4j_database=settings.NEO4J_DATABASE or "neo4j",
```

## 5. 검증

- 코드 추적을 통해 API 요청(`AnalysisRequest`)부터 DB 연결(`GraphDB` 초기화)까지의 파라미터 전달 경로를 확인함.
- 수정 후 `analyze_project` 함수에 `.env`에서 설정한 `csadb01` 값이 정상적으로 전달될 것임.
