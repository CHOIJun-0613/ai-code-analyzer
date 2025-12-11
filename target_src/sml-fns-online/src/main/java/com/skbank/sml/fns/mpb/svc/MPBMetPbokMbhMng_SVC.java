package com.skbank.sml.fns.mpb.svc;

import bxm.common.annotaion.BxmCategory;
import bxm.common.util.StringUtils;

import com.skbank.sml.bsc.shr.com.SHRAllActInqTbk_COM;
import com.skbank.sml.bsc.shr.cst.cstt.SHRBSCInquiryConstant;
import com.skbank.sml.cec.shr.com.SHRCECBypsPrvnUtil_COM;
import com.skbank.sml.cmm.shr.com.SHRCMMInterfaceCfg_COM;
import com.skbank.sml.cmm.shr.com.SHRCMMLoginSession_COM;
import com.skbank.sml.cmm.shr.com.SHRFNSMbhSession_COM;
import com.skbank.sml.cmm.shr.dto.CMM_CURRENT_CUST;
import com.skbank.sml.cmm.shr.dto.FNS_MBH_INFO;
import com.skbank.sml.fns.mpb.com.MPBMetPbokBscMng_COM;
import com.skbank.sml.fns.mpb.com.MPBMetPbokMbhMng_COM;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokMbhMngUpdateAsscNompefInf_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokMbhMngUpdateAsscNompefInf_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokMbhMngUpdateMetPbokMbhScss_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokMbhMngUpdateMetPbokMbhScss_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMbhInfGrid_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokMbhMngSelectMetPbokMbhInf_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokMbhMngSelectMetPbokMbhInf_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokMbhInfListInq_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokMbhInfRgsScssGrid1_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokMbhInfRgsScssGrid2_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokMbhInfRgsScssGrid_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokMbhMngInsertMetPbokMbhInf_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokMbhMngInsertMetPbokMbhInf_ODT;

import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokMbhMngUpdateMetPbokWaitMbhInf_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokMbhMngUpdateMetPbokWaitMbhInf_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokMbhWaitInfGridAmd_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokMbhWaitInfGridInq_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokMbhMngSelectMetPbokWaitMbhInf_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokMbhMngSelectMetPbokWaitMbhInf_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokMbhMngInsertMetPbokWaitMbhInf_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokMbhMngInsertMetPbokWaitMbhInf_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokMbhMngUpdateMetPbokMyAlsNmInf_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokMbhMngUpdateMetPbokMyAlsNmInf_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokMbhMngUpdateMetPbokRprsChgAgr_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokMbhMngUpdateMetPbokRprsChgAgr_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokMbhMngUpdateMetPbokRprsChgApv_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokMbhMngUpdateMetPbokRprsChgApv_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokRprsChgGrid_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokMbhMngInsertMetPbokRprsChg_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokMbhMngInsertMetPbokRprsChg_ODT;
import com.skbank.sml.fns.mpb.dto.AsmnlRgsScss_DIDT;
import com.skbank.sml.fns.mpb.dto.AsmnlRgsScss_DODT;
import com.skbank.sml.fns.mpb.dto.MPBItcsnoInfInq_DTO;
import com.skbank.sml.fns.mpb.dto.MPBMetPbokBscMnginsertMetPbokPushNtfcSndInput_DTO;
import com.skbank.sml.fns.mpb.dto.MetPbokBscMbhInfGrid_DIDT;
import com.skbank.sml.fns.mpb.dto.MetPbokBscMbhInfGrid_DODT;
import com.skbank.sml.fns.mpb.dto.MetPbokBscMbhInf_DIDT;
import com.skbank.sml.fns.mpb.dto.MetPbokBscMbhInf_DODT;
import com.skbank.sml.fns.mpb.dto.MetPbokImgInfInq_DODT;
import com.skbank.sml.fns.mpb.dto.MetPbokMbhInfInq_DIDT;
import com.skbank.sml.fns.mpb.dto.MetPbokMbhInfInq_DODT;
import com.skbank.sml.fns.mpb.dto.MetPbokMbhInfListInq_DODT;
import com.skbank.sml.fns.shr.cst.cstt.SHRMPBCmmConstant;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_MBH_CRTF_MNG_LDG001UpdateMetPbokMbhScss_DIDT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_MBH_CRTF_MNG_LDG001UpdateMetPbokWaitMbhInf_DIDT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_MBH_CRTF_MNG_LDG001UpdateMetPbokWaitMbhRppeInf_DIDT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_MBH_CRTF_MNG_LDG001SelectMetPbokWaitMbhInf_DIDT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_MBH_CRTF_MNG_LDG001InsertMetPbokWaitMbhInf_DIDT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_MBH_CRTF_MNG_LDG001SelectMetPbokWaitMbhInf_DODT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_MBH_CRTF_MNG_LDG001SelectMetPbokWaitMbhList_DIDT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_MBH_CRTF_MNG_LDG001SelectMetPbokWaitMbhList_DODT;
import com.skbank.sml.ifi.mca.eims6.dto.IBSMR0005776_GRID_ODT;
import com.skbank.sml.ifi.mca.eims6.dto.IBSMR0005776_IDT;
import com.skbank.sml.ifi.mca.eims6.dto.IBSMR0005776_ODT;
import com.skbank.sml.ifi.mca.eims7.dto.IBSMR0005767_DIS_1_GRID_IDT;
import com.skbank.sml.ifi.mca.eims7.dto.IBSMR0005767_DIS_2_GRID_IDT;
import com.skbank.sml.ifi.mca.eims7.dto.IBSMR0005767_GRID_ODT;
import com.skbank.sml.ifi.mca.eims7.dto.IBSMR0005767_IDT;
import com.skbank.sml.ifi.mca.eims7.dto.IBSMR0005767_ODT;
import com.skbank.sml.ifi.mca.eims8.dto.IBSMR0005778_GRID_ODT;
import com.skbank.sml.ifi.mca.eims8.dto.IBSMR0005778_IDT;
import com.skbank.sml.ifi.mca.eims8.dto.IBSMR0005778_ODT;
import com.skbank.sml.ifi.mca.eims9.dto.IBSMR0005769_IDT;
import com.skbank.sml.ifi.mca.eims9.dto.IBSMR0005769_ODT;
import com.skbank.sml.ifi.mca.eims9.dto.IBSMR0005779_GRID_ODT;
import com.skbank.sml.ifi.mca.eims9.dto.IBSMR0005779_IDT;
import com.skbank.sml.ifi.mca.eims9.dto.IBSMR0005779_ODT;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0005767_COM;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0005769_COM;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0005776_COM;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0005778_COM;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0005779_COM;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import fwk.skbank.asis.adaptor.dto.request.WFInterfaceCfg;
import fwk.skbank.asis.adaptor.dto.response.WFInfResponse;
import fwk.skbank.asis.adaptor.header.request.WFNciHeader;
import fwk.skbank.online.context.WFApplicationContext;
import fwk.skbank.online.enc.WFCryptEtcUtils;
import fwk.skbank.online.exception.app.WFApplicationException;
import fwk.skbank.online.exception.frm.SFAdaptorApplicationException;
import fwk.skbank.online.exception.frm.SFInterfaceSystemException;
import fwk.skbank.online.util.WFDateUtils;

/**
 * 1.업무명 : 금융서비스 2.단위업무명 : NEWWON 중분류 모임통장 3.프로그램명 : 모임통장.회원.관리.서비스 4.설명 : 모임통장의
 * 회원을 관리하는 서비스
 * 
 * @Class MPBMetPbokMbhMng_SVC.java
 * @author 90190263
 * @since 2024.03.27
 * @version 1.0
 */
@Service
@BxmCategory(logicalName = "모임통장.회원.관리.서비스", description = "모임통장의 회원을 관리하는 서비스")
public class MPBMetPbokMbhMng_SVC {
	private Logger logger = LoggerFactory.getLogger(getClass());

	/**
	 * 세션 관리 컴포넌트
	 */
	private SHRCMMLoginSession_COM shrCMMLoginSession_COM;

	/**
	 * WFInterfaceCfg 생성 컴포넌트
	 */
	private SHRCMMInterfaceCfg_COM sHRCMMInterfaceCfg_COM;

	/**
	 * 모임통장.회원.관리.컴포넌트
	 */
	private MPBMetPbokMbhMng_COM mPBMetPbokMbhMng_COM;
	/**
	 * 모임통장.기본.관리.컴포넌트
	 */
	private MPBMetPbokBscMng_COM mPBMetPbokBscMng_COM;

	/**
	 * 모임통장 회원등록 및 탈퇴
	 */
	private SHRIBSMR0005767_COM sHRIBSMR0005767_COM;

	/**
	 * 모임통장 대표자 변경 요청
	 */
	private SHRIBSMR0005776_COM sHRIBSMR0005776_COM;

	/**
	 * 모임통장 대표자 변경 요청
	 */
	private SHRIBSMR0005778_COM sHRIBSMR0005778_COM;

	/**
	 * 모임통장 대표자 변경 요청
	 */
	private SHRIBSMR0005779_COM sHRIBSMR0005779_COM;
	/**
	 * 인증보안 인증우회방지 공통 컴포넌트
	 */
	private SHRCECBypsPrvnUtil_COM shrCECBypsPrvnUtil_COM;
	/**
	 * 모임통장 회원 세션 컴포넌트
	 */
	private SHRFNSMbhSession_COM sHRFNSMbhSession_COM;
	/**
	 * 모임통장 기본정보조회
	 */
	private SHRIBSMR0005769_COM sHRIBSMR0005769_COM;
	
	/** 계좌정보세션.컴포넌트 */
	private SHRAllActInqTbk_COM sHRAllActInqTbk_COM;
	/**
	 * 모임통장의 회원정보를 조회하는 서비스
	 * 
	 * @param input 모임통장.회원.정보.조회.컨트롤러.입력.IO
	 * @return 모임통장.회원.정보.조회.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName = "모임통장.대기.회원.정보.조회", description = "모임통장의 회원정보를 조회하는 서비스 ", author = "90190263")
	public MPBMetPbokMbhMngSelectMetPbokWaitMbhInf_ODT selectMetPbokWaitMbhInf(MPBMetPbokMbhMngSelectMetPbokWaitMbhInf_IDT input) {

		/**
		 * @BXMType GetBean
		 */
		mPBMetPbokMbhMng_COM = WFApplicationContext.getBean(mPBMetPbokMbhMng_COM, MPBMetPbokMbhMng_COM.class);
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);

		/**
		 * @BXMType VariableDeclaration
		 */
		// 세션고객정보
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession();
		if (logger.isDebugEnabled()) {
			logger.debug("currentCust ====== {} ::: ", currentCust);
		}

		MPBMetPbokMbhMngSelectMetPbokWaitMbhInf_ODT output = new MPBMetPbokMbhMngSelectMetPbokWaitMbhInf_ODT();
		MPBMetPbokMbhWaitInfGridInq_ODT outData = new MPBMetPbokMbhWaitInfGridInq_ODT();
		ArrayList<MPBMetPbokMbhWaitInfGridInq_ODT> outDataList = new ArrayList<>();

		/*
		 * 로직 추가 거래구분코드 [1] 대기회원정보조회 / [2] 대기회원목록조회
		 */
		if (logger.isDebugEnabled()) {
			logger.debug("90190263 모임통장.대기.회원.정보.조회 SVC input :: {} ", input);
		}

		/**
		 * @BXMType IF
		 * @Desc 입력 검증 : 필수 입력 값 검증 코드
		 */
		if ( input.getTrnDis()== null ) /**null check - 거래구분*/{
			throw new WFApplicationException("FNSE0005", new Object[]{input.getTrnDis()});
		}
		else if ( input.getMetMngNo()== null ) /**null check - 모임관리번호*/{
			throw new WFApplicationException("FNSE0005", new Object[]{input.getMetMngNo()});
		}

		else if ( input.getMetMbhStcd()== null ) /**null check - 모임회원상태코드*/{
			throw new WFApplicationException("FNSE0005", new Object[]{input.getMetMbhStcd()});
		}
		else if ( input.getMetMbhDscd()== null ) /**null check - 모임회원구분코드*/{
			throw new WFApplicationException("FNSE0005", new Object[]{input.getMetMbhDscd()});
		}
		
		
		int inqConut = 0;
		if ("1".equals(input.getTrnDis())) { // 대기회원의 정보 조회
			MET_PBOK_MBH_CRTF_MNG_LDG001SelectMetPbokWaitMbhInf_DIDT iMbhWaitInf = new MET_PBOK_MBH_CRTF_MNG_LDG001SelectMetPbokWaitMbhInf_DIDT();
			iMbhWaitInf.setMetMngNo(input.getMetMngNo()); // 모임관리번호
			iMbhWaitInf.setMetCrtfMbhSrno(input.getMetCrtfMbhSrno()); // 모임인증회원일련번호
			iMbhWaitInf.setItcsno(currentCust.getItcsno()); // 통합고객번호
			iMbhWaitInf.setEsnsMbhNo(currentCust.getEsnsMbhNo()); // 간편회원번호
			iMbhWaitInf.setMetMbhHpNo(input.getMetMbhHpNo()); // 모임회원핸드폰번호
			iMbhWaitInf.setMetMbhDscd(input.getMetMbhDscd()); // 모임회원구분코드 - [1]모임장/[2]모임원
			iMbhWaitInf.setMetMbhStcd(input.getMetMbhStcd()); // 모임회원상태코드

			/*
			 * @BXMType ComponentCall 모임통장.회원.관리.컴포넌트 모임통장.대기.회원.정보.조회
			 */
			// com.skbank.sml.fns.mpb.com.MPBMetPbokMbhMng_COM
			MET_PBOK_MBH_CRTF_MNG_LDG001SelectMetPbokWaitMbhInf_DODT oMbhWaitInf = mPBMetPbokMbhMng_COM.selectMetPbokWaitMbhInf(iMbhWaitInf);

			if (logger.isDebugEnabled()) {
				logger.debug("90190263 모임통장.대기.회원.정보.조회 SVC oMbhWaitInf {} :: ", oMbhWaitInf);
			}
			
			if( ObjectUtils.isEmpty(oMbhWaitInf)) {
				if (logger.isDebugEnabled()) {
					logger.debug("90190263 모임통장.대기.회원.정보.조회 SVC 회원이 아님 ! {} :: ", output);
				}
				return output;
			}
			
			inqConut = 1;

			outData.setMetCrtfMbhSrno(oMbhWaitInf.getMetCrtfMbhSrno()); // 모임인증회원일련번호
			outData.setItcsno(oMbhWaitInf.getItcsno()); // 통합고객번호
			outData.setEsnsMbhNo(oMbhWaitInf.getEsnsMbhNo()); // 간편회원번호
			outData.setUtzpeNoCfcd(oMbhWaitInf.getUtzpeNoCfcd()); // 이용자번호분류코드
			outData.setMetMbhSrno(oMbhWaitInf.getMetMbhSrno());
			outData.setMetMbhNm(oMbhWaitInf.getMetMbhNm()); // 모임회원명
			outData.setMetMbhHpNo(oMbhWaitInf.getMetMbhHpNo()); // 모임회원핸드폰번호
			outData.setMetMbhStcd(oMbhWaitInf.getMetMbhStcd()); // 모임회원상태코드
			outData.setMetMbhDscd(oMbhWaitInf.getMetMbhDscd()); // 모임회원구분코드

			output.setGrid(outData);
			output.setGridCnt(inqConut); // 조회건수
			output.setMetMngNo(oMbhWaitInf.getMetMngNo()); // 모임관리번호

		} else if ("2".equals(input.getTrnDis())) { // 대기회원 목록 조회
			MET_PBOK_MBH_CRTF_MNG_LDG001SelectMetPbokWaitMbhList_DIDT iMbhWaitList = new MET_PBOK_MBH_CRTF_MNG_LDG001SelectMetPbokWaitMbhList_DIDT();
			iMbhWaitList.setMetMngNo(input.getMetMngNo()); // 모임관리번호
			iMbhWaitList.setMetMbhStcd(input.getMetMbhStcd()); // 모임회원상태코드
			iMbhWaitList.setMetMbhDscd(input.getMetMbhDscd()); // 모임회원구분코드 - [1]모임장/[2]모임원

			/*
			 * @BXMType ComponentCall 모임통장.회원.관리.컴포넌트 모임통장.대기.회원.목록.조회
			 */
			// com.skbank.sml.fns.mpb.com.MPBMetPbokMbhMng_COM
			List<MET_PBOK_MBH_CRTF_MNG_LDG001SelectMetPbokWaitMbhList_DODT> oMbhWaitList = mPBMetPbokMbhMng_COM.selectMetPbokWaitMbhList(iMbhWaitList);
			boolean isFirst = true;
			outDataList = new ArrayList<>();
			for (MET_PBOK_MBH_CRTF_MNG_LDG001SelectMetPbokWaitMbhList_DODT oMbhWaitListData : oMbhWaitList) {
				outData = new MPBMetPbokMbhWaitInfGridInq_ODT();
				if (logger.isDebugEnabled()) {
					logger.debug("90190263 모임통장.대기.회원.정보.DB 조회  oMbhWaitListData {} :: ", oMbhWaitListData);
				}

				if (isFirst) {
					output.setMetMngNo(oMbhWaitListData.getMetMngNo());
					isFirst = false;
				}
				outData.setMetCrtfMbhSrno(oMbhWaitListData.getMetCrtfMbhSrno()); // 모임인증회원일련번호

				outData.setItcsno(oMbhWaitListData.getItcsno()); // 통합고객번호
				outData.setEsnsMbhNo(oMbhWaitListData.getEsnsMbhNo()); // 간편회원번호
				outData.setUtzpeNoCfcd(oMbhWaitListData.getUtzpeNoCfcd()); // 이용자번호분류코드
				outData.setMetMbhSrno(oMbhWaitListData.getMetMbhSrno());
				outData.setMetMbhNm(oMbhWaitListData.getMetMbhNm()); // 모임회원명
				outData.setMetMbhHpNo(oMbhWaitListData.getMetMbhHpNo()); // 모임회원핸드폰번호
				outData.setMetMbhStcd(oMbhWaitListData.getMetMbhStcd()); // 모임회원상태코드
				outData.setMetMbhDscd(oMbhWaitListData.getMetMbhDscd()); // 모임회원구분코드
				inqConut++;

				outDataList.add(outData);
			}

			output.setGridCnt(inqConut);
			output.setGrid(outDataList);
		}

		if (logger.isDebugEnabled()) {
			logger.debug("90190263 모임통장.대기.회원.정보.조회 SVC output {} :: ", output);
		}

		return output;

	}

	/**
	 * 모임통장의 회원정보를 조회하는 서비스
	 * 
	 * @param input 모임통장.회원.대기정보.등록.컨트롤러.입력.IO
	 * @return 모임통장.회원.대기정보.등록.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName = "모임통장.대기.회원.정보.등록", description = "모임통장의 회원정보를 조회하는 서비스 ", author = "90190263")
	public MPBMetPbokMbhMngInsertMetPbokWaitMbhInf_ODT insertMetPbokWaitMbhInf(MPBMetPbokMbhMngInsertMetPbokWaitMbhInf_IDT input) {

		/**
		 * @BXMType GetBean
		 */
		mPBMetPbokMbhMng_COM = WFApplicationContext.getBean(mPBMetPbokMbhMng_COM, MPBMetPbokMbhMng_COM.class);
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		mPBMetPbokBscMng_COM= WFApplicationContext.getBean(mPBMetPbokBscMng_COM, MPBMetPbokBscMng_COM.class);
		shrCECBypsPrvnUtil_COM = WFApplicationContext.getBean(shrCECBypsPrvnUtil_COM, SHRCECBypsPrvnUtil_COM.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		// 세션고객정보
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession();
		if (logger.isDebugEnabled()) {
			logger.debug("currentCust ====== {} ::: ", currentCust);
		}
		
		MPBMetPbokMbhMngInsertMetPbokWaitMbhInf_ODT output = new MPBMetPbokMbhMngInsertMetPbokWaitMbhInf_ODT();
		if (logger.isDebugEnabled()) {
			logger.debug("90190263 모임통장.대기.회원.정보.등록 SVC input {} :: ", input);
		}
		
		/**
		 * @BXMType IF
		 * @Desc 입력 검증 : 필수 입력 값 검증 코드
		 */
		// 로그인 체크
		if (!shrCMMLoginSession_COM.istLogin()) {
			//  로그인 세션이 존재하지 않습니다.
			throw new WFApplicationException("CMME0018");
		}
		if ( input.getMetMngNo()== null ) /**null check - 모임관리번호*/{
			throw new WFApplicationException("FNSE0005", null, new Object[]{input.getMetMngNo()});
		}
		
		if(logger.isDebugEnabled()) {
			logger.debug("90190263 모임통장.서비스등록 COM input  {} ::: ", input);
		}

		int insertCnt = 0;
		
		/**
		 * @BXMType Try
		 * 
		 */
		try {
			String sItcsno = "";
			String sEsnsMbhNo= "";
			/*
			 * 로직 추가
			 */
			//간편회원일 경우 userID, 통합고객번호 초기화
	        if( shrCMMLoginSession_COM.isEsnsMbh() == true ) {
	        	sItcsno = "";  
	        	sEsnsMbhNo = currentCust.getEsnsMbhNo();
	        } else {
	        	sItcsno = currentCust.getItcsno();
	        	sEsnsMbhNo = "";
	        }
			
	        
			MET_PBOK_MBH_CRTF_MNG_LDG001SelectMetPbokWaitMbhInf_DIDT iMbhWaitInf = new MET_PBOK_MBH_CRTF_MNG_LDG001SelectMetPbokWaitMbhInf_DIDT();
			iMbhWaitInf.setMetMngNo(input.getMetMngNo()); // 모임관리번호
			iMbhWaitInf.setItcsno(sItcsno); // 통합고객번호
			iMbhWaitInf.setEsnsMbhNo(sEsnsMbhNo); // 간편회원번호
			iMbhWaitInf.setMetMbhStcd("1"); // 모임회원상태코드 - [1]초대승인 [2]의 상태일 경우 모임회원
			
			if (logger.isDebugEnabled()) {
				logger.debug("90190263 모임통장.대기.회원.정보.등록 SVC 대기회원정보조회 iMbhWaitInf {} :: ", iMbhWaitInf);
			}
			
			/*
			 * @BXMType ComponentCall 모임통장.회원.관리.컴포넌트 모임통장.대기.회원.정보.조회
			 */
			// com.skbank.sml.fns.mpb.com.MPBMetPbokMbhMng_COM
			MET_PBOK_MBH_CRTF_MNG_LDG001SelectMetPbokWaitMbhInf_DODT oMbhWaitInf = mPBMetPbokMbhMng_COM.selectMetPbokWaitMbhInf(iMbhWaitInf);
			
			if (logger.isDebugEnabled()) {
				logger.debug("90190263 모임통장.대기.회원.정보.등록 SVC 대기회원정보조회 oMbhWaitInf {} :: ", oMbhWaitInf);
			}
			
			if( !ObjectUtils.isEmpty( oMbhWaitInf ) && ( "1".equals(oMbhWaitInf.getMetMbhStcd() ) || "2".equals(oMbhWaitInf.getMetMbhStcd() ) ))  {
				output.setRspRtcd("9999");
				output.setRspMsgTxt("이미 가입 신청 된 회원입니다.");
				return output;
			}
			
			MET_PBOK_MBH_CRTF_MNG_LDG001InsertMetPbokWaitMbhInf_DIDT iMetPbokMbhWaitInfRgs = new MET_PBOK_MBH_CRTF_MNG_LDG001InsertMetPbokWaitMbhInf_DIDT();
			
			/*
			 * 이용자번호분류코드 [0]해당사항없음/[1]전자뱅킹이용자번호/[2]통합고객번호/[3]간편회원
			 * 
			 * 통합고객번호가 잇는 고객은 당행에 거래 계좌가 한개이상 또는 계좌가 있었던 고객 해당 고객중에 비대면 거래(인터넷, 모바일) 회원가입을
			 * 하여야 전자뱅킹이용자번호가 생성
			 * 
			 * 그러므로 통합고객번호가 있어도 전자뱅킹이용자번호는 없을 수 도 있습니다. 반대로 전자뱅키이용자번호가 있는 고객은 통합고개번호가 반드시
			 * 있습니다.
			 */
	
			if( shrCMMLoginSession_COM.isEsnsMbh() == true ) {
				iMetPbokMbhWaitInfRgs.setUtzpeNoCfcd("3"); // 이용자번호분류코드
			} else {
				iMetPbokMbhWaitInfRgs.setUtzpeNoCfcd("1"); // 이용자번호분류코드
			}
			
			iMetPbokMbhWaitInfRgs.setMetMngNo(input.getMetMngNo()); // 모임관리번호
			iMetPbokMbhWaitInfRgs.setItcsno(sItcsno); // 통합고객번호
			iMetPbokMbhWaitInfRgs.setEsnsMbhNo(sEsnsMbhNo); // 간편회원번호
			iMetPbokMbhWaitInfRgs.setMetMbhSrno(input.getMetMbhSrno()); // 모임회원일련번호
			iMetPbokMbhWaitInfRgs.setMetMbhNm(currentCust.getUsnm()); // 모임회원명
			iMetPbokMbhWaitInfRgs.setMetMbhStcd(input.getMetMbhStcd()); // 모임회원상태코드
			iMetPbokMbhWaitInfRgs.setMetMbhDscd(input.getMetMbhDscd()); // 모임회원구분코드
			iMetPbokMbhWaitInfRgs.setLstDbChgId(""); // 최종DB변경ID
			iMetPbokMbhWaitInfRgs.setLstDbChgDtm(WFDateUtils.getDateTimeNow()); // 최종DB변경일시
			
			if (logger.isDebugEnabled()) {
				logger.debug("90190263 모임통장.대기.회원.정보.등록 SVC  iMetPbokMbhWaitInfRgs {} :: ", iMetPbokMbhWaitInfRgs);
			}
			
			// com.skbank.sml.fns.mpb.com.MPBMetPbokMbhMng_COM
			insertCnt = mPBMetPbokMbhMng_COM.insertMetPbokWaitMbhInf(iMetPbokMbhWaitInfRgs);

			logger.info("90190263 모임통장.대기정보.등록 SVC insertCnt :: ", insertCnt);

			if (insertCnt > 0) {
				output.setRspRtcd("0000");
				output.setRspMsgTxt("정상 처리 되었습니다.");
				
			} else {
				output.setRspRtcd("9999");
				output.setRspMsgTxt("DB 등록중 에러가 발생했습니다.");
			}
		} catch (Exception e) {
			logger.error("insertMetPbokWaitMbhInf Exception ::: {}", e);
			output.setRspRtcd("9999");
			output.setRspMsgTxt(e.getMessage());
		}

		if (insertCnt > 0 && input.getMetMbhSrno() == 0) {
			// PUSH 알림 전송
			MPBMetPbokBscMnginsertMetPbokPushNtfcSndInput_DTO iNtfcSnd = new MPBMetPbokBscMnginsertMetPbokPushNtfcSndInput_DTO();
			
			iNtfcSnd.setUmsTmplCd(SHRMPBCmmConstant.STR_RPWBCESS0132135);
			iNtfcSnd.setMetMngNo(input.getMetMngNo());
			iNtfcSnd.setMetMbhNm(currentCust.getUsnm());
			
			mPBMetPbokBscMng_COM.insertMetPbokPushNtfcSnd(iNtfcSnd);
		}
		
		return output;

	}

	/**
	 * 모임통장의 회원정보를 조회하는 서비스
	 * 
	 * @param input 모임통장.회원.대기정보.수정.컨트롤러.입력.IO
	 * @return 모임통장.회원.대기정보.수정.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName = "모임통장.대기.회원.정보.수정", description = "모임통장의 회원정보를 조회하는 서비스 ", author = "90190263")
	public MPBMetPbokMbhMngUpdateMetPbokWaitMbhInf_ODT updateMetPbokWaitMbhInf(MPBMetPbokMbhMngUpdateMetPbokWaitMbhInf_IDT input) {

		/**
		 * @BXMType GetBean
		 */
		mPBMetPbokMbhMng_COM = WFApplicationContext.getBean(mPBMetPbokMbhMng_COM, MPBMetPbokMbhMng_COM.class);
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);

		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokMbhMngUpdateMetPbokWaitMbhInf_ODT output = new MPBMetPbokMbhMngUpdateMetPbokWaitMbhInf_ODT();

		/**
		 * @BXMType IF
		 * @Desc 입력 검증 : 필수 입력 값 검증 코드를 작성 하십시오.
		 */
		if ( input.getMetMngNo()== null ) /**null check - 모임관리번호*/{
			throw new WFApplicationException("FNSE0005", null, new Object[]{input.getMetMngNo()});
		}
		else if ( input.getMetMbhStcd()== null ) /**null check - 모임회원상태코드*/{
			throw new WFApplicationException("FNSE0005", null, new Object[]{input.getMetMbhStcd()});
		}
		else if ( input.getGridCnt()== null ) /**null check - 그리드건수*/{
			throw new WFApplicationException("FNSE0005", null, new Object[]{input.getGridCnt()});
		}
		
		/**
		 * @BXMType Try
		 * 
		 */
		try {
			if (logger.isDebugEnabled()) {
				logger.debug("90190263 모임통장.대기.회원.정보.수정 SVC input {} :: ", input);
			}

			MET_PBOK_MBH_CRTF_MNG_LDG001UpdateMetPbokWaitMbhInf_DIDT iMetPbokMbhWaitInf = new MET_PBOK_MBH_CRTF_MNG_LDG001UpdateMetPbokWaitMbhInf_DIDT();
			iMetPbokMbhWaitInf.setMetMngNo(input.getMetMngNo()); // 모임관리번호
			iMetPbokMbhWaitInf.setMetMbhStcd(input.getMetMbhStcd()); // 모임회원상태코드 1:수락 2:승인 3:탈퇴, 4:거절, 5:취소

			int allUpdateCnt = 0;
			for (MPBMetPbokMbhWaitInfGridAmd_IDT iWaitMbhData : input.getGrid()) {
				iMetPbokMbhWaitInf.setMetMbhSrno(iWaitMbhData.getMetMbhSrno()); // 모임회원일련번호
				iMetPbokMbhWaitInf.setMetCrtfMbhSrno(iWaitMbhData.getMetCrtfMbhSrno()); // 모임회원인증일련번호
				iMetPbokMbhWaitInf.setItcsno(iWaitMbhData.getItcsno()); // 통합고객번호
				iMetPbokMbhWaitInf.setEsnsMbhNo(iWaitMbhData.getEsnsMbhNo()); // 간편회원
				iMetPbokMbhWaitInf.setMetMbhDscd(iWaitMbhData.getMetMbhDscd()); // 모임회원구분코드
				iMetPbokMbhWaitInf.setMetMbhHpNo(iWaitMbhData.getMetMbhHpNo()); // 모임회원휴대폰번호
				iMetPbokMbhWaitInf.setLstDbChgId(""); // 최종DB변경ID
				iMetPbokMbhWaitInf.setLstDbChgDtm(WFDateUtils.getDateTimeNow()); // 최종DB변경일시
				
				if (logger.isDebugEnabled()) {
					logger.debug("90190263 모임통장.대기.회원.정보.수정 SVC iMetPbokMbhWaitInf {} :: ", iMetPbokMbhWaitInf);
				}
				
				/*
				 * @BXMType ComponentCall 모임통장.회원.관리.컴포넌트 모임통장.대기.회원.정보.수정
				 */
				// com.skbank.sml.fns.mpb.com.MPBMetPbokMbhMng_COM
				int updateCnt = mPBMetPbokMbhMng_COM.updateMetPbokWaitMbhInf(iMetPbokMbhWaitInf);

				if (logger.isDebugEnabled()) {
					logger.debug("90190263 모임통장.대기.회원.정보.수정 SVC output {} :: ", output);
				}
				allUpdateCnt += updateCnt;
			}

			if (allUpdateCnt == input.getGrid().size()) {
				output.setRspRtcd("0000");
				output.setRspMsgTxt("정상 처리 되었습니다.");
			} else {
				output.setRspRtcd("9999");
				output.setRspMsgTxt("DB 등록중 에러가 발생했습니다.");
			}

		}catch(WFApplicationException e){
			logger.error("insertMetPbokWaitMbhInf error :: {}", e.getMessage());
			logger.error("insertMetPbokWaitMbhInf error :: {}", e);
			Object[] args = e.getArguments();
            
	        String rtcdTxt = "";
	        if(args != null && args.length>0) {
	        	rtcdTxt = args[0].toString();
			}
			
			output.setRspRtcd("9999");
			output.setRspMsgTxt(rtcdTxt);
		}catch(Exception e){
			logger.error("insertMetPbokWaitMbhInf error :: {}", e.getMessage());
			logger.error("insertMetPbokWaitMbhInf error :: {}", e);
			output.setRspRtcd("9999");
			output.setRspMsgTxt(e.getMessage());
		}
		
 
		return output;

	}

	/**
	 * 모임통장의 회원정보를 조회하는 서비스
	 * 
	 * @param input 모임통장.회원.정보.조회.컨트롤러.입력.IO
	 * @return 모임통장.회원.정보.조회.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName = "모임통장.회원.정보.조회", description = "모임통장의 회원정보를 조회하는 서비스", author = "90190263")
	public MPBMetPbokMbhMngSelectMetPbokMbhInf_ODT selectMetPbokMbhInf(MPBMetPbokMbhMngSelectMetPbokMbhInf_IDT input) {

		/**
		 * @BXMType GetBean
		 */
		mPBMetPbokMbhMng_COM = WFApplicationContext.getBean(mPBMetPbokMbhMng_COM, MPBMetPbokMbhMng_COM.class);
		mPBMetPbokBscMng_COM= WFApplicationContext.getBean(mPBMetPbokBscMng_COM, MPBMetPbokBscMng_COM.class);
		
		MPBMetPbokMbhMngSelectMetPbokMbhInf_ODT output = new MPBMetPbokMbhMngSelectMetPbokMbhInf_ODT();

		if (logger.isDebugEnabled()) {
			logger.debug("90190263 모임통장.회원.정보.조회 SVC input :: ", input);
		}
		
		/**
		 * @BXMType IF
		 * @Desc 입력 검증 : 필수 입력 값 검증 코드를 작성 하십시오.
		 */
		if ( input.getInqDis()== null ) /**null check - 조회구분*/{
			throw new WFApplicationException("FNSE0005", null, new Object[]{input.getInqDis()});
		}
		else if ( input.getMetMngNo()== null ) /**null check - 모임관리번호*/{
			throw new WFApplicationException("FNSE0005", null, new Object[]{input.getMetMngNo()});
		}
		else if ( input.getMetMbhSrno()== null ) /**null check - 모임회원일련번호*/{
			throw new WFApplicationException("FNSE0005", null, new Object[]{input.getMetMbhSrno()});
		}
		
		String nxtMetMbhAlsNm = input.getNxtMetMbhAlsNm();
		MetPbokMbhInfInq_DIDT iMetPbokMbh = new MetPbokMbhInfInq_DIDT();
		
		// 모임통장.회원.정보.목록.조회.DBM.출력.IO 
		List<MPBMetPbokMbhInfListInq_ODT> outDataList = new ArrayList<>();
		
		String errMsgTxt= "";
		String errMsgId= "";
		/**
		 * @BXMType Try
		 * 
		 */
		try{
			while( true ) {
				iMetPbokMbh = new MetPbokMbhInfInq_DIDT();
				iMetPbokMbh.setInqDis(input.getInqDis()); // 조회구분
				iMetPbokMbh.setMetMngNo(input.getMetMngNo()); // 모임관리번호
				iMetPbokMbh.setMetMbhSrno(input.getMetMbhSrno()); // 모임회원일련번호
				iMetPbokMbh.setNxtMetMbhAlsNm(nxtMetMbhAlsNm); // 다음모임회원별칭명
				
				if (logger.isDebugEnabled()) {
					logger.debug("90190263 모임통장.회원.정보.조회 SVC iMetPbokMbh  :: {} ", iMetPbokMbh);
				}
				
				MetPbokMbhInfInq_DODT oMetPbokMbh = mPBMetPbokMbhMng_COM.selectMetPbokMbhInf(iMetPbokMbh);
	
				if (logger.isDebugEnabled()) {
					logger.debug("90190263 모임통장.회원.정보.조회 SVC oMetPbokMbh  :: {}  ", oMetPbokMbh);
				}
				
				output.setMetMngNo(oMetPbokMbh.getMetMngNo()); // 모임관리번호
				output.setEbnkUtzpeNo(oMetPbokMbh.getEbnkUtzpeNo()); // 전자뱅킹이용자번호
				output.setMetCtrStcd(oMetPbokMbh.getMetCtrStcd()); // 모임계약상태코드
				output.setMetCtrStcdNm(oMetPbokMbh.getMetCtrStcdNm()); // 모임계약상태코드명
				output.setMetPbokDscd(oMetPbokMbh.getMetPbokDscd()); // 모임통장구분코드
				output.setMetPbokDscdNm(oMetPbokMbh.getMetPbokDscdNm()); // 모임통장구분코드명
				output.setMetNm(oMetPbokMbh.getMetNm()); // 모임명
				output.setRcvBkwAcno(oMetPbokMbh.getRcvBkwAcno()); // 입금전행계좌번호
				output.setEncyRcvBkwAcno(WFCryptEtcUtils.encryptBase64("IBS_0003", oMetPbokMbh.getRcvBkwAcno())); // 암호화입금전행계좌번호
				output.setCusUsgBkwAcno(oMetPbokMbh.getCusUsgBkwAcno()); // 고객사용전행계좌번호
				output.setItcsno(oMetPbokMbh.getItcsno()); // 통합고객번호
				output.setCusKorlNm(oMetPbokMbh.getCusKorlNm()); // 고객한글명
				output.setCusBkpnNm(oMetPbokMbh.getCusBkpnNm()); // 고객부기명
				output.setCtBal(oMetPbokMbh.getCtBal()); // 현재잔액
				output.setPayAvlBal(oMetPbokMbh.getPayAvlBal()); // 지급가능잔액
				output.setPdcd(oMetPbokMbh.getPdcd()); // 상품코드
				output.setPdcdKorlNm(oMetPbokMbh.getPdcdKorlNm()); // 상품코드한글명
				output.setPrdKorlAbrNm(oMetPbokMbh.getPrdKorlAbrNm()); // 상품한글단축명
				output.setRlfAcno(oMetPbokMbh.getRlfAcno()); // 안심계좌번호
				output.setMbpfPymDt(oMetPbokMbh.getMbpfPymDt()); // 회비납부일자
				output.setMbpfPymCycd(oMetPbokMbh.getMbpfPymCycd()); // 회비납부주기코드
				output.setMbpfPymCycdNm(oMetPbokMbh.getMbpfPymCycdNm()); // 회비납부주기코드명
				output.setMbpfPmtgtAm(oMetPbokMbh.getMbpfPmtgtAm()); // 회비납부대상금액
				output.setAgmdCollDt(oMetPbokMbh.getAgmdCollDt()); // 동의서징구일자
				output.setAdvpeEno(oMetPbokMbh.getAdvpeEno()); // 권유자직원번호
				output.setAsmnlApvCd(oMetPbokMbh.getAsmnlApvCd()); // 공동명의승인코드
				output.setAsmnlApvCdNm(oMetPbokMbh.getAsmnlApvCdNm()); // 공동명의승인코드명
				output.setRppeChgRgsYn(oMetPbokMbh.getRppeChgRgsYn()); // 대표자변경등록여부
				output.setRppeChgRgsDt(oMetPbokMbh.getRppeChgRgsDt()); // 대표자변경등록일자
				output.setRppeChgVldDt(oMetPbokMbh.getRppeChgVldDt()); // 대표자변경유효일자
				output.setMetDscd(oMetPbokMbh.getMetDscd()); // 모임구분코드
				output.setMetDscdNm(oMetPbokMbh.getMetDscdNm()); // 모임구분코드명
				output.setMetRgsDt(oMetPbokMbh.getMetRgsDt()); // 모임등록일자
				output.setRgsTm(oMetPbokMbh.getRgsTm()); // 등록시각
				output.setMetBscImgUrlNm(oMetPbokMbh.getMetBscImgUrlNm()); // 모임기본이미지URL명
				output.setMetMbhRgsCnt(oMetPbokMbh.getMetMbhRgsCnt()); // 모임회원등록건수
				output.setMetMbhScssCnt(oMetPbokMbh.getMetMbhScssCnt()); // 모임회원탈퇴건수
				output.setMetRprsAlsNm(oMetPbokMbh.getMetRprsAlsNm()); // 모임대표별칭명
				output.setMetRprsMbhNm(oMetPbokMbh.getMetRprsMbhNm()); // 모임대표회원명
				output.setMetRprsImgUrlNm(oMetPbokMbh.getMetRprsImgUrlNm()); // 모임대표이미지URL명
				
				MetPbokImgInfInq_DODT mbhRprsImgInfData = new MetPbokImgInfInq_DODT(); 
				if(oMetPbokMbh.getMetRprsImgUrlNm().indexOf("FNS/moim") !=-1 ) {
					// 회원의 이미지 정보 조회
					mbhRprsImgInfData  = mPBMetPbokBscMng_COM.selectMetPbokImgInf(oMetPbokMbh.getMetRprsImgUrlNm());
				}
				
				output.setMetRprsImgFileData(mbhRprsImgInfData.getFileData()); // 모임대표이미지파일데이
				output.setNxtMetMbhAlsNm(oMetPbokMbh.getNxtMetMbhAlsNm()); // 다음모임회원별칭명
				
				for( MetPbokMbhInfListInq_DODT oMbhInfData : oMetPbokMbh.getGrid() ) {
					MPBMetPbokMbhInfListInq_ODT outData = new MPBMetPbokMbhInfListInq_ODT();
					
					MetPbokImgInfInq_DODT mbhImgInfData = new MetPbokImgInfInq_DODT(); 
					// 회원이 프로필 이미지를 변경했을 경우 해당 NAS서버 경로에 이미지가 업로드 되어 있음
					//if(oMbhInfData.getMetMbhImgUrlNm().indexOf("FNS/moim/profile") !=-1 ) {
					if(oMbhInfData.getMetMbhImgUrlNm().indexOf("FNS/moim") !=-1 ) {
						// 회원의 이미지 정보 조회
						mbhImgInfData  = mPBMetPbokBscMng_COM.selectMetPbokImgInf(oMbhInfData.getMetMbhImgUrlNm());
					}
					
					outData.setMetMngNo(oMbhInfData.getMetMngNo()); // 모임관리번호
					outData.setMetMbhSrno(oMbhInfData.getMetMbhSrno()); // 모임회원일련번호
					outData.setMetMbhCtrStcd(oMbhInfData.getMetMbhCtrStcd()); // 모임회원계약상태코드
					outData.setMetMbhCtrStcdNm(oMbhInfData.getMetMbhCtrStcdNm()); // 모임회원계약상태코드명
					outData.setMetMbhDscd(oMbhInfData.getMetMbhDscd()); // 모임회원구분코드
					outData.setMetMbhDscdNm(oMbhInfData.getMetMbhDscdNm()); // 모임회원구분코드명
					outData.setUtzpeNoCfcd(oMbhInfData.getUtzpeNoCfcd()); // 이용자번호분류코드
					outData.setUtzpeNoCfcdNm(oMbhInfData.getUtzpeNoCfcdNm()); // 이용자번호분류코드명
					outData.setEbnkUtzpeNo(oMbhInfData.getEbnkUtzpeNo()); // 전자뱅킹이용자번호
					outData.setEsnsMbhNo(oMbhInfData.getEsnsMbhNo()); // 간편회원번호
					outData.setItcsno(oMbhInfData.getItcsno()); // 통합고객번호
					outData.setMetMbhAlsNm(oMbhInfData.getMetMbhAlsNm()); // 모임회원별칭명
					outData.setMetMbhNm(oMbhInfData.getMetMbhNm()); // 모임회원명
					outData.setMbpfPmtgtAm(oMbhInfData.getMbpfPmtgtAm()); // 회비납부대상금액
					outData.setAgmdCollDt(oMbhInfData.getAgmdCollDt()); // 동의서징구일자
					outData.setMetPtcpDt(oMbhInfData.getMetPtcpDt()); // 모임참여일자
					outData.setMetPtcpTm(oMbhInfData.getMetPtcpTm()); // 모임참여시각
					outData.setMetScssDt(oMbhInfData.getMetScssDt()); // 모임탈퇴일자
					outData.setMetScssTm(oMbhInfData.getMetScssTm()); // 모임탈퇴시각
					outData.setAncSndDscd(oMbhInfData.getAncSndDscd()); // 공지발송구분코드
					outData.setAncSndDscdNm(oMbhInfData.getAncSndDscdNm()); // 공지발송구분코드명
					outData.setRppeChgApvCd(oMbhInfData.getRppeChgApvCd()); // 대표자변경승인코드
					outData.setRppeChgApvCdNm(oMbhInfData.getRppeChgApvCdNm()); // 대표자변경승인코드명
					outData.setRppeChgApvDt(oMbhInfData.getRppeChgApvDt()); // 대표자변경승인일자
					outData.setMetMbhImgUrlNm(oMbhInfData.getMetMbhImgUrlNm()); // 모임회원이미지URL명
					outData.setMetMbhImgFileData(mbhImgInfData.getFileData());
					
					outDataList.add(outData);
				}
	
				// 연속조회여부
				if("Y".equals(input.getCtinInqYn())) {
					if( !"".equals( oMetPbokMbh.getNxtMetMbhAlsNm() )) { // 다음모임회원별칭명이 존재하면 
						nxtMetMbhAlsNm = oMetPbokMbh.getNxtMetMbhAlsNm();
					} else {
						break;
					}
				} else {
					break;
				}
			}
			 output.setGrid(outDataList);
			 output.setGridCnt(outDataList.size()); // 그리드건수
			 output.setRspRtcd("0000");
		}catch(Exception e){
			logger.error("insertMetPbokMbhInf 전문 error :: {}", e);
			
			if ( e instanceof WFApplicationException) {
				WFApplicationException we = (WFApplicationException) e;
				logger.error("WFApplicationException {} ", we);
				
				Object[] args = we.getArguments();
	            
				if(args != null && args.length>0) {
	            	errMsgTxt = args[0].toString();
	            	errMsgId = args[1].toString();
				} else {
					errMsgTxt = we.getMessage();
					errMsgTxt = we.getCode();
				}
				
			} else {
				logger.error("Exception {} ", e);
				errMsgTxt = e.getMessage();			
				errMsgId = "9999";
			}
			
			output.setRspRtcd(errMsgId);
			output.setRspMsgTxt(errMsgTxt);
		}
		if (logger.isDebugEnabled()) {
			logger.debug("90190263 모임통장.회원.정보.조회 SVC output :: ", output);
		}

		return output;

	}

	/**
	 * 모임통장의 회원정보를 등록 하는 서비스
	 * 
	 * @param input 모임통장.회원.정보.등록.탈퇴.컨트롤러.입력.IO
	 * @return 모임통장.회원.정보.등록.탈퇴.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName = "모임통장.회원.정보.등록", description = "모임통장의 회원정보를 등록하는 서비스", author = "90190263")
	public MPBMetPbokMbhMngInsertMetPbokMbhInf_ODT insertMetPbokMbhInf(MPBMetPbokMbhMngInsertMetPbokMbhInf_IDT input) {
		/**
		 * @BXMType GetBean
		 */
		mPBMetPbokMbhMng_COM = WFApplicationContext.getBean(mPBMetPbokMbhMng_COM, MPBMetPbokMbhMng_COM.class);
		// WFInterfaceCfg 생성 컴포넌트
		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class);
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		sHRFNSMbhSession_COM =  WFApplicationContext.getBean(sHRFNSMbhSession_COM, SHRFNSMbhSession_COM.class);
		sHRIBSMR0005767_COM = WFApplicationContext.getBean(sHRIBSMR0005767_COM, SHRIBSMR0005767_COM.class);
		mPBMetPbokBscMng_COM= WFApplicationContext.getBean(mPBMetPbokBscMng_COM, MPBMetPbokBscMng_COM.class);
		sHRAllActInqTbk_COM= WFApplicationContext.getBean(sHRAllActInqTbk_COM, SHRAllActInqTbk_COM.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */
		// 세션고객정보
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession();
		if (logger.isDebugEnabled()) {
			logger.debug("currentCust ====== {} ::: ", currentCust);
		}
		
		MPBMetPbokMbhMngInsertMetPbokMbhInf_ODT output = new MPBMetPbokMbhMngInsertMetPbokMbhInf_ODT();

		if (logger.isDebugEnabled()) {
			logger.debug("90190263 모임통장.회원.정보.등록 SVC input {} :: ", input);
		}

		/**
		 * @BXMType IF
		 * @Desc 입력 검증 : 필수 입력 값 검증 코드
		 */
		if ( currentCust== null ) /**null check*/{
			//  로그인 세션이 존재하지 않습니다.
			throw new WFApplicationException("CMME0018");
		}
	
		if ( input.getTrnDis()== null ) /**null check - 거래구분*/{
			throw new WFApplicationException("FNSE0005", null, new Object[]{input.getTrnDis()});
		}
		else if ( input.getMetMngNo()== null ) /**null check - 모임관리번호*/{
			throw new WFApplicationException("FNSE0005", null, new Object[]{input.getMetMngNo()});
		}
		else if ( input.getGrid1Cnt()== null ) /**null check - 그리드1건수*/{
			throw new WFApplicationException("FNSE0005", null, new Object[]{input.getGrid1Cnt()});
		}
		
		String errMsgTxt = "";
		String errMsgId = "";
		
		MPBMetPbokMbhMngUpdateMetPbokWaitMbhInf_ODT oWaitMbhInf = new MPBMetPbokMbhMngUpdateMetPbokWaitMbhInf_ODT(); 
		IBSMR0005767_GRID_ODT filterMetPbokMbh = new IBSMR0005767_GRID_ODT();
		/**
		 * @BXMType Try
		 * 
		 */
		try {
			
			// MCA WFInterfaceCfg 객체 획득
			WFInterfaceCfg interfaceCfg = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg();
			interfaceCfg.setInterfaceId("IBSMR0005767");

			IBSMR0005767_ODT oIBSMR0005767 = new IBSMR0005767_ODT();
			IBSMR0005767_IDT iIBSMR0005767 = new IBSMR0005767_IDT();
			iIBSMR0005767.setTrnDis(input.getTrnDis()); // 거래구분
			iIBSMR0005767.setMetMngNo(input.getMetMngNo()); // 모임관리번호

			// 모임통장.회원.정보.등록.탈퇴.입력
			// 1GRID : 회원가입
			iIBSMR0005767.setGrid1Cnt(input.getGrid1Cnt()); // 그리드1건수

			List<IBSMR0005767_DIS_1_GRID_IDT> inDataList = new ArrayList<>();

			for (MPBMetPbokMbhInfRgsScssGrid1_IDT inputGrid : input.getDis1Grid()) {
				IBSMR0005767_DIS_1_GRID_IDT inData = new IBSMR0005767_DIS_1_GRID_IDT();
				String enbkUtzpeNo = "";
				
				MET_PBOK_MBH_CRTF_MNG_LDG001SelectMetPbokWaitMbhInf_DIDT iMbhWaitInf = new MET_PBOK_MBH_CRTF_MNG_LDG001SelectMetPbokWaitMbhInf_DIDT();
				iMbhWaitInf.setMetMngNo(input.getMetMngNo()); // 모임관리번호
				iMbhWaitInf.setMetCrtfMbhSrno(inputGrid.getMetCrtfMbhSrno()); // 모임인증회원일련번호
				iMbhWaitInf.setItcsno(inputGrid.getItcsno()); // 통합고객번호
				iMbhWaitInf.setEsnsMbhNo(inputGrid.getEsnsMbhNo()); // 간편회원번호
				//iMbhWaitInf.setMetMbhHpNo(inputGrid.getMetMbhHpNo()); // 모임회원핸드폰번호
				iMbhWaitInf.setMetMbhDscd("2"); // 모임회원구분코드 - [1]모임장/[2]모임원
				iMbhWaitInf.setMetMbhStcd("1"); // 모임회원상태코드 - [1]대기
				
				MET_PBOK_MBH_CRTF_MNG_LDG001SelectMetPbokWaitMbhInf_DODT oMbhWaitInf = mPBMetPbokMbhMng_COM.selectMetPbokWaitMbhInf(iMbhWaitInf);
				
				if( ObjectUtils.isEmpty( oMbhWaitInf )  ) {
					// 대기회원이 아닐 경우 오류 발생
					throw new WFApplicationException("FNSE0006", new Object[] {"모임통장 대기회원이 아닙니다."});
				}
				
				if ("1".equals(inputGrid.getUtzpeNoCfcd())) {
					if (logger.isDebugEnabled()) {
						logger.debug("90190263 모임통장.회원.정보.등록 SVC selectItcsnoInf input {} :: ", input);
					}
					MPBItcsnoInfInq_DTO outItcsnoData = mPBMetPbokMbhMng_COM.selectItcsnoInf(inputGrid.getItcsno());
					if (logger.isDebugEnabled()) {
						logger.debug("90190263 모임통장.회원.정보.등록 SVC selectItcsnoInf outItcsnoData {} :: ", outItcsnoData);
					}
					enbkUtzpeNo = outItcsnoData.getEbnkUtzpeNo();
				}

				inData.setUtzpeNoCfcd(inputGrid.getUtzpeNoCfcd()); // 이용자번호분류코드
				inData.setEbnkUtzpeNo(enbkUtzpeNo); // 전자뱅킹이용자번호
				inData.setEsnsMbhNo(inputGrid.getEsnsMbhNo()); // 간편회원번호
				inData.setMetMbhAlsNm(inputGrid.getMetMbhAlsNm()); // 모임회원별칭명
				inData.setAgmdCollDt(inputGrid.getAgmdCollDt()); // 동의서징구일자
				inData.setAncSndDscd(inputGrid.getAncSndDscd()); // 공지발송구분코드
				inData.setMetMbhImgUrlNm(inputGrid.getMetMbhImgUrlNm()); // 모임회원이미지URL명

				inDataList.add(inData);
			}
			iIBSMR0005767.setDis1Grid(inDataList);

			WFInfResponse<IBSMR0005767_ODT> mcaOutput = sHRIBSMR0005767_COM.callTrx(iIBSMR0005767, interfaceCfg);

			oIBSMR0005767 = mcaOutput.getResponseData();

			if (logger.isDebugEnabled()) {
				logger.debug("90190263 모임통장.회원.정보.등록 SVC oIBSMR0005767 {} :: ", oIBSMR0005767);
			}

			
			/**
			 * @BXMType IF 모임통장 회원등록 및 탈퇴 성공 시 대기회원에 등록된 모임원 정보 수정
			 */

			if( !ObjectUtils.isEmpty( oIBSMR0005767 )  ) {
				List<MPBMetPbokMbhWaitInfGridAmd_IDT> iWaitMbhGrid = new ArrayList<>();
				MPBMetPbokMbhMngUpdateMetPbokWaitMbhInf_IDT iWaitMbhInf = new MPBMetPbokMbhMngUpdateMetPbokWaitMbhInf_IDT();
				iWaitMbhInf.setMetMngNo(input.getMetMngNo()); // 모임관리번호
				iWaitMbhInf.setMetMbhStcd("2");// 모임회원상태코드 [2] 승인
	
				for (MPBMetPbokMbhInfRgsScssGrid1_IDT iMetPbokMbh : input.getDis1Grid()) {
					filterMetPbokMbh = new IBSMR0005767_GRID_ODT();
					MPBMetPbokMbhWaitInfGridAmd_IDT iWaitMbhGridData = new MPBMetPbokMbhWaitInfGridAmd_IDT();
					
					if (logger.isDebugEnabled()) {
						logger.debug("90190263 모임통장.회원.정보.등록 SVC iMetPbokMbh {} :: ", iMetPbokMbh);
					}
					
					/* 이용자번호분류코드 [0]해당사항없음/[1]전자뱅킹이용자번호/[2]통합고객번호/[3]간편회원
					 * 
					 * 통합고객번호가 잇는 고객은 당행에 거래 계좌가 한개이상 또는 계좌가 있었던 고객 해당 고객중에 비대면 거래(인터넷, 모바일) 회원가입을
					 * 하여야 전자뱅킹이용자번호가 생성
					 * 
					 * 그러므로 통합고객번호가 있어도 전자뱅킹이용자번호는 없을 수 도 있습니다. 반대로 전자뱅키이용자번호가 있는 고객은 통합고개번호가 반드시
					 * 있습니다.
					 */
					// 이용자번호 분류코드 [1] 전자뱅킹이용자번호 / [2] 통합고객번호 / [3] 간편회원번호
					if ("1".equals(iMetPbokMbh.getUtzpeNoCfcd())) {
						filterMetPbokMbh = oIBSMR0005767.getGrid().stream()
																					.filter(item -> iMetPbokMbh.getItcsno().equals(item.getItcsno()) )
																					.findFirst().orElseThrow(() -> new IllegalArgumentException());		
					} else if ("3".equals(iMetPbokMbh.getUtzpeNoCfcd())) {
						filterMetPbokMbh = oIBSMR0005767.getGrid().stream()
																					.filter(item -> iMetPbokMbh.getEsnsMbhNo().equals(item.getEsnsMbhNo()) )
																					.findFirst().orElseThrow(() -> new IllegalArgumentException());
					}
	
					if (logger.isDebugEnabled()) {
						logger.debug("90190263 모임통장.회원.정보.등록 SVC filterMetPbokMbh {} :: ", filterMetPbokMbh);
					}
					
					iWaitMbhGridData.setEsnsMbhNo(filterMetPbokMbh.getEsnsMbhNo()); // 간편회원번호
					iWaitMbhGridData.setItcsno(filterMetPbokMbh.getItcsno()); // 통합고객번호
					iWaitMbhGridData.setMetCrtfMbhSrno(iMetPbokMbh.getMetCrtfMbhSrno()); // 모임회원인증일련번호
	
					iWaitMbhGridData.setMetMbhSrno(filterMetPbokMbh.getMetMbhSrno());// 모임회원일련번호
					iWaitMbhGridData.setMetMbhDscd(filterMetPbokMbh.getMetMbhDscd()); // 모임회원구분코드
					iWaitMbhGridData.setUtzpeNoCfcd(iMetPbokMbh.getUtzpeNoCfcd()); // 이용자번호분류코드
					
					iWaitMbhGrid.add(iWaitMbhGridData);
					
					iWaitMbhInf.setGridCnt(iWaitMbhGrid.size());
					iWaitMbhInf.setGrid(iWaitMbhGrid);
	
					if (logger.isDebugEnabled()) {
						logger.debug("90190263 모임통장.대기.회원.정보.수정 승인 updateMetPbokWaitMbhInf iWaitMbhInf {} :: ", iWaitMbhInf);
					}
	
					oWaitMbhInf = this.updateMetPbokWaitMbhInf(iWaitMbhInf);
	
					if (logger.isDebugEnabled()) {
						logger.debug("90190263 모임통장.대기.회원.정보.수정 승인 SVC updateMetPbokWaitMbhInf oWaitMbhInf {} :: ", oWaitMbhInf);
					}
					
					if (!"0000".equals(oWaitMbhInf.getRspRtcd())) {
						return output;
					}
	
					output.setTrnDis(oIBSMR0005767.getTrnDis()); // 거래구분
					output.setTrnDisNm(oIBSMR0005767.getTrnDisNm()); // 거래구분명
					output.setMetMngNo(oIBSMR0005767.getMetMngNo()); // 모임관리번호
					output.setEbnkUtzpeNo(oIBSMR0005767.getEbnkUtzpeNo()); // 전자뱅킹이용자번호
					output.setMetCtrStcd(oIBSMR0005767.getMetCtrStcd()); // 모임계약상태코드
					output.setMetCtrStcdNm(oIBSMR0005767.getMetCtrStcdNm()); // 모임계약상태코드명
					output.setMetPbokDscd(oIBSMR0005767.getMetPbokDscd()); // 모임통장구분코드
					output.setMetPbokDscdNm(oIBSMR0005767.getMetPbokDscdNm()); // 모임통장구분코드명
					output.setMetNm(oIBSMR0005767.getMetNm()); // 모임명
					output.setRcvBkwAcno(oIBSMR0005767.getRcvBkwAcno()); // 입금전행계좌번호
					output.setRlfAcno(oIBSMR0005767.getRlfAcno()); // 안심계좌번호
					output.setMbpfPymDt(oIBSMR0005767.getMbpfPymDt()); // 회비납부일자
					output.setMbpfPymCycd(oIBSMR0005767.getMbpfPymCycd()); // 회비납부주기코드
					output.setMbpfPymCycdNm(oIBSMR0005767.getMbpfPymCycdNm()); // 회비납부주기코드명
					output.setMbpfPmtgtAm(oIBSMR0005767.getMbpfPmtgtAm()); // 회비납부대상금액
					output.setAgmdCollDt(oIBSMR0005767.getAgmdCollDt()); // 동의서징구일자
					output.setAdvpeEno(oIBSMR0005767.getAdvpeEno()); // 권유자직원번호
					output.setAsmnlApvCd(oIBSMR0005767.getAsmnlApvCd()); // 공동명의승인코드
					output.setAsmnlApvCdNm(oIBSMR0005767.getAsmnlApvCdNm()); // 공동명의승인코드명
					output.setRppeChgRgsYn(oIBSMR0005767.getRppeChgRgsYn()); // 대표자변경등록여부
					output.setRppeChgRgsDt(oIBSMR0005767.getRppeChgRgsDt()); // 대표자변경등록일자
					output.setRppeChgVldDt(oIBSMR0005767.getRppeChgVldDt()); // 대표자변경유효일자
					output.setMetDscd(oIBSMR0005767.getMetDscd()); // 모임구분코드
					output.setMetDscdNm(oIBSMR0005767.getMetDscdNm()); // 모임구분코드명
					output.setMetRgsDt(oIBSMR0005767.getMetRgsDt()); // 모임등록일자
					output.setRgsTm(oIBSMR0005767.getRgsTm()); // 등록시각
					output.setCusUsgBkwAcno(oIBSMR0005767.getCusUsgBkwAcno()); // 고객사용전행계좌번호
					output.setMetBscImgUrlNm(oIBSMR0005767.getMetBscImgUrlNm()); // 모임기본이미지URL명
					output.setGridCnt(oIBSMR0005767.getGridCnt()); // 그리드건수
	
					List<MPBMetPbokMbhInfRgsScssGrid_ODT> outDataGrid = new ArrayList<>();
					for (IBSMR0005767_GRID_ODT oIBSMR0005767Grid : oIBSMR0005767.getGrid()) {
						MPBMetPbokMbhInfRgsScssGrid_ODT outData = new MPBMetPbokMbhInfRgsScssGrid_ODT();
						
						outData.setMetMbhSrno(oIBSMR0005767Grid.getMetMbhSrno()); // 모임회원일련번호
						outData.setMetMbhCtrStcd(oIBSMR0005767Grid.getMetMbhCtrStcd()); // 모임회원계약상태코드
						outData.setMetMbhCtrStcdNm(oIBSMR0005767Grid.getMetMbhCtrStcdNm()); // 모임회원계약상태코드명
						outData.setMetMbhDscd(oIBSMR0005767Grid.getMetMbhDscd()); // 모임회원구분코드
						outData.setMetMbhDscdNm(oIBSMR0005767Grid.getMetMbhDscdNm()); // 모임회원구분코드명
						outData.setUtzpeNoCfcd(oIBSMR0005767Grid.getUtzpeNoCfcd()); // 이용자번호분류코드
						outData.setUtzpeNoCfcdNm(oIBSMR0005767Grid.getUtzpeNoCfcdNm()); // 이용자번호분류코드
						outData.setEbnkUtzpeNo(oIBSMR0005767Grid.getEbnkUtzpeNo()); // 전자뱅킹이용자번호
						outData.setEsnsMbhNo(oIBSMR0005767Grid.getEsnsMbhNo()); // 간편회원번호
						outData.setItcsno(oIBSMR0005767Grid.getItcsno()); // 통합고객번호
						outData.setMetMbhNm(oIBSMR0005767Grid.getMetMbhNm()); // 모임회원명
						outData.setMetMbhAlsNm(oIBSMR0005767Grid.getMetMbhAlsNm()); // 모임회원별칭명
						outData.setMbpfPmtgtAm(oIBSMR0005767Grid.getMbpfPmtgtAm()); // 회비납부대상금액
						outData.setAgmdCollDt(oIBSMR0005767Grid.getAgmdCollDt()); // 동의서징구일자
						outData.setMetPtcpDt(oIBSMR0005767Grid.getMetPtcpDt()); // 모임참여일자
						outData.setMetPtcpTm(oIBSMR0005767Grid.getMetPtcpTm()); // 모임참여시각
						outData.setMetScssDt(oIBSMR0005767Grid.getMetScssDt()); // 모임탈퇴일자
						outData.setMetScssTm(oIBSMR0005767Grid.getMetScssTm()); // 모임탈퇴시각
						outData.setAncSndDscd(oIBSMR0005767Grid.getAncSndDscd()); // 공지발송구분코드
						outData.setAncSndDscdNm(oIBSMR0005767Grid.getAncSndDscdNm()); // 공지발송구분코드명
						outData.setRppeChgApvCd(oIBSMR0005767Grid.getRppeChgApvCd()); // 대표자변경승인코드
						outData.setRppeChgApvCdNm(oIBSMR0005767Grid.getRppeChgApvCdNm()); // 대표자변경승인코드명
						outData.setRppeChgApvDt(oIBSMR0005767Grid.getRppeChgApvDt()); // 대표자변경승인일자
						outData.setMetMbhImgUrlNm(oIBSMR0005767Grid.getMetMbhImgUrlNm()); // 모임회원이미지URL명
						
						outDataGrid.add(outData);
					}
					output.setGrid(outDataGrid);

					if ("0000".equals(oWaitMbhInf.getRspRtcd())) {
						// PUSH 알림 전송
						MPBMetPbokBscMnginsertMetPbokPushNtfcSndInput_DTO iNtfcSnd = new MPBMetPbokBscMnginsertMetPbokPushNtfcSndInput_DTO();
						
						iNtfcSnd.setUmsTmplCd(SHRMPBCmmConstant.STR_RPWBCESS0132176);
						iNtfcSnd.setMetMngNo(input.getMetMngNo());
						iNtfcSnd.setMetMbhSrno(filterMetPbokMbh.getMetMbhSrno());
						
						mPBMetPbokBscMng_COM.insertMetPbokPushNtfcSnd(iNtfcSnd);
					}
					
				}
				
				// 계좌리스트 재조회
				sHRAllActInqTbk_COM.selectSessActList(SHRBSCInquiryConstant.BSC_ACT_LIST_INQ_DIS_ALL, true);
				
//				// 모임통장 회원정보 세션 셋팅
//				FNS_MBH_INFO fnsMbhInfo = new FNS_MBH_INFO();
//				fnsMbhInfo.setMetJnngYn("Y");
//				sHRFNSMbhSession_COM.setFNSMbhInfoSession(fnsMbhInfo);				
			}
		}catch(Exception e){
			logger.error("insertMetPbokMbhInf 전문 error :: {}", e);
			
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

				Object[] args = we.getArguments();
				
	            if(args != null && args.length>0) {
	            	errMsgTxt = args[0].toString();
	            	errMsgId = args[1].toString();
				}else {
					errMsgId = we.getCode();
					errMsgTxt = we.getMessage();
				}
			} else {
				logger.error("Exception {} ", e);
				errMsgId = "9999";
				errMsgTxt = e.getMessage();				
			}
			
			throw new WFApplicationException("FNSE0006", null, new Object[] {errMsgId, errMsgTxt});
		}

		if (logger.isDebugEnabled()) {
			logger.debug("90190263 모임통장.회원.정보.등록 COM output {} :: ", output);
		}

		return output;

	}

	/**
	 * 모임통장의 멤버를 끊는 기능을 하는 서비스
	 * 
	 * 
	 * @param input 모임통장.회원.탈퇴.컨트롤러.입력.IO
	 * @return 모임통장.회원.탈퇴.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName = "모임통장.회원.탈퇴.수정", description = "모임통장의 멤버 탈퇴 기능을 하는 서비스", author = "90190263")
	public MPBMetPbokMbhMngUpdateMetPbokMbhScss_ODT updateMetPbokMbhScss(MPBMetPbokMbhMngUpdateMetPbokMbhScss_IDT input) {

		/**
		 * @BXMType GetBean
		 */
		mPBMetPbokMbhMng_COM = WFApplicationContext.getBean(mPBMetPbokMbhMng_COM, MPBMetPbokMbhMng_COM.class);
		// WFInterfaceCfg 생성 컴포넌트
		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class);
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		sHRIBSMR0005767_COM = WFApplicationContext.getBean(sHRIBSMR0005767_COM, SHRIBSMR0005767_COM.class);
		sHRIBSMR0005769_COM= WFApplicationContext.getBean(sHRIBSMR0005769_COM, SHRIBSMR0005769_COM.class);
		sHRFNSMbhSession_COM =  WFApplicationContext.getBean(sHRFNSMbhSession_COM, SHRFNSMbhSession_COM.class);
		mPBMetPbokBscMng_COM= WFApplicationContext.getBean(mPBMetPbokBscMng_COM, MPBMetPbokBscMng_COM.class);
		sHRAllActInqTbk_COM= WFApplicationContext.getBean(sHRAllActInqTbk_COM, SHRAllActInqTbk_COM.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */
		// 세션고객정보
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession();
		if (logger.isDebugEnabled()) {
			logger.debug("currentCust ====== {} ::: ", currentCust);
		}

		MPBMetPbokMbhMngUpdateMetPbokMbhScss_ODT output = new MPBMetPbokMbhMngUpdateMetPbokMbhScss_ODT();

		if (logger.isDebugEnabled()) {
			logger.debug("90190263 모임통장.회원.탈퇴.수정 SVC input {} :: ", input);
		}


		/**
		 * @BXMType IF
		 * @Desc 입력 검증 : 필수 입력 값 검증 코드
		 */
		if ( currentCust== null ) /**null check*/{
			//  로그인 세션이 존재하지 않습니다.
			throw new WFApplicationException("CMME0018");
		}
		
		/**
		 * @BXMType IF
		 * @Desc 입력 검증 : 필수 입력 값 검증 코드를 작성 하십시오.
		 */
		if ( input.getTrnDis()== null ) /**null check - 거래구분*/{
			throw new WFApplicationException("FNSE0005", null, new Object[]{input.getTrnDis()});
		}
		else if ( input.getMetMngNo()== null ) /**null check - 모임관리번호*/{
			throw new WFApplicationException("FNSE0005", null, new Object[]{input.getMetMngNo()});
		}
		else if ( input.getGrid2Cnt()== null ) /**null check - 그리드2건수*/{
			throw new WFApplicationException("FNSE0005", null, new Object[]{input.getGrid2Cnt()});
		}
		
		String errMsgTxt = "";
		String errMsgId = "";
		String metMbhAlsNm = "";
		
		int metMbhSrno = 0;
		int updateCnt = 0;
		
		/**
		 * @BXMType Try
		 * 
		 */
		try {
			MPBMetPbokMbhMngSelectMetPbokMbhInf_ODT oMetPbokMbh = new MPBMetPbokMbhMngSelectMetPbokMbhInf_ODT();
			
			if("Y".equals(input.getAlmbScssYn())) {
				String nxtMetMbhAlsNm = "";
				MPBMetPbokMbhMngSelectMetPbokMbhInf_IDT iMetPbokMbh = new MPBMetPbokMbhMngSelectMetPbokMbhInf_IDT();
				
				iMetPbokMbh.setInqDis( "03" ); // 조회구분
				iMetPbokMbh.setMetMngNo(input.getMetMngNo()); // 모임관리번호
				iMetPbokMbh.setNxtMetMbhAlsNm(nxtMetMbhAlsNm); // 다음모임회원별칭명
				iMetPbokMbh.setCtinInqYn("Y"); // 연속조회여부
				
				oMetPbokMbh = this.selectMetPbokMbhInf(iMetPbokMbh);
			}
			
			// MCA WFInterfaceCfg 객체 획득
			WFInterfaceCfg interfaceCfg = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg();
			interfaceCfg.setInterfaceId("IBSMR0005767");

			/*
			 * 로직 추가
			 */
			 // WFNciHeader 셋팅
            WFNciHeader wfnciHeader = interfaceCfg.getNciHeader();
            
			//간편회원일 경우 userID, 통합고객번호 초기화
	        if( shrCMMLoginSession_COM.isEsnsMbh() == true ) {
	        	wfnciHeader.setEbnkUtzpeNo("");
	            wfnciHeader.setItcsno("");  
	        }
	        
            // interfaceCfg 셋팅
            interfaceCfg.setNciHeader(wfnciHeader);   
            
			IBSMR0005767_ODT oIBSMR0005767 = new IBSMR0005767_ODT();
			IBSMR0005767_IDT iIBSMR0005767 = new IBSMR0005767_IDT();
			iIBSMR0005767.setTrnDis(input.getTrnDis()); // 거래구분
			iIBSMR0005767.setMetMngNo(input.getMetMngNo()); // 모임관리번호

			// 모임통장.회원.정보.등록.탈퇴.입력
			// 탈퇴회원
			iIBSMR0005767.setGrid2Cnt(input.getGrid2Cnt()); // 그리드2건수

			List<IBSMR0005767_DIS_2_GRID_IDT> inDataList2 = new ArrayList<>();
			
			// 전체 모임원 탈퇴
			if("Y".equals(input.getAlmbScssYn())) {
				for (MPBMetPbokMbhInfListInq_ODT inputGrid2 : oMetPbokMbh.getGrid()) {
					IBSMR0005767_DIS_2_GRID_IDT inData2 = new IBSMR0005767_DIS_2_GRID_IDT();
					inData2.setMetMbhSrno(inputGrid2.getMetMbhSrno()); // 모임회원일련번호
	
					inDataList2.add(inData2);
				}
			} else {
				for (MPBMetPbokMbhInfRgsScssGrid2_IDT inputGrid2 : input.getDis2Grid()) {
					IBSMR0005767_DIS_2_GRID_IDT inData2 = new IBSMR0005767_DIS_2_GRID_IDT();
					inData2.setMetMbhSrno(inputGrid2.getMetMbhSrno()); // 모임회원일련번호
					metMbhSrno = inputGrid2.getMetMbhSrno();
					inDataList2.add(inData2);
				}
			}
			iIBSMR0005767.setDis2Grid(inDataList2);
			
			if (logger.isDebugEnabled()) {
				logger.debug("90190263 모임통장.회원.탈퇴.수정 COM iIBSMR0005767 {} :: ", iIBSMR0005767);
			}
			
			WFInfResponse<IBSMR0005767_ODT> mcaOutput = sHRIBSMR0005767_COM.callTrx(iIBSMR0005767, interfaceCfg);

			oIBSMR0005767 = mcaOutput.getResponseData();

			if (logger.isDebugEnabled()) {
				logger.debug("90190263 모임통장.회원.탈퇴.수정 COM oIBSMR0005767 {} :: ", oIBSMR0005767);
			}
			
			if(!"Y".equals(input.getAlmbScssYn())) {
				for(IBSMR0005767_GRID_ODT filterOutGrid : oIBSMR0005767.getGrid() ) {
					if(filterOutGrid.getMetMbhSrno() == metMbhSrno) {
						metMbhAlsNm = filterOutGrid.getMetMbhAlsNm();
						
						break;
					}
				}
			
			}
			
			MET_PBOK_MBH_CRTF_MNG_LDG001UpdateMetPbokMbhScss_DIDT iMbhScssInf = new MET_PBOK_MBH_CRTF_MNG_LDG001UpdateMetPbokMbhScss_DIDT();
			iMbhScssInf.setMetMngNo(input.getMetMngNo()); // 모임관리번호
			iMbhScssInf.setMetMbhStcd("3");// 모임회원상태코드 [3] 탈퇴
			
			
			for (MPBMetPbokMbhInfRgsScssGrid2_IDT iMetPbokMbh : input.getDis2Grid()) {
				iMbhScssInf.setMetMbhSrno(iMetPbokMbh.getMetMbhSrno());// 모임회원일련번호
				iMbhScssInf.setLstDbChgId(""); // 최종DB변경ID
				iMbhScssInf.setLstDbChgDtm(WFDateUtils.getDateTimeNow()); // 최종DB변경일시

				if (logger.isDebugEnabled()) {
					logger.debug("90190263 모임통장.회원.탈퇴.수정 iMbhScssInf {} :: ", iMbhScssInf);
				}

				updateCnt = mPBMetPbokMbhMng_COM.updateMetPbokMbhScss(iMbhScssInf);

				if (logger.isDebugEnabled()) {
					logger.debug("90190263 모임통장.회원.탈퇴.수정 updateCnt {} :: ", updateCnt);
				}
				
				if (updateCnt <= 0) {
					return output;
				} 
			}

			/**
			 * @BXMType IF 모임통장 회원등록 및 탈퇴
			 */
			output.setTrnDis(oIBSMR0005767.getTrnDis()); // 거래구분
			output.setTrnDisNm(oIBSMR0005767.getTrnDisNm()); // 거래구분명
			output.setMetMngNo(oIBSMR0005767.getMetMngNo()); // 모임관리번호
			output.setEbnkUtzpeNo(oIBSMR0005767.getEbnkUtzpeNo()); // 전자뱅킹이용자번호
			output.setMetCtrStcd(oIBSMR0005767.getMetCtrStcd()); // 모임계약상태코드
			output.setMetCtrStcdNm(oIBSMR0005767.getMetCtrStcdNm()); // 모임계약상태코드명
			output.setMetPbokDscd(oIBSMR0005767.getMetPbokDscd()); // 모임통장구분코드
			output.setMetPbokDscdNm(oIBSMR0005767.getMetPbokDscdNm()); // 모임통장구분코드명
			output.setMetNm(oIBSMR0005767.getMetNm()); // 모임명
			output.setRcvBkwAcno(oIBSMR0005767.getRcvBkwAcno()); // 입금전행계좌번호
			output.setRlfAcno(oIBSMR0005767.getRlfAcno()); // 안심계좌번호
			output.setMbpfPymDt(oIBSMR0005767.getMbpfPymDt()); // 회비납부일자
			output.setMbpfPymCycd(oIBSMR0005767.getMbpfPymCycd()); // 회비납부주기코드
			output.setMbpfPymCycdNm(oIBSMR0005767.getMbpfPymCycdNm()); // 회비납부주기코드명
			output.setMbpfPmtgtAm(oIBSMR0005767.getMbpfPmtgtAm()); // 회비납부대상금액
			output.setAgmdCollDt(oIBSMR0005767.getAgmdCollDt()); // 동의서징구일자
			output.setAdvpeEno(oIBSMR0005767.getAdvpeEno()); // 권유자직원번호
			output.setAsmnlApvCd(oIBSMR0005767.getAsmnlApvCd()); // 공동명의승인코드
			output.setAsmnlApvCdNm(oIBSMR0005767.getAsmnlApvCdNm()); // 공동명의승인코드명
			output.setRppeChgRgsYn(oIBSMR0005767.getRppeChgRgsYn()); // 대표자변경등록여부
			output.setRppeChgRgsDt(oIBSMR0005767.getRppeChgRgsDt()); // 대표자변경등록일자
			output.setRppeChgVldDt(oIBSMR0005767.getRppeChgVldDt()); // 대표자변경유효일자
			output.setMetDscd(oIBSMR0005767.getMetDscd()); // 모임구분코드
			output.setMetDscdNm(oIBSMR0005767.getMetDscdNm()); // 모임구분코드명
			output.setMetRgsDt(oIBSMR0005767.getMetRgsDt()); // 모임등록일자
			output.setRgsTm(oIBSMR0005767.getRgsTm()); // 등록시각
			output.setCusUsgBkwAcno(oIBSMR0005767.getCusUsgBkwAcno()); // 고객사용전행계좌번호
			output.setMetBscImgUrlNm(oIBSMR0005767.getMetBscImgUrlNm()); // 모임기본이미지URL명

			output.setGridCnt(oIBSMR0005767.getGridCnt()); // 그리드건수

			List<MPBMetPbokMbhInfRgsScssGrid_ODT> outDataGrid = new ArrayList<>();
			for (IBSMR0005767_GRID_ODT oIBSMR0005767Grid : oIBSMR0005767.getGrid()) {
				MPBMetPbokMbhInfRgsScssGrid_ODT outData = new MPBMetPbokMbhInfRgsScssGrid_ODT();

				outData.setMetMbhSrno(oIBSMR0005767Grid.getMetMbhSrno()); // 모임회원일련번호
				outData.setMetMbhCtrStcd(oIBSMR0005767Grid.getMetMbhCtrStcd()); // 모임회원계약상태코드
				outData.setMetMbhCtrStcdNm(oIBSMR0005767Grid.getMetMbhCtrStcdNm()); // 모임회원계약상태코드명
				outData.setMetMbhDscd(oIBSMR0005767Grid.getMetMbhDscd()); // 모임회원구분코드
				outData.setMetMbhDscdNm(oIBSMR0005767Grid.getMetMbhDscdNm()); // 모임회원구분코드명
				outData.setUtzpeNoCfcd(oIBSMR0005767Grid.getUtzpeNoCfcd()); // 이용자번호분류코드
				outData.setUtzpeNoCfcdNm(oIBSMR0005767Grid.getUtzpeNoCfcdNm()); // 이용자번호분류코드명
				outData.setEbnkUtzpeNo(oIBSMR0005767Grid.getEbnkUtzpeNo()); // 전자뱅킹이용자번호
				outData.setEsnsMbhNo(oIBSMR0005767Grid.getEsnsMbhNo()); // 간편회원번호
				outData.setItcsno(oIBSMR0005767Grid.getItcsno()); // 통합고객번호
				outData.setMetMbhNm(oIBSMR0005767Grid.getMetMbhNm()); // 모임회원명
				outData.setMetMbhAlsNm(oIBSMR0005767Grid.getMetMbhAlsNm()); // 모임회원별칭명
				outData.setMbpfPmtgtAm(oIBSMR0005767Grid.getMbpfPmtgtAm()); // 회비납부대상금액
				outData.setAgmdCollDt(oIBSMR0005767Grid.getAgmdCollDt()); // 동의서징구일자
				outData.setMetPtcpDt(oIBSMR0005767Grid.getMetPtcpDt()); // 모임참여일자
				outData.setMetPtcpTm(oIBSMR0005767Grid.getMetPtcpTm()); // 모임참여시각
				outData.setMetScssDt(oIBSMR0005767Grid.getMetScssDt()); // 모임탈퇴일자
				outData.setMetScssTm(oIBSMR0005767Grid.getMetScssTm()); // 모임탈퇴시각
				outData.setAncSndDscd(oIBSMR0005767Grid.getAncSndDscd()); // 공지발송구분코드
				outData.setAncSndDscdNm(oIBSMR0005767Grid.getAncSndDscdNm()); // 공지발송구분코드명
				outData.setRppeChgApvCd(oIBSMR0005767Grid.getRppeChgApvCd()); // 대표자변경승인코드
				outData.setRppeChgApvCdNm(oIBSMR0005767Grid.getRppeChgApvCdNm()); // 대표자변경승인코드명
				outData.setRppeChgApvDt(oIBSMR0005767Grid.getRppeChgApvDt()); // 대표자변경승인일자
				outData.setMetMbhImgUrlNm(oIBSMR0005767Grid.getMetMbhImgUrlNm()); // 모임회원이미지URL명
				
				outDataGrid.add(outData);
			}
			output.setGrid(outDataGrid);
			
			//  MCA WFInterfaceCfg 객체 획득
			interfaceCfg.setInterfaceId("IBSMR0005769");
			
	        IBSMR0005769_IDT iIBSMR0005769 = new IBSMR0005769_IDT();
	        iIBSMR0005769.setInqDis("01"); // 조회구분
	        iIBSMR0005769.setMetMngNo(""); // 모임관리번호
	        iIBSMR0005769.setNxtMetMngNo(""); // 다음모임관리번호
	        
	        if(logger.isDebugEnabled()) {
				logger.debug("90190263 모임통장.가입.정보 .모임통장.기본정보.조회 SVC iIBSMR0005769 {} ::: ", iIBSMR0005769);
			}
			
	        IBSMR0005769_ODT oIBSMR0005769= new IBSMR0005769_ODT();
	        
			WFInfResponse<IBSMR0005769_ODT> mcaOutput2 = sHRIBSMR0005769_COM.callTrx(iIBSMR0005769, interfaceCfg);
	
			oIBSMR0005769 = mcaOutput2.getResponseData();
			
			/**
			 * @BXMType IF
			 * 정상 조회 처리여부
			 */
			if(oIBSMR0005769.getGrid().size() == 0) {
				// 모임통장 회원정보 세션 셋팅
				FNS_MBH_INFO fnsMbhInfo = new FNS_MBH_INFO();
				fnsMbhInfo.setMetJnngYn("N");
				sHRFNSMbhSession_COM.setFNSMbhInfoSession(fnsMbhInfo);
				
			}
			// 계좌리스트 재조회
			sHRAllActInqTbk_COM.selectSessActList(SHRBSCInquiryConstant.BSC_ACT_LIST_INQ_DIS_ALL, true);
			
		}catch(Exception e){
			logger.debug("updateMetPbokMbhScss  오류 e : [{}] ",e);
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

				Object[] args = we.getArguments();
				
	            if(args != null && args.length>0) {
	            	errMsgTxt = args[0].toString();
	            	errMsgId = args[1].toString();
				}else {
					errMsgId = we.getCode();
					errMsgTxt = we.getMessage();
				}
			} else {
				logger.error("Exception {} ", e);
				errMsgId = "9999";
				errMsgTxt = e.getMessage();				
			}
			
			throw new WFApplicationException("FNSE0006", null, new Object[] {errMsgId, errMsgTxt});
			
		}

		if(!"Y".equals( input.getAlmbScssYn() ) && updateCnt > 0 ) {
			// PUSH 알림 전송
			MPBMetPbokBscMnginsertMetPbokPushNtfcSndInput_DTO iNtfcSnd = new MPBMetPbokBscMnginsertMetPbokPushNtfcSndInput_DTO();
			
			iNtfcSnd.setUmsTmplCd(SHRMPBCmmConstant.STR_RPWBCESS0132122);
			iNtfcSnd.setMetMngNo(input.getMetMngNo());
			iNtfcSnd.setMetMbhNm(metMbhAlsNm);
			
			mPBMetPbokBscMng_COM.insertMetPbokPushNtfcSnd(iNtfcSnd);
		}
		
		/**
		 * @BXMType IF 모임통장 회원정보 등록 결과
		 */
		if (logger.isDebugEnabled()) {
			logger.debug("90190263 모임통장.회원.탈퇴.수정 COM output {} :: ", output);
		}

		return output;

	}

	/**
	 * 모임통장의 모임장(대표)를 변경 요청 등록하는 서비스
	 * 
	 * @param input 모임통장.대표.변경.등록.컨트롤러.입력.IO
	 * @return 모임통장.대표.변경.등록.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName = "모임통장.대표.변경.요청.등록", description = "모임통장의 모임장(대표)를 변경 요청 등록하는 서비스", author = "90190263")
	public MPBMetPbokMbhMngInsertMetPbokRprsChg_ODT insertMetPbokRprsChg(MPBMetPbokMbhMngInsertMetPbokRprsChg_IDT input) {

		/** 
		 * @BXMType GetBean
		 */
		sHRIBSMR0005776_COM = WFApplicationContext.getBean(sHRIBSMR0005776_COM, SHRIBSMR0005776_COM.class);
		// WFInterfaceCfg 생성 컴포넌트
		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class);
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		mPBMetPbokBscMng_COM= WFApplicationContext.getBean(mPBMetPbokBscMng_COM, MPBMetPbokBscMng_COM.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */
		// 세션고객정보
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession();
		if (logger.isDebugEnabled()) {
			logger.debug("currentCust ====== {} ::: ", currentCust);
		}

		MPBMetPbokMbhMngInsertMetPbokRprsChg_ODT output = new MPBMetPbokMbhMngInsertMetPbokRprsChg_ODT();

		/**
		 * @BXMType IF
		 * @Desc 입력 검증 : 필수 입력 값 검증 코드
		 */
		if ( currentCust== null ) /**null check*/{
			//  로그인 세션이 존재하지 않습니다.
			throw new WFApplicationException("CMME0018");
		}
	
		if ( input.getRgsRvkDscd()== null ) /**null check - 등록해제구분코드*/{
			throw new WFApplicationException("FNSE0005", null, new Object[]{input.getRgsRvkDscd()});
		}
		else if ( input.getMetMngNo()== null ) /**null check - 모임관리번호*/{
			throw new WFApplicationException("FNSE0005", null, new Object[]{input.getMetMngNo()});
		}
		else if ( input.getChgRppeMetMbhSrno()== null ) /**null check - 변경대표자모임회원일련번호*/{
			throw new WFApplicationException("FNSE0005", null, new Object[]{input.getChgRppeMetMbhSrno()});
		}
		
		
		/**
		 * 연계시스템 호출 TYPE : MCA ID : IBSMR0005776 NM :모임통장 대표자 변경 요청
		 */
		if (logger.isDebugEnabled()) {
			logger.debug("90190263 모임통장.대표.변경.요청 COM input {} :: ", input);
		}
		IBSMR0005776_ODT oIBSMR0005776 = new IBSMR0005776_ODT();
		
		String errMsgTxt = "";
		String errMsgId = "";
		/**
		 * @BXMType Try
		 * 
		 */
		try {
			// MCA WFInterfaceCfg 객체 획득
			WFInterfaceCfg interfaceCfg = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg();
			interfaceCfg.setInterfaceId("IBSMR0005776");

			IBSMR0005776_IDT iIBSMR0005776 = new IBSMR0005776_IDT();
			iIBSMR0005776.setRgsRvkDscd(input.getRgsRvkDscd()); // 등록해제구분코드
			iIBSMR0005776.setMetMngNo(input.getMetMngNo()); // 모임관리번호
			iIBSMR0005776.setChgRppeMetMbhSrno(input.getChgRppeMetMbhSrno()); // 변경대표자모임회원일련번호

			WFInfResponse<IBSMR0005776_ODT> mcaOutput = sHRIBSMR0005776_COM.callTrx(iIBSMR0005776, interfaceCfg);

			oIBSMR0005776 = mcaOutput.getResponseData();

			if (logger.isDebugEnabled()) {
				logger.debug("90190263 모임통장.대표.변경.요청 oIBSMR0005776 {} :: ", oIBSMR0005776);
			}
			
			output.setRgsRvkDscd(oIBSMR0005776.getRgsRvkDscd()); // 등록해제구분코드
			output.setRgsRvkDscdNm(oIBSMR0005776.getRgsRvkDscdNm()); // 등록해제구분코드명
			output.setMetMngNo(oIBSMR0005776.getMetMngNo()); // 모임관리번호
			output.setEbnkUtzpeNo(oIBSMR0005776.getEbnkUtzpeNo()); // 전자뱅킹이용자번호
			output.setMetCtrStcd(oIBSMR0005776.getMetCtrStcd()); // 모임계약상태코드
			output.setMetCtrStcdNm(oIBSMR0005776.getMetCtrStcdNm()); // 모임계약상태코드명
			output.setMetPbokDscd(oIBSMR0005776.getMetPbokDscd()); // 모임통장구분코드
			output.setMetPbokDscdNm(oIBSMR0005776.getMetPbokDscdNm()); // 모임통장구분코드명
			output.setMetNm(oIBSMR0005776.getMetNm()); // 모임명
			output.setRcvBkwAcno(oIBSMR0005776.getRcvBkwAcno()); // 입금전행계좌번호
			output.setRlfAcno(oIBSMR0005776.getRlfAcno()); // 안심계좌번호
			output.setMbpfPymDt(oIBSMR0005776.getMbpfPymDt()); // 회비납부일자
			output.setMbpfPymCycd(oIBSMR0005776.getMbpfPymCycd()); // 회비납부주기코드
			output.setMbpfPymCycdNm(oIBSMR0005776.getMbpfPymCycdNm()); // 회비납부주기코드명
			output.setMbpfPmtgtAm(oIBSMR0005776.getMbpfPmtgtAm()); // 회비납부대상금액
			output.setAgmdCollDt(oIBSMR0005776.getAgmdCollDt()); // 동의서징구일자
			output.setAdvpeEno(oIBSMR0005776.getAdvpeEno()); // 권유자직원번호
			output.setAsmnlApvCd(oIBSMR0005776.getAsmnlApvCd()); // 공동명의승인코드
			output.setAsmnlApvCdNm(oIBSMR0005776.getAsmnlApvCdNm()); // 공동명의승인코드명
			output.setRppeChgRgsYn(oIBSMR0005776.getRppeChgRgsYn()); // 대표자변경등록여부
			output.setRppeChgRgsDt(oIBSMR0005776.getRppeChgRgsDt()); // 대표자변경등록일자
			output.setRppeChgVldDt(oIBSMR0005776.getRppeChgVldDt()); // 대표자변경유효일자
			output.setMetDscd(oIBSMR0005776.getMetDscd()); // 모임구분코드
			output.setMetDscdNm(oIBSMR0005776.getMetDscdNm()); // 모임구분코드명
			output.setMetRgsDt(oIBSMR0005776.getMetRgsDt()); // 모임등록일자
			output.setRgsTm(oIBSMR0005776.getRgsTm()); // 등록시각
			output.setCusUsgBkwAcno(oIBSMR0005776.getCusUsgBkwAcno()); // 고객사용전행계좌번호
			output.setMetBscImgUrlNm(oIBSMR0005776.getMetBscImgUrlNm()); // 모임기본이미지URL명
			
			List<MPBMetPbokRprsChgGrid_ODT> outDataGrid = new ArrayList<>();
			for (IBSMR0005776_GRID_ODT oRprsChgData : oIBSMR0005776.getGrid()) {
				MPBMetPbokRprsChgGrid_ODT outData = new MPBMetPbokRprsChgGrid_ODT();
				outData.setMetMbhSrno(oRprsChgData.getMetMbhSrno()); // 모임회원일련번호
				outData.setMetMbhCtrStcd(oRprsChgData.getMetMbhCtrStcd()); // 모임회원계약상태코드
				outData.setMetMbhCtrStcdNm(oRprsChgData.getMetMbhCtrStcdNm()); // 모임회원계약상태코드명
				outData.setMetMbhDscd(oRprsChgData.getMetMbhDscd()); // 모임회원구분코드
				outData.setMetMbhDscdNm(oRprsChgData.getMetMbhDscdNm()); // 모임회원구분코드명
				outData.setUtzpeNoCfcd(oRprsChgData.getUtzpeNoCfcd()); // 이용자번호분류코드
				outData.setUtzpeNoCfcdNm(oRprsChgData.getUtzpeNoCfcdNm()); // 이용자번호분류코드명
				outData.setEbnkUtzpeNo(oRprsChgData.getEbnkUtzpeNo()); // 전자뱅킹이용자번호
				outData.setEsnsMbhNo(oRprsChgData.getEsnsMbhNo()); // 간편회원번호
				outData.setItcsno(oRprsChgData.getItcsno()); // 통합고객번호
				outData.setMetMbhNm(oRprsChgData.getMetMbhNm()); // 모임회원명
				outData.setMetMbhAlsNm(oRprsChgData.getMetMbhAlsNm()); // 모임회원별칭명
				outData.setMbpfPmtgtAm(oRprsChgData.getMbpfPmtgtAm()); // 회비납부대상금액
				outData.setAgmdCollDt(oRprsChgData.getAgmdCollDt()); // 동의서징구일자
				outData.setMetPtcpDt(oRprsChgData.getMetPtcpDt()); // 모임참여일자
				outData.setMetPtcpTm(oRprsChgData.getMetPtcpTm()); // 모임참여시각
				outData.setMetScssDt(oRprsChgData.getMetScssDt()); // 모임탈퇴일자
				outData.setMetScssTm(oRprsChgData.getMetScssTm()); // 모임탈퇴시각
				outData.setAncSndDscd(oRprsChgData.getAncSndDscd()); // 공지발송구분코드
				outData.setAncSndDscdNm(oRprsChgData.getAncSndDscdNm()); // 공지발송구분코드명
				outData.setRppeChgApvCd(oRprsChgData.getRppeChgApvCd()); // 대표자변경승인코드
				outData.setRppeChgApvCdNm(oRprsChgData.getRppeChgApvCdNm()); // 대표자변경승인코드명
				outData.setRppeChgApvDt(oRprsChgData.getRppeChgApvDt()); // 대표자변경승인일자
				outData.setMetMbhImgUrlNm(oRprsChgData.getMetMbhImgUrlNm()); // 모임회원이미지URL명
				
				outDataGrid.add(outData);
			}

			output.setGridCnt(oIBSMR0005776.getGridCnt()); // 그리드건수
			output.setGrid(outDataGrid);
			
		}catch(Exception e){
			logger.debug("insertMetPbokRprsChgReq  오류 e : [{}] ",e);
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

				Object[] args = we.getArguments();
				
	            if(args != null && args.length>0) {
	            	errMsgTxt = args[0].toString();
	            	errMsgId = args[1].toString();
				}else {
					errMsgId = we.getCode();
					errMsgTxt = we.getMessage();
				}
			} else {
				logger.error("Exception {} ", e);
				errMsgId = "9999";
				errMsgTxt = e.getMessage();				
			}
			
			throw new WFApplicationException("FNSE0006", null, new Object[] {errMsgId, errMsgTxt});
		}

		if("1".equals( input.getRgsRvkDscd())) {
			// PUSH 알림 전송
			MPBMetPbokBscMnginsertMetPbokPushNtfcSndInput_DTO iNtfcSnd = new MPBMetPbokBscMnginsertMetPbokPushNtfcSndInput_DTO();
			
			iNtfcSnd.setUmsTmplCd(SHRMPBCmmConstant.STR_RPWBCESS0132127);
			iNtfcSnd.setMetMngNo(input.getMetMngNo());
			
			mPBMetPbokBscMng_COM.insertMetPbokPushNtfcSnd(iNtfcSnd);
		}
		
		if (logger.isDebugEnabled()) {
			logger.debug("90190263 모임통장.대표.변경.요청 COM output :: ", output);
		}

		return output;

	}

	/**
	 * 모임통장의 모임장(대표) 변경에 모임원이 동의 하는 서비스
	 * 
	 * @param input 모임통장.대표.변경.동의.수정.컨트롤러.입력.IO
	 * @return 모임통장.대표.변경.동의.수정.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName = "모임통장.대표.변경.동의.수정", description = "모임통장의 모임장(대표)를 변경을 동의 수정하는 서비스", author = "90190263")
	public MPBMetPbokMbhMngUpdateMetPbokRprsChgAgr_ODT updateMetPbokRprsChgAgr(MPBMetPbokMbhMngUpdateMetPbokRprsChgAgr_IDT input) {

		/**
		 * @BXMType GetBean
		 */
		sHRIBSMR0005778_COM = WFApplicationContext.getBean(sHRIBSMR0005778_COM, SHRIBSMR0005778_COM.class);
		// WFInterfaceCfg 생성 컴포넌트
		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class);
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		mPBMetPbokBscMng_COM= WFApplicationContext.getBean(mPBMetPbokBscMng_COM, MPBMetPbokBscMng_COM.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */
		// 세션고객정보
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession();
		if (logger.isDebugEnabled()) {
			logger.debug("currentCust ====== {} ::: ", currentCust);
		}

		MPBMetPbokMbhMngUpdateMetPbokRprsChgAgr_ODT output = new MPBMetPbokMbhMngUpdateMetPbokRprsChgAgr_ODT();
		
		if (logger.isDebugEnabled()) {
			logger.debug("90190263 모임통장.대표.변경.동의 input {} :: ", input);
		}
		
		/**
		 * @BXMType IF
		 * @Desc 입력 검증 : 필수 입력 값 검증 코드
		 */
		if ( currentCust== null ) /**null check*/{
			//  로그인 세션이 존재하지 않습니다.
			throw new WFApplicationException("CMME0018");
		}
		if ( input.getMetMngNo()== null ) /**null check - 모임관리번호*/{
			throw new WFApplicationException("FNSE0005", null, new Object[]{input.getMetMngNo()});
		}
		else if ( input.getMetMbhSrno()== null ) /**null check - 모임회원일련번호*/{
			throw new WFApplicationException("FNSE0005", null, new Object[]{input.getMetMbhSrno()});
		}
		else if ( input.getRppeChgApvCd()== null ) /**null check - 대표자변경승인코드*/{
			throw new WFApplicationException("FNSE0005", null, new Object[]{input.getRppeChgApvCd()});
		}
		
		boolean allMbhAgree = false;
		String errMsgTxt = "";
		String errMsgId = "";
		
		MPBMetPbokMbhInfListInq_ODT filterCcrpeMbh = new MPBMetPbokMbhInfListInq_ODT(); 
		/**
		 * @BXMType Try
		 * 
		 */
		try {
			// MCA WFInterfaceCfg 객체 획득
			WFInterfaceCfg interfaceCfg = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg();
			interfaceCfg.setInterfaceId("IBSMR0005778");

			IBSMR0005778_ODT oIBSMR0005778 = new IBSMR0005778_ODT();
			IBSMR0005778_IDT iIBSMR0005778 = new IBSMR0005778_IDT();
			
			iIBSMR0005778.setMetMngNo(input.getMetMngNo()); // 모임관리번호
			iIBSMR0005778.setMetMbhSrno(input.getMetMbhSrno()); // 모임회원일련번호
			iIBSMR0005778.setRppeChgApvCd(input.getRppeChgApvCd()); // 대표자변경승인코드
	
			
			if (logger.isDebugEnabled()) {
				logger.debug("90190263 모임통장.대표.변경.동의 iIBSMR0005778 {} :: ", iIBSMR0005778);
			}
			
			WFInfResponse<IBSMR0005778_ODT> mcaOutput = sHRIBSMR0005778_COM.callTrx(iIBSMR0005778, interfaceCfg);

			oIBSMR0005778 = mcaOutput.getResponseData();
			
			if (logger.isDebugEnabled()) {
				logger.debug("90190263 모임통장.대표.변경.동의 oIBSMR0005778 {} :: ", oIBSMR0005778);
			}
			
			output.setMetChgDscd(oIBSMR0005778.getMetChgDscd()); // 모임변경구분코드
			output.setMetChgDscdNm(oIBSMR0005778.getMetChgDscd()); // 모임변경구분코드명
			output.setMetMngNo(oIBSMR0005778.getMetMngNo()); // 모임관리번호
			output.setEbnkUtzpeNo(oIBSMR0005778.getEbnkUtzpeNo()); // 전자뱅킹이용자번호
			output.setMetCtrStcd(oIBSMR0005778.getMetCtrStcd()); // 모임계약상태코드
			output.setMetCtrStcdNm(oIBSMR0005778.getMetCtrStcdNm()); // 모임계약상태코드명
			output.setMetPbokDscd(oIBSMR0005778.getMetPbokDscd()); // 모임통장구분코드
			output.setMetPbokDscdNm(oIBSMR0005778.getMetPbokDscdNm()); // 모임통장구분코드명
			output.setMetNm(oIBSMR0005778.getMetNm()); // 모임명
			output.setRcvBkwAcno(oIBSMR0005778.getRcvBkwAcno()); // 입금전행계좌번호
			output.setRlfAcno(oIBSMR0005778.getRlfAcno()); // 안심계좌번호
			output.setMbpfPymDt(oIBSMR0005778.getMbpfPymDt()); // 회비납부일자
			output.setMbpfPymCycd(oIBSMR0005778.getMbpfPymCycd()); // 회비납부주기코드
			output.setMbpfPymCycdNm(oIBSMR0005778.getMbpfPymCycdNm()); // 회비납부주기코드명
			output.setMbpfPmtgtAm(oIBSMR0005778.getMbpfPmtgtAm()); // 회비납부대상금액
			output.setAgmdCollDt(oIBSMR0005778.getAgmdCollDt()); // 동의서징구일자
			output.setAdvpeEno(oIBSMR0005778.getAdvpeEno()); // 권유자직원번호
			output.setAsmnlApvCd(oIBSMR0005778.getAsmnlApvCd()); // 공동명의승인코드
			output.setAsmnlApvCdNm(oIBSMR0005778.getAsmnlApvCdNm()); // 공동명의승인코드명
			output.setRppeChgRgsYn(oIBSMR0005778.getRppeChgRgsYn()); // 대표자변경등록여부
			output.setRppeChgRgsDt(oIBSMR0005778.getRppeChgRgsDt()); // 대표자변경등록일자
			output.setRppeChgVldDt(oIBSMR0005778.getRppeChgVldDt()); // 대표자변경유효일자
			output.setMetDscd(oIBSMR0005778.getMetDscd()); // 모임구분코드
			output.setMetDscdNm(oIBSMR0005778.getMetDscdNm()); // 모임구분코드명
			output.setMetRgsDt(oIBSMR0005778.getMetRgsDt()); // 모임등록일자
			output.setRgsTm(oIBSMR0005778.getRgsTm()); // 등록시각
			output.setCusUsgBkwAcno(oIBSMR0005778.getCusUsgBkwAcno()); // 고객사용전행계좌번호
			output.setMetBscImgUrlNm(oIBSMR0005778.getMetBscImgUrlNm()); // 모임기본이미지URL명

			// 모임통장.대표.변경.요청.GRID
			output.setGridCnt(oIBSMR0005778.getGridCnt()); // 그리드건수
			
			List<MPBMetPbokRprsChgGrid_ODT> outList = new ArrayList<>(); 
			for(IBSMR0005778_GRID_ODT oRprsChgAgr : oIBSMR0005778.getGrid()) {
				MPBMetPbokRprsChgGrid_ODT outData = new MPBMetPbokRprsChgGrid_ODT();
				outData.setMetMbhSrno(oRprsChgAgr.getMetMbhSrno()); // 모임회원일련번호
				outData.setMetMbhCtrStcd(oRprsChgAgr.getMetMbhCtrStcd()); // 모임회원계약상태코드
				outData.setMetMbhCtrStcdNm(oRprsChgAgr.getMetMbhCtrStcdNm()); // 모임회원계약상태코드명
				outData.setMetMbhDscd(oRprsChgAgr.getMetMbhDscd()); // 모임회원구분코드
				outData.setMetMbhDscdNm(oRprsChgAgr.getMetMbhDscdNm()); // 모임회원구분코드명
				outData.setUtzpeNoCfcd(oRprsChgAgr.getUtzpeNoCfcd()); // 이용자번호분류코드
				outData.setUtzpeNoCfcdNm(oRprsChgAgr.getUtzpeNoCfcdNm()); // 이용자번호분류코드명
				outData.setEbnkUtzpeNo(oRprsChgAgr.getEbnkUtzpeNo()); // 전자뱅킹이용자번호
				outData.setEsnsMbhNo(oRprsChgAgr.getEsnsMbhNo()); // 간편회원번호
				outData.setItcsno(oRprsChgAgr.getItcsno()); // 통합고객번호
				outData.setMetMbhNm(oRprsChgAgr.getMetMbhNm()); // 모임회원명
				outData.setMetMbhAlsNm(oRprsChgAgr.getMetMbhAlsNm()); // 모임회원별칭명
				outData.setMbpfPmtgtAm(oRprsChgAgr.getMbpfPmtgtAm()); // 회비납부대상금액
				outData.setAgmdCollDt(oRprsChgAgr.getAgmdCollDt()); // 동의서징구일자
				outData.setMetPtcpDt(oRprsChgAgr.getMetPtcpDt()); // 모임참여일자
				outData.setMetPtcpTm(oRprsChgAgr.getMetPtcpTm()); // 모임참여시각
				outData.setMetScssDt(oRprsChgAgr.getMetScssDt()); // 모임탈퇴일자
				outData.setMetScssTm(oRprsChgAgr.getMetScssTm()); // 모임탈퇴시각
				outData.setAncSndDscd(oRprsChgAgr.getAncSndDscd()); // 공지발송구분코드
				outData.setAncSndDscdNm(oRprsChgAgr.getAncSndDscdNm()); // 공지발송구분코드명
				outData.setRppeChgApvCd(oRprsChgAgr.getRppeChgApvCd()); // 대표자변경승인코드
				outData.setRppeChgApvCdNm(oRprsChgAgr.getRppeChgApvCdNm()); // 대표자변경승인코드명
				outData.setRppeChgApvDt(oRprsChgAgr.getRppeChgApvDt()); // 대표자변경승인일자
				outData.setMetMbhImgUrlNm(oRprsChgAgr.getMetMbhImgUrlNm()); // 모임회원이미지URL명
			
				outList.add(outData);
			}
			
			output.setGrid(outList);
			
			if(output.getGrid().size() > 0) {
				MPBMetPbokMbhMngSelectMetPbokMbhInf_IDT iMbhInf = new MPBMetPbokMbhMngSelectMetPbokMbhInf_IDT();
				iMbhInf.setInqDis("03");	//[03] 모임관리번호별 목록조회 / [04] 모임회원별 상세조회
				iMbhInf.setMetMngNo(input.getMetMngNo());
				iMbhInf.setCtinInqYn("Y");
				
				if (logger.isDebugEnabled()) {
					logger.debug("90190263 모임통장.대표.변경.동의 SVC 회원목록조회 iMbhInf :: {} ", iMbhInf);
				}
				
				MPBMetPbokMbhMngSelectMetPbokMbhInf_ODT oMbhInf = this.selectMetPbokMbhInf(iMbhInf);
				
				if (logger.isDebugEnabled()) {
					logger.debug("90190263 모임통장.대표.변경.동의 SVC 회원목록조회 iMbhInf :: {} ", iMbhInf);
				}
				
				int allMbhCnt = oMbhInf.getGridCnt();
				
				// 차기 모임장 정보 
				filterCcrpeMbh =oMbhInf.getGrid().stream()
															 .filter(item -> "2".equals(item.getRppeChgApvCd()) )
														     .findFirst().orElseThrow(() -> new IllegalArgumentException());
															 
				// 모임장 변경 동의 회원 List
				List<MPBMetPbokMbhInfListInq_ODT> filterAgrreMbhList = oMbhInf.getGrid().stream()
																													 .filter(item -> "1".equals(item.getRppeChgApvCd()))
																													 .collect(Collectors.toList());
				
				if (logger.isDebugEnabled()) {
					logger.debug("90190263 모임통장.대표.변경.동의 SVC 동의 회원 필터링 filterAgrreMbhList :: {} ", filterAgrreMbhList);
				}
				
				if(filterAgrreMbhList.size() == allMbhCnt) {
					// 전체 회원이 동의 했을 경우
					allMbhAgree = true;
				} 
			}
			
			if (logger.isDebugEnabled()) {
				logger.debug("90190263 모임통장.대표.변경.동의 output {} :: ", output);
			}
		}catch(Exception e){
			logger.debug("updateMetPbokRprsChgAgr  오류 e : [{}] ",e);
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

				Object[] args = we.getArguments();
				
	            if(args != null && args.length>0) {
	            	errMsgTxt = args[0].toString();
	            	errMsgId = args[1].toString();
				}else {
					errMsgId = we.getCode();
					errMsgTxt = we.getMessage();
				}
			} else {
				logger.error("Exception {} ", e);
				errMsgId = "9999";
				errMsgTxt = e.getMessage();				
			}
			
			throw new WFApplicationException("FNSE0006", null, new Object[] {errMsgId, errMsgTxt});
		}
		
		if(allMbhAgree) {
			// PUSH 알림 전송
			MPBMetPbokBscMnginsertMetPbokPushNtfcSndInput_DTO iNtfcSnd = new MPBMetPbokBscMnginsertMetPbokPushNtfcSndInput_DTO();
			
			iNtfcSnd.setUmsTmplCd(SHRMPBCmmConstant.STR_RPWBCESS0132130);
			iNtfcSnd.setMetMngNo(input.getMetMngNo());
			iNtfcSnd.setMetMbhSrno(filterCcrpeMbh.getMetMbhSrno());
			
			mPBMetPbokBscMng_COM.insertMetPbokPushNtfcSnd(iNtfcSnd);
		}
		
		return output;

	}

	/**
	 * 모임통장의 변경될 모임원이 최종적으로 변경 확인 처리하는 서비스
	 * 
	 * @param input 모임통장.대표.변경.확인.수정.컨트롤러.입력.IO
	 * @return 모임통장.대표.변경.확인.수정.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName = "모임통장.대표.변경.승인.수정", description = "모임통장의 모임장(대표)를 최종 변경 수정하는 서비스", author = "90190263")
	public MPBMetPbokMbhMngUpdateMetPbokRprsChgApv_ODT updateMetPbokRprsChgApv(MPBMetPbokMbhMngUpdateMetPbokRprsChgApv_IDT input) {

		/**
		 * @BXMType GetBean
		 */
		sHRIBSMR0005779_COM = WFApplicationContext.getBean(sHRIBSMR0005779_COM, SHRIBSMR0005779_COM.class);
		// WFInterfaceCfg 생성 컴포넌트
		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class);
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		shrCECBypsPrvnUtil_COM = WFApplicationContext.getBean(shrCECBypsPrvnUtil_COM, SHRCECBypsPrvnUtil_COM.class);
		mPBMetPbokMbhMng_COM = WFApplicationContext.getBean(mPBMetPbokMbhMng_COM, MPBMetPbokMbhMng_COM.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */
		// 세션고객정보
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession();
		if (logger.isDebugEnabled()) {
			logger.debug("currentCust ====== {} ::: ", currentCust);
		}

		MPBMetPbokMbhMngUpdateMetPbokRprsChgApv_ODT output = new MPBMetPbokMbhMngUpdateMetPbokRprsChgApv_ODT();

		/**
		 * 연계시스템 호출 TYPE : MCA ID : IBSMR0005779 NM :모임통장 대표자변경 승인
		 */
		if (logger.isDebugEnabled()) {
			logger.debug("90190263 모임통장 대표자변경 승인 COM input {} :: ", input);
		}
		
		/**
		 * @BXMType IF
		 * @Desc 입력 검증 : 필수 입력 값 검증 코드
		 */
		// 로그인 체크
		if (!shrCMMLoginSession_COM.istLogin()) {
			//  로그인 세션이 존재하지 않습니다.
			throw new WFApplicationException("CMME0018");
		}
		
		/**
		 * @BXMType IF
		 * @Desc 입력 검증 : 필수 입력 값 검증 코드를 작성 하십시오.
		 */
		if ( input.getMetMngNo()== null ) /**null check - 모임관리번호 */{
			throw new WFApplicationException("FNSE0005", null, new Object[]{input.getMetMngNo()});
		}
		else if ( input.getRcvBkwAcno()== null ) /**null check - 입금전행계좌번호*/{
			throw new WFApplicationException("FNSE0005", null, new Object[]{input.getRcvBkwAcno()});
		}
		else if ( input.getRppeChgApvCd()== null ) /**null check - 대표자변경승인코드*/{
			throw new WFApplicationException("FNSE0005", null, new Object[]{input.getRppeChgApvCd()});
		}
		
		String errMsgTxt = "";
		String errMsgId = "";
		
		/**
		 * @BXMType Try
		 * 
		 */
		try {
			// MCA WFInterfaceCfg 객체 획득
			WFInterfaceCfg interfaceCfg = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg();
			interfaceCfg.setInterfaceId("IBSMR0005779");

			IBSMR0005779_ODT oIBSMR0005779 = new IBSMR0005779_ODT();
			IBSMR0005779_IDT iIBSMR0005779 = new IBSMR0005779_IDT();

			iIBSMR0005779.setRppeChgApvCd(input.getRppeChgApvCd()); // 모임장변경승인코드
			iIBSMR0005779.setMetMngNo(input.getMetMngNo()); // 모임관리번호
			iIBSMR0005779.setRcvBkwAcno(input.getRcvBkwAcno()); // 입금전행계좌번호	
			
			if (logger.isDebugEnabled()) {
				logger.debug("90190263 모임통장.대표.변경.승인.수정 iIBSMR0005779 {} :: ", iIBSMR0005779);
			}
			
			WFInfResponse<IBSMR0005779_ODT> mcaOutput = sHRIBSMR0005779_COM.callTrx(iIBSMR0005779, interfaceCfg);

			oIBSMR0005779 = mcaOutput.getResponseData();
			
			if (logger.isDebugEnabled()) {
				logger.debug("90190263 모임통장.대표.변경.승인.수정 oIBSMR0005779 {} :: ", oIBSMR0005779);
			}
			
			output.setMetChgDscd(oIBSMR0005779.getMetChgDscd()); // 모임변경구분코드
			output.setMetChgDscdNm(oIBSMR0005779.getMetChgDscdNm()); // 모임변경구분코드명
			output.setMetMngNo(oIBSMR0005779.getMetMngNo()); // 모임관리번호
			output.setEbnkUtzpeNo(oIBSMR0005779.getEbnkUtzpeNo()); // 전자뱅킹이용자번호
			output.setMetCtrStcd(oIBSMR0005779.getMetCtrStcd()); // 모임계약상태코드
			output.setMetCtrStcdNm(oIBSMR0005779.getMetCtrStcdNm()); // 모임계약상태코드명
			output.setMetPbokDscd(oIBSMR0005779.getMetPbokDscd()); // 모임통장구분코드
			output.setMetPbokDscdNm(oIBSMR0005779.getMetPbokDscdNm()); // 모임통장구분코드명
			output.setMetNm(oIBSMR0005779.getMetNm()); // 모임명
			output.setRcvBkwAcno(oIBSMR0005779.getRcvBkwAcno()); // 입금전행계좌번호
			output.setRlfAcno(oIBSMR0005779.getRlfAcno()); // 안심계좌번호
			output.setMbpfPymDt(oIBSMR0005779.getMbpfPymDt()); // 회비납부일자
			output.setMbpfPymCycd(oIBSMR0005779.getMbpfPymCycd()); // 회비납부주기코드
			output.setMbpfPymCycdNm(oIBSMR0005779.getMbpfPymCycdNm()); // 회비납부주기코드명
			output.setMbpfPmtgtAm(oIBSMR0005779.getMbpfPmtgtAm()); // 회비납부대상금액
			output.setAgmdCollDt(oIBSMR0005779.getAgmdCollDt()); // 동의서징구일자
			output.setAdvpeEno(oIBSMR0005779.getAdvpeEno()); // 권유자직원번호
			output.setAsmnlApvCd(oIBSMR0005779.getAsmnlApvCd()); // 공동명의승인코드
			output.setAsmnlApvCdNm(oIBSMR0005779.getAsmnlApvCdNm()); // 공동명의승인코드명
			output.setRppeChgRgsYn(oIBSMR0005779.getRppeChgRgsYn()); // 대표자변경등록여부
			output.setRppeChgRgsDt(oIBSMR0005779.getRppeChgRgsDt()); // 대표자변경등록일자
			output.setRppeChgVldDt(oIBSMR0005779.getRppeChgVldDt()); // 대표자변경유효일자
			output.setMetDscd(oIBSMR0005779.getMetDscd()); // 모임구분코드
			output.setMetDscdNm(oIBSMR0005779.getMetDscdNm()); // 모임구분코드명
			output.setMetRgsDt(oIBSMR0005779.getMetRgsDt()); // 모임등록일자
			output.setRgsTm(oIBSMR0005779.getRgsTm()); // 등록시각
			output.setCusUsgBkwAcno(oIBSMR0005779.getCusUsgBkwAcno()); // 고객사용전행계좌번호
			output.setMetBscImgUrlNm(oIBSMR0005779.getMetBscImgUrlNm()); // 모임기본이미지URL명
			
			MET_PBOK_MBH_CRTF_MNG_LDG001UpdateMetPbokWaitMbhRppeInf_DIDT iMetPbokMbhWaitRppeInf = new MET_PBOK_MBH_CRTF_MNG_LDG001UpdateMetPbokWaitMbhRppeInf_DIDT();
			
			String metMbhStcd = "2";
			
			// 모임통장대표변경그리드
			List<MPBMetPbokRprsChgGrid_ODT> outList = new ArrayList<>(); 
			for(IBSMR0005779_GRID_ODT oRprsChgAgr : oIBSMR0005779.getGrid()) {
				MPBMetPbokRprsChgGrid_ODT outData = new MPBMetPbokRprsChgGrid_ODT();

				/*
				 * 모임장변경 후 차기모임장이 모임장[1] 구분코드
				 */
				if( "1".equals(oRprsChgAgr.getMetMbhDscd()) ) {
					// 차기모임장 > 모임장으로 구분코드 변경
					iMetPbokMbhWaitRppeInf = new MET_PBOK_MBH_CRTF_MNG_LDG001UpdateMetPbokWaitMbhRppeInf_DIDT();
					iMetPbokMbhWaitRppeInf.setMetMngNo(input.getMetMngNo()); 					// 모임관리번호
					iMetPbokMbhWaitRppeInf.setMetMbhStcd(metMbhStcd); 							// 모임회원상태코드 1:수락 2:승인 3:탈퇴, 4:거절, 5:취소
					iMetPbokMbhWaitRppeInf.setMetMbhSrno(oRprsChgAgr.getMetMbhSrno()); 	// 모임회원일련번호
					iMetPbokMbhWaitRppeInf.setMetMbhDscd(oRprsChgAgr.getMetMbhDscd()); 	// 모임회원구분코드
					iMetPbokMbhWaitRppeInf.setLstDbChgId(""); 												// 최종DB변경ID
					iMetPbokMbhWaitRppeInf.setLstDbChgDtm(WFDateUtils.getDateTimeNow()); 	// 최종DB변경일시
						
					if (logger.isDebugEnabled()) {
						logger.debug("90190263 모임통장.대기.회원.대표자.정보.수정 SVC iMetPbokMbhWaitRppeInf {} :: ", iMetPbokMbhWaitRppeInf);
					}
					
					/*
					 * @BXMType ComponentCall 모임통장.회원.관리.컴포넌트 모임통장.대기.회원.정보.수정
					 */
					// com.skbank.sml.fns.mpb.com.MPBMetPbokMbhMng_COM
					int updateCnt = mPBMetPbokMbhMng_COM.updateMetPbokWaitMbhRppeInf(iMetPbokMbhWaitRppeInf);

					if (logger.isDebugEnabled()) {
						logger.debug("90190263 모임통장.대기.회원.대표자.정보.수정 SVC updateCnt {} :: ", updateCnt);
					}
					
				} else if("2".equals(oRprsChgAgr.getMetMbhDscd())) {
					// 모임장 > 모임원으로 구분코드 변경
					MET_PBOK_MBH_CRTF_MNG_LDG001SelectMetPbokWaitMbhInf_DIDT iMbhWaitInf = new MET_PBOK_MBH_CRTF_MNG_LDG001SelectMetPbokWaitMbhInf_DIDT();
					iMbhWaitInf.setMetMngNo(input.getMetMngNo()); // 모임관리번호
					iMbhWaitInf.setItcsno(oRprsChgAgr.getItcsno()); // 통합고객번호
					iMbhWaitInf.setEsnsMbhNo(oRprsChgAgr.getEsnsMbhNo()); // 간편회원번호
					iMbhWaitInf.setMetMbhDscd(oRprsChgAgr.getMetMbhDscd()); // 모임회원구분코드 - [1]모임장/[2]모임원
					iMbhWaitInf.setMetMbhStcd(metMbhStcd); // 모임회원상태코드

					/*
					 * @BXMType ComponentCall 모임통장.회원.관리.컴포넌트 모임통장.대기.회원.정보.조회
					 */
					// com.skbank.sml.fns.mpb.com.MPBMetPbokMbhMng_COM
					MET_PBOK_MBH_CRTF_MNG_LDG001SelectMetPbokWaitMbhInf_DODT oMbhWaitInf = mPBMetPbokMbhMng_COM.selectMetPbokWaitMbhInf(iMbhWaitInf);

					if (logger.isDebugEnabled()) {
						logger.debug("90190263 모임통장.대기.회원.정보.조회 SVC oMbhWaitInf {} :: ", oMbhWaitInf);
					}
					
					if( ObjectUtils.isEmpty(oMbhWaitInf)) {
						if (logger.isDebugEnabled()) {
							logger.debug("90190263 모임통장.대기.회원.정보.조회 SVC 회원이 아님 ! {} :: ", output);
						}
					} else {
						// 변경전의 모임장이었을 경우
						if( "1".equals(oMbhWaitInf.getMetMbhDscd()) ) {
							iMetPbokMbhWaitRppeInf = new MET_PBOK_MBH_CRTF_MNG_LDG001UpdateMetPbokWaitMbhRppeInf_DIDT();
							iMetPbokMbhWaitRppeInf.setMetMngNo(input.getMetMngNo()); 					// 모임관리번호
							iMetPbokMbhWaitRppeInf.setMetMbhStcd(metMbhStcd); 							// 모임회원상태코드 1:수락 2:승인 3:탈퇴, 4:거절, 5:취소
							iMetPbokMbhWaitRppeInf.setMetMbhSrno(oRprsChgAgr.getMetMbhSrno()); 	// 모임회원일련번호
							iMetPbokMbhWaitRppeInf.setMetMbhDscd(oRprsChgAgr.getMetMbhDscd()); 	// 모임회원구분코드
							iMetPbokMbhWaitRppeInf.setLstDbChgId(""); 												// 최종DB변경ID
							iMetPbokMbhWaitRppeInf.setLstDbChgDtm(WFDateUtils.getDateTimeNow()); 	// 최종DB변경일시
								
							if (logger.isDebugEnabled()) {
								logger.debug("90190263 모임통장.대기.회원.대표자.정보.수정 SVC iMetPbokMbhWaitRppeInf {} :: ", iMetPbokMbhWaitRppeInf);
							}
							
							/*
							 * @BXMType ComponentCall 모임통장.회원.관리.컴포넌트 모임통장.대기.회원.정보.수정
							 */
							// com.skbank.sml.fns.mpb.com.MPBMetPbokMbhMng_COM
							int updateCnt = mPBMetPbokMbhMng_COM.updateMetPbokWaitMbhRppeInf(iMetPbokMbhWaitRppeInf);

							if (logger.isDebugEnabled()) {
								logger.debug("90190263 모임통장.대기.회원.대표자.정보.수정 SVC updateCnt {} :: ", updateCnt);
							}
						}
					}
				}
				
				outData.setMetMbhSrno(oRprsChgAgr.getMetMbhSrno()); // 모임회원일련번호
				outData.setMetMbhCtrStcd(oRprsChgAgr.getMetMbhCtrStcd()); // 모임회원계약상태코드
				outData.setMetMbhCtrStcdNm(oRprsChgAgr.getMetMbhCtrStcdNm()); // 모임회원계약상태코드명
				outData.setMetMbhDscd(oRprsChgAgr.getMetMbhDscd()); // 모임회원구분코드
				outData.setMetMbhDscdNm(oRprsChgAgr.getMetMbhDscdNm()); // 모임회원구분코드명
				outData.setUtzpeNoCfcd(oRprsChgAgr.getUtzpeNoCfcd()); // 이용자번호분류코드
				outData.setUtzpeNoCfcdNm(oRprsChgAgr.getUtzpeNoCfcdNm()); // 이용자번호분류코드명
				outData.setEbnkUtzpeNo(oRprsChgAgr.getEbnkUtzpeNo()); // 전자뱅킹이용자번호
				outData.setEsnsMbhNo(oRprsChgAgr.getEsnsMbhNo()); // 간편회원번호
				outData.setItcsno(oRprsChgAgr.getItcsno()); // 통합고객번호
				outData.setMetMbhNm(oRprsChgAgr.getMetMbhNm()); // 모임회원명
				outData.setMetMbhAlsNm(oRprsChgAgr.getMetMbhAlsNm()); // 모임회원별칭명
				outData.setMbpfPmtgtAm(oRprsChgAgr.getMbpfPmtgtAm()); // 회비납부대상금액
				outData.setAgmdCollDt(oRprsChgAgr.getAgmdCollDt()); // 동의서징구일자
				outData.setMetPtcpDt(oRprsChgAgr.getMetPtcpDt()); // 모임참여일자
				outData.setMetPtcpTm(oRprsChgAgr.getMetPtcpTm()); // 모임참여시각
				outData.setMetScssDt(oRprsChgAgr.getMetScssDt()); // 모임탈퇴일자
				outData.setMetScssTm(oRprsChgAgr.getMetScssTm()); // 모임탈퇴시각
				outData.setAncSndDscd(oRprsChgAgr.getAncSndDscd()); // 공지발송구분코드
				outData.setAncSndDscdNm(oRprsChgAgr.getAncSndDscdNm()); // 공지발송구분코드명
				outData.setRppeChgApvCd(oRprsChgAgr.getRppeChgApvCd()); // 대표자변경승인코드
				outData.setRppeChgApvCdNm(oRprsChgAgr.getRppeChgApvCdNm()); // 대표자변경승인코드명
				outData.setRppeChgApvDt(oRprsChgAgr.getRppeChgApvDt()); // 대표자변경승인일자
				outData.setMetMbhImgUrlNm(oRprsChgAgr.getMetMbhImgUrlNm()); // 모임회원이미지URL명

				outList.add(outData);
			}
			
			output.setGrid(outList);
			

			if (logger.isDebugEnabled()) {
				logger.debug("90190263 모임통장.대표.변경.승인.수정 oIBSMR0005779 {} :: ", oIBSMR0005779);
			}
		}catch(Exception e){
			logger.debug("updateMetPbokRprsChgApv  오류 e : [{}] ",e);
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

				Object[] args = we.getArguments();
				
	            if(args != null && args.length>0) {
	            	errMsgTxt = args[0].toString();
	            	errMsgId = args[1].toString();
				}else {
					errMsgId = we.getCode();
					errMsgTxt = we.getMessage();
				}
			} else {
				logger.error("Exception {} ", e);
				errMsgId = "9999";
				errMsgTxt = e.getMessage();				
			}
			
			throw new WFApplicationException("FNSE0006", null, new Object[] {errMsgId, errMsgTxt});
		}
		
		return output;

	}

	/**
	 * 모임통장(커플통장)의 공동명의인의 정보를 조회하는 서비스
	 * 
	 * @param input 공동명의인.인증.정보.컨트롤러.입력.IO
	 * @return 공동명의인.인증.정보.컨트롤러.출력.IO
	 * 
	 */
	@BxmCategory(logicalName = "공동명의인.정보.수정", description = "모임통장(커플통장)의 공동명의인의 정보를 조회하는 서비스", author = "90190263")
	public MPBMetPbokMbhMngUpdateAsscNompefInf_ODT updateAsscNompefInf(MPBMetPbokMbhMngUpdateAsscNompefInf_IDT input) {

		/**
		 * @BXMType GetBean
		 */
		mPBMetPbokMbhMng_COM = WFApplicationContext.getBean(mPBMetPbokMbhMng_COM, MPBMetPbokMbhMng_COM.class);
		mPBMetPbokBscMng_COM= WFApplicationContext.getBean(mPBMetPbokBscMng_COM, MPBMetPbokBscMng_COM.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokMbhMngUpdateAsscNompefInf_ODT output = new MPBMetPbokMbhMngUpdateAsscNompefInf_ODT();

		/*
		 * 로직추가 공동명의의 회원가입 프로세스가 수정됨에 따라 일반 회원의 프로세스를 동일하게 사용할 경우 해당 메소드는 삭제 필요
		 */
		if (logger.isDebugEnabled()) {
			logger.debug("90190263 공동명의인.인증.정보.수정 SVC input  {} ::: ", input);
		}
		String errMsgTxt = "";
		String errMsgId = "";
		try {

			AsmnlRgsScss_DIDT iAsmnlRgsScss = new AsmnlRgsScss_DIDT();
			iAsmnlRgsScss.setMetChgDscd(input.getMetChgDscd()); // 모임변경구분코드
			iAsmnlRgsScss.setMetMngNo(input.getMetMngNo()); // 모임관리번호
			iAsmnlRgsScss.setMetMbhSrno(input.getMetMbhSrno()); // 모임회원일련번호
			iAsmnlRgsScss.setCanYn(input.getCanYn()); // 취소여부
			
			if (logger.isDebugEnabled()) {
				logger.debug("90190263 공동명의인.인증.정보.수정 SVC iAsmnlRgsScss  {} ::: ", iAsmnlRgsScss);
			}
			
			/*
			 * @BXMType ComponentCall 모임통장.일반.관리.컴포넌트 공동명의.등록.탈퇴
			 */
			AsmnlRgsScss_DODT oAsmnlRgsScss = mPBMetPbokMbhMng_COM.updateAsmnlRgsScss(iAsmnlRgsScss);

			if (logger.isDebugEnabled()) {
				logger.debug("90190263 공동명의인.인증.정보.수정 SVC oAsmnlRgsScss  {} ::: ", oAsmnlRgsScss);
			}
			
			output.setMetChgDscd(oAsmnlRgsScss.getMetChgDscd()); // 모임변경구분코드
			output.setMetChgDscdNm(oAsmnlRgsScss.getMetChgDscdNm()); // 모임변경구분코드명
			output.setCanYn(oAsmnlRgsScss.getCanYn()); // 취소여부
			output.setMetMngNo(oAsmnlRgsScss.getMetMngNo()); // 모임관리번호
			output.setAsmnlApvCd(oAsmnlRgsScss.getAsmnlApvCd()); // 공동명의승인코드
			output.setAsmnlApvCdNm(oAsmnlRgsScss.getAsmnlApvCdNm()); // 공동명의승인코드명
			
			
		}catch(Exception e){
			logger.debug("updateAsscNompefInf  오류 e : [{}] ",e);
			if ( e instanceof WFApplicationException) {
				WFApplicationException we = (WFApplicationException) e;
				logger.error("WFApplicationException {} ", we);

				Object[] args = we.getArguments();
				
	            if(args != null && args.length>0) {
	            	errMsgTxt = args[0].toString();
	            	errMsgId = args[1].toString();
				}else {
					errMsgId = we.getCode();
					errMsgTxt = we.getMessage();
				}
			} else {
				logger.error("Exception {} ", e);
				errMsgId = "9999";
				errMsgTxt = e.getMessage();				
			}
			
			throw new WFApplicationException("FNSE0006", null, new Object[] {errMsgId, errMsgTxt});
			
		}
		
		/**
		 * 모임변경구분코드		   								취소여부
		 *  [모임장]
		 * 모임변경 구분코드 14 (공동명의 등록 요청/취소 ) - 취소여부 N 요청, Y 취소
		 * 모임변경 구분코드 15 (공동명의 해제 요청/취소 ) - 취소여부 N 요청, Y 취소
		 * 
		 * [모임원]
	     * 모임변경 구분코드 16 (공동명의 등록 승인/거절 ) - 취소여부 N 승인, Y 거절
	     * 모임변경 구분코드 17 (공동명의 해제 승인/거절 ) - 취소여부 N 승인, Y 거절
	     * 모임변경 구분코드 18 (공동명의 해제 )          	 - 취소여부 N
		 */
		String tmplCd = "";
		if("14".equals(input.getMetChgDscd()) 
			&& "N".equals(input.getCanYn())) {
			tmplCd = SHRMPBCmmConstant.STR_RPWBCESS0132128; // 모임장이 모임원에게 출금권한 등록요청
		} else if("15".equals(input.getMetChgDscd()) 
			&& "N".equals(input.getCanYn())) {
			tmplCd = SHRMPBCmmConstant.STR_RPWBCESS0132129; // 모임장이 모임원에게 출금권한 해지요청
		}  else if("16".equals(input.getMetChgDscd()) 
			&& "N".equals(input.getCanYn())) {
			tmplCd = SHRMPBCmmConstant.STR_RPWBCESS0132134; // 모임원이 출금권한 등록 승인
		}  else if( ( "17".equals(input.getMetChgDscd()) 
						&& "N".equals(input.getCanYn()) )
					|| "18".equals(input.getMetChgDscd()) ) {
			tmplCd = SHRMPBCmmConstant.STR_RPWBCESS0132133; // 모임원이 출금권한 해지 승인
		}
		
		if(!StringUtils.isEmpty(tmplCd)) {
			// PUSH 알림 전송
			MPBMetPbokBscMnginsertMetPbokPushNtfcSndInput_DTO iNtfcSnd = new MPBMetPbokBscMnginsertMetPbokPushNtfcSndInput_DTO();
			
			iNtfcSnd.setUmsTmplCd(tmplCd);
			iNtfcSnd.setMetMngNo(input.getMetMngNo());
			iNtfcSnd.setMetMbhSrno(input.getMetMbhSrno());
			
			mPBMetPbokBscMng_COM.insertMetPbokPushNtfcSnd(iNtfcSnd);
		}
		
		if (logger.isDebugEnabled()) {
			logger.debug("90190263 공동명의인.인증.정보.수정 SVC output  {} ::: ", output);
		}
		
		return output;

	}
	/**
	 * 모임통장의 회원별로 프로필을 수정 할 수 있도록 관리하는 서비스
	 * 
	 * @param input 모임통장.나의정보.컨트롤러.입력.IO
	 * @return 모임통장.나의정보.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName = "모임통장.나의 별칭명 정보.수정", description = "모임통장의 회원별로 프로필을 수정 할 수 있도록 관리하는 서비스", author = "90190263")
	public MPBMetPbokMbhMngUpdateMetPbokMyAlsNmInf_ODT updateMetPbokMyAlsNmInf(MPBMetPbokMbhMngUpdateMetPbokMyAlsNmInf_IDT input) {
		/**
		 * @BXMType GetBean
		 */
		mPBMetPbokBscMng_COM = WFApplicationContext.getBean(mPBMetPbokBscMng_COM, MPBMetPbokBscMng_COM.class);

		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokMbhMngUpdateMetPbokMyAlsNmInf_ODT output = new MPBMetPbokMbhMngUpdateMetPbokMyAlsNmInf_ODT();
		
		if (logger.isDebugEnabled()) {
			logger.debug("90190263 모임통장.나의정보.수정 SVC input {} ::: ", input);
		}
		
		/**
		 * @BXMType IF
		 * @Desc 입력 검증 : 필수 입력 값 검증 코드
		 */
		if ( input.getMetMngNo()== null ) /**null check - 모임관리번호*/{
			throw new WFApplicationException("FNSE0005", null, new Object[]{input.getMetMngNo()});
		}
		else if ( input.getMetMbhSrno()== null ) /**null check - 모임회원일련번호*/{
			throw new WFApplicationException("FNSE0005", null, new Object[]{input.getMetMbhSrno()});
		}
		else if ( input.getMetMbhNm()== null ) /**null check - 모임회원명*/{
			throw new WFApplicationException("FNSE0005", null, new Object[]{input.getMetMbhNm()});
		}
		
		String errMsgTxt = "";
		String errMsgId = "";
		
		try {
			MetPbokBscMbhInf_DIDT iMetPbokBscMbhInf = new MetPbokBscMbhInf_DIDT();
			iMetPbokBscMbhInf.setMetChgDscd("24"); // 모임변경구분코드 [24] 모임회원(별칭)명 변경
			iMetPbokBscMbhInf.setMetMngNo(input.getMetMngNo()); // 모임관리번호
			iMetPbokBscMbhInf.setCnt(1);// 건수
			
			List<MetPbokBscMbhInfGrid_DIDT> inputGrid = new ArrayList<>();
			
			MetPbokBscMbhInfGrid_DIDT inputData = new MetPbokBscMbhInfGrid_DIDT();
			inputData.setMetMbhSrno(input.getMetMbhSrno()); // 모임회원일련번호
			inputData.setMetMbhNm(input.getMetMbhNm()); // 모임회원명
				
			inputGrid.add(inputData);
			
			iMetPbokBscMbhInf.setGrid(inputGrid);
			
			if (logger.isDebugEnabled()) {
				logger.debug("90190263 모임통장.나의정보.수정 SVC iMetPbokBscMbhInf {} ::: ", iMetPbokBscMbhInf);
			}
			
			/*
			 * @BXMType ComponentCall
			 * 모임통장.회원.관리.컴포넌트 모임통장.나의정보.수정
			 */
			// com.skbank.sml.fns.mpb.com.MPBMetPbokMbhMng_COM
			MetPbokBscMbhInf_DODT oMetPbokBscMbhInf =  mPBMetPbokBscMng_COM.updateMetPbokBscMbhInf(iMetPbokBscMbhInf);
			
			if (logger.isDebugEnabled()) {
				logger.debug("90190263 모임통장.나의정보.수정 SVC oMetPbokBscMbhInf {} ::: ", oMetPbokBscMbhInf);
			}
			
			output.setMetChgDscd(oMetPbokBscMbhInf.getMetChgDscd()); // 모임변경구분코드
			output.setMetChgDscdNm(oMetPbokBscMbhInf.getMetChgDscdNm()); // 모임변경구분코드명
			output.setMetMngNo(oMetPbokBscMbhInf.getMetMngNo()); // 모임관리번호
			output.setMetNm(oMetPbokBscMbhInf.getMetNm()); // 모임명
			output.setMbpfPymDt(oMetPbokBscMbhInf.getMbpfPymDt()); // 회비납부일자
			output.setMbpfPmtgtAm(oMetPbokBscMbhInf.getMbpfPmtgtAm()); // 회비납부대상금액
			output.setMetDscd(oMetPbokBscMbhInf.getMetDscd()); // 모임구분코드
			output.setMetDscdNm(oMetPbokBscMbhInf.getMetDscdNm()); // 모임구분코드명
			output.setAgmdCollDt(oMetPbokBscMbhInf.getAgmdCollDt()); // 동의서징구일자
			output.setLifecAm(oMetPbokBscMbhInf.getLifecAm()); // 생활비금액
			output.setMetBscImgUrlNm(oMetPbokBscMbhInf.getMetBscImgUrlNm()); // 모임기본이미지URL명
			output.setCnt(oMetPbokBscMbhInf.getCnt()); // 건수

			// 모임통장.기본.회원.정보.그리드.수정.출력.IO
			List<MPBMetPbokBscMbhInfGrid_ODT> outDataList = new ArrayList<>();
		        
	        for(MetPbokBscMbhInfGrid_DODT oBscMbhData : oMetPbokBscMbhInf.getGrid() ) {
	        	MPBMetPbokBscMbhInfGrid_ODT outData = new MPBMetPbokBscMbhInfGrid_ODT();
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
			
		}catch(Exception e){
			logger.debug("updateMetPbokMyInf  오류 e : [{}] ",e);
		
			if ( e instanceof WFApplicationException) {
				WFApplicationException we = (WFApplicationException) e;
				logger.error("WFApplicationException {} ", we);

				Object[] args = we.getArguments();
				
	            if(args != null && args.length>0) {
	            	errMsgTxt = args[0].toString();
	            	errMsgId = args[1].toString();
				}else {
					errMsgId = we.getCode();
					errMsgTxt = we.getMessage();
				}
			} else {
				logger.error("Exception {} ", e);
				errMsgId = "9999";
				errMsgTxt = e.getMessage();				
			}
			
			throw new WFApplicationException("FNSE0006", null, new Object[] {errMsgId, errMsgTxt});
		}
		
		return output;
	}

}