from datetime import datetime
from typing import Optional, List, Dict, Any

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
        preferences_ai: str = "{}",
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
            summary: Textual summary of the analysis.
            project_name: Name of the analyzed project.
            preferences: JSON string of static analysis options.
            preferences_ai: JSON string of AI analysis options.
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
            h.preferences_ai = $preferences_ai,
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
            "preferences_ai": preferences_ai,
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

    def get_analysis_history(self, limit: int = 100) -> List[Dict[str, Any]]:
        """
        Retrieve analysis history records.
        
        Args:
            limit: Maximum number of records to return.
            
        Returns:
            List of history records.
        """
        query = """
        MATCH (h:AnalysisHistory)
        OPTIONAL MATCH (u:User {id: h.user_id})
        RETURN h, elementId(h) as id, u.name as user_name, h.preferences_ai as preferences_ai
        ORDER BY h.created_at DESC
        LIMIT $limit
        """
        
        history_list = []
        with self._driver.session(database=self._database) as session:
            result = session.run(query, limit=limit)
            for record in result:
                node = record["h"]
                item = dict(node)
                item["id"] = record["id"]
                item["user_name"] = record["user_name"]
                item["preferences_ai"] = record["preferences_ai"] or "{}"
                
                # Aggressively convert non-primitive types to string to avoid serialization errors
                for key, value in item.items():
                    if not isinstance(value, (str, int, float, bool, list, dict, type(None))):
                        item[key] = str(value)
                        
                history_list.append(item)
                
        return history_list

    def delete_analysis_history(self, node_id: str) -> bool:
        """
        Delete an analysis history record by its ID.
        
        Args:
            node_id: The Neo4j elementId of the history node.
            
        Returns:
            True if deleted, False otherwise.
        """
        query = """
        MATCH (h:AnalysisHistory)
        WHERE elementId(h) = $node_id
        DETACH DELETE h
        """
        
        with self._driver.session(database=self._database) as session:
            result = session.run(query, node_id=node_id)
            consume_result = result.consume()
            return consume_result.counters.nodes_deleted > 0
