
import os

parts = [
    r"d:\workspaces\davis\ai-code-analyzer\server\csa\services\java_analysis\part1.py",
    r"d:\workspaces\davis\ai-code-analyzer\server\csa\services\java_analysis\part2.py",
    r"d:\workspaces\davis\ai-code-analyzer\server\csa\services\java_analysis\part3.py",
    r"d:\workspaces\davis\ai-code-analyzer\server\csa\services\java_analysis\part4.py"
]

output_file = r"d:\workspaces\davis\ai-code-analyzer\server\csa\services\java_analysis\project.py"

with open(output_file, 'w', encoding='utf-8') as outfile:
    for part in parts:
        if os.path.exists(part):
            with open(part, 'r', encoding='utf-8') as infile:
                outfile.write(infile.read())
                outfile.write("\n") # Ensure newline between parts
            print(f"Appended {part}")
        else:
            print(f"Error: {part} not found")

print(f"Successfully created {output_file}")
