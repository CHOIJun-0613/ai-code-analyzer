import React, { useState, useEffect } from 'react';
import { useTranslation } from 'react-i18next';
import client from '../api/client';
import { Save, RotateCw, Settings as SettingsIcon, BrainCircuit } from 'lucide-react';

// Shared styling classes
const cardClass = "bg-white p-6 rounded-2xl shadow-sm border border-slate-200 transition-all hover:shadow-md";
const labelClass = "block text-sm font-semibold text-slate-700 mb-2 flex items-center gap-2";
const inputClass = "w-full px-4 py-2.5 bg-slate-50 border border-slate-200 rounded-xl focus:ring-2 focus:ring-indigo-500/20 focus:border-indigo-500 outline-none transition-all duration-200 text-sm";
const descriptionClass = "text-xs text-slate-500 mt-1 ml-1";

interface AiConfig {
    provider: string;
    model_name: string;
    api_key: string;
    api_endpoint: string;
    concurrent_requests: number;
    enrichment_batch_size: number;
}

const CodeAiAnalysis: React.FC = () => {
    const { t } = useTranslation();

    // Local state for AI Config form
    const [aiConfig, setAiConfig] = useState<AiConfig>({
        provider: 'openai',
        model_name: 'gpt-4o',
        api_key: '',
        api_endpoint: '',
        concurrent_requests: 5,
        enrichment_batch_size: 10
    });

    const [isSaving, setIsSaving] = useState(false);

    useEffect(() => {
        const loadPreferences = async () => {
            try {
                const res = await client.get('/users/me/preferences/ai');
                if (res.data) {
                    setAiConfig(prev => ({
                        ...prev,
                        provider: res.data.ai_provider || prev.provider,
                        model_name: res.data.model_name || prev.model_name,
                        api_key: res.data.api_key || prev.api_key,
                        api_endpoint: res.data.api_endpoint || prev.api_endpoint,
                        concurrent_requests: res.data.concurrent_ai_requests || prev.concurrent_requests,
                        enrichment_batch_size: res.data.ai_enrichment_batch_size || prev.enrichment_batch_size
                    }));
                }
            } catch (err) {
                console.error("Failed to load preferences from backend", err);
            }
        };
        loadPreferences();
    }, []);

    const handleSaveSettings = async () => {
        setIsSaving(true);
        try {
            // Save to backend
            const preferences = {
                ai_provider: aiConfig.provider,
                model_name: aiConfig.model_name,
                api_key: aiConfig.api_key,
                api_endpoint: aiConfig.api_endpoint,
                concurrent_ai_requests: aiConfig.concurrent_requests,
                ai_enrichment_batch_size: aiConfig.enrichment_batch_size
            };

            await client.put('/users/me/preferences/ai', preferences);

            // Simulate a small delay for UX
            await new Promise(resolve => setTimeout(resolve, 500));
            alert("Settings saved successfully!");
        } catch (error) {
            console.error("Failed to save settings", error);
            alert("Failed to save settings to server.");
        } finally {
            setIsSaving(false);
        }
    };

    return (
        <div className="max-w-5xl mx-auto space-y-8">
            <div className="flex flex-col gap-2">
                <div className="flex items-center gap-3">
                    <div className="p-3 bg-violet-500/10 rounded-xl">
                        <BrainCircuit className="w-8 h-8 text-violet-600" />
                    </div>
                    <div>
                        <h1 className="text-3xl font-bold text-slate-900">{t('analysis.aiTitle') || "Code AI Analysis"}</h1>
                        <p className="text-slate-500 mt-1">{t('analysis.aiSubtitle') || "Configure AI models and parameters for deep code analysis."}</p>
                    </div>
                </div>
            </div>

            <div className={cardClass}>
                <div className="flex items-center justify-between mb-6 border-b border-slate-100 pb-4">
                    <h2 className="text-lg font-bold text-slate-800 flex items-center gap-2">
                        <SettingsIcon className="w-5 h-5 text-indigo-500" />
                        {t('analysis.aiAnalysisConfiguration') || "AI Analysis Configuration"}
                    </h2>
                </div>

                <div className="grid grid-cols-1 md:grid-cols-2 gap-6">
                    {/* Provider */}
                    <div>
                        <label className={labelClass}>{t('analysis.aiProvider')}</label>
                        <select
                            value={aiConfig.provider}
                            onChange={(e) => setAiConfig({ ...aiConfig, provider: e.target.value })}
                            className={inputClass}
                        >
                            <option value="openai">OpenAI</option>
                            <option value="anthropic">Anthropic</option>
                            <option value="google">Google Gemini</option>
                            <option value="azure">Azure OpenAI</option>
                            <option value="ollama">Ollama (Local)</option>
                        </select>
                    </div>

                    {/* Model Name */}
                    <div>
                        <label className={labelClass}>{t('analysis.modelName')}</label>
                        <input
                            type="text"
                            value={aiConfig.model_name}
                            onChange={(e) => setAiConfig({ ...aiConfig, model_name: e.target.value })}
                            className={inputClass}
                            placeholder="e.g. gpt-4o, claude-3-opus"
                        />
                    </div>

                    {/* API Key */}
                    <div className="md:col-span-2">
                        <label className={labelClass}>{t('analysis.apiKey')}</label>
                        <input
                            type="password"
                            value={aiConfig.api_key}
                            onChange={(e) => setAiConfig({ ...aiConfig, api_key: e.target.value })}
                            className={inputClass}
                            placeholder={t('analysis.apiKeyPlaceholder') || "Enter your API Key"}
                        />
                    </div>

                    {/* Endpoint */}
                    <div className="md:col-span-2">
                        <label className={labelClass}>{t('analysis.apiEndpoint')}</label>
                        <input
                            type="text"
                            value={aiConfig.api_endpoint}
                            onChange={(e) => setAiConfig({ ...aiConfig, api_endpoint: e.target.value })}
                            className={inputClass}
                            placeholder="Optional: Custom API Endpoint"
                        />
                    </div>

                    {/* Concurrent Requests */}
                    <div>
                        <label className={labelClass}>{t('analysis.concurrentRequests')}</label>
                        <input
                            type="number"
                            value={aiConfig.concurrent_requests}
                            onChange={(e) => setAiConfig({ ...aiConfig, concurrent_requests: parseInt(e.target.value) || 1 })}
                            min={1}
                            max={50}
                            className={inputClass}
                        />
                        <p className={descriptionClass}>{t('analysis.concurrentRequestsTooltip')}</p>
                    </div>

                    {/* Enrichment Batch Size */}
                    <div>
                        <label className={labelClass}>{t('analysis.enrichmentBatchSize')}</label>
                        <input
                            type="number"
                            value={aiConfig.enrichment_batch_size}
                            onChange={(e) => setAiConfig({ ...aiConfig, enrichment_batch_size: parseInt(e.target.value) || 1 })}
                            min={1}
                            max={100}
                            className={inputClass}
                        />
                        <p className={descriptionClass}>{t('analysis.enrichmentBatchSizeTooltip')}</p>
                    </div>
                </div>

                <div className="mt-8 flex justify-end gap-3">
                    <button
                        onClick={async () => {
                            try {
                                const res = await client.get('/users/me/preferences/ai');
                                if (res.data) {
                                    setAiConfig(prev => ({
                                        ...prev,
                                        provider: res.data.ai_provider || prev.provider,
                                        model_name: res.data.model_name || prev.model_name,
                                        api_key: res.data.api_key || prev.api_key,
                                        api_endpoint: res.data.api_endpoint || prev.api_endpoint,
                                        concurrent_requests: res.data.concurrent_ai_requests || prev.concurrent_requests,
                                        enrichment_batch_size: res.data.ai_enrichment_batch_size || prev.enrichment_batch_size
                                    }));
                                    alert("Settings loaded successfully!");
                                }
                            } catch (err) {
                                console.error("Failed to load preferences", err);
                                alert("Failed to load settings.");
                            }
                        }}
                        className="px-6 py-2.5 bg-white text-slate-600 rounded-xl hover:bg-slate-50 border border-slate-200 transition-all font-medium"
                    >
                        {t('analysis.loadSettings') || "Load Settings"}
                    </button>
                    <button
                        onClick={handleSaveSettings}
                        disabled={isSaving}
                        className={`flex items-center gap-2 px-6 py-2.5 bg-indigo-600 text-white rounded-xl hover:bg-indigo-700 shadow-md shadow-indigo-200 transition-all ${isSaving ? 'opacity-70 cursor-not-allowed' : ''}`}
                    >
                        {isSaving ? <RotateCw className="w-4 h-4 animate-spin" /> : <Save className="w-4 h-4" />}
                        {t('analysis.saveSettings') || "Save Settings"}
                    </button>
                </div>
            </div>
        </div>
    );
};

export default CodeAiAnalysis;
