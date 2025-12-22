import React, { useEffect, useState } from 'react';
import { useTranslation } from 'react-i18next';
import { userApi, Group } from '../../api/userApi';
import client from '../../api/client';
import { Plus, Shield, Check, X, Edit2, Users } from 'lucide-react';
import ProjectSelector from '../../components/ProjectSelector';

const GroupManagement = () => {
    const { t } = useTranslation();

    const AVAILABLE_PERMISSIONS = [
        { value: 'manage_users', label: t('groupManagement.perm.manage_users') },
        { value: 'analyze_code', label: t('groupManagement.perm.analyze_code') },
        { value: 'view_project', label: t('groupManagement.perm.view_project') },
        { value: 'manage_project', label: t('groupManagement.perm.manage_project') },
    ];

    const [groups, setGroups] = useState<Group[]>([]);
    const [projects, setProjects] = useState<any[]>([]); // List of available projects
    const [showAddModal, setShowAddModal] = useState(false);
    const [newGroup, setNewGroup] = useState({ name: '', permissions: [] as string[], projects: [] as string[] });
    const [editingGroup, setEditingGroup] = useState<Group | null>(null);

    useEffect(() => {
        loadGroups();
        loadProjects();
    }, []);

    const loadGroups = async () => {
        try {
            const data = await userApi.listGroups();
            setGroups(data);
        } catch (error) {
            console.error('Failed to load groups:', error);
        }
    };

    const loadProjects = async () => {
        try {
            const res = await client.get('/projects/');
            setProjects(res.data);
        } catch (error) {
            console.error('Failed to load projects:', error);
        }
    };

    const handleCreateGroup = async (e: React.FormEvent) => {
        e.preventDefault();
        try {
            const created = await userApi.createGroup(newGroup);
            // If we have permissions or projects, we might need separate calls or modify createGroup to handle them if backend supports it.
            // Backend create_group now supports permissions. But projects usually need update_group_projects call if create doesn't handle it?
            // Wait, backend create_group only takes name and permissions. 
            // So we need to call updateGroupProjects after creation.
            if (newGroup.projects.length > 0 && created.id) {
                await userApi.updateGroupProjects(created.id, newGroup.projects);
            }

            setShowAddModal(false);
            setNewGroup({ name: '', permissions: [], projects: [] });
            loadGroups();
        } catch (error) {
            console.error('Failed to create group:', error);
            alert('Failed to create group');
        }
    };

    const handleUpdatePermissions = async () => {
        if (!editingGroup) return;
        try {
            await userApi.updateGroupPermissions(editingGroup.id, editingGroup.permissions);
            if (editingGroup.projects) {
                await userApi.updateGroupProjects(editingGroup.id, editingGroup.projects);
            }
            setEditingGroup(null);
            loadGroups();
        } catch (error) {
            console.error('Failed to update group:', error);
            alert('Failed to update group');
        }
    };

    return (
        <div className="min-h-screen bg-slate-50 p-8">
            <div className="max-w-7xl mx-auto">
                <div className="flex flex-col md:flex-row justify-between items-start md:items-center mb-10 gap-4">
                    <div>
                        <h1 className="text-3xl font-bold text-slate-900 flex items-center gap-3">
                            <div className="p-2 bg-indigo-600 rounded-lg shadow-lg shadow-indigo-200">
                                <Shield className="w-8 h-8 text-white" />
                            </div>
                            <span className="bg-clip-text text-transparent bg-gradient-to-r from-slate-900 to-slate-600">
                                {t('groupManagement.title')}
                            </span>
                        </h1>
                        <p className="mt-2 text-slate-500 text-lg">{t('groupManagement.subtitle')}</p>
                    </div>
                    <button
                        onClick={() => setShowAddModal(true)}
                        className="group flex items-center gap-2 bg-indigo-600 text-white px-6 py-3 rounded-xl hover:bg-indigo-700 transition-all duration-200 shadow-md hover:shadow-xl hover:-translate-y-0.5"
                    >
                        <Plus className="w-5 h-5 group-hover:rotate-90 transition-transform duration-200" />
                        <span className="font-medium">{t('groupManagement.createNewGroup')}</span>
                    </button>
                </div>

                <div className="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-8">
                    {groups.map((group) => (
                        <div
                            key={group.id}
                            className="group bg-white rounded-2xl p-6 shadow-sm hover:shadow-xl transition-all duration-300 border border-slate-100 hover:border-indigo-100 relative overflow-hidden"
                        >
                            <div className="absolute top-0 right-0 w-24 h-24 bg-gradient-to-br from-indigo-50 to-transparent rounded-bl-full -mr-8 -mt-8 transition-transform group-hover:scale-150 duration-500" />

                            <div className="relative">
                                <div className="flex justify-between items-start mb-6">
                                    <div className="flex items-center gap-3">
                                        <div className="p-2 bg-slate-50 rounded-lg group-hover:bg-indigo-50 transition-colors duration-300">
                                            <Users className="w-6 h-6 text-slate-400 group-hover:text-indigo-600" />
                                        </div>
                                        <h3 className="text-xl font-bold text-slate-800">{group.name}</h3>
                                    </div>
                                    <button
                                        onClick={() => setEditingGroup(group)}
                                        className="p-2 text-slate-400 hover:text-indigo-600 hover:bg-indigo-50 rounded-lg transition-all duration-200"
                                        title={t('groupManagement.editPermissions')}
                                    >
                                        <Edit2 className="w-4 h-4" />
                                    </button>
                                </div>

                                <div className="space-y-3">
                                    <h4 className="text-xs font-bold text-slate-400 uppercase tracking-wider flex items-center gap-2">
                                        {t('groupManagement.activePermissions')}
                                        <span className="bg-slate-100 text-slate-600 px-2 py-0.5 rounded-full text-[10px]">
                                            {group.permissions.length}
                                        </span>
                                    </h4>
                                    <div className="flex flex-wrap gap-2 min-h-[60px]">
                                        {group.permissions.map(p => (
                                            <span
                                                key={p}
                                                className="inline-flex items-center px-3 py-1 rounded-full text-xs font-medium bg-emerald-50 text-emerald-700 border border-emerald-100 shadow-sm"
                                            >
                                                <Check className="w-3 h-3 mr-1.5" />
                                                {p.replace('_', ' ')}
                                            </span>
                                        ))}
                                        {group.permissions.length === 0 && (
                                            <span className="text-sm text-slate-400 italic flex items-center gap-2 py-1">
                                                <Shield className="w-4 h-4" />
                                                {t('groupManagement.noPermissions')}
                                            </span>
                                        )}
                                    </div>
                                </div>
                            </div>
                        </div>
                    ))}
                </div>

                {/* Create Group Modal */}
                {showAddModal && (
                    <div className="fixed inset-0 bg-slate-900/60 backdrop-blur-sm flex items-center justify-center p-4 z-50 transition-opacity duration-300">
                        <div className="bg-white rounded-2xl shadow-2xl w-full max-w-md overflow-hidden animate-in fade-in zoom-in duration-200">
                            <div className="p-6 border-b border-slate-100 flex justify-between items-center bg-slate-50/50">
                                <h2 className="text-xl font-bold text-slate-800">{t('groupManagement.modalTitle')}</h2>
                                <button
                                    onClick={() => setShowAddModal(false)}
                                    className="text-slate-400 hover:text-slate-600 transition-colors"
                                >
                                    <X className="w-5 h-5" />
                                </button>
                            </div>

                            <form onSubmit={handleCreateGroup} className="p-6 space-y-6">
                                <div>
                                    <label className="block text-sm font-semibold text-slate-700 mb-2">{t('groupManagement.groupName')}</label>
                                    <input
                                        type="text"
                                        required
                                        placeholder={t('groupManagement.groupNamePlaceholder')}
                                        className="w-full px-4 py-2.5 rounded-xl border border-slate-200 focus:border-indigo-500 focus:ring-4 focus:ring-indigo-500/10 transition-all duration-200 outline-none text-slate-800 placeholder:text-slate-400"
                                        value={newGroup.name}
                                        onChange={e => setNewGroup({ ...newGroup, name: e.target.value })}
                                    />
                                </div>
                                <div>
                                    <label className="block text-sm font-semibold text-slate-700 mb-3">{t('groupManagement.assignPermissions')}</label>
                                    <div className="space-y-2 max-h-60 overflow-y-auto pr-2 custom-scrollbar">
                                        {AVAILABLE_PERMISSIONS.map(perm => (
                                            <label
                                                key={perm.value}
                                                className={`flex items-center p-3 rounded-xl border cursor-pointer transition-all duration-200 ${newGroup.permissions.includes(perm.value)
                                                    ? 'border-indigo-200 bg-indigo-50/50'
                                                    : 'border-slate-100 hover:border-slate-200 hover:bg-slate-50'
                                                    }`}
                                            >
                                                <input
                                                    type="checkbox"
                                                    className="w-4 h-4 rounded border-slate-300 text-indigo-600 focus:ring-indigo-500"
                                                    checked={newGroup.permissions.includes(perm.value)}
                                                    onChange={e => {
                                                        if (e.target.checked) {
                                                            setNewGroup({ ...newGroup, permissions: [...newGroup.permissions, perm.value] });
                                                        } else {
                                                            setNewGroup({ ...newGroup, permissions: newGroup.permissions.filter(p => p !== perm.value) });
                                                        }
                                                    }}
                                                />
                                                <span className="ml-3 text-sm font-medium text-slate-700">{perm.label}</span>
                                            </label>
                                        ))}
                                    </div>
                                </div>

                                <div>
                                    <ProjectSelector
                                        projects={projects}
                                        selected={newGroup.projects}
                                        onChange={(projects) => setNewGroup({ ...newGroup, projects })}
                                    />
                                </div>

                                <div className="flex justify-end gap-3 pt-4">
                                    <button
                                        type="button"
                                        onClick={() => setShowAddModal(false)}
                                        className="px-5 py-2.5 text-sm font-medium text-slate-600 bg-white border border-slate-200 rounded-xl hover:bg-slate-50 hover:text-slate-800 transition-colors"
                                    >
                                        {t('common.cancel')}
                                    </button>
                                    <button
                                        type="submit"
                                        className="px-5 py-2.5 text-sm font-medium text-white bg-indigo-600 rounded-xl hover:bg-indigo-700 shadow-lg shadow-indigo-200 transition-all hover:-translate-y-0.5"
                                    >
                                        {t('groupManagement.createGroup')}
                                    </button>
                                </div>
                            </form>
                        </div>
                    </div>
                )}

                {/* Edit Permissions Modal */}
                {editingGroup && (
                    <div className="fixed inset-0 bg-slate-900/60 backdrop-blur-sm flex items-center justify-center p-4 z-50 transition-opacity duration-300">
                        <div className="bg-white rounded-2xl shadow-2xl w-full max-w-md overflow-hidden animate-in fade-in zoom-in duration-200">
                            <div className="p-6 border-b border-slate-100 flex justify-between items-center bg-slate-50/50">
                                <div>
                                    <h2 className="text-xl font-bold text-slate-800">{t('groupManagement.editModalTitle')}</h2>
                                    <p className="text-sm text-slate-500 mt-0.5">{t('groupManagement.for')} {editingGroup.name}</p>
                                </div>
                                <button
                                    onClick={() => setEditingGroup(null)}
                                    className="text-slate-400 hover:text-slate-600 transition-colors"
                                >
                                    <X className="w-5 h-5" />
                                </button>
                            </div>

                            <div className="p-6 space-y-6">
                                <div className="space-y-2 max-h-[400px] overflow-y-auto pr-2 custom-scrollbar">
                                    {AVAILABLE_PERMISSIONS.map(perm => (
                                        <label
                                            key={perm.value}
                                            className={`flex items-center p-3 rounded-xl border cursor-pointer transition-all duration-200 ${editingGroup.permissions.includes(perm.value)
                                                ? 'border-indigo-200 bg-indigo-50/50'
                                                : 'border-slate-100 hover:border-slate-200 hover:bg-slate-50'
                                                }`}
                                        >
                                            <input
                                                type="checkbox"
                                                className="w-4 h-4 rounded border-slate-300 text-indigo-600 focus:ring-indigo-500"
                                                checked={editingGroup.permissions.includes(perm.value)}
                                                onChange={e => {
                                                    const currentPerms = editingGroup.permissions;
                                                    if (e.target.checked) {
                                                        setEditingGroup({ ...editingGroup, permissions: [...currentPerms, perm.value] });
                                                    } else {
                                                        setEditingGroup({ ...editingGroup, permissions: currentPerms.filter(p => p !== perm.value) });
                                                    }
                                                }}
                                            />
                                            <span className="ml-3 text-sm font-medium text-slate-700">{perm.label}</span>
                                        </label>
                                    ))}
                                </div>

                                <div className="pt-4 border-t border-slate-100">
                                    <ProjectSelector
                                        projects={projects}
                                        selected={editingGroup.projects || []}
                                        onChange={(projects) => setEditingGroup({ ...editingGroup, projects })}
                                    />
                                </div>

                                <div className="flex justify-end gap-3 pt-4">
                                    <button
                                        type="button"
                                        onClick={() => setEditingGroup(null)}
                                        className="px-5 py-2.5 text-sm font-medium text-slate-600 bg-white border border-slate-200 rounded-xl hover:bg-slate-50 hover:text-slate-800 transition-colors"
                                    >
                                        {t('common.cancel')}
                                    </button>
                                    <button
                                        type="button"
                                        onClick={handleUpdatePermissions}
                                        className="px-5 py-2.5 text-sm font-medium text-white bg-indigo-600 rounded-xl hover:bg-indigo-700 shadow-lg shadow-indigo-200 transition-all hover:-translate-y-0.5"
                                    >
                                        {t('groupManagement.saveChanges')}
                                    </button>
                                </div>
                            </div>
                        </div>
                    </div>
                )}
            </div>
        </div>
    );
};

export default GroupManagement;
