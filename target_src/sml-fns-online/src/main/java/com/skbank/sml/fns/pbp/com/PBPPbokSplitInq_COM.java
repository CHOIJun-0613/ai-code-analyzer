package com.skbank.sml.fns.pbp.com;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import com.skbank.sml.cmm.shr.com.SHRCMMInterfaceCfg_COM;
import com.skbank.sml.cmm.shr.com.SHRCMMLoginSession_COM;
import com.skbank.sml.cmm.shr.dto.CMM_CURRENT_CUST;
import com.skbank.sml.fns.pbp.dto.PBPPbokSpceBscMngSelectAllActList_DODT;
import com.skbank.sml.fns.pbp.dto.PBPPbokSpceBscMngSelectAllAct_DIDT;
import com.skbank.sml.fns.pbp.dto.PBPPbokSpceBscMngSelectAllAct_DODT;
import com.skbank.sml.fns.pbp.dto.PBPPbokSplitInqSelectPbokSplitActRapTotAmInf_DIDT;
import com.skbank.sml.fns.pbp.dto.PBPPbokSplitInqSelectPbokSplitActRapTotAmInf_DODT;
import com.skbank.sml.fns.pbp.dto.PBPPbokSplitInqSelectPbokSplitItInfAtpmList_DODT;
import com.skbank.sml.fns.pbp.dto.PBPPbokSplitInqSelectPbokSplitItInfAtsList_DODT;
import com.skbank.sml.fns.pbp.dto.PBPPbokSplitInqSelectPbokSplitItInfSubSpceList_DODT;
import com.skbank.sml.fns.pbp.dto.PBPPbokSplitInqSelectPbokSplitItInfTrnPrts_DODT;
import com.skbank.sml.fns.pbp.dto.PBPPbokSplitInqSelectPbokSplitItInf_DIDT;
import com.skbank.sml.fns.pbp.dto.PBPPbokSplitInqSelectPbokSplitItInf_DODT;
import com.skbank.sml.ifi.mca.eims1.dto.IBSMR0004961_GRID_ODT;
import com.skbank.sml.ifi.mca.eims1.dto.IBSMR0004961_IDT;
import com.skbank.sml.ifi.mca.eims1.dto.IBSMR0004961_ODT;
import com.skbank.sml.ifi.mca.eims2.dto.IBSMR0005992_DIS_1_GRID_ODT;
import com.skbank.sml.ifi.mca.eims2.dto.IBSMR0005992_DIS_2_GRID_ODT;
import com.skbank.sml.ifi.mca.eims2.dto.IBSMR0005992_DIS_3_GRID_ODT;
import com.skbank.sml.ifi.mca.eims2.dto.IBSMR0005992_DIS_4_GRID_ODT;
import com.skbank.sml.ifi.mca.eims2.dto.IBSMR0005992_IDT;
import com.skbank.sml.ifi.mca.eims2.dto.IBSMR0005992_ODT;
import com.skbank.sml.ifi.mca.eims4.dto.IBSMR0000054_IDT;
import com.skbank.sml.ifi.mca.eims4.dto.IBSMR0000054_ODT;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0000054_COM;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0004961_COM;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0005992_COM;

import bxm.common.annotaion.BxmCategory;
import fwk.skbank.asis.adaptor.dto.request.WFInterfaceCfg;
import fwk.skbank.asis.adaptor.dto.response.WFInfResponse;
import fwk.skbank.asis.adaptor.header.request.WFNciHeader;
import fwk.skbank.online.context.WFApplicationContext;
import fwk.skbank.online.exception.app.WFApplicationException;
import fwk.skbank.online.exception.frm.SFAdaptorApplicationException;
import fwk.skbank.online.exception.frm.SFInterfaceSystemException;

/**
 * 1.업무명 : 금융서비스 
 * 2.단위업무명 : NEWWON 중분류 통장쪼개기 
 * 3.프로그램명 : 통장.쪼개기.조회.컴포넌트
 * 4.설명 : 통장.쪼개기.조회.컴포넌트
 * 
 * 
 * @Class PBPPbokSpceBscMng_COM.java
 * @author 90191355
 * @since 2024.04.15
 * @version 1.0
 */
@Component
@BxmCategory(logicalName = "통장.쪼개기.조회.컴포넌트", description = "통장쪼개기 조회와 관련된 기능을 지원하는 컴포넌트")
public class PBPPbokSplitInq_COM {
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	private SHRCMMLoginSession_COM shrCMMLoginSession_COM;
	private SHRCMMInterfaceCfg_COM sHRCMMInterfaceCfg_COM;
	
	/**
	 * SHRIBSMR0004961_COM 계좌 조회
	 */
	private SHRIBSMR0004961_COM sHRIBSMR0004961_COM;
	/**
	 * SHRIBSMR0005992_COM 통장쪼개기 조회
	 */
	private SHRIBSMR0005992_COM sHRIBSMR0005992_COM;
	/**
	 * 거래내역입지급합계조회.공유.컴포넌트
	 */
	private SHRIBSMR0000054_COM sHRIBSMR0000054_COM;

	/**
	 * 통장쪼개기 서비스에 가입된 혹은 가입 가능한 계좌 목록 조회 컴포넌트
	 * 
	 * @param input 계좌.정보.DBM.입력.IO
	 * @return 계좌.정보.DBM.출력.IO
	 */
	@BxmCategory(logicalName = "계좌.목록.조회", description = "통장쪼개기 서비스에 가입 가능한 혹은 가입 가능한 계좌 목록 조회 컴포넌트", author = "90191355")
	public PBPPbokSpceBscMngSelectAllAct_DODT selectAllAct(PBPPbokSpceBscMngSelectAllAct_DIDT	 input) {

		/**
		 * @BXMType GetBean
		 */
		sHRIBSMR0004961_COM = WFApplicationContext.getBean(sHRIBSMR0004961_COM,	SHRIBSMR0004961_COM.class);
		shrCMMLoginSession_COM = WFApplicationContext	.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);

		/**
		 * 	WFInterfaceCfg 생성 컴포넌트
		 */
		sHRCMMInterfaceCfg_COM = WFApplicationContext	.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class); 

		// 세션고객정보
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession();
		if (logger.isDebugEnabled()) {
			logger.debug("currentCust ::: {} ::: ", currentCust);
		}
		
		String itcsno = input.getItcsno();
		if (itcsno.isEmpty()) {
			itcsno = currentCust.getItcsno();
		}

		PBPPbokSpceBscMngSelectAllAct_DODT output = new PBPPbokSpceBscMngSelectAllAct_DODT();
		
		try {
			WFInterfaceCfg interfaceCfg = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg(); // MCA WFInterfaceCfg 객체 획득
			interfaceCfg.setInterfaceId("IBSMR0004961");

			IBSMR0004961_ODT oIBSMR0004961 = new IBSMR0004961_ODT();
			IBSMR0004961_IDT iIBSMR0004961 = new IBSMR0004961_IDT();
			iIBSMR0004961.setItcsno(itcsno); // 통합고객번호
			iIBSMR0004961.setTobkDscd("1"); // 당타행구분코드

			WFInfResponse<IBSMR0004961_ODT> mcaOutput = sHRIBSMR0004961_COM.callTrx(iIBSMR0004961, interfaceCfg);

			oIBSMR0004961 = mcaOutput.getResponseData();
			if (logger.isDebugEnabled()) {
				logger.debug("oIBSMR0004961 ====== {} ::: ", oIBSMR0004961);
			}
			
			//계좌 목록 조회
			if (!ObjectUtils.isEmpty(oIBSMR0004961.getGrid())) {
				List<PBPPbokSpceBscMngSelectAllActList_DODT> list = new ArrayList<PBPPbokSpceBscMngSelectAllActList_DODT>();
				
				for (IBSMR0004961_GRID_ODT odt : oIBSMR0004961.getGrid()) {
					
					PBPPbokSpceBscMngSelectAllActList_DODT dodt = new PBPPbokSpceBscMngSelectAllActList_DODT();
					
					String joinYn = odt.getPbokSplitJnngYn(); //통장쪼개기 가입여부
					String joinAvlYn = odt.getPbokSplitJnngAvlYn(); //가입가능여부
					
					if ("Y".equals(joinYn) || "Y".equals(joinAvlYn)) {
						dodt.setAcno(odt.getDpacNo()); // 수신계좌번호
						dodt.setCusUsgBkwAcno(odt.getCusUsgBkwAcno()); //고객사용전행계좌번호
						dodt.setPrdNm(odt.getPrdKorlNm()); // 상품한글명
						dodt.setRawActBal(odt.getDpacCtBal()); //수신계좌현재잔액	DPAC_CT_BAL??? dpacCtBal 지급가능잔액
						dodt.setSpceSrvcJnngYn(joinYn); // 공간서비스가입여부
						dodt.setSpceSvrcJnngDt(odt.getPbokSplitRgsDt()); // 공간서비스가입일자
						dodt.setSpceCnt(odt.getPbokSplitSpceCn() > 1 ? odt.getPbokSplitSpceCn() - 1 : 0); //공간 갯수
					
						list.add(dodt);	
					}
					
				}
				output.setJnngAvlActInfList_DODT(list);
			}
		} catch(WFApplicationException e){
			logger.error("IBSMR0004961 전문 error :: {}", e);
			Object[] args = e.getArguments();
			
			throw new WFApplicationException("FNSE0006", new Object[] {e.getCode()} , new Object[] {args[0].toString()});
		} catch(Exception e){
			logger.error("IBSMR0004961 전문 error :: {}", e);
		
			throw new WFApplicationException("FNSE0006", new Object[] {"9999"} , new Object[] {e.getMessage()});
		}

		return output;
	}

	/**
	 * 통장쪼개기 통합 조회
	 * 공간 기본 정보 
	 *  1 : 공간 목록(메인 포함)
	 *  2 : 거래 내역 
	 *  3 : 자동이체 목록 
	 *  4 : 자동납부 목록
	 *  5 : 통합조회 (공간 번호 무시)
	 * @param input 통장.쪼개기.통합.조회.DBM.입력.IO
	 * @return 통장.쪼개기.통합.조회.DBM.출력.IO
	 */
	@BxmCategory(logicalName = "통장.쪼개기.통합.조회", description = "통장쪼개기 통합 조회 컴포넌트", author = "90191355")
	public PBPPbokSplitInqSelectPbokSplitItInf_DODT selectPbokSplitItInf(PBPPbokSplitInqSelectPbokSplitItInf_DIDT input) {
		/**
		 * @BXMType VariableDeclaration
		 */
		shrCMMLoginSession_COM = WFApplicationContext	.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		sHRIBSMR0005992_COM = WFApplicationContext.getBean(sHRIBSMR0005992_COM, SHRIBSMR0005992_COM.class);
		/**
		 * 	WFInterfaceCfg 생성 컴포넌트
		 */
		sHRCMMInterfaceCfg_COM = WFApplicationContext	.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class); 

		PBPPbokSplitInqSelectPbokSplitItInf_DODT output = new PBPPbokSplitInqSelectPbokSplitItInf_DODT();		
		String mainSpaceNo = "000000";
		boolean isAllInqBySpace = "5".equals(input.getInqDscd()) && !mainSpaceNo.equals(input.getSpceNo());
		try {			
			WFInterfaceCfg interfaceCfg = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg();
			interfaceCfg.setInterfaceId("IBSMR0005992");

			IBSMR0005992_IDT iIBSMR0005992 = new IBSMR0005992_IDT();
			iIBSMR0005992.setInqDscd(input.getInqDscd()); 	//	통합조회 : 공간 기본 정보 + 1 : 공간 목록(메인 포함) , 2 : 거래 내역 , 3 : 자동이체 목록 , 4 : 자동납부 목록 , 5 : 통합조회
			iIBSMR0005992.setDpsInpAcno(input.getAcno());	// 계좌번호
			iIBSMR0005992.setSpceNo(input.getSpceNo()); 	// 메인공간으로 조회하면 전체 --> 구분코드 5번이면 의미 없는 번호
			iIBSMR0005992.setInqStaDt(input.getInqStaDt());	// 조회 시작일자
			iIBSMR0005992.setInqEndDt(input.getInqEndDt());	// 조회 종료일자
			iIBSMR0005992.setSortDscd(input.getSortDscd()); // 정렬 구분 공간거래내역 :::: 1: 최신순, 2:과거순
			iIBSMR0005992.setMngNo(input.getAtpmMngNo()); //자동납부 추가 조회

			if (logger.isDebugEnabled()) {
				logger.debug("=======5992 통장쪼개기 통합 조회====== input : {}::: ", iIBSMR0005992);
			}
			WFInfResponse<IBSMR0005992_ODT> mcaOutput = sHRIBSMR0005992_COM.callTrx(iIBSMR0005992, interfaceCfg);
			IBSMR0005992_ODT oIBSMR0005992 = mcaOutput.getResponseData();
			if (logger.isDebugEnabled()) {
				logger.debug("=======5992 통장쪼개기 통합 조회====== output : {}:::", oIBSMR0005992);
			}	
			
			if (!ObjectUtils.isEmpty(oIBSMR0005992)) {
				output.setDpsAcno(oIBSMR0005992.getDpsAcno()); // 수신계좌번호
				output.setPrdNm(oIBSMR0005992.getPrdNm()); // 상품명
				output.setDpacBal(oIBSMR0005992.getDpacBal()); // 수신계좌잔액
				output.setRgsTrnDt(oIBSMR0005992.getRgsTrnDt()); // 등록거래일자
				output.setRvkTrnDt(oIBSMR0005992.getRvkTrnDt()); // 해제거래일자
				output.setBkAppPushAgrYn(oIBSMR0005992.getBkAppPushAgrYn()); // 은행앱PUSH동의여부
				output.setRcvCnt(oIBSMR0005992.getRcvCnt()); // 입금건수
				output.setRcvSumAm(oIBSMR0005992.getRcvSumAm()); // 입금합계금액
				output.setPayCnt(oIBSMR0005992.getPayCnt()); // 지급건수
				output.setPaySumAm(oIBSMR0005992.getPaySumAm()); // 지급합계금액
				//서브공간
				output.setGrid1Cnt(oIBSMR0005992.getGrid1Cnt()); // 그리드1건수
				if (oIBSMR0005992.getGrid1Cnt() > 0) { 
					List<PBPPbokSplitInqSelectPbokSplitItInfSubSpceList_DODT> list = new ArrayList<>();
					List<IBSMR0005992_DIS_1_GRID_ODT> grid1 = oIBSMR0005992.getDis1Grid();
					for (IBSMR0005992_DIS_1_GRID_ODT dodtItem :  grid1) {
						PBPPbokSplitInqSelectPbokSplitItInfSubSpceList_DODT item = new PBPPbokSplitInqSelectPbokSplitItInfSubSpceList_DODT();
						item.setDpsAcno(dodtItem.getDpsAcno()); // 수신계좌번호
						item.setSpceNo(dodtItem.getSpceNo()); // 공간번호
						item.setSpceNm(dodtItem.getSpceNm()); // 공간명
						item.setSpceBal(dodtItem.getSpceBal()); // 공간잔액
						item.setSpceIconNo(dodtItem.getSpceIconNo()); // 공간아이콘번호
						item.setSavGoalAm(dodtItem.getSavGoalAm()); // 저축목표금액
						String startDate = dodtItem.getSavGoalStaDt();
						item.setSavGoalStaDt("00010101".equals(startDate) ? "" : startDate); // 저축목표시작일자
						String savGoalEndDt = dodtItem.getSavGoalEndDt();
						item.setSavGoalEndDt("00010101".equals(savGoalEndDt) ? "" : savGoalEndDt); // 저축목표종료일자
						item.setCnsmGoalAm(dodtItem.getCnsmGoalAm()); // 소비목표금액
						item.setCnsmAmBscd(dodtItem.getCnsmAmBscd()); // 소비금액기준코드
						item.setCnsmAmbsCdNm(dodtItem.getCnsmAmbsCdNm()); // 소비금액기준코드명
						
						list.add(item);
					}
					
					list.sort((a, b) -> b.getSpceBal().subtract(a.getSpceBal()).intValue());
					output.setSubSpceList(list);
				}
				
				//거래내역
				String nxtTrnYn = oIBSMR0005992.getNxtPageExstYn();
				String nxtTrnKey = oIBSMR0005992.getNxtPageTxt();
				List<IBSMR0005992_DIS_2_GRID_ODT> grid2 = oIBSMR0005992.getDis2Grid();
				while ("Y".equals(nxtTrnYn) && !nxtTrnKey.isEmpty()) {
					iIBSMR0005992.setNxtPageYn(nxtTrnYn);
					iIBSMR0005992.setNxtPageTxt(nxtTrnKey);
					WFInfResponse<IBSMR0005992_ODT> mcaOutputforTrnList = sHRIBSMR0005992_COM.callTrx(iIBSMR0005992, interfaceCfg);
					IBSMR0005992_ODT trnOIBSMR0005992 = mcaOutputforTrnList.getResponseData();
					if (trnOIBSMR0005992.getGrid2Cnt() > 0) {
						grid2.addAll(trnOIBSMR0005992.getDis2Grid());
					}
					nxtTrnYn = trnOIBSMR0005992.getNxtPageExstYn();
					nxtTrnKey = trnOIBSMR0005992.getNxtPageTxt();
				}

				if (grid2.size() > 0) {
					//전체 조회시 공간번호 넣으면 해당 공간번호 데이터로 필터
					List<IBSMR0005992_DIS_2_GRID_ODT> trnList = isAllInqBySpace ? grid2.stream().filter(grid2Item -> input.getSpceNo().equals(grid2Item.getSpceNo())).collect(Collectors.toList()) : grid2;
					output.setGrid2Cnt(trnList.size()); // 그리드2건수
					List<PBPPbokSplitInqSelectPbokSplitItInfTrnPrts_DODT> list = new ArrayList<PBPPbokSplitInqSelectPbokSplitItInfTrnPrts_DODT>();
					for (IBSMR0005992_DIS_2_GRID_ODT dodtItem :  trnList) {
						PBPPbokSplitInqSelectPbokSplitItInfTrnPrts_DODT item = new PBPPbokSplitInqSelectPbokSplitItInfTrnPrts_DODT();
						item.setDpsAcno(dodtItem.getDpsAcno()); // 수신계좌번호
						item.setTrnDt(dodtItem.getTrnDt()); // 거래일자
						item.setTrnTm(dodtItem.getTrnTm()); // 거래시각
						item.setTrnSrno(dodtItem.getTrnSrno()); // 거래일련번호
						item.setSpceNo(dodtItem.getSpceNo()); // 공간번호
						item.setDpsRapDscd(dodtItem.getDpsRapDscd()); // 수신입지급구분코드
						item.setDpsRapDscdNm(dodtItem.getDpsRapDscdNm()); // 수신입지급구분코드명
						item.setDpsTrnAm(dodtItem.getDpsTrnAm()); // 수신거래금액
						item.setAftrBal(dodtItem.getAftrBal()); // 거래후잔액
						item.setPbokPrngOtlnTxt(dodtItem.getPbokPrngOtlnTxt()); // 통장인자적요내용
						item.setMdKdcdNm(dodtItem.getMdKdcdNm()); // 매체종류코드명
					
						list.add(item);
					}
				
					output.setTrnPrts(list);
				}
				
				//자동이체
				if (oIBSMR0005992.getGrid3Cnt() > 0) {
					List<IBSMR0005992_DIS_3_GRID_ODT> grid3 = oIBSMR0005992.getDis3Grid();
					//전체 조회시 공간번호 넣으면 해당 공간번호 데이터로 필터
					List<IBSMR0005992_DIS_3_GRID_ODT> atsList = isAllInqBySpace ? grid3.stream().filter(grid3Item -> input.getSpceNo().equals(grid3Item.getSpceNo())).collect(Collectors.toList()) : grid3;
					output.setGrid3Cnt(atsList.size()); // 그리드3건수
					List<PBPPbokSplitInqSelectPbokSplitItInfAtsList_DODT> list = new ArrayList<PBPPbokSplitInqSelectPbokSplitItInfAtsList_DODT>();
					for (IBSMR0005992_DIS_3_GRID_ODT dodtItem :  atsList) {
						PBPPbokSplitInqSelectPbokSplitItInfAtsList_DODT item = new PBPPbokSplitInqSelectPbokSplitItInfAtsList_DODT();
						item.setAtsMngNo(dodtItem.getMngNo()); //자동이체관리번호
						item.setSpceNo(dodtItem.getSpceNo()); // 공간번호
						item.setAtsCycd(dodtItem.getAtsCycd()); // 자동이체주기코드
						item.setAtsCycdNm(dodtItem.getAtsCycdNm()); // 자동이체주기코드명
						item.setAtsBasDd(dodtItem.getAtsBasDd()); // 자동이체기준일
						item.setAtsReqAm(dodtItem.getAtsReqAm()); // 자동이체요청금액
						item.setAtsWkdDscd(dodtItem.getAtsWkdDscd()); // 자동이체요일구분코드
						item.setAtsWkdDscdNm(dodtItem.getAtsWkdDscdNm()); // 자동이체요일구분코드명
					
						list.add(item);
					}
					output.setAtsList(list);
				}
				
				//자동납부
				output.setGrid4Cnt(oIBSMR0005992.getGrid4Cnt()); // 그리드4건수
				output.setAtpmMngNo(oIBSMR0005992.getMngNo()); //자동납부 다음 관리번호
				output.setAtpmNxtTrnYn(oIBSMR0005992.getNxtTrnYn()); //자동납부 다음 거래 여부
				if (oIBSMR0005992.getGrid4Cnt() > 0) {	
					List<IBSMR0005992_DIS_4_GRID_ODT> grid4 = oIBSMR0005992.getDis4Grid();
					List<PBPPbokSplitInqSelectPbokSplitItInfAtpmList_DODT> list = new ArrayList<PBPPbokSplitInqSelectPbokSplitItInfAtpmList_DODT>();
					for (IBSMR0005992_DIS_4_GRID_ODT dodtItem :  grid4) {
						PBPPbokSplitInqSelectPbokSplitItInfAtpmList_DODT item = new PBPPbokSplitInqSelectPbokSplitItInfAtpmList_DODT();
						item.setAtsMngNo(dodtItem.getMngNo()); // 자동이체관리번호
						item.setAtsSrvcPdcd(dodtItem.getAtsSrvcPdcd()); // 자동이체서비스상품코드
						item.setAtsWdrBkwAcno(dodtItem.getAtsWdrBkwAcno()); // 자동이체출금전행계좌번호
						item.setAtsRgsStcd(dodtItem.getAtsRgsStcd()); // 자동이체등록상태코드
						item.setAtsRgsStcdNm(dodtItem.getAtsRgsStcdNm()); // 자동이체등록상태코드명
						item.setAtsRgsDt(dodtItem.getAtsRgsDt()); // 자동이체등록일자
						item.setAtsCsno(dodtItem.getAtsCsno()); // 자동이체고객번호
						item.setAtsItcsno(dodtItem.getAtsItcsno()); // 자동이체통합고객번호
						item.setAtsCtrIscd(dodtItem.getAtsCtrIscd()); // 자동이체계약기관코드
						item.setAtsPypeNo(dodtItem.getAtsPypeNo()); // 자동이체납부자번호
						item.setAtsTlmOccIstSrno(dodtItem.getAtsTlmOccIstSrno()); // 자동이체전문발생기관일련번호
						item.setAtsCtrIstNm(dodtItem.getAtsCtrIstNm()); // 자동이체계약기관명
						item.setSpceNo(dodtItem.getSpceNo()); // 공간번호
						if ("5".equals(input.getInqDscd())) {
							List<PBPPbokSplitInqSelectPbokSplitItInfSubSpceList_DODT> subSpceList = output.getSubSpceList();
							//최대 11개
							for (PBPPbokSplitInqSelectPbokSplitItInfSubSpceList_DODT space : subSpceList) {
								if (dodtItem.getSpceNo().equals(space.getSpceNo())) {
									item.setSpceNm(space.getSpceNm());
									break;
								}
							}
						}
						list.add(item);
					}
					output.setAtpmList(list);
				}					
			}
		} catch(WFApplicationException e){
			logger.error("IBSMR0005992 전문 error :: {}", e);
			Object[] args = e.getArguments();
			
			throw new WFApplicationException("FNSE0006", new Object[] {e.getCode()} , new Object[] {args[0].toString()});
		} catch(Exception e){
			logger.error("IBSMR0005992 전문 error :: {}", e);
		
			throw new WFApplicationException("FNSE0006", new Object[] {"9999"} , new Object[] {e.getMessage()});
		}

		return output;
	}
	

	/**
	 * 통장쪼개기 모계좌 입지급 합계 금액 정보 조회
	 * @param input 통장.쪼개기.통합.조회.DBM.입력.IO
	 * @return 통장.쪼개기.통합.조회.DBM.출력.IO
	 */
	@BxmCategory(logicalName = "통장.쪼개기.계좌.입지급.합계.금액.정보.조회", description = "통장쪼개기 모계좌의 입지급 합계 금액 조회", author = "90191355")
	public PBPPbokSplitInqSelectPbokSplitActRapTotAmInf_DODT selectPbokSplitActRapTotAmInf(PBPPbokSplitInqSelectPbokSplitActRapTotAmInf_DIDT input) {
		/**
		 * @BXMType VariableDeclaration
		 */
		sHRIBSMR0005992_COM = WFApplicationContext.getBean(sHRIBSMR0005992_COM, SHRIBSMR0005992_COM.class);
		/**
		 * 	WFInterfaceCfg 생성 컴포넌트
		 */
		/**
		 * 연계시스템 호출
		 * TYPE : MCA
		 * ID : IBSMR0000054
		 * NM : 거래내역입지급합계조회
		 */
		WFInterfaceCfg interfaceCfg = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg(); // 아답터 설정 DTO
		interfaceCfg.setInterfaceId("IBSMR0000054");
		
		WFNciHeader  tpyNciHeader = interfaceCfg.getNciHeader();
		tpyNciHeader.setAcno(input.getAcno());
		interfaceCfg.setNciHeader(tpyNciHeader);
		
		// input
		IBSMR0000054_IDT iBSMR0000054_IDT = new IBSMR0000054_IDT();
		iBSMR0000054_IDT.setDpsInpAcno(input.getAcno()); // 조회계좌번호
		iBSMR0000054_IDT.setEncyPwno("00000000"); // 계좌비밀번호
		iBSMR0000054_IDT.setInqBasDt(input.getInqStaDt()); // 조회시작일
		iBSMR0000054_IDT.setInqEndDt(input.getInqEndDt()); // 조회종료일
		iBSMR0000054_IDT.setCucd("KRW");
		iBSMR0000054_IDT.setTrnInqMtd("1"); // 조회순서구분
		
		if (logger.isDebugEnabled()) {
			logger.debug("======= iBSMR0000054 통장.쪼개기.계좌.입지급.합계.금액.정보.조회====== input : {}::: ", iBSMR0000054_IDT);
		}
		
		PBPPbokSplitInqSelectPbokSplitActRapTotAmInf_DODT output = new PBPPbokSplitInqSelectPbokSplitActRapTotAmInf_DODT();

		BigDecimal paySumAm = BigDecimal.ZERO;
		BigDecimal rcvSumAm = BigDecimal.ZERO;
		try {
			sHRIBSMR0000054_COM = WFApplicationContext.getBean(sHRIBSMR0000054_COM, SHRIBSMR0000054_COM.class);
			WFInfResponse<IBSMR0000054_ODT> mcaOutput = sHRIBSMR0000054_COM.callTrx(iBSMR0000054_IDT, interfaceCfg);
			
			IBSMR0000054_ODT iBSMR0000054_ODT = mcaOutput.getResponseData();
			if (logger.isDebugEnabled()) {
				logger.debug("======= oBSMR0000054 통장.쪼개기.계좌.입지급.합계.금액.정보.조회====== output : {}::: ", iBSMR0000054_ODT);
			}
			output.setPaySumCnt(iBSMR0000054_ODT.getPaySumCnt()); // 지급합계건수
			paySumAm = iBSMR0000054_ODT.getPaySumAm(); // 지급합계금액
			output.setRcvSumCnt(iBSMR0000054_ODT.getRcvSumCnt()); // 입금합계건수
			rcvSumAm = iBSMR0000054_ODT.getRcvSumAm(); // 입금합계금액
			output.setCtBal(iBSMR0000054_ODT.getCtBal()); // 현재잔액
		} catch(WFApplicationException e){
			logger.error("IBSMR0000054 전문 error :: {}", e);
			if ("IFIE1054".equals(e.getCode())) { // 거래내역이 없습니다.
				logger.error("거래내역이 없습니다. ::: {}", e.getCode());
			} else {
				Object[] args = e.getArguments();				
				throw new WFApplicationException("FNSE0006", new Object[] {e.getCode()} , new Object[] {args[0].toString()});	
			}
			
		} catch(Exception e){
			logger.error("IBSMR0000054 전문 error :: {}", e);
		
			throw new WFApplicationException("FNSE0006", new Object[] {"9999"} , new Object[] {e.getMessage()});
		}
		
		output.setPaySumAm(paySumAm);
		output.setRcvSumAm(rcvSumAm);
		
		return output;
	}
	
}
