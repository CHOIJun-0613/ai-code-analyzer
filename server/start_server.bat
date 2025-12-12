@echo off
echo Starting AI Code Analyzer Server...
call .venv\Scripts\activate.bat
uvicorn app.main:app --reload --host 0.0.0.0 --port 8000
pause
