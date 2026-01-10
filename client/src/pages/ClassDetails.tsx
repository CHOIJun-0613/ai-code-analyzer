import React, { useRef, useState, useEffect, useMemo } from 'react';
import { useQuery, useQueryClient } from '@tanstack/react-query';
import { useParams, useSearchParams, useNavigate } from 'react-router-dom';
import { useTranslation } from 'react-i18next';
import ReportViewerModal from '../components/ReportViewerModal';
import VirtualizedTable, { Column } from '../components/VirtualizedTable';
import { ClassAnalysisModal } from '../components/ClassAnalysisModal';
import {
    Code2, FileCode, Braces,
    AlignLeft, Cpu, Database, GitBranch,
    Copy, Check, MousePointerClick, FileText, Activity, Workflow,
    ChevronDown, HelpCircle, Search, X, Sparkles, RefreshCw
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
    file_extension?: string;
    PLOC?: number;
    LLOC?: number;
    CLOC?: number;
    code_complexity?: number;
    fields: Field[];
    methods: Method[];
    source_hashcode?: string;
}

const ClassDetails: React.FC = () => {
    const { projectName, className } = useParams<{ projectName: string; className: string }>();
    const [searchParams] = useSearchParams();
    const packageName = searchParams.get('package');
    const navigate = useNavigate();
    const { t } = useTranslation();
    const queryClient = useQueryClient();

    const [activeTab, setActiveTab] = useState<'info' | 'source' | 'methods' | 'fields'>('info');
    const [showComplexityHelp, setShowComplexityHelp] = useState(false);
    const [isAnalysisModalOpen, setIsAnalysisModalOpen] = useState(false);
    const [isCopied, setIsCopied] = useState(false);
    const [methodSearchQuery, setMethodSearchQuery] = useState('');
    const codeRef = useRef<HTMLPreElement>(null);

    // React Query: 클래스 상세 정보 조회
    const {
        data: classData = null,
        isLoading,
        error
    } = useQuery({
        queryKey: ['projects', projectName, 'classes', className, 'details', packageName],
        queryFn: async () => {
            const { data } = await axios.get<ClassData>(`/projects/${projectName}/classes/${className}`, {
                params: { package: packageName }
            });
            return data;
        },
        enabled: !!(projectName && className && packageName),
    });

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
        setReportModal({ isOpen: true, title: t('common.loading'), content: '', isLoading: true });
        setShowReportMenu(false);
        try {
            const response = await axios.get(`/projects/${projectName}/classes/${className}/reports/${type}`);
            let title = '';
            switch (type) {
                case 'spec': title = t('classDetails.classSpec'); break;
                case 'sequence': title = t('classDetails.sequenceDiagram'); break;
                case 'impact': title = t('classDetails.impactAnalysis'); break;
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
                title: t('common.error'),
                content: `# ${t('common.error')}\n${t('common.errorReport')}`,
                isLoading: false
            });
        }
    };

    const handleAnalysisComplete = () => {
        queryClient.invalidateQueries({ queryKey: ['projects', projectName, 'classes', className] });
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

    // Filtered Methods based on search query
    const filteredMethods = useMemo(() => {
        if (!classData) return [];
        if (!methodSearchQuery.trim()) return classData.methods;

        const query = methodSearchQuery.toLowerCase();
        return classData.methods.filter(method =>
            method.name.toLowerCase().includes(query) ||
            (method.logical_name && method.logical_name.toLowerCase().includes(query))
        );
    }, [classData, methodSearchQuery]);

    // VirtualizedTable Column 정의 - Methods
    const methodColumns = useMemo((): Column<Method>[] => [
        {
            key: 'visibility',
            header: t('classDetails.methodVisibility'),
            width: '100px',
            render: (method) => (
                <span className="text-slate-500 dark:text-slate-400 text-xs lowercase">{method.visibility || '-'}</span>
            ),
        },
        {
            key: 'name',
            header: t('classDetails.methodName'),
            width: '25%',
            render: (method) => (
                <span className="font-medium text-indigo-600 dark:text-indigo-400 font-mono text-sm hover:underline">
                    {method.name}
                </span>
            ),
        },


        {
            key: 'logicalName',
            header: t('classDetails.methodLogicalName'),
            width: '25%',
            render: (method) => (
                <span className="text-slate-600 dark:text-slate-400 font-mono text-xs">{method.logical_name || '-'}</span>
            ),
        },
        {
            key: 'returnType',
            header: t('classDetails.methodReturnType'),
            width: '20%',
            render: (method) => (
                <span className="text-slate-600 dark:text-slate-400 font-mono text-xs">{method.return_type}</span>
            ),
        },
        {
            key: 'complexity',
            header: t('classDetails.methodComplexity'),
            width: '120px',
            align: 'right',
            render: (method) => (
                <span className="text-slate-600 dark:text-slate-400 text-sm">{method.cognitive_complexity || '-'}</span>
            ),
        },
        {
            key: 'loc',
            header: t('classDetails.methodLoc'),
            width: '200px',
            align: 'right',
            render: (method) => (
                <span className="text-slate-600 dark:text-slate-400 text-sm">{method.PLOC || '-'}</span>
            ),
        },
    ], [t]);

    // VirtualizedTable Column 정의 - Fields
    const fieldColumns = useMemo((): Column<Field>[] => [
        {
            key: 'name',
            header: t('classDetails.name'),
            width: '30%',
            render: (field) => (
                <span className="font-medium text-slate-900 dark:text-slate-200 font-mono text-sm">{field.name}</span>
            ),
        },
        {
            key: 'type',
            header: t('classDetails.type'),
            width: '30%',
            render: (field) => (
                <span className="text-indigo-600 dark:text-indigo-400 font-mono text-xs">{field.type}</span>
            ),
        },
        {
            key: 'initialValue',
            header: t('classDetails.initialValue'),
            width: '40%',
            render: (field) => (
                <span className="text-slate-500 dark:text-slate-400 font-mono text-xs truncate" title={field.initial_value || '-'}>
                    {field.initial_value || '-'}
                </span>
            ),
        },
    ], []);

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

    // useEffect 제거 - React Query가 자동으로 처리

    if (isLoading) {
        return (
            <div className="flex items-center justify-center h-screen bg-white dark:bg-[#121212]">
                <div className="w-12 h-12 border-4 border-indigo-500 border-t-transparent rounded-full animate-spin" />
            </div>
        );
    }

    if (error || !classData) {
        return (
            <div className="p-8 text-center text-slate-500 dark:text-slate-400 bg-white dark:bg-[#121212] h-full">
                <h2 className="text-xl font-bold mb-2 text-slate-900 dark:text-white">{t('common.error')}</h2>
                <p className="mb-4">{error ? (error instanceof Error ? error.message : String(error)) : t('common.noResults')}</p>
                <button
                    onClick={() => navigate(-1)}
                    className="px-4 py-2 bg-indigo-600 text-white rounded-lg hover:bg-indigo-700 transition-colors"
                >
                    {t('common.back')}
                </button>
            </div>
        );
    }

    const blankLines = (classData.PLOC || 0) - ((classData.LLOC || 0) + (classData.CLOC || 0));

    return (
        <div className="space-y-6 animate-in fade-in duration-500 pb-12">
            {/* Header */}
            <div>
                <div className="flex items-center gap-4">
                    <div className={`p-3 rounded-xl ${classData.type === 'interface'
                        ? 'bg-amber-50 dark:bg-amber-500/10 text-amber-600 dark:text-amber-400'
                        : 'bg-indigo-50 dark:bg-indigo-500/10 text-indigo-600 dark:text-indigo-400'}`}>
                        {classData.type === 'interface' ? <FileCode className="w-8 h-8" /> : <Code2 className="w-8 h-8" />}
                    </div>
                    <div className="flex-1">
                        <p className="text-slate-500 dark:text-slate-400 font-mono text-sm mb-1">{classData.package_name}</p>
                        <div className="flex items-center justify-between">
                            <div className="flex items-center gap-3">
                                <h1 className="text-3xl font-bold text-slate-900 dark:text-white flex items-baseline gap-0">
                                    <span>{classData.name}</span>
                                    {(classData.file_extension || classData.extension) && (
                                        <span className="text-sm text-slate-600 dark:text-slate-300 font-bold">
                                            {(() => {
                                                const ext = classData.file_extension || classData.extension;
                                                return ext?.startsWith('.') ? ext : `.${ext}`;
                                            })()}
                                        </span>
                                    )}
                                </h1>
                                <span className={`px-2 py-0.5 rounded text-xs font-bold uppercase border ${classData.type === 'interface' ? 'bg-amber-100 dark:bg-amber-900/30 text-amber-900 dark:text-amber-400 border-amber-200 dark:border-amber-800' : 'bg-indigo-100 dark:bg-indigo-900/30 text-indigo-900 dark:text-indigo-400 border-indigo-200 dark:border-indigo-800'}`}>
                                    {classData.type}
                                </span>
                                {classData.sub_type && (
                                    <span className="px-2 py-0.5 rounded text-xs font-bold bg-slate-100 dark:bg-slate-800 text-slate-700 dark:text-slate-300 border border-slate-200 dark:border-slate-700 uppercase">
                                        {classData.sub_type}
                                    </span>
                                )}
                            </div>

                            <div className="flex items-center gap-2">
                                <button
                                    onClick={() => setIsAnalysisModalOpen(true)}
                                    className="flex items-center gap-2 px-4 py-2 bg-white dark:bg-slate-900 border border-slate-200 dark:border-slate-800 text-slate-600 dark:text-slate-300 text-sm font-medium rounded-lg hover:bg-slate-50 dark:hover:bg-slate-800 transition-colors shadow-sm"
                                >
                                    <RefreshCw className="w-4 h-4" />
                                    {t('classDetails.reanalyze')}
                                </button>

                                {/* Reports Menu */}
                                <div className="relative" ref={reportMenuRef}>
                                    <button
                                        onClick={() => setShowReportMenu(!showReportMenu)}
                                        className="flex items-center gap-2 px-4 py-2 bg-white dark:bg-slate-900 border border-slate-200 dark:border-slate-800 text-slate-600 dark:text-slate-300 text-sm font-medium rounded-lg hover:bg-slate-50 dark:hover:bg-slate-800 transition-colors shadow-sm"
                                    >
                                        <FileText className="w-5 h-5" />
                                        {t('classDetails.reports')}
                                        <ChevronDown className={`w-4 h-4 transition-transform ${showReportMenu ? 'rotate-180' : ''}`} />
                                    </button>

                                    {showReportMenu && (
                                        <div className="absolute right-0 mt-2 w-56 bg-white dark:bg-slate-900 rounded-xl shadow-lg border border-slate-100 dark:border-slate-800 z-20 py-2 animate-in fade-in zoom-in-95 duration-200">
                                            <button
                                                onClick={() => handleGenerateReport('spec')}
                                                className="w-full text-left px-4 py-2 text-sm text-slate-700 dark:text-slate-300 hover:bg-indigo-50 dark:hover:bg-indigo-500/10 hover:text-indigo-600 dark:hover:text-indigo-400 flex items-center gap-2"
                                            >
                                                <FileText className="w-4 h-4" />
                                                {t('classDetails.classSpec')}
                                            </button>
                                            <button
                                                onClick={() => handleGenerateReport('sequence')}
                                                className="w-full text-left px-4 py-2 text-sm text-slate-700 dark:text-slate-300 hover:bg-indigo-50 dark:hover:bg-indigo-500/10 hover:text-indigo-600 dark:hover:text-indigo-400 flex items-center gap-2"
                                            >
                                                <Activity className="w-4 h-4" />
                                                {t('classDetails.sequenceDiagram')}
                                            </button>
                                            <button
                                                onClick={() => handleGenerateReport('impact')}
                                                className="w-full text-left px-4 py-2 text-sm text-slate-700 dark:text-slate-300 hover:bg-indigo-50 dark:hover:bg-indigo-500/10 hover:text-indigo-600 dark:hover:text-indigo-400 flex items-center gap-2"
                                            >
                                                <Workflow className="w-4 h-4" />
                                                {t('classDetails.impactAnalysis')}
                                            </button>
                                        </div>
                                    )}
                                </div>
                            </div>
                        </div>
                        {/* Logical Name and Last Updated */}
                        <div className="mt-1">
                            {classData.logical_name && (
                                <p className="text-slate-600 dark:text-slate-300 text-sm mb-1">{classData.logical_name}</p>
                            )}
                            {classData.updated_at && (
                                <p className="text-xs text-slate-400 dark:text-slate-500 font-mono">
                                    {t('classDetails.lastUpdated')}: {new Date(classData.updated_at).toLocaleString()}
                                </p>
                            )}
                        </div>
                    </div>
                </div>
            </div>

            {/* Metrics Cards */}
            <div className="flex flex-col md:flex-row gap-4">
                <div className="bg-white dark:bg-slate-900 p-4 rounded-xl border border-slate-100 dark:border-slate-800 shadow-sm md:flex-[2]">
                    <div className="flex items-center gap-2 mb-2 text-slate-500 dark:text-slate-400 text-sm font-medium">
                        <AlignLeft className="w-4 h-4" /> {t('classDetails.linesOfCode')}
                    </div>
                    <div className="grid grid-cols-2 gap-x-4 gap-y-2">
                        <div className="flex justify-between items-baseline">
                            <span className="text-xs text-slate-500 dark:text-slate-500">{t('classDetails.physical')}</span>
                            <span className="text-sm font-bold text-slate-900 dark:text-white">{classData.PLOC?.toLocaleString() || '-'}</span>
                        </div>
                        <div className="flex justify-between items-baseline">
                            <span className="text-xs text-slate-500 dark:text-slate-500">{t('classDetails.logical')}</span>
                            <span className="text-sm font-bold text-slate-900 dark:text-white">{classData.LLOC?.toLocaleString() || '-'}</span>
                        </div>
                        <div className="flex justify-between items-baseline">
                            <span className="text-xs text-slate-500 dark:text-slate-500">{t('classDetails.comment')}</span>
                            <span className="text-sm font-bold text-slate-900 dark:text-white">{classData.CLOC?.toLocaleString() || '-'}</span>
                        </div>
                        <div className="flex justify-between items-baseline">
                            <span className="text-xs text-slate-500 dark:text-slate-500">{t('classDetails.blankLines')}</span>
                            <span className="text-sm font-bold text-slate-900 dark:text-white">{Math.max(0, blankLines).toLocaleString()}</span>
                        </div>
                    </div>
                </div>

                {/* Complexity Card with Popup Trigger */}
                <div className="bg-white dark:bg-slate-900 p-4 rounded-xl border border-slate-100 dark:border-slate-800 shadow-sm relative group overflow-visible md:flex-1">
                    <div className="flex items-center justify-between mb-2">
                        <div className="flex items-center gap-2 text-slate-500 dark:text-slate-400 text-sm font-medium">
                            <Cpu className="w-4 h-4" /> {t('classDetails.complexity')}
                        </div>
                        <button
                            onClick={() => setShowComplexityHelp(true)}
                            className="text-slate-400 hover:text-indigo-500 transition-colors p-0.5 rounded-full hover:bg-slate-100 dark:hover:bg-slate-800"
                        >
                            <HelpCircle className="w-3.5 h-3.5" />
                        </button>
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
                            <div
                                className="flex items-baseline justify-center gap-2 cursor-pointer"
                                onClick={() => setShowComplexityHelp(true)}
                            >
                                <span className={`text-2xl font-bold ${colorClass}`}>{score.toLocaleString()}</span>
                                <span className={`text-xs font-medium ${colorClass} bg-opacity-10 px-1.5 py-0.5 rounded border border-current`}>
                                    {label}
                                </span>
                            </div>
                        );
                    })()}
                </div>

                <div className="bg-white dark:bg-slate-900 p-4 rounded-xl border border-slate-100 dark:border-slate-800 shadow-sm cursor-pointer md:flex-1" onClick={() => setActiveTab('methods')}>
                    <div className="flex items-center gap-2 mb-2 text-slate-500 dark:text-slate-400 text-sm font-medium">
                        <Braces className="w-4 h-4" /> {t('classDetails.methods')}
                    </div>
                    <div className="flex justify-center">
                        <span className="text-2xl font-bold text-slate-900 dark:text-white">{classData.methods.length}</span>
                    </div>
                </div>
                <div className="bg-white dark:bg-slate-900 p-4 rounded-xl border border-slate-100 dark:border-slate-800 shadow-sm cursor-pointer md:flex-1" onClick={() => setActiveTab('fields')}>
                    <div className="flex items-center gap-2 mb-2 text-slate-500 dark:text-slate-400 text-sm font-medium">
                        <Database className="w-4 h-4" /> {t('classDetails.fields')}
                    </div>
                    <div className="flex justify-center">
                        <span className="text-2xl font-bold text-slate-900 dark:text-white">{classData.fields.length}</span>
                    </div>
                </div>
            </div>

            {/* Inheritance Info */}
            {
                (classData.superclass || (classData.interfaces && classData.interfaces.length > 0)) && (
                    <div className="bg-white dark:bg-slate-900 p-4 rounded-xl border border-slate-100 dark:border-slate-800 shadow-sm flex flex-col md:flex-row gap-6 text-sm">
                        {classData.superclass && (
                            <div className="flex items-center gap-2">
                                <span className="text-slate-500 dark:text-slate-400 font-medium">{t('classDetails.extends')}:</span>
                                <span className="font-mono text-indigo-600 dark:text-indigo-400 bg-indigo-50 dark:bg-indigo-900/20 px-2 py-0.5 rounded flex items-center gap-1">
                                    <GitBranch className="w-3 h-3" /> {classData.superclass}
                                </span>
                            </div>
                        )}
                        {classData.interfaces && classData.interfaces.length > 0 && (
                            <div className="flex items-center gap-2">
                                <span className="text-slate-500 dark:text-slate-400 font-medium">{t('classDetails.implements')}:</span>
                                <div className="flex flex-wrap gap-2">
                                    {classData.interfaces.map((iface, idx) => (
                                        <span key={idx} className="font-mono text-amber-700 dark:text-amber-400 bg-amber-50 dark:bg-amber-900/20 px-2 py-0.5 rounded">
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
            <div className="bg-white dark:bg-slate-900 rounded-2xl border border-slate-100 dark:border-slate-800 shadow-sm overflow-hidden min-h-[500px]">
                <div className="flex border-b border-slate-100 dark:border-slate-800 overflow-x-auto justify-between items-center bg-white dark:bg-slate-900">
                    <div className="flex">
                        {[
                            { id: 'info', label: t('classDetails.info') },
                            { id: 'source', label: t('classDetails.source') },
                            { id: 'methods', label: t('classDetails.methodsTab') },
                            { id: 'fields', label: t('classDetails.fieldsTab') }
                        ].map((tab) => (
                            <button
                                key={tab.id}
                                onClick={() => setActiveTab(tab.id as any)}
                                className={`px-6 py-4 text-sm font-bold transition-colors border-b-2 whitespace-nowrap ${activeTab === tab.id
                                    ? 'border-indigo-600 text-indigo-700 dark:text-indigo-400 bg-indigo-50/10'
                                    : 'border-transparent text-slate-500 dark:text-slate-500 hover:text-slate-700 dark:hover:text-slate-300 hover:bg-slate-50 dark:hover:bg-slate-800'
                                    }`}
                            >
                                {tab.label}
                            </button>
                        ))}
                    </div>
                    {/* Source Tab Toolbar - Only visible when source tab is active */}
                    {activeTab === 'source' && (
                        <div className="flex gap-2 mr-4">
                            <button
                                onClick={handleSelectAll}
                                className="flex items-center gap-1.5 px-3 py-1.5 text-xs font-medium text-slate-600 dark:text-slate-300 bg-white dark:bg-slate-800 border border-slate-200 dark:border-slate-700 rounded-lg hover:bg-slate-50 dark:hover:bg-slate-700 hover:text-indigo-600 dark:hover:text-indigo-400 transition-colors"
                            >
                                <MousePointerClick className="w-3.5 h-3.5" />
                                {t('common.selectAll')}
                            </button>
                            <button
                                onClick={handleCopySource}
                                className={`flex items-center gap-1.5 px-3 py-1.5 text-xs font-medium border rounded-lg transition-all ${isCopied
                                    ? 'text-emerald-600 bg-emerald-50 dark:bg-emerald-900/20 border-emerald-200 dark:border-emerald-800'
                                    : 'text-slate-600 dark:text-slate-300 bg-white dark:bg-slate-800 border-slate-200 dark:border-slate-700 hover:bg-slate-50 dark:hover:bg-slate-700 hover:text-indigo-600 dark:hover:text-indigo-400'
                                    }`}
                            >
                                {isCopied ? <Check className="w-3.5 h-3.5" /> : <Copy className="w-3.5 h-3.5" />}
                                {isCopied ? t('common.copied') : t('common.copy')}
                            </button>
                        </div>
                    )}
                </div>

                <div className="p-6">
                    {activeTab === 'info' && (
                        <div className="space-y-6">
                            {classData.annotations && classData.annotations.length > 0 && (
                                <div>
                                    <h3 className="text-lg font-bold text-slate-900 dark:text-white mb-3">{t('classDetails.annotations')}</h3>
                                    <div className="flex flex-wrap gap-2">
                                        {classData.annotations.map((anno, idx) => (
                                            <span key={idx} className="bg-purple-50 dark:bg-purple-900/20 text-purple-700 dark:text-purple-400 px-3 py-1 rounded-full text-sm font-mono border border-purple-100 dark:border-purple-800">
                                                @{anno}
                                            </span>
                                        ))}
                                    </div>
                                </div>
                            )}

                            {(classData.description || classData.ai_description) && (
                                <div>
                                    <h3 className="text-lg font-bold text-slate-900 dark:text-white mb-3">{t('classDetails.overview')}</h3>
                                    <div className="space-y-4">
                                        {classData.description && (
                                            <div className="markdown-content bg-white dark:bg-[#1e1e1e] p-4 rounded-lg border border-slate-100 dark:border-slate-800 text-slate-700 dark:text-slate-300">
                                                <Markdown remarkPlugins={[remarkGfm]}>{classData.description}</Markdown>
                                            </div>
                                        )}
                                        <div className="relative mt-4">
                                            {/* AI Generated Badge */}
                                            <div className="absolute -top-3 -left-3 flex items-center gap-1.5 px-3 py-1.5 bg-gradient-to-r from-purple-500 to-indigo-500 text-white text-xs font-bold rounded-full shadow-lg z-10">
                                                <Sparkles className="w-3.5 h-3.5" />
                                                <span>{t('classDetails.aiGenerated')}</span>
                                            </div>
                                            <div className="markdown-content border border-slate-200 dark:border-slate-700 rounded-lg p-4 bg-slate-50/50 dark:bg-[#1e1e1e] max-h-[600px] overflow-y-auto text-slate-700 dark:text-slate-300">
                                                {classData.ai_description ? (
                                                    <Markdown remarkPlugins={[remarkGfm]}>{classData.ai_description}</Markdown>
                                                ) : (
                                                    <p className="text-slate-400 dark:text-slate-500 italic text-sm">{t('classDetails.aiDescriptionPlaceholder')}</p>
                                                )}
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            )}
                        </div>
                    )}

                    {activeTab === 'source' && (
                        <div className="h-full flex flex-col">
                            {/* Toolbar Removed form here */}

                            {classData.source_hashcode && (
                                <div className="mb-3 flex items-center gap-2 text-xs text-slate-500 dark:text-slate-400 font-mono bg-slate-50 dark:bg-slate-800/50 px-3 py-2 rounded-lg border border-slate-100 dark:border-slate-800">
                                    <span className="font-semibold text-slate-700 dark:text-slate-300 select-none">{t('classDetails.sourceHash')}:</span>
                                    <span className="text-slate-600 dark:text-slate-400 break-all">{classData.source_hashcode}</span>
                                </div>
                            )}

                            <div className="bg-white dark:bg-[#1e1e1e] rounded-xl overflow-hidden text-sm border border-slate-200 dark:border-slate-900/10 shadow-inner h-[600px] flex font-mono transition-colors duration-300">
                                <div className="overflow-auto w-full h-full flex">
                                    <div className="flex-none min-h-full bg-slate-50 dark:bg-[#1e1e1e] border-r border-slate-200 dark:border-[#333] flex flex-col text-right py-4 pr-3 pl-4 select-none text-slate-400 dark:text-[#6e7681] sticky left-0 z-10 transition-colors duration-300">
                                        {(classData.source || '').split('\n').map((_, i) => (
                                            <span key={i} className="leading-6">{i + 1}</span>
                                        ))}
                                    </div>
                                    <div className="flex-1 min-h-full min-w-0 bg-white dark:bg-[#1e1e1e] transition-colors duration-300">
                                        <pre ref={codeRef} className="m-0 p-4 leading-6 whitespace-pre text-slate-800 dark:text-[#d4d4d4] font-mono font-medium">
                                            {classData.source || `// ${t('classDetails.noSource')}`}
                                        </pre>
                                    </div>
                                </div>
                            </div>
                        </div>
                    )}

                    {activeTab === 'methods' && (
                        <div>
                            <div className="flex items-center justify-between mb-4 px-1">
                                <h3 className="text-lg font-bold text-slate-900 dark:text-white">
                                    {t('classDetails.methodsTab')} ({filteredMethods.length}{methodSearchQuery.trim() ? `/${classData.methods.length}` : ''})
                                </h3>
                                <div className="relative">
                                    <Search className="absolute left-3 top-1/2 transform -translate-y-1/2 w-4 h-4 text-slate-400" />
                                    <input
                                        type="text"
                                        placeholder={t('classDetails.searchMethodPlaceholder')}
                                        value={methodSearchQuery}
                                        onChange={(e) => setMethodSearchQuery(e.target.value)}
                                        className="pl-10 pr-10 py-2 border border-slate-200 dark:border-slate-700 rounded-lg bg-white dark:bg-slate-800 text-slate-900 dark:text-white placeholder-slate-400 focus:outline-none focus:ring-2 focus:ring-indigo-500 focus:border-transparent text-sm w-[32rem]"
                                    />
                                    {methodSearchQuery && (
                                        <button
                                            onClick={() => setMethodSearchQuery('')}
                                            className="absolute right-3 top-1/2 transform -translate-y-1/2 text-slate-400 hover:text-slate-600 dark:hover:text-slate-300 transition-colors"
                                        >
                                            <X className="w-4 h-4" />
                                        </button>
                                    )}
                                </div>
                            </div>
                            <VirtualizedTable
                                data={filteredMethods}
                                columns={methodColumns}
                                height={500}
                                rowHeight={50}
                                headerHeight={45}
                                hoverable
                                emptyMessage={t('common.noData')}
                                onRowClick={(method) => {
                                    const pkg = classData?.package_name || packageName;
                                    navigate(`/projects/${projectName}/classes/${className}/methods/${method.name}?package=${pkg}`);
                                }}
                            />
                        </div>
                    )}

                    {activeTab === 'fields' && (
                        <div>
                            <h3 className="text-lg font-bold text-slate-900 dark:text-white mb-4 px-1">{t('classDetails.fieldsTab')} ({classData.fields.length})</h3>
                            <VirtualizedTable
                                data={classData.fields}
                                columns={fieldColumns}
                                height={500}
                                rowHeight={50}
                                headerHeight={45}
                                hoverable
                                emptyMessage={t('common.noData')}
                            />
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

            {/* Complexity Help Modal */}
            {showComplexityHelp && (
                <div className="fixed inset-0 z-50 flex items-center justify-center p-4 bg-slate-900/60 backdrop-blur-sm animate-in fade-in duration-200">
                    <div
                        className="bg-white dark:bg-slate-900 rounded-2xl shadow-2xl border border-slate-200 dark:border-slate-800 w-full max-w-lg max-h-[90vh] overflow-hidden flex flex-col animate-in zoom-in-95 duration-200"
                        onClick={(e) => e.stopPropagation()}
                    >
                        {/* Modal Header */}
                        <div className="p-6 border-b border-slate-100 dark:border-slate-800 flex items-center justify-between bg-slate-50/50 dark:bg-slate-800/50">
                            <div className="flex items-center gap-3">
                                <div className="p-2 rounded-lg bg-indigo-50 dark:bg-indigo-500/10 text-indigo-600 dark:text-indigo-400">
                                    <Cpu className="w-5 h-5" />
                                </div>
                                <h2 className="text-xl font-bold text-slate-900 dark:text-white">
                                    {t('classDetails.complexityTooltipTitle')}
                                </h2>
                            </div>
                            <button
                                onClick={() => setShowComplexityHelp(false)}
                                className="p-2 hover:bg-slate-200 dark:hover:bg-slate-700 rounded-full transition-colors"
                            >
                                <Check className="w-5 h-5 text-slate-500" />
                            </button>
                        </div>

                        {/* Modal Body */}
                        <div className="p-6 overflow-y-auto space-y-6">
                            {/* Description */}
                            <div>
                                <p className="text-slate-600 dark:text-slate-400 leading-relaxed">
                                    {t('classDetails.complexityTooltipDescription')}
                                </p>
                            </div>

                            {/* Calculation Basis */}
                            <div>
                                <h3 className="text-sm font-bold text-slate-900 dark:text-white uppercase tracking-wider mb-3">
                                    {t('classDetails.complexityTooltipBasis')}
                                </h3>
                                <div className="bg-slate-50 dark:bg-slate-800/50 rounded-xl border border-slate-200 dark:border-slate-800 p-4">
                                    <ul className="space-y-2 text-sm">
                                        <li className="flex justify-between items-center">
                                            <span className="text-slate-600 dark:text-slate-400">Lines</span>
                                            <span className="font-mono font-bold text-indigo-600 dark:text-indigo-400">× 1</span>
                                        </li>
                                        <li className="flex justify-between items-center">
                                            <span className="text-slate-600 dark:text-slate-400">Fields</span>
                                            <span className="font-mono font-bold text-indigo-600 dark:text-indigo-400">× 2</span>
                                        </li>
                                        <li className="flex justify-between items-center">
                                            <span className="text-slate-600 dark:text-slate-400">Methods</span>
                                            <span className="font-mono font-bold text-indigo-600 dark:text-indigo-400">× 5</span>
                                        </li>
                                        <li className="flex justify-between items-center">
                                            <span className="text-slate-600 dark:text-slate-400">Inner Classes</span>
                                            <span className="font-mono font-bold text-indigo-600 dark:text-indigo-400">× 10</span>
                                        </li>
                                        <li className="flex justify-between items-center">
                                            <span className="text-slate-600 dark:text-slate-400">Annotations</span>
                                            <span className="font-mono font-bold text-indigo-600 dark:text-indigo-400">× 1</span>
                                        </li>
                                    </ul>
                                </div>
                            </div>

                            {/* Reference Levels */}
                            <div>
                                <h3 className="text-sm font-bold text-slate-900 dark:text-white uppercase tracking-wider mb-3">
                                    {t('classDetails.complexityTooltipReference')}
                                </h3>
                                <div className="space-y-3">
                                    <div className="flex items-center gap-4 p-3 rounded-xl border border-emerald-100 dark:border-emerald-900/30 bg-emerald-50/30 dark:bg-emerald-900/10">
                                        <div className="font-mono font-bold text-emerald-600 dark:text-emerald-400 min-w-[60px]">~ 2k</div>
                                        <div className="text-sm text-slate-600 dark:text-slate-400">{t('classDetails.complexityTooltipNormal')}</div>
                                    </div>
                                    <div className="flex items-center gap-4 p-3 rounded-xl border border-amber-100 dark:border-amber-900/30 bg-amber-50/30 dark:bg-amber-900/10">
                                        <div className="font-mono font-bold text-amber-600 dark:text-amber-400 min-w-[60px]">~ 5k</div>
                                        <div className="text-sm text-slate-600 dark:text-slate-400">{t('classDetails.complexityTooltipLarge')}</div>
                                    </div>
                                    <div className="flex items-center gap-4 p-3 rounded-xl border border-red-100 dark:border-red-900/30 bg-red-50/30 dark:bg-red-900/10">
                                        <div className="font-mono font-bold text-red-600 dark:text-red-400 min-w-[60px]">5k +</div>
                                        <div className="text-sm text-slate-600 dark:text-slate-400">{t('classDetails.complexityTooltipHigh')}</div>
                                    </div>
                                </div>
                            </div>
                        </div>

                        {/* Modal Footer */}
                        <div className="p-6 border-t border-slate-100 dark:border-slate-800 bg-slate-50/50 dark:bg-slate-800/50 flex justify-end">
                            <button
                                onClick={() => setShowComplexityHelp(false)}
                                className="px-6 py-2 bg-indigo-600 hover:bg-indigo-700 text-white rounded-xl font-bold shadow-lg shadow-indigo-500/25 transition-all active:scale-95"
                            >
                                {t('common.confirm')}
                            </button>
                        </div>
                    </div>
                </div>
            )}

            {classData && (
                <ClassAnalysisModal
                    isOpen={isAnalysisModalOpen}
                    onClose={() => setIsAnalysisModalOpen(false)}
                    projectName={projectName || ''}
                    classData={classData}
                    onAnalysisComplete={handleAnalysisComplete}
                />
            )}

        </div>
    );
};

export default ClassDetails;
