import React from 'react';
import { useTranslation } from 'react-i18next';
import { useParams, useNavigate, useSearchParams } from 'react-router-dom';
import { useQuery } from '@tanstack/react-query';
import axios from 'axios';
import { ArrowLeft, Code, Activity, Layers, Database, AlertCircle, Sparkles, HelpCircle, Check, GitMerge } from 'lucide-react';
import Markdown from 'react-markdown';
import remarkGfm from 'remark-gfm';
import MermaidDiagram from '../components/MermaidDiagram';
import SourceCodeViewer from '../components/SourceCodeViewer';

// ... (inside component)



interface SqlDetailData {
    id: string;
    mapper_name: string;
    project_name: string;
    sql_type: string;
    sql_content: string;
    logical_name?: string;
    description?: string;
    ai_description?: string;
    complexity_score?: number;
    tables?: string; // stringified json
    columns?: string; // stringified json
    called_by?: {
        method_name: string;
        class_name: string;
        package_name: string;
        class_logical_name?: string;
    }[];
}

const SqlDetails: React.FC = () => {
    const { t } = useTranslation();
    const navigate = useNavigate();
    const { projectName, sqlId } = useParams<{ projectName: string, sqlId: string }>();
    const [searchParams] = useSearchParams();
    const mapperName = searchParams.get('mapper');
    const [activeTab, setActiveTab] = React.useState<'analysis' | 'sql' | 'calledBy'>('analysis');
    const [showComplexityHelp, setShowComplexityHelp] = React.useState(false);

    const { data: sqlData, isLoading, error } = useQuery<SqlDetailData>({
        queryKey: ['sqls', projectName, sqlId, mapperName],
        queryFn: async () => {
            const { data } = await axios.get<SqlDetailData>(
                `/api/v1/projects/${encodeURIComponent(projectName || '')}/sqls/${encodeURIComponent(sqlId || '')}`,
                {
                    params: { mapper_name: mapperName }
                }
            );
            return data;
        },
        enabled: !!(projectName && sqlId)
    });

    const { overviewContent, flowChartContent } = React.useMemo(() => {
        if (!sqlData?.ai_description) return { overviewContent: '', flowChartContent: '' };

        // Split by the specific header using regex
        const splitRegex = /#+\s*\*\*\[?(?:Visual\s+)?Flow(?:\s*Chart)?\]?\*\*/i;
        const parts = sqlData.ai_description.split(splitRegex);

        const overview = parts[0].trim();
        let chart = parts.length > 1 ? parts.slice(1)[0] : ''; // Take the section after header

        // The chart section might have subsequent sections (like Tables & Conditions), so we should be careful.
        // Actually, the prompt puts Visual Flow before Tables. So splitting by Visual Flow gives:
        // [0]: Operation...
        // [1]: Mermaid Code... --- ### Tables...

        // Let's refine: The prompt structure is defined sequences.
        // But simplest way is extracting mermaid code block from the whole text or the part.

        // If we want to display the flowchart separately, we should extract it and REMOVE it from overview.
        // But current prompt puts it IN BETWEEN sections.

        // Strategy: 
        // 1. Extract mermaid block anywhere in text for the Visual Tab/Section
        // 2. Render the whole text in Description (excluding the mermaid block if it looks ugly as code) 
        // OR better: use custom renderer in Markdown component to render <MermaidDiagram> instead of <pre><code>

        // Let's try Custom Renderer approach for SqlDetails to keep it simple in one description tab or separate?
        // User asked for "similar to Method flowchart". Method has a separate TAB or dedicated section.

        // Let's extract all mermaid blocks and use the first one as the Flow Chart.
        const mermaidMatch = sqlData.ai_description.match(/```mermaid([\s\S]*?)```/);
        const extractedChart = mermaidMatch ? mermaidMatch[1].trim() : '';

        // Overview is everything MINUS the mermaid block (to avoid duplication if we show it specially)
        // Or we just keep it and let Markdown renderer handle it.
        // Let's keep the content clean.

        return {
            overviewContent: sqlData.ai_description,
            flowChartContent: extractedChart
        };
    }, [sqlData?.ai_description]);

    if (isLoading) {
        return (
            <div className="flex items-center justify-center h-full">
                <div className="w-8 h-8 border-4 border-indigo-500 border-t-transparent rounded-full animate-spin" />
            </div>
        );
    }

    if (error || !sqlData) {
        return (
            <div className="flex flex-col items-center justify-center h-96 text-center">
                <AlertCircle className="w-12 h-12 text-red-500 mb-4" />
                <h3 className="text-lg font-bold text-slate-900 dark:text-white mb-2">{t('common.error', 'Error')}</h3>
                <p className="text-slate-500 dark:text-slate-400 mb-6">
                    {t('sqlDetails.notFound', 'SQL statement not found.')}
                </p>
                <button
                    onClick={() => navigate(-1)}
                    className="px-4 py-2 bg-indigo-600 text-white rounded-lg hover:bg-indigo-700 transition-colors"
                >
                    {t('common.back', 'Back')}
                </button>
            </div>
        );
    }



    return (
        <div className="space-y-6 animate-in fade-in duration-500 pb-20">
            {/* Header */}
            <div className="flex items-center gap-4 border-b border-slate-200 dark:border-slate-800 pb-6">
                <button
                    onClick={() => navigate(-1)}
                    className="p-2 hover:bg-slate-100 dark:hover:bg-slate-800 rounded-lg transition-colors text-slate-500 dark:text-slate-400"
                    title={t('common.back', 'Back')}
                >
                    <ArrowLeft className="w-5 h-5" />
                </button>
                <div>
                    <div className="flex items-center gap-3 mb-1">
                        <span className={`inline-flex items-center px-2.5 py-0.5 rounded-md text-xs font-bold ring-1 ring-inset uppercase ${sqlData.sql_type?.toUpperCase() === 'SELECT' ? 'bg-blue-50 text-blue-700 ring-blue-700/10 dark:bg-blue-400/10 dark:text-blue-400 dark:ring-blue-400/30' :
                            sqlData.sql_type?.toUpperCase() === 'INSERT' ? 'bg-green-50 text-green-700 ring-green-600/20 dark:bg-green-400/10 dark:text-green-400 dark:ring-green-400/30' :
                                sqlData.sql_type?.toUpperCase() === 'UPDATE' ? 'bg-amber-50 text-amber-700 ring-amber-600/20 dark:bg-amber-400/10 dark:text-amber-400 dark:ring-amber-400/30' :
                                    sqlData.sql_type?.toUpperCase() === 'DELETE' ? 'bg-red-50 text-red-700 ring-red-600/10 dark:bg-red-400/10 dark:text-red-400 dark:ring-red-400/30' :
                                        'bg-slate-50 text-slate-600 ring-slate-500/10 dark:bg-slate-400/10 dark:text-slate-400 dark:ring-slate-400/20'
                            }`}>
                            {sqlData.sql_type}
                        </span>
                        <h1 className="text-2xl font-bold text-slate-900 dark:text-white font-mono">
                            {sqlData.id}
                        </h1>
                    </div>
                    {sqlData.logical_name && (
                        <p className="text-lg text-slate-600 dark:text-slate-300">
                            {sqlData.logical_name}
                        </p>
                    )}
                </div>
            </div>

            {/* Top Section: Analysis & Metadata Grid */}
            {/* Top Section: Metadata Cards */}
            <div className="grid grid-cols-1 md:grid-cols-3 gap-6">
                {/* Project Card */}
                <div className="bg-white dark:bg-slate-900 rounded-xl border border-slate-200 dark:border-slate-800 shadow-sm overflow-hidden p-6 relative group hover:border-indigo-500/50 transition-colors">
                    <div className="absolute top-0 right-0 p-4 opacity-10 group-hover:opacity-20 transition-opacity">
                        <Database className="w-16 h-16 text-indigo-500" />
                    </div>
                    <div>
                        <span className="text-xs font-semibold text-slate-500 dark:text-slate-400 uppercase tracking-wider block mb-2">
                            {t('sqlList.project', 'Project')}
                        </span>
                        <span className="text-lg font-bold text-slate-900 dark:text-white block truncate" title={sqlData.project_name}>
                            {sqlData.project_name}
                        </span>
                    </div>
                </div>

                {/* Mapper Card */}
                <div className="bg-white dark:bg-slate-900 rounded-xl border border-slate-200 dark:border-slate-800 shadow-sm overflow-hidden p-6 relative group hover:border-indigo-500/50 transition-colors">
                    <div className="absolute top-0 right-0 p-4 opacity-10 group-hover:opacity-20 transition-opacity">
                        <Layers className="w-16 h-16 text-blue-500" />
                    </div>
                    <div>
                        <span className="text-xs font-semibold text-slate-500 dark:text-slate-400 uppercase tracking-wider block mb-2">
                            {t('sqlList.mapperName', 'Mapper')}
                        </span>
                        <span className="text-lg font-bold text-slate-900 dark:text-white block break-words" title={sqlData.mapper_name}>
                            {sqlData.mapper_name}
                        </span>
                    </div>
                </div>

                {/* Complexity Card */}
                <div className="bg-white dark:bg-slate-900 rounded-xl border border-slate-200 dark:border-slate-800 shadow-sm overflow-hidden p-6 relative group hover:border-indigo-500/50 transition-colors">
                    <div className="flex items-center justify-between mb-2">
                        <div className="flex items-center gap-2 text-slate-500 dark:text-slate-400 text-sm font-medium z-10">
                            {t('sqlList.complexity', 'Complexity')}
                        </div>
                        <button
                            onClick={() => setShowComplexityHelp(true)}
                            className="text-slate-400 hover:text-indigo-500 transition-colors p-0.5 rounded-full hover:bg-slate-100 dark:hover:bg-slate-800 z-10"
                        >
                            <HelpCircle className="w-3.5 h-3.5" />
                        </button>
                    </div>

                    <div className="absolute top-0 right-0 p-4 opacity-10 group-hover:opacity-20 transition-opacity pointer-events-none">
                        <Activity className="w-16 h-16 text-emerald-500" />
                    </div>

                    <div
                        className="flex items-baseline justify-center gap-2 cursor-pointer mt-2"
                        onClick={() => setShowComplexityHelp(true)}
                    >
                        {(() => {
                            const score = sqlData.complexity_score || 0;
                            let colorClass = 'text-emerald-500';
                            let label = 'simple';

                            if (score >= 14) {
                                colorClass = 'text-red-500';
                                label = 'very_complex';
                            } else if (score >= 8) {
                                colorClass = 'text-red-500'; // complex usually red/orange
                                label = 'complex';
                            } else if (score >= 4) {
                                colorClass = 'text-amber-500';
                                label = 'medium';
                            }

                            return (
                                <>
                                    <span className={`text-3xl font-bold ${colorClass}`}>{score.toLocaleString()}</span>
                                    <span className={`text-xs font-medium ${colorClass} bg-opacity-10 px-1.5 py-0.5 rounded border border-current lowercase`}>
                                        {label}
                                    </span>
                                </>
                            );
                        })()}
                    </div>
                </div>
            </div>

            {/* Bottom Section: Tabs */}
            <div className="bg-white dark:bg-slate-900 rounded-xl border border-slate-200 dark:border-slate-800 shadow-sm overflow-hidden flex flex-col min-h-[400px]">
                {/* Tab Header */}
                <div className="flex border-b border-slate-200 dark:border-slate-800">
                    <button
                        onClick={() => setActiveTab('analysis')}
                        className={`px-6 py-4 text-sm font-medium flex items-center gap-2 border-b-2 transition-colors ${activeTab === 'analysis'
                            ? 'border-indigo-500 text-indigo-600 dark:text-indigo-400 bg-slate-50/50 dark:bg-slate-800/50'
                            : 'border-transparent text-slate-500 hover:text-slate-700 dark:text-slate-400 dark:hover:text-slate-200'
                            }`}
                    >
                        <Activity className="w-4 h-4" />
                        {t('sqlDetails.analysis', 'Analysis')}
                    </button>
                    <button
                        onClick={() => setActiveTab('sql')}
                        className={`px-6 py-4 text-sm font-medium flex items-center gap-2 border-b-2 transition-colors ${activeTab === 'sql'
                            ? 'border-indigo-500 text-indigo-600 dark:text-indigo-400 bg-slate-50/50 dark:bg-slate-800/50'
                            : 'border-transparent text-slate-500 hover:text-slate-700 dark:text-slate-400 dark:hover:text-slate-200'
                            }`}
                    >
                        <Code className="w-4 h-4" />
                        {t('sqlDetails.sqlSource', 'SQL Source')}
                    </button>
                    <button
                        onClick={() => setActiveTab('calledBy')}
                        className={`px-6 py-4 text-sm font-medium flex items-center gap-2 border-b-2 transition-colors ${activeTab === 'calledBy'
                            ? 'border-indigo-500 text-indigo-600 dark:text-indigo-400 bg-slate-50/50 dark:bg-slate-800/50'
                            : 'border-transparent text-slate-500 hover:text-slate-700 dark:text-slate-400 dark:hover:text-slate-200'
                            }`}
                    >
                        <Layers className="w-4 h-4" />
                        {t('sqlDetails.calledBy', 'Called By')}
                        <span className="ml-1 text-xs bg-slate-100 dark:bg-slate-700 px-2 py-0.5 rounded-full text-slate-600 dark:text-slate-300">
                            {sqlData.called_by?.length || 0}
                        </span>
                    </button>
                </div>

                {/* Tab Content */}
                <div className="flex-1">
                    {activeTab === 'analysis' && (
                        <div className="p-8 space-y-8 animate-in fade-in slide-in-from-bottom-2 duration-300">


                            <div>
                                <h3 className="text-lg font-bold text-slate-900 dark:text-white mb-3 flex items-center gap-2">
                                    <div className="w-1 h-6 bg-indigo-500 rounded-full"></div>
                                    {t('common.description', 'Description')}
                                </h3>
                                <div className="relative mt-4">
                                    {/* AI Generated Badge */}
                                    <div className="absolute -top-3 -left-3 flex items-center gap-1.5 px-3 py-1.5 bg-gradient-to-r from-purple-500 to-indigo-500 text-white text-xs font-bold rounded-full shadow-lg z-10">
                                        <Sparkles className="w-3.5 h-3.5" />
                                        <span>{t('classDetails.aiGenerated', 'AI Generated')}</span>
                                    </div>
                                    <div className="markdown-content border border-slate-200 dark:border-slate-700 rounded-lg p-4 bg-slate-50/50 dark:bg-[#1e1e1e] max-h-[600px] overflow-y-auto text-slate-700 dark:text-slate-300">
                                        {sqlData.ai_description ? (
                                            <Markdown
                                                remarkPlugins={[remarkGfm]}
                                                components={{
                                                    code({ node, inline, className, children, ...props }: any) {
                                                        const match = /language-(\w+)/.exec(className || '');
                                                        if (!inline && match && match[1] === 'mermaid') {
                                                            return (
                                                                <div className="my-4 p-4 bg-white dark:bg-slate-900 rounded-xl border border-slate-200 dark:border-slate-800 shadow-sm overflow-auto">
                                                                    <div className="flex items-center gap-2 mb-2 text-xs font-bold text-slate-500 uppercase tracking-wider">
                                                                        <GitMerge className="w-4 h-4 text-indigo-500" />
                                                                        SQL Flow
                                                                    </div>
                                                                    <MermaidDiagram definition={String(children).replace(/\n$/, '')} />
                                                                </div>
                                                            );
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
                                                {sqlData.ai_description}
                                            </Markdown>
                                        ) : (
                                            <span className="text-slate-400 dark:text-slate-500 italic block">
                                                {t('sqlDetails.noAiDescription', 'No AI analysis available.')}
                                            </span>
                                        )}
                                    </div>
                                </div>
                            </div>
                        </div>
                    )}

                    {activeTab === 'sql' && (
                        <div className="h-full flex flex-col pt-4">
                            <SourceCodeViewer source={sqlData.sql_content} language="sql" />
                        </div>
                    )}

                    {activeTab === 'calledBy' && (
                        <div className="p-0">
                            {!sqlData.called_by || sqlData.called_by.length === 0 ? (
                                <div className="p-12 text-center text-slate-400 dark:text-slate-500 text-sm italic">
                                    {t('sqlDetails.noCallers', 'No usage found.')}
                                </div>
                            ) : (
                                <div className="divide-y divide-slate-100 dark:divide-slate-800">
                                    {sqlData.called_by.map((caller, i) => (
                                        <button
                                            key={i}
                                            onClick={() => {
                                                navigate(`/projects/${encodeURIComponent(projectName || '')}/classes/${encodeURIComponent(caller.class_name)}/methods/${encodeURIComponent(caller.method_name)}?package=${encodeURIComponent(caller.package_name)}`);
                                            }}
                                            className="w-full text-left p-4 hover:bg-slate-50 dark:hover:bg-slate-800/50 transition-colors group flex items-start gap-4"
                                        >
                                            <div className="mt-1 p-2 bg-indigo-50 dark:bg-indigo-500/10 rounded text-indigo-600 dark:text-indigo-400">
                                                <Code className="w-4 h-4" />
                                            </div>
                                            <div>
                                                <div className="font-mono text-sm font-semibold text-indigo-600 dark:text-indigo-400 mb-0.5 group-hover:underline">
                                                    {caller.method_name}
                                                </div>
                                                <div className="text-xs text-slate-500 dark:text-slate-400 text-base" title={`${caller.package_name}.${caller.class_name}`}>
                                                    <span className="font-medium text-slate-700 dark:text-slate-300">{caller.class_name}</span>
                                                    <span className="mx-2 text-slate-300">|</span>
                                                    {caller.package_name}
                                                </div>
                                                {caller.class_logical_name && (
                                                    <div className="text-xs text-slate-400 dark:text-slate-500 mt-0.5">
                                                        {caller.class_logical_name}
                                                    </div>
                                                )}
                                            </div>
                                        </button>
                                    ))}
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
                        className="bg-white dark:bg-slate-800 rounded-2xl shadow-2xl border border-slate-200 dark:border-slate-700 w-full max-w-lg max-h-[90vh] overflow-hidden flex flex-col animate-in zoom-in-95 duration-200"
                        onClick={(e) => e.stopPropagation()}
                    >
                        {/* Modal Header */}
                        <div className="p-6 border-b border-slate-100 dark:border-slate-700 flex items-center justify-between bg-slate-50/50 dark:bg-slate-800/50">
                            <div className="flex items-center gap-3">
                                <div className="p-2 rounded-lg bg-indigo-50 dark:bg-indigo-500/10 text-indigo-600 dark:text-indigo-400">
                                    <Activity className="w-5 h-5" />
                                </div>
                                <h2 className="text-xl font-bold text-slate-900 dark:text-white">
                                    {t('sqlDetails.complexityHelp.title', 'SQL Complexity Guideline')}
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
                            {/* Calculation Basis */}
                            <div>
                                <h3 className="text-sm font-bold text-slate-900 dark:text-white uppercase tracking-wider mb-3">
                                    {t('sqlDetails.complexityHelp.calculationBasis', 'Calculation Basis')}
                                </h3>
                                <div className="bg-slate-50 dark:bg-slate-800/50 rounded-xl border border-slate-200 dark:border-slate-800 p-4 text-sm text-slate-600 dark:text-slate-400">
                                    <p className="leading-relaxed mb-2">{t('sqlDetails.complexityHelp.calculationDesc', 'Starting from a base score of 1, add 1 point for each of the following:')}</p>
                                    <ul className="list-disc pl-5 space-y-1">
                                        <li>{t('sqlDetails.complexityHelp.basis.tables', 'Tables')}</li>
                                        <li>{t('sqlDetails.complexityHelp.basis.joins', 'Joins')}</li>
                                        <li>{t('sqlDetails.complexityHelp.basis.subqueries', 'Subqueries')}</li>
                                        <li>{t('sqlDetails.complexityHelp.basis.where', 'WHERE conditions')}</li>
                                        <li>{t('sqlDetails.complexityHelp.basis.groupBy', 'GROUP BY columns')}</li>
                                        <li>{t('sqlDetails.complexityHelp.basis.orderBy', 'ORDER BY columns')}</li>
                                        <li>{t('sqlDetails.complexityHelp.basis.having', 'HAVING conditions')}</li>
                                    </ul>
                                </div>
                            </div>

                            {/* Reference Levels */}
                            <div>
                                <h3 className="text-sm font-bold text-slate-900 dark:text-white uppercase tracking-wider mb-3">
                                    {t('sqlDetails.complexityHelp.rangeTitle', 'Complexity Range')}
                                </h3>
                                <div className="space-y-3">
                                    <div className="flex items-start gap-4 p-3 rounded-xl border border-emerald-100 dark:border-emerald-900/30 bg-emerald-50/30 dark:bg-emerald-900/10">
                                        <div className="font-mono font-bold text-emerald-600 dark:text-emerald-400 min-w-[60px] text-center">1 ~ 3</div>
                                        <div>
                                            <div className="font-bold text-emerald-700 dark:text-emerald-300 text-sm">
                                                {t('sqlDetails.complexityHelp.ranges.simple.level', 'simple')}
                                            </div>
                                            <div className="text-xs text-slate-600 dark:text-slate-400 mt-0.5">
                                                {t('sqlDetails.complexityHelp.ranges.simple.desc', 'Simple SQL')}
                                            </div>
                                        </div>
                                    </div>
                                    <div className="flex items-start gap-4 p-3 rounded-xl border border-amber-100 dark:border-amber-900/30 bg-amber-50/30 dark:bg-amber-900/10">
                                        <div className="font-mono font-bold text-amber-600 dark:text-amber-400 min-w-[60px] text-center">4 ~ 7</div>
                                        <div>
                                            <div className="font-bold text-amber-700 dark:text-amber-300 text-sm">
                                                {t('sqlDetails.complexityHelp.ranges.medium.level', 'medium')}
                                            </div>
                                            <div className="text-xs text-slate-600 dark:text-slate-400 mt-0.5">
                                                {t('sqlDetails.complexityHelp.ranges.medium.desc', 'Inspection recommended')}
                                            </div>
                                        </div>
                                    </div>
                                    <div className="flex items-start gap-4 p-3 rounded-xl border border-red-100 dark:border-red-900/30 bg-red-50/30 dark:bg-red-900/10">
                                        <div className="font-mono font-bold text-red-600 dark:text-red-400 min-w-[60px] text-center">8 ~ 13</div>
                                        <div>
                                            <div className="font-bold text-red-700 dark:text-red-300 text-sm">
                                                {t('sqlDetails.complexityHelp.ranges.complex.level', 'complex')}
                                            </div>
                                            <div className="text-xs text-slate-600 dark:text-slate-400 mt-0.5">
                                                {t('sqlDetails.complexityHelp.ranges.complex.desc', 'Consider refactoring')}
                                            </div>
                                        </div>
                                    </div>
                                    <div className="flex items-start gap-4 p-3 rounded-xl border border-red-200 dark:border-red-800/50 bg-red-100/30 dark:bg-red-900/20">
                                        <div className="font-mono font-bold text-red-700 dark:text-red-500 min-w-[60px] text-center">13 +</div>
                                        <div>
                                            <div className="font-bold text-red-800 dark:text-red-200 text-sm">
                                                {t('sqlDetails.complexityHelp.ranges.veryComplex.level', 'very_complex')}
                                            </div>
                                            <div className="text-xs text-slate-600 dark:text-slate-400 mt-0.5">
                                                {t('sqlDetails.complexityHelp.ranges.veryComplex.desc', 'Priority for refactoring')}
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>

                        {/* Modal Footer */}
                        <div className="p-6 border-t border-slate-100 dark:border-slate-700 bg-slate-50/50 dark:bg-slate-800/50 flex justify-end">
                            <button
                                onClick={() => setShowComplexityHelp(false)}
                                className="px-6 py-2 bg-indigo-600 hover:bg-indigo-700 text-white rounded-xl font-bold shadow-lg shadow-indigo-500/25 transition-all active:scale-95"
                            >
                                {t('common.confirm', 'Confirm')}
                            </button>
                        </div>
                    </div>
                </div>
            )}
        </div>
    );
};

export default SqlDetails;
