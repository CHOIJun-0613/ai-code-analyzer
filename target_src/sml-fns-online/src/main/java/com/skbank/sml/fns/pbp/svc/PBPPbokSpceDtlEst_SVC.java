package com.skbank.sml.fns.pbp.svc;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.skbank.sml.fns.pbp.com.PBPPbokSplitBscMng_COM;
import com.skbank.sml.fns.pbp.com.PBPPbokSplitEstMng_COM;
import com.skbank.sml.fns.pbp.com.PBPPbokSplitInq_COM;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlEstDeleteSpceatpm_IDT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlEstDeleteSpceatpm_ODT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlEstDeleteSpceatpmlist_IDT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlEstInsertSpceatpminf_IDT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlEstInsertSpceatpminf_ODT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlEstInsertSpceatpminflist_IDT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlEstInsertSpcedtlest_IDT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlEstInsertSpcedtlest_ODT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlEstInsertSpcedtlestlist_IDT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlEstSelectRawActatpminf_IDT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlEstSelectRawActatpminf_ODT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlEstSelectRawactatpminflist_ODT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprts_IDT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprts_ODT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprtslist_ODT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlEstSelectSpcedtlgoalest_IDT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlEstSelectSpcedtlgoalest_ODT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlEstUpdateSpcedtlatsest_IDT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlEstUpdateSpcedtlatsest_ODT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlEstUpdateSpcedtlgoalest_IDT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlEstUpdateSpcedtlgoalest_ODT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlEstUpdateSpcedtlimg_IDT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlEstUpdateSpcedtlimg_ODT;
import com.skbank.sml.fns.pbp.dto.PBPPbokSpceDtlEstDeleteSpceAtsEst_DIDT;
import com.skbank.sml.fns.pbp.dto.PBPPbokSpceDtlEstInsertSpceAtsEst_DIDT;
import com.skbank.sml.fns.pbp.dto.PBPPbokSpceDtlEstInsertSpceAtsEst_DODT;
import com.skbank.sml.fns.pbp.dto.PBPPbokSpceDtlEstMngRawActatpminf_DIDT;
import com.skbank.sml.fns.pbp.dto.PBPPbokSpceDtlEstMngRawActatpminf_DODT;
import com.skbank.sml.fns.pbp.dto.PBPPbokSplitBscMngCudSubSpceMng_DIDT;
import com.skbank.sml.fns.pbp.dto.PBPPbokSplitBscMngCudSubSpceMng_DODT;
import com.skbank.sml.fns.pbp.dto.PBPPbokSplitBscMngUpdateSpceAmMv_DIDT;
import com.skbank.sml.fns.pbp.dto.PBPPbokSplitBscMngUpdateSpceAmMv_DODT;
import com.skbank.sml.fns.pbp.dto.PBPPbokSplitInqSelectPbokSplitItInfAtpmList_DODT;
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
 * 3.프로그램명 : 통장.공간.상세.설정.서비스 
 * 4.설명 : 통장의 공간을 상세 설정하는 서비스
 * 
 * @Class PBPPbokSpceDtlEst_SVC.java
 * @author 90191355
 * @since 2024.04.15
 * @version 1.0
 */
@Service
@BxmCategory(logicalName = "통장.공간.상세.설정.서비스", description = "통장의 공간을 상세 설정하는 서비스")
public class PBPPbokSpceDtlEst_SVC {
	private Logger logger = LoggerFactory.getLogger(getClass());	
	/**
	 * 통장 쪼개기 설정 관리 컴포넌트
	 */
	private PBPPbokSplitEstMng_COM pBPPbokSplitEstMng_COM;
	/**
	 * 통장 쪼개기 조회 컴포넌트
	 */
	private PBPPbokSplitInq_COM pBPPbokSplitInq_COM;
	/**
	 * 통장 쪼개기 일반 관리 컴포넌트
	 */
	private PBPPbokSplitBscMng_COM pBPPbokSplitBscMng_COM;

	
	/**
	 * 통장쪼개기를 통해 생성된 공간의 상세 설정을 등록 관리하는 서비스
	 * 
	 * @param input
	 *            공간.상세.설정.조회.컨트롤러.입력.IO
	 * @return 공간.상세.설정.조회.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName = "공간.상세.설정.등록", description = "통장쪼개기를 통해 생성된 공간의 상세 설정을 등록 관리하는 서비스", author = "90191355")
	public PBPPbokSpceDtlEstInsertSpcedtlest_ODT insertSpcedtlest(PBPPbokSpceDtlEstInsertSpcedtlest_IDT input) {

		/**
		 * @BXMType GetBean
		 */
		pBPPbokSplitBscMng_COM = WFApplicationContext.getBean(pBPPbokSplitBscMng_COM, PBPPbokSplitBscMng_COM.class);
		pBPPbokSplitEstMng_COM = WFApplicationContext.getBean(pBPPbokSplitEstMng_COM, PBPPbokSplitEstMng_COM.class);
		
		PBPPbokSpceDtlEstInsertSpcedtlest_ODT output = new PBPPbokSpceDtlEstInsertSpcedtlest_ODT();
		String errCd = "";
		String errUsgItem = "";
		try {			
			PBPPbokSplitBscMngCudSubSpceMng_DIDT didt1 = new PBPPbokSplitBscMngCudSubSpceMng_DIDT();
			didt1.setTrnDscd("1");
			didt1.setAcno(input.getAcno()); // 계좌번호
			didt1.setSpceNm(input.getSpceNm()); // 공간명
			didt1.setSpceIconNo(input.getSpceIconNo()); // 공간아이콘명
			didt1.setGoalStaDt(input.getGoalStaDt()); // 목표시작일자
			didt1.setGoalEndDt(input.getGoalEndDt()); // 목표종료일자
			didt1.setSavGoalAm(input.getSavGoalAm()); // 저축목표금액
			didt1.setCnsmGoalCycd(input.getCnsmGoalCycd()); // 소비목표주기코드
			didt1.setCnsmGoalAm(input.getCnsmGoalAm()); // 소비목표금액
					
			PBPPbokSplitBscMngCudSubSpceMng_DODT dodt1 = pBPPbokSplitBscMng_COM.cudSubSpceMng(didt1);
			if (logger.isDebugEnabled()) {
				logger.debug("공간 생성 후 .. ====== {} ::: ", dodt1);
			}
		
			String createdSpceNo = dodt1.getSpceNo();
			errUsgItem = createdSpceNo;
			if (createdSpceNo.isEmpty()) {
				errCd = "5001";
				throw new Exception("공간 생성 오류입니다.");
			}
			
			if ((!input.getGoalStaDt().isEmpty() && !input.getGoalEndDt().isEmpty()) || !input.getCnsmGoalCycd().isEmpty()) {
				PBPPbokSplitBscMngCudSubSpceMng_DIDT didt1_5 = new PBPPbokSplitBscMngCudSubSpceMng_DIDT();
				didt1_5.setTrnDscd("4");
				didt1_5.setAcno(input.getAcno()); // 계좌번호
				didt1_5.setSpceNo(createdSpceNo);
				didt1_5.setGoalStaDt(input.getGoalStaDt()); // 목표시작일자
				didt1_5.setGoalEndDt(input.getGoalEndDt()); // 목표종료일자
				didt1_5.setSavGoalAm(input.getSavGoalAm()); // 저축목표금액
				didt1_5.setCnsmGoalCycd(input.getCnsmGoalCycd()); // 소비목표주기코드
				didt1_5.setCnsmGoalAm(input.getCnsmGoalAm()); // 소비목표금액
				PBPPbokSplitBscMngCudSubSpceMng_DODT dodt1_5 = pBPPbokSplitBscMng_COM.cudSubSpceMng(didt1_5);
				if (dodt1_5.getSpceNo().isEmpty()) {
					errCd = "5002";
					throw new Exception("목표 설정 오류입니다.");
				}
				if (logger.isDebugEnabled()) {
					logger.debug("목표수정... .. ====== {} ::: ", dodt1_5);
				}
			}
		
			//금액이동
			PBPPbokSplitBscMngUpdateSpceAmMv_DIDT didt2 = new PBPPbokSplitBscMngUpdateSpceAmMv_DIDT();
			didt2.setRprsAcno(input.getAcno()); // 대표계좌번호
			didt2.setSpceSrno(createdSpceNo); // 공간일련번호
			didt2.setSpceMvbAm(input.getSpceAm()); // 공간이동금액
			didt2.setTrnDscd("1"); // 거래구분코드
			
			PBPPbokSplitBscMngUpdateSpceAmMv_DODT dodt2 = pBPPbokSplitBscMng_COM.updateSpceAmMv(didt2);
			if (!"200".equals(dodt2.getRspRtcd())) {
				errCd = "5003";
				throw new Exception("금액 이동 오류입니다.");
			}
			
			//자동이체
			if ("Y".equals(input.getAtsEstYn())) {
				PBPPbokSpceDtlEstInsertSpceAtsEst_DIDT didt3 = new PBPPbokSpceDtlEstInsertSpceAtsEst_DIDT();
				didt3.setRprsAcno(input.getAcno()); // 대표계좌번호
				didt3.setSpceSrno(createdSpceNo); // 공간일련번호
				didt3.setAtsEstYn(input.getAtsEstYn()); // 자동이체설정여부
				didt3.setAtsCycd(input.getAtsCycd()); // 자동이체주기코드
				didt3.setAtsDd(input.getAtsDd()); // 자동이체일
				didt3.setAtsAm(input.getAtsAm()); // 자동이체금액
				
				PBPPbokSpceDtlEstInsertSpceAtsEst_DODT dodt3 = pBPPbokSplitEstMng_COM.insertSpceAtsEst(didt3);
				if (!"200".equals(dodt3.getRspRtcd())) {
					errCd = "5004";
					throw new Exception("자동이체 설정 등록 오류입니다.");
				}
				
			}
			
			//자동납부
			List<PBPPbokSpceDtlEstInsertSpcedtlestlist_IDT> rgsAtpms = input.getpBPSpceDtlAtpmEstInfList_IDT();
			if (rgsAtpms.size() > 0) {
				
				try {
					for (PBPPbokSpceDtlEstInsertSpcedtlestlist_IDT rgsAtpm : rgsAtpms) {
						PBPPbokSpceDtlEstMngRawActatpminf_DIDT didt4 = new PBPPbokSpceDtlEstMngRawActatpminf_DIDT();
						didt4.setRprsAcno(input.getAcno()); // 대표계좌번호
						didt4.setAtpmCctnSpceSrno(createdSpceNo); // 자동납부연결공간일련번호
						didt4.setPrcDis("1"); // 처리구분
						didt4.setAtpmMngNo(rgsAtpm.getAtpmMngNo()); // 자동납부관리번호
						
						pBPPbokSplitEstMng_COM.mngRawActatpminf(didt4);
					}
				} catch (Exception e) {
					errCd = "5005";
					logger.error(e.getMessage());
					throw new Exception("공간 생성 완료, 자동납부 등록 오류입니다.", e);	
				}				
			}
			
			output.setRspRtcd("200");
			output.setRspMsgTxt("성공");
		} catch (Exception e) {
			logger.debug("공간 생성 오류=== {}", e.getMessage());
			if (errCd.isEmpty()) {
				output.setRspRtcd("500");
				output.setRspMsgTxt(e.getMessage());
			} else {
				output.setRspRtcd(errCd);
				output.setRspMsgTxt(errUsgItem);	
			}
			
		}
		
		return output;

	}

	/**
	 * 통장쪼개기를 통해 생성된 공간의 이미지를 수정 관리하는 서비스
	 * 
	 * 
	 * @param input 공간.상세.이미지.컨트롤러.입력.IO
	 * @return 공간.상세.이미지.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName = "공간.상세.이미지.수정", description = "통장쪼개기를 통해 생성된 공간의 이미지를 수정 관리하는 서비스", author = "90191355")
	public PBPPbokSpceDtlEstUpdateSpcedtlimg_ODT updateSpcedtlimg(PBPPbokSpceDtlEstUpdateSpcedtlimg_IDT input) {

		/**
		 * @BXMType GetBean
		 */
		pBPPbokSplitBscMng_COM = WFApplicationContext.getBean(pBPPbokSplitBscMng_COM, PBPPbokSplitBscMng_COM.class);
		
		PBPPbokSplitBscMngCudSubSpceMng_DIDT didt = new PBPPbokSplitBscMngCudSubSpceMng_DIDT();
		didt.setTrnDscd("2"); // 거래구분코드
		didt.setSpceNo(input.getSpceSrno()); // 공간번호
		didt.setAcno(input.getRprsAcno()); // 계좌번호
		didt.setSpceIconNo(input.getSpceIconNo());
		didt.setSpceNm(input.getSpceNm());
		
		pBPPbokSplitBscMng_COM.cudSubSpceMng(didt);
		
		PBPPbokSpceDtlEstUpdateSpcedtlimg_ODT output= new PBPPbokSpceDtlEstUpdateSpcedtlimg_ODT();
		output.setRspRtcd("200");

		return output;

	}

	/**
	 * 통장쪼개기를 통해 생성된 공간의 설정한 목표를 조회하는 서비스
	 * 
	 * @param input 공간.상세.목표.설정.조회.컨트롤러.입력.IO
	 * @return 공간.상세.목표.설정.조회.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName = "공간.상세.목표.설정.조회", description = "통장쪼개기를 통해 생성된 공간의 설정한 목표를 조회하는 서비스", author = "90191355")
	public PBPPbokSpceDtlEstSelectSpcedtlgoalest_ODT selectSpcedtlgoalest(PBPPbokSpceDtlEstSelectSpcedtlgoalest_IDT input) {

		/**
		 * @BXMType GetBean
		 */
		pBPPbokSplitInq_COM = WFApplicationContext.getBean(pBPPbokSplitInq_COM, PBPPbokSplitInq_COM.class);
		
		PBPPbokSpceDtlEstSelectSpcedtlgoalest_ODT output = new PBPPbokSpceDtlEstSelectSpcedtlgoalest_ODT();
		
		String targetSpaceNo = input.getSpceSrno();
		
		PBPPbokSplitInqSelectPbokSplitItInf_DIDT spaceDidt = new PBPPbokSplitInqSelectPbokSplitItInf_DIDT();
		spaceDidt.setAcno(input.getRprsAcno()); // 계좌번호
		spaceDidt.setSpceNo(targetSpaceNo); // 공간번호
		spaceDidt.setInqDscd("1"); // 조회구분코드 : 공간목록
		PBPPbokSplitInqSelectPbokSplitItInf_DODT dodt = pBPPbokSplitInq_COM.selectPbokSplitItInf(spaceDidt);
		List<PBPPbokSplitInqSelectPbokSplitItInfSubSpceList_DODT> spaceList = dodt.getSubSpceList();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd", Locale.KOREA);
		Calendar c = Calendar.getInstance();
		String today = sdf.format(c.getTime());

		//저축목표 종료기간이 과거일 경우 flag
		boolean isBeforeSaveGoal = false;
		BigDecimal saveAm = BigDecimal.ZERO;
		
		//공간 목표 셋팅
		for (PBPPbokSplitInqSelectPbokSplitItInfSubSpceList_DODT space : spaceList) {
			if (targetSpaceNo.equals(space.getSpceNo())) {
				//목표 설정
				BigDecimal savGoalAm = space.getSavGoalAm();
				boolean hasSaveGoal = savGoalAm.intValue() != 0;
				output.setSavGoalEstYn(hasSaveGoal ? "Y" : "N"); // 저축목표설정여부
				if (hasSaveGoal) {
					String savGoalStaDt = space.getSavGoalStaDt();
					String savGoalEndDt = space.getSavGoalEndDt();
					output.setSavGoalStaDt(savGoalStaDt); // 저축목표시작일자
					output.setSavGoalEndDt(savGoalEndDt); // 저축목표종료일자
					output.setSavGoalAm(savGoalAm); // 저축목표금액
					
					isBeforeSaveGoal = !savGoalEndDt.isEmpty() ? Integer.valueOf(today) > Integer.valueOf(savGoalEndDt) : false;
	
					saveAm = space.getSpceBal(); // 저축금액
				}

				BigDecimal cnsmGoalAm = space.getCnsmGoalAm();
				boolean hasCnsmGoal = cnsmGoalAm.intValue() != 0;;
				output.setCnsmGoalEstYn(hasCnsmGoal ? "Y" : "N"); // 저축목표설정여부

				if (hasCnsmGoal) {
					output.setCnsmAmBscd(space.getCnsmAmBscd()); // 소비금액주기코드
					output.setCnsmGoalAm(cnsmGoalAm); // 소비목표금액	
				}
				
				break;
			}
		}
		
		PBPPbokSplitInqSelectPbokSplitItInf_DIDT trnDidt = new PBPPbokSplitInqSelectPbokSplitItInf_DIDT();
		trnDidt.setAcno(input.getRprsAcno()); // 계좌번호
		trnDidt.setSpceNo(targetSpaceNo); // 공간번호
		trnDidt.setInqDscd("2"); // 거래내역
		
		//저축 목표가 과거일경우 해당 기간의 마지막(최신) 거래내역의 잔액을 구하여 저축금액으로 사용한다. 
		//거래내역이 종료일에 없을 수 있으니 기간 전체로 날짜 셋팅
		if (isBeforeSaveGoal) {
			trnDidt.setInqStaDt(output.getSavGoalStaDt()); // 조회시작일자
			trnDidt.setInqEndDt(output.getSavGoalEndDt()); // 조회종료일자
			trnDidt.setSortDscd("1"); // 정렬구분코드
			
			if (logger.isDebugEnabled()) {
				logger.debug("저축 목표 과거 거래 내역 호출");
			}
			PBPPbokSplitInqSelectPbokSplitItInf_DODT saveTrnDodt = pBPPbokSplitInq_COM.selectPbokSplitItInf(trnDidt);
			if (saveTrnDodt.getGrid2Cnt() > 0) {
				PBPPbokSplitInqSelectPbokSplitItInfTrnPrts_DODT lastTrnPrt = saveTrnDodt.getTrnPrts().get(0); //최신
				saveAm = lastTrnPrt.getAftrBal();				
			}
		}
		
		output.setSavAm(saveAm);

		if ("Y".equals(output.getCnsmGoalEstYn())) {
			//주기별 시작일자 셋팅
			String cnsmBscd = output.getCnsmAmBscd(); //1월 2주 3일
			//기준일자 셋팅
			List<String> baseDateList = new ArrayList<String>();
			baseDateList.add(today);
			
			for (int i = 0 ; i < 2 ; i++) {
				switch (cnsmBscd) {
					case "1": //월
						c.add(Calendar.MONTH, -1); //2달전 (3달)
						break;
					case "2": //주
						c.add(Calendar.WEEK_OF_MONTH, -1); //2주전 (3주) 
						break;
					case "3": //일
						c.add(Calendar.DATE, -1); //2일전 (3일)
						break;
					default:
						break;
				}
				
				String cnsnBaseDate = sdf.format(c.getTime());
				baseDateList.add(cnsnBaseDate);
			}
			
			//3개 전 기준일자 기준으로 시작일
			String calCnsmStartDate = sdf.format(c.getTime());
			trnDidt.setInqStaDt(calCnsmStartDate); // 조회시작일자
			trnDidt.setInqEndDt(today); // 조회종료일자
			trnDidt.setSortDscd("1"); // 정렬구분코드
			
			if (logger.isDebugEnabled()) {
				logger.debug("소비 목표 거래내역 호출");
			}
			PBPPbokSplitInqSelectPbokSplitItInf_DODT forCnsmTrnDodt = pBPPbokSplitInq_COM.selectPbokSplitItInf(trnDidt);
			List<PBPPbokSplitInqSelectPbokSplitItInfTrnPrts_DODT> cnsmDodtList = forCnsmTrnDodt.getTrnPrts().stream().filter(trn -> "2".equals(trn.getDpsRapDscd())).collect(Collectors.toList());
			if (logger.isDebugEnabled()) {
				logger.debug("소비 목표 거래내역 ::: {}", cnsmDodtList);
			}

			//기준일자 소비내역 합
			Map<String, PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprtslist_ODT> cnsmDtTotMap = new HashMap<String, PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprtslist_ODT>();
			try {
				String baseDateKey = null;
				Calendar calendar = Calendar.getInstance();
				
				String key = null;
				String trnDt = null;
				String yyyyMM = null;
				
				for (String baseDate : baseDateList) {
					//1 월 계산, 2: 주계산, 3: 일계산
					if ("1".equals(cnsmBscd)) {
						baseDateKey = baseDate.substring(0, 6);
					} else if ("3".equals(cnsmBscd)) {
						baseDateKey = baseDate;
					} else {
						calendar.setTime(sdf.parse(baseDate));
						int tempWeek = calendar.get(Calendar.WEEK_OF_MONTH);
						
						StringBuffer tempKeySb = new StringBuffer();
						tempKeySb.append(baseDate.substring(0, 6)).append(',').append(tempWeek);
						
						baseDateKey= tempKeySb.toString();
					}
					
					BigDecimal cnsmTrnAm = BigDecimal.ZERO;
					for (PBPPbokSplitInqSelectPbokSplitItInfTrnPrts_DODT cnsmItem : cnsmDodtList) {
						trnDt = cnsmItem.getTrnDt();
						yyyyMM = trnDt.substring(0, 6);

						if ("1".equals(cnsmBscd)) {
							key = yyyyMM;
						} else if ("3".equals(cnsmBscd)) {
							key = trnDt;
						} else {
							calendar.setTime(sdf.parse(trnDt));
							int week = calendar.get(Calendar.WEEK_OF_MONTH);
							//yyyyMM,n
							StringBuffer keySb = new StringBuffer();
							keySb.append(yyyyMM).append(',').append(week);
							
							key= keySb.toString();
						}
						if (baseDateKey.equals(key)) {
							cnsmTrnAm = cnsmTrnAm.add(cnsmItem.getDpsTrnAm());
						}
					}
					
					PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprtslist_ODT cnsmMapItem = new PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprtslist_ODT();
					cnsmMapItem.setDt(baseDateKey);
					cnsmMapItem.setGoalAm(cnsmTrnAm);
					
					cnsmDtTotMap.put(baseDateKey, cnsmMapItem);	
				}
				
				List<PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprtslist_ODT> resultCnsmList = new ArrayList<PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprtslist_ODT>();
				cnsmDtTotMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach((item) -> resultCnsmList.add(item.getValue()));
				
				if (logger.isDebugEnabled()) {
					logger.debug("소비 목표 주기 목록 계산 완료 ::: {}", resultCnsmList);
				}
				output.setpBPSpceDtlGoalAmList_ODT(resultCnsmList); // 공간.상세.목표.금액.목록.컨트롤러.출력.IO	
				
			} catch(Exception e){
				logger.error("소비 상세 내역 주 처리 오류 ::: {}", e);
			
				throw new WFApplicationException("FNSE0006", new Object[] {"9999"} , new Object[] {e.getMessage()});
			}
		}

		return output;
	}

	/**
	 * 통장쪼개기를 통해 생성된 공간의 설정한 목표를 수정하는 서비스
	 * 
	 * @param input 공간.상세.목표.설정.수정.컨트롤러.입력.IO
	 * @return 공간.상세.목표.설정.수정.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName = "공간.상세.목표.설정.수정", description = "통장쪼개기를 통해 생성된 공간의 설정한 목표를 수정하는 서비스", author = "90191355")
	public PBPPbokSpceDtlEstUpdateSpcedtlgoalest_ODT updateSpcedtlgoalest(PBPPbokSpceDtlEstUpdateSpcedtlgoalest_IDT input) {

		/**
		 * @BXMType GetBean
		 */
		pBPPbokSplitBscMng_COM= WFApplicationContext.getBean(pBPPbokSplitBscMng_COM, PBPPbokSplitBscMng_COM.class);
		PBPPbokSplitBscMngCudSubSpceMng_DIDT didt = new PBPPbokSplitBscMngCudSubSpceMng_DIDT();
		didt.setTrnDscd("4"); // 거래구분코드
		didt.setSpceNo(input.getSpceSrno()); // 공간번호
		didt.setAcno(input.getRprsAcno()); // 계좌번호
		
		String saveStartDate = input.getSavGoalStaDt();
		String saveEndDate = input.getSavGoalEndDt();
		BigDecimal saveAm = input.getSavGoalAm();
		if (!"Y".equals(input.getSavGoalEstYn())) {
			saveStartDate = "00010101";
			saveEndDate = "00010101";
			saveAm = BigDecimal.ZERO;
		}
		
		String cnsmCycle = input.getCnsmAmBscd();
		BigDecimal cnsmAm = input.getCnsmGoalAm();
		if (!"Y".equals(input.getCnsmGoalEstYn())) {
			cnsmCycle = "0";
			cnsmAm = BigDecimal.ZERO;
		}
		
		didt.setGoalStaDt(saveStartDate); // 목표시작일자
		didt.setGoalEndDt(saveEndDate); // 목표종료일자
		didt.setSavGoalAm(saveAm); // 저축목표금액
		didt.setCnsmGoalCycd(cnsmCycle); // 소비목표주기코드
		didt.setCnsmGoalAm(cnsmAm); // 소비목표금액
		
		pBPPbokSplitBscMng_COM.cudSubSpceMng(didt);

		PBPPbokSpceDtlEstUpdateSpcedtlgoalest_ODT output = new PBPPbokSpceDtlEstUpdateSpcedtlgoalest_ODT();
		output.setRspRtcd("200");

		return output;

	}
	
	/**
	 * 통장쪼개기를 통해 생성된 공간의 설정한 목표를 조회하는 서비스
	 * 
	 * @param input 공간.상세.목표.상세.내역.조회.컨트롤러.입력.IO
	 * @return 공간.상세.목표.상세.내역.조회.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName="공간.상세.목표.상세.내역.조회", description="통장쪼개기를 통해 생성된 공간의 설정한 목표를 조회하는 서비스", author="90191355")
	public PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprts_ODT selectSpcedtlgoaldtlprts(PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprts_IDT input
	)
	{
		/**
		* @BXMType GetBean
		*/
		pBPPbokSplitInq_COM= WFApplicationContext.getBean(pBPPbokSplitInq_COM, PBPPbokSplitInq_COM.class);
			
		/**
		 * @BXMType VariableDeclaration
		 */
		PBPPbokSplitInqSelectPbokSplitItInf_DIDT didt = new PBPPbokSplitInqSelectPbokSplitItInf_DIDT();
		didt.setAcno(input.getRprsAcno()); // 계좌번호
		didt.setSpceNo(input.getSpceSrno()); // 공간번호
		didt.setInqDscd("2"); // 거래내역
		didt.setSortDscd("1");

		String cnsmAmBsCd = input.getCnsmAmBsCd();
		String inqStartDate = input.getSavGoalStaDt();
		String inqEndDate = input.getSavGoalEndDt();
		
		
		boolean isSave = cnsmAmBsCd.isEmpty();
		//조회기간 셋팅		
		if (!isSave) {
			Calendar calendar = Calendar.getInstance();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd", Locale.KOREA);	
			inqEndDate = sdf.format(calendar.getTime());
			
			calendar.add(Calendar.YEAR, -1);
			inqStartDate = sdf.format(calendar.getTime());
		}
		didt.setInqStaDt(inqStartDate); // 조회시작일자
		didt.setInqEndDt(inqEndDate); // 조회종료일자
		
		if (logger.isDebugEnabled()) {
			logger.debug("목표 상세 거래내역 조회 input ::::: {}", didt);
		}
		PBPPbokSplitInqSelectPbokSplitItInf_DODT dodt = pBPPbokSplitInq_COM.selectPbokSplitItInf(didt);
		
		if (logger.isDebugEnabled()) {
			logger.debug("목표 상세 거래내역 조회 결과 ::::: {}", dodt.getGrid2Cnt());
		}
		
		PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprts_ODT output = new PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprts_ODT();
		
		//거래내역 없음
		if (dodt.getGrid2Cnt() == 0) {return output;}

		List<PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprtslist_ODT> list = new ArrayList<PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprtslist_ODT>();
		List<PBPPbokSplitInqSelectPbokSplitItInfTrnPrts_DODT> trnPrts = dodt.getTrnPrts();
		
		////================저축 내역 계산============================
		if (isSave) {
			List<PBPPbokSplitInqSelectPbokSplitItInfTrnPrts_DODT> saveTrnPrts = trnPrts.stream().filter(item -> "1".equals(item.getDpsRapDscd())).collect(Collectors.toList());
			if (logger.isDebugEnabled()) {
				logger.debug("목표 상세 거래내역 저축 내역 계산 시작, 저축 거래 내역 count ::::: {}", saveTrnPrts.size());
			}	
			//월 말 거래내역의 거래 후 잔액
			String tempMonth = "";
			for (int i = 0; i < saveTrnPrts.size(); i++) {
				PBPPbokSplitInqSelectPbokSplitItInfTrnPrts_DODT trn = saveTrnPrts.get(i);
				String trnDt = trn.getTrnDt();
				String month = trnDt.substring(0, 6);
				
				if (!tempMonth.equals(month)) {
					PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprtslist_ODT item = new PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprtslist_ODT();
					item.setDt(month);
					item.setGoalAm(trn.getAftrBal());
					list.add(item); 
					
					tempMonth = month;
				}
			}
			
			if (logger.isDebugEnabled()) {
				logger.debug("목표 상세 거래내역 저축 내역 계산 완료, 저축 내역 count ::::: {}", list.size());
			}	
			output.setpBPSpceDtlGoalAmList_ODT(list);
			
			return output;
		} 
			
		//================소비내역 계산============================
		List<PBPPbokSplitInqSelectPbokSplitItInfTrnPrts_DODT> cnsmTrnPrts = trnPrts.stream().filter(item -> "2".equals(item.getDpsRapDscd())).collect(Collectors.toList());
		
		if (logger.isDebugEnabled()) {
			logger.debug("목표 상세 거래내역 소비 내역 계산 시작, 소비 거래 내역 count ::::: {}", cnsmTrnPrts.size());
		}	

		if (cnsmTrnPrts.size() == 0) {
			if (logger.isDebugEnabled()) {
				logger.debug("소비 거래 내역 없음 return :::::");
			}	
			
			return output;
		}
			
		try {
			//기준일자 소비내역 합
			Map<String, PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprtslist_ODT> cnsmDtTotMap = new HashMap<String, PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprtslist_ODT>();
			
			Calendar calendar = Calendar.getInstance();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd", Locale.KOREA);
		
			String key = null;
			String trnDt = null;
			String yyyyMM = null;
			
			for (PBPPbokSplitInqSelectPbokSplitItInfTrnPrts_DODT cnsmItem : cnsmTrnPrts) {
				trnDt = cnsmItem.getTrnDt();
				yyyyMM = trnDt.substring(0, 6);
				//1 월, 2: 주, 3: 일 키
				if ("1".equals(cnsmAmBsCd)) {
					key = yyyyMM;
				} else if ("3".equals(cnsmAmBsCd)) {
					key = trnDt;
				} else {
					calendar.setTime(sdf.parse(trnDt));
					int week = calendar.get(Calendar.WEEK_OF_MONTH);
					//yyyyMM,n
					StringBuffer keySb = new StringBuffer();
					keySb.append(yyyyMM).append(',').append(week);
					
					key= keySb.toString();
				}
				
				PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprtslist_ODT mapItem = cnsmDtTotMap.get(key);
				if (mapItem == null) {
					mapItem = new PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprtslist_ODT();
					mapItem.setDt(key);
				}
				mapItem.setGoalAm(mapItem.getGoalAm().add(cnsmItem.getDpsTrnAm()));
				cnsmDtTotMap.put(key, mapItem);
			}
			
			List<PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprtslist_ODT> resultCnsmList = new ArrayList<PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprtslist_ODT>();
			cnsmDtTotMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach((item) -> resultCnsmList.add(item.getValue()));
		
			if (logger.isDebugEnabled()) {
				logger.debug("목표 상세 거래내역 소비 내역 계산 시작, 소비 내역 count ::::: {}", list.size());
			}	
			output.setpBPSpceDtlGoalAmList_ODT(resultCnsmList);
		} catch(Exception e){
			logger.error("소비 상세 내역 주 처리 오류 ::: {}", e);
		
			throw new WFApplicationException("FNSE0006", new Object[] {"9999"} , new Object[] {e.getMessage()});
		}
		
		return output;
			
	}

	/**
	 * 공간에서 설정한 자동이체를 수정 관리하는 서비스
	 * 무조건 해지 후 등록
	 * @param input 공간.상세.자동이체.설정.수정.컨트롤러.입력.IO
	 * @return 공간.상세.자동이체.설정.수정.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName = "공간.상세.자동이체.설정.수정", description = "공간에서 설정한 자동이체를 수정 관리하는 서비스", author = "90191355")
	public PBPPbokSpceDtlEstUpdateSpcedtlatsest_ODT updateSpcedtlatsest(	PBPPbokSpceDtlEstUpdateSpcedtlatsest_IDT input) {

		/**
		 * @BXMType GetBean
		 */
		pBPPbokSplitEstMng_COM = WFApplicationContext.getBean(pBPPbokSplitEstMng_COM, PBPPbokSplitEstMng_COM.class);
		PBPPbokSpceDtlEstUpdateSpcedtlatsest_ODT output = new PBPPbokSpceDtlEstUpdateSpcedtlatsest_ODT();
		
		String atsMngNo = input.getAtsMngNo();
		if (!atsMngNo.isEmpty()) {
			//해지 프로세스
			PBPPbokSpceDtlEstDeleteSpceAtsEst_DIDT didt = new PBPPbokSpceDtlEstDeleteSpceAtsEst_DIDT();
			didt.setRprsAcno(input.getAcno()); // 대표계좌번호
			didt.setSpceSrno(input.getSpceNo()); // 공간일련번호
			didt.setAtsMngNo(atsMngNo);
			pBPPbokSplitEstMng_COM.deleteSpceAtsEst(didt);
			output.setRspRtcd("200");
		}
		
		if ("N".equals(input.getAtsEstYn())) {
			//자동이체 아니오
			output.setRspRtcd("200");
			return output;
		}			

		//새로등록
		PBPPbokSpceDtlEstInsertSpceAtsEst_DIDT didt2 = new PBPPbokSpceDtlEstInsertSpceAtsEst_DIDT();
		didt2.setRprsAcno(input.getAcno()); // 대표계좌번호
		didt2.setSpceSrno(input.getSpceNo()); // 공간일련번호
		didt2.setAtsCycd(input.getAtsCycd()); // 자동이체주기코드
		didt2.setAtsDd(input.getAtsDd()); // 자동이체일
		didt2.setAtsAm(input.getAtsAm()); // 자동이체금액
		
		PBPPbokSpceDtlEstInsertSpceAtsEst_DODT dodt = pBPPbokSplitEstMng_COM.insertSpceAtsEst(didt2);
		if ("200".equals(dodt.getRspRtcd())) {
			output.setRspRtcd(dodt.getRspRtcd());
			output.setRspMsgTxt(dodt.getRspMsgTxt());
		}

		return output;

	}

	/**
	 * 공간에서 자동납부 대상을 조회 관리하기 위해 서비스
	 * 
	 * @param input 입출금계좌.자동납부.정보.조회.컨트롤러.입력.IO
	 * @return 입출금계좌.자동납부.정보.조회.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName = "입출금계좌.자동납부.정보.조회", description = "공간에서 자동납부 대상을 조회 관리하기 위해 서비스", author = "90191355")
	public PBPPbokSpceDtlEstSelectRawActatpminf_ODT selectRawActatpminf(PBPPbokSpceDtlEstSelectRawActatpminf_IDT input) {

		/**
		 * @BXMType GetBean
		 */
		pBPPbokSplitInq_COM = WFApplicationContext.getBean(pBPPbokSplitInq_COM, PBPPbokSplitInq_COM.class);
		
		PBPPbokSplitInqSelectPbokSplitItInf_DIDT didt = new PBPPbokSplitInqSelectPbokSplitItInf_DIDT();
		didt.setAcno(input.getRprsAcno()); // 계좌번호
		didt.setSpceNo(input.getSpceSrno()); // 공간번호
		didt.setInqDscd("4"); // 조회구분코드
		if ("000000".equals(input.getSpceSrno())) {
			//메인공간번호로 조회시 전체 조회
			didt.setInqDscd("5"); // 조회구분코드
			//전체 조회용 값 셋팅.. 의미 없음
			didt.setSortDscd("1"); 
			String dateNow = WFDateUtils.getDateNow();
			didt.setInqStaDt(dateNow);
			didt.setInqEndDt(dateNow);
		}
		
		boolean hasNext = false;
		List<PBPPbokSplitInqSelectPbokSplitItInfAtpmList_DODT> atpmList = new ArrayList<PBPPbokSplitInqSelectPbokSplitItInfAtpmList_DODT>();
		do {
			PBPPbokSplitInqSelectPbokSplitItInf_DODT dodt = pBPPbokSplitInq_COM.selectPbokSplitItInf(didt);
			hasNext = "Y".equals(dodt.getAtpmNxtTrnYn());
			didt.setAtpmMngNo(dodt.getAtpmMngNo());
			if (dodt.getGrid4Cnt() > 0) {
				atpmList.addAll(dodt.getAtpmList());				
			}
		} while (hasNext);
		
		
		PBPPbokSpceDtlEstSelectRawActatpminf_ODT output = new PBPPbokSpceDtlEstSelectRawActatpminf_ODT();
		
		if (atpmList.size() > 0) {
			List<PBPPbokSpceDtlEstSelectRawactatpminflist_ODT> list = new ArrayList<PBPPbokSpceDtlEstSelectRawactatpminflist_ODT>();
			for (PBPPbokSplitInqSelectPbokSplitItInfAtpmList_DODT atpm : atpmList) {
				PBPPbokSpceDtlEstSelectRawactatpminflist_ODT item = new PBPPbokSpceDtlEstSelectRawactatpminflist_ODT();
				item.setAtpmMngNo(atpm.getAtsMngNo()); // 자동납부관리번호
				item.setAtsSrvcPdcd(atpm.getAtsSrvcPdcd()); // 자동이체서비스상품코드
				item.setAtsWdrBkwAcno(atpm.getAtsWdrBkwAcno()); // 자동이체출금전행계좌번호
				item.setAtsRgsStcd(atpm.getAtsRgsStcd()); // 자동이체등록상태코드
				item.setAtsRgsStcdNm(atpm.getAtsRgsStcdNm()); // 자동이체등록상태코드명
				item.setAtsRgsDt(atpm.getAtsRgsDt()); // 자동이체등록일자
				item.setAtsCsno(atpm.getAtsCsno()); // 자동이체고객번호
				item.setAtsItcsno(atpm.getAtsItcsno()); // 자동이체통합고객번호
				item.setAtsCtrIscd(atpm.getAtsCtrIscd()); // 자동이체계약기관코드
				item.setAtsPypeNo(atpm.getAtsPypeNo()); // 자동이체납부자번호
				item.setAtsTlmOccIstSrno(atpm.getAtsTlmOccIstSrno()); // 자동이체전문발생기관일련번호
				item.setAtsCtrIstNm(atpm.getAtsCtrIstNm()); // 자동이체계약기관명
				item.setSpceNo(atpm.getSpceNo()); // 공간번호
				item.setSpceNm(atpm.getSpceNm()); //공간명 추가(다른 공간 자동납부때 사용)
				
				list.add(item);
			}
			
			output.setAtpmList(list);
		}
		
		return output;
	}

	/**
	 * 공간에서 자동납부 대상을 등록 관리를 위한 서비스
	 * 
	 * @param input  공간.자동납부.등록.컨트롤러.입력.IO
	 * @return 공간.자동납부.등록.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName = "공간.자동납부.등록", description = "공간에서 자동납부 대상의 등록 관리를 위한 서비스", author = "90191355")
	public PBPPbokSpceDtlEstInsertSpceatpminf_ODT insertSpceatpm(PBPPbokSpceDtlEstInsertSpceatpminf_IDT input) {

		/**
		 * @BXMType GetBean
		 */
		pBPPbokSplitEstMng_COM = WFApplicationContext.getBean(pBPPbokSplitEstMng_COM, PBPPbokSplitEstMng_COM.class);
		
		List<PBPPbokSpceDtlEstInsertSpceatpminflist_IDT> rgsAtpms = input.getpBPPbokSpceDtlEstInsertSpceatpminflist_IDT();
		PBPPbokSpceDtlEstInsertSpceatpminf_ODT output = new PBPPbokSpceDtlEstInsertSpceatpminf_ODT();
		try {
			int rgsCnt = 0;
			for (PBPPbokSpceDtlEstInsertSpceatpminflist_IDT rgsAtpm : rgsAtpms) {
				PBPPbokSpceDtlEstMngRawActatpminf_DIDT didt = new PBPPbokSpceDtlEstMngRawActatpminf_DIDT();
				
				didt.setPrcDis("1"); // 처리구분
				didt.setAtpmMngNo(rgsAtpm.getAtpmMngNo()); // 자동납부관리번호
				didt.setAtpmCctnSpceSrno(input.getSpceSrno()); // 자동납부연결공간일련번호
				didt.setRprsAcno(input.getRprsAcno()); // 대표계좌번호
				
				PBPPbokSpceDtlEstMngRawActatpminf_DODT dodt = pBPPbokSplitEstMng_COM.mngRawActatpminf(didt);
				
				rgsCnt += dodt.getMngCnt();
			}
			
			output.setRspRtcd("200");
			
			if (rgsCnt != rgsAtpms.size()) {
				throw new Exception("자동납부 등록 처리 중 오류가 발생했습니다.");	
			}
		} catch(WFApplicationException e){
			logger.error("자동납부 등록 처리 오류 :: {}", e);
			Object[] args = e.getArguments();
			
			throw new WFApplicationException("FNSE0006", new Object[] {e.getCode()} , new Object[] {args[0].toString()});
		} catch(Exception e){
			logger.error("자동납부 등록 처리 오류 ::: {}", e);
		
			throw new WFApplicationException("FNSE0006", new Object[] {"9999"} , new Object[] {e.getMessage()});
		} 
		
		return output;

	}

	/**
	 * 공간에서 자동납부 대상을 삭제 관리를 위한 서비스
	 * 
	 * @param input 통장쪼개기.자동납부.삭제.컨트롤러.입력.IO
	 * @return 통장쪼개기.자동납부.삭제.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName = "공간.자동납부.삭제", description = "공간에서 자동납부 대상의 삭제 관리를 위한 서비스", author = "90191355")
	public PBPPbokSpceDtlEstDeleteSpceatpm_ODT deleteSpceatpm(PBPPbokSpceDtlEstDeleteSpceatpm_IDT input) {

		/**
		 * @BXMType GetBean
		 */
		pBPPbokSplitEstMng_COM = WFApplicationContext.getBean(pBPPbokSplitEstMng_COM, PBPPbokSplitEstMng_COM.class);
		
		PBPPbokSpceDtlEstDeleteSpceatpm_ODT output = new PBPPbokSpceDtlEstDeleteSpceatpm_ODT();
		List<PBPPbokSpceDtlEstDeleteSpceatpmlist_IDT> delAtpms = input.getpBPPbokSpceDtlEstDeleteSpceatpmlist_IDT();
		try {
			int delCnt = 0;
			for (PBPPbokSpceDtlEstDeleteSpceatpmlist_IDT rgsAtpm : delAtpms) {
				PBPPbokSpceDtlEstMngRawActatpminf_DIDT didt = new PBPPbokSpceDtlEstMngRawActatpminf_DIDT();
				
				didt.setPrcDis("2"); // 처리구분
				didt.setAtpmMngNo(rgsAtpm.getAtpmMngNo()); // 자동납부관리번호
				didt.setAtpmCctnSpceSrno(input.getSpceSrno()); // 자동납부연결공간일련번호
				didt.setRprsAcno(input.getRprsAcno()); // 대표계좌번호
				
				PBPPbokSpceDtlEstMngRawActatpminf_DODT dodt = pBPPbokSplitEstMng_COM.mngRawActatpminf(didt);
				
				delCnt += dodt.getMngCnt();
			}
			
			output.setRspRtcd("200");
			
			if (delCnt != delAtpms.size()) {
				throw new Exception("자동납부 삭제 처리 중 오류가 발생했습니다.");	
			}
		} catch(WFApplicationException e){
			logger.error("자동납부 삭제 처리 오류 :: {}", e);
			Object[] args = e.getArguments();
			
			throw new WFApplicationException("FNSE0006", new Object[] {e.getCode()} , new Object[] {args[0].toString()});
		} catch(Exception e){
			logger.error("자동납부 삭제 처리 오류 ::: {}", e);
		
			throw new WFApplicationException("FNSE0006", new Object[] {"9999"} , new Object[] {e.getMessage()});
		} 
		
		return output;

	}
}
