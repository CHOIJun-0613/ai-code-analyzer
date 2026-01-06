import React, { useEffect, useRef, useState } from 'react';
import { useTranslation } from 'react-i18next';
import mermaid from 'mermaid';
import { ZoomIn, ZoomOut, RotateCcw } from 'lucide-react';

interface MermaidDiagramProps {
    definition: string;
    initialZoom?: number; // Optional: manually set initial zoom
}

/**
 * Calculate diagram complexity based on node count
 * @param definition - Mermaid diagram definition
 * @returns complexity level: 'simple' | 'medium' | 'complex'
 */
const calculateComplexity = (definition: string): 'simple' | 'medium' | 'complex' => {
    if (!definition || definition.trim() === '') return 'medium';

    // Comprehensive node detection
    // Flowchart: A[text], B(text), C{text}, D([text]), E>text], F{{text}}, etc.
    // Sequence: participant, actor, etc.
    const nodePatterns = [
        /\b[A-Za-z0-9_]+\s*[\[\(\{][^\]]*[\]\)\}]/g,  // A[text], B(text), C{text}
        /participant\s+[A-Za-z0-9_]+/gi,              // participant A
        /actor\s+[A-Za-z0-9_]+/gi,                    // actor A
    ];

    let nodeCount = 0;
    nodePatterns.forEach(pattern => {
        const matches = definition.match(pattern);
        if (matches) nodeCount += matches.length;
    });

    // Debug log (can be removed in production)
    if (process.env.NODE_ENV === 'development') {
        console.log('[MermaidDiagram] Complexity calculation (node-based):', {
            nodeCount,
            complexity: nodeCount <= 10 ? '하 (30%)' : nodeCount < 30 ? '중 (100%)' : '상 (200%)',
            firstLine: definition.split('\n')[0]
        });
    }

    // Node-based complexity thresholds:
    // 하 (simple): 노드 10개 이내 → 30% zoom
    if (nodeCount <= 10) return 'simple';

    // 상 (complex): 노드 30개 이상 → 200% zoom
    if (nodeCount >= 30) return 'complex';

    // 중 (medium): 노드 11~29개 → 100% zoom
    return 'medium';
};

/**
 * Get initial zoom level based on complexity (node count)
 * 하(10개 이내): 30%, 중(11~29개): 100%, 상(30개 이상): 200%
 */
const getInitialZoom = (complexity: 'simple' | 'medium' | 'complex'): number => {
    switch (complexity) {
        case 'simple': return 0.3;   // 30% - 노드 10개 이내
        case 'medium': return 1.0;   // 100% - 노드 11~29개
        case 'complex': return 2.0;  // 200% - 노드 30개 이상
    }
};

const MermaidDiagram: React.FC<MermaidDiagramProps> = ({ definition, initialZoom }) => {
    const { t } = useTranslation();
    const containerRef = useRef<HTMLDivElement>(null);
    const [svgContent, setSvgContent] = useState<string>('');
    const [id] = useState(() => `mermaid-${Math.random().toString(36).substr(2, 9)}`);

    // Calculate initial zoom based on diagram complexity (if not manually specified)
    const calculatedZoom = React.useMemo(() => {
        if (initialZoom !== undefined) return initialZoom;
        const complexity = calculateComplexity(definition);
        return getInitialZoom(complexity);
    }, [definition, initialZoom]);

    const [zoom, setZoom] = useState(calculatedZoom);

    // Reset zoom to calculated value when definition changes
    useEffect(() => {
        setZoom(calculatedZoom);
    }, [calculatedZoom]);

    useEffect(() => {
        let mounted = true;
        const renderDiagram = async () => {
            if (!definition) return;

            try {
                // Give a small tick for DOM to ready
                await new Promise(resolve => setTimeout(resolve, 0));

                if (!mounted) return;

                // Detect dark mode from document root class
                const isDarkMode = document.documentElement.classList.contains('dark');

                mermaid.initialize({
                    startOnLoad: false,
                    theme: isDarkMode ? 'dark' : 'default',
                    securityLevel: 'loose',
                    logLevel: 'error',
                });

                const graphId = `${id}-svg`;
                const existingElement = document.getElementById(graphId);
                if (existingElement) existingElement.remove();

                const { svg } = await mermaid.render(graphId, definition);

                if (mounted) {
                    setSvgContent(svg);
                    // No complex smart zoom logic anymore.
                    // Initial zoom is handled by the state default and the useEffect reset above.
                }
            } catch (error) {
                console.error("Mermaid rendering failed:", error);
                if (mounted) {
                    setSvgContent(`<div class="p-4 bg-red-50 text-red-600 rounded border border-red-200">
                        <p class="font-bold text-sm">Diagram API Error</p>
                        <pre class="mt-2 text-xs overflow-auto">${error instanceof Error ? error.message : String(error)}</pre>
                    </div>`);
                }
            }
        };

        renderDiagram();

        return () => {
            mounted = false;
        };
    }, [definition, id]);

    // --- Drag & Drop Logic ---
    const [isDragging, setIsDragging] = useState(false);
    const [startX, setStartX] = useState(0);
    const [startY, setStartY] = useState(0);
    const [scrollLeft, setScrollLeft] = useState(0);
    const [scrollTop, setScrollTop] = useState(0);

    const handleMouseDown = (e: React.MouseEvent) => {
        if (!containerRef.current) return;
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
                    onClick={(e) => { e.stopPropagation(); setZoom(z => Math.min(z + 0.1, 5)); }}
                    className="p-1.5 hover:bg-slate-100 dark:hover:bg-slate-700 rounded-md text-slate-500 dark:text-slate-400"
                    title={t('diagram.zoomIn')}
                >
                    <ZoomIn className="w-4 h-4" />
                </button>
                <button
                    onClick={(e) => { e.stopPropagation(); setZoom(z => Math.max(z - 0.1, 0.1)); }}
                    className="p-1.5 hover:bg-slate-100 dark:hover:bg-slate-700 rounded-md text-slate-500 dark:text-slate-400"
                    title={t('diagram.zoomOut')}
                >
                    <ZoomOut className="w-4 h-4" />
                </button>
                <button
                    onClick={(e) => { e.stopPropagation(); setZoom(1); }}
                    className="p-1.5 hover:bg-slate-100 dark:hover:bg-slate-700 rounded-md text-slate-500 dark:text-slate-400"
                    title={t('diagram.resetZoom')}
                >
                    <RotateCcw className="w-4 h-4" />
                </button>
            </div>

            {/* Diagram Container */}
            <div
                className={`overflow-auto custom-scrollbar p-4 bg-white dark:bg-[#1e1e1e] text-left ${isDragging ? 'cursor-grabbing select-none' : 'cursor-grab'}`}
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
                        className="mermaid-diagram inline-block origin-top-left pointer-events-none"
                        style={{
                            width: `${zoom * 100}%`
                        }}
                        dangerouslySetInnerHTML={{ __html: svgContent }}
                    />
                ) : (
                    <div className="flex items-center justify-center h-full text-slate-400 dark:text-slate-500">
                        {t('diagram.rendering')}
                    </div>
                )}
            </div>
        </div>
    );
};

export default MermaidDiagram;
