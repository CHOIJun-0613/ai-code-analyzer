from app.core.database import get_db
from app.models.user import UserCreate, GroupCreate, User, Group
from passlib.context import CryptContext
import uuid

pwd_context = CryptContext(schemes=["bcrypt"], deprecated="auto")

class UserService:
    def get_password_hash(self, password):
        return pwd_context.hash(password)

    def verify_password(self, plain_password, hashed_password):
        return pwd_context.verify(plain_password, hashed_password)

    def create_user(self, user: UserCreate):
        pool = get_db()
        hashed_password = self.get_password_hash(user.password)
        user_id = str(uuid.uuid4())
        
        query = """
        CREATE (u:User {id: $id, username: $username, email: $email, password: $password, is_active: $is_active})
        RETURN u
        """
        
        with pool.session() as session:
            session.run(query, id=user_id, username=user.username, email=user.email, 
                        password=hashed_password, is_active=user.is_active)
            
            # Assign groups
            if user.group_ids:
                for group_id in user.group_ids:
                    self.add_user_to_group(user_id, group_id)
                    
        return self.get_user(user_id)

    def get_user(self, user_id: str):
        pool = get_db()
        query = """
        MATCH (u:User {id: $id})
        OPTIONAL MATCH (u)-[:BELONGS_TO]->(g:Group)
        RETURN u, collect(g) as groups
        """
        with pool.session() as session:
            result = session.run(query, id=user_id).single()
            if result:
                user_data = dict(result["u"])
                groups_data = [dict(g) for g in result["groups"]]
                user_data["groups"] = groups_data
                return user_data
        return None

    def get_user_by_username(self, username: str):
        pool = get_db()
        query = """
        MATCH (u:User {username: $username})
        OPTIONAL MATCH (u)-[:BELONGS_TO]->(g:Group)
        RETURN u, collect(g) as groups
        """
        with pool.session() as session:
            result = session.run(query, username=username).single()
            if result:
                user_data = dict(result["u"])
                groups_data = [dict(g) for g in result["groups"]]
                user_data["groups"] = groups_data
                return user_data
        return None

    def create_group(self, group: GroupCreate):
        pool = get_db()
        group_id = str(uuid.uuid4())
        query = """
        CREATE (g:Group {id: $id, name: $name, permissions: $permissions})
        RETURN g
        """
        with pool.session() as session:
            session.run(query, id=group_id, name=group.name, permissions=group.permissions)
        return self.get_group(group_id)

    def get_group(self, group_id: str):
        pool = get_db()
        query = "MATCH (g:Group {id: $id}) RETURN g"
        with pool.session() as session:
            result = session.run(query, id=group_id).single()
            if result:
                return dict(result["g"])
        return None

    def add_user_to_group(self, user_id: str, group_id: str):
        pool = get_db()
        query = """
        MATCH (u:User {id: $user_id}), (g:Group {id: $group_id})
        MERGE (u)-[:BELONGS_TO]->(g)
        """
        with pool.session() as session:
            session.run(query, user_id=user_id, group_id=group_id)

user_service = UserService()
