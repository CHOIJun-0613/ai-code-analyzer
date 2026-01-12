---
description: # Workflow: Dynamic Full-Stack Orchestrator
---

// turbo-all

## 0. Configuration

- **Project Root**: `./` (Relative Path)
- **Roles**: Server(`B1`), Client(`B2`)
- **Initialization**:
  - Ensure directory exists: `./.agent/temp/`
  - Initialize context: Create/Reset `./.agent/temp/context.json` with `{}`.
  - Remove old status files (`*.status`, `*.done`, `*.fail`, `work_scope.txt`).

## Step 1: Analysis & Scoping (Architect)

- **Action**: [Execute Workflow] **`./.agent/workflows/01_agent_architect.md`**
- **Output Check**: Read `./.agent/temp/work_scope.txt` to set variable `{{SCOPE}}`.
  - Values: `SERVER_ONLY`, `CLIENT_ONLY`, `BOTH`

## Step 2: Server Development Phase

- **Condition**: IF `{{SCOPE}}` == 'SERVER_ONLY' OR `{{SCOPE}}` == 'BOTH'
  - **Action**: [Execute Workflow] **`./.agent/workflows/02_agent_server_dev.md`**
  - **Wait**: Wait until `server_status.done` OR `server_status.fail` is created.
  - **Check**: IF `server_status.fail` exists, **STOP** and Notify User.
- **Else**:
  - **Log**: "Skipping Server Development (Out of Scope)."

## Step 3: Client Development Phase

- **Condition**: IF `{{SCOPE}}` == 'CLIENT_ONLY' OR `{{SCOPE}}` == 'BOTH'
  - **Action**: [Execute Workflow] **`./.agent/workflows/03_agent_client_dev.md`**
  - **Input**: If `{{SCOPE}}` == 'BOTH', ensure Server Spec is available.
  - **Wait**: Wait until `client_status.done` OR `client_status.fail` is created.
  - **Check**: IF `client_status.fail` exists, **STOP** and Notify User.
- **Else**:
  - **Log**: "Skipping Client Development (Out of Scope)."

## Step 4: Quality Assurance (Reviewer)

- **Action**: [Execute Workflow] **`./.agent/workflows/04_agent_reviewer.md`**
- **Input Pass**: Pass `{{SCOPE}}` variable to Reviewer.
- **Decision Point**:
  - IF `reviewer_status.fail`:
    - Check `review_feedback.md` to identify responsible role (Server or Client).
    - **Reset**: Delete `server_status.done`, `client_status.done`, `reviewer_status.fail`.
    - **Loop**: Re-execute Step 2 or Step 3 based on feedback.
  - IF `reviewer_status.pass`:
    - **Proceed**: Go to Step 5.

## Step 5: Finalize (Reporter)

- **Action**: [Execute Workflow] **`./.agent/workflows/05_agent_reporter.md`**
