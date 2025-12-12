import React from 'react';
import { Outlet, Link, useNavigate, useLocation } from 'react-router-dom';
import { useAuthStore } from '../store/authStore';
import { LayoutDashboard, FileCode, Users, LogOut } from 'lucide-react';

const Layout: React.FC = () => {
    const logout = useAuthStore((state) => state.logout);
    const navigate = useNavigate();
    const location = useLocation();

    const handleLogout = () => {
        logout();
        navigate('/login');
    };

    const isActive = (path: string) => location.pathname === path;
    const isGroupActive = (path: string) => location.pathname.startsWith(path);

    return (
        <div className="flex h-screen bg-slate-50 font-sans text-slate-900">
            {/* Sidebar */}
            <div className="w-72 bg-slate-900 text-slate-300 flex flex-col shadow-2xl z-10 transition-all duration-300">
                <div className="p-6 flex items-center gap-3 border-b border-slate-800/50">
                    <div className="w-8 h-8 bg-indigo-500 rounded-lg flex items-center justify-center shadow-lg shadow-indigo-500/30">
                        <FileCode className="w-5 h-5 text-white" />
                    </div>
                    <span className="text-xl font-bold text-white tracking-tight">AI Code Analyzer</span>
                </div>

                <nav className="flex-1 px-4 py-6 space-y-2 overflow-y-auto custom-scrollbar">
                    <div className="mb-2 px-4 text-xs font-semibold text-slate-500 uppercase tracking-wider">
                        Main
                    </div>
                    <Link
                        to="/"
                        className={`flex items-center px-4 py-3 rounded-xl transition-all duration-200 group ${isActive('/')
                            ? 'bg-indigo-600 text-white shadow-lg shadow-indigo-900/20'
                            : 'hover:bg-slate-800 hover:text-white'
                            }`}
                    >
                        <LayoutDashboard className={`mr-3 w-5 h-5 ${isActive('/') ? 'text-white' : 'text-slate-400 group-hover:text-white'}`} />
                        <span className="font-medium">Dashboard</span>
                    </Link>
                    <Link
                        to="/analysis"
                        className={`flex items-center px-4 py-3 rounded-xl transition-all duration-200 group ${isActive('/analysis')
                            ? 'bg-indigo-600 text-white shadow-lg shadow-indigo-900/20'
                            : 'hover:bg-slate-800 hover:text-white'
                            }`}
                    >
                        <FileCode className={`mr-3 w-5 h-5 ${isActive('/analysis') ? 'text-white' : 'text-slate-400 group-hover:text-white'}`} />
                        <span className="font-medium">Analysis</span>
                    </Link>

                    <div className="mt-8 mb-2 px-4 text-xs font-semibold text-slate-500 uppercase tracking-wider">
                        Administration
                    </div>

                    <div className={`rounded-xl overflow-hidden transition-all duration-300 ${isGroupActive('/admin') ? 'bg-slate-800/50' : ''}`}>
                        <Link
                            to="/admin"
                            className={`flex items-center px-4 py-3 transition-all duration-200 group ${isActive('/admin')
                                ? 'text-white'
                                : 'hover:text-white'
                                }`}
                        >
                            <Users className={`mr-3 w-5 h-5 ${isActive('/admin') ? 'text-indigo-400' : 'text-slate-400 group-hover:text-white'}`} />
                            <span className="font-medium flex-1">Admin Overview</span>
                        </Link>

                        <div className="pl-11 pr-4 pb-2 space-y-1">
                            <Link
                                to="/admin/users"
                                className={`flex items-center px-4 py-2 text-sm rounded-lg transition-all duration-200 group ${isActive('/admin/users')
                                    ? 'bg-indigo-500/10 text-indigo-400'
                                    : 'text-slate-400 hover:bg-slate-700/50 hover:text-white'
                                    }`}
                            >
                                <span className="w-1.5 h-1.5 rounded-full bg-current mr-2 opacity-50 group-hover:opacity-100" />
                                User Management
                            </Link>
                            <Link
                                to="/admin/groups"
                                className={`flex items-center px-4 py-2 text-sm rounded-lg transition-all duration-200 group ${isActive('/admin/groups')
                                    ? 'bg-indigo-500/10 text-indigo-400'
                                    : 'text-slate-400 hover:bg-slate-700/50 hover:text-white'
                                    }`}
                            >
                                <span className="w-1.5 h-1.5 rounded-full bg-current mr-2 opacity-50 group-hover:opacity-100" />
                                Group Management
                            </Link>
                        </div>
                    </div>
                </nav>

                <div className="p-4 border-t border-slate-800/50">
                    <button
                        onClick={handleLogout}
                        className="flex items-center w-full px-4 py-3 text-slate-400 hover:text-white hover:bg-red-500/10 hover:border-red-500/20 border border-transparent rounded-xl transition-all duration-200 group"
                    >
                        <LogOut className="mr-3 w-5 h-5 group-hover:text-red-400 transition-colors" />
                        <span className="font-medium group-hover:text-red-400 transition-colors">Logout</span>
                    </button>
                </div>
            </div>

            {/* Main Content */}
            <div className="flex-1 overflow-auto bg-slate-50 relative">
                {/* Header/Top bar could go here if needed */}
                <div className="p-8 max-w-[1600px] mx-auto animate-in fade-in slide-in-from-bottom-4 duration-500">
                    <Outlet />
                </div>
            </div>
        </div>
    );
};

export default Layout;
