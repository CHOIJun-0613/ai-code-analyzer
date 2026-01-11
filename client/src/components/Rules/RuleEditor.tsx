import React from 'react';
import Editor from '@monaco-editor/react';
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

                    {/* Monaco Editor - 남은 공간을 모두 차지하고 내부 스크롤 */}
                    <div className="flex-shrink-0">
                        <label className="block text-sm font-medium text-gray-700 dark:text-gray-300 mb-2">
                            {t('rules.editor.content')}
                        </label>
                        <div className="border border-gray-300 dark:border-gray-600 rounded-md overflow-hidden">
                            <Editor
                                height="460px"
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
