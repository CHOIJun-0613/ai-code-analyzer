from __future__ import annotations

from typing import Any, Optional

from csa.models.graph_entities import Class
from csa.services.graph_db.base import GraphDBBase
from csa.utils.logger import get_logger
from csa.utils.class_helpers import (
    is_external_library,
    extract_package_from_full_name,
    is_inner_class,
    extract_outer_class_name,
)
from csa.services.graph_db import converters


class ClassMixin:
    """Manage class nodes and their relationships."""

    def add_class(
        self,
        class_node: Class,
        package_name: Optional[str] = None,
        project_name: Optional[str] = None,
    ) -> None:
        """Add a class node and all dependent relationships."""
        package_name = package_name or getattr(class_node, "package_name", None) or getattr(class_node, "package", "")
        project_name = project_name or getattr(class_node, "project_name", None) or getattr(class_node, "project", "")
        self.logger.debug(f"Adding class: {class_node.name}, package_name: {package_name}, project: {project_name}")
        try:
            self.add_classes_batch([(class_node, package_name, project_name)])
            self.logger.debug(f"Successfully added class: {class_node.name}")
        except Exception as exc:
            self.logger.error(f"Error adding class {class_node.name}: {exc}")
            raise

    def add_classes_batch(
        self,
        classes_data: list[tuple[Class, str, str]],
    ) -> None:
        """
        여러 클래스를 배치로 한 번에 저장 (성능 최적화)

        Args:
            classes_data: [(class_node, package_name, project_name), ...] 튜플 리스트
        """
        if not classes_data:
            return

        self.logger.debug(f"Adding {len(classes_data)} classes in batch...")
        try:
            self._execute_write(self._create_classes_batch_tx, classes_data)
            self.logger.debug(f"Successfully added {len(classes_data)} classes in batch")
        except Exception as exc:
            self.logger.error(f"Error adding classes batch: {exc}")
            raise

    @staticmethod
    def _create_classes_batch_tx(tx, classes_data: list[tuple[Class, str, str]]) -> None:
        """
        여러 클래스를 배치로 생성하는 트랜잭션

        Args:
            tx: Neo4j 트랜잭션
            classes_data: [(class_node, package_name, project_name), ...] 튜플 리스트
        """
        logger = get_logger(__name__)
        current_timestamp = GraphDBBase._get_current_timestamp()



        # 1. 클래스 노드 배치 생성
        class_records = []
        for class_node, package_name, project_name in classes_data:
            class_records.append(
                converters.build_class_base_record(class_node, package_name, project_name, current_timestamp)
            )

        if class_records:
            tx.run(
                """
                UNWIND $classes AS c
                MERGE (cls:Class {name: c.name, package_name: c.package_name})
                SET cls:Analysis, cls.file_path = c.file_path,
                    cls.file_extension = c.file_extension,
                    cls.type = c.type,
                    cls.sub_type = c.sub_type,
                    cls.source = c.source,
                    cls.logical_name = c.logical_name,
                    cls.superclass = c.superclass,
                    cls.interfaces = c.interfaces,
                    cls.imports = c.imports,
                    cls.package_name = c.package_name,
                    cls.project_name = c.project_name,
                    cls.description = c.description,
                    cls.ai_description = c.ai_description,
                    cls.updated_at = c.updated_at,
                    cls.PLOC = c.PLOC,
                    cls.LLOC = c.LLOC,
                    cls.CLOC = c.CLOC,
                    cls.code_complexity = c.code_complexity
                """,
                classes=class_records
            )

        # 2. Package-Class 관계 배치 생성
        package_class_records = []
        for class_node, package_name, project_name in classes_data:
            if package_name:
                package_class_records.append({
                    'package_name': package_name,
                    'class_name': class_node.name,
                })

        if package_class_records:
            tx.run(
                """
                UNWIND $relations AS r
                MATCH (p:Package {name: r.package_name})
                MATCH (c:Class {name: r.class_name, package_name: r.package_name})
                MERGE (p)-[:CONTAINS]->(c)
                """,
                relations=package_class_records
            )

        # 3. Project-Class 관계 배치 생성
        project_class_records = []
        for class_node, package_name, project_name in classes_data:
            project_class_records.append({
                'project_name': project_name,
                'class_name': class_node.name,
                'package_name': package_name,
            })

        if project_class_records:
            tx.run(
                """
                UNWIND $relations AS r
                MATCH (proj:Project {name: r.project_name})
                MATCH (c:Class {name: r.class_name, package_name: r.package_name})
                MERGE (proj)-[:CONTAINS]->(c)
                """,
                relations=project_class_records
            )

        # 4. Import 관계 배치 생성
        import_records_external = []
        import_records_internal = []
        for class_node, package_name, project_name in classes_data:
            for import_class in class_node.imports:
                if is_external_library(import_class):
                    import_records_external.append({
                        'import_class': import_class,
                        'class_name': class_node.name,
                        'package_name': package_name,
                    })
                else:
                    simple_name, import_package = extract_package_from_full_name(import_class)
                    import_records_internal.append({
                        'import_name': simple_name,
                        'import_package': import_package or "",
                        'class_name': class_node.name,
                        'package_name': package_name,
                    })

        if import_records_external:
            tx.run(
                """
                UNWIND $imports AS imp
                MERGE (imported:Class {name: imp.import_class, package_name: ''})
                SET imported:Analysis, imported.is_external = true
                WITH imp, imported
                MATCH (c:Class {name: imp.class_name, package_name: imp.package_name})
                MERGE (c)-[:IMPORTS]->(imported)
                """,
                imports=import_records_external
            )

        if import_records_internal:
            tx.run(
                """
                UNWIND $imports AS imp
                MERGE (imported:Class {name: imp.import_name, package_name: imp.import_package})
                SET imported:Analysis, imported.is_external = false
                WITH imp, imported
                MATCH (c:Class {name: imp.class_name, package_name: imp.package_name})
                MERGE (c)-[:IMPORTS]->(imported)
                """,
                imports=import_records_internal
            )

        # 5. Annotation 관계 배치 생성
        annotation_records = []
        for class_node, package_name, project_name in classes_data:
            for annotation in class_node.annotations:
                annotation_name = getattr(annotation, "name", str(annotation))
                annotation_records.append({
                    'class_name': class_node.name,
                    'annotation_name': annotation_name,
                })

        if annotation_records:
            tx.run(
                """
                UNWIND $annotations AS ann
                MATCH (c:Class {name: ann.class_name})
                MERGE (a:Annotation {name: ann.annotation_name})
                SET a:Analysis
                MERGE (c)-[:ANNOTATED_WITH]->(a)
                """,
                annotations=annotation_records
            )

        # 6. Superclass 관계 배치 생성
        superclass_records_external = []
        superclass_records_internal = []
        for class_node, package_name, project_name in classes_data:
            if class_node.superclass:
                if is_external_library(class_node.superclass):
                    superclass_records_external.append({
                        'superclass': class_node.superclass,
                        'class_name': class_node.name,
                        'package_name': package_name,
                    })
                else:
                    simple_name, super_package = extract_package_from_full_name(class_node.superclass)
                    superclass_records_internal.append({
                        'superclass': simple_name,
                        'super_package': super_package or "",
                        'class_name': class_node.name,
                        'package_name': package_name,
                    })

        if superclass_records_external:
            tx.run(
                """
                UNWIND $supers AS sup
                MERGE (super:Class {name: sup.superclass, package_name: ''})
                SET super:Analysis, super.is_external = true
                WITH sup, super
                MATCH (c:Class {name: sup.class_name, package_name: sup.package_name})
                MERGE (c)-[:EXTENDS]->(super)
                """,
                supers=superclass_records_external
            )

        if superclass_records_internal:
            tx.run(
                """
                UNWIND $supers AS sup
                MERGE (super:Class {name: sup.superclass, package_name: sup.super_package})
                SET super:Analysis, super.is_external = false
                WITH sup, super
                MATCH (c:Class {name: sup.class_name, package_name: sup.package_name})
                MERGE (c)-[:EXTENDS]->(super)
                """,
                supers=superclass_records_internal
            )

        # 7. Interface 관계 배치 생성
        interface_records = []
        for class_node, package_name, project_name in classes_data:
            for interface in class_node.interfaces:
                interface_records.append({
                    'interface': interface,
                    'class_name': class_node.name,
                })

        if interface_records:
            tx.run(
                """
                UNWIND $interfaces AS iface
                MERGE (i:Interface {name: iface.interface})
                SET i:Analysis
                WITH iface, i
                MATCH (c:Class {name: iface.class_name})
                MERGE (c)-[:IMPLEMENTS]->(i)
                """,
                interfaces=interface_records
            )

        # 8. Method 및 관련 엔티티 배치 생성
        all_method_records = []
        all_method_annotation_records = []
        all_throws_records = []
        all_parameter_records = []
        all_return_records = []
        all_statement_records = []

        for class_node, package_name, project_name in classes_data:
            (
                mr,
                mar,
                tr,
                pr,
                rr,
                sr,
            ) = converters.build_method_records(class_node, package_name, project_name, current_timestamp)
            all_method_records.extend(mr)
            all_method_annotation_records.extend(mar)
            all_throws_records.extend(tr)
            all_parameter_records.extend(pr)
            all_return_records.extend(rr)
            all_statement_records.extend(sr)

        if all_method_records:
            tx.run(
                """
                UNWIND $methods AS m
                MATCH (c:Class {name: m.class_name, package_name: m.package_name})
                MERGE (meth:Method {name: m.method_name, class_name: m.class_name})
                SET meth:Analysis, meth.return_type = m.return_type,
                    meth.parameters = m.parameters_json,
                    meth.annotations = m.annotations_json,
                    meth.visibility = m.visibility,
                    meth.description = m.description,
                    meth.ai_description = m.ai_description,
                    meth.logical_name = m.logical_name,
                    meth.source = m.source,
                    meth.package_name = m.package_name,
                    meth.project_name = m.project_name,
                    meth.PLOC = m.PLOC,
                    meth.LLOC = m.LLOC,
                    meth.CLOC = m.CLOC,
                    meth.cognitive_complexity = m.cognitive_complexity,
                    meth.updated_at = m.updated_at
                MERGE (c)-[:HAS_METHOD]->(meth)
                """,
                methods=all_method_records,
            )

        if all_method_annotation_records:
            tx.run(
                """
                UNWIND $items AS item
                MATCH (m:Method {name: item.method_name, class_name: item.class_name})
                MERGE (a:Annotation {name: item.annotation_name})
                SET a:Analysis
                MERGE (m)-[:ANNOTATED_WITH]->(a)
                """,
                items=all_method_annotation_records,
            )

        if all_throws_records:
            tx.run(
                """
                UNWIND $throws AS t
                MATCH (m:Method {name: t.method_name, class_name: t.class_name})
                MERGE (e:Exception {name: t.exception})
                SET e:Analysis
                MERGE (m)-[:THROWS]->(e)
                """,
                throws=all_throws_records,
            )

        if all_parameter_records:
            tx.run(
                """
                UNWIND $params AS p
                MATCH (m:Method {name: p.method_name, class_name: p.class_name})
                MERGE (par:Parameter {name: p.param_name, method_name: p.method_name, class_name: p.class_name})
                SET par:Analysis, par.type = p.param_type,
                    par.description = p.param_description,
                    par.ai_description = p.param_ai_description,
                    par.package_name = p.package_name,
                    par.project_name = p.project_name,
                    par.updated_at = p.updated_at
                MERGE (m)-[:HAS_PARAMETER]->(par)
                """,
                params=all_parameter_records,
            )

        if all_return_records:
            tx.run(
                """
                UNWIND $returns AS r
                MATCH (m:Method {name: r.method_name, class_name: r.class_name})
                MERGE (ret:ReturnType {name: r.return_type, method_name: r.method_name, class_name: r.class_name})
                SET ret:Analysis, ret.description = r.return_description,
                ret.ai_description = r.return_ai_description,
                ret.package_name = r.package_name,
                ret.project_name = r.project_name,
                ret.updated_at = r.updated_at
                MERGE (m)-[:RETURNS]->(ret)
                """,
                returns=all_return_records,
            )

        if all_statement_records:
            tx.run(
                """
                UNWIND $statements AS s
                MATCH (m:Method {name: s.method_name, class_name: s.class_name})
                MERGE (st:Statement {index: s.statement_index, method_name: s.method_name, class_name: s.class_name})
                SET st:Analysis, st.type = s.statement_type,
                    st.content = s.statement_content,
                    st.updated_at = s.updated_at
                MERGE (m)-[:HAS_STATEMENT]->(st)
                """,
                statements=all_statement_records,
            )

        # 9. Field 배치 생성
        all_field_records = []
        for class_node, package_name, project_name in classes_data:
            all_field_records.extend(
                converters.build_field_records(class_node, project_name, current_timestamp)
            )

        if all_field_records:
            tx.run(
                """
                UNWIND $fields AS f
                MATCH (c:Class {name: f.class_name})
                MERGE (p:Field {name: f.prop_name, class_name: f.class_name, project_name: f.project_name})
                SET p:Analysis, p.type = f.prop_type,
                    p.logical_name = f.prop_logical_name,
                    p.modifiers_json = f.prop_modifiers_json,
                    p.annotations_json = f.prop_annotations_json,
                    p.initial_value = f.prop_initial_value,
                    p.package_name = f.package_name,
                    p.project_name = f.project_name,
                    p.description = f.prop_description,
                    p.ai_description = f.prop_ai_description,
                    p.updated_at = f.updated_at
                MERGE (c)-[:HAS_FIELD]->(p)
                """,
                fields=all_field_records,
            )

        # 10. Method Call 관계 배치 생성
        call_records_external = []
        call_records_internal = []
        call_records_inner_class = []

        for class_node, package_name, project_name in classes_data:
            existing_method_names = {method.name for method in getattr(class_node, "methods", [])}

            for method_call in class_node.calls:
                if not getattr(method_call, "target_class", "") or not getattr(method_call, "target_method", ""):
                    continue

                if (
                    method_call.target_class == class_node.name
                    and method_call.target_method not in existing_method_names
                ):
                    continue

                target_package = method_call.target_package or ""

                if is_external_library(method_call.target_class, target_package):
                    call_records_external.append({
                        'target_class': method_call.target_class,
                        'target_method': method_call.target_method,
                        'source_method': method_call.source_method,
                        'source_class': class_node.name,
                        'source_package': package_name,
                        'target_package': method_call.target_package,
                        'call_order': method_call.call_order,
                        'line_number': method_call.line_number,
                    })
                elif is_inner_class(method_call.target_class):
                    outer_class = extract_outer_class_name(method_call.target_class)
                    call_records_inner_class.append({
                        'target_class': method_call.target_class,
                        'target_method': method_call.target_method,
                        'source_method': method_call.source_method,
                        'source_class': class_node.name,
                        'source_package': package_name,
                        'target_package': target_package or package_name,
                        'call_order': method_call.call_order,
                        'line_number': method_call.line_number,
                        'outer_class': outer_class,
                        'project_name': project_name,
                    })
                else:
                    call_records_internal.append({
                        'target_class': method_call.target_class,
                        'target_method': method_call.target_method,
                        'source_method': method_call.source_method,
                        'source_class': class_node.name,
                        'source_package': package_name,
                        'target_package': target_package,
                        'call_order': method_call.call_order,
                        'line_number': method_call.line_number,
                    })

        # 외부 라이브러리 호출
        if call_records_external:
            tx.run(
                """
                UNWIND $calls AS call
                MERGE (tc:Class {name: call.target_class, package_name: ''})
                SET tc:Analysis, tc.is_external = true
                WITH call, tc
                MERGE (tm:Method {name: call.target_method, class_name: call.target_class})
                SET tm:Analysis
                MERGE (tc)-[:HAS_METHOD]->(tm)
                WITH call, tm
                MATCH (sm:Method {name: call.source_method, class_name: call.source_class})
                MERGE (sm)-[r:CALLS]->(tm)
                SET r.source_package = call.source_package,
                    r.source_class = call.source_class,
                    r.source_method = call.source_method,
                    r.target_package = call.target_package,
                    r.target_class = call.target_class,
                    r.target_method = call.target_method,
                    r.call_order = call.call_order,
                    r.line_number = call.line_number
                """,
                calls=call_records_external
            )

        # Inner class 호출
        if call_records_inner_class:
            # Inner class는 외부 클래스의 패키지를 조회해야 함
            for call in call_records_inner_class:
                outer_class_result = tx.run(
                    "MATCH (oc:Class {name: $outer_class, project_name: $project_name}) "
                    "RETURN oc.package_name as package_name "
                    "LIMIT 1",
                    outer_class=call['outer_class'],
                    project_name=call['project_name']
                )
                record = outer_class_result.single()
                if record and record['package_name']:
                    call['actual_target_package'] = record['package_name']
                else:
                    call['actual_target_package'] = call['target_package']

            tx.run(
                """
                UNWIND $calls AS call
                MERGE (tc:Class {name: call.target_class, package_name: call.actual_target_package})
                SET tc:Analysis, tc.is_external = false, tc.is_inner_class = true
                WITH call, tc
                MERGE (tm:Method {name: call.target_method, class_name: call.target_class})
                SET tm:Analysis
                MERGE (tc)-[:HAS_METHOD]->(tm)
                WITH call, tm
                MATCH (sm:Method {name: call.source_method, class_name: call.source_class})
                MERGE (sm)-[r:CALLS]->(tm)
                SET r.source_package = call.source_package,
                    r.source_class = call.source_class,
                    r.source_method = call.source_method,
                    r.target_package = call.actual_target_package,
                    r.target_class = call.target_class,
                    r.target_method = call.target_method,
                    r.call_order = call.call_order,
                    r.line_number = call.line_number
                """,
                calls=call_records_inner_class
            )

        # 내부 프로젝트 호출
        if call_records_internal:
            tx.run(
                """
                UNWIND $calls AS call
                MERGE (tc:Class {name: call.target_class, package_name: call.target_package})
                SET tc:Analysis, tc.is_external = false
                WITH call, tc
                MERGE (tm:Method {name: call.target_method, class_name: call.target_class})
                SET tm:Analysis
                MERGE (tc)-[:HAS_METHOD]->(tm)
                WITH call, tm
                MATCH (sm:Method {name: call.source_method, class_name: call.source_class})
                MERGE (sm)-[r:CALLS]->(tm)
                SET r.source_package = call.source_package,
                    r.source_class = call.source_class,
                    r.source_method = call.source_method,
                    r.target_package = call.target_package,
                    r.target_class = call.target_class,
                    r.target_method = call.target_method,
                    r.call_order = call.call_order,
                    r.line_number = call.line_number
                """,
                calls=call_records_internal
            )
            
    def get_project_loc_statistics(self, project_name: str) -> dict:
        """
        프로젝트에 속한 모든 Class의 LOC 통계를 조회합니다.

        Args:
            project_name: 프로젝트명

        Returns:
            dict: LOC 통계 (total_ploc, total_lloc, total_cloc)
        """
        return self._execute_read(self._get_project_loc_statistics_tx, project_name)

    @staticmethod
    def _get_project_loc_statistics_tx(tx, project_name: str) -> dict:
        """프로젝트의 LOC 통계를 조회하는 트랜잭션"""
        query = """
        MATCH (c:Class {project_name: $project_name})
        WHERE c.PLOC IS NOT NULL
        RETURN SUM(c.PLOC) AS total_ploc,
               SUM(c.LLOC) AS total_lloc,
               SUM(c.CLOC) AS total_cloc
        """
        result = tx.run(query, project_name=project_name)
        record = result.single()

        if record:
            return {
                'total_ploc': int(record['total_ploc'] or 0),
                'total_lloc': int(record['total_lloc'] or 0),
                'total_cloc': int(record['total_cloc'] or 0),
            }
        else:
            return {
                'total_ploc': 0,
                'total_lloc': 0,
                'total_cloc': 0,
            }
