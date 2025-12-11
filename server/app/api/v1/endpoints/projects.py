from fastapi import APIRouter, HTTPException
from typing import List, Dict, Any
from app.core.database import get_db

router = APIRouter()

@router.get("/", response_model=List[Dict[str, Any]])
def get_projects():
    pool = get_db()
    query = """
    MATCH (p:Project)
    RETURN p
    ORDER BY p.updated_at DESC
    """
    with pool.session() as session:
        result = session.run(query)
        projects = [dict(record["p"]) for record in result]
    return projects

@router.get("/{project_name}/stats")
def get_project_stats(project_name: str):
    pool = get_db()
    # Example stats query
    query = """
    MATCH (p:Project {name: $name})
    OPTIONAL MATCH (p)-[:CONTAINS]->(pkg:Package)
    OPTIONAL MATCH (pkg)-[:CONTAINS]->(c:Class)
    RETURN p, count(distinct pkg) as package_count, count(distinct c) as class_count
    """
    with pool.session() as session:
        result = session.run(query, name=project_name).single()
        if not result or not result["p"]:
            raise HTTPException(status_code=404, detail="Project not found")
        
        project = dict(result["p"])
        return {
            "project": project,
            "package_count": result["package_count"],
            "class_count": result["class_count"]
        }

@router.get("/{project_name}/hierarchy")
def get_project_hierarchy(project_name: str):
    pool = get_db()
    query = """
    MATCH (p:Project {name: $name})-[:CONTAINS]->(pkg:Package)
    OPTIONAL MATCH (pkg)-[:CONTAINS]->(c:Class)
    RETURN pkg.name as package_name, collect(c.name) as classes
    ORDER BY pkg.name
    """
    with pool.session() as session:
        result = session.run(query, name=project_name)
        hierarchy = []
        for record in result:
            hierarchy.append({
                "package": record["package_name"],
                "classes": record["classes"]
            })
    return hierarchy
