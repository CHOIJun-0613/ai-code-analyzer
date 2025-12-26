# AI 분석 오작동 수정 및 로그 불일치 원인 분석

**작성일:** 2025년 12월 26일
**작성자:** Antigravity

## 1. 문제 현상

- 사용자가 화면에서 AI 분석을 활성화하지 않았음에도 불구하고, 분석 중 AI 관련 오류 로그("LLM 호출 실패", "메서드 없음")가 발생함.
- 서버 로그 파일(`csa-YYYYMMDD.log`)에는 분석이 정상적으로 완료된 것으로 보이나, 화면 상의 로그(Analysis Logs)에는 많은 WARNING 메시지가 출력되어 분석이 실패한 것처럼 보임.

## 2. 원인 분석

### 2.1. AI 분석이 비활성화되지 않은 이유

- **원인 코드**: `server/csa/services/java_analysis/project.py`의 `parse_single_java_file` 함수.
- **문제 로직**:

  ```python
  # 기존 로직
  use_ai = os.getenv("USE_AI_ANALYSIS", "false").lower() == "true"
  if ai_options:
      use_ai = True
  ```

  - API 요청에서 AI 분석을 끄면 `ai_options`가 `None`으로 전달됩니다.
  - 이 경우 코드는 환경 변수 `USE_AI_ANALYSIS`의 값을 확인합니다.
  - 개발/테스트 환경(`server/.env`)에 `USE_AI_ANALYSIS=true`가 설정되어 있어, 사용자 설정과 무관하게 항상 AI 분석이 시도되었습니다.

### 2.2. 로그 불일치 이유

- **서버 로그 vs 화면 로그**:
  - **서버 로그**: 전체 분석 흐름을 기록하며, 개별 파일 분석 중 발생한 예외나 경고(AI 실패 등)는 전체 분석 실패로 간주하지 않고 진행합니다. 따라서 최종적으로 "작업 완료" 메시지와 통계가 기록됩니다.
  - **화면 로그**: API를 통해 실시간 로그(또는 주기적 폴링 로그)를 가져오는데, 여기서 `logger.warning` 수준의 로그들도 모두 표시하고 있습니다. AI 초기화가 되지 않은 상태에서 AI 분석 로직이 실행되면서 대량의 `WARNING` 로그(LLM 호출 실패)가 발생했고, 이것이 화면을 가득 채워 분석 실패처럼 보이게 만들었습니다.

## 3. 조치 내용

### 3.1. Backend 수정

- **파일**: `server/csa/services/java_analysis/project.py`
- **수정 사항**:
  - `parse_single_java_file` 함수에 `use_ai: bool` 파라미터 추가.
  - `_parse_single_file_wrapper` 함수에 `use_ai: bool` 파라미터 추가.
  - `parse_java_project_streaming` 함수에서 `use_ai_analysis` 값(사용자 선택 값)을 명시적으로 하위 함수에 전달.
  - `parse_single_java_file` 내에서 `use_ai` 인자가 전달된 경우, 환경 변수보다 우선하여 적용하도록 로직 변경.

### 3.2. 검증 결과

- 수정 후에는 API에서 `use_ai_analysis=false`를 요청하면, 서버 환경 변수(`USE_AI_ANALYSIS=true`)와 상관없이 AI 분석 로직을 건너뛰게 됩니다.
- 따라서 불필요한 AI 관련 WARNING 로그가 발생하지 않으며, 기본적인 정적 분석만 빠르게 수행됩니다.

## 4. 참고 사항

- 화면의 로그 창에 WARNING 메시지가 많아도, 서버 로그 파일의 마지막에 통계 정보가 출력되었다면 분석 자체는 완료된 것입니다.
- 이번 패치로 인해 AI 분석 옵션을 켰을 때만 AI 동작이 수행되므로, 분석 속도와 로그 안정성이 개선됩니다.
