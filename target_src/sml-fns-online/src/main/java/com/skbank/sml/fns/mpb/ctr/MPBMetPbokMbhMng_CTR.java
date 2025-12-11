package com.skbank.sml.fns.mpb.ctr;

import bxm.common.annotaion.BxmCategory;

import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokMbhMngUpdateAsscNompefInf_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokMbhMngUpdateAsscNompefInf_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokMbhMngUpdateMetPbokMbhScss_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokMbhMngUpdateMetPbokMbhScss_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokMbhMngSelectMetPbokMbhInf_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokMbhMngSelectMetPbokMbhInf_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokMbhMngInsertMetPbokMbhInf_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokMbhMngInsertMetPbokMbhInf_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokMbhMngUpdateMetPbokWaitMbhInf_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokMbhMngUpdateMetPbokWaitMbhInf_ODT;
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
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokMbhMngInsertMetPbokRprsChg_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokMbhMngInsertMetPbokRprsChg_ODT;
import com.skbank.sml.fns.mpb.svc.MPBMetPbokMbhMng_SVC;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fwk.skbank.online.context.WFApplicationContext;

/**
 * 1.업무명 : 금융서비스
 * 2.단위업무명 : NEWWON 중분류 모임통장
 * 3.프로그램명 : 모임통장.회원.관리.컨트롤러
 * 4.설명 : 모임통장의 회원을 관리하는 컨트롤러
 * 
 * @Class MPBMetPbokMbhMng_CTR.java
 * @author 90190263
 * @since 2024.03.27
 * @version 1.0
 */		
@RestController
@RequestMapping("/sml/fns/mpb/metpbokmbhmng")
@BxmCategory(logicalName="모임통장.회원.관리.컨트롤러", description="모임통장의 회원을 관리하는 컨트롤러", author="90190263")
@Api(tags={""})
public class MPBMetPbokMbhMng_CTR {
	private Logger logger= LoggerFactory.getLogger(getClass());
	
	/** 
	 * 모임통장.회원.관리.서비스
	 */
	private MPBMetPbokMbhMng_SVC mPBMetPbokMbhMng_SVC;
	
	
	/**
	 * 모임통장의 회원정보를 조회하는 컨트롤러
	 * 
	 * @param input 모임통장.회원.대기정보.조회.컨트롤러.입력.IO
	 * @return 모임통장.회원.대기정보.조회.컨트롤러.출력.IO
	 */
	@ApiOperation(
		value = "모임통장.대기.회원.정보.조회"
		, notes = ""
	)
	@PostMapping(value="/selectMetPbokWaitMbhInf")
	@BxmCategory(logicalName="모임통장.대기.회원.정보.조회", description="모임통장의 회원정보를 조회하는 컨트롤러", author="90190263")
	public MPBMetPbokMbhMngSelectMetPbokWaitMbhInf_ODT selectMetPbokWaitMbhInf(
		@ApiParam(value="input", example="") @RequestBody MPBMetPbokMbhMngSelectMetPbokWaitMbhInf_IDT input
		)
	{
		/**
		* @BXMType GetBean
		*/
		mPBMetPbokMbhMng_SVC= WFApplicationContext.getBean(mPBMetPbokMbhMng_SVC, MPBMetPbokMbhMng_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokMbhMngSelectMetPbokWaitMbhInf_ODT output= new MPBMetPbokMbhMngSelectMetPbokWaitMbhInf_ODT();
		/*
		 * 로직 추가
		 */
		logger.info("90190263 모임통장 초대정보 조회 CTR input ===== ", input);
		
		/*
		 * @BXMType ServiceCall
		 * 모임통장.회원.관리.서비스 모임통장.대기.회원.정보.조회
		 */
		// com.skbank.sml.fns.mpb.svc.MPBMetPbokMbhMng_SVC
		output = mPBMetPbokMbhMng_SVC.selectMetPbokWaitMbhInf( input );
		
		return output;
	}
	
	/**
	 * 모임통장의 회원정보를 조회하는 컨트롤러
	 * 
	 * @param input 모임통장.회원.대기정보.등록.컨트롤러.입력.IO
	 * @return 모임통장.회원.대기정보.등록.컨트롤러.출력.IO
	 */
	@ApiOperation(
		value = "모임통장.대기.회원.정보.등록"
		, notes = ""
	)
	@PostMapping(value="/insertMetPbokWaitMbhInf")
	@BxmCategory(logicalName="모임통장.대기.회원.정보.등록", description="모임통장의 회원정보를 조회하는 컨트롤러", author="90190263")
	public MPBMetPbokMbhMngInsertMetPbokWaitMbhInf_ODT insertMetPbokWaitMbhInf(
		@ApiParam(value="input", example="") @RequestBody MPBMetPbokMbhMngInsertMetPbokWaitMbhInf_IDT input
		)
	{
		/**
		* @BXMType GetBean
		*/
		mPBMetPbokMbhMng_SVC= WFApplicationContext.getBean(mPBMetPbokMbhMng_SVC, MPBMetPbokMbhMng_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokMbhMngInsertMetPbokWaitMbhInf_ODT output= new MPBMetPbokMbhMngInsertMetPbokWaitMbhInf_ODT();
		
		/*
		 * @BXMType ServiceCall
		 * 모임통장.회원.관리.서비스 모임통장.대기.회원.정보.등록
		 */
		
			// com.skbank.sml.fns.mpb.svc.MPBMetPbokMbhMng_SVC
		output = mPBMetPbokMbhMng_SVC.insertMetPbokWaitMbhInf(input);
		
		return output;
	}
	
	/**
	 * 모임통장의 회원정보를 조회하는 컨트롤러
	 * 
	 * @param input 모임통장.회원.대기정보.수정.컨트롤러.입력.IO
	 * @return 모임통장.회원.대기정보.수정.컨트롤러.출력.IO
	 */
	@ApiOperation(
		value = "모임통장.대기.회원.정보.수정"
		, notes = ""
	)
	@PostMapping(value="/updateMetPbokWaitMbhInf")
	@BxmCategory(logicalName="모임통장.대기.회원.정보.수정", description="모임통장의 회원정보를 조회하는 컨트롤러", author="90190263")
	public MPBMetPbokMbhMngUpdateMetPbokWaitMbhInf_ODT updateMetPbokWaitMbhInf(
		@ApiParam(value="input", example="") @RequestBody MPBMetPbokMbhMngUpdateMetPbokWaitMbhInf_IDT input
		)
	{
		/**
		* @BXMType GetBean
		*/
		mPBMetPbokMbhMng_SVC= WFApplicationContext.getBean(mPBMetPbokMbhMng_SVC, MPBMetPbokMbhMng_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokMbhMngUpdateMetPbokWaitMbhInf_ODT output= new MPBMetPbokMbhMngUpdateMetPbokWaitMbhInf_ODT();
		/*
		 * 로직 추가
		 */
		/*
		 * @BXMType ServiceCall
		 * 모임통장.회원.관리.서비스 모임통장.대기.회원.정보.수정
		 */
		// com.skbank.sml.fns.mpb.svc.MPBMetPbokMbhMng_SVC
		output = mPBMetPbokMbhMng_SVC.updateMetPbokWaitMbhInf(input);
		
		return output;
	}
	
	/**
	 * 모임통장의 회원정보를 조회하는 컨트롤러
	 * 
	 * @param input 모임통장.회원.정보.조회.컨트롤러.입력.IO
	 * @return 모임통장.회원.정보.조회.컨트롤러.출력.IO
	 */
	@ApiOperation(
		value = "모임통장.회원.정보.조회"
		, notes = ""
	)
	@PostMapping(value="/selectMetPbokMbhInf")
	@BxmCategory(logicalName="모임통장.회원.정보.조회", description="모임통장의 회원정보를 조회하는 컨트롤러", author="90190263")
	public MPBMetPbokMbhMngSelectMetPbokMbhInf_ODT selectMetPbokMbhInf(
		@ApiParam(value="input", example="") @RequestBody MPBMetPbokMbhMngSelectMetPbokMbhInf_IDT input
		)
	{
		/**
		* @BXMType GetBean
		*/
		mPBMetPbokMbhMng_SVC= WFApplicationContext.getBean(mPBMetPbokMbhMng_SVC, MPBMetPbokMbhMng_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokMbhMngSelectMetPbokMbhInf_ODT output= new MPBMetPbokMbhMngSelectMetPbokMbhInf_ODT();
		/*
		 * 로직 추가
		 */
		/*
		 * @BXMType ServiceCall
		 * 모임통장.회원.관리.서비스 모임통장.회원.정보.조회
		 */
		// com.skbank.sml.fns.mpb.svc.MPBMetPbokMbhMng_SVC
		output = mPBMetPbokMbhMng_SVC.selectMetPbokMbhInf(input);
		
		return output;
	}
	
	/**
	 * 모임통장의 회원정보를 등록 하는컨트롤러
	 * 
	 * @param input 모임통장.회원.정보.등록.컨트롤러.입력.IO
	 * @return 모임통장.회원.정보.등록.컨트롤러.출력.IO
	 */
	@ApiOperation(
		value = "모임통장.회원.정보.등록"
		, notes = ""
	)
	@PostMapping(value="/insertMetPbokMbhInf")
	@BxmCategory(logicalName="모임통장.회원.정보.등록.", description="모임통장의 회원정보를 등록하는 컨트롤러", author="90190263")
	public MPBMetPbokMbhMngInsertMetPbokMbhInf_ODT insertMetPbokMbhInf(
		@ApiParam(value="input", example="") @RequestBody MPBMetPbokMbhMngInsertMetPbokMbhInf_IDT input
		)
	{
		/**
		* @BXMType GetBean
		*/
		mPBMetPbokMbhMng_SVC= WFApplicationContext.getBean(mPBMetPbokMbhMng_SVC, MPBMetPbokMbhMng_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokMbhMngInsertMetPbokMbhInf_ODT output= new MPBMetPbokMbhMngInsertMetPbokMbhInf_ODT();
		/*
		 * 로직 추가
		 */
		/*
		 * @BXMType ServiceCall
		 * 모임통장.회원.관리.서비스 모임통장.회원.정보.등록
		 */
		// com.skbank.sml.fns.mpb.svc.MPBMetPbokMbhMng_SVC
		output = mPBMetPbokMbhMng_SVC.insertMetPbokMbhInf(input);
		
		return output;
	}
	
	/**
	 * 모임통장의 회원정보를 등록 하는컨트롤러
	 * 
	 * @param input 모임통장.회원.정보.등록.컨트롤러.입력.IO
	 * @return 모임통장.회원.정보.등록.컨트롤러.출력.IO
	 */
	@ApiOperation(
		value = "모임통장.회원.정보.탈퇴"
		, notes = ""
	)
	@PostMapping(value="/updateMetPbokMbhScss")
	@BxmCategory(logicalName="모임통장.회원.탈퇴", description="모임통장의 회원 탈퇴하는 컨트롤러", author="90190263")
	public MPBMetPbokMbhMngUpdateMetPbokMbhScss_ODT updateMetPbokMbhScss(
		@ApiParam(value="input", example="") @RequestBody MPBMetPbokMbhMngUpdateMetPbokMbhScss_IDT input
		)
	{
		/**
		* @BXMType GetBean
		*/
		mPBMetPbokMbhMng_SVC= WFApplicationContext.getBean(mPBMetPbokMbhMng_SVC, MPBMetPbokMbhMng_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokMbhMngUpdateMetPbokMbhScss_ODT output= new MPBMetPbokMbhMngUpdateMetPbokMbhScss_ODT();
		/*
		 * 로직 추가
		 */
		/*
		 * @BXMType ServiceCall
		 * 모임통장.회원.관리.서비스 모임통장.회원.탈퇴
		 */
		// com.skbank.sml.fns.mpb.svc.MPBMetPbokMbhMng_SVC
		output = mPBMetPbokMbhMng_SVC.updateMetPbokMbhScss(input);
		
		return output;
	}
	
	/**
	 * 모임통장의 모임장(대표)를 변경 등록하는 컨트롤러
	 * 
	 * @param input 모임통장.대표.변경.등록.컨트롤러.입력.IO
	 * @return 모임통장.대표.변경.등록.컨트롤러.출력.IO
	 */
	@ApiOperation(
		value = "모임통장.대표.변경.요청.등록"
		, notes = ""
	)
	@PostMapping(value="/insertMetPbokRprsChg")
	@BxmCategory(logicalName="모임통장.대표.변경.요청.등록", description="모임통장의 모임장(대표)를 변경 요청 등록하는 컨트롤러", author="90190263")
	public MPBMetPbokMbhMngInsertMetPbokRprsChg_ODT insertMetPbokRprsChg(
		@ApiParam(value="input", example="") @RequestBody MPBMetPbokMbhMngInsertMetPbokRprsChg_IDT input
		)
	{
		/**
		* @BXMType GetBean
		*/
		mPBMetPbokMbhMng_SVC= WFApplicationContext.getBean(mPBMetPbokMbhMng_SVC, MPBMetPbokMbhMng_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokMbhMngInsertMetPbokRprsChg_ODT output= new MPBMetPbokMbhMngInsertMetPbokRprsChg_ODT();
		/*
		 * 로직 추가
		 */
		/*
		 * @BXMType ServiceCall
		 * 모임통장.회원.관리.서비스 모임통장.대표.변경.요청.등록
		 */
		// com.skbank.sml.fns.mpb.svc.MPBMetPbokMbhMng_SVC
		output = mPBMetPbokMbhMng_SVC.insertMetPbokRprsChg(input);
		
		return output;
	}
	
	/**
	 * 모임통장의 모임장(대표)를 변경을 동의 수정하는 컨트롤러
	 * 
	 * @param input 모임통장.대표.변경.동의.수정.컨트롤러.입력.IO
	 * @return 모임통장.대표.변경.동의.수정.컨트롤러.출력.IO
	 */
	@ApiOperation(
		value = "모임통장.대표.변경.동의.수정"
		, notes = ""
	)
	@PostMapping(value="/updateMetPbokRprsChgAgr")
	@BxmCategory(logicalName="모임통장.대표.변경.동의.수정", description="모임통장의 모임장(대표)를 변경을 동의 수정하는 컨트롤러", author="90190263")
	public MPBMetPbokMbhMngUpdateMetPbokRprsChgAgr_ODT updateMetPbokRprsChgAgr(
		@ApiParam(value="input", example="") @RequestBody MPBMetPbokMbhMngUpdateMetPbokRprsChgAgr_IDT input
		)
	{
		/**
		* @BXMType GetBean
		*/
		mPBMetPbokMbhMng_SVC= WFApplicationContext.getBean(mPBMetPbokMbhMng_SVC, MPBMetPbokMbhMng_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokMbhMngUpdateMetPbokRprsChgAgr_ODT output= new MPBMetPbokMbhMngUpdateMetPbokRprsChgAgr_ODT();
		/*
		 * 로직 추가
		 */
		/*
		 * @BXMType ServiceCall
		 * 모임통장.회원.관리.서비스 모임통장.대표.변경.동의.수정
		 */
		// com.skbank.sml.fns.mpb.svc.MPBMetPbokMbhMng_SVC
		output = mPBMetPbokMbhMng_SVC.updateMetPbokRprsChgAgr(input);
		
		return output;
	}
	
	/**
	 * 모임통장의 차기 모임장이 모임통장의 변경을 승인(수락)하는 컨트롤러 
	 * 
	 * @param input 모임통장.대표.변경.확인.수정.컨트롤러.입력.IO
	 * @return 모임통장.대표.변경.확인.수정.컨트롤러.출력.IO
	 */
	@ApiOperation(
		value = "모임통장.대표.변경.승인.수정"
		, notes = ""
	)
	@PostMapping(value="/updateMetPbokRprsChgApv")
	@BxmCategory(logicalName="모임통장.대표.변경.승인.수정", description="모임통장의 차기 모임장이 모임통장의 변경을 수락하는 컨트롤러", author="90190263")
	public MPBMetPbokMbhMngUpdateMetPbokRprsChgApv_ODT updateMetPbokRprsChgApv(
		@ApiParam(value="input", example="") @RequestBody MPBMetPbokMbhMngUpdateMetPbokRprsChgApv_IDT input
		)
	{
		/**
		* @BXMType GetBean
		*/
		mPBMetPbokMbhMng_SVC= WFApplicationContext.getBean(mPBMetPbokMbhMng_SVC, MPBMetPbokMbhMng_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokMbhMngUpdateMetPbokRprsChgApv_ODT output= new MPBMetPbokMbhMngUpdateMetPbokRprsChgApv_ODT();
		
		/*
		 * @BXMType ServiceCall
		 * 모임통장.회원.관리.서비스 모임통장.대표.변경.확인.수정
		 */
		// com.skbank.sml.fns.mpb.svc.MPBMetPbokMbhMng_SVC
		output = mPBMetPbokMbhMng_SVC.updateMetPbokRprsChgApv(input);
		
		return output;
	}
	
	
	/**
	 * 모임통장(커플통장)의 공동명의인의 정보를 수정하는 컨트롤러
	 * 
	 * @param input 공동명의인.인증.정보.컨트롤러.입력.IO
	 * @return 공동명의인.인증.정보.컨트롤러.출력.IO
	 */ 
	@ApiOperation(
		value = "공동명의인.정보.수정"
		, notes = ""
	)
	@PostMapping(value="/updateAsscNompefInf")
	@BxmCategory(logicalName="공동명의인.정보.수정", description="모임통장(커플통장)의 공동명의인의 정보를 등록하는 컨트롤러", author="90190263")
	public MPBMetPbokMbhMngUpdateAsscNompefInf_ODT updateAsscNompefInf(
		@ApiParam(value="input", example="") @RequestBody MPBMetPbokMbhMngUpdateAsscNompefInf_IDT input
		)
	{
		/**
		* @BXMType GetBean
		*/
		mPBMetPbokMbhMng_SVC= WFApplicationContext.getBean(mPBMetPbokMbhMng_SVC, MPBMetPbokMbhMng_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokMbhMngUpdateAsscNompefInf_ODT output= new MPBMetPbokMbhMngUpdateAsscNompefInf_ODT();
		
		/*
		 * @BXMType ServiceCall
		 * 모임통장.일반.관리.서비스 공동명의인.인증.정보.수정
		 */
		// com.skbank.sml.fns.mpb.svc.MPBMetPbokMbhMng_SVC
		output =  mPBMetPbokMbhMng_SVC.updateAsscNompefInf(input);
		
		return output;
	}
	/**
	 * 모임통장의 회원별로 프로필을 수정 할 수 있도록 관리하는 컨트롤러 
	 * 
	 * @param input 모임통장.나의정보.컨트롤러.입력.IO
	 * @return 모임통장.나의정보.컨트롤러.출력.IO
	 */
	@ApiOperation(
		value = "모임통장.나의이미지정보.수정"
		, notes = ""
	)
	@PostMapping(value="/updateMetPbokMyAlsNmInf")
	@BxmCategory(logicalName="모임통장.나의.별칭명.정보.수정", description="모임통장의 회원별로 프로필을 수정 할 수 있도록 관리하는 컨트롤러 ", author="90190263")
	public MPBMetPbokMbhMngUpdateMetPbokMyAlsNmInf_ODT updateMetPbokMyAlsNmInf(
		@ApiParam(value="input", example="") @RequestBody MPBMetPbokMbhMngUpdateMetPbokMyAlsNmInf_IDT input
		)
	{
		/**
		* @BXMType GetBean
		*/
		mPBMetPbokMbhMng_SVC= WFApplicationContext.getBean(mPBMetPbokMbhMng_SVC, MPBMetPbokMbhMng_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokMbhMngUpdateMetPbokMyAlsNmInf_ODT output= new MPBMetPbokMbhMngUpdateMetPbokMyAlsNmInf_ODT();
	
		/*
		 * @BXMType ServiceCall
		 * 모임통장.회원.관리.서비스 모임통장.나의 별칭명 정보.수정
		 */
		// com.skbank.sml.fns.mpb.svc.MPBMetPbokMbhMng_SVC
		output =  mPBMetPbokMbhMng_SVC.updateMetPbokMyAlsNmInf( input  );
		
		return output;

	}
	
	
	
			
}
