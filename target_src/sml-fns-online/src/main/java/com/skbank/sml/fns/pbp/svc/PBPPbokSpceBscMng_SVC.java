package com.skbank.sml.fns.pbp.svc;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.skbank.sml.cec.shr.com.SHRCECBypsPrvnUtil_COM;
import com.skbank.sml.cec.shr.dto.SHRCECBypsPrvnUtilSetBypsPrvnInfoInp_DTO;
import com.skbank.sml.cmm.shr.com.SHRCMMLoginSession_COM;
import com.skbank.sml.cmm.shr.dto.CMM_CURRENT_CUST;
import com.skbank.sml.fns.pbp.com.PBPPbokSplitBscMng_COM;
import com.skbank.sml.fns.pbp.com.PBPPbokSplitInq_COM;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceBscMngDeletePbokSplitSrvcScss_IDT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceBscMngDeletePbokSplitSrvcScss_ODT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceBscMngInsertPboksprnmbhJnng_IDT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceBscMngInsertPboksprnmbhJnng_ODT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceBscMngSelectActinf_ODT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceBscMngSelectActlist_IDT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceBscMngSelectActlist_ODT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceBscMngSelectMainspceinf_IDT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceBscMngSelectMainspceinf_ODT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceBscMngSelectSpcesrvcJnngactinf_ODT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceBscMngSelectSpcesrvcJnngactlist_IDT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceBscMngSelectSpcesrvcJnngactlist_ODT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceBscMngSelectSpcesrvcjnngavlyn_IDT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceBscMngSelectSpcesrvcjnngavlyn_ODT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceBscMngSelectUsgspceinf_ODT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceBscMngSelectUsgspceinflist_IDT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceBscMngSelectUsgspceinflist_ODT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceBscMngSetPbokSplitCmnScrtCrtf_IDT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceBscMngSetPbokSplitCmnScrtCrtf_ODT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceBscMngUpdateNtfcAgrYn_IDT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceBscMngUpdateNtfcAgrYn_ODT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceBscMngUpdateNtfcAgrYnlist_IDT;
import com.skbank.sml.fns.pbp.dto.PBPPbokSpceBscMngSelectAllActList_DODT;
import com.skbank.sml.fns.pbp.dto.PBPPbokSpceBscMngSelectAllAct_DIDT;
import com.skbank.sml.fns.pbp.dto.PBPPbokSpceBscMngSelectAllAct_DODT;
import com.skbank.sml.fns.pbp.dto.PBPPbokSplitBscMngCrudSrvcBscMng_DIDT;
import com.skbank.sml.fns.pbp.dto.PBPPbokSplitBscMngCrudSrvcBscMng_DODT;
import com.skbank.sml.fns.pbp.dto.PBPPbokSplitInqSelectPbokSplitActRapTotAmInf_DIDT;
import com.skbank.sml.fns.pbp.dto.PBPPbokSplitInqSelectPbokSplitActRapTotAmInf_DODT;
import com.skbank.sml.fns.pbp.dto.PBPPbokSplitInqSelectPbokSplitItInfSubSpceList_DODT;
import com.skbank.sml.fns.pbp.dto.PBPPbokSplitInqSelectPbokSplitItInf_DIDT;
import com.skbank.sml.fns.pbp.dto.PBPPbokSplitInqSelectPbokSplitItInf_DODT;
import com.skbank.sml.fns.shr.com.SHRPBPBiz_COM;
import com.skbank.sml.fns.shr.dto.SHRPBPBizSelectPBPJnngYn_DIDT;
import com.skbank.sml.fns.shr.dto.SHRPBPBizSelectPBPJnngYn_DODT;

import bxm.common.annotaion.BxmCategory;
import fwk.skbank.online.context.WFApplicationContext;
import fwk.skbank.online.util.WFDateUtils;

/**
 * 1.업무명 : 금융서비스 
 * 2.단위업무명 : NEWWON 중분류 통장쪼개기 
 * 3.프로그램명 : 통장.공간.일반.관리.서비스 
 * 4.설명 : 통장쪼개기 서비스와 관련된 기능을 지원하는 서비스
 * 
 * @Class PBPPbokSpceBscMng_SVC.java
 * @author 90191355
 * @since 2024.04.15
 * @version 1.0
 */
@Service
@BxmCategory(logicalName = "통장.공간.일반.관리.서비스", description = "통장쪼개기 서비스와 관련된 기능을 지원하는 서비스")
public class PBPPbokSpceBscMng_SVC {
	private Logger logger = LoggerFactory.getLogger(getClass());

	/**
	 * SHRCMMLoginSession 생성 컴포넌트
	 */
	private SHRCMMLoginSession_COM shrCMMLoginSession_COM;
	/**
	 * SHRPBPBiz_COM 공유 공통 컴포넌트
	 */
	private SHRPBPBiz_COM sHRPBPBiz_COM;
	/**
	 * 통장쪼개기 조회 컴포넌트
	 */
	private PBPPbokSplitInq_COM pBPPbokSplitInq_COM;
	/**
	 * 통장.쪼개기.기본.관리.컴포넌트
	 */
	private PBPPbokSplitBscMng_COM pBPPbokSplitBscMng_COM;
	/**
	 * 인증보안 인증우회방지 공통 컴포넌트
	 */
	private SHRCECBypsPrvnUtil_COM shrCECBypsPrvnUtil_COM;

	/**
	 *통장쪼개기.공통.보안인증.셋팅
	 * 
	 * @param input 
	 * @return 
	 */
	@BxmCategory(logicalName="통장쪼개기.공통.보안인증.셋팅", description="통장쪼개기.공통.보안인증.셋팅 및 로그인 세션 정보를 조회한다", author="90191355")
	public PBPPbokSpceBscMngSetPbokSplitCmnScrtCrtf_ODT setPbokSplitCmnScrtCrtf(PBPPbokSpceBscMngSetPbokSplitCmnScrtCrtf_IDT input) {
		shrCECBypsPrvnUtil_COM = WFApplicationContext.getBean(shrCECBypsPrvnUtil_COM, SHRCECBypsPrvnUtil_COM.class);
				
		PBPPbokSpceBscMngSetPbokSplitCmnScrtCrtf_ODT output = new PBPPbokSpceBscMngSetPbokSplitCmnScrtCrtf_ODT();
		/*
		 * 인증우회방지 사전 정보 생성
		 * */
		SHRCECBypsPrvnUtilSetBypsPrvnInfoInp_DTO inputParam = new SHRCECBypsPrvnUtilSetBypsPrvnInfoInp_DTO();

		inputParam.setSkipCert("N");				// 인증서 인증 SKIP여부(기본값: N)
		inputParam.setSkipSecuToken("Y");		// 보안매체 인증 SKIP여부(기본값: N)
		inputParam.setE2ETgtYn("Y");				// E2E 체크 여부(기본값: Y)

		shrCECBypsPrvnUtil_COM.setBypsPrvnInfo(inputParam);
		
		return output;
	}
	/**
	 * 통장쪼개기 서비스의 가입가능 대상여부를 조회하는 서비스
	 * 
	 * @param input
	 *            공간.서비스가입.가능.정보.컨트롤러.입력.IO
	 * @return 공간.서비스가입.가능.정보.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName = "공간.서비스가입.가능.여부.조회", description = "통장쪼개기 서비스의 가입가능 대상여부를 조회하는 서비스", author = "90191355")
	public PBPPbokSpceBscMngSelectSpcesrvcjnngavlyn_ODT selectSpcesrvcjnngavlyn(PBPPbokSpceBscMngSelectSpcesrvcjnngavlyn_IDT input) {

		/**
		 * @BXMType GetBean
		 */
		sHRPBPBiz_COM = WFApplicationContext.getBean(sHRPBPBiz_COM, SHRPBPBiz_COM.class);
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);

		if (logger.isDebugEnabled()) {
			logger.debug("통장쪼개기 가입여부 svc ::: input ::: {}", input);
		}
		PBPPbokSpceBscMngSelectSpcesrvcjnngavlyn_ODT output = new PBPPbokSpceBscMngSelectSpcesrvcjnngavlyn_ODT();
		
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession();

		if (logger.isDebugEnabled()) {
			logger.debug("통장쪼개기 가입여부 svc 비로그인 체크 currentCust:::::: {}", currentCust);
		}
		//비 로그인 접근
		if(StringUtils.isEmpty(currentCust.getUserId())) {
			output.setPbokSplitJnngAvlYn("N"); // 가입가능여부조회
			output.setPbokSplitJnngYn("N"); // 가입여부조회
			
			return output;
		}

		SHRPBPBizSelectPBPJnngYn_DIDT shrPbpJnngYnDidt = new SHRPBPBizSelectPBPJnngYn_DIDT();
		shrPbpJnngYnDidt.setItcsno(input.getItcsno());

		SHRPBPBizSelectPBPJnngYn_DODT shrPbpComOutput = sHRPBPBiz_COM.selectPBPJnngYn(shrPbpJnngYnDidt);
		if (logger.isDebugEnabled()) {
			logger.debug("통장쪼개기 가입여부 svc ::: output ::: {}", shrPbpComOutput);
		}
		// 가입 가능여부, 조회된 값 외에 혹시몰라 간편여부 체크추가
		// 간편회원여부
		String avlYn = "Y".equals(currentCust.getSpCusYn()) ? "N" : shrPbpComOutput.getPbokSplitJnngAvlYn();
		output.setPbokSplitJnngAvlYn(avlYn); // 가입가능여부조회
		output.setPbokSplitJnngYn(shrPbpComOutput.getPbokSplitJnngYn()); // 가입여부조회
	
		return output;
	}

	/**
	 * 통장쪼개기 서비스에 가입 가능한 계좌 목록 조회 서비스
	 * 
	 * @param input 계좌.정보.컨트롤러.입력.IO
	 * @return 계좌.정보.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName = "계좌.목록.조회", description = "통장쪼개기 서비스에 가입 가능한 계좌 목록 조회 서비스", author = "90191355")
	public PBPPbokSpceBscMngSelectActlist_ODT selectAllact(PBPPbokSpceBscMngSelectActlist_IDT input) {

		/**
		 * @BXMType GetBean
		 */
		pBPPbokSplitInq_COM = WFApplicationContext.getBean(pBPPbokSplitInq_COM, PBPPbokSplitInq_COM.class);

		PBPPbokSpceBscMngSelectAllAct_DIDT didt = new PBPPbokSpceBscMngSelectAllAct_DIDT();
		didt.setItcsno(input.getItcsno());

		//가입하거나 가입가능한 목록
		PBPPbokSpceBscMngSelectAllAct_DODT raw = pBPPbokSplitInq_COM.selectAllAct(didt);

		PBPPbokSpceBscMngSelectActlist_ODT output = new PBPPbokSpceBscMngSelectActlist_ODT();

		List<PBPPbokSpceBscMngSelectAllActList_DODT> rawList = raw.getJnngAvlActInfList_DODT();
		List<PBPPbokSpceBscMngSelectActinf_ODT> resultList = rawList.stream()
				.filter(t -> "N".equals(t.getSpceSrvcJnngYn())) //가입안한 계좌
				.map(t -> {
					PBPPbokSpceBscMngSelectActinf_ODT resultItem = new PBPPbokSpceBscMngSelectActinf_ODT();
					resultItem.setAcno(t.getAcno());
					resultItem.setCusUsgBkwAcno(t.getCusUsgBkwAcno());
					resultItem.setPrdNm(t.getPrdNm());
					resultItem.setRawActBal(t.getRawActBal());
					resultItem.setSpceSrvcJnngYn(t.getSpceSrvcJnngYn());
					
					return resultItem;
				}).collect(Collectors.toList());

		output.setpBPJnngAvlActInf_DTO(resultList);

		return output;

	}

	/**
	 * 통장쪼개기 서비스에 가입한 계좌 목록 조회 서비스
	 * 
	 * @param input
	 *            공간.서비스가입.계좌.정보.컨트롤러.입력.IO
	 * @return 공간.서비스가입.계좌.정보.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName = "공간.서비스가입.계좌.목록.조회", description = "통장쪼개기 서비스에 가입한 계좌 목록 조회", author = "90191355")
	public PBPPbokSpceBscMngSelectSpcesrvcJnngactlist_ODT selectAllspcesrvcJnngact(PBPPbokSpceBscMngSelectSpcesrvcJnngactlist_IDT input) {

		/**
		 * @BXMType GetBean
		 */
		pBPPbokSplitInq_COM = WFApplicationContext.getBean(pBPPbokSplitInq_COM, PBPPbokSplitInq_COM.class);
		
		PBPPbokSpceBscMngSelectAllAct_DIDT didt = new PBPPbokSpceBscMngSelectAllAct_DIDT();
		didt.setItcsno(input.getItcsno());

		//가입 혹은 가입가능 계좌 조회
		PBPPbokSpceBscMngSelectAllAct_DODT raw = pBPPbokSplitInq_COM.selectAllAct(didt);
		List<PBPPbokSpceBscMngSelectAllActList_DODT> rawList = raw.getJnngAvlActInfList_DODT();

		PBPPbokSpceBscMngSelectSpcesrvcJnngactlist_ODT output = new PBPPbokSpceBscMngSelectSpcesrvcJnngactlist_ODT();

		List<PBPPbokSpceBscMngSelectSpcesrvcJnngactinf_ODT> resultList = new ArrayList<PBPPbokSpceBscMngSelectSpcesrvcJnngactinf_ODT>();
		for (PBPPbokSpceBscMngSelectAllActList_DODT dodt : rawList) {
			//미가입 계좌
			if ("N".equals(dodt.getSpceSrvcJnngYn())) {continue;}
			
			PBPPbokSpceBscMngSelectSpcesrvcJnngactinf_ODT resultItem = new PBPPbokSpceBscMngSelectSpcesrvcJnngactinf_ODT();
			resultItem.setAcno(dodt.getAcno());
			resultItem.setCusUsgBkwAcno(dodt.getCusUsgBkwAcno());
			resultItem.setRawActBal(dodt.getRawActBal());
			resultItem.setSpceSrvcJnngYn(dodt.getSpceSrvcJnngYn());
			resultItem.setSpceSrvcJnngDt(dodt.getSpceSvrcJnngDt());
			resultItem.setSubSpceCnt(dodt.getSpceCnt());
			resultItem.setPrdNm(dodt.getPrdNm());

			//{알림여부} 기본원장 조회
			PBPPbokSpceBscMngSelectMainspceinf_IDT mSIdt = new PBPPbokSpceBscMngSelectMainspceinf_IDT();
			mSIdt.setItcsno(input.getItcsno());
			mSIdt.setAcno(dodt.getAcno());
			
			PBPPbokSpceBscMngSelectMainspceinf_ODT baseInfo = this.selectSrvcbscinf(mSIdt);
			if (ObjectUtils.isEmpty(baseInfo)) {continue;} //조회안되는 계좌
			resultItem.setGoalNtfcYn(baseInfo.getBkAppPushAgrYn());
			
			resultList.add(resultItem);
		}
		

		output.setpBPSpceSrvcJnngActInfList_ODT(resultList);
		
		return output;

	}

	/**
	 * 통장쪼개기 서비스를 가입하기 위한 회원의 약관동의 처리 서비스
	 * 
	 * @param input 통장.분리.회원가입.목록.컨트롤러.입력.IO
	 * @return 통장.분리.회원가입.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName = "통장.분리.회원가입.등록", description = "통장쪼개기 서비스를 가입하기 위한 회원의 약관동의 처리 서비스", author = "90191355")
	public PBPPbokSpceBscMngInsertPboksprnmbhJnng_ODT insertPboksprnmbhJnng(PBPPbokSpceBscMngInsertPboksprnmbhJnng_IDT input) {

		/**
		 * @BXMType GetBean
		 */
		pBPPbokSplitBscMng_COM = WFApplicationContext.getBean(pBPPbokSplitBscMng_COM, PBPPbokSplitBscMng_COM.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */
		if (logger.isDebugEnabled()) {
			logger.debug("=======통장쪼개기 회원 가입 등록 input====== ::: {}", input);
			//약관 저장 x
		}
		
		PBPPbokSpceBscMngInsertPboksprnmbhJnng_ODT output = new PBPPbokSpceBscMngInsertPboksprnmbhJnng_ODT();
		
		PBPPbokSplitBscMngCrudSrvcBscMng_DIDT didt = new PBPPbokSplitBscMngCrudSrvcBscMng_DIDT();
		didt.setRprsAcno(input.getAcno()); // 대표계좌번호
		didt.setTrnDscd("1");
		
		pBPPbokSplitBscMng_COM.crudSrvcBscMng(didt);
		output.setRspRtcd("200");

		return output;
	}

	/**
	 * 통장쪼개기 서비스를 탈퇴하는 컨트롤러
	 * 
	 * @param input 통장.쪼개기.서비스.탈퇴.정보.컨트롤러.입력.IO
	 * @return 통장.쪼개기.서비스.탈퇴.정보.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName = "통장.쪼개기.서비스.탈퇴", description = "통장쪼개기 서비스를 탈퇴하는 컨트롤러", author = "90191355")
	public PBPPbokSpceBscMngDeletePbokSplitSrvcScss_ODT deletePbokSplitSrvcScss(PBPPbokSpceBscMngDeletePbokSplitSrvcScss_IDT input) {
		/**
		 * @BXMType GetBean
		 */
		pBPPbokSplitBscMng_COM = WFApplicationContext.getBean(pBPPbokSplitBscMng_COM, PBPPbokSplitBscMng_COM.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */
		if (logger.isDebugEnabled()) {
			logger.debug("=======통장쪼개기 회원 탈퇴 input====== ::: ", input);
		}
		
		PBPPbokSpceBscMngDeletePbokSplitSrvcScss_ODT output = new PBPPbokSpceBscMngDeletePbokSplitSrvcScss_ODT();
		
		PBPPbokSplitBscMngCrudSrvcBscMng_DIDT didt = new PBPPbokSplitBscMngCrudSrvcBscMng_DIDT();
		didt.setRprsAcno(input.getRprsAcno()); // 대표계좌번호
		didt.setTrnDscd("2");

		pBPPbokSplitBscMng_COM.crudSrvcBscMng(didt);
		output.setRspRtcd("200");
		
		return output;

	}

	/**
	 * 통장쪼개기를 통해 생성된 공간의 목록을 조회하는 서비스
	 * 
	 * @param input 사용.공간.정보.컨트롤러.입력.IO
	 * @return 사용.공간.정보.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName = "사용.공간.정보.목록.조회", description = "통장쪼개기를 통해 생성된 공간의 목록을 조회하는 서비스", author = "90191355")
	public PBPPbokSpceBscMngSelectUsgspceinflist_ODT selectUsgspceinflist(PBPPbokSpceBscMngSelectUsgspceinflist_IDT input) {
		/**
		* @BXMType GetBean
		*/
		if (logger.isDebugEnabled()) {
			logger.debug("공간 목록 조회 :::{}", input);
		}
		pBPPbokSplitInq_COM = WFApplicationContext.getBean(pBPPbokSplitInq_COM, PBPPbokSplitInq_COM.class);

		PBPPbokSplitInqSelectPbokSplitItInf_DIDT didt = new PBPPbokSplitInqSelectPbokSplitItInf_DIDT();
		didt.setAcno(input.getRprsAcno()); // 계좌번호
		didt.setInqDscd("1"); // 조회구분코드
		
		PBPPbokSplitInqSelectPbokSplitItInf_DODT dodt = pBPPbokSplitInq_COM.selectPbokSplitItInf(didt);

		PBPPbokSpceBscMngSelectUsgspceinflist_ODT output = new PBPPbokSpceBscMngSelectUsgspceinflist_ODT();
		
		List<PBPPbokSplitInqSelectPbokSplitItInfSubSpceList_DODT> subSpceList = dodt.getSubSpceList();
		List<PBPPbokSpceBscMngSelectUsgspceinf_ODT> list = new ArrayList<PBPPbokSpceBscMngSelectUsgspceinf_ODT>();
		
		for (PBPPbokSplitInqSelectPbokSplitItInfSubSpceList_DODT spce : subSpceList) {
			if ("000000".equals(spce.getSpceNo())) {
				//메인 패스
				continue;
			}
			
			PBPPbokSpceBscMngSelectUsgspceinf_ODT item = new PBPPbokSpceBscMngSelectUsgspceinf_ODT();
			item.setSpceSrno(spce.getSpceNo());
			item.setSpceIconNo(spce.getSpceIconNo()); // 공간아이콘번호
			item.setSpceNm(spce.getSpceNm()); // 공간명
			item.setSpceBal(spce.getSpceBal()); // 공간잔액
			item.setSavGoalAm(spce.getSavGoalAm()); // 저축목표금액
			item.setSavGoalStaDt(spce.getSavGoalStaDt()); // 저축목표시작일자
			item.setSavGoalEndDt(spce.getSavGoalEndDt()); // 저축목표종료일자
			item.setCnsmGoalAm(spce.getCnsmGoalAm()); // 소비목표금액
			item.setCnsmAmBscd(spce.getCnsmAmBscd()); // 소비금액기준코드
			item.setCnsmAmBscdNm(spce.getCnsmAmbsCdNm());
			
			list.add(item);
		}
		
		output.setSpaceList(list);		

		return output;

	}

	/**
	 * 메인공간의 정보를 조회하기 위한 서비스
	 * @param input 메인.공간.정보.조회.컨트롤러.입력.IO
	 * @return 메인.공간.정보.조회.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName = "메인.공간.정보.조회", description = "메인공간의 정보를 조회하기 위한 서비스", author = "90191355")
	public PBPPbokSpceBscMngSelectMainspceinf_ODT selectMainspceinf(PBPPbokSpceBscMngSelectMainspceinf_IDT input) {

		if (logger.isDebugEnabled()) {
			logger.debug(" 통장쪼개기 메인 공간 정보 조회  input====== {} ::: ", input);
		}
		/**
		 * @BXMType GetBean
		 */
		pBPPbokSplitInq_COM = WFApplicationContext.getBean(pBPPbokSplitInq_COM, PBPPbokSplitInq_COM.class);

		PBPPbokSplitInqSelectPbokSplitItInf_DIDT didt = new PBPPbokSplitInqSelectPbokSplitItInf_DIDT();
		didt.setAcno(input.getAcno()); // 계좌번호
		didt.setInqDscd("5"); // 조회구분코드
		didt.setSpceNo("000000"); // 공간번호
		//기본
		String today = WFDateUtils.getDateNow();
		String startDate = today.substring(0, 6) + "01";
		didt.setInqStaDt(startDate); // 조회시작일자
		didt.setInqEndDt(today); // 조회종료일자
		didt.setSortDscd("1"); // 정렬구분코드
		
		PBPPbokSplitInqSelectPbokSplitItInf_DODT dodt = pBPPbokSplitInq_COM.selectPbokSplitItInf(didt);
		
		PBPPbokSpceBscMngSelectMainspceinf_ODT output = new PBPPbokSpceBscMngSelectMainspceinf_ODT();		
		output.setPrdNm(dodt.getPrdNm()); // 상품명
		output.setAcno(dodt.getDpsAcno());
		output.setAcnoBal(dodt.getDpacBal());
		output.setRgsTrnDt(dodt.getRgsTrnDt()); // 등록거래일자
		output.setRvkTrnDt(dodt.getRvkTrnDt()); // 해제거래일자
		output.setBkAppPushAgrYn(dodt.getBkAppPushAgrYn()); // 은행앱PUSH동의여부
		
		
		PBPPbokSplitInqSelectPbokSplitActRapTotAmInf_DIDT actRapTotAmDidt = new PBPPbokSplitInqSelectPbokSplitActRapTotAmInf_DIDT();
		actRapTotAmDidt.setAcno(input.getAcno()); // 계좌번호
		actRapTotAmDidt.setInqStaDt(startDate); // 조회시작일자
		actRapTotAmDidt.setInqEndDt(today); // 조회종료일자
		
		PBPPbokSplitInqSelectPbokSplitActRapTotAmInf_DODT actRapTotAmDodt = pBPPbokSplitInq_COM.selectPbokSplitActRapTotAmInf(actRapTotAmDidt);
		
		output.setPaySumAm(actRapTotAmDodt.getPaySumAm()); // 지급합계금액
		output.setRcvSumAm(actRapTotAmDodt.getRcvSumAm()); // 입금합계금액
		
		List<PBPPbokSplitInqSelectPbokSplitItInfSubSpceList_DODT> subSpceList = dodt.getSubSpceList();
		List<PBPPbokSpceBscMngSelectUsgspceinf_ODT> list = new ArrayList<PBPPbokSpceBscMngSelectUsgspceinf_ODT>();
		
		for (PBPPbokSplitInqSelectPbokSplitItInfSubSpceList_DODT spce : subSpceList) {
			if ("000000".equals(spce.getSpceNo())) {
				//공간 잔액
				output.setSplitAvlAm(spce.getSpceBal());
				continue;
			}
			
			PBPPbokSpceBscMngSelectUsgspceinf_ODT item = new PBPPbokSpceBscMngSelectUsgspceinf_ODT();
			item.setSpceSrno(spce.getSpceNo());
			item.setSpceIconNo(spce.getSpceIconNo()); // 공간아이콘번호
			item.setSpceNm(spce.getSpceNm()); // 공간명
			item.setSpceBal(spce.getSpceBal()); // 공간잔액
			item.setSavGoalAm(spce.getSavGoalAm()); // 저축목표금액
			item.setSavGoalStaDt(spce.getSavGoalStaDt()); // 저축목표시작일자
			item.setSavGoalEndDt(spce.getSavGoalEndDt()); // 저축목표종료일자
			item.setCnsmGoalAm(spce.getCnsmGoalAm()); // 소비목표금액
			item.setCnsmAmBscd(spce.getCnsmAmBscd()); // 소비금액기준코드
			item.setCnsmAmBscdNm(spce.getCnsmAmbsCdNm());
			
			list.add(item);
		}
		
		output.setpBPPbokSpceBscMngSelectAllUsgspceinflist(list);

		return output;
	}

	/**
	 * 서비스 기본 정보 조회
	 * @param 서비스 기본 정보 조회 입력.IO
	 * @return 서비스 기본 정보 조회 출력.IO
	 */
	@BxmCategory(logicalName = "서비스 기본 정보 조회", description = "서비스 기본 원장 정보 조회 서비스", author = "90191355")
	public PBPPbokSpceBscMngSelectMainspceinf_ODT selectSrvcbscinf(PBPPbokSpceBscMngSelectMainspceinf_IDT input) {

		/**
		 * @BXMType GetBean
		 */
		pBPPbokSplitBscMng_COM = WFApplicationContext.getBean(pBPPbokSplitBscMng_COM, PBPPbokSplitBscMng_COM.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */
		if (logger.isDebugEnabled()) {
			logger.debug("=======통장쪼개기 기본 원장 조회 input====== ::: ", input);
		}
		
		PBPPbokSpceBscMngSelectMainspceinf_ODT output = new PBPPbokSpceBscMngSelectMainspceinf_ODT();
		
		PBPPbokSplitBscMngCrudSrvcBscMng_DIDT didt = new PBPPbokSplitBscMngCrudSrvcBscMng_DIDT();
		didt.setRprsAcno(input.getAcno()); // 대표계좌번호
		didt.setTrnDscd("3");

		PBPPbokSplitBscMngCrudSrvcBscMng_DODT dodt = pBPPbokSplitBscMng_COM.crudSrvcBscMng(didt);
		output.setTrnStcd(dodt.getTrnStcd()); // 거래상태코드
		output.setRgsTrnDt(dodt.getRgsTrnDt()); // 등록거래일자
		output.setRvkTrnDt(dodt.getRvkTrnDt()); // 해제거래일자
		output.setBkAppPushAgrYn(dodt.getBkAppPushAgrYn()); // 은행앱PUSH동의여부	
		
		return output;
	}

	/**
	 * 통장쪼개기 서비스에 가입한 계좌의 알림 여부를 수정하기 위한 서비스
	 * 
	 * 
	 * @param input 공간.서비스.알림.여부.컨트롤러.입력.IO
	 * @return 공간.서비스.알림.여부.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName = "공간.서비스.알림.여부.수정", description = "통장쪼개기 서비스에 가입한 계좌의 알림 여부를 수정하기 위한 서비스\r\n", author = "90191355")
	public PBPPbokSpceBscMngUpdateNtfcAgrYn_ODT updateSpceSrvcNtfcYn(PBPPbokSpceBscMngUpdateNtfcAgrYn_IDT input) {

		/**
		 * @BXMType GetBean
		 */
		pBPPbokSplitBscMng_COM = WFApplicationContext.getBean(pBPPbokSplitBscMng_COM, PBPPbokSplitBscMng_COM.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */
		if (logger.isDebugEnabled()) {
			logger.debug("=======통장쪼개기 알림여부 수정 input====== ::: {}", input);
		}
		
		/**
		 * @BXMType VariableDeclaration
		 */
		PBPPbokSpceBscMngUpdateNtfcAgrYn_ODT output = new PBPPbokSpceBscMngUpdateNtfcAgrYn_ODT();

		List<PBPPbokSpceBscMngUpdateNtfcAgrYnlist_IDT> updateList = input.getpBPSpceSrvcNtfcYnAcnoList_IDT();
		if (updateList.size() > 0) {
			int updateCnt = 0;
			for (PBPPbokSpceBscMngUpdateNtfcAgrYnlist_IDT item : updateList) {

				PBPPbokSplitBscMngCrudSrvcBscMng_DIDT didt = new PBPPbokSplitBscMngCrudSrvcBscMng_DIDT();
				didt.setRprsAcno(item.getAcno());
				didt.setTrnDscd("4");
				didt.setAppPushAgrYn(item.getNtfcYn());

				pBPPbokSplitBscMng_COM.crudSrvcBscMng(didt);
				
				if (logger.isDebugEnabled()) {
					logger.debug("=======통장쪼개기 push 동의여부 수정 Tx====== ::: ");
				}
				updateCnt++;
			}
			output.setNtfcAcnoCnt(updateCnt);
		}

		return output;
	}
}
