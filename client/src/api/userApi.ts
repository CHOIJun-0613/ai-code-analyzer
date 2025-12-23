import client from './client';



export interface Permission {
    value: string;
}

export interface Group {
    id: string;
    name: string;
    permissions: string[];
    projects?: string[];
}

export interface User {
    id: string;
    username: string;
    name?: string;
    email: string;
    phone_number?: string;
    is_active: boolean;
    groups: Group[];
    created_at?: string;
    updated_at?: string;
}

export const userApi = {
    // Users
    createUser: async (user: any) => {
        const response = await client.post(`/users/`, user);
        return response.data;
    },
    checkUserExists: async (username: string) => {
        const response = await client.get<{ exists: boolean }>(`/users/check/${username}`);
        return response.data.exists;
    },
    listUsers: async () => {
        const response = await client.get<User[]>(`/users/`);
        return response.data;
    },
    updateUser: async (userId: string, user: any) => {
        const response = await client.put(`/users/${userId}`, user);
        return response.data;
    },
    deleteUser: async (userId: string) => {
        const response = await client.delete(`/users/${userId}`);
        return response.data;
    },

    // Groups
    createGroup: async (group: any) => {
        const response = await client.post(`/groups/`, group);
        return response.data;
    },
    listGroups: async () => {
        const response = await client.get<Group[]>(`/groups/`);
        return response.data;
    },
    updateGroupPermissions: async (groupId: string, permissions: string[]) => {
        const response = await client.put(`/groups/${groupId}/permissions`, permissions);
        return response.data;
    },
    addUserToGroup: async (groupId: string, userId: string) => {
        const response = await client.post(`/groups/${groupId}/users/${userId}`);
        return response.data;
    },
    updateGroupProjects: async (groupId: string, projects: string[]) => {
        const response = await client.put(`/groups/${groupId}/projects`, projects);
        return response.data;
    },
    checkGroupExists: async (groupId: string) => {
        const response = await client.get<{ exists: boolean }>(`/groups/check/${groupId}`);
        return response.data.exists;
    },
    updateGroup: async (groupId: string, group: any) => {
        const response = await client.put(`/groups/${groupId}`, group);
        return response.data;
    },
    deleteGroup: async (groupId: string) => {
        const response = await client.delete(`/groups/${groupId}`);
        return response.data;
    },
};
