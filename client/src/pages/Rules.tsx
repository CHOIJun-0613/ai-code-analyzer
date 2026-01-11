import React, { useEffect, useState } from 'react';
import { useTranslation } from 'react-i18next';
import { Plus, RefreshCw } from 'lucide-react';
import { toast } from 'react-hot-toast';

import { analysisRuleApi, AnalysisRule } from '../api/analysisRules';
import { RuleList } from '../components/Rules/RuleList';
import { RuleEditor } from '../components/Rules/RuleEditor';

const Rules: React.FC = () => {
    const { t } = useTranslation();
    const [rules, setRules] = useState<AnalysisRule[]>([]);
    const [loading, setLoading] = useState(false);
    const [editingRule, setEditingRule] = useState<Partial<AnalysisRule> | null>(null);

    const loadRules = async () => {
        setLoading(true);
        try {
            const data = await analysisRuleApi.getAll(false);
            setRules(data);
        } catch (error) {
            console.error('Failed to load rules:', error);
            toast.error(t('rules.loadError', 'Failed to load rules'));
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

    const handleDelete = async (id: number) => {
        if (!window.confirm(t('rules.deleteConfirm', 'Are you sure you want to delete this rule?'))) return;

        try {
            await analysisRuleApi.delete(id);
            toast.success(t('rules.deleteSuccess', 'Rule deleted successfully'));
            loadRules(); // Reload to refresh list
        } catch (error) {
            console.error('Failed to delete rule:', error);
            toast.error(t('rules.deleteError', 'Failed to delete rule'));
        }
    };

    const handleToggleUse = async (rule: AnalysisRule) => {
        try {
            await analysisRuleApi.update(rule.id, { useYn: !rule.useYn });
            setRules(prev => prev.map(r => r.id === rule.id ? { ...r, useYn: !rule.useYn } : r));
            toast.success(t('rules.updateSuccess', 'Rule updated successfully'));
        } catch (error) {
            console.error('Failed to update rule:', error);
            toast.error(t('rules.updateError', 'Failed to update rule'));
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
            toast.error(t('rules.reorderError', 'Failed to reorder rules'));
            loadRules(); // Revert on error
        }
    };

    const handleSaveRule = async (ruleData: Partial<AnalysisRule>) => {
        try {
            if (ruleData.id) {
                // Update
                await analysisRuleApi.update(ruleData.id, ruleData);
                toast.success(t('rules.saveSuccess', 'Rule saved successfully'));
            } else {
                // Create
                await analysisRuleApi.create(ruleData);
                toast.success(t('rules.createSuccess', 'Rule created successfully'));
            }
            setEditingRule(null);
            loadRules();
        } catch (error) {
            console.error('Failed to save rule:', error);
            toast.error(t('rules.saveError', 'Failed to save rule'));
        }
    };

    return (
        <div className="flex flex-col h-full bg-gray-50 dark:bg-gray-900">
            {/* Header */}
            <div className="flex items-center justify-between px-6 py-4 bg-white dark:bg-gray-800 border-b border-gray-200 dark:border-gray-700">
                <div>
                    <h1 className="text-xl font-semibold text-gray-900 dark:text-gray-100">
                        {t('rules.title', 'Analysis Rules')}
                    </h1>
                    <p className="text-sm text-gray-500 dark:text-gray-400 mt-1">
                        {t('rules.subtitle', 'Manage code analysis rules')}
                    </p>
                </div>
                <div className="flex items-center gap-3">
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
                        {t('rules.newRule', 'New Rule')}
                    </button>
                </div>
            </div>

            {/* List */}
            <div className="flex-1 overflow-auto p-6">
                <div className="max-w-5xl mx-auto">
                    {loading && rules.length === 0 ? (
                        <div className="flex justify-center items-center h-32">
                            <div className="animate-spin rounded-full h-8 w-8 border-b-2 border-blue-600"></div>
                        </div>
                    ) : (
                        <RuleList
                            rules={rules}
                            onReorder={handleReorder}
                            onEdit={handleEdit}
                            onDelete={handleDelete}
                            onToggleUse={handleToggleUse}
                        />
                    )}
                </div>
            </div>

            {/* Editor Modal */}
            {editingRule && (
                <RuleEditor
                    rule={editingRule}
                    onSave={handleSaveRule}
                    onCancel={() => setEditingRule(null)}
                />
            )}
        </div>
    );
};

export default Rules;
