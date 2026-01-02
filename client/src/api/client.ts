import axios from 'axios';
import { useAuthStore } from '../store/authStore';

const API_URL = '/api/v1';

const client = axios.create({
    baseURL: API_URL,
    headers: {
        'Content-Type': 'application/json',
    },
});

// Request interceptor removed as cookies are handled by browser

client.interceptors.response.use(
    (response) => response,
    async (error) => {
        const originalRequest = error.config;

        // Prevent infinite loop
        if (error.response?.status === 401 && !originalRequest._retry) {
            originalRequest._retry = true;

            try {
                // Attempt to refresh token
                await client.post('/login/refresh');

                // Retry original request
                return client(originalRequest);
            } catch (refreshError) {
                // Refresh failed, logout
                useAuthStore.getState().logout();
                return Promise.reject(refreshError);
            }
        }
        return Promise.reject(error);
    }
);

export default client;
