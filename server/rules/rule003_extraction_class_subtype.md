# Class sub-type Extraction Rules for Class node

## 1. Controller class type 추출 규칙
- **sub-type 판단**: Class의 선언문의 상단에 **@RestController** 또는 **@Controller** annotaion으로 선언되어 있다. 
- **sub-type 값 저장**: DB(neo4j)의 Class 노드의 **'sub-type'** 속성에 **`controller`**을 저장한다
- sub-type 추출에 실패한 경우는 빈문자열("")을 리턴한다
- 예시 코드: 예시코드의 INBNtfbxPushEtcEst_CTR 클래스의 sub-type은  **`controller`** 임
```java
@RestController
@BxmCategory(logicalName="알림함.PUSH.기타설정.컨트롤러", description="PUSH 기타 설정 컨트롤러", author="90190264")
public class INBNtfbxPushEtcEst_CTR {
	private Logger logger= LoggerFactory.getLogger(getClass());
	
	/**
	 * 알림함.PUSH.기타설정.서비스
	 */
	private INBNtfbxPushEtcEst_SVC iNBNtfbxPushEtcEst_SVC;
	...
}
```

## 2. Service class type 추출 규칙
- **sub-type 판단**: Class의 선언문의 상단에 **@Service** annotaion으로 선언되어 있다. 
- **sub-type 값 저장**: DB(neo4j)의 Class 노드의 **'sub-type'** 속성에 **`service`**을 저장한다
- sub-type 추출에 실패한 경우는 빈문자열("")을 리턴한다
- 예시 코드: 예시코드의 INBNtfbxListInq_SVC 클래스의 sub-type은  **`service`** 임
```java
@Service
@BxmCategory(logicalName="알림함.목록.조회.서비스", description="통합알림함 PUSH, SMS, KAKAO 알림 목록을 조회 한다.")
public class INBNtfbxListInq_SVC {
	private Logger logger= LoggerFactory.getLogger(getClass());
	private Logger logger= LoggerFactory.getLogger(getClass());
	
	/**
	 * 통합.알림함.목록.조회.컴포넌트
	 */
	private INBItgNtfbxListInq_COM iNBItgNtfbxListInq_COM;
	
	...
}
```

## 3. Component class type 추출 규칙
- **sub-type 판단**: Class의 선언문의 상단에 **@Component** annotaion으로 선언되어 있다. 
- **sub-type 값 저장**: DB(neo4j)의 Class 노드의 **'sub-type'** 속성에 **`component`**을 저장한다
- sub-type 추출에 실패한 경우는 빈문자열("")을 리턴한다
- 예시 코드: 예시코드의 INBNtfbxListInq_SVC 클래스의 sub-type은  **`component`** 임
```java
@Component
@BxmCategory(logicalName="통합.알림함.목록.조회.컴포넌트", description="통합알림함 PUSH, SMS, KAKAO 알림 목록을 조회 한다.")
public class INBItgNtfbxListInq_COM {
	private Logger logger= LoggerFactory.getLogger(getClass());
	
	...
}
```

## 4. dbio class type 추출 규칙
- **sub-type 판단**: Class의 선언문의 상단에 **@BxmDataAccess** annotaion으로 선언되어 있다. 
- **sub-type 값 저장**: DB(neo4j)의 Class 노드의 **'sub-type'** 속성에 **`dbio`**을 저장한다
- sub-type 추출에 실패한 경우는 빈문자열("")을 리턴한다
- 예시 코드: 예시코드의 INBNtfbxListInq_SVC 클래스의 sub-type은  **`dbio`** 임
```java
@SuppressWarnings({ "all" })
@BxmDataAccess(datasource = "biz-ds")
@BxmCategory(logicalName="우리플러스지원이벤트상세001.DBM", description="", author="90190264")
public interface UCM_SUP_EVT_DTL001_DBM
{
	...
}
```

## 5. dto class type 추출 규칙

### 5-1. Annotation 기반 DTO 판별 (최우선)
- **sub-type 판단**: Class의 선언문의 상단에 **@XmlType**과 **@XmlRootElement**가 annotaion으로 선언되어 있다.
- **sub-type 값 저장**: DB(neo4j)의 Class 노드의 **'sub-type'** 속성에 **`dto`**을 저장한다
- sub-type 추출에 실패한 경우는 빈문자열("")을 리턴한다
- 예시 코드: 예시코드의 INBNtfbxListInqSelectCtgrClf_IDT 클래스의 sub-type은  **`dto`** 임
```java
@XmlType(propOrder={
	"ntfcDscd", "itcsno"
}, name="INBNtfbxListInqSelectCtgrClf_IDT")
@XmlRootElement(name="INBNtfbxListInqSelectCtgrClf_IDT")
@BxmCategory(logicalName="카테고리분류조회IDT", description="카테고리분류조회IDT")
public class INBNtfbxListInqSelectCtgrClf_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 956786407L;
	...
}
```

### 5-2. 클래스명 패턴 기반 DTO 판별 (Annotation 없을 때)
- **sub-type 판단**: 위 1~4번 및 5-1번 규칙에 해당하지 않고, Class명이 다음 접미사 중 하나로 끝나는 경우
  - **DTO, DODT, DIDT, ODT, IDT, VO, Entity, Grid**
- **sub-type 값 저장**: DB(neo4j)의 Class 노드의 **'sub-type'** 속성에 **`dto`**을 저장한다
- **우선순위**: Annotation 기반 판별(1~5-1번)이 클래스명 패턴보다 우선함
- **목적**: Annotation이 없어도 클래스명만으로 DTO 타입을 식별하여 성능 최적화 및 데이터 일관성 확보
- sub-type 추출에 실패한 경우는 6번 규칙(utility)을 적용한다

**예시 1: DTO 접미사**
```java
public class UserDTO {
	private String name;
	private String email;
	// annotation 없어도 클래스명 패턴으로 DTO 판별
}
```
→ sub-type: **`dto`**

**예시 2: DIDT/DODT/IDT/ODT 접미사 (Bxm Framework 표준)**
```java
public class INBNtfbxPushEtcEstSelectNtfcdpsEst_IDT {
	private String ntfcDscd;
	private String itcsno;
	// Input Data Transfer Object
}
```
→ sub-type: **`dto`**

**예시 3: VO (Value Object)**
```java
public class UserVO {
	private Long id;
	private String username;
}
```
→ sub-type: **`dto`**

**예시 4: Entity 접미사**
```java
public class UserEntity {
	private Long id;
	private String name;
	// JPA @Entity annotation 없어도 클래스명으로 판별
}
```
→ sub-type: **`dto`**

**예시 5: Grid 접미사**
```java
public class UserListGrid {
	private List<UserDTO> users;
	private int totalCount;
	// 그리드 데이터 전송용 DTO
}
```
→ sub-type: **`dto`**

### 5-3. 우선순위 예시

**케이스 1: @Service + DTO 접미사**
```java
@Service
public class UserDTOConverter {
	// Service annotation이 우선
}
```
→ sub-type: **`service`** (annotation 우선)

**케이스 2: Annotation 없음 + DTO 접미사**
```java
public class UserDTO {
	// 클래스명 패턴 적용
}
```
→ sub-type: **`dto`** (클래스명 패턴)

**케이스 3: @XmlType + Entity 접미사**
```java
@XmlType
@XmlRootElement
public class UserEntity {
	// Annotation 기반 판별 우선
}
```
→ sub-type: **`dto`** (annotation 기반)

## 6. 그 외 Class의 sub-type
- 상기 1번 ~ 5번의 class sub-type이 아닌 경우는 DB(neo4j)의 Class 노드의 **'sub-type'** 속성에 **`utility`**을 저장한다

**예시: 일반 유틸리티 클래스**
```java
public class StringUtils {
	public static boolean isEmpty(String str) {
		return str == null || str.trim().isEmpty();
	}
}
```
→ sub-type: **`utility`**