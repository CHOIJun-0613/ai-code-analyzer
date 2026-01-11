import React from 'react';
import MarkdownEditor from '@uiw/react-markdown-editor';
import { AnalysisRule } from '../../api/analysisRules';
import { X, Save } from 'lucide-react';
import { useTranslation } from 'react-i18next';

interface RuleEditorProps {
    rule: Partial<AnalysisRule>;
    onSave: (rule: Partial<AnalysisRule>) => void;
    onCancel: () => void;
}

export const RuleEditor: React.FC<RuleEditorProps> = ({ rule: initialRule, onSave, onCancel }) => {
    const [rule, setRule] = React.useState<Partial<AnalysisRule>>(initialRule);
    const { t } = useTranslation();

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

                    <div className="flex-1 flex flex-col h-[500px]">
                        <label className="block text-sm font-medium text-gray-700 dark:text-gray-300 mb-1">
                            {t('rules.editor.content')}
                        </label>
                        <div className="rule-editor-wrapper flex-1 border border-gray-300 dark:border-gray-600 rounded-md overflow-hidden">
                            <style>{`
                                /* Font Family */
                                .rule-editor-wrapper .w-md-editor, 
                                .rule-editor-wrapper .w-md-editor .cm-line,
                                .rule-editor-wrapper .cm-content,
                                .rule-editor-wrapper .cm-scroller {
                                    font-family: Pretendard, -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto, "Helvetica Neue", Arial, sans-serif, "Apple Color Emoji", "Segoe UI Emoji", "Segoe UI Symbol" !important;
                                }

                                /* Scroll Fix - Force height propagation and overflow */
                                .rule-editor-wrapper,
                                .rule-editor-wrapper .w-md-editor,
                                .rule-editor-wrapper .w-md-editor-content,
                                .rule-editor-wrapper .cm-editor,
                                .rule-editor-wrapper .cm-scroller {
                                    height: 100% !important;
                                }
                                .rule-editor-wrapper .cm-scroller {
                                    overflow-y: auto !important;
                                    overflow-x: hidden !important;
                                }

                                /* Dark Mode Text Colors - Use .dark ancestor selector */
                                .dark .rule-editor-wrapper .w-md-editor {
                                    background-color: #1f2937 !important;
                                    color: #ffffff !important;
                                }
                                /* Force all text to white in dark mode */
                                .dark .rule-editor-wrapper .w-md-editor * {
                                    color: #ffffff !important;
                                }
                                
                                /* Header Colors - Green (override the white forced above) */
                                .dark .rule-editor-wrapper .cm-line span[class*="header"],
                                .dark .rule-editor-wrapper .cm-line span[class*="heading"],
                                .dark .rule-editor-wrapper .tok-heading {
                                    color: #4ade80 !important; /* Green */
                                    font-weight: bold !important;
                                    text-decoration: none !important;
                                }
                            `}</style>
                            <MarkdownEditor
                                value={rule.content || ''}
                                height="100%"
                                onChange={(value) => handleChange('content', value)}
                                enableScroll={true}
                            />
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
