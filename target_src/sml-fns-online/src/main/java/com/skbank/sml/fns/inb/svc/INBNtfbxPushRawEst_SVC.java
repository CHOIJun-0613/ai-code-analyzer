package com.skbank.sml.fns.inb.svc;

import bxm.common.annotaion.BxmCategory;

import com.skbank.sml.bsc.shr.com.SHRAllActInqTbk_COM;
import com.skbank.sml.bsc.shr.com.SHRAllActInqWbkAct_COM;
import com.skbank.sml.bsc.shr.cst.cstt.SHRBSCInquiryConstant;
import com.skbank.sml.bsc.shr.dto.SHRActInf_DTO;
import com.skbank.sml.bsc.shr.dto.SHRActListInp_DTO;
import com.skbank.sml.bsc.shr.dto.SHRActListOup_DTO;
import com.skbank.sml.bsc.shr.dto.SHRAllActInqWbkActInf_DTO;
import com.skbank.sml.cmm.shr.com.SHRCMMInterfaceCfg_COM;
import com.skbank.sml.cmm.shr.com.SHRCMMLoginSession_COM;
import com.skbank.sml.cmm.shr.com.SHRMMHCustSession_COM;
import com.skbank.sml.cmm.shr.dto.BSC_ACT_INFO;
import com.skbank.sml.cmm.shr.dto.BSC_ACT_LIST;
import com.skbank.sml.cmm.shr.dto.CMM_CURRENT_CUST;
import com.skbank.sml.cmm.shr.dto.MMH_CUST_INFO;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxPushRawEstDeleteRawNtfcAgrYn_IDT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxPushRawEstDeleteRawNtfcAgrYn_ODT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxPushRawEstInsertRawNtfcEstInf_IDT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxPushRawEstInsertRawNtfcEstInf_ODT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxPushRawEstCallRawNtfcDtlEst_ODT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxPushRawEstSelectRawNtfcAgrYn_ODT;
import com.skbank.sml.fns.inb.dto.INBActList_DTO;
import com.skbank.sml.fns.inb.dto.INBPushNtfcSrvcInqGrid_DTO;
import com.skbank.sml.fns.inb.dto.INBRawNtfcEstRgs_DTO;
import com.skbank.sml.ifi.mca.eims0.dto.IBSMR0001250_IDT;
import com.skbank.sml.ifi.mca.eims0.dto.IBSMR0001250_ODT;
import com.skbank.sml.ifi.mca.eims1.dto.IBSMR0001251_IDT;
import com.skbank.sml.ifi.mca.eims4.dto.IBSMR0004974_GRID_IDT;
import com.skbank.sml.ifi.mca.eims4.dto.IBSMR0004974_IDT;
import com.skbank.sml.ifi.mca.eims6.dto.IBSMR0001246_IDT;
import com.skbank.sml.ifi.mca.eims6.dto.IBSMR0001246_ODT;
import com.skbank.sml.ifi.mca.eims7.dto.IBSMR0001247_IDT;
import com.skbank.sml.ifi.mca.eims7.dto.IBSMR0001247_ODT;
import com.skbank.sml.ifi.mca.eims8.dto.IBSMR0001248_IDT;
import com.skbank.sml.ifi.mca.eims8.dto.IBSMR0001248_ODT;
import com.skbank.sml.ifi.mca.eims8.dto.IBSMR0005658_IDT;
import com.skbank.sml.ifi.mca.eims9.dto.IBSMR0001249_GRID_ODT;
import com.skbank.sml.ifi.mca.eims9.dto.IBSMR0001249_IDT;
import com.skbank.sml.ifi.mca.eims9.dto.IBSMR0001249_ODT;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0001066_COM;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0001246_COM;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0001247_COM;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0001248_COM;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0001249_COM;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0001250_COM;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0001251_COM;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0004974_COM;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0005658_COM;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import fwk.skbank.asis.adaptor.dto.request.WFEmpty_ODT;
import fwk.skbank.asis.adaptor.dto.request.WFInterfaceCfg;
import fwk.skbank.asis.adaptor.dto.response.WFInfResponse;
import fwk.skbank.asis.adaptor.header.request.custom.WFCustomTrnHeader;
import fwk.skbank.online.context.WFApplicationContext;
import fwk.skbank.online.exception.app.WFApplicationException;
import fwk.skbank.online.util.WFStringUtils;

/**
 * 1.업무명 : 금융서비스
 * 2.단위업무명 : NEWWON 중분류 통합알림함
 * 3.프로그램명 : 알림함.PUSH.입출금.설정.서비스
 * 4.설명 : 통합 알림함 PUSH 입출금 설정 서비스 
 *  
 * @Class INBNtfbxPushRawEst_SVC.java
 * @author 90190264
 * @since 2024.05.15
 * @version 1.0
 */		
@Service
@BxmCategory(logicalName="알림함.PUSH.입출금.설정.서비스", description="통합 알림함 PUSH 입출금 설정 서비스")
public class INBNtfbxPushRawEst_SVC {
	private Logger logger= LoggerFactory.getLogger(getClass());
	
	/**
	 * SHRIBSMR0001249_COM 공유 공통 IO
	 */
	private SHRIBSMR0001249_COM sHRIBSMR0001249_COM;
	/**
	 * SHRIBSMR0001246_COM 공유 공통 IO
	 */
	private SHRIBSMR0001246_COM sHRIBSMR0001246_COM;
	/**
	 * SHRIBSMR0001250_COM 공유 공통 IO
	 */
	private SHRIBSMR0001250_COM sHRIBSMR0001250_COM;
	
	private SHRCMMLoginSession_COM shrCMMLoginSession_COM; 
	/**
	 * WFInterfaceCfg 생성 컴포넌트
	 */
	private SHRCMMInterfaceCfg_COM sHRCMMInterfaceCfg_COM;
	/**
	 * SHRIBSMR0001066_COM 공유 공통 IO
	 */
	private SHRIBSMR0001066_COM sHRIBSMR0001066_COM;
	/**
	 * SHRIBSMR0001247_COM 공유 공통 IO
	 */
	private SHRIBSMR0001247_COM sHRIBSMR0001247_COM;
	/**
	 * SHRIBSMR0001248_COM 공유 공통 IO
	 */
	private SHRIBSMR0001248_COM sHRIBSMR0001248_COM;
	/**
	 * SHRIBSMR0001251_COM 공유 공통 IO
	 */
	private SHRIBSMR0001251_COM sHRIBSMR0001251_COM;
	/**
	 * SHRAllActInqTbk_COM 생성 컴포넌트
	 */
	private SHRAllActInqTbk_COM sHRAllActInqTbk_COM;
	/**
	 * SHRMMHCustSession_COM 생성 컴포넌트
	 */
	private SHRMMHCustSession_COM shrMMHCustSession_COM;
	/**
	 * SHRIBSMR0004974_COM 생성 컴포넌트
	 */
	private SHRIBSMR0004974_COM sHRIBSMR0004974_COM;
	/**
	 * SHRIBSMR0005658_COM 생성 컴포넌트
	 */
	private SHRIBSMR0005658_COM sHRIBSMR0005658_COM;
	/**
	 * 전계좌 조회 COM
	 */
	private SHRAllActInqWbkAct_COM sHRAllActInqWbkAct_COM;
	
	/**
	 * 입출금 알림 동의여부 조회
	 * 
	 * @param input 입출금.알림.설정.컨트롤러.입력.IO
	 * @return 입출금.알림.설정.컨트롤러.출력.IO 
	 */
	@BxmCategory(logicalName="입출금.알림.동의여부.조회", description="입출금 알림 동의여부 조회", author="90190264")
	public INBNtfbxPushRawEstSelectRawNtfcAgrYn_ODT selectRawNtfcAgrYn()
	{
		// session 컴포넌트
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		// WFInterfaceCfg 생성 컴포넌트
		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class);
		// IBSMR0001249 컴포넌트
		sHRIBSMR0001249_COM= WFApplicationContext.getBean(sHRIBSMR0001249_COM, SHRIBSMR0001249_COM.class);
		// IBSMR0001066 컴포넌트
		sHRIBSMR0001066_COM= WFApplicationContext.getBean(sHRIBSMR0001066_COM, SHRIBSMR0001066_COM.class);
		sHRAllActInqTbk_COM = WFApplicationContext.getBean(sHRAllActInqTbk_COM, SHRAllActInqTbk_COM.class);
		shrMMHCustSession_COM = WFApplicationContext.getBean(shrMMHCustSession_COM, SHRMMHCustSession_COM.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */
		INBNtfbxPushRawEstSelectRawNtfcAgrYn_ODT output= new INBNtfbxPushRawEstSelectRawNtfcAgrYn_ODT();
		// 로그인세션
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession(); 
		// 고객정보세션
		MMH_CUST_INFO custInfo = shrMMHCustSession_COM.getCustInfoSession();
		
		// 로그인 체크
		if (shrCMMLoginSession_COM.istLogin()) {
			// ===================================================================
			// *********************** 1.IBSMR0001249(PUSH 알림서비스 조회) 인터페이스 호출 셋팅 ****************************************
			// ===================================================================
			//  MCA WFInterfaceCfg 객체 획득
			WFInterfaceCfg interfaceCfg  = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg();
			interfaceCfg.setInterfaceId("IBSMR0001249");
			
			// WFCustomTrnHeader 셋팅
			WFCustomTrnHeader wfCusTrnHeader = new WFCustomTrnHeader();
			wfCusTrnHeader.setFuncCd("20");			// 거래코드	조회:20 / 등록:30 / 변경:40 / 해지:50
			
			// interfaceCfg 셋팅
			interfaceCfg.setCustomTrnHeader(wfCusTrnHeader);
			
			IBSMR0001249_IDT ibsmr1249idt = new IBSMR0001249_IDT();
			IBSMR0001249_ODT ibsmr1249odt = new IBSMR0001249_ODT();
			
			ibsmr1249idt.setItcsno(currentCust.getItcsno());
			ibsmr1249idt.setEncyAcnmNo(currentCust.getEncyRbno());		// 암호화실명번호
			ibsmr1249idt.setEncyRrno(currentCust.getEncyRbno());			// 암호화주민번호
			
			String tmpHpNo = "";
			
			try {
				/**
				 * 연계시스템 호출
				 * TODO 인터페이스 호출을 위한 코드를 작성하십시오.
				 * TYPE : MCA
				 * ID : IBSMR0001249
				 * NM : PUSH 알림서비스 조회
				 */
				WFInfResponse<IBSMR0001249_ODT> mcaOutput = sHRIBSMR0001249_COM.callTrx(ibsmr1249idt, interfaceCfg);
				
				if(!mcaOutput.hasError()) {
					ibsmr1249odt = mcaOutput.getResponseData();
					// default 전화번호 세팅
					for(IBSMR0001249_GRID_ODT grid : ibsmr1249odt.getGrid()) {
						// 등록시 기 등록된 휴대폰 번호 중 한건으로 등록
						if(!WFStringUtils.isEmpty(grid.getHpNo().trim())) {
							tmpHpNo = grid.getHpNo();
							break;
						}
					}
				}
			} catch(WFApplicationException e){
				logger.error("IBSMR0001249 전문 error :: {}", e);
			} catch(Exception e){
				logger.error("IBSMR0001249 전문 error :: {}", e);
			}
			
			/**
			 * 1. 등록된 입출금알림설정 된 계좌들의 전자뱅킹상태코드가 90(해지)인 경우
			 * 2. 첫 신규 등록이어서 계정계에 자료가 없을 경우 Exception 발생, BECOM00131: 자료가 존재하지 않습니다. 
			 * 1, 2 인 경우 세션 핸드폰 번호를 담는다.
			 * */ 
			if(WFStringUtils.isEmpty(tmpHpNo)) {
				StringBuffer sb = new StringBuffer();
				sb.append(custInfo.getHpComCd());
				sb.append(custInfo.getHpTlenNo());
				sb.append(custInfo.getHpSrno());
				
				tmpHpNo = sb.toString();
			}
			
			
			List<String> linkPushTypes = new ArrayList<>();
			linkPushTypes.add("0021470020000");
			linkPushTypes.add("0050060020000");
			linkPushTypes.add("0020050020300");
			linkPushTypes.add("0020050020200");
			linkPushTypes.add("0020050020400");
			linkPushTypes.add("0020050020100");
			linkPushTypes.add("0020910000000");
				 
			/**
			 * 예금+대출계좌 계좌 목록 조회
			 * */
			BSC_ACT_LIST allActList = sHRAllActInqTbk_COM.selectSessActList(SHRBSCInquiryConstant.BSC_ACT_LIST_INQ_DIS_ALL, false);
			if(logger.isDebugEnabled()) {
				logger.debug("allActList ====== {} ::: ", allActList);
			}
			
			// AllAcctList 세션 일반 입출금계좌가 존재한다면
			if(allActList.getActList().size() > 0) {
				// 입출금 알림 허용된 계좌구분코드만 분리
				List<BSC_ACT_INFO> newDepList = allActList.getActList()
																   	 .stream()
																   	 .filter(item -> "002".equals(item.getSbjCd())
																   			 		|| "003".equals(item.getSbjCd())
																   			 		|| "004".equals(item.getSbjCd())
																   			 		|| "005".equals(item.getSbjCd())
																   			 		|| "006".equals(item.getSbjCd())
																   			 		|| "120".equals(item.getSbjCd())
																   			 		|| "121".equals(item.getSbjCd()))
																   	 .collect(Collectors.toList());
				if(logger.isDebugEnabled()) {
					logger.debug("newDepList ====== {} ::: ", newDepList);
				}
				
				for(BSC_ACT_INFO actInfo : newDepList) {
					// 숨김계좌 제외
					if(!"Y".equals(actInfo.getHdnActYn())) {
						String acctNo 			= actInfo.getCusUsgAcno(); 		// 고객사용계좌번호
						String newAcctNo 	= actInfo.getNewAcno(); 			// 신계좌번호
//								String lonAcctNo 		= "DEP"; 								// 
						String pdcdType		= actInfo.getPdcd();					// 상품코드
						// 대출계좌일 경우 마통 뚫으면 1002, 1003, 1004, 1005, 1006로 기존 입출금 계좌와 동일한 계좌가 들어오는 경우가 있어서 제외시킴
						if("LON".equals(actInfo.getAccDis()) && ("002".equals(actInfo.getSbjCd()) || "003".equals(actInfo.getSbjCd()) 
										|| "004".equals(actInfo.getSbjCd()) || "005".equals(actInfo.getSbjCd()) || "006".equals(actInfo.getSbjCd()))) {
							Boolean alreadyExst = false;
							
							List<INBPushNtfcSrvcInqGrid_DTO> filteredBscList = output.getPushNtfcSrvcInqGrid();
							
							alreadyExst = filteredBscList.stream().anyMatch(item -> newAcctNo.equals(item.getNewAcno()));
							
							if(alreadyExst) {
								continue;
							}
						}
						
						// won알림  가입 불가능 상품코드를 제외하고
						if(!linkPushTypes.contains(pdcdType)) {
							INBPushNtfcSrvcInqGrid_DTO tgtGrid = new INBPushNtfcSrvcInqGrid_DTO();
							// PUSH알림 서비스 조회  결과 값이 있다면
							if(ibsmr1249odt.getGrid().size() > 0) {
								for(IBSMR0001249_GRID_ODT grid : ibsmr1249odt.getGrid()) {
									
									if((acctNo.equals(grid.getNewAcno()) || newAcctNo.equals(grid.getNewAcno())) && !"90".equals(grid.getEbnkSrvcStcd())) {
										try {
											tgtGrid.setDpacNo(grid.getDpacNo());
											tgtGrid.setEbnkSrvcStcd(grid.getEbnkSrvcStcd());
											tgtGrid.setHpNo(grid.getHpNo());
											tgtGrid.setNtcTgtTrnDscd(grid.getNtcTgtTrnDscd());
											tgtGrid.setBalNtrsnYn(grid.getBalNtrsnYn());
											tgtGrid.setSmsTmsLimAm(grid.getSmsTmsLimAm());
											tgtGrid.setTmsStaTm(grid.getTmsStaTm());
											tgtGrid.setTmsEndTm(grid.getTmsEndTm());
											tgtGrid.setPrcSrno(grid.getPrcSrno());
											tgtGrid.setSmsLstNtcDt(grid.getSmsLstNtcDt());
											tgtGrid.setLstNtcCnt(grid.getLstNtcCnt());
											tgtGrid.setSmsCtrDt(grid.getSmsCtrDt());
											tgtGrid.setFstCtrDt(grid.getFstCtrDt());
											tgtGrid.setMdKdcd(grid.getMdKdcd());
											tgtGrid.setSmsCancDt(grid.getSmsCancDt());
											tgtGrid.setAtsSndLimYn(grid.getAtsSndLimYn());
											tgtGrid.setCusInfNlkgYn(grid.getCusInfNlkgYn());
											tgtGrid.setNewAcno(grid.getNewAcno());
											tgtGrid.setAcctNo(grid.getNewAcno());			// 계좌번호
											tgtGrid.setPushAgrYn("Y");				// 알림동의여부
										} catch(Exception e){
											logger.error("전계좌세팅 error :: {}", e);
										}
										
										break;
									} else {
										tgtGrid.setNewAcno(acctNo);				// 신계좌번호
										tgtGrid.setHpNo(tmpHpNo);				// 핸드폰번호
										tgtGrid.setPushAgrYn("N");					// WON알림 등록되어있으나, 계좌 매칭안되는 경우
									}
								}
							} else {
								tgtGrid.setNewAcno(acctNo);				// 신계좌번호
								tgtGrid.setHpNo(tmpHpNo);				// 핸드폰번호
								tgtGrid.setPushAgrYn("N");					// WON알림 등록안되어있음
							}
							
//						if("DEP".equals(actInfo.getAccDis())) {
//							tgtGrid.setNewAcno(newAcctNo);
//						} else {
//							tgtGrid.setNewAcno(actInfo.getNewAcno());
//						}
							
							tgtGrid.setNewAcno(newAcctNo);
							
							String acctAliasNm = "";					// 계좌별칭
							// R102112161810 - 외화펀드계좌 관련 수정 2021.12.21
							if(!"FND2".equals(actInfo.getAccDis())) {
								// 계좌가 같을 경우
								if(acctNo.equals(actInfo.getCusUsgAcno()) || acctNo.equals(actInfo.getNewAcno())) {
									// 외화
									if("FXD".equals(actInfo.getAccDis())) {
										acctAliasNm = actInfo.getAccNm();				// 계좌명
										// 예금/신탁 + 대출 LON
									} else {			
										// 계좌벌명이 있는경우
										if(WFStringUtils.isEmpty(actInfo.getActAls().trim())) {
											acctAliasNm = actInfo.getAccNm();			// 계좌명
										} else {
											StringBuffer sb = new StringBuffer();
											sb.append('(');
											sb.append(actInfo.getActAls());
											sb.append(')');
											String tmpAcctAliasNm = sb.toString();
											
											acctAliasNm = tmpAcctAliasNm + actInfo.getAccNm();		// 별칭 + 계좌명
										}
									}
								}
							}
							tgtGrid.setAcctAliasNm(acctAliasNm);
							tgtGrid.setAcctNo(acctNo);
							
							output.getPushNtfcSrvcInqGrid().add(tgtGrid);
						}
					}
				}
			}
			
			/*
			 * 외환 계좌 목록 조회
			 * */
			BSC_ACT_LIST fxdList = sHRAllActInqTbk_COM.selectSessActList(SHRBSCInquiryConstant.BSC_ACT_LIST_INQ_DIS_FX, false);
			
			if(logger.isDebugEnabled()) {
				logger.debug("fxdList ====== {} ::: ", fxdList);
			}
			
			
			if(fxdList.getActList().size() > 0) {
				// 외환 코드 081, 083 추출
				List<BSC_ACT_INFO> newFxdList = fxdList.getActList()
						.stream()
						.filter(item -> "081".equals(item.getSbjCd())
								|| "083".equals(item.getSbjCd()))
						.collect(Collectors.toList());
				
				for(BSC_ACT_INFO actInfo : newFxdList) {
					String newAcctNo = actInfo.getNewAcno();											// 신계좌번호
					String acctNo 	= actInfo.getCusUsgAcno();											// 계좌번호
					String acctNoType = newAcctNo.substring(1, 4);									// 계좌구분코드
					
					//중복데이터 제거 (다통화 외환계좌의 경우 동일계좌로 여러데이터가 들어오는 현상 개선)
					if(!"".equals(acctNo)) {
						INBPushNtfcSrvcInqGrid_DTO tgtGrid = new INBPushNtfcSrvcInqGrid_DTO();
						// PUSH알림 서비스 조회  결과 값이 있다면
						if(ibsmr1249odt.getGrid().size() > 0) {
							for(IBSMR0001249_GRID_ODT grid : ibsmr1249odt.getGrid()) {
								if((acctNo.equals(grid.getNewAcno()) || newAcctNo.equals(grid.getNewAcno())) && !"90".equals(grid.getEbnkSrvcStcd())) {
									try {
										tgtGrid.setDpacNo(grid.getDpacNo());
										tgtGrid.setEbnkSrvcStcd(grid.getEbnkSrvcStcd());
										tgtGrid.setHpNo(grid.getHpNo());
										tgtGrid.setNtcTgtTrnDscd(grid.getNtcTgtTrnDscd());
										tgtGrid.setBalNtrsnYn(grid.getBalNtrsnYn());
										tgtGrid.setSmsTmsLimAm(grid.getSmsTmsLimAm());
										tgtGrid.setTmsStaTm(grid.getTmsStaTm());
										tgtGrid.setTmsEndTm(grid.getTmsEndTm());
										tgtGrid.setPrcSrno(grid.getPrcSrno());
										tgtGrid.setSmsLstNtcDt(grid.getSmsLstNtcDt());
										tgtGrid.setLstNtcCnt(grid.getLstNtcCnt());
										tgtGrid.setSmsCtrDt(grid.getSmsCtrDt());
										tgtGrid.setFstCtrDt(grid.getFstCtrDt());
										tgtGrid.setMdKdcd(grid.getMdKdcd());
										tgtGrid.setSmsCancDt(grid.getSmsCancDt());
										tgtGrid.setAtsSndLimYn(grid.getAtsSndLimYn());
										tgtGrid.setCusInfNlkgYn(grid.getCusInfNlkgYn());
										tgtGrid.setNewAcno(grid.getNewAcno());
										tgtGrid.setAcctNo(grid.getNewAcno());			// 계좌번호
										tgtGrid.setPushAgrYn("Y");				// 알림동의여부
									} catch(Exception e){
										logger.error("외화계좌세팅 error :: {}", e);
									}
									
									break;
								} else {
									tgtGrid.setNewAcno(acctNo);				// 신계좌번호
									tgtGrid.setHpNo(tmpHpNo);				// 핸드폰번호
									tgtGrid.setPushAgrYn("N");					// WON알림 등록
								}
							}
						} else {
							tgtGrid.setNewAcno(acctNo);				// 신계좌번호
							tgtGrid.setHpNo(tmpHpNo);				// 핸드폰번호
							tgtGrid.setPushAgrYn("N");					// WON알림 등록
						}
						
						String acctAliasNm = "";					// 계좌별칭
						// R102112161810 - 외화펀드계좌 관련 수정 2021.12.21
						if(!"FND2".equals(actInfo.getAccDis())) {
							// 계좌가 같을 경우
							if(acctNo.equals(actInfo.getCusUsgAcno()) || acctNo.equals(actInfo.getNewAcno())) {
								// 외화
								if("FXD".equals(actInfo.getAccDis())) {
									acctAliasNm = actInfo.getAccNm();				// 계좌명
									// 예금/신탁 + 대출 LON
								} else {			
									// 계좌벌명이 있는경우
									if("".equals(actInfo.getActAls())) {
										acctAliasNm = actInfo.getAccNm();			// 계좌명
									} else {
										StringBuffer sb = new StringBuffer();
										sb.append('(');
										sb.append(actInfo.getActAls());
										sb.append(')');
										String tmpAcctAliasNm = sb.toString();
										
										acctAliasNm = tmpAcctAliasNm + actInfo.getAccNm();		// 별칭 + 계좌명
									}
								}
							}
						}
						tgtGrid.setAcctAliasNm(acctAliasNm);
						tgtGrid.setAcctNo(acctNo);
						
						// 계좌 중복체크
						boolean isAlreadyAcno = false;
						
						for(INBPushNtfcSrvcInqGrid_DTO outputGrid : output.getPushNtfcSrvcInqGrid()) {
							if(acctNo.equals(outputGrid.getAcctNo())) {
								isAlreadyAcno = true;
								break;
							}
						}
						
						if(!isAlreadyAcno) {
							output.getPushNtfcSrvcInqGrid().add(tgtGrid);
						}
					}
				}
			}
			
			// IBSMR0001249 : PUSH알림 서비스 조회  결과 값이 있다면
			if(ibsmr1249odt.getGrid().size() > 0) {
				boolean existRawNtfcAgrYn = false;					// 입출금알림 동의여부 
				
				for(IBSMR0001249_GRID_ODT ibsmr1249grid : ibsmr1249odt.getGrid()) {
					String preAccNo = ibsmr1249grid.getNewAcno();
					
					// 90:해지 가 아닌 경우
					if(!"90".equals(ibsmr1249grid.getEbnkSrvcStcd())) {
						existRawNtfcAgrYn = true;							// 1건이라도 존재하면 true
						boolean addBoolean = true;
						
						for(INBPushNtfcSrvcInqGrid_DTO grid : output.getPushNtfcSrvcInqGrid()) {
							// 세션 및 인터페이스 조회 결과 계좌번호
							String postAccNo = grid.getNewAcno();
							
							if(preAccNo.equals(postAccNo)) {
								addBoolean = false;
							}
						}
						
						// 입출금 알림 켜져있으나, 계좌번호가 다른 경우, IBSMR0001249 기준계좌번호로 세팅
						if(addBoolean) {
							sHRAllActInqWbkAct_COM = WFApplicationContext.getBean(sHRAllActInqWbkAct_COM, SHRAllActInqWbkAct_COM.class);
							
							try {
								INBPushNtfcSrvcInqGrid_DTO tgtGrid = new INBPushNtfcSrvcInqGrid_DTO();
								
								tgtGrid.setDpacNo(ibsmr1249grid.getDpacNo());
								tgtGrid.setEbnkSrvcStcd(ibsmr1249grid.getEbnkSrvcStcd());
								tgtGrid.setHpNo(ibsmr1249grid.getHpNo());
								tgtGrid.setNtcTgtTrnDscd(ibsmr1249grid.getNtcTgtTrnDscd());
								tgtGrid.setBalNtrsnYn(ibsmr1249grid.getBalNtrsnYn());
								tgtGrid.setSmsTmsLimAm(ibsmr1249grid.getSmsTmsLimAm());
								tgtGrid.setTmsStaTm(ibsmr1249grid.getTmsStaTm());
								tgtGrid.setTmsEndTm(ibsmr1249grid.getTmsEndTm());
								tgtGrid.setPrcSrno(ibsmr1249grid.getPrcSrno());
								tgtGrid.setSmsLstNtcDt(ibsmr1249grid.getSmsLstNtcDt());
								tgtGrid.setLstNtcCnt(ibsmr1249grid.getLstNtcCnt());
								tgtGrid.setSmsCtrDt(ibsmr1249grid.getSmsCtrDt());
								tgtGrid.setFstCtrDt(ibsmr1249grid.getFstCtrDt());
								tgtGrid.setMdKdcd(ibsmr1249grid.getMdKdcd());
								tgtGrid.setSmsCancDt(ibsmr1249grid.getSmsCancDt());
								tgtGrid.setAtsSndLimYn(ibsmr1249grid.getAtsSndLimYn());
								tgtGrid.setCusInfNlkgYn(ibsmr1249grid.getCusInfNlkgYn());
								tgtGrid.setNewAcno(preAccNo);
								tgtGrid.setPushAgrYn("Y");				// WON알림 등록
								tgtGrid.setAcctNo(preAccNo);			// 계좌번호
								
								// 뱅킹에서 계좌명 + 계좌별명 조회
								SHRActListInp_DTO shrActListInpDto = new SHRActListInp_DTO();
								
								shrActListInpDto.setHdnAcexpYn("Y");											// 숨김계좌노출여부
								shrActListInpDto.setRsbrItcsno(currentCust.getItcsno());				// 주민사업자통고번호
								shrActListInpDto.setUserId(currentCust.getUserId());						// 사용자ID
								
								SHRActListOup_DTO shrActListOupDto = sHRAllActInqTbk_COM.selectActList(shrActListInpDto);
								// 전계좌조회 데이터 있으면
								if (shrActListOupDto != null) {
									if(logger.isDebugEnabled()) {
										logger.debug("90190264 shrActListOupDto ======{} ", shrActListOupDto.toString());
									}
									
									for(SHRActInf_DTO shrActInfo : shrActListOupDto.getAll()) {
										if(preAccNo.equals(shrActInfo.getCusUsgAcno()) || preAccNo.equals(shrActInfo.getNewAcno())) {
											StringBuffer sb = new StringBuffer();
											sb.append('(');
											sb.append(shrActInfo.getActAls());
											sb.append(')');
											String tmpAcctAliasNm = sb.toString();										// 별칭
											String acctAliasNm = WFStringUtils.isEmpty(shrActInfo.getActAls()) ? "" + shrActInfo.getAccNm() 					// 계좌명
																															  : tmpAcctAliasNm + shrActInfo.getAccNm();		// 별칭 + 계좌명
											
											tgtGrid.setAcctAliasNm(acctAliasNm);
											
											break;
										}
									}
								}
								
								output.getPushNtfcSrvcInqGrid().add(tgtGrid);
							} catch(Exception e){
								logger.error("PUSH알림 서비스 조회 데이터 세팅 error :: {}", e);
							}
						}
					}
				}
				
				// 예전 원터치알림 유저가 새로 접속할 경우 WON 뱅킹 유저로 업데이트 한다.
				if(existRawNtfcAgrYn) {
					// sms입출금통지 등록한 적이 없거나 앱설치 정보가 아래와 같으면 IBSMR0001250 등록
					String appItllCmplYn = ibsmr1249odt.getAppItllCmplYn();											// 앱설치완료여부
					String appItllDisNm = ibsmr1249odt.getAppItllDisNm();												// 	앱설치구분명
					
					if("Y".equals(appItllCmplYn) && !"WON 뱅킹".equals(appItllDisNm)) {
						sHRIBSMR0001250_COM= WFApplicationContext.getBean(sHRIBSMR0001250_COM, SHRIBSMR0001250_COM.class);
						
						// IBSMR0001250(PUSH 앱 설치) 설정 세팅
						interfaceCfg.setInterfaceId("IBSMR0001250");
						
						wfCusTrnHeader.setFuncCd("31");
						interfaceCfg.setCustomTrnHeader(wfCusTrnHeader);
						// IBSMR0001250(PUSH 앱 설치) 설정 세팅
						IBSMR0001250_IDT ibsmr1250idt = new IBSMR0001250_IDT();
						ibsmr1250idt.setItcsno(currentCust.getItcsno());												// 통합고객번호
						ibsmr1250idt.setHpComCd(custInfo.getHpComCd());											// 핸드폰회사코드
						ibsmr1250idt.setHpTlenNo(custInfo.getHpTlenNo());											// 핸드폰국번번호
						ibsmr1250idt.setHpSerNo(custInfo.getHpSrno());												// 핸드폰일련번호
						ibsmr1250idt.setPsnAppItllYn("X");																	// 원터치개인앱 설치여부
						ibsmr1250idt.setAppItllCmplYn("Y");																	// 앱설치완료여부
						ibsmr1250idt.setAppItllDisNm("WON 뱅킹");															// 	앱설치구분명
						
						/**
						 * 연계시스템 호출
						 * TODO 인터페이스 호출을 위한 코드를 작성하십시오.
						 * TYPE : MCA
						 * ID : IBSMR0001250
						 * NM : PUSH 앱 설치
						 */
						WFInfResponse<IBSMR0001250_ODT> mcaOutput1250 = sHRIBSMR0001250_COM.callTrx(ibsmr1250idt, interfaceCfg);
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
	 * 입출금 알림 설정정보 등록
	 * 
	 * 
	 * @param input 입출금.알림.설정.컨트롤러.입력.IO 
	 * @return 입출금.알림.설정.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName="입출금.알림.설정.정보.등록", description="입출금 알림 설정정보 등록", author="90190264")
	public INBNtfbxPushRawEstInsertRawNtfcEstInf_ODT insertRawNtfcEstInf(INBNtfbxPushRawEstInsertRawNtfcEstInf_IDT input
	)
	{
			
		/**
		* @BXMType GetBean
		*/
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		shrMMHCustSession_COM = WFApplicationContext.getBean(shrMMHCustSession_COM, SHRMMHCustSession_COM.class);
		sHRIBSMR0001246_COM= WFApplicationContext.getBean(sHRIBSMR0001246_COM, SHRIBSMR0001246_COM.class);
		sHRIBSMR0001247_COM= WFApplicationContext.getBean(sHRIBSMR0001247_COM, SHRIBSMR0001247_COM.class);
		sHRIBSMR0001250_COM= WFApplicationContext.getBean(sHRIBSMR0001250_COM, SHRIBSMR0001250_COM.class);
		sHRIBSMR0004974_COM= WFApplicationContext.getBean(sHRIBSMR0004974_COM, SHRIBSMR0004974_COM.class);
		// WFInterfaceCfg 생성 컴포넌트
		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class);
		//  MCA WFInterfaceCfg 객체 획득
		WFInterfaceCfg interfaceCfg  = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg();
		
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession(); 
		MMH_CUST_INFO custInfo = shrMMHCustSession_COM.getCustInfoSession();
		
		/**
		 * @BXMType VariableDeclaration
		 */
		INBNtfbxPushRawEstInsertRawNtfcEstInf_ODT output= new INBNtfbxPushRawEstInsertRawNtfcEstInf_ODT();
		
		// 로그인 체크
		if (shrCMMLoginSession_COM.istLogin()) {
			// 신규입출금알림 등록 여부
			Boolean smsRaw1250Rgs = false;
			
			// IBSMR0001249(PUSH 알림서비스 조회) 조회
			INBNtfbxPushRawEstCallRawNtfcDtlEst_ODT inbRawNtfcEstOdt = callRawNtfcDtlEst();
			
			List<INBPushNtfcSrvcInqGrid_DTO> inbRawNtfcEstOdtList = inbRawNtfcEstOdt.getPushNtfcSrvcInqGrid();
			
			// 스위치 on으로 등록할때(푸시설정 계좌 선택: NWFNS00004_008M)
			if("Y".equals(input.getSwitchYn())) {
				try {
					IBSMR0004974_IDT ibsmr4974Idt = null;
					List<IBSMR0004974_GRID_IDT> ibsmr4974GridIdtList = new ArrayList<>();
					
					// 전체선택일때
					if("Y".equals(input.getSwitchAllYn())) {
						ibsmr4974Idt = new IBSMR0004974_IDT();
						
						ibsmr4974Idt.setHpComCd(input.getRawNtfcEstRgsGrid().get(0).getHpComCd());					// 핸드폰회사코드
						ibsmr4974Idt.setHpTlenNo(input.getRawNtfcEstRgsGrid().get(0).getHpTlenNo());					// 핸드폰국번번호
						ibsmr4974Idt.setHpSrno(input.getRawNtfcEstRgsGrid().get(0).getHpSerNo());						// 핸드폰일련번호
						ibsmr4974Idt.setChrSndXtYn("Y"); 																				// 문자발송제외여부
						ibsmr4974Idt.setGridCnt(input.getRawNtfcEstRgsGrid().size()); 										// 등록건수
					}
					// 신규계좌여부
					Boolean isNewAcnoRgs = false;
					
					// 화면에서 넘어온 목록과 기존에 등록된 목록을 비교
					for(INBRawNtfcEstRgs_DTO rawNtfcEstRgsDto : input.getRawNtfcEstRgsGrid()) {
						String tgtAcno = rawNtfcEstRgsDto.getTgtAcno();				// 대상계좌번호
						// 기등록된 데이터 추출
						INBPushNtfcSrvcInqGrid_DTO exstedGridDto = inbRawNtfcEstOdtList.stream()
																												   .filter(item -> {
																													   // 1249 조회 고객 계좌/신계좌와 화면에서 넘어온 대상계좌와 비교하여 기등록 체크
																													   return item.getDpacNo().equals(tgtAcno) || item.getNewAcno().equals(tgtAcno);
																												   })
																												   .findFirst()
																												   .orElse(null);
						
						// 전체선택일때
						if("Y".equals(input.getSwitchAllYn())) {
							IBSMR0004974_GRID_IDT ibsmr4974GridIdt = new IBSMR0004974_GRID_IDT();
							// 기등록된 계좌면 기등록 데이터 세팅 or default 값 세팅
							if(exstedGridDto != null) {
								String fract = exstedGridDto.getNewAcno().substring(1, 4);				// 외화계좌
								Boolean isFract = false;
								// 외화 계좌일 경우, 통지제한금액 0 원 설정
								if("081".equals(fract) || "083".equals(fract)) {
									isFract = true;
								}
								
								ibsmr4974GridIdt.setTgtAcno(rawNtfcEstRgsDto.getTgtAcno());					// 대상계좌번호
								ibsmr4974GridIdt.setNtcTgtTrnDscd(exstedGridDto.getNtcTgtTrnDscd()); 		// 통지대상거래구분코드
								ibsmr4974GridIdt.setBalNtrsnYn(exstedGridDto.getBalNtrsnYn()); 					// 잔액미전송여부
								ibsmr4974GridIdt.setTmsLimAm(isFract ? BigDecimal.ZERO : exstedGridDto.getSmsTmsLimAm()); // 전송제한금액
								ibsmr4974GridIdt.setTmsStaTm(exstedGridDto.getTmsStaTm()); 					// 전송시작시각
								ibsmr4974GridIdt.setTmsEndTm(exstedGridDto.getTmsEndTm()); 					// 전송종료시각
								ibsmr4974GridIdt.setAtsSndLimYn(exstedGridDto.getAtsSndLimYn()); 				// 자동이체발송제한여부
								ibsmr4974GridIdt.setPrcSrno(exstedGridDto.getPrcSrno()); 							// 처리일련번호
							} else {
								ibsmr4974GridIdt.setTgtAcno(rawNtfcEstRgsDto.getTgtAcno());						// 대상계좌번호
								ibsmr4974GridIdt.setNtcTgtTrnDscd("3");													// 통지대상거래구분코드
								ibsmr4974GridIdt.setBalNtrsnYn("Y");														// 잔액미전송여부( Y : 미표시, N : 표시 )
								ibsmr4974GridIdt.setTmsLimAm("0");														// 전송제한금액
								ibsmr4974GridIdt.setTmsStaTm("00");														// 전송시작시각
								ibsmr4974GridIdt.setTmsEndTm("24");														// 전송종료시각
								ibsmr4974GridIdt.setAtsSndLimYn("Y");														// 자동이체발송제한여부( 자동이체 알림시간 Y: 새벽시간 제외, N: 실시간 )
								ibsmr4974GridIdt.setPrcSrno(0);																// 처리일련번호(수정할때만 값이 있음)
							}
							// List에 적재
							ibsmr4974GridIdtList.add(ibsmr4974GridIdt);
							
						// 단건 선택일때
						} else {
							IBSMR0001246_IDT ibsmr1246idt = new IBSMR0001246_IDT();
							
							// 기등록된 계좌면 기등록 데이터 세팅 or default 값 세팅
							if(exstedGridDto != null) {
								String fract = exstedGridDto.getNewAcno().substring(1, 4);				// 외화계좌
								Boolean isFract = false;
								// 외화 계좌일 경우, 통지제한금액 0 원 설정
								if("081".equals(fract) || "083".equals(fract)) {
									isFract = true;
								}
								
								ibsmr1246idt.setAdvpeEno(""); 															// 권유자직원번호
								ibsmr1246idt.setActPwnoUsgYn("N"); 													// 계좌비밀번호사용여부
								ibsmr1246idt.setActPwno(""); 															// 계좌비밀번호
								ibsmr1246idt.setTgtAcno(rawNtfcEstRgsDto.getTgtAcno());						// 대상계좌번호
								ibsmr1246idt.setNtcTgtTrnDscd(exstedGridDto.getNtcTgtTrnDscd()); 			// 통지대상거래구분코드
								ibsmr1246idt.setBalNtrsnYn(exstedGridDto.getBalNtrsnYn()); 					// 잔액미전송여부
								ibsmr1246idt.setTmsLimAm(isFract ? BigDecimal.ZERO : exstedGridDto.getSmsTmsLimAm()); // 전송제한금액
								ibsmr1246idt.setTmsStaTm(exstedGridDto.getTmsStaTm()); 					// 전송시작시각
								ibsmr1246idt.setTmsEndTm(exstedGridDto.getTmsEndTm()); 					// 전송종료시각
								ibsmr1246idt.setHpComCd(rawNtfcEstRgsDto.getHpComCd()); 					// 핸드폰회사코드
								ibsmr1246idt.setHpTlenNo(rawNtfcEstRgsDto.getHpTlenNo()); 					// 핸드폰국번번호
								ibsmr1246idt.setHpSerNo(rawNtfcEstRgsDto.getHpSerNo()); 					// 핸드폰일련번호
								ibsmr1246idt.setAtsSndLimYn(exstedGridDto.getAtsSndLimYn()); 				// 자동이체발송제한여부
								ibsmr1246idt.setPrcSrno(exstedGridDto.getPrcSrno()); 							// 처리일련번호
								ibsmr1246idt.setChrSndXtYn("Y"); 														// 문자발송제외여부			
							} else {
								ibsmr1246idt.setActPwnoUsgYn("N");													// 계좌비밀번호사용여부
								ibsmr1246idt.setTgtAcno(rawNtfcEstRgsDto.getTgtAcno());						// 대상계좌번호
								ibsmr1246idt.setNtcTgtTrnDscd("3");													// 통지대상거래구분코드
								ibsmr1246idt.setBalNtrsnYn("Y");															// 잔액미전송여부( Y : 미표시, N : 표시 )
								ibsmr1246idt.setTmsLimAm("0");															// 전송제한금액
								ibsmr1246idt.setTmsStaTm("00");														// 전송시작시각
								ibsmr1246idt.setTmsEndTm("24");														// 전송종료시각
								ibsmr1246idt.setHpComCd(rawNtfcEstRgsDto.getHpComCd());					// 핸드폰회사코드
								ibsmr1246idt.setHpTlenNo(rawNtfcEstRgsDto.getHpTlenNo());					// 핸드폰국번번호
								ibsmr1246idt.setHpSerNo(rawNtfcEstRgsDto.getHpSerNo());						// 핸드폰일련번호
								ibsmr1246idt.setAtsSndLimYn("Y");														// 자동이체발송제한여부( 자동이체 알림시간 Y: 새벽시간 제외, N: 실시간 )
								ibsmr1246idt.setPrcSrno(0);																// 처리일련번호(수정할때만 값이 있음)
								ibsmr1246idt.setChrSndXtYn("Y");														// 문자발송제외여부(Y:제외)
							}
							
							// ===================================================================
							// *********************** 1.IBSMR0001246(PUSH 입출금 거래내용 통지 등록) 인터페이스 호출 셋팅 ****************************************
							// ===================================================================
							interfaceCfg.setInterfaceId("IBSMR0001246");
							
							/**
							 * 연계시스템 호출
							 * TODO 인터페이스 호출을 위한 코드를 작성하십시오.
							 * TYPE : MCA
							 * ID : IBSMR0001246
							 * NM : PUSH 입출금 거래내용 통지 등록
							 */
							WFInfResponse<IBSMR0001246_ODT> mcaOutput1246 = sHRIBSMR0001246_COM.callTrx(ibsmr1246idt, interfaceCfg);
							
							if(!mcaOutput1246.hasError()) {
								output.setRtcd("200");
								output.setRtcdTxt("등록 성공");
							}
						}
					}
					
					// 전체선택일때
					if("Y".equals(input.getSwitchAllYn())) {
						if(ibsmr4974Idt != null) {
							ibsmr4974Idt.setGrid(ibsmr4974GridIdtList);							
							// ===================================================================
							// *********************** 1.IBSMR0004974(PUSH 입출금 거래내용 통지 등록(다건) ) 인터페이스 호출 셋팅 ****************************************
							// ===================================================================
							interfaceCfg.setInterfaceId("IBSMR0004974");
							
							WFInfResponse<WFEmpty_ODT> mcaOutput4974 = sHRIBSMR0004974_COM.callTrx(ibsmr4974Idt, interfaceCfg);
							
							if(!mcaOutput4974.hasError()) {
								output.setRtcd("200");
								output.setRtcdTxt("등록 성공");
							}
						}
					}
			} catch (WFApplicationException e) {
				logger.error("WFApplicationException :: {}", e);
				Object[] args = e.getArguments();

				output.setRtcd(e.getResolvedMessage());		// 안내
				output.setRtcdTxt(args[0].toString());				// 변경 전과 다른 내용을 입력해주세요.
			} catch (Exception e) {
				logger.error("Exception :: {}", e);
				output.setRtcd("");
				output.setRtcdTxt("등록 실패");
			}
				
			// 입출금상세설정(NWFNS00004_002M), 다른계좌 동시 적용(NWFNS00004_004P)일때
			} else {
				
				for(INBRawNtfcEstRgs_DTO rawNtfcEstRgsDto : input.getRawNtfcEstRgsGrid()) {
					// 기동의 여부면 업데이트
					if("Y".equals(rawNtfcEstRgsDto.getPushAgrYn())) {
						try {
							interfaceCfg.setInterfaceId("IBSMR0001247");
							
							IBSMR0001247_IDT ibsmr1247idt = new IBSMR0001247_IDT();
							
							ibsmr1247idt.setAdvpeEno(""); 															// 권유자직원번호
							ibsmr1247idt.setActPwnoUsgYn("N"); 													// 계좌비밀번호사용여부
							ibsmr1247idt.setActPwno(""); 															// 계좌비밀번호
							ibsmr1247idt.setTgtAcno(rawNtfcEstRgsDto.getTgtAcno());						// 대상계좌번호
							ibsmr1247idt.setNtcTgtTrnDscd(rawNtfcEstRgsDto.getNtcTgtTrnDscd()); 	// 통지대상거래구분코드
							ibsmr1247idt.setBalNtrsnYn(rawNtfcEstRgsDto.getBalNtrsnYn()); 				// 잔액미전송여부
							ibsmr1247idt.setTmsLimAm(rawNtfcEstRgsDto.getTmsLimAm()); 				// 전송제한금액
							ibsmr1247idt.setTmsStaTm(rawNtfcEstRgsDto.getTmsStaTm()); 				// 전송시작시각
							ibsmr1247idt.setTmsEndTm(rawNtfcEstRgsDto.getTmsEndTm()); 				// 전송종료시각
							ibsmr1247idt.setHpComCd(rawNtfcEstRgsDto.getHpComCd()); 					// 핸드폰회사코드
							ibsmr1247idt.setHpTlenNo(rawNtfcEstRgsDto.getHpTlenNo()); 					// 핸드폰국번번호
							ibsmr1247idt.setHpSerNo(rawNtfcEstRgsDto.getHpSerNo()); 					// 핸드폰일련번호
							ibsmr1247idt.setAtsSndLimYn(rawNtfcEstRgsDto.getAtsSndLimYn()); 			// 자동이체발송제한여부
							ibsmr1247idt.setPrcSrno(rawNtfcEstRgsDto.getPrcSrno()); 						// 처리일련번호
							ibsmr1247idt.setChrSndXtYn("Y"); 														// 문자발송제외여부	
							ibsmr1247idt.setActPwnoUsgYn("N");													// 계좌비밀번호사용여부
							ibsmr1247idt.setChrSndXtYn("Y");														// 문자발송제외여부
							/**
							 * 연계시스템 호출
							 * TODO 인터페이스 호출을 위한 코드를 작성하십시오.
							 * TYPE : MCA
							 * ID : IBSMR0001247
							 * NM : PUSH 입출금 거래내용 통지 변경
							 */
							WFInfResponse<IBSMR0001247_ODT> mcaOutput1247 = sHRIBSMR0001247_COM.callTrx(ibsmr1247idt, interfaceCfg);
							
							if(!mcaOutput1247.hasError()) {
								output.setRtcd("200");
								output.setRtcdTxt("변경 성공");
							}
						} catch (WFApplicationException e) {
							logger.error("WFApplicationException :: {}", e);
							Object[] args = e.getArguments();

							output.setRtcd(e.getResolvedMessage());		// ex) 안내
							output.setRtcdTxt(args[0].toString());				// ex) 변경 전과 다른 내용을 입력해주세요.
							
							if("Y".equals(input.getSwitchAllYn()) && "IFIE0000".equals(e.getCode())) {
								continue;
							}
						} catch (Exception e) {
							logger.error("Exception :: {}", e);
							output.setRtcd("");
							output.setRtcdTxt("등록 실패");
						}
					} else {
						try {
							interfaceCfg.setInterfaceId("IBSMR0001246");
							
							IBSMR0001246_IDT ibsmr1246idt = new IBSMR0001246_IDT();
							
							ibsmr1246idt.setAdvpeEno(""); 															// 권유자직원번호
							ibsmr1246idt.setActPwnoUsgYn("N"); 													// 계좌비밀번호사용여부
							ibsmr1246idt.setActPwno(""); 															// 계좌비밀번호
							ibsmr1246idt.setTgtAcno(rawNtfcEstRgsDto.getTgtAcno());						// 대상계좌번호
							ibsmr1246idt.setNtcTgtTrnDscd(rawNtfcEstRgsDto.getNtcTgtTrnDscd()); 	// 통지대상거래구분코드
							ibsmr1246idt.setBalNtrsnYn(rawNtfcEstRgsDto.getBalNtrsnYn()); 				// 잔액미전송여부
							ibsmr1246idt.setTmsLimAm(rawNtfcEstRgsDto.getTmsLimAm()); 				// 전송제한금액
							ibsmr1246idt.setTmsStaTm(rawNtfcEstRgsDto.getTmsStaTm()); 				// 전송시작시각
							ibsmr1246idt.setTmsEndTm(rawNtfcEstRgsDto.getTmsEndTm()); 				// 전송종료시각
							ibsmr1246idt.setHpComCd(rawNtfcEstRgsDto.getHpComCd()); 					// 핸드폰회사코드
							ibsmr1246idt.setHpTlenNo(rawNtfcEstRgsDto.getHpTlenNo()); 					// 핸드폰국번번호
							ibsmr1246idt.setHpSerNo(rawNtfcEstRgsDto.getHpSerNo()); 					// 핸드폰일련번호
							ibsmr1246idt.setAtsSndLimYn(rawNtfcEstRgsDto.getAtsSndLimYn()); 			// 자동이체발송제한여부
							ibsmr1246idt.setPrcSrno(rawNtfcEstRgsDto.getPrcSrno()); 						// 처리일련번호
							ibsmr1246idt.setChrSndXtYn("Y"); 														// 문자발송제외여부	
							ibsmr1246idt.setActPwnoUsgYn("N");													// 계좌비밀번호사용여부
							ibsmr1246idt.setChrSndXtYn("Y");														// 문자발송제외여부
							/**
							 * 연계시스템 호출
							 * TODO 인터페이스 호출을 위한 코드를 작성하십시오.
							 * TYPE : MCA
							 * ID : IBSMR0001246
							 * NM : PUSH 입출금 거래내용 통지 등록
							 */
							WFInfResponse<IBSMR0001246_ODT> mcaOutput1246 = sHRIBSMR0001246_COM.callTrx(ibsmr1246idt, interfaceCfg);
							
							if(!mcaOutput1246.hasError()) {
								output.setRtcd("200");
								output.setRtcdTxt("등록 성공");
							}
						} catch (WFApplicationException e) {
							logger.error(" WFApplicationException :: {}", e);
							Object[] args = e.getArguments();
	
							output.setRtcd(e.getResolvedMessage());		// 안내
							output.setRtcdTxt(args[0].toString());				// 변경 전과 다른 내용을 입력해주세요.
						} catch (Exception e) {
							logger.error("Exception :: {}", e);
							output.setRtcd("");
							output.setRtcdTxt("등록 실패");
						}
					}
				}
			}
			
			// sms입출금통지 등록한 적이 없거나 앱설치 정보가 아래와 같으면 IBSMR0001250 등록
			if(inbRawNtfcEstOdtList.size() == 0) {
				smsRaw1250Rgs = true;
			} else {
				String appItllCmplYn = inbRawNtfcEstOdt.getAppItllCmplYn();		// 앱설치완료여부
				String appItllDisNm = inbRawNtfcEstOdt.getAppItllDisNm();			// 	앱설치구분명

	             if(!"Y".equals(appItllCmplYn) && !"WON 뱅킹".equals(appItllDisNm)) {
	            	 smsRaw1250Rgs = true;
	             }
			}
			
			try {
				if(smsRaw1250Rgs) {
					// IBSMR0001250(PUSH 앱 설치) 설정 세팅
					interfaceCfg.setInterfaceId("IBSMR0001250");
					
					WFCustomTrnHeader wfCusTrnHeader = new WFCustomTrnHeader();
					wfCusTrnHeader.setFuncCd("31");
					interfaceCfg.setCustomTrnHeader(wfCusTrnHeader);
					// IBSMR0001250(PUSH 앱 설치) 설정 세팅
					IBSMR0001250_IDT ibsmr1250idt = new IBSMR0001250_IDT();
					ibsmr1250idt.setItcsno(currentCust.getItcsno());												// 통합고객번호
					ibsmr1250idt.setHpComCd(input.getRawNtfcEstRgsGrid().get(0).getHpComCd());		// 핸드폰회사코드
					ibsmr1250idt.setHpTlenNo(input.getRawNtfcEstRgsGrid().get(0).getHpTlenNo());		// 핸드폰국번번호
					ibsmr1250idt.setHpSerNo(input.getRawNtfcEstRgsGrid().get(0).getHpSerNo());		// 핸드폰일련번호
					ibsmr1250idt.setPsnAppItllYn("X");																	//원터치개인앱 설치여부
					ibsmr1250idt.setAppItllCmplYn("Y");																	// 앱설치완료여부
					ibsmr1250idt.setAppItllDisNm("WON 뱅킹");															// 	앱설치구분명
					
					/**
					 * 연계시스템 호출
					 * TODO 인터페이스 호출을 위한 코드를 작성하십시오.
					 * TYPE : MCA
					 * ID : IBSMR0001250
					 * NM : PUSH 앱 설치
					 */
					WFInfResponse<IBSMR0001250_ODT> mcaOutput1250 = sHRIBSMR0001250_COM.callTrx(ibsmr1250idt, interfaceCfg);
					
					if(!mcaOutput1250.hasError()) {
						output.setRtcd("200");
						output.setRtcdTxt("등록 성공");
					}
				}
			} catch (WFApplicationException e) {
				logger.error("WFApplicationException :: {}", e);
				Object[] args = e.getArguments();

				output.setRtcd(e.getResolvedMessage());		// 안내
				output.setRtcdTxt(args[0].toString());				// 변경 전과 다른 내용을 입력해주세요.
			} catch (Exception e) {
				logger.error("Exception :: {}", e);
				output.setRtcd("");
				output.setRtcdTxt("등록 실패");
			}	
			
		} else {
			//  로그인 세션이 존재하지 않습니다.
			throw new WFApplicationException("CMME0018");
		}
		
		return output;
			
	}
		
	/**
	 * 입출금 알림 동의여부 해지 
	 * 
	 * @param input 입출금.알림.설정.컨트롤러.입력.IO
	 * @return 입출금.알림.설정.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName="입출금.알림.동의여부.삭제", description="입출금 알림 동의여부 해지", author="90190264")
	public INBNtfbxPushRawEstDeleteRawNtfcAgrYn_ODT deleteRawNtfcagrYn(INBNtfbxPushRawEstDeleteRawNtfcAgrYn_IDT input
	)
	{
		// WFInterfaceCfg 생성 컴포넌트
		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class);
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class); 
		sHRIBSMR0001248_COM= WFApplicationContext.getBean(sHRIBSMR0001248_COM, SHRIBSMR0001248_COM.class);
		sHRIBSMR0001251_COM= WFApplicationContext.getBean(sHRIBSMR0001251_COM, SHRIBSMR0001251_COM.class);
		sHRIBSMR0005658_COM= WFApplicationContext.getBean(sHRIBSMR0005658_COM, SHRIBSMR0005658_COM.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */
		INBNtfbxPushRawEstDeleteRawNtfcAgrYn_ODT output= new INBNtfbxPushRawEstDeleteRawNtfcAgrYn_ODT();
		WFInterfaceCfg interfaceCfg  = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg();
		
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession();
		
		// 로그인 체크
		if (shrCMMLoginSession_COM.istLogin()) {
			/**
			 * @BXMType Try
			 * 입출금 알림 동의여부 삭제 처리
			 */
			try {
				// 전체선택일때
				if("Y".equals(input.getSwitchAllYn())) {
					IBSMR0005658_IDT ibsmr5658Idt = new IBSMR0005658_IDT();
					ibsmr5658Idt.setItcsno(currentCust.getItcsno());
					
					WFInfResponse<WFEmpty_ODT> mcaOutput5658 = sHRIBSMR0005658_COM.callTrx(ibsmr5658Idt, interfaceCfg);
					
				} else {
					for(INBRawNtfcEstRgs_DTO rawNtfcEstRgsDto : input.getRawNtfcEstRgsGrid()) {
						/**
						 * @BXMType Try
						 * 입출금 알림 동의여부 해지 처리
						 */
						// ===================================================================
						// *********************** 1.IBSMR0001248(PUSH 입출금 거래내용 통지 해지) 인터페이스 호출 셋팅 ****************************************
						// ===================================================================
						interfaceCfg.setInterfaceId("IBSMR0001248");
						
						IBSMR0001248_IDT ibsmr1248idt = new IBSMR0001248_IDT();
						ibsmr1248idt.setActPwnoUsgYn("N");													// 계좌비밀번호사용여부
						ibsmr1248idt.setTgtAcno(rawNtfcEstRgsDto.getTgtAcno());						// 대상계좌번호
						ibsmr1248idt.setNtcTgtTrnDscd(rawNtfcEstRgsDto.getNtcTgtTrnDscd());													// 통지대상거래구분코드
						ibsmr1248idt.setBalNtrsnYn(rawNtfcEstRgsDto.getBalNtrsnYn());															// 잔액미전송여부( Y : 미표시, N : 표시 )
						ibsmr1248idt.setTmsLimAm(rawNtfcEstRgsDto.getTmsLimAm());															// 전송제한금액
						ibsmr1248idt.setTmsStaTm(rawNtfcEstRgsDto.getTmsStaTm());														// 전송시작시각
						ibsmr1248idt.setTmsEndTm(rawNtfcEstRgsDto.getTmsEndTm());														// 전송종료시각
						ibsmr1248idt.setHpComCd(rawNtfcEstRgsDto.getHpComCd());					// 핸드폰회사코드
						ibsmr1248idt.setHpTlenNo(rawNtfcEstRgsDto.getHpTlenNo());					// 핸드폰국번번호
						ibsmr1248idt.setHpSerNo(rawNtfcEstRgsDto.getHpSerNo());						// 핸드폰일련번호
						ibsmr1248idt.setAtsSndLimYn(rawNtfcEstRgsDto.getAtsSndLimYn());														// 자동이체발송제한여부( 자동이체 알림시간 Y: 새벽시간 제외, N: 실시간 )
						ibsmr1248idt.setPrcSrno(rawNtfcEstRgsDto.getPrcSrno());																// 처리일련번호(수정할때만 값이 있음)
						ibsmr1248idt.setChrSndXtYn("Y");														// 문자발송제외여부(Y:제외)
						
						/**
						 * 연계시스템 호출
						 * TODO 인터페이스 호출을 위한 코드를 작성하십시오.
						 * TYPE : MCA
						 * ID : IBSMR0001248
						 * NM : PUSH 입출금 거래내용 통지 해지
						 */
						WFInfResponse<IBSMR0001248_ODT> mcaOutput1246 = sHRIBSMR0001248_COM.callTrx(ibsmr1248idt, interfaceCfg);
					}
				}
				int activeAccountCount = 0;
				// 전체 선택이 아닐 경우 1249의 목록 조회하여 sms입출금통지 등록된 건수를 파악한다.
				if(!"Y".equals(input.getSwitchAllYn())) {
					// 대상계좌 조회
					INBNtfbxPushRawEstCallRawNtfcDtlEst_ODT inbRawNtfcEstOdt = callRawNtfcDtlEst();
					
					List<INBPushNtfcSrvcInqGrid_DTO> inbRawNtfcEstOdtList = inbRawNtfcEstOdt.getPushNtfcSrvcInqGrid();
					
					// 1249로 조회한 목록
					for(INBPushNtfcSrvcInqGrid_DTO grid : inbRawNtfcEstOdtList) {
						if(!"90".equals(grid.getEbnkSrvcStcd())) {
							activeAccountCount ++;
						}
					}
				}
				// 등록된 계좌가 없을 때 앱 삭제거래 실행 [IBSMR0001251]
				if(activeAccountCount == 0) {
					interfaceCfg.setInterfaceId("IBSMR0001251");
					
					// 3. WFCustomTrnHeader 셋팅
					WFCustomTrnHeader wfCusTrnHeader = new WFCustomTrnHeader();
					wfCusTrnHeader.setFuncCd("52");			// 거래코드
					interfaceCfg.setCustomTrnHeader(wfCusTrnHeader);
					
					IBSMR0001251_IDT ibsmr1251Idt = new IBSMR0001251_IDT();
					
					ibsmr1251Idt.setItcsno(currentCust.getItcsno());
					
					/**
					 * 연계시스템 호출
					 * TODO 인터페이스 호출을 위한 코드를 작성하십시오.
					 * TYPE : MCA
					 * ID : IBSMR0001251
					 * NM : PUSH 앱 삭제
					 */
					WFInfResponse<WFEmpty_ODT> mcaOutput1251 = sHRIBSMR0001251_COM.callTrx(ibsmr1251Idt, interfaceCfg);
				}
			} catch (WFApplicationException e) {
				logger.error("deleteRawNtfcagrYn WFApplicationException :: {}", e);
				Object[] args = e.getArguments();

				output.setRtcd(e.getResolvedMessage());		// 안내
				output.setRtcdTxt(args[0].toString());				// 변경 전과 다른 내용을 입력해주세요.
			} catch (Exception e) {
				logger.error("deleteRawNtfcagrYn Exception :: {}", e);
				output.setRtcd("");
				output.setRtcdTxt("등록 실패");
			}
		} else {
			//  로그인 세션이 존재하지 않습니다.
			throw new WFApplicationException("CMME0018");
		}
		
		return output;
	}
		
	/**
	 * 입출금 알림 상세 설정 호출
	 * 
	 * @param input 입출금.알림.설정.컨트롤러.입력.IO
	 * @return 입출금.알림.설정.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName="입출금.알림.상세.설정.호출", description="입출금 알림 상세 설정 화면 호출", author="90190264")
	public INBNtfbxPushRawEstCallRawNtfcDtlEst_ODT callRawNtfcDtlEst()
	{
		/**
		* @BXMType GetBean
		*/
		sHRIBSMR0001249_COM= WFApplicationContext.getBean(sHRIBSMR0001249_COM, SHRIBSMR0001249_COM.class);
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class); 
		// WFInterfaceCfg 생성 컴포넌트
		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class); 
		
		/**
		 * @BXMType VariableDeclaration
		 */
		INBNtfbxPushRawEstCallRawNtfcDtlEst_ODT output= new INBNtfbxPushRawEstCallRawNtfcDtlEst_ODT();
		
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession(); 
		
		// 로그인 체크
		if (shrCMMLoginSession_COM.istLogin()) {
			// ===================================================================
			// *********************** 1.IBSMR0001249(PUSH 알림서비스 조회) 인터페이스 호출 셋팅 ****************************************
			// ===================================================================
			//  MCA WFInterfaceCfg 객체 획득
			WFInterfaceCfg interfaceCfg  = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg();
			interfaceCfg.setInterfaceId("IBSMR0001249");
			
			// WFCustomTrnHeader 셋팅
			WFCustomTrnHeader wfCusTrnHeader = new WFCustomTrnHeader();
			wfCusTrnHeader.setFuncCd("20");			// 거래코드	조회:20 / 등록:30 / 변경:40 / 해지:50
			
			// interfaceCfg 셋팅
			interfaceCfg.setCustomTrnHeader(wfCusTrnHeader);
			
			IBSMR0001249_IDT ibsmr1249idt = new IBSMR0001249_IDT();
			
			ibsmr1249idt.setItcsno(currentCust.getItcsno());					// 통합고객번호
			ibsmr1249idt.setEncyAcnmNo(currentCust.getEncyRbno());		// 암호화실명번호
			ibsmr1249idt.setEncyRrno(currentCust.getEncyRbno());			// 암호화주민번호
			
			try {
				/**
				 * 연계시스템 호출
				 * TODO 인터페이스 호출을 위한 코드를 작성하십시오.
				 * TYPE : MCA
				 * ID : IBSMR0001249
				 * NM : PUSH 알림서비스 조회
				 */
				WFInfResponse<IBSMR0001249_ODT> mcaOutput = sHRIBSMR0001249_COM.callTrx(ibsmr1249idt, interfaceCfg);
				
				if(!mcaOutput.hasError()) {
					IBSMR0001249_ODT ibsmr1249odt = mcaOutput.getResponseData();
					
					output.setCnt(ibsmr1249odt.getCnt()); 												// 건수
					output.setHpComCd(ibsmr1249odt.getHpComCd()); 								// 핸드폰회사코드
					output.setHpTlenNo(ibsmr1249odt.getHpTlenNo()); 								// 핸드폰국번번호
					output.setHpSerNo(ibsmr1249odt.getHpSerNo()); 									// 핸드폰일련번호
					output.setAppItllCmplYn(ibsmr1249odt.getAppItllCmplYn()); 						// 앱설치완료여부
					output.setAppItllDisNm(ibsmr1249odt.getAppItllDisNm()); 						// 앱설치구분명
					output.setAppItllCmplDt(ibsmr1249odt.getAppItllCmplDt()); 						// 앱설치완료일자
					output.setNtfcJnngYn(ibsmr1249odt.getNtfcJnngYn()); 							// 알림가입여부
					output.setXrtntcCurYn(ibsmr1249odt.getXrtntcCurYn()); 						// 환율고시통화여부
					output.setNtfcSrvcUsgYn1(ibsmr1249odt.getNtfcSrvcUsgYn1()); 				// 알림서비스사용여부_1
					output.setNtfcSrvcUsgYn2(ibsmr1249odt.getNtfcSrvcUsgYn2());				// 알림서비스사용여부_2
					output.setNtfcSrvcUsgYn3(ibsmr1249odt.getNtfcSrvcUsgYn3()); 				// 알림서비스사용여부_3
					output.setNtfcSrvcUsgYn4(ibsmr1249odt.getNtfcSrvcUsgYn4()); 				// 알림서비스사용여부_4
					output.setNtfcSrvcUsgYn5(ibsmr1249odt.getNtfcSrvcUsgYn5()); 				// 알림서비스사용여부_5
					output.setNtfcSrvcUsgYn6(ibsmr1249odt.getNtfcSrvcUsgYn6()); 				// 알림서비스사용여부_6
					output.setNtfcSrvcUsgYn99(ibsmr1249odt.getNtfcSrvcUsgYn99()); 			// 알림서비스사용여부_99
					
					for(IBSMR0001249_GRID_ODT grid : ibsmr1249odt.getGrid()) {
						INBPushNtfcSrvcInqGrid_DTO tgtGrid = new INBPushNtfcSrvcInqGrid_DTO();
						
						tgtGrid.setDpacNo(grid.getDpacNo());
						tgtGrid.setEbnkSrvcStcd(grid.getEbnkSrvcStcd());
						tgtGrid.setHpNo(grid.getHpNo());
						tgtGrid.setNtcTgtTrnDscd(grid.getNtcTgtTrnDscd());
						tgtGrid.setBalNtrsnYn(grid.getBalNtrsnYn());
						tgtGrid.setSmsTmsLimAm(grid.getSmsTmsLimAm());
						tgtGrid.setTmsStaTm(grid.getTmsStaTm());
						tgtGrid.setTmsEndTm(grid.getTmsEndTm());
						tgtGrid.setPrcSrno(grid.getPrcSrno());
						tgtGrid.setSmsLstNtcDt(grid.getSmsLstNtcDt());
						tgtGrid.setLstNtcCnt(grid.getLstNtcCnt());
						tgtGrid.setSmsCtrDt(grid.getSmsCtrDt());
						tgtGrid.setFstCtrDt(grid.getFstCtrDt());
						tgtGrid.setMdKdcd(grid.getMdKdcd());
						tgtGrid.setSmsCancDt(grid.getSmsCancDt());
						tgtGrid.setAtsSndLimYn(grid.getAtsSndLimYn());
						tgtGrid.setCusInfNlkgYn(grid.getCusInfNlkgYn());
						tgtGrid.setNewAcno(grid.getNewAcno());
						tgtGrid.setAcctNo(grid.getNewAcno());			// 계좌번호
						tgtGrid.setPushAgrYn("Y");				// 알림동의여부
						
						output.getPushNtfcSrvcInqGrid().add(tgtGrid);
					}
				}
			} catch(WFApplicationException e){
				logger.error("IBSMR0001249 전문 error :: {}", e);
			}  catch (Exception e) {
				logger.error("callRawNtfcDtlEst exception :: {}", e);
			}
		} else {
			//  로그인 세션이 존재하지 않습니다.
			throw new WFApplicationException("CMME0018");
		}
		
		return output;
			
	}
		
}
