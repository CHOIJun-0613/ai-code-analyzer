import uuid
from typing import List, Optional
from app.core.database import get_db
from app.models.user import User, UserCreate, Group, GroupCreate, Permission, UserInDB
from app.core.security import get_password_hash

class UserService:
    @staticmethod
    def create_user(user: UserCreate) -> User:
        pool = get_db()
        hashed_password = get_password_hash(user.password)
        user_id = str(uuid.uuid4())
        
        query = """
        CREATE (u:User {
            id: $id,
            username: $username,
            email: $email,
            password: $password,
            is_active: $is_active
        })
        RETURN u
        """
        
        with pool.session() as session:
            result = session.run(query, {
                "id": user_id,
                "username": user.username,
                "email": user.email,
                "password": hashed_password,
                "is_active": user.is_active
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
        query = """
        MATCH (u:User {username: $username})
        OPTIONAL MATCH (u)-[:BELONGS_TO]->(g:Group)
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
                username=user_node["username"],
                email=user_node["email"],
                is_active=user_node["is_active"],
                groups=groups,
                password=user_node["password"]
            )

    @staticmethod
    def list_users() -> List[User]:
        pool = get_db()
        query = """
        MATCH (u:User)
        OPTIONAL MATCH (u)-[:BELONGS_TO]->(g:Group)
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
                    username=user_node["username"],
                    email=user_node["email"],
                    is_active=user_node["is_active"],
                    groups=groups
                ))
        return users

    @staticmethod
    def create_group(group: GroupCreate) -> Group:
        pool = get_db()
        group_id = str(uuid.uuid4())
        
        query = """
        CREATE (g:Group {
            id: $id,
            name: $name,
            permissions: $permissions
        })
        RETURN g
        """
        
        with pool.session() as session:
            result = session.run(query, {
                "id": group_id,
                "name": group.name,
                "permissions": [p.value for p in group.permissions]
            })
            record = result.single()
            if not record:
                raise Exception("Failed to create group")
            
            g = record["g"]
            
            # If projects are provided, create HAS_ACCESS_TO relationships
            if group.projects:
                 UserService.update_group_projects(g["id"], group.projects)

            return Group(
                id=g["id"],
                name=g["name"],
                permissions=[Permission(p) for p in g.get("permissions", [])],
                projects=group.projects
            )

    @staticmethod
    def list_groups() -> List[Group]:
        pool = get_db()
        query = """
        MATCH (g:Group)
        RETURN g
        """
        
        groups = []
        with pool.session() as session:
            result = session.run(query)
            for record in result:
                g = record["g"]
                # Fetch associated projects for each group
                projects_query = """
                MATCH (g:Group {id: $group_id})-[:HAS_ACCESS_TO]->(p:Project)
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
        MATCH (g:Group {id: $group_id})
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
        MATCH (g:Group {id: $group_id})
        MERGE (u)-[:BELONGS_TO]->(g)
        """
        
        with pool.session() as session:
            session.run(query, {"user_id": user_id, "group_id": group_id})

    @staticmethod
    def get_user_preferences(username: str) -> str:
        pool = get_db()
        query = """
        MATCH (u:User {username: $username})
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
        MATCH (u:User {username: $username})
        SET u.preferences = $preferences
        RETURN u
        """
        
        with pool.session() as session:
            session.run(query, {"username": username, "preferences": preferences})

    @staticmethod
    def update_group_projects(group_id: str, project_names: List[str]):
        pool = get_db()
        
        # 1. Remove existing relationships
        delete_query = """
        MATCH (g:Group {id: $group_id})
        MATCH (g)-[r:HAS_ACCESS_TO]->(:Project)
        DELETE r
        """
        
        # 2. Create new relationships
        create_query = """
        MATCH (g:Group {id: $group_id})
        UNWIND $project_names as project_name
        MATCH (p:Project {name: project_name})
        MERGE (g)-[:HAS_ACCESS_TO]->(p)
        """
        
        with pool.session() as session:
            session.run(delete_query, {"group_id": group_id})
            if project_names:
                session.run(create_query, {"group_id": group_id, "project_names": project_names})
