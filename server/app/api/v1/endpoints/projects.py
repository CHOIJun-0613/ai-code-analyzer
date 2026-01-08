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
    # Check if user is in 'Administrators' group (case-insensitive)
    is_admin = any(g.name.lower() == "administrators" for g in current_user.groups)
    
    if is_admin:
        query = """
        MATCH (p:Project)
        OPTIONAL MATCH (p)-[:CONTAINS]->(pkg:Package)
        OPTIONAL MATCH (pkg)-[:CONTAINS]->(c:Class)
        RETURN p, count(distinct pkg) as package_count, count(distinct c) as class_count
        ORDER BY p.updated_at DESC
        """
        params = {}
    else:
        query = """
        MATCH (u:User {id: $username})-[:BELONGS_TO]->(g:UserGroup)-[:HAS_ACCESS_TO]->(p:Project)
        OPTIONAL MATCH (p)-[:CONTAINS]->(pkg:Package)
        OPTIONAL MATCH (pkg)-[:CONTAINS]->(c:Class)
        RETURN p, count(distinct pkg) as package_count, count(distinct c) as class_count
        ORDER BY p.updated_at DESC
        """
        params = {"username": current_user.username}

    with pool.session() as session:
        result = session.run(query, **params)
        projects = []
        for record in result:
            project_data = dict(record["p"])
            project_data["package_count"] = record["package_count"]
            project_data["class_count"] = record["class_count"]
            projects.append(project_data)
            
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

@router.get("/{project_name}/classes/{class_name}/methods/{method_name}")
def get_method_details(project_name: str, class_name: str, method_name: str, package: str):
    pool = get_db()
    
    # 1. Fetch Method Node & Basic Info
    query_method = """
    MATCH (c:Class {name: $class_name, package_name: $package, project_name: $project_name})
    MATCH (c)-[:HAS_METHOD]->(m:Method {name: $method_name})
    OPTIONAL MATCH (m)-[:ANNOTATED_WITH]->(anno:Annotation)
    OPTIONAL MATCH (m)-[:THROWS]->(exc:Exception)
    RETURN m, collect(distinct anno.name) as anno_names, collect(distinct exc.name) as exceptions
    """

    
    # 2. Fetch Method Calls (Outgoing)
    query_calls = """
    MATCH (c:Class {name: $class_name, package_name: $package, project_name: $project_name})
    MATCH (c)-[:HAS_METHOD]->(m:Method {name: $method_name})
    MATCH (m)-[r:CALLS]->(target:Method)<-[:HAS_METHOD]-(tc:Class)
    RETURN target.name as name, 
           target.logical_name as logical_name, 
           target.return_type as return_type, 
           tc.name as class_name, 
           tc.package_name as package_name, 
           r.call_order as order
    ORDER BY r.call_order
    """


    with pool.session() as session:
        result_method = session.run(query_method, 
                                   project_name=project_name, 
                                   class_name=class_name, 
                                   method_name=method_name, 
                                   package=package).single()
        
        if not result_method:
            raise HTTPException(status_code=404, detail=f"Method {method_name} not found")
            
        method_data = dict(result_method["m"])
        
        # Parse JSON stored properties
        import json
        if "parameters" in method_data and isinstance(method_data["parameters"], str):
            try:
                method_data["parameters"] = json.loads(method_data["parameters"])
            except:
                pass
        
        # Use the collected annotation names
        method_data["annotations"] = result_method["anno_names"]
        method_data["exceptions"] = result_method["exceptions"]

        method_data["class_name"] = class_name
        method_data["package_name"] = package
        
        # --- NEW: Enrich Parameter and Return Type Details ---
        type_names = set()
        
        # 1. Collect Type Names from Return Type
        if method_data.get("return_type") and method_data["return_type"] != "void":
            # Handle generics like List<UserDTO> -> UserDTO
            rt = method_data["return_type"]
            if '<' in rt:
                # Extract content inside last <> or just simple split
                # Simple approach: split by < and take the first part if it's a collection, 
                # but usually we want the generic type argument.
                # Regex to find words might be better, but let's stick to simple extraction of possible class names.
                # For "List<UserDTO>", we want "UserDTO".
                import re
                found_types = re.findall(r'\b[A-Z]\w+\b', rt)
                type_names.update(found_types)
            else:
                type_names.add(rt)
                
        # 2. Collect Type Names from Parameters
        if method_data.get("parameters"):
            for param in method_data["parameters"]:
                if param.get("type"):
                    pt = param["type"]
                    if '<' in pt:
                        import re
                        found_types = re.findall(r'\b[A-Z]\w+\b', pt)
                        type_names.update(found_types)
                    else:
                        type_names.add(pt)
        
        # 3. Query DB for these types
        type_info_map = {}
        if type_names:
            query_types = """
            MATCH (c:Class {project_name: $project_name})
            WHERE c.name IN $type_names
            RETURN c.name as name, c.package_name as package_name, c.logical_name as logical_name
            """
            result_types = session.run(query_types, project_name=project_name, type_names=list(type_names))
            for record in result_types:
                # Store by name. If multiple, last one wins (simple resolution)
                type_info_map[record["name"]] = {
                    "package_name": record["package_name"],
                    "logical_name": record["logical_name"]
                }
                
        # 4. Enrich Data
        # Enrich Parameters
        if method_data.get("parameters"):
            for param in method_data["parameters"]:
                pt = param.get("type")
                # Simple matching: if type name exists in map
                target_type = pt
                if pt and '<' in pt:
                    # Try to find which part matches
                    import re
                    found = re.findall(r'\b[A-Z]\w+\b', pt)
                    for f in found:
                        if f in type_info_map:
                            target_type = f
                            break
                            
                if target_type in type_info_map:
                    param["type_package_name"] = type_info_map[target_type]["package_name"]
                    param["type_logical_name"] = type_info_map[target_type]["logical_name"]
                    
        # Enrich Return Type
        method_data["return_type_detail"] = {}
        rt = method_data.get("return_type")
        if rt:
            target_type = rt
            if '<' in rt:
                import re
                found = re.findall(r'\b[A-Z]\w+\b', rt)
                for f in found:
                    if f in type_info_map:
                        target_type = f
                        break
            
            if target_type in type_info_map:
                method_data["return_type_detail"] = {
                    "package_name": type_info_map[target_type]["package_name"],
                    "logical_name": type_info_map[target_type]["logical_name"]
                }
        # -----------------------------------------------------
        
        # Execute Calls Query
        result_calls = session.run(query_calls, 
                                  project_name=project_name, 
                                  class_name=class_name, 
                                  method_name=method_name, 
                                  package=package)
        
        calls = []
        for record in result_calls:
            calls.append({
                "name": record["name"],
                "logical_name": record["logical_name"],
                "return_type": record["return_type"],
                "class_name": record["class_name"],
                "package_name": record["package_name"],
                "order": record["order"]
            })
            
        method_data["calls"] = calls
        
        return method_data




