from __future__ import annotations

import json
from typing import Any, Optional

from csa.models.graph_entities import Package, Project
from csa.services.graph_db.base import GraphDBBase
from csa.utils.logger import get_logger



class ProjectMixin:
    """Manage project, package, and class nodes."""

    def add_project(self, project: Project) -> None:
        """Add or update a project node."""
        self._execute_write(self._create_project_node_tx, project)

    @staticmethod
    def _create_project_node_tx(tx, project: Project) -> None:
        """Transaction that creates or updates a project node."""
        current_timestamp = GraphDBBase._get_current_timestamp()
        created_at = project.created_at if project.created_at else current_timestamp
        project_query = (
            "MERGE (p:Project {name: $name}) "
            "SET p:Analysis, p.description = $description, "
            "p.ai_description = $ai_description, "
            "p.application_name = $application_name, "
            "p.number_of_files = $number_of_files, "
            "p.path = $path, "
            "p.framework = COALESCE(p.framework, $framework), "
            "p.repository = COALESCE(p.repository, $repository), "
            "p.updated_at = $updated_at, "
            "p.created_at = COALESCE(p.created_at, $created_at), "
            "p.total_file_count = $total_file_count, "
            "p.total_java_file_count = $total_java_file_count, "
            "p.total_xml_file_count = $total_xml_file_count, "
            "p.total_config_file_count = $total_config_file_count, "
            "p.total_ddl_file_count = $total_ddl_file_count, "
            "p.total_other_analyzed_file_count = $total_other_analyzed_file_count, "
            "p.total_ignored_file_count = $total_ignored_file_count, "
            "p.total_etc_file_count = $total_etc_file_count, "
            "p.total_PLOC = $total_PLOC, "
            "p.total_LLOC = $total_LLOC, "
            "p.total_CLOC = $total_CLOC, "
            "p.sequence_diagram_include_packages = $sequence_diagram_include_packages"
        )
        tx.run(
            project_query,
            name=project.name or "",
            description=project.description or "",
            ai_description=project.ai_description or "",
            application_name=project.application_name or "",
            number_of_files=int(project.number_of_files or 0),
            path=project.path or "",
            framework=project.framework or "",
            repository=project.repository or "",
            updated_at=current_timestamp,
            created_at=created_at,
            total_file_count=int(project.total_file_count or 0),
            total_java_file_count=int(project.total_java_file_count or 0),
            total_xml_file_count=int(project.total_xml_file_count or 0),
            total_config_file_count=int(project.total_config_file_count or 0),
            total_ddl_file_count=int(project.total_ddl_file_count or 0),
            total_other_analyzed_file_count=int(project.total_other_analyzed_file_count or 0),
            total_ignored_file_count=int(project.total_ignored_file_count or 0),
            total_etc_file_count=int(project.total_etc_file_count or 0),
            total_PLOC=int(project.total_PLOC or 0),
            total_LLOC=int(project.total_LLOC or 0),
            total_CLOC=int(project.total_CLOC or 0),
            sequence_diagram_include_packages=project.sequence_diagram_include_packages or "",
        )

    def add_package(self, package_node: Package, project_name: str) -> None:
        """Add or update a package node."""
        self.add_packages_batch([package_node], project_name)

    def add_packages_batch(self, packages: list[Package], project_name: str) -> None:
        """
        여러 패키지를 배치로 한 번에 저장 (성능 최적화)

        Args:
            packages: Package 노드 리스트
            project_name: 프로젝트명
        """
        if not packages:
            return
        self._execute_write(self._create_packages_batch_tx, packages, project_name)

    @staticmethod
    def _create_packages_batch_tx(tx, packages: list[Package], project_name: str) -> None:
        """
        여러 패키지를 배치로 생성하는 트랜잭션

        Args:
            tx: Neo4j 트랜잭션
            packages: Package 노드 리스트
            project_name: 프로젝트명
        """
        current_timestamp = GraphDBBase._get_current_timestamp()

        # 1. Package 노드 배치 생성
        package_records = []
        for pkg in packages:
            package_records.append({
                'name': pkg.name,
                'project_name': project_name,
                'description': pkg.description or "",
                'ai_description': pkg.ai_description or "",
                'updated_at': current_timestamp,
            })

        if package_records:
            tx.run(
                """
                UNWIND $packages AS pkg
                MERGE (p:Package {name: pkg.name})
                SET p:Analysis, p.project_name = pkg.project_name,
                    p.description = pkg.description,
                    p.ai_description = pkg.ai_description,
                    p.updated_at = pkg.updated_at
                """,
                packages=package_records
            )

        # 2. Project-Package 관계 배치 생성
        project_package_records = []
        for pkg in packages:
            project_package_records.append({
                'project_name': project_name,
                'package_name': pkg.name,
            })

        if project_package_records:
            tx.run(
                """
                UNWIND $relations AS rel
                MATCH (proj:Project {name: rel.project_name})
                MATCH (pkg:Package {name: rel.package_name})
                MERGE (proj)-[:CONTAINS]->(pkg)
                """,
                relations=project_package_records
            )


