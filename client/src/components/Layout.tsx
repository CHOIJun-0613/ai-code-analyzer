import React, { useState, useEffect } from 'react';
import { Outlet, Link, useNavigate, useLocation } from 'react-router-dom';
import { useTranslation } from 'react-i18next';
import { useAuthStore } from '../store/authStore';
import { LayoutDashboard, FileCode, Users, LogOut, ChevronLeft, ChevronRight, Settings } from 'lucide-react';
import AnimatedLogo from './AnimatedLogo';
import SettingsModal, { Theme } from './SettingsModal';

const Layout: React.FC = () => {
    const logout = useAuthStore((state) => state.logout);
    const navigate = useNavigate();
    const location = useLocation();
    const { t } = useTranslation();
    const user = useAuthStore((state) => state.user);
    const isAdmin = user?.groups?.some(g => g.name.toLowerCase() === 'administrators') ?? false;

    // -- State --
    const [isCollapsed, setIsCollapsed] = useState(false);
    const [isSettingsOpen, setIsSettingsOpen] = useState(false);
    const [theme, setTheme] = useState<Theme>('normal');

    // -- Theme Effect --
    useEffect(() => {
        // Apply theme classes to body or a root element if needed, 
        // but for now we'll handle it via wrapper classes in this component
        // or simple logic.
        // If we wanted global distinct modes, we might set a class on body.
        if (theme === 'dark-modern') {
            document.documentElement.classList.add('dark');
        } else {
            document.documentElement.classList.remove('dark');
        }
    }, [theme]);

    // -- Fetch User Effect --
    useEffect(() => {
        useAuthStore.getState().fetchUser();
    }, []);

    const handleLogout = () => {
        logout();
        navigate('/login');
    };

    const isActive = (path: string) => location.pathname === path;
    const isGroupActive = (path: string) => location.pathname.startsWith(path);

    // -- Dynamic Styles --
    // Base bg color changes based on theme
    const mainBgClass = theme === 'dark-modern' ? 'bg-[#1e1e1e] text-[#d4d4d4]' : 'bg-slate-50 text-slate-900';
    const sidebarWidthClass = isCollapsed ? 'w-20' : 'w-72';

    // Sidebar items styling
    const getLinkClass = (path: string) => `
        flex items-center px-4 py-3 rounded-xl transition-all duration-200 group relative
        ${isActive(path)
            ? 'bg-indigo-600 text-white shadow-lg shadow-indigo-900/20'
            : 'hover:bg-slate-800 hover:text-white text-slate-400'
        }
        ${isCollapsed ? 'justify-center' : ''}
    `;

    const mainContentRef = React.useRef<HTMLDivElement>(null);

    // Scroll to top on route change
    useEffect(() => {
        if (mainContentRef.current) {
            mainContentRef.current.scrollTop = 0;
        }
    }, [location.pathname]);

    return (
        <div className={`flex h-screen font-sans ${mainBgClass} transition-colors duration-300`}>

            {/* Sidebar */}
            <div
                className={`${sidebarWidthClass} bg-slate-900 flex flex-col shadow-2xl z-20 transition-all duration-300 relative shrink-0`}
            >
                {/* Expand/Collapse Button (Absolute positioned on the border) */}
                <button
                    onClick={() => setIsCollapsed(!isCollapsed)}
                    className="absolute -right-3 top-8 bg-slate-800 text-slate-400 border border-slate-700 rounded-full p-1 shadow-md hover:text-white hover:bg-slate-700 transition-colors z-30"
                    title={isCollapsed ? "Expand Sidebar" : "Collapse Sidebar"}
                >
                    {isCollapsed ? <ChevronRight size={14} /> : <ChevronLeft size={14} />}
                </button>

                {/* Logo Area */}
                <div className="p-6 flex items-center gap-3 border-b border-slate-800/50 h-[88px] overflow-hidden whitespace-nowrap">
                    <AnimatedLogo className="w-8 h-8 shrink-0" />
                    <span
                        className={`text-xl font-bold text-white tracking-tight transition-opacity duration-200 ${isCollapsed ? 'opacity-0 w-0' : 'opacity-100'}`}
                    >
                        AI Code Analyzer
                    </span>
                </div>

                {/* Nav Items */}
                <nav className="flex-1 px-3 py-6 space-y-2 overflow-y-auto custom-scrollbar overflow-x-hidden">

                    {/* Main Label */}
                    <div className={`px-4 text-xs font-semibold text-slate-500 uppercase tracking-wider transition-all duration-300 ${isCollapsed ? 'opacity-0 h-0 overflow-hidden' : 'mb-2 opacity-100'}`}>
                        {t('layout.main')}
                    </div>

                    <Link to="/" className={getLinkClass('/')} title={isCollapsed ? t('layout.dashboard') : ""}>
                        <LayoutDashboard className={`shrink-0 w-5 h-5 transition-colors ${isActive('/') ? 'text-white' : 'text-slate-400 group-hover:text-white'}`} />
                        <span className={`ml-3 font-medium whitespace-nowrap transition-all duration-200 ${isCollapsed ? 'opacity-0 w-0 overflow-hidden' : 'opacity-100'}`}>
                            {t('layout.dashboard')}
                        </span>
                    </Link>

                    {isAdmin && (
                        <div className={`rounded-xl overflow-hidden transition-all duration-300 ${isGroupActive('/analysis') && !isCollapsed ? 'bg-slate-800/50' : ''}`}>
                            <Link to="#" className={`flex items-center px-4 py-3 transition-all duration-200 group ${isGroupActive('/analysis') ? 'text-white' : 'text-slate-400 hover:text-white'} ${isCollapsed ? 'justify-center' : ''}`} title={isCollapsed ? t('layout.analysisManagement') : ""}>
                                <FileCode className={`shrink-0 w-5 h-5 transition-colors ${isGroupActive('/analysis') ? 'text-indigo-400' : 'text-slate-400 group-hover:text-white'}`} />
                                <span className={`ml-3 font-medium flex-1 whitespace-nowrap transition-all duration-200 ${isCollapsed ? 'opacity-0 w-0 overflow-hidden' : 'opacity-100'}`}>
                                    {t('layout.analysisManagement') || "Code Analysis Management"}
                                </span>
                            </Link>

                            {/* Submenu - Only show when expanded */}
                            <div className={`pl-11 pr-4 pb-2 space-y-1 ${isCollapsed ? 'hidden' : 'block'}`}>
                                <Link
                                    to="/analysis"
                                    className={`flex items-center px-4 py-2 text-sm rounded-lg transition-all duration-200 group ${isActive('/analysis')
                                        ? 'bg-indigo-500/10 text-indigo-400'
                                        : 'text-slate-400 hover:bg-slate-700/50 hover:text-white'
                                        }`}
                                >
                                    <span className="w-1.5 h-1.5 rounded-full bg-current mr-2 opacity-50 group-hover:opacity-100" />
                                    <span className="whitespace-nowrap">{t('layout.codeStaticAnalysis') || "Code Static Analysis"}</span>
                                </Link>
                                <Link
                                    to="/analysis/ai"
                                    className={`flex items-center px-4 py-2 text-sm rounded-lg transition-all duration-200 group ${isActive('/analysis/ai')
                                        ? 'bg-indigo-500/10 text-indigo-400'
                                        : 'text-slate-400 hover:bg-slate-700/50 hover:text-white'
                                        }`}
                                >
                                    <span className="w-1.5 h-1.5 rounded-full bg-current mr-2 opacity-50 group-hover:opacity-100" />
                                    <span className="whitespace-nowrap">{t('layout.codeAiAnalysis') || "Code AI Analysis"}</span>
                                </Link>
                                <Link
                                    to="/analysis/history"
                                    className={`flex items-center px-4 py-2 text-sm rounded-lg transition-all duration-200 group ${isActive('/analysis/history')
                                        ? 'bg-indigo-500/10 text-indigo-400'
                                        : 'text-slate-400 hover:bg-slate-700/50 hover:text-white'
                                        }`}
                                >
                                    <span className="w-1.5 h-1.5 rounded-full bg-current mr-2 opacity-50 group-hover:opacity-100" />
                                    <span className="whitespace-nowrap">{t('layout.analysisHistory') || "Analysis Log"}</span>
                                </Link>
                            </div>
                        </div>
                    )}

                    {isAdmin && (
                        <>
                            {/* Admin Section */}
                            <div className={`mt-8 px-4 text-xs font-semibold text-slate-500 uppercase tracking-wider transition-all duration-300 ${isCollapsed ? 'opacity-0 h-0 overflow-hidden' : 'mb-2 opacity-100'}`}>
                                {t('layout.administration')}
                            </div>

                            <div className={`rounded-xl overflow-hidden transition-all duration-300 ${isGroupActive('/admin') && !isCollapsed ? 'bg-slate-800/50' : ''}`}>
                                <Link to="/admin" className={`flex items-center px-4 py-3 transition-all duration-200 group ${isActive('/admin') ? 'text-white' : 'text-slate-400 hover:text-white'} ${isCollapsed ? 'justify-center' : ''}`} title={isCollapsed ? t('layout.adminOverview') : ""}>
                                    <Users className={`shrink-0 w-5 h-5 transition-colors ${isActive('/admin') ? 'text-indigo-400' : 'text-slate-400 group-hover:text-white'}`} />
                                    <span className={`ml-3 font-medium flex-1 whitespace-nowrap transition-all duration-200 ${isCollapsed ? 'opacity-0 w-0 overflow-hidden' : 'opacity-100'}`}>
                                        {t('layout.adminOverview')}
                                    </span>
                                </Link>

                                {/* Submenu - Only show when expanded */}
                                <div className={`pl-11 pr-4 pb-2 space-y-1 ${isCollapsed ? 'hidden' : 'block'}`}>
                                    <Link
                                        to="/admin/users"
                                        className={`flex items-center px-4 py-2 text-sm rounded-lg transition-all duration-200 group ${isActive('/admin/users')
                                            ? 'bg-indigo-500/10 text-indigo-400'
                                            : 'text-slate-400 hover:bg-slate-700/50 hover:text-white'
                                            }`}
                                    >
                                        <span className="w-1.5 h-1.5 rounded-full bg-current mr-2 opacity-50 group-hover:opacity-100" />
                                        <span className="whitespace-nowrap">{t('layout.userManagement')}</span>
                                    </Link>
                                    <Link
                                        to="/admin/groups"
                                        className={`flex items-center px-4 py-2 text-sm rounded-lg transition-all duration-200 group ${isActive('/admin/groups')
                                            ? 'bg-indigo-500/10 text-indigo-400'
                                            : 'text-slate-400 hover:bg-slate-700/50 hover:text-white'
                                            }`}
                                    >
                                        <span className="w-1.5 h-1.5 rounded-full bg-current mr-2 opacity-50 group-hover:opacity-100" />
                                        <span className="whitespace-nowrap">{t('layout.groupManagement')}</span>
                                    </Link>
                                </div>
                            </div>
                        </>
                    )}
                </nav>

                {/* Footer Actions */}
                <div className="p-4 border-t border-slate-800/50 space-y-2">
                    {/* Settings Button */}
                    <button
                        onClick={() => setIsSettingsOpen(true)}
                        className={`flex items-center w-full px-4 py-3 text-slate-400 hover:text-white hover:bg-indigo-500/10 hover:border-indigo-500/20 border border-transparent rounded-xl transition-all duration-200 group ${isCollapsed ? 'justify-center' : ''}`}
                        title={t('layout.settings')}
                    >
                        <Settings className="shrink-0 w-5 h-5 group-hover:text-indigo-400 transition-colors" />
                        <span className={`ml-3 font-medium group-hover:text-indigo-400 transition-colors whitespace-nowrap ${isCollapsed ? 'hidden' : 'block'}`}>{t('layout.settings')}</span>
                    </button>

                    {/* Logout Button */}
                    <button
                        onClick={handleLogout}
                        className={`flex items-center w-full px-4 py-3 text-slate-400 hover:text-white hover:bg-red-500/10 hover:border-red-500/20 border border-transparent rounded-xl transition-all duration-200 group ${isCollapsed ? 'justify-center' : ''}`}
                        title={t('layout.logout')}
                    >
                        <LogOut className="shrink-0 w-5 h-5 group-hover:text-red-400 transition-colors" />
                        <span className={`ml-3 font-medium group-hover:text-red-400 transition-colors whitespace-nowrap ${isCollapsed ? 'hidden' : 'block'}`}>{t('layout.logout')}</span>
                    </button>
                </div>
            </div>

            {/* Main Content */}
            <div ref={mainContentRef} className="flex-1 overflow-auto relative">
                <div className={`p-8 max-w-[1600px] mx-auto animate-in fade-in slide-in-from-bottom-4 duration-500`}>
                    <Outlet />
                </div>
            </div>

            {/* Settings Modal */}
            <SettingsModal
                isOpen={isSettingsOpen}
                onClose={() => setIsSettingsOpen(false)}
                currentTheme={theme}
                onThemeChange={setTheme}
            />
        </div>
    );
};

export default Layout;

