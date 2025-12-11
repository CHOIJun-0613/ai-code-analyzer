package com.skbank.sml.fns.mnp.svc;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.skbank.sml.bsc.shr.com.SHRRnpeFnmInq_COM;
import com.skbank.sml.bsc.shr.dto.SHRRnpeNmInqInp_DTO;
import com.skbank.sml.bsc.shr.dto.SHRRnpeNmInqOup_DTO;
import com.skbank.sml.cmm.shr.com.SHRBusinessDayInfo_COM;
import com.skbank.sml.cmm.shr.com.SHRCMMLoginSession_COM;
import com.skbank.sml.cmm.shr.dto.CMM_CURRENT_CUST;
import com.skbank.sml.cmm.shr.dto.SHRBusinessDayInfo_DTO;
import com.skbank.sml.fns.mnp.com.MNPMnyPinBscMng_COM;
import com.skbank.sml.fns.mnp.com.MNPMnyPinFncTrn_COM;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinWallMngDeleteWallScss_IDT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinWallMngDeleteWallScss_ODT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinWallMngInsertWallBscInf_IDT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinWallMngInsertWallBscInf_ODT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinWallMngInsertWallIntAmTs_IDT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinWallMngInsertWallIntAmTs_ODT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinWallMngSelectWallBscInf_IDT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinWallMngSelectWallBscInf_ODT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinWallMngSelectWallGoalDtlPrtsList_ODT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinWallMngSelectWallGoalDtlPrts_IDT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinWallMngSelectWallGoalDtlPrts_ODT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinWallMngSelectWallGoalInf_IDT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinWallMngSelectWallGoalInf_ODT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinWallMngSelectWallIntDtlPrtsList_ODT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinWallMngSelectWallIntDtlPrts_IDT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinWallMngSelectWallIntDtlPrts_ODT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinWallMngSelectWallIntInfList_ODT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinWallMngSelectWallIntInf_IDT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinWallMngSelectWallIntInf_ODT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinWallMngSelectWallIntPrtsList_ODT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinWallMngSelectWallIntPrts_IDT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinWallMngSelectWallIntPrts_ODT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinWallMngSelectWallTrnPrts_IDT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinWallMngSelectWallTrnPrts_ODT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinWallMngUpdateWallAmRaw_IDT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinWallMngUpdateWallAmRaw_ODT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinWallMngUpdateWallBscInf_IDT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinWallMngUpdateWallBscInf_ODT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinWallMngUpdateWallGoalInf_IDT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinWallMngUpdateWallGoalInf_ODT;
import com.skbank.sml.fns.mnp.dbm.MNY_CLP_EXPS_SEQ_MNG001_DBM;
import com.skbank.sml.fns.mnp.dto.MNPBscInf_DTO;
import com.skbank.sml.fns.mnp.dto.MNPDeleteChidAcnoInfLstOut_DTO;
import com.skbank.sml.fns.mnp.dto.MNPDeleteChidAcnoInfLst_DTO;
import com.skbank.sml.fns.mnp.dto.MNPMnyPinBscMngSelectMnpChidAcno_DTO;
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
import com.skbank.sml.fns.mnp.dto.MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMSelectMnyClpExpsSeqMng_DIDT;
import com.skbank.sml.fns.mnp.dto.MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMUpdateMnyClpExpsSeqMng_DIDT;
import com.skbank.sml.fns.mnp.dto.MnyPinBscMngSelectMnpChidAcno_DIDT;
import com.skbank.sml.fns.mnp.dto.MnyPinBscMngSelectMnpChidAcno_DODT;
import com.skbank.sml.fns.mnp.dto.MnyPinBscMngUpdateMnpChidAcno_DIDT;
import com.skbank.sml.fns.mnp.dto.MnyPinBscMngUpdateMnpChidAcno_DODT;
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
import com.skbank.sml.fns.shr.com.SHRMNPWallBiz_COM;
import com.skbank.sml.fns.shr.dto.SHRMNPWallBizInsertBscWallSaf_DIDT;
import com.skbank.sml.fns.shr.dto.SHRMNPWallBizInsertBscWallSaf_DODT;
import com.skbank.sml.ifi.mca.eims4.dto.IBSMR0004224_GRID_IDT;
import com.skbank.sml.ifi.mca.eims5.dto.IBSMR0006155_GRID_ODT;
import com.skbank.sml.ifi.mca.eims6.dto.IBSMR0006066_GRID_IDT;
import com.skbank.sml.pds.shr.com.SHRDAIDpstInsvCanc_COM;

import bxm.common.annotaion.BxmCategory;
import bxm.common.util.StringUtils;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import fwk.skbank.online.context.WFApplicationContext;
import fwk.skbank.online.exception.app.WFApplicationException;
import fwk.skbank.online.util.WFDateUtils;

/**
 * 1.업무명 : NEWWON 대분류 금융서비스
 * 2.단위업무명 : NEWWON 중분류 통합알림함
 * 3.프로그램명 : 머니클립지갑관리서비스
 * 4.설명 : 
 * 
 * @Class MNPMnyPinWallMng_SVC.java
 * @author 90190263
 * @since 2024.08.06
 * @version 1.0
 */		
@Service
@BxmCategory(logicalName="머니클립지갑관리서비스", description="머니클립의 지갑 정보를 관리하는 서비스")
public class MNPMnyPinWallMng_SVC {
	private Logger logger= LoggerFactory.getLogger(getClass());
	
	/**
	 * 머니클립기본관리 컴포넌트
	 */
	private MNPMnyPinBscMng_COM mNPMnyPinBscMng_COM;
	/**
	 * 머니클립금융거래 컴포넌트
	 */
	private MNPMnyPinFncTrn_COM mNPMnyPinFncTrn_COM;	
	/**
	 * SHRCMMLoginSession 생성 컴포넌트
	 */
	private SHRCMMLoginSession_COM shrCMMLoginSession_COM;
	/**
	 * SHRRnpeFnmInq_COM 공유 공통 컴포넌트
	 */
	private SHRRnpeFnmInq_COM sHRRnpeFnmInq_COM;
	/**
	 * 영업일정보산출 컴포넌트(공유)
	 */
	private SHRBusinessDayInfo_COM sHRBusinessDayInfo_COM; 
	/**
	 * 예금.적금.해지.공유.컴포넌트
	 */
	private SHRDAIDpstInsvCanc_COM sHRDAIDpstInsvCanc_COM;
	/**
	 * 머니클립 지갑 노출 순서 추가용 쉐어 컴포넌트
	 */
	private SHRMNPWallBiz_COM sHRMNPWallBiz_COM;
	/**
	 * 머니클립 노출 순서 관리 DBM 
	 */
	private MNY_CLP_EXPS_SEQ_MNG001_DBM mnyClpExpsSeqMng001_DBM;
	
	/**
	 * 머니클립 지갑 기본 정보 조회 서비스
	 * 
	 * @param input 머니클립 지갑 기본 정보 조회 입력IO
	 * @return 머니클립 지갑 기본 정보 조회 출력IO
	 */
	@BxmCategory(logicalName="머니클립지갑기본정보조회", description="머니클립 지갑의 기본정보를 조회한다.", author="90191355")
	public MNPMnyPinWallMngSelectWallBscInf_ODT selectWallBscInf(MNPMnyPinWallMngSelectWallBscInf_IDT input) {
		/**
		 * @BXMType GetBean
		 */
		mNPMnyPinBscMng_COM = WFApplicationContext.getBean(mNPMnyPinBscMng_COM, MNPMnyPinBscMng_COM.class);
		mNPMnyPinFncTrn_COM = WFApplicationContext.getBean(mNPMnyPinFncTrn_COM, MNPMnyPinFncTrn_COM.class);
		
		/** 
		 * 로직 추가
		 */
		MNPMnyPinWallMngSelectWallBscInf_ODT output = new MNPMnyPinWallMngSelectWallBscInf_ODT();
		
		if (logger.isDebugEnabled()) {
			logger.debug("selectWallBscInf SVC input :: {} ", input);
		}
		
		MnyPinBscMngSelectMnpChidAcno_DIDT iChidAcnoInf = new MnyPinBscMngSelectMnpChidAcno_DIDT();
		iChidAcnoInf.setInqDscd("01"); 								// 거래구분코드
		iChidAcnoInf.setDpsInpAcno(input.getDpsInpAcno()); // 수신입력계좌번호
		
		if (logger.isDebugEnabled()) {
			logger.debug("selectWallBscInf  didt :: {} ", iChidAcnoInf);
		}
		
		MnyPinBscMngSelectMnpChidAcno_DODT oChidAcnoInf = mNPMnyPinBscMng_COM.selectMnpChidAcno(iChidAcnoInf);
		
		if (logger.isDebugEnabled()) {
			logger.debug("selectWallBscInf dodt :: {} ", oChidAcnoInf);
		}
		
		output.setDpsInpAcno(oChidAcnoInf.getDpsInpAcno()); 								// 수신입력계좌번호
		output.setDppdNm(oChidAcnoInf.getDppdNm()); 										// 수신상품명
		output.setDpacBal(oChidAcnoInf.getDpacBal()); 		
		
		BigDecimal wallBalSumAm = BigDecimal.ZERO;
		
		for (IBSMR0006155_GRID_ODT gridItem : oChidAcnoInf.getGrid()) {
			// 자계좌구분코드 (1.지갑, 2.지갑)
			if ("2".equals(gridItem.getMnyClpChidActDscd())) {
				continue;
			}
			
			wallBalSumAm = wallBalSumAm.add(gridItem.getDpacCtBal());
			
			if (!input.getMnyClpChidAcno().equals(gridItem.getMnyClpChidAcno())) {
				continue;
			}
			
			output.setMnyClpChidAcno(gridItem.getMnyClpChidAcno()); 				// 머니클립자계좌번호
			output.setMnyClpChidActNm(gridItem.getMnyClpChidActNm()); 			// 머니클립자계좌명
			output.setMnyClpChidActBal(gridItem.getDpacCtBal()); 								// 수신계좌현재잔액
			output.setMnyClpChidActDscd(gridItem.getMnyClpChidActDscd());		// 머니클립자계좌구분코드
			output.setActAplIrt(gridItem.getActAplIrt()); 									// 계좌적용이율??
			output.setMnyClpChidActCreDt(gridItem.getMnyClpChidActCreDt()); 	// 머니클립자계좌생성일자
			output.setMnyClpIconNo(gridItem.getMnyClpIconNo()); 					// 머니클립아이콘번호
			output.setMnyClpGoalAm(gridItem.getMnyClpGoalAm()); 					// 머니클립목표금액
			output.setPushAgrYn(gridItem.getBkAppPushAgrYn()); 						// PUSH동의여부
			output.setBscIntAm(gridItem.getBscIntAm()); 									// 기본이자금액
						
			MnyPinFncTrnSelectMnpChgItm_DIDT iMnpGoalInf = new MnyPinFncTrnSelectMnpChgItm_DIDT();
			
			// 목표 조회 추가 (지갑 상세 페이지에서 목표 설정 화면으로 이동할때 재조회 하지 않기 위해 추가) 
			// 거래구분코드 : [09] 조회
			iMnpGoalInf.setAtsWdrBkwAcno(input.getDpsInpAcno()); 	// 모계좌번호
			iMnpGoalInf.setCucd(""); 										// 통화코드
			iMnpGoalInf.setRcvAcno(input.getMnyClpChidAcno()); 			// 자계좌번호

			if (logger.isDebugEnabled()) {
				logger.debug("selectWallBscInf SVC 목표조회 didt :: {} ", iMnpGoalInf);
			}
			
			MnyPinFncTrnSelectMnpChgItm_DODT oMnpGoalInf= mNPMnyPinFncTrn_COM.selectMnpChgItm(iMnpGoalInf);
			
			if (logger.isDebugEnabled()) {
				logger.debug("selectWallBscInf SVC 목표조회 dodt :: {} ", oMnpGoalInf);
			}
			
			output.setAtsMngNo(oMnpGoalInf.getAtsMngNo()); 					// 자동이체관리번호
			output.setAtsBasDd(oMnpGoalInf.getAtsBasDd()); 						// 자동이체기준일
			output.setAtsCycd(oMnpGoalInf.getAtsCycd()); 						// 자동이체주기코드
			output.setAtsAm(oMnpGoalInf.getAtsAm()); 								// 자동이체금액
			output.setAtsStaDt(oMnpGoalInf.getAtsStaDt()); 						// 자동이체시작일자
			output.setAtsTitl(oMnpGoalInf.getAtsTitl()); 								// 자동이체제목
		}
		output.setWallBalSumAm(wallBalSumAm);

		if (logger.isDebugEnabled()) {
			logger.debug("selectWallBscInf SVC output :: {} ", output);
		}
		
		return output;
	}
	
	/**
	 * 머니클립 지갑 기본 정보 등록
	 * 
	 * @param input 머니클립 지갑 기본 정보 등록 입력IO
	 * @return 머니클립 지갑 기본 정보 등록 출력IO
	 */
	@BxmCategory(logicalName = "머니클립지갑기본정보등록", description = "머니클립 지갑 기본 정보를 등록한다.", author="90191355")
	public MNPMnyPinWallMngInsertWallBscInf_ODT insertWallBscInf(MNPMnyPinWallMngInsertWallBscInf_IDT input) {
		/**
		 * @BXMType GetBean
		 */
		mNPMnyPinBscMng_COM = WFApplicationContext.getBean(mNPMnyPinBscMng_COM, MNPMnyPinBscMng_COM.class);
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		sHRMNPWallBiz_COM = WFApplicationContext.getBean(sHRMNPWallBiz_COM, SHRMNPWallBiz_COM.class);
		
		/** 
		 * 로직 추가
		 */
		MNPMnyPinWallMngInsertWallBscInf_ODT output = new MNPMnyPinWallMngInsertWallBscInf_ODT();
		
		if (logger.isDebugEnabled()) {
			logger.debug("insertWallBscInf SVC input :: {} ", input);
		}
		
		try {
			/**
			 * 머니클립 자계좌 등록
			 */
			SHRMNPWallBizInsertBscWallSaf_DIDT shrDidt = new SHRMNPWallBizInsertBscWallSaf_DIDT();
			shrDidt.setDpsInpAcno(input.getDpsInpAcno()); // 수신입력계좌번호
			shrDidt.setAcnoTyp("1"); // 계좌타입
			shrDidt.setIconNo(input.getIconCd()); // 아이콘번호
			shrDidt.setAcnoNm(input.getWallAlsNm()); // 계좌명
			shrDidt.setAtsYn(input.getAtsYn()); // 자동이체여부 
			
			if("Y".equals(input.getAtsYn())) {
				String cycd = input.getAtsCycd();		
				Calendar c = Calendar.getInstance(); //오늘
				String dd = input.getAtsDd(); //요일 or 일자
				int baseDd = 0;
				
				if ("01".equals(cycd)) {
					//매월, (오늘 이전 이후 날짜 비교)시작일자 구하기
					Integer atsDD = Integer.valueOf(dd);
					int toDd = c.get(Calendar.DATE);
					
					if (toDd >= atsDD) {
						int toMonth = c.get(Calendar.MONTH); //0~11
						//자동이체 신청일이 오늘과 같거나 작으면 다음달로
						c.set(Calendar.MONTH, toMonth + 1);
					}
					
					//말일 선택시 
					if (31 == atsDD) {
						//기준일 말일(31)
						baseDd = 31;
						//말일 선택시 시작일값 실제 말일 값으로 변경
						atsDD = c.getActualMaximum(Calendar.DAY_OF_MONTH);;
					}
					c.set(Calendar.DATE, atsDD);
				} else if ("22".equals(cycd)) {
					//매주, 요일의 다음 시작일자 구하기
					Integer atsDD = Integer.valueOf(dd);
					//요일 계산하여 더함
					int day = c.get(Calendar.DAY_OF_WEEK); //일: 1 ~ 토: 7
					//요일일때 화면에서 dd 값 월~일 1~7로 들어옴
					//calendar와 요일 값 싱크 맞추기
					int dow =  day - atsDD < 0 ? 
							atsDD - 6 // 일요일이면 화면값 7 캘린더 1 
							: atsDD + 1; //나머지요일 화면값 + 1
					
					int plusDay = 0;
					
					int diffDay = dow - day;
					if (diffDay <= 0) {
						plusDay = 7 - day + dow;
					} else {
						plusDay = diffDay;
					}
					
					c.add(Calendar.DATE, plusDay);
					
					//매주일때 요일 값 셋팅
					shrDidt.setAtsStaWkdDscd(input.getAtsDd()); 		// 적금적립이체시작요일구분코드 1 ~ 7(월 ~ 일)
				} else {
					//매일 시작일자(내일)
					c.add(Calendar.DATE, 1);
				}
				SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd", Locale.KOREA);
				String startDate = sdf.format(c.getTime());
				shrDidt.setAtsCycd(cycd); // 자동이체주기코드:  01:매월, 20매일, 22:매주
				shrDidt.setAtsDd(baseDd == 0 ? Integer.parseInt(startDate.substring(6, 8)) : baseDd); // 자동이체일
				shrDidt.setAtsStaDt(startDate); // 자동이체시작일자
				shrDidt.setAtsAm(input.getAtsAm()); // 자동이체금액
				shrDidt.setGoalAm(input.getDinsvGoalAm()); // 목표금액
				shrDidt.setGoalNm(input.getAimFdNm()); // 목표명
			}
		
			if (logger.isDebugEnabled()) {
				logger.debug("insertWallBscInf SVC 자계좌 등록 didt :: {} ", shrDidt);
			}
			
			SHRMNPWallBizInsertBscWallSaf_DODT shrdodt = sHRMNPWallBiz_COM.insertBscWallSaf(shrDidt);
			
			if (logger.isDebugEnabled()) {
				logger.debug(" insertWallBscInf SVC 자계좌 등록 dodt :: {} ", shrdodt);
			}
			
			output.setNewAcno(shrdodt.getNewAcno()); 	// 신규계좌번호
			output.setPrcRtcd(shrdodt.getPrcRtcd()); 		// 처리결과코드
			output.setPrcRstTxt(shrdodt.getPrcRstTxt()); 	// 처리결과내용
			
			if (logger.isDebugEnabled()) {
				logger.debug("insertWallBscInf SVC output :: {} ", output);
			}
		} catch (WFApplicationException e) {
			output.setPrcRtcd("9999"); 		// 처리결과코드
			Object[] args = e.getArguments();
			output.setPrcRstTxt(args[0].toString()); 	// 처리결과내용
			logger.debug("insertWallBscInf WFApplicationException 오류 msgID | errorMsg  : [{}], [{}] ",e.getCode(), e.getMessage());
		}
		
		return output;
	}
	
	/**
	 * 머니클립 지갑의 기본정보(지갑명, 아이콘) 를 수정하는 서비스
	 * 
	 * @param input 머니클립 지갑 기본 정보 수정 입력IO
	 * @return 머니클립 지갑 기본 정보 수정 출력IO
	 */
	@BxmCategory(logicalName="머니클립지갑기본정보수정", description="머니클립 지갑의 기본정보를 수정한다.", author="90191355")
	public MNPMnyPinWallMngUpdateWallBscInf_ODT updateWallBscInf(MNPMnyPinWallMngUpdateWallBscInf_IDT input	) {
		/**
		* @BXMType GetBean
		*/
		mNPMnyPinFncTrn_COM = WFApplicationContext.getBean(mNPMnyPinFncTrn_COM, MNPMnyPinFncTrn_COM.class);
		mnyClpExpsSeqMng001_DBM = WFApplicationContext.getBean(mnyClpExpsSeqMng001_DBM, MNY_CLP_EXPS_SEQ_MNG001_DBM.class);
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		mNPMnyPinBscMng_COM = WFApplicationContext.getBean(mNPMnyPinBscMng_COM, MNPMnyPinBscMng_COM.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */
		MNPMnyPinWallMngUpdateWallBscInf_ODT output = new MNPMnyPinWallMngUpdateWallBscInf_ODT();

		
		if (logger.isDebugEnabled()) {
			logger.debug("updateWallBscInf SVC input :: {} ", input);
		}
		
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession();
		/** 
		 * 항목변경코드 
		 * [079033] (머니클립 별명 등록 정보)
		 * 995 별명 		- 예시 : 여행자금 
		 * [079034] (머니클립 아이콘 등록 정보)
		 * 995 아이콘 
		 */
		MnyPinBscMngUpdateMnpChidAcno_DODT oMnpSafNameInf = new MnyPinBscMngUpdateMnpChidAcno_DODT();
		MnyPinBscMngUpdateMnpChidAcno_DODT oMnpSafIconInf = new MnyPinBscMngUpdateMnpChidAcno_DODT(); 
		
		MnyPinBscMngUpdateMnpChidAcno_DIDT iMnpSafInf= new MnyPinBscMngUpdateMnpChidAcno_DIDT();
		iMnpSafInf.setDpsInpAcno(input.getWallAcno()); // 수신입력계좌번호
		
		String wallName = input.getWallAlsNm();
		if(!StringUtils.isEmpty(wallName)) {
			String chgItcd = "079033";
			iMnpSafInf.setDpsRgsChgItcd(chgItcd); // 수신등록변경항목코드
			
			List<IBSMR0004224_GRID_IDT> iIBSMR0004224Grid = new ArrayList<>();
			
			IBSMR0004224_GRID_IDT iIBSMR0004224Data = new IBSMR0004224_GRID_IDT();
			iIBSMR0004224Data.setDpsRgsChgItcd(chgItcd);	// 머니클립 별명 등록 정보
			iIBSMR0004224Data.setDpsRgsChgDtcd("995");
			iIBSMR0004224Data.setDpsRgsChgDtcdTxt(wallName);
			iIBSMR0004224Grid.add(iIBSMR0004224Data);
			
			iMnpSafInf.setGridRowCnt(1); // 그리드열건수
			iMnpSafInf.setGrid(iIBSMR0004224Grid);

			if (logger.isDebugEnabled()) {
				logger.debug("updateWallBscInf SVC 지갑명 변경 didt :: {} ", iMnpSafInf);
			}
			
			oMnpSafNameInf= mNPMnyPinBscMng_COM.updateMnpChidAcno(iMnpSafInf);

			if (logger.isDebugEnabled()) {
				logger.debug("updateWallBscInf SVC 지갑명 변경 dodt :: {} ", oMnpSafNameInf);
			}
			
		}
		String iconValue = input.getIconCd();
		if(!StringUtils.isEmpty(iconValue)) {
			String chgItcd = "079034";
			iMnpSafInf.setDpsRgsChgItcd(chgItcd); // 수신등록변경항목코드
			
			List<IBSMR0004224_GRID_IDT> iIBSMR0004224Grid = new ArrayList<>();

			IBSMR0004224_GRID_IDT iIBSMR0004224Data = new IBSMR0004224_GRID_IDT();
			iIBSMR0004224Data.setDpsRgsChgItcd(chgItcd);	// 머니클립 아이콘 등록 정보
			iIBSMR0004224Data.setDpsRgsChgDtcd("995");
			iIBSMR0004224Data.setDpsRgsChgDtcdTxt(iconValue);
			
			iIBSMR0004224Grid.add(iIBSMR0004224Data);

			iMnpSafInf.setGridRowCnt(1); // 그리드열건수
			iMnpSafInf.setGrid(iIBSMR0004224Grid);

			if (logger.isDebugEnabled()) {
				logger.debug("updateWallBscInf SVC 아이콘 변경 didt :: {} ", iMnpSafInf);
			}
			
			oMnpSafIconInf= mNPMnyPinBscMng_COM.updateMnpChidAcno(iMnpSafInf);

			if (logger.isDebugEnabled()) {
				logger.debug("updateWallBscInf SVC 아이콘 변경 dodt :: {} ", oMnpSafIconInf);
			}
		}
		
		if( !"0000".equals(oMnpSafNameInf.getTrnRstCd())) {
			output.setTrnRstCd("9999"); 										// 거래결과코드
			output.setTrnRstTxt("지갑명 수정에 실패했습니다."); 				// 거래결과내용
		}
		
		if( !"0000".equals(oMnpSafIconInf.getTrnRstCd())) {
			output.setTrnRstCd("9999"); 										// 거래결과코드
			output.setTrnRstTxt("아이콘 수정에 실패했습니다."); 				// 거래결과내용
		}
		
		if("0000".equals(oMnpSafNameInf.getTrnRstCd()) 
			&& "0000".equals(oMnpSafIconInf.getTrnRstCd()) ) {

			MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMSelectMnyClpExpsSeqMng_DIDT selDidt = new MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMSelectMnyClpExpsSeqMng_DIDT();
			selDidt.setItcsno(currentCust.getItcsno()); // 통합고객번호
			selDidt.setMnyClpMoAcno(input.getDpsInpAcno()); // 머니클립모계좌번호
			//selDidt.setMnyClpChidAcno(input.getWallAcno()); // 머니클립자계좌번호
			
			List<MNPBscInf_DTO> selectDBItemList = mnyClpExpsSeqMng001_DBM.selectMnyClpExpsSeqMng(selDidt);
			
			MNPBscInf_DTO targetItem = selectDBItemList.stream().filter(item -> input.getWallAcno().equals(item.getMnyClpChidAcno())).findFirst().orElse(null);
			
			if (targetItem != null) {
				if (logger.isDebugEnabled()) {
					logger.debug("updateWallBscInf SVC 노출 순서 등록 수정 ::: {}", targetItem);
				}
				
				try {
					MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMUpdateMnyClpExpsSeqMng_DIDT dbUpdateInput = new MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMUpdateMnyClpExpsSeqMng_DIDT();
					dbUpdateInput.setItcsno(currentCust.getItcsno()); // 통합고객번호
					dbUpdateInput.setMnyClpChidAcno(targetItem.getMnyClpChidAcno()); // 머니클립자계좌번호
					dbUpdateInput.setMnyClpMoAcno(targetItem.getMnyClpMoAcno()); // 머니클립모계좌번호
					dbUpdateInput.setMnyClpChidActDscd(targetItem.getMnyClpChidActDscd()); // 머니클립자계좌구분코드
					dbUpdateInput.setMnyClpChidActExpsSeq(targetItem.getMnyClpChidActExpsSeq()); // 머니클립자계좌노출순서
					
					dbUpdateInput.setMnyClpChidActNm(!StringUtils.isEmpty(wallName) ? wallName : dbUpdateInput.getMnyClpChidActNm()); // 머니클립자계좌명
					dbUpdateInput.setMnyClpChidActIconNm(!StringUtils.isEmpty(iconValue) ? iconValue : targetItem.getMnyClpChidActIconNm()); // 머니클립자계좌아이콘명
					dbUpdateInput.setAmdpeId(currentCust.getUserId()); // 수정자ID
					
					mnyClpExpsSeqMng001_DBM.updateMnyClpExpsSeqMng(dbUpdateInput);
				} catch (Exception e) {
					//노출 순서 수정 관련 오류일 경우 다음에 정상화 되었을때 처리되어도 프로세스상 문제는 없음
					logger.error("updateWallBscInf SVC 아이콘 변경 지갑 노출 순서 수정 실패 {} ", e);
					output.setTrnRstCd("0000"); 	// 거래결과코드
					output.setTrnRstTxt("노출 순서 수정 관련 오류 로그 확인 필요."); 	// 거래결과내용
					return output;
				}
			}
			output.setTrnRstCd(oMnpSafNameInf.getTrnRstCd()); 	// 거래결과코드
			output.setTrnRstTxt(oMnpSafNameInf.getTrnRstTxt()); 	// 거래결과내용
		}

		if (logger.isDebugEnabled()) {
			logger.debug("updateWallBscInf SVC output :: {} ", output);
		}
		
		return output;
	}
	
	/**
	 * 머니클립 지갑을 해지하는 서비스
	 * 
	 * @param input 머니클립 지갑 해지 입력IO
	 * @return 머니클립 지갑 해지 출력IO
	 */
	@BxmCategory(logicalName = "머니클립지갑해지", description = "머니클립 지갑를 해지하는 서비스", author="90191355")
	public MNPMnyPinWallMngDeleteWallScss_ODT deleteWallScss(MNPMnyPinWallMngDeleteWallScss_IDT input) {
		/**
		 * @BXMType GetBean
		 */
		mNPMnyPinFncTrn_COM = WFApplicationContext.getBean(mNPMnyPinFncTrn_COM, MNPMnyPinFncTrn_COM.class);
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		sHRRnpeFnmInq_COM = WFApplicationContext.getBean(sHRRnpeFnmInq_COM,SHRRnpeFnmInq_COM.class);
		sHRDAIDpstInsvCanc_COM= WFApplicationContext.getBean(sHRDAIDpstInsvCanc_COM, SHRDAIDpstInsvCanc_COM.class);
		mNPMnyPinBscMng_COM = WFApplicationContext.getBean(mNPMnyPinBscMng_COM, MNPMnyPinBscMng_COM.class);
		
		/** 
		 * 로직 추가
		 */
		MNPMnyPinWallMngDeleteWallScss_ODT output = new MNPMnyPinWallMngDeleteWallScss_ODT();
		
		if (logger.isDebugEnabled()) {
			logger.debug("deleteWallScss SVC input :: {} ", input);
		}
		
		if (shrCMMLoginSession_COM.istLogin()) {
			try {
				MNPDeleteChidAcnoInfLst_DTO inDto = new MNPDeleteChidAcnoInfLst_DTO(); 
				inDto.setDpsInpAcno(input.getRcvAcno()); 					// 수신입력계좌번호 : 모계좌
				
				MNPMnyPinBscMngSelectMnpChidAcno_DTO deleteWallItem = new MNPMnyPinBscMngSelectMnpChidAcno_DTO();
				deleteWallItem.setMnyClpChidAcno(input.getCancAcno());	// 자계좌
				deleteWallItem.setDpacCtBal(input.getDpacBal());				// 해지금액
				
				List<MNPMnyPinBscMngSelectMnpChidAcno_DTO> grid = new ArrayList<MNPMnyPinBscMngSelectMnpChidAcno_DTO>();
				grid.add(deleteWallItem);
				
				inDto.setGridCnt(grid.size()); 								// 그리드건수
				inDto.setGrid(grid); 										// 머니클립.자.계좌.조회.컴포넌트.공통.출력.IO
				
				// 자계좌 삭제 컴포넌트 호출
				MNPDeleteChidAcnoInfLstOut_DTO outDto = mNPMnyPinBscMng_COM.deleteChidAcnoInfLst(inDto);
				
				output.setErrMsgId("0000"); 							// 오류메시지ID : 성공
				output.setErrMsgTxt(outDto.getErrMsgTxt());	// 오류메시지내용
			} catch (WFApplicationException e) {
				Object[] args = e.getArguments();
				output.setErrMsgId(e.getCode());
				output.setErrMsgTxt(args[0].toString());
				logger.debug("deleteWallScss WFApplicationException 오류 msgID | errorMsg  : [{}], [{}] ",e.getCode(), args[0].toString());
			} catch (Exception e) {
				output.setErrMsgId("9999");
				output.setErrMsgTxt(e.getMessage());
				logger.debug("deleteWallScss Exception 오류",e);
			}
		} else {
			//  로그인 세션이 존재하지 않습니다.
			throw new WFApplicationException("CMME0018");
		}

		if (logger.isDebugEnabled()) {
			logger.debug("deleteWallScss SVC output :: {} ", output);
		}
		
		return output;
	}
	
	/**
	 * 지갑 금액 입출금 수정
	 * 
	 * 머니클립 지갑의 금액을 꺼내기/채우기 금액을 수정한다
	 * 
	 * @param input 머니클립 지갑 금액 입출금 수정 입력IO
	 * @return 머니클립 지갑 금액 입출금 수정 출력IO
	 */
	@PostMapping("/updateWallAmRaw")
	@ApiOperation(
		value = "머니클립지갑금액입출금수정"
		, notes = ""
	)
	@BxmCategory(logicalName="머니클립지갑금액입출금수정", description="머니클립 지갑의 금액을 꺼내기/채우기 금액을 수정한다.", author="90191355")
	public MNPMnyPinWallMngUpdateWallAmRaw_ODT updateWallAmRaw(@ApiParam(value="input", example="") 
	@RequestBody MNPMnyPinWallMngUpdateWallAmRaw_IDT input
	) {
		/**
		* @BXMType GetBean
		*/
		mNPMnyPinFncTrn_COM = WFApplicationContext.getBean(mNPMnyPinFncTrn_COM, MNPMnyPinFncTrn_COM.class);
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		sHRRnpeFnmInq_COM = WFApplicationContext.getBean(sHRRnpeFnmInq_COM,SHRRnpeFnmInq_COM.class);
					
		/**
		 * @BXMType VariableDeclaration
		 */
		MNPMnyPinWallMngUpdateWallAmRaw_ODT output = new MNPMnyPinWallMngUpdateWallAmRaw_ODT();
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession();
		
		if (logger.isDebugEnabled()) {
			logger.debug("updateWallAmRaw SVC input :: {} ", input);
		}
		
		MnyPinFncTrnSelectMnpTsAvl_DIDT iMnpTsAvl= new MnyPinFncTrnSelectMnpTsAvl_DIDT();
		
		if (logger.isDebugEnabled()) {
			logger.debug("updateWallAmRaw SVC 이체가능조회 input :: {} ", iMnpTsAvl);
		}
	
		if (shrCMMLoginSession_COM.istLogin()) {
			try {
				String sRnpeFnm = "";
				
				SHRRnpeNmInqInp_DTO shrRnpeNmDto = new SHRRnpeNmInqInp_DTO();
				
				shrRnpeNmDto.setWdrBkcd("020"); 							// 출금은행코드
				shrRnpeNmDto.setWdrAcno(input.getWdrAcno()); 		// 출금계좌번호
				shrRnpeNmDto.setTrnAm(input.getTrnAm()); 				// 거래금액
				shrRnpeNmDto.setRcvBkcd("020"); 							// 입금은행코드
				shrRnpeNmDto.setRcvAcno(input.getRcvAcno()); 		// 입금계좌번호
				shrRnpeNmDto.setUserId(currentCust.getUserId()); 	// 사용자ID
				shrRnpeNmDto.setItcsno(currentCust.getItcsno()); 	// 통합고객번호
				shrRnpeNmDto.setFdtsYn("Y"); 								// 자금이체여부
				shrRnpeNmDto.setFrqntRgsSelYn("N"); 						// 자주쓰는계좌등록조회여부
				
				SHRRnpeNmInqOup_DTO shrRnpeNmOutDto = sHRRnpeFnmInq_COM.selectRnpeNm(shrRnpeNmDto);
	
				if (!ObjectUtils.isEmpty(shrRnpeNmOutDto)) {
					sRnpeFnm = shrRnpeNmOutDto.getRnpeFnm(); // 수취인성명
				}
				
				if("".equals(sRnpeFnm)) {
					output.setErrMsgId("BSCE0035");
					output.setErrMsgTxt("수취인 조회중 에러가 발생하였습니다.");
					return output;
				}

				iMnpTsAvl.setWdrAcno(input.getWdrAcno());						// 출금계좌번호
				iMnpTsAvl.setActPwnoUsgYn("N"); 									// 계좌비밀번호사용여부
				iMnpTsAvl.setTrnAm(input.getTrnAm()); 							// 거래금액
				iMnpTsAvl.setRsvDt("00010101"); 									// 예약일자
				iMnpTsAvl.setRcvBkcd("020"); 										// 입금은행코드
				iMnpTsAvl.setRcvAcno(input.getRcvAcno()); 					// 입금계좌번호
				iMnpTsAvl.setPtnPbokPrngTxt(input.getPtnPbokPrngTxt()); 	// 상대통장인자내용
				iMnpTsAvl.setRnpeFnm(sRnpeFnm); 									// 수취인성명
				iMnpTsAvl.setHbitclngYn("M");											//머니클립 금액이동 비번체크 해제를 위한 값
				
				MnyPinFncTrnSelectMnpTsAvl_DODT oMnpTsAvl = mNPMnyPinFncTrn_COM.selectMnpTsAvl(iMnpTsAvl);
				
				if (logger.isDebugEnabled()) {
					logger.debug("updateWallAmRaw SVC 이체가능조회 output :: {} ", oMnpTsAvl);
				}
				
				MnyPinFncTrnUpdateMnpAmTs_DIDT iMnpAmTs = new MnyPinFncTrnUpdateMnpAmTs_DIDT();
			
				iMnpAmTs.setWdrAcno(input.getWdrAcno()); 					// 출금계좌번호
				iMnpAmTs.setActPwnoUsgYn("N"); 									// 계좌비밀번호사용여부
				iMnpAmTs.setTrnAm(input.getTrnAm()); 							// 거래금액
				iMnpAmTs.setRsvDt("00010101"); 									// 예약일자
				iMnpAmTs.setRcvBkcd("020"); 										// 입금은행코드
				iMnpAmTs.setRcvAcno(input.getRcvAcno()); 					// 입금계좌번호
				iMnpAmTs.setPtnPbokPrngTxt(input.getPtnPbokPrngTxt()); 	// 상대통장인자내용
				iMnpAmTs.setRnpeFnm(sRnpeFnm); 									// 수취인성명
				iMnpAmTs.setWdrPbokPrngTxt(input.getWdrPbokPrngTxt());	// 출금통장인자내용
				iMnpAmTs.setHbitclngYn("M");											//머니클립 금액이동 비번체크 해제를 위한 값
				
				if (logger.isDebugEnabled()) {
					logger.debug("updateWallAmRaw SVC didt :: {} ", iMnpAmTs);
				}
				
				MnyPinFncTrnUpdateMnpAmTs_DODT oMnpAmTs = mNPMnyPinFncTrn_COM.updateMnpAmTs(iMnpAmTs);
				
				if (logger.isDebugEnabled()) {
					logger.debug("updateWallAmRaw SVC dodt :: {} ", oMnpAmTs);
				}
				
				output.setOwacFnm(oMnpTsAvl.getOwacFnm()); 		// 예금주성명
				output.setBftrAfBal(oMnpTsAvl.getBftrAfBal()); 			// 거래전후잔액
				output.setRnpeFnm(oMnpTsAvl.getRnpeFnm()); 		// 수취인성명
				output.setTrnSrno(oMnpTsAvl.getTrnSrno()); 			// 거래일련번호
				output.setFeeAm(oMnpTsAvl.getFeeAm()); 				// 수수료금액
				output.setRduFeeAm(oMnpTsAvl.getRduFeeAm()); 		// 감면수수료금액
				output.setWmbRduAm(oMnpTsAvl.getWmbRduAm()); 	// 우리멤버스감면금액
				output.setFrduRncd(oMnpTsAvl.getFrduRncd()); 		// 수수료감면사유코드
				output.setErrMsgId("0000");
			} catch (WFApplicationException  e) {
				logger.debug("updateSafAmRaw Exception 오류",e);
				Object[] args = e.getArguments();
				output.setErrMsgId("9999");
				output.setErrMsgTxt(args[0].toString());
			}
			
		} else {
			//  로그인 세션이 존재하지 않습니다.
			throw new WFApplicationException("CMME0018");
		}
		
		if (logger.isDebugEnabled()) {
			logger.debug("updateWallAmRaw SVC output :: {} ", output);
		}
		
		return output;
	}
	
	/**
	 * 머니클립 지갑의 목표 정보를 조회한다.
	 * 
	 * @param input 머니클립 지갑 목표정보조회 입력IO
	 * @return  머니클립 지갑 목표정보조회 출력IO
	 */
	@BxmCategory(logicalName="머니클립지갑목표정보조회", description="머니클립 지갑의 목표 정보를 조회한다.", author="90191355")
	public MNPMnyPinWallMngSelectWallGoalInf_ODT selectWallGoalInf(MNPMnyPinWallMngSelectWallGoalInf_IDT input) {
		/**
		* @BXMType GetBean
		*/
		mNPMnyPinFncTrn_COM = WFApplicationContext.getBean(mNPMnyPinFncTrn_COM, MNPMnyPinFncTrn_COM.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */
		MNPMnyPinWallMngSelectWallGoalInf_ODT output = new MNPMnyPinWallMngSelectWallGoalInf_ODT();

		if (logger.isDebugEnabled()) {
			logger.debug("selectWallGoalInf SVC input :: {} ", input);
		}
		
		MnyPinFncTrnSelectMnpChgItm_DIDT iMnpGoalInf = new MnyPinFncTrnSelectMnpChgItm_DIDT();
		
		// 거래구분코드 : [09] 조회
		iMnpGoalInf.setAtsWdrBkwAcno(input.getDpsInpAcno()); 	// 모계좌번호
		iMnpGoalInf.setCucd(""); 										// 통화코드
		iMnpGoalInf.setRcvAcno(input.getMnyClpChidAcno()); 			// 자계좌번호

		if (logger.isDebugEnabled()) {
			logger.debug("selectWallGoalInf SVC didt :: {} ", iMnpGoalInf);
		}
		
		MnyPinFncTrnSelectMnpChgItm_DODT oMnpGoalInf= mNPMnyPinFncTrn_COM.selectMnpChgItm(iMnpGoalInf);
		
		if (logger.isDebugEnabled()) {
			logger.debug("selectWallGoalInf SVC dodt :: {} ", oMnpGoalInf);
		}
		
		output.setAtsMngNo(oMnpGoalInf.getAtsMngNo()); 					// 자동이체관리번호
		output.setAtsWdrBkwAcno(oMnpGoalInf.getAtsWdrBkwAcno()); 	// 자동이체출금전행계좌번호
		output.setCucd(oMnpGoalInf.getCucd()); 									// 통화코드
		output.setAtsRcvBkcd(oMnpGoalInf.getAtsRcvBkcd()); 				// 자동이체입금은행코드
		output.setRcvAcno(oMnpGoalInf.getRcvAcno()); 						// 입금계좌번호
		output.setAtsBasDd(oMnpGoalInf.getAtsBasDd()); 						// 자동이체기준일
		output.setAtsCycd(oMnpGoalInf.getAtsCycd()); 						// 자동이체주기코드
		output.setAtsAm(oMnpGoalInf.getAtsAm()); 								// 자동이체금액
		output.setAtsStaDt(oMnpGoalInf.getAtsStaDt()); 						// 자동이체시작일자
		output.setAtsEndDt(oMnpGoalInf.getAtsEndDt()); 						// 자동이체종료일자
		output.setAtsRqAdvpeEno(oMnpGoalInf.getAtsRqAdvpeEno()); 		// 자동이체신청권유자직원번호
		output.setRnpeNm(oMnpGoalInf.getRnpeNm()); 							// 수취인명
		output.setRqspeNm(oMnpGoalInf.getRqspeNm()); 						// 의뢰인명
		output.setAtsTitl(oMnpGoalInf.getAtsTitl()); 								// 자동이체제목
		output.setAtsItcd(oMnpGoalInf.getAtsItcd()); 							// 자동이체항목코드
		output.setAtsItmTxt(oMnpGoalInf.getAtsItmTxt()); 					// 자동이체항목내용
		output.setAtsHldyPrcBscd(oMnpGoalInf.getAtsHldyPrcBscd()); 		// 자동이체휴일처리기준코드
		
		/**
		 * 항목변경코드 [079032] 머니클립 모으기 등록 정보
		 * 517 이체주기 		- 예시 : 매월, 매주, 매일
		 * 197 이체실행일 	- 예시 : 10일, 월요일, 매일
		 * 805 이체금액 		- 예시 : 1,000
		 * 627 목표금액 		- 예시 : 1,000,000
		 * 995 모으기제목 	- 예시 : 여행자금(지갑,지갑명)
		 * 
		 * 항목변경코드 [079033] 머니클립 별명 등록 정보
		 * 995 별명 			- 예시 : 여행자금
		 * 
		 * 항목변경코드 [079034] 머니클립 아이콘 등록 정보
		 * 995 아이콘 
		 */
		output.setMnpChgItmDto(oMnpGoalInf.getMnpChgItmDto());
		
		if (logger.isDebugEnabled()) {
			logger.debug("selectWallGoalInf SVC output :: {} ", output);
		}
					
		return output;
	}
	
	/**
	 * 머니클립 지갑의 목표를 등록/수정하는 컨트롤러
	 * 
	 * @param input 머니클립 지갑 목표정보수정 입력IO
	 * @return 머니클립 지갑 목표정보수정 출력IO
	 */
	@BxmCategory(logicalName="머니클립지갑목표정보수정", description="머니클립 지갑의 목표를 수정한다.", author="90191355")
	public MNPMnyPinWallMngUpdateWallGoalInf_ODT updateWallGoalInf(MNPMnyPinWallMngUpdateWallGoalInf_IDT input
	) {
		/**
		* @BXMType GetBean
		*/
		mNPMnyPinFncTrn_COM = WFApplicationContext.getBean(mNPMnyPinFncTrn_COM, MNPMnyPinFncTrn_COM.class);
		sHRRnpeFnmInq_COM = WFApplicationContext.getBean(sHRRnpeFnmInq_COM,SHRRnpeFnmInq_COM.class);
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */
		MNPMnyPinWallMngUpdateWallGoalInf_ODT output = new MNPMnyPinWallMngUpdateWallGoalInf_ODT();

		String trnDscd = input.getTrnDscd();
		
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession();
		
		if (logger.isDebugEnabled()) {
			logger.debug("updateWallGoalInf SVC input :: {} ", input);
		}

		MnyPinFncTrnExecuteMnpAtsInf_DIDT iMnpAtsInf = new MnyPinFncTrnExecuteMnpAtsInf_DIDT();
		
		String sRnpeFnm = "";
		
		SHRRnpeNmInqInp_DTO shrRnpeNmDto = new SHRRnpeNmInqInp_DTO();
		
		shrRnpeNmDto.setWdrBkcd("020"); 								// 출금은행코드
		shrRnpeNmDto.setWdrAcno(input.getAtsWdrBkwAcno());	// 출금계좌번호
		shrRnpeNmDto.setTrnAm(input.getAtsAm()); 					// 거래금액
		shrRnpeNmDto.setRcvBkcd("020"); 								// 입금은행코드
		shrRnpeNmDto.setRcvAcno(input.getRcvAcno()); 			// 입금계좌번호
		shrRnpeNmDto.setUserId(currentCust.getUserId()); 		// 사용자ID
		shrRnpeNmDto.setItcsno(currentCust.getItcsno()); 		// 통합고객번호
		shrRnpeNmDto.setFdtsYn("Y"); 									// 자금이체여부
		shrRnpeNmDto.setFrqntRgsSelYn("N"); 							// 자주쓰는계좌등록조회여부
		
		SHRRnpeNmInqOup_DTO shrRnpeNmOutDto = sHRRnpeFnmInq_COM.selectRnpeNm(shrRnpeNmDto);

		if (!ObjectUtils.isEmpty(shrRnpeNmOutDto)) {
			sRnpeFnm = shrRnpeNmOutDto.getRnpeFnm(); // 수취인성명
		}
		
		/** 
		 * 거래구분코드 정보
		 * [01]: 등록
		 * [02]: 변경 = 해지 + 등록
		 * [03]: 해지
		 * 
		 * [079032] 머니클립 모으기 등록 정보
		 * 517 이체주기 		- 예시 : 매월, 매주, 매일
		 * 197 이체실행일 	- 예시 : 10일, 월요일, 매일
		 * 805 이체금액 		- 예시 : 1,000
		 * 627 목표금액 		- 예시 : 1,000,000
		 * 995 모으기제목 	- 예시 : 여행자금(금고,지갑명)
		 * 
		 */
		iMnpAtsInf.setTrnDscd(trnDscd); 										// 거래구분코드
		iMnpAtsInf.setAtsMngNo(input.getAtsMngNo()); 								// 자동이체관리번호
		iMnpAtsInf.setAtsWdrBkwAcno(input.getAtsWdrBkwAcno()); 				// 자동이체출금전행계좌번호
		iMnpAtsInf.setAtsRcvBkcd("020");						 							// 자동이체입금은행코드
		iMnpAtsInf.setRcvAcno(input.getRcvAcno()); 									// 입금계좌번호
		iMnpAtsInf.setAtsRqAdvpeEno(""); 													// 자동이체신청권유자직원번호
		
		if (!"03".equals(trnDscd)) {
			String cycd = input.getAtsCycd();		
			Calendar c = Calendar.getInstance(); //오늘
			String dd = input.getAtsBasDd(); //요일 or 일자
			
			String startDate = "";
			String basDd = "";
			
			if ("01".equals(cycd)) {
				//매월, (오늘 이전 이후 날짜 비교)시작일자 구하기
				Integer atsDD = Integer.valueOf(dd);
				int toDd = c.get(Calendar.DATE);
				if (toDd >= atsDD) {
					int toMonth = c.get(Calendar.MONTH); //0~11
					//자동이체 신청일이 오늘과 같거나 작으면 다음달로
					c.set(Calendar.MONTH, toMonth + 1);
				}
				
				//말일 선택시
				if (31 == atsDD) {
					//기준일 말일(31)
					basDd = "31";
					//말일 선택시 시작일값 실제 말일 값으로 변경
					atsDD = c.getActualMaximum(Calendar.DAY_OF_MONTH);
				}
				c.set(Calendar.DATE, atsDD);
			} else if ("22".equals(cycd)) {
				//매주, 요일의 다음 시작일자 구하기
				Integer atsDD = Integer.valueOf(dd);
				//요일 계산하여 더함
				int day = c.get(Calendar.DAY_OF_WEEK); //일: 1 ~ 토: 7
				//요일일때 화면에서 dd 값 월~일 1~7로 들어옴
				//calendar와 요일 값 싱크 맞추기
				int dow =  day - atsDD < 0 ? 
						atsDD - 6 // 일요일이면 화면값 7 캘린더 1 
						: atsDD + 1; //나머지요일 화면값 + 1
				
				int plusDay = 0;
				
				int diffDay = dow - day;
				if (diffDay <= 0) {
					plusDay = 7 - day + dow;
				} else {
					plusDay = diffDay;
				}
				
				c.add(Calendar.DATE, plusDay);
			} else {
				//매일 시작일자(내일)
				c.add(Calendar.DATE, 1);
			}

			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd", Locale.KOREA);
			startDate = sdf.format(c.getTime());
			basDd = "".equals(basDd) ? startDate.substring(6, 8) : basDd; // 자동이체기준일

			iMnpAtsInf.setAtsCycd(input.getAtsCycd()); 								// 자동이체주기코드
			iMnpAtsInf.setAtsEndDt("99991231"); 								// 자동이체종료일자
			iMnpAtsInf.setRnpeNm(sRnpeFnm); 												// 수취인명
			iMnpAtsInf.setRqspeNm(sRnpeFnm); 											// 의뢰인명
			iMnpAtsInf.setAtsAm(input.getAtsAm());
			iMnpAtsInf.setAtsStaDt(startDate); 								// 자동이체시작일자
			iMnpAtsInf.setAtsBasDd(basDd);
			// 머니클립자동이체정보.컴포넌트.공통.입력.IO
			List<IBSMR0006066_GRID_IDT> iIBSMR0006066DataList = new ArrayList<>();
			
			MNPMnyPinFncTrnSelectMnpChgItm_DTO inputData = input.getMnpChgItmDto();
			IBSMR0006066_GRID_IDT iIBSMR0006066Data = new IBSMR0006066_GRID_IDT();
			
			if (!StringUtils.isEmpty(inputData.getTsExeDd())) {
				 iIBSMR0006066Data = new IBSMR0006066_GRID_IDT();
				iIBSMR0006066Data.setDpsRgsChgDtcd("197"); // 197 : 이체실행일 
				iIBSMR0006066Data.setDpsRgsChgDtcdTxt(basDd);
				iIBSMR0006066DataList.add(iIBSMR0006066Data);
			}
			
			if (!StringUtils.isEmpty(inputData.getTsCyc())) {
				iIBSMR0006066Data = new IBSMR0006066_GRID_IDT();
				iIBSMR0006066Data.setDpsRgsChgDtcd("517"); // 517 : 이체주기
				iIBSMR0006066Data.setDpsRgsChgDtcdTxt(inputData.getTsCyc());
				iIBSMR0006066DataList.add(iIBSMR0006066Data);
			}
			if (!StringUtils.isEmpty(inputData.getGoalAm())) {
				iIBSMR0006066Data = new IBSMR0006066_GRID_IDT();
				iIBSMR0006066Data.setDpsRgsChgDtcd("627"); // 627 : 목표금액
				iIBSMR0006066Data.setDpsRgsChgDtcdTxt(inputData.getGoalAm());
				iIBSMR0006066DataList.add(iIBSMR0006066Data);
			}
			if (!StringUtils.isEmpty(inputData.getTsAm())) {
				iIBSMR0006066Data = new IBSMR0006066_GRID_IDT();
				iIBSMR0006066Data.setDpsRgsChgDtcd("805"); // 805 : 이체금액 
				iIBSMR0006066Data.setDpsRgsChgDtcdTxt(inputData.getTsAm());
				iIBSMR0006066DataList.add(iIBSMR0006066Data);
			}
			if (!StringUtils.isEmpty(inputData.getGoalNm())) {
				iIBSMR0006066Data = new IBSMR0006066_GRID_IDT();
				iIBSMR0006066Data.setDpsRgsChgDtcd("995"); // 995 : 추천 이름
				iIBSMR0006066Data.setDpsRgsChgDtcdTxt(inputData.getGoalNm());
				iIBSMR0006066DataList.add(iIBSMR0006066Data);
			}

			iMnpAtsInf.setGrid(iIBSMR0006066DataList);
			iMnpAtsInf.setCnt(iIBSMR0006066DataList.size()); // 건수
		}
		
		if (logger.isDebugEnabled()) {
			logger.debug("updateWallGoalInf SVC iMnpAtsInf :: {} ", iMnpAtsInf);
		}
		
		MnyPinFncTrnExecuteMnpAtsInf_DODT oMnpAtsInf= mNPMnyPinFncTrn_COM.executeMnpAtsInf(iMnpAtsInf);
		
		if (logger.isDebugEnabled()) {
			logger.debug("updateWallGoalInf  SVC oMnpAtsInf :: {} ", oMnpAtsInf);
		}
		
		output.setTrnRstCd(oMnpAtsInf.getTrnRstCd()); 	// 거래결과코드
		output.setTrnRstTxt(oMnpAtsInf.getTrnRstTxt()); 	// 거래결과내용
		
		if (logger.isDebugEnabled()) {
			logger.debug("updateWallGoalInf SVC output :: {} ", output);
		}
					
		return output;
	}
	
	/**
	 * 머니클립 지갑의 목표 상세내역을 조회하는 컨트롤러
	 * 	지갑의 월 말 잔액 조회
	 * @param input 머니클립 지갑 목표상세내역조회 입력IO
	 * @return 머니클립 지갑 목표상세내역조회 출력IO
	 */
	@BxmCategory(logicalName="머니클립지갑목표상세내역조회", description="머니클립 지갑의 목표 상세내역을 조회한다.", author="90191355")
	public MNPMnyPinWallMngSelectWallGoalDtlPrts_ODT selectWallGoalDtlPrts(MNPMnyPinWallMngSelectWallGoalDtlPrts_IDT input
	) {
		/**
		* @BXMType GetBean
		*/
		mNPMnyPinFncTrn_COM = WFApplicationContext.getBean(mNPMnyPinFncTrn_COM, MNPMnyPinFncTrn_COM.class);
					
		/**
		 * @BXMType VariableDeclaration
		 */
		MNPMnyPinWallMngSelectWallGoalDtlPrts_ODT output = new MNPMnyPinWallMngSelectWallGoalDtlPrts_ODT();
		
		MnyPinFncTrnSelectMnyBal_DIDT didt = new MnyPinFncTrnSelectMnyBal_DIDT();
		didt.setInqAcno(input.getInqAcno()); // 조회계좌번호
		didt.setInqStaYm(input.getInqStaYm()); // 조회시작년월
		didt.setInqEndYm(WFDateUtils.getDateNow().substring(0, 6)); // 조회종료년월
		
		MnyPinFncTrnSelectMnyBal_DODT dodt = mNPMnyPinFncTrn_COM.selectMnpBal(didt);
		
		Integer cnt = dodt.getCnt();
		output.setCnt(cnt); // 건수
		output.setAcno(dodt.getAcno()); // 계좌번호
		
		if (cnt > 0) {
			List<MNPMnyPinWallMngSelectWallGoalDtlPrtsList_ODT> grid = new ArrayList<MNPMnyPinWallMngSelectWallGoalDtlPrtsList_ODT>();
			
			for (MnyPinFncTrnSelectMnyBalList_DODT dodtItem : dodt.getGrid()) {
				MNPMnyPinWallMngSelectWallGoalDtlPrtsList_ODT gridItem = new MNPMnyPinWallMngSelectWallGoalDtlPrtsList_ODT();
				gridItem.setDt(dodtItem.getDt()); // 일자
				gridItem.setBal(dodtItem.getBal()); // 잔액
			
				grid.add(gridItem);
			}
			
			output.setGrid(grid); // 그리드
		}
		
		return output;
	}
	
	/**
	 * 머니클립 지갑의 거래내역을 조회하는 컨트롤러
	 * 
	 * @param input 머니클립 지갑 거래내역조회 입력IO
	 * @return 머니클립 지갑 거래내역조회 출력IO
	 */
	@BxmCategory(logicalName="머니클립지갑거래내역조회", description="머니클립 지갑의 거래내역을 조회한다.", author="90191355")
	public MNPMnyPinWallMngSelectWallTrnPrts_ODT selectWallTrnPrts(MNPMnyPinWallMngSelectWallTrnPrts_IDT input
	) {
		/**
		* @BXMType GetBean
		*/
		mNPMnyPinFncTrn_COM = WFApplicationContext.getBean(mNPMnyPinFncTrn_COM, MNPMnyPinFncTrn_COM.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */
		MNPMnyPinWallMngSelectWallTrnPrts_ODT output = new MNPMnyPinWallMngSelectWallTrnPrts_ODT();

		if (logger.isDebugEnabled()) {
			logger.debug("selectWallTrnPrts SVC input :: {} ", input);
		}
		
		MnyPinFncTrnSelectTrnPrts_DIDT iTrnPrts = new MnyPinFncTrnSelectTrnPrts_DIDT();
		iTrnPrts.setSortDis(input.getSortDis()); 			// 정렬구분
		iTrnPrts.setInqTgtDis(input.getInqTgtDis()); 		// 조회대상구분
		iTrnPrts.setAcno(input.getAcno()); 					// 계좌번호
		iTrnPrts.setInqStaDt(input.getInqStaDt()); 		// 조회시작일자
		iTrnPrts.setInqEndDt(input.getInqEndDt()); 		// 조회종료일자
		iTrnPrts.setMinAm(input.getMinAm());
		iTrnPrts.setMaxAm(input.getMaxAm());
		
		if (logger.isDebugEnabled()) {
			logger.debug("selectWallTrnPrts SVC didt :: {} ", iTrnPrts);
		}
		try {
			MnyPinFncTrnSelectTrnPrts_DODT oTrnPrts= mNPMnyPinFncTrn_COM.selectTrnPrts(iTrnPrts);
			
			if (logger.isDebugEnabled()) {
				logger.debug("selectWallTrnPrts SVC dodt :: {} ", oTrnPrts);
			}
			
			output.setFstNewRcknDt(oTrnPrts.getFstNewRcknDt()); 				// 최초신규기산일자
			output.setNsnctPrchPvdt(oTrnPrts.getNsnctPrchPvdt()); 			// 미결재가계수표전일
			output.setNsnctCackPvdt(oTrnPrts.getNsnctCackPvdt()); 			// 미결재당좌수표전일
			output.setPayAvlAm(oTrnPrts.getPayAvlAm()); 							// 지급가능금액
			output.setNsnctBchkPvdt(oTrnPrts.getNsnctBchkPvdt()); 			// 미결재자기앞수표전일
			output.setCnrnRgsYn(oTrnPrts.getCnrnRgsYn()); 						// 출연등록여부
			output.setOwacFnm(oTrnPrts.getOwacFnm()); 							// 예금주성명
			output.setPdcd(oTrnPrts.getPdcd()); 										// 상품코드
			output.setNsnctEtcObcPvdt(oTrnPrts.getNsnctEtcObcPvdt()); 		// 미결재기타타점권전일
			output.setCusUsgAcno(oTrnPrts.getCusUsgAcno()); 					// 고객사용계좌번호
			output.setSynpbPdcd(oTrnPrts.getSynpbPdcd()); 						// 종합통장상품코드
			output.setNewRcknDt(oTrnPrts.getNewRcknDt()); 						// 신규기산일자
			output.setCnsgComNm(oTrnPrts.getCnsgComNm()); 					// 위탁회사명
			output.setCtBal(oTrnPrts.getCtBal()); 										// 현재잔액
			output.setAcno(oTrnPrts.getAcno()); 										// 계좌번호
			output.setAdntYn(oTrnPrts.getAdntYn()); 								// 사고여부
			output.setNsnctBokBchkPvdt(oTrnPrts.getNsnctBokBchkPvdt()); 	// 미결재한국은행자기앞수표전일
			output.setLstTrnDt(oTrnPrts.getLstTrnDt()); 								// 최종거래일자
			output.setNsnctPmbilPvdt(oTrnPrts.getNsnctPmbilPvdt()); 			// 미결재약속어음전일
			output.setInqAcno(oTrnPrts.getInqAcno()); 								// 조회계좌번호
			output.setPsklEpdt(oTrnPrts.getPsklEpdt()); 								// 통장대출만기일
			output.setActMngBrcd(oTrnPrts.getActMngBrcd()); 					// 계좌관리점코드
			output.setPbokLnlmAm(oTrnPrts.getPbokLnlmAm()); 					// 통장대출한도금액
			output.setNxtPidDt(oTrnPrts.getNxtPidDt()); 								// 다음납입일자
			output.setNstlObcAm(oTrnPrts.getNstlObcAm()); 						// 미결제타점권금액
			output.setTotBal(oTrnPrts.getTotBal()); 									// 총잔액
			output.setPaySumAm(oTrnPrts.getPaySumAm()); 						// 지급합계금액
			output.setRcvSumAm(oTrnPrts.getRcvSumAm()); 						// 입금합계금액
			output.setTotSumAm(oTrnPrts.getTotSumAm()); 						// 총합계금액
			output.setPdcdNm(oTrnPrts.getPdcdNm()); 								// 상품코드명
			output.setPageUsgYn(oTrnPrts.getPageUsgYn()); 						// 페이지사용여부
			output.setNxtPageYn(oTrnPrts.getNxtPageYn()); 						// 다음페이지여부
			output.setTotCnt(oTrnPrts.getTotCnt()); 									// 총건수
			output.setTotPage(oTrnPrts.getTotPage()); 								// 총페이지
			output.setPageNo(oTrnPrts.getPageNo()); 								// 페이지번호
			output.setInqStaNo(oTrnPrts.getInqStaNo()); 							// 조회시작번호
			output.setInqCnt(oTrnPrts.getInqCnt()); 									// 조회건수
			output.setSrchKrd(oTrnPrts.getSrchKrd()); 								// 검색키워드
			output.setMinAm(oTrnPrts.getMinAm()); 									// 최소금액
			output.setMaxAm(oTrnPrts.getMaxAm()); 									// 최대금액
			output.setGrid(oTrnPrts.getGrid()); 											// 머니클립거래내역조회.공통.출력.IO
			
			if (logger.isDebugEnabled()) {
				logger.debug("selectWallTrnPrts SVC output :: {} ", output);
			}
		} catch (WFApplicationException e) {
			logger.error("===== WFApplicationException error :: {}", e);
		}
		

		return output;
	}
	
	/**
	 * 머니클립 지갑의 받을 이자 정보를 조회하는 서비스
	 * 
	 * @param input 머니클립 지갑 이자계산정보조회 입력IO
	 * @return 머니클립 지갑 이자계산정보조회 출력IO
	 */
	@BxmCategory(logicalName = "머니클립지갑이자정보조회", description = "머니클립 지갑의 받을 이자 정보를 조회한다.", author="90191355")
	public MNPMnyPinWallMngSelectWallIntInf_ODT selectWallIntInf(MNPMnyPinWallMngSelectWallIntInf_IDT input) {
		/**
		 * @BXMType GetBean
		 */
		mNPMnyPinFncTrn_COM = WFApplicationContext.getBean(mNPMnyPinFncTrn_COM, MNPMnyPinFncTrn_COM.class);
		sHRBusinessDayInfo_COM = WFApplicationContext.getBean(sHRBusinessDayInfo_COM, SHRBusinessDayInfo_COM.class);
		
		MNPMnyPinWallMngSelectWallIntInf_ODT output = new MNPMnyPinWallMngSelectWallIntInf_ODT();
		
		if (logger.isDebugEnabled()) {
			logger.debug("selectWallIntCalInf SVC input :: {} ", input);
		}
		
		try {
			MNPMnyPinFncTrnSelectMnpIntCalInf_DIDT didt  = new MNPMnyPinFncTrnSelectMnpIntCalInf_DIDT();
			didt.setDpsInpAcno(input.getDpsInpAcno()); // 수신입력계좌번호
			didt.setInqEndDt(WFDateUtils.getDateDaysBefore(1, WFDateUtils.getDateNow())); // 조회종료일자
			
			
			if (logger.isDebugEnabled()) {
				logger.debug("selectWallIntCalInf SVC didt :: {} ", didt);
			}
			
			MNPMnyPinFncTrnSelectMnpIntCalInf_DODT dodt= mNPMnyPinFncTrn_COM.selectMnpIntCalInf(didt);
			
			if (logger.isDebugEnabled()) {
				logger.debug("selectWallIntCalInf SVC dodt :: {} ", dodt);
			}

			output.setGridCnt(dodt.getGridCnt()); // 그리드건수
			if (dodt.getGridCnt() > 0) {
				BigDecimal intSumAm = BigDecimal.ZERO;
				String intCalEndDate = "";
				List<MNPMnyPinWallMngSelectWallIntInfList_ODT> grid = new ArrayList<MNPMnyPinWallMngSelectWallIntInfList_ODT>();
				List<MNPMnyPinFncTrnSelectMnpIntCalInfList_DODT> dodtGrid = dodt.getGrid();
				
				for (MNPMnyPinFncTrnSelectMnpIntCalInfList_DODT dodtItem: dodtGrid) {
					
					MNPMnyPinWallMngSelectWallIntInfList_ODT gridItem = new MNPMnyPinWallMngSelectWallIntInfList_ODT();
					gridItem.setRcvDt(dodtItem.getRcvDt()); // 입금일자
					gridItem.setIntCalStaDt(dodtItem.getIntCalStaDt()); // 이자계산시작일자
					gridItem.setIntCalEndDt(dodtItem.getIntCalEndDt()); // 이자계산종료일자
					gridItem.setIntAamAm(dodtItem.getIntAamAm()); // 이자적수금액
					gridItem.setAplIrt(dodtItem.getAplIrt()); // 적용이율
					gridItem.setIntAm(dodtItem.getIntAm()); // 이자금액
					gridItem.setIrngYn(dodtItem.getIrngYn()); // 금리네고여부
					gridItem.setRvsnIntYn(dodtItem.getRvsnIntYn()); // 보정이자여부
				
					grid.add(gridItem);
					//오늘 이후 계산되는 이자 목록은 합계금액에서 제거
					if (Integer.parseInt(WFDateUtils.getDateNow()) < Integer.parseInt(dodtItem.getIntCalEndDt())) {
						continue;
					}
					intCalEndDate = dodtItem.getIntCalEndDt();
					intSumAm = intSumAm.add(dodtItem.getIntAm());
				}
				output.setGrid(grid); // 그리드
				output.setAplIrt(dodtGrid.get(0).getAplIrt()); //수신적용이율
				
				if (!"".equals(intCalEndDate)) {
					output.setIntCalStaDt(grid.get(0).getIntCalStaDt());
					output.setIntCalEndDt(intCalEndDate);	
				}
				output.setIntSumAm(intSumAm); // 이자합계금액
			}
			
			/******다음 이자일 3번째 주 마지막 영업일 계산******/ 
			Calendar calendar = Calendar.getInstance(Locale.KOREA);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd", Locale.KOREA);
			//calendar.setTime(calendar.getTime());
			
			//오늘이 몇번째 주
			int todayWeek = calendar.get(Calendar.WEEK_OF_MONTH);
			//오늘이 3번째 주보다 크면..
			if (3 < todayWeek) {
				if (logger.isDebugEnabled()) {
					logger.debug("selectWallIntCalInf SVC 다음이자일 계산 다음달 3번째주 토 셋팅 :: ");
				}
				//다음달 3번째주 토요일로 날짜 변경
				calendar.add(Calendar.MONTH, 1);
				//int nextMonthWeek = calendar.get(Calendar.WEEK_OF_MONTH);
				
				//int diffWeek = 3 - nextMonthWeek;
				calendar.set(Calendar.WEEK_OF_MONTH, 3);
				calendar.set(Calendar.DAY_OF_WEEK, 7);
			} else {

				if (logger.isDebugEnabled()) {
					logger.debug("selectWallIntCalInf SVC 다음이자일 계산 이번달 3번째주 토 셋팅 :: ");
				}
				//int diffWeek = 3 - todayWeek;
				calendar.set(Calendar.WEEK_OF_MONTH, 3);
				calendar.set(Calendar.DAY_OF_WEEK, 7);
			}
			
			String week3Saturday = sdf.format(calendar.getTime());
			
			SHRBusinessDayInfo_DTO  dto = new SHRBusinessDayInfo_DTO();
			dto.setTrnDscd("2"); // 거래구분코드 (1:영업일유형산출 2:전후영업일산출 3:영업일유형확인)
			dto.setBasDt(week3Saturday); // 기준일자
			dto.setInpDdCn(-1); // 입력일수
			//dto.setBzDtTp(0); // 영업일자유형
			if (logger.isDebugEnabled()) {
				logger.debug("selectWallIntCalInf SVC sHRBusinessDayInfo_COM dto :: {} ", dto);
			}
			
			SHRBusinessDayInfo_DTO businessDayInfo = sHRBusinessDayInfo_COM.businessDayInfo(dto);
			if (logger.isDebugEnabled()) {
				logger.debug("selectWallIntCalInf SVC sHRBusinessDayInfo_COM output :: {} ", businessDayInfo);
			}
			
			if (!ObjectUtils.isEmpty(businessDayInfo)) {
				output.setNextIntDt(businessDayInfo.getOutBzDt());
			}
			/*********세금정보조회 IBSMR0006171********/
			MNPMnyPinFncTrnSelectMnpTxIntInf_DIDT txDidt = new MNPMnyPinFncTrnSelectMnpTxIntInf_DIDT();
			txDidt.setDpsInpAcno(input.getDpsInpAcno());
			
			MNPMnyPinFncTrnSelectMnpTxIntInf_DODT txDodt = mNPMnyPinFncTrn_COM.selectMnpTxIntnf(txDidt);
			//이자소득세 + 이자주민세 (각각 1의자리 버림)
			BigDecimal minusInt = txDodt.getIntIctx().setScale(-1, BigDecimal.ROUND_DOWN).add(txDodt.getIntIcmRdtx().setScale(-1, BigDecimal.ROUND_DOWN));
			output.setIntIctx(minusInt); 

			if (logger.isDebugEnabled()) {
				logger.debug("selectWallIntCalInf SVC output :: {} ", output);
			}
		} catch(WFApplicationException e){
			logger.error("selectWallIntInf error :: {}", e);
			Object[] args = e.getArguments();
			
			throw new WFApplicationException("FNSE0006", new Object[] {e.getCode()} , new Object[] {args[0].toString()});
		} catch(Exception e){
			logger.error("selectWallIntInf error :: {}", e);
		
			throw new WFApplicationException("FNSE0006", new Object[] {"9999"} , new Object[] {e.getMessage()});
		}	
		
		return output;
	}
	
	/**
	 * 머니클립 지갑 이자 즉시 실행
	 * 
	 * @param input 머니클립 지갑 이자 즉시 실행 입력IO
	 * @return 머니클립 지갑 이자 즉시 실행 출력IO
	 */
	@BxmCategory(logicalName = "머니클립지갑이자즉시실행", description = "머니클립 지갑의 이자를 즉시 실행한다.", author="90191355")
	public MNPMnyPinWallMngInsertWallIntAmTs_ODT insertWallIntAmTs(MNPMnyPinWallMngInsertWallIntAmTs_IDT input) {
		/**
		 * @BXMType GetBean
		 */
		mNPMnyPinFncTrn_COM = WFApplicationContext.getBean(mNPMnyPinFncTrn_COM, MNPMnyPinFncTrn_COM.class);
		
		MNPMnyPinWallMngInsertWallIntAmTs_ODT output = new MNPMnyPinWallMngInsertWallIntAmTs_ODT();
		
		if (logger.isDebugEnabled()) {
			logger.debug("insertWallIntAmTs SVC input :: {} ", input);
		}
		
		MNPMnyPinFncTrnInsertMnpImdtInt_DIDT didt = new MNPMnyPinFncTrnInsertMnpImdtInt_DIDT();
		didt.setDpsAcno(input.getDpsInpAcno());
		
		MNPMnyPinFncTrnInsertMnpImdtInt_DODT dodt = mNPMnyPinFncTrn_COM.insertMnpImdtInt(didt);
	
		output.setActMngBrcd(dodt.getActMngBrcd()); // 계좌관리점코드
		output.setLstTrhsSrno(dodt.getLstTrhsSrno()); // 최종거래명세일련번호
		output.setCsno(dodt.getCsno()); // 고객번호
		output.setCusKorlNm(dodt.getCusKorlNm()); // 고객한글명
		output.setPrcRtcd(dodt.getPrcRtcd()); // 처리결과코드
		output.setPrcRstTxt(dodt.getPrcRstTxt()); // 처리결과내용
		
		if (logger.isDebugEnabled()) {
			logger.debug("insertWallIntAmTs SVC output :: {} ", output);
		}
		
		return output;
	}
	
	/**
	 * 머니클립 지갑의 받은 이자 내역 조회하는 서비스
	 * 
	 * @param input 머니클립 지갑 이자내역조회 입력IO
	 * @return 머니클립 지갑 이자내역조회 출력IO
	 */
	@BxmCategory(logicalName = "머니클립지갑이자내역조회", description = "머니클립 지갑의 받은 이자 내역 조회한다.", author="90191355")
	public MNPMnyPinWallMngSelectWallIntPrts_ODT selectWallIntPrts(MNPMnyPinWallMngSelectWallIntPrts_IDT input) {
		/**
		 * @BXMType GetBean
		 */
		mNPMnyPinFncTrn_COM = WFApplicationContext.getBean(mNPMnyPinFncTrn_COM, MNPMnyPinFncTrn_COM.class);
		
		MNPMnyPinWallMngSelectWallIntPrts_ODT output = new MNPMnyPinWallMngSelectWallIntPrts_ODT();
		
		if (logger.isDebugEnabled()) {
			logger.debug("selectWallIntPrts SVC input :: {} ", input);
		}
		
		MNPMnyPinFncTrnSelectMnpIntPrts_DIDT didt  = new MNPMnyPinFncTrnSelectMnpIntPrts_DIDT();
		didt.setDpsInpAcno(input.getDpsInpAcno()); // 수신입력계좌번호
		
		StringBuffer baseDtSb = new StringBuffer(input.getInqBasY());
		String baseDate = baseDtSb.append("0101").toString();
		didt.setInqBasDt(baseDate.toString()); // 조회기준일자
		
		StringBuffer endDtSb = new StringBuffer(input.getInqBasY());
		String endDate = endDtSb.append("1231").toString();
		didt.setInqEndDt(endDate.toString()); // 조회종료일자
		
		if (logger.isDebugEnabled()) {
			logger.debug("selectWallIntPrts SVC didt :: {} ", didt);
		}
		
		MNPMnyPinFncTrnSelectMnpIntPrts_DODT dodt= mNPMnyPinFncTrn_COM.selectMnpIntPrts(didt);
		
		if (logger.isDebugEnabled()) {
			logger.debug("selectWallIntPrts SVC dodt :: {} ", dodt);
		}

		output.setGridRowCnt(dodt.getGridRowCnt()); // 그리드건수
		if (dodt.getGridRowCnt() > 0) {
			BigDecimal totPayIntAm = BigDecimal.ZERO;
			BigDecimal totMinusIntAm = BigDecimal.ZERO;
			List<MNPMnyPinWallMngSelectWallIntPrtsList_ODT> grid = new ArrayList<MNPMnyPinWallMngSelectWallIntPrtsList_ODT>();
			if (dodt.getGridRowCnt() == 1) {
				MNPMnyPinWallMngSelectWallIntPrtsList_ODT gridItem = new MNPMnyPinWallMngSelectWallIntPrtsList_ODT();
				MNPMnyPinFncTrnSelectMnpIntPrtsList_DODT dodtItem = dodt.getGrid().get(0);
				
				BigDecimal minusInt = dodtItem.getIntIctx().setScale(-1, RoundingMode.DOWN).add(dodtItem.getIntIcmRdtx().setScale(-1, RoundingMode.DOWN));
				gridItem.setTrnYm(dodtItem.getTrnDt().substring(0, 6)); // 거래년월
				gridItem.setTrnIntAm(dodtItem.getTotPayIntAm().subtract(minusInt)); // 거래이자금액
				
				totPayIntAm = dodtItem.getTotPayIntAm();
				totMinusIntAm = minusInt;
				
				grid.add(gridItem);
			} else {
				List<MNPMnyPinFncTrnSelectMnpIntPrtsList_DODT> dodtGrid = dodt.getGrid();	
				
				MNPMnyPinWallMngSelectWallIntPrtsList_ODT gridItem = null;
				
				String tempYm = dodtGrid.get(0).getTrnDt().substring(0, 6);
				BigDecimal monthTotPayIntAm = BigDecimal.ZERO;
				BigDecimal monthMinusIntAm = BigDecimal.ZERO;
				int gridSize = dodtGrid.size();
				for (int i = 0 ; i < gridSize ; i++) {
					MNPMnyPinFncTrnSelectMnpIntPrtsList_DODT dodtItem = dodtGrid.get(i);
					//이자 내역 전체 합
					totPayIntAm = totPayIntAm.add(dodtItem.getTotPayIntAm());
					BigDecimal minusIntAm = dodtItem.getIntIctx().setScale(-1, RoundingMode.DOWN).add(dodtItem.getIntIcmRdtx().setScale(-1, RoundingMode.DOWN));
					totMinusIntAm = totMinusIntAm.add(minusIntAm);
					String trnYm = dodtItem.getTrnDt().substring(0, 6);
					if (!tempYm.equals(trnYm)) {
						gridItem = new MNPMnyPinWallMngSelectWallIntPrtsList_ODT();
						gridItem.setTrnYm(tempYm); // 거래년월
						gridItem.setTrnIntAm(monthTotPayIntAm.subtract(monthMinusIntAm)); // 거래이자금액
						grid.add(gridItem);
						
						tempYm = trnYm;
						monthTotPayIntAm = BigDecimal.ZERO;
						monthMinusIntAm = BigDecimal.ZERO;
					}
					
					//이자내역 월별 합
					monthTotPayIntAm = monthTotPayIntAm.add(dodtItem.getTotPayIntAm());
					monthMinusIntAm = monthMinusIntAm.add(minusIntAm);
					if (i == gridSize - 1) {
						gridItem = new MNPMnyPinWallMngSelectWallIntPrtsList_ODT();
						gridItem.setTrnYm(trnYm); // 거래년월
						gridItem.setTrnIntAm(monthTotPayIntAm.subtract(monthMinusIntAm)); // 거래이자금액
						grid.add(gridItem);
					}
				}
			}
			output.setTrnY(input.getInqBasY());
			output.setGrid(grid); // 그리드
			output.setTotPayIntAm(totPayIntAm.subtract(totMinusIntAm)); //이자 총액
		}
		
		if (logger.isDebugEnabled()) {
			logger.debug("selectWallIntPrts SVC output :: {} ", output);
		}
		
		return output;
	}
	
	/**
	 * 머니클립 지갑의 이자 상세 내역을 조회하는 서비스
	 * 
	 * @param input 머니클립 지갑 이자 상세 내역 조회 입력IO
	 * @return 머니클립 지갑 이자 상세 내역 조회 출력IO
	 */
	@BxmCategory(logicalName = "머니클립지갑이자상세내역조회", description = "머니클립 지갑의 받은 이자 상세 내역을 조회한다.", author="90191355")
	public MNPMnyPinWallMngSelectWallIntDtlPrts_ODT selectWallIntDtlPrts(MNPMnyPinWallMngSelectWallIntDtlPrts_IDT input) {
		/**
		 * @BXMType GetBean
		 */
		mNPMnyPinFncTrn_COM = WFApplicationContext.getBean(mNPMnyPinFncTrn_COM, MNPMnyPinFncTrn_COM.class);
		
		MNPMnyPinWallMngSelectWallIntDtlPrts_ODT output = new MNPMnyPinWallMngSelectWallIntDtlPrts_ODT();
		
		if (logger.isDebugEnabled()) {
			logger.debug("selectWallIntDtlPrts SVC input :: {} ", input);
		}
		
		MNPMnyPinFncTrnSelectMnpIntPrts_DIDT didt  = new MNPMnyPinFncTrnSelectMnpIntPrts_DIDT();
		didt.setDpsInpAcno(input.getDpsInpAcno()); // 수신입력계좌번호
		StringBuffer baseDtSb = new StringBuffer(input.getInqBasYm());
		String baseDate = baseDtSb.append("01").toString();
		didt.setInqBasDt(baseDate.toString()); // 조회기준일자
		
		StringBuffer endDtSb = new StringBuffer(input.getInqBasYm());
		String endDate = endDtSb.append("31").toString();
		didt.setInqEndDt(endDate.toString()); // 조회종료일자
		
		if (logger.isDebugEnabled()) {
			logger.debug("selectWallIntDtlPrts SVC didt :: {} ", didt);
		}
		
		MNPMnyPinFncTrnSelectMnpIntPrts_DODT dodt= mNPMnyPinFncTrn_COM.selectMnpIntPrts(didt);
		
		if (logger.isDebugEnabled()) {
			logger.debug("selectWallIntDtlPrts SVC dodt :: {} ", dodt);
		}

		output.setGridRowCnt(dodt.getGridRowCnt()); // 그리드건수
		if (dodt.getGridRowCnt() > 0) {
			BigDecimal totPayIntAm = BigDecimal.ZERO;
			BigDecimal totIntIctx = BigDecimal.ZERO;
			List<MNPMnyPinWallMngSelectWallIntDtlPrtsList_ODT> grid = new ArrayList<MNPMnyPinWallMngSelectWallIntDtlPrtsList_ODT>();
			List<MNPMnyPinFncTrnSelectMnpIntPrtsList_DODT> dodtGrid = dodt.getGrid();

			for (MNPMnyPinFncTrnSelectMnpIntPrtsList_DODT dodtItem: dodtGrid) {
				totPayIntAm = totPayIntAm.add(dodtItem.getTotPayIntAm());
				//이자 세금 = 이자소득세 (1자리 절삭) + 주민세 (1자리 절삭)
				BigDecimal minusInt = dodtItem.getIntIctx().setScale(-1, BigDecimal.ROUND_DOWN).add(dodtItem.getIntIcmRdtx().setScale(-1, BigDecimal.ROUND_DOWN));
				totIntIctx = totIntIctx.add(minusInt);
				
				MNPMnyPinWallMngSelectWallIntDtlPrtsList_ODT gridItem = new MNPMnyPinWallMngSelectWallIntDtlPrtsList_ODT();
				gridItem.setTrnDt(dodtItem.getTrnDt()); // 거래일자
				gridItem.setTrnSrno(dodtItem.getTrnSrno()); // 거래일련번호
				gridItem.setIntCalStaDt(dodtItem.getIntCalStaDt()); // 이자계산시작일자
				gridItem.setIntCalEndDt(dodtItem.getIntCalEndDt()); // 이자계산종료일자
				gridItem.setTrnBasAm(dodtItem.getTrnBasAm()); // 거래기준금액
				gridItem.setTotPayIntAm(dodtItem.getTotPayIntAm()); // 총지급이자금액
				//gridItem.setIntIctx(dodtItem.getIntIctx()); // 이자소득세
				gridItem.setIntIctx(minusInt); // 이자소득세
				gridItem.setIntIcmRdtx(dodtItem.getIntIcmRdtx()); // 이자소득주민세
				gridItem.setIntIcmSrtx(dodtItem.getIntIcmSrtx()); // 이자소득농특세
				gridItem.setHcanFee(dodtItem.getHcanFee()); // 중도해지수수료
				gridItem.setRrintAm(dodtItem.getRrintAm()); // 환입이자금액
				gridItem.setRstrIctx(dodtItem.getRstrIctx()); // 환출소득세
				gridItem.setRstrRdtx(dodtItem.getRstrRdtx()); // 환출주민세
				gridItem.setRstrSrtx(dodtItem.getRstrSrtx()); // 환출농특세
				gridItem.setPrmeYn(dodtItem.getPrmeYn()); // 우대여부
			
				grid.add(gridItem);
			}
			
			output.setTrnYm(input.getInqBasYm());
			output.setGrid(grid); // 그리드
			output.setTotPayIntAm(totPayIntAm);
			output.setTotIntIctx(totIntIctx);
			output.setIntCalStaDt(grid.get(0).getIntCalStaDt());
			output.setIntCalEndDt(grid.get(grid.size() - 1).getIntCalEndDt());
		}
		
		if (logger.isDebugEnabled()) {
			logger.debug("selectWallIntPrts SVC output :: {} ", output);
		}
		
		return output;
	}
}
