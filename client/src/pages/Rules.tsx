import React, { useEffect, useState } from 'react';
import { useTranslation } from 'react-i18next';
import { Plus, RefreshCw, BookOpen, Trash2, Download, Upload } from 'lucide-react';
import { toast } from 'react-hot-toast';

import { analysisRuleApi, AnalysisRule } from '../api/analysisRules';
import { RuleList } from '../components/Rules/RuleList';
import { RuleEditor } from '../components/Rules/RuleEditor';

const Rules: React.FC = () => {
    const { t } = useTranslation();
    const [rules, setRules] = useState<AnalysisRule[]>([]);
    const [loading, setLoading] = useState(false);
    const [editingRule, setEditingRule] = useState<Partial<AnalysisRule> | null>(null);
    const [showDeleteConfirmModal, setShowDeleteConfirmModal] = useState(false);
    const [ruleToDelete, setRuleToDelete] = useState<number | null>(null);
    const fileInputRef = React.useRef<HTMLInputElement>(null);

    const loadRules = async () => {
        setLoading(true);
        try {
            const data = await analysisRuleApi.getAll(false);
            setRules(data);
        } catch (error) {
            console.error('Failed to load rules:', error);
            toast.error(t('rules.messages.loadFailed', 'Failed to load rules'));
        } finally {
            setLoading(false);
        }
    };

    useEffect(() => {
        loadRules();
    }, []);

    const handleCreate = () => {
        setEditingRule({
            name: '',
            description: '',
            content: '',
            useYn: true,
            order: rules.length,
            isSystem: false
        });
    };

    const handleEdit = (rule: AnalysisRule) => {
        setEditingRule({ ...rule });
    };

    const handleDelete = (id: number) => {
        setRuleToDelete(id);
        setShowDeleteConfirmModal(true);
    };

    const executeDelete = async () => {
        if (!ruleToDelete) return;

        try {
            await analysisRuleApi.delete(ruleToDelete);
            toast.success(t('rules.messages.deleteSuccess', 'Rule deleted successfully'));
            loadRules(); // Reload to refresh list
        } catch (error) {
            console.error('Failed to delete rule:', error);
            toast.error(t('rules.messages.deleteFailed', 'Failed to delete rule'));
        } finally {
            setShowDeleteConfirmModal(false);
            setRuleToDelete(null);
        }
    };

    const handleToggleUse = async (rule: AnalysisRule) => {
        try {
            await analysisRuleApi.update(rule.id, { useYn: !rule.useYn });
            setRules(prev => prev.map(r => r.id === rule.id ? { ...r, useYn: !rule.useYn } : r));
            toast.success(t('rules.messages.saveSuccess', 'Rule updated successfully'));
        } catch (error) {
            console.error('Failed to update rule:', error);
            toast.error(t('rules.messages.saveFailed', 'Failed to update rule'));
        }
    };

    const handleReorder = async (newRules: AnalysisRule[]) => {
        setRules(newRules); // Optimistic update
        try {
            const orderMap = newRules.map((r, index) => ({ id: r.id, order: index }));
            await analysisRuleApi.reorder(orderMap);
            // No toast needed for drag/drop unless error, to keep it smooth
        } catch (error) {
            console.error('Failed to reorder rules:', error);
            toast.error(t('rules.messages.saveFailed', 'Failed to reorder rules'));
            loadRules(); // Revert on error
        }
    };

    const handleSaveRule = async (ruleData: Partial<AnalysisRule>) => {
        try {
            if (ruleData.id) {
                // Update
                await analysisRuleApi.update(ruleData.id, ruleData);
                toast.success(t('rules.messages.saveSuccess', 'Rule saved successfully'));
            } else {
                // Create
                await analysisRuleApi.create(ruleData);
                toast.success(t('rules.messages.saveSuccess', 'Rule created successfully'));
            }
            setEditingRule(null);
            loadRules();
        } catch (error) {
            console.error('Failed to save rule:', error);
            toast.error(t('rules.messages.saveFailed', 'Failed to save rule'));
        }
    };

    const handleExport = async () => {
        try {
            const allRules = await analysisRuleApi.getAll(false);
            const jsonString = JSON.stringify(allRules, null, 2);

            const now = new Date();
            const year = now.getFullYear();
            const month = String(now.getMonth() + 1).padStart(2, '0');
            const day = String(now.getDate()).padStart(2, '0');
            const hours = String(now.getHours()).padStart(2, '0');
            const minutes = String(now.getMinutes()).padStart(2, '0');
            const seconds = String(now.getSeconds()).padStart(2, '0');
            const timestamp = `${year}${month}${day}-${hours}${minutes}${seconds}`;
            const fileName = `analysis_rule_export_data-${timestamp}.json`;

            // Use File System Access API if available
            if ('showSaveFilePicker' in window) {
                try {
                    const handle = await (window as any).showSaveFilePicker({
                        suggestedName: fileName,
                        types: [{
                            description: 'JSON Files',
                            accept: { 'application/json': ['.json'] },
                        }],
                    });
                    const writable = await handle.createWritable();
                    await writable.write(jsonString);
                    await writable.close();
                    toast.success(t('rules.messages.exportSuccess', 'Rules exported successfully'));
                } catch (err: any) {
                    if (err.name !== 'AbortError') {
                        console.error('Failed to save file:', err);
                        toast.error(t('rules.messages.exportFailed', 'Failed to export rules'));
                    }
                }
            } else {
                // Fallback for browsers not supporting File System Access API
                const blob = new Blob([jsonString], { type: 'application/json' });
                const url = URL.createObjectURL(blob);
                const a = document.createElement('a');
                a.href = url;
                a.download = fileName;
                document.body.appendChild(a);
                a.click();
                document.body.removeChild(a);
                URL.revokeObjectURL(url);
                toast.success(t('rules.messages.exportSuccess', 'Rules exported successfully'));
            }
        } catch (error) {
            console.error('Failed to export rules:', error);
            toast.error(t('rules.messages.exportFailed', 'Failed to export rules'));
        }
    };

    const handleImportClick = () => {
        fileInputRef.current?.click();
    };

    const handleFileChange = async (event: React.ChangeEvent<HTMLInputElement>) => {
        const file = event.target.files?.[0];
        if (!file) return;

        // Reset input so same file can be selected again if needed
        event.target.value = '';

        const reader = new FileReader();
        reader.onload = async (e) => {
            try {
                const content = e.target?.result as string;
                const importedRules = JSON.parse(content);

                if (!Array.isArray(importedRules)) {
                    throw new Error('Invalid format: Root must be an array');
                }

                setLoading(true);
                const result = await analysisRuleApi.importRules(importedRules);

                toast.success(
                    t('rules.messages.importSuccess',
                        `Imported: {{success}}, Deactivated: {{deactivated}}, Failed: {{failed}}`,
                        result
                    )
                );
                loadRules();
            } catch (error) {
                console.error('Failed to import rules:', error);
                toast.error(t('rules.messages.importFailed', 'Failed to import rules: Invalid format or server error'));
            } finally {
                setLoading(false);
            }
        };
        reader.readAsText(file);
    };

    return (
        <div className="flex flex-col h-full bg-gray-50 dark:bg-gray-900">
            {/* Header */}
            <div className="flex items-center justify-between px-6 py-4 bg-white dark:bg-gray-800 border-b border-gray-200 dark:border-gray-700">
                <div className="flex items-center gap-4">
                    <div className="p-2 bg-indigo-50 dark:bg-indigo-900/20 rounded-lg">
                        <BookOpen className="w-6 h-6 text-indigo-600 dark:text-indigo-400" />
                    </div>
                    <div>
                        <h1 className="text-xl font-semibold text-gray-900 dark:text-gray-100">
                            {t('rules.title')}
                        </h1>
                        <p className="text-sm text-gray-500 dark:text-gray-400 mt-1">
                            {t('rules.subtitle')}
                        </p>
                    </div>
                </div>
                <div className="flex items-center gap-3">
                    <input
                        type="file"
                        ref={fileInputRef}
                        onChange={handleFileChange}
                        className="hidden"
                        accept=".json"
                    />
                    <button
                        onClick={handleExport}
                        className="p-2 text-gray-500 hover:bg-gray-100 dark:hover:bg-gray-700 rounded-md transition-colors"
                        title={t('rules.export', 'Export Rules')}
                    >
                        <Download size={20} />
                    </button>
                    <button
                        onClick={handleImportClick}
                        className="p-2 text-gray-500 hover:bg-gray-100 dark:hover:bg-gray-700 rounded-md transition-colors"
                        title={t('rules.import', 'Import Rules')}
                    >
                        <Upload size={20} />
                    </button>
                    <div className="h-6 w-px bg-gray-200 dark:bg-gray-700 mx-1"></div>
                    <button
                        onClick={loadRules}
                        className="p-2 text-gray-500 hover:bg-gray-100 dark:hover:bg-gray-700 rounded-md transition-colors"
                        title={t('common.refresh', 'Refresh')}
                    >
                        <RefreshCw size={20} className={loading ? 'animate-spin' : ''} />
                    </button>
                    <button
                        onClick={handleCreate}
                        className="flex items-center gap-2 px-4 py-2 text-sm font-medium text-white bg-blue-600 rounded-md hover:bg-blue-700 focus:ring-2 focus:ring-blue-500 focus:ring-offset-2"
                    >
                        <Plus size={20} />
                        {t('rules.newRule')}
                    </button>
                </div>
            </div>

            {/* List */}
            <div className="flex-1 overflow-auto p-6">
                <div className="border border-gray-200 dark:border-gray-700 rounded-lg bg-white dark:bg-gray-800">
                    {loading && rules.length === 0 ? (
                        <div className="flex justify-center items-center h-32">
                            <div className="animate-spin rounded-full h-8 w-8 border-b-2 border-blue-600"></div>
                        </div>
                    ) : (
                        <div className="p-4">
                            <RuleList
                                rules={rules}
                                onReorder={handleReorder}
                                onEdit={handleEdit}
                                onDelete={handleDelete}
                                onToggleUse={handleToggleUse}
                            />
                        </div>
                    )}
                </div>
            </div>

            {/* Editor Modal */}
            {
                editingRule && (
                    <RuleEditor
                        rule={editingRule}
                        onSave={handleSaveRule}
                        onCancel={() => setEditingRule(null)}
                    />
                )
            }


            {/* Delete Confirmation Modal */}
            {
                showDeleteConfirmModal && (
                    <div className="fixed inset-0 z-50 flex items-center justify-center p-4 bg-slate-900/60 backdrop-blur-sm animate-in fade-in duration-200">
                        <div className="bg-white dark:bg-slate-900 rounded-2xl shadow-2xl w-full max-w-md overflow-hidden animate-in zoom-in-95 duration-200 border border-slate-100 dark:border-slate-800">
                            <div className="p-8">
                                <div className="flex flex-col items-center text-center">
                                    <div className="w-16 h-16 bg-red-50 dark:bg-red-900/20 rounded-full flex items-center justify-center mb-6 ring-8 ring-red-50/50 dark:ring-red-900/10">
                                        <Trash2 className="w-8 h-8 text-red-600 dark:text-red-400" />
                                    </div>

                                    <h3 className="text-xl font-bold text-slate-900 dark:text-white mb-3">
                                        {t('rules.messages.deleteConfirmTitle')}
                                    </h3>

                                    <p className="text-slate-500 dark:text-slate-400 whitespace-pre-wrap leading-relaxed mb-8">
                                        {t('rules.messages.deleteConfirmMessage')}
                                    </p>

                                    <div className="flex gap-3 w-full">
                                        <button
                                            type="button"
                                            className="flex-1 py-3 px-4 bg-white dark:bg-slate-800 border border-slate-200 dark:border-slate-700 text-slate-700 dark:text-slate-300 font-semibold rounded-xl hover:bg-slate-50 dark:hover:bg-slate-700 hover:border-slate-300 dark:hover:border-slate-600 transition-all active:scale-[0.98]"
                                            onClick={() => setShowDeleteConfirmModal(false)}
                                        >
                                            {t('common.cancel')}
                                        </button>
                                        <button
                                            type="button"
                                            className="flex-1 py-3 px-4 bg-red-600 text-white font-semibold rounded-xl shadow-lg shadow-red-200 dark:shadow-none hover:bg-red-700 hover:shadow-red-300 dark:hover:shadow-red-900/50 transition-all active:scale-[0.98]"
                                            onClick={executeDelete}
                                        >
                                            {t('common.delete')}
                                        </button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                )
            }
        </div >
    );
};

export default Rules;
