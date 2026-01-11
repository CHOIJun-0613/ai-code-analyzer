import React from 'react';
import Editor from '@monaco-editor/react';

interface PromptEditorProps {
    value: string;
    onChange: (value: string) => void;
    readOnly?: boolean;
}

const PromptEditor: React.FC<PromptEditorProps> = ({ value, onChange, readOnly = false }) => {
    // Dark 모드 감지
    const [isDark, setIsDark] = React.useState(
        document.documentElement.classList.contains('dark')
    );

    React.useEffect(() => {
        // MutationObserver로 dark 클래스 변경 감지
        const observer = new MutationObserver(() => {
            setIsDark(document.documentElement.classList.contains('dark'));
        });

        observer.observe(document.documentElement, {
            attributes: true,
            attributeFilter: ['class']
        });

        return () => observer.disconnect();
    }, []);

    return (
        <div className="h-full w-full">
            <Editor
                height="100%"
                defaultLanguage="markdown"
                value={value}
                onChange={(value) => onChange(value || '')}
                theme={isDark ? 'vs-dark' : 'light'}
                options={{
                    fontFamily: 'Pretendard, Consolas, Monaco, "Courier New", monospace',
                    fontSize: 15,
                    lineHeight: 1.8,
                    minimap: { enabled: false },
                    scrollBeyondLastLine: false,
                    wordWrap: 'on',
                    lineNumbers: 'on',
                    renderLineHighlight: 'all',
                    scrollbar: {
                        vertical: 'visible',
                        horizontal: 'visible',
                        verticalScrollbarSize: 12,
                        horizontalScrollbarSize: 12,
                    },
                    automaticLayout: true,
                    padding: { top: 12, bottom: 12 },
                    cursorBlinking: 'smooth',
                    cursorSmoothCaretAnimation: 'on',
                    smoothScrolling: true,
                    bracketPairColorization: { enabled: true },
                    readOnly: readOnly,
                }}
            />
        </div>
    );
};

export default PromptEditor;
