package com.skbank.sml.fns.pbp.ctr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlMngDeleteSpcedtlinf_IDT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlMngDeleteSpcedtlinf_ODT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlMngSelectSpcedtlinf_IDT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlMngSelectSpcedtlinf_ODT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlMngSelectSpcedtltrnprts_IDT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlMngSelectSpcedtltrnprts_ODT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlMngUpdateSpcedtlam_IDT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlMngUpdateSpcedtlam_ODT;
import com.skbank.sml.fns.pbp.svc.PBPPbokSpceDtlMng_SVC;

import bxm.common.annotaion.BxmCategory;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import fwk.skbank.online.context.WFApplicationContext;

/**
 * 1.업무명 : 금융서비스
 * 2.단위업무명 : NEWWON 중분류 통장쪼개기
 * 3.프로그램명 : 통장.공간.상세.관리.컨트롤러
 * 4.설명 : 통장의 공간의 상세 정보를 관리하는 컨트롤러
 * 
 * @Class PBPPbokSpceDtlMng_CTR.java
 * @author 90191355
 * @since 2024.06.19
 * @version 1.0
 */		
@RestController
@RequestMapping("/sml/fns/pbp/pbokspcedtlmng")
@BxmCategory(logicalName="통장.공간.상세.관리.컨트롤러", description="통장의 공간의 상세 정보를 관리하는 컨트롤러", author="90191355")
@Api(tags={""})
public class PBPPbokSpceDtlMng_CTR {
	private Logger logger= LoggerFactory.getLogger(getClass());
	
	/**
	 * 통장.공간.상세.관리.서비스
	 */
	private PBPPbokSpceDtlMng_SVC pBPPbokSpceDtlMng_SVC;
	
	/**
	 * 통장쪼개기를 통해 생성된 공간의 상세 정보를 조회하는 컨트롤러
	 * 
	 * @param input 공간.상세.정보.컨트롤러.입력.IO
	 * @return 공간.상세.정보.컨트롤러.출력.IO
	 */
	@ApiOperation(
		value = "공간.상세.정보.조회"
		, notes = ""
	)
	@PostMapping(value="/selectSpcedtlinf")
	@BxmCategory(logicalName="공간.상세.정보.조회", description="통장쪼개기를 통해 생성된 공간의 상세 정보를 조회하는 컨트롤러", author="90191355")
	public PBPPbokSpceDtlMngSelectSpcedtlinf_ODT selectSpcedtlinf(
		@ApiParam(value="input", example="") @RequestBody PBPPbokSpceDtlMngSelectSpcedtlinf_IDT input
		)
	{
		/**
		* @BXMType GetBean
		*/
		pBPPbokSpceDtlMng_SVC= WFApplicationContext.getBean(pBPPbokSpceDtlMng_SVC, PBPPbokSpceDtlMng_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		PBPPbokSpceDtlMngSelectSpcedtlinf_ODT output= pBPPbokSpceDtlMng_SVC.selectSpcedtlinf(input);

		return output;
	}
	
	/**
	 * 통장쪼개기를 통해 생성된 공간의 금액을 채우기/꺼내기를 관리하는 컨트롤러
	 * 
	 * @param input 공간상세금액수정정보.컨트롤러.입력.IO
	 * @return 공간상세금액수정정보.컨트롤러.출력.IO
	 */
	@ApiOperation(
		value = "공간.상세.금액.수정"
		, notes = ""
	)
	@PostMapping(value="/updateSpcedtlam")
	@BxmCategory(logicalName="공간.상세.금액.수정", description="통장쪼개기를 통해 생성된 공간의 금액을 채우기/꺼내기를 관리하는 컨트롤러", author="90191355")
	public PBPPbokSpceDtlMngUpdateSpcedtlam_ODT updateSpcedtlam(
		@ApiParam(value="input", example="") @RequestBody PBPPbokSpceDtlMngUpdateSpcedtlam_IDT input
		)
	{
		/**
		* @BXMType GetBean
		*/
		pBPPbokSpceDtlMng_SVC= WFApplicationContext.getBean(pBPPbokSpceDtlMng_SVC, PBPPbokSpceDtlMng_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		PBPPbokSpceDtlMngUpdateSpcedtlam_ODT output= pBPPbokSpceDtlMng_SVC.updateSpcedtlam(input);

		return output;
	}
	
	/**
	 * 통장쪼개기를 통해 생성된 공간의 상세 정보를 삭제하는 컨트롤러
	 * 
	 * @param input 공간.상세.정보.삭제.컨트롤러.입력.IO
	 * @return 공간.상세.정보.삭제.컨트롤러.출력.IO
	 */
	@ApiOperation(
		value = "공간.상세.정보.삭제"
		, notes = ""
	)
	@PostMapping(value="/deleteSpcedtlinf")
	@BxmCategory(logicalName="공간.상세.정보.삭제", description="통장쪼개기를 통해 생성된 공간의 상세 정보를 삭제하는 컨트롤러", author="90191355")
	public PBPPbokSpceDtlMngDeleteSpcedtlinf_ODT deleteSpcedtlinf(
		@ApiParam(value="input", example="") @RequestBody PBPPbokSpceDtlMngDeleteSpcedtlinf_IDT input
		)
	{
		/**
		* @BXMType GetBean
		*/
		pBPPbokSpceDtlMng_SVC= WFApplicationContext.getBean(pBPPbokSpceDtlMng_SVC, PBPPbokSpceDtlMng_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		 
		PBPPbokSpceDtlMngDeleteSpcedtlinf_ODT output = pBPPbokSpceDtlMng_SVC.deleteSpcedtlinf(input);
				
		return output;
	}
	
	/**
	 * 통장쪼개기를 통해 생성된 공간의 거래내역을 조회하는 컴포넌트
	 * 
	 * @param input 공간.상세.거래내역.컨트롤러.입력.IO
	 * @return 공간.상세.거래내역.컨트롤러.출력.IO
	 */
	@ApiOperation(
		value = "공간.상세.거래내역.조회"
		, notes = ""
	)
	@PostMapping(value="/selectSpcedtltrnprts")
	@BxmCategory(logicalName="공간.상세.거래내역.조회", description="통장쪼개기를 통해 생성된 공간의 거래내역을 조회하는 컴포넌트", author="90191355")
	public PBPPbokSpceDtlMngSelectSpcedtltrnprts_ODT selectSpcedtltrnprts(
		@ApiParam(value="input", example="") @RequestBody PBPPbokSpceDtlMngSelectSpcedtltrnprts_IDT input
		)
	{
		/**
		* @BXMType GetBean
		*/
		pBPPbokSpceDtlMng_SVC= WFApplicationContext.getBean(pBPPbokSpceDtlMng_SVC, PBPPbokSpceDtlMng_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		PBPPbokSpceDtlMngSelectSpcedtltrnprts_ODT output = pBPPbokSpceDtlMng_SVC.selectSpcedtltrnprts(input);

		return output;
	}
	
			
}
