"""
Database parsing pipeline helpers.
"""
from __future__ import annotations

from datetime import datetime
from typing import Optional

from csa.models.analysis import DatabaseAnalysisStats
from csa.services.db_parser import DBParser
from csa.services.graph_db import GraphDB
from csa.utils.i18n import _t


def analyze_full_project_db(
    db: Optional[GraphDB],
    db_script_folder: Optional[str],
    project_name: str,
    dry_run: bool,
    logger,
) -> Optional[DatabaseAnalysisStats]:
    """Parse database scripts and optionally persist them into Neo4j."""
    if not db_script_folder:
        logger.info(_t("db_analysis.no_folder"))
        return None

    logger.info(_t("db_analysis.start", path=db_script_folder))
    db_parser = DBParser()
    db_start_time = datetime.now()
    all_db_objects = db_parser.parse_ddl_directory(db_script_folder, project_name)

    if not all_db_objects:
        logger.info(_t("db_analysis.no_objects"))
        return None

    logger.info(_t("db_analysis.found_files", count=len(all_db_objects)))

    grouped_objects = {}
    for obj in all_db_objects:
        db_name = obj["database"].name or "default"
        grouped_objects.setdefault(db_name, []).append(obj)

    logger.info(_t("db_analysis.found_databases", count=len(grouped_objects), names=list(grouped_objects.keys())))

    if dry_run:
        logger.info(_t("db_analysis.dryrun"))
        for db_name, objects in grouped_objects.items():
            logger.info("Database '%s': %s objects", db_name, len(objects))
        logger.info(_t("db_analysis.complete"))
        return None

    stats = DatabaseAnalysisStats(
        ddl_files=len(all_db_objects),
        databases=len(grouped_objects),
    )

    for db_name, objects in grouped_objects.items():
        logger.info(_t("db_analysis.processing", name=db_name))

        for obj in objects:
            db.add_database(obj["database"])

            for table in obj["tables"]:
                db.add_table(table, db_name)
                stats.tables += 1

            for column in obj["columns"]:
                db.add_column(column, column.table_name)
                stats.columns += 1

            for index, table_name in obj["indexes"]:
                db.add_index(index, table_name)
                stats.indexes += 1

            for constraint, table_name in obj["constraints"]:
                db.add_constraint(constraint, table_name)
                stats.constraints += 1

    stats.start_time = db_start_time
    stats.end_time = datetime.now()
    logger.info(_t("db_analysis.complete"))
    return stats


__all__ = ["analyze_full_project_db"]

