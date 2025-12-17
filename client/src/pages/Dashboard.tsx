import React, { useEffect, useState } from 'react';
import axios from 'axios';
import { useNavigate } from 'react-router-dom';
import { LayoutDashboard, FileCode, Clock, Folder, ArrowUpRight } from 'lucide-react';

interface Project {
    name: string;
    updated_at: string;
    number_of_files: number;
}

const Dashboard: React.FC = () => {
    const [projects, setProjects] = useState<Project[]>([]);
    const [isLoading, setIsLoading] = useState(true);
    const navigate = useNavigate();

    useEffect(() => {
        const fetchProjects = async () => {
            try {
                const response = await axios.get('/api/v1/projects/');
                setProjects(response.data);
            } catch (error) {
                console.error("Failed to fetch projects", error);
            } finally {
                setIsLoading(false);
            }
        };
        fetchProjects();
    }, []);



    const handleProjectClick = (projectName: string) => {
        navigate(`/projects/${encodeURIComponent(projectName)}`);
    };

    return (
        <div className="space-y-8">
            <div className="flex justify-between items-center">
                <div>
                    <h1 className="text-3xl font-bold text-slate-900 dark:text-white">Dashboard Overview</h1>
                    <p className="text-slate-500 dark:text-slate-400 mt-1">Welcome back to your AI Code Analyzer workspace</p>
                </div>
                <div className="flex gap-3">
                    <span className="px-4 py-2 bg-white border border-slate-200 rounded-lg text-sm font-medium text-slate-600 shadow-sm flex items-center gap-2">
                        <Clock className="w-4 h-4" />
                        Last updated: {new Date().toLocaleTimeString()}
                    </span>
                </div>
            </div>



            {/* Projects Section */}
            <div>
                <h2 className="text-xl font-bold text-slate-900 dark:text-white mb-6 flex items-center gap-2">
                    <LayoutDashboard className="w-5 h-5 text-slate-400" />
                    Recent Projects <span className="text-slate-400 font-normal text-lg">({projects.length})</span>
                </h2>

                {isLoading ? (
                    <div className="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-6">
                        {[1, 2, 3].map((i) => (
                            <div key={i} className="h-48 bg-slate-100 rounded-2xl animate-pulse" />
                        ))}
                    </div>
                ) : (
                    <div className="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-6">
                        {projects.map((project) => (
                            <div
                                key={project.name}
                                onClick={() => handleProjectClick(project.name)}
                                className="group bg-white p-6 rounded-2xl shadow-sm border border-slate-100 hover:shadow-xl hover:border-indigo-100 transition-all duration-300 relative overflow-hidden cursor-pointer"
                            >
                                <div className="absolute top-0 right-0 w-24 h-24 bg-gradient-to-br from-slate-50 to-transparent rounded-bl-full -mr-8 -mt-8 transition-transform group-hover:scale-150 duration-500" />

                                <div className="relative">
                                    <div className="flex items-start justify-between mb-4">
                                        <div className="p-3 bg-slate-50 rounded-xl group-hover:bg-indigo-50 transition-colors duration-300">
                                            <Folder className="w-6 h-6 text-slate-400 group-hover:text-indigo-600" />
                                        </div>
                                        <div className="text-xs font-medium text-slate-400 bg-slate-50 px-2 py-1 rounded-lg">
                                            v1.0
                                        </div>
                                    </div>

                                    <h3 className="text-lg font-bold text-slate-800 mb-2 group-hover:text-indigo-600 transition-colors">{project.name}</h3>

                                    <div className="space-y-2">
                                        <div className="flex items-center text-sm text-slate-500">
                                            <FileCode className="w-4 h-4 mr-2 text-slate-400" />
                                            {project.number_of_files.toLocaleString()} files processed
                                        </div>
                                        <div className="flex items-center text-sm text-slate-500">
                                            <Clock className="w-4 h-4 mr-2 text-slate-400" />
                                            Updated {new Date(project.updated_at).toLocaleString()}
                                        </div>
                                    </div>

                                    <div className="mt-6 pt-4 border-t border-slate-50 flex justify-end">
                                        <span className="text-sm font-medium text-indigo-600 opacity-0 group-hover:opacity-100 transform translate-x-2 group-hover:translate-x-0 transition-all duration-300 flex items-center">
                                            View Details <ArrowUpRight className="w-4 h-4 ml-1" />
                                        </span>
                                    </div>
                                </div>
                            </div>
                        ))}

                        {projects.length === 0 && (
                            <div className="col-span-full flex flex-col items-center justify-center p-12 bg-white rounded-2xl border border-dashed border-slate-300 text-center">
                                <div className="p-4 bg-slate-50 rounded-full mb-4">
                                    <Folder className="w-8 h-8 text-slate-400" />
                                </div>
                                <h3 className="text-lg font-semibold text-slate-900">No projects found</h3>
                                <p className="text-slate-500 mt-1">Start by uploading a new project for analysis</p>
                            </div>
                        )}
                    </div>
                )}
            </div>
        </div>
    );
};

export default Dashboard;
