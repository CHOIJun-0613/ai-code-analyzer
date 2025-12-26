from __future__ import annotations

from datetime import datetime
from typing import Optional

class AnalysisHistoryMixin:
    """Manage Analysis Job History logging."""

    def save_analysis_history(
        self,
        job_id: str,
        start_time: datetime,
        end_time: datetime,
        duration: str,
        file_count: int,
        result: str,
        user_id: str,
        summary: str,
        project_name: str,
        preferences: str,
    ) -> None:
        """
        Record the analysis history to Neo4j.
        
        Args:
            job_id: The job ID (UUID for API, 'Server CLI analysis' for CLI).
            start_time: Start datetime.
            end_time: End datetime.
            duration: Duration string "HH:MM:SS".
            file_count: Number of files analyzed.
            result: One of 'Completed', 'Failed', 'Canceled'.
            user_id: User ID or 'Server CLI'.
            summary: Textual summary of the analysis.
            project_name: Name of the analyzed project.
            preferences: JSON string of analysis options.
        """
        query = """
        CREATE (h:AnalysisHistory:System)
        SET h.job_id = $job_id,
            h.start_time = $start_time_str,
            h.end_time = $end_time_str,
            h.work_time = $duration,
            h.file_count = $file_count,
            h.result = $result,
            h.user_id = $user_id,
            h.summary = $summary,
            h.project_name = $project_name,
            h.preferences = $preferences,
            h.created_at = datetime()
        """
        
        # Format datetimes as required: YYYY/MM/DD HH:MM:SS
        start_time_str = start_time.strftime("%Y/%m/%d %H:%M:%S")
        end_time_str = end_time.strftime("%Y/%m/%d %H:%M:%S")
        
        params = {
            "job_id": job_id,
            "start_time_str": start_time_str,
            "end_time_str": end_time_str,
            "duration": duration,
            "file_count": file_count,
            "result": result,
            "user_id": user_id,
            "summary": summary,
            "project_name": project_name,
            "preferences": preferences,
        }
        
        try:
            with self._driver.session(database=self._database) as session:
                session.run(query, params)
        except Exception as e:
            # We don't want history logging to crash the application, just log error
            # Assuming self.logger is available or use print? 
            # Mixins usually don't have logger unless injected. 
            # I can rely on the caller to handle exception or just print.
            # But GraphDB base might have it? No.
            # I'll just let it raise or silence it?
            # Better to let it raise so the caller knows, BUT we are in a 'finally' block usually.
            # I'll print to stderr if it fails, or just re-raise.
            # Let's re-raise and let handlers.py handle it (it has broad except).
            raise e
