package com.skbank.sml.fns.inb.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.ResourceHttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.http.converter.support.AllEncompassingFormHttpMessageConverter;
import org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverter;
import org.springframework.http.converter.xml.SourceHttpMessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.skbank.sml.fns.inb.cst.cstt.INBNtfbxUrlConstant;
import com.skbank.sml.fns.inb.cst.cstt.INBPropertiesUtil;
import com.skbank.sml.fns.inb.dto.INBUmsCtgrClf_DTO;
import com.skbank.sml.fns.inb.dto.ItgNtfcListInq_DIDT;
import com.skbank.sml.fns.inb.dto.KataNtfcLIstInq_DODT;
import com.skbank.sml.fns.inb.dto.NtfcFavt_DIDT;
import com.skbank.sml.fns.inb.dto.NtfcFavt_DODT;
import com.skbank.sml.fns.inb.dto.NtfcReadYn_DIDT;
import com.skbank.sml.fns.inb.dto.NtfcReadYn_DODT;
import com.skbank.sml.fns.inb.dto.PushNtfcLIstInq_DODT;
import com.skbank.sml.fns.inb.dto.SmsNtfcLIstInq_DODT;

import bxm.common.annotaion.BxmCategory;
import net.minidev.json.JSONObject;
import fwk.skbank.online.exception.app.WFApplicationException;

/**
 * 1.업무명 : 금융서비스
 * 2.단위업무명 : NEWWON 중분류 통합알림함
 * 3.프로그램명 : 통합.알림함.목록.조회.컴포넌트
 * 4.설명 : 통합알림함 PUSH, SMS, KAKAO 알림 목록을 조회 한다.
 * 
 * @Class INBItgNtfbxListInq_COM.java
 * @author 90190264
 * @since 2024.03.21
 * @version 1.0
 */		
@Component
@BxmCategory(logicalName="통합.알림함.목록.조회.컴포넌트", description="통합알림함 PUSH, SMS, KAKAO 알림 목록을 조회 한다.")
public class INBItgNtfbxListInq_COM {
	private Logger logger= LoggerFactory.getLogger(getClass());
	
	/**
	 * PUSH 알림 목록을 조회한다.
	 * 
	 * @param input 통합.알림.목록.조회.DBM.입력.IO
	 * @return PUSH.알림.목록.조회.DBM.출력.IO
	 * @throws IOException 
	 */
	@BxmCategory(logicalName="PUSH.알림.목록.조회", description="PUSH 알림 목록을 조회한다.", author="90190264")
	public PushNtfcLIstInq_DODT selectPushNtfcLIst(ItgNtfcListInq_DIDT input) throws WFApplicationException, IOException  {
		/**
		 * @BXMType VariableDeclaration
		 */
		PushNtfcLIstInq_DODT output = new PushNtfcLIstInq_DODT();
		BufferedReader reader = null;
		InputStreamReader isReader = null;
		HttpURLConnection httpURLConnection = null;
		InputStream httpInputStream = null;
				
		/**
		 * UMS 호출 
		 */
		URL url = null;

		// RPS 데이터로 변환
		Map<String, Object> paramMap = new HashMap<String, Object>();
		Map<String, Object> dataMap = new HashMap<String, Object>();
		Map<String, Object> pageMap = new HashMap<String, Object>();

		pageMap.put("page", input.getPageNo()); 									// 페이지 번호
		pageMap.put("row", input.getPageSize().toString());						// 요청 메시지 개수
//		pageMap.put("sort", input.getSortDis());					// 정렬순서
		
		dataMap.put("start_date", input.getUmsReqStaDt());						// 조회 시작일
		dataMap.put("end_date", input.getUmsReqEndDt());						// 조회 종료일
		dataMap.put("keyword", input.getNtfcRfwr());								// 키워드
		dataMap.put("keywordYn", input.getNtfcRfwrYn());							// 키워드검색 여부
		dataMap.put("category", input.getNtfbxMclfCD());							// 카테고리 목록(대분류+중분류)
		dataMap.put("pageInfo", pageMap);												// 페이지 정보
		
		paramMap.put("appGrpId", "41029");											// 조회할 앱 그룹 ID
		paramMap.put("custId", input.getItcsno());									// 유저의 아이디(통합고객번호)
		paramMap.put("token", input.getMchrTkn());									// 디바이스의 토큰값
		paramMap.put("data", dataMap);													// 요청 데이터 정보
		
		try{ 
			
			String jParam = JSONObject.toJSONString(paramMap);
			String param ="d="+URLEncoder.encode(jParam, "UTF-8");
			
			logger.info("90190264 new URL 생성 직전 jParam ===== {} ", jParam);
			
			if("Y".equals(input.getFavtCdYn())) {
				// 환경에 따른 URL 구분
				if("L".equals(INBPropertiesUtil.checkExeEnv()) || "D".equals(INBPropertiesUtil.checkExeEnv())) {
					url = new URL(INBNtfbxUrlConstant.PUSH_FAVT_INQ_URL_T + param); 					// 개발 to 개발
				} else if("T".equals(INBPropertiesUtil.checkExeEnv())) {
					url = new URL(INBNtfbxUrlConstant.PUSH_FAVT_INQ_URL_T + param); 					// 개발 to 테스트
				} else if("P".equals(INBPropertiesUtil.checkExeEnv()) || "R".equals(INBPropertiesUtil.checkExeEnv())) {
					url = new URL(INBNtfbxUrlConstant.PUSH_FAVT_INQ_URL_P + param); 					// 개발 to 운영
				}
			} else {
				// 환경에 따른 URL 구분
				if("L".equals(INBPropertiesUtil.checkExeEnv()) || "D".equals(INBPropertiesUtil.checkExeEnv())) {
//					url = new URL("http://wumswtd.woorifg.com:9091/spns/web/newAppMsgBox.m?"+param); 	
					url = new URL(INBNtfbxUrlConstant.PUSH_INQ_URL_T + param);
				} else if("T".equals(INBPropertiesUtil.checkExeEnv())) {
					url = new URL(INBNtfbxUrlConstant.PUSH_INQ_URL_T + param);
				} else if("P".equals(INBPropertiesUtil.checkExeEnv()) || "R".equals(INBPropertiesUtil.checkExeEnv())) {
					url = new URL(INBNtfbxUrlConstant.PUSH_INQ_URL_P + param);
				}
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
			
			logger.debug("90190264 contentBody.toString ------------------ {}", contentBody.toString()); 
			
			ObjectMapper mapper = new ObjectMapper();

	        try {
	        	output = mapper.readValue(contentBody.toString(), PushNtfcLIstInq_DODT.class);
	        } catch (Exception e) {
	               logger.error(e.getMessage(), e);
	        }
			
		} catch (Exception e) { 
			logger.debug("90190264 Exception 진입!!!!! ----------------------------------------------------"); 
			logger.debug("90190264 UMS PUSH 통신 Exception Message ::: {}", e.getMessage());
			logger.debug("90190264 UMS PUSH 통신 Exception Message ::: {}", e);
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
	 * SMS 알림 목록을 조회한다.
	 * 
	 * @param input 통합.알림.목록.조회.DBM.입력.IO
	 * @return SMS.알림.목록.조회.DBM.출력.IO
	 * @throws IOException 
	 */
	@BxmCategory(logicalName="SMS.알림.목록.조회", description="SMS 알림 목록을 조회한다.", author="90190264")
	public SmsNtfcLIstInq_DODT selectSmsNtfcList(ItgNtfcListInq_DIDT input
	) throws WFApplicationException, IOException  {
		/**
		 * @BXMType VariableDeclaration
		 */
		SmsNtfcLIstInq_DODT output= new SmsNtfcLIstInq_DODT();
		BufferedReader reader = null;
		InputStreamReader isReader = null;
		HttpURLConnection httpURLConnection = null;
		InputStream httpInputStream = null;
		
		/**
		 * UMS 호출 
		 */
		URL url = null;

		Map<String, Object> paramMap = new HashMap<String, Object>();
		Map<String, Object> dataMap = new HashMap<String, Object>();
		Map<String, Object> pageMap = new HashMap<String, Object>();

		pageMap.put("page", input.getPageNo()); // 페이지
		pageMap.put("row", input.getPageSize().toString());
		
		paramMap.put("appGrpId", "41029");
		paramMap.put("custId", input.getItcsno());
		dataMap.put("umsReqSdt", input.getUmsReqStaDt());
		dataMap.put("umsReqEdt", input.getUmsReqEndDt());
		dataMap.put("cL1Cd", input.getNtfbxLrclCD());
		dataMap.put("cL2Cd", input.getNtfbxMclfCD());
		dataMap.put("sort", "d");	
		if(!input.getNtfcRfwr().isEmpty()) {
			dataMap.put("keyword", input.getNtfcRfwr());
		}
		dataMap.put("pageInfo", pageMap);
		paramMap.put("data", dataMap);
		
		try{ 
			
			String jParam = JSONObject.toJSONString(paramMap);
			String param ="d="+URLEncoder.encode(jParam, "UTF-8");
			
			logger.info("90190264 new URL 생성 직전 jParam ===== {} ", jParam);
			
			if("Y".equals(input.getFavtCdYn())) {
				// 환경에 따른 URL 구분
				if("L".equals(INBPropertiesUtil.checkExeEnv()) || "D".equals(INBPropertiesUtil.checkExeEnv())) {
					url = new URL(INBNtfbxUrlConstant.SMS_FAVT_INQ_URL_T +param); 					// 개발 to 개발
//					url = new URL("http://wumswtt.woorifg.com/msg_api/web/newSmsFavMsg.m?"+param); 					// 개발 to 테스트
				} else if("T".equals(INBPropertiesUtil.checkExeEnv())) {
					url = new URL(INBNtfbxUrlConstant.SMS_FAVT_INQ_URL_T +param); 					// 개발 to 테스트
				} else if("P".equals(INBPropertiesUtil.checkExeEnv()) || "R".equals(INBPropertiesUtil.checkExeEnv())) {
					url = new URL(INBNtfbxUrlConstant.SMS_FAVT_INQ_URL_P +param); 					// 개발 to 운영
				}
			} else {
				// 환경에 따른 URL 구분
				if("L".equals(INBPropertiesUtil.checkExeEnv()) || "D".equals(INBPropertiesUtil.checkExeEnv())) {
					url = new URL(INBNtfbxUrlConstant.SMS_INQ_URL_T + param); 						// 개발 to 개발
//					url = new URL("http://wumswtt.woorifg.com/msg_api/web/newSmsMsg.m?"+param); 						// 개발 to 테스트
				} else if("T".equals(INBPropertiesUtil.checkExeEnv())) {
					url = new URL(INBNtfbxUrlConstant.SMS_INQ_URL_T + param); 						// 개발 to 테스트
				} else if("P".equals(INBPropertiesUtil.checkExeEnv()) || "R".equals(INBPropertiesUtil.checkExeEnv())) {
					url = new URL(INBNtfbxUrlConstant.SMS_INQ_URL_P + param); 						// 개발 to 운영
				}
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
			
			logger.debug("90190264 SMS contentBody.toString ------------------ {}", contentBody.toString()); 
			
			ObjectMapper mapper = new ObjectMapper();

	        try {
	        	output = mapper.readValue(contentBody.toString(), SmsNtfcLIstInq_DODT.class);
	        } catch (Exception e) {
	               logger.error(e.getMessage(), e);
	        }
			
		} catch (Exception e) { 
			logger.debug("90190264 Exception 진입!!!!! ----------------------------------------------------"); 
			logger.debug("90190264 UMS SMS 통신 Exception Message ::: {}", e.getMessage());
			logger.debug("90190264 UMS SMS 통신 Exception Message ::: {}", e);
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
	 * 카카오톡 알림 목록을 조회한다.
	 * 
	 * @param input 통합.알림.목록.조회.DBM.입력.IO
	 * @return 카카오톡.알림.목록.조회.DBM.출력.IO
	 * @throws IOException 
	 */
	@BxmCategory(logicalName="카카오톡.알림.목록.조회", description="카카오톡 알림 목록을 조회한다.", author="90190264")
	public KataNtfcLIstInq_DODT selectKataNtfcList(ItgNtfcListInq_DIDT input
	) throws WFApplicationException, IOException  {
		/**
		 * @BXMType VariableDeclaration
		 */
		KataNtfcLIstInq_DODT output= new KataNtfcLIstInq_DODT();
		BufferedReader reader = null;
		InputStreamReader isReader = null;
		HttpURLConnection httpURLConnection = null;
		InputStream httpInputStream = null;
		
		/**
		 * UMS 호출 
		 */
		URL url = null;

		Map<String, Object> paramMap = new HashMap<String, Object>();
		Map<String, Object> dataMap = new HashMap<String, Object>();
		Map<String, Object> pageMap = new HashMap<String, Object>();

		pageMap.put("page", input.getPageNo()); // 페이지
		pageMap.put("row", input.getPageSize().toString());
		
		paramMap.put("appGrpId", "41029");
		paramMap.put("custId", input.getItcsno());
		dataMap.put("umsReqSdt", input.getUmsReqStaDt());
		dataMap.put("umsReqEdt", input.getUmsReqEndDt());
		dataMap.put("sort", "d");	
		if(!input.getNtfcRfwr().isEmpty()) {
			dataMap.put("keyword", input.getNtfcRfwr());
		}
		dataMap.put("pageInfo", pageMap);
		paramMap.put("data", dataMap);
		
		try{ 
			
			String jParam = JSONObject.toJSONString(paramMap);
			String param ="d="+URLEncoder.encode(jParam, "UTF-8");
			
			logger.info("90190264 new URL 생성 직전 jParam ===== {} ", jParam);
			
			if("Y".equals(input.getFavtCdYn())) {
				// 환경에 따른 URL 구분
				if("L".equals(INBPropertiesUtil.checkExeEnv()) || "D".equals(INBPropertiesUtil.checkExeEnv())) {
					url = new URL(INBNtfbxUrlConstant.KAKAO_FAVT_INQ_URL_T + param); 			// 개발 to 개발
//					url = new URL("http://wumswtt.woorifg.com/msg_api/web/newKkoFavMsg.m?"+param); 			// 개발 to 테스트
				} else if("T".equals(INBPropertiesUtil.checkExeEnv())) {
					url = new URL(INBNtfbxUrlConstant.KAKAO_FAVT_INQ_URL_T + param); 			// 개발 to 테스트
				} else if("P".equals(INBPropertiesUtil.checkExeEnv()) || "R".equals(INBPropertiesUtil.checkExeEnv())) {
					url = new URL(INBNtfbxUrlConstant.KAKAO_FAVT_INQ_URL_P + param); 			// 개발 to 운영
				}
			} else {
				// 환경에 따른 URL 구분
				if("L".equals(INBPropertiesUtil.checkExeEnv()) || "D".equals(INBPropertiesUtil.checkExeEnv())) {
					url = new URL(INBNtfbxUrlConstant.KAKAO_INQ_URL_T + param); 				// 개발 to 개발
//					url = new URL("http://wumswtt.woorifg.com/msg_api/web/newKkoMsg.m?"+param); 				// 개발 to 테스트
				} else if("T".equals(INBPropertiesUtil.checkExeEnv())) {
					url = new URL(INBNtfbxUrlConstant.KAKAO_INQ_URL_T + param); 				// 개발 to 테스트
				} else if("P".equals(INBPropertiesUtil.checkExeEnv()) || "R".equals(INBPropertiesUtil.checkExeEnv())) {
					url = new URL(INBNtfbxUrlConstant.KAKAO_INQ_URL_P + param); 				// 개발 to 운영
				}
			}
			
			httpURLConnection = (HttpURLConnection)url.openConnection();
			
			httpURLConnection.setRequestProperty("Content-Type","application/json;charset=UTF-8"); 
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
			
			logger.debug("90190264 카카오톡 contentBody.toString ------------------ {}", contentBody.toString()); 
			
			ObjectMapper mapper = new ObjectMapper();

	        try {
	        	output = mapper.readValue(contentBody.toString(), KataNtfcLIstInq_DODT.class);
	        } catch (Exception e) {
	               logger.error(e.getMessage(), e);
	        }
		} catch (Exception e) { 
			logger.debug("90190264 Exception 진입!!!!! ----------------------------------------------------"); 
			logger.debug("90190264 UMS KAKAO 통신 Exception Message ::: {}", e.getMessage());
			logger.debug("90190264 UMS KAKAO 통신 Exception Message ::: {}", e);
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
	 * UMS 카테고리 분류코드 목록을 조회한다.
	 * @param userId 
	 * 
	 * @param 
	 * @return 카테고리.분류코드.목록.조회.DBM.출력.IO
	 * @throws  
	 */
	@BxmCategory(logicalName="카테고리.분류코드.목록.조회", description="카테고리.분류코드 목록을 조회한다.", author="90190264")
	public INBUmsCtgrClf_DTO selectCtgrClf(String itcsno) throws WFApplicationException, IOException {
		
		/**
		 * @BXMType VariableDeclaration
		 */
		INBUmsCtgrClf_DTO output= new INBUmsCtgrClf_DTO();
		BufferedReader reader = null;
		InputStreamReader isReader = null;
		HttpURLConnection httpURLConnection = null;
		InputStream httpInputStream = null;
		
		/**
		 * UMS 호출 
		 */
		URL url = null;

		Map<String, Object> paramMap = new HashMap<String, Object>();
		Map<String, Object> dataMap = new HashMap<String, Object>();
		// dataMap에 임의로 value를 하나라도 넣어야 조회됨. 실질적으로 UMS에서 쓰이는 데이터는 아님.
		dataMap.put("custId", itcsno);	
		
		paramMap.put("appGrpId", "41029");
		paramMap.put("custId", itcsno);
		paramMap.put("data", dataMap);
		
		try{ 
			
			String jParam = JSONObject.toJSONString(paramMap);
			String param ="d="+URLEncoder.encode(jParam, "UTF-8");
			
			logger.info("90190264 new URL 생성 직전 jParam ===== {} ", jParam);
			
			// 환경에 따른 URL 구분
			if("L".equals(INBPropertiesUtil.checkExeEnv()) || "D".equals(INBPropertiesUtil.checkExeEnv())) {
				url = new URL(INBNtfbxUrlConstant.SMS_CTGR_INQ_URL_T + param); 				// 개발 to 개발
//				url = new URL("http://wumswtt.woorifg.com/msg_api/web/getCodeCategoryList.m?"+param); 				// 개발 to 테스트
			} else if("T".equals(INBPropertiesUtil.checkExeEnv())) {
				url = new URL(INBNtfbxUrlConstant.SMS_CTGR_INQ_URL_T + param); 				// 개발 to 테스트
			} else if("P".equals(INBPropertiesUtil.checkExeEnv()) || "R".equals(INBPropertiesUtil.checkExeEnv())) {
				url = new URL(INBNtfbxUrlConstant.SMS_CTGR_INQ_URL_P + param); 				// 개발 to 운영
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
			
			logger.debug("90190264 카카오톡 contentBody.toString ------------------ {}", contentBody.toString()); 
			
			ObjectMapper mapper = new ObjectMapper();

	        try {
	        	output = mapper.readValue(contentBody.toString(), INBUmsCtgrClf_DTO.class);
	        } catch (Exception e) {
	               logger.error(e.getMessage(), e);
	        }
		} catch (Exception e) { 
			logger.debug("90190264 Exception 진입!!!!! ----------------------------------------------------"); 
			logger.debug("90190264 UMS KAKAO 통신 Exception Message ::: {}", e.getMessage());
			logger.debug("90190264 UMS KAKAO 통신 Exception Message ::: {}", e);
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
	 * 즐겨찾기 등록/해제한다.
	 * 
	 * @param input 알림.즐겨찾기.DBM.입력.IO
	 * @return 알림.즐겨찾기.DBM.출력.IO
	 * @throws IOException 
	 */
	@BxmCategory(logicalName="알림.즐겨찾기.수정", description="즐겨찾기 등록/해제한다.", author="90190264")
	public NtfcFavt_DODT updateNtfcfavt(NtfcFavt_DIDT input
	) throws WFApplicationException, IOException  {
		/**
		 * @BXMType VariableDeclaration
		 */
		NtfcFavt_DODT output= new NtfcFavt_DODT();
		BufferedReader reader = null;
		InputStreamReader isReader = null;
		HttpURLConnection httpURLConnection = null;
		InputStream httpInputStream = null;
		
		/**
		 * UMS 호출 
		 */
		URL url = null;

		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("appGrpId", "41029");							// 조회할 앱 그룹 ID
		paramMap.put("custId", input.getItcsno());					// 유저의 아이디(통합고객번호)
		
		if("P".equalsIgnoreCase(input.getNtfcCd())) {
			paramMap.put("msgId", input.getMsgId());					// 메시지ID
			paramMap.put("umsTrno", input.getUmsTrno());			// UMS거래번호
			paramMap.put("umsReqDt", input.getUmsReqDt());		// UMS요청일자
			paramMap.put("favYn", input.getFavtYn());					// 즐겨찾기여부
		} else {
			Map<String, Object> dataMap = new HashMap<String, Object>();
			dataMap.put("umsTrno", input.getUmsTrno());
			dataMap.put("umsReqDt", input.getUmsReqDt());
			dataMap.put("isFav", input.getFavtYn());
			paramMap.put("data", dataMap);
		}
		
		try{ 
			String jParam = JSONObject.toJSONString(paramMap);
			String param ="d="+URLEncoder.encode(jParam, "UTF-8");
			
			logger.info("90190264 즐겨찾기 new URL 생성 직전 jParam ===== {} ", jParam);
			
			if("P".equalsIgnoreCase(input.getNtfcCd())) {
				// 환경에 따른 URL 구분
				if("L".equals(INBPropertiesUtil.checkExeEnv()) || "D".equals(INBPropertiesUtil.checkExeEnv())) {
//					url = new URL("http://wumswtd.woorifg.com:9091/spns/web/newAppMsgBoxSetFav.m?"+param); 			// 개발to개발
					url = new URL(INBNtfbxUrlConstant.PUSH_FAVT_UPD_URL_T + param); 			// 개발 to 테스트
				} else if("T".equals(INBPropertiesUtil.checkExeEnv())) {
					url = new URL(INBNtfbxUrlConstant.PUSH_FAVT_UPD_URL_T + param); 			// 개발 to 테스트
				} else if("P".equals(INBPropertiesUtil.checkExeEnv()) || "R".equals(INBPropertiesUtil.checkExeEnv())) {
					url = new URL(INBNtfbxUrlConstant.PUSH_FAVT_UPD_URL_P + param); 			// 개발 to 운영
				}
			} else if ("S".equalsIgnoreCase(input.getNtfcCd())) {
				// 환경에 따른 URL 구분
				if("L".equals(INBPropertiesUtil.checkExeEnv()) || "D".equals(INBPropertiesUtil.checkExeEnv())) {
					url = new URL(INBNtfbxUrlConstant.SMS_FAVT_UPD_URL_T + param); 					// 개발to개발
//					url = new URL("http://wumswtt.woorifg.com/msg_api/web/isFavUpdateYnSms.m?"+param); 					// 개발to테스트
				} else if("T".equals(INBPropertiesUtil.checkExeEnv())) {
					url = new URL(INBNtfbxUrlConstant.SMS_FAVT_UPD_URL_T + param); 					// 개발to테스트
				} else if("P".equals(INBPropertiesUtil.checkExeEnv()) || "R".equals(INBPropertiesUtil.checkExeEnv())) {
					url = new URL(INBNtfbxUrlConstant.SMS_FAVT_UPD_URL_P + param); 					// 개발to운영
				}
			} else if ("K".equalsIgnoreCase(input.getNtfcCd())) {
				// 환경에 따른 URL 구분
				if("L".equals(INBPropertiesUtil.checkExeEnv()) || "D".equals(INBPropertiesUtil.checkExeEnv())) {
					url = new URL(INBNtfbxUrlConstant.KAKAO_FAVT_UPD_URL_T + param); 					// 개발to개발
//					url = new URL("http://wumswtt.woorifg.com/msg_api/web/isFavUpdateYnKko.m?"+param); 					// 개발to테스트
				} else if("T".equals(INBPropertiesUtil.checkExeEnv())) {
					url = new URL(INBNtfbxUrlConstant.KAKAO_FAVT_UPD_URL_T + param); 					// 개발to테스트
				} else if("P".equals(INBPropertiesUtil.checkExeEnv()) || "R".equals(INBPropertiesUtil.checkExeEnv())) {
					url = new URL(INBNtfbxUrlConstant.KAKAO_FAVT_UPD_URL_P + param); 					// 개발to운영
				}
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
			
			logger.debug("90190264 즐겨찾기 contentBody.toString ------------------ {}", contentBody.toString()); 
			
			ObjectMapper mapper = new ObjectMapper();

	        try {
	        	output = mapper.readValue(contentBody.toString(), NtfcFavt_DODT.class);
	        } catch (Exception e) {
	               logger.error(e.getMessage(), e);
	        }
		} catch (Exception e) { 
			logger.debug("90190264 Exception 진입!!!!! ----------------------------------------------------"); 
			logger.debug("90190264 UMS 즐겨찾기 통신 Exception Message ::: {}", e.getMessage());
			logger.debug("90190264 UMS 즐겨찾기 통신 Exception Message ::: {}", e);
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

	@BxmCategory(logicalName="읽음여부.수정", description="읽음여부 수정한다.", author="90190264")
	public NtfcReadYn_DODT updateReadYn(NtfcReadYn_DIDT input) throws WFApplicationException, IOException {
		BufferedReader reader = null;
		InputStreamReader isReader = null;
		HttpURLConnection httpURLConnection = null;
		InputStream httpInputStream = null;
		
		/**
		 * UMS 호출 
		 */
		NtfcReadYn_DODT output= new NtfcReadYn_DODT();
		URL url = null;
		ObjectMapper objectMapper = new ObjectMapper();
		
		try{ 
			Map<String, Object> paramMap = new HashMap<String, Object>();
			
			paramMap.put("appGrpId", "41029");							// 조회할 앱 그룹 ID
			paramMap.put("custId", input.getItcsno());					// 유저의 아이디(통합고객번호)
			paramMap.put("msgList", input.getiNBNtfcReadYnGrid_DTO());					// 메시지리스트
		
			/**
			 * DTO 안에 @jsonIgnore 어노테이션이 있어서 JSONObject.toJSONString(paramMap) 실행 시 Exception 발생
			 * objectMapper.writeValueAsString() 대체 가능
			 * */
			String jParam = objectMapper.writeValueAsString(paramMap);
			String param ="d="+URLEncoder.encode(jParam, "UTF-8");
			
			logger.info("90190264 읽음여부 new URL 생성 직전 jParam ===== {} ", jParam);
			
			// 환경에 따른 URL 구분
			if("L".equals(INBPropertiesUtil.checkExeEnv()) || "D".equals(INBPropertiesUtil.checkExeEnv())) {
//				url = new URL("http://wumswtd.woorifg.com:9091/spns/web/newAppMsgBoxRead.m?"+param); 					// RPS 읽음여부
				url = new URL(INBNtfbxUrlConstant.PUSH_READ_UPD_URL_T + param); 					// 개발to테스트
			} else if("T".equals(INBPropertiesUtil.checkExeEnv())) {
				url = new URL(INBNtfbxUrlConstant.PUSH_READ_UPD_URL_T + param); 					// 개발to테스트
			} else if("P".equals(INBPropertiesUtil.checkExeEnv()) || "R".equals(INBPropertiesUtil.checkExeEnv())) {
				url = new URL(INBNtfbxUrlConstant.PUSH_READ_UPD_URL_P + param); 					// 개발to운영
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
			
			logger.debug("90190264 읽음여부 contentBody.toString ------------------ {}", contentBody.toString()); 
			
			ObjectMapper mapper = new ObjectMapper();

	        try {
	        	output = mapper.readValue(contentBody.toString(), NtfcReadYn_DODT.class);
	        } catch (Exception e) {
	               logger.error(e.getMessage(), e);
	        }
		} catch (JsonProcessingException e) {
			logger.debug("JsonProcessingException ::: {}", e.getMessage());
		} catch (Exception e) { 
			logger.debug("90190264 Exception 진입!!!!! ----------------------------------------------------"); 
			logger.debug("90190264 UMS 읽음여부 통신 Exception Message ::: {}", e.getMessage());
			logger.debug("90190264 UMS 읽음여부 통신 Exception Message ::: {}", e);
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
	
}
