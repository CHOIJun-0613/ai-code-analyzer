import React, { useRef, useEffect } from 'react';

interface PromptEditorProps {
    value: string;
    onChange: (value: string) => void;
    readOnly?: boolean;
}

const PromptEditor: React.FC<PromptEditorProps> = ({ value, onChange, readOnly = false }) => {
    const textareaRef = useRef<HTMLTextAreaElement>(null);
    const backdropRef = useRef<HTMLPreElement>(null);
    const lineNumbersRef = useRef<HTMLDivElement>(null);

    const handleScroll = () => {
        if (textareaRef.current) {
            const { scrollTop } = textareaRef.current;
            if (backdropRef.current) backdropRef.current.scrollTop = scrollTop;
            if (lineNumbersRef.current) lineNumbersRef.current.scrollTop = scrollTop;
        }
    };

    // Handle scroll sync from useEffect too, just in case
    useEffect(() => {
        handleScroll();
    }, [value]);

    // Highlight variables: {var_name}
    const renderHighlights = (text: string) => {
        // Split by variable pattern {var}
        const parts = text.split(/(\{.*?\})/g);
        return parts.map((part, index) => {
            if (part.match(/^\{.*\}$/)) {
                return (
                    <span key={index} className="text-red-600 dark:text-red-400 font-bold">
                        {part}
                    </span>
                );
            }
            return part;
        });
    };

    // Generate line numbers
    const lineCount = value.split('\n').length;
    const lineNumbers = Array.from({ length: lineCount }, (_, i) => i + 1);

    // Common text styles for perfect overlay alignment
    // leading-6 (1.5rem = 24px)
    const textStyles = "font-mono text-sm leading-6 p-4 w-full h-full border-0 m-0 break-words whitespace-pre-wrap";

    return (
        <div className="flex h-full w-full bg-white dark:bg-slate-900 overflow-hidden relative">
            {/* Line Numbers */}
            <div
                ref={lineNumbersRef}
                className="w-12 shrink-0 bg-slate-50 dark:bg-slate-950 border-r border-slate-200 dark:border-slate-800 text-right text-slate-400 dark:text-slate-600 font-mono text-sm leading-6 py-4 pr-3 select-none overflow-hidden"
            >
                {lineNumbers.map((num) => (
                    <div key={num}>{num}</div>
                ))}
            </div>

            {/* Editor Area */}
            <div className="flex-1 relative overflow-hidden">
                {/* Backdrop (Renders text and highlights) */}
                <pre
                    ref={backdropRef}
                    className={`absolute inset-0 pointer-events-none text-slate-800 dark:text-slate-200 ${textStyles} overflow-hidden`}
                    aria-hidden="true"
                >
                    {renderHighlights(value)}
                    <br /> {/* Ensure last line is handled correctly */}
                </pre>

                {/* Textarea (Handles input and selection, text is transparent) */}
                <textarea
                    ref={textareaRef}
                    value={value}
                    onChange={(e) => onChange(e.target.value)}
                    onScroll={handleScroll}
                    readOnly={readOnly}
                    spellCheck={false}
                    className={`absolute inset-0 bg-transparent text-transparent caret-slate-900 dark:caret-white resize-none focus:outline-none focus:ring-0 ${textStyles} overflow-auto scrollbar-hide z-10 selection:bg-indigo-500/30 dark:selection:bg-indigo-500/50`}
                    style={{ color: 'transparent' }}
                />
            </div>
        </div>
    );
};

export default PromptEditor;
