import React, { useEffect, useState, useRef } from 'react';
import toast from 'react-hot-toast';
import { useTranslation } from 'react-i18next';
import { useForm } from 'react-hook-form';
import { zodResolver } from '@hookform/resolvers/zod';
import { userApi, User, Group } from '../../api/userApi';
import { createUserSchemaFactory, updateUserSchemaFactory, type CreateUserFormData, type UpdateUserFormData } from '../../schemas/userSchema';
import { Plus, User as UserIcon, Mail, Search, MoreVertical, X, Eye, EyeOff, Edit, Trash2, FileSpreadsheet, ArrowUpDown, ArrowUp, ArrowDown, Download } from 'lucide-react';
import ExcelJS from 'exceljs';

import ConfirmModal from '../../components/ConfirmModal';
import FormError from '../../components/FormError';

type SortKey = 'username' | 'name' | 'email' | 'created_at' | 'updated_at';
type SortDirection = 'asc' | 'desc';

interface SortConfig {
    key: SortKey;
    direction: SortDirection;
}

const UserManagement = () => {
    const { t } = useTranslation();
    const [users, setUsers] = useState<User[]>([]);
    const [groups, setGroups] = useState<Group[]>([]);
    const [showModal, setShowModal] = useState(false);
    const [isEditing, setIsEditing] = useState(false);
    const [editingUserId, setEditingUserId] = useState('');
    const [searchTerm, setSearchTerm] = useState('');
    const [showPassword, setShowPassword] = useState(false);
    const [activeMenuId, setActiveMenuId] = useState<string | null>(null);
    const [sortConfig, setSortConfig] = useState<SortConfig>({ key: 'created_at', direction: 'desc' });
    const [isUploading, setIsUploading] = useState(false);
    const fileInputRef = useRef<HTMLInputElement>(null);
    const [deleteUserConfirm, setDeleteUserConfirm] = useState<User | null>(null);
    const [editingUser, setEditingUser] = useState<User | null>(null);

    // React Hook Form for Create User
    const createForm = useForm<CreateUserFormData>({
        resolver: zodResolver(createUserSchemaFactory(t)),
        defaultValues: {
            username: '',
            name: '',
            email: '',
            password: '',
            phone_number: '',
            group_ids: [],
        },
    });

    // React Hook Form for Update User
    const updateForm = useForm<UpdateUserFormData>({
        resolver: zodResolver(updateUserSchemaFactory(t)),
        defaultValues: {
            name: '',
            email: '',
            password: '',
            phone_number: '',
            group_ids: [],
        },
    });

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
        setEditingUserId('');
        setEditingUser(null);
        createForm.reset({
            username: '',
            name: '',
            email: '',
            password: '',
            phone_number: '',
            group_ids: [],
        });
        setShowPassword(false);
        setShowModal(true);
    };

    const handleEditUser = (user: User) => {
        setIsEditing(true);
        setEditingUserId(user.id);
        setEditingUser(user);
        updateForm.reset({
            name: user.name || '',
            email: user.email,
            password: '',
            phone_number: user.phone_number || '',
            group_ids: user.groups.map(g => g.id),
        });
        setShowPassword(false);
        setShowModal(true);
    };

    const onCreateSubmit = async (data: CreateUserFormData) => {
        try {
            // Check for duplicates
            const exists = await userApi.checkUserExists(data.username);
            if (exists) {
                createForm.setError('username', {
                    type: 'manual',
                    message: t('userManagement.idExists'),
                });
                toast.error(t('userManagement.idExists'));
                return;
            }
            await userApi.createUser({
                id: '',
                ...data,
            });
            toast.success(t('userManagement.createSuccess') || "User created successfully");
            setShowModal(false);
            loadData();
        } catch (error) {
            console.error('Failed to create user:', error);
            toast.error('Failed to create user');
        }
    };

    const onUpdateSubmit = async (data: UpdateUserFormData) => {
        try {
            await userApi.updateUser(editingUserId, {
                name: data.name,
                email: data.email,
                phone_number: data.phone_number,
                group_ids: data.group_ids || [],
                ...(data.password ? { password: data.password } : {}),
            });
            toast.success(t('userManagement.updateSuccess') || "User updated successfully");
            setShowModal(false);
            loadData();
        } catch (error) {
            console.error('Failed to update user:', error);
            toast.error('Failed to update user');
        }
    };

    const handleCheckDuplicate = async () => {
        const username = createForm.getValues('username');
        if (!username) {
            toast.error(t('userManagement.enterUserId') || "Please enter a user ID");
            return;
        }

        try {
            const exists = await userApi.checkUserExists(username);
            if (exists) {
                createForm.setError('username', {
                    type: 'manual',
                    message: t('userManagement.idExists'),
                });
                toast.error(t('userManagement.idExists'));
            } else {
                createForm.clearErrors('username');
                toast.success(t('userManagement.idAvailable'));
            }
        } catch (error) {
            console.error('Failed to check duplicate:', error);
            toast.error('Failed to check duplicate');
        }
    };

    const handleDeleteUser = (user: User) => {
        setDeleteUserConfirm(user);
    };

    const executeDeleteUser = async () => {
        if (!deleteUserConfirm) return;
        try {
            await userApi.deleteUser(deleteUserConfirm.id);
            loadData();
            toast.success(t('userManagement.deleteSuccess') || "User deleted successfully");
        } catch (error) {
            console.error('Failed to delete user:', error);
            toast.error('Failed to delete user');
        } finally {
            setDeleteUserConfirm(null);
        }
    };

    const handleSort = (key: SortKey) => {
        setSortConfig(current => ({
            key,
            direction: current.key === key && current.direction === 'asc' ? 'desc' : 'asc'
        }));
    };

    const handleDownloadTemplate = async () => {
        const workbook = new ExcelJS.Workbook();
        const worksheet = workbook.addWorksheet('Users');

        worksheet.columns = [
            { header: 'User ID', key: 'username', width: 15 },
            { header: 'User Name', key: 'name', width: 20 },
            { header: 'Email', key: 'email', width: 30 },
            { header: 'Password', key: 'password', width: 15 },
            { header: 'Phone Number', key: 'phone', width: 15 },
            { header: 'UserGroup', key: 'groups', width: 20 }
        ];

        // Add sample row
        worksheet.addRow({
            username: 'user1',
            name: 'Test User 1',
            email: 'user1@example.com',
            password: 'password123!',
            phone: '010-1234-5678',
            groups: 'group1,group2'
        });

        worksheet.getRow(1).font = { bold: true };

        const buffer = await workbook.xlsx.writeBuffer();
        const blob = new Blob([buffer], { type: 'application/vnd.openxmlformats-officedocument.spreadsheetml.sheet' });
        const url = window.URL.createObjectURL(blob);
        const anchor = document.createElement('a');
        anchor.href = url;
        anchor.download = 'user_import_template.xlsx';
        anchor.click();
        window.URL.revokeObjectURL(url);
    };

    const handleExcelUpload = async (e: React.ChangeEvent<HTMLInputElement>) => {
        const file = e.target.files?.[0];
        if (!file) return;

        setIsUploading(true);
        const reader = new FileReader();

        reader.onload = async (evt) => {
            try {
                const buffer = evt.target?.result as ArrayBuffer;
                const workbook = new ExcelJS.Workbook();
                await workbook.xlsx.load(buffer);

                const worksheet = workbook.worksheets[0];
                if (!worksheet) {
                    throw new Error('No worksheet found');
                }

                let successCount = 0;
                let failCount = 0;
                const usersToCreate: any[] = [];

                worksheet.eachRow((row, rowNumber) => {
                    if (rowNumber === 1) return; // Skip header

                    const getCellText = (colIndex: number) => {
                        const cell = row.getCell(colIndex);
                        return cell.text ? cell.text : (cell.value ? String(cell.value) : '');
                    };

                    const usernameStr = getCellText(1);
                    const nameStr = getCellText(2);
                    const emailStr = getCellText(3);
                    const passwordStr = getCellText(4);
                    const phoneNumberStr = getCellText(5);
                    const groupsStr = getCellText(6);

                    if (usernameStr && emailStr && passwordStr) {
                        const groupNames = groupsStr ? groupsStr.split(',').map(g => g.trim()).filter(Boolean) : [];
                        const groupIds = groupNames.map(gName => {
                            const group = groups.find(g => g.name === gName);
                            return group ? group.id : null;
                        }).filter(id => id !== null) as string[];

                        usersToCreate.push({
                            username: usernameStr,
                            name: nameStr || usernameStr,
                            email: emailStr,
                            password: passwordStr,
                            phone_number: phoneNumberStr,
                            group_ids: groupIds
                        });
                    } else {
                        console.warn(`Row ${rowNumber} missing required fields.`);
                    }
                });

                for (const user of usersToCreate) {
                    try {
                        const exists = await userApi.checkUserExists(user.username);
                        if (exists) {
                            console.warn(`User ${user.username} already exists`);
                            failCount++;
                            continue;
                        }

                        await userApi.createUser({
                            id: '',
                            username: user.username,
                            name: user.name,
                            email: user.email,
                            password: user.password,
                            phone_number: user.phone_number,
                            group_ids: user.group_ids
                        });
                        successCount++;
                    } catch (err) {
                        console.error(`Failed to create user ${user.username}:`, err);
                        failCount++;
                    }
                }

                toast.success(t('userManagement.uploadSuccess', { count: successCount }));
                if (failCount > 0) {
                    console.warn(`${failCount} users failed to import.`);
                }
                loadData();
            } catch (error) {
                console.error('Excel processing error:', error);
                toast.error(t('userManagement.uploadError', { error: 'Invalid file format or processing error' }));
            } finally {
                setIsUploading(false);
                if (fileInputRef.current) fileInputRef.current.value = '';
            }
        };
        reader.readAsArrayBuffer(file);
    };

    const sortedUsers = [...users].filter(user =>
        user.username.toLowerCase().includes(searchTerm.toLowerCase()) ||
        (user.name && user.name.toLowerCase().includes(searchTerm.toLowerCase())) ||
        user.email.toLowerCase().includes(searchTerm.toLowerCase())
    ).sort((a, b) => {
        const aValue = a[sortConfig.key];
        const bValue = b[sortConfig.key];

        if (!aValue && !bValue) return 0;
        if (!aValue) return 1;
        if (!bValue) return -1;

        if (String(aValue).toLowerCase() < String(bValue).toLowerCase()) {
            return sortConfig.direction === 'asc' ? -1 : 1;
        }
        if (String(aValue).toLowerCase() > String(bValue).toLowerCase()) {
            return sortConfig.direction === 'asc' ? 1 : -1;
        }
        return 0;
    });

    const getSortIcon = (key: SortKey) => {
        if (sortConfig.key !== key) return <ArrowUpDown className="w-4 h-4 text-slate-300 ml-1" />;
        return sortConfig.direction === 'asc'
            ? <ArrowUp className="w-4 h-4 text-indigo-600 ml-1" />
            : <ArrowDown className="w-4 h-4 text-indigo-600 ml-1" />;
    };

    return (
        <div className="min-h-screen bg-slate-50 dark:bg-slate-950 p-8">
            <div className="max-w-7xl mx-auto">
                <div className="flex justify-between items-start mb-8">
                    <div className="flex items-center gap-3">
                        <div className="p-3 bg-indigo-50 dark:bg-indigo-500/10 rounded-xl">
                            <UserIcon className="w-8 h-8 text-indigo-600 dark:text-indigo-400" />
                        </div>
                        <div>
                            <div className="flex items-center gap-3">
                                <h1 className="text-2xl font-bold text-slate-800 dark:text-white">{t('userManagement.title')}</h1>
                                <span className="px-2.5 py-0.5 rounded-full bg-slate-100 dark:bg-slate-800 text-slate-600 dark:text-slate-300 text-xs font-semibold border border-slate-200 dark:border-slate-700">
                                    {users.length}
                                </span>
                            </div>
                            <p className="text-slate-500 dark:text-slate-400 text-xs mt-1">{t('userManagement.subtitle')}</p>
                        </div>
                    </div>
                    <div className="flex gap-3">
                        <button
                            onClick={handleDownloadTemplate}
                            className="flex items-center gap-2 px-4 py-2 bg-white dark:bg-slate-900 text-indigo-600 dark:text-indigo-400 rounded-xl hover:bg-slate-50 dark:hover:bg-slate-800 border border-slate-200 dark:border-slate-700 transition-all font-medium text-xs shadow-sm hover:shadow"
                        >
                            <Download className="w-4 h-4" />
                            {t('userManagement.downloadTemplate')}
                        </button>
                        <div className="relative">
                            <input
                                type="file"
                                accept=".xlsx, .xls"
                                onChange={handleExcelUpload}
                                className="hidden"
                                id="excel-upload"
                                disabled={isUploading}
                            />
                            <label
                                htmlFor="excel-upload"
                                className={`flex items-center gap-2 px-4 py-2 bg-white dark:bg-slate-900 text-emerald-600 dark:text-emerald-400 rounded-xl hover:bg-slate-50 dark:hover:bg-slate-800 border border-slate-200 dark:border-slate-700 transition-all font-medium text-xs shadow-sm cursor-pointer hover:shadow ${isUploading ? 'opacity-50 cursor-not-allowed' : ''}`}
                            >
                                <FileSpreadsheet className="w-4 h-4" />
                                {isUploading ? t('userManagement.processing') : t('userManagement.excelBatchRegistration')}
                            </label>
                        </div>
                        <button
                            onClick={handleCreateUser}
                            className="flex items-center gap-2 px-4 py-2 bg-indigo-600 text-white rounded-xl hover:bg-indigo-700 shadow-lg shadow-indigo-200 dark:shadow-none transition-all hover:-translate-y-0.5 font-medium text-xs"
                        >
                            <Plus className="w-4 h-4" />
                            {t('userManagement.addUser')}
                        </button>
                    </div>
                </div>

                <div className="bg-white dark:bg-slate-900 rounded-2xl shadow-sm border border-slate-200 dark:border-slate-800 overflow-visible">
                    {/* Filters */}
                    <div className="p-5 border-b border-slate-100 dark:border-slate-800 flex gap-4">
                        <div className="relative flex-1 max-w-md">
                            <Search className="absolute left-3 top-1/2 -translate-y-1/2 text-slate-400 w-4 h-4" />
                            <input
                                type="text"
                                placeholder={t('userManagement.searchPlaceholder')}
                                className="w-full pl-10 pr-4 py-2 rounded-xl border border-slate-200 dark:border-slate-700 bg-white dark:bg-slate-900 text-slate-600 dark:text-slate-300 placeholder:text-slate-400 focus:border-indigo-500 focus:ring-4 focus:ring-indigo-500/10 transition-all duration-200 outline-none text-xs"
                                value={searchTerm}
                                onChange={(e) => setSearchTerm(e.target.value)}
                            />
                        </div>
                    </div>

                    {/* Data Table */}
                    <div className="overflow-x-auto">
                        <table className="w-full text-left border-collapse">
                            <thead>
                                <tr className="bg-slate-50 dark:bg-slate-800/50 border-b border-slate-200 dark:border-slate-700 text-xs uppercase text-slate-500 dark:text-slate-400 font-semibold tracking-wider">
                                    <th className="px-6 py-4 cursor-pointer hover:bg-slate-100 dark:hover:bg-slate-800 transition-colors" onClick={() => handleSort('username')}>
                                        <div className="flex items-center">
                                            {t('userManagement.table.userId')}
                                            {getSortIcon('username')}
                                        </div>
                                    </th>
                                    <th className="px-6 py-4 cursor-pointer hover:bg-slate-100 dark:hover:bg-slate-800 transition-colors" onClick={() => handleSort('name')}>
                                        <div className="flex items-center">
                                            {t('userManagement.table.userName')}
                                            {getSortIcon('name')}
                                        </div>
                                    </th>
                                    <th className="px-6 py-4 cursor-pointer hover:bg-slate-100 dark:hover:bg-slate-800 transition-colors" onClick={() => handleSort('email')}>
                                        <div className="flex items-center">
                                            {t('userManagement.table.email')}
                                            {getSortIcon('email')}
                                        </div>
                                    </th>
                                    <th className="px-6 py-4">
                                        {t('userManagement.table.groups')}
                                    </th>
                                    <th className="px-6 py-4 cursor-pointer hover:bg-slate-100 dark:hover:bg-slate-800 transition-colors" onClick={() => handleSort('updated_at')}>
                                        <div className="flex items-center">
                                            {t('userManagement.table.lastUpdated')}
                                            {getSortIcon('updated_at')}
                                        </div>
                                    </th>
                                    <th className="px-6 py-4 cursor-pointer hover:bg-slate-100 dark:hover:bg-slate-800 transition-colors" onClick={() => handleSort('created_at')}>
                                        <div className="flex items-center">
                                            {t('userManagement.table.createdDate')}
                                            {getSortIcon('created_at')}
                                        </div>
                                    </th>
                                    <th className="px-6 py-4 text-right">
                                        {t('userManagement.table.actions')}
                                    </th>
                                </tr>
                            </thead>
                            <tbody className="divide-y divide-slate-100 dark:divide-slate-800">
                                {sortedUsers.length === 0 ? (
                                    <tr>
                                        <td colSpan={7} className="px-6 py-12 text-center text-slate-500 dark:text-slate-400">
                                            {t('common.noData')}
                                        </td>
                                    </tr>
                                ) : (
                                    sortedUsers.map((user) => (
                                        <tr key={user.id} className="hover:bg-slate-50/80 dark:hover:bg-slate-800/50 transition-colors group">
                                            <td className="px-6 py-4 text-sm font-medium text-slate-900 dark:text-slate-200 cursor-pointer hover:text-indigo-600 dark:hover:text-indigo-400 group/cell" onClick={() => handleEditUser(user)}>
                                                <div className="flex items-center gap-1">
                                                    {user.username}
                                                </div>
                                            </td>
                                            <td className="px-6 py-4 text-sm text-slate-600 dark:text-slate-400 cursor-pointer hover:text-indigo-600 dark:hover:text-indigo-400" onClick={() => handleEditUser(user)}>
                                                {user.name || '-'}
                                            </td>
                                            <td className="px-6 py-4 text-sm text-slate-600 dark:text-slate-400 cursor-pointer hover:text-indigo-600 dark:hover:text-indigo-400" onClick={() => handleEditUser(user)}>
                                                <div className="flex items-center gap-2">
                                                    <Mail className="w-3.5 h-3.5 text-slate-400 group-hover:text-indigo-500" />
                                                    {user.email}
                                                </div>
                                            </td>
                                            <td className="px-6 py-4 text-sm">
                                                <div className="flex flex-wrap gap-1.5 items-center">
                                                    {user.groups.length > 0 ? (
                                                        <>
                                                            {user.groups.slice(0, 2).map(g => (
                                                                <span key={g.id} className="inline-flex items-center px-2 py-0.5 rounded text-xs font-medium bg-indigo-50 dark:bg-indigo-900/30 text-indigo-700 dark:text-indigo-400 border border-indigo-100 dark:border-indigo-800">
                                                                    {g.name}
                                                                </span>
                                                            ))}
                                                            {user.groups.length > 2 && (
                                                                <span className="text-slate-400 text-xs py-0.5" title={user.groups.slice(2).map(g => g.name).join(', ')}>...</span>
                                                            )}
                                                        </>
                                                    ) : (
                                                        <span className="text-slate-400 italic text-xs">{t('userManagement.noGroups')}</span>
                                                    )}
                                                </div>
                                            </td>
                                            <td className="px-6 py-4 text-sm text-slate-500 dark:text-slate-400 whitespace-nowrap">
                                                {user.updated_at ? new Date(user.updated_at).toLocaleDateString() : '-'}
                                            </td>
                                            <td className="px-6 py-4 text-sm text-slate-500 dark:text-slate-400 whitespace-nowrap">
                                                {user.created_at ? new Date(user.created_at).toLocaleDateString() : '-'}
                                            </td>
                                            <td className="px-6 py-4 text-right">
                                                <div className="relative inline-block text-left">
                                                    <button
                                                        onClick={(e) => {
                                                            e.stopPropagation();
                                                            setActiveMenuId(activeMenuId === user.id ? null : user.id);
                                                        }}
                                                        className="p-1.5 text-slate-400 hover:text-slate-600 dark:hover:text-slate-300 transition-colors rounded hover:bg-slate-100 dark:hover:bg-slate-800"
                                                    >
                                                        <MoreVertical className="w-4 h-4" />
                                                    </button>

                                                    {activeMenuId === user.id && (
                                                        <div className="absolute right-0 top-full mt-1 w-36 bg-white dark:bg-slate-800 border border-slate-100 dark:border-slate-700 rounded-lg shadow-xl z-20 py-1 origin-top-right animate-in fade-in zoom-in duration-100">
                                                            <button
                                                                onClick={() => handleEditUser(user)}
                                                                className="w-full text-left px-4 py-2 text-sm text-slate-700 dark:text-slate-300 hover:bg-slate-50 dark:hover:bg-slate-700/50 flex items-center gap-2"
                                                            >
                                                                <Edit className="w-3.5 h-3.5" />
                                                                {t('common.edit')}
                                                            </button>
                                                            <button
                                                                onClick={() => handleDeleteUser(user)}
                                                                className="w-full text-left px-4 py-2 text-sm text-red-600 dark:text-red-400 hover:bg-red-50 dark:hover:bg-red-900/20 flex items-center gap-2"
                                                            >
                                                                <Trash2 className="w-3.5 h-3.5" />
                                                                {t('common.delete')}
                                                            </button>
                                                        </div>
                                                    )}
                                                </div>
                                            </td>
                                        </tr>
                                    ))
                                )}
                            </tbody>
                        </table>
                    </div>
                </div>

                {/* Create/Edit User Modal */}
                {showModal && (
                    <div className="fixed inset-0 bg-slate-900/60 backdrop-blur-sm flex items-center justify-center p-4 z-50 transition-opacity duration-300">
                        <div className="bg-white dark:bg-slate-900 rounded-2xl shadow-2xl w-full max-w-md overflow-hidden animate-in fade-in zoom-in duration-200 max-h-[90vh] flex flex-col border border-slate-200 dark:border-slate-800">
                            <div className="p-6 border-b border-slate-100 dark:border-slate-800 flex justify-between items-center bg-slate-50/50 dark:bg-slate-800/50 flex-shrink-0">
                                <h2 className="text-xl font-bold text-slate-800 dark:text-white">
                                    {isEditing ? t('userManagement.editUserTitle') : t('userManagement.modalTitle')}
                                </h2>
                                <button
                                    onClick={() => setShowModal(false)}
                                    className="text-slate-400 hover:text-slate-600 dark:hover:text-slate-300 transition-colors"
                                >
                                    <X className="w-5 h-5" />
                                </button>
                            </div>

                            {isEditing ? (
                                <form onSubmit={updateForm.handleSubmit(onUpdateSubmit)} className="flex flex-col flex-1 overflow-hidden">
                                    <div className="p-6 space-y-5 overflow-y-auto flex-1 custom-scrollbar">
                                        <div>
                                            <label className="block text-sm font-semibold text-slate-700 dark:text-slate-300 mb-2">{t('userManagement.userId')}</label>
                                            <input
                                                type="text"
                                                value={editingUser?.username || ''}
                                                readOnly
                                                className="w-full px-4 py-2.5 rounded-xl border border-slate-200 dark:border-slate-700 bg-slate-50 dark:bg-slate-800 text-slate-500 dark:text-slate-400 cursor-not-allowed outline-none font-medium"
                                            />
                                        </div>
                                        <div>
                                            <label className="block text-sm font-semibold text-slate-700 dark:text-slate-300 mb-2">{t('userManagement.userName')}</label>
                                            <input
                                                type="text"
                                                {...updateForm.register('name')}
                                                className="w-full px-4 py-2.5 rounded-xl border border-slate-200 dark:border-slate-700 bg-white dark:bg-slate-800 text-slate-800 dark:text-white focus:border-indigo-500 focus:ring-4 focus:ring-indigo-500/10 transition-all duration-200 outline-none"
                                                placeholder={t('userManagement.userName')}
                                            />
                                            <FormError message={updateForm.formState.errors.name?.message} />
                                        </div>
                                        <div>
                                            <label className="block text-sm font-semibold text-slate-700 dark:text-slate-300 mb-2">{t('userManagement.phoneNumber')}</label>
                                            <input
                                                type="tel"
                                                {...updateForm.register('phone_number')}
                                                className="w-full px-4 py-2.5 rounded-xl border border-slate-200 dark:border-slate-700 bg-white dark:bg-slate-800 text-slate-800 dark:text-white focus:border-indigo-500 focus:ring-4 focus:ring-indigo-500/10 transition-all duration-200 outline-none"
                                                placeholder={t('userManagement.phoneNumber')}
                                            />
                                            <FormError message={updateForm.formState.errors.phone_number?.message} />
                                        </div>
                                        <div>
                                            <label className="block text-sm font-semibold text-slate-700 dark:text-slate-300 mb-2">{t('userManagement.email')}</label>
                                            <input
                                                type="email"
                                                {...updateForm.register('email')}
                                                className="w-full px-4 py-2.5 rounded-xl border border-slate-200 dark:border-slate-700 bg-white dark:bg-slate-800 text-slate-800 dark:text-white focus:border-indigo-500 focus:ring-4 focus:ring-indigo-500/10 transition-all duration-200 outline-none"
                                            />
                                            <FormError message={updateForm.formState.errors.email?.message} />
                                        </div>
                                        <div>
                                            <label className="block text-sm font-semibold text-slate-700 dark:text-slate-300 mb-2">
                                                {t('userManagement.password')}
                                                <span className="text-xs font-normal text-slate-400 ml-2">(Create new to change)</span>
                                            </label>
                                            <div className="relative">
                                                <input
                                                    type={showPassword ? 'text' : 'password'}
                                                    {...updateForm.register('password')}
                                                    className="w-full px-4 pr-12 py-2.5 rounded-xl border border-slate-200 dark:border-slate-700 bg-white dark:bg-slate-800 text-slate-800 dark:text-white focus:border-indigo-500 focus:ring-4 focus:ring-indigo-500/10 transition-all duration-200 outline-none"
                                                    placeholder="••••••••"
                                                />
                                                <button
                                                    type="button"
                                                    onClick={(e) => {
                                                        e.preventDefault();
                                                        e.stopPropagation();
                                                        setShowPassword(!showPassword);
                                                    }}
                                                    className="absolute right-3 top-1/2 -translate-y-1/2 text-slate-400 hover:text-slate-600 dark:hover:text-slate-300 z-10 p-1"
                                                >
                                                    {showPassword ? <EyeOff className="w-5 h-5" /> : <Eye className="w-5 h-5" />}
                                                </button>
                                            </div>
                                            <FormError message={updateForm.formState.errors.password?.message} />
                                        </div>
                                        <div>
                                            <label className="block text-sm font-semibold text-slate-700 dark:text-slate-300 mb-2">{t('userManagement.assignGroups')}</label>
                                            <select
                                                multiple
                                                {...updateForm.register('group_ids')}
                                                className="w-full px-4 py-2.5 rounded-xl border border-slate-200 dark:border-slate-700 bg-white dark:bg-slate-800 text-slate-800 dark:text-white focus:border-indigo-500 focus:ring-4 focus:ring-indigo-500/10 transition-all duration-200 outline-none min-h-[120px]"
                                            >
                                                {groups.map(group => (
                                                    <option key={group.id} value={group.id} className="py-1">{group.id}({group.name})</option>
                                                ))}
                                            </select>
                                            <p className="text-xs text-slate-500 dark:text-slate-400 mt-2 flex items-center gap-1">
                                                <span className="px-1.5 py-0.5 bg-slate-100 dark:bg-slate-700 rounded border border-slate-200 dark:border-slate-600 font-mono text-[10px]">Ctrl</span>
                                                or
                                                <span className="px-1.5 py-0.5 bg-slate-100 dark:bg-slate-700 rounded border border-slate-200 dark:border-slate-600 font-mono text-[10px]">Cmd</span>
                                                {t('userManagement.selectMultiple')}
                                            </p>
                                        </div>
                                    </div>

                                    <div className="p-6 border-t border-slate-100 dark:border-slate-800 flex justify-end gap-3 bg-white dark:bg-slate-900 flex-shrink-0">
                                        <button
                                            type="button"
                                            onClick={() => setShowModal(false)}
                                            className="px-5 py-2.5 text-sm font-medium text-slate-600 dark:text-slate-300 bg-white dark:bg-slate-800/50 border border-slate-200 dark:border-slate-700 rounded-xl hover:bg-slate-50 dark:hover:bg-slate-800 hover:text-slate-800 dark:hover:text-white transition-colors"
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
                                                t('common.save')
                                            )}
                                        </button>
                                    </div>
                                </form>
                            ) : (
                                <form onSubmit={createForm.handleSubmit(onCreateSubmit)} className="flex flex-col flex-1 overflow-hidden">
                                    <div className="p-6 space-y-5 overflow-y-auto flex-1 custom-scrollbar">
                                        <div>
                                            <label className="block text-sm font-semibold text-slate-700 dark:text-slate-300 mb-2">{t('userManagement.userId')}</label>
                                            <div className="flex gap-2">
                                                <div className="flex-1">
                                                    <input
                                                        type="text"
                                                        {...createForm.register('username')}
                                                        className="w-full px-4 py-2.5 rounded-xl border border-slate-200 dark:border-slate-700 bg-white dark:bg-slate-800 text-slate-800 dark:text-white focus:border-indigo-500 focus:ring-4 focus:ring-indigo-500/10 transition-all outline-none"
                                                        placeholder={t('userManagement.userId')}
                                                    />
                                                    <FormError message={createForm.formState.errors.username?.message} />
                                                </div>
                                                <button
                                                    type="button"
                                                    onClick={handleCheckDuplicate}
                                                    className="px-4 py-2.5 bg-white dark:bg-slate-800 border border-slate-200 dark:border-slate-700 text-slate-600 dark:text-slate-300 rounded-xl hover:bg-slate-50 dark:hover:bg-slate-700/50 font-medium text-sm whitespace-nowrap"
                                                >
                                                    {t('userManagement.checkDuplicate')}
                                                </button>
                                            </div>
                                        </div>
                                        <div>
                                            <label className="block text-sm font-semibold text-slate-700 dark:text-slate-300 mb-2">{t('userManagement.userName')}</label>
                                            <input
                                                type="text"
                                                {...createForm.register('name')}
                                                className="w-full px-4 py-2.5 rounded-xl border border-slate-200 dark:border-slate-700 bg-white dark:bg-slate-800 text-slate-800 dark:text-white focus:border-indigo-500 focus:ring-4 focus:ring-indigo-500/10 transition-all duration-200 outline-none"
                                                placeholder={t('userManagement.userName')}
                                            />
                                            <FormError message={createForm.formState.errors.name?.message} />
                                        </div>
                                        <div>
                                            <label className="block text-sm font-semibold text-slate-700 dark:text-slate-300 mb-2">{t('userManagement.phoneNumber')}</label>
                                            <input
                                                type="tel"
                                                {...createForm.register('phone_number')}
                                                className="w-full px-4 py-2.5 rounded-xl border border-slate-200 dark:border-slate-700 bg-white dark:bg-slate-800 text-slate-800 dark:text-white focus:border-indigo-500 focus:ring-4 focus:ring-indigo-500/10 transition-all duration-200 outline-none"
                                                placeholder={t('userManagement.phoneNumber')}
                                            />
                                            <FormError message={createForm.formState.errors.phone_number?.message} />
                                        </div>
                                        <div>
                                            <label className="block text-sm font-semibold text-slate-700 dark:text-slate-300 mb-2">{t('userManagement.email')}</label>
                                            <input
                                                type="email"
                                                {...createForm.register('email')}
                                                className="w-full px-4 py-2.5 rounded-xl border border-slate-200 dark:border-slate-700 bg-white dark:bg-slate-800 text-slate-800 dark:text-white focus:border-indigo-500 focus:ring-4 focus:ring-indigo-500/10 transition-all duration-200 outline-none"
                                            />
                                            <FormError message={createForm.formState.errors.email?.message} />
                                        </div>
                                        <div>
                                            <label className="block text-sm font-semibold text-slate-700 dark:text-slate-300 mb-2">{t('userManagement.password')}</label>
                                            <div className="relative">
                                                <input
                                                    type={showPassword ? 'text' : 'password'}
                                                    {...createForm.register('password')}
                                                    className="w-full px-4 pr-12 py-2.5 rounded-xl border border-slate-200 dark:border-slate-700 bg-white dark:bg-slate-800 text-slate-800 dark:text-white focus:border-indigo-500 focus:ring-4 focus:ring-indigo-500/10 transition-all duration-200 outline-none"
                                                />
                                                <button
                                                    type="button"
                                                    onClick={(e) => {
                                                        e.preventDefault();
                                                        e.stopPropagation();
                                                        setShowPassword(!showPassword);
                                                    }}
                                                    className="absolute right-3 top-1/2 -translate-y-1/2 text-slate-400 hover:text-slate-600 dark:hover:text-slate-300 z-10 p-1"
                                                >
                                                    {showPassword ? <EyeOff className="w-5 h-5" /> : <Eye className="w-5 h-5" />}
                                                </button>
                                            </div>
                                            <FormError message={createForm.formState.errors.password?.message} />
                                        </div>
                                        <div>
                                            <label className="block text-sm font-semibold text-slate-700 dark:text-slate-300 mb-2">{t('userManagement.assignGroups')}</label>
                                            <select
                                                multiple
                                                {...createForm.register('group_ids')}
                                                className="w-full px-4 py-2.5 rounded-xl border border-slate-200 dark:border-slate-700 bg-white dark:bg-slate-800 text-slate-800 dark:text-white focus:border-indigo-500 focus:ring-4 focus:ring-indigo-500/10 transition-all duration-200 outline-none min-h-[120px]"
                                            >
                                                {groups.map(group => (
                                                    <option key={group.id} value={group.id} className="py-1">{group.id}({group.name})</option>
                                                ))}
                                            </select>
                                            <p className="text-xs text-slate-500 dark:text-slate-400 mt-2 flex items-center gap-1">
                                                <span className="px-1.5 py-0.5 bg-slate-100 dark:bg-slate-700 rounded border border-slate-200 dark:border-slate-600 font-mono text-[10px]">Ctrl</span>
                                                or
                                                <span className="px-1.5 py-0.5 bg-slate-100 dark:bg-slate-700 rounded border border-slate-200 dark:border-slate-600 font-mono text-[10px]">Cmd</span>
                                                {t('userManagement.selectMultiple')}
                                            </p>
                                        </div>
                                    </div>

                                    <div className="p-6 border-t border-slate-100 dark:border-slate-800 flex justify-end gap-3 bg-white dark:bg-slate-900 flex-shrink-0">
                                        <button
                                            type="button"
                                            onClick={() => setShowModal(false)}
                                            className="px-5 py-2.5 text-sm font-medium text-slate-600 dark:text-slate-300 bg-white dark:bg-slate-800/50 border border-slate-200 dark:border-slate-700 rounded-xl hover:bg-slate-50 dark:hover:bg-slate-800 hover:text-slate-800 dark:hover:text-white transition-colors"
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
                                                t('userManagement.createUser')
                                            )}
                                        </button>
                                    </div>
                                </form>
                            )}
                        </div>
                    </div>
                )}

                {/* Loading Overlay */}
                {isUploading && (
                    <div className="fixed inset-0 bg-slate-900/50 backdrop-blur-sm flex flex-col items-center justify-center z-[60] animate-in fade-in duration-200">
                        <div className="bg-white dark:bg-slate-900 p-8 rounded-2xl shadow-2xl flex flex-col items-center gap-4 max-w-sm w-full mx-4 border border-slate-200 dark:border-slate-800">
                            <div className="w-12 h-12 border-4 border-indigo-100 dark:border-indigo-900 border-t-indigo-600 dark:border-t-indigo-500 rounded-full animate-spin"></div>
                            <div className="text-center">
                                <h3 className="text-lg font-bold text-slate-900 dark:text-white mb-1">{t('userManagement.processing')}</h3>
                                <p className="text-slate-500 dark:text-slate-400 text-sm">{t('userManagement.processingWait')}</p>
                            </div>
                        </div>
                    </div>
                )}

                <ConfirmModal
                    isOpen={!!deleteUserConfirm}
                    onClose={() => setDeleteUserConfirm(null)}
                    onConfirm={executeDeleteUser}
                    title={t('userManagement.deleteUserTitle') || "Delete User"}
                    message={t('userManagement.deleteUserConfirm') || "Are you sure you want to delete this user?"}
                    confirmText={t('common.delete') || "Delete"}
                    variant="danger"
                />
            </div>
        </div>
    );
};

export default UserManagement;
