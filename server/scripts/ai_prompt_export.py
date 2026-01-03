
import sys
import os
import json
from datetime import datetime

# Add server directory to sys.path
current_dir = os.path.dirname(os.path.abspath(__file__))
server_dir = os.path.dirname(current_dir)
sys.path.append(server_dir)

from app.core.config import settings
from csa.services.graph_db import GraphDB

def export_prompts():
    """
    Export AI Prompts from Neo4j to a JSON file.
    DB에 저장된 프롬프트 데이터를 JSON 파일로 내보냅니다.
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

    # 쿼리 실행 (Execute Query)
    # AiPrompt 노드의 모든 속성을 조회합니다.
    query = """
    MATCH (p:AiPrompt)
    RETURN p.name as name, 
           p.content as content, 
           p.description as description, 
           p.updatedAt as updatedAt, 
           p.updatedBy as updatedBy
    ORDER BY p.name
    """
    
    try:
        results = []
        with db.driver.session(database=db.database) as session:
            result = session.run(query)
            for record in result:
                results.append({
                    "name": record["name"],
                    "content": record["content"],
                    "description": record["description"],
                    "updatedAt": record["updatedAt"],
                    "updatedBy": record["updatedBy"]
                })
        
        print(f"Found {len(results)} prompts in database.")
        
        if not results:
            print("Warning: No prompts found to export.")
        
        # 데이터 저장 폴더 확인 (Check data directory)
        data_dir = os.path.join(current_dir, "data")
        if not os.path.exists(data_dir):
            os.makedirs(data_dir)
            print(f"Created data directory: {data_dir}")

        # 파일 저장 (Save to file)
        date_str = datetime.now().strftime("%Y%m%d")
        filename = f"ai_prompt_export_data-{date_str}.json"
        output_path = os.path.join(data_dir, filename)
        
        with open(output_path, 'w', encoding='utf-8') as f:
            json.dump(results, f, indent=2, ensure_ascii=False)
            
        print(f"Export successfully completed.")
        print(f"File saved to: {output_path}")
        
    except Exception as e:
        print(f"Error during export: {e}")
    finally:
        db.close()

if __name__ == "__main__":
    export_prompts()
