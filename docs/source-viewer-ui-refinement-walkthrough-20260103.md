# Source Viewer UI 및 다국어 개선 (Implementation Walkthrough)

요청사항에 따라 Source Viewer 탭의 편의성을 개선했습니다. '전체선택' 및 '복사하기' 버튼의 위치를 조정하고 다국어 지원을 추가했습니다.

## 변경 사항 (Changes)

### Client

#### [MODIFY] [ClassDetails.tsx](file:///d:/workspaces/davis/ai-code-analyzer/client/src/pages/ClassDetails.tsx)

- **버튼 이동**: '전체선택', '복사하기' 버튼을 Source Viewer 내부에서 상단 탭 헤더 영역으로 이동하여 접근성을 높였습니다.
- **다국어 적용**: 하드코딩된 텍스트 대신 `useTranslation` 훅을 사용하여 `t('common.selectAll')`, `t('common.copy')` 등으로 변경했습니다.

#### [MODIFY] [locales/*/translation.json](file:///d:/workspaces/davis/ai-code-analyzer/client/src/locales/ko/translation.json)

- `ko/translation.json`: "전체 선택", "복사하기", "복사됨" 추가.
- `en/translation.json`: "Select All", "Copy", "Copied" 추가.

## 결과 (Results)

### UI & i18n Verification

- [x] **Layout**: 'Source' 탭이 활성화되었을 때만 탭 헤더 우측 상단에 버튼 그룹이 표시됨.
- [x] **Interaction**: '전체선택' 클릭 시 코드 전체 선택, '복사하기' 클릭 시 클립보드 복사 및 "복사됨/Copied" 상태 변경 확인.
- [x] **Korean Mode**:
  - 버튼 텍스트가 "전체 선택", "복사하기"로 올바르게 표시됨.
- [x] **English Mode**:
  - 버튼 텍스트가 "Select All", "Copy"로 올바르게 표시됨.
