import os
import sys

# Ensure server directory is in sys.path
current_dir = os.path.dirname(os.path.abspath(__file__))
server_dir = os.path.dirname(current_dir)
sys.path.append(server_dir)

from dotenv import load_dotenv

from csa.dbwork.connection_pool import get_connection_pool, initialize_pool_from_env

def verify_rules():
    print("Loading environment variables...", flush=True)
    load_dotenv(os.path.join(server_dir, ".env"))
    
    print("Initializing connection pool...", flush=True)
    initialize_pool_from_env()
    
    print("Attempting to connect to Neo4j...", flush=True)
    pool = get_connection_pool()
    print("Connection pool retrieved. Opening session...", flush=True)
    with pool.session() as session:
        print("Session opened. Running query...", flush=True)
        result = session.run("MATCH (r:AnalysisRule) RETURN count(r) as count")
        count = result.single()["count"]
        print(f"Total AnalysisRule nodes: {count}", flush=True)
        
        if count > 0:
            result = session.run("MATCH (r:AnalysisRule) RETURN r.name as name")
            print("Existing Rules:")
            for record in result:
                print(f" - {record['name']}")

if __name__ == "__main__":
    try:
        verify_rules()
    except Exception as e:
        print(f"Error: {e}")
