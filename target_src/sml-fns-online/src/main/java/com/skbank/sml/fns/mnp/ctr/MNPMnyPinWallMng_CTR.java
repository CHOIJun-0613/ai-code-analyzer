package com.skbank.sml.fns.mnp.ctr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinWallMngDeleteWallScss_IDT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinWallMngDeleteWallScss_ODT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinWallMngInsertWallBscInf_IDT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinWallMngInsertWallBscInf_ODT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinWallMngInsertWallIntAmTs_IDT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinWallMngInsertWallIntAmTs_ODT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinWallMngSelectWallBscInf_IDT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinWallMngSelectWallBscInf_ODT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinWallMngSelectWallGoalDtlPrts_IDT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinWallMngSelectWallGoalDtlPrts_ODT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinWallMngSelectWallGoalInf_IDT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinWallMngSelectWallGoalInf_ODT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinWallMngSelectWallIntDtlPrts_IDT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinWallMngSelectWallIntDtlPrts_ODT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinWallMngSelectWallIntInf_IDT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinWallMngSelectWallIntInf_ODT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinWallMngSelectWallIntPrts_IDT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinWallMngSelectWallIntPrts_ODT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinWallMngSelectWallTrnPrts_IDT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinWallMngSelectWallTrnPrts_ODT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinWallMngUpdateWallAmRaw_IDT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinWallMngUpdateWallAmRaw_ODT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinWallMngUpdateWallBscInf_IDT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinWallMngUpdateWallBscInf_ODT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinWallMngUpdateWallGoalInf_IDT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinWallMngUpdateWallGoalInf_ODT;
import com.skbank.sml.fns.mnp.svc.MNPMnyPinWallMng_SVC;

import bxm.common.annotaion.BxmCategory;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import fwk.skbank.online.context.WFApplicationContext;

/**
 * 1.업무명 : 
 * 2.단위업무명 : 
 * 3.프로그램명 : 머니클립지갑관리
 * 4.설명 : 
 * 
 * @Class MNPMnyPinWallMng_CTR.java
 * @author 90190263
 * @since 2024.08.06
 * @version 1.0
 */		
@RestController
@RequestMapping("/sml/fns/mnp/mnypinwallmng")
@Api(tags={""})
@BxmCategory(logicalName="머니클립지갑관리", description="머니클립의 지갑 정보를 관리하는 컨트롤러", author="90190263")
public class MNPMnyPinWallMng_CTR {
	private final Logger logger= LoggerFactory.getLogger(this.getClass());
	
	private MNPMnyPinWallMng_SVC mNPMnyPinWallMng_SVC;
	

	/**
	 * 머니클립 지갑 기본 정보 조회
	 * 
	 * @param input 머니클립 지갑 기본 정보 조회 입력IO
	 * @return 머니클립 지갑 기본 정보 조회 출력IO
	 */
	@PostMapping("/selectWallBscInf")
	@ApiOperation(
		value = "머니클립지갑기본정보조회"
		, notes = ""
	)
	@BxmCategory(logicalName="머니클립지갑기본정보조회", description="머니클립 지갑의 기본정보를 조회한다.", author="90191355")
	public MNPMnyPinWallMngSelectWallBscInf_ODT selectWallBscInf(
			@ApiParam(value="input", example="") @RequestBody MNPMnyPinWallMngSelectWallBscInf_IDT input
	) {
		/**
		* @BXMType GetBean
		*/
		mNPMnyPinWallMng_SVC= WFApplicationContext.getBean(mNPMnyPinWallMng_SVC, MNPMnyPinWallMng_SVC.class);
					
		/**
		 * @BXMType VariableDeclaration
		 */
		MNPMnyPinWallMngSelectWallBscInf_ODT output = mNPMnyPinWallMng_SVC.selectWallBscInf(input);
		
		return output;
	}

	/**
	 * 머니클립 지갑 기본 정보 등록
	 * 
	 * @param input 머니클립 지갑 기본 정보 등록 입력IO
	 * @return 머니클립 지갑 기본 정보 등록 출력IO
	 */
	@PostMapping("/insertWallBscInf")
	@ApiOperation(
		value = "머니클립지갑기본정보등록"
		, notes = ""
	)
	@BxmCategory(logicalName = "머니클립지갑기본정보등록", description = "머니클립 지갑 기본 정보를 등록한다.", author="90191355")
	public MNPMnyPinWallMngInsertWallBscInf_ODT insertWallBscInf(
			@ApiParam(value="input", example="") @RequestBody MNPMnyPinWallMngInsertWallBscInf_IDT input
	) {
		/**
		* @BXMType GetBean
		*/
		mNPMnyPinWallMng_SVC= WFApplicationContext.getBean(mNPMnyPinWallMng_SVC, MNPMnyPinWallMng_SVC.class);
					
		/**
		 * @BXMType VariableDeclaration
		 */
		MNPMnyPinWallMngInsertWallBscInf_ODT output = mNPMnyPinWallMng_SVC.insertWallBscInf(input);
					
		return output;
	}
	

	/**
	 * 지갑 기본 정보 수정
	 * 
	 * @param input 머니클립 지갑 기본 정보 수정 입력IO
	 * @return 머니클립 지갑 기본 정보 수정 출력IO
	 */
	@PostMapping("/updateWallBscInf")
	@ApiOperation(
		value = "머니클립지갑기본정보수정"
		, notes = ""
	)
	@BxmCategory(logicalName="머니클립지갑기본정보수정", description="머니클립 지갑의 기본정보를 수정한다.", author="90191355")
	public MNPMnyPinWallMngUpdateWallBscInf_ODT updateWallBscInf(@ApiParam(value="input", example="") 
	@RequestBody MNPMnyPinWallMngUpdateWallBscInf_IDT input
	) {
		/**
		* @BXMType GetBean
		*/
		mNPMnyPinWallMng_SVC= WFApplicationContext.getBean(mNPMnyPinWallMng_SVC, MNPMnyPinWallMng_SVC.class);
					
		/**
		 * @BXMType VariableDeclaration
		 */
		MNPMnyPinWallMngUpdateWallBscInf_ODT output = mNPMnyPinWallMng_SVC.updateWallBscInf(input);
					
		return output;
	}
	
	/**
	 * 머니클립 지갑을 해지
	 * 
	 * @param input 머니클립 지갑 해지 입력IO
	 * @return 머니클립 지갑 해지 출력IO
	 */
	@PostMapping("/deleteWallScss")
	@ApiOperation(
		value = "머니클립지갑해지"
		, notes = ""
	)
	@BxmCategory(logicalName = "머니클립지갑해지", description = "머니클립 지갑를 해지하는 서비스", author="90191355")
	public MNPMnyPinWallMngDeleteWallScss_ODT deleteWallScss(@ApiParam(value="input", example="") 
	@RequestBody MNPMnyPinWallMngDeleteWallScss_IDT input
	) {
		/**
		* @BXMType GetBean
		*/
		mNPMnyPinWallMng_SVC= WFApplicationContext.getBean(mNPMnyPinWallMng_SVC, MNPMnyPinWallMng_SVC.class);
					
		/**
		 * @BXMType VariableDeclaration
		 */
		MNPMnyPinWallMngDeleteWallScss_ODT output = mNPMnyPinWallMng_SVC.deleteWallScss(input);
					
		return output;
	}
	
	/**
	 * 지갑 금액 입출금 수정
	 * 
	 * 머니클립 지갑의 금액을 꺼내기/채우기 금액을 수정한다
	 * 
	 * @param input 머니클립 지갑 금액 입출금 수정 입력IO
	 * @return 머니클립 지갑 금액 입출금 수정 출력IO
	 */
	@PostMapping("/updateWallAmRaw")
	@ApiOperation(
		value = "머니클립지갑금액입출금수정"
		, notes = ""
	)
	@BxmCategory(logicalName="머니클립지갑금액입출금수정", description="머니클립 지갑의 금액을 꺼내기/채우기 금액을 수정한다.", author="90191355")
	public MNPMnyPinWallMngUpdateWallAmRaw_ODT updateWallAmRaw(@ApiParam(value="input", example="") 
	@RequestBody MNPMnyPinWallMngUpdateWallAmRaw_IDT input
	) {
		/**
		* @BXMType GetBean
		*/
		mNPMnyPinWallMng_SVC= WFApplicationContext.getBean(mNPMnyPinWallMng_SVC, MNPMnyPinWallMng_SVC.class);
					
		/**
		 * @BXMType VariableDeclaration
		 */
		MNPMnyPinWallMngUpdateWallAmRaw_ODT output = mNPMnyPinWallMng_SVC.updateWallAmRaw(input);
					
		return output;
	}
	

	/**
	 * 머니클립 지갑의 목표 정보를 조회한다.
	 * 
	 * @param input 머니클립 지갑 목표정보조회 입력IO
	 * @return  머니클립 지갑 목표정보조회 출력IO
	 */
	@PostMapping("/selectWallGoalInf")
	@ApiOperation(
		value = "머니클립지갑목표정보조회"
		, notes = ""
	)
	@BxmCategory(logicalName="머니클립지갑목표정보조회", description="머니클립 지갑의 목표 정보를 조회한다.", author="90191355")
	public MNPMnyPinWallMngSelectWallGoalInf_ODT selectWallGoalInf(@ApiParam(value="input", example="") 
	@RequestBody MNPMnyPinWallMngSelectWallGoalInf_IDT input
	) {
		/**
		* @BXMType GetBean
		*/
		mNPMnyPinWallMng_SVC= WFApplicationContext.getBean(mNPMnyPinWallMng_SVC, MNPMnyPinWallMng_SVC.class);
					
		/**
		 * @BXMType VariableDeclaration
		 */
		MNPMnyPinWallMngSelectWallGoalInf_ODT output = mNPMnyPinWallMng_SVC.selectWallGoalInf(input);
					
		return output;
	}
	
	/**
	 * 머니클립 지갑의 목표를 등록/수정하는 컨트롤러
	 * TODO 확인 필요
	 * @param input 머니클립 지갑 목표정보수정 입력IO
	 * @return 머니클립 지갑 목표정보수정 출력IO
	 */
	@PostMapping("/updateWallGoalInf")
	@ApiOperation(
		value = "머니클립지갑목표정보수정"
		, notes = ""
	)
	@BxmCategory(logicalName="머니클립지갑목표정보수정", description="머니클립 지갑의 목표를 수정한다.", author="90191355")
	public MNPMnyPinWallMngUpdateWallGoalInf_ODT updateWallGoalInf(@ApiParam(value="input", example="") 
	@RequestBody MNPMnyPinWallMngUpdateWallGoalInf_IDT input
	) {
		/**
		* @BXMType GetBean
		*/
		mNPMnyPinWallMng_SVC= WFApplicationContext.getBean(mNPMnyPinWallMng_SVC, MNPMnyPinWallMng_SVC.class);
					
		/**
		 * @BXMType VariableDeclaration
		 */
		MNPMnyPinWallMngUpdateWallGoalInf_ODT output = mNPMnyPinWallMng_SVC.updateWallGoalInf(input);
					
		return output;
	}

	/**
	 * 머니클립 지갑의 목표 상세내역을 조회하는 컨트롤러
	 * 지갑 월말 잔액 조회
	 * @param input 머니클립 지갑 목표상세내역조회 입력IO
	 * @return 머니클립 지갑 목표상세내역조회 출력IO
	 */
	@PostMapping("/selectWallGoalDtlPrts")
	@ApiOperation(
		value = "머니클립지갑목표상세내역조회"
		, notes = ""
	)
	@BxmCategory(logicalName="머니클립지갑목표상세내역조회", description="머니클립 지갑의 목표 상세내역을 조회한다.", author="90191355")
	public MNPMnyPinWallMngSelectWallGoalDtlPrts_ODT selectWallGoalDtlPrts(@ApiParam(value="input", example="") 
	@RequestBody MNPMnyPinWallMngSelectWallGoalDtlPrts_IDT input
	) {
		/**
		* @BXMType GetBean
		*/
		mNPMnyPinWallMng_SVC= WFApplicationContext.getBean(mNPMnyPinWallMng_SVC, MNPMnyPinWallMng_SVC.class);
					
		/**
		 * @BXMType VariableDeclaration
		 */
		MNPMnyPinWallMngSelectWallGoalDtlPrts_ODT output = mNPMnyPinWallMng_SVC.selectWallGoalDtlPrts(input);
					
		return output;
	}
	
	/**
	 * 머니클립 지갑의 거래내역을 조회하는 컨트롤러
	 * 
	 * @param input 머니클립 지갑 거래내역조회 입력IO
	 * @return 머니클립 지갑 거래내역조회 출력IO
	 */
	@PostMapping("/selectWallTrnPrts")
	@ApiOperation(
		value = "머니클립지갑거래내역조회"
		, notes = ""
	)
	@BxmCategory(logicalName="머니클립지갑거래내역조회", description="머니클립 지갑의 거래내역을 조회한다.", author="90191355")
	public MNPMnyPinWallMngSelectWallTrnPrts_ODT selectWallTrnPrts(@ApiParam(value="input", example="") 
	@RequestBody MNPMnyPinWallMngSelectWallTrnPrts_IDT input
	) {
		/**
		* @BXMType GetBean
		*/
		mNPMnyPinWallMng_SVC= WFApplicationContext.getBean(mNPMnyPinWallMng_SVC, MNPMnyPinWallMng_SVC.class);
					
		/**
		 * @BXMType VariableDeclaration
		 */
		MNPMnyPinWallMngSelectWallTrnPrts_ODT output = mNPMnyPinWallMng_SVC.selectWallTrnPrts(input);
					
		return output;
	}
	
	/**
	 * 머니클립 지갑의 받을 이자 정보를 조회
	 * 
	 * @param input 머니클립 지갑 이자계산정보조회 입력IO
	 * @return 머니클립 지갑 이자계산정보조회 출력IO
	 */
	@PostMapping("/selectWallIntInf")
	@ApiOperation(
		value = "머니클립지갑이자정보조회"
		, notes = ""
	)
	@BxmCategory(logicalName = "머니클립지갑이자정보조회", description = "머니클립 지갑의 받을 이자 정보를 조회한다.", author="90191355")
	public MNPMnyPinWallMngSelectWallIntInf_ODT selectWallIntInf(
			@ApiParam(value="input", example="") @RequestBody MNPMnyPinWallMngSelectWallIntInf_IDT input
	) {
		/**
		* @BXMType GetBean
		*/
		mNPMnyPinWallMng_SVC= WFApplicationContext.getBean(mNPMnyPinWallMng_SVC, MNPMnyPinWallMng_SVC.class);
					
		/**
		 * @BXMType VariableDeclaration
		 */
		MNPMnyPinWallMngSelectWallIntInf_ODT output = mNPMnyPinWallMng_SVC.selectWallIntInf(input);
					
		return output;
	}
	
	/**
	 * 머니클립 지갑 이자 즉시 실행
	 * TODO 수정 확인 필요
	 * @param input 머니클립 지갑 이자 즉시 실행 입력IO
	 * @return 머니클립 지갑 이자 즉시 실행 출력IO
	 */
	@PostMapping("/insertWallIntAmTs")
	@ApiOperation(
		value = "머니클립지갑이자즉시실행"
		, notes = ""
	)
	@BxmCategory(logicalName = "머니클립지갑이자즉시실행", description = "머니클립 지갑의 이자를 즉시 실행한다.", author="90191355")
	public MNPMnyPinWallMngInsertWallIntAmTs_ODT insertWallIntAmTs(
			@ApiParam(value="input", example="") @RequestBody MNPMnyPinWallMngInsertWallIntAmTs_IDT input
	) {
		/**
		* @BXMType GetBean
		*/
		mNPMnyPinWallMng_SVC= WFApplicationContext.getBean(mNPMnyPinWallMng_SVC, MNPMnyPinWallMng_SVC.class);
					
		/**
		 * @BXMType VariableDeclaration
		 */
		MNPMnyPinWallMngInsertWallIntAmTs_ODT output = mNPMnyPinWallMng_SVC.insertWallIntAmTs(input);
					
		return output;
	}
	
	/**
	 * 머니클립 지갑의 받은 이자 내역 조회하는 서비스
	 * TODO 수정 확인 필요
	 * @param input 머니클립 지갑 이자내역조회 입력IO
	 * @return 머니클립 지갑 이자내역조회 출력IO
	 */
	@PostMapping("/selectWallIntPrts")
	@ApiOperation(
		value = "머니클립지갑이자내역조회"
		, notes = ""
	)
	@BxmCategory(logicalName = "머니클립지갑이자내역조회", description = "머니클립 지갑의 받은 이자 내역 조회한다.", author="90191355")
	public MNPMnyPinWallMngSelectWallIntPrts_ODT selectWallIntPrts(@ApiParam(value="input", example="") @RequestBody MNPMnyPinWallMngSelectWallIntPrts_IDT input) {
		/**
		* @BXMType GetBean
		*/
		mNPMnyPinWallMng_SVC= WFApplicationContext.getBean(mNPMnyPinWallMng_SVC, MNPMnyPinWallMng_SVC.class);
					
		/**
		 * @BXMType VariableDeclaration
		 */
		MNPMnyPinWallMngSelectWallIntPrts_ODT output = mNPMnyPinWallMng_SVC.selectWallIntPrts(input);
		
		return output;
	}

	/**
	 * 머니클립 지갑의 이자 상세 내역을 조회하는 서비스
	 * TODO 수정 확인 필요
	 * @param input 머니클립 지갑 이자 상세 내역 조회 입력IO
	 * @return 머니클립 지갑 이자 상세 내역 조회 출력IO
	 */
	@PostMapping("/selectWallIntDtlPrts")
	@ApiOperation(
		value = "머니클립지갑이자상세내역조회"
		, notes = ""
	)
	@BxmCategory(logicalName = "머니클립지갑이자상세내역조회", description = "머니클립 지갑의 받은 이자 상세 내역을 조회한다.", author="90191355")
	public MNPMnyPinWallMngSelectWallIntDtlPrts_ODT selectWallIntDtlPrts(@ApiParam(value="input", example="") @RequestBody MNPMnyPinWallMngSelectWallIntDtlPrts_IDT input) {
		/**
		* @BXMType GetBean
		*/
		mNPMnyPinWallMng_SVC= WFApplicationContext.getBean(mNPMnyPinWallMng_SVC, MNPMnyPinWallMng_SVC.class);
					
		/**
		 * @BXMType VariableDeclaration
		 */
		MNPMnyPinWallMngSelectWallIntDtlPrts_ODT output = mNPMnyPinWallMng_SVC.selectWallIntDtlPrts(input);
		
					
		return output;
	}

}
