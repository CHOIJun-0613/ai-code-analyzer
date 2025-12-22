from fastapi import APIRouter, HTTPException, Depends
from app.api import deps
from pydantic import BaseModel
from typing import List, Dict, Any
from app.core.database import get_db

router = APIRouter()

class ProjectUpdate(BaseModel):
    framework: str = None
    repository: str = None

@router.patch("/{project_name}")
def update_project(project_name: str, update_data: ProjectUpdate):
    pool = get_db()
    
    # Dynamic query construction
    set_clauses = []
    params = {"name": project_name}
    
    if update_data.framework is not None:
        set_clauses.append("p.framework = $framework")
        params["framework"] = update_data.framework
        
    if update_data.repository is not None:
        set_clauses.append("p.repository = $repository")
        params["repository"] = update_data.repository
    
    if not set_clauses:
        return {"message": "No changes requested"}
        
    set_clauses.append("p.updated_at = toString(datetime())")
    
    query = f"""
    MATCH (p:Project {{name: $name}})
    SET {", ".join(set_clauses)}
    RETURN p
    """
    
    with pool.session() as session:
        result = session.run(query, **params).single()
        if not result:
            raise HTTPException(status_code=404, detail="Project not found")
            
        return dict(result["p"])

@router.get("/", response_model=List[Dict[str, Any]])
def get_projects(current_user: Any = Depends(deps.get_current_user)):
    pool = get_db()
    
    # Check if user is in 'Administrators' group
    is_admin = any(g.name == "Administrators" for g in current_user.groups)
    
    if is_admin:
        query = """
        MATCH (p:Project)
        RETURN p
        ORDER BY p.updated_at DESC
        """
        params = {}
    else:
        query = """
        MATCH (u:User {username: $username})-[:BELONGS_TO]->(g:Group)-[:HAS_ACCESS_TO]->(p:Project)
        RETURN DISTINCT p
        ORDER BY p.updated_at DESC
        """
        params = {"username": current_user.username}

    with pool.session() as session:
        result = session.run(query, **params)
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
    RETURN pkg.name as package_name, collect({name: c.name, logical_name: c.logical_name}) as classes
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

@router.get("/{project_name}/reports/{report_type}")
def get_project_report(project_name: str, report_type: str, format: str = "markdown"):
    from csa.services.report_service import ReportService
    report_service = ReportService()
    
    # Initialize response content
    content = ""
    
    if report_type == "stats":
        project = report_service.get_project_by_name(project_name)
        if not project:
            raise HTTPException(status_code=404, detail="Project not found")
        content = report_service.generate_project_stats_md(project)
        
    elif report_type == "crud":
        if format == "json":
            return report_service.generate_crud_matrix_data(project_name)
        content = report_service.generate_crud_matrix_md(project_name)
        
    elif report_type == "classes":
        if format == "json":
            return report_service.generate_class_list_data(project_name)
        content = report_service.generate_class_list_md(project_name)
        
    else:
        raise HTTPException(status_code=400, detail="Invalid report type")
        
    return {"content": content}

@router.get("/{project_name}/classes/{class_name}")
def get_class_details(project_name: str, class_name: str, package: str):
    pool = get_db()
    
    # 1. Fetch Class Node & Basic Info
    # Also fetch annotations, extended class, implemented interfaces
    query_class = """
    MATCH (c:Class {name: $class_name, package_name: $package, project_name: $project_name})
    OPTIONAL MATCH (c)-[:EXTENDS]->(super:Class)
    OPTIONAL MATCH (c)-[:IMPLEMENTS]->(iface:Interface)
    OPTIONAL MATCH (c)-[:ANNOTATED_WITH]->(anno:Annotation)
    RETURN c, 
           super.name as superclass_name, 
           collect(distinct iface.name) as interfaces,
           collect(distinct anno.name) as annotations
    """
    
    # 2. Fetch Fields
    query_fields = """
    MATCH (c:Class {name: $class_name, package_name: $package, project_name: $project_name})
    MATCH (c)-[:HAS_FIELD]->(f:Field)
    RETURN f
    ORDER BY f.name
    """
    
    # 3. Fetch Methods
    query_methods = """
    MATCH (c:Class {name: $class_name, package_name: $package, project_name: $project_name})
    MATCH (c)-[:HAS_METHOD]->(m:Method)
    RETURN m
    ORDER BY m.name
    """

    with pool.session() as session:
        # Execute Class Query
        result_class = session.run(query_class, class_name=class_name, package=package, project_name=project_name).single()
        
        if not result_class:
            raise HTTPException(status_code=404, detail=f"Class {class_name} not found in package {package}")
            
        class_data = dict(result_class["c"])
        class_data["superclass"] = result_class["superclass_name"]
        class_data["interfaces"] = result_class["interfaces"]
        class_data["annotations"] = result_class["annotations"]

        # Execute Fields Query
        result_fields = session.run(query_fields, class_name=class_name, package=package, project_name=project_name)
        fields = [dict(record["f"]) for record in result_fields]
        class_data["fields"] = fields

        # Execute Methods Query
        result_methods = session.run(query_methods, class_name=class_name, package=package, project_name=project_name)
        methods = [dict(record["m"]) for record in result_methods]
        class_data["methods"] = methods
        
        return class_data
