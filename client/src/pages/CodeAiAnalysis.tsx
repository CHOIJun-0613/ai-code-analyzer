import React, { useState, useEffect, useRef } from 'react';
import { useTranslation } from 'react-i18next';
import client from '../api/client';
import {
    Save,
    RotateCw,
    Settings as SettingsIcon,
    BrainCircuit,
    Play,
    Terminal,
    AlertCircle,
    CheckCircle2,
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
    XCircle
} from 'lucide-react';

// Shared styling classes
const cardClass = "bg-white p-6 rounded-2xl shadow-sm border border-slate-200 transition-all hover:shadow-md";
const labelClass = "block text-sm font-semibold text-slate-700 mb-2 flex items-center gap-2";
const inputClass = "w-full px-4 py-2.5 bg-slate-50 border border-slate-200 rounded-xl focus:ring-2 focus:ring-indigo-500/20 focus:border-indigo-500 outline-none transition-all duration-200 text-sm";
const radioClass = "w-4 h-4 text-indigo-600 bg-slate-100 border-slate-300 focus:ring-indigo-500";
const descriptionClass = "text-xs text-slate-500 mt-1 ml-1";
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
    const [projects, setProjects] = useState<Project[]>([]);
    const [status, setStatus] = useState<'idle' | 'pending' | 'running' | 'completed' | 'failed' | 'success' | 'error' | 'cancelled' | 'cancelling'>('idle');
    // Unified status: 'idle', 'pending', 'running', 'completed' (backend), 'failed' (backend)
    // Legacy mapping: 'success' -> 'completed', 'error' -> 'failed' if needed

    const [jobId, setJobId] = useState<string>('');
    const [logs, setLogs] = useState<string[]>([]);
    const [isSaving, setIsSaving] = useState(false);

    // Modals
    const [showLogModal, setShowLogModal] = useState(false);
    const [showSummaryModal, setShowSummaryModal] = useState(false);

    // Stop Analysis Confirmation State
    const [stopConfirming, setStopConfirming] = useState(false);
    const stopConfirmTimeoutRef = useRef<NodeJS.Timeout | null>(null);

    const logsEndRef = useRef<HTMLDivElement>(null);

    // Standard local log adder (for client side actions)
    const addLog = (message: string, type: 'info' | 'error' | 'success' = 'info') => {
        // We only use this for initial setup logs or errors before job starts.
        // Once job starts, we rely on server logs.
        const timestamp = new Date().toLocaleTimeString();
        // Since we are now polling server logs, mixed usage is tricky.
        // We'll keep a separate local log state if needed, or just push to logs array if it's empty?
        // Actually, let's keep it simple: "logs" state tracks SERVER logs when job is running.
        // Before job, or for config actions, we can alert or use a separate notification system.
        // For now, to minimize disruption, we'll append to logs but server polling will overwrite/append.
        // We will separate "Client Logs" and "Server Logs"?
        // Analysis.tsx only shows server logs.
        // CodeAiAnalysis previously showed client side logs.
        // We will try to append client logs to the same list, but server polling might reset it if we setLogs(res.data.logs).
        // Best approach: "logs" is for Server Job Logs.
        // Client feedback can use alerts or a separate tiny status area, but let's just use console/alert for client actions to simplify.
        // Or we can just ignore client logs for now as Status Panel is robust.
    };

    // Scroll to bottom of logs
    useEffect(() => {
        if (showLogModal) {
            logsEndRef.current?.scrollIntoView({ behavior: "smooth" });
        }
    }, [logs, showLogModal]);

    // Initial Data Fetch
    useEffect(() => {
        fetchProjects();
        fetchPreferences();
        checkActiveAnalysis();
    }, []);

    // Polling
    useEffect(() => {
        let intervalId: NodeJS.Timeout;

        if (jobId && (status === 'pending' || status === 'running')) {
            intervalId = setInterval(async () => {
                try {
                    // Fetch status
                    const statusRes = await client.get(`/ai/${jobId}`);
                    setStatus(statusRes.data.status); // running, completed, failed

                    // Fetch logs
                    const logsRes = await client.get(`/ai/${jobId}/logs`);
                    if (logsRes.data.logs) {
                        setLogs(logsRes.data.logs);
                    }
                } catch (error) {
                    console.error("Failed to poll status/logs", error);
                }
            }, 3000);
        }

        return () => {
            if (intervalId) clearInterval(intervalId);
        };
    }, [jobId, status]);

    const checkActiveAnalysis = async () => {
        try {
            const res = await client.get('/ai/active');
            if (res.data && res.data.job_id) {
                setJobId(res.data.job_id);
                setStatus(res.data.status);
            }
        } catch (error) {
            // No active job
        }
    };

    const fetchProjects = async () => {
        try {
            const projectsRes = await client.get('/projects/');
            setProjects(projectsRes.data);
            if (projectsRes.data.length > 0) {
                setScope(prev => ({ ...prev, projectName: projectsRes.data[0].name }));
            }
        } catch (err) {
            console.error("Failed to load projects", err);
        }
    };

    const fetchPreferences = async () => {
        try {
            const prefsRes = await client.get('/users/me/preferences/ai');
            if (prefsRes.data) {
                setAiConfig(prev => ({
                    ...prev,
                    use_analysis: true,
                    provider: prefsRes.data.ai_provider || prev.provider,
                    model_name: prefsRes.data.model_name || prev.model_name,
                    api_key: prefsRes.data.api_key || prev.api_key,
                    api_endpoint: prefsRes.data.api_endpoint || prev.api_endpoint,
                    concurrent_requests: prefsRes.data.concurrent_ai_requests || prev.concurrent_requests,
                    enrichment_batch_size: prefsRes.data.ai_enrichment_batch_size || prev.enrichment_batch_size
                }));
            }
        } catch (err) {
            console.error("Failed to load preferences", err);
        }
    };

    const handleSaveSettings = async () => {
        setIsSaving(true);
        try {
            const preferences = {
                use_analysis: true,
                ai_provider: aiConfig.provider,
                model_name: aiConfig.model_name,
                api_key: aiConfig.api_key,
                api_endpoint: aiConfig.api_endpoint,
                concurrent_ai_requests: aiConfig.concurrent_requests,
                ai_enrichment_batch_size: aiConfig.enrichment_batch_size
            };

            await client.put('/users/me/preferences/ai', preferences);
            alert(t('aiAnalysis.configSaveSuccess'));
        } catch (error) {
            console.error("Failed to save settings", error);
            alert(t('aiAnalysis.configSaveFail'));
        } finally {
            setIsSaving(false);
        }
    };

    const handleLoadSettings = () => {
        fetchPreferences();
    };

    const handleRunAnalysis = async () => {
        if (!scope.projectName) {
            alert(t('aiAnalysis.selectProject'));
            return;
        }

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
            // status is already running, polling will take over
        } catch (error: any) {
            console.error("Analysis failed", error);
            setStatus('failed');
            alert(t('aiAnalysis.analysisStartFail', { error: error.response?.data?.detail || error.message }));
        }
    };

    const handleStopAnalysis = async () => {
        if (!jobId) return;

        if (!stopConfirming) {
            setStopConfirming(true);
            // Reset confirmation after 3 seconds
            if (stopConfirmTimeoutRef.current) clearTimeout(stopConfirmTimeoutRef.current);
            stopConfirmTimeoutRef.current = setTimeout(() => {
                setStopConfirming(false);
            }, 3000);
            return;
        }

        // Second click: Confirm stop
        if (stopConfirmTimeoutRef.current) clearTimeout(stopConfirmTimeoutRef.current);
        setStopConfirming(false);

        try {
            console.log(`Requesting cancellation for job: ${jobId}`);
            await client.post(`/ai/${jobId}/cancel`);
            alert("작업 중지 요청이 전송되었습니다.");
        } catch (error) {
            console.error("Failed to stop analysis", error);
            alert("작업 중지 요청 실패");
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
                            disabled={isSaving}
                            className={`px-3 py-1.5 text-xs font-bold text-white bg-slate-800 border border-slate-800 rounded-lg hover:bg-slate-700 transition-all flex items-center gap-1.5 shadow-sm ${isSaving ? 'opacity-70' : ''}`}
                        >
                            {isSaving ? <RotateCw className="w-3.5 h-3.5 animate-spin" /> : <Save className="w-3.5 h-3.5" />}
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
                                className={`flex items-center gap-2 px-4 py-2 rounded-lg transition-all text-sm font-bold backdrop-blur-sm shadow-sm border ${stopConfirming
                                    ? "bg-amber-500/80 hover:bg-amber-600 border-amber-400 text-white animate-pulse"
                                    : "bg-rose-500/20 hover:bg-rose-500/40 border-rose-400/50 text-rose-100"
                                    }`}
                            >
                                <Square className="w-4 h-4 fill-current" />
                                {stopConfirming ? "정말 중지할까요?" : t('aiAnalysis.stopAnalysis')}
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
