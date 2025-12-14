import React from 'react';
import { useParams, useNavigate } from 'react-router-dom';
import { ArrowLeft, Code2, FileCode } from 'lucide-react';

const ClassDetails: React.FC = () => {
    const { projectName, className } = useParams<{ projectName: string; className: string }>();
    const navigate = useNavigate();

    return (
        <div className="space-y-8 animate-in fade-in duration-500">
            {/* Header */}
            <div>
                <button
                    onClick={() => navigate(-1)}
                    className="flex items-center text-slate-500 hover:text-indigo-600 mb-4 transition-colors group"
                >
                    <ArrowLeft className="w-4 h-4 mr-1 group-hover:-translate-x-1 transition-transform" />
                    Back
                </button>
                <div className="flex items-center gap-4">
                    <div className="p-3 bg-emerald-50 rounded-xl">
                        <FileCode className="w-8 h-8 text-emerald-600" />
                    </div>
                    <div>
                        <h1 className="text-3xl font-bold text-slate-900">{className}</h1>
                        <p className="text-slate-500">Project: {projectName}</p>
                    </div>
                </div>
            </div>

            {/* Content Placeholder */}
            <div className="bg-white p-8 rounded-2xl shadow-sm border border-slate-100 min-h-[400px] flex flex-col items-center justify-center text-center">
                <Code2 className="w-16 h-16 text-slate-200 mb-4" />
                <h3 className="text-xl font-medium text-slate-900 mb-2">Class Analysis</h3>
                <p className="text-slate-500 max-w-md">
                    Detailed analysis, source code, and relationships for <span className="font-mono text-indigo-600">{className}</span> will appear here.
                </p>
                <div className="mt-8 p-4 bg-slate-50 rounded-lg border border-slate-200 text-sm text-slate-500">
                    Feature currently under development
                </div>
            </div>
        </div>
    );
};

export default ClassDetails;
