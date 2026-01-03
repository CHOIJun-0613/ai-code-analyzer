import { z } from 'zod';
import type { TFunction } from 'i18next';

// 생성용
export const createUserSchemaFactory = (t: TFunction) => z.object({
  username: z.string().min(3, t('validation.usernameMinLength')),
  name: z.string().optional(),
  email: z.string().email(t('validation.emailFormat')),
  password: z.string().min(8, t('validation.passwordMinLength')),
  phone_number: z.string().optional(),
  group_ids: z.array(z.string()).optional(),
});

// 수정용 (비밀번호 선택)
export const updateUserSchemaFactory = (t: TFunction) => z.object({
  name: z.string().optional(),
  email: z.string().email(t('validation.emailFormat')),
  password: z.string().min(8, t('validation.passwordMinLength')).optional().or(z.literal('')),
  phone_number: z.string().optional(),
  group_ids: z.array(z.string()).optional(),
});

export type CreateUserFormData = z.infer<ReturnType<typeof createUserSchemaFactory>>;
export type UpdateUserFormData = z.infer<ReturnType<typeof updateUserSchemaFactory>>;
