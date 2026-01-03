
import sys
import os
import json
import argparse
from datetime import datetime

# Add server directory to sys.path
current_dir = os.path.dirname(os.path.abspath(__file__))
server_dir = os.path.dirname(current_dir)
sys.path.append(server_dir)

from app.core.config import settings
from csa.services.graph_db import GraphDB

def import_prompts(file_path=None):
    """
    Import AI Prompts from a JSON file to Neo4j.
    JSON 파일에서 AI 프롬프트 데이터를 읽어 Neo4j DB에 저장(Merge)합니다.
    """
    print("Starting AI Prompt Import...")
    
    # 임포트 파일 경로 결정 (Determine import file path)
    if not file_path:
        # 파일 경로가 지정되지 않은 경우, 오늘 날짜의 기본 파일명을 찾습니다.
        date_str = datetime.now().strftime("%Y%m%d")
        filename = f"ai_prompt_export_data-{date_str}.json"
        file_path = os.path.join(current_dir, "data", filename)
        print(f"No file specified. Looking for default file: {file_path}")
    
    if not os.path.exists(file_path):
        print(f"Error: Import file not found at {file_path}")
        print("Please specify a valid file path or ensure the default export file exists.")
        return

    print(f"Reading data from: {file_path}")
    
    try:
        with open(file_path, 'r', encoding='utf-8') as f:
            prompts = json.load(f)
            
        if not prompts:
            print("No prompts found in the JSON file.")
            return
        
        print(f"Loaded {len(prompts)} prompts from file.")
            
        # DB 연결 (Connect to DB)
        try:
            db = GraphDB(
                uri=settings.NEO4J_URI,
                user=settings.NEO4J_USER,
                password=settings.NEO4J_PASSWORD,
                database=settings.NEO4J_DATABASE
            )
        except Exception as e:
            print(f"Failed to connect to Neo4j: {e}")
            return
        
        # Merge 쿼리 (Merge Query)
        # :AiPrompt 와 :System 라벨을 함께 부여합니다.
        query = """
        MERGE (p:AiPrompt {name: $name})
        SET p.content = $content,
            p.description = $description,
            p.updatedAt = $updatedAt,
            p.updatedBy = $updatedBy,
            p:System
        RETURN p.name as name
        """
        
        success_count = 0
        error_count = 0
        
        with db.driver.session(database=db.database) as session:
            for prompt in prompts:
                prompt_name = prompt.get("name")
                if not prompt_name:
                    print("Skipping invalid prompt entry (missing name)")
                    continue

                try:
                    session.run(query, 
                        name=prompt_name,
                        content=prompt.get("content", ""),
                        description=prompt.get("description", ""),
                        updatedAt=datetime.now().isoformat(),
                        updatedBy="system"
                    )
                    success_count += 1
                    print(f"Imported/Updated: {prompt_name}")
                except Exception as e:
                    print(f"Failed to import {prompt_name}: {e}")
                    error_count += 1
                    
        print("-" * 30)
        print(f"Import completed.")
        print(f"Success: {success_count}")
        print(f"Failed: {error_count}")
        
    except json.JSONDecodeError:
        print(f"Error: Failed to decode JSON file. Please check the file format.")
    except Exception as e:
        print(f"Error during import: {e}")
    finally:
        if 'db' in locals():
            db.close()

if __name__ == "__main__":
    parser = argparse.ArgumentParser(description='Import AI Prompts from JSON to Neo4j')
    parser.add_argument('file', nargs='?', help='Path to the JSON file to import (optional)')
    args = parser.parse_args()
    
    import_prompts(args.file)
