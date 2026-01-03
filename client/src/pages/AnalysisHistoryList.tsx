import React, { useState, useEffect, useMemo } from 'react';
import { useTranslation } from 'react-i18next';
import client from '../api/client';
import { Trash2, RefreshCw, Search, FileText, Settings, X, ArrowUpDown, ArrowUp, ArrowDown, History } from 'lucide-react';

import ConfirmModal from '../components/ConfirmModal';
import toast from 'react-hot-toast';

interface AnalysisHistory {
    id: string; // Neo4j elementId
    job_id: string;
    project_name: string;
    user_id: string;
    user_name?: string;
    result: string;
    start_time: string;
    end_time: string;
    work_time: string;
    file_count: number;
    summary: string;
    preferences: string; // JSON string of Static options
    preferences_ai?: string; // JSON string of AI options
    analysis_type?: string; // 'Static' or 'AI'
    created_at: string;
}

type SortKey = keyof AnalysisHistory;
type SortDirection = 'asc' | 'desc';

interface SortConfig {
    key: SortKey;
    direction: SortDirection;
}

const AnalysisHistoryList: React.FC = () => {
    const { t } = useTranslation();
    const [history, setHistory] = useState<AnalysisHistory[]>([]);
    const [isLoading, setIsLoading] = useState(true);
    const [searchTerm, setSearchTerm] = useState('');
    const [sortConfig, setSortConfig] = useState<SortConfig | null>({ key: 'start_time', direction: 'desc' });

    // Modal State
    const [selectedSummary, setSelectedSummary] = useState<{ id: string, content: string } | null>(null);
    const [selectedOptions, setSelectedOptions] = useState<{ id: string, content: string, title: string } | null>(null);
    const [deleteConfirm, setDeleteConfirm] = useState<{ id: string, jobId: string } | null>(null);

    const fetchHistory = async () => {
        setIsLoading(true);
        try {
            const res = await client.get<AnalysisHistory[]>('/analysis/history');
            setHistory(res.data);
        } catch (error) {
            console.error("Failed to fetch history", error);
        } finally {
            setIsLoading(false);
        }
    };

    useEffect(() => {
        fetchHistory();
    }, []);

    const handleDelete = (id: string, jobId: string) => {
        setDeleteConfirm({ id, jobId });
    };

    const executeDelete = async () => {
        if (!deleteConfirm) return;

        try {
            await client.delete(`/analysis/history/${deleteConfirm.id}`);
            setHistory(prev => prev.filter(item => item.id !== deleteConfirm.id));
            toast.success(t('analysis.deleteSuccess') || "Log deleted successfully");
        } catch (error) {
            console.error("Failed to delete history", error);
            toast.error(t('analysis.deleteFailed') || "Failed to delete history record");
        } finally {
            setDeleteConfirm(null);
        }
    };

    const handleViewOptions = (id: string, contentStr: string, title: string) => {
        let formatted = contentStr;
        try {
            // Try to format JSON prettily
            const parsed = JSON.parse(contentStr);
            formatted = JSON.stringify(parsed, null, 2);
        } catch (e) {
            // If not valid JSON, leave as is
        }
        setSelectedOptions({ id, content: formatted, title });
    };

    const handleSort = (key: SortKey) => {
        let direction: SortDirection = 'asc';
        if (sortConfig && sortConfig.key === key && sortConfig.direction === 'asc') {
            direction = 'desc';
        }
        setSortConfig({ key, direction });
    };

    const sortedHistory = useMemo(() => {
        let sortableItems = [...history];

        // Filter first
        if (searchTerm) {
            sortableItems = sortableItems.filter(item =>
                item.project_name?.toLowerCase().includes(searchTerm.toLowerCase()) ||
                item.job_id?.toLowerCase().includes(searchTerm.toLowerCase()) ||
                item.user_id?.toLowerCase().includes(searchTerm.toLowerCase())
            );
        }

        // Then sort
        if (sortConfig !== null) {
            sortableItems.sort((a, b) => {
                const aValue = a[sortConfig.key];
                const bValue = b[sortConfig.key];

                if (aValue === undefined || aValue === null) return 1;
                if (bValue === undefined || bValue === null) return -1;

                if (aValue < bValue) {
                    return sortConfig.direction === 'asc' ? -1 : 1;
                }
                if (aValue > bValue) {
                    return sortConfig.direction === 'asc' ? 1 : -1;
                }
                return 0;
            });
        }
        return sortableItems;
    }, [history, sortConfig, searchTerm]);

    const SortIcon = ({ columnKey }: { columnKey: SortKey }) => {
        if (sortConfig?.key !== columnKey) return <ArrowUpDown className="w-4 h-4 text-slate-300 ml-1 opacity-0 group-hover:opacity-50 transition-opacity" />;
        return sortConfig.direction === 'asc'
            ? <ArrowUp className="w-4 h-4 text-indigo-500 ml-1" />
            : <ArrowDown className="w-4 h-4 text-indigo-500 ml-1" />;
    };

    const renderSortableHeader = (label: string, key: SortKey) => (
        <th
            className="px-6 py-4 whitespace-nowrap cursor-pointer group hover:bg-slate-100 dark:hover:bg-slate-800 transition-colors select-none"
            onClick={() => handleSort(key)}
        >
            <div className="flex items-center gap-1">
                {label}
                <SortIcon columnKey={key} />
            </div>
        </th>
    );

    return (
        <div className="space-y-6">
            <div className="flex items-center gap-3">
                <div className="p-3 bg-indigo-50 dark:bg-indigo-500/10 rounded-xl">
                    <History className="w-8 h-8 text-indigo-600 dark:text-indigo-400" />
                </div>
                <div>
                    <h1 className="text-3xl font-bold text-slate-900 dark:text-white">{t('analysis.historyTitle') || "Analysis Log Management"}</h1>
                    <p className="text-slate-500 dark:text-slate-400 mt-1">{t('analysis.historySubtitle') || "View and manage past analysis records."}</p>
                </div>
            </div>

            {/* Actions Bar */}
            <div className="flex flex-col sm:flex-row justify-between items-center gap-4 bg-white dark:bg-slate-900 p-4 rounded-xl border border-slate-200 dark:border-slate-800 shadow-sm">
                <div className="relative w-full sm:w-96">
                    <div className="absolute inset-y-0 left-0 pl-3 flex items-center pointer-events-none">
                        <Search className="h-4 w-4 text-slate-400 dark:text-slate-500" />
                    </div>
                    <input
                        type="text"
                        placeholder="Search logs..."
                        value={searchTerm}
                        onChange={(e) => setSearchTerm(e.target.value)}
                        className="w-full pl-10 pr-4 py-2 rounded-lg border border-slate-200 dark:border-slate-700 bg-white dark:bg-slate-900 text-slate-900 dark:text-slate-200 focus:border-indigo-500 focus:ring-2 focus:ring-indigo-500/10 outline-none text-sm transition-all placeholder:text-slate-400 dark:placeholder:text-slate-500"
                    />
                </div>
                <button
                    onClick={fetchHistory}
                    className="flex items-center gap-2 px-4 py-2 text-slate-600 dark:text-slate-300 bg-slate-50 dark:bg-slate-800 hover:bg-white dark:hover:bg-slate-700 hover:text-indigo-600 dark:hover:text-indigo-400 border border-slate-200 dark:border-slate-700 rounded-lg transition-all text-sm font-medium shadow-sm hover:shadow"
                >
                    <RefreshCw className={`w-4 h-4 ${isLoading ? 'animate-spin' : ''}`} />
                    Refresh
                </button>
            </div>

            {/* Table */}
            <div className="bg-white dark:bg-slate-900 rounded-2xl shadow-sm border border-slate-200 dark:border-slate-800 overflow-hidden">
                <div className="overflow-x-auto">
                    <table className="w-full text-sm text-left">
                        <thead className="bg-slate-50 dark:bg-slate-950 text-slate-500 dark:text-slate-400 font-semibold border-b border-slate-200 dark:border-slate-800">
                            <tr>
                                {renderSortableHeader(t('analysis.jobId') || "Job ID", 'job_id')}
                                <th className="px-6 py-4 whitespace-nowrap">{t('analysis.analysisType') || "Analysis Type"}</th>
                                {renderSortableHeader(t('analysis.project') || "Project", 'project_name')}
                                {renderSortableHeader(t('analysis.user') || "User", 'user_id')}
                                {renderSortableHeader(t('analysis.status') || "Result", 'result')}
                                {renderSortableHeader(t('analysis.startedAt') || "Started At", 'start_time')}
                                {renderSortableHeader(t('analysis.duration') || "Duration", 'work_time')}
                                <th className="px-6 py-4 whitespace-nowrap">{t('analysis.resultSummary') || "Result Summary"}</th>
                                <th className="px-6 py-4 whitespace-nowrap">{t('analysis.analysisOptions') || "Analysis Options"}</th>
                                <th className="px-6 py-4 text-right">{t('analysis.actions') || "Actions"}</th>
                            </tr>
                        </thead>
                        <tbody className="divide-y divide-slate-100 dark:divide-slate-800">
                            {isLoading ? (
                                <tr>
                                    <td colSpan={9} className="px-6 py-12 text-center text-slate-500">
                                        <div className="flex flex-col items-center gap-2">
                                            <RefreshCw className="w-6 h-6 animate-spin text-indigo-400" />
                                            <span>Loading history...</span>
                                        </div>
                                    </td>
                                </tr>
                            ) : sortedHistory.length === 0 ? (
                                <tr>
                                    <td colSpan={9} className="px-6 py-12 text-center text-slate-500 italic">
                                        No history records found.
                                    </td>
                                </tr>
                            ) : (
                                sortedHistory.map((item) => (
                                    <tr key={item.id} className="hover:bg-slate-50/50 dark:hover:bg-slate-800/50 transition-colors">
                                        <td className="px-6 py-4 font-mono text-xs text-slate-600 dark:text-slate-400">
                                            {item.job_id}
                                        </td>
                                        <td className="px-6 py-4">
                                            <span className={`inline-flex items-center px-2.5 py-0.5 rounded-full text-xs font-medium border ${item.analysis_type === 'AI'
                                                ? 'bg-purple-50 text-purple-700 border-purple-200 dark:bg-purple-900/30 dark:text-purple-300 dark:border-purple-800'
                                                : 'bg-blue-50 text-blue-700 border-blue-200 dark:bg-blue-900/30 dark:text-blue-300 dark:border-blue-800'
                                                }`}>
                                                {item.analysis_type === 'AI' ? (t('analysis.typeAi') || "AI") : (t('analysis.typeStatic') || "Static")}
                                            </span>
                                        </td>
                                        <td className="px-6 py-4 font-medium text-slate-900 dark:text-white">
                                            {item.project_name || '-'}
                                        </td>
                                        <td className="px-6 py-4 text-slate-600 dark:text-slate-400">
                                            {item.user_id}{item.user_name ? `(${item.user_name})` : ''}
                                        </td>
                                        <td className="px-6 py-4">
                                            <span className={`inline-flex items-center px-2.5 py-0.5 rounded-full text-xs font-medium border ${item.result === 'Completed' ? 'bg-emerald-50 text-emerald-700 border-emerald-200 dark:bg-emerald-900/30 dark:text-emerald-300 dark:border-emerald-800' :
                                                item.result === 'Failed' ? 'bg-red-50 text-red-700 border-red-200 dark:bg-red-900/30 dark:text-red-300 dark:border-red-800' :
                                                    'bg-slate-100 text-slate-700 border-slate-200 dark:bg-slate-800 dark:text-slate-300 dark:border-slate-700'
                                                }`}>
                                                {item.result}
                                            </span>
                                        </td>
                                        <td className="px-6 py-4 text-slate-500 dark:text-slate-500 text-xs">
                                            {item.start_time}
                                        </td>
                                        <td className="px-6 py-4 text-slate-600 dark:text-slate-400 font-mono text-xs">
                                            {item.work_time}
                                        </td>
                                        <td className="px-6 py-4">
                                            <button
                                                onClick={() => setSelectedSummary({ id: item.job_id, content: item.summary })}
                                                className="flex items-center gap-1.5 px-2.5 py-1 text-xs font-medium text-slate-600 dark:text-slate-300 bg-white dark:bg-slate-800 border border-slate-200 dark:border-slate-700 rounded hover:text-indigo-600 dark:hover:text-indigo-400 hover:border-indigo-200 dark:hover:border-indigo-500 transition-colors"
                                            >
                                                <FileText className="w-3.5 h-3.5" />
                                                {t('analysis.view') || "View"}
                                            </button>
                                        </td>
                                        <td className="px-6 py-4">
                                            <button
                                                onClick={() => {
                                                    const isAi = item.analysis_type === 'AI';
                                                    const content = isAi ? (item.preferences_ai || "{}") : item.preferences;
                                                    const title = t('analysis.analysisOptions') || "Analysis Options";
                                                    handleViewOptions(item.job_id, content, title);
                                                }}
                                                className="flex items-center gap-1.5 px-2.5 py-1 text-xs font-medium text-slate-600 dark:text-slate-300 bg-white dark:bg-slate-800 border border-slate-200 dark:border-slate-700 rounded hover:text-indigo-600 dark:hover:text-indigo-400 hover:border-indigo-200 dark:hover:border-indigo-500 transition-colors"
                                            >
                                                <Settings className="w-3.5 h-3.5" />
                                                {t('analysis.view') || "View"}
                                            </button>
                                        </td>
                                        <td className="px-6 py-4 text-right">
                                            <button
                                                onClick={() => handleDelete(item.id, item.job_id)}
                                                className="p-2 text-slate-400 hover:text-red-500 dark:hover:text-red-400 hover:bg-red-50 dark:hover:bg-red-900/20 rounded-lg transition-colors"
                                                title={t('analysis.actions') || "Delete Log"}
                                            >
                                                <Trash2 className="w-4 h-4" />
                                            </button>
                                        </td>
                                    </tr>
                                ))
                            )}
                        </tbody>
                    </table>
                </div>
            </div>

            {/* Summary Modal */}
            {
                selectedSummary && (
                    <div className="fixed inset-0 z-50 flex items-center justify-center p-4 bg-slate-900/50 backdrop-blur-sm">
                        <div className="bg-white dark:bg-slate-900 rounded-2xl shadow-2xl w-full max-w-4xl max-h-[80vh] flex flex-col overflow-hidden animate-in fade-in zoom-in duration-200 border dark:border-slate-800">
                            <div className="flex items-center justify-between p-4 border-b border-slate-100 dark:border-slate-800 bg-slate-50/50 dark:bg-slate-950/50">
                                <h3 className="font-bold text-lg text-slate-800 dark:text-slate-100 flex items-center gap-2">
                                    <FileText className="w-5 h-5 text-indigo-600 dark:text-indigo-400" />
                                    {t('analysis.resultSummary') || "Result Summary"}
                                    <span className="text-xs font-normal text-slate-500 dark:text-slate-400 ml-2 font-mono">({selectedSummary.id})</span>
                                </h3>
                                <button
                                    onClick={() => setSelectedSummary(null)}
                                    className="p-2 text-slate-400 hover:text-slate-600 dark:hover:text-slate-200 hover:bg-slate-100 dark:hover:bg-slate-800 rounded-lg transition-colors"
                                >
                                    <X className="w-5 h-5" />
                                </button>
                            </div>
                            <div className="flex-1 overflow-auto p-6 bg-slate-50 dark:bg-black/20">
                                <pre className="whitespace-pre-wrap font-mono text-sm text-slate-700 dark:text-slate-300 bg-white dark:bg-slate-950 p-4 rounded-xl border border-slate-200 dark:border-slate-800 shadow-sm">
                                    {selectedSummary.content || "No summary available."}
                                </pre>
                            </div>
                            <div className="p-4 border-t border-slate-100 dark:border-slate-800 bg-white dark:bg-slate-900 flex justify-end">
                                <button
                                    onClick={() => setSelectedSummary(null)}
                                    className="px-4 py-2 bg-slate-100 dark:bg-slate-800 text-slate-700 dark:text-slate-300 rounded-lg hover:bg-slate-200 dark:hover:bg-slate-700 text-sm font-medium transition-colors"
                                >
                                    {t('analysis.close') || "Close"}
                                </button>
                            </div>
                        </div>
                    </div>
                )
            }

            {/* Options Modal */}
            {
                selectedOptions && (
                    <div className="fixed inset-0 z-50 flex items-center justify-center p-4 bg-slate-900/50 backdrop-blur-sm">
                        <div className="bg-white dark:bg-slate-900 rounded-2xl shadow-2xl w-full max-w-4xl max-h-[80vh] flex flex-col overflow-hidden animate-in fade-in zoom-in duration-200 border dark:border-slate-800">
                            <div className="flex items-center justify-between p-4 border-b border-slate-100 dark:border-slate-800 bg-slate-50/50 dark:bg-slate-950/50">
                                <h3 className="font-bold text-lg text-slate-800 dark:text-slate-100 flex items-center gap-2">
                                    <Settings className="w-5 h-5 text-indigo-600 dark:text-indigo-400" />
                                    {selectedOptions.title}
                                    <span className="text-xs font-normal text-slate-500 dark:text-slate-400 ml-2 font-mono">({selectedOptions.id})</span>
                                </h3>
                                <button
                                    onClick={() => setSelectedOptions(null)}
                                    className="p-2 text-slate-400 hover:text-slate-600 dark:hover:text-slate-200 hover:bg-slate-100 dark:hover:bg-slate-800 rounded-lg transition-colors"
                                >
                                    <X className="w-5 h-5" />
                                </button>
                            </div>
                            <div className="flex-1 overflow-auto p-0 bg-slate-900">
                                <pre className="whitespace-pre-wrap font-mono text-xs md:text-sm text-emerald-400 p-6">
                                    {selectedOptions.content || "{}"}
                                </pre>
                            </div>
                            <div className="p-4 border-t border-slate-100 dark:border-slate-800 bg-white dark:bg-slate-900 flex justify-end">
                                <button
                                    onClick={() => setSelectedOptions(null)}
                                    className="px-4 py-2 bg-slate-100 dark:bg-slate-800 text-slate-700 dark:text-slate-300 rounded-lg hover:bg-slate-200 dark:hover:bg-slate-700 text-sm font-medium transition-colors"
                                >
                                    {t('analysis.close') || "Close"}
                                </button>
                            </div>
                        </div>
                    </div>
                )
            }

            <ConfirmModal
                isOpen={!!deleteConfirm}
                onClose={() => setDeleteConfirm(null)}
                onConfirm={executeDelete}
                title={t('analysis.deleteLogTitle') || "Delete Analysis Log"}
                message={deleteConfirm ? `${t('analysis.deleteLogConfirm') || "Are you sure you want to delete the log for Job ID:"} ${deleteConfirm.jobId}?` : ""}
                confirmText={t('common.delete') || "Delete"}
                variant="danger"
            />

        </div >
    );
};

export default AnalysisHistoryList;
