"""
Summary and statistics helpers for the analysis service.
"""
from __future__ import annotations

from datetime import datetime
from typing import Iterable, Optional

from csa.cli.core.lifecycle import format_duration, format_number
from csa.models.analysis import DatabaseAnalysisStats, JavaAnalysisStats
from csa.utils.i18n import _t
from csa.utils.logger import get_logger


def get_java_stats_from_neo4j(
    graph_db,
    project_name: str,
    logger,
    start_time: Optional[datetime] = None,
    end_time: Optional[datetime] = None,
) -> JavaAnalysisStats:
    """
    스트리밍 모드용: Neo4j에서 직접 통계를 조회하여 JavaAnalysisStats 생성

    Args:
        graph_db: Neo4j GraphDB 인스턴스
        project_name: 프로젝트명
        logger: 로거 인스턴스
        start_time: 분석 시작 시간 (선택사항)
        end_time: 분석 종료 시간 (선택사항)

    Returns:
        JavaAnalysisStats: 통계 정보
    """
    if start_time is None:
        start_time = datetime.now()
    if end_time is None:
        end_time = datetime.now()

    try:
        # Neo4j에서 프로젝트별 통계 조회
        stats = graph_db.get_database_statistics(project_name)
        node_counts = stats.get("node_counts_by_label", {})

        # 각 라벨별 카운트 추출
        packages = node_counts.get("Package", 0)
        classes = node_counts.get("Class", 0)
        methods = node_counts.get("Method", 0)
        fields = node_counts.get("Field", 0)
        beans = node_counts.get("Bean", 0)
        endpoints = node_counts.get("Endpoint", 0)
        mybatis_mappers = node_counts.get("MyBatisMapper", 0)
        jpa_entities = node_counts.get("JpaEntity", 0)
        jpa_repositories = node_counts.get("JpaRepository", 0)
        jpa_queries = node_counts.get("JpaQuery", 0)
        config_files = node_counts.get("ConfigFile", 0)
        test_classes = node_counts.get("TestClass", 0)
        sql_statements = node_counts.get("SqlStatement", 0)

        logger.info(_t("pipeline.streaming_complete"))
        logger.info(f"  - Packages: {packages}")
        logger.info(f"  - Classes: {classes}")
        logger.info(f"  - Methods: {methods}")
        logger.info(f"  - Fields: {fields}")
        logger.info(f"  - Beans: {beans}")
        logger.info(f"  - Endpoints: {endpoints}")

        return JavaAnalysisStats(
            project_name=project_name,
            total_files=0,  # 스트리밍 모드에서는 파일 카운트 추적 안 함
            processed_files=0,
            error_files=0,
            packages=packages,
            classes=classes,
            methods=methods,
            fields=fields,
            beans=beans,
            endpoints=endpoints,
            mybatis_mappers=mybatis_mappers,
            jpa_entities=jpa_entities,
            jpa_repositories=jpa_repositories,
            jpa_queries=jpa_queries,
            config_files=config_files,
            test_classes=test_classes,
            sql_statements=sql_statements,
            start_time=start_time,
            end_time=end_time,
        )

    except Exception as e:
        logger.error(_t("summary.neo4j_query_failed", error=str(e)))
        # 빈 통계 반환
        return JavaAnalysisStats(
            project_name=project_name,
            packages=0,
            classes=0,
            methods=0,
            fields=0,
            beans=0,
            endpoints=0,
            mybatis_mappers=0,
            jpa_entities=0,
            jpa_repositories=0,
            jpa_queries=0,
            config_files=0,
            test_classes=0,
            sql_statements=0,
        )


def calculate_java_statistics(
    packages: Iterable[object],
    classes: Iterable[object],
    beans: Iterable[object],
    endpoints: Iterable[object],
    mappers: Iterable[object],
    entities: Iterable[object],
    repos: Iterable[object],
    queries: Iterable[object],
    config_files: Iterable[object],
    test_classes: Iterable[object],
    sql_statements: Iterable[object],
) -> JavaAnalysisStats:
    """Calculate aggregated statistics for Java analysis results."""
    packages_list = list(packages)
    classes_list = list(classes)
    beans_list = list(beans)
    endpoints_list = list(endpoints)
    mappers_list = list(mappers)
    entities_list = list(entities)
    repos_list = list(repos)
    queries_list = list(queries)
    config_list = list(config_files)
    tests_list = list(test_classes)
    sql_statements_list = list(sql_statements)
    total_methods = sum(len(class_obj.methods) for class_obj in classes_list)
    total_fields = sum(len(class_obj.properties) for class_obj in classes_list)

    return JavaAnalysisStats(
        packages=len(packages_list),
        classes=len(classes_list),
        methods=total_methods,
        fields=total_fields,
        beans=len(beans_list),
        endpoints=len(endpoints_list),
        mybatis_mappers=len(mappers_list),
        jpa_entities=len(entities_list),
        jpa_repositories=len(repos_list),
        jpa_queries=len(queries_list),
        config_files=len(config_list),
        test_classes=len(tests_list),
        sql_statements=len(sql_statements_list),
    )


def _log_quick_summary(
    overall_start_time: datetime,
    java_stats: Optional[JavaAnalysisStats],
    db_stats: Optional[DatabaseAnalysisStats],
    summary_lines: Optional[list[str]] = None,
) -> None:
    """Emit a concise analysis summary to the logger."""
    logger = get_logger(__name__, command="analyze")
    overall_end_time = datetime.now()
    overall_duration = (overall_end_time - overall_start_time).total_seconds()

    def _log(msg: str, *args):
        formatted_msg = msg % args if args else msg
        logger.info(formatted_msg)
        if summary_lines is not None:
            summary_lines.append(formatted_msg)

    _log("")
    _log("=" * 80)
    _log(_t("summary.quick_header"))
    _log("=" * 80)

    if java_stats:
        _log("Java Analysis:")
        _log(f"  - Packages: {java_stats.packages}")
        _log(f"  - Classes: {java_stats.classes}")
        _log(f"  - Methods: {java_stats.methods}")
        _log(f"  - Fields: {java_stats.fields}")
        _log(f"  - Spring Beans: {java_stats.beans}")
        _log(f"  - REST Endpoints: {java_stats.endpoints}")
        _log(f"  - MyBatis Mappers: {java_stats.mybatis_mappers}")
        _log(f"  - JPA Entities: {java_stats.jpa_entities}")
        _log(f"  - JPA Repositories: {java_stats.jpa_repositories}")
        _log(f"  - JPA Queries: {java_stats.jpa_queries}")
        _log(f"  - Config Files: {java_stats.config_files}")
        _log(f"  - Test Classes: {java_stats.test_classes}")
        _log(f"  - SQL Statements: {java_stats.sql_statements}")

    if db_stats:
        _log("Database Analysis:")
        _log(f"  - Databases: {db_stats.databases}")
        _log(f"  - Tables: {db_stats.tables}")
        _log(f"  - Columns: {db_stats.columns}")
        _log(f"  - Indexes: {db_stats.indexes}")
        _log(f"  - Constraints: {db_stats.constraints}")

    _log(f"Total Analysis Time: {format_duration(overall_duration)}")
    _log("=" * 80)
    _log(_t("summary.quick_end"))
    _log("")


def print_analysis_summary(
    overall_start_time: datetime,
    overall_end_time: datetime,
    java_stats: Optional[JavaAnalysisStats],
    db_stats: Optional[DatabaseAnalysisStats],
    dry_run: bool,
    graph_db=None,
    project_name: Optional[str] = None,
) -> str:
    """
    Print a detailed summary of the analysis execution and return the full summary text.
    """
    logger = get_logger(__name__, command="analyze")
    summary_lines = []

    def _log(msg: str, *args):
        formatted_msg = msg % args if args else msg
        logger.info(formatted_msg)
        summary_lines.append(formatted_msg)

    title = _t("summary.title_dryrun") if dry_run else _t("summary.title")
    total_duration = (overall_end_time - overall_start_time).total_seconds()

    _log("=" * 80)
    _log(f"                          {title}")
    _log("=" * 80)
    _log("")
    _log(_t("summary.work_time",
            start=overall_start_time.strftime("%Y-%m-%d %H:%M:%S"),
            end=overall_end_time.strftime("%Y-%m-%d %H:%M:%S")))
    _log(_t("summary.total_duration", duration=format_duration(total_duration)))
    _log("")

    if java_stats:
        duration = java_stats.duration_seconds
        _log("-" * 80)
        _log(_t("summary.java_header"))
        _log("-" * 80)
        if java_stats.start_time and java_stats.end_time:
            _log(_t("summary.java_work_time",
                    start=java_stats.start_time.strftime("%Y-%m-%d %H:%M:%S"),
                    end=java_stats.end_time.strftime("%Y-%m-%d %H:%M:%S")))
        if duration is not None:
            _log(_t("summary.java_duration", duration=format_duration(duration)))
        _log("")
        _log(_t("summary.java_result"))
        _log("  - Project: %s", java_stats.project_name or "N/A")

        if java_stats.total_files > 0:
            success_rate = (
                java_stats.processed_files / java_stats.total_files * 100
                if java_stats.total_files
                else 0.0
            )
            _log(_t("summary.java_files",
                    processed=format_number(java_stats.processed_files),
                    total=format_number(java_stats.total_files),
                    rate=f"{success_rate:.1f}"))
            if java_stats.error_files > 0:
                _log(_t("summary.java_errors", count=format_number(java_stats.error_files)))

        _log("  - Packages: %s", format_number(java_stats.packages))
        _log("  - Classes: %s", format_number(java_stats.classes))
        _log("  - Methods: %s", format_number(java_stats.methods))
        _log("  - Fields: %s", format_number(java_stats.fields))
        _log("  - Spring Beans: %s", format_number(java_stats.beans))
        _log("  - REST Endpoints: %s", format_number(java_stats.endpoints))
        _log("  - MyBatis Mappers: %s", format_number(java_stats.mybatis_mappers))
        _log("  - JPA Entities: %s", format_number(java_stats.jpa_entities))
        _log("  - JPA Repositories: %s", format_number(java_stats.jpa_repositories))
        _log("  - SQL Statements: %s", format_number(java_stats.sql_statements))

    if db_stats:
        _log("")
        _log("-" * 80)
        _log(_t("summary.db_header"))
        _log("-" * 80)
        if db_stats.start_time and db_stats.end_time:
            _log(_t("summary.java_work_time",
                    start=db_stats.start_time.strftime("%Y-%m-%d %H:%M:%S"),
                    end=db_stats.end_time.strftime("%Y-%m-%d %H:%M:%S")))
            duration = db_stats.duration_seconds
            if duration is not None:
                _log(_t("summary.java_duration", duration=format_duration(duration)))

        _log("  - DDL files: %s", format_number(db_stats.ddl_files))
        _log("  - Databases: %s", format_number(db_stats.databases))
        _log("  - Tables: %s", format_number(db_stats.tables))
        _log("  - Columns: %s", format_number(db_stats.columns))
        _log("  - Indexes: %s", format_number(db_stats.indexes))
        _log("  - Constraints: %s", format_number(db_stats.constraints))

    # Neo4j 실제 저장 통계 출력
    if graph_db and not dry_run:
        _log("")
        _log("-" * 80)
        _log(_t("summary.neo4j_header"))
        _log("-" * 80)

        try:
            # 전체 DB 통계 조회
            all_stats = graph_db.get_database_statistics(None)

            _log(_t("summary.neo4j_total"))
            _log(_t("summary.neo4j_nodes", count=format_number(all_stats["total_nodes"])))
            _log(_t("summary.neo4j_rels", count=format_number(all_stats["total_relationships"])))

            # 프로젝트별 통계가 의미있는 경우에만 추가 표시
            if project_name:
                project_stats = graph_db.get_database_statistics(project_name)
                if project_stats["total_nodes"] > 0:
                    _log("")
                    _log(_t("summary.neo4j_project", project_name=project_name))
                    _log(_t("summary.neo4j_project_nodes", count=format_number(project_stats["total_nodes"])))
                    _log(_t("summary.neo4j_project_rels", count=format_number(project_stats["total_relationships"])))

            if all_stats["node_counts_by_label"]:
                _log("")
                _log(_t("summary.neo4j_labels"))
                for label, count in all_stats["node_counts_by_label"].items():
                    _log("  - %s: %s", label, format_number(count))

            if all_stats["relationship_counts_by_type"]:
                _log("")
                _log(_t("summary.neo4j_rel_types"))
                for rel_type, count in all_stats["relationship_counts_by_type"].items():
                    _log("  - %s: %s", rel_type, format_number(count))

        except Exception as e:  # pylint: disable=broad-except
            logger.warning(_t("summary.neo4j_query_failed", error=str(e)))
            summary_lines.append(_t("summary.neo4j_query_failed", error=str(e)))

    _log_quick_summary(overall_start_time, java_stats, db_stats, summary_lines)

    return "\n".join(summary_lines)
