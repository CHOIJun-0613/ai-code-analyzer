package com.skbank.sml.fns.inb.ctr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skbank.sml.fns.inb.ctr.dto.INBSmsRawNtcSrvcCallSmsCrtfNoChk_IDT;
import com.skbank.sml.fns.inb.ctr.dto.INBSmsRawNtcSrvcCallSmsCrtfNoChk_ODT;
import com.skbank.sml.fns.inb.ctr.dto.INBSmsRawNtcSrvcCallSmsCrtfNoSnd_IDT;
import com.skbank.sml.fns.inb.ctr.dto.INBSmsRawNtcSrvcCallSmsCrtfNoSnd_ODT;
import com.skbank.sml.fns.inb.ctr.dto.INBSmsRawNtcSrvcCallSmsRawJnngInfScrn_ODT;
import com.skbank.sml.fns.inb.ctr.dto.INBSmsRawNtcSrvcSelectSmsRawNtcRduPrdTgtAct_IDT;
import com.skbank.sml.fns.inb.ctr.dto.INBSmsRawNtcSrvcSelectSmsRawNtcRduPrdTgtAct_ODT;
import com.skbank.sml.fns.inb.ctr.dto.INBSmsRawNtcSrvcDeleteSmsRawNtcTxt_IDT;
import com.skbank.sml.fns.inb.ctr.dto.INBSmsRawNtcSrvcDeleteSmsRawNtcTxt_ODT;
import com.skbank.sml.fns.inb.ctr.dto.INBSmsRawNtcSrvcInsertSmsRawNtcTxt_IDT;
import com.skbank.sml.fns.inb.ctr.dto.INBSmsRawNtcSrvcInsertSmsRawNtcTxt_ODT;
import com.skbank.sml.fns.inb.ctr.dto.INBSmsRawNtcSrvcUpdateSmsRawNtcTxt_IDT;
import com.skbank.sml.fns.inb.ctr.dto.INBSmsRawNtcSrvcUpdateSmsRawNtcTxt_ODT;
import com.skbank.sml.fns.inb.ctr.dto.INBSmsRawNtcSrvcSelectSmsRawFeeList_ODT;
import com.skbank.sml.fns.inb.ctr.dto.INBSmsRawNtcSrvcSelectSmsRawSrvcBsci_IDT;
import com.skbank.sml.fns.inb.ctr.dto.INBSmsRawNtcSrvcSelectSmsRawSrvcBsci_ODT;
import com.skbank.sml.fns.inb.ctr.dto.INBSmsRawNtcSrvcCallSmsRawNtcJnngInfCnfScrn_IDT;
import com.skbank.sml.fns.inb.ctr.dto.INBSmsRawNtcSrvcCallSmsRawNtcJnngInfCnfScrn_ODT;
import com.skbank.sml.fns.inb.svc.INBSmsRawNtcSrvc_SVC;

import bxm.common.annotaion.BxmCategory;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import fwk.skbank.online.context.WFApplicationContext;

/**
 * 1.업무명 : 금융서비스
 * 2.단위업무명 : NEWWON 중분류 통합알림함
 * 3.프로그램명 : SMS입출금통지서비스.컨트롤러 
 * 4.설명 : SMS입출금통지서비스.컨트롤러
 * 
 * @Class INBSmsRawNtcSrvc_CTR.java
 * @author 90190264
 * @since 2024.04.03
 * @version 1.0
 */		
@RestController
@RequestMapping("/sml/fns/inb/smsrawntcsrvc")
@BxmCategory(logicalName="SMS입출금통지서비스.컨트롤러", description="SMS입출금통지서비스.컨트롤러", author="90190264")
@Api(tags={""})
public class INBSmsRawNtcSrvc_CTR {
	private Logger logger= LoggerFactory.getLogger(getClass());
	
	/**
	 * SMS입출금통지서비스.서비스
	 */
	private INBSmsRawNtcSrvc_SVC iNBSmsRawNtcSrvc_SVC;
	
	/**
	 * SMS입출금통지서비스.등록내역.조회
	 * 
	 * @param input SMS입출금.서비스.기본정보.컨트롤러.입력.IO
	 * @return SMS입출금.서비스.기본정보.컨트롤러.출력.IO 
	 */
	@ApiOperation(
		value = "SMS입출금.서비스.기본정보.조회"
		, notes = ""
	)
	@PostMapping(value="/selectSmsRawSrvcBsci")
	@BxmCategory(logicalName="SMS입출금.서비스.기본정보.조회", description="SMS입출금통지서비스.등록내역.조회", author="90190264")
	public INBSmsRawNtcSrvcSelectSmsRawSrvcBsci_ODT selectSmsRawSrvcBsci(
		@ApiParam(value="input", example="") @RequestBody INBSmsRawNtcSrvcSelectSmsRawSrvcBsci_IDT input
		)
	{
		/**
		* @BXMType GetBean
		*/
		iNBSmsRawNtcSrvc_SVC= WFApplicationContext.getBean(iNBSmsRawNtcSrvc_SVC, INBSmsRawNtcSrvc_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		INBSmsRawNtcSrvcSelectSmsRawSrvcBsci_ODT output= new INBSmsRawNtcSrvcSelectSmsRawSrvcBsci_ODT();
		/*
		 * @BXMType ServiceCall
		 * SMS입출금통지서비스.서비스 SMS입출금.서비스.기본정보.조회
		 */
		output = iNBSmsRawNtcSrvc_SVC.selectSmsRawSrvcBsci(input);
		
		return output;
	}
	
	/**
	 * SMS입출금.가입정보.화면.호출
	 * 
	 * @param input SMS입출금.가입정보.화면.컨트롤러.입력.IO
	 * @return SMS입출금.가입정보.화면.컨트롤러.출력.IO
	 */
	@ApiOperation(
		value = "SMS입출금.가입정보.화면.호출"
		, notes = ""
	)
	@PostMapping(value="/callSmsRawJnngInfScrn")
	@BxmCategory(logicalName="SMS입출금.가입정보.화면.호출", description="SMS입출금.가입정보.화면.호출", author="90190264")
	public INBSmsRawNtcSrvcCallSmsRawJnngInfScrn_ODT callSmsRawJnngInfScrn()
	{
		/**
		* @BXMType GetBean
		*/
		iNBSmsRawNtcSrvc_SVC= WFApplicationContext.getBean(iNBSmsRawNtcSrvc_SVC, INBSmsRawNtcSrvc_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		INBSmsRawNtcSrvcCallSmsRawJnngInfScrn_ODT output= new INBSmsRawNtcSrvcCallSmsRawJnngInfScrn_ODT();
		/*
		 * @BXMType ServiceCall
		 * SMS입출금통지서비스.서비스 SMS입출금.가입정보.화면.호출
		 */
		output = iNBSmsRawNtcSrvc_SVC.callSmsRawJnngInfScrn();
		
		return output;
	}
	
	/**
	 * SMS입출금통지.감면.상품.대상계좌.조회 
	 * 
	 * @param input SMS입출금통지.감면상품.대상계좌.컨트롤러.입력.IO
	 * @return SMS입출금통지.감면상품.대상계좌.컨트롤러.출력.IO
	 */
	@ApiOperation(
		value = "SMS입출금통지.감면.상품.대상계좌.조회"
		, notes = ""
	)
	@PostMapping(value="/selectSmsRawNtcRduPrdTgtAct")
	@BxmCategory(logicalName="SMS입출금통지.감면.상품.대상계좌.조회", description="SMS입출금통지.감면.상품.대상계좌.조회", author="90190264")
	public INBSmsRawNtcSrvcSelectSmsRawNtcRduPrdTgtAct_ODT selectSmsRawNtcRduPrdTgtAct(
		@ApiParam(value="input", example="") @RequestBody INBSmsRawNtcSrvcSelectSmsRawNtcRduPrdTgtAct_IDT input
		)
	{
		/**
		* @BXMType GetBean
		*/
		iNBSmsRawNtcSrvc_SVC= WFApplicationContext.getBean(iNBSmsRawNtcSrvc_SVC, INBSmsRawNtcSrvc_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		INBSmsRawNtcSrvcSelectSmsRawNtcRduPrdTgtAct_ODT output= new INBSmsRawNtcSrvcSelectSmsRawNtcRduPrdTgtAct_ODT();
		/*
		 * @BXMType ServiceCall
		 * SMS입출금통지서비스.서비스 SMS입출금통지.감면.상품.대상계좌.조회
		 */
		output = iNBSmsRawNtcSrvc_SVC.selectSmsRawNtcRduPrdTgtAct(input);
		
		return output;
	}
	
	/**
	 * SMS입출금통지.가입정보.확인.화면.호출
	 * 
	 * @param input 자금이체.SMS인증대상.확인.컨트롤러.입력.IO
	 * @return 자금이체.SMS인증대상.확인.컨트롤러.출력.IO
	 */
	@ApiOperation(
		value = "SMS입출금통지.가입정보.확인.화면.호출"
		, notes = ""
	)
	@PostMapping(value="/callSmsRawNtcJnngInfCnfScrn")
	@BxmCategory(logicalName="SMS입출금통지.가입정보.확인.화면.호출", description="SMS입출금통지.가입정보.확인.화면.호출", author="90190264")
	public INBSmsRawNtcSrvcCallSmsRawNtcJnngInfCnfScrn_ODT callSmsRawNtcJnngInfCnfScrn(
		@ApiParam(value="input", example="") @RequestBody INBSmsRawNtcSrvcCallSmsRawNtcJnngInfCnfScrn_IDT input
		)
	{
		/**
		* @BXMType GetBean
		*/
		iNBSmsRawNtcSrvc_SVC= WFApplicationContext.getBean(iNBSmsRawNtcSrvc_SVC, INBSmsRawNtcSrvc_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		INBSmsRawNtcSrvcCallSmsRawNtcJnngInfCnfScrn_ODT output = new INBSmsRawNtcSrvcCallSmsRawNtcJnngInfCnfScrn_ODT();
		/*
		 * @BXMType ServiceCall
		 * SMS입출금통지서비스.서비스 SMS입출금통지.가입정보.확인.화면.호출
		 */
		output = iNBSmsRawNtcSrvc_SVC.callSmsRawNtcJnngInfCnfScrn(input);
		
		return output;
	}
	
	/**
	 * SMS입출금통지.내용.등록
	 * 
	 * @param input SMS입출금통지.내용.컨트롤러.입력.IO
	 * @return SMS입출금통지.내용.컨트롤러.출력.IO
	 */
	@ApiOperation(
		value = "SMS입출금통지.내용.등록"
		, notes = ""
	)
	@PostMapping(value="/insertSmsRawNtcTxt")
	@BxmCategory(logicalName="SMS입출금통지.내용.등록", description="SMS입출금통지.내용.등록", author="90190264")
	public INBSmsRawNtcSrvcInsertSmsRawNtcTxt_ODT insertSmsRawNtcTxt(
		@ApiParam(value="input", example="") @RequestBody INBSmsRawNtcSrvcInsertSmsRawNtcTxt_IDT input
		)
	{
		/**
		* @BXMType GetBean
		*/
		iNBSmsRawNtcSrvc_SVC= WFApplicationContext.getBean(iNBSmsRawNtcSrvc_SVC, INBSmsRawNtcSrvc_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		INBSmsRawNtcSrvcInsertSmsRawNtcTxt_ODT output= new INBSmsRawNtcSrvcInsertSmsRawNtcTxt_ODT();
		/*
		 * @BXMType ServiceCall
		 * SMS입출금통지서비스.서비스 SMS입출금통지.내용.등록
		 */
		output = iNBSmsRawNtcSrvc_SVC.insertSmsRawNtcTxt(input);
		
		return output;
	}
	
	/**
	 * SMS입출금통지.내용.수정
	 * 
	 * @param input SMS입출금통지.내용.컨트롤러.입력.IO
	 * @return SMS입출금통지.내용.컨트롤러.출력.IO
	 */
	@ApiOperation(
		value = "SMS입출금통지.내용.수정"
		, notes = ""
	)
	@PostMapping(value="/updateSmsRawNtcTxt")
	@BxmCategory(logicalName="SMS입출금통지.내용.수정", description="SMS입출금통지.내용.수정", author="90190264")
	public INBSmsRawNtcSrvcUpdateSmsRawNtcTxt_ODT updateSmsRawNtcTxt(
		@ApiParam(value="input", example="") @RequestBody INBSmsRawNtcSrvcUpdateSmsRawNtcTxt_IDT input
		)
	{
		/**
		* @BXMType GetBean
		*/
		iNBSmsRawNtcSrvc_SVC= WFApplicationContext.getBean(iNBSmsRawNtcSrvc_SVC, INBSmsRawNtcSrvc_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		INBSmsRawNtcSrvcUpdateSmsRawNtcTxt_ODT output= new INBSmsRawNtcSrvcUpdateSmsRawNtcTxt_ODT();
		/*
		 * @BXMType ServiceCall
		 * SMS입출금통지서비스.서비스 SMS입출금통지.내용.수정
		 */
		output = iNBSmsRawNtcSrvc_SVC.updateSmsRawNtcTxt(input);
		
		return output;
	}
	
	/**
	 * SMS입출금통지.내용.삭제
	 * 
	 * @param input SMS입출금통지.내용.컨트롤러.입력.IO
	 * @return SMS입출금통지.내용.컨트롤러.출력.IO
	 */
	@ApiOperation(
		value = "SMS입출금통지.내용.삭제"
		, notes = ""
	)
	@PostMapping(value="/deleteSmsRawNtcTxt")
	@BxmCategory(logicalName="SMS입출금통지.내용.삭제", description="SMS입출금통지.내용.삭제", author="90190264")
	public INBSmsRawNtcSrvcDeleteSmsRawNtcTxt_ODT deleteSmsRawNtcTxt(
		@ApiParam(value="input", example="") @RequestBody INBSmsRawNtcSrvcDeleteSmsRawNtcTxt_IDT input
		)
	{
		/**
		* @BXMType GetBean
		*/
		iNBSmsRawNtcSrvc_SVC= WFApplicationContext.getBean(iNBSmsRawNtcSrvc_SVC, INBSmsRawNtcSrvc_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		INBSmsRawNtcSrvcDeleteSmsRawNtcTxt_ODT output= new INBSmsRawNtcSrvcDeleteSmsRawNtcTxt_ODT();
		/*
		 * @BXMType ServiceCall
		 * SMS입출금통지서비스.서비스 SMS입출금통지.내용.삭제
		 */
		output = iNBSmsRawNtcSrvc_SVC.deleteSmsRawNtcTxt(input);
		
		return output;
	}
	
	/**
	 * SMS입출금.수수료목록.조회
	 * 
	 * @param input SMS입출금.수수료목록.조회.컨트롤러.입력.IO
	 * @return SMS입출금.수수료목록.조회.컨트롤러.출력.IO 
	 */
	@ApiOperation(
		value = "SMS입출금.수수료목록.조회"
		, notes = ""
	)
	@PostMapping(value="/selectSmsRawFeeList")
	@BxmCategory(logicalName="SMS입출금.수수료목록.조회", description="SMS입출금.수수료목록.조회", author="90190264")
	public INBSmsRawNtcSrvcSelectSmsRawFeeList_ODT selectSmsRawFeeList()
	{
		/**
		* @BXMType GetBean
		*/
		iNBSmsRawNtcSrvc_SVC= WFApplicationContext.getBean(iNBSmsRawNtcSrvc_SVC, INBSmsRawNtcSrvc_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		INBSmsRawNtcSrvcSelectSmsRawFeeList_ODT output= new INBSmsRawNtcSrvcSelectSmsRawFeeList_ODT();
		/*
		 * @BXMType ServiceCall
		 * SMS입출금통지서비스.서비스 SMS입출금.수수료목록.조회
		 */
		output = iNBSmsRawNtcSrvc_SVC.selectSmsRawFeeList();
		
		return output;
	}
	
	/**
	 * SMS인증번호.발송 호출 
	 * 
	 * @param input SMS인증번호.발송 호출.컨트롤러.입력.IO
	 * @return SMS인증번호발송.호출.컨트롤러.출력.IO 
	 */
	@ApiOperation(
		value = "SMS인증번호.발송 호출"
		, notes = ""
	)
	@PostMapping(value="/callSmsCrtfNoSnd")
	@BxmCategory(logicalName="SMS인증번호.발송.호출", description="SMS인증번호.발송 호출", author="90190264")
	public INBSmsRawNtcSrvcCallSmsCrtfNoSnd_ODT callSmsCrtfNoSnd(@ApiParam(value="input", example="") @RequestBody INBSmsRawNtcSrvcCallSmsCrtfNoSnd_IDT input)
	{
		/**
		* @BXMType GetBean
		*/
		iNBSmsRawNtcSrvc_SVC= WFApplicationContext.getBean(iNBSmsRawNtcSrvc_SVC, INBSmsRawNtcSrvc_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		INBSmsRawNtcSrvcCallSmsCrtfNoSnd_ODT output= new INBSmsRawNtcSrvcCallSmsCrtfNoSnd_ODT();
		/*
		 * @BXMType ServiceCall
		 * SMS입출금통지서비스.서비스 SMS인증번호.발송 호출
		 */
		output = iNBSmsRawNtcSrvc_SVC.callSmsCrtfNoSnd(input);
		
		return output;
	}
	
	/**
	 * SMS인증번호.확인 호출 
	 * 
	 * @param input SMS인증번호.확인 호출.컨트롤러.입력.IO
	 * @return SMS인증번호확인.호출.컨트롤러.출력.IO 
	 */
	@ApiOperation(
		value = "SMS인증번호.발송 호출"
		, notes = ""
	)
	@PostMapping(value="/callSmsCrtfNoChk")
	@BxmCategory(logicalName="SMS인증번호.확인.호출", description="SMS인증번호.확인 호출", author="90190264")
	public INBSmsRawNtcSrvcCallSmsCrtfNoChk_ODT callSmsCrtfNoChk(@ApiParam(value="input", example="") @RequestBody INBSmsRawNtcSrvcCallSmsCrtfNoChk_IDT input)
	{
		/**
		* @BXMType GetBean
		*/
		iNBSmsRawNtcSrvc_SVC= WFApplicationContext.getBean(iNBSmsRawNtcSrvc_SVC, INBSmsRawNtcSrvc_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		INBSmsRawNtcSrvcCallSmsCrtfNoChk_ODT output= new INBSmsRawNtcSrvcCallSmsCrtfNoChk_ODT();
		/*
		 * @BXMType ServiceCall
		 * SMS입출금통지서비스.서비스 SMS인증번호.확인 호출
		 */
		output = iNBSmsRawNtcSrvc_SVC.callSmsCrtfNoChk(input);
		
		return output;
	}
	
			
}
