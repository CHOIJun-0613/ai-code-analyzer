package com.skbank.sml.fns.shr.com;

import bxm.common.annotaion.BxmCategory;
import net.minidev.json.JSONObject;
import fwk.skbank.asis.adaptor.dto.request.WFEmpty_ODT;
import fwk.skbank.asis.adaptor.dto.request.WFInterfaceCfg;
import fwk.skbank.asis.adaptor.dto.response.WFInfResponse;
import fwk.skbank.asis.adaptor.header.request.custom.WFCustomTrnHeader;
import fwk.skbank.online.context.WFApplicationContext;
import fwk.skbank.online.exception.app.WFApplicationException;
import fwk.skbank.online.util.WFStringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.skbank.sml.cmm.shr.com.SHRCMMInterfaceCfg_COM;
import com.skbank.sml.cmm.shr.com.SHRCMMLoginSession_COM;
import com.skbank.sml.cmm.shr.com.SHRCMMMchrSession_COM;
import com.skbank.sml.cmm.shr.dto.CMM_CURRENT_CUST;
import com.skbank.sml.cmm.shr.dto.CMM_MCHR_INFO;
import com.skbank.sml.fns.shr.cst.cstt.SHRINBCmmConstant;
import com.skbank.sml.fns.shr.cst.util.INBPropertiesUtil;
import com.skbank.sml.fns.shr.dbm.NTFBX_CTGR_BSCI001_DBM;
import com.skbank.sml.fns.shr.dbm.UADS_SMT_BNKG_PUSH_USER_INF001_DBM;

import com.skbank.sml.fns.shr.dto.SHRINBPushBscInfOut_DTO;
import com.skbank.sml.fns.shr.dto.SHRINBPushBscInf_DTO;
import com.skbank.sml.fns.shr.dto.SHRINBPushCtgrList_DTO;
import com.skbank.sml.fns.shr.dto.SHRINBPushNtfcListInqIn_DTO;
import com.skbank.sml.fns.shr.dto.SHRINBPushNtfcListInqOutGrid_DTO;
import com.skbank.sml.fns.shr.dto.SHRINBPushNtfcListInqOut_DTO;
import com.skbank.sml.fns.shr.dto.SHRINBPushNtfcReadYn_DTO;
import com.skbank.sml.ifi.mca.eims1.dto.IBSMR0001251_IDT;
import com.skbank.sml.ifi.mca.eims8.dto.IBSMR0005658_IDT;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0001251_COM;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0005658_COM;

/**
 * 1.업무명 : NEWWON 대분류 금융서비스
 * 2.단위업무명 : NEWWON 중분류 공유
 * 3.프로그램명 : PUSH 업무 공유
 * 4.설명 : PUSH 업무 공유
 *  
 * @Class SHRINBPushBiz_COM.java 
 * @author 90190264
 * @since 2024.05.08
 * @version 1.0
 */		
@Component
@BxmCategory(logicalName="PUSH 업무 공유", description="PUSH 업무 공유")
public class SHRINBPushBiz_COM {
	private Logger logger= LoggerFactory.getLogger(getClass());
	
	private SHRCMMLoginSession_COM shrCMMLoginSession_COM; 
	private SHRCMMMchrSession_COM shrCMMMchrSession_COM; 
	private UADS_SMT_BNKG_PUSH_USER_INF001_DBM uadsSmtBnkgPushInf001_DBM;
	/**
	 * SHRIBSMR0005658_COM 공유 공통 IO
	 */
	private SHRIBSMR0005658_COM sHRIBSMR0005658_COM;
	/**
	 * SHRIBSMR0001251_COM 공유 공통 IO
	 */
	private SHRIBSMR0001251_COM sHRIBSMR0001251_COM;
	/**
	 * WFInterfaceCfg 생성 컴포넌트
	 */
	private SHRCMMInterfaceCfg_COM sHRCMMInterfaceCfg_COM;
	/**
	 * NTFBX_CTGR_BSCI dbm 생성 컴포넌트
	 */
	private NTFBX_CTGR_BSCI001_DBM ntfbxCtgrBsci001_dbm;
	
	
	/**
	 * 알림함 push 동의 여부 조회
	 * 
	 * @param input PUSH.기본정보.DBM.입력.IO
	 * @return PUSH.기본정보.DBM.출력.IO 
	 */
	@BxmCategory(logicalName="PUSH.기본정보.조회", description="알림함 push 기본정보 조회", author="90190264")
	public SHRINBPushBscInf_DTO selectPushBscInf(SHRINBPushBscInf_DTO input) throws WFApplicationException  {
		/**
		* @BXMType GetBean
		*/
		uadsSmtBnkgPushInf001_DBM= WFApplicationContext.getBean(uadsSmtBnkgPushInf001_DBM, UADS_SMT_BNKG_PUSH_USER_INF001_DBM.class);
		shrCMMMchrSession_COM= WFApplicationContext.getBean(shrCMMMchrSession_COM, SHRCMMMchrSession_COM.class);
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class); 
		
		/**
		 * @BXMType VariableDeclaration
		 */
		SHRINBPushBscInf_DTO output = new SHRINBPushBscInf_DTO();
		
		String userId 		= "";
		String deviceId 	= "";
		String itcsno 		= "";
		//세션고객정보
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession();
		
		// 간편회원 여부
		if(shrCMMLoginSession_COM.isEsnsMbh()) {
			String esnsMbhUserId = currentCust.getEsnsMbhNo().substring(1);		// 간편회원 ID : G123456 형태에서 G를 뺀다.
			userId = esnsMbhUserId;																// 간편회원 사용자 ID
			itcsno = currentCust.getEsnsMbhNo();														// 통합고객번호
		} else {
			// 로그인, 비로그인 구분하여 userId, itcsno 적용
			if (shrCMMLoginSession_COM.istLogin()) {
				userId = currentCust.getUserId();												// 금융회원 사용자 ID
				itcsno = currentCust.getItcsno();												// 통합고객번호
			} else {
				userId = input.getUserId();														// 금융회원 사용자 ID
				itcsno = input.getNgItgCsno();													// 통합고객번호
			}
		}
		// 기기정보 세션
		CMM_MCHR_INFO mchrInfo = shrCMMMchrSession_COM.getCmmMchrInfo();
		
		// 기기ID
		if("L".equals(INBPropertiesUtil.checkExeEnv())) {
			deviceId = "";
		} else {
			try {
				// 개발계 WEB 환경에서 테스트하기 위해 Exception 발생시에도 화면 뜨게 하기 위해 try 묶음.
				deviceId = mchrInfo.getComSmtUniqueId();
			} catch (Exception e) {
				// FNSE0008 : 기기 ID가 존재하지 않습니다.
				throw new WFApplicationException("FNSE0008");
			}
		}
		
		String rsltCd = "";
		String pshSvcAgrYn = "";
		
		input.setAppDscd(SHRINBCmmConstant.APP_DSCD);					// 06: WON뱅킹, NEW WON뱅킹
		input.setUserId(userId);
		/*
		 * @BXMType DBM
		 * 스마트뱅킹PUSH사용자정보001.DBM PUSH.기본정보.조회
		 */
		output = uadsSmtBnkgPushInf001_DBM.selectPushBscInf(input);
		
		if (ObjectUtils.isEmpty(output)) {
			rsltCd = SHRINBCmmConstant.PUSH_CODE_0001;		// 신규
		} else {
			// 다른 사용자의 로그인으로 삭제된 사용자
			if("Y".equals(output.getDelYn())) {
				rsltCd = SHRINBCmmConstant.PUSH_CODE_0002;
				pshSvcAgrYn = "";
			} else {
				String mcnUnQInfId = output.getMchrUnqInfId();
				
				// 기기 삭제 후 재설치 시 push token 변경을 감지
				if(!"".equals(deviceId) &&  !"".equals(input.getMchrUnqInfId()) 
						&& input.getMchrUnqInfId().length() > 40 
						&& !input.getMchrUnqInfId().equals(mcnUnQInfId)
						&& deviceId.equals(output.getDeviceId())) {
					
					SHRINBPushBscInf_DTO updMchrInfDto= new SHRINBPushBscInf_DTO();
					
					updMchrInfDto.setAppDscd(SHRINBCmmConstant.APP_DSCD);
					updMchrInfDto.setUserId(userId);
					updMchrInfDto.setAmdpeId(userId);
					updMchrInfDto.setMchrUnqInfId(input.getMchrUnqInfId()); 		
					updMchrInfDto.setDeviceId(output.getDeviceId());
					updMchrInfDto.setSmtphOsTpNm(output.getSmtphOsTpNm());
					updMchrInfDto.setPushAgrYn(output.getPushAgrYn());
					updMchrInfDto.setDelYn("N");
					
					// Push 정보 수정
					int updateResult = uadsSmtBnkgPushInf001_DBM.updatePushInf(updMchrInfDto);
					// UMS 푸시사용자원장(UMS사용자정보EAI인터페이스) 디퍼드 등록
					if(updateResult > 0) {
						// 푸시사용자원장 데이터 추가 세팅
						updMchrInfDto.setNgItgCsno(itcsno);
						updMchrInfDto.setMblMchrAppVerTxt(input.getMblMchrAppVerTxt());			// 모바일기기앱버전내용
						updMchrInfDto.setMblMchrMdlNm(input.getMblMchrMdlNm());					// 모바일기기모델명
						updMchrInfDto.setMblMchrSftrVerTxt(input.getMblMchrSftrVerTxt());			// 모바일소프트웨어버전
						
						uadsSmtBnkgPushInf001_DBM.insertUmsPushUserLdg(updMchrInfDto);
					}
				}
				// push동의여부 리턴값 세팅
				if (mcnUnQInfId.equals(input.getMchrUnqInfId())) { 
				    rsltCd = SHRINBCmmConstant.PUSH_CODE_0000; 
				    if ("T".equals(output.getPushAgrYn()) || "F".equals(output.getPushAgrYn())) {     
				        pshSvcAgrYn = output.getPushAgrYn(); 
				    } else { 
				        pshSvcAgrYn = "F"; 
				    } 
				} else { 
				    rsltCd = SHRINBCmmConstant.PUSH_CODE_0002; 
				    pshSvcAgrYn = ""; 
				} 
			}
		}
		// 기기고유정보ID(토큰, 레지스트리키) 빈값일때
		if (WFStringUtils.isEmpty(input.getMchrUnqInfId())) {
			rsltCd = SHRINBCmmConstant.PUSH_CODE_0003;
			pshSvcAgrYn = "";
		}
		
		// DB 조회결과 NUll 이면 인스턴스 초기화
		if (ObjectUtils.isEmpty(output)) {
			output = new SHRINBPushBscInf_DTO();
			
			output.setRsltCd(rsltCd);
			output.setPushAgrYn(pshSvcAgrYn);
		} else {
			output.setRsltCd(rsltCd);
			output.setPushAgrYn(pshSvcAgrYn);
		}
		
		return output;
	}
	
	/**
	 * 알림함 push 목록 조회
	 * 최근 목록을 조회하여 읽음여부를 return 한다.
	 * @param 
	 * @return 
	 * @throws IOException 
	 */
	@BxmCategory(logicalName="PUSH알림.열람여부.조회", description="PUSH알림.열람여부.조회", author="90190264")
	public SHRINBPushNtfcReadYn_DTO selectPushNtfcReadYn(SHRINBPushNtfcListInqIn_DTO input
			) throws WFApplicationException, IOException {
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class); 
		ntfbxCtgrBsci001_dbm= WFApplicationContext.getBean(ntfbxCtgrBsci001_dbm, NTFBX_CTGR_BSCI001_DBM.class);
		
		//세션고객정보
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession();
		
		/**
		 * @BXMType VariableDeclaration
		 */
		SHRINBPushNtfcReadYn_DTO output = new SHRINBPushNtfcReadYn_DTO();
		BufferedReader reader = null;
		InputStreamReader isReader = null;
		HttpURLConnection httpURLConnection = null;
		InputStream httpInputStream = null;
		
		// 간편회원 여부
		if(shrCMMLoginSession_COM.isEsnsMbh()) {
			input.setItcsno(currentCust.getEsnsMbhNo());											// 간편회원 ID : G123456
		} else {
			input.setItcsno(currentCust.getItcsno());													// 통합고객번호
		}
		
		/**
		 * UMS 호출 
		 */
		URL url = null;

		// RPS 데이터로 변환
		Map<String, Object> paramMap = new HashMap<String, Object>();
		Map<String, Object> dataMap = new HashMap<String, Object>();
		Map<String, Object> pageMap = new HashMap<String, Object>();

		pageMap.put("page", 1); 										// 페이지 번호
		pageMap.put("row", 20);										// 요청 메시지 개수
		
		dataMap.put("start_date", input.getUmsReqStaDt());						// 조회 시작일
		dataMap.put("end_date", input.getUmsReqEndDt());						// 조회 종료일
		dataMap.put("keyword","");									// 키워드
		dataMap.put("keywordYn", "N");								// 키워드검색 여부
		dataMap.put("pageInfo", pageMap);							// 페이지 정보
		
		paramMap.put("appGrpId", SHRINBCmmConstant.APP_GRP_ID);						// 조회할 앱 그룹 ID
		paramMap.put("custId", input.getItcsno());				// 유저의 아이디(통합고객번호)
		paramMap.put("token", input.getMchrTkn());				// 디바이스의 토큰값
		
		try{ 
			String categoryList = "";
			List<SHRINBPushCtgrList_DTO> pushCtgrList = ntfbxCtgrBsci001_dbm.selectPushCtgrList(SHRINBCmmConstant.NTFC_DSCD_PUSH);
			
			// RPS 카테고리 규칙에 맞게 대분류코드+중분류코드 형태의 문자열로 변환
			if(!pushCtgrList.isEmpty()) {
				// 대분류 카테고리 목록
				List<SHRINBPushCtgrList_DTO> pushNtfcLrclCdList = pushCtgrList.stream()
																									   .filter((item) -> SHRINBCmmConstant.PUSH_NTFC_LRCL_CD.equals(item.getNtfcCtgrId()))
																									   .collect(Collectors.toList());
				// 중분류 카테고리 목록
				List<SHRINBPushCtgrList_DTO> pushNtfcMclfCdList = pushCtgrList.stream()
																									    .filter((item) -> SHRINBCmmConstant.PUSH_NTFC_MCLF_CD.equals(item.getNtfcCtgrId()))
																									    .collect(Collectors.toList());
				
				categoryList = pushNtfcLrclCdList.stream()
															 .map(lrclItem -> {
																 List<String> matches = pushNtfcMclfCdList.stream()
																		 												  .filter(mclfItem -> mclfItem.getNtfcCtgrCdId().startsWith(lrclItem.getNtfcCtgrCdId()))
																		 												  .map(mclfItem -> lrclItem.getNtfcCtgrCdId() + mclfItem.getNtfcCtgrCdId())
															 															  .collect(Collectors.toList());
																// 대분류로 시작하는 중분류 값이 없으면(기타 99일때)
																if(matches.isEmpty()) {
																	return lrclItem.getNtfcCtgrCdId();
																}
																// 매칭되는 항목이 있을 경우
																return matches.stream().collect(Collectors.joining(","));
															 })
															 .collect(Collectors.joining(","));
				
				dataMap.put("category", categoryList);				// 카테고리 목록
			}
			paramMap.put("data", dataMap);								// 요청 데이터 정보
			
			String jParam = JSONObject.toJSONString(paramMap);
			String param ="d="+URLEncoder.encode(jParam, "UTF-8");
			
			// 실행환경 조회
			String env = INBPropertiesUtil.checkExeEnv(); 
			
			// 환경에 따른 URL 구분
			if("L".equals(env) || "D".equals(env)) {
				url = new URL("http://wumswtd.woorifg.com:9091/spns/web/newAppMsgBox.m?"+param); 			
			} else if("T".equals(env)) {
				url = new URL("http://wumswtt.woorifg.com:9091/spns/web/newAppMsgBox.m?"+param);
			} else if("P".equals(env) || "R".equals(env)) {
				url = new URL("http://wumswtp.woorifg.com:9091/spns/web/newAppMsgBox.m?"+param);
			}
			
			httpURLConnection = (HttpURLConnection)url.openConnection();
			
			httpURLConnection.setRequestMethod("GET");
			httpURLConnection.setConnectTimeout(10000);
			httpURLConnection.setReadTimeout(10000);
			httpURLConnection.setUseCaches(false); 
			httpURLConnection.setDoInput(true);
			httpURLConnection.setDoOutput(false);
			
			httpInputStream = httpURLConnection.getInputStream();
			
			if(httpInputStream != null) {
				isReader = new InputStreamReader(httpInputStream, "UTF-8");
				
				reader = new BufferedReader(isReader); 
			}
			
			String buffer = ""; 
			StringBuilder contentBody = new StringBuilder();
			
			while((buffer = reader.readLine()) != null) {
				contentBody.append(buffer); 
			}
			
			SHRINBPushNtfcListInqOut_DTO dOutput = new SHRINBPushNtfcListInqOut_DTO();
			ObjectMapper mapper = new ObjectMapper();

	        try {
	        	dOutput = mapper.readValue(contentBody.toString(), SHRINBPushNtfcListInqOut_DTO.class);
	        } catch (Exception e) {
	               logger.error(e.getMessage(), e);
	        }
			
			List<SHRINBPushNtfcListInqOutGrid_DTO> pushNtfcRspGrid = dOutput.getMsgs();
			
			/*
			 * 첫번째 row의 읽음여부 값을 확인
			 * */
			if(pushNtfcRspGrid.size() > 0) {
				SHRINBPushNtfcListInqOutGrid_DTO pushNtfcRspDto = pushNtfcRspGrid.get(0);
				
				String readYn = pushNtfcRspDto.getReadYn();
				
				output.setReadYn("Y".equals(readYn) ? readYn : "N");
			} else {
				output.setReadYn("Y");
			}
		} catch (Exception e) { 
			logger.error("90190264 SHR Exception 진입!!!!! ----------------------------------------------------"); 
			logger.error("90190264 SHR UMS PUSH 통신 Exception Message ::: {}", e);
			throw e;
		} finally { 
			if(reader != null) { 
				reader.close();
			} 
			if(isReader != null) { 
				isReader.close();
			} 
			if(httpInputStream != null ){
		        httpInputStream.close();
		    }
			
			httpURLConnection.disconnect();
		}
			
		return output;
	}
	
	/**
	 * 알림함 push on/off
	 * 
	 * @param input PUSH.기본정보.DBM.입력.IO
	 * @return PUSH.기본정보.DBM.출력.IO
	 */
	@BxmCategory(logicalName="PUSH.동의여부.수정", description="알림함 push 동의여부 수정", author="90190264")
	public SHRINBPushBscInfOut_DTO updatePushAgrYn(SHRINBPushBscInf_DTO input
	) throws WFApplicationException  {
		/**
		* @BXMType GetBean
		*/
		uadsSmtBnkgPushInf001_DBM= WFApplicationContext.getBean(uadsSmtBnkgPushInf001_DBM, UADS_SMT_BNKG_PUSH_USER_INF001_DBM.class);
		shrCMMMchrSession_COM= WFApplicationContext.getBean(shrCMMMchrSession_COM, SHRCMMMchrSession_COM.class);
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class); 
		/**
		 * @BXMType VariableDeclaration
		 */
		SHRINBPushBscInfOut_DTO rspRslt = new SHRINBPushBscInfOut_DTO();
		
		String itcsno = "";												// 통합고객번호
		String userId = "";											// 사용자ID
		String deviceId = "";											// 기기ID
		
		//세션고객정보
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession();
		
		// 간편회원 여부
		if(shrCMMLoginSession_COM.isEsnsMbh()) {
			String esnsMbhUserId = currentCust.getEsnsMbhNo().substring(1);		// 간편회원 ID : G123456 형태에서 G를 뺀다.
			userId = esnsMbhUserId;																// 간편회원 사용자 ID
			itcsno = currentCust.getEsnsMbhNo();														// 통합고객번호
		} else {
			userId = currentCust.getUserId();													// 금융회원 사용자 ID
			itcsno = currentCust.getItcsno();													// 통합고객번호
		}
		
		// 기기정보 세션
		CMM_MCHR_INFO mchrInfo = shrCMMMchrSession_COM.getCmmMchrInfo();
		
		// 기기ID
		if("L".equals(INBPropertiesUtil.checkExeEnv())) {
			deviceId = "";
		} else {
			try {
				// 개발계 WEB 환경에서 테스트하기 위해 Exception 발생시에도 화면 뜨게 하기 위해 try 묶음.
				deviceId = mchrInfo.getComSmtUniqueId();
			} catch (Exception e) {
				// FNSE0008 : 기기 ID가 존재하지 않습니다.
				throw new WFApplicationException("FNSE0008");
			}
		}
		
		// 유저 푸시기본정보 조회
		SHRINBPushBscInf_DTO output = selectPushBscInf(input);
		
		// 해당기기에서 최종 푸시 사용자인경우
		boolean isAgreeUser = false;
		
		if (output.getMchrUnqInfId().equals(input.getMchrUnqInfId()) && !"Y".equals(output.getDelYn()) && "T".equals(output.getPushAgrYn())) {
			isAgreeUser = true;
		}
		
		// 해당디바이스의 푸시 수신 사용자가 아닌데 수신거부(아니오) 할 경우 무시한다. 
		if ("F".equals(input.getPushAgrYn()) && !isAgreeUser) {
			rspRslt.setRsltCd(SHRINBCmmConstant.PUSH_CODE_0000);	// 정상 등록/ 변경
			
			return rspRslt;
		}
		// PUSH 정보 데이터 세팅
		input.setAppDscd(SHRINBCmmConstant.APP_DSCD);						// 앱구분코드
		input.setUserId(userId);											// 사용자ID
		input.setCusNo(userId);												// 고객번호
		input.setNgItgCsno(itcsno);										// 통합고객번호
		input.setDelYn("N");													// 삭제여부
		input.setRgpeId(userId);											// 등록자ID
		input.setAmdpeId(userId);											// 수정자ID
		input.setDeviceId(deviceId);										// 디바이스ID
		
		// 기존 사용자 중 같은 기기와 PUSH_KEY 를 사용하는 사용자는 삭제(UPDATE)
		if (input.getMchrUnqInfId().length() > 40) {
			uadsSmtBnkgPushInf001_DBM.updatePushDelYn(input);
		}
		int rsltCnt = 0;
		/** 신규일때만 신규건 등록 나머지는 변경 처리  */
		if (SHRINBCmmConstant.PUSH_CODE_0001.equals(output.getRsltCd())) {
			// 화면에서 중복 등록 시도로 인한 sql pk Exception 발생을 피하기 위한 방어 로직 추가
			SHRINBPushBscInf_DTO pushBscInfDto = uadsSmtBnkgPushInf001_DBM.selectPushBscInf(input);
			
			if(pushBscInfDto == null) {
				// 스마트뱅킹PUSH사용자정보 등록
				rsltCnt = uadsSmtBnkgPushInf001_DBM.mergePushBscInf(input);
			}
		} else {
			// Push 정보 수정
			rsltCnt = uadsSmtBnkgPushInf001_DBM.updatePushInf(input);
		}
		// 푸시사용자원장 데이터 추가 세팅
		input.setNgItgCsno(itcsno);
		
		// UMS 푸시사용자원장(UMS사용자정보EAI인터페이스) 디퍼드 등록
		uadsSmtBnkgPushInf001_DBM.insertUmsPushUserLdg(input);
		
		if (rsltCnt > 0) {
			rspRslt.setRsltCd(SHRINBCmmConstant.PUSH_CODE_0000);	// 정상 등록/ 변경
		} else {
			rspRslt.setRsltCd(SHRINBCmmConstant.PUSH_CODE_0001);
		}
		
		return rspRslt;
	}
	
	/**
	 * 서비스 해지 시 알림함 push off
	 * 
	 * @param input PUSH.기본정보.DBM.입력.IO
	 * @return PUSH.기본정보.DBM.출력.IO
	 */
	@BxmCategory(logicalName="PUSH.동의여부.해지", description="알림함 push 동의여부 해지 수정", author="90190264")
	public SHRINBPushBscInfOut_DTO updatePushAgrOff(SHRINBPushBscInf_DTO input
	) throws WFApplicationException  {
		/**
		* @BXMType GetBean
		*/
		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class);
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class); 
		uadsSmtBnkgPushInf001_DBM= WFApplicationContext.getBean(uadsSmtBnkgPushInf001_DBM, UADS_SMT_BNKG_PUSH_USER_INF001_DBM.class);
		sHRIBSMR0005658_COM= WFApplicationContext.getBean(sHRIBSMR0005658_COM, SHRIBSMR0005658_COM.class);
		sHRIBSMR0001251_COM= WFApplicationContext.getBean(sHRIBSMR0001251_COM, SHRIBSMR0001251_COM.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */
		SHRINBPushBscInfOut_DTO output = new SHRINBPushBscInfOut_DTO();
		// 필수값 체크
		if(WFStringUtils.isEmpty(input.getNgItgCsno()) || WFStringUtils.isEmpty(input.getUserId())) {
			output.setRsltCd(SHRINBCmmConstant.PUSH_CODE_9003);		// 필수값 없음(통고, user_id, app_dscd)
			output.setRsltCdTxt("****입출금 알림 해지 오류 PUSH9003****");
		}
		
		input.setAppDscd(SHRINBCmmConstant.APP_DSCD);		// 06: 원알림
		input.setPushAgrYn("F");
		
		SHRINBPushBscInf_DTO bscInf = selectPushBscInf(input);
		
		int updateCnt = 0;
		
		try {
			// 사용자 정보가 없을 경우
			if(SHRINBCmmConstant.PUSH_CODE_0001.equals(bscInf.getRsltCd())) {
				output.setRsltCd(SHRINBCmmConstant.PUSH_CODE_0001);		// 신규(사용자정보 없음)
			} else {
				// 간편/금융회원 PUSH 원장 해지
				// 고객 원장 푸시 OFF
				uadsSmtBnkgPushInf001_DBM.updatePushAgrYn(input);
				// RPS 디퍼드 원장 푸시 OFF
				uadsSmtBnkgPushInf001_DBM.insertUmsPushUserLdg(input);
				
				updateCnt ++;
				output.setRsltCd(SHRINBCmmConstant.PUSH_CODE_0002);		// 변경 완료
			}
			// 업데이트건수 세팅
			// 금융회원일때 아래 로직 지나면 rslt가 변경이되므로 업데이트 건수로 푸시원장 갱신 여부를 판단한다.
			output.setUpdateCnt(updateCnt);
			
			// 간편회원여부가 아닐때 PUSH입출금알림 일괄해지, PUSH 앱 삭제 실행
			if(!shrCMMLoginSession_COM.isEsnsMbh()) {
				String itcsno = input.getNgItgCsno();
				
				/**
				 * WON뱅킹 입출금 알림 OFF 처리 (글로벌뱅킹은 스마트뱅킹 해지시 전자뱅킹에서 처리하고 있음)
				 * 필수값 체크 (통고번호)
				 * */
				if(!WFStringUtils.isEmpty(itcsno)) {
					// ===================================================================
					// *********************** 1.IBSMR0005658(PUSH입출금알림 일괄해지) 인터페이스 호출 셋팅 ****************************************
					// ===================================================================
					//  MCA WFInterfaceCfg 객체 획득
					WFInterfaceCfg interfaceCfg  = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg();
					interfaceCfg.setInterfaceId("IBSMR0005658");
					
					IBSMR0005658_IDT ibsmr5658Idt = new IBSMR0005658_IDT();
					ibsmr5658Idt.setItcsno(itcsno);
					
					
					/**
					 * 연계시스템 호출
					 * TODO 인터페이스 호출을 위한 코드를 작성하십시오.
					 * TYPE : MCA
					 * ID : IBSMR0001249
					 * NM : PUSH 알림서비스 조회
					 */
					WFInfResponse<WFEmpty_ODT> mcaOutput = sHRIBSMR0005658_COM.callTrx(ibsmr5658Idt, interfaceCfg);
					
					if(mcaOutput.hasError()) {
						output.setRsltCd(SHRINBCmmConstant.PUSH_CODE_9001);		// 변경 완료
						output.setRsltCdTxt("****입출금 알림 해지 오류 PUSH9001****");
					} else {
						interfaceCfg.setInterfaceId("IBSMR0001251");
						// 3. WFCustomTrnHeader 셋팅
						WFCustomTrnHeader wfCusTrnHeader = new WFCustomTrnHeader();
						wfCusTrnHeader.setFuncCd("52");
						interfaceCfg.setCustomTrnHeader(wfCusTrnHeader);
						
						IBSMR0001251_IDT ibsmr1251Idt = new IBSMR0001251_IDT();
						
						ibsmr1251Idt.setItcsno(itcsno);
						
						/**
						 * 연계시스템 호출
						 * TODO 인터페이스 호출을 위한 코드를 작성하십시오.
						 * TYPE : MCA
						 * ID : IBSMR0001251
						 * NM : PUSH 앱 삭제
						 */
						WFInfResponse<WFEmpty_ODT> mcaOutput1251 = sHRIBSMR0001251_COM.callTrx(ibsmr1251Idt, interfaceCfg);
						
						if(mcaOutput1251.hasError()) {
							output.setRsltCd(SHRINBCmmConstant.PUSH_CODE_9002);
							output.setRsltCdTxt("****앱 삭제거래 실행 오류 PUSH9002****");
						} else {
							output.setRsltCd(SHRINBCmmConstant.PUSH_CODE_0003);
							output.setRsltCdTxt("****앱 삭제거래 실행 정상 PUSH0003****");
						}
					}
				}
			}
		} catch(WFApplicationException e){
			logger.error("PUSH.동의여부.해지 전문 error :: {}", e);
			output.setRsltCd(SHRINBCmmConstant.PUSH_CODE_9000);
			output.setRsltCdTxt("****스마트뱅킹 PUSH설정중 오류가 발생 하였습니다.****");
		} catch(Exception e){
			logger.error("PUSH.동의여부.해지 전문 error :: {}", e);
			output.setRsltCd(SHRINBCmmConstant.PUSH_CODE_9000);
			output.setRsltCdTxt("****스마트뱅킹 PUSH설정중 오류가 발생 하였습니다.****");
		}
		
		return output;
	}
	
	/**
	 * 알림함 기타정보 수정
	 * 
	 * @param input PUSH.기본정보.DBM.입력.IO
	 * @return PUSH.기본정보.DBM.출력.IO
	 */
	@BxmCategory(logicalName="PUSH.기타정보.수정", description="알림함 push 기타정보 수정", author="90190264")
	public int updatePushEtcInf(SHRINBPushBscInf_DTO input
	) throws WFApplicationException  {
		/**
		* @BXMType GetBean
		*/
		uadsSmtBnkgPushInf001_DBM= WFApplicationContext.getBean(uadsSmtBnkgPushInf001_DBM, UADS_SMT_BNKG_PUSH_USER_INF001_DBM.class);
		shrCMMMchrSession_COM= WFApplicationContext.getBean(shrCMMMchrSession_COM, SHRCMMMchrSession_COM.class);
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class); 
		
		String userId = "";											// 사용자ID
		
		//세션고객정보
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession();
		
		// 간편회원 여부
		if(shrCMMLoginSession_COM.isEsnsMbh()) {
			String esnsMbhUserId = currentCust.getEsnsMbhNo().substring(1);		// 간편회원 ID : G123456 형태에서 G를 뺀다.
			userId = esnsMbhUserId;													// 간편회원 사용자 ID
		} else {
			userId = currentCust.getUserId();										// 금융회원 사용자 ID
		}
		
		input.setUserId(userId);
		
		return uadsSmtBnkgPushInf001_DBM.updatePushEtcInf(input);
	}
	
	/**
	 * 미로그인 push 기본 정보 조회
	 * 
	 * @param input 미로그인.PUSH.기본정보.입력.IO
	 * @return PUSH.기본정보.DBM.출력.IO
	 */
	@BxmCategory(logicalName="PUSH.동의여부.수정", description="알림함 push 동의여부 수정", author="90190264")
	public SHRINBPushBscInf_DTO selectNlginPushBscInf(SHRINBPushBscInf_DTO input
	) throws WFApplicationException  {
		/**
		* @BXMType GetBean
		*/
		uadsSmtBnkgPushInf001_DBM= WFApplicationContext.getBean(uadsSmtBnkgPushInf001_DBM, UADS_SMT_BNKG_PUSH_USER_INF001_DBM.class);
		shrCMMMchrSession_COM= WFApplicationContext.getBean(shrCMMMchrSession_COM, SHRCMMMchrSession_COM.class);
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class); 
		
		SHRINBPushBscInf_DTO output = new SHRINBPushBscInf_DTO();
		
		SHRINBPushBscInf_DTO pushBscInfDto = uadsSmtBnkgPushInf001_DBM.selectNlginPushBscInf(input);
		
		String itcsno = input.getNgItgCsno();
		
		output.setAplDscd("N");				// 비로그인 Default 값
		
		// 데이터가 있을 경우 세팅 없으면 'N'
		if(pushBscInfDto != null) {
			// 동일 통합고객번호 체크
			if(itcsno.equals(pushBscInfDto.getNgItgCsno())) {
				// 빈값 방어로직
				// 통합고객번호 동일하고 조회 데이터가 빈값이 아닐 경우 데이터 세팅, 그 외는 N 처리
				if(!WFStringUtils.isEmpty(pushBscInfDto.getAplDscd())) {
					output.setNgItgCsno(itcsno);
					output.setAplDscd(pushBscInfDto.getAplDscd());
					output.setUserId(pushBscInfDto.getUserId());
				}				
			}
		} else {
			// FNSI0001 : 비로그인 정보가 존재하지 않습니다. 로그인 후 푸시설정을 다시 하시기 바랍니다.
			throw new WFApplicationException("FNSI0001");
		}
		
		return output;
	}
	
	/**
	 * 사용자 push 동의 여부 조회
	 * 
	 * @param input 미로그인.PUSH.기본정보.입력.IO
	 * @return PUSH.기본정보.DBM.출력.IO
	 */
	@BxmCategory(logicalName="사용자.Push.동의.여부.조회", description="사용자 push 동의 여부 조회", author="90190264")
	public SHRINBPushBscInf_DTO selectUsrPushAgrYn(SHRINBPushBscInf_DTO input) throws WFApplicationException  {
		/**
		* @BXMType GetBean
		*/
		uadsSmtBnkgPushInf001_DBM= WFApplicationContext.getBean(uadsSmtBnkgPushInf001_DBM, UADS_SMT_BNKG_PUSH_USER_INF001_DBM.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */
		SHRINBPushBscInf_DTO output = new SHRINBPushBscInf_DTO();
		
		input.setAppDscd(SHRINBCmmConstant.APP_DSCD);					// 06: WON뱅킹, NEW WON뱅킹
		input.setUserId(input.getUserId());											// 사용자ID
		/*	
		 * @BXMType DBM
		 * 스마트뱅킹PUSH사용자정보001.DBM PUSH.기본정보.조회
		 */
		output = uadsSmtBnkgPushInf001_DBM.selectPushBscInf(input);
		
		return output;
	}
}
