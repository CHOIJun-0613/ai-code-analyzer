# Source Viewer 라이트/다크 모드 스타일 구현 (Implementation Walkthrough)

Source Viewer 영역이 Dark Mode 색상으로 고정되어 있던 문제를 해결하고, 테마에 따라 적절한 색상으로 자동 변경되도록 수정했습니다.

## 변경 사항 (Changes)

### Client

#### [MODIFY] [ClassDetails.tsx](file:///d:/workspaces/davis/ai-code-analyzer/client/src/pages/ClassDetails.tsx)

- Source Viewer의 컨테이너, 라인 넘버 영역, 코드 영역의 배경색과 텍스트 색상을 `dark:` modifier를 사용하여 동적으로 처리하도록 수정했습니다.
- `transition-colors` 클래스를 추가하여 테마 변경 시 색상이 부드럽게 전환되도록 개선했습니다.

```tsx
// 변경된 코드 일부
<div className="bg-white dark:bg-[#1e1e1e] ... border-slate-200 dark:border-slate-900/10 ... transition-colors duration-300">
    <div className="... bg-slate-50 dark:bg-[#1e1e1e] ... text-slate-400 dark:text-[#6e7681] ...">
        {/* Line Numbers */}
    </div>
    <div className="... bg-white dark:bg-[#1e1e1e] ...">
        <pre className="... text-slate-800 dark:text-[#d4d4d4] ...">
            {/* Source Code */}
        </pre>
    </div>
</div>
```

## 결과 (Results)

### Style Verification

- [x] **Light Mode**:
  - **배경**: 흰색(`bg-white`), 라인 넘버 영역 밝은 회색(`bg-slate-50`).
  - **텍스트**: 소스 코드 짙은 회색(`text-slate-800`), 라인 넘버 연한 회색(`text-slate-400`).
  - **테두리**: 밝은 회색(`border-slate-200`)으로 영역 구분 명확화.
- [x] **Dark Mode**:
  - **배경**: 짙은 회색(`bg-[#1e1e1e]`), VS Code Dark Modern 테마와 유사.
  - **텍스트**: 소스 코드 밝은 회색(`text-[#d4d4d4]`), 라인 넘버 어두운 회색(`text-[#6e7681]`).
  - **테두리**: 어두운 톤(`border-slate-900/10`)으로 자연스러운 경계 처리.
