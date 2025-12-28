# 프로젝트 대시보드 데이터 누락 문제 해결

## 문제 상황

- **현상**: 분석 완료 후 대시보드에서 "Project Information" 영역의 Framework, Repository 등의 정보가 나오지 않고, Packages/Classes 개수가 0으로 표시됨.
- **로그 분석**: Java Analysis 로그에서는 Packages: 29, Classes: 739로 정상 파싱되었음을 확인. Neo4j DB에도 노드가 저장되어 있음.
- **원인 분석**:
  - Neo4j에 데이터가 저장될 때 `Project` 노드와 `Package` 노드 간의 `[:CONTAINS]` 관계가 생성되어야 함.
  - 대량 데이터 처리를 위한 **Streaming 모드** 분석 시, `Package` 노드를 먼저 일괄 저장(Batch Save)하고 분석을 시작함.
  - 기존 로직에서는 분석이 모두 끝난 **후**에 `Project` 노드를 생성/저장하고 있었음 (`save_java_objects_to_neo4j` 함수 내).
  - 이로 인해 `Package` 저장 시점에는 `Project` 노드가 존재하지 않아 `MATCH (proj:Project ...)` 구문이 실패하고, 결과적으로 관계가 연결되지 않음.
  - 대시보드 쿼리는 `(p:Project)-[:CONTAINS]->(pkg:Package)` 관계를 기반으로 집계하므로 개수가 0으로 나옴.

## 조치 사항

- **파일**: `server/csa/services/analysis/handlers.py`
- **내용**: 분석 파이프라인(`analyze_full_project_java`)이 시작되기 **전**에 명시적으로 `Project` 노드를 먼저 생성하도록 수정.

  ```python
  # [FIX] Streaming 모드에서 Package/Class 저장 시 Project 노드가 존재해야 관계가 생성됨
  if db and not dry_run:
      db.add_project(project_entity)
  ```

## 검증 방법

1. 서버 재시작 (코드 변경 사항 반영).
2. "sml-fns-online" 프로젝트에 대해 분석(Analyze) 다시 실행.
3. 분석 완료 후 대시보드 새로고침.
4. "Project Information" 섹션의 데이터가 정상 표시되는지, Packages/Classes 개수가 로그와 일치하는지 확인.
