from server.csa.diagrams.sequence.mermaid import MermaidDiagramGenerator

class MockDriver:
    pass

def test_sanitize():
    generator = MermaidDiagramGenerator(MockDriver())
    
    # Test case 1: Newlines
    input_text = "Line 1\nLine 2"
    expected = "Line 1 Line 2"
    result = generator._sanitize_string(input_text)
    print(f"Test 1 (Newlines): {'PASS' if result == expected else 'FAIL'} -> '{result}'")
    
    # Test case 2: Quotes
    input_text = 'Say "Hello"'
    expected = "Say 'Hello'"
    result = generator._sanitize_string(input_text)
    print(f"Test 2 (Quotes): {'PASS' if result == expected else 'FAIL'} -> '{result}'")
    
    # Test case 3: None
    input_text = None
    expected = ""
    result = generator._sanitize_string(input_text)
    print(f"Test 3 (None): {'PASS' if result == expected else 'FAIL'} -> '{result}'")

if __name__ == "__main__":
    test_sanitize()
