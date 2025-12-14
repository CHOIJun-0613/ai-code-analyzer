cd d:\workspaces\davis\ai-code-analyzer\server
call .venv\Scripts\activate
cmd /c "python -m csa.cli.main analyze --java-source-folder "../target_src/sml-fns-online" --java-object --clean --project-name sml-fns-online --application-name SML"
cd d:\workspaces\davis\ai-code-analyzer\commands
echo [Current Directory] : %cd%
pause