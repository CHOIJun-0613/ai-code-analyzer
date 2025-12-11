package com.skbank.sml.fns.mnp.svc;

import bxm.common.annotaion.BxmCategory;
import bxm.common.util.StringUtils;
import fwk.skbank.asis.adaptor.dto.request.WFInterfaceCfg;
import fwk.skbank.asis.adaptor.dto.response.WFInfResponse;
import fwk.skbank.online.context.WFApplicationContext;
import fwk.skbank.online.exception.app.WFApplicationException;
import fwk.skbank.online.util.WFStringUtils;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.skbank.sml.cmm.shr.com.SHRCMMInterfaceCfg_COM;
import com.skbank.sml.cmm.shr.com.SHRCMMLoginSession_COM;
import com.skbank.sml.cmm.shr.com.SHRMMHCustSession_COM;
import com.skbank.sml.cmm.shr.dto.CMM_CURRENT_CUST;
import com.skbank.sml.cmm.shr.dto.MMH_CUST_INFO;
import com.skbank.sml.fns.mnp.com.MNPMnyPinBscMng_COM;
import com.skbank.sml.fns.mnp.com.MNPMnyPinFncTrn_COM;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinBscMngDeleteMnpWallLst_IDT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinBscMngDeleteMnpWallLst_ODT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinBscMngSelectMnpBscInf_IDT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinBscMngSelectMnpBscInf_ODT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinBscMngSelectMnpSafIntInf_IDT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinBscMngSelectMnpSafIntInf_ODT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinBscMngUpdateWallSeq_IDT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinBscMngUpdateWallSeq_ODT;
import com.skbank.sml.fns.mnp.dto.MNPBscInf_DTO;
import com.skbank.sml.fns.mnp.dto.MNPDeleteChidAcnoInfLstOut_DTO;
import com.skbank.sml.fns.mnp.dto.MNPDeleteChidAcnoInfLst_DTO;
import com.skbank.sml.fns.mnp.dto.MNPMnyPinBscMngSelectMnpChidAcno_DTO;
import com.skbank.sml.fns.mnp.dto.MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMDeleteMnyClpExpsSeqMngList_DIDT;
import com.skbank.sml.fns.mnp.dto.MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMInsertMnyClpExpsSeqMng_DIDT;
import com.skbank.sml.fns.mnp.dto.MnyPinBscMngSelectMnpChidAcno_DIDT;
import com.skbank.sml.fns.mnp.dto.MnyPinBscMngSelectMnpChidAcno_DODT;
import com.skbank.sml.ifi.mca.eims3.dto.IBSMR0002963_ODT;
import com.skbank.sml.ifi.mca.eims5.dto.IBSMR0006155_GRID_ODT;
import com.skbank.sml.ifi.mca.eims8.dto.IBSMR0002878_IDT;
import com.skbank.sml.ifi.mca.eims8.dto.IBSMR0002878_ODT;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0002878_COM;

/**
 * 1.업무명 : NEWWON 대분류 금융서비스
 * 2.단위업무명 : NEWWON 중분류 통합알림함
 * 3.프로그램명 : 머니클립기본관리서비스
 * 4.설명 : 
 * 
 * @Class MNPMnyPinBscMng_SVC.java
 * @author 90190263
 * @since 2024.08.06
 * @version 1.0
 */		
@Service
@BxmCategory(logicalName="머니클립기본관리서비스", description="머니클립의 기본적인 정보를 관리하는 서비스")
public class MNPMnyPinBscMng_SVC {
	private Logger logger= LoggerFactory.getLogger(getClass());

	/**
	 * 머니클립기본관리 컴포넌트
	 */
	private MNPMnyPinBscMng_COM mNPMnyPinBscMng_COM;
	
	/**
	 * 고객 세션 컴포넌트
	 */
	private SHRMMHCustSession_COM sHRMMHCustSession_COM;
	/**
	 * 공통 세션 컴포넌트
	 */
	private SHRCMMLoginSession_COM sHRCMMLoginSession_COM;
	/**
	 * 공통 세션 컴포넌트
	 */
	private SHRIBSMR0002878_COM sHRIBSMR0002878_COM;
	/**
	 * WFInterfaceCfg 생성 컴포넌트
	 */
	private SHRCMMInterfaceCfg_COM sHRCMMInterfaceCfg_COM;
	
	
	/**
	 * 머니클립기본정보조회
	 * 
	 * @param input 머니클립기본정보조회 입력IO
	 * @return 머니클립기본정보조회 출력IO
	 */
	@BxmCategory(logicalName = "머니클립기본정보조회", description = "머니클립의 기본 정보를 조회한다.", author="90190263")
	public MNPMnyPinBscMngSelectMnpBscInf_ODT selectMnpBscInf(MNPMnyPinBscMngSelectMnpBscInf_IDT input) {
		/**
		 * @BXMType GetBean
		 */
		sHRMMHCustSession_COM = WFApplicationContext.getBean(sHRMMHCustSession_COM, SHRMMHCustSession_COM.class);
		sHRCMMLoginSession_COM = WFApplicationContext.getBean(sHRCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		mNPMnyPinBscMng_COM = WFApplicationContext.getBean(mNPMnyPinBscMng_COM, MNPMnyPinBscMng_COM.class);
		mNPMnyPinBscMng_COM = WFApplicationContext.getBean(mNPMnyPinBscMng_COM, MNPMnyPinBscMng_COM.class);
		
		/** 
		 * 로직 추가
		 */
		MNPMnyPinBscMngSelectMnpBscInf_ODT output = new MNPMnyPinBscMngSelectMnpBscInf_ODT();
		
		MMH_CUST_INFO custInfo = sHRMMHCustSession_COM.getCustInfoSession();

		if (sHRCMMLoginSession_COM.istLogin()) {
			MnyPinBscMngSelectMnpChidAcno_DIDT iChidAcnoInf = new MnyPinBscMngSelectMnpChidAcno_DIDT();
			iChidAcnoInf.setInqDscd("01"); 								// 거래구분코드
			iChidAcnoInf.setDpsInpAcno(input.getDpsInpAcno()); // 수신입력계좌번호
			
			MnyPinBscMngSelectMnpChidAcno_DODT oChidAcnoInf= mNPMnyPinBscMng_COM.selectMnpBscInf(iChidAcnoInf);
			
			if (logger.isDebugEnabled()) {
				logger.debug("90190263 머니클립기본정보조회 SVC oChidAcnoInf :: {} ", oChidAcnoInf);
			}
			
			output.setDpsInpAcno(oChidAcnoInf.getDpsInpAcno()); 			// 수신입력계좌번호
			output.setDppdNm(oChidAcnoInf.getDppdNm()); 					// 수신상품명
			output.setDpacBal(oChidAcnoInf.getDpacBal()); 					// 수신계좌잔액
			output.setGridCnt(oChidAcnoInf.getGridCnt()); 						// 그리드건수
			
			// 머니클립.자.계좌.조회.컴포넌트.공통.출력.IO
			List<MNPMnyPinBscMngSelectMnpChidAcno_DTO> outDataList = new ArrayList<>();
			for( IBSMR0006155_GRID_ODT oChidAcnoList : oChidAcnoInf.getGrid()) {
				if(oChidAcnoList != null) {
					if (logger.isDebugEnabled()) {
						logger.debug("90190263 머니클립기본정보조회 SVC oChidAcnoList :: {} ", oChidAcnoList);
					}
					MNPMnyPinBscMngSelectMnpChidAcno_DTO outData = new MNPMnyPinBscMngSelectMnpChidAcno_DTO();
					
					outData.setMnyClpChidAcno(oChidAcnoList.getMnyClpChidAcno()); 					// 머니클립자계좌번호
					outData.setMnyClpChidActNm(oChidAcnoList.getMnyClpChidActNm());	 			// 머니클립자계좌명
					outData.setDpacCtBal(oChidAcnoList.getDpacCtBal());									// 수신계좌현재잔액
					outData.setMnyClpChidActDscd(oChidAcnoList.getMnyClpChidActDscd()); 			// 머니클립자계좌구분코드
					outData.setBscIntAm(oChidAcnoList.getBscIntAm()); 										// 기본이자금액
					outData.setActAplIrt(oChidAcnoList.getActAplIrt()); 										// 계좌적용이율
					outData.setMnyClpChidActCreDt(oChidAcnoList.getMnyClpChidActCreDt()); 		// 머니클립자계좌생성일자
					outData.setMnyClpIconNo(oChidAcnoList.getMnyClpIconNo()); 							// 머니클립아이콘번호
					outData.setMnyClpGoalAm(oChidAcnoList.getMnyClpGoalAm()); 						// 머니클립목표금액
					
					outDataList.add(outData);
				}
			}
			
			selectMnpSafIntInf();
			
			output.setGridCnt(outDataList.size());
			output.setGrid(outDataList);
		} else {
			//  로그인 세션이 존재하지 않습니다.
			throw new WFApplicationException("CMME0018");
		}
		
		return output;
	}
	
	/**
	 * 머니클립의 금고 이자 정보를 조회한다
	 * 
	 * @param input 머니클립기본정보조회 입력IO
	 * @return 머니클립기본정보조회 출력IO
	 */
	@BxmCategory(logicalName = "머니클립금고이자조회", description = "머니클립의 금고 이자 정보를 조회한다.", author="90190263")
	public MNPMnyPinBscMngSelectMnpSafIntInf_ODT selectMnpSafIntInf() {
		/**
		 * @BXMType GetBean
		 */
		mNPMnyPinBscMng_COM = WFApplicationContext.getBean(mNPMnyPinBscMng_COM, MNPMnyPinBscMng_COM.class);
		sHRIBSMR0002878_COM = WFApplicationContext.getBean(sHRIBSMR0002878_COM, SHRIBSMR0002878_COM.class);
		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class);
		
		/** 
		 * 로직 추가
		 */
		MNPMnyPinBscMngSelectMnpSafIntInf_ODT output = new MNPMnyPinBscMngSelectMnpSafIntInf_ODT();
		
		if (logger.isDebugEnabled()) {
			logger.debug("90190263 머니클립금고이자조회 SVC input :: {} ");
		}
		
//		SHRIBSMR0002878_COM
		/**
		 * 1) 002-510-000-0000 (머니클립 통장)
		 * 2) 002-510-001-0000 (머니클립 지갑)
		 * 3) 002-510-002-0000 (머니클립 금고)
		 * 4) 000-510-000-0000 (머니클립 통장)
		 * */
		IBSMR0002878_IDT ibsmr2878Idt = new IBSMR0002878_IDT();
		ibsmr2878Idt.setPdcd("0025100010000");
		ibsmr2878Idt.setTrnDscd("PRDR");
		ibsmr2878Idt.setPrdClfDscd("");
		
	//  MCA WFInterfaceCfg 객체 획득
		WFInterfaceCfg interfaceCfg  = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg();
		interfaceCfg.setInterfaceId("IBSMR0002878");
		
		WFInfResponse<IBSMR0002878_ODT> mcaOutput = sHRIBSMR0002878_COM.callTrx(ibsmr2878Idt, interfaceCfg);
		
		IBSMR0002878_ODT ibsmr2878Odt = mcaOutput.getResponseData();
		
		if (logger.isDebugEnabled()) {
			logger.debug("90190263 머니클립금고이자조회 ibsmr2878Odt :: {} ", ibsmr2878Odt);
		}
		
		
		if (logger.isDebugEnabled()) {
			logger.debug("90190263 머니클립금고이자조회 SVC output :: {} ", output);
		}
		
		return output;
	}
	
	/**
	 * 머니클립의 지갑 목록을 삭제한다.
	 * 
	 * @param input MNPMnyPinBscMngDeleteMnpWallLst_IDT 입력
	 * @return MNPMnyPinBscMngDeleteMnpWallLst_ODT 출력
	 */
	@BxmCategory(logicalName = "머니클립지갑목록삭제", description = "머니클립의 지갑 목록을 삭제한다.", author="90190263")
	public MNPMnyPinBscMngDeleteMnpWallLst_ODT deleteMnpWallLst(MNPMnyPinBscMngDeleteMnpWallLst_IDT input) {
		/**
		 * @BXMType GetBean
		 */
		sHRCMMLoginSession_COM = WFApplicationContext.getBean(sHRCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		mNPMnyPinBscMng_COM = WFApplicationContext.getBean(mNPMnyPinBscMng_COM, MNPMnyPinBscMng_COM.class);
		
		/** 
		 * 로직 추가
		 */
		MNPMnyPinBscMngDeleteMnpWallLst_ODT output = new MNPMnyPinBscMngDeleteMnpWallLst_ODT();
		
		if (sHRCMMLoginSession_COM.istLogin()) {
			try {
				MNPDeleteChidAcnoInfLst_DTO inDto = new MNPDeleteChidAcnoInfLst_DTO(); 
				inDto.setDpsInpAcno(input.getDpsInpAcno()); 					// 수신입력계좌번호
				inDto.setDpacBal(input.getDpacBal()); 								// 수신계좌잔액
				inDto.setGridCnt(input.getGridCnt()); 								// 그리드건수
				inDto.setGrid(input.getGrid()); 										// 머니클립.자.계좌.조회.컴포넌트.공통.출력.IO
				
				// 자계좌 삭제 컴포넌트 호출
				MNPDeleteChidAcnoInfLstOut_DTO outDto = mNPMnyPinBscMng_COM.deleteChidAcnoInfLst(inDto);
				
				output.setErrMsgId(outDto.getErrMsgId()); 						// 오류메시지ID
				output.setErrMsgTxt(outDto.getErrMsgTxt()); 					// 오류메시지내용
				
			} catch (WFApplicationException e) {
				// todo: 코드 및 문구 추가
				output.setErrMsgId("FNSE0035");
				output.setErrMsgTxt("지갑 삭제를 실패 하였습니다.");
			}
		} else {
			//  로그인 세션이 존재하지 않습니다.
			throw new WFApplicationException("CMME0018");
		}
		
		return output;
	}
	
	/**
	 * 머니클립의 지갑 순서를 수정한다 
	 * 
	 * @param input MNPMnyPinBscMngUpdateWallSeq_IDT 입력
	 * @return MNPMnyPinBscMngUpdateWallSeq_ODT 출력
	 */
	@BxmCategory(logicalName = "머니클립지갑순서수정", description = "머니클립의 지갑 순서를 수정한다.", author="90190263")
	public MNPMnyPinBscMngUpdateWallSeq_ODT updateWallSeq(MNPMnyPinBscMngUpdateWallSeq_IDT input) {
		/**
		 * @BXMType GetBean
		 */
		sHRCMMLoginSession_COM = WFApplicationContext.getBean(sHRCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		mNPMnyPinBscMng_COM = WFApplicationContext.getBean(mNPMnyPinBscMng_COM, MNPMnyPinBscMng_COM.class);
		
		/** 
		 * 로직 추가
		 */
		MNPMnyPinBscMngUpdateWallSeq_ODT output = new MNPMnyPinBscMngUpdateWallSeq_ODT();
		//세션고객정보
		CMM_CURRENT_CUST currentCust = sHRCMMLoginSession_COM.getLoginSession(); 
		
		if (sHRCMMLoginSession_COM.istLogin()) {
			String itcsno = currentCust.getItcsno();
			String userId = currentCust.getUserId();
			
			MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMDeleteMnyClpExpsSeqMngList_DIDT deleteDidt = new MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMDeleteMnyClpExpsSeqMngList_DIDT();
			
			deleteDidt.setItcsno(itcsno);												// 통합고객번호
			deleteDidt.setMnyClpMoAcno(input.getMnyClpMoAcno());		// 머니클립모계좌
			// 머니클립 지갑 목록 삭제
			int deleteCnt = mNPMnyPinBscMng_COM.deleteMnyClpExpsSeqMngList(deleteDidt);
			
			if (deleteCnt > 0) {
				int updateCnt = 1;
				for(MNPBscInf_DTO grid : input.getGrid()) {
					MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMInsertMnyClpExpsSeqMng_DIDT iClpExpsSeqChg = new MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMInsertMnyClpExpsSeqMng_DIDT();
					
					iClpExpsSeqChg.setItcsno(itcsno); 																	// 통합고객번호
					iClpExpsSeqChg.setMnyClpMoAcno(input.getMnyClpMoAcno()); 							// 머니클립모계좌번호
					iClpExpsSeqChg.setMnyClpChidAcno(grid.getMnyClpChidAcno()); 							// 머니클립자계좌번호
					iClpExpsSeqChg.setMnyClpChidActDscd(grid.getMnyClpChidActDscd()); 					// 머니클립자계좌구분코드
					iClpExpsSeqChg.setMnyClpChidActNm(grid.getMnyClpChidActNm()); 						// 머니클립자계좌명
					iClpExpsSeqChg.setMnyClpChidActExpsSeq(String.valueOf(updateCnt)); 				// 머니클립자계좌노출순서
					iClpExpsSeqChg.setMnyClpChidActIconNm(grid.getMnyClpChidActIconNm()); 			// 머니클립자계좌아이콘명
					iClpExpsSeqChg.setRgpeId(userId);																	// 등록자ID
					iClpExpsSeqChg.setAmdpeId(userId);																// 수정자ID
					
					mNPMnyPinBscMng_COM.insertMnyClpExpsSeqMng(iClpExpsSeqChg);
					
					updateCnt ++;
				}
				
				// 기존에 존재한 계좌 목록 삭제 건수와 새로 등록한 계좌 목록 건수 비교 
				if(deleteCnt != (updateCnt - 1)) {
					// todo: 오류코드 새로 추가해야 함.
					throw new WFApplicationException("CECE0069");
				}
			}
			// todo: 코드 및 내용 추가
			output.setErrMsgId("FNSE0002");
			output.setErrMsgTxt("지갑 순서를 변경 하였습니다.");
			
			if (logger.isDebugEnabled()) {
				logger.debug("90190263 머니클립지갑순서수정 SVC output :: {} ", output);
			}
		} else {
			//  로그인 세션이 존재하지 않습니다.
			throw new WFApplicationException("CMME0018");
		}
		
		return output;
	}
}
