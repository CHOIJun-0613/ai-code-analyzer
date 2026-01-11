import client from './client';

export interface AnalysisRule {
    id: number;
    name: string;
    description: string;
    content: string;
    useYn: boolean;
    order: number;
    updatedAt: string;
    updatedBy: string;
    isSystem: boolean;
}

export interface RuleOrder {
    id: number;
    order: number;
}

export const analysisRuleApi = {
    getAll: async (activeOnly: boolean = false) => {
        const response = await client.get<AnalysisRule[]>('/analysis-rules/', {
            params: { active_only: activeOnly },
        });
        return response.data;
    },

    create: async (data: Partial<AnalysisRule>) => {
        const response = await client.post<AnalysisRule>('/analysis-rules/', data);
        return response.data;
    },

    update: async (id: number, data: Partial<AnalysisRule>) => {
        const response = await client.put<AnalysisRule>(`/analysis-rules/${id}`, data);
        return response.data;
    },

    delete: async (id: number) => {
        const response = await client.delete(`/analysis-rules/${id}`);
        return response.data;
    },

    reorder: async (orderMap: RuleOrder[]) => {
        const response = await client.put('/analysis-rules/reorder', orderMap);
        return response.data;
    },
};
