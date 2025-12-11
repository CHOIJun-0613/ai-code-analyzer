import React, { useState } from 'react';
import axios from 'axios';
import { useAuthStore } from '../store/authStore';
import { useNavigate } from 'react-router-dom';

const Login: React.FC = () => {
    const [username, setUsername] = useState('');
    const [password, setPassword] = useState('');
    const login = useAuthStore((state) => state.login);
    const navigate = useNavigate();

    const handleSubmit = async (e: React.FormEvent) => {
        e.preventDefault();
        try {
            const formData = new FormData();
            formData.append('username', username);
            formData.append('password', password);

            const response = await axios.post('/api/v1/login/access-token', formData);
            login(response.data.access_token, username);
            navigate('/');
        } catch (error) {
            console.error('Login failed', error);
            alert('Login failed');
        }
    };

    return (
        <div className="flex items-center justify-center h-screen bg-gray-100">
            <form onSubmit={handleSubmit} className="p-6 bg-white rounded shadow-md w-80">
                <h2 className="mb-4 text-xl font-bold">Login</h2>
                <div className="mb-4">
                    <label className="block mb-1">Username</label>
                    <input
                        type="text"
                        value={username}
                        onChange={(e) => setUsername(e.target.value)}
                        className="w-full p-2 border rounded"
                    />
                </div>
                <div className="mb-4">
                    <label className="block mb-1">Password</label>
                    <input
                        type="password"
                        value={password}
                        onChange={(e) => setPassword(e.target.value)}
                        className="w-full p-2 border rounded"
                    />
                </div>
                <button type="submit" className="w-full p-2 text-white bg-blue-500 rounded hover:bg-blue-600">
                    Login
                </button>
            </form>
        </div>
    );
};

export default Login;
