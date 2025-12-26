# 분석 옵션 UI 미노출 수정 및 기능 구현 완료

## 개요

이전에 추가했던 '분석 대상' 및 '저장 옵션' UI가 화면에 나타나지 않는 문제를 해결했습니다. 또한 해당 옵션에 대한 다국어(한국어/영어) 처리를 완료했습니다.
추가로, 사용자 요청에 따라 '분석 대상' 및 '저장 옵션' UI 위치를 '소스 코드 분석 옵션' 섹션 최상단으로 이동했으며, 툴팁 표시 문제 수정 및 옵션 순서를 변경했습니다.

## 수정 사항

### 1. UI 노출 및 위치 수정 (`client/src/pages/Analysis.tsx`)

- **문제 원인**: 이전 변경 작업 시 UI 코드가 올바른 위치에 삽입되지 않아 화면에 렌더링되지 않았습니다.
- **해결**: '소스 코드 분석 옵션' 섹션 최상단(헤더 바로 아래)에 분석 대상 및 저장 옵션 UI 코드를 삽입했습니다.
- **툴팁 수정**: '분석 대상(Analysis Target)' 툴팁이 화면 왼쪽에서 잘리는 현상을 방지하기 위해 툴팁 위치를 조정(`position="left-0"`)했습니다.
- **구현된 UI**:
  - **분석 대상 (Analysis Target)** - 순서 변경됨:
    - 라디오 버튼: **전체 분석 (Analyze All)** -> **프로그램만 분석 (Analyze Program Only)** -> **Data base만 분석 (Analyze Database Only)**
    - 기본값: 전체 분석
  - **분석 결과 저장 (Analysis Result Save)**:
    - 라디오 버튼: 삭제 후 저장 / 업데이트 저장
    - 기본값: 삭제 후 저장

### 2. 다국어 지원 추가 (`client/src/locales`)

- **한국어 (`ko`)**:
  - "분석 대상", "프로그램만 분석", "data base만 분석", "전체분석"
  - "분석 결과 저장", "삭제 후 저장", "업데이트 저장"
- **영어 (`en`)**:
  - "Analysis Target", "Analyze Program Only", "Analyze Database Only", "Analyze All"
  - "Analysis Result Save", "Save After Deleting", "Update Save"

## 검증 방법

1. **화면 확인**: 분석 페이지의 '소스 코드 분석 옵션' 영역 최상단에 새로운 라디오 버튼 그룹 2개가 정상적으로 표시되는지 확인합니다.
2. **툴팁 확인**: '분석 대상' 라벨 옆의 ? 아이콘에 마우스를 올렸을 때 툴팁이 잘리지 않고 온전하게 표시되는지 확인합니다.
3. **옵션 순서 확인**: '전체 분석', '프로그램만 분석', 'Data base만 분석' 순서로 배치되어 있는지 확인합니다.
4. **언어 전환**: 언어 설정을 변경하며 한글/영문 텍스트가 올바르게 바뀌는지 확인합니다.
5. **기능 동작**: 옵션 선택 후 분석 실행 시, 이전에 구현된 로직대로 서버에 파라미터가 전송되는지 확인합니다.

## 파일 위치

- `client/src/pages/Analysis.tsx`
- `client/src/locales/ko/translation.json`
- `client/src/locales/en/translation.json`
