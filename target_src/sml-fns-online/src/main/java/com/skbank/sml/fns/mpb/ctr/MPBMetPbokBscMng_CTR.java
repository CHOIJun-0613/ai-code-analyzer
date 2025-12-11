 package com.skbank.sml.fns.mpb.ctr;

import bxm.common.annotaion.BxmCategory;
//import com.skbank.sml.fns.mpb.ctr.dto.MPBAgrtAgr_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngSelectMbhActInf_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngSelectMbhActInf_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngSelectMetPbokAutoRptInf_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngSelectMetPbokAutoRptInf_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngSelectMetPbokBscInfAcno_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngSelectMetPbokBscInfAcno_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngSelectMetPbokBscInf_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngSelectMetPbokBscInf_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngInsertMetPbokAutoRptPush_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngInsertMetPbokAutoRptPush_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngInsertMetPbokPushNtfcSnd_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngInsertMetPbokPushNtfcSnd_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngSelectMetPbokCmnScrtCrtf_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngSelectMetPbokCmnScrtCrtf_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngSelectMetPbokEsnsPwnoCrtf_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngSelectMetPbokEsnsPwnoCrtf_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngSelectMetPbokImgInf_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngSelectMetPbokImgInf_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngUpdateMetPbokImgInf_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngUpdateMetPbokImgInf_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngSelectMetPbokJnngInf_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngSelectMetPbokJnngInf_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngUpdateMetPbokMetNm_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngUpdateMetPbokMetNm_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngSelectMetPbokMainInf_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngSelectMetPbokMainInf_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngUpdateMetPbokNtfcAgrEst_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngUpdateMetPbokNtfcAgrEst_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngUpdateMetPbokSrvcScss_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngUpdateMetPbokSrvcScss_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngInsertMetPbokBscInf_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngInsertMetPbokBscInf_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngSelectMsgCad_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngSelectMsgCad_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngUpdateNtarInf_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngUpdateNtarInf_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngupdateMetPbokImgInfInlt_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngSelectNtarInf_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngSelectNtarInf_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngUpdateMetPbokImgInfInlt_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngInsertNtarInf_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMngInsertNtarInf_ODT;
import com.skbank.sml.fns.mpb.svc.MPBMetPbokBscMng_SVC;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import fwk.skbank.online.context.WFApplicationContext;

/**
 * 1.업무명 : 금융서비스
 * 2.단위업무명 : NEWWON 중분류 모임통장
 * 3.프로그램명 : 모임통장.일반.관리.컨트롤러
 * 4.설명 : 모임통장의 일반적인 정보를 관리하는 컨트롤러
 * 
 * @Class MPBMetPbokBscMng_CTR.java
 * @author 90190263
 * @since 2024.03.27
 * @version 1.0
 */		
@RestController
@RequestMapping("/sml/fns/mpb/metpbokbscmng")
@BxmCategory(logicalName="모임통장.일반.관리.컨트롤러", description="모임통장의 일반적인 정보를 관리하는 컨트롤러", author="90190263")
@Api(tags={""})
public class MPBMetPbokBscMng_CTR {
	private Logger logger= LoggerFactory.getLogger(getClass());
	
	/**
	 * 모임통장.일반.관리.서비스
	 */
	private MPBMetPbokBscMng_SVC mPBMetPbokBscMng_SVC;
	
	/**
	 *모임통장.공통.보안인증.셋팅
	 * 
	 * @param input 
	 * @return 
	 */
	@ApiOperation(
		value = "모임통장.공통.보안인증.셋팅"
		, notes = ""
	)
	@PostMapping(value="/selectMetPbokCmnScrtCrtf")
	@BxmCategory(logicalName="모임통장.공통.보안인증.셋팅", description="모임통장.공통.보안인증.셋팅 및 로그인 세션 정보를 조회한다", author="90190263")
	public MPBMetPbokBscMngSelectMetPbokCmnScrtCrtf_ODT selectMetPbokCmnScrtCrtf(
		@ApiParam(value="input", example="") @RequestBody MPBMetPbokBscMngSelectMetPbokCmnScrtCrtf_IDT input
		)
	{
		/**
		* @BXMType GetBean
		*/
		mPBMetPbokBscMng_SVC= WFApplicationContext.getBean(mPBMetPbokBscMng_SVC, MPBMetPbokBscMng_SVC.class);

		
		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokBscMngSelectMetPbokCmnScrtCrtf_ODT output = new MPBMetPbokBscMngSelectMetPbokCmnScrtCrtf_ODT();

		/*
		 * @BXMType ServiceCall
		 * 모임통장.일반.관리.서비스 모임통장.가입.정보.조회
		 */
		// com.skbank.sml.fns.mpb.svc.MPBMetPbokBscMng_SVC
		output = mPBMetPbokBscMng_SVC.selectMetPbokCmnScrtCrtf(input);
		
		return output;
	}
	
	/**
	 * 모임통장의 초대된 정보를 조회하는 컨트롤러
	 * 
	 * @param input 모임통장.초대정보.조회.컨트롤러.입력.IO
	 * @return 모임통장.초대정보.조회.컨트롤러.출력.IO
	 */
	@ApiOperation(
		value = "모임통장.가입.정보.조회"
		, notes = ""
	)
	@PostMapping(value="/selectMetPbokJnngInf")
	@BxmCategory(logicalName="모임통장.가입.정보.조회", description="모임통장의 가입 정보를 조회하는 컨트롤러", author="90190263")
	public MPBMetPbokBscMngSelectMetPbokJnngInf_ODT selectMetPbokJnngInf(
		@ApiParam(value="input", example="") @RequestBody MPBMetPbokBscMngSelectMetPbokJnngInf_IDT input
		)
	{
		/**
		* @BXMType GetBean
		*/
		mPBMetPbokBscMng_SVC= WFApplicationContext.getBean(mPBMetPbokBscMng_SVC, MPBMetPbokBscMng_SVC.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */

		MPBMetPbokBscMngSelectMetPbokJnngInf_ODT output= new MPBMetPbokBscMngSelectMetPbokJnngInf_ODT();
		/*
		 * 
		 * 로직 추가
		 */
		 if(logger.isDebugEnabled()) {
			logger.info("90190263 모임통장.가입.정보.조회 CTR input ===== ", input);
		}
		/*
		 * @BXMType ServiceCall
		 * 모임통장.일반.관리.서비스 모임통장.가입.정보.조회
		 */
		// com.skbank.sml.fns.mpb.svc.MPBMetPbokBscMng_SVC
		output = mPBMetPbokBscMng_SVC.selectMetPbokJnngInf(input);
		
		return output;
	}
	
	/**
	 * 모임통장 서비스의 입출금계좌정보를 조회하는 컨트롤러
	 * 
	 * @param input 가입가능.계좌.정보.입력.조회.컨트롤러.입력.IO
	 * @return 가입가능.계좌.정보.입력.조회.컨트롤러.출력.IO
	 */
	@ApiOperation(
		value = "회원.계좌.정보.조회"
		, notes = ""
	)
	@PostMapping(value="/selectMbhActInf")
	@BxmCategory(logicalName="회원.계좌.정보.조회", description="모임통장 서비스의 가입가능여부 및 입출금계좌정보를 조회하는 컨트롤러", author="90190263")
	public MPBMetPbokBscMngSelectMbhActInf_ODT selectMbhActInf(
		@ApiParam(value="input", example="") @RequestBody MPBMetPbokBscMngSelectMbhActInf_IDT input
		)
	{
		/**
		* @BXMType GetBean
		*/
		mPBMetPbokBscMng_SVC= WFApplicationContext.getBean(mPBMetPbokBscMng_SVC, MPBMetPbokBscMng_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokBscMngSelectMbhActInf_ODT output= new MPBMetPbokBscMngSelectMbhActInf_ODT();
		/*
		 * 로직 추가
		 */
		/*
		 * @BXMType ServiceCall
		 * 모임통장.일반.관리.서비스 회원.계좌.정보.조회
		 */
		// com.skbank.sml.fns.mpb.svc.MPBMetPbokBscMng_SVC
		output = mPBMetPbokBscMng_SVC.selectMbhActInf(input);
		
		return output;
	}
	
	/**
	 * 모임통장 서비스를 가입하기 위해 약관을 동의 등록 처리하는 컨트롤러
	 * 
	 * @param input 모임.서비스.대표자.정보.등록.컨트롤러.입력.IO
	 * @return 약관동의.컨트롤러.출력.IO
	 */
	@ApiOperation(
		value = "모임통장.기본정보.등록"
		, notes = ""
	)
	@PostMapping(value="/insertMetPbokBscInf")
	@BxmCategory(logicalName="모임통장.기본정보.등록", description="모임통장 서비스를 가입하기 위해 약관을 동의 등록 처리하는 컨트롤러", author="90190263")
	public MPBMetPbokBscMngInsertMetPbokBscInf_ODT insertMetPbokBscInf(
		@ApiParam(value="input", example="") @RequestBody MPBMetPbokBscMngInsertMetPbokBscInf_IDT input
		)
	{
		/**
		* @BXMType GetBean
		*/
		mPBMetPbokBscMng_SVC= WFApplicationContext.getBean(mPBMetPbokBscMng_SVC, MPBMetPbokBscMng_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokBscMngInsertMetPbokBscInf_ODT output= new MPBMetPbokBscMngInsertMetPbokBscInf_ODT();
		/*
		 * 로직 추가
		 */
		/*
		 * @BXMType ServiceCall
		 * 모임통장.일반.관리.서비스 모임통장.개설.대표.정보.등록
		 */
		// com.skbank.sml.fns.mpb.svc.MPBMetPbokBscMng_SVC
		output = mPBMetPbokBscMng_SVC.insertMetPbokBscInf(input);
		
		return output;
	}
	/**
	 * 모임통장의 기본정보를 조회하는 컨트롤러
	 * 
	 * @param input 모임통장.기본.정보.조회.컨트롤러.입력.IO
	 * @return 모임통장.기본.정보.조회.컨트롤러.출력.IO
	 */
	@ApiOperation(
		value = "모임통장.기본정보.조회"
		, notes = ""
	)
	@PostMapping(value="/selectMetPbokBscInf")
	@BxmCategory(logicalName="모임통장.기본정보.조회", description="모임통장의 기본정보를 조회하는 컨트롤러", author="90190263")
	public MPBMetPbokBscMngSelectMetPbokBscInf_ODT selectMetPbokBscInf(
		@ApiParam(value="input", example="") @RequestBody MPBMetPbokBscMngSelectMetPbokBscInf_IDT input
		)
	{
		/**
		* @BXMType GetBean
		*/
		mPBMetPbokBscMng_SVC= WFApplicationContext.getBean(mPBMetPbokBscMng_SVC, MPBMetPbokBscMng_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokBscMngSelectMetPbokBscInf_ODT output= new MPBMetPbokBscMngSelectMetPbokBscInf_ODT();
		
		/*
		 * @BXMType ServiceCall
		 * 모임통장.일반.관리.서비스 모임통장.기본정보.조회
		 */
		// com.skbank.sml.fns.mpb.svc.MPBMetPbokBscMng_SVC
		output = mPBMetPbokBscMng_SVC.selectMetPbokBscInf(input);
		
		return output;
	}
	
	/**
	 * 모임통장의 기본정보를 계좌번호로 조회하는 컨트롤러
	 * 
	 * @param input 모임통장.기본.정보.조회.컨트롤러.입력.IO
	 * @return 모임통장.기본.정보.조회.컨트롤러.출력.IO
	 */
	@ApiOperation(
		value = "모임통장.기본정보.계좌번호.조회"
		, notes = ""
	)
	@PostMapping(value="/selectMetPbokBscInfAcno")
	@BxmCategory(logicalName="모임통장.기본정보.계좌번호.조회", description="모임통장의 기본정보를 계좌번호로 조회하는 컨트롤러", author="90190263")
	public MPBMetPbokBscMngSelectMetPbokBscInfAcno_ODT selectMetPbokBscInfAcno(
		@ApiParam(value="input", example="") @RequestBody MPBMetPbokBscMngSelectMetPbokBscInfAcno_IDT input
		)
	{
		/**
		* @BXMType GetBean
		*/
		mPBMetPbokBscMng_SVC= WFApplicationContext.getBean(mPBMetPbokBscMng_SVC, MPBMetPbokBscMng_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokBscMngSelectMetPbokBscInfAcno_ODT output= new MPBMetPbokBscMngSelectMetPbokBscInfAcno_ODT();
		
		/*
		 * @BXMType ServiceCall
		 * 모임통장.일반.관리.서비스 모임통장.기본정보.조회
		 */
		// com.skbank.sml.fns.mpb.svc.MPBMetPbokBscMng_SVC
		output = mPBMetPbokBscMng_SVC.selectMetPbokBscInfAcno(input);
		
		return output;
	}
	
	/**
	 * 모임통장의 공지사항 정보를 조회하는 컨트롤러
	 * 
	 * @param input 공지사항.정보.조회.컨트롤러.입력.IO
	 * @return 공지사항.정보.조회.컨트롤러.출력.IO
	 */
	@ApiOperation(
		value = "공지사항.정보.조회"
		, notes = ""
	)
	@PostMapping(value="/selectNtarInf")
	@BxmCategory(logicalName="공지사항.정보.조회", description="모임통장의 공지사항 정보를 조회하는 컨트롤러", author="90190263")
	public MPBMetPbokBscMngSelectNtarInf_ODT selectNtarInf(
		@ApiParam(value="input", example="") @RequestBody MPBMetPbokBscMngSelectNtarInf_IDT input
		)
	{
		/**
		* @BXMType GetBean
		*/
		mPBMetPbokBscMng_SVC= WFApplicationContext.getBean(mPBMetPbokBscMng_SVC, MPBMetPbokBscMng_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokBscMngSelectNtarInf_ODT output= new MPBMetPbokBscMngSelectNtarInf_ODT();
		/*
		 * 로직 추가
		 */
		/*
		 * @BXMType ServiceCall
		 * 모임통장.일반.관리.서비스 공지사항.정보.조회
		 */
		// com.skbank.sml.fns.mpb.svc.MPBMetPbokBscMng_SVC
		output = mPBMetPbokBscMng_SVC.selectNtarInf(input);
		
		return output;
	}
	
	/**
	 * 모임통장의 공지사항 정보를 등록하는 컨트롤러
	 * 
	 * @param input 공지사항.정보.등록.컨트롤러.입력.IO
	 * @return 공지사항.정보.등록.컨트롤러.출력.IO
	 */
	@ApiOperation(
		value = "공지사항.정보.등록"
		, notes = ""
	)
	@PostMapping(value="/insertNtarInf")
	@BxmCategory(logicalName="공지사항.정보.등록", description="모임통장의 공지사항 정보를 등록하는 컨트롤러", author="90190263")
	public MPBMetPbokBscMngInsertNtarInf_ODT insertNtarInf(
		@ApiParam(value="input", example="") @RequestBody MPBMetPbokBscMngInsertNtarInf_IDT input
		)
	{
		/**
		* @BXMType GetBean
		*/
		mPBMetPbokBscMng_SVC= WFApplicationContext.getBean(mPBMetPbokBscMng_SVC, MPBMetPbokBscMng_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokBscMngInsertNtarInf_ODT output = new MPBMetPbokBscMngInsertNtarInf_ODT();
		/*
		 * 로직 추가
		 */
		/*
		 * @BXMType ServiceCall
		 * 모임통장.일반.관리.서비스 공지사항.정보.등록
		 */
		// com.skbank.sml.fns.mpb.svc.MPBMetPbokBscMng_SVC
		output = mPBMetPbokBscMng_SVC.insertNtarInf(input);
		
		return output;
	}
	
	/**
	 * 모임통장의 공지사항 정보를 수정하는 컨트롤러
	 * 
	 * @param input 공지사항.정보.수정.컨트롤러.입력.IO
	 * @return 공지사항.정보.수정.컨트롤러.출력.IO
	 */
	@ApiOperation(
		value = "공지사항.정보.수정"
		, notes = ""
	)
	@PostMapping(value="/updateNtarInf")
	@BxmCategory(logicalName="공지사항.정보.수정", description="모임통장의 공지사항 정보를 수정하는 컨트롤러", author="90190263")
	public MPBMetPbokBscMngUpdateNtarInf_ODT updateNtarInf(
		@ApiParam(value="input", example="") @RequestBody MPBMetPbokBscMngUpdateNtarInf_IDT input
		)
	{
		/**
		* @BXMType GetBean
		*/
		mPBMetPbokBscMng_SVC= WFApplicationContext.getBean(mPBMetPbokBscMng_SVC, MPBMetPbokBscMng_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokBscMngUpdateNtarInf_ODT output= new MPBMetPbokBscMngUpdateNtarInf_ODT();
		/*
		 * 로직 추가
		 */
		/*
		 * @BXMType ServiceCall
		 * 모임통장.일반.관리.서비스 공지사항.정보.수정
		 */
		// com.skbank.sml.fns.mpb.svc.MPBMetPbokBscMng_SVC
		output = mPBMetPbokBscMng_SVC.updateNtarInf(input);
		
		return output;
	}
	
	/**
	 * 모임통장의 메인화면 으로 모임통장에 필요한 데이터를 한눈에 볼 수 있도록 데이터를 조회 하는 컨트롤러
	 * 
	 * @param input 모임통장.관리.메인.정보.조회.컨트롤러.입력.IO
	 * @return 모임통장.관리.메인.정보.조회.컨트롤러.출력.IO
	 */
	@ApiOperation(
		value = "모임통장.메인.정보.조회"
		, notes = ""
	)
	@PostMapping(value="/selectMetPbokMainInf")
	@BxmCategory(logicalName="모임통장.메인.정보.조회", description="모임통장의 메인화면 으로 모임통장에 필요한 데이터를 한눈에 볼 수 있도록 데이터를 조회 하는 컨트롤러", author="90190263")
	public MPBMetPbokBscMngSelectMetPbokMainInf_ODT selectMetPbokMainInf(
		@ApiParam(value="input", example="") @RequestBody MPBMetPbokBscMngSelectMetPbokMainInf_IDT input
		)
	{
		/**
		* @BXMType GetBean
		*/
		mPBMetPbokBscMng_SVC= WFApplicationContext.getBean(mPBMetPbokBscMng_SVC, MPBMetPbokBscMng_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokBscMngSelectMetPbokMainInf_ODT output= new MPBMetPbokBscMngSelectMetPbokMainInf_ODT();
		/*
		 * 로직 추가
		 */
		/*
		 * @BXMType ServiceCall
		 * 모임통장.일반.관리.서비스 모임통장.메인.정보.조회
		 */
		// com.skbank.sml.fns.mpb.svc.MPBMetPbokBscMng_SVC
		output =  mPBMetPbokBscMng_SVC.selectMetPbokMainInf(input);
		
		return output;
	}

	/**
	 * 회비를 미입금한 회원에게 메시지를 조회하기 위한 컨트롤러
	 * 
	 * @param input 메시지.카드.조회.컨트롤러.입력.IO
	 * @return 메시지.카드.조회.컨트롤러.출력.IO
	 */
	@ApiOperation(
		value = "메시지.카드.조회"
		, notes = ""
	)
	@PostMapping(value="/selectMsgCad")
	@BxmCategory(logicalName="메시지.카드.조회", description="회비를 미입금한 회원에게 메시지를 조회하기 위한 컨트롤러", author="90190263")
	public MPBMetPbokBscMngSelectMsgCad_ODT selectMsgCad(
		@ApiParam(value="input", example="") @RequestBody MPBMetPbokBscMngSelectMsgCad_IDT input
		)
	{
		/**
		* @BXMType GetBean
		*/
		mPBMetPbokBscMng_SVC= WFApplicationContext.getBean(mPBMetPbokBscMng_SVC, MPBMetPbokBscMng_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		
		/*
		 * @BXMType ServiceCall
		 * 모임통장.일반.관리.서비스 메시지.카드.조회
		 */
		// com.skbank.sml.fns.mpb.svc.MPBMetPbokBscMng_SVC
		MPBMetPbokBscMngSelectMsgCad_ODT output = mPBMetPbokBscMng_SVC.selectMsgCad(input);
		
		return output;
	}
	
	/**
	 * 모임통장의 알림 동의에 대한 설정된 정보를 수정하는 서비스
	 * 
	 * @param input 모임통장.알림.동의.설정.수정.컨트롤러.입력.IO
	 * @return 모임통장.알림.동의.설정.수정.컨트롤러.출력.IO
	 */
	@ApiOperation(
		value = "모임통장.알림.동의.설정.수정"
		, notes = ""
	)
	@PostMapping(value="/updateMetPbokNtfcAgrEst")
	@BxmCategory(logicalName="모임통장.알림.동의.설정.수정", description="모임통장의 알림 동의에 대한 설정된 정보를 수정하는 서비스", author="90190263")
	public MPBMetPbokBscMngUpdateMetPbokNtfcAgrEst_ODT updateMetPbokNtfcAgrEst(
		@ApiParam(value="input", example="") @RequestBody MPBMetPbokBscMngUpdateMetPbokNtfcAgrEst_IDT input
		)
	{
		/**
		* @BXMType GetBean
		*/
		mPBMetPbokBscMng_SVC= WFApplicationContext.getBean(mPBMetPbokBscMng_SVC, MPBMetPbokBscMng_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokBscMngUpdateMetPbokNtfcAgrEst_ODT output= new MPBMetPbokBscMngUpdateMetPbokNtfcAgrEst_ODT();
		
		/*
		 * @BXMType ServiceCall
		 * 모임통장.일반.관리.서비스 모임통장.알림.동의.설정.수정
		 */
		// com.skbank.sml.fns.mpb.svc.MPBMetPbokBscMng_SVC
		output = mPBMetPbokBscMng_SVC.updateMetPbokNtfcAgrEst(input);
		
		return output;
	}
	
	/**
	 * 모임통장의 모임명을 수정 관리하는 컨트롤러
	 * 
	 * @param input 모임통장.모임명.수정.컨트롤러.입력.IO
	 * @return 모임통장.모임명.수정.컨트롤러.출력.IO
	 */
	@ApiOperation(
		value = "모임통장.모임명.수정"
		, notes = ""
	)
	@PostMapping(value="/updateMetPbokMetNm")
	@BxmCategory(logicalName="모임통장.모임명.수정", description="모임통장의 모임명을 수정 관리하는 컨트롤러", author="90190263")
	public MPBMetPbokBscMngUpdateMetPbokMetNm_ODT updateMetPbokMetNm(
		@ApiParam(value="input", example="") @RequestBody MPBMetPbokBscMngUpdateMetPbokMetNm_IDT input
		)
	{
		/**
		* @BXMType GetBean
		*/
		mPBMetPbokBscMng_SVC= WFApplicationContext.getBean(mPBMetPbokBscMng_SVC, MPBMetPbokBscMng_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokBscMngUpdateMetPbokMetNm_ODT output= new MPBMetPbokBscMngUpdateMetPbokMetNm_ODT();
		
		/*
		 * @BXMType ServiceCall
		 * 모임통장.일반.관리.서비스 모임통장.모임명.수정
		 */
		// com.skbank.sml.fns.mpb.svc.MPBMetPbokBscMng_SVC
		output = mPBMetPbokBscMng_SVC.updateMetPbokMetNm(input);
		
		return output;
	}
	
	/**
	 * 모임통장의 서비스를 탈퇴함에 있어 입력비밀번호를 확인 후, 전체 모임원, 모임톨장을 해지 수정하는 컨트롤러
	 * 
	 * @param input 모임통장.서비스.탈퇴.컨트롤러.입력.IO
	 * @return 모임통장.서비스.탈퇴.컨트롤러.출력.IO
	 */
	@ApiOperation(
		value = "모임통장.서비스.탈퇴.수정"
		, notes = ""
	)
	@PostMapping(value="/updateMetPbokSrvcScss")
	@BxmCategory(logicalName="모임통장.서비스.탈퇴.수정", description="모임통장의 서비스를 탈퇴함에 있어 입력비밀번호를 확인 후, 전체 모임원, 모임톨장을 해지 수정하는 컨트롤러", author="90190263")
	public MPBMetPbokBscMngUpdateMetPbokSrvcScss_ODT updateMetPbokSrvcScss(
		@ApiParam(value="input", example="") @RequestBody MPBMetPbokBscMngUpdateMetPbokSrvcScss_IDT input
		)
	{
		/**
		* @BXMType GetBean
		*/
		mPBMetPbokBscMng_SVC= WFApplicationContext.getBean(mPBMetPbokBscMng_SVC, MPBMetPbokBscMng_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokBscMngUpdateMetPbokSrvcScss_ODT output= new MPBMetPbokBscMngUpdateMetPbokSrvcScss_ODT();
		/*
		 * 로직 추가
		 */
		/*
		 * @BXMType ServiceCall
		 * 모임통장.일반.관리.서비스 모임통장.서비스.탈퇴.수정
		 */
		// com.skbank.sml.fns.mpb.svc.MPBMetPbokBscMng_SVC
		output = mPBMetPbokBscMng_SVC.updateMetPbokSrvcScss(input);
		return output;
	}
	


	/**
	 * 모임통장의 이미지를 수정 할 수 있도록 관리하는 컨트롤러 
	 * 
	 * @param input 모임통장.이미지.정보.컨트롤러.입력.IO
	 * @return 모임통장.이미지.정보.컨트롤러.출력.IO
	 */
	@ApiOperation(
		value = "모임통장.이미지.정보.수정"
		, notes = ""
	)
	@PostMapping(value="/updateMetPbokImgInf", 
	consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.MULTIPART_FORM_DATA_VALUE})
	@BxmCategory(logicalName="모임통장.이미지.정보.수정", description="모임통장의 이미지를 수정 할 수 있도록 관리하는 컨트롤러 ", author="90190263")
	public ResponseEntity<MPBMetPbokBscMngUpdateMetPbokImgInf_ODT> updateMetPbokImgInf(
		@RequestPart MPBMetPbokBscMngUpdateMetPbokImgInf_IDT input, @RequestPart MultipartFile multiPartFile
		)
	{
		/**
		* @BXMType GetBean
		*/
		mPBMetPbokBscMng_SVC= WFApplicationContext.getBean(mPBMetPbokBscMng_SVC, MPBMetPbokBscMng_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokBscMngUpdateMetPbokImgInf_ODT output= new MPBMetPbokBscMngUpdateMetPbokImgInf_ODT();
	
		/*
		 * @BXMType ServiceCall
		 * 모임통장.일반.관리.서비스 모임통장.이미지.정보.수정
		 */
		// com.skbank.sml.fns.mpb.svc.MPBMetPbokMbhMng_SVC
		output =  mPBMetPbokBscMng_SVC.updateMetPbokImgInf( input, multiPartFile );
		
		//return output;
		return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(output);

	}
	/**
	 * 모임통장의 이미지 정보를 초기화하는 컨트롤러
	 * 
	 * @param input 모임통장.이미지.정보.초기화.수정.컨트롤러.입력.IO
	 * @return 모임통장.이미지.정보.초기화.수정.컨트롤러.출력.IO
	 */
	@ApiOperation(
		value = "모임통장.이미지.정보.초기화.수정"
		, notes = ""
	)
	@PostMapping(value="/updateMetPbokImgInfInlt")
	@BxmCategory(logicalName="모임통장.이미지.정보.초기화.수정", description="모임통장 이미지 정보를 초기화 하는 컨트롤러", author="90190263")
	public MPBMetPbokBscMngupdateMetPbokImgInfInlt_ODT updateMetPbokImgInfInlt(
		@ApiParam(value="input", example="") @RequestBody MPBMetPbokBscMngUpdateMetPbokImgInfInlt_IDT input
		)
	{
		/**
		* @BXMType GetBean
		*/
		mPBMetPbokBscMng_SVC= WFApplicationContext.getBean(mPBMetPbokBscMng_SVC, MPBMetPbokBscMng_SVC.class);

		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokBscMngupdateMetPbokImgInfInlt_ODT output= new MPBMetPbokBscMngupdateMetPbokImgInfInlt_ODT();

		output =  mPBMetPbokBscMng_SVC.updateMetPbokImgInfInlt(input);
		
		return output;
	}
	

	/**
	 * 모임통장의 자동리포트 데이터를 조회하는 컨트롤러
	 * 
	 * @param input 모임통장.자동리포트.정보.조회.컨트롤러.입력.IO
	 * @return 모임통장.자동리포트.정보.조회.컨트롤러.출력.IO
	 */
	@ApiOperation(
		value = "모임통장.자동.리포트.정보.조회"
		, notes = ""
	)
	@PostMapping(value="/selectMetPbokAutoRptInf")
	@BxmCategory(logicalName="모임통장.자동리포트.정보.조회", description="모임통장의 자동리포트 데이터를 조회 하는 컨트롤러", author="90191355")
	public MPBMetPbokBscMngSelectMetPbokAutoRptInf_ODT selectMetPbokAutoRptInf(
		@ApiParam(value="input", example="") @RequestBody MPBMetPbokBscMngSelectMetPbokAutoRptInf_IDT input
		)
	{ 
		/**
		* @BXMType GetBean
		*/
		mPBMetPbokBscMng_SVC= WFApplicationContext.getBean(mPBMetPbokBscMng_SVC, MPBMetPbokBscMng_SVC.class);

		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokBscMngSelectMetPbokAutoRptInf_ODT output= new MPBMetPbokBscMngSelectMetPbokAutoRptInf_ODT();

		output =  mPBMetPbokBscMng_SVC.selectMetPbokAutoRptInf(input);
		
		return output;
	}
	
	/**
	 * 모임통장 자동리포트 푸쉬 생성 컨트롤러
	 * 
	 * @param input 모임통장.자동리포트.푸쉬.생성.컨트롤러.입력.IO
	 * @return 모임통장.자동리포트..생성.푸쉬.컨트롤러.출력.IO
	 */
	@ApiOperation(
		value = "모임통장.자동.리포트.푸쉬.생성"
		, notes = ""
	)
	@PostMapping(value="/insertMetPbokAutoRptPush")
	@BxmCategory(logicalName="모임통장.자동리포트.푸쉬.생성", description="모임통장의 자동리포팅 푸쉬 생성 컨트롤러", author="90191355")
	public MPBMetPbokBscMngInsertMetPbokAutoRptPush_ODT insertMetPbokAutoRptPush(
		@ApiParam(value="input", example="") @RequestBody MPBMetPbokBscMngInsertMetPbokAutoRptPush_IDT input
		)
	{
		/**
		* @BXMType GetBean
		*/
		mPBMetPbokBscMng_SVC= WFApplicationContext.getBean(mPBMetPbokBscMng_SVC, MPBMetPbokBscMng_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokBscMngInsertMetPbokAutoRptPush_ODT output= new MPBMetPbokBscMngInsertMetPbokAutoRptPush_ODT();

		output =  mPBMetPbokBscMng_SVC.insertMetPbokAutoRptPush(input);
		
		return output;
	}
	/**
	 * 모임통장 이미지 정보를 조회하기 위한 컴포넌트
	 * 
	 * @param input 이미지.정보.조회.컨트롤러.입력.IO
	 * @return 이미지.정보.조회.컨트롤러.출력.IO
	 */
	@ApiOperation(
			value = "모임통장.이미지.정보.조회"
			, notes = ""
		)
	@PostMapping(value="/selectMetPbokImgInf")
	@BxmCategory(logicalName = "모임통장.이미지.정보.조회", description = "모임통장의 이미지를 조회하는 컴포넌트", author = "90191355")
	public MPBMetPbokBscMngSelectMetPbokImgInf_ODT selectMetPbokImgInf(@ApiParam(value="input", example="") @RequestBody MPBMetPbokBscMngSelectMetPbokImgInf_IDT input) {
		/**
		* @BXMType GetBean
		*/
		mPBMetPbokBscMng_SVC= WFApplicationContext.getBean(mPBMetPbokBscMng_SVC, MPBMetPbokBscMng_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokBscMngSelectMetPbokImgInf_ODT output= new MPBMetPbokBscMngSelectMetPbokImgInf_ODT();

		output =  mPBMetPbokBscMng_SVC.selectMetPbokImgInf(input);
		
		return output;
	}
	
	/**
	 * 모임통장의 간편비밀번호 인증을 조회
	 * 
	 * @param input 모임통장.간편.비밀번호.인증.컨트롤러.입력.IO
	 * @return 모임통장.간편.비밀번호.인증.컨트롤러.출력.IO
	 */
	@ApiOperation(
			value = "모임통장.간편비밀번호.인증.조회"
			, notes = ""
		)
	@PostMapping(value="/selectMetPbokEsnsPwnoCrtf")
	@BxmCategory(logicalName = "모임통장.간편.비밀번호.인증.조회", description = " 모임통장의 간편비밀번호 인증을 조회", author = "90191355")
	public MPBMetPbokBscMngSelectMetPbokEsnsPwnoCrtf_ODT selectMetPbokEsnsPwnoCrtf(@ApiParam(value="input", example="") @RequestBody MPBMetPbokBscMngSelectMetPbokEsnsPwnoCrtf_IDT input) {
		/**
		* @BXMType GetBean
		*/
		mPBMetPbokBscMng_SVC= WFApplicationContext.getBean(mPBMetPbokBscMng_SVC, MPBMetPbokBscMng_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokBscMngSelectMetPbokEsnsPwnoCrtf_ODT output= new MPBMetPbokBscMngSelectMetPbokEsnsPwnoCrtf_ODT();

		output =  mPBMetPbokBscMng_SVC.selectMetPbokEsnsPwnoCrtf(input);
		
		return output;
	}
	
	/**
	 * 모임통장의 PUSH 알림을 발송한다.
	 * 
	 * @param input 모임통장.PUSH.알림.발송컨트롤러.입력.IO
	 * @return 모임통장.PUSH.알림.발송.컨트롤러.출력.IO
	 */
	@ApiOperation(
			value = "모임통장.PUSH.알림.발송"
			, notes = ""
		)
	@PostMapping(value="/insertMetPbokPushNtfcSnd")
	@BxmCategory(logicalName = "모임통장.PUSH.알림.발송", description = "모임통장.PUSH.알림.발송", author = "90191355")
	public MPBMetPbokBscMngInsertMetPbokPushNtfcSnd_ODT insertMetPbokPushNtfcSnd(@ApiParam(value="input", example="") @RequestBody MPBMetPbokBscMngInsertMetPbokPushNtfcSnd_IDT input) {
		/**
		* @BXMType GetBean
		*/
		mPBMetPbokBscMng_SVC= WFApplicationContext.getBean(mPBMetPbokBscMng_SVC, MPBMetPbokBscMng_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokBscMngInsertMetPbokPushNtfcSnd_ODT output = new MPBMetPbokBscMngInsertMetPbokPushNtfcSnd_ODT();

		output = mPBMetPbokBscMng_SVC.insertMetPbokPushNtfcSnd(input);
		
		return output;
	}
	
}
