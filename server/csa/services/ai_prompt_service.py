import logging
import datetime
from typing import Dict, Optional, List
from neo4j import Session

from csa.models.entities.ai_prompt import AiPrompt
from csa.dbwork.connection_pool import get_connection_pool
from csa.aiwork.default_prompts import DEFAULT_PROMPTS

logger = logging.getLogger(__name__)

class AiPromptService:
    """Service for managing AI Prompts in Neo4j with in-memory caching."""
    
    _instance = None
    _cache: Dict[str, str] = {}
    _initialized = False

    @classmethod
    def get_instance(cls):
        if cls._instance is None:
            cls._instance = AiPromptService()
        return cls._instance

    def initialize_prompts(self):
        """
        Initialize prompts from DB.
        If DB is empty, seed with default prompts from prompt.py.
        """
        if self._initialized:
            return

        logger.info("Initializing AI Prompts...")
        pool = get_connection_pool()
        
        with pool.session() as session:
            # 1. Load existing prompts from DB
            db_prompts = self._load_prompts_from_db(session)
            
            # 2. Check and Seed defaults if necessary
            for name, content in DEFAULT_PROMPTS.items():
                if name not in db_prompts:
                    logger.info(f"Seeding default prompt: {name}")
                    self._create_prompt_in_db(session, name, content, description="Default system prompt")
                    db_prompts[name] = content
            
            # 3. Update Cache
            self._cache = db_prompts
            self._initialized = True
            logger.info(f"AI Prompts initialized. {len(self._cache)} prompts loaded in cache.")

    def get_prompt(self, name: str) -> str:
        """
        Get prompt content from cache. 
        Thread-safe for reading.
        """
        if not self._initialized:
            # Fallback to default if not initialized (e.g. unit tests)
            logger.warning(f"AiPromptService not initialized. Using default for {name}")
            return DEFAULT_PROMPTS.get(name, "")

        if name not in self._cache:
            raise KeyError(f"Unregistered prompt requested: {name}")
        
        return self._cache[name]

    def get_all_prompts(self) -> List[AiPrompt]:
        """Get all prompts from DB (for Admin UI)."""
        pool = get_connection_pool()
        prompts = []
        with pool.session() as session:
            result = session.run("""
                MATCH (p:AiPrompt)
                RETURN p.name as name, p.content as content, p.description as description, 
                       p.updatedAt as updatedAt, p.updatedBy as updatedBy,
                       'System' IN labels(p) as is_system
                ORDER BY p.name
            """)
            for record in result:
                prompts.append(AiPrompt(
                    name=record["name"],
                    content=record["content"],
                    description=record["description"] or "",
                    updated_at=record["updatedAt"] or "",
                    updated_by=record["updatedBy"] or "",
                    is_system=record["is_system"]
                ))
        return prompts

    def get_prompt_detail(self, name: str) -> Optional[AiPrompt]:
        """Get prompt detail from DB."""
        pool = get_connection_pool()
        with pool.session() as session:
            result = session.run("""
                MATCH (p:AiPrompt {name: $name})
                RETURN p.name as name, p.content as content, p.description as description, 
                       p.updatedAt as updatedAt, p.updatedBy as updatedBy,
                       'System' IN labels(p) as is_system
            """, name=name)
            record = result.single()
            if record:
                return AiPrompt(
                    name=record["name"],
                    content=record["content"],
                    description=record["description"] or "",
                    updated_at=record["updatedAt"] or "",
                    updated_by=record["updatedBy"] or "",
                    is_system=record["is_system"]
                )
        return None

    def update_prompt(self, name: str, content: str, description: Optional[str] = None, user_id: str = "admin") -> AiPrompt:
        """
        Update prompt in DB and update cache.
        """
        pool = get_connection_pool()
        with pool.session() as session:
            updated_at = datetime.datetime.now().isoformat()
            
            # Update DB
            # Note: We update description only if it's provided (not None)
            # Or if we want to allow clearing it, we should handle that.
            # For now, let's assume if it is NOT None, we update it.
            
            if description is not None:
                session.run("""
                    MERGE (p:AiPrompt {name: $name})
                    SET p.content = $content,
                        p.description = $description,
                        p.updatedAt = $updated_at,
                        p.updatedBy = $user_id
                """, name=name, content=content, description=description, updated_at=updated_at, user_id=user_id)
            else:
                session.run("""
                    MERGE (p:AiPrompt {name: $name})
                    SET p.content = $content,
                        p.updatedAt = $updated_at,
                        p.updatedBy = $user_id
                """, name=name, content=content, updated_at=updated_at, user_id=user_id)
            
            # Update Cache
            self._cache[name] = content
            logger.info(f"Prompt '{name}' updated by {user_id}")
            
            return self.get_prompt_detail(name)

    def _load_prompts_from_db(self, session: Session) -> Dict[str, str]:
        result = session.run("MATCH (p:AiPrompt) RETURN p.name as name, p.content as content")
        return {record["name"]: record["content"] for record in result}

    def _create_prompt_in_db(self, session: Session, name: str, content: str, description: str = ""):
        now = datetime.datetime.now().isoformat()
        session.run("""
            CREATE (p:AiPrompt:System {
                name: $name,
                content: $content,
                description: $description,
                updatedAt: $now,
                updatedBy: 'system'
            })
        """, name=name, content=content, description=description, now=now)

# Global Instance
ai_prompt_service = AiPromptService.get_instance()
