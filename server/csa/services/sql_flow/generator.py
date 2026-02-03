"""
SQL Flow JSON 생성기

SQL 파서 결과를 기반으로 정적 분석을 통해 SQL Flow JSON을 생성합니다.
"""
from __future__ import annotations

import re
from typing import Any, Dict, List, Optional, Tuple
from dataclasses import asdict

from csa.parsers.sql.parser import SQLAnalysisResult
from csa.utils.logger import get_logger

logger = get_logger(__name__)


class SQLFlowGenerator:
    """SQL 파서 결과를 SQL Flow JSON으로 변환하는 생성기"""

    @staticmethod
    def generate_flow_json(
        sql_analysis: SQLAnalysisResult,
        sql_content: str = "",
        sql_id: str = ""
    ) -> Dict[str, Any]:
        """
        SQL 파서 결과를 기반으로 SQL Flow JSON을 생성합니다.

        Args:
            sql_analysis: SQL 파서 분석 결과
            sql_content: 원본 SQL 내용 (선택사항)
            sql_id: SQL ID (선택사항)

        Returns:
            정규화된 SQL Flow JSON
        """
        if not sql_analysis:
            return {}

        try:
            nodes = []
            edges = []

            # 노드 ID 카운터
            operation_counter = {"count": 0}

            # 원본 SQL에서 코멘트 추출
            comment_map = SQLFlowGenerator._extract_comments_from_sql(sql_content)

            # 1. 입력 파라미터 노드 생성
            input_node_id = None
            if sql_analysis.parameters:
                input_node_id = "input_params"
                input_node = SQLFlowGenerator._create_input_params_node(sql_analysis.parameters, comment_map)
                nodes.append(input_node)

            # 2. 테이블 노드 생성
            table_node_ids = []
            for table_info in sql_analysis.tables:
                table_id = SQLFlowGenerator._create_table_id(table_info)
                table_node = SQLFlowGenerator._create_table_node(table_info, sql_analysis.columns, comment_map)
                nodes.append(table_node)
                table_node_ids.append(table_id)

            # Input Parameters -> 첫 번째 테이블 연결 (input_ref)
            if input_node_id and table_node_ids:
                edges.append({
                    "source": input_node_id,
                    "target": table_node_ids[0],
                    "type": "input_ref",
                    "label": ""
                })

            # 2-1. MERGE 문 특별 처리
            if sql_analysis.sql_type.upper() == "MERGE":
                prev_node_id = table_node_ids[0] if table_node_ids else None

                # ON 조건 노드
                if sql_analysis.where_conditions:
                    on_node_id = "merge_on_condition"
                    on_node = {
                        "id": on_node_id,
                        "type": "operation",
                        "label": "ON Condition",
                        "operationType": "MERGE_ON",
                        "condition": " ".join(sql_analysis.where_conditions)
                    }
                    nodes.append(on_node)

                    if prev_node_id:
                        edges.append({
                            "source": prev_node_id,
                            "target": on_node_id,
                            "type": "data_flow"
                        })
                    prev_node_id = on_node_id
                else:
                    prev_node_id = table_node_ids[0] if table_node_ids else None

                # WHEN MATCHED (UPDATE) 노드
                update_node_id = "merge_update"
                update_node = {
                    "id": update_node_id,
                    "type": "operation",
                    "label": "WHEN MATCHED",
                    "operationType": "MERGE_UPDATE",
                    "condition": "UPDATE"
                }
                nodes.append(update_node)

                if prev_node_id:
                    edges.append({
                        "source": prev_node_id,
                        "target": update_node_id,
                        "type": "data_flow",
                        "label": "MATCHED"
                    })

                # WHEN NOT MATCHED (INSERT) 노드
                insert_node_id = "merge_insert"
                insert_node = {
                    "id": insert_node_id,
                    "type": "operation",
                    "label": "WHEN NOT MATCHED",
                    "operationType": "MERGE_INSERT",
                    "condition": "INSERT"
                }
                nodes.append(insert_node)

                if prev_node_id:
                    edges.append({
                        "source": prev_node_id,
                        "target": insert_node_id,
                        "type": "data_flow",
                        "label": "NOT MATCHED"
                    })

                # 결과 노드들
                update_result_id = "result_update"
                update_result_columns = []
                for col in sql_analysis.columns:
                    col_name = col.get("name", "")
                    if col_name:
                        col_comment = comment_map.get(col_name, "")
                        update_result_columns.append({"name": col_name, "comment": col_comment})

                update_result_node = {
                    "id": update_result_id,
                    "type": "result",
                    "label": "UPDATE 완료",
                    "columns": update_result_columns
                }
                nodes.append(update_result_node)

                edges.append({
                    "source": update_node_id,
                    "target": update_result_id,
                    "type": "data_flow"
                })

                insert_result_id = "result_insert"
                insert_result_columns = []
                for col in sql_analysis.columns:
                    col_name = col.get("name", "")
                    if col_name:
                        col_comment = comment_map.get(col_name, "")
                        insert_result_columns.append({"name": col_name, "comment": col_comment})

                insert_result_node = {
                    "id": insert_result_id,
                    "type": "result",
                    "label": "INSERT 완료",
                    "columns": insert_result_columns
                }
                nodes.append(insert_result_node)

                edges.append({
                    "source": insert_node_id,
                    "target": insert_result_id,
                    "type": "data_flow"
                })

                # Summary 생성
                summary = SQLFlowGenerator._generate_summary(sql_analysis, sql_id)

                return {
                    "summary": summary,
                    "nodes": nodes,
                    "edges": edges
                }

            # 3. JOIN 노드 생성 (있는 경우)
            join_node_id = None
            if sql_analysis.joins:
                join_node_id = SQLFlowGenerator._create_operation_id("join", operation_counter)
                join_node = SQLFlowGenerator._create_join_node(sql_analysis.joins, join_node_id)
                nodes.append(join_node)

                # 테이블 -> JOIN 엣지
                for table_id in table_node_ids:
                    edges.append({
                        "source": table_id,
                        "target": join_node_id,
                        "type": "data_flow"
                    })

            # 4. 데이터 플로우 체인 구성 (WHERE -> GROUP BY -> HAVING -> ORDER BY -> LIMIT)
            prev_node_id = join_node_id if join_node_id else (table_node_ids[0] if table_node_ids else None)

            # WHERE 노드
            where_node_id = None
            if sql_analysis.where_conditions:
                where_node_id = SQLFlowGenerator._create_operation_id("where", operation_counter)
                where_node = SQLFlowGenerator._create_where_node(sql_analysis.where_conditions, where_node_id)
                nodes.append(where_node)

                # 입력 파라미터 -> WHERE (input_ref)
                if input_node_id and SQLFlowGenerator._has_parameters_in_condition(
                    sql_analysis.where_conditions, sql_analysis.parameters
                ):
                    edges.append({
                        "source": input_node_id,
                        "target": where_node_id,
                        "type": "input_ref"
                    })

                # 이전 노드 -> WHERE
                if prev_node_id:
                    edges.append({
                        "source": prev_node_id,
                        "target": where_node_id,
                        "type": "data_flow"
                    })
                # WHERE가 첫 노드이고 JOIN이 없을 때, 테이블에서 직접 연결
                elif table_node_ids:
                    for table_id in table_node_ids:
                        edges.append({
                            "source": table_id,
                            "target": where_node_id,
                            "type": "data_flow"
                        })

                prev_node_id = where_node_id

            # GROUP BY 노드
            group_node_id = None
            if sql_analysis.group_by_columns:
                group_node_id = SQLFlowGenerator._create_operation_id("group_by", operation_counter)
                group_node = SQLFlowGenerator._create_group_by_node(sql_analysis.group_by_columns, group_node_id)
                nodes.append(group_node)

                if prev_node_id:
                    edges.append({
                        "source": prev_node_id,
                        "target": group_node_id,
                        "type": "data_flow"
                    })
                prev_node_id = group_node_id

            # HAVING 노드
            having_node_id = None
            if sql_analysis.having_conditions:
                having_node_id = SQLFlowGenerator._create_operation_id("having", operation_counter)
                having_node = SQLFlowGenerator._create_having_node(sql_analysis.having_conditions, having_node_id)
                nodes.append(having_node)

                if prev_node_id:
                    edges.append({
                        "source": prev_node_id,
                        "target": having_node_id,
                        "type": "data_flow"
                    })
                prev_node_id = having_node_id

            # ORDER BY 노드
            order_node_id = None
            if sql_analysis.order_by_columns:
                order_node_id = SQLFlowGenerator._create_operation_id("order_by", operation_counter)
                order_node = SQLFlowGenerator._create_order_by_node(sql_analysis.order_by_columns, order_node_id)
                nodes.append(order_node)

                if prev_node_id:
                    edges.append({
                        "source": prev_node_id,
                        "target": order_node_id,
                        "type": "data_flow"
                    })
                prev_node_id = order_node_id

            # 5. 서브쿼리 노드 생성 (ORDER BY 후에 LIMIT이 있는 경우 또는 INSERT VALUES 서브쿼리)
            subquery_node_id = None

            # INSERT VALUES 절의 서브쿼리 처리
            if sql_analysis.sql_type.upper() == "INSERT" and sql_analysis.subqueries:
                # INSERT VALUES의 서브쿼리는 일반적으로 조회를 수행하므로
                # 원본 테이블에서 직접 데이터를 읽는 경우로 표현
                subquery_node_id = "subquery_1"
                subquery_columns = SQLFlowGenerator._extract_columns_from_subquery(sql_analysis.subqueries[0], comment_map)
                if not subquery_columns:
                    subquery_columns = []
                    for col in sql_analysis.columns:
                        col_name = col.get("name", "")
                        if col_name:
                            col_comment = comment_map.get(col_name, "")
                            subquery_columns.append({"name": col_name, "comment": col_comment})

                subquery_node = {
                    "id": subquery_node_id,
                    "type": "subquery",
                    "label": "Subquery (Values)",
                    "columns": subquery_columns
                }
                nodes.append(subquery_node)

                # 테이블에서 서브쿼리로 엣지
                if table_node_ids:
                    edges.append({
                        "source": table_node_ids[0],
                        "target": subquery_node_id,
                        "type": "data_flow"
                    })
                prev_node_id = subquery_node_id
            # ORDER BY와 LIMIT이 있는 SELECT의 서브쿼리
            elif sql_analysis.subqueries or (
                sql_analysis.order_by_columns and SQLFlowGenerator._has_limit_clause(sql_content)
            ):
                subquery_node_id = "subquery_1"
                subquery_node = SQLFlowGenerator._create_subquery_node(sql_analysis.columns, subquery_node_id, comment_map)
                nodes.append(subquery_node)

                if prev_node_id:
                    edges.append({
                        "source": prev_node_id,
                        "target": subquery_node_id,
                        "type": "data_flow"
                    })
                prev_node_id = subquery_node_id

            # LIMIT 노드 (ROWNUM, LIMIT, TOP 등)
            limit_node_id = None
            if SQLFlowGenerator._has_limit_clause(sql_content):
                limit_node_id = SQLFlowGenerator._create_operation_id("limit", operation_counter)
                limit_condition = SQLFlowGenerator._extract_limit_condition(sql_content)
                limit_node = SQLFlowGenerator._create_limit_node(limit_condition, limit_node_id)
                nodes.append(limit_node)

                if prev_node_id:
                    edges.append({
                        "source": prev_node_id,
                        "target": limit_node_id,
                        "type": "data_flow"
                    })
                prev_node_id = limit_node_id

            # 6. 결과 노드 생성
            result_node_id = "result"
            result_label = SQLFlowGenerator._generate_result_label(sql_analysis.sql_type, sql_content)
            result_node = SQLFlowGenerator._create_result_node(sql_analysis.columns, result_node_id, result_label, comment_map)
            nodes.append(result_node)

            # 최종 노드 -> 결과
            if prev_node_id:
                edge_label = sql_analysis.sql_type if sql_analysis.sql_type in ["UPDATE", "DELETE", "INSERT"] else "result"
                edges.append({
                    "source": prev_node_id,
                    "target": result_node_id,
                    "type": "data_flow",
                    "label": edge_label
                })
            # 연산 노드가 없는 단순 쿼리
            elif table_node_ids:
                for table_id in table_node_ids:
                    edges.append({
                        "source": table_id,
                        "target": result_node_id,
                        "type": "data_flow"
                    })

            # Summary 생성 (간단한 버전)
            summary = SQLFlowGenerator._generate_summary(sql_analysis, sql_id)

            return {
                "summary": summary,
                "nodes": nodes,
                "edges": edges
            }

        except Exception as e:
            logger.warning(f"Failed to generate SQL Flow JSON for {sql_id}: {e}")
            return {}

    # === 노드 생성 헬퍼 메서드 ===

    @staticmethod
    def _create_input_params_node(parameters: List[Dict[str, str]], comment_map: Dict[str, str]) -> Dict[str, Any]:
        """입력 파라미터 노드 생성"""
        columns = []
        for param in parameters:
            param_name = param.get("name", "")
            if param_name:
                param_key = f"#{{{param_name}}}"
                param_comment = comment_map.get(param_key, "")
                columns.append({"name": param_key, "comment": param_comment})
            elif param.get("type") == "positional":
                # Positional 파라미터
                count = param.get("count", 0)
                for i in range(int(count) if count else 1):
                    columns.append({"name": "?", "comment": ""})

        return {
            "id": "input_params",
            "type": "inputParams",
            "label": "Input Parameters",
            "columns": columns
        }

    @staticmethod
    def _create_table_node(table_info: Dict[str, str], all_columns: List[Dict[str, str]], comment_map: Dict[str, str]) -> Dict[str, Any]:
        """테이블 노드 생성"""
        table_name = table_info.get("name", "")
        table_id = SQLFlowGenerator._create_table_id(table_info)

        # 테이블 코멘트 추출
        table_comment = comment_map.get(f"TABLE:{table_name}", "")

        # 테이블의 컬럼 추출
        columns = []
        for col in all_columns:
            col_table = col.get("table", "")
            col_name = col.get("name", "")

            # 테이블 매칭 (이름 또는 alias)
            if col_table == table_name or col_table == table_info.get("alias", ""):
                if col_name and col_name != "*":
                    col_comment = comment_map.get(col_name, "")
                    columns.append({"name": col_name, "comment": col_comment})

        # 컬럼이 없으면 기본 표시
        if not columns:
            columns.append({"name": "*", "comment": ""})

        return {
            "id": table_id,
            "type": "table",
            "label": table_name,
            "comment": table_comment,
            "columns": columns
        }

    @staticmethod
    def _create_join_node(joins: List[Dict[str, str]], node_id: str) -> Dict[str, Any]:
        """JOIN 노드 생성"""
        # 첫 번째 JOIN 정보 사용 (다중 JOIN은 단순화)
        join_info = joins[0] if joins else {}
        join_type = join_info.get("type", "JOIN")
        condition = join_info.get("condition", "")

        return {
            "id": node_id,
            "type": "operation",
            "label": join_type,
            "operationType": "JOIN",
            "condition": condition
        }

    @staticmethod
    def _create_where_node(conditions: List[str], node_id: str) -> Dict[str, Any]:
        """WHERE 노드 생성"""
        condition = " ".join(conditions) if conditions else ""
        return {
            "id": node_id,
            "type": "operation",
            "label": "WHERE",
            "operationType": "WHERE",
            "condition": condition
        }

    @staticmethod
    def _create_group_by_node(columns: List[str], node_id: str) -> Dict[str, Any]:
        """GROUP BY 노드 생성"""
        condition = ", ".join(columns) if columns else ""
        return {
            "id": node_id,
            "type": "operation",
            "label": "GROUP BY",
            "operationType": "GROUP_BY",
            "condition": condition
        }

    @staticmethod
    def _create_having_node(conditions: List[str], node_id: str) -> Dict[str, Any]:
        """HAVING 노드 생성"""
        condition = " ".join(conditions) if conditions else ""
        return {
            "id": node_id,
            "type": "operation",
            "label": "HAVING",
            "operationType": "HAVING",
            "condition": condition
        }

    @staticmethod
    def _create_order_by_node(columns: List[str], node_id: str) -> Dict[str, Any]:
        """ORDER BY 노드 생성"""
        condition = ", ".join(columns) if columns else ""
        return {
            "id": node_id,
            "type": "operation",
            "label": "ORDER BY",
            "operationType": "ORDER_BY",
            "condition": condition
        }

    @staticmethod
    def _create_limit_node(condition: str, node_id: str) -> Dict[str, Any]:
        """LIMIT 노드 생성"""
        return {
            "id": node_id,
            "type": "operation",
            "label": "LIMIT",
            "operationType": "LIMIT",
            "condition": condition
        }

    @staticmethod
    def _create_subquery_node(columns: List[Dict[str, str]], node_id: str, comment_map: Dict[str, str] = None) -> Dict[str, Any]:
        """서브쿼리 노드 생성"""
        if comment_map is None:
            comment_map = {}

        node_columns = []
        for col in columns:
            col_name = col.get("name", "")
            if col_name and col_name != "*":
                col_comment = comment_map.get(col_name, "")
                node_columns.append({"name": col_name, "comment": col_comment})

        return {
            "id": node_id,
            "type": "subquery",
            "label": "Subquery #1",
            "columns": node_columns
        }

    @staticmethod
    def _create_result_node(columns: List[Dict[str, str]], node_id: str, label: str, comment_map: Dict[str, str]) -> Dict[str, Any]:
        """결과 노드 생성"""
        node_columns = []
        for col in columns:
            col_name = col.get("name", "")
            if col_name and col_name != "*":
                col_comment = comment_map.get(col_name, "")
                node_columns.append({"name": col_name, "comment": col_comment})

        return {
            "id": node_id,
            "type": "result",
            "label": label,
            "columns": node_columns
        }

    # === 유틸리티 메서드 ===

    @staticmethod
    def _create_table_id(table_info: Dict[str, str]) -> str:
        """테이블 ID 생성"""
        table_name = table_info.get("name", "")
        return f"table_{table_name}".replace(".", "_")

    @staticmethod
    def _create_operation_id(op_type: str, counter: Dict[str, int]) -> str:
        """Operation 노드 ID 생성"""
        counter["count"] += 1
        return f"{op_type}_op"

    @staticmethod
    def _has_limit_clause(sql_content: str) -> bool:
        """LIMIT 절 존재 여부 확인"""
        if not sql_content:
            return False

        sql_upper = sql_content.upper()
        return (
            "ROWNUM" in sql_upper or
            " LIMIT " in sql_upper or
            " TOP " in sql_upper or
            "FETCH FIRST" in sql_upper
        )

    @staticmethod
    def _extract_limit_condition(sql_content: str) -> str:
        """LIMIT 조건 추출"""
        if not sql_content:
            return ""

        sql_upper = sql_content.upper()

        # ROWNUM 패턴
        if "ROWNUM" in sql_upper:
            import re
            match = re.search(r"ROWNUM\s*<=?\s*(\d+)", sql_content, re.IGNORECASE)
            if match:
                return f"ROWNUM <= {match.group(1)}"

        # LIMIT 패턴
        if " LIMIT " in sql_upper:
            import re
            match = re.search(r"LIMIT\s+(\d+)", sql_content, re.IGNORECASE)
            if match:
                return f"LIMIT {match.group(1)}"

        # TOP 패턴
        if " TOP " in sql_upper:
            import re
            match = re.search(r"TOP\s+(\d+)", sql_content, re.IGNORECASE)
            if match:
                return f"TOP {match.group(1)}"

        return "LIMIT"

    @staticmethod
    def _has_parameters_in_condition(conditions: List[str], parameters: List[Dict[str, str]]) -> bool:
        """조건에 파라미터가 포함되어 있는지 확인"""
        if not conditions or not parameters:
            return False

        condition_str = " ".join(conditions)

        for param in parameters:
            param_name = param.get("name", "")
            if param_name and f"#{{{param_name}}}" in condition_str:
                return True
            if param.get("type") == "positional" and "?" in condition_str:
                return True

        return False

    @staticmethod
    def _generate_summary(sql_analysis: SQLAnalysisResult, sql_id: str) -> str:
        """간단한 Summary 생성"""
        sql_type = sql_analysis.sql_type
        table_count = len(sql_analysis.tables)
        table_names = ", ".join([t.get("name", "") for t in sql_analysis.tables[:2]])

        if table_count > 2:
            table_names += f" 외 {table_count - 2}개"

        if sql_type == "SELECT":
            return f"{table_names} 테이블에서 데이터 조회"
        elif sql_type == "INSERT":
            return f"{table_names} 테이블에 데이터 삽입"
        elif sql_type == "UPDATE":
            return f"{table_names} 테이블 데이터 업데이트"
        elif sql_type == "DELETE":
            return f"{table_names} 테이블 데이터 삭제"
        elif sql_type == "MERGE":
            return f"{table_names} 테이블 MERGE (UPDATE/INSERT)"
        else:
            return f"{sql_id} SQL 실행"

    @staticmethod
    def _generate_result_label(sql_type: str, sql_content: str) -> str:
        """결과 노드 라벨 생성"""
        if sql_type == "UPDATE":
            return "UPDATE 완료"
        elif sql_type == "DELETE":
            return "DELETE 완료"
        elif sql_type == "INSERT":
            return "INSERT 완료"
        else:
            # SELECT의 경우
            if SQLFlowGenerator._has_limit_clause(sql_content):
                return "Result (Top 1)"
            return "Result"

    @staticmethod
    def _extract_columns_from_subquery(subquery: str, comment_map: Dict[str, str] = None) -> List[Dict[str, str]]:
        """서브쿼리에서 SELECT 컬럼 추출"""
        if not subquery:
            return []

        if comment_map is None:
            comment_map = {}

        columns = []
        # SELECT ... FROM 패턴 추출
        select_match = None
        try:
            select_match = re.search(r"SELECT\s+(.*?)\s+FROM", subquery, re.IGNORECASE | re.DOTALL)
        except:
            return []

        if not select_match:
            return []

        column_section = select_match.group(1).strip()

        # 컬럼 항목 분리 (함수 호출 등을 고려)
        column_parts = []
        current = []
        paren_depth = 0

        for char in column_section:
            if char == '(':
                paren_depth += 1
                current.append(char)
            elif char == ')':
                paren_depth -= 1
                current.append(char)
            elif char == ',' and paren_depth == 0:
                part = "".join(current).strip()
                if part:
                    column_parts.append(part)
                current = []
            else:
                current.append(char)

        if current:
            part = "".join(current).strip()
            if part:
                column_parts.append(part)

        # 각 컬럼 처리
        for col_part in column_parts:
            if not col_part:
                continue
            # alias가 있는 경우 제거
            col_name = col_part.split()[-1] if ' ' in col_part else col_part
            if col_name:
                col_comment = comment_map.get(col_name, "")
                columns.append({"name": col_name, "comment": col_comment})

        return columns

    @staticmethod
    def _extract_comments_from_sql(sql_content: str) -> Dict[str, str]:
        """
        SQL 원본에서 인라인 코멘트를 추출하여 매핑합니다.

        패턴:
        - TABLE_NAME /* 테이블 코멘트 */ -> TABLE:TABLE_NAME
        - COLUMN_NAME /* 컬럼 코멘트 */ -> COLUMN_NAME
        - #{paramName} /* 파라미터 코멘트 */ -> #{paramName}

        Args:
            sql_content: 원본 SQL 문

        Returns:
            {식별자: 코멘트} 딕셔너리
        """
        comment_map = {}

        if not sql_content:
            return comment_map

        try:
            # 1. 테이블 코멘트 추출
            # 패턴: INSERT INTO TABLE_NAME /* 코멘트 */ 또는 FROM TABLE_NAME /* 코멘트 */
            table_patterns = [
                r'(?:INSERT\s+INTO|FROM|UPDATE|DELETE\s+FROM|MERGE\s+INTO)\s+(\w+)\s*/\*\s*([^*]+)\s*\*/',
                r'(?:JOIN)\s+(\w+)\s*/\*\s*([^*]+)\s*\*/'
            ]

            for pattern in table_patterns:
                matches = re.finditer(pattern, sql_content, re.IGNORECASE | re.MULTILINE)
                for match in matches:
                    table_name = match.group(1).strip()
                    comment = match.group(2).strip()
                    comment_map[f"TABLE:{table_name}"] = comment

            # 2. 컬럼 및 파라미터 코멘트 추출
            # 패턴: 식별자 /* 코멘트 */
            # 식별자는: 일반 컬럼명, #{paramName} 형태의 MyBatis 파라미터
            identifier_pattern = r'([\w.]+|#\{[\w.]+\})\s*/\*\s*([^*]+)\s*\*/'

            matches = re.finditer(identifier_pattern, sql_content, re.MULTILINE)
            for match in matches:
                identifier = match.group(1).strip()
                comment = match.group(2).strip()

                # 이미 처리된 테이블 코멘트는 건너뛰기
                if f"TABLE:{identifier}" in comment_map:
                    continue

                # 파라미터 형태 (#{name})인 경우 그대로 저장
                if identifier.startswith('#{'):
                    comment_map[identifier] = comment
                # 일반 컬럼명인 경우
                else:
                    # schema.table.column 또는 table.column 형태에서 컬럼명만 추출
                    col_parts = identifier.split('.')
                    col_name = col_parts[-1]  # 마지막 부분이 컬럼명
                    comment_map[col_name] = comment

            logger.debug(f"Extracted {len(comment_map)} comments from SQL")

        except Exception as e:
            logger.warning(f"Failed to extract comments from SQL: {e}")

        return comment_map


__all__ = ["SQLFlowGenerator"]
