import sys
import os
from datetime import datetime

# Add server directory to sys.path
sys.path.append(os.path.join(os.path.dirname(__file__), 'server'))

print(f"Python path: {sys.path}", flush=True)

try:
    from dotenv import load_dotenv
    env_path = os.path.join(os.path.dirname(__file__), 'server', '.env')
    print(f"Loading .env from {env_path}", flush=True)
    load_dotenv(env_path)

    from app.models.user import UserCreate
    from app.services.user_service import UserService
except ImportError as e:
    print(f"Import Error: {e}", flush=True)
    sys.exit(1)

def verify_user_schema():
    print("Verifying User Schema Refactor...")
    
    unique_name = f"testuser_{int(datetime.now().timestamp())}"
    user_create = UserCreate(
        username=unique_name,
        name="Test User",
        email=f"{unique_name}@example.com",
        password="password123",
        phone_number="123-456-7890"
    )
    
    try:
        # 1. Create User
        print(f"Creating user {unique_name}...")
        created_user = UserService.create_user(user_create)
        
        # 2. Verify Return Model
        print("Verifying created user model...")
        assert created_user.id == unique_name, f"ID mismatch: {created_user.id} != {unique_name}"
        assert created_user.username == unique_name, f"Username mismatch: {created_user.username} != {unique_name}"
        assert created_user.created_at is not None, "created_at is None"
        # updated_at might be same as created_at initially
        assert created_user.updated_at is not None, "updated_at is None"
        print("Model verification passed.")
        
        # 3. Verify Persistence (Get by Username which uses ID lookup)
        print("Fetching user by username...")
        fetched_user = UserService.get_user_by_username(unique_name)
        assert fetched_user is not None
        assert fetched_user.id == unique_name
        assert fetched_user.created_at == created_user.created_at
        print("Persistence verification passed.")
        
        print("\nSUCCESS: User schema refactor verified.")
        
    except Exception as e:
        print(f"\nFAILURE: Verification failed with error: {e}")
        import traceback
        traceback.print_exc()

if __name__ == "__main__":
    verify_user_schema()
