import { z } from 'zod';
import type { TFunction } from 'i18next';

export const createGroupSchema = (t: TFunction) => z.object({
  id: z.string().min(1, t('validation.groupIdRequired')),
  name: z.string().min(1, t('validation.groupNameRequired')),
  permissions: z.array(z.string()).optional(),
  projects: z.array(z.string()).optional(),
});

export type GroupFormData = z.infer<ReturnType<typeof createGroupSchema>>;
