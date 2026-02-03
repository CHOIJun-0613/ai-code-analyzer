import React, { useState, useEffect, useRef } from 'react';

import { X, Play, RefreshCw, Terminal, Loader2, CheckCircle, AlertCircle, Box } from 'lucide-react';
import client from '../api/client';
import { useAnalysisWebSocket } from '../hooks/useAnalysisWebSocket';
import toast from 'react-hot-toast';
import { useTranslation } from 'react-i18next';

interface ClassAnalysisModalProps {
    isOpen: boolean;
    onClose: () => void;
    projectName: string;
    classData: any; // Type for Class Node
    onAnalysisComplete?: () => void;
}

type Step = 'settings' | 'running' | 'completed';

export const ClassAnalysisModal: React.FC<ClassAnalysisModalProps> = ({
    isOpen,
    onClose,
    projectName,
    classData,
    onAnalysisComplete
}) => {
    const { t } = useTranslation();
    const [step, setStep] = useState<Step>('settings');
    const [jobId, setJobId] = useState<string | null>(null);
    const [logs, setLogs] = useState<string[]>([]);
    const [progress, setProgress] = useState<{ current: number; total: number; percent: number } | null>(null);
    const [analysisStatus, setAnalysisStatus] = useState<'idle' | 'running' | 'success' | 'failed' | 'cancelled'>('idle');

    // Form Settings
    // Determine if DTO based on sub_type
    const isDto = classData.sub_type === 'DTO' || classData.sub_type === 'dto';

    const [settings, setSettings] = useState({
        skipDtoSource: true,
        skipDtoMethods: true,
        includeAi: false
    });

    const logsEndRef = useRef<HTMLDivElement>(null);

    // Initial load of user preferences (optional, skipping for speed/simplicity, using defaults)
    // Could fetch /users/me/preferences if needed.

    // WebSocket
    useAnalysisWebSocket({
        jobId,
        jobType: 'analysis',
        onLog: (log) => {
            setLogs(prev => [...prev, log]);
        },
        onProgress: (_p) => {
            // Progress parsed from logs usually, but if sent via WS:
            // console.debug('Progress:', p);
        },
        onComplete: (data) => {
            if (data.status === 'completed' || data.status === 'success') {
                setAnalysisStatus('success');
                setStep('completed');
                toast.success(t('classAnalysis.completed', 'Analysis completed successfully'));
                if (onAnalysisComplete) onAnalysisComplete();
            } else if (data.status === 'failed' || data.status === 'error') {
                setAnalysisStatus('failed');
                toast.error(t('classAnalysis.failed', 'Analysis failed'));
            } else if (data.status === 'cancelled') {
                setAnalysisStatus('cancelled');
            }
        },
        onError: (err) => {
            console.error('WS Error:', err);
        }
    });

    useEffect(() => {
        if (logsEndRef.current) {
            logsEndRef.current.scrollIntoView({ behavior: 'smooth' });
        }
    }, [logs]);

    // Parse progress from logs manually if needed (reuse logic from Analysis.tsx)
    useEffect(() => {
        if (logs.length > 0) {
            const lastLog = logs[logs.length - 1];
            // Regex for [1/10] (10%) format
            const match = lastLog.match(/\[(\d+)\/(\d+)\] \((\d+)%\)/);
            if (match) {
                setProgress({
                    current: parseInt(match[1]),
                    total: parseInt(match[2]),
                    percent: parseInt(match[3])
                });
            }
        }
    }, [logs]);

    // AI Config State
    const [aiConfig, setAiConfig] = useState<any>(null);

    // Fetch AI Preferences on mount
    useEffect(() => {
        if (isOpen) {
            client.get('/users/me/preferences/ai')
                .then(res => {
                    if (res.data) {
                        setAiConfig(res.data);
                    }
                })
                .catch(err => console.error("Failed to load AI preferences", err));
        }
    }, [isOpen]);

    const handleStart = async () => {
        try {
            setStep('running');
            setAnalysisStatus('running');
            setLogs([]);
            setProgress(null);

            // Construct AI Options from loaded config
            let aiOptions = null;
            if (aiConfig) {
                aiOptions = {
                    provider: aiConfig.ai_provider,
                    model_name: aiConfig.model_name,
                    api_key: aiConfig.api_key,
                    api_endpoint: aiConfig.api_endpoint
                };
            }

            const payload = {
                include_ai: settings.includeAi,
                skip_dto_source: settings.skipDtoSource,
                skip_dto_methods: settings.skipDtoMethods,
                ai_options: aiOptions
            };

            const res = await client.post(`/projects/${projectName}/classes/${classData.name}/analyze`, payload);
            if (res.data && res.data.job_id) {
                setJobId(res.data.job_id);
            }
        } catch (error) {
            console.error("Failed to start analysis", error);
            toast.error(t('analysis.startFailed'));
            setStep('settings');
            setAnalysisStatus('idle');
        }
    };

    const handleStop = async () => {
        if (jobId) {
            try {
                await client.post(`/analysis/analyze/${jobId}/cancel`);
                toast.success(t('analysis.stopSuccess'));
                setAnalysisStatus('cancelled');
            } catch (error) {
                toast.error(t('analysis.stopFailed'));
            }
        }
    };

    const handleClose = () => {
        if (analysisStatus === 'running') {
            // Confirm stop?
            handleStop();
        }
        onClose();
        // Reset state after close
        setTimeout(() => {
            setStep('settings');
            setJobId(null);
            setLogs([]);
            setAnalysisStatus('idle');
        }, 300);
    };

    if (!isOpen) return null;

    return (
        <div className="fixed inset-0 z-50 flex items-center justify-center p-4 bg-black/70 backdrop-blur-sm animate-in fade-in duration-200">
            <div className="bg-white dark:bg-slate-800 rounded-2xl shadow-2xl w-full max-w-2xl overflow-hidden border border-slate-200 dark:border-slate-700 flex flex-col max-h-[85vh]">

                {/* Header */}
                <div className="px-6 py-4 border-b border-slate-100 dark:border-slate-700 flex items-center justify-between bg-white dark:bg-slate-800">
                    <div className="flex items-center gap-3">
                        <div className="p-2 bg-indigo-50 dark:bg-indigo-900/30 rounded-lg">
                            <RefreshCw className={`w-5 h-5 text-indigo-600 dark:text-indigo-400 ${analysisStatus === 'running' ? 'animate-spin' : ''}`} />
                        </div>
                        <div>
                            <h2 className="text-lg font-bold text-slate-800 dark:text-white">
                                {t('classAnalysis.title', 'Class Re-analysis')}
                            </h2>
                            <p className="text-xs text-slate-500 dark:text-slate-400 font-mono">
                                {classData.name}
                            </p>
                        </div>
                    </div>
                    <button onClick={handleClose} className="p-2 text-slate-400 hover:text-slate-600 dark:hover:text-slate-300 rounded-full hover:bg-slate-100 dark:hover:bg-slate-800 transition-colors">
                        <X className="w-5 h-5" />
                    </button>
                </div>

                {/* Body */}
                <div className="flex-1 overflow-y-auto overflow-x-hidden">
                    {step === 'settings' ? (
                        <div className="p-6 space-y-6">
                            {/* DTO Settings */}
                            <div className="space-y-4">
                                <h3 className="text-sm font-semibold text-slate-900 dark:text-slate-100 flex items-center gap-2">
                                    <Box className="w-4 h-4 text-slate-500" />
                                    {t('classAnalysis.parsingOptions', 'Parsing Options')}
                                </h3>

                                <div className="bg-slate-50 dark:bg-slate-800/50 rounded-xl p-4 space-y-3 border border-slate-200 dark:border-slate-700">
                                    <label className={`flex items-center gap-3 ${!isDto ? 'opacity-50 cursor-not-allowed' : 'cursor-pointer'}`}>
                                        <input
                                            type="checkbox"
                                            checked={settings.skipDtoSource}
                                            onChange={(e) => setSettings({ ...settings, skipDtoSource: e.target.checked })}
                                            disabled={!isDto}
                                            className="w-4 h-4 rounded text-indigo-600 focus:ring-indigo-500 border-gray-300"
                                        />
                                        <div className="flex-1">
                                            <span className="text-sm font-medium text-slate-700 dark:text-slate-300">{t('classAnalysis.skipDtoSource', 'Skip DTO Source')}</span>
                                            <p className="text-xs text-slate-500 dark:text-slate-400">{t('classAnalysis.skipDtoSourceDesc', 'Do not store source code for DTOs to save space.')}</p>
                                        </div>
                                    </label>

                                    <label className={`flex items-center gap-3 ${!isDto ? 'opacity-50 cursor-not-allowed' : 'cursor-pointer'}`}>
                                        <input
                                            type="checkbox"
                                            checked={settings.skipDtoMethods}
                                            onChange={(e) => setSettings({ ...settings, skipDtoMethods: e.target.checked })}
                                            disabled={!isDto}
                                            className="w-4 h-4 rounded text-indigo-600 focus:ring-indigo-500 border-gray-300"
                                        />
                                        <div className="flex-1">
                                            <span className="text-sm font-medium text-slate-700 dark:text-slate-300">{t('classAnalysis.skipDtoMethods', 'Skip DTO Methods')}</span>
                                            <p className="text-xs text-slate-500 dark:text-slate-400">{t('classAnalysis.skipDtoMethodsDesc', 'Do not analyze methods/complexity for DTOs.')}</p>
                                        </div>
                                    </label>

                                    {!isDto && (
                                        <p className="text-xs text-amber-600 dark:text-amber-500 flex items-center gap-1 mt-2">
                                            <AlertCircle className="w-3 h-3" />
                                            {t('classAnalysis.dtoOptionsDisabled', 'Options disabled because this class is not identified as a DTO.')}
                                        </p>
                                    )}
                                </div>
                            </div>

                            {/* AI Settings */}
                            <div className="space-y-4">
                                <h3 className="text-sm font-semibold text-slate-900 dark:text-slate-100 flex items-center gap-2">
                                    <Terminal className="w-4 h-4 text-slate-500" />
                                    {t('classAnalysis.aiAnalysis', 'AI Analysis')}
                                </h3>
                                <div className="bg-slate-50 dark:bg-slate-800/50 rounded-xl p-4 border border-slate-200 dark:border-slate-700">
                                    <label
                                        className={`flex items-center justify-between cursor-pointer group p-3 rounded-xl border transition-all ${settings.includeAi
                                            ? 'bg-indigo-50 dark:bg-indigo-900/20 border-indigo-200 dark:border-indigo-500'
                                            : 'border-transparent hover:bg-slate-200/50 dark:hover:bg-slate-700/50'
                                            }`}
                                    >
                                        <div className="flex-1">
                                            <span className={`text-sm font-medium transition-colors ${settings.includeAi
                                                ? 'text-indigo-900 dark:text-indigo-100'
                                                : 'text-slate-700 dark:text-slate-300 group-hover:text-indigo-600 dark:group-hover:text-indigo-400'
                                                }`}>
                                                {t('classAnalysis.includeAi', 'Include AI Analysis')}
                                            </span>
                                            <p className={`text-xs ${settings.includeAi
                                                ? 'text-indigo-700/80 dark:text-indigo-300/80'
                                                : 'text-slate-500 dark:text-slate-400'
                                                }`}>
                                                {t('classAnalysis.includeAiDesc', 'Generate AI description and insights (Requires LLM).')}
                                            </p>
                                        </div>
                                        <div className={`w-11 h-6 bg-gray-200 dark:bg-slate-700 rounded-full peer peer-focus:ring-4 peer-focus:ring-indigo-300 dark:peer-focus:ring-indigo-800 relative transition-colors ${settings.includeAi ? 'bg-indigo-600 dark:bg-indigo-600' : ''}`}>
                                            <input
                                                type="checkbox"
                                                checked={settings.includeAi}
                                                onChange={(e) => setSettings({ ...settings, includeAi: e.target.checked })}
                                                className="sr-only peer"
                                            />
                                            <div className={`w-5 h-5 bg-white rounded-full absolute top-0.5 left-0.5 transition-transform shadow-sm ${settings.includeAi ? 'translate-x-full border-white' : 'border-gray-300'}`}></div>
                                            {/* Custom Toggle UI */}
                                        </div>
                                    </label>
                                </div>
                            </div>
                        </div>
                    ) : (
                        // Log View
                        <div className="flex flex-col h-[400px]">
                            <div className="bg-slate-950 p-4 flex-1 overflow-y-auto font-mono text-xs md:text-sm text-slate-300">
                                {logs.length === 0 && (
                                    <div className="text-slate-600 italic text-center py-10">
                                        {t('classAnalysis.initializing', 'Initializing analysis job...')}
                                    </div>
                                )}
                                {logs.map((log, i) => (
                                    <div key={i} className="whitespace-pre-wrap break-all mb-1 hover:bg-slate-900">
                                        <span className="text-slate-600 mr-2 select-none">[{i + 1}]</span>
                                        <span className="text-emerald-400">{log}</span>
                                    </div>
                                ))}
                                <div ref={logsEndRef} />
                            </div>

                            {/* Progress Bar Footer */}
                            {analysisStatus === 'running' && progress && (
                                <div className="bg-white dark:bg-slate-900 border-t border-slate-200 dark:border-slate-800 p-3">
                                    <div className="flex justify-between text-xs text-slate-600 dark:text-slate-400 mb-1">
                                        <span className="flex items-center gap-2">
                                            <Loader2 className="w-3 h-3 animate-spin" /> {t('classAnalysis.processing', 'Processing...')}
                                        </span>
                                        <span>{progress.percent}%</span>
                                    </div>
                                    <div className="w-full bg-slate-100 dark:bg-slate-800 rounded-full h-1.5 overflow-hidden">
                                        <div
                                            className="bg-indigo-600 h-full transition-all duration-300"
                                            style={{ width: `${progress.percent}%` }}
                                        />
                                    </div>
                                </div>
                            )}
                        </div>
                    )}
                </div>

                {/* Footer */}
                <div className="px-6 py-4 border-t border-slate-100 dark:border-slate-700 bg-slate-50 dark:bg-slate-900/50 flex justify-between items-center">
                    {step === 'settings' ? (
                        <>
                            <button onClick={handleClose} className="px-4 py-2 text-slate-600 dark:text-slate-300 hover:bg-slate-200 dark:hover:bg-slate-800 rounded-lg text-sm font-medium transition-colors">
                                {t('classAnalysis.cancel', 'Cancel')}
                            </button>
                            <button onClick={handleStart} className="px-5 py-2 bg-indigo-600 hover:bg-indigo-700 text-white rounded-lg text-sm font-medium transition-colors shadow-sm flex items-center gap-2">
                                <Play className="w-4 h-4" /> {t('classAnalysis.start', 'Start Analysis')}
                            </button>
                        </>
                    ) : (
                        <>
                            <div className="text-sm">
                                {analysisStatus === 'success' && <span className="text-emerald-600 font-bold flex items-center gap-1"><CheckCircle className="w-4 h-4" /> {t('classAnalysis.completed', 'Completed')}</span>}
                                {analysisStatus === 'failed' && <span className="text-red-600 font-bold flex items-center gap-1"><AlertCircle className="w-4 h-4" /> {t('classAnalysis.failed', 'Failed')}</span>}
                                {analysisStatus === 'cancelled' && <span className="text-slate-500 font-bold">{t('classAnalysis.cancelled', 'Cancelled')}</span>}
                            </div>
                            <div className="flex gap-2">
                                {analysisStatus === 'running' && (
                                    <button onClick={handleStop} className="px-4 py-2 text-red-600 hover:bg-red-50 dark:hover:bg-red-900/20 border border-red-200 dark:border-red-900/30 rounded-lg text-sm font-medium transition-colors">
                                        {t('classAnalysis.stop', 'Stop')}
                                    </button>
                                )}
                                <button
                                    onClick={handleClose}
                                    className={`px-5 py-2 rounded-lg text-sm font-medium transition-colors shadow-sm ${analysisStatus === 'running'
                                        ? 'bg-slate-100 text-slate-400 cursor-not-allowed'
                                        : 'bg-indigo-600 hover:bg-indigo-700 text-white'
                                        }`}
                                    disabled={analysisStatus === 'running'}
                                >
                                    {t('classAnalysis.close', 'Close')}
                                </button>
                            </div>
                        </>
                    )}
                </div>
            </div>
        </div>
    );
};
