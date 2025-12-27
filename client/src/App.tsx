import { BrowserRouter as Router, Routes, Route, Navigate } from 'react-router-dom';
import Login from './pages/Login';
import Dashboard from './pages/Dashboard';
import Layout from './components/Layout';
import { useAuthStore, AuthState } from './store/authStore';

// Placeholder pages
import ProjectDetails from './pages/ProjectDetails';
import ClassDetails from './pages/ClassDetails';
import Analysis from './pages/Analysis';
import CodeAiAnalysis from './pages/CodeAiAnalysis';
import Admin from './pages/Admin';
import UserManagement from './pages/Admin/UserManagement';
import GroupManagement from './pages/Admin/GroupManagement';
import AnalysisHistoryList from './pages/AnalysisHistoryList';

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
                    <Route path="projects/:projectName" element={<ProjectDetails />} />
                    <Route path="projects/:projectName/classes/:className" element={<ClassDetails />} />
                    <Route path="analysis" element={<Analysis />} />
                    <Route path="analysis/ai" element={<CodeAiAnalysis />} />
                    <Route path="analysis/history" element={<AnalysisHistoryList />} />
                    <Route path="admin" element={<Admin />} />
                    <Route path="admin/users" element={<UserManagement />} />
                    <Route path="admin/groups" element={<GroupManagement />} />
                </Route>
            </Routes>
        </Router>
    );
}

export default App;
