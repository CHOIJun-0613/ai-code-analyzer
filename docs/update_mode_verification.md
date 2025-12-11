# --update 모드 Project 통계 검증 가이드

## 개요

`--update` 모드에서 Project 노드의 통계가 올바르게 계산되는지 검증하는 가이드입니다.

## 구현 내역

### 문제점
- 기존: `--update` 모드에서 `artifacts.classes`에 새로 추가된 클래스만 포함되어 LOC 합계가 부정확했음
- 예: 기존 100개 클래스 + 신규 10개 클래스 추가 시, 신규 10개만 계산되어 Project LOC가 부정확

### 해결 방법
- `--clean` 모드: artifacts의 클래스만 사용하여 통계 계산 (기존 방식 유지)
- `--update` 모드: Neo4j에서 프로젝트의 **모든 Class 노드를 조회**하여 통계 재계산

### 구현 상세

#### 1. Neo4j 조회 메서드 추가 (`project_nodes.py`)
```python
def get_project_loc_statistics(self, project_name: str) -> dict:
    """프로젝트에 속한 모든 Class의 LOC 통계를 조회"""
    # Neo4j에서 SUM(PLOC), SUM(LLOC), SUM(CLOC) 집계
```

#### 2. 통계 계산 함수 추가 (`project_statistics.py`)
```python
def calculate_project_statistics_from_neo4j(
    db: GraphDB,
    project: Project,
    project_name: str,
    java_source_folder: str
) -> Project:
    """Neo4j에서 모든 Class를 조회하여 통계 계산"""
    # 1. 파일 수: 파일 시스템 순회
    # 2. LOC 통계: Neo4j 조회
```

#### 3. 조건부 통계 계산 (`neo4j_writer.py`)
```python
if clean:
    # --clean 모드: artifacts의 클래스만 사용
    classes_dict = {cls.name: cls for cls in artifacts.classes}
    project = calculate_project_statistics(project, classes_dict, java_source_folder)
else:
    # --update 모드: Neo4j에서 모든 클래스 조회
    project = calculate_project_statistics_from_neo4j(db, project, project_name, java_source_folder)
```

## 검증 시나리오

### 시나리오 1: --clean 모드 (기존 동작 유지)

```bash
# 1. 전체 재분석
python -m csa.cli.main analyze --all-objects --clean --project-name test-project

# 2. Neo4j에서 Project 통계 확인
MATCH (p:Project {name: 'test-project'})
RETURN p.total_file_count, p.total_java_file_count,
       p.total_PLOC, p.total_LLOC, p.total_CLOC

# 예상 결과:
# - total_java_file_count: 100 (예시)
# - total_PLOC: 10000 (예시)
# - total_LLOC: 8000 (예시)
# - total_CLOC: 1500 (예시)
```

### 시나리오 2: --update 모드 (새로운 클래스 추가)

```bash
# 1. 소스 폴더에 새 Java 파일 10개 추가
# (NewClass1.java ~ NewClass10.java)

# 2. --update 모드로 분석
python -m csa.cli.main analyze --java-object --update --project-name test-project

# 3. Neo4j에서 Project 통계 확인
MATCH (p:Project {name: 'test-project'})
RETURN p.total_file_count, p.total_java_file_count,
       p.total_PLOC, p.total_LLOC, p.total_CLOC

# 예상 결과:
# - total_java_file_count: 110 (100 + 10)
# - total_PLOC: 11000 (10000 + 1000, 신규 10개 클래스의 LOC 포함)
# - total_LLOC: 8800 (8000 + 800, 신규 10개 클래스의 LLOC 포함)
# - total_CLOC: 1650 (1500 + 150, 신규 10개 클래스의 CLOC 포함)
```

### 시나리오 3: --update 모드 (기존 클래스 수정)

```bash
# 1. 기존 Java 파일 수정 (라인 수 증가)
# (예: UserController.java의 메서드 추가)

# 2. --update 모드로 분석
# (수정된 파일만 재분석됨)
python -m csa.cli.main analyze --java-object --update --project-name test-project

# 3. Neo4j에서 Project 통계 확인
MATCH (p:Project {name: 'test-project'})
RETURN p.total_PLOC, p.total_LLOC, p.total_CLOC

# 예상 결과:
# - 수정된 클래스의 LOC 변경분이 반영됨
# - 예: UserController의 PLOC가 200 → 250으로 증가 시
#   total_PLOC: 11050 (11000 + 50)
```

## 검증 쿼리

### 1. Project 통계 조회
```cypher
MATCH (p:Project {name: 'test-project'})
RETURN p.name,
       p.total_file_count,
       p.total_java_file_count,
       p.total_xml_file_count,
       p.total_etc_file_count,
       p.total_PLOC,
       p.total_LLOC,
       p.total_CLOC
```

### 2. Class별 LOC 확인
```cypher
MATCH (c:Class {project_name: 'test-project'})
RETURN c.name, c.PLOC, c.LLOC, c.CLOC, c.cognitive_complexity
ORDER BY c.PLOC DESC
LIMIT 10
```

### 3. LOC 합계 직접 계산 (검증용)
```cypher
MATCH (c:Class {project_name: 'test-project'})
WHERE c.PLOC IS NOT NULL
RETURN COUNT(c) AS class_count,
       SUM(c.PLOC) AS total_ploc,
       SUM(c.LLOC) AS total_lloc,
       SUM(c.CLOC) AS total_cloc
```

### 4. Class 수와 Project 통계 비교
```cypher
MATCH (p:Project {name: 'test-project'})
MATCH (c:Class {project_name: 'test-project'})
WITH p, COUNT(c) AS actual_class_count, SUM(c.PLOC) AS actual_ploc
RETURN p.name,
       actual_class_count,
       actual_ploc,
       p.total_PLOC,
       CASE WHEN actual_ploc = p.total_PLOC THEN 'OK' ELSE 'MISMATCH' END AS validation
```

## 예상 결과

### --clean 모드
- ✅ artifacts.classes의 LOC만 계산
- ✅ 전체 재분석이므로 정확한 통계

### --update 모드
- ✅ Neo4j에서 모든 Class 노드 조회
- ✅ 기존 클래스 + 신규 클래스 모두 포함
- ✅ 정확한 누적 통계

## 로그 확인

분석 실행 시 로그에서 다음 메시지를 확인:

```
# --update 모드 실행 시
INFO - --update 모드: Neo4j에서 모든 클래스 조회하여 통계 재계산 중...
INFO - 프로젝트 통계: 전체 파일 110개 (Java: 110, XML: 0, 기타: 0), PLOC: 11000, LLOC: 8800, CLOC: 1650
```

## 결론

`--update` 모드에서 Project 노드의 통계는 이제 Neo4j에 저장된 **모든 Class 노드**를 기반으로 계산되므로, 기존 클래스와 신규 클래스를 모두 포함한 정확한 누적 통계를 제공합니다.
