import React, { useState } from 'react';
import axios from 'axios';
import { Upload, Folder, Play, FileCode, CheckCircle, AlertCircle, Loader2, Terminal } from 'lucide-react';

const Analysis: React.FC = () => {
    const [file, setFile] = useState<File | null>(null);
    const [sourcePath, setSourcePath] = useState('');
    const [projectName, setProjectName] = useState('');
    const [jobId, setJobId] = useState('');
    const [status, setStatus] = useState('');
    const [mode, setMode] = useState<'upload' | 'path'>('upload');
    const [isLoading, setIsLoading] = useState(false);

    const handleFileChange = (e: React.ChangeEvent<HTMLInputElement>) => {
        if (e.target.files) {
            setFile(e.target.files[0]);
        }
    };

    const handleSubmit = async (e: React.FormEvent) => {
        e.preventDefault();
        setIsLoading(true);
        try {
            let response;
            if (mode === 'upload' && file) {
                const formData = new FormData();
                formData.append('file', file);
                if (projectName) formData.append('project_name', projectName);
                response = await axios.post('/api/v1/analysis/analyze/upload', formData);
            } else {
                response = await axios.post('/api/v1/analysis/analyze', {
                    source_folder: sourcePath,
                    project_name: projectName
                });
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
                <h1 className="text-3xl font-bold text-slate-900">Start Analysis</h1>
                <p className="text-slate-500 mt-1">Upload source code or provide a server path to begin analysis</p>
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
                                <Upload className="w-4 h-4" /> Upload Zip
                            </button>
                            <button
                                onClick={() => setMode('path')}
                                className={`flex-1 py-4 text-sm font-medium flex items-center justify-center gap-2 transition-colors ${mode === 'path'
                                        ? 'bg-indigo-50 text-indigo-600 border-b-2 border-indigo-600'
                                        : 'text-slate-500 hover:bg-slate-50'
                                    }`}
                            >
                                <Folder className="w-4 h-4" /> Server Path
                            </button>
                        </div>

                        <form onSubmit={handleSubmit} className="p-6 space-y-6">
                            <div>
                                <label className="block text-sm font-semibold text-slate-700 mb-2">Project Name <span className="text-slate-400 font-normal">(Optional)</span></label>
                                <input
                                    type="text"
                                    placeholder="e.g. My Awesome Project"
                                    value={projectName}
                                    onChange={(e) => setProjectName(e.target.value)}
                                    className="w-full px-4 py-2.5 rounded-xl border border-slate-200 focus:border-indigo-500 focus:ring-4 focus:ring-indigo-500/10 transition-all duration-200 outline-none text-slate-800"
                                />
                            </div>

                            {mode === 'upload' ? (
                                <div>
                                    <label className="block text-sm font-semibold text-slate-700 mb-2">Source File</label>
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
                                            {file ? file.name : "Click to upload or drag and drop"}
                                        </p>
                                        <p className="text-xs text-slate-400 mt-1">ZIP files only</p>
                                    </div>
                                </div>
                            ) : (
                                <div>
                                    <label className="block text-sm font-semibold text-slate-700 mb-2">Server Source Path</label>
                                    <div className="relative">
                                        <div className="absolute inset-y-0 left-0 pl-3 flex items-center pointer-events-none">
                                            <Terminal className="h-5 w-5 text-slate-400" />
                                        </div>
                                        <input
                                            type="text"
                                            placeholder="/path/to/source/code"
                                            value={sourcePath}
                                            onChange={(e) => setSourcePath(e.target.value)}
                                            className="w-full pl-10 pr-4 py-2.5 rounded-xl border border-slate-200 focus:border-indigo-500 focus:ring-4 focus:ring-indigo-500/10 transition-all duration-200 outline-none text-slate-800 font-mono text-sm"
                                        />
                                    </div>
                                </div>
                            )}

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
                                {isLoading ? 'Starting Analysis...' : 'Start Analysis'}
                            </button>
                        </form>
                    </div>
                </div>

                {/* Status Panel */}
                <div className="space-y-6">
                    <div className="bg-white rounded-2xl shadow-sm border border-slate-100 p-6">
                        <h3 className="text-lg font-bold text-slate-900 mb-4 flex items-center gap-2">
                            <Activity className="w-5 h-5 text-indigo-600" />
                            Analysis Status
                        </h3>

                        {jobId ? (
                            <div className="space-y-4">
                                <div className="p-4 bg-slate-50 rounded-xl border border-slate-100">
                                    <div className="text-xs text-slate-500 uppercase tracking-wider font-semibold mb-1">Job ID</div>
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
                                        <div className="text-xs text-indigo-600 uppercase tracking-wider font-semibold">Current Status</div>
                                        <div className="font-bold text-indigo-900 capitalize">{status || 'Pending...'}</div>
                                    </div>
                                </div>
                            </div>
                        ) : (
                            <div className="text-center py-8 text-slate-400">
                                <FileCode className="w-12 h-12 mx-auto mb-3 opacity-20" />
                                <p className="text-sm">No analysis running</p>
                            </div>
                        )}
                    </div>

                    <div className="bg-gradient-to-br from-indigo-600 to-violet-600 rounded-2xl shadow-lg shadow-indigo-500/30 p-6 text-white">
                        <h3 className="font-bold text-lg mb-2">Pro Tip</h3>
                        <p className="text-indigo-100 text-sm leading-relaxed">
                            For large projects, using the Server Path option is faster as it avoids uploading large files through the browser.
                        </p>
                    </div>
                </div>
            </div>
        </div>
    );
};

// Helper component for icons
const Activity = ({ className }: { className?: string }) => (
    <svg className={className} fill="none" viewBox="0 0 24 24" stroke="currentColor">
        <path strokeLinecap="round" strokeLinejoin="round" strokeWidth={2} d="M13 10V3L4 14h7v7l9-11h-7z" />
    </svg>
);

export default Analysis;
