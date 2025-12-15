import React, { useEffect, useRef, useState } from 'react';
import mermaid from 'mermaid';

interface MermaidDiagramProps {
    definition: string;
}

const MermaidDiagram: React.FC<MermaidDiagramProps> = ({ definition }) => {
    const containerRef = useRef<HTMLDivElement>(null);
    const [svgContent, setSvgContent] = useState<string>('');
    const [id] = useState(() => `mermaid-${Math.random().toString(36).substr(2, 9)}`);

    useEffect(() => {
        const renderDiagram = async () => {
            if (!definition) return;

            try {
                mermaid.initialize({
                    startOnLoad: false,
                    theme: 'default',
                    securityLevel: 'loose',
                });

                const { svg } = await mermaid.render(id, definition);
                setSvgContent(svg);
            } catch (error) {
                console.error("Mermaid rendering failed:", error);
                setSvgContent(`<div class="p-4 bg-red-50 text-red-600 rounded border border-red-200">
                    Failed to render diagram. Syntax error likely.
                    <pre class="mt-2 text-xs overflow-auto">${error}</pre>
                </div>`);
            }
        };

        renderDiagram();
    }, [definition, id]);

    return (
        <div
            ref={containerRef}
            className="mermaid-diagram my-4 flex justify-center overflow-x-auto"
            dangerouslySetInnerHTML={{ __html: svgContent }}
        />
    );
};

export default MermaidDiagram;
