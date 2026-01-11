import React, { forwardRef, useImperativeHandle } from 'react';
import Editor from '@monaco-editor/react';
import type { editor } from 'monaco-editor';

interface SourceCodeViewerProps {
    source: string;
}

export interface SourceCodeViewerHandle {
    selectAll: () => void;
    copyToClipboard: () => Promise<void>;
}

const SourceCodeViewer = forwardRef<SourceCodeViewerHandle, SourceCodeViewerProps>(({ source }, ref) => {
    const [editorInstance, setEditorInstance] = React.useState<editor.IStandaloneCodeEditor | null>(null);

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

    // Expose methods to parent via ref
    useImperativeHandle(ref, () => ({
        selectAll: () => {
            if (editorInstance) {
                const model = editorInstance.getModel();
                if (model) {
                    const fullRange = model.getFullModelRange();
                    editorInstance.setSelection(fullRange);
                    editorInstance.focus();
                }
            }
        },
        copyToClipboard: async () => {
            if (editorInstance) {
                const selection = editorInstance.getSelection();
                const model = editorInstance.getModel();
                if (model && selection) {
                    const selectedText = model.getValueInRange(selection);
                    await navigator.clipboard.writeText(selectedText || source);
                } else {
                    await navigator.clipboard.writeText(source);
                }
            }
        }
    }));

    const handleEditorMount = (editor: editor.IStandaloneCodeEditor) => {
        setEditorInstance(editor);
    };

    return (
        <div className="bg-white dark:bg-[#1e1e1e] rounded-xl overflow-hidden border border-slate-200 dark:border-slate-900/10 shadow-inner h-[600px]">
            <Editor
                height="100%"
                defaultLanguage="java"
                value={source}
                theme={isDark ? 'vs-dark' : 'light'}
                onMount={handleEditorMount}
                options={{
                    fontFamily: 'Pretendard, Consolas, Monaco, "Courier New", monospace',
                    fontSize: 14,
                    lineHeight: 1.6,
                    minimap: { enabled: false },
                    scrollBeyondLastLine: false,
                    wordWrap: 'off',
                    lineNumbers: 'on',
                    renderLineHighlight: 'all',
                    scrollbar: {
                        vertical: 'visible',
                        horizontal: 'visible',
                        verticalScrollbarSize: 12,
                        horizontalScrollbarSize: 12,
                    },
                    automaticLayout: true,
                    readOnly: true,
                    cursorStyle: 'line',
                    cursorBlinking: 'smooth',
                    smoothScrolling: true,
                    bracketPairColorization: { enabled: true },
                    contextmenu: true,
                    selectionHighlight: true,
                    occurrencesHighlight: true,
                }}
            />
        </div>
    );
});

SourceCodeViewer.displayName = 'SourceCodeViewer';

export default SourceCodeViewer;
