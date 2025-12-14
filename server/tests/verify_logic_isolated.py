
import unittest
from typing import List

def _scan_for_preceding_comments(lines: List[str], start_line_idx: int) -> int:
    """
    주어진 시작 라인 위로 스캔하여 주석이나 어노테이션이 포함된 시작 라인을 찾습니다.
    (Copied from project.py to verify logic in isolation)
    """
    current_idx = start_line_idx - 1
    new_start_idx = start_line_idx
    
    # 빈 줄 허용 개수
    empty_line_count = 0
    max_empty_lines = 1
    
    while current_idx >= 0:
        line = lines[current_idx].strip()
        
        # 빈 줄 처리
        if not line:
            empty_line_count += 1
            if empty_line_count > max_empty_lines:
                break
            # 빈 줄도 포함하기 위해 인덱스 업데이트 (단, 너무 많은 빈 줄은 위에서 break로 끊김)
            current_idx -= 1
            continue
            
        # 주석 확인
        if line.startswith('//') or line.startswith('/*') or line.startswith('*') or line.endswith('*/'):
            new_start_idx = current_idx
            empty_line_count = 0 # 주석을 찾았으므로 빈 줄 카운트 초기화
            current_idx -= 1
            continue
            
        # 어노테이션 확인 (@로 시작)
        if line.startswith('@'):
            new_start_idx = current_idx
            empty_line_count = 0
            current_idx -= 1
            continue
            
        # 닫는 중괄호나 세미콜론 등을 만나면 이전 코드 블록의 끝이므로 중단
        if line.endswith('}') or line.endswith(';') or line.endswith('{'):
            break
            
        # 그 외의 경우 (일반 코드 등) 중단
        break
        
    return new_start_idx

class TestScanLogic(unittest.TestCase):
    def test_scan_comments(self):
        source = """
    /**
     * Javadoc
     */
    @Annotation
    public void test() {
""".splitlines(keepends=False) # splitlines usually produces no newlines if kept False, but logic handles strip()

        # Lines (0-based):
        # 0: ""
        # 1: "    /**"
        # 2: "     * Javadoc"
        # 3: "     */"
        # 4: "    @Annotation"
        # 5: "    public void test() {"
        
        # Assume start_line_idx passed is 5 (public void...)
        new_start = _scan_for_preceding_comments(source, 5)
        self.assertEqual(new_start, 1)

    def test_scan_mixed(self):
        source = """
    // Comment 1
    
    // Comment 2
    public void test() {
""".splitlines(keepends=False)
        # 0: ""
        # 1: "    // Comment 1"
        # 2: "    "
        # 3: "    // Comment 2"
        # 4: "    public void test() {"
        
        new_start = _scan_for_preceding_comments(source, 4)
        # Should include Comment 2 (line 3).
        # Line 2 is empty.
        # Line 1 is Comment 1.
        # Logic allows 1 empty line.
        self.assertEqual(new_start, 1)

    def test_stop_at_brace(self):
        source = """
    }
    
    // Comment
    public void test() {
""".splitlines(keepends=False)
        # 0: ""
        # 1: "    }"
        # 2: "    "
        # 3: "    // Comment"
        # 4: "    public void test() {"
        
        new_start = _scan_for_preceding_comments(source, 4)
        # Should stop before } (line 1). 
        # Line 3 is comment. Line 2 is empty.
        # Should return 2 or 3?
        # current_idx=3 (Comment) -> new_start=3.
        # current_idx=2 (Empty) -> continue.
        # current_idx=1 (}). break.
        # So new_start is 3? Or 2? 
        # When empty line is processed, new_start is NOT updated?
        # Let's check logic:
        # if not line: ... current_idx -= 1; continue. (new_start NOT updated)
        # So it returns 3.
        # Ideally we might want to include the empty line between comment and brace? 
        # But correct behavior for "preceding comments" usually starts at the comment.
        self.assertEqual(new_start, 3)

if __name__ == '__main__':
    unittest.main()
