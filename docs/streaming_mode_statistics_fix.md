# 스트리밍 모드에서 Project 통계 0 문제 해결

## 문제 현상
재분석 후 Project 노드의 모든 통계값이 0으로 표시되는 문제 발생:

```
total_CLOC: 0
total_etc_file_count: 0
total_file_count: 0
total_java_file_count: 0
total_LLOC: 0
total_PLOC: 0
total_xml_file_count: 0
```

## 원인 분석

### 1. 환경 설정 확인
```bash
# .env 파일
USE_STREAMING_PARSE=true  # ← 스트리밍 모드 활성화
```

### 2. 스트리밍 모드의 동작 방식
스트리밍 모드에서는 **메모리 절약**을 위해 클래스 데이터를 메모리에 보관하지 않습니다:

```python
# java_pipeline.py (스트리밍 모드)
artifacts = JavaAnalysisArtifacts(
    packages=[],  # 스트리밍 모드에서는 메모리에 저장하지 않음
    classes=[],   # ← 빈 리스트!
    ...
)
```

### 3. 기존 통계 계산 로직
```python
# neo4j_writer.py (기존 코드)
if clean:
    # artifacts.classes 사용 → 스트리밍 모드에서는 빈 리스트!
    classes_dict = {cls.name: cls for cls in artifacts.classes}
    project = calculate_project_statistics(project, classes_dict, java_source_folder)
```

**결과:** `classes_dict`가 비어있어서 모든 통계가 0으로 계산됨

## 해결 방법

### 수정된 로직 (neo4j_writer.py:580-611)

```python
# 스트리밍 모드 확인
use_streaming = os.getenv("USE_STREAMING_PARSE", "false").lower() == "true"

# 스트리밍 모드이거나 artifacts.classes가 비어있으면 Neo4j에서 조회
if use_streaming or not artifacts.classes:
    # Neo4j에서 모든 클래스를 조회하여 통계 계산
    logger.info("Neo4j에서 모든 클래스를 조회하여 통계 계산 중...")
    project = calculate_project_statistics_from_neo4j(db, project, project_name, java_source_folder)
else:
    # 배치 모드: artifacts의 클래스 사용
    classes_dict = {cls.name: cls for cls in artifacts.classes}
    project = calculate_project_statistics(project, classes_dict, java_source_folder)
```

### 핵심 변경 사항

1. **스트리밍 모드 자동 감지**
   - `USE_STREAMING_PARSE` 환경 변수 확인
   - `artifacts.classes`가 비어있는지 확인

2. **조건부 통계 계산**
   - **스트리밍 모드:** Neo4j에서 모든 Class 노드 조회하여 통계 계산
   - **배치 모드:** artifacts.classes 사용하여 통계 계산

3. **Neo4j 조회 메서드 활용**
   ```python
   # project_nodes.py
   def get_project_loc_statistics(self, project_name: str) -> dict:
       """Neo4j에서 SUM(PLOC), SUM(LLOC), SUM(CLOC) 집계"""
   ```

## 동작 흐름

### 스트리밍 모드 (USE_STREAMING_PARSE=true)

```
1. Java 파일 파싱
   ↓
2. 각 파일을 파싱할 때마다 즉시 Neo4j에 저장
   (메모리에는 저장하지 않음)
   ↓
3. artifacts.classes = []  (빈 리스트)
   ↓
4. save_java_objects_to_neo4j() 호출
   ↓
5. 스트리밍 모드 감지
   ↓
6. Neo4j에서 모든 Class 조회
   MATCH (c:Class {project_name: $project_name})
   RETURN SUM(c.PLOC), SUM(c.LLOC), SUM(c.CLOC)
   ↓
7. Project 통계 업데이트 ✅
```

### 배치 모드 (USE_STREAMING_PARSE=false)

```
1. Java 파일 파싱
   ↓
2. 모든 클래스를 메모리에 저장
   ↓
3. artifacts.classes = [Class1, Class2, ...]
   ↓
4. save_java_objects_to_neo4j() 호출
   ↓
5. artifacts.classes에서 직접 통계 계산
   ↓
6. Project 통계 업데이트 ✅
```

## 검증 방법

### 1. 재분석 실행
```bash
python -m csa.cli.main analyze --all-objects --clean --project-name test-project
```

### 2. 로그 확인
```
INFO - Project 통계 집계 시작: clean=True, java_source_folder=target_src/...
INFO - 스트리밍 모드: True
INFO - Neo4j에서 모든 클래스를 조회하여 통계 계산 중...
INFO - 프로젝트 통계: 전체 파일 739개 (Java: 739, XML: 0, 기타: 0), PLOC: 115234, LLOC: 89456, CLOC: 15678
```

### 3. Neo4j에서 통계 확인
```cypher
-- Project 통계 조회
MATCH (p:Project {name: 'test-project'})
RETURN p.total_file_count, p.total_java_file_count,
       p.total_PLOC, p.total_LLOC, p.total_CLOC

-- Class별 LOC 확인 (샘플)
MATCH (c:Class {project_name: 'test-project'})
RETURN c.name, c.PLOC, c.LLOC, c.CLOC
ORDER BY c.PLOC DESC
LIMIT 10

-- 통계 검증 (Project 합계 vs Class 합계)
MATCH (p:Project {name: 'test-project'})
MATCH (c:Class {project_name: 'test-project'})
WITH p, SUM(c.PLOC) AS actual_ploc, SUM(c.LLOC) AS actual_lloc, SUM(c.CLOC) AS actual_cloc
RETURN p.total_PLOC, actual_ploc,
       p.total_LLOC, actual_lloc,
       p.total_CLOC, actual_cloc,
       CASE WHEN p.total_PLOC = actual_ploc THEN 'OK' ELSE 'MISMATCH' END AS validation
```

## 수정된 파일

1. ✅ `csa/services/analysis/neo4j_writer.py` (580-611줄)
   - 스트리밍 모드 자동 감지
   - 조건부 통계 계산 로직

2. ✅ `csa/services/graph_db/project_nodes.py` (1437-1473줄)
   - `get_project_loc_statistics()` 메서드 추가

3. ✅ `csa/utils/project_statistics.py` (82-164줄)
   - `calculate_project_statistics_from_neo4j()` 함수 추가
   - 디버깅 로그 추가

## 예상 결과

### 성공 케이스
```
total_file_count: 739
total_java_file_count: 739
total_xml_file_count: 0
total_etc_file_count: 0
total_PLOC: 115234
total_LLOC: 89456
total_CLOC: 15678
```

### --update 모드에서도 동일하게 동작
```bash
# 신규 클래스 추가 후
python -m csa.cli.main analyze --java-object --update --project-name test-project

# 결과: Neo4j에서 모든 클래스 조회하여 정확한 누적 통계 표시
```

## 결론

스트리밍 모드와 배치 모드 모두에서 Project 통계가 정확하게 계산됩니다:

- ✅ **스트리밍 모드:** Neo4j에서 모든 Class 조회
- ✅ **배치 모드:** artifacts.classes 사용
- ✅ **--clean 모드:** 정확한 통계
- ✅ **--update 모드:** 정확한 누적 통계

성능 영향도 최소화:
- 스트리밍 모드는 메모리 절약 유지
- Neo4j 조회는 SUM 집계 쿼리 한 번만 실행 (매우 빠름)
