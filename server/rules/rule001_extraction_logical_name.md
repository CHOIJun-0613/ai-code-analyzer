# Logical Name Extraction Rules for Objects(Classe, Method, Fields, MyBatisMapper, SqlStatement)

## 1. Class(클래스)의 logical name(논리명) 추출 규칙
- **논리명(logical name) 위치**: Class 선언 위치의 상단에 @BxmCategory 어노테이션 표기 다음 괄호("(...)") 안에 logicalName="{local_name}"으로 표기되어 있음
- **논리명 저장**: DB(neo4j)의 **Class 노드의 'logical_name' 속성에 저장**한다
- 논리명(local_name) 추출에 실패한 경우는 빈문자열("")을 리턴한다
- 예시 코드: 예시코드의 INBItgNtfbxListInq_COM클래스의 logical name(논리명)은 **'통합.알림함.목록.조회.컴포넌트'** 임
```java
    @Component
    @BxmCategory(logicalName="통합.알림함.목록.조회.컴포넌트", description="통합알림함 PUSH, SMS, KAKAO 알림 목록을 조회 한다.")
    public class INBItgNtfbxListInq_COM {
	    private Logger logger= LoggerFactory.getLogger(getClass());
	    ...
    }
```

## 2. Method(메서드)의 논리명 추출 규칙
- **논리명(logical name) 위치**: Method 선언 위치의 상단에  @BxmCategory 어노테이션 표기 다음 괄호("(...)") 안에 logicalName="{local_name}"으로 표기되어 있음
- **논리명 저장**: DB(neo4j)의 **Method 노드의 'logical_name' 속성에 저장**한다
- 논리명(local_name) 추출에 실패한 경우는 빈문자열("")을 리턴한다
- 예시 코드: 예시코드의 selectPushNtfcLIst() Method의 logical name(논리명)은 **'PUSH.알림.목록.조회'** 임
```java
	@BxmCategory(logicalName="PUSH.알림.목록.조회", description="PUSH 알림 목록을 조회한다.", author="90190264")
	public PushNtfcLIstInq_DODT selectPushNtfcLIst(ItgNtfcListInq_DIDT input) throws WFApplicationException, IOException  {
		/**
		 * @BXMType VariableDeclaration
		 */
		PushNtfcLIstInq_DODT output = new PushNtfcLIstInq_DODT();
        ...
        return output;
    }
```


## 3. MyBatis Mapper(확장자: *.dbio)의 논리명 추출 규칙
- **논리명(logical name) 위치**: `<mapper>` 태그의 `namespace` 속성 위의 주석
- **논리명 저장**: DB(neo4j)의 **MyBatisMapper 노드의 'logical_name' 속성에 저장**한다
- 논리명(local_name) 추출에 실패한 경우는 빈문자열("")을 리턴한다
- **형식**: `<!-- {logical_name} -->`
- 예시 코드: 예시코드의 UserMapper의 logical name(논리명)은 **'사용자 데이터 매퍼'** 임
```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd">

<!-- 사용자 데이터 매퍼 -->
<mapper namespace="ccom.skbank.sml.fns.inb.dbm.UCM_OWN_PUSH_NOTI001_DBM">
    ...
</mapper>
```

## 4. SQL 문의 논리명 추출 규칙
- **논리명(logical name) 위치**: 각 SQL 태그(`<select>`, `<insert>`, `<update>`, `<delete>`) 아래와 SQL문 위의 주석
- **논리명 저장**: DB(neo4j)의 **SqlStatement 노드의 'logical_name' 속성에 저장**한다
- 논리명(local_name) 추출에 실패한 경우는 빈문자열("")을 리턴한다
- **형식**: `/* 나만의 PUSH 알림 조회 (Select) */`
- 예시 코드: 예시코드의 selectMyNtfcList SQL의 logical name(논리명)은 **'나만의 PUSH 알림 조회 (Select)'** 임
- **주의사항**: 
    1. "/* wpads130_17i.jsp.003 */"와 같은 주석이 포함될 수 있는데 이런 패턴은 무시하고 logical_name에 빈문자열("")을 저장한다.
    2. /* wpads130_17i.jsp.002 - 나만의 PUSH 알림 등록 (Insert) */ 이런 패턴도 존재하는데, 이경우 logical_name은 "나만의 PUSH 알림 등록 (Insert)" 이다
```xml
    /* 나만의 PUSH 알림 조회 (Select) */
    SELECT SEQNO				AS seqno
            , TR_NOTI_YN		AS trNotiYn
            , REPLACE(ALIMI_TYPE, ' ', '')			AS alimiType
            , NTFC_TXT			AS ntfcTxt
            , NTFC_FM				AS ntfcFm
            , MONTH				AS month
            , DAY						AS day
            , WEEKDAY_NM	AS weekdayNm
            , ALIMI_TM 			AS alimiTm
            , RGS_DH				AS rgsDh
            , ETC1					AS etc1
            , NOTI_TMP_TYP	AS notiTmpTyp
    FROM UCM_OWN_PUSH_NOTI
    WHERE ITCSNO = #{itcsno}
    AND ETC1 IS NULL&#13;
    </select>
```

## 5. Field(변수) 논리명 추출 규칙
- **논리명(logical name) 위치**: 전역 변수(Field) 선언 위치의 상단에 코멘트로 기술되어 있음. '/**\n * {local name}\n */'의 형태로 기술되어 있음
- **논리명 저장**: DB(neo4j)의 **Field 노드의 'logical_name' 속성에 저장**한다
- 논리명(local_name) 추출에 실패한 경우는 빈문자열("")을 리턴한다
- 예시 코드: 예시코드의 iNBNtfbxPushEtcEst_SVC 변수의 logical name(논리명)은 **'알림함.PUSH.기타설정.서비스'** 임
```java
	/**
	 * 알림함.PUSH.기타설정.서비스
	 */
	private INBNtfbxPushEtcEst_SVC iNBNtfbxPushEtcEst_SVC;
```