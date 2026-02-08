"""
AI 분석 서비스 모듈
LLM을 사용하여 Class, Method, SQL의 특징을 분석합니다.
"""

import asyncio
import logging
import re
import time

from .ai_config import ai_config, AIConfig
from .ai_providers import AIProviderManager, ai_provider_manager
from .prompt import get_prompt
from csa.utils.i18n import _t

logger = logging.getLogger(__name__)


class AIAnalyzer:
    """AI 기반 코드 분석 서비스"""

    def __init__(self, config: AIConfig = None):
        """
        AI Analyzer 초기화
        
        Args:
            config: Optional AIConfig instance. If None, uses global default.
        """
        self.ai_config = config or ai_config
        # Use specific config for provider manager if config provides, otherwise fallback to global manager's logic (which is global config)
        # However, to be safe, we always create a new manager if we have a specific config, or reuse global?
        # Creating new manager is cheap.
        if config:
            self.provider_manager = AIProviderManager(self.ai_config)
        else:
            self.provider_manager = ai_provider_manager
            
        self._llm = None
        self._is_available = False

        # AI 분석 시스템 활성화 여부 확인
        if not self.ai_config.ai_use_analysis:
            logger.info(_t("ai.init_disabled"))
            return

        # LLM 초기화 시도
        try:
            self._llm = self.provider_manager.create_llm()
            self._is_available = True
            logger.info(_t("ai.init_complete", provider=self.ai_config.ai_provider, model=self.ai_config.get_current_model_name()))
        except Exception as e:
            logger.warning(_t("ai.init_failed", error=str(e)))
            self._is_available = False

    def is_available(self) -> bool:
        """AI 분석 사용 가능 여부 확인"""
        return self._is_available

    def _is_retryable_error(self, exception: Exception, error_msg: str) -> tuple[bool, float]:
        """
        재시도 가능한 에러인지 확인하고, 대기 시간이 있다면 반환합니다.

        Args:
            exception: 발생한 예외 객체
            error_msg: 에러 메시지

        Returns:
            (재시도 가능 여부, 추천 대기 시간(초))
        """
        error_msg_lower = error_msg.lower()
        wait_time = 0.0

    def _is_retryable_error(self, exception: Exception, error_msg: str, logger: logging.Logger = logger) -> tuple[bool, float]:
        """
        재시도 가능한 에러인지 확인하고, 대기 시간이 있다면 반환합니다.

        Args:
            exception: 발생한 예외 객체
            error_msg: 에러 메시지
            logger: 로그 기록용 로거 (None일 경우 모듈 기본 로거 사용)

        Returns:
            (재시도 가능 여부, 추천 대기 시간(초))
        """
        error_msg_lower = error_msg.lower()
        wait_time = 0.0

        # 에러 메시지에서 대기 시간 추출 (예: "Please retry in 51.139734249s")
        # 정규식: retry in (\d+(\.\d+)?)s
        import re
        retry_match = re.search(r'retry in (\d+(\.\d+)?)s', error_msg_lower)
        if retry_match:
            try:
                wait_time = float(retry_match.group(1))
                logger.info(_t("ai.api_wait_detected", wait_time=wait_time))
            except ValueError:
                pass

        # 1. 서비스 일시 불가 (503 UNAVAILABLE)
        if '503' in error_msg or 'unavailable' in error_msg_lower or 'service unavailable' in error_msg_lower:
            logger.warning(_t("ai.service_unavailable"))
            logger.warning(_t("ai.service_unavailable_detail"))
            return True, wait_time

        # 2. Rate Limit 초과 (429 RESOURCE_EXHAUSTED)
        if '429' in error_msg or 'resource_exhausted' in error_msg_lower:
            logger.warning(_t("ai.rate_limit_exceeded"))
            logger.warning(_t("ai.rate_limit_detail"))
            return True, wait_time

        return False, 0.0

    def _is_non_retryable_error(self, exception: Exception, error_msg: str, logger: logging.Logger = logger) -> bool:
        """
        재시도하면 안 되는 에러인지 확인합니다.

        Args:
            exception: 발생한 예외 객체
            error_msg: 에러 메시지

        Returns:
            재시도하면 안 되는 에러이면 True, 재시도 가능하면 False
        """
        # 에러 메시지를 소문자로 변환하여 검사
        error_msg_lower = error_msg.lower()

        # 1. 인증 실패 (401 UNAUTHENTICATED)
        if '401' in error_msg or 'unauthenticated' in error_msg_lower or 'unauthorized' in error_msg_lower:
            logger.warning(_t("ai.auth_failed"))
            logger.warning(_t("ai.auth_failed_detail"))
            logger.warning(_t("ai.auth_failed_env"))
            return True

        # 2. 권한 없음 (403 PERMISSION_DENIED)
        if '403' in error_msg or 'permission_denied' in error_msg_lower or 'forbidden' in error_msg_lower:
            logger.warning(_t("ai.permission_denied"))
            logger.warning(_t("ai.permission_denied_detail"))
            logger.warning(_t("ai.permission_denied_project"))
            return True

        # 3. 잘못된 요청 (400 INVALID_ARGUMENT)
        if '400' in error_msg or 'invalid_argument' in error_msg_lower or 'bad request' in error_msg_lower:
            logger.warning(_t("ai.bad_request"))
            logger.warning(_t("ai.bad_request_detail"))
            return True

        # 4. API 키 관련 에러
        if 'api key' in error_msg_lower or 'api_key' in error_msg_lower:
            logger.warning(_t("ai.api_key_error"))
            logger.warning(_t("ai.api_key_error_env"))
            return True

        return False

    def _call_llm(self, input_text: str, max_retries: int = 5, retry_delay: int = 5) -> str:
        """
        LLM을 호출하여 결과를 반환합니다.
        Provider별로 다른 메서드를 시도합니다.

        Args:
            input_text: LLM에 전달할 입력 텍스트
            max_retries: 최대 재시도 횟수 (기본값: 5)
            retry_delay: 재시도 기본 간격 (초, 기본값: 5)
                - Exponential Backoff 및 API 제안 대기 시간 사용

        Returns:
            LLM 응답 문자열
        """
    def _call_llm_single_attempt(self, input_text: str, logger: logging.Logger = logger) -> str:
        """
        단일 LLM 호출 시도 (재시도 로직 없음).
        Provider별로 다른 메서드를 시도합니다.

        Args:
            input_text: LLM에 전달할 입력 텍스트

        Returns:
            LLM 응답 문자열

        Raises:
            Exception: 호출 실패 시 발생한 예외
        """
        # 사용 가능한 모든 메서드 확인 (디버그용)
        all_methods = dir(self._llm)
        available_methods = [m for m in all_methods if callable(getattr(self._llm, m, None))]

        # 각 메서드 시도 결과 기록
        failed_attempts = []

        # Google ADK Gemini용 메서드 추가
        methods_to_try = [
            '__call__',              # Callable 객체 (우선순위 1)
            'generate_content',      # Google ADK Gemini 동기 메서드
            'invoke',                # LangChain 스타일
            'generate',              # 일반적인 메서드명
            'predict',               # 일반적인 메서드명
            'run',                   # 일반적인 메서드명
        ]

        for method_name in methods_to_try:
            if hasattr(self._llm, method_name):
                try:
                    method = getattr(self._llm, method_name)
                    if method_name == '__call__':
                        result = self._llm(input_text)
                    else:
                        result = method(input_text)

                    # 결과 추출
                    if hasattr(result, 'content'):
                        return result.content
                    elif hasattr(result, 'text'):
                        return result.text
                    elif isinstance(result, str):
                        return result
                    else:
                        return str(result)
                except Exception as e:
                    error_type = type(e).__name__
                    error_msg = str(e)
                    
                    # API 에러(재시도 가능/불가능)인 경우 즉시 중단하고 에러 전파 (다른 메서드 시도 안함)
                    if self._is_non_retryable_error(e, error_msg, logger=logger) or self._is_retryable_error(e, error_msg, logger=logger)[0]:
                         logger.warning(_t("ai.method_call_api_error", method_name=method_name, error_msg=error_msg[:100]))
                         raise e

                    failed_attempts.append(f"{method_name}: {error_type} - {error_msg[:100]}")
                    logger.debug(_t("ai.method_call_failed", method_name=method_name, error=str(e)))
                    # 일반 에러(AttributeError 등)는 다음 메서드 시도
            else:
                failed_attempts.append(f"{method_name}: 메서드 없음")

        # generate_content_async 메서드 - async generator 처리
        if hasattr(self._llm, 'generate_content_async'):
            try:
                import asyncio
                import inspect

                # async generator를 동기적으로 처리하는 함수
                async def collect_async_generator():
                    """async generator의 모든 내용을 수집합니다."""
                    content_parts = []
                    async for chunk in self._llm.generate_content_async(input_text):
                        if isinstance(chunk, str):
                            content_parts.append(chunk)
                        elif hasattr(chunk, 'text'):
                            content_parts.append(chunk.text)
                        elif hasattr(chunk, 'content'):
                            content_parts.append(chunk.content)
                        else:
                            content_parts.append(str(chunk))
                    return ''.join(content_parts)

                # asyncio 이벤트 루프로 실행
                loop = asyncio.new_event_loop()
                asyncio.set_event_loop(loop)
                result = loop.run_until_complete(collect_async_generator())
                loop.close()

                logger.debug(_t("ai.llm_response_length", length=len(result)))
                return result

            except Exception as e:
                logger.error(_t("ai.llm_call_failed", error=str(e)))
                failed_attempts.append(f"generate_content_async: {str(e)[:100]}")

        # 모든 메서드 실패 시 에러
        logger.warning(_t("ai.llm_call_all_failed"))
        for attempt in failed_attempts:
            logger.warning(f"  - {attempt}")

        error_msg = (f"LLM 객체 호출 실패.\n"
                    f"타입: {type(self._llm)}\n"
                    f"시도한 메서드: {len(failed_attempts)}개\n"
                    f"상세 실패 내역:\n" + "\n".join([f" - {f}" for f in failed_attempts]))
        
        # 마지막 예외가 있다면 그것을 raise하는 것이 좋지만, 
        # 여러 메서드 실패이므로 새로운 Exception raise
        raise RuntimeError(error_msg)

    def _call_llm(self, input_text: str, max_retries: int = 5, retry_delay: int = 5, logger: logging.Logger = logger) -> str:
        """
        LLM을 호출하여 결과를 반환합니다 (동기 방식).
        """
        retry_count = 0

        while retry_count <= max_retries:
            try:
                return self._call_llm_single_attempt(input_text, logger=logger)

            except Exception as e:
                error_type = type(e).__name__
                error_msg = str(e)

                # 재시도하면 안 되는 에러 감지 (즉시 중단)
                if self._is_non_retryable_error(e, error_msg, logger=logger):
                    logger.warning(_t("ai.llm_api_failed_no_retry", error_type=error_type, error_msg=error_msg[:200]))
                    raise e

                is_retryable, api_wait_time = self._is_retryable_error(e, error_msg, logger=logger)
                
                if is_retryable or retry_count < max_retries:
                    if retry_count < max_retries:
                        retry_count += 1
                        backoff_time = retry_delay * (2 ** (retry_count - 1))
                        wait_time = max(backoff_time, api_wait_time + 1 if api_wait_time > 0 else 0)
                        logger.warning(_t("ai.retry_waiting", retry_count=retry_count, max_retries=max_retries, wait_time=wait_time, api_wait_time=api_wait_time))
                        time.sleep(wait_time)
                        continue
                    else:
                        logger.error(_t("ai.max_retries_exceeded", max_retries=max_retries, error_type=error_type, error_msg=error_msg[:200]))
                        raise e
                else:
                    raise e

    def _clean_response(self, response: str) -> str:
        """
        LLM 응답 텍스트를 정제합니다.
        - <think>...</think> 태그 제거
        - ```markdown ... ``` 코드 블록 추출 (있는 경우)
        - 전체 markdown 내용 반환 (코드 블록 추출 로직 제거)
        """
        # 1. <think>...</think> 패턴 제거 (멀티라인, non-greedy)
        cleaned = re.sub(r'<think>.*?</think>', '', response, flags=re.DOTALL)

        # 2. ```markdown ... ``` 코드 블록 추출 (명시적으로 markdown 블록으로 감싼 경우만)
        markdown_match = re.search(r'```markdown\s*(.*?)\s*```', cleaned, flags=re.DOTALL)
        if markdown_match:
            # markdown 코드 블록이 있으면 그 내용만 반환
            return markdown_match.group(1).strip()

        # 3. 코드 블록이 없으면 전체 응답 반환
        return cleaned.strip()

    def _remove_method_bodies(self, source_code: str) -> str:
        """
        Java 소스 코드에서 메서드 Body를 제거하고 시그니처만 남깁니다.

        Args:
            source_code: 원본 Java 소스 코드

        Returns:
            Body가 제거된 소스 코드
        """
        # 간단한 정규식 기반 Body 제거
        # 패턴: ) { ... } 형태의 메서드 Body 찾기
        # 중첩 중괄호를 완벽하게 처리하지는 못하지만, 대부분의 경우 동작함

        # 개선된 방법: 줄 단위로 처리하되, 메서드 시그니처 감지를 개선
        lines = source_code.split('\n')
        result_lines = []
        in_method_body = False
        brace_count = 0
        method_brace_start = 0
        pending_signature_lines = []

        for i, line in enumerate(lines):
            stripped = line.strip()

            # 주석 라인은 그대로 유지
            if stripped.startswith('//') or stripped.startswith('/*') or stripped.startswith('*'):
                if not in_method_body:
                    result_lines.append(line)
                continue

            # 어노테이션은 그대로 유지
            if stripped.startswith('@'):
                if not in_method_body:
                    result_lines.append(line)
                continue

            # 중괄호 카운팅
            open_count = line.count('{')
            close_count = line.count('}')

            # 메서드 시그니처 감지: ( 와 ) 가 있고, { 가 있는 경우
            has_params = '(' in line and ')' in line
            has_open_brace = '{' in line

            if not in_method_body:
                # 메서드 시작 감지
                if has_params and has_open_brace:
                    # 메서드 시그니처로 판단
                    # { 이전 부분만 유지
                    before_brace = line.split('{')[0]
                    result_lines.append(before_brace + '{ /* implementation hidden */ }')

                    # 만약 { 가 여러 개 있거나 } 가 없다면 Body 진입
                    if open_count > close_count:
                        in_method_body = True
                        method_brace_start = open_count - close_count
                        brace_count = method_brace_start

                elif has_params and not has_open_brace:
                    # 메서드 시그니처가 여러 줄에 걸쳐 있을 수 있음
                    pending_signature_lines.append(line)

                elif pending_signature_lines and has_open_brace:
                    # 이전에 모은 시그니처 라인들과 현재 라인을 합침
                    for sig_line in pending_signature_lines:
                        result_lines.append(sig_line)
                    before_brace = line.split('{')[0]
                    result_lines.append(before_brace + '{ /* implementation hidden */ }')
                    pending_signature_lines = []

                    if open_count > close_count:
                        in_method_body = True
                        method_brace_start = open_count - close_count
                        brace_count = method_brace_start

                else:
                    # 일반 라인 (필드, 클래스 선언 등)
                    result_lines.append(line)
                    pending_signature_lines = []

            else:
                # 메서드 Body 내부 - 중괄호 카운팅만 수행
                brace_count += open_count
                brace_count -= close_count

                # Body 끝 감지
                if brace_count <= 0:
                    in_method_body = False
                    brace_count = 0

        return '\n'.join(result_lines)

    def _truncate_center(self, source_code: str, max_chars: int) -> str:
        """
        소스 코드의 중간 부분을 생략하고 Head와 Tail만 남깁니다.

        Args:
            source_code: 원본 소스 코드
            max_chars: 최대 글자 수

        Returns:
            중간이 생략된 소스 코드
        """
        if len(source_code) <= max_chars:
            return source_code

        # Head 30%, Tail 20%
        head_ratio = 0.30
        tail_ratio = 0.20

        head_chars = int(max_chars * head_ratio)
        tail_chars = int(max_chars * tail_ratio)

        head = source_code[:head_chars]
        tail = source_code[-tail_chars:]

        # 줄 단위로 자르기 (깔끔하게)
        head_lines = head.split('\n')
        tail_lines = tail.split('\n')

        # 마지막/첫 줄이 잘렸을 수 있으므로 제거
        if len(head_lines) > 1:
            head_lines = head_lines[:-1]
        if len(tail_lines) > 1:
            tail_lines = tail_lines[1:]

        skipped_chars = len(source_code) - len('\n'.join(head_lines)) - len('\n'.join(tail_lines))
        skipped_lines = source_code.count('\n') - len(head_lines) - len(tail_lines)

        separator = f"\n\n/* ... {skipped_lines} lines ({skipped_chars} chars) skipped ... */\n\n"

        return '\n'.join(head_lines) + separator + '\n'.join(tail_lines)

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
        method_groups = []  # [method_lines, ...]
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

        logger.debug(_t("ai.class_structure_parsing", header_size=header_size, methods_count=len(method_groups), footer_size=footer_size))

        if overhead >= max_chars:
            # Header/Footer만으로도 제한 초과 → Truncation 불가피
            logger.warning(_t("ai.header_footer_exceeded", overhead=overhead, max_chars=max_chars))
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
                    logger.debug(_t("ai.chunk_created", chunk_size=len(chunk), methods_count=len(current_chunk_methods)))

                # 새 청크 시작
                current_chunk_methods = [method_text]
                current_chunk_size = method_size

        # 마지막 청크 처리
        if current_chunk_methods:
            chunk = header_text + '\n' + '\n'.join(current_chunk_methods) + '\n' + footer_text
            chunks.append(chunk)
            logger.debug(_t("ai.chunk_created_last", chunk_size=len(chunk), methods_count=len(current_chunk_methods)))

        logger.info(_t("ai.class_chunked", chunks_count=len(chunks)))

        return chunks if chunks else [source_code]

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

        logger.info(_t("ai.merge_chunk_start", chunks_count=len(chunk_results)))

        # 간단한 병합 전략: 각 청크 결과를 섹션으로 구분
        merged = f"# {class_name} (분할 분석)\n\n"
        merged += f"> 이 클래스는 크기가 커서 {len(chunk_results)}개 청크로 분할하여 분석되었습니다.\n\n"

        for i, result in enumerate(chunk_results, 1):
            merged += f"## Part {i}/{len(chunk_results)}\n\n"
            merged += result
            merged += "\n\n---\n\n"

        logger.info(_t("ai.merge_chunk_complete", merged_size=len(merged)))

        return merged

    async def _merge_chunk_results_with_llm(
        self,
        chunk_results: list[str],
        class_name: str,
        stop_check_callback=None,
        logger: logging.Logger = logger
    ) -> str:
        """
        LLM을 사용하여 여러 청크의 AI 분석 결과를 하나의 일관된 Markdown 문서로 병합합니다.

        전략:
        - 청크별 분석 결과를 LLM에 입력
        - 중복 제거, 일관성 향상, 구조화 요청
        - 전문적인 클래스 설명 문서 생성

        Args:
            chunk_results: 각 청크의 AI 분석 결과 (Markdown)
            class_name: 클래스명
            stop_check_callback: 취소 확인 콜백
            logger: 로거

        Returns:
            LLM이 병합한 AI description (Markdown)
        """
        if not chunk_results:
            return ""

        if len(chunk_results) == 1:
            return chunk_results[0]

        logger.info(_t("ai.llm_merge_chunk_start", chunks_count=len(chunk_results)))

        # 병합 프롬프트 작성
        merge_prompt = f"""다음은 `{class_name}` 클래스를 {len(chunk_results)}개 청크로 나누어 분석한 결과입니다.
이 결과들을 하나의 일관되고 전문적인 클래스 설명 문서로 통합해주세요.

요구사항:
1. **중복 정보 제거**: 클래스 개요, 목적 등은 한 번만 기술
2. **논리적 구조화**: 메서드를 기능별로 그룹화하여 재구성
3. **일관된 어조**: 전체 문서의 어조와 스타일을 통일
4. **Markdown 형식**: 헤더, 리스트, 코드 블록 등을 적절히 사용
5. **분할 분석 표시 제거**: "Part 1/N" 같은 표현 제거

청크별 분석 결과:

"""

        # 각 청크 결과를 프롬프트에 추가
        for i, result in enumerate(chunk_results, 1):
            merge_prompt += f"\n---\n**청크 {i}/{len(chunk_results)}**:\n\n{result}\n"

        merge_prompt += "\n---\n\n위 청크별 분석 결과를 하나의 완전한 클래스 설명 문서로 통합해주세요."

        try:
            # LLM 호출
            logger.debug(_t("ai.llm_merge_prompt_size", prompt_size=len(merge_prompt)))
            raw_response = await self._call_llm_async(
                merge_prompt,
                stop_check_callback=stop_check_callback,
                logger=logger
            )

            merged_result = self._clean_response(raw_response)

            logger.info(_t("ai.llm_merge_chunk_complete", merged_size=len(merged_result)))

            return merged_result

        except Exception as e:
            logger.error(_t("ai.llm_merge_failed", error=str(e)))
            logger.warning(_t("ai.fallback_simple_merge"))

            # Fallback: 단순 병합
            return self._merge_chunk_results(chunk_results, class_name, logger)

    def _optimize_source_code(
        self,
        source_code: str,
        max_chars: int = 30000,
        logger: logging.Logger = logger
    ) -> tuple[str, str]:
        """
        소스 코드를 LLM Token 제한에 맞게 최적화합니다.

        전략:
        - Step 0 (Pass-through): 크기가 제한 이내이면 원본 그대로 반환
        - Step 1 (Body Stripping): 메서드 구현 로직(Body) 제거, 시그니처만 유지
        - Step 2 (Hard Truncation): 파일 중간 부분 생략 (Head 30% + Tail 20%)

        Args:
            source_code: 원본 소스 코드
            max_chars: 최대 글자 수 (기본값: 30,000자 ≈ 8,192 토큰)
            logger: 로거

        Returns:
            (최적화된 소스 코드, 적용된 최적화 레벨)
            최적화 레벨: "none", "body_stripped", "truncated"
        """
        original_len = len(source_code)

        # Step 0: Pass-through
        if original_len <= max_chars:
            logger.debug(_t("ai.source_code_size_ok", original_len=original_len, max_chars=max_chars))
            return source_code, "none"

        logger.info(_t("ai.source_code_exceeded", original_len=original_len, max_chars=max_chars))

        # Step 1: Body Stripping
        optimized = self._remove_method_bodies(source_code)
        optimized_len = len(optimized)

        logger.info(f"Step 1 (Body Stripping): {original_len} → {optimized_len} chars "
                   f"({(1 - optimized_len/original_len)*100:.1f}% 감소)")

        if optimized_len <= max_chars:
            logger.info(_t("ai.source_code_body_stripped", optimized_len=optimized_len, max_chars=max_chars))
            return optimized, "body_stripped"

        # Step 2: Hard Truncation
        truncated = self._truncate_center(optimized, max_chars)
        truncated_len = len(truncated)

        logger.info(f"Step 2 (Hard Truncation): {optimized_len} → {truncated_len} chars "
                   f"({(1 - truncated_len/original_len)*100:.1f}% 총 감소)")
        logger.warning(_t("ai.source_code_hard_truncated"))

        return truncated, "truncated"

    # ========== 비동기 메서드 (병렬 처리용) ==========

    async def _call_llm_async(
        self, 
        input_text: str, 
        max_retries: int = 3, 
        retry_delay: int = 10,
        stop_check_callback=None,
        logger: logging.Logger = logger
    ) -> str:
        """
        LLM을 비동기로 호출하여 결과를 반환합니다.
        재시도 대기 시간을 비동기로 처리하여 서버 중단/취소에 즉시 반응합니다.
        """
        retry_count = 0
        loop = asyncio.get_event_loop()

        while retry_count <= max_retries:
            # 취소 확인
            if stop_check_callback and stop_check_callback():
                logger.warning(_t("ai.llm_call_wait_cancelled"))
                raise RuntimeError("LLM call cancelled by user")

            try:
                # 동기 LLM 호출을 스레드 풀에서 실행 (단일 시도)
                return await loop.run_in_executor(
                    None,
                    lambda: self._call_llm_single_attempt(input_text, logger=logger)
                )

            except Exception as e:
                error_type = type(e).__name__
                error_msg = str(e)

                # 재시도 불가능 에러 체크
                if self._is_non_retryable_error(e, error_msg, logger=logger):
                    logger.warning(_t("ai.llm_api_failed_no_retry_async", error_msg=error_msg[:200]))
                    raise e
                
                is_retryable, api_wait_time = self._is_retryable_error(e, error_msg, logger=logger)
                
                # 디버깅 정보
                logger.debug(f"[AsyncRetry] Error: {error_type}, Retryable: {is_retryable}, RetryCount: {retry_count}/{max_retries}")
                
                if is_retryable or retry_count < max_retries:
                    if retry_count < max_retries:
                        retry_count += 1
                        backoff_time = retry_delay * (2 ** (retry_count - 1))
                        wait_time = max(backoff_time, api_wait_time + 1 if api_wait_time > 0 else 0)
                        
                        logger.warning(_t("ai.async_retry_waiting", retry_count=retry_count, max_retries=max_retries, wait_time=wait_time, api_wait_time=api_wait_time))
                        
                        # 비동기 대기 (Cancellation 가능)
                        # wait_time 동안 1.0초 간격으로 취소 확인
                        slept = 0.0
                        chunk = 1.0
                        while slept < wait_time:
                            if stop_check_callback:
                                is_cancelled = stop_check_callback()
                                # logger.debug(f"[AsyncRetry] Cancellation Check: {is_cancelled}") # 주석 처리됨 (너무 빈번)
                                if is_cancelled:
                                    logger.warning(_t("ai.async_retry_cancelled", slept=slept, wait_time=wait_time))
                                    raise RuntimeError("LLM call cancelled by user")
                            
                            to_sleep = min(chunk, wait_time - slept)
                            await asyncio.sleep(to_sleep)
                            slept += to_sleep
                        
                        continue
                    else:
                         logger.error(_t("ai.async_max_retries_exceeded", error_msg=error_msg[:200]))
                         raise e
                else:
                    logger.error(_t("ai.async_retry_condition_failed", error_msg=error_msg[:200]))
                    raise e

    async def analyze_class_async(
        self,
        source_code: str,
        class_name: str = "",
        max_tokens: int = None,
        use_llm_merge: bool = False,
        semaphore: asyncio.Semaphore = None,
        stop_check_callback=None,
        logger: logging.Logger = logger
    ) -> str:
        """
        Java Class 소스 코드를 비동기로 분석하여 AI description을 생성합니다.

        Args:
            source_code: Java 클래스 소스 코드
            class_name: 클래스명 (로깅용)
            max_tokens: 최대 토큰 수 (None일 경우 기본값 8192 사용)
            use_llm_merge: LLM 기반 병합 사용 여부 (기본값: False, 단순 병합)
            semaphore: 동시 요청 수 제한용 Semaphore (청크 병렬 분석 시 사용)
            stop_check_callback: 취소 확인 콜백
            logger: 로거

        Returns:
            AI 분석 결과 (Markdown 형식) 또는 빈 문자열
        """
        if not self.is_available():
            return ""

        try:
            # 프롬프트 가져오기
            prompt = get_prompt("class_doc")

            # max_tokens 기본값 처리
            if max_tokens is None:
                max_tokens = 8192

            # 글자 수 변환 (1 Token ≈ 3.5 Chars)
            max_total_chars = int(max_tokens * 3.5)

            # 프롬프트 + 마크다운 오버헤드 계산
            markdown_overhead = len('\n\n```java\n') + len('\n```')
            prompt_overhead = len(prompt) + markdown_overhead

            # 소스 코드에 사용 가능한 최대 크기
            source_code_max = max_total_chars - prompt_overhead

            logger.debug(_t("ai.token_limit_detailed", max_tokens=max_tokens, max_total_chars=max_total_chars, prompt_size=len(prompt), source_code_max=source_code_max))

            # Step 0: Pass-through (크기가 제한 이내이면 원본 그대로)
            if len(source_code) <= source_code_max:
                logger.debug(_t("ai.source_code_size_ok_async", length=len(source_code), max_chars=source_code_max))
                input_text = f"{prompt}\n\n```java\n{source_code}\n```"
                raw_response = await self._call_llm_async(input_text, stop_check_callback=stop_check_callback, logger=logger)
                ai_description = self._clean_response(raw_response)
                logger.debug(_t("ai.async_class_complete", class_name=class_name))
                return ai_description if ai_description else ""

            logger.info(_t("ai.source_code_exceeded_async", length=len(source_code), max_chars=source_code_max))

            # Step 1: Body Stripping
            optimized_code = self._remove_method_bodies(source_code)
            optimized_len = len(optimized_code)

            logger.info(f"Step 1 (Body Stripping): {len(source_code)} → {optimized_len} chars "
                       f"({(1 - optimized_len/len(source_code))*100:.1f}% 감소)")

            # Step 2: Chunking vs. Truncation 판단
            if optimized_len <= source_code_max:
                # 크기 OK → 단일 분석
                logger.debug(_t("ai.body_stripped_ok", optimized_len=optimized_len, max_chars=source_code_max))
                input_text = f"{prompt}\n\n```java\n{optimized_code}\n```"
                raw_response = await self._call_llm_async(input_text, stop_check_callback=stop_check_callback, logger=logger)
                ai_description = self._clean_response(raw_response)
                logger.debug(_t("ai.async_class_complete", class_name=class_name))
                return ai_description if ai_description else ""

            # Step 3: Chunking 적용
            logger.info(_t("ai.body_stripped_exceeded", optimized_len=optimized_len, max_chars=source_code_max))

            chunks = self._chunk_class_source(optimized_code, source_code_max, logger=logger)

            if len(chunks) == 1:
                # Chunking 실패 (단일 청크) → Hard Truncation
                logger.warning(_t("ai.chunking_failed_hard_truncation"))
                truncated = self._truncate_center(optimized_code, source_code_max)
                input_text = f"{prompt}\n\n```java\n{truncated}\n```"
                raw_response = await self._call_llm_async(input_text, stop_check_callback=stop_check_callback, logger=logger)
                ai_description = self._clean_response(raw_response)
                return ai_description if ai_description else ""

            # Step 4: 각 청크 병렬 분석
            logger.info(_t("ai.async_chunking_started", chunks_count=len(chunks)))

            # 청크별 분석 함수 (순서 유지를 위해 인덱스 포함)
            async def analyze_single_chunk(idx: int, chunk: str) -> tuple[int, str]:
                """단일 청크 분석 (병렬 처리용)"""
                # 취소 확인
                if stop_check_callback and stop_check_callback():
                    logger.warning(_t("ai.async_chunk_analysis_cancelled", current_chunk=idx + 1, total_chunks=len(chunks)))
                    raise RuntimeError("Chunked analysis cancelled by user")

                # Semaphore를 사용하여 동시 요청 수 제한
                if semaphore:
                    async with semaphore:
                        logger.debug(_t("ai.async_chunk_analysis_started", current_chunk=idx + 1, total_chunks=len(chunks)))
                        input_text = f"{prompt}\n\n```java\n{chunk}\n```"
                        raw_response = await self._call_llm_async(
                            input_text,
                            stop_check_callback=stop_check_callback,
                            logger=logger
                        )
                        chunk_result = self._clean_response(raw_response)
                        logger.info(_t("ai.async_chunk_analysis_complete", current_chunk=idx + 1, total_chunks=len(chunks), result_size=len(chunk_result)))
                        return idx, chunk_result
                else:
                    # Semaphore 없이 병렬 실행 (동시 요청 수 무제한)
                    logger.debug(_t("ai.async_chunk_analysis_started_simple", current_chunk=idx + 1, total_chunks=len(chunks)))
                    input_text = f"{prompt}\n\n```java\n{chunk}\n```"
                    raw_response = await self._call_llm_async(
                        input_text,
                        stop_check_callback=stop_check_callback,
                        logger=logger
                    )
                    chunk_result = self._clean_response(raw_response)
                    logger.info(_t("ai.async_chunk_analysis_complete_simple", current_chunk=idx + 1, total_chunks=len(chunks), result_size=len(chunk_result)))
                    return idx, chunk_result

            # 모든 청크를 병렬로 분석
            tasks = [analyze_single_chunk(i, chunk) for i, chunk in enumerate(chunks)]
            indexed_results = await asyncio.gather(*tasks)

            # 순서대로 정렬 (인덱스 기준)
            indexed_results.sort(key=lambda x: x[0])
            chunk_results = [result for _, result in indexed_results]

            logger.info(_t("ai.async_all_chunks_complete", chunks_count=len(chunk_results)))

            # Step 5: 결과 병합
            if use_llm_merge:
                # LLM 기반 병합 (고품질, 추가 LLM 호출)
                logger.info(_t("ai.async_llm_merge_used"))
                merged_result = await self._merge_chunk_results_with_llm(
                    chunk_results,
                    class_name,
                    stop_check_callback=stop_check_callback,
                    logger=logger
                )
            else:
                # 단순 병합 (기본값, 빠름)
                logger.info(_t("ai.async_simple_merge_used"))
                merged_result = self._merge_chunk_results(chunk_results, class_name, logger=logger)

            merge_method = "LLM 병합" if use_llm_merge else "단순 병합"
            logger.info(_t("ai.class_analysis_chunking_final", class_name=class_name, merge_method=merge_method, chunks_count=len(chunks), result_size=len(merged_result)))

            return merged_result if merged_result else ""

        except Exception as e:
            # 상세한 오류 로그 기록
            error_type = type(e).__name__
            error_msg = str(e)
            logger.warning(_t("ai.async_class_analysis_failed", class_name=class_name, error_type=error_type, error_msg=error_msg))

            # 디버그 레벨로 전체 traceback 기록
            logger.debug(_t("ai.class_analysis_error_async", class_name=class_name) + "
" + traceback.format_exc())
            logger.debug(_t("ai.class_analysis_error_detailed", class_name=class_name) + "
" + traceback.format_exc())
            return ""

    async def analyze_method_async(
        self,
        source_code: str,
        method_name: str = "",
        class_name: str = "",
        stop_check_callback=None,
        logger: logging.Logger = logger
    ) -> str:
        """
        Java Method 소스 코드를 비동기로 분석하여 AI description을 생성합니다.

        Args:
            source_code: Java 메서드 소스 코드
            method_name: 메서드명 (로깅용)
            class_name: 클래스명 (로깅용, 선택사항)

        Returns:
            AI 분석 결과 (Markdown 형식) 또는 빈 문자열
        """
        if not self.is_available():
            return ""

        try:
            # 프롬프트 가져오기
            prompt = get_prompt("method_doc")

            # 프롬프트 + 마크다운 오버헤드 계산
            markdown_overhead = len('\n\n```java\n') + len('\n```')
            prompt_overhead = len(prompt) + markdown_overhead

            # 전체 입력 제한 (30,000자 ≈ 8,192 토큰)
            max_total_chars = 30000

            # 소스 코드에 사용 가능한 최대 크기
            source_code_max = max_total_chars - prompt_overhead

            # 메서드 소스 코드 최적화 (필요시)
            if len(source_code) > source_code_max:
                optimized_code, optimization_level = self._optimize_source_code(
                    source_code,
                    max_chars=source_code_max,
                    logger=logger
                )
                identifier = f"{class_name}.{method_name}" if class_name else method_name
                logger.info(_t("ai.method_source_optimized_detailed", identifier=identifier, original_size=len(source_code), optimized_size=optimized_len))
                           f"{len(source_code)} → {len(optimized_code)} chars, "
                           f"level={optimization_level}")
            else:
                optimized_code = source_code

            input_text = f"{prompt}\n\n```java\n{optimized_code}\n```"

            # LLM 비동기 호출
            raw_response = await self._call_llm_async(input_text, stop_check_callback=stop_check_callback, logger=logger)

            # 응답 정제 (think 태그, markdown 블록 제거)
            ai_description = self._clean_response(raw_response)

            # 로깅용 식별자 생성
            identifier = f"{class_name}.{method_name}" if class_name else method_name
            logger.debug(_t("ai.async_method_analysis_complete", identifier=identifier))
            return ai_description if ai_description else ""

        except Exception as e:
            # 상세한 오류 로그 기록
            error_type = type(e).__name__
            error_msg = str(e)
            identifier = f"{class_name}.{method_name}" if class_name else method_name
            logger.warning(_t("ai.async_method_analysis_failed", identifier=identifier, error_type=error_type, error_msg=error_msg))

            # 디버그 레벨로 전체 traceback 기록
            import traceback
            logger.debug(_t("ai.method_analysis_error_detailed", identifier=identifier) + "
" + traceback.format_exc())
            return ""
            logger.debug(_t("ai.method_analysis_error_async", identifier=identifier) + "
" + traceback.format_exc())
    async def analyze_sql_async(
        self,
        sql_statement: str,
        sql_id: str = "",
        stop_check_callback=None,
        logger: logging.Logger = logger
    ) -> str:
        """
        SQL 문을 비동기로 분석하여 AI description을 생성합니다.

        Args:
            sql_statement: SQL 문
            sql_id: SQL ID (로깅용)

        Returns:
            AI 분석 결과 (Markdown 형식) 또는 빈 문자열
        """
        if not self.is_available():
            return ""

        try:
            # 프롬프트 가져오기
            prompt = get_prompt("sql_doc")

            # 프롬프트 + 마크다운 오버헤드 계산
            markdown_overhead = len('\n\n```sql\n') + len('\n```')
            prompt_overhead = len(prompt) + markdown_overhead

            # 전체 입력 제한 (30,000자 ≈ 8,192 토큰)
            max_total_chars = 30000

            # SQL에 사용 가능한 최대 크기
            sql_max = max_total_chars - prompt_overhead

            # SQL 최적화 (필요시 - 매우 긴 SQL의 경우)
            if len(sql_statement) > sql_max:
                # SQL은 truncate만 적용 (Body Stripping은 의미 없음)
                optimized_sql = sql_statement[:sql_max] + "\n/* ... SQL truncated ... */"
                logger.info(_t("ai.sql_truncation_applied", sql_id=sql_id, original_size=len(original_sql), truncated_size=len(truncated_sql)))
                           f"{len(sql_statement)} → {len(optimized_sql)} chars")
            else:
                optimized_sql = sql_statement

            input_text = f"{prompt}\n\n```sql\n{optimized_sql}\n```"

            # LLM 비동기 호출
            raw_response = await self._call_llm_async(input_text, stop_check_callback=stop_check_callback, logger=logger)

            # 응답 정제 (think 태그, markdown 블록 제거)
            ai_description = self._clean_response(raw_response)

            logger.debug(_t("ai.async_sql_analysis_complete", sql_id=sql_id))
            return ai_description if ai_description else ""

        except Exception as e:
            # 상세한 오류 로그 기록
            error_type = type(e).__name__
            error_msg = str(e)
            logger.warning(_t("ai.async_sql_analysis_failed", sql_id=sql_id, error_type=error_type, error_msg=error_msg))

            # 디버그 레벨로 전체 traceback 기록
            import traceback
            logger.debug(_t("ai.sql_analysis_error_detailed", sql_id=sql_id) + "
" + traceback.format_exc())
            return ""
            logger.debug(_t("ai.sql_analysis_error_async", sql_id=sql_id) + "
" + traceback.format_exc())
    async def analyze_method_batch_async(
        self, 
        method_items: list,
        stop_check_callback=None,
        logger: logging.Logger = logger
    ) -> dict[str, str]:
        """
        여러 메서드를 배치로 비동기 분석하여 AI description을 생성합니다.

        Args:
            method_items: 메서드 정보 리스트 [{"method_id": "Class.Method", "class_name": "...", "method_name": "...", "source": "..."}, ...]

        Returns:
            {method_id: ai_description} 딕셔너리
        """
        if not self.is_available():
            return {}

        if not method_items:
            return {}

        try:
            prompt = get_prompt("method_batch_doc")

            # 배치 입력 텍스트 생성
            method_sections = []
            for idx, item in enumerate(method_items, 1):
                method_id = item.get("method_id", f"unknown_{idx}")
                class_name = item.get("class_name", "Unknown")
                method_name = item.get("method_name", "Unknown")
                source = item.get("source", "")
                method_sections.append(
                    f"**Method #{idx}** (Class: {class_name}, Method: {method_name})\n```java\n{source}\n```\n**END #{idx}**\n"
                )

            input_text = f"{prompt}\n\n" + "\n".join(method_sections)

            # LLM 비동기 호출
            raw_response = await self._call_llm_async(input_text, stop_check_callback=stop_check_callback, logger=logger)

            # 응답 정제 (think 태그, markdown 블록 제거)
            cleaned_response = self._clean_response(raw_response)

            # 응답 파싱: ---Method#N---...---END#N--- 형식
            results = self._parse_batch_method_response(cleaned_response, method_items)

            logger.debug(_t("ai.batch_method_analysis_complete", count=len(results)))
            return results

        except Exception as e:
            # 상세한 오류 로그 기록
            error_type = type(e).__name__
            error_msg = str(e)
            logger.warning(_t("ai.batch_method_analysis_failed", error_type=error_type, error_msg=error_msg))

            # 디버그 레벨로 전체 traceback 기록
            import traceback
            logger.debug(_t("ai.batch_method_error_detailed") + "
" + traceback.format_exc())
            return {}
            logger.debug(_t("ai.batch_method_analysis_error") + "
" + traceback.format_exc())
    async def analyze_sql_batch_async(
        self, 
        sql_items: list,
        stop_check_callback=None,
        logger: logging.Logger = logger
    ) -> dict[str, str]:
        """
        여러 SQL 문을 배치로 비동기 분석하여 AI description을 생성합니다.

        Args:
            sql_items: SQL 정보 리스트 [{"sql_id": "...", "sql_content": "..."}, ...]

        Returns:
            {sql_id: ai_description} 딕셔너리
        """
        if not self.is_available():
            return {}

        if not sql_items:
            return {}

        try:
            prompt = get_prompt("sql_batch_doc")

            # 배치 입력 텍스트 생성
            sql_sections = []
            for idx, item in enumerate(sql_items, 1):
                sql_id = item.get("sql_id", f"unknown_{idx}")
                sql_content = item.get("sql_content", "")
                sql_sections.append(
                    f"**SQL #{idx}** (ID: {sql_id})\n```sql\n{sql_content}\n```\n**END #{idx}**\n"
                )

            input_text = f"{prompt}\n\n" + "\n".join(sql_sections)

            # LLM 비동기 호출
            raw_response = await self._call_llm_async(input_text, stop_check_callback=stop_check_callback, logger=logger)

            # 응답 정제 (think 태그, markdown 블록 제거)
            cleaned_response = self._clean_response(raw_response)

            # 응답 파싱: ---SQL#N---...---END#N--- 형식
            results = self._parse_batch_sql_response(cleaned_response, sql_items)

            logger.debug(_t("ai.batch_sql_analysis_complete", count=len(results)))
            return results

        except Exception as e:
            # 상세한 오류 로그 기록
            error_type = type(e).__name__
            error_msg = str(e)
            logger.warning(_t("ai.batch_sql_analysis_failed", error_type=error_type, error_msg=error_msg))

            # 디버그 레벨로 전체 traceback 기록
            import traceback
            logger.debug(_t("ai.batch_sql_error_detailed") + "
" + traceback.format_exc())
            return {}
            logger.debug(_t("ai.batch_sql_analysis_error") + "
" + traceback.format_exc())
    def _parse_batch_sql_response(self, response: str, sql_items: list[dict]) -> dict[str, str]:
        """
        배치 SQL 분석 응답을 파싱합니다.

        Args:
            response: LLM 응답 텍스트
            sql_items: 원본 SQL 정보 리스트

        Returns:
            {sql_id: ai_description} 딕셔너리
        """
        results = {}

        # 패턴 1: ---SQL#N---...---END#N--- (개선된 형식, 번호 포함)
        pattern1 = r'---SQL#(\d+)---(.*?)---END#\1---'
        matches1 = re.findall(pattern1, response, flags=re.DOTALL)

        logger.debug(_t("ai.parse_pattern1_matches", count=len(matches1)))

        # 패턴 1로 매칭된 SQL 번호 기록
        matched_nums = set()
        for sql_num_str, description in matches1:
            sql_num = int(sql_num_str)
            matched_nums.add(sql_num)
            if 1 <= sql_num <= len(sql_items):
                sql_id = sql_items[sql_num - 1].get("sql_id", "")
                if sql_id:
                    results[sql_id] = description.strip()
                    logger.debug(_t("ai.parse_sql_extracted", sql_num=sql_num, sql_id=sql_id, length=len(description)))

        # 매칭되지 않은 SQL 처리 (END 태그 없는 경우)
        if len(matches1) < len(sql_items):
            logger.debug(_t("ai.parse_pattern2_start", remaining=len(sql_items) - len(matches1)))
            # 패턴 2: ---SQL#N---부터 다음 ---SQL# 또는 문자열 끝까지
            pattern2 = r'---SQL#(\d+)---(.*?)(?=---SQL#\d+---|$)'
            matches2 = re.findall(pattern2, response, flags=re.DOTALL)

            for sql_num_str, description in matches2:
                sql_num = int(sql_num_str)
                # 패턴 1에서 이미 처리되지 않은 것만 처리
                if sql_num not in matched_nums and 1 <= sql_num <= len(sql_items):
                    sql_id = sql_items[sql_num - 1].get("sql_id", "")
                    if sql_id:
                        # ---END#N--- 태그 제거 (있을 경우)
                        desc_clean = re.sub(r'---END#?\d*---', '', description).strip()
                        results[sql_id] = desc_clean
                        logger.debug(_t("ai.parse_sql_extracted_flexible", sql_num=sql_num, sql_id=sql_id, length=len(desc_clean)))

        # 이전 fallback 패턴들은 제거
        if False:
            # 패턴 2: ---SQL#N---...---END--- (이전 형식, 번호 없음)
            pattern2 = r'---SQL#(\d+)---(.*?)---END---'
            matches = re.findall(pattern2, response, flags=re.DOTALL)

            if matches:
                logger.debug(_t("ai.parse_pattern2_matches", count=len(matches)))
                for sql_num_str, description in matches:
                    sql_num = int(sql_num_str)
                    if 1 <= sql_num <= len(sql_items):
                        sql_id = sql_items[sql_num - 1].get("sql_id", "")
                        if sql_id:
                            results[sql_id] = description.strip()
            else:
                # 패턴 3: ---SQL#N--- 또는 ---SQLN--- (# 기호 선택적, END 태그 없음)
                # 다음 SQL 시작까지 또는 문자열 끝까지를 하나의 SQL로 간주
                pattern3 = r'---SQL#?(\d+)---(.*?)(?=---SQL#?\d+---|$)'
                matches = re.findall(pattern3, response, flags=re.DOTALL)

                if matches:
                    logger.debug(_t("ai.parse_pattern3_matches", count=len(matches)))
                    for sql_num_str, description in matches:
                        sql_num = int(sql_num_str)
                        if 1 <= sql_num <= len(sql_items):
                            sql_id = sql_items[sql_num - 1].get("sql_id", "")
                            if sql_id:
                                # ---END#N--- 또는 ---END--- 태그 제거 (있을 경우)
                                desc_clean = re.sub(r'---END#?\d*---', '', description).strip()
                                results[sql_id] = desc_clean

        # 결과 검증
        if len(results) < len(sql_items):
            logger.warning(
                f"SQL 배치 분석 응답 파싱 불완전: "
                f"{len(results)}/{len(sql_items)}개만 파싱됨"
            )
            logger.debug(_t("ai.response_preview_detailed", length=1000) + "
" + response[:1000])

            logger.debug(_t("ai.response_preview_sql", length=1000) + "
" + response[:1000])

    def _parse_batch_method_response(self, response: str, method_items: list[dict]) -> dict[str, str]:
        """
        배치 Method 분석 응답을 파싱합니다.

        Args:
            response: LLM 응답 텍스트
            method_items: 원본 Method 정보 리스트

        Returns:
            {method_id: ai_description} 딕셔너리
        """
        results = {}

        # 패턴 1: ---Method#N---...---END#N--- (개선된 형식, 번호 포함)
        pattern1 = r'---Method#(\d+)---(.*?)---END#\1---'
        matches1 = re.findall(pattern1, response, flags=re.DOTALL)

        logger.debug(_t("ai.parse_pattern1_matches", count=len(matches1)))

        # 패턴 1로 매칭된 Method 번호 기록
        matched_nums = set()
        for method_num_str, description in matches1:
            method_num = int(method_num_str)
            matched_nums.add(method_num)
            if 1 <= method_num <= len(method_items):
                method_id = method_items[method_num - 1].get("method_id", "")
                if method_id:
                    results[method_id] = description.strip()
                    logger.debug(_t("ai.parse_method_extracted", method_num=method_num, method_id=method_id, length=len(description)))

        # 매칭되지 않은 Method 처리 (END 태그 없는 경우)
        if len(matches1) < len(method_items):
            logger.debug(_t("ai.parse_pattern2_start", remaining=len(method_items) - len(matches1)))
            # 패턴 2: ---Method#N---부터 다음 ---Method# 또는 문자열 끝까지
            pattern2 = r'---Method#(\d+)---(.*?)(?=---Method#\d+---|$)'
            matches2 = re.findall(pattern2, response, flags=re.DOTALL)

            for method_num_str, description in matches2:
                method_num = int(method_num_str)
                # 패턴 1에서 이미 처리되지 않은 것만 처리
                if method_num not in matched_nums and 1 <= method_num <= len(method_items):
                    method_id = method_items[method_num - 1].get("method_id", "")
                    if method_id:
                        # ---END#N--- 태그 제거 (있을 경우)
                        desc_clean = re.sub(r'---END#?\d*---', '', description).strip()
                        results[method_id] = desc_clean
                        logger.debug(_t("ai.parse_method_extracted_flexible", method_num=method_num, method_id=method_id, length=len(desc_clean)))

        # 결과 검증
        if len(results) < len(method_items):
            logger.warning(
                f"Method 배치 분석 응답 파싱 불완전: "
                f"{len(results)}/{len(method_items)}개만 파싱됨"
            )
            logger.debug(_t("ai.response_preview_method_detailed", length=1000) + "
" + response[:1000])

            logger.debug(_t("ai.response_preview_method", length=1000) + "
" + response[:1000])

    def analyze_class(self, source_code: str, class_name: str = "") -> str:
        """
        Analyze a single Java class.
        
        Args:
            source_code: Java class source code
            class_name: Name of the class (for logging)
            
        Returns:
            Analysis result (markdown)
        """
        start_time = time.time()
        
        # 프롬프트 가져오기
        try:
            prompt_template = get_prompt("class_doc")
        except Exception:
            # Fallback if prompt service fails or key missing
            from csa.aiwork.default_prompts import DEFAULT_PROMPTS
            prompt_template = DEFAULT_PROMPTS.get("class_doc", "")
            
        if not prompt_template:
            logger.error("Class analysis prompt not found")
            return ""

        # 소스 코드 길이 제한 (약 30000자 - 토큰 제한 고려)
        truncated_source = self._truncate_center(source_code, 30000)
        
        # 프롬프트 구성
        full_prompt = f"{prompt_template}\n\n```java\n{truncated_source}\n```"
        
        try:
            logger.info(f"AI Class Analysis Start: {class_name} ({len(source_code)} chars)")
            response = self._call_llm(full_prompt)
            clean_response = self._clean_response(response)
            
            elapsed = time.time() - start_time
            logger.info(f"AI Class Analysis Completed: {class_name} ({elapsed:.2f}s)")
            
            return clean_response
            
        except Exception as e:
            logger.error(f"AI Class Analysis Failed: {class_name} - {e}")
            raise e

    def analyze_method(self, source_code: str, method_name: str = "", class_name: str = "") -> str:
        """
        Analyze a single Java method.
        
        Args:
            source_code: Java method source code
            method_name: Name of the method
            class_name: Name of the class
            
        Returns:
            Analysis result (markdown)
        """
        start_time = time.time()
        
        # 프롬프트 가져오기
        try:
            prompt_template = get_prompt("method_doc")
        except Exception:
            from csa.aiwork.default_prompts import DEFAULT_PROMPTS
            prompt_template = DEFAULT_PROMPTS.get("method_doc", "")

        if not prompt_template:
            logger.error("Method analysis prompt not found")
            return ""
            
        # 프롬프트 구성
        full_prompt = f"{prompt_template}\n\n```java\n{source_code}\n```"
        
        full_name = f"{class_name}.{method_name}" if class_name else method_name
        
        try:
            logger.debug(f"AI Method Analysis Start: {full_name}")
            response = self._call_llm(full_prompt)
            clean_response = self._clean_response(response)
            
            elapsed = time.time() - start_time
            logger.debug(f"AI Method Analysis Completed: {full_name} ({elapsed:.2f}s)")
            
            return clean_response
            
        except Exception as e:
            logger.error(f"AI Method Analysis Failed: {full_name} - {e}")
            raise e


# 전역 AI Analyzer 인스턴스
_ai_analyzer = None


def get_ai_analyzer() -> AIAnalyzer:
    """
    전역 AI Analyzer 인스턴스를 반환합니다.

    Returns:
        AIAnalyzer 인스턴스
    """
    global _ai_analyzer
    if _ai_analyzer is None:
        _ai_analyzer = AIAnalyzer()
    return _ai_analyzer
