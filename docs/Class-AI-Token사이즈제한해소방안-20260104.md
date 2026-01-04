# Class AI Token 사이즈 제한 해소 방안 검토 및 구현 계획

## 1. 개요

* **문서 번호**: 20260104-01
* **작성 일자**: 2026-01-03
* **최종 업데이트**: 2026-01-04 (구현 완료)
* **관련 이슈**: Class AI 분석 시 Token 사이즈 제한(8,192) 초과로 인한 분석 오류 발생

## 2. 현상 분석

* **문제점**:
  * 현재 `ai_analyzer.py`는 `analyze_class_async` 호출 시 소스 코드 전체를 프롬프트에 포함합니다.
  * LLM(Gemini, GPT 등)은 모델마다 Context Window(Token Limit)가 존재하며, 특히 8k(8,192) 제한이 있는 모델 사용 시 거대한 클래스(수천 줄 이상) 분석 요청이 실패합니다.
  * 주로 `400 INVALID_ARGUMENT` (Context Length Exceeded) 또는 `429 RESOURCE_EXHAUSTED` 오류가 발생합니다.

## 3. 해결 방안 (Mitigation Strategy)

### 3.1 기본 전략: 단계적 축소 (Step-down Reduction)

입력 소스 코드의 크기가 임계치(예: 8,192 토큰 ≈ 32,000자)를 초과할 경우, 정보 손실을 최소화하면서 크기를 줄이는 전략을 단계적으로 적용합니다.

* **Step 0 (Pass-through)**: 크기가 제한 이내이면 원본 그대로 전송.
* **Step 1 (Body Stripping)**: 메서드의 **구현 로직(Body)**을 제거하고 시그니처(Signature)만 남김.
  * Class 분석의 목적은 주로 "책임", "역할", "주요 메서드 목록", "외부 연계" 파악이므로 구체적인 구현 로직이 없어도 대부분 분석 가능함.
  * 예: `public void doSomething() { ... 100 lines ... }` -> `public void doSomething() { /* code hidden */ }`
* **Step 2 (Hard Truncation)**: Body 제거 후에도 크다면, 파일의 중간 부분을 생략하고 **Header(선언부/필드)**와 **Footer**만 남김.
  * `Head 30%` + `...skipped...` + `Tail 20%` 형태.

### 3.2 구현 상세 (Algorithm)

1. **Token 수 추정**:
    * 별도의 Tokenizer 라이브러리(tiktoken 등) 사용은 의존성을 높이므로, **글자 수 기반 추정** 사용.
    * Rule of thumb: 1 Token ≈ 4 Characters (영문 기준). 한글 포함 시 보수적으로 접근.
    * **Max Limit**: 8,192 Tokens * 3.5 Chars ≈ 28,000자 (안전마진 포함 약 30,000자로 설정).

2. **Code Optimization Function (`_optimize_source_code`)**:
    * 입력: `source_code`, `max_tokens`
    * 로직:

        ```python
        if len(source_code) < max_chars:
            return source_code
        
        # Step 1: Remove Method Bodies (Regex)
        optimized_code = remove_method_bodies(source_code)
        
        if len(optimized_code) < max_chars:
            return optimized_code
            
        # Step 2: Truncate
        return truncate_center(optimized_code, max_chars)
        ```

3. **Regex for Body Removal**:
    * 엄격한 파싱 대신 간단한 패턴 매칭 사용.
    * 패턴: 중괄호 `{}` 블록을 찾아 내부를 비움. (※ 중첩 중괄호 처리는 정규식으로 완벽하지 않으나, 들여쓰기 기반이나 단순 매칭으로 80% 이상의 효율 달성 목표)

## 4. 구현 계획 (Action Items)

1. **`ai_analyzer.py` 수정**:
    * `_optimize_source_code` 메서드 추가.
    * `analyze_class_async` 메서드 내에서 호출 연결.
    * 로그 추가: 최적화 수행 여부 및 줄어든 크기 기록.

2. **검증**:
    * 대용량 소스 파일(4,000줄 이상)을 대상으로 테스트.
    * AI 분석 결과가 엉뚱하지 않고(예: "코드가 비어있습니다" 등), 클래스의 개요를 잘 설명하는지 확인.

## 5. 구현 결과 (Implementation Result)

### 5.1 구현 완료 일시
* **구현 일자**: 2026-01-04
* **구현 파일**: `server/csa/aiwork/ai_analyzer.py`
* **테스트 파일**: `server/tests/test_code_optimization.py`

### 5.2 구현 내용

#### 5.2.1 추가된 메서드

1. **`_remove_method_bodies(source_code: str) -> str`**
   * Java 소스 코드에서 메서드 Body를 제거하고 시그니처만 남김
   * 구현 방식:
     - 줄 단위 파싱
     - 괄호 `()` 와 중괄호 `{` 를 이용한 메서드 감지
     - 메서드 시그니처: `public void method() {` → `public void method() { /* implementation hidden */ }`
     - 주석, 어노테이션, 필드 선언은 그대로 유지

2. **`_truncate_center(source_code: str, max_chars: int) -> str`**
   * 소스 코드의 중간 부분을 생략하고 Head(30%)와 Tail(20%)만 남김
   * 줄 단위로 자르기 (부분적으로 잘린 줄 제거)
   * 생략된 부분에 `/* ... N lines (M chars) skipped ... */` 마커 추가

3. **`_optimize_source_code(source_code: str, max_chars: int = 30000) -> tuple[str, str]`**
   * 단계적 최적화 전략 적용:
     - **Step 0 (Pass-through)**: `len(source_code) <= max_chars` → 원본 그대로 반환
     - **Step 1 (Body Stripping)**: 메서드 Body 제거 → 크기 확인
     - **Step 2 (Hard Truncation)**: 여전히 크다면 중간 부분 생략
   * 반환값: `(최적화된 코드, 최적화 레벨)`
     - 최적화 레벨: `"none"`, `"body_stripped"`, `"truncated"`

#### 5.2.2 `analyze_class_async` 메서드 수정

```python
async def analyze_class_async(self, source_code: str, class_name: str = "", ...) -> str:
    # 소스 코드 최적화 (Token 제한 대응)
    optimized_code, optimization_level = self._optimize_source_code(
        source_code,
        max_chars=30000,
        logger=logger
    )

    if optimization_level != "none":
        logger.info(f"Class AI 분석 - 소스 코드 최적화 적용 ({class_name}): "
                   f"{len(source_code)} → {len(optimized_code)} chars, "
                   f"level={optimization_level}")

    prompt = get_prompt("class_doc")
    input_text = f"{prompt}\n\n```java\n{optimized_code}\n```"
    # ... (기존 LLM 호출 로직)
```

### 5.3 테스트 결과

#### 5.3.1 테스트 케이스

| 테스트 | 원본 크기 | 최적화 후 | 최적화 레벨 | 감소율 | 결과 |
|--------|-----------|-----------|-------------|--------|------|
| Test 1: Pass-through (작은 코드) | 184 chars | 184 chars | none | 0% | ✅ PASS |
| Test 2: Body Stripping (큰 코드) | 191,227 chars | 217 chars | body_stripped | 99.9% | ✅ PASS |
| Test 3: Truncation (매우 큰 코드) | 298,917 chars | 15,014 chars | truncated | 95.0% | ✅ PASS |
| Test 4: Real-world Scenario (Service 클래스) | 165,412 chars | 920 chars | body_stripped | 99.4% | ✅ PASS |

#### 5.3.2 검증 항목

- ✅ 작은 코드는 수정되지 않음 (Pass-through)
- ✅ 메서드 Body 제거로 대부분 크기 제한 충족 (99.9% 감소)
- ✅ 메서드 시그니처 보존 (`createUser`, `getUserById` 등)
- ✅ 클래스 선언부, 필드, 어노테이션 유지
- ✅ Hard Truncation 시 최대 글자 수(30,000) 준수
- ✅ 최적화 레벨별 로그 기록

### 5.4 기대 효과

1. **Token 제한 오류 해소**
   * `400 INVALID_ARGUMENT (Context Length Exceeded)` 오류 방지
   * `429 RESOURCE_EXHAUSTED` 오류 감소

2. **분석 품질 유지**
   * 클래스의 구조적 정보 보존 (필드, 메서드 시그니처, 어노테이션)
   * AI 분석 목적(책임, 역할, 주요 메서드 파악)에 필요한 정보 유지

3. **성능 향상**
   * Token 수 감소 → LLM 응답 속도 향상
   * 비용 절감 (Token 기반 과금 모델)

4. **적응형 최적화**
   * 코드 크기에 따라 자동으로 최적화 레벨 조정
   * 작은 코드는 원본 그대로, 큰 코드만 최적화

### 5.5 제약 사항 및 개선 방향

#### 5.5.1 현재 제약 사항

1. **메서드 Body 제거의 한계**
   * 중첩 중괄호 처리가 완벽하지 않음 (정규식 기반)
   * Lambda 표현식, 익명 클래스 등에서 오작동 가능
   * → 80% 이상 효율 달성 목표 (현재 99% 이상 감소율 달성)

2. **Hard Truncation 시 정보 손실**
   * 클래스 중간 부분의 메서드가 완전히 제외될 수 있음
   * → 분석 결과가 불완전할 수 있다는 경고 로그 출력

#### 5.5.2 향후 개선 방향

1. **AST 기반 Body 제거**
   * javalang AST를 활용한 정확한 메서드 Body 제거
   * 중첩 구조 완벽 처리

2. **중요도 기반 Truncation**
   * public 메서드 우선 보존
   * getter/setter 제외, 비즈니스 로직 메서드 우선

3. **Chunking 전략**
   * 클래스를 여러 부분으로 나누어 분석
   * 결과를 병합하여 완전한 분석 제공

4. **모델별 최적화**
   * 모델의 Context Window에 따라 max_chars 자동 조정
   * GPT-4: 128k, Gemini: 1M, Llama: 8k 등

### 5.6 모니터링 방법

#### 5.6.1 로그 확인

```bash
# AI 분석 로그 확인
tail -f logs/analysis-ai-{job_id}.log

# 최적화 적용 여부 확인
grep "소스 코드 최적화" logs/analysis-ai-{job_id}.log
```

#### 5.6.2 주요 로그 메시지

* `소스 코드 크기 적정 (N chars <= 30000)` → Pass-through
* `소스 코드 크기 초과 감지 (N chars > 30000), 최적화 시작` → 최적화 시작
* `Step 1 (Body Stripping): N → M chars (X% 감소)` → Body Stripping 적용
* `Body Stripping으로 크기 제한 충족` → Body Stripping 성공
* `Step 2 (Hard Truncation): N → M chars (X% 총 감소)` → Hard Truncation 적용
* `Hard Truncation 적용됨 - 클래스 분석 결과가 불완전할 수 있습니다` → 경고

### 5.7 프롬프트 길이 고려 개선 (2026-01-04 추가)

#### 5.7.1 문제점 발견

초기 구현에서는 **소스 코드 크기만** 체크했지만, 실제 LLM에 전달되는 입력은 다음과 같이 구성됩니다:

```python
input_text = f"{prompt}\n\n```java\n{source_code}\n```"
```

즉, **프롬프트 + 마크다운 문법 + 소스 코드** 전체가 LLM에 전달되므로, 프롬프트 길이를 고려하지 않으면 실제 Token 제한을 초과할 수 있습니다.

#### 5.7.2 프롬프트 길이 분석

| 프롬프트 타입 | 프롬프트 길이 | 마크다운 오버헤드 | 총 오버헤드 |
|---------------|---------------|-------------------|-------------|
| `class_doc` | 1,150 chars | 14 chars | **1,164 chars** |
| `method_doc` | 933 chars | 14 chars | **947 chars** |
| `sql_doc` | 799 chars | 13 chars | **812 chars** |

**영향 분석:**
- 전체 입력 제한: 30,000자 (약 8,192 토큰)
- `class_doc` 사용 시 소스 코드 최대: **30,000 - 1,164 = 28,836자**
- **약 1,164자 (약 300 토큰)**를 프롬프트가 차지

#### 5.7.3 개선 사항

**수정 전 (잘못된 로직):**
```python
# 소스 코드만 체크 (프롬프트 길이 무시)
optimized_code, level = self._optimize_source_code(
    source_code,
    max_chars=30000  # 잘못됨!
)
prompt = get_prompt("class_doc")
input_text = f"{prompt}\n\n```java\n{optimized_code}\n```"
# 실제 입력 크기가 30,000 초과 가능!
```

**수정 후 (올바른 로직):**
```python
# 프롬프트 먼저 가져오기
prompt = get_prompt("class_doc")

# 프롬프트 + 마크다운 오버헤드 계산
markdown_overhead = len('\n\n```java\n') + len('\n```')
prompt_overhead = len(prompt) + markdown_overhead

# 전체 입력 제한
max_total_chars = 30000

# 소스 코드에 사용 가능한 최대 크기
source_code_max = max_total_chars - prompt_overhead

# 정확한 크기로 최적화
optimized_code, level = self._optimize_source_code(
    source_code,
    max_chars=source_code_max  # 정확함!
)

# 최종 입력 생성
input_text = f"{prompt}\n\n```java\n{optimized_code}\n```"

# 검증: len(input_text) <= max_total_chars
```

#### 5.7.4 개선 결과

**테스트 결과 (test_code_optimization_with_prompt.py):**

| 테스트 | 결과 |
|--------|------|
| Prompt Overhead Calculation | ✅ PASS |
| Total Input Size Verification | ✅ PASS |
| Realistic Scenario (Service Class + Prompt) | ✅ PASS |
| Edge Case (Exact Limit) | ✅ PASS |

**검증 항목:**
- ✅ 프롬프트 길이 정확히 계산 (class: 1,164자, method: 947자, sql: 812자)
- ✅ 소스 코드 최대 크기 정확히 계산 (30,000 - 프롬프트 오버헤드)
- ✅ 전체 입력 크기가 항상 30,000자 이하 유지
- ✅ 실제 Service 클래스 (119,502자) → 최적화 후 전체 입력 1,651자

**핵심 개선 효과:**
- **정확한 Token 제한 준수**: 프롬프트를 포함한 전체 입력 크기 정확히 제어
- **오버헤드 최소화**: 불필요한 마진 제거, 소스 코드 공간 최대 활용
- **안정성 향상**: Token 제한 초과 오류 완전 방지

### 5.8 결론

* ✅ **구현 완료**: Token 사이즈 제한 해소 방안 성공적으로 구현
* ✅ **테스트 통과**: 모든 테스트 케이스 성공 (8/8 - 기본 4개 + 프롬프트 고려 4개)
* ✅ **효과 검증**: 99% 이상 크기 감소, 메서드 시그니처 보존
* ✅ **프롬프트 고려**: 전체 입력 크기 정확히 계산, Token 제한 준수
* ⚠️ **주의 사항**: Hard Truncation 적용 시 일부 정보 손실 가능 (로그로 경고)
* 🔜 **향후 과제**: AST 기반 정확한 파싱, 중요도 기반 최적화
