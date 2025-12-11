package com.skbank.sml.fns.mpb.com;

import bxm.common.annotaion.BxmCategory;

import com.skbank.sml.cmm.shr.com.SHRCMMInterfaceCfg_COM;
import com.skbank.sml.cmm.shr.com.SHRCMMLoginSession_COM;
import com.skbank.sml.cmm.shr.dto.CMM_CURRENT_CUST;
import com.skbank.sml.fns.mpb.dbm.MET_PBOK_MBH_CRTF_MNG_LDG001_DBM;
import com.skbank.sml.fns.mpb.dto.AsmnlRgsScss_DIDT;
import com.skbank.sml.fns.mpb.dto.AsmnlRgsScss_DODT;
import com.skbank.sml.fns.mpb.dto.MPBItcsnoInfInq_DTO;
import com.skbank.sml.fns.mpb.dto.MPBMetPbokMbhMngSelectCsInf_DODT;
import com.skbank.sml.fns.mpb.dto.MetPbokMbhInfInq_DIDT;
import com.skbank.sml.fns.mpb.dto.MetPbokMbhInfInq_DODT;
import com.skbank.sml.fns.mpb.dto.MetPbokMbhInfListInq_DODT;

import com.skbank.sml.fns.mpb.dto.MET_PBOK_MBH_CRTF_MNG_LDG001InsertMetPbokWaitMbhInf_DIDT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_MBH_CRTF_MNG_LDG001SelectMetPbokWaitMbhInf_DIDT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_MBH_CRTF_MNG_LDG001SelectMetPbokWaitMbhInf_DODT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_MBH_CRTF_MNG_LDG001SelectMetPbokWaitMbhList_DIDT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_MBH_CRTF_MNG_LDG001SelectMetPbokWaitMbhList_DODT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_MBH_CRTF_MNG_LDG001UpdateMetPbokMbhScss_DIDT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_MBH_CRTF_MNG_LDG001UpdateMetPbokWaitMbhInf_DIDT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_MBH_CRTF_MNG_LDG001UpdateMetPbokWaitMbhRppeInf_DIDT;
import com.skbank.sml.ifi.mca.eims1.dto.IBSMR0005771_GRID_ODT;
import com.skbank.sml.ifi.mca.eims1.dto.IBSMR0005771_IDT;
import com.skbank.sml.ifi.mca.eims1.dto.IBSMR0005771_ODT;
import com.skbank.sml.ifi.mca.eims2.dto.IBSMR0005972_IDT;
import com.skbank.sml.ifi.mca.eims2.dto.IBSMR0005972_ODT;
import com.skbank.sml.ifi.mca.eims3.dto.IBSMR0005003_IDT;
import com.skbank.sml.ifi.mca.eims3.dto.IBSMR0005003_ODT;
import com.skbank.sml.ifi.mca.eims4.dto.IBSMR0000914_IDT;
import com.skbank.sml.ifi.mca.eims4.dto.IBSMR0000914_ODT;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0000914_COM;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0005003_COM;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0005771_COM;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0005972_COM;

import java.util.ArrayList;
import java.util.List;

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

/**
 * 1.업무명 : 금융서비스
 * 2.단위업무명 : NEWWON 중분류 모임통장
 * 3.프로그램명 : 모임통장.회원.관리.컴포넌트
 * 4.설명 : 모임통장의 회원을 관리하는 컴포넌트
 * 
 * @Class MPBMetPbokMbhMng_COM.java
 * @author 90190263
 * @since 2024.03.27
 * @version 1.0
 */		
@Component
@BxmCategory(logicalName="모임통장.회원.관리.컴포넌트", description="모임통장의 회원을 관리하는 컴포넌트")
public class MPBMetPbokMbhMng_COM {
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
	 * 모임통장.대기.회원001.DBM
	 */
	private MET_PBOK_MBH_CRTF_MNG_LDG001_DBM metPbokWaitMbh001_DBM;

	/** 
	 *  SHRIBSMR0005771_COM 회원목록 조회
	 */
	private SHRIBSMR0005771_COM sHRIBSMR0005771_COM;

	/**
	 * 고객정보 조회
	 */
	private SHRIBSMR0000914_COM sHRIBSMR0000914_COM;
	/**
	 * CI를 이용한 전자뱅킹계약 사전정보조회 
	 */
	private SHRIBSMR0005003_COM sHRIBSMR0005003_COM;

	/** 
	 * 모임통장 생활비(커플)모드 공동명의 등록/해제 
	 */
	private SHRIBSMR0005972_COM sHRIBSMR0005972_COM; 
	
	/**
	 * 모임통장의 회원정보를 조회하는 컴포넌트 
	 * 
	 * @param input 모임통장.회원.대기정보.조회.DBM.입력.IO
	 * @return 모임통장.회원.대기정보.조회.DBM.출력.IO
	 */
	@BxmCategory(logicalName="모임통장.대기.회원.정보.조회", description="모임통장의 회원정보를 조회하는 컴포넌트 ", author="90190263")
	public MET_PBOK_MBH_CRTF_MNG_LDG001SelectMetPbokWaitMbhInf_DODT selectMetPbokWaitMbhInf(MET_PBOK_MBH_CRTF_MNG_LDG001SelectMetPbokWaitMbhInf_DIDT input
	) throws WFApplicationException  {
		/**
		* @BXMType GetBean
		*/
		metPbokWaitMbh001_DBM= WFApplicationContext.getBean(metPbokWaitMbh001_DBM, MET_PBOK_MBH_CRTF_MNG_LDG001_DBM.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		 
		/*
		 * @BXMType DBM
		 * 모임통장.대기.회원001.DBM 모임통장.대기.회원.정보.조회 
		 */
		// com.skbank.sml.fns.mpb.dbm.MET_PBOK_MBH_CRTF_MNG_LDG001_DBM
		MET_PBOK_MBH_CRTF_MNG_LDG001SelectMetPbokWaitMbhInf_DODT output= metPbokWaitMbh001_DBM.selectMetPbokWaitMbhInf(input);
		

		return output;
	}
	
	/**
	 * 모임통장의 회원 목록을 조회하는 컴포넌트 
	 * 
	 * @param iMbhWaitList 모임통장.회원.대기목록.조회.DBM.입력.IO
	 * @return 모임통장.회원.대기목록.조회.DBM.출력.IO
	 */
	@BxmCategory(logicalName="모임통장.대기.회원.목록.조회", description="모임통장의 회원목록을 조회하는 컴포넌트 ", author="90190263")
	public List<MET_PBOK_MBH_CRTF_MNG_LDG001SelectMetPbokWaitMbhList_DODT> selectMetPbokWaitMbhList(MET_PBOK_MBH_CRTF_MNG_LDG001SelectMetPbokWaitMbhList_DIDT input
	) throws WFApplicationException  {
		/**
		* @BXMType GetBean
		*/
		metPbokWaitMbh001_DBM= WFApplicationContext.getBean(metPbokWaitMbh001_DBM, MET_PBOK_MBH_CRTF_MNG_LDG001_DBM.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		
		/*
		 * @BXMType DBM
		 * 모임통장.대기.회원001.DBM 모임통장.대기.회원.목록.조회 
		 */
		// com.skbank.sml.fns.mpb.dbm.MET_PBOK_MBH_CRTF_MNG_LDG001_DBM
		List<MET_PBOK_MBH_CRTF_MNG_LDG001SelectMetPbokWaitMbhList_DODT> output = metPbokWaitMbh001_DBM.selectMetPbokWaitMbhList(input);
		
		return output;
	}
	
	/**
	 * 모임통장의 회원정보를 조회하는 컴포넌트 
	 * 
	 * @param input 모임통장.회원.대기정보.등록.DBM.입력.IO
	 * @return 모임통장.회원.대기정보.등록.DBM.출력.IO
	 */
	@BxmCategory(logicalName="모임통장.대기.회원.정보.등록", description="모임통장의 회원정보를 조회하는 컴포넌트 ", author="90190263")
	public int insertMetPbokWaitMbhInf(MET_PBOK_MBH_CRTF_MNG_LDG001InsertMetPbokWaitMbhInf_DIDT input
	) throws WFApplicationException  {
		/**
		* @BXMType GetBean
		*/
		metPbokWaitMbh001_DBM= WFApplicationContext.getBean(metPbokWaitMbh001_DBM, MET_PBOK_MBH_CRTF_MNG_LDG001_DBM.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */
		/*
		 * @BXMType DBM
		 * 모임통장.대기.회원001.DBM 모임통장.대기.회원.정보.등록
		 */
		// com.skbank.sml.fns.mpb.dbm.MET_PBOK_MBH_CRTF_MNG_LDG001_DBM
		int insertCnt = metPbokWaitMbh001_DBM.insertMetPbokWaitMbhInf(input);

		return insertCnt;
	}
	
	/**
	 * 모임통장의 회원정보를 조회하는 컴포넌트 
	 * 
	 * @param input 모임통장.회원.대기정보.수정.DBM.입력.IO
	 * @return 모임통장.회원.대기정보.수정.DBM.출력.IO
	 */
	@BxmCategory(logicalName="모임통장.대기.회원.정보.수정", description="모임통장의 회원정보를 조회하는 컴포넌트 ", author="90190263")
	public int updateMetPbokWaitMbhInf(MET_PBOK_MBH_CRTF_MNG_LDG001UpdateMetPbokWaitMbhInf_DIDT input
	) throws WFApplicationException  {
		/**
		* @BXMType GetBean
		*/
		metPbokWaitMbh001_DBM= WFApplicationContext.getBean(metPbokWaitMbh001_DBM, MET_PBOK_MBH_CRTF_MNG_LDG001_DBM.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		/*
		 * @BXMType DBM
		 * 모임통장.대기.회원001.DBM 모임통장.대기.회원.정보.수정
		 */
		// com.skbank.sml.fns.mpb.dbm.MET_PBOK_MBH_CRTF_MNG_LDG001_DBM
		int updateCnt = metPbokWaitMbh001_DBM.updateMetPbokWaitMbhInf(input);
		
		return updateCnt;
	}
	
	/**
	 * 모임통장의 회원 대표자 정보를 수정하는 컴포넌트 
	 * 
	 * @param input 모임통장.대기.회원.대표자.정보.수정.DBM.입력.IO
	 * @return 모임통장.대기.회원.대표자.정보.수정.DBM.출력.IO
	 */
	@BxmCategory(logicalName="모임통장.대기.회원.대표자.정보.수정", description="모임통장의 회원정보를 조회하는 컴포넌트 ", author="90190263")
	public int updateMetPbokWaitMbhRppeInf(MET_PBOK_MBH_CRTF_MNG_LDG001UpdateMetPbokWaitMbhRppeInf_DIDT input
	) throws WFApplicationException  {
		/**
		* @BXMType GetBean
		*/
		metPbokWaitMbh001_DBM= WFApplicationContext.getBean(metPbokWaitMbh001_DBM, MET_PBOK_MBH_CRTF_MNG_LDG001_DBM.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		/*
		 * @BXMType DBM
		 * 모임통장.대기.회원001.DBM 모임통장.대기.회원.정보.수정
		 */
		// com.skbank.sml.fns.mpb.dbm.MET_PBOK_MBH_CRTF_MNG_LDG001_DBM
		int updateCnt = metPbokWaitMbh001_DBM.updateMetPbokWaitMbhRppeInf(input);
		
		return updateCnt;
	}
	
	/**
	 * 모임통장의 회원을 탈퇴하는 컴포넌트
	 * 
	 * @param input 모임통장.회원.정보.등록.탈퇴.DBM.입력.IO
	 * @return 모임통장.회원.정보.등록.탈퇴.DBM.출력.IO
	 */
	@BxmCategory(logicalName="모임통장.회원.탈퇴.수정", description="모임통장의 회원을 탈퇴하는 컴포넌트", author="90190263")
	public int updateMetPbokMbhScss(MET_PBOK_MBH_CRTF_MNG_LDG001UpdateMetPbokMbhScss_DIDT input
	) throws WFApplicationException  {
		/**
		* @BXMType GetBean
		*/
		metPbokWaitMbh001_DBM= WFApplicationContext.getBean(metPbokWaitMbh001_DBM, MET_PBOK_MBH_CRTF_MNG_LDG001_DBM.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		
		/*
		 * @BXMType DBM
		 * 모임통장.대기.회원001.DBM 모임통장.대기.회원.탈퇴.수정
		 */
		// com.skbank.sml.fns.mpb.dbm.MET_PBOK_MBH_CRTF_MNG_LDG001_DBM
		int updateCnt = metPbokWaitMbh001_DBM.updateMetPbokMbhScss(input);
		
		return updateCnt;
	}

	/**
	 * 통합고객번호로 고객정보를 조회하는 컴포넌트
	 * 
	 * @param input 회원.정보.조회.입력.IO
	 * @return 회원.정보.조회.출력.IO
	 */
	@BxmCategory(logicalName="통합고객번호.정보.조회", description="통합고객번호로 고객정보를 조회하는 컴포넌트 ", author="90190263")
	public MPBItcsnoInfInq_DTO selectItcsnoInf(String itcsno
	) throws WFApplicationException  {
		/**
		* @BXMType GetBean
		*/
		// WFInterfaceCfg 생성 컴포넌트
		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class);
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		sHRIBSMR0000914_COM= WFApplicationContext.getBean(sHRIBSMR0000914_COM, SHRIBSMR0000914_COM.class);
		sHRIBSMR0005003_COM= WFApplicationContext.getBean(sHRIBSMR0005003_COM, SHRIBSMR0005003_COM.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		//세션고객정보
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession(); 
		if(logger.isDebugEnabled()) {
			logger.debug("currentCust ====== {} ::: ", currentCust);
		} 
	
		MPBItcsnoInfInq_DTO output= new MPBItcsnoInfInq_DTO();
		
		// 통합고객번호로 고객정보 조회
		//  MCA WFInterfaceCfg 객체 획득
		WFInterfaceCfg interfaceCfg0914  = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg();
		interfaceCfg0914.setInterfaceId("IBSMR0000914");
		
		IBSMR0000914_ODT oIBSMR0000914 = new IBSMR0000914_ODT();
		IBSMR0000914_IDT iIBSMR0000914 = new IBSMR0000914_IDT();
		iIBSMR0000914.setItcsno(itcsno); 
	
		if(logger.isDebugEnabled()) {
			logger.debug("90190263 모임통장.통합고객번호.정보.조회 COM iIBSMR0000914 {} :: ", iIBSMR0000914);
		}
		
		WFInfResponse<IBSMR0000914_ODT> mcaOutput0914 = sHRIBSMR0000914_COM.callTrx(iIBSMR0000914, interfaceCfg0914);
		oIBSMR0000914 = mcaOutput0914.getResponseData();
		
		if(logger.isDebugEnabled()) {
			logger.debug("90190263 모임통장.통합고객번호.정보.조회 COM oIBSMR0000914 {} :: ", oIBSMR0000914);
		}
		
		//CI를 이용한 전자뱅킹계약 사전정보조회
		//  MCA WFInterfaceCfg 객체 획득
		WFInterfaceCfg interfaceCfg5003  = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg();
		interfaceCfg5003.setInterfaceId("IBSMR0005003");
	
		IBSMR0005003_ODT oIBSMR0005003 = new IBSMR0005003_ODT();
		IBSMR0005003_IDT iIBSMR0005003 = new IBSMR0005003_IDT();
		iIBSMR0005003.setCusCiNo(oIBSMR0000914.getCusCiNo()); 
		
		if(logger.isDebugEnabled()) {
			logger.debug("90190263 모임통장.통합고객번호.정보.조회 COM iIBSMR0005003 {} :: ", iIBSMR0005003);
		}
	
		WFInfResponse<IBSMR0005003_ODT> mcaOutput5003 = sHRIBSMR0005003_COM.callTrx(iIBSMR0005003, interfaceCfg5003);
		oIBSMR0005003 = mcaOutput5003.getResponseData();
		
		if(logger.isDebugEnabled()) {
			logger.debug("90190263 모임통장.통합고객번호.정보.조회 COM oIBSMR0005003 {} :: ", oIBSMR0005003);
		}
		
		output.setItcsno(oIBSMR0005003.getItcsno()); // 통합고객번호
		output.setEncyRbno(oIBSMR0005003.getEncyRbno()); // 암호화주민사업자등록번호
		output.setEbnkUtzpeNo(oIBSMR0005003.getEbnkUtzpeNo()); // 전자뱅킹이용자번호
		output.setUserDis(oIBSMR0005003.getUserDis()); // 사용자구분
		output.setEbnkInqUserYn(oIBSMR0005003.getEbnkInqUserYn()); // 전자뱅킹조회사용자여부
		output.setMdAgrYn(oIBSMR0005003.getMdAgrYn()); // 매체동의여부
		output.setTms1TsLmtAm(oIBSMR0005003.getTms1TsLmtAm()); // 1회이체한도금액
		output.setD1TsLmtAm(oIBSMR0005003.getD1TsLmtAm()); // 1일이체한도금액
		output.setScrtMensKd(oIBSMR0005003.getScrtMensKd()); // 보안수단종류
		output.setScrtMensMissYn(oIBSMR0005003.getScrtMensMissYn()); // 보안수단분실여부
		output.setSpltCerdUsgYn(oIBSMR0005003.getSpltCerdUsgYn()); // 특수인증서사용여부
		output.setTwochCrtfYn(oIBSMR0005003.getTwochCrtfYn()); // 2채널인증여부
		output.setOtpCoCd(oIBSMR0005003.getOtpCoCd()); // OTP업체코드
		output.setOtpSrno(oIBSMR0005003.getOtpSrno()); // OTP일련번호
		output.setTmHndpeDtOtpYn(oIBSMR0005003.getTmHndpeDtOtpYn()); // 시각장애인디지털OTP여부
		output.setWonCrtfUsgYn(oIBSMR0005003.getWonCrtfUsgYn()); // 원인증사용여부
		output.setEsnsBnkgUsgYn(oIBSMR0005003.getEsnsBnkgUsgYn()); // 간편뱅킹사용여부
		output.setEsnsTsRgsYn(oIBSMR0005003.getEsnsTsRgsYn()); // 간편이체등록여부
		output.setEfLieAtntInfRgsCusYn(oIBSMR0005003.getEfLieAtntInfRgsCusYn()); // 전자금융사기주의정보등록고객여부
		output.setCusHpNo(oIBSMR0005003.getCusHpNo()); // 고객핸드폰번호
		output.setFdtsTrnLimYn(oIBSMR0005003.getFdtsTrnLimYn()); // 자금이체거래제한여부
		output.setOpenBnkgJnngYn(oIBSMR0005003.getOpenBnkgJnngYn()); // 오픈뱅킹가입여부
		output.setMydtCusYn(oIBSMR0005003.getMydtCusYn()); // 마이데이터고객여부
		output.setDethAtntInfRgsCusYn(oIBSMR0005003.getDethAtntInfRgsCusYn()); // 사망주의정보등록고객여부
		
		return output;
	}

	/**
	 * 모임통장의 회원정보 목록을 조회하는 컴포넌트 
	 * 
	 * @param input 모임통장.회원.정보.조회.DBM.입력.IO
	 * @return 모임통장.회원.정보.조회.DBM.출력.IO
	 */
	@BxmCategory(logicalName="모임통장.회원.정보.조회", description="모임통장의 회원정보를 조회하는 컴포넌트 ", author="90190263")
	public MetPbokMbhInfInq_DODT selectMetPbokMbhInf(MetPbokMbhInfInq_DIDT input
	) throws WFApplicationException  {
		/**
		* @BXMType GetBean
		*/
		sHRIBSMR0005771_COM= WFApplicationContext.getBean(sHRIBSMR0005771_COM, SHRIBSMR0005771_COM.class);
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		// WFInterfaceCfg 생성 컴포넌트
		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */
		//세션고객정보
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession(); 
		if(logger.isDebugEnabled()) {
			logger.debug("currentCust ====== {} ::: ", currentCust);
		} 
		
		MetPbokMbhInfInq_DODT output= new MetPbokMbhInfInq_DODT();
		
		/**
		 * 연계시스템 호출
		 * TYPE : MCA
		 * ID : IBSMR0005771
		 * NM : 모임통장 회원 목록 조회
		 */
		if(logger.isDebugEnabled()) {
			logger.debug("90190263 모임통장.회원.정보.조회 COM input {} :: ", input);
		}
		
		String errMsgTxt="";
		String errMsgId= "";

		/**
		 * @BXMType Try
		 * 
		 */
		try{
			//  MCA WFInterfaceCfg 객체 획득
			WFInterfaceCfg interfaceCfg  = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg();
			interfaceCfg.setInterfaceId("IBSMR0005771");
			
	        // WFNciHeader 셋팅
            WFNciHeader wfnciHeader = interfaceCfg.getNciHeader();
            
	        // 간편회원일 경우 userID, 통합고객번호 초기화
	        if( shrCMMLoginSession_COM.isEsnsMbh() == true ) {
	        	wfnciHeader.setEbnkUtzpeNo("");
	            wfnciHeader.setItcsno("");  
	        }

            // interfaceCfg 셋팅
            interfaceCfg.setNciHeader(wfnciHeader);
            
	        
	        IBSMR0005771_IDT iIBSMR0005771 = new IBSMR0005771_IDT();
	        iIBSMR0005771.setInqDis(input.getInqDis()); // 조회구분
	        iIBSMR0005771.setMetMngNo(input.getMetMngNo()); // 모임관리번호
	        iIBSMR0005771.setMetMbhSrno(input.getMetMbhSrno()); // 모임회원일련번호
	        iIBSMR0005771.setNxtMetMbhAlsNm(input.getNxtMetMbhAlsNm()); 
	        
	        IBSMR0005771_ODT oIBSMR0005771 = new IBSMR0005771_ODT();
	        
			WFInfResponse<IBSMR0005771_ODT> mcaOutput = sHRIBSMR0005771_COM.callTrx(iIBSMR0005771, interfaceCfg);
	
			oIBSMR0005771 = mcaOutput.getResponseData();

			if(logger.isDebugEnabled()) {
				logger.debug("90190263 모임통장.회원.정보.조회 oIBSMR0005771 :: {} ", oIBSMR0005771);
			}
			/**
			 * @BXMType IF
			 * 모임통장 회원 정보 조회
			 */
			if( !ObjectUtils.isEmpty( oIBSMR0005771 ) ) {
				output.setMetMngNo(oIBSMR0005771.getMetMngNo()); // 모임관리번호
				output.setEbnkUtzpeNo(oIBSMR0005771.getEbnkUtzpeNo()); // 전자뱅킹이용자번호
				output.setMetCtrStcd(oIBSMR0005771.getMetCtrStcd()); // 모임계약상태코드
				output.setMetCtrStcdNm(oIBSMR0005771.getMetCtrStcdNm()); // 모임계약상태코드명
				output.setMetPbokDscd(oIBSMR0005771.getMetPbokDscd()); // 모임통장구분코드
				output.setMetPbokDscdNm(oIBSMR0005771.getMetPbokDscdNm()); // 모임통장구분코드명
				output.setMetNm(oIBSMR0005771.getMetNm()); // 모임명
				output.setRcvBkwAcno(oIBSMR0005771.getRcvBkwAcno()); // 입금전행계좌번호
				output.setCusUsgBkwAcno(oIBSMR0005771.getCusUsgBkwAcno()); // 고객사용전행계좌번호
				output.setItcsno(oIBSMR0005771.getItcsno()); // 통합고객번호
				output.setCusKorlNm(oIBSMR0005771.getCusKorlNm()); // 고객한글명
				output.setCusBkpnNm(oIBSMR0005771.getCusBkpnNm()); // 고객부기명
				output.setCtBal(oIBSMR0005771.getCtBal()); // 현재잔액
				output.setPayAvlBal(oIBSMR0005771.getPayAvlBal()); // 지급가능잔액
				output.setPdcd(oIBSMR0005771.getPdcd()); // 상품코드
				output.setPdcdKorlNm(oIBSMR0005771.getPdcdKorlNm()); // 상품코드한글명
				output.setPrdKorlAbrNm(oIBSMR0005771.getPrdKorlAbrNm()); // 상품한글단축명
				output.setRlfAcno(oIBSMR0005771.getRlfAcno()); // 안심계좌번호
				output.setMbpfPymDt(oIBSMR0005771.getMbpfPymDt()); // 회비납부일자
				output.setMbpfPymCycd(oIBSMR0005771.getMbpfPymCycd()); // 회비납부주기코드
				output.setMbpfPymCycdNm(oIBSMR0005771.getMbpfPymCycdNm()); // 회비납부주기코드명
				output.setMbpfPmtgtAm(oIBSMR0005771.getMbpfPmtgtAm()); // 회비납부대상금액
				output.setAgmdCollDt(oIBSMR0005771.getAgmdCollDt()); // 동의서징구일자
				output.setAdvpeEno(oIBSMR0005771.getAdvpeEno()); // 권유자직원번호
				output.setAsmnlApvCd(oIBSMR0005771.getAsmnlApvCd()); // 공동명의승인코드
				output.setAsmnlApvCdNm(oIBSMR0005771.getAsmnlApvCdNm()); // 공동명의승인코드명
				output.setRppeChgRgsYn(oIBSMR0005771.getRppeChgRgsYn()); // 대표자변경등록여부
				output.setRppeChgRgsDt(oIBSMR0005771.getRppeChgRgsDt()); // 대표자변경등록일자
				output.setRppeChgVldDt(oIBSMR0005771.getRppeChgVldDt()); // 대표자변경유효일자
				output.setMetDscd(oIBSMR0005771.getMetDscd()); // 모임구분코드
				output.setMetDscdNm(oIBSMR0005771.getMetDscdNm()); // 모임구분코드명
				output.setMetRgsDt(oIBSMR0005771.getMetRgsDt()); // 모임등록일자
				output.setRgsTm(oIBSMR0005771.getRgsTm()); // 등록시각
				output.setMetBscImgUrlNm(oIBSMR0005771.getMetBscImgUrlNm()); // 모임기본이미지URL명
				output.setMetMbhRgsCnt(oIBSMR0005771.getMetMbhRgsCnt()); // 모임회원등록건수
				output.setMetMbhScssCnt(oIBSMR0005771.getMetMbhScssCnt()); // 모임회원등록건수
				output.setMetRprsAlsNm(oIBSMR0005771.getMetRprsAlsNm()); // 모임대표별칭명
				output.setMetRprsMbhNm(oIBSMR0005771.getMetRprsMbhNm()); // 모임대표회원명
				output.setMetRprsImgUrlNm(oIBSMR0005771.getMetRprsImgUrlNm()); // 모임대표이미지URL명
				output.setNxtMetMbhAlsNm(oIBSMR0005771.getNxtMetMbhAlsNm());
				
				// 모임통장.회원.정보.목록.조회.DBM.출력.IO
				List<MetPbokMbhInfListInq_DODT> outDataList = new ArrayList<>();
				
				for( IBSMR0005771_GRID_ODT oMbhInfData : oIBSMR0005771.getGrid()) {
					if(!"90".equals(oMbhInfData.getMetMbhCtrStcd())) {
						MetPbokMbhInfListInq_DODT outData = new MetPbokMbhInfListInq_DODT();
						
						outData.setMetMngNo(oMbhInfData.getMetMngNo()); // 모임관리번호
						outData.setMetMbhSrno(oMbhInfData.getMetMbhSrno()); // 모임회원일련번호
						outData.setMetMbhCtrStcd(oMbhInfData.getMetMbhCtrStcd()); // 모임회원계약상태코드
						outData.setMetMbhCtrStcdNm(outData.getMetMbhCtrStcdNm()); // 모임회원계약상태코드명
						outData.setMetMbhDscd(oMbhInfData.getMetMbhDscd()); // 모임회원구분코드
						outData.setMetMbhDscdNm(oMbhInfData.getMetMbhDscdNm()); // 모임회원구분코드명
						outData.setUtzpeNoCfcd(oMbhInfData.getUtzpeNoCfcd()); // 이용자번호분류코드
						outData.setUtzpeNoCfcdNm(outData.getUtzpeNoCfcdNm()); // 이용자번호분류코드명
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
						
						outDataList.add(outData);
					}
				}
				
				output.setGrid(outDataList);
				output.setGridCnt(outDataList.size()); // 그리드건수
			
				if(logger.isDebugEnabled()) {
					logger.debug("90190263 모임통장.회원.정보.조회 oIBSMR0005771 {} :: ", oIBSMR0005771);
				}
			}
		} catch(Exception e) {
			logger.error(" IBSMR0005771 전문 error :: {}", e);
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
				

				errMsgTxt = se.getMainMsgTxt();
				errMsgId = se.getMsgId();
			} else if ( e instanceof WFApplicationException) {
				WFApplicationException we = (WFApplicationException) e;
				logger.error("WFApplicationException {} ", we);
				Object[] args = we.getArguments();
				
				if(args != null && args.length>0) {
	            	errMsgTxt = args[0].toString();
				} else {
					errMsgTxt = we.getMessage();
				}
				errMsgId = we.getCode();
			} else {
				logger.error("Exception {} ", e);
				errMsgTxt = e.getMessage();
				errMsgId = "9999";
			}
			
			throw new WFApplicationException("FNSE0006", new Object[] {errMsgTxt, errMsgId} ); 
		}
		
		if(logger.isDebugEnabled()) {
			logger.debug("90190263 모임통장.회원.정보.조회 COM output {} :: ", output);
		}
		
		return output;
	}

	/**
	 * 모임통장(커플통장)의 공동명의인의 정보를 등록하는 서비스
	 * 
	 * 공통 : 모임관리번호, 모임회원일련번호 필수
	 * 
	 *[모임장]
     * 모임변경 구분코드 14 (공동명의 등록 요청/취소 ) - 취소여부 N 요청, Y 취소
     * 모임변경 구분코드 15 (공동명의 해제 요청/취소 ) - 취소여부 N 요청, Y 취소
    *
    * [모임원]
     * 모임변경 구분코드 16 (공동명의 등록 승인/거절 ) - 취소여부 N 승인, Y 거절
     * 모임변경 구분코드 17 (공동명의 해제 승인/거절 ) - 취소여부 N 승인, Y 거절
     * 모임변경 구분코드 18 (공동명의 해제 )            - 취소여부 N
	 * 
	 * @param input 공동명의인.정보.컨트롤러.입력.IO
	 * @return 공동명의인.정보.컨트롤러.출력.IO
	 * 
	 */
	@BxmCategory(logicalName = "공동명의.등록.해제", description = "모임통장(커플통장)의 공동명의인의 정보를 등록하는 서비스", author = "90190263")
	public AsmnlRgsScss_DODT updateAsmnlRgsScss(AsmnlRgsScss_DIDT input) {

		/**
		 * @BXMType GetBean
		 */
		// WFInterfaceCfg 생성 컴포넌트
		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class);
		shrCMMLoginSession_COM= WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		sHRIBSMR0005972_COM= WFApplicationContext.getBean(sHRIBSMR0005972_COM, SHRIBSMR0005972_COM.class);
 
		/**
		 * @BXMType VariableDeclaration
		 */
		AsmnlRgsScss_DODT output = new AsmnlRgsScss_DODT();

		if (logger.isDebugEnabled()) {
			logger.debug("90190263 모임통장 생활비(커플)모드 공동명의 등록/해제 COM input  {} ::: ", input);
		}

		//세션고객정보
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession();
		if(logger.isDebugEnabled()) {
			logger.debug("currentCust  {} ::: ", currentCust);
		}
		
		String errMsgTxt = "";
		String errMsgId = "";
		/**
		 * 연계시스템 호출
		 * TYPE : MCA
		 * ID : IBSMR0005972
		 * NM : 모임통장 생활비(커플)모드 공동명의 등록/해제 
		 */
		try{
			//  MCA WFInterfaceCfg 객체 획득
			WFInterfaceCfg interfaceCfg  = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg();
			interfaceCfg.setInterfaceId("IBSMR0005972");
			
	        IBSMR0005972_ODT oIBSMR0005972= new IBSMR0005972_ODT();
	        
	        IBSMR0005972_IDT iIBSMR0005972= new IBSMR0005972_IDT();
	        iIBSMR0005972.setMetChgDscd(input.getMetChgDscd()); // 모임변경구분코드
	        iIBSMR0005972.setMetMngNo(input.getMetMngNo()); // 모임관리번호
	        iIBSMR0005972.setMetMbhSrno(input.getMetMbhSrno()); // 모임회원일련번호
	        iIBSMR0005972.setCanYn(input.getCanYn()); // 취소여부
	        
			WFInfResponse<IBSMR0005972_ODT> mcaOutput = sHRIBSMR0005972_COM.callTrx(iIBSMR0005972, interfaceCfg);
	
			oIBSMR0005972 = mcaOutput.getResponseData();
			
			output.setMetChgDscd(oIBSMR0005972.getMetChgDscd()); // 모임변경구분코드
			output.setMetChgDscdNm(oIBSMR0005972.getMetChgDscdNm()); // 모임변경구분코드명
			output.setCanYn(oIBSMR0005972.getCanYn()); // 취소여부
			output.setMetMngNo(oIBSMR0005972.getMetMngNo()); // 모임관리번호
			output.setAsmnlApvCd(oIBSMR0005972.getAsmnlApvCd()); // 공동명의승인코드
			output.setAsmnlApvCdNm(oIBSMR0005972.getAsmnlApvCdNm()); // 공동명의승인코드명
			output.setMetMbhSrno(oIBSMR0005972.getMetMbhSrno()); // 모임회원일련번호

			if(logger.isDebugEnabled()) {
				logger.debug("90190263 모임통장 생활비(커플)모드 공동명의 등록/해제 COM oIBSMR0005972 {} ::: ", oIBSMR0005972);
			}
		} catch(Exception e){
			logger.debug("IBSMR0005972  오류 e : [{}] ",e);
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
				

				errMsgTxt = se.getMainMsgTxt();
				errMsgId = se.getMsgId();
			} else if ( e instanceof WFApplicationException) {
				WFApplicationException we = (WFApplicationException) e;
				logger.error("WFApplicationException {} ", we);
				Object[] args = we.getArguments();
				
				if(args != null && args.length>0) {
	            	errMsgTxt = args[0].toString();
				} else {
					errMsgTxt = we.getMessage();
				}
				errMsgId = we.getCode();
			} else {
				logger.error("Exception {} ", e);
				errMsgTxt = e.getMessage();
				errMsgId = "9999";
			}
			
			throw new WFApplicationException("FNSE0006", new Object[] {errMsgTxt, errMsgId} ); 
		}
		
		if(logger.isDebugEnabled()) {
			logger.debug("90190263 모임통장 생활비(커플)모드 공동명의 등록/해제 COM output {} ::: ", output);
		}

		return output;
	}
	
	/**
	 * 통합고객번호로 고객정보를 조회하는 컴포넌트
	 * 
	 * @param input 회원.정보.조회.입력.IO
	 * @return 회원.정보.조회.출력.IO
	 */
	@BxmCategory(logicalName="고객.정보.조회", description="통합고객번호로 고객정보를 조회하는 컴포넌트 ", author="90191355")
	public MPBMetPbokMbhMngSelectCsInf_DODT selectCsInf(String itcsno) throws WFApplicationException  {
		/**
		* @BXMType GetBean
		*/
		// WFInterfaceCfg 생성 컴포넌트
		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class);
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		sHRIBSMR0000914_COM= WFApplicationContext.getBean(sHRIBSMR0000914_COM, SHRIBSMR0000914_COM.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		//세션고객정보
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession(); 
		if(logger.isDebugEnabled()) {
			logger.debug("currentCust ====== {} ::: ", currentCust);
		} 
	
		MPBMetPbokMbhMngSelectCsInf_DODT output = new MPBMetPbokMbhMngSelectCsInf_DODT();
		
		String errMsgTxt = "";
		String errMsgId = "";
		try {
			// 통합고객번호로 고객정보 조회
			//  MCA WFInterfaceCfg 객체 획득
			WFInterfaceCfg interfaceCfg0914  = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg();
			interfaceCfg0914.setInterfaceId("IBSMR0000914");
			
			IBSMR0000914_ODT oIBSMR0000914 = new IBSMR0000914_ODT();
			IBSMR0000914_IDT iIBSMR0000914 = new IBSMR0000914_IDT();
			iIBSMR0000914.setItcsno(itcsno); 
		
			if(logger.isDebugEnabled()) {
				logger.debug("모임통장.통합고객번호.정보.조회 COM iIBSMR0000914 {} :: ", iIBSMR0000914);
			}
			
			WFInfResponse<IBSMR0000914_ODT> mcaOutput0914 = sHRIBSMR0000914_COM.callTrx(iIBSMR0000914, interfaceCfg0914);
			oIBSMR0000914 = mcaOutput0914.getResponseData();
			
			if(logger.isDebugEnabled()) {
				logger.debug("모임통장.통합고객번호.정보.조회 COM oIBSMR0000914 {} :: ", oIBSMR0000914);
			}
			
			output.setCsno(oIBSMR0000914.getCsno()); // 고객번호
			output.setItcsno(oIBSMR0000914.getItcsno()); // 통합고객번호
			output.setCusKorlNm(oIBSMR0000914.getCusKorlNm()); // 고객한글명
			output.setHpComCd(oIBSMR0000914.getHpComCd()); // 핸드폰회사코드
			output.setHpTlenNo(oIBSMR0000914.getHpTlenNo()); // 핸드폰국번번호
			output.setHpSrno(oIBSMR0000914.getHpSrno()); // 핸드폰일련번호
			output.setEmail(oIBSMR0000914.getEmail()); // 이메일주소
			output.setCusMemoTxt(oIBSMR0000914.getCusMemoTxt()); // 고객메모내용
			output.setCusCiNo(oIBSMR0000914.getCusCiNo()); // 고객CI번호
			output.setMydtCusYn(oIBSMR0000914.getMydtCusYn()); // 마이데이터고객여부
		} catch(Exception e){
			logger.debug("IBSMR0005972  오류 e : [{}] ",e);
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
				

				errMsgTxt = se.getMainMsgTxt();
				errMsgId = se.getMsgId();
			} else if ( e instanceof WFApplicationException) {
				WFApplicationException we = (WFApplicationException) e;
				logger.error("WFApplicationException {} ", we);
				Object[] args = we.getArguments();
				
				if(args != null && args.length>0) {
	            	errMsgTxt = args[0].toString();
				} else {
					errMsgTxt = we.getMessage();
				}
				errMsgId = we.getCode();
			} else {
				logger.error("Exception {} ", e);
				errMsgTxt = e.getMessage();
				errMsgId = "9999";
			}
			
			throw new WFApplicationException("FNSE0006", new Object[] {errMsgTxt, errMsgId} ); 
		}
		
		return output;
	}
}
