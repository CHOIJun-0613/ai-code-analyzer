cd .. 
call .venv\Scripts\activate
cmd /c "python -m csa.cli.main analyze --all-objects --clean --project-name sml-fns-online --application-name SML "
cd commands
echo [Current directory] : %cd%
pause