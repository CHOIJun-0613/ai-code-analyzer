# AGENTS.md

## Build / Lint / Test Commands

### Python (server/)
```bash
# Setup
cd server
python -m venv .venv
.venv\Scripts\activate  # Windows
pip install -r requirements.txt

# Development
uvicorn app.main:app --reload --port 8000

# Tests
pytest                          # All tests
pytest tests/unit               # Unit tests only
pytest tests/integration        # Integration tests only
pytest tests/unit/test_file.py  # Single test file
pytest tests/unit/test_file.py::test_function_name  # Specific test
pytest -k "test_name"           # Run tests matching pattern

# CLI commands (from server/)
python -m csa.cli.main analyze --all-objects --clean --project-name <alias>
python -m csa.cli.main sequence --class-name <Class> --format plantuml
```

### TypeScript (client/)
```bash
# Setup
cd client
npm install

# Development
npm run dev                      # Start dev server at http://localhost:5173
npm run build                    # Production build (tsc + vite build)
npm run lint                     # ESLint
npm run preview                  # Preview production build

# No test command currently configured in package.json
```

## Code Style Guidelines

### Python (server/)
- **PEP 8**: 4-space indentation, `snake_case` for functions/modules, `PascalCase` for classes
- **Type hints**: Mandatory for all function signatures (PEP 484)
- **Imports**: `from __future__ import annotations` at top (Python 3.7+ forward references)
- **Docstrings**: Korean language preferred for code comments/docstrings
- **Pydantic models**: Use for data validation and serialization
- **Logging**: `from csa.utils.logger import get_logger()`
- **File size**: Keep files under 1000 lines; split if exceeded
- **Function size**: Keep functions under 100 lines; modularize for maintainability
- **Error handling**: Never use empty catch blocks. Log errors appropriately.
- **Environment variables**: Load via `.env` and helpers; never hardcode credentials

### TypeScript (client/)
- **Components**: React functional components with TypeScript
- **Imports**: Group imports (third-party, internal, relative), no wildcards
- **Naming**: `PascalCase` for components, `camelCase` for variables/functions
- **State**: Zustand for global state, `useState` for local state
- **Styling**: Tailwind CSS utility classes (no custom CSS except in style tags)
- **Type safety**: Explicit interfaces/types for all props; no `any` without justification
- **Icons**: Lucide React for icons
- **Async/await**: Use with proper error handling and loading states
- **API calls**: Use axios instance from `src/api/client.ts`

### Cursor Rules (.cursor/rules/run-python.mdc)
- Java source parser project with specific module structure
- `csa/cli/main.py` - CLI entry point
- `csa/services/` - Core services (Java/SQL analysis, Neo4j, diagrams)
- `csa/models/` - Domain models
- `csa/models/entities/` - Modular entity definitions
- `csa/utils/` - Common helpers
- Tests in `tests/unit`, `tests/integration`, `tests/contract`
- Sample projects in `tests/sample_*`
- Batch scripts in `commands/`, docs in `docs/`, output in `.gitignore`'d `output/`

### Behavioral Guidelines
- **Language**: Korean for all responses and documentation
- **Architecture**: Never arbitrarily change application structure
- **Verification**: Think first, assess impact, confirm with user before modifying
- **Transparency**: Show modification reasons and changes after completion

### Environment & Security
- **Never commit**: `.env`, API keys, JWT secrets
- **Neo4j connection**: Use `neo4j://127.0.0.1:7687`, database `csadb01`, user `csauser`
- **Test/debug**: Place temporary test files in `./test` folder
- **Python execution**: Always use virtual environment (.venv)

### Module Structure Guidelines (server/)
- Graph entities in `csa/models/entities/` (project.py, class_model.py, etc.)
- Data transformation logic in `project_nodes.py`, `class_nodes.py`
- DB storage uses batch processing for performance
- Separation of concerns: analysis pipeline (`csa/services/analysis/`) vs parsing modules
