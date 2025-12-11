package com.skbank.sml.fns.pbp.com;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.skbank.sml.cmm.shr.com.SHRCMMInterfaceCfg_COM;
import com.skbank.sml.cmm.shr.com.SHRCMMLoginSession_COM;
import com.skbank.sml.cmm.shr.dto.CMM_CURRENT_CUST;
import com.skbank.sml.fns.pbp.dto.PBPPbokSpceDtlEstDeleteSpceAtsEst_DIDT;
import com.skbank.sml.fns.pbp.dto.PBPPbokSpceDtlEstDeleteSpceAtsEst_DODT;
import com.skbank.sml.fns.pbp.dto.PBPPbokSpceDtlEstInsertSpceAtsEst_DIDT;
import com.skbank.sml.fns.pbp.dto.PBPPbokSpceDtlEstInsertSpceAtsEst_DODT;
import com.skbank.sml.fns.pbp.dto.PBPPbokSpceDtlEstMngRawActatpminf_DIDT;
import com.skbank.sml.fns.pbp.dto.PBPPbokSpceDtlEstMngRawActatpminf_DODT;
import com.skbank.sml.ifi.mca.eims0.dto.IBSMR0000920_IDT;
import com.skbank.sml.ifi.mca.eims0.dto.IBSMR0006070_IDT;
import com.skbank.sml.ifi.mca.eims0.dto.IBSMR0006070_ODT;
import com.skbank.sml.ifi.mca.eims5.dto.IBSMR0006025_IDT;
import com.skbank.sml.ifi.mca.eims5.dto.IBSMR0006025_ODT;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0000920_COM;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0006025_COM;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0006070_COM;

import bxm.common.annotaion.BxmCategory;
import fwk.skbank.asis.adaptor.dto.request.WFEmpty_ODT;
import fwk.skbank.asis.adaptor.dto.request.WFInterfaceCfg;
import fwk.skbank.asis.adaptor.dto.response.WFInfResponse;
import fwk.skbank.online.context.WFApplicationContext;
import fwk.skbank.online.exception.app.WFApplicationException;

/**
 * 1.업무명 : 금융서비스
 * 2.단위업무명 : NEWWON 중분류 통장쪼개기
 * 3.프로그램명 : 통장.쪼개기.설정.관리.컴포넌트
 * 4.설명 : 통장 쪼개기 설정 관리 컴포넌트
 * - 자동이체 관리 (등록, 해지)
 * - 자동납부 관리 (등록, 수정, 해지)
 * 
 * @Class PBPPbokSpceDtlEst_COM.java
 * @author 90191355
 * @since 2024.04.15
 * @version 1.0
 */	
@Component
@BxmCategory(logicalName=" 통장.쪼개기.설정.관리.컴포넌트", description="통장쪼개기 설정 관리 컴포넌트")
public class PBPPbokSplitEstMng_COM {
	private Logger logger= LoggerFactory.getLogger(getClass());
	
	/**
	 * WFInterfaceCfg 생성 컴포넌트
	 */
	private SHRCMMInterfaceCfg_COM sHRCMMInterfaceCfg_COM;
	/**
	 * SHRCMMLoginSession 생성 컴포넌트
	 */
	private SHRCMMLoginSession_COM shrCMMLoginSession_COM;
	/**
	 * SHRIBSMR0006070_COM 자동이체 등록 관리
	 */
	private SHRIBSMR0006070_COM sHRIBSMR0006070_COM;
	/**
	 * SHRIBSMR0006025_COM 출금 동의 관리 (자동납부)
	 */
	private SHRIBSMR0006025_COM sHRIBSMR0006025_COM;
	/**
	 * SHRIBSMR0000920_COM 계좌자동이체해지
	 */
	private SHRIBSMR0000920_COM sHRIBSMR0000920_COM;

	/**
	 * 공간에서 설정한 자동이체를 등록 관리하는 컴포넌트
	 * 
	 * @param input 공간.상세.자동이체.설정.등록.DBM.입력.IO
	 * @return 공간.상세.자동이체.설정.등록.DBM.출력.IO
	 */
	@BxmCategory(logicalName="공간.자동이체.설정.등록", description="공간에 자동이체 설정을 등록하는 컴포넌트", author="90191355")
	public PBPPbokSpceDtlEstInsertSpceAtsEst_DODT insertSpceAtsEst(PBPPbokSpceDtlEstInsertSpceAtsEst_DIDT input) {
		/**
		 * @BXMType VariableDeclaration
		 */
		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class);
		sHRIBSMR0006070_COM = WFApplicationContext.getBean(sHRIBSMR0006070_COM, SHRIBSMR0006070_COM.class);
		shrCMMLoginSession_COM = WFApplicationContext	.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		
		PBPPbokSpceDtlEstInsertSpceAtsEst_DODT output = new PBPPbokSpceDtlEstInsertSpceAtsEst_DODT();
		try {
			// 세션고객정보
			CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession();
			if (logger.isDebugEnabled()) {
				logger.debug("currentCust ::: {} ::: ", currentCust);
			}

			WFInterfaceCfg subInterfaceCfg = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg();
			subInterfaceCfg.setInterfaceId("IBSMR0006070");

			IBSMR0006070_IDT iIBSMR0006070 = new IBSMR0006070_IDT();
			iIBSMR0006070.setAtsWdrBkwAcno(input.getRprsAcno()); //메인 계좌번호
			iIBSMR0006070.setAtsRcvBkwAcno(input.getSpceSrno()); // 자동이체입금전행계좌번호: 공간번호
			
			//매월 01~31일 사이 일자DD
			//매월: 01, 매주: 22, 매일: 20
			String cycle = input.getAtsCycd();
			String dd = input.getAtsDd();
			
			Calendar c = Calendar.getInstance();
			if ("01".equals(cycle)) {
				//매월
				Integer atsDD = Integer.valueOf(dd);
				int toDd = c.get(Calendar.DATE);
				if (toDd >= atsDD) {
					int toMonth = c.get(Calendar.MONTH); //0~11
					//자동이체 신청일이 오늘과 같거나 작으면 다음달로
					c.set(Calendar.MONTH, toMonth + 1);
				}
				c.set(Calendar.DATE, atsDD);
				
			} else if ("22".equals(cycle)) {
				Integer atsDD = Integer.valueOf(dd);
				//매주
				//요일 계산하여 더함
				int day = c.get(Calendar.DAY_OF_WEEK); //일: 1 ~ 토: 7
				//요일일때 dd 일~토 0~6로 들어옴, calendar와 싱크
				int dow = atsDD + 1;
				int plusDay = 0;
				
				int diffDay = dow - day;
				if (diffDay <= 0) {
					plusDay = 7 - day + dow;
				} else {
					plusDay = diffDay;
				}
				
				c.add(Calendar.DATE, plusDay);
			} else {
				//매일
				c.add(Calendar.DATE, 1);
			}
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd", Locale.KOREA);
			String startDate = sdf.format(c.getTime());
			
			iIBSMR0006070.setAtsCycd(cycle); // 자동이체주기코드
			iIBSMR0006070.setAtsBasDd(startDate.substring(6, 8)); // 자동이체기준일
			iIBSMR0006070.setAtsReqAm(input.getAtsAm()); // 자동이체요청금액
			iIBSMR0006070.setWdrActOwacNm(currentCust.getUsnm()); // 출금계좌예금주명
			iIBSMR0006070.setAtsStaDt(startDate); //자동이체 시작일자 -> 오늘 이후 일자
			iIBSMR0006070.setAtsEndDt("99991231"); //자동이체 종료일자 - 만기없음
			/**
			 * 고정
			 */
			iIBSMR0006070.setAtsTrnDtlKdcd("81"); // 자동이체거래상세종류코드
			iIBSMR0006070.setAtsRcvBkcd("020"); // 자동이체입금은행코드
			iIBSMR0006070.setAtsYn("N"); // 자동이체여부
			iIBSMR0006070.setRcveYn("N"); // 수령여부
			iIBSMR0006070.setAtsMretYn("N"); // 자동이체월세여부
			iIBSMR0006070.setCmdpLnamYn("N"); // 보상예금대출금여부
			iIBSMR0006070.setAfepAddPidYn("N"); // 만기후추가납입여부
			iIBSMR0006070.setDpsLnkYn("N"); // 수신연동여부
			iIBSMR0006070.setPbokYn("N"); // 통장여부
			iIBSMR0006070.setSmrtTrnAlwYn("N"); // 스마트거래허용여부
			iIBSMR0006070.setMsgSndYn("N"); // 메시지발송여부
					
			if (logger.isDebugEnabled()) {
				logger.debug("=======통장쪼개기 자동이체 등록 시작 Tx====== ::: input {}", iIBSMR0006070);
			}
			WFInfResponse<IBSMR0006070_ODT> mcaOutput = sHRIBSMR0006070_COM.callTrx(iIBSMR0006070, subInterfaceCfg);
			IBSMR0006070_ODT oIBSMR0006070 = mcaOutput.getResponseData();
			if (logger.isDebugEnabled()) {
				logger.debug("자동이체 등록 ODT ====== {} ::: ", oIBSMR0006070);
			}

			output.setRspRtcd("200");
			output.setRspMsgTxt("성공");
		} catch(WFApplicationException e){
			logger.error("IBSMR0006070 전문 error :: {}", e);
			Object[] args = e.getArguments();
			
			throw new WFApplicationException("FNSE0006", new Object[] {e.getCode()} , new Object[] {args[0].toString()});
		} catch(Exception e){
			logger.error("IBSMR0006070 전문 error :: {}", e);
		
			throw new WFApplicationException("FNSE0006", new Object[] {"9999"} , new Object[] {e.getMessage()});
		}
		
		
		return output;
	}
	
	/**
	 * 공간에서 설정한 자동이체를 해지하는 컴포넌트
	 * 
	 * @param input 공간.상세.자동이체.설정.해지.DBM.입력.IO
	 * @return 공간.상세.자동이체.설정.해지.DBM.출력.IO
	 */
	@BxmCategory(logicalName="공간.상세.자동이체.해지", description="공간에서 설정한 자동이체 해지하는 컴포넌트", author="90191355")
	public PBPPbokSpceDtlEstDeleteSpceAtsEst_DODT deleteSpceAtsEst(PBPPbokSpceDtlEstDeleteSpceAtsEst_DIDT input)  {
		/**
		 * @BXMType VariableDeclaration
		 */
		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class);
		sHRIBSMR0000920_COM = WFApplicationContext.getBean(sHRIBSMR0000920_COM, SHRIBSMR0000920_COM.class);
		
		PBPPbokSpceDtlEstDeleteSpceAtsEst_DODT output= new PBPPbokSpceDtlEstDeleteSpceAtsEst_DODT();
		
		try {
			WFInterfaceCfg subInterfaceCfg = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg();
			subInterfaceCfg.setInterfaceId("IBSMR0000920");

			IBSMR0000920_IDT iIBSMR0000920 = new IBSMR0000920_IDT();
			iIBSMR0000920.setAtsMngNo(input.getAtsMngNo()); // 자동이체관리번호
			iIBSMR0000920.setAtsWdrBkwAcno(input.getRprsAcno()); // 자동이체출금전행계좌번호
			iIBSMR0000920.setAtsRcvAcno(input.getSpceSrno()); // 자동이체입금계좌번호
			iIBSMR0000920.setAtsRcvBkcd("020"); // 자동이체입금은행코드
//			iIBSMR0000920.setAtsReqAm(iIBSMR0000920.getAtsReqAm()); // 자동이체요청금액
//			iIBSMR0000920.setDscd(iIBSMR0000920.getDscd()); // 구분코드
//			iIBSMR0000920.setAtsInsvAcno(iIBSMR0000920.getAtsInsvAcno()); // 자동이체적금계좌번호
//			iIBSMR0000920.setRbadvDscd(iIBSMR0000920.getRbadvDscd()); // 로보어드바이저구분코드
//			iIBSMR0000920.setAtsItcd(iIBSMR0000920.getAtsItcd()); // 자동이체항목코드
//			iIBSMR0000920.setAtsItmTxt(iIBSMR0000920.getAtsItmTxt()); // 자동이체항목내용
			
			if (logger.isDebugEnabled()) {
				logger.debug("=======통장쪼개기 자동이체 해지 시작 Tx====== ::: input {}", iIBSMR0000920);
			}
			WFInfResponse<WFEmpty_ODT> mcaOutput = sHRIBSMR0000920_COM.callTrx(iIBSMR0000920, subInterfaceCfg);
			mcaOutput.getResponseData();
			if (logger.isDebugEnabled()) {
				logger.debug("====== 자동이체 해지 완료 ======");
			}

			output.setRspRtcd("200");
			output.setRspMsgTxt("성공");
		} catch(WFApplicationException e){
			logger.error("IBSMR0000920 전문 error :: {}", e);
			Object[] args = e.getArguments();
			
			throw new WFApplicationException("FNSE0006", new Object[] {e.getCode()} , new Object[] {args[0].toString()});
		} catch(Exception e){
			logger.error("IBSMR0000920 전문 error :: {}", e);
		
			throw new WFApplicationException("FNSE0006", new Object[] {"9999"} , new Object[] {e.getMessage()});
		}
		
		return output;
	}
	
	/**
	 * 공간에서 자동납부 대상을 관리를 위한 컴포넌트
	 * 처리구분 1 : 등록 , 2 : 해제, 3 : 변경 
	 * @param input 입출금계좌.자동납부.관리.DBM.입력.IO
	 * @return 입출금계좌.자동납부.관리.DBM.출력.IO
	 */
	@BxmCategory(logicalName="입출금계좌.자동납부.정보.관리", description="공간에서 자동납부 대상을 관리를 위한 컴포넌트", author="90191355")
	public PBPPbokSpceDtlEstMngRawActatpminf_DODT mngRawActatpminf(PBPPbokSpceDtlEstMngRawActatpminf_DIDT input) {
		/**
		 * @BXMType GetBean
		 */
		sHRIBSMR0006025_COM = WFApplicationContext.getBean(sHRIBSMR0006025_COM, SHRIBSMR0006025_COM.class);
		/**
		 * 	WFInterfaceCfg 생성 컴포넌트
		 */
		sHRCMMInterfaceCfg_COM = WFApplicationContext	.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class);
		
		PBPPbokSpceDtlEstMngRawActatpminf_DODT output = new PBPPbokSpceDtlEstMngRawActatpminf_DODT();
		try {
			WFInterfaceCfg interfaceCfg = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg();
			interfaceCfg.setInterfaceId("IBSMR0006025");
			
			IBSMR0006025_IDT iIBSMR0006025 = new IBSMR0006025_IDT();
			iIBSMR0006025.setBizDis("01"); // 업무구분 01 자동납부
			iIBSMR0006025.setPrcDis(input.getPrcDis()); //처리구분 1 : 등록 , 2 : 해제, 3 : 변경 , 8 : 일괄초기화 , 9 : 조회 
			iIBSMR0006025.setAtsMngNo(input.getAtpmMngNo()); // 자동이체관리번호
			iIBSMR0006025.setAtsWdrBkwAcno(input.getRprsAcno()); // 자동이체출금전행계좌번호
			iIBSMR0006025.setSpceNo(input.getAtpmCctnSpceSrno()); // 공간번호
			
			if (logger.isDebugEnabled()) {
				logger.debug("=======통장쪼개기 자동납부 !!====== {}::: ", iIBSMR0006025);
			}
			WFInfResponse<IBSMR0006025_ODT> mcaOutput = sHRIBSMR0006025_COM.callTrx(iIBSMR0006025, interfaceCfg);
			if (logger.isDebugEnabled()) {
				logger.debug("IBSMR0006025_ODT ====== {} ::: ", mcaOutput.getResponseData());
			}
			output.setMngCnt(1);
			
		} catch(WFApplicationException e){
			logger.error("IBSMR0006025 전문 error :: {}", e);
			Object[] args = e.getArguments();
			
			throw new WFApplicationException("FNSE0006", new Object[] {e.getCode()} , new Object[] {args[0].toString()});
		} catch(Exception e){
			logger.error("IBSMR0006025 전문 error :: {}", e);
		
			throw new WFApplicationException("FNSE0006", new Object[] {"9999"} , new Object[] {e.getMessage()});
		}
		
		return output;
	}
	
}

