import React from 'react';
import Editor from '@monaco-editor/react';
import { AnalysisRule } from '../../api/analysisRules';
import { X, Save, Edit3, Eye } from 'lucide-react';
import { useTranslation } from 'react-i18next';
import Markdown from 'react-markdown';
import remarkGfm from 'remark-gfm';

interface RuleEditorProps {
    rule: Partial<AnalysisRule>;
    onSave: (rule: Partial<AnalysisRule>) => void;
    onCancel: () => void;
}

export const RuleEditor: React.FC<RuleEditorProps> = ({ rule: initialRule, onSave, onCancel }) => {
    const [rule, setRule] = React.useState<Partial<AnalysisRule>>(initialRule);
    const { t } = useTranslation();
    const [editorTab, setEditorTab] = React.useState<'edit' | 'preview'>('edit');

    // Dark 모드 감지
    const [isDark, setIsDark] = React.useState(
        document.documentElement.classList.contains('dark')
    );

    React.useEffect(() => {
        // MutationObserver로 dark 클래스 변경 감지
        const observer = new MutationObserver(() => {
            setIsDark(document.documentElement.classList.contains('dark'));
        });

        observer.observe(document.documentElement, {
            attributes: true,
            attributeFilter: ['class']
        });

        return () => observer.disconnect();
    }, []);

    const handleChange = (field: keyof AnalysisRule, value: any) => {
        setRule(prev => ({ ...prev, [field]: value }));
    };

    const handleSave = () => {
        if (!rule.name || !rule.content) {
            alert(t('rules.validationError', 'Name and Content are required.'));
            return;
        }
        onSave(rule);
    };

    return (
        <div className="fixed inset-0 z-50 flex items-center justify-center bg-black/50 p-4">
            <div className="bg-white dark:bg-gray-800 w-full max-w-4xl max-h-[90vh] rounded-lg shadow-xl flex flex-col">
                {/* Header */}
                <div className="flex items-center justify-between p-4 border-b border-gray-200 dark:border-gray-700">
                    <h2 className="text-xl font-semibold text-gray-900 dark:text-gray-100">
                        {initialRule.id ? t('rules.editor.title') : t('rules.newRule')}
                    </h2>
                    <button onClick={onCancel} className="text-gray-500 hover:text-gray-700 dark:hover:text-gray-300">
                        <X size={24} />
                    </button>
                </div>

                {/* Body */}
                <div className="flex-1 overflow-auto p-6 space-y-4">
                    {/* 상단 고정 필드들 */}
                    <div className="flex-shrink-0 space-y-4">
                        <div>
                            <label className="block text-sm font-medium text-gray-700 dark:text-gray-300 mb-1">
                                {t('rules.editor.name')}
                            </label>
                            <input
                                type="text"
                                value={rule.name || ''}
                                onChange={(e) => handleChange('name', e.target.value)}
                                className="w-full px-3 py-2 border border-gray-300 dark:border-gray-600 rounded-md bg-white dark:bg-gray-700 text-gray-900 dark:text-gray-100 focus:ring-2 focus:ring-blue-500"
                                placeholder={t('rules.editor.namePlaceholder')}
                            />
                        </div>

                        <div>
                            <label className="block text-sm font-medium text-gray-700 dark:text-gray-300 mb-1">
                                {t('rules.editor.description')}
                            </label>
                            <input
                                type="text"
                                value={rule.description || ''}
                                onChange={(e) => handleChange('description', e.target.value)}
                                className="w-full px-3 py-2 border border-gray-300 dark:border-gray-600 rounded-md bg-white dark:bg-gray-700 text-gray-900 dark:text-gray-100 focus:ring-2 focus:ring-blue-500"
                                placeholder={t('rules.editor.descriptionPlaceholder')}
                            />
                        </div>

                        <div className="flex items-center gap-2">
                            <label className="flex items-center gap-2 cursor-pointer">
                                <input
                                    type="checkbox"
                                    checked={rule.useYn ?? true}
                                    onChange={(e) => handleChange('useYn', e.target.checked)}
                                    className="rounded border-gray-300 dark:border-gray-600 text-blue-600 focus:ring-blue-500"
                                />
                                <span className="text-sm font-medium text-gray-700 dark:text-gray-300">
                                    {t('rules.editor.useYn')}
                                </span>
                            </label>
                        </div>
                    </div>

                    {/* Monaco Editor with Preview Tab */}
                    <div className="flex-shrink-0">
                        <div className="flex items-center justify-between mb-2">
                            <label className="block text-sm font-medium text-gray-700 dark:text-gray-300">
                                {t('rules.editor.content')}
                            </label>
                            {/* Tab Buttons */}
                            <div className="flex gap-1 bg-gray-100 dark:bg-gray-800 rounded-lg p-1">
                                <button
                                    type="button"
                                    onClick={() => setEditorTab('edit')}
                                    className={`flex items-center gap-1.5 px-3 py-1.5 text-xs font-medium rounded-md transition-colors ${editorTab === 'edit'
                                        ? 'bg-white dark:bg-gray-700 text-blue-600 dark:text-blue-400 shadow-sm'
                                        : 'text-gray-600 dark:text-gray-400 hover:text-gray-900 dark:hover:text-gray-200'
                                        }`}
                                >
                                    <Edit3 className="w-3.5 h-3.5" />
                                    {t('common.edit', 'Edit')}
                                </button>
                                <button
                                    type="button"
                                    onClick={() => setEditorTab('preview')}
                                    className={`flex items-center gap-1.5 px-3 py-1.5 text-xs font-medium rounded-md transition-colors ${editorTab === 'preview'
                                        ? 'bg-white dark:bg-gray-700 text-blue-600 dark:text-blue-400 shadow-sm'
                                        : 'text-gray-600 dark:text-gray-400 hover:text-gray-900 dark:hover:text-gray-200'
                                        }`}
                                >
                                    <Eye className="w-3.5 h-3.5" />
                                    {t('common.preview', 'Preview')}
                                </button>
                            </div>
                        </div>
                        <div className="border border-gray-300 dark:border-gray-600 rounded-md overflow-hidden">
                            {editorTab === 'edit' ? (
                                <Editor
                                    height="430px"
                                    defaultLanguage="markdown"
                                    value={rule.content || ''}
                                    onChange={(value) => handleChange('content', value || '')}
                                    theme={isDark ? 'vs-dark' : 'light'}
                                    options={{
                                        fontFamily: 'Pretendard, Consolas, Monaco, "Courier New", monospace',
                                        fontSize: 15,
                                        lineHeight: 1.8,
                                        minimap: { enabled: false },
                                        scrollBeyondLastLine: false,
                                        wordWrap: 'on',
                                        lineNumbers: 'on',
                                        renderLineHighlight: 'all',
                                        scrollbar: {
                                            vertical: 'visible',
                                            horizontal: 'visible',
                                            verticalScrollbarSize: 12,
                                            horizontalScrollbarSize: 12,
                                        },
                                        automaticLayout: true,
                                        padding: { top: 12, bottom: 12 },
                                        cursorBlinking: 'smooth',
                                        cursorSmoothCaretAnimation: 'on',
                                        smoothScrolling: true,
                                        bracketPairColorization: { enabled: true },
                                    }}
                                />
                            ) : (
                                <div className="h-[430px] overflow-auto bg-white dark:bg-gray-900 p-6">
                                    {rule.content ? (
                                        <div className="markdown-content prose prose-sm dark:prose-invert max-w-none">
                                            <Markdown remarkPlugins={[remarkGfm]}>{rule.content}</Markdown>
                                        </div>
                                    ) : (
                                        <div className="flex items-center justify-center h-full">
                                            <p className="text-gray-400 dark:text-gray-500 italic text-sm">
                                                {t('common.noContent', 'No content to preview')}
                                            </p>
                                        </div>
                                    )}
                                </div>
                            )}
                        </div>
                    </div>

                </div>

                {/* Footer */}
                <div className="flex items-center justify-end gap-3 p-4 border-t border-gray-200 dark:border-gray-700 bg-gray-50 dark:bg-gray-800/50 rounded-b-lg">
                    <button
                        onClick={onCancel}
                        className="px-4 py-2 text-sm font-medium text-gray-700 bg-white border border-gray-300 rounded-md hover:bg-gray-50 dark:bg-gray-700 dark:text-gray-300 dark:border-gray-600 dark:hover:bg-gray-600"
                    >
                        {t('rules.editor.cancel')}
                    </button>
                    <button
                        onClick={handleSave}
                        className="flex items-center gap-2 px-4 py-2 text-sm font-medium text-white bg-blue-600 rounded-md hover:bg-blue-700 focus:ring-2 focus:ring-blue-500 focus:ring-offset-2"
                    >
                        <Save size={16} />
                        {t('rules.editor.save')}
                    </button>
                </div>
            </div>
        </div>
    );
};
