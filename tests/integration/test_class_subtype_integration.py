"""
Integration tests for Class Sub-type Extraction with real Java code
"""

import pytest
from csa.vendor import javalang
from csa.services.java_analysis.utils import parse_annotations, extract_sub_type


class TestClassSubtypeIntegration:
    """실제 Java 소스코드를 파싱하여 sub-type 추출 테스트"""

    def test_controller_class_parsing(self):
        """Controller 클래스 파싱 및 sub-type 추출"""
        java_code = """
@RestController
@BxmCategory(logicalName="알림함.PUSH.기타설정.컨트롤러", description="PUSH 기타 설정 컨트롤러", author="90190264")
public class INBNtfbxPushEtcEst_CTR {
    private Logger logger = LoggerFactory.getLogger(getClass());

    private INBNtfbxPushEtcEst_SVC iNBNtfbxPushEtcEst_SVC;
}
"""
        tree = javalang.parse.parse(java_code)

        for path, node in tree.filter(javalang.tree.ClassDeclaration):
            if node.name == "INBNtfbxPushEtcEst_CTR":
                annotations = parse_annotations(node.annotations, "class")
                subtype = extract_sub_type("", node.name, annotations)
                assert subtype == "controller"

    def test_service_class_parsing(self):
        """Service 클래스 파싱 및 sub-type 추출"""
        java_code = """
@Service
@BxmCategory(logicalName="알림함.목록.조회.서비스", description="통합알림함 PUSH, SMS, KAKAO 알림 목록을 조회 한다.")
public class INBNtfbxListInq_SVC {
    private Logger logger = LoggerFactory.getLogger(getClass());

    private INBItgNtfbxListInq_COM iNBItgNtfbxListInq_COM;
}
"""
        tree = javalang.parse.parse(java_code)

        for path, node in tree.filter(javalang.tree.ClassDeclaration):
            if node.name == "INBNtfbxListInq_SVC":
                annotations = parse_annotations(node.annotations, "class")
                subtype = extract_sub_type("", node.name, annotations)
                assert subtype == "service"

    def test_component_class_parsing(self):
        """Component 클래스 파싱 및 sub-type 추출"""
        java_code = """
@Component
@BxmCategory(logicalName="통합.알림함.목록.조회.컴포넌트", description="통합알림함 PUSH, SMS, KAKAO 알림 목록을 조회 한다.")
public class INBItgNtfbxListInq_COM {
    private Logger logger = LoggerFactory.getLogger(getClass());
}
"""
        tree = javalang.parse.parse(java_code)

        for path, node in tree.filter(javalang.tree.ClassDeclaration):
            if node.name == "INBItgNtfbxListInq_COM":
                annotations = parse_annotations(node.annotations, "class")
                subtype = extract_sub_type("", node.name, annotations)
                assert subtype == "component"

    def test_dbio_class_parsing(self):
        """DBM (dbio) 클래스 파싱 및 sub-type 추출"""
        java_code = """
@SuppressWarnings({ "all" })
@BxmDataAccess(datasource = "biz-ds")
@BxmCategory(logicalName="우리플러스지원이벤트상세001.DBM", description="", author="90190264")
public interface UCM_SUP_EVT_DTL001_DBM {
    List<Map<String, Object>> selectList(Map<String, Object> params);
}
"""
        tree = javalang.parse.parse(java_code)

        for path, node in tree.filter(javalang.tree.InterfaceDeclaration):
            if node.name == "UCM_SUP_EVT_DTL001_DBM":
                annotations = parse_annotations(node.annotations, "class")
                subtype = extract_sub_type("", node.name, annotations)
                assert subtype == "dbio"

    def test_dto_class_parsing(self):
        """DTO 클래스 파싱 및 sub-type 추출"""
        java_code = """
@XmlType(propOrder={
    "ntfcDscd", "itcsno"
}, name="INBNtfbxListInqSelectCtgrClf_IDT")
@XmlRootElement(name="INBNtfbxListInqSelectCtgrClf_IDT")
@BxmCategory(logicalName="카테고리분류조회IDT", description="카테고리분류조회IDT")
public class INBNtfbxListInqSelectCtgrClf_IDT implements IOmmObject, Predictable, FieldInfo {
    private static final long serialVersionUID = 956786407L;

    private String ntfcDscd;
    private String itcsno;
}
"""
        tree = javalang.parse.parse(java_code)

        for path, node in tree.filter(javalang.tree.ClassDeclaration):
            if node.name == "INBNtfbxListInqSelectCtgrClf_IDT":
                annotations = parse_annotations(node.annotations, "class")
                subtype = extract_sub_type("", node.name, annotations)
                assert subtype == "dto"

    def test_utility_class_parsing(self):
        """Utility 클래스 파싱 및 sub-type 추출 (기본값)"""
        java_code = """
public class StringUtils {
    public static boolean isEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }
}
"""
        tree = javalang.parse.parse(java_code)

        for path, node in tree.filter(javalang.tree.ClassDeclaration):
            if node.name == "StringUtils":
                annotations = parse_annotations(node.annotations, "class") if hasattr(node, 'annotations') and node.annotations else []
                subtype = extract_sub_type("", node.name, annotations)
                assert subtype == "utility"

    def test_controller_annotation_only(self):
        """@Controller (not @RestController) 어노테이션만 있는 경우"""
        java_code = """
@Controller
public class MvcController {
    public String home() {
        return "index";
    }
}
"""
        tree = javalang.parse.parse(java_code)

        for path, node in tree.filter(javalang.tree.ClassDeclaration):
            if node.name == "MvcController":
                annotations = parse_annotations(node.annotations, "class")
                subtype = extract_sub_type("", node.name, annotations)
                assert subtype == "controller"

    def test_multiple_annotations(self):
        """여러 어노테이션이 있는 경우 우선순위 확인"""
        java_code = """
@RestController
@Service
@Component
@BxmCategory(logicalName="테스트", description="테스트")
public class MultiAnnotationClass {
}
"""
        tree = javalang.parse.parse(java_code)

        for path, node in tree.filter(javalang.tree.ClassDeclaration):
            if node.name == "MultiAnnotationClass":
                annotations = parse_annotations(node.annotations, "class")
                subtype = extract_sub_type("", node.name, annotations)
                # Controller가 최우선순위
                assert subtype == "controller"


if __name__ == "__main__":
    pytest.main([__file__, "-v"])
