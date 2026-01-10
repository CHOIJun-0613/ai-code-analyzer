"""
High-level orchestration for project analysis.
"""
from __future__ import annotations

import os
from datetime import datetime
from typing import Dict, Optional

from csa.utils.context import get_client_id, get_job_id

from csa.models.analysis import AnalysisResult, DatabaseAnalysisStats, JavaAnalysisStats
from csa.models.graph_entities import Project
from csa.models.analysis import AnalysisResult, DatabaseAnalysisStats, JavaAnalysisStats, JavaAnalysisArtifacts
from csa.models.graph_entities import Project
from csa.services.analysis.db_pipeline import analyze_full_project_db
from csa.services.analysis.java_pipeline import analyze_full_project_java
from csa.services.java_analysis.project import parse_single_java_file
from csa.services.analysis.neo4j_writer import save_java_objects_to_neo4j, connect_to_neo4j_db
from csa.services.analysis.summary import print_analysis_summary
from csa.services.graph_db import GraphDB


def _prepare_database(
    dry_run: bool,
    clean: bool,
    all_objects: bool,
    java_object: bool,
    db_object: bool,
    neo4j_uri: str,
    neo4j_user: str,
    neo4j_password: Optional[str],
    neo4j_database: str,
    project_name: str,
    logger,
) -> Optional[GraphDB]:
    """Initialise GraphDB connection and perform optional cleanup."""
    if dry_run:
        logger.info("Running in dry-run mode - no database operations will be performed")
        return None

    if not neo4j_password:
        raise ValueError("NEO4J_PASSWORD is required for database operations")

    db = GraphDB(neo4j_uri, neo4j_user, neo4j_password, neo4j_database)

    if clean:
        # 인덱스는 유지 (MERGE 성능 유지)
        # clean_database()로 데이터만 삭제되고 인덱스는 남음

        if all_objects:
            logger.info(f"Cleaning all objects for project '{project_name}'...")
            db.clean_database(project_name)
            logger.info(f"All objects for project '{project_name}' cleaned successfully")
        elif java_object:
            logger.info(f"Cleaning Java objects for project '{project_name}'...")
            db.clean_java_objects(project_name)
            logger.info(f"Java objects for project '{project_name}' cleaned successfully")
        elif db_object:
            logger.info("Cleaning DB objects (shared across all projects)...")
            db.clean_db_objects()
            logger.info("DB objects cleaned successfully")

    # 인덱스 확인 및 생성 (없으면 생성, 있으면 건너뜀)
    # 데이터 저장 전에 실행하여 MERGE 성능 보장
    logger.info("")
    db.ensure_indexes()
    logger.info("")

    return db


def _resolve_db_script_folder(db_script_folder: Optional[str], logger) -> Optional[str]:
    """Resolve DB script folder from arguments or environment."""
    if db_script_folder:
        return db_script_folder

    env_folder = os.getenv("DB_SCRIPT_FOLDER")
    if env_folder:
        logger.info("Using DB_SCRIPT_FOLDER from environment: %s", env_folder)
    return env_folder


def _resolve_project_path(java_source_folder: Optional[str]) -> str:
    """Return absolute project path when available."""
    if not java_source_folder:
        return ""

    try:
        normalized_path = os.path.abspath(java_source_folder)
    except (TypeError, OSError):
        return ""

    if not os.path.exists(normalized_path):
        return ""

    return normalized_path


def _count_project_files(project_path: str) -> int:
    """Count every file under the project path excluding hidden directories."""
    if not project_path or not os.path.isdir(project_path):
        return 0

    total_files = 0
    for _, dirnames, filenames in os.walk(project_path):
        dirnames[:] = [dirname for dirname in dirnames if not dirname.startswith(".")]
        total_files += len(filenames)
    return total_files


def analyze_project(
    java_source_folder: str,
    project_name: str,
    application_name: Optional[str],
    db_script_folder: Optional[str],
    neo4j_uri: str,
    neo4j_user: str,
    neo4j_password: Optional[str],
    neo4j_database: str,
    clean: bool,
    dry_run: bool,
    java_object: bool,
    db_object: bool,
    all_objects: bool,
    class_name: Optional[str],
    update: bool,
    logger,
    use_ai: bool = False,  # backward compatibility
    skip_dto_source: bool = True,
    skip_dto_methods: bool = True,
    scope: str = 'all',
    ai_options: Optional[Dict] = None,
    source_options: Optional[Dict] = None,
    use_ai_analysis: bool = False,
) -> Dict[str, object]:
    """Analyze project artifacts and optionally persist them into Neo4j."""
    
    # Cancellation Check Helper
    # Cancellation Check Helper
    def check_cancellation(job_id: str, logger):
        if not job_id: return
        
        # 1. Check flag file
        current_dir = os.path.dirname(os.path.abspath(__file__))
        # handlers.py -> analysis -> services -> csa -> server
        # We need to go up 3 levels to reach 'server' directory from 'server/csa/services/analysis'
        server_root = os.path.dirname(os.path.dirname(os.path.dirname(current_dir)))
        logs_dir = os.path.join(server_root, "logs")
        cancel_path = os.path.join(logs_dir, f"{job_id}.cancel")
        
        if os.path.exists(cancel_path):
            logger.warning(f"Cancellation flag detected for job {job_id} at {cancel_path}")
            # Cleanup flag
            try:
                os.remove(cancel_path)
            except:
                pass
            raise KeyboardInterrupt("Analysis canceled by user request")

    overall_start_time = datetime.now()
    resolved_db_folder = _resolve_db_script_folder(db_script_folder, logger)
    java_stats: Optional[JavaAnalysisStats] = None
    db_stats: Optional[DatabaseAnalysisStats] = None
    db: Optional[GraphDB] = None
    project_path = _resolve_project_path(java_source_folder)
    fallback_project_name = ""
    fallback_source = project_path or java_source_folder or ""
    if not project_name and fallback_source:
        normalized_source = os.path.normpath(str(fallback_source))
        candidate = os.path.basename(normalized_source.rstrip("\\/"))
        if candidate not in ("", ".", "..", os.path.sep):
            fallback_project_name = candidate
    effective_project_name = project_name or fallback_project_name or ""
    timestamp = overall_start_time.strftime("%Y/%m/%d %H:%M:%S.%f")[:-3]

    # Analysis History Tracking
    analysis_status = "Failed"  # Default status
    job_id = get_job_id() or "Server CLI analysis"
    user_id = get_client_id() or "Server CLI"
    
    # Configuration from options
    seq_packages = ""
    if source_options and 'sequence_diagram_include_packages' in source_options:
        seq_packages = source_options['sequence_diagram_include_packages'] or ""

    project_entity = Project(
        name=effective_project_name,
        description="",
        ai_description="",
        application_name=application_name or "",
        number_of_files=_count_project_files(project_path),
        path=project_path,
        created_at=timestamp,
        updated_at=timestamp,
        sequence_diagram_include_packages=seq_packages,
    )
    project_name = project_entity.name

    try:
        db = _prepare_database(
            dry_run,
            clean,
            all_objects,
            java_object,
            db_object,
            neo4j_uri,
            neo4j_user,
            neo4j_password,
            neo4j_database,
            project_name,
            logger,
        )

        # [FIX] Streaming 모드에서 Package/Class 저장 시 Project 노드가 존재해야 관계가 생성됨
        if db and not dry_run:
            db.add_project(project_entity)

        # Check Cancellation
        check_cancellation(job_id, logger)

        # DB 분석을 먼저 수행하여 스키마 정보를 Neo4j에 저장
        if all_objects or db_object:
            if resolved_db_folder:
                if os.path.exists(resolved_db_folder):
                    db_stats = analyze_full_project_db(db, resolved_db_folder, project_name, dry_run, logger)
                else:
                    logger.warning("Database script folder does not exist: %s", resolved_db_folder)
                    logger.info("Please check the DB_SCRIPT_FOLDER path in your .env file or use --db-script-folder option")
            else:
                logger.warning("Database script folder not provided - skipping database analysis")
                logger.info("To analyze database objects, use --db-script-folder option to specify the path to SQL script files")

        # Check Cancellation
        check_cancellation(job_id, logger)

        # Java 분석을 나중에 수행하여 DB 스키마와의 관계를 정확하게 연결
        if all_objects or java_object:
            artifacts, final_project_name = analyze_full_project_java(
                java_source_folder,
                project_name,
                logger,
                graph_db=db,  # 스트리밍 모드를 위해 graph_db 전달
                ai_options=ai_options,
                source_options=source_options,
                use_ai_analysis=use_ai_analysis,
                stop_check_callback=lambda: check_cancellation(job_id, logger),
                skip_dto_source=skip_dto_source,
                skip_dto_methods=skip_dto_methods,
            )
            
            # Check Cancellation
            check_cancellation(job_id, logger)

            if final_project_name:
                project_entity.name = final_project_name
                project_name = final_project_name

            # 스트리밍/배치 모드 모두 save_java_objects_to_neo4j() 호출
            # 이 함수는 내부에서 스트리밍 모드를 자동 감지하여
            # - 스트리밍 모드: Neo4j에서 모든 클래스 조회하여 Project 통계 계산
            # - 배치 모드: artifacts의 클래스로 Project 통계 계산
            java_stats = save_java_objects_to_neo4j(
                db,
                artifacts,
                project_entity,
                clean,
                logger,
                java_source_folder=project_path,
            )

        # 인덱스는 이미 데이터 저장 전에 생성됨

        overall_end_time = datetime.now()
        summary_text = print_analysis_summary(overall_start_time, overall_end_time, java_stats, db_stats, dry_run, db, project_name)

        result = AnalysisResult(
            success=True,
            java_stats=java_stats,
            db_stats=db_stats,
            message="Analysis completed successfully",
        )
        analysis_status = "Completed"

        return {
            "success": True,
            "message": result.message,
            "stats": {
                "java_stats": result.java_stats.dict() if result.java_stats else None,
                "db_stats": result.db_stats.dict() if result.db_stats else None,
            },
        }

    except KeyboardInterrupt:
        analysis_status = "Canceled"
        summary_text = "Analysis canceled by user."
        raise
    except Exception as exc:  # pylint: disable=broad-except
        analysis_status = "Failed"
        summary_text = f"Analysis failed: {exc}"
        logger.error("Analysis error: %s", exc)
        return {"success": False, "error": str(exc)}
    finally:
        if db:
            try:
                overall_end_time = datetime.now()
                duration_delta = overall_end_time - overall_start_time
                total_seconds = int(duration_delta.total_seconds())
                hours, remainder = divmod(total_seconds, 3600)
                minutes, seconds = divmod(remainder, 60)
                duration_str = f"{hours:02d}:{minutes:02d}:{seconds:02d}"

                if not summary_text:
                     # Exception 상황에서 초기화 안되었을 경우 대비
                     summary_text = f"Analysis {analysis_status}."

                # Construct preferences JSON
                import json
                preferences_dict = {
                    "clean": clean,
                    "dry_run": dry_run,
                    "scope": scope,
                    "java_object": java_object,
                    "db_object": db_object,
                    "all_objects": all_objects,
                    "update": update,
                    "skip_dto_source": skip_dto_source,
                    "skip_dto_methods": skip_dto_methods,
                    "use_ai": use_ai,  # backward compatibility
                    "use_ai_analysis": use_ai_analysis,
                    "ai_options": ai_options,
                    "source_options": source_options,
                }
                
                # Filter out None values for cleaner JSON
                preferences_dict = {k: v for k, v in preferences_dict.items() if v is not None}
                
                # Separate Static and AI Options
                ai_config_keys = [
                    "ai_options",
                    "use_ai",
                    "use_ai_analysis"
                ]

                preferences_static = {k: v for k, v in preferences_dict.items() if k not in ai_config_keys}
                preferences_ai = {k: v for k, v in preferences_dict.items() if k in ai_config_keys}
                
                # If specific AI options are provided in 'ai_options' dictionary, merge them up (optional, but keeps clean)
                # But 'ai_options' usually contains 'provider', 'model_name' etc.
                # So we can just keep 'ai_options' inside 'preferences_ai'

                try:
                    preferences_json = json.dumps(preferences_static, ensure_ascii=False)
                    preferences_ai_json = json.dumps(preferences_ai, ensure_ascii=False)
                except Exception:
                    preferences_json = "{}"
                    preferences_ai_json = "{}"

                analysis_type = "AI" if use_ai_analysis else "Static"

                db.save_analysis_history(
                    job_id=job_id,
                    start_time=overall_start_time,
                    end_time=overall_end_time,
                    duration=duration_str,
                    file_count=project_entity.number_of_files,
                    result=analysis_status,
                    user_id=user_id,
                    summary=summary_text,
                    project_name=project_entity.name,
                    preferences=preferences_json,
                    preferences_ai=preferences_ai_json,
                    analysis_type=analysis_type,
                )
            except Exception as history_exc:
                logger.error(f"Failed to save analysis history: {history_exc}")

            db.close()



def analyze_single_class(
    project_name: str,
    target_file_path: str,
    logger,
    graph_db: Optional[GraphDB] = None,
    ai_options: dict = None,
    use_ai_analysis: bool = False,
    skip_dto_source: bool = True,
    skip_dto_methods: bool = True,
) -> Dict[str, object]:
    """
    Analyze a single Java class file and update the Graph DB.
    """
    if not os.path.exists(target_file_path):
        return {"success": False, "message": f"File not found: {target_file_path}"}

    logger.info(f"Analyzing single class: {target_file_path} (Project: {project_name})")

    # Connect to DB if not provided
    if graph_db is None:
        try:
            neo4j_uri = os.getenv("NEO4J_URI", "bolt://localhost:7687")
            neo4j_user = os.getenv("NEO4J_USER", "neo4j")
            neo4j_password = os.getenv("NEO4J_PASSWORD")
            neo4j_database = os.getenv("NEO4J_DATABASE", "neo4j")
            
            if not neo4j_password:
                logger.error("NEO4J_PASSWORD not set")
                return {"success": False, "message": "Backend configuration error (DB password missing)"}

            graph_db = connect_to_neo4j_db(neo4j_uri, neo4j_user, neo4j_password, neo4j_database, logger)
        except Exception as e:
             logger.error(f"Failed to connect to Neo4j: {e}")
             return {"success": False, "message": f"Database connection failed: {e}"}

    logger.info(f"Analysis Params - Use AI: {use_ai_analysis}, AI Options: {ai_options}, Skip DTO Source: {skip_dto_source}, Skip DTO Methods: {skip_dto_methods}")

    # 1. Parse File
    package_node, class_node, inner_classes, source_hashcode = parse_single_java_file(
        target_file_path, 
        project_name, 
        graph_db, 
        ai_options, 
        use_ai_analysis,
        skip_dto_source=skip_dto_source,
        skip_dto_methods=skip_dto_methods
    )

    if not class_node:
        if source_hashcode == "SKIPPED_UNCHANGED":
            return {"success": True, "message": "Skipped (Unchanged)"}
        return {"success": False, "message": "Failed to parse class"}

    # 2. Construct Artifacts
    all_classes = [class_node] + inner_classes
    pkgs = [package_node] if package_node else []
    
    class_to_pkg = {}
    if package_node:
        for c in all_classes:
            class_to_pkg[c.name] = package_node.name

    from datetime import datetime
    timestamp = datetime.now()

    artifacts = JavaAnalysisArtifacts(
        packages=pkgs,
        classes=all_classes,
        class_to_package_map=class_to_pkg,
        
        beans=[],
        dependencies=[],
        endpoints=[],
        mybatis_mappers=[],
        jpa_entities=[],
        jpa_repositories=[],
        jpa_queries=[],
        config_files=[],
        test_classes=[],
        sql_statements=[],
        project_name=project_name,
        metadata={}
    )

    # 3. Save to Neo4j
    if graph_db:
        # Save Class and Package
        if package_node:
            graph_db.add_package(package_node, project_name)
        
        for c in all_classes:
            graph_db.add_class(c, package_node.name if package_node else "", project_name)
            
        # Save derived objects (Beans, Mybatis, etc.) using the helper that extracts them
        from csa.services.analysis.neo4j_writer import add_single_class_objects
        add_single_class_objects(graph_db, class_node, package_node.name if package_node else "", project_name, logger)
        
    return {"success": True, "message": f"Class {class_node.name} re-analyzed successfully"}

__all__ = ["analyze_project", "analyze_single_class"]


