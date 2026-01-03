import React, { useState } from 'react';
import { useForm } from 'react-hook-form';
import { zodResolver } from '@hookform/resolvers/zod';
import toast from 'react-hot-toast';
import { useQuery, useQueryClient } from '@tanstack/react-query';
import { useTranslation } from 'react-i18next';
import client from '../api/client';
import { Upload, Folder, Play, FileCode, CheckCircle, AlertCircle, Loader2, Terminal, HelpCircle, Activity as ActivityIcon, X, FileText, List, Download, Database, Square, RotateCw, Rocket, XCircle } from 'lucide-react';
import { useAnalysisWebSocket } from '../hooks/useAnalysisWebSocket';
import { createAnalysisSchema, type AnalysisFormData } from '../schemas/analysisSchema';

const Tooltip: React.FC<{ text: string, position?: string, arrowPosition?: string }> = ({ text, position = "left-1/2 -translate-x-1/2", arrowPosition = "left-1/2 -translate-x-1/2" }) => (
    <div className="group relative flex items-center ml-1">
        <HelpCircle className="w-4 h-4 text-slate-400 cursor-help" />
        <div className={`absolute bottom-full ${position} mb-2 hidden group-hover:block w-64 p-2 bg-slate-800 text-white text-xs rounded shadow-lg z-50 whitespace-pre-wrap leading-relaxed text-left pointer-events-none`}>
            {text}
            <div className={`absolute top-full ${arrowPosition} border-4 border-transparent border-t-slate-800`} />
        </div>
    </div>
);

const Analysis: React.FC = () => {
    const { t } = useTranslation();
    const queryClient = useQueryClient();

    // React Hook Form
    const {
        register,
        formState: { errors },
        reset,
        watch,
        setValue,
    } = useForm<AnalysisFormData>({
        resolver: zodResolver(createAnalysisSchema(t)),
        defaultValues: {
            mode: 'path',
            projectName: '',
            applicationName: '',
            file: undefined,
            sourcePath: '',
            dbScriptPath: '',
            skipDtoSource: true,
            skipDtoMethods: true,
            scope: 'all',
            analysisTarget: 'all',
            saveStrategy: 'delete',
            javaParseWorkers: 8,
            javaFileParseTimeout: 120.0,
            javaComplexityThreshold: 50000,
            sequenceDiagramIncludePackages: '',
            excludePatterns: '',
            logLevel: 'INFO',
        },
    });

    // System/UI State (keep as useState)
    const [jobId, setJobId] = useState('');
    const [status, setStatus] = useState('');
    const [logs, setLogs] = useState<string[]>([]);
    const [isLoading, setIsLoading] = useState(false);
    const [showLogModal, setShowLogModal] = useState(false);
    const [showSummaryModal, setShowSummaryModal] = useState(false);
    const [showConfirmModal, setShowConfirmModal] = useState(false);
    const [showStopConfirmModal, setShowStopConfirmModal] = useState(false);

    const logsEndRef = React.useRef<HTMLDivElement>(null);

    // Watch form values for UI
    const mode = watch('mode');
    const file = watch('file');
    const sourcePath = watch('sourcePath');
    const projectName = watch('projectName');
    const analysisTarget = watch('analysisTarget');
    const saveStrategy = watch('saveStrategy');
    const javaParseWorkers = watch('javaParseWorkers');
    const logLevel = watch('logLevel');

    // Scroll to bottom of logs
    React.useEffect(() => {
        logsEndRef.current?.scrollIntoView({ behavior: "smooth" });
    }, [logs]);

    // React Query: 사용자 설정 조회
    useQuery({
        queryKey: ['users', 'me', 'preferences'],
        queryFn: async () => {
            const res = await client.get('/users/me/preferences');
            if (res.data) {
                // Reset form with preferences
                reset({
                    mode: watch('mode'),
                    projectName: watch('projectName'),
                    applicationName: watch('applicationName'),
                    file: watch('file'),
                    sourcePath: watch('sourcePath'),
                    dbScriptPath: watch('dbScriptPath'),
                    skipDtoSource: res.data.skip_dto_source !== undefined ? res.data.skip_dto_source : true,
                    skipDtoMethods: res.data.skip_dto_methods !== undefined ? res.data.skip_dto_methods : true,
                    scope: res.data.scope !== undefined ? res.data.scope : 'all',
                    analysisTarget: res.data.analysis_target !== undefined ? res.data.analysis_target : 'all',
                    saveStrategy: res.data.save_strategy !== undefined ? res.data.save_strategy : 'delete',
                    javaParseWorkers: res.data.java_parse_workers !== undefined ? res.data.java_parse_workers : 8,
                    javaFileParseTimeout: res.data.java_file_parse_timeout !== undefined ? res.data.java_file_parse_timeout : 120.0,
                    javaComplexityThreshold: res.data.java_complexity_threshold !== undefined ? res.data.java_complexity_threshold : 50000,
                    sequenceDiagramIncludePackages: res.data.sequence_diagram_include_packages !== undefined ? res.data.sequence_diagram_include_packages : '',
                    excludePatterns: res.data.exclude_patterns !== undefined ? res.data.exclude_patterns : '',
                    logLevel: res.data.log_level !== undefined ? res.data.log_level : 'INFO',
                });
            }
            return res.data;
        },
        staleTime: 1 * 60 * 1000, // 1분 캐싱
    });

    // React Query: 활성 분석 작업 조회
    useQuery({
        queryKey: ['analysis', 'active'],
        queryFn: async () => {
            const res = await client.get('/analysis/active');
            if (res.data && res.data.job_id) {
                setJobId(res.data.job_id);
                setStatus(res.data.status);
            }
            return res.data;
        },
        retry: false, // 활성 작업이 없을 수 있으므로 재시도 안 함
        staleTime: 0, // 항상 최신 상태 확인
    });

    // React Query: 활성 작업의 기존 로그 조회
    const { data: initialLogsData } = useQuery({
        queryKey: ['analysis', 'job', jobId, 'logs'],
        queryFn: async () => {
            const res = await client.get(`/analysis/analyze/${jobId}/logs`);
            return res.data;
        },
        enabled: !!jobId && logs.length === 0, // jobId가 있고 현재 로그가 없을 때만 실행
        staleTime: 0,
    });

    // 초기 로그 데이터 로드 시 상태 업데이트
    React.useEffect(() => {
        if (initialLogsData && initialLogsData.logs && logs.length === 0) {
            setLogs(initialLogsData.logs);
        }
    }, [initialLogsData, logs.length]);

    // WebSocket Hook for real-time monitoring
    useAnalysisWebSocket({
        jobId,
        jobType: 'analysis',
        onLog: (log) => {
            setLogs((prev) => [...prev, log]);
        },
        onStatus: (newStatus) => {
            setStatus(newStatus);
        },
        onProgress: (progress) => {
            // Progress is extracted from logs, no need to handle separately
            console.debug('Progress:', progress);
        },
        onComplete: (data) => {
            setStatus(data.status);
            console.log('Analysis complete:', data);
            if (data.status === 'completed' || data.status === 'success') {
                toast.success(t('analysis.analysisComplete') || "Analysis completed successfully!");
            } else if (data.status === 'failed' || data.status === 'error') {
                toast.error(t('analysis.analysisFailed') || "Analysis failed.");
            }
        },
        onError: (error) => {
            console.error('WebSocket error:', error);
            // Continue using the app, error is logged
        }
    });

    const handleFileChange = (e: React.ChangeEvent<HTMLInputElement>) => {
        if (e.target.files && e.target.files[0]) {
            setValue('file', e.target.files[0]);
        }
    };

    const getAnalysisSummary = () => {
        if (!logs || logs.length === 0) return t('analysis.waitingForLogs');

        // Find the start of the summary
        const summaryStartIndex = logs.findIndex(log => log.includes('분석 작업 결과') || log.includes('ANALYSIS SUMMARY'));

        return summaryStartIndex !== -1 ? logs.slice(summaryStartIndex).join('\n') : t('analysis.waitingForLogs');
    };

    const extractProgress = () => {
        if (!logs || logs.length === 0) return null;
        for (let i = logs.length - 1; i >= 0; i--) {
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
        element.download = `analysis_log_${jobId || 'unknown'}.txt`;
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
        // Use analysis-summary-{jobID}.txt
        element.download = `analysis_summary_${jobId || 'unknown'}.txt`;
        document.body.appendChild(element);
        element.click();
        document.body.removeChild(element);
    };

    const handleConfirmation = (e: React.FormEvent) => {
        e.preventDefault();
        setShowConfirmModal(true);
    };

    const handleLoadSettings = async () => {
        try {
            // Invalidate query to refetch
            await queryClient.invalidateQueries({ queryKey: ['users', 'me', 'preferences'] });
            toast.success(t('analysis.settingsLoaded') || "Settings loaded successfully!");
        } catch (err) {
            console.error("Failed to load preferences", err);
            toast.error(t('analysis.settingsLoadFailed') || "Failed to load settings.");
        }
    };

    const handleSaveSettings = async () => {
        try {
            const formData = watch();
            const preferences = {
                skip_dto_source: formData.skipDtoSource,
                skip_dto_methods: formData.skipDtoMethods,
                scope: formData.scope,
                java_parse_workers: formData.javaParseWorkers,
                java_file_parse_timeout: formData.javaFileParseTimeout,
                java_complexity_threshold: formData.javaComplexityThreshold,
                sequence_diagram_include_packages: formData.sequenceDiagramIncludePackages,
                exclude_patterns: formData.excludePatterns,
                log_level: formData.logLevel,
                analysis_target: formData.analysisTarget,
                save_strategy: formData.saveStrategy
            };
            await client.put('/users/me/preferences', preferences);
            toast.success(t('analysis.configSaved') || "Configuration saved successfully!");
        } catch (err) {
            console.error("Failed to save preferences", err);
            toast.error(t('analysis.configSaveFailed') || "Failed to save configuration.");
        }
    };

    const executeAnalysis = async () => {
        setShowConfirmModal(false);
        setIsLoading(true);
        setLogs([]);

        const formData = watch();

        // Save preferences
        try {
            const preferences = {
                skip_dto_source: formData.skipDtoSource,
                skip_dto_methods: formData.skipDtoMethods,
                scope: formData.scope,
                java_parse_workers: formData.javaParseWorkers,
                java_file_parse_timeout: formData.javaFileParseTimeout,
                java_complexity_threshold: formData.javaComplexityThreshold,
                sequence_diagram_include_packages: formData.sequenceDiagramIncludePackages,
                exclude_patterns: formData.excludePatterns,
                log_level: formData.logLevel,
                analysis_target: formData.analysisTarget,
                save_strategy: formData.saveStrategy
            };
            await client.put('/users/me/preferences', preferences);
        } catch (err) {
            console.error("Failed to save preferences", err);
        }

        try {
            let response;
            if (formData.mode === 'upload' && formData.file) {
                const uploadFormData = new FormData();
                uploadFormData.append('file', formData.file);
                if (formData.projectName) uploadFormData.append('project_name', formData.projectName);
                if (formData.applicationName) uploadFormData.append('application_name', formData.applicationName);

                // Save Strategy
                if (formData.saveStrategy === 'delete') {
                    uploadFormData.append('clean', 'true');
                    uploadFormData.append('update', 'false');
                } else {
                    uploadFormData.append('clean', 'false');
                    uploadFormData.append('update', 'true');
                }

                // Analysis Target
                if (formData.analysisTarget === 'program') {
                    uploadFormData.append('java_object', 'true');
                    uploadFormData.append('db_object', 'false');
                    uploadFormData.append('all_objects', 'false');
                } else if (formData.analysisTarget === 'db') {
                    uploadFormData.append('java_object', 'false');
                    uploadFormData.append('db_object', 'true');
                    uploadFormData.append('all_objects', 'false');
                } else {
                    uploadFormData.append('all_objects', 'true');
                }

                // Advanced Source Options
                uploadFormData.append('use_streaming_parse', 'true');
                uploadFormData.append('java_parse_workers', String(formData.javaParseWorkers));
                uploadFormData.append('java_file_parse_timeout', String(formData.javaFileParseTimeout));
                uploadFormData.append('java_complexity_threshold', String(formData.javaComplexityThreshold));
                if (formData.sequenceDiagramIncludePackages) uploadFormData.append('sequence_diagram_include_packages', formData.sequenceDiagramIncludePackages);
                if (formData.excludePatterns) uploadFormData.append('exclude_patterns', formData.excludePatterns);
                uploadFormData.append('log_level', formData.logLevel);

                // Advanced AI Options - DISABLING AI
                uploadFormData.append('use_ai_analysis', 'false');
                uploadFormData.append('use_ai', 'false');

                // Standard Options
                uploadFormData.append('skip_dto_source', String(formData.skipDtoSource));
                uploadFormData.append('skip_dto_methods', String(formData.skipDtoMethods));
                uploadFormData.append('scope', formData.scope);

                response = await client.post('/analysis/analyze/upload', uploadFormData);
            } else {
                const payload: any = {
                    source_folder: formData.sourcePath,
                    project_name: formData.projectName,
                    application_name: formData.applicationName,
                    db_script_path: formData.dbScriptPath,

                    // Save Strategy
                    clean: formData.saveStrategy === 'delete',
                    update: formData.saveStrategy === 'update',

                    // Analysis Target
                    java_object: formData.analysisTarget === 'program' || formData.analysisTarget === 'all',
                    db_object: formData.analysisTarget === 'db' || formData.analysisTarget === 'all',
                    all_objects: formData.analysisTarget === 'all',

                    // Advanced Source Options
                    use_streaming_parse: true,
                    java_parse_workers: formData.javaParseWorkers,
                    java_file_parse_timeout: formData.javaFileParseTimeout,
                    java_complexity_threshold: formData.javaComplexityThreshold,
                    sequence_diagram_include_packages: formData.sequenceDiagramIncludePackages,
                    exclude_patterns: formData.excludePatterns,
                    log_level: formData.logLevel,

                    // Advanced AI Options - DISABLING AI
                    use_ai_analysis: false,
                    use_ai: false, // Backward compatibility

                    // Standard Options
                    skip_dto_source: formData.skipDtoSource,
                    skip_dto_methods: formData.skipDtoMethods,
                    scope: formData.scope
                };

                response = await client.post('/analysis/analyze', payload);
            }
            setJobId(response.data.job_id);
            setStatus(response.data.status);
            toast.success(t('analysis.startSuccess') || "Analysis started successfully.");
        } catch (error) {
            console.error("Analysis request failed", error);
            toast.error(t('analysis.startFailed') || "Failed to start analysis");
        } finally {
            setIsLoading(false);
        }
    };

    const handleStopAnalysis = (e: React.MouseEvent) => {
        e.preventDefault();
        if (!jobId) return;
        setShowStopConfirmModal(true);
    };

    const executeStopAnalysis = async () => {
        if (!jobId) return;
        try {
            await client.post(`/analysis/analyze/${jobId}/cancel`);
            toast.success(t('analysis.stopSuccess') || "Analysis stopped successfully.");
            setShowStopConfirmModal(false);
        } catch (error) {
            console.error("Failed to stop analysis", error);
            toast.error(t('analysis.stopFailed') || "Failed to stop analysis.");
        }
    };

    return (
        <div className="max-w-4xl mx-auto space-y-8">
            <div className="flex items-center gap-3">
                <div className="p-3 bg-indigo-50 dark:bg-indigo-500/10 rounded-xl">
                    <FileCode className="w-8 h-8 text-indigo-600 dark:text-indigo-400" />
                </div>
                <div>
                    <h1 className="text-3xl font-bold text-slate-900 dark:text-white">{t('analysis.title')}</h1>
                    <p className="text-slate-500 dark:text-slate-400 mt-1">{t('analysis.subtitle')}</p>
                </div>
            </div>

            <div className="text-sm text-slate-600 dark:text-slate-300 bg-slate-50 dark:bg-slate-900 border border-slate-200 dark:border-slate-800 rounded-xl p-4">
                <span className="font-bold text-indigo-600 dark:text-indigo-400 mr-2">* {t('analysis.tip')}:</span>
                {t('analysis.proTipContent')}
            </div>



            {/* Log Modal */}
            {showLogModal && (
                <div className="fixed inset-0 z-50 flex items-center justify-center p-4 bg-slate-900/50 backdrop-blur-sm">
                    <div className="bg-white dark:bg-slate-900 rounded-2xl shadow-2xl w-full max-w-5xl h-[80vh] flex flex-col overflow-hidden animate-in fade-in zoom-in duration-200 border dark:border-slate-800">
                        <div className="flex items-center justify-between p-4 border-b border-slate-100 dark:border-slate-800 bg-slate-50/50 dark:bg-slate-950/50">
                            <div className="flex items-center gap-4">
                                <h3 className="font-bold text-lg text-slate-800 dark:text-slate-100 flex items-center gap-2">
                                    <FileText className="w-5 h-5 text-indigo-600 dark:text-indigo-400" />
                                    {t('analysis.analysisLogs')}
                                </h3>
                                {jobId && (
                                    <div className="px-3 py-1 bg-slate-100 dark:bg-slate-800 rounded-full border border-slate-200 dark:border-slate-700 text-xs font-mono text-slate-500 dark:text-slate-400">
                                        ID: {jobId}
                                    </div>
                                )}
                            </div>
                            <div className="flex items-center gap-2">
                                <button
                                    onClick={handleDownloadLogs}
                                    className="flex items-center gap-2 px-3 py-1.5 bg-white dark:bg-slate-800 border border-slate-200 dark:border-slate-700 text-slate-600 dark:text-slate-300 rounded-lg hover:bg-slate-50 dark:hover:bg-slate-700 hover:text-indigo-600 dark:hover:text-indigo-400 transition-colors text-sm font-medium shadow-sm"
                                    title={t('analysis.saveLog')}
                                >
                                    <Download className="w-4 h-4" />
                                    <span className="hidden sm:inline">{t('analysis.saveLog')}</span>
                                </button>
                                <button
                                    onClick={() => setShowLogModal(false)}
                                    className="p-2 text-slate-400 hover:text-slate-600 dark:hover:text-slate-200 hover:bg-slate-100 dark:hover:bg-slate-800 rounded-lg transition-colors"
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
                                                <span className="text-emerald-400 whitespace-pre-wrap break-all flex-1">
                                                    {log}
                                                </span>
                                            </div>
                                        ))}
                                        <div ref={logsEndRef} />
                                    </div>
                                )}
                            </div>
                        </div>
                        <div className="p-4 border-t border-slate-100 dark:border-slate-800 bg-slate-50 dark:bg-slate-900 flex flex-col gap-4">
                            {/* Progress Bar */}
                            {(status === 'running' || status === 'pending') && progress && (
                                <div className="w-full bg-white dark:bg-slate-800 p-3 rounded-xl border border-slate-200 dark:border-slate-700 shadow-sm">
                                    <div className="flex justify-between text-xs text-slate-600 dark:text-slate-400 mb-2 font-medium">
                                        <div className="flex items-center gap-2">
                                            <Loader2 className="w-3 h-3 animate-spin text-indigo-600 dark:text-indigo-400" />
                                            <span>Processing... {progress.current}/{progress.total}</span>
                                        </div>
                                        <span className="text-indigo-600 dark:text-indigo-400 font-bold">{progress.percent}%</span>
                                    </div>
                                    <div className="w-full bg-slate-100 dark:bg-slate-700 rounded-full h-2 overflow-hidden">
                                        <div
                                            className="bg-indigo-600 dark:bg-indigo-500 h-2 rounded-full transition-all duration-500 ease-out shadow-[0_0_10px_rgba(79,70,229,0.3)]"
                                            style={{ width: `${progress.percent}%` }}
                                        ></div>
                                    </div>
                                    <div className="mt-2 text-[10px] text-slate-400 truncate font-mono">
                                        {progress.raw}
                                    </div>
                                </div>
                            )}
                            <div className="flex justify-end">
                                <button
                                    onClick={() => setShowLogModal(false)}
                                    className="px-4 py-2 bg-white border border-slate-200 text-slate-700 rounded-lg hover:bg-slate-50 text-sm font-medium shadow-sm"
                                >
                                    {t('analysis.close')}
                                </button>
                            </div>
                        </div>
                    </div>
                </div>
            )}

            {/* Summary Modal */}
            {showSummaryModal && (
                <div className="fixed inset-0 z-50 flex items-center justify-center p-4 bg-slate-900/50 backdrop-blur-sm">
                    <div className="bg-white dark:bg-slate-900 rounded-2xl shadow-2xl w-full max-w-5xl h-[80vh] flex flex-col overflow-hidden animate-in fade-in zoom-in duration-200 border dark:border-slate-800">
                        <div className="flex items-center justify-between p-4 border-b border-slate-100 dark:border-slate-800 bg-slate-50/50 dark:bg-slate-950/50">
                            <div className="flex items-center gap-4">
                                <h3 className="font-bold text-lg text-slate-800 dark:text-slate-100 flex items-center gap-2">
                                    <List className="w-5 h-5 text-indigo-600 dark:text-indigo-400" />
                                    {t('analysis.resultSummary')}
                                </h3>
                            </div>
                            <div className="flex items-center gap-2">
                                <button
                                    onClick={handleDownloadSummary}
                                    className="flex items-center gap-2 px-3 py-1.5 bg-white dark:bg-slate-800 border border-slate-200 dark:border-slate-700 text-slate-600 dark:text-slate-300 rounded-lg hover:bg-slate-50 dark:hover:bg-slate-700 hover:text-indigo-600 dark:hover:text-indigo-400 transition-colors text-sm font-medium shadow-sm"
                                    title={t('analysis.saveSummary')}
                                >
                                    <Download className="w-4 h-4" />
                                    <span className="hidden sm:inline">{t('analysis.saveSummary')}</span>
                                </button>
                                <button
                                    onClick={() => setShowSummaryModal(false)}
                                    className="p-2 text-slate-400 hover:text-slate-600 dark:hover:text-slate-200 hover:bg-slate-100 dark:hover:bg-slate-800 rounded-lg transition-colors"
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
                        <div className="p-4 border-t border-slate-100 dark:border-slate-800 bg-slate-50 dark:bg-slate-900 flex justify-end">
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

            {/* Main Form */}
            <div className="space-y-6">
                <div className="bg-white dark:bg-slate-900 rounded-2xl shadow-sm border border-slate-100 dark:border-slate-800 overflow-hidden">
                    <div className="flex border-b border-slate-100 dark:border-slate-800">
                        <button
                            type="button"
                            onClick={() => setValue('mode', 'path')}
                            className={`flex-1 py-4 text-sm font-medium flex items-center justify-center gap-2 transition-colors ${mode === 'path'
                                ? 'bg-indigo-50 dark:bg-indigo-900/20 text-indigo-600 dark:text-indigo-400 border-b-2 border-indigo-600 dark:border-indigo-400'
                                : 'text-slate-500 dark:text-slate-400 hover:bg-slate-50 dark:hover:bg-slate-800'
                                }`}
                        >
                            <Folder className="w-4 h-4" /> {t('analysis.serverPath')}
                        </button>
                        <button
                            type="button"
                            onClick={() => setValue('mode', 'upload')}
                            className={`flex-1 py-4 text-sm font-medium flex items-center justify-center gap-2 transition-colors ${mode === 'upload'
                                ? 'bg-indigo-50 dark:bg-indigo-900/20 text-indigo-600 dark:text-indigo-400 border-b-2 border-indigo-600 dark:border-indigo-400'
                                : 'text-slate-500 dark:text-slate-400 hover:bg-slate-50 dark:hover:bg-slate-800'
                                }`}
                        >
                            <Upload className="w-4 h-4" /> {t('analysis.uploadZip')}
                        </button>
                    </div>

                    <form onSubmit={handleConfirmation} className="p-6 space-y-6">
                        <div className="grid grid-cols-1 md:grid-cols-2 gap-6">
                            <div>
                                <label className="block text-sm font-semibold text-slate-700 dark:text-slate-300 mb-2">{t('analysis.projectName')} <span className="text-slate-400 font-normal">{t('analysis.optional')}</span></label>
                                <input
                                    type="text"
                                    placeholder={t('analysis.projectNamePlaceholder')}
                                    {...register('projectName')}
                                    className="w-full px-4 py-2.5 rounded-xl border border-slate-200 dark:border-slate-700 bg-white dark:bg-slate-900 text-slate-800 dark:text-white focus:border-indigo-500 focus:ring-4 focus:ring-indigo-500/10 transition-all duration-200 outline-none"
                                />
                            </div>
                            <div>
                                <label className="block text-sm font-semibold text-slate-700 dark:text-slate-300 mb-2">{t('analysis.applicationName')} <span className="text-slate-400 font-normal">{t('analysis.optional')}</span></label>
                                <input
                                    type="text"
                                    placeholder={t('analysis.applicationNamePlaceholder')}
                                    {...register('applicationName')}
                                    maxLength={30}
                                    className="w-full px-4 py-2.5 rounded-xl border border-slate-200 dark:border-slate-700 bg-white dark:bg-slate-900 text-slate-800 dark:text-white focus:border-indigo-500 focus:ring-4 focus:ring-indigo-500/10 transition-all duration-200 outline-none"
                                />
                                {errors.applicationName && (
                                    <p className="text-sm text-red-600 mt-1">{errors.applicationName.message}</p>
                                )}
                            </div>
                        </div>

                        {mode === 'upload' ? (
                            <div>
                                <label className="block text-sm font-semibold text-slate-700 dark:text-slate-300 mb-2">{t('analysis.sourceFile')}</label>
                                <div className="border-2 border-dashed border-slate-200 dark:border-slate-700 rounded-xl p-8 text-center hover:border-indigo-400 hover:bg-indigo-50/30 dark:hover:bg-indigo-900/10 transition-all duration-200 group cursor-pointer relative">
                                    <input
                                        type="file"
                                        accept=".zip"
                                        onChange={handleFileChange}
                                        className="absolute inset-0 w-full h-full opacity-0 cursor-pointer"
                                    />
                                    <div className="w-12 h-12 bg-indigo-100 dark:bg-indigo-900/50 text-indigo-600 dark:text-indigo-400 rounded-full flex items-center justify-center mx-auto mb-4 group-hover:scale-110 transition-transform">
                                        <Upload className="w-6 h-6" />
                                    </div>
                                    <p className="text-sm font-medium text-slate-700 dark:text-slate-300">
                                        {file ? file.name : t('analysis.clickToUpload')}
                                    </p>
                                    <p className="text-xs text-slate-400 mt-1">{t('analysis.zipFilesOnly')}</p>
                                </div>
                                {errors.file && (
                                    <p className="text-sm text-red-600 mt-1">{errors.file.message}</p>
                                )}
                            </div>
                        ) : (
                            <div>
                                <label className="block text-sm font-semibold text-slate-700 dark:text-slate-300 mb-2">{t('analysis.serverSourcePath')}</label>
                                <div className="relative mb-4">
                                    <div className="absolute inset-y-0 left-0 pl-3 flex items-center pointer-events-none">
                                        <Terminal className="h-5 w-5 text-slate-400" />
                                    </div>
                                    <input
                                        type="text"
                                        placeholder={t('analysis.serverSourcePathPlaceholder')}
                                        {...register('sourcePath')}
                                        className="w-full pl-10 pr-4 py-2.5 rounded-xl border border-slate-200 dark:border-slate-700 bg-white dark:bg-slate-900 text-slate-800 dark:text-white focus:border-indigo-500 focus:ring-4 focus:ring-indigo-500/10 transition-all duration-200 outline-none font-mono text-sm"
                                    />
                                </div>
                                {errors.sourcePath && (
                                    <p className="text-sm text-red-600 mt-1 mb-4">{errors.sourcePath.message}</p>
                                )}
                                <label className="block text-sm font-semibold text-slate-700 dark:text-slate-300 mb-2">{t('analysis.dbScriptPath')}</label>
                                <div className="relative">
                                    <div className="absolute inset-y-0 left-0 pl-3 flex items-center pointer-events-none">
                                        <Database className="h-5 w-5 text-slate-400" />
                                    </div>
                                    <input
                                        type="text"
                                        placeholder={t('analysis.dbScriptPathPlaceholder')}
                                        {...register('dbScriptPath')}
                                        className="w-full pl-10 pr-4 py-2.5 rounded-xl border border-slate-200 dark:border-slate-700 bg-white dark:bg-slate-900 text-slate-800 dark:text-white focus:border-indigo-500 focus:ring-4 focus:ring-indigo-500/10 transition-all duration-200 outline-none font-mono text-sm"
                                    />
                                </div>
                            </div>
                        )}

                        {/* Source Code Analysis Configuration Section */}
                        <div className="bg-white dark:bg-slate-900 rounded-xl border border-slate-200 dark:border-slate-800 p-4 space-y-4">
                            <div className="flex items-center justify-between pb-2 border-b border-slate-100 dark:border-slate-800">
                                <div className="flex items-center gap-2 font-semibold text-slate-700 dark:text-slate-300">
                                    <FileCode className="w-5 h-5 text-indigo-600 dark:text-indigo-400" />
                                    <span>{t('analysis.sourceCodeAnalysisOptions')}</span>
                                </div>
                                <div className="flex items-center gap-2">
                                    <button
                                        type="button"
                                        onClick={handleLoadSettings}
                                        className="text-xs px-3 py-1.5 bg-white dark:bg-slate-800 text-slate-600 dark:text-slate-300 rounded-lg hover:bg-slate-50 dark:hover:bg-slate-700 font-medium transition-colors border border-slate-200 dark:border-slate-700"
                                    >
                                        {t('analysis.loadSettings')}
                                    </button>
                                    <button
                                        type="button"
                                        onClick={handleSaveSettings}
                                        className="text-xs px-3 py-1.5 bg-indigo-50 dark:bg-indigo-900/30 text-indigo-600 dark:text-indigo-400 rounded-lg hover:bg-indigo-100 dark:hover:bg-indigo-900/50 font-medium transition-colors border border-indigo-100 dark:border-indigo-800"
                                    >
                                        {t('analysis.saveSettings')}
                                    </button>
                                </div>
                            </div>

                            {/* New Options: Analysis Target & Save Strategy - Moved to Top */}
                            <div className="grid grid-cols-1 md:grid-cols-2 gap-4 pb-4 border-b border-slate-50 dark:border-slate-800">
                                <div>
                                    <label className="flex items-center gap-1 text-xs font-semibold text-slate-600 dark:text-slate-400 mb-2">
                                        {t('analysis.analysisTarget')} <Tooltip text={t('analysis.analysisTargetTooltip')} position="left-0" arrowPosition="left-2" />
                                    </label>
                                    <div className="flex gap-4">
                                        {['all', 'program', 'db'].map((target) => (
                                            <label key={target} className="flex items-center gap-2 cursor-pointer">
                                                <input
                                                    type="radio"
                                                    {...register('analysisTarget')}
                                                    value={target}
                                                    className="w-4 h-4 text-indigo-600 border-gray-300 focus:ring-indigo-500"
                                                />
                                                <span className="text-sm text-slate-700 dark:text-slate-300">{t(`analysis.target${target.charAt(0).toUpperCase() + target.slice(1)}`)}</span>
                                            </label>
                                        ))}
                                    </div>
                                </div>
                                <div>
                                    <label className="flex items-center gap-1 text-xs font-semibold text-slate-600 dark:text-slate-400 mb-2">
                                        {t('analysis.saveStrategy')} <Tooltip text={t('analysis.saveStrategyTooltip')} />
                                    </label>
                                    <div className="flex gap-4">
                                        {['delete', 'update'].map((strategy) => (
                                            <label key={strategy} className="flex items-center gap-2 cursor-pointer">
                                                <input
                                                    type="radio"
                                                    {...register('saveStrategy')}
                                                    value={strategy}
                                                    className="w-4 h-4 text-indigo-600 border-gray-300 focus:ring-indigo-500"
                                                />
                                                <span className="text-sm text-slate-700 dark:text-slate-300">{t(`analysis.save${strategy.charAt(0).toUpperCase() + strategy.slice(1)}`)}</span>
                                            </label>
                                        ))}
                                    </div>
                                </div>
                            </div>

                            {/* Top Toggles */}
                            <div className="grid grid-cols-1 md:grid-cols-2 gap-4">
                                <label className="flex items-center gap-2 cursor-pointer">
                                    <input
                                        type="checkbox"
                                        {...register('skipDtoSource')}
                                        className="w-4 h-4 rounded text-indigo-600 focus:ring-indigo-500 border-gray-300"
                                    />
                                    <span className="text-sm text-slate-700 dark:text-slate-300">{t('analysis.skipDtoSource')}</span>
                                    <Tooltip text={t('analysis.skipDtoSourceTooltip')} />
                                </label>
                                <label className="flex items-center gap-2 cursor-pointer">
                                    <input
                                        type="checkbox"
                                        {...register('skipDtoMethods')}
                                        className="w-4 h-4 rounded text-indigo-600 focus:ring-indigo-500 border-gray-300"
                                    />
                                    <span className="text-sm text-slate-700 dark:text-slate-300">{t('analysis.skipDtoMethods')}</span>
                                    <Tooltip text={t('analysis.skipDtoMethodsTooltip')} position="right-0" arrowPosition="right-2" />
                                </label>
                            </div>

                            {/* Exclude Patterns */}
                            <div className="pt-4 border-t border-slate-50 dark:border-slate-800">
                                <label className="flex items-center gap-1 text-xs font-semibold text-slate-600 dark:text-slate-400 mb-1">
                                    {t('analysis.excludePatterns')} <Tooltip text={t('analysis.excludePatternsTooltip')} />
                                </label>
                                <textarea
                                    {...register('excludePatterns')}
                                    placeholder={t('analysis.excludePatternsPlaceholder')}
                                    rows={3}
                                    className="w-full px-2 py-1.5 rounded border border-slate-200 dark:border-slate-700 bg-white dark:bg-slate-900 text-slate-800 dark:text-white text-sm font-mono h-[86px]"
                                />
                            </div>

                            {/* Advanced Numerical Inputs */}
                            <div className="grid grid-cols-1 md:grid-cols-3 gap-4 border-t border-slate-50 dark:border-slate-800 pt-4">
                                <div>
                                    <label className="flex items-center gap-1 text-xs font-semibold text-slate-600 dark:text-slate-400 mb-1">
                                        {t('analysis.workers')} <Tooltip text={t('analysis.workersTooltip')} position="left-0" arrowPosition="left-2" />
                                    </label>
                                    <input
                                        type="number"
                                        {...register('javaParseWorkers', { valueAsNumber: true })}
                                        className="w-full px-2 py-1.5 rounded border border-slate-200 dark:border-slate-700 bg-white dark:bg-slate-900 text-slate-800 dark:text-white text-sm"
                                    />
                                </div>
                                <div>
                                    <label className="flex items-center gap-1 text-xs font-semibold text-slate-600 dark:text-slate-400 mb-1">
                                        {t('analysis.timeout')} <Tooltip text={t('analysis.timeoutTooltip')} />
                                    </label>
                                    <input
                                        type="number"
                                        {...register('javaFileParseTimeout', { valueAsNumber: true })}
                                        className="w-full px-2 py-1.5 rounded border border-slate-200 dark:border-slate-700 bg-white dark:bg-slate-900 text-slate-800 dark:text-white text-sm"
                                    />
                                </div>
                                <div>
                                    <label className="flex items-center gap-1 text-xs font-semibold text-slate-600 dark:text-slate-400 mb-1">
                                        {t('analysis.complexityLimit')} <Tooltip text={t('analysis.complexityLimitTooltip')} position="right-0" arrowPosition="right-2" />
                                    </label>
                                    <input
                                        type="number"
                                        {...register('javaComplexityThreshold', { valueAsNumber: true })}
                                        className="w-full px-2 py-1.5 rounded border border-slate-200 dark:border-slate-700 bg-white dark:bg-slate-900 text-slate-800 dark:text-white text-sm"
                                    />
                                </div>
                            </div>

                            {/* Sequence Packages & Log Level */}
                            <div className="grid grid-cols-1 md:grid-cols-2 gap-4 border-t border-slate-50 dark:border-slate-800 pt-4">
                                <div>
                                    <label className="flex items-center gap-1 text-xs font-semibold text-slate-600 dark:text-slate-400 mb-1">
                                        {t('analysis.includePackages')} <Tooltip text={t('analysis.includePackagesTooltip')} />
                                    </label>
                                    <input
                                        type="text"
                                        placeholder="com.example, org.test"
                                        {...register('sequenceDiagramIncludePackages')}
                                        className="w-full px-2 py-1.5 rounded border border-slate-200 dark:border-slate-700 bg-white dark:bg-slate-900 text-slate-800 dark:text-white text-sm"
                                    />
                                </div>
                                <div>
                                    <label className="flex items-center gap-1 text-xs font-semibold text-slate-600 dark:text-slate-400 mb-1">
                                        {t('analysis.logLevel')} <Tooltip text={t('analysis.logLevelTooltip')} position="right-0" arrowPosition="right-2" />
                                    </label>
                                    <select
                                        {...register('logLevel')}
                                        className="w-full px-2 py-1.5 rounded border border-slate-200 dark:border-slate-700 bg-white dark:bg-slate-900 text-slate-800 dark:text-white text-sm"
                                    >
                                        <option value="DEBUG">DEBUG</option>
                                        <option value="INFO">INFO</option>
                                        <option value="WARNING">WARNING</option>
                                        <option value="ERROR">ERROR</option>
                                    </select>
                                </div>
                            </div>

                        </div>




                        <div className="mt-8 bg-indigo-600 rounded-2xl p-6 text-white shadow-xl shadow-indigo-200">
                            <div className="flex items-start justify-between mb-6">
                                <div>
                                    <h3 className="text-xl font-bold flex items-center gap-2 mb-2">
                                        <Play className="w-6 h-6 fill-current" />
                                        {t('analysis.runAnalysis')}
                                    </h3>
                                    <div className="flex flex-wrap gap-2 text-indigo-100 text-sm">
                                        {projectName && (
                                            <>
                                                <span>Project: {projectName}</span>
                                                <span>•</span>
                                            </>
                                        )}
                                        <span>Target: {analysisTarget.toUpperCase()}</span>
                                        <span>•</span>
                                        <span>Strategy: {saveStrategy.toUpperCase()}</span>
                                    </div>
                                    <div className="flex gap-2 mt-3">
                                        <span className="px-2 py-1 bg-white/20 rounded text-xs backdrop-blur-sm">
                                            {javaParseWorkers} Workers
                                        </span>
                                        <span className="px-2 py-1 bg-white/20 rounded text-xs backdrop-blur-sm">
                                            {t('analysis.logLevel')}: {logLevel}
                                        </span>
                                    </div>
                                </div>
                                {(status === 'running' || status === 'pending') && (
                                    <button
                                        onClick={handleStopAnalysis}
                                        type="button"
                                        className="flex items-center gap-2 px-4 py-2 rounded-lg transition-all text-sm font-bold backdrop-blur-sm shadow-sm border bg-rose-500/20 hover:bg-rose-500/40 border-rose-400/50 text-rose-100"
                                    >
                                        <Square className="w-4 h-4 fill-current" />
                                        {t('analysis.stopAnalysis')}
                                    </button>
                                )}
                            </div>

                            <button
                                type="submit"
                                disabled={isLoading || status === 'running' || (mode === 'upload' && !file) || (mode === 'path' && !sourcePath)}
                                className={`w-full py-3.5 bg-white text-indigo-600 rounded-xl font-bold shadow-lg hover:shadow-xl hover:bg-indigo-50 transition-all transform active:scale-[0.98] disabled:opacity-70 disabled:cursor-not-allowed disabled:transform-none ${isLoading || status === 'running' ? 'cursor-wait' : ''
                                    }`}
                            >
                                {isLoading || status === 'running' ? (
                                    <span className="flex items-center justify-center gap-2">
                                        <RotateCw className="w-5 h-5 animate-spin" />
                                        {status === 'running' ? t('analysis.analyzing') : t('analysis.startingAnalysis')}
                                    </span>
                                ) : (
                                    t('analysis.startAnalysis')
                                )}
                            </button>
                        </div>
                    </form>
                </div>
            </div >

            {/* Confirmation Modal */}
            {
                showConfirmModal && (
                    <div className="fixed inset-0 z-50 flex items-center justify-center p-4 bg-slate-900/60 backdrop-blur-sm animate-in fade-in duration-200">
                        <div className="bg-white dark:bg-slate-900 rounded-2xl shadow-2xl w-full max-w-md overflow-hidden animate-in zoom-in-95 duration-200 border border-slate-100 dark:border-slate-800">
                            <div className="p-8">
                                <div className="flex flex-col items-center text-center">
                                    <div className="w-16 h-16 bg-indigo-50 dark:bg-indigo-900/20 rounded-full flex items-center justify-center mb-6 ring-8 ring-indigo-50/50 dark:ring-indigo-900/10">
                                        <Rocket className="w-8 h-8 text-indigo-600 dark:text-indigo-400" />
                                    </div>

                                    <h3 className="text-xl font-bold text-slate-900 dark:text-white mb-3">
                                        {t('analysis.analysisConfirmTitle')}
                                    </h3>

                                    <p className="text-slate-500 dark:text-slate-400 whitespace-pre-wrap leading-relaxed mb-8">
                                        {t('analysis.analysisConfirmMessage')}
                                    </p>

                                    <div className="flex gap-3 w-full">
                                        <button
                                            type="button"
                                            className="flex-1 py-3 px-4 bg-white dark:bg-slate-800 border border-slate-200 dark:border-slate-700 text-slate-700 dark:text-slate-300 font-semibold rounded-xl hover:bg-slate-50 dark:hover:bg-slate-700 hover:border-slate-300 dark:hover:border-slate-600 transition-all active:scale-[0.98]"
                                            onClick={() => setShowConfirmModal(false)}
                                        >
                                            {t('common.cancel')}
                                        </button>
                                        <button
                                            type="button"
                                            className="flex-1 py-3 px-4 bg-indigo-600 text-white font-semibold rounded-xl shadow-lg shadow-indigo-200 dark:shadow-none hover:bg-indigo-700 hover:shadow-indigo-300 dark:hover:shadow-indigo-900/50 transition-all active:scale-[0.98]"
                                            onClick={executeAnalysis}
                                        >
                                            {t('analysis.confirm')}
                                        </button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                )
            }

            {/* Stop Confirmation Modal */}
            {
                showStopConfirmModal && (
                    <div className="fixed inset-0 z-50 flex items-center justify-center p-4 bg-slate-900/60 backdrop-blur-sm animate-in fade-in duration-200">
                        <div className="bg-white dark:bg-slate-900 rounded-2xl shadow-2xl w-full max-w-md overflow-hidden animate-in zoom-in-95 duration-200 border border-slate-100 dark:border-slate-800">
                            <div className="p-8">
                                <div className="flex flex-col items-center text-center">
                                    <div className="w-16 h-16 bg-rose-50 dark:bg-rose-900/20 rounded-full flex items-center justify-center mb-6 ring-8 ring-rose-50/50 dark:ring-rose-900/10">
                                        <Square className="w-8 h-8 text-rose-500 dark:text-rose-400 fill-current" />
                                    </div>

                                    <h3 className="text-xl font-bold text-slate-900 dark:text-white mb-3">
                                        {t('analysis.analysisStopConfirmTitle')}
                                    </h3>

                                    <p className="text-slate-500 dark:text-slate-400 whitespace-pre-wrap leading-relaxed mb-8">
                                        {t('analysis.analysisStopConfirmMessage')}
                                    </p>

                                    <div className="flex gap-3 w-full">
                                        <button
                                            type="button"
                                            className="flex-1 py-3 px-4 bg-white dark:bg-slate-800 border border-slate-200 dark:border-slate-700 text-slate-700 dark:text-slate-300 font-semibold rounded-xl hover:bg-slate-50 dark:hover:bg-slate-700 hover:border-slate-300 dark:hover:border-slate-600 transition-all active:scale-[0.98]"
                                            onClick={() => setShowStopConfirmModal(false)}
                                        >
                                            {t('common.cancel')}
                                        </button>
                                        <button
                                            type="button"
                                            className="flex-1 py-3 px-4 bg-rose-600 text-white font-semibold rounded-xl shadow-lg shadow-rose-200 dark:shadow-none hover:bg-rose-700 hover:shadow-rose-300 dark:hover:shadow-rose-900/50 transition-all active:scale-[0.98]"
                                            onClick={executeStopAnalysis}
                                        >
                                            {t('analysis.confirm')}
                                        </button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                )
            }

            {/* Status Panel */}
            <div className="bg-white dark:bg-slate-900 rounded-2xl shadow-sm border border-slate-100 dark:border-slate-800 p-6">
                <h3 className="text-lg font-bold text-slate-900 dark:text-white mb-4 flex items-center gap-2">
                    <ActivityIcon className="w-5 h-5 text-indigo-600 dark:text-indigo-400" />
                    {t('analysis.analysisStatus')}
                </h3>

                {
                    jobId ? (
                        <div className="space-y-4">
                            <div className="grid grid-cols-1 md:grid-cols-2 gap-4">
                                <div className="p-4 bg-slate-50 dark:bg-slate-800 rounded-xl border border-slate-100 dark:border-slate-700">
                                    <div className="text-xs text-slate-500 dark:text-slate-400 uppercase tracking-wider font-semibold mb-1">{t('analysis.jobId')}</div>
                                    <div className="font-mono text-sm text-slate-700 dark:text-slate-300 break-all">{jobId}</div>
                                </div>

                                <div className="flex items-center gap-3 p-4 bg-indigo-50 dark:bg-indigo-900/20 rounded-xl border border-indigo-100 dark:border-indigo-800">
                                    {status === 'completed' ? (
                                        <CheckCircle className="w-5 h-5 text-emerald-500" />
                                    ) : status === 'failed' ? (
                                        <AlertCircle className="w-5 h-5 text-red-500" />
                                    ) : status === 'canceled' || status === 'cancelled' || status === 'cancelling' ? (
                                        <XCircle className="w-5 h-5 text-slate-500" />
                                    ) : (
                                        <Loader2 className="w-5 h-5 text-indigo-500 animate-spin" />
                                    )}
                                    <div>
                                        <div className="text-xs text-indigo-600 dark:text-indigo-400 uppercase tracking-wider font-semibold">{t('analysis.currentStatus')}</div>
                                        <div className="font-bold text-indigo-900 dark:text-indigo-200 capitalize">{status || 'Pending...'}</div>
                                    </div>
                                </div>
                            </div>

                            {/* Progress Bar */}
                            {(status === 'running' || status === 'pending' || status === 'cancelling') && progress && (
                                <div className="w-full bg-white dark:bg-slate-800 p-4 rounded-xl border border-slate-200 dark:border-slate-700 shadow-sm">
                                    <div className="flex justify-between text-xs text-slate-600 dark:text-slate-400 mb-2 font-medium">
                                        <div className="flex items-center gap-2">
                                            <Loader2 className="w-3 h-3 animate-spin text-indigo-600 dark:text-indigo-400" />
                                            <span>Processing... {progress.current}/{progress.total}</span>
                                        </div>
                                        <span className="text-indigo-600 dark:text-indigo-400 font-bold">{progress.percent}%</span>
                                    </div>
                                    <div className="w-full bg-slate-100 dark:bg-slate-700 rounded-full h-2 overflow-hidden">
                                        <div
                                            className="bg-indigo-600 dark:bg-indigo-500 h-2 rounded-full transition-all duration-500 ease-out shadow-[0_0_10px_rgba(79,70,229,0.3)]"
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
                                    className="flex-1 flex items-center justify-center gap-2 py-2.5 px-4 bg-white dark:bg-slate-800 border border-slate-200 dark:border-slate-700 text-slate-700 dark:text-slate-300 rounded-xl hover:bg-slate-50 dark:hover:bg-slate-700 hover:text-indigo-600 dark:hover:text-indigo-400 transition-colors text-sm font-medium shadow-sm"
                                >
                                    <FileText className="w-4 h-4" />
                                    {t('analysis.viewLogs')}
                                </button>
                                <button
                                    onClick={() => setShowSummaryModal(true)}
                                    disabled={status !== 'completed'}
                                    className={`flex-1 flex items-center justify-center gap-2 py-2.5 px-4 rounded-xl transition-all text-sm font-medium shadow-md ${status === 'completed'
                                        ? 'bg-indigo-600 text-white hover:bg-indigo-700 shadow-indigo-200 dark:shadow-none'
                                        : 'bg-slate-100 dark:bg-slate-800 text-slate-400 dark:text-slate-600 cursor-not-allowed shadow-none'
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
        </div >

    );
};




export default Analysis;
