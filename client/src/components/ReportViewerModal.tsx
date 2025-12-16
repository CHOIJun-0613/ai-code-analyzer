import React, { useRef, useState, useEffect } from 'react';
import Markdown from 'react-markdown';
import remarkGfm from 'remark-gfm';
import { X, Printer, FileSpreadsheet, FileImage, FileText, ChevronLeft, ChevronRight } from 'lucide-react';
import html2canvas from 'html2canvas';
import jsPDF from 'jspdf';
import * as XLSX from 'xlsx';
import { toSvg } from 'html-to-image';
import MermaidDiagram from './MermaidDiagram';

interface ReportViewerModalProps {
    isOpen: boolean;
    onClose: () => void;
    title: string;
    content: string; // Markdown content
    isGrid?: boolean;
    gridData?: {
        headers: string[];
        rows: any[];
        summary?: any;
    };
}

const ReportViewerModal: React.FC<ReportViewerModalProps> = ({ isOpen, onClose, title, content, isGrid, gridData }) => {
    const reportRef = useRef<HTMLDivElement>(null);
    const [renderedContent, setRenderedContent] = useState<string>('');
    const [isRendering, setIsRendering] = useState(false);

    // Grid Pagination State
    const [currentPage, setCurrentPage] = useState(1);
    const ROWS_PER_PAGE = 100;

    const totalPages = gridData ? Math.ceil(gridData.rows.length / ROWS_PER_PAGE) : 0;
    const currentRows = gridData ? gridData.rows.slice((currentPage - 1) * ROWS_PER_PAGE, currentPage * ROWS_PER_PAGE) : [];

    // Reset loop when content changes or modal opens
    useEffect(() => {
        if (!isOpen) {
            setRenderedContent('');
            return;
        }

        if (isGrid) {
            // No time slicing needed for grid, data is already there
            return;
        }

        setRenderedContent('');
        setIsRendering(true);

        const CHUNK_SIZE = 3000; // Adjust chunk size as needed
        let currentIndex = 0;

        const renderNextChunk = () => {
            if (currentIndex >= content.length) {
                setIsRendering(false);
                return;
            }

            // Find a safe break point (newline) approx around chunk size
            let nextIndex = Math.min(currentIndex + CHUNK_SIZE, content.length);
            if (nextIndex < content.length) {
                const lastNewline = content.lastIndexOf('\n', nextIndex);
                if (lastNewline > currentIndex) {
                    nextIndex = lastNewline + 1; // Include the newline
                }
            }

            const chunk = content.slice(currentIndex, nextIndex);
            setRenderedContent(prev => prev + chunk);
            currentIndex = nextIndex;

            // Schedule next chunk
            setTimeout(renderNextChunk, 10);
        };

        // Start rendering loop with a slight delay to allow modal open animation
        const timer = setTimeout(renderNextChunk, 100);
        return () => clearTimeout(timer);

    }, [isOpen, content, isGrid]);

    // Reset page when modal opens or grid data changes
    useEffect(() => {
        if (isOpen) {
            setCurrentPage(1);
        }
    }, [isOpen, gridData]);

    if (!isOpen) return null;

    // --- Export Functions ---

    const handleDownloadMarkdown = () => {
        const blob = new Blob([content], { type: 'text/markdown' });
        const url = URL.createObjectURL(blob);
        const a = document.createElement('a');
        a.href = url;
        a.download = `${title.replace(/\s+/g, '_').toLowerCase()}.md`;
        document.body.appendChild(a);
        a.click();
        document.body.removeChild(a);
        URL.revokeObjectURL(url);
    };

    const handleExportPDF = async () => {
        if (!reportRef.current) return;
        try {
            const element = reportRef.current;
            const canvas = await html2canvas(element, {
                scale: 2,
                logging: false,
                useCORS: true,
                backgroundColor: '#ffffff'
            });
            const imgData = canvas.toDataURL('image/png');

            // PDF A4 size calculation
            const pdf = new jsPDF('p', 'mm', 'a4');
            const pdfWidth = pdf.internal.pageSize.getWidth();
            const pdfHeight = pdf.internal.pageSize.getHeight();

            const imgWidth = pdfWidth;
            const imgHeight = (canvas.height * pdfWidth) / canvas.width;

            let heightLeft = imgHeight;
            let position = 0;

            pdf.addImage(imgData, 'PNG', 0, position, imgWidth, imgHeight);
            heightLeft -= pdfHeight;

            while (heightLeft >= 0) {
                position = heightLeft - imgHeight;
                pdf.addPage();
                pdf.addImage(imgData, 'PNG', 0, position, imgWidth, imgHeight);
                heightLeft -= pdfHeight;
            }

            pdf.save(`${title.replace(/\s+/g, '_')}.pdf`);
        } catch (err) {
            console.error('PDF export failed', err);
            alert('Failed to export PDF');
        }
    };

    const handleExportExcel = () => {
        if (isGrid && gridData) {
            // Export FULL data for Grid mode
            const wb = XLSX.utils.book_new();

            // Create stats sheet if summary exists
            if (gridData.summary) {
                const summaryData = Object.entries(gridData.summary).map(([k, v]) => ({ Metric: k, Value: v }));
                const wsSummary = XLSX.utils.json_to_sheet(summaryData);
                XLSX.utils.book_append_sheet(wb, wsSummary, "Summary");
            }

            // Data Sheet
            // Determine headers order: Priority keys first
            // CRUD Matrix: package_name, class_name
            // Class List: package, name
            const priorityKeys = ['package_name', 'class_name', 'package', 'name', 'logical_name', 'type', 'sub_type'];

            // Collect all unique keys from rows
            let allKeys = new Set<string>();
            gridData.rows.forEach(row => Object.keys(row).forEach(k => allKeys.add(k)));

            // Sort keys: priority keys first (in order), then others (alphabetically or preserved)
            const sortedKeys = Array.from(allKeys).sort((a, b) => {
                const idxA = priorityKeys.indexOf(a);
                const idxB = priorityKeys.indexOf(b);

                if (idxA !== -1 && idxB !== -1) return idxA - idxB;
                if (idxA !== -1) return -1;
                if (idxB !== -1) return 1;
                return a.localeCompare(b);
            });

            const wsData = XLSX.utils.json_to_sheet(gridData.rows, { header: sortedKeys });

            // Freeze Panes
            // xSplit: number of columns to freeze from left
            // ySplit: number of rows to freeze from top
            // Freeze first 2 columns (Package, Class) and first 1 row (Header) if enough columns exist
            if (sortedKeys.length >= 2) {
                wsData['!freeze'] = { xSplit: 2, ySplit: 1, topLeftCell: "C2", activeCell: "A1", state: "frozen" };
            } else {
                wsData['!freeze'] = { xSplit: 0, ySplit: 1, topLeftCell: "A2", activeCell: "A1", state: "frozen" };
            }

            XLSX.utils.book_append_sheet(wb, wsData, "Data");

            XLSX.writeFile(wb, `${title.replace(/\s+/g, '_')}.xlsx`);
            return;
        }

        // Fallback to existing DOM-scraping logic for Markdown mode
        if (!reportRef.current) return;
        const tables = reportRef.current.querySelectorAll('table');
        if (tables.length === 0) {
            alert('No tables found to export to Excel.');
            return;
        }

        const wb = XLSX.utils.book_new();
        tables.forEach((table: HTMLTableElement, index: number) => {
            const ws = XLSX.utils.table_to_sheet(table);
            const sheetName = `Table ${index + 1}`;
            XLSX.utils.book_append_sheet(wb, ws, sheetName);
        });

        XLSX.writeFile(wb, `${title.replace(/\s+/g, '_')}.xlsx`);
    };

    const handleExportSVG = async () => {
        if (!reportRef.current) return;

        try {
            const dataUrl = await toSvg(reportRef.current, { backgroundColor: '#ffffff' });
            const link = document.createElement('a');
            link.download = `${title.replace(/\s+/g, '_')}.svg`;
            link.href = dataUrl;
            link.click();
        } catch (err) {
            console.error('SVG export failed', err);
            alert('Failed to export SVG');
        }
    };

    return (
        <div className="fixed inset-0 z-50 flex items-center justify-center bg-slate-900/50 backdrop-blur-sm p-4 animate-in fade-in duration-200">
            <div className="bg-white rounded-2xl shadow-2xl w-full max-w-6xl h-[90vh] flex flex-col animate-in zoom-in-95 duration-200">
                {/* Header */}
                <div className="flex items-center justify-between p-4 border-b border-slate-100">
                    <h2 className="text-lg font-bold text-slate-900">{title}</h2>
                    <div className="flex items-center gap-1">
                        <button
                            onClick={handleDownloadMarkdown}
                            className="p-2 text-slate-500 hover:text-indigo-600 hover:bg-indigo-50 rounded-lg transition-colors"
                            title="Save as Markdown"
                        >
                            <FileText className="w-5 h-5" />
                        </button>
                        <button
                            onClick={handleExportPDF}
                            className="p-2 text-slate-500 hover:text-red-600 hover:bg-red-50 rounded-lg transition-colors"
                            title="Export to PDF (Current View)"
                        >
                            <Printer className="w-5 h-5" />
                        </button>
                        <button
                            onClick={handleExportExcel}
                            className="p-2 text-slate-500 hover:text-emerald-600 hover:bg-emerald-50 rounded-lg transition-colors"
                            title="Export Tables to Excel"
                        >
                            <FileSpreadsheet className="w-5 h-5" />
                        </button>
                        <button
                            onClick={handleExportSVG}
                            className="p-2 text-slate-500 hover:text-amber-600 hover:bg-amber-50 rounded-lg transition-colors"
                            title="Export as SVG (Current View)"
                        >
                            <FileImage className="w-5 h-5" />
                        </button>
                        <div className="w-px h-6 bg-slate-200 mx-2" />
                        <button
                            onClick={onClose}
                            className="p-2 text-slate-400 hover:text-slate-600 hover:bg-slate-100 rounded-lg transition-colors"
                        >
                            <X className="w-5 h-5" />
                        </button>
                    </div>
                </div>

                {/* Content */}
                <div className="flex-1 overflow-hidden bg-white flex flex-col">
                    {isGrid && gridData ? (
                        <div className="flex-1 flex flex-col overflow-hidden" ref={reportRef}>
                            {/* Summary Stats for Grid */}
                            {gridData.summary && (
                                <div className="p-4 border-b border-slate-100 bg-slate-50 flex gap-6 text-sm overflow-x-auto shrink-0">
                                    {Object.entries(gridData.summary).map(([key, value]) => (
                                        <div key={key} className="flex flex-col">
                                            <span className="text-slate-500 font-medium capitalize">{key.replace(/_/g, ' ')}</span>
                                            <span className="text-slate-900 font-bold">{String(value)}</span>
                                        </div>
                                    ))}
                                </div>
                            )}

                            {/* Data Table */}
                            <div className="flex-1 overflow-auto custom-scrollbar">
                                <table className="w-full text-left border-collapse">
                                    <thead className="bg-slate-50 sticky top-0 z-10 text-xs font-semibold text-slate-500 uppercase tracking-wider shadow-sm">
                                        <tr>
                                            {gridData.headers.map((header, idx) => (
                                                <th key={idx} className="px-6 py-3 border-b border-slate-200 bg-slate-50 whitespace-nowrap">
                                                    {header}
                                                </th>
                                            ))}
                                        </tr>
                                    </thead>
                                    <tbody className="divide-y divide-slate-100">
                                        {currentRows.map((row, rowIdx) => (
                                            <tr key={rowIdx} className="hover:bg-slate-50 transition-colors">
                                                {gridData.headers.map((header, colIdx) => {
                                                    // Simple heuristic map
                                                    let key = header;
                                                    if (header === "Package") key = "package";
                                                    if (header === "Class") key = "class_name";
                                                    if (header === "Class (Physical)") key = "name";
                                                    if (header === "Class (Logical)") key = "logical_name";
                                                    if (header === "Sub-type") key = "type";

                                                    let cellVal = row[key];
                                                    if (cellVal === undefined) cellVal = row[header.toLowerCase()];
                                                    if (cellVal === undefined) cellVal = row[header];

                                                    return (
                                                        <td key={colIdx} className="px-6 py-2 text-sm text-slate-600 border-r border-slate-50 last:border-r-0 whitespace-nowrap max-w-xs truncate" title={String(cellVal)}>
                                                            {cellVal || '-'}
                                                        </td>
                                                    );
                                                })}
                                            </tr>
                                        ))}
                                    </tbody>
                                </table>
                            </div>

                            {/* Pagination */}
                            <div className="p-3 border-t border-slate-200 bg-white flex items-center justify-between shrink-0">
                                <span className="text-sm text-slate-500">
                                    Page {currentPage} of {totalPages} ({gridData.rows.length} items)
                                </span>
                                <div className="flex gap-2">
                                    <button
                                        onClick={() => setCurrentPage(p => Math.max(1, p - 1))}
                                        disabled={currentPage === 1}
                                        className="p-1 rounded-md hover:bg-slate-100 disabled:opacity-50 disabled:cursor-not-allowed"
                                    >
                                        <ChevronLeft className="w-5 h-5 text-slate-600" />
                                    </button>
                                    <button
                                        onClick={() => setCurrentPage(p => Math.min(totalPages, p + 1))}
                                        disabled={currentPage === totalPages}
                                        className="p-1 rounded-md hover:bg-slate-100 disabled:opacity-50 disabled:cursor-not-allowed"
                                    >
                                        <ChevronRight className="w-5 h-5 text-slate-600" />
                                    </button>
                                </div>
                            </div>
                        </div>
                    ) : (
                        // Markdown Mode (Existing logic)
                        <div className="flex-1 overflow-y-auto p-8 bg-white custom-scrollbar">
                            <div ref={reportRef} className="prose prose-slate prose-headings:font-bold prose-h1:text-2xl prose-h2:text-xl prose-h3:text-lg prose-p:text-slate-600 prose-li:text-slate-600 max-w-none bg-white p-4">
                                <Markdown
                                    remarkPlugins={[remarkGfm]}
                                    components={{
                                        code(props) {
                                            const { children, className, node, ...rest } = props;
                                            const match = /language-(\w+)/.exec(className || '');
                                            if (match && match[1] === 'mermaid') {
                                                return <MermaidDiagram definition={String(children).replace(/\n$/, '')} />;
                                            }
                                            return (
                                                <code {...rest} className={className}>
                                                    {children}
                                                </code>
                                            );
                                        }
                                    }}
                                >
                                    {renderedContent}
                                </Markdown>
                                {isRendering && (
                                    <div className="flex justify-center items-center p-4 gap-2">
                                        <div className="w-6 h-6 border-2 border-indigo-600 border-t-transparent rounded-full animate-spin"></div>
                                        <span className="text-slate-500 text-sm">Loading report content...</span>
                                    </div>
                                )}
                            </div>
                        </div>
                    )}
                </div>

                {/* Footer */}
                <div className="p-4 border-t border-slate-100 bg-slate-50 rounded-b-2xl flex justify-end">
                    <button
                        onClick={onClose}
                        className="px-4 py-2 bg-white border border-slate-200 text-slate-600 font-medium rounded-lg hover:bg-slate-50 transition-colors"
                    >
                        Close
                    </button>
                </div>
            </div>
        </div>
    );
};

export default ReportViewerModal;
