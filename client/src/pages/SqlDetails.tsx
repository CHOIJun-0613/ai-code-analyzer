import React from 'react';
import { useTranslation } from 'react-i18next';
import { useParams, useNavigate, useSearchParams } from 'react-router-dom';
import { useQuery, useQueryClient } from '@tanstack/react-query';
import axios from 'axios';
import { ArrowLeft, Code, Activity, Layers, Database, AlertCircle, HelpCircle, Check, GitMerge, RefreshCw } from 'lucide-react';
import Markdown from 'react-markdown';
import remarkGfm from 'remark-gfm';
import MermaidDiagram from '../components/MermaidDiagram';
import SourceCodeViewer from '../components/SourceCodeViewer';
import { SqlAnalysisModal } from '../components/SqlAnalysisModal';

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
    flow_json?: {  // 서버에서 정규화된 SQL Flow JSON
        summary: string;
        nodes: any[];
        edges: any[];
    };
}

import SqlFlowViewer from '../components/SqlFlowViewer';

// ... (inside component)

const SqlDetails: React.FC = () => {
    const { t } = useTranslation();
    const navigate = useNavigate();
    const queryClient = useQueryClient();
    const { projectName, sqlId } = useParams<{ projectName: string, sqlId: string }>();
    const [searchParams] = useSearchParams();
    const mapperName = searchParams.get('mapper');
    const [activeTab, setActiveTab] = React.useState<'analysis' | 'flow' | 'sql' | 'calledBy'>('analysis');
    const [showComplexityHelp, setShowComplexityHelp] = React.useState(false);
    const [viewMode, setViewMode] = React.useState<'flow' | 'json'>('flow');
    const [isAnalysisModalOpen, setIsAnalysisModalOpen] = React.useState(false);

    const { data: sqlData, isLoading, error } = useQuery<SqlDetailData>({
        // ... (existing useQuery options)
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

    const handleAnalysisComplete = React.useCallback(() => {
        // Invalidate query to refresh SQL data
        queryClient.invalidateQueries({
            queryKey: ['sqls', projectName, sqlId, mapperName]
        });
    }, [queryClient, projectName, sqlId, mapperName]);

    const { overviewContent, flowData } = React.useMemo(() => {
        // 1. flow_json 우선 사용 (정적 분석 또는 AI 생성)
        let flowJson = sqlData?.flow_json || null;

        // 2. ai_description은 Overview 내용용으로만 사용
        let content = sqlData?.ai_description || '';

        // 3. flow_json이 없으면 ai_description에서 추출 시도 (fallback)
        if (!flowJson && content) {
            const jsonMatch = content.match(/```json([\s\S]*?)```/);
            if (jsonMatch) {
                try {
                    const parsed = JSON.parse(jsonMatch[1]);
                    if (parsed.nodes && parsed.edges) {
                        flowJson = parsed;
                    }
                } catch (e) {
                    console.error("Failed to parse SQL Flow JSON from ai_description", e);
                }
            }
        }

        // 4. Overview 내용에서 [SQL Flow JSON] 섹션 제거
        if (content) {
            const sectionRegex = /###\s*\*\*\[SQL Flow JSON\]\*\*[\s\S]*?(?=---|$)/i;
            content = content.replace(sectionRegex, '').trim();
        }

        return {
            overviewContent: content,
            flowData: flowJson
        };
    }, [sqlData?.flow_json, sqlData?.ai_description]);

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
            <div className="flex items-center justify-between gap-4 border-b border-slate-200 dark:border-slate-800 pb-6">
                <div className="flex items-center gap-4">
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
                <button
                    onClick={() => setIsAnalysisModalOpen(true)}
                    className="flex items-center gap-2 px-4 py-2 bg-white dark:bg-slate-900 border border-slate-200 dark:border-slate-700 rounded-lg hover:bg-slate-50 dark:hover:bg-slate-800 transition-colors text-sm font-medium text-slate-700 dark:text-slate-300 shadow-sm"
                    title={t('sqlDetails.reanalyzeDesc', 'Re-run AI analysis for this SQL statement')}
                >
                    <RefreshCw className="w-4 h-4" />
                    {t('sqlDetails.reanalyze', 'Re-analyze')}
                </button>
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
                        {t('sqlDetails.overview', 'Overview')}
                    </button>
                    <button
                        onClick={() => setActiveTab('flow')}
                        className={`px-6 py-4 text-sm font-medium flex items-center gap-2 border-b-2 transition-colors ${activeTab === 'flow'
                            ? 'border-indigo-500 text-indigo-600 dark:text-indigo-400 bg-slate-50/50 dark:bg-slate-800/50'
                            : 'border-transparent text-slate-500 hover:text-slate-700 dark:text-slate-400 dark:hover:text-slate-200'
                            }`}
                    >
                        <GitMerge className="w-4 h-4" />
                        {t('sqlDetails.flow', 'SQL Flow')}
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
                                    <div className="markdown-content border border-slate-200 dark:border-slate-700 rounded-lg p-4 bg-slate-50/50 dark:bg-[#1e1e1e] max-h-[600px] overflow-y-auto text-slate-700 dark:text-slate-300">
                                        {overviewContent ? (
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
                                                {overviewContent}
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

                    {activeTab === 'flow' && (
                        <div className="p-8 h-[600px] animate-in fade-in slide-in-from-bottom-2 duration-300 flex flex-col">
                            <div className="flex items-center justify-between mb-3">
                                <h3 className="text-lg font-bold text-slate-900 dark:text-white flex items-center gap-2">
                                    <div className="w-1 h-6 bg-indigo-500 rounded-full"></div>
                                    {t('sqlDetails.flow', 'SQL Flow')}
                                </h3>
                                <button
                                    onClick={() => setViewMode(prev => prev === 'flow' ? 'json' : 'flow')}
                                    className="px-3 py-1.5 text-sm font-medium text-slate-600 dark:text-slate-300 bg-white dark:bg-slate-800 border border-slate-200 dark:border-slate-700 rounded-lg hover:bg-slate-50 dark:hover:bg-slate-700 transition-colors shadow-sm flex items-center gap-2"
                                >
                                    <Code className="w-4 h-4" />
                                    {viewMode === 'flow' ? t('sqlDetails.viewJson', 'JSON 보기') : t('sqlDetails.viewFlow', 'Flow 보기')}
                                </button>
                            </div>
                            <div className="relative flex-1 w-full min-h-0 mt-4">
                                <div className="w-full h-full bg-slate-50 dark:bg-slate-900 rounded-xl border border-slate-200 dark:border-slate-800 relative overflow-hidden">

                                    {flowData ? (
                                        <div className="w-full h-full">
                                            {viewMode === 'flow' ? (
                                                <SqlFlowViewer data={flowData} />
                                            ) : (
                                                <div className="w-full h-full">
                                                    <SourceCodeViewer source={JSON.stringify(flowData, null, 2)} language="json" />
                                                </div>
                                            )}
                                        </div>
                                    ) : (
                                        <div className="flex flex-col items-center justify-center h-full text-slate-400 dark:text-slate-500">
                                            <GitMerge className="w-12 h-12 mb-4 opacity-20" />
                                            <p className="text-lg font-medium">{t('sqlDetails.noFlowData', 'No SQL Flow data available')}</p>
                                            <p className="text-sm mt-2 max-w-sm text-center opacity-75">
                                                {t('sqlDetails.runAnalysisHint', 'Run AI analysis with the latest prompt to generate SQL Flow visualization.')}
                                            </p>
                                        </div>
                                    )}
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

            {/* SQL Analysis Modal */}
            <SqlAnalysisModal
                isOpen={isAnalysisModalOpen}
                onClose={() => setIsAnalysisModalOpen(false)}
                projectName={projectName || ''}
                sqlData={{
                    id: sqlData.id,
                    mapper_name: sqlData.mapper_name,
                    sql_type: sqlData.sql_type,
                    sql_content: sqlData.sql_content
                }}
                onAnalysisComplete={handleAnalysisComplete}
            />
        </div>
    );
};

export default SqlDetails;
