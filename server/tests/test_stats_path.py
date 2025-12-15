import os
import unittest
from unittest.mock import MagicMock, patch
from datetime import datetime

from csa.services.analysis.neo4j_writer import save_java_objects_to_neo4j
from csa.models.analysis import JavaAnalysisArtifacts, JavaAnalysisStats
from csa.models.graph_entities import Project

class TestStatsPath(unittest.TestCase):
    @patch("csa.services.analysis.neo4j_writer.connect_to_neo4j_db")
    @patch("csa.services.analysis.neo4j_writer.calculate_project_statistics")
    def test_save_java_objects_to_neo4j_uses_provided_path(self, mock_calc_stats, mock_connect):
        # Setup
        mock_db = MagicMock()
        mock_logger = MagicMock()
        
        project = Project(name="test_project", path="/tmp/test_project")
        artifacts = JavaAnalysisArtifacts(
            packages=[], classes=[], beans=[], endpoints=[], 
            mybatis_mappers=[], jpa_entities=[], jpa_repositories=[], 
            jpa_queries=[], config_files=[], test_classes=[], sql_statements=[]
        )
        
        # Execute with specific java_source_folder
        test_source_folder = "/path/to/source"
        
        # Mocking calculate_project_statistics to return the project
        mock_calc_stats.return_value = project

        save_java_objects_to_neo4j(
            db=mock_db,
            artifacts=artifacts,
            project=project,
            clean=False,
            logger=mock_logger,
            java_source_folder=test_source_folder
        )
        
        # Verify that calculate_project_statistics was called with the correct path
        # calculate_project_statistics(project, classes_dict, java_source_folder)
        args, _ = mock_calc_stats.call_args
        self.assertEqual(args[2], test_source_folder)

    @patch("csa.services.analysis.neo4j_writer.connect_to_neo4j_db")
    @patch("csa.services.analysis.neo4j_writer.calculate_project_statistics")
    def test_save_java_objects_to_neo4j_fallback_to_project_path(self, mock_calc_stats, mock_connect):
        # Setup
        mock_db = MagicMock()
        mock_logger = MagicMock()
        
        test_project_path = "/fallback/path"
        project = Project(name="test_project", path=test_project_path)
        artifacts = JavaAnalysisArtifacts(
            packages=[], classes=[], beans=[], endpoints=[], 
            mybatis_mappers=[], jpa_entities=[], jpa_repositories=[], 
            jpa_queries=[], config_files=[], test_classes=[], sql_statements=[]
        )
        
        # Mocking calculate_project_statistics to return the project
        mock_calc_stats.return_value = project

        # Execute without java_source_folder
        save_java_objects_to_neo4j(
            db=mock_db,
            artifacts=artifacts,
            project=project,
            clean=False,
            logger=mock_logger
            # java_source_folder is None by default
        )
        
        # Verify that calculate_project_statistics was called with project.path as fallback
        args, _ = mock_calc_stats.call_args
        self.assertEqual(args[2], test_project_path)

if __name__ == "__main__":
    unittest.main()
