from __future__ import annotations

import json
from typing import Any, Dict, List, Optional
from datetime import datetime

from csa.models.graph_entities import Class

def _get_current_timestamp() -> str:
    """Returns basic ISO formatted timestamp."""
    return datetime.now().isoformat()

def _normalise_annotation_params(raw: Any) -> dict[str, Any]:
    """어노테이션 파라미터를 안전한 dict 형태로 정규화한다."""
    if raw is None:
        return {}
    if isinstance(raw, dict):
        return raw
    if isinstance(raw, (list, tuple, set)):
        normalised: dict[str, Any] = {}
        for idx, item in enumerate(raw):
            if isinstance(item, (list, tuple)) and len(item) == 2:
                key, value = item
                normalised[str(key)] = value
            else:
                normalised[str(idx)] = item
        return normalised
    return {"value": raw}

def build_class_base_record(class_node: Class, package_name: str, project_name: str, timestamp: str) -> dict[str, Any]:
    """Builds the dictionary record for the Class node itself."""
    return {
        "name": class_node.name,
        "file_path": class_node.file_path,
        "type": class_node.type,
        "sub_type": class_node.sub_type or "",
        "source": class_node.source,
        "logical_name": class_node.logical_name,
        "superclass": class_node.superclass,
        "interfaces": class_node.interfaces,
        "imports": class_node.imports,
        "package_name": package_name,
        "project_name": project_name,
        "description": class_node.description or "",
        "ai_description": class_node.ai_description or "",
        "updated_at": timestamp,
        "PLOC": int(class_node.PLOC or 0),
        "LLOC": int(class_node.LLOC or 0),
        "CLOC": int(class_node.CLOC or 0),
        "code_complexity": int(class_node.code_complexity or 0),
    }

def build_method_records(
    class_node: Class, package_name: str, project_name: str, timestamp: str
) -> tuple[
    List[Dict[str, Any]],
    List[Dict[str, str]],
    List[Dict[str, str]],
    List[Dict[str, Any]],
    List[Dict[str, Any]],
    List[Dict[str, Any]]
]:
    """
    Builds records for methods and their related entities.
    Returns:
        (method_records, method_annotation_records, throws_records, parameter_records, return_records, statement_records)
    """
    method_records = []
    method_annotation_records = []
    throws_records = []
    parameter_records = []
    return_records = []
    statement_records = []

    for method in class_node.methods:
        method_annotations = getattr(method, "annotations", [])
        serialized_annotations = []
        for annotation in method_annotations:
            annotation_name = getattr(annotation, "name", str(annotation))
            raw_params = getattr(annotation, "parameters", {})
            params_dict = _normalise_annotation_params(raw_params)
            serialized_annotations.append({"name": annotation_name, "parameters": params_dict})

        visibility = getattr(method, "visibility", None)
        if not visibility:
            visibility = next(
                (
                    modifier
                    for modifier in getattr(method, "modifiers", [])
                    if modifier in {"public", "protected", "private"}
                ),
                "package",
            )

        method_parameters = getattr(method, "parameters", [])
        serialized_parameters = []
        for index, param in enumerate(method_parameters, start=1):
            if isinstance(param, dict):
                param_name = param.get("name") or f"param_{index}"
                param_type = param.get("type", "")
                param_description = param.get("description", "")
                param_ai_description = param.get("ai_description", "")
                param_package_name = param.get("package_name", package_name)
                annotation_source = param.get("annotations", [])
            else:
                param_name = getattr(param, "name", None) or f"param_{index}"
                param_type = getattr(param, "type", "")
                param_description = getattr(param, "description", "")
                param_ai_description = getattr(param, "ai_description", "")
                param_package_name = getattr(param, "package_name", package_name)
                annotation_source = getattr(param, "annotations", [])

            normalized_param_annotations = []
            for ann in annotation_source or []:
                if isinstance(ann, dict):
                    ann_name = ann.get("name", str(ann))
                    params_raw = ann.get("parameters", {})
                else:
                    ann_name = getattr(ann, "name", str(ann))
                    params_raw = getattr(ann, "parameters", {})
                params_normalized = _normalise_annotation_params(params_raw)
                normalized_param_annotations.append({"name": ann_name, "parameters": params_normalized})

            param_serialized = {
                "name": param_name,
                "type": param_type or "",
                "order": index,
                "description": param_description or "",
                "ai_description": param_ai_description or "",
                "package_name": param_package_name or package_name,
            }
            if normalized_param_annotations:
                param_serialized["annotations"] = normalized_param_annotations

            serialized_parameters.append(param_serialized)

        try:
            parameters_json = json.dumps(serialized_parameters)
            annotations_json = json.dumps(serialized_annotations)
        except (TypeError, ValueError):
            # Fallback for serialization errors, though rarely expected with pydantic models
            parameters_json = "[]"
            annotations_json = "[]"
            
        method_records.append(
            {
                "class_name": class_node.name,
                "method_name": method.name,
                "package_name": package_name,
                "project_name": project_name,
                "return_type": getattr(method, "return_type", "") or "",
                "parameters_json": parameters_json,
                "annotations_json": annotations_json,
                "visibility": visibility,
                "description": getattr(method, "description", "") or "",
                "ai_description": getattr(method, "ai_description", "") or "",
                "logical_name": getattr(method, "logical_name", "") or "",
                "source": getattr(method, "source", "") or "",
                "PLOC": getattr(method, "PLOC", 0),
                "LLOC": getattr(method, "LLOC", 0),
                "CLOC": getattr(method, "CLOC", 0),
                "cognitive_complexity": getattr(method, "cognitive_complexity", 0),
                "updated_at": timestamp,
            }
        )

        for annotation in method_annotations:
            annotation_name = getattr(annotation, "name", str(annotation))
            method_annotation_records.append(
                {
                    "method_name": method.name,
                    "class_name": class_node.name,
                    "annotation_name": annotation_name,
                }
            )
        for exception in getattr(method, "throws", []):
            throws_records.append(
                {
                    "method_name": method.name,
                    "class_name": class_node.name,
                    "exception": exception,
                }
            )
        for param_info in serialized_parameters:
            parameter_records.append(
                {
                    "method_name": method.name,
                    "class_name": class_node.name,
                    "param_name": param_info["name"],
                    "param_type": param_info.get("type", ""),
                    "param_description": param_info.get("description", ""),
                    "param_ai_description": param_info.get("ai_description", ""),
                    "package_name": param_info.get("package_name", package_name),
                    "project_name": project_name,
                    "updated_at": timestamp,
                }
            )
        if getattr(method, "return_type", None):
            return_records.append(
                {
                    "method_name": method.name,
                    "class_name": class_node.name,
                    "return_type": method.return_type,
                    "return_description": getattr(method, "return_description", "") or "",
                    "return_ai_description": getattr(method, "return_ai_description", "") or "",
                    "package_name": package_name,
                    "project_name": project_name,
                    "updated_at": timestamp,
                }
            )
        for statement in getattr(method, "statements", []):
            statement_records.append(
                {
                    "method_name": method.name,
                    "class_name": class_node.name,
                    "statement_index": getattr(statement, "index", 0),
                    "statement_type": getattr(statement, "type", ""),
                    "statement_content": getattr(statement, "content", ""),
                    "updated_at": timestamp,
                }
            )
            
    return method_records, method_annotation_records, throws_records, parameter_records, return_records, statement_records

def build_field_records(class_node: Class, project_name: str, timestamp: str) -> List[Dict[str, Any]]:
    """Builds records for class fields."""
    field_records = []
    for prop in class_node.properties:
        prop_modifiers_json = json.dumps(prop.modifiers) if prop.modifiers else json.dumps([])
        prop_annotations_json = json.dumps(
            [
                {
                    "name": a.name,
                    "parameters": _normalise_annotation_params(getattr(a, "parameters", {})),
                }
                for a in prop.annotations
            ]
        )
        field_records.append(
            {
                "class_name": class_node.name,
                "prop_name": prop.name,
                "prop_type": prop.type,
                "prop_logical_name": prop.logical_name or "",
                "prop_modifiers_json": prop_modifiers_json,
                "prop_annotations_json": prop_annotations_json,
                "prop_initial_value": prop.initial_value or "",
                "package_name": prop.package_name,
                "project_name": project_name,
                "prop_description": prop.description or "",
                "prop_ai_description": prop.ai_description or "",
                "updated_at": timestamp,
            }
        )
    return field_records
