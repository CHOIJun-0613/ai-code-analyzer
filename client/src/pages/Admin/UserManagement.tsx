import React, { useEffect, useState, useRef } from 'react';
import { useTranslation } from 'react-i18next';
import { userApi, User, Group } from '../../api/userApi';
import { Plus, User as UserIcon, Mail, Search, MoreVertical, X, Eye, EyeOff, Edit, Trash2, FileSpreadsheet, ArrowUpDown, ArrowUp, ArrowDown, Download } from 'lucide-react';
import ExcelJS from 'exceljs';

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
    const [currentUser, setCurrentUser] = useState({ id: '', username: '', name: '', email: '', password: '', phone_number: '', group_ids: [] as string[] });
    const [searchTerm, setSearchTerm] = useState('');
    const [showPassword, setShowPassword] = useState(false);
    const [activeMenuId, setActiveMenuId] = useState<string | null>(null);
    const [sortConfig, setSortConfig] = useState<SortConfig>({ key: 'created_at', direction: 'desc' });
    const [isUploading, setIsUploading] = useState(false);
    const fileInputRef = useRef<HTMLInputElement>(null);

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
                const updateData = {
                    name: currentUser.name,
                    email: currentUser.email,
                    phone_number: currentUser.phone_number,
                    group_ids: currentUser.group_ids,
                    ...(currentUser.password ? { password: currentUser.password } : {})
                };
                await userApi.updateUser(currentUser.id, updateData);
            } else {
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

                const worksheet = workbook.worksheets[0]; // Get first sheet
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
                        // Parse groups
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

                alert(t('userManagement.uploadSuccess', { count: successCount }));
                if (failCount > 0) {
                    console.warn(`${failCount} users failed to import.`);
                }
                loadData();
            } catch (error) {
                console.error('Excel processing error:', error);
                alert(t('userManagement.uploadError', { error: 'Invalid file format or processing error' }));
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
        <div className="min-h-screen bg-slate-50 p-8">
            <div className="max-w-7xl mx-auto">
                <div className="flex justify-between items-start mb-8">
                    <div>
                        <div className="flex items-center gap-3 mb-1">
                            <div className="p-2 bg-indigo-600 rounded-lg shadow-lg shadow-indigo-200">
                                <UserIcon className="w-6 h-6 text-white" />
                            </div>
                            <h1 className="text-2xl font-bold text-slate-800">{t('userManagement.title')}</h1>
                            <span className="px-2.5 py-0.5 rounded-full bg-slate-100 text-slate-600 text-xs font-semibold border border-slate-200">
                                {users.length}
                            </span>
                        </div>
                        <p className="text-slate-500 text-xs">{t('userManagement.subtitle')}</p>
                    </div>
                    <div className="flex gap-3">
                        <button
                            onClick={handleDownloadTemplate}
                            className="flex items-center gap-2 px-4 py-2 bg-white text-indigo-600 rounded-xl hover:bg-slate-50 border border-slate-200 transition-all font-medium text-xs shadow-sm hover:shadow"
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
                                className={`flex items-center gap-2 px-4 py-2 bg-white text-emerald-600 rounded-xl hover:bg-slate-50 border border-slate-200 transition-all font-medium text-xs shadow-sm cursor-pointer hover:shadow ${isUploading ? 'opacity-50 cursor-not-allowed' : ''}`}
                            >
                                <FileSpreadsheet className="w-4 h-4" />
                                {isUploading ? t('userManagement.processing') : t('userManagement.excelBatchRegistration')}
                            </label>
                        </div>
                        <button
                            onClick={handleCreateUser}
                            className="flex items-center gap-2 px-4 py-2 bg-indigo-600 text-white rounded-xl hover:bg-indigo-700 shadow-lg shadow-indigo-200 transition-all hover:-translate-y-0.5 font-medium text-xs"
                        >
                            <Plus className="w-4 h-4" />
                            {t('userManagement.addUser')}
                        </button>
                    </div>
                </div>

                <div className="bg-white rounded-2xl shadow-sm border border-slate-200 overflow-visible">
                    {/* Filters */}
                    <div className="p-5 border-b border-slate-100 flex gap-4">
                        <div className="relative flex-1 max-w-md">
                            <Search className="absolute left-3 top-1/2 -translate-y-1/2 text-slate-400 w-4 h-4" />
                            <input
                                type="text"
                                placeholder={t('userManagement.searchPlaceholder')}
                                className="w-full pl-10 pr-4 py-2 rounded-xl border border-slate-200 focus:border-indigo-500 focus:ring-4 focus:ring-indigo-500/10 transition-all duration-200 outline-none text-xs text-slate-600 placeholder:text-slate-400"
                                value={searchTerm}
                                onChange={(e) => setSearchTerm(e.target.value)}
                            />
                        </div>
                    </div>

                    {/* Data Table */}
                    <div className="overflow-x-auto">
                        <table className="w-full text-left border-collapse">
                            <thead>
                                <tr className="bg-slate-50 border-b border-slate-200 text-xs uppercase text-slate-500 font-semibold tracking-wider">
                                    <th className="px-6 py-4 cursor-pointer hover:bg-slate-100 transition-colors" onClick={() => handleSort('username')}>
                                        <div className="flex items-center">
                                            {t('userManagement.table.userId')}
                                            {getSortIcon('username')}
                                        </div>
                                    </th>
                                    <th className="px-6 py-4 cursor-pointer hover:bg-slate-100 transition-colors" onClick={() => handleSort('name')}>
                                        <div className="flex items-center">
                                            {t('userManagement.table.userName')}
                                            {getSortIcon('name')}
                                        </div>
                                    </th>
                                    <th className="px-6 py-4 cursor-pointer hover:bg-slate-100 transition-colors" onClick={() => handleSort('email')}>
                                        <div className="flex items-center">
                                            {t('userManagement.table.email')}
                                            {getSortIcon('email')}
                                        </div>
                                    </th>
                                    <th className="px-6 py-4">
                                        {t('userManagement.table.groups')}
                                    </th>
                                    <th className="px-6 py-4 cursor-pointer hover:bg-slate-100 transition-colors" onClick={() => handleSort('updated_at')}>
                                        <div className="flex items-center">
                                            {t('userManagement.table.lastUpdated')}
                                            {getSortIcon('updated_at')}
                                        </div>
                                    </th>
                                    <th className="px-6 py-4 cursor-pointer hover:bg-slate-100 transition-colors" onClick={() => handleSort('created_at')}>
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
                            <tbody className="divide-y divide-slate-100">
                                {sortedUsers.length === 0 ? (
                                    <tr>
                                        <td colSpan={7} className="px-6 py-12 text-center text-slate-500">
                                            {t('common.noData')}
                                        </td>
                                    </tr>
                                ) : (
                                    sortedUsers.map((user) => (
                                        <tr key={user.id} className="hover:bg-slate-50/80 transition-colors group">
                                            <td className="px-6 py-4 text-sm font-medium text-slate-900">
                                                {user.username}
                                            </td>
                                            <td className="px-6 py-4 text-sm text-slate-600">
                                                {user.name || '-'}
                                            </td>
                                            <td className="px-6 py-4 text-sm text-slate-600">
                                                <div className="flex items-center gap-2">
                                                    <Mail className="w-3.5 h-3.5 text-slate-400" />
                                                    {user.email}
                                                </div>
                                            </td>
                                            <td className="px-6 py-4 text-sm">
                                                <div className="flex flex-wrap gap-1.5 items-center">
                                                    {user.groups.length > 0 ? (
                                                        <>
                                                            {user.groups.slice(0, 2).map(g => (
                                                                <span key={g.id} className="inline-flex items-center px-2 py-0.5 rounded text-xs font-medium bg-indigo-50 text-indigo-700 border border-indigo-100">
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
                                            <td className="px-6 py-4 text-sm text-slate-500 whitespace-nowrap">
                                                {user.updated_at ? new Date(user.updated_at).toLocaleDateString() : '-'}
                                            </td>
                                            <td className="px-6 py-4 text-sm text-slate-500 whitespace-nowrap">
                                                {user.created_at ? new Date(user.created_at).toLocaleDateString() : '-'}
                                            </td>
                                            <td className="px-6 py-4 text-right">
                                                <div className="relative inline-block text-left">
                                                    <button
                                                        onClick={(e) => {
                                                            e.stopPropagation();
                                                            setActiveMenuId(activeMenuId === user.id ? null : user.id);
                                                        }}
                                                        className="p-1.5 text-slate-400 hover:text-slate-600 transition-colors rounded hover:bg-slate-100"
                                                    >
                                                        <MoreVertical className="w-4 h-4" />
                                                    </button>

                                                    {/* Row Menu */}
                                                    {activeMenuId === user.id && (
                                                        <div className="absolute right-0 top-full mt-1 w-36 bg-white border border-slate-100 rounded-lg shadow-xl z-20 py-1 origin-top-right animate-in fade-in zoom-in duration-100">
                                                            <button
                                                                onClick={() => handleEditUser(user)}
                                                                className="w-full text-left px-4 py-2 text-sm text-slate-700 hover:bg-slate-50 flex items-center gap-2"
                                                            >
                                                                <Edit className="w-3.5 h-3.5" />
                                                                {t('common.edit')}
                                                            </button>
                                                            <button
                                                                onClick={() => handleDeleteUser(user)}
                                                                className="w-full text-left px-4 py-2 text-sm text-red-600 hover:bg-red-50 flex items-center gap-2"
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

                {/* Loading Overlay */}
                {isUploading && (
                    <div className="fixed inset-0 bg-slate-900/50 backdrop-blur-sm flex flex-col items-center justify-center z-[60] animate-in fade-in duration-200">
                        <div className="bg-white p-8 rounded-2xl shadow-2xl flex flex-col items-center gap-4 max-w-sm w-full mx-4">
                            <div className="w-12 h-12 border-4 border-indigo-100 border-t-indigo-600 rounded-full animate-spin"></div>
                            <div className="text-center">
                                <h3 className="text-lg font-bold text-slate-900 mb-1">{t('userManagement.processing')}</h3>
                                <p className="text-slate-500 text-sm">{t('userManagement.processingWait')}</p>
                            </div>
                        </div>
                    </div>
                )}
            </div>
        </div>
    );
};

export default UserManagement;
