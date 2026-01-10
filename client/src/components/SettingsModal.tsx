import React from 'react';
import { useTranslation } from 'react-i18next';
import { X, Moon, Sun, Check, Globe } from 'lucide-react';

export type Theme = 'normal' | 'dark-modern';

interface SettingsModalProps {
    isOpen: boolean;
    onClose: () => void;
    currentTheme: Theme;
    onThemeChange: (theme: Theme) => void;
}

const SettingsModal: React.FC<SettingsModalProps> = ({ isOpen, onClose, currentTheme, onThemeChange }) => {
    const { t, i18n } = useTranslation();

    const changeLanguage = (lng: string) => {
        i18n.changeLanguage(lng);
    };

    if (!isOpen) return null;

    return (
        <div className="fixed inset-0 z-50 flex items-center justify-center bg-black/70 backdrop-blur-sm p-4 animate-in fade-in duration-200">
            <div className="bg-white dark:bg-slate-800 rounded-2xl shadow-2xl w-full max-w-lg overflow-hidden animate-in zoom-in-95 duration-200 border border-transparent dark:border-slate-700">
                {/* Header */}
                <div className="flex items-center justify-between p-4 border-b border-gray-100 dark:border-slate-700">
                    <h2 className="text-lg font-bold text-gray-900 dark:text-white">{t('settings.title')}</h2>
                    <button
                        onClick={onClose}
                        className="p-2 text-gray-400 hover:text-gray-600 dark:hover:text-gray-300 hover:bg-gray-100 dark:hover:bg-slate-800 rounded-lg transition-colors"
                    >
                        <X className="w-5 h-5" />
                    </button>
                </div>

                {/* Content */}
                <div className="p-6 space-y-8">
                    {/* Appearance Section */}
                    <div>
                        <h3 className="text-sm font-semibold text-gray-500 dark:text-slate-400 uppercase tracking-wider mb-4">{t('settings.appearance')}</h3>

                        <div className="space-y-4">
                            <div className="grid grid-cols-2 gap-4">
                                {/* Normal Theme Option */}
                                <button
                                    onClick={() => onThemeChange('normal')}
                                    className={`relative p-4 rounded-xl border-2 text-left transition-all ${currentTheme === 'normal'
                                        ? 'border-indigo-600 bg-indigo-50/50 ring-1 ring-indigo-600'
                                        : 'border-gray-200 dark:border-slate-700 hover:border-indigo-200 dark:hover:border-indigo-500 hover:bg-gray-50 dark:hover:bg-slate-800'
                                        }`}
                                >
                                    <div className="flex items-center justify-between mb-2">
                                        <div className="p-2 bg-white rounded-lg shadow-sm">
                                            <Sun className="w-5 h-5 text-indigo-600" />
                                        </div>
                                        {currentTheme === 'normal' && (
                                            <div className="bg-indigo-600 rounded-full p-0.5">
                                                <Check className="w-3 h-3 text-white" />
                                            </div>
                                        )}
                                    </div>
                                    <div className="font-semibold text-gray-900 dark:text-slate-200">{t('settings.normal')}</div>
                                    <div className="text-xs text-gray-500 dark:text-slate-400 mt-1">{t('settings.normalDesc')}</div>
                                </button>

                                {/* Dark Modern Theme Option */}
                                <button
                                    onClick={() => onThemeChange('dark-modern')}
                                    className={`relative p-4 rounded-xl border-2 text-left transition-all ${currentTheme === 'dark-modern'
                                        ? 'border-indigo-600 bg-indigo-900/10 ring-1 ring-indigo-600'
                                        : 'border-gray-200 dark:border-slate-700 hover:border-indigo-200 dark:hover:border-indigo-500 hover:bg-gray-50 dark:hover:bg-slate-800'
                                        }`}
                                >
                                    <div className="flex items-center justify-between mb-2">
                                        <div className="p-2 bg-slate-900 border border-slate-700 rounded-lg shadow-sm">
                                            <Moon className="w-5 h-5 text-indigo-400" />
                                        </div>
                                        {currentTheme === 'dark-modern' && (
                                            <div className="bg-indigo-600 rounded-full p-0.5">
                                                <Check className="w-3 h-3 text-white" />
                                            </div>
                                        )}
                                    </div>
                                    <div className="font-semibold text-gray-900 dark:text-slate-200">{t('settings.darkModern')}</div>
                                    <div className="text-xs text-gray-500 dark:text-slate-400 mt-1">{t('settings.darkModernDesc')}</div>
                                </button>
                            </div>
                        </div>
                    </div>

                    {/* Language Section */}
                    <div>
                        <h3 className="text-sm font-semibold text-gray-500 dark:text-slate-400 uppercase tracking-wider mb-4">{t('settings.language')}</h3>
                        <div className="grid grid-cols-2 gap-4">
                            {/* Korean Option */}
                            <button
                                onClick={() => changeLanguage('ko')}
                                className={`relative p-4 rounded-xl border-2 text-left transition-all ${i18n.language === 'ko'
                                    ? 'border-indigo-600 bg-indigo-50/50 ring-1 ring-indigo-600'
                                    : 'border-gray-200 dark:border-slate-700 hover:border-indigo-200 dark:hover:border-indigo-500 hover:bg-gray-50 dark:hover:bg-slate-800'
                                    }`}
                            >
                                <div className="flex items-center justify-between mb-2">
                                    <div className="p-2 bg-white rounded-lg shadow-sm">
                                        <Globe className="w-5 h-5 text-indigo-600" />
                                    </div>
                                    {i18n.language === 'ko' && (
                                        <div className="bg-indigo-600 rounded-full p-0.5">
                                            <Check className="w-3 h-3 text-white" />
                                        </div>
                                    )}
                                </div>
                                <div className="font-semibold text-gray-900 dark:text-slate-200">한국어</div>
                                <div className="text-xs text-gray-500 dark:text-slate-400 mt-1">Korean</div>
                            </button>

                            {/* English Option */}
                            <button
                                onClick={() => changeLanguage('en')}
                                className={`relative p-4 rounded-xl border-2 text-left transition-all ${i18n.language === 'en'
                                    ? 'border-indigo-600 bg-indigo-50/50 ring-1 ring-indigo-600'
                                    : 'border-gray-200 dark:border-slate-700 hover:border-indigo-200 dark:hover:border-indigo-500 hover:bg-gray-50 dark:hover:bg-slate-800'
                                    }`}
                            >
                                <div className="flex items-center justify-between mb-2">
                                    <div className="p-2 bg-white rounded-lg shadow-sm">
                                        <Globe className="w-5 h-5 text-indigo-600" />
                                    </div>
                                    {i18n.language === 'en' && (
                                        <div className="bg-indigo-600 rounded-full p-0.5">
                                            <Check className="w-3 h-3 text-white" />
                                        </div>
                                    )}
                                </div>
                                <div className="font-semibold text-gray-900 dark:text-slate-200">English</div>
                                <div className="text-xs text-gray-500 dark:text-slate-400 mt-1">English</div>
                            </button>
                        </div>
                    </div>
                </div>

                {/* Footer */}
                <div className="p-4 bg-gray-50 dark:bg-slate-900/50 border-t border-gray-100 dark:border-slate-700 flex justify-end">
                    <button
                        onClick={onClose}
                        className="px-4 py-2 bg-white border border-gray-200 text-gray-600 font-medium rounded-lg hover:bg-gray-50 transition-colors"
                    >
                        {t('common.done')}
                    </button>
                </div>
            </div>
        </div>
    );
};

export default SettingsModal;
