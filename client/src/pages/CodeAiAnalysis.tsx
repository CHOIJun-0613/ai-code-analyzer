import React, { useState, useEffect, useRef } from 'react';
import toast from 'react-hot-toast';
import { useQuery, useMutation, useQueryClient } from '@tanstack/react-query';
import { useTranslation } from 'react-i18next';
import client from '../api/client';
import {
    Save,
    RotateCw,
    Settings as SettingsIcon,
    BrainCircuit,
    Play,
    AlertCircle,
    Database,
    Eraser,
    RefreshCw,
    Eye,
    EyeOff,
    Loader2,
    Activity as ActivityIcon,
    FileText,
    List,
    Download,
    X,
    CheckCircle,
    FileCode,
    Square,
    XCircle,
    Rocket
} from 'lucide-react';
import { useAnalysisWebSocket } from '../hooks/useAnalysisWebSocket';

// Shared styling classes
const cardClass = "bg-white p-6 rounded-2xl shadow-sm border border-slate-200 transition-all hover:shadow-md";
const labelClass = "block text-sm font-semibold text-slate-700 mb-2 flex items-center gap-2";
const inputClass = "w-full px-4 py-2.5 bg-slate-50 border border-slate-200 rounded-xl focus:ring-2 focus:ring-indigo-500/20 focus:border-indigo-500 outline-none transition-all duration-200 text-sm";
const radioClass = "w-4 h-4 text-indigo-600 bg-slate-100 border-slate-300 focus:ring-indigo-500";

const sectionTitleClass = "text-lg font-bold text-slate-800 flex items-center gap-2 mb-4 border-b border-slate-100 pb-2";

interface AiConfig {
    use_analysis: boolean;
    provider: string;
    model_name: string;
    api_key: string;
    api_endpoint: string;
    concurrent_requests: number;
    enrichment_batch_size: number;
}

interface AnalysisScope {
    projectName: string;
    nodeType: string;
    limit: number; // 0 = All
    clean: boolean; // true = 삭제 후 저장, false = 업데이트 저장
    className: string;
    logLevel: string;
}

interface Project {
    name: string;
    framework?: string;
}

const CodeAiAnalysis: React.FC = () => {
    const { t } = useTranslation();
    const queryClient = useQueryClient();

    // AI Config State
    const [aiConfig, setAiConfig] = useState<AiConfig>({
        use_analysis: true,
        provider: 'google',
        model_name: 'gemini-2.0-flash',
        api_key: '',
        api_endpoint: '',
        concurrent_requests: 10,
        enrichment_batch_size: 50
    });

    // Analysis Scope State
    const [scope, setScope] = useState<AnalysisScope>({
        projectName: '',
        nodeType: 'all',
        limit: 0,
        clean: false,
        className: '',
        logLevel: 'INFO'
    });

    const [showApiKey, setShowApiKey] = useState(false);

    // System State
    const [status, setStatus] = useState<'idle' | 'pending' | 'running' | 'completed' | 'failed' | 'success' | 'error' | 'cancelled' | 'cancelling'>('idle');
    const [jobId, setJobId] = useState<string>('');
    const [logs, setLogs] = useState<string[]>([]);

    // React Query: 프로젝트 목록 조회
    const { data: projects = [] } = useQuery<Project[]>({
        queryKey: ['projects'],
        queryFn: async () => {
            const response = await client.get<Project[]>('/projects/');
            return response.data;
        },
    });

    // 첫 번째 프로젝트 자동 선택 (useEffect로 처리)
    React.useEffect(() => {
        if (projects && projects.length > 0 && !scope.projectName) {
            setScope(prev => ({ ...prev, projectName: projects[0].name }));
        }
    }, [projects, scope.projectName]);

    // React Query: AI 설정 조회
    useQuery({
        queryKey: ['users', 'me', 'preferences', 'ai'],
        queryFn: async () => {
            const response = await client.get('/users/me/preferences/ai');
            if (response.data) {
                setAiConfig(prev => ({
                    ...prev,
                    use_analysis: true,
                    provider: response.data.ai_provider || prev.provider,
                    model_name: response.data.model_name || prev.model_name,
                    api_key: response.data.api_key || prev.api_key,
                    api_endpoint: response.data.api_endpoint || prev.api_endpoint,
                    concurrent_requests: response.data.concurrent_ai_requests || prev.concurrent_requests,
                    enrichment_batch_size: response.data.ai_enrichment_batch_size || prev.enrichment_batch_size
                }));
            }
            return response.data;
        },
        staleTime: 1 * 60 * 1000, // 1분 캐싱
    });

    // React Query: 활성 AI 분석 작업 조회
    const { data: activeJob } = useQuery({
        queryKey: ['ai', 'active'],
        queryFn: async () => {
            console.log("Fetching active job...");
            const response = await client.get('/ai/active');
            return response.data;
        },
        retry: false,
        refetchOnWindowFocus: false,
        staleTime: 0,
        refetchOnMount: true
    });

    // Restore state from active job
    useEffect(() => {
        if (activeJob && activeJob.job_id) {
            console.log("Restoring active job state:", activeJob);
            setJobId(activeJob.job_id);
            setStatus(activeJob.status);

            // Restore Scope
            if (activeJob.params) {
                setScope(prev => ({
                    ...prev,
                    projectName: activeJob.params.project_name || prev.projectName,
                    nodeType: activeJob.params.node_type || prev.nodeType,
                    limit: activeJob.params.limit || 0,
                    clean: activeJob.params.clean || false,
                    className: activeJob.params.class_name || '',
                    logLevel: activeJob.params.log_level || 'INFO'
                }));
            }

            // Restore Logs
            client.get(`/ai/${activeJob.job_id}/logs`)
                .then(res => {
                    if (res.data && res.data.logs) {
                        setLogs(res.data.logs);
                    }
                })
                .catch(err => console.error("Failed to fetch logs for active job", err));
        }
    }, [activeJob]);

    // Modals
    const [showLogModal, setShowLogModal] = useState(false);
    const [showSummaryModal, setShowSummaryModal] = useState(false);
    const [showConfirmModal, setShowConfirmModal] = useState(false);
    const [showStopConfirmModal, setShowStopConfirmModal] = useState(false);

    const logsEndRef = useRef<HTMLDivElement>(null);

    // Standard local log adder (for client side actions)


    // Scroll to bottom of logs
    useEffect(() => {
        if (showLogModal) {
            logsEndRef.current?.scrollIntoView({ behavior: "smooth" });
        }
    }, [logs, showLogModal]);

    // WebSocket Hook for real-time monitoring
    useAnalysisWebSocket({
        jobId,
        jobType: 'ai',
        onLog: (log) => {
            setLogs((prev) => [...prev, log]);
        },
        onStatus: (newStatus) => {
            setStatus(newStatus as any); // Cast to match state type
        },
        onProgress: (progress) => {
            // Progress is extracted from logs, no need to handle separately
            console.debug('Progress:', progress);
        },
        onComplete: (data) => {
            setStatus(data.status as any); // Cast to match state type
            console.log('AI Analysis complete:', data);
            if (data.status === 'completed' || data.status === 'success') {
                toast.success(t('aiAnalysis.analysisComplete') || "AI Analysis completed successfully!");
            } else if (data.status === 'failed' || data.status === 'error') {
                toast.error(t('aiAnalysis.analysisFailed') || "AI Analysis failed.");
            }
        },
        onError: (error) => {
            console.error('WebSocket error:', error);
            // Continue using the app, error is logged
        }
    });

    // Mutation: AI 설정 저장
    const saveSettingsMutation = useMutation({
        mutationFn: async (preferences: any) => {
            await client.put('/users/me/preferences/ai', preferences);
        },
        onSuccess: () => {
            // AI 설정 쿼리 무효화 (자동 재조회)
            queryClient.invalidateQueries({ queryKey: ['users', 'me', 'preferences', 'ai'] });
            toast.success(t('aiAnalysis.configSaveSuccess'));
        },
        onError: (error) => {
            console.error("Failed to save settings", error);
            toast.error(t('aiAnalysis.configSaveFail'));
        },
    });

    const handleSaveSettings = () => {
        const preferences = {
            use_analysis: true,
            ai_provider: aiConfig.provider,
            model_name: aiConfig.model_name,
            api_key: aiConfig.api_key,
            api_endpoint: aiConfig.api_endpoint,
            concurrent_ai_requests: aiConfig.concurrent_requests,
            ai_enrichment_batch_size: aiConfig.enrichment_batch_size
        };
        saveSettingsMutation.mutate(preferences);
    };

    const handleLoadSettings = () => {
        // AI 설정 쿼리 무효화 (자동 재조회)
        queryClient.invalidateQueries({ queryKey: ['users', 'me', 'preferences', 'ai'] });
    };

    const handleRunAnalysis = () => {
        if (!scope.projectName) {
            toast.error(t('aiAnalysis.selectProject'));
            return;
        }
        setShowConfirmModal(true);
    };

    const executeAnalysis = async () => {
        setShowConfirmModal(false);
        setStatus('running');
        setLogs([]); // Clear previous logs
        setJobId('');

        try {
            const payload = {
                project_name: scope.projectName,
                node_type: scope.nodeType,
                limit: scope.limit > 0 ? scope.limit : null,
                clean: scope.clean,
                class_name: scope.className || null,
                concurrent_requests: aiConfig.concurrent_requests,
                log_level: scope.logLevel,
                ai_config: {
                    provider: aiConfig.provider,
                    model_name: aiConfig.model_name,
                    api_key: aiConfig.api_key,
                    api_endpoint: aiConfig.api_endpoint
                }
            };

            const res = await client.post('/ai/enrich', payload);

            setJobId(res.data.job_id);
            // Invalidate active job query so cache is updated
            queryClient.invalidateQueries({ queryKey: ['ai', 'active'] });
            // status is already running, polling will take over
        } catch (error: any) {
            console.error("Analysis failed", error);
            setStatus('failed');
            toast.error(t('aiAnalysis.analysisStartFail', { error: error.response?.data?.detail || error.message }));
        }
    };

    const handleStopAnalysis = () => {
        if (!jobId) return;
        setShowStopConfirmModal(true);
    };

    const executeStopAnalysis = async () => {
        if (!jobId) return;
        try {
            console.log(`Requesting cancellation for job: ${jobId}`);
            await client.post(`/ai/${jobId}/cancel`);
            toast.success(t('aiAnalysis.stopRequestSuccess'));
            setShowStopConfirmModal(false);
        } catch (error) {
            console.error("Failed to stop analysis", error);
            toast.error(t('aiAnalysis.stopRequestFail'));
        }
    };

    const getAnalysisSummary = () => {
        if (!logs || logs.length === 0) return t('aiAnalysis.waitingForLogs');
        const summaryStartIndex = logs.findIndex(log => log.includes('AI ANALYSIS SUMMARY'));
        return summaryStartIndex !== -1 ? logs.slice(summaryStartIndex).join('\n') : t('aiAnalysis.waitingForLogs');
    };

    const extractProgress = () => {
        if (!logs || logs.length === 0) return null;
        for (let i = logs.length - 1; i >= 0; i--) {
            // Matching standard format: [current/total] (percent%)
            const match = logs[i].match(/\[(\d+)\/(\d+)\] \((\d+)%\)/);
            if (match) {
                return {
                    current: parseInt(match[1]),
                    total: parseInt(match[2]),
                    percent: parseInt(match[3]),
                    raw: logs[i]
                };
            }
        }
        return null;
    };

    const progress = extractProgress();

    const handleDownloadLogs = () => {
        if (!logs || logs.length === 0) return;
        const element = document.createElement("a");
        const file = new Blob([logs.join('\n')], { type: 'text/plain' });
        element.href = URL.createObjectURL(file);
        element.download = `analysis_ai_log_${jobId || 'unknown'}.txt`;
        document.body.appendChild(element);
        element.click();
        document.body.removeChild(element);
    };

    const handleDownloadSummary = () => {
        const summary = getAnalysisSummary();
        if (!summary) return;
        const element = document.createElement("a");
        const file = new Blob([summary], { type: 'text/plain' });
        element.href = URL.createObjectURL(file);
        element.download = `analysis_ai_summary_${jobId || 'unknown'}.txt`;
        document.body.appendChild(element);
        element.click();
        document.body.removeChild(element);
    };

    return (
        <div className="max-w-5xl mx-auto space-y-8 pb-20">
            {/* Header */}
            <div className="flex flex-col gap-2">
                <div className="flex items-center gap-3">
                    <div className="p-3 bg-violet-500/10 rounded-xl">
                        <BrainCircuit className="w-8 h-8 text-violet-600" />
                    </div>
                    <div>
                        <h1 className="text-3xl font-bold text-slate-900">{t('aiAnalysis.title')}</h1>
                        <p className="text-slate-500 mt-1">{t('aiAnalysis.subtitle')}</p>
                    </div>
                </div>
            </div>

            {/* Confirmation Modal */}
            {showConfirmModal && (
                <div className="fixed inset-0 z-50 flex items-center justify-center p-4 bg-slate-900/60 backdrop-blur-sm animate-in fade-in duration-200">
                    <div className="bg-white rounded-2xl shadow-2xl w-full max-w-md overflow-hidden animate-in zoom-in-95 duration-200 border border-slate-100">
                        <div className="p-8">
                            <div className="flex flex-col items-center text-center">
                                <div className="w-16 h-16 bg-indigo-50 rounded-full flex items-center justify-center mb-6 ring-8 ring-indigo-50/50">
                                    <Rocket className="w-8 h-8 text-indigo-600" />
                                </div>

                                <h3 className="text-xl font-bold text-slate-900 mb-3">
                                    {t('analysis.analysisConfirmTitle')}
                                </h3>

                                <p className="text-slate-500 whitespace-pre-wrap leading-relaxed mb-8">
                                    {t('analysis.analysisConfirmMessage')}
                                </p>

                                <div className="flex gap-3 w-full">
                                    <button
                                        type="button"
                                        className="flex-1 py-3 px-4 bg-white border border-slate-200 text-slate-700 font-semibold rounded-xl hover:bg-slate-50 hover:border-slate-300 transition-all active:scale-[0.98]"
                                        onClick={() => setShowConfirmModal(false)}
                                    >
                                        {t('common.cancel')}
                                    </button>
                                    <button
                                        type="button"
                                        className="flex-1 py-3 px-4 bg-indigo-600 text-white font-semibold rounded-xl shadow-lg shadow-indigo-200 hover:bg-indigo-700 hover:shadow-indigo-300 transition-all active:scale-[0.98]"
                                        onClick={executeAnalysis}
                                    >
                                        {t('analysis.confirm')}
                                    </button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            )}

            {/* Stop Confirmation Modal */}
            {showStopConfirmModal && (
                <div className="fixed inset-0 z-50 flex items-center justify-center p-4 bg-slate-900/60 backdrop-blur-sm animate-in fade-in duration-200">
                    <div className="bg-white rounded-2xl shadow-2xl w-full max-w-md overflow-hidden animate-in zoom-in-95 duration-200 border border-slate-100">
                        <div className="p-8">
                            <div className="flex flex-col items-center text-center">
                                <div className="w-16 h-16 bg-rose-50 rounded-full flex items-center justify-center mb-6 ring-8 ring-rose-50/50">
                                    <Square className="w-8 h-8 text-rose-500 fill-current" />
                                </div>

                                <h3 className="text-xl font-bold text-slate-900 mb-3">
                                    {t('analysis.analysisStopConfirmTitle')}
                                </h3>

                                <p className="text-slate-500 whitespace-pre-wrap leading-relaxed mb-8">
                                    {t('analysis.analysisStopConfirmMessage')}
                                </p>

                                <div className="flex gap-3 w-full">
                                    <button
                                        type="button"
                                        className="flex-1 py-3 px-4 bg-white border border-slate-200 text-slate-700 font-semibold rounded-xl hover:bg-slate-50 hover:border-slate-300 transition-all active:scale-[0.98]"
                                        onClick={() => setShowStopConfirmModal(false)}
                                    >
                                        {t('common.cancel')}
                                    </button>
                                    <button
                                        type="button"
                                        className="flex-1 py-3 px-4 bg-rose-600 text-white font-semibold rounded-xl shadow-lg shadow-rose-200 hover:bg-rose-700 hover:shadow-rose-300 transition-all active:scale-[0.98]"
                                        onClick={executeStopAnalysis}
                                    >
                                        {t('analysis.confirm')}
                                    </button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            )}

            {/* Layout Order: 1. Scope -> 3. Config -> 2. Run */}

            {/* 1. Analysis Task Settings */}
            <div className={cardClass}>
                <h2 className={sectionTitleClass}>
                    <Database className="w-5 h-5 text-indigo-500" />
                    {t('aiAnalysis.taskSettings')}
                </h2>
                {/* ... (Existing Scope Form Content) ... */}
                <div className="grid grid-cols-1 md:grid-cols-2 gap-6">
                    <div>
                        <label className={labelClass}>{t('aiAnalysis.targetProject')}</label>
                        <select
                            className={inputClass}
                            value={scope.projectName}
                            onChange={(e) => setScope({ ...scope, projectName: e.target.value })}
                        >
                            {projects.map(p => (
                                <option key={p.name} value={p.name}>{p.name}</option>
                            ))}
                        </select>
                    </div>
                    <div>
                        <label className={labelClass}>{t('aiAnalysis.nodeType')}</label>
                        <div className="grid grid-cols-4 gap-2">
                            {['class', 'method', 'sql', 'all'].map(type => (
                                <button
                                    key={type}
                                    onClick={() => setScope({ ...scope, nodeType: type })}
                                    className={`px-3 py-2 text-sm rounded-lg border transition-all ${scope.nodeType === type
                                        ? 'bg-indigo-50 border-indigo-500 text-indigo-700 font-medium'
                                        : 'bg-white border-slate-200 text-slate-600 hover:bg-slate-50'
                                        }`}
                                >
                                    {type.toUpperCase()}
                                </button>
                            ))}
                        </div>
                    </div>
                    <div>
                        <label className={labelClass}>{t('aiAnalysis.classFilter')}</label>
                        <input
                            type="text"
                            className={inputClass}
                            placeholder={t('aiAnalysis.classFilterPlaceholder')}
                            value={scope.className}
                            onChange={(e) => setScope({ ...scope, className: e.target.value })}
                        />
                    </div>
                    <div>
                        <label className={labelClass}>{t('aiAnalysis.limit')}</label>
                        <input
                            type="number"
                            className={inputClass}
                            value={scope.limit}
                            onChange={(e) => setScope({ ...scope, limit: parseInt(e.target.value) || 0 })}
                        />
                    </div>
                    <div>
                        <label className={labelClass}>{t('aiAnalysis.logLevel')}</label>
                        <select
                            value={scope.logLevel}
                            onChange={(e) => setScope({ ...scope, logLevel: e.target.value })}
                            className={inputClass}
                        >
                            <option value="DEBUG">DEBUG</option>
                            <option value="INFO">INFO</option>
                            <option value="WARNING">WARNING</option>
                            <option value="ERROR">ERROR</option>
                        </select>
                    </div>
                    <div className="md:col-span-2 bg-slate-50 p-4 rounded-xl border border-slate-200">
                        <label className={labelClass}>{t('aiAnalysis.saveOptions')}</label>
                        <div className="flex flex-col sm:flex-row gap-6 mt-3">
                            <label className="flex items-center gap-3 cursor-pointer group">
                                <div className="relative flex items-center">
                                    <input
                                        type="radio"
                                        name="saveOption"
                                        className={radioClass}
                                        checked={!scope.clean}
                                        onChange={() => setScope({ ...scope, clean: false })}
                                    />
                                </div>
                                <div>
                                    <span className="text-sm font-medium text-slate-800 group-hover:text-indigo-700 transition-colors flex items-center gap-2">
                                        <RefreshCw className="w-4 h-4 text-indigo-500" />
                                        {t('aiAnalysis.saveUpdate')}
                                    </span>
                                    <p className="text-xs text-slate-500 mt-1">{t('aiAnalysis.saveUpdateDesc')}</p>
                                </div>
                            </label>

                            <label className="flex items-center gap-3 cursor-pointer group">
                                <div className="relative flex items-center">
                                    <input
                                        type="radio"
                                        name="saveOption"
                                        className={radioClass}
                                        checked={scope.clean}
                                        onChange={() => setScope({ ...scope, clean: true })}
                                    />
                                </div>
                                <div>
                                    <span className="text-sm font-medium text-slate-800 group-hover:text-rose-700 transition-colors flex items-center gap-2">
                                        <Eraser className="w-4 h-4 text-rose-500" />
                                        {t('aiAnalysis.saveClean')}
                                    </span>
                                    <p className="text-xs text-slate-500 mt-1">{t('aiAnalysis.saveCleanDesc')}</p>
                                </div>
                            </label>
                        </div>
                    </div>
                </div>
            </div>

            {/* 3. Configuration */}
            <div className={cardClass}>
                <div className="flex items-center justify-between mb-4 border-b border-slate-100 pb-2">
                    <h2 className={sectionTitleClass.replace('mb-4 border-b border-slate-100 pb-2', '')}>
                        <SettingsIcon className="w-5 h-5 text-indigo-500" />
                        {t('aiAnalysis.configuration')}
                    </h2>

                    <div className="flex items-center gap-2">
                        <button
                            onClick={handleLoadSettings}
                            className="px-3 py-1.5 text-xs font-medium text-slate-600 bg-white border border-slate-200 rounded-lg hover:bg-slate-50 transition-all flex items-center gap-1.5"
                        >
                            <RotateCw className="w-3.5 h-3.5" />
                            {t('aiAnalysis.loadSettings')}
                        </button>
                        <button
                            onClick={handleSaveSettings}
                            disabled={saveSettingsMutation.isPending}
                            className={`px-3 py-1.5 text-xs font-bold text-white bg-slate-800 border border-slate-800 rounded-lg hover:bg-slate-700 transition-all flex items-center gap-1.5 shadow-sm ${saveSettingsMutation.isPending ? 'opacity-70' : ''}`}
                        >
                            {saveSettingsMutation.isPending ? <RotateCw className="w-3.5 h-3.5 animate-spin" /> : <Save className="w-3.5 h-3.5" />}
                            {t('aiAnalysis.saveSettings')}
                        </button>
                    </div>
                </div>

                <div className="grid grid-cols-1 md:grid-cols-2 gap-6">
                    <div>
                        <label className={labelClass}>{t('aiAnalysis.provider')}</label>
                        <select
                            value={aiConfig.provider}
                            onChange={(e) => setAiConfig({ ...aiConfig, provider: e.target.value })}
                            className={inputClass}
                        >
                            <option value="google">Google Gemini</option>
                            <option value="groq">Groq</option>
                            <option value="lmstudio">LM Studio (Local)</option>
                            <option value="openai">OpenAI</option>
                        </select>
                    </div>
                    <div>
                        <label className={labelClass}>{t('aiAnalysis.modelName')}</label>
                        <input
                            type="text"
                            value={aiConfig.model_name}
                            onChange={(e) => setAiConfig({ ...aiConfig, model_name: e.target.value })}
                            className={inputClass}
                            placeholder="gemini-2.0-flash"
                        />
                    </div>
                    {aiConfig.provider !== 'lmstudio' && (
                        <div className="md:col-span-2">
                            <label className={labelClass}>{t('aiAnalysis.apiKey')}</label>
                            <div className="relative">
                                <input
                                    type={showApiKey ? "text" : "password"}
                                    value={aiConfig.api_key}
                                    onChange={(e) => setAiConfig({ ...aiConfig, api_key: e.target.value })}
                                    className={`${inputClass} pr-10`}
                                    placeholder={t('aiAnalysis.apiKeyPlaceholder')}
                                />
                                <button
                                    type="button"
                                    onClick={() => setShowApiKey(!showApiKey)}
                                    className="absolute right-3 top-1/2 -translate-y-1/2 text-slate-400 hover:text-slate-600 focus:outline-none"
                                >
                                    {showApiKey ? <EyeOff className="w-4 h-4" /> : <Eye className="w-4 h-4" />}
                                </button>
                            </div>
                        </div>
                    )}
                    {(aiConfig.provider === 'lmstudio' || aiConfig.provider === 'openai') && (
                        <div className="md:col-span-2">
                            <label className={labelClass}>{t('aiAnalysis.apiEndpoint')}</label>
                            <input
                                type="text"
                                value={aiConfig.api_endpoint}
                                onChange={(e) => setAiConfig({ ...aiConfig, api_endpoint: e.target.value })}
                                className={inputClass}
                                placeholder="http://localhost:1234/v1"
                            />
                        </div>
                    )}
                    <div className="md:col-span-2 grid grid-cols-2 gap-4">
                        <div>
                            <label className={labelClass}>{t('aiAnalysis.concurrency')}</label>
                            <input
                                type="number"
                                value={aiConfig.concurrent_requests}
                                onChange={(e) => setAiConfig({ ...aiConfig, concurrent_requests: parseInt(e.target.value) || 1 })}
                                min={1} max={50}
                                className={inputClass}
                            />
                        </div>
                        <div>
                            <label className={labelClass}>{t('aiAnalysis.batchSize')}</label>
                            <input
                                type="number"
                                value={aiConfig.enrichment_batch_size}
                                onChange={(e) => setAiConfig({ ...aiConfig, enrichment_batch_size: parseInt(e.target.value) || 1 })}
                                min={1} max={100}
                                className={inputClass}
                            />
                        </div>
                    </div>
                </div>
            </div>

            {/* 2. Run Analysis & Status */}
            <div className="grid grid-cols-1 gap-6">
                {/* Execution Card */}
                <div className="bg-gradient-to-br from-indigo-600 to-violet-700 rounded-2xl p-6 text-white shadow-lg flex flex-col justify-between min-h-[200px]">
                    <div className="flex justify-between items-start">
                        <div>
                            <h2 className="text-2xl font-bold flex items-center gap-2 mb-2">
                                <Play className="w-6 h-6" />
                                {t('aiAnalysis.runAnalysis')}
                            </h2>
                            <p className="text-indigo-100 opacity-90">
                                {t('aiAnalysis.target')}: {scope.projectName} ({scope.nodeType.toUpperCase()})
                            </p>
                            <div className="flex gap-2 mt-2 flex-wrap">
                                <span className="px-2 py-1 bg-white/20 rounded text-xs backdrop-blur-sm">
                                    {aiConfig.provider}
                                </span>
                                <span className="px-2 py-1 bg-white/20 rounded text-xs backdrop-blur-sm">
                                    {aiConfig.concurrent_requests} Concurrent
                                </span>
                            </div>
                        </div>
                        {status === 'running' && (
                            <button
                                onClick={handleStopAnalysis}
                                className="flex items-center gap-2 px-4 py-2 rounded-lg transition-all text-sm font-bold backdrop-blur-sm shadow-sm border bg-rose-500/20 hover:bg-rose-500/40 border-rose-400/50 text-rose-100"
                            >
                                <Square className="w-4 h-4 fill-current" />
                                {t('aiAnalysis.stopAnalysis')}
                            </button>
                        )}
                    </div>

                    <button
                        onClick={handleRunAnalysis}
                        disabled={status === 'running' || !scope.projectName}
                        className={`mt-6 w-full py-3.5 bg-white text-indigo-600 rounded-xl font-bold shadow-lg hover:shadow-xl hover:bg-indigo-50 transition-all transform active:scale-[0.98] ${status === 'running' ? 'opacity-70 cursor-wait' : ''
                            }`}
                    >
                        {status === 'running' ? (
                            <span className="flex items-center justify-center gap-2">
                                <RotateCw className="w-5 h-5 animate-spin" /> {t('aiAnalysis.analyzing')}
                            </span>
                        ) : t('aiAnalysis.startAnalysis')}
                    </button>
                </div>

                {/* Analysis Status Panel */}
                <div className="bg-white rounded-2xl shadow-sm border border-slate-100 p-6">
                    <h3 className="text-lg font-bold text-slate-900 mb-4 flex items-center gap-2">
                        <ActivityIcon className="w-5 h-5 text-indigo-600" />
                        {t('analysis.analysisStatus')}
                    </h3>

                    {
                        jobId ? (
                            <div className="space-y-4">
                                <div className="grid grid-cols-1 md:grid-cols-2 gap-4">
                                    <div className="p-4 bg-slate-50 rounded-xl border border-slate-100">
                                        <div className="text-xs text-slate-500 uppercase tracking-wider font-semibold mb-1">{t('analysis.jobId')}</div>
                                        <div className="font-mono text-xs text-slate-700 break-all">{jobId}</div>
                                    </div>

                                    <div className="flex items-center gap-3 p-4 bg-indigo-50 rounded-xl border border-indigo-100">
                                        {status === 'completed' || status === 'success' ? (
                                            <CheckCircle className="w-5 h-5 text-emerald-500" />
                                        ) : status === 'failed' || status === 'error' ? (
                                            <AlertCircle className="w-5 h-5 text-red-500" />
                                        ) : status === 'cancelled' ? (
                                            <XCircle className="w-5 h-5 text-slate-500" />
                                        ) : (
                                            <Loader2 className="w-5 h-5 text-indigo-500 animate-spin" />
                                        )}
                                        <div>
                                            <div className="text-xs text-indigo-600 uppercase tracking-wider font-semibold">{t('analysis.currentStatus')}</div>
                                            <div className="font-bold text-indigo-900 capitalize">{status || 'Pending...'}</div>
                                        </div>
                                    </div>
                                </div>

                                {/* Progress Bar */}
                                {(status === 'running' || status === 'pending') && progress && (
                                    <div className="w-full bg-white p-4 rounded-xl border border-slate-200 shadow-sm">
                                        <div className="flex justify-between text-xs text-slate-600 mb-2 font-medium">
                                            <div className="flex items-center gap-2">
                                                <Loader2 className="w-3 h-3 animate-spin text-indigo-600" />
                                                <span>Processing... {progress.current}/{progress.total}</span>
                                            </div>
                                            <span className="text-indigo-600 font-bold">{progress.percent}%</span>
                                        </div>
                                        <div className="w-full bg-slate-100 rounded-full h-2 overflow-hidden">
                                            <div
                                                className="bg-indigo-600 h-2 rounded-full transition-all duration-500 ease-out shadow-[0_0_10px_rgba(79,70,229,0.3)]"
                                                style={{ width: `${progress.percent}%` }}
                                            ></div>
                                        </div>
                                        <div className="mt-2 text-[10px] text-slate-400 truncate font-mono">
                                            {progress.raw}
                                        </div>
                                    </div>
                                )}

                                {/* Log Actions */}
                                <div className="flex gap-3 pt-2">
                                    <button
                                        onClick={() => setShowLogModal(true)}
                                        className="flex-1 flex items-center justify-center gap-2 py-2.5 px-4 bg-white border border-slate-200 text-slate-700 rounded-xl hover:bg-slate-50 hover:text-indigo-600 transition-colors text-sm font-medium shadow-sm"
                                    >
                                        <FileText className="w-4 h-4" />
                                        {t('analysis.viewLogs')}
                                    </button>
                                    <button
                                        onClick={() => setShowSummaryModal(true)}
                                        disabled={status !== 'completed' && status !== 'success'} // Backend sends 'completed'
                                        className={`flex-1 flex items-center justify-center gap-2 py-2.5 px-4 rounded-xl transition-all text-sm font-medium shadow-md ${status === 'completed' || status === 'success'
                                            ? 'bg-indigo-600 text-white hover:bg-indigo-700 shadow-indigo-200'
                                            : 'bg-slate-100 text-slate-400 cursor-not-allowed shadow-none'
                                            }`}
                                    >
                                        <List className="w-4 h-4" />
                                        {t('analysis.viewResultSummary')}
                                    </button>
                                </div>
                            </div>
                        ) : (
                            <div className="text-center py-8 text-slate-400">
                                <FileCode className="w-12 h-12 mx-auto mb-3 opacity-20" />
                                <p className="text-sm">{t('analysis.noAnalysisRunning')}</p>
                            </div>
                        )
                    }
                </div>
            </div>

            {/* Log Modal */}
            {showLogModal && (
                <div className="fixed inset-0 z-50 flex items-center justify-center p-4 bg-slate-900/50 backdrop-blur-sm">
                    <div className="bg-white rounded-2xl shadow-2xl w-full max-w-5xl h-[80vh] flex flex-col overflow-hidden animate-in fade-in zoom-in duration-200">
                        <div className="flex items-center justify-between p-4 border-b border-slate-100 bg-slate-50/50">
                            <div className="flex items-center gap-4">
                                <h3 className="font-bold text-lg text-slate-800 flex items-center gap-2">
                                    <FileText className="w-5 h-5 text-indigo-600" />
                                    {t('analysis.analysisLogs')}
                                </h3>
                                {jobId && (
                                    <div className="px-3 py-1 bg-slate-100 rounded-full border border-slate-200 text-xs font-mono text-slate-500">
                                        ID: {jobId}
                                    </div>
                                )}
                            </div>
                            <div className="flex items-center gap-2">
                                <button
                                    onClick={handleDownloadLogs}
                                    className="flex items-center gap-2 px-3 py-1.5 bg-white border border-slate-200 text-slate-600 rounded-lg hover:bg-slate-50 hover:text-indigo-600 transition-colors text-sm font-medium shadow-sm"
                                    title={t('analysis.saveLog')}
                                >
                                    <Download className="w-4 h-4" />
                                    <span className="hidden sm:inline">{t('analysis.saveLog')}</span>
                                </button>
                                <button
                                    onClick={() => setShowLogModal(false)}
                                    className="p-2 text-slate-400 hover:text-slate-600 hover:bg-slate-100 rounded-lg transition-colors"
                                >
                                    <X className="w-5 h-5" />
                                </button>
                            </div>
                        </div>
                        <div className="flex-1 p-0 overflow-hidden bg-slate-900">
                            <div className="h-full overflow-y-auto p-4 font-mono text-xs md:text-sm leading-relaxed">
                                {logs.length === 0 ? (
                                    <div className="text-slate-500 italic text-center py-20">{t('analysis.waitingForLogs')}</div>
                                ) : (
                                    <div className="flex flex-col">
                                        {logs.map((log, index) => (
                                            <div key={index} className="flex hover:bg-slate-800/50">
                                                <span className="shrink-0 w-10 text-right mr-4 text-slate-600 select-none border-r border-slate-700 pr-2 block">
                                                    {index + 1}
                                                </span>
                                                <span className={`whitespace-pre-wrap break-all flex-1 ${log.toUpperCase().includes('ERROR') || log.includes('실패') ? 'text-rose-400' : 'text-emerald-400'}`}>
                                                    {log}
                                                </span>
                                            </div>
                                        ))}
                                        <div ref={logsEndRef} />
                                    </div>
                                )}
                            </div>
                        </div>
                        <div className="p-4 border-t border-slate-100 bg-slate-50 flex items-end gap-4">
                            {/* Progress Bar in Modal */}
                            {(status === 'running' || status === 'pending') && progress ? (
                                <div className="flex-1 bg-white p-3 rounded-xl border border-slate-200 shadow-sm">
                                    <div className="flex justify-between text-xs text-slate-600 mb-2 font-medium">
                                        <div className="flex items-center gap-2">
                                            <Loader2 className="w-3 h-3 animate-spin text-indigo-600" />
                                            <span>Processing... {progress.current}/{progress.total}</span>
                                        </div>
                                        <span className="text-indigo-600 font-bold">{progress.percent}%</span>
                                    </div>
                                    <div className="w-full bg-slate-100 rounded-full h-2 overflow-hidden mb-2">
                                        <div
                                            className="bg-indigo-600 h-2 rounded-full transition-all duration-500 ease-out shadow-[0_0_10px_rgba(79,70,229,0.3)]"
                                            style={{ width: `${progress.percent}%` }}
                                        ></div>
                                    </div>
                                    <div className="text-[10px] text-slate-400 truncate font-mono">
                                        {progress.raw}
                                    </div>
                                </div>
                            ) : (
                                <div className="flex-1"></div>
                            )}
                            <button
                                onClick={() => setShowLogModal(false)}
                                className="px-6 py-3 bg-white border border-slate-200 text-slate-700 rounded-xl hover:bg-slate-50 text-sm font-bold shadow-sm h-fit whitespace-nowrap"
                            >
                                {t('analysis.close')}
                            </button>
                        </div>
                    </div>
                </div>
            )}

            {/* Summary Modal */}
            {showSummaryModal && (
                <div className="fixed inset-0 z-50 flex items-center justify-center p-4 bg-slate-900/50 backdrop-blur-sm">
                    <div className="bg-white rounded-2xl shadow-2xl w-full max-w-5xl h-[80vh] flex flex-col overflow-hidden animate-in fade-in zoom-in duration-200">
                        <div className="flex items-center justify-between p-4 border-b border-slate-100 bg-slate-50/50">
                            <div className="flex items-center gap-4">
                                <h3 className="font-bold text-lg text-slate-800 flex items-center gap-2">
                                    <List className="w-5 h-5 text-indigo-600" />
                                    {t('analysis.resultSummary')}
                                </h3>
                            </div>
                            <div className="flex items-center gap-2">
                                <button
                                    onClick={handleDownloadSummary}
                                    className="flex items-center gap-2 px-3 py-1.5 bg-white border border-slate-200 text-slate-600 rounded-lg hover:bg-slate-50 hover:text-indigo-600 transition-colors text-sm font-medium shadow-sm"
                                    title={t('analysis.saveSummary')}
                                >
                                    <Download className="w-4 h-4" />
                                    <span className="hidden sm:inline">{t('analysis.saveSummary')}</span>
                                </button>
                                <button
                                    onClick={() => setShowSummaryModal(false)}
                                    className="p-2 text-slate-400 hover:text-slate-600 hover:bg-slate-100 rounded-lg transition-colors"
                                >
                                    <X className="w-5 h-5" />
                                </button>
                            </div>
                        </div>
                        <div className="flex-1 p-0 overflow-hidden bg-slate-900">
                            <div className="h-full overflow-y-auto p-4 font-mono text-xs md:text-sm leading-relaxed text-emerald-400">
                                {getAnalysisSummary().split('\n').map((line, index) => (
                                    <div key={index} className="flex hover:bg-slate-800/50">
                                        <span className="shrink-0 w-10 text-right mr-4 text-slate-600 select-none border-r border-slate-700 pr-2 block">
                                            {index + 1}
                                        </span>
                                        <span className="whitespace-pre-wrap break-all flex-1">
                                            {line || '\u00A0'}
                                        </span>
                                    </div>
                                ))}
                            </div>
                        </div>
                        <div className="p-4 border-t border-slate-100 bg-slate-50 flex justify-end">
                            <button
                                onClick={() => setShowSummaryModal(false)}
                                className="px-4 py-2 bg-indigo-600 text-white rounded-lg hover:bg-indigo-700 text-sm font-medium shadow-sm transition-colors"
                            >
                                {t('analysis.close')}
                            </button>
                        </div>
                    </div>
                </div>
            )}
        </div>
    );
};

export default CodeAiAnalysis;
