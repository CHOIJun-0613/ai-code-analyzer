import React, { useState } from 'react';
import axios from 'axios';

const Analysis: React.FC = () => {
    const [file, setFile] = useState<File | null>(null);
    const [sourcePath, setSourcePath] = useState('');
    const [projectName, setProjectName] = useState('');
    const [jobId, setJobId] = useState('');
    const [status, setStatus] = useState('');
    const [mode, setMode] = useState<'upload' | 'path'>('upload');

    const handleFileChange = (e: React.ChangeEvent<HTMLInputElement>) => {
        if (e.target.files) {
            setFile(e.target.files[0]);
        }
    };

    const handleSubmit = async (e: React.FormEvent) => {
        e.preventDefault();
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
        }
    };

    return (
        <div>
            <h1 className="text-2xl font-bold mb-4">Start Analysis</h1>
            <div className="bg-white p-6 rounded shadow mb-6">
                <div className="mb-4">
                    <label className="mr-4">
                        <input
                            type="radio"
                            value="upload"
                            checked={mode === 'upload'}
                            onChange={() => setMode('upload')}
                            className="mr-1"
                        />
                        Upload File (Zip)
                    </label>
                    <label>
                        <input
                            type="radio"
                            value="path"
                            checked={mode === 'path'}
                            onChange={() => setMode('path')}
                            className="mr-1"
                        />
                        Server Path
                    </label>
                </div>

                <form onSubmit={handleSubmit}>
                    <div className="mb-4">
                        <label className="block mb-1">Project Name (Optional)</label>
                        <input
                            type="text"
                            value={projectName}
                            onChange={(e) => setProjectName(e.target.value)}
                            className="w-full p-2 border rounded"
                        />
                    </div>

                    {mode === 'upload' ? (
                        <div className="mb-4">
                            <label className="block mb-1">Source File (.zip)</label>
                            <input
                                type="file"
                                accept=".zip"
                                onChange={handleFileChange}
                                className="w-full p-2 border rounded"
                            />
                        </div>
                    ) : (
                        <div className="mb-4">
                            <label className="block mb-1">Server Source Path</label>
                            <input
                                type="text"
                                value={sourcePath}
                                onChange={(e) => setSourcePath(e.target.value)}
                                className="w-full p-2 border rounded"
                            />
                        </div>
                    )}

                    <button type="submit" className="px-4 py-2 bg-blue-500 text-white rounded hover:bg-blue-600">
                        Start Analysis
                    </button>
                </form>
            </div>

            {jobId && (
                <div className="bg-white p-6 rounded shadow">
                    <h2 className="text-xl font-bold mb-2">Analysis Status</h2>
                    <p>Job ID: {jobId}</p>
                    <p>Status: {status}</p>
                    {/* TODO: Add polling for status updates */}
                </div>
            )}
        </div>
    );
};

export default Analysis;
