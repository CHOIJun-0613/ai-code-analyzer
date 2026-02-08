@echo off
cd server
.venv/Scripts/activate
uvicorn app.main:app --reload --port 18000
