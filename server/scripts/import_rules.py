import os
import sys

# Ensure d:\workspaces\davis\ai-code-analyzer\server is in sys.path
current_dir = os.path.dirname(os.path.abspath(__file__))
server_dir = os.path.dirname(current_dir)
sys.path.append(server_dir)

from dotenv import load_dotenv
from csa.services.analysis_rule_service import analysis_rule_service
from csa.utils.logger import get_logger
from csa.dbwork.connection_pool import initialize_pool_from_env

logger = get_logger(__name__, command="import_rules")

def import_rules():
    """
    server/rules 디렉토리의 .md 파일들을 읽어 DB에 저장한다.
    이미 존재하는 경우(이름 기준) 건너뛰거나 업데이트할 수 있지만,
    여기서는 관리자가 직접 실행한다고 가정하고 없으면 생성한다.
    """
    load_dotenv(os.path.join(server_dir, ".env"))
    initialize_pool_from_env()
    
    rules_dir = os.path.join(server_dir, "rules")
    if not os.path.exists(rules_dir):
        logger.error(f"Rules directory not found: {rules_dir}")
        return

    logger.info("Starting Analysis Rule Import...")
    
    # 순서 보장을 위해 파일명 정렬
    files = sorted([f for f in os.listdir(rules_dir) if f.endswith(".md")])
    
    for idx, filename in enumerate(files):
        try:
            file_path = os.path.join(rules_dir, filename)
            with open(file_path, "r", encoding="utf-8") as f:
                content = f.read()
            
            # 파일명에서 규칙명 추출 (rule001_extraction_logical_name.md -> Extraction Logical Name)
            # 혹은 파일명 그대로 사용
            name = filename.replace(".md", "")
            description = f"Imported from {filename}"
            
            # Check existing
            existing_rules = analysis_rule_service.get_all_rules()
            exists = any(r.name == name for r in existing_rules)
            
            if exists:
                logger.info(f"Rule '{name}' already exists. Skipping.")
                continue
            
            # Create
            analysis_rule_service.create_rule(
                name=name,
                description=description,
                content=content,
                useYn=True,
                order=idx,
                user_id="system_init"
            )
            logger.info(f"Imported rule: {name}")
            
        except Exception as e:
            logger.error(f"Failed to import {filename}: {e}")

    logger.info("Rule Import Completed.")

if __name__ == "__main__":
    import_rules()
