import React from 'react';
import Markdown from 'react-markdown';
import remarkGfm from 'remark-gfm';
import { X, Download, Printer } from 'lucide-react';

interface ReportViewerModalProps {
    isOpen: boolean;
    onClose: () => void;
    title: string;
    content: string;
}

const ReportViewerModal: React.FC<ReportViewerModalProps> = ({ isOpen, onClose, title, content }) => {
    if (!isOpen) return null;

    const handleDownload = () => {
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

    const handlePrint = () => {
        // Simple print: open new window with formatted content or just print current window's masked area?
        // Better approach for Markdown print: open a new window, write HTML, and print.
        // But for simplicity, we can try CSS media print styles or use a library.
        // Let's try opening a new window for a clean print.
        const printWindow = window.open('', '_blank');
        if (printWindow) {
            printWindow.document.write(`
                <html>
                    <head>
                        <title>${title}</title>
                        <style>
                            body { font-family: system-ui, -apple-system, sans-serif; padding: 2rem; max-width: 800px; margin: 0 auto; }
                            table { border-collapse: collapse; width: 100%; margin: 1rem 0; }
                            th, td { border: 1px solid #ddd; padding: 8px; text-align: left; }
                            th { background-color: #f5f5f5; }
                            pre { background: #f5f5f5; padding: 1rem; border-radius: 4px; overflow-x: auto; }
                            blockquote { border-left: 4px solid #ddd; margin: 0; padding-left: 1rem; color: #666; }
                            .markdown-body { line-height: 1.6; }
                        </style>
                    </head>
                    <body>
                        <div class="markdown-body" id="content"></div>
                        <script src="https://cdn.jsdelivr.net/npm/marked/marked.min.js"></script>
                        <script>
                            document.getElementById('content').innerHTML = marked.parse(${JSON.stringify(content)});
                            window.onload = () => { window.print(); window.close(); };
                        </script>
                    </body>
                </html>
            `);
            printWindow.document.close();
        }
    };

    return (
        <div className="fixed inset-0 z-50 flex items-center justify-center bg-slate-900/50 backdrop-blur-sm p-4 animate-in fade-in duration-200">
            <div className="bg-white rounded-2xl shadow-2xl w-full max-w-5xl h-[85vh] flex flex-col animate-in zoom-in-95 duration-200">
                {/* Header */}
                <div className="flex items-center justify-between p-4 border-b border-slate-100">
                    <h2 className="text-lg font-bold text-slate-900">{title}</h2>
                    <div className="flex items-center gap-2">
                        <button
                            onClick={handleDownload}
                            className="p-2 text-slate-500 hover:text-indigo-600 hover:bg-indigo-50 rounded-lg transition-colors"
                            title="Save as Markdown"
                        >
                            <Download className="w-5 h-5" />
                        </button>
                        <button
                            onClick={handlePrint}
                            className="p-2 text-slate-500 hover:text-indigo-600 hover:bg-indigo-50 rounded-lg transition-colors"
                            title="Print / Save as PDF"
                        >
                            <Printer className="w-5 h-5" />
                        </button>
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
                    <div className="prose prose-slate prose-headings:font-bold prose-h1:text-2xl prose-h2:text-xl prose-h3:text-lg prose-p:text-slate-600 prose-li:text-slate-600 max-w-none">
                        <Markdown remarkPlugins={[remarkGfm]}>{content}</Markdown>
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
