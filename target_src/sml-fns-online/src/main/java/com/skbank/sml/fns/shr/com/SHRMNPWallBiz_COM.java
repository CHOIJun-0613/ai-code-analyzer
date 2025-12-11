package com.skbank.sml.fns.shr.com;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

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
import com.skbank.sml.fns.shr.cst.cstt.SHRMNPCmmConstant;
import com.skbank.sml.fns.shr.dbm.MNY_CLP_EXPS_SEQ_MNG_LDG001_DBM;
import com.skbank.sml.fns.shr.dto.MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMInsertMnyClpExpsSeqMng_DIDT;
import com.skbank.sml.fns.shr.dto.MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMSelectMnyClpExpsSeqMng_DIDT;
import com.skbank.sml.fns.shr.dto.MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMSelectMnyClpExpsSeqMng_DODT;
import com.skbank.sml.fns.shr.dto.SHRMNPWallBizInsertBscWallSaf_DIDT;
import com.skbank.sml.fns.shr.dto.SHRMNPWallBizInsertBscWallSaf_DODT;
import com.skbank.sml.fns.shr.dto.SHRMNPWallBizInsertMnpChidAcno_DIDT;
import com.skbank.sml.fns.shr.dto.SHRMNPWallBizInsertMnpChidAcno_DODT;
import com.skbank.sml.fns.shr.dto.SHRMNPWallBizInsertMnyClpWallExpsSeq_DIDT;
import com.skbank.sml.fns.shr.dto.SHRMNPWallBizInsertMnyClpWallExpsSeq_DODT;
import com.skbank.sml.fns.shr.dto.SHRMNPWallBizInsertWdrAcno_DIDT;
import com.skbank.sml.fns.shr.dto.SHRMNPWallBizInsertWdrAcno_DODT;
import com.skbank.sml.fns.shr.dto.SHRMNPWallBizMNPBscInf_DTO;
import com.skbank.sml.ifi.mca.eims3.dto.IBSMR0002963_GRID_IDT;
import com.skbank.sml.ifi.mca.eims3.dto.IBSMR0002963_IDT;
import com.skbank.sml.ifi.mca.eims3.dto.IBSMR0002963_ODT;
import com.skbank.sml.ifi.mca.eims3.dto.IBSMR0004253_IDT;
import com.skbank.sml.ifi.mca.eims3.dto.IBSMR0004253_ODT;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0002963_COM;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0004253_COM;

import bxm.common.annotaion.BxmCategory;
import io.micrometer.core.instrument.util.StringUtils;
import fwk.skbank.asis.adaptor.dto.request.WFInterfaceCfg;
import fwk.skbank.asis.adaptor.dto.response.WFInfResponse;
import fwk.skbank.asis.adaptor.header.request.WFNciHeader;
import fwk.skbank.online.context.WFApplicationContext;
import fwk.skbank.online.exception.app.WFApplicationException;

/**
 * 1.업무명 : NEWWON 대분류 금융서비스 
 * 2.단위업무명 : NEWWON 중분류 공유 
 * 3.프로그램명 : 머니클립 업무 공유 
 * 4.설명 : 머니클립 업무 공유
 * 
 * @Class SHRMNPWallBiz_COM.java
 * @author 90191355
 * @since 2024.10.11
 * @version 1.0
 */
@Component
@BxmCategory(logicalName = "머니클립 업무 공유", description = "머니클립 업무 공유")
public class SHRMNPWallBiz_COM {
	private Logger logger = LoggerFactory.getLogger(getClass());

	/**
	 * SHRCMMLoginSession 생성 컴포넌트
	 */
	private SHRCMMLoginSession_COM shrCMMLoginSession_COM;
	/** 
	 * SHRMMHCustSession_COM
	 */
	private SHRMMHCustSession_COM sHRMMHCustSession_COM;
	/**
	 * WFInterfaceCfg 생성 컴포넌트
	 */
	private SHRCMMInterfaceCfg_COM sHRCMMInterfaceCfg_COM;
	/**
	 * 요구불예금 신규실행
	 */
	private SHRIBSMR0004253_COM sHRIBSMR0004253_COM;
	/**
	 * 출금계좌등록
	 */
	private SHRIBSMR0002963_COM sHRIBSMR0002963_COM;	
	/**
	 * 머니클립 노출 순서 관리 DBM 
	 */
	private MNY_CLP_EXPS_SEQ_MNG_LDG001_DBM shrMnyClpExpsSeqMng001_DBM;
	/**
	 * 계좌 별명관리 공유 컴포넌트
	 */
	private SHRBSCActNmMng_COM shrBSCActNmMng_COM;
	/**
	 * 전계좌 세션 갱신
	 */
	private SHRAllActInqTbk_COM shrAllActInqTbk_COM;
	
	/**
	 * 머니클립 지갑/금고 생성
	 * 1. 자계좌 생성
	 * 2. 노출 순서 DB 등록
	 * 3. 계좌 별명 관리 DB 등록 (뱅킹 DB)
	 * 4. 출금 계좌 등록 
	 * @param input 머니클립 지갑 기본 정보 등록 입력IO
	 * @return 머니클립 지갑 기본 정보 등록 출력IO
	 * 
	 * @apiNote 2024.11.08 송현옥과장님 요청, 
	 * 자계좌 생성 후 실패 케이스 없이 완료하도록 변경
	 * 노출순서 DB 등록이 안되었을시 
	 * 노출 순서는 계좌 조회시 비교하여 등록하고
	 * 출금계좌 등록 등은 운영에서 처리한다.
	 */
	@BxmCategory(logicalName = "머니클립 지갑/금고 생성", description = "머니클립 지갑/금고를 생성한다.", author="90191355")
	public SHRMNPWallBizInsertBscWallSaf_DODT insertBscWallSaf(SHRMNPWallBizInsertBscWallSaf_DIDT input) {
		/**
		 * @BXMType GetBean
		 */
		
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		shrBSCActNmMng_COM = WFApplicationContext.getBean(shrBSCActNmMng_COM, SHRBSCActNmMng_COM.class);
		shrAllActInqTbk_COM = WFApplicationContext.getBean(shrAllActInqTbk_COM, SHRAllActInqTbk_COM.class);
		/** 
		 * 로직 추가
		 */
		SHRMNPWallBizInsertBscWallSaf_DODT output = new SHRMNPWallBizInsertBscWallSaf_DODT();
		
		if (logger.isDebugEnabled()) {
			logger.debug("SHRMNPWallBiz_COM insertBscWallSaf input :: {} ", input);
		}
		
		boolean isErrorPass = false;
		try {
			/**
			 * 1) 002-510-000-0000 (머니클립 통장)
			 * 2) 002-510-001-0000 (머니클립 지갑)
			 * 3) 002-510-002-0000 (머니클립 지갑)
			 */
			String sPdcd = "1".equals(input.getAcnoTyp()) ? SHRMNPCmmConstant.MNP_WALL_PRD_CD : SHRMNPCmmConstant.MNP_SAF_PRD_CD;
			
			String iconNo = input.getIconNo().isEmpty() ? SHRMNPCmmConstant.MNP_DEFAULT_ICON_NO : input.getIconNo();
			String acnoName = input.getAcnoNm().isEmpty() ? ("1".equals(input.getAcnoTyp()) ? SHRMNPCmmConstant.MNP_WALL_PRD_NM :  SHRMNPCmmConstant.MNP_SAF_PRD_NM) : input.getAcnoNm();
			String atsYn = input.getAtsYn().isEmpty() ? "N" : input.getAtsYn(); 
			/**
			 * 머니클립 자계좌 등록
			 */
			SHRMNPWallBizInsertMnpChidAcno_DIDT iChidAcno = new SHRMNPWallBizInsertMnpChidAcno_DIDT(); 
			
			iChidAcno.setWdrAcno(input.getDpsInpAcno());											// 출금계좌번호
			iChidAcno.setPdcd(sPdcd);																		// 상품코드
			iChidAcno.setCusDntnAscnCd(iconNo);														// 아이콘코드 : 2자리 코드	
			if ("Y".equals(atsYn)) {
				iChidAcno.setAtsYn(atsYn); 													// 자동이체여부
				iChidAcno.setAtsCycd(input.getAtsCycd()); 												// 자동이체주기코드:  01:매월, 20매일, 22:매주
				iChidAcno.setAtsStaDt(input.getAtsStaDt()); 											// 자동이체시작일자
				iChidAcno.setAtsDd(input.getAtsDd());	// 자동이체일
				iChidAcno.setAimFdNm(input.getGoalNm()); 											// 목적자금명
				iChidAcno.setAtsAm(input.getAtsAm()); 													// 자동이체금액
				iChidAcno.setDinsvGoalAm(input.getGoalAm()); 					
				iChidAcno.setInsvAcldTsStaWkdDscd(input.getAtsStaWkdDscd());
			}
			iChidAcno.setNewAm(0); 																		// 신규금액
			iChidAcno.setCusDgnPrdNm(acnoName);													// 고객지정상품명
			iChidAcno.setPrdDesOupYn("N");																// 상품설명출력여부 : N
		
			if (logger.isDebugEnabled()) {
				logger.debug("SHRMNPWallBiz_COM insertBscWallSaf 자계좌생성 input :: {} ", iChidAcno);
			}
			
			SHRMNPWallBizInsertMnpChidAcno_DODT mnpChidRst = this.insertMnpChidAcno(iChidAcno);
			
			if (logger.isDebugEnabled()) {
				logger.debug("SHRMNPWallBiz_COM insertBscWallSaf 자계좌생성 output :: {} ", mnpChidRst);
			}
			String newAcno = mnpChidRst.getNewAcno();
			isErrorPass = true;
			//계좌 등록 이후 프로세스 실패시 pass
			/***************************출금 계좌 등록********************************/
			if(StringUtils.isNotEmpty(newAcno)) {
				SHRMNPWallBizInsertWdrAcno_DIDT iWdrAcno = new SHRMNPWallBizInsertWdrAcno_DIDT();
				iWdrAcno.setAcno(newAcno);
				
				if(logger.isDebugEnabled()) {
					logger.debug("SHRMNPWallBiz_COM 머니클립자계좌등록 + 출금계좌 등록 didt  {} ::: ", iWdrAcno);
				}
				  
				SHRMNPWallBizInsertWdrAcno_DODT wdrAcnoRgstRst = this.insertWdrAcno(iWdrAcno);
				
				if(logger.isDebugEnabled()) {
					logger.debug("SHRMNPWallBiz_COM 머니클립자계좌등록 + 출금계좌 등록 dodt {} ::: ", wdrAcnoRgstRst);
				}
			}
			
			if ("1".equals(input.getAcnoTyp())) {
				/********************지갑 노출 순서 등록********************/
				SHRMNPWallBizInsertMnyClpWallExpsSeq_DIDT shrDidt = new SHRMNPWallBizInsertMnyClpWallExpsSeq_DIDT();
				shrDidt.setDpsInpAcno(input.getDpsInpAcno()); // 수신입력계좌번호
				shrDidt.setWallAcno(newAcno); // 지갑계좌번호
				shrDidt.setIconNo(iconNo); // 아이콘코드
				shrDidt.setWallNm(acnoName); // 지갑명
								
				if (logger.isDebugEnabled()) {
					logger.debug("SHRMNPWallBiz_COM insertBscWallSaf  자계좌생성 + 노출순서등록 didt ::: {}", shrDidt);
				}
				
				insertMnyClpWallExpsSeq(shrDidt);
				
				if (logger.isDebugEnabled()) {
					logger.debug("SHRMNPWallBiz_COM insertBscWallSaf  자계좌생성 + 노출순서등록완료 :::");
				}
			}
			
			/********************계좌 별명 관리 ********************/
			SHRActNmIDT_DTO shrActNmIdt = new SHRActNmIDT_DTO();
			shrActNmIdt.setAcno(newAcno); // 계좌번호
			shrActNmIdt.setByactNm(acnoName); // 계좌별명
			shrActNmIdt.setSendNmUseYn("N");
			shrActNmIdt.setSendNm("1".equals(input.getAcnoTyp()) ? "머니클립 지갑" : "머니클립 금고");
			
			if (logger.isDebugEnabled()) {
				logger.debug("SHRMNPWallBiz_COM insertBscWallSaf 자계좌생성 + 계좌별명관리 input :: {} ", shrActNmIdt);
			}
			SHRActNmODT_DTO actNmMngResult = shrBSCActNmMng_COM.mergeActNm(shrActNmIdt);
			
			if (logger.isDebugEnabled()) {
				logger.debug("SHRMNPWallBiz_COM insertBscWallSaf 자계좌생성 + 계좌별명관리 output :: {} ", actNmMngResult);
			}
			
			output.setNewAcno(newAcno); 	// 신규계좌번호
			output.setPrcRtcd("0000"); 		// 처리결과코드
			output.setPrcRstTxt("성공"); 	// 처리결과내용
			
			if (logger.isDebugEnabled()) {
				logger.debug("SHRMNPWallBiz_COM insertBscWallSaf 자계좌생성 output :: {} ", output);
			}
			
			//전계좌세션 갱신 요청 24.11.19 
			shrAllActInqTbk_COM.selectSessActList(SHRBSCInquiryConstant.BSC_ACT_LIST_INQ_DIS_ALL, true);
		} catch(WFApplicationException e){
			logger.error("머니클립 자계좌 생성 오류 :: {}", e);
			Object[] args = e.getArguments();
			if (!isErrorPass) {
				//계좌 생성 오류 발생
				args = e.getDetailArguments();
				throw new WFApplicationException("FNSE0006", new Object[] {args[0].toString()} , new Object[] {args[0].toString()});
			}
			//무조건 성공으로 수정
			output.setPrcRtcd("0000"); 		// 처리결과코드
			output.setPrcRstTxt(args[0].toString()); 	// 처리결과내용
		} catch(Exception e){
			logger.error("머니클립 자계좌 생성 오류::: {}", e);
			throw new WFApplicationException("FNSE0006", new Object[] {"9999"} , new Object[] {e.getMessage()});
		} 		
		
		return output;
	}
	
	/**
	 * 머니클립 생성 지갑 노출 순서 DB 등록 쉐어 컴포넌트
	 * 
	 * @param input 머니클립지갑노출순서등록.입력.IO
	 * @return 머니클립지갑노출순서등록.출력.IO {prcRtcd = (정상: "0000"), prcRstTxt : 처리결과메세지},  오류 WFApplicationException
	 */
	@BxmCategory(logicalName = "머니클립 지갑 노출순서 등록", description = "머니클립 지갑 노출순서 등록하는 컴포넌트", author = "90191355")
	private SHRMNPWallBizInsertMnyClpWallExpsSeq_DODT insertMnyClpWallExpsSeq(SHRMNPWallBizInsertMnyClpWallExpsSeq_DIDT input) {
		/**
		 * @BXMType GetBean
		 */
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		
		SHRMNPWallBizInsertMnyClpWallExpsSeq_DODT output = new SHRMNPWallBizInsertMnyClpWallExpsSeq_DODT();
		
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession();
		
		try {
			String itcsno = currentCust.getItcsno();
			String userId = currentCust.getUserId();
			
			MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMSelectMnyClpExpsSeqMng_DIDT selDidt = new MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMSelectMnyClpExpsSeqMng_DIDT();
			selDidt.setItcsno(itcsno); // 통합고객번호
			selDidt.setMnyClpMoAcno(input.getDpsInpAcno()); // 머니클립모계좌번호
			
			if (logger.isDebugEnabled()) {
				logger.debug("SHRMNPWallBiz_COM insertMnyClpWallExpsSeq didt ::: {}", selDidt);
			}
	
			//노출순서 조회
			MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMSelectMnyClpExpsSeqMng_DODT selDodt = this.selectMnyClpExpsSeqMng(selDidt);
			SHRMNPWallBizMNPBscInf_DTO maxDodt = selDodt.getMnpBscInfGrid().stream().filter(item -> "1".equals(item.getMnyClpChidActDscd()))
					.max((a, b)-> Integer.valueOf(a.getMnyClpChidActExpsSeq()) - Integer.valueOf(b.getMnyClpChidActExpsSeq())).orElse(null);
			
			if (logger.isDebugEnabled()) {
				logger.debug("SHRMNPWallBiz_COM insertMnyClpWallExpsSeq 노출 지갑 목록 조회 완료 dodt ::: {}", selDodt);
			}
	
			int nextSeq = maxDodt == null ? 1 : Integer.valueOf(maxDodt.getMnyClpChidActExpsSeq()) + 1;
			//노출순서 등록
			MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMInsertMnyClpExpsSeqMng_DIDT addDidt = new MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMInsertMnyClpExpsSeqMng_DIDT();
			addDidt.setItcsno(itcsno); // 통합고객번호
			addDidt.setMnyClpChidAcno(input.getWallAcno()); // 머니클립지갑계좌번호
			addDidt.setMnyClpMoAcno(input.getDpsInpAcno()); // 머니클립모계좌번호
			addDidt.setMnyClpChidActDscd("1"); // 머니클립자계좌구분코드
			addDidt.setMnyClpChidActNm(input.getWallNm()); // 머니클립자계좌명
			addDidt.setMnyClpChidActExpsSeq(String.valueOf(nextSeq)); // 머니클립자계좌노출순서
			addDidt.setMnyClpChidActIconNm(input.getIconNo()); // 머니클립자계좌아이콘명
			addDidt.setRgpeId(userId); // 등록자ID
			addDidt.setAmdpeId(userId); // 수정자ID
			
			if (logger.isDebugEnabled()) {
				logger.debug("SHRMNPWallBiz_COM insertMnyClpWallExpsSeq 노출 순서 등록 didt ::: {}", addDidt);
			}
			
			this.insertMnyClpExpsSeqMng(addDidt);
			
			if (logger.isDebugEnabled()) {
				logger.debug("SHRMNPWallBiz_COM insertMnyClpWallExpsSeq 노출 순서 등록 완료 :::");
			}
			
			output.setPrcRtcd("0000"); 		// 처리결과코드
			output.setPrcRstTxt("등록 완료"); 	// 처리결과내용
		} catch(WFApplicationException e){
			logger.error("insertMnyClpWallExpsSeq WFApplicationException :: {}", e);
			Object[] args = e.getArguments();
			
			throw new WFApplicationException("FNSE0006", new Object[] {e.getCode()} , new Object[] {args[0].toString()});
		} catch(Exception e){
			logger.error("insertMnyClpWallExpsSeq Exception ::: {}", e);
		
			throw new WFApplicationException("FNSE0006", new Object[] {"9999"} , new Object[] {e.getMessage()});
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
	private SHRMNPWallBizInsertMnpChidAcno_DODT insertMnpChidAcno(SHRMNPWallBizInsertMnpChidAcno_DIDT input
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
		SHRMNPWallBizInsertMnpChidAcno_DODT output= new SHRMNPWallBizInsertMnpChidAcno_DODT();

		//세션고객정보
		MMH_CUST_INFO currentCust = sHRMMHCustSession_COM.getCustInfoSession();
		CMM_CURRENT_CUST loginCust = shrCMMLoginSession_COM.getLoginSession();
		if(logger.isDebugEnabled()) {
			logger.debug("currentCust ====== {} ::: ", currentCust);
			logger.debug("loginCust ====== {} ::: ", loginCust);
		} 
		
		if(logger.isDebugEnabled()) {
			logger.debug("SHRMNPWallBiz_COM 머니클립자계좌등록 input {} ::: ", input);
		}
		
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
	        iIBSMR0004253.setPdcd(input.getPdcd()); // 상품코드
	        iIBSMR0004253.setAtsYn(input.getAtsYn()); // 자동이체여부
	        iIBSMR0004253.setAtsStaDt(input.getAtsStaDt()); // 자동이체시작일자
	        iIBSMR0004253.setAtsEndDt(input.getAtsEndDt()); // 자동이체종료일자
	        iIBSMR0004253.setAtsAm(input.getAtsAm()); // 자동이체금액
	        iIBSMR0004253.setAtsDd(input.getAtsDd()); // 자동이체일
	        iIBSMR0004253.setAtsCycd(input.getAtsCycd()); // 자동이체주기코드
	        iIBSMR0004253.setAimFdNm(input.getAimFdNm()); // 목적자금명
	        iIBSMR0004253.setDinsvGoalAm(input.getDinsvGoalAm()); // 꿈적금목표금액
	        iIBSMR0004253.setInsvAcldTsStaWkdDscd(input.getInsvAcldTsStaWkdDscd()); // 적금적립이체시작요일구분코드
	        iIBSMR0004253.setActPwnoUsgYn("N"); // 계좌비밀번호사용여부
	        iIBSMR0004253.setCsno(currentCust.getCsno()); // 고객번호
	        iIBSMR0004253.setAtsXtYn("2"); // 자동이체제외여부: 2 일 경우 제외처리
	        iIBSMR0004253.setNewAm(input.getNewAm()); // 신규금액 0원
	        iIBSMR0004253.setPrdDesOupYn(input.getPrdDesOupYn()); // 상품설명출력여부
	        iIBSMR0004253.setCusDntnAscnCd(input.getCusDntnAscnCd()); // 고객기부단체코드 > 아이콘
	        iIBSMR0004253.setCusDgnPrdNm(input.getCusDgnPrdNm()); // 고객지정상품명

	        if(logger.isDebugEnabled()) {
				logger.debug("SHRMNPWallBiz_COM 머니클립자계좌등록 iIBSMR0004253 {} ::: ", iIBSMR0004253);
			}
			
	        IBSMR0004253_ODT oIBSMR0004253= new IBSMR0004253_ODT();
	        
			WFInfResponse<IBSMR0004253_ODT> mcaOutput = sHRIBSMR0004253_COM.callTrx(iIBSMR0004253, interfaceCfg);
	
			oIBSMR0004253 = mcaOutput.getResponseData();
			
			if(logger.isDebugEnabled()) {
				logger.debug("SHRMNPWallBiz_COM 머니클립자계좌등록 oIBSMR0004253  {} ::: ", oIBSMR0004253);
			}
			/**
			 * @BXMType IF
			 * 정상 조회 처리여부
			 */
			output.setNewAcno(oIBSMR0004253.getNewAcno()); // 신규계좌번호
			output.setPrcRtcd("0000");
			output.setPrcRstTxt("정상적으로 처리 되었습니다.");
		} catch(WFApplicationException e){
			logger.error("IBSMR0004253 오류 :: {}", e);
			Object[] args = e.getArguments();
			
			throw new WFApplicationException("FNSE0006", new Object[] {e.getCode()} , new Object[] {args[0].toString()});
		} catch(Exception e){
			logger.error("IBSMR0004253 오류 ::: {}", e);
		
			throw new WFApplicationException("FNSE0006", new Object[] {"9999"} , new Object[] {e.getMessage()});
		} 	
		
		if(logger.isDebugEnabled()) {
			logger.debug("SHRMNPWallBiz_COM 머니클립모계좌등록 output  {} ::: ", output);
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
	private SHRMNPWallBizInsertWdrAcno_DODT insertWdrAcno(SHRMNPWallBizInsertWdrAcno_DIDT input
	)
	{
		/**
		* @BXMType GetBean
		*/
		sHRMMHCustSession_COM = WFApplicationContext.getBean(sHRMMHCustSession_COM, SHRMMHCustSession_COM.class);
		sHRIBSMR0002963_COM= WFApplicationContext.getBean(sHRIBSMR0002963_COM, SHRIBSMR0002963_COM.class);
		
		SHRMNPWallBizInsertWdrAcno_DODT output = new SHRMNPWallBizInsertWdrAcno_DODT();
		
		//세션고객정보
		MMH_CUST_INFO currentCust = sHRMMHCustSession_COM.getCustInfoSession();
		CMM_CURRENT_CUST loginCust = shrCMMLoginSession_COM.getLoginSession();
		if(logger.isDebugEnabled()) {
			logger.debug("currentCust ====== {} ::: ", currentCust);
			logger.debug("loginCust ====== {} ::: ", loginCust);
		} 
		
		if(logger.isDebugEnabled()) {
			logger.debug("SHRMNPWallBiz_COM 머니클립출금계좌등록 input {} ::: ", input);
		}
		
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
			
			/*********************************/
			//머니클립 자계좌 출금계좌 등록시에만 필요한 부분
			WFNciHeader wfnCiHeader = interfaceCfg.getNciHeader();
			wfnCiHeader.setEsignOmitDscd("8");
			wfnCiHeader.setEbnkUtzpeNo(loginCust.getUserId());
			interfaceCfg.setNciHeader(wfnCiHeader);
			/*********************************/	        
	        IBSMR0002963_IDT iIBSMR0002963 = new IBSMR0002963_IDT();
	        
			iIBSMR0002963.setEbnkUtzpeNo(loginCust.getUserId());
			iIBSMR0002963.setItcsno(loginCust.getItcsno());
			iIBSMR0002963.setEbnkActDscd("01");
			iIBSMR0002963.setCusWdrAcno(input.getAcno());
			iIBSMR0002963.setCnt(1);
			
			List<IBSMR0002963_GRID_IDT> grid = new ArrayList<IBSMR0002963_GRID_IDT>();
			IBSMR0002963_GRID_IDT gridItem = new IBSMR0002963_GRID_IDT();
			gridItem.setEbnkActDscd("01");
			gridItem.setWdrActUnitRcvDgnYn("N");
			gridItem.setBrcActYn("N");
			gridItem.setBkwAcno(input.getAcno());

			grid.add(gridItem);
			iIBSMR0002963.setGrid(grid);
			
	        if(logger.isDebugEnabled()) {
				logger.debug("SHRMNPWallBiz_COM 머니클립출금계좌등록 iIBSMR0002963 {} ::: ", iIBSMR0002963);
			}
			
	        IBSMR0002963_ODT oIBSMR0002963= new IBSMR0002963_ODT();
	        
			WFInfResponse<IBSMR0002963_ODT> mcaOutput = sHRIBSMR0002963_COM.callTrx(iIBSMR0002963, interfaceCfg);
			oIBSMR0002963 = mcaOutput.getResponseData();
			
			if(logger.isDebugEnabled()) {
				logger.debug("SHRMNPWallBiz_COM 머니클립출금계좌등록 oIBSMR0002963  {} ::: ", oIBSMR0002963);
			}
			/**
			 * @BXMType IF
			 * 정상 조회 처리여부
			 */
			
			if(!mcaOutput.hasError()){
				output.setPrcRtcd("0000");
				output.setPrcRstTxt("정상적으로 처리 되었습니다.");
			} else {
				output.setPrcRtcd("9999");
			}
			
		} catch(WFApplicationException e){
			logger.error("IBSMR0002963 오류 :: {}", e);
			Object[] args = e.getArguments();
			
			throw new WFApplicationException("FNSE0006", new Object[] {e.getCode()} , new Object[] {args[0].toString()});
		} catch(Exception e){
			logger.error("IBSMR0002963 오류 ::: {}", e);
		
			throw new WFApplicationException("FNSE0006", new Object[] {"9999"} , new Object[] {e.getMessage()});
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
	private MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMSelectMnyClpExpsSeqMng_DODT selectMnyClpExpsSeqMng(MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMSelectMnyClpExpsSeqMng_DIDT input
	)
	{
		/**
		* @BXMType GetBean
		*/
		shrMnyClpExpsSeqMng001_DBM= WFApplicationContext.getBean(shrMnyClpExpsSeqMng001_DBM, MNY_CLP_EXPS_SEQ_MNG_LDG001_DBM.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */
		MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMSelectMnyClpExpsSeqMng_DODT output= new MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMSelectMnyClpExpsSeqMng_DODT();

		if(logger.isDebugEnabled()) {
			logger.debug("SHRMNPWallBiz_COM 머니클립노출순서기본조회 input {} ::: ", input);
		}
		
		List<SHRMNPWallBizMNPBscInf_DTO> bscInfDtoList = new ArrayList<>();
		
		bscInfDtoList = shrMnyClpExpsSeqMng001_DBM.selectMnyClpExpsSeqMng(input);		
		
		output.setMnpBscInfGrid(bscInfDtoList);
	
		if(logger.isDebugEnabled()) {
			logger.debug("SHRMNPWallBiz_COM 머니클립노출순서기본조회 output  {} ::: ", output);
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
	private int insertMnyClpExpsSeqMng(MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMInsertMnyClpExpsSeqMng_DIDT input
	)
	{
		/**
		* @BXMType GetBean
		*/
		shrMnyClpExpsSeqMng001_DBM= WFApplicationContext.getBean(shrMnyClpExpsSeqMng001_DBM, MNY_CLP_EXPS_SEQ_MNG_LDG001_DBM.class);

		/**
		 * @BXMType VariableDeclaration
		 */

		if(logger.isDebugEnabled()) {
			logger.debug("SHRMNPWallBiz_COM 머니클립노출순서기본조회 input {} ::: ", input);
		}
		
		int insertCnt = shrMnyClpExpsSeqMng001_DBM.insertMnyClpExpsSeqMng(input);		
	
		
		if(logger.isDebugEnabled()) {
			logger.debug("SHRMNPWallBiz_COM 머니클립노출순서기본조회 insertCnt  {} ::: ", insertCnt);
		}
		
		return insertCnt;
	}
}
