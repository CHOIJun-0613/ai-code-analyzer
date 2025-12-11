import React, { useState } from 'react';
import axios from 'axios';

const Admin: React.FC = () => {
    const [username, setUsername] = useState('');
    const [password, setPassword] = useState('');
    const [email, setEmail] = useState('');

    const handleCreateUser = async (e: React.FormEvent) => {
        e.preventDefault();
        try {
            await axios.post('/api/v1/users/users/', {
                username,
                password,
                email,
                is_active: true
            });
            alert('User created successfully');
            setUsername('');
            setPassword('');
            setEmail('');
        } catch (error) {
            console.error("Failed to create user", error);
            alert("Failed to create user");
        }
    };

    return (
        <div>
            <h1 className="text-2xl font-bold mb-4">Admin Dashboard</h1>

            <div className="bg-white p-6 rounded shadow mb-6">
                <h2 className="text-xl font-bold mb-4">Create User</h2>
                <form onSubmit={handleCreateUser}>
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
                        <label className="block mb-1">Email</label>
                        <input
                            type="email"
                            value={email}
                            onChange={(e) => setEmail(e.target.value)}
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
                    <button type="submit" className="px-4 py-2 bg-green-500 text-white rounded hover:bg-green-600">
                        Create User
                    </button>
                </form>
            </div>
        </div>
    );
};

export default Admin;
