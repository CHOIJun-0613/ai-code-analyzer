package com.skbank.sml.fns.mnp.com;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.skbank.sml.bsc.shr.com.SHRAllActInqTbk_COM;
import com.skbank.sml.bsc.shr.cst.cstt.SHRBSCInquiryConstant;
import com.skbank.sml.cmm.shr.com.SHRCMMInterfaceCfg_COM;
import com.skbank.sml.cmm.shr.com.SHRCMMLoginSession_COM;
import com.skbank.sml.cmm.shr.com.SHRCodeManager_COM;
import com.skbank.sml.cmm.shr.com.SHRPropertyService_COM;
import com.skbank.sml.cmm.shr.dto.CMM_CURRENT_CUST;
import com.skbank.sml.fns.mnp.dto.MNPMnyPinFncTrnInsertMnpImdtInt_DIDT;
import com.skbank.sml.fns.mnp.dto.MNPMnyPinFncTrnInsertMnpImdtInt_DODT;
import com.skbank.sml.fns.mnp.dto.MNPMnyPinFncTrnSelectMnpChgItm_DTO;
import com.skbank.sml.fns.mnp.dto.MNPMnyPinFncTrnSelectMnpIntCalInfList_DODT;
import com.skbank.sml.fns.mnp.dto.MNPMnyPinFncTrnSelectMnpIntCalInf_DIDT;
import com.skbank.sml.fns.mnp.dto.MNPMnyPinFncTrnSelectMnpIntCalInf_DODT;
import com.skbank.sml.fns.mnp.dto.MNPMnyPinFncTrnSelectMnpIntPrtsList_DODT;
import com.skbank.sml.fns.mnp.dto.MNPMnyPinFncTrnSelectMnpIntPrts_DIDT;
import com.skbank.sml.fns.mnp.dto.MNPMnyPinFncTrnSelectMnpIntPrts_DODT;
import com.skbank.sml.fns.mnp.dto.MNPMnyPinFncTrnSelectMnpTxIntInf_DIDT;
import com.skbank.sml.fns.mnp.dto.MNPMnyPinFncTrnSelectMnpTxIntInf_DODT;
import com.skbank.sml.fns.mnp.dto.MNPMnyPinFncTrnSelectTrnPrts_DTO;
import com.skbank.sml.fns.mnp.dto.MnyPinFncTrnExecuteMnpAtsInf_DIDT;
import com.skbank.sml.fns.mnp.dto.MnyPinFncTrnExecuteMnpAtsInf_DODT;
import com.skbank.sml.fns.mnp.dto.MnyPinFncTrnSelectMnpChgItm_DIDT;
import com.skbank.sml.fns.mnp.dto.MnyPinFncTrnSelectMnpChgItm_DODT;
import com.skbank.sml.fns.mnp.dto.MnyPinFncTrnSelectMnpTsAvl_DIDT;
import com.skbank.sml.fns.mnp.dto.MnyPinFncTrnSelectMnpTsAvl_DODT;
import com.skbank.sml.fns.mnp.dto.MnyPinFncTrnSelectMnyBalList_DODT;
import com.skbank.sml.fns.mnp.dto.MnyPinFncTrnSelectMnyBal_DIDT;
import com.skbank.sml.fns.mnp.dto.MnyPinFncTrnSelectMnyBal_DODT;
import com.skbank.sml.fns.mnp.dto.MnyPinFncTrnSelectTrnPrts_DIDT;
import com.skbank.sml.fns.mnp.dto.MnyPinFncTrnSelectTrnPrts_DODT;
import com.skbank.sml.fns.mnp.dto.MnyPinFncTrnUpdateMnpAmTs_DIDT;
import com.skbank.sml.fns.mnp.dto.MnyPinFncTrnUpdateMnpAmTs_DODT;
import com.skbank.sml.ifi.mca.eims1.dto.IBSMR0000001_IDT;
import com.skbank.sml.ifi.mca.eims1.dto.IBSMR0000001_ODT;
import com.skbank.sml.ifi.mca.eims1.dto.IBSMR0006171_IDT;
import com.skbank.sml.ifi.mca.eims1.dto.IBSMR0006171_ODT;
import com.skbank.sml.ifi.mca.eims2.dto.IBSMR0002912_IDT;
import com.skbank.sml.ifi.mca.eims2.dto.IBSMR0002912_ODT;
import com.skbank.sml.ifi.mca.eims2.dto.IBSMR0004972_IDT;
import com.skbank.sml.ifi.mca.eims2.dto.IBSMR0004972_ODT;
import com.skbank.sml.ifi.mca.eims3.dto.IBSMR0000053_IDT;
import com.skbank.sml.ifi.mca.eims3.dto.IBSMR0000053_ODT;
import com.skbank.sml.ifi.mca.eims3.dto.IBSMR0002913_IDT;
import com.skbank.sml.ifi.mca.eims3.dto.IBSMR0002913_ODT;
import com.skbank.sml.ifi.mca.eims3.dto.IBSMR0002913_REPT_FA_ODT;
import com.skbank.sml.ifi.mca.eims3.dto.IBSMR0004973_IDT;
import com.skbank.sml.ifi.mca.eims3.dto.IBSMR0004973_ODT;
import com.skbank.sml.ifi.mca.eims5.dto.IBSMR0006165_IDT;
import com.skbank.sml.ifi.mca.eims5.dto.IBSMR0006165_ODT;
import com.skbank.sml.ifi.mca.eims6.dto.IBSMR0000056_GRID_ODT;
import com.skbank.sml.ifi.mca.eims6.dto.IBSMR0000056_IDT;
import com.skbank.sml.ifi.mca.eims6.dto.IBSMR0000056_ODT;
import com.skbank.sml.ifi.mca.eims6.dto.IBSMR0006066_GRID_ODT;
import com.skbank.sml.ifi.mca.eims6.dto.IBSMR0006066_IDT;
import com.skbank.sml.ifi.mca.eims6.dto.IBSMR0006066_ODT;
import com.skbank.sml.ifi.mca.eims7.dto.IBSMR0006067_GRID_ODT;
import com.skbank.sml.ifi.mca.eims7.dto.IBSMR0006067_IDT;
import com.skbank.sml.ifi.mca.eims7.dto.IBSMR0006067_ODT;
import com.skbank.sml.ifi.mca.eims8.dto.IBSMR0006158_GRID_ODT;
import com.skbank.sml.ifi.mca.eims8.dto.IBSMR0006158_IDT;
import com.skbank.sml.ifi.mca.eims8.dto.IBSMR0006158_ODT;
import com.skbank.sml.ifi.mca.eims9.dto.IBSMR0006159_GRID_ODT;
import com.skbank.sml.ifi.mca.eims9.dto.IBSMR0006159_IDT;
import com.skbank.sml.ifi.mca.eims9.dto.IBSMR0006159_ODT;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0000001_COM;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0000056_COM;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0002912_COM;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0002913_COM;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0004972_COM;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0004973_COM;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0006066_COM;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0006067_COM;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0006158_COM;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0006159_COM;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0006165_COM;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0006171_COM;

import bxm.common.annotaion.BxmCategory;
import bxm.common.util.StringUtils;
import fwk.skbank.asis.adaptor.dto.request.WFInterfaceCfg;
import fwk.skbank.asis.adaptor.dto.response.WFInfResponse;
import fwk.skbank.asis.adaptor.header.request.WFNciHeader;
import fwk.skbank.asis.adaptor.header.request.custom.WFCustomSystemHeader;
import fwk.skbank.asis.adaptor.header.response.WFNcoHeader;
import fwk.skbank.online.context.WFApplicationContext;
import fwk.skbank.online.context.WFChannelMessage;
import fwk.skbank.online.exception.app.WFApplicationException;
import fwk.skbank.online.exception.dto.WFInfErrorResponse;
import fwk.skbank.online.exception.frm.SFAdaptorApplicationException;
import fwk.skbank.online.exception.frm.SFInterfaceSystemException;
import fwk.skbank.online.util.WFDateUtils;
import fwk.skbank.online.util.WFStringUtils;


/**
 * 1.업무명 : NEWWON 대분류 금융서비스
 * 2.단위업무명 : NEWWON 중분류 머니클립
 * 3.프로그램명 : 머니클립 금융거래 관리
 * 4.설명 : 
 * 
 * @Class MNPMnyPinFncTrn_COM.java
 * @author 90190263
 * @since 2024.08.12
 * @version 1.0
 */		
@Component
@BxmCategory(logicalName="머니클립 금융거래 관리", description="머니클립의 금융 거래 성격을 띈 정보를 관리하는 공용 컴포넌트")
public class MNPMnyPinFncTrn_COM {
	private Logger logger= LoggerFactory.getLogger(getClass());
	/**
	 * 세션 관리 컴포넌트
	 */
	private SHRCMMLoginSession_COM shrCMMLoginSession_COM;

	/**
	 * WFInterfaceCfg 생성 컴포넌트
	 */
	private SHRCMMInterfaceCfg_COM sHRCMMInterfaceCfg_COM;
	
	/**
	 * 인터넷뱅킹 예적금 항목변경 조회
	 */
	//private SHRIBSMR0004241_COM sHRIBSMR0004241_COM;
	
	/**
	 * 머니클립 모으기 정보 등록
	 */
	private SHRIBSMR0006066_COM sHRIBSMR0006066_COM;
	
	/**
	 * 머니클립 월말 잔액조회
	 */
	private SHRIBSMR0006067_COM sHRIBSMR0006067_COM;
	
	/**
	 * WON포켓 이체 가능조회
	 */
	private SHRIBSMR0004972_COM sHRIBSMR0004972_COM;
	
	/**
	 *WON포켓 이체 실행
	 */
	private SHRIBSMR0004973_COM sHRIBSMR0004973_COM;
	
	/**
	 * 개인_계좌별거래내역
	 */
	private SHRIBSMR0002913_COM sHRIBSMR0002913_COM;
	/**
	 * 인터넷일괄지급거래내역조회
	 */
	private SHRIBSMR0000056_COM sHRIBSMR0000056_COM;
	/**
	 * 계좌기본정보조회.공유.컴포넌트
	 */
	private SHRIBSMR0000001_COM sHRIBSMR0000001_COM;
	
	/**
	 * 머니클립 예금이자계산내역조회 (받을 이자 정보 조회)
	 */
	private SHRIBSMR0006159_COM sHRIBSMR0006159_COM;
	
	/**
	 * 머니클립 이자내역조회 (받은 이자 내역 조회)
	 */
	private SHRIBSMR0006158_COM sHRIBSMR0006158_COM;
	
	/**
	 * 머니클립 즉시이자받기 (즉시이자받기)
	 */
	private SHRIBSMR0006165_COM sHRIBSMR0006165_COM;
	/**
	 * 머니클립 세금이자정보조회
	 */
	private SHRIBSMR0006171_COM sHRIBSMR0006171_COM;
	/**
	 * 프로퍼티서비스 컴포넌트(공유)
	 */
	private SHRPropertyService_COM sHRPropertyService_COM;
	
	/**
	 * 개인_계좌별거래내역(갯수,ViewTable).공유.컴포넌트
	 */
	private SHRIBSMR0002912_COM sHRIBSMR0002912_COM;
	/**
	 * 코드매니저 컴포넌트(공유)
	 */
	private SHRCodeManager_COM sHRCodeManager_COM;
	/**
	 * 전계좌 세션 갱신
	 */
	private SHRAllActInqTbk_COM shrAllActInqTbk_COM;
	
	/**
	 * 머니클립의 항목변경(모으기정보)을 조회 하는 컴포넌트
	 * 
	 * 항목변경코드 [079032] 머니클립 모으기 등록 정보
	 * 517 이체주기 		- 예시 : 매월, 매주, 매일
	 * 197 이체실행일 	- 예시 : 10일, 월요일, 매일
	 * 805 이체금액 		- 예시 : 1,000
	 * 627 목표금액 		- 예시 : 1,000,000
	 * 995 모으기제목 	- 예시 : 여행자금(금고,지갑명)
	 * 
	 * 항목변경코드 [079033] 머니클립 별명 등록 정보
	 * 995 별명 			- 예시 : 여행자금
	 * 
	 * 항목변경코드 [079034] 머니클립 아이콘 등록 정보
	 * 995 아이콘 
	 * 
	 * @param input 모임통장.기본.정보.조회.컨트롤러.입력.IO
	 * @return 모임통장.기본.정보.조회.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName="머니클립모으기정보조회", description="머니클립의 항목변경(모으기정보)을 조회 하는 컴포넌트", author="90190263")
	public MnyPinFncTrnSelectMnpChgItm_DODT selectMnpChgItm(MnyPinFncTrnSelectMnpChgItm_DIDT input
	)
	{
		/**
		* @BXMType GetBean
		*/
		// WFInterfaceCfg 생성 컴포넌트
		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class);
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		sHRIBSMR0006066_COM= WFApplicationContext.getBean(sHRIBSMR0006066_COM, SHRIBSMR0006066_COM.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */
		MnyPinFncTrnSelectMnpChgItm_DODT output= new MnyPinFncTrnSelectMnpChgItm_DODT();
		
		/*
		 * 로직 추가
		 */
		//세션고객정보
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession(); 
		if(logger.isDebugEnabled()) {
			logger.debug("currentCust ====== {} ::: ", currentCust);
		} 
		
		if(logger.isDebugEnabled()) {
			logger.debug("90190263 머니클립모으기정보조회 COM input {} ::: ", input);
		}
		
		/**
		 * 연계시스템 호출
		 * TYPE : MCA
		 * ID : IBSMR0006066
		 * NM : 머니클립의 모으기(자동이체) 정보를 조회한다
		 */
		try{
			//  MCA WFInterfaceCfg 객체 획득
			WFInterfaceCfg interfaceCfg  = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg();
			interfaceCfg.setInterfaceId("IBSMR0006066");
			
	        IBSMR0006066_IDT iIBSMR0006066 = new IBSMR0006066_IDT();
	        iIBSMR0006066.setTrnDscd("09"); 											// 거래구분코드
	        iIBSMR0006066.setAtsWdrBkwAcno(input.getAtsWdrBkwAcno()); 	// 자동이체출금전행계좌번호
	        iIBSMR0006066.setCucd(input.getCucd()); 								// 통화코드
	        iIBSMR0006066.setRcvAcno(input.getRcvAcno()); 						// 입금계좌번호
	        
	        if(logger.isDebugEnabled()) {
				logger.debug("90190263 머니클립자동이체정보조회 COM iIBSMR0006066 {} ::: ", iIBSMR0006066);
			}
			
	        IBSMR0006066_ODT oIBSMR0006066= new IBSMR0006066_ODT();
	        
			WFInfResponse<IBSMR0006066_ODT> mcaOutput = sHRIBSMR0006066_COM.callTrx(iIBSMR0006066, interfaceCfg);
	
			oIBSMR0006066 = mcaOutput.getResponseData();
			
			if(logger.isDebugEnabled()) {
				logger.debug("90190263 머니클립자동이체정보조회 COM oIBSMR0006066  {} ::: ", oIBSMR0006066);
			}
			
			/**
			 * @BXMType IF
			 * 정상 조회 처리여부
			 */
			output.setAtsMngNo(oIBSMR0006066.getAtsMngNo()); 					// 자동이체관리번호
			output.setAtsWdrBkwAcno(oIBSMR0006066.getAtsWdrBkwAcno()); 	// 자동이체출금전행계좌번호
			output.setCucd(oIBSMR0006066.getCucd()); 								// 통화코드
			output.setAtsRcvBkcd(oIBSMR0006066.getAtsRcvBkcd()); 				// 자동이체입금은행코드
			output.setRcvAcno(oIBSMR0006066.getRcvAcno()); 						// 입금계좌번호
			output.setAtsBasDd(oIBSMR0006066.getAtsBasDd()); 					// 자동이체기준일
			output.setAtsCycd(oIBSMR0006066.getAtsCycd()); 						// 자동이체주기코드
			output.setAtsAm(oIBSMR0006066.getAtsAm()); 							// 자동이체금액
			output.setAtsStaDt(oIBSMR0006066.getAtsStaDt()); 						// 자동이체시작일자
			output.setAtsEndDt(oIBSMR0006066.getAtsEndDt()); 						// 자동이체종료일자
			output.setAtsRqAdvpeEno(oIBSMR0006066.getAtsRqAdvpeEno()); 	// 자동이체신청권유자직원번호
			output.setRnpeNm(oIBSMR0006066.getRnpeNm()); 						// 수취인명
			output.setRqspeNm(oIBSMR0006066.getRqspeNm()); 						// 의뢰인명
			output.setAtsTitl(oIBSMR0006066.getAtsTitl()); 							// 자동이체제목
			output.setAtsItcd(oIBSMR0006066.getAtsItcd()); 							// 자동이체항목코드
			output.setAtsItmTxt(oIBSMR0006066.getAtsItmTxt()); 					// 자동이체항목내용
			output.setAtsHldyPrcBscd(oIBSMR0006066.getAtsHldyPrcBscd()); 	// 자동이체휴일처리기준코드
			
			/**
			 * 517 이체주기 		- 예시 : 매월, 매주, 매일
			 * 197 이체실행일 	- 예시 : 10일, 월요일, 매일
			 * 805 이체금액 		- 예시 : 1,000
			 * 627 목표금액 		- 예시 : 1,000,000
			 * 995 모으기제목 	- 예시 : 여행자금
			 */
			MNPMnyPinFncTrnSelectMnpChgItm_DTO oMnpChgItm = new MNPMnyPinFncTrnSelectMnpChgItm_DTO();
			
			for(IBSMR0006066_GRID_ODT oIBSMR0006066List : oIBSMR0006066.getGrid()) {
				switch( oIBSMR0006066List.getDpsRgsChgDtcd() ) {
				case "197": // 이체실행일
					oMnpChgItm.setTsExeDd(oIBSMR0006066List.getDpsRgsChgDtcdTxt());
					break;
				case "517": // 이체주기
					oMnpChgItm.setTsCyc(oIBSMR0006066List.getDpsRgsChgDtcdTxt());
					break;
				case "627": // 목표금액
					oMnpChgItm.setGoalAm(oIBSMR0006066List.getDpsRgsChgDtcdTxt());
					break;
				case "805": // 이체금액
					oMnpChgItm.setTsAm(oIBSMR0006066List.getDpsRgsChgDtcdTxt());
					break;
				case "995": // 모으기제목
					oMnpChgItm.setGoalNm(oIBSMR0006066List.getDpsRgsChgDtcdTxt());
					break;
				default:
					break;
				}
			}
			output.setMnpChgItmDto(oMnpChgItm);
		} catch (Exception e) {
			logger.error("IBSMR0006066 Exception!! {} ", e);
			
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
		
		if(logger.isDebugEnabled()) {
			logger.debug("90190263 머니클립자동이체정보등록 COM output  {} ::: ", output);
		}
		return output;
			
	}
	
	/**
	 * 머니클립의 모으기(자동이체) 정보를 등록/변경 하는 컴포넌트
	 *
	 * 거래구분코드
	 * [01]: 등록
	 * [02]: 변경
	 * [03]: 해지
	 * 
	 * [09]: 조회
	 * 
	 * @param input 모임통장.기본.정보.조회.컨트롤러.입력.IO
	 * @return 모임통장.기본.정보.조회.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName="머니클립자동이체정보실행", description="머니클립의 모으기(자동이체) 정보를 등록하는 컴포넌트", author="90190263")
	public MnyPinFncTrnExecuteMnpAtsInf_DODT executeMnpAtsInf(MnyPinFncTrnExecuteMnpAtsInf_DIDT input
	)
	{
		/**
		* @BXMType GetBean
		*/
		// WFInterfaceCfg 생성 컴포넌트
		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class);
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		sHRIBSMR0006066_COM= WFApplicationContext.getBean(sHRIBSMR0006066_COM, SHRIBSMR0006066_COM.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */
		MnyPinFncTrnExecuteMnpAtsInf_DODT output= new MnyPinFncTrnExecuteMnpAtsInf_DODT();
		
		/*
		 * 로직 추가
		 */
		//세션고객정보
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession(); 
		if(logger.isDebugEnabled()) {
			logger.debug("currentCust ====== {} ::: ", currentCust);
		} 
		
		if(logger.isDebugEnabled()) {
			logger.debug("90190263 머니클립자동이체정보등록 COM input {} ::: ", input);
		}
		
		String errMsgTxt = "";
		
		/**
		 * 연계시스템 호출
		 * TYPE : MCA
		 * ID : IBSMR0006066
		 * NM : 머니클립의 모으기(자동이체) 정보를 등록한다
		 */
		try{
			//  MCA WFInterfaceCfg 객체 획득
			WFInterfaceCfg interfaceCfg  = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg();
			interfaceCfg.setInterfaceId("IBSMR0006066");
	        
	        IBSMR0006066_IDT iIBSMR0006066 = new IBSMR0006066_IDT();
	        iIBSMR0006066.setTrnDscd(input.getTrnDscd()); // 거래구분코드
	        iIBSMR0006066.setAtsMngNo(input.getAtsMngNo()); // 자동이체관리번호
	        iIBSMR0006066.setAtsWdrBkwAcno(input.getAtsWdrBkwAcno()); // 자동이체출금전행계좌번호
	        iIBSMR0006066.setCucd(input.getCucd()); // 통화코드
	        iIBSMR0006066.setAtsRcvBkcd(input.getAtsRcvBkcd()); // 자동이체입금은행코드
	        iIBSMR0006066.setRcvAcno(input.getRcvAcno()); // 입금계좌번호
	        iIBSMR0006066.setAfchAtsRcvBkwAcno(input.getAfchAtsRcvBkwAcno()); // 변경후자동이체입금전행계좌번호
	        iIBSMR0006066.setAtsBasDd(input.getAtsBasDd()); // 자동이체기준일
	        iIBSMR0006066.setEncyActPwno(input.getEncyActPwno()); // 암호화계좌비밀번호
	        iIBSMR0006066.setAtsCycd(input.getAtsCycd()); // 자동이체주기코드
	        iIBSMR0006066.setAtsChgAtsCycd(input.getAtsChgAtsCycd()); // 자동이체변경자동이체주기코드
	        iIBSMR0006066.setAtsAm(input.getAtsAm()); // 자동이체금액
	        iIBSMR0006066.setAtsStaDt(input.getAtsStaDt()); // 자동이체시작일자
	        iIBSMR0006066.setAfchAtsStaDt(input.getAfchAtsStaDt()); // 변경후자동이체시작일자
	        iIBSMR0006066.setAtsEndDt(input.getAtsEndDt()); // 자동이체종료일자
	        iIBSMR0006066.setAfchAtsEndDt(input.getAfchAtsEndDt()); // 변경후자동이체종료일자
	        iIBSMR0006066.setAtsRqAdvpeEno(input.getAtsRqAdvpeEno()); // 자동이체신청권유자직원번호
	        iIBSMR0006066.setRnpeNm(input.getRnpeNm()); // 수취인명
	        iIBSMR0006066.setAfchAtsRnpeNm(input.getAfchAtsRnpeNm()); // 변경후자동이체수취인명
	        iIBSMR0006066.setRqspeNm(input.getRqspeNm()); // 의뢰인명
	        iIBSMR0006066.setAfchAtsRqspeNm(input.getAfchAtsRqspeNm()); // 변경후자동이체의뢰인명
	        iIBSMR0006066.setAtsTitl(input.getAtsTitl()); // 자동이체제목
	        iIBSMR0006066.setAtsItcd(input.getAtsItcd()); // 자동이체항목코드
	        iIBSMR0006066.setAtsItmTxt(input.getAtsItmTxt()); // 자동이체항목내용
	        iIBSMR0006066.setAtsHldyPrcBscd(input.getAtsHldyPrcBscd()); // 자동이체휴일처리기준코드
	        iIBSMR0006066.setAtsAfchFndAcno(input.getAtsAfchFndAcno()); // 자동이체변경후펀드계좌번호
	        iIBSMR0006066.setCnt(input.getCnt()); // 건수
	        iIBSMR0006066.setGrid(input.getGrid()); // 그리드
	        
	        if(logger.isDebugEnabled()) {
				logger.debug("90190263 머니클립자동이체정보등록 COM iIBSMR0006066 {} ::: ", iIBSMR0006066);
			}
			
	        IBSMR0006066_ODT oIBSMR0006066= new IBSMR0006066_ODT();
	        
			WFInfResponse<IBSMR0006066_ODT> mcaOutput = sHRIBSMR0006066_COM.callTrx(iIBSMR0006066, interfaceCfg);
	
			oIBSMR0006066 = mcaOutput.getResponseData();
			
			/**
			 * @BXMType IF
			 * 정상 조회 처리여부
			 */
				
			if(logger.isDebugEnabled()) {
				logger.debug("90190263 머니클립자동이체정보등록 COM oIBSMR0006066  {} ::: ", oIBSMR0006066);
			}
			
			output.setTrnRstCd("0000");
			output.setTrnRstTxt("정상처리되었습니다.");
		
		} catch (Exception e) {
			logger.error("IBSMR0006066 Exception!! {} ", e);
			
			if ( e instanceof SFAdaptorApplicationException ) {
				SFAdaptorApplicationException se = (SFAdaptorApplicationException) e;
				logger.error("SFAdaptorApplicationException {} ", se);
				
				Object[] args = se.getArguments();
	            
	            if(args != null && args.length>0) {
	            	errMsgTxt = args[0].toString();
				}
			} else if ( e instanceof SFInterfaceSystemException ) {
				SFInterfaceSystemException se = (SFInterfaceSystemException) e;
				logger.error("SFInterfaceSystemException {} ", se);
				
				errMsgTxt = se.getMainMsgTxt();
	
			} else if ( e instanceof WFApplicationException) {
				WFApplicationException we = (WFApplicationException) e;
				logger.error("WFApplicationException {} ", we);
				
				errMsgTxt = we.getMessage();
				
			} else {
				logger.error("Exception {} ", e);
				
				errMsgTxt = e.getMessage();				
			}
			output.setTrnRstCd("9999");
			output.setTrnRstTxt(errMsgTxt);
		}
		
		if(logger.isDebugEnabled()) {
			logger.debug("90190263 머니클립자동이체정보등록 COM output  {} ::: ", output);
		}
		
		return output;
			
	}
	
	/**
	 * 머니클립의 월말의 잔액을 조회하는 컴포넌트
	 * 
	 * 
	 * @param input 모임통장.기본.정보.조회.컨트롤러.입력.IO
	 * @return 모임통장.기본.정보.조회.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName="머니클립월말잔액조회", description="머니클립의 월말의 잔액을 조회하는 컴포넌트", author="90190263")
	public MnyPinFncTrnSelectMnyBal_DODT selectMnpBal(MnyPinFncTrnSelectMnyBal_DIDT input
	)
	{
		/**
		* @BXMType GetBean
		*/
		// WFInterfaceCfg 생성 컴포넌트
		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class);
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		sHRIBSMR0006067_COM= WFApplicationContext.getBean(sHRIBSMR0006067_COM, SHRIBSMR0006067_COM.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */
		MnyPinFncTrnSelectMnyBal_DODT output= new MnyPinFncTrnSelectMnyBal_DODT();
		
		/*
		 * 로직 추가
		 */
		//세션고객정보
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession(); 
		if(logger.isDebugEnabled()) {
			logger.debug("currentCust ====== {} ::: ", currentCust);
		} 
		
		if(logger.isDebugEnabled()) {
			logger.debug("90190263 머니클립 월말 잔액조회 COM input {} ::: ", input);
		}
		
		
		/**
		 * 연계시스템 호출
		 * TYPE : MCA
		 * ID : IBSMR0006067
		 * NM : 머니클립 월말 잔액을 조회한다.
		 */
		try{
			//  MCA WFInterfaceCfg 객체 획득
			WFInterfaceCfg interfaceCfg  = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg();
			interfaceCfg.setInterfaceId("IBSMR0006067");

			String inqAcno = input.getInqAcno();
			
	        IBSMR0006067_IDT iIBSMR0006067 = new IBSMR0006067_IDT();
	        iIBSMR0006067.setInqAcno(inqAcno); // 조회계좌번호
	        iIBSMR0006067.setInqStaYm(input.getInqStaYm()); // 조회시작년월
	        iIBSMR0006067.setInqEndYm(input.getInqEndYm()); // 조회종료년월
	   
	        if(logger.isDebugEnabled()) {
				logger.debug("90190263 머니클립 월말 잔액조회 COM iIBSMR0006067 {} ::: ", iIBSMR0006067);
			}
			
	        IBSMR0006067_ODT oIBSMR0006067= new IBSMR0006067_ODT();
	        
			WFInfResponse<IBSMR0006067_ODT> mcaOutput = sHRIBSMR0006067_COM.callTrx(iIBSMR0006067, interfaceCfg);
	
			oIBSMR0006067 = mcaOutput.getResponseData();
			
			/**
			 * @BXMType IF
			 * 정상 조회 처리여부
			 */
			Integer cnt = oIBSMR0006067.getCnt();
			output.setCnt(cnt); // 건수
			output.setAcno(oIBSMR0006067.getAcno()); // 계좌번호
			
//			BigDecimal thisMonthActBal = BigDecimal.ZERO;
//			String thisDt = "";
			if (cnt > 0) {
				List<MnyPinFncTrnSelectMnyBalList_DODT> grid = new ArrayList<MnyPinFncTrnSelectMnyBalList_DODT>();
				for (IBSMR0006067_GRID_ODT item : oIBSMR0006067.getGrid()) {
					MnyPinFncTrnSelectMnyBalList_DODT gridItem = new MnyPinFncTrnSelectMnyBalList_DODT();
					String dt = item.getDt();
					BigDecimal bal = item.getBal();
//					if (dt.startsWith(input.getInqEndYm())) {
//						//현재달 잔액 비교 변수값 셋팅
//						thisDt = dt;
//						thisMonthActBal = bal;
//					}
					gridItem.setDt(dt); // 일자
					gridItem.setBal(bal); // 잔액
					
					grid.add(gridItem);
				}
					
				output.setGrid(grid); // 그리드
			}
				
			if(logger.isDebugEnabled()) {
				logger.debug("90190263 머니클립 월말 잔액조회 COM oIBSMR0006067  {} ::: ", oIBSMR0006067);
			}
			
			//계좌 정보 조회 후 현재일과 잔액이 다를 때 데이터 수정
//			IBSMR0000001_ODT iBSMR0000001_ODT = selectTlmActBsci(inqAcno);
//			BigDecimal actBal = iBSMR0000001_ODT.getCtBal();
//			if (!thisMonthActBal.equals(actBal)) {
//				String today = WFDateUtils.get(WFDateUtils.YYYYMMDD);
//				List<MnyPinFncTrnSelectMnyBalList_DODT> grid = output.getGrid();
//
//				boolean hasDtItem = false;
//				for (MnyPinFncTrnSelectMnyBalList_DODT gridItem : grid) {
//					if (thisDt.equals(gridItem.getDt())) {
//						hasDtItem = true;
//						gridItem.setBal(actBal);
//					}
//				}	
//				
//				if (!hasDtItem) {
//					MnyPinFncTrnSelectMnyBalList_DODT newItem = new MnyPinFncTrnSelectMnyBalList_DODT();
//					newItem.setDt(today);
//					newItem.setBal(actBal);
//					
//					grid.add(0, newItem);
//				}
//			}
		} catch (Exception e) {
			logger.error("IBSMR0006067 Exception!! {} ", e);
			
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
		
		if(logger.isDebugEnabled()) {
			logger.debug("90190263 머니클립 월말 잔액조회 COM output  {} ::: ", output);
		}
		
		return output;
			
	}
	
	/**
	 * 머니클립의 모계좌와 자계좌(지갑,금고) 간 이체 가능 조회하는 컴포넌트
	 * WON포켓 이체 가능조회
	 * 
	 * @param input 모임통장.기본.정보.조회.컨트롤러.입력.IO
	 * @return 모임통장.기본.정보.조회.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName="머니클립이체가능조회", description="머니클립의 금액을 꺼내치/채우기 가능 여부를 조회하는 컴포넌트", author="90190263")
	public MnyPinFncTrnSelectMnpTsAvl_DODT selectMnpTsAvl(MnyPinFncTrnSelectMnpTsAvl_DIDT input
	)
	{
		/**
		* @BXMType GetBean
		*/
		// WFInterfaceCfg 생성 컴포넌트
		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class);
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		sHRIBSMR0004972_COM= WFApplicationContext.getBean(sHRIBSMR0004972_COM, SHRIBSMR0004972_COM.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */
		MnyPinFncTrnSelectMnpTsAvl_DODT output= new MnyPinFncTrnSelectMnpTsAvl_DODT();
		
		/*
		 * 로직 추가
		 */
		//세션고객정보
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession(); 
		if(logger.isDebugEnabled()) {
			logger.debug("currentCust ====== {} ::: ", currentCust);
		} 
		
		if(logger.isDebugEnabled()) {
			logger.debug("90190263 머니클립이체가능조회 COM input {} ::: ", input);
		}
		
		String errMsgId = "";
		String errMsgTxt = "";
		
		/**
		 * 연계시스템 호출
		 * TYPE : MCA
		 * ID : IBSMR0004972
		 * NM : WON포켓 이체 가능 조회
		 */
		try{
			//  MCA WFInterfaceCfg 객체 획득
			WFInterfaceCfg interfaceCfg  = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg();
			interfaceCfg.setInterfaceId("IBSMR0004972");
	        
	        IBSMR0004972_IDT iIBSMR0004972 = new IBSMR0004972_IDT();
	        iIBSMR0004972.setWdrAcno(input.getWdrAcno()); // 출금계좌번호
	        iIBSMR0004972.setActPwnoUsgYn(input.getActPwnoUsgYn()); // 계좌비밀번호사용여부
	        iIBSMR0004972.setActPwno(input.getActPwno()); // 계좌비밀번호
	        iIBSMR0004972.setTrnAm(input.getTrnAm()); // 거래금액
	        iIBSMR0004972.setRsvDt(input.getRsvDt()); // 예약일자
	        iIBSMR0004972.setRcvBkcd(input.getRcvBkcd()); // 입금은행코드
	        iIBSMR0004972.setRcvAcno(input.getRcvAcno()); // 입금계좌번호
	        iIBSMR0004972.setPtnPbokPrngTxt(input.getPtnPbokPrngTxt()); // 상대통장인자내용
	        iIBSMR0004972.setClnmNoAddSbj(input.getClnmNoAddSbj()); // 집금번호추가사항
	        iIBSMR0004972.setRnpeFnm(input.getRnpeFnm()); // 수취인성명
	        iIBSMR0004972.setWibeeMnyDduYn(input.getWibeeMnyDduYn()); // 위비머니차감여부
	        iIBSMR0004972.setXtTgtRgsYn(input.getXtTgtRgsYn()); // 제외대상등록여부
	        iIBSMR0004972.setHbitclngYn(input.getHbitclngYn()); // 습관챌린지여부
	        iIBSMR0004972.setCusPrtfRgsNo(input.getCusPrtfRgsNo()); // 고객포트폴리오등록번호
	        
	        if(logger.isDebugEnabled()) {
				logger.debug("90190263 머니클립이체가능조회 COM iIBSMR0004972 {} ::: ", iIBSMR0004972);
			}
			
	        IBSMR0004972_ODT oIBSMR0004972= new IBSMR0004972_ODT();
	        
			WFInfResponse<IBSMR0004972_ODT> mcaOutput = sHRIBSMR0004972_COM.callTrx(iIBSMR0004972, interfaceCfg);
	
			oIBSMR0004972 = mcaOutput.getResponseData();
			
			/**
			 * @BXMType IF
			 * 정상 조회 처리여부
			 */
			output.setOwacFnm(oIBSMR0004972.getOwacFnm()); // 예금주성명
			output.setBftrAfBal(oIBSMR0004972.getBftrAfBal()); // 거래전후잔액
			output.setRnpeFnm(oIBSMR0004972.getRnpeFnm()); // 수취인성명
			output.setTrnSrno(oIBSMR0004972.getTrnSrno()); // 거래일련번호
			output.setFeeAm(oIBSMR0004972.getFeeAm()); // 수수료금액
			output.setRduFeeAm(oIBSMR0004972.getRduFeeAm()); // 감면수수료금액
			output.setWmbRduAm(oIBSMR0004972.getWmbRduAm()); // 우리멤버스감면금액
			output.setFrduRncd(oIBSMR0004972.getFrduRncd()); // 수수료감면사유코드
			output.setOldAtrbDpstDlTgtYn(oIBSMR0004972.getOldAtrbDpstDlTgtYn()); // 구속성예금취급대상여부
			output.setNrsrYn1(oIBSMR0004972.getNrsrYn1()); // 비거주자여부_1
			output.setNrsrYn2(oIBSMR0004972.getNrsrYn2()); // 비거주자여부_2
			output.setINT(oIBSMR0004972.getINT()); // 이자
				
			if(logger.isDebugEnabled()) {
				logger.debug("90190263 머니클립이체가능조회 COM oIBSMR0004972  {} ::: ", oIBSMR0004972);
			}
		}  catch (Exception e) {
			logger.error("IBSMR0004972 Exception!! {} ", e);
			
			if ( e instanceof SFAdaptorApplicationException ) {
				SFAdaptorApplicationException se = (SFAdaptorApplicationException) e;
				logger.error("SFAdaptorApplicationException {} ", se);
				
				errMsgId = se.getCode();
				Object[] args = se.getArguments();
	            
	            if(args != null && args.length>0) {
	            	errMsgTxt = args[0].toString();
				}
	            
	            logger.debug("SFAdaptorApplicationException errMsgTxt {} ", errMsgTxt);
	            throw new WFApplicationException("FNSE0006", new Object[] {errMsgTxt}, new Object[] {errMsgId});
			} else if ( e instanceof SFInterfaceSystemException ) {
				SFInterfaceSystemException se = (SFInterfaceSystemException) e;
				logger.error("SFInterfaceSystemException {} ", se);
				
				errMsgId = se.getMsgId();
				errMsgTxt = se.getMainMsgTxt();
	
				throw new WFApplicationException("FNSE0006", new Object[] {errMsgTxt}, new Object[] {errMsgId});
				
			} else if ( e instanceof WFApplicationException) {
				WFApplicationException we = (WFApplicationException) e;
				logger.error("WFApplicationException {} ", we);
				
				errMsgId = we.getCode();
				errMsgTxt = we.getMessage();
				
				throw new WFApplicationException("FNSE0006", new Object[] {errMsgTxt}, new Object[] {errMsgId});
			} else {
				List<WFChannelMessage> list = WFApplicationContext.getMessages();
				if (list.size() > 0) {
					errMsgId = list.get(0).getMsgCd();
					errMsgTxt = list.get(0).getMsg();
				}
			}
		}
		
		if(logger.isDebugEnabled()) {
			logger.debug("90190263 머니클립이체가능조회 COM output  {} ::: ", output);
		}
		
		return output;
			
	}
	
	/**
	 * 머니클립의 지갑,금고에서 꺼내기,모으기를 실행하는 컴포넌트
	 * 
	 * 
	 * @param input 모임통장.기본.정보.조회.컨트롤러.입력.IO
	 * @return 모임통장.기본.정보.조회.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName="머니클립금액이체", description="머니클립의 금액을 이체하는 컴포넌트", author="90190263")
	public MnyPinFncTrnUpdateMnpAmTs_DODT updateMnpAmTs(MnyPinFncTrnUpdateMnpAmTs_DIDT input
	)
	{
		/**
		* @BXMType GetBean
		*/
		// WFInterfaceCfg 생성 컴포넌트
		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class);
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		sHRIBSMR0004973_COM = WFApplicationContext.getBean(sHRIBSMR0004973_COM, SHRIBSMR0004973_COM.class);
		shrAllActInqTbk_COM = WFApplicationContext.getBean(shrAllActInqTbk_COM, SHRAllActInqTbk_COM.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */
		MnyPinFncTrnUpdateMnpAmTs_DODT output= new MnyPinFncTrnUpdateMnpAmTs_DODT();
		
		/*
		 * 로직 추가
		 */
		//세션고객정보
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession(); 
		if(logger.isDebugEnabled()) {
			logger.debug("currentCust ====== {} ::: ", currentCust);
		} 
		
		if(logger.isDebugEnabled()) {
			logger.debug("90190263 머니클립금액이체 COM input {} ::: ", input);
		}
		
		String errMsgId = "";
		String errMsgTxt = "";
		
		/**
		 * 연계시스템 호출
		 * TYPE : MCA
		 * ID : IBSMR0004973
		 * NM : WON포켓 이체 실행
		 */
		try{
			//  MCA WFInterfaceCfg 객체 획득
			WFInterfaceCfg interfaceCfg  = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg();
			interfaceCfg.setInterfaceId("IBSMR0004973");
			
	        IBSMR0004973_IDT iIBSMR0004973 = new IBSMR0004973_IDT();
	        iIBSMR0004973.setWdrAcno(input.getWdrAcno()); // 출금계좌번호
	        iIBSMR0004973.setActPwnoUsgYn(input.getActPwnoUsgYn()); // 계좌비밀번호사용여부
	        iIBSMR0004973.setActPwno(input.getActPwno()); // 계좌비밀번호
	        iIBSMR0004973.setTrnAm(input.getTrnAm()); // 거래금액
	        iIBSMR0004973.setRsvDt(input.getRsvDt()); // 예약일자
	        iIBSMR0004973.setRcvBkcd(input.getRcvBkcd()); // 입금은행코드
	        iIBSMR0004973.setRcvAcno(input.getRcvAcno()); // 입금계좌번호
	        iIBSMR0004973.setPtnPbokPrngTxt(input.getPtnPbokPrngTxt()); // 상대통장인자내용
	        iIBSMR0004973.setClnmNoAddSbj(input.getClnmNoAddSbj()); // 집금번호추가사항
	        iIBSMR0004973.setRnpeFnm(input.getRnpeFnm()); // 수취인성명
	        iIBSMR0004973.setWdrPbokPrngTxt(input.getWdrPbokPrngTxt()); // 출금통장인자내용
	        iIBSMR0004973.setSprFild(input.getSprFild()); // 예비필드
	        iIBSMR0004973.setWibeeMnyDduYn(input.getWibeeMnyDduYn()); // 위비머니차감여부
	        iIBSMR0004973.setHbitclngYn(input.getHbitclngYn()); // 습관챌린지여부
	        iIBSMR0004973.setCusPrtfRgsNo(input.getCusPrtfRgsNo()); // 고객포트폴리오등록번호
	        
	   
	        if(logger.isDebugEnabled()) {
				logger.debug("90190263 머니클립금액이체 COM iIBSMR0004973 {} ::: ", iIBSMR0004973);
			}
			
	        IBSMR0004973_ODT oIBSMR0004973= new IBSMR0004973_ODT();
	        
			WFInfResponse<IBSMR0004973_ODT> mcaOutput = sHRIBSMR0004973_COM.callTrx(iIBSMR0004973, interfaceCfg);
	
			oIBSMR0004973 = mcaOutput.getResponseData();
			
			/**
			 * @BXMType IF
			 * 정상 조회 처리여부
			 */
			output.setOwacFnm(oIBSMR0004973.getOwacFnm()); // 예금주성명
			output.setBftrAfBal(oIBSMR0004973.getBftrAfBal()); // 거래전후잔액
			output.setRnpeFnm(oIBSMR0004973.getRnpeFnm()); // 수취인성명
			output.setTrnSrno(oIBSMR0004973.getTrnSrno()); // 거래일련번호
			output.setFeeAm(oIBSMR0004973.getFeeAm()); // 수수료금액
			output.setRduFeeAm(oIBSMR0004973.getRduFeeAm()); // 감면수수료금액
			output.setWmbRduAm(oIBSMR0004973.getWmbRduAm()); // 우리멤버스감면금액
			output.setFrduRncd(oIBSMR0004973.getFrduRncd()); // 수수료감면사유코드
			output.setNpbokTrnCnt(oIBSMR0004973.getNpbokTrnCnt()); // 무통장거래건수
			output.setTrhsSrno(oIBSMR0004973.getTrhsSrno()); // 거래명세일련번호
			
			//전계좌세션 갱신 요청 24.11.19 
			shrAllActInqTbk_COM.selectSessActList(SHRBSCInquiryConstant.BSC_ACT_LIST_INQ_DIS_ALL, true);
			
			if(logger.isDebugEnabled()) {
				logger.debug("90190263 머니클립금액이체 COM oIBSMR0004973  {} ::: ", oIBSMR0004973);
			}
		
		} catch (Exception e) {
			logger.error("IBSMR0004973 Exception!! {} ", e);
			
			if ( e instanceof SFAdaptorApplicationException ) {
				SFAdaptorApplicationException se = (SFAdaptorApplicationException) e;
				logger.error("SFAdaptorApplicationException {} ", se);
				
				errMsgId = se.getCode();
				Object[] args = se.getArguments();
	            
	            if(args != null && args.length>0) {
	            	errMsgTxt = args[0].toString();
				}
			} else if ( e instanceof SFInterfaceSystemException ) {
				SFInterfaceSystemException se = (SFInterfaceSystemException) e;
				logger.error("SFInterfaceSystemException {} ", se);
				
				errMsgId = se.getMsgId();
				errMsgTxt = se.getMainMsgTxt();
	
			} else if ( e instanceof WFApplicationException) {
				WFApplicationException we = (WFApplicationException) e;
				logger.error("WFApplicationException {} ", we);
				
				errMsgId = we.getCode();
				errMsgTxt = we.getMessage();
				
			} else {
				logger.error("Exception {} ", e);
				errMsgId = "9999";
				errMsgTxt = e.getMessage();				
			}
			
			throw new WFApplicationException("FNSE0006", new Object[] {errMsgTxt}, new Object[] {errMsgId});
		}
		
		if(logger.isDebugEnabled()) {
			logger.debug("90190263 머니클립금액이체 COM output  {} ::: ", output);
		}
		
		return output;
	}
	
	/**
	 * 머니클립 계좌의 거래내역을 조회한다
	 * 
	 * 
	 * @param input 모임통장.기본.정보.조회.컨트롤러.입력.IO
	 * @return 모임통장.기본.정보.조회.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName="머니클립계좌거래내역조회", description="머니클립의 계좌 거래내역을 조회한다.", author="90190263")
	public MnyPinFncTrnSelectTrnPrts_DODT selectTrnPrts(MnyPinFncTrnSelectTrnPrts_DIDT input
	)
	{
		/**
		* @BXMType GetBean
		*/
		// WFInterfaceCfg 생성 컴포넌트
		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class);
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		sHRCodeManager_COM = WFApplicationContext.getBean(sHRCodeManager_COM, SHRCodeManager_COM.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */
		MnyPinFncTrnSelectTrnPrts_DODT output= new MnyPinFncTrnSelectTrnPrts_DODT();
		
		//세션고객정보
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession(); 
		if(logger.isDebugEnabled()) {
			logger.debug("currentCust ====== {} ::: ", currentCust);
		} 
		
		if(logger.isDebugEnabled()) {
			logger.debug("90190263 머니클립계좌거래내역조회 COM input {} ::: ", input);
		}
		
		/**
		 * 계좌기본 정보 조회  [AsIs : WMCDEP1110_01Q]
		 */
		IBSMR0000001_ODT iBSMR0000001_ODT = selectTlmActBsci(input.getAcno());
		String acnoNewDt = WFStringUtils.delDash(StringUtils.nvl(iBSMR0000001_ODT.getNewRcknDt(), "")); // 계좌 신규일자
		
		// Input값 기본 셋팅
		String inqAcno 			= input.getAcno();
		String sdate 				= WFStringUtils.isEmpty(input.getInqStaDt()) ? acnoNewDt : input.getInqStaDt() ; 	// 조회시작일자
		if(input.getInqStaDt().compareTo(acnoNewDt) < 0) {
			sdate = acnoNewDt;
		}
		String edate 				= WFStringUtils.delDash(input.getInqEndDt()); 													// 조회종료일자
		String sortDis 				= WFStringUtils.isEmpty(input.getSortDis()) ? "2" : input.getSortDis();  					// 2 - 최근거래내역 위로, 1 - 과거거래내역위로
		String inqTgtDis			= WFStringUtils.isEmpty(input.getInqTgtDis()) ? "0" : input.getInqTgtDis(); 			// 거래구분 0 : 전체, 1 : 입금 , 2 : 지급
		
		// 거래내역 조회시 필요한 변수 셋팅
		String INQ_SDT_10_FOR_54C201 = "";  // HOST조회시작일
		String INQ_EDT_10_FOR_54C201 = "";  // HOST조회종료일
		String INQ_SDT_10_FOR_54EX02 = "";  // COLD조회시작일
		String INQ_EDT_10_FOR_54EX02 = "";  // COLD조회종료일
		
		String OPNDY2_8             			= "";  // 신규일자
		String VIEWTABLENM_22        	= "";  // VIEW TABLE 명
		String INQSTANO_6        			= "0";
		String IS_FRIST_STEP     			= "Y";
		
		boolean needHost 					= false;
		boolean needCold 					= false;
		
		int oneTimeSelectCount 			= 400; //거래명세 조회시 한번에 가져올 record 크기
		
		// 거래내역합산 정보
		BigDecimal rcvSumAm 				= BigDecimal.ZERO;
		BigDecimal paySumAm 				= BigDecimal.ZERO;
		BigDecimal totSumAm 				= BigDecimal.ZERO;
		BigDecimal d7UndAm 				= BigDecimal.ZERO;
		BigDecimal d7OverAm 				= BigDecimal.ZERO;
		BigDecimal d31OverAm 				= BigDecimal.ZERO;
		
		sHRPropertyService_COM= WFApplicationContext.getBean(sHRPropertyService_COM, SHRPropertyService_COM.class);
		int searchMaxCount = WFStringUtils.null2zero(sHRPropertyService_COM.getProperty("SMART", "FILTER_MAX_COUNT"));  //거래명세시스템 최대 조회 수
		
		String utzpeNo = currentCust.getUserId();
		////////////////////////////////////////////////////////////////////////////////////////////////////
		// 거래내역 최초요청
		// 최초요청시에는 HOST 및 COLD의 필요여부를 알 수 없다.
		////////////////////////////////////////////////////////////////////////////////////////////////////
		if (!needHost && !needCold) {
			String Today = WFDateUtils.getDate("yyyyMMdd");
			int base_date_term 	= -1 * WFDateUtils.daysBetween(WFDateUtils.getDate("yyyyMMdd"),WFDateUtils.getDateFrom("yyyyMMdd", "-3m")); // 거래명세 조회 기준
			
			int date_from_sdate = WFDateUtils.daysBetween(sdate, Today);
			int date_from_edate = WFDateUtils.daysBetween(edate, Today);

			if(logger.isDebugEnabled()) {
				logger.debug("90190263 머니클립계좌거래내역조회 COM date_from_sdate date_from_edate ::: {} / {} ", date_from_sdate , date_from_edate);
			}
			
			// 조회 종료일이 HOST 거래 조회 대상 기간 내일경우 - HOST 거래 대상임
			if (date_from_edate <= base_date_term) {   	
				if (date_from_sdate > base_date_term) { 	
					// 조회 시작일이 HOST 거래 대상 기간 이전일경우 - 거래명세 조회도 병행
					INQ_EDT_10_FOR_54C201 = edate;
					INQ_SDT_10_FOR_54C201 = WFDateUtils.getDateFormatFrom( WFDateUtils.YYYYMMDD , Today, (-1*base_date_term)); // 3개월 기준으로 HOST vs 거래명세 분기
					INQ_EDT_10_FOR_54EX02 = WFDateUtils.getDateFormatFrom( WFDateUtils.YYYYMMDD , INQ_SDT_10_FOR_54C201, -1);
					
					INQ_SDT_10_FOR_54EX02 = sdate;
					needHost = true;
					needCold = true;
				} else { 
					// 조회 시작일이 HOST 거래 조회 대상 기간 내일경우 - HOST 조회만 하도록 함
					INQ_EDT_10_FOR_54C201 = edate;
					INQ_SDT_10_FOR_54C201 = sdate;
					INQ_EDT_10_FOR_54EX02 = "";
					INQ_SDT_10_FOR_54EX02 = "";
					needHost = true;
				}
			} else {   
				// 조회 종료일이 HOST 거래 대상 기간 이전일경우 - 거래명세만 조회해야하는 경우
				INQ_EDT_10_FOR_54C201 = "";
				INQ_SDT_10_FOR_54C201 = "";
				INQ_EDT_10_FOR_54EX02 = edate;
				INQ_SDT_10_FOR_54EX02 = sdate;
				needCold = true;
			}

			logger.debug("[뉴WON] needCold 2[{}] , needHost 2[{}]", needCold, needHost);
			
			// WMCDEP1130_02Q
			if (needCold) {
			int nYearCnt = 0;
				int iCnt = 0;
				String tmpSDATE12 = INQ_SDT_10_FOR_54EX02;
				String tmpEDATE12 = INQ_EDT_10_FOR_54EX02;
				
				do {
					if (iCnt++ > 5) { // 방어로직
						break;
					}
					
					nYearCnt ++;
					tmpEDATE12 = WFDateUtils.getDateFormatFrom(WFDateUtils.YYYYMMDD, INQ_EDT_10_FOR_54EX02, (-365 * (nYearCnt-1)));
					tmpSDATE12 = WFDateUtils.getDateFormatFrom(WFDateUtils.YYYYMMDD, INQ_EDT_10_FOR_54EX02, (-365 * nYearCnt) + 1);
					if (INQ_SDT_10_FOR_54EX02.compareTo(tmpSDATE12) > 0) {
						tmpSDATE12 = INQ_SDT_10_FOR_54EX02;
					}
					if (INQ_SDT_10_FOR_54EX02.compareTo(tmpEDATE12) > 0) {
						tmpEDATE12 = INQ_SDT_10_FOR_54EX02;
					}
					
					// 과거거래내역개수 조회 시작
					{
						/**
						* 연계시스템 호출 TYPE : MCA
						* ID : IBSMR0002912
						* NM : 개인_계좌별거래내역(갯수,ViewTable)
						*/
						sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class);
						WFInterfaceCfg interfaceCfg = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg(); // 아답터 설정 DTO
						interfaceCfg.setInterfaceId("IBSMR0002912");
						
						IBSMR0002912_IDT iBSMR0002912_IDT = new IBSMR0002912_IDT();
						iBSMR0002912_IDT.setTrnCd("01");
						iBSMR0002912_IDT.setAcno(inqAcno);
						iBSMR0002912_IDT.setNewDt(Integer.parseInt(acnoNewDt));
						iBSMR0002912_IDT.setStaDt(tmpSDATE12);
						iBSMR0002912_IDT.setEndDt(tmpEDATE12);
						iBSMR0002912_IDT.setUtzpeNo(utzpeNo);
						
						try {
							sHRIBSMR0002912_COM = WFApplicationContext.getBean(sHRIBSMR0002912_COM, SHRIBSMR0002912_COM.class);
							WFInfResponse<IBSMR0002912_ODT> mcaOutput = sHRIBSMR0002912_COM.callTrx(iBSMR0002912_IDT, interfaceCfg);
							
							IBSMR0002912_ODT iBSMR0002912_ODT = mcaOutput.getResponseData();
							
							OPNDY2_8       = WFStringUtils.null2void(Integer.toString(iBSMR0002912_ODT.getNewDt()));  // 신규일자  OPN_RCKDT_10
							VIEWTABLENM_22 = WFStringUtils.null2void(iBSMR0002912_ODT.getTblNm());  // 뷰테이블  VIEWTABLENM_22
							
							if(logger.isDebugEnabled()) {
								logger.debug("90190263 머니클립계좌거래내역조회 COM 최근거래 OPNDY2_8 / VIEWTABLENM_22  {} {} ::: ", OPNDY2_8, VIEWTABLENM_22);
							}
							
							if ("99".equals(iBSMR0002912_ODT.getTrnCd())) {
								throw new WFApplicationException("BSCE0049"); // 거래가 정상적이지 않습니다. 다시 거래해 주십시요.
							}
						} catch (Exception e) {
							throw new WFApplicationException("BSCE0049"); // 거래가 정상적이지 않습니다. 다시 거래해 주십시요.
						}
					}
				} while(INQ_SDT_10_FOR_54EX02.compareTo(tmpSDATE12) < 0);
			}
		}
		////////////////////////////////////////////////////////////////////////////////////////////////////

		/////////////////////////////////////////////////////////////////
		// 거래내역 조회
		////////////////////////////////////////////////////////////////////////////////////////////////////
		// 조회 거래내역정보
		MnyPinFncTrnSelectTrnPrts_DODT rstList1 = new MnyPinFncTrnSelectTrnPrts_DODT();
		MnyPinFncTrnSelectTrnPrts_DODT rstList2 = new MnyPinFncTrnSelectTrnPrts_DODT();
		
		// 조회 거래내역목록
		List<MNPMnyPinFncTrnSelectTrnPrts_DTO> trnList = new ArrayList<MNPMnyPinFncTrnSelectTrnPrts_DTO>();
		
		// 추가조건 적용 거래내역목록
		List<MNPMnyPinFncTrnSelectTrnPrts_DTO> filtTrnList = new ArrayList<MNPMnyPinFncTrnSelectTrnPrts_DTO>();
		
		IBSMR0000056_IDT iBSMR0000056_IDT = new IBSMR0000056_IDT();
		IBSMR0002913_IDT iBSMR0002913_IDT = new IBSMR0002913_IDT();
		
		int TOT_TEMP_01 = 0;
		int TOT_TEMP_02 = 0;


		/**
		* HOST 거래 InRecord셋팅 
		*/
		iBSMR0000056_IDT.setDpsInpAcno(inqAcno);  // 수신입력계좌번호
		iBSMR0000056_IDT.setCucd("KRW");  // 통화코드
		iBSMR0000056_IDT.setInqDscd("17");  // 조회구분코드
		iBSMR0000056_IDT.setTrnInqMtd(sortDis);  // 거래조회방법
		iBSMR0000056_IDT.setInqBasDt(INQ_SDT_10_FOR_54C201);  // 조회기준일자
		iBSMR0000056_IDT.setInqEndDt(INQ_EDT_10_FOR_54C201);  // 조회종료일자
		iBSMR0000056_IDT.setReqCnt(100);  // 요청건수 (기간내 200건씩 자동연속거래)
		iBSMR0000056_IDT.setRapDscd(inqTgtDis);  // 입지급구분코드
		
		/**
		*	거래명세 InRecord셋팅 
		*/
		if (!"".equals(VIEWTABLENM_22)) {
			iBSMR0002913_IDT.setTrnCd("02");  // 거래코드
			iBSMR0002913_IDT.setAcno(inqAcno);  // 계좌번호
			iBSMR0002913_IDT.setNewDt(Integer.parseInt(OPNDY2_8));  // 신규일자
			iBSMR0002913_IDT.setStaDt(INQ_SDT_10_FOR_54EX02);  // 시작일자
			iBSMR0002913_IDT.setEndDt(INQ_EDT_10_FOR_54EX02);  // 종료일자
			iBSMR0002913_IDT.setUtzpeNo(utzpeNo);  // 이용자번호
			iBSMR0002913_IDT.setInqStaNo(WFStringUtils.getNstring(WFStringUtils.null2zero(INQSTANO_6), 6));  // 조회시작번호
			iBSMR0002913_IDT.setDatCnt(WFStringUtils.getNstring(oneTimeSelectCount, 6));  // 데이터건수
			iBSMR0002913_IDT.setViewTblNm(VIEWTABLENM_22);  // 뷰테이블명
			iBSMR0002913_IDT.setInqSeq(("1".equals(sortDis)?"1":"0"));  // 조회순서 > IBSMR0002913 0 최근 1 과거 조회순서구분	®차세대대응개발
			iBSMR0002913_IDT.setInqDis(Integer.parseInt(inqTgtDis));  // 조회구분 > 입금 출금 구분이 아닌듯, 설정하면 오류발생 
			iBSMR0002913_IDT.setBatDtlIncgYn("0");  // 일괄상세포함여부  0:포함, 1:제외                             
		}
		
		/**
		 *	최초거래
		 */
		boolean isEndTran   	= false;  // 계정계 or 거래명세시스템 true : 거래완료, false : 거래필요
		boolean isHostEmpty 	= false;  // 계정계에 거래내역 없는 경우, 계정계 거래내역이 없는 과거순 정렬시 문제 발생 방지
		
		int countFirstTran 		= 0;

		if(logger.isDebugEnabled()) {
			logger.debug("90190263 머니클립계좌거래내역조회 COM IS_FRIST_STEP  ::: {} ", IS_FRIST_STEP);
		}
		
		if ("Y".equals(IS_FRIST_STEP) && !"".equals(inqAcno)) {
			if ("2".equals(sortDis)) { //최근거래 순
				if(logger.isDebugEnabled()) {
					logger.debug("90190263 머니클립계좌거래내역조회 COM 최근거래 needHost / needCold ::: {} / {} ", needHost, needCold);
				}
				
				if (needHost) { //계정계 거래 필요
					rstList1 = selectLateTrnPrts(iBSMR0000056_IDT);
					TOT_TEMP_01 = rstList1.getGrid().size();
				}
				if (needCold) { //거래명세시스템 거래 필요
					if (!"".equals(VIEWTABLENM_22)) {
						for (int i = 0; i < searchMaxCount; i++) {
							rstList2 = selectPastTrnPrts(iBSMR0002913_IDT);
							TOT_TEMP_02 = TOT_TEMP_02 + rstList2.getGrid().size();
							
							INQSTANO_6 = Integer.toString(WFStringUtils.null2zero(rstList2.getInqStaNo()) + oneTimeSelectCount);  // INQSTANO_6
							if (WFStringUtils.null2zero(INQSTANO_6) > WFStringUtils.null2zero(rstList2.getTotCnt())) {
								isEndTran = true;
								break;
							}
							
							iBSMR0002913_IDT.setInqStaNo(WFStringUtils.getNstring(WFStringUtils.null2zero(INQSTANO_6), 6));  // 조회시작번호
						}
					}
				}
				
				MNPMnyPinFncTrnSelectTrnPrts_DTO item;
				if (TOT_TEMP_01 > 0) {
					Iterator<MNPMnyPinFncTrnSelectTrnPrts_DTO> iter1 = rstList1.getGrid().iterator();
					while ((iter1.hasNext())) {
						item = (MNPMnyPinFncTrnSelectTrnPrts_DTO)iter1.next(); 
						trnList.add(item);
					}
				}
				if (TOT_TEMP_02 > 0) {
					Iterator<MNPMnyPinFncTrnSelectTrnPrts_DTO> iter2 = rstList2.getGrid().iterator();
					while ((iter2.hasNext())) {
						item = (MNPMnyPinFncTrnSelectTrnPrts_DTO)iter2.next(); 
						trnList.add(item);
					}
				}
				
				if (trnList.size() > 0 && TOT_TEMP_01+TOT_TEMP_02 > 0) {
					countFirstTran = trnList.size();
				}
				
				IS_FRIST_STEP = "N";
			}  else {
				if(logger.isDebugEnabled()) {
					logger.debug("90190263 머니클립계좌거래내역조회 COM 과거거래 needHost / needCold {} {} ::: ", needHost, needCold);
				}
				
				if (needCold) {
					if (!"".equals(VIEWTABLENM_22)) {
						for (int i = 0; i < searchMaxCount; i++) {
							rstList2 = selectPastTrnPrts(iBSMR0002913_IDT);
							TOT_TEMP_02 = TOT_TEMP_02+Integer.parseInt(rstList2.getTotCnt());
							
							INQSTANO_6 = Integer.toString(WFStringUtils.null2zero(rstList2.getInqStaNo()) + oneTimeSelectCount);  // INQSTANO_6
							if (WFStringUtils.null2zero(INQSTANO_6) > WFStringUtils.null2zero(rstList2.getTotCnt())) {
								isEndTran = true;
								break;
							}
							
							iBSMR0002913_IDT.setInqStaNo(WFStringUtils.getNstring(WFStringUtils.null2zero(INQSTANO_6), 6));  // 조회시작번호
						}
					}
				}
				
				if (isEndTran && needHost || !needCold && needHost) {
					rstList1 = selectLateTrnPrts(iBSMR0000056_IDT);
					TOT_TEMP_01 = rstList1.getGrid().size();
					// 계정계 거래내역이 없을 때 전문 에러 발생, BEDDP04078 : 거래내역없음
					// selectBatLateTrnPrts 에서 거래내역 없음 오류 시 빈값 리턴
					if(TOT_TEMP_01 <= 0) {
						isHostEmpty = true;
					}
				}
					
				MNPMnyPinFncTrnSelectTrnPrts_DTO item;
				if (TOT_TEMP_02 > 0) {
					Iterator<MNPMnyPinFncTrnSelectTrnPrts_DTO> iter2 = rstList2.getGrid().iterator();
					while ((iter2.hasNext())) {
						item = (MNPMnyPinFncTrnSelectTrnPrts_DTO)iter2.next(); 
						trnList.add(item);
					}
				}
				if (TOT_TEMP_01 > 0) {
					Iterator<MNPMnyPinFncTrnSelectTrnPrts_DTO> iter1 = rstList1.getGrid().iterator();
					while ((iter1.hasNext())) {
						item = (MNPMnyPinFncTrnSelectTrnPrts_DTO)iter1.next(); 
						trnList.add(item);
					}
				}
				
				if (trnList.size() > 0 && TOT_TEMP_01+TOT_TEMP_02 > 0) {
					countFirstTran = trnList.size();
				}
			}
			IS_FRIST_STEP = "N";
		}
		
		if(logger.isDebugEnabled()) {
			logger.debug("90190263 머니클립계좌거래내역조회 COM rstList1  {} ::: ", rstList1);
			logger.debug("90190263 머니클립계좌거래내역조회 COM rstList2  {} ::: ", rstList2);
		}
		
		if (countFirstTran == 0 && !"".equals(inqAcno)) {
			IS_FRIST_STEP = "N";
			isEndTran = false;
			isHostEmpty = false;
			if ("2".equals(sortDis)) { //최근거래내역위
				if (needCold) {
					if (!"".equals(VIEWTABLENM_22)) {
						for (int i = 0; i < searchMaxCount; i++) {
							rstList2 = selectPastTrnPrts(iBSMR0002913_IDT);
							TOT_TEMP_02 = TOT_TEMP_02+Integer.parseInt(rstList2.getTotCnt());
							
							INQSTANO_6 = Integer.toString(WFStringUtils.null2zero(rstList2.getInqStaNo()) + oneTimeSelectCount);  // INQSTANO_6
							if (WFStringUtils.null2zero(INQSTANO_6) > WFStringUtils.null2zero(rstList2.getTotCnt())) {
								isEndTran = true;
								break;
							}
							
							iBSMR0002913_IDT.setInqStaNo(WFStringUtils.getNstring(WFStringUtils.null2zero(INQSTANO_6), 6));  // 조회시작번호
						}
					}
				}
				
				MNPMnyPinFncTrnSelectTrnPrts_DTO item;
				if (TOT_TEMP_02 > 0) {
					Iterator<MNPMnyPinFncTrnSelectTrnPrts_DTO> iter2 = rstList2.getGrid().iterator();
					while ((iter2.hasNext())) {
						item = (MNPMnyPinFncTrnSelectTrnPrts_DTO)iter2.next(); 
						trnList.add(item);
					}
				}
			} else {
				if (needCold) {
					if (!"".equals(VIEWTABLENM_22)) {
						for (int i = 0; i < searchMaxCount; i++) {
							rstList2 = selectPastTrnPrts(iBSMR0002913_IDT);
							TOT_TEMP_02 = TOT_TEMP_02+Integer.parseInt(rstList2.getTotCnt());
							
							INQSTANO_6 = Integer.toString(WFStringUtils.null2zero(rstList2.getInqStaNo()) + oneTimeSelectCount);  // INQSTANO_6
							if (WFStringUtils.null2zero(INQSTANO_6) > WFStringUtils.null2zero(rstList2.getTotCnt())) {
								isEndTran = true;
								break;
							}
							
							iBSMR0002913_IDT.setInqStaNo(WFStringUtils.getNstring(WFStringUtils.null2zero(INQSTANO_6), 6));  // 조회시작번호
						}
					}
				}
				if (isEndTran && needHost) {
					rstList1 = selectLateTrnPrts(iBSMR0000056_IDT);
					TOT_TEMP_01 = rstList1.getGrid().size();
					// 계정계 거래내역이 없을 때 전문 에러 발생, BEDDP04078 : 거래내역없음
					// selectBatLateTrnPrts 에서 거래내역 없음 오류 시 빈값 리턴
					if(TOT_TEMP_01 <= 0) {
						isHostEmpty = true;
					}
				}
				
				MNPMnyPinFncTrnSelectTrnPrts_DTO item;
				if (TOT_TEMP_02 > 0) {
					Iterator<MNPMnyPinFncTrnSelectTrnPrts_DTO> iter2 = rstList2.getGrid().iterator();
					while ((iter2.hasNext())) {
						item = (MNPMnyPinFncTrnSelectTrnPrts_DTO)iter2.next(); 
						trnList.add(item);
					}
				}
				if (TOT_TEMP_01 > 0) {
					Iterator<MNPMnyPinFncTrnSelectTrnPrts_DTO> iter1 = rstList1.getGrid().iterator();
					while ((iter1.hasNext())) {
						item = (MNPMnyPinFncTrnSelectTrnPrts_DTO)iter1.next(); 
						trnList.add(item);
					}
				}
			}
		} // if end
		////////////////////////////////////////////////////////////////////////////////////////////////////

		if(logger.isDebugEnabled()) {
			logger.debug("90190263 머니클립계좌거래내역조회 COM Size {} / trnList  {} ::: ", trnList.size(),trnList);
		}

		////////////////////////////////////////////////////////////////////////////////////////////////////
		// 검색 필터링 처리
		////////////////////////////////////////////////////////////////////////////////////////////////////
		String START_AM = WFStringUtils.trim(WFStringUtils.null2void(input.getMinAm()));     // 필터링 시작 금액
		String END_AM   	= WFStringUtils.trim(WFStringUtils.null2void(input.getMaxAm()));     // 필터링 종료 금액
		
		MNPMnyPinFncTrnSelectTrnPrts_DTO rowItem;
		Iterator<MNPMnyPinFncTrnSelectTrnPrts_DTO> iter = trnList.iterator();
		long currentAm = 0;
		BigDecimal bc = BigDecimal.ZERO;
		while ((iter.hasNext())) {
			rowItem = (MNPMnyPinFncTrnSelectTrnPrts_DTO)iter.next();

			if(logger.isDebugEnabled()) {
				logger.debug("90190263 머니클립계좌거래내역조회 COM rowItem  {} ::: ", rowItem);
			}
			
			String PAY_YN = WFStringUtils.null2void(rowItem.getPayYn()); // 'Y':지급, 'N':입금
			
			long startAm 	= Long.parseLong(WFStringUtils.null2ZeroStr(input.getMinAm()));
			long endAm 	= Long.parseLong(WFStringUtils.null2ZeroStr(input.getMaxAm()));
			
			if ("Y".equals(PAY_YN)) {
				bc = (null == rowItem.getPayAm() ? BigDecimal.ZERO : rowItem.getPayAm());
				currentAm = bc.longValue();
			} else {
				bc = (null == rowItem.getRcvAm() ? BigDecimal.ZERO : rowItem.getRcvAm());
				currentAm = bc.longValue();
			}
			
			if(logger.isDebugEnabled()) {
				logger.debug("90190263 머니클립계좌거래내역조회 COM START_AM / END_AM {} / {} ::: ", START_AM , END_AM);	
			}
			// 추가조건에 맞는 ROW 추가
			if (!"".equals(START_AM) && !"".equals(END_AM) && !"0".equals(END_AM)) {
				if (startAm <= currentAm && currentAm <= endAm) {
					filtTrnList.add(rowItem);
				}
			} else {
				filtTrnList.add(rowItem);
			}
		}
		////////////////////////////////////////////////////////////////////////////////////////////////////
		
		if(logger.isDebugEnabled()) {
			logger.debug("90190263 머니클립계좌거래내역조회 COM filtTrnList  {} ::: ", filtTrnList);	
		}
		
		////////////////////////////////////////////////////////////////////////////////////////////////////
		// output 설정
		////////////////////////////////////////////////////////////////////////////////////////////////////
		output.setGrid(filtTrnList); // 거래목록
		
		// 지급합계금액 계산
		paySumAm = paySumAm.add(rstList1.getPaySumAm());
		paySumAm = paySumAm.add(rstList2.getPaySumAm());
		
		output.setPaySumAm(paySumAm); // 지급합계금액
		
		// 입금합계금액 계산		
		rcvSumAm = rcvSumAm.add(rstList1.getRcvSumAm());
		rcvSumAm = rcvSumAm.add(rstList2.getRcvSumAm());
		
		output.setRcvSumAm(rcvSumAm); // 입금합계금액 
		
		output.setTotSumAm(totSumAm); // 총합계금액 > WON 사용안함
		
		// 7일미만 계산
		d7UndAm = d7UndAm.add(rstList1.getD7UndAm());
		d7UndAm = d7UndAm.add(rstList2.getD7UndAm());
		
		output.setD7UndAm(d7UndAm);
		
		// 7일이상 계산
		d7OverAm = d7OverAm.add(rstList1.getD7OverAm());
		d7OverAm = d7OverAm.add(rstList2.getD7OverAm());
		
		output.setD7OverAm(d7OverAm);
		
		// 31일 이상 계산
		d31OverAm = d31OverAm.add(rstList1.getD31OverAm());
		d31OverAm = d31OverAm.add(rstList2.getD31OverAm());
		
		output.setD31OverAm(d31OverAm); 
		
		// 상품명 설정
		String pdcd = iBSMR0000001_ODT.getPdcd();
		String pdcdNm = sHRCodeManager_COM.getCode("PDCD", pdcd); // 상품코드의 상품명이 없다면 상품코드 반환  // 상품코드 (asis코드:9018)
		if (pdcd.equals(pdcdNm)) { // 상품코드와 상품명이 같다면 없다는것 이므로 상위 상품코드로 검색
			pdcdNm = sHRCodeManager_COM.getCode("PDCD", pdcd.substring(0, 3) + "0000000000"); // 상품코드 (asis코드:9018)
		}
		output.setPdcdNm(pdcdNm);
		
		output.setCnsgComNm(iBSMR0000001_ODT.getCnsgComNm()); // 위탁회사명
		output.setPdcd(iBSMR0000001_ODT.getPdcd()); // 상품코드
		output.setActMngBrcd(iBSMR0000001_ODT.getActMngBrcd()); // 계좌관리점코드
		output.setOwacFnm(iBSMR0000001_ODT.getOwacFnm()); // 예금주성명
		output.setFstNewRcknDt(iBSMR0000001_ODT.getFstNewRcknDt()); // 최초신규기산일자
		output.setInqAcno(iBSMR0000001_ODT.getAcno()); // 조회계좌번호
		output.setSynpbPdcd(iBSMR0000001_ODT.getSynpbPdcd()); // 종합통장상품코드
		
		output.setTotBal(iBSMR0000001_ODT.getCtBal());
		output.setPbokLnlmAm(iBSMR0000001_ODT.getPbokLnlmAm());
		output.setPsklEpdt(iBSMR0000001_ODT.getPsklEpdt());
		output.setPayAvlAm(iBSMR0000001_ODT.getPayAvlAm()); // 지급가능금액

		if(logger.isDebugEnabled()) {
			logger.debug("90190263 머니클립계좌거래내역조회 COM output  {} ::: ", output);
		}
		
		return output;
	}
	

	/**
	 * 계좌기본정보조회, IBSMR0000001
	 * 
	 * @param input 전체계좌조회거래내역.요구불.거래목록.요구불.입력.컴포넌트.공통.IO
	 * @return 전체계좌조회거래내역.요구불.거래목록.요구불.출력.컴포넌트.공통.IO
	 */
	@BxmCategory(logicalName="전문.계좌기본정보.조회", description="계좌기본정보조회, IBSMR0000001", author="90190314")
	private IBSMR0000001_ODT selectTlmActBsci(String acno) throws WFApplicationException  {
		/**
		 * @BXMType VariableDeclaration
		 */
		IBSMR0000001_ODT output= new IBSMR0000001_ODT();
		logger.debug("전문계좌기본정보.조회 selectTlmActBsci start {}", acno);
		
		sHRIBSMR0000001_COM = WFApplicationContext.getBean(sHRIBSMR0000001_COM, SHRIBSMR0000001_COM.class);
		
		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class); 
		
		/**
		 * 연계시스템 호출
		 * TYPE : MCA
		 * ID : IBSMR0000001
		 * NM : 전문계좌기본정보.조회
		 */
		WFInterfaceCfg interfaceCfg = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg(); // 아답터 설정 DTO
		interfaceCfg.setInterfaceId("IBSMR0000001");
		
		WFNciHeader tpyNciHeader = interfaceCfg.getNciHeader();
		tpyNciHeader.setAcno(acno);
		interfaceCfg.setNciHeader(tpyNciHeader);
		
		String inqBasDt = WFDateUtils.get(WFDateUtils.YYYYMMDD);
		
		IBSMR0000001_IDT iBSMR0000001_IDT = new IBSMR0000001_IDT();
		iBSMR0000001_IDT.setInqAcno(acno);  // 조회계좌번호
		iBSMR0000001_IDT.setActPwnoUsgYn("N");    		// 계좌비밀번호사용여부
		iBSMR0000001_IDT.setEncyPwno("00000000");  	// 계좌비밀번호
		iBSMR0000001_IDT.setInqBasDt(inqBasDt);    		// 조회기준일
		
		try {
			WFInfResponse<IBSMR0000001_ODT> mcaOutput = sHRIBSMR0000001_COM.callTrx(iBSMR0000001_IDT, interfaceCfg);
			
			output = mcaOutput.getResponseData();
			
		} catch (SFInterfaceSystemException e) {
			logger.debug("{}", e);
			throw new WFApplicationException("BSCE0049"); // 거래가 정상적이지 않습니다. 다시 거래해 주십시요.
		}
		
		return output;
	}
	
	/**
	 * 머니클립의 받을 이자 계산 정보 조회
	 * 
	 * 
	 * @param input 머니클립.이자.계산.정보.조회.컨트롤러.입력.IO
	 * @return 머니클립.이자.계산.정보.조회.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName="머니클립이자계산정보조회", description="머니클립의 이자 계산 정보를 조회하는 컴포넌트", author="90191355")
	public MNPMnyPinFncTrnSelectMnpIntCalInf_DODT selectMnpIntCalInf(MNPMnyPinFncTrnSelectMnpIntCalInf_DIDT input
	)
	{
		/**
		* @BXMType GetBean
		*/
		// WFInterfaceCfg 생성 컴포넌트
		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class);
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		sHRIBSMR0006159_COM= WFApplicationContext.getBean(sHRIBSMR0006159_COM, SHRIBSMR0006159_COM.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */
		MNPMnyPinFncTrnSelectMnpIntCalInf_DODT output= new MNPMnyPinFncTrnSelectMnpIntCalInf_DODT();
		
		if(logger.isDebugEnabled()) {
			logger.debug("머니클립 이자계산정보조회 COM input {} ::: ", input);
		}
		
		String errMsgTxt = "";
		String errMsgId = "";
		
		/**
		 * 연계시스템 호출
		 * TYPE : MCA
		 * ID : IBSMR0006159
		 * NM :이자 계산 내역 조회
		 */
		try{
			//  MCA WFInterfaceCfg 객체 획득
			WFInterfaceCfg interfaceCfg  = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg();
			interfaceCfg.setInterfaceId("IBSMR0006159");
	        
	        IBSMR0006159_IDT iIBSMR0006159 = new IBSMR0006159_IDT();
	        iIBSMR0006159.setDpsInpAcno(input.getDpsInpAcno()); // 수신입력계좌번호
	        iIBSMR0006159.setTrnDscd("5"); // 거래구분코드
	        iIBSMR0006159.setInqDscd("31"); // 조회구분코드
	        iIBSMR0006159.setInqEndDt(input.getInqEndDt()); // 조회종료일자
	   
	        if(logger.isDebugEnabled()) {
				logger.debug("이자 계산 내역 조회 COM iIBSMR0006159 {} ::: ", iIBSMR0006159);
			}
	        
			WFInfResponse<IBSMR0006159_ODT> mcaOutput = sHRIBSMR0006159_COM.callTrx(iIBSMR0006159, interfaceCfg);
	
			IBSMR0006159_ODT oIBSMR0006159 = mcaOutput.getResponseData();
			
			if(logger.isDebugEnabled()) {
				logger.debug("이자 계산 내역 조회 COM oIBSMR0006159  {} ::: ", oIBSMR0006159);
			}
			/**
			 * @BXMType IF
			 * 정상 조회 처리여부
			 */
			int gridCnt = oIBSMR0006159.getGridCnt();
			output.setGridCnt(gridCnt); // 그리드건수
			if (gridCnt > 0) {
				List<MNPMnyPinFncTrnSelectMnpIntCalInfList_DODT> grid = new ArrayList<MNPMnyPinFncTrnSelectMnpIntCalInfList_DODT>();
				
				List<IBSMR0006159_GRID_ODT> dodtGrid = oIBSMR0006159.getGrid();
				for (IBSMR0006159_GRID_ODT dodtGridItem: dodtGrid) {
					MNPMnyPinFncTrnSelectMnpIntCalInfList_DODT gridItem = new MNPMnyPinFncTrnSelectMnpIntCalInfList_DODT();
					gridItem.setRcvDt(dodtGridItem.getRcvDt()); // 입금일자
					gridItem.setIntCalStaDt(dodtGridItem.getIntCalStaDt()); // 이자계산시작일자
					gridItem.setIntCalEndDt(dodtGridItem.getIntCalEndDt()); // 이자계산종료일자
					gridItem.setIntAamAm(dodtGridItem.getIntAamAm()); // 이자적수금액
					gridItem.setAplIrt(dodtGridItem.getAplIrt()); // 적용이율
					gridItem.setIntAm(dodtGridItem.getIntAm()); // 이자금액
					gridItem.setIrngYn(dodtGridItem.getIrngYn()); // 금리네고여부
					gridItem.setRvsnIntYn(dodtGridItem.getRvsnIntYn()); // 보정이자여부
					
					grid.add(gridItem);
				}
				output.setGrid(grid); // 그리드
				
			}
			output.setIntSumAm(oIBSMR0006159.getIntSumAm()); // 이자합계금액
		

			if(logger.isDebugEnabled()) {
				logger.debug("이자 계산 내역 조회 COM output  {} ::: ", output);
			}
		} catch (Exception e) {
			logger.error("IBSMR0006159 Exception!! {} ", e);
			
			if ( e instanceof SFAdaptorApplicationException ) {
				SFAdaptorApplicationException se = (SFAdaptorApplicationException) e;
				logger.error("SFAdaptorApplicationException {} ", se);
				
				errMsgId = se.getCode();
				Object[] args = se.getArguments();
	            
	            if(args != null && args.length>0) {
	            	errMsgTxt = args[0].toString();
				}
			} else if ( e instanceof SFInterfaceSystemException ) {
				SFInterfaceSystemException se = (SFInterfaceSystemException) e;
				logger.error("SFInterfaceSystemException {} ", se);
				
				errMsgId = se.getMsgId();
				errMsgTxt = se.getMainMsgTxt();
	
			} else if ( e instanceof WFApplicationException) {
				WFApplicationException we = (WFApplicationException) e;
				logger.error("WFApplicationException {} ", we);
				
				errMsgId = we.getCode();
				errMsgTxt = we.getMessage();
				
			} else {
				logger.error("Exception {} ", e);
				errMsgId = "9999";
				errMsgTxt = e.getMessage();				
			}
			
			throw new WFApplicationException("FNSE0006", new Object[] {errMsgTxt}, new Object[] {errMsgId});
		}
		
		return output;
	}
	
	/**
	 * 머니클립의 받을 세금 이자 정보 조회 (해지예상조회)
	 * 
	 * 
	 * @param input 머니클립.세금.이자.정보.조회.컨트롤러.입력.IO
	 * @return 머니클립.세금.이자.정보.조회.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName="머니클립세금이자정보조회", description="머니클립의 세금 이자 정보를 조회하는 컴포넌트", author="90191355")
	public MNPMnyPinFncTrnSelectMnpTxIntInf_DODT selectMnpTxIntnf(MNPMnyPinFncTrnSelectMnpTxIntInf_DIDT input
	)
	{
		/**
		* @BXMType GetBean
		*/
		// WFInterfaceCfg 생성 컴포넌트
		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class);
		sHRIBSMR0006171_COM= WFApplicationContext.getBean(sHRIBSMR0006171_COM, SHRIBSMR0006171_COM.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */
		MNPMnyPinFncTrnSelectMnpTxIntInf_DODT output= new MNPMnyPinFncTrnSelectMnpTxIntInf_DODT();
		
		if(logger.isDebugEnabled()) {
			logger.debug("머니클립 세금이자정보조회 COM input {} ::: ", input);
		}
		
		String errMsgTxt = "";
		String errMsgId = "";
		
		/**
		 * 연계시스템 호출
		 * TYPE : MCA
		 * ID : IBSMR0006171
		 * NM :이자 계산 내역 조회
		 */
		try{
			//  MCA WFInterfaceCfg 객체 획득
			WFInterfaceCfg interfaceCfg  = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg();
			interfaceCfg.setInterfaceId("IBSMR0006171");
			
	        IBSMR0006171_IDT iIBSMR0006171 = new IBSMR0006171_IDT();
	        iIBSMR0006171.setDpsInpAcno(input.getDpsInpAcno()); // 수신입력계좌번호
	        iIBSMR0006171.setTrnDscd("5"); // 거래구분코드
	        iIBSMR0006171.setInqDscd("01"); // 조회구분코드
	   
	        if(logger.isDebugEnabled()) {
				logger.debug("세금이자정보조회 COM iIBSMR0006171 {} ::: ", iIBSMR0006171);
			}
	        
			WFInfResponse<IBSMR0006171_ODT> mcaOutput = sHRIBSMR0006171_COM.callTrx(iIBSMR0006171, interfaceCfg);
	
			IBSMR0006171_ODT oIBSMR0006171 = mcaOutput.getResponseData();
			
			if(logger.isDebugEnabled()) {
				logger.debug("세금이자정보조회 COM oIBSMR0006171  {} ::: ", oIBSMR0006171);
			}
			/**
			 * @BXMType IF
			 * 정상 조회 처리여부
			 */
			output.setTmntFrcsDt(oIBSMR0006171.getTmntFrcsDt()); // 해지예상일자
			output.setNewDt(oIBSMR0006171.getNewDt()); // 신규일자
			output.setXprDt(oIBSMR0006171.getXprDt()); // 만기일자
			output.setCancDisNm(oIBSMR0006171.getCancDisNm()); // 해지구분명
			output.setPrnAm(oIBSMR0006171.getPrnAm()); // 원금금액
			output.setTotIntAm(oIBSMR0006171.getTotIntAm()); // 총이자금액
			output.setBscIntAm(oIBSMR0006171.getBscIntAm()); // 기본이자금액
			output.setSpclIntAm(oIBSMR0006171.getSpclIntAm()); // 특별이자금액
			output.setAfepIntAm(oIBSMR0006171.getAfepIntAm()); // 만기후이자금액
			output.setRstrIctx(oIBSMR0006171.getRstrIctx()); // 환출소득세
			output.setRstrRdtx(oIBSMR0006171.getRstrRdtx()); // 환출주민세
			output.setRstrSrtx(oIBSMR0006171.getRstrSrtx()); // 환출농특세
			output.setImpAttxSumAm(oIBSMR0006171.getImpAttxSumAm()); // 수입제세합계금액
			output.setIntIctx(oIBSMR0006171.getIntIctx()); // 이자소득세
			output.setIntIcmRdtx(oIBSMR0006171.getIntIcmRdtx()); // 이자소득주민세
			output.setIntIcmSrtx(oIBSMR0006171.getIntIcmSrtx()); // 이자소득농특세
			output.setCnrnAm(oIBSMR0006171.getCnrnAm()); // 출연금액
			output.setRrint(oIBSMR0006171.getRrint()); // 환입이자
			output.setDdctSumAm(oIBSMR0006171.getDdctSumAm()); // 공제합계금액
			output.setDduPayAm(oIBSMR0006171.getDduPayAm()); // 차감지급금액
			output.setEctx(oIBSMR0006171.getEctx()); // 교육세
			output.setDftx(oIBSMR0006171.getDftx()); // 방위세
			output.setRvsnAm(oIBSMR0006171.getRvsnAm()); // 보정금액
			output.setSlchIntx(oIBSMR0006171.getSlchIntx()); // 추징이자세
			output.setSlchPvnsIctx(oIBSMR0006171.getSlchPvnsIctx()); // 추징지방소득세
			output.setPaySumAm(oIBSMR0006171.getPaySumAm()); // 지급합계금액
			output.setFcIntAm(oIBSMR0006171.getFcIntAm()); // 외화이자금액
			output.setFcRstrAttxAm(oIBSMR0006171.getFcRstrAttxAm()); // 외화환출제세금액
			output.setFcRrintAm(oIBSMR0006171.getFcRrintAm()); // 외화환입이자금액
			output.setFcImpAttxAm(oIBSMR0006171.getFcImpAttxAm()); // 외화수입제세금액
			output.setPstmRticmStaxAm(oIBSMR0006171.getPstmRticmStaxAm()); // 이연퇴직소득과세표준금액
			output.setPstmPnsnIctx(oIBSMR0006171.getPstmPnsnIctx()); // 이연연금소득세
			output.setPstmRticmUsgAm(oIBSMR0006171.getPstmRticmUsgAm()); // 이연퇴직소득사용금액
			output.setPstmPnsnRdtx(oIBSMR0006171.getPstmPnsnRdtx()); // 이연연금주민세
			output.setPstmRticmTax(oIBSMR0006171.getPstmRticmTax()); // 이연퇴직소득세
			output.setPstmRtrtRdtx(oIBSMR0006171.getPstmRtrtRdtx()); // 이연퇴직주민세
			output.setRtnPocpFee(oIBSMR0006171.getRtnPocpFee()); // 반환선취수수료
			output.setEtcIcmStaxAm(oIBSMR0006171.getEtcIcmStaxAm()); // 기타소득과세표준금액
			output.setStaxHovMnuAdj(oIBSMR0006171.getStaxHovMnuAdj()); // 과세표준유보분조정
			output.setFeeStaxDdu(oIBSMR0006171.getFeeStaxDdu()); // 수수료과세표준차감
			output.setUsumEvlAm(oIBSMR0006171.getUsumEvlAm()); // 합산평가금액
			output.setMoAcno(oIBSMR0006171.getMoAcno()); // 모계좌번호
			output.setFrgStcLossOfst(oIBSMR0006171.getFrgStcLossOfst()); // 해외주식손실상계
			output.setStaxDduTcmPfeAm(oIBSMR0006171.getStaxDduTcmPfeAm()); // 과세표준차감성과보수금액
			output.setLstStaxAm(oIBSMR0006171.getLstStaxAm()); // 최종과세표준금액
			output.setSmplPrftRt(oIBSMR0006171.getSmplPrftRt()); // 단순수익율
			output.setHcanFee(oIBSMR0006171.getHcanFee()); // 중도해지수수료
			output.setYrXcPtrt(oIBSMR0006171.getYrXcPtrt()); // 연환산수익률
			output.setEtcIctx(oIBSMR0006171.getEtcIctx()); // 기타소득세
			output.setEtcRdtx(oIBSMR0006171.getEtcRdtx()); // 기타주민세
			output.setPnsnIctx(oIBSMR0006171.getPnsnIctx()); // 연금소득세
			output.setPnsnPvnsIctx(oIBSMR0006171.getPnsnPvnsIctx()); // 연금지방소득세
			output.setPnsnIcmStaxAm(oIBSMR0006171.getPnsnIcmStaxAm()); // 연금소득과세표준금액
			output.setAtcnt(oIBSMR0006171.getAtcnt()); // 좌수
			output.setCtrmvFee(oIBSMR0006171.getCtrmvFee()); // 계약이전수수료
			output.setLnintAm(oIBSMR0006171.getLnintAm()); // 대출이자금액
			output.setFintAm(oIBSMR0006171.getFintAm()); // 연체이자금액
			output.setLnPrnDelyRprnm(oIBSMR0006171.getLnPrnDelyRprnm()); // 대출원금지연배상금
			output.setDpacLnNcitAm(oIBSMR0006171.getDpacLnNcitAm()); // 수신계좌대출미수이자금액
			output.setLnNcitDelyRprnm(oIBSMR0006171.getLnNcitDelyRprnm()); // 대출미수이자지연배상금
			output.setLmtNuseFee(oIBSMR0006171.getLmtNuseFee()); // 한도미사용수수료
			output.setKrxcAm(oIBSMR0006171.getKrxcAm()); // 원화환산금액
			output.setKrxcCancAm(oIBSMR0006171.getKrxcCancAm()); // 원화환산해지금액
			output.setPrftRt(oIBSMR0006171.getPrftRt()); // 수익율
			output.setLstStaxAm2(oIBSMR0006171.getLstStaxAm2()); // 최종과세표준금액_2
			output.setMvavBuyUp(oIBSMR0006171.getMvavBuyUp()); // 이동평균매입단가
			output.setTetBuyRt(oIBSMR0006171.getTetBuyRt()); // 전신환매입율
			output.setTrtFndYn(oIBSMR0006171.getTrtFndYn()); // 신탁펀드여부
			output.setFractYn(oIBSMR0006171.getFractYn()); // 외화계좌여부
			output.setgTrnDscd(oIBSMR0006171.getgTrnDscd()); // 골드거래구분코드
			output.setLnYn(oIBSMR0006171.getLnYn()); // 대출여부
			output.setDpsApirt(oIBSMR0006171.getDpsApirt()); // 수신적용이율
			output.setDntnAm(oIBSMR0006171.getDntnAm()); // 기부금액
			output.setHmnyAcldAm(oIBSMR0006171.getHmnyAcldAm()); // 꿀머니적립금액
			output.setPpayIntAm(oIBSMR0006171.getPpayIntAm()); // 선지급이자금액
			output.setEtcTxt(oIBSMR0006171.getEtcTxt()); // 기타내용
			output.setInqCucd(oIBSMR0006171.getInqCucd()); // 조회통화코드
			output.setSlchStaxAm(oIBSMR0006171.getSlchStaxAm()); // 추징과세표준금액
			output.setPayBasPr(oIBSMR0006171.getPayBasPr()); // 지급기준가격
			output.setStaxBasPr(oIBSMR0006171.getStaxBasPr()); // 과세표준기준가격
			output.setKrwXchInciAm(oIBSMR0006171.getKrwXchInciAm()); // 원화환산입금액
			output.setKrxcWthdAm(oIBSMR0006171.getKrxcWthdAm()); // 원화환산인출금액
			output.setPlAm(oIBSMR0006171.getPlAm()); // 손익금액
			output.setCusPrftRt(oIBSMR0006171.getCusPrftRt()); // 고객수익율
			output.setPotWthdAm(oIBSMR0006171.getPotWthdAm()); // 일부인출금액
			output.setAvgXrtIntAm(oIBSMR0006171.getAvgXrtIntAm()); // 평균환율이자금액
			output.setCusAplSellXrt(oIBSMR0006171.getCusAplSellXrt()); // 고객적용매도환율
			output.setDdctAm(oIBSMR0006171.getDdctAm()); // 공제금액
			output.setWthdAmSumAm(oIBSMR0006171.getWthdAmSumAm()); // 인출금액합계금액
			output.setBfdnAcmPrftRt(oIBSMR0006171.getBfdnAcmPrftRt()); // 차감전누적수익율
			output.setAfdnAcmPrftRt(oIBSMR0006171.getAfdnAcmPrftRt()); // 차감후누적수익율

			if(logger.isDebugEnabled()) {
				logger.debug("세금이자정보조회 COM output  {} ::: ", output);
			}
		
		} catch (Exception e) {
			logger.error("IBSMR0006171 Exception!! {} ", e);
			
			if ( e instanceof SFAdaptorApplicationException ) {
				SFAdaptorApplicationException se = (SFAdaptorApplicationException) e;
				logger.error("SFAdaptorApplicationException {} ", se);
				
				errMsgId = se.getCode();
				Object[] args = se.getArguments();
	            
	            if(args != null && args.length>0) {
	            	errMsgTxt = args[0].toString();
				}
			} else if ( e instanceof SFInterfaceSystemException ) {
				SFInterfaceSystemException se = (SFInterfaceSystemException) e;
				logger.error("SFInterfaceSystemException {} ", se);
				
				errMsgId = se.getMsgId();
				errMsgTxt = se.getMainMsgTxt();
	
			} else if ( e instanceof WFApplicationException) {
				WFApplicationException we = (WFApplicationException) e;
				logger.error("WFApplicationException {} ", we);
				
				errMsgId = we.getCode();
				errMsgTxt = we.getMessage();
				
			} else {
				logger.error("Exception {} ", e);
				errMsgId = "9999";
				errMsgTxt = e.getMessage();				
			}
			
			throw new WFApplicationException("FNSE0006", new Object[] {errMsgTxt}, new Object[] {errMsgId});
		}
		
		return output;
	}
	
	/**
	 * 머니클립 즉시이자받기 
	 * 
	 * @param input 머니클립.이자.계산.정보.조회.컨트롤러.입력.IO
	 * @return 머니클립.이자.계산.정보.조회.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName="머니클립즉시이자받기 ", description="머니클립 즉시 이자 받는 컴포넌트", author="90191355")
	public MNPMnyPinFncTrnInsertMnpImdtInt_DODT insertMnpImdtInt(MNPMnyPinFncTrnInsertMnpImdtInt_DIDT input
	)
	{
		/**
		* @BXMType GetBean
		*/
		// WFInterfaceCfg 생성 컴포넌트
		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class);
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		sHRIBSMR0006165_COM= WFApplicationContext.getBean(sHRIBSMR0006165_COM, SHRIBSMR0006165_COM.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */
		MNPMnyPinFncTrnInsertMnpImdtInt_DODT output= new MNPMnyPinFncTrnInsertMnpImdtInt_DODT();
		
		if(logger.isDebugEnabled()) {
			logger.debug("머니클립 즉시이자받기 COM input {} ::: ", input);
		}
		
		String errMsgTxt = "";
		String errMsgId = "";
		
		/**
		 * 연계시스템 호출
		 * TYPE : MCA
		 * ID : IBSMR0006165
		 * NM :즉시 이자 받기
		 */
		try{
			//  MCA WFInterfaceCfg 객체 획득
			WFInterfaceCfg interfaceCfg  = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg();
			interfaceCfg.setInterfaceId("IBSMR0006165");
			
	        IBSMR0006165_IDT iIBSMR0006165 = new IBSMR0006165_IDT();
	        iIBSMR0006165.setAdjTrnDscd("A00005");//조정거래구분코드
	        iIBSMR0006165.setCucd("KRW");//통화코드
	        iIBSMR0006165.setDpsAcno(input.getDpsAcno());//계좌번호
	   
	        if(logger.isDebugEnabled()) {
				logger.debug("즉시이자받기 COM iIBSMR0006165 {} ::: ", iIBSMR0006165);
			}
			
			WFInfResponse<IBSMR0006165_ODT> mcaOutput = sHRIBSMR0006165_COM.callTrx(iIBSMR0006165, interfaceCfg);
	
			IBSMR0006165_ODT oIBSMR0006165 = mcaOutput.getResponseData();
			if(logger.isDebugEnabled()) {
				logger.debug("즉시이자받기 COM oIBSMR0006159  {} ::: ", oIBSMR0006165);
			}
			/**
			 * @BXMType IF
			 * 정상 조회 처리여부
			 */
			//정상처리
			output.setPrcRtcd("0000"); // 처리결과코드
			output.setPrcRstTxt("성공"); // 처리결과내용

			if(logger.isDebugEnabled()) {
				logger.debug("즉시이자받기 COM output  {} ::: ", output);
			}
		} catch (Exception e) {
			logger.error("IBSMR0006165 Exception!! {} ", e);
			
			if ( e instanceof SFAdaptorApplicationException ) {
				SFAdaptorApplicationException se = (SFAdaptorApplicationException) e;
				logger.error("SFAdaptorApplicationException {} ", se);
				
				errMsgId = se.getCode();
				Object[] args = se.getArguments();
	            
	            if(args != null && args.length>0) {
	            	errMsgTxt = args[0].toString();
				}
			} else if ( e instanceof SFInterfaceSystemException ) {
				SFInterfaceSystemException se = (SFInterfaceSystemException) e;
				logger.error("SFInterfaceSystemException {} ", se);
				
				errMsgId = se.getMsgId();
				errMsgTxt = se.getMainMsgTxt();
	
			} else if ( e instanceof WFApplicationException) {
				WFApplicationException we = (WFApplicationException) e;
				logger.error("WFApplicationException {} ", we);
				
				errMsgId = we.getCode();
				errMsgTxt = we.getMessage();
				
			} else {
				logger.error("Exception {} ", e);
				errMsgId = "9999";
				errMsgTxt = e.getMessage();				
			}
			
			throw new WFApplicationException("FNSE0006", new Object[] {errMsgTxt}, new Object[] {errMsgId});
		}
		
		
		return output;
	}

	/**
	 * 머니클립 받은 이자 내역 조회
	 * 
	 * @param input 머니클립.이자.내역.조회.컨트롤러.입력.IO
	 * @return 머니클립.이자.내역.조회.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName="머니클립이자내역조회", description="머니클립의 받은 이자 내역을 조회하는 컴포넌트", author="90191355")
	public MNPMnyPinFncTrnSelectMnpIntPrts_DODT selectMnpIntPrts(MNPMnyPinFncTrnSelectMnpIntPrts_DIDT input
	)
	{
		/**
		* @BXMType GetBean
		*/
		// WFInterfaceCfg 생성 컴포넌트
		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class);
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		sHRIBSMR0006158_COM= WFApplicationContext.getBean(sHRIBSMR0006158_COM, SHRIBSMR0006158_COM.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */
		MNPMnyPinFncTrnSelectMnpIntPrts_DODT output= new MNPMnyPinFncTrnSelectMnpIntPrts_DODT();
		
		if(logger.isDebugEnabled()) {
			logger.debug("머니클립 받은 이자 내역 조회 COM input {} ::: ", input);
		}
		String errMsgTxt = "";
		String errMsgId = "";
		
		/**
		 * 연계시스템 호출
		 * TYPE : MCA
		 * ID : IBSMR0006158
		 * NM :받은 이자 내역 조회
		 */
		try{
			List<MNPMnyPinFncTrnSelectMnpIntPrtsList_DODT> grid = new ArrayList<MNPMnyPinFncTrnSelectMnpIntPrtsList_DODT>();
			boolean hasNext = false;
			String startDate = input.getInqBasDt();
			do {
			//  MCA WFInterfaceCfg 객체 획득
				WFInterfaceCfg interfaceCfg  = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg();
				interfaceCfg.setInterfaceId("IBSMR0006158");
				
		        IBSMR0006158_IDT iIBSMR0006158 = new IBSMR0006158_IDT();
		        iIBSMR0006158.setDpsInpAcno(input.getDpsInpAcno()); // 수신입력계좌번호
		        iIBSMR0006158.setTrnDscd("5"); // 거래구분코드 "5"
		        iIBSMR0006158.setInqDscd("02"); // 조회구분코드 "02"
		        iIBSMR0006158.setInqBasDt(startDate); // 조회기준일자
		        iIBSMR0006158.setInqEndDt(input.getInqEndDt()); // 조회종료일자 오늘날짜 
		   
		        if(logger.isDebugEnabled()) {
					logger.debug("받은 이자 내역 조회 COM iIBSMR0006158 {} ::: ", iIBSMR0006158);
				}
				
		        IBSMR0006158_ODT oIBSMR0006158= new IBSMR0006158_ODT();
		        
				WFInfResponse<IBSMR0006158_ODT> mcaOutput = sHRIBSMR0006158_COM.callTrx(iIBSMR0006158, interfaceCfg);
		
				WFNcoHeader ncoHeader = mcaOutput.getNcoHeader();
				//다음거래여부
				hasNext = "Y".equals(ncoHeader.getCtinDatOupYn());
				if (hasNext) {
					//연속거래일련번호 다음 일자로 옵니다.
					startDate = ncoHeader.getCtinTrnSrno();
				}
				oIBSMR0006158 = mcaOutput.getResponseData();
				if(logger.isDebugEnabled()) {
					logger.debug("받은 이자 내역 조회 COM oIBSMR0006158  {} ::: ", oIBSMR0006158);
				}
				/**
				 * @BXMType IF
				 * 정상 조회 처리여부
				 */
				int gridCnt = oIBSMR0006158.getGridRowCnt();
				if (gridCnt > 0) {					
					List<IBSMR0006158_GRID_ODT> dodtGrid = oIBSMR0006158.getGrid();
					for (IBSMR0006158_GRID_ODT dodtGridItem: dodtGrid) {
						MNPMnyPinFncTrnSelectMnpIntPrtsList_DODT gridItem = new MNPMnyPinFncTrnSelectMnpIntPrtsList_DODT();
						gridItem.setTrnDt(dodtGridItem.getTrnDt()); // 거래일자
						gridItem.setTrnSrno(dodtGridItem.getTrnSrno()); // 거래일련번호
						gridItem.setIntCalStaDt(dodtGridItem.getIntCalStaDt()); // 이자계산시작일자
						gridItem.setIntCalEndDt(dodtGridItem.getIntCalEndDt()); // 이자계산종료일자
						gridItem.setTrnBasAm(dodtGridItem.getTrnBasAm()); // 거래기준금액
						gridItem.setTotPayIntAm(dodtGridItem.getTotPayIntAm()); // 총지급이자금액
						gridItem.setIntIctx(dodtGridItem.getIntIctx()); // 이자소득세
						gridItem.setIntIcmRdtx(dodtGridItem.getIntIcmRdtx()); // 이자소득주민세
						gridItem.setIntIcmSrtx(dodtGridItem.getIntIcmSrtx()); // 이자소득농특세
						gridItem.setHcanFee(dodtGridItem.getHcanFee()); // 중도해지수수료
						gridItem.setRrintAm(dodtGridItem.getRrintAm()); // 환입이자금액
						gridItem.setRstrIctx(dodtGridItem.getRstrIctx()); // 환출소득세
						gridItem.setRstrRdtx(dodtGridItem.getRstrRdtx()); // 환출주민세
						gridItem.setRstrSrtx(dodtGridItem.getRstrSrtx()); // 환출농특세
						gridItem.setPrmeYn(dodtGridItem.getPrmeYn()); // 우대여부  -----> 이자실행코드 1, 2
						
						grid.add(gridItem);
					}
				}
			} while (hasNext);
			
			output.setGridRowCnt(grid.size()); // 그리드건수
			output.setGrid(grid); // 그리드

			if(logger.isDebugEnabled()) {
				logger.debug("받은 이자 내역 조회 COM output  {} ::: ", output);
			}
		} catch (Exception e) {
			logger.error("IBSMR0006158 Exception!! {} ", e);
			
			if ( e instanceof SFAdaptorApplicationException ) {
				SFAdaptorApplicationException se = (SFAdaptorApplicationException) e;
				logger.error("SFAdaptorApplicationException {} ", se);
				//조회할 내용이 없습니다.
				if ("IFIE0132".equals(se.getCode())) {
					return output;
				}
				errMsgId = se.getCode();
				Object[] args = se.getArguments();
	            
	            if(args != null && args.length>0) {
	            	errMsgTxt = args[0].toString();
				}
			} else if ( e instanceof SFInterfaceSystemException ) {
				SFInterfaceSystemException se = (SFInterfaceSystemException) e;
				logger.error("SFInterfaceSystemException {} ", se);
				
				errMsgId = se.getMsgId();
				errMsgTxt = se.getMainMsgTxt();
	
			} else if ( e instanceof WFApplicationException) {
				WFApplicationException we = (WFApplicationException) e;
				logger.error("WFApplicationException {} ", we);
				
			
				errMsgId = we.getCode();
				errMsgTxt = we.getMessage();
				
			} else {
				logger.error("Exception {} ", e);
				errMsgId = "9999";
				errMsgTxt = e.getMessage();				
			}
			
			throw new WFApplicationException("FNSE0006", new Object[] {errMsgTxt}, new Object[] {errMsgId});
		}
		return output;
	}

	
	/**
	 * 과거.거래내역.조회, WMCDEPC221_02Q (IBSMR0002913)
	 * 
	 * @param input 전체계좌조회거래내역.요구불.거래목록.요구불.입력.컴포넌트.공통.IO
	 * @return 전체계좌조회거래내역.요구불.거래목록.요구불.출력.컴포넌트.공통.IO
	 */
	@BxmCategory(logicalName="과거.거래내역.조회", description="과거 거래내역 조회 [IBSMR0002913]", author="90190314")
	private MnyPinFncTrnSelectTrnPrts_DODT selectPastTrnPrts(IBSMR0002913_IDT input
	) throws WFApplicationException  {
		
		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class); 
		
		/**
		 * @BXMType VariableDeclaration
		 */
		MnyPinFncTrnSelectTrnPrts_DODT output= new MnyPinFncTrnSelectTrnPrts_DODT();
		
		if ("".equals(WFStringUtils.null2void(input.getStaDt()))) return output;
		if ("".equals(WFStringUtils.null2void(input.getEndDt()))) return output;
		
		// 내부 변수
		List<MNPMnyPinFncTrnSelectTrnPrts_DTO> trnList = new ArrayList<>();
		
		if(logger.isDebugEnabled()) {
			logger.debug("90190263 머니클립계좌거래내역조회 과거거래내역조회 COM input {} ::: ", input);
		}
		
		/**
		 * 연계시스템 호출
		 * TYPE : MCA
		 * ID : IBSMR0002913
		 * NM : 개인_계좌별거래내역(우리닷컴) 
		 */
		WFInterfaceCfg interfaceCfg = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg(); // 아답터 설정 DTO
		interfaceCfg.setInterfaceId("IBSMR0002913");
		interfaceCfg.setRepeatFieldNm("REPT_FA");
		
		WFNciHeader  tpyNciHeader = interfaceCfg.getNciHeader();
		tpyNciHeader.setAcno(input.getAcno());
		interfaceCfg.setNciHeader(tpyNciHeader);
		
		try {
			if ("000000".equals(input.getInqStaNo())) {
				input.setInqStaNo("000001");
			}
			
			sHRIBSMR0002913_COM = WFApplicationContext.getBean(sHRIBSMR0002913_COM, SHRIBSMR0002913_COM.class);
			WFInfResponse<IBSMR0002913_ODT> mcaOutput = sHRIBSMR0002913_COM.callTrx(input, interfaceCfg);
			
			IBSMR0002913_ODT iBSMR0002913_ODT = mcaOutput.getResponseData();
			List<IBSMR0002913_REPT_FA_ODT> iBSMR0002913_REPT_FA_ODTList = iBSMR0002913_ODT.getReptFa();
			
			String today = WFDateUtils.getDateNow();
			
			BigDecimal paySumAm 	= BigDecimal.ZERO;
			BigDecimal rcvSumAm 	= BigDecimal.ZERO;
			
			BigDecimal d7UndAm 	= BigDecimal.ZERO;
			BigDecimal d7OverAm 	= BigDecimal.ZERO;
			BigDecimal d31OverAm 	= BigDecimal.ZERO;
			
			for (IBSMR0002913_REPT_FA_ODT iBSMR0002913_REPT_FA_ODT : iBSMR0002913_REPT_FA_ODTList) {
				MNPMnyPinFncTrnSelectTrnPrts_DTO oSelectTrnPrts = new MNPMnyPinFncTrnSelectTrnPrts_DTO();
				BigDecimal payAm 	= iBSMR0002913_REPT_FA_ODT.getTrnAm();
				BigDecimal rcvAm 	= iBSMR0002913_REPT_FA_ODT.getTrnAm();
			
				if(WFDateUtils.daysBetween(iBSMR0002913_REPT_FA_ODT.getTrnDt(), today ) < 7)  {
					d7UndAm = d7UndAm.add(rcvAm);
					oSelectTrnPrts.setPayTmDscd("1");
				} else if (WFDateUtils.daysBetween(iBSMR0002913_REPT_FA_ODT.getTrnDt(), today ) >= 7 
						&& WFDateUtils.daysBetween(iBSMR0002913_REPT_FA_ODT.getTrnDt(), today ) < 31) {
					d7OverAm = d7OverAm.add(rcvAm);
					oSelectTrnPrts.setPayTmDscd("2");
				} else if(WFDateUtils.daysBetween(iBSMR0002913_REPT_FA_ODT.getTrnDt(), today ) >= 31) {
					d31OverAm	= d31OverAm.add(rcvAm);
					oSelectTrnPrts.setPayTmDscd("3");
				}

				String lcbsDis 			= iBSMR0002913_REPT_FA_ODT.getLcbsDis();
				String payYn 			= "2".equals(lcbsDis) ? "Y" : "N";
				
				paySumAm = paySumAm.add(payAm);
				rcvSumAm 	= rcvSumAm.add(rcvAm);
				
				oSelectTrnPrts.setPayYn(payYn);
				oSelectTrnPrts.setTrnTxt(iBSMR0002913_REPT_FA_ODT.getDis());
				oSelectTrnPrts.setPayAm(payAm);
				oSelectTrnPrts.setRcvAm(rcvAm);
				oSelectTrnPrts.setTrnDt(iBSMR0002913_REPT_FA_ODT.getTrnDt());
				oSelectTrnPrts.setTrnTm(iBSMR0002913_REPT_FA_ODT.getTrnTim());
				oSelectTrnPrts.setPbokPrngOtlnCd(iBSMR0002913_REPT_FA_ODT.getRmrk());
				oSelectTrnPrts.setTrnSrno(Integer.parseInt(iBSMR0002913_REPT_FA_ODT.getTdyTrnSqno()));
				oSelectTrnPrts.setDpsBal(iBSMR0002913_REPT_FA_ODT.getBal());
				oSelectTrnPrts.setRqspeNm("");
				oSelectTrnPrts.setOtbrAm(iBSMR0002913_REPT_FA_ODT.getObcSumAm());
				oSelectTrnPrts.setOtbrKd("");
				
				trnList.add(oSelectTrnPrts);
			}
			
			output.setPaySumAm(paySumAm);
			output.setRcvSumAm(rcvSumAm);
			
			output.setD7UndAm(d7UndAm);
			output.setD7OverAm(d7OverAm);
			output.setD31OverAm(d31OverAm);
			
			output.setTotCnt(iBSMR0002913_ODT.getTotCnt());
			output.setGrid(trnList);
			if(logger.isDebugEnabled()) {
				logger.debug("90190263 머니클립계좌거래내역조회 과거거래내역조회 COM output {} ::: ", output);
			}
			
		} catch (WFApplicationException e) {
			logger.debug("{}", e);
			logger.debug("{}", e.getCode());
			return output;
		} catch (Exception e) {
			throw new WFApplicationException("BSCE0049"); // 거래가 정상적이지 않습니다. 다시 거래해 주십시요.
		}
		
		return output;
	}
	
	/**
	 * 최근 거래내역 조회(HOST), WMCDEPC221_02Q (IBSMR0000056)
	 * 
	 * @param input 전체계좌조회거래내역.요구불.거래목록.요구불.입력.컴포넌트.공통.IO
	 * @return 전체계좌조회거래내역.요구불.거래목록.요구불.출력.컴포넌트.공통.IO
	 */
	@BxmCategory(logicalName="최근.거래내역.조회", description="최근.거래내역.조회, IBSMR0000056", author="90190314")
	private MnyPinFncTrnSelectTrnPrts_DODT selectLateTrnPrts(IBSMR0000056_IDT input
	) throws WFApplicationException  {
		
		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class); 
		
		/**
		 * @BXMType VariableDeclaration
		 */
		MnyPinFncTrnSelectTrnPrts_DODT output= new MnyPinFncTrnSelectTrnPrts_DODT();
		
		if ("".equals(WFStringUtils.null2void(input.getInqBasDt()))) return output;
		if ("".equals(WFStringUtils.null2void(input.getInqEndDt()))) return output;
		
		if(!"".equals(WFStringUtils.null2void(input.getInqBasDt()))) {
			input.setInqBasDt(WFStringUtils.delDash(input.getInqBasDt()));
		}
		if(!"".equals(WFStringUtils.null2void(input.getInqEndDt()))) {
			input.setInqEndDt(WFStringUtils.delDash(input.getInqEndDt()));
		}
		
		if(logger.isDebugEnabled()) {
			logger.debug("90190263 머니클립계좌거래내역조회 최근거래내역조회 COM input {} ::: ", input);
		}
		
		/**
		 * 연계시스템 호출
		 * TYPE : MCA
		 * ID : IBSMR0000056
		 * NM : 인터넷일괄지급거래내역조회
		 */
		WFInterfaceCfg interfaceCfg = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg(); // 아답터 설정 DTO
		interfaceCfg.setInterfaceId("IBSMR0000056");
		interfaceCfg.setRepeatFieldNm("GRID");
		
		WFNciHeader  tpyNciHeader = interfaceCfg.getNciHeader();
		tpyNciHeader.setAcno(input.getDpsInpAcno());
		interfaceCfg.setNciHeader(tpyNciHeader);
		
		try {
			sHRIBSMR0000056_COM = WFApplicationContext.getBean(sHRIBSMR0000056_COM, SHRIBSMR0000056_COM.class);
			WFInfResponse<IBSMR0000056_ODT> mcaOutput = sHRIBSMR0000056_COM.callTrx(input, interfaceCfg);
			
			IBSMR0000056_ODT iBSMR0000056_ODT = mcaOutput.getResponseData();
			List<IBSMR0000056_GRID_ODT> iBSMR0000056_GRID_ODTList = iBSMR0000056_ODT.getGrid();

			String today = WFDateUtils.getDateNow();
			
			BigDecimal paySumAm = BigDecimal.ZERO;
			BigDecimal rcvSumAm = BigDecimal.ZERO;
			//BigDecimal totSumAm = BigDecimal.ZERO;

			BigDecimal d7UndAm 	= BigDecimal.ZERO;
			BigDecimal d7OverAm 	= BigDecimal.ZERO;
			BigDecimal d31OverAm 	= BigDecimal.ZERO;
			
			List<MNPMnyPinFncTrnSelectTrnPrts_DTO> oMNPMnyPinFncTrnSelectTrnPrts_DTOList = new ArrayList<>();
			
			for (IBSMR0000056_GRID_ODT iBSMR0000056_GRID_ODT : iBSMR0000056_GRID_ODTList) {
				MNPMnyPinFncTrnSelectTrnPrts_DTO oSelectTrnPrts = new MNPMnyPinFncTrnSelectTrnPrts_DTO();
				
				BigDecimal payAm 	= iBSMR0000056_GRID_ODT.getPayAm();
				BigDecimal rcvAm 	= iBSMR0000056_GRID_ODT.getRcvAm();
				
				String trnTxt 			= iBSMR0000056_GRID_ODT.getTrnTxt();
				String payYn 			= payAm.compareTo(BigDecimal.ZERO) != 0 ? "Y" : "N";
				
				if(WFDateUtils.daysBetween(iBSMR0000056_GRID_ODT.getTrnDt(), today ) < 7)  {
					d7UndAm = d7UndAm.add(rcvAm);
					oSelectTrnPrts.setPayTmDscd("1");
				} else if (WFDateUtils.daysBetween(iBSMR0000056_GRID_ODT.getTrnDt(), today ) >= 7 
						&& WFDateUtils.daysBetween(iBSMR0000056_GRID_ODT.getTrnDt(), today ) < 31) {
					d7OverAm = d7OverAm.add(rcvAm);
					oSelectTrnPrts.setPayTmDscd("2");
				} else if(WFDateUtils.daysBetween(iBSMR0000056_GRID_ODT.getTrnDt(), today ) >= 31) {
					d31OverAm	= d31OverAm.add(rcvAm);
					oSelectTrnPrts.setPayTmDscd("3");
				}
				
				paySumAm = paySumAm.add(payAm);
				rcvSumAm 	= rcvSumAm.add(rcvAm);
				
				oSelectTrnPrts.setPayYn(payYn);
				oSelectTrnPrts.setTrnTxt(trnTxt);
				oSelectTrnPrts.setPayAm(payAm);
				oSelectTrnPrts.setRcvAm(rcvAm);
				oSelectTrnPrts.setTrnDt(iBSMR0000056_GRID_ODT.getTrnDt());
				oSelectTrnPrts.setTrnTm(iBSMR0000056_GRID_ODT.getTrnTm());
				oSelectTrnPrts.setPbokPrngOtlnCd(iBSMR0000056_GRID_ODT.getPbokPrngOtlnCd());
				oSelectTrnPrts.setTrnSrno(iBSMR0000056_GRID_ODT.getTrnSrno());
				oSelectTrnPrts.setDpsBal(iBSMR0000056_GRID_ODT.getDpsBal());
				oSelectTrnPrts.setRqspeNm(iBSMR0000056_GRID_ODT.getRqspeNm());
				oSelectTrnPrts.setOtbrAm(iBSMR0000056_GRID_ODT.getOtbrAm());
				oSelectTrnPrts.setOtbrKd(iBSMR0000056_GRID_ODT.getOtbrKd());
				oSelectTrnPrts.setTrbkGicd(iBSMR0000056_GRID_ODT.getTrbkGicd());
				
				oMNPMnyPinFncTrnSelectTrnPrts_DTOList.add(oSelectTrnPrts);
			}
			output.setPaySumAm(paySumAm);
			output.setRcvSumAm(rcvSumAm);
			
			output.setD7UndAm(d7UndAm);
			output.setD7OverAm(d7OverAm);
			output.setD31OverAm(d31OverAm);
			
			output.setGrid(oMNPMnyPinFncTrnSelectTrnPrts_DTOList);
			
			if(logger.isDebugEnabled()) {
				logger.debug("90190263 머니클립계좌거래내역조회 최근거래내역조회 COM output {} ::: ", output);
			}
			
		} catch (WFApplicationException e) {
			logger.debug("{}", e);
			logger.debug("{}", e.getCode());
			return output;
		} catch (Exception e) {
			throw new WFApplicationException("BSCE0049"); // 거래가 정상적이지 않습니다. 다시 거래해 주십시요.
		}
		
		
		return output;
	}
}
