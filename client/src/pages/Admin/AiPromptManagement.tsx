import React, { useState, useEffect } from 'react';
import { useTranslation } from 'react-i18next';
import { getAiPrompts, updateAiPrompt, AiPrompt } from '../../api/aiPrompts';
import { Edit2, Save, X, Bot, FileText, AlertCircle, Edit3, Eye } from 'lucide-react';
import PromptEditor from '../../components/PromptEditor';
import Markdown from 'react-markdown';
import remarkGfm from 'remark-gfm';

const AiPromptManagement: React.FC = () => {
    const { t } = useTranslation();
    const [prompts, setPrompts] = useState<AiPrompt[]>([]);
    const [loading, setLoading] = useState(true);
    const [error, setError] = useState<string | null>(null);
    const [editingPrompt, setEditingPrompt] = useState<AiPrompt | null>(null);
    const [editContent, setEditContent] = useState('');
    const [editDescription, setEditDescription] = useState('');
    const [saving, setSaving] = useState(false);
    const [editorTab, setEditorTab] = useState<'edit' | 'preview'>('edit');

    useEffect(() => {
        fetchPrompts();
    }, []);

    const fetchPrompts = async () => {
        try {
            setLoading(true);
            const data = await getAiPrompts();
            setPrompts(data);
        } catch (err) {
            setError(t('common.errorLoadingData'));
        } finally {
            setLoading(false);
        }
    };

    const handleEdit = (prompt: AiPrompt) => {
        setEditingPrompt(prompt);
        setEditContent(prompt.content);
        setEditDescription(prompt.description || '');
    };

    const handleCancel = () => {
        setEditingPrompt(null);
        setEditContent('');
        setEditDescription('');
        setError(null);
    };

    const handleSave = async () => {
        if (!editingPrompt) return;

        try {
            setSaving(true);
            await updateAiPrompt(editingPrompt.name, editContent, editDescription);

            // Refresh list or update local state
            const updatedList = prompts.map(p =>
                p.name === editingPrompt.name
                    ? {
                        ...p,
                        content: editContent,
                        description: editDescription,
                        updated_at: new Date().toISOString(),
                        updated_by: 'admin'
                    }
                    : p
            );
            setPrompts(updatedList);
            setEditingPrompt(null);
            setEditContent('');
            setEditDescription('');
        } catch (err: any) {
            setError(err.response?.data?.detail || t('common.errorSavingData'));
        } finally {
            setSaving(false);
        }
    };

    if (loading) return <div className="p-8 text-center text-slate-500 dark:text-slate-400">Loading...</div>;

    return (
        <div className="space-y-6">
            <div className="flex items-center gap-3">
                <div className="p-3 bg-indigo-50 dark:bg-indigo-500/10 rounded-xl">
                    <Bot className="w-8 h-8 text-indigo-600 dark:text-indigo-400" />
                </div>
                <div>
                    <h1 className="text-3xl font-bold text-slate-900 dark:text-white">{t('aiPrompt.title')}</h1>
                    <p className="text-slate-500 dark:text-slate-400 mt-1">{t('aiPrompt.subtitle')}</p>
                </div>
            </div>

            {error && (
                <div className="bg-red-50 dark:bg-red-900/20 text-red-700 dark:text-red-400 p-4 rounded-lg flex items-center gap-2">
                    <AlertCircle className="w-5 h-5" />
                    {error}
                </div>
            )}

            {/* List View */}
            {!editingPrompt && (
                <div className="bg-white dark:bg-slate-900 rounded-xl shadow-sm border border-slate-200 dark:border-slate-800 overflow-hidden">
                    <table className="w-full text-left border-collapse">
                        <thead>
                            <tr className="bg-slate-50 dark:bg-slate-950 border-b border-slate-200 dark:border-slate-800">
                                <th className="p-4 font-semibold text-slate-700 dark:text-slate-300">{t('aiPrompt.table.name')}</th>
                                <th className="p-4 font-semibold text-slate-700 dark:text-slate-300">{t('aiPrompt.table.description')}</th>
                                <th className="p-4 font-semibold text-slate-700 dark:text-slate-300">{t('aiPrompt.table.lastUpdated')}</th>
                                <th className="p-4 font-semibold text-slate-700 dark:text-slate-300 text-right">{t('aiPrompt.table.actions')}</th>
                            </tr>
                        </thead>
                        <tbody>
                            {prompts.map((prompt) => (
                                <tr key={prompt.name} className="border-b border-slate-100 dark:border-slate-800 hover:bg-slate-50 dark:hover:bg-slate-800/50 transition-colors">
                                    <td
                                        className="p-4 font-medium text-slate-900 dark:text-white flex items-center gap-2 cursor-pointer hover:text-indigo-600 dark:hover:text-indigo-400 transition-colors"
                                        onClick={() => handleEdit(prompt)}
                                    >
                                        <FileText className="w-4 h-4 text-slate-400 dark:text-slate-500" />
                                        {prompt.name}
                                    </td>
                                    <td className="p-4 text-slate-600 dark:text-slate-400">{prompt.description || '-'}</td>
                                    <td className="p-4 text-sm text-slate-500 dark:text-slate-500">
                                        {prompt.updated_at ? new Date(prompt.updated_at).toLocaleString() : '-'}
                                        {prompt.updated_by && <span className="text-xs ml-2 text-slate-400 dark:text-slate-600">by {prompt.updated_by}</span>}
                                    </td>
                                    <td className="p-4 text-right">
                                        <button
                                            onClick={() => handleEdit(prompt)}
                                            className="text-indigo-600 dark:text-indigo-400 hover:text-indigo-800 dark:hover:text-indigo-300 p-2 hover:bg-indigo-50 dark:hover:bg-indigo-900/30 rounded-lg transition-colors"
                                            title="Edit Prompt"
                                        >
                                            <Edit2 className="w-4 h-4" />
                                        </button>
                                    </td>
                                </tr>
                            ))}
                        </tbody>
                    </table>
                </div>
            )}

            {/* Editor View */}
            {editingPrompt && (
                <div className="bg-white dark:bg-slate-900 rounded-xl shadow-lg border border-indigo-100 dark:border-slate-800 overflow-hidden flex flex-col h-[calc(100vh-200px)]">
                    {/* Editor Header */}
                    <div className="p-4 border-b border-slate-200 dark:border-slate-800 bg-slate-50 dark:bg-slate-950 flex flex-col gap-4">
                        <div className="flex items-center justify-between">
                            <div className="flex items-center gap-3">
                                <button onClick={handleCancel} className="text-slate-400 hover:text-slate-600 dark:hover:text-slate-300">
                                    <X className="w-5 h-5" />
                                </button>
                                <h2 className="font-bold text-slate-800 dark:text-slate-200 flex items-center gap-2">
                                    {t('aiPrompt.editor.editing')}: <span className="text-indigo-600 dark:text-indigo-400 font-mono">{editingPrompt.name}</span>
                                </h2>
                            </div>
                            <div className="flex items-center gap-3">
                                <span className="text-xs text-orange-600 dark:text-orange-400 bg-orange-50 dark:bg-orange-900/20 px-3 py-1 rounded-full border border-orange-100 dark:border-orange-900/30 flex items-center gap-1">
                                    <AlertCircle className="w-3 h-3" />
                                    {t('aiPrompt.editor.warning', { '0': '{}' })}
                                </span>
                                <button
                                    onClick={handleSave}
                                    disabled={saving}
                                    className="flex items-center gap-2 px-4 py-2 bg-indigo-600 text-white rounded-lg hover:bg-indigo-700 disabled:opacity-50 transition-colors shadow-sm font-medium"
                                >
                                    {saving ? t('aiPrompt.editor.saving') : (
                                        <>
                                            <Save className="w-4 h-4" /> {t('aiPrompt.editor.save')}
                                        </>
                                    )}
                                </button>
                            </div>
                        </div>

                        {/* Description Editor Field */}
                        <div className="flex items-center gap-2 w-full">
                            <label className="text-sm font-medium text-slate-600 dark:text-slate-400 shrink-0">{t('aiPrompt.editor.description')}:</label>
                            <input
                                type="text"
                                className="flex-1 bg-white dark:bg-slate-900 border border-slate-300 dark:border-slate-700 rounded-lg px-3 py-1.5 text-sm text-slate-800 dark:text-slate-200 focus:outline-none focus:border-indigo-500 focus:ring-1 focus:ring-indigo-500 transition-all placeholder:text-slate-400"
                                placeholder={t('aiPrompt.editor.descriptionPlaceholder')}
                                value={editDescription}
                                onChange={(e) => setEditDescription(e.target.value)}
                            />
                        </div>
                    </div>

                    <div className="flex-1 p-0 relative h-full overflow-hidden bg-white dark:bg-slate-900 flex flex-col">
                        {/* Tab Buttons */}
                        <div className="flex justify-end gap-1 bg-slate-50 dark:bg-slate-950 border-b border-slate-200 dark:border-slate-800 px-4 py-2">
                            <div className="flex gap-1 bg-slate-100 dark:bg-slate-800 rounded-lg p-1">
                                <button
                                    type="button"
                                    onClick={() => setEditorTab('edit')}
                                    className={`flex items-center gap-1.5 px-3 py-1.5 text-xs font-medium rounded-md transition-colors ${
                                        editorTab === 'edit'
                                            ? 'bg-white dark:bg-slate-700 text-indigo-600 dark:text-indigo-400 shadow-sm'
                                            : 'text-slate-600 dark:text-slate-400 hover:text-slate-900 dark:hover:text-slate-200'
                                    }`}
                                >
                                    <Edit3 className="w-3.5 h-3.5" />
                                    {t('common.edit', 'Edit')}
                                </button>
                                <button
                                    type="button"
                                    onClick={() => setEditorTab('preview')}
                                    className={`flex items-center gap-1.5 px-3 py-1.5 text-xs font-medium rounded-md transition-colors ${
                                        editorTab === 'preview'
                                            ? 'bg-white dark:bg-slate-700 text-indigo-600 dark:text-indigo-400 shadow-sm'
                                            : 'text-slate-600 dark:text-slate-400 hover:text-slate-900 dark:hover:text-slate-200'
                                    }`}
                                >
                                    <Eye className="w-3.5 h-3.5" />
                                    {t('common.preview', 'Preview')}
                                </button>
                            </div>
                        </div>

                        {/* Editor/Preview Content */}
                        <div className="flex-1 relative overflow-hidden">
                            {editorTab === 'edit' ? (
                                <div className="absolute inset-0">
                                    <PromptEditor
                                        value={editContent}
                                        onChange={setEditContent}
                                    />
                                </div>
                            ) : (
                                <div className="absolute inset-0 overflow-auto bg-white dark:bg-slate-900 p-8">
                                    {editContent ? (
                                        <div className="markdown-content prose prose-sm dark:prose-invert max-w-none">
                                            <Markdown remarkPlugins={[remarkGfm]}>{editContent}</Markdown>
                                        </div>
                                    ) : (
                                        <div className="flex items-center justify-center h-full">
                                            <p className="text-slate-400 dark:text-slate-500 italic text-sm">
                                                {t('common.noContent', 'No content to preview')}
                                            </p>
                                        </div>
                                    )}
                                </div>
                            )}
                        </div>
                    </div>
                </div>
            )}
        </div>
    );
};

export default AiPromptManagement;
