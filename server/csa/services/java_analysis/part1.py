"""
Java project parsing orchestration helpers.
"""
from __future__ import annotations

import gc
import os
import re
import time
import psutil
import multiprocessing
import hashlib
from concurrent.futures import ThreadPoolExecutor, as_completed
from queue import Queue
from threading import Lock
from typing import Dict, List, Optional, Tuple

from csa.vendor import javalang

from csa.models.graph_entities import (
    Bean,
    BeanDependency,
    Class, 
    ConfigFile,
    Endpoint,
    Field,
    Method,
    MethodCall,
    MyBatisMapper,
    Package,
    SqlStatement,
    TestClass,
    JpaEntity,
    JpaRepository,
    JpaQuery,
)
from csa.services.graph_db import GraphDB
from csa.utils.logger import get_logger
from csa.utils.loc_calculator import calculate_loc, LOCMetrics
from csa.utils.cognitive_complexity import calculate_method_cognitive_complexity
from csa.utils.code_complexity import calculate_code_complexity_from_class_node
from csa.utils.csaignore import load_csaignore_filter
from .config import extract_config_files
from .jpa import (
    analyze_jpa_entity_table_mapping,
    extract_jpa_entities_from_classes,
    extract_jpa_queries_from_repositories,
    extract_jpa_repositories_from_classes,
)
from .mybatis import (
    analyze_mybatis_resultmap_mapping,
    analyze_sql_method_relationships,
    extract_mybatis_mappers_from_classes,
    extract_mybatis_xml_mappers,
    extract_sql_statements_from_mappers,
    generate_db_call_chain_analysis,
)
from .spring import analyze_bean_dependencies, extract_beans_from_classes, extract_endpoints_from_classes
from .tests import extract_test_classes_from_classes
from .utils import (
    extract_project_name,
    extract_sub_type,
    generate_lombok_methods,
    parse_annotations,
)

# AI 분석 서비스
try:
    from csa.aiwork.ai_analyzer import get_ai_analyzer, AIAnalyzer
    from csa.aiwork.ai_config import AIConfig
    AI_ANALYZER_AVAILABLE = True
except ImportError:
    AI_ANALYZER_AVAILABLE = False
    get_ai_analyzer = None
    AIAnalyzer = None
    AIConfig = None

def extract_inner_class_source(inner_class_declaration: javalang.tree.ClassDeclaration, file_content: str) -> str:
    """
    Inner class의 선언부 소스 코드 추출

    Args:
        inner_class_declaration: Inner class 선언 노드
        file_content: 전체 파일 소스 코드

    Returns:
        Inner class 선언부 소스 코드
    """
    if not inner_class_declaration.position:
        return ""

    lines = file_content.splitlines(keepends=True)
    start_line = inner_class_declaration.position.line - 1

    # 중괄호 개수로 클래스 선언 끝 위치 찾기
    brace_count = 0
    end_line = start_line
    found_opening_brace = False

    for i in range(start_line, len(lines)):
        line = lines[i]
        for char in line:
            if char == '{':
                brace_count += 1
                found_opening_brace = True
            elif char == '}':
                brace_count -= 1
                if found_opening_brace and brace_count == 0:
                    end_line = i
                    break

        if found_opening_brace and brace_count == 0:
            break

    return ''.join(lines[start_line:end_line + 1])


def _scan_for_preceding_comments(lines: List[str], start_line_idx: int) -> int:
    """
    주어진 시작 라인 위로 스캔하여 주석이나 어노테이션이 포함된 시작 라인을 찾습니다.
    
    Args:
        lines: 파일의 전체 라인 리스트
        start_line_idx: 탐색을 시작할 라인 인덱스 (0-based)
        
    Returns:
        수정된 시작 라인 인덱스 (0-based)
    """
    current_idx = start_line_idx - 1
    new_start_idx = start_line_idx
    
    # 빈 줄 허용 개수
    empty_line_count = 0
    max_empty_lines = 1
    
    while current_idx >= 0:
        line = lines[current_idx].strip()
        
        # 빈 줄 처리
        if not line:
            empty_line_count += 1
            if empty_line_count > max_empty_lines:
                break
            # 빈 줄도 포함하기 위해 인덱스 업데이트 (단, 너무 많은 빈 줄은 위에서 break로 끊김)
            current_idx -= 1
            continue
            
        # 주석 확인
        if line.startswith('//') or line.startswith('/*') or line.startswith('*') or line.endswith('*/'):
            new_start_idx = current_idx
            empty_line_count = 0 # 주석을 찾았으므로 빈 줄 카운트 초기화
            current_idx -= 1
            continue
            
        # 어노테이션 확인 (@로 시작)
        if line.startswith('@'):
            new_start_idx = current_idx
            empty_line_count = 0
            current_idx -= 1
            continue
            
        # 닫는 중괄호나 세미콜론 등을 만나면 이전 코드 블록의 끝이므로 중단
        if line.endswith('}') or line.endswith(';') or line.endswith('{'):
            break
            
        # 그 외의 경우 (일반 코드 등) 중단
        break
        
    return new_start_idx


def parse_inner_classes(
    outer_class_declaration: javalang.tree.ClassDeclaration,
    outer_class_name: str,
    package_name: str,
    file_path: str,
    file_content: str,
    project_name: str,
    import_map: dict
) -> list[Class]:
    """
    재귀적으로 Inner class 파싱

    Args:
        outer_class_declaration: 외부 클래스 선언
        outer_class_name: 외부 클래스명
        package_name: 패키지명
        file_path: 파일 경로
        file_content: 소스 코드
        project_name: 프로젝트명
        import_map: import 맵

    Returns:
        Inner class 노드 리스트
    """
    logger = get_logger(__name__)
    inner_classes = []

    if not hasattr(outer_class_declaration, 'body') or not outer_class_declaration.body:
        return inner_classes

    for body_item in outer_class_declaration.body:
        if isinstance(body_item, javalang.tree.ClassDeclaration):
            # Inner class 이름
            inner_class_full_name = f"{outer_class_name}.{body_item.name}"

            inner_class_annotations = parse_annotations(body_item.annotations, "class") if hasattr(body_item, 'annotations') else []

            # Inner class 선언부 소스 추출
            inner_class_source = extract_inner_class_source(body_item, file_content)

            # 논리명 추출 (rule001: @BxmCategory의 logicalName 파라미터에서 추출)
            from csa.services.java_parser_addon_r001 import extract_class_logical_name_from_annotations
            inner_class_logical_name = extract_class_logical_name_from_annotations(inner_class_annotations) or ""

            # description 추출 (rule002: @BxmCategory의 description 파라미터에서 추출)
            from csa.parsers.java.description import extract_class_description_from_annotations
            inner_class_description = extract_class_description_from_annotations(inner_class_annotations) or ""

            # DTO 클래스 소스 저장 여부 결정 (환경 변수로 제어)
            skip_dto_source = os.getenv("SKIP_DTO_SOURCE", "false").lower() == "true"
            inner_source = inner_class_source

            if skip_dto_source and is_dto_class(body_item.name, file_path):
                inner_source = ""  # DTO inner class는 소스 저장 안 함
                logger.debug(f"DTO inner 소스 저장 건너뜀: {inner_class_full_name}")

            # Inner class LOC 메트릭 계산
            inner_loc_metrics = calculate_loc(inner_class_source)

            # Inner class 노드 생성 (code_complexity는 나중에 계산)
            inner_class_node = Class(
                name=inner_class_full_name,
                logical_name=inner_class_logical_name if inner_class_logical_name else "",
                file_path=file_path,
                file_extension=os.path.splitext(file_path)[1],
                type="class",
                sub_type="inner_class",
                source=inner_source,
                annotations=inner_class_annotations,
                package_name=package_name,
                project_name=project_name,
                description=inner_class_description if inner_class_description else "",
                ai_description="",
                bxm_category=inner_class_logical_name if inner_class_logical_name else "",
                PLOC=inner_loc_metrics.ploc,
                LLOC=inner_loc_metrics.lloc,
                CLOC=inner_loc_metrics.cloc,
                code_complexity=0  # 메서드와 필드 추가 후 재계산
            )

            # imports 추가
            for imp in import_map.values():
                inner_class_node.imports.append(imp)

            # 상속 관계 처리
            if hasattr(body_item, 'extends') and body_item.extends:
                superclass_name = body_item.extends.name
                if superclass_name in import_map:
                    inner_class_node.superclass = import_map[superclass_name]
                else:
                    inner_class_node.superclass = f"{package_name}.{superclass_name}" if package_name else superclass_name

            # 인터페이스 구현 처리
            if hasattr(body_item, 'implements') and body_item.implements:
                for impl_ref in body_item.implements:
                    interface_name = impl_ref.name
                    if interface_name in import_map:
                        inner_class_node.interfaces.append(import_map[interface_name])
                    else:
                        inner_class_node.interfaces.append(f"{package_name}.{interface_name}" if package_name else interface_name)

            # 필드 처리
            if hasattr(body_item, 'fields'):
                for field_declaration in body_item.fields:
                    for declarator in field_declaration.declarators:
                        field_type = field_declaration.type.name if hasattr(field_declaration.type, 'name') else str(field_declaration.type)

                        field_annotations = parse_annotations(field_declaration.annotations, "field") if hasattr(field_declaration, 'annotations') else []

                        initial_value = ""
                        if hasattr(declarator, 'initializer') and declarator.initializer:
                            if hasattr(declarator.initializer, 'value'):
                                initial_value = str(declarator.initializer.value)
                            elif hasattr(declarator.initializer, 'type'):
                                initial_value = str(declarator.initializer.type)

                        field = Field(
                            name=declarator.name,
                            type=field_type,
                            annotations=field_annotations,
                            initial_value=initial_value,
                            access_modifier="private"
                        )

                        inner_class_node.properties.append(field)

            # 메서드 처리
            if hasattr(body_item, 'methods'):
                call_order = 0
                for method_declaration in body_item.methods:
                    method_name = method_declaration.name
                    return_type = method_declaration.return_type.name if hasattr(method_declaration.return_type, 'name') else (str(method_declaration.return_type) if method_declaration.return_type else "void")

                    method_annotations = parse_annotations(method_declaration.annotations, "method") if hasattr(method_declaration, 'annotations') else []

                    # 메서드 파라미터를 Field 객체로 생성
                    parameters = []
                    if hasattr(method_declaration, 'parameters') and method_declaration.parameters:
                        for param in method_declaration.parameters:
                            param_type_name = 'Unknown'
                            if param.type:
                                if hasattr(param.type, 'sub_type') and param.type.sub_type:
                                    param_type_name = f"{param.type.name}.{param.type.sub_type.name}"
                                elif hasattr(param.type, 'name') and param.type.name:
                                    param_type_name = param.type.name

                            parameters.append(Field(
                                name=param.name,
                                logical_name=f"{package_name}.{outer_class_name}.{method_name}.{param.name}",
                                type=param_type_name,
                                package_name=package_name,
                                class_name=outer_class_name
                            ))

                    # 메서드 modifiers 추출
                    modifiers = list(method_declaration.modifiers) if hasattr(method_declaration, 'modifiers') else []

                    # 메서드 소스 코드 추출
                    method_source = ""
                    if method_declaration.position:
                        lines = file_content.splitlines(keepends=True)
                        start_line = method_declaration.position.line - 1

                        brace_count = 0
                        end_line = start_line
                        found_opening_brace = False
                        for i in range(start_line, len(lines)):
                            line = lines[i]
                            for char in line:
                                if char == '{':
                                    brace_count += 1
                                    found_opening_brace = True
                                elif char == '}':
                                    brace_count -= 1
                                    if found_opening_brace and brace_count == 0:
                                        end_line = i
                                        break
                        if found_opening_brace and brace_count == 0:
                                break

                        # 어노테이션 위치 고려하여 시작 라인 조정
                        if hasattr(method_declaration, 'annotations') and method_declaration.annotations:
                            for annotation in method_declaration.annotations:
                                if hasattr(annotation, 'position') and annotation.position:
                                    if annotation.position.line - 1 < start_line:
                                        start_line = annotation.position.line - 1

                        # 선행 주석 스캔
                        start_line = _scan_for_preceding_comments(lines, start_line)

                        method_source = "".join(lines[start_line:end_line + 1])

                    # DTO inner class 메서드는 복잡도 측정 건너뛰기
                    skip_dto_source = os.getenv("SKIP_DTO_SOURCE", "false").lower() == "true"
                    is_dto = skip_dto_source and is_dto_class(body_item.name, file_path)

                    # Inner class 메서드 LOC 메트릭 계산
                    inner_method_loc_metrics = calculate_loc(method_source) if method_source and not is_dto else LOCMetrics(0, 0, 0)

                    # Inner class 메서드 Cognitive Complexity 계산
                    inner_method_cognitive_complexity = 0
                    if method_source and not is_dto:
                        try:
                            inner_method_cognitive_complexity = calculate_method_cognitive_complexity(method_declaration)
                        except Exception as e:
                            logger.debug(f"Inner class 메서드 Cognitive Complexity 계산 실패 ({inner_class_full_name}.{method_name}): {e}")

                    method = Method(
                        name=method_name,
                        return_type=return_type,
                        annotations=method_annotations,
                        parameters=parameters,
                        modifiers=modifiers,
                        source=method_source,
                        PLOC=inner_method_loc_metrics.ploc,
                        LLOC=inner_method_loc_metrics.lloc,
                        CLOC=inner_method_loc_metrics.cloc,
                        cognitive_complexity=inner_method_cognitive_complexity
                    )

                    inner_class_node.methods.append(method)

            # Inner class code_complexity 계산
            try:
                inner_class_node.code_complexity = calculate_code_complexity_from_class_node(inner_class_node)
            except Exception as e:
                logger.debug(f"Inner class code_complexity 계산 실패 ({inner_class_full_name}): {e}")
                inner_class_node.code_complexity = 0

            inner_classes.append(inner_class_node)

            # 중첩된 inner class (재귀)
            if hasattr(body_item, 'body') and body_item.body:
                nested = parse_inner_classes(
                    body_item, inner_class_full_name, package_name, file_path,
                    file_content, project_name, import_map
                )
                inner_classes.extend(nested)

    return inner_classes


def parse_single_java_file(file_path: str, project_name: str, graph_db: GraphDB = None, ai_options: dict = None, use_ai: bool = None) -> tuple[Package, Class, list[Class], str]:
    """Parse a single Java file and return parsed entities."""
    logger = get_logger(__name__)
    
    with open(file_path, 'r', encoding='utf-8') as f:
        file_content = f.read()
    
    try:
        tree = javalang.parse.parse(file_content)
        logger.debug(f"Successfully parsed file: {file_path}")
        
        package_name = tree.package.name if tree.package else ""
        logger.debug(f"Parsed package name: {package_name}")
        
        if package_name:
            package_node = Package(name=package_name)
        else:
            package_name = "default"
            package_node = Package(name=package_name)
        
        import_map = {}
        for imp in tree.imports:
            class_name = imp.path.split('.')[-1]
            import_map[class_name] = imp.path
        
        # 클래스 선언 찾기
        class_declaration = None
        for type_decl in tree.types:
            if isinstance(type_decl, (javalang.tree.ClassDeclaration, javalang.tree.InterfaceDeclaration)):
                class_declaration = type_decl
                break
        
        if not class_declaration:
            logger.error(f"No class declaration found in file: {file_path}")
            return None, None, [], ""
        
        class_name = class_declaration.name
        class_annotations = parse_annotations(class_declaration.annotations, "class") if hasattr(class_declaration, 'annotations') else []
        class_type = "interface" if isinstance(class_declaration, javalang.tree.InterfaceDeclaration) else "class"
        
        # sub_type 추출
        sub_type = extract_sub_type(package_name, class_name, class_annotations)

        # 논리명 추출 시도 (rule001: @BxmCategory의 logicalName 파라미터에서 추출)
        from csa.services.java_parser_addon_r001 import extract_class_logical_name_from_annotations
        class_logical_name = extract_class_logical_name_from_annotations(class_annotations) or ""

        # description 추출 시도 (rule002: @BxmCategory의 description 파라미터에서 추출)
        from csa.parsers.java.description import extract_class_description_from_annotations
        class_description = extract_class_description_from_annotations(class_annotations) or ""

        # AI 분석 활성화 여부 결정
        use_ai_env = os.getenv("USE_AI_ANALYSIS", "false").lower() == "true"
        
        should_use_ai = False
        if use_ai is not None:
            should_use_ai = use_ai
        elif ai_options:
            should_use_ai = True
        else:
            should_use_ai = use_ai_env
            
        use_ai = should_use_ai
        
        ai_description = ""
        source_hashcode = hashlib.sha256(file_content.encode('utf-8')).hexdigest()

        if use_ai and AI_ANALYZER_AVAILABLE:
            try:
                # Check for existing analysis if DB is available
                skip_ai = False
                if graph_db:
                    analysis_info = graph_db.get_class_analysis_info(class_name, project_name)
                    if analysis_info and analysis_info.get("source_hashcode") == source_hashcode:
                        existing_ai_desc = analysis_info.get("ai_description")
                        if existing_ai_desc:
                            ai_description = existing_ai_desc
                            skip_ai = True
                            logger.info(f"Skipping AI analysis for {class_name} (source unchanged)")

                if not skip_ai:
                    analyzer = None
                    if ai_options and AIAnalyzer and AIConfig:
                        # worker-specific analyzer
                        config = AIConfig(ai_options)
                        analyzer = AIAnalyzer(config)
                    else:
                        # global analyzer
                        analyzer = get_ai_analyzer()
                        
                    if analyzer and analyzer.is_available():
                        ai_description = analyzer.analyze_class(file_content, class_name)
            except Exception as e:
                logger.warning(f"AI Class 분석 실패 ({class_name}): {e}")
                ai_description = ""

        # DTO 클래스 소스 저장 여부 결정 (환경 변수로 제어)
        skip_dto_source = os.getenv("SKIP_DTO_SOURCE", "false").lower() == "true"
        class_source = file_content

        if skip_dto_source and is_dto_class(class_name, file_path):
            class_source = ""  # DTO 클래스는 소스 저장 안 함
            logger.debug(f"DTO 소스 저장 건너뜀: {class_name}")

        # LOC 메트릭 계산
        loc_metrics = calculate_loc(file_content)

        class_node = Class(
            name=class_name,
            logical_name=class_logical_name if class_logical_name else "",
            file_path=file_path,
            file_extension=os.path.splitext(file_path)[1],
            type=class_type,
            sub_type=sub_type,
            source=class_source,
            annotations=class_annotations,
            package_name=package_name,
            project_name=project_name,
            description=class_description if class_description else "",
            ai_description=ai_description,
            bxm_category=class_logical_name if class_logical_name else "",
            PLOC=loc_metrics.ploc,
            LLOC=loc_metrics.lloc,
            CLOC=loc_metrics.cloc,
            code_complexity=0,  # 메서드와 필드 추가 후 재계산
            source_hashcode=source_hashcode
        )

        # imports 추가
        for imp in tree.imports:
            class_node.imports.append(imp.path)
