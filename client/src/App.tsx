
import { BrowserRouter as Router, Routes, Route, Navigate } from 'react-router-dom';
import Login from './pages/Login';
import Dashboard from './pages/Dashboard';
import Layout from './components/Layout';
import { useAuthStore, AuthState } from './store/authStore';

// Placeholder pages
import Analysis from './pages/Analysis';
import Admin from './pages/Admin';
import UserManagement from './pages/Admin/UserManagement';
import GroupManagement from './pages/Admin/GroupManagement';

const ProtectedRoute = ({ children }: { children: JSX.Element }) => {
    const token = useAuthStore((state: AuthState) => state.token);
    if (!token) {
        return <Navigate to="/login" replace />;
    }
    return children;
};

function App() {
    return (
        <Router>
            <Routes>
                <Route path="/login" element={<Login />} />
                <Route path="/" element={<ProtectedRoute><Layout /></ProtectedRoute>}>
                    <Route index element={<Dashboard />} />
                    <Route path="analysis" element={<Analysis />} />
                    <Route path="admin" element={<Admin />} />
                    <Route path="admin/users" element={<UserManagement />} />
                    <Route path="admin/groups" element={<GroupManagement />} />
                </Route>
            </Routes>
        </Router>
    );
}

export default App;
