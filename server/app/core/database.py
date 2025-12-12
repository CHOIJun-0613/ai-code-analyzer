from csa.dbwork.connection_pool import get_connection_pool
from app.core.config import settings

def get_db():
    pool = get_connection_pool()
    if not pool.is_initialized():
        pool.initialize(
            uri=settings.NEO4J_URI,
            user=settings.NEO4J_USER,
            password=settings.NEO4J_PASSWORD,
            database=settings.NEO4J_DATABASE or "neo4j"
        )
    return pool

def close_db():
    pool = get_connection_pool()
    pool.close_all()
