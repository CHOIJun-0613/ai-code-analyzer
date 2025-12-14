from fastapi import APIRouter, Depends, HTTPException, status
from csa.services.report_service import ReportService

# No need for ProjectService since ReportService now handles project fetching
# from csa.services.project_service import ProjectService 

router = APIRouter()

def get_report_service():
    return ReportService()

@router.get("/projects/{project_name}/reports/stats")
async def get_project_stats_report(
    project_name: str,
    report_service: ReportService = Depends(get_report_service)
):
    project = report_service.get_project_by_name(project_name)
    if not project:
        raise HTTPException(status_code=404, detail="Project not found")
    
    content = report_service.generate_project_stats_md(project)
    return {"content": content}

@router.get("/projects/{project_name}/reports/crud")
async def get_crud_matrix_report(
    project_name: str,
    report_service: ReportService = Depends(get_report_service)
):
    content = report_service.generate_crud_matrix_md(project_name)
    return {"content": content}

@router.get("/projects/{project_name}/reports/classes")
async def get_class_list_report(
    project_name: str,
    report_service: ReportService = Depends(get_report_service)
):
    content = report_service.generate_class_list_md(project_name)
    return {"content": content}
