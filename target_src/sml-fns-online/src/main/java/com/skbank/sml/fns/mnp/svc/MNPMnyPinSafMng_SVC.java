package com.skbank.sml.fns.mnp.svc;

import bxm.common.annotaion.BxmCategory;
import bxm.common.util.StringUtils;
import fwk.skbank.online.context.WFApplicationContext;
import fwk.skbank.online.exception.app.WFApplicationException;
import fwk.skbank.online.exception.frm.SFAdaptorApplicationException;
import fwk.skbank.online.exception.frm.SFInterfaceSystemException;
import fwk.skbank.online.util.WFDateUtils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinSafMngInsertSafBscInf_ODT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinSafMngSelectIntSafAnls_IDT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinSafMngSelectIntSafAnls_ODT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinSafMngSelectMnpSafBal_IDT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinSafMngSelectMnpSafBal_ODT;
import com.skbank.sml.bsc.shr.com.SHRAllActInqTbk_COM;
import com.skbank.sml.bsc.shr.com.SHRRnpeFnmInq_COM;
import com.skbank.sml.bsc.shr.cst.cstt.SHRBSCInquiryConstant;
import com.skbank.sml.bsc.shr.dto.SHRRnpeNmInqInp_DTO;
import com.skbank.sml.bsc.shr.dto.SHRRnpeNmInqOup_DTO;
import com.skbank.sml.cmm.shr.com.SHRCMMLoginSession_COM;
import com.skbank.sml.cmm.shr.dto.CMM_CURRENT_CUST;
import com.skbank.sml.fns.mnp.com.MNPMnyPinBscMng_COM;
import com.skbank.sml.fns.mnp.com.MNPMnyPinFncTrn_COM;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinSafMngInsertSafBscInf_IDT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinSafMngSelectSafBscInf_IDT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinSafMngSelectSafBscInf_ODT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinSafMngSelectSafGoalInf_IDT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinSafMngSelectSafGoalInf_ODT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinSafMngSelectTrnPrts_IDT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinSafMngSelectTrnPrts_ODT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinSafMngUpdateSafAmRaw_IDT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinSafMngUpdateSafAmRaw_ODT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinSafMngUpdateSafBscInf_IDT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinSafMngUpdateSafBscInf_ODT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinSafMngUpdateSafGoalInfScss_IDT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinSafMngUpdateSafGoalInfScss_ODT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinSafMngUpdateSafGoalInf_IDT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinSafMngUpdateSafGoalInf_ODT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinSafMngUpdateSafScss_IDT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinSafMngUpdateSafScss_ODT;
import com.skbank.sml.fns.mnp.dto.MNPMnyPinFncTrnSelectMnpChgItm_DTO;
import com.skbank.sml.fns.mnp.dto.MNPMnyPinFncTrnSelectTrnPrts_DTO;
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
import com.skbank.sml.pds.shr.dto.SHRDpstInsvCancExeInp_DTO;
import com.skbank.sml.pds.shr.dto.SHRDpstInsvCancOut_DTO;

/**
 * 1.업무명 : NEWWON 대분류 금융서비스
 * 2.단위업무명 : NEWWON 중분류 머
 * 3.프로그램명 : 머니클립금고관리서비스
 * 4.설명 : 
 * 
 * @Class MNPMnyPinSafMng_SVC.java
 * @author 90190263
 * @since 2024.08.06
 * @version 1.0
 */		
@Service
@BxmCategory(logicalName="머니클립금고관리서비스", description="머니클립의 금고 정보를 관리하는 서비스")
public class MNPMnyPinSafMng_SVC {
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
	 * 예금.적금.해지.공유.컴포넌트
	 */
	private SHRDAIDpstInsvCanc_COM sHRDAIDpstInsvCanc_COM;
	
	/**
	 * SHRRnpeFnmInq_COM 공유 공통 컴포넌트
	 */
	private SHRRnpeFnmInq_COM sHRRnpeFnmInq_COM;
	/**
	 * 머니클립 지갑 노출 순서 추가용 쉐어 컴포넌트
	 */
	private SHRMNPWallBiz_COM sHRMNPWallBiz_COM;
	/**
	 * 전계좌 세션 갱신
	 */
	private SHRAllActInqTbk_COM shrAllActInqTbk_COM;
	
	/**
	 * 머니클립 금고의 기본정보를 조회하는 서비스
	 * 
	 * @param input 머니클립금고기본정보조회 입력IO
	 * @return 머니클립금고기본정보조회 출력IO
	 */
	@BxmCategory(logicalName = "머니클립금고기본정보조회", description = "머니클립 금고의 기본정보를 조회한다.", author="90190263")
	public MNPMnyPinSafMngSelectSafBscInf_ODT selectSafBscInf(MNPMnyPinSafMngSelectSafBscInf_IDT input) {
		/**
		 * @BXMType GetBean
		 */
		mNPMnyPinBscMng_COM = WFApplicationContext.getBean(mNPMnyPinBscMng_COM, MNPMnyPinBscMng_COM.class);
		
		/** 
		 * 로직 추가
		 */
		MNPMnyPinSafMngSelectSafBscInf_ODT output = new MNPMnyPinSafMngSelectSafBscInf_ODT();
		
		if (logger.isDebugEnabled()) {
			logger.debug("90190263 머니클립금고기본정보조회 SVC input :: {} ", input);
		}
		
		MnyPinBscMngSelectMnpChidAcno_DIDT iChidAcnoInf = new MnyPinBscMngSelectMnpChidAcno_DIDT();
		iChidAcnoInf.setInqDscd("01"); 								// 거래구분코드
		iChidAcnoInf.setDpsInpAcno(input.getDpsInpAcno()); // 수신입력계좌번호
		
		if (logger.isDebugEnabled()) {
			logger.debug("90190263 머니클립금고기본정보조회 SVC iChidAcnoInf :: {} ", input);
		}
		
		MnyPinBscMngSelectMnpChidAcno_DODT oChidAcnoInf= mNPMnyPinBscMng_COM.selectMnpChidAcno(iChidAcnoInf);
		
		if (logger.isDebugEnabled()) {
			logger.debug("90190263 머니클립금고기본정보조회 SVC oChidAcnoInf :: {} ", oChidAcnoInf);
		}
		
		// 자계좌구분코드 (1.지갑, 2.금고)
		IBSMR0006155_GRID_ODT filterSafAcnoInf = new IBSMR0006155_GRID_ODT();
				
		filterSafAcnoInf = oChidAcnoInf.getGrid().stream()
																.filter((item) -> "2".equals(item.getMnyClpChidActDscd()))
																.findFirst()
																.orElse(filterSafAcnoInf);

		if (logger.isDebugEnabled()) {
			logger.debug("90190263 머니클립금고기본정보조회 SVC filterSafAcnoInf :: {} ", filterSafAcnoInf);
		}
		
		output.setDpsInpAcno(oChidAcnoInf.getDpsInpAcno()); 								// 수신입력계좌번호
		output.setDppdNm(oChidAcnoInf.getDppdNm()); 										// 수신상품명
		output.setDpacBal(oChidAcnoInf.getDpacBal()); 										// 수신계좌잔액
		
		output.setMnyClpChidAcno(filterSafAcnoInf.getMnyClpChidAcno()); 				// 머니클립자계좌번호
		output.setMnyClpChidActNm(filterSafAcnoInf.getMnyClpChidActNm()); 			// 머니클립자계좌명
		output.setDpacCtBal(filterSafAcnoInf.getDpacCtBal()); 								// 수신계좌현재잔액
		output.setMnyClpChidActDscd(filterSafAcnoInf.getMnyClpChidActDscd());		// 머니클립자계좌구분코드
		output.setBscIntAm(filterSafAcnoInf.getBscIntAm()); 									// 기본이자금액
		output.setActAplIrt(filterSafAcnoInf.getActAplIrt()); 									// 계좌적용이율
		output.setMnyClpChidActCreDt(filterSafAcnoInf.getMnyClpChidActCreDt()); 	// 머니클립자계좌생성일자
		output.setMnyClpIconNo(filterSafAcnoInf.getMnyClpIconNo()); 					// 머니클립아이콘번호
		output.setMnyClpGoalAm(filterSafAcnoInf.getMnyClpGoalAm()); 					// 머니클립목표금액
		output.setPushAgrYn(filterSafAcnoInf.getBkAppPushAgrYn()); 						// PUSH동의여부
		
		if (logger.isDebugEnabled()) {
			logger.debug("90190263 머니클립금고기본정보조회 SVC output :: {} ", output);
		}
		
		return output;
	}
	
	/**
	 * 머니클립 금고의 기본정보를 등록하는 서비스
	 * 
	 * @param input 머니클립금고기본정보조회 입력IO
	 * @return 머니클립금고기본정보조회 출력IO
	 */
	@BxmCategory(logicalName = "머니클립금고기본정보등록", description = "머니클립 금고의 기본정보를 등록 한다.", author="90190263")
	public MNPMnyPinSafMngInsertSafBscInf_ODT insertSafBscInf(MNPMnyPinSafMngInsertSafBscInf_IDT input) {
		/**
		 * @BXMType GetBean
		 */
		sHRMNPWallBiz_COM = WFApplicationContext.getBean(sHRMNPWallBiz_COM, SHRMNPWallBiz_COM.class);
		
		/** 
		 * 로직 추가
		 */
		MNPMnyPinSafMngInsertSafBscInf_ODT output = new MNPMnyPinSafMngInsertSafBscInf_ODT();
		
		/**
		 * @BXMType IF
		 * @Desc 입력 검증 : 필수 입력 값 검증 코드를 작성 하십시오.
		 */
		if ( input.getDpsInpAcno()== null ) /**null check - 수신입력계좌번호*/{
			throw new WFApplicationException("FNSE0005", null, new Object[]{input.getDpsInpAcno()});
		}
		else if ( input.getIconCd()== null ) /**null check - 아이콘코드*/{
			throw new WFApplicationException("FNSE0005", null, new Object[]{input.getIconCd()});
		}
		else if ( input.getSafAlsNm()== null ) /**null check - 금고별칭명*/{
			throw new WFApplicationException("FNSE0005", null, new Object[]{input.getSafAlsNm()});
		}
		
		
		if (logger.isDebugEnabled()) {
			logger.debug("90190263 머니클립금고기본정보등록 SVC input :: {} ", input);
		}
		
		
		try {
			/**
			 * 머니클립 자계좌 등록
			 */
			SHRMNPWallBizInsertBscWallSaf_DIDT shrDidt = new SHRMNPWallBizInsertBscWallSaf_DIDT();
			shrDidt.setDpsInpAcno(input.getDpsInpAcno()); // 수신입력계좌번호
			shrDidt.setAcnoTyp("2"); // 계좌타입
			shrDidt.setIconNo(input.getIconCd()); // 아이콘번호
			shrDidt.setAcnoNm(input.getSafAlsNm()); // 계좌명
			shrDidt.setAtsYn(input.getAtsYn()); // 자동이체여부 
			
			if("Y".equals(input.getAtsYn())) {
				shrDidt.setAtsCycd(input.getAtsCycd()); // 자동이체주기코드:  01:매월, 20매일, 22:매주
				shrDidt.setAtsDd(Integer.parseInt(input.getAtsStaDt().substring(6,8))); // 자동이체일
				shrDidt.setAtsStaDt(input.getAtsStaDt()); // 자동이체시작일자
				shrDidt.setAtsAm(input.getAtsAm()); // 자동이체금액
				shrDidt.setGoalAm(input.getGoalAm()); // 목표금액
				shrDidt.setGoalNm(input.getGoalNm()); // 목표명
				
				if("22".equals(input.getAtsCycd())) {
					shrDidt.setAtsStaWkdDscd(input.getAtsBasDd()); 		// 적금적립이체시작요일구분코드 1 ~ 7(월 ~ 일)
				}
			}
		
			if (logger.isDebugEnabled()) {
				logger.debug("머니클립금고기본정보등록 SVC 자계좌 등록 didt :: {} ", shrDidt);
			}
			
			SHRMNPWallBizInsertBscWallSaf_DODT shrdodt = sHRMNPWallBiz_COM.insertBscWallSaf(shrDidt);
			
			if (logger.isDebugEnabled()) {
				logger.debug(" 머니클립금고기본정보등록 SVC 자계좌 등록 dodt :: {} ", shrdodt);
			}
			
			output.setNewAcno(shrdodt.getNewAcno()); 	// 신규계좌번호
			output.setPrcRtcd(shrdodt.getPrcRtcd()); 		// 처리결과코드
			output.setPrcRstTxt(shrdodt.getPrcRstTxt()); 	// 처리결과내용
			
			if (logger.isDebugEnabled()) {
				logger.debug("머니클립금고기본정보등록 SVC output :: {} ", output);
			}
		} catch (WFApplicationException e) {
			logger.debug("insertWallBscInf WFApplicationException 오류 {} ",e);
			Object[] args = e.getArguments();
			
	        String rtcdTxt = "";
	        if(args != null && args.length>0) {
	        	rtcdTxt = args[0].toString();
			}
	        
			output.setPrcRtcd("9999");
			output.setPrcRstTxt(rtcdTxt);
		} catch (Exception e) {
			logger.debug("insertWallBscInf Exception 오류 {} ",e);
			output.setPrcRtcd("9999");
			output.setPrcRstTxt(e.getMessage());
		} 
		
		if (logger.isDebugEnabled()) {
			logger.debug("90190263 머니클립금고기본정보등록 SVC output :: {} ", output);
		}
		
		return output;
	}

	/**
	 * 머니클립 금고의 기본정보(금고명, 아이콘) 를 수정하는 서비스
	 * 
	 * @param input 머니클립금고기본정보조회 입력IO
	 * @return 머니클립금고기본정보조회 출력IO
	 */
	@BxmCategory(logicalName = "머니클립금고기본정보수정", description = "머니클립 금고의 기본정보를 수정 한다.", author="90190263")
	public MNPMnyPinSafMngUpdateSafBscInf_ODT updateSafBscInf(MNPMnyPinSafMngUpdateSafBscInf_IDT input) {
		/**
		 * @BXMType GetBean
		 */
		mNPMnyPinBscMng_COM = WFApplicationContext.getBean(mNPMnyPinBscMng_COM, MNPMnyPinBscMng_COM.class);
		
		/** 
		 * 로직 추가
		 */
		MNPMnyPinSafMngUpdateSafBscInf_ODT output = new MNPMnyPinSafMngUpdateSafBscInf_ODT();
		
		
		if (logger.isDebugEnabled()) {
			logger.debug("90190263 머니클립금고기본정보 수정 SVC input :: {} ", input);
		}
		
		MnyPinBscMngUpdateMnpChidAcno_DIDT iMnpSafInf= new MnyPinBscMngUpdateMnpChidAcno_DIDT();
		
		/**
		 * @BXMType IF
		 * @Desc 입력 검증 : 필수 입력 값 검증 코드를 작성 하십시오.
		 */
		if ( input.getDpsInpAcno()== null ) /**null check - 수신입력계좌번호*/{
			throw new WFApplicationException("FNSE0005", null, new Object[]{input.getDpsInpAcno()});
		}
		
		/** 
		 * 항목변경코드 
		 * [079033] (머니클립 별명 등록 정보)
		 * 995 별명 		- 예시 : 여행자금 
		 * [079034] (머니클립 아이콘 등록 정보)
		 * 995 아이콘 
		 */
		MnyPinBscMngUpdateMnpChidAcno_DODT oMnpSafNameInf = new MnyPinBscMngUpdateMnpChidAcno_DODT();
		MnyPinBscMngUpdateMnpChidAcno_DODT oMnpSafIconInf = new MnyPinBscMngUpdateMnpChidAcno_DODT(); 
		
		oMnpSafNameInf.setTrnRstCd("0000");
		oMnpSafIconInf.setTrnRstCd("0000");
		
		iMnpSafInf.setDpsInpAcno(input.getDpsInpAcno()); // 수신입력계좌번호

		if( !StringUtils.isEmpty( input.getAlsNm() )) {
			String chgItcd = "079033";
			iMnpSafInf.setDpsRgsChgItcd(chgItcd); // 수신등록변경항목코드
			
			List<IBSMR0004224_GRID_IDT> iIBSMR0004224Grid = new ArrayList<>();
			
			IBSMR0004224_GRID_IDT iIBSMR0004224Data = new IBSMR0004224_GRID_IDT();
		
			iIBSMR0004224Data = new IBSMR0004224_GRID_IDT();
			iIBSMR0004224Data.setDpsRgsChgItcd(chgItcd);	// 머니클립 별명 등록 정보
			iIBSMR0004224Data.setDpsRgsChgDtcd("995");
			iIBSMR0004224Data.setDpsRgsChgDtcdTxt(input.getAlsNm());
			iIBSMR0004224Grid.add(iIBSMR0004224Data);
			
			iMnpSafInf.setGridRowCnt(1); // 그리드열건수
			iMnpSafInf.setGrid(iIBSMR0004224Grid);

			if (logger.isDebugEnabled()) {
				logger.debug("90190263 머니클립금고기본정보 수정 SVC 금고명 변경 iMnpSafInf :: {} ", iMnpSafInf);
			}
			
			oMnpSafNameInf = mNPMnyPinBscMng_COM.updateMnpChidAcno(iMnpSafInf);

			if (logger.isDebugEnabled()) {
				logger.debug("90190263 머니클립금고기본정보 수정 SVC 금고명 변경 oMnpSafNameInf :: {} ", oMnpSafNameInf);
			}
			
			if( !"0000".equals(oMnpSafNameInf.getTrnRstCd())) {
				output.setTrnRstCd("9999"); 										// 거래결과코드
				output.setTrnRstTxt("금고명 수정에 실패했습니다."); 				// 거래결과내용
			}
		}
		
		if( !StringUtils.isEmpty( input.getIconDscd() )) {
			String chgItcd = "079034";
			iMnpSafInf.setDpsRgsChgItcd(chgItcd); // 수신등록변경항목코드
			
			List<IBSMR0004224_GRID_IDT> iIBSMR0004224Grid = new ArrayList<>();

			IBSMR0004224_GRID_IDT iIBSMR0004224Data = new IBSMR0004224_GRID_IDT();
			
			iIBSMR0004224Data = new IBSMR0004224_GRID_IDT();
			iIBSMR0004224Data.setDpsRgsChgItcd(chgItcd);	// 머니클립 아이콘 등록 정보
			iIBSMR0004224Data.setDpsRgsChgDtcd("995");
			iIBSMR0004224Data.setDpsRgsChgDtcdTxt(input.getIconDscd());
			
			iIBSMR0004224Grid.add(iIBSMR0004224Data);

			iMnpSafInf.setGridRowCnt(1); // 그리드열건수
			iMnpSafInf.setGrid(iIBSMR0004224Grid);

			if (logger.isDebugEnabled()) {
				logger.debug("90190263 머니클립금고기본정보 수정 SVC 아이콘 변경 iMnpSafInf :: {} ", iMnpSafInf);
			}
			
			oMnpSafIconInf = mNPMnyPinBscMng_COM.updateMnpChidAcno(iMnpSafInf);

			if (logger.isDebugEnabled()) {
				logger.debug("90190263 머니클립금고기본정보 수정 SVC 아이콘 변경 oMnpSafIconInf :: {} ", oMnpSafIconInf);
			}
			
			if( !"0000".equals(oMnpSafIconInf.getTrnRstCd())) {
				output.setTrnRstCd("9999"); 										// 거래결과코드
				output.setTrnRstTxt("아이콘 수정에 실패했습니다."); 				// 거래결과내용
			}
		}
		
		if("0000".equals(oMnpSafNameInf.getTrnRstCd()) 
			&& "0000".equals(oMnpSafIconInf.getTrnRstCd()) ) {
			output.setTrnRstCd("0000"); 						// 거래결과코드
			output.setTrnRstTxt("정상처리되었습니다."); 		// 거래결과내용
		}
		
		if (logger.isDebugEnabled()) {
			logger.debug("90190263 머니클립금고기본정보 수정 SVC output :: {} ", output);
		}
		
		return output;
	}
	
	/**
	 * 머니클립 금고를 해지 수정하는 서비스
	 * 
	 * @param input 머니클립금고기본정보조회 입력IO
	 * @return 머니클립금고기본정보조회 출력IO
	 */
	@BxmCategory(logicalName = "머니클립금고해지수정", description = "머니클립 금고를 해지 수정하는 서비스", author="90190263")
	public MNPMnyPinSafMngUpdateSafScss_ODT updateSafScss(MNPMnyPinSafMngUpdateSafScss_IDT input) {
		/**
		 * @BXMType GetBean
		 */
		mNPMnyPinFncTrn_COM = WFApplicationContext.getBean(mNPMnyPinFncTrn_COM, MNPMnyPinFncTrn_COM.class);
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		sHRDAIDpstInsvCanc_COM= WFApplicationContext.getBean(sHRDAIDpstInsvCanc_COM, SHRDAIDpstInsvCanc_COM.class); 
		sHRRnpeFnmInq_COM = WFApplicationContext.getBean(sHRRnpeFnmInq_COM,SHRRnpeFnmInq_COM.class);
		shrAllActInqTbk_COM = WFApplicationContext.getBean(shrAllActInqTbk_COM, SHRAllActInqTbk_COM.class);
		
		/** 
		 * 로직 추가
		 */
		MNPMnyPinSafMngUpdateSafScss_ODT output = new MNPMnyPinSafMngUpdateSafScss_ODT();
		
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession();
		
		if (logger.isDebugEnabled()) {
			logger.debug("90190263 머니클립금고해지수정 SVC input :: {} ", input);
		}
		
		String errMsgId = "";
		String errMsgTxt= "";
		
		if (shrCMMLoginSession_COM.istLogin()) {
			try {
				String sRnpeFnm = "";
				
				SHRRnpeNmInqInp_DTO shrRnpeNmDto = new SHRRnpeNmInqInp_DTO();
				
				shrRnpeNmDto.setWdrBkcd("020"); 							// 출금은행코드
				shrRnpeNmDto.setWdrAcno(input.getCancAcno()); 	// 출금계좌번호 : 자계좌번호
				shrRnpeNmDto.setTrnAm(input.getDpacBal()); 			// 거래금액
				shrRnpeNmDto.setRcvBkcd("020"); 							// 입금은행코드 : 모계좌은행코드
				shrRnpeNmDto.setRcvAcno(input.getRcvAcno()); 		// 입금계좌번호 : 모계좌번호
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
				
				SHRDpstInsvCancExeInp_DTO iCancExeInp = new SHRDpstInsvCancExeInp_DTO();
				iCancExeInp.setCancAcno(input.getCancAcno()); 				// 해지계좌번호 : 자계좌번호
				iCancExeInp.setDpacBal(input.getDpacBal().toString()); 		// 수신계좌잔액
				iCancExeInp.setRcvBkcd("020"); 										// 입금은행코드 : 모계좌은행코드
				iCancExeInp.setRcvAcno(input.getRcvAcno()); 					// 입금계좌번호 : 모계좌번호
				iCancExeInp.setRnpeFnm(sRnpeFnm); 								// 수취인성명
				iCancExeInp.setActPwnoUsgYn("M"); 								// 계좌비밀번호사용여부
				iCancExeInp.setEncyActPwno(input.getEncyActPwno()); 	// 암호화계좌비밀번호
				
				if (logger.isDebugEnabled()) {
					logger.debug("90190263 머니클립금고해지수정 SVC callDpidcancexe iCancExeInp :: {} ", iCancExeInp);
				}
				
				SHRDpstInsvCancOut_DTO oCancExeInp= sHRDAIDpstInsvCanc_COM.callDpidcanc(iCancExeInp);
				
				if (logger.isDebugEnabled()) {
					logger.debug("90190263 머니클립금고해지수정 SVC callDpidcancexe oCancExeInp :: {} ", oCancExeInp);
				}
				
				if( "Y".equals( oCancExeInp.getScsYn() ) ) {
					//전계좌세션 갱신 요청 24.11.19 
					shrAllActInqTbk_COM.selectSessActList(SHRBSCInquiryConstant.BSC_ACT_LIST_INQ_DIS_ALL, true);
					
					output.setErrMsgId("0000");
					output.setErrMsgTxt("정상처리되었습니다.");
				} else {
					output.setErrMsgId("9999");
					output.setErrMsgTxt("금고해지에 실패했습니다.");
				}
			} catch (Exception e) {
				logger.error("머니클립금고해지수정 Exception!! {} ", e);
				
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
					
					output.setErrMsgId("9999");
					output.setErrMsgTxt(e.getMessage());				
				}
				output.setErrMsgId(errMsgId);
				output.setErrMsgTxt(errMsgTxt);
			}
		} else {
			//  로그인 세션이 존재하지 않습니다.
			throw new WFApplicationException("CMME0018");
		}

		if (logger.isDebugEnabled()) {
			logger.debug("90190263 머니클립금고해지수정 SVC output :: {} ", output);
		}
		
		return output;
	}
	
	/**
	 * 금고 금액 입출금 수정
	 * 
	 * 머니클립 금고의 금액을 꺼내기/채우기 금액을 수정한다
	 * 
	 * @param input MnyPinSafMng 입력
	 * @return MnyPinSafMng 출력
	 */
	@BxmCategory(logicalName="머니클립금고금액입출금수정", description="머니클립 금고의 금액을 꺼내기/채우기 금액을 수정한다.", author="90190263")
	public MNPMnyPinSafMngUpdateSafAmRaw_ODT updateSafAmRaw(MNPMnyPinSafMngUpdateSafAmRaw_IDT input
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
		MNPMnyPinSafMngUpdateSafAmRaw_ODT output = new MNPMnyPinSafMngUpdateSafAmRaw_ODT();

		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession();
		
		/**
		 * @BXMType IF
		 * @Desc 입력 검증 : 필수 입력 값 검증 코드를 작성 하십시오.
		 */
		if ( input.getWdrAcno()== null ) /**null check - 출금계좌번호*/{
			throw new WFApplicationException("FNSE0005", null, new Object[]{input.getWdrAcno()});
		}
		else if ( input.getTrnAm()== null ) /**null check - 거래금액*/{
			throw new WFApplicationException("FNSE0005", null, new Object[]{input.getTrnAm()});
		}
		else if ( input.getRcvAcno()== null ) /**null check - 입금계좌번호*/{
			throw new WFApplicationException("FNSE0005", null, new Object[]{ input.getRcvAcno()});
		}
		
		if (logger.isDebugEnabled()) {
			logger.debug("90190263 머니클립금고금액입출금 수정 SVC input :: {} ", input);
		}
		
		MnyPinFncTrnSelectMnpTsAvl_DIDT iMnpTsAvl= new MnyPinFncTrnSelectMnpTsAvl_DIDT();
		
		if (logger.isDebugEnabled()) {
			logger.debug("90190263 머니클립금고금액입출금 이체가능조회 SVC input :: {} ", iMnpTsAvl);
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
				iMnpTsAvl.setActPwno(input.getActPwno()); 					// 계좌비밀번호
				iMnpTsAvl.setTrnAm(input.getTrnAm()); 							// 거래금액
				iMnpTsAvl.setRsvDt("00010101"); 									// 예약일자
				iMnpTsAvl.setRcvBkcd("020"); 										// 입금은행코드
				iMnpTsAvl.setRcvAcno(input.getRcvAcno()); 					// 입금계좌번호
				iMnpTsAvl.setPtnPbokPrngTxt(input.getPtnPbokPrngTxt()); 	// 상대통장인자내용
				iMnpTsAvl.setRnpeFnm(sRnpeFnm); 									// 수취인성명
				iMnpTsAvl.setHbitclngYn("M");
				
				MnyPinFncTrnSelectMnpTsAvl_DODT oMnpTsAvl = mNPMnyPinFncTrn_COM.selectMnpTsAvl(iMnpTsAvl);
				
				if (logger.isDebugEnabled()) {
					logger.debug("90190263 머니클립금고금액입출금 이체가능조회 SVC oMnpTsAvl :: {} ", oMnpTsAvl);
				}
				
				MnyPinFncTrnUpdateMnpAmTs_DIDT iMnpAmTs = new MnyPinFncTrnUpdateMnpAmTs_DIDT();
			
				iMnpAmTs.setWdrAcno(input.getWdrAcno()); 					// 출금계좌번호
				iMnpAmTs.setActPwno(input.getActPwno()); 					// 계좌비밀번호
				iMnpAmTs.setActPwnoUsgYn("N"); 									// 계좌비밀번호사용여부
				iMnpAmTs.setTrnAm(input.getTrnAm()); 							// 거래금액
				iMnpAmTs.setRsvDt("00010101"); 									// 예약일자
				iMnpAmTs.setRcvBkcd("020"); 										// 입금은행코드
				iMnpAmTs.setRcvAcno(input.getRcvAcno()); 					// 입금계좌번호
				iMnpAmTs.setPtnPbokPrngTxt(input.getPtnPbokPrngTxt()); 	// 상대통장인자내용
				iMnpAmTs.setRnpeFnm(sRnpeFnm); 									// 수취인성명
				iMnpAmTs.setHbitclngYn("M");
				iMnpAmTs.setWdrPbokPrngTxt(input.getWdrPbokPrngTxt());	// 출금통장인자내용
				
				if (logger.isDebugEnabled()) {
					logger.debug("90190263 머니클립금고금액입출금 이체가능조회 SVC iMnpAmTs :: {} ", iMnpAmTs);
				}
				
				MnyPinFncTrnUpdateMnpAmTs_DODT oMnpAmTs = mNPMnyPinFncTrn_COM.updateMnpAmTs(iMnpAmTs);
				
				if (logger.isDebugEnabled()) {
					logger.debug("90190263 머니클립금고금액입출금 이체가능조회 SVC oMnpAmTs :: {} ", oMnpAmTs);
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
			
				
			} catch (WFApplicationException e) {
				logger.debug("updateSafAmRaw WFApplicationException 오류 {} ",e);
				Object[] args = e.getArguments();
				
		        String rtcdTxt = "";
		        if(args != null && args.length>0) {
		        	rtcdTxt = args[0].toString();
				}
		        
				output.setErrMsgId("9999");
				output.setErrMsgTxt(rtcdTxt);
			} catch (Exception e) {
				logger.debug("updateSafAmRaw Exception 오류 {} ",e);
				output.setErrMsgId("9999");
				output.setErrMsgTxt(e.getMessage());
			} 
			
		} else {
			//  로그인 세션이 존재하지 않습니다.
			throw new WFApplicationException("CMME0018");
		}
		
		if (logger.isDebugEnabled()) {
			logger.debug("90190263 머니클립금고금액입출금 수정 SVC output :: {} ", output);
		}
					
		return output;
	}
	
	/**
	 * 머니클립 금고의 목표 정보를 조회한다.
	 * 
	 * @param input MnyPinSafMng 입력
	 * @return MnyPinSafMng 출력
	 */
	@BxmCategory(logicalName="머니클립금고목표정보조회", description="머니클립 금고의 목표 정보를 조회한다.", author="90190263")
	public MNPMnyPinSafMngSelectSafGoalInf_ODT selectSafGoalInf(MNPMnyPinSafMngSelectSafGoalInf_IDT input
	) {
		/**
		* @BXMType GetBean
		*/
		mNPMnyPinFncTrn_COM = WFApplicationContext.getBean(mNPMnyPinFncTrn_COM, MNPMnyPinFncTrn_COM.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */
		MNPMnyPinSafMngSelectSafGoalInf_ODT output = new MNPMnyPinSafMngSelectSafGoalInf_ODT();

		if (logger.isDebugEnabled()) {
			logger.debug("90190263 머니클립금고목표정보조회 SVC input :: {} ", input);
		}
		
		MnyPinFncTrnSelectMnpChgItm_DIDT iMnpGoalInf = new MnyPinFncTrnSelectMnpChgItm_DIDT();
		
		// 거래구분코드 : [09] 조회
		iMnpGoalInf.setAtsWdrBkwAcno(input.getMoAcno()); 	// 자동이체출금전행계좌번호
		iMnpGoalInf.setCucd(""); 										// 통화코드
		iMnpGoalInf.setRcvAcno(input.getChactNo()); 			// 입금계좌번호

		if (logger.isDebugEnabled()) {
			logger.debug("90190263 머니클립금고목표정보조회 SVC iMnpGoalInf :: {} ", iMnpGoalInf);
		}
		
		MnyPinFncTrnSelectMnpChgItm_DODT oMnpGoalInf= mNPMnyPinFncTrn_COM.selectMnpChgItm(iMnpGoalInf);
		
		if (logger.isDebugEnabled()) {
			logger.debug("90190263 머니클립금고목표정보조회 SVC oMnpGoalInf :: {} ", oMnpGoalInf);
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
		 * 995 모으기제목 	- 예시 : 여행자금(금고,지갑명)
		 * 
		 */
		output.setMnpChgItmDto(oMnpGoalInf.getMnpChgItmDto());
		
		if (logger.isDebugEnabled()) {
			logger.debug("90190263 머니클립금고목표정보조회 SVC output :: {} ", output);
		}
					
		return output;
	}
	
	/**
	 * 머니클립 금고의 목표를 등록/수정한다.
	 * 
	 * @param input MnyPinSafMng 입력
	 * @return MnyPinSafMng 출력
	 */
	@BxmCategory(logicalName="머니클립금고목표정보수정", description="머니클립 금고의 목표를 수정한다.", author="90190263")
	public MNPMnyPinSafMngUpdateSafGoalInf_ODT updateSafGoalInf(MNPMnyPinSafMngUpdateSafGoalInf_IDT input
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
		MNPMnyPinSafMngUpdateSafGoalInf_ODT output = new MNPMnyPinSafMngUpdateSafGoalInf_ODT();

		/**
		 * @BXMType IF
		 * @Desc 입력 검증 : 필수 입력 값 검증 코드를 작성 하십시오.
		 */
		if ( input.getTrnDscd()== null ) /**null check - 거래구분코드*/{
			throw new WFApplicationException("FNSE0005", null, new Object[]{input.getTrnDscd()});
		}
		else if ( input.getAtsWdrBkwAcno()== null ) /**null check - 자동이체출금전행계좌번호*/{
			throw new WFApplicationException("FNSE0005", null, new Object[]{input.getAtsWdrBkwAcno()});
		}
		else if ( input.getRcvAcno()== null ) /**null check - 입금계좌번호*/{
			throw new WFApplicationException("FNSE0005", null, new Object[]{input.getRcvAcno()});
		}
		
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession();
		
		if (logger.isDebugEnabled()) {
			logger.debug("90190263 머니클립금고목표정보수정 SVC input :: {} ", input);
		}
		
		try {
				
			
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
			 * [02]: 변경
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
			iMnpAtsInf.setTrnDscd(input.getTrnDscd()); 										// 거래구분코드
			iMnpAtsInf.setAtsMngNo(input.getAtsMngNo()); 								// 자동이체관리번호
			iMnpAtsInf.setAtsWdrBkwAcno(input.getAtsWdrBkwAcno()); 				// 자동이체출금전행계좌번호
			iMnpAtsInf.setAtsRcvBkcd("020");						 							// 자동이체입금은행코드
			iMnpAtsInf.setRcvAcno(input.getRcvAcno()); 									// 입금계좌번호
			iMnpAtsInf.setAtsBasDd(input.getAtsBasDd()); 									// 자동이체기준일
			iMnpAtsInf.setAtsAm(input.getAtsAm()); 											// 자동이체금액
			iMnpAtsInf.setAtsRqAdvpeEno(""); 													// 자동이체신청권유자직원번호
			
			iMnpAtsInf.setAtsCycd(input.getAtsCycd()); 								// 자동이체주기코드
			
			iMnpAtsInf.setAtsStaDt(input.getAtsStaDt()); 								// 자동이체시작일자
			iMnpAtsInf.setAtsEndDt(input.getAtsEndDt()); 								// 자동이체종료일자
			iMnpAtsInf.setRnpeNm(sRnpeFnm); 												// 수취인명
			iMnpAtsInf.setRqspeNm(sRnpeFnm); 											// 의뢰인명
			iMnpAtsInf.setAtsTitl(input.getAtsTitl()); 											// 자동이체제목
			iMnpAtsInf.setAtsItcd(input.getAtsItcd()); 										// 자동이체항목코드
			iMnpAtsInf.setAtsItmTxt(input.getAtsItmTxt()); 								// 자동이체항목내용
			iMnpAtsInf.setAtsHldyPrcBscd(input.getAtsHldyPrcBscd()); 					// 자동이체휴일처리기준코드
			iMnpAtsInf.setAtsAfchFndAcno(input.getAtsAfchFndAcno()); 				// 자동이체변경후펀드계좌번호
			
			// 머니클립자동이체정보.컴포넌트.공통.입력.IO
			List<IBSMR0006066_GRID_IDT> iIBSMR0006066DataList = new ArrayList<>();
			
			MNPMnyPinFncTrnSelectMnpChgItm_DTO inputData = input.getMnpChgItmDto();
			IBSMR0006066_GRID_IDT iIBSMR0006066Data = new IBSMR0006066_GRID_IDT();
			
			if( !StringUtils.isEmpty(inputData.getTsExeDd())) {
				 iIBSMR0006066Data = new IBSMR0006066_GRID_IDT();
				iIBSMR0006066Data.setDpsRgsChgDtcd("197"); // 197 : 이체실행일 
				iIBSMR0006066Data.setDpsRgsChgDtcdTxt(inputData.getTsExeDd());
				iIBSMR0006066DataList.add(iIBSMR0006066Data);
			}
			
			if( !StringUtils.isEmpty(inputData.getTsCyc())) {
				iIBSMR0006066Data = new IBSMR0006066_GRID_IDT();
				iIBSMR0006066Data.setDpsRgsChgDtcd("517"); // 517 : 이체주기
				iIBSMR0006066Data.setDpsRgsChgDtcdTxt(inputData.getTsCyc());
				iIBSMR0006066DataList.add(iIBSMR0006066Data);
			}
			if( !StringUtils.isEmpty(inputData.getGoalAm())) {
				iIBSMR0006066Data = new IBSMR0006066_GRID_IDT();
				iIBSMR0006066Data.setDpsRgsChgDtcd("627"); // 627 : 목표금액
				iIBSMR0006066Data.setDpsRgsChgDtcdTxt(inputData.getGoalAm());
				iIBSMR0006066DataList.add(iIBSMR0006066Data);
			}
			if( !StringUtils.isEmpty(inputData.getTsAm())) {
				iIBSMR0006066Data = new IBSMR0006066_GRID_IDT();
				iIBSMR0006066Data.setDpsRgsChgDtcd("805"); // 805 : 이체금액 
				iIBSMR0006066Data.setDpsRgsChgDtcdTxt(inputData.getTsAm());
				iIBSMR0006066DataList.add(iIBSMR0006066Data);
			}
			if( !StringUtils.isEmpty(inputData.getGoalNm())) {
				iIBSMR0006066Data = new IBSMR0006066_GRID_IDT();
				iIBSMR0006066Data.setDpsRgsChgDtcd("995");
				iIBSMR0006066Data.setDpsRgsChgDtcdTxt(inputData.getGoalNm());
				iIBSMR0006066DataList.add(iIBSMR0006066Data);
			}
	
			iMnpAtsInf.setGrid(iIBSMR0006066DataList);
			iMnpAtsInf.setCnt(iIBSMR0006066DataList.size()); // 건수
			
			if (logger.isDebugEnabled()) {
				logger.debug("90190263 머니클립금고목표정보수정 SVC iMnpAtsInf :: {} ", iMnpAtsInf);
			}
			
			MnyPinFncTrnExecuteMnpAtsInf_DODT oMnpAtsInf= mNPMnyPinFncTrn_COM.executeMnpAtsInf(iMnpAtsInf);
			
			if (logger.isDebugEnabled()) {
				logger.debug("90190263 머니클립금고목표정보수정 SVC oMnpAtsInf :: {} ", oMnpAtsInf);
			}
			
			output.setTrnRstCd(oMnpAtsInf.getTrnRstCd()); 	// 거래결과코드
			output.setTrnRstTxt(oMnpAtsInf.getTrnRstTxt()); 	// 거래결과내용
		} catch (WFApplicationException e) {
			logger.debug("머니클립금고목표정보수정 WFApplicationException 오류 {} ",e);
			Object[] args = e.getArguments();
			
	        String rtcdTxt = "";
	        if(args != null && args.length>0) {
	        	rtcdTxt = args[0].toString();
			}
	        
			output.setTrnRstCd("9999");
			output.setTrnRstTxt(rtcdTxt);
		} catch (Exception e) {
			logger.debug("머니클립금고목표정보수정 Exception 오류 {} ",e);
			output.setTrnRstCd("9999");
			output.setTrnRstTxt(e.getMessage());
		} 
		
		if (logger.isDebugEnabled()) {
			logger.debug("90190263 머니클립금고목표정보수정 SVC output :: {} ", output);
		}
					
		return output;
	}
	
	/**
	 * 머니클립 금고의 목표를 해지한다.
	 * 
	 * @param input MnyPinSafMng 입력
	 * @return MnyPinSafMng 출력
	 */
	@BxmCategory(logicalName="머니클립금고목표정보해지", description="머니클립 금고의 목표를 해지한다.", author="90190263")
	public MNPMnyPinSafMngUpdateSafGoalInfScss_ODT updateSafGoalInfScss(MNPMnyPinSafMngUpdateSafGoalInfScss_IDT input
	) {
		/**
		* @BXMType GetBean
		*/
		mNPMnyPinFncTrn_COM = WFApplicationContext.getBean(mNPMnyPinFncTrn_COM, MNPMnyPinFncTrn_COM.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */
		MNPMnyPinSafMngUpdateSafGoalInfScss_ODT output = new MNPMnyPinSafMngUpdateSafGoalInfScss_ODT();

		/**
		 * @BXMType IF
		 * @Desc 입력 검증 : 필수 입력 값 검증 코드를 작성 하십시오.
		 */
		 if ( input.getAtsMngNo()== null ) /**null check - 자동이체관리번호*/{
			throw new WFApplicationException("FNSE0005", null, new Object[]{input.getAtsMngNo()});
		}
		else if ( input.getAtsWdrBkwAcno()== null ) /**null check - 자동이체출금전행계좌번호*/{
			throw new WFApplicationException("FNSE0005", null, new Object[]{input.getAtsWdrBkwAcno()});
		}
		else if ( input.getRcvAcno()== null ) /**null check - 입금계좌번호*/{
			throw new WFApplicationException("FNSE0005", null, new Object[]{input.getRcvAcno()});
		}
		else if ( input.getAtsAm()== null ) /**null check - 자동이체금액*/{
			throw new WFApplicationException("FNSE0005", null, new Object[]{input.getAtsAm()});
		}
		else if ( input.getAtsItcd()== null ) /**null check - 자동이체항목코드*/{
			throw new WFApplicationException("FNSE0005", null, new Object[]{input.getAtsItcd()});
		}
		else if ( input.getAtsItmTxt()== null ) /**null check - 자동이체항목내용*/{
			throw new WFApplicationException("FNSE0005", null, new Object[]{input.getAtsItmTxt()});
		}
		
		if (logger.isDebugEnabled()) {
			logger.debug("90190263 머니클립금고목표정보해지 SVC input :: {} ", input);
		}
		
		try {
				
			MnyPinFncTrnExecuteMnpAtsInf_DIDT iMnpAtsInf = new MnyPinFncTrnExecuteMnpAtsInf_DIDT();
			/** 
			 * 거래구분코드 정보
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
			iMnpAtsInf.setTrnDscd("03"); 												// 거래구분코드
			iMnpAtsInf.setAtsMngNo(input.getAtsMngNo()); 					// 자동이체관리번호
			iMnpAtsInf.setAtsWdrBkwAcno(input.getAtsWdrBkwAcno()); 	// 자동이체출금전행계좌번호
			iMnpAtsInf.setAtsRcvBkcd("020"); 										// 자동이체입금은행코드
			iMnpAtsInf.setRcvAcno(input.getRcvAcno()); 						// 입금계좌번호
			iMnpAtsInf.setAtsAm(input.getAtsAm()); 								// 자동이체금액
			iMnpAtsInf.setAtsItcd(input.getAtsItcd()); 							// 자동이체항목코드
			iMnpAtsInf.setAtsItmTxt(input.getAtsItmTxt()); 					// 자동이체항목내용
			
			if (logger.isDebugEnabled()) {
				logger.debug("90190263 머니클립금고목표정보해지 SVC iMnpAtsInf :: {} ", iMnpAtsInf);
			}
			
			MnyPinFncTrnExecuteMnpAtsInf_DODT oMnpAtsInf= mNPMnyPinFncTrn_COM.executeMnpAtsInf(iMnpAtsInf);
			
			if (logger.isDebugEnabled()) {
				logger.debug("90190263 머니클립금고목표정보해지 SVC oMnpAtsInf :: {} ", oMnpAtsInf);
			}
			
			output.setTrnRstCd(oMnpAtsInf.getTrnRstCd()); 	// 거래결과코드
			output.setTrnRstTxt(oMnpAtsInf.getTrnRstTxt()); 	// 거래결과내용
		} catch (WFApplicationException e) {
			logger.debug("insertWallBscInf WFApplicationException 오류 {} ",e);
			Object[] args = e.getArguments();
			
	        String rtcdTxt = "";
	        if(args != null && args.length>0) {
	        	rtcdTxt = args[0].toString();
			}
	        
			output.setTrnRstCd("9999");
			output.setTrnRstTxt(rtcdTxt);
		} catch (Exception e) {
			logger.debug("insertWallBscInf Exception 오류 {} ",e);
			output.setTrnRstCd("9999");
			output.setTrnRstTxt(e.getMessage());
		} 
		if (logger.isDebugEnabled()) {
			logger.debug("90190263 머니클립금고목표정보해지 SVC output :: {} ", output);
		}
					
		return output;
	}
	
	/**
	 * 머니클립 금고의 거래내역을 조회한다
	 * 
	 * @param input MnyPinSafMng 입력
	 * @return MnyPinSafMng 출력
	 */
	@BxmCategory(logicalName="머니클립금고거래내역조회", description="머니클립 금고의 거래내역을 조회한다.", author="90190263")
	public MNPMnyPinSafMngSelectTrnPrts_ODT selectTrnPrts(MNPMnyPinSafMngSelectTrnPrts_IDT input
	) {
		/**
		* @BXMType GetBean
		*/
		mNPMnyPinFncTrn_COM = WFApplicationContext.getBean(mNPMnyPinFncTrn_COM, MNPMnyPinFncTrn_COM.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */
		MNPMnyPinSafMngSelectTrnPrts_ODT output = new MNPMnyPinSafMngSelectTrnPrts_ODT();

		if (logger.isDebugEnabled()) {
			logger.debug("90190263 머니클립금고거래내역조회 SVC input :: {} ", input);
		}
		
		MnyPinFncTrnSelectTrnPrts_DIDT iTrnPrts = new MnyPinFncTrnSelectTrnPrts_DIDT();
		iTrnPrts.setSortDis(input.getSortDis()); 			// 정렬구분
		iTrnPrts.setInqTgtDis(input.getInqTgtDis()); 		// 조회대상구분
		iTrnPrts.setAcno(input.getAcno()); 					// 계좌번호
		iTrnPrts.setInqStaDt(input.getInqStaDt()); 		// 조회시작일자
		iTrnPrts.setInqEndDt(input.getInqEndDt()); 		// 조회종료일자
		iTrnPrts.setPageNo(input.getPageNo()); 			// 페이지번호
		iTrnPrts.setMinAm(input.getMinAm()); 				// 최소금액
		iTrnPrts.setMaxAm(input.getMaxAm()); 			// 최갣금액
		
		if (logger.isDebugEnabled()) {
			logger.debug("90190263 머니클립금고거래내역조회 SVC input :: {} ", iTrnPrts);
		}
		
		MnyPinFncTrnSelectTrnPrts_DODT oTrnPrts= mNPMnyPinFncTrn_COM.selectTrnPrts(iTrnPrts);
		
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
		
		
		/******************************************************************
         * 금고 보관 이자금액 계산
         * 31일 이상 보관금액 - 총 출금금액 < 0
         * => 0보다 작을경우 7일 이상 보관금액에서 차액만큼 차감
         ******************************************************************/
		BigDecimal d7UndAm 		= oTrnPrts.getD7UndAm();
		BigDecimal d7OverAm 		= oTrnPrts.getD7OverAm();
		BigDecimal d31OverAm 		= oTrnPrts.getD31OverAm();
		
		if (logger.isDebugEnabled()) {
			logger.debug("90190263 머니클립금고거래내역조회 SVC 31일 이상 금액 d31OverAm {} :: ",d31OverAm);
			logger.debug("90190263 머니클립금고거래내역조회 SVC  7일 이상 금액 d7OverAm  {} :: ",d7OverAm);
			logger.debug("90190263 머니클립금고거래내역조회 SVC  7일 미만 금액 d7UndAm  {} :: ",d7UndAm);
		}
		
		List<MNPMnyPinFncTrnSelectTrnPrts_DTO> trnPrtsList = new ArrayList<MNPMnyPinFncTrnSelectTrnPrts_DTO>();

		Collections.reverse(oTrnPrts.getGrid());

		if (logger.isDebugEnabled()) {
			logger.debug("90190263 머니클립금고거래내역조회 SVC oTrnPrts :: {} ", oTrnPrts);
		}
		
		for(MNPMnyPinFncTrnSelectTrnPrts_DTO trnPrtsData : oTrnPrts.getGrid()) {
			BigDecimal tmpPayRestAm = BigDecimal.ZERO;
			BigDecimal tmpDpsBal = BigDecimal.ZERO;
			// 금고분석화면일경우
			if("Y".equals(input.getSafAnlsYn())) {
				//꺼내기일때
				if("Y".equals(trnPrtsData.getPayYn())) {
					if (logger.isDebugEnabled()) {
						logger.debug("90190263 머니클립금고거래내역조회 SVC trnPrtsData :: {} ",trnPrtsData);
					}
					
					/*
					 * 상황 가정
					 * 31일 이상 - 5만원 있는 상태
					 * 7일 이상 ~ 31미만 - 4만원 있는 상태
					 * 7일 미만 - 1만원 있는 상태
					 * 
					 * 라고 가정하고 아래 주석을 볼 것
					 * 
					 * 현재잔액은 10만원
					 * 꺼내기 요청금액은 7만원
					 * 
					 * */
					
					// ( 31일 이상금액 - 지출금액 ) 계산 시에 31일 이상금액이 적을떄. 즉, 이 경우에는 7일이상 ~ 31일 미만 구역까지 차감을 해줘야함.
					//PayAm > d31OverAm 이면 -1 반환
					//7만원 > 5만원
					if(d31OverAm.compareTo(trnPrtsData.getPayAm()) < 0 ) {
						tmpDpsBal = trnPrtsData.getDpsBal(); //거래후잔액, 10만원
						tmpPayRestAm = d31OverAm.subtract(trnPrtsData.getPayAm()); // 잔여금액(이 if로 진입했을 경우 tmpPayRestAm의 값은 항상 음의 값을 가질것임), 5만원 - 7만원
						
						if (logger.isDebugEnabled()) {
							logger.debug("90190263 머니클립금고거래내역조회 SVC 31일 이상 잔여 금액 d31OverAm :: {} / 잔여금액 payRestAm :: {} ",d31OverAm, tmpPayRestAm);
						}
						
						//소스상으로는 항상 음의값이니 진입할것 같은데
						// -2만원 < 0원
						if(tmpPayRestAm.compareTo(BigDecimal.ZERO) < 0) {
							MNPMnyPinFncTrnSelectTrnPrts_DTO trnPrtsCopyOutput = this.getTrnPrtsCopy(trnPrtsData);
							
							tmpDpsBal = tmpDpsBal.add(trnPrtsData.getPayAm()); // 이전거래금액표기, 10만원 + 7만원
							tmpDpsBal = tmpDpsBal.subtract(d31OverAm); // 17만원 - 5만원 = 12만원
							
							trnPrtsCopyOutput.setPayAm(d31OverAm); 			// 지급금액, 5만원
							trnPrtsCopyOutput.setDpsBal(tmpDpsBal); //12만원
							trnPrtsCopyOutput.setPayTmDscd("3"); 				// 지급기간구분코드
							// trnPrts 셋팅
							trnPrtsList.add(trnPrtsCopyOutput);
							
							d31OverAm = BigDecimal.ZERO; //0원으로 초기화
						}
						
						tmpPayRestAm = tmpPayRestAm.abs(); //남은 금액 -2만원 절대값으로 변환
						
						// ( 7일 이상금액 - 지출잔여금액 ) 계산 시 7일 이상금액이 적을떄
						// 여기로 들어온다면 위에 로직과 동일한 짓을 한번 더 진행한다
						if( d7OverAm.compareTo(tmpPayRestAm) < 0) {
							tmpPayRestAm = d7OverAm.subtract(tmpPayRestAm);
							
							if (logger.isDebugEnabled()) {
								logger.debug("90190263 머니클립금고거래내역조회 SVC 7일 이상 잔여 금액 d7OverAm :: {} / 잔여금액 tmpPayRestAm :: {} ",d7OverAm, tmpPayRestAm);
							}
							
							if(tmpPayRestAm.compareTo(BigDecimal.ZERO) < 0) {				
								MNPMnyPinFncTrnSelectTrnPrts_DTO trnPrtsCopyOutput = this.getTrnPrtsCopy(trnPrtsData);
								
								tmpDpsBal = tmpDpsBal.add(d7OverAm);
								
								trnPrtsCopyOutput.setPayAm(d7OverAm); 			// 지급금액
								trnPrtsCopyOutput.setDpsBal(tmpDpsBal);
								trnPrtsCopyOutput.setPayTmDscd("2"); 				// 지급기간구분코드
								// trnPrts 셋팅
								trnPrtsList.add(trnPrtsCopyOutput);
								
								d7OverAm = BigDecimal.ZERO;
							}
							
							tmpPayRestAm = tmpPayRestAm.abs();
							
							// ( 7일 미만금액 - 지출잔여금액 ) 계산
							if(d7UndAm.compareTo(tmpPayRestAm) < 0) {
								//d7UndAm = BigDecimal.ZERO;
								
								if(tmpPayRestAm.compareTo(BigDecimal.ZERO) < 0) {				
									MNPMnyPinFncTrnSelectTrnPrts_DTO trnPrtsCopyOutput = this.getTrnPrtsCopy(trnPrtsData);
									
									tmpDpsBal = tmpDpsBal.add(d7UndAm);
									
									trnPrtsCopyOutput.setPayAm(tmpPayRestAm); 			// 지급금액
									trnPrtsCopyOutput.setDpsBal(tmpDpsBal);
									trnPrtsCopyOutput.setPayTmDscd("1"); 					// 지급기간구분코드
									// trnPrts 셋팅
									trnPrtsList.add(trnPrtsCopyOutput);
									
									d7UndAm = BigDecimal.ZERO;
								}
								
							} else {
								if (logger.isDebugEnabled()) {
									logger.debug("90190263 머니클립금고거래내역조회 SVC 7일 미만 잔여 금액 d7UndAm :: {} / 잔여금액 tmpPayRestAm :: {} ",d7UndAm, tmpPayRestAm);
								}
								
								d7UndAm = d7UndAm.subtract(tmpPayRestAm);
								
								if(d7UndAm.compareTo(BigDecimal.ZERO) >= 0) {				
									MNPMnyPinFncTrnSelectTrnPrts_DTO trnPrtsCopyOutput = this.getTrnPrtsCopy(trnPrtsData);
									
									tmpDpsBal = tmpDpsBal.subtract(d7UndAm);
									
									trnPrtsCopyOutput.setPayAm(tmpPayRestAm); 			// 지급금액
									trnPrtsCopyOutput.setPayTmDscd("1"); 					// 지급기간구분코드
									// trnPrts 셋팅
									trnPrtsList.add(trnPrtsCopyOutput);
								}
							}
						} else {
							//4만원 - 2만원 진행
							d7OverAm =  d7OverAm.subtract(tmpPayRestAm);
							
							if(d7OverAm.compareTo(BigDecimal.ZERO) > 0) {
								MNPMnyPinFncTrnSelectTrnPrts_DTO trnPrtsCopyOutput = this.getTrnPrtsCopy(trnPrtsData);
								
								trnPrtsCopyOutput.setPayAm(tmpPayRestAm); 			// 지급금액, 2만원
								trnPrtsCopyOutput.setPayTmDscd("2"); 					// 지급기간구분코드
								// trnPrts 셋팅
								trnPrtsList.add(trnPrtsCopyOutput);
							}
						}
					} else {
						d31OverAm = d31OverAm.subtract(trnPrtsData.getPayAm());
						
						if(d31OverAm.compareTo(BigDecimal.ZERO) > 0) {
							MNPMnyPinFncTrnSelectTrnPrts_DTO trnPrtsCopyOutput = this.getTrnPrtsCopy(trnPrtsData);
							
							trnPrtsCopyOutput.setPayAm(trnPrtsData.getPayAm());  // 지급금액
							trnPrtsCopyOutput.setPayTmDscd("3"); 						// 지급기간구분코드
							// trnPrts 셋팅
							trnPrtsList.add(trnPrtsCopyOutput);
						}
					}
					
				} else {
					// 입금내역
					MNPMnyPinFncTrnSelectTrnPrts_DTO trnPrtsCopyOutput = this.getTrnPrtsCopy(trnPrtsData);
					
					// trnPrts 셋팅
					trnPrtsList.add(trnPrtsCopyOutput);
				}
			} else {
				// 거래내역만 조회할 경우
				MNPMnyPinFncTrnSelectTrnPrts_DTO trnPrtsCopyOutput = this.getTrnPrtsCopy(trnPrtsData);
				
				trnPrtsList.add(trnPrtsCopyOutput);
			}
		}
		
		// 7일미만, 7일이상1개월미만, 1개월 이상 탭 선택 시 보여줄 상세 잔액
		BigDecimal d7UnderDtlDpsBal 		= BigDecimal.ZERO;			// 7일 미만 상세 잔액
		BigDecimal d7OverDtlDpsBal 		= BigDecimal.ZERO;			// 7일 이상 1개월 미만 상세 잔액
		BigDecimal d31OverDtlDpsBal 		= BigDecimal.ZERO;			// 1개월 이상 상세 잔액
		// 잔액 누적 계산을 위해 목록 reverse하고 잔액 계산 끝난 후 다시 reverse 한다.
		//Collections.reverse(trnPrtsList);
		
		for(MNPMnyPinFncTrnSelectTrnPrts_DTO trnPrtsData : trnPrtsList) {
			// 기간별 상세 잔액(누적 입지급액) 세팅
			if("1".equals(trnPrtsData.getPayTmDscd()))  {							// 7일 미만
				// Y: 지급, N: 입금
				if("Y".equals(trnPrtsData.getPayYn())) {
					d7UnderDtlDpsBal = d7UnderDtlDpsBal.subtract(trnPrtsData.getPayAm());
				} else {
					d7UnderDtlDpsBal = d7UnderDtlDpsBal.add(trnPrtsData.getRcvAm());
				}
			} else if ("2".equals(trnPrtsData.getPayTmDscd())) {					// 7일 이상 1개월 미만
				// Y: 지급, N: 입금
				if("Y".equals(trnPrtsData.getPayYn())) {
					d7OverDtlDpsBal = d7OverDtlDpsBal.subtract(trnPrtsData.getPayAm());
				} else {
					d7OverDtlDpsBal = d7OverDtlDpsBal.add(trnPrtsData.getRcvAm());
				}
			} else if("3".equals(trnPrtsData.getPayTmDscd())) {					// 1개월 이상
				// Y: 지급, N: 입금
				if("Y".equals(trnPrtsData.getPayYn())) {
					d31OverDtlDpsBal = d31OverDtlDpsBal.subtract(trnPrtsData.getPayAm());
				} else {
					d31OverDtlDpsBal = d31OverDtlDpsBal.add(trnPrtsData.getRcvAm());
				}
			}
			
			trnPrtsData.setD7UnderDtlDpsBal(d7UnderDtlDpsBal);
			trnPrtsData.setD7OverDtlDpsBal(d7OverDtlDpsBal);
			trnPrtsData.setD31OverDtlDpsBal(d31OverDtlDpsBal);
		}
		
		Collections.reverse(trnPrtsList);
		
		output.setD7UndAm(d7UndAm);					// 7일미만금액
		output.setD7OverAm(d7OverAm);				// 7일이상금액
		output.setD31OverAm(d31OverAm);				// 31일이상금액
		output.setGrid(trnPrtsList); 						// 머니클립거래내역조회.공통.출력.IO
		
		if (logger.isDebugEnabled()) {
			logger.debug("90190263 머니클립금고거래내역조회 SVC output :: {} ", output);
		}

		return output;
	}
	

	/**
	 * 머니클립 월말 잔액 조회
	 * 
	 * @param input MnyPinSafMng 입력
	 * @return MnyPinSafMng 출력
	 */
	@BxmCategory(logicalName="머니클립금고월말잔액조회", description="머니클립 금고의 월말잔액내역을 조회한다.", author="90190263")
	public MNPMnyPinSafMngSelectMnpSafBal_ODT selectMnpSafBal(MNPMnyPinSafMngSelectMnpSafBal_IDT input
	) {
		/**
		* @BXMType GetBean
		*/
		mNPMnyPinFncTrn_COM = WFApplicationContext.getBean(mNPMnyPinFncTrn_COM, MNPMnyPinFncTrn_COM.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */
		MNPMnyPinSafMngSelectMnpSafBal_ODT output = new MNPMnyPinSafMngSelectMnpSafBal_ODT();

		if (logger.isDebugEnabled()) {
			logger.debug("90190263 머니클립금고월말잔액조회 SVC input :: {} ", input);
		}
		
		MnyPinFncTrnSelectMnyBal_DIDT iMnyBal = new MnyPinFncTrnSelectMnyBal_DIDT();
		
		iMnyBal.setInqAcno(input.getInqAcno()); // 조회계좌번호
		iMnyBal.setInqStaYm(input.getInqStaYm()); // 조회시작년월
		iMnyBal.setInqEndYm(input.getInqEndYm()); // 조회종료년월

		if (logger.isDebugEnabled()) {
			logger.debug("90190263 머니클립금고월말잔액조회  SVC input :: {} ", iMnyBal);
		}
		
		MnyPinFncTrnSelectMnyBal_DODT oMnyBal= mNPMnyPinFncTrn_COM.selectMnpBal(iMnyBal);
		
		if (logger.isDebugEnabled()) {
			logger.debug("90190263 머니클립금고월말잔액조회  SVC oTrnPrts :: {} ", oMnyBal);
		}
		
		output.setAcno(oMnyBal.getAcno());	// 계좌번호
		output.setCnt(oMnyBal.getCnt()); 		// 건수
		output.setGrid(oMnyBal.getGrid()); 		// 그리드
	
		if (logger.isDebugEnabled()) {
			logger.debug("90190263 머니클립금고월말잔액조회 SVC output :: {} ", output);
		}

		return output;
	}
	
	/**
	 * 금고 이자분석조회
	 * 
	 * @param input MnyPinSafMng 입력
	 * @return MnyPinSafMng 출력
	 */
	@BxmCategory(logicalName="금고이자분석조회", description="머니클립 금고의 이자를 분석하고 조회한다.", author="90190263")
	public MNPMnyPinSafMngSelectIntSafAnls_ODT selectIntSafAnls(MNPMnyPinSafMngSelectIntSafAnls_IDT input
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
		MNPMnyPinSafMngSelectIntSafAnls_ODT output = new MNPMnyPinSafMngSelectIntSafAnls_ODT();


		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession();
		
		
		/**
		 * @BXMType IF
		 * @Desc 입력 검증 : 필수 입력 값 검증 코드를 작성 하십시오.
		 */
		if ( input.getWdrAcno()== null ) /**null check - 출금계좌번호*/{
			throw new WFApplicationException("FNSE0005", null, new Object[]{input.getWdrAcno()});
		}
		else if ( input.getTrnAm()== null ) /**null check - 거래금액*/{
			throw new WFApplicationException("FNSE0005", null, new Object[]{input.getTrnAm()});
		}
		else if ( input.getRcvAcno()== null ) /**null check - 입금계좌번호*/{
			throw new WFApplicationException("FNSE0005", null, new Object[]{ input.getRcvAcno()});
		}
		
		if (logger.isDebugEnabled()) {
			logger.debug("90190263 머니클립금고이자분석조회 SVC input :: {} ", input);
		}
		
		MnyPinFncTrnSelectMnpTsAvl_DIDT iMnpTsAvl= new MnyPinFncTrnSelectMnpTsAvl_DIDT();

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
				iMnpTsAvl.setActPwno(input.getActPwno()); 					// 계좌비밀번호
				iMnpTsAvl.setTrnAm(input.getTrnAm()); 							// 거래금액
				iMnpTsAvl.setRsvDt("00010101"); 									// 예약일자
				iMnpTsAvl.setRcvBkcd("020"); 										// 입금은행코드
				iMnpTsAvl.setRcvAcno(input.getRcvAcno()); 					// 입금계좌번호
				iMnpTsAvl.setPtnPbokPrngTxt(input.getPtnPbokPrngTxt()); 	// 상대통장인자내용
				iMnpTsAvl.setRnpeFnm(sRnpeFnm); 									// 수취인성명
				iMnpTsAvl.setHbitclngYn("M");
				
				MnyPinFncTrnSelectMnpTsAvl_DODT oMnpTsAvl = mNPMnyPinFncTrn_COM.selectMnpTsAvl(iMnpTsAvl);
				
				if (logger.isDebugEnabled()) {
					logger.debug("90190263 머니클립금고금액입출금 이체가능조회 SVC oMnpTsAvl :: {} ", oMnpTsAvl);
				}
				
				output.setErrMsgId("0000");
				output.setIntSumAm(oMnpTsAvl.getINT());
			
			} catch (WFApplicationException e) {
				Object[] args = e.getArguments();
	            
		        String rtcdTxt = "";
		        if(args != null && args.length>0) {
		        	rtcdTxt = args[0].toString();
				}
	            
				output.setErrMsgId("9999");
				output.setErrMsgTxt(rtcdTxt);
				logger.debug("updateSafAmRaw WFApplicationException 오류 msgID | errorMsg  : [{}], [{}] ",e.getCode(), rtcdTxt);
			} catch (Exception e) {
				logger.debug("updateSafAmRaw Exception 오류",e);
				output.setErrMsgId("9999");
				output.setErrMsgTxt(e.getMessage());
			}
		} else {
			//  로그인 세션이 존재하지 않습니다.
			throw new WFApplicationException("CMME0018");
		}
		
		if (logger.isDebugEnabled()) {
			logger.debug("90190263 머니클립금고이자분석조회 SVC output :: {} ", output);
		}

		return output;
	}	
	
	
	/**
	 * 입력 받은 IO 필드를 복사( -> )
	 * 
	 * @param input 머니클립.거래내역.입력.공유.공통.IO
	 * @return 머니클립.거래내역..출력.공유.공통.IO
	 */
	@BxmCategory(logicalName="입력 받은 IO 필드를 복사.GET", description="입력 받은 IO 필드를 복사.GET", author="90190314")
	protected MNPMnyPinFncTrnSelectTrnPrts_DTO getTrnPrtsCopy(MNPMnyPinFncTrnSelectTrnPrts_DTO input
	) throws WFApplicationException  {
		
		MNPMnyPinFncTrnSelectTrnPrts_DTO output= new MNPMnyPinFncTrnSelectTrnPrts_DTO();
		output.setPayAm(input.getPayAm()); // 지급금액
		output.setPbokPrngOtlnCd(input.getPbokPrngOtlnCd()); // 통장인자적요코드
		output.setTrnTm(input.getTrnTm()); // 거래시각
		output.setRqspeNm(input.getRqspeNm()); // 의뢰인명
		output.setTrnDt(input.getTrnDt()); // 거래일자
		output.setTrnTxt(input.getTrnTxt()); // 거래내용
		output.setOtbrKd(input.getOtbrKd()); // 타점종류
		output.setRcvAm(input.getRcvAm()); // 입금금액
		output.setTrnSrno(input.getTrnSrno()); // 거래일련번호
		output.setDpsBal(input.getDpsBal()); // 수신잔액
		output.setOtbrAm(input.getOtbrAm()); // 타점금액
		output.setTrbkGicd(input.getTrbkGicd()); // 거래은행지로코드
		output.setTrbkGicdNm(input.getTrbkGicdNm()); // 거래은행지로코드명
		output.setOtbrKdNm(input.getOtbrKdNm()); // 타점종류명
		output.setTrfrvAm(input.getTrfrvAm()); // 대체입금금액
		output.setTrbkGicdFlag(input.getTrbkGicdFlag()); // 거래은행지로코드플래그
		output.setMemo(input.getMemo()); // 메모
		output.setMemoDis(input.getMemoDis()); // 메모구분
		output.setPayYn(input.getPayYn()); // 지급여부
		output.setPayTmDscd(input.getPayTmDscd()); // 지급기간구분코드
		
		return output;
	}
}
