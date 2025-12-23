import React, { useRef, useState, useEffect } from 'react';
import { useParams, useSearchParams, useNavigate } from 'react-router-dom';
import ReportViewerModal from '../components/ReportViewerModal';
import {
    ArrowLeft, Code2, FileCode, Braces,
    AlignLeft, Cpu, Database, GitBranch, Info,
    Copy, Check, MousePointerClick, BookOpen, FileText, Activity, Workflow
} from 'lucide-react';
import Markdown from 'react-markdown';
import remarkGfm from 'remark-gfm';
import axios from '../api/client';

interface Field {
    name: string;
    type: string;
    description?: string;
    initial_value?: string;
    modifiers_json?: string;
}

interface Method {
    name: string;
    logical_name?: string;
    return_type: string;
    parameters?: string; // JSON string
    description?: string;
    PLOC?: number;
    cognitive_complexity?: number;
    visibility?: string;
}

interface ClassData {
    name: string;
    package_name: string;
    updated_at?: string;
    logical_name?: string;
    type: string;
    sub_type?: string;
    description?: string;
    ai_description?: string;
    source?: string;
    superclass?: string;
    interfaces?: string[];
    annotations?: string[];
    extension?: string;
    PLOC?: number;
    LLOC?: number;
    CLOC?: number;
    code_complexity?: number;
    fields: Field[];
    methods: Method[];
}

const ClassDetails: React.FC = () => {
    const { projectName, className } = useParams<{ projectName: string; className: string }>();
    const [searchParams] = useSearchParams();
    const packageName = searchParams.get('package');
    const navigate = useNavigate();

    const [classData, setClassData] = useState<ClassData | null>(null);
    const [isLoading, setIsLoading] = useState(true);

    const [error, setError] = useState<string | null>(null);
    const [activeTab, setActiveTab] = useState<'info' | 'source' | 'methods' | 'fields'>('info');
    const [isCopied, setIsCopied] = useState(false);
    const codeRef = useRef<HTMLPreElement>(null);

    // Reports State
    const [reportModal, setReportModal] = useState<{
        isOpen: boolean;
        title: string;
        content: string;
        isLoading: boolean;
    }>({
        isOpen: false,
        title: '',
        content: '',
        isLoading: false
    });

    // Action Menu State
    const [showReportMenu, setShowReportMenu] = useState(false);
    const reportMenuRef = useRef<HTMLDivElement>(null);

    useEffect(() => {
        function handleClickOutside(event: MouseEvent) {
            if (reportMenuRef.current && !reportMenuRef.current.contains(event.target as Node)) {
                setShowReportMenu(false);
            }
        }
        document.addEventListener("mousedown", handleClickOutside);
        return () => {
            document.removeEventListener("mousedown", handleClickOutside);
        };
    }, []);

    const handleGenerateReport = async (type: 'spec' | 'sequence' | 'impact') => {
        setReportModal({ isOpen: true, title: 'Generating Report...', content: '', isLoading: true });
        setShowReportMenu(false);
        try {
            const response = await axios.get(`/projects/${projectName}/classes/${className}/reports/${type}`);
            let title = '';
            switch (type) {
                case 'spec': title = 'Class Specification'; break;
                case 'sequence': title = 'Sequence Diagram'; break;
                case 'impact': title = 'Impact Analysis'; break;
            }
            setReportModal({
                isOpen: true,
                title,
                content: response.data.content,
                isLoading: false
            });
        } catch (error) {
            console.error("Failed to generate report", error);
            setReportModal({
                isOpen: true,
                title: 'Error',
                content: '# Error\nFailed to generate report.',
                isLoading: false
            });
        }
    };

    const handleCopySource = async () => {
        if (!classData?.source) return;
        try {
            await navigator.clipboard.writeText(classData.source);
            setIsCopied(true);
            setTimeout(() => setIsCopied(false), 2000);
        } catch (err) {
            console.error('Failed to copy text: ', err);
        }
    };

    const handleSelectAll = () => {
        if (!codeRef.current) return;

        const range = document.createRange();
        range.selectNodeContents(codeRef.current);
        const selection = window.getSelection();
        if (selection) {
            selection.removeAllRanges();
            selection.addRange(range);
        }
    };

    useEffect(() => {
        const fetchClassDetails = async () => {
            if (!projectName || !className || !packageName) return;
            setIsLoading(true);
            try {
                const { data } = await axios.get(`/projects/${projectName}/classes/${className}`, {
                    params: { package: packageName }
                });
                setClassData(data);
            } catch (err) {
                console.error("Failed to fetch class details", err);
                setError("Failed to load class details.");
            } finally {
                setIsLoading(false);
            }
        };

        fetchClassDetails();
    }, [projectName, className, packageName]);

    if (isLoading) {
        return (
            <div className="flex items-center justify-center h-screen bg-slate-50">
                <div className="w-12 h-12 border-4 border-indigo-500 border-t-transparent rounded-full animate-spin" />
            </div>
        );
    }

    if (error || !classData) {
        return (
            <div className="p-8 text-center text-slate-500">
                <h2 className="text-xl font-bold mb-2">Class not found</h2>
                <p className="mb-4">{error || "Could not retrieve class details."}</p>
                <button
                    onClick={() => navigate(-1)}
                    className="px-4 py-2 bg-indigo-600 text-white rounded-lg hover:bg-indigo-700 transition-colors"
                >
                    Go Back
                </button>
            </div>
        );
    }

    const blankLines = (classData.PLOC || 0) - ((classData.LLOC || 0) + (classData.CLOC || 0));

    return (
        <div className="space-y-6 animate-in fade-in duration-500 pb-12">
            {/* Header */}
            <div>
                <div className="flex items-center justify-between mb-2">
                    <button
                        onClick={() => navigate(`/projects/${projectName}`)}
                        className="flex items-center text-slate-500 dark:text-slate-400 hover:text-indigo-600 dark:hover:text-indigo-400 transition-colors group"
                    >
                        <ArrowLeft className="w-4 h-4 mr-1 group-hover:-translate-x-1 transition-transform" />
                        Back to Project
                    </button>

                    <div className="relative" ref={reportMenuRef}>
                        <button
                            onClick={() => setShowReportMenu(!showReportMenu)}
                            className="flex items-center gap-2 px-3 py-1.5 bg-white border border-slate-200 text-slate-600 text-sm font-medium rounded-lg hover:bg-slate-50 transition-colors shadow-sm"
                        >
                            <BookOpen className="w-4 h-4" />
                            Reports
                        </button>

                        {showReportMenu && (
                            <div className="absolute right-0 mt-2 w-56 bg-white rounded-xl shadow-lg border border-slate-100 z-20 py-2 animate-in fade-in zoom-in-95 duration-200">
                                <button
                                    onClick={() => handleGenerateReport('spec')}
                                    className="w-full text-left px-4 py-2 text-sm text-slate-700 hover:bg-indigo-50 hover:text-indigo-600 flex items-center gap-2"
                                >
                                    <FileText className="w-4 h-4" />
                                    Class Specification
                                </button>
                                <button
                                    onClick={() => handleGenerateReport('sequence')}
                                    className="w-full text-left px-4 py-2 text-sm text-slate-700 hover:bg-indigo-50 hover:text-indigo-600 flex items-center gap-2"
                                >
                                    <Activity className="w-4 h-4" />
                                    Sequence Diagram
                                </button>
                                <button
                                    onClick={() => handleGenerateReport('impact')}
                                    className="w-full text-left px-4 py-2 text-sm text-slate-700 hover:bg-indigo-50 hover:text-indigo-600 flex items-center gap-2"
                                >
                                    <Workflow className="w-4 h-4" />
                                    Impact Analysis
                                </button>
                            </div>
                        )}
                    </div>
                </div>
                <div className="flex items-center gap-4">
                    <div className={`p-3 rounded-xl ${classData.type === 'interface' ? 'bg-amber-50 text-amber-600' : 'bg-indigo-50 text-indigo-600'}`}>
                        {classData.type === 'interface' ? <FileCode className="w-8 h-8" /> : <Code2 className="w-8 h-8" />}
                    </div>
                    <div className="flex-1">
                        <p className="text-slate-500 dark:text-slate-400 font-mono text-sm mb-1">{classData.package_name}</p>
                        <div className="flex items-center justify-between">
                            <div className="flex items-center gap-3">
                                <h1 className="text-3xl font-bold text-slate-900 dark:text-white">
                                    {classData.name}
                                    {classData.extension ? (classData.extension.startsWith('.') ? classData.extension : `.${classData.extension}`) : ''}
                                </h1>
                                <span className={`px-2 py-0.5 rounded text-xs font-bold uppercase border ${classData.type === 'interface' ? 'bg-amber-100 text-amber-900 border-amber-200' : 'bg-indigo-100 text-indigo-900 border-indigo-200'}`}>
                                    {classData.type}
                                </span>
                                {classData.sub_type && (
                                    <span className="px-2 py-0.5 rounded text-xs font-bold bg-slate-100 text-slate-700 border border-slate-200 uppercase">
                                        {classData.sub_type}
                                    </span>
                                )}
                            </div>
                            {classData.updated_at && (
                                <span className="text-sm text-slate-400 font-mono">
                                    Last Updated: {new Date(classData.updated_at).toLocaleString()}
                                </span>
                            )}
                        </div>
                        {/* Logical Name */}
                        {classData.logical_name && (
                            <p className="text-slate-600 dark:text-slate-300 text-sm mt-1">{classData.logical_name}</p>
                        )}
                    </div>
                </div>
            </div>

            {/* Metrics Cards */}
            <div className="grid grid-cols-1 md:grid-cols-4 gap-4">
                <div className="bg-white p-4 rounded-xl border border-slate-100 shadow-sm">
                    <div className="flex items-center gap-2 mb-2 text-slate-500 text-sm font-medium">
                        <AlignLeft className="w-4 h-4" /> Lines of Code
                    </div>
                    <div className="grid grid-cols-2 gap-x-4 gap-y-2">
                        <div className="flex justify-between items-baseline">
                            <span className="text-xs text-slate-500">Physical (PLOC)</span>
                            <span className="text-sm font-bold text-slate-900">{classData.PLOC?.toLocaleString() || '-'}</span>
                        </div>
                        <div className="flex justify-between items-baseline">
                            <span className="text-xs text-slate-500">Logical (LLOC)</span>
                            <span className="text-sm font-bold text-slate-900">{classData.LLOC?.toLocaleString() || '-'}</span>
                        </div>
                        <div className="flex justify-between items-baseline">
                            <span className="text-xs text-slate-500">Comment (CLOC)</span>
                            <span className="text-sm font-bold text-slate-900">{classData.CLOC?.toLocaleString() || '-'}</span>
                        </div>
                        <div className="flex justify-between items-baseline">
                            <span className="text-xs text-slate-500">Blank Lines</span>
                            <span className="text-sm font-bold text-slate-900">{Math.max(0, blankLines).toLocaleString()}</span>
                        </div>
                    </div>
                </div>

                {/* Complexity Card with Tooltip */}
                <div className="bg-white p-4 rounded-xl border border-slate-100 shadow-sm relative group overflow-visible">
                    <div className="flex items-center justify-between mb-2">
                        <div className="flex items-center gap-2 text-slate-500 text-sm font-medium">
                            <Cpu className="w-4 h-4" /> Complexity
                        </div>
                        <div className="relative">
                            <Info className="w-4 h-4 text-slate-300 cursor-help hover:text-indigo-500 transition-colors" />
                            {/* Tooltip Popup */}
                            <div className="absolute top-6 left-1/2 -translate-x-1/2 md:left-auto md:translate-x-0 md:right-[-10px] w-80 p-5 bg-white rounded-xl shadow-[0_10px_40px_-10px_rgba(0,0,0,0.2)] border border-slate-200 z-50 hidden group-hover:block animate-in fade-in zoom-in-95 duration-200">
                                <div className="absolute -top-2 right-1.5 w-4 h-4 bg-white border-t border-l border-slate-200 rotate-45"></div>
                                <h5 className="font-bold text-slate-900 mb-2 text-sm flex items-center gap-2">
                                    코드 복잡도 (Weighted Sum)
                                </h5>
                                <p className="text-xs text-slate-600 leading-relaxed mb-3">
                                    코드 구성 요소에 <strong>가중치</strong>를 부여하여 산출한 유지보수 난이도 지표입니다.
                                </p>

                                <div className="space-y-3">
                                    <div className="bg-slate-50 p-3 rounded border border-slate-100">
                                        <div className="text-xs font-semibold text-slate-700 mb-2">산정 기준</div>
                                        <ul className="text-xs text-slate-500 space-y-1 font-mono">
                                            <li className="flex justify-between"><span>Lines</span> <span>× 1</span></li>
                                            <li className="flex justify-between"><span>Fields</span> <span>× 2</span></li>
                                            <li className="flex justify-between"><span>Methods</span> <span>× 5</span></li>
                                            <li className="flex justify-between"><span>Inner Classes</span> <span>× 10</span></li>
                                            <li className="flex justify-between"><span>Annotations</span> <span>× 1</span></li>
                                        </ul>
                                    </div>

                                    <div>
                                        <div className="text-xs font-semibold text-slate-700 mb-1">참고 기준</div>
                                        <div className="grid grid-cols-[60px_1fr] gap-2 text-xs border-t border-slate-100 pt-2">
                                            <div className="font-mono text-emerald-600 font-bold">~ 2k</div>
                                            <div className="text-slate-600">Normal (일반 클래스)</div>

                                            <div className="font-mono text-amber-600 font-bold">~ 5k</div>
                                            <div className="text-slate-600">Large (대형 서비스)</div>

                                            <div className="font-mono text-red-600 font-bold">5k +</div>
                                            <div className="text-slate-600">High (리팩토링 필요)</div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                    {(() => {
                        const score = classData.code_complexity || 0;
                        let colorClass = 'text-slate-900';
                        let label = '';

                        if (score >= 5000) {
                            colorClass = 'text-red-600';
                            label = 'High';
                        } else if (score >= 2000) {
                            colorClass = 'text-amber-600';
                            label = 'Large';
                        } else {
                            colorClass = 'text-emerald-600';
                            label = 'Normal';
                        }

                        return (
                            <div className="flex items-baseline justify-center gap-2">
                                <span className={`text-2xl font-bold ${colorClass}`}>{score.toLocaleString()}</span>
                                <span className={`text-xs font-medium ${colorClass} bg-opacity-10 px-1.5 py-0.5 rounded border border-current`}>
                                    {label}
                                </span>
                            </div>
                        );
                    })()}
                </div>

                <div className="bg-white p-4 rounded-xl border border-slate-100 shadow-sm">
                    <div className="flex items-center gap-2 mb-2 text-slate-500 text-sm font-medium">
                        <Braces className="w-4 h-4" /> Methods
                    </div>
                    <div className="flex justify-center">
                        <span className="text-2xl font-bold text-slate-900">{classData.methods.length}</span>
                    </div>
                </div>
                <div className="bg-white p-4 rounded-xl border border-slate-100 shadow-sm">
                    <div className="flex items-center gap-2 mb-2 text-slate-500 text-sm font-medium">
                        <Database className="w-4 h-4" /> Fields
                    </div>
                    <div className="flex justify-center">
                        <span className="text-2xl font-bold text-slate-900">{classData.fields.length}</span>
                    </div>
                </div>
            </div>

            {/* Inheritance Info */}
            {
                (classData.superclass || (classData.interfaces && classData.interfaces.length > 0)) && (
                    <div className="bg-white p-4 rounded-xl border border-slate-100 shadow-sm flex flex-col md:flex-row gap-6 text-sm">
                        {classData.superclass && (
                            <div className="flex items-center gap-2">
                                <span className="text-slate-500 font-medium">Extends:</span>
                                <span className="font-mono text-indigo-600 bg-indigo-50 px-2 py-0.5 rounded flex items-center gap-1">
                                    <GitBranch className="w-3 h-3" /> {classData.superclass}
                                </span>
                            </div>
                        )}
                        {classData.interfaces && classData.interfaces.length > 0 && (
                            <div className="flex items-center gap-2">
                                <span className="text-slate-500 font-medium">Implements:</span>
                                <div className="flex flex-wrap gap-2">
                                    {classData.interfaces.map((iface, idx) => (
                                        <span key={idx} className="font-mono text-amber-700 bg-amber-50 px-2 py-0.5 rounded">
                                            {iface}
                                        </span>
                                    ))}
                                </div>
                            </div>
                        )}
                    </div>
                )
            }

            {/* Main Content Tabs */}
            <div className="bg-white rounded-2xl border border-slate-100 shadow-sm overflow-hidden min-h-[500px]">
                <div className="flex border-b border-slate-100 overflow-x-auto">
                    {['info', 'source', 'methods', 'fields'].map((tab) => (
                        <button
                            key={tab}
                            onClick={() => setActiveTab(tab as any)}
                            className={`px-6 py-4 text-sm font-medium transition-colors border-b-2 whitespace-nowrap ${activeTab === tab
                                ? 'border-indigo-600 text-indigo-700 bg-indigo-50/10'
                                : 'border-transparent text-slate-500 hover:text-slate-700 hover:bg-slate-50'
                                }`}
                        >
                            {tab.charAt(0).toUpperCase() + tab.slice(1)}
                        </button>
                    ))}
                </div>

                <div className="p-6">
                    {activeTab === 'info' && (
                        <div className="space-y-6">
                            {classData.annotations && classData.annotations.length > 0 && (
                                <div>
                                    <h3 className="text-lg font-bold text-slate-900 mb-3">Annotations</h3>
                                    <div className="flex flex-wrap gap-2">
                                        {classData.annotations.map((anno, idx) => (
                                            <span key={idx} className="bg-purple-50 text-purple-700 px-3 py-1 rounded-full text-sm font-mono border border-purple-100">
                                                @{anno}
                                            </span>
                                        ))}
                                    </div>
                                </div>
                            )}

                            {(classData.description || classData.ai_description) && (
                                <div>
                                    <h3 className="text-lg font-bold text-slate-900 mb-3">Description</h3>
                                    <div className="space-y-4">
                                        {classData.description && (
                                            <p className="text-slate-600 leading-relaxed">{classData.description}</p>
                                        )}
                                        <div className="prose prose-slate max-w-none text-slate-600 border border-slate-200 rounded-lg p-4 bg-slate-50/50 max-h-[600px] overflow-y-auto mt-4">
                                            {classData.ai_description ? (
                                                <Markdown remarkPlugins={[remarkGfm]}>{classData.ai_description}</Markdown>
                                            ) : (
                                                <p className="text-slate-400 italic text-sm">AI description will appear here...</p>
                                            )}
                                        </div>
                                    </div>
                                </div>
                            )}
                        </div>
                    )}

                    {activeTab === 'source' && (
                        <div className="h-full flex flex-col">
                            {/* Toolbar */}
                            <div className="flex justify-end gap-2 mb-2">
                                <button
                                    onClick={handleSelectAll}
                                    className="flex items-center gap-1.5 px-3 py-1.5 text-xs font-medium text-slate-600 bg-white border border-slate-200 rounded-lg hover:bg-slate-50 hover:text-indigo-600 transition-colors"
                                >
                                    <MousePointerClick className="w-3.5 h-3.5" />
                                    전체선택
                                </button>
                                <button
                                    onClick={handleCopySource}
                                    className={`flex items-center gap-1.5 px-3 py-1.5 text-xs font-medium border rounded-lg transition-all ${isCopied
                                        ? 'text-emerald-600 bg-emerald-50 border-emerald-200'
                                        : 'text-slate-600 bg-white border-slate-200 hover:bg-slate-50 hover:text-indigo-600'
                                        }`}
                                >
                                    {isCopied ? <Check className="w-3.5 h-3.5" /> : <Copy className="w-3.5 h-3.5" />}
                                    {isCopied ? '복사됨' : '복사하기'}
                                </button>
                            </div>

                            <div className="bg-[#1e1e1e] rounded-xl overflow-hidden text-sm border border-slate-900/10 shadow-inner h-[600px] flex font-mono">
                                <div className="overflow-auto w-full h-full flex">
                                    <div className="flex-none min-h-full bg-[#1e1e1e] border-r border-[#333] flex flex-col text-right py-4 pr-3 pl-4 select-none text-[#6e7681] sticky left-0 z-10">
                                        {(classData.source || '').split('\n').map((_, i) => (
                                            <span key={i} className="leading-6">{i + 1}</span>
                                        ))}
                                    </div>
                                    <div className="flex-1 min-h-full min-w-0 bg-[#1e1e1e]">
                                        <pre ref={codeRef} className="m-0 p-4 leading-6 whitespace-pre text-[#d4d4d4] font-mono">
                                            {classData.source || '// No source code available'}
                                        </pre>
                                    </div>
                                </div>
                            </div>
                        </div>
                    )}

                    {activeTab === 'methods' && (
                        <div>
                            <h3 className="text-lg font-bold text-slate-900 mb-4 px-1">Methods ({classData.methods.length})</h3>
                            {classData.methods.length === 0 ? (
                                <p className="text-slate-500 italic px-1">No methods found.</p>
                            ) : (
                                <div className="overflow-x-auto">
                                    <table className="w-full text-left border-collapse">
                                        <thead>
                                            <tr className="border-b border-slate-200 text-xs text-slate-500 uppercase bg-slate-50/50">
                                                <th className="px-4 py-3 font-semibold">Visibility</th>
                                                <th className="px-4 py-3 font-semibold">Name</th>
                                                <th className="px-4 py-3 font-semibold">Logical Name</th>
                                                <th className="px-4 py-3 font-semibold">Return Type</th>
                                                <th className="px-4 py-3 font-semibold text-right">Complexity</th>
                                                <th className="px-4 py-3 font-semibold text-right">LOC</th>
                                            </tr>
                                        </thead>
                                        <tbody className="divide-y divide-slate-100">
                                            {classData.methods.map((method, idx) => (
                                                <tr
                                                    key={idx}
                                                    onClick={() => navigate(`/projects/${projectName}/classes/${className}/methods/${method.name}`)}
                                                    className="hover:bg-slate-50 transition-colors cursor-pointer"
                                                >
                                                    <td className="px-4 py-3 text-slate-500 text-xs lowercase">{method.visibility || '-'}</td>
                                                    <td className="px-4 py-3 font-medium text-slate-900 font-mono text-sm">{method.name}</td>
                                                    <td className="px-4 py-3 text-slate-600 font-mono text-xs">{method.logical_name || '-'}</td>
                                                    <td className="px-4 py-3 text-slate-600 font-mono text-xs">{method.return_type}</td>
                                                    <td className="px-4 py-3 text-right text-slate-600 text-sm">{method.cognitive_complexity || '-'}</td>
                                                    <td className="px-4 py-3 text-right text-slate-600 text-sm">{method.PLOC || '-'}</td>
                                                </tr>
                                            ))}
                                        </tbody>
                                    </table>
                                </div>
                            )}
                        </div>
                    )}

                    {activeTab === 'fields' && (
                        <div>
                            <h3 className="text-lg font-bold text-slate-900 mb-4 px-1">Fields ({classData.fields.length})</h3>
                            {classData.fields.length === 0 ? (
                                <p className="text-slate-500 italic px-1">No fields found.</p>
                            ) : (
                                <div className="overflow-x-auto">
                                    <table className="w-full text-left border-collapse">
                                        <thead>
                                            <tr className="border-b border-slate-200 text-xs text-slate-500 uppercase bg-slate-50/50">
                                                <th className="px-4 py-3 font-semibold">Name</th>
                                                <th className="px-4 py-3 font-semibold">Type</th>
                                                <th className="px-4 py-3 font-semibold">Initial Value</th>
                                            </tr>
                                        </thead>
                                        <tbody className="divide-y divide-slate-100">
                                            {classData.fields.map((field, idx) => (
                                                <tr key={idx} className="hover:bg-slate-50 transition-colors">
                                                    <td className="px-4 py-3 font-medium text-slate-900 font-mono text-sm">{field.name}</td>
                                                    <td className="px-4 py-3 text-indigo-600 font-mono text-xs">{field.type}</td>
                                                    <td className="px-4 py-3 text-slate-500 font-mono text-xs truncate max-w-[200px]">{field.initial_value || '-'}</td>
                                                </tr>
                                            ))}
                                        </tbody>
                                    </table>
                                </div>
                            )}
                        </div>
                    )}
                </div>
            </div>

            {/* Report Viewer Modal */}
            <ReportViewerModal
                isOpen={reportModal.isOpen}
                onClose={() => setReportModal({ ...reportModal, isOpen: false })}
                title={reportModal.title}
                content={reportModal.content}
            />
        </div >
    );
};

export default ClassDetails;
