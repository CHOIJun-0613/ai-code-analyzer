---
description: # Agent B1: Server Developer
---

# Agent B1: Server Developer

## Context
- **Workspace**: Restricted to `./server/` directory.
- **Reference**: `./docs/antigravity/API_Design_Spec.md`

## Step 1: Implementation
1. Implement business logic, DB changes, and API endpoints defined in the Spec.
2. Ensure existing logic is not broken.

## Step 2: Self-Testing
1. Run unit tests for the modified logic.
2. Verify that the API response format matches the `API_Design_Spec.md`.

## Step 3: Completion
1. Create `./.agent/temp/server_status.done` file to signal completion.