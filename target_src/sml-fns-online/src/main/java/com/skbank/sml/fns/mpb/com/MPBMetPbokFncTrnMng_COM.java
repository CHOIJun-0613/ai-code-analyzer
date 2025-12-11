package com.skbank.sml.fns.mpb.com;

import bxm.common.annotaion.BxmCategory;

import com.skbank.sml.cmm.shr.com.SHRCECSession_COM;
import com.skbank.sml.cmm.shr.com.SHRCMMInterfaceCfg_COM;
import com.skbank.sml.cmm.shr.com.SHRCMMLoginSession_COM;
import com.skbank.sml.cmm.shr.com.SHRSequenceGenerator_COM;
import com.skbank.sml.cmm.shr.dto.CEC_CUST_SCRT_INFO;
import com.skbank.sml.cmm.shr.dto.CMM_CURRENT_CUST;
import com.skbank.sml.fns.mpb.dbm.MET_PBOK_LIFEC_MNG_LDG001_DBM;
import com.skbank.sml.fns.mpb.dbm.MET_PBOK_MBPF_TS_REQ_INF001_DBM;
import com.skbank.sml.fns.mpb.dto.HswfMetLifecExpdPtsSub_DODT;
import com.skbank.sml.fns.mpb.dto.HswfMetLifecExpdPts_DIDT;
import com.skbank.sml.fns.mpb.dto.HswfMetLifecExpdPts_DODT;
import com.skbank.sml.fns.mpb.dto.MbpfRcvstsInq_DIDT;
import com.skbank.sml.fns.mpb.dto.MbpfRcvstsInq_DODT;
import com.skbank.sml.fns.mpb.dto.MbpfRcvstsList2Inq_DODT;
import com.skbank.sml.fns.mpb.dto.MbpfRcvstsListInq_DODT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_LIFEC_MNG_LDG001InsertMetPbokLifecMngLdgPk_DIDT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_LIFEC_MNG_LDG001SelectMetPbokLifecMngLdgPkInfo_DIDT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_LIFEC_MNG_LDG001SelectMetPbokLifecMngLdgPkInfo_DODT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_LIFEC_MNG_LDG001UpdateMetPbokLifecMngLdgPk_DIDT;
import com.skbank.sml.fns.mpb.dto.MetPbokTrnPrtsGrid;
import com.skbank.sml.fns.mpb.dto.MetPbokTrnPrts_DIDT;
import com.skbank.sml.fns.mpb.dto.MetPbokTrnPrts_DODT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_MBPF_TS_REQ_INF001DeleteTsReqInf_DIDT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_MBPF_TS_REQ_INF001InsertTsReqInf_DIDT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_MBPF_TS_REQ_INF001SelectAllTsReqCnt_DIDT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_MBPF_TS_REQ_INF001SelectAllTsReqInf_DIDT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_MBPF_TS_REQ_INF001SelectAllTsReqInf_DODT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_MBPF_TS_REQ_INF001SelectMbhTsReqInf_DIDT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_MBPF_TS_REQ_INF001SelectMbhTsReqInf_DODT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_MBPF_TS_REQ_INF001SelectMbpfRtunInf_DIDT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_MBPF_TS_REQ_INF001SelectMbpfRtunInf_DODT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_MBPF_TS_REQ_INF001UpdateTsReqInf_DIDT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_MBPF_TS_REQ_INF001UpdateTsReqStcd_DIDT;
import com.skbank.sml.fns.mpb.dto.MPBMetPbokFncTrnMngInsertAsscNompefObkFdtsExeInput_DTO;
import com.skbank.sml.fns.mpb.dto.MPBMetPbokFncTrnMngInsertAsscNompefObkFdtsExeOutput_DTO;
import com.skbank.sml.fns.mpb.dto.MPBMetPbokFncTrnMngInsertAsscNompefTbkFdtsExeInput_DTO;
import com.skbank.sml.fns.mpb.dto.MPBMetPbokFncTrnMngInsertAsscNompefTbkFdtsExeOutput_DTO;
import com.skbank.sml.fns.mpb.dto.MPBMetPbokFncTrnMngSelectAsscNompefObkFdtsInput_DTO;
import com.skbank.sml.fns.mpb.dto.MPBMetPbokFncTrnMngSelectAsscNompefObkFdtsOutput_DTO;
import com.skbank.sml.fns.mpb.dto.MPBMetPbokFncTrnMngSelectAsscNompefTbkFdtsInput_DTO;
import com.skbank.sml.fns.mpb.dto.MPBMetPbokFncTrnMngSelectAsscNompefTbkFdtsOutput_DTO;
import com.skbank.sml.fns.mpb.dto.ObkFdtsExe_DIDT;
import com.skbank.sml.fns.mpb.dto.ObkFdtsExe_DODT;
import com.skbank.sml.fns.mpb.dto.ObkMbpfReturn_DIDT;
import com.skbank.sml.fns.mpb.dto.ObkMbpfReturn_DODT;
import com.skbank.sml.fns.mpb.dto.ObkTsReqRnpeInf_DIDT;
import com.skbank.sml.fns.mpb.dto.ObkTsReqRnpeInf_DODT;
import com.skbank.sml.fns.mpb.dto.TbkFdtsExe_DIDT;
import com.skbank.sml.fns.mpb.dto.TbkFdtsExe_DODT;
import com.skbank.sml.fns.mpb.dto.TbkMbpfReturn_DIDT;
import com.skbank.sml.fns.mpb.dto.TbkMbpfReturn_DODT;
import com.skbank.sml.fns.mpb.dto.TbkTsReqRnpeInf_DIDT;
import com.skbank.sml.fns.mpb.dto.TbkTsReqRnpeInf_DODT;
import com.skbank.sml.ifi.mca.eims1.dto.IBSMR0005781_IDT;
import com.skbank.sml.ifi.mca.eims1.dto.IBSMR0005781_ODT;
import com.skbank.sml.ifi.mca.eims1.dto.IBSMR0005931_IDT;
import com.skbank.sml.ifi.mca.eims1.dto.IBSMR0005931_ODT;
import com.skbank.sml.ifi.mca.eims2.dto.IBSMR0000072_IDT;
import com.skbank.sml.ifi.mca.eims2.dto.IBSMR0000072_ODT;
import com.skbank.sml.ifi.mca.eims2.dto.IBSMR0005772_GRID_ODT;
import com.skbank.sml.ifi.mca.eims2.dto.IBSMR0005772_IDT;
import com.skbank.sml.ifi.mca.eims2.dto.IBSMR0005772_ODT;
import com.skbank.sml.ifi.mca.eims3.dto.IBSMR0000073_IDT;
import com.skbank.sml.ifi.mca.eims3.dto.IBSMR0000073_ODT;
import com.skbank.sml.ifi.mca.eims3.dto.IBSMR0000093_IDT;
import com.skbank.sml.ifi.mca.eims3.dto.IBSMR0000093_ODT;
import com.skbank.sml.ifi.mca.eims3.dto.IBSMR0005773_DIS_1_GRID_ODT;
import com.skbank.sml.ifi.mca.eims3.dto.IBSMR0005773_DIS_2_GRID_ODT;
import com.skbank.sml.ifi.mca.eims3.dto.IBSMR0005773_IDT;
import com.skbank.sml.ifi.mca.eims3.dto.IBSMR0005773_ODT;
import com.skbank.sml.ifi.mca.eims4.dto.IBSMR0000094_IDT;
import com.skbank.sml.ifi.mca.eims4.dto.IBSMR0000094_ODT;
import com.skbank.sml.ifi.mca.eims4.dto.IBSMR0005774_IDT;
import com.skbank.sml.ifi.mca.eims4.dto.IBSMR0005774_ODT;
import com.skbank.sml.ifi.mca.eims4.dto.IBSMR0005774_REPT_FA_ODT;
import com.skbank.sml.ifi.mca.eims4.dto.IBSMR0006184_IDT;
import com.skbank.sml.ifi.mca.eims4.dto.IBSMR0006184_ODT;
import com.skbank.sml.ifi.mca.eims5.dto.IBSMR0006185_IDT;
import com.skbank.sml.ifi.mca.eims5.dto.IBSMR0006185_ODT;
import com.skbank.sml.ifi.mca.eims6.dto.IBSMR0006186_IDT;
import com.skbank.sml.ifi.mca.eims6.dto.IBSMR0006186_ODT;
import com.skbank.sml.ifi.mca.eims7.dto.IBSMR0006187_IDT;
import com.skbank.sml.ifi.mca.eims7.dto.IBSMR0006187_ODT;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0000072_COM;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0000073_COM;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0000089_COM;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0000090_COM;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0000093_COM;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0000094_COM;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0004259_COM;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0005772_COM;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0005773_COM;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0005774_COM;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0005781_COM;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0005931_COM;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0006184_COM;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0006185_COM;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0006186_COM;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0006187_COM;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import fwk.skbank.asis.adaptor.dto.request.WFInterfaceCfg;
import fwk.skbank.asis.adaptor.dto.response.WFInfResponse;
import fwk.skbank.asis.adaptor.header.request.WFNciHeader;
import fwk.skbank.online.context.WFApplicationContext;
import fwk.skbank.online.exception.app.WFApplicationException;
import fwk.skbank.online.exception.dto.WFInfErrorResponse;
import fwk.skbank.online.exception.frm.SFAdaptorApplicationException;
import fwk.skbank.online.exception.frm.SFInterfaceSystemException;
import fwk.skbank.online.util.WFStringUtils;

/**
 * 1.업무명 : 금융서비스
 * 2.단위업무명 : NEWWON 중분류 모임통장
 * 3.프로그램명 : 모임통장.금융거래.관리.컴포넌트
 * 4.설명 : 
 * 
 * @Class MPBMetPbokFncTrnMng_COM.java
 * @author 90190263
 * @since 2024.03.25
 * @version 1.0
 */		
@Component
@BxmCategory(logicalName="모임통장.금융거래.관리.컴포넌트", description="ㅋ모임통장의 금융거래를 관리하는 컴포넌트")
public class MPBMetPbokFncTrnMng_COM { 
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
	 * 모임통장 거래내역 조회(모임별,회원별)
	 */
	private SHRIBSMR0005772_COM sHRIBSMR0005772_COM;
	/**
	 * 모임통장 회비입금 내역조회
	 */
	private SHRIBSMR0005773_COM sHRIBSMR0005773_COM;
	
	/**
	 * 모임통장 회비입금 내역조회
	 */
	private SHRIBSMR0005774_COM sHRIBSMR0005774_COM;
	/**
	 * 당행계좌 입금기준예금주조회(IR포함)
	 */
	private SHRIBSMR0004259_COM sHRIBSMR0004259_COM;
	
	/**
	 * 당행계좌 입금가능 성명조회
	 */
	private SHRIBSMR0000089_COM sHRIBSMR0000089_COM;
	/**
	 * 타행계좌 입금가능 성명조회
	 */
	private SHRIBSMR0000090_COM sHRIBSMR0000090_COM;
	/**
	 *당행계좌간 자금이체조회
	 */
	private SHRIBSMR0000072_COM sHRIBSMR0000072_COM;
	/**
	 * 타행계좌간 자금이체조회
	 */
	private SHRIBSMR0000073_COM sHRIBSMR0000073_COM;
	/**
	 * 당행계좌간 자금이체 실행
	 */
	private SHRIBSMR0000093_COM sHRIBSMR0000093_COM;
	/**
	 * 타행계좌간 자금이체 실행
	 */
	private SHRIBSMR0000094_COM sHRIBSMR0000094_COM;
	/**
	 * 모임통장 모임 회비 돌려받기 이체요청(당행)
	 */
	private SHRIBSMR0005931_COM sHRIBSMR0005931_COM;
	/**
	 * 모임통장 모임 회비 돌려받기 이체요청(타행)
	 */
	private SHRIBSMR0005781_COM sHRIBSMR0005781_COM;
	
	/**
	 * 모임통장.이체.요청.정보.001.DBM
	 */
	private MET_PBOK_MBPF_TS_REQ_INF001_DBM metPbokTsReqInf001_DBM;
	/**
	 * 모임통장생활비관리원장
	 */	
	private MET_PBOK_LIFEC_MNG_LDG001_DBM metPbokLifecMngLdg001_DBM;
	
	/**
	 * 생활비 통장 모임원 당행계좌 송금 가능조회
	 */
	private SHRIBSMR0006184_COM sHRIBSMR0006184_COM;
	/**
	 * 생활비 통장 모임원 당행계좌 송금 실행
	 */
	private SHRIBSMR0006185_COM sHRIBSMR0006185_COM;
	/**
	 * 생활비 통장 모임원 타행계좌 송금 가능조회
	 */
	private SHRIBSMR0006186_COM sHRIBSMR0006186_COM;
	/**
	 * 생활비 통장 모임원 타행계좌 송금 실행
	 */
	private SHRIBSMR0006187_COM sHRIBSMR0006187_COM;
	
	/**
	 * 일련번호채번
	 */
	private SHRSequenceGenerator_COM sHRSequenceGenerator_COM;
	private SHRCECSession_COM shrCECSession_COM; // 인증보안 세션 컴포넌트
	/**
	 * 모임통장에서 원하는 월의 입금현황을 조회하는 서비스
	 * 
	 * 	[07] : 회비입금금내역_모임회원별/특정월/회원별칭명순
	 * [08] : 회비입금금내역_특정회회원/일별 /거래일자 역순차조회
	 * [17] : 회비입금내역_모임별/특정월/입금
     * [18] : 회비입금내역_모임별/특정월/미입금
	 * [19] : 회비입금금내역_특정회회원/월별 /거래일자 역순차조회
	 * 
	 * @param input 회비.입금현황.조회.컨트롤러.입력.IO
	 * @return 회비.입금현황.조회.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName="모임통장.회비.입금.내역.조회", description="모임통장에서 원하는 월의 입금현황을 조회하는 서비스", author="90190263")
	public MbpfRcvstsInq_DODT selectMetPbokMbpfRcvSts(MbpfRcvstsInq_DIDT input
	) throws WFApplicationException  {
		/**
		* @BXMType GetBean
		*/
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		//WFInterfaceCfg 생성 컴포넌트
		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class);
		sHRIBSMR0005773_COM= WFApplicationContext.getBean(sHRIBSMR0005773_COM, SHRIBSMR0005773_COM.class);
		

		/**
		 * @BXMType VariableDeclaration
		 */
		MbpfRcvstsInq_DODT output= new MbpfRcvstsInq_DODT();
			
		/*
		 * 로직 추가
		 */
		if(logger.isDebugEnabled()) {
			logger.debug("90190263 회비.입금현황.조회 SVC input {} :: ", input);
		}
		//세션고객정보
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession(); 
		if(logger.isDebugEnabled()) {
			logger.debug("currentCust ====== {} ::: ", currentCust);
		} 
		
		
		/**
		 * @BXMType Try
		 * 
		 */
		try{
			/**
			 * 연계시스템 호출
			 * TYPE : MCA
			 * ID :IBSMR0005773
			 * NM : 모임통장 회비입금 내역 조회
			 */
			//  MCA WFInterfaceCfg 객체 획득
			WFInterfaceCfg interfaceCfg  = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg();
			interfaceCfg.setInterfaceId("IBSMR0005773");

	        // WFNciHeader 셋팅
            WFNciHeader wfnciHeader = interfaceCfg.getNciHeader();
            
	        // 간편회원일 경우 userID, 통합고객번호 초기화
	        if( shrCMMLoginSession_COM.isEsnsMbh() == true ) {
	        	wfnciHeader.setEbnkUtzpeNo("");
	            wfnciHeader.setItcsno("");  
	        }

            // interfaceCfg 셋팅
            interfaceCfg.setNciHeader(wfnciHeader);   
	        
	        IBSMR0005773_IDT iIBSMR0005773 = new IBSMR0005773_IDT();
	        iIBSMR0005773.setInqDis(input.getInqDis()); // 조회구분
	        iIBSMR0005773.setMetMngNo(input.getMetMngNo()); // 모임관리번호
	        iIBSMR0005773.setMetMbhSrno(input.getMetMbhSrno()); // 모임회원일련번호
	        iIBSMR0005773.setInqBasYm(input.getInqBasYm()); // 조회기준년월
	        iIBSMR0005773.setInqStaDt(input.getInqStaDt()); // 조회시작일자
	        iIBSMR0005773.setInqStaTrnSrno(input.getInqStaTrnSrno()); // 조회시작거래일련번호
	        iIBSMR0005773.setInqEndDt(input.getInqEndDt()); // 조회종료일자
	        iIBSMR0005773.setNxtMetMbhAlsNm(input.getNxtMetMbhAlsNm());
	        
	        if(logger.isDebugEnabled()) {
				logger.debug("90190263 모임통장 회비입금 내역 조회 iIBSMR0005773 {} ::: ", iIBSMR0005773);
			}
	        
	        WFInfResponse<IBSMR0005773_ODT> mcaOutput = sHRIBSMR0005773_COM.callTrx(iIBSMR0005773, interfaceCfg);
	        
			IBSMR0005773_ODT oIBSMR0005773= mcaOutput.getResponseData();
			if(logger.isDebugEnabled()) {
				logger.debug("90190263 모임통장 회비입금 내역 조회 oIBSMR0005773 {} ::: ", oIBSMR0005773);
			}
			
			output.setMetMngNo(oIBSMR0005773.getMetMngNo()); // 모임관리번호
			output.setEbnkUtzpeNo(oIBSMR0005773.getEbnkUtzpeNo()); // 전자뱅킹이용자번호
			output.setMetCtrStcd(oIBSMR0005773.getMetCtrStcd()); // 모임계약상태코드
			output.setMetCtrStcdNm(oIBSMR0005773.getMetCtrStcdNm()); // 모임계약상태코드명
			output.setMetPbokDscd(oIBSMR0005773.getMetPbokDscd()); // 모임통장구분코드
			output.setMetPbokDscdNm(oIBSMR0005773.getMetPbokDscdNm()); // 모임통장구분코드명
			output.setMetNm(oIBSMR0005773.getMetNm()); // 모임명
			output.setRcvBkwAcno(oIBSMR0005773.getRcvBkwAcno()); // 입금전행계좌번호
			output.setCusUsgBkwAcno(oIBSMR0005773.getCusUsgBkwAcno()); // 고객사용전행계좌번호
			output.setItcsno(oIBSMR0005773.getItcsno()); // 통합고객번호
			output.setCusKorlNm(oIBSMR0005773.getCusKorlNm()); // 고객한글명
			output.setCusBkpnNm(oIBSMR0005773.getCusBkpnNm()); // 고객부기명
			output.setCtBal(oIBSMR0005773.getCtBal()); // 현재잔액
			output.setPayAvlBal(oIBSMR0005773.getPayAvlBal()); // 지급가능잔액
			output.setPdcd(oIBSMR0005773.getPdcd()); // 상품코드
			output.setPdcdKorlNm(oIBSMR0005773.getPdcdKorlNm()); // 상품코드한글명
			output.setPrdKorlAbrNm(oIBSMR0005773.getPrdKorlAbrNm()); // 상품한글단축명
			output.setRlfAcno(oIBSMR0005773.getRlfAcno()); // 안심계좌번호
			output.setMbpfPymDt(oIBSMR0005773.getMbpfPymDt()); // 회비납부일자
			output.setMbpfPymCycd(oIBSMR0005773.getMbpfPymCycd()); // 회비납부주기코드
			output.setMbpfPymCycdNm(oIBSMR0005773.getMbpfPymCycdNm()); // 회비납부주기코드명
			output.setMbpfPmtgtAm(oIBSMR0005773.getMbpfPmtgtAm()); // 회비납부대상금액
			output.setAgmdCollDt(oIBSMR0005773.getAgmdCollDt()); // 동의서징구일자
			output.setAdvpeEno(oIBSMR0005773.getAdvpeEno()); // 권유자직원번호
			output.setAsmnlApvCd(oIBSMR0005773.getAsmnlApvCd()); // 공동명의승인코드
			output.setAsmnlApvCdNm(oIBSMR0005773.getAsmnlApvCdNm()); // 공동명의승인코드명
			output.setRppeChgRgsYn(oIBSMR0005773.getRppeChgRgsYn()); // 대표자변경등록여부
			output.setRppeChgRgsDt(oIBSMR0005773.getRppeChgRgsDt()); // 대표자변경등록일자
			output.setRppeChgVldDt(oIBSMR0005773.getRppeChgVldDt()); // 대표자변경유효일자
			output.setMetDscd(oIBSMR0005773.getMetDscd()); // 모임구분코드
			output.setMetDscdNm(oIBSMR0005773.getMetDscdNm()); // 모임구분코드명
			output.setMetRgsDt(oIBSMR0005773.getMetRgsDt()); // 모임등록일자
			output.setRgsTm(oIBSMR0005773.getRgsTm()); // 등록시각
			output.setMetMbhRgsCnt(oIBSMR0005773.getMetMbhRgsCnt()); // 모임회원등록건수
			output.setMetMbhScssCnt(oIBSMR0005773.getMetMbhScssCnt()); // 모임회원탈퇴건수
			output.setMetRprsAlsNm(oIBSMR0005773.getMetRprsAlsNm()); // 모임대표별칭명
			output.setMetRprsMbhNm(oIBSMR0005773.getMetRprsMbhNm()); // 모임대표회원명
			output.setMetRprsImgUrlNm(oIBSMR0005773.getMetRprsImgUrlNm()); // 모임대표이미지URL명
			output.setTotMbpfRcvAm(oIBSMR0005773.getTotMbpfRcvAm()); // 총회비입금금액
			output.setTotMbpfXmpAm(oIBSMR0005773.getTotMbpfXmpAm()); // 총회비면제금액
			output.setMbpfPymMbhCn(oIBSMR0005773.getMbpfPymMbhCn()); // 회비납부회원수
			output.setMbpfNpymMbhCn(oIBSMR0005773.getMbpfNpymMbhCn()); // 회비미납부회원수
			output.setMetBscImgUrlNm(oIBSMR0005773.getMetBscImgUrlNm()); // 모임기본이미지URL명
			output.setNxtMetMbhAlsNm(oIBSMR0005773.getNxtMetMbhAlsNm()); // 다음모임회원별칭명
		
			// 회비.입금현황.목록.조회.컨트롤러.출력.IO
			List<MbpfRcvstsListInq_DODT> outDataGrid = new ArrayList<>();
			
			// 모임별 입금내역
			if( oIBSMR0005773.getDis1Grid().size() > 0 ) {
				for( IBSMR0005773_DIS_1_GRID_ODT oMbpfRcvstsData : oIBSMR0005773.getDis1Grid()) {
					MbpfRcvstsListInq_DODT outData = new MbpfRcvstsListInq_DODT();
					outData.setInqBasYm(oMbpfRcvstsData.getInqBasYm()); // 조회기준년월
					outData.setMetMbhSrno(oMbpfRcvstsData.getMetMbhSrno()); // 모임회원일련번호
					outData.setMetMbhAlsNm(oMbpfRcvstsData.getMetMbhAlsNm()); // 모임회원별칭명
					outData.setMetMbhDscd(oMbpfRcvstsData.getMetMbhDscd()); // 모임회원구분코드
					outData.setMetMbhDscdNm(oMbpfRcvstsData.getMetMbhDscdNm()); // 모임회원구분코드명
					outData.setMetMbhImgUrlNm(oMbpfRcvstsData.getMetMbhImgUrlNm()); // 모임회원이미지URL명
					outData.setMbpfPmtgtAm(oMbpfRcvstsData.getMbpfPmtgtAm()); // 회비납부대상금액
					outData.setMbpfPymAm(oMbpfRcvstsData.getMbpfPymAm()); // 회비납부금액
					outData.setMetMbpfXmpAm(oMbpfRcvstsData.getMetMbpfXmpAm()); // 모임회비면제금액
					
					outDataGrid.add(outData);
				}
			}
			output.setDis1Grid(outDataGrid); // 그리드 건수
			output.setGrid1Cnt(outDataGrid.size());
			
			output.setNxtInqTrnDt(oIBSMR0005773.getNxtInqTrnDt()); // 다음조회거래일자
			output.setNxtTrnSrno(oIBSMR0005773.getNxtTrnSrno()); // 다음거래일련번호
			output.setMetMbhSrno(oIBSMR0005773.getMetMbhSrno()); // 모임회원일련번호
			output.setMetMbhNm(oIBSMR0005773.getMetMbhNm()); // 모임회원명
			output.setMetMbhAlsNm(oIBSMR0005773.getMetMbhAlsNm()); // 모임회원별칭명
			output.setMetMbhDscd(oIBSMR0005773.getMetMbhDscd()); // 모임회원구분코드
			output.setMetMbhDscdNm(oIBSMR0005773.getMetMbhDscdNm()); // 모임회원구분코드명
			output.setMetMbhImgUrlNm(oIBSMR0005773.getMetMbhImgUrlNm()); // 모임회원이미지URL명
			
			// 회비.입금현황.목록.조회.컨트롤러.출력.IO
			List<MbpfRcvstsList2Inq_DODT> outDataGrid2 = new ArrayList<>();
			
			// 회원별 입금내역
			if( oIBSMR0005773.getDis2Grid().size() > 0 ) {
				// 회원별 입금내역
				for( IBSMR0005773_DIS_2_GRID_ODT oMbpfRcvstsData2 : oIBSMR0005773.getDis2Grid()) {
					MbpfRcvstsList2Inq_DODT outData2 = new MbpfRcvstsList2Inq_DODT();
					
					outData2.setTrnDt(oMbpfRcvstsData2.getTrnDt()); // 거래일자
					outData2.setTrnSrno(oMbpfRcvstsData2.getTrnSrno()); // 거래일련번호
					outData2.setTrnBkcd(oMbpfRcvstsData2.getTrnBkcd()); // 거래은행코드
					outData2.setTrbkCdNm(oMbpfRcvstsData2.getTrbkCdNm()); // 거래은행코드명
					outData2.setPtnBkwAcno(oMbpfRcvstsData2.getPtnBkwAcno()); // 상대전행계좌번호
					outData2.setTrnTm(oMbpfRcvstsData2.getTrnTm()); // 거래시각
					outData2.setDpsRapDscd(oMbpfRcvstsData2.getDpsRapDscd()); // 수신입지급구분코드
					outData2.setDpsRapDscdNm(oMbpfRcvstsData2.getDpsRapDscdNm()); // 수신입지급구분코드명
					outData2.setMetTrnStcd(oMbpfRcvstsData2.getMetTrnStcd()); // 모임거래상태코드
					outData2.setMetTrnStcdNm(oMbpfRcvstsData2.getMetTrnStcdNm()); // 모임거래상태코드명
					outData2.setRcvMbhNm(oMbpfRcvstsData2.getRcvMbhNm()); // 입금회원명
					outData2.setMbpfPymAm(oMbpfRcvstsData2.getMbpfPymAm()); // 회비납부금액
					outData2.setMbpfPmtgtAm(oMbpfRcvstsData2.getMbpfPmtgtAm()); // 회비납부대상금액
					outData2.setMetMbpfXmpAm(oMbpfRcvstsData2.getMetMbpfXmpAm()); // 모임회비면제금액
					outData2.setInqOtlnTxt(oMbpfRcvstsData2.getInqOtlnTxt()); // 조회적요내용
					outData2.setPbokPrngOtlnTxt(oMbpfRcvstsData2.getPbokPrngOtlnTxt()); // 통장인자적요내용
					outData2.setMetTrnMemoTxt(oMbpfRcvstsData2.getMetTrnMemoTxt()); // 모임거래메모내용
					outData2.setMdKdcd(oMbpfRcvstsData2.getMdKdcd()); // 매체종류코드
					outData2.setMdKdcdNm(oMbpfRcvstsData2.getMdKdcdNm()); // 매체종류코드명
					outData2.setMetmbWdrYn(oMbpfRcvstsData2.getMetmbWdrYn()); // 모임원출금여부
					outData2.setOrtrDt(oMbpfRcvstsData2.getOrtrDt()); // 원거래일자
					outData2.setOrtrSrno(oMbpfRcvstsData2.getOrtrSrno()); // 원거래일련번호
					
					outDataGrid2.add(outData2);
				}
			}
			output.setDis2Grid(outDataGrid2); // 그리드 건수
			output.setGrid2Cnt(outDataGrid2.size());
		} catch (Exception e) {
			logger.error("IBSMR0005773 전문 error :: {}", e);
			
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
			logger.debug("90190263 모임통장 회비입금 내역 조회 output {} ::: ", output);
		}
		
		return output;
	}
	/**
	 * 모임통장의 거래내역 을 조회하는 컴포넌트
	 * 
	 * @param input 이체요청.정보.조회.DBM.입력.IO
	 * @return 이체요청.정보.조회.DBM.출력.IO
	 */
	@BxmCategory(logicalName="모임통장.거래.내역.조회", description="모임통장 거래내역을 조회하는 컨트롤러", author="90190263")
	public MetPbokTrnPrts_DODT selectMetPbokTrnPrts( MetPbokTrnPrts_DIDT input 
	) throws WFApplicationException  {
		/**
		* @BXMType GetBean
		*/
		// WFInterfaceCfg 생성 컴포넌트
		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class);
		sHRIBSMR0005772_COM= WFApplicationContext.getBean(sHRIBSMR0005772_COM, SHRIBSMR0005772_COM.class);
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		
		/*
		 * 로직 추가
		 */
		if(logger.isDebugEnabled()) {
			logger.debug("90190263 모임통장 거래내역.조회 COM input {} :: ", input);
		}
		//세션고객정보
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession(); 
		if(logger.isDebugEnabled()) {
			logger.debug("currentCust ====== {} ::: ", currentCust);
		} 
		
		MetPbokTrnPrts_DODT output = new MetPbokTrnPrts_DODT();
		
		/**
		 * @BXMType Try
		 * 
		 */
		try{
			/**
			 * 연계시스템 호출
			 * TYPE : MCA
			 * ID :IBSMR0005772
			 * NM : 모임통장 거래내역 조회
			 */
			//  MCA WFInterfaceCfg 객체 획득
			WFInterfaceCfg interfaceCfg  = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg();
			interfaceCfg.setInterfaceId("IBSMR0005772");

	        // WFNciHeader 셋팅
            WFNciHeader wfnciHeader = interfaceCfg.getNciHeader();
            
	        // 간편회원일 경우 userID, 통합고객번호 초기화
	        if( shrCMMLoginSession_COM.isEsnsMbh() == true ) {
	        	wfnciHeader.setEbnkUtzpeNo("");
	            wfnciHeader.setItcsno("");  
	        }

            // interfaceCfg 셋팅
            interfaceCfg.setNciHeader(wfnciHeader);   
	        
	        IBSMR0005772_IDT iIBSMR0005772 = new IBSMR0005772_IDT();
	        iIBSMR0005772.setInqDis(input.getInqDis()); // 조회구분
	        iIBSMR0005772.setMetMngNo(input.getMetMngNo()); // 모임관리번호
	        iIBSMR0005772.setInqStaDt(input.getInqStaDt()); // 조회시작일자
	        iIBSMR0005772.setInqStaTrnSrno(input.getInqStaTrnSrno()); // 조회시작거래일련번호
	        iIBSMR0005772.setInqEndDt(input.getInqEndDt()); // 조회종료일자
	        iIBSMR0005772.setInqEndTrnSrno(input.getInqEndTrnSrno()); // 조회종료거래일련번호
	        iIBSMR0005772.setSctnStaAm(input.getSctnStaAm()); // 구간시작금액
	        iIBSMR0005772.setSctnEndAm(input.getSctnEndAm()); // 구간종료금액
	        iIBSMR0005772.setRapDscd(input.getRapDscd()); // 입지급구분코드
	        iIBSMR0005772.setMetTrnMemoTxt(input.getMetTrnMemoTxt()); // 모임거래메모내용
	        
	    	if(logger.isDebugEnabled()) {
				logger.debug("90190263 모임통장 거래내역.조회 COM iIBSMR0005772 {} :: ", iIBSMR0005772);
			}
	    	
	        WFInfResponse<IBSMR0005772_ODT> mcaOutput = sHRIBSMR0005772_COM.callTrx(iIBSMR0005772, interfaceCfg);
	        
			IBSMR0005772_ODT oIBSMR0005772= mcaOutput.getResponseData();
			if(logger.isDebugEnabled()) {
				logger.debug("90190263 모임통장 거래내역 조회 oIBSMR0005772 {} ::: ", oIBSMR0005772);
			}
			
			output.setMetMngNo(oIBSMR0005772.getMetMngNo()); // 모임관리번호
			output.setEbnkUtzpeNo(oIBSMR0005772.getEbnkUtzpeNo()); // 전자뱅킹이용자번호
			output.setMetCtrStcd(oIBSMR0005772.getMetCtrStcd()); // 모임계약상태코드
			output.setMetCtrStcdNm(oIBSMR0005772.getMetCtrStcdNm()); // 모임계약상태코드명
			output.setMetPbokDscd(oIBSMR0005772.getMetPbokDscd()); // 모임통장구분코드
			output.setMetPbokDscdNm(oIBSMR0005772.getMetPbokDscdNm()); // 모임통장구분코드명
			output.setMetNm(oIBSMR0005772.getMetNm()); // 모임명
			output.setRcvBkwAcno(oIBSMR0005772.getRcvBkwAcno()); // 입금전행계좌번호
			output.setCusUsgBkwAcno(oIBSMR0005772.getCusUsgBkwAcno()); // 고객사용전행계좌번호
			output.setItcsno(oIBSMR0005772.getItcsno()); // 통합고객번호
			output.setCusKorlNm(oIBSMR0005772.getCusKorlNm()); // 고객한글명
			output.setCusBkpnNm(oIBSMR0005772.getCusBkpnNm()); // 고객부기명
			output.setCtBal(oIBSMR0005772.getCtBal()); // 현재잔액
			output.setPayAvlBal(oIBSMR0005772.getPayAvlBal()); // 지급가능잔액
			output.setPdcd(oIBSMR0005772.getPdcd()); // 상품코드
			output.setPdcdKorlNm(oIBSMR0005772.getPdcdKorlNm()); // 상품코드한글명
			output.setPrdKorlAbrNm(oIBSMR0005772.getPrdKorlAbrNm()); // 상품한글단축명
			output.setRlfAcno(oIBSMR0005772.getRlfAcno()); // 안심계좌번호
			output.setMbpfPymDt(oIBSMR0005772.getMbpfPymDt()); // 회비납부일자
			output.setMbpfPymCycd(oIBSMR0005772.getMbpfPymCycd()); // 회비납부주기코드
			output.setMbpfPymCycdNm(oIBSMR0005772.getMbpfPymCycdNm()); // 회비납부주기코드명
			output.setMbpfPmtgtAm(oIBSMR0005772.getMbpfPmtgtAm()); // 회비납부대상금액
			output.setAgmdCollDt(oIBSMR0005772.getAgmdCollDt()); // 동의서징구일자
			output.setAdvpeEno(oIBSMR0005772.getAdvpeEno()); // 권유자직원번호
			output.setAsmnlApvCd(oIBSMR0005772.getAsmnlApvCd()); // 공동명의승인코드
			output.setAsmnlApvCdNm(oIBSMR0005772.getAsmnlApvCdNm()); // 공동명의승인코드명
			output.setRppeChgRgsYn(oIBSMR0005772.getRppeChgRgsYn()); // 대표자변경등록여부
			output.setRppeChgRgsDt(oIBSMR0005772.getRppeChgRgsDt()); // 대표자변경등록일자
			output.setRppeChgVldDt(oIBSMR0005772.getRppeChgVldDt()); // 대표자변경유효일자
			output.setMetDscd(oIBSMR0005772.getMetDscd()); // 모임구분코드
			output.setMetDscdNm(oIBSMR0005772.getMetDscdNm()); // 모임구분코드명
			output.setMetRgsDt(oIBSMR0005772.getMetRgsDt()); // 모임등록일자
			output.setRgsTm(oIBSMR0005772.getRgsTm()); // 등록시각
			output.setMetBscImgUrlNm(oIBSMR0005772.getMetBscImgUrlNm()); // 모임기본이미지URL명
			output.setMetMbhRgsCnt(oIBSMR0005772.getMetMbhRgsCnt());
			output.setMetMbhScssCnt(oIBSMR0005772.getMetMbhScssCnt());
			output.setMetMbhSrno(oIBSMR0005772.getMetMbhSrno()); // 모임회원일련번호
			output.setMetMbhAlsNm(oIBSMR0005772.getMetMbhAlsNm()); // 모임회원별칭명
			output.setMetMbhNm(oIBSMR0005772.getMetMbhNm()); // 모임회원명
			output.setMetMbhDscd(oIBSMR0005772.getMetMbhDscd()); // 모임회원구분코드
			output.setMetMbhDscdNm(oIBSMR0005772.getMetMbhDscdNm()); // 모임회원구분코드명
			output.setNxtTrnDt(oIBSMR0005772.getNxtTrnDt()); // 다음거래일자
			output.setNxtTrnSrno(oIBSMR0005772.getNxtTrnSrno()); // 다음거래일련번호
			// 모임통장.거래.내역.컨트롤러.출력.Sub.IO
			List<MetPbokTrnPrtsGrid> outDataList = new ArrayList<>();
			
			for( IBSMR0005772_GRID_ODT oTrnPrtsData : oIBSMR0005772.getGrid()) {
				MetPbokTrnPrtsGrid outData = new MetPbokTrnPrtsGrid();
				
				outData.setTrnDt(oTrnPrtsData.getTrnDt()); // 거래일자
				outData.setTrnSrno(oTrnPrtsData.getTrnSrno()); // 거래일련번호
				outData.setDpsTrnSrno(oTrnPrtsData.getDpsTrnSrno()); // 수신거래일련번호
				outData.setTrnBkcd(oTrnPrtsData.getTrnBkcd()); // 거래은행코드
				outData.setTrbkCdNm(oTrnPrtsData.getTrbkCdNm()); // 거래은행코드명
				outData.setPtnBkwAcno(oTrnPrtsData.getPtnBkwAcno()); // 상대전행계좌번호
				outData.setTrnTm(oTrnPrtsData.getTrnTm()); // 거래시각
				outData.setDpsRapDscd(oTrnPrtsData.getDpsRapDscd()); // 수신입지급구분코드
				outData.setDpsRapDscdNm(oTrnPrtsData.getDpsRapDscdNm()); // 수신입지급구분코드명
				outData.setMetTrnStcd(oTrnPrtsData.getMetTrnStcd()); // 모임거래상태코드
				outData.setMetTrnStcdNm(oTrnPrtsData.getMetTrnStcdNm()); // 모임거래상태코드명
				outData.setTrnAm(oTrnPrtsData.getTrnAm()); // 거래금액 
				outData.setRcvMbhNm(oTrnPrtsData.getRcvMbhNm()); // 입금회원명
				outData.setMetMbhAlsNm(oTrnPrtsData.getMetMbhAlsNm()); // 모임회원별칭명
				outData.setMetMbhSrno(oTrnPrtsData.getMetMbhSrno()); // 모임회원일련번호
				outData.setPbokPrngOtlnTxt(oTrnPrtsData.getPbokPrngOtlnTxt()); // 통장인자적요내용
				outData.setMetTrnMemoTxt(oTrnPrtsData.getMetTrnMemoTxt()); // 모임거래메모내용
				outData.setRcvMbhNmChgTgtYn(oTrnPrtsData.getRcvMbhNmChgTgtYn()); // 입금회원명변경대상여부
				outData.setBftrBal(oTrnPrtsData.getBftrBal()); // 거래전잔액
				outData.setAftrBal(oTrnPrtsData.getAftrBal()); // 거래후잔액
				outData.setInqOtlnTxt(oTrnPrtsData.getInqOtlnTxt()); // 조회적요내용
				outData.setMdKdcd(oTrnPrtsData.getMdKdcd()); // 매체종류코드
				outData.setMdKdcdNm(oTrnPrtsData.getMdKdcdNm()); // 매체종류코드명
				outData.setMetmbWdrYn(oTrnPrtsData.getMetmbWdrYn()); // 모임원출금여부
				outData.setOrtrDt(oTrnPrtsData.getOrtrDt()); // 원거래일자
				outData.setOrtrSrno(oTrnPrtsData.getOrtrSrno()); // 원거래일련번호
				
				outDataList.add(outData);
			}
			
			output.setGrid(outDataList);
			output.setGridCnt(oIBSMR0005772.getGridCnt()); // 그리드건수
			
			if(logger.isDebugEnabled()) {
				logger.debug("90190263 모임통장 거래내역 조회 COM output {} ::: ", output);
			}
		} catch (Exception e) {
			logger.error("IBSMR0005772 전문 error :: {}", e);
			
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
	 * 당행 이체요청 수취인 정보 조회하는 컴포넌트
	 * 
	 * @param input 이체요청.정보.조회.DBM.입력.IO
	 * @return 이체요청.정보.조회.DBM.출력.IO
	 */
//	@BxmCategory(logicalName="당행.이체.요청.수취인.정보", description="당행 이체요청 수취인 정보 조회하는 컴포넌트", author="90190263")
//	public TbkTsReqRnpeInf_DODT selectTbkTsReqRnpeInf( TbkTsReqRnpeInf_DIDT input 
//	) throws WFApplicationException  {
//		/**
//		* @BXMType GetBean
//		*/
//		// WFInterfaceCfg 생성 컴포넌트
//		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class);
//		sHRIBSMR0000089_COM= WFApplicationContext.getBean(sHRIBSMR0000089_COM, SHRIBSMR0000089_COM.class);
//		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
//		
//		/*
//		 * 로직 추가
//		 */
//		if(logger.isDebugEnabled()) {
//			logger.debug("90190263 당행 이체요청 수취인 정보 COM input {} :: ", input);
//		}
//		//세션고객정보
//		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession(); 
//		if(logger.isDebugEnabled()) {
//			logger.debug("currentCust ====== {} ::: ", currentCust);
//		} 
//		
//		TbkTsReqRnpeInf_DODT output = new TbkTsReqRnpeInf_DODT();		
//		
//		String errMsgTxt = "";
//		
//		/**
//		 * @BXMType Try
//		 * 
//		 */
//		try{
//			/**
//			 * 연계시스템 호출
//			 * TYPE : MCA
//			 * ID :IBSMR0000089
//			 * NM : 당행계좌 입금가능 성명조회
//			 */
//			//  MCA WFInterfaceCfg 객체 획득
//			WFInterfaceCfg interfaceCfg  = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg();
//			interfaceCfg.setInterfaceId("IBSMR0000089");
//
//	        // WFNciHeader 셋팅
//            WFNciHeader wfnciHeader = interfaceCfg.getNciHeader();
//            
//	        // 간편회원일 경우 userID, 통합고객번호 초기화
//	        if( shrCMMLoginSession_COM.isEsnsMbh() == true ) {
//	        	wfnciHeader.setEbnkUtzpeNo("");
//	            wfnciHeader.setItcsno("");  
//	        }
//
//            // interfaceCfg 셋팅
//            interfaceCfg.setNciHeader(wfnciHeader);
//
//	        IBSMR0000089_IDT iIBSMR0000089 = new IBSMR0000089_IDT();
//	        iIBSMR0000089.setWdrAcno(input.getWdrAcno()); // 출금계좌번호
//	        iIBSMR0000089.setActPwnoUsgYn(input.getActPwnoUsgYn()); // 계좌비밀번호사용여부
//	        iIBSMR0000089.setActPwno(input.getActPwno()); // 계좌비밀번호
//	        iIBSMR0000089.setTrnAm(input.getTrnAm()); // 거래금액
//	        iIBSMR0000089.setRsvDt(input.getRsvDt()); // 예약일자
//	        iIBSMR0000089.setRcvBkcd(input.getRcvBkcd()); // 입금은행코드
//	        iIBSMR0000089.setRcvAcno(input.getRcvAcno()); // 입금계좌번호
//	        iIBSMR0000089.setPtnPbokPrngTxt(input.getPtnPbokPrngTxt()); // 상대통장인자내용
//	        iIBSMR0000089.setClnmNoAddSbj(input.getClnmNoAddSbj()); // 집금번호추가사항
//	        iIBSMR0000089.setRnpeFnm(input.getRnpeFnm()); // 수취인성명
//	        iIBSMR0000089.setWdrPbokPrngTxt(input.getWdrPbokPrngTxt()); // 출금통장인자내용
//	        iIBSMR0000089.setMmdaIntRcvAcno(input.getMmdaIntRcvAcno()); // MMDA이자입금계좌번호
//	        iIBSMR0000089.setSaltsDis(input.getSaltsDis()); // 급여이체구분
//	        
//	        
//	        if(logger.isDebugEnabled()) {
//				logger.debug("90190263 당행 이체요청 수취인 정보 iIBSMR0000089 {} ::: ", iIBSMR0000089);
//			}
//	        
//	        WFInfResponse<IBSMR0000089_ODT> mcaOutput = sHRIBSMR0000089_COM.callTrx(iIBSMR0000089, interfaceCfg);
//	        
//	        IBSMR0000089_ODT oIBSMR0000089= mcaOutput.getResponseData();
//
//	        output.setOwacFnm(oIBSMR0000089.getOwacFnm()); // 예금주성명
//	        output.setBftrAfBal(oIBSMR0000089.getBftrAfBal()); // 거래전후잔액
//	        output.setRnpeFnm(oIBSMR0000089.getRnpeFnm()); // 수취인성명
//	        output.setTrnSrno(oIBSMR0000089.getTrnSrno()); // 거래일련번호
//	        output.setFeeAm(oIBSMR0000089.getFeeAm()); // 수수료금액
//	        output.setRduFeeAm(oIBSMR0000089.getRduFeeAm()); // 감면수수료금액
//	        output.setWmbRduAm(oIBSMR0000089.getWmbRduAm()); // 우리멤버스감면금액
//	        output.setFrduRncd(oIBSMR0000089.getFrduRncd()); // 수수료감면사유코드
//	        output.setOldAtrbDpstDlTgtYn(oIBSMR0000089.getOldAtrbDpstDlTgtYn()); // 구속성예금취급대상여부 
//	        output.setRscd("00");
//	        
//			if(logger.isDebugEnabled()) {
//				logger.debug("90190263 당행 이체요청 수취인 정보 oIBSMR0000089 {} ::: ", oIBSMR0000089);
//			}
//		} catch (Exception e) {
//			logger.error("IBSMR0005769 전문 error :: {}", e);
//			
//			if ( e instanceof SFAdaptorApplicationException ) {
//				SFAdaptorApplicationException se = (SFAdaptorApplicationException) e;
//				logger.error("SFAdaptorApplicationException {} ", se);
//				
//				Object[] args = se.getArguments();
//	            
//	            if(args != null && args.length>0) {
//	            	errMsgTxt = args[0].toString();
//				}
//	            
//			} else if ( e instanceof SFInterfaceSystemException ) {
//				SFInterfaceSystemException se = (SFInterfaceSystemException) e;
//				logger.error("SFInterfaceSystemException {} ", se);
//				errMsgTxt = se.getMainMsgTxt();
//	
//			} else if ( e instanceof WFApplicationException) {
//				WFApplicationException we = (WFApplicationException) e;
//				logger.error("WFApplicationException {} ", we);
//				
//				Object[] args = we.getArguments();
//	            
//	            if(args != null && args.length>0) {
//	            	errMsgTxt = args[0].toString();
//				}
//				
//			} else {
//				logger.error("Exception {} ", e);
//				errMsgTxt = e.getMessage();				
//			}
//			output.setRscd("99");
//			output.setRspTxt(errMsgTxt);
//		}
//		return output;
//	}
	
	/**
	 * 타행 이체요청 수취인 정보 조회하는 컴포넌트
	 * 
	 * @param input 이체요청.정보.조회.DBM.입력.IO
	 * @return 이체요청.정보.조회.DBM.출력.IO
	 */
//	@BxmCategory(logicalName="타행.이체.요청.수취인.정보", description="타행 이체요청 수취인 정보 조회하는 컴포넌트", author="90190263")
//	public ObkTsReqRnpeInf_DODT selectObkTsReqRnpeInf( ObkTsReqRnpeInf_DIDT input 
//	) throws WFApplicationException  {
//		/**
//		* @BXMType GetBean
//		*/
//		// WFInterfaceCfg 생성 컴포넌트
//		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class);
//		sHRIBSMR0000090_COM= WFApplicationContext.getBean(sHRIBSMR0000090_COM, SHRIBSMR0000090_COM.class);
//		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
//		
//		/*
//		 * 로직 추가
//		 */
//		if(logger.isDebugEnabled()) {
//			logger.debug("90190263 타행 이체요청 수취인 정보 COM input {} :: ", input);
//		}
//		//세션고객정보
//		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession(); 
//		if(logger.isDebugEnabled()) {
//			logger.debug("currentCust ====== {} ::: ", currentCust);
//		} 
//		
//		ObkTsReqRnpeInf_DODT output = new ObkTsReqRnpeInf_DODT();		
//		
//		String errMsgTxt = "";
//		
//		/**
//		 * @BXMType Try
//		 * 
//		 */
//		try{
//			/**
//			 * 연계시스템 호출
//			 * TYPE : MCA
//			 * ID :IBSMR0000090
//			 * NM : 타행계좌 입금기준예금주조회(IR포함)
//			 */
//			//  MCA WFInterfaceCfg 객체 획득
//			WFInterfaceCfg interfaceCfg  = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg();
//			interfaceCfg.setInterfaceId("IBSMR0000090");
//
//	        // WFNciHeader 셋팅
//            WFNciHeader wfnciHeader = interfaceCfg.getNciHeader();
//            
//	        // 간편회원일 경우 userID, 통합고객번호 초기화
//	        if( shrCMMLoginSession_COM.isEsnsMbh() == true ) {
//	        	wfnciHeader.setEbnkUtzpeNo("");
//	            wfnciHeader.setItcsno("");  
//	        }
//
//            // interfaceCfg 셋팅
//            interfaceCfg.setNciHeader(wfnciHeader);   
//	        
//	        IBSMR0000090_IDT iIBSMR0000090 = new IBSMR0000090_IDT();
//	        iIBSMR0000090.setWdrAcno(input.getWdrAcno()); // 출금계좌번호
//	        iIBSMR0000090.setActPwnoUsgYn(input.getActPwnoUsgYn()); // 계좌비밀번호사용여부
//	        iIBSMR0000090.setActPwno(input.getActPwno()); // 계좌비밀번호
//	        iIBSMR0000090.setTrnAm(input.getTrnAm()); // 거래금액
//	        iIBSMR0000090.setRsvDt(input.getRsvDt()); // 예약일자
//	        iIBSMR0000090.setRcvBkcd(input.getRcvBkcd()); // 입금은행코드
//	        iIBSMR0000090.setRcvAcno(input.getRcvAcno()); // 입금계좌번호
//	        iIBSMR0000090.setPtnPbokPrngTxt(input.getPtnPbokPrngTxt()); // 상대통장인자내용
//	        iIBSMR0000090.setClnmNoAddSbj(input.getClnmNoAddSbj()); // 집금번호추가사항
//	        iIBSMR0000090.setRnpeFnm(input.getRnpeFnm()); // 수취인성명
//	        iIBSMR0000090.setWibeeMnyDduYn(input.getWibeeMnyDduYn()); // 위비머니차감여부
//	        iIBSMR0000090.setXtTgtRgsYn(input.getXtTgtRgsYn()); // 제외대상등록여부
//	        iIBSMR0000090.setAddInqYn(input.getAddInqYn()); // 추가조회여부
//	        iIBSMR0000090.setBokTrnDscd(input.getBokTrnDscd()); // 한국은행거래구분코드
//	        
//	        
//	        WFInfResponse<IBSMR0000090_ODT> mcaOutput = sHRIBSMR0000090_COM.callTrx(iIBSMR0000090, interfaceCfg);
//	        
//			IBSMR0000090_ODT oIBSMR0000090= mcaOutput.getResponseData();
//			
//			output.setOwacFnm(oIBSMR0000090.getOwacFnm()); // 예금주성명
//			output.setBftrAfBal(oIBSMR0000090.getBftrAfBal()); // 거래전후잔액
//			output.setRnpeFnm(oIBSMR0000090.getRnpeFnm()); // 수취인성명
//			output.setTrnSrno(oIBSMR0000090.getTrnSrno()); // 거래일련번호
//			output.setFeeAm(oIBSMR0000090.getFeeAm()); // 수수료금액
//			output.setRduFeeAm(oIBSMR0000090.getRduFeeAm()); // 감면수수료금액
//			output.setWmbRduAm(oIBSMR0000090.getWmbRduAm()); // 우리멤버스감면금액
//			output.setFrduRncd(oIBSMR0000090.getFrduRncd()); // 수수료감면사유코드
//			
//			if(logger.isDebugEnabled()) {
//				logger.debug("90190263 타행 이체요청 수취인 정보 oIBSMR0000090 {} ::: ", oIBSMR0000090);
//			}
//		} catch (Exception e) {
//			logger.error("IBSMR0005769 전문 error :: {}", e);
//			
//			if ( e instanceof SFAdaptorApplicationException ) {
//				SFAdaptorApplicationException se = (SFAdaptorApplicationException) e;
//				logger.error("SFAdaptorApplicationException {} ", se);
//				
//				Object[] args = se.getArguments();
//	            
//	            if(args != null && args.length>0) {
//	            	errMsgTxt = args[0].toString();
//				}
//	            
//			} else if ( e instanceof SFInterfaceSystemException ) {
//				SFInterfaceSystemException se = (SFInterfaceSystemException) e;
//				logger.error("SFInterfaceSystemException {} ", se);
//				errMsgTxt = se.getMainMsgTxt();
//	
//			} else if ( e instanceof WFApplicationException) {
//				WFApplicationException we = (WFApplicationException) e;
//				logger.error("WFApplicationException {} ", we);
//				Object[] args = we.getArguments();
//	            
//				if(args != null && args.length>0) {
//	            	errMsgTxt = args[0].toString();
//				} else {
//					errMsgTxt = we.getMessage();
//				}
//				
//			} else {
//				logger.error("Exception {} ", e);
//				errMsgTxt = e.getMessage();				
//			}
//			output.setRscd("9999");
//			output.setRspTxt(errMsgTxt);
//		}
//		
//		return output;
//	}
	
	/**
	 * 당행 자금이체를 조회하는 컴포넌트
	 * 
	 * @param input 이체요청.정보.조회.DBM.입력.IO
	 * @return 이체요청.정보.조회.DBM.출력.IO
	 */
	@BxmCategory(logicalName="당행.자금이체.조회", description="당행 자금이체를 조회하는 컴포넌트", author="90190263")
	public TbkTsReqRnpeInf_DODT selectTbkFdts( TbkTsReqRnpeInf_DIDT input 
	) throws WFApplicationException  {
		/**
		* @BXMType GetBean
		*/
		// WFInterfaceCfg 생성 컴포넌트
		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class);
		sHRIBSMR0000072_COM= WFApplicationContext.getBean(sHRIBSMR0000072_COM, SHRIBSMR0000072_COM.class);
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		shrCECSession_COM = WFApplicationContext.getBean(shrCECSession_COM, SHRCECSession_COM.class); // 인증보안 세션 컴포넌트
		/*
		 * 로직 추가
		 */
		if(logger.isDebugEnabled()) {
			logger.debug("90190263 당행.자금이체.조회 정보 COM input {} :: ", input);
		}
		//세션고객정보
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession(); 
		if(logger.isDebugEnabled()) {
			logger.debug("currentCust ====== {} ::: ", currentCust);
		} 
		
		TbkTsReqRnpeInf_DODT output = new TbkTsReqRnpeInf_DODT();		
		
		String errMsgTxt = "";
		String errMsgId = "";
		
		/**
		 * @BXMType Try
		 * 
		 */
		try{
			String strTrnAm= input.getTrnAm().toString();	//입금금액
			String sFnetUnqNo = getSequence(strTrnAm);
			
			String encyRbno = currentCust.getEncyRbno(); // 암호화주민사업자등록번호
			CEC_CUST_SCRT_INFO custScrtInfo = shrCECSession_COM.getCustScrtInfo( encyRbno );
			
			
			/**
			 * 연계시스템 호출
			 * TYPE : MCA
			 * ID :IBSMR0000072
			 * NM : 당행계좌간 자금이체조회
			 */
			//  MCA WFInterfaceCfg 객체 획득
			WFInterfaceCfg interfaceCfg  = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg();
			interfaceCfg.setInterfaceId("IBSMR0000072");

  			WFNciHeader tmpNciHeader = interfaceCfg.getNciHeader();
  			// 거래고유번호
  			if (!WFStringUtils.isEmpty(sFnetUnqNo)) {
  				tmpNciHeader.setFnetUnqNo(sFnetUnqNo);	
  			}

  			String twochUsgYn = WFStringUtils.null2void(custScrtInfo.getTwochCrtfYn());
			if ("Y".equals(twochUsgYn)) {
				tmpNciHeader.setEbnkCtlEstUd("2CH");
			}
			
  			interfaceCfg.setNciHeader(tmpNciHeader);
  			
			IBSMR0000072_IDT iIBSMR0000072 = new IBSMR0000072_IDT();
	        iIBSMR0000072.setWdrAcno(input.getWdrAcno()); // 출금계좌번호
	        iIBSMR0000072.setActPwnoUsgYn(input.getActPwnoUsgYn()); // 계좌비밀번호사용여부
	        iIBSMR0000072.setActPwno(input.getActPwno()); // 계좌비밀번호
	        iIBSMR0000072.setTrnAm(input.getTrnAm()); // 거래금액
	        iIBSMR0000072.setRsvDt(input.getRsvDt()); // 예약일자
	        iIBSMR0000072.setRcvBkcd(input.getRcvBkcd()); // 입금은행코드
	        iIBSMR0000072.setRcvAcno(input.getRcvAcno()); // 입금계좌번호
	        iIBSMR0000072.setPtnPbokPrngTxt(input.getPtnPbokPrngTxt()); // 상대통장인자내용
	        iIBSMR0000072.setClnmNoAddSbj(input.getClnmNoAddSbj()); // 집금번호추가사항
	        iIBSMR0000072.setRnpeFnm(input.getRnpeFnm()); // 수취인성명
	        iIBSMR0000072.setWibeeMnyDduYn(input.getWibeeMnyDduYn()); // 위비머니차감여부
	        iIBSMR0000072.setXtTgtRgsYn(input.getXtTgtRgsYn()); // 제외대상등록여부
	        iIBSMR0000072.setMretFdYn(input.getMretFdYn()); // 월세자금여부
	        
	        if(logger.isDebugEnabled()) {
				logger.debug("90190263 당행.자금이체.조회 정보 COM iIBSMR0000072 {} :: ", iIBSMR0000072);
			}
	        
	        WFInfResponse<IBSMR0000072_ODT> mcaOutput = sHRIBSMR0000072_COM.callTrx(iIBSMR0000072, interfaceCfg);
	        
			IBSMR0000072_ODT oIBSMR0000072= mcaOutput.getResponseData();
			
			if(logger.isDebugEnabled()) {
				logger.debug("90190263 당행.자금이체.조회 정보 COM oIBSMR0000072 {} :: ", oIBSMR0000072);
			}
			
			output.setOwacFnm(oIBSMR0000072.getOwacFnm()); // 예금주성명
			output.setBftrAfBal(oIBSMR0000072.getBftrAfBal()); // 거래전후잔액
			output.setRnpeFnm(oIBSMR0000072.getRnpeFnm()); // 수취인성명
			output.setTrnSrno(oIBSMR0000072.getTrnSrno()); // 거래일련번호
			output.setFeeAm(oIBSMR0000072.getFeeAm()); // 수수료금액
			output.setRduFeeAm(oIBSMR0000072.getRduFeeAm()); // 감면수수료금액
			output.setWmbRduAm(oIBSMR0000072.getWmbRduAm()); // 우리멤버스감면금액
			output.setFrduRncd(oIBSMR0000072.getFrduRncd()); // 수수료감면사유코드
			output.setOldAtrbDpstDlTgtYn(oIBSMR0000072.getOldAtrbDpstDlTgtYn()); // 구속성예금취급대상여부
			output.setNrsrYn1(oIBSMR0000072.getNrsrYn1()); // 비거주자여부_1
			output.setNrsrYn2(oIBSMR0000072.getNrsrYn2()); // 비거주자여부_2
			output.setRscd("0000");

			if(logger.isDebugEnabled()) {
				logger.debug("90190263 당행.자금이체.조회 정보 COM oIBSMR0000072 {} ::: ", oIBSMR0000072);
			}
		} catch (Exception e) {
			logger.error("IBSMR0005769 전문 error :: {}", e);
			
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
				Object[] args = we.getArguments();
	            
				if(args != null && args.length>0) {
	            	errMsgTxt = args[0].toString();
				} else {
					errMsgTxt = we.getMessage();
				}
				
			} else {
				logger.error("Exception {} ", e);
				errMsgId = "9999";
				errMsgTxt = e.getMessage();				
			}
			output.setRscd(errMsgId);
			output.setRspTxt(errMsgTxt);
		}
		
		return output;
	}
	
	/**
	 * 타행 자금이체를 조회하는 컴포넌트
	 * 
	 * @param input 이체요청.정보.조회.DBM.입력.IO
	 * @return 이체요청.정보.조회.DBM.출력.IO
	 */
	@BxmCategory(logicalName="타행.자금이체.조회", description="타행 자금이체를 조회하는 컴포넌트", author="90190263")
	public ObkTsReqRnpeInf_DODT selectObkFdts( ObkTsReqRnpeInf_DIDT input 
	) throws WFApplicationException  {
		/**
		* @BXMType GetBean
		*/
		// WFInterfaceCfg 생성 컴포넌트
		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class);
		sHRIBSMR0000073_COM= WFApplicationContext.getBean(sHRIBSMR0000073_COM, SHRIBSMR0000073_COM.class);
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		shrCECSession_COM = WFApplicationContext.getBean(shrCECSession_COM, SHRCECSession_COM.class); // 인증보안 세션 컴포넌트
		
		/*
		 * 로직 추가
		 */
		if(logger.isDebugEnabled()) {
			logger.debug("90190263 타행.자금이체.조회 정보 COM input {} :: ", input);
		}
		//세션고객정보
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession(); 
		if(logger.isDebugEnabled()) {
			logger.debug("currentCust ====== {} ::: ", currentCust);
		} 
		
		ObkTsReqRnpeInf_DODT output = new ObkTsReqRnpeInf_DODT();
		
		/**
		 * @BXMType Try
		 * 
		 */
		try{
			String strTrnAm= input.getTrnAm().toString();	//입금금액
			String sFnetUnqNo = getSequence(strTrnAm);
			
			String encyRbno = currentCust.getEncyRbno(); // 암호화주민사업자등록번호
			CEC_CUST_SCRT_INFO custScrtInfo = shrCECSession_COM.getCustScrtInfo( encyRbno );
			
			/**
			 * 연계시스템 호출
			 * TYPE : MCA
			 * ID :IBSMR0000073
			 * NM : 당행계좌간 자금이체조회
			 */
			//  MCA WFInterfaceCfg 객체 획득
			WFInterfaceCfg interfaceCfg  = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg();
			interfaceCfg.setInterfaceId("IBSMR0000073");

  			WFNciHeader tmpNciHeader = interfaceCfg.getNciHeader();
  			// 거래고유번호
  			if (!WFStringUtils.isEmpty(sFnetUnqNo)) {
  				tmpNciHeader.setFnetUnqNo(sFnetUnqNo);	
  			}

  			String twochUsgYn = WFStringUtils.null2void(custScrtInfo.getTwochCrtfYn());
			if ("Y".equals(twochUsgYn)) {
				tmpNciHeader.setEbnkCtlEstUd("2CH");
			}
			
  			interfaceCfg.setNciHeader(tmpNciHeader);
  			
	        IBSMR0000073_IDT iIBSMR0000073 = new IBSMR0000073_IDT();
	      
	        iIBSMR0000073.setWdrAcno(input.getWdrAcno()); // 출금계좌번호
	        iIBSMR0000073.setActPwnoUsgYn(input.getActPwnoUsgYn()); // 계좌비밀번호사용여부
	        iIBSMR0000073.setActPwno(input.getActPwno()); // 계좌비밀번호
	        iIBSMR0000073.setTrnAm(input.getTrnAm()); // 거래금액
	        iIBSMR0000073.setRsvDt(input.getRsvDt()); // 예약일자
	        iIBSMR0000073.setRcvBkcd(input.getRcvBkcd()); // 입금은행코드
	        iIBSMR0000073.setRcvAcno(input.getRcvAcno()); // 입금계좌번호
	        iIBSMR0000073.setPtnPbokPrngTxt(input.getPtnPbokPrngTxt()); // 상대통장인자내용
	        iIBSMR0000073.setClnmNoAddSbj(input.getClnmNoAddSbj()); // 집금번호추가사항
	        iIBSMR0000073.setRnpeFnm(input.getRnpeFnm()); // 수취인성명
	        iIBSMR0000073.setWibeeMnyDduYn(input.getWibeeMnyDduYn()); // 위비머니차감여부
	        iIBSMR0000073.setXtTgtRgsYn(input.getXtTgtRgsYn()); // 제외대상등록여부
	        iIBSMR0000073.setMretFdYn(input.getMretFdYn()); // 월세자금여부
	        iIBSMR0000073.setAddInqYn(input.getAddInqYn()); // 추가조회여부
	        iIBSMR0000073.setBokTrnDscd(input.getBokTrnDscd()); // 한국은행거래구분코드
	        
	        if(logger.isDebugEnabled()) {
				logger.debug("90190263 타행.자금이체.조회 정보 COM iIBSMR0000073 {} :: ", iIBSMR0000073);
			}
	        
	        WFInfResponse<IBSMR0000073_ODT> mcaOutput = sHRIBSMR0000073_COM.callTrx(iIBSMR0000073, interfaceCfg);
	        
			IBSMR0000073_ODT oIBSMR0000073= mcaOutput.getResponseData();
			
			if(logger.isDebugEnabled()) {
				logger.debug("90190263 타행.자금이체.조회 정보 COM oIBSMR0000073 {} :: ", oIBSMR0000073);
			}
			
			output.setOwacFnm(oIBSMR0000073.getOwacFnm()); // 예금주성명
			output.setBftrAfBal(oIBSMR0000073.getBftrAfBal()); // 거래전후잔액
			output.setRnpeFnm(oIBSMR0000073.getRnpeFnm()); // 수취인성명
			output.setTrnSrno(oIBSMR0000073.getTrnSrno()); // 거래일련번호
			output.setFeeAm(oIBSMR0000073.getFeeAm()); // 수수료금액
			output.setRduFeeAm(oIBSMR0000073.getRduFeeAm()); // 감면수수료금액
			output.setWmbRduAm(oIBSMR0000073.getWmbRduAm()); // 우리멤버스감면금액
			output.setFrduRncd(oIBSMR0000073.getFrduRncd()); // 수수료감면사유코드
			output.setOldAtrbDpstDlTgtYn(oIBSMR0000073.getOldAtrbDpstDlTgtYn()); // 구속성예금취급대상여부
			output.setNrsrYn1(oIBSMR0000073.getNrsrYn1()); // 비거주자여부_1
			output.setNrsrYn2(oIBSMR0000073.getNrsrYn2()); // 비거주자여부_2
			output.setRscd("0000"); 
			output.setRspTxt("정상처리되었습니다.");
			
			if(logger.isDebugEnabled()) {
				logger.debug("90190263 타행.자금이체.조회 정보 COM oIBSMR0000073 {} ::: ", oIBSMR0000073);
			}
		} catch (Exception e) {
			logger.error("IBSMR0000073 전문 error :: {}", e);
			
			if ( e instanceof SFAdaptorApplicationException ) {
				SFAdaptorApplicationException se = (SFAdaptorApplicationException) e;
				logger.error("SFAdaptorApplicationException {} ", se);
	            
				WFInfErrorResponse<IBSMR0000073_ODT> errorResponse = se.getInfErrorResponse();
				
				String rspRstDscd = errorResponse.getSystemHeader().getRspRstDscd();
				
				Object[] args = se.getArguments();
	            
		        String rtcdTxt = "";
		        if(args != null && args.length>0) {
		        	rtcdTxt = args[0].toString();
				}

				String chnlErrCd = se.getInfErrorResponse().getNcoHeader().getChnlErrCd(); //채널오류코드
				
				// 응답결과구분코드 (타임아웃식별용)
				String errMsg = "";
				// 타임아웃 발생케이스! 타임아웃 오류코드(기타오류메시지) Set
				if("O".equals(rspRstDscd) ) {
		    		// asIs : TRTMO9999
					errMsg  = "상대은행 또는 금융결제원의 사정으로 이체가 지연되고 있습니다. '이체결과조회'로 진행상태를 확인할 수 있습니다.";
				} else {
					errMsg = rtcdTxt;
				}
				output.setChnlErrCd(chnlErrCd);
				output.setRscd(se.getCode());
				output.setRspTxt(errMsg);
				
			} else if ( e instanceof SFInterfaceSystemException ) {
				SFInterfaceSystemException se = (SFInterfaceSystemException) e;
				
				logger.debug("IBSMR0000073_ODT SFInterfaceSystemException 오류 msgID | errorMsg  : [{}], [{}] ",se.getMsgId(), se.getMessage());
				String chnlErrCd = se.getInfErrorResponse().getNcoHeader().getChnlErrCd();	//채널오류코드
				
				output.setChnlErrCd(chnlErrCd);
				output.setRscd(se.getMsgId());
				output.setRspTxt(se.getMainMsgTxt());
			} else if ( e instanceof WFApplicationException) {
				WFApplicationException we = (WFApplicationException) e;
				logger.debug("IBSMR0000073_ODT WFApplicationException 오류 msgID | errorMsg  : [{}], [{}] ",we.getCode(), we.getMessage());
				
				Object[] args = we.getArguments();
	            
		        String rtcdTxt = "";
		        if(args != null && args.length>0) {
		        	rtcdTxt = args[0].toString();
				} else {
					rtcdTxt = we.getMessage();
				}

				output.setRscd(we.getCode());
				output.setRspTxt(rtcdTxt);
				
			} else {
				logger.debug("IBSMR0000073_ODT Exception 오류 errorMsg  : [{}], [{}] ", e.getMessage());
				logger.error("IBSMR0000073_ODT 전문 error :: {}", e);
		
				output.setRscd("9999");
				output.setRspTxt(e.getMessage());	
			}
		}
			
		return output;
	}
	
	/**
	 * 일련번호(거래고유번호) 채번
	 *   타행,가상계좌 전문 호출시 헤더 항목 Set
	 *
	 * @param	void
	 * @return	String
	 * @throws	WFApplicationException
	 */
	@BxmCategory(logicalName="일련번호(거래고유번호) 채번", description="일련번호(거래고유번호) 채번", author="90190315")
	private String getSequence(String trnAm) {

		/**
		* @BXMType GetBean
		*/
		sHRSequenceGenerator_COM= WFApplicationContext.getBean(sHRSequenceGenerator_COM, SHRSequenceGenerator_COM.class);

		String[] szSEQ =  sHRSequenceGenerator_COM.getSequenceByDBName(Long.parseLong(trnAm), "ZEUSDS");
		String seq = WFStringUtils.getNstring(Integer.parseInt(szSEQ[2]), 8);
		
		logger.debug("[MPBMetPbokFncTrnMng_SVC] 거래고유번호 채번 seqNo :  {} ", seq);
		return seq;
	}
	
	/**
	 * 당행 자금이체를 실행하는 컴포넌트
	 * 
	 * @param input 이체요청.정보.조회.DBM.입력.IO
	 * @return 이체요청.정보.조회.DBM.출력.IO
	 */
	@BxmCategory(logicalName="당행.자금이체.실행.등록", description="당행 자금이체를 실행하는 컴포넌트", author="90190263")
	public TbkFdtsExe_DODT insertTbkFdtsExe( TbkFdtsExe_DIDT input 
	) throws WFApplicationException  {
		/**
		* @BXMType GetBean
		*/
		// WFInterfaceCfg 생성 컴포넌트
		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class);
		sHRIBSMR0000093_COM= WFApplicationContext.getBean(sHRIBSMR0000093_COM, SHRIBSMR0000093_COM.class);
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		shrCECSession_COM = WFApplicationContext.getBean(shrCECSession_COM, SHRCECSession_COM.class); // 인증보안 세션 컴포넌트
		
		/*
		 * 로직 추가
		 */
		if(logger.isDebugEnabled()) {
			logger.debug("90190263 당행계좌간 자금이체 실행 정보 COM input {} :: ", input);
		}
		//세션고객정보
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession(); 
		if(logger.isDebugEnabled()) {
			logger.debug("currentCust ====== {} ::: ", currentCust);
		} 
		
		TbkFdtsExe_DODT output = new TbkFdtsExe_DODT();		
		String errMsgTxt = "";
		String errMsgId = "";
		
		/**
		 * @BXMType Try
		 * 
		 */
		try{
			/**
			 * 거래고유번호 채번
			 */
			String strTrnAm= input.getTrnAm().toString();	//입금금액
			String sFnetUnqNo = getSequence(strTrnAm);

			String encyRbno = currentCust.getEncyRbno(); // 암호화주민사업자등록번호
			CEC_CUST_SCRT_INFO custScrtInfo = shrCECSession_COM.getCustScrtInfo( encyRbno );
			
			if(logger.isDebugEnabled()) {
				logger.debug("custScrtInfo ====== {} ::: ", custScrtInfo);
			} 
			
			/**
			 * 연계시스템 호출
			 * TYPE : MCA
			 * ID :IBSMR0000093
			 * NM :당행계좌간 자금이체 실행
			 */
			//  MCA WFInterfaceCfg 객체 획득
			WFInterfaceCfg interfaceCfg  = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg();
			interfaceCfg.setInterfaceId("IBSMR0000093");

			/*=============================================================
			 * 2채널(투채널)_전화사용자인경우, 비대면공통 헤더 커스텀 값추가
			 *=============================================================*/
  			WFNciHeader tmpNciHeader = interfaceCfg.getNciHeader();
  			// 거래고유번호
  			if (!WFStringUtils.isEmpty(sFnetUnqNo)) {
  				tmpNciHeader.setFnetUnqNo(sFnetUnqNo);	
  			}
  			
  			String twochUsgYn = WFStringUtils.null2void(custScrtInfo.getTwochCrtfYn());
			if ("Y".equals(twochUsgYn)) {
				tmpNciHeader.setEbnkCtlEstUd("2CH");
			}
			
  			interfaceCfg.setNciHeader(tmpNciHeader);
  			
	        IBSMR0000093_IDT iIBSMR0000093 = new IBSMR0000093_IDT();
	        iIBSMR0000093.setWdrAcno(input.getWdrAcno()); // 출금계좌번호
	        iIBSMR0000093.setActPwnoUsgYn(input.getActPwnoUsgYn()); // 계좌비밀번호사용여부
	        iIBSMR0000093.setActPwno(input.getActPwno()); // 계좌비밀번호
	        iIBSMR0000093.setTrnAm(input.getTrnAm()); // 거래금액
	        iIBSMR0000093.setRsvDt(input.getRsvDt()); // 예약일자
	        iIBSMR0000093.setRcvBkcd(input.getRcvBkcd()); // 입금은행코드
	        iIBSMR0000093.setRcvAcno(input.getRcvAcno()); // 입금계좌번호
	        iIBSMR0000093.setPtnPbokPrngTxt(input.getPtnPbokPrngTxt()); // 상대통장인자내용
	        iIBSMR0000093.setClnmNoAddSbj(input.getClnmNoAddSbj()); // 집금번호추가사항
	        iIBSMR0000093.setRnpeFnm(input.getRnpeFnm()); // 수취인성명
	        iIBSMR0000093.setWdrPbokPrngTxt(input.getWdrPbokPrngTxt()); // 출금통장인자내용
	        iIBSMR0000093.setSaltsDis(input.getSaltsDis()); // 급여이체구분
	        iIBSMR0000093.setNrsrYn1(input.getNrsrYn1()); // 비거주자여부_1
	        iIBSMR0000093.setNrsrYn2(input.getNrsrYn2()); // 비거주자여부_2
	        iIBSMR0000093.setWibeeMnyDduYn(input.getWibeeMnyDduYn()); // 위비머니차감여부
	        iIBSMR0000093.setMretFdYn(input.getMretFdYn()); // 월세자금여부
	        iIBSMR0000093.setOldAtrbDpstDlTgtYn(input.getOldAtrbDpstDlTgtYn()); // 구속성예금취급대상여부 

			if(logger.isDebugEnabled()) {
				logger.debug("90190263 당행계좌간 자금이체 실행 정보 COM iIBSMR0000093 {} ::: ", iIBSMR0000093);
			}
			
	        WFInfResponse<IBSMR0000093_ODT> mcaOutput = sHRIBSMR0000093_COM.callTrx(iIBSMR0000093, interfaceCfg);
	        
	        IBSMR0000093_ODT oIBSMR0000093= mcaOutput.getResponseData();

			if(logger.isDebugEnabled()) {
				logger.debug("90190263 당행계좌간 자금이체 실행 정보 COM oIBSMR0000093 {} ::: ", oIBSMR0000093);
			}
			
	        output.setOwacFnm(oIBSMR0000093.getOwacFnm()); // 예금주성명
			output.setBftrAfBal(oIBSMR0000093.getBftrAfBal()); // 거래전후잔액
			output.setRnpeFnm(oIBSMR0000093.getRnpeFnm()); // 수취인성명
			output.setTrnSrno(oIBSMR0000093.getTrnSrno()); // 거래일련번호
			output.setFeeAm(oIBSMR0000093.getFeeAm()); // 수수료금액
			output.setRduFeeAm(oIBSMR0000093.getRduFeeAm()); // 감면수수료금액
			output.setWmbRduAm(oIBSMR0000093.getWmbRduAm()); // 우리멤버스감면금액
			output.setFrduRncd(oIBSMR0000093.getFrduRncd()); // 수수료감면사유코드
			output.setNpbokTrnCnt(oIBSMR0000093.getNpbokTrnCnt()); // 무통장거래건수
			output.setTrhsSrno(oIBSMR0000093.getTrhsSrno()); // 거래명세일련번호
			output.setRspTxt(oIBSMR0000093.getRspTxt()); // 응답내용
			output.setRscd("0000");
		} catch (Exception e) {
			logger.error("IBSMR0000093 전문 error :: {}", e);
			
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
				Object[] args = we.getArguments();
	            
				if(args != null && args.length>0) {
	            	errMsgTxt = args[0].toString();
				} else {
					errMsgTxt = we.getMessage();
				}
				
			} else {
				logger.error("Exception {} ", e);
				errMsgId = "9999";
				errMsgTxt = e.getMessage();				
			}
			output.setRscd(errMsgId);
			output.setRspTxt(errMsgTxt);
		}

		if(logger.isDebugEnabled()) {
			logger.debug("90190263 당행.자금이체.실행.등록 COM output {} ::: ", output);
		}
		
		return output;
	}
			
	/**
	 * 타행 자금이체를 실행하는 컴포넌트
	 * 
	 * @param input 이체요청.정보.조회.DBM.입력.IO
	 * @return 이체요청.정보.조회.DBM.출력.IO
	 */
	@BxmCategory(logicalName="타행.자금이체.실행.등록", description="타행 자금이체를 실행하는 컴포넌트", author="90190263")
	public ObkFdtsExe_DODT insertObkFdtsExe( ObkFdtsExe_DIDT input 
	) throws WFApplicationException  {
		/**
		* @BXMType GetBean
		*/
		// WFInterfaceCfg 생성 컴포넌트
		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class);
		sHRIBSMR0000094_COM= WFApplicationContext.getBean(sHRIBSMR0000094_COM, SHRIBSMR0000094_COM.class);
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		shrCECSession_COM = WFApplicationContext.getBean(shrCECSession_COM, SHRCECSession_COM.class); // 인증보안 세션 컴포넌트
		/*
		 * 로직 추가
		 */
		if(logger.isDebugEnabled()) {
			logger.debug("90190263 타행.자금이체.실행.등록 정보 COM input {} :: ", input);
		}
		//세션고객정보
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession(); 
		if(logger.isDebugEnabled()) {
			logger.debug("currentCust ====== {} ::: ", currentCust);
		} 
		
		ObkFdtsExe_DODT output = new ObkFdtsExe_DODT();		
		
		String errMsgTxt = "";
		String errMsgId = "";
		
		/**
		 * @BXMType Try
		 * 
		 */
		try{
			/**
			 * 거래고유번호 채번
			 */
			String strTrnAm= input.getTrnAm().toString();	//입금금액
			String sFnetUnqNo = getSequence(strTrnAm);

			String encyRbno = currentCust.getEncyRbno(); // 암호화주민사업자등록번호
			CEC_CUST_SCRT_INFO custScrtInfo = shrCECSession_COM.getCustScrtInfo( encyRbno );
			
			if(logger.isDebugEnabled()) {
				logger.debug("custScrtInfo ====== {} ::: ", custScrtInfo);
			} 
			
			
			/**
			 * 연계시스템 호출
			 * TYPE : MCA
			 * ID :IBSMR0000094
			 * NM : 타행계좌간 자금이체 실행
			 */
			//  MCA WFInterfaceCfg 객체 획득
			WFInterfaceCfg interfaceCfg  = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg();
			interfaceCfg.setInterfaceId("IBSMR0000094");
			
	        
  			WFNciHeader tmpNciHeader = interfaceCfg.getNciHeader();
  			// 거래고유번호
  			if (!WFStringUtils.isEmpty(sFnetUnqNo)) {
  				tmpNciHeader.setFnetUnqNo(sFnetUnqNo);	
  			}

  			String twochUsgYn = WFStringUtils.null2void(custScrtInfo.getTwochCrtfYn());
			if ("Y".equals(twochUsgYn)) {
				tmpNciHeader.setEbnkCtlEstUd("2CH");
			}
			
  			interfaceCfg.setNciHeader(tmpNciHeader);
			
	        IBSMR0000094_IDT iIBSMR0000094 = new IBSMR0000094_IDT();
	        iIBSMR0000094.setWdrAcno(input.getWdrAcno()); // 출금계좌번호
	        iIBSMR0000094.setActPwnoUsgYn(input.getActPwnoUsgYn()); // 계좌비밀번호사용여부
	        iIBSMR0000094.setActPwno(input.getActPwno()); // 계좌비밀번호
	        iIBSMR0000094.setTrnAm(input.getTrnAm()); // 거래금액
	        iIBSMR0000094.setRsvDt(input.getRsvDt()); // 예약일자
	        iIBSMR0000094.setRcvBkcd(input.getRcvBkcd()); // 입금은행코드
	        iIBSMR0000094.setRcvAcno(input.getRcvAcno()); // 입금계좌번호
	        iIBSMR0000094.setPtnPbokPrngTxt(input.getPtnPbokPrngTxt()); // 상대통장인자내용
	        iIBSMR0000094.setClnmNoAddSbj(input.getClnmNoAddSbj()); // 집금번호추가사항
	        iIBSMR0000094.setRnpeFnm(input.getRnpeFnm()); // 수취인성명
	        iIBSMR0000094.setWdrPbokPrngTxt(input.getWdrPbokPrngTxt()); // 출금통장인자내용
	        iIBSMR0000094.setSaltsDis(input.getSaltsDis()); // 급여이체구분
	        iIBSMR0000094.setWibeeMnyDduYn(input.getWibeeMnyDduYn()); // 위비머니차감여부
	        iIBSMR0000094.setBokTrnDscd(input.getBokTrnDscd()); // 한국은행거래구분코드
	        iIBSMR0000094.setMretFdYn(input.getMretFdYn()); // 월세자금여부
	        iIBSMR0000094.setInqTlmNo(input.getInqTlmNo()); // 조회전문번호
	        
	        
	    	if(logger.isDebugEnabled()) {
				logger.debug("90190263타행.자금이체.실행.등록 COM iIBSMR0000094 {} :: ", iIBSMR0000094);
			}
	    	
	        WFInfResponse<IBSMR0000094_ODT> mcaOutput = sHRIBSMR0000094_COM.callTrx(iIBSMR0000094, interfaceCfg);
	        
			IBSMR0000094_ODT oIBSMR0000094= mcaOutput.getResponseData();
			
			if(logger.isDebugEnabled()) {
				logger.debug("90190263 타행.자금이체.실행.등록 COM oIBSMR0000094 {} ::: ", oIBSMR0000094);
			}
			
			output.setOwacFnm(oIBSMR0000094.getOwacFnm()); // 예금주성명
			output.setBftrAfBal(oIBSMR0000094.getBftrAfBal()); // 거래전후잔액
			output.setRnpeFnm(oIBSMR0000094.getRnpeFnm()); // 수취인성명
			output.setTrnSrno(oIBSMR0000094.getTrnSrno()); // 거래일련번호
			output.setFeeAm(oIBSMR0000094.getFeeAm()); // 수수료금액
			output.setRduFeeAm(oIBSMR0000094.getRduFeeAm()); // 감면수수료금액
			output.setWmbRduAm(oIBSMR0000094.getWmbRduAm()); // 우리멤버스감면금액
			output.setFrduRncd(oIBSMR0000094.getFrduRncd()); // 수수료감면사유코드
			output.setNpbokTrnCnt(oIBSMR0000094.getNpbokTrnCnt()); // 무통장거래건수
			output.setPayActTrnSrno(oIBSMR0000094.getPayActTrnSrno()); // 지급계좌거래일련번호
			output.setRscd("0000");
			
		} catch (Exception e) {
			logger.error("IBSMR0005769 전문 error :: {}", e);
			
			if ( e instanceof SFAdaptorApplicationException ) {
				SFAdaptorApplicationException se = (SFAdaptorApplicationException) e;
				logger.error("SFAdaptorApplicationException {} ", se);
				
				Object[] args = se.getArguments();
	            
	            errMsgId = se.getCode();
	            
	            WFInfErrorResponse<IBSMR0000073_ODT> errorResponse = se.getInfErrorResponse();
				
				String rspRstDscd = errorResponse.getSystemHeader().getRspRstDscd();
				
				String chnlErrCd = se.getInfErrorResponse().getNcoHeader().getChnlErrCd(); //채널오류코드

				// 타임아웃 발생케이스! 타임아웃 오류코드(기타오류메시지) Set
				if("O".equals(rspRstDscd) ) {
		    		// asIs : TRTMO9999
					errMsgTxt  = "상대은행 또는 금융결제원의 사정으로 이체가 지연되고 있습니다. '이체결과조회'로 진행상태를 확인할 수 있습니다.";
				} else {
					if(args != null && args.length>0) {
						errMsgTxt = args[0].toString();
					}
				}
				
				output.setChnlErrCd(chnlErrCd);
				
			} else if ( e instanceof SFInterfaceSystemException ) {
				SFInterfaceSystemException se = (SFInterfaceSystemException) e;
				logger.error("SFInterfaceSystemException {} ", se);
				String chnlErrCd = se.getInfErrorResponse().getNcoHeader().getChnlErrCd();	//채널오류코드
				
				errMsgId = se.getMsgId();
				errMsgTxt = se.getMainMsgTxt();
				output.setChnlErrCd(chnlErrCd);
				
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
				errMsgId = "9999";
				errMsgTxt = e.getMessage();				
			}
			output.setRscd(errMsgId);
			output.setRspTxt(errMsgTxt);
		}

		if(logger.isDebugEnabled()) {
			logger.debug("90190263 타행.자금이체.실행.등록 COM output {} ::: ", output);
		}
		
		return output;
	}
	
	/**
	 * 당행 회비 돌려받기 
	 * 
	 * @param input 당행회비돌려받기.정보.조회.DBM.입력.IO
	 * @return 당행회비돌려받기.정보.조회.DBM.출력.IO
	 */
	@BxmCategory(logicalName="당행.회비.돌려받기.등록", description="당행 .돌려받기를 실행하는 컴포넌트", author="90190263")
	public TbkMbpfReturn_DODT insertTbkMbpfReturn( TbkMbpfReturn_DIDT input 
	) throws WFApplicationException  {
		/**
		* @BXMType GetBean
		*/
		// WFInterfaceCfg 생성 컴포넌트
		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class);
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		sHRIBSMR0005931_COM = WFApplicationContext.getBean(sHRIBSMR0005931_COM, SHRIBSMR0005931_COM.class);
		
		/*
		 * 로직 추가
		 */
		if(logger.isDebugEnabled()) {
			logger.debug("90190263 당행.회비.돌려받기 정보 COM input {} :: ", input);
		}
		//세션고객정보
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession(); 
		if(logger.isDebugEnabled()) {
			logger.debug("currentCust ====== {} ::: ", currentCust);
		} 
		
		TbkMbpfReturn_DODT output = new TbkMbpfReturn_DODT();		
		
		String errMsgTxt = "";
		String errMsgId = "";
		
		
		/**
		 * @BXMType Try
		 * 
		 */
		try{
			/**
			 * 거래고유번호 채번
			 */
			String strTrnAm= input.getTrnAm().toString();	//입금금액
			String sFnetUnqNo = getSequence(strTrnAm);
			
			/**
			 * 연계시스템 호출
			 * TYPE : MCA
			 * ID :IBSMR0005931
			 * NM :당행 회비 돌려받기 
			 */
			//  MCA WFInterfaceCfg 객체 획득
			WFInterfaceCfg interfaceCfg  = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg();
			interfaceCfg.setInterfaceId("IBSMR0005931");

	        // WFNciHeader 셋팅
            WFNciHeader wfnciHeader = interfaceCfg.getNciHeader();
            
	        // 간편회원일 경우 userID, 통합고객번호 초기화
	        if( shrCMMLoginSession_COM.isEsnsMbh() == true ) {
	        	wfnciHeader.setEbnkUtzpeNo("");
	            wfnciHeader.setItcsno("");  
	        }

            // interfaceCfg 셋팅
            interfaceCfg.setNciHeader(wfnciHeader);   
            
  			WFNciHeader tmpNciHeader = interfaceCfg.getNciHeader();
  			// 거래고유번호
  			if (!WFStringUtils.isEmpty(sFnetUnqNo)) {
  				tmpNciHeader.setFnetUnqNo(sFnetUnqNo);	
  			}
  			interfaceCfg.setNciHeader(tmpNciHeader);
  			
	        IBSMR0005931_IDT iIBSMR0005931 = new IBSMR0005931_IDT();
	        iIBSMR0005931.setMetMngNo(input.getMetMngNo()); // 모임관리번호
	        iIBSMR0005931.setTrnDt(input.getTrnDt()); // 거래일자
	        iIBSMR0005931.setTrnSrno(input.getTrnSrno()); // 거래일련번호
	        iIBSMR0005931.setWdrAcno(input.getWdrAcno()); // 출금계좌번호
	        iIBSMR0005931.setActPwnoUsgYn(input.getActPwnoUsgYn()); // 계좌비밀번호사용여부
	        iIBSMR0005931.setActPwno(input.getActPwno()); // 계좌비밀번호
	        iIBSMR0005931.setTrnAm(input.getTrnAm()); // 거래금액
	        iIBSMR0005931.setRsvDt(input.getRsvDt()); // 예약일자
	        iIBSMR0005931.setRcvBkcd(input.getRcvBkcd()); // 입금은행코드
	        iIBSMR0005931.setRcvAcno(input.getRcvAcno()); // 입금계좌번호
	        iIBSMR0005931.setPtnPbokPrngTxt(input.getPtnPbokPrngTxt()); // 상대통장인자내용
	        iIBSMR0005931.setClnmNoAddSbj(input.getClnmNoAddSbj()); // 집금번호추가사항
	        iIBSMR0005931.setRnpeFnm(input.getRnpeFnm()); // 수취인성명
	        iIBSMR0005931.setWdrPbokPrngTxt(input.getWdrPbokPrngTxt()); // 출금통장인자내용
	        iIBSMR0005931.setSaltsDis(input.getSaltsDis()); // 급여이체구분
	        iIBSMR0005931.setNrsrYn1(input.getNrsrYn1()); // 비거주자여부_1
	        iIBSMR0005931.setNrsrYn2(input.getNrsrYn2()); // 비거주자여부_2
	        iIBSMR0005931.setWibeeMnyDduYn(input.getWibeeMnyDduYn()); // 위비머니차감여부
	        iIBSMR0005931.setMretFdYn(input.getMretFdYn()); // 월세자금여부
	        iIBSMR0005931.setOldAtrbDpstDlTgtYn(input.getOldAtrbDpstDlTgtYn()); // 구속성예금취급대상여부
	        
	    	if(logger.isDebugEnabled()) {
				logger.debug("90190263 당행.회비.돌려받기 정보 COM iIBSMR0005931 {} :: ", iIBSMR0005931);
			}
	    	
	        WFInfResponse<IBSMR0005931_ODT> mcaOutput = sHRIBSMR0005931_COM.callTrx(iIBSMR0005931, interfaceCfg);
	        
	        IBSMR0005931_ODT oIBSMR0005931= mcaOutput.getResponseData();
	        
	        if(logger.isDebugEnabled()) {
	        	logger.debug("90190263 당행.회비.돌려받기 정보 COM oIBSMR0005931 {} :: ", oIBSMR0005931);
	        }
	
	        output.setOwacFnm(oIBSMR0005931.getOwacFnm()); // 예금주성명
	        output.setBftrAfBal(oIBSMR0005931.getBftrAfBal()); // 거래전후잔액
	        output.setRnpeFnm(oIBSMR0005931.getRnpeFnm()); // 수취인성명
	        output.setTrnSrno(oIBSMR0005931.getTrnSrno()); // 거래일련번호
	        output.setFeeAm(oIBSMR0005931.getFeeAm()); // 수수료금액
	        output.setRduFeeAm(oIBSMR0005931.getRduFeeAm()); // 감면수수료금액
	        output.setWmbRduAm(oIBSMR0005931.getWmbRduAm()); // 우리멤버스감면금액
	        output.setFrduRncd(oIBSMR0005931.getFrduRncd()); // 수수료감면사유코드
	        output.setNpbokTrnCnt(oIBSMR0005931.getNpbokTrnCnt()); // 무통장거래건수
	        output.setTrhsSrno(oIBSMR0005931.getTrhsSrno()); // 거래명세일련번호
	        output.setRspTxt(oIBSMR0005931.getRspTxt()); // 응답내용
	        output.setRscd("0000");
	        
		} catch (Exception e) {
			logger.error("IBSMR0005931 전문 error :: {}", e);
			
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
				Object[] args = we.getArguments();
	            
				if(args != null && args.length>0) {
	            	errMsgTxt = args[0].toString();
				} else {
					errMsgTxt = we.getMessage();
				}
				
			} else {
				logger.error("Exception {} ", e);
				errMsgId = "9999";
				errMsgTxt = e.getMessage();				
			}
			output.setRscd(errMsgId);
			output.setRspTxt(errMsgTxt);
		}
	
		if(logger.isDebugEnabled()) {
			logger.debug("90190263 당행 회비 돌려받기 정보 COM output {} ::: ", output);
		}
		
		return output;
	}
	/**
	 * 타행 회비 돌려받기를 관리하는 컴포넌트
	 * 
	 * @param input 타행회비돌려받기.정보.조회.DBM.입력.IO
	 * @return 타행회비돌려받기.정보.조회.DBM.출력.IO
	 */
	@BxmCategory(logicalName="타행.회비.돌려받기.등록", description="타행 회비 돌려받기를 실행하는 컴포넌트", author="90190263")
	public ObkMbpfReturn_DODT insertObkMbpfReturn( ObkMbpfReturn_DIDT input 
	) throws WFApplicationException  {
		/**
		* @BXMType GetBean
		*/
		// WFInterfaceCfg 생성 컴포넌트
		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class);
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		sHRIBSMR0005781_COM= WFApplicationContext.getBean(sHRIBSMR0005781_COM, SHRIBSMR0005781_COM.class);
		
		/*
		 * 로직 추가
		 */
		if(logger.isDebugEnabled()) {
			logger.debug("90190263 타행.회비.돌려받기.등록 COM input {} :: ", input);
		}
		//세션고객정보
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession(); 
		if(logger.isDebugEnabled()) {
			logger.debug("currentCust ====== {} ::: ", currentCust);
		} 
		
		ObkMbpfReturn_DODT output = new ObkMbpfReturn_DODT();		
		String errMsgTxt = "";
		String errMsgId = "";
		
		/**
		 * @BXMType Try
		 * 
		 */
		try{
			/**
			 * 거래고유번호 채번
			 */
			String strTrnAm= input.getTrnAm().toString();	//입금금액
			String sFnetUnqNo = getSequence(strTrnAm);
			
			/**
			 * 연계시스템 호출
			 * TYPE : MCA
			 * ID :SHRIBSMR0005781
			 * NM : 타행.회비.돌려받기 
			 */
			//  MCA WFInterfaceCfg 객체 획득
			WFInterfaceCfg interfaceCfg  = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg();
			interfaceCfg.setInterfaceId("IBSMR0005781");
			
	        // WFNciHeader 셋팅
            WFNciHeader wfnciHeader = interfaceCfg.getNciHeader();
            
	        // 간편회원일 경우 userID, 통합고객번호 초기화
	        if( shrCMMLoginSession_COM.isEsnsMbh() == true ) {
	        	wfnciHeader.setEbnkUtzpeNo("");
	            wfnciHeader.setItcsno("");  
	        }

            // interfaceCfg 셋팅
            interfaceCfg.setNciHeader(wfnciHeader);   
	        
  			WFNciHeader tmpNciHeader = interfaceCfg.getNciHeader();
  			// 거래고유번호
  			if (!WFStringUtils.isEmpty(sFnetUnqNo)) {
  				tmpNciHeader.setFnetUnqNo(sFnetUnqNo);	
  			}
  			interfaceCfg.setNciHeader(tmpNciHeader);
  			
	        IBSMR0005781_IDT iIBSMR0005781 = new IBSMR0005781_IDT();
	        iIBSMR0005781.setMetMngNo(input.getMetMngNo()); // 모임관리번호
	        iIBSMR0005781.setTrnDt(input.getTrnDt()); // 거래일자
	        iIBSMR0005781.setTrnSrno(input.getTrnSrno()); // 거래일련번호
	        iIBSMR0005781.setWdrAcno(input.getWdrAcno()); // 출금계좌번호
	        iIBSMR0005781.setActPwnoUsgYn(input.getActPwnoUsgYn()); // 계좌비밀번호사용여부
	        iIBSMR0005781.setActPwno(input.getActPwno()); // 계좌비밀번호
	        iIBSMR0005781.setTrnAm(input.getTrnAm()); // 거래금액
	        iIBSMR0005781.setRsvDt(input.getRsvDt()); // 예약일자
	        iIBSMR0005781.setRcvBkcd(input.getRcvBkcd()); // 입금은행코드
	        iIBSMR0005781.setRcvAcno(input.getRcvAcno()); // 입금계좌번호
	        iIBSMR0005781.setPtnPbokPrngTxt(input.getPtnPbokPrngTxt()); // 상대통장인자내용
	        iIBSMR0005781.setClnmNoAddSbj(input.getClnmNoAddSbj()); // 집금번호추가사항
	        iIBSMR0005781.setRnpeFnm(input.getRnpeFnm()); // 수취인성명
	        iIBSMR0005781.setWdrPbokPrngTxt(input.getWdrPbokPrngTxt()); // 출금통장인자내용
	        iIBSMR0005781.setSaltsDis(input.getSaltsDis()); // 급여이체구분
	        iIBSMR0005781.setWibeeMnyDduYn(input.getWibeeMnyDduYn()); // 위비머니차감여부
	        iIBSMR0005781.setBokTrnDscd(input.getBokTrnDscd()); // 한국은행거래구분코드
	        iIBSMR0005781.setMretFdYn(input.getMretFdYn()); // 월세자금여부
	        iIBSMR0005781.setInqTlmNo(input.getInqTlmNo()); // 조회전문번호

			if(logger.isDebugEnabled()) {
				logger.debug("90190263 타행.회비.돌려받기.등록 COM iIBSMR0005781  {} ::: ", iIBSMR0005781);
			}
			
	        WFInfResponse<IBSMR0005781_ODT> mcaOutput = sHRIBSMR0005781_COM.callTrx(iIBSMR0005781, interfaceCfg);
	        
			IBSMR0005781_ODT oIBSMR0005781= mcaOutput.getResponseData();
			
			if(logger.isDebugEnabled()) {
				logger.debug("90190263 타행.회비.돌려받기.등록 COM oIBSMR0005781 {} ::: ", oIBSMR0005781);
			}
			
			output.setOwacFnm(oIBSMR0005781.getOwacFnm()); // 예금주성명
			output.setBftrAfBal(oIBSMR0005781.getBftrAfBal()); // 거래전후잔액
			output.setRnpeFnm(oIBSMR0005781.getRnpeFnm()); // 수취인성명
			output.setTrnSrno(oIBSMR0005781.getTrnSrno()); // 거래일련번호
			output.setFeeAm(oIBSMR0005781.getFeeAm()); // 수수료금액
			output.setRduFeeAm(oIBSMR0005781.getRduFeeAm()); // 감면수수료금액
			output.setWmbRduAm(oIBSMR0005781.getWmbRduAm()); // 우리멤버스감면금액
			output.setFrduRncd(oIBSMR0005781.getFrduRncd()); // 수수료감면사유코드
			output.setNpbokTrnCnt(oIBSMR0005781.getNpbokTrnCnt()); // 무통장거래건수
			output.setPayActTrnSrno(oIBSMR0005781.getPayActTrnSrno()); // 지급계좌거래일련번호
			output.setRscd("0000");
			
		} catch (Exception e) {
			logger.error("IBSMR0005781 전문 error :: {}", e);
			
			if ( e instanceof SFAdaptorApplicationException ) {
				SFAdaptorApplicationException se = (SFAdaptorApplicationException) e;
				logger.error("SFAdaptorApplicationException {} ", se);
				
				Object[] args = se.getArguments();
	    
	            errMsgId = se.getCode();
	            
	        	WFInfErrorResponse<IBSMR0005781_ODT> errorResponse = se.getInfErrorResponse();
				
				String rspRstDscd = errorResponse.getSystemHeader().getRspRstDscd();
				
				String chnlErrCd = se.getInfErrorResponse().getNcoHeader().getChnlErrCd(); //채널오류코드
				
				// 타임아웃 발생케이스! 타임아웃 오류코드(기타오류메시지) Set
				if("O".equals(rspRstDscd) ) {
		    		// asIs : TRTMO9999
					errMsgTxt  = "상대은행 또는 금융결제원의 사정으로 이체가 지연되고 있습니다. '이체결과조회'로 진행상태를 확인할 수 있습니다.";
				} else {
				    if(args != null && args.length>0) {
		            	errMsgTxt = args[0].toString();
					}
				}
				output.setChnlErrCd(chnlErrCd);
				
			} else if ( e instanceof SFInterfaceSystemException ) {
				SFInterfaceSystemException se = (SFInterfaceSystemException) e;
				logger.error("SFInterfaceSystemException {} ", se);
				errMsgId = se.getMsgId();
				errMsgTxt = se.getMainMsgTxt();
	
				logger.debug("IBSMR0005781_ODT SFInterfaceSystemException 오류 msgID | errorMsg  : [{}], [{}] ",se.getMsgId(), se.getMessage());
				String chnlErrCd = se.getInfErrorResponse().getNcoHeader().getChnlErrCd();	//채널오류코드
				
				output.setChnlErrCd(chnlErrCd);
			} else if ( e instanceof WFApplicationException) {
				WFApplicationException we = (WFApplicationException) e;
				logger.error("WFApplicationException {} ", we);
				errMsgId = we.getCode();
				Object[] args = we.getArguments();
	            
				if(args != null && args.length>0) {
	            	errMsgTxt = args[0].toString();
				} else {
					errMsgTxt = we.getMessage();
				}
				
			} else {
				logger.error("Exception {} ", e);
				errMsgId = "9999";
				errMsgTxt = e.getMessage();				
			}
			output.setRscd(errMsgId);
			output.setRspTxt(errMsgTxt);
		}
	
		if(logger.isDebugEnabled()) {
			logger.debug("90190263 타행.회비.돌려받기.등록 COM output {} ::: ", output);
		}
		
		return output;
	}
	/**
	 * 모임통장의 전체 이체요청 내역 건수 를 조회하는 컴포넌트
	 * 
	 * @param input 이체요청.정보.조회.DBM.입력.IO
	 * @return selectCnt
	 */
	@BxmCategory(logicalName="전체.이체요청.내역.건수.조회", description="모임통장의 이체요청 내역 정보를 조회하는 컴포넌트", author="90190263")
	public int selectAllTsReqPrtsCnt(MET_PBOK_MBPF_TS_REQ_INF001SelectAllTsReqCnt_DIDT input
	) throws WFApplicationException  {
		/**
		* @BXMType GetBean
		*/
		metPbokTsReqInf001_DBM= WFApplicationContext.getBean(metPbokTsReqInf001_DBM, MET_PBOK_MBPF_TS_REQ_INF001_DBM.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */
		
		// com.skbank.sml.fns.mpb.dbm.MET_PBOK_NTAR_INF001_DBM
		int selectCnt= metPbokTsReqInf001_DBM.selectAllTsReqCnt(input);
		
		return selectCnt;
	}
	
	/**
	 * 모임통장의 전체 이체요청 내역 정보를 조회하는 컴포넌트
	 * 
	 * @param input 이체요청.정보.조회.DBM.입력.IO
	 * @return 이체요청.정보.조회.DBM.출력.IO
	 */
	@BxmCategory(logicalName="전체.이체요청.내역.정보.조회", description="모임통장의 이체요청 내역 정보를 조회하는 컴포넌트", author="90190263")
	public List<MET_PBOK_MBPF_TS_REQ_INF001SelectAllTsReqInf_DODT> selectAllTsReqPrtsInf(MET_PBOK_MBPF_TS_REQ_INF001SelectAllTsReqInf_DIDT input
	) throws WFApplicationException  {
		/**
		* @BXMType GetBean
		*/
		metPbokTsReqInf001_DBM= WFApplicationContext.getBean(metPbokTsReqInf001_DBM, MET_PBOK_MBPF_TS_REQ_INF001_DBM.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */
		// com.skbank.sml.fns.mpb.dbm.MET_PBOK_NTAR_INF001_DBM
		List<MET_PBOK_MBPF_TS_REQ_INF001SelectAllTsReqInf_DODT> output= metPbokTsReqInf001_DBM.selectAllTsReqInf(input);
		
		return output;
	}
	
	/**
	 * 모임통장의 모임원의 이체요청 내역 정보를 조회하는 컴포넌트
	 * 
	 * @param input 이체요청.정보.조회.DBM.입력.IO
	 * @return 이체요청.정보.조회.DBM.출력.IO
	 */
	@BxmCategory(logicalName="모임원.이체요청.내역.정보.조회", description="모임통장의 이체요청 내역 정보를 조회하는 컴포넌트", author="90190263")
	public List<MET_PBOK_MBPF_TS_REQ_INF001SelectMbhTsReqInf_DODT> selectMbhTsReqPrtsInf(MET_PBOK_MBPF_TS_REQ_INF001SelectMbhTsReqInf_DIDT input
	) throws WFApplicationException  {
		/**
		* @BXMType GetBean
		*/
		metPbokTsReqInf001_DBM= WFApplicationContext.getBean(metPbokTsReqInf001_DBM, MET_PBOK_MBPF_TS_REQ_INF001_DBM.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */
		// com.skbank.sml.fns.mpb.dbm.MET_PBOK_NTAR_INF001_DBM
		List<MET_PBOK_MBPF_TS_REQ_INF001SelectMbhTsReqInf_DODT> output= metPbokTsReqInf001_DBM.selectMbhTsReqInf(input);
		
		return output;
	}
	/**
	 * 모임통장의 모임원의 모임통장의 회비 돌려받기 정보를 조회하는 컴포넌트
	 * 
	 * @param input 이체요청.정보.조회.DBM.입력.IO
	 * @return 이체요청.정보.조회.DBM.출력.IO
	 */
	@BxmCategory(logicalName="모임원.회비.돌려받기.정보.조회", description="모임통장의 회비 돌려받기 정보를 조회하는 컴포넌트", author="90190263")
	public MET_PBOK_MBPF_TS_REQ_INF001SelectMbpfRtunInf_DODT selectMbpfRtunInf(MET_PBOK_MBPF_TS_REQ_INF001SelectMbpfRtunInf_DIDT input
	) throws WFApplicationException  {
		/**
		* @BXMType GetBean
		*/
		metPbokTsReqInf001_DBM= WFApplicationContext.getBean(metPbokTsReqInf001_DBM, MET_PBOK_MBPF_TS_REQ_INF001_DBM.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */
		// com.skbank.sml.fns.mpb.dbm.MET_PBOK_NTAR_INF001_DBM
		MET_PBOK_MBPF_TS_REQ_INF001SelectMbpfRtunInf_DODT output= metPbokTsReqInf001_DBM.selectMbpfRtunInf(input);
		
		return output;
	}
	
	/**
	 * 모임통장의 이체요청을 등록하는 컴포넌트
	 * 
	 * @param input 이체요청.정보.등록.DBM.입력.IO
	 * @return 이체요청.정보.등록.DBM.출력.IO
	 */
	@BxmCategory(logicalName="이체요청.내역.정보.등록", description="모임통장의 이체요청을 등록하는 컴포넌트", author="90190263")
	public int insertTsReqPrtsInf(MET_PBOK_MBPF_TS_REQ_INF001InsertTsReqInf_DIDT input
	) throws WFApplicationException  {
		/**
		 * @BXMType VariableDeclaration
		 */
		metPbokTsReqInf001_DBM= WFApplicationContext.getBean(metPbokTsReqInf001_DBM, MET_PBOK_MBPF_TS_REQ_INF001_DBM.class);
		
		// com.skbank.sml.fns.mpb.dbm.MET_PBOK_NTAR_INF001_DBM
		int insertCnt= metPbokTsReqInf001_DBM.insertTsReqInf(input);
		
		return insertCnt;
	}
	
	/**
	 * 모임통장의 이체요청 내역을 수정하는 컴포넌트
	 * 
	 * @param input 이체요청.정보.수정.DBM.입력.IO
	 * @return 이체요청.정보.수정.DBM.출력.IO
	 */
	@BxmCategory(logicalName="이체요청.내역.정보.수정", description="모임통장의 이체요청 내역을 삭제하는 컴포넌트", author="90190263")
	public int updateTsReqPrtsInf(MET_PBOK_MBPF_TS_REQ_INF001UpdateTsReqInf_DIDT input
	) throws WFApplicationException  {
		/**
		 * @BXMType VariableDeclaration
		 */
		metPbokTsReqInf001_DBM= WFApplicationContext.getBean(metPbokTsReqInf001_DBM, MET_PBOK_MBPF_TS_REQ_INF001_DBM.class);
		
		// com.skbank.sml.fns.mpb.dbm.MET_PBOK_NTAR_INF001_DBM
		int updateCnt= metPbokTsReqInf001_DBM.updateTsReqInf(input);
				
		
		return updateCnt;
	}

	/**
	 * 모임통장의 이체요청 상태코드 을 수정하는 컴포넌트
	 * 
	 * @param input 이체요청.정보.수정.DBM.입력.IO
	 * @return 이체요청.정보.수정.DBM.출력.IO
	 */
	@BxmCategory(logicalName="이체요청.상태코드.수정", description="모임통장의 이체요청 상태를 수정 하는 컴포넌트", author="90190263")
	public int updateTsReqStcd(MET_PBOK_MBPF_TS_REQ_INF001UpdateTsReqStcd_DIDT input
	) throws WFApplicationException  {
		/**
		 * @BXMType VariableDeclaration
		 */
		metPbokTsReqInf001_DBM= WFApplicationContext.getBean(metPbokTsReqInf001_DBM, MET_PBOK_MBPF_TS_REQ_INF001_DBM.class);
		
		// com.skbank.sml.fns.mpb.dbm.MET_PBOK_NTAR_INF001_DBM
		int updateCnt= metPbokTsReqInf001_DBM.updateTsReqStcd(input);
				
		return updateCnt;
	}

	
	/**
	 * 모임통장의 이체요청 내역을 수정하는 컴포넌트
	 * 
	 * @param input 이체요청.정보.삭제.DBM.입력.IO
	 * @return 이체요청.정보.삭제.DBM.출력.IO
	 */
	@BxmCategory(logicalName="이체요청.내역.정보.삭제", description="모임통장의 이체요청 내역을 삭제하는 컴포넌트", author="90190263")
	public int deleteTsReqPrtsInf(MET_PBOK_MBPF_TS_REQ_INF001DeleteTsReqInf_DIDT input
	) throws WFApplicationException  {
		/**
		 * @BXMType GetBean
		 */
		metPbokTsReqInf001_DBM= WFApplicationContext.getBean(metPbokTsReqInf001_DBM, MET_PBOK_MBPF_TS_REQ_INF001_DBM.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */
		
		// com.skbank.sml.fns.mpb.dbm.MET_PBOK_NTAR_INF001_DBM
		int output= metPbokTsReqInf001_DBM.deleteTsReqInf(input);
		
		return output;
	}
	
	/**
	 * 모임통장에서 커플통장에 해당하는 모임의 생활비 지출 현황을 조회하는 컴포넌트
	 * 
	 * @param input 생활비.지출.현황.조회.DBM.입력.IO
	 * @return 생활비.지출.현황.조회.DBM.출력.IO
	 */
	@BxmCategory(logicalName="부부.모임.생활비.지출.현황.조회", description="모임통장에서 커플통장에 해당하는 모임의 생활비 지출 현황을 조회하는 컴포넌트", author="90190263")
	public HswfMetLifecExpdPts_DODT selectHswfMetLifecExpdPts(HswfMetLifecExpdPts_DIDT input
	) throws WFApplicationException  {
		/**
		* @BXMType GetBean
		*/
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		//WFInterfaceCfg 생성 컴포넌트
		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class);
		sHRIBSMR0005774_COM= WFApplicationContext.getBean(sHRIBSMR0005774_COM, SHRIBSMR0005774_COM.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */
		HswfMetLifecExpdPts_DODT output= new HswfMetLifecExpdPts_DODT();
			
		/*
		 * 로직 추가
		 */
		if(logger.isDebugEnabled()) {
			logger.debug("90190263 부부.모임.생활비.지출.현황.조회 COM input {} :: ", input);
		}
		//세션고객정보
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession(); 
		if(logger.isDebugEnabled()) {
			logger.debug("currentCust ====== {} ::: ", currentCust);
		} 
		
		/**
		 * @BXMType Try
		 * 
		 */
		try{
			/**
			 * 연계시스템 호출
			 * TYPE : MCA
			 * ID :IBSMR0005774
			 * NM : 모임통장 생활비 지출 현황조회
			 */
			//  MCA WFInterfaceCfg 객체 획득
			WFInterfaceCfg interfaceCfg  = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg();
			interfaceCfg.setInterfaceId("IBSMR0005774");
			

	        // WFNciHeader 셋팅
            WFNciHeader wfnciHeader = interfaceCfg.getNciHeader();
            
	        // 간편회원일 경우 userID, 통합고객번호 초기화
	        if( shrCMMLoginSession_COM.isEsnsMbh() == true ) {
	        	wfnciHeader.setEbnkUtzpeNo("");
	            wfnciHeader.setItcsno("");  
	        }

            // interfaceCfg 셋팅
            interfaceCfg.setNciHeader(wfnciHeader);   
            
	        IBSMR0005774_IDT iIBSMR0005774 = new IBSMR0005774_IDT();
	        iIBSMR0005774.setMetMngNo(input.getMetMngNo()); // 모임관리번호
	        iIBSMR0005774.setInqStaYm(input.getInqStaYm()); // 조회시작년월
	        iIBSMR0005774.setInqEndYm(input.getInqEndYm()); // 조회종료년월
	        
	        WFInfResponse<IBSMR0005774_ODT> mcaOutput = sHRIBSMR0005774_COM.callTrx(iIBSMR0005774, interfaceCfg);
	        
	        IBSMR0005774_ODT oIBSMR0005774= mcaOutput.getResponseData();
	        
	        if(logger.isDebugEnabled()) {
	        	logger.debug("90190263 부부.모임.생활비.지출.현황.조회 oIBSMR0005774 {} ::: ", oIBSMR0005774);
	        }
	        
	        output.setMetMngNo(oIBSMR0005774.getMetMngNo()); // 모임관리번호
	        output.setMetNm(oIBSMR0005774.getMetNm()); // 모임명
	        List<HswfMetLifecExpdPtsSub_DODT> outDataList = new ArrayList<>();
	        for( IBSMR0005774_REPT_FA_ODT expdPtsData :  oIBSMR0005774.getReptFa()) {
	        	HswfMetLifecExpdPtsSub_DODT outData = new HswfMetLifecExpdPtsSub_DODT(); 
	        	outData.setBasYm(expdPtsData.getBasYm()); // 기준년월
	        	outData.setExpdAm(expdPtsData.getExpdAm()); // 지출금액
	        	
	        	outDataList.add(outData);
	        }
	        output.setGrid(outDataList);
	    
		} catch (Exception e) {
			logger.error("IBSMR0005774 전문 error :: {}", e);
			
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
			logger.debug("90190263 부부.모임.생활비.지출.현황.조회 output {} ::: ", output);
		}
		
		
		return output;
	}
	/**
	 * 모임통장에서 커플통장에 해당하는 모임의 생활비 목표를 조회하는 컴포넌트
	 * 
	 * @param input 생활비.목표.정보.조회.DBM.입력.IO
	 * @return 생활비.목표.정보.조회.DBM.출력.IO
	 */
	@BxmCategory(logicalName="부부.모임.생활비.목표.정보.조회", description="모임통장에서 커플통장에 해당하는 모임의 생활비 목표를 조회하는 컴포넌트", author="90190263")
	public MET_PBOK_LIFEC_MNG_LDG001SelectMetPbokLifecMngLdgPkInfo_DODT selectHswfMetLifecGoalInf(MET_PBOK_LIFEC_MNG_LDG001SelectMetPbokLifecMngLdgPkInfo_DIDT input
	) throws WFApplicationException  {
		/**
		 * @BXMType GetBean
		 */
		metPbokLifecMngLdg001_DBM= WFApplicationContext.getBean(metPbokLifecMngLdg001_DBM, MET_PBOK_LIFEC_MNG_LDG001_DBM.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		// com.skbank.sml.fns.mpb.dbm.MET_PBOK_LIFEC_MNG_LDG001_DBM
		MET_PBOK_LIFEC_MNG_LDG001SelectMetPbokLifecMngLdgPkInfo_DODT output  = metPbokLifecMngLdg001_DBM.selectMetPbokLifecMngLdgPkInfo(input);
		
		return output;
	}
	/**
	 * 모임통장에서 커플통장에 해당하는 모임의 생활비 목표를 등록하는 컴포넌트
	 * 
	 * @param input 생활비.목표.설정.DBM.입력.IO
	 * @return 생활비.목표.설정.DBM.출력.IO
	 */
	@BxmCategory(logicalName="부부.모임.생활비.목표.설정.등록", description="모임통장에서 커플통장에 해당하는 모임의 생활비 목표를 등록하는 컴포넌트", author="90190263")
	public int insertHswfMetLifecGoalEst(MET_PBOK_LIFEC_MNG_LDG001InsertMetPbokLifecMngLdgPk_DIDT input
	) throws WFApplicationException  {
		/**
		 * @BXMType GetBean
		 */
		metPbokLifecMngLdg001_DBM= WFApplicationContext.getBean(metPbokLifecMngLdg001_DBM, MET_PBOK_LIFEC_MNG_LDG001_DBM.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		
		// com.skbank.sml.fns.mpb.dbm.MET_PBOK_LIFEC_MNG_LDG001_DBM
		int insertCnt = metPbokLifecMngLdg001_DBM.insertMetPbokLifecMngLdgPk(input);
		
		return insertCnt;
	}
	
	/**
	 * 모임통장에서 커플통장에 해당하는 모임의 생활비 목표를 수정하는 컴포넌트
	 * 
	 * @param input 생활비.목표.설정.DBM.입력.IO
	 * @return 생활비.목표.설정.DBM.출력.IO
	 */
	@BxmCategory(logicalName="부부.모임.생활비.목표.설정.수정", description="모임통장에서 커플통장에 해당하는 모임의 생활비 목표를 등록하는 컴포넌트", author="90190263")
	public int updateHswfMetLifecGoalEst(MET_PBOK_LIFEC_MNG_LDG001UpdateMetPbokLifecMngLdgPk_DIDT input
	) throws WFApplicationException  {
		/**
		 * @BXMType GetBean
		 */
		metPbokLifecMngLdg001_DBM= WFApplicationContext.getBean(metPbokLifecMngLdg001_DBM, MET_PBOK_LIFEC_MNG_LDG001_DBM.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		// com.skbank.sml.fns.mpb.dbm.MET_PBOK_LIFEC_MNG_LDG001_DBM
		int updateCnt = metPbokLifecMngLdg001_DBM.updateMetPbokLifecMngLdgPk(input);
		
		return updateCnt;
	}
	
	/**
	 * 생활비 통장 모임원 당행계좌 송금 가능조회
	 * 
	 * @param input 공동명의인.당행.자금.이체.조회.IN.DTO
	 * @return 공동명의인.당행.자금.이체.조회.OUT.DTO
	 */
	@BxmCategory(logicalName="공동명의인.당행.자금.이체.조회", description="생활비 통장 모임원 당행계좌 송금 가능한지 조회하는 컴포넌트", author="90190263")
	public MPBMetPbokFncTrnMngSelectAsscNompefTbkFdtsOutput_DTO selectAsscNompefTbkFdts( MPBMetPbokFncTrnMngSelectAsscNompefTbkFdtsInput_DTO input 
	) throws WFApplicationException  {
		/**
		* @BXMType GetBean
		*/
		// WFInterfaceCfg 생성 컴포넌트
		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class);
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		sHRIBSMR0006184_COM= WFApplicationContext.getBean(sHRIBSMR0006184_COM, SHRIBSMR0006184_COM.class);
		
		/*
		 * 로직 추가
		 */
		if(logger.isDebugEnabled()) {
			logger.debug("90190263 공동명의인.당행.자금.이체.조회 COM input {} :: ", input);
		}
		//세션고객정보
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession(); 
		if(logger.isDebugEnabled()) {
			logger.debug("currentCust ====== {} ::: ", currentCust);
		} 
		
		MPBMetPbokFncTrnMngSelectAsscNompefTbkFdtsOutput_DTO output = new MPBMetPbokFncTrnMngSelectAsscNompefTbkFdtsOutput_DTO();		
		String errMsgTxt = "";
		String errMsgId = "";
		
		/**
		 * @BXMType Try
		 * 
		 */
		try{
			/**
			 * 연계시스템 호출
			 * TYPE : MCA
			 * ID :IBSMR0006184
			 * NM : 생활비 통장 모임원 당행계좌 송금 가능조회
			 */
			//  MCA WFInterfaceCfg 객체 획득
			WFInterfaceCfg interfaceCfg  = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg();
			interfaceCfg.setInterfaceId("IBSMR0006184");

			IBSMR0006184_IDT iIBSMR0006184 = new IBSMR0006184_IDT();
			iIBSMR0006184.setWdrAcno(input.getWdrAcno()); // 출금계좌번호
			iIBSMR0006184.setActPwnoUsgYn(input.getActPwnoUsgYn()); // 계좌비밀번호사용여부
			iIBSMR0006184.setEncyActPwno(input.getEncyActPwno()); // 암호화계좌비밀번호
			iIBSMR0006184.setTrnAm(input.getTrnAm()); // 거래금액
			iIBSMR0006184.setRcvBkcd(input.getRcvBkcd()); // 입금은행코드
			iIBSMR0006184.setRcvAcno(input.getRcvAcno()); // 입금계좌번호
			iIBSMR0006184.setRnpeFnm(input.getRnpeFnm()); // 수취인성명
			iIBSMR0006184.setWdrPbokPrngTxt(input.getWdrPbokPrngTxt()); // 출금통장인자내용
			iIBSMR0006184.setPtnPbokPrngTxt(input.getPtnPbokPrngTxt()); // 상대통장인자내용
			
	        if(logger.isDebugEnabled()) {
				logger.debug("90190263 공동명의인.당행.자금.이체.조회 COM iIBSMR0006184 {} :: ", iIBSMR0006184);
			}
	        
	        WFInfResponse<IBSMR0006184_ODT> mcaOutput = sHRIBSMR0006184_COM.callTrx(iIBSMR0006184, interfaceCfg);
	        
	        IBSMR0006184_ODT oIBSMR0006184= mcaOutput.getResponseData();
			
			if(logger.isDebugEnabled()) {
				logger.debug("90190263 공동명의인.당행.자금.이체.조회 COM oIBSMR0006184 {} :: ", oIBSMR0006184);
			}
			
			output.setOwacFnm(oIBSMR0006184.getOwacFnm()); // 예금주성명
			output.setBftrAfBal(oIBSMR0006184.getBftrAfBal()); // 거래전후잔액
			output.setRnpeFnm(oIBSMR0006184.getRnpeFnm()); // 수취인성명
			output.setTrhsSrno(oIBSMR0006184.getTrhsSrno()); // 거래명세일련번호
			output.setWdrAcno(oIBSMR0006184.getWdrAcno()); // 출금계좌번호
			output.setRcvAcno(oIBSMR0006184.getRcvAcno()); // 입금계좌번호
			output.setTrnAm(oIBSMR0006184.getTrnAm()); // 거래금액
			output.setPtnPbokPrngTxt(oIBSMR0006184.getPtnPbokPrngTxt()); // 상대통장인자내용
			output.setRscd("0000");
			
		} catch (Exception e) {
			logger.error("IBSMR0006184 전문 error :: {}", e);
			
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
			output.setRscd(errMsgId);
			output.setRspTxt(errMsgTxt);
		}
	
		return output;
	}
	
	/**
	 * 생활비 통장 모임원 타행계좌 송금 가능조회
	 * 
	 * @param input 공동명의인.타행.자금.이체.조회.IN.DTO
	 * @return 공동명의인.타행.자금.이체.조회.OUT.DTO
	 */
	@BxmCategory(logicalName="공동명의인.타행.자금.이체.조회", description="생활비 통장 모임원 타행계좌 송금 가능한지 조회하는 컴포넌트", author="90190263")
	public MPBMetPbokFncTrnMngSelectAsscNompefObkFdtsOutput_DTO selectAsscNompefObkFdts( MPBMetPbokFncTrnMngSelectAsscNompefObkFdtsInput_DTO input 
	) throws WFApplicationException  {
		/**
		* @BXMType GetBean
		*/
		// WFInterfaceCfg 생성 컴포넌트
		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class);
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		sHRIBSMR0006186_COM= WFApplicationContext.getBean(sHRIBSMR0006186_COM, SHRIBSMR0006186_COM.class);
		
		/*
		 * 로직 추가
		 */
		if(logger.isDebugEnabled()) {
			logger.debug("90190263 공동명의인.타행.자금.이체.조회 COM input {} :: ", input);
		}
		//세션고객정보
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession(); 
		if(logger.isDebugEnabled()) {
			logger.debug("currentCust ====== {} ::: ", currentCust);
		} 
		
		MPBMetPbokFncTrnMngSelectAsscNompefObkFdtsOutput_DTO output = new MPBMetPbokFncTrnMngSelectAsscNompefObkFdtsOutput_DTO();		
		
		String errMsgTxt = "";
		String errMsgId = "";
		
		/**
		 * @BXMType Try
		 * 
		 */
		try{
			/**
			 * 연계시스템 호출
			 * TYPE : MCA
			 * ID :IBSMR0006186
			 * NM : 생활비 통장 모임원 타행계좌 송금 가능조회
			 */
			//  MCA WFInterfaceCfg 객체 획득
			WFInterfaceCfg interfaceCfg  = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg();
			interfaceCfg.setInterfaceId("IBSMR0006186");
			
			String strTrnAm= input.getTrnAm().toString();	//입금금액
			String sFnetUnqNo = getSequence(strTrnAm);
			
			WFNciHeader tmpNciHeader = interfaceCfg.getNciHeader();
  			// 거래고유번호
  			if (!WFStringUtils.isEmpty(sFnetUnqNo)) {
  				tmpNciHeader.setFnetUnqNo(sFnetUnqNo);	
  			}
  			
			IBSMR0006186_IDT iIBSMR0006186 = new IBSMR0006186_IDT();
			iIBSMR0006186.setWdrAcno(input.getWdrAcno()); // 출금계좌번호
			iIBSMR0006186.setActPwnoUsgYn(input.getActPwnoUsgYn()); // 계좌비밀번호사용여부
			iIBSMR0006186.setEncyActPwno(input.getEncyActPwno()); // 암호화계좌비밀번호
			iIBSMR0006186.setTrnAm(input.getTrnAm()); // 거래금액
			iIBSMR0006186.setRcvBkcd(input.getRcvBkcd()); // 입금은행코드
			iIBSMR0006186.setRcvAcno(input.getRcvAcno()); // 입금계좌번호
			iIBSMR0006186.setRnpeFnm(input.getRnpeFnm()); // 수취인성명
			iIBSMR0006186.setWdrPbokPrngTxt(input.getWdrPbokPrngTxt()); // 출금통장인자내용
			iIBSMR0006186.setPtnPbokPrngTxt(input.getPtnPbokPrngTxt()); // 상대통장인자내용
			
	        if(logger.isDebugEnabled()) {
				logger.debug("90190263 공동명의인.타행.자금.이체.조회 COM iIBSMR0006186 {} :: ", iIBSMR0006186);
			}
	        
	        WFInfResponse<IBSMR0006186_ODT> mcaOutput = sHRIBSMR0006186_COM.callTrx(iIBSMR0006186, interfaceCfg);
	        
	        IBSMR0006186_ODT oIBSMR0006186= mcaOutput.getResponseData();
			
			if(logger.isDebugEnabled()) {
				logger.debug("90190263 공동명의인.당행.자금.이체.조회 COM oIBSMR0006186 {} :: ", oIBSMR0006186);
			}

			output.setOwacFnm(oIBSMR0006186.getOwacFnm()); // 예금주성명
			output.setBftrAfBal(oIBSMR0006186.getBftrAfBal()); // 거래전후잔액
			output.setRnpeFnm(oIBSMR0006186.getRnpeFnm()); // 수취인성명
			output.setTrhsSrno(oIBSMR0006186.getTrhsSrno()); // 거래명세일련번호
			output.setWdrAcno(oIBSMR0006186.getWdrAcno()); // 출금계좌번호
			output.setRcvAcno(oIBSMR0006186.getRcvAcno()); // 입금계좌번호
			output.setTrnAm(oIBSMR0006186.getTrnAm()); // 거래금액
			output.setPtnPbokPrngTxt(oIBSMR0006186.getPtnPbokPrngTxt()); // 상대통장인자내용
			output.setRscd("0000");
		} catch (Exception e) {
			logger.error("IBSMR0006186 전문 error :: {}", e);
			
			if ( e instanceof SFAdaptorApplicationException ) {
				SFAdaptorApplicationException se = (SFAdaptorApplicationException) e;
				logger.error("SFAdaptorApplicationException {} ", se);
				
				Object[] args = se.getArguments();
	            
	            errMsgId = se.getCode();
	            
	            WFInfErrorResponse<IBSMR0006186_ODT> errorResponse = se.getInfErrorResponse();
				
				String rspRstDscd = errorResponse.getSystemHeader().getRspRstDscd();

				String chnlErrCd = se.getInfErrorResponse().getNcoHeader().getChnlErrCd(); //채널오류코드
				
				// 타임아웃 발생케이스! 타임아웃 오류코드(기타오류메시지) Set
				if("O".equals(rspRstDscd) ) {
		    		// asIs : TRTMO9999
					errMsgTxt  = "상대은행 또는 금융결제원의 사정으로 이체가 지연되고 있습니다. '이체결과조회'로 진행상태를 확인할 수 있습니다.";
				} else {
					if(args != null && args.length>0) {
			        	errMsgTxt = args[0].toString();
					}
				}
				output.setChnlErrCd(chnlErrCd);
				
			} else if ( e instanceof SFInterfaceSystemException ) {
				SFInterfaceSystemException se = (SFInterfaceSystemException) e;
				logger.error("SFInterfaceSystemException {} ", se);
				String chnlErrCd = se.getInfErrorResponse().getNcoHeader().getChnlErrCd();	//채널오류코드
				output.setChnlErrCd(chnlErrCd);
				
				errMsgId = se.getMsgId();
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
		        
				errMsgId = we.getCode();
				
			} else {
				logger.error("Exception {} ", e);
				errMsgId = "9999";
				errMsgTxt = e.getMessage();				
			}
			output.setRscd(errMsgId);
			output.setRspTxt(errMsgTxt);
		}
		
		return output;
	}
	
	/**
	 * 생활비 통장 모임원 당행계좌 송금 실행
	 * 
	 * @param input 이체요청.정보.조회.DBM.입력.IO
	 * @return 이체요청.정보.조회.DBM.출력.IO
	 */
	@BxmCategory(logicalName="공동명의인.당행.자금이체.실행.등록", description="생활비 통장 모임원 타행계좌 송금 실행하는 컴포넌트", author="90190263")
	public MPBMetPbokFncTrnMngInsertAsscNompefTbkFdtsExeOutput_DTO insertAsscNompefTbkFdtsExe( MPBMetPbokFncTrnMngInsertAsscNompefTbkFdtsExeInput_DTO input 
	) throws WFApplicationException  {
		/**
		* @BXMType GetBean
		*/
		// WFInterfaceCfg 생성 컴포넌트
		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class);
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		shrCECSession_COM = WFApplicationContext.getBean(shrCECSession_COM, SHRCECSession_COM.class); // 인증보안 세션 컴포넌트
		sHRIBSMR0006185_COM= WFApplicationContext.getBean(sHRIBSMR0006185_COM, SHRIBSMR0006185_COM.class);
		
		/*
		 * 로직 추가
		 */
		if(logger.isDebugEnabled()) {
			logger.debug("90190263 공동명의인.당행.자금이체.실행 정보 COM input {} :: ", input);
		}
		//세션고객정보
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession(); 
		if(logger.isDebugEnabled()) {
			logger.debug("currentCust ====== {} ::: ", currentCust);
		} 
		
		MPBMetPbokFncTrnMngInsertAsscNompefTbkFdtsExeOutput_DTO output = new MPBMetPbokFncTrnMngInsertAsscNompefTbkFdtsExeOutput_DTO();		
		
		String errMsgTxt = "";
		String errMsgId = "";
		
		/**
		 * @BXMType Try
		 * 
		 */
		try{
			/**
			 * 거래고유번호 채번
			 */
			String strTrnAm= input.getTrnAm().toString();	//입금금액
			String sFnetUnqNo = getSequence(strTrnAm);

			String encyRbno = currentCust.getEncyRbno(); // 암호화주민사업자등록번호
			CEC_CUST_SCRT_INFO custScrtInfo = shrCECSession_COM.getCustScrtInfo( encyRbno );
			
			if(logger.isDebugEnabled()) {
				logger.debug("custScrtInfo ====== {} ::: ", custScrtInfo);
			} 
			
			/**
			 * 연계시스템 호출
			 * TYPE : MCA
			 * ID :IBSMR0006185
			 * NM :공동명의인.당행.자금이체.실행
			 */
			//  MCA WFInterfaceCfg 객체 획득
			WFInterfaceCfg interfaceCfg  = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg();
			interfaceCfg.setInterfaceId("IBSMR0006185");

			/*=============================================================
			 * 2채널(투채널)_전화사용자인경우, 비대면공통 헤더 커스텀 값추가
			 *=============================================================*/
  			WFNciHeader tmpNciHeader = interfaceCfg.getNciHeader();
  			// 거래고유번호
  			if (!WFStringUtils.isEmpty(sFnetUnqNo)) {
  				tmpNciHeader.setFnetUnqNo(sFnetUnqNo);	
  			}
  			
  			String twochUsgYn = WFStringUtils.null2void(custScrtInfo.getTwochCrtfYn());
			if ("Y".equals(twochUsgYn)) {
				tmpNciHeader.setEbnkCtlEstUd("2CH");
			}
			
  			interfaceCfg.setNciHeader(tmpNciHeader);
  			
  			IBSMR0006185_IDT iIBSMR0006185 = new IBSMR0006185_IDT();
  			iIBSMR0006185.setWdrAcno(input.getWdrAcno()); // 출금계좌번호
  			iIBSMR0006185.setActPwnoUsgYn(input.getActPwnoUsgYn()); // 계좌비밀번호사용여부
  			iIBSMR0006185.setEncyActPwno(input.getEncyActPwno()); // 암호화계좌비밀번호
  			iIBSMR0006185.setTrnAm(input.getTrnAm()); // 거래금액
  			iIBSMR0006185.setRcvBkcd(input.getRcvBkcd()); // 입금은행코드
  			iIBSMR0006185.setRcvAcno(input.getRcvAcno()); // 입금계좌번호
  			iIBSMR0006185.setRnpeFnm(input.getRnpeFnm()); // 수취인성명
  			iIBSMR0006185.setWdrPbokPrngTxt(input.getWdrPbokPrngTxt()); // 출금통장인자내용
  			iIBSMR0006185.setPtnPbokPrngTxt(input.getPtnPbokPrngTxt()); // 상대통장인자내용

			if(logger.isDebugEnabled()) {
				logger.debug("90190263 당행계좌간 자금이체 실행 정보 COM iIBSMR0006185 {} ::: ", iIBSMR0006185);
			}
			
	        WFInfResponse<IBSMR0006185_ODT> mcaOutput = sHRIBSMR0006185_COM.callTrx(iIBSMR0006185, interfaceCfg);
	        
	        IBSMR0006185_ODT oIBSMR0006185= mcaOutput.getResponseData();

			if(logger.isDebugEnabled()) {
				logger.debug("90190263 공동명의인.당행.자금이체.실행 정보 COM oIBSMR0006185 {} ::: ", oIBSMR0006185);
			}
			
			output.setOwacFnm(oIBSMR0006185.getOwacFnm()); // 예금주성명
			output.setBftrAfBal(oIBSMR0006185.getBftrAfBal()); // 거래전후잔액
			output.setRnpeFnm(oIBSMR0006185.getRnpeFnm()); // 수취인성명
			output.setTrhsSrno(oIBSMR0006185.getTrhsSrno()); // 거래명세일련번호
			output.setWdrAcno(oIBSMR0006185.getWdrAcno()); // 출금계좌번호
			output.setRcvAcno(oIBSMR0006185.getRcvAcno()); // 입금계좌번호
			output.setTrnAm(oIBSMR0006185.getTrnAm()); // 거래금액
			output.setPtnPbokPrngTxt(oIBSMR0006185.getPtnPbokPrngTxt()); // 상대통장인자내용
			output.setRscd("0000");
			
		} catch (Exception e) {
			logger.error("IBSMR0006185 전문 error :: {}", e);
			
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
				Object[] args = we.getArguments();
				
				if(args != null && args.length>0) {
	            	errMsgTxt = args[0].toString();
				} else {
					errMsgTxt = we.getMessage();
				}
			} else {
				logger.error("Exception {} ", e);
				errMsgId = "9999";
				errMsgTxt = e.getMessage();				
			}
			output.setRscd(errMsgId);
			output.setRspTxt(errMsgTxt);
		}
	

		if(logger.isDebugEnabled()) {
			logger.debug("90190263 공동명의인.당행.자금이체.실행 COM output {} ::: ", output);
		}
		
		return output;
	}
	
	/**
	 * 생활비 통장 모임원 타행계좌 송금 실행
	 * 
	 * @param input 이체요청.정보.조회.DBM.입력.IO
	 * @return 이체요청.정보.조회.DBM.출력.IO
	 */
	@BxmCategory(logicalName="공동명의인.타행.자금이체.실행.등록", description="생활비 통장 모임원 타행계좌 송금 실행하는 컴포넌트", author="90190263")
	public MPBMetPbokFncTrnMngInsertAsscNompefObkFdtsExeOutput_DTO insertAsscNompefObkFdtsExe( MPBMetPbokFncTrnMngInsertAsscNompefObkFdtsExeInput_DTO input 
	) throws WFApplicationException  {
		/**
		* @BXMType GetBean
		*/
		// WFInterfaceCfg 생성 컴포넌트
		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class);
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		shrCECSession_COM = WFApplicationContext.getBean(shrCECSession_COM, SHRCECSession_COM.class); // 인증보안 세션 컴포넌트
		sHRIBSMR0006187_COM= WFApplicationContext.getBean(sHRIBSMR0006187_COM, SHRIBSMR0006187_COM.class);
		
		/*
		 * 로직 추가
		 */
		if(logger.isDebugEnabled()) {
			logger.debug("90190263 공동명의인.타행.자금이체.실행 정보 COM input {} :: ", input);
		}
		//세션고객정보
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession(); 
		if(logger.isDebugEnabled()) {
			logger.debug("currentCust ====== {} ::: ", currentCust);
		} 
		
		MPBMetPbokFncTrnMngInsertAsscNompefObkFdtsExeOutput_DTO output = new MPBMetPbokFncTrnMngInsertAsscNompefObkFdtsExeOutput_DTO();		
		String errMsgTxt = "";
		String errMsgId = "";
		
		/**
		 * @BXMType Try
		 * 
		 */
		try{
			/**
			 * 거래고유번호 채번
			 */
			String strTrnAm= input.getTrnAm().toString();	//입금금액
			String sFnetUnqNo = getSequence(strTrnAm);

			String encyRbno = currentCust.getEncyRbno(); // 암호화주민사업자등록번호
			CEC_CUST_SCRT_INFO custScrtInfo = shrCECSession_COM.getCustScrtInfo( encyRbno );
			
			if(logger.isDebugEnabled()) {
				logger.debug("custScrtInfo ====== {} ::: ", custScrtInfo);
			} 
			
			/**
			 * 연계시스템 호출
			 * TYPE : MCA
			 * ID :IBSMR0006187
			 * NM :공동명의인.타행.자금이체.실행
			 */
			//  MCA WFInterfaceCfg 객체 획득
			WFInterfaceCfg interfaceCfg  = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg();
			interfaceCfg.setInterfaceId("IBSMR0006187");
  			
			/*=============================================================
			 * 2채널(투채널)_전화사용자인경우, 비대면공통 헤더 커스텀 값추가
			 *=============================================================*/
			WFNciHeader tmpNciHeader = interfaceCfg.getNciHeader();
  			// 거래고유번호
  			if (!WFStringUtils.isEmpty(sFnetUnqNo)) {
  				tmpNciHeader.setFnetUnqNo(sFnetUnqNo);	
  			}
  			
  			String twochUsgYn = WFStringUtils.null2void(custScrtInfo.getTwochCrtfYn());
			if ("Y".equals(twochUsgYn)) {
				tmpNciHeader.setEbnkCtlEstUd("2CH");
			}
			
  			interfaceCfg.setNciHeader(tmpNciHeader);
  			
  			IBSMR0006187_IDT iIBSMR0006187 = new IBSMR0006187_IDT();
  			iIBSMR0006187.setWdrAcno(input.getWdrAcno()); // 출금계좌번호
  			iIBSMR0006187.setActPwnoUsgYn(input.getActPwnoUsgYn()); // 계좌비밀번호사용여부
  			iIBSMR0006187.setEncyActPwno(input.getEncyActPwno()); // 암호화계좌비밀번호
  			iIBSMR0006187.setTrnAm(input.getTrnAm()); // 거래금액
  			iIBSMR0006187.setRcvBkcd(input.getRcvBkcd()); // 입금은행코드
  			iIBSMR0006187.setRcvAcno(input.getRcvAcno()); // 입금계좌번호
  			iIBSMR0006187.setRnpeFnm(input.getRnpeFnm()); // 수취인성명
  			iIBSMR0006187.setWdrPbokPrngTxt(input.getWdrPbokPrngTxt()); // 출금통장인자내용
  			iIBSMR0006187.setPtnPbokPrngTxt(input.getPtnPbokPrngTxt()); // 상대통장인자내용
  			
			if(logger.isDebugEnabled()) {
				logger.debug("90190263 타행계좌간 자금이체 실행 정보 COM iIBSMR0006187 {} ::: ", iIBSMR0006187);
			}
			
	        WFInfResponse<IBSMR0006187_ODT> mcaOutput = sHRIBSMR0006187_COM.callTrx(iIBSMR0006187, interfaceCfg);
	        
	        IBSMR0006187_ODT oIBSMR0006187 = mcaOutput.getResponseData();

	        if(logger.isDebugEnabled()) {
				logger.debug("90190263 공동명의인.타행.자금이체.실행 정보 COM oIBSMR0006187 {} ::: ", oIBSMR0006187);
			}
	        output.setRscd("0000");
	        output.setOwacFnm(oIBSMR0006187.getOwacFnm()); // 예금주성명
	        output.setBftrAfBal(oIBSMR0006187.getBftrAfBal()); // 거래전후잔액
	        output.setRnpeFnm(oIBSMR0006187.getRnpeFnm()); // 수취인성명
	        output.setTrhsSrno(oIBSMR0006187.getTrhsSrno()); // 거래명세일련번호
	        output.setWdrAcno(oIBSMR0006187.getWdrAcno()); // 출금계좌번호
	        output.setRcvAcno(oIBSMR0006187.getRcvAcno()); // 입금계좌번호
	        output.setTrnAm(oIBSMR0006187.getTrnAm()); // 거래금액
	        output.setPtnPbokPrngTxt(oIBSMR0006187.getPtnPbokPrngTxt()); // 상대통장인자내용
		
		} catch (Exception e) {
			logger.error("IBSMR0006185 전문 error :: {}", e);
			
			if ( e instanceof SFAdaptorApplicationException ) {
				SFAdaptorApplicationException se = (SFAdaptorApplicationException) e;
				logger.error("SFAdaptorApplicationException {} ", se);
				
				Object[] args = se.getArguments();

				errMsgId = se.getCode();

				WFInfErrorResponse<IBSMR0006187_ODT> errorResponse = se.getInfErrorResponse();
				
				String rspRstDscd = errorResponse.getSystemHeader().getRspRstDscd();
				String chnlErrCd = se.getInfErrorResponse().getNcoHeader().getChnlErrCd(); //채널오류코드
				
				// 타임아웃 발생케이스! 타임아웃 오류코드(기타오류메시지) Set
				if("O".equals(rspRstDscd) ) {
		    		// asIs : TRTMO9999
					errMsgTxt  = "상대은행 또는 금융결제원의 사정으로 이체가 지연되고 있습니다. '이체결과조회'로 진행상태를 확인할 수 있습니다.";
				} else {
					if(args != null && args.length>0) {
			           	errMsgTxt = args[0].toString();
					}
				}
				output.setChnlErrCd(chnlErrCd);
				
			} else if ( e instanceof SFInterfaceSystemException ) {
				SFInterfaceSystemException se = (SFInterfaceSystemException) e;
				logger.error("SFInterfaceSystemException {} ", se);
				String chnlErrCd = se.getInfErrorResponse().getNcoHeader().getChnlErrCd();	//채널오류코드
				
				output.setChnlErrCd(chnlErrCd);
				errMsgId = se.getMsgId();
				errMsgTxt = se.getMainMsgTxt();
	
			} else if ( e instanceof WFApplicationException) {
				WFApplicationException we = (WFApplicationException) e;
				logger.debug("IBSMR0006187_ODT WFApplicationException 오류 msgID | errorMsg  : [{}], [{}] ",we.getCode(), we.getMessage());
				Object[] args = we.getArguments();
	            
				if(args != null && args.length>0) {
	            	errMsgTxt = args[0].toString();
				} else {
					errMsgTxt = we.getMessage();
				}

		        errMsgId = we.getCode();
				
			} else {
				logger.error("Exception {} ", e);
				errMsgId = "9999";
				errMsgTxt = e.getMessage();				
			}
			output.setRscd(errMsgId);
			output.setRspTxt(errMsgTxt);
		}
    
		if(logger.isDebugEnabled()) {
			logger.debug("90190263 공동명의인.타행.자금이체.실행 COM output {} ::: ", output);
		}
		
		return output;
	}
	
}
