# Class AI Token 사이즈 제한 해소 방안 검토 및 구현 계획

## 1. 개요

* **문서 번호**: 20260103-01
* **작성 일자**: 2026-01-03
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
