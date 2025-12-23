import sys
import os

sys.path.append(os.path.join(os.getcwd(), 'server'))

from app.core.database import get_db

def check_class_properties():
    pool = get_db()
    
    print(f"--- Checking Class Node Properties ---")

    with pool.session() as session:
        query = """
        MATCH (c:Class)
        RETURN c
        LIMIT 1
        """
        result = session.run(query)
        record = result.single()
        
        if record:
            node = record['c']
            print("Class Node Properties:")
            for key, value in node.items():
                print(f"  {key}: {value}")
        else:
            print("No Class nodes found.")

if __name__ == "__main__":
    check_class_properties()
