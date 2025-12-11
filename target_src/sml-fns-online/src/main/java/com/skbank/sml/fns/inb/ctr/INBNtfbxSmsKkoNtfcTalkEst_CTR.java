package com.skbank.sml.fns.inb.ctr;

import bxm.common.annotaion.BxmCategory;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxSmsKkoNtfcTalkEstSelectSmsKkoNtfcTalkEst_IDT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxSmsKkoNtfcTalkEstSelectSmsKkoNtfcTalkEst_ODT;
import com.skbank.sml.fns.inb.svc.INBNtfbxSmsKkoNtfcTalkEst_SVC;
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
 * 3.프로그램명 : 알림함.SMS.카카오알림톡.설정.컨트롤러
 * 4.설명 : 통합알림함SMS설정 컨트롤러
 * 
 * @Class INBNtfbxSmsKkoNtfcTalkEst_CTR.java
 * @author 90190264
 * @since 2024.04.03 
 * @version 1.0
 */		
@RestController
@RequestMapping("/sml/fns/inb/ntfbxsmskkontfctalkest")
@BxmCategory(logicalName="알림함.SMS.카카오알림톡.설정.컨트롤러", description="통합알림함SMS설정 컨트롤러", author="90190264")
@Api(tags={""})
public class INBNtfbxSmsKkoNtfcTalkEst_CTR {
	private Logger logger= LoggerFactory.getLogger(getClass());
	
	/**
	 * 알림함.SMS.카카오알림톡.설정.서비스
	 */
	private INBNtfbxSmsKkoNtfcTalkEst_SVC iNBNtfbxSmsKkoNtfcTalkEst_SVC;
	
	/**
	 * SMS.카카오알림톡.설정.조회 
	 * 
	 * @param input SMS.카카오알림톡.설정.서비스가입여부.컨트롤러.입력.IO
	 * @return SMS.카카오알림톡.설정.서비스가입여부.컨트롤러.출력.IO
	 */
	@ApiOperation(
		value = "SMS.카카오알림톡.설정.조회"
		, notes = ""
	)
	@PostMapping(value="/selectSmsKkoNtfcTalkEst")
	@BxmCategory(logicalName="SMS.카카오알림톡.설정.조회", description="SMS.카카오알림톡.설정.조회", author="90190264")
	public INBNtfbxSmsKkoNtfcTalkEstSelectSmsKkoNtfcTalkEst_ODT selectSmsKkoNtfcTalkEst(@ApiParam(value="input", example="") @RequestBody INBNtfbxSmsKkoNtfcTalkEstSelectSmsKkoNtfcTalkEst_IDT input)
	{
		/**
		* @BXMType GetBean
		*/
		iNBNtfbxSmsKkoNtfcTalkEst_SVC= WFApplicationContext.getBean(iNBNtfbxSmsKkoNtfcTalkEst_SVC, INBNtfbxSmsKkoNtfcTalkEst_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		INBNtfbxSmsKkoNtfcTalkEstSelectSmsKkoNtfcTalkEst_ODT output= new INBNtfbxSmsKkoNtfcTalkEstSelectSmsKkoNtfcTalkEst_ODT();
		/*
		 * @BXMType ServiceCall
		 * 알림함.SMS.카카오알림톡.설정.서비스 SMS.카카오알림톡.설정.조회
		 */
		output = iNBNtfbxSmsKkoNtfcTalkEst_SVC.selectSmsKkoNtfcTalkEst(input);
		
		return output;
	}
	
			
}
