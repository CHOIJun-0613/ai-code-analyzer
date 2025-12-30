import React, { useState } from 'react';
import { useTranslation } from 'react-i18next';
import client from '../api/client';
import { Upload, Folder, Play, FileCode, CheckCircle, AlertCircle, Loader2, Terminal, HelpCircle, Activity as ActivityIcon, X, FileText, List, Download, Database, Square, RotateCw, Rocket } from 'lucide-react';

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
    const [file, setFile] = useState<File | null>(null);
    const [sourcePath, setSourcePath] = useState('');
    const [dbScriptPath, setDbScriptPath] = useState('');
    const [projectName, setProjectName] = useState('');
    const [applicationName, setApplicationName] = useState('');
    const [jobId, setJobId] = useState('');
    const [status, setStatus] = useState('');
    const [mode, setMode] = useState<'upload' | 'path'>('path');
    const [logs, setLogs] = useState<string[]>([]);
    const [isLoading, setIsLoading] = useState(false);
    const [showLogModal, setShowLogModal] = useState(false);
    const [showSummaryModal, setShowSummaryModal] = useState(false);
    const [showConfirmModal, setShowConfirmModal] = useState(false);
    const [showStopConfirmModal, setShowStopConfirmModal] = useState(false);

    // Standard Options
    const [skipDtoSource, setSkipDtoSource] = useState(true);
    const [skipDtoMethods, setSkipDtoMethods] = useState(true);
    const [scope, setScope] = useState('all');

    // Advanced Source Options
    const [javaParseWorkers, setJavaParseWorkers] = useState(8);
    const [javaFileParseTimeout, setJavaFileParseTimeout] = useState(120.0);
    const [javaComplexityThreshold, setJavaComplexityThreshold] = useState(50000);
    const [sequenceDiagramIncludePackages, setSequenceDiagramIncludePackages] = useState('');
    const [excludePatterns, setExcludePatterns] = useState('');
    const [logLevel, setLogLevel] = useState('INFO');
    const [analysisTarget, setAnalysisTarget] = useState<'all' | 'program' | 'db'>('all');
    const [saveStrategy, setSaveStrategy] = useState<'delete' | 'update'>('delete');

    const logsEndRef = React.useRef<HTMLDivElement>(null);

    // Scroll to bottom of logs
    React.useEffect(() => {
        logsEndRef.current?.scrollIntoView({ behavior: "smooth" });
    }, [logs]);

    const loadPreferences = async () => {
        try {
            const res = await client.get('/users/me/preferences');
            if (res.data) {
                // Boolean fields - check for undefined
                if (res.data.skip_dto_source !== undefined) setSkipDtoSource(res.data.skip_dto_source);
                if (res.data.skip_dto_methods !== undefined) setSkipDtoMethods(res.data.skip_dto_methods);

                // String/Selection fields
                if (res.data.scope !== undefined) setScope(res.data.scope);

                // Advanced Source Options
                if (res.data.java_parse_workers !== undefined) setJavaParseWorkers(res.data.java_parse_workers);
                if (res.data.java_file_parse_timeout !== undefined) setJavaFileParseTimeout(res.data.java_file_parse_timeout);
                if (res.data.java_complexity_threshold !== undefined) setJavaComplexityThreshold(res.data.java_complexity_threshold);
                if (res.data.sequence_diagram_include_packages !== undefined) setSequenceDiagramIncludePackages(res.data.sequence_diagram_include_packages);
                if (res.data.exclude_patterns !== undefined) setExcludePatterns(res.data.exclude_patterns);
                if (res.data.log_level !== undefined) setLogLevel(res.data.log_level);
                if (res.data.analysis_target !== undefined) setAnalysisTarget(res.data.analysis_target);
                if (res.data.save_strategy !== undefined) setSaveStrategy(res.data.save_strategy);
            }
        } catch (err) {
            console.error("Failed to fetch preferences", err);
            throw err; // Re-throw for caller handling
        }
    };

    // Fetch user preferences
    React.useEffect(() => {
        loadPreferences();

        // Check for active analysis
        const checkActiveAnalysis = async () => {
            try {
                const res = await client.get('/analysis/active');
                if (res.data && res.data.job_id) {
                    setJobId(res.data.job_id);
                    setStatus(res.data.status);
                }
            } catch (error) {
                // No active analysis is fine, just ignore
                console.debug("No active analysis found");
            }
        };
        checkActiveAnalysis();
    }, []);

    // Polling for status and logs
    React.useEffect(() => {
        let intervalId: NodeJS.Timeout;

        if (jobId && (status === 'pending' || status === 'running')) {
            intervalId = setInterval(async () => {
                try {
                    // Fetch status
                    const statusRes = await client.get(`/analysis/analyze/${jobId}`);
                    setStatus(statusRes.data.status);

                    // Fetch logs
                    const logsRes = await client.get(`/analysis/analyze/${jobId}/logs`);
                    if (logsRes.data.logs) {
                        setLogs(logsRes.data.logs);
                    }
                } catch (error) {
                    console.error("Failed to poll status/logs", error);
                }
            }, 3000); // Poll every 3 seconds
        }

        return () => {
            if (intervalId) clearInterval(intervalId);
        };
    }, [jobId, status]);

    const handleFileChange = (e: React.ChangeEvent<HTMLInputElement>) => {
        if (e.target.files) {
            setFile(e.target.files[0]);
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

    const executeAnalysis = async () => {
        setShowConfirmModal(false);
        setIsLoading(true);
        setLogs([]);

        // Preferences object
        const preferences = {
            skip_dto_source: skipDtoSource,
            skip_dto_methods: skipDtoMethods,
            scope: scope,
            java_parse_workers: javaParseWorkers,
            java_file_parse_timeout: javaFileParseTimeout,
            java_complexity_threshold: javaComplexityThreshold,
            sequence_diagram_include_packages: sequenceDiagramIncludePackages,
            exclude_patterns: excludePatterns,
            log_level: logLevel,
            analysis_target: analysisTarget,
            save_strategy: saveStrategy
        };



        // Save preferences
        try {
            await client.put('/users/me/preferences', preferences);
        } catch (err) {
            console.error("Failed to save preferences", err);
        }

        try {
            let response;
            if (mode === 'upload' && file) {
                const formData = new FormData();
                formData.append('file', file);
                if (projectName) formData.append('project_name', projectName);
                if (applicationName) formData.append('application_name', applicationName);

                // Save Strategy
                if (saveStrategy === 'delete') {
                    formData.append('clean', 'true');
                    formData.append('update', 'false');
                } else {
                    formData.append('clean', 'false');
                    formData.append('update', 'true');
                }

                // Analysis Target
                if (analysisTarget === 'program') {
                    formData.append('java_object', 'true');
                    formData.append('db_object', 'false');
                    formData.append('all_objects', 'false');
                } else if (analysisTarget === 'db') {
                    formData.append('java_object', 'false');
                    formData.append('db_object', 'true');
                    formData.append('all_objects', 'false');
                } else {
                    formData.append('all_objects', 'true');
                }

                // Advanced Source Options
                formData.append('use_streaming_parse', 'true');
                formData.append('java_parse_workers', String(javaParseWorkers));
                formData.append('java_file_parse_timeout', String(javaFileParseTimeout));
                formData.append('java_complexity_threshold', String(javaComplexityThreshold));
                if (sequenceDiagramIncludePackages) formData.append('sequence_diagram_include_packages', sequenceDiagramIncludePackages);
                if (excludePatterns) formData.append('exclude_patterns', excludePatterns);
                formData.append('log_level', logLevel);

                // Advanced AI Options - DISABLING AI
                formData.append('use_ai_analysis', 'false');
                formData.append('use_ai', 'false');

                // Standard Options
                formData.append('skip_dto_source', String(skipDtoSource));
                formData.append('skip_dto_methods', String(skipDtoMethods));
                formData.append('scope', scope);

                response = await client.post('/analysis/analyze/upload', formData);
            } else {
                const payload: any = {
                    source_folder: sourcePath,
                    project_name: projectName,
                    application_name: applicationName,
                    db_script_path: dbScriptPath,

                    // Save Strategy
                    clean: saveStrategy === 'delete',
                    update: saveStrategy === 'update',

                    // Analysis Target
                    java_object: analysisTarget === 'program' || analysisTarget === 'all',
                    db_object: analysisTarget === 'db' || analysisTarget === 'all',
                    all_objects: analysisTarget === 'all',

                    // Advanced Source Options
                    use_streaming_parse: true,
                    java_parse_workers: javaParseWorkers,
                    java_file_parse_timeout: javaFileParseTimeout,
                    java_complexity_threshold: javaComplexityThreshold,
                    sequence_diagram_include_packages: sequenceDiagramIncludePackages,
                    exclude_patterns: excludePatterns,
                    log_level: logLevel,

                    // Advanced AI Options - DISABLING AI
                    use_ai_analysis: false,
                    use_ai: false, // Backward compatibility

                    // Standard Options
                    skip_dto_source: skipDtoSource,
                    skip_dto_methods: skipDtoMethods,
                    scope: scope
                };

                response = await client.post('/analysis/analyze', payload);
            }
            setJobId(response.data.job_id);
            setStatus(response.data.status);
        } catch (error) {
            console.error("Analysis request failed", error);
            alert("Failed to start analysis");
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
            setShowStopConfirmModal(false);
        } catch (error) {
            console.error("Failed to stop analysis", error);
            alert("Failed to stop analysis");
        }
    };

    return (
        <div className="max-w-4xl mx-auto space-y-8">
            <div>
                <h1 className="text-3xl font-bold text-slate-900">{t('analysis.title')}</h1>
                <p className="text-slate-500 mt-1">{t('analysis.subtitle')}</p>
            </div>

            <div className="text-sm text-slate-600 bg-slate-50 border border-slate-200 rounded-xl p-4">
                <span className="font-bold text-indigo-600 mr-2">* {t('analysis.tip')}:</span>
                {t('analysis.proTipContent')}
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
                        <div className="p-4 border-t border-slate-100 bg-slate-50 flex flex-col gap-4">
                            {/* Progress Bar */}
                            {(status === 'running' || status === 'pending') && progress && (
                                <div className="w-full bg-white p-3 rounded-xl border border-slate-200 shadow-sm">
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

            {/* Main Form */}
            <div className="space-y-6">
                <div className="bg-white rounded-2xl shadow-sm border border-slate-100 overflow-hidden">
                    <div className="flex border-b border-slate-100">
                        <button
                            onClick={() => setMode('path')}
                            className={`flex-1 py-4 text-sm font-medium flex items-center justify-center gap-2 transition-colors ${mode === 'path'
                                ? 'bg-indigo-50 text-indigo-600 border-b-2 border-indigo-600'
                                : 'text-slate-500 hover:bg-slate-50'
                                }`}
                        >
                            <Folder className="w-4 h-4" /> {t('analysis.serverPath')}
                        </button>
                        <button
                            onClick={() => setMode('upload')}
                            className={`flex-1 py-4 text-sm font-medium flex items-center justify-center gap-2 transition-colors ${mode === 'upload'
                                ? 'bg-indigo-50 text-indigo-600 border-b-2 border-indigo-600'
                                : 'text-slate-500 hover:bg-slate-50'
                                }`}
                        >
                            <Upload className="w-4 h-4" /> {t('analysis.uploadZip')}
                        </button>
                    </div>

                    <form onSubmit={handleConfirmation} className="p-6 space-y-6">
                        <div className="grid grid-cols-1 md:grid-cols-2 gap-6">
                            <div>
                                <label className="block text-sm font-semibold text-slate-700 mb-2">{t('analysis.projectName')} <span className="text-slate-400 font-normal">{t('analysis.optional')}</span></label>
                                <input
                                    type="text"
                                    placeholder={t('analysis.projectNamePlaceholder')}
                                    value={projectName}
                                    onChange={(e) => setProjectName(e.target.value)}
                                    className="w-full px-4 py-2.5 rounded-xl border border-slate-200 focus:border-indigo-500 focus:ring-4 focus:ring-indigo-500/10 transition-all duration-200 outline-none text-slate-800"
                                />
                            </div>
                            <div>
                                <label className="block text-sm font-semibold text-slate-700 mb-2">{t('analysis.applicationName')} <span className="text-slate-400 font-normal">{t('analysis.optional')}</span></label>
                                <input
                                    type="text"
                                    placeholder={t('analysis.applicationNamePlaceholder')}
                                    value={applicationName}
                                    onChange={(e) => setApplicationName(e.target.value)}
                                    maxLength={30}
                                    className="w-full px-4 py-2.5 rounded-xl border border-slate-200 focus:border-indigo-500 focus:ring-4 focus:ring-indigo-500/10 transition-all duration-200 outline-none text-slate-800"
                                />
                            </div>
                        </div>

                        {mode === 'upload' ? (
                            <div>
                                <label className="block text-sm font-semibold text-slate-700 mb-2">{t('analysis.sourceFile')}</label>
                                <div className="border-2 border-dashed border-slate-200 rounded-xl p-8 text-center hover:border-indigo-400 hover:bg-indigo-50/30 transition-all duration-200 group cursor-pointer relative">
                                    <input
                                        type="file"
                                        accept=".zip"
                                        onChange={handleFileChange}
                                        className="absolute inset-0 w-full h-full opacity-0 cursor-pointer"
                                    />
                                    <div className="w-12 h-12 bg-indigo-100 text-indigo-600 rounded-full flex items-center justify-center mx-auto mb-4 group-hover:scale-110 transition-transform">
                                        <Upload className="w-6 h-6" />
                                    </div>
                                    <p className="text-sm font-medium text-slate-700">
                                        {file ? file.name : t('analysis.clickToUpload')}
                                    </p>
                                    <p className="text-xs text-slate-400 mt-1">{t('analysis.zipFilesOnly')}</p>
                                </div>
                            </div>
                        ) : (
                            <div>
                                <label className="block text-sm font-semibold text-slate-700 mb-2">{t('analysis.serverSourcePath')}</label>
                                <div className="relative mb-4">
                                    <div className="absolute inset-y-0 left-0 pl-3 flex items-center pointer-events-none">
                                        <Terminal className="h-5 w-5 text-slate-400" />
                                    </div>
                                    <input
                                        type="text"
                                        placeholder={t('analysis.serverSourcePathPlaceholder')}
                                        value={sourcePath}
                                        onChange={(e) => setSourcePath(e.target.value)}
                                        className="w-full pl-10 pr-4 py-2.5 rounded-xl border border-slate-200 focus:border-indigo-500 focus:ring-4 focus:ring-indigo-500/10 transition-all duration-200 outline-none text-slate-800 font-mono text-sm"
                                    />
                                </div>
                                <label className="block text-sm font-semibold text-slate-700 mb-2">{t('analysis.dbScriptPath')}</label>
                                <div className="relative">
                                    <div className="absolute inset-y-0 left-0 pl-3 flex items-center pointer-events-none">
                                        <Database className="h-5 w-5 text-slate-400" />
                                    </div>
                                    <input
                                        type="text"
                                        placeholder={t('analysis.dbScriptPathPlaceholder')}
                                        value={dbScriptPath}
                                        onChange={(e) => setDbScriptPath(e.target.value)}
                                        className="w-full pl-10 pr-4 py-2.5 rounded-xl border border-slate-200 focus:border-indigo-500 focus:ring-4 focus:ring-indigo-500/10 transition-all duration-200 outline-none text-slate-800 font-mono text-sm"
                                    />
                                </div>
                            </div>
                        )}

                        {/* Source Code Analysis Configuration Section */}
                        <div className="bg-white rounded-xl border border-slate-200 p-4 space-y-4">
                            <div className="flex items-center justify-between pb-2 border-b border-slate-100">
                                <div className="flex items-center gap-2 font-semibold text-slate-700">
                                    <FileCode className="w-5 h-5 text-indigo-600" />
                                    <span>{t('analysis.sourceCodeAnalysisOptions')}</span>
                                </div>
                                <div className="flex items-center gap-2">
                                    <button
                                        type="button"
                                        onClick={async (e) => {
                                            e.stopPropagation();
                                            try {
                                                await loadPreferences();
                                                alert("Settings loaded successfully!");
                                            } catch (err) {
                                                console.error("Failed to load preferences", err);
                                                alert("Failed to load settings.");
                                            }
                                        }}
                                        className="text-xs px-3 py-1.5 bg-white text-slate-600 rounded-lg hover:bg-slate-50 font-medium transition-colors border border-slate-200"
                                    >
                                        {t('analysis.loadSettings')}
                                    </button>
                                    <button
                                        type="button"
                                        onClick={async (e) => {
                                            e.stopPropagation();
                                            try {
                                                await client.put('/users/me/preferences', {
                                                    skip_dto_source: skipDtoSource,
                                                    skip_dto_methods: skipDtoMethods,
                                                    scope: scope,
                                                    java_parse_workers: javaParseWorkers,
                                                    java_file_parse_timeout: javaFileParseTimeout,
                                                    java_complexity_threshold: javaComplexityThreshold,
                                                    sequence_diagram_include_packages: sequenceDiagramIncludePackages,
                                                    exclude_patterns: excludePatterns,
                                                    log_level: logLevel,
                                                    analysis_target: analysisTarget,
                                                    save_strategy: saveStrategy
                                                });
                                                alert("Configuration saved successfully!");
                                            } catch (err) {
                                                console.error("Failed to save preferences", err);
                                                alert("Failed to save configuration.");
                                            }
                                        }}
                                        className="text-xs px-3 py-1.5 bg-indigo-50 text-indigo-600 rounded-lg hover:bg-indigo-100 font-medium transition-colors border border-indigo-100"
                                    >
                                        {t('analysis.saveSettings')}
                                    </button>
                                </div>
                            </div>

                            {/* New Options: Analysis Target & Save Strategy - Moved to Top */}
                            <div className="grid grid-cols-1 md:grid-cols-2 gap-4 pb-4 border-b border-slate-50">
                                <div>
                                    <label className="flex items-center gap-1 text-xs font-semibold text-slate-600 mb-2">
                                        {t('analysis.analysisTarget')} <Tooltip text={t('analysis.analysisTargetTooltip')} position="left-0" arrowPosition="left-2" />
                                    </label>
                                    <div className="flex gap-4">
                                        <label className="flex items-center gap-2 cursor-pointer">
                                            <input
                                                type="radio"
                                                name="analysisTarget"
                                                value="all"
                                                checked={analysisTarget === 'all'}
                                                onChange={(e) => setAnalysisTarget(e.target.value as any)}
                                                className="w-4 h-4 text-indigo-600 border-gray-300 focus:ring-indigo-500"
                                            />
                                            <span className="text-sm text-slate-700">{t('analysis.targetAll')}</span>
                                        </label>
                                        <label className="flex items-center gap-2 cursor-pointer">
                                            <input
                                                type="radio"
                                                name="analysisTarget"
                                                value="program"
                                                checked={analysisTarget === 'program'}
                                                onChange={(e) => setAnalysisTarget(e.target.value as any)}
                                                className="w-4 h-4 text-indigo-600 border-gray-300 focus:ring-indigo-500"
                                            />
                                            <span className="text-sm text-slate-700">{t('analysis.targetProgram')}</span>
                                        </label>
                                        <label className="flex items-center gap-2 cursor-pointer">
                                            <input
                                                type="radio"
                                                name="analysisTarget"
                                                value="db"
                                                checked={analysisTarget === 'db'}
                                                onChange={(e) => setAnalysisTarget(e.target.value as any)}
                                                className="w-4 h-4 text-indigo-600 border-gray-300 focus:ring-indigo-500"
                                            />
                                            <span className="text-sm text-slate-700">{t('analysis.targetDb')}</span>
                                        </label>
                                    </div>
                                </div>
                                <div>
                                    <label className="flex items-center gap-1 text-xs font-semibold text-slate-600 mb-2">
                                        {t('analysis.saveStrategy')} <Tooltip text={t('analysis.saveStrategyTooltip')} />
                                    </label>
                                    <div className="flex gap-4">
                                        <label className="flex items-center gap-2 cursor-pointer">
                                            <input
                                                type="radio"
                                                name="saveStrategy"
                                                value="delete"
                                                checked={saveStrategy === 'delete'}
                                                onChange={(e) => setSaveStrategy(e.target.value as any)}
                                                className="w-4 h-4 text-indigo-600 border-gray-300 focus:ring-indigo-500"
                                            />
                                            <span className="text-sm text-slate-700">{t('analysis.saveDelete')}</span>
                                        </label>
                                        <label className="flex items-center gap-2 cursor-pointer">
                                            <input
                                                type="radio"
                                                name="saveStrategy"
                                                value="update"
                                                checked={saveStrategy === 'update'}
                                                onChange={(e) => setSaveStrategy(e.target.value as any)}
                                                className="w-4 h-4 text-indigo-600 border-gray-300 focus:ring-indigo-500"
                                            />
                                            <span className="text-sm text-slate-700">{t('analysis.saveUpdate')}</span>
                                        </label>
                                    </div>
                                </div>
                            </div>

                            {/* Top Toggles */}
                            <div className="grid grid-cols-1 md:grid-cols-2 gap-4">
                                <label className="flex items-center gap-2 cursor-pointer">
                                    <input
                                        type="checkbox"
                                        checked={skipDtoSource}
                                        onChange={(e) => setSkipDtoSource(e.target.checked)}
                                        className="w-4 h-4 rounded text-indigo-600 focus:ring-indigo-500 border-gray-300"
                                    />
                                    <span className="text-sm text-slate-700">{t('analysis.skipDtoSource')}</span>
                                    <Tooltip text={t('analysis.skipDtoSourceTooltip')} />
                                </label>
                                <label className="flex items-center gap-2 cursor-pointer">
                                    <input
                                        type="checkbox"
                                        checked={skipDtoMethods}
                                        onChange={(e) => setSkipDtoMethods(e.target.checked)}
                                        className="w-4 h-4 rounded text-indigo-600 focus:ring-indigo-500 border-gray-300"
                                    />
                                    <span className="text-sm text-slate-700">{t('analysis.skipDtoMethods')}</span>
                                    <Tooltip text={t('analysis.skipDtoMethodsTooltip')} position="right-0" arrowPosition="right-2" />
                                </label>
                            </div>

                            {/* Exclude Patterns */}
                            <div className="pt-4 border-t border-slate-50">
                                <label className="flex items-center gap-1 text-xs font-semibold text-slate-600 mb-1">
                                    {t('analysis.excludePatterns')} <Tooltip text={t('analysis.excludePatternsTooltip')} />
                                </label>
                                <textarea
                                    value={excludePatterns}
                                    onChange={(e) => setExcludePatterns(e.target.value)}
                                    placeholder={t('analysis.excludePatternsPlaceholder')}
                                    rows={3}
                                    className="w-full px-2 py-1.5 rounded border border-slate-200 text-sm font-mono h-[86px]"
                                />
                            </div>

                            {/* Advanced Numerical Inputs */}
                            <div className="grid grid-cols-1 md:grid-cols-3 gap-4 border-t border-slate-50 pt-4">
                                <div>
                                    <label className="flex items-center gap-1 text-xs font-semibold text-slate-600 mb-1">
                                        {t('analysis.workers')} <Tooltip text={t('analysis.workersTooltip')} position="left-0" arrowPosition="left-2" />
                                    </label>
                                    <input
                                        type="number"
                                        value={javaParseWorkers}
                                        onChange={(e) => setJavaParseWorkers(parseInt(e.target.value) || 8)}
                                        className="w-full px-2 py-1.5 rounded border border-slate-200 text-sm"
                                    />
                                </div>
                                <div>
                                    <label className="flex items-center gap-1 text-xs font-semibold text-slate-600 mb-1">
                                        {t('analysis.timeout')} <Tooltip text={t('analysis.timeoutTooltip')} />
                                    </label>
                                    <input
                                        type="number"
                                        value={javaFileParseTimeout}
                                        onChange={(e) => setJavaFileParseTimeout(parseFloat(e.target.value) || 120)}
                                        className="w-full px-2 py-1.5 rounded border border-slate-200 text-sm"
                                    />
                                </div>
                                <div>
                                    <label className="flex items-center gap-1 text-xs font-semibold text-slate-600 mb-1">
                                        {t('analysis.complexityLimit')} <Tooltip text={t('analysis.complexityLimitTooltip')} position="right-0" arrowPosition="right-2" />
                                    </label>
                                    <input
                                        type="number"
                                        value={javaComplexityThreshold}
                                        onChange={(e) => setJavaComplexityThreshold(parseInt(e.target.value) || 50000)}
                                        className="w-full px-2 py-1.5 rounded border border-slate-200 text-sm"
                                    />
                                </div>
                            </div>

                            {/* Sequence Packages & Log Level */}
                            <div className="grid grid-cols-1 md:grid-cols-2 gap-4 border-t border-slate-50 pt-4">
                                <div>
                                    <label className="flex items-center gap-1 text-xs font-semibold text-slate-600 mb-1">
                                        {t('analysis.includePackages')} <Tooltip text={t('analysis.includePackagesTooltip')} />
                                    </label>
                                    <input
                                        type="text"
                                        placeholder="com.example, org.test"
                                        value={sequenceDiagramIncludePackages}
                                        onChange={(e) => setSequenceDiagramIncludePackages(e.target.value)}
                                        className="w-full px-2 py-1.5 rounded border border-slate-200 text-sm"
                                    />
                                </div>
                                <div>
                                    <label className="flex items-center gap-1 text-xs font-semibold text-slate-600 mb-1">
                                        {t('analysis.logLevel')} <Tooltip text={t('analysis.logLevelTooltip')} position="right-0" arrowPosition="right-2" />
                                    </label>
                                    <select
                                        value={logLevel}
                                        onChange={(e) => setLogLevel(e.target.value)}
                                        className="w-full px-2 py-1.5 rounded border border-slate-200 text-sm"
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
                                        <span>Target: {analysisTarget.toUpperCase()}</span>
                                        <span>•</span>
                                        <span>Strategy: {saveStrategy.toUpperCase()}</span>
                                        {projectName && (
                                            <>
                                                <span>•</span>
                                                <span>Project: {projectName}</span>
                                            </>
                                        )}
                                    </div>
                                    <div className="flex gap-2 mt-3">
                                        <span className="px-2 py-1 bg-white/20 rounded text-xs backdrop-blur-sm">
                                            {javaParseWorkers} Workers
                                        </span>
                                        <span className="px-2 py-1 bg-white/20 rounded text-xs backdrop-blur-sm">
                                            {mode === 'upload' ? 'Upload Mode' : 'Path Mode'}
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

            {/* Status Panel */}
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
                                    <div className="font-mono text-sm text-slate-700 break-all">{jobId}</div>
                                </div>

                                <div className="flex items-center gap-3 p-4 bg-indigo-50 rounded-xl border border-indigo-100">
                                    {status === 'completed' ? (
                                        <CheckCircle className="w-5 h-5 text-emerald-500" />
                                    ) : status === 'failed' ? (
                                        <AlertCircle className="w-5 h-5 text-red-500" />
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
                                    disabled={status !== 'completed'}
                                    className={`flex-1 flex items-center justify-center gap-2 py-2.5 px-4 rounded-xl transition-all text-sm font-medium shadow-md ${status === 'completed'
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

    );
};




export default Analysis;
