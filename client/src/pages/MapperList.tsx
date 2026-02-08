import React, { useState, useMemo, useEffect } from 'react';
import { useTranslation } from 'react-i18next';
import { useSearchParams } from 'react-router-dom';
import { useInfiniteQuery } from '@tanstack/react-query';
import axios from 'axios';
import { Search, X, Database, FolderOpen, FileCode, Hash } from 'lucide-react';
import VirtualizedTable, { Column } from '../components/VirtualizedTable';

interface MapperItem {
    project_name: string;
    package_name: string;
    mapper_name: string;
    mapper_logical_name?: string;
    mapper_type?: string;
    sql_count: number;
}

const MapperList: React.FC = () => {
    const { t } = useTranslation();
    const [searchParams, setSearchParams] = useSearchParams();

    // State for filters
    const [projectFilter, setProjectFilter] = useState(searchParams.get('project') || '');
    const [packageFilter, setPackageFilter] = useState(searchParams.get('package') || '');
    const [mapperFilter, setMapperFilter] = useState(searchParams.get('mapper') || '');

    // Debounced values for query (500ms delay)
    const [queryProject, setQueryProject] = useState(projectFilter);
    const [queryPackage, setQueryPackage] = useState(packageFilter);
    const [queryMapper, setQueryMapper] = useState(mapperFilter);

    // Apply debounce
    useEffect(() => {
        const timer = setTimeout(() => {
            setQueryProject(projectFilter);
            setQueryPackage(packageFilter);
            setQueryMapper(mapperFilter);

            // Update URL params
            const params = new URLSearchParams();
            if (projectFilter) params.set('project', projectFilter);
            if (packageFilter) params.set('package', packageFilter);
            if (mapperFilter) params.set('mapper', mapperFilter);
            setSearchParams(params, { replace: true });
        }, 500);

        return () => clearTimeout(timer);
    }, [projectFilter, packageFilter, mapperFilter, setSearchParams]);

    // Fetch Mappers (Infinite Query)
    const {
        data,
        isLoading,
        fetchNextPage,
        hasNextPage,
        isFetchingNextPage
    } = useInfiniteQuery<MapperItem[]>({
        queryKey: ['mappers', queryProject, queryPackage, queryMapper],
        queryFn: async ({ pageParam = 0 }) => {
            const response = await axios.get('/api/v1/mappers', {
                params: {
                    project_name: queryProject || undefined,
                    package_name: queryPackage || undefined,
                    mapper_name: queryMapper || undefined,
                    limit: 50,
                    skip: pageParam
                }
            });
            return response.data;
        },
        getNextPageParam: (lastPage, allPages) => {
            return lastPage.length === 50 ? allPages.length * 50 : undefined;
        },
        initialPageParam: 0,
        // Keep previous data while fetching new data to avoid flickering
        placeholderData: (previousData) => previousData
    });

    const flattenedMappers = useMemo(() => {
        return data?.pages.flatMap(page => page) || [];
    }, [data]);

    // Columns Definition
    const columns = useMemo((): Column<MapperItem>[] => [
        {
            key: 'project',
            header: t('mapperList.projectName'),
            width: '20%',
            render: (item) => (
                <div className="flex items-center gap-2 min-w-0">
                    <Database className="w-4 h-4 text-slate-400 flex-shrink-0" />
                    <span className="truncate text-slate-700 dark:text-slate-300 font-medium" title={item.project_name}>
                        {item.project_name}
                    </span>
                </div>
            )
        },
        {
            key: 'package',
            header: t('mapperList.packageName'),
            width: '25%',
            render: (item) => (
                <div className="flex items-center gap-2 min-w-0">
                    <FolderOpen className="w-4 h-4 text-slate-400 flex-shrink-0" />
                    <span className="truncate text-slate-600 dark:text-slate-400 text-sm" title={item.package_name}>
                        {item.package_name}
                    </span>
                </div>
            )
        },
        {
            key: 'mapperName',
            header: t('mapperList.mapperName'),
            width: '35%',
            render: (item) => (
                <div className="flex items-center gap-2 min-w-0">
                    <FileCode className="w-4 h-4 text-indigo-500 flex-shrink-0" />
                    <div className="flex flex-col min-w-0">
                        <span className="truncate text-indigo-600 dark:text-indigo-400 font-semibold" title={item.mapper_name}>
                            {item.mapper_name}
                        </span>
                        {item.mapper_logical_name && (
                            <span className="truncate text-xs text-slate-400" title={item.mapper_logical_name}>
                                {item.mapper_logical_name}
                            </span>
                        )}
                    </div>
                </div>
            )
        },
        {
            key: 'sqlCount',
            header: t('mapperList.sqlCount'),
            width: '20%',
            render: (item) => (
                <div className="flex items-center gap-2">
                    <Hash className="w-4 h-4 text-slate-400 flex-shrink-0" />
                    <span className="text-slate-700 dark:text-slate-300 font-medium">
                        {item.sql_count}
                    </span>
                </div>
            )
        }
    ], [t]);

    return (
        <div className="space-y-6 h-[calc(100vh-8rem)] flex flex-col">
            {/* Header */}
            <div className="flex items-center justify-between shrink-0">
                <div className="flex items-center gap-4">
                    <div className="p-3 bg-indigo-50 dark:bg-indigo-500/10 rounded-xl">
                        <FileCode className="w-8 h-8 text-indigo-600 dark:text-indigo-400" />
                    </div>
                    <div>
                        <h1 className="text-2xl font-bold text-slate-900 dark:text-white">
                            {t('mapperList.title')}
                        </h1>
                        <p className="text-slate-500 dark:text-slate-400 text-sm">
                            {t('mapperList.subtitle')}
                        </p>
                    </div>
                </div>
            </div>

            {/* Filters */}
            <div className="bg-white dark:bg-slate-900 p-4 rounded-xl border border-slate-200 dark:border-slate-800 shadow-sm grid grid-cols-1 md:grid-cols-3 gap-4 shrink-0">
                {/* Project Filter */}
                <div className="relative">
                    <div className="absolute inset-y-0 left-0 pl-3 flex items-center pointer-events-none">
                        <Database className="h-4 w-4 text-slate-400" />
                    </div>
                    <input
                        type="text"
                        className="block w-full pl-10 pr-8 py-2 border border-slate-200 dark:border-slate-700 rounded-lg text-sm bg-slate-50 dark:bg-slate-800 text-slate-900 dark:text-white placeholder-slate-400 focus:ring-2 focus:ring-indigo-500/20 focus:border-indigo-500 transition-all"
                        placeholder={`${t('mapperList.filterProject')}...`}
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

                {/* Package Filter */}
                <div className="relative">
                    <div className="absolute inset-y-0 left-0 pl-3 flex items-center pointer-events-none">
                        <FolderOpen className="h-4 w-4 text-slate-400" />
                    </div>
                    <input
                        type="text"
                        className="block w-full pl-10 pr-8 py-2 border border-slate-200 dark:border-slate-700 rounded-lg text-sm bg-slate-50 dark:bg-slate-800 text-slate-900 dark:text-white placeholder-slate-400 focus:ring-2 focus:ring-indigo-500/20 focus:border-indigo-500 transition-all"
                        placeholder={`${t('mapperList.filterPackage')}...`}
                        value={packageFilter}
                        onChange={(e) => setPackageFilter(e.target.value)}
                    />
                    {packageFilter && (
                        <button
                            onClick={() => setPackageFilter('')}
                            className="absolute inset-y-0 right-0 pr-2 flex items-center text-slate-400 hover:text-slate-600 dark:hover:text-slate-300"
                        >
                            <X className="h-4 w-4" />
                        </button>
                    )}
                </div>

                {/* Mapper Filter */}
                <div className="relative">
                    <div className="absolute inset-y-0 left-0 pl-3 flex items-center pointer-events-none">
                        <Search className="h-4 w-4 text-slate-400" />
                    </div>
                    <input
                        type="text"
                        className="block w-full pl-10 pr-8 py-2 border border-slate-200 dark:border-slate-700 rounded-lg text-sm bg-slate-50 dark:bg-slate-800 text-slate-900 dark:text-white placeholder-slate-400 focus:ring-2 focus:ring-indigo-500/20 focus:border-indigo-500 transition-all"
                        placeholder={t('mapperList.searchPlaceholder')}
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
            </div>

            {/* Content using VirtualizedTable */}
            <div className="flex-1 bg-white dark:bg-slate-900 rounded-xl border border-slate-200 dark:border-slate-800 shadow-sm overflow-hidden flex flex-col">
                {isLoading && !data ? (
                    <div className="flex items-center justify-center h-full">
                        <div className="w-8 h-8 border-4 border-indigo-500 border-t-transparent rounded-full animate-spin" />
                    </div>
                ) : (
                    <VirtualizedTable
                        data={flattenedMappers}
                        columns={columns}
                        height={600}
                        rowHeight={50}
                        headerHeight={45}
                        hoverable
                        emptyMessage={t('mapperList.noMappers')}
                        onEndReached={() => {
                            if (hasNextPage && !isFetchingNextPage) {
                                fetchNextPage();
                            }
                        }}
                    />
                )}

                {/* Helper text for limits */}
                <div className="px-4 py-2 bg-slate-50 dark:bg-slate-800 border-t border-slate-100 dark:border-slate-700 text-xs text-slate-500 dark:text-slate-400 flex justify-between items-center">
                    <span>{t('mapperList.mappersFound', { count: flattenedMappers.length })}</span>
                    {isFetchingNextPage && <span className="flex items-center gap-2"><div className="w-3 h-3 border-2 border-indigo-500 border-t-transparent rounded-full animate-spin" /> Loading more...</span>}
                </div>
            </div>
        </div>
    );
};

export default MapperList;
