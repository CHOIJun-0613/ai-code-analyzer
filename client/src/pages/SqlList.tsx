import React, { useState, useMemo, useEffect } from 'react';
import { useTranslation } from 'react-i18next';
import { useNavigate, useSearchParams } from 'react-router-dom';
import { useInfiniteQuery } from '@tanstack/react-query';
import axios from 'axios';
import { Search, X, Database, Code, FileText } from 'lucide-react';
import VirtualizedTable, { Column } from '../components/VirtualizedTable';

interface SqlItem {
    id: string;
    mapper_name: string;
    mapper_logical_name?: string;
    sql_type: string;
    logical_name?: string;
    project_name: string;
    complexity_score?: number;
}

const SqlList: React.FC = () => {
    const { t } = useTranslation();
    const navigate = useNavigate();
    const [searchParams, setSearchParams] = useSearchParams();

    // State for filters
    // Default project from URL or empty
    const [projectFilter, setProjectFilter] = useState(searchParams.get('project') || '');
    const [mapperFilter, setMapperFilter] = useState(searchParams.get('mapper') || '');
    const [sqlIdFilter, setSqlIdFilter] = useState(searchParams.get('sqlId') || '');

    // Debounced values
    const [debouncedProject, setDebouncedProject] = useState(projectFilter);
    const [debouncedMapper, setDebouncedMapper] = useState(mapperFilter);
    const [debouncedSqlId, setDebouncedSqlId] = useState(sqlIdFilter);

    // Apply debounce
    useEffect(() => {
        const timer = setTimeout(() => {
            setDebouncedProject(projectFilter);
            setDebouncedMapper(mapperFilter);
            setDebouncedSqlId(sqlIdFilter);

            // Update URL params
            const params = new URLSearchParams();
            if (projectFilter) params.set('project', projectFilter);
            if (mapperFilter) params.set('mapper', mapperFilter);
            if (sqlIdFilter) params.set('sqlId', sqlIdFilter);
            setSearchParams(params, { replace: true });
        }, 500);

        return () => clearTimeout(timer);
    }, [projectFilter, mapperFilter, sqlIdFilter, setSearchParams]);

    // Fetch SQLs (Infinite Query)
    const {
        data,
        isLoading,
        isError,
        error,
        fetchNextPage,
        hasNextPage,
        isFetchingNextPage
    } = useInfiniteQuery<SqlItem[]>({
        queryKey: ['sqls', debouncedProject, debouncedMapper, debouncedSqlId],
        queryFn: async ({ pageParam = 0 }) => {
            const response = await axios.get<SqlItem[]>(`/api/v1/sqls`, {
                params: {
                    project_name: debouncedProject || undefined,
                    mapper_name: debouncedMapper || undefined,
                    sql_id: debouncedSqlId || undefined,
                    limit: 50,
                    skip: pageParam
                }
            });
            return response.data;
        },
        getNextPageParam: (lastPage, allPages) => {
            const nextSkip = lastPage.length === 50 ? allPages.length * 50 : undefined;
            return nextSkip;
        },
        initialPageParam: 0
    });

    const flattenedSqls = useMemo(() => {
        return data?.pages.flatMap(page => page) || [];
    }, [data]);




    // Columns Definition
    const columns = useMemo((): Column<SqlItem>[] => [
        {
            key: 'mapperName',
            header: t('sqlList.mapperName', 'Mapper'),
            width: '25%',
            render: (item) => (
                <div className="flex flex-col min-w-0">
                    <div className="flex items-center gap-2">
                        <FileText className="w-4 h-4 text-slate-400 flex-shrink-0" />
                        <span className="truncate text-slate-700 dark:text-slate-300 font-medium" title={item.mapper_name}>
                            {item.mapper_name}
                        </span>
                    </div>
                    {item.mapper_logical_name && (
                        <span className="text-xs text-slate-500 truncate pl-6">{item.mapper_logical_name}</span>
                    )}
                </div>
            )
        },
        {
            key: 'sqlId',
            header: t('sqlList.sqlId', 'SQL ID'),
            width: '30%',
            render: (item) => (
                <div className="flex flex-col min-w-0">
                    <div className="flex items-center gap-2">
                        <Code className="w-4 h-4 text-indigo-500 flex-shrink-0" />
                        <span className="truncate text-indigo-600 dark:text-indigo-400 font-semibold" title={item.id}>
                            {item.id}
                        </span>
                    </div>
                    {item.logical_name && (
                        <span className="text-xs text-slate-500 truncate pl-6">{item.logical_name}</span>
                    )}
                </div>
            )
        },
        {
            key: 'sqlType',
            header: t('sqlList.sqlType', 'Type'),
            width: '15%',
            render: (item) => (
                <span className={`inline-flex items-center px-2 py-1 rounded-md text-xs font-medium ring-1 ring-inset ${item.sql_type?.toUpperCase() === 'SELECT' ? 'bg-blue-50 text-blue-700 ring-blue-700/10 dark:bg-blue-400/10 dark:text-blue-400 dark:ring-blue-400/30' :
                    item.sql_type?.toUpperCase() === 'INSERT' ? 'bg-green-50 text-green-700 ring-green-600/20 dark:bg-green-400/10 dark:text-green-400 dark:ring-green-400/30' :
                        item.sql_type?.toUpperCase() === 'UPDATE' ? 'bg-amber-50 text-amber-700 ring-amber-600/20 dark:bg-amber-400/10 dark:text-amber-400 dark:ring-amber-400/30' :
                            item.sql_type?.toUpperCase() === 'DELETE' ? 'bg-red-50 text-red-700 ring-red-600/10 dark:bg-red-400/10 dark:text-red-400 dark:ring-red-400/30' :
                                'bg-slate-50 text-slate-600 ring-slate-500/10 dark:bg-slate-400/10 dark:text-slate-400 dark:ring-slate-400/20'
                    }`}>
                    {item.sql_type}
                </span>
            )
        },
        {
            key: 'complexity',
            header: t('sqlList.complexity', 'Complexity'),
            width: '15%',
            render: (item) => (
                <span className="text-slate-600 dark:text-slate-400 text-sm">
                    {item.complexity_score ?? '-'}
                </span>
            )
        },
        {
            key: 'project',
            header: t('sqlList.project', 'Project'),
            width: '15%',
            render: (item) => (
                <span className="text-slate-600 dark:text-slate-400 text-sm truncate">
                    {item.project_name}
                </span>
            )
        }
    ], [t]);

    return (
        <div className="space-y-6 h-[calc(100vh-8rem)] flex flex-col">
            {/* Header */}
            <div className="flex items-center justify-between shrink-0">
                <div className="flex items-center gap-4">
                    <div className="p-3 bg-indigo-50 dark:bg-indigo-500/10 rounded-xl">
                        <Database className="w-8 h-8 text-indigo-600 dark:text-indigo-400" />
                    </div>
                    <div>
                        <h1 className="text-2xl font-bold text-slate-900 dark:text-white">
                            {t('sqlList.title', 'SQL List')}
                        </h1>
                        <p className="text-slate-500 dark:text-slate-400 text-sm">
                            {t('sqlList.subtitle', 'Search and view SQL statements across project')}
                        </p>
                    </div>
                </div>
            </div>

            {/* Filters */}
            <div className="bg-white dark:bg-slate-900 p-4 rounded-xl border border-slate-200 dark:border-slate-800 shadow-sm grid grid-cols-1 md:grid-cols-3 gap-4 shrink-0">
                {/* Project Filter (Required) */}
                <div className="relative">
                    <div className="absolute inset-y-0 left-0 pl-3 flex items-center pointer-events-none">
                        <Database className="h-4 w-4 text-slate-400" />
                    </div>
                    <input
                        type="text"
                        className="block w-full pl-10 pr-8 py-2 border border-slate-200 dark:border-slate-700 rounded-lg text-sm bg-slate-50 dark:bg-slate-800 text-slate-900 dark:text-white placeholder-slate-400 focus:ring-2 focus:ring-indigo-500/20 focus:border-indigo-500 transition-all font-medium"
                        placeholder={`${t('sqlList.filterProject', 'Project Query')}...`}
                        value={projectFilter}
                        onChange={(e) => setProjectFilter(e.target.value)}
                    />
                    {projectFilter && (
                        <button
                            onClick={() => setProjectFilter('')}
                            className="absolute inset-y-0 right-0 pr-2 flex items-center text-slate-400 hover:text-slate-600 dark:hover:text-slate-300"
                        >
                            <X className="h-4 w-4" />
                        </button>
                    )}
                </div>

                {/* Mapper Filter */}
                <div className="relative">
                    <div className="absolute inset-y-0 left-0 pl-3 flex items-center pointer-events-none">
                        <FileText className="h-4 w-4 text-slate-400" />
                    </div>
                    <input
                        type="text"
                        className="block w-full pl-10 pr-8 py-2 border border-slate-200 dark:border-slate-700 rounded-lg text-sm bg-slate-50 dark:bg-slate-800 text-slate-900 dark:text-white placeholder-slate-400 focus:ring-2 focus:ring-indigo-500/20 focus:border-indigo-500 transition-all"
                        placeholder={`${t('sqlList.filterMapper', 'Filter by Mapper')}...`}
                        value={mapperFilter}
                        onChange={(e) => setMapperFilter(e.target.value)}
                    />
                    {mapperFilter && (
                        <button
                            onClick={() => setMapperFilter('')}
                            className="absolute inset-y-0 right-0 pr-2 flex items-center text-slate-400 hover:text-slate-600 dark:hover:text-slate-300"
                        >
                            <X className="h-4 w-4" />
                        </button>
                    )}
                </div>

                {/* SQL ID Filter */}
                <div className="relative">
                    <div className="absolute inset-y-0 left-0 pl-3 flex items-center pointer-events-none">
                        <Search className="h-4 w-4 text-slate-400" />
                    </div>
                    <input
                        type="text"
                        className="block w-full pl-10 pr-8 py-2 border border-slate-200 dark:border-slate-700 rounded-lg text-sm bg-slate-50 dark:bg-slate-800 text-slate-900 dark:text-white placeholder-slate-400 focus:ring-2 focus:ring-indigo-500/20 focus:border-indigo-500 transition-all"
                        placeholder={t('sqlList.searchPlaceholder', 'Search by SQL ID...')}
                        value={sqlIdFilter}
                        onChange={(e) => setSqlIdFilter(e.target.value)}
                    />
                    {sqlIdFilter && (
                        <button
                            onClick={() => setSqlIdFilter('')}
                            className="absolute inset-y-0 right-0 pr-2 flex items-center text-slate-400 hover:text-slate-600 dark:hover:text-slate-300"
                        >
                            <X className="h-4 w-4" />
                        </button>
                    )}
                </div>
            </div>

            {/* Content Table */}
            <div className="flex-1 bg-white dark:bg-slate-900 rounded-xl border border-slate-200 dark:border-slate-800 shadow-sm overflow-hidden flex flex-col">
                {isError ? (
                    <div className="flex flex-col items-center justify-center h-full text-red-500 gap-2">
                        <span className="font-semibold">Failed to load SQLs</span>
                        <span className="text-sm text-slate-500">{(error as Error)?.message}</span>
                    </div>
                ) : isLoading && !data ? (
                    <div className="flex items-center justify-center h-full">
                        <div className="w-8 h-8 border-4 border-indigo-500 border-t-transparent rounded-full animate-spin" />
                    </div>
                ) : (
                    <VirtualizedTable
                        data={flattenedSqls}
                        columns={columns}
                        height={600}
                        rowHeight={60}
                        headerHeight={45}
                        hoverable
                        emptyMessage={t('sqlList.noSqls', 'No SQL statements found')}
                        onEndReached={() => {
                            if (hasNextPage && !isFetchingNextPage) {
                                fetchNextPage();
                            }
                        }}
                        onRowClick={(item) => {
                            // Navigate to SQL Details
                            // Encode both project and sqlId. Also pass mapperName as it might be needed for identification if ID is not unique globally
                            const url = `/projects/${encodeURIComponent(item.project_name)}/sqls/${encodeURIComponent(item.id)}?mapper=${encodeURIComponent(item.mapper_name)}`;
                            navigate(url);
                        }}
                    />
                )}

                {/* Footer with count and loading state */}
                <div className="px-4 py-2 bg-slate-50 dark:bg-slate-800 border-t border-slate-100 dark:border-slate-700 text-xs text-slate-500 dark:text-slate-400 flex justify-between items-center">
                    <span>{t('projectDetails.resultsFound', { count: flattenedSqls.length }) as string}</span>
                    {isFetchingNextPage && (
                        <span className="flex items-center gap-2">
                            <div className="w-3 h-3 border-2 border-indigo-500 border-t-transparent rounded-full animate-spin" />
                            Loading more...
                        </span>
                    )}
                </div>
            </div>
        </div>
    );
};

export default SqlList;
