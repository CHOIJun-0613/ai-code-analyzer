import axios from 'axios';
import { useAuthStore } from '../store/authStore';
import i18n from '../i18n';

const API_URL = '/api/v1';

const client = axios.create({
    baseURL: API_URL,
    headers: {
        'Content-Type': 'application/json',
    },
});

// Request interceptor: Accept-Language 헤더로 클라이언트 언어 설정 전달
client.interceptors.request.use((config) => {
    config.headers['Accept-Language'] = i18n.language || 'ko';
    return config;
});

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
