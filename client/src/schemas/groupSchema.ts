import { z } from 'zod';

export const groupSchema = z.object({
  id: z.string().min(1, "그룹 ID를 입력해주세요."),
  name: z.string().min(1, "그룹명을 입력해주세요."),
  permissions: z.array(z.string()).optional(),
  projects: z.array(z.string()).optional(),
});

export type GroupFormData = z.infer<typeof groupSchema>;
