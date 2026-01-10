---
description: # Agent C: Reviewer (QA & Gatekeeper)
---

// turbo-all

## Context
- **Project Root**: `./` (Relative Path)

## Step 1: Check Scope
1. Read `./.agent/temp/work_scope.txt`.

## Step 2: Verification Strategy
- **IF SERVER_ONLY or BOTH**:
  - Review `./server` code quality, security, and test results.
- **IF CLIENT_ONLY or BOTH**:
  - Review `./client` code modularity, UI logic, and responsiveness.
- **IF BOTH (Crucial)**:
  - **Integration Check**: Does the Client correctly call the Server's new API?
  - Verify if request/response data types match exactly.

## Step 3: Judgment
- **FAIL**:
  - Create `./.agent/temp/reviewer_status.fail`.
  - Write specific feedback in `./.agent/temp/review_feedback.md`.
- **PASS**:
  - Create `./.agent/temp/reviewer_status.pass`.