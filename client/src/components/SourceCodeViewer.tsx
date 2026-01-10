import React, { useMemo, forwardRef } from 'react';

interface SourceCodeViewerProps {
    source: string;
}

const SourceCodeViewer = forwardRef<HTMLPreElement, SourceCodeViewerProps>(({ source }, ref) => {

    const highlightedCode = useMemo(() => {
        if (!source) return null;

        const tokens: React.ReactNode[] = [];
        const regex = /(\/\/.*$|\/\*[\s\S]*?\*\/|"[^"]*"|'[^']*'|\b(?:abstract|assert|boolean|break|byte|case|catch|char|class|const|continue|default|do|double|else|enum|extends|final|finally|float|for|goto|if|implements|import|instanceof|int|interface|long|native|new|package|private|protected|public|return|short|static|strictfp|super|switch|synchronized|this|throw|throws|transient|try|void|volatile|while|true|false|null)\b|@\w+)/gm;

        let lastIndex = 0;
        let match;

        while ((match = regex.exec(source)) !== null) {
            // Push text before the match
            if (match.index > lastIndex) {
                tokens.push(source.slice(lastIndex, match.index));
            }

            const token = match[0];
            let className = '';

            if (token.startsWith('//') || token.startsWith('/*')) {
                className = 'text-slate-400 dark:text-slate-500 italic'; // Comment
            } else if (token.startsWith('"') || token.startsWith("'")) {
                className = 'text-green-600 dark:text-green-400'; // String
            } else if (token.startsWith('@')) {
                className = 'text-yellow-600 dark:text-yellow-400'; // Annotation
            } else {
                // Keywords
                className = 'text-purple-600 dark:text-purple-400 font-bold';
            }

            tokens.push(
                <span key={match.index} className={className}>
                    {token}
                </span>
            );

            lastIndex = regex.lastIndex;
        }

        // Push remaining text
        if (lastIndex < source.length) {
            tokens.push(source.slice(lastIndex));
        }

        return tokens;
    }, [source]);

    const lines = useMemo(() => source ? source.split('\n') : [], [source]);

    return (
        <div className="bg-white dark:bg-[#1e1e1e] rounded-xl overflow-hidden text-sm border border-slate-200 dark:border-slate-900/10 shadow-inner h-[600px] flex font-mono transition-colors duration-300">
            <div className="overflow-auto w-full h-full flex">
                {/* Line Numbers */}
                <div className="flex-none min-h-full bg-slate-50 dark:bg-[#1e1e1e] border-r border-slate-200 dark:border-[#333] flex flex-col text-right py-4 pr-3 pl-4 select-none text-slate-400 dark:text-[#6e7681] sticky left-0 z-10 transition-colors duration-300">
                    {lines.map((_, i) => (
                        <span key={i} className="leading-6">{i + 1}</span>
                    ))}
                </div>
                {/* Code Content */}
                <div className="flex-1 min-h-full min-w-0 bg-white dark:bg-[#1e1e1e] transition-colors duration-300">
                    <pre ref={ref} className="m-0 p-4 leading-6 whitespace-pre text-slate-800 dark:text-[#d4d4d4] font-mono font-medium">
                        {highlightedCode || source}
                    </pre>
                </div>
            </div>
        </div>
    );
});

SourceCodeViewer.displayName = 'SourceCodeViewer';

export default SourceCodeViewer;
