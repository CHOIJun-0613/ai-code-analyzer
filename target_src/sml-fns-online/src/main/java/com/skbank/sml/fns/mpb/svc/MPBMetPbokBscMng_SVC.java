package com.skbank.sml.fns.mpb.svc;

import java.io.File;
import java.math.BigDecimal;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.web.multipart.MultipartFile;

import com.skbank.sml.afs.shr.com.SHRAFSTeenTeenPwno_COM;
import com.skbank.sml.afs.shr.dto.SHRAFSTeenTeenPwnoSelectPpactPwnoVrfKeyPad_DODT;
import com.skbank.sml.afs.shr.dto.SHRAFSTeenTeenPwnoSelectPpactPwnoVrf_DIDT;
import com.skbank.sml.bsc.shr.com.SHRAllActInqTbk_COM;
import com.skbank.sml.bsc.shr.cst.cstt.SHRBSCCRTNfsConstant;
import com.skbank.sml.bsc.shr.cst.cstt.SHRBSCInquiryConstant;
import com.skbank.sml.cec.shr.com.SHRCECBypsPrvnUtil_COM;
import com.skbank.sml.cec.shr.com.SHRCRTNFSCmm_COM;
import com.skbank.sml.cec.shr.dto.SHRCECBypsPrvnUtilSetBypsPrvnInfoInp_DTO;
import com.skbank.sml.cec.shr.dto.SHRCRTNFSCmmInsertNFSlkBizinf_DTO;
import com.skbank.sml.cmm.shr.com.SHRCECDNISession_COM;
import com.skbank.sml.cmm.shr.com.SHRCMMInterfaceCfg_COM;
import com.skbank.sml.cmm.shr.com.SHRCMMLoginSession_COM;
import com.skbank.sml.cmm.shr.com.SHRFNSMbhSession_COM;
import com.skbank.sml.cmm.shr.com.SHRUmsKkoSend_COM;
import com.skbank.sml.cmm.shr.com.SHRUmsPushSend_COM;
import com.skbank.sml.cmm.shr.dto.CEC_DNI_ACNM_CNF_INFO;
import com.skbank.sml.cmm.shr.dto.CMM_CURRENT_CUST;
import com.skbank.sml.cmm.shr.dto.FNS_MBH_INFO;
import com.skbank.sml.cmm.shr.dto.SHRUmsPushSend_DTO;
import com.skbank.sml.cmm.shr.dto.SHRUmsSmsSend_DTO;
import com.skbank.sml.fns.mpb.com.MPBMetPbokBscMng_COM;
import com.skbank.sml.fns.mpb.com.MPBMetPbokFncTrnMng_COM;
import com.skbank.sml.fns.mpb.com.MPBMetPbokMbhMng_COM;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMbhActInfGrid;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscInfGridInq;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMbhInfGrid_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngInsertMetPbokAutoRptPush_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngInsertMetPbokAutoRptPush_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngInsertMetPbokBscInf_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngInsertMetPbokBscInf_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngInsertMetPbokPushNtfcSnd_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngInsertMetPbokPushNtfcSnd_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngInsertNtarInf_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngInsertNtarInf_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngSelectMbhActInf_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngSelectMbhActInf_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngSelectMetPbokAutoRptInf_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngSelectMetPbokAutoRptInf_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngSelectMetPbokBscInfAcno_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngSelectMetPbokBscInfAcno_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngSelectMetPbokBscInf_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngSelectMetPbokBscInf_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngSelectMetPbokCmnScrtCrtf_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngSelectMetPbokCmnScrtCrtf_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngSelectMetPbokEsnsPwnoCrtf_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngSelectMetPbokEsnsPwnoCrtf_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngSelectMetPbokImgInf_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngSelectMetPbokImgInf_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngSelectMetPbokJnngInf_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngSelectMetPbokJnngInf_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngSelectMetPbokMainInf_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngSelectMetPbokMainInf_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngSelectMsgCad_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngSelectMsgCad_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngSelectNtarInf_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngSelectNtarInf_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngUpdateMetPbokImgInfInlt_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngUpdateMetPbokImgInf_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngUpdateMetPbokImgInf_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngUpdateMetPbokMetNm_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngUpdateMetPbokMetNm_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngUpdateMetPbokNtfcAgrEst_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngUpdateMetPbokNtfcAgrEst_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngUpdateMetPbokSrvcScss_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngUpdateMetPbokSrvcScss_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngUpdateNtarInf_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngUpdateNtarInf_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngupdateMetPbokImgInfInlt_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokFncTrnMngSelectHswfMetLifecGoalInf_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokMbhInfListInq_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokNtfcAgrEstAmdGrid_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokNtfcAgrEstAmdGrid_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMsgCadGridInq_ODT;
import com.skbank.sml.fns.mpb.dto.HswfMetLifecExpdPtsSub_DODT;
import com.skbank.sml.fns.mpb.dto.HswfMetLifecExpdPts_DIDT;
import com.skbank.sml.fns.mpb.dto.HswfMetLifecExpdPts_DODT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_LIFEC_MNG_LDG001SelectMetPbokLifecMngLdgPkInfo_DIDT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_LIFEC_MNG_LDG001SelectMetPbokLifecMngLdgPkInfo_DODT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_MBH_CRTF_MNG_LDG001InsertMetPbokWaitMbhInf_DIDT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_MBPF_TS_REQ_INF001SelectAllTsReqCnt_DIDT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_MSG_CAD_INF001SelectMetPbokMsgCadInf_DIDT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_MSG_CAD_INF001SelectMetPbokMsgCadInf_DODT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_NTAR_INF001InsertNtarinf_DIDT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_NTAR_INF001SelectNtarinf_DIDT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_NTAR_INF001SelectNtarinf_DODT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_NTAR_INF001UpdateNtarinf_DIDT;
import com.skbank.sml.fns.mpb.dto.MPBMetPbokBscMngPushNtfcSndMbhList_DTO;
import com.skbank.sml.fns.mpb.dto.MPBMetPbokBscMnginsertMetPbokPushNtfcSndInput_DTO;
import com.skbank.sml.fns.mpb.dto.MPBMetPbokMbhMngSelectCsInf_DODT;
import com.skbank.sml.fns.mpb.dto.MbpfRcvstsInq_DIDT;
import com.skbank.sml.fns.mpb.dto.MbpfRcvstsInq_DODT;
import com.skbank.sml.fns.mpb.dto.MetPbokBscInfGrid;
import com.skbank.sml.fns.mpb.dto.MetPbokBscInfInq_DIDT;
import com.skbank.sml.fns.mpb.dto.MetPbokBscInfInq_DODT;
import com.skbank.sml.fns.mpb.dto.MetPbokBscMbhInfGrid_DIDT;
import com.skbank.sml.fns.mpb.dto.MetPbokBscMbhInfGrid_DODT;
import com.skbank.sml.fns.mpb.dto.MetPbokBscMbhInf_DIDT;
import com.skbank.sml.fns.mpb.dto.MetPbokBscMbhInf_DODT;
import com.skbank.sml.fns.mpb.dto.MetPbokImgInfInq_DODT;
import com.skbank.sml.fns.mpb.dto.MetPbokMbhInfInq_DIDT;
import com.skbank.sml.fns.mpb.dto.MetPbokMbhInfInq_DODT;
import com.skbank.sml.fns.mpb.dto.MetPbokMbhInfListInq_DODT;
import com.skbank.sml.fns.mpb.dto.MetPbokTrnPrtsGrid;
import com.skbank.sml.fns.mpb.dto.MetPbokTrnPrts_DIDT;
import com.skbank.sml.fns.mpb.dto.MetPbokTrnPrts_DODT;
import com.skbank.sml.fns.shr.com.SHRINBPushBiz_COM;
import com.skbank.sml.fns.shr.com.SHRMPBBiz_COM;
import com.skbank.sml.fns.shr.cst.cstt.SHRMPBCmmConstant;
import com.skbank.sml.fns.shr.dto.SHRINBPushBscInf_DTO;
import com.skbank.sml.fns.shr.dto.SHRMPBBizSelectPushInfOut_DTO;
import com.skbank.sml.ifi.mca.eims1.dto.IBSMR0004961_GRID_ODT;
import com.skbank.sml.ifi.mca.eims1.dto.IBSMR0004961_IDT;
import com.skbank.sml.ifi.mca.eims1.dto.IBSMR0004961_ODT;
import com.skbank.sml.ifi.mca.eims2.dto.IBSMR0005762_IDT;
import com.skbank.sml.ifi.mca.eims2.dto.IBSMR0005762_ODT;
import com.skbank.sml.ifi.mca.eims6.dto.IBSMR0005766_IDT;
import com.skbank.sml.ifi.mca.eims6.dto.IBSMR0005766_ODT;
import com.skbank.sml.ifi.mca.eims9.dto.IBSMR0005769_GRID_ODT;
import com.skbank.sml.ifi.mca.eims9.dto.IBSMR0005769_IDT;
import com.skbank.sml.ifi.mca.eims9.dto.IBSMR0005769_ODT;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0004961_COM;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0005762_COM;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0005766_COM;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0005769_COM;

import bxm.common.annotaion.BxmCategory;
import fwk.skbank.asis.adaptor.dto.request.WFInterfaceCfg;
import fwk.skbank.asis.adaptor.dto.response.WFInfResponse;
import fwk.skbank.asis.adaptor.header.request.WFNciHeader;
import fwk.skbank.online.context.WFApplicationContext;
import fwk.skbank.online.enc.WFCryptEtcUtils;
import fwk.skbank.online.exception.app.WFApplicationException;
import fwk.skbank.online.exception.frm.SFAdaptorApplicationException;
import fwk.skbank.online.exception.frm.SFInterfaceSystemException;
import fwk.skbank.online.file.controller.dto.WFFileUtilDTO;
import fwk.skbank.online.file.util.WFFileUtils;
import fwk.skbank.online.util.WFDateUtils;
import fwk.skbank.online.util.WFStringUtils;

/**
 * 1.업무명 : 금융서비스 
 * 2.단위업무명 : NEWWON 중분류 모임통장 
 * 3.프로그램명 : 모임통장.일반.관리.서비스 
 * 4.설명 : 모임통장의 일반적인 정보를 관리하는 서비스
 * 
 * @Class MPBMetPbokBscMng_SVC.java
 * @author 90190263
 * @since 2024.03.27
 * @version 1.0
 */

@Service
@BxmCategory(logicalName="모임통장.일반.관리.서비스", description="모임통장의 일반적인 정보를 관리하는 서비스")
public class MPBMetPbokBscMng_SVC {
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
	 * 모임통장.일반.관리.컴포넌트
	 */
	private MPBMetPbokBscMng_COM mPBMetPbokBscMng_COM;	
	/**
	 * 모임통장.회원.관리.컴포넌트
	 */
	private MPBMetPbokMbhMng_COM mPBMetPbokMbhMng_COM;
	/**
	 * 모임통장.금융거래.관리.컴포넌트
	 */
	private MPBMetPbokFncTrnMng_COM mPBMetPbokFncTrnMng_COM;
	
	/**
	 * 당타행 요구불계좌 내역조회
	 */
	private SHRIBSMR0004961_COM sHRIBSMR0004961_COM;
	/**
	 * 모임통장 서비스등록
	 */
	private SHRIBSMR0005762_COM sHRIBSMR0005762_COM;
    /**
	 * 모임통장 서비스해제
	 */
	private SHRIBSMR0005766_COM sHRIBSMR0005766_COM;
	/**
	 * 모임통장 기본정보조회
	 */
	private SHRIBSMR0005769_COM sHRIBSMR0005769_COM;
	/**
	 * UMS_PUSH 전송
	 */
	private SHRUmsPushSend_COM sHRUmsPushSend_COM;
	/**
	 * UMS_Kakao 전송
	 */
	private SHRUmsKkoSend_COM sHRUmsKkoSend_COM;
	/**
	 * 인증보안 인증우회방지 공통 컴포넌트
	 */
	private SHRCECBypsPrvnUtil_COM shrCECBypsPrvnUtil_COM;
	/**
	 * 간편비밀번호 인증 공통 컴포넌트
	 */
	private SHRAFSTeenTeenPwno_COM sHRAFSTeenTeenPwno_COM;
	/**
	 * 모임통장 회원 세션 컴포넌트
	 */
	private SHRFNSMbhSession_COM sHRFNSMbhSession_COM;
	/**
	 * 모임통장 쉐어 컴포넌트
	 */
	private SHRMPBBiz_COM sHRMPBBiz_COM;
	/**
	 * 푸쉬동의여부 조회
	 */
	private SHRINBPushBiz_COM sHRINBPushBiz_COM; 
	
	private SHRCRTNFSCmm_COM sHRCRTNFSCmm_COM;
	/**
	 * 인증보안 비대면실명확인 정보 세션 컴포넌트
	 */
	private SHRCECDNISession_COM shrCECDNISession_COM;
	
	/** 계좌정보세션.컴포넌트 */
	private SHRAllActInqTbk_COM sHRAllActInqTbk_COM;
	/**
	 *모임통장.공통.보안인증.셋팅
	 * 
	 * @param input 
	 * @return 
	 */
	@BxmCategory(logicalName="모임통장.공통.보안인증.셋팅", description="모임통장.공통.보안인증.셋팅 및 로그인 세션 정보를 조회한다.", author="90190263")
	public MPBMetPbokBscMngSelectMetPbokCmnScrtCrtf_ODT selectMetPbokCmnScrtCrtf(MPBMetPbokBscMngSelectMetPbokCmnScrtCrtf_IDT input){
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		shrCECBypsPrvnUtil_COM = WFApplicationContext.getBean(shrCECBypsPrvnUtil_COM, SHRCECBypsPrvnUtil_COM.class);
		sHRCRTNFSCmm_COM = WFApplicationContext.getBean(sHRCRTNFSCmm_COM, SHRCRTNFSCmm_COM.class);
		shrCECDNISession_COM = WFApplicationContext.getBean(shrCECDNISession_COM, SHRCECDNISession_COM.class);
		
		MPBMetPbokBscMngSelectMetPbokCmnScrtCrtf_ODT output = new MPBMetPbokBscMngSelectMetPbokCmnScrtCrtf_ODT();
		
		/*
		 * 인증우회방지 사전 정보 생성
		 * */
		SHRCECBypsPrvnUtilSetBypsPrvnInfoInp_DTO inputParam = new SHRCECBypsPrvnUtilSetBypsPrvnInfoInp_DTO();

		if(logger.isDebugEnabled()) {
			logger.debug("90190263 모임통장.공통.보안인증.셋팅 SVC input {} ::: ", input);
		}

		String scrtMdUsgYn = StringUtils.isNotEmpty( input.getScrtMdUsgYn() ) ? input.getScrtMdUsgYn() : "Y";
		
		if(logger.isDebugEnabled()) {
			logger.debug("90190263 모임통장.공통.보안인증.셋팅 SVC scrtMdUsgYn {} ::: ", scrtMdUsgYn);
			
		}
		
		inputParam.setSkipCert("N");								// 인증서 인증 SKIP여부(기본값: N)
		inputParam.setSkipSecuToken(scrtMdUsgYn);		// 보안매체 인증 SKIP여부(기본값: N)
		inputParam.setE2ETgtYn("Y");								// E2E 체크 여부(기본값: Y)

		shrCECBypsPrvnUtil_COM.setBypsPrvnInfo(inputParam);
		 
		if (!shrCMMLoginSession_COM.istLogin()) {
			//  로그인 세션이 존재하지 않습니다.
			throw new WFApplicationException("CMME0018");
		} else {
			//세션고객정보
			CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession();
			
			if(logger.isDebugEnabled()) {
				logger.debug("currentCust ====== {} ::: ", currentCust);
			} 
			
			if("Y".equals(input.getDniAcnmCnfYn())) {
				CEC_DNI_ACNM_CNF_INFO dniInfo = shrCECDNISession_COM.getDniAcnmCnfInfo();
				String lnkdBizId = WFStringUtils.nvl(dniInfo.getLnkdBizId(), "");
				
				if(logger.isDebugEnabled()) {
					logger.debug("dniInfo ====== {} ::: ", dniInfo);
					logger.debug("lnkdBizId ====== {} ::: ", lnkdBizId);
				}
				
				if("NWFNS00009_013P".equals(lnkdBizId)) { 
					/**
					 * 비대면 실명확인 연계업무 진행정보 저장 [성공케이스]
					 */
					String dniAcnmCnfIdfId = dniInfo.getDniAcnmCnfIdfId();
					SHRCRTNFSCmmInsertNFSlkBizinf_DTO dniInputParam = new SHRCRTNFSCmmInsertNFSlkBizinf_DTO();
					dniInputParam.setDniAcnmCnfIdfId(dniAcnmCnfIdfId);	// 세션에서 가져온 비대면식별ID
					//dniInputParam.setLnkdBizGlblId(IBSMR0000177_Response.getSystemHeader().getGlblId()); // guid
					dniInputParam.setLnkdBizPrgStepId(lnkdBizId);		// 세션에서 가져온 연계업무ID 또는 업무별로 정의한 연계업무진행단계ID
					dniInputParam.setLnkdBizCmplYn("Y");				// 연계업무 완료여부
					dniInputParam.setLnkdBizPrgStepId("NW_NON_STEP");
					dniInputParam.setLnkdBizPrgStepCd(SHRBSCCRTNfsConstant.NFS_LNKD_BIZ_PRG_STEP_CD_CMPL);	// 연계업무진행단계코드(C: 완료)
					SHRCRTNFSCmmInsertNFSlkBizinf_DTO dniOutput = sHRCRTNFSCmm_COM.insertNFSlkBizinf(dniInputParam);
					
					logger.debug("dniOutput :::::::::::::, {}", dniOutput);
				}
			}
			
			output.setUserId(currentCust.getUserId()); // 이용자아이디
			output.setItcsno(currentCust.getItcsno()); // 통합고객번호
			output.setSpCusYn(currentCust.getSpCusYn()); // 간편회원여부
			output.setEsnsMbhNo(currentCust.getEsnsMbhNo()); // 고객간편회원일련번호
			output.setCiNo(currentCust.getCusCiNo()); // CI번호
		}
		
		return output;
	}
	
	/**
	 * 모임통장.가입정보를 조회 하는 서비스
	 * 
	 * @param input 모임통장.가입정보.조회.컨트롤러.입력.IO
	 * @return 모임통장.가입정보.조회.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName="모임통장.가입.정보.조회", description="모임통장의 가입 정보를 조회하는 서비스", author="90190263")
	public MPBMetPbokBscMngSelectMetPbokJnngInf_ODT selectMetPbokJnngInf(MPBMetPbokBscMngSelectMetPbokJnngInf_IDT input)
	{
		/**
		* @BXMType GetBean
		*/
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		// WFInterfaceCfg 생성 컴포넌트
		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class);
		sHRIBSMR0004961_COM= WFApplicationContext.getBean(sHRIBSMR0004961_COM, SHRIBSMR0004961_COM.class);
		sHRIBSMR0005769_COM= WFApplicationContext.getBean(sHRIBSMR0005769_COM, SHRIBSMR0005769_COM.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokBscMngSelectMetPbokJnngInf_ODT output= new MPBMetPbokBscMngSelectMetPbokJnngInf_ODT();
		/*
		 * 로직 추가
		 * 세션 저장
		 */
		boolean metPtcpYn = false; // 모임통장 가입여부 
		output.setMetPbokJnngYn("N");
		output.setLginYn("Y");		
		
		if (!shrCMMLoginSession_COM.istLogin()) {
			output.setLginYn("N");
			output.setItcsno("");
			output.setEbnkUtzpeNo("");
			
			return output;
		} 
		
		try{
			//세션고객정보
			CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession(); 
			if(logger.isDebugEnabled()) {
				logger.debug("currentCust ====== {} ::: ", currentCust);
			} 
			
			if( StringUtils.isEmpty(currentCust.getUserId())) {
				output.setLginYn("N");
				output.setItcsno("");
				output.setEbnkUtzpeNo("");
				
				return output;
			} else {
				output.setItcsno(currentCust.getItcsno());
				output.setEbnkUtzpeNo(currentCust.getUserId());
			}
			
			
			if(logger.isDebugEnabled()) {
				logger.debug("90190263 모임통장.가입.정보 .모임통장.기본정보.조회 SVC input {} ::: ", input);
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
			if(!ObjectUtils.isEmpty( oIBSMR0005769.getGrid() )) {
				for( IBSMR0005769_GRID_ODT oMetPbokBscData : oIBSMR0005769.getGrid()) {
					output.setMetPbokJnngYn("Y"); // 모임통장가입여부
					output.setMetRgsDt(oMetPbokBscData.getMetRgsDt()); // 모임등록일자
					metPtcpYn = true;
					
					break;
				}
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
			if( !metPtcpYn ) {
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
						output.setMetRgsDt(filterMbhActInfData.getMetRgsDt()); // 모임등록일자
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
					
		if(logger.isDebugEnabled()) {
			logger.debug("90190263 모임통장.가입.정보.조회 SVC output  {} ::: ", output);
		}
		
		return output;
	}

	/**
	 * 모임통장 서비스의 가입가능여부 및 입출금계좌정보를 조회하는 서비스
	 * 
	 * @param input 모임통장.초대정보.조회.컨트롤러.입력.IO
	 * @return 모임통장.초대정보.조회.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName="회원.계좌.정보.조회", description="모임통장 서비스의 가입가능여부 및 입출금계좌정보를 조회하는 서비스", author="90190263")
	public MPBMetPbokBscMngSelectMbhActInf_ODT selectMbhActInf(MPBMetPbokBscMngSelectMbhActInf_IDT input)
	{
			
		/**
		* @BXMType GetBean
		*/
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		// WFInterfaceCfg 생성 컴포넌트
		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class);
		sHRIBSMR0004961_COM= WFApplicationContext.getBean(sHRIBSMR0004961_COM, SHRIBSMR0004961_COM.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokBscMngSelectMbhActInf_ODT output= new MPBMetPbokBscMngSelectMbhActInf_ODT();
		 
		/* 
		 * 로직 추가
		 */
		//세션고객정보
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession(); 
		if(logger.isDebugEnabled()) {
			logger.debug("currentCust ====== {} ::: ", currentCust);
		} 
		
		 if(logger.isDebugEnabled()) {
			logger.debug("90190263 회원.계좌.정보.조회 SVC input  {} ::: ", input);
		}
		
		 String errMsgTxt = "";
		 
		/**
		 * 연계시스템 호출 
		 * TYPE : MCA
		 * ID : IBSMR0004961 
		 * NM : 당타행 요구불계좌 내역조회
		 * 당타행구분코드 : [1] 당행
		 */
		try{
			//  MCA WFInterfaceCfg 객체 획득
			WFInterfaceCfg interfaceCfg  = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg();
			interfaceCfg.setInterfaceId("IBSMR0004961");
			

	        // WFNciHeader 셋팅
            WFNciHeader wfnciHeader = interfaceCfg.getNciHeader();
            
	        // 간편회원일 경우 userID, 통합고객번호 초기화
	        if( shrCMMLoginSession_COM.isEsnsMbh() == true ) {
	        	wfnciHeader.setEbnkUtzpeNo("");
	            wfnciHeader.setItcsno("");  
	        }

            // interfaceCfg 셋팅
            interfaceCfg.setNciHeader(wfnciHeader);   
            
	        
	        IBSMR0004961_ODT oIBSMR0004961 = new IBSMR0004961_ODT();
	        IBSMR0004961_IDT iIBSMR0004961 = new IBSMR0004961_IDT();
	        iIBSMR0004961.setItcsno(currentCust.getItcsno()); // 통합고객번호
	        iIBSMR0004961.setTobkDscd("1"); // 당타행구분코드
	        
	        if(logger.isDebugEnabled()) {
				logger.debug("90190263  당타행 요구불계좌 내역조회 SVC iIBSMR0004961  {} ::: ", iIBSMR0004961);
			}
	        
			WFInfResponse<IBSMR0004961_ODT> mcaOutput = sHRIBSMR0004961_COM.callTrx(iIBSMR0004961, interfaceCfg);
	
			oIBSMR0004961 = mcaOutput.getResponseData();
	
			if(logger.isDebugEnabled()) {
				logger.debug("90190263 당타행 요구불계좌 내역조회 SVC oIBSMR0004961  {} ::: ", oIBSMR0004961);
			}
			 
			/**
			 * @BXMType IF
			 * 입출금 계좌 목록 조회
			 */
			List<MPBMbhActInfGrid> outDataList = new ArrayList<>();
			
			for( IBSMR0004961_GRID_ODT oMbhActInfData : oIBSMR0004961.getGrid() ) {
				MPBMbhActInfGrid outData = new MPBMbhActInfGrid();

				if("Y".equals(oMbhActInfData.getMetPbokJnngAvlYn())) { // 모임통장가입가능여부  
					outData.setTobkDscd(oMbhActInfData.getTobkDscd()); // 당타행구분코드
					outData.setOpenBnkgBkcd(oMbhActInfData.getOpenBnkgBkcd()); // 오픈뱅킹은행코드
					outData.setOpenBnkgAcno(oMbhActInfData.getOpenBnkgAcno()); // 오픈뱅킹계좌번호
					outData.setOpenBnkgActDscd(oMbhActInfData.getOpenBnkgActDscd()); // 오픈뱅킹계좌구분코드
					outData.setOpenBnkgActPrdNm(oMbhActInfData.getOpenBnkgActPrdNm()); // 오픈뱅킹계좌상품명
					outData.setOpenBnkgByactNm(oMbhActInfData.getOpenBnkgByactNm()); // 오픈뱅킹계좌별명
					outData.setOpenBnkgInqYn(oMbhActInfData.getOpenBnkgInqYn()); // 오픈뱅킹조회여부
					outData.setOpenBnkgWdrYn(oMbhActInfData.getOpenBnkgWdrYn()); // 오픈뱅킹출금여부
					outData.setReqCusFnchUtzNo(oMbhActInfData.getReqCusFnchUtzNo()); // 요청고객핀테크이용번호
					outData.setAcnmCnfVrtgtYn(oMbhActInfData.getAcnmCnfVrtgtYn()); // 실명확인검증대상여부
					outData.setIndvSavBkcd(oMbhActInfData.getIndvSavBkcd()); // 개별저축은행코드
					outData.setIndvSavBkNm(oMbhActInfData.getIndvSavBkNm()); // 개별저축은행명
					outData.setDpacNo(oMbhActInfData.getDpacNo()); // 수신계좌번호
					outData.setCusUsgBkwAcno(oMbhActInfData.getCusUsgBkwAcno()); // 고객사용전행계좌번호
					outData.setDpacStcd(oMbhActInfData.getDpacStcd()); // 수신계좌상태코드
					outData.setPsklActYn(oMbhActInfData.getPsklActYn()); // 통장대출계좌여부
					outData.setDpacCtBal(oMbhActInfData.getDpacCtBal()); // 수신계좌현재잔액
					outData.setPdcd(oMbhActInfData.getPdcd()); // 상품코드
					outData.setPrdKorlNm(oMbhActInfData.getPrdKorlNm()); // 상품한글명
					outData.setPrdKorlAbrNm(oMbhActInfData.getPrdKorlAbrNm()); // 상품한글단축명
					outData.setNtrnnActYn(oMbhActInfData.getNtrnnActYn()); // 무거래계좌여부
					outData.setWdrActYn(oMbhActInfData.getWdrActYn()); // 출금계좌여부
					outData.setWdrActUnitRcvDgnYn(oMbhActInfData.getWdrActUnitRcvDgnYn()); // 출금계좌단위입금지정여부
					outData.setPwnoErrTcn(oMbhActInfData.getPwnoErrTcn()); // 비밀번호오류횟수
					outData.setSynpbPdcd(oMbhActInfData.getSynpbPdcd()); // 종합통장상품코드
					outData.setPayAvlBal(oMbhActInfData.getPayAvlBal()); // 지급가능잔액
					outData.setPbokSplitJnngYn(oMbhActInfData.getPbokSplitJnngYn()); // 통장쪼개기가입여부
					outData.setPbokSplitSpceCn(oMbhActInfData.getPbokSplitSpceCn()); // 통장쪼개기공간수
					outData.setPbokSplitRgsDt(oMbhActInfData.getPbokSplitRgsDt()); // 통장쪼개기등록일자
					outData.setPbokSplitJnngAvlYn(oMbhActInfData.getPbokSplitJnngAvlYn()); // 통장쪼개기가입가능여부
					outData.setMetPbokJnngYn(oMbhActInfData.getMetPbokJnngYn()); // 모임통장가입여부
					outData.setMetRgsDt(oMbhActInfData.getMetRgsDt()); // 모임등록일자
					outData.setMetMngNo(oMbhActInfData.getMetMngNo()); // 모임관리번호
					outData.setMetPbokJnngAvlYn(oMbhActInfData.getMetPbokJnngAvlYn()); // 모임통장가입가능여부
					
					outDataList.add(outData);
					
				}
			}
			output.setGridCnt(outDataList.size());
			output.setGrid(outDataList);
		} catch(Exception e) {
			logger.error("selectMbhActInf 전문 error :: {}", e);
			
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
				} else {
					errMsgTxt = we.getMessage();
				}
	            
			} else {
				logger.error("Exception {} ", e);
				errMsgTxt = e.getMessage();				
			}
			
			throw new WFApplicationException("FNSE0006", null, new Object[] {"9999", errMsgTxt}); 
		}
		if(logger.isDebugEnabled()) {
			logger.debug("90190263  당타행 요구불계좌 내역조회 COM output  {} ::: ", output);
		}
		 
		return output;
			
	}
	
		
	/**
	 * 모임통장 서비스를 가입하기 위해 약관을 동의 등록 처리하는 서비스
	 * 
	 * @param input 모임.서비스.대표자.정보.등록.컨트롤러.입력.IO
	 * @return 모임.서비스.대표자.정보.등록.컨트롤러.출력.IO
	 * 
	 * 미사용 여부 검토 > 모임통장.기본정보.등록 으로 메소드명 변경
	 */
	@BxmCategory(logicalName="모임통장.기본정보.등록", description="모임통장 서비스를 가입하기 위해 약관을 동의 등록 처리하는 서비스", author="90190263")
	public MPBMetPbokBscMngInsertMetPbokBscInf_ODT insertMetPbokBscInf(MPBMetPbokBscMngInsertMetPbokBscInf_IDT input
	)
	{
		
		/**
		* @BXMType GetBean
		*/
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		sHRIBSMR0005762_COM= WFApplicationContext.getBean(sHRIBSMR0005762_COM, SHRIBSMR0005762_COM.class);
		// WFInterfaceCfg 생성 컴포넌트
		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class);
		mPBMetPbokMbhMng_COM = WFApplicationContext.getBean(mPBMetPbokMbhMng_COM, MPBMetPbokMbhMng_COM.class);
		sHRFNSMbhSession_COM =  WFApplicationContext.getBean(sHRFNSMbhSession_COM, SHRFNSMbhSession_COM.class);
		shrCECBypsPrvnUtil_COM = WFApplicationContext.getBean(shrCECBypsPrvnUtil_COM, SHRCECBypsPrvnUtil_COM.class);
		sHRAllActInqTbk_COM= WFApplicationContext.getBean(sHRAllActInqTbk_COM, SHRAllActInqTbk_COM.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokBscMngInsertMetPbokBscInf_ODT output= new MPBMetPbokBscMngInsertMetPbokBscInf_ODT();

		/*
		 * 로직 추가
		 */
		//세션고객정보
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession(); 
		if(logger.isDebugEnabled()) {
			logger.debug("currentCust ====== {} ::: ", currentCust);
		} 
		
		if(logger.isDebugEnabled()) {
			logger.debug("90190263 모임통장.기본정보.등록 SVC input  {} ::: ", input);
		}

			
		/**
		 * 연계시스템 호출
		 * TYPE : MCA
		 * ID : IBSMR0005762
		 * NM 뉴WON뱅킹의 모임통장의 서비스 등록 전문을 수신하여 처리한다.
		 */
		if(logger.isDebugEnabled()) {
				logger.debug("90190263 모임통장.서비스등록 COM input  {} ::: ", input);
		}
		// 로그인 체크
		if (!shrCMMLoginSession_COM.istLogin()) {
			//  로그인 세션이 존재하지 않습니다.
			throw new WFApplicationException("CMME0018");
		} else {
			/**
			 * @BXMType IF
			 * @Desc 입력 검증 : 필수 입력 값 검증 코드를 작성 하십시오.
			 */
			if ( input.getMetPbokDscd()== null ) /**null check - 모임통장구분코드*/{
				/** 안내 - 필수입력항목 누락입니다. [{0}] 값을 입력해주시기 바랍니다. */
				throw new WFApplicationException("FNSE0005", null, new Object[]{input.getMetPbokDscd()});
			}
			else if ( input.getMetNm()== null ) /**null check - 모임명*/{
				throw new WFApplicationException("FNSE0005", null, new Object[]{input.getMetNm()});
			}
			else if ( input.getDpsInpAcno()== null ) /**null check - 수신입력계좌번호*/{
				throw new WFApplicationException("FNSE0005", null, new Object[]{input.getDpsInpAcno()});
			}
			else if ( input.getMetDscd()== null ) /**null check - 모임구분코드*/{
				throw new WFApplicationException("FNSE0005", null, new Object[]{input.getMetDscd()});
			}
			else if ( input.getAncSndDscd()== null ) /**null check - 공지발송구분코드*/{
				throw new WFApplicationException("FNSE0005", null, new Object[]{input.getAncSndDscd()});
			}
			else if ( input.getMetBscImgUrlNm()== null ) /**null check - 모임기본이미지URL명*/{
				throw new WFApplicationException("FNSE0005", null, new Object[]{input.getMetBscImgUrlNm()});
			}
			else if ( input.getMetMbhImgUrlNm()== null ) /**null check - 모임회원이미지URL명*/{
				throw new WFApplicationException("FNSE0005", null, new Object[]{input.getMetMbhImgUrlNm()});
			}
			
			String errMsgTxt = "";
			String errMsgId = "";
			
			/**
			 * @BXMType Try
			 * 
			 */
			try{
				//  MCA WFInterfaceCfg 객체 획득
				WFInterfaceCfg interfaceCfg  = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg();
				interfaceCfg.setInterfaceId("IBSMR0005762");
				
				String today = StringUtils.isEmpty(input.getAgmdCollDt()) ? WFDateUtils.getDateNow() : input.getAgmdCollDt();
				
				IBSMR0005762_IDT iIBSMR0005762 = new IBSMR0005762_IDT();
				iIBSMR0005762.setMetPbokDscd(input.getMetPbokDscd()); // 모임통장구분코드
				iIBSMR0005762.setMetNm(input.getMetNm()); // 모임명
				iIBSMR0005762.setDpsInpAcno(input.getDpsInpAcno()); // 수신입력계좌번호
				iIBSMR0005762.setAdvpeEno(input.getAdvpeEno()); // 권유자직원번호
				iIBSMR0005762.setMetDscd(input.getMetDscd()); // 모임구분코드
				iIBSMR0005762.setMetMbhAlsNm(currentCust.getUsnm()); // 모임회원별칭명
				iIBSMR0005762.setAncSndDscd(input.getAncSndDscd()); // 공지발송구분코드
				iIBSMR0005762.setAgmdCollDt(today); // 동의서징구일자
				iIBSMR0005762.setMetBscImgUrlNm(input.getMetBscImgUrlNm()); // 모임기본이미지URL명
				iIBSMR0005762.setMetMbhImgUrlNm(input.getMetMbhImgUrlNm()); // 모임회원이미지URL명
				
				IBSMR0005762_ODT oIBSMR0005762= new IBSMR0005762_ODT();
				
				WFInfResponse<IBSMR0005762_ODT> mcaOutput = sHRIBSMR0005762_COM.callTrx(iIBSMR0005762, interfaceCfg);
				
				oIBSMR0005762 = mcaOutput.getResponseData();
				
				if(logger.isDebugEnabled()) {
					logger.debug("90190263 모임통장.서비스등록 SVC oIBSMR0005762  {} ::: ", oIBSMR0005762);
				}
				
				output.setMetMngNo(oIBSMR0005762.getMetMngNo()); // 모임관리번호
				output.setMetNm(oIBSMR0005762.getMetNm()); // 모임명
				output.setDpsInpAcno(oIBSMR0005762.getDpsInpAcno()); // 수신입력계좌번호
				output.setRlfAcno(oIBSMR0005762.getRlfAcno()); // 안심계좌번호
				output.setMetPbokDscd(oIBSMR0005762.getMetPbokDscd()); // 모임통장구분코드
				output.setMetPbokDscdNm(oIBSMR0005762.getMetDscdNm()); //모임통장구분코드명
				output.setMetMbhAlsNm(oIBSMR0005762.getMetMbhAlsNm()); // 모임회원별칭명
				output.setMetMbhNm(oIBSMR0005762.getMetMbhNm()); // 모임회원명
				output.setMetMbhSrno(oIBSMR0005762.getMetMbhSrno()); // 모임회원일련번호
				output.setAncSndDscd(oIBSMR0005762.getAncSndDscd()); // 공지발송구분코드
				output.setAncSndDscdNm(oIBSMR0005762.getAncSndDscdNm()); // 공지발송구분코드명
				output.setAgmdCollDt(oIBSMR0005762.getAgmdCollDt()); // 동의서징구일자
				output.setMetDscd(oIBSMR0005762.getMetDscd()); // 모임구분코드
				output.setMetDscdNm(oIBSMR0005762.getMetDscdNm()); // 모임구분코드명
				output.setMetRgsDt(oIBSMR0005762.getMetRgsDt()); // 모임등록일자
				output.setRgsTm(oIBSMR0005762.getRgsTm()); // 등록시각
				output.setDpacNo(oIBSMR0005762.getDpacNo()); // 수신계좌번호
				output.setMetBscImgUrlNm(oIBSMR0005762.getMetBscImgUrlNm()); //모임기본이미지URL명
				
				if(logger.isDebugEnabled()) {
					logger.debug("90190263 모임통장.서비스등록 SVC output  {} ::: ", output);
				}
				
				
				if(logger.isDebugEnabled()) {
					logger.debug("90190263 모임통장.대기.회원.정보.등록 SVC input  {} ::: ", input);
				}
				/*
				 * 로직 추가
				 */
				//MetPbokMbhWaitInfRgs_DODT oMetPbokMbhWaitInfRgs = new MetPbokMbhWaitInfRgs();	
				MET_PBOK_MBH_CRTF_MNG_LDG001InsertMetPbokWaitMbhInf_DIDT iMetPbokMbhWaitInfRgs = new MET_PBOK_MBH_CRTF_MNG_LDG001InsertMetPbokWaitMbhInf_DIDT();
				iMetPbokMbhWaitInfRgs.setMetMngNo(oIBSMR0005762.getMetMngNo()); // 모임관리번호
				iMetPbokMbhWaitInfRgs.setItcsno(currentCust.getItcsno()); // 통합고객번호
				iMetPbokMbhWaitInfRgs.setEsnsMbhNo(currentCust.getEsnsMbhNo()); //간편회원번호
				iMetPbokMbhWaitInfRgs.setUtzpeNoCfcd("1"); //이용자번호분류코드 [1]전자뱅킹이용자번호 (모임장은 전자뱅킹이용자만 가능하다.)
				iMetPbokMbhWaitInfRgs.setMetMbhSrno(oIBSMR0005762.getMetMbhSrno()); // 모임회원일련번호
				iMetPbokMbhWaitInfRgs.setMetMbhNm(oIBSMR0005762.getMetMbhNm()); // 모임회원명
				iMetPbokMbhWaitInfRgs.setMetMbhStcd("2"); // 모임회원상태코드 [2] 승인
				iMetPbokMbhWaitInfRgs.setMetMbhDscd("1"); // 모임회원구분코드 [1] 모임장
				iMetPbokMbhWaitInfRgs.setLstDbChgId(""); // 최종DB변경ID 
				iMetPbokMbhWaitInfRgs.setLstDbChgDtm( WFDateUtils.getDateTimeNow()); // 최종DB변경일시
				/*
				 * @BXMType ComponentCall
				 * 모임통장.회원.관리.컴포넌트 모임통장.대기.회원.정보.등록
				 */
				// com.skbank.sml.fns.mpb.com.MPBMetPbokMbhMng_COM
				int insertWaitMbhCnt = mPBMetPbokMbhMng_COM.insertMetPbokWaitMbhInf(iMetPbokMbhWaitInfRgs);
				
				if(logger.isDebugEnabled()) {
					logger.debug("90190263 모임통장.대기정보.등록 SVC insertWaitMbhCnt  {} ::: ", insertWaitMbhCnt );
				}
				

				// 모임통장 회원정보 세션 셋팅
				FNS_MBH_INFO fnsMbhInfo = new FNS_MBH_INFO();
				fnsMbhInfo.setMetJnngYn("Y");
				sHRFNSMbhSession_COM.setFNSMbhInfoSession(fnsMbhInfo);
				

				// 계좌리스트 재조회
				sHRAllActInqTbk_COM.selectSessActList(SHRBSCInquiryConstant.BSC_ACT_LIST_INQ_DIS_ALL, true);
			}catch(Exception e){
				logger.error("insertMetPbokBscInf Exception ::: {}", e);
				
				if ( e instanceof SFAdaptorApplicationException ) {
					SFAdaptorApplicationException se = (SFAdaptorApplicationException) e;
					logger.error("SFAdaptorApplicationException {} ", se);
					
					Object[] args = se.getArguments();
		            
		            if(args != null && args.length>0) {
		            	errMsgTxt = args[0].toString();
					}
		            errMsgId = se.getCode();
		            
				} else if ( e instanceof SFInterfaceSystemException ) {
					SFInterfaceSystemException se = (SFInterfaceSystemException) e;
					logger.error("SFInterfaceSystemException {} ", se);
					errMsgTxt = se.getMainMsgTxt();
					errMsgId = se.getMsgId();
				} else if ( e instanceof WFApplicationException) {
					WFApplicationException we = (WFApplicationException) e;
					logger.error("WFApplicationException {} ", we);
					
					Object[] args = we.getArguments();
		            
					if(args != null && args.length>0) {
		            	errMsgTxt = args[0].toString();
					} else {
						errMsgTxt = we.getMessage();
					}
					
					errMsgId = we.getCode();
				} else {
					logger.error("Exception {} ", e);
					errMsgTxt = e.getMessage();
					errMsgId = "9999";
				}
				
				throw new WFApplicationException("FNSE0006", null, new Object[] {errMsgId, errMsgTxt}); 
			}
		}
		return output;
			
	}

	/**
	 * 모임통장의 기본정보를 조회하는 서비스
	 * 
	 * 
	 * @param input 모임통장.기본.정보.조회.컨트롤러.입력.IO
	 * @return 모임통장.기본.정보.조회.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName="모임통장.기본정보.조회", description="모임통장의 기본정보를 조회하는 서비스\r\n", author="90190263")
	public MPBMetPbokBscMngSelectMetPbokBscInf_ODT selectMetPbokBscInf(MPBMetPbokBscMngSelectMetPbokBscInf_IDT input
	)
	{
		/**
		* @BXMType GetBean
		*/
		mPBMetPbokBscMng_COM = WFApplicationContext.getBean(mPBMetPbokBscMng_COM, MPBMetPbokBscMng_COM.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokBscMngSelectMetPbokBscInf_ODT output= new MPBMetPbokBscMngSelectMetPbokBscInf_ODT();
		
		/**
		 * @BXMType IF
		 * @Desc 입력 검증 : 필수 입력 값 검증 코드를 작성 하십시오.
		 */
		if ( input.getInqDis()== null ) /**null check - 조회구분*/{
			throw new WFApplicationException("FNSE0005", null, new Object[]{input.getInqDis()});
		}
		
		if(logger.isDebugEnabled()) {
			logger.debug("90190263 모임통장.기본정보.조회 SVC input {} ::: ", input);
		}
		
		String errMsgTxt = "";
		String errMsgId = "";
		try { 
			MetPbokBscInfInq_DIDT iMetPbokBsc = new MetPbokBscInfInq_DIDT();
			iMetPbokBsc.setInqDis(input.getInqDis()); // 조회구분
			iMetPbokBsc.setMetMngNo(input.getMetMngNo()); // 모임관리번호
			iMetPbokBsc.setNxtMetMngNo(input.getNxtMetMngNo()); // 다음모임관리번호
	        
	        if(logger.isDebugEnabled()) {
				logger.debug("90190263 모임통장.기본정보.조회 SVC iMetPbokBsc {} ::: ", iMetPbokBsc);
			}
	        
	        MetPbokBscInfInq_DODT oMetPbokBsc= mPBMetPbokBscMng_COM.selectMetPbokBscInf(iMetPbokBsc);
	         
			/**
			 * @BXMType IF
			 * 정상 조회 처리여부
			 */
	        output.setMetOrgJnngYn(oMetPbokBsc.getMetOrgJnngYn()); // 모임원가입여부
	        output.setMetMbhJnngCnt(oMetPbokBsc.getMetMbhJnngCnt()); // 모임회원가입건수
	        output.setMetmbDlyWdrLmtAvlAm(oMetPbokBsc.getMetmbDlyWdrLmtAvlAm());
	        output.setNxtMetMngNo(oMetPbokBsc.getNxtMetMngNo()); //다음모임관리번호
			output.setGridCnt(oMetPbokBsc.getGridCnt()); // 그리드건수
			// 모임통장.기본.정보.조회.DBM. 출력.IO
			List<MPBMetPbokBscInfGridInq> outDataList = new ArrayList<>();
			
			for( MetPbokBscInfGrid oMetPbokBscData : oMetPbokBsc.getGrid()) {
				MPBMetPbokBscInfGridInq outData = new MPBMetPbokBscInfGridInq();

				outData.setMetMngNo(oMetPbokBscData.getMetMngNo()); // 모임관리번호
				outData.setEbnkUtzpeNo(oMetPbokBscData.getEbnkUtzpeNo()); // 전자뱅킹이용자번호
				outData.setMetCtrStcd(oMetPbokBscData.getMetCtrStcd()); // 모임계약상태코드
				outData.setMetCtrStcdNm(oMetPbokBscData.getMetCtrStcdNm()); // 모임계약상태코드명
				outData.setMetPbokDscd(oMetPbokBscData.getMetPbokDscd()); // 모임통장구분코드
				outData.setMetPbokDscdNm(oMetPbokBscData.getMetPbokDscdNm()); // 모임통장구분코드명
				outData.setMetNm(oMetPbokBscData.getMetNm()); // 모임명
				outData.setRcvBkwAcno(oMetPbokBscData.getRcvBkwAcno()); // 입금전행계좌번호
				outData.setCusUsgBkwAcno(oMetPbokBscData.getCusUsgBkwAcno()); // 고객사용전행계좌번호
				outData.setItcsno(oMetPbokBscData.getItcsno()); // 통합고객번호
				outData.setCusKorlNm(oMetPbokBscData.getCusKorlNm()); // 고객한글명
				outData.setCusBkpnNm(oMetPbokBscData.getCusBkpnNm()); // 고객부기명
				outData.setCtBal(oMetPbokBscData.getCtBal()); // 현재잔액
				outData.setPayAvlBal(oMetPbokBscData.getPayAvlBal()); // 지급가능잔액
				outData.setPdcd(oMetPbokBscData.getPdcd()); // 상품코드
				outData.setPdcdKorlNm(oMetPbokBscData.getPdcdKorlNm()); // 상품코드한글명
				outData.setPrdKorlAbrNm(oMetPbokBscData.getPrdKorlAbrNm()); // 상품한글단축명
				outData.setRlfAcno(oMetPbokBscData.getRlfAcno()); // 안심계좌번호
				outData.setMbpfPymDt(oMetPbokBscData.getMbpfPymDt()); // 회비납부일자
				outData.setMbpfPymCycd(oMetPbokBscData.getMbpfPymCycd()); // 회비납부주기코드
				outData.setMbpfPymCycdNm(oMetPbokBscData.getMbpfPymCycdNm()); // 회비납부주기코드명
				outData.setMbpfPmtgtAm(oMetPbokBscData.getMbpfPmtgtAm()); // 회비납부대상금액
				outData.setAgmdCollDt(oMetPbokBscData.getAgmdCollDt()); // 동의서징구일자
				outData.setAdvpeEno(oMetPbokBscData.getAdvpeEno()); // 권유자직원번호
				outData.setAsmnlApvCd(oMetPbokBscData.getAsmnlApvCd()); // 공동명의승인코드
				outData.setAsmnlApvCdNm(oMetPbokBscData.getAsmnlApvCdNm()); // 공동명의승인코드명
				outData.setRppeChgRgsYn(oMetPbokBscData.getRppeChgRgsYn()); // 대표자변경등록여부
				outData.setRppeChgRgsDt(oMetPbokBscData.getRppeChgRgsDt()); // 대표자변경등록일자
				outData.setRppeChgVldDt(oMetPbokBscData.getRppeChgVldDt()); // 대표자변경유효일자
				outData.setMetDscd(oMetPbokBscData.getMetDscd()); // 모임구분코드
				outData.setMetDscdNm(oMetPbokBscData.getMetDscdNm()); // 모임구분코드명
				outData.setMetRgsDt(oMetPbokBscData.getMetRgsDt()); // 모임등록일자
				outData.setRgsTm(oMetPbokBscData.getRgsTm()); // 등록시각
				outData.setMetBscImgUrlNm(oMetPbokBscData.getMetBscImgUrlNm()); // 모임기본이미지URL명
				outData.setMetMbhSrno(oMetPbokBscData.getMetMbhSrno()); // 모임회원일련번호
				outData.setMetMbhAlsNm(oMetPbokBscData.getMetMbhAlsNm()); // 모임회원별칭명
				outData.setMetMbhNm(oMetPbokBscData.getMetMbhNm()); // 모임회원명
				outData.setMetMbhDscd(oMetPbokBscData.getMetMbhDscd()); // 모임회원구분코드
				outData.setMetMbhDscdNm(oMetPbokBscData.getMetMbhDscdNm()); // 모임회원구분코드명
				outData.setMetMbhImgUrlNm(oMetPbokBscData.getMetMbhImgUrlNm()); // 모임회원이미지URL명
				outData.setMetMbhRgsCnt(oMetPbokBscData.getMetMbhRgsCnt()); // 모임회원등록건수
				outData.setMetMbhScssCnt(oMetPbokBscData.getMetMbhScssCnt()); // 모임회원탈퇴건수
				outData.setMetRprsAlsNm(oMetPbokBscData.getMetRprsAlsNm()); // 모임대표별칭명
				outData.setMetRprsMbhNm(oMetPbokBscData.getMetRprsMbhNm()); // 모임대표회원명
				outData.setMetRprsImgUrlNm(oMetPbokBscData.getMetRprsImgUrlNm()); // 모임대표이미지URL명
				
				outDataList.add(outData);
			}
			
			output.setGrid(outDataList);
		} catch(Exception e){
			logger.error("selectMetPbokBscInf 전문 error :: {}", e);
			
			if ( e instanceof WFApplicationException) {
				WFApplicationException we = (WFApplicationException) e;
				logger.error("WFApplicationException {} ", we);
				
				Object[] args = we.getArguments();
	            
				if(args != null && args.length>0) {
	            	errMsgTxt = args[0].toString();
	            	errMsgId =  args[1].toString();
				} else {
					errMsgTxt = we.getMessage();
					errMsgId = we.getCode();
				}
			} else {
				logger.error("Exception {} ", e);
				errMsgTxt = e.getMessage();
				errMsgId = "9999";
			}
			
			throw new WFApplicationException("FNSE0006", null, new Object[] {errMsgId, errMsgTxt}); 
		}

		if(logger.isDebugEnabled()) {
			logger.debug("90190263 모임통장.기본정보.조회 SVC output  {} ::: ", output);
		}

		return output;
	}
	
	/**
	 * 모임통장의 기본정보를 계좌번호로 조회하는 서비스
	 * 
	 * 
	 * @param input 모임통장.기본.정보.조회.컨트롤러.입력.IO
	 * @return 모임통장.기본.정보.조회.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName="모임통장.기본정보.계좌번호.조회", description="모임통장의 기본정보를 계좌번호로 조회하는 서비스\r\n", author="90190263")
	public MPBMetPbokBscMngSelectMetPbokBscInfAcno_ODT selectMetPbokBscInfAcno(MPBMetPbokBscMngSelectMetPbokBscInfAcno_IDT input
	)
	{
		/**
		* @BXMType GetBean
		*/
		mPBMetPbokBscMng_COM = WFApplicationContext.getBean(mPBMetPbokBscMng_COM, MPBMetPbokBscMng_COM.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokBscMngSelectMetPbokBscInfAcno_ODT output= new MPBMetPbokBscMngSelectMetPbokBscInfAcno_ODT();
		
		/**
		 * @BXMType IF
		 * @Desc 입력 검증 : 필수 입력 값 검증 코드를 작성 하십시오.
		 */
		 if ( input.getAcno()== null ) /**null check - 계좌번호*/{
			throw new WFApplicationException("FNSE0005", null, new Object[]{input.getAcno()});
		}
		
		if(logger.isDebugEnabled()) {
			logger.debug("90190263 모임통장.기본정보.계좌번호.조회 SVC input {} ::: ", input);
		}
		
		String errMsgTxt ="";
		String errMsgId = "";
		
		try { 
			String sNxtMetMngNo = "";
			MPBMetPbokBscInfGridInq filterMetPbokBscData =  new MPBMetPbokBscInfGridInq();
			
			while(true) {
				MPBMetPbokBscMngSelectMetPbokBscInf_IDT iMetPbokBscInfAcno = new MPBMetPbokBscMngSelectMetPbokBscInf_IDT();
				iMetPbokBscInfAcno.setInqDis("01"); // 조회구분 [01]세션기준으로 조회
				iMetPbokBscInfAcno.setMetMngNo(""); // 모임관리번호
				iMetPbokBscInfAcno.setNxtMetMngNo(sNxtMetMngNo); // 다음모임관리번호
				
				if(logger.isDebugEnabled()) {
					logger.debug("90190263 모임기본정보 계좌번호 조회 SVC iMetPbokBscInfAcno {} ::: ", iMetPbokBscInfAcno);
				}
				
				MPBMetPbokBscMngSelectMetPbokBscInf_ODT oMetPbokBscInfAcno= this.selectMetPbokBscInf(iMetPbokBscInfAcno);
				
				filterMetPbokBscData = new MPBMetPbokBscInfGridInq();
				
				// 안심계좌번호는 11자리 아닐 경우 실계좌번호
				if(input.getAcno().length() != 11) {
					filterMetPbokBscData = oMetPbokBscInfAcno.getGrid().stream()
																							.filter( item -> input.getAcno().equals( item.getRcvBkwAcno()) )
																							.findFirst().orElse(filterMetPbokBscData);
				} else {
					filterMetPbokBscData = oMetPbokBscInfAcno.getGrid().stream()
																							.filter( item -> input.getAcno().equals( item.getRlfAcno()) )
																							.findFirst().orElse(filterMetPbokBscData);
				}

				if(logger.isDebugEnabled()) {
					logger.debug("90190263 모임기본정보 계좌번호 조회 SVC  모임기본정보 계좌번호 필터 조회 filterMetPbokBscData  {} ::: ", filterMetPbokBscData);
				}
																						
				if(!StringUtils.isEmpty(filterMetPbokBscData.getMetMngNo())) {
					output.setMetMngNo(filterMetPbokBscData.getMetMngNo()); // 모임관리번호
					output.setMetPbokDscd(filterMetPbokBscData.getMetPbokDscd()); // 모임통장구분코드
					output.setMetPbokDscdNm(filterMetPbokBscData.getMetPbokDscdNm()); // 모임통장구분코드명
					output.setMetMbhSrno(filterMetPbokBscData.getMetMbhSrno()); // 모임회원일련번호
					output.setMetMbhAlsNm(filterMetPbokBscData.getMetMbhAlsNm()); // 모임회원별칭명
					output.setMetMbhDscd(filterMetPbokBscData.getMetMbhDscd()); // 모임회원구분코드
					output.setMetMbhDscdNm(filterMetPbokBscData.getMetMbhDscdNm()); // 모임회원구분코드명
					
					break;
				} else {
					if(StringUtils.isNotEmpty(oMetPbokBscInfAcno.getNxtMetMngNo())) {
						sNxtMetMngNo = oMetPbokBscInfAcno.getNxtMetMngNo();
					} else {
						break;
					}
				}
			}
		}catch(Exception e){
			logger.error("selectMetPbokBscInfAcno 전문 error :: {}", e);
			
			if ( e instanceof WFApplicationException) {
				WFApplicationException we = (WFApplicationException) e;
				logger.error("WFApplicationException {} ", we);
				
				Object[] args = we.getArguments();
	            
				if(args != null && args.length>0) {
	            	errMsgTxt = args[0].toString();
	            	errMsgId =  args[1].toString();
				} else {
					errMsgTxt = we.getMessage();
					errMsgId = we.getCode();
				}
			} else {
				logger.error("Exception {} ", e);
				errMsgTxt = e.getMessage();
				errMsgId = "9999";
			}
			
			throw new WFApplicationException("FNSE0006", null, new Object[] {errMsgId, errMsgTxt}); 
		}
		
		if(logger.isDebugEnabled()) {
			logger.debug("90190263모임기본정보 계좌번호 조회 SVC output  {} ::: ", output);
		}

		return output;
	}
	
	/**
	 * 모임통장의 메인화면 으로 모임통장에 필요한 데이터를 한눈에 볼 수 있도록 데이터를 조회 하는 서비스
	 * 
	 * @param input 모임통장.관리.메인.정보.조회.컨트롤러.입력.IO
	 * @return 모임통장.관리.메인.정보.조회.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName="모임통장.메인.정보.조회", description="모임통장의 메인화면 으로 모임통장에 필요한 데이터를 한눈에 볼 수 있도록 데이터를 조회 하는 서비스", author="90190263")
	public MPBMetPbokBscMngSelectMetPbokMainInf_ODT selectMetPbokMainInf(MPBMetPbokBscMngSelectMetPbokMainInf_IDT input
	)
	{
			
		/**
		* @BXMType GetBean
		*/
		mPBMetPbokBscMng_COM= WFApplicationContext.getBean(mPBMetPbokBscMng_COM, MPBMetPbokBscMng_COM.class);
		mPBMetPbokMbhMng_COM= WFApplicationContext.getBean(mPBMetPbokMbhMng_COM, MPBMetPbokMbhMng_COM.class);
		mPBMetPbokFncTrnMng_COM= WFApplicationContext.getBean(mPBMetPbokFncTrnMng_COM, MPBMetPbokFncTrnMng_COM.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokBscMngSelectMetPbokMainInf_ODT output= new MPBMetPbokBscMngSelectMetPbokMainInf_ODT();

		if(logger.isDebugEnabled()) {
			logger.debug("90190263 모임통장.메인.정보.조회 SVC input  {} ::: ", input);
		}
		
		String errMsgTxt = "";
		String errMsgId = "";
		
		try {
			
			/**
			 * @BXMType IF
			 * @Desc 입력 검증 : 필수 입력 값 검증 코드를 작성 하십시오.
			 */
			if ( input.getMetMngNo()== null ) /**null check - 모임관리번호*/{
				throw new WFApplicationException("FNSE0005", null, new Object[]{input.getMetMngNo()});
			}
			else if ( input.getTrnPrtsInqStaDt()== null ) /**null check - 거래내역조회시작일자*/{
				throw new WFApplicationException("FNSE0005", null, new Object[]{input.getTrnPrtsInqStaDt()});
			}
			else if ( input.getTrnPrtsInqEndDt()== null ) /**null check - 거래내역조회종료일자*/{
				throw new WFApplicationException("FNSE0005", null, new Object[]{input.getTrnPrtsInqEndDt()});
			}
			
			/*
			 * @BXMType ServiceCall
			 * 모임통장.일반.관리.서비스 모임통장.기본정보.조회
			 */
			// com.skbank.sml.fns.mpb.svc.MPBMetPbokBscMng_SVC
			MPBMetPbokBscMngSelectMetPbokBscInf_IDT iMetPbokBsc = new MPBMetPbokBscMngSelectMetPbokBscInf_IDT();
			iMetPbokBsc.setInqDis("02"); // 조회구분 [02]모임관리번호 조회
			iMetPbokBsc.setMetMngNo(input.getMetMngNo()); // 모임관리번호
			iMetPbokBsc.setNxtMetMngNo(""); // 다음모임관리번호
			
			MPBMetPbokBscMngSelectMetPbokBscInf_ODT oMetPbokBsc= this.selectMetPbokBscInf(iMetPbokBsc);
			
			if(logger.isDebugEnabled()) {
				logger.debug("90190263 모임통장.메인.정보.조회 SVC oMetPbokBsc  {} ::: ", oMetPbokBsc);
			}
			
			// 모임통장.기본.정보.조회.DBM. 출력.IO
			for( MPBMetPbokBscInfGridInq oMetPbokBscData : oMetPbokBsc.getGrid()) {	
				MetPbokImgInfInq_DODT pbokImgInfData = new MetPbokImgInfInq_DODT();
				
				// 모임통장 배경 이미지를 변경했을 경우 해당 NAS서버 경로에 이미지가 업로드 되어 있음
				if(oMetPbokBscData.getMetBscImgUrlNm().indexOf("moim") !=-1 ) {
					// 모임통장 이미지 정보 조회
					pbokImgInfData  = mPBMetPbokBscMng_COM.selectMetPbokImgInf(oMetPbokBscData.getMetBscImgUrlNm());
				}
				
				output.setMetMngNo(oMetPbokBscData.getMetMngNo()); // 모임관리번호
				output.setEbnkUtzpeNo(oMetPbokBscData.getEbnkUtzpeNo()); // 전자뱅킹이용자번호
				output.setMetCtrStcd(oMetPbokBscData.getMetCtrStcd()); // 모임계약상태코드
				output.setMetCtrStcdNm(oMetPbokBscData.getMetCtrStcdNm()); // 모임계약상태코드명
				output.setMetPbokDscd(oMetPbokBscData.getMetPbokDscd()); // 모임통장구분코드
				output.setMetPbokDscdNm(oMetPbokBscData.getMetPbokDscdNm()); // 모임통장구분코드명
				output.setMetNm(oMetPbokBscData.getMetNm()); // 모임명
				output.setRcvBkwAcno(oMetPbokBscData.getRcvBkwAcno()); // 입금전행계좌번호
				output.setEncyRcvBkwAcno(WFCryptEtcUtils.encryptBase64("IBS_0003", oMetPbokBscData.getRcvBkwAcno())); // 암호화입금전행계좌번호
				output.setCusUsgBkwAcno(oMetPbokBscData.getCusUsgBkwAcno()); // 고객사용전행계좌번호
				output.setItcsno(oMetPbokBscData.getItcsno()); // 통합고객번호
				output.setCusKorlNm(oMetPbokBscData.getCusKorlNm()); // 고객한글명
				output.setCusBkpnNm(oMetPbokBscData.getCusBkpnNm()); // 고객부기명
				output.setCtBal(oMetPbokBscData.getCtBal()); // 현재잔액
				output.setPayAvlBal(oMetPbokBscData.getPayAvlBal()); // 지급가능잔액
				output.setPdcd(oMetPbokBscData.getPdcd()); // 상품코드
				output.setPdcdKorlNm(oMetPbokBscData.getPdcdKorlNm()); // 상품코드한글명
				output.setPrdKorlAbrNm(oMetPbokBscData.getPrdKorlAbrNm()); // 상품한글단축명
				output.setRlfAcno(oMetPbokBscData.getRlfAcno()); // 안심계좌번호
				output.setMbpfPymDt(oMetPbokBscData.getMbpfPymDt()); // 회비납부일자
				output.setMbpfPymCycd(oMetPbokBscData.getMbpfPymCycd()); // 회비납부주기코드
				output.setMbpfPymCycdNm(oMetPbokBscData.getMbpfPymCycdNm()); // 회비납부주기코드명
				output.setMbpfPmtgtAm(oMetPbokBscData.getMbpfPmtgtAm()); // 회비납부대상금액
				output.setAgmdCollDt(oMetPbokBscData.getAgmdCollDt()); // 동의서징구일자
				output.setAdvpeEno(oMetPbokBscData.getAdvpeEno()); // 권유자직원번호
				output.setAsmnlApvCd(oMetPbokBscData.getAsmnlApvCd()); // 공동명의승인코드
				output.setAsmnlApvCdNm(oMetPbokBscData.getAsmnlApvCdNm()); // 공동명의승인코드명
				output.setRppeChgRgsYn(oMetPbokBscData.getRppeChgRgsYn()); // 대표자변경등록여부
				output.setRppeChgRgsDt(oMetPbokBscData.getRppeChgRgsDt()); // 대표자변경등록일자
				output.setRppeChgVldDt(oMetPbokBscData.getRppeChgVldDt()); // 대표자변경유효일자
				output.setMetDscd(oMetPbokBscData.getMetDscd()); // 모임구분코드
				output.setMetDscdNm(oMetPbokBscData.getMetDscdNm()); // 모임구분코드명
				output.setMetRgsDt(oMetPbokBscData.getMetRgsDt()); // 모임등록일자
				output.setRgsTm(oMetPbokBscData.getRgsTm()); // 등록시각
				output.setMetBscImgUrlNm(oMetPbokBscData.getMetBscImgUrlNm()); // 모임기본이미지URL명
				output.setMetBscImgFileData(pbokImgInfData.getFileData()); // 모임기본이미지Data
				output.setMetMbhSrno(oMetPbokBscData.getMetMbhSrno()); // 모임회원일련번호
				output.setMetMbhAlsNm(oMetPbokBscData.getMetMbhAlsNm()); // 모임회원별칭명
				output.setMetMbhNm(oMetPbokBscData.getMetMbhNm()); // 모임회원명
				output.setMetMbhDscd(oMetPbokBscData.getMetMbhDscd()); // 모임회원구분코드
				output.setMetMbhDscdNm(oMetPbokBscData.getMetMbhDscdNm()); // 모임회원구분코드명
				output.setMetMbhImgUrlNm(oMetPbokBscData.getMetMbhImgUrlNm()); // 모임회원이미지URL명
				output.setMetMbhRgsCnt(oMetPbokBscData.getMetMbhRgsCnt()); // 모임회원등록건수
				output.setMetMbhScssCnt(oMetPbokBscData.getMetMbhScssCnt()); // 모임회원탈퇴건수
				output.setMetRprsAlsNm(oMetPbokBscData.getMetRprsAlsNm()); // 모임대표별칭명
				output.setMetRprsMbhNm(oMetPbokBscData.getMetRprsMbhNm()); // 모임대표회원명
				output.setMetRprsImgUrlNm(oMetPbokBscData.getMetRprsImgUrlNm()); // 모임대표이미지URL명
				
				break;
			}
			
			/**********************************************************************
			 * 모임통장구분코드 [1] 일반모임 / [2] 커플모임
			 ***********************************************************************/
			String nxtMbhAlsNm = "";
			int metMbhInqCnt = 0;
			// 모임통장.회원.정보.목록.조회.DBM.출력.IO
			List<MPBMetPbokMbhInfListInq_ODT> outDataMbhList = new ArrayList<>();
			MetPbokMbhInfInq_DODT oMbhInf = new MetPbokMbhInfInq_DODT(); 
			MetPbokMbhInfInq_DIDT iMbhInf = new MetPbokMbhInfInq_DIDT();
			iMbhInf.setInqDis("03"); // 조회구분 [03] 모임관리번호별 회원목록조회
			iMbhInf.setMetMngNo(input.getMetMngNo()); // 모임관리번호
			
			while( true ) {
				iMbhInf.setNxtMetMbhAlsNm(nxtMbhAlsNm);
				
				if(logger.isDebugEnabled()) {
					logger.debug("90190263 모임통장.메인.정보.조회 SVC 일반모임 회원목록 iMbhInf {} ::: ", iMbhInf);
				}
				
				/*
				 * @BXMType ComponentCall
				 * 모임통장.회원.관리.서비스 모임통장.회원.정보.조회
				 */
				// com.skbank.sml.fns.mpb.com.MPBMetPbokMbhMng_COM
				oMbhInf = new MetPbokMbhInfInq_DODT(); 
				oMbhInf = mPBMetPbokMbhMng_COM.selectMetPbokMbhInf( iMbhInf );
				
				if(logger.isDebugEnabled()) {
					logger.debug("90190263 모임통장.메인.정보.조회 SVC 일반모임 회원목록 oMbhInf  {} ::: ", oMbhInf);
				}
				
				for( MetPbokMbhInfListInq_DODT oMbhInfData : oMbhInf.getGrid() ) {
					MPBMetPbokMbhInfListInq_ODT outData = new MPBMetPbokMbhInfListInq_ODT();
					
					MetPbokImgInfInq_DODT mbhImgInfData = new MetPbokImgInfInq_DODT();
					
					if(metMbhInqCnt < 3) {
						// 회원이 프로필 이미지를 변경했을 경우 해당 NAS서버 경로에 이미지가 업로드 되어 있음
						//if(oMbhInfData.getMetMbhImgUrlNm().indexOf("FNS/moim/profile") !=-1 ) {
						if(oMbhInfData.getMetMbhImgUrlNm().indexOf("moim") !=-1 ) {
							// 회원의 이미지 정보 조회
							mbhImgInfData  = mPBMetPbokBscMng_COM.selectMetPbokImgInf(oMbhInfData.getMetMbhImgUrlNm());
						}
					}
					
					outData.setMetMngNo(oMbhInfData.getMetMngNo()); // 모임관리번호
					outData.setMetMbhSrno(oMbhInfData.getMetMbhSrno()); // 모임회원일련번호
					outData.setMetMbhCtrStcd(oMbhInfData.getMetMbhCtrStcd()); // 모임회원계약상태코드
					outData.setMetMbhCtrStcdNm(oMbhInfData.getMetMbhCtrStcdNm()); // 모임회원계약상태코드명
					outData.setMetMbhDscd(oMbhInfData.getMetMbhDscd()); // 모임회원구분코드
					outData.setMetMbhDscdNm(oMbhInfData.getMetMbhDscdNm()); // 모임회원구분코드명
					outData.setUtzpeNoCfcd(oMbhInfData.getUtzpeNoCfcd()); // 이용자번호분류코드
					outData.setUtzpeNoCfcdNm(oMbhInfData.getUtzpeNoCfcdNm()); // 이용자번호분류코드명
					outData.setEbnkUtzpeNo(oMbhInfData.getEbnkUtzpeNo()); // 전자뱅킹이용자번호
					outData.setEsnsMbhNo(oMbhInfData.getEsnsMbhNo()); // 간편회원번호
					outData.setItcsno(oMbhInfData.getItcsno()); // 통합고객번호
					outData.setMetMbhAlsNm(oMbhInfData.getMetMbhAlsNm()); // 모임회원별칭명
					outData.setMetMbhNm(oMbhInfData.getMetMbhNm()); // 모임회원명
					outData.setMbpfPmtgtAm(oMbhInfData.getMbpfPmtgtAm()); // 회비납부대상금액
					outData.setAgmdCollDt(oMbhInfData.getAgmdCollDt()); // 동의서징구일자
					outData.setMetPtcpDt(oMbhInfData.getMetPtcpDt()); // 모임참여일자
					outData.setMetPtcpTm(oMbhInfData.getMetPtcpTm()); // 모임참여시각
					outData.setMetScssDt(oMbhInfData.getMetScssDt()); // 모임탈퇴일자
					outData.setMetScssTm(oMbhInfData.getMetScssTm()); // 모임탈퇴시각
					outData.setAncSndDscd(oMbhInfData.getAncSndDscd()); // 공지발송구분코드
					outData.setAncSndDscdNm(oMbhInfData.getAncSndDscdNm()); // 공지발송구분코드명
					outData.setRppeChgApvCd(oMbhInfData.getRppeChgApvCd()); // 대표자변경승인코드
					outData.setRppeChgApvCdNm(oMbhInfData.getRppeChgApvCdNm()); // 대표자변경승인코드명
					outData.setRppeChgApvDt(oMbhInfData.getRppeChgApvDt()); // 대표자변경승인일자
					outData.setMetMbhImgUrlNm(oMbhInfData.getMetMbhImgUrlNm()); // 모임회원이미지URL명
					outData.setMetMbhImgFileData(mbhImgInfData.getFileData());
					
					outDataMbhList.add(outData);
					metMbhInqCnt++; 
				}
				if(!"Y".equals(output.getRppeChgRgsYn())) {
					break;
				} else {
					if( !"".equals( oMbhInf.getNxtMetMbhAlsNm() )) { // 다음모임회원별칭명이 존재하면 
						nxtMbhAlsNm = oMbhInf.getNxtMetMbhAlsNm();
					} else {
						break;
					}
				}
			}
			output.setMbhGrid(outDataMbhList);
			output.setMbhGridCnt(outDataMbhList.size()); // 그리드건수
			
				
			if( "2".equals(output.getMetPbokDscd())) { //  [2] 커플모임통장
				/**********************************************************************
				 * 커플모임
				 * 생활비 목표 및 전체거래 금액 조회
				 ***********************************************************************/
				MET_PBOK_LIFEC_MNG_LDG001SelectMetPbokLifecMngLdgPkInfo_DIDT iLifecGoal = new MET_PBOK_LIFEC_MNG_LDG001SelectMetPbokLifecMngLdgPkInfo_DIDT();
				iLifecGoal.setMetMngNo(input.getMetMngNo()); // 모임관리번호
				
				if(logger.isDebugEnabled()) {
					logger.debug("90190263 모임통장.메인.정보.조회 SVC 부부모임 생활비설정 iLifecGoal  {} ::: ", iLifecGoal);
				}
				
				/*
				 * @BXMType ComponentCall
				 * 모임통장.금융거래.관리.서비스 부부.모임.생활비.목표.정보.조회
				 */
				// com.skbank.sml.fns.mpb.com.MPBMetPbokFncTrnMng_SVC
				MET_PBOK_LIFEC_MNG_LDG001SelectMetPbokLifecMngLdgPkInfo_DODT oLifecGoal = mPBMetPbokFncTrnMng_COM.selectHswfMetLifecGoalInf(iLifecGoal);
				 
				 if(logger.isDebugEnabled()) {
					logger.debug("90190263 모임통장.메인.정보.조회 SVC 부부모임 생활비설정 oLifecGoal  {} ::: ", oLifecGoal);
				 }
				 
				 if(!ObjectUtils.isEmpty(oLifecGoal)) {
					 /**********************************************************************
					  * 부부모임 이번달 생활비 지출금액 조회
					  ***********************************************************************/
						/*
						 * @BXMType ServiceCall
						 * 모임통장.금융거래.관리.컴포넌트.부부.모임.생활비.지출.현황.조회
						 */
						String currentYM = WFDateUtils.getDateNow().substring(0, 6);
						HswfMetLifecExpdPts_DIDT iLifecExpdPts = new HswfMetLifecExpdPts_DIDT();
						iLifecExpdPts.setMetMngNo(input.getMetMngNo()); // 모임관리번호
						iLifecExpdPts.setInqStaYm(currentYM); // 조회시작일자
						iLifecExpdPts.setInqEndYm(currentYM); // 조회종료일자
						
						if(logger.isDebugEnabled()) {
							logger.debug("90190263 모임통장.메인.정보.조회 SVC 부부.모임.생활비.지출.현황.조회 iLifecExpdPts {} :: ", iLifecExpdPts);
						}
						
						HswfMetLifecExpdPts_DODT oLifecExpdPts = mPBMetPbokFncTrnMng_COM.selectHswfMetLifecExpdPts(iLifecExpdPts); 
						
						if(logger.isDebugEnabled()) {
							logger.debug("90190263 모임통장.메인.정보.조회 SVC 부부.모임.생활비.지출.현황.조회  oLifecExpdPts {} :: ", oLifecExpdPts);
						}
						
						BigDecimal totExpdAm = BigDecimal.ZERO;
						for( HswfMetLifecExpdPtsSub_DODT oTrnPrtsData : oLifecExpdPts.getGrid()) {
							totExpdAm = totExpdAm.add( oTrnPrtsData.getExpdAm() );
						}
						MPBMetPbokFncTrnMngSelectHswfMetLifecGoalInf_ODT outData = new MPBMetPbokFncTrnMngSelectHswfMetLifecGoalInf_ODT();
							
						outData.setMetMngNo(oLifecGoal.getMetMngNo()); // 모임관리번호
						outData.setMetLifecEstYn(oLifecGoal.getMetLifecEstYn()); // 모임생활비설정여부
						outData.setMetLifecAm(oLifecGoal.getMetLifecAm()); // 모임생활비금액
						outData.setMetLifecEstDt(oLifecGoal.getMetLifecEstDt()); // 모임생활비설정일자
						outData.setMetLifecBasDd(oLifecGoal.getMetLifecBasDd()); // 모임생활비기준일			 
						outData.setTotExpdAm(totExpdAm); // 총거래금액
						
						output.setLifecGoalInf(outData);
				 }
				
				 
			}
			/**********************************************************************
			 * 해당 월 회비 입금 현황 정보 조회
			 ***********************************************************************/
			MbpfRcvstsInq_DIDT iMbpfRcvSts = new MbpfRcvstsInq_DIDT();
			String nxtMbpfRcvAlsNm = "";
			BigDecimal tmmMbpfPmtgtAm = BigDecimal.ZERO;
			
			iMbpfRcvSts.setInqDis("07"); // 조회구분 [07] : 회비입금금내역_모임회원별/특정월/회원별칭명순 / [08] : 회비입금금내역_특정회회원/일별 /거래일자 역순차조회
			iMbpfRcvSts.setMetMngNo(input.getMetMngNo()); // 모임관리번호
			iMbpfRcvSts.setInqBasYm(input.getTrnPrtsInqEndDt().substring(0,6)); // 조회기준년월
			iMbpfRcvSts.setNxtMetMbhAlsNm(nxtMbpfRcvAlsNm);
			
			if(logger.isDebugEnabled()) {
				logger.debug("90190263  모임통장.메인.정보.조회 SVC 회비.입금현황 iMbpfRcvSts {} :: ", iMbpfRcvSts);
			}
			
			MbpfRcvstsInq_DODT oMbpfRcvSts = mPBMetPbokFncTrnMng_COM.selectMetPbokMbpfRcvSts(iMbpfRcvSts);
			
			if(logger.isDebugEnabled()) {
				logger.debug("90190263  모임통장.메인.정보.조회 SVC 회비.입금현황 oMbpfRcvSts {} :: ", oMbpfRcvSts);
			}
			
			tmmMbpfPmtgtAm = oMbpfRcvSts.getTotMbpfRcvAm().subtract(oMbpfRcvSts.getTotMbpfXmpAm());
			
			if(logger.isDebugEnabled()) {
				logger.debug("90190263  모임통장.메인.정보.조회 SVC 당월회비납부금액 tmmMbpfPmtgtAm {} :: ", tmmMbpfPmtgtAm);
			}
			
			output.setTmmMbpfPmtgtAm(tmmMbpfPmtgtAm);
			/**********************************************************************
			 * 전체 이체요청 내역 건수 조회
			 ***********************************************************************/
			MET_PBOK_MBPF_TS_REQ_INF001SelectAllTsReqCnt_DIDT iTsReqInf = new MET_PBOK_MBPF_TS_REQ_INF001SelectAllTsReqCnt_DIDT();
			iTsReqInf.setMetMngNo(input.getMetMngNo()); // 모임관리번호
			iTsReqInf.setTsReqDelYn("N"); // 이체요청삭제여부
			
			if(logger.isDebugEnabled()) {
				logger.debug("90190263 모임통장.메인.정보.조회 SVC 전체.이체요청.내역건수iTsReqInf {} :: ", iTsReqInf);
			}
			
			/*
			 * @BXMType ComponentCall
			 * 모임통장.금융거래.관리.컴포넌트 전체.이체요청.내역.정보.조회
			 */
			// com.skbank.sml.fns.mpb.com.MPBMetPbokFncTrnMng_COM
			int tsReqCnt = mPBMetPbokFncTrnMng_COM.selectAllTsReqPrtsCnt(iTsReqInf);
			
			if(logger.isDebugEnabled()) {
				logger.debug("90190263 모임통장.메인.정보.조회 SVC 전체.이체요청.내역건수 tsReqCnt {} :: ", tsReqCnt);
			} 
			
			output.setTsReqCnt(tsReqCnt);
	
		}catch(Exception e){
			logger.error("selectMetPbokMainInf  error :: {}", e);
			
			if ( e instanceof WFApplicationException) {
				WFApplicationException we = (WFApplicationException) e;
				logger.error("WFApplicationException {} ", we);
				
				Object[] args = we.getArguments();
	            
				if(args != null && args.length>0) {
	            	errMsgTxt = args[0].toString();
	            	errMsgId =  args[1].toString();
				} else {
					errMsgTxt = we.getMessage();
					errMsgId = we.getCode();
				}
			} else {
				logger.error("Exception {} ", e);
				errMsgTxt = e.getMessage();
				errMsgId = "9999";
			}
			
			throw new WFApplicationException("FNSE0006", null, new Object[] {errMsgId, errMsgTxt});
			
		}

		if(logger.isDebugEnabled()) {
			logger.debug("90190263 모임통장.메인.정보.조회 SVC output {} :: ", output);
		}
		
			
		return output;
			
	}
		
	/**
	 * 모임통장의 공지사항 정보를 조회하는 서비스
	 * 
	 * @param input 공지사항.정보.조회.컨트롤러.입력.IO
	 * @return 공지사항.정보.조회.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName="공지사항.정보.조회", description="모임통장의 공지사항 정보를 조회하는 서비스", author="90190263")
	public MPBMetPbokBscMngSelectNtarInf_ODT selectNtarInf(MPBMetPbokBscMngSelectNtarInf_IDT input
	)
	{
			
		/**
		* @BXMType GetBean
		*/
		mPBMetPbokBscMng_COM= WFApplicationContext.getBean(mPBMetPbokBscMng_COM, MPBMetPbokBscMng_COM.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokBscMngSelectNtarInf_ODT output= new MPBMetPbokBscMngSelectNtarInf_ODT();
		
		/**
		 * @BXMType IF
		 * @Desc 입력 검증 : 필수 입력 값 검증 코드를 작성 하십시오.
		 */
		if ( input.getMetMngNo()== null ) /**null check - 모임관리번호 */{
			throw new WFApplicationException("FNSE0005", null, new Object[]{input.getMetMngNo()});
		}
		
		/*
		 * 로직 추가
		 */
		if(logger.isDebugEnabled()) {
			logger.debug("90190263 공지사항.정보.조회 SVC input  {} ::: ", input);
		}
		
		MET_PBOK_NTAR_INF001SelectNtarinf_DIDT iNtarInf = new MET_PBOK_NTAR_INF001SelectNtarinf_DIDT();
		iNtarInf.setMetMngNo(input.getMetMngNo()); // 모임관리번호
		
		/*
		 * @BXMType ComponentCall
		 * 모임통장.일반.관리.컴포넌트 공지사항.정보.조회
		 */
		// com.skbank.sml.fns.mpb.com.MPBMetPbokBscMng_COM
		MET_PBOK_NTAR_INF001SelectNtarinf_DODT oNtarInf = mPBMetPbokBscMng_COM.selectNtarinf(iNtarInf);
		
		if(logger.isDebugEnabled()) {
			logger.debug("90190263 공지사항.정보.조회 SVC oNtarInf  {} ::: ", oNtarInf);
		}
		
		/**
		 * @BXMType IF
		 * 공지사항 정보 조회 정상여부
		 */
		if ( oNtarInf != null ) /** 정상일때 데이터목록 리턴*/ {
			output.setMetMngNo(oNtarInf.getMetMngNo()); // 모임관리번호
			output.setMetNtarSrno(oNtarInf.getMetNtarSrno()); //모임공지사항일련번호
			output.setMetNtarTxt(oNtarInf.getMetNtarTxt()); // 모임공지사항내용
			output.setMetNtarHdnYn(oNtarInf.getMetNtarHdnYn()); // 모임공지사항숨김처리여부
			output.setMetNtarDelYn(oNtarInf.getMetNtarDelYn()); // 모임공지사항삭제여부
			output.setMetNtarRgsMbhSrno(oNtarInf.getMetNtarRgsMbhSrno()); // 모임공지사항등록회원일련번호
			output.setMetNtarChgMbhSrno(oNtarInf.getMetNtarChgMbhSrno()); // 모임공지사항변경회원일련번호
			output.setMetNtarRgsDt(oNtarInf.getMetNtarRgsDt()); // 모임공지사항등록일자
			output.setMetNtarRgsTm(oNtarInf.getMetNtarRgsTm()); // 모임공지사항등록시각
			output.setMetNtarChgDt(oNtarInf.getMetNtarChgDt()); // 모임공지사항변경일자
			output.setMetNtarChgTm(oNtarInf.getMetNtarChgTm()); // 모임공지사항변경시각
		} else {
			output.setMetMngNo(input.getMetMngNo());
		}
		return output;
			
	}
		
	/**
	 * 모임통장의 공지사항 정보를 등록하는 컴포넌트
	 * 
	 * @param input 공지사항.정보.등록.컨트롤러.입력.IO
	 * @return 공지사항.정보.등록.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName="공지사항.정보.등록", description="모임통장의 공지사항 정보를 등록하는 컴포넌트", author="90190263")
	public MPBMetPbokBscMngInsertNtarInf_ODT insertNtarInf(MPBMetPbokBscMngInsertNtarInf_IDT input
	)
	{
			
		/**
		* @BXMType GetBean
		*/
		mPBMetPbokBscMng_COM= WFApplicationContext.getBean(mPBMetPbokBscMng_COM, MPBMetPbokBscMng_COM.class);
			
		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokBscMngInsertNtarInf_ODT output = new MPBMetPbokBscMngInsertNtarInf_ODT();
		
		/**
		 * @BXMType IF
		 * @Desc 입력 검증 : 필수 입력 값 검증 코드를 작성 하십시오.
		 */
		if ( input.getMetMngNo()== null ) /**null check - 모임관리번호*/{
			throw new WFApplicationException("FNSE0005", null, new Object[]{input.getMetMngNo()});
		}
		else if ( input.getMetNtarRgsDt()== null ) /**null check - 모임공지사항등록일자*/{
			throw new WFApplicationException("FNSE0005", null, new Object[]{input.getMetNtarRgsDt()});
		}
		else if ( input.getMetNtarTxt()== null ) /**null check - 모임공지사항내용*/{
			throw new WFApplicationException("FNSE0005", null, new Object[]{input.getMetNtarTxt()});
		}
		
		/*
		 * 로직추가
		 */
		if(logger.isDebugEnabled()) {
			logger.debug("90190263 공지사항.정보.등록 SVC input  {} ::: ", input);
		}
		int insertCnt = 0;
		
		try {
			MET_PBOK_NTAR_INF001InsertNtarinf_DIDT iNtarInf = new MET_PBOK_NTAR_INF001InsertNtarinf_DIDT();
			iNtarInf.setMetMngNo(input.getMetMngNo()); // 모임관리번호
			iNtarInf.setMetNtarTxt(input.getMetNtarTxt()); // 모임공지사항내용
			iNtarInf.setMetNtarHdnYn(input.getMetNtarHdnYn()); // 모임공지사항숨김여부
			iNtarInf.setMetNtarDelYn(input.getMetNtarDelYn()); // 모임공지사항삭제여부
			iNtarInf.setMetNtarRgsMbhSrno(input.getMetNtarRgsMbhSrno()); // 모임공지사항등록회원일련번호
			iNtarInf.setMetNtarChgMbhSrno(input.getMetNtarRgsMbhSrno()); // 모임공지사항변경회원일련번호
			iNtarInf.setMetNtarRgsDt(input.getMetNtarRgsDt()); // 모임공지사항등록일자
			iNtarInf.setMetNtarRgsTm(input.getMetNtarRgsTm()); // 모임공지사항등록시각
			iNtarInf.setMetNtarChgDt(input.getMetNtarRgsDt()); // 모임공지사항변경일자
			iNtarInf.setMetNtarChgTm(input.getMetNtarRgsTm()); // 모임공지사항변경시각
			iNtarInf.setMetNtarChgTm(input.getMetNtarRgsTm()); // 모임공지사항변경시각
			iNtarInf.setMetAcno(input.getMetAcno()); // 모임계좌번호
			iNtarInf.setRlfAcno(input.getRlfAcno()); // 안심계좌번호
			iNtarInf.setLstDbChgId(""); // 최종DB변경ID
			iNtarInf.setLstDbChgDtm( WFDateUtils.getDateTimeNow()); // 최종DB변경일시
			 
			if(logger.isDebugEnabled()) {
				logger.debug("90190263 공지사항.정보.등록 SVC iNtarInf  {} ::: ", iNtarInf);
			}
					
			/*
			 * @BXMType ComponentCall
			 * 모임통장.일반.관리.컴포넌트 공지사항.정보.등록
			 */
			// com.skbank.sml.fns.mpb.com.MPBMetPbokBscMng_COM
			insertCnt = mPBMetPbokBscMng_COM.insertNtarinf(iNtarInf);
			
			if(logger.isDebugEnabled()) {
				logger.debug("90190263 공지사항.정보.등록 SVC insertCnt  {} ::: ", insertCnt);
			}
				
			/**
			 * @BXMType IF
			 * 등록건수 > 0
			 */
			if ( insertCnt > 0 ) /** 정상코드 리턴*/ {
				output.setRspRtcd("0000");
			} else {
				output.setRspRtcd("9999");
			}
		} catch (WFApplicationException e) {
			logger.debug("updateNtarInf WFApplicationException 오류 msgID | errorMsg  : [{}], [{}] ",e.getCode(), e.getMessage());
			
			Object[] args = e.getArguments();
            
	        String rtcdTxt = "";
	        if(args != null && args.length>0) {
	        	rtcdTxt = args[0].toString();
			}

            throw new WFApplicationException("FNSE0006", null, new Object[] {e.getCode(), rtcdTxt}); 
		} catch (Exception e) {
			logger.debug("updateNtarInf Exception 오류",e);
			
			throw new WFApplicationException("FNSE0006", null, new Object[] {"9999", e.getMessage()}); 
		}
		
		
		if( insertCnt > 0 ) {
			// PUSH 알림 전송
			MPBMetPbokBscMnginsertMetPbokPushNtfcSndInput_DTO iNtfcSnd = new MPBMetPbokBscMnginsertMetPbokPushNtfcSndInput_DTO();
			
			//모임공지변경
			iNtfcSnd.setUmsTmplCd(SHRMPBCmmConstant.STR_RPWBCESS0132123);
			iNtfcSnd.setMetMngNo(input.getMetMngNo());
			
			mPBMetPbokBscMng_COM.insertMetPbokPushNtfcSnd(iNtfcSnd);
			
			
		}
		
		return output;
			
	}
		
	/**
	 * 모임통장의 공지사항 정보를 수정하는 컴포넌트
	 * 
	 * @param input 공지사항.정보.수정.컨트롤러.입력.IO
	 * @return 공지사항.정보.수정.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName="공지사항.정보.수정", description="모임통장의 공지사항 정보를 수정하는 컴포넌트", author="90190263")
	public MPBMetPbokBscMngUpdateNtarInf_ODT updateNtarInf(MPBMetPbokBscMngUpdateNtarInf_IDT input
	)
	{
			
		/**
		* @BXMType GetBean
		*/
		mPBMetPbokBscMng_COM= WFApplicationContext.getBean(mPBMetPbokBscMng_COM, MPBMetPbokBscMng_COM.class);
			
		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokBscMngUpdateNtarInf_ODT output= new MPBMetPbokBscMngUpdateNtarInf_ODT();
		
		/**
		 * @BXMType IF
		 * @Desc 입력 검증 : 필수 입력 값 검증 코드를 작성 하십시오.
		 */
		if ( input.getMetMngNo()== null ) /**null check - 모임관리번호*/{
			throw new WFApplicationException("FNSE0005", null, new Object[]{input.getMetMngNo()});
		}
		else if ( input.getMetNtarRgsDt()== null ) /**null check - 모임공지사항등록일자*/{
			throw new WFApplicationException("FNSE0005", null, new Object[]{input.getMetNtarRgsDt()});
		}
		else if ( input.getMetNtarSrno()== null ) /**null check - 모임공지사항일련번호*/{
			throw new WFApplicationException("FNSE0005", null, new Object[]{input.getMetNtarSrno()});
		}
		else if ( input.getMetNtarTxt()== null ) /**null check - 모임공지사항내용*/{
			throw new WFApplicationException("FNSE0005", null, new Object[]{input.getMetNtarTxt()});
		}
		
		/*
		 * 로직 추가
		 */
		if(logger.isDebugEnabled()) {
			logger.debug("90190263 공지사항.정보.등록 SVC input  {} ::: ", input);
		}
		
		int updateCnt = 0;
		
		try {
			MET_PBOK_NTAR_INF001UpdateNtarinf_DIDT iNtarInf = new MET_PBOK_NTAR_INF001UpdateNtarinf_DIDT();
			iNtarInf.setMetMngNo(input.getMetMngNo()); // 모임관리번호		
			iNtarInf.setMetNtarSrno(input.getMetNtarSrno()); // 모임공지사항일련번호
			iNtarInf.setMetNtarRgsDt(input.getMetNtarRgsDt()); // 모임공지사항등록일자
			iNtarInf.setMetNtarSrno(input.getMetNtarSrno()); // 모임공지사항일련번호
			iNtarInf.setMetNtarTxt(input.getMetNtarTxt()); // 모임공지사항내용
			iNtarInf.setMetNtarHdnYn(input.getMetNtarHdnYn()); // 모임공지사항숨김여부
			iNtarInf.setMetNtarDelYn(input.getMetNtarDelYn()); // 모임공지사항삭제여부
			iNtarInf.setMetNtarChgMbhSrno(input.getMetNtarChgMbhSrno()); // 모임공지사항변경회원일련번호
			iNtarInf.setMetNtarChgDt(input.getMetNtarChgDt()); // 모임공지사항변경일자
			iNtarInf.setMetNtarChgTm(input.getMetNtarChgTm()); // 모임공지사항변경시각
			iNtarInf.setLstDbChgId(""); // 최종DB변경ID
			iNtarInf.setLstDbChgDtm( WFDateUtils.getDateTimeNow() ); // 최종DB변경일시
			 
			/*
			 * @BXMType ComponentCall
			 * 모임통장.일반.관리.컴포넌트 공지사항.정보.수정
			 */
			// com.skbank.sml.fns.mpb.com.MPBMetPbokBscMng_COM
			updateCnt = mPBMetPbokBscMng_COM.updateNtarinf( iNtarInf );
			
			/**
			 * @BXMType IF
			 * 수정건수 > 0
			 */
			if ( updateCnt > 0 ) /** 정상코드 리턴*/ {
				output.setRspRtcd("0000");
				output.setRspMsgTxt("공지사항을 정상적으로 수정했습니다.");
				
			} else {
				output.setRspRtcd("9999");
				output.setRspMsgTxt("공지사항을 정상적으로 수정하지 못했습니다..");
			}
		} catch (WFApplicationException e) {
			logger.debug("updateNtarInf WFApplicationException 오류 msgID | errorMsg  : [{}], [{}] ",e.getCode(), e.getMessage());
			Object[] args = e.getArguments();
            
	        String rtcdTxt = "";
	        if(args != null && args.length>0) {
	        	rtcdTxt = args[0].toString();
			}

            throw new WFApplicationException("FNSE0006", null, new Object[] {e.getCode(), rtcdTxt}); 
		} catch (Exception e) {
			logger.debug("updateNtarInf Exception 오류",e);
			
			throw new WFApplicationException("FNSE0006", null, new Object[] {"9999", e.getMessage()}); 
		}
		
		if ( updateCnt > 0 ) /** 정상코드 리턴*/ {
			// PUSH 알림 전송
			MPBMetPbokBscMnginsertMetPbokPushNtfcSndInput_DTO iNtfcSnd = new MPBMetPbokBscMnginsertMetPbokPushNtfcSndInput_DTO();
			
			// 모임공지변경
			iNtfcSnd.setUmsTmplCd(SHRMPBCmmConstant.STR_RPWBCESS0132123);
			iNtfcSnd.setMetMngNo(input.getMetMngNo());
			
			mPBMetPbokBscMng_COM.insertMetPbokPushNtfcSnd(iNtfcSnd);
		}
			
		return output;
			
	}
		
	/**
	 * 회비를 미입금한 회원에게 메시지를 조회하기 위한 서비스
	 * 
	 * @param input 메시지.카드.조회.컨트롤러.입력.IO
	 * @return 메시지.카드.조회.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName="메시지.카드.조회", description="회비를 미입금한 회원에게 메시지를 조회하기 위한 서비스", author="90190263")
	public MPBMetPbokBscMngSelectMsgCad_ODT selectMsgCad(MPBMetPbokBscMngSelectMsgCad_IDT input
	)
	{
			
		/**
		* @BXMType GetBean
		*/
		mPBMetPbokBscMng_COM= WFApplicationContext.getBean(mPBMetPbokBscMng_COM, MPBMetPbokBscMng_COM.class);
			
		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokBscMngSelectMsgCad_ODT output= new MPBMetPbokBscMngSelectMsgCad_ODT();
			
		/*
		 * 로직 추가
		 */
		if(logger.isDebugEnabled()) {
			logger.debug("90190263 메시지.카드.조회 SVC input  {} ::: ", input);
		}
		
		MET_PBOK_MSG_CAD_INF001SelectMetPbokMsgCadInf_DIDT iMsgCad = new MET_PBOK_MSG_CAD_INF001SelectMetPbokMsgCadInf_DIDT();
		iMsgCad.setMetMsgCadDscd(input.getMetMsgCadDscd());
		/*
		 * @BXMType ComponentCall
		 * 모임통장.일반.관리.컴포넌트 메시지.카드.조회
		 */
		// com.skbank.sml.fns.mpb.com.MPBMetPbokBscMng_COM
		List<MET_PBOK_MSG_CAD_INF001SelectMetPbokMsgCadInf_DODT> oMsgCad= mPBMetPbokBscMng_COM.selectMsgCad(iMsgCad);
		
		List<MPBMsgCadGridInq_ODT> outDataList = new ArrayList<>(); 
		
		for( MET_PBOK_MSG_CAD_INF001SelectMetPbokMsgCadInf_DODT oMsgCadData : oMsgCad) {
			MPBMsgCadGridInq_ODT outData = new MPBMsgCadGridInq_ODT();
			outData.setMetMsgCadId(oMsgCadData.getMetMsgCadId()); // 모임메시지카드ID
			outData.setMetMsgCadNm(oMsgCadData.getMetMsgCadNm()); // 모임메시지카드명
			outData.setMetMsgCadTxt(oMsgCadData.getMetMsgCadTxt()); // 모임메시지카드내용
			outData.setMetMsgCadSortSeq(oMsgCadData.getMetMsgCadSortSeq()); // 모임메시지카드정렬순서
			outData.setAppMarkImgPathTxt(oMsgCadData.getAppMarkImgPathTxt()); // 앱표시이미지경로내용
			outData.setSnsMarkImgPathTxt(oMsgCadData.getSnsMarkImgPathTxt()); // SNS표시이미지경로내용
			outData.setMetMsgCadRgsDtm(oMsgCadData.getMetMsgCadRgsDtm()); // 모임메시지카드등록일시
			outData.setMetMsgCadChgDtm(oMsgCadData.getMetMsgCadChgDtm()); // 모임메시지카드변경일시
			outData.setMetMsgCadUsgYn(oMsgCadData.getMetMsgCadUsgYn()); // 모임메시지카드사용여부
			outData.setMetMsgCadDisTxt(oMsgCadData.getMetMsgCadDisTxt()); // 모임메시지카드구분내용
			outData.setMetMsgCadDelYn(oMsgCadData.getMetMsgCadDelYn()); // 모임메시지카드삭제여부
			outData.setMetMsgCadDscd(oMsgCadData.getMetMsgCadDscd()); // 모임메시지카드구분코드
			outData.setMetMsgCadRgpeId(oMsgCadData.getMetMsgCadRgpeId()); // 모임메시지카드등록자ID
			outData.setMetMsgCadAmdpeId(oMsgCadData.getMetMsgCadAmdpeId()); // 모임메시지카드수정자ID
			outData.setLstDbChgId(oMsgCadData.getLstDbChgId()); // 최종DB변경ID
			outData.setLstDbChgDtm(oMsgCadData.getLstDbChgDtm()); // 최종DB변경일시
		
			outDataList.add(outData);
		}
		
		output.setGrid(outDataList);
		output.setGridCnt(outDataList.size());
		
		if(logger.isDebugEnabled()) {
			logger.debug("90190263 메시지.카드.조회 SVC output  {} ::: ", output);
		}
		
		return output;
			
	}
	
	/**
	 * 모임통장의 알림 동의에 대한 설정된 정보를 수정하는 서비스
	 * 
	 * @param input 모임통장.알림.동의.설정.수정.컨트롤러.입력.IO
	 * @return 모임통장.알림.동의.설정.수정.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName="모임통장.알림.동의.설정.수정", description="모임통장의 알림 동의에 대한 설정된 정보를 수정하는 서비스", author="90190263")
	public MPBMetPbokBscMngUpdateMetPbokNtfcAgrEst_ODT updateMetPbokNtfcAgrEst(MPBMetPbokBscMngUpdateMetPbokNtfcAgrEst_IDT input
	)
	{
			
		/**
		* @BXMType GetBean
		*/
		mPBMetPbokBscMng_COM= WFApplicationContext.getBean(mPBMetPbokBscMng_COM, MPBMetPbokBscMng_COM.class);
			
		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokBscMngUpdateMetPbokNtfcAgrEst_ODT output= new MPBMetPbokBscMngUpdateMetPbokNtfcAgrEst_ODT();
		List<MPBMetPbokNtfcAgrEstAmdGrid_ODT> outputGrid = new ArrayList<>();
		MPBMetPbokNtfcAgrEstAmdGrid_ODT outputData = new MPBMetPbokNtfcAgrEstAmdGrid_ODT();
		String errMsgTxt = "";
		String errMsgId = "";
		try {

			if (logger.isDebugEnabled()) {
				logger.debug("90190263 모임통장.알림.동의.설정.수정 SVC input {} ::: ", input);
			}
			
			for( MPBMetPbokNtfcAgrEstAmdGrid_IDT iNtfcAgrEst : input.getGrid() ) {
				//건수, 그리드 회원일련번호, 공지방송구분코드
				MetPbokBscMbhInf_DIDT iMetPbokBscMbhInf = new MetPbokBscMbhInf_DIDT();
				iMetPbokBscMbhInf.setMetChgDscd("26"); // 모임변경구분코드 [26] 공지발송구분코드
				iMetPbokBscMbhInf.setMetMngNo(iNtfcAgrEst.getMetMngNo());// 모임관리번호
				iMetPbokBscMbhInf.setCnt(1);// 건수
	
				List<MetPbokBscMbhInfGrid_DIDT> inputGrid = new ArrayList<>();
				
				MetPbokBscMbhInfGrid_DIDT inputData = new MetPbokBscMbhInfGrid_DIDT();
				inputData.setMetMbhSrno(iNtfcAgrEst.getMetMbhSrno()); // 모임회원일련번호
				inputData.setAncSndDscd(iNtfcAgrEst.getAncSndDscd()); // 공지발송구분코드
	
				inputGrid.add(inputData);
				
				iMetPbokBscMbhInf.setGrid(inputGrid);
	
				if (logger.isDebugEnabled()) {
					logger.debug("90190263 모임통장.알림.동의.설정.수정 SVC iMetPbokBscMbhInf {} ::: ", iMetPbokBscMbhInf);
				}
				
				/*
				 * @BXMType ComponentCall
				 * 모임통장.일반.관리.컴포넌트 모임.알림.설정.수정
				 */
				MetPbokBscMbhInf_DODT oMetPbokBscMbhInf = mPBMetPbokBscMng_COM.updateMetPbokBscMbhInf(iMetPbokBscMbhInf);

				if (logger.isDebugEnabled()) {
					logger.debug("90190263 모임통장.알림.동의.설정.수정 SVC oMetPbokBscMbhInf {} ::: ", oMetPbokBscMbhInf);
				}

				outputData.setMetMngNo(oMetPbokBscMbhInf.getMetMngNo());
				
		        for(MetPbokBscMbhInfGrid_DODT oBscMbhData : oMetPbokBscMbhInf.getGrid() ) {
					outputData.setMetMbhSrno(oBscMbhData.getMetMbhSrno());
					outputData.setMetMbhNm(oBscMbhData.getMetMbhNm());
					outputData.setAncSndDscd(oBscMbhData.getAncSndDscd());
					
					outputGrid.add(outputData);
				}
			}

	        output.setGrid(outputGrid);
	        
		}catch(Exception e){
			logger.error("updateMetPbokNtfcAgrEst 전문 error :: {}", e);
			
			if ( e instanceof WFApplicationException) {
				WFApplicationException we = (WFApplicationException) e;
				logger.error("WFApplicationException {} ", we);
				
				Object[] args = we.getArguments();
	            
				if(args != null && args.length>0) {
	            	errMsgTxt = args[0].toString();
	            	errMsgId =  args[1].toString();
				} else {
					errMsgTxt = we.getMessage();
					errMsgId = we.getCode();
				}
			} else {
				logger.error("Exception {} ", e);
				errMsgTxt = e.getMessage();
				errMsgId = "9999";
			}
			
			throw new WFApplicationException("FNSE0006", null, new Object[] {errMsgId, errMsgTxt}); 
		}

		if (logger.isDebugEnabled()) {
			logger.debug("90190263 모임통장.알림.동의.설정.수정 SVC  output {} ::: ",  output);
		}
		
		return output;
			
	}
		
	/**
	 * 모임통장의 모임명을 수정 관리하는 서비스
	 * 
	 * @param input 모임통장.모임명.수정.컨트롤러.입력.IO
	 * @return 모임통장.모임명.수정.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName="모임통장.모임명.수정", description="모임통장의 모임명을 수정 관리하는 서비스", author="90190263")
	public MPBMetPbokBscMngUpdateMetPbokMetNm_ODT updateMetPbokMetNm(MPBMetPbokBscMngUpdateMetPbokMetNm_IDT input
	)
	{ 
		/**
		* @BXMType GetBean
		*/
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		mPBMetPbokBscMng_COM= WFApplicationContext.getBean(mPBMetPbokBscMng_COM, MPBMetPbokBscMng_COM.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokBscMngUpdateMetPbokMetNm_ODT output= new MPBMetPbokBscMngUpdateMetPbokMetNm_ODT();
		/**
		 * @BXMType IF
		 * @Desc 입력 검증 : 필수 입력 값 검증 코드를 작성 하십시오.
		 */
		if ( input.getMetMngNo()== null ) /**null check - 모임관리번호*/{
			throw new WFApplicationException("FNSE0005", null, new Object[]{input.getMetMngNo()});
		}
		else if ( input.getMetNm()== null ) /**null check - 모임명 */{
			throw new WFApplicationException("FNSE0005", null, new Object[]{input.getMetNm()});
		}
		
		if(logger.isDebugEnabled()) {
			logger.debug("90190263 모임통장.모임명.수정 SVC input {} :: ", input);
		}
		
		//세션고객정보
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession(); 
		if(logger.isDebugEnabled()) {
			logger.debug("currentCust ====== {} ::: ", currentCust);
		} 
		String errMsgId = "";
		String errMsgTxt = "";
		
		try {
			MetPbokBscMbhInf_DIDT iMetPbokBscMbhInf = new MetPbokBscMbhInf_DIDT();
			iMetPbokBscMbhInf.setMetChgDscd("12"); // 모임변경구분코드 [12] 모임명 변경
			iMetPbokBscMbhInf.setMetMngNo(input.getMetMngNo()); // 모임관리번호
			iMetPbokBscMbhInf.setMetNm(input.getMetNm()); // 모임명
			
			/*
			 * @BXMType ComponentCall
			 * 모임통장.일반.관리.컴포넌트 모임통장.기본.회원.정보.수정
			 */
			MetPbokBscMbhInf_DODT oMetPbokBscMbhInf = mPBMetPbokBscMng_COM.updateMetPbokBscMbhInf(iMetPbokBscMbhInf);
			
			if(logger.isDebugEnabled()) {
				logger.debug("90190263 모임통장.모임명.수정 SVC oMetPbokBscMbhInf {} :: ", oMetPbokBscMbhInf);
			}
			
			output.setMetChgDscd(oMetPbokBscMbhInf.getMetChgDscd()); // 모임변경구분코드
			output.setMetMngNo(oMetPbokBscMbhInf.getMetMngNo()); // 모임관리번호
			output.setMetNm(oMetPbokBscMbhInf.getMetNm()); // 모임명
			output.setMbpfPymDt(oMetPbokBscMbhInf.getMbpfPymDt()); // 회비납부일자
			output.setMbpfPmtgtAm(oMetPbokBscMbhInf.getMbpfPmtgtAm()); // 회비납부대상금액
			output.setMetDscd(oMetPbokBscMbhInf.getMetDscd()); // 모임구분코드
			output.setAgmdCollDt(oMetPbokBscMbhInf.getAgmdCollDt()); // 동의서징구일자
			output.setLifecAm(oMetPbokBscMbhInf.getLifecAm()); // 생활비금액
			output.setCnt(oMetPbokBscMbhInf.getCnt()); // 건수
			
			// 모임통장.기본.회원.정보.그리드.수정.출력.IO
			List<MPBMetPbokBscMbhInfGrid_ODT> outDataList = new ArrayList<>();
		        
	        for(MetPbokBscMbhInfGrid_DODT oBscMbhData : oMetPbokBscMbhInf.getGrid() ) {
	        	MPBMetPbokBscMbhInfGrid_ODT outData = new MPBMetPbokBscMbhInfGrid_ODT();

	        	outData.setMetMbhSrno(oBscMbhData.getMetMbhSrno()); // 모임회원일련번호
	        	outData.setEbnkUtzpeNo(oBscMbhData.getEbnkUtzpeNo()); // 전자뱅킹이용자번호
	        	outData.setMetMbhNm(oBscMbhData.getMetMbhNm()); // 모임회원명
	        	outData.setMbpfPmtgtAm(oBscMbhData.getMbpfPmtgtAm()); // 회비납부대상금액
	        	outData.setAncSndDscd(oBscMbhData.getAncSndDscd()); // 공지발송구분코드
	        	outData.setAncSndDscdNm(oBscMbhData.getAncSndDscdNm()); // 공지발송구분코드명
	        	outData.setAgmdCollDt(oBscMbhData.getAgmdCollDt()); // 동의서징구일자
	        	outData.setMetMbhImgUrlNm(oBscMbhData.getMetMbhImgUrlNm()); // 모임회원이미지URL명
	        	
	        	outDataList.add(outData);
	        }
	        
	        output.setGrid(outDataList);

		}catch(Exception e){
			logger.error("updateMetPbokMetNm 전문 error :: {}", e);
			if ( e instanceof WFApplicationException) {
				WFApplicationException we = (WFApplicationException) e;
				logger.error("WFApplicationException {} ", we);
				
				Object[] args = we.getArguments();
	            
				if(args != null && args.length>0) {
	            	errMsgTxt = args[0].toString();
	            	errMsgId =  args[1].toString();
				} else {
					errMsgTxt = we.getMessage();
					errMsgId = we.getCode();
				}
			} else {
				logger.error("Exception {} ", e);
				errMsgTxt = e.getMessage();
				errMsgId = "9999";
			}
			
			throw new WFApplicationException("FNSE0006", null, new Object[] {errMsgId, errMsgTxt}); 
		}

		if(logger.isDebugEnabled()) {
			logger.debug("90190263 모임통장.모임명.수정 SVC output {} :: ", output);
		}
		
		return output;
			
	}
		
	/**
	 * 모임통장의 서비스를 탈퇴함에 있어 입력비밀번호를 확인 후, 전체 모임원, 모임톨장을 해지 수정하는 서비스
	 * 
	 * @param input 모임통장.서비스.탈퇴.컨트롤러.입력.IO
	 * @return 모임통장.서비스.탈퇴.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName="모임통장.서비스.탈퇴.수정", description="모임통장의 서비스를 탈퇴함에 있어 입력비밀번호를 확인 후, 전체 모임원, 모임톨장을 해지 수정하는 서비스", author="90190263")
	public MPBMetPbokBscMngUpdateMetPbokSrvcScss_ODT updateMetPbokSrvcScss(MPBMetPbokBscMngUpdateMetPbokSrvcScss_IDT input
	)
	{
			
		/**
		* @BXMType GetBean
		*/
		// WFInterfaceCfg 생성 컴포넌트
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class);
		sHRIBSMR0005766_COM= WFApplicationContext.getBean(sHRIBSMR0005766_COM, SHRIBSMR0005766_COM.class);
		sHRAllActInqTbk_COM= WFApplicationContext.getBean(sHRAllActInqTbk_COM, SHRAllActInqTbk_COM.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokBscMngUpdateMetPbokSrvcScss_ODT output= new MPBMetPbokBscMngUpdateMetPbokSrvcScss_ODT();
			
		/**
		 * @BXMType IF
		 * @Desc 입력 검증 : 필수 입력 값 검증 코드를 작성 하십시오.
		 */
		if ( input.getMetMngNo()== null ) /**null check - 모임관리번호 */{
			throw new WFApplicationException("FNSE0003", new Object[]{input.getMetMngNo()});
		}
		
		/**
		 * 연계시스템 호출
		 * TYPE : MCA
		 * ID : IBSMR0005766
		 * NM : 뉴WON뱅킹의 모임통장의 서비스 해제 전문을 수신하여 처리한다.
		 */
		if(logger.isDebugEnabled()) {
				logger.debug("90190263 모임통장의 서비스 해제 COM input  {} ::: ", input);
		}
		//세션고객정보
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession();
		if(logger.isDebugEnabled()) {
			logger.debug("currentCust  {} :::= {} ::: ", currentCust);
		}
				
		String errMsgId = "";
		String errMsgTxt = "";
		/**
		 * @BXMType Try
		 * 
		 */
		try{
			/**
			 * 연계시스템 호출
			 * TYPE : MCA
			 * ID : IBSMR0005766
			 * NM : 모임통장 서비스해제
			 */
			output.setMetRgsDt("정상처리되었습니다.");
			output.setRscd("0000");
			
			//  MCA WFInterfaceCfg 객체 획득
			WFInterfaceCfg interfaceCfg  = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg();
		
	    	//  WFInterfaceCfg 셋팅
			interfaceCfg.setInterfaceId("IBSMR0005766");
	        
	        IBSMR0005766_ODT oIBSMR0005766= new IBSMR0005766_ODT();
			IBSMR0005766_IDT iIBSMR0005766 = new IBSMR0005766_IDT();
			iIBSMR0005766.setMetMngNo(input.getMetMngNo());
			
			WFInfResponse<IBSMR0005766_ODT> mcaOutput5766 = sHRIBSMR0005766_COM.callTrx(iIBSMR0005766, interfaceCfg);
			
			oIBSMR0005766 = mcaOutput5766.getResponseData();
			
			output.setMetMngNo(oIBSMR0005766.getMetMngNo()); // 모임관리번호
			output.setMetNm(oIBSMR0005766.getMetNm()); // 모임명
			output.setCusUsgBkwAcno(oIBSMR0005766.getCusUsgBkwAcno()); // 고객사용전행계좌번호
			output.setRlfAcno(oIBSMR0005766.getRlfAcno()); // 안심계좌번호
			output.setMetPbokDscd(oIBSMR0005766.getMetPbokDscd()); // 모임통장구분코드
			output.setMetPbokDscdNm(oIBSMR0005766.getMetPbokDscdNm()); // 모임통장구분코드명
			output.setMbpfPymDt(oIBSMR0005766.getMbpfPymDt()); // 회비납부일자
			output.setMbpfPmtgtAm(oIBSMR0005766.getMbpfPmtgtAm()); // 회비납부대상금액
			output.setAgmdCollDt(oIBSMR0005766.getAgmdCollDt()); // 동의서징구일자
			output.setMetDscd(oIBSMR0005766.getMetDscd()); // 모임구분코드
			output.setMetDscdNm(oIBSMR0005766.getMetDscdNm()); // 모임구분코드명
			output.setMetRgsDt(oIBSMR0005766.getMetRgsDt()); // 모임등록일자
			output.setRgsTm(oIBSMR0005766.getRgsTm()); // 등록시각
			output.setDpsAcno(oIBSMR0005766.getDpsAcno()); // 수신계좌번호
			output.setMetBscImgUrlNm(oIBSMR0005766.getMetBscImgUrlNm()); // 모임기본이미지URL명

			// 계좌리스트 재조회
			sHRAllActInqTbk_COM.selectSessActList(SHRBSCInquiryConstant.BSC_ACT_LIST_INQ_DIS_ALL, true);
			
			if(logger.isDebugEnabled()) {
				logger.debug("90190263 모임통장의 서비스 해제 COM output  {} ::: ", output);
			}
		}catch(Exception e){
			logger.error("updateMetPbokMetNm 전문 error :: {}", e);
			if ( e instanceof SFAdaptorApplicationException ) {
				SFAdaptorApplicationException se = (SFAdaptorApplicationException) e;
				logger.error("SFAdaptorApplicationException {} ", se);
				
				Object[] args = se.getArguments();
	            
	            if(args != null && args.length>0) {
	            	errMsgTxt = args[0].toString();
				}
	            errMsgId = se.getCode();
	            
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
			
			output.setRscd(errMsgId);
			output.setMetRgsDt(errMsgTxt);
		}
	
		return output;
			
	}


	/**
	 * 모임통장의 이미지를 수정 할 수 있도록 관리하는 서비스 
	 * 
	 * @param input 모임통장.이미지.정보.컨트롤러.입력.IO
	 * @return 모임통장.이미지.정보.컨트롤러.출력.IO 
	 */
	@BxmCategory(logicalName = "모임통장.이미지.정보.수정", description = "모임통장의 이미지를 수정 할 수 있도록 관리하는 서비스", author = "90190263")
	public MPBMetPbokBscMngUpdateMetPbokImgInf_ODT updateMetPbokImgInf(MPBMetPbokBscMngUpdateMetPbokImgInf_IDT input, MultipartFile multiPartFile) {

		/**
		 * @BXMType GetBean
		 */
		mPBMetPbokBscMng_COM= WFApplicationContext.getBean(mPBMetPbokBscMng_COM, MPBMetPbokBscMng_COM.class);
 
		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokBscMngUpdateMetPbokImgInf_ODT output = new MPBMetPbokBscMngUpdateMetPbokImgInf_ODT();
		
		/**
		 * @BXMType IF
		 * @Desc 입력 검증 : 필수 입력 값 검증 코드를 작성 하십시오.
		 */
		if ( input.getMetChgDscd()== null ) /**null check - 모임변경구분코드*/{
			throw new WFApplicationException("FNSE0005", null, new Object[]{input.getMetChgDscd()});
		}
		else if ( input.getMetMngNo()== null ) /**null check - 모임관리번호*/{
			throw new WFApplicationException("FNSE0005", null, new Object[]{input.getMetMngNo()});
		}
		else if ( input.getMetMbhSrno()== null ) /**null check - 모임회원일련번호*/{
			throw new WFApplicationException("FNSE0005", null, new Object[]{input.getMetMbhSrno()});
		}
		else if ( input.getMetMbhNm()== null ) /**null check - 모임회원명*/{
			throw new WFApplicationException("FNSE0005", null, new Object[]{input.getMetMbhNm()});
		}
		else if ( input.getMetImgUrlNm()== null ) /**null check - 모임이미지URL명*/{
			throw new WFApplicationException("FNSE0005", null, new Object[]{input.getMetImgUrlNm()});
		}
		else if ( input.getFileNm()== null ) /**null check - 파일명*/{
			throw new WFApplicationException("FNSE0005", null, new Object[]{input.getFileNm()});
		}
		else if ( input.getFilePath()== null ) /**null check - 파일경로*/{
			throw new WFApplicationException("FNSE0005", null, new Object[]{input.getFilePath()});
		}
		
		if (logger.isDebugEnabled()) {
			logger.debug("90190263 모임통장.이미지.정보.수정 SVC input {} ::: ", input);
			logger.debug("90190263 모임통장.이미지.정보.수정 SVC multiPartFile {} :: ", multiPartFile);
		}
		String errMsgTxt = "";
		String errMsgId = "";
		
		try {
			// 파일 업로드	
			WFFileUtilDTO fileInputDTO = new WFFileUtilDTO();
			WFFileUtilDTO fileResultDTO = new WFFileUtilDTO();
			if(!ObjectUtils.isEmpty(multiPartFile)) {
				
				fileInputDTO.setFileName( input.getFileNm() );
				fileInputDTO.setFilePath( "/FNS/moim/"+ input.getFilePath());
				fileInputDTO.setMultipartFile(multiPartFile);
				fileInputDTO.setFileSize(multiPartFile.getSize());
				
				if (logger.isDebugEnabled()) {
					logger.debug("90190263 모임통장.이미지.정보.수정 SVC multiPartFile.getInputStream  {} ", multiPartFile.getInputStream());
					logger.debug("90190263 모임통장.이미지.정보.수정 SVC multiPartFile.getName ::: {}  ", multiPartFile.getName());
					logger.debug("90190263 모임통장.이미지.정보.수정 SVC multiPartFile.getOriginalFilename ::: {}  ", multiPartFile.getOriginalFilename());
					logger.debug("90190263 모임통장.이미지.정보.수정 SVC multiPartFile.getContentType ::: {} ", multiPartFile.getContentType());
					logger.debug("90190263 모임통장.이미지.정보.수정 SVC multiPartFile.getResource:::  {} ", multiPartFile.getResource());
					logger.debug("90190263 모임통장.이미지.정보.수정 SVC fileInputDTO ::: {} ", fileInputDTO);
				}
				
				fileResultDTO = WFFileUtils.writeFile(fileInputDTO);
				
				if (logger.isDebugEnabled()) {
					logger.debug("90190263 모임통장.정보.수정 SVC fileResultDTO {} :: ", fileResultDTO);
				}
			}
			
			MetPbokBscMbhInf_DIDT iMetPbokBscMbhInf = new MetPbokBscMbhInf_DIDT();
			iMetPbokBscMbhInf.setMetChgDscd(input.getMetChgDscd()); // 모임변경구분코드 ( 20 : 모임기본이미지URL명 변경 / 28 : 모임회원이미지URL명 변경)    
			iMetPbokBscMbhInf.setMetMngNo(input.getMetMngNo()); // 모임관리번호
			
			/**
			 *  모임변경구분코드
			 *  20 : 모임기본이미지URL명 변경   
			 *  28 : 모임회원이미지URL명 변경    
			 */
			//"filePath=C:/WFW_TOOL/bizfile/sml/FNS/moim/represent/20240720\gTest1-13ff8bf9-ba8e-4754-97a3-09566a9440e1-55c54e19-dc36-4505-a744-3730ef334d95.png"
			StringBuffer sbImgUrlNm = new StringBuffer();
			String sImgUrlNm = sbImgUrlNm.append( "/FNS/moim/" )
											 	 	  .append( input.getFilePath() )
													  .append( '/' )
													  .append( fileResultDTO.getFileName() ).toString();
			
			MetPbokBscMbhInfGrid_DIDT inputData = new MetPbokBscMbhInfGrid_DIDT();
			List<MetPbokBscMbhInfGrid_DIDT> inputGrid = new ArrayList<>();
					
			if("20".equals(input.getMetChgDscd())) {
				iMetPbokBscMbhInf.setMetBscImgUrlNm( sImgUrlNm );
			} else if("28".equals(input.getMetChgDscd())) {
				inputData.setMetMbhSrno(input.getMetMbhSrno()); // 모임회원일련번호
				inputData.setMetMbhImgUrlNm( sImgUrlNm ); // 모임이미지URL
				inputGrid.add(inputData);
				iMetPbokBscMbhInf.setGrid(inputGrid);
				iMetPbokBscMbhInf.setCnt(1);// 건수
			}

			if (logger.isDebugEnabled()) {
				logger.debug("90190263 모임통장.이미지 정보.수정 SVC iMetPbokBscMbhInf {} ::: ", iMetPbokBscMbhInf);
			}
			
			/*
			 * @BXMType ComponentCall
			 * 모임통장.회원.관리.컴포넌트 모임통장.이미지.정보.수정
			 */
			// com.skbank.sml.fns.mpb.com.MPBMetPbokMbhMng_COM
			MetPbokBscMbhInf_DODT oMetPbokBscMbhInf =  mPBMetPbokBscMng_COM.updateMetPbokBscMbhInf(iMetPbokBscMbhInf);
			
			if (logger.isDebugEnabled()) {
				logger.debug("90190263 모임통장.이미지 정보.수정 SVC oMetPbokBscMbhInf {} ::: ", oMetPbokBscMbhInf);
			}
			
			output.setMetChgDscd(oMetPbokBscMbhInf.getMetChgDscd()); // 모임변경구분코드
			output.setMetChgDscdNm(oMetPbokBscMbhInf.getMetChgDscdNm()); // 모임변경구분코드명
			output.setMetMngNo(oMetPbokBscMbhInf.getMetMngNo()); // 모임관리번호
			output.setMetNm(oMetPbokBscMbhInf.getMetNm()); // 모임명
			output.setMbpfPymDt(oMetPbokBscMbhInf.getMbpfPymDt()); // 회비납부일자
			output.setMbpfPmtgtAm(oMetPbokBscMbhInf.getMbpfPmtgtAm()); // 회비납부대상금액
			output.setMetDscd(oMetPbokBscMbhInf.getMetDscd()); // 모임구분코드
			output.setMetDscdNm(oMetPbokBscMbhInf.getMetDscdNm()); // 모임구분코드명
			output.setAgmdCollDt(oMetPbokBscMbhInf.getAgmdCollDt()); // 동의서징구일자
			output.setLifecAm(oMetPbokBscMbhInf.getLifecAm()); // 생활비금액
			output.setMetBscImgUrlNm(oMetPbokBscMbhInf.getMetBscImgUrlNm()); // 모임기본이미지URL명
			output.setCnt(oMetPbokBscMbhInf.getCnt()); // 건수

			// 모임통장.기본.회원.정보.그리드.수정.출력.IO
			List<MPBMetPbokBscMbhInfGrid_ODT> outDataList = new ArrayList<>();
		        
	        for(MetPbokBscMbhInfGrid_DODT oBscMbhData : oMetPbokBscMbhInf.getGrid() ) {
	        	MPBMetPbokBscMbhInfGrid_ODT outData = new MPBMetPbokBscMbhInfGrid_ODT();
	        	outData.setMetMbhSrno(oBscMbhData.getMetMbhSrno()); // 모임회원일련번호
	        	outData.setEbnkUtzpeNo(oBscMbhData.getEbnkUtzpeNo()); // 전자뱅킹이용자번호
	        	outData.setMetMbhNm(oBscMbhData.getMetMbhNm()); // 모임회원명
	        	outData.setMbpfPmtgtAm(oBscMbhData.getMbpfPmtgtAm()); // 회비납부대상금액
	        	outData.setAncSndDscd(oBscMbhData.getAncSndDscd()); // 공지발송구분코드
	        	outData.setAncSndDscdNm(oBscMbhData.getAncSndDscdNm()); // 공지발송구분코드명
	        	outData.setAgmdCollDt(oBscMbhData.getAgmdCollDt()); // 동의서징구일자
	        	outData.setMetMbhImgUrlNm(oBscMbhData.getMetMbhImgUrlNm()); // 모임회원이미지URL명
	        	
	        	outDataList.add(outData);
	        }
	        
	        output.setGrid(outDataList);
		}catch(Exception e){
			logger.error("updateMetPbokImgInf 전문 error :: {}", e);
			if ( e instanceof WFApplicationException) {
				WFApplicationException we = (WFApplicationException) e;
				logger.error("WFApplicationException {} ", we);
				
				Object[] args = we.getArguments();
	            
				if(args != null && args.length>0) {
	            	errMsgTxt = args[0].toString();
	            	errMsgId =  args[1].toString();
				} else {
					errMsgTxt = we.getMessage();
					errMsgId = we.getCode();
				}
			} else {
				logger.error("Exception {} ", e);
				errMsgTxt = e.getMessage();
				errMsgId = "9999";
			}
			
			throw new WFApplicationException("FNSE0006", null, new Object[] {errMsgId, errMsgTxt});
		}
		
		return output;

	}
	
	/**
	 * 모임통장의 이미지를 수정 할 수 있도록 관리하는 서비스 
	 * 
	 * @param input 모임통장.이미지.정보.컨트롤러.입력.IO
	 * @return 모임통장.이미지.정보.컨트롤러.출력.IO 
	 */
	@BxmCategory(logicalName = "모임통장.이미지.정보.초기화.수정", description = "모임통장의 이미지를 수정 할 수 있도록 관리하는 서비스", author = "90190263")
	public MPBMetPbokBscMngupdateMetPbokImgInfInlt_ODT updateMetPbokImgInfInlt(MPBMetPbokBscMngUpdateMetPbokImgInfInlt_IDT input) {

		/**
		 * @BXMType GetBean
		 */
		mPBMetPbokBscMng_COM= WFApplicationContext.getBean(mPBMetPbokBscMng_COM, MPBMetPbokBscMng_COM.class);
 
		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokBscMngupdateMetPbokImgInfInlt_ODT output = new MPBMetPbokBscMngupdateMetPbokImgInfInlt_ODT();
		
		if (logger.isDebugEnabled()) {
			logger.debug("90190263 모임통장.이미지.정보.초기화.수정 SVC input {} ::: ", input);
		}
		
		/**
		 * @BXMType IF
		 * @Desc 입력 검증 : 필수 입력 값 검증 코드를 작성 하십시오.
		 */
		
		if ( input.getMetChgDscd()== null ) /**null check - 모임변경구분코드*/{
			throw new WFApplicationException("FNSE0005", null, new Object[]{input.getMetChgDscd()});
		}
		else if ( input.getMetMngNo()== null ) /**null check - 모임관리번호*/{
			throw new WFApplicationException("FNSE0005", null, new Object[]{input.getMetMngNo()});
		}
		else if ( input.getMetImgUrlNm()== null ) /**null check - 모임이미지URL명*/{
			throw new WFApplicationException("FNSE0005", null, new Object[]{input.getMetImgUrlNm()});
		}
		else if ( input.getBscImgUrlNm()== null ) /**null check - 기본이미지URL명*/{
			throw new WFApplicationException("FNSE0005", null, new Object[]{input.getBscImgUrlNm()});
		}
		
		if("28".equals(input.getMetChgDscd())) {
			if ( input.getMetMbhSrno()== null ) /**null check - 모임회원일련번호*/{
				throw new WFApplicationException("FNSE0005", null, new Object[]{input.getMetMbhSrno()});
			}
			else if ( input.getMetMbhNm()== null ) /**null check - 모임회원명*/{
				throw new WFApplicationException("FNSE0005", null, new Object[]{input.getMetMbhNm()});
			}
		}
		
		String errMsgId = "";
		String errMsgTxt = "";
		try {

			if( StringUtils.isNotEmpty( input.getMetImgUrlNm() ) ) {
				MetPbokImgInfInq_DODT pbokImgInfData = new MetPbokImgInfInq_DODT();
				
				if(input.getMetImgUrlNm().indexOf("moim") !=-1 ) {
					// 모임통장 이미지 정보 조회
					pbokImgInfData  = mPBMetPbokBscMng_COM.selectMetPbokImgInf(input.getMetImgUrlNm());
				}
				/*
		  		 * - 디렉토리 삭제 / 파일 삭제는 new File("fullPath").delete(); 
				 */
				// 파일 업로드 된 파일 삭제 초기화
				File imgFile = new File(pbokImgInfData.getFilePath()); 
				
				if (logger.isDebugEnabled()) {
					logger.debug("90190263 모임통장.이미지.정보.초기화.수정 SVC File 조회 {} ::: ", imgFile);
				}
				
				if( imgFile.exists() ) {
					if( imgFile.delete() ) {
						// 파일 삭제 성공
						
						if (logger.isDebugEnabled()) {
							logger.debug("90190263 모임통장.이미지.정보.초기화.수정 SVC File 삭제 성공 {} ::: ", imgFile);
						}
						
					} else {
						// 파일 삭제 실패
						if (logger.isDebugEnabled()) {
							logger.debug("90190263 모임통장.이미지.정보.초기화.수정 SVC File 삭제 실패 {} ::: ", imgFile);
						}
					}
				} else {
					// 파일이 존재하지 않을때 
					if (logger.isDebugEnabled()) {
						logger.debug("90190263 모임통장.이미지.정보.초기화.수정 SVC File 존재하지 않음 {} ::: ", imgFile);
					}
				}
			}
			
			MetPbokBscMbhInf_DIDT iMetPbokBscMbhInf = new MetPbokBscMbhInf_DIDT();
			iMetPbokBscMbhInf.setMetChgDscd(input.getMetChgDscd()); // 모임변경구분코드 ( 20 : 모임기본이미지URL명 변경 / 28 : 모임회원이미지URL명 변경)    
			iMetPbokBscMbhInf.setMetMngNo(input.getMetMngNo()); // 모임관리번호
			
			/**
			 *  모임변경구분코드
			 *  20 : 모임기본이미지URL명 변경   
			 *  28 : 모임회원이미지URL명 변경    
			 */
			MetPbokBscMbhInfGrid_DIDT inputData = new MetPbokBscMbhInfGrid_DIDT();
			List<MetPbokBscMbhInfGrid_DIDT> inputGrid = new ArrayList<>();
			
			if("20".equals(input.getMetChgDscd())) {
				iMetPbokBscMbhInf.setMetBscImgUrlNm( input.getBscImgUrlNm() );
			} else if("28".equals(input.getMetChgDscd())) {
				inputData.setMetMbhSrno(input.getMetMbhSrno()); // 모임회원일련번호
				inputData.setMetMbhImgUrlNm( input.getBscImgUrlNm() ); // 모임이미지URL
				inputGrid.add(inputData);
				iMetPbokBscMbhInf.setGrid(inputGrid);
				iMetPbokBscMbhInf.setCnt(1);// 건수
			}

			if (logger.isDebugEnabled()) {
				logger.debug("90190263 모임통장.이미지 정보.초기화.수정 SVC iMetPbokBscMbhInf {} ::: ", iMetPbokBscMbhInf);
			}
			
			/*
			 * @BXMType ComponentCall
			 * 모임통장.회원.관리.컴포넌트 모임통장.이미지.정보.수정
			 */
			// com.skbank.sml.fns.mpb.com.MPBMetPbokMbhMng_COM
			
			MetPbokBscMbhInf_DODT oMetPbokBscMbhInf =  mPBMetPbokBscMng_COM.updateMetPbokBscMbhInf(iMetPbokBscMbhInf);
			
			if (logger.isDebugEnabled()) {
				logger.debug("90190263 모임통장.이미지 정보.초기화.수정 SVC oMetPbokBscMbhInf {} ::: ", oMetPbokBscMbhInf);
			}
			
			output.setMetChgDscd(oMetPbokBscMbhInf.getMetChgDscd()); // 모임변경구분코드
			output.setMetChgDscdNm(oMetPbokBscMbhInf.getMetChgDscdNm()); // 모임변경구분코드명
			output.setMetMngNo(oMetPbokBscMbhInf.getMetMngNo()); // 모임관리번호
			output.setMetNm(oMetPbokBscMbhInf.getMetNm()); // 모임명
			output.setMbpfPymDt(oMetPbokBscMbhInf.getMbpfPymDt()); // 회비납부일자
			output.setMbpfPmtgtAm(oMetPbokBscMbhInf.getMbpfPmtgtAm()); // 회비납부대상금액
			output.setMetDscd(oMetPbokBscMbhInf.getMetDscd()); // 모임구분코드
			output.setMetDscdNm(oMetPbokBscMbhInf.getMetDscdNm()); // 모임구분코드명
			output.setAgmdCollDt(oMetPbokBscMbhInf.getAgmdCollDt()); // 동의서징구일자
			output.setLifecAm(oMetPbokBscMbhInf.getLifecAm()); // 생활비금액
			output.setMetBscImgUrlNm(oMetPbokBscMbhInf.getMetBscImgUrlNm()); // 모임기본이미지URL명
			output.setCnt(oMetPbokBscMbhInf.getCnt()); // 건수

			// 모임통장.기본.회원.정보.그리드.수정.출력.IO
			List<MPBMetPbokBscMbhInfGrid_ODT> outDataList = new ArrayList<>();
		        
	        for(MetPbokBscMbhInfGrid_DODT oBscMbhData : oMetPbokBscMbhInf.getGrid() ) {
	        	MPBMetPbokBscMbhInfGrid_ODT outData = new MPBMetPbokBscMbhInfGrid_ODT();
	        	outData.setMetMbhSrno(oBscMbhData.getMetMbhSrno()); // 모임회원일련번호
	        	outData.setEbnkUtzpeNo(oBscMbhData.getEbnkUtzpeNo()); // 전자뱅킹이용자번호
	        	outData.setMetMbhNm(oBscMbhData.getMetMbhNm()); // 모임회원명
	        	outData.setMbpfPmtgtAm(oBscMbhData.getMbpfPmtgtAm()); // 회비납부대상금액
	        	outData.setAncSndDscd(oBscMbhData.getAncSndDscd()); // 공지발송구분코드
	        	outData.setAncSndDscdNm(oBscMbhData.getAncSndDscdNm()); // 공지발송구분코드명
	        	outData.setAgmdCollDt(oBscMbhData.getAgmdCollDt()); // 동의서징구일자
	        	outData.setMetMbhImgUrlNm(oBscMbhData.getMetMbhImgUrlNm()); // 모임회원이미지URL명
	        	
	        	outDataList.add(outData);
	        }
	        
	        output.setGrid(outDataList);
		}catch(Exception e){
			logger.error("updateMetPbokImgInf 전문 error :: {}", e);
			if ( e instanceof WFApplicationException) {
				WFApplicationException we = (WFApplicationException) e;
				logger.error("WFApplicationException {} ", we);
				
				Object[] args = we.getArguments();
	            
				if(args != null && args.length>0) {
	            	errMsgTxt = args[0].toString();
	            	errMsgId =  args[1].toString();
				} else {
					errMsgTxt = we.getMessage();
					errMsgId = we.getCode();
				}
			} else {
				logger.error("Exception {} ", e);
				errMsgTxt = e.getMessage();
				errMsgId = "9999";
			}
			
			throw new WFApplicationException("FNSE0006", null, new Object[] {errMsgId, errMsgTxt}); 
		}
		
		return output;

	}

	

	/**
	 * 모임통장의 자동리포트 데이터를 조회 하는 서비스 
	 * 1. 로그인 계정 == 모임장 
	 * 2. 회원목록조회/회비입금내역조회/거래내역조회
	 * 
	 * @param input 모임통장.자동리포트.정보.조회.컨트롤러.입력.IO
	 * @return 모임통장.자동리포트.정보.조회.컨트롤러.출력.IO 
	 * 모임원 수, 남은 회비(잔액) : 조회일 기준 
	 * 모임 회비 : 기간 내의 회비 입금 내역 
	 * 사용한 회비 : 기간 내의 지출 거래 내역
	 * 
	 */
	@BxmCategory(logicalName = "모임통장.자동리포트.정보.조회", description = "모임통장의 자동리포트 데이터를 조회 하는 서비스", author = "90191355")
	public MPBMetPbokBscMngSelectMetPbokAutoRptInf_ODT selectMetPbokAutoRptInf(
			MPBMetPbokBscMngSelectMetPbokAutoRptInf_IDT input) {
		if (logger.isDebugEnabled()) {
			logger.debug("모임통장.자동리포트.정보.조회 SVC input  {} ::: ", input);
		}

		/**
		 * @BXMType GetBean
		 */
		mPBMetPbokMbhMng_COM = WFApplicationContext.getBean(mPBMetPbokMbhMng_COM, MPBMetPbokMbhMng_COM.class);
		mPBMetPbokFncTrnMng_COM = WFApplicationContext.getBean(mPBMetPbokFncTrnMng_COM, MPBMetPbokFncTrnMng_COM.class);
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);

		MPBMetPbokBscMngSelectMetPbokAutoRptInf_ODT output = new MPBMetPbokBscMngSelectMetPbokAutoRptInf_ODT();

		try {
			if (logger.isDebugEnabled()) {
				logger.debug(" 모임통장 현재 모임원 목록 조회  ::: ");
			}

			MetPbokMbhInfInq_DIDT iMbhInf = new MetPbokMbhInfInq_DIDT();
			iMbhInf.setInqDis("03"); // 조회구분 [03] 모임관리번호별 회원목록조회
			iMbhInf.setMetMngNo(input.getMetMngNo()); // 모임관리번호

			if (logger.isDebugEnabled()) {
				logger.debug(" 회원목록 조회 input  {} ::: ", iMbhInf);
			}
			
			MetPbokMbhInfInq_DODT oMbhInf = mPBMetPbokMbhMng_COM	.selectMetPbokMbhInf(iMbhInf);
			BigDecimal ctBal = oMbhInf.getCtBal();
			Integer memberCnt = oMbhInf.getMetMbhRgsCnt();
			
			output.setMbhGridCnt(memberCnt); // 멤버수
			output.setCtBal(ctBal); //남은 금액!!!			

			if (logger.isDebugEnabled()) {
				logger.debug("모임통장 회원 조회 완료, 회원 수 {} ::: ", 	memberCnt);
				//logger.debug("모임통장 기간별 모임 회비 조회도 거래내역으로하자");
				logger.debug("모임통장 거래 내역 조회 ::: ");
			}

			MetPbokTrnPrts_DIDT iTrnPrts = new MetPbokTrnPrts_DIDT();
			iTrnPrts.setInqDis("05");
			iTrnPrts.setMetMngNo(input.getMetMngNo()); // 모임관리번호
			iTrnPrts.setInqEndTrnSrno(999999);
			if (input.getInqYM().length() == 6) {
				StringBuffer sbYM = new StringBuffer();
				sbYM.append(input.getInqYM().substring(0, 4))
						.append('-')
						.append(input.getInqYM().substring(4));
				
				YearMonth month = YearMonth.parse(sbYM.toString());
				String lastDay = month.atEndOfMonth().toString().replaceAll("-",	"");
				
				StringBuffer sbStaDt = new StringBuffer();
				sbStaDt.append(input.getInqYM()).append("01");
				
				iTrnPrts.setInqStaDt(sbStaDt.toString()); // 조회시작일자
				iTrnPrts.setInqEndDt(lastDay); // 조회종료일자
			} else {
				iTrnPrts.setInqStaDt(input.getInqStaDt()); // 조회시작일자
				iTrnPrts.setInqEndDt(input.getInqEndDt()); // 조회종료일자
			}

			if (logger.isDebugEnabled()) {
				logger.debug("거래내역 조회 시작 input {} :: ", iTrnPrts);
			}
			
			List<MetPbokTrnPrtsGrid> trnList = new ArrayList<MetPbokTrnPrtsGrid>();
			int nxtTrnSrno = 0;
			do {
				MetPbokTrnPrts_DODT oTrnPrts = mPBMetPbokFncTrnMng_COM.selectMetPbokTrnPrts(iTrnPrts);
				iTrnPrts.setInqStaDt(oTrnPrts.getNxtTrnDt());
				iTrnPrts.setInqStaTrnSrno(oTrnPrts.getNxtTrnSrno());
				trnList.addAll(oTrnPrts.getGrid());
				nxtTrnSrno = oTrnPrts.getNxtTrnSrno();
			} while(nxtTrnSrno != 0);
			

			if (logger.isDebugEnabled()) {
				logger.debug("거래내역 조회 완료 output cnt{} :: ", trnList.size());
			}

			//회비 납부 합
			BigDecimal mbpfPmtSumAm = BigDecimal.ZERO;
			//지출 합계 금액
			BigDecimal expdSumAm = BigDecimal.ZERO;
			
			if (trnList.size() > 0) {
				for (MetPbokTrnPrtsGrid oTrnPrtsData : trnList) {
					logger.debug("거래내역 {} :: ", oTrnPrtsData);	

					//거래상태코드 회비납부 전체 합
					if ("01".equals(oTrnPrtsData.getMetTrnStcd())) {
						mbpfPmtSumAm = mbpfPmtSumAm.add(oTrnPrtsData.getTrnAm());
					} else if ("2".equals(oTrnPrtsData.getDpsRapDscd())) {
						//입지급 구분 2 : 지급 구분 회비납부 전체 합
						expdSumAm = expdSumAm.add(oTrnPrtsData.getTrnAm());
					}
				}
			}
				
			output.setMbpfPmtSumAm(mbpfPmtSumAm);
			output.setExpdSumAm(expdSumAm);

		} catch (Exception e) {
			logger.error("모임통장.자동리포트.조회 Exception ::: {}", e);
		}

		if (logger.isDebugEnabled()) {
			logger.debug("90191355 모임통장.자동리포트.조회 SVC output {} :: ", output);
		}

		return output;

	}

	/**
	 * 모임통장 자동리포트 푸쉬 생성 서비스
	 * 기획과 다르게 화면에서 보여지는 정보를 푸쉬로 보내지 않음....;;
	 * @param input 모임통장.자동리포트.푸쉬.생성.컨트롤러.입력.IO
	 * @return 모임통장.자동리포트.푸쉬.생성.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName = "모임통장.자동리포트.푸쉬.생성", description = "모임통장의 자동리포팅 푸쉬 생성 서비스", author = "90191355")
	public MPBMetPbokBscMngInsertMetPbokAutoRptPush_ODT insertMetPbokAutoRptPush(
			MPBMetPbokBscMngInsertMetPbokAutoRptPush_IDT input) {
		if (logger.isDebugEnabled()) {
			logger.debug("90191355 모임통장 자동리포트 푸쉬 input {} :: ", input);
		}
		
		/**
		 * @BXMType GetBean
		 */
		sHRUmsPushSend_COM = WFApplicationContext.getBean(sHRUmsPushSend_COM, SHRUmsPushSend_COM.class);
		sHRUmsKkoSend_COM = WFApplicationContext.getBean(sHRUmsKkoSend_COM, SHRUmsKkoSend_COM.class);
		mPBMetPbokMbhMng_COM = WFApplicationContext.getBean(mPBMetPbokMbhMng_COM, MPBMetPbokMbhMng_COM.class);
		sHRINBPushBiz_COM = WFApplicationContext.getBean(sHRINBPushBiz_COM, SHRINBPushBiz_COM.class);
		sHRMPBBiz_COM = WFApplicationContext.getBean(sHRMPBBiz_COM, SHRMPBBiz_COM.class);
		/**
		 * @BXMType VariableDeclaration
		 */

		MPBMetPbokBscMngInsertMetPbokAutoRptPush_ODT output = new MPBMetPbokBscMngInsertMetPbokAutoRptPush_ODT();
		try {		
			//회원 목록 조회
			MetPbokMbhInfInq_DIDT iMbhInf = new MetPbokMbhInfInq_DIDT();
			iMbhInf.setInqDis("03"); // 조회구분 [03] 모임관리번호별 회원목록조회
			iMbhInf.setMetMngNo(input.getMetMngNo()); // 모임관리번호

			if (logger.isDebugEnabled()) {
				logger.debug(" 회원목록 조회 input  {} ::: ", iMbhInf);
			}
			
			List<MetPbokMbhInfListInq_DODT> memberList = new ArrayList<MetPbokMbhInfListInq_DODT>();
			String nxtMetMbhAlsNm = "";
			String metNm = "";
			String pushParamRlfAcno = "";
			do {
				// 모임통장.회원.정보.목록.조회.DBM.출력.IO
				MetPbokMbhInfInq_DODT oMbhInf = mPBMetPbokMbhMng_COM	.selectMetPbokMbhInf(iMbhInf);
				if (pushParamRlfAcno.equals("")) {
					pushParamRlfAcno = oMbhInf.getRlfAcno();
				}
				if (metNm.equals("")) {
					metNm = oMbhInf.getMetNm();
				}
				nxtMetMbhAlsNm = oMbhInf.getNxtMetMbhAlsNm();
				iMbhInf.setNxtMetMbhAlsNm(nxtMetMbhAlsNm);
				memberList.addAll(oMbhInf.getGrid());
			} while(!"".equals(nxtMetMbhAlsNm));
			
			int shareResult = 0; //성공
			
			String AUTO_REPORT_TEMPLATE_ID = SHRMPBCmmConstant.STR_RPWBCESS0132131;
			
			if (memberList.size() > 0) {
				List<MetPbokMbhInfListInq_DODT> kkoMembers = new ArrayList<MetPbokMbhInfListInq_DODT>();
				List<MetPbokMbhInfListInq_DODT> pushMembers = new ArrayList<MetPbokMbhInfListInq_DODT>();
				SHRINBPushBscInf_DTO pushAgreeDto = null;
				String userId = "";
				for (MetPbokMbhInfListInq_DODT member : memberList) {
					if ("90".equals(member.getMetMbhCtrStcd())) {
						//멤버 활동중 아님
						continue;
					}
					
					// 푸쉬 동의 여부도 확인해야함
					pushAgreeDto = new SHRINBPushBscInf_DTO();
					userId = "";
					//이용자번호분류코드
					//1 전자뱅킹이용자번호, 2 통합고객번호, 3 CI간편회원번호
					if ("3".equals(member.getUtzpeNoCfcd())) {
						//간편회원번호
						String esnsMbhNo = member.getEsnsMbhNo();
						userId = esnsMbhNo.startsWith("G") ? esnsMbhNo.substring(1) :  esnsMbhNo;
						member.setEbnkUtzpeNo(userId);
					} else {
						userId = member.getEbnkUtzpeNo();
					}
					
					//pushAgreeDto
					pushAgreeDto.setUserId(userId);
					
					SHRINBPushBscInf_DTO pushAgreeInfo = null;
					try {
						//푸쉬동의여부 T : true // F : false
						pushAgreeInfo = sHRINBPushBiz_COM.selectUsrPushAgrYn(pushAgreeDto);
					} catch (Exception e) {
						logger.error("모임 회원 앱 푸쉬 동의여부 조회 오류 :::: {} 모임 회원 일련번호 : {} :::: {}",metNm, member.getMetMbhSrno(), e);
					}
					
					if ("2".equals(member.getAncSndDscd()) && pushAgreeInfo != null && "T".equals(pushAgreeInfo.getPushAgrYn())) {
						pushMembers.add(member);
					} else {
						kkoMembers.add(member);
					}
				}
				
				SHRMPBBizSelectPushInfOut_DTO pushTxtInfo = sHRMPBBiz_COM.selectPushInf(AUTO_REPORT_TEMPLATE_ID);
				String PUSH_TITLE = pushTxtInfo.getTmsMsgTitl().replaceAll("metMngNm", metNm);
				String PUSH_TXT = pushTxtInfo.getTmsMsgTxt().replaceAll("metMngNm", metNm);
				
				logger.info("■ kakao push 대상 고객수 ::: => [{}]", kkoMembers.size());
				logger.info("■ ums push 대상 고객수 ::: => [{}]", pushMembers.size());
				
				
				if (kkoMembers.size() > 0) {
					/*************************************셋팅값 확인 필요, 참고 SCMSrvcCmnCpntVrf_CTR*************************************/
					SHRUmsSmsSend_DTO kkoSendDto = new SHRUmsSmsSend_DTO();
					kkoSendDto.setMsgType("5"); // 메시지타입 (1:SMS 2:LMS 3:MMS 4:MAIL 5:KAKAO)
					kkoSendDto.setSndType("10"); // 전송타입 (10:REAL  11:DB)
					
					kkoSendDto.setUmsTmplCd(AUTO_REPORT_TEMPLATE_ID); // UMS템플릿코드
					kkoSendDto.setKkoTp("N"); // 카카오알림유형(N:알림톡 Y:친구톡)
					kkoSendDto.setMpng1(metNm);
					kkoSendDto.setDeptSbrCd("20290");// 부서부점코드(6)
					kkoSendDto.setSmsLrclBzcd("WBC");// SMS대분류업무코드(10)
					kkoSendDto.setSmsMclfBzcd("ESS");// SMS중분류업무코드(10)
					kkoSendDto.setDmsgTelNo("0215885000");// 발신전화번호(16)
					
//					kkoSendDto.setMpng3(input.getAutoRptTxt1());
//					kkoSendDto.setMpng4(input.getAutoRptTxt2());
//					kkoSendDto.setMpng5(input.getAutoRptTxt3());
//					kkoSendDto.setMpng6(input.getAutoRptTxt4());
//					kkoSendDto.setMpng7(input.getAutoRptTxt5());
//					kkoSendDto.setMpng8(input.getAutoRptTxt6());
//					kkoSendDto.setSmsLrclBzcd("ARM"); // SMS대분류업무코드
//					kkoSendDto.setSmsMclfBzcd("RSVOPN"); // SMS중분류업무코드
//					kkoSendDto.setActCdno(kkoSendDto.getActCdno()); // 계좌카드번호
//					kkoSendDto.setActIsuBr(kkoSendDto.getActIsuBr()); // 계좌발급점
//					kkoSendDto.setSmktCmgnId(kkoSendDto.getSmktCmgnId()); // 세일즈마케팅캠페인ID
//					kkoSendDto.setAcno(kkoSendDto.getAcno()); // 계좌번호
//					kkoSendDto.setCopNm(kkoSendDto.getCopNm()); // 기업명
//					kkoSendDto.setStlAm(kkoSendDto.getStlAm()); // 결제금액
//					kkoSendDto.setBal(kkoSendDto.getBal()); // 잔액
					
					MPBMetPbokMbhMngSelectCsInf_DODT csInfo = null;
					for (MetPbokMbhInfListInq_DODT member: kkoMembers) {
						//멤버 기본 정보 셋팅
						String itcsno = member.getItcsno();
						if (!itcsno.isEmpty()) {
							//카카오 푸쉬 대상만 고객 정보 조회..!
							csInfo = mPBMetPbokMbhMng_COM.selectCsInf(itcsno);
						}
						
						if (csInfo == null) {
							//푸쉬 미동의인데 회원 정보가 조회되지 않는경우 방어 로직
							if (logger.isDebugEnabled()) {
								logger.debug("모임통장 자동리포트 검증되지 않은 회원 정보 카카오 pass :::: {}", member);
							}
							
							continue;
						}
						
						kkoSendDto.setCsno(csInfo.getCsno()); // 고객번호
						//kkoSendDto.setItCsno(csInfo.getItcsno()); // IT고객번호
						kkoSendDto.setCusNm(csInfo.getCusKorlNm()); // 고객명	

						StringBuffer telSb = new StringBuffer(); 
						telSb.append(csInfo.getHpComCd()).append(csInfo.getHpTlenNo()).append(csInfo.getHpSrno());						
						logger.info("■ 핸드폰번호 ::: [{}]", telSb.toString());
						kkoSendDto.setRecpTelNo(telSb.toString()); // 수신전화번호

						int kkoResult = sHRUmsKkoSend_COM.kkoSend(kkoSendDto);
						if (kkoResult != 0) {
							//카카오 알림 실패건 포함 결과 코드
							shareResult = 1;
						}
						logger.info("■ shrUmsSmsSend_COM.KkoSend(=KKO) Result ::: [{}]", kkoResult);
					}
				}
				
				if (pushMembers.size() > 0) {
					/*************************************푸시 *************************************/
					SHRUmsPushSend_DTO pushSendDto = new SHRUmsPushSend_DTO();
					pushSendDto.setUmsTmplCd(AUTO_REPORT_TEMPLATE_ID);// UMS템플릿번호
					pushSendDto.setImgFilePathNm(input.getAppMarkImgPathTxt()); // 메세지 카드 경로
					pushSendDto.setPushType("62");
					pushSendDto.setTmsTitlNm(PUSH_TITLE);
					pushSendDto.setTmsMsgTxt(PUSH_TXT);
					pushSendDto.setTmsMsgDtlTxt(input.getMetMsgCadTxt()); // 전송메시지상세내용
					pushSendDto.setUmsPushMpng1Txt(metNm);
					pushSendDto.setBizChrgEno("31700225");			//업무담당자ID
					pushSendDto.setUmsRgsDeptBrcd("20290");		//부서(지점)코드
					pushSendDto.setUmsDmsgTelNo("0215885000");	//UMS발신전화번호

					//pushSendDto.setTmplMpngBizTpTxt(pushSendDto.getTmplMpngBizTpTxt()); // 템플릿매핑업무유형내용
//					pushSendDto.setUmsPushMpng3Txt(input.getAutoRptTxt3());
//					pushSendDto.setUmsPushMpng4Txt(input.getAutoRptTxt4());
//					pushSendDto.setUmsPushMpng5Txt(input.getAutoRptTxt5());
//					pushSendDto.setUmsPushMpng6Txt(input.getAutoRptTxt6());
					// pushDB.setUmsPushMpng7Txt(input.getUmsPushMpng7Txt()); // UMSPUSH매핑7내용
					// pushDB.setUmsPushMpng8Txt(input.getUmsPushMpng8Txt()); //UMSPUSH매핑8내용
					// pushDB.setUmsPushMpng9Txt(input.getUmsPushMpng9Txt()); //UMSPUSH매핑9내용
					// pushDB.setUmsPushMpng10Txt(input.getUmsPushMpng10Txt());//UMSPUSH매핑10내용
					pushSendDto.setAppDscd("NW");					// 앱구분코드
					
					String pushInfo = "";					
					StringBuffer sbPushParam = new StringBuffer();
					sbPushParam.append("NWFNS00007_001M&rlfAcno=").append(pushParamRlfAcno);
					pushInfo = sbPushParam.toString();
					
					pushSendDto.setPushInfo("", pushInfo, "");
					
					for (MetPbokMbhInfListInq_DODT member: pushMembers) {	
						pushSendDto.setItCsno(member.getItcsno());
						pushSendDto.setUserId(member.getEbnkUtzpeNo()); // 사용자아이디
						//pushSendDto.setTmplMpngCusFnm(member.getMetMbhNm()); //템플릿매핑고객성명
						//pushSendDto.setTmplMpngAcno(pushSendDto.getTmplMpngAcno()); // 템플릿매핑계좌번호
//						pushSendDto.setTmplMpngStlTxt(pushSendDto.getTmplMpngStlTxt()); // 템플릿매핑결제금액
//						pushSendDto.setTmplMpngBalTxt(pushSendDto.getTmplMpngBalTxt()); // 템플릿매핑잔액금액
//						pushSendDto.setTmplMpngCrtfNoTxt(pushSendDto.getTmplMpngCrtfNoTxt()); // 템플릿매핑인증번호내용

						int pushResult = sHRUmsPushSend_COM.pushSend(pushSendDto); // 0성공 9실패
						if (pushResult != 0) {
							//푸쉬알림 실패건 포함 결과 코드
							shareResult = 2;
						}
						logger.info("■ shrUmsPushSend_COM.PushSend(=Push) Result ::: [{}]", pushResult);
					}
				}
			}
			
			output.setScsCnt(shareResult);
		} catch (Exception e) {
			logger.error("모임통장 자동리포트 생성Exception ::: {}", e);
			//서버 오류
			output.setScsCnt(9);
		}

		return output;
	}
	
	/**
	 * 운영관리에서 타발 거래 filePath만 사용..! 이미지 정보를 조회하기 위한 컴포넌트
	 * 
	 * @param input 이미지.정보.조회.컨트롤러.입력.IO
	 * @return 이미지.정보.조회.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName = "모임통장.이미지.정보.조회", description = "모임통장의 이미지를 조회하는 컴포넌트", author = "90190263")
	public MPBMetPbokBscMngSelectMetPbokImgInf_ODT selectMetPbokImgInf(MPBMetPbokBscMngSelectMetPbokImgInf_IDT input) {
		/**
		* @BXMType GetBean
		*/
		mPBMetPbokBscMng_COM= WFApplicationContext.getBean(mPBMetPbokBscMng_COM, MPBMetPbokBscMng_COM.class);
		
		MPBMetPbokBscMngSelectMetPbokImgInf_ODT output = new MPBMetPbokBscMngSelectMetPbokImgInf_ODT();
		
		StringBuilder sb = new StringBuilder();
		String fileFullPath = sb.append( input.getFilePath() ).toString();
		
		MetPbokImgInfInq_DODT dodt = mPBMetPbokBscMng_COM.selectMetPbokImgInf(fileFullPath);
		
		output.setFileNm(dodt.getFileNm()); // 파일명
		output.setFileDir(dodt.getFileDir()); // 파일디렉토리
		output.setFilePath(dodt.getFilePath()); // 파일경로
		output.setFileSize(dodt.getFileSize()); // 파일크기
		output.setFileData(dodt.getFileData()); // 파일데이터
		
		return output;
	}
	
	/**
	 * 모임통장의 간편비밀번호 인증을 조회
	 * 
	 * @param input 모임통장.간편.비밀번호.인증.컨트롤러.입력.IO
	 * @return 모임통장.간편.비밀번호.인증.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName = "모임통장.간편.비밀번호.인증.조회", description = " 모임통장의 간편비밀번호 인증을 조회", author = "90191355")
	public MPBMetPbokBscMngSelectMetPbokEsnsPwnoCrtf_ODT selectMetPbokEsnsPwnoCrtf(MPBMetPbokBscMngSelectMetPbokEsnsPwnoCrtf_IDT input) {
		/**
		* @BXMType GetBean
		*/
		sHRAFSTeenTeenPwno_COM= WFApplicationContext.getBean(sHRAFSTeenTeenPwno_COM, SHRAFSTeenTeenPwno_COM.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokBscMngSelectMetPbokEsnsPwnoCrtf_ODT output= new MPBMetPbokBscMngSelectMetPbokEsnsPwnoCrtf_ODT();

		 if(logger.isDebugEnabled()) {
			logger.debug("90190263 모임통장.간편.비밀번호.인증.조회 SVC input  {} ::: ", input);
		}
		 
		 SHRAFSTeenTeenPwnoSelectPpactPwnoVrf_DIDT iKeyPad = new SHRAFSTeenTeenPwnoSelectPpactPwnoVrf_DIDT();
		 iKeyPad.setEncyPinPwno(input.getEncyPinPwno()); // 암호화핀비밀번호
		 iKeyPad.setE2EPid(input.getE2EPid()); // 기기식별검증PID
		 
		 SHRAFSTeenTeenPwnoSelectPpactPwnoVrfKeyPad_DODT oKeyPad = sHRAFSTeenTeenPwno_COM.selectPpactPwnoVldnVrfKeyPad(iKeyPad);

		 output.setTrnScsYn(oKeyPad.getTrnScsYn()); // 거래성공여부
		 output.setErrCd(oKeyPad.getErrCd()); // 에러코드
		 output.setErrTitle(oKeyPad.getErrTitle()); // 에러메시지제목(커스텀)
		 output.setErrType(oKeyPad.getErrType()); // 에러타입(메시지유형, E:오류, I:정보, W:경고)
		 output.setErrMsg(oKeyPad.getErrMsg()); // 오류메시지
		 output.setErrBtnNm(oKeyPad.getErrBtnNm()); // 에러버튼명(커스텀)
		 output.setMoveScrnId(oKeyPad.getMoveScrnId()); // [옵션]이동화면ID(URL)
		 output.setErrMsgExpsTycd(oKeyPad.getErrMsgExpsTycd()); // 에러메시지호출유형(N: Native)
		 	
		 if(logger.isDebugEnabled()) {
			logger.debug("90190263 모임통장.간편.비밀번호.인증.조회 SVC input  {} ::: ", output);
		}
		
		return output;
	}
	
	/**
	 * 모임통장의 PUSH 알림을 발송한다.
	 * 
	 * @param input 모임통장.PUSH.알림.발송컨트롤러.입력.IO
	 * @return 모임통장.PUSH.알림.발송.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName = "모임통장.PUSH.알림.발송", description = "모임통장.PUSH.알림.발송", author = "90191355")
	public MPBMetPbokBscMngInsertMetPbokPushNtfcSnd_ODT insertMetPbokPushNtfcSnd(MPBMetPbokBscMngInsertMetPbokPushNtfcSnd_IDT input) {
		/**
		* @BXMType GetBean
		*/
		mPBMetPbokBscMng_COM = WFApplicationContext.getBean(mPBMetPbokBscMng_COM, MPBMetPbokBscMng_COM.class);
		mPBMetPbokMbhMng_COM= WFApplicationContext.getBean(mPBMetPbokMbhMng_COM, MPBMetPbokMbhMng_COM.class);
		sHRMPBBiz_COM = WFApplicationContext.getBean(sHRMPBBiz_COM, SHRMPBBiz_COM.class);
		sHRUmsKkoSend_COM = WFApplicationContext.getBean(sHRUmsKkoSend_COM, SHRUmsKkoSend_COM.class);
		sHRUmsPushSend_COM = WFApplicationContext.getBean(sHRUmsPushSend_COM, SHRUmsPushSend_COM.class);
		sHRINBPushBiz_COM = WFApplicationContext.getBean(sHRINBPushBiz_COM, SHRINBPushBiz_COM.class);
		
		
		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokBscMngInsertMetPbokPushNtfcSnd_ODT output = new MPBMetPbokBscMngInsertMetPbokPushNtfcSnd_ODT();

		if(logger.isDebugEnabled()) {
			logger.debug("90190263 모임통장.PUSH.알림.발송 SVC input  {} ::: ", input);
		}
		String errMsgId = "";
		String errMsgTxt = "";
		try {
			/**********************************************
			 * 모임의 전체 모임원을 조회한다.
			 **********************************************/
			MetPbokMbhInfInq_DIDT iMbhInf = new MetPbokMbhInfInq_DIDT();
			iMbhInf.setInqDis("03"); // 조회구분 [03] 모임관리번호별 회원목록조회
			iMbhInf.setMetMngNo(input.getMetMngNo()); // 모임관리번호
	
			MetPbokMbhInfInq_DODT oMbhInf = new MetPbokMbhInfInq_DODT();
			// 모임통장.회원.정보.목록.조회.DBM.출력.IO
			List<MPBMetPbokMbhInfListInq_ODT> oMbhList = new ArrayList<>();
						
			String nxtMbhAlsNm = "";
			String sRlfAcno = "";
			
			while( true ) {
				iMbhInf.setNxtMetMbhAlsNm(nxtMbhAlsNm);
				
				if(logger.isDebugEnabled()) {
					logger.debug("90190263 모임통장.PUSH.알림.발송 SVC 일반모임 회원목록 iMbhInf {} ::: ", iMbhInf);
				}
				
				/*
				 * @BXMType ComponentCall
				 * 모임통장.회원.관리.서비스 모임통장.회원.정보.조회
				 */
				// com.skbank.sml.fns.mpb.com.MPBMetPbokMbhMng_COM
				oMbhInf = new MetPbokMbhInfInq_DODT(); 
				oMbhInf = mPBMetPbokMbhMng_COM.selectMetPbokMbhInf( iMbhInf );
				
				if(logger.isDebugEnabled()) {
					logger.debug("90190263 모임통장.PUSH.알림.발송 SVC 일반모임 회원목록 oMbhInf  {} ::: ", oMbhInf);
				}
				
				sRlfAcno = oMbhInf.getRlfAcno();
				
				for( MetPbokMbhInfListInq_DODT oMbhInfData : oMbhInf.getGrid() ) {
					MPBMetPbokMbhInfListInq_ODT outData = new MPBMetPbokMbhInfListInq_ODT();
					
					outData.setMetMngNo(oMbhInfData.getMetMngNo()); // 모임관리번호
					outData.setMetMbhSrno(oMbhInfData.getMetMbhSrno()); // 모임회원일련번호
					outData.setMetMbhCtrStcd(oMbhInfData.getMetMbhCtrStcd()); // 모임회원계약상태코드
					outData.setMetMbhCtrStcdNm(oMbhInfData.getMetMbhCtrStcdNm()); // 모임회원계약상태코드명
					outData.setMetMbhDscd(oMbhInfData.getMetMbhDscd()); // 모임회원구분코드
					outData.setMetMbhDscdNm(oMbhInfData.getMetMbhDscdNm()); // 모임회원구분코드명
					outData.setUtzpeNoCfcd(oMbhInfData.getUtzpeNoCfcd()); // 이용자번호분류코드
					outData.setUtzpeNoCfcdNm(oMbhInfData.getUtzpeNoCfcdNm()); // 이용자번호분류코드명
					outData.setEbnkUtzpeNo(oMbhInfData.getEbnkUtzpeNo()); // 전자뱅킹이용자번호
					outData.setEsnsMbhNo(oMbhInfData.getEsnsMbhNo()); // 간편회원번호
					outData.setItcsno(oMbhInfData.getItcsno()); // 통합고객번호
					outData.setMetMbhAlsNm(oMbhInfData.getMetMbhAlsNm()); // 모임회원별칭명
					outData.setMetMbhNm(oMbhInfData.getMetMbhNm()); // 모임회원명
					outData.setMbpfPmtgtAm(oMbhInfData.getMbpfPmtgtAm()); // 회비납부대상금액
					outData.setAgmdCollDt(oMbhInfData.getAgmdCollDt()); // 동의서징구일자
					outData.setMetPtcpDt(oMbhInfData.getMetPtcpDt()); // 모임참여일자
					outData.setMetPtcpTm(oMbhInfData.getMetPtcpTm()); // 모임참여시각
					outData.setMetScssDt(oMbhInfData.getMetScssDt()); // 모임탈퇴일자
					outData.setMetScssTm(oMbhInfData.getMetScssTm()); // 모임탈퇴시각
					outData.setAncSndDscd(oMbhInfData.getAncSndDscd()); // 공지발송구분코드
					outData.setAncSndDscdNm(oMbhInfData.getAncSndDscdNm()); // 공지발송구분코드명
					outData.setRppeChgApvCd(oMbhInfData.getRppeChgApvCd()); // 대표자변경승인코드
					outData.setRppeChgApvCdNm(oMbhInfData.getRppeChgApvCdNm()); // 대표자변경승인코드명
					outData.setRppeChgApvDt(oMbhInfData.getRppeChgApvDt()); // 대표자변경승인일자
					outData.setMetMbhImgUrlNm(oMbhInfData.getMetMbhImgUrlNm()); // 모임회원이미지URL명
					
					oMbhList.add(outData);
				}
			
				if( !"".equals( oMbhInf.getNxtMetMbhAlsNm() )) { // 다음모임회원별칭명이 존재하면 
					nxtMbhAlsNm = oMbhInf.getNxtMetMbhAlsNm();
				} else {
					break;
				}
			}
			
			if(logger.isDebugEnabled()) {
				logger.debug("90190263 모임통장.PUSH.알림.발송 SVC 전체 회원목록 oMbhList  {} ::: ", oMbhList);
			}
			
			/**********************************************
			 * input List 의 멤버 필터링
			 **********************************************/
			// 알림 전송 대상 회원
			List<MPBMetPbokMbhInfListInq_ODT> sndMbhList = new ArrayList<>(); 
			
			MPBMetPbokMbhInfListInq_ODT oMbhData = new MPBMetPbokMbhInfListInq_ODT(); 
			for(MPBMetPbokBscMngPushNtfcSndMbhList_DTO inputMbhList  : input.getGrid()) {
				if(logger.isDebugEnabled()) {
					logger.debug("90190263 모임통장.PUSH.알림.발송 SVC 발송대상 필터 회원 inputMbhList  {} ::: ", inputMbhList);
				}
				
				oMbhData = new MPBMetPbokMbhInfListInq_ODT();
				oMbhData = oMbhList.stream() 
											.filter( item -> inputMbhList.getMetMbhSrno().equals(item.getMetMbhSrno()))
											.findFirst().orElse(oMbhData);
				
				if(logger.isDebugEnabled()) {
					logger.debug("90190263 모임통장.PUSH.알림.발송 SVC 발송대상 필터 회원 oMbhData  {} ::: ", oMbhData);
				}
				
				if(!ObjectUtils.isEmpty(oMbhData)) {
					sndMbhList.add(oMbhData);
				}
			}
			
			if(logger.isDebugEnabled()) {
				logger.debug("90190263 모임통장.PUSH.알림.발송 SVC 발송대상 회원목록 sndMbhList  {} ::: ", sndMbhList);
			}
			
			int shareResult = 0; //성공
			
			if( sndMbhList.size() > 0 ) {
				List<MPBMetPbokMbhInfListInq_ODT> kkoMembers = new ArrayList<>();
				List<MPBMetPbokMbhInfListInq_ODT> pushMembers = new ArrayList<>();
				
				for (MPBMetPbokMbhInfListInq_ODT sndMember : sndMbhList) {
					// 푸쉬 동의 여부도 확인해야함
					SHRINBPushBscInf_DTO pushAgreeDto = new SHRINBPushBscInf_DTO();
					String userId = "";
					//이용자번호분류코드
					//1 전자뱅킹이용자번호, 2 통합고객번호, 3 CI간편회원번호
					if ("3".equals(sndMember.getUtzpeNoCfcd())) {
						//간편회원번호
						String esnsMbhNo = sndMember.getEsnsMbhNo();
						userId = esnsMbhNo.startsWith("G") ? esnsMbhNo.substring(1) :  esnsMbhNo;
						sndMember.setEbnkUtzpeNo(userId);
					} else {
						userId = sndMember.getEbnkUtzpeNo();
					}
					
					//pushAgreeDto
					pushAgreeDto.setUserId(userId);
					
					SHRINBPushBscInf_DTO pushAgreeInfo = null;
					try {
						//푸쉬동의여부 T : true // F : false
						pushAgreeInfo = sHRINBPushBiz_COM.selectUsrPushAgrYn(pushAgreeDto);
					} catch (Exception e) {
						logger.error("모임 회원 앱 푸쉬 동의여부 조회 오류 :::: {} 모임 회원 일련번호 : {} :::: {}",oMbhInf.getMetNm(), sndMember.getMetMbhSrno(), e);
					}
					
					if ("2".equals(sndMember.getAncSndDscd()) && pushAgreeInfo != null && "T".equals(pushAgreeInfo.getPushAgrYn())) {
						pushMembers.add(sndMember);
					} else {
						kkoMembers.add(sndMember);
					}
				}
				
				logger.info("90190263 모임통장.PUSH.알림.발송 SVC kakao push 대상 고객수 ::: => [{}]", kkoMembers.size());
				logger.info("90190263 모임통장.PUSH.알림.발송 SVC ums push 대상 고객수 ::: => [{}]", pushMembers.size());
				
				if (kkoMembers.size() > 0) {
					logger.info("90190263 모임통장.PUSH.알림.발송 SVC kkoMembers KkoTmplCd()::: {}", input.getKkoTmplCd());
					
					SHRMPBBizSelectPushInfOut_DTO pushTxtInfo = sHRMPBBiz_COM.selectPushInf(input.getKkoTmplCd());
					//String PUSH_TITLE = pushTxtInfo.getTmsMsgTitl().replaceAll("metMngNm", oMbhInf.getMetNm());
					//String PUSH_TXT = pushTxtInfo.getTmsMsgTxt().replaceAll("metMngNm", oMbhInf.getMetNm());
					
					logger.info("90190263 모임통장.PUSH.알림.발송 SVC pushTxtInfo::: {}", pushTxtInfo);
					
					/*************************************셋팅값 확인 필요, 참고 SCMSrvcCmnCpntVrf_CTR*************************************/
					SHRUmsSmsSend_DTO kkoSendDto = new SHRUmsSmsSend_DTO();
					kkoSendDto.setMsgType("5"); // 메시지타입 (1:SMS 2:LMS 3:MMS 4:MAIL 5:KAKAO)
					kkoSendDto.setSndType("10"); // 전송타입 (10:REAL  11:DB)
					
					kkoSendDto.setUmsTmplCd(input.getKkoTmplCd()); // 카카오템플릿코드
					
					kkoSendDto.setKkoTp("N"); // 카카오알림유형(N:알림톡 Y:친구톡)
					kkoSendDto.setMpng1(oMbhInf.getMetNm());
					// 미입금 회원 전송시에만 회원별회비금액 매핑
					if(SHRMPBCmmConstant.STR_RPWBCESS0132132.equals( input.getKkoTmplCd() )) {
						// 소숫점 절삭
						String sMpbfPmtgtAm = WFStringUtils.addComma(oMbhData.getMbpfPmtgtAm().setScale(0, BigDecimal.ROUND_FLOOR).toString());
						
						kkoSendDto.setMpng2(sMpbfPmtgtAm);
					}
					kkoSendDto.setDeptSbrCd("20290");// 부서부점코드(6)
					kkoSendDto.setSmsLrclBzcd("WBC");// SMS대분류업무코드(10)
					kkoSendDto.setSmsMclfBzcd("ESS");// SMS중분류업무코드(10)
					kkoSendDto.setDmsgTelNo("0215885000");// 발신전화번호(16)

					MPBMetPbokMbhMngSelectCsInf_DODT csInfo = null;
					for (MPBMetPbokMbhInfListInq_ODT member: kkoMembers) {
						//멤버 기본 정보 셋팅
						String itcsno = member.getItcsno();
						if (!itcsno.isEmpty()) {
							//카카오 푸쉬 대상만 고객 정보 조회..!
							csInfo = mPBMetPbokMbhMng_COM.selectCsInf(itcsno);
						}
						
						if (csInfo == null) {
							//푸쉬 미동의인데 회원 정보가 조회되지 않는경우 방어 로직
							if (logger.isDebugEnabled()) {
								logger.debug("모임통장 자동리포트 검증되지 않은 회원 정보 카카오 pass :::: {}", member);
							}
							
							continue;
						}
						
						kkoSendDto.setCsno(csInfo.getCsno()); // 고객번호
						//kkoSendDto.setItCsno(csInfo.getItcsno()); // IT고객번호
						kkoSendDto.setCusNm(csInfo.getCusKorlNm()); // 고객명	

						StringBuffer telSb = new StringBuffer(); 
						telSb.append(csInfo.getHpComCd()).append(csInfo.getHpTlenNo()).append(csInfo.getHpSrno());						
						logger.info("■ 핸드폰번호 ::: [{}]", telSb.toString());
						kkoSendDto.setRecpTelNo(telSb.toString()); // 수신전화번호

						logger.info("90190263 모임통장.PUSH.알림.발송 SVC UMS kkoSendDto::: {}", kkoSendDto);
						
						int kkoResult = sHRUmsKkoSend_COM.kkoSend(kkoSendDto);
						if (kkoResult != 0) {
							//카카오 알림 실패건 포함 결과 코드
							shareResult = 1;
						}
						logger.info("■ shrUmsSmsSend_COM.KkoSend(=KKO) Result ::: [{}]", kkoResult);
					}
				}
				
				if (pushMembers.size() > 0) {
					logger.info("90190263 모임통장.PUSH.알림.발송 SVC pushMembers UmsTmplCd ::: {}", input.getUmsTmplCd());
					
					SHRMPBBizSelectPushInfOut_DTO pushTxtInfo = sHRMPBBiz_COM.selectPushInf(input.getUmsTmplCd());
					String PUSH_TITLE = pushTxtInfo.getTmsMsgTitl().replaceAll("metMngNm", oMbhInf.getMetNm());
					String PUSH_TXT = pushTxtInfo.getTmsMsgTxt().replaceAll("metMngNm", oMbhInf.getMetNm());
					
					logger.info("90190263 모임통장.PUSH.알림.발송 SVC pushTxtInfo::: {}", pushTxtInfo);
					
					/*************************************셋팅값 확인 필요, 참고 SCMSrvcCmnCpntVrf_CTR*************************************/
					String pushInfo = "";
					
					StringBuffer pushInfo_BUFFER = new StringBuffer();
					pushInfo_BUFFER.append("NWFNS00007_001M"); // 화면ID
					pushInfo_BUFFER.append("&rlfAcno="); // 파라미터값
					pushInfo_BUFFER.append(sRlfAcno); // 파라미터값
					pushInfo = pushInfo_BUFFER.toString();
					
					SHRUmsPushSend_DTO pushSendDto = new SHRUmsPushSend_DTO();
					
					pushSendDto.setUmsTmplCd(input.getUmsTmplCd());// UMS템플릿번호
					pushSendDto.setImgFilePathNm(input.getAppMarkImgPathTxt()); // 메세지 카드 경로
					pushSendDto.setPushType("62");
					pushSendDto.setTmsTitlNm(PUSH_TITLE);
					pushSendDto.setTmsMsgTxt(PUSH_TXT);
					pushSendDto.setTmsMsgDtlTxt(input.getMsgDtlTxt()); // 전송메시지상세내용
					pushSendDto.setUmsPushMpng1Txt(oMbhInf.getMetNm());
					
					pushSendDto.setBizChrgEno("31700225");			//업무담당자ID
					pushSendDto.setUmsRgsDeptBrcd("20290");		//부서(지점)코드
					pushSendDto.setUmsDmsgTelNo("0215885000");	// UMS발신전화번호
					pushSendDto.setAppDscd("NW");					// 앱구분코드
					pushSendDto.setPushInfo("", pushInfo, "");
					
					String itcsno = "";
					for (MPBMetPbokMbhInfListInq_ODT member: pushMembers) {	
						// 미입금 회원 전송시에만 회원별회비금액 매핑
						if(SHRMPBCmmConstant.STR_RPWBCESS0132132.equals( input.getUmsTmplCd() )) {
							// 소숫점 절삭
							String sMpbfPmtgtAm = WFStringUtils.addComma(member.getMbpfPmtgtAm().setScale(0, BigDecimal.ROUND_FLOOR).toString());
							
							PUSH_TXT = PUSH_TXT.replaceAll("pmtgtAm", sMpbfPmtgtAm);
							
							pushSendDto.setUmsPushMpng2Txt(sMpbfPmtgtAm);
						}
						
						if(StringUtils.isNotEmpty(member.getItcsno())) {
							itcsno =  member.getItcsno();
						} else {
							itcsno =  member.getEsnsMbhNo();
						}
						
						pushSendDto.setItCsno(itcsno);
						pushSendDto.setUserId(member.getEbnkUtzpeNo()); // 사용자아이디
						pushSendDto.setTmplMpngCusFnm(member.getMetMbhNm()); //템플릿매핑고객성명

						logger.info("90190263 모임통장.PUSH.알림.발송 SVC UMS pushSendDto::: {}", pushSendDto);
						
						int pushResult = sHRUmsPushSend_COM.pushSend(pushSendDto); // 0성공 9실패
						if (pushResult != 0) {
							//푸쉬알림 실패건 포함 결과 코드
							shareResult = 2;
						}
						logger.info("■ shrUmsPushSend_COM.PushSend(=Push) Result ::: [{}]", pushResult);
					}
				}
				
				output.setScsCnt(shareResult);
			}
		}catch(Exception e){
			logger.error("insertMetPbokPushNtfcSnd 전문 error :: {}", e);
			if ( e instanceof WFApplicationException) {
				WFApplicationException we = (WFApplicationException) e;
				logger.error("WFApplicationException {} ", we);
				
				Object[] args = we.getArguments();
	            
				if(args != null && args.length>0) {
	            	errMsgTxt = args[0].toString();
	            	errMsgId =  args[1].toString();
				} else {
					errMsgTxt = we.getMessage();
					errMsgId = we.getCode();
				}
			} else {
				logger.error("Exception {} ", e);
				errMsgTxt = e.getMessage();
				errMsgId = "9999";
			}
			
			throw new WFApplicationException("FNSE0006", null, new Object[] {errMsgId, errMsgTxt});
		}
		
		return output;
	}
	
}
