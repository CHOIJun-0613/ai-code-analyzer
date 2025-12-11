package com.skbank.sml.fns.shr.com;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import com.skbank.sml.cmm.shr.com.SHRCMMInterfaceCfg_COM;
import com.skbank.sml.cmm.shr.com.SHRCMMLoginSession_COM;
import com.skbank.sml.cmm.shr.dto.CMM_CURRENT_CUST;
import com.skbank.sml.fns.shr.cst.cstt.SHRMPBCmmConstant;
import com.skbank.sml.fns.shr.dto.SHRMPBBizSelectMPBJnngYn_DIDT;
import com.skbank.sml.fns.shr.dto.SHRMPBBizSelectMPBJnngYn_DODT;
import com.skbank.sml.fns.shr.dto.SHRMPBBizSelectPushInfOut_DTO;
import com.skbank.sml.ifi.mca.eims1.dto.IBSMR0004961_GRID_ODT;
import com.skbank.sml.ifi.mca.eims1.dto.IBSMR0004961_IDT;
import com.skbank.sml.ifi.mca.eims1.dto.IBSMR0004961_ODT;
import com.skbank.sml.ifi.mca.eims9.dto.IBSMR0005769_GRID_ODT;
import com.skbank.sml.ifi.mca.eims9.dto.IBSMR0005769_IDT;
import com.skbank.sml.ifi.mca.eims9.dto.IBSMR0005769_ODT;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0004961_COM;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0005769_COM;

import bxm.common.annotaion.BxmCategory;
import fwk.skbank.asis.adaptor.dto.request.WFInterfaceCfg;
import fwk.skbank.asis.adaptor.dto.response.WFInfResponse;
import fwk.skbank.asis.adaptor.header.request.WFNciHeader;
import fwk.skbank.online.context.WFApplicationContext;
import fwk.skbank.online.exception.app.WFApplicationException;
import fwk.skbank.online.exception.frm.SFAdaptorApplicationException;
import fwk.skbank.online.exception.frm.SFInterfaceSystemException;

/**
 * 1.업무명 : NEWWON 대분류 금융서비스 
 * 2.단위업무명 : NEWWON 중분류 공유 
 * 3.프로그램명 : 모임통장 업무 공유 
 * 4.설명 : 모임통장 업무 공유
 * 
 * @Class SHRMPBBiz_COM.java
 * @author 90191355
 * @since 2024.05.20
 * @version 1.0
 */
@Component
@BxmCategory(logicalName = "모임통장 업무 공유", description = "모임통장 업무 공유")
public class SHRMPBBiz_COM {
	private Logger logger = LoggerFactory.getLogger(getClass());

	/**
	 * IO 로그인부가정보조회
	 */
	// private SHRIBSMR0004367_COM sHRIBSMR0004367_COM;
	private SHRIBSMR0004961_COM sHRIBSMR0004961_COM;
	private SHRIBSMR0005769_COM sHRIBSMR0005769_COM;
	private SHRCMMLoginSession_COM shrCMMLoginSession_COM;
	private SHRCMMInterfaceCfg_COM sHRCMMInterfaceCfg_COM;
	/**
	 * 모임통장. 통장쪼개기 가입여부를 조회 하는 컴포넌트
	 * 
	 * @param input 가입정보.조회.컨트롤러.입력.IO
	 * @return 가입정보.조회.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName = "모임통장 가입여부 조회", description = "모임통장 가입여부를 조회하는 컴포넌트", author = "90191355")
	public SHRMPBBizSelectMPBJnngYn_DODT selectMPBJnngYn(SHRMPBBizSelectMPBJnngYn_DIDT input) {
		/**
		 * @BXMType GetBean
		 */
		sHRIBSMR0004961_COM = WFApplicationContext.getBean(sHRIBSMR0004961_COM, SHRIBSMR0004961_COM.class);
		sHRIBSMR0005769_COM= WFApplicationContext.getBean(sHRIBSMR0005769_COM, SHRIBSMR0005769_COM.class);
		shrCMMLoginSession_COM = WFApplicationContext	.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		sHRCMMInterfaceCfg_COM = WFApplicationContext	.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class); 
		/**
		 * @BXMType VariableDeclaration
		 */
		SHRMPBBizSelectMPBJnngYn_DODT output = new SHRMPBBizSelectMPBJnngYn_DODT();
		output.setMetPbokJnngYn("N");
		/*
		 * 로직 추가 세션 저장
		 */
		// 세션고객정보
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession();
		if (logger.isDebugEnabled()) {
			logger.debug("currentCust  {} :::= {} ::: ", currentCust);
		}

		boolean metPtcpYn = false; // 모임통장 가입여부 
		
		/**
		 * 연계시스템 호출 TYPE : MCA ID : IBSMR0004367 NM : 로그인 부가정보 조회
		 */
		try {
			if( StringUtils.isEmpty(currentCust.getUserId())) {
				output.setMetPbokJnngYn("N");
				return output;
			} 

			//  MCA WFInterfaceCfg 객체 획득
			WFInterfaceCfg interfaceCfg  = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg();
			interfaceCfg.setInterfaceId("IBSMR0005769");
	        
	        // WFNciHeader 셋팅
            WFNciHeader wfnciHeader = interfaceCfg.getNciHeader();
            
	        // 간편회원일 경우 userID, 통합고객번호 초기화
	        if( shrCMMLoginSession_COM.isEsnsMbh() == true ) {
	        	wfnciHeader.setEbnkUtzpeNo("");
	            wfnciHeader.setItcsno("");  
	        }

            // interfaceCfg 셋팅
            interfaceCfg.setNciHeader(wfnciHeader);   
            
	        IBSMR0005769_IDT iIBSMR0005769 = new IBSMR0005769_IDT();
	        iIBSMR0005769.setInqDis("01"); // 조회구분
	        iIBSMR0005769.setMetMngNo(""); // 모임관리번호
	        iIBSMR0005769.setNxtMetMngNo(""); // 다음모임관리번호
	        
	        if(logger.isDebugEnabled()) {
				logger.debug("90190263 모임통장.가입.정보 .모임통장.기본정보.조회 SVC iIBSMR0005769 {} ::: ", iIBSMR0005769);
			}
			
	        IBSMR0005769_ODT oIBSMR0005769= new IBSMR0005769_ODT();
	        
			WFInfResponse<IBSMR0005769_ODT> mcaOutput = sHRIBSMR0005769_COM.callTrx(iIBSMR0005769, interfaceCfg);
	
			oIBSMR0005769 = mcaOutput.getResponseData();
			
			/**
			 * @BXMType IF
			 * 정상 조회 처리여부
			 */
			if(oIBSMR0005769.getGrid().size() > 0 ) {
				output.setMetPbokJnngYn("Y"); // 모임통장가입여부
				metPtcpYn = true;
					
			} else{
				output.setMetPbokJnngYn("N");					
				metPtcpYn = false;
			}

			if(logger.isDebugEnabled()) {
				logger.debug("90190263 모임통장.기본정보.조회 COM oIBSMR0005769  {} ::: ", oIBSMR0005769);
			}
			
			/**
			 * 연계시스템 호출 
			 * TYPE : MCA
			 * ID : IBSMR0004961 
			 * NM : 당타행 요구불계좌 내역조회
			 * 당타행구분코드 : [1] 당행
			 */
			if( !metPtcpYn && shrCMMLoginSession_COM.isEsnsMbh() == false) {
				//  MCA WFInterfaceCfg 객체 획득
				interfaceCfg.setInterfaceId("IBSMR0004961");
				
				IBSMR0004961_ODT oIBSMR0004961 = new IBSMR0004961_ODT();
				IBSMR0004961_IDT iIBSMR0004961 = new IBSMR0004961_IDT();
				iIBSMR0004961.setItcsno(currentCust.getItcsno()); // 통합고객번호
				iIBSMR0004961.setTobkDscd("1"); // 당타행구분코드
				
				if(logger.isDebugEnabled()) {
					logger.debug("90190263 selectMetPbokJnngInf SVC iIBSMR0004961  {} ::: ", iIBSMR0004961);
				}
				
				WFInfResponse<IBSMR0004961_ODT> mcaOutput2 = sHRIBSMR0004961_COM.callTrx(iIBSMR0004961, interfaceCfg);
				
				oIBSMR0004961 = mcaOutput2.getResponseData();
				
				if(logger.isDebugEnabled()) {
					logger.debug("90190263 selectMetPbokJnngInf SVC oIBSMR0004961  {} ::: ", oIBSMR0004961);
				}
				
				/**
				 * @BXMType IF
				 * 모임통장 가입여부 조회
				 */
				if( !ObjectUtils.isEmpty( oIBSMR0004961.getGrid() )) {
					IBSMR0004961_GRID_ODT filterMbhActInfData = new IBSMR0004961_GRID_ODT();
					
					filterMbhActInfData = oIBSMR0004961.getGrid().stream()
							.filter( item -> "Y".equals( item.getMetPbokJnngYn()))
							.findFirst().orElse(filterMbhActInfData);
					
					if(logger.isDebugEnabled()) {
						logger.debug("90190263 selectMetPbokJnngInf SVC filterMbhActInfData  {} ::: ", filterMbhActInfData);
					}
					
					if(!ObjectUtils.isEmpty( filterMbhActInfData )) {
						output.setMetPbokJnngYn(filterMbhActInfData.getMetPbokJnngYn()); // 모임통장가입여부
					} else{
						output.setMetPbokJnngYn("N");
					}
				}
			}
		}catch(Exception e){
			logger.error("selectMetPbokJnngInf Exception ::: {}", e);					
			
			if ( e instanceof SFAdaptorApplicationException ) {
				SFAdaptorApplicationException se = (SFAdaptorApplicationException) e;
				logger.error("SFAdaptorApplicationException {} ", se);
	            
			} else if ( e instanceof SFInterfaceSystemException ) {
				SFInterfaceSystemException se = (SFInterfaceSystemException) e;
				logger.error("SFInterfaceSystemException {} ", se);
	
			} else if ( e instanceof WFApplicationException) {
				WFApplicationException we = (WFApplicationException) e;
				logger.error("WFApplicationException {} ", we);
				
			} else {
				logger.error("Exception {} ", e);
			}
		}
		
		return output;
	}
	
	

	/**
	 * 모임통장PUSH정보조회
	 * 
	 * @param input 모임통장PUSH정보조회.입력.IO
	 * @return 모임통장PUSH정보조회.출력.IO
	 */
	@BxmCategory(logicalName = "모임통장PUSH정보조회", description = "모임통장 가입여부를 조회하는 컴포넌트", author = "90190263")
	public SHRMPBBizSelectPushInfOut_DTO selectPushInf(String input) throws WFApplicationException  {
		
		SHRMPBBizSelectPushInfOut_DTO output = new SHRMPBBizSelectPushInfOut_DTO();
		
		/**
		 * [sndTgtDscd] 발송대상구분코드
		 * - A : 전체 모임원
		 * - 1 : 모임장
		 * - 2 : 해당 모임원
		 */
		switch(input) {
			case SHRMPBCmmConstant.STR_RPWBCESS0132122 : // 모임원 탈퇴
				output.setTmsMsgTitl(SHRMPBCmmConstant.RPWBCESS0132122_TITLE);
				output.setTmsMsgTxt(SHRMPBCmmConstant.RPWBCESS0132122_MSG);
				output.setSndTgtDscd(SHRMPBCmmConstant.FOR_BOSS);
				break;
			case SHRMPBCmmConstant.STR_RPWBCESS0132123 : // 공지사항 등록/변경
				output.setTmsMsgTitl(SHRMPBCmmConstant.RPWBCESS0132123_TITLE);
				output.setTmsMsgTxt(SHRMPBCmmConstant.RPWBCESS0132123_MSG);
				output.setSndTgtDscd(SHRMPBCmmConstant.FOR_ALL_MEMBER);
				break;
			case SHRMPBCmmConstant.STR_RPWBCESS0132124 : // 생활비 등록/변경
				output.setTmsMsgTitl(SHRMPBCmmConstant.RPWBCESS0132124_TITLE);
				output.setTmsMsgTxt(SHRMPBCmmConstant.RPWBCESS0132124_MSG);
				output.setSndTgtDscd(SHRMPBCmmConstant.FOR_ALL_MEMBER);
				break;
			case SHRMPBCmmConstant.STR_RPWBCESS0132125 : // 이체요청
				output.setTmsMsgTitl(SHRMPBCmmConstant.RPWBCESS0132125_TITLE);
				output.setTmsMsgTxt(SHRMPBCmmConstant.RPWBCESS0132125_MSG);
				output.setSndTgtDscd(SHRMPBCmmConstant.FOR_BOSS);
				break;
			case SHRMPBCmmConstant.STR_RPWBCESS0132126 : // 이체승인
				output.setTmsMsgTitl(SHRMPBCmmConstant.RPWBCESS0132126_TITLE);
				output.setTmsMsgTxt(SHRMPBCmmConstant.RPWBCESS0132126_MSG);
				output.setSndTgtDscd(SHRMPBCmmConstant.FOR_MEMBER);
				break;
			case SHRMPBCmmConstant.STR_RPWBCESS0132127 : // 모임장변경동의 요청
				output.setTmsMsgTitl(SHRMPBCmmConstant.RPWBCESS0132127_TITLE);
				output.setTmsMsgTxt(SHRMPBCmmConstant.RPWBCESS0132127_MSG);
				output.setSndTgtDscd(SHRMPBCmmConstant.FOR_ALL_MEMBER);
				break;
			case SHRMPBCmmConstant.STR_RPWBCESS0132128 : // 출금권한 등록요청
				output.setTmsMsgTitl(SHRMPBCmmConstant.RPWBCESS0132128_TITLE);
				output.setTmsMsgTxt(SHRMPBCmmConstant.RPWBCESS0132128_MSG);
				output.setSndTgtDscd(SHRMPBCmmConstant.FOR_MEMBER);
				break;
			case SHRMPBCmmConstant.STR_RPWBCESS0132129 : // 출금권한 해지요청
				output.setTmsMsgTitl(SHRMPBCmmConstant.RPWBCESS0132129_TITLE);
				output.setTmsMsgTxt(SHRMPBCmmConstant.RPWBCESS0132129_MSG);
				output.setSndTgtDscd(SHRMPBCmmConstant.FOR_MEMBER);
				break;
			case SHRMPBCmmConstant.STR_RPWBCESS0132130 : // 차기모임장 모임원변경 승인 요청
				output.setTmsMsgTitl(SHRMPBCmmConstant.RPWBCESS0132130_TITLE);
				output.setTmsMsgTxt(SHRMPBCmmConstant.RPWBCESS0132130_MSG);
				output.setSndTgtDscd(SHRMPBCmmConstant.FOR_MEMBER);
				break;
			case SHRMPBCmmConstant.STR_RPWBCESS0132131 : // 자동리포팅
				output.setTmsMsgTitl(SHRMPBCmmConstant.RPWBCESS0132131_TITLE);
				output.setTmsMsgTxt(SHRMPBCmmConstant.RPWBCESS0132131_MSG);
				output.setSndTgtDscd(SHRMPBCmmConstant.FOR_ALL_MEMBER);
				break;
			case SHRMPBCmmConstant.STR_RPWBCESS0132132 : // 회비 미입금 
				output.setTmsMsgTitl(SHRMPBCmmConstant.RPWBCESS0132132_TITLE);
				output.setTmsMsgTxt(SHRMPBCmmConstant.RPWBCESS0132132_MSG);
				output.setSndTgtDscd(SHRMPBCmmConstant.FOR_ALL_MEMBER);
				break;
			case SHRMPBCmmConstant.STR_RPWBCESS0132133 : // 모임원의 출금권한 해지
				output.setTmsMsgTitl(SHRMPBCmmConstant.RPWBCESS0132133_TITLE);
				output.setTmsMsgTxt(SHRMPBCmmConstant.RPWBCESS0132133_MSG);
				output.setSndTgtDscd(SHRMPBCmmConstant.FOR_BOSS);
				break;
			case SHRMPBCmmConstant.STR_RPWBCESS0132134 : // 모임원의 출금권한 등록
				output.setTmsMsgTitl(SHRMPBCmmConstant.RPWBCESS0132134_TITLE);
				output.setTmsMsgTxt(SHRMPBCmmConstant.RPWBCESS0132134_MSG);
				output.setSndTgtDscd(SHRMPBCmmConstant.FOR_BOSS);
				break;
			case SHRMPBCmmConstant.STR_RPWBCESS0132135 : // 신규 회원 등록
				output.setTmsMsgTitl(SHRMPBCmmConstant.RPWBCESS0132135_TITLE);
				output.setTmsMsgTxt(SHRMPBCmmConstant.RPWBCESS0132135_MSG);
				output.setSndTgtDscd(SHRMPBCmmConstant.FOR_BOSS);
				break;
			case SHRMPBCmmConstant.STR_RPWBCESS0132176: // 모임장 대기회원 승인
				output.setTmsMsgTitl(SHRMPBCmmConstant.RPWBCESS0132176_TITLE);
				output.setTmsMsgTxt(SHRMPBCmmConstant.RPWBCESS0132176_MSG);
				output.setSndTgtDscd(SHRMPBCmmConstant.FOR_MEMBER);
				break;
			default :
				break;
		}
		
		return output;
	}

}
