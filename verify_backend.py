import sys
import os

# Add server directory to path
sys.path.append(os.path.abspath(os.path.join(os.getcwd(), 'server')))

try:
    print("Attempting imports...")
    from app.api.v1.api import api_router
    print("Imported api_router")
    from csa.services.class_report_service import ClassReportService
    print("Imported ClassReportService")
    from app.api.v1.endpoints.class_reports import router as class_reports_router
    print("Imported class_reports_router")
    print("Backend imports successful.")
except Exception as e:
    print(f"Backend import failed: {e}")
    import traceback
    traceback.print_exc()
    sys.exit(1)
