
import os
import sys

# Add server directory to sys.path
sys.path.append(os.path.dirname(os.path.abspath(__file__)) + "/../")

from csa.services.java_analysis.project import parse_single_java_file

def test_method_source_extraction():
    # Create a dummy Java file with comments and annotations
    java_content = """
package com.example;

public class TestClass {

    /**
     * This is a Javadoc comment.
     * It should be included in the source.
     */
    @Override
    @Deprecated
    public void testMethod() {
        System.out.println("Hello");
    }

    // Single line comment
    public void anotherMethod() {
        // body comment
    }
}
"""
    file_path = "TestClass.java"
    with open(file_path, "w", encoding="utf-8") as f:
        f.write(java_content)

    try:
        package, class_node, inner_classes, _ = parse_single_java_file(file_path, "TestProject")
        
        # Check testMethod
        test_method = next((m for m in class_node.methods if m.name == "testMethod"), None)
        assert test_method is not None, "testMethod not found"
        
        print(f"Captured Source for testMethod:\n{test_method.source}")
        
        assert "/**" in test_method.source, "Javadoc not found in source"
        assert "@Override" in test_method.source, "@Override not found in source"
        assert "@Deprecated" in test_method.source, "@Deprecated not found in source"
        assert "public void testMethod" in test_method.source, "Method signature not found"

        # Check anotherMethod
        another_method = next((m for m in class_node.methods if m.name == "anotherMethod"), None)
        assert another_method is not None, "anotherMethod not found"
        
        print(f"Captured Source for anotherMethod:\n{another_method.source}")
        assert "// Single line comment" in another_method.source, "Single line comment not found"

        print("\nAll tests passed!")

    finally:
        if os.path.exists(file_path):
            os.remove(file_path)

if __name__ == "__main__":
    test_method_source_extraction()
