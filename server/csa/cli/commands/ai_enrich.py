"""
AI Enrichment command - Add AI-generated descriptions to existing Neo4j nodes
"""
import os
from datetime import datetime

import click

from csa.cli.core.lifecycle import with_command_lifecycle
from csa.services.graph_db import GraphDB
from csa.utils.logger import get_logger, set_command_context


def _ensure_password() -> str | None:
    from csa.utils.logger import get_logger
    logger = get_logger(__name__)
    password = os.getenv("NEO4J_PASSWORD")
    if not password:
        logger.error("Error: NEO4J_PASSWORD environment variable is not set.")
        logger.error("Please set NEO4J_PASSWORD in your .env file or environment variables.")
    return password


@click.command(name="ai-enrich")
@click.option("--neo4j-uri", default=os.getenv("NEO4J_URI", "bolt://localhost:7687"), help="Neo4j URI")
@click.option("--neo4j-user", default=os.getenv("NEO4J_USER", "neo4j"), help="Neo4j username")
@click.option("--neo4j-database", default=os.getenv("NEO4J_DATABASE", "neo4j"), help="Neo4j database name")
@click.option("--project-name", required=True, help="Project name to enrich")
@click.option(
    "--node-type",
    default="all",
    type=click.Choice(["all", "class", "method", "sql"], case_sensitive=False),
    help="Node type to enrich (default: all)",
)
@click.option(
    "--concurrent",
    default=None,
    type=int,
    help="Number of concurrent AI requests (default: CONCURRENT_AI_REQUESTS env var or 10)",
)
@click.option(
    "--batch-size",
    default=None,
    type=int,
    help="Deprecated: use --concurrent instead",
)
@click.option(
    "--limit",
    default=None,
    type=int,
    help="Maximum number of nodes to process (default: all)",
)
@click.option(
    "--clean",
    is_flag=True,
    help="Clear ai_description for the selected project/node-type before re-analysis",
)
@click.option("--class-name", default=None, help="Target a specific Class node")
@click.option(
    "--method-name",
    default=None,
    help="Target a specific Method node (requires --class-name)",
)
@click.option(
    "--mapper-name",
    default=None,
    help="Target a specific SqlStatement mapper (requires --sql-id)",
)
@click.option(
    "--sql-id",
    default=None,
    help="Target a specific SqlStatement id (requires --mapper-name)",
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
):
    """Add AI-generated descriptions to existing Neo4j nodes without ai_description (with async parallel processing)."""

    # 명령어 실행 직전에 컨텍스트 설정
    set_command_context("ai-enrich")
    logger = get_logger(__name__, command="ai-enrich")

    result = {"success": False, "message": "", "stats": {}, "error": None}

    neo4j_password = _ensure_password()
    if not neo4j_password:
        result["error"] = "NEO4J_PASSWORD not set"
        return result

    # AI 분석기 가용성 확인
    try:
        from csa.aiwork.ai_analyzer import get_ai_analyzer
        analyzer = get_ai_analyzer()
        if not analyzer.is_available():
            result["error"] = "AI analyzer is not available. Please check your AI configuration in .env file."
            logger.error(result["error"])
            return result
    except Exception as exc:
        result["error"] = f"Failed to initialize AI analyzer: {exc}"
        logger.error(result["error"])
        return result

    # Targeted 재분석 옵션 처리
    target_params: dict[str, str | None] = {
        "target_class_name": None,
        "target_method_name": None,
        "target_mapper_name": None,
        "target_sql_id": None,
    }
    force_mode = False

    if method_name and not class_name:
        result["error"] = "--method-name requires --class-name"
        logger.error(result["error"])
        return result

    if (mapper_name and not sql_id) or (sql_id and not mapper_name):
        result["error"] = "--mapper-name and --sql-id must be used together"
        logger.error(result["error"])
        return result

    if class_name and mapper_name:
        result["error"] = "Choose either class/method targeting or mapper/sql targeting"
        logger.error(result["error"])
        return result

    if clean and (class_name or method_name or mapper_name or sql_id):
        result["error"] = "--clean cannot be combined with --class-name/--method-name/--mapper-name/--sql-id"
        logger.error(result["error"])
        return result

    if class_name:
        target_params["target_class_name"] = class_name
        if method_name:
            node_type = "method"
            target_params["target_method_name"] = method_name
            force_mode = True
            logger.info(f"Targeting Method {class_name}.{method_name} (force re-analysis)")
        else:
            node_type = "class"
            force_mode = True
            logger.info(f"Targeting Class {class_name} (force re-analysis)")

    if mapper_name and sql_id:
        target_params["target_mapper_name"] = mapper_name
        target_params["target_sql_id"] = sql_id
        node_type = "sql"
        force_mode = True
        logger.info(f"Targeting SqlStatement {mapper_name}.{sql_id} (force re-analysis)")

    # concurrent 옵션 결정 (하위 호환성)
    if concurrent is None and batch_size is not None:
        concurrent = batch_size
        logger.warning("--batch-size is deprecated. Use --concurrent instead.")

    # concurrent가 여전히 None이면 환경변수 또는 기본값 사용
    if concurrent is None:
        concurrent = int(os.getenv("CONCURRENT_AI_REQUESTS", "10"))

    try:
        db = GraphDB(neo4j_uri, neo4j_user, neo4j_password, neo4j_database)

        logger.info("=" * 80)
        logger.info("AI Enrichment - Add AI descriptions to existing nodes (Async Parallel Processing)")
        logger.info("=" * 80)
        logger.info(f"Project: {project_name}")
        logger.info(f"Node type: {node_type}")
        logger.info(f"Concurrent requests: {concurrent}")
        if limit:
            logger.info(f"Limit: {limit} nodes")
        logger.info("")

        start_time = datetime.now()

        # AI enrichment 서비스 임포트 및 실행
        from csa.services.ai_enrichment_service import AIEnrichmentService

        enrichment_service = AIEnrichmentService(db, analyzer, logger)

        stats = enrichment_service.enrich_project(
            project_name=project_name,
            node_type=node_type,
            batch_size=concurrent,
            limit=limit,
            clean=clean,
            target_class_name=target_params["target_class_name"],
            target_method_name=target_params["target_method_name"],
            target_mapper_name=target_params["target_mapper_name"],
            target_sql_id=target_params["target_sql_id"],
            force=force_mode,
        )

        end_time = datetime.now()
        duration = (end_time - start_time).total_seconds()

        logger.info("")
        logger.info("=" * 80)
        logger.info("AI Enrichment Summary")
        logger.info("=" * 80)
        logger.info(f"Total nodes processed: {stats['total_processed']}")
        logger.info(f"Successfully enriched: {stats['success_count']}")
        logger.info(f"Failed: {stats['fail_count']}")
        logger.info(f"Skipped (already has ai_description): {stats['skipped_count']}")
        logger.info(f"Duration: {duration:.2f} seconds")

        if stats['success_count'] > 0:
            logger.info(f"Average time per node: {duration / stats['total_processed']:.2f} seconds")

        if stats['node_type_stats']:
            logger.info("")
            logger.info("By Node Type:")
            for node_type_name, type_stats in stats['node_type_stats'].items():
                logger.info(f"  {node_type_name}:")
                logger.info(f"    - Processed: {type_stats['processed']}")
                logger.info(f"    - Success: {type_stats['success']}")
                logger.info(f"    - Failed: {type_stats['failed']}")

        result["success"] = True
        result["message"] = "AI enrichment completed successfully"
        result["stats"] = stats

    except Exception as exc:
        logger.error(f"AI enrichment error: {exc}")
        result["error"] = str(exc)
        logger.error(f"Error during AI enrichment: {exc}")
    finally:
        if db:
            db.close()

    return result


def register(cli: click.Group) -> None:
    """Attach the ai-enrich command to the given CLI group."""
    cli.add_command(ai_enrich_command)


__all__ = ["register"]
