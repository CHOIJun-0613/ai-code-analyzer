package com.skbank.sml.fns.mpb.com;

import bxm.common.annotaion.BxmCategory;
import io.micrometer.core.instrument.util.StringUtils;

import com.skbank.sml.cmm.shr.com.SHRCMMInterfaceCfg_COM;
import com.skbank.sml.cmm.shr.com.SHRCMMLoginSession_COM;
import com.skbank.sml.cmm.shr.com.SHRUmsPushSend_COM;
import com.skbank.sml.cmm.shr.dto.CMM_CURRENT_CUST;
import com.skbank.sml.cmm.shr.dto.SHRUmsPushSend_DTO;
import com.skbank.sml.fns.mpb.dbm.MET_PBOK_MSG_CAD_INF001_DBM;
import com.skbank.sml.fns.mpb.dbm.MET_PBOK_NTAR_INF001_DBM;
import com.skbank.sml.fns.mpb.dto.MetPbokBscInfInq_DIDT;
import com.skbank.sml.fns.mpb.dto.MetPbokBscInfInq_DODT;
import com.skbank.sml.fns.mpb.dto.MetPbokBscMbhInfGrid_DIDT;
import com.skbank.sml.fns.mpb.dto.MetPbokBscMbhInfGrid_DODT;
import com.skbank.sml.fns.mpb.dto.MetPbokBscMbhInf_DIDT;
import com.skbank.sml.fns.mpb.dto.MetPbokBscMbhInf_DODT;
import com.skbank.sml.fns.mpb.dto.MetPbokImgInfInq_DODT;
import com.skbank.sml.fns.mpb.dto.MetPbokMbhInfInq_DIDT;
import com.skbank.sml.fns.mpb.dto.MetPbokMbhInfInq_DODT;
import com.skbank.sml.fns.mpb.dto.MetPbokMbhInfListInq_DODT;
import com.skbank.sml.fns.shr.com.SHRMPBBiz_COM;
import com.skbank.sml.fns.shr.cst.cstt.SHRMPBCmmConstant;
import com.skbank.sml.fns.shr.dto.SHRMPBBizSelectPushInfOut_DTO;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_MSG_CAD_INF001SelectMetPbokMsgCadInf_DIDT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_MSG_CAD_INF001SelectMetPbokMsgCadInf_DODT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_NTAR_INF001InsertNtarinf_DIDT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_NTAR_INF001SelectNtarinf_DIDT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_NTAR_INF001SelectNtarinf_DODT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_NTAR_INF001UpdateNtarinf_DIDT;
import com.skbank.sml.fns.mpb.dto.MPBMetPbokBscMnginsertMetPbokPushNtfcSndInput_DTO;
import com.skbank.sml.fns.mpb.dto.MetPbokBscInfGrid;
import com.skbank.sml.ifi.mca.eims4.dto.IBSMR0005784_GRID_IDT;
import com.skbank.sml.ifi.mca.eims4.dto.IBSMR0005784_GRID_ODT;
import com.skbank.sml.ifi.mca.eims4.dto.IBSMR0005784_IDT;
import com.skbank.sml.ifi.mca.eims4.dto.IBSMR0005784_ODT;
import com.skbank.sml.ifi.mca.eims9.dto.IBSMR0005769_GRID_ODT;
import com.skbank.sml.ifi.mca.eims9.dto.IBSMR0005769_IDT;
import com.skbank.sml.ifi.mca.eims9.dto.IBSMR0005769_ODT;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0005769_COM;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0005784_COM;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import fwk.skbank.asis.adaptor.dto.request.WFInterfaceCfg;
import fwk.skbank.asis.adaptor.dto.response.WFInfResponse;
import fwk.skbank.asis.adaptor.header.request.WFNciHeader;
import fwk.skbank.online.context.WFApplicationContext;
import fwk.skbank.online.exception.app.WFApplicationException;
import fwk.skbank.online.exception.frm.SFAdaptorApplicationException;
import fwk.skbank.online.exception.frm.SFInterfaceSystemException;
import fwk.skbank.online.file.controller.dto.WFFileUtilDTO;
import fwk.skbank.online.file.util.WFFileUtils;

/**
 * 1.업무명 : 금융서비스
 * 2.단위업무명 : NEWWON 중분류 모임통장
 * 3.프로그램명 : 모임통장.일반.관리.컴포넌트
 * 4.설명 : 모임통장의 일반적인 정보를 관리하는 컴포넌트
 * 
 * @Class MPBMetPbokBscMng_COM.java
 * @author 90190263
 * @since 2024.03.27
 * @version 1.0
 */		
@Component
@BxmCategory(logicalName="모임통장.일반.관리.컴포넌트", description="모임통장의 일반적인 정보를 관리하는 컴포넌트")
public class MPBMetPbokBscMng_COM {
	private Logger logger= LoggerFactory.getLogger(getClass());
	/**
	 * 세션 관리 컴포넌트
	 */
	private SHRCMMLoginSession_COM shrCMMLoginSession_COM;

	/**
	 * WFInterfaceCfg 생성 컴포넌트
	 */
	private SHRCMMInterfaceCfg_COM sHRCMMInterfaceCfg_COM;
	
	/**
	 * 공지사항.정보.관리001.DBM
	 */
	private MET_PBOK_NTAR_INF001_DBM ntarInfMng001_DBM;
	/**
	 * 메시지카드.정보.관리001.DBM
	 */
	private MET_PBOK_MSG_CAD_INF001_DBM metPbokMsgCadInf001_DBM;
	/**
	 * 모임통장 기본정보조회
	 */
	private SHRIBSMR0005769_COM sHRIBSMR0005769_COM;
	/**
	 * 모임통장 기본 및 회원 원장변경
	 */
	private SHRIBSMR0005784_COM sHRIBSMR0005784_COM;
	/**
	 * 모임통장 쉐어 컴포넌트
	 */
	private SHRMPBBiz_COM sHRMPBBiz_COM;
	/**
	 * UMS_PUSH 전송
	 */
	private SHRUmsPushSend_COM sHRUmsPushSend_COM;
	/**
	 * 모임통장.회원.관리.컴포넌트
	 */
	private MPBMetPbokMbhMng_COM mPBMetPbokMbhMng_COM;
	
	/**
	 * 모임통장의 기본정보를 조회하는 서비스
	 * 
	 * 
	 * @param input 모임통장.기본.정보.조회.컨트롤러.입력.IO
	 * @return 모임통장.기본.정보.조회.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName="모임통장.기본정보.조회", description="모임통장의 기본정보를 조회하는 서비스\r\n", author="90190263")
	public MetPbokBscInfInq_DODT selectMetPbokBscInf(MetPbokBscInfInq_DIDT input
	)
	{
		/**
		* @BXMType GetBean
		*/
		// WFInterfaceCfg 생성 컴포넌트
		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class);
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		sHRIBSMR0005769_COM= WFApplicationContext.getBean(sHRIBSMR0005769_COM, SHRIBSMR0005769_COM.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */
		MetPbokBscInfInq_DODT output= new MetPbokBscInfInq_DODT();
		
		/*
		 * 로직 추가
		 */
		//세션고객정보
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession(); 
		if(logger.isDebugEnabled()) {
			logger.debug("currentCust ====== {} ::: ", currentCust);
		} 
		
		if(logger.isDebugEnabled()) {
			logger.debug("90190263 모임통장.기본정보.조회 SVC input {} ::: ", input);
		}
		
		String errMsgTxt = "";
		String errMsgId = "";
		
		/**
		 * 연계시스템 호출
		 * TYPE : MCA
		 * ID : IBSMR0005769
		 * NM : 뉴WON뱅킹의 모임통장 기본정보 조회 전문을 수신하여 처리한다. 
		 */
		/**
		 * @BXMType Try
		 * 
		 */
		try{
			//  MCA WFInterfaceCfg 객체 획득
			WFInterfaceCfg interfaceCfg  = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg();
			interfaceCfg.setInterfaceId("IBSMR0005769");
			
	        // WFNciHeader 셋팅
            WFNciHeader wfnciHeader = interfaceCfg.getNciHeader();
            
	        // 간편회원일 경우 userID, 통합고객번호 초기화
	        if( shrCMMLoginSession_COM.isEsnsMbh() == true ) {
	        	wfnciHeader.setEbnkUtzpeNo("");
	            wfnciHeader.setItcsno("");  
	        }

            // interfaceCfg 셋팅
            interfaceCfg.setNciHeader(wfnciHeader);   
	        
	        IBSMR0005769_IDT iIBSMR0005769 = new IBSMR0005769_IDT();
	        
	        iIBSMR0005769.setInqDis(input.getInqDis()); // 조회구분
	        iIBSMR0005769.setMetMngNo(input.getMetMngNo()); // 모임관리번호
	        iIBSMR0005769.setNxtMetMngNo(input.getNxtMetMngNo()); // 다음모임관리번호
	        
	        if(logger.isDebugEnabled()) {
				logger.debug("90190263 모임통장.기본정보.조회 SVC iIBSMR0005769 {} ::: ", iIBSMR0005769);
			}
			
	        IBSMR0005769_ODT oIBSMR0005769= new IBSMR0005769_ODT();
	        
			WFInfResponse<IBSMR0005769_ODT> mcaOutput = sHRIBSMR0005769_COM.callTrx(iIBSMR0005769, interfaceCfg);
	
			oIBSMR0005769 = mcaOutput.getResponseData();
			
			/**
			 * @BXMType IF
			 * 정상 조회 처리여부
			 */
			output.setMetOrgJnngYn(oIBSMR0005769.getMetOrgJnngYn()); // 모임원가입여부
			output.setMetMbhJnngCnt(oIBSMR0005769.getMetMbhJnngCnt()); // 모임회원가입건수
			output.setMetmbDlyWdrLmtAvlAm(oIBSMR0005769.getMetmbDlyWdrLmtAvlAm());
			output.setNxtMetMngNo(oIBSMR0005769.getNxtMetMngNo()); //다음모임관리번호
			output.setGridCnt(oIBSMR0005769.getGridCnt()); // 그리드건수
			// 모임통장.기본.정보.조회.DBM. 출력.IO
			List<MetPbokBscInfGrid> outDataList = new ArrayList<>();
			
			for( IBSMR0005769_GRID_ODT oMetPbokBscData : oIBSMR0005769.getGrid()) {
				MetPbokBscInfGrid outData = new MetPbokBscInfGrid();
				outData.setMetMngNo(oMetPbokBscData.getMetMngNo()); // 모임관리번호
				outData.setEbnkUtzpeNo(oMetPbokBscData.getEbnkUtzpeNo()); // 전자뱅킹이용자번호
				outData.setMetCtrStcd(oMetPbokBscData.getMetCtrStcd()); // 모임계약상태코드
				outData.setMetCtrStcdNm(oMetPbokBscData.getMetCtrStcdNm()); // 모임계약상태코드명
				outData.setMetPbokDscd(oMetPbokBscData.getMetPbokDscd()); // 모임통장구분코드
				outData.setMetPbokDscdNm(oMetPbokBscData.getMetPbokDscdNm()); // 모임통장구분코드명
				outData.setMetNm(oMetPbokBscData.getMetNm()); // 모임명
				outData.setRcvBkwAcno(oMetPbokBscData.getRcvBkwAcno()); // 입금전행계좌번호
				outData.setCusUsgBkwAcno(oMetPbokBscData.getCusUsgBkwAcno()); // 고객사용전행계좌번호
				outData.setItcsno(oMetPbokBscData.getItcsno()); // 통합고객번호
				outData.setCusKorlNm(oMetPbokBscData.getCusKorlNm()); // 고객한글명
				outData.setCusBkpnNm(oMetPbokBscData.getCusBkpnNm()); // 고객부기명
				outData.setCtBal(oMetPbokBscData.getCtBal()); // 현재잔액
				outData.setPayAvlBal(oMetPbokBscData.getPayAvlBal()); // 지급가능잔액
				outData.setPdcd(oMetPbokBscData.getPdcd()); // 상품코드
				outData.setPdcdKorlNm(oMetPbokBscData.getPdcdKorlNm()); // 상품코드한글명
				outData.setPrdKorlAbrNm(oMetPbokBscData.getPrdKorlAbrNm()); // 상품한글단축명
				outData.setRlfAcno(oMetPbokBscData.getRlfAcno()); // 안심계좌번호
				outData.setMbpfPymDt(oMetPbokBscData.getMbpfPymDt()); // 회비납부일자
				outData.setMbpfPymCycd(oMetPbokBscData.getMbpfPymCycd()); // 회비납부주기코드
				outData.setMbpfPymCycdNm(oMetPbokBscData.getMbpfPymCycdNm()); // 회비납부주기코드명
				outData.setMbpfPmtgtAm(oMetPbokBscData.getMbpfPmtgtAm()); // 회비납부대상금액
				outData.setAgmdCollDt(oMetPbokBscData.getAgmdCollDt()); // 동의서징구일자
				outData.setAdvpeEno(oMetPbokBscData.getAdvpeEno()); // 권유자직원번호
				outData.setAsmnlApvCd(oMetPbokBscData.getAsmnlApvCd()); // 공동명의승인코드
				outData.setAsmnlApvCdNm(oMetPbokBscData.getAsmnlApvCdNm()); // 공동명의승인코드명
				outData.setRppeChgRgsYn(oMetPbokBscData.getRppeChgRgsYn()); // 대표자변경등록여부
				outData.setRppeChgRgsDt(oMetPbokBscData.getRppeChgRgsDt()); // 대표자변경등록일자
				outData.setRppeChgVldDt(oMetPbokBscData.getRppeChgVldDt()); // 대표자변경유효일자
				outData.setMetDscd(oMetPbokBscData.getMetDscd()); // 모임구분코드
				outData.setMetDscdNm(oMetPbokBscData.getMetDscdNm()); // 모임구분코드명
				outData.setMetRgsDt(oMetPbokBscData.getMetRgsDt()); // 모임등록일자
				outData.setRgsTm(oMetPbokBscData.getRgsTm()); // 등록시각
				outData.setMetBscImgUrlNm(oMetPbokBscData.getMetBscImgUrlNm()); // 모임기본이미지URL명
				outData.setMetMbhSrno(oMetPbokBscData.getMetMbhSrno()); // 모임회원일련번호
				outData.setMetMbhAlsNm(oMetPbokBscData.getMetMbhAlsNm()); // 모임회원별칭명
				outData.setMetMbhNm(oMetPbokBscData.getMetMbhNm()); // 모임회원명
				outData.setMetMbhDscd(oMetPbokBscData.getMetMbhDscd()); // 모임회원구분코드
				outData.setMetMbhDscdNm(oMetPbokBscData.getMetMbhDscdNm()); // 모임회원구분코드명
				outData.setMetMbhImgUrlNm(oMetPbokBscData.getMetMbhImgUrlNm()); // 모임회원이미지URL명
				outData.setMetMbhRgsCnt(oMetPbokBscData.getMetMbhRgsCnt()); // 모임회원등록건수
				outData.setMetMbhScssCnt(oMetPbokBscData.getMetMbhScssCnt()); // 모임회원탈퇴건수
				outData.setMetRprsAlsNm(oMetPbokBscData.getMetRprsAlsNm()); // 모임대표별칭명
				outData.setMetRprsMbhNm(oMetPbokBscData.getMetRprsMbhNm()); // 모임대표회원명
				outData.setMetRprsImgUrlNm(oMetPbokBscData.getMetRprsImgUrlNm()); // 모임대표이미지URL명
				
				outDataList.add(outData);
			}
			
			output.setGrid(outDataList);
			
			if(logger.isDebugEnabled()) {
				logger.debug("90190263 모임통장.기본정보.조회 COM oIBSMR0005769  {} ::: ", oIBSMR0005769);
			}
		} catch (Exception e) {
			logger.error("IBSMR0005769 전문 error :: {}", e);
			
			if ( e instanceof SFAdaptorApplicationException ) {
				SFAdaptorApplicationException se = (SFAdaptorApplicationException) e;
				logger.error("SFAdaptorApplicationException {} ", se);
				
				Object[] args = se.getArguments();
	            
	            if(args != null && args.length>0) {
	            	errMsgTxt = args[0].toString();
				}
	            errMsgId = se.getCode();
	            
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
				errMsgId = "9999";
				errMsgTxt = e.getMessage();				
			}
			throw new WFApplicationException("FNSE0006", new Object[] {errMsgTxt, errMsgId});
		}
		
		if(logger.isDebugEnabled()) {
			logger.debug("90190263 모임통장.기본정보.조회 COM output  {} ::: ", output);
		}
		return output;
			
	}
	
	/**
	 * 모임통장의 기본 및 회원 원장을 변경하는 컴포넌트
	 * 08 : 모임회칙등록/변경(일반모드) 	 - 회비납부일자, 회비납부대상금액
     * 09 : 모임구분코드변경(일반모드)  	 - 모임구분코드
     * 10 : 모임거래중지등록           	 	 - 입력항목 없음
     * 11 : 모임거래중지해제           	 	 - 입력항목 없음
     * 12 : 모임명변경                 	 	 - 모임명
     * 13 : 동의서징구일자             	 	 - 동의서징구일자
     * 
	 * 19 : 회비그만모으기
	 *  
	 * 20 : 모임기본이미지URL명 변경   
	 *  
     * 23 : 모임회비납부금액변경(일반모드)	 - 건수, 그리드 회원일련번호, 회비납부대상금액
     * 24 : 모임회원(별칭)명면경(일반모드)	 - 건수, 그리드 회원일련번호, 모임회원명
     * 25 : 이용자분류코드변경            	 - 건수, 그리드 회원일련번호, 전자뱅킹이용자번호
     * 26 : 공지발송구분코드변경          	 - 건수, 그리드 회원일련번호, 공지방송구분코드
     * 27 : 동의서징구일자(모임회원)      	 - 건수, 그리드 회원일련번호, 동의서징구일자
     * 28 : 모임회원이미지URL명 변경   
     * 
     * 51 : 생활비월목표액 등록/변경      	 - 생활비금액
     * 
	 * @param input 모임통장.기본.정보.조회.DBM.입력.IO
	 * @return 모임통장.기본.정보.조회.DBM.출력.IO
	 */
	@BxmCategory(logicalName="모임통장.기본.회원.정보.수정", description="모임통장의 기본 및 회원 정보를 변경하는 컴포넌트\r\n", author="90190263")
	public MetPbokBscMbhInf_DODT updateMetPbokBscMbhInf(MetPbokBscMbhInf_DIDT input
	) throws WFApplicationException  {
		/**
		* @BXMType GetBean
		*/
		// WFInterfaceCfg 생성 컴포넌트
		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class);
		shrCMMLoginSession_COM= WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		sHRIBSMR0005784_COM= WFApplicationContext.getBean(sHRIBSMR0005784_COM, SHRIBSMR0005784_COM.class);
	
		/**
		 * @BXMType VariableDeclaration
		 */
		MetPbokBscMbhInf_DODT output= new MetPbokBscMbhInf_DODT();
		
		/**
		 * 연계시스템 호출
		 * TYPE : MCA
		 * ID : IBSMR0005784
		 * NM : 모임통장 기본 및 회원 원장변경
		 */
		if(logger.isDebugEnabled()) {
				logger.debug("90190263 모임통장.기본.회원.정보.수정 COM input {} ::: ", input);
		}
		//세션고객정보
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession();
		if(logger.isDebugEnabled()) {
			logger.debug("currentCust  {} ::: ", currentCust);
		}
		
		String errMsgTxt = "";
		String errMsgId = "";
		
		/**
		 * @BXMType Try
		 * 
		 */
		try{
			//  MCA WFInterfaceCfg 객체 획득
			WFInterfaceCfg interfaceCfg  = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg();
			interfaceCfg.setInterfaceId("IBSMR0005784");
			
	        // WFNciHeader 셋팅
            WFNciHeader wfnciHeader = interfaceCfg.getNciHeader();
            
	        // 간편회원일 경우 userID, 통합고객번호 초기화
	        if( shrCMMLoginSession_COM.isEsnsMbh() == true ) {
	        	wfnciHeader.setEbnkUtzpeNo("");
	            wfnciHeader.setItcsno("");  
	        }

            // interfaceCfg 셋팅
            interfaceCfg.setNciHeader(wfnciHeader);
            
	        IBSMR0005784_ODT oIBSMR0005784= new IBSMR0005784_ODT();
	        
	        IBSMR0005784_IDT iIBSMR0005784 = new IBSMR0005784_IDT();
	        iIBSMR0005784.setMetChgDscd(input.getMetChgDscd()); // 모임변경구분코드
	        iIBSMR0005784.setMetMngNo(input.getMetMngNo()); // 모임관리번호
	        iIBSMR0005784.setMetNm(input.getMetNm()); // 모임명
	        iIBSMR0005784.setMbpfPymDt(input.getMbpfPymDt()); // 회비납부일자
	        iIBSMR0005784.setMbpfPmtgtAm(input.getMbpfPmtgtAm()); // 회비납부대상금액
	        iIBSMR0005784.setMetDscd(input.getMetDscd()); // 모임구분코드
	        iIBSMR0005784.setAgmdCollDt(input.getAgmdCollDt()); // 동의서징구일자
	        iIBSMR0005784.setLifecAm(input.getLifecAm()); // 생활비금액
	        iIBSMR0005784.setMetBscImgUrlNm(input.getMetBscImgUrlNm()); // 모임기본이미지URL명
	        iIBSMR0005784.setCnt(input.getCnt()); // 건수
	        
	        List<IBSMR0005784_GRID_IDT> inputDataList = new ArrayList<>();
	        
	        for(MetPbokBscMbhInfGrid_DIDT iBscMbhData : input.getGrid() ) {
	        	IBSMR0005784_GRID_IDT inputData = new IBSMR0005784_GRID_IDT();
	        	inputData.setMetMbhSrno(iBscMbhData.getMetMbhSrno()); // 모임회원일련번호
	        	inputData.setEbnkUtzpeNo(iBscMbhData.getEbnkUtzpeNo()); // 전자뱅킹이용자번호
	        	inputData.setMetMbhNm(iBscMbhData.getMetMbhNm()); // 모임회원명
	        	inputData.setMbpfPmtgtAm(iBscMbhData.getMbpfPmtgtAm()); // 회비납부대상금액
	        	inputData.setAncSndDscd(iBscMbhData.getAncSndDscd()); // 공지발송구분코드
	        	inputData.setAgmdCollDt(iBscMbhData.getAgmdCollDt()); // 동의서징구일자
	        	inputData.setMetMbhImgUrlNm(iBscMbhData.getMetMbhImgUrlNm()); // 모임회원이미지URL명

	        	inputDataList.add(inputData);
	        }
	        
	        iIBSMR0005784.setGrid(inputDataList);
	        

			if(logger.isDebugEnabled()) {
				logger.debug("90190263 모임통장.기본 및 회원 정보.수정 COM iIBSMR0005784 {} ::: ", iIBSMR0005784);
			}
			
			WFInfResponse<IBSMR0005784_ODT> mcaOutput = sHRIBSMR0005784_COM.callTrx(iIBSMR0005784, interfaceCfg);
	
			oIBSMR0005784 = mcaOutput.getResponseData();
			
			if(logger.isDebugEnabled()) {
				logger.debug("90190263 모임통장.기본 및 회원 정보.수정 COM oIBSMR0005784 {} ::: ", oIBSMR0005784);
			}
			
			output.setMetChgDscd(oIBSMR0005784.getMetChgDscd()); // 모임변경구분코드
			output.setMetChgDscdNm(oIBSMR0005784.getMetChgDscdNm()); // 모임변경구분코드명
			output.setMetMngNo(oIBSMR0005784.getMetMngNo()); // 모임관리번호
			output.setMetNm(oIBSMR0005784.getMetNm()); // 모임명
			output.setMbpfPymDt(oIBSMR0005784.getMbpfPymDt()); // 회비납부일자
			output.setMbpfPmtgtAm(oIBSMR0005784.getMbpfPmtgtAm()); // 회비납부대상금액
			output.setMetDscd(oIBSMR0005784.getMetDscd()); // 모임구분코드
			output.setMetDscdNm(oIBSMR0005784.getMetDscdNm()); // 모임구분코드명
			output.setAgmdCollDt(oIBSMR0005784.getAgmdCollDt()); // 동의서징구일자
			output.setLifecAm(oIBSMR0005784.getLifecAm()); // 생활비금액
			output.setMetBscImgUrlNm(oIBSMR0005784.getMetBscImgUrlNm()); // 모임기본이미지URL명
			
			output.setCnt(oIBSMR0005784.getCnt()); // 건수
	        
	        // 모임통장.기본.회원.정보.수정.GRID.DBM.출력.IO
			List<MetPbokBscMbhInfGrid_DODT> outDataList = new ArrayList<>();
			
	        for(IBSMR0005784_GRID_ODT oBscMbhData : oIBSMR0005784.getGrid() ) {
	        	MetPbokBscMbhInfGrid_DODT outData = new MetPbokBscMbhInfGrid_DODT();

	        	outData.setMetMbhSrno(oBscMbhData.getMetMbhSrno()); // 모임회원일련번호
	        	outData.setEbnkUtzpeNo(oBscMbhData.getEbnkUtzpeNo()); // 전자뱅킹이용자번호
	        	outData.setMetMbhNm(oBscMbhData.getMetMbhNm()); // 모임회원명
	        	outData.setMbpfPmtgtAm(oBscMbhData.getMbpfPmtgtAm()); // 회비납부대상금액
	        	outData.setAncSndDscd(oBscMbhData.getAncSndDscd()); // 공지발송구분코드
	        	outData.setAncSndDscdNm(oBscMbhData.getAncSndDscdNm()); // 공지발송구분코드명
	        	outData.setAgmdCollDt(oBscMbhData.getAgmdCollDt()); // 동의서징구일자
	        	outData.setMetMbhImgUrlNm(oBscMbhData.getMetMbhImgUrlNm()); // 모임회원이미지URL명
	        	
	        	outDataList.add(outData);
	        }
	        
	        output.setGrid(outDataList);
		} catch (Exception e) {
			logger.error("IBSMR0005784 전문 error :: {}", e);
			
			if ( e instanceof SFAdaptorApplicationException ) {
				SFAdaptorApplicationException se = (SFAdaptorApplicationException) e;
				logger.error("SFAdaptorApplicationException {} ", se);
				
				Object[] args = se.getArguments();
	            
	            if(args != null && args.length>0) {
	            	errMsgTxt = args[0].toString();
				}
	            errMsgId = se.getCode();
	            
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
				errMsgId = "9999";
				errMsgTxt = e.getMessage();				
			}
			throw new WFApplicationException("FNSE0006", new Object[] {errMsgTxt, errMsgId});
		}
		
		if(logger.isDebugEnabled()) {
			logger.debug("90190263 모임통장.기본 및 회원 정보.수정 COM output  {} ::: ", output);
		}
		
		return output;
	}
	
	/**
	 * 모임통장의 공지사항 정보를 조회하는 컴포넌트
	 * 
	 * @param input 공지사항.정보.조회.DBM.입력.IO
	 * @return 공지사항.정보.조회.DBM.출력.IO
	 */
	@BxmCategory(logicalName="공지사항.정보.조회", description="모임통장의 공지사항 정보를 조회하는 컴포넌트", author="90190263")
	public MET_PBOK_NTAR_INF001SelectNtarinf_DODT selectNtarinf(MET_PBOK_NTAR_INF001SelectNtarinf_DIDT input
	) throws WFApplicationException  {
		/**
		* @BXMType GetBean
		*/
		ntarInfMng001_DBM= WFApplicationContext.getBean(ntarInfMng001_DBM, MET_PBOK_NTAR_INF001_DBM.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */
		
		/*
		 * @BXMType DBM
		 * 공지사항.정보.관리001.DBM 공지사항.정보.조회
		 */
		// com.skbank.sml.fns.mpb.dbm.MET_PBOK_NTAR_INF001_DBM
		MET_PBOK_NTAR_INF001SelectNtarinf_DODT output = ntarInfMng001_DBM.selectNtarinf(input);
		
		return output;
	}
	
	/**
	 * 모임통장의 공지사항 정보를 등록하는 컴포넌트
	 * 
	 * @param input 공지사항.정보.등록.DBM.입력.IO
	 * @return 공지사항.정보.등록.DBM.출력.IO
	 */
	@BxmCategory(logicalName="공지사항.정보.등록", description="모임통장의 공지사항 정보를 등록하는 컴포넌트", author="90190263")
	public int insertNtarinf(MET_PBOK_NTAR_INF001InsertNtarinf_DIDT input
	) throws WFApplicationException  {
		/**
		* @BXMType GetBean
		*/
		ntarInfMng001_DBM= WFApplicationContext.getBean(ntarInfMng001_DBM, MET_PBOK_NTAR_INF001_DBM.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		/*
		 * @BXMType DBM
		 * 공지사항.정보.관리001.DBM 공지사항.정보.등록
		 */
		// com.skbank.sml.fns.mpb.dbm.MET_PBOK_NTAR_INF001_DBM
		int insertCnt = ntarInfMng001_DBM.insertNtarinf(input);
		
		return insertCnt;
	}
	
	/**
	 * 모임통장의 공지사항 정보를 수정하는 컴포넌트
	 * 
	 * @param input 공지사항.정보.수정.DBM.입력.IO
	 * @return 공지사항.정보.수정.DBM.출력.IO
	 */
	@BxmCategory(logicalName="공지사항.정보.수정", description="모임통장의 공지사항 정보를 수정하는 컴포넌트", author="90190263")
	public int updateNtarinf(MET_PBOK_NTAR_INF001UpdateNtarinf_DIDT input
	) throws WFApplicationException  {
		/**
		* @BXMType GetBean
		*/
		ntarInfMng001_DBM= WFApplicationContext.getBean(ntarInfMng001_DBM, MET_PBOK_NTAR_INF001_DBM.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		
		/*
		 * @BXMType DBM
		 * 공지사항.정보.관리001.DBM 공지사항.정보.수정
		 */
		// com.skbank.sml.fns.mpb.dbm.MET_PBOK_NTAR_INF001_DBM
		int updateCnt = ntarInfMng001_DBM.updateNtarinf(input);
		
		return updateCnt;
	}
	
	/**
	 * 회비를 미입금한 회원에게 메시지를 조회하기 위한 컴포넌트
	 * 
	 * @param input 메시지.카드.조회.DBM.입력.IO
	 * @return 메시지.카드.조회.DBM.출력.IO 
	 */
	@BxmCategory(logicalName="메시지.카드.조회", description="회비를 미입금한 회원에게 메시지를 조회하기 위한 컴포넌트", author="90190263")
	public List<MET_PBOK_MSG_CAD_INF001SelectMetPbokMsgCadInf_DODT> selectMsgCad(MET_PBOK_MSG_CAD_INF001SelectMetPbokMsgCadInf_DIDT input
	) throws WFApplicationException  {
		/**
		 * @BXMType VariableDeclaration
		 */
		
		/**
		* @BXMType GetBean
		*/
		metPbokMsgCadInf001_DBM= WFApplicationContext.getBean(metPbokMsgCadInf001_DBM, MET_PBOK_MSG_CAD_INF001_DBM.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		
		/*
		 * @BXMType DBM
		 * 공지사항.정보.관리001.DBM 공지사항.정보.수정
		 */
		// com.skbank.sml.fns.mpb.dbm.MET_PBOK_NTAR_INF001_DBM
		List<MET_PBOK_MSG_CAD_INF001SelectMetPbokMsgCadInf_DODT> output = metPbokMsgCadInf001_DBM.selectMetPbokMsgCadInf(input);
		
		return output;
	}
	
	/**
	 * 회비를 미입금한 회원에게 메시지를 조회하기 위한 컴포넌트
	 * 
	 * @param input 메시지.카드.조회.DBM.입력.IO
	 * @return 메시지.카드.조회.DBM.출력.IO
	 */
	@BxmCategory(logicalName = "모임통장.이미지.정보.조회", description = "모임통장의 이미지를 조회하는 컴포넌트", author = "90190263")
	public MetPbokImgInfInq_DODT selectMetPbokImgInf(String imgUrlNm
	) throws WFApplicationException  {
		/**
		 * @BXMType VariableDeclaration
		 */
		
		MetPbokImgInfInq_DODT output = new MetPbokImgInfInq_DODT();
		
		/**
		 * @BXMType IF
		 * @Desc 입력 검증 : 필수 입력 값 검증 코드를 작성 하십시오.
		 */
		if ( imgUrlNm  == null ) /**null check*/{
			throw new WFApplicationException("FNSE0005", new Object[]{"imgUrlNm"});
		}
		
		if (logger.isDebugEnabled()) {
			logger.debug("90190263 모임통장.이미지.정보.조회 SVC imgUrlNm ::: {} ", imgUrlNm);
		}
		
		
		try {
			int pathLastIndex = imgUrlNm.lastIndexOf("/");
			String tmpFileName = imgUrlNm.substring(pathLastIndex + 1); 
			String tmpFilePath = imgUrlNm.substring(0, pathLastIndex);
			
			if (logger.isDebugEnabled()) {
				logger.debug("90190263 모임통장.이미지.정보.조회 SVC pathLastIndex :::  {}", pathLastIndex);
				logger.debug("90190263 모임통장.이미지.정보.조회 SVC tmpFilePath ::: {}", tmpFilePath);
				logger.debug("90190263 모임통장.이미지.정보.조회 SVC tmpFileName ::: {}", tmpFileName);
			}
			
			//파일 다운로드
			WFFileUtilDTO fileInputDTO = new WFFileUtilDTO();
			fileInputDTO.setFileName(tmpFileName);
			fileInputDTO.setFilePath(tmpFilePath);
			
			WFFileUtilDTO fileResultDTO = WFFileUtils.readFile(fileInputDTO);

			if (logger.isDebugEnabled()) {
				logger.debug("90190263 모임통장.이미지.정보.조회 SVC fileResultDTO {} ::: ", fileResultDTO);
				logger.debug("90190263 모임통장.이미지.정보.조회 SVC FileData {} ::: ", fileResultDTO.getFileData());
			}
			
			if(!ObjectUtils.isEmpty(fileResultDTO)) {
				output.setFileNm(fileResultDTO.getFileName()); // 파일명
				output.setFileDir(fileResultDTO.getFileDir()); // 파일디렉토리
				output.setFilePath(fileResultDTO.getFilePath()); // 파일경로
				output.setFileSize(fileResultDTO.getFileSize()); // 파일크기
				output.setFileData(fileResultDTO.getFileData()); // 파일데이터
			}

		} catch(Exception e){
			logger.error("selectMetPbokImgInf Exception ::: {}", e);
		}
	
		if (logger.isDebugEnabled()) {
			logger.debug("90190263 모임통장.이미지.정보.조회 SVC output {} ::: ", output);
		}
				
		return output;
	}	
	
	/**
	 * 모임통장의 PUSH 알림을 발송한다.
	 * 
	 * @param input 모임통장.PUSH.알림.발송컨트롤러.입력.IO
	 * @return 모임통장.PUSH.알림.발송.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName = "모임통장.PUSH.알림.발송", description = "모임통장.PUSH.알림.발송", author = "90191355")
	public int insertMetPbokPushNtfcSnd(MPBMetPbokBscMnginsertMetPbokPushNtfcSndInput_DTO input) {
		/**
		* @BXMType GetBean
		*/
		mPBMetPbokMbhMng_COM = WFApplicationContext.getBean(mPBMetPbokMbhMng_COM, MPBMetPbokMbhMng_COM.class);
		sHRUmsPushSend_COM = WFApplicationContext.getBean(sHRUmsPushSend_COM, SHRUmsPushSend_COM.class);
		shrCMMLoginSession_COM= WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		sHRMPBBiz_COM= WFApplicationContext.getBean(sHRMPBBiz_COM, SHRMPBBiz_COM.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */

		if(logger.isDebugEnabled()) {
			logger.debug("90190263 모임통장.PUSH.알림.발송 COM input  {} ::: ", input);
		}
		 
		SHRMPBBizSelectPushInfOut_DTO oPushInf= sHRMPBBiz_COM.selectPushInf(input.getUmsTmplCd());

		if(logger.isDebugEnabled()) {
			logger.debug("90190263 모임통장.PUSH.알림.발송 COM selectPushInf oPushInf {} ::: ", oPushInf);
		}

		int sndCnt = 0;

		String itcsno 			= "";
		String metMbhAlsNm = "";
		String pushTitle 		= "";
		String pushMsgTxt 	= "";
		 
		MetPbokMbhInfInq_DIDT iMetPbokMbh = new MetPbokMbhInfInq_DIDT();
		MetPbokMbhInfInq_DODT oSendMbhData = new MetPbokMbhInfInq_DODT();
		List<MetPbokMbhInfListInq_DODT> sendMbhList = new ArrayList<MetPbokMbhInfListInq_DODT>();
		
		/**
		 * IBSMR0005771 
		 * 03 : 모임통장 회원목록 조회(모임관리번호별 목록조회)
    	 * 04 : 모임통장 회원목록 조회(모임회원별 상세조회)
    	 * 
    	 * [sndTgtDscd] 발송대상구분코드
		 * - A : 전체 모임원
		 * - 1 : 모임장
		 * - 2 : 해당 모임원
		 * - 3 : 특정회원
		 */

		MetPbokMbhInfInq_DODT oMetPbokMbh = new MetPbokMbhInfInq_DODT();
		
		if(SHRMPBCmmConstant.STR_RPWBCESS0132135.equals(input.getUmsTmplCd()) 
			|| SHRMPBCmmConstant.STR_RPWBCESS0132122.equals(input.getUmsTmplCd()) ) {
			MetPbokBscInfInq_DIDT iMetPbokBsc = new MetPbokBscInfInq_DIDT();
			iMetPbokBsc.setInqDis("02"); // 조회구분
			iMetPbokBsc.setMetMngNo(input.getMetMngNo()); // 모임관리번호
			
	        MetPbokBscInfInq_DODT oMetPbokBsc= this.selectMetPbokBscInf(iMetPbokBsc);
	        
	        MetPbokMbhInfListInq_DODT tmpMetPbokList = new MetPbokMbhInfListInq_DODT();
	        
	        for( MetPbokBscInfGrid oMetPbokBscData : oMetPbokBsc.getGrid()) {
	        	oMetPbokMbh.setMetNm(oMetPbokBscData.getMetNm());
	        	oMetPbokMbh.setRlfAcno(oMetPbokBscData.getRlfAcno());
	        	
	        	tmpMetPbokList.setItcsno(oMetPbokBscData.getItcsno());
	        	tmpMetPbokList.setEbnkUtzpeNo(oMetPbokBscData.getEbnkUtzpeNo());
	        	tmpMetPbokList.setMetMngNo(oMetPbokBscData.getMetMngNo());
	        	tmpMetPbokList.setMetMbhDscd("1");
	        }
	        
	        if(logger.isDebugEnabled()) {
				logger.debug("90190263 모임통장.PUSH.알림.발송 COM tmpMetPbokList  :: {} ", tmpMetPbokList);
			}
	        
	        oMetPbokMbh.setGrid(tmpMetPbokList);
	        
	        metMbhAlsNm = input.getMetMbhNm();
	        
		} else {
			 // 모임원 전체 조회
			iMetPbokMbh.setInqDis("03"); // 조회구분
			iMetPbokMbh.setMetMngNo(input.getMetMngNo()); // 모임관리번호
			
			oMetPbokMbh = mPBMetPbokMbhMng_COM.selectMetPbokMbhInf(iMetPbokMbh);
			
			if(input.getMetMbhSrno() != 0) {
				//input metMbhSrno 의 회원별칭명
				MetPbokMbhInfListInq_DODT tmpMbhInf = new MetPbokMbhInfListInq_DODT();
				
				tmpMbhInf = oMetPbokMbh.getGrid().stream()
						.filter(item -> input.getMetMbhSrno() == item.getMetMbhSrno())
						.findFirst().orElse(tmpMbhInf);
				
				if(logger.isDebugEnabled()) {
					logger.debug("90190263 모임통장.PUSH.알림.발송 COM tmpMbhInf  :: {} ", tmpMbhInf);
				}
				metMbhAlsNm = tmpMbhInf.getMetMbhAlsNm();
			}
			
		}
			
		if(SHRMPBCmmConstant.FOR_ALL_MEMBER.equals(oPushInf.getSndTgtDscd())) {
			// 모임장변경 동의 요청 
			if(SHRMPBCmmConstant.STR_RPWBCESS0132127.equals(input.getUmsTmplCd() )) {
				sendMbhList = new ArrayList<MetPbokMbhInfListInq_DODT>();
				// 동의하지 않은 사람들 필터링
				sendMbhList = oMetPbokMbh.getGrid().stream()
															  		 .filter(item -> !"2".equals(item.getRppeChgApvCd()) && !"1".equals(item.getRppeChgApvCd()))
															  		 .collect(Collectors.toList());
				

				if (logger.isDebugEnabled()) {
					logger.debug("90190263 모임통장.PUSH.알림.발송 COM  동의하지 않은 사람들 필터링 sendMbhList  :: {} ", sendMbhList);
				}
				
				// 동의하지 않은 사람이 없을 경우 차기모임장에게 모임장동의요청
				if(sendMbhList.size() == 0) {
					oPushInf= sHRMPBBiz_COM.selectPushInf(SHRMPBCmmConstant.STR_RPWBCESS0132130);
					
					sendMbhList = oMetPbokMbh.getGrid().stream()
																  		.filter(item -> "2".equals(item.getRppeChgApvCd()))
																  		.collect(Collectors.toList());
					
					if (logger.isDebugEnabled()) {
						logger.debug("90190263 모임통장.PUSH.알림.발송 COM  차기모임장 필터링 sendMbhList  :: {} ", sendMbhList);
					}
					
					input.setUmsTmplCd(SHRMPBCmmConstant.STR_RPWBCESS0132130);
				}
				
				oSendMbhData.setGrid(sendMbhList);
			} else {
				sendMbhList = new ArrayList<MetPbokMbhInfListInq_DODT>();
				oSendMbhData = oMetPbokMbh; 
			}
			
			if (logger.isDebugEnabled()) {
				logger.debug("90190263 모임통장.PUSH.알림.발송 COM 전체 회원정보조회 oMetPbokMbh  :: {} ", oMetPbokMbh);
			}
			
		} else if(SHRMPBCmmConstant.FOR_BOSS.equals(oPushInf.getSndTgtDscd())){
			//모임장에게만 발송
			sendMbhList = new ArrayList<MetPbokMbhInfListInq_DODT>();
			sendMbhList = oMetPbokMbh.getGrid().stream()
														  		.filter(item -> "1".equals(item.getMetMbhDscd()))
														  		.collect(Collectors.toList());
			
			if (logger.isDebugEnabled()) {
				logger.debug("90190263 모임통장.PUSH.알림.발송 COM 전체 회원정보조회 FOR_BOSS sendMbhList  :: {} ", sendMbhList);
			}
			
			oSendMbhData.setGrid(sendMbhList);
			
		} else if(SHRMPBCmmConstant.FOR_MEMBER.equals(oPushInf.getSndTgtDscd())){
			//모임원에게만 발송
			sendMbhList = new ArrayList<MetPbokMbhInfListInq_DODT>();
		
			sendMbhList = oMetPbokMbh.getGrid().stream()
																.filter(item -> input.getMetMbhSrno().equals(item.getMetMbhSrno()))
																.collect(Collectors.toList());
		
			
			if (logger.isDebugEnabled()) {
				logger.debug("90190263 모임통장.PUSH.알림.발송 COM 전체 회원정보조회 FOR_MEMBER sendMbhList  :: {} ", sendMbhList);
			}
			
			oSendMbhData.setGrid(sendMbhList);
		}

		if (logger.isDebugEnabled()) {
			logger.debug("90190263 모임통장.PUSH.알림.발송 COM 모임장/모임원 정보조회 oMetPbokMbh  :: {} ", oMetPbokMbh);
		}
		
		pushTitle 		= oPushInf.getTmsMsgTitl();
		pushMsgTxt 	= oPushInf.getTmsMsgTxt();
		
		if(logger.isDebugEnabled()) {
			logger.debug("90190263 모임통장.PUSH.알림.발송 COM metMbhAlsNm  :: {} ", metMbhAlsNm);
			logger.debug("90190263 모임통장.PUSH.알림.발송 COM pushMsgTxt  replace 전 {} ::: ", pushMsgTxt);
		}
		
		pushTitle 		= pushTitle.replaceAll("metMngNm", oSendMbhData.getMetNm()); 		// 푸시 타이틀 : 모임명 replace
		pushMsgTxt 	= pushMsgTxt.replaceAll("metMngNm", oSendMbhData.getMetNm()); 	// 푸시내용 	: 모임명 replace
		 
		if(logger.isDebugEnabled()) {
			logger.debug("90190263 모임통장.PUSH.알림.발송 COM pushMsgTxt  replace 후 {} ::: ", pushMsgTxt);
		}
		
		SHRUmsPushSend_DTO  pushSendInput = new SHRUmsPushSend_DTO();
		int umsReqSrno = 0;		// UMS요청일련번호
		
		for(MetPbokMbhInfListInq_DODT oSendMbhList : oSendMbhData.getGrid()) {
			// 우리은행 제출시 PUSH 발송
			pushSendInput = new SHRUmsPushSend_DTO();
			++umsReqSrno;
			
			if(StringUtils.isNotEmpty(oSendMbhList.getItcsno())) {
				itcsno =  oSendMbhList.getItcsno();
			} else {
				itcsno =  oSendMbhList.getEsnsMbhNo();
			}
			
			String pushInfo = "";
			String rlfAcno = oMetPbokMbh.getRlfAcno();
			
			StringBuffer pushInfo_BUFFER = new StringBuffer();
			pushInfo_BUFFER.append("NWFNS00007_001M"); 						// 화면ID
			pushInfo_BUFFER.append("&rlfAcno="); 									// 파라미터변수
			pushInfo_BUFFER.append(rlfAcno); 											// 파라미터값
			pushInfo = pushInfo_BUFFER.toString();
			 
			pushSendInput.setPushType("62"); 											// PUSH타입(내부url 호출 시:62) 
			pushSendInput.setPushInfo(""); 												// PUSH INFO
			pushSendInput.setUmsReqSrno(""); 											// UMS요청일련번호
			pushSendInput.setUmsTmplCd(input.getUmsTmplCd()); 				// UMS템플릿코드
			pushSendInput.setBizChrgEno("31700225"); 								// 업무담당직원번호
			pushSendInput.setUmsRgsDeptBrcd("20290"); 							// UMS등록부서점코드
			pushSendInput.setSndRsvDtm(""); 											// 발송예약일시
			pushSendInput.setUmsAppGrpId(""); 										// UMS앱그룹ID
			//---------------------------------------
			// PUSH입력정보
			//---------------------------------------
			if(SHRMPBCmmConstant.FOR_BOSS.equals(oPushInf.getSndTgtDscd())) {
				pushMsgTxt = pushMsgTxt.replaceAll("metMbhNm", metMbhAlsNm); 	// 모임회원명 replace
				pushSendInput.setUmsPushMpng2Txt(metMbhAlsNm);
				
				if(logger.isDebugEnabled()) {
					logger.debug("90190263 모임통장.PUSH.알림.발송 COM pushMsgTxt metMbhAlsNm replace 후 {} ::: ", pushMsgTxt);
				}
			} 
			
			pushSendInput.setUmsPushMpng1Txt(oMetPbokMbh.getMetNm());
			pushSendInput.setItCsno(itcsno); 											// 통합고객번호
			pushSendInput.setTmsTitlNm(pushTitle);		 							// 전송제목명
			pushSendInput.setTmsMsgTxt(pushMsgTxt); 							// 전송메시지내용
			pushSendInput.setTmsMsgDtlTxt(pushMsgTxt); 						// 전송메시지상세내용
			pushSendInput.setImgFilePathNm(""); 										// 이미지파일경로명
			pushSendInput.setUmsRecpTelNo(""); 										// UMS수신전화번호
			pushSendInput.setUmsDmsgTelNo("0215885000"); 						// UMS발신전화번호
			pushSendInput.setSmktCmgnId("");											// 세일즈마케팅캠페인ID
			pushSendInput.setPrecAvlpeEno(""); 										// 선행승인직원번호
			pushSendInput.setPrecAvlpeFnm(""); 										// 선행승인자성명
			pushSendInput.setCamRecSeq(""); 											// 캠페인이력일련번호
			pushSendInput.setPshSndRecSeq(""); 										// PUSH발송이력일련번호
			pushSendInput.setUserId(oSendMbhList.getEbnkUtzpeNo());		// 사용자아이디
			pushSendInput.setAppDscd("NW"); 											// 앱구분코드
			pushSendInput.setPushInfo("", pushInfo, "");
			pushSendInput.setUmsReqSrno(String.valueOf(umsReqSrno));		// UMS요청일련번호
			
			
			if(logger.isDebugEnabled()) {
				logger.debug("90190263 모임통장.PUSH.알림.발송 SVC pushSendInput  {} ::: ", pushSendInput);
			}
			
			sndCnt = sHRUmsPushSend_COM.pushSend(pushSendInput);
		}
		
		
		return sndCnt;
	}
}
