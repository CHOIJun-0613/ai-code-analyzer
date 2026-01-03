import { useEffect, useState } from 'react';
import toast from 'react-hot-toast';
import { useTranslation } from 'react-i18next';
import { useForm } from 'react-hook-form';
import { zodResolver } from '@hookform/resolvers/zod';
import { userApi, Group } from '../../api/userApi';
import client from '../../api/client';
import { createGroupSchema, type GroupFormData } from '../../schemas/groupSchema';
import { Plus, Shield, Check, X, Users, MoreVertical, Trash2, Edit } from 'lucide-react';
import ProjectSelector from '../../components/ProjectSelector';
import FormError from '../../components/FormError';

import ConfirmModal from '../../components/ConfirmModal';

const GroupManagement = () => {
    const { t } = useTranslation();

    const AVAILABLE_PERMISSIONS = [
        { value: 'manage_users', label: t('groupManagement.perm.manage_users') },
        { value: 'analyze_code', label: t('groupManagement.perm.analyze_code') },
        { value: 'view_project', label: t('groupManagement.perm.view_project') },
        { value: 'manage_project', label: t('groupManagement.perm.manage_project') },
    ];

    const [groups, setGroups] = useState<Group[]>([]);
    const [projects, setProjects] = useState<any[]>([]);
    const [showAddModal, setShowAddModal] = useState(false);
    const [editingGroupId, setEditingGroupId] = useState<string | null>(null);
    const [activeMenuId, setActiveMenuId] = useState<string | null>(null);
    const [deleteGroupConfirm, setDeleteGroupConfirm] = useState<Group | null>(null);

    // React Hook Form for Create Group
    const createForm = useForm<GroupFormData>({
        resolver: zodResolver(createGroupSchema(t)),
        defaultValues: {
            id: '',
            name: '',
            permissions: [],
            projects: [],
        },
    });

    // React Hook Form for Update Group
    const updateForm = useForm<GroupFormData>({
        resolver: zodResolver(createGroupSchema(t)),
        defaultValues: {
            id: '',
            name: '',
            permissions: [],
            projects: [],
        },
    });

    useEffect(() => {
        const handleClickOutside = () => setActiveMenuId(null);
        window.addEventListener('click', handleClickOutside);
        return () => window.removeEventListener('click', handleClickOutside);
    }, []);

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

    const handleOpenCreateModal = () => {
        createForm.reset({
            id: '',
            name: '',
            permissions: [],
            projects: [],
        });
        setShowAddModal(true);
    };

    const handleOpenEditModal = (group: Group) => {
        setEditingGroupId(group.id);
        updateForm.reset({
            id: group.id,
            name: group.name,
            permissions: group.permissions,
            projects: group.projects || [],
        });
    };

    const onCreateSubmit = async (data: GroupFormData) => {
        try {
            // Check duplicate ID
            const exists = await userApi.checkGroupExists(data.id);
            if (exists) {
                createForm.setError('id', {
                    type: 'manual',
                    message: t('groupManagement.idExists', 'Group ID already exists'),
                });
                toast.error(t('groupManagement.idExists', 'Group ID already exists'));
                return;
            }

            await userApi.createGroup(data);
            toast.success(t('groupManagement.createSuccess') || "Group created successfully");
            setShowAddModal(false);
            loadGroups();
        } catch (error) {
            console.error('Failed to create group:', error);
            toast.error('Failed to create group');
        }
    };

    const onUpdateSubmit = async (data: GroupFormData) => {
        if (!editingGroupId) return;
        try {
            await userApi.updateGroup(editingGroupId, data);
            toast.success(t('groupManagement.updateSuccess') || "Group updated successfully");
            setEditingGroupId(null);
            loadGroups();
        } catch (error) {
            console.error('Failed to update group:', error);
            toast.error('Failed to update group');
        }
    };

    const handleCheckDuplicate = async () => {
        const id = createForm.getValues('id');
        if (!id) {
            toast.error(t('groupManagement.enterGroupId') || "Please enter a group ID");
            return;
        }

        try {
            const exists = await userApi.checkGroupExists(id);
            if (exists) {
                createForm.setError('id', {
                    type: 'manual',
                    message: t('groupManagement.idExists', 'Group ID already exists'),
                });
                toast.error('Group ID already exists');
            } else {
                createForm.clearErrors('id');
                toast.success('Group ID is available');
            }
        } catch (e) {
            console.error(e);
            toast.error('Failed to check duplicate');
        }
    };

    const handleDeleteGroup = (group: Group) => {
        setDeleteGroupConfirm(group);
    };

    const executeDeleteGroup = async () => {
        if (!deleteGroupConfirm) return;
        try {
            await userApi.deleteGroup(deleteGroupConfirm.id);
            loadGroups();
            toast.success(t('groupManagement.deleteSuccess') || "Group deleted successfully");
        } catch (error) {
            console.error('Failed to delete group:', error);
            toast.error('Failed to delete group');
        } finally {
            setDeleteGroupConfirm(null);
        }
    };

    const handlePermissionChange = (form: typeof createForm | typeof updateForm, permValue: string, checked: boolean) => {
        const currentPerms = form.getValues('permissions') || [];
        if (checked) {
            form.setValue('permissions', [...currentPerms, permValue]);
        } else {
            form.setValue('permissions', currentPerms.filter(p => p !== permValue));
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
                        onClick={handleOpenCreateModal}
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
                            className="group bg-white rounded-2xl p-6 shadow-sm hover:shadow-xl transition-all duration-300 border border-slate-100 hover:border-indigo-100 relative overflow-visible"
                        >
                            <div className="absolute top-0 right-0 w-24 h-24 bg-gradient-to-br from-indigo-50 to-transparent rounded-bl-full -mr-8 -mt-8 transition-transform group-hover:scale-150 duration-500 pointer-events-none" />

                            <div className="relative">
                                <div className="flex justify-between items-start mb-6">
                                    <div className="flex items-center gap-3">
                                        <div className="p-2 bg-slate-50 rounded-lg group-hover:bg-indigo-50 transition-colors duration-300">
                                            <Users className="w-6 h-6 text-slate-400 group-hover:text-indigo-600" />
                                        </div>
                                        <div>
                                            <h3 className="text-xl font-bold text-slate-800">{group.name}</h3>
                                            <p className="text-xs text-slate-400 font-mono mt-1">ID: {group.id}</p>
                                        </div>
                                    </div>

                                    <div className="relative">
                                        <button
                                            onClick={(e) => {
                                                e.stopPropagation();
                                                setActiveMenuId(activeMenuId === group.id ? null : group.id);
                                            }}
                                            className="p-2 text-slate-300 hover:text-slate-600 hover:bg-slate-50 rounded-lg transition-all duration-200"
                                        >
                                            <MoreVertical className="w-5 h-5" />
                                        </button>

                                        {activeMenuId === group.id && (
                                            <div className="absolute right-0 top-full mt-1 w-32 bg-white border border-slate-100 rounded-lg shadow-lg z-50 py-1 animate-in fade-in zoom-in duration-100 origin-top-right">
                                                <button
                                                    onClick={() => handleOpenEditModal(group)}
                                                    className="w-full text-left px-3 py-2 text-sm text-slate-700 hover:bg-slate-50 flex items-center gap-2"
                                                >
                                                    <Edit className="w-3.5 h-3.5" />
                                                    {t('common.edit', 'Edit')}
                                                </button>
                                                <button
                                                    onClick={() => handleDeleteGroup(group)}
                                                    className="w-full text-left px-3 py-2 text-sm text-red-600 hover:bg-red-50 flex items-center gap-2"
                                                >
                                                    <Trash2 className="w-3.5 h-3.5" />
                                                    {t('common.delete', 'Delete')}
                                                </button>
                                            </div>
                                        )}
                                    </div>
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
                        <div className="bg-white rounded-2xl shadow-2xl w-full max-w-md overflow-hidden animate-in fade-in zoom-in duration-200 max-h-[90vh] flex flex-col">
                            <div className="p-6 border-b border-slate-100 flex justify-between items-center bg-slate-50/50 flex-shrink-0">
                                <h2 className="text-xl font-bold text-slate-800">{t('groupManagement.modalTitle')}</h2>
                                <button
                                    onClick={() => setShowAddModal(false)}
                                    className="text-slate-400 hover:text-slate-600 transition-colors"
                                >
                                    <X className="w-5 h-5" />
                                </button>
                            </div>

                            <form onSubmit={createForm.handleSubmit(onCreateSubmit)} className="flex flex-col flex-1 overflow-hidden">
                                <div className="p-6 space-y-6 overflow-y-auto flex-1 custom-scrollbar">
                                    <div>
                                        <label className="block text-sm font-semibold text-slate-700 mb-2">{t('groupManagement.groupId', 'Group ID')}</label>
                                        <div className="flex gap-2">
                                            <div className="flex-1">
                                                <input
                                                    type="text"
                                                    placeholder="unique_group_id"
                                                    {...createForm.register('id')}
                                                    className="w-full px-4 py-2.5 rounded-xl border border-slate-200 focus:border-indigo-500 focus:ring-4 focus:ring-indigo-500/10 transition-all duration-200 outline-none text-slate-800 placeholder:text-slate-400"
                                                />
                                                <FormError message={createForm.formState.errors.id?.message} />
                                            </div>
                                            <button
                                                type="button"
                                                onClick={handleCheckDuplicate}
                                                className="px-3 py-2.5 bg-slate-100 text-slate-600 rounded-xl hover:bg-slate-200 text-sm font-medium whitespace-nowrap"
                                            >
                                                Check
                                            </button>
                                        </div>
                                    </div>
                                    <div>
                                        <label className="block text-sm font-semibold text-slate-700 mb-2">{t('groupManagement.groupName')}</label>
                                        <input
                                            type="text"
                                            placeholder={t('groupManagement.groupNamePlaceholder')}
                                            {...createForm.register('name')}
                                            className="w-full px-4 py-2.5 rounded-xl border border-slate-200 focus:border-indigo-500 focus:ring-4 focus:ring-indigo-500/10 transition-all duration-200 outline-none text-slate-800 placeholder:text-slate-400"
                                        />
                                        <FormError message={createForm.formState.errors.name?.message} />
                                    </div>
                                    <div>
                                        <label className="block text-sm font-semibold text-slate-700 mb-3">{t('groupManagement.assignPermissions')}</label>
                                        <div className="space-y-2 max-h-60 overflow-y-auto pr-2 custom-scrollbar">
                                            {AVAILABLE_PERMISSIONS.map(perm => {
                                                const currentPerms = createForm.watch('permissions') || [];
                                                const isChecked = currentPerms.includes(perm.value);

                                                return (
                                                    <label
                                                        key={perm.value}
                                                        className={`flex items-center p-3 rounded-xl border cursor-pointer transition-all duration-200 ${isChecked
                                                            ? 'border-indigo-200 bg-indigo-50/50'
                                                            : 'border-slate-100 hover:border-slate-200 hover:bg-slate-50'
                                                        }`}
                                                    >
                                                        <input
                                                            type="checkbox"
                                                            className="w-4 h-4 rounded border-slate-300 text-indigo-600 focus:ring-indigo-500"
                                                            checked={isChecked}
                                                            onChange={(e) => handlePermissionChange(createForm, perm.value, e.target.checked)}
                                                        />
                                                        <span className="ml-3 text-sm font-medium text-slate-700">{perm.label}</span>
                                                    </label>
                                                );
                                            })}
                                        </div>
                                    </div>

                                    <div>
                                        <ProjectSelector
                                            projects={projects}
                                            selected={createForm.watch('projects') || []}
                                            onChange={(projects) => createForm.setValue('projects', projects)}
                                        />
                                    </div>
                                </div>

                                <div className="p-6 border-t border-slate-100 flex justify-end gap-3 bg-white flex-shrink-0">
                                    <button
                                        type="button"
                                        onClick={() => setShowAddModal(false)}
                                        className="px-5 py-2.5 text-sm font-medium text-slate-600 bg-white border border-slate-200 rounded-xl hover:bg-slate-50 hover:text-slate-800 transition-colors"
                                    >
                                        {t('common.cancel')}
                                    </button>
                                    <button
                                        type="submit"
                                        disabled={createForm.formState.isSubmitting}
                                        className="px-5 py-2.5 text-sm font-medium text-white bg-indigo-600 rounded-xl hover:bg-indigo-700 shadow-lg shadow-indigo-200 transition-all hover:-translate-y-0.5 disabled:opacity-50 disabled:cursor-not-allowed"
                                    >
                                        {createForm.formState.isSubmitting ? (
                                            <span className="flex items-center gap-2">
                                                <span className="w-4 h-4 border-2 border-white/30 border-t-white rounded-full animate-spin" />
                                                {t('common.saving')}
                                            </span>
                                        ) : (
                                            t('groupManagement.createGroup')
                                        )}
                                    </button>
                                </div>
                            </form>
                        </div>
                    </div>
                )}

                {/* Edit Group Modal */}
                {editingGroupId && (
                    <div className="fixed inset-0 bg-slate-900/60 backdrop-blur-sm flex items-center justify-center p-4 z-50 transition-opacity duration-300">
                        <div className="bg-white rounded-2xl shadow-2xl w-full max-w-md overflow-hidden animate-in fade-in zoom-in duration-200 max-h-[90vh] flex flex-col">
                            <div className="p-6 border-b border-slate-100 flex justify-between items-center bg-slate-50/50 flex-shrink-0">
                                <div>
                                    <h2 className="text-xl font-bold text-slate-800">{t('groupManagement.editModalTitle')}</h2>
                                    <p className="text-sm text-slate-500 mt-0.5">{t('groupManagement.for')} {editingGroupId}</p>
                                </div>
                                <button
                                    onClick={() => setEditingGroupId(null)}
                                    className="text-slate-400 hover:text-slate-600 transition-colors"
                                >
                                    <X className="w-5 h-5" />
                                </button>
                            </div>

                            <form onSubmit={updateForm.handleSubmit(onUpdateSubmit)} className="flex flex-col flex-1 overflow-hidden">
                                <div className="p-6 space-y-6 overflow-y-auto flex-1 custom-scrollbar">
                                    <div>
                                        <label className="block text-sm font-semibold text-slate-700 mb-2">{t('groupManagement.groupId', 'Group ID')}</label>
                                        <input
                                            type="text"
                                            disabled
                                            {...updateForm.register('id')}
                                            className="w-full px-4 py-2.5 rounded-xl border border-slate-200 bg-slate-100 text-slate-500 cursor-not-allowed"
                                        />
                                    </div>
                                    <div>
                                        <label className="block text-sm font-semibold text-slate-700 mb-2">{t('groupManagement.groupName')}</label>
                                        <input
                                            type="text"
                                            {...updateForm.register('name')}
                                            className="w-full px-4 py-2.5 rounded-xl border border-slate-200 focus:border-indigo-500 focus:ring-4 focus:ring-indigo-500/10 transition-all duration-200 outline-none text-slate-800"
                                        />
                                        <FormError message={updateForm.formState.errors.name?.message} />
                                    </div>

                                    <div className="space-y-2 max-h-[200px] overflow-y-auto pr-2 custom-scrollbar border border-slate-100 rounded-xl p-2">
                                        <label className="block text-xs font-semibold text-slate-500 mb-2 uppercase">{t('groupManagement.editPermissions')}</label>
                                        {AVAILABLE_PERMISSIONS.map(perm => {
                                            const currentPerms = updateForm.watch('permissions') || [];
                                            const isChecked = currentPerms.includes(perm.value);

                                            return (
                                                <label
                                                    key={perm.value}
                                                    className={`flex items-center p-2 rounded-lg cursor-pointer transition-all duration-200 ${isChecked
                                                        ? 'bg-indigo-50/50'
                                                        : 'hover:bg-slate-50'
                                                    }`}
                                                >
                                                    <input
                                                        type="checkbox"
                                                        className="w-4 h-4 rounded border-slate-300 text-indigo-600 focus:ring-indigo-500"
                                                        checked={isChecked}
                                                        onChange={(e) => handlePermissionChange(updateForm, perm.value, e.target.checked)}
                                                    />
                                                    <span className="ml-3 text-sm font-medium text-slate-700">{perm.label}</span>
                                                </label>
                                            );
                                        })}
                                    </div>

                                    <div className="pt-4 border-t border-slate-100">
                                        <ProjectSelector
                                            projects={projects}
                                            selected={updateForm.watch('projects') || []}
                                            onChange={(projects) => updateForm.setValue('projects', projects)}
                                        />
                                    </div>
                                </div>

                                <div className="p-6 border-t border-slate-100 flex justify-end gap-3 bg-white flex-shrink-0">
                                    <button
                                        type="button"
                                        onClick={() => setEditingGroupId(null)}
                                        className="px-5 py-2.5 text-sm font-medium text-slate-600 bg-white border border-slate-200 rounded-xl hover:bg-slate-50 hover:text-slate-800 transition-colors"
                                    >
                                        {t('common.cancel')}
                                    </button>
                                    <button
                                        type="submit"
                                        disabled={updateForm.formState.isSubmitting}
                                        className="px-5 py-2.5 text-sm font-medium text-white bg-indigo-600 rounded-xl hover:bg-indigo-700 shadow-lg shadow-indigo-200 transition-all hover:-translate-y-0.5 disabled:opacity-50 disabled:cursor-not-allowed"
                                    >
                                        {updateForm.formState.isSubmitting ? (
                                            <span className="flex items-center gap-2">
                                                <span className="w-4 h-4 border-2 border-white/30 border-t-white rounded-full animate-spin" />
                                                {t('common.saving')}
                                            </span>
                                        ) : (
                                            t('groupManagement.saveChanges')
                                        )}
                                    </button>
                                </div>
                            </form>
                        </div>
                    </div>
                )}

                <ConfirmModal
                    isOpen={!!deleteGroupConfirm}
                    onClose={() => setDeleteGroupConfirm(null)}
                    onConfirm={executeDeleteGroup}
                    title={t('groupManagement.deleteGroupTitle') || "Delete Group"}
                    message={t('groupManagement.deleteConfirm') || "Are you sure you want to delete this group?"}
                    confirmText={t('common.delete') || "Delete"}
                    variant="danger"
                />
            </div>
        </div>
    );
};

export default GroupManagement;
