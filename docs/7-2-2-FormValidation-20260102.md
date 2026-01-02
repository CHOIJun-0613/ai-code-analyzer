# 구현 계획: Form Validation 개선 (React Hook Form + Zod)

## 1. 개요

### 1.1 목표

기존의 `useState` 기반 폼 관리 방식을 `React Hook Form`과 `Zod`로 개선하여 다음을 달성:

* **상태 관리 간소화**: 복잡한 폼의 다수 `useState` 호출을 단일 `useForm` 훅으로 통합
* **폼 리셋 로직 개선**: 모달 열기/닫기, 제출 후 초기화를 `reset()` 메서드로 일관되게 처리
* **에러 메시지 표준화**: 일관된 에러 표시 방식 및 접근성 개선
* **타입 안정성 강화**: Zod 스키마로 런타임 검증 + TypeScript 타입 자동 추론
* **렌더링 성능 최적화**: 불필요한 리렌더링 감소 (특히 대규모 폼)

### 1.2 현황 분석

**조사 결과** (2026-01-02):
* **Login.tsx**: HTML5 `required` 속성만 사용, 간단한 구조 (2개 필드)
* **Analysis.tsx**: 20개 이상 필드, HTML5 검증만 사용, 복잡한 상태 관리
* **CodeAiAnalysis.tsx**: 13개 필드, 간단한 검증 (프로젝트 선택 여부만)
* **UserManagement.tsx**: 중복 확인 로직(`checkUserExists`) 포함, 조건부 필수 필드 (비밀번호)
* **GroupManagement.tsx**: 중복 확인 로직(`checkGroupExists`) 포함, 배열 필드 관리

### 1.3 관련 문서

* **참조**: `docs/ai-code-analyzer-resume-20260101.md` (섹션 7.2.1)
* **작성일**: 2026-01-02
* **최종 수정**: 2026-01-02

## 2. 사전 준비

### 2.1 패키지 설치

```bash
cd client
npm install react-hook-form zod @hookform/resolvers
```

### 2.2 공통 컴포넌트 (선택사항)

에러 표시를 위한 공통 컴포넌트를 고려할 수 있음:

```typescript
// client/src/components/FormError.tsx
interface FormErrorProps {
  message?: string;
}

export const FormError: React.FC<FormErrorProps> = ({ message }) => {
  if (!message) return null;
  return (
    <p className="text-sm text-red-600 mt-1 flex items-center gap-1">
      <AlertCircle className="w-3.5 h-3.5" />
      {message}
    </p>
  );
};
```

## 3. 변경 대상 컴포넌트 및 상세 계획

### 3.1 분석 페이지 (`client/src/pages/Analysis.tsx`) ⭐ 최우선

#### 현황
* **복잡도**: 가장 높음 (20개 이상 필드)
* **현재 방식**: 각 필드마다 `useState` 사용, HTML5 `required` 검증만
* **문제점**:
  - 많은 `useState` 호출로 코드 중복
  - 폼 리셋 로직 복잡
  - 필드 간 의존성 관리 어려움

#### Zod 스키마

```typescript
// client/src/schemas/analysisSchema.ts
import { z } from 'zod';

export const analysisSchema = z.object({
  mode: z.enum(['upload', 'path']),
  projectName: z.string().optional(),
  applicationName: z.string().max(30).optional(),

  // Upload Mode
  file: z.instanceof(File).optional(),

  // Path Mode
  sourcePath: z.string().min(1, "소스 경로를 입력해주세요.").optional(),
  dbScriptPath: z.string().optional(),

  // Options
  skipDtoSource: z.boolean().default(true),
  skipDtoMethods: z.boolean().default(true),
  scope: z.string().default('all'),
  analysisTarget: z.enum(['all', 'program', 'db']).default('all'),
  saveStrategy: z.enum(['delete', 'update']).default('delete'),

  // Advanced
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
    return !!data.sourcePath;
  }
  return true;
}, {
  message: "파일 또는 소스 경로를 입력해주세요.",
  path: ["file"], // 에러를 표시할 필드
});

export type AnalysisFormData = z.infer<typeof analysisSchema>;
```

#### 구현 내용

1. `useForm` 훅 사용하여 전체 폼 상태 관리
2. 조건부 검증: `mode`에 따라 `file` 또는 `sourcePath` 필수 처리
3. 설정 저장/로드 로직을 `reset()` 메서드로 간소화
4. 에러 메시지를 `errors` 객체에서 가져와 일관되게 표시

### 3.2 AI 분석 페이지 (`client/src/pages/CodeAiAnalysis.tsx`)

#### 현황
* **복잡도**: 높음 (13개 필드)
* **현재 방식**: `aiConfig`, `scope` 객체로 상태 관리
* **문제점**: 설정 저장/로드 시 수동으로 각 필드 매핑

#### Zod 스키마

```typescript
// client/src/schemas/aiAnalysisSchema.ts
import { z } from 'zod';

export const aiAnalysisSchema = z.object({
  // AI Config
  provider: z.enum(['google', 'groq', 'lmstudio', 'openai']).default('google'),
  model_name: z.string().min(1, "모델명을 입력해주세요."),
  api_key: z.string().optional(),
  api_endpoint: z.string().url().optional().or(z.literal('')),
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
```

#### 구현 내용

1. `aiConfig`와 `scope`를 하나의 폼으로 통합 관리
2. Provider별 조건부 필수 필드 처리 (API 키, 엔드포인트)
3. 설정 저장/로드를 `reset()` 또는 `setValue()`로 처리

### 3.3 사용자 관리 (`client/src/pages/Admin/UserManagement.tsx`)

#### 현황
* **복잡도**: 중간
* **현재 방식**: `currentUser` 객체 상태 관리
* **특징**:
  - 중복 확인 로직 (`checkUserExists`)
  - 비밀번호: 생성 시 필수, 수정 시 선택

#### Zod 스키마

```typescript
// client/src/schemas/userSchema.ts
import { z } from 'zod';

// 생성용
export const createUserSchema = z.object({
  username: z.string().min(3, "사용자 ID는 최소 3자 이상이어야 합니다."),
  name: z.string().optional(),
  email: z.string().email("올바른 이메일 형식을 입력해주세요."),
  password: z.string().min(8, "비밀번호는 최소 8자 이상이어야 합니다."),
  phone_number: z.string().optional(),
  group_ids: z.array(z.string()).default([]),
});

// 수정용 (비밀번호 선택)
export const updateUserSchema = z.object({
  name: z.string().optional(),
  email: z.string().email("올바른 이메일 형식을 입력해주세요."),
  password: z.string().min(8, "비밀번호는 최소 8자 이상이어야 합니다.").optional().or(z.literal('')),
  phone_number: z.string().optional(),
  group_ids: z.array(z.string()).default([]),
});

export type CreateUserFormData = z.infer<typeof createUserSchema>;
export type UpdateUserFormData = z.infer<typeof updateUserSchema>;
```

#### 구현 내용

1. 생성/수정 모드에 따라 다른 스키마 사용
2. 중복 확인을 비동기 검증으로 처리:
   ```typescript
   const { setError } = useForm<CreateUserFormData>({
     resolver: zodResolver(createUserSchema),
   });

   const handleCheckDuplicate = async () => {
     const exists = await userApi.checkUserExists(getValues('username'));
     if (exists) {
       setError('username', {
         type: 'manual',
         message: '이미 사용 중인 ID입니다.'
       });
     }
   };
   ```
3. 모달 열 때 `reset()`, 제출 후 `reset()`으로 초기화
4. 배열 필드(`group_ids`)를 `Controller` 또는 `register`로 관리

### 3.4 그룹 관리 (`client/src/pages/Admin/GroupManagement.tsx`)

#### 현황
* **복잡도**: 낮음
* **현재 방식**: `newGroup`, `editingGroup` 상태 관리
* **특징**: 중복 확인, 배열 필드 (permissions, projects)

#### Zod 스키마

```typescript
// client/src/schemas/groupSchema.ts
import { z } from 'zod';

export const groupSchema = z.object({
  id: z.string().min(1, "그룹 ID를 입력해주세요."),
  name: z.string().min(1, "그룹명을 입력해주세요."),
  permissions: z.array(z.string()).default([]),
  projects: z.array(z.string()).default([]),
});

export type GroupFormData = z.infer<typeof groupSchema>;
```

#### 구현 내용

1. 생성/수정 모달 각각 `useForm` 인스턴스 사용
2. 중복 확인 로직은 UserManagement와 동일한 방식
3. 체크박스 배열은 `Controller` 또는 수동 `onChange`로 관리

### 3.5 로그인 페이지 (`client/src/pages/Login.tsx`) ⚠️ 낮은 우선순위

#### 현황
* **복잡도**: 매우 낮음 (2개 필드만)
* **현재 방식**: 간단한 `useState`, HTML5 `required`
* **평가**: React Hook Form 도입 시 오히려 코드가 복잡해질 수 있음

#### 권장사항

**현재 상태 유지** 또는 **최종 단계**에서 일관성을 위해 적용 고려.

만약 적용한다면:

```typescript
// client/src/schemas/loginSchema.ts
import { z } from 'zod';

export const loginSchema = z.object({
  username: z.string().min(1, "사용자 이름을 입력해주세요."),
  password: z.string().min(1, "비밀번호를 입력해주세요."),
});

export type LoginFormData = z.infer<typeof loginSchema>;
```

## 4. 단계별 실행 계획

### Phase 1: 환경 설정 (1일)

1. ✅ 패키지 설치 (`react-hook-form`, `zod`, `@hookform/resolvers`)
2. ✅ 공통 컴포넌트 작성 (선택사항: `FormError.tsx`)
3. ✅ 스키마 파일 디렉토리 생성 (`client/src/schemas/`)

### Phase 2: 복잡한 폼 우선 적용 (3-4일)

**우선순위**: Analysis.tsx → CodeAiAnalysis.tsx

1. **Analysis.tsx 리팩토링** (2일)
   - Zod 스키마 작성 및 조건부 검증 구현
   - `useForm` 훅으로 전환
   - 설정 저장/로드 로직 개선
   - 에러 메시지 표시 UI 추가
   - 기능 테스트 (파일 업로드, 경로 입력, 옵션 검증)

2. **CodeAiAnalysis.tsx 리팩토링** (1-2일)
   - Zod 스키마 작성 및 Provider별 조건부 검증
   - 설정 저장/로드 자동화
   - 기능 테스트

### Phase 3: 관리자 페이지 적용 (2-3일)

**우선순위**: UserManagement.tsx → GroupManagement.tsx

1. **UserManagement.tsx** (1-2일)
   - 생성/수정 스키마 분리
   - 비동기 중복 확인 구현
   - 조건부 필수 필드 (비밀번호) 처리
   - 모달 폼 리셋 로직 개선
   - 배열 필드 (`group_ids`) 처리

2. **GroupManagement.tsx** (1일)
   - 스키마 작성
   - 중복 확인 구현
   - 체크박스 배열 관리

### Phase 4: (선택) Login.tsx 적용 (0.5일)

* 일관성을 위해 적용하거나, 현재 상태 유지

## 5. 구현 예시

### 5.1 Analysis.tsx 예시

```typescript
import { useForm } from 'react-hook-form';
import { zodResolver } from '@hookform/resolvers/zod';
import { analysisSchema, type AnalysisFormData } from '../schemas/analysisSchema';

const Analysis: React.FC = () => {
  const {
    register,
    handleSubmit,
    formState: { errors, isSubmitting },
    reset,
    watch,
  } = useForm<AnalysisFormData>({
    resolver: zodResolver(analysisSchema),
    defaultValues: {
      mode: 'path',
      skipDtoSource: true,
      skipDtoMethods: true,
      // ... 기타 기본값
    },
  });

  const mode = watch('mode');

  const onSubmit = async (data: AnalysisFormData) => {
    try {
      const payload = {
        // data를 API 형식으로 변환
      };
      await client.post('/analysis/analyze', payload);
      toast.success('분석이 시작되었습니다.');
    } catch (error) {
      toast.error('분석 시작에 실패했습니다.');
    }
  };

  return (
    <form onSubmit={handleSubmit(onSubmit)}>
      {/* Mode 선택 */}
      <input type="radio" {...register('mode')} value="path" />
      <input type="radio" {...register('mode')} value="upload" />

      {mode === 'path' && (
        <div>
          <input {...register('sourcePath')} />
          {errors.sourcePath && <FormError message={errors.sourcePath.message} />}
        </div>
      )}

      {mode === 'upload' && (
        <div>
          <input type="file" {...register('file')} />
          {errors.file && <FormError message={errors.file.message} />}
        </div>
      )}

      {/* 기타 필드들... */}

      <button type="submit" disabled={isSubmitting}>
        분석 시작
      </button>
    </form>
  );
};
```

### 5.2 UserManagement.tsx 예시 (비동기 중복 확인)

```typescript
const { setError, clearErrors } = useForm<CreateUserFormData>({
  resolver: zodResolver(createUserSchema),
});

const handleCheckDuplicate = async () => {
  const username = getValues('username');
  if (!username) return;

  try {
    const exists = await userApi.checkUserExists(username);
    if (exists) {
      setError('username', {
        type: 'manual',
        message: '이미 사용 중인 ID입니다.',
      });
      toast.error('이미 사용 중인 ID입니다.');
    } else {
      clearErrors('username');
      toast.success('사용 가능한 ID입니다.');
    }
  } catch (error) {
    toast.error('중복 확인 중 오류가 발생했습니다.');
  }
};
```

## 6. 검증 계획

### 6.1 빌드 테스트

```bash
cd client
npm run build
```

* TypeScript 타입 에러 발생 여부 확인
* Zod 스키마와 타입 정의 일치 확인

### 6.2 기능 테스트

각 컴포넌트별로 다음을 테스트:

1. **유효성 검사**
   - 필수 필드 누락 시 에러 메시지 표시
   - 잘못된 형식 입력 시 에러 메시지 표시 (이메일, URL 등)
   - 조건부 검증 동작 확인 (mode 전환 시, provider 변경 시 등)

2. **정상 제출**
   - 유효한 데이터 입력 시 API 요청 전송
   - 개발자 도구 Network 탭에서 페이로드 확인
   - 서버 응답 정상 처리 확인

3. **폼 리셋**
   - 모달 열 때 초기값 설정
   - 모달 닫을 때 폼 초기화
   - 제출 성공 후 폼 초기화

4. **비동기 검증** (UserManagement, GroupManagement)
   - 중복 확인 버튼 동작
   - 에러/성공 메시지 표시

5. **배열 필드**
   - 다중 선택 동작 (permissions, projects, group_ids)
   - 선택된 값이 올바르게 전송되는지 확인

### 6.3 성능 테스트

* React DevTools Profiler로 리렌더링 횟수 측정
* 필드 입력 시 불필요한 리렌더링이 발생하지 않는지 확인

## 7. 주의사항

### 7.1 기존 API 호환성

* 백엔드 API는 변경하지 않음
* 폼 데이터를 기존 API 형식에 맞게 변환하여 전송

### 7.2 점진적 마이그레이션

* 한 번에 모든 컴포넌트를 변경하지 않고, Phase별로 적용
* 각 Phase 완료 후 충분한 테스트 수행

### 7.3 사용자 경험 유지

* 기존 UI/UX를 최대한 유지
* 에러 메시지 위치 및 스타일은 기존과 유사하게

### 7.4 타입 안정성

* Zod 스키마에서 `z.infer`로 타입 자동 생성
* API 요청 시 타입 변환 주의

## 8. 예상 효과

### 8.1 코드 품질

* 평균 **30-40% 코드 줄 수 감소** (복잡한 폼 기준)
* 일관된 폼 관리 패턴 확립
* 유지보수성 향상

### 8.2 개발 생산성

* 새로운 폼 추가 시 빠른 개발
* 에러 핸들링 로직 재사용

### 8.3 사용자 경험

* 더 명확한 에러 메시지
* 접근성 개선 (aria-invalid, aria-describedby 자동 처리)
* 부드러운 폼 리셋 동작

## 9. 참고 자료

* [React Hook Form 공식 문서](https://react-hook-form.com/)
* [Zod 공식 문서](https://zod.dev/)
* [@hookform/resolvers](https://www.npmjs.com/package/@hookform/resolvers)

---

## 10. 구현 진행 상황 (2026-01-02)

### 10.1 완료된 작업 ✅

#### Phase 1: 환경 설정 (완료)

1. **패키지 설치** ✅
   ```bash
   npm install react-hook-form zod @hookform/resolvers
   ```
   - react-hook-form: 7.x
   - zod: 3.x
   - @hookform/resolvers: 3.x
   - 패키지 정상 설치 확인 (의존성 충돌 없음)

2. **공통 컴포넌트 작성** ✅
   - 파일: `client/src/components/FormError.tsx`
   - 기능: 폼 에러 메시지 표시 컴포넌트
   - 스타일: Lucide React 아이콘 + Tailwind CSS

3. **스키마 디렉토리 및 파일 생성** ✅
   - 디렉토리: `client/src/schemas/`
   - 파일 4개 생성:
     - `analysisSchema.ts`: 분석 페이지용 (20+ 필드, 조건부 검증)
     - `aiAnalysisSchema.ts`: AI 분석 페이지용 (Provider별 조건부 검증)
     - `userSchema.ts`: 사용자 관리용 (생성/수정 스키마 분리)
     - `groupSchema.ts`: 그룹 관리용

#### Phase 2: UserManagement.tsx 리팩토링 (완료)

**변경 사항**:
1. **useState 제거**
   - 기존: `currentUser` 객체 상태 관리 (7개 필드)
   - 개선: `useForm` 훅으로 통합

2. **생성/수정 폼 분리**
   - `createForm`: createUserSchema 사용
   - `updateForm`: updateUserSchema 사용
   - 조건부 렌더링으로 타입 안정성 확보

3. **Zod 스키마 검증**
   - 생성: username, email, password 필수
   - 수정: email 필수, password 선택
   - 이메일 형식 검증
   - 최소 길이 검증 (username: 3자, password: 8자)

4. **비동기 중복 확인**
   - `handleCheckDuplicate()` 함수
   - `createForm.setError()` 로 에러 설정
   - `createForm.clearErrors()` 로 에러 제거
   - Toast 알림 통합

5. **에러 메시지 표시**
   - `FormError` 컴포넌트 사용
   - 각 필드 아래 일관된 스타일로 표시
   - `formState.errors` 객체 활용

6. **폼 리셋 로직 개선**
   - 생성 모달: `createForm.reset()` 호출
   - 수정 모달: `updateForm.reset()` 호출
   - 모달 닫을 때 자동 초기화

7. **제출 상태 관리**
   - `isSubmitting` 상태로 중복 제출 방지
   - 제출 중 로딩 스피너 표시
   - disabled 속성으로 버튼 비활성화

**코드 메트릭**:
- 라인 수: 662줄 → 730줄 (68줄 증가)
  - 생성/수정 폼 분리로 JSX 코드 증가
  - 하지만 상태 관리 로직은 크게 간소화됨
- 제거된 useState: 1개 (`currentUser`)
- 추가된 useForm: 2개 (`createForm`, `updateForm`)

**타입 안정성**:
- Zod 스키마로 런타임 검증 + TypeScript 타입 자동 추론
- `z.infer<typeof schema>`로 타입 생성
- 빌드 시 타입 에러 없음 확인

#### 빌드 테스트 ✅

```bash
cd client && npm run build
```

**결과**: ✅ 성공
- TypeScript 컴파일 에러 없음
- Vite 빌드 성공 (35.31초)
- 경고: 일부 청크 크기 큼 (기존과 동일, Form Validation과 무관)

#### Phase 3: GroupManagement.tsx 리팩토링 (완료)

**변경 사항**:
1. **useState 제거**
   - 기존: `newGroup`, `editingGroup` 객체 상태 관리
   - 개선: `createForm`, `updateForm` 훅으로 분리

2. **생성/수정 폼 분리**
   - `createForm`: groupSchema 사용
   - `updateForm`: groupSchema 사용 (동일 스키마)
   - `editingGroupId`로 수정 모드 상태 관리

3. **Zod 스키마 검증**
   - id, name 필수
   - permissions, projects 선택 (배열)

4. **비동기 중복 확인**
   - `handleCheckDuplicate()` 함수
   - `createForm.setError()` / `clearErrors()` 활용

5. **배열 필드 관리**
   - `handlePermissionChange()` 헬퍼 함수로 permissions 관리
   - `watch()` + `setValue()`로 체크박스 상태 동기화
   - ProjectSelector는 onChange 콜백으로 연동

6. **폼 리셋 로직**
   - `handleOpenCreateModal()`: createForm.reset()
   - `handleOpenEditModal()`: updateForm.reset() + 데이터 바인딩

7. **제출 상태 관리**
   - `isSubmitting`으로 중복 제출 방지
   - 로딩 스피너 표시

**코드 메트릭**:
- 라인 수: 447줄 → 525줄 (78줄 증가)
  - 폼 관리 로직 개선으로 약간 증가
  - 하지만 상태 관리는 크게 간소화됨
- 제거된 useState: 2개 (`newGroup`, `editingGroup`)
- 추가된 useForm: 2개 (`createForm`, `updateForm`)

**타입 안정성**:
- groupSchema로 런타임 + 컴파일타임 검증
- 빌드 시 타입 에러 없음 확인

**빌드 테스트**: ✅ 성공 (35.31초)

### 10.2 미완료 작업 (추후 진행 필요)

#### Phase 4: 나머지 컴포넌트 리팩토링 (미완료)

다음 컴포넌트들은 아직 리팩토링하지 않았습니다:

1. **CodeAiAnalysis.tsx** 🔲
   - 우선순위: 중간
   - 예상 소요: 1-2일
   - Provider별 조건부 검증 필요
   - 스키마는 이미 작성됨 (`aiAnalysisSchema.ts`)

3. **Analysis.tsx** 🔲
   - 우선순위: 최고 (가장 복잡)
   - 예상 소요: 2일
   - 1100줄 이상, 20개 이상 필드
   - 조건부 검증 다수 (mode, scope 등)
   - 스키마는 이미 작성됨 (`analysisSchema.ts`)

#### Login.tsx (선택사항) 🔲

- 우선순위: 매우 낮음
- 2개 필드만 있어 HTML5 검증으로 충분
- 일관성을 위해 적용할 수도 있음

### 10.3 적용 패턴 및 베스트 프랙티스

UserManagement.tsx, GroupManagement.tsx 리팩토링을 통해 확립된 패턴:

1. **생성/수정 폼 분리**
   ```typescript
   const createForm = useForm<CreateFormData>({
     resolver: zodResolver(createSchema),
   });

   const updateForm = useForm<UpdateFormData>({
     resolver: zodResolver(updateSchema),
   });
   ```

2. **조건부 렌더링으로 타입 안정성 확보**
   ```typescript
   {isEditing ? (
     <form onSubmit={updateForm.handleSubmit(onUpdateSubmit)}>
       ...
     </form>
   ) : (
     <form onSubmit={createForm.handleSubmit(onCreateSubmit)}>
       ...
     </form>
   )}
   ```

3. **비동기 검증**
   ```typescript
   const handleCheckDuplicate = async () => {
     const value = createForm.getValues('fieldName');
     const exists = await api.checkExists(value);
     if (exists) {
       createForm.setError('fieldName', {
         type: 'manual',
         message: 'Error message',
       });
     } else {
       createForm.clearErrors('fieldName');
     }
   };
   ```

4. **에러 메시지 표시**
   ```typescript
   <input {...createForm.register('fieldName')} />
   <FormError message={createForm.formState.errors.fieldName?.message} />
   ```

5. **optional() vs default()**
   - 배열 필드는 `optional()`만 사용 (`default([])` 제거)
   - `default()`는 react-hook-form과 타입 충돌 발생

6. **배열 필드 관리 (GroupManagement 패턴)**
   ```typescript
   const handlePermissionChange = (form: typeof createForm, permValue: string, checked: boolean) => {
     const currentPerms = form.getValues('permissions') || [];
     if (checked) {
       form.setValue('permissions', [...currentPerms, permValue]);
     } else {
       form.setValue('permissions', currentPerms.filter(p => p !== permValue));
     }
   };

   // 체크박스
   const currentPerms = createForm.watch('permissions') || [];
   const isChecked = currentPerms.includes(perm.value);
   <input type="checkbox" checked={isChecked} onChange={(e) => handlePermissionChange(createForm, perm.value, e.target.checked)} />
   ```

7. **외부 컴포넌트 연동 (ProjectSelector 예시)**
   ```typescript
   <ProjectSelector
     projects={projects}
     selected={createForm.watch('projects') || []}
     onChange={(projects) => createForm.setValue('projects', projects)}
   />
   ```

### 10.4 주요 이슈 및 해결책

#### 이슈 1: 생성/수정 폼 타입 충돌

**문제**:
```typescript
const form = isEditing ? updateForm : createForm;
const { register, errors } = form; // Union 타입 에러
```

**해결**:
생성/수정 폼을 완전히 분리하여 조건부 렌더링

#### 이슈 2: group_ids 타입 불일치

**문제**:
```typescript
group_ids: z.array(z.string()).default([])
// → string[] (undefined 불가)
```

**해결**:
```typescript
group_ids: z.array(z.string()).optional()
// → string[] | undefined
```

### 10.5 다음 단계 권장사항

1. **CodeAiAnalysis.tsx 리팩토링** (다음 우선순위)
   - Provider별 조건부 검증 구현
   - refine() 메서드 활용

3. **Analysis.tsx 리팩토링** (최종)
   - 가장 복잡하지만 효과도 가장 큼
   - 20개 이상 필드의 상태 관리 간소화
   - 파일 업로드 처리 주의 필요

4. **전체 기능 테스트**
   - 각 컴포넌트 정상 동작 확인
   - 에러 메시지 표시 확인
   - 폼 리셋 확인

### 10.6 예상 효과 (UserManagement, GroupManagement 기준)

- **상태 관리 간소화**:
  - UserManagement: `currentUser` useState → useForm 훅으로 통합
  - GroupManagement: `newGroup`, `editingGroup` useState → useForm 훅으로 통합
- **타입 안정성**: Zod 스키마로 런타임 + 컴파일타임 검증
- **에러 처리 개선**: 일관된 에러 메시지 표시 (FormError 컴포넌트)
- **코드 가독성**: 명확한 생성/수정 로직 분리
- **유지보수성**: 스키마 수정으로 검증 로직 변경 용이
- **배열 필드 관리 개선**: watch() + setValue()로 동기화 간소화

### 10.7 교훈 (Lessons Learned)

1. **타입 안정성 우선**: Union 타입보다 조건부 렌더링이 명확함
2. **점진적 적용**: 작은 컴포넌트부터 시작하여 패턴 검증 후 확장
3. **스키마 설계**: optional()과 default()의 타입 차이 이해 필요
4. **비동기 검증**: setError/clearErrors로 수동 제어 가능
5. **빌드 테스트**: 각 단계마다 TypeScript 컴파일 확인 필요
6. **배열 필드**: watch() + setValue() 패턴이 가장 간결하고 명확함
7. **외부 컴포넌트**: onChange 콜백으로 setValue() 연동하면 쉽게 통합
8. **미사용 import**: React import 제거 시 타입 에러 해결 (JSX는 자동 변환)

---

## 10.8 진행 요약

| 컴포넌트 | 상태 | 완료일 | 비고 |
|---------|------|--------|------|
| 환경 설정 | ✅ 완료 | 2026-01-02 | react-hook-form, zod, @hookform/resolvers 설치 |
| FormError.tsx | ✅ 완료 | 2026-01-02 | 공통 에러 표시 컴포넌트 |
| 스키마 파일 4개 | ✅ 완료 | 2026-01-02 | analysisSchema, aiAnalysisSchema, userSchema, groupSchema |
| UserManagement.tsx | ✅ 완료 | 2026-01-02 | 생성/수정 폼 분리, 비동기 중복 확인 |
| GroupManagement.tsx | ✅ 완료 | 2026-01-02 | 배열 필드 관리, ProjectSelector 연동 |
| CodeAiAnalysis.tsx | 🔲 미완료 | - | Provider별 조건부 검증 필요 |
| Analysis.tsx | 🔲 미완료 | - | 가장 복잡, 20개+ 필드 |
| Login.tsx | 🔲 선택사항 | - | 2개 필드만, 낮은 우선순위 |

**진행률**: 5/8 (62.5%)

---

**문서 업데이트**: 2026-01-02
**작업자**: Claude (Sonnet 4.5)
**다음 작업**: CodeAiAnalysis.tsx 리팩토링 권장
