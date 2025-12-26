# 분석 작업 결과 로그 관리 기능 추가

## 개요

분석 작업의 이력을 관리하기 위해 Neo4j에 `AnalysisHistory` 노드를 생성하고 관련 정보를 저장하는 기능을 구현했습니다.

## 변경 사항

### 1. AnalysisHistoryMixin 추가

`server/csa/services/graph_db/analysis_history.py` 파일을 생성하여 분석 이력을 저장하는 `AnalysisHistoryMixin` 클래스를 정의했습니다.
이 클래스는 다음 속성을 가진 `AnalysisHistory` (Label: `System`) 노드를 생성합니다:

- `job_id`: 분석 Job ID (CLI의 경우 'Server CLI analysis')
- `start_time`: 시작 시각 (YYYY/MM/DD HH:MM:SS)
- `end_time`: 종료 시각 (YYYY/MM/DD HH:MM:SS)
- `work_time`: 작업 소요 시간 (HH:MM:SS)
- `file_count`: 분석된 파일 수
- `result`: 결과 (Completed, Failed, Canceled)
- `user_id`: 사용자 ID (CLI의 경우 'Server CLI')
- `summary`: 작업 결과 요약

### 2. GraphDB 통합

`server/csa/services/graph_db/__init__.py`를 수정하여 `GraphDB` 클래스가 `AnalysisHistoryMixin`을 상속받도록 했습니다. 이를 통해 `GraphDB` 인스턴스에서 `save_analysis_history` 메서드를 사용할 수 있습니다.

### 3. 분석 로직 수정

`server/csa/services/analysis/handlers.py`의 `analyze_project` 함수를 수정했습니다.

- **시작 시점**: `job_id`, `user_id`, `start_time`을 캡처합니다.
- **종료 시점 (finally 블록)**: 성공/실패 여부에 따라 `result` 상태를 결정하고, 소요 시간을 계산하여 `db.save_analysis_history`를 호출합니다.
- **예외 처리**: `KeyboardInterrupt` 발생 시 'Canceled' 상태로 기록되도록 처리했습니다.

## 검증

- `verify_analysis_log.py` 스크립트를 통해 `AnalysisHistory` 노드가 정상적으로 생성되고 속성 값이 올바르게 저장되는지 확인하는 로직을 작성했습니다.
- 분석 시작/종료 시 자동으로 로그가 기록됩니다.

## 파일 위치

- `server/csa/services/graph_db/analysis_history.py`
- `server/csa/services/analysis/handlers.py`
- `server/csa/services/graph_db/__init__.py`
