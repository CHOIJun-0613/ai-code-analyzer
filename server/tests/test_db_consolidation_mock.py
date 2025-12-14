
import unittest
from unittest.mock import MagicMock, patch
import sys
import os

# Add server directory to sys.path
sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))

from csa.services.graph_db.project_nodes import ProjectMixin
from csa.services.graph_db.class_nodes import ClassMixin
from csa.models.graph_entities import Package, Class

class MockGraphDB(ProjectMixin, ClassMixin):
    def __init__(self):
        self.logger = MagicMock()
        self._execute_write = MagicMock()

class TestDBConsolidation(unittest.TestCase):
    def setUp(self):
        self.db = MockGraphDB()

    def test_add_package_calls_batch(self):
        """Verify add_package delegates to add_packages_batch."""
        pkg = Package(name="com.test", project_name="TestProject")
        
        # Mock add_packages_batch on the instance
        with patch.object(self.db, 'add_packages_batch') as mock_batch:
            self.db.add_package(pkg, "TestProject")
            
            # Verify batch was called with list
            mock_batch.assert_called_once_with([pkg], "TestProject")

    def test_add_class_calls_batch(self):
        """Verify add_class delegates to add_classes_batch."""
        cls = Class(name="TestClass", file_path="/tmp/Test.java", package_name="com.test")
        
        # Mock add_classes_batch on the instance
        with patch.object(self.db, 'add_classes_batch') as mock_batch:
            self.db.add_class(cls, "com.test", "TestProject")
            
            # Verify batch was called with list of tuples
            mock_batch.assert_called_once_with([(cls, "com.test", "TestProject")])

if __name__ == '__main__':
    unittest.main()
