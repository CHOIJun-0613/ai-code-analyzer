import React, { useState, useMemo, useEffect } from 'react';
import { useTranslation } from 'react-i18next';
import { useNavigate, useSearchParams } from 'react-router-dom';
import { useInfiniteQuery } from '@tanstack/react-query';
import axios from 'axios';
import { Search, X, FileCode, Layers, FolderOpen, Database } from 'lucide-react';
import VirtualizedTable, { Column } from '../components/VirtualizedTable';

interface ClassItem {
    project_name: string;
    package_name: string;
    class_name: string;
    logical_name?: string;
}

const ClassList: React.FC = () => {
    const { t } = useTranslation();
    const navigate = useNavigate();
    const [searchParams, setSearchParams] = useSearchParams();

    // State for filters
    const [classNameFilter, setClassNameFilter] = useState(searchParams.get('class') || '');
    const [projectFilter, setProjectFilter] = useState(searchParams.get('project') || '');
    const [packageFilter, setPackageFilter] = useState(searchParams.get('package') || '');

    // Debounced values for query (500ms delay)
    const [queryClassName, setQueryClassName] = useState(classNameFilter);
    const [queryProject, setQueryProject] = useState(projectFilter);
    const [queryPackage, setQueryPackage] = useState(packageFilter);

    // Apply debounce
    useEffect(() => {
        const timer = setTimeout(() => {
            setQueryClassName(classNameFilter);
            setQueryProject(projectFilter);
            setQueryPackage(packageFilter);

            // Update URL params
            const params = new URLSearchParams();
            if (classNameFilter) params.set('class', classNameFilter);
            if (projectFilter) params.set('project', projectFilter);
            if (packageFilter) params.set('package', packageFilter);
            setSearchParams(params, { replace: true });
        }, 500);

        return () => clearTimeout(timer);
    }, [classNameFilter, projectFilter, packageFilter, setSearchParams]);

    // Fetch Classes (Infinite Query)
    const {
        data,
        isLoading,
        fetchNextPage,
        hasNextPage,
        isFetchingNextPage
    } = useInfiniteQuery<ClassItem[]>({
        queryKey: ['classes', queryClassName, queryProject, queryPackage],
        queryFn: async ({ pageParam = 0 }) => {
            const response = await axios.get('/api/v1/classes', {
                params: {
                    class_name: queryClassName || undefined,
                    project_name: queryProject || undefined,
                    package_name: queryPackage || undefined,
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

    const flattenedClasses = useMemo(() => {
        return data?.pages.flatMap(page => page) || [];
    }, [data]);

    // Columns Definition
    const columns = useMemo((): Column<ClassItem>[] => [
        {
            key: 'project',
            header: t('classList.filterProject'),
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
            header: t('classList.filterPackage'),
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
            key: 'className',
            header: t('projectDetails.physicalName'),
            width: '30%',
            render: (item) => (
                <div className="flex items-center gap-2 min-w-0">
                    <FileCode className="w-4 h-4 text-indigo-500 flex-shrink-0" />
                    <span className="truncate text-indigo-600 dark:text-indigo-400 font-semibold" title={item.class_name}>
                        {item.class_name}
                    </span>
                </div>
            )
        },
        {
            key: 'logicalName',
            header: t('projectDetails.logicalName'),
            width: '25%',
            render: (item) => (
                <span className="truncate text-slate-500 dark:text-slate-500 text-sm" title={item.logical_name || '-'}>
                    {item.logical_name || '-'}
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
                        <Layers className="w-8 h-8 text-indigo-600 dark:text-indigo-400" />
                    </div>
                    <div>
                        <h1 className="text-2xl font-bold text-slate-900 dark:text-white">
                            {t('classList.title')}
                        </h1>
                        <p className="text-slate-500 dark:text-slate-400 text-sm">
                            {t('classList.subtitle')}
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
                        placeholder={`${t('classList.filterProject')}...`}
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
                        placeholder={`${t('classList.filterPackage')}...`}
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

                {/* Class Filter */}
                <div className="relative">
                    <div className="absolute inset-y-0 left-0 pl-3 flex items-center pointer-events-none">
                        <Search className="h-4 w-4 text-slate-400" />
                    </div>
                    <input
                        type="text"
                        className="block w-full pl-10 pr-8 py-2 border border-slate-200 dark:border-slate-700 rounded-lg text-sm bg-slate-50 dark:bg-slate-800 text-slate-900 dark:text-white placeholder-slate-400 focus:ring-2 focus:ring-indigo-500/20 focus:border-indigo-500 transition-all"
                        placeholder={t('classList.searchPlaceholder')}
                        value={classNameFilter}
                        onChange={(e) => setClassNameFilter(e.target.value)}
                    />
                    {classNameFilter && (
                        <button
                            onClick={() => setClassNameFilter('')}
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
                        data={flattenedClasses}
                        columns={columns}
                        height={600} // This might need to be dynamic or flex-grow based
                        rowHeight={50}
                        headerHeight={45}
                        hoverable
                        emptyMessage={t('classList.noClasses')}
                        onEndReached={() => {
                            // console.log('onEndReached called. hasNextPage:', hasNextPage, 'isFetchingNextPage:', isFetchingNextPage);
                            if (hasNextPage && !isFetchingNextPage) {
                                fetchNextPage();
                            }
                        }}
                        onRowClick={(item) => {
                            // Navigate to Class Details
                            const url = `/projects/${encodeURIComponent(item.project_name)}/classes/${encodeURIComponent(item.class_name)}?package=${encodeURIComponent(item.package_name)}`;
                            navigate(url);
                        }}
                    />
                )}

                {/* Helper text for limits */}
                <div className="px-4 py-2 bg-slate-50 dark:bg-slate-800 border-t border-slate-100 dark:border-slate-700 text-xs text-slate-500 dark:text-slate-400 flex justify-between items-center">
                    <span>{t('projectDetails.resultsFound', { count: flattenedClasses.length })}</span>
                    {isFetchingNextPage && <span className="flex items-center gap-2"><div className="w-3 h-3 border-2 border-indigo-500 border-t-transparent rounded-full animate-spin" /> Loading more...</span>}
                </div>
            </div>
        </div>
    );
};

export default ClassList;
