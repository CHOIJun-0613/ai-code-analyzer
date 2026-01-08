import React, { useState, useMemo } from 'react';
import { useQuery } from '@tanstack/react-query';
import client from '../api/client';
import { useNavigate } from 'react-router-dom';
import { useTranslation } from 'react-i18next';
import { Search, Folder, FileCode, Layers, Box } from 'lucide-react';
import VirtualizedTable, { Column } from '../components/VirtualizedTable';

interface Project {
    name: string;
    updated_at: string;
    number_of_files: number; // This might be the old field, let's check if we need to map total_file_count
    total_file_count?: number;
    package_count?: number;
    class_count?: number;
}

const ProjectList: React.FC = () => {
    const { t } = useTranslation();
    const navigate = useNavigate();
    const [searchTerm, setSearchTerm] = useState('');

    // Fetch projects
    const {
        data: projects = [],
        isLoading,
    } = useQuery({
        queryKey: ['projects'],
        queryFn: async () => {
            const response = await client.get<Project[]>('/projects/');
            return response.data;
        },
    });

    // Filter projects based on search term
    const filteredProjects = useMemo(() => {
        if (!searchTerm) return projects;
        return projects.filter(p =>
            p.name.toLowerCase().includes(searchTerm.toLowerCase())
        );
    }, [projects, searchTerm]);

    const handleProjectClick = (project: Project) => {
        navigate(`/projects/${encodeURIComponent(project.name)}`);
    };

    const columns: Column<Project>[] = [
        {
            key: 'name',
            header: <div className="w-full text-center">{t('projectList.projectName')}</div>,
            width: '30%',
            sortable: true,
            render: (project) => (
                <div className="flex items-center gap-2 font-medium text-indigo-600 dark:text-indigo-400">
                    <Folder size={16} />
                    {project.name}
                </div>
            )
        },
        {
            key: 'package_count',
            header: t('projectList.packageCount'),
            width: '15%',
            sortable: true,
            align: 'center',
            render: (project) => (
                <div className="flex items-center justify-center gap-1">
                    <Box size={14} className="text-slate-400" />
                    {project.package_count?.toLocaleString() ?? 0}
                </div>
            )
        },
        {
            key: 'class_count',
            header: t('projectList.classCount'),
            width: '15%',
            sortable: true,
            align: 'center',
            render: (project) => (
                <div className="flex items-center justify-center gap-1">
                    <Layers size={14} className="text-slate-400" />
                    {project.class_count?.toLocaleString() ?? 0}
                </div>
            )
        },
        {
            key: 'total_file_count',
            header: t('projectList.totalFiles'),
            width: '15%',
            sortable: true,
            align: 'center',
            render: (project) => (
                <div className="flex items-center justify-center gap-1">
                    <FileCode size={14} className="text-slate-400" />
                    {/* Fallback to number_of_files if total_file_count is missing (backward compatibility) */}
                    {(project.total_file_count ?? project.number_of_files ?? 0).toLocaleString()}
                </div>
            )
        },
        {
            key: 'updated_at',
            header: t('projectList.lastModified'),
            width: '25%',
            sortable: true,
            align: 'center',
            render: (project) => {
                const date = new Date(project.updated_at);
                const year = date.getFullYear();
                const month = String(date.getMonth() + 1).padStart(2, '0');
                const day = String(date.getDate()).padStart(2, '0');
                const hours = String(date.getHours()).padStart(2, '0');
                const minutes = String(date.getMinutes()).padStart(2, '0');
                const seconds = String(date.getSeconds()).padStart(2, '0');
                return `${year}-${month}-${day} ${hours}:${minutes}:${seconds}`;
            }
        }
    ];

    return (
        <div className="space-y-6 h-[calc(100vh-140px)] flex flex-col">
            <div className="flex items-center justify-between shrink-0">
                <div>
                    <h1 className="text-2xl font-bold text-slate-900 dark:text-white">{t('projectList.title')}</h1>
                    <p className="text-slate-500 dark:text-slate-400 mt-1">
                        {t('projectList.subtitle')}
                    </p>
                </div>
            </div>

            {/* Search Bar */}
            <div className="relative shrink-0">
                <div className="absolute inset-y-0 left-0 pl-3 flex items-center pointer-events-none">
                    <Search className="h-5 w-5 text-slate-400" />
                </div>
                <input
                    type="text"
                    className="block w-full pl-10 pr-10 py-2 border border-slate-300 dark:border-slate-700 rounded-xl leading-5 bg-white dark:bg-slate-800 text-slate-900 dark:text-white placeholder-slate-500 focus:outline-none focus:ring-2 focus:ring-indigo-500 focus:border-indigo-500 sm:text-sm transition-colors duration-200"
                    placeholder={t('projectList.searchPlaceholder')}
                    value={searchTerm}
                    onChange={(e) => setSearchTerm(e.target.value)}
                />
                {searchTerm && (
                    <button
                        onClick={() => setSearchTerm('')}
                        className="absolute inset-y-0 right-0 pr-3 flex items-center text-slate-400 hover:text-slate-600 dark:hover:text-slate-200"
                    >
                        <span className="sr-only">Clear search</span>
                        <svg className="h-5 w-5" fill="none" viewBox="0 0 24 24" stroke="currentColor">
                            <path strokeLinecap="round" strokeLinejoin="round" strokeWidth={2} d="M6 18L18 6M6 6l12 12" />
                        </svg>
                    </button>
                )}
            </div>

            {/* Project Grid */}
            <div className="flex-1 min-h-0">
                <VirtualizedTable
                    data={filteredProjects}
                    columns={columns}
                    height={600} // This will be overridden by flex layout if we handle it right, but VirtualizedTable needs explicit height usually or AutoSizer. 
                    // The VirtualizedTable component takes a height prop. We might need to make it responsive or fixed.
                    // For now let's set a reasonable fixed height or use a wrapper ref to calculate it.
                    // However, looking at VirtualizedTable implementation, it takes a height prop.
                    // Let's try to make it fill the container.
                    // Since VirtualizedTable uses react-window, it needs a specific height.
                    // We can use a ResizeObserver or just a fixed height for now to be safe.
                    // Let's use 600 as a default but ideally it should be dynamic.
                    // Given the user request doesn't specify dynamic resizing of the table height, fixed is okay for MVP.
                    // But to make it "grid" like and fill space, we might want it to be larger.
                    // Let's stick to 600 or maybe use a ref to measure container.
                    onRowClick={(project) => handleProjectClick(project)}
                    hoverable={true}
                    striped={true}
                    loading={isLoading}
                    emptyMessage="No projects found matching your search."
                />
            </div>
        </div>
    );
};

export default ProjectList;
