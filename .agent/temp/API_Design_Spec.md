# API Specification: Analysis Rule Management

## 1. Analysis Rules

### GET /api/v1/analysis-rules

- **Summary**: Retrieve all analysis rules.
- **Query Params**:
  - `active_only` (boolean, optional): If true, returns only rules with `useYn=true`.
- **Response JSON**:

  ```json
  [
    {
      "id": 123,
      "name": "Check Null Safety",
      "description": "Ensure null checks are performed.",
      "content": "Rule content in markdown...",
      "useYn": true,
      "order": 1,
      "updatedAt": "2026-01-11T12:00:00",
      "updatedBy": "admin",
      "isSystem": false
    }
  ]
  ```

### POST /api/v1/analysis-rules

- **Summary**: Create a new analysis rule.
- **Request JSON**:

  ```json
  {
    "name": "New Rule",
    "description": "Description of the rule",
    "content": "Rule content...",
    "useYn": true,
    "order": 0
  }
  ```

- **Response JSON**: (Created Rule Object)

### PUT /api/v1/analysis-rules/{id}

- **Summary**: Update an existing analysis rule.
- **Path Params**: `id` (integer)
- **Request JSON**:

  ```json
  {
    "name": "Updated Name",
    "description": "Updated description",
    "content": "Updated content",
    "useYn": true,
    "order": 1
  }
  ```

- **Response JSON**: (Updated Rule Object)

### DELETE /api/v1/analysis-rules/{id}

- **Summary**: Delete an analysis rule.
- **Path Params**: `id` (integer)
- **Response JSON**: `{"message": "Rule deleted successfully"}`

### PUT /api/v1/analysis-rules/reorder

- **Summary**: Update the execution order of rules.
- **Request JSON**:

  ```json
  [
    { "id": 123, "order": 1 },
    { "id": 124, "order": 2 }
  ]
  ```

- **Response JSON**: `{"message": "Order updated successfully"}`
