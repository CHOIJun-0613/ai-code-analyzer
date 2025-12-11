@echo off
cd server
uvicorn app.main:app --reload --port 8000
