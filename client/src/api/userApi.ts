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
    email: string;
    is_active: boolean;
    groups: Group[];
}

export const userApi = {
    // Users
    createUser: async (user: any) => {
        const response = await client.post(`/users/`, user);
        return response.data;
    },
    listUsers: async () => {
        const response = await client.get<User[]>(`/users/`);
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
};
