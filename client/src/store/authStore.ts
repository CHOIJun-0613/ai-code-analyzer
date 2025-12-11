import { create } from 'zustand';
import axios from 'axios';

interface User {
    username: string;
    // Add other fields as needed
}

interface AuthState {
    user: User | null;
    token: string | null;
    login: (token: string, username: string) => void;
    logout: () => void;
}

export const useAuthStore = create<AuthState>((set) => ({
    user: null,
    token: localStorage.getItem('token'),
    login: (token, username) => {
        localStorage.setItem('token', token);
        set({ token, user: { username } });
    },
    logout: () => {
        localStorage.removeItem('token');
        set({ token: null, user: null });
    },
}));
