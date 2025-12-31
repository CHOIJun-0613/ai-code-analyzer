@echo off
setlocal enabledelayedexpansion

REM ==========================
REM Config
REM ==========================
set CONTAINER=neo4j-db
set IMAGE=neo4j:5-community
set DB=refinerdb
set DATA_VOL=neo4j_data
set DUMPS_DIR=/data/dumps

REM 호스트 백업 폴더
set HOST_BACKUP_DIR=%~dp0backup

REM Timestamp
for /f %%i in ('powershell -NoProfile -Command "Get-Date -Format yyyyMMdd_HHmmss"') do set TS=%%i

if not exist "%HOST_BACKUP_DIR%" mkdir "%HOST_BACKUP_DIR%"

echo.
echo [INFO] DUMP script
echo [INFO] Container : %CONTAINER%
echo [INFO] Image     : %IMAGE%
echo [INFO] DB        : %DB%
echo [INFO] Volume    : %DATA_VOL%
echo [INFO] Host dir  : %HOST_BACKUP_DIR%
echo.

REM ==========================
REM STEP 1: Stop container
REM ==========================
echo [STEP 1/5] Stopping container...
docker stop %CONTAINER%
if errorlevel 1 (
  echo [ERROR] Failed to stop container: %CONTAINER%
  pause
  exit /b 1
)

REM ==========================
REM STEP 2: Remove existing dump
REM ==========================
echo [STEP 2/5] Removing existing dump file (if any)...
docker run --rm -i ^
  -v %DATA_VOL%:/data ^
  busybox ^
  sh -c "rm -f %DUMPS_DIR%/%DB%.dump && ls -al %DUMPS_DIR% 2>/dev/null || true"
if errorlevel 1 (
  echo [ERROR] Failed to remove existing dump file.
  pause
  exit /b 1
)

REM ==========================
REM STEP 3: Dump database
REM ==========================
echo [STEP 3/5] Dumping database to volume...
docker run --rm -i ^
  -v %DATA_VOL%:/data ^
  %IMAGE% ^
  neo4j-admin database dump %DB% --to-path=%DUMPS_DIR%
if errorlevel 1 (
  echo [ERROR] Dump failed.
  pause
  exit /b 1
)

REM ==========================
REM STEP 4: Copy dump to host
REM ==========================
echo [STEP 4/5] Copying dump file to host...
set TMP_EXPORT=neo4j-dump-export-%TS%
docker create --name %TMP_EXPORT% -v %DATA_VOL%:/data busybox sh -c "sleep 3600" >nul
if errorlevel 1 (
  echo [ERROR] Failed to create temp container for export.
  pause
  exit /b 1
)

set HOST_DUMP_FILE=%HOST_BACKUP_DIR%\%DB%_%TS%.dump
docker cp %TMP_EXPORT%:%DUMPS_DIR%/%DB%.dump "%HOST_DUMP_FILE%"
if errorlevel 1 (
  docker rm %TMP_EXPORT% >nul
  echo [ERROR] Failed to copy dump file to host.
  pause
  exit /b 1
)

docker rm %TMP_EXPORT% >nul

REM ==========================
REM STEP 5: Start container
REM ==========================
echo [STEP 5/5] Starting container...
docker start %CONTAINER%
if errorlevel 1 (
  echo [ERROR] Failed to start container: %CONTAINER%
  pause
  exit /b 1
)

echo.
echo [DONE] Dump completed successfully.
echo        Backup file: "%HOST_DUMP_FILE%"
pause

endlocal
