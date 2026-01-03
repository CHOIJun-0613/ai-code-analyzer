import React from 'react';
import { Link } from 'react-router-dom';
import { useTranslation } from 'react-i18next';
import { FileCode, Bot, History, ChevronRight, Rocket } from 'lucide-react';

const CodeAnalysisDashboard: React.FC = () => {
    const { t } = useTranslation();

    return (
        <div className="space-y-8">
            <div className="flex items-center gap-3">
                <div className="p-3 bg-indigo-50 dark:bg-indigo-500/10 rounded-xl">
                    <Rocket className="w-8 h-8 text-indigo-600 dark:text-indigo-400" />
                </div>
                <div>
                    <h1 className="text-3xl font-bold text-slate-900 dark:text-white">{t('analysis.dashboardTitle')}</h1>
                    <p className="text-slate-500 dark:text-slate-400 mt-1">{t('analysis.dashboardSubtitle')}</p>
                </div>
            </div>

            <div className="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-6">
                {/* Code Static Analysis Card */}
                <Link to="/analysis" className="group bg-white p-6 rounded-2xl shadow-sm border border-slate-100 hover:shadow-xl hover:border-indigo-100 transition-all duration-300 relative overflow-hidden">
                    <div className="absolute top-0 right-0 w-32 h-32 bg-indigo-50 rounded-bl-full -mr-10 -mt-10 transition-transform group-hover:scale-110 duration-500" />

                    <div className="relative">
                        <div className="w-12 h-12 bg-indigo-100 text-indigo-600 rounded-xl flex items-center justify-center mb-6 group-hover:scale-110 transition-transform duration-300">
                            <FileCode className="w-6 h-6" />
                        </div>

                        <h3 className="text-xl font-bold text-slate-900 mb-2">{t('layout.codeStaticAnalysis')}</h3>
                        <p className="text-slate-500 mb-6 line-clamp-2">
                            {t('analysis.subtitle')}
                        </p>

                        <div className="flex items-center text-indigo-600 font-medium group-hover:translate-x-2 transition-transform duration-300">
                            {t('analysis.runAnalysis')} <ChevronRight className="w-4 h-4 ml-1" />
                        </div>
                    </div>
                </Link>

                {/* Code AI Analysis Card */}
                <Link to="/analysis/ai" className="group bg-white p-6 rounded-2xl shadow-sm border border-slate-100 hover:shadow-xl hover:border-purple-100 transition-all duration-300 relative overflow-hidden">
                    <div className="absolute top-0 right-0 w-32 h-32 bg-purple-50 rounded-bl-full -mr-10 -mt-10 transition-transform group-hover:scale-110 duration-500" />

                    <div className="relative">
                        <div className="w-12 h-12 bg-purple-100 text-purple-600 rounded-xl flex items-center justify-center mb-6 group-hover:scale-110 transition-transform duration-300">
                            <Bot className="w-6 h-6" />
                        </div>

                        <h3 className="text-xl font-bold text-slate-900 mb-2">{t('layout.codeAiAnalysis')}</h3>
                        <p className="text-slate-500 mb-6 line-clamp-2">
                            {t('analysis.aiSubtitle')}
                        </p>

                        <div className="flex items-center text-purple-600 font-medium group-hover:translate-x-2 transition-transform duration-300">
                            {t('aiAnalysis.startAnalysis')} <ChevronRight className="w-4 h-4 ml-1" />
                        </div>
                    </div>
                </Link>

                {/* Analysis History Card */}
                <Link to="/analysis/history" className="group bg-white p-6 rounded-2xl shadow-sm border border-slate-100 hover:shadow-xl hover:border-blue-100 transition-all duration-300 relative overflow-hidden">
                    <div className="absolute top-0 right-0 w-32 h-32 bg-blue-50 rounded-bl-full -mr-10 -mt-10 transition-transform group-hover:scale-110 duration-500" />

                    <div className="relative">
                        <div className="w-12 h-12 bg-blue-100 text-blue-600 rounded-xl flex items-center justify-center mb-6 group-hover:scale-110 transition-transform duration-300">
                            <History className="w-6 h-6" />
                        </div>

                        <h3 className="text-xl font-bold text-slate-900 mb-2">{t('layout.analysisHistory')}</h3>
                        <p className="text-slate-500 mb-6 line-clamp-2">
                            {t('analysis.historySubtitle')}
                        </p>

                        <div className="flex items-center text-blue-600 font-medium group-hover:translate-x-2 transition-transform duration-300">
                            {t('analysis.viewLogs')} <ChevronRight className="w-4 h-4 ml-1" />
                        </div>
                    </div>
                </Link>
            </div>
        </div>
    );
};

export default CodeAnalysisDashboard;
