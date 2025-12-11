package com.skbank.sml.fns.mnp.ctr;

import bxm.common.annotaion.BxmCategory;
import com.skbank.sml.fns.mnp.ctr.MNPMnyPinBscMng_CTR;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinBscMngDeleteMnpWallLst_IDT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinBscMngDeleteMnpWallLst_ODT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinBscMngSelectMnpBscInf_IDT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinBscMngSelectMnpBscInf_ODT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinBscMngSelectMnpSafIntInf_IDT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinBscMngSelectMnpSafIntInf_ODT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinBscMngUpdateWallSeq_IDT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinBscMngUpdateWallSeq_ODT;
import com.skbank.sml.fns.mnp.svc.MNPMnyPinBscMng_SVC;

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
 * 1.업무명 : 
 * 2.단위업무명 : 
 * 3.프로그램명 : 머니클립기본관리
 * 4.설명 : 
 * 
 * @Class MNPMnyPinBscMng_CTR.java
 * @author 90190263
 * @since 2024.08.06
 * @version 1.0
 */		
@RestController
@RequestMapping("/sml/fns/mnp/mnypinbscmng")
@Api(tags={""})
@BxmCategory(logicalName="머니클립기본관리", description="머니클립의 기본적인 정보를 관리하는 컨트롤러", author="90190263")
public class MNPMnyPinBscMng_CTR {
	private final Logger logger= LoggerFactory.getLogger(this.getClass());
	

	/**
	 * 머니클립기본관리서비스
	 */
	private MNPMnyPinBscMng_SVC mNPMnyPinBscMng_SVC;
	
	/**
	 * 머니클립기본정보조회
	 * 
	 * @param input MnyPinSafMng 입력
	 * @return MnyPinSafMng 출력
	 */
	@PostMapping("/selectMnpBscInf")
	@ApiOperation(
		value = "머니클립기본정보조회"
		, notes = ""
	)
	@BxmCategory(logicalName="머니클립기본정보조회", description="머니클립의 기본 정보를 조회한다.", author="90190263")
	public MNPMnyPinBscMngSelectMnpBscInf_ODT selectMnpBscInf(
			@ApiParam(value="input", example="") @RequestBody MNPMnyPinBscMngSelectMnpBscInf_IDT input
	) {
		/**
		* @BXMType GetBean
		*/
		mNPMnyPinBscMng_SVC= WFApplicationContext.getBean(mNPMnyPinBscMng_SVC, MNPMnyPinBscMng_SVC.class);
					
		/**
		 * @BXMType VariableDeclaration
		 */
		MNPMnyPinBscMngSelectMnpBscInf_ODT output = new MNPMnyPinBscMngSelectMnpBscInf_ODT();
		
		/*
		 * 머니클립기본정보조회 호출 
		 */
		output = mNPMnyPinBscMng_SVC.selectMnpBscInf(input);
					
		return output;
	}
	
	/**
	 * 머니클립의 금고 이자 정보를 조회한다
	 * 
	 * @param input MNPMnyPinBscMngSelectMnpSafIntInf_IDT 입력
	 * @return MNPMnyPinBscMngSelectMnpSafIntInf_ODT 출력
	 */
	@PostMapping("/selectMnpSafIntInf")
	@ApiOperation(
		value = "머니클립금고이자조회"
		, notes = ""
	)
	@BxmCategory(logicalName="머니클립금고이자조회", description="머니클립의 금고 이자 정보를 조회한다.", author="90190263")
	public MNPMnyPinBscMngSelectMnpSafIntInf_ODT selectMnpSafIntInf() {
		/**
		* @BXMType GetBean
		*/
		mNPMnyPinBscMng_SVC= WFApplicationContext.getBean(mNPMnyPinBscMng_SVC, MNPMnyPinBscMng_SVC.class);
					
		/**
		 * @BXMType VariableDeclaration
		 */
		MNPMnyPinBscMngSelectMnpSafIntInf_ODT output = new MNPMnyPinBscMngSelectMnpSafIntInf_ODT();
		
		/*
		 * 머니클립기본정보조회 호출 
		 */
		output = mNPMnyPinBscMng_SVC.selectMnpSafIntInf();
					
		return output;
	}
	

	/**
	 * 머니클립의 지갑 목록을 삭제한다.
	 * 
	 * @param input MNPMnyPinBscMngDeleteMnpWallLst_IDT 입력
	 * @return MNPMnyPinBscMngDeleteMnpWallLst_ODT 출력
	 */
	@PostMapping("/deleteMnpWallLst")
	@ApiOperation(
		value = "머니클립지갑목록삭제"
		, notes = ""
	)
	@BxmCategory(logicalName="머니클립지갑목록삭제", description="머니클립의 지갑 목록을 삭제한다.", author="90190263")
	public MNPMnyPinBscMngDeleteMnpWallLst_ODT deleteMnpWallLst(
			@ApiParam(value="input", example="") @RequestBody MNPMnyPinBscMngDeleteMnpWallLst_IDT input
	) {
		/**
		* @BXMType GetBean
		*/
		mNPMnyPinBscMng_SVC= WFApplicationContext.getBean(mNPMnyPinBscMng_SVC, MNPMnyPinBscMng_SVC.class);
					
		/**
		 * @BXMType VariableDeclaration
		 */
		MNPMnyPinBscMngDeleteMnpWallLst_ODT output = new MNPMnyPinBscMngDeleteMnpWallLst_ODT();
		
		/*
		 * 머니클립기본정보조회 호출 
		 */
		output = mNPMnyPinBscMng_SVC.deleteMnpWallLst(input);
					
		return output;
	}
	

	/**
	 * 머니클립의 지갑 순서를 수정한다
	 * 
	 * @param input MNPMnyPinBscMngUpdateWallSeq_IDT 입력
	 * @return MNPMnyPinBscMngUpdateWallSeq_ODT 출력
	 */
	@PostMapping("/updateWallSeq")
	@ApiOperation(
		value = "머니클립지갑순서수정"
		, notes = ""
	)
	@BxmCategory(logicalName="머니클립지갑순서수정", description="머니클립의 지갑 순서를 수정한다.", author="90190263")
	public MNPMnyPinBscMngUpdateWallSeq_ODT updateWallSeq(
			@ApiParam(value="input", example="") @RequestBody MNPMnyPinBscMngUpdateWallSeq_IDT input
	) {
		/**
		* @BXMType GetBean
		*/
		mNPMnyPinBscMng_SVC= WFApplicationContext.getBean(mNPMnyPinBscMng_SVC, MNPMnyPinBscMng_SVC.class);
					
		/**
		 * @BXMType VariableDeclaration
		 */
		MNPMnyPinBscMngUpdateWallSeq_ODT output = new MNPMnyPinBscMngUpdateWallSeq_ODT();
		
		/*
		 * 머니클립기본정보조회 호출 
		 */
		output = mNPMnyPinBscMng_SVC.updateWallSeq(input);
					
		return output;
	}
}
