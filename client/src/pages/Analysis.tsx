import React, { useState } from 'react';
import { useTranslation } from 'react-i18next';
import client from '../api/client';
import { Upload, Folder, Play, FileCode, CheckCircle, AlertCircle, Loader2, Terminal, Settings, ChevronDown, ChevronUp, HelpCircle, Activity as ActivityIcon } from 'lucide-react';

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
    const [projectName, setProjectName] = useState('');
    const [jobId, setJobId] = useState('');
    const [status, setStatus] = useState('');
    const [mode, setMode] = useState<'upload' | 'path'>('upload');
    const [logs, setLogs] = useState<string[]>([]);
    const [isLoading, setIsLoading] = useState(false);

    // AI Configuration State
    const [aiProvider, setAiProvider] = useState('google');
    const [apiKey, setApiKey] = useState('');
    const [modelName, setModelName] = useState('');
    const [apiEndpoint, setApiEndpoint] = useState('');
    const [skipDtoSource, setSkipDtoSource] = useState(true);
    const [skipDtoMethods, setSkipDtoMethods] = useState(true);
    const [scope, setScope] = useState('all');
    const [showAdvanced, setShowAdvanced] = useState(false);

    // Advanced Source Options
    const [useStreamingParse, setUseStreamingParse] = useState(true);
    const [javaParseWorkers, setJavaParseWorkers] = useState(8);
    const [javaFileParseTimeout, setJavaFileParseTimeout] = useState(120.0);
    const [javaComplexityThreshold, setJavaComplexityThreshold] = useState(50000);
    const [sequenceDiagramIncludePackages, setSequenceDiagramIncludePackages] = useState('');
    const [logLevel, setLogLevel] = useState('INFO');

    // Advanced AI Options
    const [useAiAnalysis, setUseAiAnalysis] = useState(true);
    const [concurrentAiRequests, setConcurrentAiRequests] = useState(15);
    const [aiEnrichmentBatchSize, setAiEnrichmentBatchSize] = useState(50);

    const logsEndRef = React.useRef<HTMLDivElement>(null);

    // Scroll to bottom of logs
    React.useEffect(() => {
        logsEndRef.current?.scrollIntoView({ behavior: "smooth" });
    }, [logs]);

    // Fetch user preferences
    React.useEffect(() => {
        const fetchPreferences = async () => {
            try {
                const res = await client.get('/users/me/preferences');
                if (res.data) {
                    if (res.data.ai_provider) setAiProvider(res.data.ai_provider);
                    if (res.data.api_key) setApiKey(res.data.api_key);
                    if (res.data.model_name) setModelName(res.data.model_name);
                    if (res.data.api_endpoint) setApiEndpoint(res.data.api_endpoint);
                    if (res.data.skip_dto_source !== undefined) setSkipDtoSource(res.data.skip_dto_source);
                    if (res.data.skip_dto_methods !== undefined) setSkipDtoMethods(res.data.skip_dto_methods);
                    if (res.data.scope) setScope(res.data.scope);

                    // Load Advanced Source Options
                    if (res.data.use_streaming_parse !== undefined) setUseStreamingParse(res.data.use_streaming_parse);
                    if (res.data.java_parse_workers) setJavaParseWorkers(res.data.java_parse_workers);
                    if (res.data.java_file_parse_timeout) setJavaFileParseTimeout(res.data.java_file_parse_timeout);
                    if (res.data.java_complexity_threshold) setJavaComplexityThreshold(res.data.java_complexity_threshold);
                    if (res.data.sequence_diagram_include_packages) setSequenceDiagramIncludePackages(res.data.sequence_diagram_include_packages);
                    if (res.data.log_level) setLogLevel(res.data.log_level);

                    // Load Advanced AI Options
                    if (res.data.use_ai_analysis !== undefined) setUseAiAnalysis(res.data.use_ai_analysis);
                    if (res.data.concurrent_ai_requests) setConcurrentAiRequests(res.data.concurrent_ai_requests);
                    if (res.data.ai_enrichment_batch_size) setAiEnrichmentBatchSize(res.data.ai_enrichment_batch_size);
                }
            } catch (err) {
                console.error("Failed to fetch preferences", err);
            }
        };
        fetchPreferences();
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
            }, 1000); // Poll every 1 second
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

    const handleSubmit = async (e: React.FormEvent) => {
        e.preventDefault();
        setIsLoading(true);
        setLogs([]);

        // Preferences object
        const preferences = {
            ai_provider: aiProvider,
            api_key: apiKey,
            model_name: modelName,
            api_endpoint: apiEndpoint,
            skip_dto_source: skipDtoSource,
            skip_dto_methods: skipDtoMethods,
            scope: scope,
            use_streaming_parse: useStreamingParse,
            java_parse_workers: javaParseWorkers,
            java_file_parse_timeout: javaFileParseTimeout,
            java_complexity_threshold: javaComplexityThreshold,
            sequence_diagram_include_packages: sequenceDiagramIncludePackages,
            log_level: logLevel,
            use_ai_analysis: useAiAnalysis,
            concurrent_ai_requests: concurrentAiRequests,
            ai_enrichment_batch_size: aiEnrichmentBatchSize
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
                formData.append('clean', 'false');

                // Advanced Source Options
                formData.append('use_streaming_parse', String(useStreamingParse));
                formData.append('java_parse_workers', String(javaParseWorkers));
                formData.append('java_file_parse_timeout', String(javaFileParseTimeout));
                formData.append('java_complexity_threshold', String(javaComplexityThreshold));
                if (sequenceDiagramIncludePackages) formData.append('sequence_diagram_include_packages', sequenceDiagramIncludePackages);
                formData.append('log_level', logLevel);

                // Advanced AI Options
                formData.append('use_ai_analysis', String(useAiAnalysis));
                if (useAiAnalysis) {
                    formData.append('use_ai', 'true'); // Backward compatibility
                    formData.append('ai_provider', aiProvider);
                    formData.append('concurrent_ai_requests', String(concurrentAiRequests));
                    formData.append('ai_enrichment_batch_size', String(aiEnrichmentBatchSize));
                    if (apiKey) formData.append('api_key', apiKey);
                    if (modelName) formData.append('model_name', modelName);
                    if (apiEndpoint) formData.append('api_endpoint', apiEndpoint);
                } else {
                    formData.append('use_ai', 'false');
                }

                // Standard Options
                formData.append('skip_dto_source', String(skipDtoSource));
                formData.append('skip_dto_methods', String(skipDtoMethods));
                formData.append('scope', scope);

                response = await client.post('/analysis/analyze/upload', formData);
            } else {
                const payload: any = {
                    source_folder: sourcePath,
                    project_name: projectName,
                    clean: false,

                    // Advanced Source Options
                    use_streaming_parse: useStreamingParse,
                    java_parse_workers: javaParseWorkers,
                    java_file_parse_timeout: javaFileParseTimeout,
                    java_complexity_threshold: javaComplexityThreshold,
                    sequence_diagram_include_packages: sequenceDiagramIncludePackages,
                    log_level: logLevel,

                    // Advanced AI Options
                    use_ai_analysis: useAiAnalysis,
                    use_ai: useAiAnalysis, // Backward compatibility

                    // Standard Options
                    skip_dto_source: skipDtoSource,
                    skip_dto_methods: skipDtoMethods,
                    scope: scope
                };

                if (useAiAnalysis) {
                    payload.ai_provider = aiProvider;
                    payload.concurrent_ai_requests = concurrentAiRequests;
                    payload.ai_enrichment_batch_size = aiEnrichmentBatchSize;
                    if (apiKey) payload.api_key = apiKey;
                    if (modelName) payload.model_name = modelName;
                    if (apiEndpoint) payload.api_endpoint = apiEndpoint;
                }

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

    return (
        <div className="max-w-4xl mx-auto space-y-8">
            <div>
                <h1 className="text-3xl font-bold text-slate-900">{t('analysis.title')}</h1>
                <p className="text-slate-500 mt-1">{t('analysis.subtitle')}</p>
            </div>

            <div className="grid grid-cols-1 lg:grid-cols-3 gap-8">
                {/* Main Form */}
                <div className="lg:col-span-2 space-y-6">
                    <div className="bg-white rounded-2xl shadow-sm border border-slate-100 overflow-hidden">
                        <div className="flex border-b border-slate-100">
                            <button
                                onClick={() => setMode('upload')}
                                className={`flex-1 py-4 text-sm font-medium flex items-center justify-center gap-2 transition-colors ${mode === 'upload'
                                    ? 'bg-indigo-50 text-indigo-600 border-b-2 border-indigo-600'
                                    : 'text-slate-500 hover:bg-slate-50'
                                    }`}
                            >
                                <Upload className="w-4 h-4" /> {t('analysis.uploadZip')}
                            </button>
                            <button
                                onClick={() => setMode('path')}
                                className={`flex-1 py-4 text-sm font-medium flex items-center justify-center gap-2 transition-colors ${mode === 'path'
                                    ? 'bg-indigo-50 text-indigo-600 border-b-2 border-indigo-600'
                                    : 'text-slate-500 hover:bg-slate-50'
                                    }`}
                            >
                                <Folder className="w-4 h-4" /> {t('analysis.serverPath')}
                            </button>
                        </div>

                        <form onSubmit={handleSubmit} className="p-6 space-y-6">
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
                                    <div className="relative">
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
                                </div>
                            )}

                            {/* Source Code Analysis Configuration Section */}
                            <div className="bg-white rounded-xl border border-slate-200 p-4 space-y-4">
                                <div className="flex items-center justify-between pb-2 border-b border-slate-100">
                                    <div className="flex items-center gap-2 font-semibold text-slate-700">
                                        <FileCode className="w-5 h-5 text-indigo-600" />
                                        <span>{t('analysis.sourceCodeAnalysisOptions')}</span>
                                    </div>
                                    <button
                                        type="button"
                                        onClick={async (e) => {
                                            e.stopPropagation();
                                            try {
                                                await client.put('/users/me/preferences', {
                                                    ai_provider: aiProvider,
                                                    api_key: apiKey,
                                                    model_name: modelName,
                                                    api_endpoint: apiEndpoint,
                                                    skip_dto_source: skipDtoSource,
                                                    skip_dto_methods: skipDtoMethods,
                                                    scope: scope,
                                                    use_streaming_parse: useStreamingParse,
                                                    java_parse_workers: javaParseWorkers,
                                                    java_file_parse_timeout: javaFileParseTimeout,
                                                    java_complexity_threshold: javaComplexityThreshold,
                                                    sequence_diagram_include_packages: sequenceDiagramIncludePackages,
                                                    log_level: logLevel,
                                                    use_ai_analysis: useAiAnalysis,
                                                    concurrent_ai_requests: concurrentAiRequests,
                                                    ai_enrichment_batch_size: aiEnrichmentBatchSize
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

                                {/* Top Toggles */}
                                <div className="grid grid-cols-1 md:grid-cols-2 gap-4">
                                    <label className="flex items-center gap-2 cursor-pointer">
                                        <input
                                            type="checkbox"
                                            checked={useAiAnalysis}
                                            onChange={(e) => setUseAiAnalysis(e.target.checked)}
                                            className="w-4 h-4 rounded text-indigo-600 focus:ring-indigo-500 border-gray-300"
                                        />
                                        <span className="text-sm text-slate-700">{t('analysis.enableAiAnalysis')}</span>
                                        <Tooltip text={t('analysis.enableAiAnalysisTooltip')} />
                                    </label>
                                    <label className="flex items-center gap-2 cursor-pointer">
                                        <input
                                            type="checkbox"
                                            checked={useStreamingParse}
                                            onChange={(e) => setUseStreamingParse(e.target.checked)}
                                            className="w-4 h-4 rounded text-indigo-600 focus:ring-indigo-500 border-gray-300"
                                        />
                                        <span className="text-sm text-slate-700">{t('analysis.useStreamingParse')}</span>
                                        <Tooltip text={t('analysis.useStreamingParseTooltip')} position="right-0" arrowPosition="right-2" />
                                    </label>
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
                                <div className="grid grid-cols-1 md:grid-cols-2 gap-4">
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

                            {/* AI Configuration Section */}
                            <div className="bg-white rounded-xl border border-slate-200 p-4 space-y-4">
                                <button
                                    type="button"
                                    onClick={() => setShowAdvanced(!showAdvanced)}
                                    className="flex items-center gap-2 font-semibold text-slate-700 hover:text-indigo-600 transition-colors"
                                >
                                    <Settings className="w-5 h-5 text-indigo-600" />
                                    <span>{t('analysis.aiAnalysisConfiguration')}</span>
                                    {showAdvanced ? <ChevronUp className="w-4 h-4 text-slate-400" /> : <ChevronDown className="w-4 h-4 text-slate-400" />}
                                </button>

                                {showAdvanced && (
                                    <div className="pt-4 space-y-4 border-t border-slate-100">
                                        <div className="space-y-4">
                                            {/* Row 1: Provider & Model */}
                                            <div className="grid grid-cols-1 md:grid-cols-2 gap-4">
                                                <div>
                                                    <label className="block text-sm font-medium text-slate-700 mb-1">{t('analysis.aiProvider')}</label>
                                                    <select
                                                        value={aiProvider}
                                                        onChange={(e) => setAiProvider(e.target.value)}
                                                        className="w-full px-3 py-2 rounded-lg border border-slate-200 focus:border-indigo-500 focus:ring-2 focus:ring-indigo-500/20 outline-none transition-all"
                                                    >
                                                        <option value="google">Google Gemini</option>
                                                        <option value="groq">Groq</option>
                                                        <option value="lmstudio">LM Studio</option>
                                                        <option value="openai">OpenAI</option>
                                                    </select>
                                                </div>
                                                <div>
                                                    <label className="block text-sm font-medium text-slate-700 mb-1">{t('analysis.modelName')}</label>
                                                    <input
                                                        type="text"
                                                        value={modelName}
                                                        onChange={(e) => setModelName(e.target.value)}
                                                        placeholder={aiProvider === 'google' ? 'gemini-1.5-flash' : 'Default Model'}
                                                        className="w-full px-3 py-2 rounded-lg border border-slate-200 focus:border-indigo-500 focus:ring-2 focus:ring-indigo-500/20 outline-none transition-all"
                                                    />
                                                </div>
                                            </div>

                                            {/* Row 2: API Key */}
                                            {(aiProvider !== 'lmstudio') && (
                                                <div>
                                                    <label className="block text-sm font-medium text-slate-700 mb-1">{t('analysis.apiKey')}</label>
                                                    <input
                                                        type="text"
                                                        value={apiKey}
                                                        onChange={(e) => setApiKey(e.target.value)}
                                                        placeholder={t('analysis.apiKeyPlaceholder')}
                                                        className="w-full px-3 py-2 rounded-lg border border-slate-200 focus:border-indigo-500 focus:ring-2 focus:ring-indigo-500/20 outline-none transition-all"
                                                    />
                                                </div>
                                            )}

                                            {/* Row 3: Endpoint */}
                                            <div>
                                                <label className="block text-sm font-medium text-slate-700 mb-1">{t('analysis.apiEndpoint')}</label>
                                                <input
                                                    type="text"
                                                    value={apiEndpoint}
                                                    onChange={(e) => setApiEndpoint(e.target.value)}
                                                    placeholder={aiProvider === 'lmstudio' ? "http://localhost:1234/v1" : "Optional (Default used if empty)"}
                                                    className="w-full px-3 py-2 rounded-lg border border-slate-200 focus:indigo-500 focus:ring-2 focus:ring-indigo-500/20 outline-none transition-all"
                                                />
                                            </div>

                                            {/* Row 4: Performance */}
                                            <div className="grid grid-cols-1 md:grid-cols-2 gap-4">
                                                <div>
                                                    <label className="flex items-center gap-1 text-sm font-medium text-slate-700 mb-1">
                                                        {t('analysis.concurrentRequests')} <Tooltip text={t('analysis.concurrentRequestsTooltip')} />
                                                    </label>
                                                    <input
                                                        type="number"
                                                        value={concurrentAiRequests}
                                                        onChange={(e) => setConcurrentAiRequests(parseInt(e.target.value) || 15)}
                                                        className="w-full px-3 py-2 rounded-lg border border-slate-200 focus:border-indigo-500 focus:ring-2 focus:ring-indigo-500/20 outline-none transition-all"
                                                    />
                                                </div>
                                                <div>
                                                    <label className="flex items-center gap-1 text-sm font-medium text-slate-700 mb-1">
                                                        {t('analysis.enrichmentBatchSize')} <Tooltip text={t('analysis.enrichmentBatchSizeTooltip')} position="right-0" arrowPosition="right-2" />
                                                    </label>
                                                    <input
                                                        type="number"
                                                        value={aiEnrichmentBatchSize}
                                                        onChange={(e) => setAiEnrichmentBatchSize(parseInt(e.target.value) || 50)}
                                                        className="w-full px-3 py-2 rounded-lg border border-slate-200 focus:border-indigo-500 focus:ring-2 focus:ring-indigo-500/20 outline-none transition-all"
                                                    />
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                )}
                            </div>


                            <button
                                type="submit"
                                disabled={isLoading || (mode === 'upload' && !file) || (mode === 'path' && !sourcePath)}
                                className="w-full flex items-center justify-center py-3 px-4 bg-indigo-600 hover:bg-indigo-700 text-white font-semibold rounded-xl shadow-lg shadow-indigo-500/30 transition-all duration-200 hover:-translate-y-0.5 disabled:opacity-50 disabled:cursor-not-allowed disabled:hover:translate-y-0"
                            >
                                {isLoading ? (
                                    <Loader2 className="w-5 h-5 animate-spin mr-2" />
                                ) : (
                                    <Play className="w-5 h-5 mr-2" />
                                )}
                                {isLoading ? t('analysis.startingAnalysis') : t('analysis.startAnalysis')}
                            </button>
                        </form>
                    </div>

                    {/* Terminal View */}
                    {
                        jobId && (
                            <div className="bg-slate-900 rounded-2xl shadow-lg overflow-hidden border border-slate-800">
                                <div className="flex items-center gap-2 px-4 py-3 bg-slate-800 border-b border-slate-700">
                                    <Terminal className="w-4 h-4 text-slate-400" />
                                    <span className="text-xs font-mono text-slate-400">{t('analysis.analysisLogs')}</span>
                                </div>
                                <div className="p-4 h-64 overflow-y-auto font-mono text-sm">
                                    {logs.length === 0 ? (
                                        <div className="text-slate-600 italic">{t('analysis.waitingForLogs')}</div>
                                    ) : (
                                        logs.map((log, index) => (
                                            <div key={index} className="text-emerald-400 mb-1 break-words">
                                                <span className="text-slate-500 mr-2">{log.split(' - ')[0]}</span>
                                                {log.split(' - ').slice(1).join(' - ')}
                                            </div>
                                        ))
                                    )}
                                    <div ref={logsEndRef} />
                                </div>
                            </div>
                        )
                    }
                </div >

                {/* Status Panel */}
                < div className="space-y-6" >
                    <div className="bg-white rounded-2xl shadow-sm border border-slate-100 p-6">
                        <h3 className="text-lg font-bold text-slate-900 mb-4 flex items-center gap-2">
                            <ActivityIcon className="w-5 h-5 text-indigo-600" />
                            {t('analysis.analysisStatus')}
                        </h3>

                        {jobId ? (
                            <div className="space-y-4">
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
                        ) : (
                            <div className="text-center py-8 text-slate-400">
                                <FileCode className="w-12 h-12 mx-auto mb-3 opacity-20" />
                                <p className="text-sm">{t('analysis.noAnalysisRunning')}</p>
                            </div>
                        )}
                    </div>

                    <div className="bg-gradient-to-br from-indigo-600 to-violet-600 rounded-2xl shadow-lg shadow-indigo-500/30 p-6 text-white">
                        <h3 className="font-bold text-lg mb-2">{t('analysis.proTip')}</h3>
                        <p className="text-indigo-100 text-sm leading-relaxed">
                            {t('analysis.proTipContent')}
                        </p>
                    </div>
                </div >
            </div >
        </div >
    );
};



export default Analysis;
