import { create } from 'zustand';
import { User } from '../api/userApi';
import client from '../api/client'; // Assuming client is needed for fetching user


export interface AuthState {
    user: User | null;
    isLoggedIn: boolean;
    loginTime: string | null;
    login: (username: string) => void;
    logout: () => void;
    fetchUser: () => Promise<void>;
}

export const useAuthStore = create<AuthState>((set) => ({
    user: null,
    isLoggedIn: !!localStorage.getItem('login_time'),
    loginTime: localStorage.getItem('login_time'),
    login: (username: string) => {
        const now = new Date();
        const formattedTime = now.getFullYear() + '-' +
            String(now.getMonth() + 1).padStart(2, '0') + '-' +
            String(now.getDate()).padStart(2, '0') + ' ' +
            String(now.getHours()).padStart(2, '0') + ':' +
            String(now.getMinutes()).padStart(2, '0') + ':' +
            String(now.getSeconds()).padStart(2, '0');

        localStorage.setItem('login_time', formattedTime);
        set({ isLoggedIn: true, user: { username } as User, loginTime: formattedTime });
    },
    logout: () => {
        client.post('/login/logout').catch(console.error); // Call server logout
        localStorage.removeItem('login_time');
        set({ isLoggedIn: false, user: null, loginTime: null });
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
