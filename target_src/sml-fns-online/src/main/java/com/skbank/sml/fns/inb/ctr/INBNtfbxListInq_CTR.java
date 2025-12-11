package com.skbank.sml.fns.inb.ctr;

import bxm.common.annotaion.BxmCategory;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxListInqSelectCtgrClf_IDT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxListInqSelectCtgrClf_ODT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxListInqSelectKataNtfcList_ODT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxListInqSelectPushNtfcList_IDT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxListInqSelectSmsNtfcList_IDT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxListInqSelectPushNtfcList_ODT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxListInqSelectSmsNtfcList_ODT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxListInqSelectUserInf_ODT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxListInqSelectKataNtfcList_IDT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxListInqUpdateNtfcFavt_IDT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxListInqUpdateNtfcFavt_ODT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxListInqUpdateReadYn_IDT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxListInqUpdateReadYn_ODT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxListInqSelectMrktAgrYn_ODT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxListInqSelectPushAgrYn_IDT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxListInqSelectPushAgrYn_ODT;
import com.skbank.sml.fns.inb.svc.INBNtfbxListInq_SVC;
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
 * 2.단위업무명 : NEWWON 중분류 통합알림함
 * 3.프로그램명 : 알림함.목록.조회.컨트롤러
 * 4.설명 : 통합알림함 PUSH, SMS, KAKAO 알림 목록을 조회 한다.
 * 
 * @Class INBNtfbxListInq_CTR.java
 * @author 90190264
 * @since 2024.03.21
 * @version 1.0
 */		
@RestController
@RequestMapping("/sml/fns/inb/ntfbxlistinq")
@BxmCategory(logicalName="알림함.목록.조회.컨트롤러", description="통합알림함 PUSH, SMS, KAKAO 알림 목록을 조회 한다.", author="90190264")
@Api(tags={""})
public class INBNtfbxListInq_CTR {
	private Logger logger= LoggerFactory.getLogger(getClass());
	
	/**
	 * 알림함.목록.조회.서비스
	 */
	private INBNtfbxListInq_SVC iNBNtfbxListInq_SVC;
	
	/**
	 * PUSH 알림 목록을 조회한다.
	 * 
	 * @param input 통합.알림.목록.조회.컨트롤러.입력.IO
	 * @return 통합.알림.목록.조회.컨트롤러.출력.IO
	 */
	@ApiOperation(
		value = "PUSH.알림.목록.조회"
		, notes = ""
	)
	@PostMapping(value="/selectPushNtfcList")
	@BxmCategory(logicalName="PUSH.알림.목록.조회", description="PUSH 알림 목록을 조회한다.", author="90190264")
	public INBNtfbxListInqSelectPushNtfcList_ODT selectPushNtfcList(
		@ApiParam(value="input", example="") @RequestBody INBNtfbxListInqSelectPushNtfcList_IDT input
		)
	{
		/**
		* @BXMType GetBean
		*/
		iNBNtfbxListInq_SVC= WFApplicationContext.getBean(iNBNtfbxListInq_SVC, INBNtfbxListInq_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		INBNtfbxListInqSelectPushNtfcList_ODT output= new INBNtfbxListInqSelectPushNtfcList_ODT();
		/*
		 * @BXMType ServiceCall
		 * 알림함.목록.조회.서비스 PUSH.알림.목록.조회
		 */
		output = iNBNtfbxListInq_SVC.selectPushNtfcList(input);
		return output;
	}
	
	/**
	 * SMS 알림 목록을 조회한다.
	 * 
	 * @param input 통합.알림.목록.조회.컨트롤러.입력.IO
	 * @return 통합.알림.목록.조회.컨트롤러.출력.IO
	 */
	@ApiOperation(
		value = "SMS.알림.목록.조회"
		, notes = ""
	)
	@PostMapping(value="/selectSmsNtfcList")
	@BxmCategory(logicalName="SMS.알림.목록.조회", description="SMS 알림 목록을 조회한다.", author="90190264")
	public INBNtfbxListInqSelectSmsNtfcList_ODT selectSmsNtfcList(
		@ApiParam(value="input", example="") @RequestBody INBNtfbxListInqSelectSmsNtfcList_IDT input
		)
	{
		/**
		* @BXMType GetBean
		*/
		iNBNtfbxListInq_SVC= WFApplicationContext.getBean(iNBNtfbxListInq_SVC, INBNtfbxListInq_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		INBNtfbxListInqSelectSmsNtfcList_ODT output= new INBNtfbxListInqSelectSmsNtfcList_ODT();
		/*
		 * @BXMType ServiceCall
		 * 알림함.목록.조회.서비스 SMS.알림.목록.조회
		 */
		output = iNBNtfbxListInq_SVC.selectSmsNtfcLIst(input);
		
		return output;
	}
	
	/**
	 * 카카오톡 알림 목록을 조회한다.
	 * 
	 * @param input 통합.알림.목록.조회.컨트롤러.입력.IO
	 * @return 통합.알림.목록.조회.컨트롤러.출력.IO  
	 */
	@ApiOperation(
		value = "카카오톡.알림.목록.조회"
		, notes = ""
	)
	@PostMapping(value="/selectKataNtfcList")
	@BxmCategory(logicalName="카카오톡.알림.목록.조회", description="카카오톡 알림 목록을 조회한다.", author="90190264")
	public INBNtfbxListInqSelectKataNtfcList_ODT selectKataNtfcList(
		@ApiParam(value="input", example="") @RequestBody INBNtfbxListInqSelectKataNtfcList_IDT input
		)
	{
		/**
		* @BXMType GetBean
		*/
		iNBNtfbxListInq_SVC= WFApplicationContext.getBean(iNBNtfbxListInq_SVC, INBNtfbxListInq_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		INBNtfbxListInqSelectKataNtfcList_ODT output= new INBNtfbxListInqSelectKataNtfcList_ODT();
		/*
		 * @BXMType ServiceCall
		 * 알림함.목록.조회.서비스 카카오톡.알림.목록.조회
		 */
		output = iNBNtfbxListInq_SVC.selectKataNtfcList(input);
		return output;
	}
	
	/**
	 * 즐겨찾기 등록/해제한다.
	 * 
	 * @param input 알림.즐겨찾기.컨트롤러.입력.IO
	 * @return 알림.즐겨찾기.컨트롤러.출력.IO
	 */
	@ApiOperation(
		value = "알림.즐겨찾기.수정"
		, notes = ""
	)
	@PostMapping(value="/updateNtfcFavt")
	@BxmCategory(logicalName="알림.즐겨찾기.수정", description="즐겨찾기 등록/해제한다.", author="90190264")
	public INBNtfbxListInqUpdateNtfcFavt_ODT updateNtfcFavt(
		@ApiParam(value="input", example="") @RequestBody INBNtfbxListInqUpdateNtfcFavt_IDT input
		)
	{
		/**
		* @BXMType GetBean
		*/
		iNBNtfbxListInq_SVC= WFApplicationContext.getBean(iNBNtfbxListInq_SVC, INBNtfbxListInq_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		INBNtfbxListInqUpdateNtfcFavt_ODT output= new INBNtfbxListInqUpdateNtfcFavt_ODT();
		/*
		 * @BXMType ServiceCall
		 * 알림함.목록.조회.서비스 알림.즐겨찾기.수정
		 */
		output = iNBNtfbxListInq_SVC.updateNtfcfavt(input);
		
		return output;
	}
	
	/**
	 * 카테고리분류.조회
	 * 
	 * @param input 카테고리분류.컨트롤러.입력.IO
	 * @return 카테고리분류.컨트롤러.출력.IO
	 */
	@ApiOperation(
		value = "카테고리분류.조회"
		, notes = ""
	)
	@PostMapping(value="/selectCtgrClf")
	@BxmCategory(logicalName="카테고리분류.조회", description="카테고리분류.조회", author="90190264")
	public INBNtfbxListInqSelectCtgrClf_ODT selectCtgrClf(@ApiParam(value="input", example="") @RequestBody INBNtfbxListInqSelectCtgrClf_IDT input)
	{
		/**
		* @BXMType GetBean
		*/
		iNBNtfbxListInq_SVC= WFApplicationContext.getBean(iNBNtfbxListInq_SVC, INBNtfbxListInq_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		INBNtfbxListInqSelectCtgrClf_ODT output = new INBNtfbxListInqSelectCtgrClf_ODT();
		/*
		 * @BXMType ServiceCall
		 * 알림함.목록.조회.서비스 카테고리분류.조회
		 */
		output = iNBNtfbxListInq_SVC.selectCtgrClf(input);
		
		return output;
	}
	
	/**
	 * PUSH.동의여부.조회
	 * 
	 * @param input 카테고리분류.컨트롤러.입력.IO
	 * @return 카테고리분류.컨트롤러.출력.IO
	 */
	@ApiOperation(
		value = "PUSH.동의여부.조회"
		, notes = ""
	)
	@PostMapping(value="/selectPushAgrYn")
	@BxmCategory(logicalName="PUSH.동의여부.조회", description="PUSH.동의여부.조회", author="90190264")
	public INBNtfbxListInqSelectPushAgrYn_ODT selectPushAgrYn(
		@ApiParam(value="input", example="") @RequestBody INBNtfbxListInqSelectPushAgrYn_IDT input
		)
	{
		/**
		* @BXMType GetBean
		*/
		iNBNtfbxListInq_SVC= WFApplicationContext.getBean(iNBNtfbxListInq_SVC, INBNtfbxListInq_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		INBNtfbxListInqSelectPushAgrYn_ODT output= new INBNtfbxListInqSelectPushAgrYn_ODT();
		/*
		 * @BXMType ServiceCall
		 * 알림함.목록.조회.서비스 PUSH.동의여부.조회
		 */
		output = iNBNtfbxListInq_SVC.selectPushAgrYn(input);
		
		return output;
	}
	
	/**
	 * 마케팅.동의여부.조회
	 * 
	 * @param input 마케팅.동의여부.입력.IO
	 * @return 마케팅.동의여부.출력.IO
	 */
	@ApiOperation(
		value = "마케팅.동의여부.조회"
		, notes = ""
	)
	@PostMapping(value="/selectMrktAgrYn")
	@BxmCategory(logicalName="마케팅.동의여부.조회", description="마케팅.동의여부.조회", author="90190264")
	public INBNtfbxListInqSelectMrktAgrYn_ODT selectMrktAgrYn()
	{
		/**
		* @BXMType GetBean
		*/
		iNBNtfbxListInq_SVC= WFApplicationContext.getBean(iNBNtfbxListInq_SVC, INBNtfbxListInq_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		INBNtfbxListInqSelectMrktAgrYn_ODT output= new INBNtfbxListInqSelectMrktAgrYn_ODT();
		/*
		 * @BXMType ServiceCall
		 * 알림함.목록.조회.서비스 PUSH.동의여부.조회
		 */
		output = iNBNtfbxListInq_SVC.selectMrktAgrYn();
		
		return output;
	}
	
	/**
	 * 읽음여부 수정
	 * 
	 * @param input 읽음여부.입력.IO
	 * @return 읽음여부.출력.IO
	 */
	@ApiOperation(
		value = "읽음여부.수정"
		, notes = ""
	)
	@PostMapping(value="/updateReadYn")
	@BxmCategory(logicalName="읽음여부.수정", description="읽음여부.수정", author="90190264")
	public INBNtfbxListInqUpdateReadYn_ODT updateReadYn(
		@ApiParam(value="input", example="") @RequestBody INBNtfbxListInqUpdateReadYn_IDT input
		)
	{
		/**
		* @BXMType GetBean
		*/
		iNBNtfbxListInq_SVC= WFApplicationContext.getBean(iNBNtfbxListInq_SVC, INBNtfbxListInq_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		INBNtfbxListInqUpdateReadYn_ODT output= new INBNtfbxListInqUpdateReadYn_ODT();
		/*
		 * @BXMType ServiceCall
		 * 알림함.목록.조회.서비스 읽음여부.수정
		 */
		output = iNBNtfbxListInq_SVC.updateReadYn(input);
		
		return output;
	}
	
	/**
	 * 사용자.정보.조회
	 * 
	 * @return 사용자.정보.출력.IO
	 */
	@ApiOperation(
		value = "사용자.정보.조회"
		, notes = ""
	)
	@PostMapping(value="/selectUserInf")
	@BxmCategory(logicalName="사용자.정보.조회", description="사용자.정보.조회", author="90190264")
	public INBNtfbxListInqSelectUserInf_ODT selectUserInf()
	{
		/**
		* @BXMType GetBean
		*/
		iNBNtfbxListInq_SVC= WFApplicationContext.getBean(iNBNtfbxListInq_SVC, INBNtfbxListInq_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		INBNtfbxListInqSelectUserInf_ODT output= new INBNtfbxListInqSelectUserInf_ODT();
		/*
		 * @BXMType ServiceCall
		 * 알림함.목록.조회.서비스 PUSH.동의여부.조회
		 */
		output = iNBNtfbxListInq_SVC.selectUserInf();
		
		return output;
	}
			
}
