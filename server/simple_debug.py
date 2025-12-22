print("Starting debug...")
try:
    from app.core.database import get_db
    print("Imported get_db")
    pool = get_db()
    with pool.session() as session:
        print("Session opened")
        res = session.run("MATCH (n) RETURN count(n) as count").single()
        print(f"Total nodes: {res['count']}")
        res2 = session.run("MATCH (p:Project) RETURN count(p) as count").single()
        print(f"Projects: {res2['count']}")
        res3 = session.run("MATCH (u:User {username: 'admin'})-[:BELONGS_TO]->(g:UserGroup) RETURN g.name").data()
        print(f"Admin Groups: {res3}")

except Exception as e:
    print(f"Error: {e}")
print("Done")
