from __future__ import annotations

from csa.services.graph_db.analytics import AnalyticsMixin
from csa.services.graph_db.application_nodes import ApplicationMixin
from csa.services.graph_db.base import GraphDBBase
from csa.services.graph_db.database_nodes import DatabaseMixin
from csa.services.graph_db.maintenance import MaintenanceMixin
from csa.services.graph_db.persistence_nodes import PersistenceMixin
from csa.services.graph_db.project_nodes import ProjectMixin
from csa.services.graph_db.class_nodes import ClassMixin
from csa.services.graph_db.analysis_history import AnalysisHistoryMixin


class GraphDB(
    GraphDBBase,
    ProjectMixin,
    ClassMixin,
    ApplicationMixin,
    PersistenceMixin,
    DatabaseMixin,
    AnalyticsMixin,
    MaintenanceMixin,
    AnalysisHistoryMixin,
):
    """Facade that composes all graph database features."""


__all__ = ["GraphDB"]
