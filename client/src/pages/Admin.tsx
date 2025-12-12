import React from 'react';
import { Link } from 'react-router-dom';
import { Users, Shield, Settings, ChevronRight, UserPlus, ShieldCheck } from 'lucide-react';

const Admin: React.FC = () => {
    return (
        <div className="space-y-8">
            <div>
                <h1 className="text-3xl font-bold text-slate-900">Administration</h1>
                <p className="text-slate-500 mt-1">Manage users, groups, and system settings</p>
            </div>

            <div className="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-6">
                {/* User Management Card */}
                <Link to="/admin/users" className="group bg-white p-6 rounded-2xl shadow-sm border border-slate-100 hover:shadow-xl hover:border-indigo-100 transition-all duration-300 relative overflow-hidden">
                    <div className="absolute top-0 right-0 w-32 h-32 bg-indigo-50 rounded-bl-full -mr-10 -mt-10 transition-transform group-hover:scale-110 duration-500" />

                    <div className="relative">
                        <div className="w-12 h-12 bg-indigo-100 text-indigo-600 rounded-xl flex items-center justify-center mb-6 group-hover:scale-110 transition-transform duration-300">
                            <Users className="w-6 h-6" />
                        </div>

                        <h3 className="text-xl font-bold text-slate-900 mb-2">User Management</h3>
                        <p className="text-slate-500 mb-6 line-clamp-2">
                            Create, edit, and manage user accounts. Assign roles and monitor user activity.
                        </p>

                        <div className="flex items-center text-indigo-600 font-medium group-hover:translate-x-2 transition-transform duration-300">
                            Manage Users <ChevronRight className="w-4 h-4 ml-1" />
                        </div>
                    </div>
                </Link>

                {/* Group Management Card */}
                <Link to="/admin/groups" className="group bg-white p-6 rounded-2xl shadow-sm border border-slate-100 hover:shadow-xl hover:border-blue-100 transition-all duration-300 relative overflow-hidden">
                    <div className="absolute top-0 right-0 w-32 h-32 bg-blue-50 rounded-bl-full -mr-10 -mt-10 transition-transform group-hover:scale-110 duration-500" />

                    <div className="relative">
                        <div className="w-12 h-12 bg-blue-100 text-blue-600 rounded-xl flex items-center justify-center mb-6 group-hover:scale-110 transition-transform duration-300">
                            <Shield className="w-6 h-6" />
                        </div>

                        <h3 className="text-xl font-bold text-slate-900 mb-2">Group Management</h3>
                        <p className="text-slate-500 mb-6 line-clamp-2">
                            Organize users into groups. Configure permissions and access controls for different teams.
                        </p>

                        <div className="flex items-center text-blue-600 font-medium group-hover:translate-x-2 transition-transform duration-300">
                            Manage Groups <ChevronRight className="w-4 h-4 ml-1" />
                        </div>
                    </div>
                </Link>

                {/* System Settings Card (Placeholder) */}
                <div className="group bg-white p-6 rounded-2xl shadow-sm border border-slate-100 hover:shadow-xl hover:border-slate-200 transition-all duration-300 relative overflow-hidden opacity-60 cursor-not-allowed">
                    <div className="absolute top-0 right-0 w-32 h-32 bg-slate-50 rounded-bl-full -mr-10 -mt-10" />

                    <div className="relative">
                        <div className="w-12 h-12 bg-slate-100 text-slate-500 rounded-xl flex items-center justify-center mb-6">
                            <Settings className="w-6 h-6" />
                        </div>

                        <h3 className="text-xl font-bold text-slate-900 mb-2">System Settings</h3>
                        <p className="text-slate-500 mb-6 line-clamp-2">
                            Configure global application settings, integrations, and security policies.
                        </p>

                        <div className="flex items-center text-slate-400 font-medium">
                            Coming Soon
                        </div>
                    </div>
                </div>
            </div>

            {/* Quick Actions */}
            <div className="bg-white rounded-2xl shadow-sm border border-slate-100 p-6">
                <h2 className="text-lg font-bold text-slate-900 mb-4">Quick Actions</h2>
                <div className="flex flex-wrap gap-4">
                    <Link to="/admin/users" className="flex items-center gap-2 px-4 py-2 bg-indigo-50 text-indigo-700 rounded-lg hover:bg-indigo-100 transition-colors font-medium">
                        <UserPlus className="w-4 h-4" />
                        Add New User
                    </Link>
                    <Link to="/admin/groups" className="flex items-center gap-2 px-4 py-2 bg-blue-50 text-blue-700 rounded-lg hover:bg-blue-100 transition-colors font-medium">
                        <ShieldCheck className="w-4 h-4" />
                        Create New Group
                    </Link>
                </div>
            </div>
        </div>
    );
};

export default Admin;
