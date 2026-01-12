import os
from dotenv import load_dotenv
from neo4j import GraphDatabase

# Load .env file
load_dotenv()

uri = os.getenv("NEO4J_URI")
user = os.getenv("NEO4J_USER")
password = os.getenv("NEO4J_PASSWORD")
database = os.getenv("NEO4J_DATABASE", "neo4j")

print(f"Connecting to {uri} as {user} with password length {len(password) if password else 0}")
print(f"Database: {database}")

try:
    driver = GraphDatabase.driver(uri, auth=(user, password))
    with driver.session(database=database) as session:
        result = session.run("RETURN 1 as vid")
        print(f"Connection successful: {result.single()['vid']}")
    driver.close()
except Exception as e:
    print(f"Connection failed: {e}")
