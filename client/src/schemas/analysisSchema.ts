import { z } from 'zod';

export const analysisSchema = z.object({
  mode: z.enum(['upload', 'path']),
  projectName: z.string().optional(),
  applicationName: z.string().max(30, "애플리케이션 이름은 최대 30자까지 입력 가능합니다.").optional(),

  // Upload Mode
  file: z.instanceof(File).optional(),

  // Path Mode
  sourcePath: z.string().optional(),
  dbScriptPath: z.string().optional(),

  // Standard Options
  skipDtoSource: z.boolean().default(true),
  skipDtoMethods: z.boolean().default(true),
  scope: z.string().default('all'),
  analysisTarget: z.enum(['all', 'program', 'db']).default('all'),
  saveStrategy: z.enum(['delete', 'update']).default('delete'),

  // Advanced Options
  javaParseWorkers: z.number().int().min(1).max(32).default(8),
  javaFileParseTimeout: z.number().positive().default(120),
  javaComplexityThreshold: z.number().int().positive().default(50000),
  sequenceDiagramIncludePackages: z.string().optional(),
  excludePatterns: z.string().optional(),
  logLevel: z.enum(['DEBUG', 'INFO', 'WARNING', 'ERROR']).default('INFO'),
}).refine((data) => {
  // mode가 upload일 때 file 필수
  if (data.mode === 'upload') {
    return !!data.file;
  }
  // mode가 path일 때 sourcePath 필수
  if (data.mode === 'path') {
    return !!data.sourcePath && data.sourcePath.length > 0;
  }
  return true;
}, {
  message: "파일 또는 소스 경로를 입력해주세요.",
  path: ["sourcePath"], // 에러를 표시할 필드
});

export type AnalysisFormData = z.infer<typeof analysisSchema>;
