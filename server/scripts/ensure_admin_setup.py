import sys
import os

# Ensure app can be imported
sys.path.append(os.path.dirname(os.path.dirname(os.path.abspath(__file__))))

from app.core.database import get_db
from app.services.user_service import UserService
from app.models.user import UserCreate

def ensure_admin_setup():
    print("Starting Admin Setup Check...")
    pool = get_db()
    
    # 1. Ensure 'Administrators' group exists
    admin_group_name = "Administrators"
    group = UserService.get_group_by_id(admin_group_name)
    if not group:
        print(f"Creating group '{admin_group_name}'...")
        try:
            UserService.create_group(admin_group_name, ["administrator", "manage_users", "manage_projects"])
            print(f"Group '{admin_group_name}' created.")
        except Exception as e:
            print(f"Error creating group: {e}")
            # Try to continue despite error, maybe it exists but fetch failed?
    else:
        print(f"Group '{admin_group_name}' already exists.")

    # 2. Ensure 'admin' user exists
    admin_username = "admin"
    user = UserService.get_user_by_username(admin_username)
    if not user:
        print(f"Creating user '{admin_username}'...")
        try:
            new_user = UserCreate(
                username=admin_username,
                password="adminpassword", # Should be changed by user later
                email="admin@example.com",
                name="System Administrator",
                is_active=True,
                group_ids=[admin_group_name]
            )
            UserService.create_user(new_user)
            print(f"User '{admin_username}' created.")
        except Exception as e:
            print(f"Error creating user: {e}")
            return
    else:
        print(f"User '{admin_username}' already exists.")

    # 3. Ensure 'admin' is in 'Administrators'
    user = UserService.get_user_by_username(admin_username)
    if user:
        is_in_group = any(g.name.lower() == admin_group_name.lower() for g in user.groups)
        if not is_in_group:
            print(f"Adding '{admin_username}' to '{admin_group_name}'...")
            try:
                UserService.add_user_to_group(admin_username, admin_group_name)
                print("User added to group.")
            except Exception as e:
                print(f"Error adding user to group: {e}")
        else:
            print(f"User '{admin_username}' is already in '{admin_group_name}'.")

    print("\nVerification:")
    user = UserService.get_user_by_username(admin_username)
    print(f"User: {user.username}")
    print(f"Groups: {[g.name for g in user.groups]}")

if __name__ == "__main__":
    ensure_admin_setup()
