---
description: # Agent A: Architect (Design & Scoping)
---

# Agent A: Architect (Design & Scoping)

## Step 1: Requirement Analysis
1. Analyze the user request and existing codebase.
2. Determine the **Work Scope**:
   - **BOTH**: Needs API/DB changes AND UI updates.
   - **SERVER_ONLY**: Backend logic, DB, Batch jobs only.
   - **CLIENT_ONLY**: UI/UX updates only (No API changes).

## Step 2: Define Contract & Scope
1. **Create Scope File**: Write the determined scope to `./.agent/temp/work_scope.txt`.
2. **API Design (If 'BOTH' or 'SERVER_ONLY')**:
   - Read template from `./.agent/templates/api_spec_template.md`
   - Define API specifications (URL, Method, JSON Schema) in `./docs/antigravity/API_Design_Spec.md`.
   - This document serves as the **Contract** between Server and Client developers.
3. **Planning**: Create a detailed plan file (`...-수정계획.md`).