import React, { useEffect, useRef, useState } from 'react';
import mermaid from 'mermaid';
import { ZoomIn, ZoomOut, RotateCcw } from 'lucide-react';

interface MermaidDiagramProps {
    definition: string;
}

const MermaidDiagram: React.FC<MermaidDiagramProps> = ({ definition }) => {
    const containerRef = useRef<HTMLDivElement>(null);
    const [svgContent, setSvgContent] = useState<string>('');
    const [id] = useState(() => `mermaid-${Math.random().toString(36).substr(2, 9)}`);

    const [zoom, setZoom] = useState(1);

    useEffect(() => {
        console.log("MermaidDiagram received definition:", definition);
        setZoom(1);
    }, [definition]);

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

    const [isDragging, setIsDragging] = useState(false);
    const [startX, setStartX] = useState(0);
    const [startY, setStartY] = useState(0);
    const [scrollLeft, setScrollLeft] = useState(0);
    const [scrollTop, setScrollTop] = useState(0);

    const handleMouseDown = (e: React.MouseEvent) => {
        if (!containerRef.current) return;
        // Only trigger on left click
        if (e.button !== 0) return;

        setIsDragging(true);
        setStartX(e.pageX - containerRef.current.parentElement!.offsetLeft);
        setStartY(e.pageY - containerRef.current.parentElement!.offsetTop);
        setScrollLeft(containerRef.current.parentElement!.scrollLeft);
        setScrollTop(containerRef.current.parentElement!.scrollTop);
    };

    const handleMouseMove = (e: React.MouseEvent) => {
        if (!isDragging || !containerRef.current) return;
        e.preventDefault();

        const x = e.pageX - containerRef.current.parentElement!.offsetLeft;
        const y = e.pageY - containerRef.current.parentElement!.offsetTop;
        const walkX = (x - startX);
        const walkY = (y - startY);

        containerRef.current.parentElement!.scrollLeft = scrollLeft - walkX;
        containerRef.current.parentElement!.scrollTop = scrollTop - walkY;
    };

    const handleMouseUp = () => {
        setIsDragging(false);
    };

    const handleMouseLeave = () => {
        setIsDragging(false);
    };

    return (
        <div className="relative group border border-slate-100 dark:border-slate-800 rounded-lg bg-slate-50 dark:bg-slate-900/50 my-4">
            {/* Zoom Controls */}
            <div className="absolute top-2 right-2 flex items-center gap-1 bg-white/90 dark:bg-slate-800/90 backdrop-blur shadow-sm border border-slate-200 dark:border-slate-700 rounded-lg p-1 opacity-0 group-hover:opacity-100 transition-opacity z-10">
                <span className="text-xs font-mono text-slate-500 dark:text-slate-400 px-2 min-w-[3rem] text-center select-none">
                    {Math.round(zoom * 100)}%
                </span>
                <div className="w-px h-4 bg-slate-200 dark:bg-slate-700 mx-1" />
                <button
                    onClick={(e) => { e.stopPropagation(); setZoom(z => Math.min(z + 0.5, 20)); }}
                    className="p-1.5 hover:bg-slate-100 dark:hover:bg-slate-700 rounded-md text-slate-500 dark:text-slate-400"
                    title="Zoom In"
                >
                    <ZoomIn className="w-4 h-4" />
                </button>
                <button
                    onClick={(e) => { e.stopPropagation(); setZoom(z => Math.max(z - 0.5, 0.2)); }}
                    className="p-1.5 hover:bg-slate-100 dark:hover:bg-slate-700 rounded-md text-slate-500 dark:text-slate-400"
                    title="Zoom Out"
                >
                    <ZoomOut className="w-4 h-4" />
                </button>
                <button
                    onClick={(e) => { e.stopPropagation(); setZoom(1); }}
                    className="p-1.5 hover:bg-slate-100 dark:hover:bg-slate-700 rounded-md text-slate-500 dark:text-slate-400"
                    title="Reset Zoom"
                >
                    <RotateCcw className="w-4 h-4" />
                </button>
            </div>

            {/* Diagram Container */}
            <div
                className={`overflow-auto custom-scrollbar p-4 bg-white dark:bg-white text-left ${isDragging ? 'cursor-grabbing select-none' : 'cursor-grab'}`}
                style={{ maxHeight: '80vh', minHeight: '200px' }}
                onMouseDown={handleMouseDown}
                onMouseMove={handleMouseMove}
                onMouseUp={handleMouseUp}
                onMouseLeave={handleMouseLeave}
            >
                <style>{`
                    .mermaid-diagram svg {
                        width: 100% !important;
                        max-width: none !important;
                        height: auto !important;
                    }
                `}</style>
                {svgContent ? (
                    <div
                        ref={containerRef}
                        className="mermaid-diagram inline-block origin-top-left pointer-events-none" // pointer-events-none ensures clicks pass through to container for dragging
                        style={{
                            width: `${zoom * 100}%`
                        }}
                        dangerouslySetInnerHTML={{ __html: svgContent }}
                    />
                ) : (
                    <div className="flex items-center justify-center h-full text-slate-400">
                        Rendering diagram...
                    </div>
                )}
            </div>
        </div>
    );
};

export default MermaidDiagram;
