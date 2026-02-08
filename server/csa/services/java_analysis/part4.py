
class AdaptiveBatchSizer:
    """
    동적 배치 크기 조정기

    Neo4j 저장 성능에 따라 배치 크기를 자동으로 조정하여
    최적의 처리 속도를 유지합니다.
    """

    def __init__(self, initial_size: int = 50, min_size: int = 20, max_size: int = 200):
        """
        Args:
            initial_size: 초기 배치 크기
            min_size: 최소 배치 크기
            max_size: 최대 배치 크기
        """
        self.current_size = initial_size
        self.min_size = min_size
        self.max_size = max_size
        self.save_times = []  # 최근 저장 시간 기록
        self.history_limit = 5  # 최근 5회 저장 시간 추적

    def adjust(self, save_time: float, batch_size: int) -> int:
        """
        저장 시간 기반 배치 크기 조정

        Args:
            save_time: 배치 저장에 소요된 시간(초)
            batch_size: 현재 배치 크기

        Returns:
            int: 조정된 배치 크기
        """
        # 처리율 계산 (items/sec)
        throughput = batch_size / save_time if save_time > 0 else 0

        # 저장 시간 기록
        self.save_times.append(save_time)
        if len(self.save_times) > self.history_limit:
            self.save_times.pop(0)

        # 평균 저장 시간 계산
        avg_save_time = sum(self.save_times) / len(self.save_times)

        # 조정 전략
        if avg_save_time < 5.0:
            # 빠름: 배치 크기 증가 (10% 증가)
            self.current_size = min(int(self.current_size * 1.1), self.max_size)
        elif avg_save_time > 20.0:
            # 느림: 배치 크기 감소 (20% 감소)
            self.current_size = max(int(self.current_size * 0.8), self.min_size)
        # 5~20초 사이면 현재 크기 유지

        return int(self.current_size)

    def get_current_size(self) -> int:
        """현재 배치 크기 반환"""
        return int(self.current_size)


def estimate_file_complexity(file_path: str) -> int:
    """
    파일 복잡도 추정 (빠른 휴리스틱 분석)

    복잡도가 높을수록 파싱 시간이 오래 걸리므로,
    큰 파일을 먼저 워커에 배정하여 워크로드 불균형을 방지합니다.

    Args:
        file_path: Java 파일 경로

    Returns:
        int: 복잡도 점수 (높을수록 복잡)
    """
    try:
        with open(file_path, 'r', encoding='utf-8') as f:
            content = f.read()

        # 라인 수
        lines = content.count('\n')

        # 필드 수 (private, public, protected 선언)
        fields = content.count('private ') + content.count('public ') + content.count('protected ')

        # 메서드 수 (메서드 선언 패턴)
        methods = content.count('public ') + content.count('private ') + content.count('protected ')

        # Inner class 수
        inner_classes = content.count('static class ') + content.count('class ')

        # 어노테이션 수 (@로 시작)
        annotations = content.count('@')

        # 복잡도 점수 계산 (가중치 적용)
        complexity = (
            lines * 1 +           # 라인당 1점
            fields * 2 +          # 필드당 2점
            methods * 5 +         # 메서드당 5점
            inner_classes * 10 +  # Inner class당 10점
            annotations * 1       # 어노테이션당 1점
        )

        return complexity
    except Exception:
        # 파일 읽기 실패 시 기본값 반환 (파일 크기 기반)
        try:
            return os.path.getsize(file_path) // 10
        except:
            return 0


def is_dto_class(class_name: str, file_path: str = None) -> bool:
    """
    DTO 클래스 여부 판별

    다음 조건 중 하나라도 만족하면 DTO로 판단:
    1. 클래스명이 DTO/DODT/DIDT/VO/Entity/Grid 등으로 끝남
    2. 파일 분석 시 필드만 많고 비즈니스 로직 메서드가 거의 없음

    Args:
        class_name: 클래스명
        file_path: 파일 경로 (선택사항, 더 정확한 판별을 위해)

    Returns:
        bool: DTO 클래스 여부
    """
    # 1. 클래스명 패턴 체크
    dto_suffixes = ['DTO', 'DODT', 'DIDT', 'ODT', 'IDT', 'VO', 'Entity', 'Grid', '_DTO', '_DODT', '_DIDT']
    if any(class_name.endswith(suffix) for suffix in dto_suffixes):
        return True

    # 2. 파일 내용 기반 체크 (선택적)
    if file_path and os.path.exists(file_path):
        try:
            with open(file_path, 'r', encoding='utf-8') as f:
                content = f.read()

            # 필드 수 카운트 (private, protected 필드)
            field_count = content.count('private ') + content.count('protected ')

            # 비즈니스 로직 메서드 수 (getter/setter 제외)
            # public/private/protected 메서드에서 get/set으로 시작하지 않는 것들
            total_methods = content.count('public ') + content.count('private ') + content.count('protected ')
            getter_setter = content.count('public get') + content.count('public set') + \
                           content.count('private get') + content.count('private set')
            business_methods = max(0, (total_methods - field_count - getter_setter) // 2)

            # DTO 판별: 필드 20개 이상 & 비즈니스 메서드 3개 이하
            if field_count >= 20 and business_methods <= 3:
                return True
        except:
            pass

    return False


def _parse_single_file_wrapper(file_path: str, project_name: str, ai_options: dict = None, use_ai: bool = None) -> tuple:
    """
    병렬 처리용 파싱 래퍼 함수 (Neo4j 연결 없이 파싱만 수행)

    Args:
        file_path: Java 파일 경로
        project_name: 프로젝트명

    Returns:
        tuple: (file_path, package_node, class_node, inner_classes, package_name) 또는 (file_path, None, None, [], None) on error
    """
    logger = get_logger(__name__)
    start_time = time.time()
    file_name = os.path.basename(file_path)

    try:
        package_node, class_node, inner_classes, package_name = parse_single_java_file(
            file_path, project_name, None, ai_options, use_ai=use_ai  # graph_db=None for parsing only
        )

        # 처리 시간 계산 및 로깅
        elapsed = time.time() - start_time
        if elapsed >= 5.0:
            logger.warning(_t("java_analysis.slow_file", elapsed=elapsed, file_name=file_name))

        return (file_path, package_node, class_node, inner_classes, package_name)
    except Exception as e:
        # 예외 발생 시 None 반환 (메인 스레드에서 로깅)
        elapsed = time.time() - start_time
        if elapsed >= 5.0:
            logger.warning(_t("java_analysis.slow_file_failed", elapsed=elapsed, file_name=file_name))
        return (file_path, None, None, [], str(e))


def parse_java_project_streaming(
    directory: str,
    graph_db: GraphDB,
    project_name: str,
    parallel_workers: int = 8,
    ai_options: dict = None,
    source_options: dict = None,
    use_ai_analysis: bool = False,
    stop_check_callback: callable = None,
) -> dict:
    """
    스트리밍 방식 Java 프로젝트 파싱

    파일을 하나씩 파싱하고 즉시 Neo4j에 저장한 후 메모리에서 제거합니다.
    메모리 사용량을 최소화하여 대규모 프로젝트 분석이 가능합니다.

    Args:
        directory: Java 소스 디렉토리 경로
        graph_db: Neo4j GraphDB 인스턴스
        project_name: 프로젝트명

    Returns:
        dict: 분석 통계
            {
                'total_files': int,
                'processed_files': int,
                'packages': int,
                'classes': int,
                'beans': int,
                'endpoints': int,
                'jpa_entities': int,
                'jpa_repositories': int,
                'jpa_queries': int,
                'test_classes': int,
                'mybatis_mappers': int,
                'sql_statements': int,
                'config_files': int,
            }
    """
    from csa.services.analysis.neo4j_writer import add_single_class_objects_streaming

    logger = get_logger(__name__)

    logger.info(_t("java_analysis.start_streaming_analysis", directory=directory))
    logger.info(_t("java_analysis.project_name", name=project_name))

    packages_saved = set()
    stats = {
        'total_files': 0,
        'processed_files': 0,
        'skipped_files': 0,
        'packages': 0,
        'classes': 0,
        'beans': 0,
        'endpoints': 0,
        'jpa_entities': 0,
        'jpa_repositories': 0,
        'jpa_queries': 0,
        'test_classes': 0,
        'mybatis_mappers': 0,
        'sql_statements': 0,
        'config_files': 0,
    }

    # 진행 상황 추적 (스레드 안전)
    processed_classes = 0
    last_logged_percent = 0
    last_logged_time = time.time()  # 마지막 로그 출력 시간
    progress_interval = 5.0  # 5초마다 로그 출력
    failed_files = 0
    timeout_files = 0
    progress_lock = Lock()

    # 1회 스캔: 모든 .java 파일 경로 수집
    exclude_patterns = []
    use_csaignore_file = True

    if source_options and 'exclude_patterns' in source_options:
        # UI/API에서 명시적으로 exclude_patterns가 전달된 경우
        # .csaignore 파일을 무시하고 전달된 패턴만 적용
        raw_patterns = source_options['exclude_patterns']
        
        if raw_patterns is not None:
            use_csaignore_file = False
            if isinstance(raw_patterns, str):
                exclude_patterns = [p.strip() for p in raw_patterns.splitlines() if p.strip()]
            elif isinstance(raw_patterns, list):
                exclude_patterns = raw_patterns
            else:
                exclude_patterns = []

    logger.info(_t("java_analysis.collecting_files"))
    java_files = _collect_java_files_with_csaignore(directory, exclude_patterns=exclude_patterns, use_csaignore_file=use_csaignore_file)

    total_files = len(java_files)
    stats['total_files'] = total_files
    logger.info(_t("java_analysis.java_files_found", count=total_files))

    # 파일 복잡도 기반 정렬 (복잡한 파일을 먼저 처리 - 워크로드 균형 개선)
    logger.info(_t("java_analysis.analyzing_complexity"))
    complexity_start = time.time()
    file_complexities = [(f, estimate_file_complexity(f)) for f in java_files]

    # 복잡도 임계값 설정 (환경 변수로 제어 가능, 기본값: 50000)
    # 복잡도 임계값 설정 (source_options > 환경 변수 > 기본값 50000)
    default_complexity = 50000
    if source_options and 'java_complexity_threshold' in source_options:
        complexity_threshold = source_options['java_complexity_threshold']
    else:
        complexity_threshold = int(os.getenv("JAVA_COMPLEXITY_THRESHOLD", str(default_complexity)))

    # 극단적으로 복잡한 파일 필터링
    skipped_files = []
    filtered_complexities = []
    for file_path, complexity in file_complexities:
        if complexity > complexity_threshold:
            skipped_files.append((file_path, complexity))
        else:
            filtered_complexities.append((file_path, complexity))

    # 건너뛴 파일 로깅
    if skipped_files:
        logger.warning(_t("java_analysis.complexity_skipped_files", threshold=complexity_threshold, count=len(skipped_files)))
        for file_path, complexity in skipped_files:
            file_name = os.path.basename(file_path)
            logger.warning(_t("java_analysis.complexity_skipped_file_detail", name=file_name, complexity=complexity))

    # 복잡도 높은 순으로 정렬 (큰 작업부터 워커에 배정)
    filtered_complexities.sort(key=lambda x: x[1], reverse=True)
    java_files = [f for f, _ in filtered_complexities]

    # 통계 업데이트
    total_files = len(java_files)
    stats['total_files'] = total_files
    stats['skipped_files'] = len(skipped_files)

    complexity_elapsed = time.time() - complexity_start
    logger.info(_t("java_analysis.complexity_analysis_complete", elapsed=complexity_elapsed))
    logger.info(_t("java_analysis.analysis_target", total=total_files, skipped=len(skipped_files)))

    # 상위 10개 복잡한 파일 로깅 (필터링 후)
    top_complex_files = filtered_complexities[:10]
    logger.info(_t("java_analysis.top_complex_files"))
    for i, (file_path, complexity) in enumerate(top_complex_files, 1):
        file_name = os.path.basename(file_path)
        logger.info(_t("java_analysis.top_complex_file", index=i, name=file_name, complexity=complexity))

    # 환경 변수에서 병렬 워커 수 가져오기 (CPU 코어 수 기반 자동 설정)
    # 기본값: max(4, CPU 코어수 - 2) - 최소 4개, 최대 (코어수-2)개
    cpu_count = multiprocessing.cpu_count()
    default_workers = max(4, cpu_count - 2)
    environment_workers = int(os.getenv("JAVA_PARSE_WORKERS", str(default_workers)))
    if source_options and 'java_parse_workers' in source_options:
        parallel_workers = source_options['java_parse_workers']
    else:
        parallel_workers = environment_workers
    initial_batch_size = int(os.getenv("NEO4J_BATCH_SIZE", "50"))  # 초기 배치 크기

    # 배치 크기 설정 (환경 변수 또는 기본값)
    # 메모리 오류 방지를 위해 기본 최대값을 200 -> 50으로 보수적으로 조정
    max_batch_size = int(os.getenv("NEO4J_BATCH_MAX_SIZE", "50"))
    
    # 동적 배치 크기 조정기 초기화
    batch_sizer = AdaptiveBatchSizer(
        initial_size=initial_batch_size,
        min_size=10,
        max_size=max_batch_size
    )

    logger.info(_t("java_analysis.parallel_workers_info", workers=parallel_workers, cpu_count=cpu_count, default_workers=default_workers, batch_size=initial_batch_size))

    # 0. Package 사전 생성 (성능 최적화)
    logger.info(_t("java_analysis.collecting_packages"))
    package_names = set()
    package_pattern = re.compile(r'^\s*package\s+([\w.]+)\s*;', re.MULTILINE)

    for file_path in java_files:
        try:
            with open(file_path, 'r', encoding='utf-8') as f:
                content = f.read(500)  # 첫 500자만 읽기 (package는 파일 상단에 위치)
                match = package_pattern.search(content)
                if match:
                    package_names.add(match.group(1))
        except Exception as e:
            logger.debug(_t("java_analysis.package_extraction_failed", file_path=file_path, error=str(e)))
            continue

    # 모든 Package를 한 번에 생성 (배치 처리)
    if package_names:
        logger.info(_t("java_analysis.packages_found_batch_creating", count=len(package_names)))
        package_start = time.time()
        package_nodes = [Package(name=pkg_name) for pkg_name in package_names]
        graph_db.add_packages_batch(package_nodes, project_name)
        packages_saved.update(package_names)
        stats['packages'] = len(package_names)
        package_elapsed = time.time() - package_start
        logger.info(_t("java_analysis.package_batch_complete", elapsed=package_elapsed))

    # 1. 병렬 파일 파싱 + 배치 Neo4j 저장
    logger.info(_t("java_analysis.parallel_parsing_start"))
    parse_start_time = time.time()

    # 파싱된 결과를 임시 저장할 버퍼
    parsed_buffer = []
    last_batch_save_time = time.time()  # 마지막 배치 저장 시간
    batch_save_interval = 10.0  # 10초마다 배치 저장 (버퍼에 데이터가 있을 경우)

    # 타임아웃 설정 (환경 변수로 제어 가능, 기본값: 60초)
    # 타임아웃 설정 (source_options > 환경 변수 > 기본값 60초)
    default_timeout = 120.0
    if source_options and 'java_file_parse_timeout' in source_options:
        file_timeout = source_options['java_file_parse_timeout']
    else:
        file_timeout = float(os.getenv("JAVA_FILE_PARSE_TIMEOUT", "60.0"))
    logger.info(_t("java_analysis.parse_timeout_setting", timeout=file_timeout))
    
    # AI 옵션 필터링
    effective_ai_options = ai_options if use_ai_analysis else None

    with ThreadPoolExecutor(max_workers=parallel_workers) as executor:
        # 모든 파일을 병렬로 파싱 제출
        future_to_file = {
            executor.submit(_parse_single_file_wrapper, file_path, project_name, effective_ai_options, use_ai=use_ai_analysis): file_path
            for file_path in java_files
        }

        # 완료된 순서대로 처리 (타임아웃 없음 - 개별 파일 타임아웃만 적용)
        try:
            for future in as_completed(future_to_file):
                if stop_check_callback:
                    stop_check_callback()

                file_path = future_to_file[future]
                try:
                    # 파싱 결과 획득 (개별 파일 타임아웃 적용)
                    try:
                        _, package_node, class_node, inner_classes, package_name = future.result(timeout=file_timeout)
                    except TimeoutError:
                        # 파일명만 추출 (경로 제거)
                        file_name = os.path.basename(file_path)
                        with progress_lock:
                            processed_classes += 1
                            timeout_files += 1
                            current_timeout = timeout_files
                        logger.warning(_t("java_analysis.timeout_exceeded", count=current_timeout, timeout=file_timeout, file_name=file_name))
                        continue

                    # 파싱 실패 시 (에러 메시지가 package_name에 담김)
                    if class_node is None:
                        file_name = os.path.basename(file_path)
                        with progress_lock:
                            processed_classes += 1
                            failed_files += 1
                            current_failed = failed_files
                        if isinstance(package_name, str) and package_name:
                            logger.error(_t("java_analysis.parse_failed", count=current_failed, file_name=file_name, package_name=package_name))
                        else:
                            logger.error(_t("java_analysis.parse_failed_no_package", count=current_failed, file_name=file_name))
                        continue

                    # 버퍼에 추가 및 배치 저장 여부 결정 (Lock 범위 최소화)
                    batch_to_save = None
                    should_log_progress = False
                    current_percent = 0
                    current_processed = 0

                    with progress_lock:
                        # Top-level 클래스와 Inner classes를 함께 저장
                        parsed_buffer.append((package_node, class_node, inner_classes, package_name))
                        processed_classes += 1
                        current_processed = processed_classes

                        # 진행 상황 로깅 체크 - 5초마다 또는 10% 단위
                        current_percent = int((processed_classes / total_files) * 100) if total_files > 0 else 0
                        current_time = time.time()  # Lock 안에서 시간 획득 (중복 출력 방지)
                        time_since_last_log = current_time - last_logged_time

                        # 5초 경과 또는 10% 단위 도달 또는 마지막 파일 시 로그 출력
                        # (10% 단위는 정확히 한 번만 출력되도록 last_logged_percent로 제어)
                        if time_since_last_log >= progress_interval:
                            # 5초 경과: 항상 출력
                            last_logged_time = current_time
                            should_log_progress = True
                        elif current_percent >= last_logged_percent + 10 and current_percent % 10 == 0:
                            # 10% 단위 도달: 한 번만 출력
                            last_logged_percent = current_percent
                            last_logged_time = current_time
                            should_log_progress = True
                        elif processed_classes == total_files:
                            # 마지막 파일: 반드시 출력
                            last_logged_time = current_time
                            should_log_progress = True

                        # 배치 저장 조건: 크기 도달 OR 마지막 파일 OR 시간 경과
                        time_since_last_save = current_time - last_batch_save_time
                        current_batch_size = batch_sizer.get_current_size()
                        should_save_batch = (
                            len(parsed_buffer) >= current_batch_size or  # 동적 배치 크기 도달
                            processed_classes == total_files or  # 마지막 파일
                            (len(parsed_buffer) > 0 and time_since_last_save >= batch_save_interval)  # 시간 경과
                        )

                        if should_save_batch:
                            # Lock 내에서는 복사만 수행 (최소 시간)
                            batch_to_save = parsed_buffer.copy()
                            parsed_buffer.clear()
                            last_batch_save_time = current_time  # 마지막 저장 시간 갱신

                    # Lock 밖에서 로깅 수행
                    if should_log_progress:
                        elapsed = time.time() - parse_start_time
                        files_per_sec = current_processed / elapsed if elapsed > 0 else 0
                        remaining = total_files - current_processed
                        eta_seconds = remaining / files_per_sec if files_per_sec > 0 else 0
                        eta_minutes = int(eta_seconds / 60)

                        # 메모리 사용량 측정
                        process = psutil.Process()
                        memory_mb = process.memory_info().rss / 1024 / 1024

                        # [mm:ss] 형식으로 경과 시간 표시
                        elapsed_mm = int(elapsed / 60)
                        elapsed_ss = int(elapsed % 60)
                        logger.info(
                            f"[{elapsed_mm:02d}:{elapsed_ss:02d}] "
                            + _t("java_analysis.parsing_progress", current=current_processed, total=total_files, percent=current_percent)
                            + f" - {files_per_sec:.1f} files/sec, ETA: {eta_minutes}분, RAM: {memory_mb:.0f}MB"
                        )

                    # Lock 밖에서 Neo4j 저장 수행 (다른 스레드 블록 방지)
                    if batch_to_save:
                        try:
                            batch_start_time = time.time()
                            logger.info(_t("java_analysis.batch_save_starting", count=len(batch_to_save)))

                            # Class 배치 저장 (Top-level + Inner classes)
                            classes_to_save = []
                            class_to_package = {}

                            for package_node, class_node, inner_classes, package_name in batch_to_save:
                                classes_to_save.append(class_node)
                                class_to_package[class_node.name] = package_name

                                # Inner classes도 저장
                                for inner_class in inner_classes:
                                    classes_to_save.append(inner_class)
                                    class_to_package[inner_class.name] = package_name

                            # 클래스 배치 저장 (성능 최적화)
                            classes_batch_data = [
                                (cls, class_to_package.get(cls.name, ""), project_name)
                                for cls in classes_to_save
                            ]
                            graph_db.add_classes_batch(classes_batch_data)

                            # Bean/Endpoint 등 배치 저장
                            from csa.services.analysis.neo4j_writer import add_batch_class_objects_streaming
                            batch_stats = add_batch_class_objects_streaming(
                                graph_db, batch_to_save, project_name, logger
                            )

                            # 통계 누적 (Lock으로 보호)
                            with progress_lock:
                                stats['classes'] += len(classes_to_save)
                                stats['beans'] += batch_stats.get('beans', 0)
                                stats['endpoints'] += batch_stats.get('endpoints', 0)
                                stats['jpa_entities'] += batch_stats.get('jpa_entities', 0)
                                stats['jpa_repositories'] += batch_stats.get('jpa_repositories', 0)
                                stats['jpa_queries'] += batch_stats.get('jpa_queries', 0)
                                stats['test_classes'] += batch_stats.get('test_classes', 0)
                                stats['mybatis_mappers'] += batch_stats.get('mybatis_mappers', 0)
                                stats['sql_statements'] += batch_stats.get('sql_statements', 0)
                                stats['processed_files'] += len(batch_to_save)

                            batch_elapsed = time.time() - batch_start_time

                            # 배치 크기 동적 조정
                            new_batch_size = batch_sizer.adjust(batch_elapsed, len(batch_to_save))
                            if new_batch_size != current_batch_size:
                                logger.info(_t("java_analysis.batch_size_adjusted", old_size=current_batch_size, new_size=new_batch_size))

                            logger.info(_t("java_analysis.batch_save_complete", elapsed=batch_elapsed))

                            # 메모리 명시적 해제 (배치 저장 후)
                            del batch_to_save
                            gc.collect()

                        except Exception as batch_error:
                            logger.error(_t("java_analysis.batch_save_failed", error=str(batch_error)))
                            # 배치 저장 실패 시에도 계속 진행
                            continue

                except Exception as e:
                    file_name = os.path.basename(file_path)
                    logger.error(_t("java_analysis.exception_occurred", file_name=file_name, error=str(e)))
                    with progress_lock:
                        processed_classes += 1
                        failed_files += 1
                    continue

        except KeyboardInterrupt:
            logger.warning(_t("java_analysis.analysis_cancelled_pending_tasks"))
            for f in future_to_file:
                f.cancel()
            raise

    parse_elapsed = time.time() - parse_start_time
    success_files = total_files - failed_files - timeout_files
    avg_time_per_file = (parse_elapsed / total_files * 1000) if total_files > 0 else 0
    logger.info(_t("java_analysis.parse_complete", total_time=parse_elapsed, avg_time=avg_time_per_file))
    logger.info(_t("java_analysis.result_summary", success=success_files, total=total_files, failed=failed_files, timeout=timeout_files))

    # 2. MyBatis XML mappers 추출 및 저장
    logger.info(_t("java_analysis.processing_xml_mappers"))
    xml_mappers = extract_mybatis_xml_mappers(directory, project_name, graph_db)
    total_xml_mappers = len(xml_mappers)

    if total_xml_mappers > 0:
        logger.info(_t("java_analysis.xml_mappers_found", count=total_xml_mappers))
        xml_start_time = time.time()
        xml_last_log_time = xml_start_time

        for i, mapper in enumerate(xml_mappers, 1):
            graph_db.add_mybatis_mapper(mapper, project_name)
            stats['mybatis_mappers'] += 1

            # XML mapper의 SQL statements 즉시 추출 및 저장
            sql_statements = extract_sql_statements_from_mappers([mapper], project_name, use_ai=use_ai_analysis)
            if sql_statements:
                relationships = []
                for sql_statement in sql_statements:
                    graph_db.add_sql_statement(sql_statement, project_name)
                    relationships.append(
                        {
                            "mapper_name": sql_statement.mapper_name,
                            "sql_id": sql_statement.id,
                        }
                    )
                if relationships:
                    graph_db.add_mapper_sql_relationships_batch(relationships, project_name)
                stats['sql_statements'] += len(sql_statements)

            # 10개마다 또는 5초마다 진행율 표시
            current_time = time.time()
            if (i % 10 == 0) or (current_time - xml_last_log_time >= 5.0) or (i == total_xml_mappers):
                xml_percent = int(i / total_xml_mappers * 100)
                logger.info(_t("java_analysis.xml_mapper_processing", current=i, total=total_xml_mappers, percent=xml_percent))
                xml_last_log_time = current_time

        xml_elapsed = time.time() - xml_start_time
        logger.info(_t("java_analysis.xml_mapper_complete", count=total_xml_mappers, elapsed=xml_elapsed))
    else:
        logger.info(_t("java_analysis.no_xml_mappers"))


    # 3. Config files 처리
    logger.info(_t("java_analysis.processing_config"))
    config_files = extract_config_files(directory)
    total_config_files = len(config_files)

    if total_config_files > 0:
        logger.info(_t("java_analysis.config_files_found", count=total_config_files))
        config_start_time = time.time()

        for i, config in enumerate(config_files, 1):
            graph_db.add_config_file(config, project_name)
            stats['config_files'] += 1

            # 5개마다 진행율 표시
            if (i % 5 == 0) or (i == total_config_files):
                config_percent = int(i / total_config_files * 100)
                logger.info(_t("java_analysis.config_file_processing", current=i, total=total_config_files, percent=config_percent))

        config_elapsed = time.time() - config_start_time
        logger.info(_t("java_analysis.config_files_complete", total=total_config_files, elapsed=config_elapsed))
    else:
        logger.info(_t("java_analysis.no_config_files"))

    # 4. Bean 의존성 해결 (Neo4j 쿼리)
    if stats['beans'] > 0:
        logger.info("")
        logger.info(_t("java_analysis.bean_dependency_resolving_detailed", count=stats['beans']))
        bean_start_time = time.time()

        from csa.services.java_analysis.bean_dependency_resolver import (
            resolve_bean_dependencies_from_neo4j
        )
        resolve_bean_dependencies_from_neo4j(graph_db, project_name, logger)

        bean_elapsed = time.time() - bean_start_time
        logger.info(_t("java_analysis.bean_dependency_complete_detailed", elapsed=bean_elapsed))

    logger.info(_t("java_analysis.streaming_analysis_complete"))
    logger.info(_t("java_analysis.files_processed", processed=stats['processed_files'], total=stats['total_files']))
    logger.info(_t("java_analysis.packages_found_summary", count=stats['packages']))
    logger.info(_t("java_analysis.classes_found_summary", count=stats['classes']))
    logger.info(_t("java_analysis.beans_found", count=stats['beans']))
    logger.info(_t("java_analysis.endpoints_found", count=stats['endpoints']))
    logger.info(_t("java_analysis.jpa_repositories", count=stats['jpa_repositories']))
    logger.info(_t("java_analysis.jpa_queries", count=stats['jpa_queries']))
    logger.info(_t("java_analysis.mybatis_mappers", count=stats['mybatis_mappers']))
    logger.info(_t("java_analysis.sql_statements", count=stats['sql_statements']))

    return stats


def _collect_java_files_with_csaignore(directory: str, exclude_patterns: list[str] = None, use_csaignore_file: bool = True) -> list[str]:
    """
    디렉터리에서 .java 파일을 수집하고 .csaignore 필터를 적용합니다.

    Args:
        directory: Java 소스 디렉터리 경로
        exclude_patterns: 추가 제외 패턴 목록
        use_csaignore_file: .csaignore 파일 사용 여부

    Returns:
        list[str]: 필터링된 Java 파일 경로 목록
    """
    logger = get_logger(__name__)

    # 모든 .java 파일 수집
    java_files = []
    for root, _, files in os.walk(directory):
        for file in files:
            if file.endswith(".java"):
                java_files.append(os.path.join(root, file))

    # .csaignore 필터 적용
    csaignore_filter = load_csaignore_filter(
        os.getcwd(),
        additional_patterns=exclude_patterns,
        use_file=use_csaignore_file
    )
    if csaignore_filter.has_patterns():
        logger.info(_t("java_analysis.applying_exclude_patterns"))
        original_count = len(java_files)
        java_files = csaignore_filter.filter_files(java_files)
        excluded_count = original_count - len(java_files)
        if excluded_count > 0:
            logger.info(_t("java_analysis.csaignore_files_excluded_count", count=excluded_count))

    return java_files


def parse_java_project(directory: str, graph_db: GraphDB = None) -> list[Class]:
    """
    Compatibility wrapper that returns only the parsed classes.

    The full parser returns additional metadata required by the analyzer,
    but lightweight callers (including unit tests) expect only the class list.
    """

    # Provide legacy attribute accessors once at class definition level.
    if not hasattr(Class, "package"):
        setattr(Class, "package", property(lambda self: getattr(self, "package_name", "")))
    if not hasattr(Class, "project"):
        setattr(Class, "project", property(lambda self: getattr(self, "project_name", "")))

    _, classes, *_ = parse_java_project_full(directory, graph_db)
    return classes


__all__ = [
    "parse_java_project",
    "parse_java_project_full",
    "parse_java_project_streaming",
    "parse_single_java_file",
]
