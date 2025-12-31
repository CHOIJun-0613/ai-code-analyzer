
import os
import sys
import unittest
from csa.services.java_analysis.project import parse_single_java_file

# Add server directory to sys.path
sys.path.append(os.path.dirname(os.path.abspath(__file__)) + "/../")

class TestMethodSourceExtraction(unittest.TestCase):
    def setUp(self):
        self.file_path = "TestClass.java"
        self.java_content = """
package com.example;

public class TestClass {

    /**
     * Metadata Comment
     */
    @Override
    public void testMethodWithBraceOnNewLine() 
    {
        System.out.println("Body");
    }

    /**
     * Metadata Comment for Same Line
     */
    @Override
    public void testMethodWithBraceOnSameLine() {
        System.out.println("Body");
    }
}
"""
        with open(self.file_path, "w", encoding="utf-8") as f:
            f.write(self.java_content)

    def tearDown(self):
        if os.path.exists(self.file_path):
            os.remove(self.file_path)

    def test_parses_source_correctly(self):
        package, class_node, inner_classes, _ = parse_single_java_file(self.file_path, "TestProject")
        
        # Test Case 1: Brace on new line
        method_newline = next((m for m in class_node.methods if m.name == "testMethodWithBraceOnNewLine"), None)
        self.assertIsNotNone(method_newline)
        
        print("\n--- Source for testMethodWithBraceOnNewLine ---")
        print(method_newline.source)
        print("---------------------------------------------")

        # Expectation: Source should include the body
        self.assertIn('System.out.println("Body")', method_newline.source)
        self.assertIn('}', method_newline.source)
        
        # Verify Metadata logic
        print("\n--- Metadata for testMethodWithBraceOnNewLine ---")
        print(method_newline.metadata)
        print("---------------------------------------------")
        self.assertIn("/**", method_newline.metadata)
        self.assertIn("* Metadata Comment", method_newline.metadata)
        self.assertIn("@Override", method_newline.metadata)
        
        # Verify Source contains everything (metadata + signature + body)
        self.assertIn("/**", method_newline.source)
        self.assertIn("@Override", method_newline.source)
        self.assertIn("public void testMethodWithBraceOnNewLine", method_newline.source)
        self.assertIn('System.out.println("Body")', method_newline.source)
        
        # Test Case 2: Brace on same line
        method_sameline = next((m for m in class_node.methods if m.name == "testMethodWithBraceOnSameLine"), None)
        self.assertIsNotNone(method_sameline)
        
        print("\n--- Source for testMethodWithBraceOnSameLine ---")
        print(method_sameline.source)
        print("---------------------------------------------")
        
        self.assertIn('System.out.println("Body")', method_sameline.source)
        
        print("\n--- Metadata for testMethodWithBraceOnSameLine ---")
        print(method_sameline.metadata)
        print("---------------------------------------------")
        self.assertIn("* Metadata Comment for Same Line", method_sameline.metadata)

        print("\nAll tests passed!")

if __name__ == "__main__":
    unittest.main()
