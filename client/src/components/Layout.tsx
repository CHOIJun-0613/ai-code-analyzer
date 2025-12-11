import React from 'react';
import { Outlet, Link, useNavigate } from 'react-router-dom';
import { useAuthStore } from '../store/authStore';
import { LayoutDashboard, FileCode, Users, LogOut } from 'lucide-react';

const Layout: React.FC = () => {
    const logout = useAuthStore((state) => state.logout);
    const navigate = useNavigate();

    const handleLogout = () => {
        logout();
        navigate('/login');
    };

    return (
        <div className="flex h-screen bg-gray-100">
            {/* Sidebar */}
            <div className="w-64 bg-white shadow-md">
                <div className="p-4 text-xl font-bold text-blue-600">AI Code Analyzer</div>
                <nav className="mt-4">
                    <Link to="/" className="flex items-center p-4 hover:bg-gray-100">
                        <LayoutDashboard className="mr-2" /> Dashboard
                    </Link>
                    <Link to="/analysis" className="flex items-center p-4 hover:bg-gray-100">
                        <FileCode className="mr-2" /> Analysis
                    </Link>
                    <Link to="/admin" className="flex items-center p-4 hover:bg-gray-100">
                        <Users className="mr-2" /> Admin
                    </Link>
                </nav>
                <div className="absolute bottom-0 w-64 p-4 border-t">
                    <button onClick={handleLogout} className="flex items-center text-red-500 hover:text-red-700">
                        <LogOut className="mr-2" /> Logout
                    </button>
                </div>
            </div>

            {/* Main Content */}
            <div className="flex-1 overflow-auto">
                <div className="p-8">
                    <Outlet />
                </div>
            </div>
        </div>
    );
};

export default Layout;
