package com.skbank.sml.fns.mnp.com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import com.skbank.sml.bsc.shr.com.SHRAllActInqTbk_COM;
import com.skbank.sml.bsc.shr.cst.cstt.SHRBSCInquiryConstant;
import com.skbank.sml.cmm.shr.com.SHRBSCActNmMng_COM;
import com.skbank.sml.cmm.shr.com.SHRCMMInterfaceCfg_COM;
import com.skbank.sml.cmm.shr.com.SHRCMMLoginSession_COM;
import com.skbank.sml.cmm.shr.com.SHRMMHCustSession_COM;
import com.skbank.sml.cmm.shr.dto.CMM_CURRENT_CUST;
import com.skbank.sml.cmm.shr.dto.MMH_CUST_INFO;
import com.skbank.sml.cmm.shr.dto.SHRActNmIDT_DTO;
import com.skbank.sml.cmm.shr.dto.SHRActNmODT_DTO;
import com.skbank.sml.fns.mnp.dbm.MNY_CLP_EXPS_SEQ_MNG001_DBM;
import com.skbank.sml.fns.mnp.dto.MNPBscInf_DTO;
import com.skbank.sml.fns.mnp.dto.MNPDeleteChidAcnoInfLstOut_DTO;
import com.skbank.sml.fns.mnp.dto.MNPDeleteChidAcnoInfLst_DTO;
import com.skbank.sml.fns.mnp.dto.MNPMnyPinBscMngInsertWdrAcnoIn_DTO;
import com.skbank.sml.fns.mnp.dto.MNPMnyPinBscMngInsertWdrAcnoOut_DTO;
import com.skbank.sml.fns.mnp.dto.MNPMnyPinBscMngSelectMnpChidAcno_DTO;
import com.skbank.sml.fns.mnp.dto.MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMDeleteMnyClpExpsSeqMngList_DIDT;
import com.skbank.sml.fns.mnp.dto.MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMDeleteMnyClpExpsSeqMng_DIDT;
import com.skbank.sml.fns.mnp.dto.MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMInsertMnyClpExpsSeqMng_DIDT;
import com.skbank.sml.fns.mnp.dto.MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMSelectMnyClpExpsSeqMng_DIDT;
import com.skbank.sml.fns.mnp.dto.MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMSelectMnyClpExpsSeqMng_DODT;
import com.skbank.sml.fns.mnp.dto.MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMUpdateMnyClpExpsSeqMng_DIDT;
import com.skbank.sml.fns.mnp.dto.MnyPinBscMngInsertMnpChidAcno_DIDT;
import com.skbank.sml.fns.mnp.dto.MnyPinBscMngInsertMnpChidAcno_DODT;
import com.skbank.sml.fns.mnp.dto.MnyPinBscMngSelectMnpChidAcnoRgsAvlYn_DIDT;
import com.skbank.sml.fns.mnp.dto.MnyPinBscMngSelectMnpChidAcnoRgsAvlYn_DODT;
import com.skbank.sml.fns.mnp.dto.MnyPinBscMngSelectMnpChidAcno_DIDT;
import com.skbank.sml.fns.mnp.dto.MnyPinBscMngSelectMnpChidAcno_DODT;
import com.skbank.sml.fns.mnp.dto.MnyPinBscMngUpdateMnpChidAcno_DIDT;
import com.skbank.sml.fns.mnp.dto.MnyPinBscMngUpdateMnpChidAcno_DODT;
import com.skbank.sml.ifi.mca.eims2.dto.IBSMR0004252_IDT;
import com.skbank.sml.ifi.mca.eims2.dto.IBSMR0004252_ODT;
import com.skbank.sml.ifi.mca.eims3.dto.IBSMR0002963_GRID_IDT;
import com.skbank.sml.ifi.mca.eims3.dto.IBSMR0002963_IDT;
import com.skbank.sml.ifi.mca.eims3.dto.IBSMR0002963_ODT;
import com.skbank.sml.ifi.mca.eims3.dto.IBSMR0004253_IDT;
import com.skbank.sml.ifi.mca.eims3.dto.IBSMR0004253_ODT;
import com.skbank.sml.ifi.mca.eims4.dto.IBSMR0004224_GRID_IDT;
import com.skbank.sml.ifi.mca.eims4.dto.IBSMR0004224_IDT;
import com.skbank.sml.ifi.mca.eims4.dto.IBSMR0004224_ODT;
import com.skbank.sml.ifi.mca.eims5.dto.IBSMR0006155_GRID_ODT;
import com.skbank.sml.ifi.mca.eims5.dto.IBSMR0006155_IDT;
import com.skbank.sml.ifi.mca.eims5.dto.IBSMR0006155_ODT;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0002963_COM;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0004063_COM;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0004224_COM;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0004252_COM;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0004253_COM;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0006155_COM;
import com.skbank.sml.pds.shr.com.SHRDAIDpstInsvCanc_COM;
import com.skbank.sml.pds.shr.dto.SHRDpstInsvCancExeInp_DTO;
import com.skbank.sml.pds.shr.dto.SHRDpstInsvCancOut_DTO;

import bxm.common.annotaion.BxmCategory;
import io.micrometer.core.instrument.util.StringUtils;
import fwk.skbank.asis.adaptor.dto.request.WFInterfaceCfg;
import fwk.skbank.asis.adaptor.dto.response.WFInfResponse;
import fwk.skbank.asis.adaptor.header.request.custom.WFCustomTrnHeader;
import fwk.skbank.online.context.WFApplicationContext;
import fwk.skbank.online.exception.app.WFApplicationException;
import fwk.skbank.online.exception.frm.SFAdaptorApplicationException;
import fwk.skbank.online.exception.frm.SFInterfaceSystemException;

/**
 * 1.업무명 : NEWWON 대분류 금융서비스
 * 2.단위업무명 : NEWWON 중분류 통합알림함
 * 3.프로그램명 : 머니클립기본관리 컴포넌트
 * 4.설명 : 
 * 
 * @Class MNPMnyPinBscMng_COM.java
 * @author 90190263
 * @since 2024.08.12
 * @version 1.0
 */		
@Component
@BxmCategory(logicalName="머니클립기본관리 컴포넌트", description="머니클립의 기본적 정보를 관리하는 공용 컴포넌트")
public class MNPMnyPinBscMng_COM {
	private Logger logger= LoggerFactory.getLogger(getClass());
	
	/**
	 * 세션 관리 컴포넌트
	 */
	private SHRCMMLoginSession_COM shrCMMLoginSession_COM;
	
	/** 
	 * 
	 */
	private SHRMMHCustSession_COM sHRMMHCustSession_COM;
	/**
	 * WFInterfaceCfg 생성 컴포넌트
	 */
	private SHRCMMInterfaceCfg_COM sHRCMMInterfaceCfg_COM;

	/**
	 * 머니클립 노출 순서 관리 DBM 
	 */
	private MNY_CLP_EXPS_SEQ_MNG001_DBM mnyClpExpsSeqMng001_DBM;
	/**
	 * 비대면 계좌개설 신규 실행
	 */
	private SHRIBSMR0004063_COM sHRIBSMR0004063_COM;
	
	/**
	 * 요구불예금 가능조회
	 */
	private SHRIBSMR0004252_COM sHRIBSMR0004252_COM;
	
	/**
	 * 요구불예금 신규실행
	 */
	private SHRIBSMR0004253_COM sHRIBSMR0004253_COM;
	/**
	 * 머니클립 자계좌 목록조회
	 */
	private SHRIBSMR0006155_COM sHRIBSMR0006155_COM;
	
	/**
	 * 인터넷뱅킹 예적금 항목변경
	 */
	private SHRIBSMR0004224_COM sHRIBSMR0004224_COM;
	/**
	 * 예금.적금.해지.공유.컴포넌트
	 */
	private SHRDAIDpstInsvCanc_COM sHRDAIDpstInsvCanc_COM;
		
	private SHRIBSMR0002963_COM sHRIBSMR0002963_COM;
	/**
	 * 계좌 별명관리 공유 컴포넌트
	 */
	private SHRBSCActNmMng_COM shrBSCActNmMng_COM;
	/**
	 * 전계좌 세션 갱신
	 */
	private SHRAllActInqTbk_COM shrAllActInqTbk_COM;
	
	/**
	 * 머니클립 서비스의 모계좌 생성 후 자계좌 생성가능여부를 조회하는 컴포넌트
	 * 
	 * 상품코드
	 * 1) 002-510-000-0000 (머니클립 통장)
	 * 2) 002-510-001-0000 (머니클립 지갑)
	 * 3) 002-510-002-0000 (머니클립 금고)
	 * => 조회시 하이푼제거하여 기입
	 * 
	 * @param input 머니클립.자.계좌.등록.가능여부.조회.컴포넌트.입력.IO
	 * @return 머니클립.자.계좌.등록.가능여부.조회.컴포넌트.출력.IO
	 */
	@BxmCategory(logicalName="머니클립자계좌등록가능조회", description="머니클립의 자계좌 정보를 등록가능 여부를 조회하는 컴포넌트", author="90190263")
	public MnyPinBscMngSelectMnpChidAcnoRgsAvlYn_DODT selectMnpChidAcnoRgsAvlYn(MnyPinBscMngSelectMnpChidAcnoRgsAvlYn_DIDT input
	)
	{
		/**
		* @BXMType GetBean
		*/
		// WFInterfaceCfg 생성 컴포넌트
		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class);
		sHRMMHCustSession_COM = WFApplicationContext.getBean(sHRMMHCustSession_COM, SHRMMHCustSession_COM.class);
		sHRIBSMR0004252_COM= WFApplicationContext.getBean(sHRIBSMR0004252_COM, SHRIBSMR0004252_COM.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */
		MnyPinBscMngSelectMnpChidAcnoRgsAvlYn_DODT output= new MnyPinBscMngSelectMnpChidAcnoRgsAvlYn_DODT();
		
		/*
		 * 로직 추가
		 */
		//세션고객정보
		//CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession(); 
		MMH_CUST_INFO currentCust = sHRMMHCustSession_COM.getCustInfoSession();
		if(logger.isDebugEnabled()) {
			logger.debug("currentCust ====== {} ::: ", currentCust);
		} 
		
		if(logger.isDebugEnabled()) {
			logger.debug("90190263 머니클립자계좌등록가능조회 COM input {} ::: ", input);
		}
		
		String errMsgTxt = "";
		
		/**
		 * 연계시스템 호출
		 * TYPE : MCA
		 * ID :  IBSMR0004252
		 * NM : 요구불예금 신규가능조회
		 */
		try{
			//  MCA WFInterfaceCfg 객체 획득
			WFInterfaceCfg interfaceCfg  = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg();
			interfaceCfg.setInterfaceId("IBSMR0004252");
			        
	        IBSMR0004252_IDT iIBSMR0004252 = new IBSMR0004252_IDT();
	        iIBSMR0004252.setWdrAcno(input.getWdrAcno()); // 출금계좌번호
	        iIBSMR0004252.setActPwnoUsgYn("N"); // 계좌비밀번호사용여부
	        iIBSMR0004252.setEncyWdrActPwno(input.getEncyWdrActPwno()); // 암호화출금계좌비밀번호
	        iIBSMR0004252.setCucd(input.getCucd()); // 통화코드
	        iIBSMR0004252.setCsno(currentCust.getCsno()); // 고객번호
	        iIBSMR0004252.setPdcd(input.getPdcd()); // 상품코드
	        iIBSMR0004252.setNewAm(input.getNewAm()); // 신규금액
	        iIBSMR0004252.setCtrtmMcn(input.getCtrtmMcn()); // 계약기간월수
	        iIBSMR0004252.setSynpbDscd(input.getSynpbDscd()); // 종합통장구분코드
	        iIBSMR0004252.setActMngBrcd(input.getActMngBrcd()); // 계좌관리점코드
	        iIBSMR0004252.setBchrCponNo(input.getBchrCponNo()); // 바우처쿠폰번호
	        iIBSMR0004252.setEncyDpsActPwno(input.getEncyDpsActPwno()); // 암호화수신계좌비밀번호
	        iIBSMR0004252.setFncTrnAimCollDis(input.getFncTrnAimCollDis()); // 금융거래목적징구구분
	        iIBSMR0004252.setNrsrCnfDocCollYn(input.getNrsrCnfDocCollYn()); // 비거주자확인서류징구여부
	        iIBSMR0004252.setPsnInfAgmdMngNo(input.getPsnInfAgmdMngNo()); // 개인정보동의서관리번호
	        iIBSMR0004252.setSmsdDscd(input.getSmsdDscd()); // SMS발송구분코드
	        iIBSMR0004252.setAdvpeEno(input.getAdvpeEno()); // 권유자직원번호
	        iIBSMR0004252.setAgnpeEncyRrno(input.getAgnpeEncyRrno()); // 대리인암호화주민등록번호
	        iIBSMR0004252.setRppeEncyRrno(input.getRppeEncyRrno()); // 대표자암호화주민등록번호
	        iIBSMR0004252.setAgnpeFnm(input.getAgnpeFnm()); // 대리인성명
	        iIBSMR0004252.setRppeFnm(input.getRppeFnm()); // 대표자성명
	        iIBSMR0004252.setKycChkXtYn(input.getKycChkXtYn()); // KYC체크제외여부
	        iIBSMR0004252.setAtsYn(input.getAtsYn()); // 자동이체여부
	        iIBSMR0004252.setAtsStaDt(input.getAtsStaDt()); // 자동이체시작일자
	        iIBSMR0004252.setAtsEndDt(input.getAtsEndDt()); // 자동이체종료일자
	        iIBSMR0004252.setAtsAm(input.getAtsAm()); // 자동이체금액
	        iIBSMR0004252.setAtsDd(input.getAtsDd()); // 자동이체일
	        iIBSMR0004252.setAtsCycd(input.getAtsCycd()); // 자동이체주기코드
	        iIBSMR0004252.setInsvAcldTsStaWkdDscd(input.getInsvAcldTsStaWkdDscd()); // 적금적립이체시작요일구분코드
	        iIBSMR0004252.setCusDntnAscnCd(input.getCusDntnAscnCd()); // 고객기부단체코드
	        iIBSMR0004252.setCusDgnPrdNm(input.getCusDgnPrdNm()); // 고객지정상품명
	        iIBSMR0004252.setAimFdNm(input.getAimFdNm()); // 목적자금명
	        iIBSMR0004252.setDinsvGoalAm(input.getDinsvGoalAm()); // 꿈적금목표금액
	        iIBSMR0004252.setAtsXtYn("2"); // 자동이체제외여부: 2 일 경우 제외처리
	        
	        if(logger.isDebugEnabled()) {
				logger.debug("90130923 머니클립자계좌등록가능조회 COM iIBSMR0004252 {} ::: ", iIBSMR0004252);
			}
			
	        IBSMR0004252_ODT oIBSMR0004252= new IBSMR0004252_ODT();
	        
			WFInfResponse<IBSMR0004252_ODT> mcaOutput = sHRIBSMR0004252_COM.callTrx(iIBSMR0004252, interfaceCfg);
	
			oIBSMR0004252 = mcaOutput.getResponseData();
			
			/**
			 * @BXMType IF
			 * 정상 조회 처리여부
			 */
			
			if(logger.isDebugEnabled()) {
				logger.debug("90190263 머니클립자계좌등록가능조회 COM oIBSMR0004252  {} ::: ", oIBSMR0004252);
			}
			
			output.setNewTrnCmpnChckTgtYn(oIBSMR0004252.getNewTrnCmpnChckTgtYn()); // 신규거래구속성점검대상여부
			output.setPrcRtcd("0000");
			output.setPrcRstTxt("정상적으로 처리 되었습니다.");
		} catch (Exception e) {
			logger.error("IBSMR0004252 Exception!! {} ", e);
			
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
			output.setPrcRtcd("9999");
			output.setPrcRstTxt(errMsgTxt);
		}
		
		if(logger.isDebugEnabled()) {
			logger.debug("90190263 머니클립자계좌등록가능조회 COM output  {} ::: ", output);
		}
		
		return output;
	}

	
	/**
	 * 머니클립 서비스의 모계좌 생성 후 자계좌를 생성하는 컴포넌트
	 * 
	 * 1) 002-510-000-0000 (머니클립 통장)
	 * 2) 002-510-001-0000 (머니클립 지갑)
	 * 3) 002-510-002-0000 (머니클립 금고)
	 * 
	 * @param input 머니클립.자.계좌.등록.컴포넌트.입력.IO
	 * @return 머니클립.자.계좌.등록.컴포넌트.출력.IO
	 */
	@BxmCategory(logicalName="머니클립자계좌등록", description="머니클립의 자계좌 정보를 등록하는 컴포넌트", author="90190263")
	public MnyPinBscMngInsertMnpChidAcno_DODT insertMnpChidAcno(MnyPinBscMngInsertMnpChidAcno_DIDT input
	)
	{
		/**
		* @BXMType GetBean
		*/
		// WFInterfaceCfg 생성 컴포넌트
		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class);
		sHRMMHCustSession_COM = WFApplicationContext.getBean(sHRMMHCustSession_COM, SHRMMHCustSession_COM.class);
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		sHRIBSMR0004253_COM= WFApplicationContext.getBean(sHRIBSMR0004253_COM, SHRIBSMR0004253_COM.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */
		MnyPinBscMngInsertMnpChidAcno_DODT output= new MnyPinBscMngInsertMnpChidAcno_DODT();
		
		/*
		 * 로직 추가
		 */
		//세션고객정보
		MMH_CUST_INFO currentCust = sHRMMHCustSession_COM.getCustInfoSession();
		CMM_CURRENT_CUST loginCust = shrCMMLoginSession_COM.getLoginSession();
		if(logger.isDebugEnabled()) {
			logger.debug("currentCust ====== {} ::: ", currentCust);
			logger.debug("loginCust ====== {} ::: ", loginCust);
		} 
		
		if(logger.isDebugEnabled()) {
			logger.debug("90190263 머니클립자계좌등록 COM input {} ::: ", input);
		}
		
		String errMsgTxt = "";
		
		/**
		 * 연계시스템 호출
		 * TYPE : MCA
		 * ID :  IBSMR0004253
		 * NM :  요구불예금 신규실행
		 */
		try{
			//  MCA WFInterfaceCfg 객체 획득
			WFInterfaceCfg interfaceCfg  = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg();
			interfaceCfg.setInterfaceId("IBSMR0004253");
			        
	        IBSMR0004253_IDT iIBSMR0004253 = new IBSMR0004253_IDT();
	        iIBSMR0004253.setWdrAcno(input.getWdrAcno()); // 출금계좌번호
	        iIBSMR0004253.setActPwnoUsgYn("N"); // 계좌비밀번호사용여부
	        iIBSMR0004253.setEncyWdrActPwno(input.getEncyWdrActPwno()); // 암호화출금계좌비밀번호
	        iIBSMR0004253.setCucd(input.getCucd()); // 통화코드
	        iIBSMR0004253.setCsno(currentCust.getCsno()); // 고객번호
	        iIBSMR0004253.setPdcd(input.getPdcd()); // 상품코드
	        iIBSMR0004253.setNewAm(input.getNewAm()); // 신규금액
	        iIBSMR0004253.setCtrtmMcn(input.getCtrtmMcn()); // 계약기간월수
	        iIBSMR0004253.setSynpbDscd(input.getSynpbDscd()); // 종합통장구분코드
	        iIBSMR0004253.setActMngBrcd(input.getActMngBrcd()); // 계좌관리점코드
	        iIBSMR0004253.setBchrCponNo(input.getBchrCponNo()); // 바우처쿠폰번호
	        iIBSMR0004253.setEncyDpsActPwno(input.getEncyDpsActPwno()); // 암호화수신계좌비밀번호
	        iIBSMR0004253.setFncTrnAimCollDis(input.getFncTrnAimCollDis()); // 금융거래목적징구구분
	        iIBSMR0004253.setNrsrCnfDocCollYn(input.getNrsrCnfDocCollYn()); // 비거주자확인서류징구여부
	        iIBSMR0004253.setPsnInfAgmdMngNo(input.getPsnInfAgmdMngNo()); // 개인정보동의서관리번호
	        iIBSMR0004253.setSmsdDscd(input.getSmsdDscd()); // SMS발송구분코드
	        iIBSMR0004253.setAdvpeEno(input.getAdvpeEno()); // 권유자직원번호
	        iIBSMR0004253.setAgnpeEncyRrno(input.getAgnpeEncyRrno()); // 대리인암호화주민등록번호
	        iIBSMR0004253.setRppeEncyRrno(input.getRppeEncyRrno()); // 대표자암호화주민등록번호
	        iIBSMR0004253.setAgnpeFnm(input.getAgnpeFnm()); // 대리인성명
	        iIBSMR0004253.setRppeFnm(input.getRppeFnm()); // 대표자성명
	        iIBSMR0004253.setPrdDesOupYn(input.getPrdDesOupYn()); // 상품설명출력여부
	        iIBSMR0004253.setAtsYn(input.getAtsYn()); // 자동이체여부
	        iIBSMR0004253.setAtsStaDt(input.getAtsStaDt()); // 자동이체시작일자
	        iIBSMR0004253.setAtsEndDt(input.getAtsEndDt()); // 자동이체종료일자
	        iIBSMR0004253.setAtsAm(input.getAtsAm()); // 자동이체금액
	        iIBSMR0004253.setAtsDd(input.getAtsDd()); // 자동이체일
	        iIBSMR0004253.setAtsCycd(input.getAtsCycd()); // 자동이체주기코드
	        iIBSMR0004253.setInsvAcldTsStaWkdDscd(input.getInsvAcldTsStaWkdDscd()); // 적금적립이체시작요일구분코드
	        iIBSMR0004253.setCusDntnAscnCd(input.getCusDntnAscnCd()); // 고객기부단체코드
	        iIBSMR0004253.setCusDgnPrdNm(input.getCusDgnPrdNm()); // 고객지정상품명
	        iIBSMR0004253.setAimFdNm(input.getAimFdNm()); // 목적자금명
	        iIBSMR0004253.setDinsvGoalAm(input.getDinsvGoalAm()); // 꿈적금목표금액
	        iIBSMR0004253.setAtsXtYn("2"); // 자동이체제외여부: 2 일 경우 제외처리
	        
	        if(logger.isDebugEnabled()) {
				logger.debug("90190263 머니클립자계좌등록 COM iIBSMR0004253 {} ::: ", iIBSMR0004253);
			}
			
	        IBSMR0004253_ODT oIBSMR0004253= new IBSMR0004253_ODT();
	        
			WFInfResponse<IBSMR0004253_ODT> mcaOutput = sHRIBSMR0004253_COM.callTrx(iIBSMR0004253, interfaceCfg);
	
			oIBSMR0004253 = mcaOutput.getResponseData();
			
			if(logger.isDebugEnabled()) {
				logger.debug("90190263 머니클립자계좌등록 COM oIBSMR0004253  {} ::: ", oIBSMR0004253);
			}
			/**
			 * @BXMType IF
			 * 정상 조회 처리여부
			 */
			output.setNewAcno(oIBSMR0004253.getNewAcno()); // 신규계좌번호
			output.setPrcRtcd("0000");
			output.setPrcRstTxt("정상적으로 처리 되었습니다.");
			
			String acno = oIBSMR0004253.getNewAcno();
			
			if(StringUtils.isNotEmpty(acno)) {
				MNPMnyPinBscMngInsertWdrAcnoIn_DTO iWdrAcno = new MNPMnyPinBscMngInsertWdrAcnoIn_DTO();
				iWdrAcno.setAcno(acno);
				
				if(logger.isDebugEnabled()) {
					logger.debug("90190263 머니클립자계좌등록 COM iWdrAcno  {} ::: ", iWdrAcno);
				}
				  
				MNPMnyPinBscMngInsertWdrAcnoOut_DTO oWdrAcno = this.insertWdrAcno(iWdrAcno);
				
				if(logger.isDebugEnabled()) {
					logger.debug("90190263 머니클립자계좌등록 COM oWdrAcno  {} ::: ", oWdrAcno);
				}
				
				
				if(!"0000".equals(oWdrAcno.getPrcRtcd())) {
					output.setPrcRtcd(oWdrAcno.getPrcRtcd());
					output.setPrcRstTxt(oWdrAcno.getPrcRstTxt());
					return output;
					
				}
			}
		} catch (Exception e) {
			logger.error("IBSMR0004253 Exception!! {} ", e);
			
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
			output.setPrcRtcd("9999");
			output.setPrcRstTxt(errMsgTxt);
		}
		
		if(logger.isDebugEnabled()) {
			logger.debug("90190263 머니클립자계좌등록 COM output  {} ::: ", output);
		}
		
		return output;
	}

	/**
	 * 머니클립 서비스의 지갑, 금고 정보를 조회하는 컴포넌트
	 * 
	 * 
	 * @param input 머니클립.자.계좌.등록.컴포넌트.입력.IO
	 * @return 머니클립.자.계좌.등록.컴포넌트.출력.IO
	 */
	@BxmCategory(logicalName="머니클립자계좌조회", description="머니클립의 자계좌 정보를 조회하는 컴포넌트", author="90190263")
	public MnyPinBscMngSelectMnpChidAcno_DODT selectMnpChidAcno(MnyPinBscMngSelectMnpChidAcno_DIDT input
	)
	{
		/**
		* @BXMType GetBean
		*/
		// WFInterfaceCfg 생성 컴포넌트
		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class);
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		sHRIBSMR0006155_COM= WFApplicationContext.getBean(sHRIBSMR0006155_COM, SHRIBSMR0006155_COM.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */
		MnyPinBscMngSelectMnpChidAcno_DODT output= new MnyPinBscMngSelectMnpChidAcno_DODT();
		
		/*
		 * 로직 추가
		 */
		//세션고객정보
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession(); 
		if(logger.isDebugEnabled()) {
			logger.debug("currentCust ====== {} ::: ", currentCust);
		} 
		
		if(logger.isDebugEnabled()) {
			logger.debug("90190263 머니클립자계좌 정보조회 COM input {} ::: ", input);
		}
		
		/**
		 * 연계시스템 호출
		 * TYPE : MCA
		 * ID : 
		 * NM : 
		 */
		try{
			//  MCA WFInterfaceCfg 객체 획득
			WFInterfaceCfg interfaceCfg  = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg();
			interfaceCfg.setInterfaceId("IBSMR0006155");
	        
	        IBSMR0006155_IDT iIBSMR0006155= new IBSMR0006155_IDT();
	        iIBSMR0006155.setInqDscd(input.getInqDscd());
	        iIBSMR0006155.setDpsInpAcno(input.getDpsInpAcno());
	        
	        if(logger.isDebugEnabled()) {
				logger.debug("90190263 머니클립자계좌 정보조회 COM iIBSMR0006155 {} ::: ", iIBSMR0006155);
			}
	        
	        IBSMR0006155_ODT oIBSMR0006155= new IBSMR0006155_ODT();
	        
			WFInfResponse<IBSMR0006155_ODT> mcaOutput = sHRIBSMR0006155_COM.callTrx(iIBSMR0006155, interfaceCfg);
	
			oIBSMR0006155 = mcaOutput.getResponseData();
			
			if(logger.isDebugEnabled()) {
				logger.debug("90190263 머니클립자계좌 정보조회 COM oIBSMR0006155  {} ::: ", oIBSMR0006155);
			}
			
			/**
			 * @BXMType IF
			 * 정상 조회 처리여부
			 */
			output.setDpsInpAcno(oIBSMR0006155.getDpacNo()); // 수신계좌번호
			output.setDppdNm(oIBSMR0006155.getDppdNm()); // 수신상품명
			output.setDpacBal(oIBSMR0006155.getDpacBal()); // 수신계좌잔액
			output.setGridCnt(oIBSMR0006155.getCnt()); // 그리드건수
			output.setGrid(oIBSMR0006155.getGrid()); // 그리드
		} catch (Exception e) {
			logger.error("IBSMR0006155 Exception!! {} ", e);
			
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
			logger.debug("90190263 머니클립자계좌 정보조회 COM output  {} ::: ", output);
		}
		
		return output;
	}
	/**
	 * 머니클립 서비스의 지갑, 금고(별칭명, 아이콘을)를 수정하는 컴포넌트
	 * 
	 * 
	 * @param input 머니클립.자.계좌.등록.컴포넌트.입력.IO
	 * @return 머니클립.자.계좌.등록.컴포넌트.출력.IO
	 */
	@BxmCategory(logicalName="머니클립자계좌수정", description="머니클립의 자계좌 정보를 수정하는 컴포넌트", author="90190263")
	public MnyPinBscMngUpdateMnpChidAcno_DODT updateMnpChidAcno(MnyPinBscMngUpdateMnpChidAcno_DIDT input
	)
	{
		/**
		* @BXMType GetBean
		*/
		// WFInterfaceCfg 생성 컴포넌트
		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class);
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		sHRIBSMR0004224_COM= WFApplicationContext.getBean(sHRIBSMR0004224_COM, SHRIBSMR0004224_COM.class);
		shrBSCActNmMng_COM= WFApplicationContext.getBean(shrBSCActNmMng_COM, SHRBSCActNmMng_COM.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */
		MnyPinBscMngUpdateMnpChidAcno_DODT output= new MnyPinBscMngUpdateMnpChidAcno_DODT();
		
		/*
		 * 로직 추가
		 */
		//세션고객정보
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession(); 
		if(logger.isDebugEnabled()) {
			logger.debug("currentCust ====== {} ::: ", currentCust);
		} 
		
		if(logger.isDebugEnabled()) {
			logger.debug("90190263 머니클립자계좌 정보수정 COM input {} ::: ", input);
		}
		
		String errMsgTxt = "";
		
		/**
		 * 연계시스템 호출
		 * TYPE : MCA
		 * ID : IBSMR0004224
		 * NM : 인터넷뱅킹 예적금 항목변경
		 */
		try{
	        WFCustomTrnHeader wfCustomTrnHeader = new WFCustomTrnHeader();
			wfCustomTrnHeader.setFuncCd("30");
	    	
			//  MCA WFInterfaceCfg 객체 획득
			WFInterfaceCfg interfaceCfg  = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg();
			interfaceCfg.setCustomTrnHeader(wfCustomTrnHeader);
			interfaceCfg.getNciHeader().setAcno(input.getDpsInpAcno());
			interfaceCfg.setInterfaceId("IBSMR0004224");
	    	
	        IBSMR0004224_IDT iIBSMR0004224= new IBSMR0004224_IDT();
	        iIBSMR0004224.setDpsInpAcno(input.getDpsInpAcno()); // 수신입력계좌번호
	        iIBSMR0004224.setDpsRgsChgItcd(input.getDpsRgsChgItcd()); // 수신등록변경항목코드
	        iIBSMR0004224.setPrcDscd("20"); // 처리구분코드 (20: 등록)
	        iIBSMR0004224.setDpsRecdStcd("01"); // 수신레코드상태코드 (01:등록)
	        iIBSMR0004224.setFrotPrcYn("N"); // 대외처리여부
	        iIBSMR0004224.setGridRowCnt(1); // 그리드열건수
	        
	        List<IBSMR0004224_GRID_IDT> grid = input.getGrid();
			iIBSMR0004224.setGrid(grid); // 그리드
			
			String changeNameCode = "079033";
			/********************계좌 별명 관리 ********************/
			if (changeNameCode.equals(input.getDpsRgsChgItcd())) {
				IBSMR0004224_GRID_IDT updateNameItem = grid.get(0);
				
				String actName = updateNameItem.getDpsRgsChgDtcdTxt();
				
				SHRActNmIDT_DTO shrActNmIdt = new SHRActNmIDT_DTO();
				shrActNmIdt.setAcno(input.getDpsInpAcno()); // 계좌번호
				shrActNmIdt.setByactNm(actName); // 계좌별명
				shrActNmIdt.setSendNmUseYn("N");
				
				if (logger.isDebugEnabled()) {
					logger.debug("updateMnpChidAcno 계좌 별명 관리 수정 input :: {} ", shrActNmIdt);
				}
				SHRActNmODT_DTO actNmMngResult = shrBSCActNmMng_COM.mergeActNm(shrActNmIdt);
				
				if (logger.isDebugEnabled()) {
					logger.debug("updateMnpChidAcno 계좌 별명 관리 수정 output :: {} ", actNmMngResult);
				}
				
				if (ObjectUtils.isEmpty(actNmMngResult)) {
					output.setTrnRstCd("9999");
					output.setTrnRstTxt("계좌 별명 수정에 실패하였습니다.");
					
					return output;
				}
			}			
			
	        if(logger.isDebugEnabled()) {
				logger.debug("90190263 머니클립자계좌 정보수정 COM iIBSMR0004224 {} ::: ", iIBSMR0004224);
			}
	        
	        IBSMR0004224_ODT oIBSMR0004224= new IBSMR0004224_ODT();
	        
			WFInfResponse<IBSMR0004224_ODT> mcaOutput = sHRIBSMR0004224_COM.callTrx(iIBSMR0004224, interfaceCfg);
	
			oIBSMR0004224 = mcaOutput.getResponseData();
			
			if(logger.isDebugEnabled()) {
				logger.debug("90190263 머니클립자계좌 정보수정 COM oIBSMR0004224  {} ::: ", oIBSMR0004224);
			}
			
			/**
			 * @BXMType IF
			 * 정상 조회 처리여부
			 */
			output.setDpsInpAcno(oIBSMR0004224.getDpsInpAcno()); // 수신입력계좌번호
			output.setDpsRgsChgItcd(oIBSMR0004224.getDpsRgsChgItcd()); // 수신등록변경항목코드
			output.setGridRowCnt(oIBSMR0004224.getGridRowCnt()); // 그리드열건수
			output.setGrid(oIBSMR0004224.getGrid()); // 그리드
			
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

				Object[] args = we.getArguments();
	            
	            if(args != null && args.length>0) {
	            	errMsgTxt = args[0].toString();
				}
			} else {
				logger.error("Exception {} ", e);
				
				errMsgTxt = e.getMessage();				
			}
			output.setTrnRstCd("9999");
			output.setTrnRstTxt(errMsgTxt);
		}
		
		if(logger.isDebugEnabled()) {
			logger.debug("90190263 머니클립자계좌 정보수정 COM output  {} ::: ", output);
		}
		
		return output;
	}

	/**
	 * 머니클립노출순서기본조회 
	 * 
	 * @param input 머니클립노출순서기본조회.컴포넌트.입력.IO
	 * @return 머니클립노출순서기본조회.컴포넌트.출력.IO
	 */
	@BxmCategory(logicalName="머니클립노출순서기본조회", description="머니클립의 노출순서 정보를 조회하는 컴포넌트", author="90190263")
	public MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMSelectMnyClpExpsSeqMng_DODT selectMnyClpExpsSeqMng(MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMSelectMnyClpExpsSeqMng_DIDT input
	)
	{
		/**
		* @BXMType GetBean
		*/
		mnyClpExpsSeqMng001_DBM= WFApplicationContext.getBean(mnyClpExpsSeqMng001_DBM, MNY_CLP_EXPS_SEQ_MNG001_DBM.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */
		MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMSelectMnyClpExpsSeqMng_DODT output= new MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMSelectMnyClpExpsSeqMng_DODT();

		if(logger.isDebugEnabled()) {
			logger.debug("90190263 머니클립노출순서기본조회 COM input {} ::: ", input);
		}
		
		List<MNPBscInf_DTO> bscInfDtoList = new ArrayList<>();
		
		bscInfDtoList = mnyClpExpsSeqMng001_DBM.selectMnyClpExpsSeqMng(input);		
		
		output.setMnpBscInfGrid(bscInfDtoList);
	
		if(logger.isDebugEnabled()) {
			logger.debug("90190263 머니클립노출순서기본조회 COM output  {} ::: ", output);
		}
		
		return output;
	}
	
	/**
	 * 머니클립노출순서기본등록
	 * 
	 * @param input 머니클립노출순서기본등록.컴포넌트.입력.IO
	 * @return 머니클립노출순서기본등록.컴포넌트.출력.IO
	 */
	@BxmCategory(logicalName="머니클립노출순서기본등록", description="머니클립의 노출순서 정보를 등록하는 컴포넌트", author="90190263")
	public int insertMnyClpExpsSeqMng(MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMInsertMnyClpExpsSeqMng_DIDT input
	)
	{
		/**
		* @BXMType GetBean
		*/
		mnyClpExpsSeqMng001_DBM= WFApplicationContext.getBean(mnyClpExpsSeqMng001_DBM, MNY_CLP_EXPS_SEQ_MNG001_DBM.class);

		/**
		 * @BXMType VariableDeclaration
		 */

		if(logger.isDebugEnabled()) {
			logger.debug("90190263 머니클립노출순서기본조회 COM input {} ::: ", input);
		}
		
		int insertCnt = mnyClpExpsSeqMng001_DBM.insertMnyClpExpsSeqMng(input);		
	
		
		if(logger.isDebugEnabled()) {
			logger.debug("90190263 머니클립노출순서기본조회 COM insertCnt  {} ::: ", insertCnt);
		}
		
		return insertCnt;
	}
	
	/**
	 * 머니클립노출순서기본수정
	 * 
	 * @param input 머니클립노출순서기본수정.컴포넌트.입력.IO
	 * @return 머니클립노출순서기본수정.컴포넌트.출력.IO
	 */
	@BxmCategory(logicalName="머니클립노출순서기본수정", description="머니클립의 노출순서 정보를 수정하는 컴포넌트", author="90190263")
	public int updateMnyClpExpsSeqMng(MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMUpdateMnyClpExpsSeqMng_DIDT input
	)
	{
		/**
		* @BXMType GetBean
		*/
		mnyClpExpsSeqMng001_DBM= WFApplicationContext.getBean(mnyClpExpsSeqMng001_DBM, MNY_CLP_EXPS_SEQ_MNG001_DBM.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */

		if(logger.isDebugEnabled()) {
			logger.debug("90190263 머니클립노출순서기본수정 COM input {} ::: ", input);
		}
		
		int updateCnt = mnyClpExpsSeqMng001_DBM.updateMnyClpExpsSeqMng(input);		
	
		
		if(logger.isDebugEnabled()) {
			logger.debug("90190263 머니클립노출순서기본수정 COM output  {} ::: ", updateCnt);
		}
		
		return updateCnt;
	}
	
	/**
	 * 머니클립노출순서삭제
	 * 
	 * @param input 머니클립노출순서삭제.컴포넌트.입력.IO
	 * @return 머니클립노출순서삭제.컴포넌트.출력.IO
	 */
	@BxmCategory(logicalName="머니클립노출순서삭제", description="머니클립의 노출순서 정보를 삭제하는 컴포넌트", author="90190263")
	public int deleteMnyClpExpsSeqMng(MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMDeleteMnyClpExpsSeqMng_DIDT input
	)
	{
		/**
		* @BXMType GetBean
		*/
		mnyClpExpsSeqMng001_DBM= WFApplicationContext.getBean(mnyClpExpsSeqMng001_DBM, MNY_CLP_EXPS_SEQ_MNG001_DBM.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */

		if(logger.isDebugEnabled()) {
			logger.debug("90190263 머니클립노출순서삭제 COM input {} ::: ", input);
		}
		
		int deleteCnt = mnyClpExpsSeqMng001_DBM.deleteMnyClpExpsSeqMng(input);		
	
		
		if(logger.isDebugEnabled()) {
			logger.debug("90190263 머니클립노출순서삭제 COM output  {} ::: ", deleteCnt);
		}
		
		return deleteCnt;
	}
	
	/**
	 * 머니클립노출순서목록삭제 
	 * 
	 * @param input 머니클립노출순서삭제.컴포넌트.입력.IO
	 * @return 머니클립노출순서삭제.컴포넌트.출력.IO
	 */
	@BxmCategory(logicalName="머니클립노출순서목록삭제", description="머니클립의 노출순서 정보 목록을 삭제하는 컴포넌트", author="90190263")
	public int deleteMnyClpExpsSeqMngList(MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMDeleteMnyClpExpsSeqMngList_DIDT input
	)
	{
		/**
		* @BXMType GetBean
		*/
		mnyClpExpsSeqMng001_DBM= WFApplicationContext.getBean(mnyClpExpsSeqMng001_DBM, MNY_CLP_EXPS_SEQ_MNG001_DBM.class);
		
		int deleteCnt = mnyClpExpsSeqMng001_DBM.deleteMnyClpExpsSeqMngList(input.getItcsno(), input.getMnyClpMoAcno());		
		
		return deleteCnt;
	}
	
	/**
	 * 머니클립기본정보조회
	 * 
	 * @param input 머니클립기본정보조회.컴포넌트.입력.IO
	 * @return 머니클립기본정보조회.컴포넌트.출력.IO
	 */
	@BxmCategory(logicalName="머니클립기본정보조회", description="머니클립의 기본 정보를 조회한다", author="90190264")
	public MnyPinBscMngSelectMnpChidAcno_DODT selectMnpBscInf(MnyPinBscMngSelectMnpChidAcno_DIDT input
	)
	{
		sHRMMHCustSession_COM = WFApplicationContext.getBean(sHRMMHCustSession_COM, SHRMMHCustSession_COM.class);
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		mnyClpExpsSeqMng001_DBM= WFApplicationContext.getBean(mnyClpExpsSeqMng001_DBM, MNY_CLP_EXPS_SEQ_MNG001_DBM.class);
		
		MnyPinBscMngSelectMnpChidAcno_DODT output = new MnyPinBscMngSelectMnpChidAcno_DODT();
		// 자계좌 조회 컴포넌트 호출
		MnyPinBscMngSelectMnpChidAcno_DODT outputDodt = selectMnpChidAcno(input);
		
		MMH_CUST_INFO custInfo = sHRMMHCustSession_COM.getCustInfoSession();
		CMM_CURRENT_CUST loginCust = shrCMMLoginSession_COM.getLoginSession();
		
		output.setDpsInpAcno(outputDodt.getDpsInpAcno()); 			// 수신입력계좌번호
		output.setDppdNm(outputDodt.getDppdNm()); 						// 수신상품명
		output.setDpacBal(outputDodt.getDpacBal()); 						// 수신계좌잔액
		output.setGridCnt(outputDodt.getGridCnt()); 						// 그리드건수
		
		List<IBSMR0006155_GRID_ODT> gridOdt = new  ArrayList<>();
		
		gridOdt = outputDodt.getGrid();
		
		// 머니클립 노출 순서 테이블 조회
		MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMSelectMnyClpExpsSeqMng_DIDT wallExpsDidt = new MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMSelectMnyClpExpsSeqMng_DIDT();
		wallExpsDidt.setItcsno(custInfo.getItcsno());								// 통합고객번호
		wallExpsDidt.setMnyClpMoAcno(outputDodt.getDpsInpAcno());			// 모계좌번호
		
		MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMSelectMnyClpExpsSeqMng_DODT wallExpsList = selectMnyClpExpsSeqMng(wallExpsDidt);
		
		List<IBSMR0006155_GRID_ODT> outDataSortedList = new ArrayList<>();
		
		// 순서대로 데이터 세팅
		if(wallExpsList != null && wallExpsList.getMnpBscInfGrid().size() > 0) {
			// 머니클립 테이블 목록 반복문
			for(MNPBscInf_DTO grid : wallExpsList.getMnpBscInfGrid()) {
				String chidAcno = grid.getMnyClpChidAcno();			// 자계좌
				
				outDataSortedList.add(gridOdt.stream()
												      	 .filter(item -> chidAcno.equals(item.getMnyClpChidAcno()))
												      	 .findFirst()
												      	 .orElse(null));
			}
		}
		
		/***************노출 db에 없는 지갑 로직 추가****************/
		if(logger.isDebugEnabled()) {
			logger.debug("지갑 계좌 & DB sync 체크 시작 ");
		} 
		List<IBSMR0006155_GRID_ODT> dbInsertTargetList = new ArrayList<IBSMR0006155_GRID_ODT>();
		List<IBSMR0006155_GRID_ODT> wallList = gridOdt.stream().filter(item -> "1".equals(item.getMnyClpChidActDscd())).collect(Collectors.toList());
		if (wallList.size() > 0) {
			//계좌 데이터는 존재하고 DB에 등록안된 계좌 속출
			boolean isInsertTarget;
			for (IBSMR0006155_GRID_ODT wallItem : wallList) {
				isInsertTarget = true;
				for (IBSMR0006155_GRID_ODT sortedListItem : outDataSortedList) {
					if (sortedListItem == null) {
						continue;
					}
					
					if (wallItem.getMnyClpChidAcno().equals(sortedListItem.getMnyClpChidAcno())) {
						isInsertTarget = false;
						break;
					}
				}
				
				if (isInsertTarget) {
					dbInsertTargetList.add(wallItem);
				}
			}
		}
		if(logger.isDebugEnabled()) {
			logger.debug("지갑 계좌 & DB sync 체크 종료 ");
		} 
		
		if (dbInsertTargetList.size() > 0) {
			if(logger.isDebugEnabled()) {
				logger.debug("sync 시작, 대상 목록 ====== {} ::: ", dbInsertTargetList);
			} 
			MNPBscInf_DTO maxSeqDto = wallExpsList.getMnpBscInfGrid().stream().max((x, y) -> Integer.parseInt(x.getMnyClpChidActExpsSeq()) - Integer.parseInt(y.getMnyClpChidActExpsSeq())).orElse(null);
			int nextSeq = maxSeqDto == null ? 1 : Integer.valueOf(maxSeqDto.getMnyClpChidActExpsSeq()) + 1;
			for (IBSMR0006155_GRID_ODT insertItem : dbInsertTargetList) {
				// 없는계좌 추가
				MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMInsertMnyClpExpsSeqMng_DIDT insertDidt = new MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMInsertMnyClpExpsSeqMng_DIDT();
				insertDidt.setItcsno(custInfo.getItcsno()); 											// 통합고객번호
				insertDidt.setMnyClpMoAcno(input.getDpsInpAcno()); 							// 머니클립모계좌번호
				insertDidt.setMnyClpChidAcno(insertItem.getMnyClpChidAcno()); 				// 머니클립자계좌번호
				insertDidt.setMnyClpChidActDscd("1");									 				// 머니클립자계좌구분코드
				insertDidt.setMnyClpChidActNm(insertItem.getMnyClpChidActNm()); 			// 머니클립자계좌명
				insertDidt.setMnyClpChidActExpsSeq(String.valueOf(nextSeq++)); 			// 머니클립자계좌노출순서
				insertDidt.setMnyClpChidActIconNm(insertItem.getMnyClpIconNo()); 			// 머니클립자계좌아이콘명
				insertDidt.setRgpeId(loginCust.getUserId());											// 등록자ID
				insertDidt.setAmdpeId(loginCust.getUserId());										// 수정자ID
				
				insertMnyClpExpsSeqMng(insertDidt);
				
				outDataSortedList.add(insertItem);
			}
			
			if(logger.isDebugEnabled()) {
				logger.debug("sync 종료");
			} 
		}
		/*****************************************************/
		// 금고는 맨마지막에 넣음
		outDataSortedList.add(gridOdt.stream()
												 .filter(item -> "2".equals(item.getMnyClpChidActDscd()))
												 .findFirst()
												 .orElse(null));
		
		output.setGridCnt(outDataSortedList.size());
		output.setGrid(outDataSortedList);
		
		return output;
	}
	
	/**
	 * 머니클립노출순서목록삭제
	 * 
	 * @param input 머니클립노출순서삭제.컴포넌트.입력.IO
	 * @return 머니클립노출순서삭제.컴포넌트.출력.IO
	 */
	@BxmCategory(logicalName="머니클립노출순서목록삭제", description="머니클립의 노출순서 정보 목록을 삭제하는 컴포넌트", author="90190263")
	public MNPDeleteChidAcnoInfLstOut_DTO deleteChidAcnoInfLst(MNPDeleteChidAcnoInfLst_DTO input
	)
	{
		/**
		* @BXMType GetBean
		*/
		mnyClpExpsSeqMng001_DBM= WFApplicationContext.getBean(mnyClpExpsSeqMng001_DBM, MNY_CLP_EXPS_SEQ_MNG001_DBM.class);
		sHRMMHCustSession_COM = WFApplicationContext.getBean(sHRMMHCustSession_COM, SHRMMHCustSession_COM.class);
		sHRDAIDpstInsvCanc_COM= WFApplicationContext.getBean(sHRDAIDpstInsvCanc_COM, SHRDAIDpstInsvCanc_COM.class); 
		shrAllActInqTbk_COM = WFApplicationContext.getBean(shrAllActInqTbk_COM, SHRAllActInqTbk_COM.class);
		
		MNPDeleteChidAcnoInfLstOut_DTO output = new MNPDeleteChidAcnoInfLstOut_DTO();
		
		MMH_CUST_INFO custInfo = sHRMMHCustSession_COM.getCustInfoSession();
		
		if(input.getGrid().size() > 0) {
			for(MNPMnyPinBscMngSelectMnpChidAcno_DTO grid : input.getGrid()) {
				SHRDpstInsvCancExeInp_DTO iCancExeInp = new SHRDpstInsvCancExeInp_DTO();
				iCancExeInp.setCancAcno(grid.getMnyClpChidAcno()); 				// 해지계좌번호 : 자계좌번호
				iCancExeInp.setDpacBal(grid.getDpacCtBal().toString()); 			// 수신계좌잔액
				iCancExeInp.setRcvBkcd("020"); 												// 입금은행코드 : 모계좌은행코드
				iCancExeInp.setRcvAcno(input.getDpsInpAcno()); 						// 입금계좌번호 : 모계좌번호
				iCancExeInp.setRnpeFnm(custInfo.getCusKorlNm()); 					// 수취인성명
				iCancExeInp.setActPwnoUsgYn("M"); 										// 계좌비밀번호사용여부 20241119 M으로 변경
				iCancExeInp.setEncyActPwno(""); 											// 암호화계좌비밀번호
				// 예적금 해지 컴포넌트 호출
				
				SHRDpstInsvCancOut_DTO oCancExeInp= sHRDAIDpstInsvCanc_COM.callDpidcanc(iCancExeInp);
				if (logger.isDebugEnabled()) {
					logger.debug("90190264 머니클립금고해지수정 SVC callDpidcancexe oCancExeInp :: {} ", oCancExeInp);
				}
				
				if( "Y".equals( oCancExeInp.getScsYn() ) ) {
					//전계좌세션 갱신 요청 24.11.19 
					shrAllActInqTbk_COM.selectSessActList(SHRBSCInquiryConstant.BSC_ACT_LIST_INQ_DIS_ALL, true);
					
					MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMDeleteMnyClpExpsSeqMng_DIDT delDidt = new MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMDeleteMnyClpExpsSeqMng_DIDT();
					
					delDidt.setItcsno(custInfo.getItcsno());								// 통합고객번호		
					delDidt.setMnyClpMoAcno(input.getDpsInpAcno());					// 머니클립모계좌번호
					delDidt.setMnyClpChidAcno(grid.getMnyClpChidAcno()); 			// 머니클립자계좌번호
					
					int deleteCnt = mnyClpExpsSeqMng001_DBM.deleteMnyClpExpsSeqMng(delDidt);	
					
					if(deleteCnt > 0 ) {
						output.setErrMsgId("FNSE0001");
						output.setErrMsgTxt("지갑을 삭제 하였습니다.");						
					} else {
						// 테이블에 삭제할 자계좌가 없을 경우
						throw new WFApplicationException("FNSE0006", new Object[] {"삭제 할 지갑/금고가 없습니다."}, new Object[] {"9999"});
					}
				} else {
					// todo: 코드 및 문구 추가
					output.setErrMsgId("FNSE0006");
					output.setErrMsgTxt("지갑 삭제를 실패 하였습니다.");
				}
			}
		}
		
		
		
		return output;
	}
	
	/**
	 * 머니클립출금계좌등록
	 * 
	 * @param input 머니클립출금계좌등록.컴포넌트.입력.IO
	 * @return 머니클립출금계좌등록.컴포넌트.출력.IO
	 */
	@BxmCategory(logicalName="머니클립출금계좌등록", description="머니클립의 출금계좌로 들옥하는 컴포넌트", author="90190263")
	public MNPMnyPinBscMngInsertWdrAcnoOut_DTO insertWdrAcno(MNPMnyPinBscMngInsertWdrAcnoIn_DTO input
	)
	{
		/**
		* @BXMType GetBean
		*/
		sHRMMHCustSession_COM = WFApplicationContext.getBean(sHRMMHCustSession_COM, SHRMMHCustSession_COM.class);
		sHRIBSMR0002963_COM= WFApplicationContext.getBean(sHRIBSMR0002963_COM, SHRIBSMR0002963_COM.class);
		
		MNPMnyPinBscMngInsertWdrAcnoOut_DTO output = new MNPMnyPinBscMngInsertWdrAcnoOut_DTO();
		
		
		//세션고객정보
		MMH_CUST_INFO currentCust = sHRMMHCustSession_COM.getCustInfoSession();
		CMM_CURRENT_CUST loginCust = shrCMMLoginSession_COM.getLoginSession();
		if(logger.isDebugEnabled()) {
			logger.debug("currentCust ====== {} ::: ", currentCust);
			logger.debug("loginCust ====== {} ::: ", loginCust);
		} 
		
		if(logger.isDebugEnabled()) {
			logger.debug("90190263 머니클립자계좌등록 COM input {} ::: ", input);
		}
		
		String errMsgTxt = "";
		
		/**
		 * 연계시스템 호출
		 * TYPE : MCA
		 * ID :  IBSMR0002963
		 * NM :  요구불예금 신규실행
		 */
		try{
			//  MCA WFInterfaceCfg 객체 획득
			WFInterfaceCfg interfaceCfg  = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg();
			interfaceCfg.setInterfaceId("IBSMR0002963");
			        
	        IBSMR0002963_IDT iIBSMR0002963 = new IBSMR0002963_IDT();
			
			iIBSMR0002963.setEbnkUtzpeNo(loginCust.getUserId());
			iIBSMR0002963.setItcsno(loginCust.getItcsno());
			iIBSMR0002963.setCnt(1);
			
			List<IBSMR0002963_GRID_IDT> oIBSMR0002963Grid = new ArrayList<IBSMR0002963_GRID_IDT>();
			IBSMR0002963_GRID_IDT iIBSMR0002963Grid = new IBSMR0002963_GRID_IDT();
			oIBSMR0002963Grid.add(iIBSMR0002963Grid);
			iIBSMR0002963Grid.setEbnkActDscd("01");
			iIBSMR0002963Grid.setWdrActUnitRcvDgnYn("N");
			iIBSMR0002963Grid.setBrcActYn("N");

			oIBSMR0002963Grid.add(iIBSMR0002963Grid);

			oIBSMR0002963Grid = new ArrayList<IBSMR0002963_GRID_IDT>();
			iIBSMR0002963.setEbnkActDscd("01");
			iIBSMR0002963.setCusWdrAcno(input.getAcno());
			// TODO 대응개발 후 삭제 필요
			iIBSMR0002963.setWdrActPwno("1004");
			
			iIBSMR0002963Grid.setBkwAcno(input.getAcno());
			oIBSMR0002963Grid.add(iIBSMR0002963Grid);
			iIBSMR0002963.setGrid(oIBSMR0002963Grid);
			
	        if(logger.isDebugEnabled()) {
				logger.debug("90190263 머니클립출금계좌등록 COM iIBSMR0002963 {} ::: ", iIBSMR0002963);
			}
			
	        IBSMR0002963_ODT oIBSMR0002963= new IBSMR0002963_ODT();
	        
			WFInfResponse<IBSMR0002963_ODT> mcaOutput = sHRIBSMR0002963_COM.callTrx(iIBSMR0002963, interfaceCfg);
			oIBSMR0002963 = mcaOutput.getResponseData();
			
			if(logger.isDebugEnabled()) {
				logger.debug("90190263 머니클립출금계좌등록 COM oIBSMR0002963  {} ::: ", oIBSMR0002963);
			}
			/**
			 * @BXMType IF
			 * 정상 조회 처리여부
			 */
			
			if(!mcaOutput.hasError()){
				output.setPrcRtcd("0000");
				output.setPrcRstTxt("정상적으로 처리 되었습니다.");

			} else {
				output.setPrcRtcd("9990");
				//output.setPrcRstTxt("정상적으로 처리 되었습니다.");
			}
		} catch (Exception e) {
			logger.error("IBSMR0004252 Exception!! {} ", e);
			
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
			output.setPrcRtcd("9990");
			output.setPrcRstTxt(errMsgTxt);
		}

		return output;
	}
}
