package com.skbank.sml.fns.inb.ctr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxPushEtcEstSelectEtcNtfcagrYn_ODT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxPushEtcEstUpdateEtcNtfcAgrYn_IDT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxPushEtcEstUpdateEtcNtfcAgrYn_ODT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxPushEtcEstUpdateMyNtfcDtl_IDT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxPushEtcEstUpdateMyNtfcDtl_ODT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxPushEtcEstSelectMyNtfcDtl_IDT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxPushEtcEstSelectMyNtfcDtl_ODT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxPushEtcEstSelectMyNtfc_ODT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxPushEtcEstUpdateMyNtfc_IDT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxPushEtcEstUpdateMyNtfc_ODT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxPushEtcEstInsertMyNtfc_IDT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxPushEtcEstInsertMyNtfc_ODT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxPushEtcEstDeleteMyNtfc_IDT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxPushEtcEstDeleteMyNtfc_ODT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxPushEtcEstSelectNtfcdpsEst_IDT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxPushEtcEstSelectNtfcdpsEst_ODT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxPushEtcEstUpdatePushNtfcAgrYn_IDT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxPushEtcEstUpdatePushNtfcAgrYn_ODT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxPushEtcEstSelectPushmrktAgrYn_ODT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxPushEtcEstUpdatePushMrktAgrYn_IDT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxPushEtcEstSelectMyNtfcRnpeNm_IDT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxPushEtcEstSelectMyNtfcRnpeNm_ODT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxPushEtcEstSelectSrvcNtfcagrYn_IDT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxPushEtcEstSelectSrvcNtfcagrYn_ODT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxPushEtcEstUpdatePushMrktAgrYn_ODT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxPushEtcEstUpdateSrvcNtfcAgrYn_IDT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxPushEtcEstUpdateSrvcNtfcAgrYn_ODT;
import com.skbank.sml.fns.inb.svc.INBNtfbxPushEtcEst_SVC;

import bxm.common.annotaion.BxmCategory;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import fwk.skbank.online.context.WFApplicationContext;
import fwk.skbank.online.exception.app.WFApplicationException;

/**
 * 1.업무명 : 금융서비스
 * 2.단위업무명 : NEWWON 중분류 통합알림함
 * 3.프로그램명 : 알림함.PUSH.기타설정.컨트롤러 
 * 4.설명 : PUSH 기타 설정 컨트롤러
 * 
 * @Class INBNtfbxPushEtcEst_CTR.java
 * @author 90190264
 * @since 2024.05.23
 * @version 1.0
 */		
@RestController
@RequestMapping("/sml/fns/inb/ntfbxpushetcest")
@BxmCategory(logicalName="알림함.PUSH.기타설정.컨트롤러", description="PUSH 기타 설정 컨트롤러", author="90190264")
@Api(tags={""})
public class INBNtfbxPushEtcEst_CTR {
	private Logger logger= LoggerFactory.getLogger(getClass());
	
	/**
	 * 알림함.PUSH.기타설정.서비스
	 */
	private INBNtfbxPushEtcEst_SVC iNBNtfbxPushEtcEst_SVC;
	
	/**
	 * 알림.수신설정.조회
	 *
	 * @return 
	 */
	@ApiOperation(
		value = "알림.수신설정.조회"
		, notes = ""
	)
	@PostMapping(value="/selectNtfcdpsEst")
	@BxmCategory(logicalName="알림.수신설정.조회", description="알림.수신설정.조회", author="90190264")
	public INBNtfbxPushEtcEstSelectNtfcdpsEst_ODT selectNtfcdpsEst(
			@ApiParam(value="input", example="") @RequestBody INBNtfbxPushEtcEstSelectNtfcdpsEst_IDT input
		)
	{
		/**
		* @BXMType GetBean
		*/
		iNBNtfbxPushEtcEst_SVC= WFApplicationContext.getBean(iNBNtfbxPushEtcEst_SVC, INBNtfbxPushEtcEst_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		INBNtfbxPushEtcEstSelectNtfcdpsEst_ODT output= new INBNtfbxPushEtcEstSelectNtfcdpsEst_ODT();
		/*
		 * @BXMType ServiceCall
		 * 알림함.PUSH.기타설정.서비스 알림.수신설정.조회
		 */
		output = iNBNtfbxPushEtcEst_SVC.selectNtfcdpsEst(input);
		
		return output;
	}
	
	/**
	 * PUSH 마케팅 동의 여부 조회
	 * 
	 * @param input PUSH.마케팅동의여부.컨트롤러.입력.IO
	 * @return PUSH.마케팅동의여부.컨트롤러.출력.IO
	 */
	@ApiOperation(
		value = "PUSH.마케팅동의여부.조회"
		, notes = ""
	)
	@PostMapping(value="/selectPushmrktAgrYn")
	@BxmCategory(logicalName="PUSH.마케팅동의여부.조회", description="PUSH 마케팅 동의 여부 조회", author="90190264")
	public INBNtfbxPushEtcEstSelectPushmrktAgrYn_ODT selectPushmrktAgrYn()
	{
		/**
		* @BXMType GetBean
		*/
		iNBNtfbxPushEtcEst_SVC= WFApplicationContext.getBean(iNBNtfbxPushEtcEst_SVC, INBNtfbxPushEtcEst_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		INBNtfbxPushEtcEstSelectPushmrktAgrYn_ODT output = new INBNtfbxPushEtcEstSelectPushmrktAgrYn_ODT();
		/*
		 * @BXMType ServiceCall
		 * 알림함.PUSH.기타설정.서비스 PUSH.마케팅동의여부.조회
		 */
		output = iNBNtfbxPushEtcEst_SVC.selectPushmrktAgrYn();
		
		return output;
	}
	
	/**
	 * PUSH 서비스 알림 동의 여부 조회 
	 * 
	 * @param input 서비스알림.동의여부.컨트롤러.입력.IO
	 * @return 서비스알림.동의여부.컨트롤러.출력.IO
	 */
	@ApiOperation(
		value = "서비스알림.동의여부.조회"
		, notes = ""
	)
	@PostMapping(value="/selectSrvcNtfcagrYn")
	@BxmCategory(logicalName="서비스알림.동의여부.조회", description="PUSH 서비스 알림 동의 여부 조회", author="90190264")
	public INBNtfbxPushEtcEstSelectSrvcNtfcagrYn_ODT selectSrvcNtfcagrYn(
			@ApiParam(value="input", example="") @RequestBody INBNtfbxPushEtcEstSelectSrvcNtfcagrYn_IDT input
			)
	{
		/**
		* @BXMType GetBean
		*/
		iNBNtfbxPushEtcEst_SVC= WFApplicationContext.getBean(iNBNtfbxPushEtcEst_SVC, INBNtfbxPushEtcEst_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		INBNtfbxPushEtcEstSelectSrvcNtfcagrYn_ODT output = new INBNtfbxPushEtcEstSelectSrvcNtfcagrYn_ODT();
		/*
		 * @BXMType ServiceCall
		 * 알림함.PUSH.기타설정.서비스 서비스알림.동의여부.조회
		 */
		output = iNBNtfbxPushEtcEst_SVC.selectSrvcNtfcagrYn(input);
		
		return output;
	}
	
	/**
	 * PUSH 기타 알림 동의여부 조회
	 * 
	 * @param input 기타알림.동의여부.컨트롤러.입력.IO
	 * @return 기타알림.동의여부.컨트롤러.출력.IO
	 */
	@ApiOperation(
		value = "기타알림.동의여부.조회"
		, notes = ""
	)
	@PostMapping(value="/selectEtcNtfcagrYn")
	@BxmCategory(logicalName="기타알림.동의여부.조회", description="PUSH 기타 알림 동의여부 조회", author="90190264")
	public INBNtfbxPushEtcEstSelectEtcNtfcagrYn_ODT selectEtcNtfcagrYn()
	{
		/**
		* @BXMType GetBean
		*/
		iNBNtfbxPushEtcEst_SVC= WFApplicationContext.getBean(iNBNtfbxPushEtcEst_SVC, INBNtfbxPushEtcEst_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		INBNtfbxPushEtcEstSelectEtcNtfcagrYn_ODT output = new INBNtfbxPushEtcEstSelectEtcNtfcagrYn_ODT();
		/*
		 * @BXMType ServiceCall
		 * 알림함.PUSH.기타설정.서비스 기타알림.동의여부.조회
		 */
		output = iNBNtfbxPushEtcEst_SVC.selectEtcNtfcagrYn();
		
		return output;
	}
	
	/**
	 * PUSH 알림 동의 여부 수정 컨트롤러 
	 * 
	 * @param input PUSH.동의여부.컨트롤러.입력.IO
	 * @return PUSH.동의여부.컨트롤러.출력.IO
	 */
	@ApiOperation(
		value = "PUSH.알림.동의여부.수정"
		, notes = ""
	)
	@PostMapping(value="/updatePushNtfcAgrYn")
	@BxmCategory(logicalName="PUSH.알림.동의여부.수정", description="PUSH 알림 동의 여부 수정 컨트롤러", author="90190264")
	public INBNtfbxPushEtcEstUpdatePushNtfcAgrYn_ODT updatePushNtfcAgrYn(
		@ApiParam(value="input", example="") @RequestBody INBNtfbxPushEtcEstUpdatePushNtfcAgrYn_IDT input
		) throws WFApplicationException
	{
		/**
		* @BXMType GetBean
		*/
		iNBNtfbxPushEtcEst_SVC= WFApplicationContext.getBean(iNBNtfbxPushEtcEst_SVC, INBNtfbxPushEtcEst_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		INBNtfbxPushEtcEstUpdatePushNtfcAgrYn_ODT output = new INBNtfbxPushEtcEstUpdatePushNtfcAgrYn_ODT();
		/*
		 * @BXMType ServiceCall
		 * 알림함.PUSH.기타설정.서비스 PUSH.알림.동의여부.수정
		 */
		output = iNBNtfbxPushEtcEst_SVC.updatePushNtfcAgrYn(input);
		
		return output;
	}
	
	/**
	 * PUSH 마케팅 동의여부 수정
	 * 
	 * @param input PUSH.마케팅동의여부.컨트롤러.입력.IO
	 * @return PUSH.마케팅동의여부.컨트롤러.출력.IO
	 */
	@ApiOperation(
		value = "PUSH.마케팅동의여부.수정"
		, notes = ""
	)
	@PostMapping(value="/updatePushMrktAgrYn")
	@BxmCategory(logicalName="PUSH.마케팅동의여부.수정", description="PUSH 마케팅 동의여부 수정", author="90190264")
	public INBNtfbxPushEtcEstUpdatePushMrktAgrYn_ODT updatePushMrktAgrYn(
		@ApiParam(value="input", example="") @RequestBody INBNtfbxPushEtcEstUpdatePushMrktAgrYn_IDT input
		)
	{
		/**
		* @BXMType GetBean
		*/
		iNBNtfbxPushEtcEst_SVC= WFApplicationContext.getBean(iNBNtfbxPushEtcEst_SVC, INBNtfbxPushEtcEst_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		INBNtfbxPushEtcEstUpdatePushMrktAgrYn_ODT output= new INBNtfbxPushEtcEstUpdatePushMrktAgrYn_ODT();
		/*
		 * @BXMType ServiceCall
		 * 알림함.PUSH.기타설정.서비스 PUSH.마케팅동의여부.수정
		 */
		output = iNBNtfbxPushEtcEst_SVC.updatePushMrktAgrYn(input);
		
		return output;
	}
	
	/**
	 * PUSH 서비스 알림 동의 수정
	 * 
	 * 
	 * @param input 서비스알림.동의여부.컨트롤러.입력.IO
	 * @return 서비스알림.동의여부.컨트롤러.출력.IO 
	 */
	@ApiOperation(
		value = "서비스알림.동의여부.수정"
		, notes = ""
	)
	@PostMapping(value="/updateSrvcNtfcAgrYn")
	@BxmCategory(logicalName="서비스알림.동의여부.수정", description="PUSH 서비스 알림 동의 수정\r\n", author="90190264")
	public INBNtfbxPushEtcEstUpdateSrvcNtfcAgrYn_ODT updateSrvcNtfcAgrYn(
		@ApiParam(value="input", example="") @RequestBody INBNtfbxPushEtcEstUpdateSrvcNtfcAgrYn_IDT input
		)
	{
		/**
		* @BXMType GetBean
		*/
		iNBNtfbxPushEtcEst_SVC= WFApplicationContext.getBean(iNBNtfbxPushEtcEst_SVC, INBNtfbxPushEtcEst_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		INBNtfbxPushEtcEstUpdateSrvcNtfcAgrYn_ODT output = new INBNtfbxPushEtcEstUpdateSrvcNtfcAgrYn_ODT();
		/*
		 * @BXMType ServiceCall
		 * 알림함.PUSH.기타설정.서비스 서비스알림.동의여부.수정
		 */
		output = iNBNtfbxPushEtcEst_SVC.updateSrvcNtfcAgrYn(input);
		
		return output;
	}
	
	/**
	 * 기타 알림 동의여부 수정
	 * 
	 * @param input 기타알림.동의여부.컨트롤러.입력.IO
	 * @return 기타알림.동의여부.컨트롤러.출력.IO 
	 */
	@ApiOperation(
		value = "기타알림.동의여부.수정"
		, notes = ""
	)
	@PostMapping(value="/updateEtcNtfcAgrYn")
	@BxmCategory(logicalName="기타알림.동의여부.수정", description="기타 알림 동의여부 수정", author="90190264")
	public INBNtfbxPushEtcEstUpdateEtcNtfcAgrYn_ODT updateEtcNtfcAgrYn(
		@ApiParam(value="input", example="") @RequestBody INBNtfbxPushEtcEstUpdateEtcNtfcAgrYn_IDT input
		)
	{
		/**
		* @BXMType GetBean
		*/
		iNBNtfbxPushEtcEst_SVC= WFApplicationContext.getBean(iNBNtfbxPushEtcEst_SVC, INBNtfbxPushEtcEst_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		INBNtfbxPushEtcEstUpdateEtcNtfcAgrYn_ODT output = new INBNtfbxPushEtcEstUpdateEtcNtfcAgrYn_ODT();
		/*
		 * @BXMType ServiceCall
		 * 알림함.PUSH.기타설정.서비스 기타알림.동의여부.수정
		 */
		output = iNBNtfbxPushEtcEst_SVC.updateEtcNtfcagrYn(input);
		
		return output;
	}
	
	/**
	 * 나만의 알림 조회
	 * 
	 * @param input 나만의.알림.컨트롤러.입력.IO
	 * @return 나만의.알림.컨트롤러.출력.IO
	 */
	@ApiOperation(
		value = "나만의.알림.조회"
		, notes = ""
	)
	@PostMapping(value="/selectMyNtfc")
	@BxmCategory(logicalName="나만의.알림.조회", description="나만의.알림.조회", author="90190264")
	public INBNtfbxPushEtcEstSelectMyNtfc_ODT selectMyNtfc()
	{
		/**
		* @BXMType GetBean
		*/
		iNBNtfbxPushEtcEst_SVC= WFApplicationContext.getBean(iNBNtfbxPushEtcEst_SVC, INBNtfbxPushEtcEst_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		INBNtfbxPushEtcEstSelectMyNtfc_ODT output = new INBNtfbxPushEtcEstSelectMyNtfc_ODT();
		/*
		 * @BXMType ServiceCall
		 * 알림함.PUSH.기타설정.서비스 나만의.알림.조회
		 */
		output = iNBNtfbxPushEtcEst_SVC.selectMyNtfc();
		
		return output;
	}
	
	/**
	 * 나만의 알림 수정
	 * 나만의알림 PUSH 수신여부를 수정 한다.
	 * 
	 * @param input 나만의.알림.컨트롤러.입력.IO
	 * @return 나만의.알림.컨트롤러.출력.IO 
	 */
	@ApiOperation(
		value = "나만의.알림.수정"
		, notes = ""
	)
	@PostMapping(value="/updateMyNtfc")
	@BxmCategory(logicalName="나만의.알림.수정", description="나만의알림 PUSH 수신여부를 수정 한다.", author="90190264")
	public INBNtfbxPushEtcEstUpdateMyNtfc_ODT updateMyNtfc(@ApiParam(value="input", example="") @RequestBody INBNtfbxPushEtcEstUpdateMyNtfc_IDT input)
	{
		/**
		* @BXMType GetBean
		*/
		iNBNtfbxPushEtcEst_SVC= WFApplicationContext.getBean(iNBNtfbxPushEtcEst_SVC, INBNtfbxPushEtcEst_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		INBNtfbxPushEtcEstUpdateMyNtfc_ODT output = new INBNtfbxPushEtcEstUpdateMyNtfc_ODT();
		/*
		 * @BXMType ServiceCall
		 * 알림함.PUSH.기타설정.서비스 나만의.알림.수정
		 */
		output = iNBNtfbxPushEtcEst_SVC.updateMyNtfc(input);
		
		return output;
	}
	
	/**
	 * 나만의 알림 삭제 
	 * 나만의알림 PUSH 수신여부를 삭제 한다.
	 * 
	 * @param input 나만의.알림.컨트롤러.입력.IO
	 * @return 나만의.알림.컨트롤러.출력.IO 
	 */
	@ApiOperation(
		value = "나만의.알림.삭제"
		, notes = ""
	)
	@PostMapping(value="/deleteMyNtfc")
	@BxmCategory(logicalName="나만의.알림.삭제", description="나만의알림 PUSH 수신여부를 삭제 한다.", author="90190264")
	public INBNtfbxPushEtcEstDeleteMyNtfc_ODT deleteMyNtfc(@ApiParam(value="input", example="") @RequestBody INBNtfbxPushEtcEstDeleteMyNtfc_IDT input)
	{
		/**
		* @BXMType GetBean
		*/
		iNBNtfbxPushEtcEst_SVC= WFApplicationContext.getBean(iNBNtfbxPushEtcEst_SVC, INBNtfbxPushEtcEst_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		INBNtfbxPushEtcEstDeleteMyNtfc_ODT output = new INBNtfbxPushEtcEstDeleteMyNtfc_ODT();
		/*
		 * @BXMType ServiceCall
		 * 알림함.PUSH.기타설정.서비스 나만의.알림.삭제
		 */
		output = iNBNtfbxPushEtcEst_SVC.deleteMyNtfc(input);
		
		return output;
	}
	
	/**
	 * 나만의 알림 등록
	 * 나만의알림 PUSH 수신여부를 등록 한다. 
	 * 
	 * @param input 나만의.알림.컨트롤러.입력.IO
	 * @return 나만의.알림.컨트롤러.출력.IO 
	 */
	@ApiOperation(
		value = "나만의.알림.등록"
		, notes = ""
	)
	@PostMapping(value="/insertMyNtfc")
	@BxmCategory(logicalName="나만의.알림.등록", description="나만의알림 PUSH 수신여부를 등록 한다.", author="90190264")
	public INBNtfbxPushEtcEstInsertMyNtfc_ODT insertMyNtfc(@ApiParam(value="input", example="") @RequestBody INBNtfbxPushEtcEstInsertMyNtfc_IDT input)
	{
		/**
		* @BXMType GetBean
		*/
		iNBNtfbxPushEtcEst_SVC= WFApplicationContext.getBean(iNBNtfbxPushEtcEst_SVC, INBNtfbxPushEtcEst_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		INBNtfbxPushEtcEstInsertMyNtfc_ODT output = new INBNtfbxPushEtcEstInsertMyNtfc_ODT();
		/*
		 * @BXMType ServiceCall
		 * 알림함.PUSH.기타설정.서비스 나만의.알림.등록
		 */
		output = iNBNtfbxPushEtcEst_SVC.insertMyNtfc(input);
		
		return output;
	}
	
	/**
	 * 나만의 알림 상세 조회
	 * 나만의알림 상세 조회 한다. 
	 * 
	 * @param input 나만의.알림.컨트롤러.입력.IO
	 * @return 나만의.알림.컨트롤러.출력.IO 
	 */
	@ApiOperation(
		value = "나만의.알림.상세 조회"
		, notes = ""
	)
	@PostMapping(value="/selectMyNtfcDtl")
	@BxmCategory(logicalName="나만의.알림.상세 조회", description="나만의알림 상세 조회 한다.", author="90190264")
	public INBNtfbxPushEtcEstSelectMyNtfcDtl_ODT selectMyNtfcDtl(@ApiParam(value="input", example="") @RequestBody INBNtfbxPushEtcEstSelectMyNtfcDtl_IDT input)
	{
		/**
		* @BXMType GetBean
		*/
		iNBNtfbxPushEtcEst_SVC= WFApplicationContext.getBean(iNBNtfbxPushEtcEst_SVC, INBNtfbxPushEtcEst_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		INBNtfbxPushEtcEstSelectMyNtfcDtl_ODT output = new INBNtfbxPushEtcEstSelectMyNtfcDtl_ODT();
		/*
		 * @BXMType ServiceCall
		 * 알림함.PUSH.기타설정.서비스 나만의.알림.상세 조회
		 */
		output = iNBNtfbxPushEtcEst_SVC.selectMyNtfcDtl(input);
		
		return output;
	}
	
	/**
	 * 나만의 알림 수취인명 조회
	 * 나만의알림 수취인명 조회 한다.
	 * 
	 * @param input 나만의.알림.컨트롤러.입력.IO
	 * @return 나만의.알림.컨트롤러.출력.IO  
	 */
	@ApiOperation(
		value = "나만의.알림.수취인명  조회"
		, notes = ""
	)
	@PostMapping(value="/selectMyNtfcRnpeNm")
	@BxmCategory(logicalName="나만의.알림.수취인명.조회", description="나만의알림 수취인명 조회 한다.", author="90190264")
	public INBNtfbxPushEtcEstSelectMyNtfcRnpeNm_ODT selectMyNtfcRnpeNm(@ApiParam(value="input", example="") @RequestBody INBNtfbxPushEtcEstSelectMyNtfcRnpeNm_IDT input)
	{
		/**
		* @BXMType GetBean
		*/
		iNBNtfbxPushEtcEst_SVC= WFApplicationContext.getBean(iNBNtfbxPushEtcEst_SVC, INBNtfbxPushEtcEst_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		INBNtfbxPushEtcEstSelectMyNtfcRnpeNm_ODT output = new INBNtfbxPushEtcEstSelectMyNtfcRnpeNm_ODT();
		/*
		 * @BXMType ServiceCall
		 * 알림함.PUSH.기타설정.서비스 나만의.알림.수취인명 조회
		 */
		output = iNBNtfbxPushEtcEst_SVC.selectMyNtfcRnpeNm(input);
		
		return output;
	}
	
	/**
	 * 나만의 알림 상세 수정
	 * 나만의알림 상세 내용을 수정 한다.
	 * 
	 * @param input 나만의.알림.컨트롤러.입력.IO
	 * @return 나만의.알림.컨트롤러.출력.IO 
	 */
	@ApiOperation(
		value = "나만의.알림.상세.수정"
		, notes = ""
	)
	@PostMapping(value="/updateMyNtfcDtl")
	@BxmCategory(logicalName="나만의.알림.상세.수정", description="나만의알림 상세 내용을 수정 한다.", author="90190264")
	public INBNtfbxPushEtcEstUpdateMyNtfcDtl_ODT updateMyNtfcDtl(@ApiParam(value="input", example="") @RequestBody INBNtfbxPushEtcEstUpdateMyNtfcDtl_IDT input)
	{
		/**
		* @BXMType GetBean
		*/
		iNBNtfbxPushEtcEst_SVC= WFApplicationContext.getBean(iNBNtfbxPushEtcEst_SVC, INBNtfbxPushEtcEst_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		INBNtfbxPushEtcEstUpdateMyNtfcDtl_ODT output = new INBNtfbxPushEtcEstUpdateMyNtfcDtl_ODT();
		/*
		 * @BXMType ServiceCall
		 * 알림함.PUSH.기타설정.서비스 나만의.알림.상세.수정
		 */
		output = iNBNtfbxPushEtcEst_SVC.updateMyNtfcDtl(input);
		
		return output;
	}
}
