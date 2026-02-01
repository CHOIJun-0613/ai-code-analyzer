
from app.core.database import get_db
import sys
import os

# Ensure we can import app
sys.path.append(os.getcwd())

def verify_direct():
    pool = get_db()
    
    # The query from the logs
    query_complex = """
    MATCH (s:SqlStatement)
    OPTIONAL MATCH (m:MyBatisMapper {name: s.mapper_name})
    WHERE (toLower(s.id) CONTAINS toLower($sql_id) OR toLower(s.logical_name) CONTAINS toLower($sql_id))
    RETURN s.id, s.logical_name
    LIMIT 10
    """
    
    # A simpler query
    query_simple = """
    MATCH (s:SqlStatement)
    WHERE toLower(s.id) CONTAINS 'insert'
    RETURN s.id
    LIMIT 10
    """
    
    params = {"sql_id": "insert"}
    
    print("--- Running Complex Query ---")
    with pool.session() as session:
        result = session.run(query_complex, **params)
        for record in result:
            sid = record["s.id"]
            slog = record["s.logical_name"]
            print(f"Result: {sid} (Log: {slog})")
            if "insert" not in sid.lower() and "insert" not in (slog or "").lower():
                print("  !!! VIOLATION")

    print("\n--- Running Simple Query ---")
    with pool.session() as session:
        result = session.run(query_simple)
        for record in result:
            print(f"Result: {record['s.id']}")

if __name__ == "__main__":
    verify_direct()
