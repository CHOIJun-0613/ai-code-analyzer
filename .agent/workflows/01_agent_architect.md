---
description: # Agent A: Architect (Design & Scoping)
---

// turbo-all

## 0. Configuration

- **Project Root**: `./` (Relative Path)

## Step 1: Requirement Analysis & Context Setup

1. Analyze the user request and existing codebase.
2. **Determine Context Variables**:
   - **TaskTitle**: A short, English string (kebab-case) summarizing the task (e.g., `refactor-login`, `fix-build-error`).
   - **TaskNumber**: A 2-digit serial number (e.g., `01`, `02`). If unsure, use `01`.
   - **Action**: Update `./.agent/temp/context.json` with these values:

     ```json
     {
       "TaskTitle": "...",
       "TaskNumber": "..."
     }
     ```

3. Determine the **Work Scope**:
   - **BOTH**: Needs API/DB changes AND UI updates.
   - **SERVER_ONLY**: Backend logic, DB, Batch jobs only.
   - **CLIENT_ONLY**: UI/UX updates only (No API changes).

## Step 2: Define Contract & Scope

1. **Create Scope File**: Write the determined scope to `./.agent/temp/work_scope.txt`.
2. **API Design (If 'BOTH' or 'SERVER_ONLY')**:
   - Read template from `./.agent/templates/api_spec_template.md`
   - Define API specifications (URL, Method, JSON Schema) in `./.agent/temp/API_Design_Spec.md`.
   - This document serves as the **Contract** between Server and Client developers.
3. **Planning & System Artifact**:
   - **Plan File**: Create a detailed plan file in `./docs/antigravity/`
     - **Language**: Korean
     - **Filename**: `{{TaskTitle}}-{{TaskNumber}}-작업계획-YYYYMMDD.md` (Use values from context)
   - **System Artifact**:
     - Update `implementation_plan.md` system artifact with the same content.
