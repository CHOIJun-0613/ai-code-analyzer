import sys
import os

# Add server root to path
sys.path.append(os.getcwd())

print("Verifying imports...")

from csa.models.entities.project import Project
print("Project entity imported.")
p = Project(charset="EUC-KR", application_name="TestApp")
print(f"Project instance created: charset={p.charset}, app={p.application_name}")

from app.api.v1.endpoints.analysis import AnalysisRequest
print("AnalysisRequest imported.")
req = AnalysisRequest(source_folder=".", charset="EUC-KR")
print(f"AnalysisRequest instance created: charset={req.charset}")

from csa.services.java_analysis.project import estimate_file_complexity
print("estimate_file_complexity imported.")

try:
    from csa.services.graph_db.application_nodes import ApplicationMixin
    print("ApplicationMixin imported.")
except ImportError as e:
    print(f"ApplicationMixin import failed: {e}")

try:
    from app.api.v1.endpoints.applications import router
    print("Applications router imported.")
except ImportError as e:
    print(f"Applications router import failed: {e}")

print("Verification complete.")
