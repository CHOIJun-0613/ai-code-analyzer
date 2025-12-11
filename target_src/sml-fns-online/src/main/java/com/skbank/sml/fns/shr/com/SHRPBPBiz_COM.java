package com.skbank.sml.fns.shr.com;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import com.skbank.sml.cmm.shr.com.SHRCMMInterfaceCfg_COM;
import com.skbank.sml.cmm.shr.com.SHRCMMLoginSession_COM;
import com.skbank.sml.cmm.shr.dto.CMM_CURRENT_CUST;
import com.skbank.sml.fns.shr.dto.SHRPBPBizSelectPBPJnngYn_DIDT;
import com.skbank.sml.fns.shr.dto.SHRPBPBizSelectPBPJnngYn_DODT;
import com.skbank.sml.ifi.mca.eims1.dto.IBSMR0004961_GRID_ODT;
import com.skbank.sml.ifi.mca.eims1.dto.IBSMR0004961_IDT;
import com.skbank.sml.ifi.mca.eims1.dto.IBSMR0004961_ODT;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0004961_COM;

import bxm.common.annotaion.BxmCategory;
import fwk.skbank.asis.adaptor.dto.request.WFInterfaceCfg;
import fwk.skbank.asis.adaptor.dto.response.WFInfResponse;
import fwk.skbank.online.context.WFApplicationContext;
import fwk.skbank.online.exception.app.WFApplicationException;
import fwk.skbank.online.exception.frm.SFAdaptorApplicationException;
import fwk.skbank.online.exception.frm.SFInterfaceSystemException;

/**
 * 1.업무명 : NEWWON 대분류 금융서비스 
 * 2.단위업무명 : NEWWON 중분류 공유 
 * 3.프로그램명 : 통장쪼개기 업무 공유 
 * 4.설명 : 통장쪼개기 업무 공유
 * 
 * @Class SHRPBPBiz_COM.java
 * @author 90191355
 * @since 2024.05.20
 * @version 1.0
 */
@Component
@BxmCategory(logicalName = "통장쪼개기 업무 공유", description = "통장쪼개기 업무 공유")
public class SHRPBPBiz_COM {
	private Logger logger = LoggerFactory.getLogger(getClass());

	private SHRIBSMR0004961_COM sHRIBSMR0004961_COM;
	private SHRCMMLoginSession_COM shrCMMLoginSession_COM;
	private SHRCMMInterfaceCfg_COM sHRCMMInterfaceCfg_COM;
	/**
	 * 통장쪼개기 가입여부를 조회 하는 컴포넌트
	 * 
	 * @param input
	 *            가입정보.조회.컨트롤러.입력.IO
	 * @return 가입정보.조회.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName = "통장쪼개기 가입여부 조회", description = "통장쪼개기 가입여부를 조회하는 컴포넌트", author = "90191355")
	public SHRPBPBizSelectPBPJnngYn_DODT selectPBPJnngYn(SHRPBPBizSelectPBPJnngYn_DIDT input) {
		/**
		 * @BXMType GetBean
		 */
		sHRIBSMR0004961_COM = WFApplicationContext.getBean(sHRIBSMR0004961_COM,	SHRIBSMR0004961_COM.class);
		shrCMMLoginSession_COM = WFApplicationContext	.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);

		/**
		 * 	WFInterfaceCfg 생성 컴포넌트
		 */
		sHRCMMInterfaceCfg_COM = WFApplicationContext	.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class); 

		/**
		 * @BXMType VariableDeclaration
		 */
		SHRPBPBizSelectPBPJnngYn_DODT output = new SHRPBPBizSelectPBPJnngYn_DODT();
		output.setPbokSplitJnngYn("N");

		// 세션고객정보
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession();
		
		String itcsno = input.getItcsno(); 
		if (itcsno.isEmpty()) {
			itcsno = currentCust.getItcsno();
		}

		/**
		 * 연계시스템 호출 TYPE : MCA 
		 * ID : IBSMR0004367 
		 * NM : 로그인 부가정보 조회
		 */
		try {
			// WFInterfaceCfg 셋팅
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
			/**
			 * @BXMType IF 통장쪼개기 가입여부 조회
			 */
			if (!ObjectUtils.isEmpty(oIBSMR0004961.getGrid())) {
				int joinCnt = 0;
				int joinAvlCnt = 0;
				for (IBSMR0004961_GRID_ODT odt : oIBSMR0004961.getGrid()) {
					joinCnt = "Y".equals(odt.getPbokSplitJnngYn()) ? joinCnt + 1 : joinCnt;
					joinAvlCnt = "Y".equals(odt.getPbokSplitJnngAvlYn()) ? joinAvlCnt + 1 : joinAvlCnt;
				}

				// 가입여부
				output.setPbokSplitJnngYn(joinCnt > 0 ? "Y" : "N");
				// 가입가능여부
				output.setPbokSplitJnngAvlYn(joinAvlCnt > 0 ? "Y" : "N");
			}
		} catch(WFApplicationException e){
			logger.error("IBSMR0004961 오류 :: {}", e);
			Object[] args = e.getArguments();
			
			throw new WFApplicationException("FNSE0006", new Object[] {e.getCode()} , new Object[] {args[0].toString()});
		} catch(Exception e){
			logger.error("IBSMR0004961 오류 ::: {}", e);
		
			throw new WFApplicationException("FNSE0006", new Object[] {"9999"} , new Object[] {e.getMessage()});
		} 

		return output;
	}

}
