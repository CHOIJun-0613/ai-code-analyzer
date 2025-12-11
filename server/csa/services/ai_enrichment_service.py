"""
AI Enrichment Service - Add AI-generated descriptions to existing Neo4j nodes
"""
from __future__ import annotations

import asyncio
import os
from typing import Any, Dict, List, Optional

import click


class AIEnrichmentService:
    """Service to add AI-generated descriptions to nodes without ai_description."""

    def __init__(self, graph_db, ai_analyzer, logger):
        """
        Args:
            graph_db: GraphDB instance
            ai_analyzer: AIAnalyzer instance
            logger: Logger instance
        """
        self.db = graph_db
        self.analyzer = ai_analyzer
        self.logger = logger

    def _clean_ai_descriptions(self, project_name: str, node_type: str) -> None:
        """Clear ai_description fields for the specified project/node type."""
        normalized = (node_type or "all").lower()
        scopes: list[tuple[str, str]] = []

        if normalized in ("all", "class"):
            scopes.append((
                "Class",
                """
                MATCH (c:Class)
                WHERE c.project_name = $project_name
                SET c.ai_description = ''
                RETURN count(c) AS cnt
                """,
            ))

        if normalized in ("all", "method"):
            scopes.append((
                "Method",
                """
                MATCH (c:Class)-[:HAS_METHOD]->(m:Method)
                WHERE c.project_name = $project_name
                SET m.ai_description = ''
                RETURN count(m) AS cnt
                """,
            ))

        if normalized in ("all", "sql"):
            scopes.append((
                "SqlStatement",
                """
                MATCH (s:SqlStatement)
                WHERE s.project_name = $project_name
                SET s.ai_description = ''
                RETURN count(s) AS cnt
                """,
            ))

        if not scopes:
            self.logger.warning(f"Unknown node_type '{node_type}' for clean operation. Skipping cleanup.")
            return

        with self.db.driver.session(database=self.db.database) as session:
            for label, query in scopes:
                try:
                    result = session.run(query, project_name=project_name)
                    record = result.single()
                    cleaned = record["cnt"] if record and "cnt" in record else 0
                    self.logger.info(f"[CLEAN] {label}: cleared ai_description for {cleaned} nodes")
                except Exception as exc:
                    self.logger.error(f"[CLEAN] Failed to clear ai_description for {label}: {exc}")
                    raise

    async def enrich_project_async(
        self,
        project_name: str,
        node_type: str = "all",
        concurrent_requests: Optional[int] = None,
        limit: Optional[int] = None,
        clean: bool = False,
        target_class_name: Optional[str] = None,
        target_method_name: Optional[str] = None,
        target_mapper_name: Optional[str] = None,
        target_sql_id: Optional[str] = None,
        force: bool = False,
    ) -> Dict[str, Any]:
        """
        Enrich nodes in a project with AI-generated descriptions (비동기 병렬 처리).

        Args:
            project_name: Project name
            node_type: Node type to enrich (all, class, method, sql)
            concurrent_requests: Number of concurrent AI requests (None for env var)
            limit: Maximum number of nodes to process (None for all)
            target_class_name: Specific class name to force re-analysis
            target_method_name: Specific method name (requires class)
            target_mapper_name: Mapper name for SQL re-analysis
            target_sql_id: SQL identifier to re-analyze
            force: Force overwrite even if ai_description already exists
            clean: Remove existing ai_description values before re-analysis

        Returns:
            Dictionary with statistics
        """
        # 동시 요청 수 결정
        if concurrent_requests is None:
            concurrent_requests = int(os.getenv("CONCURRENT_AI_REQUESTS", "10"))

        stats = {
            "total_processed": 0,
            "success_count": 0,
            "fail_count": 0,
            "skipped_count": 0,
            "node_type_stats": {},
            "concurrent_requests": concurrent_requests
        }

        target_specified = any(
            value
            for value in (
                target_class_name,
                target_method_name,
                target_mapper_name,
                target_sql_id,
            )
        )
        force = force or target_specified

        if clean:
            self._clean_ai_descriptions(project_name, node_type)

        # 노드 타입별로 처리
        if node_type in ("all", "class"):
            class_stats = await self._enrich_classes_async(
                project_name,
                concurrent_requests,
                limit,
                class_name=target_class_name if node_type == "class" else None,
                force=force if node_type == "class" and (target_class_name or target_specified) else False,
            )
            stats["total_processed"] += class_stats["processed"]
            stats["success_count"] += class_stats["success"]
            stats["fail_count"] += class_stats["failed"]
            stats["skipped_count"] += class_stats["skipped"]
            stats["node_type_stats"]["Class"] = class_stats

        if node_type in ("all", "method"):
            method_stats = await self._enrich_methods_async(
                project_name,
                concurrent_requests,
                limit,
                class_name=target_class_name if target_method_name else None,
                method_name=target_method_name,
                force=force if node_type == "method" and (target_method_name or target_specified) else False,
            )
            stats["total_processed"] += method_stats["processed"]
            stats["success_count"] += method_stats["success"]
            stats["fail_count"] += method_stats["failed"]
            stats["skipped_count"] += method_stats["skipped"]
            stats["node_type_stats"]["Method"] = method_stats

        if node_type in ("all", "sql"):
            sql_stats = await self._enrich_sql_statements_async(
                project_name,
                concurrent_requests,
                limit,
                mapper_name=target_mapper_name if node_type == "sql" else None,
                sql_id=target_sql_id if node_type == "sql" else None,
                force=force if node_type == "sql" and (target_mapper_name or target_sql_id) else False,
            )
            stats["total_processed"] += sql_stats["processed"]
            stats["success_count"] += sql_stats["success"]
            stats["fail_count"] += sql_stats["failed"]
            stats["skipped_count"] += sql_stats["skipped"]
            stats["node_type_stats"]["SqlStatement"] = sql_stats

        return stats


    def enrich_project(
        self,
        project_name: str,
        node_type: str = "all",
        batch_size: int = 50,
        limit: Optional[int] = None,
        clean: bool = False,
        target_class_name: Optional[str] = None,
        target_method_name: Optional[str] = None,
        target_mapper_name: Optional[str] = None,
        target_sql_id: Optional[str] = None,
        force: bool = False,
    ) -> Dict[str, Any]:
        """
        Enrich nodes in a project with AI-generated descriptions (하위 호환성을 위한 동기 버전).

        Args:
            project_name: Project name
            node_type: Node type to enrich (all, class, method, sql)
            batch_size: Batch size for processing (deprecated, use concurrent_requests)
            limit: Maximum number of nodes to process (None for all)
            clean: Remove existing ai_description values before re-analysis

        Returns:
            Dictionary with statistics
        """
        # 비동기 메서드를 asyncio.run()으로 실행
        return asyncio.run(self.enrich_project_async(
            project_name=project_name,
            node_type=node_type,
            concurrent_requests=batch_size,  # batch_size를 concurrent_requests로 사용
            limit=limit,
            clean=clean,
            target_class_name=target_class_name,
            target_method_name=target_method_name,
            target_mapper_name=target_mapper_name,
            target_sql_id=target_sql_id,
            force=force,
        ))

    def _enrich_classes(
        self,
        project_name: str,
        batch_size: int,
        limit: Optional[int],
        class_name: Optional[str] = None,
        force: bool = False,
    ) -> Dict[str, int]:
        """Enrich Class nodes with AI descriptions."""
        stats = {"processed": 0, "success": 0, "failed": 0, "skipped": 0}

        # Neo4j 쿼리: ai_description이 비어있거나 없는 Class 노드 조회
        query = """
        MATCH (c:Class)
        WHERE c.project_name = $project_name
          AND (c.ai_description IS NULL OR c.ai_description = '')
          AND c.source IS NOT NULL AND c.source <> ''
        RETURN c.name as name,
               c.source as source,
               elementId(c) as node_id
        ORDER BY c.name
        """
        if limit:
            query += f" LIMIT {limit}"

        with self.db.driver.session(database=self.db.database) as session:
            result = session.run(query, project_name=project_name)
            classes = list(result)

        total = len(classes)
        if total == 0:
            self.logger.info("No Class nodes found that need AI enrichment")
            return stats

        self.logger.info(f"Found {total} Class nodes to enrich")
        self.logger.info(f"Processing {total} Class nodes...")

        # 배치 처리
        for i, record in enumerate(classes, 1):
            class_name = record["name"]
            source = record["source"]
            node_id = record["node_id"]

            try:
                # AI 분석
                ai_description = self.analyzer.analyze_class(source, class_name)

                if ai_description:
                    # Neo4j 업데이트
                    self._update_node_ai_description(node_id, ai_description)
                    stats["success"] += 1
                    self.logger.info(f"[{i}/{total}] Class enriched: {class_name}")
                else:
                    stats["failed"] += 1
                    self.logger.warning(f"[{i}/{total}] Class AI analysis returned empty: {class_name}")

            except Exception as exc:
                stats["failed"] += 1
                self.logger.error(f"[{i}/{total}] Class enrichment failed ({class_name}): {exc}")

            stats["processed"] += 1

            # 진행률 표시
            #if i % batch_size == 0 or i == total:
            if i <= total:
                self.logger.info(f"  Progress: {i}/{total} ({i*100//total}%) - Success: {stats['success']}, Failed: {stats['failed']}")

        return stats


    async def _enrich_classes_async(
        self,
        project_name: str,
        concurrent_requests: int,
        limit: Optional[int],
        class_name: Optional[str] = None,
        force: bool = False,
    ) -> Dict[str, int]:
        """Enrich Class nodes with AI descriptions (비동기 병렬 처리)."""
        stats = {"processed": 0, "success": 0, "failed": 0, "skipped": 0}

        conditions = [
            "c.project_name = $project_name",
            "c.source IS NOT NULL AND c.source <> ''",
        ]
        params: Dict[str, Any] = {"project_name": project_name}
        if not force:
            conditions.append("(c.ai_description IS NULL OR c.ai_description = '')")
        if class_name:
            conditions.append("c.name = $class_name")
            params["class_name"] = class_name

        where_clause = " AND ".join(conditions)
        query = f"""
        MATCH (c:Class)
        WHERE {where_clause}
        RETURN c.name as name,
               c.source as source,
               elementId(c) as node_id
        ORDER BY c.name
        """
        if limit:
            query += f" LIMIT {limit}"

        with self.db.driver.session(database=self.db.database) as session:
            result = session.run(query, **params)
            classes = list(result)

        total = len(classes)
        if total == 0:
            self.logger.info("No Class nodes found that need AI enrichment")
            return stats

        self.logger.info(f"Found {total} Class nodes to enrich")
        self.logger.info(f"Processing {total} Class nodes with {concurrent_requests} concurrent requests...")

        semaphore = asyncio.Semaphore(concurrent_requests)

        async def process_class(record, index):
            """Single Class node processing"""
            async with semaphore:
                class_name_val = record["name"]
                source = record["source"]
                node_id = record["node_id"]

                try:
                    ai_description = await self.analyzer.analyze_class_async(source, class_name_val)

                    if ai_description:
                        self._update_node_ai_description(node_id, ai_description)
                        self.logger.info(f"[{index}/{total}] Class enriched: {class_name_val}")
                        return {"status": "success"}
                    else:
                        self.logger.warning(f"[{index}/{total}] Class AI analysis returned empty: {class_name_val}")
                        return {"status": "failed"}

                except Exception as exc:
                    self.logger.error(f"[{index}/{total}] Class enrichment failed ({class_name_val}): {exc}")
                    return {"status": "failed"}

        tasks = [process_class(record, i + 1) for i, record in enumerate(classes)]
        results = await asyncio.gather(*tasks)

        for result in results:
            stats["processed"] += 1
            if result["status"] == "success":
                stats["success"] += 1
            else:
                stats["failed"] += 1

        self.logger.info(f"Completed: {total}/{total} (100%) - Success: {stats['success']}, Failed: {stats['failed']}")
        return stats


    async def _enrich_methods_async(
        self,
        project_name: str,
        concurrent_requests: int,
        limit: Optional[int],
        class_name: Optional[str] = None,
        method_name: Optional[str] = None,
        force: bool = False,
    ) -> Dict[str, int]:
        """Enrich Method nodes with AI descriptions (배치 처리)."""
        stats = {"processed": 0, "success": 0, "failed": 0, "skipped": 0}

        conditions = [
            "c.project_name = $project_name",
            "m.source IS NOT NULL AND m.source <> ''",
        ]
        params: Dict[str, Any] = {"project_name": project_name}
        if not force:
            conditions.append("(m.ai_description IS NULL OR m.ai_description = '')")
        if class_name:
            conditions.append("c.name = $class_name")
            params["class_name"] = class_name
        if method_name:
            conditions.append("m.name = $method_name")
            params["method_name"] = method_name

        where_clause = " AND ".join(conditions)
        query = f"""
        MATCH (c:Class)-[:HAS_METHOD]->(m:Method)
        WHERE {where_clause}
        RETURN c.name as class_name,
               m.name as method_name,
               m.source as source,
               elementId(m) as node_id
        ORDER BY c.name, m.name
        """
        if limit:
            query += f" LIMIT {limit}"

        with self.db.driver.session(database=self.db.database) as session:
            result = session.run(query, **params)
            methods = list(result)

        total = len(methods)
        if total == 0:
            self.logger.info("No Method nodes found")
            return stats

        self.logger.info(f"Found {total} Method nodes to enrich")
        self.logger.info(f"Processing {total} Method nodes with batch size 5...")

        batch_size = 5
        semaphore = asyncio.Semaphore(concurrent_requests)

        async def process_method_batch(batch_records, batch_start_index):
            """Process a batch of Method nodes."""
            async with semaphore:
                method_items = []
                node_id_map = {}
                skipped_methods = []

                for record in batch_records:
                    class_name_val = record["class_name"]
                    method_name_val = record["method_name"]
                    source = record["source"]
                    node_id = record["node_id"]

                    method_id = f"{class_name_val}.{method_name_val}"

                    is_valid = True
                    skip_reason = []

                    if not source or source.strip() == "":
                        is_valid = False
                        skip_reason.append("source is empty")

                    if not class_name_val or class_name_val.strip() == "":
                        is_valid = False
                        skip_reason.append("class_name is empty")

                    if not is_valid:
                        skipped_methods.append({
                            "method_id": method_id,
                            "node_id": node_id,
                            "reason": ", ".join(skip_reason)
                        })
                        try:
                            self._update_node_ai_description(node_id, "")
                            self.logger.debug(f"Method skipped (set to empty): {method_id} - {', '.join(skip_reason)}")
                        except Exception as exc:
                            self.logger.error(f"Method Neo4j update failed for skipped ({method_id}): {exc}")
                    else:
                        method_items.append({
                            "method_id": method_id,
                            "class_name": class_name_val,
                            "method_name": method_name_val,
                            "source": source
                        })
                        node_id_map[method_id] = {
                            "node_id": node_id,
                            "class_name": class_name_val,
                            "method_name": method_name_val
                        }

                batch_stats = {"success": 0, "failed": 0, "skipped": len(skipped_methods)}

                if method_items:
                    try:
                        batch_results = await self.analyzer.analyze_method_batch_async(method_items)

                        for method_id, ai_description in batch_results.items():
                            node_info = node_id_map.get(method_id)
                            if node_info and ai_description:
                                try:
                                    self._update_node_ai_description(node_info["node_id"], ai_description)
                                    batch_stats["success"] += 1
                                    self.logger.debug(f"Method enriched: {method_id}")
                                except Exception as exc:
                                    batch_stats["failed"] += 1
                                    self.logger.error(f"Method Neo4j update failed ({method_id}): {exc}")
                            else:
                                batch_stats["failed"] += 1

                        missing_count = len(method_items) - len(batch_results)
                        batch_stats["failed"] += missing_count

                    except Exception as exc:
                        self.logger.error(f"Method batch enrichment failed (batch {batch_start_index}): {exc}")
                        batch_stats["failed"] += len(method_items)

                batch_end_index = batch_start_index + len(batch_records)
                self.logger.info(
                    f"[{batch_start_index}-{batch_end_index}/{total}] "
                    f"Batch processed: Success={batch_stats['success']}, Failed={batch_stats['failed']}, Skipped={batch_stats['skipped']}"
                )

                return batch_stats

        batch_tasks = []
        for i in range(0, total, batch_size):
            batch = methods[i:i + batch_size]
            batch_tasks.append(process_method_batch(batch, i + 1))

        batch_results = await asyncio.gather(*batch_tasks)

        for batch_stat in batch_results:
            stats["processed"] += batch_stat["success"] + batch_stat["failed"] + batch_stat.get("skipped", 0)
            stats["success"] += batch_stat["success"]
            stats["failed"] += batch_stat["failed"]
            stats["skipped"] += batch_stat.get("skipped", 0)

        self.logger.info(f"Completed: {total}/{total} (100%) - Success: {stats['success']}, Failed: {stats['failed']}, Skipped: {stats['skipped']}")
        return stats

    def _enrich_sql_statements(
        self,
        project_name: str,
        batch_size: int,
        limit: Optional[int]
    ) -> Dict[str, int]:
        """Enrich SqlStatement nodes with AI descriptions."""
        stats = {"processed": 0, "success": 0, "failed": 0, "skipped": 0}

        # Neo4j 쿼리: ai_description이 비어있거나 없는 SqlStatement 노드 조회
        query = """
        MATCH (s:SqlStatement)
        WHERE s.project_name = $project_name
          AND (s.ai_description IS NULL OR s.ai_description = '')
          AND s.sql_content IS NOT NULL AND s.sql_content <> ''
        RETURN s.id as sql_id,
               s.mapper_name as mapper_name,
               s.sql_content as sql_content,
               elementId(s) as node_id
        ORDER BY s.mapper_name, s.id
        """
        if limit:
            query += f" LIMIT {limit}"

        with self.db.driver.session(database=self.db.database) as session:
            result = session.run(query, project_name=project_name)
            sql_statements = list(result)

        total = len(sql_statements)
        if total == 0:
            self.logger.info("No SqlStatement nodes found that need AI enrichment")
            return stats

        self.logger.info(f"Found {total} SqlStatement nodes to enrich")
        self.logger.info(f"Processing {total} SqlStatement nodes...")

        # 배치 처리
        for i, record in enumerate(sql_statements, 1):
            sql_id = record["sql_id"]
            mapper_name = record["mapper_name"]
            sql_content = record["sql_content"]
            node_id = record["node_id"]

            try:
                # AI 분석
                ai_description = self.analyzer.analyze_sql(sql_content, sql_id)

                if ai_description:
                    # Neo4j 업데이트
                    self._update_node_ai_description(node_id, ai_description)
                    stats["success"] += 1
                    self.logger.debug(f"[{i}/{total}] SQL enriched: {mapper_name}.{sql_id}")
                else:
                    stats["failed"] += 1
                    self.logger.warning(f"[{i}/{total}] SQL AI analysis returned empty: {mapper_name}.{sql_id}")

            except Exception as exc:
                stats["failed"] += 1
                self.logger.error(f"[{i}/{total}] SQL enrichment failed ({mapper_name}.{sql_id}): {exc}")

            stats["processed"] += 1

            # 진행률 표시
            #if i % batch_size == 0 or i == total:
            if i <= total:
                self.logger.info(f"  Progress: {i}/{total} ({i*100//total}%) - Success: {stats['success']}, Failed: {stats['failed']}")

        return stats


    async def _enrich_sql_statements_async(
        self,
        project_name: str,
        concurrent_requests: int,
        limit: Optional[int],
        mapper_name: Optional[str] = None,
        sql_id: Optional[str] = None,
        force: bool = False,
    ) -> Dict[str, int]:
        """Enrich SqlStatement nodes with AI descriptions (배치 처리)."""
        stats = {"processed": 0, "success": 0, "failed": 0, "skipped": 0}

        conditions = [
            "s.project_name = $project_name",
            "s.sql_content IS NOT NULL AND s.sql_content <> ''",
        ]
        params: Dict[str, Any] = {"project_name": project_name}
        if not force:
            conditions.append("(s.ai_description IS NULL OR s.ai_description = '')")
        if mapper_name:
            conditions.append("s.mapper_name = $mapper_name")
            params["mapper_name"] = mapper_name
        if sql_id:
            conditions.append("s.id = $sql_id")
            params["sql_id"] = sql_id

        where_clause = " AND ".join(conditions)
        query = f"""
        MATCH (s:SqlStatement)
        WHERE {where_clause}
        RETURN s.id as sql_id,
               s.mapper_name as mapper_name,
               s.sql_content as sql_content,
               elementId(s) as node_id
        ORDER BY s.mapper_name, s.id
        """
        if limit:
            query += f" LIMIT {limit}"

        with self.db.driver.session(database=self.db.database) as session:
            result = session.run(query, **params)
            sql_statements = list(result)

        total = len(sql_statements)
        if total == 0:
            self.logger.info("No SqlStatement nodes found")
            return stats

        self.logger.info(f"Found {total} SqlStatement nodes to enrich")
        self.logger.info(f"Processing {total} SqlStatement nodes with batch size 5...")

        batch_size = 5
        semaphore = asyncio.Semaphore(concurrent_requests)

        async def process_sql_batch(batch_records, batch_start_index):
            """Process a batch of SQL nodes."""
            async with semaphore:
                sql_items = []
                node_id_map = {}
                for record in batch_records:
                    sql_id_val = record["sql_id"]
                    sql_content = record["sql_content"]
                    node_id_val = record["node_id"]

                    sql_items.append({
                        "sql_id": sql_id_val,
                        "sql_content": sql_content
                    })
                    node_id_map[sql_id_val] = {
                        "node_id": node_id_val,
                        "mapper_name": record["mapper_name"]
                    }

                try:
                    batch_results = await self.analyzer.analyze_sql_batch_async(sql_items)

                    batch_stats = {"success": 0, "failed": 0}

                    for sql_id_val, ai_description in batch_results.items():
                        node_info = node_id_map.get(sql_id_val)
                        if node_info and ai_description:
                            try:
                                self._update_node_ai_description(node_info["node_id"], ai_description)
                                batch_stats["success"] += 1
                                mapper_name_val = node_info["mapper_name"]
                                self.logger.debug(f"SQL enriched: {mapper_name_val}.{sql_id_val}")
                            except Exception as exc:
                                batch_stats["failed"] += 1
                                self.logger.error(f"SQL Neo4j update failed ({sql_id_val}): {exc}")
                        else:
                            batch_stats["failed"] += 1

                    missing_count = len(sql_items) - len(batch_results)
                    batch_stats["failed"] += missing_count

                    batch_end_index = batch_start_index + len(batch_records)
                    self.logger.info(
                        f"[{batch_start_index}-{batch_end_index}/{total}] "
                        f"Batch processed: Success={batch_stats['success']}, Failed={batch_stats['failed']}"
                    )

                    return batch_stats

                except Exception as exc:
                    self.logger.error(f"SQL batch enrichment failed (batch {batch_start_index}): {exc}")
                    return {"success": 0, "failed": len(batch_records)}

        batch_tasks = []
        for i in range(0, total, batch_size):
            batch = sql_statements[i:i + batch_size]
            batch_tasks.append(process_sql_batch(batch, i + 1))

        batch_results = await asyncio.gather(*batch_tasks)

        for batch_stat in batch_results:
            stats["processed"] += batch_stat["success"] + batch_stat["failed"]
            stats["success"] += batch_stat["success"]
            stats["failed"] += batch_stat["failed"]

        self.logger.info(f"Completed: {total}/{total} (100%) - Success: {stats['success']}, Failed: {stats['failed']}")
        return stats

    def _update_node_ai_description(self, node_id: str, ai_description: str) -> None:
        """
        Update node's ai_description in Neo4j.

        Args:
            node_id: Neo4j element ID
            ai_description: AI-generated description
        """
        query = """
        MATCH (n)
        WHERE elementId(n) = $node_id
        SET n.ai_description = $ai_description
        """
        with self.db.driver.session(database=self.db.database) as session:
            session.run(query, node_id=node_id, ai_description=ai_description)


__all__ = ["AIEnrichmentService"]
