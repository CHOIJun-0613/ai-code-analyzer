package com.skbank.sml.fns.pbp.ctr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlEstDeleteSpceatpm_IDT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlEstDeleteSpceatpm_ODT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlEstInsertSpceatpminf_IDT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlEstInsertSpceatpminf_ODT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlEstInsertSpcedtlest_IDT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlEstInsertSpcedtlest_ODT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlEstSelectRawActatpminf_IDT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlEstSelectRawActatpminf_ODT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlEstSelectSpcedtlatsest_IDT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlEstSelectSpcedtlatsest_ODT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprts_IDT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprts_ODT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlEstSelectSpcedtlgoalest_IDT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlEstSelectSpcedtlgoalest_ODT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlEstUpdateSpcedtlatsest_IDT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlEstUpdateSpcedtlatsest_ODT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlEstUpdateSpcedtlgoalest_IDT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlEstUpdateSpcedtlgoalest_ODT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlEstUpdateSpcedtlimg_IDT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlEstUpdateSpcedtlimg_ODT;
import com.skbank.sml.fns.pbp.svc.PBPPbokSpceDtlEst_SVC;

import bxm.common.annotaion.BxmCategory;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import fwk.skbank.online.context.WFApplicationContext;

/**
 * 1.업무명 : 금융서비스
 * 2.단위업무명 : NEWWON 중분류 통장쪼개기
 * 3.프로그램명 : 통장.공간.상세.설정.컨트롤러
 * 4.설명 : 통장의 공간을 상세 설정하는 컨트롤러
 * 
 * @Class PBPPbokSpceDtlEst_CTR.java
 * @author 90191355
 * @since 2024.04.15
 * @version 1.0
 */		
@RestController
@RequestMapping("/sml/fns/pbp/pbokspcedtlest")
@BxmCategory(logicalName="통장.공간.상세.설정.컨트롤러", description="통장의 공간을 상세 설정하는 컨트롤러", author="90191355")
@Api(tags={""})
public class PBPPbokSpceDtlEst_CTR {
	private Logger logger= LoggerFactory.getLogger(getClass());
	
	/**
	 * 통장.공간.상세.설정.서비스
	 */
	private PBPPbokSpceDtlEst_SVC pBPPbokSpceDtlEst_SVC;
	
	/**
	 * 통장쪼개기를 통해 생성된 공간의 상세 설정을 등록 관리하는 컨트롤러
	 * 
	 * @param input 공간.상세.설정.조회.컨트롤러.입력.IO
	 * @return 공간.상세.설정.조회.컨트롤러.출력.IO
	 */
	@ApiOperation(
		value = "공간.상세.설정.등록"
		, notes = ""
	)
	@PostMapping(value="/insertSpcedtlest")
	@BxmCategory(logicalName="공간.상세.설정.등록", description="통장쪼개기를 통해 생성된 공간의 상세 설정을 등록 관리하는 컨트롤러", author="90191355")
	public PBPPbokSpceDtlEstInsertSpcedtlest_ODT insertSpcedtlest(
		@ApiParam(value="input", example="") @RequestBody PBPPbokSpceDtlEstInsertSpcedtlest_IDT input
		)
	{
		/**
		* @BXMType GetBean
		*/
		pBPPbokSpceDtlEst_SVC= WFApplicationContext.getBean(pBPPbokSpceDtlEst_SVC, PBPPbokSpceDtlEst_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		PBPPbokSpceDtlEstInsertSpcedtlest_ODT output= pBPPbokSpceDtlEst_SVC.insertSpcedtlest(input);

		return output;
	}
	
	/**
	 * 통장쪼개기를 통해 생성된 공간의 이미지를 수정 관리하는 컨트롤러
	 * 
	 * @param input 공간.상세.이미지.컨트롤러.입력.IO
	 * @return 공간.상세.이미지.컨트롤러.출력.IO
	 */
	@ApiOperation(
		value = "공간.상세.이미지.수정"
		, notes = ""
	)
	@PostMapping(value="/updateSpcedtlimg")
	@BxmCategory(logicalName="공간.상세.이미지.수정", description="통장쪼개기를 통해 생성된 공간의 이미지를 수정 관리하는 컨트롤러", author="90191355")
	public PBPPbokSpceDtlEstUpdateSpcedtlimg_ODT updateSpcedtlimg(
		@ApiParam(value="input", example="") @RequestBody PBPPbokSpceDtlEstUpdateSpcedtlimg_IDT input
		)
	{
		/**
		* @BXMType GetBean
		*/
		pBPPbokSpceDtlEst_SVC= WFApplicationContext.getBean(pBPPbokSpceDtlEst_SVC, PBPPbokSpceDtlEst_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		PBPPbokSpceDtlEstUpdateSpcedtlimg_ODT output= pBPPbokSpceDtlEst_SVC.updateSpcedtlimg(input);

		return output;
	}
	
	/**
	 * 통장쪼개기를 통해 생성된 공간의 설정한 목표를 조회하는 컨트롤러
	 * 
	 * @param input 공간.상세.목표.설정.조회.컨트롤러.입력.IO
	 * @return 공간.상세.목표.설정.조회.컨트롤러.출력.IO
	 */
	@ApiOperation(
		value = "공간.상세.목표.설정.조회"
		, notes = ""
	)
	@PostMapping(value="/selectSpcedtlgoalest")
	@BxmCategory(logicalName="공간.상세.목표.설정.조회", description="통장쪼개기를 통해 생성된 공간의 설정한 목표를 조회하는 컨트롤러", author="90191355")
	public PBPPbokSpceDtlEstSelectSpcedtlgoalest_ODT selectSpcedtlgoalest(
		@ApiParam(value="input", example="") @RequestBody PBPPbokSpceDtlEstSelectSpcedtlgoalest_IDT input
		)
	{
		/**
		* @BXMType GetBean
		*/
		pBPPbokSpceDtlEst_SVC= WFApplicationContext.getBean(pBPPbokSpceDtlEst_SVC, PBPPbokSpceDtlEst_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		PBPPbokSpceDtlEstSelectSpcedtlgoalest_ODT output = pBPPbokSpceDtlEst_SVC.selectSpcedtlgoalest(input);

		return output;
	}
	
	/**
	 * 통장쪼개기를 통해 생성된 공간의 설정한 목표를 수정하는 컨트롤러
	 * 
	 * @param input 공간.상세.목표.설정.수정.컨트롤러.입력.IO
	 * @return 공간.상세.목표.설정.수정.컨트롤러.출력.IO
	 */
	@ApiOperation(
		value = "공간.상세.목표.설정.수정"
		, notes = ""
	)
	@PostMapping(value="/updateSpcedtlgoalest")
	@BxmCategory(logicalName="공간.상세.목표.설정.수정", description="통장쪼개기를 통해 생성된 공간의 설정한 목표를 수정하는 컨트롤러", author="90191355")
	public PBPPbokSpceDtlEstUpdateSpcedtlgoalest_ODT updateSpcedtlgoalest(
		@ApiParam(value="input", example="") @RequestBody PBPPbokSpceDtlEstUpdateSpcedtlgoalest_IDT input
		)
	{
		if (logger.isDebugEnabled()) {
			logger.debug("목표 설정 수정 값 ::: ", input);
		}
		/**
		* @BXMType GetBean
		*/
		pBPPbokSpceDtlEst_SVC= WFApplicationContext.getBean(pBPPbokSpceDtlEst_SVC, PBPPbokSpceDtlEst_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		PBPPbokSpceDtlEstUpdateSpcedtlgoalest_ODT output= pBPPbokSpceDtlEst_SVC.updateSpcedtlgoalest(input);

		return output;
	}
	
	/**
	 * 통장쪼개기를 통해 생성된 공간의 설정한 목표를 조회하는 컨트롤러
	 * 
	 * @param input 공간.상세.목표.상세.내역.조회.컨트롤러.입력.IO
	 * @return 공간.상세.목표.상세.내역.조회.컨트롤러.출력.IO
	 */
	@ApiOperation(
		value = "공간.상세.목표.상세.내역.조회"
		, notes = ""
	)
	@PostMapping(value="/selectSpcedtlgoaldtlprts")
	@BxmCategory(logicalName="공간.상세.목표.상세.내역.조회", description="통장쪼개기를 통해 생성된 공간의 설정한 목표를 조회하는 컨트롤러", author="90191355")
	public PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprts_ODT selectSpcedtlgoaldtlprts(
		@ApiParam(value="input", example="") @RequestBody PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprts_IDT input
		)
	{
		/**
		* @BXMType GetBean
		*/
		pBPPbokSpceDtlEst_SVC= WFApplicationContext.getBean(pBPPbokSpceDtlEst_SVC, PBPPbokSpceDtlEst_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprts_ODT output = pBPPbokSpceDtlEst_SVC.selectSpcedtlgoaldtlprts(input);

		return output;
	}
		
	/**
	 * 공간에서 설정한 자동이체를 수정 관리하는 컴포넌트
	 * 
	 * @param input 공간.상세.자동이체.설정.수정.컨트롤러.입력.IO
	 * @return 공간.상세.자동이체.설정.수정.컨트롤러.출력.IO
	 */
	@ApiOperation(
		value = "공간.상세.자동이체.설정.수정"
		, notes = ""
	)
	@PostMapping(value="/updateSpcedtlatsest")
	@BxmCategory(logicalName="공간.상세.자동이체.설정.수정", description="공간에서 설정한 자동이체를 수정 관리하는 컴포넌트", author="90191355")
	public PBPPbokSpceDtlEstUpdateSpcedtlatsest_ODT updateSpcedtlatsest(
		@ApiParam(value="input", example="") @RequestBody PBPPbokSpceDtlEstUpdateSpcedtlatsest_IDT input
		)
	{
		/**
		* @BXMType GetBean
		*/
		pBPPbokSpceDtlEst_SVC= WFApplicationContext.getBean(pBPPbokSpceDtlEst_SVC, PBPPbokSpceDtlEst_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		PBPPbokSpceDtlEstUpdateSpcedtlatsest_ODT output= pBPPbokSpceDtlEst_SVC.updateSpcedtlatsest(input);

		return output;
	}
	
	/**
	 * 공간에서 자동납부 대상을 관리하기 위해 조회하는 컨트롤러
	 * 
	 * @param input 입출금계좌.자동납부.정보.조회.컨트롤러.입력.IO
	 * @return 입출금계좌.자동납부.정보.조회.컨트롤러.출력.IO
	 */
	@ApiOperation(
		value = "입출금계좌.자동납부.정보.조회"
		, notes = ""
	)
	@PostMapping(value="/selectRawActatpminf")
	@BxmCategory(logicalName="입출금계좌.자동납부.정보.조회", description="공간에서 자동납부 대상을 관리하기 위해 조회하는 컨트롤러", author="90191355")
	public PBPPbokSpceDtlEstSelectRawActatpminf_ODT selectRawActatpminf(
		@ApiParam(value="input", example="") @RequestBody PBPPbokSpceDtlEstSelectRawActatpminf_IDT input
		)
	{
		/**
		* @BXMType GetBean
		*/
		pBPPbokSpceDtlEst_SVC= WFApplicationContext.getBean(pBPPbokSpceDtlEst_SVC, PBPPbokSpceDtlEst_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		PBPPbokSpceDtlEstSelectRawActatpminf_ODT output= pBPPbokSpceDtlEst_SVC.selectRawActatpminf(input);

		return output;
	}
	
	/**
	 * 공간에서 자동납부 대상을 등록 관리를 위한 컨트롤러
	 * 
	 * @param input 공간.자동납부.등록.컨트롤러.입력.IO
	 * @return 공간.자동납부.등록.컨트롤러.출력.IO
	 */
	@ApiOperation(
		value = "공간.자동납부.등록"
		, notes = ""
	)
	@PostMapping(value="/insertSpceatpminf")
	@BxmCategory(logicalName="공간.자동납부.등록", description="공간에서 자동납부 대상의 등록 관리를 위한 컨트롤러", author="90191355")
	public PBPPbokSpceDtlEstInsertSpceatpminf_ODT insertSpceatpminf(
		@ApiParam(value="input", example="") @RequestBody PBPPbokSpceDtlEstInsertSpceatpminf_IDT input
		)
	{
		/**
		* @BXMType GetBean
		*/
		pBPPbokSpceDtlEst_SVC= WFApplicationContext.getBean(pBPPbokSpceDtlEst_SVC, PBPPbokSpceDtlEst_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		PBPPbokSpceDtlEstInsertSpceatpminf_ODT output= pBPPbokSpceDtlEst_SVC.insertSpceatpm(input);

		return output;
	}
	
	/**
	 * 공간에서 자동납부 대상의 삭제 관리를 위한 컨트롤러
	 * 
	 * @param input 공간.자동납부.삭제.컨트롤러.입력.IO
	 * @return 공간.자동납부.삭제.컨트롤러.출력.IO
	 */
	@ApiOperation(
		value = "공간.자동납부.삭제"
		, notes = ""
	)
	@PostMapping(value="/deleteSpceatpm")
	@BxmCategory(logicalName="공간.자동납부.삭제", description="공간에서 자동납부 대상의 삭제 관리를 위한 컨트롤러", author="90191355")
	public PBPPbokSpceDtlEstDeleteSpceatpm_ODT deleteSpceatpm(
		@ApiParam(value="input", example="") @RequestBody PBPPbokSpceDtlEstDeleteSpceatpm_IDT input
		)
	{
		/**
		* @BXMType GetBean
		*/
		pBPPbokSpceDtlEst_SVC= WFApplicationContext.getBean(pBPPbokSpceDtlEst_SVC, PBPPbokSpceDtlEst_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		PBPPbokSpceDtlEstDeleteSpceatpm_ODT output= pBPPbokSpceDtlEst_SVC.deleteSpceatpm(input);

		return output;
	}
	
			
}
