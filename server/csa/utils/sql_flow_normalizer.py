"""
SQL Flow JSON 정규화 유틸리티

AI가 생성한 다양한 형식의 SQL Flow JSON을 정규화된 스키마로 변환합니다.

정규화된 스키마:
- 노드 타입: inputParams, table, subquery, operation, result
- 엣지 타입: input_ref, data_flow
- 엣지는 노드 ID 간 연결만 허용 (컬럼 레벨 연결 금지)
"""

import re
import json
from typing import Dict, List, Any, Optional
from csa.utils.logger import get_logger

logger = get_logger(__name__)


def extract_flow_json(ai_description: str) -> Optional[Dict[str, Any]]:
    """
    ai_description에서 SQL Flow JSON을 추출합니다.

    Args:
        ai_description: AI 분석 결과 (Markdown + JSON)

    Returns:
        추출된 JSON 딕셔너리 또는 None
    """
    if not ai_description:
        return None

    # ```json ... ``` 블록 추출
    json_match = re.search(r'```json\s*([\s\S]*?)\s*```', ai_description)
    if not json_match:
        return None

    try:
        raw_json = json.loads(json_match.group(1))
        # 기본 검증: nodes와 edges가 있어야 함
        if not isinstance(raw_json, dict):
            return None
        if 'nodes' not in raw_json or 'edges' not in raw_json:
            return None
        return raw_json
    except json.JSONDecodeError as e:
        logger.warning(f"Failed to parse SQL Flow JSON: {e}")
        return None


def normalize_sql_flow(raw_json: Dict[str, Any]) -> Dict[str, Any]:
    """
    AI 결과를 정규화된 형식으로 변환합니다.

    Args:
        raw_json: AI가 생성한 원본 JSON

    Returns:
        정규화된 JSON
    """
    if not raw_json:
        return raw_json

    normalized = {
        "summary": raw_json.get("summary", ""),
        "nodes": [],
        "edges": []
    }

    # 1. 노드 ID 맵 구축
    node_ids = set()
    for node in raw_json.get("nodes", []):
        node_id = node.get("id", "")
        if node_id:
            node_ids.add(node_id)

    # 2. 노드 정규화
    for node in raw_json.get("nodes", []):
        normalized_node = _normalize_node(node)
        if normalized_node:
            normalized["nodes"].append(normalized_node)

    # 3. 엣지에서 operation 노드 추출 및 생성
    operation_nodes, modified_edges, source_to_op_mapping = _extract_operation_nodes(
        raw_json.get("edges", []),
        node_ids
    )
    normalized["nodes"].extend(operation_nodes)

    # 4. 엣지 정규화
    node_ids.update(n["id"] for n in operation_nodes)
    for edge in modified_edges:
        normalized_edge = _normalize_edge(edge, node_ids, source_to_op_mapping)
        if normalized_edge:
            # 중복 엣지 방지
            edge_key = f"{normalized_edge['source']}->{normalized_edge['target']}"
            existing_keys = [f"{e['source']}->{e['target']}" for e in normalized["edges"]]
            if edge_key not in existing_keys:
                normalized["edges"].append(normalized_edge)

    return normalized


def _normalize_node(node: Dict[str, Any]) -> Optional[Dict[str, Any]]:
    """
    노드를 정규화합니다.
    """
    node_id = node.get("id", "")
    if not node_id:
        return None

    raw_type = node.get("type", "").lower()

    # 타입 매핑
    type_mapping = {
        "inputparams": "inputParams",
        "input_params": "inputParams",
        "input": "inputParams",
        "table": "table",
        "source": "table",  # source를 table로 매핑
        "subquery": "subquery",
        "operation": "operation",
        "result": "result",
        "target": "result",  # target을 result로 매핑
        "output": "result",
    }

    normalized_type = type_mapping.get(raw_type, "table")

    normalized = {
        "id": node_id,
        "type": normalized_type,
        "label": node.get("label", node_id),
    }

    # columns 정규화
    columns = node.get("columns", [])
    if columns:
        normalized["columns"] = _normalize_columns(columns)

    # operation 노드 전용 필드
    if normalized_type == "operation":
        if node.get("operationType"):
            normalized["operationType"] = node["operationType"]
        if node.get("condition"):
            normalized["condition"] = node["condition"]

    return normalized


def _normalize_columns(columns: List[Any]) -> List[Dict[str, str]]:
    """
    컬럼 목록을 정규화합니다.
    """
    normalized = []
    for col in columns:
        if isinstance(col, str):
            normalized.append({"name": col})
        elif isinstance(col, dict):
            normalized.append({
                "name": col.get("name", ""),
                "comment": col.get("comment", "")
            })
    return normalized


def _extract_operation_nodes(
    edges: List[Dict[str, Any]],
    existing_node_ids: set
) -> tuple:
    """
    엣지에서 operation 노드를 추출하고 생성합니다.

    기존 JSON에서 WHERE, ORDER BY 등이 엣지의 condition으로만 표현된 경우,
    이를 별도의 operation 노드로 변환합니다.

    Returns:
        (새로 생성된 operation 노드 목록, 수정된 엣지 목록, 소스→operation 매핑)
    """
    operation_nodes = []
    modified_edges = []
    created_ops = set()
    # 소스 테이블 → 첫 번째 operation 노드 매핑 (input_ref 리다이렉트용)
    source_to_op_mapping: Dict[str, str] = {}

    for edge in edges:
        edge_type = edge.get("type", "").lower()
        condition = edge.get("condition")
        source = edge.get("source", "")
        target = edge.get("target", "")

        # operation 타입 감지
        op_type = None
        op_label = None

        if edge_type in ("select", "filter") and condition:
            op_type = "WHERE"
            op_label = "WHERE"
        elif edge_type in ("order_by", "order"):
            op_type = "ORDER_BY"
            op_label = "ORDER BY"
        elif edge_type in ("limit", "rownum", "top"):
            op_type = "LIMIT"
            op_label = "LIMIT"
        elif edge_type in ("group_by", "group"):
            op_type = "GROUP_BY"
            op_label = "GROUP BY"
        elif edge_type in ("having",):
            op_type = "HAVING"
            op_label = "HAVING"
        elif edge_type in ("join", "inner_join", "left_join", "right_join"):
            op_type = "JOIN"
            op_label = edge_type.upper().replace("_", " ")

        if op_type and condition:
            # operation 노드 ID 생성
            source_base = _get_node_base_id(source)
            target_base = _get_node_base_id(target)
            op_node_id = f"{source_base}_{target_base}_{op_type.lower()}_op"

            # 중복 방지
            if op_node_id not in created_ops and op_node_id not in existing_node_ids:
                operation_nodes.append({
                    "id": op_node_id,
                    "type": "operation",
                    "label": op_label,
                    "operationType": op_type,
                    "condition": condition
                })
                created_ops.add(op_node_id)

                # 소스 테이블 → operation 노드 매핑 (첫 번째만 저장)
                # WHERE가 가장 먼저 적용되므로 input_ref는 여기로 연결
                if source_base not in source_to_op_mapping:
                    source_to_op_mapping[source_base] = op_node_id

            # 엣지 수정: source -> op_node -> target
            modified_edges.append({
                "source": source_base,
                "target": op_node_id,
                "type": "data_flow"
            })
            modified_edges.append({
                "source": op_node_id,
                "target": target_base,
                "type": "data_flow",
                "label": "result" if target_base == "result" else None
            })
        else:
            # 일반 엣지는 그대로 유지
            modified_edges.append(edge)

    return operation_nodes, modified_edges, source_to_op_mapping


def _get_node_base_id(node_ref: str) -> str:
    """
    노드 참조에서 기본 ID를 추출합니다.
    예: "table.column" -> "table"
    """
    if "." in node_ref:
        return node_ref.split(".")[0]
    return node_ref


def _normalize_edge(
    edge: Dict[str, Any],
    valid_node_ids: set,
    source_to_op_mapping: Optional[Dict[str, str]] = None
) -> Optional[Dict[str, Any]]:
    """
    엣지를 정규화합니다.

    input_ref 타입 엣지의 경우, 타겟이 소스 테이블이고 해당 테이블에
    연결된 operation 노드가 있으면 operation 노드로 리다이렉트합니다.
    (Y자 형태 연결: Input Parameters → WHERE/필터 노드)
    """
    source = edge.get("source", "")
    target = edge.get("target", "")
    edge_type = edge.get("type", "").lower()

    # 컬럼 레벨 연결 → 노드 레벨로 변환
    source = _get_node_base_id(source)
    target = _get_node_base_id(target)

    # 엣지 타입 정규화 (먼저 결정)
    if edge_type in ("reference", "filter_condition", "input_ref"):
        normalized_type = "input_ref"
    else:
        normalized_type = "data_flow"

    # input_ref 엣지: 타겟을 operation 노드로 리다이렉트
    # (Input Parameters → 소스 테이블 대신 → WHERE/필터 노드로 연결)
    if normalized_type == "input_ref" and source_to_op_mapping:
        if target in source_to_op_mapping:
            target = source_to_op_mapping[target]

    # 유효하지 않은 노드 ID는 건너뜀
    if source not in valid_node_ids or target not in valid_node_ids:
        # 노드가 없으면 건너뜀 (컬럼 매핑 엣지일 가능성)
        return None

    # select 타입 + condition 없음 = 단순 컬럼 매핑 → 제외
    if edge_type == "select" and not edge.get("condition"):
        return None

    normalized = {
        "source": source,
        "target": target,
        "type": normalized_type
    }

    # 라벨 유지
    if edge.get("label"):
        normalized["label"] = edge["label"]

    return normalized


def normalize_and_extract(ai_description: str) -> Optional[Dict[str, Any]]:
    """
    ai_description에서 SQL Flow JSON을 추출하고 정규화합니다.

    Args:
        ai_description: AI 분석 결과

    Returns:
        정규화된 SQL Flow JSON 또는 None
    """
    raw_json = extract_flow_json(ai_description)
    if not raw_json:
        return None

    try:
        return normalize_sql_flow(raw_json)
    except Exception as e:
        logger.warning(f"Failed to normalize SQL Flow JSON: {e}")
        return raw_json  # 실패 시 원본 반환
