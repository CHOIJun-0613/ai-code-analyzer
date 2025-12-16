import React, { useEffect, useState } from 'react';
import { useParams, useNavigate, useSearchParams } from 'react-router-dom';
import axios from 'axios';
import {
    ArrowLeft, Code2, FileCode, Box, Braces,
    AlignLeft, Cpu, Database, GitBranch, Info
} from 'lucide-react';
import Markdown from 'react-markdown';
import remarkGfm from 'remark-gfm';

interface Field {
    name: string;
    type: string;
    description?: string;
    initial_value?: string;
    modifiers_json?: string;
}

interface Method {
    name: string;
    return_type: string;
    parameters?: string; // JSON string
    description?: string;
    PLOC?: number;
    cognitive_complexity?: number;
    visibility?: string;
}

interface ClassData {
    name: string;
    package_name: string;
    type: string;
    sub_type?: string;
    description?: string;
    ai_description?: string;
    source?: string;
    superclass?: string;
    interfaces?: string[];
    annotations?: string[];
    PLOC?: number;
    LLOC?: number;
    code_complexity?: number;
    fields: Field[];
    methods: Method[];
}

const ClassDetails: React.FC = () => {
    const { projectName, className } = useParams<{ projectName: string; className: string }>();
    const [searchParams] = useSearchParams();
    const packageName = searchParams.get('package');
    const navigate = useNavigate();

    const [classData, setClassData] = useState<ClassData | null>(null);
    const [isLoading, setIsLoading] = useState(true);
    const [error, setError] = useState<string | null>(null);
    const [activeTab, setActiveTab] = useState<'info' | 'source' | 'methods' | 'fields'>('info');

    useEffect(() => {
        const fetchClassDetails = async () => {
            if (!projectName || !className || !packageName) return;
            setIsLoading(true);
            try {
                const { data } = await axios.get(`/api/v1/projects/${projectName}/classes/${className}`, {
                    params: { package: packageName }
                });
                setClassData(data);
            } catch (err) {
                console.error("Failed to fetch class details", err);
                setError("Failed to load class details.");
            } finally {
                setIsLoading(false);
            }
        };

        fetchClassDetails();
    }, [projectName, className, packageName]);

    if (isLoading) {
        return (
            <div className="flex items-center justify-center h-screen bg-slate-50">
                <div className="w-12 h-12 border-4 border-indigo-500 border-t-transparent rounded-full animate-spin" />
            </div>
        );
    }

    if (error || !classData) {
        return (
            <div className="p-8 text-center text-slate-500">
                <h2 className="text-xl font-bold mb-2">Class not found</h2>
                <p className="mb-4">{error || "Could not retrieve class details."}</p>
                <button
                    onClick={() => navigate(-1)}
                    className="px-4 py-2 bg-indigo-600 text-white rounded-lg hover:bg-indigo-700 transition-colors"
                >
                    Go Back
                </button>
            </div>
        );
    }

    return (
        <div className="space-y-6 animate-in fade-in duration-500 pb-12">
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
                    <div className={`p-3 rounded-xl ${classData.type === 'interface' ? 'bg-amber-50 text-amber-600' : 'bg-indigo-50 text-indigo-600'}`}>
                        {classData.type === 'interface' ? <FileCode className="w-8 h-8" /> : <Code2 className="w-8 h-8" />}
                    </div>
                    <div>
                        <div className="flex items-center gap-3">
                            <h1 className="text-3xl font-bold text-slate-900">{classData.name}</h1>
                            <span className={`px-2 py-0.5 rounded-full text-xs font-medium uppercase border ${classData.type === 'interface' ? 'bg-amber-50 text-amber-700 border-amber-100' : 'bg-slate-100 text-slate-600 border-slate-200'}`}>
                                {classData.type}
                            </span>
                            {classData.sub_type && (
                                <span className="px-2 py-0.5 rounded-full text-xs font-medium bg-indigo-50 text-indigo-700 border border-indigo-100 uppercase">
                                    {classData.sub_type}
                                </span>
                            )}
                        </div>
                        <p className="text-slate-500 font-mono text-sm mt-1">{classData.package_name}</p>
                    </div>
                </div>
            </div>

            {/* Metrics Cards */}
            <div className="grid grid-cols-1 md:grid-cols-4 gap-4">
                <div className="bg-white p-4 rounded-xl border border-slate-100 shadow-sm">
                    <div className="flex items-center gap-2 mb-2 text-slate-500 text-sm font-medium">
                        <AlignLeft className="w-4 h-4" /> Lines of Code
                    </div>
                    <div className="flex items-baseline gap-2">
                        <span className="text-2xl font-bold text-slate-900">{classData.PLOC?.toLocaleString() || '-'}</span>
                        <span className="text-xs text-slate-400">LOC</span>
                    </div>
                    {classData.LLOC && <div className="text-xs text-slate-400 mt-1">{classData.LLOC.toLocaleString()} logical lines</div>}
                </div>

                {/* Complexity Card with Tooltip */}
                <div className="bg-white p-4 rounded-xl border border-slate-100 shadow-sm relative group overflow-visible">
                    <div className="flex items-center justify-between mb-2">
                        <div className="flex items-center gap-2 text-slate-500 text-sm font-medium">
                            <Cpu className="w-4 h-4" /> Complexity
                        </div>
                        <div className="relative">
                            <Info className="w-4 h-4 text-slate-300 cursor-help hover:text-indigo-500 transition-colors" />
                            {/* Tooltip Popup */}
                            <div className="absolute top-6 left-1/2 -translate-x-1/2 md:left-auto md:translate-x-0 md:right-[-10px] w-80 p-5 bg-white rounded-xl shadow-[0_10px_40px_-10px_rgba(0,0,0,0.2)] border border-slate-200 z-50 hidden group-hover:block animate-in fade-in zoom-in-95 duration-200">
                                <div className="absolute -top-2 right-1.5 w-4 h-4 bg-white border-t border-l border-slate-200 rotate-45"></div>
                                <h5 className="font-bold text-slate-900 mb-2 text-sm flex items-center gap-2">
                                    코드 복잡도 (Weighted Sum)
                                </h5>
                                <p className="text-xs text-slate-600 leading-relaxed mb-3">
                                    코드 구성 요소에 <strong>가중치</strong>를 부여하여 산출한 유지보수 난이도 지표입니다.
                                </p>

                                <div className="space-y-3">
                                    <div className="bg-slate-50 p-3 rounded border border-slate-100">
                                        <div className="text-xs font-semibold text-slate-700 mb-2">산정 기준</div>
                                        <ul className="text-xs text-slate-500 space-y-1 font-mono">
                                            <li className="flex justify-between"><span>Lines</span> <span>× 1</span></li>
                                            <li className="flex justify-between"><span>Fields</span> <span>× 2</span></li>
                                            <li className="flex justify-between"><span>Methods</span> <span>× 5</span></li>
                                            <li className="flex justify-between"><span>Inner Classes</span> <span>× 10</span></li>
                                            <li className="flex justify-between"><span>Annotations</span> <span>× 1</span></li>
                                        </ul>
                                    </div>

                                    <div>
                                        <div className="text-xs font-semibold text-slate-700 mb-1">참고 기준</div>
                                        <div className="grid grid-cols-[60px_1fr] gap-2 text-xs border-t border-slate-100 pt-2">
                                            <div className="font-mono text-emerald-600 font-bold">~ 2k</div>
                                            <div className="text-slate-600">Normal (일반 클래스)</div>

                                            <div className="font-mono text-amber-600 font-bold">~ 5k</div>
                                            <div className="text-slate-600">Large (대형 서비스)</div>

                                            <div className="font-mono text-red-600 font-bold">5k +</div>
                                            <div className="text-slate-600">High (리팩토링 필요)</div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                    {(() => {
                        const score = classData.code_complexity || 0;
                        let colorClass = 'text-slate-900';
                        let label = '';

                        if (score >= 5000) {
                            colorClass = 'text-red-600';
                            label = 'High';
                        } else if (score >= 2000) {
                            colorClass = 'text-amber-600';
                            label = 'Large';
                        } else {
                            colorClass = 'text-emerald-600';
                            label = 'Normal';
                        }

                        return (
                            <div className="flex items-baseline gap-2">
                                <span className={`text-2xl font-bold ${colorClass}`}>{score.toLocaleString()}</span>
                                <span className={`text-xs font-medium ${colorClass} bg-opacity-10 px-1.5 py-0.5 rounded border border-current`}>
                                    {label}
                                </span>
                            </div>
                        );
                    })()}
                </div>

                <div className="bg-white p-4 rounded-xl border border-slate-100 shadow-sm">
                    <div className="flex items-center gap-2 mb-2 text-slate-500 text-sm font-medium">
                        <Braces className="w-4 h-4" /> Methods
                    </div>
                    <span className="text-2xl font-bold text-slate-900">{classData.methods.length}</span>
                </div>
                <div className="bg-white p-4 rounded-xl border border-slate-100 shadow-sm">
                    <div className="flex items-center gap-2 mb-2 text-slate-500 text-sm font-medium">
                        <Database className="w-4 h-4" /> Fields
                    </div>
                    <span className="text-2xl font-bold text-slate-900">{classData.fields.length}</span>
                </div>
            </div>

            {/* Inheritance Info */}
            {(classData.superclass || (classData.interfaces && classData.interfaces.length > 0)) && (
                <div className="bg-white p-4 rounded-xl border border-slate-100 shadow-sm flex flex-col md:flex-row gap-6 text-sm">
                    {classData.superclass && (
                        <div className="flex items-center gap-2">
                            <span className="text-slate-500 font-medium">Extends:</span>
                            <span className="font-mono text-indigo-600 bg-indigo-50 px-2 py-0.5 rounded flex items-center gap-1">
                                <GitBranch className="w-3 h-3" /> {classData.superclass}
                            </span>
                        </div>
                    )}
                    {classData.interfaces && classData.interfaces.length > 0 && (
                        <div className="flex items-center gap-2">
                            <span className="text-slate-500 font-medium">Implements:</span>
                            <div className="flex flex-wrap gap-2">
                                {classData.interfaces.map((iface, idx) => (
                                    <span key={idx} className="font-mono text-amber-700 bg-amber-50 px-2 py-0.5 rounded">
                                        {iface}
                                    </span>
                                ))}
                            </div>
                        </div>
                    )}
                </div>
            )}

            {/* Main Content Tabs */}
            <div className="bg-white rounded-2xl border border-slate-100 shadow-sm overflow-hidden min-h-[500px]">
                <div className="flex border-b border-slate-100 overflow-x-auto">
                    {['info', 'source', 'methods', 'fields'].map((tab) => (
                        <button
                            key={tab}
                            onClick={() => setActiveTab(tab as any)}
                            className={`px-6 py-4 text-sm font-medium transition-colors border-b-2 whitespace-nowrap ${activeTab === tab
                                ? 'border-indigo-600 text-indigo-700 bg-indigo-50/10'
                                : 'border-transparent text-slate-500 hover:text-slate-700 hover:bg-slate-50'
                                }`}
                        >
                            {tab.charAt(0).toUpperCase() + tab.slice(1)}
                        </button>
                    ))}
                </div>

                <div className="p-6">
                    {activeTab === 'info' && (
                        <div className="space-y-6">
                            {classData.ai_description && (
                                <div>
                                    <h3 className="text-lg font-bold text-slate-900 mb-3 flex items-center gap-2">
                                        <Box className="w-5 h-5 text-indigo-500" /> AI Summary
                                    </h3>
                                    <div className="prose prose-slate max-w-none bg-slate-50 p-6 rounded-xl border border-slate-100">
                                        <Markdown remarkPlugins={[remarkGfm]}>{classData.ai_description}</Markdown>
                                    </div>
                                </div>
                            )}
                            {classData.description && (
                                <div>
                                    <h3 className="text-lg font-bold text-slate-900 mb-3">Description</h3>
                                    <p className="text-slate-600 leading-relaxed">{classData.description}</p>
                                </div>
                            )}
                            {classData.annotations && classData.annotations.length > 0 && (
                                <div>
                                    <h3 className="text-lg font-bold text-slate-900 mb-3">Annotations</h3>
                                    <div className="flex flex-wrap gap-2">
                                        {classData.annotations.map((anno, idx) => (
                                            <span key={idx} className="bg-purple-50 text-purple-700 px-3 py-1 rounded-full text-sm font-mono border border-purple-100">
                                                @{anno}
                                            </span>
                                        ))}
                                    </div>
                                </div>
                            )}
                        </div>
                    )}

                    {activeTab === 'source' && (
                        <div className="h-full">
                            <div className="bg-[#1e1e1e] rounded-xl overflow-hidden text-sm border border-slate-900/10 shadow-inner h-[600px] flex font-mono">
                                <div className="overflow-auto w-full h-full flex">
                                    <div className="flex-none min-h-full bg-[#1e1e1e] border-r border-[#333] flex flex-col text-right py-4 pr-3 pl-4 select-none text-[#6e7681] sticky left-0 z-10">
                                        {(classData.source || '').split('\n').map((_, i) => (
                                            <span key={i} className="leading-6">{i + 1}</span>
                                        ))}
                                    </div>
                                    <div className="flex-1 min-h-full min-w-0 bg-[#1e1e1e]">
                                        <pre className="m-0 p-4 leading-6 whitespace-pre text-[#d4d4d4] font-mono">
                                            {classData.source || '// No source code available'}
                                        </pre>
                                    </div>
                                </div>
                            </div>
                        </div>
                    )}

                    {activeTab === 'methods' && (
                        <div>
                            <h3 className="text-lg font-bold text-slate-900 mb-4 px-1">Methods ({classData.methods.length})</h3>
                            {classData.methods.length === 0 ? (
                                <p className="text-slate-500 italic px-1">No methods found.</p>
                            ) : (
                                <div className="overflow-x-auto">
                                    <table className="w-full text-left border-collapse">
                                        <thead>
                                            <tr className="border-b border-slate-200 text-xs text-slate-500 uppercase bg-slate-50/50">
                                                <th className="px-4 py-3 font-semibold">Name</th>
                                                <th className="px-4 py-3 font-semibold">Return Type</th>
                                                <th className="px-4 py-3 font-semibold">Visibility</th>
                                                <th className="px-4 py-3 font-semibold text-right">Complexity</th>
                                                <th className="px-4 py-3 font-semibold text-right">LOC</th>
                                            </tr>
                                        </thead>
                                        <tbody className="divide-y divide-slate-100">
                                            {classData.methods.map((method, idx) => (
                                                <tr key={idx} className="hover:bg-slate-50 transition-colors">
                                                    <td className="px-4 py-3 font-medium text-slate-900 font-mono text-sm">{method.name}</td>
                                                    <td className="px-4 py-3 text-slate-600 font-mono text-xs">{method.return_type}</td>
                                                    <td className="px-4 py-3 text-slate-500 text-xs lowercase">{method.visibility || '-'}</td>
                                                    <td className="px-4 py-3 text-right text-slate-600 text-sm">{method.cognitive_complexity || '-'}</td>
                                                    <td className="px-4 py-3 text-right text-slate-600 text-sm">{method.PLOC || '-'}</td>
                                                </tr>
                                            ))}
                                        </tbody>
                                    </table>
                                </div>
                            )}
                        </div>
                    )}

                    {activeTab === 'fields' && (
                        <div>
                            <h3 className="text-lg font-bold text-slate-900 mb-4 px-1">Fields ({classData.fields.length})</h3>
                            {classData.fields.length === 0 ? (
                                <p className="text-slate-500 italic px-1">No fields found.</p>
                            ) : (
                                <div className="overflow-x-auto">
                                    <table className="w-full text-left border-collapse">
                                        <thead>
                                            <tr className="border-b border-slate-200 text-xs text-slate-500 uppercase bg-slate-50/50">
                                                <th className="px-4 py-3 font-semibold">Name</th>
                                                <th className="px-4 py-3 font-semibold">Type</th>
                                                <th className="px-4 py-3 font-semibold">Initial Value</th>
                                            </tr>
                                        </thead>
                                        <tbody className="divide-y divide-slate-100">
                                            {classData.fields.map((field, idx) => (
                                                <tr key={idx} className="hover:bg-slate-50 transition-colors">
                                                    <td className="px-4 py-3 font-medium text-slate-900 font-mono text-sm">{field.name}</td>
                                                    <td className="px-4 py-3 text-indigo-600 font-mono text-xs">{field.type}</td>
                                                    <td className="px-4 py-3 text-slate-500 font-mono text-xs truncate max-w-[200px]">{field.initial_value || '-'}</td>
                                                </tr>
                                            ))}
                                        </tbody>
                                    </table>
                                </div>
                            )}
                        </div>
                    )}
                </div>
            </div>
        </div>
    );
};

export default ClassDetails;
