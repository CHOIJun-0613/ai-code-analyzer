---
description: # Agent B2: Client Developer
---

# Agent B2: Client Developer

## Context

- **Workspace**: Restricted to `./client/` directory.
- **Reference**: `./docs/antigravity/API_Design_Spec.md`

## Step 1: Implementation

1. Implement UI components and State management logic.
2. **Integration**:
   - If Scope is `BOTH`, use the *new* API endpoints implemented by Server Dev.
   - If Scope is `CLIENT_ONLY`, use existing APIs.

## Step 2: Self-Testing

1. Verify UI rendering and Event handling.
2. Ensure API integration calls are correct (Check Payload/Response handling).

## Step 3: Completion

1. **Success**: Create `./.agent/temp/client_status.done` file to signal completion.
2. **Failure**: If critical errors persist, create `./.agent/temp/client_status.fail`.
