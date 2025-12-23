import sys
import os

sys.path.append(os.path.join(os.getcwd(), 'server'))

from app.core.database import get_db

def verify_fix(username):
    pool = get_db()
    
    print(f"--- Verifying Fix for User: {username} ---")

    with pool.session() as session:
        # Corrected Query Pattern
        api_query = """
        MATCH (u:User {id: $username})-[:BELONGS_TO]->(g:UserGroup)-[:HAS_ACCESS_TO]->(p:Project)
        RETURN DISTINCT p
        ORDER BY p.updated_at DESC
        """
        
        result = session.run(api_query, {"username": username})
        projects = [record["p"]["name"] for record in result]
        print(f"Projects found for user '{username}': {projects}")
        
        if projects:
            print("SUCCESS: Projects retrieved successfully.")
        else:
            print("FAILURE: No projects retrieved.")

if __name__ == "__main__":
    verify_fix('06433')
