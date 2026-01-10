"""
Java Parser Addon for Rule003 - Class Sub-type Extraction
프로젝트별 클래스 sub-type 추출 규칙을 실시간으로 해석하여 Java 클래스 분석 시 적용
"""

import re
from typing import Optional, Dict, Any, List
from csa.models.graph_entities import Annotation
from csa.services.graph_db import GraphDB
from csa.utils.logger import get_logger


class ClassSubtypeExtractor:
    """Class sub-type 추출기 - rule003 기반 (Global Rules)"""

    _instance = None
    
    def __new__(cls):
        # Singleton
        if cls._instance is None:
            cls._instance = super().__new__(cls)
        return cls._instance

    def __init__(self):
        # 이미 초기화된 인스턴스는 재초기화하지 않음
        if hasattr(self, '_initialized'):
            return

        self.logger = get_logger(__name__)
        # Rules are accessed dynamically via property or method to ensure latest loaded rules
        self._initialized = True

    @property
    def rules(self):
        """Get current rules from manager"""
        from csa.utils.rules_manager import rules_manager
        return rules_manager.get_class_subtype_rules()

    def extract_class_subtype(self, annotations: List[Annotation]) -> str:
        """클래스의 sub-type 추출

        rule003에 따라 다음 순서로 sub-type 판별:
        1. @RestController 또는 @Controller -> "controller"
        2. @Service -> "service"
        3. @Component -> "component"
        4. @BxmDataAccess -> "dbio"
        5. @XmlType + @XmlRootElement -> "dto"
        6. 위 조건에 해당하지 않으면 -> "utility"

        Args:
            annotations: 클래스의 Annotation 객체 리스트

        Returns:
            sub-type 문자열 ("controller", "service", "component", "dbio", "dto", "utility")
        """
        if not annotations:
            return "utility"

        # annotation 이름 리스트 추출 (정규화)
        annotation_names = set()
        for annotation in annotations:
            # 전체 패키지명이 있는 경우 클래스명만 추출
            name = annotation.name.split('.')[-1] if '.' in annotation.name else annotation.name
            annotation_names.add(name)

        self.logger.debug(f"클래스 annotations: {annotation_names}")

        # 동적 규칙 적용 (설정 파일 기반)
        if isinstance(self.rules, list):
            for rule in self.rules:
                subtype = rule.get('subtype')
                required_annotations = rule.get('annotations', [])
                condition = rule.get('condition', 'any')  # any | all
                
                # Check annotations
                matched_count = 0
                for req_name in required_annotations:
                    if req_name in annotation_names:
                        matched_count += 1
                
                is_match = False
                if required_annotations:
                    if condition == 'all':
                        if matched_count == len(required_annotations):
                            is_match = True
                    else:  # any
                        if matched_count > 0:
                            is_match = True
                
                if is_match:
                    self.logger.debug(f"클래스 sub-type 추출 성공 ({subtype}): {required_annotations} 중 {matched_count}개 일치")
                    return subtype

        # 6. 기본값: utility
        self.logger.debug("클래스 sub-type 추출 성공: utility (기본값)")
        return "utility"

    def update_class_subtype(self, graph_db: GraphDB, class_name: str, project_name: str, subtype: str):
        """클래스의 sub-type을 DB에 업데이트"""
        try:
            with graph_db._driver.session() as session:
                query = """
                MATCH (c:Class {name: $class_name, project_name: $project_name})
                SET c.subtype = $subtype
                RETURN c.name as class_name
                """
                result = session.run(query,
                                  class_name=class_name,
                                  project_name=project_name,
                                  subtype=subtype)

                if result.single():
                    self.logger.info(f"클래스 sub-type 업데이트 완료: {class_name} -> {subtype}")
                    return True
                else:
                    self.logger.warning(f"클래스 찾을 수 없음: {class_name}")
                    return False

        except Exception as e:
            self.logger.error(f"클래스 sub-type 업데이트 실패: {e}")
            return False


def extract_class_subtype_from_annotations(annotations: List[Annotation], project_name: str = None) -> str:
    """클래스의 sub-type 추출 (캐시된 인스턴스 재사용)

    rule003에 따라 annotation 기반으로 sub-type 판별

    Args:
        annotations: 클래스의 Annotation 객체 리스트
        project_name: 프로젝트 이름 (선택사항, 캐싱용)

    Returns:
        sub-type 문자열 ("controller", "service", "component", "dbio", "dto", "utility")
    """
    try:
        # Singleton instance use
        extractor = ClassSubtypeExtractor()
        return extractor.extract_class_subtype(annotations)

        # Legacy fallback logic removed as global rules cover it


        # 프로젝트명이 없으면 직접 추출 (캐싱 없음)
        if not annotations:
            return "utility"

        # annotation 이름 리스트 추출 (정규화)
        annotation_names = set()
        for annotation in annotations:
            name = annotation.name.split('.')[-1] if '.' in annotation.name else annotation.name
            annotation_names.add(name)

        # sub-type 판별 (rule003)
        if "RestController" in annotation_names or "Controller" in annotation_names:
            return "controller"
        if "Service" in annotation_names:
            return "service"
        if "Component" in annotation_names:
            return "component"
        if "BxmDataAccess" in annotation_names:
            return "dbio"
        if "XmlType" in annotation_names and "XmlRootElement" in annotation_names:
            return "dto"

        return "utility"

    except Exception as e:
        logger = get_logger(__name__)
        logger.error(f"클래스 sub-type 추출 실패: {e}")
        return "utility"


def process_java_file_with_rule003(file_path: str, project_name: str, graph_db: GraphDB):
    """Rule003을 사용하여 Java 파일의 클래스 sub-type 추출 및 업데이트"""
    from csa.vendor import javalang
    from csa.services.java_analysis.utils import parse_annotations



    extractor = ClassSubtypeExtractor()

    try:
        with open(file_path, 'r', encoding='utf-8') as f:
            java_source = f.read()

        # Java 파싱
        tree = javalang.parse.parse(java_source)

        # 클래스 찾기
        for path, node in tree:
            if isinstance(node, javalang.tree.ClassDeclaration):
                class_name = node.name

                # 클래스 annotations 파싱
                if hasattr(node, 'annotations') and node.annotations:
                    class_annotations = parse_annotations(node.annotations, "class")
                    class_subtype = extractor.extract_class_subtype(class_annotations)

                    if class_subtype:
                        extractor.update_class_subtype(graph_db, class_name, project_name, class_subtype)

        return True

    except Exception as e:
        extractor.logger.error(f"Java 파일 처리 실패: {file_path}, {e}")
        return False
