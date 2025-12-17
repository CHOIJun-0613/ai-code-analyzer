from fastapi import APIRouter, Depends, HTTPException
from csa.services.class_report_service import ClassReportService

router = APIRouter()

def get_class_report_service():
    return ClassReportService()

@router.get("/projects/{project_name}/classes/{class_name}/reports/spec")
async def get_class_spec_report(
    project_name: str,
    class_name: str,
    service: ClassReportService = Depends(get_class_report_service)
):
    content = service.generate_class_spec_md(project_name, class_name)
    return {"content": content}

@router.get("/projects/{project_name}/classes/{class_name}/reports/sequence")
async def get_class_sequence_report(
    project_name: str,
    class_name: str,
    service: ClassReportService = Depends(get_class_report_service)
):
    content = service.generate_sequence_diagram_md(project_name, class_name)
    return {"content": content}

@router.get("/projects/{project_name}/classes/{class_name}/reports/impact")
async def get_class_impact_report(
    project_name: str,
    class_name: str,
    service: ClassReportService = Depends(get_class_report_service)
):
    content = service.generate_impact_analysis_report(project_name, class_name)
    return {"content": content}
