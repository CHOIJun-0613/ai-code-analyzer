"""
Unit tests for Class Sub-type Extraction (rule003)
"""

import pytest
from csa.models.graph_entities import Annotation
from csa.parsers.java.class_subtype import extract_class_subtype_from_annotations


class TestClassSubtypeExtraction:
    """Class sub-type 추출 테스트"""

    def test_controller_with_restcontroller(self):
        """@RestController 어노테이션이 있으면 'controller' 반환"""
        annotations = [
            Annotation(name="RestController", parameters={}),
            Annotation(name="BxmCategory", parameters={"logicalName": "테스트컨트롤러"})
        ]
        result = extract_class_subtype_from_annotations(annotations)
        assert result == "controller"

    def test_controller_with_controller(self):
        """@Controller 어노테이션이 있으면 'controller' 반환"""
        annotations = [
            Annotation(name="Controller", parameters={}),
        ]
        result = extract_class_subtype_from_annotations(annotations)
        assert result == "controller"

    def test_service_annotation(self):
        """@Service 어노테이션이 있으면 'service' 반환"""
        annotations = [
            Annotation(name="Service", parameters={}),
            Annotation(name="BxmCategory", parameters={"logicalName": "테스트서비스"})
        ]
        result = extract_class_subtype_from_annotations(annotations)
        assert result == "service"

    def test_component_annotation(self):
        """@Component 어노테이션이 있으면 'component' 반환"""
        annotations = [
            Annotation(name="Component", parameters={}),
            Annotation(name="BxmCategory", parameters={"logicalName": "테스트컴포넌트"})
        ]
        result = extract_class_subtype_from_annotations(annotations)
        assert result == "component"

    def test_dbio_annotation(self):
        """@BxmDataAccess 어노테이션이 있으면 'dbio' 반환"""
        annotations = [
            Annotation(name="BxmDataAccess", parameters={"datasource": "biz-ds"}),
            Annotation(name="BxmCategory", parameters={"logicalName": "테스트DBM"})
        ]
        result = extract_class_subtype_from_annotations(annotations)
        assert result == "dbio"

    def test_dto_with_xml_annotations(self):
        """@XmlType + @XmlRootElement 어노테이션이 있으면 'dto' 반환"""
        annotations = [
            Annotation(name="XmlType", parameters={"propOrder": "['field1', 'field2']"}),
            Annotation(name="XmlRootElement", parameters={"name": "TestDTO"}),
            Annotation(name="BxmCategory", parameters={"logicalName": "테스트DTO"})
        ]
        result = extract_class_subtype_from_annotations(annotations)
        assert result == "dto"

    def test_dto_missing_xmlrootelemt(self):
        """@XmlType만 있고 @XmlRootElement가 없으면 'utility' 반환"""
        annotations = [
            Annotation(name="XmlType", parameters={"propOrder": "['field1', 'field2']"}),
        ]
        result = extract_class_subtype_from_annotations(annotations)
        assert result == "utility"

    def test_utility_no_annotations(self):
        """특정 어노테이션이 없으면 'utility' 반환"""
        annotations = []
        result = extract_class_subtype_from_annotations(annotations)
        assert result == "utility"

    def test_utility_with_other_annotations(self):
        """rule003에 정의되지 않은 어노테이션만 있으면 'utility' 반환"""
        annotations = [
            Annotation(name="Deprecated", parameters={}),
            Annotation(name="SuppressWarnings", parameters={"value": "all"})
        ]
        result = extract_class_subtype_from_annotations(annotations)
        assert result == "utility"

    def test_priority_controller_over_component(self):
        """@RestController와 @Component가 동시에 있으면 'controller' 반환 (우선순위)"""
        annotations = [
            Annotation(name="RestController", parameters={}),
            Annotation(name="Component", parameters={}),
        ]
        result = extract_class_subtype_from_annotations(annotations)
        assert result == "controller"

    def test_priority_service_over_component(self):
        """@Service와 @Component가 동시에 있으면 'service' 반환 (우선순위)"""
        annotations = [
            Annotation(name="Service", parameters={}),
            Annotation(name="Component", parameters={}),
        ]
        result = extract_class_subtype_from_annotations(annotations)
        assert result == "service"

    def test_annotation_with_full_package_name(self):
        """전체 패키지명이 포함된 어노테이션도 정상 처리"""
        annotations = [
            Annotation(name="org.springframework.stereotype.Service", parameters={}),
        ]
        result = extract_class_subtype_from_annotations(annotations)
        assert result == "service"

    def test_case_sensitive_annotation_names(self):
        """어노테이션 이름은 대소문자를 구분함 (정규화 테스트)"""
        annotations = [
            Annotation(name="RestController", parameters={}),  # 대문자 R
        ]
        result = extract_class_subtype_from_annotations(annotations)
        assert result == "controller"


class TestRulesPriority:
    """rule003 우선순위 테스트"""

    def test_priority_order(self):
        """rule003에 정의된 우선순위 순서대로 판별"""
        # 1. Controller (최우선)
        annotations = [
            Annotation(name="RestController", parameters={}),
            Annotation(name="Service", parameters={}),
            Annotation(name="Component", parameters={}),
        ]
        assert extract_class_subtype_from_annotations(annotations) == "controller"

        # 2. Service
        annotations = [
            Annotation(name="Service", parameters={}),
            Annotation(name="Component", parameters={}),
        ]
        assert extract_class_subtype_from_annotations(annotations) == "service"

        # 3. Component
        annotations = [
            Annotation(name="Component", parameters={}),
            Annotation(name="BxmDataAccess", parameters={}),
        ]
        assert extract_class_subtype_from_annotations(annotations) == "component"

        # 4. DBM (dbio)
        annotations = [
            Annotation(name="BxmDataAccess", parameters={}),
        ]
        assert extract_class_subtype_from_annotations(annotations) == "dbio"

        # 5. DTO
        annotations = [
            Annotation(name="XmlType", parameters={}),
            Annotation(name="XmlRootElement", parameters={}),
        ]
        assert extract_class_subtype_from_annotations(annotations) == "dto"

        # 6. Utility (기본값)
        annotations = [
            Annotation(name="Deprecated", parameters={}),
        ]
        assert extract_class_subtype_from_annotations(annotations) == "utility"


if __name__ == "__main__":
    pytest.main([__file__, "-v"])
