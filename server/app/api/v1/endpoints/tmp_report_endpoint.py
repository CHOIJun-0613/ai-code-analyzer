
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
