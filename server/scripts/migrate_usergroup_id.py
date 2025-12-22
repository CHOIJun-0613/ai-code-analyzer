
import os
import sys

# Add the server directory to sys.path to allow importing app modules
current_dir = os.path.dirname(os.path.abspath(__file__))
server_dir = os.path.dirname(current_dir)
sys.path.append(server_dir)

from app.core.database import get_db

def migrate_usergroup_ids():
    print("Starting UserGroup ID migration...")
    pool = get_db()
    
    query = """
    MATCH (g:UserGroup)
    SET g.id = g.name
    RETURN g.name as name, g.id as id
    """
    
    try:
        with pool.session() as session:
            result = session.run(query)
            count = 0
            for record in result:
                print(f"Updated Group: {record['name']} -> ID: {record['id']}")
                count += 1
            print(f"Migration completed. Updated {count} UserGroup nodes.")
    except Exception as e:
        print(f"Migration failed: {e}")

if __name__ == "__main__":
    migrate_usergroup_ids()
