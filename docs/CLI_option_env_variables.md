# CLI Option and Environment Variables (2025-11-05)

## Overview

This document describes the relationship between CLI options and environment variables in the CSA (Code Static Analyzer) project.

## Main Environment Variables

### Neo4j Connection Settings
- `NEO4J_URI`: Neo4j server URI (default: `bolt://localhost:7687`)
- `NEO4J_USER`: Neo4j username (default: `neo4j`)
- `NEO4J_PASSWORD`: Neo4j password (required)
- `NEO4J_DATABASE`: Neo4j database name (default: `neo4j`)
- `NEO4J_POOL_SIZE`: Connection pool size (default: 10)
- `NEO4J_BATCH_SIZE`: Batch save size (default: 25)

### Analysis Target Paths
- `JAVA_SOURCE_FOLDER`: Java source folder path
- `DB_SCRIPT_FOLDER`: DB script folder path

### Performance Optimization
- `USE_STREAMING_PARSE`: Enable streaming mode (default: `false`)
- `JAVA_PARSE_WORKERS`: Number of parallel workers (default: 8)
- `JAVA_FILE_PARSE_TIMEOUT`: File parsing timeout in seconds (default: 60.0)
- `JAVA_COMPLEXITY_THRESHOLD`: Complexity threshold (default: 50000)
- `SKIP_DTO_SOURCE`: Skip DTO source storage (default: `false`)

### AI Analysis Settings
- `USE_AI_ANALYSIS`: Enable AI analysis system (default: `false`)
  - `true`: Initialize AIAnalyzer, enable AI analysis features
  - `false`: Disable all AI-related features
- `CONCURRENT_AI_REQUESTS`: Concurrent AI enrichment requests (default: 10)
- `AI_PROVIDER`: AI provider (`google`, `groq`, `lmstudio`, `openai`)

### Output Directories
- `SEQUENCE_DIAGRAM_OUTPUT_DIR`: Sequence diagram output (default: `output/sequence-diagram`)
- `CRUD_MATRIX_OUTPUT_DIR`: CRUD matrix output (default: `output/crud-matrix`)
- `CLASS_SPEC_OUTPUT_DIR`: Class specification output (default: `output/class-spec`)
- `IMPACT_ANALYSIS_OUTPUT_DIR`: Impact analysis output (default: `output/impact-analysis`)

## Main CLI Commands

### 1. analyze command

**Purpose**: Perform Java/DB static analysis

**Main Options**:
- `--project-name <name>`: Project name (required)
- `--all-objects`: Analyze both Java + DB
- `--java-object`: Analyze Java source only
- `--db-object`: Analyze DB schema only
- `--clean`: Delete existing project nodes and re-analyze
- `--update`: Keep existing data, add new items only
- `--use-ai`: Include AI analysis (slow, LLM API calls)
- `--dry-run`: Parse only without Neo4j connection
- `--class-name <name>`: Analyze specific class only

**Environment Variable Integration**:
- `JAVA_SOURCE_FOLDER`: Java source path
- `DB_SCRIPT_FOLDER`: DB script path
- `USE_STREAMING_PARSE`: Streaming mode
- `JAVA_PARSE_WORKERS`: Number of parallel workers
- `SKIP_DTO_SOURCE`: DTO optimization

**Priority**: CLI options > Environment variables > Default values

### 2. ai-enrich command

**Purpose**: Perform post-AI analysis on nodes stored in Neo4j

**Main Options**:
- `--project-name <name>`: Project name (required)
- `--node-type <type>`: Node type to process (`all`, `class`, `method`, `sql`, default: `all`)
- `--concurrent <number>`: Concurrent AI requests (default: 10)
- `--limit <number>`: Maximum nodes to process (default: all)

**Environment Variable Integration**:
- `USE_AI_ANALYSIS`: Enable AI system (required)
- `CONCURRENT_AI_REQUESTS`: Concurrent requests
- `AI_PROVIDER`: AI provider

**Usage Scenarios**:
1. Fast parsing with `analyze` command (no AI analysis)
2. Selective AI description with `ai-enrich`
3. Adjust `--concurrent` when Rate Limit occurs

### 3. sequence command

**Purpose**: Generate sequence diagrams

**Main Options**:
- `--class-name <name>`: Class name (required)
- `--method-name <name>`: Method name (optional)
- `--project-name <name>`: Project name (optional, auto-detect)
- `--format <format>`: Diagram format (`mermaid`, `plantuml`, default: `mermaid`)
- `--image-format <format>`: Image format (`png`, `svg`, `pdf`, default: `none`)
- `--max-depth <number>`: Maximum call depth (default: 10)

**Environment Variable Integration**:
- `SEQUENCE_DIAGRAM_OUTPUT_DIR`: Output directory

### 4. CRUD-related commands

#### crud-matrix
- `--project-name <name>`: Project name (required)
- `--output-format <format>`: Output format (`excel`, `markdown`, default: `excel`)
- `--auto-create-relationships`: Auto-create relationships (default: `true`)

#### table-summary
- `--project-name <name>`: Project name (required)
- `--output-file <file>`: Output file (optional)

#### crud-analysis
- `--project-name <name>`: Project name (required)
- `--output-dir <path>`: Output directory (default: `output/crud-matrix`)

**Environment Variable Integration**:
- `CRUD_MATRIX_OUTPUT_DIR`: Output directory

### 5. DB Call-related commands

#### db-call-chain
- `--project-name <name>`: Project name (required)
- `--start-class <name>`: Start class name (optional)
- `--start-method <name>`: Start method name (optional)
- `--output-file <file>`: Output file (optional)

#### db-statistics
- `--project-name <name>`: Project name (required)
- `--output-file <file>`: Output file (optional)

### 6. Graph Query commands

#### query
- `--query <query>`: Custom Cypher query
- `--basic`: Basic class query
- `--detailed`: Detailed class query

#### list-classes
- No options (lists all classes in the project)

#### list-methods
- `--class-name <name>`: Class name (required)

## AI Analysis Architecture

### Option 1: Fast parsing without AI analysis (default)
```bash
python -m csa.cli.main analyze --all-objects --project-name myproject
```
- Skip AI analysis
- Fast speed
- `ai_description` field is empty string

### Option 2: Parsing with AI analysis
```bash
python -m csa.cli.main analyze --all-objects --use-ai --project-name myproject
```
- Perform AI analysis during parsing
- Slow (includes LLM API calls)
- `ai_description` field contains AI analysis results

### Option 3: AI Enrichment (post-AI analysis)
```bash
python -m csa.cli.main ai-enrich --project-name myproject
```
- Perform AI analysis on already parsed nodes
- Selective AI analysis (specific node types only)
- Can avoid Rate Limit (adjust `--concurrent`)

## Priority Rules

1. **CLI options** > **Environment variables** > **Default values**
2. **Required options**: `--project-name`, `--class-name`, etc. must be provided via CLI
3. **Flag options**: `--clean`, `--dry-run`, `--use-ai`, etc. are `false` if not specified

## AI Environment Variables Update (2025-11-05)

### Changes
- Removed `SKIP_AI_ANALYSIS` (unimplemented feature)
- Unified `AI_USE_ANALYSIS` to `USE_AI_ANALYSIS`

### Current AI Environment Variables
- `USE_AI_ANALYSIS`: Enable AI analysis system (default: `false`)
  - Determines whether to initialize AIAnalyzer class
  - Acts as LLM initialization gatekeeper
  - Master switch for all AI features

### AI Analysis Flow
```
1. USE_AI_ANALYSIS=true (env)
   ↓
2. AIAnalyzer initialization
   ↓
3. --use-ai option (CLI)
   ↓
4. Set USE_AI_ANALYSIS environment variable
   ↓
5. Perform AI analysis during parsing
```

## Recommended Setting Combinations

### Fast Development
```bash
# .env
USE_AI_ANALYSIS=true
USE_STREAMING_PARSE=true
JAVA_PARSE_WORKERS=8
SKIP_DTO_SOURCE=true

# CLI
python -m csa.cli.main analyze --all-objects --clean --project-name myproject
python -m csa.cli.main ai-enrich --project-name myproject --node-type class --limit 100
```

### Full Automation
```bash
# .env
USE_AI_ANALYSIS=true
USE_STREAMING_PARSE=true

# CLI
python -m csa.cli.main analyze --all-objects --clean --use-ai --project-name myproject
```

### Performance Priority
```bash
# .env
USE_AI_ANALYSIS=false
USE_STREAMING_PARSE=true
JAVA_PARSE_WORKERS=16
SKIP_DTO_SOURCE=true
JAVA_FILE_PARSE_TIMEOUT=30.0

# CLI
python -m csa.cli.main analyze --all-objects --clean --project-name myproject
```

## References

- [CLAUDE.md](../CLAUDE.md): Overall project guide
- [env.example](../env.example): Environment variable configuration example
- [csa/cli/commands/](../csa/cli/commands/): CLI command implementation
- [csa/aiwork/](../csa/aiwork/): AI analysis module
