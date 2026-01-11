
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

def import_analysis_rules(file_path=None):
    """
    Import Analysis Rules from a JSON file to Neo4j.
    JSON 파일에서 분석 규칙 데이터를 읽어 Neo4j DB에 저장합니다.
    기존에 동일한 이름의 규칙이 있다면 useYn=False로 비활성화하고(Soft Delete),
    새로운 버전의 규칙을 생성합니다.
    """
    print("Starting Analysis Rule Import...")
    
    # 임포트 파일 경로 결정 (Determine import file path)
    if not file_path:
        # 파일 경로가 지정되지 않은 경우, 오늘 날짜의 기본 파일명을 찾습니다.
        date_str = datetime.now().strftime("%Y%m%d")
        # 데이터 디렉토리 검색
        data_dir = os.path.join(current_dir, "data")
        
        # 가장 최근 파일 찾기 시도 (YYYYMMDD 패턴 가정)
        targets = []
        if os.path.exists(data_dir):
            for f in os.listdir(data_dir):
                if f.startswith("analysis_rules_data-") and f.endswith(".json"):
                    targets.append(os.path.join(data_dir, f))
        
        if targets:
            # 이름순 정렬(날짜포함이므로)하여 마지막 파일 선택
            targets.sort()
            file_path = targets[-1]
            print(f"No file specified. Using latest found file: {file_path}")
        else:
            # 파일 없음
            print(f"Error: No export file found in {data_dir}")
            return
    
    if not os.path.exists(file_path):
        print(f"Error: Import file not found at {file_path}")
        return

    print(f"Reading data from: {file_path}")
    
    try:
        with open(file_path, 'r', encoding='utf-8') as f:
            rules = json.load(f)
            
        if not rules:
            print("No rules found in the JSON file.")
            return
        
        print(f"Loaded {len(rules)} rules from file.")
            
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
        
        success_count = 0
        deactivated_count = 0
        error_count = 0
        
        with db.driver.session(database=db.database) as session:
            for rule in rules:
                rule_name = rule.get("name")
                if not rule_name:
                    print("Skipping invalid rule entry (missing name)")
                    continue

                try:
                    # Transaction 처리
                    with session.begin_transaction() as tx:
                        # 1. 기존 동일 이름 규칙 비활성화 (Deactivate existing rules)
                        deactivate_query = """
                        MATCH (r:AnalysisRule {name: $name})
                        WHERE r.useYn = true
                        SET r.useYn = false, r.updatedBy = 'system_import_disabled'
                        RETURN count(r) as count
                        """
                        result = tx.run(deactivate_query, name=rule_name)
                        deactivated = result.single()["count"]
                        deactivated_count += deactivated
                        
                        # 2. 새 규칙 생성 (Create new rule)
                        create_query = """
                        CREATE (r:AnalysisRule {
                            name: $name,
                            description: $description,
                            content: $content,
                            useYn: true,
                            order: $order,
                            updatedAt: $updatedAt,
                            updatedBy: $updatedBy
                        })
                        """
                        # 원본 데이터의 isSystem 여부에 따라 라벨 추가
                        if rule.get("isSystem"):
                            create_query = """
                            CREATE (r:AnalysisRule:System {
                                name: $name,
                                description: $description,
                                content: $content,
                                useYn: true,
                                order: $order,
                                updatedAt: $updatedAt,
                                updatedBy: $updatedBy
                            })
                            """
                        
                        tx.run(create_query, 
                            name=rule_name,
                            description=rule.get("description", ""),
                            content=rule.get("content", ""),
                            order=rule.get("order", 0),
                            updatedAt=datetime.now().isoformat(), # Import 시점 시간으로 갱신
                            updatedBy="system_import"
                        )
                        tx.commit()
                        
                    success_count += 1
                    print(f"Imported: {rule_name} (Deactivated old versions: {deactivated})")
                    
                except Exception as e:
                    print(f"Failed to import {rule_name}: {e}")
                    error_count += 1
                    
        print("-" * 30)
        print(f"Import completed.")
        print(f"Success (New Created): {success_count}")
        print(f"Deactivated Old Rules: {deactivated_count}")
        print(f"Failed: {error_count}")
        
    except json.JSONDecodeError:
        print(f"Error: Failed to decode JSON file. Please check the file format.")
    except Exception as e:
        print(f"Error during import: {e}")
    finally:
        if 'db' in locals():
            db.close()

if __name__ == "__main__":
    parser = argparse.ArgumentParser(description='Import Analysis Rules from JSON to Neo4j')
    parser.add_argument('file', nargs='?', help='Path to the JSON file to import (optional)')
    args = parser.parse_args()
    
    import_analysis_rules(args.file)
