# Rule003: Class Sub-type Extraction

## 개요

`rule003_extraction_class_subtype.md` 규칙 파일을 기반으로 Java 클래스의 sub-type을 자동으로 추출하는 기능입니다.

## 구현 위치

- **규칙 파일**: `rules/rule003_extraction_class_subtype.md`
- **추출 모듈**: `csa/parsers/java/class_subtype.py`
- **규칙 관리자**: `csa/utils/rules_manager.py`
- **적용 위치**: `csa/services/java_analysis/utils.py` (extract_sub_type 함수)

## 동작 원리

### 1. 규칙 로딩

애플리케이션 시작 시 `RulesManager`가 `rule003_extraction_class_subtype.md` 파일을 로드하여 메모리에 캐싱합니다.

```python
from csa.utils.rules_manager import rules_manager

# 규칙 자동 로드 (첫 사용 시)
rules = rules_manager.get_class_subtype_rules(project_name)
```

### 2. Sub-type 추출 규칙

rule003에 따라 다음 순서로 sub-type을 판별합니다:

| 우선순위 | Annotation | Sub-type | 설명 |
|---------|-----------|----------|------|
| 1 | `@RestController` 또는 `@Controller` | `controller` | Controller 클래스 |
| 2 | `@Service` | `service` | Service 클래스 |
| 3 | `@Component` | `component` | Component 클래스 |
| 4 | `@BxmDataAccess` | `dbio` | DBM (Data Access) 클래스 |
| 5 | `@XmlType` + `@XmlRootElement` | `dto` | DTO 클래스 (두 annotation 모두 필요) |
| 6 | (위 조건 미충족 시) | `utility` | 기본값 |

### 3. 실시간 추출

Java 파일 분석 시 자동으로 sub-type이 추출되어 Neo4j Class 노드의 `subtype` 속성에 저장됩니다.

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

## 사용 예시

### 1. Controller 클래스

```java
@RestController
@BxmCategory(logicalName="알림함.PUSH.기타설정.컨트롤러", description="PUSH 기타 설정 컨트롤러")
public class INBNtfbxPushEtcEst_CTR {
    // ...
}
```

→ `subtype`: **"controller"**

### 2. Service 클래스

```java
@Service
@BxmCategory(logicalName="알림함.목록.조회.서비스", description="알림 목록 조회 서비스")
public class INBNtfbxListInq_SVC {
    // ...
}
```

→ `subtype`: **"service"**

### 3. Component 클래스

```java
@Component
@BxmCategory(logicalName="통합.알림함.목록.조회.컴포넌트", description="통합 알림함 컴포넌트")
public class INBItgNtfbxListInq_COM {
    // ...
}
```

→ `subtype`: **"component"**

### 4. DBM (dbio) 클래스

```java
@BxmDataAccess(datasource = "biz-ds")
@BxmCategory(logicalName="우리플러스지원이벤트상세001.DBM", description="")
public interface UCM_SUP_EVT_DTL001_DBM {
    // ...
}
```

→ `subtype`: **"dbio"**

### 5. DTO 클래스

```java
@XmlType(propOrder={"ntfcDscd", "itcsno"}, name="INBNtfbxListInqSelectCtgrClf_IDT")
@XmlRootElement(name="INBNtfbxListInqSelectCtgrClf_IDT")
@BxmCategory(logicalName="카테고리분류조회IDT", description="카테고리분류조회IDT")
public class INBNtfbxListInqSelectCtgrClf_IDT {
    // ...
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

## Neo4j 데이터 저장

추출된 sub-type은 Class 노드의 `subtype` 속성에 저장됩니다:

```cypher
MATCH (c:Class {name: "INBNtfbxPushEtcEst_CTR", project_name: "car-center-devlab"})
RETURN c.subtype
// 결과: "controller"
```

## 규칙 파일 수정

`rules/rule003_extraction_class_subtype.md` 파일을 수정하여 규칙을 변경할 수 있습니다:

```bash
# 규칙 파일 수정 후 재로드
python -m csa.cli.main analyze --all-objects --clean --project-name myproject
```

규칙 변경 사항은 다음 분석부터 자동으로 적용됩니다.

## 테스트

### Unit Tests

```bash
pytest tests/unit/test_class_subtype.py -v
```

14개 테스트 케이스:
- Controller, Service, Component, DBM, DTO, Utility 타입별 추출
- 우선순위 규칙 검증
- Annotation 정규화 (전체 패키지명 처리)

### Integration Tests

```bash
pytest tests/integration/test_class_subtype_integration.py -v
```

8개 통합 테스트:
- 실제 Java 소스코드 파싱 및 sub-type 추출
- 다중 annotation 우선순위 검증

## 기존 코드와의 호환성

기존 `extract_sub_type` 함수는 rule003 기반으로 내부 구현이 변경되었지만, 함수 시그니처는 그대로 유지되어 **하위 호환성**이 보장됩니다:

```python
# 기존 코드 (변경 없이 사용 가능)
from csa.services.java_analysis.utils import extract_sub_type

subtype = extract_sub_type(package_name, class_name, annotations)
```

내부적으로 rule003 기반 추출 함수를 호출하여 더 정확한 결과를 반환합니다.

## 장점

1. **규칙 기반 접근**: Markdown 파일로 규칙을 명확히 정의하고 관리
2. **실시간 적용**: 분석 시점에 최신 규칙을 자동으로 적용
3. **성능 최적화**: 규칙을 메모리에 캐싱하여 반복 로드 방지
4. **확장 가능**: 새로운 sub-type 추가 시 규칙 파일만 수정
5. **테스트 커버리지**: 22개 테스트로 모든 시나리오 검증

## 주의사항

1. **DTO 판별**: `@XmlType`과 `@XmlRootElement` **모두** 필요
2. **우선순위**: Controller > Service > Component > DBM > DTO > Utility
3. **대소문자**: Annotation 이름은 대소문자를 구분 (예: `RestController` ≠ `restcontroller`)
4. **패키지명 무시**: 기존 버전과 달리 annotation만으로 판별 (더 정확함)

## 문제 해결

### Sub-type이 잘못 추출되는 경우

1. 클래스의 annotation 확인:
   ```cypher
   MATCH (c:Class {name: "YourClassName"})
   RETURN c.annotations
   ```

2. 로그 확인:
   ```bash
   tail -f logs/analyze.log
   ```

3. 규칙 재로드:
   ```python
   from csa.utils.rules_manager import rules_manager
   rules_manager.reload_rules()
   ```

### 기본값 "utility"로 추출되는 경우

- rule003에 정의된 annotation이 없는 경우 정상 동작
- 필요 시 `rules/rule003_extraction_class_subtype.md` 파일에 새로운 규칙 추가

## 향후 확장

1. **프로젝트별 규칙**: `{project_name}_class_subtype_rules.md` 지원
2. **커스텀 sub-type**: 사용자 정의 sub-type 추가
3. **복합 조건**: AND/OR 조건으로 복잡한 규칙 지원
4. **클래스명 패턴**: Annotation 외에 클래스명 패턴 매칭 지원
