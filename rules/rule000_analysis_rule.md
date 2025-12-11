### Bxm Framework 특징
- SpringBoot framework을 기반으로 구성한 Application Framework임
- SpringBoot acthitecture를 준용한다.

### 분석대상 파일 확장자
- 클래스: *.java
- MyBatisMapper(BxmFramework에서는 DBM 또는 DBIO로 호칭): *.dbio

### **BXM Framework 특화 annotation**
- `@BxmCategory`: Bxm Framework에서 관리하는 컴포넌트 식별 annotation
  - **용도**: 클래스와 메서드의 논리명(logicalName)과 설명(description) 정의
  - **Bean 인식**: @BxmCategory가 있는 클래스는 Spring Bean으로 자동 인식됨
  - **저장 위치**: Class 노드의 `bxm_category` 속성에 logicalName 저장

- `@BxmDataAccess`: Bxm Framework 컴포넌트에서 Database access하기 위한 Datasource name
  - **용도**: 컴포넌트가 사용하는 데이터베이스 소스 지정
  - **저장 위치**: Bean 노드의 `bxm_datasource` 속성에 저장

- `@BXMType`: Bxm Framework에서 사용하는 설명 코멘트
  - **용도**: 클래스와 메서드의 상세 설명 제공
  - **저장 위치**: Class/Method 노드의 `description` 속성에 저장

- `@BxmOmm_Field`: Bxm Framework의 DTO 필드 속성 표시
  - **용도**: DTO 필드의 추가 속성 정의
  - **저장 위치**: Field 노드의 `bxm_field_attrs` 속성에 저장

### 표준 Spring Boot annotation
- `@Transactional`: Transaction을 처리할 때 사용(Transaction 분리 시 사용)
- `@RestController`: Controller 클래스로 기능함
- `@RequestMapping`: Controller 클래스의 URL 경로 매핑정보
- `@PostMapping`: HTTP POST 요청 매핑
- `@Service`: Service 클래스로 기능함
- `@Component`: Beans 클래스로 기능함

### CSA Bxm Framework 지원 기능

#### 1. `.dbio` 파일 파싱
- MyBatis XML 매퍼와 동일한 형식의 `.dbio` 파일 자동 인식 및 파싱
- SQL 문, ResultMap, 파라미터 등 완전한 분석 지원

#### 2. Bxm 어노테이션 인식
- 모든 Bxm 특화 어노테이션을 `"bxm"` 카테고리로 분류
- Neo4j 노드에 Bxm 관련 속성 자동 저장

#### 3. Bean 자동 인식
- `@BxmCategory` 어노테이션이 있는 클래스를 Spring Bean으로 자동 인식
- `@BxmDataAccess` 값을 Bean의 datasource 정보로 저장

#### 4. 논리명/설명 추출
- `@BxmCategory`의 logicalName을 Class/Method의 logical_name으로 추출
- `@BXMType`의 description을 Class/Method의 description으로 추출

### 분석 예시

```java
@Component
@BxmCategory(logicalName="통합.알림함.목록.조회.컴포넌트", description="통합알림함 PUSH, SMS, KAKAO 알림 목록을 조회 한다.")
@BxmDataAccess("primaryDataSource")
public class INBItgNtfbxListInq_COM {

    @BxmOmm_Field(type="string", maxLength=100)
    private String notificationId;

    @BxmCategory(logicalName="PUSH.알림.목록.조회", description="PUSH 알림 목록을 조회한다.")
    @BXMType(description="사용자 ID로 PUSH 알림 목록 조회")
    public List<Notification> getPushNotifications(String userId) {
        // ...
    }
}
```

**분석 결과**:
- **Class 노드**:
  - name: `INBItgNtfbxListInq_COM`
  - logical_name: `통합.알림함.목록.조회.컴포넌트`
  - description: `통합알림함 PUSH, SMS, KAKAO 알림 목록을 조회 한다.`
  - bxm_category: `통합.알림함.목록.조회.컴포넌트`

- **Bean 노드**:
  - class_name: `INBItgNtfbxListInq_COM`
  - bxm_datasource: `primaryDataSource`

- **Field 노드**:
  - name: `notificationId`
  - bxm_field_attrs: `{"type": "string", "maxLength": 100}`

- **Method 노드**:
  - name: `getPushNotifications`
  - logical_name: `PUSH.알림.목록.조회`
  - description: `사용자 ID로 PUSH 알림 목록 조회` (from @BXMType)