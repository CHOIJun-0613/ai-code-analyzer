import logging
import datetime
from typing import List, Optional, Dict
from neo4j import Session

from csa.models.entities.analysis_rule import AnalysisRule
from csa.dbwork.connection_pool import get_connection_pool

logger = logging.getLogger(__name__)

class AnalysisRuleService:
    """
    분석 규칙(AnalysisRule) 관리 서비스
    Neo4j DB를 통해 규칙을 저장, 조회, 수정, 삭제한다.
    """
    
    _instance = None
    
    @classmethod
    def get_instance(cls):
        if cls._instance is None:
            cls._instance = AnalysisRuleService()
        return cls._instance
    
    def get_all_rules(self, active_only: bool = False) -> List[AnalysisRule]:
        """
        모든 규칙 목록을 조회한다.
        :param active_only: True일 경우 active(useYn=True)인 규칙만 조회
        """
        pool = get_connection_pool()
        rules = []
        with pool.session() as session:
            query = """
                MATCH (r:AnalysisRule)
                WHERE ($active_only = false OR r.useYn = true)
                RETURN id(r) as id, r.name as name, r.description as description, 
                       r.content as content, r.useYn as useYn, r.order as order,
                       r.updatedAt as updatedAt, r.updatedBy as updatedBy,
                       'System' IN labels(r) as isSystem
                ORDER BY r.order ASC, r.name ASC
            """
            result = session.run(query, active_only=active_only)
            for record in result:
                rules.append(self._map_record_to_entity(record))
        return rules

    def get_rule_by_id(self, rule_id: int) -> Optional[AnalysisRule]:
        """ID로 규칙 상세 조회"""
        pool = get_connection_pool()
        with pool.session() as session:
            result = session.run("""
                MATCH (r:AnalysisRule)
                WHERE id(r) = $rule_id
                RETURN id(r) as id, r.name as name, r.description as description, 
                       r.content as content, r.useYn as useYn, r.order as order,
                       r.updatedAt as updatedAt, r.updatedBy as updatedBy,
                       'System' IN labels(r) as isSystem
            """, rule_id=rule_id)
            record = result.single()
            if record:
                return self._map_record_to_entity(record)
        return None

    def create_rule(self, name: str, description: str, content: str, useYn: bool, order: int, user_id: str = "admin") -> AnalysisRule:
        """규칙 생성"""
        pool = get_connection_pool()
        with pool.session() as session:
            now = datetime.datetime.now().isoformat()
            result = session.run("""
                CREATE (r:AnalysisRule {
                    name: $name,
                    description: $description,
                    content: $content,
                    useYn: $useYn,
                    order: $order,
                    updatedAt: $now,
                    updatedBy: $user_id
                })
                RETURN id(r) as id, r.name as name, r.description as description, 
                       r.content as content, r.useYn as useYn, r.order as order,
                       r.updatedAt as updatedAt, r.updatedBy as updatedBy,
                       'System' IN labels(r) as isSystem
            """, name=name, description=description, content=content, useYn=useYn, order=order, now=now, user_id=user_id)
            record = result.single()
            logger.info(f"Analysis Rule created: {name} (ID: {record['id']})")
            return self._map_record_to_entity(record)

    def update_rule(self, rule_id: int, name: str, description: str, content: str, useYn: bool, order: int, user_id: str = "admin") -> Optional[AnalysisRule]:
        """규칙 수정"""
        pool = get_connection_pool()
        with pool.session() as session:
            updated_at = datetime.datetime.now().isoformat()
            result = session.run("""
                MATCH (r:AnalysisRule)
                WHERE id(r) = $rule_id
                SET r.name = $name,
                    r.description = $description,
                    r.content = $content,
                    r.useYn = $useYn,
                    r.order = $order,
                    r.updatedAt = $updated_at,
                    r.updatedBy = $user_id
                RETURN id(r) as id, r.name as name, r.description as description, 
                       r.content as content, r.useYn as useYn, r.order as order,
                       r.updatedAt as updatedAt, r.updatedBy as updatedBy,
                       'System' IN labels(r) as isSystem
            """, rule_id=rule_id, name=name, description=description, content=content, useYn=useYn, order=order, updated_at=updated_at, user_id=user_id)
            record = result.single()
            if record:
                logger.info(f"Analysis Rule updated: {name} (ID: {rule_id})")
                return self._map_record_to_entity(record)
        return None

    def delete_rule(self, rule_id: int) -> bool:
        """규칙 삭제"""
        pool = get_connection_pool()
        with pool.session() as session:
            # 시스템 규칙인지 확인이 필요할 수 있음
            result = session.run("""
                MATCH (r:AnalysisRule)
                WHERE id(r) = $rule_id
                DELETE r
                RETURN count(r) as deleted_count
            """, rule_id=rule_id)
            record = result.single()
            return record["deleted_count"] > 0

    def update_rule_orders(self, order_map: List[Dict[str, int]]) -> bool:
        """
        여러 규칙의 순서를 일괄 업데이트한다.
        :param order_map: [{"id": 1, "order": 0}, {"id": 2, "order": 1}, ...]
        """
        pool = get_connection_pool()
        with pool.session() as session:
            try:
                # UNWIND를 사용하여 일괄 업데이트
                session.run("""
                    UNWIND $order_map as item
                    MATCH (r:AnalysisRule)
                    WHERE id(r) = item.id
                    SET r.order = item.order
                """, order_map=order_map)
                logger.info("Analysis Rule orders updated.")
                return True
            except Exception as e:
                logger.error(f"Failed to update rule orders: {e}")
                return False

    def import_rules(self, rules: List[Dict], user_id: str = "admin") -> Dict[str, int]:
        """
        Import Analysis Rules from a list of dictionaries.
        Same name rules (active) will be deactivated (Soft Delete).
        New rules will be created as active.
        """
        pool = get_connection_pool()
        summary = {"success": 0, "deactivated": 0, "failed": 0}

        with pool.session() as session:
            for rule in rules:
                rule_name = rule.get("name")
                if not rule_name:
                    continue

                try:
                    with session.begin_transaction() as tx:
                        # 1. Deactivate existing active rule with same name
                        deactivate_query = """
                        MATCH (r:AnalysisRule {name: $name})
                        WHERE r.useYn = true
                        SET r.useYn = false, r.updatedBy = 'system_import_disabled'
                        RETURN count(r) as count
                        """
                        result = tx.run(deactivate_query, name=rule_name)
                        deactivated = result.single()["count"]
                        summary["deactivated"] += deactivated

                        # 2. Create new rule
                        create_query = "CREATE (r:AnalysisRule"
                        if rule.get("isSystem"):
                            create_query += ":System"
                        
                        create_query += """ {
                            name: $name,
                            description: $description,
                            content: $content,
                            useYn: true,
                            order: $order,
                            updatedAt: $updatedAt,
                            updatedBy: $updatedBy
                        })
                        """
                        
                        tx.run(create_query,
                            name=rule_name,
                            description=rule.get("description", ""),
                            content=rule.get("content", ""),
                            order=rule.get("order", 0),
                            updatedAt=datetime.datetime.now().isoformat(),
                            updatedBy=user_id
                        )
                        tx.commit()
                        summary["success"] += 1
                        logger.info(f"Imported rule: {rule_name}")

                except Exception as e:
                    logger.error(f"Failed to import rule {rule_name}: {e}")
                    summary["failed"] += 1
        
        return summary

    def _map_record_to_entity(self, record):
        return AnalysisRule(
            id=record["id"],
            name=record["name"],
            description=record["description"] or "",
            content=record["content"] or "",
            useYn=record["useYn"],
            order=record["order"] if record["order"] is not None else 0,
            updatedAt=record["updatedAt"] or "",
            updatedBy=record["updatedBy"] or "",
            isSystem=record["isSystem"]
        )

# Global Instance
analysis_rule_service = AnalysisRuleService.get_instance()
