cd .. 
call .venv\Scripts\activate
cmd /c "python -m csa.cli.main analyze --java-source-folder "target_src/sml-pds-online" --java-object --clean --project-name sml-pds-online --application-name SML"
cd commands
echo [Current Directory] : %cd%
pause