import client from './client';

export interface AiPrompt {
    name: string;
    content: string;
    description: string;
    updated_at: string;
    updated_by: string;
    is_system: boolean;
}

export const getAiPrompts = async (): Promise<AiPrompt[]> => {
    const response = await client.get('/ai-prompts/');
    return response.data;
};

export const getAiPrompt = async (name: string): Promise<AiPrompt> => {
    const response = await client.get(`/ai-prompts/${name}`);
    return response.data;
};

export const updateAiPrompt = async (name: string, content: string, description?: string): Promise<AiPrompt> => {
    // The backend expects content embedded in the body: { "content": "..." }
    const response = await client.put(`/ai-prompts/${name}`, { content, description });
    return response.data;
};
