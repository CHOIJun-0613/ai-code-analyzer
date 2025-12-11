package com.skbank.sml.fns.pbp.com;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import com.skbank.sml.bsc.shr.com.SHRAllActInqTbk_COM;
import com.skbank.sml.bsc.shr.cst.cstt.SHRBSCInquiryConstant;
import com.skbank.sml.cmm.shr.com.SHRCMMInterfaceCfg_COM;
import com.skbank.sml.fns.pbp.dto.PBPPbokSplitBscMngCrudSrvcBscMng_DIDT;
import com.skbank.sml.fns.pbp.dto.PBPPbokSplitBscMngCrudSrvcBscMng_DODT;
import com.skbank.sml.fns.pbp.dto.PBPPbokSplitBscMngCudSubSpceMng_DIDT;
import com.skbank.sml.fns.pbp.dto.PBPPbokSplitBscMngCudSubSpceMng_DODT;
import com.skbank.sml.fns.pbp.dto.PBPPbokSplitBscMngUpdateSpceAmMv_DIDT;
import com.skbank.sml.fns.pbp.dto.PBPPbokSplitBscMngUpdateSpceAmMv_DODT;
import com.skbank.sml.ifi.mca.eims2.dto.IBSMR0006022_IDT;
import com.skbank.sml.ifi.mca.eims2.dto.IBSMR0006022_ODT;
import com.skbank.sml.ifi.mca.eims3.dto.IBSMR0006023_IDT;
import com.skbank.sml.ifi.mca.eims3.dto.IBSMR0006023_ODT;
import com.skbank.sml.ifi.mca.eims4.dto.IBSMR0006024_IDT;
import com.skbank.sml.ifi.mca.eims4.dto.IBSMR0006024_ODT;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0006022_COM;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0006023_COM;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0006024_COM;

import bxm.common.annotaion.BxmCategory;
import fwk.skbank.asis.adaptor.dto.request.WFInterfaceCfg;
import fwk.skbank.asis.adaptor.dto.response.WFInfResponse;
import fwk.skbank.online.context.WFApplicationContext;
import fwk.skbank.online.exception.app.WFApplicationException;

/**
 * 1.업무명 : 금융서비스
 * 2.단위업무명 : NEWWON 중분류 통장쪼개기
 * 3.프로그램명 : 통장.쪼개기.일반.관리.컴포넌트
 * 4.설명 : 통장 쪼개기 일반 관리 컴포넌트
 * -기본 원장 관리 (등록 : 서비스가입, 해지 : 서비스탈퇴, 조회, 수정)
 * -공간 원장 (목표 포함) (등록, 수정, 해제)
 * -금액 이동
 * 
 * @Class PBPPbokSpceDtlMng_COM.java
 * @author 90191355
 * @since 2024.05.03
 * @version 1.0
 */		
@Component
@BxmCategory(logicalName=" 통장.쪼개기.일반.관리.컴포넌트", description="통장쪼개기 일반 관리하는 컴포넌트")
public class PBPPbokSplitBscMng_COM {
	private Logger logger= LoggerFactory.getLogger(getClass());
	
	/**
	 * WFInterfaceCfg 생성 컴포넌트
	 */
	private SHRCMMInterfaceCfg_COM sHRCMMInterfaceCfg_COM;
	/**
	 * SHRIBSMR0006022_COM 통장쪼개기 기본원장 관리
	 */
	private SHRIBSMR0006022_COM sHRIBSMR0006022_COM;
	/**
	 * SHRIBSMR0006023_COM 통장쪼개기 공간원장 관리
	 */
	private SHRIBSMR0006023_COM sHRIBSMR0006023_COM;
	/**
	 * SHRIBSMR0006024_COM 통장쪼개기 메인-서브 금액 이동
	 */
	private SHRIBSMR0006024_COM sHRIBSMR0006024_COM;
	/**
	 * 전계좌 세션 갱신
	 */
	private SHRAllActInqTbk_COM shrAllActInqTbk_COM;
	
	/**
	 * 통장쪼개기 공간의 금액을 이동
	 * 거래구분코드 1 메인출금 2서브출금
	 * @param input 공간상세금액입금정보.DBM.입력.IO
	 * @return 공간상세금액입금정보.DBM.출력.IO
	 */
	@BxmCategory(logicalName="공간.금액.이동.수정", description="통장쪼개기 공간의 금액을 이동하는 컴포넌트", author="90191355")
	public PBPPbokSplitBscMngUpdateSpceAmMv_DODT updateSpceAmMv(PBPPbokSplitBscMngUpdateSpceAmMv_DIDT input) {
		
		String MAIN_SPACE_NO = "000000";
		/**
		 * @BXMType VariableDeclaration
		 */
		PBPPbokSplitBscMngUpdateSpceAmMv_DODT output= new PBPPbokSplitBscMngUpdateSpceAmMv_DODT();
		/**
		* @BXMType GetBean
		*/
		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class);
		sHRIBSMR0006024_COM = WFApplicationContext.getBean(sHRIBSMR0006024_COM, SHRIBSMR0006024_COM.class);
		
		try {
			WFInterfaceCfg interfaceCfg = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg();
			interfaceCfg.setInterfaceId("IBSMR0006024");

			String trnDscd = input.getTrnDscd();
			String spaceNo = "1".equals(trnDscd) ? MAIN_SPACE_NO : input.getSpceSrno();
			String ptnSpaceNo = "1".equals(trnDscd) ? input.getSpceSrno() : MAIN_SPACE_NO;
			
			IBSMR0006024_IDT iIBSMR0006024 = new IBSMR0006024_IDT();
			iIBSMR0006024.setTrnDscd(trnDscd); //거래구분코드 1 메인출금 2서브출금
			iIBSMR0006024.setDpsInpAcno(input.getRprsAcno()); //계좌번호
			iIBSMR0006024.setDpsTrnAm(input.getSpceMvbAm()); //공간이동금액
			iIBSMR0006024.setSpceNo(spaceNo); //공간번호 (출금공간)
			iIBSMR0006024.setPtnSpceNo(ptnSpaceNo); //상대공간번호 (입금공간)
			
			if (logger.isDebugEnabled()) {
				logger.debug("=======통장쪼개기 금액이동 ====== ::: input {}", iIBSMR0006024);
			}
			WFInfResponse<IBSMR0006024_ODT> mcaOutput = sHRIBSMR0006024_COM.callTrx(iIBSMR0006024, interfaceCfg);
			IBSMR0006024_ODT oIBSMR0006024 = mcaOutput.getResponseData();
			if (logger.isDebugEnabled()) {
				logger.debug("IBSMR0006024_ODT ====== {} ::: ", oIBSMR0006024);
				logger.debug("금액이동 완료 완료 ====== {} ::: ", oIBSMR0006024);
			}
			output.setRspRtcd("200");
			output.setRspMsgTxt("성공");
		} catch(WFApplicationException e){
			logger.error("IBSMR0006024 전문 error :: {}", e);
			Object[] args = e.getArguments();
			
			throw new WFApplicationException("FNSE0006", new Object[] {e.getCode()} , new Object[] {args[0].toString()});
		} catch(Exception e){
			logger.error("IBSMR0006024 전문 error :: {}", e);
		
			throw new WFApplicationException("FNSE0006", new Object[] {"9999"} , new Object[] {e.getMessage()});
		}
			
		return output;
	}

	/**
	 * 통장쪼개기 서브 공간 관리
	 * 1:서브공간 등록, 2:서브공간 수정, 3:서브공간 해제 + 4 : 목표 등록/수정
	 * @param input 공간.등록.DBM.입력.IO
	 * @return 공간.등록.DBM.출력.IO
	 */
	@BxmCategory(logicalName="서브.공간.관리", description="통장쪼개기 서브 공간을 관리하는 컴포넌트", author="90191355")
	public PBPPbokSplitBscMngCudSubSpceMng_DODT cudSubSpceMng(PBPPbokSplitBscMngCudSubSpceMng_DIDT input) {
		
		/**
		 * @BXMType GetBean
		 */
		
		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class);
		sHRIBSMR0006023_COM = WFApplicationContext.getBean(sHRIBSMR0006023_COM, SHRIBSMR0006023_COM.class);
		
		PBPPbokSplitBscMngCudSubSpceMng_DODT output= new PBPPbokSplitBscMngCudSubSpceMng_DODT();
		try {
			WFInterfaceCfg subInterfaceCfg = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg();
			subInterfaceCfg.setInterfaceId("IBSMR0006023");

			IBSMR0006023_IDT iIBSMR0006023 = new IBSMR0006023_IDT();
			String trnDscd = input.getTrnDscd();
			iIBSMR0006023.setTrnDscd(trnDscd); //1:서브공간 등록, 2:서브공간 수정, 3:서브공간 해제 + 4 : 목표 등록/수정
			iIBSMR0006023.setDpsInpAcno(input.getAcno()); //계좌번호
			iIBSMR0006023.setSpceNo(input.getSpceNo()); //공간번호 등록때 없음~
			iIBSMR0006023.setSpceNm(input.getSpceNm());
			iIBSMR0006023.setSpceIconNo(input.getSpceIconNo());
			//저축목표			
			iIBSMR0006023.setSavGoalAm(input.getSavGoalAm());
			iIBSMR0006023.setSavGoalStaDt(input.getGoalStaDt());
			iIBSMR0006023.setSavGoalEndDt(input.getGoalEndDt());
			//소비목표
			iIBSMR0006023.setCnsmGoalAm(input.getCnsmGoalAm());
			iIBSMR0006023.setCnsmAmBscd(input.getCnsmGoalCycd());

			if (logger.isDebugEnabled()) {
				logger.debug("=======통장쪼개기 공간원장 관리 호출====== ::: input {}", iIBSMR0006023);
			}
			
			WFInfResponse<IBSMR0006023_ODT> mcaOutput = sHRIBSMR0006023_COM.callTrx(iIBSMR0006023, subInterfaceCfg);
			IBSMR0006023_ODT oIBSMR0006023 = mcaOutput.getResponseData();
			
			if (logger.isDebugEnabled()) {
				logger.debug("통장쪼개기 공간원장 관리 응답====== {} ::: ", oIBSMR0006023);
			}
			
			if (!ObjectUtils.isEmpty(oIBSMR0006023)) {
				output.setSpceNo(oIBSMR0006023.getSpceNo());
			}
			
		} catch(WFApplicationException e){
			logger.error("IBSMR0006023 전문 error :: {}", e);
			Object[] args = e.getArguments();
			
			throw new WFApplicationException("FNSE0006", new Object[] {e.getCode()} , new Object[] {args[0].toString()});
		} catch(Exception e){
			logger.error("IBSMR0006023 전문 error :: {}", e);
		
			throw new WFApplicationException("FNSE0006", new Object[] {"9999"} , new Object[] {e.getMessage()});
		}
		
		return output;
	}
	
	/**
	 * 통장쪼개기 기본 원장 관리
	 * 1:등록, 2:해제, 3:조회, 4:PUSH동의여부 수정
	 * @param input 통장.분리.회원가입.목록.컨트롤러.입력.IO
	 * @return 통장.분리.회원가입.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName = "통장.쪼개기.기본.관리", description = "통장쪼개기 서비스를 기본 원장 관리 컴포넌트", author = "90191355")
	public PBPPbokSplitBscMngCrudSrvcBscMng_DODT crudSrvcBscMng(PBPPbokSplitBscMngCrudSrvcBscMng_DIDT input) {

		/**
		 * @BXMType GetBean
		 */
		sHRIBSMR0006022_COM = WFApplicationContext.getBean(sHRIBSMR0006022_COM, SHRIBSMR0006022_COM.class);
		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class); // WFInterfaceCfg 생성 컴포넌트
		shrAllActInqTbk_COM = WFApplicationContext.getBean(shrAllActInqTbk_COM, SHRAllActInqTbk_COM.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */
		if (logger.isDebugEnabled()) {
			logger.debug("=======통장쪼개기 기본 원장 관리 input====== ::: {}", input);
			//약관 저장 x
		}
		
		PBPPbokSplitBscMngCrudSrvcBscMng_DODT output = new PBPPbokSplitBscMngCrudSrvcBscMng_DODT();
		
		try {
			WFInterfaceCfg interfaceCfg = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg();
			interfaceCfg.setInterfaceId("IBSMR0006022");
		
			String trnDscd = input.getTrnDscd();
			boolean isRefreshAllAct = "1".equals(trnDscd) || "2".equals(trnDscd);
			
			IBSMR0006022_IDT iIBSMR0006022 = new IBSMR0006022_IDT();
			iIBSMR0006022.setTrnDscd(trnDscd); //1:등록, 2:해제, 3:조회, 4:PUSH동의여부 수정
			iIBSMR0006022.setDpsInpAcno(input.getRprsAcno());
			iIBSMR0006022.setBkAppPushAgrYn(input.getAppPushAgrYn()); // 은행앱PUSH동의여부
						
			WFInfResponse<IBSMR0006022_ODT> mcaOutput = sHRIBSMR0006022_COM.callTrx(iIBSMR0006022, interfaceCfg);
			IBSMR0006022_ODT oIBSMR0006022 = mcaOutput.getResponseData();
			if (logger.isDebugEnabled()) {
				logger.debug("oIBSMR0006022 ====== {} ::: ", mcaOutput.getResponseData());
			}	
			
			if (!ObjectUtils.isEmpty(oIBSMR0006022)) {
				output.setDpsInpAcno(oIBSMR0006022.getDpsInpAcno()); // 수신입력계좌번호
				output.setTrnStcd(oIBSMR0006022.getTrnStcd()); // 거래상태코드
				output.setRgsTrnDt(oIBSMR0006022.getRgsTrnDt()); // 등록거래일자
				output.setRvkTrnDt(oIBSMR0006022.getRvkTrnDt()); // 해제거래일자
				output.setBkAppPushAgrYn(oIBSMR0006022.getBkAppPushAgrYn()); // 은행앱PUSH동의여부	
				//전계좌 조회 갱신
				if (isRefreshAllAct) {
					shrAllActInqTbk_COM.selectSessActList(SHRBSCInquiryConstant.BSC_ACT_LIST_INQ_DIS_ALL, true);					
				}
			}

		} catch(WFApplicationException e){
			logger.error("IBSMR0006022 전문 error :: {}", e);
			Object[] args = e.getArguments();
			
			throw new WFApplicationException("FNSE0006", new Object[] {e.getCode()} , new Object[] {args[0].toString()});
		} catch(Exception e){
			logger.error("IBSMR0006022 전문 error :: {}", e);
		
			throw new WFApplicationException("FNSE0006", new Object[] {"9999"} , new Object[] {e.getMessage()});
		}

		return output;
	}
}
