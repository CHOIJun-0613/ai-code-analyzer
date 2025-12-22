from app.core.database import get_db
from app.services.user_service import UserService

def debug_admin_groups():
    username = "admin"
    user = UserService.get_user_by_username(username)
    if not user:
        print(f"User {username} not found")
        return

    print(f"User: {user.username}")
    print(f"Groups: {[g.name for g in user.groups]}")

    pool = get_db()
    
    # Check if 'Administrators' group exists
    with pool.session() as session:
        res = session.run("MATCH (g:Group {name: 'Administrators'}) RETURN g").single()
        if res:
            print("Administrators group found in DB")
        else:
            print("Administrators group NOT found in DB")

    # Check for any projects
    with pool.session() as session:
        res = session.run("MATCH (p:Project) RETURN count(p) as count").single()
        print(f"Total Projects in DB: {res['count']}")

if __name__ == "__main__":
    debug_admin_groups()
