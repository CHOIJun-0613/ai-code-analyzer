"""
Helpers for persisting analysis results into Neo4j.
"""
from __future__ import annotations

import os
import time
from contextlib import contextmanager
from datetime import datetime
from typing import Optional, Sequence

from csa.cli.core.lifecycle import format_duration
from csa.models.analysis import JavaAnalysisArtifacts, JavaAnalysisStats
from csa.models.graph_entities import Project
from csa.services.analysis.summary import calculate_java_statistics, get_java_stats_from_neo4j
from csa.services.graph_db import GraphDB
from csa.utils.i18n import _t
from csa.utils.project_statistics import calculate_project_statistics
from csa.services.java_parser import (
    analyze_bean_dependencies,
    extract_beans_from_classes,
    extract_endpoints_from_classes,
    extract_jpa_entities_from_classes,
    extract_mybatis_mappers_from_classes,
    extract_sql_statements_from_mappers,
    extract_test_classes_from_classes,
)
from csa.dbwork.connection_pool import get_connection_pool


def connect_to_neo4j_db(
    neo4j_uri: str,
    neo4j_user: str,
    neo4j_password: str,
    neo4j_database: str,
    logger,
) -> GraphDB:
    """Initialise (or reuse) a Neo4j connection pool and GraphDB instance."""
    logger.info(_t("neo4j.connecting", uri=neo4j_uri))
    pool = get_connection_pool()
    if not pool.is_initialized():
        pool_size = int(os.getenv("NEO4J_POOL_SIZE", "10"))
        logger.info(_t("neo4j.init_pool", pool_size=pool_size))
        pool.initialize(neo4j_uri, neo4j_user, neo4j_password, neo4j_database, pool_size)
        logger.info(_t("neo4j.connected", uri=neo4j_uri, database=neo4j_database))
    else:
        logger.info(_t("neo4j.using_existing_pool", database=neo4j_database))

    return GraphDB(neo4j_uri, neo4j_user, neo4j_password, neo4j_database)


@contextmanager
def _session_scope(db: GraphDB):
    """Yield a Neo4j session, preferring the shared connection pool when available."""
    pool = get_connection_pool()
    if pool.is_initialized():
        with pool.session() as session:
            yield session
    else:
        with db._driver.session() as session:  # pylint: disable=protected-access
            yield session


def clean_java_objects(db: GraphDB, logger) -> None:
    """Remove previously stored Java-related nodes."""
    logger.info(_t("neo4j.clean_java"))
    def _execute(session):
        session.run("MATCH (n:Package) DETACH DELETE n")
        session.run("MATCH (n:Class) DETACH DELETE n")
        session.run("MATCH (n:Method) DETACH DELETE n")
        session.run("MATCH (n:Field) DETACH DELETE n")
        session.run("MATCH (n:Bean) DETACH DELETE n")
        session.run("MATCH (n:Endpoint) DETACH DELETE n")
        session.run("MATCH (n:MyBatisMapper) DETACH DELETE n")
        session.run("MATCH (n:JpaEntity) DETACH DELETE n")
        session.run("MATCH (n:ConfigFile) DETACH DELETE n")
        session.run("MATCH (n:TestClass) DETACH DELETE n")
        session.run("MATCH (n:SqlStatement) DETACH DELETE n")

    with _session_scope(db) as session:
        _execute(session)


def clean_db_objects(db: GraphDB, logger) -> None:
    """Remove previously stored database-related nodes."""
    logger.info(_t("neo4j.clean_db"))
    def _execute(session):
        session.run("MATCH (n:Database) DETACH DELETE n")
        session.run("MATCH (n:Table) DETACH DELETE n")
        session.run("MATCH (n:Column) DETACH DELETE n")
        session.run("MATCH (n:Index) DETACH DELETE n")
        session.run("MATCH (n:Constraint) DETACH DELETE n")

    with _session_scope(db) as session:
        _execute(session)


def _log_progress(prefix: str, current: int, total: int, last_percent: int, logger) -> int:
    """Log percentage progress in 10%% steps and return updated percentage."""
    percent = int((current / total) * 100) if total else 100
    if percent >= last_percent + 10 or current == total:
        last_percent = percent
        logger.info(_t("neo4j.save_progress", prefix=prefix, current=current, total=total, percent=percent))
    return last_percent


def _log_duration(message: str, item_count: int, start_time: float, logger) -> None:
    """Helper to log duration for batched operations."""
    elapsed = time.time() - start_time
    logger.info(_t("neo4j.batch_save_duration", message=message, item_count=item_count, elapsed=elapsed))


def add_springboot_objects(
    db: GraphDB,
    beans: Sequence[object],
    dependencies: Sequence[object],
    endpoints: Sequence[object],
    mybatis_mappers: Sequence[object],
    jpa_entities: Sequence[object],
    jpa_repositories: Sequence[object],
    jpa_queries: Sequence[object],
    config_files: Sequence[object],
    test_classes: Sequence[object],
    sql_statements: Sequence[object],
    project_name: str,
    logger,
) -> None:
    """Persist Spring Boot–related artifacts to Neo4j."""
    if beans:
        logger.info(_t("neo4j.save_beans", count=len(beans)))
        start_time = time.time()
        last_percent = 0
        for idx, bean in enumerate(beans, 1):
            db.add_bean(bean, project_name)
            last_percent = _log_progress("Beans", idx, len(beans), last_percent, logger)
        _log_duration("Added Spring Beans", len(beans), start_time, logger)

    if dependencies:
        logger.info(_t("neo4j.save_dependencies", count=len(dependencies)))
        start_time = time.time()
        for dependency in dependencies:
            db.add_bean_dependency(dependency, project_name)
        _log_duration("Added Bean dependencies", len(dependencies), start_time, logger)

    if endpoints:
        logger.info(_t("neo4j.save_endpoints", count=len(endpoints)))
        start_time = time.time()
        for endpoint in endpoints:
            db.add_endpoint(endpoint, project_name)
        _log_duration("Added REST endpoints", len(endpoints), start_time, logger)

    if mybatis_mappers:
        logger.info(_t("neo4j.save_mybatis", count=len(mybatis_mappers)))
        start_time = time.time()
        for mapper in mybatis_mappers:
            db.add_mybatis_mapper(mapper, project_name)
        _log_duration("Added MyBatis mappers", len(mybatis_mappers), start_time, logger)

    if jpa_entities:
        logger.info(_t("neo4j.save_jpa_entities", count=len(jpa_entities)))
        start_time = time.time()
        for entity in jpa_entities:
            db.add_jpa_entity(entity, project_name)
        _log_duration("Added JPA entities", len(jpa_entities), start_time, logger)

    if jpa_repositories:
        logger.info(_t("neo4j.save_jpa_repos", count=len(jpa_repositories)))
        start_time = time.time()
        for repository in jpa_repositories:
            db.add_jpa_repository(repository, project_name)
        _log_duration("Added JPA repositories", len(jpa_repositories), start_time, logger)

    if jpa_queries:
        logger.info(_t("neo4j.save_jpa_queries", count=len(jpa_queries)))
        start_time = time.time()
        last_percent = 0
        for idx, query in enumerate(jpa_queries, 1):
            db.add_jpa_query(query, project_name)
            last_percent = _log_progress("JPA Queries", idx, len(jpa_queries), last_percent, logger)
        _log_duration("Added JPA queries", len(jpa_queries), start_time, logger)

    if config_files:
        logger.info(_t("neo4j.save_config", count=len(config_files)))
        start_time = time.time()
        for config in config_files:
            db.add_config_file(config, project_name)
        _log_duration("Added configuration files", len(config_files), start_time, logger)

    if test_classes:
        logger.info(_t("neo4j.save_test", count=len(test_classes)))
        start_time = time.time()
        for test_class in test_classes:
            db.add_test_class(test_class, project_name)
        _log_duration("Added test classes", len(test_classes), start_time, logger)

    if sql_statements:
        logger.info(_t("neo4j.save_sql", count=len(sql_statements)))
        start_time = time.time()
        last_percent = 0
        relationships: list[dict[str, str]] = []
        for idx, sql_statement in enumerate(sql_statements, 1):
            db.add_sql_statement(sql_statement, project_name)
            relationships.append(
                {
                    "mapper_name": sql_statement.mapper_name,
                    "sql_id": sql_statement.id,
                }
            )
            last_percent = _log_progress("SQL Statements", idx, len(sql_statements), last_percent, logger)
        if relationships:
            db.add_mapper_sql_relationships_batch(relationships, project_name)
        _log_duration("Added SQL statements", len(sql_statements), start_time, logger)


def add_single_class_objects(
    db: GraphDB,
    class_node,
    package_name: str,
    project_name: str,
    logger,
) -> None:
    """Persist artifacts derived from a single class node."""
    classes_list = [class_node]
    beans = extract_beans_from_classes(classes_list)
    dependencies = analyze_bean_dependencies(classes_list, beans)
    endpoints = extract_endpoints_from_classes(classes_list)
    mybatis_mappers = extract_mybatis_mappers_from_classes(classes_list)
    jpa_entities = extract_jpa_entities_from_classes(classes_list)
    test_classes = extract_test_classes_from_classes(classes_list)
    sql_statements = extract_sql_statements_from_mappers(mybatis_mappers, project_name)

    if beans:
        logger.info(_t("neo4j.save_beans", count=len(beans)))
        for bean in beans:
            db.add_bean(bean, project_name)

    if dependencies:
        logger.info(_t("neo4j.save_dependencies", count=len(dependencies)))
        for dependency in dependencies:
            db.add_bean_dependency(dependency, project_name)

    if endpoints:
        logger.info(_t("neo4j.save_endpoints", count=len(endpoints)))
        for endpoint in endpoints:
            db.add_endpoint(endpoint, project_name)

    if mybatis_mappers:
        logger.info(_t("neo4j.save_mybatis", count=len(mybatis_mappers)))
        for mapper in mybatis_mappers:
            db.add_mybatis_mapper(mapper, project_name)

    if jpa_entities:
        logger.info(_t("neo4j.save_jpa_entities", count=len(jpa_entities)))
        for entity in jpa_entities:
            db.add_jpa_entity(entity, project_name)

    if test_classes:
        logger.info(_t("neo4j.save_test", count=len(test_classes)))
        for test_class in test_classes:
            db.add_test_class(test_class, project_name)

    if sql_statements:
        logger.info(_t("neo4j.save_sql", count=len(sql_statements)))
        relationships: list[dict[str, str]] = []
        for sql_statement in sql_statements:
            db.add_sql_statement(sql_statement, project_name)
            relationships.append(
                {
                    "mapper_name": sql_statement.mapper_name,
                    "sql_id": sql_statement.id,
                }
            )
        if relationships:
            db.add_mapper_sql_relationships_batch(relationships, project_name)

def add_batch_class_objects_streaming(
    db: GraphDB,
    classes_batch: list,
    project_name: str,
    logger,
) -> dict:
    """
    여러 클래스의 객체들을 배치로 저장 (진정한 배치 처리)

    Args:
        db: Neo4j GraphDB 인스턴스
        classes_batch: (package_node, class_node, inner_classes, package_name) 튜플 리스트
        project_name: 프로젝트명
        logger: 로거 인스턴스

    Returns:
        dict: 처리 통계
    """
    from csa.services.java_analysis.jpa import (
        extract_jpa_queries_from_repositories,
        extract_jpa_repositories_from_classes,
    )

    # 모든 클래스 노드 추출 (Top-level 클래스 + Inner classes)
    all_classes = []
    for package_node, class_node, inner_classes, package_name in classes_batch:
        all_classes.append(class_node)
        all_classes.extend(inner_classes)

    stats = {
        'beans': 0,
        'endpoints': 0,
        'jpa_entities': 0,
        'jpa_repositories': 0,
        'jpa_queries': 0,
        'test_classes': 0,
        'mybatis_mappers': 0,
        'sql_statements': 0,
    }

    # Bean 추출 및 배치 저장
    beans = extract_beans_from_classes(all_classes)
    if beans:
        db.add_beans_batch(beans, project_name)
        stats['beans'] = len(beans)
        logger.debug(_t("neo4j.debug_batch_save_bean", count=len(beans)))

    # Endpoint 추출 및 배치 저장
    endpoints = extract_endpoints_from_classes(all_classes)
    if endpoints:
        db.add_endpoints_batch(endpoints, project_name)
        stats['endpoints'] = len(endpoints)
        logger.debug(_t("neo4j.debug_batch_save_endpoint", count=len(endpoints)))

    # JPA Entity 추출 및 배치 저장
    jpa_entities = extract_jpa_entities_from_classes(all_classes)
    if jpa_entities:
        db.add_jpa_entities_batch(jpa_entities, project_name)
        stats['jpa_entities'] = len(jpa_entities)
        logger.debug(_t("neo4j.debug_batch_save_jpa_entity", count=len(jpa_entities)))

    # JPA Repository 추출 및 배치 저장
    jpa_repositories = extract_jpa_repositories_from_classes(all_classes)
    if jpa_repositories:
        db.add_jpa_repositories_batch(jpa_repositories, project_name)
        stats['jpa_repositories'] = len(jpa_repositories)
        logger.debug(_t("neo4j.debug_batch_save_jpa_repo", count=len(jpa_repositories)))

        # JPA Queries 즉시 추출 및 배치 저장
        jpa_queries = extract_jpa_queries_from_repositories(jpa_repositories)
        if jpa_queries:
            db.add_jpa_queries_batch(jpa_queries, project_name)
            stats['jpa_queries'] = len(jpa_queries)
            logger.debug(_t("neo4j.debug_batch_save_jpa_query", count=len(jpa_queries)))

    # Test 추출 및 배치 저장
    test_classes = extract_test_classes_from_classes(all_classes)
    if test_classes:
        db.add_test_classes_batch(test_classes, project_name)
        stats['test_classes'] = len(test_classes)
        logger.debug(_t("neo4j.debug_batch_save_test_class", count=len(test_classes)))

    # MyBatis Mapper 추출 및 배치 저장
    mybatis_mappers = extract_mybatis_mappers_from_classes(all_classes)
    if mybatis_mappers:
        db.add_mybatis_mappers_batch(mybatis_mappers, project_name)
        stats['mybatis_mappers'] = len(mybatis_mappers)
        logger.debug(_t("neo4j.debug_batch_save_mybatis", count=len(mybatis_mappers)))

        # SQL Statements 즉시 추출 및 배치 저장
        sql_statements = extract_sql_statements_from_mappers(mybatis_mappers, project_name)
        if sql_statements:
            db.add_sql_statements_batch(sql_statements, project_name)

            # Mapper-SQL 관계를 한 번에 연결
            relationships = [
                {
                    "mapper_name": sql_statement.mapper_name,
                    "sql_id": sql_statement.id,
                }
                for sql_statement in sql_statements
            ]
            if relationships:
                db.add_mapper_sql_relationships_batch(relationships, project_name)
            stats['sql_statements'] = len(sql_statements)
            logger.debug(_t("neo4j.debug_batch_save_sql", count=len(sql_statements)))

    return stats


def add_single_class_objects_streaming(
    db: GraphDB,
    class_node,
    package_name: str,
    project_name: str,
    logger,
) -> dict:
    """
    파일별 즉시 저장 (스트리밍 방식)

    파일 하나를 파싱한 후 즉시 Neo4j에 저장합니다.
    Bean 의존성은 Neo4j 쿼리로 해결하므로 여기서는 생성하지 않습니다.

    Args:
        db: Neo4j GraphDB 인스턴스
        class_node: 파싱된 클래스 노드
        package_name: 패키지명
        project_name: 프로젝트명
        logger: 로거 인스턴스

    Returns:
        dict: 처리 통계
            {
                'beans': int,
                'endpoints': int,
                'jpa_entities': int,
                'jpa_repositories': int,
                'jpa_queries': int,
                'test_classes': int,
                'mybatis_mappers': int,
                'sql_statements': int,
            }
    """
    from csa.services.java_analysis.jpa import (
        extract_jpa_queries_from_repositories,
        extract_jpa_repositories_from_classes,
    )

    classes_list = [class_node]
    stats = {
        'beans': 0,
        'endpoints': 0,
        'jpa_entities': 0,
        'jpa_repositories': 0,
        'jpa_queries': 0,
        'test_classes': 0,
        'mybatis_mappers': 0,
        'sql_statements': 0,
    }

    # Bean 추출 및 저장 (의존성 해결은 제외)
    beans = extract_beans_from_classes(classes_list)
    if beans:
        for bean in beans:
            db.add_bean(bean, project_name)
        stats['beans'] = len(beans)
        logger.debug(_t("neo4j.debug_save_bean", count=len(beans)))

    # Endpoint 추출 및 저장
    endpoints = extract_endpoints_from_classes(classes_list)
    if endpoints:
        for endpoint in endpoints:
            db.add_endpoint(endpoint, project_name)
        stats['endpoints'] = len(endpoints)
        logger.debug(_t("neo4j.debug_save_endpoint", count=len(endpoints)))

    # JPA Entity 추출 및 저장
    jpa_entities = extract_jpa_entities_from_classes(classes_list)
    if jpa_entities:
        for entity in jpa_entities:
            db.add_jpa_entity(entity, project_name)
        stats['jpa_entities'] = len(jpa_entities)
        logger.debug(_t("neo4j.debug_save_jpa_entity", count=len(jpa_entities)))

    # JPA Repository 추출 및 저장 + Queries 즉시 추출
    jpa_repositories = extract_jpa_repositories_from_classes(classes_list)
    if jpa_repositories:
        for repo in jpa_repositories:
            db.add_jpa_repository(repo, project_name)
        stats['jpa_repositories'] = len(jpa_repositories)
        logger.debug(_t("neo4j.debug_save_jpa_repo", count=len(jpa_repositories)))

        # JPA Queries 즉시 추출 및 저장
        jpa_queries = extract_jpa_queries_from_repositories(jpa_repositories)
        if jpa_queries:
            for query in jpa_queries:
                db.add_jpa_query(query, project_name)
            stats['jpa_queries'] = len(jpa_queries)
            logger.debug(_t("neo4j.debug_save_jpa_query", count=len(jpa_queries)))

    # Test 추출 및 저장
    test_classes = extract_test_classes_from_classes(classes_list)
    if test_classes:
        for test_class in test_classes:
            db.add_test_class(test_class, project_name)
        stats['test_classes'] = len(test_classes)
        logger.debug(_t("neo4j.debug_save_test_class", count=len(test_classes)))

    # MyBatis Mapper 추출 및 저장 + SQL Statements 즉시 추출
    mybatis_mappers = extract_mybatis_mappers_from_classes(classes_list)
    if mybatis_mappers:
        for mapper in mybatis_mappers:
            db.add_mybatis_mapper(mapper, project_name)
        stats['mybatis_mappers'] = len(mybatis_mappers)
        logger.debug(_t("neo4j.debug_save_mybatis", count=len(mybatis_mappers)))

        # SQL Statements 즉시 추출 및 저장
        sql_statements = extract_sql_statements_from_mappers(mybatis_mappers, project_name)
        if sql_statements:
            relationships: list[dict[str, str]] = []
            for sql_statement in sql_statements:
                db.add_sql_statement(sql_statement, project_name)
                relationships.append(
                    {
                        "mapper_name": sql_statement.mapper_name,
                        "sql_id": sql_statement.id,
                    }
                )
            if relationships:
                db.add_mapper_sql_relationships_batch(relationships, project_name)
            stats['sql_statements'] = len(sql_statements)
            logger.debug(_t("neo4j.debug_save_sql", count=len(sql_statements)))

    return stats


def _add_packages(db: GraphDB, packages: Sequence[object], project_name: str, logger) -> None:
    """Helper for writing package nodes."""
    logger.info(_t("neo4j.save_packages", count=len(packages)))
    for package in packages:
        db.add_package(package, project_name)


def _add_classes(
    db: GraphDB,
    classes: Sequence[object],
    class_to_package_map: dict,
    project_name: str,
    logger,
) -> None:
    """Persist class nodes into Neo4j."""

    total = len(classes)
    logger.info(_t("neo4j.save_classes", count=total))
    last_percent = 0
    for idx, class_obj in enumerate(classes, 1):
        package_name = class_to_package_map.get(class_obj.name, "unknown")
        db.add_class(class_obj, package_name, project_name)
        last_percent = _log_progress("Classes", idx, total, last_percent, logger)


def save_java_objects_to_neo4j(
    db: Optional[GraphDB],
    artifacts: JavaAnalysisArtifacts,
    project: Project,
    clean: bool,
    logger,
    java_source_folder: str = None,
) -> JavaAnalysisStats:
    """Persist Java analysis artifacts to Neo4j and return corresponding stats."""
    java_start_time = datetime.now()
    project_name = project.name or ""
    metadata = artifacts.metadata or {}
    use_streaming_env = os.getenv("USE_STREAMING_PARSE", "false").lower() == "true"
    streaming_mode = use_streaming_env or not artifacts.classes

    if streaming_mode:
        java_stats: Optional[JavaAnalysisStats] = None
    else:
        java_stats = calculate_java_statistics(
            artifacts.packages,
            artifacts.classes,
            artifacts.beans,
            artifacts.endpoints,
            artifacts.mybatis_mappers,
            artifacts.jpa_entities,
            artifacts.jpa_repositories,
            artifacts.jpa_queries,
            artifacts.config_files,
            artifacts.test_classes,
            artifacts.sql_statements,
        )
        java_stats.project_name = project_name

    if db is None:
        logger.info("Connecting to Neo4j...")
        neo4j_uri = os.getenv("NEO4J_URI", "bolt://localhost:7687")
        neo4j_user = os.getenv("NEO4J_USER", "neo4j")
        neo4j_password = os.getenv("NEO4J_PASSWORD")
        neo4j_database = os.getenv("NEO4J_DATABASE", "neo4j")

        if not neo4j_password:
            logger.error("NEO4J_PASSWORD not set - cannot connect to database")
            raise ValueError("NEO4J_PASSWORD environment variable is required")

        db = connect_to_neo4j_db(neo4j_uri, neo4j_user, neo4j_password, neo4j_database, logger)

    logger.info(_t("neo4j.save_project", project_name=project_name or "<unknown>"))
    if not project.created_at:
        project.created_at = datetime.now().strftime("%Y/%m/%d %H:%M:%S.%f")[:-3]
    project.updated_at = datetime.now().strftime("%Y/%m/%d %H:%M:%S.%f")[:-3]

    # Project 통계 집계 (파일 수, LOC 통계)
    # 인자로 전달된 java_source_folder 사용, 없으면 환경변수 사용
    if not java_source_folder:
        java_source_folder = os.getenv("JAVA_SOURCE_FOLDER", "")
        # 만약 환경변수도 없고 project.path가 있으면 그것을 사용
        if not java_source_folder and project.path:
            java_source_folder = project.path
            
    logger.info(_t("project.stats_start", clean=clean, folder=java_source_folder))

    # 스트리밍 모드 확인
    logger.info(_t("project.streaming_mode", enabled=use_streaming_env))

    # 스트리밍 모드이거나 artifacts.classes가 비어있으면 Neo4j에서 조회
    if streaming_mode:
        # Neo4j에서 모든 클래스를 조회하여 통계 계산
        logger.info(_t("project.query_neo4j_stats"))
        from csa.utils.project_statistics import calculate_project_statistics_from_neo4j
        project = calculate_project_statistics_from_neo4j(db, project, project_name, java_source_folder)
    else:
        # 배치 모드: artifacts의 클래스 사용
        logger.info(_t("project.batch_mode_classes", count=len(artifacts.classes)))

        # artifacts.classes가 리스트인지 딕셔너리인지 확인
        if isinstance(artifacts.classes, dict):
            classes_dict = artifacts.classes
            logger.info(_t("neo4j.classes_dict_check", count=len(classes_dict)))
        else:
            classes_dict = {cls.name: cls for cls in artifacts.classes if hasattr(cls, 'name')}
            logger.info(_t("neo4j.classes_dict_convert", count=len(classes_dict)))

        # 첫 번째 클래스의 LOC 값 확인 (디버깅)
        if classes_dict:
            first_class = next(iter(classes_dict.values()))
            logger.debug(_t("neo4j.classes_sample_info",
                           class_name=first_class.name,
                           ploc=getattr(first_class, 'PLOC', 'N/A'),
                           lloc=getattr(first_class, 'LLOC', 'N/A'),
                           cloc=getattr(first_class, 'CLOC', 'N/A')))

        project = calculate_project_statistics(project, classes_dict, java_source_folder)

    # 분석 대상 파일 수 계산
    analyzed_count = (project.total_java_file_count +
                     project.total_xml_file_count +
                     project.total_config_file_count +
                     project.total_ddl_file_count +
                     project.total_other_analyzed_file_count)

    logger.info("=" * 80)
    logger.info(_t("project.stats_header", total=project.total_file_count))
    logger.info(_t("project.stats_analyzed",
                analyzed=analyzed_count,
                java=project.total_java_file_count,
                xml=project.total_xml_file_count,
                config=project.total_config_file_count,
                ddl=project.total_ddl_file_count))
    logger.info(_t("project.stats_ignored", ignored=project.total_ignored_file_count))
    logger.info(_t("project.stats_loc",
                ploc=project.total_PLOC, lloc=project.total_LLOC, cloc=project.total_CLOC))
    logger.info("=" * 80)

    db.add_project(project)

    _add_packages(db, artifacts.packages, project_name, logger)
    _add_classes(db, artifacts.classes, artifacts.class_to_package_map, project_name, logger)
    add_springboot_objects(
        db,
        artifacts.beans,
        artifacts.dependencies,
        artifacts.endpoints,
        artifacts.mybatis_mappers,
        artifacts.jpa_entities,
        artifacts.jpa_repositories,
        artifacts.jpa_queries,
        artifacts.config_files,
        artifacts.test_classes,
        artifacts.sql_statements,
        project_name,
        logger,
    )

    # Bean 의존성 해결 (Neo4j 기반)
    # artifacts.beans가 Neo4j에 저장된 후 실행
    if artifacts.beans:
        logger.info("")
        from csa.services.java_analysis.bean_dependency_resolver import (
            resolve_bean_dependencies_from_neo4j
        )
        resolve_bean_dependencies_from_neo4j(db, project_name, logger)

    # Method -> SqlStatement CALLS 관계 생성
    # artifacts.sql_statements가 Neo4j에 저장된 후 실행
    if artifacts.sql_statements:
        logger.info("")
        logger.info(_t("neo4j.method_sql_start"))
        relationships_created = db.create_method_sql_relationships(project_name)
        logger.info(_t("neo4j.method_sql_done", count=relationships_created))

    java_end_time = datetime.now()
    if streaming_mode:
        # metadata의 시간은 ISO 형식 문자열이므로 datetime으로 변환
        start_time_str = metadata.get("start_time")
        end_time_str = metadata.get("end_time")
        start_time = datetime.fromisoformat(start_time_str) if start_time_str else java_start_time
        end_time = datetime.fromisoformat(end_time_str) if end_time_str else java_end_time
        java_stats = get_java_stats_from_neo4j(
            db,
            project_name,
            logger,
            start_time=start_time,
            end_time=end_time,
        )
        java_stats.project_name = project_name
        total_files_meta = metadata.get("total_files")
        processed_files_meta = metadata.get("processed_files")
        error_files_meta = metadata.get("error_files")
        if total_files_meta is not None:
            java_stats.total_files = total_files_meta
        if processed_files_meta is not None:
            java_stats.processed_files = processed_files_meta
        if error_files_meta is not None:
            java_stats.error_files = error_files_meta
        if metadata:
            java_stats.metadata.update(metadata)
        duration_seconds = (end_time - start_time).total_seconds()
        java_stats.start_time = start_time
        java_stats.end_time = end_time
    else:
        java_stats.start_time = java_start_time
        java_stats.end_time = java_end_time
        duration_seconds = (java_end_time - java_start_time).total_seconds()

    logger.info(_t("neo4j.java_complete", duration=format_duration(duration_seconds)))

    return java_stats


__all__ = [
    "add_batch_class_objects_streaming",
    "add_single_class_objects",
    "add_single_class_objects_streaming",
    "add_springboot_objects",
    "clean_db_objects",
    "clean_java_objects",
    "connect_to_neo4j_db",
    "save_java_objects_to_neo4j",
]
