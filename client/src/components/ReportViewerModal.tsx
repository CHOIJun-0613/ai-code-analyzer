import React, { useRef } from 'react';
import Markdown from 'react-markdown';
import remarkGfm from 'remark-gfm';
import { X, Printer, FileSpreadsheet, FileImage, FileText } from 'lucide-react';
import html2canvas from 'html2canvas';
import jsPDF from 'jspdf';
import * as XLSX from 'xlsx';
import { toSvg } from 'html-to-image';
import MermaidDiagram from './MermaidDiagram';

interface ReportViewerModalProps {
    isOpen: boolean;
    onClose: () => void;
    title: string;
    content: string;
}

const ReportViewerModal: React.FC<ReportViewerModalProps> = ({ isOpen, onClose, title, content }) => {
    const reportRef = useRef<HTMLDivElement>(null);

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
        // Extract tables from markdown content via HTML
        // This is a heuristic: we look for <table> elements in the rendered content
        if (!reportRef.current) return;

        const tables = reportRef.current.querySelectorAll('table');
        if (tables.length === 0) {
            alert('No tables found to export to Excel.');
            return;
        }

        const wb = XLSX.utils.book_new();

        tables.forEach((table, index) => {
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
            <div className="bg-white rounded-2xl shadow-2xl w-full max-w-5xl h-[85vh] flex flex-col animate-in zoom-in-95 duration-200">
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
                            title="Export to PDF"
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
                            title="Export as SVG"
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
                            {content}
                        </Markdown>
                    </div>
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

