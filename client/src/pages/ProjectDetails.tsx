import React, { useState, useMemo } from 'react';
import toast from 'react-hot-toast';
import { useQuery, useMutation, useQueryClient } from '@tanstack/react-query';
import axios from 'axios';
import { useParams, useNavigate } from 'react-router-dom';
import { Box, FileCode, Layers, Database, FolderOpen, Code2, Search, Info, Code, Pencil, Check, X, ChevronDown, ChevronUp, FileText } from 'lucide-react';
import { useTranslation } from 'react-i18next';
import ReportViewerModal from '../components/ReportViewerModal';
import VirtualizedTable, { Column } from '../components/VirtualizedTable';

interface ProjectStats {
    project: {
        name: string;
        description: string;
        ai_description: string;
        application_name: string;
        number_of_files: number;
        path: string;
        framework: string;
        repository: string;
        created_at: string;
        updated_at: string;
        total_file_count: number;
        total_java_file_count: number;
        total_xml_file_count: number;
        total_config_file_count: number;
        total_ddl_file_count: number;
        total_other_analyzed_file_count: number;
        total_ignored_file_count: number;
        total_etc_file_count: number;
        total_PLOC: number;
        total_LLOC: number;
        total_CLOC: number;
    };
    package_count: number;
    class_count: number;
}

interface ClassItem {
    name: string;
    logical_name?: string;
    packageName?: string; // Added for global search context
}

interface HierarchyItem {
    package: string;
    classes: ClassItem[];
}

const ALL_PACKAGES = '__ALL__';

const ProjectDetails: React.FC = () => {
    const { t } = useTranslation();
    const { projectName } = useParams<{ projectName: string }>();
    const navigate = useNavigate();
    const queryClient = useQueryClient();

    const [selectedPackage, setSelectedPackage] = useState<string | null>(ALL_PACKAGES);
    const [searchQuery, setSearchQuery] = useState('');
    const [packageSearchQuery, setPackageSearchQuery] = useState('');

    // React Query: 프로젝트 통계 조회
    const {
        data: stats = null,
        isLoading: isLoadingStats,
        error: statsError
    } = useQuery({
        queryKey: ['projects', projectName, 'stats'],
        queryFn: async () => {
            const response = await axios.get<ProjectStats>(`/api/v1/projects/${projectName}/stats`);
            return response.data;
        },
        enabled: !!projectName,
    });

    // React Query: 프로젝트 계층 구조 조회
    const {
        data: hierarchy = [],
        isLoading: isLoadingHierarchy,
        error: hierarchyError
    } = useQuery<HierarchyItem[]>({
        queryKey: ['projects', projectName, 'hierarchy'],
        queryFn: async () => {
            const response = await axios.get<HierarchyItem[]>(`/api/v1/projects/${projectName}/hierarchy`);
            return response.data;
        },
        enabled: !!projectName,
    });

    const isLoading = isLoadingStats || isLoadingHierarchy;
    const error = statsError || hierarchyError;

    // 첫 번째 패키지 자동 선택 (useEffect로 처리) -> 기본값이 ALL_PACKAGES이므로 로직 수정
    React.useEffect(() => {
        // hierarchy가 로드되었을 때 selectedPackage가 null이면 ALL_PACKAGES로 설정
        if (hierarchy && hierarchy.length > 0 && !selectedPackage) {
            setSelectedPackage(ALL_PACKAGES);
        }
    }, [hierarchy, selectedPackage]);

    // Edit Mode State
    const [isEditing, setIsEditing] = useState(false);
    const [editForm, setEditForm] = useState({
        framework: '',
        repository: ''
    });

    const [areCardsExpanded, setAreCardsExpanded] = useState(true);

    // Report State
    const [isReportModalOpen, setIsReportModalOpen] = useState(false);
    const [reportData, setReportData] = useState<{
        title: string;
        content: string;
        isGrid?: boolean;
        gridData?: {
            headers: string[];
            rows: any[];
            summary?: any;
        };
    } | null>(null);
    const [isReportMenuOpen, setIsReportMenuOpen] = useState(false);
    const [isFetchingReport, setIsFetchingReport] = useState(false);

    const handleOpenReport = async (type: 'stats' | 'crud' | 'classes', title: string) => {
        setIsReportMenuOpen(false);
        setIsFetchingReport(true);
        try {
            if (type === 'stats') {
                const { data } = await axios.get<{ content: string }>(`/api/v1/projects/${projectName}/reports/${type}`);
                setReportData({ title, content: data.content, isGrid: false });
            } else {
                // Fetch JSON data for Grid
                const { data } = await axios.get<any>(`/api/v1/projects/${projectName}/reports/${type}?format=json`);
                console.log('Report Data Response:', data); // DEBUG LOG

                if (!data) {
                    toast.error('No data received from server');
                    throw new Error('No data received');
                }

                // Backend returns { summary: {...}, headers: [...], rows: [...], table_names: [...] } for crud
                // headers might be implicit or explicit. My implementation of crud_matrix_data returns headers.
                // class_list_data returns list of dicts. We need to normalize headers if not present.

                let gridData = null;
                if (data.headers && data.rows) {
                    // Standardized format from my implementation (CRUD)
                    gridData = data;
                } else if (Array.isArray(data)) {
                    // List of dicts (Class List)
                    // If empty, headers are arbitrary or empty
                    const rows = data;
                    let headers: string[] = [];
                    if (rows.length > 0) {
                        // Infer headers from first item keys 
                        // But I want pretty headers. The server returns 'package', 'name', 'logical_name', 'type'.
                        // Let's manually map for known types or use keys.
                        if (type === 'classes') {
                            headers = ["Package", "Class (Physical)", "Class (Logical)", "Sub-type"];
                        } else {
                            headers = Object.keys(rows[0]);
                        }
                    } else {
                        if (type === 'classes') headers = ["Package", "Class (Physical)", "Class (Logical)", "Sub-type"];
                    }
                    gridData = { headers, rows };
                }

                setReportData({
                    title,
                    content: '', // Empty content for grid mode
                    isGrid: true,
                    gridData: gridData
                });
            }
            setIsReportModalOpen(true);
        } catch (err) {
            console.error('Failed to fetch report', err);
            toast.error('Failed to fetch report');
        } finally {
            setIsFetchingReport(false);
        }
    };

    // stats가 로드되면 editForm 초기화
    React.useEffect(() => {
        if (stats?.project) {
            setEditForm({
                framework: stats.project.framework || '',
                repository: stats.project.repository || ''
            });
        }
    }, [stats]);

    // Mutation: 프로젝트 정보 업데이트
    const updateProjectMutation = useMutation({
        mutationFn: async (data: { framework: string; repository: string }) => {
            await axios.patch(`/api/v1/projects/${projectName}`, data);
        },
        onSuccess: () => {
            // stats 쿼리 무효화 (자동 재조회)
            queryClient.invalidateQueries({ queryKey: ['projects', projectName, 'stats'] });
            setIsEditing(false);
        },
        onError: (err) => {
            console.error("Failed to update project", err);
            toast.error("Failed to save changes.");
        },
    });

    const handleSaveProjectInfo = () => {
        if (!stats) return;
        updateProjectMutation.mutate({
            framework: editForm.framework,
            repository: editForm.repository
        });
    };

    const handleCancelEdit = () => {
        if (stats) {
            setEditForm({
                framework: stats.project.framework || '',
                repository: stats.project.repository || ''
            });
        }
        setIsEditing(false);
    };

    // Filter packages based on search query
    const filteredPackages = hierarchy.filter(item =>
        item.package.toLowerCase().includes(packageSearchQuery.toLowerCase())
    );



    const filteredClasses = React.useMemo(() => {
        let targetClasses: ClassItem[] = [];

        if (selectedPackage === ALL_PACKAGES) {
            // 전체 패키지에서 클래스 수집
            hierarchy.forEach(pkg => {
                targetClasses.push(...pkg.classes.map(c => ({ ...c, packageName: pkg.package })));
            });
        } else {
            // 선택된 패키지의 클래스만 수집
            const pkg = hierarchy.find(h => h.package === selectedPackage);
            if (pkg) {
                targetClasses = pkg.classes.map(c => ({ ...c, packageName: pkg.package }));
            }
        }

        if (!searchQuery) {
            return targetClasses;
        }

        // 검색어 필터링
        return targetClasses.filter(cls =>
            cls.name.toLowerCase().includes(searchQuery.toLowerCase()) ||
            (cls.logical_name && cls.logical_name.toLowerCase().includes(searchQuery.toLowerCase()))
        );
    }, [searchQuery, hierarchy, selectedPackage]);

    // VirtualizedTable Column 정의
    const classTableColumns = useMemo((): Column<ClassItem>[] => {
        const baseColumns: Column<ClassItem>[] = [
            {
                key: 'physicalName',
                header: t('projectDetails.physicalName'),
                width: '33%',
                render: (cls) => (
                    <div className="flex items-center w-full min-w-0">
                        <FileCode className="w-4 h-4 text-slate-400 dark:text-slate-500 mr-3 flex-shrink-0 group-hover:text-indigo-500 transition-colors" />
                        <span className="font-medium text-slate-700 dark:text-slate-200 truncate" title={cls.name}>
                            {cls.name}
                        </span>
                    </div>
                ),
            },
            {
                key: 'logicalName',
                header: t('projectDetails.logicalName'),
                width: '33%',
                render: (cls) => (
                    <span className="text-slate-500 dark:text-slate-400 text-sm truncate block" title={cls.logical_name || '-'}>
                        {cls.logical_name || '-'}
                    </span>
                ),
            },
        ];

        // 검색 모드이거나 전체 보기일 때 Package 컬럼 추가
        if (searchQuery || selectedPackage === ALL_PACKAGES) {
            baseColumns.push({
                key: 'package',
                header: t('projectDetails.packages'),
                width: '34%',
                render: (cls) => (
                    <span className="text-slate-400 dark:text-slate-500 text-xs truncate block" title={cls.packageName}>
                        {cls.packageName}
                    </span>
                ),
            });
        }

        return baseColumns;
    }, [searchQuery, selectedPackage, t]);

    if (isLoading) {
        return (
            <div className="flex items-center justify-center h-96">
                <div className="w-8 h-8 border-4 border-indigo-500 border-t-transparent rounded-full animate-spin" />
            </div>
        );
    }

    if (error || !stats) {
        return (
            <div className="text-center py-12">
                <h3 className="text-lg font-medium text-slate-900 dark:text-white">{t('common.noResults')}</h3>
                <button
                    onClick={() => navigate('/')}
                    className="mt-4 px-4 py-2 text-sm font-medium text-white bg-indigo-600 rounded-lg hover:bg-indigo-700 transition-colors"
                >
                    {t('error.goHome')}
                </button>
            </div>
        );
    }

    return (
        <div className="space-y-8 animate-in fade-in duration-500">
            {/* Header */}
            <div>
                <div className="flex items-center justify-between">
                    <div className="flex items-center gap-4">
                        <div className="p-3 bg-indigo-50 dark:bg-indigo-500/10 rounded-xl">
                            <Box className="w-8 h-8 text-indigo-600 dark:text-indigo-400" />
                        </div>
                        <div>
                            {stats && (
                                <>
                                    <h1 className="text-3xl font-bold text-slate-900 dark:text-white">{stats.project.name}</h1>
                                    <p className="text-slate-500 dark:text-slate-400">{t('projectDetails.lastUpdated')}: {new Date(stats.project.updated_at).toLocaleString()}</p>
                                </>
                            )}
                        </div>
                    </div>

                    {/* Reports Menu */}
                    <div className="relative">
                        <button
                            onClick={() => !isFetchingReport && setIsReportMenuOpen(!isReportMenuOpen)}
                            disabled={isFetchingReport}
                            className={`flex items-center gap-2 px-4 py-2 bg-white dark:bg-slate-900 border border-slate-200 dark:border-slate-800 rounded-lg text-slate-600 dark:text-slate-300 transition-colors shadow-sm font-medium ${isFetchingReport ? 'opacity-70 cursor-not-allowed' : 'hover:bg-slate-50 dark:hover:bg-slate-800 hover:text-indigo-600 dark:hover:text-indigo-400'}`}
                        >
                            {isFetchingReport ? (
                                <>
                                    <div className="w-4 h-4 border-2 border-indigo-500 border-t-transparent rounded-full animate-spin" />
                                    {t('common.loading')}
                                </>
                            ) : (
                                <>
                                    <FileText className="w-5 h-5" />
                                    {t('projectDetails.reports')}
                                    <ChevronDown className={`w-4 h-4 transition-transform ${isReportMenuOpen ? 'rotate-180' : ''}`} />
                                </>
                            )}
                        </button>

                        {isReportMenuOpen && (
                            <>
                                <div
                                    className="fixed inset-0 z-10"
                                    onClick={() => setIsReportMenuOpen(false)}
                                />
                                <div className="absolute right-0 mt-2 w-56 bg-white dark:bg-slate-900 rounded-xl shadow-xl border border-slate-100 dark:border-slate-800 z-20 py-2 animate-in fade-in zoom-in-95 duration-200">
                                    <div className="px-4 py-2 border-b border-slate-50 dark:border-slate-800">
                                        <span className="text-xs font-bold text-slate-400 dark:text-slate-500 uppercase tracking-wider">{t('projectDetails.generateReport')}</span>
                                    </div>
                                    <button
                                        onClick={() => handleOpenReport('stats', t('projectDetails.projectStats'))}
                                        className="w-full text-left px-4 py-3 hover:bg-indigo-50 dark:hover:bg-indigo-500/10 text-slate-700 dark:text-slate-300 hover:text-indigo-700 dark:hover:text-indigo-400 transition-colors flex items-center gap-2"
                                    >
                                        <Layers className="w-4 h-4" />
                                        {t('projectDetails.projectStats')}
                                    </button>
                                    <button
                                        onClick={() => handleOpenReport('crud', t('projectDetails.crudMatrix'))}
                                        className="w-full text-left px-4 py-3 hover:bg-indigo-50 dark:hover:bg-indigo-500/10 text-slate-700 dark:text-slate-300 hover:text-indigo-700 dark:hover:text-indigo-400 transition-colors flex items-center gap-2"
                                    >
                                        <Database className="w-4 h-4" />
                                        {t('projectDetails.crudMatrix')}
                                    </button>
                                    <button
                                        onClick={() => handleOpenReport('classes', t('projectDetails.classList'))}
                                        className="w-full text-left px-4 py-3 hover:bg-indigo-50 dark:hover:bg-indigo-500/10 text-slate-700 dark:text-slate-300 hover:text-indigo-700 dark:hover:text-indigo-400 transition-colors flex items-center gap-2"
                                    >
                                        <FileCode className="w-4 h-4" />
                                        {t('projectDetails.classList')}
                                    </button>
                                </div>
                            </>
                        )}
                    </div>
                </div>
            </div>

            {/* Project Information & Statistics Grid */}
            {stats && (
                <div className="grid grid-cols-1 xl:grid-cols-2 gap-6">
                    {/* Project Information */}
                    <div className="bg-white dark:bg-slate-900 p-6 rounded-2xl shadow-sm border border-slate-200 dark:border-slate-800 flex flex-col gap-4">
                        <div className="flex justify-between items-center border-b border-slate-100 dark:border-slate-800 pb-2">
                            <h3 className="text-lg font-bold text-slate-900 dark:text-white flex items-center gap-2 cursor-pointer select-none" onClick={() => setAreCardsExpanded(!areCardsExpanded)}>
                                <Info className="w-5 h-5 text-indigo-600" />
                                {t('projectDetails.projectInformation')}
                                {areCardsExpanded ? <ChevronUp className="w-4 h-4 text-slate-400" /> : <ChevronDown className="w-4 h-4 text-slate-400" />}
                            </h3>
                            <div>
                                {isEditing ? (
                                    <div className="flex items-center gap-2">
                                        <button
                                            onClick={handleSaveProjectInfo}
                                            className="flex items-center gap-1 px-3 py-1.5 bg-indigo-600 text-white text-sm font-medium rounded-lg hover:bg-indigo-700 transition-colors"
                                        >
                                            <Check className="w-3.5 h-3.5" />
                                            {t('projectDetails.save')}
                                        </button>
                                        <button
                                            onClick={handleCancelEdit}
                                            className="flex items-center gap-1 px-3 py-1.5 bg-white dark:bg-slate-800 border border-slate-200 dark:border-slate-700 text-slate-600 dark:text-slate-300 text-sm font-medium rounded-lg hover:bg-slate-50 dark:hover:bg-slate-700 transition-colors"
                                        >
                                            <X className="w-3.5 h-3.5" />
                                            {t('projectDetails.cancel')}
                                        </button>
                                    </div>
                                ) : (
                                    <button
                                        onClick={() => setIsEditing(true)}
                                        className="flex items-center gap-1 px-3 py-1.5 text-slate-500 dark:text-slate-400 hover:text-indigo-600 dark:hover:text-indigo-400 hover:bg-indigo-50 dark:hover:bg-indigo-500/10 rounded-lg transition-all text-sm font-medium"
                                    >
                                        <Pencil className="w-3.5 h-3.5" />
                                        {t('projectDetails.edit')}
                                    </button>
                                )}
                            </div>
                        </div>

                        {areCardsExpanded && (
                            <>
                                <div className="grid grid-cols-1 gap-y-3">
                                    <div className="grid grid-cols-3 items-center">
                                        <span className="text-sm font-medium text-slate-500 dark:text-slate-400 flex items-center gap-2">
                                            <FileCode className="w-4 h-4" /> {t('projectDetails.applicationName')}
                                        </span>
                                        <span className="col-span-2 text-slate-900 dark:text-slate-200 font-medium">{stats.project.application_name || '-'}</span>
                                    </div>
                                    <div className="grid grid-cols-3 items-center">
                                        <span className="text-sm font-medium text-slate-500 dark:text-slate-400 flex items-center gap-2">
                                            <Layers className="w-4 h-4" /> {t('projectDetails.framework')}
                                        </span>
                                        <div className="col-span-2">
                                            {isEditing ? (
                                                <input
                                                    type="text"
                                                    className="w-full px-3 py-1.5 text-sm border border-indigo-200 dark:border-slate-700 bg-white dark:bg-slate-800 text-slate-900 dark:text-white rounded-lg focus:outline-none focus:ring-2 focus:ring-indigo-500/20 focus:border-indigo-500 transition-all"
                                                    placeholder="e.g. Spring Boot"
                                                    value={editForm.framework}
                                                    onChange={(e) => setEditForm({ ...editForm, framework: e.target.value })}
                                                />
                                            ) : (
                                                <span className="text-slate-900 dark:text-slate-200 font-medium">{stats.project.framework || <span className="text-slate-400 dark:text-slate-600 italic">{t('projectDetails.notSpecified')}</span>}</span>
                                            )}
                                        </div>
                                    </div>
                                    <div className="grid grid-cols-3 items-center">
                                        <span className="text-sm font-medium text-slate-500 dark:text-slate-400 flex items-center gap-2">
                                            <Database className="w-4 h-4" /> {t('projectDetails.repository')}
                                        </span>
                                        <div className="col-span-2">
                                            {isEditing ? (
                                                <input
                                                    type="text"
                                                    className="w-full px-3 py-1.5 text-sm border border-indigo-200 dark:border-slate-700 bg-white dark:bg-slate-800 text-slate-900 dark:text-white rounded-lg focus:outline-none focus:ring-2 focus:ring-indigo-500/20 focus:border-indigo-500 transition-all"
                                                    placeholder="Git Repository URL"
                                                    value={editForm.repository}
                                                    onChange={(e) => setEditForm({ ...editForm, repository: e.target.value })}
                                                />
                                            ) : (
                                                <span className="text-slate-900 dark:text-slate-200 font-medium truncate block" title={stats.project.repository}>
                                                    {stats.project.repository || <span className="text-slate-400 dark:text-slate-600 italic">{t('projectDetails.notSpecified')}</span>}
                                                </span>
                                            )}
                                        </div>
                                    </div>
                                    <div className="grid grid-cols-3 items-start">
                                        <span className="text-sm font-medium text-slate-500 dark:text-slate-400 mt-1 flex items-center gap-2">
                                            <FolderOpen className="w-4 h-4" /> {t('projectDetails.path')}
                                        </span>
                                        <span className="col-span-2 text-xs text-slate-600 dark:text-slate-400 font-mono bg-slate-50 dark:bg-slate-800 p-2 rounded break-all border border-slate-100 dark:border-slate-700">
                                            {stats.project.path}
                                        </span>
                                    </div>
                                </div>

                                {/* Summary Stats */}
                                <div className="border-t border-slate-100 dark:border-slate-800 pt-4 mt-2">
                                    <div className="grid grid-cols-2 gap-4">
                                        <div className="flex flex-col items-center p-3 bg-purple-50/50 dark:bg-purple-500/10 rounded-xl border border-purple-100 dark:border-purple-500/20">
                                            <Layers className="w-5 h-5 text-purple-600 dark:text-purple-400 mb-1" />
                                            <span className="text-xl font-bold text-slate-900 dark:text-white">{stats.package_count}</span>
                                            <span className="text-xs text-slate-500 dark:text-slate-400 font-medium">{t('projectDetails.packages')}</span>
                                        </div>
                                        <div className="flex flex-col items-center p-3 bg-emerald-50/50 dark:bg-emerald-500/10 rounded-xl border border-emerald-100 dark:border-emerald-500/20">
                                            <Code2 className="w-5 h-5 text-emerald-600 dark:text-emerald-400 mb-1" />
                                            <span className="text-xl font-bold text-slate-900 dark:text-white">{stats.class_count}</span>
                                            <span className="text-xs text-slate-500 dark:text-slate-400 font-medium">{t('projectDetails.classes')}</span>
                                        </div>
                                    </div>
                                </div>
                            </>
                        )}
                    </div>

                    {/* Code Statistics */}
                    <div className="bg-white dark:bg-slate-900 p-6 rounded-2xl shadow-sm border border-slate-200 dark:border-slate-800 flex flex-col gap-4">
                        <h3 className="text-lg font-bold text-slate-900 dark:text-white flex items-center justify-between border-b border-slate-100 dark:border-slate-800 pb-2 cursor-pointer select-none" onClick={() => setAreCardsExpanded(!areCardsExpanded)}>
                            <div className="flex items-center gap-2">
                                <Code className="w-5 h-5 text-emerald-600" />
                                {t('projectDetails.codeStatistics')}
                            </div>
                            {areCardsExpanded ? <ChevronUp className="w-4 h-4 text-slate-400" /> : <ChevronDown className="w-4 h-4 text-slate-400" />}
                        </h3>

                        {areCardsExpanded && (
                            <div className="flex flex-col xl:flex-row gap-6">
                                {/* Left: Line Statistics (LOC) */}
                                <div className="flex-1">
                                    <h4 className="text-sm font-semibold text-slate-500 dark:text-slate-400 mb-3 ml-1">{t('projectDetails.lineStatistics')}</h4>
                                    <div className="bg-white dark:bg-slate-800/50 rounded-xl border border-slate-200 dark:border-slate-700 overflow-hidden shadow-sm">
                                        <div className="divide-y divide-slate-100 dark:divide-slate-700">
                                            <div className="flex justify-between items-center p-4 hover:bg-slate-50 dark:hover:bg-slate-800 transition-colors">
                                                <span className="text-sm font-medium text-slate-600 dark:text-slate-400">{t('projectDetails.totalLines')}</span>
                                                <span className="text-lg font-bold text-slate-900 dark:text-white">{stats.project.total_PLOC.toLocaleString()}</span>
                                            </div>
                                            <div className="flex justify-between items-center p-4 hover:bg-emerald-50/30 dark:hover:bg-emerald-500/10 transition-colors">
                                                <span className="text-sm font-medium text-emerald-700 dark:text-emerald-400">{t('projectDetails.codeLines')}</span>
                                                <span className="text-lg font-bold text-emerald-700 dark:text-emerald-400">{stats.project.total_LLOC.toLocaleString()}</span>
                                            </div>
                                            <div className="flex justify-between items-center p-4 hover:bg-amber-50/30 dark:hover:bg-amber-500/10 transition-colors">
                                                <span className="text-sm font-medium text-amber-700 dark:text-amber-400">{t('projectDetails.commentLines')}</span>
                                                <span className="text-lg font-bold text-amber-700 dark:text-amber-400">{stats.project.total_CLOC.toLocaleString()}</span>
                                            </div>
                                            <div className="flex justify-between items-center p-4 hover:bg-indigo-50/30 dark:hover:bg-indigo-500/10 transition-colors">
                                                <span className="text-sm font-medium text-indigo-700 dark:text-indigo-400">{t('projectDetails.blankLines')}</span>
                                                <span className="text-lg font-bold text-indigo-700 dark:text-indigo-400">
                                                    {(stats.project.total_PLOC - stats.project.total_LLOC - stats.project.total_CLOC).toLocaleString()}
                                                </span>
                                            </div>
                                        </div>
                                    </div>
                                </div>

                                {/* Divider (Visible on large screens) */}
                                <div className="hidden xl:block w-px bg-slate-100 dark:bg-slate-800 self-stretch mx-2"></div>

                                {/* Right: File Statistics */}
                                <div className="flex-1">
                                    <h4 className="text-sm font-semibold text-slate-500 dark:text-slate-400 mb-3 ml-1">{t('projectDetails.fileStatistics')}</h4>
                                    <div className="bg-white dark:bg-slate-800/50 rounded-xl border border-slate-200 dark:border-slate-700 overflow-hidden shadow-sm">
                                        <div className="divide-y divide-slate-100 dark:divide-slate-700">
                                            <div className="flex justify-between items-center p-4 hover:bg-slate-50 dark:hover:bg-slate-800 transition-colors">
                                                <span className="text-sm font-medium text-slate-600 dark:text-slate-400">{t('projectDetails.totalFiles')}</span>
                                                <span className="text-lg font-bold text-slate-900 dark:text-white">{stats.project.total_file_count.toLocaleString()}</span>
                                            </div>
                                            <div className="flex justify-between items-center p-4 hover:bg-blue-50/30 dark:hover:bg-blue-500/10 transition-colors">
                                                <span className="text-sm font-medium text-blue-700 dark:text-blue-400">{t('projectDetails.validJavaFiles')}</span>
                                                <span className="text-lg font-bold text-blue-700 dark:text-blue-400">{stats.project.total_java_file_count.toLocaleString()}</span>
                                            </div>
                                            <div className="flex justify-between items-center p-4 hover:bg-orange-50/30 dark:hover:bg-orange-500/10 transition-colors">
                                                <span className="text-sm font-medium text-orange-700 dark:text-orange-400">{t('projectDetails.xmlFiles')}</span>
                                                <span className="text-lg font-bold text-orange-700 dark:text-orange-400">{stats.project.total_xml_file_count.toLocaleString()}</span>
                                            </div>
                                            <div className="flex justify-between items-center p-4 hover:bg-slate-50/50 dark:hover:bg-slate-800 transition-colors">
                                                <span className="text-sm font-medium text-slate-600 dark:text-slate-400">{t('projectDetails.configFiles')}</span>
                                                <span className="text-lg font-bold text-slate-900 dark:text-white">{stats.project.total_config_file_count.toLocaleString()}</span>
                                            </div>
                                            <div className="flex justify-between items-center p-4 hover:bg-red-50/30 dark:hover:bg-red-500/10 transition-colors">
                                                <span className="text-sm font-medium text-red-700 dark:text-red-400">{t('projectDetails.ignored')}</span>
                                                <span className="text-lg font-bold text-red-700 dark:text-red-400">{stats.project.total_ignored_file_count.toLocaleString()}</span>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        )}
                    </div>
                </div>
            )}

            {/* Hierarchy / Modules - Split View */}
            <div className="bg-white dark:bg-slate-900 rounded-2xl shadow-sm border border-slate-200 dark:border-slate-800 overflow-hidden flex flex-col md:flex-row h-[600px]">
                {/* Left Panel: Packages */}
                <div className="w-full md:w-1/3 border-r border-slate-100 dark:border-slate-800 flex flex-col bg-slate-50/30 dark:bg-slate-900/50">
                    <div className="p-4 border-b border-slate-100 dark:border-slate-800 bg-slate-50 dark:bg-slate-900/80">
                        <div className="flex items-center justify-between w-full">
                            <h2 className="text-lg font-bold text-slate-900 dark:text-white flex items-center gap-2">
                                <Database className="w-5 h-5 text-slate-400 dark:text-slate-500" />
                                {t('projectDetails.packages')}
                                <span className="text-sm font-normal text-slate-500 dark:text-slate-400 bg-slate-100 dark:bg-slate-800 px-2 py-0.5 rounded-full ml-1 whitespace-nowrap">
                                    {packageSearchQuery
                                        ? `${Number(filteredPackages.length).toLocaleString()} / ${Number(hierarchy?.length || 0).toLocaleString()}`
                                        : Number(hierarchy?.length || 0).toLocaleString()
                                    }
                                </span>
                            </h2>
                            <div className="relative max-w-[200px] w-full ml-2">
                                <div className="absolute inset-y-0 left-0 pl-2 flex items-center pointer-events-none">
                                    <Search className="h-3 w-3 text-slate-400" />
                                </div>
                                <input
                                    type="text"
                                    className="block w-full pl-8 pr-8 py-1 border border-slate-200 dark:border-slate-700 rounded-lg text-xs placeholder-slate-400 dark:placeholder-slate-500 focus:outline-none focus:border-indigo-500 focus:ring-1 focus:ring-indigo-500 bg-white dark:bg-slate-800 text-slate-900 dark:text-white transition-all"
                                    placeholder={t('projectDetails.searchPackages')}
                                    value={packageSearchQuery}
                                    onChange={(e) => setPackageSearchQuery(e.target.value)}
                                    onClick={(e) => e.stopPropagation()}
                                />
                                {packageSearchQuery && (
                                    <button
                                        onClick={(e) => {
                                            e.stopPropagation();
                                            setPackageSearchQuery('');
                                        }}
                                        className="absolute inset-y-0 right-0 pr-2 flex items-center text-slate-400 hover:text-slate-600 dark:hover:text-slate-300 transition-colors"
                                    >
                                        <X className="h-3 w-3" />
                                    </button>
                                )}
                            </div>
                        </div>
                    </div>
                    <div className="flex-1 overflow-y-auto p-2 space-y-1">
                        {/* All Project Classes Item */}
                        <button
                            onClick={() => setSelectedPackage(ALL_PACKAGES)}
                            className={`w-full flex items-center gap-3 p-3 rounded-xl transition-all text-left ${selectedPackage === ALL_PACKAGES
                                ? 'bg-indigo-50 dark:bg-indigo-500/10 text-indigo-700 dark:text-indigo-400 shadow-sm border border-indigo-100 dark:border-indigo-500/20'
                                : 'text-slate-600 dark:text-slate-400 hover:bg-slate-100 dark:hover:bg-slate-800 border border-transparent'
                                }`}
                        >
                            <Layers className={`w-4 h-4 ${selectedPackage === ALL_PACKAGES ? 'text-indigo-500' : 'text-slate-400'}`} />
                            <span className="font-medium truncate text-sm">{t('projectDetails.allClasses')}</span>
                            <span className="ml-auto text-xs bg-slate-200/50 dark:bg-slate-800 px-2 py-0.5 rounded-full text-slate-500 dark:text-slate-400">
                                {hierarchy.reduce((acc, curr) => acc + curr.classes.length, 0)}
                            </span>
                        </button>

                        <div className="my-2 border-t border-slate-100 dark:border-slate-800"></div>

                        {filteredPackages.length === 0 ? (
                            <div className="p-4 text-center text-slate-400 dark:text-slate-500 text-sm">
                                {hierarchy.length === 0 ? t('projectDetails.noClassesFound') : t('projectDetails.noClassesMatch')}
                            </div>
                        ) : (
                            filteredPackages.map((item) => (
                                <button
                                    key={item.package}
                                    onClick={() => setSelectedPackage(item.package)}
                                    className={`w-full flex items-center gap-3 p-3 rounded-xl transition-all text-left ${selectedPackage === item.package
                                        ? 'bg-indigo-50 dark:bg-indigo-500/10 text-indigo-700 dark:text-indigo-400 shadow-sm border border-indigo-100 dark:border-indigo-500/20'
                                        : 'text-slate-600 dark:text-slate-400 hover:bg-slate-100 dark:hover:bg-slate-800 border border-transparent'
                                        }`}
                                >
                                    <FolderOpen className={`w-4 h-4 ${selectedPackage === item.package ? 'text-indigo-500' : 'text-slate-400'}`} />
                                    <span className="font-medium truncate text-sm">{item.package}</span>
                                    <span className="ml-auto text-xs bg-slate-200/50 dark:bg-slate-800 px-2 py-0.5 rounded-full text-slate-500 dark:text-slate-400">
                                        {item.classes.length}
                                    </span>
                                </button>
                            ))
                        )}
                    </div>
                </div>

                {/* Right Panel: Classes */}
                <div className="flex-1 flex flex-col bg-white dark:bg-slate-900">
                    <div className="p-4 border-b border-slate-100 dark:border-slate-800 flex justify-between items-center bg-slate-50/50 dark:bg-slate-900/80">
                        <div className="flex items-center gap-4 flex-1">
                            <h2 className="text-lg font-bold text-slate-900 dark:text-white flex items-center gap-2 whitespace-nowrap">
                                <Layers className="w-5 h-5 text-slate-400 dark:text-slate-500" />
                                {t('projectDetails.classes')}
                                {selectedPackage && selectedPackage !== ALL_PACKAGES && <span className="text-slate-400 dark:text-slate-500 font-normal text-sm ml-2 hidden xl:inline">in {selectedPackage}</span>}
                                {selectedPackage === ALL_PACKAGES && <span className="text-slate-400 dark:text-slate-500 font-normal text-sm ml-2 hidden xl:inline">({t('projectDetails.allClasses')})</span>}
                            </h2>

                            {/* Search Input */}
                            <div className="relative max-w-md w-full ml-4">
                                <div className="absolute inset-y-0 left-0 pl-3 flex items-center pointer-events-none">
                                    <Search className="h-4 w-4 text-slate-400" />
                                </div>
                                <input
                                    type="text"
                                    className="block w-full pl-10 pr-10 py-1.5 border border-slate-200 dark:border-slate-700 rounded-lg text-sm placeholder-slate-400 dark:placeholder-slate-500 focus:outline-none focus:border-indigo-500 focus:ring-1 focus:ring-indigo-500 bg-white dark:bg-slate-800 text-slate-900 dark:text-white transition-all"
                                    placeholder={t('projectDetails.searchClasses')}
                                    value={searchQuery}
                                    onChange={(e) => setSearchQuery(e.target.value)}
                                />
                                {searchQuery && (
                                    <button
                                        onClick={() => setSearchQuery('')}
                                        className="absolute inset-y-0 right-0 pr-3 flex items-center text-slate-400 hover:text-slate-600 dark:hover:text-slate-300 transition-colors"
                                    >
                                        <X className="h-4 w-4" />
                                    </button>
                                )}
                            </div>
                        </div>

                        {selectedPackage && !searchQuery && (
                            <span className="text-xs font-medium px-2.5 py-1 bg-white dark:bg-slate-800 border border-slate-200 dark:border-slate-700 rounded-md text-slate-500 dark:text-slate-400 ml-4 whitespace-nowrap">
                                {filteredClasses.length} {t('projectDetails.items')}
                            </span>
                        )}
                        {searchQuery && (
                            <span className="text-xs font-medium px-2.5 py-1 bg-white dark:bg-slate-800 border border-slate-200 dark:border-slate-700 rounded-md text-slate-500 dark:text-slate-400 ml-4 whitespace-nowrap">
                                {filteredClasses.length} {t('projectDetails.resultsFound')}
                            </span>
                        )}
                    </div>
                    <div className="flex-1 overflow-hidden p-0">
                        {!selectedPackage && !searchQuery ? (
                            <div className="flex flex-col items-center justify-center h-full text-slate-400 dark:text-slate-500">
                                <FolderOpen className="w-12 h-12 mb-2 opacity-20" />
                                <p>{t('projectDetails.selectPackageHint')}</p>
                            </div>
                        ) : (
                            <VirtualizedTable
                                data={filteredClasses}
                                columns={classTableColumns}
                                height={550}
                                rowHeight={50}
                                headerHeight={45}
                                hoverable
                                emptyMessage={
                                    filteredClasses.length === 0
                                        ? t('projectDetails.noClassesFound')
                                        : t('projectDetails.noClassesMatch')
                                }
                                onRowClick={(cls) =>
                                    navigate(`/projects/${encodeURIComponent(projectName || '')}/classes/${encodeURIComponent(cls.name)}?package=${encodeURIComponent(cls.packageName || selectedPackage || '')}`)
                                }
                            />
                        )}
                    </div>
                </div>
            </div>

            {/* Report Viewer Modal */}
            <ReportViewerModal
                isOpen={isReportModalOpen}
                onClose={() => setIsReportModalOpen(false)}
                title={reportData?.title || ''}
                content={reportData?.content || ''}
                isGrid={reportData?.isGrid}
                gridData={reportData?.gridData}
            />
        </div >
    );
};

export default ProjectDetails;
