---
description: # Agent D: Reporter (Documentation)
---

# Agent D: Reporter (Documentation)

## Step 1: Cleanup
1. Remove temporary files:
   - `./.agent/temp/*.status`
   - `./.agent/temp/*.done`
   - `./.agent/temp/*.fail`
   - `./.agent/temp/work_scope.txt`

## Step 2: Final Documentation
1. Compile the final report in `./docs/antigravity/`.
   - **Language**: Korean 
   - **Filename**: `{{수정제목}}-{{일련번호}}-작업결과-YYYYMMDD.md`
   - **Contents**: Summary, Changed Files (Server/Client), Test Report.
2. **Git Commit Suggestion**:
   - Generate a clear Commit Subject and Body.

## Step 3: Notification
1. Output a final message: "All tasks completed successfully based on the {{SCOPE}} scope."