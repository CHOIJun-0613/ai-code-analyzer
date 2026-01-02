import { z } from 'zod';

export const aiAnalysisSchema = z.object({
  // AI Config
  provider: z.enum(['google', 'groq', 'lmstudio', 'openai']).default('google'),
  model_name: z.string().min(1, "모델명을 입력해주세요."),
  api_key: z.string().optional(),
  api_endpoint: z.string().optional(),
  concurrent_requests: z.number().int().min(1).max(50).default(10),
  enrichment_batch_size: z.number().int().min(1).max(100).default(50),

  // Scope
  projectName: z.string().min(1, "프로젝트를 선택해주세요."),
  nodeType: z.enum(['class', 'method', 'sql', 'all']).default('all'),
  className: z.string().optional(),
  limit: z.number().int().min(0).default(0),
  clean: z.boolean().default(false),
  logLevel: z.enum(['DEBUG', 'INFO', 'WARNING', 'ERROR']).default('INFO'),
}).refine((data) => {
  // provider가 lmstudio가 아닐 때 api_key 필수
  if (data.provider !== 'lmstudio') {
    return !!data.api_key && data.api_key.length > 0;
  }
  return true;
}, {
  message: "API 키를 입력해주세요.",
  path: ["api_key"],
});

export type AiAnalysisFormData = z.infer<typeof aiAnalysisSchema>;
