import { z } from 'zod';

// 생성용
export const createUserSchema = z.object({
  username: z.string().min(3, "사용자 ID는 최소 3자 이상이어야 합니다."),
  name: z.string().optional(),
  email: z.string().email("올바른 이메일 형식을 입력해주세요."),
  password: z.string().min(8, "비밀번호는 최소 8자 이상이어야 합니다."),
  phone_number: z.string().optional(),
  group_ids: z.array(z.string()).optional(),
});

// 수정용 (비밀번호 선택)
export const updateUserSchema = z.object({
  name: z.string().optional(),
  email: z.string().email("올바른 이메일 형식을 입력해주세요."),
  password: z.string().min(8, "비밀번호는 최소 8자 이상이어야 합니다.").optional().or(z.literal('')),
  phone_number: z.string().optional(),
  group_ids: z.array(z.string()).optional(),
});

export type CreateUserFormData = z.infer<typeof createUserSchema>;
export type UpdateUserFormData = z.infer<typeof updateUserSchema>;
