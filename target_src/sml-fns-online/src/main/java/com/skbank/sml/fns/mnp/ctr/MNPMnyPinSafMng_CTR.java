package com.skbank.sml.fns.mnp.ctr;

import bxm.common.annotaion.BxmCategory;
import com.skbank.sml.fns.mnp.ctr.MNPMnyPinSafMng_CTR;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinSafMngInsertSafBscInf_ODT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinSafMngSelectIntSafAnls_IDT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinSafMngSelectIntSafAnls_ODT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinSafMngSelectMnpSafBal_IDT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinSafMngSelectMnpSafBal_ODT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinSafMngInsertSafBscInf_IDT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinSafMngSelectSafBscInf_IDT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinSafMngSelectSafBscInf_ODT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinSafMngSelectSafGoalInf_IDT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinSafMngSelectSafGoalInf_ODT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinSafMngSelectTrnPrts_IDT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinSafMngSelectTrnPrts_ODT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinSafMngUpdateSafAmRaw_IDT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinSafMngUpdateSafAmRaw_ODT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinSafMngUpdateSafBscInf_IDT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinSafMngUpdateSafBscInf_ODT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinSafMngUpdateSafGoalInfScss_IDT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinSafMngUpdateSafGoalInfScss_ODT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinSafMngUpdateSafGoalInf_IDT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinSafMngUpdateSafGoalInf_ODT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinSafMngUpdateSafScss_IDT;
import com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinSafMngUpdateSafScss_ODT;
import com.skbank.sml.fns.mnp.svc.MNPMnyPinSafMng_SVC;


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
 * 3.프로그램명 : 머니클립금고관리
 * 4.설명 : 
 * 
 * @Class MNPMnyPinSafMng_CTR.java
 * @author 90190263
 * @since 2024.08.06
 * @version 1.0
 */		
@RestController
@RequestMapping("/sml/fns/mnp/mnypinsafmng")
@Api(tags={""})
@BxmCategory(logicalName="머니클립금고관리", description="머니클립의 금고 정보를 관리하는 컨트롤러", author="90190263")
public class MNPMnyPinSafMng_CTR {
	private final Logger logger= LoggerFactory.getLogger(this.getClass());
	
	/**
	 * 모임통장.일반.관리.서비스
	 */
	private MNPMnyPinSafMng_SVC mNPMnyPinSafMng_SVC;
	
	/**
	 * 금고 기본 정보 조회
	 * 
	 * @param input MnyPinSafMng 입력
	 * @return MnyPinSafMng 출력
	 */
	@PostMapping("/selectSafBscInf")
	@ApiOperation(
		value = "머니클립금고기본정보조회"
		, notes = ""
	)
	@BxmCategory(logicalName="머니클립금고기본정보조회", description="머니클립 금고의 기본정보를 조회한다.", author="90190263")
	public MNPMnyPinSafMngSelectSafBscInf_ODT selectSafBscInf(
			@ApiParam(value="input", example="") @RequestBody MNPMnyPinSafMngSelectSafBscInf_IDT input
	) {
		/**
		* @BXMType GetBean
		*/
		mNPMnyPinSafMng_SVC= WFApplicationContext.getBean(mNPMnyPinSafMng_SVC, MNPMnyPinSafMng_SVC.class);
					
		/**
		 * @BXMType VariableDeclaration
		 */
		MNPMnyPinSafMngSelectSafBscInf_ODT output = new MNPMnyPinSafMngSelectSafBscInf_ODT();
		
		/*
		 * 머니클립 금고 기본정보조회 호출 
		 */
		output = mNPMnyPinSafMng_SVC.selectSafBscInf(input);
					
		return output;
	}
	
	/**
	 * 금고 기본 정보 등록
	 * 
	 * @param input MnyPinSafMng 입력
	 * @return MnyPinSafMng 출력
	 */
	@PostMapping("/insertSafBscInf")
	@ApiOperation(
		value = "머니클립금고기본정보등록"
		, notes = ""
	)
	@BxmCategory(logicalName="머니클립금고기본정보등록", description="머니클립 금고의 기본정보를 등록한다.", author="90190263")
	public MNPMnyPinSafMngInsertSafBscInf_ODT insertSafBscInf(
			@ApiParam(value="input", example="") @RequestBody MNPMnyPinSafMngInsertSafBscInf_IDT input
	) {
		/**
		* @BXMType GetBean
		*/
		mNPMnyPinSafMng_SVC= WFApplicationContext.getBean(mNPMnyPinSafMng_SVC, MNPMnyPinSafMng_SVC.class);
					
		/**
		 * @BXMType VariableDeclaration
		 */
		MNPMnyPinSafMngInsertSafBscInf_ODT output = new MNPMnyPinSafMngInsertSafBscInf_ODT();
		
		/*
		 * 머니클립 금고 기본정보조회 호출 
		 */
		output = mNPMnyPinSafMng_SVC.insertSafBscInf(input);
					
		return output;
	}
	
	/**
	 * 금고 기본 정보 수정
	 * 
	 * @param input MnyPinSafMng 입력
	 * @return MnyPinSafMng 출력
	 */
	@PostMapping("/updateSafBscInf")
	@ApiOperation(
		value = "머니클립금고기본정보수정"
		, notes = ""
	)
	@BxmCategory(logicalName="머니클립금고기본정보수정", description="머니클립 금고의 기본정보를 수정 한다.", author="90190263")
	public MNPMnyPinSafMngUpdateSafBscInf_ODT updateSafBscInf(@ApiParam(value="input", example="") 
	@RequestBody MNPMnyPinSafMngUpdateSafBscInf_IDT input
	) {
		/**
		* @BXMType GetBean
		*/
		mNPMnyPinSafMng_SVC= WFApplicationContext.getBean(mNPMnyPinSafMng_SVC, MNPMnyPinSafMng_SVC.class);
					
		/**
		 * @BXMType VariableDeclaration
		 */
		MNPMnyPinSafMngUpdateSafBscInf_ODT output = new MNPMnyPinSafMngUpdateSafBscInf_ODT();
		
		/*
		 * 머니클립 금고 기본정보조회 호출 
		 */
		output = mNPMnyPinSafMng_SVC.updateSafBscInf(input);
					
		return output;
	}
	
	/**
	 * 머니클립 금고를 해지 수정
	 * 
	 * @param input MnyPinSafMng 입력
	 * @return MnyPinSafMng 출력
	 */
	@PostMapping("/updateSafScss")
	@ApiOperation(
		value = "머니클립금고해지수정"
		, notes = ""
	)
	@BxmCategory(logicalName="머니클립금고해지수정", description="머니클립 금고를 해지 수정 한다.", author="90190263")
	public MNPMnyPinSafMngUpdateSafScss_ODT updateSafScss(@ApiParam(value="input", example="") 
	@RequestBody MNPMnyPinSafMngUpdateSafScss_IDT input
	) {
		/**
		* @BXMType GetBean
		*/
		mNPMnyPinSafMng_SVC= WFApplicationContext.getBean(mNPMnyPinSafMng_SVC, MNPMnyPinSafMng_SVC.class);
					
		/**
		 * @BXMType VariableDeclaration
		 */
		MNPMnyPinSafMngUpdateSafScss_ODT output = new MNPMnyPinSafMngUpdateSafScss_ODT();
		
		output = mNPMnyPinSafMng_SVC.updateSafScss(input);
					
		return output;
	}
	/**
	 * 금고 금액 입출금 수정
	 * 
	 * 머니클립 금고의 금액을 꺼내기/채우기 금액을 수정한다
	 * 
	 * @param input MnyPinSafMng 입력
	 * @return MnyPinSafMng 출력
	 */
	@PostMapping("/updateSafAmRaw")
	@ApiOperation(
		value = "머니클립금고금액입출금수정"
		, notes = ""
	)
	@BxmCategory(logicalName="머니클립금고금액입출금수정", description="머니클립 금고의 금액을 꺼내기/채우기 금액을 수정한다.", author="90190263")
	public MNPMnyPinSafMngUpdateSafAmRaw_ODT updateSafAmRaw(@ApiParam(value="input", example="") 
	@RequestBody MNPMnyPinSafMngUpdateSafAmRaw_IDT input
	) {
		/**
		* @BXMType GetBean
		*/
		mNPMnyPinSafMng_SVC= WFApplicationContext.getBean(mNPMnyPinSafMng_SVC, MNPMnyPinSafMng_SVC.class);
					
		/**
		 * @BXMType VariableDeclaration
		 */
		MNPMnyPinSafMngUpdateSafAmRaw_ODT output = new MNPMnyPinSafMngUpdateSafAmRaw_ODT();
		
		/*
		 * 머니클립 금고 기본정보조회 호출 
		 */
		output = mNPMnyPinSafMng_SVC.updateSafAmRaw(input);
					
		return output;
	}
	

	/**
	 * 머니클립 금고의 목표 정보를 조회한다.
	 * 
	 * @param input MnyPinSafMng 입력
	 * @return MnyPinSafMng 출력
	 */
	@PostMapping("/selectSafGoalInf")
	@ApiOperation(
		value = "머니클립금고목표정보조회"
		, notes = ""
	)
	@BxmCategory(logicalName="머니클립금고목표정보조회", description="머니클립 금고의 목표 정보를 조회한다.", author="90190263")
	public MNPMnyPinSafMngSelectSafGoalInf_ODT selectSafGoalInf(@ApiParam(value="input", example="") 
	@RequestBody MNPMnyPinSafMngSelectSafGoalInf_IDT input
	) {
		/**
		* @BXMType GetBean
		*/
		mNPMnyPinSafMng_SVC= WFApplicationContext.getBean(mNPMnyPinSafMng_SVC, MNPMnyPinSafMng_SVC.class);
					
		/**
		 * @BXMType VariableDeclaration
		 */
		MNPMnyPinSafMngSelectSafGoalInf_ODT output = new MNPMnyPinSafMngSelectSafGoalInf_ODT();
		
		/*
		 * 머니클립 금고 목표정보를 조회한다. 
		 */
		output = mNPMnyPinSafMng_SVC.selectSafGoalInf(input);
					
		return output;
	}
	
	/**
	 * 머니클립 금고의 목표를 등록/수정하는 컨트롤러
	 * 
	 * @param input MnyPinSafMng 입력
	 * @return MnyPinSafMng 출력
	 */
	@PostMapping("/updateSafGoalInf")
	@ApiOperation(
		value = "머니클립금고목표정보수정"
		, notes = ""
	)
	@BxmCategory(logicalName="머니클립금고목표정보수정", description="머니클립 금고의 목표를 수정한다.", author="90190263")
	public MNPMnyPinSafMngUpdateSafGoalInf_ODT updateSafGoalInf(@ApiParam(value="input", example="") 
	@RequestBody MNPMnyPinSafMngUpdateSafGoalInf_IDT input
	) {
		/**
		* @BXMType GetBean
		*/
		mNPMnyPinSafMng_SVC= WFApplicationContext.getBean(mNPMnyPinSafMng_SVC, MNPMnyPinSafMng_SVC.class);
					
		/**
		 * @BXMType VariableDeclaration
		 */
		MNPMnyPinSafMngUpdateSafGoalInf_ODT output = new MNPMnyPinSafMngUpdateSafGoalInf_ODT();
		
		/*
		 * 머니클립 금고 목표정보를 수정한다. 
		 */
		output = mNPMnyPinSafMng_SVC.updateSafGoalInf(input);
					
		return output;
	}

	/**
	 * 머니클립 금고의 목표를 등록/수정하는 컨트롤러
	 * 
	 * @param input MnyPinSafMng 입력
	 * @return MnyPinSafMng 출력
	 */
	@PostMapping("/updateSafGoalInfScss")
	@ApiOperation(
		value = "머니클립금고목표정보수정"
		, notes = ""
	)
	@BxmCategory(logicalName="머니클립금고목표정보해지", description="머니클립 금고의 목표를 해지한다.", author="90190263")
	public MNPMnyPinSafMngUpdateSafGoalInfScss_ODT updateSafGoalInfScss(@ApiParam(value="input", example="") 
	@RequestBody MNPMnyPinSafMngUpdateSafGoalInfScss_IDT input
	) {
		/**
		* @BXMType GetBean
		*/
		mNPMnyPinSafMng_SVC= WFApplicationContext.getBean(mNPMnyPinSafMng_SVC, MNPMnyPinSafMng_SVC.class);
					
		/**
		 * @BXMType VariableDeclaration
		 */
		MNPMnyPinSafMngUpdateSafGoalInfScss_ODT output = new MNPMnyPinSafMngUpdateSafGoalInfScss_ODT();
		
		/*
		 * 머니클립 금고 목표정보를 수정한다. 
		 */
		output = mNPMnyPinSafMng_SVC.updateSafGoalInfScss(input);
					
		return output;
	}
	
	/**
	 * 머니클립 금고의 거래내역을 조회하는 컨트롤러
	 * 
	 * @param input MnyPinSafMng 입력
	 * @return MnyPinSafMng 출력
	 */
	@PostMapping("/selectTrnPrts")
	@ApiOperation(
		value = "머니클립금고거래내역조회"
		, notes = ""
	)
	@BxmCategory(logicalName="머니클립금고거래내역조회", description="머니클립 금고의 거래내역을 조회한다.", author="90190263")
	public MNPMnyPinSafMngSelectTrnPrts_ODT selectTrnPrts(@ApiParam(value="input", example="") 
	@RequestBody MNPMnyPinSafMngSelectTrnPrts_IDT input
	) {
		/**
		* @BXMType GetBean
		*/
		mNPMnyPinSafMng_SVC= WFApplicationContext.getBean(mNPMnyPinSafMng_SVC, MNPMnyPinSafMng_SVC.class);
					
		/**
		 * @BXMType VariableDeclaration
		 */
		MNPMnyPinSafMngSelectTrnPrts_ODT output = new MNPMnyPinSafMngSelectTrnPrts_ODT();
		
		/*
		 * 머니클립 금고 거래내역 조회 
		 */
		output = mNPMnyPinSafMng_SVC.selectTrnPrts(input);
					
		return output;
	}
	
	/**
	 * 머니클립 월말 잔액 조회
	 * 
	 * @param input MnyPinSafMng 입력
	 * @return MnyPinSafMng 출력
	 */
	@PostMapping("/selectMnpSafBal")
	@ApiOperation(
		value = "머니클립금고월말잔액조회"
		, notes = ""
	)
	@BxmCategory(logicalName="머니클립금고월말잔액조회", description="머니클립 금고의 월말잔액내역을 조회한다.", author="90190263")
	public MNPMnyPinSafMngSelectMnpSafBal_ODT selectMnpSafBal(@ApiParam(value="input", example="") 
	@RequestBody MNPMnyPinSafMngSelectMnpSafBal_IDT input
	) {
		/**
		* @BXMType GetBean
		*/
		mNPMnyPinSafMng_SVC= WFApplicationContext.getBean(mNPMnyPinSafMng_SVC, MNPMnyPinSafMng_SVC.class);
					
		/**
		 * @BXMType VariableDeclaration
		 */
		MNPMnyPinSafMngSelectMnpSafBal_ODT output = new MNPMnyPinSafMngSelectMnpSafBal_ODT();
		
		/*
		 * 머니클립 금고 잔액 내역 조회 
		 */
		output = mNPMnyPinSafMng_SVC.selectMnpSafBal(input);
					
		return output;
	}
	
	/**
	 * 금고 이자분석조회
	 * 
	 * @param input MnyPinSafMng 입력
	 * @return MnyPinSafMng 출력
	 */
	@PostMapping("/selectIntSafAnls")
	@ApiOperation(
		value = "금고이자분석조회"
		, notes = ""
	)
	@BxmCategory(logicalName="금고이자분석조회", description="머니클립 금고의 이자를 분석하고 조회한다.", author="90190263")
	public MNPMnyPinSafMngSelectIntSafAnls_ODT selectIntSafAnls(@ApiParam(value="input", example="") 
	@RequestBody MNPMnyPinSafMngSelectIntSafAnls_IDT input
	) {
		/**
		* @BXMType GetBean
		*/
		mNPMnyPinSafMng_SVC= WFApplicationContext.getBean(mNPMnyPinSafMng_SVC, MNPMnyPinSafMng_SVC.class);
					
		/**
		 * @BXMType VariableDeclaration
		 */
		MNPMnyPinSafMngSelectIntSafAnls_ODT output = new MNPMnyPinSafMngSelectIntSafAnls_ODT();
		
		/*
		 * 머니클립 금고 잔액 내역 조회 
		 */
		output = mNPMnyPinSafMng_SVC.selectIntSafAnls(input);
					
		return output;
	}
}
