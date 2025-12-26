import os
import sys

# Determine project root and add to path
current_dir = os.path.dirname(os.path.abspath(__file__))
sys.path.append(current_dir)

print("Starting verify_analysis_log.py...")

try:
    # Load env
    from dotenv import load_dotenv
    load_dotenv(os.path.join(current_dir, ".env"))
    print("Environment loaded.")

    from app.core.config import settings
    print(f"Settings loaded. URI: {settings.NEO4J_URI}")
    
    from csa.services.graph_db import GraphDB
    print("GraphDB imported.")
except Exception as e:
    print(f"Import Error: {e}")
    sys.exit(1)

from datetime import datetime, timedelta

def verify():
    print("Testing save_analysis_history...")
    
    # Init GraphDB
    # Checking if settings are loaded
    print(f"Connecting to {settings.NEO4J_URI} as {settings.NEO4J_USER}")
    
    db = GraphDB(
        uri=settings.NEO4J_URI,
        user=settings.NEO4J_USER,
        password=settings.NEO4J_PASSWORD,
        database=settings.NEO4J_DATABASE or "neo4j"
    )
    
    # Dummy data
    job_id = "TEST-JOB-ID-12345"
    start_time = datetime.now() - timedelta(minutes=5)
    end_time = datetime.now()
    duration = "00:05:00"
    file_count = 42
    result = "Completed"
    user_id = "test_user"
    summary = "Test analysis summary."
    
    try:
        # Clean up previous test run if exists
        with db._driver.session(database=db._database) as session:
             session.run("MATCH (h:AnalysisHistory {job_id: $job_id}) DETACH DELETE h", job_id=job_id)

        db.save_analysis_history(
            job_id=job_id,
            start_time=start_time,
            end_time=end_time,
            duration=duration,
            file_count=file_count,
            result=result,
            user_id=user_id,
            summary=summary
        )
        print("save_analysis_history called successfully.")
        
        # Verify node
        query = """
        MATCH (h:AnalysisHistory:System {job_id: $job_id})
        RETURN h
        """
        with db._driver.session(database=db._database) as session:
            record = session.run(query, job_id=job_id).single()
            if record:
                node = record["h"]
                print(f"Node found: {node}")
                # Neo4j node to dict
                props = dict(node)
                print(f"Props: {props}")
                
                # Check props
                assert props["result"] == result
                assert props["file_count"] == file_count
                assert props["user_id"] == user_id
                assert props["job_id"] == job_id
                assert "start_time" in props
                # Check format
                print(f"Start Time: {props['start_time']}")
                
                print("Verification PASSED")
                with open("verification_output.txt", "w") as f:
                    f.write("PASSED")
            else:
                print("Verification FAILED: Node not found")
                with open("verification_output.txt", "w") as f:
                    f.write("FAILED: Node not found")
                
    except Exception as e:
        print(f"Verification ERROR: {e}")
        import traceback
        traceback.print_exc()
        with open("verification_output.txt", "w") as f:
            f.write(f"ERROR: {e}")
    finally:
        db.close()

if __name__ == "__main__":
    verify()
