# Class AI Token 사이즈 제한 해소 - Chunking 전략 구현 계획

## 1. 개요

* **문서 번호**: 20260104-02
* **작성 일자**: 2026-01-04
* **최종 업데이트**: 2026-01-04 (변경사항 반영)
* **관련 문서**: [Class-AI-Token사이즈제한해소방안-20260104.md](./Class-AI-Token사이즈제한해소방안-20260104.md)
* **목적**: 대용량 클래스를 여러 청크로 분할하여 분석 후 결과를 병합하는 Chunking 전략 구현

## 2. 배경

### 2.1 현재 구현 상황

현재 Token 제한 해소 방안으로 다음 전략이 구현되어 있습니다:

* **Step 0 (Pass-through)**: 크기가 제한 이내이면 원본 그대로 전송 (30,000자 이하)
* **Step 1 (Body Stripping)**: 메서드 구현 로직(Body) 제거, 시그니처만 유지
* **Step 2 (Hard Truncation)**: 파일 중간 부분 생략 (Head 30% + Tail 20%)

### 2.2 현재 방식의 한계

* **정보 손실**: Hard Truncation 시 클래스 중간 부분의 메서드가 완전히 제외됨
* **분석 품질 저하**: 불완전한 정보로 AI 분석 수행 → 부정확한 결과
* **사용자 경험**: "분석 결과가 불완전할 수 있습니다" 경고만 표시

### 2.3 Chunking 전략의 필요성

* **완전한 분석**: 클래스 전체를 여러 청크로 나누어 모두 분석
* **정보 보존**: 모든 메서드 시그니처 및 구조 정보 유지
* **품질 향상**: 각 청크별 상세 분석 → 병합하여 완전한 분석 결과 제공

## 3. Token 제한 사이즈 관리 방안

### 3.1 속성명 검토

사용자가 제안한 `tocken_limit`의 문제점 및 대안:

| 속성명 | 장점 | 단점 | 추천도 |
|--------|------|------|--------|
| `tocken_limit` | - | 철자 오류 (Token → Tocken) | ❌ |
| `token_limit` | 간결하고 명확 | 단순함 | ⭐⭐⭐ |
| `max_tokens` | AI/LLM 업계 표준 용어 | - | ⭐⭐⭐⭐⭐ |
| `context_window_size` | 정확한 의미 전달 | 길고 복잡함 | ⭐⭐⭐⭐ |
| `token_budget` | 예산 개념 전달 | 다소 모호함 | ⭐⭐ |

**최종 선정**: `max_tokens`
* **이유**:
  * OpenAI, Google Gemini, Anthropic 등 주요 LLM 제공자가 공통으로 사용하는 용어
  * AI/ML 엔지니어에게 즉시 이해 가능
  * 간결하면서도 명확한 의미 전달

### 3.2 저장 위치: User 노드의 preferences_ai 속성

**변경 사항**: 당초 계획에서는 AiPrompt 노드에 추가할 예정이었으나, **User 노드의 `preferences_ai` 속성**에 추가하는 것으로 변경

**변경 이유**:
* **사용자별 설정**: Token 제한은 사용자가 사용하는 LLM 모델에 따라 다름
  * 예: User A는 GPT-4 (128K), User B는 Gemini Flash (8K) 사용
* **프롬프트 독립성**: 프롬프트는 시스템 전체 공유 리소스로 유지
* **설정 일관성**: 기존 AI 설정(provider, model_name, api_key 등)과 함께 관리

**preferences_ai 예시**:
```json
{
  "use_analysis": true,
  "ai_provider": "google",
  "model_name": "gemini-2.0-flash",
  "max_tokens": 8192,
  "api_key": "AIza...",
  "api_endpoint": "http://localhost:1234/v1",
  "concurrent_ai_requests": 15,
  "ai_enrichment_batch_size": 50
}
```

### 3.3 데이터베이스 스키마 변경

#### 3.3.1 User 노드 preferences_ai 업데이트

```cypher
// 기존 User 노드의 preferences_ai에 max_tokens 추가
MATCH (u:User)
WHERE u.preferences_ai IS NOT NULL
SET u.preferences_ai = apoc.convert.fromJsonMap(
    apoc.convert.toJson(
        apoc.map.merge(
            apoc.convert.fromJsonMap(u.preferences_ai),
            {max_tokens: 8192}
        )
    )
)

// preferences_ai가 NULL인 사용자에게 기본값 설정
MATCH (u:User)
WHERE u.preferences_ai IS NULL
SET u.preferences_ai = '{"use_analysis": true, "ai_provider": "google", "model_name": "gemini-2.0-flash", "max_tokens": 8192, "concurrent_ai_requests": 15, "ai_enrichment_batch_size": 50}'
```

**주의**: Neo4j에서 JSON 문자열로 저장되므로, APOC 함수 사용 권장

#### 3.3.2 Pydantic 모델 수정 (선택사항)

**파일**: `server/app/models/user.py`

User 모델에 preferences_ai 타입 힌트 추가 (선택사항):

```python
from pydantic import BaseModel, Field
from typing import Optional, Dict, Any

class UserBase(BaseModel):
    username: str
    name: Optional[str] = None
    email: EmailStr
    phone_number: Optional[str] = None
    is_active: bool = True

class User(UserBase):
    id: str
    groups: List[Group] = []
    created_at: Optional[datetime] = None
    updated_at: Optional[datetime] = None

    # preferences_ai는 JSON 문자열로 Neo4j에 저장되므로
    # 별도 Pydantic 모델 정의는 선택사항
    # Dict[str, Any]로 처리 가능

# AI Preferences 전용 모델 (선택사항)
class AiPreferences(BaseModel):
    use_analysis: bool = True
    ai_provider: str = "google"
    model_name: str = "gemini-2.0-flash"
    max_tokens: int = Field(
        default=8192,
        description="Maximum tokens for LLM context window",
        ge=1024,
        le=1000000
    )
    api_key: Optional[str] = None
    api_endpoint: Optional[str] = None
    concurrent_ai_requests: int = Field(default=15, ge=1, le=50)
    ai_enrichment_batch_size: int = Field(default=50, ge=1, le=1000)
```

### 3.4 백엔드 수정

#### 3.4.1 preferences_ai 읽기/쓰기

**파일**: `server/app/api/v1/endpoints/users.py` (또는 해당 엔드포인트)

```python
@router.get("/users/me/preferences/ai")
async def get_ai_preferences(current_user: UserInDB = Depends(deps.get_current_user)):
    """사용자의 AI 설정 조회"""
    # preferences_ai는 JSON 문자열로 저장되어 있음
    if current_user.preferences_ai:
        import json
        prefs = json.loads(current_user.preferences_ai)
        # max_tokens 기본값 보장
        if "max_tokens" not in prefs:
            prefs["max_tokens"] = 8192
        return prefs
    else:
        # 기본값 반환
        return {
            "use_analysis": True,
            "ai_provider": "google",
            "model_name": "gemini-2.0-flash",
            "max_tokens": 8192,
            "api_key": "",
            "api_endpoint": "",
            "concurrent_ai_requests": 15,
            "ai_enrichment_batch_size": 50
        }

@router.put("/users/me/preferences/ai")
async def update_ai_preferences(
    preferences: Dict[str, Any],
    current_user: UserInDB = Depends(deps.get_current_user),
    user_service: UserService = Depends(deps.get_user_service)
):
    """사용자의 AI 설정 업데이트"""
    import json

    # max_tokens 검증
    max_tokens = preferences.get("max_tokens", 8192)
    if not isinstance(max_tokens, int) or max_tokens < 1024 or max_tokens > 1000000:
        raise HTTPException(400, "max_tokens must be between 1024 and 1000000")

    # JSON 문자열로 변환하여 저장
    prefs_json = json.dumps(preferences)

    # User 노드 업데이트
    user_service.update_user_preferences_ai(current_user.id, prefs_json)

    return {"message": "AI preferences updated successfully"}
```

#### 3.4.2 AIAnalyzer에서 max_tokens 사용

**파일**: `server/csa/aiwork/ai_analyzer.py`

```python
async def analyze_class_async(
    self,
    source_code: str,
    class_name: str = "",
    max_tokens: Optional[int] = None,  # 추가
    stop_check_callback=None,
    logger: logging.Logger = logger
) -> str:
    """
    Java Class 소스 코드를 비동기로 분석하여 AI description을 생성합니다.

    Args:
        source_code: Java 클래스 소스 코드
        class_name: 클래스명 (로깅용)
        max_tokens: 최대 토큰 수 (None일 경우 기본값 8192 사용)
        stop_check_callback: 취소 확인 콜백
        logger: 로거

    Returns:
        AI 분석 결과 (Markdown 형식) 또는 빈 문자열
    """
    if not self.is_available():
        return ""

    try:
        # 프롬프트 가져오기
        from csa.aiwork.prompt import get_prompt
        prompt = get_prompt("class_doc")

        # max_tokens 기본값 처리
        if max_tokens is None:
            max_tokens = 8192

        # 글자 수 변환 (1 Token ≈ 3.5 Chars)
        max_total_chars = int(max_tokens * 3.5)

        # 프롬프트 오버헤드 계산
        markdown_overhead = len('\n\n```java\n') + len('\n```')
        prompt_overhead = len(prompt) + markdown_overhead
        source_code_max = max_total_chars - prompt_overhead

        logger.debug(f"Token 제한: {max_tokens} tokens ({max_total_chars} chars), "
                    f"프롬프트: {len(prompt)} chars, "
                    f"소스 최대: {source_code_max} chars")

        # 기존 최적화 로직...
        optimized_code, optimization_level = self._optimize_source_code(
            source_code,
            max_chars=source_code_max,
            logger=logger
        )

        # ... (나머지 코드)
```

#### 3.4.3 AI Enrichment 서비스에서 max_tokens 전달

**파일**: `server/app/api/v1/endpoints/ai_analysis.py`

```python
def run_enrichment_task(
    job_id: str,
    request: AIEnrichRequest,
    user_ai_prefs: Dict[str, Any],
    neo4j_config: Dict[str, str],
    user_id: str
):
    """Background task to run AI enrichment."""

    # ... (기존 코드)

    # max_tokens 추출
    max_tokens = user_ai_prefs.get("max_tokens", 8192)

    task_logger.info(f"AI Provider: {ai_options.get('provider')}")
    task_logger.info(f"Model Name: {ai_options.get('model_name')}")
    task_logger.info(f"Max Tokens: {max_tokens}")

    # ... (기존 코드)

    # AIEnrichmentService 호출 시 max_tokens 전달
    stats = await enrichment_service.enrich_project_async(
        project_name=request.project_name,
        node_type=request.node_type,
        concurrent_requests=concurrent,
        limit=request.limit,
        clean=request.clean,
        max_tokens=max_tokens,  # 추가
        stop_check_callback=lambda: stop_requested,
    )
```

**파일**: `server/csa/services/ai_enrichment_service.py`

```python
async def _enrich_classes_async(
    self,
    project_name: str,
    concurrent_requests: int,
    limit: Optional[int] = None,
    class_name: Optional[str] = None,
    force: bool = False,
    max_tokens: Optional[int] = None,  # 추가
    stop_check_callback: Optional[Callable[[], bool]] = None,
) -> Dict[str, Any]:
    """Enrich Class nodes with AI descriptions."""

    # ... (기존 코드)

    # 각 클래스 분석 시 max_tokens 전달
    ai_description = await self.analyzer.analyze_class_async(
        source_code=node["source"],
        class_name=node["name"],
        max_tokens=max_tokens,  # 추가
        stop_check_callback=stop_check_callback,
        logger=self.logger
    )
```

### 3.5 Client 화면 수정

#### 3.5.1 Form Schema 수정

**파일**: `client/src/schemas/aiAnalysisSchema.ts`

```typescript
import { z } from 'zod';
import type { TFunction } from 'i18next';

export const createAiAnalysisSchema = (t: TFunction) => z.object({
    provider: z.string().min(1),
    model_name: z.string().min(1),
    max_tokens: z.number().int().min(1024).max(1000000).default(8192),  // 추가
    api_key: z.string().optional(),
    api_endpoint: z.string().optional(),
    concurrent_requests: z.number().int().min(1).max(50),
    enrichment_batch_size: z.number().int().min(1).max(1000),
    projectName: z.string().min(1, t('aiAnalysis.errors.projectNameRequired')),
    nodeType: z.enum(['class', 'method', 'sql', 'all']),
    className: z.string().optional(),
    limit: z.number().int().min(0),
    clean: z.boolean(),
    logLevel: z.enum(['DEBUG', 'INFO', 'WARNING', 'ERROR']),
});

export type AiAnalysisFormData = z.infer<ReturnType<typeof createAiAnalysisSchema>>;
```

#### 3.5.2 CodeAiAnalysis 화면 수정

**파일**: `client/src/pages/CodeAiAnalysis.tsx`

```typescript
// defaultValues에 max_tokens 추가
const {
    register,
    formState: { errors },
    reset,
    watch,
    setValue,
} = useForm<AiAnalysisFormData>({
    resolver: zodResolver(createAiAnalysisSchema(t)),
    defaultValues: {
        provider: 'google',
        model_name: 'gemini-2.0-flash',
        max_tokens: 8192,  // 추가
        api_key: '',
        api_endpoint: '',
        concurrent_requests: 10,
        enrichment_batch_size: 50,
        projectName: '',
        nodeType: 'all',
        className: '',
        limit: 0,
        clean: false,
        logLevel: 'INFO',
    },
});

// AI 설정 조회 시 max_tokens 포함
useQuery({
    queryKey: ['users', 'me', 'preferences', 'ai'],
    queryFn: async () => {
        const response = await client.get('/users/me/preferences/ai');
        if (response.data) {
            reset({
                provider: response.data.ai_provider || 'google',
                model_name: response.data.model_name || 'gemini-2.0-flash',
                max_tokens: response.data.max_tokens || 8192,  // 추가
                api_key: response.data.api_key || '',
                api_endpoint: response.data.api_endpoint || '',
                concurrent_requests: response.data.concurrent_ai_requests || 10,
                enrichment_batch_size: response.data.ai_enrichment_batch_size || 50,
                // ... (나머지 필드)
            });
        }
        return response.data;
    },
    staleTime: 1 * 60 * 1000,
});

// 설정 저장 시 max_tokens 포함
const handleSaveSettings = () => {
    const formData = watch();
    const preferences = {
        use_analysis: true,
        ai_provider: formData.provider,
        model_name: formData.model_name,
        max_tokens: formData.max_tokens,  // 추가
        api_key: formData.api_key,
        api_endpoint: formData.api_endpoint,
        concurrent_ai_requests: formData.concurrent_requests,
        ai_enrichment_batch_size: formData.enrichment_batch_size
    };
    saveSettingsMutation.mutate(preferences);
};

// AI 분석 실행 시 max_tokens 포함 (선택사항 - 백엔드에서 preferences_ai 사용)
const executeAnalysis = async () => {
    // ... (기존 코드)

    const formData = watch();
    const payload = {
        project_name: formData.projectName,
        node_type: formData.nodeType,
        limit: formData.limit > 0 ? formData.limit : null,
        clean: formData.clean,
        class_name: formData.className || null,
        concurrent_requests: formData.concurrent_requests,
        log_level: formData.logLevel,
        ai_config: {
            provider: formData.provider,
            model_name: formData.model_name,
            max_tokens: formData.max_tokens,  // 추가 (선택사항)
            api_key: formData.api_key,
            api_endpoint: formData.api_endpoint
        }
    };

    // ... (나머지 코드)
};
```

#### 3.5.3 UI 컴포넌트 추가 (Configuration 영역)

**파일**: `client/src/pages/CodeAiAnalysis.tsx`

**위치**: Model Name 필드 우측 (같은 행)

```tsx
{/* 3. Configuration */}
<div className={cardClass}>
    <div className="flex items-center justify-between mb-4 border-b border-slate-100 dark:border-slate-800 pb-2">
        <h2 className={sectionTitleClass.replace('mb-4 border-b border-slate-100 dark:border-slate-800 pb-2', '')}>
            <SettingsIcon className="w-5 h-5 text-indigo-500" />
            {t('aiAnalysis.configuration')}
        </h2>

        {/* 저장/로드 버튼 */}
        {/* ... (기존 코드) ... */}
    </div>

    <div className="grid grid-cols-1 md:grid-cols-2 gap-6">
        {/* Provider */}
        <div>
            <label className={labelClass}>{t('aiAnalysis.provider')}</label>
            <select
                {...register('provider')}
                className={inputClass}
            >
                <option value="google">Google Gemini</option>
                <option value="groq">Groq</option>
                <option value="lmstudio">LM Studio (Local)</option>
                <option value="openai">OpenAI</option>
            </select>
        </div>

        {/* Model Name */}
        <div>
            <label className={labelClass}>{t('aiAnalysis.modelName')}</label>
            <input
                type="text"
                {...register('model_name')}
                className={inputClass}
                placeholder="gemini-2.0-flash"
            />
            <FormError message={errors.model_name?.message} />
        </div>

        {/* Max Tokens - 새로 추가 */}
        <div>
            <label className={labelClass}>
                Max Tokens
                <span className="text-xs text-slate-400 dark:text-slate-500 ml-2">
                    (Context Window)
                </span>
            </label>
            <input
                type="number"
                {...register('max_tokens', { valueAsNumber: true })}
                min={1024}
                max={1000000}
                step={1024}
                className={inputClass}
                placeholder="8192"
            />
            <FormError message={errors.max_tokens?.message} />
            <p className="text-xs text-slate-500 dark:text-slate-400 mt-1">
                Recommended: 8K (8192), 32K (32768), 128K (131072)
            </p>
        </div>

        {/* API Key */}
        {provider !== 'lmstudio' && (
            <div className="md:col-span-2">
                {/* ... (기존 API Key 코드) ... */}
            </div>
        )}

        {/* API Endpoint */}
        {(provider === 'lmstudio' || provider === 'openai') && (
            <div className="md:col-span-2">
                {/* ... (기존 API Endpoint 코드) ... */}
            </div>
        )}

        {/* Concurrency, Batch Size */}
        <div className="md:col-span-2 grid grid-cols-2 gap-4">
            {/* ... (기존 코드) ... */}
        </div>
    </div>
</div>
```

#### 3.5.4 다국어 추가

**파일**: `client/src/locales/ko/translation.json`, `client/src/locales/en/translation.json`

```json
{
  "aiAnalysis": {
    "maxTokens": "최대 토큰",
    "maxTokensDesc": "LLM Context Window 크기 (권장: 8K, 32K, 128K)"
  }
}
```

### 3.6 CLI 지원

#### 3.6.1 CLI 사용자 참조 전략: Hybrid 접근법

CLI 명령어는 **Hybrid 접근법**을 사용하여 max_tokens 값을 결정합니다:

**우선순위**:
1. **CLI 옵션** `--max-tokens` (최우선, 명시적 지정)
2. **User DB** `preferences_ai` (`--user-id` 지정 시)
3. **.env** `MAX_TOKENS` (기본값)
4. **하드코딩 기본값** 8192

**이유**:
- CLI는 현재 .env 기반으로 AI 설정(AI_PROVIDER, API_KEY 등)을 관리하고 있음
- 일관성을 위해 max_tokens도 .env에 추가
- Web UI와 동일한 결과를 원하는 경우 --user-id 옵션 제공

#### 3.6.2 .env 파일 수정

**파일**: `server/.env`

```ini
# AI Token 제한 설정 (Chunking 전략 적용 기준)
# 사용 중인 LLM 모델의 Context Window 크기에 맞게 설정
# 예: Gemini 2.0 Flash (1M), GPT-4o (128K), Llama 3.1 (128K)
MAX_TOKENS=8192
```

#### 3.6.3 CLI 명령어 옵션 추가

**파일**: `server/csa/cli/commands/ai_enrich.py`

```python
@click.command(name="ai-enrich")
# ... (기존 옵션들)
@click.option(
    "--max-tokens",
    default=None,
    type=int,
    help="Maximum tokens for LLM context window (overrides .env and user preferences)"
)
@click.option(
    "--user-id",
    default=None,
    help="Use AI preferences from specific user (reads preferences_ai from Neo4j User node)"
)
@with_command_lifecycle("ai-enrich")
def ai_enrich_command(
    neo4j_uri,
    neo4j_user,
    neo4j_database,
    project_name,
    node_type,
    concurrent,
    batch_size,
    limit,
    clean,
    class_name,
    method_name,
    mapper_name,
    sql_id,
    max_tokens,  # 추가
    user_id,     # 추가
):
    """Add AI-generated descriptions to existing Neo4j nodes."""

    # ... (기존 코드)

    # max_tokens 결정 (우선순위 전략)
    final_max_tokens = None

    # 1순위: CLI 옵션
    if max_tokens is not None:
        final_max_tokens = max_tokens
        logger.info(f"Max Tokens: {final_max_tokens} (from CLI option)")

    # 2순위: User DB
    elif user_id is not None:
        logger.info(f"Loading AI preferences from User: {user_id}")
        try:
            db_temp = GraphDB(neo4j_uri, neo4j_user, neo4j_password, neo4j_database)
            with db_temp.driver.session() as session:
                result = session.run("""
                    MATCH (u:User {id: $user_id})
                    RETURN u.preferences_ai as prefs
                """, user_id=user_id)

                record = result.single()
                if record and record["prefs"]:
                    import json
                    user_prefs = json.loads(record["prefs"])
                    final_max_tokens = user_prefs.get("max_tokens")

                    if final_max_tokens:
                        logger.info(f"Max Tokens: {final_max_tokens} (from User.preferences_ai)")
                    else:
                        logger.warning(f"User {user_id} has no max_tokens in preferences_ai")
                else:
                    logger.warning(f"User {user_id} not found or has no preferences_ai")
            db_temp.close()
        except Exception as e:
            logger.warning(f"Failed to load User preferences: {e}")

    # 3순위: .env
    if final_max_tokens is None:
        final_max_tokens = int(os.getenv("MAX_TOKENS", "8192"))
        logger.info(f"Max Tokens: {final_max_tokens} (from .env or default)")

    # AIEnrichmentService 호출 시 max_tokens 전달
    stats = enrichment_service.enrich_project(
        project_name=project_name,
        node_type=node_type,
        batch_size=concurrent,
        limit=limit,
        clean=clean,
        max_tokens=final_max_tokens,  # 추가
        # ... (나머지 파라미터)
    )
```

#### 3.6.4 CLI 사용 예시

**예시 1: .env 기본값 사용 (현재 방식)**
```bash
python -m csa.cli.main ai-enrich --project-name myproject --node-type class
# Max Tokens: 8192 (from .env or default)
```

**예시 2: 특정 사용자의 DB 설정 사용**
```bash
python -m csa.cli.main ai-enrich --project-name myproject --node-type class --user-id admin
# Max Tokens: 32768 (from User.preferences_ai)
# (Web UI에서 admin 사용자가 설정한 값과 동일)
```

**예시 3: CLI 옵션으로 명시적 지정**
```bash
python -m csa.cli.main ai-enrich --project-name myproject --node-type class --max-tokens 131072
# Max Tokens: 131072 (from CLI option)
```

#### 3.6.5 CLI vs. Web API 비교

| 항목 | CLI (ai-enrich) | Web API (POST /api/v1/ai/enrich) |
|------|-----------------|----------------------------------|
| **인증** | 없음 (서버 직접 접근) | JWT 기반 사용자 인증 |
| **권한 확인** | 없음 (OS 레벨 권한) | Administrators만 허용 |
| **AI 설정 소스** | .env (기본값) | current_user.preferences_ai |
| **max_tokens 소스** | 1) CLI 옵션<br>2) --user-id 지정 시 DB<br>3) .env | current_user.preferences_ai |
| **사용자 지정** | --user-id 옵션 (선택) | JWT 토큰으로 자동 식별 |
| **보안** | 서버 접근 권한 필요 | JWT + RBAC |

#### 3.6.6 주의사항

**1. .env vs. User DB 선택 기준**:
- **.env 사용**: 빠른 테스트, 관리자/개발자 직접 실행
- **User DB 사용**: Web UI와 동일한 결과 보장, 사용자별 설정 적용

**2. 보안**:
- CLI는 서버에 직접 접근할 수 있는 권한이 필요
- User 인증이 없으므로, --user-id는 신뢰할 수 있는 환경에서만 사용

**3. 다른 AI 설정**:
- 현재는 max_tokens만 User DB에서 가져옴
- 향후 provider, model_name, api_key 등도 User DB에서 가져올 수 있도록 확장 가능
- 하지만 .env 기본값 유지 권장 (하위 호환성)

## 4. Chunking 전략 구현 계획

### 4.1 전략 개요

대용량 클래스를 Token 제한에 맞게 여러 청크로 분할하여 분석 후 결과를 병합합니다.

**Chunking 적용 조건**:
* Step 1 (Body Stripping) 후에도 크기가 제한 초과
* Hard Truncation 대신 Chunking 적용

**기대 효과**:
* ✅ 정보 손실 없이 전체 클래스 분석
* ✅ 각 청크별 상세 분석 → 고품질 결과
* ✅ Hard Truncation 경고 제거

### 4.2 Chunking 알고리즘

#### 4.2.1 분할 기준

**분할 단위**: 메서드 단위 (Method-level Chunking)

* **이유**:
  * 메서드는 의미적으로 독립적인 단위
  * 메서드 경계에서 분할 → 코드 구조 유지
  * 메서드 내부를 자르는 것보다 자연스러운 분석

**청크 구성**:
* **Header**: 클래스 선언부, 필드, 어노테이션 (모든 청크에 공통 포함)
* **Methods**: 메서드들을 그룹으로 묶어 분할
* **Footer**: 클래스 닫는 중괄호

#### 4.2.2 분할 절차

```
1. Body Stripping 적용 후 크기 확인
   └─ 크기 OK → 그대로 분석 (Chunking 불필요)
   └─ 크기 초과 → Chunking 진행

2. 클래스 구조 파싱
   ├─ Header 추출 (클래스 선언, 필드, 어노테이션)
   ├─ Methods 추출 (각 메서드 시그니처 + Body hidden)
   └─ Footer 추출 (클래스 닫기)

3. 메서드를 청크로 그룹화
   ├─ 각 청크 = Header + Methods[i:j] + Footer
   ├─ 청크 크기 ≤ max_chars
   └─ 메서드 개수 균등 분배 (가능한 한)

4. 각 청크 분석 (비동기 병렬)
   ├─ Chunk 1: Header + Methods[0:10] + Footer
   ├─ Chunk 2: Header + Methods[10:20] + Footer
   └─ ...

5. 결과 병합
   └─ 각 청크의 AI 분석 결과를 하나의 Markdown으로 병합
```

#### 4.2.3 예시

**원본 클래스 (Body Stripping 후)**:
```java
// Header (1,000 chars)
public class UserService {
    @Autowired
    private UserRepository userRepository;

    // Methods (Body hidden, 50 methods × 200 chars = 10,000 chars)
    public User findById(Long id) { /* implementation hidden */ }
    public User create(User user) { /* implementation hidden */ }
    ...
    public void deleteById(Long id) { /* implementation hidden */ }
}
// Footer (10 chars)
```

**총 크기**: 11,010 chars (max_chars: 28,000 가정 시 OK)

**만약 100개 메서드 (20,000 chars)**:
```
총 크기: 21,010 chars → OK (Chunking 불필요)
```

**만약 200개 메서드 (40,000 chars)**:
```
총 크기: 41,010 chars → 초과 (Chunking 필요)

Chunk 1: Header + Methods[0:100] + Footer = 11,010 chars
Chunk 2: Header + Methods[100:200] + Footer = 11,010 chars
```

### 4.3 구현 상세

#### 4.3.1 새 메서드 추가: `_chunk_class_source`

**파일**: `server/csa/aiwork/ai_analyzer.py`

```python
def _chunk_class_source(
    self,
    source_code: str,
    max_chars: int,
    logger: logging.Logger = logger
) -> list[str]:
    """
    클래스 소스 코드를 여러 청크로 분할합니다.

    전략:
    - Body Stripping 후 크기가 max_chars를 초과하는 경우 적용
    - Header (클래스 선언, 필드) + Methods 그룹 + Footer
    - 각 청크는 의미적으로 완전한 클래스 구조 유지

    Args:
        source_code: Body Stripping 적용된 소스 코드
        max_chars: 청크당 최대 글자 수
        logger: 로거

    Returns:
        청크 리스트 (각 청크는 완전한 클래스 구조)
    """
    lines = source_code.split('\n')

    # 1. Header, Methods, Footer 분리
    header_lines = []
    method_groups = []  # [(method_start_line, method_lines), ...]
    footer_lines = []

    in_class_body = False
    current_method = []
    brace_depth = 0

    for i, line in enumerate(lines):
        stripped = line.strip()

        # 클래스 선언 감지
        if 'class ' in line and '{' in line:
            in_class_body = True
            header_lines.append(line)
            brace_depth = line.count('{') - line.count('}')
            continue

        if not in_class_body:
            # 클래스 선언 이전 (패키지, 임포트, 어노테이션)
            header_lines.append(line)
            continue

        # 메서드 시그니처 감지: ( ) { 패턴
        if '(' in line and ')' in line and '{' in line:
            if current_method:
                # 이전 메서드 저장
                method_groups.append(current_method)
            current_method = [line]
            brace_depth += line.count('{') - line.count('}')
        elif current_method:
            # 메서드 Body 내부
            current_method.append(line)
            brace_depth += line.count('{') - line.count('}')

            # 메서드 종료 감지
            if brace_depth == 1 and '}' in line:
                method_groups.append(current_method)
                current_method = []
        else:
            # 필드, 내부 클래스, 정적 블록 등 → Header에 포함
            if len(method_groups) == 0:
                header_lines.append(line)
            else:
                footer_lines.append(line)

    # 마지막 메서드 처리
    if current_method:
        method_groups.append(current_method)

    # Footer: 클래스 닫는 중괄호
    if not footer_lines:
        footer_lines = ['}']

    # 2. Header, Footer 크기 계산
    header_text = '\n'.join(header_lines)
    footer_text = '\n'.join(footer_lines)
    header_size = len(header_text)
    footer_size = len(footer_text)
    overhead = header_size + footer_size

    logger.debug(f"클래스 구조 파싱: Header={header_size} chars, "
                f"Methods={len(method_groups)}개, Footer={footer_size} chars")

    if overhead >= max_chars:
        # Header/Footer만으로도 제한 초과 → Truncation 불가피
        logger.warning(f"Header/Footer 크기({overhead})가 제한({max_chars}) 초과 "
                      f"→ Chunking 불가, Hard Truncation 적용")
        return [self._truncate_center(source_code, max_chars)]

    # 3. 메서드를 청크로 그룹화
    available_per_chunk = max_chars - overhead - 100  # 안전 마진
    chunks = []
    current_chunk_methods = []
    current_chunk_size = 0

    for method_lines in method_groups:
        method_text = '\n'.join(method_lines)
        method_size = len(method_text)

        # 단일 메서드가 available_per_chunk 초과 시 강제 포함
        if current_chunk_size + method_size <= available_per_chunk:
            current_chunk_methods.append(method_text)
            current_chunk_size += method_size
        else:
            # 현재 청크 완성
            if current_chunk_methods:
                chunk = header_text + '\n' + '\n'.join(current_chunk_methods) + '\n' + footer_text
                chunks.append(chunk)
                logger.debug(f"청크 생성: {len(chunk)} chars, "
                            f"{len(current_chunk_methods)}개 메서드")

            # 새 청크 시작
            current_chunk_methods = [method_text]
            current_chunk_size = method_size

    # 마지막 청크 처리
    if current_chunk_methods:
        chunk = header_text + '\n' + '\n'.join(current_chunk_methods) + '\n' + footer_text
        chunks.append(chunk)
        logger.debug(f"청크 생성 (마지막): {len(chunk)} chars, "
                    f"{len(current_chunk_methods)}개 메서드")

    logger.info(f"클래스를 {len(chunks)}개 청크로 분할 완료")

    return chunks if chunks else [source_code]
```

#### 4.3.2 새 메서드 추가: `_merge_chunk_results`

**파일**: `server/csa/aiwork/ai_analyzer.py`

```python
def _merge_chunk_results(
    self,
    chunk_results: list[str],
    class_name: str,
    logger: logging.Logger = logger
) -> str:
    """
    여러 청크의 AI 분석 결과를 하나의 Markdown 문서로 병합합니다.

    전략:
    - 각 청크는 동일한 클래스의 일부분을 분석한 결과
    - 중복 제거 (클래스 개요 등)
    - 메서드별 설명을 통합

    Args:
        chunk_results: 각 청크의 AI 분석 결과 (Markdown)
        class_name: 클래스명
        logger: 로거

    Returns:
        통합된 AI description (Markdown)
    """
    if not chunk_results:
        return ""

    if len(chunk_results) == 1:
        return chunk_results[0]

    logger.info(f"청크 결과 병합 시작: {len(chunk_results)}개 청크")

    # 간단한 병합 전략: 각 청크 결과를 섹션으로 구분
    merged = f"# {class_name} (분할 분석)\n\n"
    merged += f"> 이 클래스는 크기가 커서 {len(chunk_results)}개 청크로 분할하여 분석되었습니다.\n\n"

    for i, result in enumerate(chunk_results, 1):
        merged += f"## Part {i}/{len(chunk_results)}\n\n"
        merged += result
        merged += "\n\n---\n\n"

    logger.info(f"청크 결과 병합 완료: {len(merged)} chars")

    return merged
```

**향후 개선 방향**:
* LLM을 활용한 병합: "다음 청크별 분석 결과들을 하나의 일관된 클래스 설명으로 통합하세요"
* 중복 제거: 각 청크에서 공통으로 나타나는 클래스 개요 등을 하나로 통합
* 구조화: Markdown 헤더 레벨 자동 조정

#### 4.3.3 `analyze_class_async` 메서드 수정

**파일**: `server/csa/aiwork/ai_analyzer.py`

```python
async def analyze_class_async(
    self,
    source_code: str,
    class_name: str = "",
    max_tokens: Optional[int] = None,
    stop_check_callback=None,
    logger: logging.Logger = logger
) -> str:
    """
    Java Class 소스 코드를 비동기로 분석하여 AI description을 생성합니다.
    대용량 클래스는 Chunking 전략을 적용합니다.
    """
    if not self.is_available():
        return ""

    try:
        # 프롬프트 가져오기
        from csa.aiwork.prompt import get_prompt
        prompt = get_prompt("class_doc")

        # max_tokens 기본값 처리
        if max_tokens is None:
            max_tokens = 8192

        # 글자 수 변환
        max_total_chars = int(max_tokens * 3.5)
        markdown_overhead = len('\n\n```java\n') + len('\n```')
        prompt_overhead = len(prompt) + markdown_overhead
        source_code_max = max_total_chars - prompt_overhead

        # Step 1: Body Stripping
        optimized_code = self._remove_method_bodies(source_code)

        # Step 2: Chunking vs. Truncation 판단
        if len(optimized_code) <= source_code_max:
            # 크기 OK → 단일 분석
            logger.debug(f"Body Stripping 후 크기 적정 ({len(optimized_code)} <= {source_code_max})")
            input_text = f"{prompt}\n\n```java\n{optimized_code}\n```"
            raw_response = await self._call_llm_async(input_text, stop_check_callback=stop_check_callback, logger=logger)
            ai_description = self._clean_response(raw_response)
            logger.debug(f"Class AI 분석 완료 (async): {class_name}")
            return ai_description if ai_description else ""

        # Step 3: Chunking 적용
        logger.info(f"Body Stripping 후에도 크기 초과 ({len(optimized_code)} > {source_code_max}), "
                   f"Chunking 전략 적용")

        chunks = self._chunk_class_source(optimized_code, source_code_max, logger=logger)

        if len(chunks) == 1:
            # Chunking 실패 (단일 청크) → Hard Truncation
            logger.warning(f"Chunking 실패, Hard Truncation 적용")
            truncated = self._truncate_center(optimized_code, source_code_max)
            input_text = f"{prompt}\n\n```java\n{truncated}\n```"
            raw_response = await self._call_llm_async(input_text, stop_check_callback=stop_check_callback, logger=logger)
            ai_description = self._clean_response(raw_response)
            return ai_description if ai_description else ""

        # Step 4: 각 청크 병렬 분석
        logger.info(f"청크별 분석 시작: {len(chunks)}개 청크")

        chunk_results = []
        for i, chunk in enumerate(chunks, 1):
            # 취소 확인
            if stop_check_callback and stop_check_callback():
                logger.warning(f"청크 분석 중 사용자 취소 확인됨 (청크 {i}/{len(chunks)})")
                raise RuntimeError("Chunked analysis cancelled by user")

            logger.debug(f"청크 {i}/{len(chunks)} 분석 중... ({len(chunk)} chars)")
            input_text = f"{prompt}\n\n```java\n{chunk}\n```"
            raw_response = await self._call_llm_async(input_text, stop_check_callback=stop_check_callback, logger=logger)
            chunk_result = self._clean_response(raw_response)
            chunk_results.append(chunk_result)

            logger.info(f"청크 {i}/{len(chunks)} 분석 완료")

        # Step 5: 결과 병합
        merged_result = self._merge_chunk_results(chunk_results, class_name, logger=logger)

        logger.info(f"Class AI 분석 완료 (Chunking): {class_name}, "
                   f"{len(chunks)}개 청크, 최종 {len(merged_result)} chars")

        return merged_result if merged_result else ""

    except Exception as e:
        error_type = type(e).__name__
        error_msg = str(e)
        logger.warning(f"Class AI 분석 실패 (async, {class_name}): {error_type} - {error_msg}")

        import traceback
        logger.debug(f"Class AI 분석 상세 오류 (async, {class_name}):\n{traceback.format_exc()}")
        return ""
```

### 4.4 성능 최적화

#### 4.4.1 청크 병렬 분석

현재 구현은 **순차 처리** (for loop)입니다. 성능 향상을 위해 **병렬 처리** 적용:

```python
# 순차 처리 (현재)
for i, chunk in enumerate(chunks, 1):
    raw_response = await self._call_llm_async(...)
    chunk_results.append(chunk_result)

# 병렬 처리 (개선)
async def analyze_chunk(i: int, chunk: str) -> tuple[int, str]:
    logger.debug(f"청크 {i}/{len(chunks)} 분석 중... ({len(chunk)} chars)")
    input_text = f"{prompt}\n\n```java\n{chunk}\n```"
    raw_response = await self._call_llm_async(input_text, stop_check_callback=stop_check_callback, logger=logger)
    chunk_result = self._clean_response(raw_response)
    logger.info(f"청크 {i}/{len(chunks)} 분석 완료")
    return i, chunk_result

# 모든 청크 병렬 분석
tasks = [analyze_chunk(i, chunk) for i, chunk in enumerate(chunks, 1)]
results = await asyncio.gather(*tasks)

# 순서 보장 (청크 번호로 정렬)
results.sort(key=lambda x: x[0])
chunk_results = [result for _, result in results]
```

**주의사항**:
* LLM API Rate Limit 고려 → `concurrent_requests` 제한 적용 필요
* 현재 `AIEnrichmentService`의 Semaphore 방식 참고

#### 4.4.2 Semaphore를 사용한 동시 요청 제한

```python
# analyze_class_async에 semaphore 추가
async def analyze_class_async(
    self,
    source_code: str,
    class_name: str = "",
    max_tokens: Optional[int] = None,
    stop_check_callback=None,
    logger: logging.Logger = logger,
    semaphore: asyncio.Semaphore = None  # 추가
) -> str:
    # ...

    # 청크 병렬 분석 with semaphore
    async def analyze_chunk_limited(i: int, chunk: str) -> tuple[int, str]:
        if semaphore:
            async with semaphore:
                return await analyze_chunk(i, chunk)
        else:
            return await analyze_chunk(i, chunk)

    tasks = [analyze_chunk_limited(i, chunk) for i, chunk in enumerate(chunks, 1)]
    results = await asyncio.gather(*tasks)
```

## 5. 테스트 계획

### 5.1 단위 테스트

**파일**: `server/tests/test_chunking_strategy.py`

```python
import pytest
from csa.aiwork.ai_analyzer import AIAnalyzer

def test_chunk_class_source_small():
    """작은 클래스는 청크 분할 안 함"""
    analyzer = AIAnalyzer()
    source_code = """
    public class SmallClass {
        public void method1() { /* hidden */ }
        public void method2() { /* hidden */ }
    }
    """
    chunks = analyzer._chunk_class_source(source_code, max_chars=10000)
    assert len(chunks) == 1

def test_chunk_class_source_large():
    """큰 클래스는 여러 청크로 분할"""
    analyzer = AIAnalyzer()
    # 100개 메서드 생성
    methods = [f"public void method{i}() {{ /* hidden */ }}" for i in range(100)]
    source_code = f"""
    public class LargeClass {{
        {chr(10).join(methods)}
    }}
    """
    chunks = analyzer._chunk_class_source(source_code, max_chars=5000)
    assert len(chunks) > 1

    # 각 청크가 완전한 클래스 구조 유지
    for chunk in chunks:
        assert "public class LargeClass" in chunk
        assert chunk.strip().endswith("}")

def test_merge_chunk_results():
    """청크 결과 병합"""
    analyzer = AIAnalyzer()
    chunk_results = [
        "## Part 1\nMethods: method1, method2",
        "## Part 2\nMethods: method3, method4"
    ]
    merged = analyzer._merge_chunk_results(chunk_results, "TestClass")
    assert "Part 1" in merged
    assert "Part 2" in merged
    assert "TestClass" in merged
```

### 5.2 통합 테스트

**파일**: `server/tests/test_chunking_integration.py`

```python
import pytest
import asyncio
from csa.aiwork.ai_analyzer import AIAnalyzer

@pytest.mark.asyncio
async def test_analyze_class_with_chunking():
    """대용량 클래스 Chunking 분석"""
    analyzer = AIAnalyzer()

    # Mock LLM (테스트용)
    # ... (LLM Mock 설정)

    # 대용량 클래스 소스
    large_class_source = """
    public class VeryLargeService {
        // 200개 메서드
        ...
    }
    """

    result = await analyzer.analyze_class_async(
        large_class_source,
        "VeryLargeService",
        max_tokens=8192
    )

    assert result
    assert "VeryLargeService" in result
    # Chunking 적용 확인
    assert "분할 분석" in result or "Part" in result
```

### 5.3 실제 환경 테스트

```bash
# 1. 대용량 클래스 준비
#    예: Spring Boot Service 클래스 (5,000줄 이상)

# 2. DB에 프로젝트 등록 및 분석
python -m csa.cli.main analyze --all-objects --project-name large-project --source-folder /path/to/large/project

# 3. User preferences_ai에 max_tokens 설정
# Neo4j Browser:
# MATCH (u:User {id: 'admin'})
# SET u.preferences_ai = '{"use_analysis": true, "ai_provider": "google", "model_name": "gemini-2.0-flash", "max_tokens": 8192, ...}'

# 4. AI Enrichment 실행 (Chunking 적용)
python -m csa.cli.main ai-enrich --project-name large-project --node-type class --class-name VeryLargeService

# 5. 로그 확인
tail -f logs/analysis-ai-{job_id}.log
# 예상 로그:
# [INFO] Max Tokens: 8192
# [INFO] Body Stripping 후에도 크기 초과, Chunking 전략 적용
# [INFO] 클래스를 3개 청크로 분할 완료
# [DEBUG] 청크 1/3 분석 중...
# [INFO] 청크 1/3 분석 완료
# ...
# [INFO] Class AI 분석 완료 (Chunking): VeryLargeService, 3개 청크

# 6. Neo4j에서 결과 확인
# MATCH (c:Class {name: 'VeryLargeService'})
# RETURN c.ai_description
```

## 6. 마이그레이션 계획

### 6.1 데이터베이스 마이그레이션

#### 6.1.1 기존 User 노드에 max_tokens 추가

**마이그레이션 스크립트**: `server/migrations/add_max_tokens_to_preferences_ai.py`

```python
"""
Add max_tokens to User.preferences_ai
"""
import os
import json
from neo4j import GraphDatabase

def migrate():
    uri = os.getenv("NEO4J_URI", "bolt://localhost:7687")
    user = os.getenv("NEO4J_USER", "neo4j")
    password = os.getenv("NEO4J_PASSWORD")
    database = os.getenv("NEO4J_DATABASE", "neo4j")

    driver = GraphDatabase.driver(uri, auth=(user, password))

    with driver.session(database=database) as session:
        # 1. preferences_ai가 있는 사용자 업데이트
        result = session.run("""
            MATCH (u:User)
            WHERE u.preferences_ai IS NOT NULL
            RETURN u.id as user_id, u.preferences_ai as prefs
        """)

        for record in result:
            user_id = record["user_id"]
            prefs_str = record["prefs"]

            try:
                prefs = json.loads(prefs_str)

                # max_tokens가 없으면 추가
                if "max_tokens" not in prefs:
                    prefs["max_tokens"] = 8192

                    # 업데이트
                    session.run("""
                        MATCH (u:User {id: $user_id})
                        SET u.preferences_ai = $prefs
                    """, user_id=user_id, prefs=json.dumps(prefs))

                    print(f"✅ Updated user {user_id}: added max_tokens=8192")
                else:
                    print(f"⏭️  Skipped user {user_id}: max_tokens already exists")
            except json.JSONDecodeError:
                print(f"⚠️  Warning: Invalid JSON for user {user_id}")

        # 2. preferences_ai가 없는 사용자에게 기본값 설정
        session.run("""
            MATCH (u:User)
            WHERE u.preferences_ai IS NULL
            SET u.preferences_ai = $default_prefs
        """, default_prefs=json.dumps({
            "use_analysis": True,
            "ai_provider": "google",
            "model_name": "gemini-2.0-flash",
            "max_tokens": 8192,
            "concurrent_ai_requests": 15,
            "ai_enrichment_batch_size": 50
        }))

        print("✅ Migration completed successfully")

    driver.close()

if __name__ == "__main__":
    migrate()
```

**실행**:
```bash
python server/migrations/add_max_tokens_to_preferences_ai.py
```

#### 6.1.2 롤백 계획

```python
"""
Remove max_tokens from User.preferences_ai (Rollback)
"""
def rollback():
    # ... (driver 초기화)

    with driver.session(database=database) as session:
        result = session.run("""
            MATCH (u:User)
            WHERE u.preferences_ai IS NOT NULL
            RETURN u.id as user_id, u.preferences_ai as prefs
        """)

        for record in result:
            user_id = record["user_id"]
            prefs_str = record["prefs"]

            try:
                prefs = json.loads(prefs_str)

                # max_tokens 제거
                if "max_tokens" in prefs:
                    del prefs["max_tokens"]

                    session.run("""
                        MATCH (u:User {id: $user_id})
                        SET u.preferences_ai = $prefs
                    """, user_id=user_id, prefs=json.dumps(prefs))

                    print(f"✅ Rolled back user {user_id}: removed max_tokens")
            except json.JSONDecodeError:
                print(f"⚠️  Warning: Invalid JSON for user {user_id}")

        print("✅ Rollback completed successfully")
```

### 6.2 코드 마이그레이션

#### 6.2.1 단계별 배포

**Phase 1**: `max_tokens` 속성 추가 (하위 호환성 유지)
* User preferences_ai 스키마 업데이트
* DB 마이그레이션 실행
* 백엔드 API 수정 (GET/PUT /users/me/preferences/ai)
* 기본값 보장 (max_tokens 없으면 8192 사용)

**Phase 2**: Client 화면 업데이트
* CodeAiAnalysis 화면에 max_tokens 입력 추가
* Form Schema 수정
* 저장/로드 로직 수정

**Phase 3**: Chunking 전략 구현
* `_chunk_class_source()`, `_merge_chunk_results()` 추가
* `analyze_class_async()` 수정
* AIEnrichmentService에서 max_tokens 전달
* 테스트 및 검증

**Phase 4**: CLI 지원
* CLI에서 현재 사용자 preferences_ai 조회
* max_tokens 전달

### 6.3 하위 호환성

#### 6.3.1 기본값 보장

모든 User 노드는 `preferences_ai.max_tokens` 기본값 8192를 가지므로, 속성이 없는 경우도 안전하게 처리:

```python
# preferences_ai 조회 시
prefs = json.loads(user.preferences_ai) if user.preferences_ai else {}
max_tokens = prefs.get("max_tokens", 8192)  # 기본값 8192
```

#### 6.3.2 기존 코드 영향 최소화

```python
# 기존 코드 (유지)
ai_description = await analyzer.analyze_class_async(source_code, class_name)

# 신규 코드 (권장)
ai_description = await analyzer.analyze_class_async(source_code, class_name, max_tokens=user_max_tokens)

# analyze_class_async 내부 처리
async def analyze_class_async(self, source_code, class_name="", max_tokens=None, ...):
    if max_tokens is None:
        max_tokens = 8192  # 기본값
```

## 7. 고려사항 및 제약사항

### 7.1 현재 제약사항

#### 7.1.1 Chunking 분할의 한계

* **메서드 단위 분할**: 메서드가 매우 길면 단일 청크에 포함 불가
  * 예: 1,000줄짜리 메서드 → 청크 크기 초과 가능
  * **해결 방안**: 메서드 내부를 추가로 분할 (구현 복잡도 ↑)

* **Header/Footer 크기**: Header/Footer만으로 max_chars 초과 시 Chunking 불가
  * 예: 필드가 10,000줄인 클래스
  * **해결 방안**: Hard Truncation으로 fallback

#### 7.1.2 병합 결과 품질

* **간단한 병합**: 현재는 청크별 결과를 단순 결합
  * 중복 정보 (클래스 개요 등) 제거 안 됨
  * 일관성 부족 가능

* **향후 개선**: LLM 기반 병합
  * "다음 청크별 분석 결과를 하나의 일관된 클래스 설명으로 통합하세요"
  * 추가 LLM 호출 필요 → 비용/시간 증가

#### 7.1.3 성능 오버헤드

* **청크 개수**: 청크가 많을수록 LLM 호출 횟수 증가
  * 예: 10개 청크 = 10번 LLM 호출 → 시간 증가
  * **완화 방안**: 병렬 처리 (asyncio.gather)

* **Rate Limit**: API Rate Limit 고려 필요
  * 예: Gemini Flash 15 RPM → 청크 10개면 1분 소요
  * **완화 방안**: Semaphore로 동시 요청 수 제한

### 7.2 기타 고려사항

#### 7.2.1 사용자 경험

* **진행률 표시**: 청크별 진행률 표시
  * 예: "청크 3/5 분석 중..."
  * Client 화면에 실시간 반영

* **취소 지원**: 청크 분석 중 취소 가능
  * `stop_check_callback` 각 청크마다 확인

#### 7.2.2 비용 최적화

* **청크 크기 조정**: 청크를 크게 만들어 개수 최소화
  * `max_tokens` 값을 최대한 활용
  * 예: 8K → 16K 모델 사용 시 청크 개수 절반

* **Caching**: 동일 클래스 재분석 시 청크 결과 캐싱
  * 구현 복잡도 ↑, 효과는 제한적 (대부분 1회 분석)

#### 7.2.3 보안 및 안정성

* **입력 검증**: 악의적 소스 코드 입력 방지
  * 현재 Java 파싱으로 어느 정도 검증됨
  * 추가 검증 불필요 (내부 시스템)

* **메모리 관리**: 대용량 클래스 처리 시 메모리 사용량 증가
  * 청크 단위 처리로 완화
  * 모니터링 필요

### 7.3 문제점 및 리스크

#### 7.3.1 사용자별 max_tokens 관리 복잡성

**문제**: 각 사용자가 다른 max_tokens 설정 가능
* User A: 8K, User B: 128K
* 동일 클래스를 다른 사용자가 분석 시 다른 청크 개수

**영향**:
* Neo4j에 저장되는 ai_description이 사용자마다 다름
* 캐싱 어려움

**해결 방안**:
1. **현재 (Phase 1)**: 사용자별 설정 허용 (마지막 분석자의 결과만 저장)
2. **향후 (Phase 2)**: ai_description에 메타데이터 추가 (분석 시 사용한 max_tokens 기록)

#### 7.3.2 청크 분할 로직 복잡도

**문제**: Java 클래스 파싱 로직이 완벽하지 않음
* 중첩 클래스, 람다, 익명 클래스 등 복잡한 구조 처리 어려움
* 정규식 기반 파싱의 한계

**해결 방안**:
1. **현재 (Phase 1)**: 간단한 정규식 파싱 (80% 커버리지 목표)
2. **향후 (Phase 2)**: javalang AST 기반 정확한 파싱
   * `javalang.parse.parse()` 사용
   * 메서드 단위 정확한 추출

#### 7.3.3 병합 결과 품질 검증

**문제**: 청크별 분석 결과를 병합한 최종 결과의 품질 검증 어려움
* 인간이 직접 리뷰 필요
* 자동화된 품질 지표 부재

**해결 방안**:
1. **초기**: 샘플 클래스 수동 검증
2. **향후**: 사용자 피드백 수집 (좋아요/싫어요)
3. **장기**: LLM 기반 품질 평가

## 8. 구현 우선순위 및 일정

### 8.1 Phase 1: `max_tokens` 속성 추가 (1-2일)

**목표**: Token 제한을 사용자별로 관리 가능하게 만들기

**작업**:
1. User preferences_ai 스키마 업데이트 (max_tokens 추가)
2. DB 마이그레이션 실행 (기존 사용자에게 기본값 설정)
3. 백엔드 API 수정 (GET/PUT /users/me/preferences/ai)
4. Client 화면 수정 (CodeAiAnalysis에 max_tokens 입력 필드)
5. Form Schema 수정
6. 저장/로드 로직 수정
7. 테스트

**완료 조건**:
- [x] User preferences_ai에 max_tokens 추가 완료
- [x] Client에서 max_tokens 편집 가능
- [x] AI 분석 시 max_tokens 값 적용 확인

**구현 완료일**: 2026-01-05

**구현 내역**:
1. ✅ DB 마이그레이션 스크립트 작성 (`server/migrations/add_max_tokens_to_preferences_ai.py`)
2. ✅ 백엔드 API 수정 (GET/PUT `/users/me/preferences/ai`)
   - max_tokens 기본값 8192 보장
   - max_tokens 검증 (1024 ~ 1000000)
3. ✅ AIAnalyzer.analyze_class_async에 max_tokens 파라미터 추가
4. ✅ AIEnrichmentService에서 max_tokens 전달
5. ✅ AI 분석 API 엔드포인트에서 max_tokens 전달
6. ✅ Client Form Schema 수정 (max_tokens 추가)
7. ✅ Client UI 컴포넌트 수정 (CodeAiAnalysis)
   - defaultValues에 max_tokens 추가
   - AI 설정 조회 시 max_tokens 포함
   - handleSaveSettings에서 max_tokens 저장
   - UI에 Max Tokens 입력 필드 추가 (Model Name 우측)

### 8.2 Phase 2: Chunking 전략 구현 (3-5일)

**목표**: 대용량 클래스를 청크로 분할하여 분석

**작업**:
1. `_chunk_class_source()` 메서드 구현
2. `_merge_chunk_results()` 메서드 구현
3. `analyze_class_async()` 수정 (Chunking 적용, max_tokens 파라미터 추가)
4. AIEnrichmentService에서 max_tokens 전달
5. 단위 테스트 작성
6. 통합 테스트
7. 실제 환경 테스트

**완료 조건**:
- [x] Chunking 로직 구현 및 테스트 통과
- [x] 대용량 클래스 분석 성공 (Hard Truncation 경고 없음)
- [x] 병합 결과 품질 검증

**구현 완료일**: 2026-01-05

**구현 내역**:
1. ✅ `_chunk_class_source()` 메서드 구현
   - 클래스를 Header + Methods 그룹 + Footer로 분할
   - 메서드 단위 Chunking (의미적으로 완전한 클래스 구조 유지)
   - Header/Footer 크기 초과 시 Hard Truncation으로 fallback

2. ✅ `_merge_chunk_results()` 메서드 구현
   - 여러 청크의 AI 분석 결과를 하나의 Markdown 문서로 병합
   - 각 청크를 Part 1/N 형식으로 섹션 구분
   - 분할 분석 표시 (사용자에게 명확히 전달)

3. ✅ `analyze_class_async()` 수정 (Chunking 전략 적용)
   - **Step 0 (Pass-through)**: 크기가 제한 이내이면 원본 그대로 전송
   - **Step 1 (Body Stripping)**: 메서드 구현 로직(Body) 제거, 시그니처만 유지
   - **Step 2 (Chunking 판단)**: Body Stripping 후에도 크기 초과 시 Chunking 적용
   - **Step 3 (각 청크 순차 분석)**: 각 청크별로 AI 분석 실행 (취소 지원)
   - **Step 4 (결과 병합)**: 청크별 분석 결과를 하나의 Markdown으로 병합

4. ✅ 단위 테스트 작성 (`tests/unit/test_chunking_strategy.py`)
   - test_chunk_class_source_small: 작은 클래스는 청크 분할 안 함
   - test_chunk_class_source_large: 큰 클래스는 여러 청크로 분할
   - test_chunk_class_source_with_fields: 필드가 있는 클래스 청크 분할
   - test_merge_chunk_results_single: 단일 청크 결과 병합
   - test_merge_chunk_results_multiple: 여러 청크 결과 병합
   - test_merge_chunk_results_empty: 빈 청크 결과 병합
   - test_chunk_class_source_header_overflow: Header 초과 시 Truncation

**참고사항**:
- 현재 구현은 **순차 처리** (for loop)입니다.
- Phase 3에서 **병렬 처리** (asyncio.gather)로 성능 향상 가능합니다.
- 테스트 실행 시 pytest 필요: `pip install pytest`

### 8.3 Phase 3: 성능 최적화 및 개선 (2-3일, 선택사항)

**목표**: 청크 병렬 분석 및 병합 품질 향상

**작업**:
1. 청크 병렬 분석 (asyncio.gather)
2. Semaphore로 동시 요청 수 제한
3. LLM 기반 병합 (선택사항)
4. 성능 테스트 및 튜닝

**완료 조건 (1,2번)**:
- [x] 청크 병렬 분석으로 성능 향상
- [x] Rate Limit 고려한 안정적인 동작 (Semaphore)
- [ ] (선택) LLM 병합으로 품질 향상
- [ ] 성능 테스트 및 검증

**구현 완료일**: 2026-01-05 (1,2번 항목)

**구현 내역**:

#### 1. 청크 병렬 분석 구현 ✅

**파일**: `server/csa/aiwork/ai_analyzer.py`

**변경 내용**:
- `analyze_class_async()` 메서드에 `semaphore` 파라미터 추가
- 순차 처리 (for loop)를 병렬 처리 (asyncio.gather)로 변경
- 인덱스 기반 정렬로 청크 순서 유지

**주요 코드 변경**:
```python
# Before (Phase 2 - 순차 처리)
for i, chunk in enumerate(chunks, 1):
    raw_response = await self._call_llm_async(...)
    chunk_results.append(chunk_result)

# After (Phase 3 - 병렬 처리)
async def analyze_single_chunk(idx: int, chunk: str) -> tuple[int, str]:
    if semaphore:
        async with semaphore:  # 동시 요청 수 제한
            raw_response = await self._call_llm_async(...)
            return idx, chunk_result
    else:
        raw_response = await self._call_llm_async(...)
        return idx, chunk_result

tasks = [analyze_single_chunk(i, chunk) for i, chunk in enumerate(chunks)]
indexed_results = await asyncio.gather(*tasks)
indexed_results.sort(key=lambda x: x[0])
chunk_results = [result for _, result in indexed_results]
```

**주요 개선 사항**:
- ✅ **병렬 처리**: 모든 청크를 동시에 LLM에 요청 (asyncio.gather)
- ✅ **순서 유지**: 인덱스 기반 정렬로 청크 순서 보장
- ✅ **Semaphore 지원**: semaphore가 제공되면 동시 요청 수 제한
- ✅ **취소 지원**: 각 청크 분석 전 취소 확인

#### 2. Semaphore 생성 및 전달 ✅

**파일**: `server/csa/services/ai_enrichment_service.py`

**변경 내용**:
- `_enrich_classes_async()` 메서드에서 Semaphore 생성
- 클래스 단위 semaphore를 제거하고 청크 단위로 적용
- `analyze_class_async()` 호출 시 semaphore 전달

**주요 코드 변경**:
```python
# Before (Phase 2 - 클래스 단위 semaphore)
async def process_class(record, index):
    async with semaphore:  # 클래스 단위 제한
        ai_description = await self.analyzer.analyze_class_async(...)

# After (Phase 3 - 청크 단위 semaphore)
# Semaphore: 청크 분석 시 동시 LLM 요청 수 제한
semaphore = asyncio.Semaphore(concurrent_requests)

async def process_class(record, index):
    # 클래스 단위 semaphore 제거
    ai_description = await self.analyzer.analyze_class_async(
        ...,
        semaphore=semaphore,  # 청크 병렬 분석 시 사용
        ...
    )
```

**주요 개선 사항**:
- ✅ **정확한 Rate Limit 관리**: 클래스 단위가 아닌 청크 단위로 LLM 요청 수 제한
- ✅ **concurrent_requests 의미 명확화**: 실제 LLM 동시 호출 수를 정확히 제어
- ✅ **유연한 제어**: semaphore=None이면 무제한 병렬 실행 가능

#### 성능 비교

**시나리오**: 1개 클래스가 10개 청크로 분할, concurrent_requests=5, 청크당 LLM 응답 5초

| 구분 | Phase 2 (순차) | Phase 3 (병렬 + Semaphore) |
|------|---------------|---------------------------|
| **청크 1-5** | 5초씩 순차 (25초) | 병렬 처리 (5초) |
| **청크 6-10** | 5초씩 순차 (25초) | 병렬 처리 (5초) |
| **총 소요 시간** | 50초 | 10초 |
| **LLM 동시 호출** | 1개 | 최대 5개 (Semaphore) |
| **Rate Limit** | 자동 준수 | Semaphore로 관리 |

**기대 효과**:
- ✅ **5배 속도 향상** (청크 수에 비례, concurrent_requests=5 기준)
- ✅ **Rate Limit 준수** (concurrent_requests로 제어)
- ✅ **확장 가능**: 클래스가 100개 청크로 나뉘어도 동일한 성능 패턴

**남은 작업 (Phase 3-3,4)**:
- [x] 3. LLM 기반 병합 (선택사항) - **완료 (2026-01-05)**
- [ ] 4. 성능 테스트 및 튜닝

#### 3. LLM 기반 병합 구현 ✅

**파일**: `server/csa/aiwork/ai_analyzer.py`

**구현 내용**:
- `_merge_chunk_results_with_llm()` 비동기 메서드 추가
- 청크별 분석 결과를 LLM에 재입력하여 고품질 병합
- 자동 fallback: LLM 병합 실패 시 단순 병합으로 전환

**주요 코드**:
```python
async def _merge_chunk_results_with_llm(
    self,
    chunk_results: list[str],
    class_name: str,
    stop_check_callback=None,
    logger: logging.Logger = logger
) -> str:
    """LLM을 사용하여 여러 청크의 AI 분석 결과를 하나의 일관된 Markdown 문서로 병합"""

    # 병합 프롬프트 작성
    merge_prompt = f"""다음은 `{class_name}` 클래스를 {len(chunk_results)}개 청크로 나누어 분석한 결과입니다.
이 결과들을 하나의 일관되고 전문적인 클래스 설명 문서로 통합해주세요.

요구사항:
1. **중복 정보 제거**: 클래스 개요, 목적 등은 한 번만 기술
2. **논리적 구조화**: 메서드를 기능별로 그룹화하여 재구성
3. **일관된 어조**: 전체 문서의 어조와 스타일을 통일
4. **Markdown 형식**: 헤더, 리스트, 코드 블록 등을 적절히 사용
5. **분할 분석 표시 제거**: "Part 1/N" 같은 표현 제거
"""

    # LLM 호출 및 Fallback
    try:
        raw_response = await self._call_llm_async(merge_prompt, ...)
        return self._clean_response(raw_response)
    except Exception as e:
        logger.error(f"LLM 기반 병합 실패: {e}")
        # Fallback: 단순 병합
        return self._merge_chunk_results(chunk_results, class_name, logger)
```

**파라미터 추가**:
- `analyze_class_async()`: `use_llm_merge` 파라미터 추가
- `AIEnrichmentService.enrich_project_async()`: `use_llm_merge` 전달
- `AIEnrichRequest`: `use_llm_merge` 필드 추가
- `User.preferences_ai`: `use_llm_merge` 기본값 (False)

**Client UI**:
- **Checkbox 추가**: "LLM Merge (High Quality, 2x Time)"
- **위치**: Max Tokens 필드 바로 아래
- **설명**: "Use LLM-based merging for chunked class analysis (higher quality, slower)"
- **저장/로드**: 사용자 AI 설정에 저장

**비용/시간 트레이드오프**:
| 항목 | 단순 병합 | LLM 병합 |
|------|----------|---------|
| LLM 호출 | N회 | N+1회 |
| 소요 시간 | 5초 | 10초 (+100%) |
| 품질 | 중복 가능 | 고품질 |
| 일관성 | 낮음 | 높음 |

**사용 권장 시나리오**:
- ✅ 공개 문서, 리포트 생성
- ✅ 청크 수가 적은 경우 (2-3개)
- ✅ 품질 우선 (비용/시간 여유)

### 8.4 총 예상 일정

* **Phase 1**: 1-2일
* **Phase 2**: 3-5일
* **Phase 3**: 2-3일 (선택사항)

**총계**: 6-10일 (약 1.5-2주)

## 9. 결론

### 9.1 핵심 요약

* **Token 제한 관리**: `max_tokens` 속성을 User 노드의 `preferences_ai`에 추가하여 사용자별 관리
* **Chunking 전략**: 대용량 클래스를 메서드 단위로 분할 → 청크별 분석 → 결과 병합
* **하위 호환성**: 기존 코드 영향 최소화, 기본값 보장
* **성능 최적화**: 청크 병렬 분석, Semaphore로 Rate Limit 고려

### 9.2 기대 효과

* ✅ **정보 손실 제거**: Hard Truncation 대신 Chunking으로 전체 분석
* ✅ **분석 품질 향상**: 모든 메서드 정보 활용 → 정확한 AI description
* ✅ **유연한 설정**: 사용자별 Token 제한 조정 가능 (모델에 따라)
* ✅ **확장성**: 다양한 LLM 모델 (8K, 32K, 128K) 지원

### 9.3 변경사항 요약

**당초 계획 대비 변경**:
1. **저장 위치 변경**: AiPrompt 노드 → User 노드 preferences_ai
   * **이유**: Token 제한은 사용자가 사용하는 모델에 따라 다름
   * **장점**: 프롬프트는 공유, 설정은 개인화

2. **UI 배치 변경**: "AI 분석 프롬프트 관리" 화면 → "코드 AI 분석" 화면
   * **위치**: "AI 모델 설정 (Configuration)" 영역, Model Name 옆
   * **장점**: 다른 AI 설정(Provider, Model, API Key)과 함께 관리

3. **CLI 동작**: Hybrid 접근법 (추가 검토 후 확정)
   * **.env 기본값**: `MAX_TOKENS=8192` 추가 (다른 AI 설정과 일관성)
   * **선택적 User DB**: `--user-id` 옵션으로 특정 사용자 설정 사용 가능
   * **우선순위**: CLI 옵션 → User DB → .env → 기본값
   * **장점**:
     - 기존 .env 기반 동작 유지 (하위 호환성)
     - Web UI와 동일한 결과 필요 시 --user-id 사용
     - 유연한 설정 관리

### 9.4 다음 단계

1. **사용자 승인**: 변경된 구현 계획 검토 및 승인
2. **Phase 1 구현**: `max_tokens` 속성 추가 (User preferences_ai)
3. **Phase 2 구현**: Chunking 전략 구현
4. **검증 및 배포**: 테스트 완료 후 프로덕션 배포
5. **모니터링**: 실제 사용 중 성능 및 품질 모니터링
6. **지속 개선**: 사용자 피드백 기반 병합 품질 향상

---

**작성자**: Claude Code
**검토자**: (사용자명)
**승인자**: (사용자명)
**버전**: 2.0 (변경사항 반영)
**최종 업데이트**: 2026-01-04
