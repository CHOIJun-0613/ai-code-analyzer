import React from 'react';
import { useTranslation } from 'react-i18next';
import { useParams, useNavigate, useSearchParams } from 'react-router-dom';
import { useQuery } from '@tanstack/react-query';
import axios from 'axios';
import { FileCode, AlertCircle, FolderOpen, Hash } from 'lucide-react';
import Markdown from 'react-markdown';
import remarkGfm from 'remark-gfm';
import SourceCodeViewer from '../components/SourceCodeViewer';

interface SqlStatementItem {
    id: string;
    logical_name?: string;
    sql_type: string;
}

interface MapperDetailData {
    name: string;
    logical_name: string;
    type: string;
    file_extension: string;
    namespace: string;
    file_path: string;
    package_name: string;
    source: string;
    description: string;
    ai_description: string;
    updated_at: string;
    project_name: string;
    sql_statements: SqlStatementItem[];
    methods: any[];
    sql_count: number;
}

const MapperDetails: React.FC = () => {
    const { t } = useTranslation();
    const navigate = useNavigate();
    const { projectName, mapperName } = useParams<{ projectName: string; mapperName: string }>();
    const [searchParams] = useSearchParams();
    const packageName = searchParams.get('package');
    const [activeTab, setActiveTab] = React.useState<'overview' | 'sqlStatements' | 'source'>('overview');

    const { data: mapperData, isLoading, error } = useQuery<MapperDetailData>({
        queryKey: ['mapper-detail', projectName, mapperName, packageName],
        queryFn: async () => {
            const { data } = await axios.get<MapperDetailData>(
                `/api/v1/mappers/projects/${encodeURIComponent(projectName || '')}/mappers/${encodeURIComponent(mapperName || '')}`,
                {
                    params: { package_name: packageName || undefined }
                }
            );
            return data;
        },
        enabled: !!(projectName && mapperName)
    });

    if (isLoading) {
        return (
            <div className="flex items-center justify-center h-full">
                <div className="w-8 h-8 border-4 border-indigo-500 border-t-transparent rounded-full animate-spin" />
            </div>
        );
    }

    if (error || !mapperData) {
        return (
            <div className="flex flex-col items-center justify-center h-96 text-center">
                <AlertCircle className="w-12 h-12 text-red-500 mb-4" />
                <h3 className="text-lg font-bold text-slate-900 dark:text-white mb-2">{t('common.error', 'Error')}</h3>
                <p className="text-slate-500 dark:text-slate-400 mb-6">
                    {t('mapperDetails.notFound')}
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

    const sqlTypeBadgeClass = (sqlType: string) => {
        switch (sqlType?.toUpperCase()) {
            case 'SELECT':
                return 'bg-blue-50 text-blue-700 ring-blue-700/10 dark:bg-blue-400/10 dark:text-blue-400 dark:ring-blue-400/30';
            case 'INSERT':
                return 'bg-green-50 text-green-700 ring-green-600/20 dark:bg-green-400/10 dark:text-green-400 dark:ring-green-400/30';
            case 'UPDATE':
                return 'bg-amber-50 text-amber-700 ring-amber-600/20 dark:bg-amber-400/10 dark:text-amber-400 dark:ring-amber-400/30';
            case 'DELETE':
                return 'bg-red-50 text-red-700 ring-red-600/10 dark:bg-red-400/10 dark:text-red-400 dark:ring-red-400/30';
            default:
                return 'bg-slate-50 text-slate-600 ring-slate-500/10 dark:bg-slate-400/10 dark:text-slate-400 dark:ring-slate-400/20';
        }
    };

    const tabs = [
        { id: 'overview' as const, label: t('mapperDetails.tabOverview') },
        { id: 'sqlStatements' as const, label: t('mapperDetails.tabSqlStatements') },
        { id: 'source' as const, label: t('mapperDetails.tabSource') },
    ];

    return (
        <div className="space-y-6 animate-in fade-in duration-500 pb-20">
            {/* Header */}
            <div className="flex items-center justify-between gap-4 border-b border-slate-200 dark:border-slate-800 pb-6">
                <div className="flex items-center gap-4">
                    <div className="p-3 rounded-xl bg-indigo-50 dark:bg-indigo-500/10 text-indigo-600 dark:text-indigo-400">
                        <FileCode className="w-8 h-8" />
                    </div>
                    <div>
                        <p className="text-slate-500 dark:text-slate-400 font-mono text-sm mb-1">
                            {mapperData.package_name}
                        </p>
                        <div className="flex items-center gap-3">
                            <h1 className="text-3xl font-bold text-slate-900 dark:text-white">
                                {mapperData.name}{mapperData.file_extension ? `.${mapperData.file_extension}` : ''}
                            </h1>
                            <span className={`inline-flex items-center px-2.5 py-0.5 rounded-md text-xs font-bold ring-1 ring-inset uppercase ${
                                mapperData.type === 'xml'
                                    ? 'bg-emerald-50 text-emerald-700 ring-emerald-600/20 dark:bg-emerald-400/10 dark:text-emerald-400 dark:ring-emerald-400/30'
                                    : 'bg-violet-50 text-violet-700 ring-violet-600/20 dark:bg-violet-400/10 dark:text-violet-400 dark:ring-violet-400/30'
                            }`}>
                                {mapperData.type}
                            </span>
                        </div>
                        {mapperData.logical_name && (
                            <p className="text-lg text-slate-600 dark:text-slate-300 mt-1">
                                {mapperData.logical_name}
                            </p>
                        )}
                        {mapperData.updated_at && (
                            <p className="text-xs text-slate-500 dark:text-slate-400 mt-2 font-mono">
                                {t('mapperDetails.lastUpdated')}: {(() => {
                                    const d = new Date(mapperData.updated_at);
                                    return `${d.getFullYear()}-${String(d.getMonth() + 1).padStart(2, '0')}-${String(d.getDate()).padStart(2, '0')} ${String(d.getHours()).padStart(2, '0')}:${String(d.getMinutes()).padStart(2, '0')}:${String(d.getSeconds()).padStart(2, '0')}`;
                                })()}
                            </p>
                        )}
                    </div>
                </div>
            </div>

            {/* Tabs */}
            <div className="bg-white dark:bg-slate-900 rounded-xl border border-slate-200 dark:border-slate-800 shadow-sm overflow-hidden">
                {/* Tab Header */}
                <div className="border-b border-slate-200 dark:border-slate-800">
                    <nav className="flex -mb-px">
                        {tabs.map((tab) => (
                            <button
                                key={tab.id}
                                onClick={() => setActiveTab(tab.id)}
                                className={`px-6 py-3.5 text-sm font-medium transition-colors relative ${
                                    activeTab === tab.id
                                        ? 'text-indigo-600 dark:text-indigo-400'
                                        : 'text-slate-500 dark:text-slate-400 hover:text-slate-700 dark:hover:text-slate-300'
                                }`}
                            >
                                {tab.label}
                                {activeTab === tab.id && (
                                    <span className="absolute bottom-0 left-0 right-0 h-0.5 bg-indigo-600 dark:bg-indigo-400" />
                                )}
                            </button>
                        ))}
                    </nav>
                </div>

                {/* Tab Content */}
                <div className="p-6">
                    {/* 개요 탭 */}
                    {activeTab === 'overview' && (
                        <div className="space-y-6">
                            {/* 파일 경로 */}
                            <div>
                                <h3 className="text-sm font-semibold text-slate-500 dark:text-slate-400 uppercase tracking-wider mb-2 flex items-center gap-2">
                                    <FolderOpen className="w-4 h-4" />
                                    {t('mapperDetails.filePath')}
                                </h3>
                                <p className="text-sm font-mono text-slate-700 dark:text-slate-300 bg-slate-50 dark:bg-slate-800 px-4 py-2.5 rounded-lg border border-slate-200 dark:border-slate-700 break-all">
                                    {mapperData.file_path || '-'}
                                </p>
                            </div>

                            {/* Description */}
                            <div>
                                <h3 className="text-sm font-semibold text-slate-500 dark:text-slate-400 uppercase tracking-wider mb-2">
                                    {t('mapperDetails.description')}
                                </h3>
                                {mapperData.ai_description ? (
                                    <div className="prose prose-sm dark:prose-invert max-w-none bg-slate-50 dark:bg-slate-800 p-4 rounded-lg border border-slate-200 dark:border-slate-700">
                                        <Markdown remarkPlugins={[remarkGfm]}>
                                            {mapperData.ai_description}
                                        </Markdown>
                                    </div>
                                ) : (
                                    <div className="p-8 text-center text-slate-400 dark:text-slate-500 text-sm italic bg-slate-50 dark:bg-slate-800 rounded-lg border border-slate-200 dark:border-slate-700">
                                        {t('mapperDetails.noDescription')}
                                    </div>
                                )}
                            </div>
                        </div>
                    )}

                    {/* 등록 SQL 탭 */}
                    {activeTab === 'sqlStatements' && (
                        <div>
                            {!mapperData.sql_statements || mapperData.sql_statements.length === 0 ? (
                                <div className="p-12 text-center text-slate-400 dark:text-slate-500 text-sm italic">
                                    {t('mapperDetails.noSqlStatements')}
                                </div>
                            ) : (
                                <>
                                    <div className="mb-4 text-sm text-slate-500 dark:text-slate-400">
                                        {t('mapperDetails.sqlStatementsCount', { count: mapperData.sql_statements.length })}
                                    </div>
                                    <div className="overflow-hidden rounded-lg border border-slate-200 dark:border-slate-700">
                                        <table className="w-full text-sm">
                                            <thead>
                                                <tr className="bg-slate-50 dark:bg-slate-800 border-b border-slate-200 dark:border-slate-700">
                                                    <th className="text-left px-4 py-3 font-semibold text-slate-600 dark:text-slate-300">
                                                        {t('mapperDetails.sqlId')}
                                                    </th>
                                                    <th className="text-left px-4 py-3 font-semibold text-slate-600 dark:text-slate-300">
                                                        {t('mapperDetails.logicalName')}
                                                    </th>
                                                    <th className="text-left px-4 py-3 font-semibold text-slate-600 dark:text-slate-300 w-32">
                                                        {t('mapperDetails.sqlType')}
                                                    </th>
                                                </tr>
                                            </thead>
                                            <tbody className="divide-y divide-slate-100 dark:divide-slate-800">
                                                {mapperData.sql_statements.map((sql, index) => (
                                                    <tr
                                                        key={index}
                                                        className="hover:bg-slate-50 dark:hover:bg-slate-800/50 transition-colors"
                                                    >
                                                        <td className="px-4 py-3">
                                                            <button
                                                                onClick={() => {
                                                                    navigate(
                                                                        `/projects/${encodeURIComponent(projectName || '')}/sqls/${encodeURIComponent(sql.id)}?mapper=${encodeURIComponent(mapperData.name)}`
                                                                    );
                                                                }}
                                                                className="text-indigo-600 dark:text-indigo-400 font-mono font-medium hover:underline hover:text-indigo-700 dark:hover:text-indigo-300 transition-colors"
                                                            >
                                                                {sql.id}
                                                            </button>
                                                        </td>
                                                        <td className="px-4 py-3 text-slate-600 dark:text-slate-400">
                                                            {sql.logical_name || '-'}
                                                        </td>
                                                        <td className="px-4 py-3">
                                                            <span className={`inline-flex items-center px-2 py-0.5 rounded-md text-xs font-bold ring-1 ring-inset uppercase ${sqlTypeBadgeClass(sql.sql_type)}`}>
                                                                {sql.sql_type}
                                                            </span>
                                                        </td>
                                                    </tr>
                                                ))}
                                            </tbody>
                                        </table>
                                    </div>
                                </>
                            )}
                        </div>
                    )}

                    {/* Mapper 소스 탭 */}
                    {activeTab === 'source' && (
                        <div className="h-full flex flex-col">
                            {mapperData.source ? (
                                <SourceCodeViewer
                                    source={mapperData.source}
                                    language={mapperData.file_extension === 'java' ? 'java' : 'xml'}
                                />
                            ) : (
                                <div className="p-12 text-center text-slate-400 dark:text-slate-500 text-sm italic">
                                    {t('mapperDetails.noSource')}
                                </div>
                            )}
                        </div>
                    )}
                </div>
            </div>
        </div>
    );
};

export default MapperDetails;
