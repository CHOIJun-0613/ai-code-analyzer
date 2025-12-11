package com.skbank.sml.fns.inb.com;

import bxm.common.annotaion.BxmCategory;

import com.skbank.sml.bsc.shr.com.SHRAllActInqTbk_COM;
import com.skbank.sml.bsc.shr.cst.cstt.SHRBSCInquiryConstant;
import com.skbank.sml.cmm.shr.com.SHRBSCActNmMng_COM;
import com.skbank.sml.cmm.shr.com.SHRCMMInterfaceCfg_COM;
import com.skbank.sml.cmm.shr.com.SHRCMMLoginSession_COM;
import com.skbank.sml.cmm.shr.dto.BSC_ACT_INFO;
import com.skbank.sml.cmm.shr.dto.BSC_ACT_LIST;
import com.skbank.sml.cmm.shr.dto.CMM_CURRENT_CUST;
import com.skbank.sml.cmm.shr.dto.SHRActNmInqODT_DTO;
import com.skbank.sml.fns.inb.dto.INBActList_DTO;
import com.skbank.sml.fns.inb.dto.INBBscActLIst_DTO;
import com.skbank.sml.fns.inb.dto.INBPushNtfcSrvcInqGrid_DTO;
import com.skbank.sml.fns.inb.dto.INBSmsRawSrvcBsci_DTO;
import com.skbank.sml.fns.inb.dto.INBSmsRawTrnTxtNtcGrid1_DTO;
import com.skbank.sml.ifi.mca.eims2.dto.IBSMR0001072_GRID_ODT;
import com.skbank.sml.ifi.mca.eims2.dto.IBSMR0001072_IDT;
import com.skbank.sml.ifi.mca.eims2.dto.IBSMR0001072_ODT;
import com.skbank.sml.ifi.mca.eims8.dto.IBSMR0001238_GRID_ODT;
import com.skbank.sml.ifi.mca.eims8.dto.IBSMR0001238_IDT;
import com.skbank.sml.ifi.mca.eims8.dto.IBSMR0001238_ODT;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0001072_COM;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0001238_COM;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import fwk.skbank.asis.adaptor.dto.request.WFInterfaceCfg;
import fwk.skbank.asis.adaptor.dto.response.WFInfResponse;
import fwk.skbank.asis.adaptor.header.request.custom.WFCustomTrnHeader;
import fwk.skbank.online.context.WFApplicationContext;
import fwk.skbank.online.exception.app.WFApplicationException;

/**
 * 1.업무명 : 금융서비스
 * 2.단위업무명 : NEWWON 중분류 통합알림함
 * 3.프로그램명 : SMS입출금통지서비스.컴포넌트
 * 4.설명 : SMS입출금통지서비스 컴포넌트
 * 
 * @Class INBSmsRawNtcSrvc_COM.java
 * @author 90190264
 * @since 2024.04.03
 * @version 1.0
 */		
@Component
@BxmCategory(logicalName="SMS입출금통지서비스.컴포넌트", description="SMS입출금통지서비스 컴포넌트")
public class INBSmsRawNtcSrvc_COM {
	private Logger logger= LoggerFactory.getLogger(getClass());
	
	/**
	 * WFInterfaceCfg 생성 컴포넌트
	 */
	private SHRCMMInterfaceCfg_COM sHRCMMInterfaceCfg_COM;
	/**
	 * 로그인정보 세션 생성 컴포넌트
	 */
	private SHRCMMLoginSession_COM shrCMMLoginSession_COM; 
	/**
	 * SHRIBSMR0001238_COM 공유 공통 컴포넌트
	 */
	private SHRIBSMR0001238_COM sHRIBSMR0001238_COM;
	/**
	 * SHRAllActInqTbk_COM 생성 컴포넌트
	 */
	private SHRAllActInqTbk_COM sHRAllActInqTbk_COM;
	/**
	 * SHRIBSMR0001072_COM 공유 공통 컴포넌트
	 */
	private SHRIBSMR0001072_COM sHRIBSMR0001072_COM;
	/**
	 * 계좌.별명.관리.공유.컴포넌트
	 */
	private SHRBSCActNmMng_COM sHRBSCActNmMng_COM;
	
	/**
	 * sms입출금통지.거래내용.통지.조회
	 * 
	 * @param sms입출금통지.거래내용.통지.조회
	 * @return sms입출금통지.거래내용.통지.조회
	 */
	@BxmCategory(logicalName="sms입출금통지.거래내용.통지.조회", description="sms입출금통지.거래내용.통지.조회", author="90190264")
	public INBSmsRawSrvcBsci_DTO selectSmsRawSrvcBsci() throws WFApplicationException  {
		
		// WFInterfaceCfg 생성 컴포넌트
		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class); 	
		// 로그인정보 세션 컴포넌트
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		// SMS입출금통지등록내역조회 컴포넌트
		sHRIBSMR0001238_COM= WFApplicationContext.getBean(sHRIBSMR0001238_COM, SHRIBSMR0001238_COM.class);
		
		INBSmsRawSrvcBsci_DTO output = new INBSmsRawSrvcBsci_DTO();
		
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession(); 
		
		try{
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

				// 전자뱅킹서비스상태코드로 오름차순 정렬(10 등록부터 목록에 나오게 변경), SMS계약일자로 내림차순.
				Collections.sort(ibsmr1238odt.getGrid(), Comparator.comparing(IBSMR0001238_GRID_ODT::getEbnkSrvcStcd)
																					 .thenComparing(Comparator.comparing(IBSMR0001238_GRID_ODT::getSmsCtrDt)
																							 							  .reversed()));
				
				for(IBSMR0001238_GRID_ODT grid : ibsmr1238odt.getGrid()) {
					INBSmsRawTrnTxtNtcGrid1_DTO grid1dto = new INBSmsRawTrnTxtNtcGrid1_DTO();
					
					grid1dto.setDpsAcno(grid.getDpsAcno()); 								// 수신계좌번호
					grid1dto.setEbnkSrvcStcd(grid.getEbnkSrvcStcd()); 					// 전자뱅킹서비스상태코드
					grid1dto.setHpNo1(grid.getHpNo1()); 										// 핸드폰번호_1
					grid1dto.setRgsCnt(grid.getRgsCnt()); 										// 등록건수
					grid1dto.setBalNtrsnYn(grid.getBalNtrsnYn());	 						// 잔액미전송여부
					grid1dto.setSmsTmsLimAm(grid.getSmsTmsLimAm()); 					// SMS전송제한금액
					grid1dto.setTmsStaTm(grid.getTmsStaTm()); 							// 전송시작시각
					grid1dto.setTmsEndTm(grid.getTmsEndTm()); 							// 전송종료시각
					grid1dto.setNtcLimCnt(grid.getNtcLimCnt()); 							// 통지제한건수
					grid1dto.setSmsLstNtcDt(grid.getSmsLstNtcDt()); 						// SMS최종통지일자
					grid1dto.setLstNtcCnt(grid.getLstNtcCnt()); 								// 최종통지건수
					grid1dto.setFstlNwolAcno(grid.getFstlNwolAcno()); 					// 수수료결제신구계좌번호
					grid1dto.setSmsFeeWdrDd(grid.getSmsFeeWdrDd()); 					// SMS수수료출금일
					grid1dto.setFeeLevyDt(grid.getFeeLevyDt());	 						// 수수료징수일자
					grid1dto.setEfFeeAplCd(grid.getEfFeeAplCd()); 							// 전자금융수수료적용코드
					grid1dto.setFxmpXprDt(grid.getFxmpXprDt()); 							// 수수료면제만기일자
					grid1dto.setSmsCtrDt(grid.getSmsCtrDt()); 								// SMS계약일자
					grid1dto.setFstCtrDt(grid.getFstCtrDt()); 									// 최초계약일자
					grid1dto.setMdKdcd(grid.getMdKdcd()); 									// 매체종류코드
					grid1dto.setSmsRqSrno(grid.getSmsRqSrno()); 							// SMS신청일련번호
					grid1dto.setSmsCancDt(grid.getSmsCancDt()); 							// SMS해지일자
					grid1dto.setFeeDfpmLevyYn(grid.getFeeDfpmLevyYn()); 				// 수수료후불징수여부
					grid1dto.setAtsSndLimYn(grid.getAtsSndLimYn()); 						// 자동이체발송제한여부
					grid1dto.setCusInfNlkgYn(grid.getCusInfNlkgYn()); 						// 고객정보미연동여부
					grid1dto.setFeeWdrGdncNoreYn(grid.getFeeWdrGdncNoreYn());	 	// 수수료출금안내미수신여부
					grid1dto.setLstFeeWdrDd(grid.getLstFeeWdrDd()); 					// 최종수수료출금일
					grid1dto.setLstFeePymCnt(grid.getLstFeePymCnt()); 					// 최종수수료납부건수
					grid1dto.setLstFeePymAm(grid.getLstFeePymAm()); 					// 최종수수료납부금액
					grid1dto.setByImpnScdCnt(grid.getByImpnScdCnt()); 					// 건별부과예정건수
					grid1dto.setByImpnScdAm(grid.getByImpnScdAm()); 					// 건별부과예정금액
					
					grid1List.add(grid1dto);
					
					//상태체크 : 등록된 SMS입출금통지서비스가 한건 이상 있는지 체크
	                String isNotUse = grid.getEbnkSrvcStcd().trim();
	                // 전자뱅킹서비스상태코드 - 90: 해지
	                if(!"90".equals(isNotUse)) {
	                	output.setSmsRawNtcSrvcJnngYn("Y");		// SMS입출금통지서비스가입여부
//		                	break ;
	                }
				}
				
				output.setiNBSmsRawTrnTxtNtcGrid1_DTO(grid1List);
				output.setCnt(ibsmr1238odt.getCnt());
			}
			
		} catch (WFApplicationException e) {
			logger.error("WFApplicationException error :: {}", e);
		} catch (Exception e) {
			logger.error("Exception error :: {}", e);
		}
		
		return output;
	}
	
	/**
	 * sms입출금통지.거래내용.통지.조회
	 * 
	 * @param sms입출금통지.거래내용.통지.조회
	 * @return sms입출금통지.거래내용.통지.조회
	 */
	@BxmCategory(logicalName="sms입출금통지.거래내용.통지.조회", description="sms입출금통지.거래내용.통지.조회", author="90190264")
	public INBBscActLIst_DTO selectINBActList_DTO() throws WFApplicationException  {
		// WFInterfaceCfg 생성 컴포넌트
		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class); 	
		// 로그인정보 세션 컴포넌트
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		sHRAllActInqTbk_COM = WFApplicationContext.getBean(sHRAllActInqTbk_COM, SHRAllActInqTbk_COM.class); 	
		sHRIBSMR0001072_COM= WFApplicationContext.getBean(sHRIBSMR0001072_COM, SHRIBSMR0001072_COM.class);
		// SMS입출금통지등록내역조회 컴포넌트
		sHRBSCActNmMng_COM= WFApplicationContext.getBean(sHRBSCActNmMng_COM, SHRBSCActNmMng_COM.class);
		
		INBBscActLIst_DTO output = new INBBscActLIst_DTO();
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession(); 
		
		/**
		 * 예금+대출계좌 계좌 목록 조회
		 * */
		BSC_ACT_LIST depList = sHRAllActInqTbk_COM.selectSessActList(SHRBSCInquiryConstant.BSC_ACT_LIST_INQ_DIS_ALL, false);
		
		List<BSC_ACT_INFO> newDepList = depList.getActList()
				.stream()
				.filter(item -> "002".equals(item.getSbjCd())
						|| "004".equals(item.getSbjCd())
						|| "005".equals(item.getSbjCd())
						|| "006".equals(item.getSbjCd())
						|| "120".equals(item.getSbjCd()))
				.collect(Collectors.toList());
		
		if(logger.isDebugEnabled()) {
			logger.debug("newDepList ====== {} ::: ", newDepList);
		}
		
		List<BSC_ACT_INFO> filteredNewDepList = new ArrayList<>();
		
		// 대출일 경우 마통 뚫으면 1002로 기존 입출금 계좌와 동일한 계좌가 들어옴
		for(BSC_ACT_INFO actInfo : newDepList) {
			if("LON".equals(actInfo.getAccDis()) && "002".equals(actInfo.getSbjCd())) {
				Boolean alreadyExst = false;
				String newAcctNo = actInfo.getNewAcno();				// 신계좌번호
				
				alreadyExst = filteredNewDepList.stream().anyMatch(item -> newAcctNo.equals(item.getNewAcno()));
				
				if(alreadyExst) {
					continue;
				} else {
					filteredNewDepList.add(actInfo);
				}
			} else {
				filteredNewDepList.add(actInfo);
			}
		}
		
		if(logger.isDebugEnabled()) {
			logger.debug("filteredNewDepList ====== {} ::: ", filteredNewDepList);
		}

		
		/*
		 * 외환 계좌 목록 조회
		 * */
		BSC_ACT_LIST fxdList = sHRAllActInqTbk_COM.selectSessActList(SHRBSCInquiryConstant.BSC_ACT_LIST_INQ_DIS_FX, false);
		
		if(logger.isDebugEnabled()) {
			logger.debug("fxdList ====== {} ::: ", fxdList);
		}
		
		List<BSC_ACT_INFO> newFxdList = fxdList.getActList()
				.stream()
				.filter(item -> "081".equals(item.getSbjCd())
						|| "083".equals(item.getSbjCd()))
				.collect(Collectors.toList());
		if(logger.isDebugEnabled()) {
			logger.debug("newFxdList ====== {} ::: ", newFxdList);
		}
		
		// 계좌 중복체크
		boolean isAlreadyAcno = false;
		
		if(newFxdList.size() > 0) {
			for(BSC_ACT_INFO fxdActInfo : newFxdList) {
				for(BSC_ACT_INFO bscActInfo : filteredNewDepList) {
					if(bscActInfo.getCusUsgAcno().equals(fxdActInfo.getCusUsgAcno())) {
						isAlreadyAcno = true;
						break;
					}
				}
				
				if(!isAlreadyAcno) {
					filteredNewDepList.add(fxdActInfo);
				}
			}
		}
		
		// ===================================================================
		// *********************** 1.IBSMR0001072(펀드보유계좌조회) 인터페이스 호출 셋팅 ****************************************
		// ===================================================================
		//  MCA WFInterfaceCfg 객체 획득
		WFInterfaceCfg interfaceCfg  = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg();
		interfaceCfg.setInterfaceId("IBSMR0001072");
		
		IBSMR0001072_IDT ibsmr1072idt = new IBSMR0001072_IDT();
		IBSMR0001072_ODT ibsmr1072odt = new IBSMR0001072_ODT();
		
		ibsmr1072idt.setRsbrItcsno(currentCust.getItcsno());								// 통합고객번호
		
		/*
		 * 연계시스템 호출
		 * TYPE : MCA
		 * ID : IBSMR0001072
		 * NM : 	펀드보유계좌조회
		 */
		WFInfResponse<IBSMR0001072_ODT> mcaOutput1072 = sHRIBSMR0001072_COM.callTrx(ibsmr1072idt, interfaceCfg);
		
		if(!mcaOutput1072.hasError()) {
			ibsmr1072odt = mcaOutput1072.getResponseData();
			List<IBSMR0001072_GRID_ODT> ibsmr1072grid = ibsmr1072odt.getGrid();
			
			String byactNm = "";
			// mmf계좌 별명 조회
			if(ibsmr1072odt.getGridCnt() > 0) {
				/**
				 * 개인_계좌별명 조회  WDCActNcmMngBean.001 
				 * */
				SHRActNmInqODT_DTO actNmInqDto = sHRBSCActNmMng_COM.selectActNm();
				
				if(actNmInqDto.getsHRActNmInqList_DTO().size() > 0) {
					byactNm = actNmInqDto.getsHRActNmInqList_DTO().get(0).getByactNm();
				}
			}
			
			List<BSC_ACT_INFO> mmfList = new ArrayList<BSC_ACT_INFO>();
			
			for(IBSMR0001072_GRID_ODT gridOdt : ibsmr1072grid) {
				if("Y".equalsIgnoreCase(gridOdt.getMmfYn())) {
					BSC_ACT_INFO mmfActInf = new BSC_ACT_INFO();
					
					mmfActInf.setCusUsgAcno(gridOdt.getCusUsgAcno());			// 고객사용계좌번호
					mmfActInf.setAccNm(gridOdt.getFndNm());							// 펀드명(계좌명)
					mmfActInf.setActAls(byactNm);											// 계좌별칭명
					
					mmfList.add(mmfActInf);
				}
			}
			// mmf 계좌가 있으면 기존 계좌 목록에 합친다.
			if(mmfList.size() > 0) {
				// 예금+대출계좌+외환+mmf 계좌 목록
				filteredNewDepList.addAll(mmfList);
			}
			
			// 대상계좌 목록이 존재하면 화면에 필요한 데이터만 dto로 변환
			if(filteredNewDepList.size() > 0) {
				for(BSC_ACT_INFO actInf : filteredNewDepList) {
					INBActList_DTO inbActListDto = new INBActList_DTO();
					
					inbActListDto.setActNo(actInf.getCusUsgAcno());					// 고객사용계좌번호
					inbActListDto.setActNm(actInf.getAccNm());							// 계좌명
					inbActListDto.setByactNm(actInf.getActAls());						// 계좌별칭명
					inbActListDto.setPbokBal(actInf.getPbokBal());						// 통장잔액
					
					output.getiNBActList_DTO().add(inbActListDto);
				}
			}
		}
		
		return output;
	}
}
