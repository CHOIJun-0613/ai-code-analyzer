import os
import sys

# Add parent directory to path to allow importing app modules
current_dir = os.path.dirname(os.path.abspath(__file__))
server_dir = os.path.dirname(current_dir)
sys.path.append(server_dir)

from app.core.config import settings
from csa.dbwork.connection_pool import get_connection_pool

def delete_user_groups():
    """
    Neo4j에서 모든 UserGroup 노드와 관련 관계를 삭제합니다.
    """
    uri = settings.NEO4J_URI
    user = settings.NEO4J_USER
    password = settings.NEO4J_PASSWORD
    database = settings.NEO4J_DATABASE or "neo4j"

    pool = get_connection_pool()
    pool.initialize(uri, user, password, database)

    query = """
    MATCH (g:UserGroup)
    DETACH DELETE g
    """

    print(f"Connecting to Neo4j at {uri}...")
    try:
        with pool.session() as session:
            result = session.run(query)
            summary = result.consume()
            print(f"Deleted {summary.counters.nodes_deleted} UserGroup nodes.")
            print(f"Deleted {summary.counters.relationships_deleted} relationships.")
    except Exception as e:
        print(f"Error deleting UserGroups: {e}")
    finally:
        pool.close_all()
        print("Database connection closed.")

if __name__ == "__main__":
    delete_user_groups()
