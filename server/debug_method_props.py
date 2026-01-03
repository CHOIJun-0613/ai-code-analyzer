import sys
import os

sys.path.append(os.path.join(os.getcwd(), 'server'))

from app.core.database import get_db

def check_method_properties():
    pool = get_db()
    
    print(f"--- Checking Method Node Properties ---")

    with pool.session() as session:
        query = """
        MATCH (m:Method)
        RETURN m
        LIMIT 1
        """
        result = session.run(query)
        record = result.single()
        
        if record:
            node = record['m']
            print("Method Node Properties:")
            for key, value in node.items():
                print(f"  {key}: {value}")
        else:
            print("No Method nodes found.")

if __name__ == "__main__":
    check_method_properties()
