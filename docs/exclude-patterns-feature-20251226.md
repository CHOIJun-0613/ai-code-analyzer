# 분석 화면 '분석 제외 패턴' 기능 추가 및 구현 내용

**작성일:** 2025년 12월 26일
**작성자:** Antigravity

## 1. 개요

분석 화면(Analysis Page)의 "소스 코드 분석 옵션" 섹션에 사용자가 직접 분석에서 제외할 파일이나 폴더의 패턴을 입력할 수 있는 "분석 제외 패턴(Exclude Patterns)" 기능을 추가했습니다. 이 설정은 서버의 `.csaignore` 파일과는 별도로 적용되며, 설정 저장 및 불러오기 기능에 포함됩니다.

## 2. 변경 사항

### Frontend

- **파일**: `client/src/pages/Analysis.tsx`
  - `excludePatterns` state 추가.
  - "Source Code Analysis Options" 섹션에 `textarea` UI 추가 (Advanced Numerical Inputs 아래).
  - `loadPreferences`, `savePreferences`, `handleSubmit` 함수에 `exclude_patterns` 처리 로직 추가.
- **파일**: `client/src/locales/ko/translation.json`, `client/src/locales/en/translation.json`
  - `excludePatterns`, `excludePatternsPlaceholder`, `excludePatternsTooltip` 다국어 키 추가.

### Backend - API

- **파일**: `server/app/api/v1/endpoints/analysis.py`
  - `AnalysisRequest` 모델에 `exclude_patterns` 필드 추가.
  - `/analyze` 및 `/analyze/upload` 엔드포인트에서 `exclude_patterns`를 받아 `source_options` 딕셔너리에 포함시킴.

### Backend - Logic

- **파일**: `server/csa/services/java_analysis/project.py`
  - `_collect_java_files_with_csaignore` 함수가 `exclude_patterns` 인자를 받도록 수정.
  - `parse_java_project_streaming` 및 `parse_java_project_full` 함수에서 `source_options['exclude_patterns']`를 추출하여 파일 수집 함수에 전달하도록 수정.
- **파일**: `server/csa/services/analysis/java_pipeline.py`
  - 배치 분석 모드(`_analyze_with_batch`)에서도 `source_options`를 `parse_java_project_full`로 전달하도록 파이프라인 연결.
- **파일**: `server/csa/utils/csaignore.py`
  - `CSAIgnoreFilter` 클래스와 `load_csaignore_filter` 함수가 `additional_patterns` 인자를 받아, 파일에 정의된 패턴 외에 추가 패턴을 동적으로 병합하여 필터링에 사용하도록 개선.

## 3. 사용법

1. **분석 화면**의 "소스 코드 분석 옵션" 섹션을 확인합니다.
2. **분석 제외 패턴** 입력란에 제외하고 싶은 파일이나 폴더의 패턴을 입력합니다.
    - 예: `*.test.java` (테스트 파일 제외), `**/test/**` (테스트 폴더 제외)
    - 여러 패턴은 줄바꿈으로 구분합니다.
3. **설정 저장** 버튼을 눌러 패턴을 저장할 수 있습니다.
4. **분석 시작** 시 해당 패턴에 매칭되는 파일은 분석 대상에서 제외됩니다.

## 4. 검증 포인트

- UI에서 패턴 입력 및 저장이 정상적으로 동작하는지 확인.
- 입력한 패턴에 해당하는 파일이 분석 결과(로그의 파일 수 등)에서 제외되는지 확인.
- `.csaignore` 파일이 있는 경우, 두 설정이 합쳐져서(OR 조건) 적용되는지 확인.
