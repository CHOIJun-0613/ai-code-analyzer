from typing import List, Optional
from datetime import datetime, timezone
from app.core.database import get_db
from app.models.user import User, UserCreate, UserUpdate, Group, GroupCreate, Permission, UserInDB
from app.core.security import get_password_hash

class UserService:
    @staticmethod
    def create_user(user: UserCreate) -> User:
        pool = get_db()
        hashed_password = get_password_hash(user.password)
        # Use username as ID
        user_id = user.username
        now = datetime.now(timezone.utc)
        
        if UserService.get_user_by_username(user.username):
            raise Exception("User ID already exists")

        query = """
        CREATE (u:User:System {
            id: $id,
            name: $name,
            email: $email,
            password: $password,
            is_active: $is_active,
            phone_number: $phone_number,
            preferences: '{}',
            preferences_ai: '{}',
            created_at: $created_at,
            updated_at: $updated_at
        })
        RETURN u
        """
        
        with pool.session() as session:
            result = session.run(query, {
                "id": user_id,
                "name": user.name,
                "email": user.email,
                "password": hashed_password,
                "is_active": user.is_active,
                "phone_number": user.phone_number,
                "created_at": now.isoformat(),
                "updated_at": now.isoformat()
            })
            record = result.single()
            if not record:
                raise Exception("Failed to create user")
            
            # If groups are provided, add user to groups
            if user.group_ids:
                for group_id in user.group_ids:
                    UserService.add_user_to_group(user_id, group_id)
            
            return UserService.get_user_by_username(user.username)

    @staticmethod
    def get_user_by_username(username: str) -> Optional[UserInDB]:
        pool = get_db()
        # Query ID as it is the username now
        query = """
        MATCH (u:User {id: $username})
        OPTIONAL MATCH (u)-[:BELONGS_TO]->(g:UserGroup)
        RETURN u, collect(g) as groups
        """
        
        with pool.session() as session:
            result = session.run(query, {"username": username})
            record = result.single()
            if not record:
                return None
            
            user_node = record["u"]
            group_nodes = record["groups"]
            
            groups = []
            for g in group_nodes:
                if g:
                    groups.append(Group(
                        id=g["id"],
                        name=g["name"],
                        permissions=[Permission(p) for p in g.get("permissions", [])]
                    ))
            
            return UserInDB(
                id=user_node["id"],
                username=user_node["id"], # Map ID back to username
                name=user_node.get("name"),
                email=user_node["email"],
                is_active=user_node["is_active"],
                phone_number=user_node.get("phone_number"),
                groups=groups,
                password=user_node["password"],
                created_at=datetime.fromisoformat(user_node["created_at"]) if user_node.get("created_at") else None,
                updated_at=datetime.fromisoformat(user_node["updated_at"]) if user_node.get("updated_at") else None
            )

    @staticmethod
    def list_users() -> List[User]:
        pool = get_db()
        query = """
        MATCH (u:User)
        OPTIONAL MATCH (u)-[:BELONGS_TO]->(g:UserGroup)
        RETURN u, collect(g) as groups
        """
        
        users = []
        with pool.session() as session:
            result = session.run(query)
            for record in result:
                user_node = record["u"]
                group_nodes = record["groups"]
                
                groups = []
                for g in group_nodes:
                    if g:
                        groups.append(Group(
                            id=g["id"],
                            name=g["name"],
                            permissions=[Permission(p) for p in g.get("permissions", [])]
                        ))
                
                users.append(User(
                    id=user_node["id"],
                    username=user_node["id"], # Map ID back to username
                    name=user_node.get("name"),
                    email=user_node["email"],
                    is_active=user_node["is_active"],
                    phone_number=user_node.get("phone_number"),
                    groups=groups,
                    created_at=datetime.fromisoformat(user_node["created_at"]) if user_node.get("created_at") else None,
                    updated_at=datetime.fromisoformat(user_node["updated_at"]) if user_node.get("updated_at") else None
                ))
        return users

    @staticmethod
    def update_user(user_id: str, user_update: UserUpdate) -> User:
        pool = get_db()
        
        # Prepare SET clause dynamically
        set_clauses = []
        params = {"user_id": user_id}

        if user_update.name is not None:
            set_clauses.append("u.name = $name")
            params["name"] = user_update.name
        
        if user_update.email is not None:
            set_clauses.append("u.email = $email")
            params["email"] = user_update.email
            
        if user_update.is_active is not None:
            set_clauses.append("u.is_active = $is_active")
            params["is_active"] = user_update.is_active

        if user_update.phone_number is not None:
            set_clauses.append("u.phone_number = $phone_number")
            params["phone_number"] = user_update.phone_number
            
        if user_update.password:
            set_clauses.append("u.password = $password")
            params["password"] = get_password_hash(user_update.password)

        # Update updated_at
        set_clauses.append("u.updated_at = $updated_at")
        params["updated_at"] = datetime.now(timezone.utc).isoformat()

        if not set_clauses and user_update.group_ids is None:
             # Nothing to update
             user = UserService.get_user_by_id(user_id)
             if not user:
                 raise Exception("User not found")
             return user

        with pool.session() as session:
             if set_clauses:
                 query = f"""
                 MATCH (u:User {{id: $user_id}})
                 SET {', '.join(set_clauses)}
                 RETURN u
                 """
                 result = session.run(query, params)
                 if not result.single():
                     raise Exception("User not found")

             # Handle group updates if provided
             if user_update.group_ids is not None:
                 # Remove all existing group relationships
                 delete_groups_query = """
                 MATCH (u:User {id: $user_id})-[r:BELONGS_TO]->(:UserGroup)
                 DELETE r
                 """
                 session.run(delete_groups_query, {"user_id": user_id})
                 
                 # Add to new groups
                 for group_id in user_update.group_ids:
                     UserService.add_user_to_group(user_id, group_id)

        return UserService.get_user_by_id(user_id)

    @staticmethod
    def delete_user(user_id: str):
        pool = get_db()
        query = """
        MATCH (u:User {id: $user_id})
        DETACH DELETE u
        """
        with pool.session() as session:
            session.run(query, {"user_id": user_id})

    @staticmethod
    def get_user_by_id(user_id: str) -> Optional[User]:
        pool = get_db()
        query = """
        MATCH (u:User {id: $user_id})
        OPTIONAL MATCH (u)-[:BELONGS_TO]->(g:UserGroup)
        RETURN u, collect(g) as groups
        """
        with pool.session() as session:
            result = session.run(query, {"user_id": user_id})
            record = result.single()
            if not record:
                return None
            
            user_node = record["u"]
            group_nodes = record["groups"]
            
            groups = []
            for g in group_nodes:
                if g:
                    groups.append(Group(
                        id=g["id"],
                        name=g["name"],
                        permissions=[Permission(p) for p in g.get("permissions", [])]
                    ))
            
            
            return User(
                id=user_node["id"],
                username=user_node["id"],
                name=user_node.get("name"),
                email=user_node["email"],
                is_active=user_node["is_active"],
                phone_number=user_node.get("phone_number"),
                groups=groups,
            created_at=datetime.fromisoformat(user_node["created_at"]) if user_node.get("created_at") else None,
                updated_at=datetime.fromisoformat(user_node["updated_at"]) if user_node.get("updated_at") else None
            )

    @staticmethod
    def get_group_by_id(group_id: str) -> Optional[Group]:
        pool = get_db()
        query = """
        MATCH (g:UserGroup {id: $group_id})
        RETURN g
        """
        
        with pool.session() as session:
            result = session.run(query, {"group_id": group_id})
            record = result.single()
            if not record:
                return None
            
            g = record["g"]
            return Group(
                id=g["id"],
                name=g["name"],
                permissions=[Permission(p) for p in g.get("permissions", [])],
                projects=[] # Projects are fetched separately if needed or we can optimize later
            )

    @staticmethod
    def check_group_exists(group_id: str) -> bool:
        pool = get_db()
        query = "OPTIONAL MATCH (g:UserGroup {id: $group_id}) RETURN g"
        with pool.session() as session:
            result = session.run(query, {"group_id": group_id}).single()
            return result["g"] is not None

    @staticmethod
    def create_group(group_id: str, name: str, permissions: List[str]) -> Group:
        pool = get_db()
        
        # Check if group already exists by ID
        if UserService.check_group_exists(group_id):
             raise ValueError(f"Group with ID '{group_id}' already exists")

        # Check if group name is already taken (Optional requirement: usually ID is unique, name can be duplicate but better not)
        # For now, following plan: ID is unique.

        query = """
        CREATE (g:UserGroup:System {
            id: $id,
            name: $name,
            permissions: $permissions
        })
        RETURN g
        """
        
        with pool.session() as session:
            result = session.run(query, {
                "id": group_id,
                "name": name,
                "permissions": permissions
            })
            record = result.single()
            if not record:
                raise Exception("Failed to create group")
            
            g = record["g"]
            
            return Group(
                id=g["id"],
                name=g["name"],
                permissions=[Permission(p) for p in g.get("permissions", [])],
                projects=[]
            )

    @staticmethod
    def delete_group(group_id: str):
        pool = get_db()
        query = """
        MATCH (g:UserGroup {id: $group_id})
        DETACH DELETE g
        """
        with pool.session() as session:
            session.run(query, {"group_id": group_id})

    @staticmethod
    def update_group(group_id: str, name: str) -> Group:
        pool = get_db()
        query = """
        MATCH (g:UserGroup {id: $group_id})
        SET g.name = $name
        RETURN g
        """
        with pool.session() as session:
            result = session.run(query, {"group_id": group_id, "name": name})
            record = result.single()
            if not record:
                raise Exception("Group not found")
            g = record["g"]
            return Group(
                id=g["id"],
                name=g["name"],
                permissions=[Permission(p) for p in g.get("permissions", [])],
                # Re-fetch or pass through permissions/projects if needed, but for now returned object needs to be valid
                projects=[] # Ideally we should fetch full group, but for update_group response this might suffice or we fetch full
            )

    @staticmethod
    def list_groups() -> List[Group]:
        pool = get_db()
        query = """
        MATCH (g:UserGroup)
        RETURN g
        """
        
        groups = []
        with pool.session() as session:
            result = session.run(query)
            for record in result:
                g = record["g"]
                # Fetch associated projects for each group
                projects_query = """
                MATCH (g:UserGroup {id: $group_id})-[:HAS_ACCESS_TO]->(p:Project)
                RETURN collect(p.name) as projects
                """
                projects_result = session.run(projects_query, {"group_id": g["id"]}).single()
                projects = projects_result["projects"] if projects_result else []

                groups.append(Group(
                    id=g["id"],
                    name=g["name"],
                    permissions=[Permission(p) for p in g.get("permissions", [])],
                    projects=projects
                ))
        return groups

    @staticmethod
    def update_group_permissions(group_id: str, permissions: List[Permission]) -> Group:
        pool = get_db()
        query = """
        MATCH (g:UserGroup {id: $group_id})
        SET g.permissions = $permissions
        RETURN g
        """
        
        with pool.session() as session:
            result = session.run(query, {
                "group_id": group_id,
                "permissions": [p.value for p in permissions]
            })
            record = result.single()
            if not record:
                raise Exception("Group not found")
            
            g = record["g"]
            return Group(
                id=g["id"],
                name=g["name"],
                permissions=[Permission(p) for p in g.get("permissions", [])]
            )

    @staticmethod
    def add_user_to_group(user_id: str, group_id: str):
        pool = get_db()
        query = """
        MATCH (u:User {id: $user_id})
        MATCH (g:UserGroup {id: $group_id})
        MERGE (u)-[:BELONGS_TO]->(g)
        """
        
        with pool.session() as session:
            session.run(query, {"user_id": user_id, "group_id": group_id})

    @staticmethod
    def get_user_preferences(username: str) -> str:
        pool = get_db()
        query = """
        MATCH (u:User {id: $username})
        RETURN u.preferences as preferences
        """
        
        with pool.session() as session:
            result = session.run(query, {"username": username})
            record = result.single()
            if not record:
                return "{}"
            
            return record["preferences"] or "{}"

    @staticmethod
    def update_user_preferences(username: str, preferences: str):
        pool = get_db()
        query = """
        MATCH (u:User {id: $username})
        SET u.preferences = $preferences
        RETURN u
        """
        
        with pool.session() as session:
            session.run(query, {"username": username, "preferences": preferences})

    @staticmethod
    def get_user_ai_preferences(username: str) -> str:
        pool = get_db()
        query = """
        MATCH (u:User {id: $username})
        RETURN u.preferences_ai as preferences_ai
        """
        
        with pool.session() as session:
            result = session.run(query, {"username": username})
            record = result.single()
            if not record:
                return "{}"
            
            return record["preferences_ai"] or "{}"

    @staticmethod
    def update_user_ai_preferences(username: str, preferences_ai: str):
        pool = get_db()
        query = """
        MATCH (u:User {id: $username})
        SET u.preferences_ai = $preferences_ai
        RETURN u
        """
        
        with pool.session() as session:
            session.run(query, {"username": username, "preferences_ai": preferences_ai})

    @staticmethod
    def update_group_projects(group_id: str, project_names: List[str]):
        pool = get_db()
        
        # 1. Remove existing relationships
        delete_query = """
        MATCH (g:UserGroup {id: $group_id})
        MATCH (g)-[r:HAS_ACCESS_TO]->(:Project)
        DELETE r
        """
        
        # 2. Create new relationships
        create_query = """
        MATCH (g:UserGroup {id: $group_id})
        UNWIND $project_names as project_name
        MATCH (p:Project {name: project_name})
        MERGE (g)-[:HAS_ACCESS_TO]->(p)
        """
        
        with pool.session() as session:
            session.run(delete_query, {"group_id": group_id})
            if project_names:
                session.run(create_query, {"group_id": group_id, "project_names": project_names})
