import sys
import os

# Add server directory to python path
sys.path.append(os.getcwd())

from app.services.user_service import UserService

def debug_service():
    try:
        print("Fetching user 'admin'...")
        user = UserService.get_user_by_username("admin")
        if not user:
            print("User 'admin' not found via Service")
            return

        print(f"User: {user.username}")
        print(f"Groups Raw: {user.groups}")
        group_names = [g.name for g in user.groups]
        print(f"Group Names: {group_names}")
        
        is_admin = any(g.name == "Administrators" for g in user.groups)
        print(f"Is Admin: {is_admin}")

    except Exception as e:
        print(f"Error: {e}")

if __name__ == "__main__":
    debug_service()
