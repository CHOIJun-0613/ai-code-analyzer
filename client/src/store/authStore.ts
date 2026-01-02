import { create } from 'zustand';
import { User } from '../api/userApi';
import client from '../api/client'; // Assuming client is needed for fetching user


export interface AuthState {
    user: User | null;
    isLoggedIn: boolean;
    login: (username: string) => void;
    logout: () => void;
    fetchUser: () => Promise<void>;
}

export const useAuthStore = create<AuthState>((set) => ({
    user: null,
    isLoggedIn: false,
    login: (username: string) => {
        set({ isLoggedIn: true, user: { username } as User }); // temporary until fetched
        // We really should fetch the user details here or let the component do it
    },
    logout: () => {
        client.post('/login/logout').catch(console.error); // Call server logout
        set({ isLoggedIn: false, user: null });
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
