import React, { useState, useEffect, useRef } from 'react';
import { X, Play, RefreshCw, Terminal, Loader2, CheckCircle, AlertCircle } from 'lucide-react';
import client from '../api/client';
import { useAnalysisWebSocket } from '../hooks/useAnalysisWebSocket';
import toast from 'react-hot-toast';
import { useTranslation } from 'react-i18next';

interface SqlAnalysisModalProps {
    isOpen: boolean;
    onClose: () => void;
    projectName: string;
    sqlData: {
        id: string;
        mapper_name: string;
        sql_type: string;
        sql_content: string;
    };
    onAnalysisComplete?: () => void;
}

type Step = 'settings' | 'running' | 'completed';

export const SqlAnalysisModal: React.FC<SqlAnalysisModalProps> = ({
    isOpen,
    onClose,
    projectName,
    sqlData,
    onAnalysisComplete
}) => {
    const { t } = useTranslation();
    const [step, setStep] = useState<Step>('settings');
    const [jobId, setJobId] = useState<string | null>(null);
    const [logs, setLogs] = useState<string[]>([]);
    const [progress, setProgress] = useState<{ current: number; total: number; percent: number } | null>(null);
    const [analysisStatus, setAnalysisStatus] = useState<'idle' | 'running' | 'success' | 'failed' | 'cancelled'>('idle');

    // Form Settings
    const [settings, setSettings] = useState({
        includeAi: true,
        force: true
    });

    const logsEndRef = useRef<HTMLDivElement>(null);

    // WebSocket
    useAnalysisWebSocket({
        jobId,
        jobType: 'ai',
        onLog: (log) => {
            setLogs(prev => [...prev, log]);
        },
        onProgress: (_p) => {
            // Progress parsed from logs
        },
        onComplete: (data) => {
            if (data.status === 'completed' || data.status === 'success') {
                setAnalysisStatus('success');
                setStep('completed');
                toast.success(t('sqlAnalysis.completed', 'SQL analysis completed successfully'));
                if (onAnalysisComplete) onAnalysisComplete();
            } else if (data.status === 'failed' || data.status === 'error') {
                setAnalysisStatus('failed');
                toast.error(t('sqlAnalysis.failed', 'SQL analysis failed'));
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

    // Parse progress from logs
    useEffect(() => {
        if (logs.length > 0) {
            const lastLog = logs[logs.length - 1];
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
                force: settings.force,
                ai_options: aiOptions
            };

            const res = await client.post(
                `/projects/${projectName}/sqls/${sqlData.id}/analyze?mapper_name=${encodeURIComponent(sqlData.mapper_name)}`,
                payload
            );

            if (res.data && res.data.job_id) {
                const jobIdResult = res.data.job_id;

                // 정적 분석만 수행한 경우 (AI 분석 없음)
                if (jobIdResult === 'static_analysis_only') {
                    // 정적 분석 로그 표시
                    if (res.data.logs && Array.isArray(res.data.logs)) {
                        setLogs(res.data.logs);
                    }
                    setAnalysisStatus('success');
                    setStep('completed');
                    toast.success(t('sqlAnalysis.completed', 'SQL analysis completed successfully'));
                    if (onAnalysisComplete) onAnalysisComplete();
                } else {
                    // AI 분석이 포함된 경우 WebSocket으로 진행상황 추적
                    setJobId(jobIdResult);
                }
            }
        } catch (error) {
            console.error("Failed to start SQL analysis", error);
            toast.error(t('sqlAnalysis.startFailed', 'Failed to start SQL analysis'));
            setStep('settings');
            setAnalysisStatus('idle');
        }
    };

    const handleStop = async () => {
        if (jobId) {
            try {
                await client.post(`/ai/${jobId}/cancel`);
                toast.success(t('sqlAnalysis.stopSuccess', 'Analysis stopped'));
                setAnalysisStatus('cancelled');
            } catch (error) {
                toast.error(t('sqlAnalysis.stopFailed', 'Failed to stop analysis'));
            }
        }
    };

    const handleClose = () => {
        if (analysisStatus === 'running') {
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
                                {t('sqlAnalysis.title', 'SQL Re-analysis')}
                            </h2>
                            <p className="text-xs text-slate-500 dark:text-slate-400 font-mono">
                                {sqlData.id} ({sqlData.sql_type})
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
                            {/* AI Settings */}
                            <div className="space-y-4">
                                <h3 className="text-sm font-semibold text-slate-900 dark:text-slate-100 flex items-center gap-2">
                                    <Terminal className="w-4 h-4 text-slate-500" />
                                    {t('sqlAnalysis.aiAnalysis', 'AI Analysis')}
                                </h3>

                                <div className="bg-slate-50 dark:bg-slate-800/50 rounded-xl p-4 space-y-3 border border-slate-200 dark:border-slate-700">
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
                                                {t('sqlAnalysis.includeAi', 'Include AI Analysis')}
                                            </span>
                                            <p className={`text-xs ${settings.includeAi
                                                ? 'text-indigo-700/80 dark:text-indigo-300/80'
                                                : 'text-slate-500 dark:text-slate-400'
                                                }`}>
                                                {t('sqlAnalysis.includeAiDesc', 'Generate AI description and SQL Flow visualization')}
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
                                        </div>
                                    </label>

                                    <label className="flex items-center gap-3 cursor-pointer">
                                        <input
                                            type="checkbox"
                                            checked={settings.force}
                                            onChange={(e) => setSettings({ ...settings, force: e.target.checked })}
                                            className="w-4 h-4 rounded text-indigo-600 focus:ring-indigo-500 border-gray-300"
                                        />
                                        <div className="flex-1">
                                            <span className="text-sm font-medium text-slate-700 dark:text-slate-300">
                                                {t('sqlAnalysis.force', 'Force Re-analysis')}
                                            </span>
                                            <p className="text-xs text-slate-500 dark:text-slate-400">
                                                {t('sqlAnalysis.forceDesc', 'Overwrite existing AI description even if it exists')}
                                            </p>
                                        </div>
                                    </label>
                                </div>
                            </div>

                            {/* SQL Info */}
                            <div className="bg-blue-50 dark:bg-blue-900/20 border border-blue-200 dark:border-blue-900/30 rounded-lg p-4">
                                <h4 className="text-sm font-semibold text-blue-900 dark:text-blue-300 mb-2">
                                    {t('sqlAnalysis.sqlInfo', 'SQL Information')}
                                </h4>
                                <div className="space-y-1 text-xs">
                                    <div className="flex gap-2">
                                        <span className="text-blue-700 dark:text-blue-400 font-medium">ID:</span>
                                        <span className="text-blue-900 dark:text-blue-200 font-mono">{sqlData.id}</span>
                                    </div>
                                    <div className="flex gap-2">
                                        <span className="text-blue-700 dark:text-blue-400 font-medium">Mapper:</span>
                                        <span className="text-blue-900 dark:text-blue-200 font-mono">{sqlData.mapper_name}</span>
                                    </div>
                                    <div className="flex gap-2">
                                        <span className="text-blue-700 dark:text-blue-400 font-medium">Type:</span>
                                        <span className="text-blue-900 dark:text-blue-200 font-mono">{sqlData.sql_type}</span>
                                    </div>
                                </div>
                            </div>
                        </div>
                    ) : (
                        // Log View
                        <div className="flex flex-col h-[400px]">
                            <div className="bg-slate-950 p-4 flex-1 overflow-y-auto font-mono text-xs md:text-sm text-slate-300">
                                {logs.length === 0 && (
                                    <div className="text-slate-600 italic text-center py-10">
                                        {t('sqlAnalysis.initializing', 'Initializing SQL analysis...')}
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
                                            <Loader2 className="w-3 h-3 animate-spin" /> {t('sqlAnalysis.processing', 'Processing...')}
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
                                {t('sqlAnalysis.cancel', 'Cancel')}
                            </button>
                            <button onClick={handleStart} className="px-5 py-2 bg-indigo-600 hover:bg-indigo-700 text-white rounded-lg text-sm font-medium transition-colors shadow-sm flex items-center gap-2">
                                <Play className="w-4 h-4" /> {t('sqlAnalysis.start', 'Start Analysis')}
                            </button>
                        </>
                    ) : (
                        <>
                            <div className="text-sm">
                                {analysisStatus === 'success' && <span className="text-emerald-600 font-bold flex items-center gap-1"><CheckCircle className="w-4 h-4" /> {t('sqlAnalysis.completed', 'Completed')}</span>}
                                {analysisStatus === 'failed' && <span className="text-red-600 font-bold flex items-center gap-1"><AlertCircle className="w-4 h-4" /> {t('sqlAnalysis.failed', 'Failed')}</span>}
                                {analysisStatus === 'cancelled' && <span className="text-slate-500 font-bold">{t('sqlAnalysis.cancelled', 'Cancelled')}</span>}
                            </div>
                            <div className="flex gap-2">
                                {analysisStatus === 'running' && (
                                    <button onClick={handleStop} className="px-4 py-2 text-red-600 hover:bg-red-50 dark:hover:bg-red-900/20 border border-red-200 dark:border-red-900/30 rounded-lg text-sm font-medium transition-colors">
                                        {t('sqlAnalysis.stop', 'Stop')}
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
                                    {t('sqlAnalysis.close', 'Close')}
                                </button>
                            </div>
                        </>
                    )}
                </div>
            </div>
        </div>
    );
};
