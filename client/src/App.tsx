import { BrowserRouter as Router, Routes, Route, Navigate } from 'react-router-dom';
import { lazy, Suspense } from 'react';
import Login from './pages/Login';
import Layout from './components/Layout';
import { useAuthStore, AuthState } from './store/authStore';
import LoadingSpinner from './components/LoadingSpinner';

// Lazy loaded pages
const Dashboard = lazy(() => import('./pages/Dashboard'));
const ProjectList = lazy(() => import('./pages/ProjectList'));
const ProjectDetails = lazy(() => import('./pages/ProjectDetails'));
const ClassDetails = lazy(() => import('./pages/ClassDetails'));
const MethodDetails = lazy(() => import('./pages/MethodDetails'));
const Analysis = lazy(() => import('./pages/Analysis'));
const CodeAiAnalysis = lazy(() => import('./pages/CodeAiAnalysis'));
const Admin = lazy(() => import('./pages/Admin'));
const UserManagement = lazy(() => import('./pages/Admin/UserManagement'));
const GroupManagement = lazy(() => import('./pages/Admin/GroupManagement'));
const AiPromptManagement = lazy(() => import('./pages/Admin/AiPromptManagement'));
const AnalysisHistoryList = lazy(() => import('./pages/AnalysisHistoryList'));
const CodeAnalysisDashboard = lazy(() => import('./pages/CodeAnalysisDashboard'));
const Rules = lazy(() => import('./pages/Rules'));

const ProtectedRoute = ({ children }: { children: JSX.Element }) => {
    const isLoggedIn = useAuthStore((state: AuthState) => state.isLoggedIn);
    if (!isLoggedIn) {
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
                    <Route index element={
                        <Suspense fallback={<LoadingSpinner />}>
                            <Dashboard />
                        </Suspense>
                    } />
                    <Route path="projects" element={
                        <Suspense fallback={<LoadingSpinner />}>
                            <ProjectList />
                        </Suspense>
                    } />
                    <Route path="projects/:projectName" element={
                        <Suspense fallback={<LoadingSpinner />}>
                            <ProjectDetails />
                        </Suspense>
                    } />
                    <Route path="projects/:projectName/classes/:className" element={
                        <Suspense fallback={<LoadingSpinner />}>
                            <ClassDetails />
                        </Suspense>
                    } />
                    <Route path="projects/:projectName/classes/:className/methods/:methodName" element={
                        <Suspense fallback={<LoadingSpinner />}>
                            <MethodDetails />
                        </Suspense>
                    } />
                    <Route path="analysis-overview" element={
                        <Suspense fallback={<LoadingSpinner />}>
                            <CodeAnalysisDashboard />
                        </Suspense>
                    } />
                    <Route path="analysis" element={
                        <Suspense fallback={<LoadingSpinner />}>
                            <Analysis />
                        </Suspense>
                    } />
                    <Route path="analysis/ai" element={
                        <Suspense fallback={<LoadingSpinner />}>
                            <CodeAiAnalysis />
                        </Suspense>
                    } />
                    <Route path="analysis/history" element={
                        <Suspense fallback={<LoadingSpinner />}>
                            <AnalysisHistoryList />
                        </Suspense>
                    } />
                    <Route path="admin" element={
                        <Suspense fallback={<LoadingSpinner />}>
                            <Admin />
                        </Suspense>
                    } />
                    <Route path="admin/users" element={
                        <Suspense fallback={<LoadingSpinner />}>
                            <UserManagement />
                        </Suspense>
                    } />
                    <Route path="admin/groups" element={
                        <Suspense fallback={<LoadingSpinner />}>
                            <GroupManagement />
                        </Suspense>
                    } />
                    <Route path="admin/ai-prompts" element={
                        <Suspense fallback={<LoadingSpinner />}>
                            <AiPromptManagement />
                        </Suspense>
                    } />

                    <Route path="rules" element={
                        <Suspense fallback={<LoadingSpinner />}>
                            <Rules />
                        </Suspense>
                    } />
                </Route>
            </Routes>
        </Router >
    );
}

export default App;
