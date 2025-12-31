@echo off
setlocal enabledelayedexpansion


REM ========== 사용법 ================
REM 1) 인자를 전달
REM    02_load_csadb01.bat backup\csadb01_20251228_103000.dump
REM 2) 인자를 전달 하지 않으면 backup\ 폴더에서 가장 최신 .dump 파일을 자동 선택해서 load
REM    02_load_csadb01.bat
REM ==========================

REM ==========================
REM Config
REM ==========================
set CONTAINER=neo4j-db
set IMAGE=neo4j:5-community
set DB=refinerdb
set DATA_VOL=neo4j_data
set DUMPS_DIR=/data/dumps

REM 스크립트 폴더 기준 backup 디렉터리
set BACKUP_DIR=%~dp0backup

REM ==========================
REM Determine dump file
REM - If arg provided: use it
REM - Else: pick latest *.dump in backup dir
REM ==========================
set HOST_DUMP_FILE=%~1

if "%HOST_DUMP_FILE%"=="" (
  if not exist "%BACKUP_DIR%" (
    echo [ERROR] Backup directory not found: "%BACKUP_DIR%"
	pause
    exit /b 2
  )

  REM 가장 최신 파일 1개 선택
  for /f "delims=" %%F in ('dir /b /a:-d /o:-d "%BACKUP_DIR%\*.dump" 2^>nul') do (
    set HOST_DUMP_FILE=%BACKUP_DIR%\%%F
    goto :FOUND
  )

  echo [ERROR] No .dump files found in: "%BACKUP_DIR%"
  pause
  exit /b 2
)

:FOUND

REM 상대경로로 들어온 경우 현재 위치 기준이므로, 존재 확인
if not exist "%HOST_DUMP_FILE%" (
  echo [ERROR] Dump file not found: "%HOST_DUMP_FILE%"
  pause
  exit /b 2
)

echo.
echo [INFO] LOAD script (auto-pick latest dump if no argument)
echo [INFO] Container : %CONTAINER%
echo [INFO] Image     : %IMAGE%
echo [INFO] DB        : %DB%
echo [INFO] Volume    : %DATA_VOL%
echo [INFO] BackupDir : "%BACKUP_DIR%"
echo [INFO] Dump file : "%HOST_DUMP_FILE%"
echo.
echo [WARNING] This will OVERWRITE and DELETE existing data of DB: %DB%
echo.

REM ==========================
REM 1) Stop Neo4j container
REM ==========================
echo [STEP 1/4] Stopping container...
docker stop %CONTAINER%
if errorlevel 1 (
  echo [ERROR] Failed to stop container: %CONTAINER%
  pause
  exit /b 1
)

REM ==========================
REM 2) Copy host dump file into volume at /data/dumps/%DB%.dump
REM ==========================
echo [STEP 2/4] Copying dump into volume...
set TMP_IMPORT=neo4j-dump-import
docker create --name %TMP_IMPORT% -v %DATA_VOL%:/data busybox sh -c "sleep 3600" >nul
if errorlevel 1 (
  echo [ERROR] Failed to create temp container for import.
  pause
  exit /b 1
)

REM 덤프 디렉터리가 없으면 생성
docker run --rm -v %DATA_VOL%:/data busybox mkdir -p %DUMPS_DIR%

REM 항상 같은 파일명으로 넣어 load가 찾기 쉽게 함
docker cp "%HOST_DUMP_FILE%" %TMP_IMPORT%:%DUMPS_DIR%/%DB%.dump
if errorlevel 1 (
  docker rm %TMP_IMPORT% >nul
  echo [ERROR] Failed to copy dump file into volume.
  pause
  exit /b 1
)

docker rm %TMP_IMPORT% >nul

REM ==========================
REM 3) Load database (DESTRUCTIVE overwrite)
REM ==========================
echo [STEP 3/4] Loading database from dump (overwrite)...
docker run --rm -i ^
  -v %DATA_VOL%:/data ^
  %IMAGE% ^
  neo4j-admin database load %DB% --from-path=%DUMPS_DIR% --overwrite-destination=true
if errorlevel 1 (
  echo [ERROR] Load failed.
  pause
  exit /b 1
)

REM ==========================
REM 4) Start Neo4j container
REM ==========================
echo [STEP 4/4] Starting container...
docker start %CONTAINER%
if errorlevel 1 (
  echo [ERROR] Failed to start container: %CONTAINER%
  pause
  exit /b 1
)

echo.
echo [DONE] Load completed successfully.
echo        Used dump: "%HOST_DUMP_FILE%"
pause
endlocal
