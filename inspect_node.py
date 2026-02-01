
from app.core.database import get_db
import sys

# Ensure we can import app
import os
sys.path.append(os.getcwd())

def inspect_node():
    pool = get_db()
    
    target_id = "selectMetPbokLifecMngLdgPkInfo"
    
    query = """
    MATCH (s:SqlStatement {id: $id})
    RETURN s
    """
    
    print(f"--- Inspecting Node {target_id} ---")
    with pool.session() as session:
        result = session.run(query, id=target_id)
        record = result.single()
        if record:
            node = record["s"]
            print("Properties:")
            for key, value in node.items():
                print(f"  {key}: {repr(value)}")
                
            # Check overlap manually
            search_term = "insert"
            if search_term in node.get("id", "").lower():
                print("!! Match found in ID")
            if search_term in (node.get("logical_name") or "").lower():
                print("!! Match found in logical_name")
                
        else:
            print("Node not found")

if __name__ == "__main__":
    inspect_node()
