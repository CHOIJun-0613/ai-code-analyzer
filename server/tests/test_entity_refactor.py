
import unittest
import sys
import os

# Add server directory to sys.path
sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))

class TestEntityRefactoring(unittest.TestCase):
    def test_imports(self):
        """Verify that models can be imported from csa.models.graph_entities."""
        try:
            from csa.models.graph_entities import (
                Project, Package, Class, Method, Field, Annotation,
                Bean, JpaEntity, MyBatisMapper, Database
            )
        except ImportError as e:
            self.fail(f"Failed to import models from graph_entities: {e}")

    def test_model_instantiation(self):
        """Verify that models can be instantiated."""
        from csa.models.graph_entities import Project, Class
        
        p = Project(name="test_project")
        self.assertEqual(p.name, "test_project")
        
        c = Class(name="TestClass", file_path="/tmp/TestClass.java")
        self.assertEqual(c.name, "TestClass")

if __name__ == '__main__':
    unittest.main()
