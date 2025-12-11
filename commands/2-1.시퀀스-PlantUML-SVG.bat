cd .. 
call .venv\Scripts\activate
cmd /c "python -m csa.cli.main sequence --class-name UserController --project-name sml-fns-online --image-format svg"
cd commands
echo [현재 디렉토리] : %cd%
pause