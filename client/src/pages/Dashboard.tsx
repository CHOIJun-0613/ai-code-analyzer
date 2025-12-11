import React, { useEffect, useState } from 'react';
import axios from 'axios';

interface Project {
    name: string;
    updated_at: string;
    number_of_files: number;
}

const Dashboard: React.FC = () => {
    const [projects, setProjects] = useState<Project[]>([]);

    useEffect(() => {
        const fetchProjects = async () => {
            try {
                const response = await axios.get('/api/v1/projects/');
                setProjects(response.data);
            } catch (error) {
                console.error("Failed to fetch projects", error);
            }
        };
        fetchProjects();
    }, []);

    return (
        <div>
            <h1 className="text-2xl font-bold mb-4">Dashboard</h1>
            <div className="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-4">
                {projects.map((project) => (
                    <div key={project.name} className="bg-white p-4 rounded shadow">
                        <h2 className="text-xl font-semibold">{project.name}</h2>
                        <p className="text-gray-600">Files: {project.number_of_files}</p>
                        <p className="text-gray-500 text-sm">Updated: {project.updated_at}</p>
                    </div>
                ))}
            </div>
        </div>
    );
};

export default Dashboard;
