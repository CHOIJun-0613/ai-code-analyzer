package com.skbank.sml.fns.inb.svc;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.skbank.sml.afs.shr.com.SHRAFSEvnt_COM;
import com.skbank.sml.afs.shr.com.SHRAFSTeenTeenPush_COM;
import com.skbank.sml.afs.shr.dto.SHRAFSTeenTeenPushSelectTrnPrtsNtfcInf_DIDT;
import com.skbank.sml.afs.shr.dto.SHRAFSTeenTeenPushSelectTrnPrtsNtfcInf_DODT;
import com.skbank.sml.afs.shr.dto.SHRAFSTeenTeenPushUpdateTrnPrtsNtfcInf_DIDT;
import com.skbank.sml.afs.shr.dto.SHRAFSTeenTeenPushUpdateTrnPrtsNtfcInf_DODT;
import com.skbank.sml.afs.shr.dto.UCM_PP_SCHUL_INFO001SelectSchlPushInf_DIDT;
import com.skbank.sml.afs.shr.dto.UCM_PP_SCHUL_INFO001SelectSchlPushInf_DODT;
import com.skbank.sml.afs.shr.dto.UCM_PP_SCHUL_INFO001UpdateSchlPushInf_DIDT;
import com.skbank.sml.bsc.shr.com.SHRRnpeFnmInq_COM;
import com.skbank.sml.bsc.shr.dto.SHRRnpeNmInqInp_DTO;
import com.skbank.sml.bsc.shr.dto.SHRRnpeNmInqOup_DTO;
import com.skbank.sml.cmm.shr.com.SHRAFSTeenTeenSession_COM;
import com.skbank.sml.cmm.shr.com.SHRCMMInterfaceCfg_COM;
import com.skbank.sml.cmm.shr.com.SHRCMMLoginSession_COM;
import com.skbank.sml.cmm.shr.com.SHRCMMMchrSession_COM;
import com.skbank.sml.cmm.shr.com.SHRMMHCustSession_COM;
import com.skbank.sml.cmm.shr.com.SHRMMHEsnsMbhInfInq_S_COM;
import com.skbank.sml.cmm.shr.com.SHRMYDSession_COM;
import com.skbank.sml.cmm.shr.com.SHRSequenceGenerator_COM;
import com.skbank.sml.cmm.shr.dto.AFS_WTT_INFO;
import com.skbank.sml.cmm.shr.dto.CMM_CURRENT_CUST;
import com.skbank.sml.cmm.shr.dto.MMH_CUST_INFO;
import com.skbank.sml.cmm.shr.dto.MYD_MBH_INFO;
import com.skbank.sml.cmm.shr.dto.SHREsnsMbhInfInqIN_DTO;
import com.skbank.sml.cmm.shr.dto.SHREsnsMbhInfInqOUT_DTO;
import com.skbank.sml.fns.inb.cst.cstt.INBCmmConstant;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxPushEtcEstSelectEtcNtfcagrYn_ODT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxPushEtcEstUpdateEtcNtfcAgrYn_IDT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxPushEtcEstUpdateEtcNtfcAgrYn_ODT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxPushEtcEstUpdateMyNtfcDtl_IDT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxPushEtcEstUpdateMyNtfcDtl_ODT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxPushEtcEstSelectMyNtfcDtl_IDT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxPushEtcEstSelectMyNtfcDtl_ODT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxPushEtcEstSelectMyNtfc_ODT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxPushEtcEstUpdateMyNtfc_IDT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxPushEtcEstUpdateMyNtfc_ODT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxPushEtcEstInsertMyNtfc_IDT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxPushEtcEstInsertMyNtfc_ODT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxPushEtcEstDeleteMyNtfc_IDT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxPushEtcEstDeleteMyNtfc_ODT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxPushEtcEstSelectNtfcdpsEst_IDT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxPushEtcEstSelectNtfcdpsEst_ODT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxPushEtcEstUpdatePushNtfcAgrYn_IDT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxPushEtcEstUpdatePushNtfcAgrYn_ODT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxPushEtcEstSelectPushmrktAgrYn_ODT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxPushEtcEstUpdatePushMrktAgrYn_IDT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxPushEtcEstSelectMyNtfcRnpeNm_IDT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxPushEtcEstSelectMyNtfcRnpeNm_ODT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxPushEtcEstSelectSrvcNtfcagrYn_IDT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxPushEtcEstSelectSrvcNtfcagrYn_ODT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxPushEtcEstUpdatePushMrktAgrYn_ODT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxPushEtcEstUpdateSrvcNtfcAgrYn_IDT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxPushEtcEstUpdateSrvcNtfcAgrYn_ODT;
import com.skbank.sml.fns.inb.dbm.UCM_OWN_PUSH_NOTI001_DBM;
import com.skbank.sml.fns.inb.dbm.UCM_SUP_EVT_DTL001_DBM;
import com.skbank.sml.fns.inb.dto.INBMyNtfc_DTO;
import com.skbank.sml.fns.inb.dto.UCM_SUP_EVT_DTL001SelectIvstStgNtfcagrYn_DIDT;
import com.skbank.sml.fns.inb.dto.UCM_SUP_EVT_DTL001SelectIvstStgNtfcagrYn_DODT;
import com.skbank.sml.fns.inb.dto.UCM_SUP_EVT_DTL001DeleteIvstStgNtfcagrYn_DIDT;
import com.skbank.sml.fns.inb.dto.UCM_SUP_EVT_DTL001InsertIvstStgNtfcAgrYn_DIDT;
import com.skbank.sml.fns.shr.com.SHRINBPushBiz_COM;
import com.skbank.sml.fns.shr.com.SHRMPBBiz_COM;
import com.skbank.sml.fns.shr.com.SHRPBPBiz_COM;
import com.skbank.sml.fns.shr.dto.SHRINBPushBscInfOut_DTO;
import com.skbank.sml.fns.shr.dto.SHRINBPushBscInf_DTO;
import com.skbank.sml.fns.shr.dto.SHRMPBBizSelectMPBJnngYn_DIDT;
import com.skbank.sml.fns.shr.dto.SHRMPBBizSelectMPBJnngYn_DODT;
import com.skbank.sml.fns.shr.dto.SHRPBPBizSelectPBPJnngYn_DIDT;
import com.skbank.sml.fns.shr.dto.SHRPBPBizSelectPBPJnngYn_DODT;
import com.skbank.sml.ifi.mca.eims0.dto.IBSMR0004140_IDT;
import com.skbank.sml.ifi.mca.eims0.dto.IBSMR0004140_ODT;
import com.skbank.sml.ifi.mca.eims5.dto.IBSMR0005645_IDT;
import com.skbank.sml.ifi.mca.eims5.dto.IBSMR0005645_ODT;
import com.skbank.sml.ifi.mca.eims6.dto.IBSMR0005356_IDT;
import com.skbank.sml.ifi.mca.eims6.dto.IBSMR0005356_ODT;
import com.skbank.sml.ifi.mca.eims6.dto.IBSMR0005646_IDT;
import com.skbank.sml.ifi.mca.eims7.dto.IBSMR0005497_GRID_ODT;
import com.skbank.sml.ifi.mca.eims7.dto.IBSMR0005497_IDT;
import com.skbank.sml.ifi.mca.eims7.dto.IBSMR0005497_ODT;
import com.skbank.sml.ifi.mca.eims7.dto.IBSMR0005647_IDT;
import com.skbank.sml.ifi.mca.eims9.dto.IBSMR0004139_IDT;
import com.skbank.sml.ifi.mca.eims9.dto.IBSMR0004139_ODT;
import com.skbank.sml.ifi.mca.eims9.dto.IBSMR0005499_IDT;
import com.skbank.sml.ifi.mca.eims9.dto.IBSMR0005499_ODT;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0000914_COM;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0004139_COM;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0004140_COM;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0005356_COM;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0005497_COM;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0005499_COM;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0005645_COM;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0005646_COM;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0005647_COM;
import com.skbank.sml.mmh.shr.com.SHRMMHEsnsMbhAppPushAgrChg_COM;
import com.skbank.sml.mmh.shr.dto.SHREnsMbhAppPushAgrChgIN_DTO;
import com.skbank.sml.mmh.shr.dto.SHREnsMbhAppPushAgrChgOUT_DTO;

import bxm.common.annotaion.BxmCategory;
import fwk.skbank.asis.adaptor.dto.request.WFEmpty_ODT;
import fwk.skbank.asis.adaptor.dto.request.WFInterfaceCfg;
import fwk.skbank.asis.adaptor.dto.response.WFInfResponse;
import fwk.skbank.asis.adaptor.header.request.custom.WFCustomTrnHeader;
import fwk.skbank.online.context.WFApplicationContext;
import fwk.skbank.online.exception.app.WFApplicationException;
import fwk.skbank.online.util.WFStringUtils;

/**
 * 1.업무명 : 금융서비스 2.단위업무명 : NEWWON 중분류 통합알림함 3.프로그램명 : 알림함.PUSH.기타설정.서비스 4.설명 :
 * PUSH 기타 설정 서비스
 * 
 * @Class INBNtfbxPushEtcEst_SVC.java
 * @author 90190264 
 * @since 2024.05.23
 * @version 1.0
 */
@Service
@BxmCategory(logicalName = "알림함.PUSH.기타설정.서비스", description = "PUSH 기타 설정 서비스")
public class INBNtfbxPushEtcEst_SVC {
	private Logger logger = LoggerFactory.getLogger(getClass());

	/**
	 * WFInterfaceCfg 생성 컴포넌트
	 */
	private SHRCMMInterfaceCfg_COM sHRCMMInterfaceCfg_COM;
	/**
	 * SHRCMMLoginSession 생성 컴포넌트
	 */
	private SHRCMMLoginSession_COM shrCMMLoginSession_COM;
	/**
	 * SHRMMHCustSession_COM 생성 컴포넌트
	 */
	private SHRMMHCustSession_COM shrMMHCustSession_COM;
	/**
	 * SHRCMMMchrSession_COM 생성 컴포넌트
	 */
	private SHRCMMMchrSession_COM shrCMMMchrSession_COM;
	/**
	 * SHRMYDSession_COM 생성 컴포넌트
	 */
	private SHRMYDSession_COM shrMYDSession_COM;
	/**
	 * SHRAFSTeenTeenSession_COM 생성 컴포넌트
	 */
	private SHRAFSTeenTeenSession_COM sHRAFSTeenTeenSession_COM;
	/**
	 * SHRIBSMR0001238_COM 공유 공통 컴포넌트
	 */
	private SHRIBSMR0004139_COM sHRIBSMR0004139_COM;
	/**
	 * 스마트뱅킹PUSH사용자정보001.DBM
	 */
	private UCM_OWN_PUSH_NOTI001_DBM ucmOwnPushNoti001_dbm;
	/**
	 * SHRIBSMR0005645_COM 공유 공통 컴포넌트
	 */
	private SHRIBSMR0005645_COM sHRIBSMR0005645_COM;
	/**
	 * 우리플러스지원이벤트상세001.DBM
	 */
	private UCM_SUP_EVT_DTL001_DBM uCM_SUP_EVT_DTL001_DBM;
	/**
	 * SHRIBSMR0005647_COM 공유 공통 컴포넌트
	 */
	private SHRIBSMR0005647_COM sHRIBSMR0005647_COM;
	/**
	 * SHRIBSMR0005646_COM 공유 공통 컴포넌트
	 */
	private SHRIBSMR0005646_COM sHRIBSMR0005646_COM;
	/**
	 * SHRIBSMR0004140_COM 공유 공통 컴포넌트
	 */
	private SHRIBSMR0004140_COM sHRIBSMR0004140_COM;
	/**
	 * SHRIBSMR0005356_COM 공유 공통 컴포넌트
	 */
	private SHRIBSMR0005356_COM sHRIBSMR0005356_COM;
	/**
	 * SHRIBSMR0000914_COM 공유 공통 컴포넌트
	 */
	private SHRIBSMR0000914_COM sHRIBSMR0000914_COM;
	/**
	 * SHRSequenceGenerator_COM 공유 공통 컴포넌트
	 */
	private SHRSequenceGenerator_COM sHRSequenceGenerator_COM;
	/**
	 * SHRRnpeFnmInq_COM 공유 공통 컴포넌트
	 */
	private SHRRnpeFnmInq_COM sHRRnpeFnmInq_COM;
	/**
	 * SHRPBPBiz_COM 공유 공통 컴포넌트
	 */
	private SHRPBPBiz_COM sHRPBPBiz_COM;
	/**
	 * SHRMPBBiz_COM 공유 공통 컴포넌트
	 */
	private SHRMPBBiz_COM sHRMPBBiz_COM;
	/**
	 * WON PLAY SHR COM
	 */
	private SHRAFSEvnt_COM sHRAFSEvnt_COM;
	/**
	 * 우리틴틴 SHR COM
	 */
	private SHRAFSTeenTeenPush_COM sHRAFSTeenTeenPush_COM;
	/**
	 * PUSH설정 SHR COM
	 */
	private SHRINBPushBiz_COM sHRINBPushBiz_COM;
	/**
	 * 간편회원 마케팅 푸시 COM
	 */
	private SHRMMHEsnsMbhAppPushAgrChg_COM sHRMMHEsnsMbhAppPushAgrChg_COM;
	/**
	 * 간편회원 정보 조회 COM
	 */
	private SHRMMHEsnsMbhInfInq_S_COM sHRMMHEsnsMbhInfInq_S_COM;
	/**
	 * SHRIBSMR0005497_COM COM
	 */
	private SHRIBSMR0005497_COM sHRIBSMR0005497_COM;
	/**
	 * SHRIBSMR0005499_COM COM
	 */
	private SHRIBSMR0005499_COM sHRIBSMR0005499_COM;

	/**
	 * 알림 수신설정 검증 조회
	 * 
	 * @param input
	 *            won.알림가입여부.컨트롤러.입력.IO
	 * @return 알림.수신설정.컨트롤러.출력.IO 
	 */
	@BxmCategory(logicalName = "알림.수신설정.조회", description = "알림 수신설정 검증 조회", author = "90190264")
	public INBNtfbxPushEtcEstSelectNtfcdpsEst_ODT selectNtfcdpsEst(INBNtfbxPushEtcEstSelectNtfcdpsEst_IDT input) {

		/**
		 * @BXMType GetBean
		 */
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		sHRINBPushBiz_COM= WFApplicationContext.getBean(sHRINBPushBiz_COM, SHRINBPushBiz_COM.class);

		/**
		 * @BXMType VariableDeclaration
		 */
		INBNtfbxPushEtcEstSelectNtfcdpsEst_ODT output = new INBNtfbxPushEtcEstSelectNtfcdpsEst_ODT();
		// 세션고객정보
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession();
		
		// 화면에서 넘어 온 토큰 빈값 체크
		if (WFStringUtils.isEmpty(input.getMchrUnqInfId())) {
			output.setRtcd("9999");
			output.setRtcdTxt("토큰이 조회되지 않습니다.");

			return output;
		}

		if (WFStringUtils.isEmpty(currentCust.getItcsno())) {
			if (logger.isDebugEnabled()) {
				logger.debug("알림.수신설정.조회 currentCust is null ::: ");
			}
		} else {
			try {
				/*
				 * @BXMType DBM
				 * 통합.알림함001.DBM PUSH.동의여부.조회
				 */
				SHRINBPushBscInf_DTO shrInput = new SHRINBPushBscInf_DTO();
				shrInput.setMchrUnqInfId(input.getMchrUnqInfId());				 				// 기기 토큰(레지스트리키)
				shrInput.setMblMchrAppVerTxt(input.getMblMchrAppVerTxt());					// 모바일기기앱버전내용
				shrInput.setMblMchrMdlNm(input.getMblMchrMdlNm());							// 모바일기기모델명
				shrInput.setMblMchrSftrVerTxt(input.getMblMchrSftrVerTxt());					// 모바일소프트웨어버전
				
				SHRINBPushBscInf_DTO dodt = sHRINBPushBiz_COM.selectPushBscInf(shrInput);
				
				if(dodt != null) {
					String frontMchrUnqInfId = input.getMchrUnqInfId();		// 화면에서 넘어온 push token
					String dbMchrUnqInfId = dodt.getMchrUnqInfId();			// db에 저장된 push token
					String pushAgrYn = dodt.getPushAgrYn();						// push 동의 여부
					
					output.setPushAgrYn(pushAgrYn);
					output.setRtcd(dodt.getRsltCd());
					output.setMchrUnqInfId(dodt.getMchrUnqInfId());
					output.setAplDscdYn(WFStringUtils.isEmpty(dodt.getAplDscd()) ? "Y" : "N");
					
					
					// 기기 체크
					if (frontMchrUnqInfId.equals(dbMchrUnqInfId) && "T".equals(pushAgrYn)) {
						output.setMchrUnqInfId("1");; 					// 푸시동의여부가 true이면 현재 기기
					} else if (frontMchrUnqInfId.equals(dbMchrUnqInfId) && ("F".equals(pushAgrYn) || WFStringUtils.isEmpty(pushAgrYn))) {
						output.setMchrUnqInfId("2"); 						// 푸시동의여부가 false(해지)이거나 빈값(삭제)인 경우 미지정기기
					} else if (WFStringUtils.isEmpty(dbMchrUnqInfId)) {
						output.setMchrUnqInfId("2"); 						// 값이 없으면 미지정기기
					} else if (!frontMchrUnqInfId.equals(dbMchrUnqInfId)) {
						output.setMchrUnqInfId("3"); 						// 값이 다르면 다른기기 사용 중
					}
				} else {
					// FNSI0002 : 푸시 정보가 등록되어 있지 않습니다.
					throw new WFApplicationException("FNSI0002");
				}
			} catch (WFApplicationException e) {
				logger.error("WFApplicationException error :: {}", e);
				output.setRtcd(e.getCode());
			}
		}

		return output;
	}

	/**
	 * PUSH 마케팅 동의 여부 조회
	 * 
	 * @param input 
	 *            PUSH.마케팅동의여부.컨트롤러.입력.IO 
	 * @return PUSH.마케팅동의여부.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName = "PUSH.마케팅동의여부.조회", description = "PUSH 마케팅 동의 여부 조회", author = "90190264")
	public INBNtfbxPushEtcEstSelectPushmrktAgrYn_ODT selectPushmrktAgrYn() {

		/**
		 * @BXMType GetBean
		 */
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class);
		sHRIBSMR0004139_COM = WFApplicationContext.getBean(sHRIBSMR0004139_COM, SHRIBSMR0004139_COM.class);
		sHRMMHEsnsMbhInfInq_S_COM = WFApplicationContext.getBean(sHRMMHEsnsMbhInfInq_S_COM, SHRMMHEsnsMbhInfInq_S_COM.class);

		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession();
		/**
		 * @BXMType VariableDeclaration
		 */
		INBNtfbxPushEtcEstSelectPushmrktAgrYn_ODT output = new INBNtfbxPushEtcEstSelectPushmrktAgrYn_ODT();

		// 로그인 체크
		if (shrCMMLoginSession_COM.istLogin()) {
			/**
			 * @BXMType Try 마케팅 동의 여부 전문 호출
			 */
			try {
				// 간편회원/금융회원 구분
				if(shrCMMLoginSession_COM.isEsnsMbh()) {
					SHREsnsMbhInfInqIN_DTO esnsMbhInfInqINDto = new SHREsnsMbhInfInqIN_DTO();
					esnsMbhInfInqINDto.setCusCiNo(currentCust.getCusCiNo());
					
					SHREsnsMbhInfInqOUT_DTO esnsMbhInfInqOUTDto = sHRMMHEsnsMbhInfInq_S_COM.selectEsnsMbhInfInq(esnsMbhInfInqINDto);
					
//					output.setRtcd("MPUSH0000");
					output.setMrktAgrYn(esnsMbhInfInqOUTDto.getAppPushMrktAgrYn());
				} else {
					// ===================================================================
					// *********************** 1.IBSMR0001238(SMS입출금통지등록내역조회) 인터페이스 호출 셋팅 ****************************************
					// ===================================================================
					// MCA WFInterfaceCfg 객체 획득
					WFInterfaceCfg interfaceCfg = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg();
					interfaceCfg.setInterfaceId("IBSMR0004139");
					
					// WFCustomTrnHeader 셋팅
					WFCustomTrnHeader wfCusTrnHeader = new WFCustomTrnHeader();
					wfCusTrnHeader.setFuncCd("20"); // 거래코드 조회:20 / 등록:30 / 변경:40 / 해지:50
					
					// interfaceCfg 셋팅
					interfaceCfg.setCustomTrnHeader(wfCusTrnHeader);
					
					IBSMR0004139_IDT ibsmr4139Idt = new IBSMR0004139_IDT();
					
					ibsmr4139Idt.setPrcDscd("1"); // 1: 조회, 2: 등록
					ibsmr4139Idt.setAppDscd("06");
					ibsmr4139Idt.setItcsno(currentCust.getItcsno());
					// ibsmr4139Idt.setMrktAgrYn(input.getMrktAgrYn());
					
					WFInfResponse<IBSMR0004139_ODT> mcaOutput = sHRIBSMR0004139_COM.callTrx(ibsmr4139Idt, interfaceCfg);
					
					if (!mcaOutput.hasError()) {
						IBSMR0004139_ODT ibsmr4139odt = mcaOutput.getResponseData();
						// PUSH마케팅 동의여부 빈값 확인
						if (WFStringUtils.isEmpty(ibsmr4139odt.getMrktAgrYn())) {
							output.setRtcd("E905");
							output.setRtcdTxt("마케팅 동의여부 값이 확인 되지않습니다.");
							
							return output;
						}
						output.setRtcd("MPUSH0000");
						output.setMrktAgrYn(ibsmr4139odt.getMrktAgrYn());
					}
				}
			} catch (WFApplicationException e) {
				logger.error("WFApplicationException error :: {}", e);
				output.setRtcd("E906");
				output.setRtcdTxt("사용자 푸시 마케팅동의여부 조회시 에러가 발생하였습니다.");
			}
		} else {
			//  로그인 세션이 존재하지 않습니다.
			throw new WFApplicationException("CMME0018");
		}

		return output;

	}

	/**
	 * PUSH 서비스 알림 동의 여부 조회
	 * 
	 * @param input
	 *            서비스알림.동의여부.컨트롤러.입력.IO
	 * @return 서비스알림.동의여부.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName = "서비스알림.동의여부.조회", description = "PUSH 서비스 알림 동의 여부 조회", author = "90190264")
	public INBNtfbxPushEtcEstSelectSrvcNtfcagrYn_ODT selectSrvcNtfcagrYn(INBNtfbxPushEtcEstSelectSrvcNtfcagrYn_IDT input) {

		/**
		 * @BXMType GetBean
		 */
		shrMYDSession_COM = WFApplicationContext.getBean(shrMYDSession_COM, SHRMYDSession_COM.class);
		sHRAFSTeenTeenSession_COM = WFApplicationContext.getBean(sHRAFSTeenTeenSession_COM, SHRAFSTeenTeenSession_COM.class);
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class);
		shrMMHCustSession_COM = WFApplicationContext.getBean(shrMMHCustSession_COM, SHRMMHCustSession_COM.class);

		sHRIBSMR0005356_COM = WFApplicationContext.getBean(sHRIBSMR0005356_COM, SHRIBSMR0005356_COM.class);
		sHRIBSMR0000914_COM = WFApplicationContext.getBean(sHRIBSMR0000914_COM, SHRIBSMR0000914_COM.class);
		sHRMPBBiz_COM = WFApplicationContext.getBean(sHRMPBBiz_COM, SHRMPBBiz_COM.class);
		sHRPBPBiz_COM = WFApplicationContext.getBean(sHRPBPBiz_COM, SHRPBPBiz_COM.class);
		sHRAFSEvnt_COM = WFApplicationContext.getBean(sHRAFSEvnt_COM, SHRAFSEvnt_COM.class);
		sHRAFSTeenTeenPush_COM = WFApplicationContext.getBean(sHRAFSTeenTeenPush_COM, SHRAFSTeenTeenPush_COM.class);

		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession();

		MMH_CUST_INFO custInfo = shrMMHCustSession_COM.getCustInfoSession();
		/**
		 * @BXMType IF 로그인체크
		 */
		if (custInfo == null || "".equals(custInfo.getCusCiNo())) {
			// FNSE0010 : 고객 정보가 존재하지 않습니다.
			throw new WFApplicationException("FNSE0010");
		}

		String cusCiNo = custInfo.getCusCiNo();	// 고객CI번호

		/**
		 * @BXMType VariableDeclaration
		 */
		INBNtfbxPushEtcEstSelectSrvcNtfcagrYn_ODT output = new INBNtfbxPushEtcEstSelectSrvcNtfcagrYn_ODT();
		output.setPushSrvcNtfcId(input.getPushSrvcNtfcId());

		if (shrCMMLoginSession_COM.istLogin()) {
			// 간편회원/금융회원 조회 서비스 구분
			if (!"Y".equals(currentCust.getSpCusYn())) {		// 금융회원일때
				/*
				 * 각 서비스 가입여부마다 try~catch를 묶어서 exception이 발생해도 화면으로 리턴 가능하게 만든다.
				 * Exception이 발생하면 해당 서비스 가입여부를 빈값으로 return 한다.
				 */
				/**
				 * 마이데이터 가입여부 확인
				 */
				if(INBCmmConstant.PUSH_SRVC_MYD.equals(input.getPushSrvcNtfcId())) {
					try {
						MYD_MBH_INFO mydMbhInfo = shrMYDSession_COM.getMYDMbhInfoSession();
						
						output.setMydtMbhJnngYn("Y".equals(mydMbhInfo.getMydtCusYn()) ? "Y" : "N");
					} catch (WFApplicationException e) {
						logger.error("===== 마이데이터 WFApplicationException error :: {}", e);
						output.setMydtMbhJnngYn("");
					}
				}
				// 마이데이터 가입여부 확인 종료

				/**
				 * 국민비서 가입여부 확인
				 */
				if(INBCmmConstant.PUSH_SRVC_NAT.equals(input.getPushSrvcNtfcId())) {
					try {
						if (!WFStringUtils.isEmpty(cusCiNo)) {
							// ===================================================================
							// *********************** 1.IBSMR0005356(국민비서 이용자신청정보조회) 인터페이스 호출 셋팅 ****************************************
							// ===================================================================
							WFInterfaceCfg interfaceCfg = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg();
							interfaceCfg.setInterfaceId("IBSMR0005356");
							
							IBSMR0005356_IDT ibsmr5356Idt = new IBSMR0005356_IDT();
							
							ibsmr5356Idt.setCiNo(cusCiNo);
							
							WFInfResponse<IBSMR0005356_ODT> mcaOutput5356 = sHRIBSMR0005356_COM.callTrx(ibsmr5356Idt, interfaceCfg);
							
							if (!mcaOutput5356.hasError()) {
								String jnngYn = mcaOutput5356.getResponseData().getJnngYn(); 						// 가입여부
								String jnngChnlCd = mcaOutput5356.getResponseData().getJnngChnlCd(); 				// 가입채널코드
								// 타은행 가입자의 경우 미가입 상태로 변경
								if ("Y".equals(jnngYn) && !jnngChnlCd.contains("skbank")) {
									output.setNatScrrJnngYn("N");
								} else {
									output.setNatScrrJnngYn("Y".equals(jnngYn) ? jnngYn : "N");
									/**
									 * 국민비서 가입자인 경우 국민비서 동의여부 알림 조회
									 * */
									sHRIBSMR0005497_COM = WFApplicationContext.getBean(sHRIBSMR0005497_COM, SHRIBSMR0005497_COM.class);
									
									// CI서비스 PUSH정보 조회(국민비서 동의 여부)
									interfaceCfg.setInterfaceId("IBSMR0005497");
									
									IBSMR0005497_IDT ibsmr5497Idt = new IBSMR0005497_IDT();
									
									ibsmr5497Idt.setCusCiNo(cusCiNo);
									ibsmr5497Idt.setPushNtcBizDscd("01");							// PUSH 통지업무구분코드 (01: 국민비서)
									
									WFInfResponse<IBSMR0005497_ODT> mcaOutput5497 = sHRIBSMR0005497_COM.callTrx(ibsmr5497Idt, interfaceCfg);
									
									if(!mcaOutput5497.hasError()) {
										IBSMR0005497_ODT ibsmr5497Odt = mcaOutput5497.getResponseData();
										
										for(IBSMR0005497_GRID_ODT grid : ibsmr5497Odt.getGrid()) {
											String CTR_STCD = grid.getCtrStcd();			
											
											// 국민비서 알림 동의여부 : '10' -> Y , '90' -> N
											if ("10".equals(CTR_STCD)){
							            		output.setNatScrrNtfcAgrYn("Y");
							            	} else {
							            		output.setNatScrrNtfcAgrYn("N");	            		 
							            	}	
										}
									}
								}
							}
						}
					} catch (WFApplicationException e) {
						logger.error("===== 국민비서 WFApplicationException error :: {}",e);
						output.setNatScrrJnngYn("");
						output.setNatScrrNtfcAgrYn("");	       
					}
				}
				// 국민비서 가입여부 확인 종료

				/**
				 * 모임통장 가입여부 확인
				 */
				if(INBCmmConstant.PUSH_SRVC_MPB.equals(input.getPushSrvcNtfcId())) {
					try {
						SHRMPBBizSelectMPBJnngYn_DIDT shrMpbPbpJnngYnDidt = new SHRMPBBizSelectMPBJnngYn_DIDT();
						shrMpbPbpJnngYnDidt.setItcsno(currentCust.getItcsno());
						
						SHRMPBBizSelectMPBJnngYn_DODT shrMpbJnngYnDodt = sHRMPBBiz_COM.selectMPBJnngYn(shrMpbPbpJnngYnDidt);
						
						output.setMetPbokJnngYn(shrMpbJnngYnDodt.getMetPbokJnngYn());
					} catch (WFApplicationException e) {
						logger.error("===== 모임통장 WFApplicationException error :: {}",e);
						output.setMetPbokJnngYn("");
						output.setPbokSprnJnngYn("");
					}
				}
				// 모임통장 가입여부 확인 종료
				
				/**
				 * 통장쪼개기 가입여부 확인
				 */
				if(INBCmmConstant.PUSH_SRVC_PBP.equals(input.getPushSrvcNtfcId())) {
					try {
						SHRPBPBizSelectPBPJnngYn_DIDT shrPbpJnngYnDidt = new SHRPBPBizSelectPBPJnngYn_DIDT();
						shrPbpJnngYnDidt.setItcsno(currentCust.getItcsno());
						
						SHRPBPBizSelectPBPJnngYn_DODT shrPbpJnngYnDodt = sHRPBPBiz_COM.selectPBPJnngYn(shrPbpJnngYnDidt);
						
						output.setPbokSprnJnngYn(shrPbpJnngYnDodt.getPbokSplitJnngYn());
					} catch (WFApplicationException e) {
						logger.error("===== 모임&통장쪼개기 WFApplicationException error :: {}",e);
						output.setMetPbokJnngYn("");
						output.setPbokSprnJnngYn("");
					}
				}
				// 통장쪼개기 가입여부 확인 종료
			}
			
			/**
			 * WON PLAY 알림 동의여부 확인
			 */
			if(INBCmmConstant.PUSH_SRVC_WON.equals(input.getPushSrvcNtfcId())) {
				try {
					String ntfcAgrSts = sHRAFSEvnt_COM.selectWonplayNtfcAgrSts(cusCiNo);
					
					output.setWonPlayNtfcAgrYn(ntfcAgrSts);
				} catch (WFApplicationException e) {
					logger.error("===== WON PLAY 알림 WFApplicationException error :: {}",e);
					output.setWonPlayNtfcAgrYn("");
				}
			}

			/**
			 * 우리틴틴 가입여부 확인
			 */
			if(INBCmmConstant.PUSH_SRVC_TEEN.equals(input.getPushSrvcNtfcId())) {
				try {
					AFS_WTT_INFO wttInfo = sHRAFSTeenTeenSession_COM.getWttInfoSession(); // 틴틴 고객정보 세션 조회
					output.setWttJnngYn("Y".equals(wttInfo.getWttCusYn()) ? "Y" : "N"); // 틴틴 고객여부 (Y/N)
					// 우리틴틴 가입여부 확인 종료
					
					// 우리틴틴 가입되어있으면 거래내역, 오늘의급식 알림 동의여부 조회한다.
					if ("Y".equals(wttInfo.getWttCusYn())) {
						// 틴틴 거래내역 SHR 호출
						SHRAFSTeenTeenPushSelectTrnPrtsNtfcInf_DIDT teenTrnShrInDto = new SHRAFSTeenTeenPushSelectTrnPrtsNtfcInf_DIDT();
						teenTrnShrInDto.setMchrUnqInfId(input.getMchrUnqInfId());					// 기기정보ID(레지스트리키 or 토큰)
						teenTrnShrInDto.setMblMchrSftrVerTxt(input.getMblMchrSftrVerTxt());		// 모바일기기소프트웨어버전내용
						teenTrnShrInDto.setMblMchrAppVerTxt(input.getMblMchrAppVerTxt());		// 모바일기기앱버전내용
						teenTrnShrInDto.setMblMchrMdlNm(input.getMblMchrMdlNm());					// 모바일기기모델명
						
						SHRAFSTeenTeenPushSelectTrnPrtsNtfcInf_DODT teenTrnShrOutDto = sHRAFSTeenTeenPush_COM.selectTrnPrtsNtfcInf(teenTrnShrInDto);
						
						output.setTrnPrtsNtfcAgrYn(teenTrnShrOutDto.getRawPushSndYn()); 				// 틴틴 거래내역 알림 동의여부
						
						// 틴틴 오늘의급식 SHR 호출
						UCM_PP_SCHUL_INFO001SelectSchlPushInf_DIDT teenSchlShrInDto = new UCM_PP_SCHUL_INFO001SelectSchlPushInf_DIDT();
						teenSchlShrInDto.setCusCiNo(cusCiNo);														// 고객CI번호
						
						UCM_PP_SCHUL_INFO001SelectSchlPushInf_DODT teenSchlShrOutDto = sHRAFSTeenTeenPush_COM.selectSchlPushInf(teenSchlShrInDto);
						
						output.setTdPvmNtfcAgrYn(teenSchlShrOutDto.getAlarmYn()); 						// 틴틴 오늘의급식 알림 동의여부
						
					}
				} catch (WFApplicationException e) {
					logger.error("===== 우리틴틴 WFApplicationException error :: {}",e);
					output.setTrnPrtsNtfcAgrYn("");
				}
			}
		} else {
			if (logger.isDebugEnabled()) {
				logger.debug("서비스알림.동의여부.조회 currentCust is null ::: ");
			}
		}

		return output;

	}

	/**
	 * PUSH 기타 알림 동의 여부 조회
	 * 
	 * @param input
	 *            기타알림.동의여부.컨트롤러.입력.IO
	 * @return 기타알림.동의여부.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName = "기타알림.동의여부.조회", description = "PUSH 기타 알림 동의 여부 조회", author = "90190264")
	public INBNtfbxPushEtcEstSelectEtcNtfcagrYn_ODT selectEtcNtfcagrYn() {

		/**
		 * @BXMType GetBean
		 */
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class);
		sHRIBSMR0005645_COM = WFApplicationContext.getBean(sHRIBSMR0005645_COM, SHRIBSMR0005645_COM.class);
		uCM_SUP_EVT_DTL001_DBM = WFApplicationContext.getBean(uCM_SUP_EVT_DTL001_DBM, UCM_SUP_EVT_DTL001_DBM.class);

		/**
		 * @BXMType VariableDeclaration
		 */
		INBNtfbxPushEtcEstSelectEtcNtfcagrYn_ODT output = new INBNtfbxPushEtcEstSelectEtcNtfcagrYn_ODT();

		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession();

		// 통고번호체크
		if (!WFStringUtils.isEmpty(currentCust.getItcsno())) {
			try {
				// ===================================================================
				// *********************** 1.IBSMR0005645(PUSH기타알림서비스조회(입출금분리))
				// 인터페이스 호출 셋팅 ****************************************
				// ===================================================================
				// MCA WFInterfaceCfg 객체 획득
				WFInterfaceCfg interfaceCfg = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg();
				interfaceCfg.setInterfaceId("IBSMR0005645");

				// 3. WFCustomTrnHeader 셋팅
				WFCustomTrnHeader wfCusTrnHeader = new WFCustomTrnHeader();
				wfCusTrnHeader.setFuncCd("20"); // 거래코드 조회:20 / 등록:30 / 변경:40 / 해지:50

				interfaceCfg.setCustomTrnHeader(wfCusTrnHeader);

				IBSMR0005645_IDT ibsmr5645Idt = new IBSMR0005645_IDT();

				ibsmr5645Idt.setEbnkUtzpeNo(currentCust.getUserId()); // 사용자ID
				ibsmr5645Idt.setItcsno(currentCust.getItcsno()); // 통합고객번호
				
				WFInfResponse<IBSMR0005645_ODT> mcaOutput = sHRIBSMR0005645_COM
						.callTrx(ibsmr5645Idt, interfaceCfg);

				if (!mcaOutput.hasError()) {
					IBSMR0005645_ODT ibsmr5645odt = mcaOutput.getResponseData();
					
					output.setXrtNtcSrvcYn(ibsmr5645odt.getXrtNtcSrvcYn()); 						// 환율통지서비스여부
					output.setDgnNtfcSrvcYn(ibsmr5645odt.getDgnNtfcSrvcYn()); 					// 지정알림서비스여부
					output.setUseYn1(ibsmr5645odt.getUseYn1()); 										// 사용여부_1
					output.setUseYn2(ibsmr5645odt.getUseYn2()); 										// 사용여부_2
					output.setUseYn3(ibsmr5645odt.getUseYn3()); 										// 사용여부_3
					output.setUseYn4(ibsmr5645odt.getUseYn4()); 										// 사용여부_4
					output.setUseYn5(ibsmr5645odt.getUseYn5()); 										// 사용여부_5
					output.setUseYn6(ibsmr5645odt.getUseYn6()); 										// 사용여부_6
					output.setUsgYn99(ibsmr5645odt.getUsgYn99()); 									// 사용여부_99
					output.setPushEtcNtfcRgsYn(ibsmr5645odt.getPushEtcNtfcRgsYn()); 		// PUSH기타알림등록여부
					output.setPushAppDscd(ibsmr5645odt.getPushAppDscd()); 						// PUSH앱구분코드
					
				}

			} catch (WFApplicationException e) {
				logger.error("===== IBSMR0005645 WFApplicationException error :: {}",e);
			} catch (Exception e) {
				logger.error("===== IBSMR0005645 Exception error :: {}", e);
			}

			try { 
				UCM_SUP_EVT_DTL001SelectIvstStgNtfcagrYn_DIDT ivstStgAgrYnDidt = new UCM_SUP_EVT_DTL001SelectIvstStgNtfcagrYn_DIDT();
				ivstStgAgrYnDidt.setNgItgCsno(currentCust.getItcsno());

				// 아홉시브리핑 조회
				ivstStgAgrYnDidt.setEvtDis(8);
				UCM_SUP_EVT_DTL001SelectIvstStgNtfcagrYn_DODT ivstStgAgrYnDodt = uCM_SUP_EVT_DTL001_DBM.selectIvstStgNtfcagrYn(ivstStgAgrYnDidt);
				
				output.setTim9brfAgrYn(ivstStgAgrYnDodt.getSbscCnt() == 0 ? "N" : "Y");
			} catch (WFApplicationException e) {
				logger.error("===== selectIvstStgNtfcagrYn WFApplicationException error :: {}", e);
			} catch (Exception e) {
				logger.error("===== selectIvstStgNtfcagrYn Exception error :: {}", e);
			}
		}

		return output;

	}

	/**
	 * PUSH 알림 동의 여부 수정 서비스 
	 * 
	 * @param input
	 *            PUSH.동의여부.컨트롤러.입력.IO
	 * @return PUSH.동의여부.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName = "PUSH.알림.동의여부.수정", description = "PUSH 알림 동의 여부 수정 서비스", author = "90190264")
	public INBNtfbxPushEtcEstUpdatePushNtfcAgrYn_ODT updatePushNtfcAgrYn(INBNtfbxPushEtcEstUpdatePushNtfcAgrYn_IDT input) throws WFApplicationException{

		/**
		 * @BXMType GetBean
		 */
		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class);
		shrCMMMchrSession_COM = WFApplicationContext.getBean(shrCMMMchrSession_COM, SHRCMMMchrSession_COM.class);
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		sHRIBSMR0005647_COM = WFApplicationContext.getBean(sHRIBSMR0005647_COM, SHRIBSMR0005647_COM.class);
		sHRIBSMR0005645_COM = WFApplicationContext.getBean(sHRIBSMR0005645_COM, SHRIBSMR0005645_COM.class);
		sHRINBPushBiz_COM= WFApplicationContext.getBean(sHRINBPushBiz_COM, SHRINBPushBiz_COM.class);

		/**
		 * @BXMType VariableDeclaration
		 */
		INBNtfbxPushEtcEstUpdatePushNtfcAgrYn_ODT rspRslt = new INBNtfbxPushEtcEstUpdatePushNtfcAgrYn_ODT();
		// 세션고객정보
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession();
		String userId = currentCust.getUserId();
		

		// 화면에서 넘어 온 토큰 빈값 체크
		if (WFStringUtils.isEmpty(input.getMchrUnqInfId())) {
			rspRslt.setRtcd("9999");
			rspRslt.setRtcdTxt("토큰이 조회되지 않습니다.");

			return rspRslt;
		}

		/**
		 * @BXMType Try 푸시서비스동의여부 등록/수정
		 */
		try {
			SHRINBPushBscInf_DTO shrInput = new SHRINBPushBscInf_DTO();
			shrInput.setPushAgrYn(input.getPushAgrYn());										// push 동의여부
			shrInput.setMchrUnqInfId(input.getMchrUnqInfId());				 				// 기기 토큰(레지스트리키)
			shrInput.setMblMchrAppVerTxt(input.getMblMchrAppVerTxt());					// 모바일기기앱버전내용
			shrInput.setMblMchrMdlNm(input.getMblMchrMdlNm());							// 모바일기기모델명
			shrInput.setMblMchrSftrVerTxt(input.getMblMchrSftrVerTxt());					// 모바일소프트웨어버전
			shrInput.setSmtphOsTpNm(input.getSmtphOsTpNm());							// 스마트폰OS타입명
			
			SHRINBPushBscInfOut_DTO dodt = sHRINBPushBiz_COM.updatePushAgrYn(shrInput);
			
			if(dodt != null) {
				rspRslt.setRtcd(dodt.getRsltCd());
				
				SHRINBPushBscInf_DTO pushBscInfDto = sHRINBPushBiz_COM.selectPushBscInf(shrInput);
				String frontMchrUnqInfId = input.getMchrUnqInfId();		// 화면에서 넘어온 push token
				String dbMchrUnqInfId = pushBscInfDto.getMchrUnqInfId();			// db에 저장된 push token
				String pushAgrYn = pushBscInfDto.getPushAgrYn();						// push 동의 여부
				
				rspRslt.setAplDscdYn(WFStringUtils.isEmpty(pushBscInfDto.getAplDscd()) ? "Y" : "N");					// 비로그인
				rspRslt.setPushAgrYn(pushAgrYn);											// PUSH 동의여부 값 세팅
				rspRslt.setMchrUnqInfId(pushBscInfDto.getMchrUnqInfId());			// 기기 토큰값
				
				// 기기 체크
				if (frontMchrUnqInfId.equals(dbMchrUnqInfId) && "T".equals(pushAgrYn)) {
					rspRslt.setMchrUnqInfId("1");; 					// 푸시동의여부가 true이면 현재 기기
				} else if (frontMchrUnqInfId.equals(dbMchrUnqInfId) && ("F".equals(pushAgrYn) || WFStringUtils.isEmpty(pushAgrYn))) {
					rspRslt.setMchrUnqInfId("2"); 						// 푸시동의여부가 false(해지)이거나 빈값(삭제)인 경우 미지정기기
				} else if (WFStringUtils.isEmpty(dbMchrUnqInfId)) {
					rspRslt.setMchrUnqInfId("2"); 						// 값이 없으면 미지정기기
				} else if (!frontMchrUnqInfId.equals(dbMchrUnqInfId)) {
					rspRslt.setMchrUnqInfId("3"); 						// 값이 다르면 다른기기 사용 중
				}
			}

			// push동의여부가 false일때
			if ("F".equals(input.getPushAgrYn())) {
				// ===================================================================
				// *********************** 1.IBSMR0005647(PUSH기타알림수신앱 등록(입출금분리)) 인터페이스 호출 셋팅 ****************************************
				// ===================================================================
				// MCA WFInterfaceCfg 객체 획득
				WFInterfaceCfg interfaceCfg = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg();
				interfaceCfg.setInterfaceId("IBSMR0005647");

				// WFCustomTrnHeader 셋팅
				WFCustomTrnHeader wfCusTrnHeader = new WFCustomTrnHeader();
				wfCusTrnHeader.setFuncCd("20"); // 거래코드 조회:20 / 등록:30 / 변경:40 /// 해지:50
				// wfCusTrnHeader.setTrnCd("ECLLDA302");

				// interfaceCfg 셋팅
				interfaceCfg.setCustomTrnHeader(wfCusTrnHeader);

				IBSMR0005647_IDT ibsmr5647Idt = new IBSMR0005647_IDT();

				ibsmr5647Idt.setEbnkUtzpeNo(currentCust.getUserId()); 									// 사용자ID
				ibsmr5647Idt.setItcsno(currentCust.getItcsno()); 											// 통합고객번호
				ibsmr5647Idt.setPushAppDscd(INBCmmConstant.APP_DSCD); 							// 06 : WON뱅킹

				WFInfResponse<WFEmpty_ODT> mcaOutput5647 = sHRIBSMR0005647_COM.callTrx(ibsmr5647Idt, interfaceCfg);

			}
		} catch (WFApplicationException e) {
			throw e;
		}

		return rspRslt;
	}

	/**
	 * PUSH 마케팅 동의 수정
	 * 
	 * @param input
	 *            PUSH.마케팅동의여부.컨트롤러.입력.IO
	 * @return PUSH.마케팅동의여부.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName = "PUSH.마케팅동의여부.수정", description = "PUSH 마케팅 동의 수정", author = "90190264")
	public INBNtfbxPushEtcEstUpdatePushMrktAgrYn_ODT updatePushMrktAgrYn(INBNtfbxPushEtcEstUpdatePushMrktAgrYn_IDT input) {

		/**
		 * @BXMType GetBean
		 */
		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class);
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		sHRIBSMR0004140_COM = WFApplicationContext.getBean(sHRIBSMR0004140_COM, SHRIBSMR0004140_COM.class);
		sHRMMHEsnsMbhAppPushAgrChg_COM = WFApplicationContext.getBean(sHRMMHEsnsMbhAppPushAgrChg_COM, SHRMMHEsnsMbhAppPushAgrChg_COM.class);

		/**
		 * @BXMType VariableDeclaration
		 */
		INBNtfbxPushEtcEstUpdatePushMrktAgrYn_ODT output = new INBNtfbxPushEtcEstUpdatePushMrktAgrYn_ODT();

		/**
		 * @BXMType IF 세션 값 확인
		 */
		// 세션고객정보
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession();

		// 로그인 체크
		if (shrCMMLoginSession_COM.istLogin()) {
			try {
				// 간편회원/금융회원 구분
				if(shrCMMLoginSession_COM.isEsnsMbh()) {
					SHREnsMbhAppPushAgrChgIN_DTO ensMbhAppPushAgrChgIN_DTO = new SHREnsMbhAppPushAgrChgIN_DTO();
					ensMbhAppPushAgrChgIN_DTO.setAppPushAgrYn(input.getMrktAgrYn());
					
					SHREnsMbhAppPushAgrChgOUT_DTO ensMbhAppPushAgrChgOut_DTO = sHRMMHEsnsMbhAppPushAgrChg_COM.updateEsnsMbhmrktAgr(ensMbhAppPushAgrChgIN_DTO);
					
					if("0000".equals(ensMbhAppPushAgrChgOut_DTO.getRtcd())) {
						output.setMrktAgrYn(input.getMrktAgrYn());
						output.setRtcd("MPUSH0000");
						output.setRtcd("마케팅 동의여부를 수정 하였습니다.");
					}
				} else {
					// ===================================================================
					// *********************** 1.IBSMR0004140(PUSH 마케팅 동의 생성갱신 ) 인터페이스 호출 셋팅 ****************************************
					// ===================================================================
					// MCA WFInterfaceCfg 객체 획득
					WFInterfaceCfg interfaceCfg = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg();
					interfaceCfg.setInterfaceId("IBSMR0004140");
					
					IBSMR0004140_IDT ibsmr4140Idt = new IBSMR0004140_IDT();
					
					String itcsno = "";
					// 간편회원 여부
					if(shrCMMLoginSession_COM.isEsnsMbh()) {
						itcsno = currentCust.getEsnsMbhNo();														// 간편회원 ID
					} else {
						itcsno = currentCust.getItcsno();													// 통합고객번호
					}
					
					ibsmr4140Idt.setPrcDscd("2"); 																		// 2 : 수정, 1: 조회
					ibsmr4140Idt.setAppDscd(INBCmmConstant.APP_DSCD); 									// 앱구분코드 : 06
					ibsmr4140Idt.setItcsno(itcsno); 																		// 통합고객번호
					ibsmr4140Idt.setMrktAgrYn(input.getMrktAgrYn()); 											// push 마케팅 동의 여부
					
					WFInfResponse<IBSMR0004140_ODT> mcaOutput4140 = sHRIBSMR0004140_COM.callTrx(ibsmr4140Idt, interfaceCfg);
					
					if (mcaOutput4140.hasError()) {
						output.setRtcd("E905");
						output.setRtcdTxt("마케팅 동의여부 값이 확인 되지않습니다.");
					} else {
						output.setMrktAgrYn(mcaOutput4140.getResponseData().getMrktAgrYn());
						output.setRtcd("MPUSH0000");
						output.setRtcd("마케팅 동의여부를 수정 하였습니다.");
					}
				}
			} catch (WFApplicationException e) {
				logger.error("WFApplicationException error :: {}", e);
				output.setRtcd("E906");
				output.setRtcdTxt("사용자 푸시 마케팅동의여부 변경시 에러가 발생하였습니다.");
			}
		} else {
			//  로그인 세션이 존재하지 않습니다.
			throw new WFApplicationException("CMME0018");
		}

		return output;

	}

	/**
	 * PUSH 서비스 알림 동의 수정
	 * 
	 * @param input
	 *            서비스알림.동의여부.컨트롤러.입력.IO 
	 * @return 서비스알림.동의여부.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName = "서비스알림.동의여부.수정", description = "PUSH 서비스 알림 동의 수정", author = "90190264")
	public INBNtfbxPushEtcEstUpdateSrvcNtfcAgrYn_ODT updateSrvcNtfcAgrYn(
			INBNtfbxPushEtcEstUpdateSrvcNtfcAgrYn_IDT input) {
		/**
		 * @BXMType GetBean
		 */
		shrMMHCustSession_COM = WFApplicationContext.getBean(shrMMHCustSession_COM, SHRMMHCustSession_COM.class);
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		sHRAFSTeenTeenPush_COM = WFApplicationContext.getBean(sHRAFSTeenTeenPush_COM, SHRAFSTeenTeenPush_COM.class);
		sHRAFSEvnt_COM = WFApplicationContext.getBean(sHRAFSEvnt_COM, SHRAFSEvnt_COM.class);

		// 세션고객정보
		MMH_CUST_INFO custInfo = shrMMHCustSession_COM.getCustInfoSession();

		/**
		 * @BXMType VariableDeclaration
		 */
		INBNtfbxPushEtcEstUpdateSrvcNtfcAgrYn_ODT output = new INBNtfbxPushEtcEstUpdateSrvcNtfcAgrYn_ODT();

		if (shrCMMLoginSession_COM.istLogin()) {
			try {
				/**
				 * @BXMType IF 로그인체크
				 */
				if (custInfo == null || "".equals(custInfo.getCusCiNo())) {
					// FNSE0010 : 고객 정보가 존재하지 않습니다.
					throw new WFApplicationException("FNSE0010");
				}
	
				// WON PLAY 알림동의여부 수정
				if (INBCmmConstant.PUSH_SRVC_WON.equals(input.getSrvcDisv())) {
					// WON PLAY 알림동의여부 수정 SHR 호출
					String wonPlayNtfcAgrYn = sHRAFSEvnt_COM.updateWonplayNtfcAgrSts(custInfo.getCusCiNo());
					output.setWonPlayNtfcAgrYn(wonPlayNtfcAgrYn);
	
					// 틴틴 거래내역 알림동의여부 수정
				} else if (INBCmmConstant.PUSH_SRVC_TEEN_TRN.equals(input.getSrvcDisv())) {
					// 틴틴 거래내역 SHR 호출
					SHRAFSTeenTeenPushUpdateTrnPrtsNtfcInf_DIDT teenTrnShrInDto = new SHRAFSTeenTeenPushUpdateTrnPrtsNtfcInf_DIDT();
					teenTrnShrInDto.setType("U2");																	// 타입
					teenTrnShrInDto.setMchrUnqInfId(input.getMchrUnqInfId());								// 기기정보ID(레지스트리키 or 토큰)
					teenTrnShrInDto.setRawPushSndYn(input.getTrnPrtsNtfcAgrYn()); 					// 거래내역알림동의여부
					
					SHRAFSTeenTeenPushUpdateTrnPrtsNtfcInf_DODT teenTrnShrOutDto = sHRAFSTeenTeenPush_COM.updateTrnPrtsNtfcInf(teenTrnShrInDto);
					
					output.setTrnPrtsNtfcAgrYn(input.getTrnPrtsNtfcAgrYn()); 								// 틴틴 거래내역 알림 동의여부
					
					
					// 틴틴 오늘의급식 알림동의여부 수정
				} else if (INBCmmConstant.PUSH_SRVC_TEEN_PVM.equals(input.getSrvcDisv())) {
					// 틴틴 오늘의급식 SHR 호출
					UCM_PP_SCHUL_INFO001UpdateSchlPushInf_DIDT teenSchlShrInDto = new UCM_PP_SCHUL_INFO001UpdateSchlPushInf_DIDT();
					teenSchlShrInDto.setCusCiNo(custInfo.getCusCiNo());								// 고객CI번호
					teenSchlShrInDto.setAlarmYn(input.getTdPvmNtfcAgrYn()); 							// 오늘의급식알림동의여부
					
					int teenSchlShrOutDto = sHRAFSTeenTeenPush_COM.updateSchlPushInf(teenSchlShrInDto);
					
					if(teenSchlShrOutDto > 0) {
						output.setTdPvmNtfcAgrYn(input.getTdPvmNtfcAgrYn()); 						// 틴틴 오늘의급식 알림 동의여부
					} else {
						output.setTdPvmNtfcAgrYn(""); 															// 틴틴 오늘의급식 알림 동의여부
					}
					// 국민비서 알림동의여부 수정
				} else if (INBCmmConstant.PUSH_SRVC_NAT.equals(input.getSrvcDisv())) {
					sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class);
					sHRIBSMR0005499_COM = WFApplicationContext.getBean(sHRIBSMR0005499_COM, SHRIBSMR0005499_COM.class);
					
					WFInterfaceCfg interfaceCfg = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg();
					interfaceCfg.setInterfaceId("IBSMR0005499");
					
					// IBSMR0005499(CI서비스 PUSH정보 등록/해지)
					IBSMR0005499_IDT ibsmr5499Idt = new IBSMR0005499_IDT();
					// 처리구분코드(01: 조회, 02: 등록, 03: 해지)
					String prcDscd = "Y".equals(input.getNatScrrNtfcAgrYn()) ? "02" : "03";
					
					ibsmr5499Idt.setCusCiNo(custInfo.getCusCiNo());			// 고객CI번호
					ibsmr5499Idt.setPushNtcBizDscd("01");							// PUSH 통지업무구분코드 (01: 국민비서)
					ibsmr5499Idt.setPrcDscd(prcDscd);								// 처리구분코드
					ibsmr5499Idt.setCiEsnsMbhYn("N");								// CI간편회원여부
					
					WFInfResponse<IBSMR0005499_ODT> mcaOutput5499 = sHRIBSMR0005499_COM.callTrx(ibsmr5499Idt, interfaceCfg);
					
					if (!mcaOutput5499.hasError()) {
						IBSMR0005499_ODT ibsmr5499Odt = mcaOutput5499.getResponseData();
						
						output.setNatScrrNtfcAgrYn(ibsmr5499Odt.getPushTgtYn());				// PUSH대상여부
					}
				}
			} catch (WFApplicationException e) {
				logger.error("WFApplicationException error :: {}", e);
			} catch (Exception e) {
				logger.error("Exception error :: {}", e);
			}
		}

		return output;

	}

	/**
	 * 기타알림 동의여부 수정  
	 * 
	 * @param input
	 *            기타알림.동의여부.컨트롤러.입력.IO 
	 * @return 기타알림.동의여부.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName = "기타알림.동의여부.수정", description = "기타알림 동의여부 수정", author = "90190264")
	public INBNtfbxPushEtcEstUpdateEtcNtfcAgrYn_ODT updateEtcNtfcagrYn(INBNtfbxPushEtcEstUpdateEtcNtfcAgrYn_IDT input) {

		/**
		 * @BXMType GetBean
		 */
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class);
		sHRIBSMR0005647_COM = WFApplicationContext.getBean(sHRIBSMR0005647_COM, SHRIBSMR0005647_COM.class);
		sHRIBSMR0005646_COM = WFApplicationContext.getBean(sHRIBSMR0005646_COM, SHRIBSMR0005646_COM.class);
		uCM_SUP_EVT_DTL001_DBM = WFApplicationContext.getBean(uCM_SUP_EVT_DTL001_DBM, UCM_SUP_EVT_DTL001_DBM.class);
		sHRINBPushBiz_COM= WFApplicationContext.getBean(sHRINBPushBiz_COM, SHRINBPushBiz_COM.class);

		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession();

		/**
		 * @BXMType VariableDeclaration
		 */
		INBNtfbxPushEtcEstUpdateEtcNtfcAgrYn_ODT output = new INBNtfbxPushEtcEstUpdateEtcNtfcAgrYn_ODT();

		// 로그인 체크
		if (shrCMMLoginSession_COM.istLogin()) {
			try {
				// 통고번호체크
				if (!WFStringUtils.isEmpty(currentCust.getItcsno())) {
					// 만기알림 수정일때
					if (INBCmmConstant.PUSH_ETC_XPR.equals(input.getEtcEstDis())) {
						// ===================================================================
						// *********************** 1.IBSMR0005647(PUSH기타알림수신앱 등록(입출금분리) ) 인터페이스 호출 셋팅
						// ===================================================================
						// MCA WFInterfaceCfg 객체 획득
						WFInterfaceCfg interfaceCfg = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg();
						interfaceCfg.setInterfaceId("IBSMR0005647");
	
						// WFCustomTrnHeader 셋팅
						WFCustomTrnHeader wfCusTrnHeader = new WFCustomTrnHeader();
						wfCusTrnHeader.setFuncCd("20"); 							// 거래코드 조회:20 / 등록:30 / 변경:40 / 해지:50
						wfCusTrnHeader.setTrnCd("ECLLDA302");
	
						// interfaceCfg 셋팅
						interfaceCfg.setCustomTrnHeader(wfCusTrnHeader);
	
						IBSMR0005647_IDT ibsmr5647Idt = new IBSMR0005647_IDT();
	
						ibsmr5647Idt.setEbnkUtzpeNo(currentCust.getUserId()); 				// 사용자ID
						ibsmr5647Idt.setItcsno(currentCust.getItcsno()); 						// 통합고객번호
						ibsmr5647Idt.setPushAppDscd("06"); 										// 06 : WON뱅킹
	
						WFInfResponse<WFEmpty_ODT> mcaOutput5647 = sHRIBSMR0005647_COM.callTrx(ibsmr5647Idt, interfaceCfg);
	
						if (mcaOutput5647.hasError()) {
							output.setRtcd("");
							output.setRtcdTxt("등록 실패1");
						} else {
							// IBSMR0005646(PUSH기타알림서비스등록및해지(입출금분리) )
							interfaceCfg.setInterfaceId("IBSMR0005646");
							// CustomTrnHeader 초기화
							WFCustomTrnHeader wfCusTrnHeader5646 = new WFCustomTrnHeader();
							interfaceCfg.setCustomTrnHeader(wfCusTrnHeader5646);
							
							String[] annGbn = new String[7];
							String[] annCd = new String[]{"31", // 예/적금만기일알림
									"32", // 펀드만기일알림
									"33", // 대출만기일알림
									"41", // 대출이자납입일알림
									"51", // 자동이체만기일알림
									"00", // 기타알림
									"61" // ELT WON뱅킹 알림여부 '22.09.21.
							};
							
							annGbn[0] = "".equals(input.getDpidTrtXprNtfcAgrYn()) ? "" : ("Y".equals(input.getDpidTrtXprNtfcAgrYn()) ? "30" : "50"); 			// 예금,적금,신탁
							annGbn[1] = "".equals(input.getFnsXprNtfcAgrYn()) ? "" : ("Y".equals(input.getFnsXprNtfcAgrYn()) ? "30" : "50"); 						// 펀드
							annGbn[2] = "".equals(input.getLnXprNtfcAgrYn()) ? "" : ("Y".equals(input.getLnXprNtfcAgrYn()) ? "30" : "50"); 							// 대출
							annGbn[3] = "".equals(input.getLnintPidNtfcAgrYn()) ? "" : ("Y".equals(input.getLnintPidNtfcAgrYn()) ? "30" : "50"); 					// 대출이자
							annGbn[4] = "".equals(input.getAtsXprNtfcAgrYn()) ? "" : ("Y".equals(input.getAtsXprNtfcAgrYn()) ? "30" : "50"); 						// 자동이체
							annGbn[5] = "".equals(input.getSltMndNtfcAgrYn()) ? "" : ("Y".equals(input.getSltMndNtfcAgrYn()) ? "30" : "50"); 						// 기타
							annGbn[6] = "".equals(input.getEltUndasPrNtfcAgrYn()) ? "" : ("Y".equals(input.getEltUndasPrNtfcAgrYn()) ? "30" : "50"); 			// ELT
							
							int xprNtfcIdx = input.getXprNtfcIdx();
							
							if (xprNtfcIdx >= 0 && xprNtfcIdx <= 6) {
								IBSMR0005646_IDT ibsmr5646Idt = new IBSMR0005646_IDT();
								
								ibsmr5646Idt.setPrcDscd(annGbn[xprNtfcIdx]);
								ibsmr5646Idt.setCusGdcd(annCd[xprNtfcIdx]);
								
								WFInfResponse<WFEmpty_ODT> mcaOutput5646 = sHRIBSMR0005646_COM.callTrx(ibsmr5646Idt, interfaceCfg);
								
								if (mcaOutput5646.hasError()) {
									output.setRtcd("");
									output.setRtcdTxt("등록 실패2");
								} else {
									output.setRtcd("200");
									output.setRtcdTxt("성공적으로 등록하였습니다.");
								}
							}
						}
						// 투자인사이트 or 아홉시 브리핑 수정일때
					} else if (INBCmmConstant.PUSH_ETC_9TM.equals(input.getEtcEstDis())) {
						String itcsno = currentCust.getItcsno();
						String evtDis = input.getEvtDis();
						
						UCM_SUP_EVT_DTL001InsertIvstStgNtfcAgrYn_DIDT ivstStgAgrYnDidt = new UCM_SUP_EVT_DTL001InsertIvstStgNtfcAgrYn_DIDT();
						ivstStgAgrYnDidt.setUserId(currentCust.getUserId()); 				// 사용자ID
						ivstStgAgrYnDidt.setNgItgCsno(itcsno); 									// 통합고객번호
						ivstStgAgrYnDidt.setSupNm(currentCust.getUsnm()); 					// 응모자명
						ivstStgAgrYnDidt.setSupDis("S"); 											// 지원구분번호(S 고정)
						ivstStgAgrYnDidt.setEvtDis(Integer.parseInt(evtDis));					// 이벤트구분번호
						
						// 향후 이벤트 알림 추가할 수 있어서 이벤트 구분 체크 남겨둠
						if ("8".equals(evtDis)) { 														// 8 : 아홉시 브리핑
							// 이벤트 등록여부
							Boolean evtRgs = "Y".equals(input.getTim9brfAgrYn());
							// 동의여부 true 일때
							if (evtRgs) {
								// 아홉시 브리핑 pk 에러 방어 로직 추가(기가입자체크)
								UCM_SUP_EVT_DTL001SelectIvstStgNtfcagrYn_DIDT selectIvstStgAgrYnDidt = new UCM_SUP_EVT_DTL001SelectIvstStgNtfcagrYn_DIDT();
								selectIvstStgAgrYnDidt.setNgItgCsno(itcsno);
								selectIvstStgAgrYnDidt.setEvtDis(Integer.parseInt(evtDis));

								// 아홉시브리핑 조회
								UCM_SUP_EVT_DTL001SelectIvstStgNtfcagrYn_DODT selectIvstStgAgrYnDodt = uCM_SUP_EVT_DTL001_DBM.selectIvstStgNtfcagrYn(selectIvstStgAgrYnDidt);
								// 기등록된 건수가 0일때만 등록 처리
								if(selectIvstStgAgrYnDodt.getSbscCnt() == 0) {
									ivstStgAgrYnDidt.setEvtNm("아홉시브리핑구독");
									
									// 아홉시 브리핑 등록
									uCM_SUP_EVT_DTL001_DBM.insertIvstStgNtfcAgrYn(ivstStgAgrYnDidt);
									
									output.setRtcd("200");
									output.setRtcdTxt("성공적으로 등록하였습니다.");
								}
								
							} else {
								UCM_SUP_EVT_DTL001DeleteIvstStgNtfcagrYn_DIDT delIvstStgAgrYnDidtl = new UCM_SUP_EVT_DTL001DeleteIvstStgNtfcagrYn_DIDT();
								delIvstStgAgrYnDidtl.setEvtDis(ivstStgAgrYnDidt.getEvtDis()); 				// 이벤트구분번호
								delIvstStgAgrYnDidtl.setEvtNm(ivstStgAgrYnDidt.getEvtNm()); 				// 행사명
								delIvstStgAgrYnDidtl.setUserId(ivstStgAgrYnDidt.getUserId()); 				// 사용자ID
								delIvstStgAgrYnDidtl.setNgItgCsno(ivstStgAgrYnDidt.getNgItgCsno()); 	// 차세대통합고객번호
								delIvstStgAgrYnDidtl.setSupNm(ivstStgAgrYnDidt.getSupNm()); 			// 지원명
								delIvstStgAgrYnDidtl.setSupDis(ivstStgAgrYnDidt.getSupDis()); 			// 지원구분번호 
								
								// 아홉시 브리핑 삭제
								uCM_SUP_EVT_DTL001_DBM.deleteIvstStgNtfcagrYn(delIvstStgAgrYnDidtl);
								output.setRtcd("200");
								output.setRtcdTxt("성공적으로 해제하였습니다.");
							}
						}
					} else if (INBCmmConstant.PUSH_ETC_LGN.equals(input.getEtcEstDis())) {
						SHRINBPushBscInf_DTO didt = new SHRINBPushBscInf_DTO();
	
						didt.setAppDscd(INBCmmConstant.APP_DSCD); 								// 앱구분코드
						didt.setAplDscd("Y".equals(input.getNlginAgrYn()) ? "" : "01Y"); 			// 비로그인알림함사용여부("":ture, 01Y:false)
	
						int rslt = sHRINBPushBiz_COM.updatePushEtcInf(didt);
						
						if (rslt > 0) {
							output.setRtcd("200");
							output.setRtcdTxt("성공적으로 수정하였습니다.");							
						}
					}
				}
			} catch (WFApplicationException e) {
				logger.error("WFApplicationException error :: {}", e);
				output.setRtcd(e.getCode());
				output.setRtcdTxt(e.getMessage());
			} catch (Exception e) {
				logger.error("Exception error :: {}", e);
			}
		} else {
			//  로그인 세션이 존재하지 않습니다.
			throw new WFApplicationException("CMME0018");
		}

		return output;

	}

	/**
	 * 나만의.알림.조회
	 * 
	 * @param input
	 *            나만의.알림.조회.컨트롤러.입력.IO
	 * @return 나만의.알림.조회.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName = "나만의.알림.조회", description = "나만의.알림.조회", author = "90190264")
	public INBNtfbxPushEtcEstSelectMyNtfc_ODT selectMyNtfc() {

		/**
		 * @BXMType GetBean
		 */
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		ucmOwnPushNoti001_dbm = WFApplicationContext.getBean(ucmOwnPushNoti001_dbm, UCM_OWN_PUSH_NOTI001_DBM.class);

		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession();

		INBNtfbxPushEtcEstSelectMyNtfc_ODT output = new INBNtfbxPushEtcEstSelectMyNtfc_ODT();

		// 로그인 체크
		if (shrCMMLoginSession_COM.istLogin()) {
			try {
				List<INBMyNtfc_DTO> dbmOutput = ucmOwnPushNoti001_dbm.selectMyNtfcList(currentCust.getItcsno());
				// 데이터있으면
				if (dbmOutput.size() > 0) {
					// 화면에 보여질 데이터 세팅
					for (INBMyNtfc_DTO grid : dbmOutput) {
						output.getMyNtfcInqGrid().add(grid);
					}
				}
			} catch (WFApplicationException e) {
				logger.error("WFApplicationException error :: {}", e);
			} catch (Exception e) {
				logger.error("Exception error :: {}", e);
			}
		} else {
			//  로그인 세션이 존재하지 않습니다.
			throw new WFApplicationException("CMME0018");
		}

		return output;
	}

	/**
	 * 나만의.알림.수정 나만의알림 PUSH 수신여부를 수정 한다.
	 * 
	 * @param input
	 *            나만의.알림.수정.컨트롤러.입력.IO
	 * @return 나만의.알림.수정.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName = "나만의.알림.수정", description = "나만의알림 PUSH 수신여부를 수정 한다.", author = "90190264")
	public INBNtfbxPushEtcEstUpdateMyNtfc_ODT updateMyNtfc(INBNtfbxPushEtcEstUpdateMyNtfc_IDT input) {
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		ucmOwnPushNoti001_dbm = WFApplicationContext.getBean(ucmOwnPushNoti001_dbm, UCM_OWN_PUSH_NOTI001_DBM.class);

		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession();

		INBNtfbxPushEtcEstUpdateMyNtfc_ODT output = new INBNtfbxPushEtcEstUpdateMyNtfc_ODT();

		try {
			// 통고번호체크
			if (!WFStringUtils.isEmpty(currentCust.getItcsno())) {

				INBMyNtfc_DTO myNtfcDto = new INBMyNtfc_DTO();

				myNtfcDto.setItcsno(currentCust.getItcsno()); // 통합고객번호
				myNtfcDto.setSeqno(input.getSeqno()); // 순번
				myNtfcDto.setTrNotiYn(input.getTrNotiYn()); // 알림수신여부

				int dbmOutput = ucmOwnPushNoti001_dbm.updateMyNtfc(myNtfcDto);

				// 데이터있으면
				if (dbmOutput > 0) {
					output.setRtcd("0000");
					output.setRtcdTxt("나만의 알림 변경 성공");
				} else {
					output.setRtcd("E999");
					output.setRtcdTxt("처리 중 오류가 발생했어요. 다시 시도해 주세요.");
				}
			}
		} catch (WFApplicationException e) {
			logger.error("WFApplicationException error :: {}", e);
		} catch (Exception e) {
			logger.error("Exception error :: {}", e);
		}

		return output;
	}

	/**
	 * 나만의.알림.삭제 나만의알림 PUSH 수신여부를 삭제 한다.
	 *  
	 * @param input
	 *            나만의.알림.삭제.컨트롤러.입력.IO
	 * @return 나만의.알림.삭제.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName = "나만의.알림.삭제", description = "나만의알림 PUSH 수신여부를 삭제 한다.", author = "90190264")
	public INBNtfbxPushEtcEstDeleteMyNtfc_ODT deleteMyNtfc(INBNtfbxPushEtcEstDeleteMyNtfc_IDT input) {

		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		ucmOwnPushNoti001_dbm = WFApplicationContext.getBean(ucmOwnPushNoti001_dbm, UCM_OWN_PUSH_NOTI001_DBM.class);

		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession();

		INBNtfbxPushEtcEstDeleteMyNtfc_ODT output = new INBNtfbxPushEtcEstDeleteMyNtfc_ODT();

		// 로그인 체크
		if (shrCMMLoginSession_COM.istLogin()) {
			try {
				// 통고번호체크
				if (!WFStringUtils.isEmpty(currentCust.getItcsno())) {
					int dbmOutput = 0;
					// 삭제 목록 반복
					for (INBMyNtfc_DTO grid : input.getMyNtfcGrid()) {
						grid.setItcsno(currentCust.getItcsno());
						// 목록 삭제
						ucmOwnPushNoti001_dbm.deleteMyNtfc(grid);
						dbmOutput++;
					}
					if (dbmOutput > 0) {
						output.setRtcd("0000");
						output.setRtcdTxt("나만의 알림 삭제 성공");
					} else {
						output.setRtcd("E999");
						output.setRtcdTxt("처리 중 오류가 발생했어요. 다시 시도해 주세요.");
					}
				}
			} catch (WFApplicationException e) {
				logger.error("WFApplicationException error :: {}", e);
			} catch (Exception e) {
				logger.error("Exception error :: {}", e);
			}
		} else {
			//  로그인 세션이 존재하지 않습니다.
			throw new WFApplicationException("CMME0018");
		}

		return output;
	}

	/**
	 * 나만의.알림.등록 나만의알림 PUSH 수신여부를 등록 한다.
	 * 
	 * @param input
	 *            나만의.알림.등록.컨트롤러.입력.IO
	 * @return 나만의.알림.등록.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName = "나만의.알림.등록", description = "나만의알림 PUSH 수신여부를 등록 한다.", author = "90190264")
	public INBNtfbxPushEtcEstInsertMyNtfc_ODT insertMyNtfc(INBNtfbxPushEtcEstInsertMyNtfc_IDT input) {
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		sHRSequenceGenerator_COM = WFApplicationContext.getBean(sHRSequenceGenerator_COM, SHRSequenceGenerator_COM.class);
		ucmOwnPushNoti001_dbm = WFApplicationContext.getBean(ucmOwnPushNoti001_dbm, UCM_OWN_PUSH_NOTI001_DBM.class);

		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession();

		INBNtfbxPushEtcEstInsertMyNtfc_ODT output = new INBNtfbxPushEtcEstInsertMyNtfc_ODT();

		// 로그인 체크
		if (shrCMMLoginSession_COM.istLogin()) {
			try {
				
				String[] sequence = sHRSequenceGenerator_COM.getSequenceByDBName("ZEUSDS");
				
				INBMyNtfc_DTO myNtfcDto = new INBMyNtfc_DTO();
				
				myNtfcDto.setItcsno(currentCust.getItcsno()); // 통합고객번호
				myNtfcDto.setSeqno(sequence[0] + sequence[2]); // 순서번호
				myNtfcDto.setUserId(currentCust.getUserId()); // 사용자ID
				myNtfcDto.setTrNotiYn("Y"); // 알림수신여부
				myNtfcDto.setAlimiType(input.getAlimiType()); // 알림구분
				myNtfcDto.setNtfcTxt(input.getNtfcTxt()); // 알림내용
				myNtfcDto.setNtfcFm(input.getNtfcFm()); // 알림방식
				myNtfcDto.setMonth(input.getMonth()); // 월
				myNtfcDto.setDay(input.getDay()); // 일
				myNtfcDto.setWeekdayNm(input.getWeekdayNm()); // 요일명
				myNtfcDto.setAlimiTm(input.getAlimiTm()); // 알림시각
				myNtfcDto.setWdrAcno(input.getWdrAcno()); // 출금계좌번호
				myNtfcDto.setTsAmt(input.getTsAmt()); // 이체금액
				myNtfcDto.setRcvBkcd(input.getRcvBkcd()); // 입금은행코드
				myNtfcDto.setRcvAcno(input.getRcvAcno()); // 입금계좌번호
				myNtfcDto.setWdrPbokMrk(input.getWdrPbokMrk()); // 출금통장표시내용
				myNtfcDto.setRcvPbokMrk(input.getRcvPbokMrk()); // 입금통장표시내용
				myNtfcDto.setMretTsYn(input.getMretTsYn()); // 월세이체여부
				myNtfcDto.setNotiTmpTyp(input.getNotiTmpTyp()); // 알림 템플릿 유형
				
				int dbmOutput = ucmOwnPushNoti001_dbm.insertMyNtfc(myNtfcDto);
				
				// 데이터있으면
				if (dbmOutput > 0) {
					output.setRtcd("0000");
					output.setRtcdTxt("나만의 알림 등록 성공");
				} else {
					output.setRtcd("E999");
					output.setRtcdTxt("처리 중 오류가 발생했어요. 다시 시도해 주세요.");
				}
			} catch (WFApplicationException e) {
				logger.error("WFApplicationException error :: {}", e);
			} catch (Exception e) {
				logger.error("Exception error :: {}", e);
			}
		} else {
			//  로그인 세션이 존재하지 않습니다.
			throw new WFApplicationException("CMME0018");
		}

		return output;
	}

	/**
	 * 나만의.알림.상세 조회 나만의알림 상세 조회 한다.
	 * 
	 * @param input
	 *            나만의.알림.상세 조회.컨트롤러.입력.IO 
	 * @return 나만의.알림.상세 조회.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName = "나만의.알림.상세 조회", description = "나만의알림 상세 조회 한다.", author = "90190264")
	public INBNtfbxPushEtcEstSelectMyNtfcDtl_ODT selectMyNtfcDtl(INBNtfbxPushEtcEstSelectMyNtfcDtl_IDT input) {

		/**
		 * @BXMType GetBean
		 */
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		ucmOwnPushNoti001_dbm = WFApplicationContext.getBean(ucmOwnPushNoti001_dbm, UCM_OWN_PUSH_NOTI001_DBM.class);

		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession();

		INBNtfbxPushEtcEstSelectMyNtfcDtl_ODT output = new INBNtfbxPushEtcEstSelectMyNtfcDtl_ODT();

		INBMyNtfc_DTO myNtfcDto = new INBMyNtfc_DTO();
		
		String itcsno = "";
		
		// 비로그인 일 경우 화면에서 넘어온 통고번호 세팅, 로그인일 경우 세션 통고 세팅
		if(shrCMMLoginSession_COM.istLogin()) {
			itcsno = currentCust.getItcsno();
		} else {
			itcsno = input.getItcsno();
		}
		
		myNtfcDto.setItcsno(itcsno);
		myNtfcDto.setSeqno(input.getSeqno());
		
		INBMyNtfc_DTO dbmOutput = ucmOwnPushNoti001_dbm.selectMyNtfcDtl(myNtfcDto);
		// 데이터있으면
		if (!ObjectUtils.isEmpty(dbmOutput)) {
			// 화면에 보여질 데이터 세팅
			output.setMyNtfcInqGrid(dbmOutput);
		}

		return output;
	}

	/**
	 * 나만의.알림.수취인명 조회 나만의알림 수취인명 조회 한다.
	 * 
	 * @param input
	 *            나만의.알림.수취인명 조회.컨트롤러.입력.IO  
	 * @return 나만의.알림.상세 조수취인명회.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName = "나만의.알림.수취인명 조회", description = "나만의알림 수취인명 조회 한다.", author = "90190264")
	public INBNtfbxPushEtcEstSelectMyNtfcRnpeNm_ODT selectMyNtfcRnpeNm(INBNtfbxPushEtcEstSelectMyNtfcRnpeNm_IDT input) {
		/**
		 * @BXMType GetBean
		 */
		sHRRnpeFnmInq_COM = WFApplicationContext.getBean(sHRRnpeFnmInq_COM,SHRRnpeFnmInq_COM.class);
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);

		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession();

		INBNtfbxPushEtcEstSelectMyNtfcRnpeNm_ODT output = new INBNtfbxPushEtcEstSelectMyNtfcRnpeNm_ODT();

		// 로그인 체크
		if (shrCMMLoginSession_COM.istLogin()) {
			try {
				SHRRnpeNmInqInp_DTO shrRnpeNmDto = new SHRRnpeNmInqInp_DTO();
				
				shrRnpeNmDto.setWdrBkcd(input.getWdrBkcd()); // 출금은행코드
				shrRnpeNmDto.setWdrAcno(input.getWdrAcno()); // 출금계좌번호
				shrRnpeNmDto.setTrnAm(input.getTrnAm()); // 거래금액
				shrRnpeNmDto.setRcvBkcd(input.getRcvBkcd()); // 입금은행코드
				shrRnpeNmDto.setRcvAcno(input.getRcvAcno()); // 입금계좌번호
				shrRnpeNmDto.setUserId(currentCust.getUserId()); // 사용자ID
				shrRnpeNmDto.setItcsno(currentCust.getItcsno()); // 통합고객번호
				shrRnpeNmDto.setFdtsYn("Y"); // 자금이체여부
				shrRnpeNmDto.setFrqntRgsSelYn("N"); // 자주쓰는계좌등록조회여부
				
				SHRRnpeNmInqOup_DTO shrRnpeNmOutDto = sHRRnpeFnmInq_COM.selectRnpeNm(shrRnpeNmDto);
				
				if (!ObjectUtils.isEmpty(shrRnpeNmOutDto)) {
					output.setRnpeFnm(shrRnpeNmOutDto.getRnpeFnm()); // 수취인성명
					output.setErrMsgId(shrRnpeNmOutDto.getErrMsgId()); // 오류메시지ID
					output.setErrMsgTxt(shrRnpeNmOutDto.getErrMsgTxt()); // 오류메시지내용
				}
				
			} catch (WFApplicationException e) {
				output.setErrMsgId("E999");
				output.setErrMsgTxt("처리 중 오류가 발생했어요. 다시 시도해 주세요.");
			} catch (Exception e) {
				output.setErrMsgId("BSCE0035");
				output.setErrMsgTxt("수취인 조회중 에러가 발생하였습니다.");
			}
		} else {
			//  로그인 세션이 존재하지 않습니다.
			throw new WFApplicationException("CMME0018");
		}

		return output;
	}

	/**
	 * 나만의 알림 상세 수정 나만의알림 상세 내용을 수정 한다.
	 * 
	 * @param input
	 *            나만의.알림.상세.수정.컨트롤러.입력.IO
	 * @return 나만의.알림.상세.수정.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName = "나만의.알림.상세.수정", description = "나만의알림 상세 내용을 수정 한다.", author = "90190264")
	public INBNtfbxPushEtcEstUpdateMyNtfcDtl_ODT updateMyNtfcDtl(INBNtfbxPushEtcEstUpdateMyNtfcDtl_IDT input) {
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		sHRSequenceGenerator_COM = WFApplicationContext.getBean(sHRSequenceGenerator_COM, SHRSequenceGenerator_COM.class);
		ucmOwnPushNoti001_dbm = WFApplicationContext.getBean(ucmOwnPushNoti001_dbm, UCM_OWN_PUSH_NOTI001_DBM.class);

		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession();

		INBNtfbxPushEtcEstUpdateMyNtfcDtl_ODT output = new INBNtfbxPushEtcEstUpdateMyNtfcDtl_ODT();

		// 로그인 체크
		if (shrCMMLoginSession_COM.istLogin()) {
			try {
				INBMyNtfc_DTO delMyNtfcDto = new INBMyNtfc_DTO();
				delMyNtfcDto.setItcsno(currentCust.getItcsno());
				delMyNtfcDto.setSeqno(input.getSeqno());
				delMyNtfcDto.setEtc1("DEL");
				// 목록 삭제
				int dbmOutput = ucmOwnPushNoti001_dbm.deleteMyNtfc(delMyNtfcDto);

				// 삭제 후 insert
				if (dbmOutput > 0) {
					String[] sequence = sHRSequenceGenerator_COM.getSequenceByDBName("ZEUSDS");

					INBMyNtfc_DTO InsMyNtfcDto = new INBMyNtfc_DTO();

					InsMyNtfcDto.setItcsno(currentCust.getItcsno()); // 통합고객번호
					InsMyNtfcDto.setSeqno(sequence[0] + sequence[2]); // 순서번호
					InsMyNtfcDto.setUserId(currentCust.getUserId()); // 사용자ID
					InsMyNtfcDto.setTrNotiYn("Y"); // 알림수신여부
					InsMyNtfcDto.setAlimiType(input.getAlimiType()); // 알림구분
					InsMyNtfcDto.setNtfcTxt(input.getNtfcTxt()); // 알림내용
					InsMyNtfcDto.setNtfcFm(input.getNtfcFm()); // 알림방식
					InsMyNtfcDto.setMonth(input.getMonth()); // 월
					InsMyNtfcDto.setDay(input.getDay()); // 일
					InsMyNtfcDto.setWeekdayNm(input.getWeekdayNm()); // 요일명
					InsMyNtfcDto.setAlimiTm(input.getAlimiTm()); // 알림시각
					InsMyNtfcDto.setWdrAcno(input.getWdrAcno()); // 출금계좌번호
					InsMyNtfcDto.setTsAmt(input.getTsAmt()); // 이체금액
					InsMyNtfcDto.setRcvBkcd(input.getRcvBkcd()); // 입금은행코드
					InsMyNtfcDto.setRcvAcno(input.getRcvAcno()); // 입금계좌번호
					InsMyNtfcDto.setWdrPbokMrk(input.getWdrPbokMrk()); // 출금통장표시내용
					InsMyNtfcDto.setRcvPbokMrk(input.getRcvPbokMrk()); // 입금통장표시내용
					InsMyNtfcDto.setMretTsYn(input.getMretTsYn()); // 월세이체여부
					InsMyNtfcDto.setNotiTmpTyp(input.getNotiTmpTyp()); // 알림 템플릿
																		// 유형

					dbmOutput = ucmOwnPushNoti001_dbm.insertMyNtfc(InsMyNtfcDto);

					if (dbmOutput > 0) {
						output.setRtcd("0000");
						output.setRtcdTxt("나만의 알림 수정 성공");
					} else {
						output.setRtcd("9999");
						output.setRtcdTxt("수정할 나만의 알림이 존재하지 않습니다. 다시 시도해 주세요.");
					}
				} else {
					output.setRtcd("9999");
					output.setRtcdTxt("수정할 나만의 알림이 존재하지 않습니다. 다시 시도해 주세요.");
				}
			} catch (WFApplicationException e) {
				logger.error("WFApplicationException error :: {}", e);
				output.setRtcd("E999");
				output.setRtcdTxt("처리 중 오류가 발생했어요. 다시 시도해 주세요.");
			} catch (Exception e) {
				logger.error("Exception error :: {}", e);
				output.setRtcd("E999");
				output.setRtcdTxt("처리 중 오류가 발생했어요. 다시 시도해 주세요.");
			}
		} else {
			//  로그인 세션이 존재하지 않습니다.
			throw new WFApplicationException("CMME0018");
		}

		return output;
	}

}
