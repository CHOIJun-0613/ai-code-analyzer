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
    is_dto_class,
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


def parse_single_java_file(file_path: str, project_name: str, graph_db: GraphDB = None, ai_options: dict = None, use_ai: bool = None, skip_dto_source: bool = True, skip_dto_methods: bool = True) -> tuple[Package, Class, list[Class], str]:
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

        # Calculate source hashcode immediately
        source_hashcode = hashlib.sha256(file_content.encode('utf-8')).hexdigest()

        # Check for existing analysis if DB is available (Early Skip)
        skip_analysis_completely = False
        if graph_db:
             try:
                analysis_info = graph_db.get_class_analysis_info(class_name, project_name)
                if analysis_info and analysis_info.get("source_hashcode") == source_hashcode:
                    # AI 분석을 요청한 경우, 소스가 변경되지 않았더라도 진행 (AI 분석 결과 갱신 등을 위해)
                    # use_ai 플래그가 True이면 스킵하지 않음
                    # 단, use_ai는 이 함수 호출 시점에는 아직 정확히 확정되지 않았을 수 있음 (env vs option)
                    # 따라서 여기서 use_ai 인자를 확인하거나, 아래에서 결정된 값을 미리 계산해야 함.
                    
                    # use_ai 인자는 parse_single_java_file의 인자로 전달됨
                    if not use_ai:
                        logger.info(f"Skipping analysis for {class_name} (source unchanged, AI not requested)")
                        return None, None, [], "SKIPPED_UNCHANGED"
                    else:
                        logger.info(f"Proceeding with analysis for {class_name} despite unchanged source (AI requested)")
             except Exception as e:
                 logger.warning(f"Failed to check existing hash for {class_name}: {e}")

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
                ai_description = f"AI 분석 실패: {e}"

        # DTO 클래스 소스 저장 여부 결정 (인자 우선, 없으면 환경변수-기본값 true로 변경 고려)
        # skip_dto_source 인자가 있으므로 그대로 사용
        class_source = file_content
        class_source = file_content

        if skip_dto_source and is_dto_class(class_name, file_path):
            class_source = ""  # DTO 클래스는 소스 저장 안 함
            source_hashcode = ""
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
        
        # 상속 관계 처리
        if class_declaration.extends:
            superclass_name = class_declaration.extends.name
            if superclass_name in import_map:
                class_node.superclass = import_map[superclass_name]
            else:
                class_node.superclass = f"{package_name}.{superclass_name}" if package_name else superclass_name
        
        # 인터페이스 구현 처리
        if hasattr(class_declaration, 'implements') and class_declaration.implements:
            for impl_ref in class_declaration.implements:
                interface_name = impl_ref.name
                if interface_name in import_map:
                    class_node.interfaces.append(import_map[interface_name])
                else:
                    class_node.interfaces.append(f"{package_name}.{interface_name}" if package_name else interface_name)
        
        # 필드 처리
        field_map = {}
        for field_declaration in class_declaration.fields:
            for declarator in field_declaration.declarators:
                field_map[declarator.name] = field_declaration.type.name
                
                field_annotations = parse_annotations(field_declaration.annotations, "field") if hasattr(field_declaration, 'annotations') else []
                
                initial_value = ""
                if hasattr(declarator, 'initializer') and declarator.initializer:
                    if hasattr(declarator.initializer, 'value'):
                        initial_value = str(declarator.initializer.value)
                    elif hasattr(declarator.initializer, 'type'):
                        initial_value = str(declarator.initializer.type)
                    else:
                        initial_value = str(declarator.initializer)
                
                # 필드 논리명 추출 시도 (DTO는 건너뛰기)
                 # skip_dto_source 인자 사용
                if skip_dto_source and is_dto_class(class_name, file_path):
                    field_logical_name = ""  # DTO 필드 논리명 추출 건너뛰기 (성능 최적화)
                else:
                    from csa.services.java_parser_addon_r001 import extract_java_field_logical_name
                    line_number = field_declaration.position.line if field_declaration.position else None
                    field_logical_name = extract_java_field_logical_name(file_content, declarator.name, project_name, line_number)
                
                prop = Field(
                    name=declarator.name,
                    logical_name=field_logical_name if field_logical_name else "",
                    type=field_declaration.type.name,
                    modifiers=list(field_declaration.modifiers),
                    package_name=package_name,
                    class_name=class_name,
                    annotations=field_annotations,
                    initial_value=initial_value,
                    description="",
                    ai_description=""
                )
                class_node.properties.append(prop)
        
        # 메서드 처리 (인자로 제어)
        SKIP_DTO_METHODS = skip_dto_methods
        logger.debug(f"Sub-type check: {sub_type}, Skip DTO Methods: {SKIP_DTO_METHODS}, Class Annotations: {[a.name for a in class_annotations]}")

        if SKIP_DTO_METHODS and sub_type == "dto":
            # DTO 메서드 분석 생략
            logger.debug(f"DTO 메서드 분석 생략: {class_name} (sub_type={sub_type})")
        else:
            all_declarations = class_declaration.methods + class_declaration.constructors
            
            for declaration in all_declarations:
                method_name = declaration.name
                logger.debug(f"Processing method declaration: {method_name}")
                local_var_map = field_map.copy()
                params = []
                for param in declaration.parameters:
                    param_type_name = 'Unknown'
                    if param.type:
                        if hasattr(param.type, 'sub_type') and param.type.sub_type:
                            param_type_name = f"{param.type.name}.{param.type.sub_type.name}"
                        elif hasattr(param.type, 'name') and param.type.name:
                            param_type_name = param.type.name
                    local_var_map[param.name] = param_type_name
                    params.append(Field(name=param.name, logical_name=f"{package_name}.{class_name}.{param.name}", type=param_type_name, package_name=package_name, class_name=class_name))
                
                if declaration.body:
                    for _, var_decl in declaration.filter(javalang.tree.LocalVariableDeclaration):
                        for declarator in var_decl.declarators:
                            local_var_map[declarator.name] = var_decl.type.name
                
                if isinstance(declaration, javalang.tree.MethodDeclaration):
                    return_type = declaration.return_type.name if declaration.return_type else "void"
                else:
                    return_type = "constructor"
                
                modifiers = list(declaration.modifiers)
                method_annotations = parse_annotations(declaration.annotations, "method") if hasattr(declaration, 'annotations') else []
                
                method_metadata = ""
                if declaration.position:
                    lines = file_content.splitlines(keepends=True)
                    original_start_line = declaration.position.line - 1
                    start_line = original_start_line
                    
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
                    if hasattr(declaration, 'annotations') and declaration.annotations:
                        for annotation in declaration.annotations:
                            if hasattr(annotation, 'position') and annotation.position:
                                if annotation.position.line - 1 < start_line:
                                    start_line = annotation.position.line - 1

                    # 선행 주석 스캔
                    start_line = _scan_for_preceding_comments(lines, start_line)

                    method_source = "".join(lines[start_line:end_line + 1])
                    
                    # Metadata 추출 (start_line ~ original_start_line)
                    if start_line < original_start_line:
                        method_metadata = "".join(lines[start_line:original_start_line])
                
                # 논리명 추출 시도 (rule001: @BxmCategory의 logicalName 파라미터에서 추출)
                from csa.services.java_parser_addon_r001 import extract_method_logical_name_from_annotations
                method_logical_name = extract_method_logical_name_from_annotations(method_annotations) or ""
    
                # description 추출 시도 (rule002: @BxmCategory의 description 파라미터에서 추출)
                from csa.parsers.java.description import extract_method_description_from_annotations
                method_description = extract_method_description_from_annotations(method_annotations) or ""
    
                # AI 분석 수행 (오류 시 빈 문자열 반환)
                method_ai_description = ""
                
                # Getter/Setter 등 단순 메서드는 AI 분석 제외 (속도 최적화)
                is_simple_method = method_name.startswith(('get', 'set', 'is')) and len(method_source.strip().splitlines()) <= 5

                # USE_AI_ANALYSIS 결정 로직은 위에서 계산된 use_ai 사용
                if use_ai and not is_simple_method:
                    if not AI_ANALYZER_AVAILABLE:
                         logger.warning(f"AI Analysis skipped for {class_name}.{declaration.name}: AI Analyzer not available")
                    elif not method_source:
                         logger.warning(f"AI Analysis skipped for {class_name}.{declaration.name}: Empty method source")
                    else:
                        logger.info(f"Starting AI Analysis for method: {class_name}.{declaration.name}")
                        try:
                            analyzer = get_ai_analyzer()
                            if analyzer.is_available():
                                # class_name도 함께 전달하여 로그에 Class.Method 형식으로 표시
                                method_ai_description = analyzer.analyze_method(
                                    method_source,
                                    method_name=declaration.name,
                                    class_name=class_name
                                )
                                logger.info(f"AI Analysis completed for method: {class_name}.{declaration.name}")
                            else:
                                logger.warning(f"AI Analysis skipped for {class_name}.{declaration.name}: AI Analyzer is_available returned False")
                        except Exception as ai_err:
                            logger.error(f"AI Analysis failed for {class_name}.{declaration.name}: {ai_err}")
                
                 # DTO skipping logs are handled by caller/config usually, but here is where logic resides.
                 # Actually, use_ai already accounts for skip_dto_methods via caller?
                 # parse_single_java_file receives use_ai. But project.py logic:
                 # line 506: use_ai = ai_options.get('use_ai', False) if ai_options else use_ai
                 
                 # The 'skip_dto_source' logic is for skipping FIELDS logical name.
                 # The method logic is below. Method AI analysis is gated by `use_ai`.
                 # Caller (handlers.py) passes `use_ai` which comes from request params.
                 # If user unchecked "Include AI", use_ai is False.
                 # If use_ai is True, but this is a DTO and skip_dto_methods is True, AI *should* be skipped.
                 # Wait, does parse_single_java_file handle DTO skipping for AI?
                 # No, `use_ai` is passed directly. 
                 # However, `is_dto` calculated at line 715 is mostly for complexity/loc metrics.
                 # If we want to skip AI for DTOs, we must check it here.


                # DTO 클래스 메서드는 복잡도 측정 건너뛰기
                # skip_dto_source 사용 (기존 로직 유지)
                is_dto = skip_dto_source and is_dto_class(class_name, file_path)

                # 메서드 LOC 메트릭 계산
                method_loc_metrics = calculate_loc(method_source) if method_source and not is_dto else LOCMetrics(0, 0, 0)

                # 메서드 Cognitive Complexity 계산
                method_cognitive_complexity = 0
                if method_source and not is_dto:
                    try:
                        method_cognitive_complexity = calculate_method_cognitive_complexity(declaration)
                    except Exception as e:
                        logger.debug(f"메서드 Cognitive Complexity 계산 실패 ({class_name}.{declaration.name}): {e}")

                method = Method(
                    name=declaration.name,
                    logical_name=method_logical_name if method_logical_name else "",
                    return_type=return_type,
                    parameters=params,
                    modifiers=modifiers,
                    source=method_source,
                    metadata=method_metadata,
                    package_name=package_name,
                    annotations=method_annotations,
                    description=method_description if method_description else "",
                    ai_description=method_ai_description,
                    calls=[],  # 명시적으로 calls 속성 초기화
                    PLOC=method_loc_metrics.ploc,
                    LLOC=method_loc_metrics.lloc,
                    CLOC=method_loc_metrics.cloc,
                    cognitive_complexity=method_cognitive_complexity
                )
                
                # 메서드 호출 분석 - MethodCall 객체 생성
                if declaration.body:
                    call_order = 1
                    for _, invocation in declaration.filter(javalang.tree.MethodInvocation):
                        if not invocation.position:
                            continue
                        
                        # 로그 메서드 자체 제외
                        if invocation.qualifier and invocation.qualifier in ['log', 'logger', 'LOGGER']:
                            if hasattr(invocation, 'member') and invocation.member in ['info', 'debug', 'warn', 'error', 'trace']:
                                continue
                        
                        target_class_name = None
                        resolved_target_package = ""
                        resolved_target_class_name = ""
                        
                        if invocation.qualifier:
                            if invocation.qualifier in local_var_map:
                                target_class_name = local_var_map[invocation.qualifier]
                            else:
                                target_class_name = invocation.qualifier
                            
                            if target_class_name:
                                if target_class_name == "System.out":
                                    resolved_target_package = "java.io"
                                    resolved_target_class_name = "PrintStream"
                                else:
                                    if invocation.qualifier in local_var_map:
                                        resolved_target_class_name = target_class_name
                                        if target_class_name in import_map:
                                            resolved_target_package = ".".join(import_map[target_class_name].split(".")[:-1])
                                        else:
                                            # import_map에 없으면 현재 패키지만 사용
                                            # (잘못된 패키지 추론 로직 제거)
                                            resolved_target_package = package_name
                                    
                                    if '<' in target_class_name:
                                        base_type = target_class_name.split('<')[0]
                                        resolved_target_class_name = base_type
                                    
                                    if not resolved_target_class_name:
                                        if target_class_name in import_map:
                                            resolved_target_package = ".".join(import_map[target_class_name].split(".")[:-1])
                                        else:
                                            resolved_target_package = package_name
                                        resolved_target_class_name = target_class_name
                        else:
                            resolved_target_package = package_name
                            resolved_target_class_name = class_name
    
                        if resolved_target_class_name:
                            method_name = invocation.member
                            # Stream API 메서드 필터링
                            if method_name in {'collect', 'map', 'filter', 'forEach', 'stream', 'reduce', 'findFirst', 'findAny', 'anyMatch', 'allMatch', 'noneMatch', 'count', 'distinct', 'sorted', 'limit', 'skip', 'peek', 'flatMap', 'toArray'}:
                                continue
                                
                            line_number = invocation.position.line if invocation.position else 0
    
                            call = MethodCall(
                                source_package=package_name,
                                source_class=class_name,
                                source_method=declaration.name,
                                target_package=resolved_target_package,
                                target_class=resolved_target_class_name,
                                target_method=invocation.member,
                                call_order=call_order,
                                line_number=line_number,
                                return_type="void"
                            )
                            class_node.calls.append(call)
                            call_order += 1
                
                class_node.methods.append(method)

        # Inner class 파싱
        inner_classes = parse_inner_classes(
            class_declaration,
            class_name,
            package_name,
            file_path,
            file_content,
            project_name,
            import_map
        )

        # Class code_complexity 계산 (메서드와 필드 추가 완료 후)
        try:
            class_node.code_complexity = calculate_code_complexity_from_class_node(class_node)
        except Exception as e:
            logger.debug(f"Class code_complexity 계산 실패 ({class_name}): {e}")
            class_node.code_complexity = 0

        logger.debug(f"Successfully parsed single file: {file_path} (found {len(inner_classes)} inner classes)")
        return package_node, class_node, inner_classes, package_name

    except Exception as e:
        logger.error(f"Error parsing file: {e}")
        return None, None, [], ""

def parse_java_project_full(
    directory: str,
    graph_db: GraphDB = None,
    source_options: dict = None,
    stop_check_callback: callable = None,
    skip_dto_source: bool = True,
    skip_dto_methods: bool = True,
) -> tuple[
    list[Package], list[Class], dict[str, str], list[Bean], list[BeanDependency],
    list[Endpoint], list[MyBatisMapper], list[JpaEntity], list[JpaRepository],
    list[JpaQuery], list[ConfigFile], list[TestClass], list[SqlStatement], str
]:
    """Parse Java project and return parsed entities."""
    logger = get_logger(__name__)
    
    project_name = extract_project_name(directory)
    packages = {}
    classes = {}
    class_to_package_map = {}
    
    logger.info(f"Starting Java project analysis in: {directory}")
    logger.info(f"Project name: {project_name}")

    # Fetch existing class hashes for skipping analysis
    existing_hashes = {}
    if graph_db:
        try:
            existing_hashes = graph_db.get_project_class_hashes(project_name)
            logger.info(f"Loaded {len(existing_hashes)} existing class hashes for incremental analysis")
        except Exception as e:
            logger.warning(f"Failed to load existing class hashes: {e}")

    java_file_count = 0
    processed_file_count = 0
    
    # 클래스 파싱 진행 상황 추적을 위한 변수들
    total_classes = 0
    processed_classes = 0
    last_logged_percent = 0
    
    # 모든 .java 파일 수집 (.csaignore 필터 포함)
    exclude_patterns = []
    use_csaignore_file = True

    if source_options and 'exclude_patterns' in source_options:
        # UI/API에서 명시적으로 exclude_patterns가 전달된 경우 (빈 문자열 포함)
        # .csaignore 파일을 무시하고 전달된 패턴만 적용 (또는 없으면 적용 안함)
        raw_patterns = source_options['exclude_patterns']
        
        if raw_patterns is not None:
            use_csaignore_file = False
            if isinstance(raw_patterns, str):
                exclude_patterns = [p.strip() for p in raw_patterns.splitlines() if p.strip()]
            elif isinstance(raw_patterns, list):
                exclude_patterns = raw_patterns
            else:
                exclude_patterns = []

    logger.info("Java 파일 수집 중...")
    java_files = _collect_java_files_with_csaignore(directory, exclude_patterns=exclude_patterns, use_csaignore_file=use_csaignore_file)
    logger.info(f"총 {len(java_files)}개 Java 파일 발견")

    # 먼저 전체 클래스 개수를 계산
    logger.info("클래스 개수 계산 중...")
    for file_path in java_files:
        try:
            with open(file_path, 'r', encoding='utf-8') as f:
                file_content = f.read()

            tree = javalang.parse.parse(file_content)
            for type_decl in tree.types:
                if isinstance(type_decl, (javalang.tree.ClassDeclaration, javalang.tree.InterfaceDeclaration)):
                    total_classes += 1
        except Exception:
            continue

    logger.info(f"총 {total_classes}개 클래스 발견")

    for file_path in java_files:
        if stop_check_callback:
            stop_check_callback()
            
        java_file_count += 1
        logger.debug(f"Processing Java file {java_file_count}: {file_path}")

        with open(file_path, 'r', encoding='utf-8') as f:
            file_content = f.read()

        try:
            tree = javalang.parse.parse(file_content)
            package_name = tree.package.name if tree.package else ""
            logger.debug(f"Parsed file: {file_path}, package: {package_name}")
            
            if package_name and package_name not in packages:
                packages[package_name] = Package(
                    name=package_name
                )
            elif not package_name:
                package_name = "default"
                if package_name not in packages:
                    packages[package_name] = Package(
                        name=package_name
                    )
            
            import_map = {}
            for imp in tree.imports:
                class_name = imp.path.split('.')[-1]
                import_map[class_name] = imp.path

            class_declarations = []
            for type_decl in tree.types:
                if isinstance(type_decl, (javalang.tree.ClassDeclaration, javalang.tree.InterfaceDeclaration)):
                    class_declarations.append((None, type_decl))
            
            for _, class_declaration in class_declarations:
                class_name = class_declaration.name
                class_key = f"{package_name}.{class_name}"
                logger.debug(f"Processing class/interface: {class_name} (type: {type(class_declaration).__name__})")
                
                if class_key not in classes:
                    class_annotations = parse_annotations(class_declaration.annotations, "class") if hasattr(class_declaration, 'annotations') else []
                    class_type = "interface" if isinstance(class_declaration, javalang.tree.InterfaceDeclaration) else "class"
                    
                    # sub_type 추출 (package name의 마지막 단어)
                    sub_type = extract_sub_type(package_name, class_name, class_annotations)
                    
                    # 논리명 추출 시도 (rule001: @BxmCategory의 logicalName 파라미터에서 추출)
                    from csa.services.java_parser_addon_r001 import extract_class_logical_name_from_annotations
                    class_logical_name = extract_class_logical_name_from_annotations(class_annotations) or ""

                    # description 추출 시도 (rule002: @BxmCategory의 description 파라미터에서 추출)
                    from csa.parsers.java.description import extract_class_description_from_annotations
                    class_description = extract_class_description_from_annotations(class_annotations) or ""

                    # LOC 메트릭 계산
                    loc_metrics = calculate_loc(file_content)

                    # Source Hash Calculation & Incremental Analysis Check
                    source_hashcode = hashlib.sha256(file_content.encode('utf-8')).hexdigest()

                    # DTO check for source skipping (do not save source and hashcode)
                    is_skipped_dto = skip_dto_source and is_dto_class(class_name, file_path)
                    if is_skipped_dto:
                        source_hashcode = ""

                    ai_description = ""
                    
                    if class_name in existing_hashes:
                        info = existing_hashes[class_name]
                        if info.get("source_hashcode") == source_hashcode:
                            ai_description = info.get("ai_description", "")
                            # logger.debug(f"Reusing existing analysis for {class_name}")

                    classes[class_key] = Class(
                        name=class_name,
                        logical_name=class_logical_name if class_logical_name else "",
                        file_path=file_path,
                        type=class_type,
                        sub_type=sub_type,
                        source="" if is_skipped_dto else file_content,
                        source_hashcode=source_hashcode,
                        annotations=class_annotations,
                        package_name=package_name,
                        project_name=project_name,
                        description=class_description if class_description else "",
                        ai_description=ai_description,
                        bxm_category=class_logical_name if class_logical_name else "",
                        PLOC=loc_metrics.ploc,
                        LLOC=loc_metrics.lloc,
                        CLOC=loc_metrics.cloc,
                        code_complexity=0  # 메서드와 필드 추가 후 재계산
                    )
                    class_to_package_map[class_key] = package_name
                    logger.debug(f"Successfully added class to classes dict: {class_name} (key: {class_key})")
                    
                    # 진행 상황을 10% 단위로 표시
                    processed_classes += 1
                    current_percent = int((processed_classes / total_classes) * 100) if total_classes > 0 else 0
                    
                    if current_percent >= last_logged_percent + 10 or processed_classes == total_classes:
                        last_logged_percent = current_percent
                        logger.info(f"클래스 파싱 진행중 [{processed_classes}/{total_classes}] ({current_percent}%) - 최근: {class_name}")
                else:
                    logger.debug(f"Class {class_name} already exists, skipping")
                
                for imp in tree.imports:
                    classes[class_key].imports.append(imp.path)

                if class_declaration.extends:
                    superclass_name = class_declaration.extends.name
                    if superclass_name in import_map:
                        classes[class_key].superclass = import_map[superclass_name]
                    else:
                        classes[class_key].superclass = f"{package_name}.{superclass_name}" if package_name else superclass_name

                if hasattr(class_declaration, 'implements') and class_declaration.implements:
                    for impl_ref in class_declaration.implements:
                        interface_name = impl_ref.name
                        if interface_name in import_map:
                            classes[class_key].interfaces.append(import_map[interface_name])
                        else:
                            classes[class_key].interfaces.append(f"{package_name}.{interface_name}" if package_name else interface_name)

                field_map = {}
                for field_declaration in class_declaration.fields:
                    for declarator in field_declaration.declarators:
                        field_map[declarator.name] = field_declaration.type.name
                        
                        field_annotations = parse_annotations(field_declaration.annotations, "field") if hasattr(field_declaration, 'annotations') else []
                        
                        initial_value = ""
                        if hasattr(declarator, 'initializer') and declarator.initializer:
                            if hasattr(declarator.initializer, 'value'):
                                initial_value = str(declarator.initializer.value)
                            elif hasattr(declarator.initializer, 'type'):
                                initial_value = str(declarator.initializer.type)
                            else:
                                initial_value = str(declarator.initializer)
                        
                        # 필드 논리명 추출 시도
                        from csa.services.java_parser_addon_r001 import extract_java_field_logical_name
                        field_logical_name = extract_java_field_logical_name(file_content, declarator.name, project_name)
                        
                        prop = Field(
                            name=declarator.name,
                            logical_name=field_logical_name if field_logical_name else "",
                            type=field_declaration.type.name,
                            modifiers=list(field_declaration.modifiers),
                            package_name=package_name,
                            class_name=class_name,
                            annotations=field_annotations,
                            initial_value=initial_value,
                            description="",
                            ai_description=""
                        )
                        classes[class_key].properties.append(prop)

                all_declarations = class_declaration.methods + class_declaration.constructors
                
                # DTO 메서드 생략 로직
                if skip_dto_methods and sub_type == "dto":
                     logger.debug(f"DTO 메서드 분석 생략: {class_name}")
                     all_declarations = []

                for declaration in all_declarations:
                    local_var_map = field_map.copy()
                    params = []
                    for param in declaration.parameters:
                        param_type_name = 'Unknown'
                        if param.type:
                            # ReferenceType의 경우 - 내부 클래스 지원
                            if hasattr(param.type, 'sub_type') and param.type.sub_type:
                                # PaymentDto.RefundRequest 형태
                                param_type_name = f"{param.type.name}.{param.type.sub_type.name}"
                            elif hasattr(param.type, 'name') and param.type.name:
                                # 일반 타입
                                param_type_name = param.type.name
                        local_var_map[param.name] = param_type_name
                        params.append(Field(name=param.name, logical_name=f"{package_name}.{class_name}.{param.name}", type=param_type_name, package_name=package_name, class_name=class_name))

                    if declaration.body:
                        for _, var_decl in declaration.filter(javalang.tree.LocalVariableDeclaration):
                            for declarator in var_decl.declarators:
                                local_var_map[declarator.name] = var_decl.type.name
                    
                    if isinstance(declaration, javalang.tree.MethodDeclaration):
                        return_type = declaration.return_type.name if declaration.return_type else "void"
                    else:
                        return_type = "constructor"

                    modifiers = list(declaration.modifiers)
                    method_annotations = parse_annotations(declaration.annotations, "method") if hasattr(declaration, 'annotations') else []

                    method_source = ""
                    if declaration.position:
                        lines = file_content.splitlines(keepends=True)
                        start_line = declaration.position.line - 1
                        
                        brace_count = 0
                        end_line = start_line
                        for i in range(start_line, len(lines)):
                            line = lines[i]
                            for char in line:
                                if char == '{':
                                    brace_count += 1
                                elif char == '}':
                                    brace_count -= 1
                                    if brace_count == 0:
                                        end_line = i
                                        break
                            if brace_count == 0:
                                break
                        
                        method_source = "".join(lines[start_line:end_line + 1])

                    # 논리명 추출 시도 (rule001: @BxmCategory의 logicalName 파라미터에서 추출)
                    from csa.services.java_parser_addon_r001 import extract_method_logical_name_from_annotations
                    method_logical_name = extract_method_logical_name_from_annotations(method_annotations) or ""

                    # description 추출 시도 (rule002: @BxmCategory의 description 파라미터에서 추출)
                    from csa.parsers.java.description import extract_method_description_from_annotations
                    method_description = extract_method_description_from_annotations(method_annotations) or ""

                    method = Method(
                        name=declaration.name,
                        logical_name=method_logical_name if method_logical_name else "",
                        return_type=return_type,
                        parameters=params,
                        modifiers=modifiers,
                        source=method_source,
                        package_name=package_name,
                        annotations=method_annotations,
                        description=method_description if method_description else "",
                        ai_description=""
                    )
                    classes[class_key].methods.append(method)

                    # Step 1: 로그 메서드가 있는 라인 번호 수집 (더 포괄적으로)
                    log_lines = set()
                    for _, invocation in declaration.filter(javalang.tree.MethodInvocation):
                        # 로그 메서드 감지 (더 포괄적)
                        is_log_method = False
                        
                        # log.info, logger.debug 등
                        if invocation.qualifier and invocation.qualifier in ['log', 'logger', 'LOGGER']:
                            if hasattr(invocation, 'member') and invocation.member in ['info', 'debug', 'warn', 'error', 'trace']:
                                is_log_method = True
                        
                        # System.out.println, System.err.println
                        elif invocation.qualifier and invocation.qualifier in ['System']:
                            if hasattr(invocation, 'member') and invocation.member in ['out', 'err']:
                                is_log_method = True
                        
                        # println 메서드 직접 호출
                        elif hasattr(invocation, 'member') and invocation.member in ['println', 'print']:
                            is_log_method = True
                        
                        if is_log_method and invocation.position:
                            # 로그 메서드가 있는 라인과 인접한 라인들도 포함 (멀티라인 로그 지원)
                            log_line = invocation.position.line
                            log_lines.add(log_line)
                            log_lines.add(log_line + 1)  # 다음 라인도 포함

                    # Step 2: 메서드 호출 추출 (로그 라인 제외)
                    call_order = 0
                    for _, invocation in declaration.filter(javalang.tree.MethodInvocation):
                        # position이 없는 호출은 건너뛰기 (순서를 알 수 없음)
                        if not invocation.position:
                            continue
                        
                        # 로그 라인에 있는 모든 메서드 호출 제외
                        if invocation.position.line in log_lines:
                            continue
                        
                        # 로그 메서드 자체 제외
                        if invocation.qualifier and invocation.qualifier in ['log', 'logger', 'LOGGER']:
                            if hasattr(invocation, 'member') and invocation.member in ['info', 'debug', 'warn', 'error', 'trace']:
                                continue
                            
                        target_class_name = None
                        resolved_target_package = ""
                        resolved_target_class_name = ""
                        
                        if invocation.qualifier:
                            if invocation.qualifier in local_var_map:
                                target_class_name = local_var_map[invocation.qualifier]
                            else:
                                target_class_name = invocation.qualifier
                            
                            if target_class_name:
                                if target_class_name == "System.out":
                                    resolved_target_package = "java.io"
                                    resolved_target_class_name = "PrintStream"
                                else:
                                    if invocation.qualifier in local_var_map:
                                        resolved_target_class_name = target_class_name
                                        if target_class_name in import_map:
                                            resolved_target_package = ".".join(import_map[target_class_name].split(".")[:-1])
                                        else:
                                            # import_map에 없으면 현재 패키지만 사용
                                            # (잘못된 패키지 추론 로직 제거)
                                            resolved_target_package = package_name
                                        
                                        if '<' in target_class_name:
                                            base_type = target_class_name.split('<')[0]
                                            resolved_target_class_name = base_type
                                    else:
                                        if target_class_name in import_map:
                                            resolved_target_package = ".".join(import_map[target_class_name].split(".")[:-1])
                                        else:
                                            resolved_target_package = package_name
                                        resolved_target_class_name = target_class_name
                        else:
                            resolved_target_package = package_name
                            resolved_target_class_name = class_name

                        if resolved_target_class_name:
                            method_name = invocation.member
                            if method_name in {'collect', 'map', 'filter', 'forEach', 'stream', 'reduce', 'findFirst', 'findAny', 'anyMatch', 'allMatch', 'noneMatch', 'count', 'distinct', 'sorted', 'limit', 'skip', 'peek', 'flatMap', 'toArray'}:
                                continue
                                
                            line_number = invocation.position.line if invocation.position else 0

                            call = MethodCall(
                                source_package=package_name,
                                source_class=class_name,
                                source_method=declaration.name,
                                target_package=resolved_target_package,
                                target_class=resolved_target_class_name,
                                target_method=invocation.member,
                                call_order=call_order,
                                line_number=line_number,
                                return_type="void"
                            )
                            classes[class_key].calls.append(call)
                            call_order += 1
                
                has_data_annotation = any(ann.name == "Data" for ann in classes[class_key].annotations)
                if has_data_annotation:
                    logger.debug(f"Found @Data annotation on {class_name}, generating Lombok methods")
                    lombok_methods = generate_lombok_methods(classes[class_key].properties, class_name, package_name)
                    classes[class_key].methods.extend(lombok_methods)
                    logger.debug(f"Generated {len(lombok_methods)} Lombok methods for {class_name}")
            
            processed_file_count += 1
            logger.debug(f"Successfully processed file: {file_path}")
            
            # Rule001 논리명 추출 로직 제거 - 이미 파싱 시 처리됨
                
        except Exception as e:
                    logger.error(f"Error processing file {file_path}: {e}")
                    continue
    
    classes_list = list(classes.values())
    beans = extract_beans_from_classes(classes_list)

    # NOTE: Bean 의존성은 Neo4j에 저장된 후 resolve_bean_dependencies_from_neo4j()로 해결
    # 메모리 효율을 위해 파싱 단계에서는 의존성을 해결하지 않음 (방안 B)
    dependencies = []

    endpoints = extract_endpoints_from_classes(classes_list)
    mybatis_mappers = extract_mybatis_mappers_from_classes(classes_list)
    jpa_entities = extract_jpa_entities_from_classes(classes_list)
    jpa_repositories = extract_jpa_repositories_from_classes(classes_list)
    jpa_queries = extract_jpa_queries_from_repositories(jpa_repositories)
    config_files = extract_config_files(directory)
    test_classes = extract_test_classes_from_classes(classes_list)
    
    xml_mappers = extract_mybatis_xml_mappers(directory, project_name, graph_db)
    mybatis_mappers.extend(xml_mappers)
    
    sql_statements = extract_sql_statements_from_mappers(mybatis_mappers, project_name)
    
    resultmap_mapping_analysis = analyze_mybatis_resultmap_mapping(mybatis_mappers, sql_statements)
    sql_method_relationships = analyze_sql_method_relationships(sql_statements, classes_list)
    db_call_chain_analysis = generate_db_call_chain_analysis(sql_statements, classes_list)
    
    logger.info(f"Java project analysis complete:")
    logger.info(f"  - Java files processed: {processed_file_count}/{java_file_count}")
    logger.info(f"  - Packages found: {len(packages)}")
    logger.info(f"  - Classes found: {len(classes)}")
    logger.info(f"  - Classes list length: {len(classes_list)}")
    
    return (
        list(packages.values()),
        classes_list,
        class_to_package_map,
        beans,
        dependencies,
        endpoints,
        mybatis_mappers,
        jpa_entities,
        jpa_repositories,
        jpa_queries,
        config_files,
        test_classes,
        sql_statements,
        project_name,
    )

class AdaptiveBatchSizer:
    """
    동적 배치 크기 조정기

    Neo4j 저장 성능에 따라 배치 크기를 자동으로 조정하여
    최적의 처리 속도를 유지합니다.
    """

    def __init__(self, initial_size: int = 50, min_size: int = 20, max_size: int = 200):
        """
        Args:
            initial_size: 초기 배치 크기
            min_size: 최소 배치 크기
            max_size: 최대 배치 크기
        """
        self.current_size = initial_size
        self.min_size = min_size
        self.max_size = max_size
        self.save_times = []  # 최근 저장 시간 기록
        self.history_limit = 5  # 최근 5회 저장 시간 추적

    def adjust(self, save_time: float, batch_size: int) -> int:
        """
        저장 시간 기반 배치 크기 조정

        Args:
            save_time: 배치 저장에 소요된 시간(초)
            batch_size: 현재 배치 크기

        Returns:
            int: 조정된 배치 크기
        """
        # 처리율 계산 (items/sec)
        throughput = batch_size / save_time if save_time > 0 else 0

        # 저장 시간 기록
        self.save_times.append(save_time)
        if len(self.save_times) > self.history_limit:
            self.save_times.pop(0)

        # 평균 저장 시간 계산
        avg_save_time = sum(self.save_times) / len(self.save_times)

        # 조정 전략
        if avg_save_time < 5.0:
            # 빠름: 배치 크기 증가 (10% 증가)
            self.current_size = min(int(self.current_size * 1.1), self.max_size)
        elif avg_save_time > 20.0:
            # 느림: 배치 크기 감소 (20% 감소)
            self.current_size = max(int(self.current_size * 0.8), self.min_size)
        # 5~20초 사이면 현재 크기 유지

        return int(self.current_size)

    def get_current_size(self) -> int:
        """현재 배치 크기 반환"""
        return int(self.current_size)


def estimate_file_complexity(file_path: str, charset: str = 'utf-8') -> int:
    """
    파일 복잡도 추정 (빠른 휴리스틱 분석)

    복잡도가 높을수록 파싱 시간이 오래 걸리므로,
    큰 파일을 먼저 워커에 배정하여 워크로드 불균형을 방지합니다.

    Args:
        file_path: Java 파일 경로
        charset: 파일 인코딩 (기본값: utf-8)

    Returns:
        int: 복잡도 점수 (높을수록 복잡)
    """
    try:
        with open(file_path, 'r', encoding=charset) as f:
            content = f.read()

        # 라인 수
        lines = content.count('\n')

        # 필드 수 (private, public, protected 선언)
        fields = content.count('private ') + content.count('public ') + content.count('protected ')

        # 메서드 수 (메서드 선언 패턴)
        methods = content.count('public ') + content.count('private ') + content.count('protected ')

        # Inner class 수
        inner_classes = content.count('static class ') + content.count('class ')

        # 어노테이션 수 (@로 시작)
        annotations = content.count('@')

        # 복잡도 점수 계산 (가중치 적용)
        complexity = (
            lines * 1 +           # 라인당 1점
            fields * 2 +          # 필드당 2점
            methods * 5 +         # 메서드당 5점
            inner_classes * 10 +  # Inner class당 10점
            annotations * 1       # 어노테이션당 1점
        )

        return complexity
    except Exception:
        # 파일 읽기 실패 시 기본값 반환 (파일 크기 기반)
        try:
            return os.path.getsize(file_path) // 10
        except:
            return 0


def is_dto_class(class_name: str, file_path: str = None, charset: str = 'utf-8') -> bool:
    """
    DTO 클래스 여부 판별

    다음 조건 중 하나라도 만족하면 DTO로 판단:
    1. 클래스명이 DTO/DODT/DIDT/VO/Entity/Grid 등으로 끝남
    2. 파일 분석 시 필드만 많고 비즈니스 로직 메서드가 거의 없음

    Args:
        class_name: 클래스명
        file_path: 파일 경로 (선택사항, 더 정확한 판별을 위해)
        charset: 파일 인코딩

    Returns:
        bool: DTO 클래스 여부
    """
    # 1. 클래스명 패턴 체크
    dto_suffixes = ['DTO', 'DODT', 'DIDT', 'ODT', 'IDT', 'VO', 'Entity', 'Grid', '_DTO', '_DODT', '_DIDT']
    if any(class_name.endswith(suffix) for suffix in dto_suffixes):
        return True

    # 2. 파일 내용 기반 체크 (선택적)
    if file_path and os.path.exists(file_path):
        try:
            with open(file_path, 'r', encoding=charset) as f:
                content = f.read()

            # 필드 수 카운트 (private, protected 필드)
            field_count = content.count('private ') + content.count('protected ')

            # 비즈니스 로직 메서드 수 (getter/setter 제외)
            # public/private/protected 메서드에서 get/set으로 시작하지 않는 것들
            total_methods = content.count('public ') + content.count('private ') + content.count('protected ')
            getter_setter = content.count('public get') + content.count('public set') + \
                           content.count('private get') + content.count('private set')
            business_methods = max(0, (total_methods - field_count - getter_setter) // 2)

            # DTO 판별: 필드 20개 이상 & 비즈니스 메서드 3개 이하
            if field_count >= 20 and business_methods <= 3:
                return True
        except:
            pass

    return False


def _parse_single_file_wrapper(file_path: str, project_name: str, ai_options: dict = None, use_ai: bool = None, skip_dto_source: bool = True, skip_dto_methods: bool = True, charset: str = 'utf-8') -> tuple:
    """
    병렬 처리용 파싱 래퍼 함수 (Neo4j 연결 없이 파싱만 수행)

    Args:
        file_path: Java 파일 경로
        project_name: 프로젝트명

    Returns:
        tuple: (file_path, package_node, class_node, inner_classes, package_name) 또는 (file_path, None, None, [], None) on error
    """
    logger = get_logger(__name__)
    start_time = time.time()
    file_name = os.path.basename(file_path)

    try:
        package_node, class_node, inner_classes, package_name = parse_single_java_file(
            file_path, project_name, None, ai_options, use_ai=use_ai, skip_dto_source=skip_dto_source, skip_dto_methods=skip_dto_methods, charset=charset
        )

        # 처리 시간 계산 및 로깅
        elapsed = time.time() - start_time
        if elapsed >= 5.0:
            logger.warning(f"⏱️  느린 파일 처리 ({elapsed:.1f}초): {file_name}")

        return (file_path, package_node, class_node, inner_classes, package_name)
    except Exception as e:
        # 예외 발생 시 None 반환 (메인 스레드에서 로깅)
        elapsed = time.time() - start_time
        if elapsed >= 5.0:
            logger.warning(f"⏱️  느린 파일 처리 실패 ({elapsed:.1f}초): {file_name}")
        return (file_path, None, None, [], str(e))


def parse_java_project_streaming(
    directory: str,
    graph_db: GraphDB,
    project_name: str,
    parallel_workers: int = 8,
    ai_options: dict = None,
    source_options: dict = None,
    use_ai_analysis: bool = False,
    stop_check_callback: callable = None,
    skip_dto_source: bool = True,
    skip_dto_methods: bool = True,
) -> dict:
    """
    스트리밍 방식 Java 프로젝트 파싱

    파일을 하나씩 파싱하고 즉시 Neo4j에 저장한 후 메모리에서 제거합니다.
    메모리 사용량을 최소화하여 대규모 프로젝트 분석이 가능합니다.

    Args:
        directory: Java 소스 디렉토리 경로
        graph_db: Neo4j GraphDB 인스턴스
        project_name: 프로젝트명

    Returns:
        dict: 분석 통계
            {
                'total_files': int,
                'processed_files': int,
                'packages': int,
                'classes': int,
                'beans': int,
                'endpoints': int,
                'jpa_entities': int,
                'jpa_repositories': int,
                'jpa_queries': int,
                'test_classes': int,
                'mybatis_mappers': int,
                'sql_statements': int,
                'config_files': int,
            }
    """
    from csa.services.analysis.neo4j_writer import add_single_class_objects_streaming

    logger = get_logger(__name__)

    logger.info(f"Starting Java project streaming analysis in: {directory}")
    logger.info(f"Project name: {project_name}")

    packages_saved = set()
    stats = {
        'total_files': 0,
        'processed_files': 0,
        'skipped_files': 0,
        'packages': 0,
        'classes': 0,
        'beans': 0,
        'endpoints': 0,
        'jpa_entities': 0,
        'jpa_repositories': 0,
        'jpa_queries': 0,
        'test_classes': 0,
        'mybatis_mappers': 0,
        'sql_statements': 0,
        'config_files': 0,
        'unchanged_files': 0,
    }

    # 진행 상황 추적 (스레드 안전)
    processed_classes = 0
    last_logged_percent = 0
    last_logged_time = time.time()  # 마지막 로그 출력 시간
    progress_interval = 5.0  # 5초마다 로그 출력
    failed_files = 0
    timeout_files = 0
    progress_lock = Lock()

    # 1회 스캔: 모든 .java 파일 경로 수집
    exclude_patterns = []
    use_csaignore_file = True

    if source_options and 'exclude_patterns' in source_options:
        # UI/API에서 명시적으로 exclude_patterns가 전달된 경우
        # .csaignore 파일을 무시하고 전달된 패턴만 적용
        raw_patterns = source_options['exclude_patterns']
        
        if raw_patterns is not None:
            use_csaignore_file = False
            if isinstance(raw_patterns, str):
                exclude_patterns = [p.strip() for p in raw_patterns.splitlines() if p.strip()]
            elif isinstance(raw_patterns, list):
                exclude_patterns = raw_patterns
            else:
                exclude_patterns = []

    # Charset 설정
    charset = "utf-8"
    if source_options and 'charset' in source_options:
        charset = source_options['charset']

    logger.info(f"Using charset: {charset}")

    logger.info("Java 파일 수집 중...")
    java_files = _collect_java_files_with_csaignore(directory, exclude_patterns=exclude_patterns, use_csaignore_file=use_csaignore_file)

    total_files = len(java_files)
    stats['total_files'] = total_files
    logger.info(f"총 {total_files}개 Java 파일 발견")

    # 파일 복잡도 기반 정렬 (복잡한 파일을 먼저 처리 - 워크로드 균형 개선)
    logger.info("파일 복잡도 분석 중...")
    complexity_start = time.time()
    file_complexities = [(f, estimate_file_complexity(f, charset=charset)) for f in java_files]

    # 복잡도 임계값 설정 (환경 변수로 제어 가능, 기본값: 50000)
    # 복잡도 임계값 설정 (source_options > 환경 변수 > 기본값 50000)
    default_complexity = 50000
    if source_options and 'java_complexity_threshold' in source_options:
        complexity_threshold = source_options['java_complexity_threshold']
    else:
        complexity_threshold = int(os.getenv("JAVA_COMPLEXITY_THRESHOLD", str(default_complexity)))

    # 극단적으로 복잡한 파일 필터링
    skipped_files = []
    filtered_complexities = []
    for file_path, complexity in file_complexities:
        if complexity > complexity_threshold:
            skipped_files.append((file_path, complexity))
        else:
            filtered_complexities.append((file_path, complexity))

    # 건너뛴 파일 로깅
    if skipped_files:
        logger.warning(f"⚠️  복잡도 임계값({complexity_threshold}) 초과로 건너뛴 파일: {len(skipped_files)}개")
        for file_path, complexity in skipped_files:
            file_name = os.path.basename(file_path)
            logger.warning(f"  - {file_name} (복잡도: {complexity})")

    # 복잡도 높은 순으로 정렬 (큰 작업부터 워커에 배정)
    filtered_complexities.sort(key=lambda x: x[1], reverse=True)
    java_files = [f for f, _ in filtered_complexities]

    # 통계 업데이트
    total_files = len(java_files)
    stats['total_files'] = total_files
    stats['skipped_files'] = len(skipped_files)

    complexity_elapsed = time.time() - complexity_start
    logger.info(f"파일 복잡도 분석 완료 ({complexity_elapsed:.2f}초)")
    logger.info(f"분석 대상: {total_files}개 (건너뜀: {len(skipped_files)}개)")

    # 상위 10개 복잡한 파일 로깅 (필터링 후)
    top_complex_files = filtered_complexities[:10]
    logger.info("복잡도 상위 10개 파일:")
    for i, (file_path, complexity) in enumerate(top_complex_files, 1):
        file_name = os.path.basename(file_path)
        logger.info(f"  {i}. {file_name} (복잡도: {complexity})")

    # 환경 변수에서 병렬 워커 수 가져오기 (CPU 코어 수 기반 자동 설정)
    # 기본값: max(4, CPU 코어수 - 2) - 최소 4개, 최대 (코어수-2)개
    cpu_count = multiprocessing.cpu_count()
    default_workers = max(4, cpu_count - 2)
    environment_workers = int(os.getenv("JAVA_PARSE_WORKERS", str(default_workers)))
    if source_options and 'java_parse_workers' in source_options:
        parallel_workers = source_options['java_parse_workers']
    else:
        parallel_workers = environment_workers
    initial_batch_size = int(os.getenv("NEO4J_BATCH_SIZE", "50"))  # 초기 배치 크기

    # 배치 크기 설정 (환경 변수 또는 기본값)
    # 메모리 오류 방지를 위해 기본 최대값을 200 -> 50으로 보수적으로 조정
    max_batch_size = int(os.getenv("NEO4J_BATCH_MAX_SIZE", "50"))
    
    # 동적 배치 크기 조정기 초기화
    batch_sizer = AdaptiveBatchSizer(
        initial_size=initial_batch_size,
        min_size=10,
        max_size=max_batch_size
    )

    logger.info(f"병렬 파싱 워커 수: {parallel_workers} (CPU 코어: {cpu_count}, 기본값: {default_workers}), 초기 배치 크기: {initial_batch_size} (동적 조정 활성화)")

    # 0. Package 사전 생성 (성능 최적화)
    logger.info("Package 정보 수집 중...")
    package_names = set()
    package_pattern = re.compile(r'^\s*package\s+([\w.]+)\s*;', re.MULTILINE)

    for file_path in java_files:
        try:
            with open(file_path, 'r', encoding=charset) as f:
                content = f.read(500)  # 첫 500자만 읽기 (package는 파일 상단에 위치)
                match = package_pattern.search(content)
                if match:
                    package_names.add(match.group(1))
        except Exception as e:
            logger.debug(f"Package 추출 실패 (무시): {file_path} - {e}")
            continue

    # 모든 Package를 한 번에 생성 (배치 처리)
    if package_names:
        logger.info(f"총 {len(package_names)}개 패키지 발견, 배치 생성 중...")
        package_start = time.time()
        package_nodes = [Package(name=pkg_name) for pkg_name in package_names]
        graph_db.add_packages_batch(package_nodes, project_name)
        packages_saved.update(package_names)
        stats['packages'] = len(package_names)
        package_elapsed = time.time() - package_start
        logger.info(f"Package 배치 생성 완료 ({package_elapsed:.2f}초)")

    # 1. 병렬 파일 파싱 + 배치 Neo4j 저장
    logger.info("병렬 파싱 시작...")
    parse_start_time = time.time()

    # 파싱된 결과를 임시 저장할 버퍼
    parsed_buffer = []
    last_batch_save_time = time.time()  # 마지막 배치 저장 시간
    batch_save_interval = 10.0  # 10초마다 배치 저장 (버퍼에 데이터가 있을 경우)

    # 타임아웃 설정 (환경 변수로 제어 가능, 기본값: 60초)
    # 타임아웃 설정 (source_options > 환경 변수 > 기본값 60초)
    default_timeout = 120.0
    if source_options and 'java_file_parse_timeout' in source_options:
        file_timeout = source_options['java_file_parse_timeout']
    else:
        file_timeout = float(os.getenv("JAVA_FILE_PARSE_TIMEOUT", "60.0"))
    logger.info(f"파일 파싱 타임아웃: {file_timeout}초")
    
    # AI 옵션 필터링
    effective_ai_options = ai_options if use_ai_analysis else None

    with ThreadPoolExecutor(max_workers=parallel_workers) as executor:
        # 모든 파일을 병렬로 파싱 제출
        future_to_file = {
            executor.submit(_parse_single_file_wrapper, file_path, project_name, effective_ai_options, use_ai=use_ai_analysis, skip_dto_source=skip_dto_source, skip_dto_methods=skip_dto_methods, charset=charset): file_path
            for file_path in java_files
        }

        # 완료된 순서대로 처리 (타임아웃 없음 - 개별 파일 타임아웃만 적용)
        try:
            for future in as_completed(future_to_file):
                if stop_check_callback:
                    stop_check_callback()

                file_path = future_to_file[future]
                try:
                    # 파싱 결과 획득 (개별 파일 타임아웃 적용)
                    try:
                        _, package_node, class_node, inner_classes, package_name = future.result(timeout=file_timeout)
                    except TimeoutError:
                        # 파일명만 추출 (경로 제거)
                        file_name = os.path.basename(file_path)
                        with progress_lock:
                            processed_classes += 1
                            timeout_files += 1
                            current_timeout = timeout_files
                        logger.warning(f"⏱️  파싱 타임아웃 #{current_timeout} ({file_timeout}초 초과): {file_name}")
                        continue

                    # 파싱 실패 시 (에러 메시지가 package_name에 담김)
                    if class_node is None:
                        # 변경 없음 (Skip) 처리
                        if package_name == "SKIPPED_UNCHANGED":
                            with progress_lock:
                                processed_classes += 1
                                stats['unchanged_files'] = stats.get('unchanged_files', 0) + 1
                            continue

                        file_name = os.path.basename(file_path)
                        with progress_lock:
                            processed_classes += 1
                            failed_files += 1
                            current_failed = failed_files
                        if isinstance(package_name, str) and package_name:
                            logger.error(f"❌ 파싱 실패 #{current_failed}: {file_name} - {package_name}")
                        else:
                            logger.error(f"❌ 파싱 실패 #{current_failed}: {file_name}")
                        continue

                    # 버퍼에 추가 및 배치 저장 여부 결정 (Lock 범위 최소화)
                    batch_to_save = None
                    should_log_progress = False
                    current_percent = 0
                    current_processed = 0

                    with progress_lock:
                        # Top-level 클래스와 Inner classes를 함께 저장
                        parsed_buffer.append((package_node, class_node, inner_classes, package_name))
                        processed_classes += 1
                        current_processed = processed_classes

                        # 진행 상황 로깅 체크 - 5초마다 또는 10% 단위
                        current_percent = int((processed_classes / total_files) * 100) if total_files > 0 else 0
                        current_time = time.time()  # Lock 안에서 시간 획득 (중복 출력 방지)
                        time_since_last_log = current_time - last_logged_time

                        # 5초 경과 또는 10% 단위 도달 또는 마지막 파일 시 로그 출력
                        # (10% 단위는 정확히 한 번만 출력되도록 last_logged_percent로 제어)
                        if time_since_last_log >= progress_interval:
                            # 5초 경과: 항상 출력
                            last_logged_time = current_time
                            should_log_progress = True
                        elif current_percent >= last_logged_percent + 10 and current_percent % 10 == 0:
                            # 10% 단위 도달: 한 번만 출력
                            last_logged_percent = current_percent
                            last_logged_time = current_time
                            should_log_progress = True
                        elif processed_classes == total_files:
                            # 마지막 파일: 반드시 출력
                            last_logged_time = current_time
                            should_log_progress = True

                        # 배치 저장 조건: 크기 도달 OR 마지막 파일 OR 시간 경과
                        time_since_last_save = current_time - last_batch_save_time
                        current_batch_size = batch_sizer.get_current_size()
                        should_save_batch = (
                            len(parsed_buffer) >= current_batch_size or  # 동적 배치 크기 도달
                            processed_classes == total_files or  # 마지막 파일
                            (len(parsed_buffer) > 0 and time_since_last_save >= batch_save_interval)  # 시간 경과
                        )

                        if should_save_batch:
                            # Lock 내에서는 복사만 수행 (최소 시간)
                            batch_to_save = parsed_buffer.copy()
                            parsed_buffer.clear()
                            last_batch_save_time = current_time  # 마지막 저장 시간 갱신

                    # Lock 밖에서 로깅 수행
                    if should_log_progress:
                        elapsed = time.time() - parse_start_time
                        files_per_sec = current_processed / elapsed if elapsed > 0 else 0
                        remaining = total_files - current_processed
                        eta_seconds = remaining / files_per_sec if files_per_sec > 0 else 0
                        eta_minutes = int(eta_seconds / 60)

                        # 메모리 사용량 측정
                        process = psutil.Process()
                        memory_mb = process.memory_info().rss / 1024 / 1024

                        # [mm:ss] 형식으로 경과 시간 표시
                        elapsed_mm = int(elapsed / 60)
                        elapsed_ss = int(elapsed % 60)
                        logger.info(
                            f"[{elapsed_mm:02d}:{elapsed_ss:02d}] "
                            f"파싱 진행중 [{current_processed}/{total_files}] ({current_percent}%) "
                            f"- {files_per_sec:.1f} files/sec, ETA: {eta_minutes}분, RAM: {memory_mb:.0f}MB"
                        )

                    # Lock 밖에서 Neo4j 저장 수행 (다른 스레드 블록 방지)
                    if batch_to_save:
                        try:
                            batch_start_time = time.time()
                            logger.info(f"  → 배치 저장 시작 ({len(batch_to_save)}개 클래스)")

                            # Class 배치 저장 (Top-level + Inner classes)
                            classes_to_save = []
                            class_to_package = {}

                            for package_node, class_node, inner_classes, package_name in batch_to_save:
                                classes_to_save.append(class_node)
                                class_to_package[class_node.name] = package_name

                                # Inner classes도 저장
                                for inner_class in inner_classes:
                                    classes_to_save.append(inner_class)
                                    class_to_package[inner_class.name] = package_name

                            # 클래스 배치 저장 (성능 최적화)
                            classes_batch_data = [
                                (cls, class_to_package.get(cls.name, ""), project_name)
                                for cls in classes_to_save
                            ]
                            graph_db.add_classes_batch(classes_batch_data)

                            # Bean/Endpoint 등 배치 저장
                            from csa.services.analysis.neo4j_writer import add_batch_class_objects_streaming
                            batch_stats = add_batch_class_objects_streaming(
                                graph_db, batch_to_save, project_name, logger
                            )

                            # 통계 누적 (Lock으로 보호)
                            with progress_lock:
                                stats['classes'] += len(classes_to_save)
                                stats['beans'] += batch_stats.get('beans', 0)
                                stats['endpoints'] += batch_stats.get('endpoints', 0)
                                stats['jpa_entities'] += batch_stats.get('jpa_entities', 0)
                                stats['jpa_repositories'] += batch_stats.get('jpa_repositories', 0)
                                stats['jpa_queries'] += batch_stats.get('jpa_queries', 0)
                                stats['test_classes'] += batch_stats.get('test_classes', 0)
                                stats['mybatis_mappers'] += batch_stats.get('mybatis_mappers', 0)
                                stats['sql_statements'] += batch_stats.get('sql_statements', 0)
                                stats['processed_files'] += len(batch_to_save)

                            batch_elapsed = time.time() - batch_start_time

                            # 배치 크기 동적 조정
                            new_batch_size = batch_sizer.adjust(batch_elapsed, len(batch_to_save))
                            if new_batch_size != current_batch_size:
                                logger.info(f"  📊 배치 크기 조정: {current_batch_size} → {new_batch_size}")

                            logger.info(f"  ← 배치 저장 완료 ({batch_elapsed:.2f}초)")

                            # 메모리 명시적 해제 (배치 저장 후)
                            del batch_to_save
                            gc.collect()

                        except Exception as batch_error:
                            logger.error(f"배치 저장 실패: {batch_error}")
                            # 배치 저장 실패 시에도 계속 진행
                            continue

                except Exception as e:
                    file_name = os.path.basename(file_path)
                    logger.error(f"❌ 예외 발생: {file_name} - {e}")
                    with progress_lock:
                        processed_classes += 1
                        failed_files += 1
                    continue

        except KeyboardInterrupt:
            logger.warning("Analysis canceled, cancelling pending tasks...")
            for f in future_to_file:
                f.cancel()
            raise

    parse_elapsed = time.time() - parse_start_time
    success_files = total_files - failed_files - timeout_files
    avg_time_per_file = (parse_elapsed / total_files * 1000) if total_files > 0 else 0
    logger.info(f"파싱 및 저장 완료 - 소요 시간: {parse_elapsed:.2f}초 (파일당 평균: {avg_time_per_file:.0f}ms)")
    logger.info(f"  성공: {success_files}/{total_files}, 실패: {failed_files}, 타임아웃: {timeout_files}")

    # 2. MyBatis XML mappers 추출 및 저장
    logger.info("MyBatis XML mappers 처리 중...")
    xml_mappers = extract_mybatis_xml_mappers(directory, project_name, graph_db)
    total_xml_mappers = len(xml_mappers)

    if total_xml_mappers > 0:
        logger.info(f"총 {total_xml_mappers}개 XML mapper 발견")
        xml_start_time = time.time()
        xml_last_log_time = xml_start_time

        for i, mapper in enumerate(xml_mappers, 1):
            graph_db.add_mybatis_mapper(mapper, project_name)
            stats['mybatis_mappers'] += 1

            # XML mapper의 SQL statements 즉시 추출 및 저장
            sql_statements = extract_sql_statements_from_mappers([mapper], project_name, use_ai=use_ai_analysis)
            if sql_statements:
                relationships = []
                for sql_statement in sql_statements:
                    graph_db.add_sql_statement(sql_statement, project_name)
                    relationships.append(
                        {
                            "mapper_name": sql_statement.mapper_name,
                            "sql_id": sql_statement.id,
                        }
                    )
                if relationships:
                    graph_db.add_mapper_sql_relationships_batch(relationships, project_name)
                stats['sql_statements'] += len(sql_statements)

            # 10개마다 또는 5초마다 진행율 표시
            current_time = time.time()
            if (i % 10 == 0) or (current_time - xml_last_log_time >= 5.0) or (i == total_xml_mappers):
                xml_percent = int(i / total_xml_mappers * 100)
                logger.info(f"  XML mapper 처리중 [{i}/{total_xml_mappers}] ({xml_percent}%)")
                xml_last_log_time = current_time

        xml_elapsed = time.time() - xml_start_time
        logger.info(f"XML mapper 처리 완료 ({total_xml_mappers}개, {xml_elapsed:.1f}초)")
    else:
        logger.info("XML mapper 없음")


    # 3. Config files 처리
    logger.info("Config files 처리 중...")
    config_files = extract_config_files(directory)
    total_config_files = len(config_files)

    if total_config_files > 0:
        logger.info(f"총 {total_config_files}개 Config 파일 발견")
        config_start_time = time.time()

        for i, config in enumerate(config_files, 1):
            graph_db.add_config_file(config, project_name)
            stats['config_files'] += 1

            # 5개마다 진행율 표시
            if (i % 5 == 0) or (i == total_config_files):
                config_percent = int(i / total_config_files * 100)
                logger.info(f"  Config 파일 처리중 [{i}/{total_config_files}] ({config_percent}%)")

        config_elapsed = time.time() - config_start_time
        logger.info(f"Config 파일 처리 완료 ({total_config_files}개, {config_elapsed:.1f}초)")
    else:
        logger.info("Config 파일 없음")

    # 4. Bean 의존성 해결 (Neo4j 쿼리)
    if stats['beans'] > 0:
        logger.info("")
        logger.info(f"Bean 의존성 해결 중... (총 {stats['beans']}개 Bean, 시간이 걸릴 수 있습니다)")
        bean_start_time = time.time()

        from csa.services.java_analysis.bean_dependency_resolver import (
            resolve_bean_dependencies_from_neo4j
        )
        resolve_bean_dependencies_from_neo4j(graph_db, project_name, logger)

        bean_elapsed = time.time() - bean_start_time
        logger.info(f"Bean 의존성 해결 완료 ({bean_elapsed:.1f}초)")

    logger.info(f"Java project streaming analysis complete:")
    logger.info(f"  - Java files processed: {stats['processed_files']}/{stats['total_files']}")
    logger.info(f"  - Packages found: {stats['packages']}")
    logger.info(f"  - Classes found: {stats['classes']}")
    logger.info(f"  - Beans: {stats['beans']}")
    logger.info(f"  - Endpoints: {stats['endpoints']}")
    logger.info(f"  - JPA Repositories: {stats['jpa_repositories']}")
    logger.info(f"  - JPA Queries: {stats['jpa_queries']}")
    logger.info(f"  - MyBatis Mappers: {stats['mybatis_mappers']}")
    logger.info(f"  - SQL Statements: {stats['sql_statements']}")

    return stats


def _collect_java_files_with_csaignore(directory: str, exclude_patterns: list[str] = None, use_csaignore_file: bool = True) -> list[str]:
    """
    디렉터리에서 .java 파일을 수집하고 .csaignore 필터를 적용합니다.

    Args:
        directory: Java 소스 디렉터리 경로
        exclude_patterns: 추가 제외 패턴 목록
        use_csaignore_file: .csaignore 파일 사용 여부

    Returns:
        list[str]: 필터링된 Java 파일 경로 목록
    """
    logger = get_logger(__name__)

    # 모든 .java 파일 수집
    java_files = []
    for root, _, files in os.walk(directory):
        for file in files:
            if file.endswith(".java"):
                java_files.append(os.path.join(root, file))

    # .csaignore 필터 적용
    csaignore_filter = load_csaignore_filter(
        os.getcwd(),
        additional_patterns=exclude_patterns,
        use_file=use_csaignore_file
    )
    if csaignore_filter.has_patterns():
        logger.info(".csaignore 패턴 적용 중...")
        original_count = len(java_files)
        java_files = csaignore_filter.filter_files(java_files)
        excluded_count = original_count - len(java_files)
        if excluded_count > 0:
            logger.info(f".csaignore로 {excluded_count}개 파일 제외됨")

    return java_files


def parse_java_project(directory: str, graph_db: GraphDB = None) -> list[Class]:
    """
    Compatibility wrapper that returns only the parsed classes.

    The full parser returns additional metadata required by the analyzer,
    but lightweight callers (including unit tests) expect only the class list.
    """

    # Provide legacy attribute accessors once at class definition level.
    if not hasattr(Class, "package"):
        setattr(Class, "package", property(lambda self: getattr(self, "package_name", "")))
    if not hasattr(Class, "project"):
        setattr(Class, "project", property(lambda self: getattr(self, "project_name", "")))

    _, classes, *_ = parse_java_project_full(directory, graph_db)
    return classes


__all__ = [
    "parse_java_project",
    "parse_java_project_full",
    "parse_java_project_streaming",
    "parse_single_java_file",
]
