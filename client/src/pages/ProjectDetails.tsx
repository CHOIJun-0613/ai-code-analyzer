import React, { useEffect, useState } from 'react';
import axios from 'axios';
import { useParams, useNavigate } from 'react-router-dom';
import { ArrowLeft, Box, FileCode, Layers, Database, FolderOpen, Code2, Search, Info, Code, Pencil, Check, X, ChevronDown, ChevronUp, FileText } from 'lucide-react';
import ReportViewerModal from '../components/ReportViewerModal';

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
}

interface HierarchyItem {
    package: string;
    classes: ClassItem[];
}

const ProjectDetails: React.FC = () => {
    const { projectName } = useParams<{ projectName: string }>();
    const navigate = useNavigate();
    const [stats, setStats] = useState<ProjectStats | null>(null);
    const [hierarchy, setHierarchy] = useState<HierarchyItem[]>([]);
    const [isLoading, setIsLoading] = useState(true);
    const [error, setError] = useState<string | null>(null);

    const [selectedPackage, setSelectedPackage] = useState<string | null>(null);
    const [searchQuery, setSearchQuery] = useState('');
    const [packageSearchQuery, setPackageSearchQuery] = useState('');

    // Edit Mode State
    const [isEditing, setIsEditing] = useState(false);
    const [editForm, setEditForm] = useState({
        framework: '',
        repository: ''
    });

    const [areCardsExpanded, setAreCardsExpanded] = useState(true);

    // Report State
    const [isReportModalOpen, setIsReportModalOpen] = useState(false);
    const [reportData, setReportData] = useState<{ title: string; content: string } | null>(null);
    const [isReportMenuOpen, setIsReportMenuOpen] = useState(false);

    const handleOpenReport = async (type: 'stats' | 'crud' | 'classes', title: string) => {
        setIsReportMenuOpen(false);
        try {
            const { data } = await axios.get<{ content: string }>(`/api/v1/projects/${projectName}/reports/${type}`);
            setReportData({ title, content: data.content });
            setIsReportModalOpen(true);
        } catch (err) {
            console.error('Failed to fetch report', err);
            alert('Failed to fetch report');
        }
    };

    useEffect(() => {
        const fetchData = async () => {
            if (!projectName) return;
            setIsLoading(true);
            try {
                // Fetch stats and hierarchy in parallel
                const [statsRes, hierarchyRes] = await Promise.all([
                    axios.get(`/api/v1/projects/${projectName}/stats`),
                    axios.get(`/api/v1/projects/${projectName}/hierarchy`)
                ]);

                setStats(statsRes.data);
                // Initialize form with fetched data
                setEditForm({
                    framework: statsRes.data.project.framework || '',
                    repository: statsRes.data.project.repository || ''
                });
                setHierarchy(hierarchyRes.data);

                // Select first package by default if available
                if (hierarchyRes.data.length > 0) {
                    setSelectedPackage(hierarchyRes.data[0].package);
                }
            } catch (err) {
                console.error("Failed to fetch project details", err);
                setError("Failed to load project details.");
            } finally {
                setIsLoading(false);
            }
        };

        fetchData();
    }, [projectName]);

    const handleSaveProjectInfo = async () => {
        if (!stats) return;
        try {
            await axios.patch(`/api/v1/projects/${projectName}`, {
                framework: editForm.framework,
                repository: editForm.repository
            });

            // Update local state
            setStats({
                ...stats,
                project: {
                    ...stats.project,
                    framework: editForm.framework,
                    repository: editForm.repository
                }
            });
            setIsEditing(false);
        } catch (err) {
            console.error("Failed to update project", err);
            alert("Failed to save changes.");
        }
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

    const selectedHierarchyItem = hierarchy.find(h => h.package === selectedPackage);

    const filteredClasses = selectedHierarchyItem?.classes.filter(cls =>
        cls.name.toLowerCase().includes(searchQuery.toLowerCase()) ||
        (cls.logical_name && cls.logical_name.toLowerCase().includes(searchQuery.toLowerCase()))
    ) || [];

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
                <h3 className="text-lg font-medium text-slate-900">Project not found</h3>
                <button
                    onClick={() => navigate('/')}
                    className="mt-4 px-4 py-2 text-sm font-medium text-white bg-indigo-600 rounded-lg hover:bg-indigo-700 transition-colors"
                >
                    Back to Dashboard
                </button>
            </div>
        );
    }

    return (
        <div className="space-y-8 animate-in fade-in duration-500">
            {/* Header */}
            <div>
                <button
                    onClick={() => navigate('/')}
                    className="flex items-center text-slate-500 hover:text-indigo-600 mb-4 transition-colors group"
                >
                    <ArrowLeft className="w-4 h-4 mr-1 group-hover:-translate-x-1 transition-transform" />
                    Back to Dashboard
                </button>
                <div className="flex items-center justify-between">
                    <div className="flex items-center gap-4">
                        <div className="p-3 bg-indigo-50 rounded-xl">
                            <Box className="w-8 h-8 text-indigo-600" />
                        </div>
                        <div>
                            {stats && (
                                <>
                                    <h1 className="text-3xl font-bold text-slate-900">{stats.project.name}</h1>
                                    <p className="text-slate-500">Last updated: {new Date(stats.project.updated_at).toLocaleString()}</p>
                                </>
                            )}
                        </div>
                    </div>

                    {/* Reports Menu */}
                    <div className="relative">
                        <button
                            onClick={() => setIsReportMenuOpen(!isReportMenuOpen)}
                            className="flex items-center gap-2 px-4 py-2 bg-white border border-slate-200 rounded-lg text-slate-600 hover:bg-slate-50 hover:text-indigo-600 transition-colors shadow-sm font-medium"
                        >
                            <FileText className="w-5 h-5" />
                            Reports
                            <ChevronDown className={`w-4 h-4 transition-transform ${isReportMenuOpen ? 'rotate-180' : ''}`} />
                        </button>

                        {isReportMenuOpen && (
                            <>
                                <div
                                    className="fixed inset-0 z-10"
                                    onClick={() => setIsReportMenuOpen(false)}
                                />
                                <div className="absolute right-0 mt-2 w-56 bg-white rounded-xl shadow-xl border border-slate-100 z-20 py-2 animate-in fade-in zoom-in-95 duration-200">
                                    <div className="px-4 py-2 border-b border-slate-50">
                                        <span className="text-xs font-bold text-slate-400 uppercase tracking-wider">Generate Report</span>
                                    </div>
                                    <button
                                        onClick={() => handleOpenReport('stats', 'Project Statistics Report')}
                                        className="w-full text-left px-4 py-3 hover:bg-indigo-50 text-slate-700 hover:text-indigo-700 transition-colors flex items-center gap-2"
                                    >
                                        <Layers className="w-4 h-4" />
                                        Project Statistics
                                    </button>
                                    <button
                                        onClick={() => handleOpenReport('crud', 'CRUD Matrix Report')}
                                        className="w-full text-left px-4 py-3 hover:bg-indigo-50 text-slate-700 hover:text-indigo-700 transition-colors flex items-center gap-2"
                                    >
                                        <Database className="w-4 h-4" />
                                        CRUD Matrix
                                    </button>
                                    <button
                                        onClick={() => handleOpenReport('classes', 'Class List Report')}
                                        className="w-full text-left px-4 py-3 hover:bg-indigo-50 text-slate-700 hover:text-indigo-700 transition-colors flex items-center gap-2"
                                    >
                                        <FileCode className="w-4 h-4" />
                                        Class List
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
                    <div className="bg-white p-6 rounded-2xl shadow-sm border border-slate-100 flex flex-col gap-4">
                        <div className="flex justify-between items-center border-b border-slate-100 pb-2">
                            <h3 className="text-lg font-bold text-slate-900 flex items-center gap-2 cursor-pointer select-none" onClick={() => setAreCardsExpanded(!areCardsExpanded)}>
                                <Info className="w-5 h-5 text-indigo-600" />
                                Project Information
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
                                            Save
                                        </button>
                                        <button
                                            onClick={handleCancelEdit}
                                            className="flex items-center gap-1 px-3 py-1.5 bg-white border border-slate-200 text-slate-600 text-sm font-medium rounded-lg hover:bg-slate-50 transition-colors"
                                        >
                                            <X className="w-3.5 h-3.5" />
                                            Cancel
                                        </button>
                                    </div>
                                ) : (
                                    <button
                                        onClick={() => setIsEditing(true)}
                                        className="flex items-center gap-1 px-3 py-1.5 text-slate-500 hover:text-indigo-600 hover:bg-indigo-50 rounded-lg transition-all text-sm font-medium"
                                    >
                                        <Pencil className="w-3.5 h-3.5" />
                                        Edit
                                    </button>
                                )}
                            </div>
                        </div>

                        {areCardsExpanded && (
                            <>
                                <div className="grid grid-cols-1 gap-y-3">
                                    <div className="grid grid-cols-3 items-center">
                                        <span className="text-sm font-medium text-slate-500">Application Name</span>
                                        <span className="col-span-2 text-slate-900 font-medium">{stats.project.application_name || '-'}</span>
                                    </div>
                                    <div className="grid grid-cols-3 items-center">
                                        <span className="text-sm font-medium text-slate-500">Framework</span>
                                        <div className="col-span-2">
                                            {isEditing ? (
                                                <input
                                                    type="text"
                                                    className="w-full px-3 py-1.5 text-sm border border-indigo-200 rounded-lg focus:outline-none focus:ring-2 focus:ring-indigo-500/20 focus:border-indigo-500 transition-all"
                                                    placeholder="e.g. Spring Boot"
                                                    value={editForm.framework}
                                                    onChange={(e) => setEditForm({ ...editForm, framework: e.target.value })}
                                                />
                                            ) : (
                                                <span className="text-slate-900">{stats.project.framework || <span className="text-slate-400 italic">Not specified</span>}</span>
                                            )}
                                        </div>
                                    </div>
                                    <div className="grid grid-cols-3 items-center">
                                        <span className="text-sm font-medium text-slate-500">Repository</span>
                                        <div className="col-span-2">
                                            {isEditing ? (
                                                <input
                                                    type="text"
                                                    className="w-full px-3 py-1.5 text-sm border border-indigo-200 rounded-lg focus:outline-none focus:ring-2 focus:ring-indigo-500/20 focus:border-indigo-500 transition-all"
                                                    placeholder="Git Repository URL"
                                                    value={editForm.repository}
                                                    onChange={(e) => setEditForm({ ...editForm, repository: e.target.value })}
                                                />
                                            ) : (
                                                <span className="text-slate-900 truncate block" title={stats.project.repository}>
                                                    {stats.project.repository || <span className="text-slate-400 italic">Not specified</span>}
                                                </span>
                                            )}
                                        </div>
                                    </div>
                                    <div className="grid grid-cols-3 items-start">
                                        <span className="text-sm font-medium text-slate-500 mt-1">Path</span>
                                        <span className="col-span-2 text-xs text-slate-600 font-mono bg-slate-50 p-2 rounded break-all">
                                            {stats.project.path}
                                        </span>
                                    </div>
                                </div>

                                {/* Summary Stats */}
                                <div className="border-t border-slate-100 pt-4 mt-2">
                                    <div className="grid grid-cols-2 gap-4">
                                        <div className="flex flex-col items-center p-3 bg-purple-50/50 rounded-xl border border-purple-100">
                                            <Layers className="w-5 h-5 text-purple-600 mb-1" />
                                            <span className="text-xl font-bold text-slate-900">{stats.package_count}</span>
                                            <span className="text-xs text-slate-500 font-medium">Packages</span>
                                        </div>
                                        <div className="flex flex-col items-center p-3 bg-emerald-50/50 rounded-xl border border-emerald-100">
                                            <Code2 className="w-5 h-5 text-emerald-600 mb-1" />
                                            <span className="text-xl font-bold text-slate-900">{stats.class_count}</span>
                                            <span className="text-xs text-slate-500 font-medium">Classes</span>
                                        </div>
                                    </div>
                                </div>
                            </>
                        )}
                    </div>

                    {/* Code Statistics */}
                    <div className="bg-white p-6 rounded-2xl shadow-sm border border-slate-100 flex flex-col gap-4">
                        <h3 className="text-lg font-bold text-slate-900 flex items-center justify-between border-b border-slate-100 pb-2 cursor-pointer select-none" onClick={() => setAreCardsExpanded(!areCardsExpanded)}>
                            <div className="flex items-center gap-2">
                                <Code className="w-5 h-5 text-emerald-600" />
                                Code Statistics
                            </div>
                            {areCardsExpanded ? <ChevronUp className="w-4 h-4 text-slate-400" /> : <ChevronDown className="w-4 h-4 text-slate-400" />}
                        </h3>

                        {areCardsExpanded && (
                            <>
                                <div className="grid grid-cols-2 gap-4">
                                    <div className="p-4 bg-slate-50 rounded-xl border border-slate-100">
                                        <span className="text-sm font-medium text-slate-500 block mb-1">Total Lines (PLOC)</span>
                                        <span className="text-2xl font-bold text-slate-900">{stats.project.total_PLOC.toLocaleString()}</span>
                                    </div>
                                    <div className="p-4 bg-emerald-50 rounded-xl border border-emerald-100">
                                        <span className="text-sm font-medium text-emerald-700 block mb-1">Code Lines (LLOC)</span>
                                        <span className="text-2xl font-bold text-emerald-700">{stats.project.total_LLOC.toLocaleString()}</span>
                                    </div>
                                    <div className="p-4 bg-amber-50 rounded-xl border border-amber-100">
                                        <span className="text-sm font-medium text-amber-700 block mb-1">Comment Lines (CLOC)</span>
                                        <span className="text-2xl font-bold text-amber-700">{stats.project.total_CLOC.toLocaleString()}</span>
                                    </div>
                                    <div className="p-4 bg-indigo-50 rounded-xl border border-indigo-100">
                                        <span className="text-sm font-medium text-indigo-700 block mb-1">Blank Lines</span>
                                        <span className="text-2xl font-bold text-indigo-700">
                                            {(stats.project.total_PLOC - stats.project.total_LLOC - stats.project.total_CLOC).toLocaleString()}
                                        </span>
                                    </div>
                                </div>

                                {/* File Counts */}
                                <div className="space-y-2 text-sm border-l border-slate-100 pl-4">
                                    <div className="flex justify-between">
                                        <span className="text-slate-500">Total Files</span>
                                        <span className="font-bold text-slate-900">{stats.project.total_file_count.toLocaleString()}</span>
                                    </div>
                                    <div className="flex justify-between">
                                        <span className="text-slate-500">Valid Java Files</span>
                                        <span className="text-slate-900">{stats.project.total_java_file_count}</span>
                                    </div>
                                    <div className="flex justify-between">
                                        <span className="text-slate-500">XML Files</span>
                                        <span className="text-slate-900">{stats.project.total_xml_file_count}</span>
                                    </div>
                                    <div className="flex justify-between">
                                        <span className="text-slate-500">Config Files</span>
                                        <span className="text-slate-900">{stats.project.total_config_file_count}</span>
                                    </div>
                                    <div className="flex justify-between">
                                        <span className="text-slate-500">Ignored</span>
                                        <span className="text-slate-400">{stats.project.total_ignored_file_count}</span>
                                    </div>
                                </div>
                            </>
                        )}
                    </div>
                </div>
            )}

            {/* Hierarchy / Modules - Split View */}
            <div className="bg-white rounded-2xl shadow-sm border border-slate-100 overflow-hidden flex flex-col md:flex-row h-[600px]">
                {/* Left Panel: Packages */}
                <div className="w-full md:w-1/3 border-r border-slate-100 flex flex-col bg-slate-50/30">
                    <div className="p-4 border-b border-slate-100 bg-slate-50">
                        <div className="flex items-center justify-between w-full">
                            <h2 className="text-lg font-bold text-slate-900 flex items-center gap-2">
                                <Database className="w-5 h-5 text-slate-400" />
                                Packages
                                <span className="text-sm font-normal text-slate-500 bg-slate-100 px-2 py-0.5 rounded-full ml-1 whitespace-nowrap">
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
                                    className="block w-full pl-8 pr-2 py-1 border border-slate-200 rounded-lg text-xs placeholder-slate-400 focus:outline-none focus:border-indigo-500 focus:ring-1 focus:ring-indigo-500 bg-white"
                                    placeholder="Search packages..."
                                    value={packageSearchQuery}
                                    onChange={(e) => setPackageSearchQuery(e.target.value)}
                                    onClick={(e) => e.stopPropagation()}
                                />
                            </div>
                        </div>
                    </div>
                    <div className="flex-1 overflow-y-auto p-2 space-y-1">
                        {filteredPackages.length === 0 ? (
                            <div className="p-4 text-center text-slate-400 text-sm">
                                {hierarchy.length === 0 ? "No packages found" : "No packages match your search"}
                            </div>
                        ) : (
                            filteredPackages.map((item) => (
                                <button
                                    key={item.package}
                                    onClick={() => setSelectedPackage(item.package)}
                                    className={`w-full flex items-center gap-3 p-3 rounded-xl transition-all text-left ${selectedPackage === item.package
                                        ? 'bg-indigo-50 text-indigo-700 shadow-sm border border-indigo-100'
                                        : 'text-slate-600 hover:bg-slate-100 border border-transparent'
                                        }`}
                                >
                                    <FolderOpen className={`w-4 h-4 ${selectedPackage === item.package ? 'text-indigo-500' : 'text-slate-400'}`} />
                                    <span className="font-medium truncate text-sm">{item.package}</span>
                                    <span className="ml-auto text-xs bg-slate-200/50 px-2 py-0.5 rounded-full text-slate-500">
                                        {item.classes.length}
                                    </span>
                                </button>
                            ))
                        )}
                    </div>
                </div>

                {/* Right Panel: Classes */}
                <div className="flex-1 flex flex-col bg-white">
                    <div className="p-4 border-b border-slate-100 flex justify-between items-center bg-slate-50/50">
                        <div className="flex items-center gap-4 flex-1">
                            <h2 className="text-lg font-bold text-slate-900 flex items-center gap-2 whitespace-nowrap">
                                <Layers className="w-5 h-5 text-slate-400" />
                                Classes
                                {selectedPackage && <span className="text-slate-400 font-normal text-sm ml-2 hidden xl:inline">in {selectedPackage}</span>}
                            </h2>

                            {/* Search Input */}
                            <div className="relative max-w-md w-full ml-4">
                                <div className="absolute inset-y-0 left-0 pl-3 flex items-center pointer-events-none">
                                    <Search className="h-4 w-4 text-slate-400" />
                                </div>
                                <input
                                    type="text"
                                    className="block w-full pl-10 pr-3 py-1.5 border border-slate-200 rounded-lg text-sm placeholder-slate-400 focus:outline-none focus:border-indigo-500 focus:ring-1 focus:ring-indigo-500 bg-white"
                                    placeholder="Search classes (physical or logical name)..."
                                    value={searchQuery}
                                    onChange={(e) => setSearchQuery(e.target.value)}
                                />
                            </div>
                        </div>

                        {selectedHierarchyItem && (
                            <span className="text-xs font-medium px-2.5 py-1 bg-white border border-slate-200 rounded-md text-slate-500 ml-4 whitespace-nowrap">
                                {filteredClasses.length} / {selectedHierarchyItem.classes.length} items
                            </span>
                        )}
                    </div>
                    <div className="flex-1 overflow-y-auto p-0">
                        {!selectedPackage ? (
                            <div className="flex flex-col items-center justify-center h-full text-slate-400">
                                <FolderOpen className="w-12 h-12 mb-2 opacity-20" />
                                <p>Select a package to view its classes</p>
                            </div>
                        ) : (
                            <div>
                                {filteredClasses.length === 0 ? (
                                    <div className="py-12 text-center text-slate-400 italic">
                                        {selectedHierarchyItem?.classes.length === 0
                                            ? "No classes in this package"
                                            : "No classes match your search"}
                                    </div>
                                ) : (
                                    <table className="w-full text-left border-collapse">
                                        <thead className="bg-slate-50 sticky top-0 z-10 text-xs font-semibold text-slate-500 uppercase tracking-wider">
                                            <tr>
                                                <th className="px-6 py-3 border-b border-slate-100 w-1/2">Physical Name</th>
                                                <th className="px-6 py-3 border-b border-slate-100 w-1/2">Logical Name</th>
                                            </tr>
                                        </thead>
                                        <tbody className="divide-y divide-slate-100">
                                            {filteredClasses.map((cls, idx) => (
                                                <tr
                                                    key={idx}
                                                    onClick={() => navigate(`/projects/${encodeURIComponent(projectName || '')}/classes/${encodeURIComponent(cls.name)}`)}
                                                    className="hover:bg-indigo-50/30 transition-colors group cursor-pointer"
                                                >
                                                    <td className="px-6 py-3">
                                                        <div className="flex items-center">
                                                            <FileCode className="w-4 h-4 text-slate-400 mr-3 flex-shrink-0 group-hover:text-indigo-500 transition-colors" />
                                                            <span className="font-medium text-slate-700 truncate max-w-[300px] xl:max-w-[400px]" title={cls.name}>
                                                                {cls.name}
                                                            </span>
                                                        </div>
                                                    </td>
                                                    <td className="px-6 py-3">
                                                        <span className="text-slate-500 text-sm truncate max-w-[300px] xl:max-w-[400px] block" title={cls.logical_name || '-'}>
                                                            {cls.logical_name || '-'}
                                                        </span>
                                                    </td>
                                                </tr>
                                            ))}
                                        </tbody>
                                    </table>
                                )}
                            </div>
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
            />
        </div >
    );
};

export default ProjectDetails;
