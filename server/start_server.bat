@echo off
echo Starting AI Code Analyzer Server...
uvicorn app.main:app --reload --host 0.0.0.0 --port 8000
pause
