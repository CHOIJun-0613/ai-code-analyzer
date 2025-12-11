package com.skbank.sml.fns.inb.svc;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.skbank.sml.cec.shr.com.SHRCECBypsPrvnUtil_COM;
import com.skbank.sml.cec.shr.com.SHRCRTAddCrtfHp_COM;
import com.skbank.sml.cec.shr.dto.SHRCECBypsPrvnUtilSetBypsPrvnInfoInp_DTO;
import com.skbank.sml.cec.shr.dto.SHRCRTSmsCrtfNoReqInp_DTO;
import com.skbank.sml.cec.shr.dto.SHRCRTSmsCrtfNoReqOut_DTO;
import com.skbank.sml.cmm.shr.com.SHRCMMEncDecSession_COM;
import com.skbank.sml.cmm.shr.com.SHRCMMInterfaceCfg_COM;
import com.skbank.sml.cmm.shr.com.SHRCMMLoginSession_COM;
import com.skbank.sml.cmm.shr.com.SHRMMHCustSession_COM;
import com.skbank.sml.cmm.shr.dto.CMM_CURRENT_CUST;
import com.skbank.sml.cmm.shr.dto.MMH_CUST_INFO;
import com.skbank.sml.fns.inb.com.INBSmsRawNtcSrvc_COM;
import com.skbank.sml.fns.inb.ctr.dto.INBSmsRawNtcSrvcCallSmsCrtfNoChk_IDT;
import com.skbank.sml.fns.inb.ctr.dto.INBSmsRawNtcSrvcCallSmsCrtfNoChk_ODT;
import com.skbank.sml.fns.inb.ctr.dto.INBSmsRawNtcSrvcCallSmsCrtfNoSnd_IDT;
import com.skbank.sml.fns.inb.ctr.dto.INBSmsRawNtcSrvcCallSmsCrtfNoSnd_ODT;
import com.skbank.sml.fns.inb.ctr.dto.INBSmsRawNtcSrvcCallSmsRawJnngInfScrn_ODT;
import com.skbank.sml.fns.inb.ctr.dto.INBSmsRawNtcSrvcSelectSmsRawNtcRduPrdTgtAct_IDT;
import com.skbank.sml.fns.inb.ctr.dto.INBSmsRawNtcSrvcSelectSmsRawNtcRduPrdTgtAct_ODT;
import com.skbank.sml.fns.inb.ctr.dto.INBSmsRawNtcSrvcDeleteSmsRawNtcTxt_IDT;
import com.skbank.sml.fns.inb.ctr.dto.INBSmsRawNtcSrvcDeleteSmsRawNtcTxt_ODT;
import com.skbank.sml.fns.inb.ctr.dto.INBSmsRawNtcSrvcInsertSmsRawNtcTxt_IDT;
import com.skbank.sml.fns.inb.ctr.dto.INBSmsRawNtcSrvcInsertSmsRawNtcTxt_ODT;
import com.skbank.sml.fns.inb.ctr.dto.INBSmsRawNtcSrvcUpdateSmsRawNtcTxt_IDT;
import com.skbank.sml.fns.inb.ctr.dto.INBSmsRawNtcSrvcUpdateSmsRawNtcTxt_ODT;
import com.skbank.sml.fns.inb.ctr.dto.INBSmsRawNtcSrvcSelectSmsRawFeeList_ODT;
import com.skbank.sml.fns.inb.ctr.dto.INBSmsRawNtcSrvcSelectSmsRawSrvcBsci_IDT;
import com.skbank.sml.fns.inb.ctr.dto.INBSmsRawNtcSrvcSelectSmsRawSrvcBsci_ODT;
import com.skbank.sml.fns.inb.ctr.dto.INBSmsRawNtcSrvcCallSmsRawNtcJnngInfCnfScrn_IDT;
import com.skbank.sml.fns.inb.ctr.dto.INBSmsRawNtcSrvcCallSmsRawNtcJnngInfCnfScrn_ODT;
import com.skbank.sml.fns.inb.dto.INBActList_DTO;
import com.skbank.sml.fns.inb.dto.INBBscActLIst_DTO;
import com.skbank.sml.fns.inb.dto.INBCusInfInq_DTO;
import com.skbank.sml.fns.inb.dto.INBSmsRawNtcTxtGrid_DTO;
import com.skbank.sml.fns.inb.dto.INBSmsRawSrvcBsci_DTO;
import com.skbank.sml.fns.inb.dto.INBSmsRawTrnTxtNtcGrid1_DTO;
import com.skbank.sml.fns.inb.dto.INBSmsRawTrnTxtNtcGrid2_DTO;
import com.skbank.sml.ifi.mca.eims1.dto.IBSMR0002771_GRID_IDT;
import com.skbank.sml.ifi.mca.eims1.dto.IBSMR0002771_IDT;
import com.skbank.sml.ifi.mca.eims1.dto.IBSMR0002771_ODT;
import com.skbank.sml.ifi.mca.eims4.dto.IBSMR0003224_IDT;
import com.skbank.sml.ifi.mca.eims7.dto.IBSMR0001237_GRID_IDT;
import com.skbank.sml.ifi.mca.eims7.dto.IBSMR0001237_IDT;
import com.skbank.sml.ifi.mca.eims8.dto.IBSMR0001238_GRID_2_ODT;
import com.skbank.sml.ifi.mca.eims8.dto.IBSMR0001238_GRID_ODT;
import com.skbank.sml.ifi.mca.eims8.dto.IBSMR0001238_IDT;
import com.skbank.sml.ifi.mca.eims8.dto.IBSMR0001238_ODT;
import com.skbank.sml.ifi.mca.eims9.dto.IBSMR0003919_IDT;
import com.skbank.sml.ifi.mca.eims9.dto.IBSMR0003919_ODT;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0001237_COM;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0001238_COM;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0002771_COM;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0003224_COM;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0003919_COM;

import bxm.common.annotaion.BxmCategory;
import fwk.skbank.asis.adaptor.dto.request.WFEmpty_ODT;
import fwk.skbank.asis.adaptor.dto.request.WFInterfaceCfg;
import fwk.skbank.asis.adaptor.dto.response.WFInfResponse;
import fwk.skbank.asis.adaptor.header.request.WFNciHeader;
import fwk.skbank.asis.adaptor.header.request.custom.WFCustomTrnHeader;
import fwk.skbank.asis.adaptor.header.response.WFOupMsgHeader;
import fwk.skbank.online.context.WFApplicationContext;
import fwk.skbank.online.exception.app.WFApplicationException;
import fwk.skbank.online.util.WFStringUtils;

/**
 * 1.업무명 : 금융서비스
 * 2.단위업무명 : NEWWON 중분류 통합알림함
 * 3.프로그램명 : SMS입출금통지서비스.서비스
 * 4.설명 : SMS입출금통지서비스
 * 
 * @Class INBSmsRawNtcSrvc_SVC.java
 * @author 90190264 
 * @since 2024.04.03
 * @version 1.0
 */		
@Service
@BxmCategory(logicalName="SMS입출금통지서비스.서비스", description="SMS입출금통지서비스")
public class INBSmsRawNtcSrvc_SVC {
	private Logger logger= LoggerFactory.getLogger(getClass());
	
	/**
	 * SMS입출금통지서비스.컴포넌트
	 */
	private INBSmsRawNtcSrvc_COM iNBSmsRawNtcSrvc_COM;
	/**
	 * SHRIBSMR0001238_COM 공유 공통 컴포넌트
	 */
	private SHRIBSMR0001238_COM sHRIBSMR0001238_COM;
	/**
	 * SHRIBSMR0001237_COM 공유 공통 컴포넌트
	 */
	private SHRIBSMR0001237_COM sHRIBSMR0001237_COM;
	/**
	 * SHRIBSMR0003919_COM 공유 공통 컴포넌트
	 */
	private SHRIBSMR0003919_COM sHRIBSMR0003919_COM;
	/**
	 * SHRIBSMR0003919_COM 공유 공통 컴포넌트
	 */
	private SHRIBSMR0003224_COM sHRIBSMR0003224_COM;
	/**
	 * SHRIBSMR0002771_COM 공유 공통 컴포넌트
	 */
	private SHRIBSMR0002771_COM sHRIBSMR0002771_COM;
	
	private SHRCMMLoginSession_COM shrCMMLoginSession_COM; 
	/**
	 * WFInterfaceCfg 생성 컴포넌트
	 */
	private SHRCMMInterfaceCfg_COM sHRCMMInterfaceCfg_COM;
	
	/**
	 * SHRMMHCustSession_COM 생성 컴포넌트
	 */
	private SHRMMHCustSession_COM shrMMHCustSession_COM;
	/**
	 * 인증보안 인증우회방지 공통 컴포넌트
	 * */
	private SHRCECBypsPrvnUtil_COM shrCECBypsPrvnUtil_COM;
	/**
	 * SMS인증번호 컴포넌트
	 * */
	private SHRCRTAddCrtfHp_COM sHRCRTAddCrtfHp_COM;
	/**
	 * SHRCMMEncDecSession_COM  컴포넌트
	 * */
	private SHRCMMEncDecSession_COM  sHRCMMEncDecSession_COM ;

	
	/**
	 * SMS입출금통지서비스.등록내역.조회
	 * 
	 * @param input SMS입출금.서비스.기본정보.컨트롤러.입력.IO 
	 * @return SMS입출금.서비스.기본정보.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName="SMS입출금.서비스.기본정보.조회", description="SMS입출금통지서비스.등록내역.조회", author="90190264")
	public INBSmsRawNtcSrvcSelectSmsRawSrvcBsci_ODT selectSmsRawSrvcBsci(INBSmsRawNtcSrvcSelectSmsRawSrvcBsci_IDT input
	)
	{
		/**
		* @BXMType GetBean
		*/
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */
		INBSmsRawNtcSrvcSelectSmsRawSrvcBsci_ODT output= new INBSmsRawNtcSrvcSelectSmsRawSrvcBsci_ODT();
		
		/**
		 * @BXMType IF
		 * session 체크
		 */
		// 로그인 체크
		if (shrCMMLoginSession_COM.istLogin()) {
			/**
			 * @BXMType Try
			 */
			try{
				iNBSmsRawNtcSrvc_COM= WFApplicationContext.getBean(iNBSmsRawNtcSrvc_COM, INBSmsRawNtcSrvc_COM.class);
				
				INBSmsRawSrvcBsci_DTO smsRawSrvcBsciDto = iNBSmsRawNtcSrvc_COM.selectSmsRawSrvcBsci();
				
				output.setCnt(smsRawSrvcBsciDto.getCnt()); 																			// 건수
				output.setCnt2(smsRawSrvcBsciDto.getCnt2()); 																		// 건수_2
				output.setiNBSmsRawTrnTxtNtcGrid1_DTO(smsRawSrvcBsciDto.getiNBSmsRawTrnTxtNtcGrid1_DTO()); // SMS입출금.거래내용.통지.GRID1.공통.IO
				output.setiNBSmsRawTrnTxtNtcGrid2_DTO(smsRawSrvcBsciDto.getiNBSmsRawTrnTxtNtcGrid2_DTO()); // SMS입출금.거래내용.통지.GRID2.공통.IO
				output.setSmsRawNtcSrvcJnngYn(smsRawSrvcBsciDto.getSmsRawNtcSrvcJnngYn()); 						// SMS입출금통지서비스가입여부
				
			} catch (WFApplicationException e) {
				logger.error("WFApplicationException error :: {}", e);
			} catch (Exception e) {
				logger.error("Exception error :: {}", e);
			}
		} else {
			//  로그인 세션이 존재하지 않습니다.
			throw new WFApplicationException("CMME0018");
		}
			
		return output;
			
	}
		
	/**
	 * SMS입출금.가입정보.화면.호출
	 * 
	 * @param input SMS입출금.가입정보.화면.컨트롤러.입력.IO
	 * @return SMS입출금.가입정보.화면.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName="SMS입출금.가입정보.화면.호출", description="SMS입출금.가입정보.화면.호출", author="90190264")
	public INBSmsRawNtcSrvcCallSmsRawJnngInfScrn_ODT callSmsRawJnngInfScrn()
	{
		/**
		* @BXMType GetBean
		*/
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		shrMMHCustSession_COM = WFApplicationContext.getBean(shrMMHCustSession_COM, SHRMMHCustSession_COM.class);
		// WFInterfaceCfg 생성 컴포넌트
		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class); 
		iNBSmsRawNtcSrvc_COM= WFApplicationContext.getBean(iNBSmsRawNtcSrvc_COM, INBSmsRawNtcSrvc_COM.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */
		INBSmsRawNtcSrvcCallSmsRawJnngInfScrn_ODT output= new INBSmsRawNtcSrvcCallSmsRawJnngInfScrn_ODT();
		
		MMH_CUST_INFO custInfo = shrMMHCustSession_COM.getCustInfoSession();
		
		// 로그인 체크
		if (shrCMMLoginSession_COM.istLogin()) {
			// 고객기본정보 세팅
			INBCusInfInq_DTO cusInfDto = new INBCusInfInq_DTO();
			
			cusInfDto.setHpComCd(custInfo.getHpComCd());			// 핸드폰회사코드
			cusInfDto.setHpTlenNo(custInfo.getHpTlenNo());			// 핸드폰국번번호
			cusInfDto.setHpSrno(custInfo.getHpSrno());					// 핸드폰일련번호
			
			output.setiNBCusInfInq_DTO(cusInfDto);
			
			INBBscActLIst_DTO actListDto = iNBSmsRawNtcSrvc_COM.selectINBActList_DTO();
			
			output.setiNBActList_DTO(actListDto.getiNBActList_DTO());
			
			INBSmsRawSrvcBsci_DTO smsRawSrvcBsciDto = iNBSmsRawNtcSrvc_COM.selectSmsRawSrvcBsci();
			
			// 기가입된 정보 있으면 세팅
			if (smsRawSrvcBsciDto.getiNBSmsRawTrnTxtNtcGrid1_DTO().size() > 0) {
				output.setiNBSmsRawTrnTxtNtcGrid1_DTO(smsRawSrvcBsciDto.getiNBSmsRawTrnTxtNtcGrid1_DTO());				
			}
		} else {
			//  로그인 세션이 존재하지 않습니다.
			throw new WFApplicationException("CMME0018");
		}
		
		return output;
			
	}
		
	/**
	 * SMS입출금통지.감면.상품.대상계좌.조회 
	 * 
	 * @param input SMS입출금통지.감면상품.대상계좌.컨트롤러.입력.IO
	 * @return SMS입출금통지.감면상품.대상계좌.컨트롤러.출력.IO 
	 */
	@BxmCategory(logicalName="SMS입출금통지.감면.상품.대상계좌.조회", description="SMS입출금통지.감면.상품.대상계좌.조회", author="90190264")
	public INBSmsRawNtcSrvcSelectSmsRawNtcRduPrdTgtAct_ODT selectSmsRawNtcRduPrdTgtAct(INBSmsRawNtcSrvcSelectSmsRawNtcRduPrdTgtAct_IDT input
	)
	{
			
		/**
		* @BXMType GetBean
		*/
		sHRIBSMR0003919_COM= WFApplicationContext.getBean(sHRIBSMR0003919_COM, SHRIBSMR0003919_COM.class);
		// WFInterfaceCfg 생성 컴포넌트
		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class);
			
		/**
		 * @BXMType VariableDeclaration
		 */
		INBSmsRawNtcSrvcSelectSmsRawNtcRduPrdTgtAct_ODT output= new INBSmsRawNtcSrvcSelectSmsRawNtcRduPrdTgtAct_ODT();
			
		/**
		 * @BXMType Try
		 * 감면상품 대상계좌 조회
		 */
		try{
			// ===================================================================
	        // *********************** 1.IBSMR0003919(SMS입출금통지 감면상품 대상계좌 조회) 인터페이스 호출 셋팅 ****************************************
	        // ===================================================================
			// MCA WFInterfaceCfg 객체 획득
			WFInterfaceCfg interfaceCfg  = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg();
	        interfaceCfg.setInterfaceId("IBSMR0003919");
	        
	        // WFNciHeader 셋팅
	        WFNciHeader wfnciHeader = interfaceCfg.getNciHeader();
	        wfnciHeader.setAcno(input.getAcno());
	       
	        // interfaceCfg 셋팅
	        interfaceCfg.setNciHeader(wfnciHeader);  
			
			/**
			 * @BXMType VariableDeclaration
			 */
	        IBSMR0003919_IDT ibsmr3919idt = new IBSMR0003919_IDT();
	        IBSMR0003919_ODT ibsmr3919odt = new IBSMR0003919_ODT();
	        /**
			 * todo : 세션에서 데이터 조회하여 세팅해야 함.
			 * 
			 * */
	        ibsmr3919idt.setAcno(input.getAcno());						// 계좌번호
			
			/**
			 * 연계시스템 호출
			 * TYPE : MCA
			 * ID : IBSMR0003919
			 * NM : 고객정보 조회
			 */
			WFInfResponse<IBSMR0003919_ODT> mcaOutput3919 = sHRIBSMR0003919_COM.callTrx(ibsmr3919idt, interfaceCfg);
			
			if(!mcaOutput3919.hasError()) {
				IBSMR0003919_ODT ibsmr3919Odt = mcaOutput3919.getResponseData();
				
				output.setFrduYn(ibsmr3919Odt.getFrduYn());
				output.setRduFrcsAm(ibsmr3919Odt.getRduFrcsAm());
			}
		} catch(WFApplicationException e){
			logger.error("IBSMR0003919 전문 error :: {}", e.getMessage());
			logger.error("IBSMR0003919 전문 error :: {}", e);
		} catch(Exception e){
			logger.error("IBSMR0003919 전문 Exception error :: {}", e.getMessage());
			logger.error("IBSMR0003919 전문 Exception error :: {}", e);
		}
			
		return output;
			
	}
		
	/**
	 * SMS입출금통지.가입정보.확인.화면.호출
	 *
	 * @return 
	 */
	@BxmCategory(logicalName="SMS입출금통지.가입정보.확인.화면.호출", description="SMS입출금통지.가입정보.확인.화면.호출", author="90190264")
	public INBSmsRawNtcSrvcCallSmsRawNtcJnngInfCnfScrn_ODT callSmsRawNtcJnngInfCnfScrn(INBSmsRawNtcSrvcCallSmsRawNtcJnngInfCnfScrn_IDT input)
	{
		// WFInterfaceCfg 생성 컴포넌트
		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class);
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		shrMMHCustSession_COM = WFApplicationContext.getBean(shrMMHCustSession_COM, SHRMMHCustSession_COM.class);
		shrCECBypsPrvnUtil_COM = WFApplicationContext.getBean(shrCECBypsPrvnUtil_COM, SHRCECBypsPrvnUtil_COM.class);
		sHRIBSMR0001238_COM= WFApplicationContext.getBean(sHRIBSMR0001238_COM, SHRIBSMR0001238_COM.class);
		iNBSmsRawNtcSrvc_COM= WFApplicationContext.getBean(iNBSmsRawNtcSrvc_COM, INBSmsRawNtcSrvc_COM.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */
		INBSmsRawNtcSrvcCallSmsRawNtcJnngInfCnfScrn_ODT output= new INBSmsRawNtcSrvcCallSmsRawNtcJnngInfCnfScrn_ODT();
		
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession(); 
		MMH_CUST_INFO custInfo = shrMMHCustSession_COM.getCustInfoSession();
			
		/**
		 * @BXMType IF
		 * TODO
		 * session 체크
		 */
		// 로그인 체크
		if (shrCMMLoginSession_COM.istLogin()) {
			/**
			 * 인증우회방지 사전 정보 생성
			 * */
			SHRCECBypsPrvnUtilSetBypsPrvnInfoInp_DTO inputParam = new SHRCECBypsPrvnUtilSetBypsPrvnInfoInp_DTO();

			inputParam.setSkipCert("N");													// 인증서 인증 SKIP여부(기본값: N)
			inputParam.setSkipSecuToken(input.getCertScrtMensTgtYn());		// 보안매체 인증 SKIP여부(기본값: N)
			inputParam.setE2ETgtYn("Y");													// E2E 체크 여부(기본값: Y)

			shrCECBypsPrvnUtil_COM.setBypsPrvnInfo(inputParam);
			
			/**
			 * 인증우회방지 사전 정보 생성 끝
			 * */

			// 수정, 해지 일 경우
			if("M".equalsIgnoreCase(input.getTrnDis()) || "D".equalsIgnoreCase(input.getTrnDis())) {
				// 고객기본정보 세팅
				INBCusInfInq_DTO cusInfDto = new INBCusInfInq_DTO();
				
				cusInfDto.setHpComCd(custInfo.getHpComCd());			// 핸드폰회사코드
				cusInfDto.setHpTlenNo(custInfo.getHpTlenNo());			// 핸드폰국번번호
				cusInfDto.setHpSrno(custInfo.getHpSrno());					// 핸드폰일련번호
				
				// 계좌목록 조회
				INBBscActLIst_DTO actListDto = iNBSmsRawNtcSrvc_COM.selectINBActList_DTO();
				// 대상계좌 계좌명 조회
				String actNm = actListDto.getiNBActList_DTO()
												   .stream()
												   .filter(item -> input.getTgtAcno().equals(item.getActNo()))
												   .map(INBActList_DTO::getActNm)
												   .findFirst()
												   .orElse("");
													
				// 기가입 내용 조회
				iNBSmsRawNtcSrvc_COM= WFApplicationContext.getBean(iNBSmsRawNtcSrvc_COM, INBSmsRawNtcSrvc_COM.class);
				
				INBSmsRawSrvcBsci_DTO smsRawSrvcBsciDto = iNBSmsRawNtcSrvc_COM.selectSmsRawSrvcBsci();
				
				String smsRawNtcSrvcJnngYn = smsRawSrvcBsciDto.getSmsRawNtcSrvcJnngYn();
				
				if(WFStringUtils.isEmpty(smsRawNtcSrvcJnngYn)) {
					//  가입되있지 않은 사용자 입니다.
					throw new WFApplicationException("FNSE0002");
				} else {
					if("Y".equalsIgnoreCase(smsRawNtcSrvcJnngYn)) {
						try {
							
							INBSmsRawTrnTxtNtcGrid1_DTO ibsmr1238Grid1Dto = smsRawSrvcBsciDto.getiNBSmsRawTrnTxtNtcGrid1_DTO()
																														      .stream()
																														      .filter(item -> input.getTgtAcno().equals(item.getDpsAcno()))
																														      .findFirst()
																														      .orElseThrow(() -> {
																														    	  // IFIE0001: 데이터가 없습니다.
																														    	  throw new WFApplicationException("IFIE0001");
																														    	});
							// ===================================================================
							// *********************** 1.IBSMR0001238(SMS입출금통지등록내역조회) 인터페이스 호출 셋팅 ****************************************
							// ===================================================================
							WFInterfaceCfg interfaceCfg  = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg();
							interfaceCfg.setInterfaceId("IBSMR0001238");
							
							WFCustomTrnHeader wfCusTrnHeader = new WFCustomTrnHeader();
							wfCusTrnHeader.setFuncCd("21"); 		// 계좌로 조회 : 21
							
							interfaceCfg.setCustomTrnHeader(wfCusTrnHeader);
							interfaceCfg.setRepeatFieldNm("GRID");
							
							IBSMR0001238_IDT ibsmr1238idt = new IBSMR0001238_IDT();
							List<INBSmsRawTrnTxtNtcGrid2_DTO> grid2List = new ArrayList<>();
							
							// 수신계좌번호 세팅
							ibsmr1238idt.setTgtAcno(ibsmr1238Grid1Dto.getDpsAcno());
							ibsmr1238idt.setItcsno(currentCust.getItcsno());
							// grid2 조회
							WFInfResponse<IBSMR0001238_ODT> mcaOutput2 = sHRIBSMR0001238_COM.callTrx(ibsmr1238idt, interfaceCfg);
							
							if(!mcaOutput2.hasError() ) {
								IBSMR0001238_ODT ibsmr1238odt2= mcaOutput2.getResponseData();
								
								for(IBSMR0001238_GRID_2_ODT grid2 : ibsmr1238odt2.getGrid2()) {
									INBSmsRawTrnTxtNtcGrid2_DTO grid2dto = new INBSmsRawTrnTxtNtcGrid2_DTO();
									
									grid2dto.setHpComCd(grid2.getHpComCd()); 						// 핸드폰회사코드
									grid2dto.setHpTlen(grid2.getHpTlen()); 							// 핸드폰국번
									grid2dto.setHpSerNo(grid2.getHpSerNo()); 						// 핸드폰일련번호
									grid2dto.setNtcTgtTrnDscd(grid2.getNtcTgtTrnDscd()); 		// 통지대상거래구분코드
									grid2dto.setPrcSrno(grid2.getPrcSrno()); 							// 처리일련번호
									
									grid2List.add(grid2dto);
								}
								
								output.setCnt2(ibsmr1238odt2.getCnt2());
								output.setiNBSmsRawTrnTxtNtcGrid2_DTO(grid2List);
							}
							output.setiNBSmsRawTrnTxtNtcGrid1_DTO(ibsmr1238Grid1Dto);
							output.getiNBSmsRawTrnTxtNtcGrid1_DTO().setActNm(actNm);				// 계좌명
							output.setiNBCusInfInq_DTO(cusInfDto);												// 세션 핸드폰 정보
							
						} catch(WFApplicationException e){
							logger.error("IBSMR0001238 전문 error :: {}", e.getMessage());
							logger.error("IBSMR0001238 전문 error :: {}", e);
						}  catch(Exception e){
							logger.error("IBSMR0001238 Exception error :: {}", e);
						}
						
					}
				}
			}
		} else {
			//  로그인 세션이 존재하지 않습니다.
			throw new WFApplicationException("CMME0018");
		}
		
		
		return output;
	}
		
	/**
	 * SMS입출금통지.내용.등록
	 * 
	 * @param input SMS입출금통지.내용.컨트롤러.입력.IO
	 * @return SMS입출금통지.내용.컨트롤러.출력.IO 
	 */
	@BxmCategory(logicalName="SMS입출금통지.내용.등록", description="SMS입출금통지.내용.등록", author="90190264")
	public INBSmsRawNtcSrvcInsertSmsRawNtcTxt_ODT insertSmsRawNtcTxt(INBSmsRawNtcSrvcInsertSmsRawNtcTxt_IDT input
	)
	{
			
		/**
		* @BXMType GetBean
		*/
		sHRIBSMR0001237_COM= WFApplicationContext.getBean(sHRIBSMR0001237_COM, SHRIBSMR0001237_COM.class);
		// WFInterfaceCfg 생성 컴포넌트
		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class);
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		sHRCMMEncDecSession_COM  = WFApplicationContext.getBean(sHRCMMEncDecSession_COM , SHRCMMEncDecSession_COM .class);
		
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession(); 
		/**
		 * @BXMType VariableDeclaration
		 */
		INBSmsRawNtcSrvcInsertSmsRawNtcTxt_ODT output= new INBSmsRawNtcSrvcInsertSmsRawNtcTxt_ODT();
		
		// 로그인 체크
		if (shrCMMLoginSession_COM.istLogin()) {
			/**
			 * @BXMType 
			 * sms입출금내용등록 전문
			 */
			try{
				// ===================================================================
		        // *********************** 1.IBSMR0001237(SMS입출금통지등록) 인터페이스 호출 셋팅 ****************************************
		        // ===================================================================
				//  MCA WFInterfaceCfg 객체 획득
				WFInterfaceCfg interfaceCfg  = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg();
		        interfaceCfg.setInterfaceId("IBSMR0001237");
		        
		        // WFNciHeader 셋팅
		        WFNciHeader wfnciHeader = interfaceCfg.getNciHeader();
		        wfnciHeader.setAcno(input.getFstlAct());
		       
		        // interfaceCfg 셋팅
		        interfaceCfg.setNciHeader(wfnciHeader);  
				
				/**
				 * @BXMType VariableDeclaration
				 */
		        IBSMR0001237_IDT ibsmr1237idt = new IBSMR0001237_IDT();
		        WFEmpty_ODT ibsmr1237odt = new WFEmpty_ODT();
		        /**
				 * 화면에서 넘어온 값 IDT 세팅
				 * */
		        if(input != null) {
		        	String encyPwno = sHRCMMEncDecSession_COM.decryptDataWithMD5SecKey(input.getEncyPwno()); 		// 비밀번호 복호화
		        	
		        	ibsmr1237idt.setFstlAct(input.getFstlAct()); 										// 수수료결제계좌
		        	ibsmr1237idt.setPwnoUsgYn("Y"); 													// 비밀번호사용여부
		        	ibsmr1237idt.setEncyPwno(encyPwno); 											// 비밀번호
		        	ibsmr1237idt.setTgtAcno(input.getTgtAcno()); 									// 대상계좌번호
		        	ibsmr1237idt.setBalNtrsnYn(input.getBalNtrsnYn()); 							// 잔액미전송여부
		        	ibsmr1237idt.setSmsTmsLimAm(input.getSmsTmsLimAm()); 					// SMS전송제한금액
		        	ibsmr1237idt.setTmsStaTm(input.getTmsStaTm()); 							// 전송시작시각
		        	ibsmr1237idt.setTmsEndTm(input.getTmsEndTm()); 							// 전송종료시각
		        	ibsmr1237idt.setAtsSndLimYn(input.getAtsSndLimYn()); 						// 자동이체발송제한여부
		        	ibsmr1237idt.setCusInfNlkgYn(input.getCusInfNlkgYn());	 					// 고객정보미연동여부
		        	ibsmr1237idt.setFeeFeKd(input.getFeeFeKd()); 									// 수수료요금종류
		        	ibsmr1237idt.setFeeDfpmLevyYn(input.getFeeDfpmLevyYn()); 				// 수수료후불징수여부
		        	ibsmr1237idt.setFeeWdrGdncNtcYn(input.getFeeWdrGdncNtcYn()); 		// 수수료출금안내통지여부
		        	ibsmr1237idt.setGridCnt(input.getGridCnt()); 									// 그리드건수
		        	
		        	List<IBSMR0001237_GRID_IDT> gridList = new ArrayList<IBSMR0001237_GRID_IDT>();
		        	for (INBSmsRawNtcTxtGrid_DTO gridDto : input.getiNBSmsRawNtcTxtGrid_DTO()) {
		        		IBSMR0001237_GRID_IDT grid =  new IBSMR0001237_GRID_IDT();
		        		
		        		String hpComCd = gridDto.getHpComCd();
		        		String hpTlen = gridDto.getHpTlen();
		        		String hpSrno = gridDto.getHpSrno();
		        		
		        		StringBuffer sb = new StringBuffer();
		        		sb.append(hpComCd);
						sb.append(hpTlen);
						sb.append(hpSrno);
						
		        		String hp = sb.toString().trim();
		        		// 핸드폰 길이가 10자리일 경우만 해당(고객정보 세션에서 조회한 핸드폰이 10자리인 경우 가운데 번호가 4자리로 들어와서 등록 시 에러 발생)
		        		if(hp.length() == 10) {
		        			String tmpHpTlen1 = hpTlen.substring(0, 3);
		        			String tmpHpTlen2 = hpTlen.substring(3);
		        			
		        			hpTlen = tmpHpTlen1;
		        			hpSrno = tmpHpTlen2 + hpSrno;
		        		}
		        		
		        		grid.setHpComCd(hpComCd);												// 핸드폰회사코드
		        		grid.setHpTlen(hpTlen);														// 핸드폰국번
		        		grid.setHpSrno(hpSrno);													// 핸드폰일련번호
		        		grid.setNtcTgtTrnDscd(gridDto.getNtcTgtTrnDscd());				// 통지대상거래구분코드
		        		grid.setPrcSrno(gridDto.getPrcSrno());									// 처리일련번호
		        		
		        		gridList.add(grid);
		        	}
		        	ibsmr1237idt.setGrid(gridList); 			// 그리드
		        }
				
				/**
				 * 연계시스템 호출
				 * TYPE : MCA
				 * ID : IBSMR0001237
				 * NM : SMS입출금통지등록
				 */
				WFInfResponse<WFEmpty_ODT> mcaOutput1237 = sHRIBSMR0001237_COM.callTrx(ibsmr1237idt, interfaceCfg);
				
				if(!mcaOutput1237.hasError()) {
					WFOupMsgHeader mcgOutput1237MsgHeader = mcaOutput1237.getOupMsgHeader();
					
					ibsmr1237odt = mcaOutput1237.getResponseData();
					
					/*
					 * 해지한 계좌 이외 기 등록된 계좌 존재 체크
					 */
					INBSmsRawNtcSrvcSelectSmsRawSrvcBsci_IDT smsRawSrvcBsci_IDT= new INBSmsRawNtcSrvcSelectSmsRawSrvcBsci_IDT();
					smsRawSrvcBsci_IDT.setItcsno(currentCust.getItcsno());
					INBSmsRawNtcSrvcSelectSmsRawSrvcBsci_ODT smsRawSrvcBsci_ODT = selectSmsRawSrvcBsci(smsRawSrvcBsci_IDT);
					
					output.setSmsRawNtcSrvcJnngYn(smsRawSrvcBsci_ODT.getSmsRawNtcSrvcJnngYn());
				}
				output.setRtcd("200");
				output.setRtcdTxt("SMS입출금통지서비스 가입이 완료되었습니다.");
			} catch (WFApplicationException e) {
				logger.error("WFApplicationException error :: {}", e);
				throw e;
			}
		} else {
			//  로그인 세션이 존재하지 않습니다.
			throw new WFApplicationException("CMME0018");
		}
			
		return output;
			
	}
		
	/**
	 * SMS입출금통지.내용.수정
	 * 
	 * @param input SMS입출금통지.내용.컨트롤러.입력.IO
	 * @return SMS입출금통지.내용.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName="SMS입출금통지.내용.수정", description="SMS입출금통지.내용.수정", author="90190264")
	public INBSmsRawNtcSrvcUpdateSmsRawNtcTxt_ODT updateSmsRawNtcTxt(INBSmsRawNtcSrvcUpdateSmsRawNtcTxt_IDT input
	)
	{
			
		/**
		* @BXMType GetBean
		*/
		sHRIBSMR0002771_COM= WFApplicationContext.getBean(sHRIBSMR0002771_COM, SHRIBSMR0002771_COM.class);
		// WFInterfaceCfg 생성 컴포넌트
		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class);
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		sHRCMMEncDecSession_COM  = WFApplicationContext.getBean(sHRCMMEncDecSession_COM , SHRCMMEncDecSession_COM .class);
		
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession(); 
		
		/**
		 * @BXMType VariableDeclaration
		 */
		INBSmsRawNtcSrvcUpdateSmsRawNtcTxt_ODT output= new INBSmsRawNtcSrvcUpdateSmsRawNtcTxt_ODT();
			
		// 로그인 체크
		if (shrCMMLoginSession_COM.istLogin()) {
			/**
			 * @BXMType Try
			 * sms입출금내용등록 전문
			 */
			try{
				// ===================================================================
		        // *********************** 1.IBSMR0002771(SMS입출금거래내용통지변경) 인터페이스 호출 셋팅 ****************************************
		        // ===================================================================
				//  MCA WFInterfaceCfg 객체 획득
				WFInterfaceCfg interfaceCfg  = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg();
		        interfaceCfg.setInterfaceId("IBSMR0002771");
		        
		        // WFNciHeader 셋팅
		        WFNciHeader wfnciHeader = interfaceCfg.getNciHeader();
		        wfnciHeader.setAcno(input.getFstlAct());
		        
		        interfaceCfg.setNciHeader(wfnciHeader);  
				
				/**
				 * @BXMType VariableDeclaration
				 */
		        IBSMR0002771_IDT ibsmr2771idt = new IBSMR0002771_IDT();
		        IBSMR0002771_ODT ibsmr2771odt = new IBSMR0002771_ODT();
		        /**
				 * 화면에서 넘어온 값 IDT 세팅
				 * todo : 대상계좌, 출금계좌 변경해야 함. 현재는 테스트 계좌번호 하드코딩
				 * */
		        if(input != null) {
		        	String encyPwno = sHRCMMEncDecSession_COM.decryptDataWithMD5SecKey(input.getEncyPwno()); 		// 비밀번호 복호화
		        	
		        	ibsmr2771idt.setFstlAct(input.getFstlAct()); 										// 수수료결제계좌
		        	ibsmr2771idt.setPwnoUsgYn("Y"); 													// 비밀번호사용여부
		        	ibsmr2771idt.setEncyPwno(encyPwno); 											// 암호화비밀번호
		        	ibsmr2771idt.setTgtAcno(input.getTgtAcno()); 									// 대상계좌번호
		        	ibsmr2771idt.setBalNtrsnYn(input.getBalNtrsnYn()); 							// 잔액미전송여부
		        	ibsmr2771idt.setSmsTmsLimAm(input.getSmsTmsLimAm()); 					// SMS전송제한금액
		        	ibsmr2771idt.setTmsStaTm(input.getTmsStaTm()); 							// 전송시작시각
		        	ibsmr2771idt.setTmsEndTm(input.getTmsEndTm()); 							// 전송종료시각
		        	ibsmr2771idt.setAtsSndLimYn(input.getAtsSndLimYn()); 						// 자동이체발송제한여부
		        	ibsmr2771idt.setCusInfNlkgYn(input.getCusInfNlkgYn());	 					// 고객정보미연동여부
		        	ibsmr2771idt.setFeeFeKd(input.getFeeFeKd()); 									// 수수료요금종류
		        	ibsmr2771idt.setFeeDfpmLevyYn(input.getFeeDfpmLevyYn()); 				// 수수료후불징수여부
		        	ibsmr2771idt.setFeeWdrGdncNtcYn(input.getFeeWdrGdncNtcYn()); 		// 수수료출금안내통지여부
		        	ibsmr2771idt.setGridCnt(input.getGridCnt()); 									// 그리드건수
		        	
		        	List<IBSMR0002771_GRID_IDT> gridList = new ArrayList<IBSMR0002771_GRID_IDT>();
		        	for (INBSmsRawNtcTxtGrid_DTO gridDto : input.getiNBSmsRawNtcTxtGrid_DTO()) {
		        		IBSMR0002771_GRID_IDT grid =  new IBSMR0002771_GRID_IDT();
		        		
		        		String hpComCd = gridDto.getHpComCd();
		        		String hpTlen = gridDto.getHpTlen();
		        		String hpSrno = gridDto.getHpSrno();
		        		
		        		StringBuffer sb = new StringBuffer();
		        		sb.append(hpComCd);
						sb.append(hpTlen);
						sb.append(hpSrno);
						
		        		String hp = sb.toString().trim();
		        		// 핸드폰 길이가 10자리일 경우만 해당(고객정보 세션에서 조회한 핸드폰이 10자리인 경우 가운데 번호가 4자리로 들어와서 등록 시 에러 발생)
		        		if(hp.length() == 10) {
		        			String tmpHpTlen1 = hpTlen.substring(0, 3);
		        			String tmpHpTlen2 = hpTlen.substring(3);
		        			
		        			hpTlen = tmpHpTlen1;
		        			hpSrno = tmpHpTlen2 + hpSrno;
		        		}
		        		
		        		grid.setHpComCd(hpComCd);												// 핸드폰회사코드
		        		grid.setHpTlen(hpTlen);														// 핸드폰국번
		        		grid.setHpSrno(hpSrno);													// 핸드폰일련번호
		        		grid.setNtcTgtTrnDscd(gridDto.getNtcTgtTrnDscd());				// 통지대상거래구분코드
		        		grid.setPrcSrno(gridDto.getPrcSrno());									// 처리일련번호
		        		
		        		gridList.add(grid);
		        	}
		        	ibsmr2771idt.setGrid(gridList); 			// 그리드
		        }
				
				/**
				 * 연계시스템 호출
				 * TYPE : MCA
				 * ID : IBSMR0002771
				 * NM : SMS입출금거래내용통지변경
				 */
				WFInfResponse<IBSMR0002771_ODT> mcaOutput2771 = sHRIBSMR0002771_COM.callTrx(ibsmr2771idt, interfaceCfg);
				
				if(!mcaOutput2771.hasError()) {
					WFOupMsgHeader mcgOutput2771MsgHeader = mcaOutput2771.getOupMsgHeader();
					
					ibsmr2771odt = mcaOutput2771.getResponseData();
					
					/*
					 * 해지한 계좌 이외 기 등록된 계좌 존재 체크
					 */
					INBSmsRawNtcSrvcSelectSmsRawSrvcBsci_IDT smsRawSrvcBsci_IDT= new INBSmsRawNtcSrvcSelectSmsRawSrvcBsci_IDT();
					smsRawSrvcBsci_IDT.setItcsno(currentCust.getItcsno());
					INBSmsRawNtcSrvcSelectSmsRawSrvcBsci_ODT smsRawSrvcBsci_ODT = selectSmsRawSrvcBsci(smsRawSrvcBsci_IDT);
					
					output.setSmsRawNtcSrvcJnngYn(smsRawSrvcBsci_ODT.getSmsRawNtcSrvcJnngYn());
				}
				output.setRtcd("200");
				output.setRtcdTxt("서비스 신청 정보 변경이 완료되었어요.");
			} catch (WFApplicationException e) {
				logger.error("WFApplicationException error :: {}", e);
				// IFIE0000 : 기존과 다른 내용을 입력해 주세요.
				if("IFIE0000".equals(e.getCode())) {
					output.setRtcd(e.getCode());
					
					Object[] args = e.getArguments();
					output.setRtcdTxt(args[0].toString());
				} else {
					throw e;
				}
			}
		} else {
			//  로그인 세션이 존재하지 않습니다.
			throw new WFApplicationException("CMME0018");
		}
		
		return output;
			
	}
		
	/**
	 * SMS입출금통지.내용.삭제
	 * 
	 * @param input SMS입출금통지.내용.컨트롤러.입력.IO
	 * @return SMS입출금통지.내용.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName="SMS입출금통지.내용.삭제", description="SMS입출금통지.내용.삭제", author="90190264")
	public INBSmsRawNtcSrvcDeleteSmsRawNtcTxt_ODT deleteSmsRawNtcTxt(INBSmsRawNtcSrvcDeleteSmsRawNtcTxt_IDT input
	)
	{
			
		/**
		* @BXMType GetBean
		*/
		sHRIBSMR0003224_COM= WFApplicationContext.getBean(sHRIBSMR0003224_COM, SHRIBSMR0003224_COM.class);
		// WFInterfaceCfg 생성 컴포넌트
		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class);
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession(); 
		
		/**
		 * @BXMType VariableDeclaration
		 */
		INBSmsRawNtcSrvcDeleteSmsRawNtcTxt_ODT output= new INBSmsRawNtcSrvcDeleteSmsRawNtcTxt_ODT();
		
		// 로그인 체크
		if (shrCMMLoginSession_COM.istLogin()) {
			/**
			 * @BXMType Try
			 * sms입출금통지삭제 전문
			 */
			try{
				// ===================================================================
		        // *********************** 1.IBSMR0003224(SMS입출금거래내용통지해지) 인터페이스 호출 셋팅 ****************************************
		        // ===================================================================
				//  MCA WFInterfaceCfg 객체 획득
				WFInterfaceCfg interfaceCfg  = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg();
		        interfaceCfg.setInterfaceId("IBSMR0003224");
		        
		        // WFNciHeader 셋팅
		        WFNciHeader wfnciHeader = interfaceCfg.getNciHeader();
		        wfnciHeader.setAcno(input.getFstlAct());
		       
		        // interfaceCfg 셋팅
		        interfaceCfg.setNciHeader(wfnciHeader);  
				
				/**
				 * @BXMType VariableDeclaration
				 */
		        IBSMR0003224_IDT ibsmr3224idt = new IBSMR0003224_IDT();
		        WFEmpty_ODT ibsmr3224odt = new WFEmpty_ODT();
		        /**
				 * 화면에서 넘어온 값 IDT 세팅 
				 * */
		        if(input != null) {
		        	ibsmr3224idt.setFstlAct(input.getFstlAct()); 										// 수수료결제계좌
		        	ibsmr3224idt.setPwnoUsgYn("N"); 													// 비밀번호사용여부
		        	ibsmr3224idt.setTgtAcno(input.getTgtAcno()); 									// 대상계좌번호
		        }
				
				/**
				 * 연계시스템 호출
				 * TYPE : MCA
				 * ID : IBSMR0003224
				 * NM : 	SMS입출금거래내용통지해지
				 */
				WFInfResponse<WFEmpty_ODT> mcaOutput3224 = sHRIBSMR0003224_COM.callTrx(ibsmr3224idt, interfaceCfg);
				
				if(!mcaOutput3224.hasError()) {
					WFOupMsgHeader mcgOutput3224MsgHeader = mcaOutput3224.getOupMsgHeader();
					
					ibsmr3224odt = mcaOutput3224.getResponseData();
					
					/*
					 * 해지한 계좌 이외 기 등록된 계좌 존재 체크
					 * 해지 화면에서 확인 버튼 클릭 시 해당 데이터로 화면 분기
					 */
					INBSmsRawNtcSrvcSelectSmsRawSrvcBsci_IDT smsRawSrvcBsci_IDT= new INBSmsRawNtcSrvcSelectSmsRawSrvcBsci_IDT();
					// todo: 통고번호 삭제, 세션값으로 대체
					smsRawSrvcBsci_IDT.setItcsno(currentCust.getItcsno());
					INBSmsRawNtcSrvcSelectSmsRawSrvcBsci_ODT smsRawSrvcBsci_ODT = selectSmsRawSrvcBsci(smsRawSrvcBsci_IDT);
					
					output.setSmsRawNtcSrvcJnngYn(smsRawSrvcBsci_ODT.getSmsRawNtcSrvcJnngYn());
				}
				output.setRtcd("200");
				output.setRtcdTxt("SMS입출금통지서비스 해지가 완료되었습니다.");
			} catch (WFApplicationException e) {
				logger.error("WFApplicationException error :: {}", e);
				
				if("IFIE0334".equals(e.getCode())) {
					throw new WFApplicationException("FNSE0007");
				} else {
					throw e;
				}
			}
		} else {
			//  로그인 세션이 존재하지 않습니다.
			throw new WFApplicationException("CMME0018");
		}
			
		return output;
			
	}

	/**
	 * SMS입출금.수수료목록.조회
	 * 
	 * @param input SMS입출금.수수료목록.조회.컨트롤러.입력.IO
	 * @return SMS입출금.수수료목록.조회.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName="SMS입출금.수수료목록.조회", description="SMS입출금.수수료목록.조회", author="90190264")
	public INBSmsRawNtcSrvcSelectSmsRawFeeList_ODT selectSmsRawFeeList() {
		
		/**
		* @BXMType GetBean
		*/
		sHRIBSMR0001238_COM= WFApplicationContext.getBean(sHRIBSMR0001238_COM, SHRIBSMR0001238_COM.class);
		
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		// WFInterfaceCfg 생성 컴포넌트
		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */
		INBSmsRawNtcSrvcSelectSmsRawFeeList_ODT output= new INBSmsRawNtcSrvcSelectSmsRawFeeList_ODT();
		
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession(); 
		
		/**
		 * @BXMType IF
		 * TODO
		 * session 체크
		 */
		if(WFStringUtils.isEmpty(currentCust.getItcsno())) {
			//  로그인 세션이 존재하지 않습니다.
			throw new WFApplicationException("CMME0018");
		}else /** session 빈값 아니면*/ {
			try {
				/*
				 * @BXMType ComponentCall
				 * SMS입출금통지서비스.컴포넌트 sms입출금통지.거래내용.통지.조회
				 */
				// ===================================================================
				// *********************** 1.IBSMR0001238(SMS입출금통지등록내역조회) 인터페이스 호출 셋팅 ****************************************
				// ===================================================================
				//  MCA WFInterfaceCfg 객체 획득
				WFInterfaceCfg interfaceCfg  = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg();
				interfaceCfg.setInterfaceId("IBSMR0001238");
				
				// 3. WFCustomTrnHeader 셋팅
				WFCustomTrnHeader wfCusTrnHeader = new WFCustomTrnHeader();
				wfCusTrnHeader.setFuncCd("20");			// 거래코드	조회:20 / 등록:30 / 변경:40 / 해지:50
				interfaceCfg.setCustomTrnHeader(wfCusTrnHeader);
				
				/**
				 * @BXMType VariableDeclaration
				 */
				IBSMR0001238_IDT ibsmr1238idt = new IBSMR0001238_IDT();
				IBSMR0001238_ODT ibsmr1238odt= new IBSMR0001238_ODT();
				ibsmr1238idt.setItcsno(currentCust.getItcsno());			// 통합고객번호
				ibsmr1238idt.setSmsTmsLimAm(0);								// 전송제한금액
				
				/**
				 * 연계시스템 호출
				 * TODO 인터페이스 호출을 위한 코드를 작성하십시오.
				 * TYPE : MCA
				 * ID : IBSMR0001238
				 * NM : SMS입출금거래내용통지조회
				 */
				WFInfResponse<IBSMR0001238_ODT> mcaOutput = sHRIBSMR0001238_COM.callTrx(ibsmr1238idt, interfaceCfg);
				
				ibsmr1238odt = mcaOutput.getResponseData();
				
				if(!mcaOutput.hasError()) {
					List<INBSmsRawTrnTxtNtcGrid1_DTO> grid1List = new ArrayList<>();
					
					for(IBSMR0001238_GRID_ODT grid : ibsmr1238odt.getGrid()) {
						// 전자뱅킹상태코드가 등록(10) 이고 수수료적용코드가 건별(2) 일때
						if ("10".equals(grid.getEbnkSrvcStcd()) && "2".equals(grid.getEfFeeAplCd())) {
							INBSmsRawTrnTxtNtcGrid1_DTO grid1dto = new INBSmsRawTrnTxtNtcGrid1_DTO();
							
							grid1dto.setDpsAcno(grid.getDpsAcno()); 					// 수신계좌번호
							grid1dto.setEbnkSrvcStcd(grid.getEbnkSrvcStcd()); 		// 전자뱅킹서비스상태코드
							grid1dto.setHpNo1(grid.getHpNo1()); 							// 핸드폰번호_1
							grid1dto.setRgsCnt(grid.getRgsCnt()); 							// 등록건수
							grid1dto.setBalNtrsnYn(grid.getBalNtrsnYn()); 				// 잔액미전송여부
							grid1dto.setSmsTmsLimAm(grid.getSmsTmsLimAm()); 		// SMS전송제한금액
							grid1dto.setTmsStaTm(grid.getTmsStaTm());		 		// 전송시작시각
							grid1dto.setTmsEndTm(grid.getTmsEndTm()); 				// 전송종료시각
							grid1dto.setNtcLimCnt(grid.getNtcLimCnt()); 				// 통지제한건수
							grid1dto.setSmsLstNtcDt(grid.getSmsLstNtcDt()); 			// SMS최종통지일자
							grid1dto.setLstNtcCnt(grid.getLstNtcCnt()); 					// 최종통지건수
							grid1dto.setFstlNwolAcno(grid.getFstlNwolAcno()); 		// 수수료결제신구계좌번호
							grid1dto.setSmsFeeWdrDd(grid.getSmsFeeWdrDd());	 	// SMS수수료출금일
							grid1dto.setFeeLevyDt(grid.getFeeLevyDt()); 				// 수수료징수일자
							grid1dto.setEfFeeAplCd(grid.getEfFeeAplCd()); 				// 전자금융수수료적용코드
							grid1dto.setFxmpXprDt(grid.getFxmpXprDt()); 				// 수수료면제만기일자
							grid1dto.setSmsCtrDt(grid.getSmsCtrDt()); 					// SMS계약일자
							grid1dto.setFstCtrDt(grid.getFstCtrDt()); 						// 최초계약일자
							grid1dto.setMdKdcd(grid.getMdKdcd()); 						// 매체종류코드
							grid1dto.setSmsRqSrno(grid.getSmsRqSrno()); 				// SMS신청일련번호
							grid1dto.setAdvpeEno(grid.getAdvpeEno()); 					// 권유자직원번호
							grid1dto.setSmsCancDt(grid.getSmsCancDt()); 				// SMS해지일자
							grid1dto.setFeeDfpmLevyYn(grid.getFeeDfpmLevyYn()); 	// 수수료후불징수여부
							grid1dto.setAtsSndLimYn(grid.getAtsSndLimYn()); 			// 자동이체발송제한여부
							grid1dto.setCusInfNlkgYn(grid.getCusInfNlkgYn()); 			// 고객정보미연동여부
							grid1dto.setFeeWdrGdncNoreYn(grid.getFeeWdrGdncNoreYn()); // 수수료출금안내미수신여부
							grid1dto.setLstFeeWdrDd(grid.getLstFeeWdrDd()); 		// 최종수수료출금일
							grid1dto.setLstFeePymCnt(grid.getLstFeePymCnt()); 		// 최종수수료납부건수
							grid1dto.setLstFeePymAm(grid.getLstFeePymAm()); 		// 최종수수료납부금액
							grid1dto.setByImpnScdCnt(grid.getByImpnScdCnt()); 		// 건별부과예정건수
							grid1dto.setByImpnScdAm(grid.getByImpnScdAm()); 		// 건별부과예정금액
							grid1dto.setLangDscd(grid.getLangDscd()); 					// 언어구분코드
							
							grid1List.add(grid1dto);
						}
					}
					output.setiNBSmsRawTrnTxtNtcGrid1_DTO(grid1List);
				}
			} catch(WFApplicationException e){
				logger.error("IBSMR0003919 WFApplicationException 전문 error :: {}", e.getMessage());
				logger.error("IBSMR0003919 WFApplicationException 전문 error :: {}", e);
			} catch(Exception e){
				logger.error("IBSMR0003919 Exception전문 error :: {}", e.getMessage());
				logger.error("IBSMR0003919 Exception전문 error :: {}", e);
				//  일시적인 시스템오류 입니다. 고객센터로 연락하시기 바랍니다. 오류내용 : [{0}]
//				throw new WFApplicationException("FNSE0003", new Object[] {e.getMessage()});
				throw new WFApplicationException("FNSE0003");
			}
		}
		
		return output;
		
	}

	/**
	 * SMS인증번호.발송 호출  
	 * 
	 * @param input SMS인증번호.발송 호출.컨트롤러.입력.IO
	 * @return SMS인증번호발송.호출.컨트롤러.출력.IO 
	 */
	@BxmCategory(logicalName="SMS인증번호.발송.호출", description="SMS인증번호.발송 호출", author="90190264")
	public INBSmsRawNtcSrvcCallSmsCrtfNoSnd_ODT callSmsCrtfNoSnd(INBSmsRawNtcSrvcCallSmsCrtfNoSnd_IDT input) {
		
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		sHRCRTAddCrtfHp_COM= WFApplicationContext.getBean(sHRCRTAddCrtfHp_COM, SHRCRTAddCrtfHp_COM.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */
		INBSmsRawNtcSrvcCallSmsCrtfNoSnd_ODT output= new INBSmsRawNtcSrvcCallSmsCrtfNoSnd_ODT();
		
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession(); 
		
		// 로그인 체크
		if (shrCMMLoginSession_COM.istLogin()) {
			SHRCRTSmsCrtfNoReqInp_DTO shrCrtfNoInDto = new SHRCRTSmsCrtfNoReqInp_DTO();
			
			shrCrtfNoInDto.setSmsMsgTxt(""); 															// SMS메시지내용
			shrCrtfNoInDto.setSmsBizLrclCd(""); 														// SMS업무대분류코드
			shrCrtfNoInDto.setSmsBizMclfCd(""); 														// SMS업무중분류코드
			shrCrtfNoInDto.setUmsTmplCd("SMWDCSCA0120360"); 								// UMS템플릿코드(SMWDCSCA0120360: [우리은행] 입출금통지서비스 인증번호 )
			shrCrtfNoInDto.setAddYn("N");																// 추가여부
			shrCrtfNoInDto.setAutoYn("N"); 																// 자동여부
			shrCrtfNoInDto.setChrTxt(""); 																// 문자내용
			shrCrtfNoInDto.setHpNo(input.getHpNo()); 												// 핸드폰번호
			shrCrtfNoInDto.setUsnm(currentCust.getUsnm()); 										// 이용자명
			shrCrtfNoInDto.setUserId(currentCust.getUserId()); 									// 사용자ID
			shrCrtfNoInDto.setEncyRbno(currentCust.getEncyRbno()); 							// 암호화주민사업자등록번호
			shrCrtfNoInDto.setItcsno(currentCust.getItcsno()); 									// 통합고객번호
			
			
			// SMS인증번호.요청
			SHRCRTSmsCrtfNoReqOut_DTO shrCrtfNoOutDto = sHRCRTAddCrtfHp_COM.reqSmsCrtfNo(shrCrtfNoInDto);
			// 성공여부 세팅
			output.setScsYn(shrCrtfNoOutDto.getScsYn()); 
			output.setCrtfNo(shrCrtfNoOutDto.getCrtfNo());
		} else {
			//  로그인 세션이 존재하지 않습니다.
			throw new WFApplicationException("CMME0018");
		}
		return output;
	}

	/**
	 * SMS인증번호.확인 호출 
	 * 
	 * @param input SMS인증번호.확인 호출.컨트롤러.입력.IO
	 * @return SMS인증번호확인.호출.컨트롤러.출력.IO 
	 */
	@BxmCategory(logicalName="SMS인증번호.확인.호출", description="SMS인증번호.확인 호출", author="90190264")
	public INBSmsRawNtcSrvcCallSmsCrtfNoChk_ODT callSmsCrtfNoChk(INBSmsRawNtcSrvcCallSmsCrtfNoChk_IDT input) {
		
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		sHRCRTAddCrtfHp_COM= WFApplicationContext.getBean(sHRCRTAddCrtfHp_COM, SHRCRTAddCrtfHp_COM.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */
		INBSmsRawNtcSrvcCallSmsCrtfNoChk_ODT output= new INBSmsRawNtcSrvcCallSmsCrtfNoChk_ODT();
		
		// 로그인 체크
		if (shrCMMLoginSession_COM.istLogin()) {
			// SMS인증번호.검증.호출
			Boolean chkCrtfNoRslt = sHRCRTAddCrtfHp_COM.callSmsCrtfNovrf(input.getCrtfNo(), "N");		// 인증번호, SMS 추가인증 업무
			
			output.setCrtfNoRslt(chkCrtfNoRslt);
		} else {
			//  로그인 세션이 존재하지 않습니다.
			throw new WFApplicationException("CMME0018");
		}
		
		return output;
	}
		
}
