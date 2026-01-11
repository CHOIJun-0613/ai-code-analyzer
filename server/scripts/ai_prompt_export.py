
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

def export_prompts(output_dir=None):
    """
    Export AI Prompts from Neo4j to a JSON file.
    Neo4j에서 AI 프롬프트 데이터를 조회하여 JSON 파일로 저장합니다.
    """
    print("Starting AI Prompt Export...")
    
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

    prompts = []
    
    # Query Prompts
    query = """
    MATCH (p:AiPrompt)
    RETURN p.name as name, 
           p.content as content, 
           p.description as description, 
           p.updatedAt as updatedAt, 
           p.updatedBy as updatedBy,
           'System' IN labels(p) as is_system
    ORDER BY p.name
    """
    
    try:
        with db.driver.session(database=db.database) as session:
            result = session.run(query)
            for record in result:
                prompts.append({
                    "name": record["name"],
                    "content": record["content"],
                    "description": record["description"],
                    "updatedAt": record["updatedAt"],
                    "updatedBy": record["updatedBy"],
                    "isSystem": record["is_system"]
                })
        
        print(f"Found {len(prompts)} prompts in database.")
        
        if not prompts:
            print("No prompts found to export.")
            return

        # Prepare Output File
        if not output_dir:
            output_dir = os.path.join(current_dir, "data")
            
        if not os.path.exists(output_dir):
            os.makedirs(output_dir)
            
        date_str = datetime.now().strftime("%Y%m%d-%H%M%S")
        filename = f"ai_prompt_export_data-{date_str}.json"
        file_path = os.path.join(output_dir, filename)
        
        # Save to JSON
        with open(file_path, 'w', encoding='utf-8') as f:
            json.dump(prompts, f, indent=4, ensure_ascii=False)
            
        print(f"Successfully exported {len(prompts)} prompts to:")
        print(f"{file_path}")
        
    except Exception as e:
        print(f"Error during export: {e}")
    finally:
        db.close()

if __name__ == "__main__":
    parser = argparse.ArgumentParser(description='Export AI Prompts from Neo4j to JSON')
    parser.add_argument('output_dir', nargs='?', help='Directory to save the JSON file (optional)')
    args = parser.parse_args()
    
    export_prompts(args.output_dir)
