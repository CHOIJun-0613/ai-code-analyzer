import { z } from 'zod';
import type { TFunction } from 'i18next';

export const createAiAnalysisSchema = (t: TFunction) => z.object({
  // AI Config
  provider: z.enum(['google', 'groq', 'lmstudio', 'openai']),
  model_name: z.string().min(1, t('validation.modelNameRequired')),
  max_tokens: z.number().int().min(1024).max(1000000),
  use_llm_merge: z.boolean(),
  api_key: z.string().optional(),
  api_endpoint: z.string().optional(),
  concurrent_requests: z.number().int().min(1).max(50),
  enrichment_batch_size: z.number().int().min(1).max(100),

  // Scope
  projectName: z.string().min(1, t('validation.projectRequired')),
  nodeType: z.enum(['class', 'method', 'sql', 'all']),
  className: z.string().optional(),
  limit: z.number().int().min(0),
  clean: z.boolean(),
  logLevel: z.enum(['DEBUG', 'INFO', 'WARNING', 'ERROR']),
}).refine((data) => {
  // provider가 lmstudio가 아닐 때 api_key 필수
  if (data.provider !== 'lmstudio') {
    return !!data.api_key && data.api_key.length > 0;
  }
  return true;
}, {
  message: t('validation.apiKeyRequired'),
  path: ["api_key"],
});

export type AiAnalysisFormData = z.infer<ReturnType<typeof createAiAnalysisSchema>>;
