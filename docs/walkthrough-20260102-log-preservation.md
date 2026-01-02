# 분석 로그 삭제 방지 및 관리 개선 작업 계획서

**작성일**: 2026-01-02
**작업자**: Antigravity
**개선 항목**:
1. 분석 실행 시 "삭제 후 저장(clean: true)" 옵션 사용 시 분석 로그(AnalysisHistory)가 삭제되는 문제 수정
2. 분석 로그는 오직 "분석 로그 관리" 화면에서만 삭제 가능하도록 보장

---

## 1. 현황 분석 및 문제 원인

### 문제 현황
- 코드 정적 분석 실행 시 `clean: true` 옵션을 선택하면 해당 프로젝트의 기존 데이터가 삭제됨.
- 이때 `GraphDB.clean_database(project_name)`가 호출되는데, 이 함수는 `project_name` 속성을 가진 모든 노드를 삭제함.
- `AnalysisHistory` 노드 또한 `project_name` 속성을 가지고 있어 함께 삭제되는 현상 발생.

### 원인 코드 (`server/csa/services/graph_db/maintenance.py`)
```python
# 기존 코드
session.run("MATCH (n {project_name: $project_name}) CALL { WITH n DETACH DELETE n } IN TRANSACTIONS OF 10000 ROWS", project_name=project_name)
```
위 쿼리는 라벨에 상관없이 `project_name`이 일치하는 모든 노드를 삭제합니다.

---

## 2. 개선 계획

### 개선 방향
- 데이터베이스 정리 시 시스템 관련 노드(라벨 `:System`)는 제외하도록 쿼리 수정.
- `AnalysisHistory`, `User`, `UserGroup` 등은 모두 `:System` 라벨을 가지고 있으므로, 이를 제외하면 분석 데이터만 안전하게 삭제할 수 있음.

### 수정 계획 (`server/csa/services/graph_db/maintenance.py`)
1. `clean_database(project_name)` 함수 내의 쿼리에 `WHERE NOT n:System` 조건 추가.
2. 전체 삭제(`clean_database(None)`) 시에도 시스템 노드는 보호하도록 조건 추가.

---

## 3. 영향도 평가
- **긍정적 영향**: 분석을 새로 실행하더라도 과거의 분석 이력(로그)이 유지됨. 사용자 및 그룹 정보가 실수로 삭제되는 것을 방지함.
- **부정적 영향**: 없음. 분석 로그는 별도의 관리 화면에서 명시적으로 삭제 가능함.

---

위 계획에 따라 수정을 진행하겠습니다.
