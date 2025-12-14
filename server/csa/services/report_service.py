import json
from typing import Dict, Any, List
from app.core.database import get_db
from csa.utils.logger import get_logger
from csa.models.entities.project import Project
from csa.services.db_call_analysis.crud import CrudMatrixMixin
from csa.models.impact import ImpactAnalysisResult

class ReportService(CrudMatrixMixin):
    def __init__(self):
        self.logger = get_logger(__name__)

    def _open_session(self):
        return get_db().session()

    def get_project_by_name(self, name: str) -> Project:
        query = """
        MATCH (p:Project {name: $name})
        RETURN p
        """
        with self._open_session() as session:
             result = session.run(query, name=name).single()
             if result:
                 data = dict(result["p"])
                 # Ensure default values for missing fields to avoid Pydantic validation error if DB is old
                 return Project(**data)
        return None

    def generate_project_stats_md(self, project: Project) -> str:
        lines = []
        lines.append(f"# Project Statistics: {project.name}")
        lines.append("")
        lines.append("## Project Information")
        lines.append(f"- **Application Name**: {project.application_name}")
        lines.append(f"- **Framework**: {project.framework}")
        lines.append(f"- **Repository**: {project.repository}")
        lines.append(f"- **Path**: `{project.path}`")
        lines.append(f"- **Last Updated**: {project.updated_at}")
        lines.append("")
        lines.append("## Code Statistics")
        lines.append("| Metric | Value |")
        lines.append("|---|---|")
        lines.append(f"| Total Lines (PLOC) | {project.total_PLOC:,} |")
        lines.append(f"| Code Lines (LLOC) | {project.total_LLOC:,} |")
        lines.append(f"| Comment Lines (CLOC) | {project.total_CLOC:,} |")
        blank_lines = max(0, project.total_PLOC - project.total_LLOC - project.total_CLOC)
        lines.append(f"| Blank Lines | {blank_lines:,} |")
        lines.append("")
        lines.append("## File Counts")
        lines.append("| Type | Count |")
        lines.append("|---|---|")
        lines.append(f"| Total Files | {project.total_file_count:,} |")
        lines.append(f"| Java Files | {project.total_java_file_count:,} |")
        lines.append(f"| XML Files | {project.total_xml_file_count:,} |")
        lines.append(f"| Config Files | {project.total_config_file_count:,} |")
        lines.append(f"| Ignored Files | {project.total_ignored_file_count:,} |")
        
        return "\n".join(lines)

    def generate_crud_matrix_md(self, project_name: str) -> str:
        # Uses CrudMatrixMixin.generate_crud_table_matrix via inheritance
        crud_data = self.generate_crud_table_matrix(project_name)
        if "error" in crud_data:
            return f"# CRUD Matrix Report\n\n**Error**: {crud_data['error']}"

        table_matrix = crud_data.get("table_matrix", [])
        table_names = crud_data.get("table_names", [])
        
        if not table_matrix or not table_names:
            return "# CRUD Matrix Report\n\nNo CRUD data available."

        lines = []
        lines.append(f"# CRUD Matrix Report: {project_name}")
        lines.append("")
        
        # Summary Section
        summary = crud_data.get("summary", {})
        lines.append("## Summary")
        lines.append(f"- **Total Classes**: {summary.get('total_classes', 0)}")
        lines.append(f"- **Total Tables**: {summary.get('total_tables', 0)}")
        lines.append(f"- **Most Active Class**: `{summary.get('most_active_class', 'N/A')}`")
        lines.append(f"- **Most Used Table**: `{summary.get('most_used_table', 'N/A')}`")
        lines.append("")
        
        # Matrix Table
        lines.append("## CRUD Matrix")
        
        # Header
        header = "| Package | Class | " + " | ".join(table_names) + " |"
        separator = "|---|---| " + " | ".join(["---"] * len(table_names)) + " |"
        lines.append(header)
        lines.append(separator)
        
        # Rows
        for row in table_matrix:
            class_name = row["class_name"]
            package_name = row.get("package_name", "N/A")
            row_items = [package_name, class_name]
            for table in table_names:
                val = row.get(table, "-")
                if val and val != "-":
                    val = f"**{val}**"
                row_items.append(val)
            lines.append("| " + " | ".join(row_items) + " |")
            
        return "\n".join(lines)

    def generate_class_list_md(self, project_name: str) -> str:
        query = """
        MATCH (c:Class {project_name: $project_name})
        RETURN c.package_name as package, c.name as name, c.logical_name as logical_name, c.type as type, c.sub_type as sub_type
        ORDER BY c.package_name, c.name
        """
        
        lines = []
        lines.append(f"# Class List Report: {project_name}")
        lines.append("")
        
        with self._open_session() as session:
            result = session.run(query, project_name=project_name)
            records = [record.data() for record in result]
            
        if not records:
             lines.append("No classes found for this project.")
             return "\n".join(lines)

        lines.append(f"**Total Classes**: {len(records)}")
        lines.append("")
        
        # Table Header
        lines.append("| Package | Class (Physical) | Class (Logical) | Sub-type |")
        lines.append("|---|---|---|---|")
        
        for r in records:
            package = r.get("package") or "-"
            name = r.get("name") or "-"
            logical = r.get("logical_name") or "-"
            # Prefer sub_type, fallback to type, then "Class"
            sub_type = r.get("sub_type") or r.get("type") or "Class"
            
            lines.append(f"| {package} | `{name}` | {logical} | {sub_type} |")
            
        return "\n".join(lines)
