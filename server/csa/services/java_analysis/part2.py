        
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
                skip_dto_source = os.getenv("SKIP_DTO_SOURCE", "false").lower() == "true"
                if skip_dto_source and is_dto_class(class_name, file_path):
                    field_logical_name = ""  # DTO 필드 논리명 추출 건너뛰기 (성능 최적화)
                else:
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
                class_node.properties.append(prop)
        
        # 메서드 처리 (환경 변수로 DTO 생략 제어)
        SKIP_DTO_METHODS = os.getenv("SKIP_DTO_METHODS", "true").lower() == "true"

        if SKIP_DTO_METHODS and sub_type == "dto":
            # DTO 메서드 분석 생략
            logger.debug(f"DTO 메서드 분석 생략: {class_name} (sub_type={sub_type})")
        else:
            all_declarations = class_declaration.methods + class_declaration.constructors
            
            for declaration in all_declarations:
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
                # USE_AI_ANALYSIS 결정 로직은 위에서 계산된 use_ai 사용
                if use_ai and AI_ANALYZER_AVAILABLE and method_source:
                    analyzer = get_ai_analyzer()
                    if analyzer.is_available():
                        # class_name도 함께 전달하여 로그에 Class.Method 형식으로 표시
                        method_ai_description = analyzer.analyze_method(
                            method_source,
                            method_name=declaration.name,
                            class_name=class_name
                        )

                # DTO 클래스 메서드는 복잡도 측정 건너뛰기
                skip_dto_source = os.getenv("SKIP_DTO_SOURCE", "false").lower() == "true"
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
