import { create } from 'zustand';
import { User } from '../api/userApi';
import client from '../api/client'; // Assuming client is needed for fetching user


export interface AuthState {
    user: User | null;
    token: string | null;
    login: (token: string, username: string) => void;
    logout: () => void;
    fetchUser: () => Promise<void>;
}

export const useAuthStore = create<AuthState>((set) => ({
    user: null,
    token: localStorage.getItem('token'),
    login: (token: string, username: string) => {
        localStorage.setItem('token', token);
        set({ token, user: { username } as User }); // temporary until fetched
        // We really should fetch the user details here or let the component do it
    },
    logout: () => {
        localStorage.removeItem('token');
        set({ token: null, user: null });
    },
    fetchUser: async () => {
        try {
            const res = await client.get<User>('/users/me');
            set({ user: res.data });
        } catch (e) {
            console.error("Failed to fetch user", e);
        }
    }
}));
