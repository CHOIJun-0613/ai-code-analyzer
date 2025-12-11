# Class sub-type 추출 로직 추가(2025-11-05)

## 작업 개요

`rules/rule003_extraction_class_subtype.md` 규칙 파일을 기반으로 Java 클래스의 sub-type을 실시간으로 해석하여 자동 추출하는 기능을 구현했습니다.

## 작업 완료 항목

### 1. Class Sub-type 추출 모듈 생성 ✅

**파일**: `csa/parsers/java/class_subtype.py`

#### 주요 클래스 및 함수

```python
class ClassSubtypeExtractor:
    """Class sub-type 추출기 - rule003 기반"""

    def extract_class_subtype(self, annotations: List[Annotation]) -> str:
        """클래스의 sub-type 추출

        rule003에 따라 다음 순서로 sub-type 판별:
        1. @RestController 또는 @Controller -> "controller"
        2. @Service -> "service"
        3. @Component -> "component"
        4. @BxmDataAccess -> "dbio"
        5. @XmlType + @XmlRootElement -> "dto"
        6. 위 조건에 해당하지 않으면 -> "utility"
        """
```

**주요 함수**:
- `extract_class_subtype_from_annotations()`: annotation 기반 sub-type 추출
- `process_java_file_with_rule003()`: Java 파일 전체 처리

**특징**:
- 프로젝트별 인스턴스 캐싱 (성능 최적화)
- 전역 규칙 매니저와 통합
- annotation 이름 정규화 (전체 패키지명 처리)

### 2. RulesManager에 subtype 규칙 로딩 추가 ✅

**파일**: `csa/utils/rules_manager.py`

#### 추가된 메서드

```python
def _load_class_subtype_rules(self):
    """Class sub-type 추출 규칙들 로드"""
    rule_file = f"{self.rules_directory}/rule003_extraction_class_subtype.md"
    if os.path.exists(rule_file):
        self._class_subtype_rules["default"] = self._parse_class_subtype_rules(rule_file)

def _parse_class_subtype_rules(self, rule_file: str) -> Dict[str, Any]:
    """Class sub-type 규칙 파일 파싱"""
    # rule003에 정의된 고정 규칙 파싱

def get_class_subtype_rules(self, project_name: str) -> Dict[str, Any]:
    """프로젝트별 Class sub-type 규칙 반환"""
    self._ensure_rules_loaded()  # 첫 사용 시 로드
    return self._class_subtype_rules.get(project_name, self._class_subtype_rules.get("default", {}))
```

**변경 사항**:
- `__init__`: `_class_subtype_rules` 딕셔너리 추가
- `_load_all_rules()`: class subtype 규칙 로드 추가
- `reload_rules()`: class subtype 규칙 클리어 추가

**로그 출력 예시**:
```
규칙 로드 완료 - 논리명: 1개, Description: 1개, Class Subtype: 1개
```

### 3. Class 분석 로직에 subtype 추출 적용 ✅

**파일**: `csa/services/java_analysis/utils.py`

#### 기존 함수 업데이트

```python
def extract_sub_type(package_name: str, class_name: str, annotations: list[Annotation]) -> str:
    """
    rule003 기반으로 클래스의 sub_type을 추출합니다.

    rule003에 따라 다음 순서로 sub-type 판별:
    1. @RestController 또는 @Controller -> "controller"
    2. @Service -> "service"
    3. @Component -> "component"
    4. @BxmDataAccess -> "dbio"
    5. @XmlType + @XmlRootElement -> "dto"
    6. 위 조건에 해당하지 않으면 -> "utility"

    Args:
        package_name: 패키지명 (사용하지 않음, 하위 호환성을 위해 유지)
        class_name: 클래스명 (사용하지 않음, 하위 호환성을 위해 유지)
        annotations: 클래스 어노테이션 리스트

    Returns:
        sub_type (controller, service, component, dbio, dto, utility)
    """
    # rule003 기반 subtype 추출 함수 사용
    from csa.parsers.java.class_subtype import extract_class_subtype_from_annotations

    return extract_class_subtype_from_annotations(annotations, project_name=None)
```

**변경 내용**:
- 기존 패키지명/클래스명 기반 추측 로직 제거
- rule003 기반 annotation 전용 판별로 변경
- 함수 시그니처 유지 (하위 호환성 보장)

**영향 범위**:
- `csa/services/java_analysis/project.py`: 381번째 줄, 790번째 줄
- 기존 호출 코드 수정 불필요

### 4. 테스트 실행 및 검증 ✅

#### Unit Tests

**파일**: `tests/unit/test_class_subtype.py`

**테스트 케이스** (14개):
```python
class TestClassSubtypeExtraction:
    def test_controller_with_restcontroller()       # ✅ PASSED
    def test_controller_with_controller()           # ✅ PASSED
    def test_service_annotation()                   # ✅ PASSED
    def test_component_annotation()                 # ✅ PASSED
    def test_dbio_annotation()                      # ✅ PASSED
    def test_dto_with_xml_annotations()             # ✅ PASSED
    def test_dto_missing_xmlrootelemt()             # ✅ PASSED
    def test_utility_no_annotations()               # ✅ PASSED
    def test_utility_with_other_annotations()       # ✅ PASSED
    def test_priority_controller_over_component()   # ✅ PASSED
    def test_priority_service_over_component()      # ✅ PASSED
    def test_annotation_with_full_package_name()    # ✅ PASSED
    def test_case_sensitive_annotation_names()      # ✅ PASSED

class TestRulesPriority:
    def test_priority_order()                       # ✅ PASSED
```

**실행 결과**:
```
============================= test session starts =============================
platform win32 -- Python 3.13.3, pytest-8.4.2, pluggy-1.6.0
collected 14 items

tests/unit/test_class_subtype.py::TestClassSubtypeExtraction::test_controller_with_restcontroller PASSED [  7%]
tests/unit/test_class_subtype.py::TestClassSubtypeExtraction::test_controller_with_controller PASSED [ 14%]
tests/unit/test_class_subtype.py::TestClassSubtypeExtraction::test_service_annotation PASSED [ 21%]
tests/unit/test_class_subtype.py::TestClassSubtypeExtraction::test_component_annotation PASSED [ 28%]
tests/unit/test_class_subtype.py::TestClassSubtypeExtraction::test_dbio_annotation PASSED [ 35%]
tests/unit/test_class_subtype.py::TestClassSubtypeExtraction::test_dto_with_xml_annotations PASSED [ 42%]
tests/unit/test_class_subtype.py::TestClassSubtypeExtraction::test_dto_missing_xmlrootelemt PASSED [ 50%]
tests/unit/test_class_subtype.py::TestClassSubtypeExtraction::test_utility_no_annotations PASSED [ 57%]
tests/unit/test_class_subtype.py::TestClassSubtypeExtraction::test_utility_with_other_annotations PASSED [ 64%]
tests/unit/test_class_subtype.py::TestClassSubtypeExtraction::test_priority_controller_over_component PASSED [ 71%]
tests/unit/test_class_subtype.py::TestClassSubtypeExtraction::test_priority_service_over_component PASSED [ 78%]
tests/unit/test_class_subtype.py::TestClassSubtypeExtraction::test_annotation_with_full_package_name PASSED [ 85%]
tests/unit/test_class_subtype.py::TestClassSubtypeExtraction::test_case_sensitive_annotation_names PASSED [ 92%]
tests/unit/test_class_subtype.py::TestRulesPriority::test_priority_order PASSED [100%]

============================= 14 passed in 3.59s ==============================
```

#### Integration Tests

**파일**: `tests/integration/test_class_subtype_integration.py`

**테스트 케이스** (8개):
```python
class TestClassSubtypeIntegration:
    def test_controller_class_parsing()             # ✅ PASSED
    def test_service_class_parsing()                # ✅ PASSED
    def test_component_class_parsing()              # ✅ PASSED
    def test_dbio_class_parsing()                   # ✅ PASSED
    def test_dto_class_parsing()                    # ✅ PASSED
    def test_utility_class_parsing()                # ✅ PASSED
    def test_controller_annotation_only()           # ✅ PASSED
    def test_multiple_annotations()                 # ✅ PASSED
```

**실행 결과**:
```
============================= test session starts =============================
platform win32 -- Python 3.13.3, pytest-8.4.2, pluggy-1.6.0
collected 8 items

tests/integration/test_class_subtype_integration.py::TestClassSubtypeIntegration::test_controller_class_parsing PASSED [ 12%]
tests/integration/test_class_subtype_integration.py::TestClassSubtypeIntegration::test_service_class_parsing PASSED [ 25%]
tests/integration/test_class_subtype_integration.py::TestClassSubtypeIntegration::test_component_class_parsing PASSED [ 37%]
tests/integration/test_class_subtype_integration.py::TestClassSubtypeIntegration::test_dbio_class_parsing PASSED [ 50%]
tests/integration/test_class_subtype_integration.py::TestClassSubtypeIntegration::test_dto_class_parsing PASSED [ 62%]
tests/integration/test_class_subtype_integration.py::TestClassSubtypeIntegration::test_utility_class_parsing PASSED [ 75%]
tests/integration/test_class_subtype_integration.py::TestClassSubtypeIntegration::test_controller_annotation_only PASSED [ 87%]
tests/integration/test_class_subtype_integration.py::TestClassSubtypeIntegration::test_multiple_annotations PASSED [100%]

============================== 8 passed in 4.30s ==============================
```

**총 테스트**: 22개 (14 + 8)
**통과율**: 100% ✅

## Rule003 적용 규칙

| 우선순위 | Annotation | Sub-type | 설명 |
|---------|-----------|----------|------|
| 1 | `@RestController` 또는 `@Controller` | `controller` | Controller 클래스 |
| 2 | `@Service` | `service` | Service 클래스 |
| 3 | `@Component` | `component` | Component 클래스 |
| 4 | `@BxmDataAccess` | `dbio` | DBM (Data Access) 클래스 |
| 5 | `@XmlType` + `@XmlRootElement` | `dto` | DTO 클래스 (두 annotation 모두 필요) |
| 6 | (위 조건 미충족 시) | `utility` | 기본값 |

## 사용 예시

### 1. Controller 클래스

```java
@RestController
@BxmCategory(logicalName="알림함.PUSH.기타설정.컨트롤러", description="PUSH 기타 설정 컨트롤러")
public class INBNtfbxPushEtcEst_CTR {
    private Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * 알림함.PUSH.기타설정.서비스
     */
    private INBNtfbxPushEtcEst_SVC iNBNtfbxPushEtcEst_SVC;
}
```

→ `subtype`: **"controller"**

### 2. Service 클래스

```java
@Service
@BxmCategory(logicalName="알림함.목록.조회.서비스", description="통합알림함 PUSH, SMS, KAKAO 알림 목록을 조회 한다.")
public class INBNtfbxListInq_SVC {
    private Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * 통합.알림함.목록.조회.컴포넌트
     */
    private INBItgNtfbxListInq_COM iNBItgNtfbxListInq_COM;
}
```

→ `subtype`: **"service"**

### 3. Component 클래스

```java
@Component
@BxmCategory(logicalName="통합.알림함.목록.조회.컴포넌트", description="통합알림함 PUSH, SMS, KAKAO 알림 목록을 조회 한다.")
public class INBItgNtfbxListInq_COM {
    private Logger logger = LoggerFactory.getLogger(getClass());
}
```

→ `subtype`: **"component"**

### 4. DBM (dbio) 클래스

```java
@SuppressWarnings({ "all" })
@BxmDataAccess(datasource = "biz-ds")
@BxmCategory(logicalName="우리플러스지원이벤트상세001.DBM", description="", author="90190264")
public interface UCM_SUP_EVT_DTL001_DBM {
    List<Map<String, Object>> selectList(Map<String, Object> params);
}
```

→ `subtype`: **"dbio"**

### 5. DTO 클래스

```java
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
```

→ `subtype`: **"dto"**

### 6. Utility 클래스 (기본값)

```java
public class StringUtils {
    public static boolean isEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }
}
```

→ `subtype`: **"utility"**

## 우선순위 규칙

여러 annotation이 동시에 있는 경우 우선순위에 따라 판별합니다:

```java
@RestController  // 우선순위 1
@Service         // 우선순위 2
@Component       // 우선순위 3
public class MultiAnnotationClass {
    // ...
}
```

→ `subtype`: **"controller"** (최우선순위)

## 사용 방법

### 분석 실행

```bash
# 전체 재분석 (sub-type 자동 추출)
python -m csa.cli.main analyze --all-objects --clean --project-name myproject

# Java만 재분석
python -m csa.cli.main analyze --java-object --clean --project-name myproject
```

### Neo4j 데이터 확인

```cypher
# 클래스별 sub-type 확인
MATCH (c:Class)
RETURN c.name, c.subtype
ORDER BY c.subtype

# 특정 클래스의 sub-type 확인
MATCH (c:Class {name: "INBNtfbxPushEtcEst_CTR", project_name: "car-center-devlab"})
RETURN c.subtype
// 결과: "controller"

# sub-type별 클래스 개수
MATCH (c:Class {project_name: "car-center-devlab"})
RETURN c.subtype, count(c) as count
ORDER BY count DESC
```

### 프로그래밍 방식 사용

```python
from csa.parsers.java.class_subtype import extract_class_subtype_from_annotations
from csa.models.graph_entities import Annotation

annotations = [
    Annotation(name="RestController", parameters={}),
    Annotation(name="BxmCategory", parameters={"logicalName": "테스트컨트롤러"})
]

subtype = extract_class_subtype_from_annotations(annotations)
# 결과: "controller"
```

## 구현 아키�ecture

```
규칙 파일 (rule003_extraction_class_subtype.md)
    ↓ 로드
RulesManager (_parse_class_subtype_rules)
    ↓ 캐싱
ClassSubtypeExtractor (extract_class_subtype)
    ↓ 호출
extract_sub_type (utils.py)
    ↓ 사용
project.py (클래스 분석 시)
    ↓ 저장
Neo4j Class 노드 (subtype 속성)
```

## 주요 특징

### 1. 실시간 해석 및 적용
- 분석 시점에 rule003 규칙을 자동으로 로드
- 규칙 파일 수정 시 다음 분석부터 자동 반영

### 2. 성능 최적화
- 전역 인스턴스 캐싱 (`ClassSubtypeExtractor._instances`)
- 규칙 파일 한 번만 로드 (`RulesManager._ensure_rules_loaded()`)
- 프로젝트별 규칙 캐싱

### 3. 하위 호환성 보장
- 기존 `extract_sub_type` 함수 시그니처 유지
- 기존 호출 코드 수정 불필요
- 패키지명/클래스명 파라미터 유지 (미사용)

### 4. 확장 가능성
- rule003 파일 수정만으로 새로운 규칙 추가
- 프로젝트별 커스텀 규칙 지원 가능
- annotation 조합 조건 확장 가능

### 5. 검증 완료
- 22개 테스트 케이스 모두 통과
- Unit Test: 14개
- Integration Test: 8개

## 파일 구조

```
lang-parser-bxm5/
├── rules/
│   └── rule003_extraction_class_subtype.md    # 규칙 정의
├── csa/
│   ├── parsers/
│   │   └── java/
│   │       └── class_subtype.py               # 추출 모듈 (신규)
│   ├── services/
│   │   └── java_analysis/
│   │       └── utils.py                       # extract_sub_type 함수 (수정)
│   └── utils/
│       └── rules_manager.py                   # 규칙 관리자 (수정)
├── tests/
│   ├── unit/
│   │   └── test_class_subtype.py              # 단위 테스트 (신규)
│   └── integration/
│       └── test_class_subtype_integration.py  # 통합 테스트 (신규)
└── docs/
    ├── rule003_class_subtype_extraction.md    # 사용 가이드 (신규)
    └── Class sub-type 추출 로직 추가(2025-11-05).md  # 작업 문서 (신규)
```

## 기존 로직과의 차이점

### 기존 로직 (Before)

```python
def extract_sub_type(package_name: str, class_name: str, annotations: list[Annotation]) -> str:
    # 1. Annotation 기반 판단
    # 2. 패키지명 기반 판단
    # 3. 클래스명 기반 판단 (fallback)
    # 4. 빈 문자열 반환 (매칭 실패 시)
```

**문제점**:
- 패키지명/클래스명 기반 추측이 부정확
- Spring 표준 annotation만 지원
- Bxm Framework 전용 annotation 미지원
- 규칙 변경 시 코드 수정 필요

### 새로운 로직 (After)

```python
def extract_sub_type(package_name: str, class_name: str, annotations: list[Annotation]) -> str:
    # rule003 기반 annotation 전용 판별
    from csa.parsers.java.class_subtype import extract_class_subtype_from_annotations
    return extract_class_subtype_from_annotations(annotations, project_name=None)
```

**개선 사항**:
- Annotation만으로 정확한 판별
- Bxm Framework annotation 지원 (`@BxmDataAccess`)
- 규칙 파일로 외부화
- 패키지명/클래스명 의존성 제거
- 기본값 "utility" 반환 (빈 문자열 대신)

## 주의사항

### 1. DTO 판별 조건
`@XmlType`과 `@XmlRootElement` **모두** 필요:

```java
@XmlType(propOrder={"field1"})           // ❌ dto 아님 (utility)
@XmlRootElement(name="TestDTO")          // ❌ dto 아님 (utility)

@XmlType(propOrder={"field1"})
@XmlRootElement(name="TestDTO")          // ✅ dto 맞음
```

### 2. Annotation 우선순위
여러 annotation이 있을 때 우선순위 적용:

```java
@Service      // 우선순위 2
@Component    // 우선순위 3
```

→ `subtype`: **"service"** (우선순위가 높은 것 선택)

### 3. Annotation 정규화
전체 패키지명이 포함된 annotation도 정상 처리:

```java
@org.springframework.stereotype.Service  // ✅ "service"로 인식
@Service                                 // ✅ "service"로 인식
```

### 4. 대소문자 구분
Annotation 이름은 대소문자를 구분:

```java
@RestController  // ✅ "controller"
@restcontroller  // ❌ "utility" (인식 안 됨)
```

### 5. 기본값 처리
매칭되는 annotation이 없으면 "utility" 반환:

```java
@Deprecated
public class SomeClass {
    // ...
}
```

→ `subtype`: **"utility"**

## 규칙 파일 수정

`rules/rule003_extraction_class_subtype.md` 파일을 수정하여 규칙을 변경할 수 있습니다:

```markdown
## 7. Repository class type 추출 규칙
- **sub-type 판단**: Class의 선언문의 상단에 **@Repository** annotaion으로 선언되어 있다.
- **sub-type 값 저장**: DB(neo4j)의 Class 노드의 **'sub-type'** 속성에 **`repository`**을 저장한다
```

규칙 변경 후 재분석:

```bash
python -m csa.cli.main analyze --all-objects --clean --project-name myproject
```

## 문제 해결

### Sub-type이 잘못 추출되는 경우

1. **Annotation 확인**:
   ```cypher
   MATCH (c:Class {name: "YourClassName"})
   RETURN c.name, [a IN c.annotations | a.name]
   ```

2. **로그 확인**:
   ```bash
   tail -f logs/analyze.log | grep "sub-type"
   ```

3. **규칙 재로드**:
   ```python
   from csa.utils.rules_manager import rules_manager
   rules_manager.reload_rules()
   ```

### 기본값 "utility"로 추출되는 경우

- rule003에 정의된 annotation이 없는 경우 정상 동작
- 필요 시 `rules/rule003_extraction_class_subtype.md` 파일에 새로운 규칙 추가
- `csa/parsers/java/class_subtype.py`의 `extract_class_subtype()` 함수 수정

### 테스트 실패 시

```bash
# 전체 테스트 재실행
pytest tests/unit/test_class_subtype.py -v
pytest tests/integration/test_class_subtype_integration.py -v

# 특정 테스트만 실행
pytest tests/unit/test_class_subtype.py::TestClassSubtypeExtraction::test_controller_with_restcontroller -v
```

## 향후 확장 계획

### 1. 프로젝트별 커스텀 규칙
```
rules/{project_name}_class_subtype_rules.md
```

### 2. 복합 조건 지원
```python
# OR 조건
"annotations": ["Repository", "Mapper"]

# AND 조건
"annotations": ["XmlType", "XmlRootElement"],
"condition": "all"

# NOT 조건
"annotations": ["Component"],
"exclude": ["RestController", "Service"]
```

### 3. 클래스명 패턴 매칭
```python
"pattern": "*Controller",
"subtype": "controller"
```

### 4. 상속 기반 판별
```python
"extends": ["BaseEntity"],
"subtype": "entity"
```

### 5. 메서드 기반 판별
```python
"has_method": ["@RequestMapping"],
"subtype": "controller"
```

## 관련 문서

- [Rule003 사용 가이드](rule003_class_subtype_extraction.md)
- [Rule001 논리명 추출](../rules/rule001_extraction_logical_name.md)
- [Rule002 설명 추출](../rules/rule002_extraction_description.md)
- [Rule003 클래스 sub-type 추출](../rules/rule003_extraction_class_subtype.md)
- [CLAUDE.md - 프로젝트 개요](../CLAUDE.md)

## 작업 완료 체크리스트

- [x] Class sub-type 추출 모듈 생성 (`csa/parsers/java/class_subtype.py`)
- [x] RulesManager에 subtype 규칙 로딩 추가 (`csa/utils/rules_manager.py`)
- [x] Class 분석 로직에 subtype 추출 적용 (`csa/services/java_analysis/utils.py`)
- [x] 단위 테스트 작성 및 실행 (`tests/unit/test_class_subtype.py`) - 14개 통과
- [x] 통합 테스트 작성 및 실행 (`tests/integration/test_class_subtype_integration.py`) - 8개 통과
- [x] 사용 가이드 문서 작성 (`docs/rule003_class_subtype_extraction.md`)
- [x] 작업 내역 문서 작성 (`docs/Class sub-type 추출 로직 추가(2025-11-05).md`)

## 작업 완료 일자

**2025년 11월 5일**

---

**작성자**: Claude Code
**검증**: 22개 테스트 모두 통과 ✅
