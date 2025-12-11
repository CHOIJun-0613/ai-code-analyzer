package com.skbank.sml.fns.inb.ctr;

import bxm.common.annotaion.BxmCategory;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxPushRawEstDeleteRawNtfcAgrYn_IDT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxPushRawEstDeleteRawNtfcAgrYn_ODT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxPushRawEstInsertRawNtfcEstInf_IDT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxPushRawEstInsertRawNtfcEstInf_ODT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxPushRawEstCallRawNtfcDtlEst_ODT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxPushRawEstSelectRawNtfcAgrYn_ODT;
import com.skbank.sml.fns.inb.svc.INBNtfbxPushRawEst_SVC;
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
 * 3.프로그램명 : 알림함.PUSH.입출금.설정.컨트롤러
 * 4.설명 : 통합알림함 PUSH 입출금 설정 컨트롤러
 * 
 * @Class INBNtfbxPushRawEst_CTR.java
 * @author 90190264
 * @since 2024.05.15
 * @version 1.0
 */		
@RestController
@RequestMapping("/sml/fns/inb/ntfbxpushrawest")
@BxmCategory(logicalName="알림함.PUSH.입출금.설정.컨트롤러", description="통합알림함 PUSH 입출금 설정 컨트롤러", author="90190264")
@Api(tags={""})
public class INBNtfbxPushRawEst_CTR {
	private Logger logger= LoggerFactory.getLogger(getClass());
	
	/**
	 * 알림함.PUSH.입출금.설정.서비스
	 */
	private INBNtfbxPushRawEst_SVC iNBNtfbxPushRawEst_SVC;
	
	/**
	 * 입출금 알림 동의여부 조회
	 * 
	 * @param input 입출금.알림.설정.컨트롤러.입력.IO
	 * @return 입출금.알림.설정.컨트롤러.출력.IO
	 */
	@ApiOperation(
		value = "입출금.알림.동의여부.조회" 
		, notes = ""
	)
	@PostMapping(value="/selectRawNtfcAgrYn")
	@BxmCategory(logicalName="입출금.알림.동의여부.조회", description="입출금 알림 동의여부 조회", author="90190264")
	public INBNtfbxPushRawEstSelectRawNtfcAgrYn_ODT selectRawNtfcAgrYn()
	{
		/**
		* @BXMType GetBean
		*/
		iNBNtfbxPushRawEst_SVC= WFApplicationContext.getBean(iNBNtfbxPushRawEst_SVC, INBNtfbxPushRawEst_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		INBNtfbxPushRawEstSelectRawNtfcAgrYn_ODT output= new INBNtfbxPushRawEstSelectRawNtfcAgrYn_ODT();
		/*
		 * @BXMType ServiceCall
		 * 알림함.PUSH.입출금.설정.서비스 입출금.알림.동의여부.조회
		 */
		output = iNBNtfbxPushRawEst_SVC.selectRawNtfcAgrYn();
		
		return output;
	}
	
	/**
	 * 입출금 알림 설정정보 등록
	 * 
	 * 
	 * @param input 입출금.알림.설정.컨트롤러.입력.IO
	 * @return 입출금.알림.설정.컨트롤러.출력.IO 
	 */
	@ApiOperation(
		value = "입출금.알림.설정정보.등록"
		, notes = ""
	)
	@PostMapping(value="/insertRawNtfcEstInf")
	@BxmCategory(logicalName="입출금.알림.설정.정보.등록", description="입출금 알림 설정정보 등록", author="90190264")
	public INBNtfbxPushRawEstInsertRawNtfcEstInf_ODT insertRawNtfcEstInf(
		@ApiParam(value="input", example="") @RequestBody INBNtfbxPushRawEstInsertRawNtfcEstInf_IDT input
		)
	{
		/**
		* @BXMType GetBean
		*/
		iNBNtfbxPushRawEst_SVC= WFApplicationContext.getBean(iNBNtfbxPushRawEst_SVC, INBNtfbxPushRawEst_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		INBNtfbxPushRawEstInsertRawNtfcEstInf_ODT output= new INBNtfbxPushRawEstInsertRawNtfcEstInf_ODT();
		/*
		 * @BXMType ServiceCall
		 * 알림함.PUSH.입출금.설정.서비스 입출금.알림.설정정보.등록
		 */
		output = iNBNtfbxPushRawEst_SVC.insertRawNtfcEstInf(input);
		
		return output;
	}
	
	/**
	 * 입출금 알림 동의여부 삭제 
	 * 
	 * @param input 입출금.알림.설정.컨트롤러.입력.IO
	 * @return 입출금.알림.설정.컨트롤러.출력.IO
	 */
	@ApiOperation(
		value = "입출금.알림.동의여부.삭제"
		, notes = ""
	)
	@PostMapping(value="/deleteRawNtfcAgrYn")
	@BxmCategory(logicalName="입출금.알림.동의여부.삭제", description="입출금 알림 동의여부 삭제", author="90190264")
	public INBNtfbxPushRawEstDeleteRawNtfcAgrYn_ODT deleteRawNtfcAgrYn(
		@ApiParam(value="input", example="") @RequestBody INBNtfbxPushRawEstDeleteRawNtfcAgrYn_IDT input
		)
	{
		/**
		* @BXMType GetBean
		*/
		iNBNtfbxPushRawEst_SVC= WFApplicationContext.getBean(iNBNtfbxPushRawEst_SVC, INBNtfbxPushRawEst_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		INBNtfbxPushRawEstDeleteRawNtfcAgrYn_ODT output= new INBNtfbxPushRawEstDeleteRawNtfcAgrYn_ODT();
		/*
		 * @BXMType ServiceCall
		 * 알림함.PUSH.입출금.설정.서비스 입출금.알림.동의여부.삭제
		 */
		output = iNBNtfbxPushRawEst_SVC.deleteRawNtfcagrYn(input);
		
		return output;
	}
	
	/**
	 * 입출금 알림 상세 설정 조회
	 * 
	 * @param input 입출금.알림.설정.컨트롤러.입력.IO
	 * @return 입출금.알림.설정.컨트롤러.출력.IO
	 */
	@ApiOperation(
		value = "입출금.알림.상세.설정.조회"
		, notes = ""
	)
	@PostMapping(value="/callRawNtfcDtlEst")
	@BxmCategory(logicalName="입출금.알림.상세.설정.호출", description="입출금 알림 상세 설정 화면 호출", author="90190264")
	public INBNtfbxPushRawEstCallRawNtfcDtlEst_ODT callRawNtfcDtlEst() {
		/**
		* @BXMType GetBean
		*/
		iNBNtfbxPushRawEst_SVC= WFApplicationContext.getBean(iNBNtfbxPushRawEst_SVC, INBNtfbxPushRawEst_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		INBNtfbxPushRawEstCallRawNtfcDtlEst_ODT output= new INBNtfbxPushRawEstCallRawNtfcDtlEst_ODT();
		/*
		 * @BXMType ServiceCall
		 * 알림함.PUSH.입출금.설정.서비스 입출금.알림.상세.설정.조회
		 */
		output = iNBNtfbxPushRawEst_SVC.callRawNtfcDtlEst();
		
		return output;
	}
			
}
