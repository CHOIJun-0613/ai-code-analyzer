from typing import Dict, Any, List, Optional
from app.core.database import get_db
from csa.utils.logger import get_logger
from csa.services.db_call_analysis.reverse_impact import ReverseImpactMixin
from csa.diagrams.sequence.generator import SequenceDiagramGenerator
import json

class ClassReportService(ReverseImpactMixin):
    def __init__(self):
        self.logger = get_logger(__name__)

    def _open_session(self):
        return get_db().session()

    def generate_class_spec_md(self, project_name: str, class_name: str) -> str:
        """Generates a Markdown specification for the class."""
        query = """
        MATCH (c:Class {name: $class_name, project_name: $project_name})
        RETURN c
        """
        
        fields_query = """
        MATCH (c:Class {name: $class_name, project_name: $project_name})-[:HAS_FIELD]->(f:Field)
        RETURN f ORDER BY f.name
        """

        methods_query = """
        MATCH (c:Class {name: $class_name, project_name: $project_name})-[:HAS_METHOD]->(m:Method)
        RETURN m ORDER BY m.name
        """

        with self._open_session() as session:
            class_res = session.run(query, class_name=class_name, project_name=project_name).single()
            if not class_res:
                return f"# Class Specification: {class_name}\n\nClass not found."
            
            class_node = dict(class_res["c"])
            
            fields_res = session.run(fields_query, class_name=class_name, project_name=project_name)
            fields = [dict(r["f"]) for r in fields_res]
            
            methods_res = session.run(methods_query, class_name=class_name, project_name=project_name)
            methods = [dict(r["m"]) for r in methods_res]

        lines = []
        lines.append(f"# Class Specification: {class_node.get('name')}")
        lines.append("")
        
        lines.append("## Basic Information")
        lines.append(f"- **Package**: `{class_node.get('package_name', '-')}`")
        if class_node.get('logical_name'):
             lines.append(f"- **Logical Name**: {class_node.get('logical_name')}")
        lines.append(f"- **Type**: {class_node.get('type', '-')}")
        lines.append(f"- **Visibility**: {class_node.get('visibility', '-')}")
        lines.append("")
        
        if class_node.get('description'):
            lines.append("## Description")
            lines.append(class_node.get('description'))
            lines.append("")
            
        if class_node.get('ai_description'):
            lines.append("## AI Analysis")
            lines.append(class_node.get('ai_description'))
            lines.append("")

        lines.append("## Fields")
        if fields:
            lines.append("| Name | Type | Visibility | Description |")
            lines.append("|---|---|---|---|")
            for f in fields:
                desc = f.get('description', '').replace('\n', ' ') or '-'
                lines.append(f"| `{f.get('name')}` | `{f.get('type')}` | {f.get('visibility')} | {desc} |")
        else:
            lines.append("No fields.")
        lines.append("")

        lines.append("## Methods")
        if methods:
            lines.append("| Name | Return Type | Visibility | Complexity | Description |")
            lines.append("|---|---|---|---|---|")
            for m in methods:
                desc = m.get('description', '').replace('\n', ' ') or '-'
                complexity = m.get('cognitive_complexity') or m.get('cyclomatic_complexity') or '-'
                lines.append(f"| `{m.get('name')}` | `{m.get('return_type')}` | {m.get('visibility')} | {complexity} | {desc} |")
        else:
            lines.append("No methods.")
        
        return "\n".join(lines)

    def generate_sequence_diagram_md(self, project_name: str, class_name: str) -> str:
        """Generates Mermaid sequence diagrams for all public methods in the class."""
        pool = get_db()
        # Ensure we have a driver from the pool
        # get_db() returns the pool, we check if we can get a driver or connection directly
        # Actually ConnectionPool.driver is what we want? 
        # Wait, get_db() returns ConnectionPool instance.
        # SequenceDiagramGenerator takes a 'driver'.
        # pool.driver property exists? Let me check pool usage in other files.
        # sequence.py uses: pool = get_connection_pool(); with pool.connection() as conn: generator = SequenceDiagramGenerator(conn.driver...)
        
        # In service layer, get_db() is typically the pool.
        # DEBUG LOGGING
        print(f"DEBUG: Generating sequence diagram for {class_name} in {project_name}")
        pool = get_db()
        with pool.connection() as conn:
            generator = SequenceDiagramGenerator(conn.driver, format='mermaid', database=conn.database)
            result = generator.generate_content(class_name=class_name, project_name=project_name, include_external_calls=False)
            print(f"DEBUG: Generator result keys: {result.keys()}")
            if "error" in result:
                print(f"DEBUG: Generator error: {result['error']}")

        if "error" in result:
             return f"# Sequence Diagram\n\nError: {result['error']}"

        lines = []
        lines = []
        class_logical_name = result.get('class_logical_name', '')
        if class_logical_name:
            lines.append(f"# Sequence Diagrams: {class_name} <{class_logical_name}>")
        else:
            lines.append(f"# Sequence Diagrams: {class_name}")
        lines.append("**Diagrams for public methods**")
        lines.append("")
        
        if result["type"] == "class":
            for item in result["items"]:
                method_logical_name = item.get('logical_name', '')
                if method_logical_name:
                    lines.append(f"## ` {item['method_name']}() ` <{method_logical_name}>")
                else:
                    lines.append(f"## ` {item['method_name']}() `")
                lines.append("")
                lines.append("```mermaid")
                lines.append(item['content'])
                lines.append("```")
                lines.append("")
                lines.append("---")
                lines.append("")
        elif result["type"] == "method": 
             # Should not happen for class level call unless only one method?
             lines.append("```mermaid")
             lines.append(result['content'])
             lines.append("```")
             
        if not lines:
             return "# Sequence Diagrams\n\nNo diagrams generated."

        return "\n".join(lines)
        
    def generate_impact_analysis_report(self, project_name: str, class_name: str) -> str:
        """Generates impact analysis report for the class (reverse impact)."""
        # Since reverse impact is typically per method or table, for a class we might want to:
        # 1. Analyze impact for the class as a whole (where is this class used?) -> Usage Analysis?
        # 2. Or aggregate impact of its methods (what does this class affect if changed?) -> Reverse Impact.
        # The user request says "impact diagram (server's impact diagram generation code)".
        # ImpactReporter generates logic for ImpactAnalysisResult.
        # ReverseImpactMixin.analyze_method_impact_reverse analyzes reverse impact (who calls me?).
        # Forward impact (who do I call?) is standard call graph.
        
        # Usually "Impact Analysis" implies "If I change this, what breaks?". This is Reverse Impact.
        # I will run analyze_method_impact_reverse for the class (which defaults to all public methods if method_name is None).
        
        try:
             result = self.analyze_method_impact_reverse(class_name=class_name, project_name=project_name)
             
             # Now convert result to Markdown using ImpactReporter logic.
             # ImpactReporter is designed to write to file. I should refactor it or duplicate logic?
             # Or just instantiate it and use a temp path? 
             # Refactoring ImpactReporter to return string is better.
             # For now, I'll duplicate the markdown generation logic largely or use a temp file and read it back?
             # Temp file is safer given time constraints and complexity of `ImpactReporter.generate_markdown`.
             
             from csa.services.db_call_analysis.impact_reporter import ImpactReporter
             import tempfile
             import os
             
             reporter = ImpactReporter()
             with tempfile.NamedTemporaryFile(mode='w+', delete=False, suffix='.md', encoding='utf-8') as tf:
                 temp_path = tf.name
             
             reporter.generate_markdown(result, temp_path)
             
             with open(temp_path, 'r', encoding='utf-8') as f:
                 content = f.read()
                 
             os.unlink(temp_path)
             return content
             
        except Exception as e:
            self.logger.error(f"Error generating impact report: {e}", exc_info=True)
            return f"# Impact Analysis\n\nError: {str(e)}"
