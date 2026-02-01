import React, { useRef, useState, useMemo } from 'react';
import { useQuery } from '@tanstack/react-query';
import { useParams, useSearchParams, useNavigate } from 'react-router-dom';
import { useTranslation } from 'react-i18next';
import VirtualizedTable, { Column } from '../components/VirtualizedTable';
import {
    Code2, Braces, AlignLeft, Cpu,
    Copy, Check, MousePointerClick,
    Box, Info, FileCode, GitMerge,
    HelpCircle, Sparkles
} from 'lucide-react';
import Markdown from 'react-markdown';
import remarkGfm from 'remark-gfm';
import axios from '../api/client';
import MermaidDiagram from '../components/MermaidDiagram';
import SourceCodeViewer, { SourceCodeViewerHandle } from '../components/SourceCodeViewer';

interface MethodCall {
    name: string;
    logical_name?: string;
    return_type?: string;
    class_name: string;
    package_name: string;
    order: number;
}

interface Parameter {
    name: string;
    type: string;
    type_logical_name?: string;
    type_package_name?: string;
}

interface MethodData {
    name: string;
    logical_name?: string;
    return_type: string;
    return_type_detail?: {
        logical_name: string;
        package_name: string;
    };
    visibility?: string;
    modifiers?: string[];
    parameters?: Parameter[];
    description?: string;
    ai_description?: string;
    source?: string;
    PLOC?: number;
    LLOC?: number;
    CLOC?: number;
    cognitive_complexity?: number;
    annotations?: string[];
    exceptions?: string[];
    class_name: string;
    class_sub_type?: string;
    package_name: string;
    calls: MethodCall[];
}

const MethodDetails: React.FC = () => {
    const { projectName, className, methodName } = useParams<{
        projectName: string;
        className: string;
        methodName: string
    }>();
    const [searchParams] = useSearchParams();
    const packageName = searchParams.get('package');
    const navigate = useNavigate();
    const { t } = useTranslation();

    const [activeTab, setActiveTab] = useState<'info' | 'inout' | 'source' | 'flowchart' | 'calls' | 'sequence'>('info');
    const [showComplexityHelp, setShowComplexityHelp] = useState(false);
    const [isCopied, setIsCopied] = useState(false);
    const codeRef = useRef<SourceCodeViewerHandle>(null);

    // React Query: 메서드 상세 정보 조회
    const {
        data: methodData = null,
        isLoading,
        isFetching,
        error
    } = useQuery({
        queryKey: ['projects', projectName, 'classes', className, 'methods', methodName, packageName],
        queryFn: async () => {
            if (!packageName) {
                console.error("Missing package name for method details");
                throw new Error("Package name is required");
            }
            const { data } = await axios.get<MethodData>(
                `/projects/${projectName}/classes/${className}/methods/${methodName}`,
                { params: { package: packageName } }
            );
            return data;
        },
        enabled: !!(projectName && className && methodName && packageName),
        retry: 1
    });

    // React Query: 시퀀스 다이어그램 조회
    const {
        data: sequenceData = null,
        isLoading: isSequenceLoading
    } = useQuery({
        queryKey: ['projects', projectName, 'classes', className, 'methods', methodName, 'sequence'],
        queryFn: async () => {
            const { data } = await axios.get<{ content: string }>(
                `/projects/${projectName}/classes/${className}/methods/${methodName}/reports/sequence`
            );
            return data;
        },
        enabled: activeTab === 'sequence' && !!(projectName && className && methodName),
    });

    const { overviewContent, flowChartContent } = useMemo(() => {
        if (!methodData?.ai_description) return { overviewContent: '', flowChartContent: '' };

        // Split by the specific header using regex for flexibility
        // Matches: ## **[Flow Chart]**, ### **[Method Flowchart]**, etc.
        const splitRegex = /#+\s*\*\*\[?(?:Method\s+)?Flow\s*Chart\]?\*\*/i;
        const parts = methodData.ai_description.split(splitRegex);

        const overview = parts[0].trim();
        let chart = parts.length > 1 ? parts.slice(1).join('').trim() : '';

        // Clean up markdown code blocks if present
        if (chart.startsWith('```mermaid')) {
            chart = chart.replace(/^```mermaid\s*/, '').replace(/\s*```$/, '');
        } else if (chart.startsWith('```')) {
            chart = chart.replace(/^```\s*/, '').replace(/\s*```$/, '');
        }

        return { overviewContent: overview, flowChartContent: chart };
    }, [methodData?.ai_description]);

    const handleCopySource = async () => {
        if (!codeRef.current) return;
        try {
            await codeRef.current.copyToClipboard();
            setIsCopied(true);
            setTimeout(() => setIsCopied(false), 2000);
        } catch (err) {
            console.error('Failed to copy text: ', err);
        }
    };

    const handleSelectAll = () => {
        codeRef.current?.selectAll();
    };

    // VirtualizedTable Column 정의 - Method Calls
    const callColumns = useMemo((): Column<MethodCall>[] => [
        {
            key: 'order',
            header: t('methodDetails.callOrder'),
            width: '80px',
            render: (call) => (
                <span className="text-slate-500 dark:text-slate-400 text-xs font-mono">{call.order}</span>
            ),
        },
        {
            key: 'name',
            header: t('methodDetails.targetMethod'),
            width: '18%',
            render: (call) => (
                <span className="font-medium text-indigo-600 dark:text-indigo-400 font-mono text-sm truncate block" title={call.name}>{call.name}</span>
            ),
        },
        {
            key: 'logical_name',
            header: t('methodDetails.targetLogicalName'),
            width: '18%',
            render: (call) => (
                <span className="text-slate-600 dark:text-slate-300 text-xs truncate block" title={call.logical_name}>{call.logical_name || '-'}</span>
            ),
        },
        {
            key: 'return_type',
            header: t('methodDetails.targetReturnType'),
            width: '22%',
            render: (call) => (
                <span className="text-indigo-600 dark:text-indigo-400 font-mono text-[10px] bg-indigo-50 dark:bg-indigo-900/20 px-1.5 py-0.5 rounded truncate inline-block max-w-full" title={call.return_type}>{call.return_type || '-'}</span>
            ),
        },
        {
            key: 'class_name',
            header: t('methodDetails.targetClass'),
            width: '20%',
            render: (call) => (
                <span className="text-slate-900 dark:text-slate-200 font-mono text-xs truncate block" title={call.class_name}>{call.class_name}</span>
            ),
        },
        {
            key: 'package_name',
            header: t('methodDetails.targetPackage'),
            width: '22%',
            render: (call) => (
                <span className="text-slate-500 dark:text-slate-400 font-mono text-xs truncate block" title={call.package_name}>
                    {call.package_name}
                </span>
            ),
        },
    ], [t]);

    const isPending = isLoading || (isFetching && !methodData);

    if (isPending) {
        return (
            <div className="flex items-center justify-center h-screen bg-white dark:bg-[#121212]">
                <div className="w-12 h-12 border-4 border-indigo-500 border-t-transparent rounded-full animate-spin" />
            </div>
        );
    }

    if (error || !methodData) {
        return (
            <div className="p-8 text-center text-slate-500 dark:text-slate-400 bg-white dark:bg-[#121212] h-full">
                <h2 className="text-xl font-bold mb-2 text-slate-900 dark:text-white">{t('common.error')}</h2>
                <p className="mb-4">
                    {!packageName ? "Package name missing in URL" :
                        error ? (error instanceof Error ? error.message : String(error)) : t('common.noResults')}
                </p>
                <button
                    onClick={() => navigate(-1)}
                    className="px-4 py-2 bg-indigo-600 text-white rounded-lg hover:bg-indigo-700 transition-colors"
                >
                    {t('common.back')}
                </button>
            </div>
        );
    }


    const blankLines = (methodData.PLOC || 0) - ((methodData.LLOC || 0) + (methodData.CLOC || 0));

    return (
        <div className="space-y-6 animate-in fade-in duration-500 pb-12">
            {/* Header */}
            <div>
                <div className="flex items-center gap-4">
                    <div className="p-3 rounded-xl bg-indigo-50 dark:bg-indigo-500/10 text-indigo-600 dark:text-indigo-400">
                        <Braces className="w-8 h-8" />
                    </div>
                    <div className="flex-1">
                        <p className="text-slate-500 dark:text-slate-400 font-mono text-sm mb-1">
                            {methodData.package_name}.{methodData.class_name}
                        </p>
                        <div className="flex items-center justify-between">
                            <div className="flex items-center gap-3">
                                <h1 className="text-3xl font-bold text-slate-900 dark:text-white">
                                    {methodData.name}()
                                </h1>
                                <span className="px-2 py-0.5 rounded text-xs font-bold uppercase border bg-indigo-100 dark:bg-indigo-900/30 text-indigo-900 dark:text-indigo-400 border-indigo-200 dark:border-indigo-800">
                                    METHOD
                                </span>
                                {methodData.visibility && (
                                    <span className="px-2 py-0.5 rounded text-xs font-bold bg-slate-100 dark:bg-slate-800 text-slate-700 dark:text-slate-300 border border-slate-200 dark:border-slate-700 uppercase">
                                        {methodData.visibility}
                                    </span>
                                )}
                            </div>
                        </div>
                        {/* Logical Name */}
                        <div className="mt-1">
                            {methodData.logical_name && (
                                <p className="text-slate-600 dark:text-slate-300 text-sm">{methodData.logical_name}</p>
                            )}
                        </div>
                    </div>
                </div>
            </div>

            {/* DTO Warning Alert */}
            {methodData.class_sub_type === 'dto' && (
                <div className="bg-amber-50 dark:bg-amber-900/10 border border-amber-200 dark:border-amber-800 rounded-lg p-4 flex items-start gap-3">
                    <Info className="w-5 h-5 text-amber-600 dark:text-amber-400 mt-0.5 flex-shrink-0" />
                    <div>
                        <h4 className="text-sm font-bold text-amber-800 dark:text-amber-300 mb-1">
                            DTO Method
                        </h4>
                        <p className="text-sm text-amber-700 dark:text-amber-400">
                            {t('methodDetails.dtoAnalysisWarning')}
                        </p>
                    </div>
                </div>
            )}

            {/* Metrics Cards */}
            <div className="grid grid-cols-1 md:grid-cols-4 gap-4">
                <div className="bg-white dark:bg-slate-900 p-4 rounded-xl border border-slate-100 dark:border-slate-800 shadow-sm">
                    <div className="flex items-center gap-2 mb-2 text-slate-500 dark:text-slate-400 text-sm font-medium">
                        <AlignLeft className="w-4 h-4" /> {t('classDetails.linesOfCode')}
                    </div>
                    <div className="grid grid-cols-2 gap-x-4 gap-y-2">
                        <div className="flex justify-between items-baseline">
                            <span className="text-xs text-slate-500 dark:text-slate-500">{t('classDetails.physical')}</span>
                            <span className="text-sm font-bold text-slate-900 dark:text-white">{methodData.PLOC?.toLocaleString() || '-'}</span>
                        </div>
                        <div className="flex justify-between items-baseline">
                            <span className="text-xs text-slate-500 dark:text-slate-500">{t('classDetails.logical')}</span>
                            <span className="text-sm font-bold text-slate-900 dark:text-white">{methodData.LLOC?.toLocaleString() || '-'}</span>
                        </div>
                        <div className="flex justify-between items-baseline">
                            <span className="text-xs text-slate-500 dark:text-slate-500">{t('classDetails.comment')}</span>
                            <span className="text-sm font-bold text-slate-900 dark:text-white">{methodData.CLOC?.toLocaleString() || '-'}</span>
                        </div>
                        <div className="flex justify-between items-baseline">
                            <span className="text-xs text-slate-500 dark:text-slate-500">{t('classDetails.blankLines')}</span>
                            <span className="text-sm font-bold text-slate-900 dark:text-white">{Math.max(0, blankLines).toLocaleString()}</span>
                        </div>
                    </div>
                </div>

                <div className="bg-white dark:bg-slate-900 p-4 rounded-xl border border-slate-100 dark:border-slate-800 shadow-sm relative group overflow-visible">
                    <div className="flex items-center justify-between mb-2">
                        <div className="flex items-center gap-2 text-slate-500 dark:text-slate-400 text-sm font-medium">
                            <Cpu className="w-4 h-4" /> {t('classDetails.complexity')}
                            <button
                                onClick={() => setShowComplexityHelp(true)}
                                className="text-slate-400 hover:text-indigo-500 transition-colors p-0.5 rounded-full hover:bg-slate-100 dark:hover:bg-slate-800"
                            >
                                <HelpCircle className="w-3.5 h-3.5" />
                            </button>
                        </div>
                    </div>

                    {(() => {
                        const score = methodData.cognitive_complexity || 0;
                        const levels = t('methodDetails.complexityHelp.levels', { returnObjects: true }) as any[];
                        let colorClass = 'text-slate-900';
                        let label = '';

                        if (score >= 16) {
                            colorClass = 'text-red-600';
                            label = levels[2].status;
                        } else if (score >= 11) {
                            colorClass = 'text-amber-600';
                            label = levels[1].status;
                        } else {
                            colorClass = 'text-emerald-600';
                            label = levels[0].status;
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

                <div className="bg-white dark:bg-slate-900 p-4 rounded-xl border border-slate-100 dark:border-slate-800 shadow-sm">
                    <div className="flex items-center gap-2 mb-2 text-slate-500 dark:text-slate-400 text-sm font-medium">
                        <Code2 className="w-4 h-4" /> {t('methodDetails.calls')}
                    </div>
                    <div className="flex justify-center">
                        <span className="text-2xl font-bold text-slate-900 dark:text-white">{methodData.calls?.length || 0}</span>
                    </div>
                </div>

                <div className="bg-white dark:bg-slate-900 p-4 rounded-xl border border-slate-100 dark:border-slate-800 shadow-sm">
                    <div className="flex items-center gap-2 mb-2 text-slate-500 dark:text-slate-400 text-sm font-medium">
                        <Box className="w-4 h-4" /> {t('methodDetails.parameters')}
                    </div>
                    <div className="flex justify-center">
                        <span className="text-2xl font-bold text-slate-900 dark:text-white">{methodData.parameters?.length || 0}</span>
                    </div>
                </div>
            </div>

            {/* Main Content Tabs */}
            <div className="bg-white dark:bg-slate-900 rounded-2xl border border-slate-100 dark:border-slate-800 shadow-sm overflow-hidden min-h-[500px]">
                <div className="flex border-b border-slate-100 dark:border-slate-800 overflow-x-auto justify-between items-center bg-white dark:bg-slate-900">
                    <div className="flex">
                        {[
                            { id: 'info', label: t('methodDetails.info') },
                            { id: 'inout', label: t('methodDetails.inOut') },
                            { id: 'source', label: t('methodDetails.source') },
                            { id: 'flowchart', label: t('methodDetails.flowChartTab') },
                            { id: 'calls', label: t('methodDetails.calls') },
                            { id: 'sequence', label: t('methodDetails.sequenceDiagram') }
                        ].map((tab) => (
                            <button
                                key={tab.id}
                                onClick={() => setActiveTab(tab.id as any)}
                                className={`px-6 py-4 text-sm font-medium transition-colors border-b-2 whitespace-nowrap ${activeTab === tab.id
                                    ? 'border-indigo-600 text-indigo-700 dark:text-indigo-400 bg-indigo-50/10'
                                    : 'border-transparent text-slate-500 dark:text-slate-500 hover:text-slate-700 dark:hover:text-slate-300 hover:bg-slate-50 dark:hover:bg-slate-800'
                                    }`}
                            >
                                {tab.label}
                            </button>
                        ))}
                    </div>
                    {/* Source Tab Toolbar */}
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
                        <div className="space-y-8">
                            {/* Annotations */}
                            {methodData.annotations && methodData.annotations.length > 0 && (
                                <div>
                                    <h3 className="text-lg font-bold text-slate-900 dark:text-white mb-3 flex items-center gap-2">
                                        <FileCode className="w-5 h-5 text-purple-500" />
                                        {t('classDetails.annotations')}
                                    </h3>
                                    <div className="flex flex-wrap gap-2">
                                        {methodData.annotations.map((anno, idx) => (
                                            <span key={idx} className="bg-purple-50 dark:bg-purple-900/20 text-purple-700 dark:text-purple-400 px-3 py-1 rounded-full text-sm font-mono border border-purple-100 dark:border-purple-800">
                                                @{anno}
                                            </span>
                                        ))}
                                    </div>
                                </div>
                            )}

                            {/* Overview (Description & AI Description) */}
                            <div>
                                <h3 className="text-lg font-bold text-slate-900 dark:text-white mb-3 flex items-center gap-2">
                                    <Info className="w-5 h-5 text-blue-500" />
                                    {t('classDetails.overview')}
                                </h3>
                                <div className="space-y-4">
                                    {methodData.description && (
                                        <div className="markdown-content bg-white dark:bg-[#1e1e1e] p-4 rounded-lg border border-slate-100 dark:border-slate-800 text-slate-700 dark:text-slate-300 shadow-sm">
                                            <Markdown remarkPlugins={[remarkGfm]}>{methodData.description}</Markdown>
                                        </div>
                                    )}
                                    <div className="relative">
                                        {/* AI Generated Badge */}
                                        <div className="absolute -top-3 -left-3 flex items-center gap-1.5 px-3 py-1.5 bg-gradient-to-r from-purple-500 to-indigo-500 text-white text-xs font-bold rounded-full shadow-lg z-10">
                                            <Sparkles className="w-3.5 h-3.5" />
                                            <span>{t('classDetails.aiGenerated')}</span>
                                        </div>
                                        <div className="markdown-content border border-slate-200 dark:border-slate-700 rounded-lg p-5 bg-slate-50/50 dark:bg-[#1e1e1e] text-slate-700 dark:text-slate-300">
                                            {overviewContent ? (
                                                <Markdown
                                                    remarkPlugins={[remarkGfm]}
                                                    components={{
                                                        code({ node, inline, className, children, ...props }: any) {
                                                            const match = /language-(\w+)/.exec(className || '');
                                                            /* Info 탭에서는 FlowChart를 제외하므로 Mermaid 렌더링 로직은 제거해도 되지만,
                                                               혹시 다른 다이어그램이 있을 수 있으니 유지하거나 단순 코드블록으로 처리 */
                                                            if (!inline && match && match[1] === 'mermaid') {
                                                                return <MermaidDiagram definition={String(children).replace(/\n$/, '')} />;
                                                            }
                                                            return !inline && match ? (
                                                                <pre {...props} className={className}>
                                                                    <code className={className} {...props}>
                                                                        {children}
                                                                    </code>
                                                                </pre>
                                                            ) : (
                                                                <code className={className} {...props}>
                                                                    {children}
                                                                </code>
                                                            );
                                                        }
                                                    }}
                                                >
                                                    {overviewContent}
                                                </Markdown>
                                            ) : (
                                                <p className="text-slate-400 dark:text-slate-500 italic text-sm">{t('classDetails.aiDescriptionPlaceholder')}</p>
                                            )}
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    )}

                    {activeTab === 'inout' && (
                        <div className="space-y-8">
                            {/* Input Parameters */}
                            <div>
                                <h3 className="text-lg font-bold text-slate-900 dark:text-white mb-4 flex items-center gap-2">
                                    <Box className="w-5 h-5 text-indigo-500" />
                                    {t('methodDetails.input')}
                                </h3>
                                {methodData.parameters && methodData.parameters.length > 0 ? (
                                    <div className="grid grid-cols-1 gap-3">
                                        {methodData.parameters.map((param, idx) => (
                                            <div key={idx} className="flex flex-col md:flex-row md:items-center gap-4 p-4 bg-slate-50 dark:bg-slate-800/40 border border-slate-100 dark:border-slate-800 rounded-lg shadow-sm hover:bg-slate-100 dark:hover:bg-slate-800/60 transition-colors">
                                                {/* Variable Name */}
                                                <div className="min-w-[140px] shrink-0">
                                                    <span className="font-mono text-sm font-bold text-slate-900 dark:text-slate-200">{param.name}</span>
                                                </div>

                                                {/* Type Info Group */}
                                                <div className="flex-1 flex flex-col md:flex-row md:items-center gap-4">
                                                    {/* Type Name */}
                                                    <div className="min-w-[200px]">
                                                        <span className="text-sm font-mono text-indigo-600 dark:text-indigo-400 font-bold bg-white dark:bg-slate-800 px-3 py-1.5 rounded border border-slate-200 dark:border-slate-700 block text-center md:text-left shadow-sm">
                                                            {param.type}
                                                        </span>
                                                    </div>

                                                    {/* Logical Name */}
                                                    <div className="flex-1 min-w-[150px]">
                                                        {param.type_logical_name ? (
                                                            <span className="text-sm text-slate-600 dark:text-slate-300 bg-white dark:bg-slate-800 px-3 py-1.5 rounded border border-slate-200 dark:border-slate-700 block truncate" title={param.type_logical_name}>
                                                                {param.type_logical_name}
                                                            </span>
                                                        ) : (
                                                            <span className="text-xs text-slate-400 dark:text-slate-600 italic px-2">
                                                                -
                                                            </span>
                                                        )}
                                                    </div>

                                                    {/* Package Name */}
                                                    <div className="flex-1 min-w-[200px]">
                                                        {param.type_package_name ? (
                                                            <span className="text-xs font-mono text-slate-500 dark:text-slate-400 bg-slate-100 dark:bg-slate-900/50 px-3 py-1.5 rounded border border-slate-200 dark:border-slate-800 block truncate" title={param.type_package_name}>
                                                                {param.type_package_name}
                                                            </span>
                                                        ) : (
                                                            <span className="text-xs text-slate-400 dark:text-slate-600 italic px-2">
                                                                -
                                                            </span>
                                                        )}
                                                    </div>
                                                </div>
                                            </div>
                                        ))}
                                    </div>
                                ) : (
                                    <p className="text-slate-400 dark:text-slate-500 italic text-sm pl-7">{t('methodDetails.noParameters')}</p>
                                )}
                            </div>

                            {/* Output (Return) */}
                            <div>
                                <h3 className="text-lg font-bold text-slate-900 dark:text-white mb-4 flex items-center gap-2">
                                    <Cpu className="w-5 h-5 text-emerald-500" />
                                    {t('methodDetails.output')}
                                </h3>
                                <div className="p-4 bg-emerald-50/30 dark:bg-emerald-500/5 border border-emerald-100 dark:border-emerald-900/30 rounded-lg">
                                    <div className="flex flex-col md:flex-row md:items-center gap-4">
                                        <div className="min-w-[140px] shrink-0">
                                            <span className="text-xs font-bold uppercase text-emerald-600 dark:text-emerald-500 tracking-wider">RETURNS</span>
                                        </div>

                                        {/* Type Info Group */}
                                        <div className="flex-1 flex flex-col md:flex-row md:items-center gap-4">
                                            {/* Type Name - Matching Input Style */}
                                            <div className="min-w-[200px]">
                                                <span className="text-sm font-mono text-indigo-600 dark:text-indigo-400 font-bold bg-white dark:bg-slate-800 px-3 py-1.5 rounded border border-slate-200 dark:border-slate-700 block text-center md:text-left shadow-sm">
                                                    {methodData.return_type}
                                                </span>
                                            </div>

                                            {/* Logical Name */}
                                            <div className="flex-1 min-w-[150px]">
                                                {methodData.return_type_detail?.logical_name ? (
                                                    <span className="text-sm text-slate-600 dark:text-slate-300 bg-white dark:bg-slate-800 px-3 py-1.5 rounded border border-slate-200 dark:border-slate-700 block truncate" title={methodData.return_type_detail.logical_name}>
                                                        {methodData.return_type_detail.logical_name}
                                                    </span>
                                                ) : (
                                                    <span className="text-xs text-slate-400 dark:text-slate-600 italic px-2">
                                                        -
                                                    </span>
                                                )}
                                            </div>

                                            {/* Package Name */}
                                            <div className="flex-1 min-w-[200px]">
                                                {methodData.return_type_detail?.package_name ? (
                                                    <span className="text-xs font-mono text-slate-500 dark:text-slate-400 bg-slate-100 dark:bg-slate-900/50 px-3 py-1.5 rounded border border-slate-200 dark:border-slate-800 block truncate" title={methodData.return_type_detail.package_name}>
                                                        {methodData.return_type_detail.package_name}
                                                    </span>
                                                ) : (
                                                    <span className="text-xs text-slate-400 dark:text-slate-600 italic px-2">
                                                        -
                                                    </span>
                                                )}
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>

                            {/* Exceptions */}
                            <div>
                                <h3 className="text-lg font-bold text-slate-900 dark:text-white mb-4 flex items-center gap-2">
                                    <FileCode className="w-5 h-5 text-red-500" />
                                    {t('methodDetails.exceptions')}
                                </h3>
                                {methodData.exceptions && methodData.exceptions.length > 0 ? (
                                    <div className="flex flex-wrap gap-2">
                                        {methodData.exceptions.map((exc, idx) => (
                                            <span key={idx} className="bg-red-50 dark:bg-red-900/10 text-red-600 dark:text-red-400 px-3 py-1.5 rounded-lg text-sm font-mono border border-red-100 dark:border-red-900/20">
                                                {exc}
                                            </span>
                                        ))}
                                    </div>
                                ) : (
                                    <p className="text-slate-400 dark:text-slate-500 italic text-sm pl-7">{t('methodDetails.noExceptions')}</p>
                                )}
                            </div>
                        </div>
                    )}


                    {activeTab === 'source' && (
                        <div className="h-full flex flex-col">
                            <SourceCodeViewer ref={codeRef} source={methodData.source || `// ${t('classDetails.noSource')}`} />
                        </div>
                    )}

                    {activeTab === 'flowchart' && (
                        <div>
                            <div className="flex items-center justify-between px-1 mb-4">
                                <h3 className="text-lg font-bold text-slate-900 dark:text-white flex items-center gap-2">
                                    <GitMerge className="w-5 h-5 text-indigo-500" />
                                    <span>
                                        Flow Chart: <span className="font-mono text-indigo-600 dark:text-indigo-400">{methodData.class_name}.{methodData.name}</span>
                                    </span>
                                </h3>
                            </div>

                            <div className="relative">
                                {/* AI Generated Badge */}
                                <div className="absolute -top-3 -left-3 flex items-center gap-1.5 px-3 py-1.5 bg-gradient-to-r from-purple-500 to-indigo-500 text-white text-xs font-bold rounded-full shadow-lg z-10">
                                    <Sparkles className="w-3.5 h-3.5" />
                                    <span>{t('classDetails.aiGenerated')}</span>
                                </div>
                                {flowChartContent ? (
                                    <div className="bg-white dark:bg-slate-900 p-4 rounded-xl border border-slate-100 dark:border-slate-800 shadow-sm overflow-auto pt-6">
                                        <MermaidDiagram definition={flowChartContent} />
                                    </div>
                                ) : (
                                    <div className="flex flex-col items-center justify-center py-20 bg-slate-50 dark:bg-slate-800/20 rounded-xl border border-dashed border-slate-200 dark:border-slate-800 pt-10">
                                        <GitMerge className="w-12 h-12 text-slate-300 dark:text-slate-700 mb-4" />
                                        <p className="text-slate-400 dark:text-slate-500 italic">{t('common.noData')}</p>
                                    </div>
                                )}
                            </div>
                        </div>
                    )}

                    {activeTab === 'calls' && (
                        <div>
                            <h3 className="text-lg font-bold text-slate-900 dark:text-white mb-4 px-1">
                                {t('methodDetails.calls')} ({methodData.calls?.length || 0})
                            </h3>
                            <VirtualizedTable
                                data={methodData.calls || []}
                                columns={callColumns}
                                height={500}
                                rowHeight={50}
                                headerHeight={45}
                                hoverable
                                emptyMessage={t('methodDetails.noCalls')}
                            />
                        </div>
                    )}

                    {activeTab === 'sequence' && (
                        <div className="space-y-4">
                            <div className="flex items-center justify-between px-1">
                                <h3 className="text-lg font-bold text-slate-900 dark:text-white flex items-center gap-2">
                                    <GitMerge className="w-5 h-5 text-indigo-500" />
                                    {t('methodDetails.sequenceDiagram')}
                                </h3>
                            </div>

                            {isSequenceLoading ? (
                                <div className="flex flex-col items-center justify-center py-20 bg-slate-50 dark:bg-slate-800/20 rounded-xl border border-dashed border-slate-200 dark:border-slate-800">
                                    <div className="w-10 h-10 border-4 border-indigo-500 border-t-transparent rounded-full animate-spin mb-4" />
                                    <p className="text-slate-500 dark:text-slate-400 text-sm animate-pulse">{t('common.loading')}</p>
                                </div>
                            ) : sequenceData?.content ? (
                                <div className="bg-white dark:bg-slate-900 rounded-xl border border-slate-100 dark:border-slate-800 p-4 shadow-sm overflow-hidden">
                                    <div className="markdown-content">
                                        {sequenceData.content.split('```mermaid').map((part, i) => {
                                            if (i === 0) return part.trim() ? <div key={i} className="mb-6 mdx-content"><Markdown remarkPlugins={[remarkGfm]}>{part}</Markdown></div> : null;
                                            const [diagram, ...rest] = part.split('```');
                                            return (
                                                <React.Fragment key={i}>
                                                    <MermaidDiagram definition={diagram.trim()} />
                                                    {rest.join('```').trim() && (
                                                        <div className="mt-6 mdx-content text-slate-700 dark:text-slate-300">
                                                            <Markdown remarkPlugins={[remarkGfm]}>{rest.join('```')}</Markdown>
                                                        </div>
                                                    )}
                                                </React.Fragment>
                                            );
                                        })}
                                    </div>
                                </div>
                            ) : (
                                <div className="flex flex-col items-center justify-center py-20 bg-slate-50 dark:bg-slate-800/20 rounded-xl border border-dashed border-slate-200 dark:border-slate-800">
                                    <GitMerge className="w-12 h-12 text-slate-300 dark:text-slate-700 mb-4" />
                                    <p className="text-slate-400 dark:text-slate-500 italic">{t('common.noData')}</p>
                                </div>
                            )}
                        </div>
                    )}
                </div>
            </div>
            {/* Complexity Help Modal */}
            {showComplexityHelp && (
                <div className="fixed inset-0 z-50 flex items-center justify-center p-4 bg-black/70 backdrop-blur-sm animate-in fade-in duration-200">
                    <div
                        className="bg-white dark:bg-slate-800 rounded-2xl shadow-2xl border border-slate-200 dark:border-slate-700 w-full max-w-2xl max-h-[90vh] overflow-hidden flex flex-col animate-in zoom-in-95 duration-200"
                        onClick={(e) => e.stopPropagation()}
                    >
                        {/* Modal Header */}
                        <div className="p-6 border-b border-slate-100 dark:border-slate-700 flex items-center justify-between bg-slate-50/50 dark:bg-slate-800/50">
                            <div className="flex items-center gap-3">
                                <div className="p-2 rounded-lg bg-indigo-50 dark:bg-indigo-500/10 text-indigo-600 dark:text-indigo-400">
                                    <Cpu className="w-5 h-5" />
                                </div>
                                <h2 className="text-xl font-bold text-slate-900 dark:text-white">
                                    {t('methodDetails.complexityHelp.title')}
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
                        <div className="p-6 overflow-y-auto space-y-8">
                            {/* Description */}
                            <div>
                                <p className="text-slate-600 dark:text-slate-400 leading-relaxed">
                                    {t('methodDetails.complexityHelp.description')}
                                </p>
                            </div>

                            {/* Calculation Examples */}
                            <div>
                                <h3 className="text-sm font-bold text-slate-900 dark:text-white uppercase tracking-wider mb-4">
                                    {t('methodDetails.complexityHelp.examplesTitle')}
                                </h3>
                                <div className="rounded-xl border border-slate-200 dark:border-slate-800 overflow-hidden">
                                    <table className="w-full text-sm text-left">
                                        <thead className="bg-slate-50 dark:bg-slate-800/50 text-slate-500 dark:text-slate-400 font-medium">
                                            <tr>
                                                <th className="px-4 py-3 border-b border-slate-200 dark:border-slate-800">{t('methodDetails.complexityHelp.control')}</th>
                                                <th className="px-4 py-3 border-b border-slate-200 dark:border-slate-800 text-center">{t('methodDetails.complexityHelp.increase')}</th>
                                                <th className="px-4 py-3 border-b border-slate-200 dark:border-slate-800">{t('methodDetails.complexityHelp.example')}</th>
                                            </tr>
                                        </thead>
                                        <tbody className="divide-y divide-slate-100 dark:divide-slate-800">
                                            {(t('methodDetails.complexityHelp.structures', { returnObjects: true }) as any).map((item: any, idx: number) => (
                                                <tr key={idx} className="hover:bg-slate-50 dark:hover:bg-slate-800/30 transition-colors">
                                                    <td className="px-4 py-3 font-medium text-slate-700 dark:text-slate-300">{item.name}</td>
                                                    <td className="px-4 py-3 text-center font-bold text-indigo-600 dark:text-indigo-400">{item.points}</td>
                                                    <td className="px-4 py-3 text-xs font-mono text-slate-500 dark:text-slate-500">{item.desc}</td>
                                                </tr>
                                            ))}
                                        </tbody>
                                    </table>
                                </div>
                            </div>

                            {/* Guideline Levels */}
                            <div>
                                <h3 className="text-sm font-bold text-slate-900 dark:text-white uppercase tracking-wider mb-4">
                                    {t('methodDetails.complexityHelp.guideTitle')}
                                </h3>
                                <div className="grid grid-cols-1 gap-3">
                                    {(t('methodDetails.complexityHelp.levels', { returnObjects: true }) as any).map((level: any, idx: number) => (
                                        <div key={idx} className="flex items-center gap-4 p-4 rounded-xl border border-slate-100 dark:border-slate-800 bg-slate-50/30 dark:bg-slate-800/10">
                                            <div className="flex flex-col min-w-[80px]">
                                                <span className="text-xs text-slate-400 font-medium mb-1 uppercase tracking-tighter">Score</span>
                                                <span className="text-lg font-bold text-slate-900 dark:text-white font-mono">{level.score}</span>
                                            </div>
                                            <div className="w-px h-8 bg-slate-200 dark:bg-slate-700" />
                                            <div className="flex-1">
                                                <div className="flex items-center gap-2 mb-1">
                                                    <span className={`w-2 h-2 rounded-full bg-${level.color}-500 shadow-[0_0_8px_rgba(var(--color-${level.color}-500),0.5)]`} />
                                                    <span className={`text-sm font-bold text-${level.color}-600 dark:text-${level.color}-400`}>{level.status}</span>
                                                </div>
                                                <p className="text-xs text-slate-500 dark:text-slate-500 leading-snug">{level.action}</p>
                                            </div>
                                        </div>
                                    ))}
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
        </div >
    );
};


export default MethodDetails;
