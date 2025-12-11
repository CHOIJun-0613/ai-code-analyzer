package com.skbank.sml.fns.inb.svc;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.skbank.sml.bsc.shr.com.SHRAllActInqActMng_COM;
import com.skbank.sml.bsc.shr.com.SHRAllActInqTbk_COM;
import com.skbank.sml.bsc.shr.com.SHRAllActInqWbkAct_COM;
import com.skbank.sml.bsc.shr.dto.SHRActInf_DTO;
import com.skbank.sml.bsc.shr.dto.SHRActListInp_DTO;
import com.skbank.sml.bsc.shr.dto.SHRActListOup_DTO;
import com.skbank.sml.bsc.shr.dto.SHRActMngFuncList_DTO;
import com.skbank.sml.bsc.shr.dto.SHRAllActInqWbkActInf_DTO;
import com.skbank.sml.cmm.shr.com.SHRCMMInterfaceCfg_COM;
import com.skbank.sml.cmm.shr.com.SHRCMMLoginSession_COM;
import com.skbank.sml.cmm.shr.com.SHRMMHCustSession_COM;
import com.skbank.sml.cmm.shr.com.SHRMMHEsnsMbhInfInq_S_COM;
import com.skbank.sml.cmm.shr.dto.CMM_CURRENT_CUST;
import com.skbank.sml.cmm.shr.dto.MMH_CUST_INFO;
import com.skbank.sml.cmm.shr.dto.MMH_PIGT_AGR_INFO;
import com.skbank.sml.cmm.shr.dto.SHREsnsMbhInfInqIN_DTO;
import com.skbank.sml.cmm.shr.dto.SHREsnsMbhInfInqOUT_DTO;
import com.skbank.sml.fns.inb.com.INBItgNtfbxListInq_COM;
import com.skbank.sml.fns.inb.cst.cstt.INBCmmConstant;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxListInqSelectCtgrClf_IDT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxListInqSelectCtgrClf_ODT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxListInqSelectKataNtfcList_ODT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxListInqSelectPushNtfcList_IDT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxListInqSelectSmsNtfcList_IDT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxListInqSelectSmsNtfcList_ODT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxListInqSelectUserInf_ODT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxListInqSelectPushNtfcList_ODT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxListInqSelectKataNtfcList_IDT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxListInqUpdateNtfcFavt_IDT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxListInqUpdateNtfcFavt_ODT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxListInqUpdateReadYn_IDT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxListInqUpdateReadYn_ODT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxListInqSelectMrktAgrYn_ODT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxListInqSelectPushAgrYn_IDT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxListInqSelectPushAgrYn_ODT;
import com.skbank.sml.fns.inb.dbm.NTFBX_CTGR_BSCI001_DBM;
import com.skbank.sml.fns.inb.dto.INBCtgrClfGrid_DTO;
import com.skbank.sml.fns.inb.dto.INBKataNtfcRspGrid_DTO;
import com.skbank.sml.fns.inb.dto.INBKkoBtnInfList_DTO;
import com.skbank.sml.fns.inb.dto.INBPushListRsp_DTO;
import com.skbank.sml.fns.inb.dto.INBPushNtfcRspGrid_DTO;
import com.skbank.sml.fns.inb.dto.INBSmsNtfcRspGrid_DTO;
import com.skbank.sml.fns.inb.dto.INBUmsCtgrClfGrid_DTO;
import com.skbank.sml.fns.inb.dto.INBUmsCtgrClf_DTO;
import com.skbank.sml.fns.inb.dto.ItgNtfcListInq_DIDT;
import com.skbank.sml.fns.inb.dto.KataNtfcLIstInq_DODT;
import com.skbank.sml.fns.inb.dto.NTFBX_CTGR_BSCI001SelectPushCtgrList_DIDT;
import com.skbank.sml.fns.inb.dto.NTFBX_CTGR_BSCI001SelectPushCtgrList_DODT;
import com.skbank.sml.fns.inb.dto.NtfcFavt_DIDT;
import com.skbank.sml.fns.inb.dto.NtfcFavt_DODT;
import com.skbank.sml.fns.inb.dto.NtfcReadYn_DIDT;
import com.skbank.sml.fns.inb.dto.NtfcReadYn_DODT;
import com.skbank.sml.fns.inb.dto.PushNtfcLIstInq_DODT;
import com.skbank.sml.fns.inb.dto.SmsNtfcLIstInq_DODT;
import com.skbank.sml.fns.shr.com.SHRINBPushBiz_COM;
import com.skbank.sml.fns.shr.dto.SHRINBPushBscInf_DTO;
import com.skbank.sml.ifi.mca.eims3.dto.IBSMR0001073_GRID_ODT;
import com.skbank.sml.ifi.mca.eims3.dto.IBSMR0001073_IDT;
import com.skbank.sml.ifi.mca.eims3.dto.IBSMR0001073_ODT;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0001073_COM;

import bxm.common.annotaion.BxmCategory;
import bxm.common.util.StringUtils;
import fwk.skbank.asis.adaptor.dto.request.WFInterfaceCfg;
import fwk.skbank.asis.adaptor.dto.response.WFInfResponse;
import fwk.skbank.asis.adaptor.header.request.WFNciHeader;
import fwk.skbank.online.context.WFApplicationContext;
import fwk.skbank.online.exception.app.WFApplicationException;
import fwk.skbank.online.util.WFStringUtils;

/**
 * 1.업무명 : 금융서비스
 * 2.단위업무명 : NEWWON 중분류 통합알림함
 * 3.프로그램명 : 알림함.목록.조회.서비스
 * 4.설명 : 통합알림함 PUSH, SMS, KAKAO 알림 목록을 조회 한다.
 * 
 * @Class INBNtfbxListInq_SVC.java
 * @author 90190264
 * @since 2024.03.21
 * @version 1.0
 */		
@Service
@BxmCategory(logicalName="알림함.목록.조회.서비스", description="통합알림함 PUSH, SMS, KAKAO 알림 목록을 조회 한다.")
public class INBNtfbxListInq_SVC {
	private Logger logger= LoggerFactory.getLogger(getClass());
	
	/**
	 * 통합.알림함.목록.조회.컴포넌트
	 */
	private INBItgNtfbxListInq_COM iNBItgNtfbxListInq_COM;
	
	private SHRINBPushBiz_COM sHRINBPushBiz_COM;
	
	private SHRCMMLoginSession_COM shrCMMLoginSession_COM;
	private SHRMMHCustSession_COM sHRMMHCustSession_COM;
	/**
	 * WFInterfaceCfg 생성 컴포넌트
	 */
	private SHRCMMInterfaceCfg_COM sHRCMMInterfaceCfg_COM;
	/**
	 * WFInterfaceCfg 생성 컴포넌트
	 */
	private NTFBX_CTGR_BSCI001_DBM ntfbxCtgrBsci001_dbm;
	/**
	 * 간편회원 정보 조회 COM
	 */
	private SHRMMHEsnsMbhInfInq_S_COM sHRMMHEsnsMbhInfInq_S_COM;
	/**
	 * 전계좌 조회 COM
	 */
	private SHRAllActInqWbkAct_COM sHRAllActInqWbkAct_COM;
	/**
	 * 전계좌 조회 COM
	 */
	private SHRAllActInqTbk_COM sHRAllActInqTbk_COM;
	/**
	 * 전계좌 조회 COM
	 */
	private SHRAllActInqActMng_COM sHRAllActInqActMng_COM;
	/**
	 * 핸드폰계좌 조회 COM
	 */
	private SHRIBSMR0001073_COM sHRIBSMR0001073_COM;
	
		
	/**
	 * PUSH 알림 목록을 조회한다. 
	 * 
	 * @param input 통합.알림.목록.조회.컨트롤러.입력.IO
	 * @return 통합.알림.목록.조회.컨트롤러.출력.IO 
	 */
	@BxmCategory(logicalName="PUSH.알림.목록.조회", description="PUSH 알림 목록을 조회한다.", author="90190264")
	public INBNtfbxListInqSelectPushNtfcList_ODT selectPushNtfcList(INBNtfbxListInqSelectPushNtfcList_IDT input
	) throws WFApplicationException
	{
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		ntfbxCtgrBsci001_dbm= WFApplicationContext.getBean(ntfbxCtgrBsci001_dbm, NTFBX_CTGR_BSCI001_DBM.class);
		iNBItgNtfbxListInq_COM= WFApplicationContext.getBean(iNBItgNtfbxListInq_COM, INBItgNtfbxListInq_COM.class);
		sHRAllActInqWbkAct_COM = WFApplicationContext.getBean(sHRAllActInqWbkAct_COM, SHRAllActInqWbkAct_COM.class);
		sHRAllActInqTbk_COM = WFApplicationContext.getBean(sHRAllActInqTbk_COM, SHRAllActInqTbk_COM.class);
		sHRAllActInqActMng_COM = WFApplicationContext.getBean(sHRAllActInqActMng_COM, SHRAllActInqActMng_COM.class);
		//세션고객정보
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession(); 
			
		/**
		 * @BXMType VariableDeclaration
		 */
		INBNtfbxListInqSelectPushNtfcList_ODT output= new INBNtfbxListInqSelectPushNtfcList_ODT();
		
		/**
		 * 컴포넌트 DTO
		 */
		PushNtfcLIstInq_DODT dOutputList = new PushNtfcLIstInq_DODT();
		ItgNtfcListInq_DIDT dInput = new ItgNtfcListInq_DIDT();
		
		try{
			String itcscno = "";
			String userId = "";					// userId
			// 로그인 체크 - 로그인일 경우
			if (shrCMMLoginSession_COM.istLogin()) {
				userId = currentCust.getUserId();
				// 간편회원여부
				String spCusYn = currentCust.getSpCusYn();
				// 간편회원이 아닐 경우(금융회원 로그인/비로그인)
				if(!"Y".equals(spCusYn)) {
					String frontItcsno = input.getItcsno();
					String sessionItcsno = currentCust.getItcsno();
					
					if(!sessionItcsno.equals(frontItcsno)) {
						// FNSE0011 : 고객 정보가 일치하지 않습니다.
						throw new WFApplicationException("FNSE0011");
					}
					
					itcscno = sessionItcsno;
				}
			} else {
				sHRINBPushBiz_COM= WFApplicationContext.getBean(sHRINBPushBiz_COM, SHRINBPushBiz_COM.class);
				
				SHRINBPushBscInf_DTO shrPushBscInfDto = new SHRINBPushBscInf_DTO();
				
				itcscno = input.getItcsno();
				
				shrPushBscInfDto.setAppDscd(INBCmmConstant.APP_DSCD);
				shrPushBscInfDto.setNgItgCsno(itcscno);
				shrPushBscInfDto.setMchrUnqInfId(input.getMchrTkn());
				shrPushBscInfDto.setMblMchrAppVerTxt(input.getMblMchrAppVerTxt());					// 모바일기기앱버전내용
				shrPushBscInfDto.setMblMchrMdlNm(input.getMblMchrMdlNm());							// 모바일기기모델명
				shrPushBscInfDto.setMblMchrSftrVerTxt(input.getMblMchrSftrVerTxt());					// 모바일소프트웨어버전
				
				SHRINBPushBscInf_DTO nlginPushBscInfDto = sHRINBPushBiz_COM.selectNlginPushBscInf(shrPushBscInfDto);
				
				/*
				 * @BXMType DBM
				 * 통합.알림함001.DBM PUSH.동의여부.조회
				 */				
				shrPushBscInfDto.setUserId(nlginPushBscInfDto.getUserId());
				shrPushBscInfDto.setNgItgCsno(itcscno);
				
				SHRINBPushBscInf_DTO dodt = sHRINBPushBiz_COM.selectPushBscInf(shrPushBscInfDto);
				
				// 사용기기 체크
				Boolean usingMchr = false; 
				
				if(dodt != null) {
					String frontMchrUnqInfId = input.getMchrTkn();				// 화면에서 넘어온 push token
					String dbMchrUnqInfId = dodt.getMchrUnqInfId();			// db에 저장된 push token
					String pushAgrYn = dodt.getPushAgrYn();						// push 동의 여부
					
					// 기기 체크
					if (frontMchrUnqInfId.equals(dbMchrUnqInfId) && "T".equals(pushAgrYn)) {
						usingMchr = true; 					
					}
				}
				
				if("N".equals(nlginPushBscInfDto.getAplDscd()) || !usingMchr) {
					output.setRtcd("201");
					
					return output;
				} else {
					userId = nlginPushBscInfDto.getUserId();
				}
			}
			
			/**
			 * 컴포넌트 IDT 세팅
			 */
			dInput.setItcsno(itcscno); 												// 통합고객번호
			dInput.setMchrTkn(input.getMchrTkn());								// 토큰(기기고유정보ID) 
			dInput.setUmsReqStaDt(input.getUmsReqStaDt());					// UMS요청시작일자
			dInput.setUmsReqEndDt(input.getUmsReqEndDt());					// UMS요청종료일자
			dInput.setNtfbxLrclCD(input.getNtfbxLrclCD());						// 알림함대분류코드
			dInput.setNtfbxMclfCD(input.getNtfbxMclfCD());						// 알림함중분류코드
			dInput.setNtfcRfwr(input.getNtfcRfwr());								// 알림검색어
			dInput.setNtfcRfwrYn(input.getNtfcRfwrYn());						// 알림검색어여부
			dInput.setSortDis(input.getSortDis());									// 정렬구분
			dInput.setPageNo(input.getPageNo());									// 페이지번호
			dInput.setPageSize(input.getPageSize());								// 페이지사이즈
			dInput.setFavtCdYn(input.getFavtCdYn());							// 즐겨찾기여부
			
			/*
			 * @BXMType ComponentCall
			 * 통합.알림함.목록.조회.컴포넌트 PUSH.알림.목록.조회 
			 */
			dOutputList = iNBItgNtfbxListInq_COM.selectPushNtfcLIst(dInput);
			
			/**
			 * @BXMType IF
			 * UMS 리턴 코드 확인
			 */
			if ("000".equalsIgnoreCase(dOutputList.getCode())) /** 코드값 "000"일때 알림 목록 리턴*/ {
				// 속도가 오래 걸려 비로그인일 경우 한번만 뱅킹 정보를 조회하게 한다.
				SHRActListOup_DTO  actListOup_DTO = new SHRActListOup_DTO();
				SHRActMngFuncList_DTO mngTrnPrtsList = new SHRActMngFuncList_DTO();
				
				if (!shrCMMLoginSession_COM.istLogin()) {
					SHRActListInp_DTO inAct = new SHRActListInp_DTO();
					
					inAct.setUserId(userId);
					inAct.setRsbrItcsno(input.getItcsno());
					
					// 뱅킹 세션 생성 호출
					actListOup_DTO = sHRAllActInqTbk_COM.selectActList(inAct);
					//계좌관리 정보 설정
					mngTrnPrtsList = sHRAllActInqActMng_COM.selectMngIdUnitActMngFuncList("WBK_TRN_PRTS_0001");
					if(logger.isDebugEnabled()) {
						logger.debug("90190264 입출금 계좌관리 정보 설정 ===== {}", mngTrnPrtsList.toString());
					}
				}
				
				// PUSH 카테고리 목록 조회
				NTFBX_CTGR_BSCI001SelectPushCtgrList_DIDT pushCtgrListDidt = new NTFBX_CTGR_BSCI001SelectPushCtgrList_DIDT();
				pushCtgrListDidt.setNtfcDscd("1");				// 알림구분코드(1:PUSH)
				
				List<NTFBX_CTGR_BSCI001SelectPushCtgrList_DODT> pushCtgrListDodt = new ArrayList<>();
				pushCtgrListDodt = ntfbxCtgrBsci001_dbm.selectPushCtgrList(pushCtgrListDidt);
				
				// RPS에서 조회 한 알림 목록 
				List<INBPushNtfcRspGrid_DTO> pushList = dOutputList.getMsgs();
				// 구분자
				char splitDiv = 18; 
				String splitDivStr = String.valueOf(splitDiv);
				/*
				 * UMS에서 넘어온 데이터 NEW WON에 맞게 변환 작업
				 */
				for(INBPushNtfcRspGrid_DTO dto : pushList) {
					/**
					 *  PUSH TYPE, PUSH INFO 정보
					 *  
					 *  11	입출금알림	마스킹계좌/고객명/입출금구분코드/거래일자/거래시각/거래점/통화코드/거래금액/타점금액/거래후잔액/잔액표시여부/통장적요코드/적요내용/의뢰인명
					 *  56	톡상담 상담원 메시지	스팩트라 확인 필요 (별도의 포멧이 존재합니다)
					 *  57	톡상담 마케팅_외부URL(SNS)	
					 *  58	톡상담 마켓팅_외부URL	
					 *  61	마케팅(비보안)_NO링크	날짜/시간/공백	　
					 *  62	마케팅(비보안)_내부URL(페이지) 	날짜/시간/공백/공백/URL/공백	INT_URL_NM
					 *  63	마케팅(비보안)_외부URL	날짜/시간/공백/공백/URL/공백	EXT_URL_NM
					 *  64	마케팅(비보안)_앱링크	날짜/시간/공백/공백/앱링크/스토어링크	안드로이드 : APP_LNK1_NM, APP_INST_LNK1_NM | 아이폰 : APP_LNK2_NM, APP_INST_LNK2_NM
					 *  66	마케팅(비보안)_NO링크_IMAGE 	날짜/시간/공백/이미지URL/공백/공백	IMG_URL_NM
					 *  67	마케팅(비보안)_내부URL(페이지)_IMAGE	날짜/시간/공백/이미지URL/페이지URL	　
					 *  68	마케팅(비보안)_외부URL_IMAGE	날짜/시간/공백/이미지URL/페이지URL	IMG_URL_NM, EXT_URL_NM
					 *  69	마케팅(비보안)_앱링크_IMAGE	날짜/시간/공백/이미지URL/앱링크/스토어링크	안드로이드 : IMG_URL_NM, APP_LNK1_NM, APP_INST_LNK1_NM | 아이폰 : IMG_URL_NM, APP_LNK2_NM, APP_INST_LNK2_NM
					 *  71	보안_NO링크	날짜/시간/공백	　
					 *  72	보안_내부URL(페이지)	날짜/시간/공백/공백/페이지URL/공백	INT_URL_NM
					 *  73	보안_외부URL	날짜/시간/공백/공백/페이지URL/공백	EXT_URL_NM
					 *  74	보안_앱링크	날짜/시간/공백/공백/앱링크/스토어링크	안드로이드 : APP_LNK1_NM, APP_INST_LNK1_NM | 아이폰 : APP_LNK2_NM, APP_INST_LNK2_NM
					 *  76	보안_NO링크_IMAGE	날짜/시간/공백/이미지URL/공백/공백	IMG_URL_NM
					 *  77	보안_내부URL(페이지)_IMAGE	날짜/시간/공백/이미지URL/페이지URL/공백	IMG_URL_NM, INT_URL_NM
					 *  78	보안_외부URL_IMAGE	날짜/시간/공백/이미지URL/페이지URL/공백	IMG_URL_NM, EXT_URL_NM
					 *  79	보안_앱링크_IMAGE	날짜/시간/공백/이미지URL/앱링크/스토어링크	안드로이드 : IMG_URL_NM, APP_LNK1_NM, APP_INST_LNK1_NM | 아이폰 : IMG_URL_NM, APP_LNK2_NM, APP_INST_LNK2_NM
					 *  81	공지(비보안)	날짜/시간/공백	　
					 *  83	맞춤(비보안)	날짜/시간/공백	　
					 *  85	상품안내장(비보안)	날짜/시간/공백/페이지URL/상품코드/상품구분코드	INT_URL_NM, PRD_CD, PRD_DSCD
					 *  90	인증서QR푸시   	날짜/시간/공백/공백/페이지URL/공백	　
					 *  98	인증서발급	날짜/시간/공백	　
					 *  
					 *  푸시인포 : 앱에 전달하는 데이터 정보로 구분자(CHAR 18)를 사용하여 순서대로 나열합니다.
					 *  * 위 장표에서는 슬러시로 표시하였습니다.
					 *
					 */
					String pushInfo = dto.getMap2();
					String[] pushInfos = {};
					
					if (!WFStringUtils.isEmpty(pushInfo)) {
						pushInfos = pushInfo.split(splitDivStr);						
					}
					
					if(logger.isDebugEnabled()) {
						logger.debug("90190264 pushInfos ===== {}", pushInfos.toString());
					}
					
					/**
					 * 푸시타입 - 화면 클릭 시 이동 할 대상. 숫자로 구분
					 * */
					String pushTyp = dto.getMap1().trim(); 
					boolean matchTyp = false;
					
					if(!pushTyp.isEmpty()) {
						String[] pushTypArr = {"62", "63", "67", "68", "72", "73", "77", "78", "85", "98"};
						
						matchTyp = Arrays.stream(pushTypArr).anyMatch(pushTyp::equals);
					}
					
					
					// 카테고리 빈값 체크
					if(!WFStringUtils.isEmpty(dto.getCategory())) {
						String ntfbxLrclCd = dto.getCategory().substring(0, 2);		// 대분류
						String ntfbxMclfCd = dto.getCategory().substring(2);			// 중분류
						
						String ntfbxLrclCdNm = "";				// 대분류명
						String ntfbxMclfCdNm = "";				// 중분류명
						
						for(NTFBX_CTGR_BSCI001SelectPushCtgrList_DODT dodt : pushCtgrListDodt) {
							// 대분류 카테고리가 없는 경우는 '기타-99'로 처리
							if(WFStringUtils.isEmpty(ntfbxLrclCd)) {
								ntfbxLrclCd = "99";
								ntfbxLrclCdNm = "기타";
								// 카테고리 값이 있으면 코드명 매핑 시킴
							}else {
								// 대분류명
								if(ntfbxLrclCd.equals(dodt.getNtfcCtgrCdId())) {
									ntfbxLrclCdNm = dodt.getNtfcCtgrCdNm();
								}
								// 중분류명
								if(ntfbxMclfCd.equals(dodt.getNtfcCtgrCdId())) {
									ntfbxMclfCdNm = dodt.getNtfcCtgrCdNm();
								}
							}
						}
						
						// 대분류가 입출금(1) 일때와 아닐때 구분한다.
						// 입출금일 때와 아닐때 RPS 데이터에서 매핑하는 key가 다름
						if("01".equals(ntfbxLrclCd)) {
							String account = dto.getAccount().trim();		// 알림 목록의 계좌번호
							String trnPrtsLink = "";									// 입출금 거래내역 페이지ID
							String hpAccount = account.substring(0, 3);		// 계좌번호를 핸드폰번호로 사용하는 경우
							String[] hpComArr = {"010", "011", "016", "017", "019"};
							// 계좌번호가 핸드폰 번호인 경우 true 리턴
							Boolean isHpAccount = Arrays.stream(hpComArr).anyMatch(account::startsWith);
							// RPS에서 넘어온 계좌번호가 핸드폰번호 일 경우 IBSMR0001073(특수통장 보유조회)에서 보유한 특수통장 GRID 조회
							if(isHpAccount) {
								sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class);
								sHRIBSMR0001073_COM = WFApplicationContext.getBean(sHRIBSMR0001073_COM, SHRIBSMR0001073_COM.class);
								
								WFInterfaceCfg interfaceCfg  = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg();
								// 비로그인 일 경우 '비대면공통부 전자뱅킹이용자번호 항목을 입력하세요. ' 에러 발생하므로 userId 세팅함.
								WFNciHeader wfnciHeader = interfaceCfg.getNciHeader();
								wfnciHeader.setEbnkUtzpeNo(userId);
								
								interfaceCfg.setInterfaceId("IBSMR0001073");
								interfaceCfg.setNciHeader(wfnciHeader); 
								
								IBSMR0001073_IDT ibsmr1073idt = new IBSMR0001073_IDT();
								ibsmr1073idt.setRsbrItcsno(itcscno);							// 통고번호
								
								WFInfResponse<IBSMR0001073_ODT> mcaOutput1073 = sHRIBSMR0001073_COM.callTrx(ibsmr1073idt, interfaceCfg);
								// 조회된 데이터 있을 경우
								if(!mcaOutput1073.hasError()) {
									IBSMR0001073_ODT ibsmr1073odt = mcaOutput1073.getResponseData();
									
									Boolean noExstMappedAcno = true;
									
									for(IBSMR0001073_GRID_ODT grid : ibsmr1073odt.getGrid()) {
										// 핸드폰계좌번호에 값이 있고 핸드폰계좌상태코드가 1일 경우의 고객사용계좌번호를 account에 치환
										if(!WFStringUtils.isEmpty(grid.getHpAcno()) && "1".equals(grid.getHpActStcd())) {
											account = grid.getCusUsgBkwAcno();
											noExstMappedAcno = false;
											break;
										}
									}
									// 위 for문 조건에 맞는 데이터가 없을 경우
									if(noExstMappedAcno) {
										if(logger.isDebugEnabled()) {
											logger.debug("########################");
											logger.debug("핸드폰계좌번호 고객사용계좌 매핑값 없음 : {}", account);
											logger.debug("########################");
										}
									}
										
								}
							}
							
							// 로그인과 비로그인 구분하여 입출금 거래내역 페이지ID를 조회
							if (shrCMMLoginSession_COM.istLogin()) {
								if(logger.isDebugEnabled()) {
									logger.debug("90190264 로그인 입출금 알림 전계좌 조회 시작===== {}", dto.toString());
								}
								// 입출금알림 거래내역 페이지ID 조회
								SHRAllActInqWbkActInf_DTO  allActInqWbkActInfDto = sHRAllActInqWbkAct_COM.getActInfo(account);
								
								// 전계좌 조회에서 갖고 온 데이터가 있을 경우
								if (allActInqWbkActInfDto != null) {
									if(logger.isDebugEnabled()) {
										logger.debug("90190264 로그인 입출금 알림 전계좌 조회 ===== {}", allActInqWbkActInfDto.toString());
									}
									// 뱅킹 거래내역 페이지에서는 고객사용계좌를 받아서 고객사용계좌로 변경
									account = allActInqWbkActInfDto.getCusUsgAcno();
									// 거래내역 페이지ID
									trnPrtsLink = allActInqWbkActInfDto.getActMngInf().getTrnPrtsLink();
									
									if(logger.isDebugEnabled()) {
										logger.debug("90190264 로그인 입출금 거래내역 페이지ID ===== {}", trnPrtsLink);
									}
								}
							} else {
								// 전계좌 조회에서 갖고 온 데이터가 있을 경우
								if (actListOup_DTO != null) {
									for(SHRActInf_DTO sessActInfo : actListOup_DTO.getAll()) {
										// 목록과 동일한 계좌일 경우 거래내역 페이지ID 세팅
										if (account.equals(sessActInfo.getNewAcno()) || account.equals(sessActInfo.getCusUsgAcno())) {
											SHRAllActInqWbkActInf_DTO actInf = getChgObj(sessActInfo); 
											
											if(logger.isDebugEnabled()) {
												logger.debug("90190264 비로그인 입출금 알림 해당계좌 정보 조회 ===== {}", actInf.toString());
											}
											// 뱅킹 거래내역 페이지에서는 고객사용계좌를 받아서 고객사용계좌로 변경
											account = actInf.getCusUsgAcno();
											// 거래내역 페이지ID
											trnPrtsLink = sHRAllActInqActMng_COM.getMngFuncUrl(actInf, mngTrnPrtsList);
											if(logger.isDebugEnabled()) {
												logger.debug("90190264 비로그인 입출금 거래내역 페이지ID ===== {}", trnPrtsLink);
											}
											break;
										}
									}
								}
							}				
							
							// 입출금알림의 첫번째 줄 생성
							String rawDscd = StringUtils.nvl(pushInfos[2]);			// 입출금구분코드
							String rawDscdNm = "";
							/* 01:입금, 02:출금, 03:입금취소, 04:출금취소, 그외: 거래
							    입금&입금취소는 +, 출금&출금취소는 - 붙인다. */
							String symb = "";
							// RPS 넘어오는 입금구분코드에 따른 명칭 세팅
							if("01".equals(rawDscd)) {
								rawDscdNm = "입금";
								symb = "+";
							} else if("02".equals(rawDscd)) {
								rawDscdNm = "출금";
								symb = "-";
							} else if("03".equals(rawDscd)) {
								rawDscdNm = "입금취소";
								symb = "+";
							} else if("04".equals(rawDscd)) {
								rawDscdNm = "출금취소";
								symb = "-";
							} else {
								rawDscdNm = "거래";
							}
							
							// 통화코드 구분
							String cur = "";
							if("KRW".equals(pushInfos[6])) {		// 화폐
								cur = "원";
							} else {
								StringBuffer curSb = new StringBuffer();
								curSb.append('(');
								curSb.append(pushInfos[6]);		// 화폐
								curSb.append(')');
								cur = curSb.toString().trim();
							}
							
							StringBuffer sb = new StringBuffer();
							sb.append(rawDscdNm);
							sb.append(' ');
							sb.append(symb);
							sb.append(pushInfos[7]);						// 입출금액
							sb.append(cur);
							// 입출금 알림 제목에 보여질 데이터 세팅
							String pushTitle = sb.toString().trim();
							
							// 잔액표시여부에 따라 계좌 잔액 세팅
							String balSet  	= pushInfos[10];				// 잔액표시여부
							String actBal	= "";								// 계좌잔액
							
							if ("Y".equals(balSet)){
								StringBuffer sb2 = new StringBuffer();
								
								sb2.append(pushInfos[9]);					// 계좌잔액
								sb2.append(cur);
								
								actBal		= sb2.toString().trim();			
							} else {
								actBal		= "";
							}
							
							/**
							 * 쓰이진 않지만 향후 pushInfos[] 이해할 수 있는 용도로 주석처리
							 * memo    = cm.getName("0043",pushInfos[11]);
							 * */
			
							// 알림 데이터 세팅
							INBPushListRsp_DTO pushListRspDto = new INBPushListRsp_DTO();
							
							pushListRspDto.setPushTitlTxt(pushTitle);										// push제목내용
							pushListRspDto.setMskAcno(pushInfos.length >= 12 ? pushInfos[0].trim() : "");							// 마스킹계좌번호
							pushListRspDto.setRawDscd(pushInfos.length >= 12 ? pushInfos[2].trim() : "");							// 입출금구분코드
							pushListRspDto.setOtln(pushInfos.length >= 13 ? pushInfos[12].trim() : "");								// 적요
							pushListRspDto.setRawCusNm(dto.getMap3().trim());						// 입출금고객명
							pushListRspDto.setFavtYn(dto.getIsFav().trim());							// 즐겨찾기여부
							pushListRspDto.setNtfbxLrclCd(ntfbxLrclCd);									// 대분류
							pushListRspDto.setNtfbxMclfCd(ntfbxMclfCd);								// 중분류
							pushListRspDto.setNtfbxLrclCdNm(ntfbxLrclCdNm);							// 대분류명
							pushListRspDto.setNtfbxMclfCdNm(ntfbxMclfCdNm);						// 중분류명
							pushListRspDto.setNtfcDtm(dto.getRegDate().trim());						// 발송일시
							pushListRspDto.setPushTyp(pushTyp);											// 푸시타입
							pushListRspDto.setMsgId(dto.getMsgId().trim());							// 메시지ID
							pushListRspDto.setUmsTrno(dto.getUmsTrno().trim());						// UMS거래번호
							pushListRspDto.setUmsReqDt(dto.getUmsReqDt().trim());					// UMS요청일자
							pushListRspDto.setReadYn(dto.getReadYn().trim());						// 읽음여부
							pushListRspDto.setAcno(account);												// 계좌번호
							pushListRspDto.setNtfcRfwr(input.getNtfcRfwr());							// 검색어
							pushListRspDto.setPageId(trnPrtsLink);											// 거래내역 페이지ID
							pushListRspDto.setActBal(actBal);												// 계좌잔액
							
							output.getInbPushListRsp_DTO().add(pushListRspDto);
							
						} else {
							INBPushListRsp_DTO pushListRspDto = new INBPushListRsp_DTO();
							
							pushListRspDto.setPushTxt(dto.getPushTitle());				// 푸시메세지
							pushListRspDto.setMsgTxt(dto.getMsgText());				// 메세지내용
							pushListRspDto.setFavtYn(dto.getIsFav());					// 즐겨찾기여부
							pushListRspDto.setNtfbxLrclCd(ntfbxLrclCd);					// 대분류
							pushListRspDto.setNtfbxMclfCd(ntfbxMclfCd);				// 중분류
							pushListRspDto.setNtfbxLrclCdNm(ntfbxLrclCdNm);			// 대분류명
							pushListRspDto.setNtfbxMclfCdNm(ntfbxMclfCdNm);		// 중분류명
							pushListRspDto.setNtfcDtm(dto.getRegDate());				// 발송일시
							pushListRspDto.setPushTyp(pushTyp);							// 푸시타입
							pushListRspDto.setMsgId(dto.getMsgId());					// 메시지ID
							pushListRspDto.setUmsTrno(dto.getUmsTrno());				// UMS거래번호
							pushListRspDto.setUmsReqDt(dto.getUmsReqDt());			// UMS요청일자
							pushListRspDto.setReadYn(dto.getReadYn());				// 읽음여부
							pushListRspDto.setNtfcRfwr(input.getNtfcRfwr());			// 검색어
							// mappipng 페이지 정보 초기 데이터 세팅
							pushListRspDto.setPageId("");			
							pushListRspDto.setPrdCd("");				
							pushListRspDto.setPrdDscd("");
							
							if (matchTyp) {
								if (pushInfos.length > 0 ) {
									// 나만의 알림, 상품안내장 
									if (pushInfos.length > 6) {
										pushListRspDto.setPageId(pushInfos[4].trim());				// 페이지ID
										pushListRspDto.setPrdCd(pushInfos[5].trim());				// 상품안내장 링크에 보낼 상품코드, 나만의알림 seqNo
										pushListRspDto.setPrdDscd(pushInfos[6].trim());			// 상품안내장 링크에 보낼 상품구분코드, 나만의 알림 일반/이체 구분코드
									} else if (pushInfos.length > 4){
										// 페이지ID(페이지ID or 페이지ID&key1=value1&key2=value2 형태)
										pushListRspDto.setPageId(WFStringUtils.isEmpty(pushInfos[4].trim()) ? "" : pushInfos[4].trim());
									}
								}
							}
							
							output.getInbPushListRsp_DTO().add(pushListRspDto);
						}
					}
				}
				output.setRtcd("200");
				output.setRtcdTxt("정상적으로 조회 되었습니다.");
			}
			else if ( "105".equalsIgnoreCase(dOutputList.getCode())) /** 코드값 "105"일때 목록 그대로 리턴*/ {
				logger.debug("=== 코드값 105 ===");
				output.setRtcd("105");
				output.setRtcdTxt(dOutputList.getMsg());
			}
			else {
				logger.debug("=== UMS 에러코드 ::: {}", dOutputList.getCode());
				logger.debug("=== UMS 에러메시지 ::: {}", dOutputList.getMsg());
				output.setRtcd(dOutputList.getCode());
				output.setRtcdTxt(dOutputList.getMsg());
			}
		} catch (WFApplicationException e) {
			logger.error("WFApplicationException error :: {}", e);
			String code = e.getCode();
			output.setRtcdTxt(e.getResolvedMessage());	
			output.setRtcd(code);
			
			
			if("FNSE0008".equals(code)) {
				throw new WFApplicationException("FNSE0008");
			} else if("FNSI0001".equals(code)){
				throw new WFApplicationException("FNSI0001");
			} else {
				throw e;
			}
		} catch(Exception e){
			logger.error("=== PUSH 조회 Exception ::: {}", e);
			output.setRtcd("Exception 발생");
			output.setRtcdTxt(e.getMessage());
		}
			
		return output;
			
	}
	
	/**
	 * 입력 받은 IO 필드를 복사(SHRActInf_DTO -> SHRAllActInqWbkActInf_DTO)
	 * 
	 * @param input 전체계좌조회.우리은행.계좌목록.입력.공유.공통.IO
	 * @return 전체계좌조회.우리은행.계좌목록.출력.공유.공통.IO
	 */
	@BxmCategory(logicalName="입력 받은 IO 필드를 복사.GET", description="입력 받은 IO 필드를 복사.GET", author="90190314")
	protected SHRAllActInqWbkActInf_DTO getChgObj(SHRActInf_DTO input
	) throws WFApplicationException  {
		
		SHRAllActInqWbkActInf_DTO output= new SHRAllActInqWbkActInf_DTO();
		output.setNewAcno(input.getNewAcno()); // 신계좌번호
		output.setCusUsgAcno(input.getCusUsgAcno()); // 고객사용계좌번호
		output.setPdcd(input.getPdcd()); // 상품코드
		output.setPrdNm(input.getPrdNm()); // 상품명
		output.setCucd(input.getCucd()); // 통화코드
		output.setPbokBal(input.getPbokBal()); // 통장잔액
		output.setFaxcBal(input.getFaxcBal()); // 대미환산잔액
		output.setWdrAvlAm(input.getWdrAvlAm()); // 출금가능금액
		output.setFaxcWdrAvlAm(input.getFaxcWdrAvlAm()); // 대미환산출금가능금액
		output.setPsklActYn(input.getPsklActYn()); // 통장대출계좌여부
		output.setLactYn(input.getLactYn()); // 여신계좌여부
		output.setFxActYn(input.getFxActYn()); // 외환계좌여부
		output.setPbokKd(input.getPbokKd()); // 통장종류
		output.setNewDt(input.getNewDt()); // 신규일자
		output.setLstTrnDt(input.getLstTrnDt()); // 최종거래일자
		output.setEpdt(input.getEpdt()); // 만기일
		output.setAdntRgsYn(input.getAdntRgsYn()); // 사고등록여부
		output.setCrtdIsuActYn(input.getCrtdIsuActYn()); // 증명서발급계좌여부
		output.setWdrActYn(input.getWdrActYn()); // 출금계좌여부
		output.setCsno(input.getCsno()); // 고객번호
		output.setNtrnnActYn(input.getNtrnnActYn()); // 무거래계좌여부
		output.setWdrActUnitRcvDgnYn(input.getWdrActUnitRcvDgnYn()); // 출금계좌단위입금지정여부
		output.setPrdDisSmlItm(input.getPrdDisSmlItm()); // 상품구분소항목
		output.setPsnMmfYn(input.getPsnMmfYn()); // 개인MMF여부
		output.setElfYn(input.getElfYn()); // ELF여부
		output.setActKrxcBal(input.getActKrxcBal()); // 계좌원화환산잔액
		output.setHdnActYn(input.getHdnActYn()); // 숨김계좌여부
		output.setPnsnPayStepDscd(input.getPnsnPayStepDscd()); // 연금지급단계구분코드
		output.setPrtfActDscd(input.getPrtfActDscd()); // 포트폴리오계좌구분코드
		output.setPrtfNo(input.getPrtfNo()); // 포트폴리오번호
		output.setAddRcvAvlYn(input.getAddRcvAvlYn()); // 추가입금가능여부
		output.setPwnoRgsYn(input.getPwnoRgsYn()); // 비밀번호등록여부
		output.setMetPbokYn(input.getMetPbokYn()); // 모임통장여부
		output.setPbokSplitYn(input.getPbokSplitYn()); // 통장쪼개기여부
		output.setTrpdMdmCfcd(input.getTrpdMdmCfcd()); // 신탁상품중분류코드
		output.setTrpdMdmCfcd(input.getTrpdMdmCfcd()); // 신탁상품중분류코드
		output.setD7WtnFcCshAm(input.getD7WtnFcCshAm()); // 7일이내외화현찰금액
		output.setD7PsgFcCshAm(input.getD7PsgFcCshAm()); // 7일경과외화현찰금액
		output.setAcnmCnfYn(input.getAcnmCnfYn()); // 실명확인여부
		output.setTrpeDscd(input.getTrpeDscd()); // 거래자구분코드
		output.setPidTpDscd(input.getPidTpDscd()); // 납입유형구분코드
		output.setMmdaActYn(input.getMmdaActYn()); // MMDA계좌여부
		output.setEvlAm(input.getEvlAm()); // 평가금액
		output.setActSmplPrftRt(input.getActSmplPrftRt()); // 계좌단순수익율
		output.setDcrpYn(input.getDcrpYn()); // 퇴직연금DC여부
		output.setRtpenJnpeNo(input.getRtpenJnpeNo()); // 퇴직연금가입자번호
		output.setAsscNmnlDpstYn(input.getAsscNmnlDpstYn()); // 공동명의예금여부
		output.setKrxcEvlAm(input.getKrxcEvlAm()); // 원화환산평가금액
		output.setAvgBuyPr(input.getAvgBuyPr()); // 평균매입가
		output.setLnApvAm(input.getLnApvAm()); // 대출승인금액
		output.setNxtItpiDt(input.getNxtItpiDt()); // 다음이자납입일자
		output.setYtaAvlYn(input.getYtaAvlYn()); // 연말정산가능여부
		output.setSbndActYn(input.getSbndActYn()); // 특수채권계좌여부
		output.setRdirRqrgTgtYn(input.getRdirRqrgTgtYn()); // 금리인하요구권대상여부
		output.setSbjCd(input.getSbjCd()); // 과목코드
		output.setSortSeq(input.getSortSeq()); // 정렬순서
		output.setFndNm(input.getFndNm()); // 펀드명
		output.setActAls(input.getActAls()); // 계좌별칭
		output.setFndCd(input.getFndCd()); // 펀드코드
		output.setRprhYn(input.getRprhYn()); // 환매여부
		output.setAccNm(input.getAccNm()); // 계정명
		output.setCtgr(input.getCtgr()); // 카테고리분류
		output.setCtgrCd(input.getCtgrCd()); // 카테고리코드
		output.setAvgBuyPr(input.getAvgBuyPr()); // 평균매입가
		
		return output;
	}

		
	/**
	 * SMS 알림 목록을 조회한다. 
	 * 
	 * @param input 통합.알림.목록.조회.컨트롤러.입력.IO
	 * @return 통합.알림.목록.조회.컨트롤러.출력.IO 
	 */
	@BxmCategory(logicalName="SMS.알림.목록.조회", description="SMS 알림 목록을 조회한다.", author="90190264")
	public INBNtfbxListInqSelectSmsNtfcList_ODT selectSmsNtfcLIst(INBNtfbxListInqSelectSmsNtfcList_IDT input
	)
	{
			
		/**
		* @BXMType GetBean
		*/
		iNBItgNtfbxListInq_COM= WFApplicationContext.getBean(iNBItgNtfbxListInq_COM, INBItgNtfbxListInq_COM.class);
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
			
		/**
		 * @BXMType VariableDeclaration
		 */
		INBNtfbxListInqSelectSmsNtfcList_ODT output= new INBNtfbxListInqSelectSmsNtfcList_ODT();
		
		//세션고객정보
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession(); 
		
		/**
		 * 컴포넌트 DTO
		 */
		SmsNtfcLIstInq_DODT dOutputList = new SmsNtfcLIstInq_DODT();
		ItgNtfcListInq_DIDT dInput = new ItgNtfcListInq_DIDT();
		
		try{
			String itcscno = "";
			// 로그인 체크 - 비로그인일 경우
			if (shrCMMLoginSession_COM.istLogin()) {
				// 간편회원여부
				String spCusYn = currentCust.getSpCusYn();
				// 간편회원이 아닐 경우(금융회원 로그인/비로그인)
				if(!"Y".equals(spCusYn)) {
					itcscno = currentCust.getItcsno();
				}
			} else {
				sHRINBPushBiz_COM= WFApplicationContext.getBean(sHRINBPushBiz_COM, SHRINBPushBiz_COM.class);
				
				SHRINBPushBscInf_DTO shrPushBscInfDto = new SHRINBPushBscInf_DTO();
				
				itcscno = input.getItcsno();
				
				shrPushBscInfDto.setAppDscd(INBCmmConstant.APP_DSCD);
				shrPushBscInfDto.setNgItgCsno(itcscno);
				shrPushBscInfDto.setMchrUnqInfId(input.getMchrTkn());
				shrPushBscInfDto.setMblMchrAppVerTxt(input.getMblMchrAppVerTxt());					// 모바일기기앱버전내용
				shrPushBscInfDto.setMblMchrMdlNm(input.getMblMchrMdlNm());							// 모바일기기모델명
				shrPushBscInfDto.setMblMchrSftrVerTxt(input.getMblMchrSftrVerTxt());					// 모바일소프트웨어버전
				
				SHRINBPushBscInf_DTO nlginPushBscInfDto = sHRINBPushBiz_COM.selectNlginPushBscInf(shrPushBscInfDto);
				
				if(logger.isDebugEnabled()) {
					logger.debug("90190264 입출금 nlginPushBscInfDto========  : [{}]", nlginPushBscInfDto.toString());
				}
							
				shrPushBscInfDto.setUserId(nlginPushBscInfDto.getUserId());
				shrPushBscInfDto.setNgItgCsno(itcscno);
				
				SHRINBPushBscInf_DTO dodt = sHRINBPushBiz_COM.selectPushBscInf(shrPushBscInfDto);
				
				// 사용기기 체크
				Boolean usingMchr = false; 
				
				if(dodt != null) {
					String frontMchrUnqInfId = input.getMchrTkn();				// 화면에서 넘어온 push token
					String dbMchrUnqInfId = dodt.getMchrUnqInfId();			// db에 저장된 push token
					String pushAgrYn = dodt.getPushAgrYn();						// push 동의 여부
					
					// 기기 체크
					if (frontMchrUnqInfId.equals(dbMchrUnqInfId) && "T".equals(pushAgrYn)) {
						usingMchr = true; 					
					}
				}
				
				if("N".equals(nlginPushBscInfDto.getAplDscd()) || !usingMchr) {
					output.setRtcd("201");
					
					return output;
				}
			}
			
			/**
			 * 컴포넌트 IDT 세팅
			 */
			dInput.setItcsno(itcscno); 														// 통합고객번호
			dInput.setUmsReqStaDt(input.getUmsReqStaDt());							// UMS요청시작일자
			dInput.setUmsReqEndDt(input.getUmsReqEndDt());							// UMS요청종료일자
			dInput.setNtfbxLrclCD(input.getNtfbxLrclCD());								// 알림함대분류코드
			dInput.setNtfbxMclfCD(input.getNtfbxMclfCD());								// 알림함중분류코드
			dInput.setPageNo(input.getPageNo());											// 페이지번호
			dInput.setPageSize(input.getPageSize());										// 페이지사이즈
			dInput.setNtfcRfwr(input.getNtfcRfwr());										// 알림검색어
			dInput.setFavtCdYn(input.getFavtCdYn());									// 즐겨찾기여부
			
			/*
			 * @BXMType ComponentCall
			 * 통합.알림함.목록.조회.컴포넌트 SMS.알림.목록.조회
			 */
			dOutputList = iNBItgNtfbxListInq_COM.selectSmsNtfcList(dInput);
			
			if(logger.isDebugEnabled()) {
				logger.debug("90190264 SMS.알림.목록.조회 service output ===== ", dOutputList);
			}
			
			/**
			 * @BXMType IF
			 * UMS 리턴 코드 확인
			 */
			if ("000".equalsIgnoreCase(dOutputList.getCode())) /** 코드값 "000"일때 알림 목록 리턴*/ {
				/**
				 * TODO 인터페이스 호출을 위한 코드를 작성하십시오.
				 * TYPE : HTTP(GET)
				 * ID : 
				 * NM : SMS 카테고리 목록 조회
				 */
				INBUmsCtgrClf_DTO smsCtgrList = new INBUmsCtgrClf_DTO();
				
				smsCtgrList = iNBItgNtfbxListInq_COM.selectCtgrClf(itcscno);
				
				List<INBUmsCtgrClfGrid_DTO> LrclCdCtgrList = smsCtgrList.getMsgs();
				// 대분류만 뽑아서 다시 세팅(중분류가 00이면 대분류이다)
				LrclCdCtgrList = LrclCdCtgrList.stream().filter((item) -> "00".equals(item.getcL2Cd()))
																	 .collect(Collectors.toList());
				
				if(logger.isDebugEnabled()) {
					logger.debug("90190264 SMS 대분류 재정렬 ===== ", LrclCdCtgrList);
				}
				
				// UMS에서 조회한 데이터 세팅
				List<INBSmsNtfcRspGrid_DTO> pushList = dOutputList.getMsgs();
				
				if (logger.isDebugEnabled()) {
					logger.debug("90190264 SMS pushList -------------------- {}", pushList); 
				}
				
				String ntfbxLrclCD = "";								// 대분류
				String ntfbxMclfCD = "";								// 중분류
				String ntfbxLrclCdNm = "";							// 대분류명
				String ntfbxMclfCdNm = "";							// 중분류명
				
				/*
				 * UMS에서 넘어온 데이터 NEW WON에 맞게 변환 작업
				 */
				for(INBSmsNtfcRspGrid_DTO dto : pushList) {
					String pushInfo = dto.getSmsMsg();
					String[] pushInfos = pushInfo.split("\\s+");
					
					// 카테고리 빈값 체크
					if(!WFStringUtils.isEmpty(dto.getcL1Cd())) {
						ntfbxLrclCD = dto.getcL1Cd();								// 대분류
						ntfbxMclfCD = dto.getcL2Cd();								// 중분류
						
						/*
						 * SMS 카테고리 조회 결과
						 * 대분류 : 00	중분류: 00	0000	본점(통지) = 정보성
						 * 대분류 : 01	중분류: 00	0100	영업점(통지) = 영업점
						 * 대분류 : 10	중분류: 00	1000	광고(본점,영업점) = 마케팅
						 * 대분류 : 11	중분류: 00	1100	입출금(전체) = 입출금
						 * 대분류 : 11	중분류: 01	1101	입출금(입금) = 입금
						 * 대분류 : 11	중분류: 02	1102	입출금(출금) = 출금
						 */
						for(INBUmsCtgrClfGrid_DTO dodt : LrclCdCtgrList) {
							// 대분류명
							if(ntfbxLrclCD.equals(dodt.getcL1Cd()) && "00".equals(ntfbxMclfCD)) {
								ntfbxLrclCdNm = dodt.getCodeName2();
							}
							// 중분류명
							if(ntfbxMclfCD.equals(dodt.getcL2Cd()) && !"00".equals(ntfbxMclfCD)) {
								ntfbxMclfCdNm = dodt.getCodeName2();
							}
						}
					}
						
					// 대분류가 입출금(11) 일때와 아닐때 구분한다.
					if("11".equals(ntfbxLrclCD)) {
						// 입출금알림의 첫번째 줄 생성
						StringBuffer sb = new StringBuffer();
						sb.append(pushInfos.length > 4 ? pushInfos[4].trim() : "");
						sb.append(' ');
						sb.append(pushInfos.length > 4 ? "입금".equals(pushInfos[4].trim()) ? "+" : "-" : "");
						sb.append(dto.getMoneyDeal());
						sb.append('원');
						
						String pushTitle = sb.toString();
						
						INBPushListRsp_DTO pushListRspDto = new INBPushListRsp_DTO();
						
						pushListRspDto.setPushTitlTxt(pushTitle);						// push제목내용(push와 동시 사용)
						pushListRspDto.setMskAcno(pushInfos[3]);					// 마스킹계좌번호
//							pushListRspDto.setRawDscd(pushInfos[2]);					// 입출금구분코드
						pushListRspDto.setOtln(pushInfos.length > 5 ? pushInfos[6].trim() : "");					// 적요
						pushListRspDto.setRawCusNm(dto.getMap4());				// 입출금고객명
						pushListRspDto.setFavtYn(dto.getIsFav());					// 즐겨찾기여부
						pushListRspDto.setNtfbxLrclCd(ntfbxLrclCD);					// 대분류
						pushListRspDto.setNtfbxMclfCd(ntfbxMclfCD);				// 중분류
						pushListRspDto.setNtfbxLrclCdNm(ntfbxLrclCdNm);			// 대분류명
						pushListRspDto.setNtfbxMclfCdNm(ntfbxMclfCdNm);		// 중분류명
						pushListRspDto.setNtfcDtm(dto.getRegDate());				// 발송일시
						pushListRspDto.setMsgId(dto.getUmsTrno());				// 메시지ID(SMS, KAKAO는 msgId가 없지만 push와 공통으로 항목을 사용하기 위해 값 세팅)
						pushListRspDto.setUmsTrno(dto.getUmsTrno());				// UMS거래번호
						pushListRspDto.setUmsReqDt(dto.getUmsReqDt());			// UMS요청일자
						pushListRspDto.setReadYn(dto.getCheckYn());				// 읽음여부
						pushListRspDto.setNtfcRfwr(input.getNtfcRfwr());			// 검색어
//						pushListRspDto.setActBal(dto.getMoneyBalance());		// 계좌잔액(push처럼 입출금알림 잔액표시 여부 항목이 존재하지 않아 주석처리)
						
						output.getInbPushListRsp_DTO().add(pushListRspDto);
						
					} else {
						INBPushListRsp_DTO pushListRspDto = new INBPushListRsp_DTO();
						
						
						pushListRspDto.setPushTitlTxt(dto.getSmsTitle());			// 푸시제목
						pushListRspDto.setMsgTxt(dto.getSmsMsg().replaceAll("\\n", "<br />"));				// 메세지내용
						pushListRspDto.setFavtYn(dto.getIsFav());					// 즐겨찾기여부
						pushListRspDto.setNtfbxLrclCd(ntfbxLrclCD);					// 대분류
						pushListRspDto.setNtfbxMclfCd(ntfbxMclfCD);				// 중분류
						pushListRspDto.setNtfbxLrclCdNm(ntfbxLrclCdNm);			// 대분류명
						pushListRspDto.setNtfbxMclfCdNm(ntfbxMclfCdNm);		// 중분류명
						pushListRspDto.setNtfcDtm(dto.getRegDate());				// 발송일시
//								pushListRspDto.setPushTyp(pushTyp);							// 푸시타입
						pushListRspDto.setMsgId(dto.getUmsTrno());				// 메시지ID(SMS, KAKAO는 msgId가 없지만 push와 공통으로 항목을 사용하기 위해 값 세팅)
						pushListRspDto.setUmsTrno(dto.getUmsTrno());				// UMS거래번호
						pushListRspDto.setUmsReqDt(dto.getUmsReqDt());			// UMS요청일자
						pushListRspDto.setReadYn(dto.getCheckYn());				// 읽음여부
						pushListRspDto.setNtfcRfwr(input.getNtfcRfwr());							// 검색어
						
						output.getInbPushListRsp_DTO().add(pushListRspDto);

					}
					
				}
				output.setRtcd("200");
				output.setRtcdTxt("정상적으로 조회 되었습니다.");
			}
			else if ( "105".equalsIgnoreCase(dOutputList.getCode())) /** 코드값 "105"일때 목록 그대로 리턴*/ {
				logger.debug("=== 코드값 105 ===");
				output.setRtcd("105");
				output.setRtcdTxt(dOutputList.getMsg());
			}
			else {
				logger.debug("=== UMS 에러코드 ::: {}", dOutputList.getCode());
				logger.debug("=== UMS 에러메시지 ::: {}", dOutputList.getMsg());
				output.setRtcd(dOutputList.getCode());
				output.setRtcdTxt(dOutputList.getMsg());
			}
		} catch (WFApplicationException e) {
			logger.error("WFApplicationException error :: {}", e);
			output.setRtcdTxt(e.getResolvedMessage());	
			output.setRtcd(e.getCode());
		} catch(Exception e){
			logger.error("SMS 알림 목록 {}", e);
			output.setRtcd("Exception 발생");
			output.setRtcdTxt(e.getMessage());
		}
			
		return output;
			
	}
		
	/**
	 * 카카오톡 알림 목록을 조회한다.
	 * 
	 * @param input 통합.알림.목록.조회.컨트롤러.입력.IO
	 * @return 통합.알림.목록.조회.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName="카카오톡.알림.목록.조회", description="카카오톡 알림 목록을 조회한다.", author="90190264")
	public INBNtfbxListInqSelectKataNtfcList_ODT selectKataNtfcList(INBNtfbxListInqSelectKataNtfcList_IDT input
	)
	{
			
		/**
		* @BXMType GetBean
		*/
		iNBItgNtfbxListInq_COM= WFApplicationContext.getBean(iNBItgNtfbxListInq_COM, INBItgNtfbxListInq_COM.class);
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class); 
			
		/**
		 * @BXMType VariableDeclaration
		 */
		INBNtfbxListInqSelectKataNtfcList_ODT output = new INBNtfbxListInqSelectKataNtfcList_ODT();
		
		//세션고객정보
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession(); 
		
		/*
		 * @BXMType ComponentCall
		 * 통합.알림함.목록.조회.컴포넌트 마케팅동의여부.조회
		 */
			
		/**
		 * 컴포넌트 DTO
		 */
		KataNtfcLIstInq_DODT dOutputList = new KataNtfcLIstInq_DODT();
		ItgNtfcListInq_DIDT dInput = new ItgNtfcListInq_DIDT();
		
		/**
		 * @BXMType Try
		 * UMS 호출
		 */
		try{
			String itcscno = "";
			// 로그인 체크 - 비로그인일 경우
			if (shrCMMLoginSession_COM.istLogin()) {
				// 간편회원여부
				String spCusYn = currentCust.getSpCusYn();
				// 간편회원이 아닐 경우(금융회원 로그인/비로그인)
				if(!"Y".equals(spCusYn)) {
					itcscno = currentCust.getItcsno();
				}
			} else {
				sHRINBPushBiz_COM= WFApplicationContext.getBean(sHRINBPushBiz_COM, SHRINBPushBiz_COM.class);
				
				SHRINBPushBscInf_DTO shrPushBscInfDto = new SHRINBPushBscInf_DTO();
				
				itcscno = input.getItcsno();
				
				shrPushBscInfDto.setAppDscd(INBCmmConstant.APP_DSCD);
				shrPushBscInfDto.setNgItgCsno(itcscno);
				shrPushBscInfDto.setMchrUnqInfId(input.getMchrTkn());
				shrPushBscInfDto.setMblMchrAppVerTxt(input.getMblMchrAppVerTxt());					// 모바일기기앱버전내용
				shrPushBscInfDto.setMblMchrMdlNm(input.getMblMchrMdlNm());							// 모바일기기모델명
				shrPushBscInfDto.setMblMchrSftrVerTxt(input.getMblMchrSftrVerTxt());					// 모바일소프트웨어버전
				
				SHRINBPushBscInf_DTO nlginPushBscInfDto = sHRINBPushBiz_COM.selectNlginPushBscInf(shrPushBscInfDto);
				
				if(logger.isDebugEnabled()) {
					logger.debug("90190264 입출금 nlginPushBscInfDto========  : [{}]", nlginPushBscInfDto.toString());
				}
							
				shrPushBscInfDto.setUserId(nlginPushBscInfDto.getUserId());
				shrPushBscInfDto.setNgItgCsno(itcscno);
				
				SHRINBPushBscInf_DTO dodt = sHRINBPushBiz_COM.selectPushBscInf(shrPushBscInfDto);
				
				// 사용기기 체크
				Boolean usingMchr = false; 
				
				if(dodt != null) {
					String frontMchrUnqInfId = input.getMchrTkn();				// 화면에서 넘어온 push token
					String dbMchrUnqInfId = dodt.getMchrUnqInfId();			// db에 저장된 push token
					String pushAgrYn = dodt.getPushAgrYn();						// push 동의 여부
					
					// 기기 체크
					if (frontMchrUnqInfId.equals(dbMchrUnqInfId) && "T".equals(pushAgrYn)) {
						usingMchr = true; 					
					}
				}
				
				if("N".equals(nlginPushBscInfDto.getAplDscd()) || !usingMchr) {
					output.setRtcd("201");
					
					return output;
				}
			}
			/**
			 * 컴포넌트 IDT 세팅
			 */
			dInput.setItcsno(itcscno); 										// 통합고객번호
			dInput.setUmsReqStaDt(input.getUmsReqStaDt());			// UMS요청시작일자
			dInput.setUmsReqEndDt(input.getUmsReqEndDt());			// UMS요청종료일자
			dInput.setNtfbxLrclCD(input.getNtfbxLrclCD());				// 알림함대분류코드
			dInput.setNtfbxMclfCD(input.getNtfbxMclfCD());				// 알림함중분류코드
			dInput.setPageNo(input.getPageNo());							// 페이지번호
			dInput.setPageSize(input.getPageSize());						// 페이지사이즈
			dInput.setNtfcRfwr(input.getNtfcRfwr());						// 알림검색어
			dInput.setFavtCdYn(input.getFavtCdYn());					// 즐겨찾기여부
			
			/*
			 * @BXMType ComponentCall
			 * 통합.알림함.목록.조회.컴포넌트 카카오톡.알림.목록.조회
			 */
			dOutputList = iNBItgNtfbxListInq_COM.selectKataNtfcList(dInput);
			
			if(logger.isDebugEnabled()) {
				logger.debug("90190264 카카오톡.알림.목록.조회 service output ===== ", dOutputList);
			}
			
			/**
			 * @BXMType IF
			 * UMS 리턴 코드 확인
			 */
			if ("000".equalsIgnoreCase(dOutputList.getCode())) /** 코드값 "000"일때 알림 목록 리턴*/ {
				List<INBKataNtfcRspGrid_DTO> pushList = dOutputList.getMsgs();
				
				if (logger.isDebugEnabled()) {
					logger.debug("90190264 kako pushList -------------------- {}", pushList); 
				}
				
				char splitDiv = 18; 
				String splitDivStr = String.valueOf(splitDiv);
				/*
				 * UMS에서 넘어온 데이터 NEW WON에 맞게 변환 작업
				 */
				for(INBKataNtfcRspGrid_DTO dto : pushList) {
					String pushInfo = dto.getMap2();
					String[] pushInfos = pushInfo.split(splitDivStr);
					
					INBPushListRsp_DTO pushListRspDto = new INBPushListRsp_DTO();
					
					pushListRspDto.setMsgTxt(dto.getKkoMsg().replaceAll("\\n", "<br />"));				// 메세지내용
					pushListRspDto.setFavtYn(dto.getIsFav());					// 즐겨찾기여부
					pushListRspDto.setNtfcDtm(dto.getRegDate());				// 발송일시
					pushListRspDto.setMsgId(dto.getUmsTrno());				// 메시지ID(SMS, KAKAO는 msgId가 없지만 push와 공통으로 항목을 사용하기 위해 값 세팅)
					pushListRspDto.setUmsTrno(dto.getUmsTrno());				// UMS거래번호
					pushListRspDto.setUmsReqDt(dto.getUmsReqDt());			// UMS요청일자
					pushListRspDto.setReadYn(dto.getCheckYn());				// 읽음여부
					pushListRspDto.setNtfcRfwr(input.getNtfcRfwr());							// 검색어
					// 카카오 버튼 정보 세팅
					if(logger.isDebugEnabled()) {
						logger.debug("90190264 kako getKkoSendBtns -------------------- {}", dto.getKkoSendBtns()); 
					}
					if(!WFStringUtils.isEmpty(dto.getKkoSendBtns())) {
						List<INBKkoBtnInfList_DTO> btnInfoList = new ArrayList<>();
						String btnInfos = dto.getKkoSendBtns();
						String jsonString = btnInfos.substring(1, btnInfos.length() - 1);	// [, ] 제거
						
						String[] jsonStringArr =  jsonString.split("\\},");
						
						for(String btnData : jsonStringArr) {
							INBKkoBtnInfList_DTO btnInfo = new INBKkoBtnInfList_DTO();
							// 객체 문자열의 양 끝 중괄호를 제거하고, 각 필드를 분리
							btnData = btnData.replaceAll("[\\{\\}]", "");
							
							String[] btnFields = btnData.split(",");
							
							for(String field : btnFields) {
								String type = "";
								String name = "";
								String url_mobile = "";
								
								String[] keyValue = field.split(":");
								String key = keyValue[0].replaceAll("\"", "").trim();
								String value = keyValue[1].replaceAll("\"", "").trim();
								
								if("type".equals(key)) {
									type = value;
								} else if("name".equals(key)) {
									name = value;
								} else if("url_mobile".equals(key)) {
									// webLink 일 경우 keyValue[1] : http, keyValue[2]: ://smpib.skbank~
									if("WL".equals(type)) {
										url_mobile = value+keyValue[2];
									} else {
										url_mobile = value;
									}
								}
								
								btnInfo.setType(type);
								btnInfo.setName(name);
								btnInfo.setUrl_mobile(url_mobile);
							}
							btnInfoList.add(btnInfo);
						}
						pushListRspDto.setKkoBtnInfList(btnInfoList);
					}
					
					output.getInbPushListRsp_DTO().add(pushListRspDto);
					
				}
				output.setRtcd("200");
				output.setRtcdTxt("정상적으로 조회 되었습니다.");
			}
			else if ( "105".equalsIgnoreCase(dOutputList.getCode())) /** 코드값 "105"일때 목록 그대로 리턴*/ {
				logger.debug("=== 코드값 105 ===");
				output.setRtcd("105");
				output.setRtcdTxt(dOutputList.getMsg());
			}
			else {
				logger.debug("=== UMS 에러코드 ::: {}", dOutputList.getCode());
				logger.debug("=== UMS 에러메시지 ::: {}", dOutputList.getMsg());
				output.setRtcd(dOutputList.getCode());
				output.setRtcdTxt(dOutputList.getMsg());
			}
		} catch (WFApplicationException e) {
			logger.error("WFApplicationException error :: {}", e);
			output.setRtcdTxt(e.getResolvedMessage());	
			output.setRtcd(e.getCode());
			
		} catch(Exception e){
			logger.error("카카오톡 알림 목록 {}", e);
			output.setRtcd("Exception 발생");
			output.setRtcdTxt(e.getMessage());
		}
			
		return output;
	}
		
	/**
	 * 즐겨찾기 등록/해제한다.
	 * 
	 * @param input 알림.즐겨찾기.컨트롤러.입력.IO
	 * @return 알림.즐겨찾기.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName="알림.즐겨찾기.수정", description="즐겨찾기 등록/해제한다.", author="90190264")
	public INBNtfbxListInqUpdateNtfcFavt_ODT updateNtfcfavt(INBNtfbxListInqUpdateNtfcFavt_IDT input
	)
	{
			
		/**
		* @BXMType GetBean
		*/
		iNBItgNtfbxListInq_COM= WFApplicationContext.getBean(iNBItgNtfbxListInq_COM, INBItgNtfbxListInq_COM.class);
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class); 
		
		//세션고객정보
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession(); 
		/**
		 * @BXMType VariableDeclaration
		 */
		INBNtfbxListInqUpdateNtfcFavt_ODT output= new INBNtfbxListInqUpdateNtfcFavt_ODT();
		
		/**
		 * @BXMType Try
		 * UMS 즐겨찾기 등록/해제 호출
		 */
		try{
			NtfcFavt_DIDT dInput = new NtfcFavt_DIDT();
			
			String itcscno = "";
			// 로그인/비로그인 구분
			if (shrCMMLoginSession_COM.istLogin()) {
				itcscno = currentCust.getItcsno();
			} else {
				itcscno = input.getItcsno();
			}
			
			dInput.setItcsno(itcscno);										// 통합고객번호
			dInput.setMsgId(input.getMsgId());							// 메시지ID
			dInput.setUmsTrno(input.getUmsTrno());					// UMS거래번호
			dInput.setUmsReqDt(input.getUmsReqDt());				// UMS요청일자
			dInput.setFavtYn(input.getFavtYn());						// 즐겨찾기여부
			dInput.setNtfcCd(input.getNtfcCd());						// 알림코드 (push, sms, kakao)
			
			/*
			 * @BXMType ComponentCall
			 * 알림.즐겨찾기.컴포넌트 알림.즐겨찾기.수정
			 */
			NtfcFavt_DODT dOutput = iNBItgNtfbxListInq_COM.updateNtfcfavt(dInput);
			/**
			 * @BXMType IF
			 * 즐겨찾기 등록/해제 상태
			 */
			if ("000".equals(dOutput.getCode()) || "000".equals(dOutput.getStatus())) /** resultCode가 "000" 이면*/ {
				/*
				 * TODO
				 * result 결과 리턴
				 */
				// 즐겨찾기 데이터 그대로 리턴
				output.setFavtYn(input.getFavtYn());					// 즐겨찾기여부
				output.setMsgId(input.getMsgId());						// 메시지ID - RPS에서 필요
				output.setUmsTrno(input.getUmsTrno()); 				// UMS트렌젝션번호 - UMS에서 필요(UMS에는 msgID가 없음)
			} else {
				// 결과값 세팅
				output.setRtcd(dOutput.getCode());
				output.setRtcdTxt(dOutput.getMsg());
			}
			// 결과값 세팅
			output.setRtcd(dOutput.getCode());
			output.setRtcdTxt(dOutput.getMsg());
		}
		catch(Exception e){
			logger.error("=== = 즐겨찾기 수정 Exception::::: {}", e);
			output.setRtcd("Exception 발생");
			output.setRtcdTxt(e.getMessage());
		}
			
		return output;
			
	}
		
	/**
	 * 카테고리분류.조회
	 * 
	 * @param input 카테고리분류.컨트롤러.입력.IO
	 * @return 카테고리분류.컨트롤러.출력.IO  
	 */
	@BxmCategory(logicalName="카테고리분류.조회", description="카테고리분류.조회", author="90190264")
	public INBNtfbxListInqSelectCtgrClf_ODT selectCtgrClf(INBNtfbxListInqSelectCtgrClf_IDT input)
	{
		/**
		 * @BXMType GetBean
		 */
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		iNBItgNtfbxListInq_COM= WFApplicationContext.getBean(iNBItgNtfbxListInq_COM, INBItgNtfbxListInq_COM.class);
		ntfbxCtgrBsci001_dbm= WFApplicationContext.getBean(ntfbxCtgrBsci001_dbm, NTFBX_CTGR_BSCI001_DBM.class);
		
		//세션고객정보
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession(); 
		
		/**
		 * @BXMType VariableDeclaration
		 */
		INBNtfbxListInqSelectCtgrClf_ODT output= new INBNtfbxListInqSelectCtgrClf_ODT();
		
		/**
		 * @BXMType Try
		 * 
		 */
		try{
			// 간편회원여부
			String spCusYn = currentCust.getSpCusYn();
			// 알림구분코드 1:PUSH, 2:SMS, 3:KAKAO
			if("1".equals(input.getNtfcDscd())) {
				NTFBX_CTGR_BSCI001SelectPushCtgrList_DIDT pushCtgrListDidt = new NTFBX_CTGR_BSCI001SelectPushCtgrList_DIDT();
				pushCtgrListDidt.setNtfcDscd(input.getNtfcDscd());				// 알림구분코드
				
				List<NTFBX_CTGR_BSCI001SelectPushCtgrList_DODT> pushCtgrListDodt = new ArrayList<>();
				
				pushCtgrListDodt = ntfbxCtgrBsci001_dbm.selectPushCtgrList(pushCtgrListDidt);
				
				// PUSH 카테고리 데이터 있으면
				if(pushCtgrListDodt.size() > 0) {
					String pushNtfcLrclCd = "";					// 대분류코드
					
					// 간편회원과 금융회원 구분하여 PUSH 카테고리 세팅
					if("Y".equals(spCusYn)) {
						// 간편회원은 서비스(우리틴틴), 기타, 마케팅 카테고리만 세팅한다.
						for(NTFBX_CTGR_BSCI001SelectPushCtgrList_DODT dodt : pushCtgrListDodt) {
							// 입출금 제외
							if(!"01".equals(dodt.getNtfcCtgrCdId())) {
								// PUSH알림대분류코드, PUSH알림중분류코드 구분하여 데이터 세팅
								if("PUSH_NTFC_LRCL_CD".equals(dodt.getNtfcCtgrId())) {
									INBCtgrClfGrid_DTO pushCtgrClfGrid = new INBCtgrClfGrid_DTO();
									
									pushCtgrClfGrid.setNtfbxLrclCd(dodt.getNtfcCtgrCdId());												// 알림함대분류코드
									pushCtgrClfGrid.setNtfbxLrclCdNm(dodt.getNtfcCtgrCdNm());										// 알림함대분류코드명
									
									if("99".equals(dodt.getNtfcCtgrCdId()) ) {
										pushCtgrClfGrid.setLrclMclfCd("99");																		// 대분류+중분류코드
									}
									pushNtfcLrclCd = dodt.getNtfcCtgrCdId();																	// 알림함대분류코드
									
									output.getiNBCtgrClfGrid_DTO().add(pushCtgrClfGrid);
								} else if("PUSH_NTFC_MCLF_CD".equals(dodt.getNtfcCtgrId())) {
									// 중분류는 서비스: won play(0208, 0302), 우리틴틴(0209) 세팅
									if("0208".equals(dodt.getNtfcCtgrCdId()) || "0209".equals(dodt.getNtfcCtgrCdId()) || "0302".equals(dodt.getNtfcCtgrCdId())) {
										INBCtgrClfGrid_DTO pushCtgrClfGrid = new INBCtgrClfGrid_DTO();
										
										pushCtgrClfGrid.setNtfbxMclfCd(dodt.getNtfcCtgrCdId());												// 알림함중분류코드
										pushCtgrClfGrid.setNtfbxMclfCdNm(dodt.getNtfcCtgrCdNm());										// 알림함중분류코드명
										pushCtgrClfGrid.setLrclMclfCd(pushNtfcLrclCd + dodt.getNtfcCtgrCdId());						// 대분류+중분류코드
										
										output.getiNBCtgrClfGrid_DTO().add(pushCtgrClfGrid);
									}
								}
							}
						}
					} else {
						// 금융회원은 모든 카테고리 세팅
						for(NTFBX_CTGR_BSCI001SelectPushCtgrList_DODT dodt : pushCtgrListDodt) {
							INBCtgrClfGrid_DTO pushCtgrClfGrid = new INBCtgrClfGrid_DTO();
							
							// PUSH알림대분류코드, PUSH알림중분류코드 구분하여 데이터 세팅
							if("PUSH_NTFC_LRCL_CD".equals(dodt.getNtfcCtgrId())) {
								pushCtgrClfGrid.setNtfbxLrclCd(dodt.getNtfcCtgrCdId());												// 알림함대분류코드
								pushCtgrClfGrid.setNtfbxLrclCdNm(dodt.getNtfcCtgrCdNm());										// 알림함대분류코드명
								pushNtfcLrclCd = dodt.getNtfcCtgrCdId();																	// 알림함대분류코드
								
								// 마케팅, 기타 일땐 '대분류+중분류' 항목에 대분류 값을 넣어준다.
								if("03".equals(pushNtfcLrclCd) || "99".equals(pushNtfcLrclCd)) {
									pushCtgrClfGrid.setLrclMclfCd(pushNtfcLrclCd);						// 대분류+중분류코드
								}
							} else if("PUSH_NTFC_MCLF_CD".equals(dodt.getNtfcCtgrId())) {
								pushCtgrClfGrid.setNtfbxMclfCd(dodt.getNtfcCtgrCdId());												// 알림함중분류코드
								pushCtgrClfGrid.setNtfbxMclfCdNm(dodt.getNtfcCtgrCdNm());										// 알림함중분류코드명
								pushCtgrClfGrid.setLrclMclfCd(pushNtfcLrclCd + dodt.getNtfcCtgrCdId());						// 대분류+중분류코드
							}
							
							output.getiNBCtgrClfGrid_DTO().add(pushCtgrClfGrid);
						}
					}
				}
				
			} else if("2".equals(input.getNtfcDscd())) {
				/**
				 * 연계시스템 호출
				 * TODO 인터페이스 호출을 위한 코드를 작성하십시오.
				 * TYPE : HTTP(GET)
				 * ID : 
				 * NM : UMS URL 호출
				 */
				
				String itcsno = "";
				
				// 비로그인 일 경우 화면에서 넘어온 통고번호 세팅, 로그인일 경우 세션 통고 세팅
				if(shrCMMLoginSession_COM.istLogin()) {
					itcsno = currentCust.getItcsno();
				} else {
					itcsno = input.getItcsno();
				}
				
				INBUmsCtgrClf_DTO dOutputList = new INBUmsCtgrClf_DTO();
				
				dOutputList = iNBItgNtfbxListInq_COM.selectCtgrClf(itcsno);
				/*
				 * SMS 카테고리 조회 결과
				 * 대분류 : 00	중분류: 00	0000	본점(통지) = 정보성			sortSeqNo: 3
				 * 대분류 : 01	중분류: 00	0100	영업점(통지) = 영업점			sortSeqNo: 2
				 * 대분류 : 10	중분류: 00	1000	광고(본점,영업점) = 마케팅	sortSeqNo: 4
				 * 대분류 : 11	중분류: 00	1100	입출금(전체) = 입출금			sortSeqNo: 1
				 * 대분류 : 11	중분류: 01	1101	입출금(입금) = 입금
				 * 대분류 : 11	중분류: 02	1102	입출금(출금) = 출금
				 */
				if ("000".equalsIgnoreCase(dOutputList.getCode())) /** 코드값 "000"일때 알림 목록 리턴*/ {
					List<INBUmsCtgrClfGrid_DTO> ctgrClfList = dOutputList.getMsgs();
					/*
					 * UMS에서 넘어온 데이터 NEW WON에 맞게 변환 작업
					 * 입출금 - 영업점 - 정보성 - 마케팅 순으로 세팅
					 */
					List<INBCtgrClfGrid_DTO> sortedCtgrList = ctgrClfList.stream()
																						    .map((item) -> {
																						    	INBCtgrClfGrid_DTO dto = new INBCtgrClfGrid_DTO();
																						    	// 대분류가 존재하고 중분류가 00인 대분류 값들만 뽑아낸다.
																						    	if(!WFStringUtils.isEmpty(item.getcL1Cd()) && "00".equals(item.getcL2Cd())) {
																						    		dto.setNtfbxLrclCd(item.getcL1Cd());										// 알림함대분류코드
																						    		dto.setNtfbxMclfCd(item.getcL2Cd());										// 알림함중분류코드
																						    		dto.setLrclMclfCd(item.getcAlCd());											// 대분류+중분류코드
																						    		dto.setNtfbxLrclCdNm(item.getCodeName2());							// 알림함대분류코드명
																									dto.setSortSeqNo(Integer.parseInt(item.getSeq()));					// 화면 표출 순서
																						    	}
																								
																								return dto;
																							})
																						    .filter((item) -> !WFStringUtils.isEmpty(item.getNtfbxLrclCd()))
																						    .sorted((item1, item2) -> Integer.compare(item1.getSortSeqNo(), item2.getSortSeqNo()))
																						    .collect(Collectors.toList());
					
					output.setiNBCtgrClfGrid_DTO(sortedCtgrList);
					
				} else {
					logger.debug("=== UMS 에러코드 ::: {}", dOutputList.getCode());
					logger.debug("=== UMS 에러메시지 ::: {}", dOutputList.getMsg());
				}
			} else if("3".equals(input.getNtfcDscd())) {
				if(logger.isDebugEnabled()) {
					logger.debug("카카오 카테고리분류 추가 예정  --------------------"); 
				}
			}
		} catch(WFApplicationException e) {
			logger.error("카테고리분류 WFApplicationException {}", e);
		} catch(Exception e) {
			logger.error("카테고리분류 Exception {}", e);
		}
			
		return output;
			
	}

	/**
	 * PUSH.동의여부.조회
	 * 
	 * @param input PUSH.동의여부.조회.입력.IO
	 * @return PUSH.동의여부.조회.출력.IO
	 */
	@BxmCategory(logicalName="PUSH.동의여부.조회", description="PUSH.동의여부.조회", author="90190264")
	public INBNtfbxListInqSelectPushAgrYn_ODT selectPushAgrYn(INBNtfbxListInqSelectPushAgrYn_IDT input) {
		/**
		* @BXMType GetBean
		*/
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		sHRINBPushBiz_COM= WFApplicationContext.getBean(sHRINBPushBiz_COM, SHRINBPushBiz_COM.class);
		
		//세션고객정보
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession(); 
		
		/**
		 * @BXMType VariableDeclaration
		 */
		INBNtfbxListInqSelectPushAgrYn_ODT output= new INBNtfbxListInqSelectPushAgrYn_ODT();
		
		try{
			/*
			 * @BXMType DBM
			 * 통합.알림함001.DBM PUSH.동의여부.조회
			 */
			SHRINBPushBscInf_DTO shrInput = new SHRINBPushBscInf_DTO();
			shrInput.setMchrUnqInfId(input.getMchrUnqInfId());				 // 기기 토큰(레지스트리키)
			
			SHRINBPushBscInf_DTO dodt = sHRINBPushBiz_COM.selectPushBscInf(shrInput);
			
			if(dodt != null) {
				output.setPushAgrYn(dodt.getPushAgrYn());
				output.setNgItgCsno(dodt.getNgItgCsno());
				output.setUserId(dodt.getUserId());
			}
			
		}
		catch(Exception e){
			logger.error("PushAgrYn Exception ::: {}", e);
		}
		
		return output;
	}

	/**
	 * 마케팅.동의여부.조회
	 * 
	 * @param input 마케팅.동의여부.조회.입력.IO
	 * @return 마케팅.동의여부.조회.출력.IO
	 */
	@BxmCategory(logicalName="마케팅.동의여부.조회", description="마케팅.동의여부.조회", author="90190264")
	public INBNtfbxListInqSelectMrktAgrYn_ODT selectMrktAgrYn() {
		/**
		* @BXMType GetBean
		*/
		sHRMMHCustSession_COM = WFApplicationContext.getBean(sHRMMHCustSession_COM, SHRMMHCustSession_COM.class);
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		sHRMMHEsnsMbhInfInq_S_COM = WFApplicationContext.getBean(sHRMMHEsnsMbhInfInq_S_COM, SHRMMHEsnsMbhInfInq_S_COM.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */
		INBNtfbxListInqSelectMrktAgrYn_ODT output= new INBNtfbxListInqSelectMrktAgrYn_ODT();
		
		// 세션고객정보
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession();
		// 간편회원/금융회원 구분
		if(shrCMMLoginSession_COM.isEsnsMbh()) {
			SHREsnsMbhInfInqIN_DTO esnsMbhInfInqINDto = new SHREsnsMbhInfInqIN_DTO();
			esnsMbhInfInqINDto.setCusCiNo(currentCust.getCusCiNo());
			
			SHREsnsMbhInfInqOUT_DTO esnsMbhInfInqOUTDto = sHRMMHEsnsMbhInfInq_S_COM.selectEsnsMbhInfInq(esnsMbhInfInqINDto);
			
			output.setMrktAgrYn1(esnsMbhInfInqOUTDto.getPigtUtzOfrAgrYn());							// 마케팅동의여부
			output.setSmsMrktAgrYn1(esnsMbhInfInqOUTDto.getSmsMrktAgrYn());						// SMS마케팅동의여부
		} else {
			//세션고객정보
			MMH_PIGT_AGR_INFO pigtAgrInfo = sHRMMHCustSession_COM.getPigtAgrInfoSession();
			
			output.setMrktAgrYn1(pigtAgrInfo.getMrktAgrYn());												// 마케팅동의여부
			output.setSmsMrktAgrYn1(pigtAgrInfo.getSmsMrktAgrYn());										// SMS마케팅동의여부
			output.setEltTmsMdMrktAgrYn1(pigtAgrInfo.getEltTmsMdMrktAgrYn());						// 전자전송매체마케팅동의여부
		}
		
		
		return output;
	}

	/**
	 * 읽음여부.수정
	 * 
	 * @param input 읽음여부.수정.입력.IO
	 * @return 읽음여부.수정.출력.IO
	 */
	@BxmCategory(logicalName="읽음여부.수정", description="읽음여부.수정", author="90190264")
	public INBNtfbxListInqUpdateReadYn_ODT updateReadYn(INBNtfbxListInqUpdateReadYn_IDT input) {
		
		/**
		* @BXMType GetBean
		*/
		iNBItgNtfbxListInq_COM= WFApplicationContext.getBean(iNBItgNtfbxListInq_COM, INBItgNtfbxListInq_COM.class);
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		
		INBNtfbxListInqUpdateReadYn_ODT output = new INBNtfbxListInqUpdateReadYn_ODT();
		NtfcReadYn_DIDT didt = new NtfcReadYn_DIDT();
		
		//세션고객정보
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession();
		
		String itcsno = "";
		// 비로그인 일 경우 화면에서 넘어온 통고번호 세팅, 로그인일 경우 세션 통고 세팅
		if(shrCMMLoginSession_COM.istLogin()) {
			itcsno = currentCust.getItcsno();
		} else {
			itcsno = input.getItcsno();
		}
		
		didt.setItcsno(itcsno);
		didt.setiNBNtfcReadYnGrid_DTO(input.getiNBNtfcReadYnGrid_DTO());
		
		/*
		 * @BXMType ComponentCall
		 * 통합.알림함.목록.조회.컴포넌트 읽음여부.수정
		 */
		try {
			NtfcReadYn_DODT dOutput = iNBItgNtfbxListInq_COM.updateReadYn(didt);
			
			output.setCode(dOutput.getCode());
			output.setMsg(dOutput.getMsg());
		} catch (WFApplicationException e) {
			logger.error("updateReadYn Exception ::: {}", e);
		} catch (IOException e) {
			logger.error("updateReadYn IOException ::: {}", e);
		}
		
		return output;
	}

	/**
	 * 사용자.정보.조회
	 * 
	 * @return 사용자.정보.출력.IO
	 */
	@BxmCategory(logicalName="사용자.정보.조회", description="사용자.정보.조회", author="90190264")
	public INBNtfbxListInqSelectUserInf_ODT selectUserInf() {
		sHRMMHCustSession_COM = WFApplicationContext.getBean(sHRMMHCustSession_COM, SHRMMHCustSession_COM.class);
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		
		INBNtfbxListInqSelectUserInf_ODT output = new INBNtfbxListInqSelectUserInf_ODT();
		
		MMH_CUST_INFO custInfo = sHRMMHCustSession_COM.getCustInfoSession();
		
		output.setItcsno(custInfo.getItcsno());														// 통합고객번호
		output.setCusKorlNm(custInfo.getCusKorlNm());												// 사용자명
		output.setEsnsMbhYn(shrCMMLoginSession_COM.isEsnsMbh() ? "Y" : "N");			// 간편회원여부
		output.setLginYn(shrCMMLoginSession_COM.istLogin() ? "Y" : "N");					// 로그인여부
		output.setHpComCd(custInfo.getHpComCd());
		output.setHpTlenNo(custInfo.getHpTlenNo());
		output.setHpSrno(custInfo.getHpSrno());
		
		return output;
	}
		
}
