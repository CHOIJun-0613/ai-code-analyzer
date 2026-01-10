
import unittest
from unittest.mock import MagicMock
import hashlib
import os
from csa.services.java_analysis.project import parse_single_java_file
from csa.models.graph_entities import Class

class TestSourceHashcode(unittest.TestCase):
    def setUp(self):
        self.test_file = "TestHash.java"
        self.content = """
        public class TestHash {
            public void test() {}
        }
        """
        with open(self.test_file, "w", encoding="utf-8") as f:
            f.write(self.content)
            
        self.expected_hash = hashlib.sha256(self.content.encode('utf-8')).hexdigest()

    def tearDown(self):
        if os.path.exists(self.test_file):
            os.remove(self.test_file)

    def test_skip_logic(self):
        # Mock GraphDB
        mock_db = MagicMock()
        # Setup existing hash match
        mock_db.get_class_analysis_info.return_value = {"source_hashcode": self.expected_hash}

        result = parse_single_java_file(self.test_file, "TestProject", graph_db=mock_db)
        
        # Expect SKIPPED_UNCHANGED
        self.assertEqual(result[3], "SKIPPED_UNCHANGED")
        print("✅ Skip logic verified: SKIPPED_UNCHANGED returned")

    def test_no_skip_logic(self):
        # Mock GraphDB
        mock_db = MagicMock()
        # Setup hash mismatch
        mock_db.get_class_analysis_info.return_value = {"source_hashcode": "different_hash"}

        package, class_node, inner, pkg_name = parse_single_java_file(self.test_file, "TestProject", graph_db=mock_db)
        
        # Expect Normal Parse
        self.assertIsInstance(class_node, Class)
        self.assertEqual(class_node.name, "TestHash")
        self.assertEqual(class_node.source_hashcode, self.expected_hash)
        print(f"✅ Normal parse verified: source_hashcode match ({class_node.source_hashcode})")

if __name__ == '__main__':
    unittest.main()
