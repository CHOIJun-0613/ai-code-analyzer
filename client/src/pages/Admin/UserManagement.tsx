import React, { useEffect, useState } from 'react';
import { useTranslation } from 'react-i18next';
import { userApi, User, Group } from '../../api/userApi';
import { Plus, User as UserIcon, Mail, Search, MoreVertical, X, Eye, EyeOff, Edit, Trash2 } from 'lucide-react';

const UserManagement = () => {
    const { t } = useTranslation();
    const [users, setUsers] = useState<User[]>([]);
    const [groups, setGroups] = useState<Group[]>([]);
    const [showModal, setShowModal] = useState(false);
    const [isEditing, setIsEditing] = useState(false);
    const [currentUser, setCurrentUser] = useState({ id: '', username: '', name: '', email: '', password: '', phone_number: '', group_ids: [] as string[] });
    const [searchTerm, setSearchTerm] = useState('');
    const [showPassword, setShowPassword] = useState(false);
    const [activeMenuId, setActiveMenuId] = useState<string | null>(null);

    useEffect(() => {
        loadData();
    }, []);

    // Click outside to close menu
    useEffect(() => {
        const handleClickOutside = () => setActiveMenuId(null);
        window.addEventListener('click', handleClickOutside);
        return () => window.removeEventListener('click', handleClickOutside);
    }, []);

    const loadData = async () => {
        try {
            const [usersData, groupsData] = await Promise.all([
                userApi.listUsers(),
                userApi.listGroups()
            ]);
            setUsers(usersData);
            setGroups(groupsData);
        } catch (error) {
            console.error('Failed to load data:', error);
        }
    };

    const handleCreateUser = () => {
        setIsEditing(false);
        setCurrentUser({ id: '', username: '', name: '', email: '', password: '', phone_number: '', group_ids: [] });
        setShowPassword(false);
        setShowModal(true);
    };

    const handleEditUser = (user: User) => {
        setIsEditing(true);
        setCurrentUser({
            id: user.id,
            username: user.username,
            name: user.name || '',
            email: user.email,
            phone_number: user.phone_number || '',
            password: '', // Don't fill password
            group_ids: user.groups.map(g => g.id)
        });
        setShowPassword(false);
        setShowModal(true);
    };

    const handleSubmit = async (e: React.FormEvent) => {
        e.preventDefault();
        try {
            if (isEditing) {
                // For update, we don't send username as it's immutable ID
                const updateData = {
                    name: currentUser.name,
                    email: currentUser.email,
                    phone_number: currentUser.phone_number,
                    group_ids: currentUser.group_ids,
                    // Only include password if set
                    ...(currentUser.password ? { password: currentUser.password } : {})
                };
                await userApi.updateUser(currentUser.id, updateData);
            } else {
                // Check duplicate ID for new user
                // Check duplicate ID for new user
                const exists = await userApi.checkUserExists(currentUser.username);
                if (exists) {
                    alert(t('userManagement.idExists'));
                    return;
                }
                await userApi.createUser(currentUser);
            }
            setShowModal(false);
            loadData();
        } catch (error) {
            console.error('Failed to save user:', error);
            alert('Failed to save user');
        }
    };

    const handleDeleteUser = async (user: User) => {
        if (!confirm(t('userManagement.deleteUserConfirm'))) return;
        try {
            await userApi.deleteUser(user.id);
            loadData();
        } catch (error) {
            console.error('Failed to delete user:', error);
            alert('Failed to delete user');
        }
    };

    const filteredUsers = users.filter(user =>
        user.username.toLowerCase().includes(searchTerm.toLowerCase()) ||
        (user.name && user.name.toLowerCase().includes(searchTerm.toLowerCase())) ||
        user.email.toLowerCase().includes(searchTerm.toLowerCase())
    );

    return (
        <div className="min-h-screen bg-slate-50 p-8">
            <div className="max-w-7xl mx-auto">
                <div className="flex flex-col md:flex-row justify-between items-start md:items-center mb-8 gap-4">
                    <div>
                        <h1 className="text-3xl font-bold text-slate-900 flex items-center gap-3">
                            <div className="p-2 bg-indigo-600 rounded-lg shadow-lg shadow-indigo-200">
                                <UserIcon className="w-8 h-8 text-white" />
                            </div>
                            <span className="bg-clip-text text-transparent bg-gradient-to-r from-slate-900 to-slate-600">
                                {t('userManagement.title')}
                            </span>
                        </h1>
                        <p className="mt-2 text-slate-500 text-lg">{t('userManagement.subtitle')}</p>
                    </div>
                    <button
                        onClick={handleCreateUser}
                        className="group flex items-center gap-2 bg-indigo-600 text-white px-6 py-3 rounded-xl hover:bg-indigo-700 transition-all duration-200 shadow-md hover:shadow-xl hover:-translate-y-0.5"
                    >
                        <Plus className="w-5 h-5 group-hover:rotate-90 transition-transform duration-200" />
                        <span className="font-medium">{t('userManagement.addNewUser')}</span>
                    </button>
                </div>

                {/* Search Bar */}
                <div className="mb-6 relative max-w-md">
                    <div className="absolute inset-y-0 left-0 pl-3 flex items-center pointer-events-none">
                        <Search className="h-5 w-5 text-slate-400" />
                    </div>
                    <input
                        type="text"
                        className="block w-full pl-10 pr-3 py-2.5 border border-slate-200 rounded-xl leading-5 bg-white placeholder-slate-400 focus:outline-none focus:ring-2 focus:ring-indigo-500/20 focus:border-indigo-500 transition-all duration-200 shadow-sm"
                        placeholder={t('userManagement.searchPlaceholder')}
                        value={searchTerm}
                        onChange={(e) => setSearchTerm(e.target.value)}
                    />
                </div>

                {/* Compact User Grid */}
                <div className="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 xl:grid-cols-4 gap-4">
                    {filteredUsers.map((user) => (
                        <div key={user.id} className="group bg-white rounded-xl p-4 shadow-sm hover:shadow-md transition-all duration-200 border border-slate-100 hover:border-indigo-100 relative flex flex-col">
                            <div className="flex justify-between items-start mb-3">
                                <div className="flex items-center gap-3 overflow-hidden">
                                    <div className="w-10 h-10 min-w-[40px] rounded-full bg-gradient-to-br from-indigo-100 to-slate-100 flex items-center justify-center text-sm font-bold text-indigo-600 shadow-inner">
                                        {user.name ? user.name[0].toUpperCase() : user.username[0].toUpperCase()}
                                    </div>
                                    <div className="overflow-hidden">
                                        <h3 className="text-sm font-bold text-slate-800 truncate" title={`${user.username} (${user.name})`}>
                                            {user.username}
                                            {user.name && <span className="text-slate-500 font-normal ml-1">({user.name})</span>}
                                        </h3>
                                        <div className="flex items-center text-slate-400 text-xs truncate" title={user.email}>
                                            <Mail className="w-3 h-3 mr-1 flex-shrink-0" />
                                            <span className="truncate">{user.email}</span>
                                        </div>
                                        {user.created_at && (
                                            <div className="text-[10px] text-slate-400 mt-1">
                                                Created: {new Date(user.created_at).toLocaleDateString()}
                                            </div>
                                        )}
                                        {user.updated_at && (
                                            <div className="text-[10px] text-slate-400">
                                                Updated: {new Date(user.updated_at).toLocaleDateString()}
                                            </div>
                                        )}
                                    </div>
                                </div>
                                <div className="relative">
                                    <button
                                        onClick={(e) => {
                                            e.stopPropagation();
                                            setActiveMenuId(activeMenuId === user.id ? null : user.id);
                                        }}
                                        className="p-1 text-slate-300 hover:text-slate-600 transition-colors rounded hover:bg-slate-50"
                                    >
                                        <MoreVertical className="w-4 h-4" />
                                    </button>

                                    {/* Context Menu */}
                                    {activeMenuId === user.id && (
                                        <div className="absolute right-0 top-full mt-1 w-32 bg-white border border-slate-100 rounded-lg shadow-lg z-10 py-1 animate-in fade-in zoom-in duration-100 origin-top-right">
                                            <button
                                                onClick={() => handleEditUser(user)}
                                                className="w-full text-left px-3 py-2 text-sm text-slate-700 hover:bg-slate-50 flex items-center gap-2"
                                            >
                                                <Edit className="w-3.5 h-3.5" />
                                                {t('common.edit', 'Edit')}
                                            </button>
                                            <button
                                                onClick={() => handleDeleteUser(user)}
                                                className="w-full text-left px-3 py-2 text-sm text-red-600 hover:bg-red-50 flex items-center gap-2"
                                            >
                                                <Trash2 className="w-3.5 h-3.5" />
                                                {t('common.delete', 'Delete')}
                                            </button>
                                        </div>
                                    )}
                                </div>
                            </div>

                            <div className="mt-auto pt-3 border-t border-slate-50 flex items-center justify-between">
                                <div className="flex items-center gap-1 overflow-hidden">
                                    {user.groups.slice(0, 2).map(g => (
                                        <span key={g.id} className="inline-flex items-center px-1.5 py-0.5 rounded text-[10px] font-medium bg-slate-50 text-slate-600 border border-slate-100 truncate max-w-[80px]">
                                            {g.name}
                                        </span>
                                    ))}
                                    {user.groups.length > 2 && (
                                        <span className="text-[10px] text-slate-400">+{user.groups.length - 2}</span>
                                    )}
                                    {user.groups.length === 0 && (
                                        <span className="text-[10px] text-slate-300 italic">{t('userManagement.noGroups')}</span>
                                    )}
                                </div>
                                <span className={`flex-shrink-0 inline-flex items-center px-1.5 py-0.5 rounded-full text-[10px] font-medium ${user.is_active
                                    ? 'bg-emerald-50 text-emerald-600'
                                    : 'bg-red-50 text-red-600'
                                    }`}>
                                    {user.is_active ? t('userManagement.active') : t('userManagement.inactive')}
                                </span>
                            </div>
                        </div>
                    ))}
                </div>

                {/* Create/Edit User Modal */}
                {showModal && (
                    <div className="fixed inset-0 bg-slate-900/60 backdrop-blur-sm flex items-center justify-center p-4 z-50 transition-opacity duration-300">
                        <div className="bg-white rounded-2xl shadow-2xl w-full max-w-md overflow-hidden animate-in fade-in zoom-in duration-200 max-h-[90vh] flex flex-col">
                            <div className="p-6 border-b border-slate-100 flex justify-between items-center bg-slate-50/50 flex-shrink-0">
                                <h2 className="text-xl font-bold text-slate-800">
                                    {isEditing ? t('userManagement.editUserTitle') : t('userManagement.modalTitle')}
                                </h2>
                                <button
                                    onClick={() => setShowModal(false)}
                                    className="text-slate-400 hover:text-slate-600 transition-colors"
                                >
                                    <X className="w-5 h-5" />
                                </button>
                            </div>

                            <form onSubmit={handleSubmit} className="flex flex-col flex-1 overflow-hidden">
                                <div className="p-6 space-y-5 overflow-y-auto flex-1 custom-scrollbar">
                                    <div>
                                        <label className="block text-sm font-semibold text-slate-700 mb-2">{t('userManagement.userId')}</label>
                                        <div className="flex gap-2">
                                            <input
                                                type="text"
                                                required
                                                disabled={isEditing}
                                                className={`flex-1 px-4 py-2.5 rounded-xl border border-slate-200 outline-none text-slate-800 transition-all ${isEditing ? 'bg-slate-100 text-slate-500 cursor-not-allowed' : 'focus:border-indigo-500 focus:ring-4 focus:ring-indigo-500/10'}`}
                                                value={currentUser.username}
                                                onChange={e => setCurrentUser({ ...currentUser, username: e.target.value })}
                                                placeholder={t('userManagement.userId')}
                                            />
                                            {!isEditing && (
                                                <button
                                                    type="button"
                                                    onClick={async () => {
                                                        if (!currentUser.username) return;
                                                        const exists = await userApi.checkUserExists(currentUser.username);
                                                        if (exists) {
                                                            alert(t('userManagement.idExists'));
                                                        } else {
                                                            alert(t('userManagement.idAvailable'));
                                                        }
                                                    }}
                                                    className="px-4 py-2.5 bg-white border border-slate-200 text-slate-600 rounded-xl hover:bg-slate-50 font-medium text-sm whitespace-nowrap"
                                                >
                                                    {t('userManagement.checkDuplicate')}
                                                </button>
                                            )}
                                        </div>
                                        {isEditing && <p className="text-xs text-slate-400 mt-1">User ID cannot be changed</p>}
                                    </div>
                                    <div>
                                        <label className="block text-sm font-semibold text-slate-700 mb-2">{t('userManagement.userName')}</label>
                                        <input
                                            type="text"
                                            className="w-full px-4 py-2.5 rounded-xl border border-slate-200 focus:border-indigo-500 focus:ring-4 focus:ring-indigo-500/10 transition-all duration-200 outline-none text-slate-800"
                                            value={currentUser.name}
                                            onChange={e => setCurrentUser({ ...currentUser, name: e.target.value })}
                                            placeholder={t('userManagement.userName')}
                                        />
                                    </div>
                                    <div>
                                        <label className="block text-sm font-semibold text-slate-700 mb-2">{t('userManagement.phoneNumber')}</label>
                                        <input
                                            type="tel"
                                            className="w-full px-4 py-2.5 rounded-xl border border-slate-200 focus:border-indigo-500 focus:ring-4 focus:ring-indigo-500/10 transition-all duration-200 outline-none text-slate-800"
                                            value={currentUser.phone_number}
                                            onChange={e => setCurrentUser({ ...currentUser, phone_number: e.target.value })}
                                            placeholder={t('userManagement.phoneNumber')}
                                        />
                                    </div>
                                    <div>
                                        <label className="block text-sm font-semibold text-slate-700 mb-2">{t('userManagement.email')}</label>
                                        <input
                                            type="email"
                                            required
                                            className="w-full px-4 py-2.5 rounded-xl border border-slate-200 focus:border-indigo-500 focus:ring-4 focus:ring-indigo-500/10 transition-all duration-200 outline-none text-slate-800"
                                            value={currentUser.email}
                                            onChange={e => setCurrentUser({ ...currentUser, email: e.target.value })}
                                        />
                                    </div>
                                    <div>
                                        <label className="block text-sm font-semibold text-slate-700 mb-2">
                                            {t('userManagement.password')}
                                            {isEditing && <span className="text-xs font-normal text-slate-400 ml-2">(Create new to change)</span>}
                                        </label>
                                        <div className="relative">
                                            <input
                                                type={showPassword ? 'text' : 'password'}
                                                required={!isEditing}
                                                className="w-full px-4 py-2.5 rounded-xl border border-slate-200 focus:border-indigo-500 focus:ring-4 focus:ring-indigo-500/10 transition-all duration-200 outline-none text-slate-800"
                                                value={currentUser.password}
                                                onChange={e => setCurrentUser({ ...currentUser, password: e.target.value })}
                                                placeholder={isEditing ? '••••••••' : ''}
                                            />
                                            <button
                                                type="button"
                                                onClick={() => setShowPassword(!showPassword)}
                                                className="absolute right-3 top-1/2 -translate-y-1/2 text-slate-400 hover:text-slate-600"
                                            >
                                                {showPassword ? <EyeOff className="w-5 h-5" /> : <Eye className="w-5 h-5" />}
                                            </button>
                                        </div>
                                    </div>
                                    <div>
                                        <label className="block text-sm font-semibold text-slate-700 mb-2">{t('userManagement.assignGroups')}</label>
                                        <select
                                            multiple
                                            className="w-full px-4 py-2.5 rounded-xl border border-slate-200 focus:border-indigo-500 focus:ring-4 focus:ring-indigo-500/10 transition-all duration-200 outline-none text-slate-800 min-h-[120px]"
                                            value={currentUser.group_ids}
                                            onChange={e => setCurrentUser({ ...currentUser, group_ids: Array.from(e.target.selectedOptions, option => option.value) })}
                                        >
                                            {groups.map(group => (
                                                <option key={group.id} value={group.id} className="py-1">{group.id}({group.name})</option>
                                            ))}
                                        </select>
                                        <p className="text-xs text-slate-500 mt-2 flex items-center gap-1">
                                            <span className="px-1.5 py-0.5 bg-slate-100 rounded border border-slate-200 font-mono text-[10px]">Ctrl</span>
                                            or
                                            <span className="px-1.5 py-0.5 bg-slate-100 rounded border border-slate-200 font-mono text-[10px]">Cmd</span>
                                            {t('userManagement.selectMultiple')}
                                        </p>
                                    </div>
                                </div>

                                <div className="p-6 border-t border-slate-100 flex justify-end gap-3 bg-white flex-shrink-0">
                                    <button
                                        type="button"
                                        onClick={() => setShowModal(false)}
                                        className="px-5 py-2.5 text-sm font-medium text-slate-600 bg-white border border-slate-200 rounded-xl hover:bg-slate-50 hover:text-slate-800 transition-colors"
                                    >
                                        {t('common.cancel')}
                                    </button>
                                    <button
                                        type="submit"
                                        className="px-5 py-2.5 text-sm font-medium text-white bg-indigo-600 rounded-xl hover:bg-indigo-700 shadow-lg shadow-indigo-200 transition-all hover:-translate-y-0.5"
                                    >
                                        {isEditing ? t('common.save') : t('userManagement.createUser')}
                                    </button>
                                </div>
                            </form>
                        </div>
                    </div>
                )}
            </div>
        </div>
    );
};

export default UserManagement;
