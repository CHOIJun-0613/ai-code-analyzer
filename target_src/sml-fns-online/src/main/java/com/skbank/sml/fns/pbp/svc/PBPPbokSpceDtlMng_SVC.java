package com.skbank.sml.fns.pbp.svc;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.skbank.sml.fns.pbp.com.PBPPbokSplitBscMng_COM;
import com.skbank.sml.fns.pbp.com.PBPPbokSplitInq_COM;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlMngDeleteSpcedtlinf_IDT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlMngDeleteSpcedtlinf_ODT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlMngSelectSpcedtlinf_IDT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlMngSelectSpcedtlinf_ODT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlMngSelectSpcedtltrnprts_IDT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlMngSelectSpcedtltrnprts_ODT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlMngSelectSpcedtltrnprtslist_ODT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlMngUpdateSpcedtlam_IDT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlMngUpdateSpcedtlam_ODT;
import com.skbank.sml.fns.pbp.dto.PBPPbokSplitBscMngCudSubSpceMng_DIDT;
import com.skbank.sml.fns.pbp.dto.PBPPbokSplitBscMngUpdateSpceAmMv_DIDT;
import com.skbank.sml.fns.pbp.dto.PBPPbokSplitInqSelectPbokSplitItInfAtsList_DODT;
import com.skbank.sml.fns.pbp.dto.PBPPbokSplitInqSelectPbokSplitItInfSubSpceList_DODT;
import com.skbank.sml.fns.pbp.dto.PBPPbokSplitInqSelectPbokSplitItInfTrnPrts_DODT;
import com.skbank.sml.fns.pbp.dto.PBPPbokSplitInqSelectPbokSplitItInf_DIDT;
import com.skbank.sml.fns.pbp.dto.PBPPbokSplitInqSelectPbokSplitItInf_DODT;

import bxm.common.annotaion.BxmCategory;
import fwk.skbank.online.context.WFApplicationContext;
import fwk.skbank.online.exception.app.WFApplicationException;
import fwk.skbank.online.util.WFDateUtils;

/**
 * 1.업무명 : 금융서비스
 * 2.단위업무명 : NEWWON 중분류 통장쪼개기
 * 3.프로그램명 : 통장.공간.상세.관리.서비스
 * 4.설명 : 통장의 공간의 상세 정보를 관리하는 서비스
 * 
 * 
 * 
 * @Class PBPPbokSpceDtlMng_SVC.java
 * @author 90191355
 * @since 2024.05.03
 * @version 1.0
 */		
@Service
@BxmCategory(logicalName="통장.공간.상세.관리.서비스", description="통장의 공간의 상세 정보를 관리하는 서비스\r\n\r\n")
public class PBPPbokSpceDtlMng_SVC {
	private Logger logger= LoggerFactory.getLogger(getClass());
	
	/**
	 * 통장 쪼개기 조회 컴포넌트
	 */
	private PBPPbokSplitInq_COM pBPPbokSplitInq_COM;
	private PBPPbokSplitBscMng_COM pBPPbokSplitBscMng_COM;
	
	/**
	 * 통장쪼개기를 통해 생성된 공간의 상세 정보를 조회하는 서비스
	 * 
	 * @param input 공간.상세.정보.컨트롤러.입력.IO
	 * @return 공간.상세.정보.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName="공간.상세.정보.조회", description="통장쪼개기를 통해 생성된 공간의 상세 정보를 조회하는 서비스", author="90191355")
	public PBPPbokSpceDtlMngSelectSpcedtlinf_ODT selectSpcedtlinf(PBPPbokSpceDtlMngSelectSpcedtlinf_IDT input) {
			
		/**
		* @BXMType GetBean
		*/
		pBPPbokSplitInq_COM = WFApplicationContext.getBean(pBPPbokSplitInq_COM, PBPPbokSplitInq_COM.class);

		PBPPbokSplitInqSelectPbokSplitItInf_DIDT didt = new PBPPbokSplitInqSelectPbokSplitItInf_DIDT();
		didt.setAcno(input.getRprsAcno()); // 계좌번호
		didt.setSpceNo(input.getSpceSrno()); // 공간번호 --> 필터필요
		didt.setInqDscd("5"); // 조회구분코드
		//기본
		String today = WFDateUtils.getDateNow();
		didt.setInqStaDt(today.substring(0, 6) + "01"); // 조회시작일자
		didt.setInqEndDt(today); // 조회종료일자
		didt.setSortDscd("1"); // 정렬구분코드
		
		PBPPbokSplitInqSelectPbokSplitItInf_DODT dodt = pBPPbokSplitInq_COM.selectPbokSplitItInf(didt);
		
		PBPPbokSpceDtlMngSelectSpcedtlinf_ODT output= new PBPPbokSpceDtlMngSelectSpcedtlinf_ODT();
		output.setAcno(dodt.getDpsAcno()); // 계좌번호
		output.setAcnoBal(dodt.getDpacBal()); // 계좌잔액
		output.setPrdNm(dodt.getPrdNm()); // 상품명
		
		List<PBPPbokSplitInqSelectPbokSplitItInfSubSpceList_DODT> subSpceList = dodt.getSubSpceList();
		for (PBPPbokSplitInqSelectPbokSplitItInfSubSpceList_DODT spce : subSpceList) {
			if ("000000".equals(spce.getSpceNo())) {
				//공간 잔액
				output.setSplitAvlAm(spce.getSpceBal());
				continue;
			}
			
			if (!input.getSpceSrno().equals(spce.getSpceNo())) {continue;}
			
			//공간정보
			output.setSpceIconNo(spce.getSpceIconNo()); // 공간아이콘번호
			output.setSpceSrno(spce.getSpceNo()); // 공간일련번호
			output.setSpceNm(spce.getSpceNm()); // 공간명
			output.setSpceBal(spce.getSpceBal()); // 공간잔액
			//저축목표
			BigDecimal savGoalAm = spce.getSavGoalAm();
			if (savGoalAm.intValue() != 0) {
				output.setSavGoalAm(savGoalAm); // 저축목표금액
				output.setSavGoalStaDt(spce.getSavGoalStaDt()); // 저축목표시작일자
				output.setSavGoalEndDt(spce.getSavGoalEndDt()); // 저축목표종료일자	
			}
			//소비목표
			BigDecimal cnsmGoalAm = spce.getCnsmGoalAm();
			if (cnsmGoalAm.intValue() != 0) {
				output.setCnsmGoalAm(cnsmGoalAm); // 소비목표금액
				output.setCnsmAmBscd(spce.getCnsmAmBscd()); // 소비금액기준코드
				output.setCnsmAmBscdNm(spce.getCnsmAmbsCdNm()); // 소비금액기준코드명	
			}
			
		}
		
		//자동이체 목록
		if (dodt.getGrid3Cnt() > 0) {
			List<PBPPbokSplitInqSelectPbokSplitItInfAtsList_DODT> atsList = dodt.getAtsList();
			
			for (PBPPbokSplitInqSelectPbokSplitItInfAtsList_DODT ats : atsList) {
				if (input.getSpceSrno().equals(ats.getSpceNo())) {
					//자동이체 정보
					output.setAtsMngNo(ats.getAtsMngNo()); //자동이체 관리번호
					output.setAtsEstYn(ats.getAtpmTsRgsYn()); // 자동이체설정여부
					output.setAtsCycd(ats.getAtsCycd()); // 자동이체주기코드
					output.setAtsCycdNm(ats.getAtsCycdNm()); //자동이체주기코드명
					output.setAtsDd(ats.getAtsBasDd()); // 자동이체일
					output.setAtsAm(ats.getAtsReqAm()); // 자동이체금액
					output.setAtsWkdDscd(ats.getAtsWkdDscd());//요일구분코드
					output.setAtsWkdDscdNm(ats.getAtsWkdDscdNm()); //요일구분코드명
					
					break;
				}
			}
			
		}
		
		//거래내역 1달치
		if (dodt.getGrid2Cnt() > 0) {
			List<PBPPbokSpceDtlMngSelectSpcedtltrnprtslist_ODT> list = new ArrayList<PBPPbokSpceDtlMngSelectSpcedtltrnprtslist_ODT>();
			List<PBPPbokSplitInqSelectPbokSplitItInfTrnPrts_DODT> trnPrts = dodt.getTrnPrts();
			for (PBPPbokSplitInqSelectPbokSplitItInfTrnPrts_DODT trnItem : trnPrts) {
				
				PBPPbokSpceDtlMngSelectSpcedtltrnprtslist_ODT item = new PBPPbokSpceDtlMngSelectSpcedtltrnprtslist_ODT();
				item.setTrnSrno(trnItem.getTrnSrno()); //일련번호
				item.setTrnDt(trnItem.getTrnDt()); // 거래일자
				item.setTrnTm(trnItem.getTrnTm()); // 거래시각
				item.setRcvWdrDscd(trnItem.getDpsRapDscd()); // 입금출금구분코드
				item.setRcvWdrDscdNm(trnItem.getDpsRapDscdNm()); // 입금출금구분코드
				item.setRawAm(trnItem.getDpsTrnAm()); // 입출금금액
				item.setPbokRestAm(trnItem.getAftrBal()); // 통장잔여금액
				item.setPbokPrngTxt(trnItem.getPbokPrngOtlnTxt()); // 통장인자내용
				item.setTrnKdNm(trnItem.getMdKdcdNm()); // 거래종류명
				
				list.add(item);
			}
			
			output.setpBPSpceDtlTrnPrtsList_ODT(list);
		}
		
		didt.setAcno(input.getRprsAcno()); // 계좌번호
		didt.setSpceNo(input.getSpceSrno()); // 공간번호 --> 필터필요
		didt.setInqDscd("4"); // 자동납부 목록 조회 

		boolean hasAtpmNext = false;
		int atpmCnt = 0;
		do {
			PBPPbokSplitInqSelectPbokSplitItInf_DODT atpmDodt = pBPPbokSplitInq_COM.selectPbokSplitItInf(didt);
			atpmCnt += atpmDodt.getGrid4Cnt();
			
			hasAtpmNext = "Y".equals(atpmDodt.getAtpmNxtTrnYn());	
			didt.setAtpmMngNo(atpmDodt.getAtpmMngNo());
		} while (hasAtpmNext);
		
		//자동납부 건수
		output.setAtpmListCnt(atpmCnt); // 자동납부목록건수
		
		return output;
			
	}
		
	/**
	 * 통장쪼개기를 통해 생성된 공간의 금액을 채우기/꺼내기를 관리하는 서비스
	 * 
	 * @param input 공간상세금액수정정보.컨트롤러.입력.IO
	 * @return 공간상세금액수정정보.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName="공간.상세.금액.수정", description="통장쪼개기를 통해 생성된 공간의 금액을 채우기/꺼내기를 관리하는 서비스", author="90191355")
	public PBPPbokSpceDtlMngUpdateSpcedtlam_ODT updateSpcedtlam(PBPPbokSpceDtlMngUpdateSpcedtlam_IDT input) {
			
		/**
		* @BXMType GetBean
		*/
		pBPPbokSplitBscMng_COM= WFApplicationContext.getBean(pBPPbokSplitBscMng_COM, PBPPbokSplitBscMng_COM.class);
			
		/**
		 * @BXMType VariableDeclaration
		 */
		
		PBPPbokSplitBscMngUpdateSpceAmMv_DIDT didt = new PBPPbokSplitBscMngUpdateSpceAmMv_DIDT();
		didt.setItcsno(input.getItcsno()); // 통합고객번호
		didt.setRprsAcno(input.getRprsAcno()); // 대표계좌번호
		didt.setSpceSrno(input.getSpceSrno()); // 공간일련번호
		didt.setSpceMvbAm(input.getSpceMvbAm()); // 공간이동금액
		didt.setTrnDscd("Y".equals(input.getAmWdrYn()) ? "1" : "2");
		
		pBPPbokSplitBscMng_COM.updateSpceAmMv(didt);
		
		PBPPbokSpceDtlMngUpdateSpcedtlam_ODT output= new PBPPbokSpceDtlMngUpdateSpcedtlam_ODT();
		output.setRspRtcd("200");
		output.setRspMsgTxt("성공");
			
		return output;
			
	}
		
	/**
	 * 통장쪼개기를 통해 생성된 공간의 상세 정보를 삭제하는 서비스
	 * 
	 * @param input 공간.상세.정보.삭제.컨트롤러.입력.IO
	 * @return 공간.상세.정보.삭제.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName="공간.상세.정보.삭제", description="통장쪼개기를 통해 생성된 공간의 상세 정보를 삭제하는 서비스", author="90191355")
	public PBPPbokSpceDtlMngDeleteSpcedtlinf_ODT deleteSpcedtlinf(PBPPbokSpceDtlMngDeleteSpcedtlinf_IDT input) {
			
		/**
		* @BXMType GetBean
		*/
		pBPPbokSplitBscMng_COM = WFApplicationContext.getBean(pBPPbokSplitBscMng_COM, PBPPbokSplitBscMng_COM.class);
		PBPPbokSpceDtlMngDeleteSpcedtlinf_ODT output = new PBPPbokSpceDtlMngDeleteSpcedtlinf_ODT();
		
		logger.debug("공간상세삭제 input {}", input);
		

		logger.debug("공간상세리스트 셋 input {}", input.getSpceSrnoList());
		try {
			int delCnt = 0;
			for (String no : input.getSpceSrnoList()) {
				
				PBPPbokSplitBscMngCudSubSpceMng_DIDT didt = new PBPPbokSplitBscMngCudSubSpceMng_DIDT();
				didt.setTrnDscd("3"); // 거래구분코드
				didt.setSpceNo(no); // 공간번호
				didt.setAcno(input.getRprsAcno()); // 계좌번호
				
				pBPPbokSplitBscMng_COM.cudSubSpceMng(didt);
				
				delCnt++;
			}
			
			if (delCnt == input.getSpceSrnoList().size()) {
				output.setRspRtcd("200");
				output.setRspMsgTxt("성공");
			} 
		} catch(WFApplicationException e){
			logger.error("deleteSpcedtlinf 오류 :: {}", e);
			Object[] args = e.getArguments();
			
			throw new WFApplicationException("FNSE0006", new Object[] {e.getCode()} , new Object[] {args[0].toString()});
		} catch(Exception e){
			logger.error("deleteSpcedtlinf 오류 ::: {}", e);
		
			throw new WFApplicationException("FNSE0006", new Object[] {"9999"} , new Object[] {e.getMessage()});
		} 
		
		return output;
			
	}
		
	/**
	 * 통장쪼개기를 통해 생성된 공간의 거래내역을 조회하는 서비스
	 * 
	 * @param input 공간.상세.거래내역.컨트롤러.입력.IO
	 * @return 공간.상세.거래내역.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName="공간.상세.거래내역.조회", description="통장쪼개기를 통해 생성된 공간의 거래내역을 조회하는 서비스", author="90191355")
	public PBPPbokSpceDtlMngSelectSpcedtltrnprts_ODT selectSpcedtltrnprts(PBPPbokSpceDtlMngSelectSpcedtltrnprts_IDT input)
	{
		/**
		 * @BXMType GetBean
		 */
		pBPPbokSplitInq_COM = WFApplicationContext.getBean(pBPPbokSplitInq_COM, PBPPbokSplitInq_COM.class);

		PBPPbokSplitInqSelectPbokSplitItInf_DIDT didt = new PBPPbokSplitInqSelectPbokSplitItInf_DIDT();
		didt.setInqDscd("2"); // 조회구분코드
		didt.setAcno(input.getRprsAcno()); // 계좌번호
		didt.setSpceNo(input.getSpceSrno()); // 공간번호
		didt.setInqStaDt(input.getTrnStaDt()); // 조회시작일자
		didt.setInqEndDt(input.getTrnEndDt()); // 조회종료일자
		didt.setSortDscd(input.getSortDis()); // 정렬구분코드
		
		PBPPbokSplitInqSelectPbokSplitItInf_DODT dodt = pBPPbokSplitInq_COM.selectPbokSplitItInf(didt);
		PBPPbokSpceDtlMngSelectSpcedtltrnprts_ODT output= new PBPPbokSpceDtlMngSelectSpcedtltrnprts_ODT();
		if (dodt.getGrid2Cnt() > 0) {
			List<PBPPbokSpceDtlMngSelectSpcedtltrnprtslist_ODT> list = new ArrayList<PBPPbokSpceDtlMngSelectSpcedtltrnprtslist_ODT>();
			List<PBPPbokSplitInqSelectPbokSplitItInfTrnPrts_DODT> trnPrts = dodt.getTrnPrts();
			for (PBPPbokSplitInqSelectPbokSplitItInfTrnPrts_DODT trnItem : trnPrts) {
				//입출금구분코드 필터
				String dpsRapDscd = trnItem.getDpsRapDscd();
					//"" : 전체 , "0" : 전체
				if (!input.getDpsRapDscd().isEmpty() && !input.getDpsRapDscd().equals("0") &&!input.getDpsRapDscd().equals(dpsRapDscd)) {
					continue;
				}
				
				//거래금액 필터
				BigDecimal trnAm = trnItem.getDpsTrnAm();
				if (input.getMinAm() != null && input.getMinAm().intValue() != 0 && trnAm.intValue() < input.getMinAm().intValue()) {continue;}
				if (input.getMaxAm() != null && input.getMaxAm().intValue() != 0 && trnAm.intValue() > input.getMaxAm().intValue()) {continue;}
				
				PBPPbokSpceDtlMngSelectSpcedtltrnprtslist_ODT item = new PBPPbokSpceDtlMngSelectSpcedtltrnprtslist_ODT();
				item.setTrnSrno(trnItem.getTrnSrno()); //일련번호
				item.setTrnDt(trnItem.getTrnDt()); // 거래일자
				item.setTrnTm(trnItem.getTrnTm()); // 거래시각
				item.setRcvWdrDscd(dpsRapDscd); // 입금출금구분코드
				item.setRcvWdrDscdNm(trnItem.getDpsRapDscdNm()); // 입금출금구분코드
				item.setRawAm(trnAm); // 입출금금액
				item.setPbokRestAm(trnItem.getAftrBal()); // 통장잔여금액
				item.setPbokPrngTxt(trnItem.getPbokPrngOtlnTxt()); // 통장인자내용
				item.setTrnKdNm(trnItem.getMdKdcdNm()); // 거래종류명
				item.setTrnMemo(""); // 거래메모
				
				list.add(item);
			}
			
			output.setpBPSpceDtlTrnPrtsList_ODT(list);
		}

		return output;
			
	}
		
}
