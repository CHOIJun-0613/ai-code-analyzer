# Description Extraction Rules for Objects(Classe, Method)

## 1. Class(클래스)의 description 추출 규칙
- **description 위치**: Class 선언 위치의 상단에 **@BxmCategory** annotation의 **description**의 문자열 값으로 기술되어 있음. 
- **description 값 저장**: DB(neo4j)의 **Class 노드의 'description' 속성에 저장**한다
- description 추출에 실패한 경우는 빈문자열("")을 리턴한다
- 예시 코드: 예시코드의 INBNtfbxPushEtcEst_CTR 클래스의 description은 **'PUSH 기타 설정 컨트롤러'** 임
```java
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

## 2. Method(메서드)의 description 추출 규칙
- **description 위치**: Method 선언 위치의 상단에 **@BxmCategory** annotation의 **description**의 문자열 값으로 기술되어 있음. 
- **description 값 저장**: DB(neo4j)의 **Method 노드의 'description' 속성에 저장**한다
- description 추출에 실패한 경우는 빈문자열("")을 리턴한다
- 예시 코드: 예시코드의 selectNtfcdpsEst() Method의의 description은 **'알림.수신설정.조회'** 임
```java
	/**
	 * 알림.수신설정.조회
	 *
	 * @return 
	 */
	@ApiOperation(
		value = "알림.수신설정.조회"
		, notes = ""
	)
	@PostMapping(value="/selectNtfcdpsEst")
	@BxmCategory(logicalName="알림.수신설정.조회", description="알림.수신설정.조회", author="90190264")
	public INBNtfbxPushEtcEstSelectNtfcdpsEst_ODT selectNtfcdpsEst(
			@ApiParam(value="input", example="") @RequestBody INBNtfbxPushEtcEstSelectNtfcdpsEst_IDT input
		)
	{
		/**
		* @BXMType GetBean
		*/
		iNBNtfbxPushEtcEst_SVC= WFApplicationContext.getBean(iNBNtfbxPushEtcEst_SVC, INBNtfbxPushEtcEst_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		INBNtfbxPushEtcEstSelectNtfcdpsEst_ODT output= new INBNtfbxPushEtcEstSelectNtfcdpsEst_ODT();
		/*
		 * @BXMType ServiceCall
		 * 알림함.PUSH.기타설정.서비스 알림.수신설정.조회
		 */
		output = iNBNtfbxPushEtcEst_SVC.selectNtfcdpsEst(input);
		
		return output;
	}
```


## 3. Class와 Method 외 노드들의 description은 빈문자열("")로 저장한다. 