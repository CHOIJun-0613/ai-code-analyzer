import sys
import os

# Add the parent directory to sys.path to allow imports from app
sys.path.append(os.path.dirname(os.path.dirname(os.path.abspath(__file__))))

from app.services.user_service import UserService
from app.models.user import UserCreate, Permission, GroupCreate
from dotenv import load_dotenv

env_path = os.path.join(os.path.dirname(os.path.dirname(os.path.abspath(__file__))), '.env')
load_dotenv(env_path)

def create_initial_data():
    try:
        # 1. Create Admin Group
        print("Creating Admin group...")
        admin_group = GroupCreate(
            name="Administrators",
            permissions=[
                Permission.MANAGE_USERS,
                Permission.ANALYZE_CODE,
                Permission.VIEW_PROJECT,
                Permission.MANAGE_PROJECT
            ]
        )
        try:
            group = UserService.create_group(admin_group.name, [p.value for p in admin_group.permissions])
            print(f"Admin group created with ID: {group.id}")
            group_id = group.id
        except Exception as e:
            print(f"Group creation failed (might already exist): {e}")
            # Try to find existing group
            groups = UserService.list_groups()
            admin_group_found = next((g for g in groups if g.name == "Administrators"), None)
            if admin_group_found:
                group_id = admin_group_found.id
                print(f"Found existing Admin group with ID: {group_id}")
            else:
                print("Could not create or find Admin group.")
                return

        # 2. Create Admin User
        print("Creating Admin user...")
        admin_user = UserCreate(
            username="admin",
            name="Administrator",
            email="admin@example.com",
            password="password123",
            phone_number="010-0000-0000",
            group_ids=[group_id]
        )
        
        try:
            user = UserService.create_user(admin_user)
            print(f"Admin user created successfully.")
            print(f"Username: {user.username}")
            print(f"Password: password123")
            print(f"Created At: {user.created_at}")
        except Exception as e:
            print(f"User creation failed: {e}")

    except Exception as e:
        print(f"An error occurred: {e}")

if __name__ == "__main__":
    create_initial_data()
