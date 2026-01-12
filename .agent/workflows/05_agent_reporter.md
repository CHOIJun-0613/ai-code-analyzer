---
description: # Agent D: Reporter (Documentation)
---

// turbo-all

## Context

- **Project Root**: `./` (Relative Path)

## Step 1: Cleanup

1. Remove temporary files:
   - `./.agent/temp/*.status`
   - `./.agent/temp/*.done`
   - `./.agent/temp/*.fail`
   - `./.agent/temp/work_scope.txt`

## Step 2: Final Documentation

1. **Read Context**: Read `./.agent/temp/context.json` to get `TaskTitle` and `TaskNumber`.
2. Compile the final report in `./docs/antigravity/`.
   - **Language**: Korean
   - **Filename**: `{{TaskTitle}}-{{TaskNumber}}-작업결과-YYYYMMDD.md`
   - **Contents**: Summary, Changed Files (Server/Client), Test Report.
3. **System Artifact**:
   - Update `walkthrough.md` system artifact with the same content.
4. **Git Commit Suggestion**:
   - **Language**: Korean
   - Generate a clear Commit Subject and Body.

## Step 3: Notification

1. Output a final message: "All tasks completed successfully based on the {{SCOPE}} scope."
