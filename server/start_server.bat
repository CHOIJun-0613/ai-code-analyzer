@echo off
echo Starting AI Code Analyzer Server...
call .venv\Scripts\activate
cmd /c "python run_server.py"
pause
