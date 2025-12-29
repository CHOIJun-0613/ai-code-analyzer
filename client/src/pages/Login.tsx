import React, { useState } from 'react';
import axios from 'axios';
import { useAuthStore } from '../store/authStore';
import { useNavigate } from 'react-router-dom';
import { Lock, User, ArrowRight, Eye, EyeOff } from 'lucide-react';
import loginVisual from '../assets/login-visual.png';
import AnimatedLogo from '../components/AnimatedLogo';
import MatrixRain from '../components/MatrixRain';

const Login: React.FC = () => {
    const [username, setUsername] = useState('');
    const [password, setPassword] = useState('');
    const [showPassword, setShowPassword] = useState(false);
    const [isLoading, setIsLoading] = useState(false);
    const login = useAuthStore((state) => state.login);
    const navigate = useNavigate();

    const handleSubmit = async (e: React.FormEvent) => {
        e.preventDefault();
        setIsLoading(true);
        try {
            const formData = new FormData();
            formData.append('username', username);
            formData.append('password', password);

            const response = await axios.post('/api/v1/login/access-token', formData);
            login(response.data.access_token, username);
            navigate('/');
        } catch (error) {
            console.error('Login failed', error);
            alert('로그인에 실패했습니다. 아이디와 비밀번호를 확인해주세요.');
        } finally {
            setIsLoading(false);
        }
    };

    return (
        <div className="min-h-screen flex bg-slate-900 font-sans">
            {/* Left Side - Visual */}
            <div className="hidden lg:flex lg:w-1/2 relative overflow-hidden bg-black">
                <img
                    src={loginVisual}
                    alt="AI Code Analyzer"
                    className="absolute inset-0 w-full h-full object-cover opacity-50"
                />
                <div className="absolute inset-0 bg-black/60" />
                <MatrixRain className="absolute inset-0 w-full h-full opacity-40 mix-blend-screen" />
                <div className="absolute inset-0 bg-gradient-to-r from-slate-900/10 to-slate-900/40" />
                <div className="absolute bottom-0 left-0 p-12 w-full bg-gradient-to-t from-slate-900 via-slate-900/80 to-transparent">
                    <h1 className="text-4xl font-bold text-white mb-4 drop-shadow-lg">
                        AI Code Analyzer
                    </h1>
                    <p className="text-lg text-slate-200 whitespace-nowrap drop-shadow-md">
                        Advanced Static Analysis Platform utilizing AI and Graph Database Technology
                    </p>
                </div>
            </div>

            {/* Right Side - Form */}
            <div className="w-full lg:w-1/2 flex items-center justify-center p-4 bg-slate-900 relative">
                {/* Background decoration for mobile/right side */}
                <div className="absolute inset-0 overflow-hidden pointer-events-none">
                    <div className="absolute top-[10%] right-[10%] w-[50%] h-[50%] rounded-full bg-indigo-500/10 blur-[100px]" />
                    <div className="absolute bottom-[10%] left-[10%] w-[50%] h-[50%] rounded-full bg-blue-500/10 blur-[100px]" />
                </div>

                <div className="w-full max-w-md space-y-8 relative z-10">
                    <div className="text-center">
                        <div className="flex justify-center mb-6">
                            <AnimatedLogo className="w-24 h-24" />
                        </div>
                        <h2 className="text-3xl font-bold text-white tracking-tight">환영합니다</h2>
                    </div>

                    <form onSubmit={handleSubmit} className="mt-8 space-y-6">
                        <div className="space-y-5">
                            <div className="relative group">
                                <label className="text-sm font-medium text-slate-300 ml-1 mb-1 block">아이디</label>
                                <div className="relative">
                                    <div className="absolute inset-y-0 left-0 pl-4 flex items-center pointer-events-none">
                                        <User className="h-5 w-5 text-slate-500 group-focus-within:text-indigo-400 transition-colors" />
                                    </div>
                                    <input
                                        type="text"
                                        value={username}
                                        onChange={(e) => setUsername(e.target.value)}
                                        className="block w-full pl-11 pr-4 py-3.5 bg-slate-800/50 border border-slate-700 rounded-xl text-white placeholder-slate-500 focus:outline-none focus:ring-2 focus:ring-indigo-500/50 focus:border-indigo-500 transition-all duration-200"
                                        placeholder="아이디를 입력하세요"
                                        required
                                    />
                                </div>
                            </div>

                            <div className="relative group">
                                <label className="text-sm font-medium text-slate-300 ml-1 mb-1 block">비밀번호</label>
                                <div className="relative">
                                    <div className="absolute inset-y-0 left-0 pl-4 flex items-center pointer-events-none">
                                        <Lock className="h-5 w-5 text-slate-500 group-focus-within:text-indigo-400 transition-colors" />
                                    </div>
                                    <input
                                        type={showPassword ? "text" : "password"}
                                        value={password}
                                        onChange={(e) => setPassword(e.target.value)}
                                        className="block w-full pl-11 pr-12 py-3.5 bg-slate-800/50 border border-slate-700 rounded-xl text-white placeholder-slate-500 focus:outline-none focus:ring-2 focus:ring-indigo-500/50 focus:border-indigo-500 transition-all duration-200"
                                        placeholder="비밀번호를 입력하세요"
                                        required
                                    />
                                    <button
                                        type="button"
                                        onClick={() => setShowPassword(!showPassword)}
                                        className="absolute inset-y-0 right-0 pr-4 flex items-center text-slate-500 hover:text-indigo-400 transition-colors focus:outline-none"
                                    >
                                        {showPassword ? (
                                            <Eye className="h-5 w-5 text-indigo-500" />
                                        ) : (
                                            <EyeOff className="h-5 w-5" />
                                        )}
                                    </button>
                                </div>
                            </div>
                        </div>

                        <button
                            type="submit"
                            disabled={isLoading}
                            className="w-full flex items-center justify-center py-3.5 px-4 bg-indigo-600 hover:bg-indigo-700 text-white font-semibold rounded-xl shadow-lg shadow-indigo-500/20 transition-all duration-200 hover:-translate-y-0.5 disabled:opacity-50 disabled:cursor-not-allowed group"
                        >
                            {isLoading ? (
                                <span className="w-5 h-5 border-2 border-white/30 border-t-white rounded-full animate-spin" />
                            ) : (
                                <>
                                    로그인
                                    <ArrowRight className="ml-2 w-5 h-5 group-hover:translate-x-1 transition-transform" />
                                </>
                            )}
                        </button>

                        <div className="text-center mt-6">
                            <p className="text-sm text-slate-400">
                                계정이 없으신가요?{' '}
                                <button type="button" className="text-indigo-400 hover:text-indigo-300 font-medium transition-colors">
                                    관리자에게 문의
                                </button>
                            </p>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    );
};

export default Login;
