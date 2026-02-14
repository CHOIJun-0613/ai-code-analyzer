import { z } from 'zod';
import type { TFunction } from 'i18next';

export const createAnalysisSchema = (t: TFunction) => z.object({
  mode: z.enum(['upload', 'path']),
  projectName: z.string().optional(),
  applicationName: z.string().max(30, t('validation.appNameMaxLength')).optional(),

  // Upload Mode
  file: z.instanceof(File).optional(),

  // Path Mode
  sourcePath: z.string().optional(),
  dbScriptPath: z.string().optional(),

  // Standard Options
  skipDtoSource: z.boolean(),
  skipDtoMethods: z.boolean(),
  scope: z.string(),
  analysisTarget: z.enum(['all', 'program', 'db']),
  saveStrategy: z.enum(['delete', 'update']),
  charset: z.string(),

  // Advanced Options
  javaParseWorkers: z.number().int().min(1).max(32),
  javaFileParseTimeout: z.number().positive(),
  javaComplexityThreshold: z.number().int().positive(),
  sequenceDiagramIncludePackages: z.string().optional(),
  excludePatterns: z.string().optional(),
  logLevel: z.enum(['DEBUG', 'INFO', 'WARNING', 'ERROR']),
  logLanguage: z.enum(['ko', 'en']).optional(),
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
  message: t('validation.fileOrPathRequired'),
  path: ["sourcePath"], // 에러를 표시할 필드
});

export type AnalysisFormData = z.infer<ReturnType<typeof createAnalysisSchema>>;
