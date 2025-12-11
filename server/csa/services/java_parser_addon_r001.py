"""Backward-compatible exports for logical name extraction (Rule001)."""

from __future__ import annotations

from csa.parsers.java.logical_name import (
    JavaLogicalNameExtractor,
    LogicalNameExtractor,
    LogicalNameExtractorFactory,
    process_project_with_custom_rules,
    get_file_type,
    process_java_file_with_rule001,
    process_mybatis_xml_with_rule001,
    extract_java_class_logical_name,
    extract_java_method_logical_name,
    extract_java_field_logical_name,
    extract_mapper_logical_name_from_xml_content,
    extract_sql_logical_name_from_xml_content,
    extract_class_logical_name_from_annotations,
    extract_method_logical_name_from_annotations,
)

__all__ = [
    "JavaLogicalNameExtractor",
    "LogicalNameExtractor",
    "LogicalNameExtractorFactory",
    "process_project_with_custom_rules",
    "get_file_type",
    "process_java_file_with_rule001",
    "process_mybatis_xml_with_rule001",
    "extract_java_class_logical_name",
    "extract_java_method_logical_name",
    "extract_java_field_logical_name",
    "extract_mapper_logical_name_from_xml_content",
    "extract_sql_logical_name_from_xml_content",
    "extract_class_logical_name_from_annotations",
    "extract_method_logical_name_from_annotations",
]
