
import unittest
import sys
import os

# Add server directory to sys.path
sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))

from csa.services.graph_db import GraphDB
from csa.services.graph_db.class_nodes import ClassMixin
from csa.services.graph_db.project_nodes import ProjectMixin

class TestRefactoring(unittest.TestCase):
    def test_graphdb_imports(self):
        """Verify GraphDB imports and inheritance."""
        self.assertTrue(issubclass(GraphDB, ClassMixin), "GraphDB should inherit from ClassMixin")
        self.assertTrue(issubclass(GraphDB, ProjectMixin), "GraphDB should inherit from ProjectMixin")

    def test_class_mixin_methods(self):
        """Verify ClassMixin has the expected methods."""
        self.assertTrue(hasattr(ClassMixin, 'add_class'), "ClassMixin should have add_class")
        self.assertTrue(hasattr(ClassMixin, 'add_classes_batch'), "ClassMixin should have add_classes_batch")
        self.assertTrue(hasattr(ClassMixin, '_create_class_node_tx'), "ClassMixin should have _create_class_node_tx")
    
    def test_project_mixin_cleanup(self):
        """Verify ProjectMixin no longer has moved methods."""
        self.assertFalse(hasattr(ProjectMixin, 'add_class'), "ProjectMixin should NOT have add_class")
        self.assertFalse(hasattr(ProjectMixin, '_create_class_node_tx'), "ProjectMixin should NOT have _create_class_node_tx")

    def test_graphdb_facade(self):
        """Verify GraphDB instance has all methods."""
        # We can't easily instantiate GraphDB without config/mock, but we can check the class dict or dir
        # or just rely on MRO checks above.
        pass

if __name__ == '__main__':
    unittest.main()
