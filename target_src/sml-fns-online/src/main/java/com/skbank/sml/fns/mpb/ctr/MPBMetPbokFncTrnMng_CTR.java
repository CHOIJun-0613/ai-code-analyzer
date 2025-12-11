package com.skbank.sml.fns.mpb.ctr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokFncTrnMngDeleteTsReqprtsinf_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokFncTrnMngDeleteTsReqprtsinf_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokFncTrnMngInsertAsscNompefTsApv_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokFncTrnMngInsertAsscNompefTsApv_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokFncTrnMngInsertTsApv_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokFncTrnMngInsertTsApv_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokFncTrnMngInsertTsReqPrtsInf_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokFncTrnMngInsertTsReqPrtsInf_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokFncTrnMngSelectByMbhMbpfRcvPrts_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokFncTrnMngSelectByMbhMbpfRcvPrts_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokFncTrnMngSelectHswfMetLifecGoalInf_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokFncTrnMngSelectHswfMetLifecGoalInf_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokFncTrnMngSelectLifecExpdCnsmPts_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokFncTrnMngSelectLifecExpdCnsmPts_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokFncTrnMngSelectMbpfRcvSts_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokFncTrnMngSelectMbpfRcvSts_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokFncTrnMngSelectMetPbokTrnPrtsDown_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokFncTrnMngSelectMetPbokTrnPrtsDown_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokFncTrnMngSelectMetPbokTrnPrts_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokFncTrnMngSelectMetPbokTrnPrts_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokFncTrnMngSelectTsReqPrtsInf_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokFncTrnMngSelectTsReqPrtsInf_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokFncTrnMngSelectTsReqRnpeInf_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokFncTrnMngSelectTsReqRnpeInf_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokFncTrnMngUpdateGenMetByMbhMbpfEst_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokFncTrnMngUpdateGenMetByMbhMbpfEst_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokFncTrnMngUpdateGenMetByMbhMbpfXmp_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokFncTrnMngUpdateGenMetByMbhMbpfXmp_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokFncTrnMngUpdateGenMetMbpfEst_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokFncTrnMngUpdateGenMetMbpfEst_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokFncTrnMngUpdateHswfMetLifecGoalEst_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokFncTrnMngUpdateHswfMetLifecGoalEst_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokFncTrnMngUpdateMetPbokTrnPrts_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokFncTrnMngUpdateMetPbokTrnPrts_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokFncTrnMngUpdateTsReqPrtsInf_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokFncTrnMngUpdateTsReqPrtsInf_ODT;
import com.skbank.sml.fns.mpb.svc.MPBMetPbokFncTrnMng_SVC;

import bxm.common.annotaion.BxmCategory;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import fwk.skbank.online.context.WFApplicationContext;
import fwk.skbank.online.file.controller.dto.WFFileUtilDTO;
import fwk.skbank.online.file.util.WFFileUtils;

/**
 * 1.업무명 : 금융서비스 2.단위업무명 : NEWWON 중분류 모임통장 3.프로그램명 : 모임통장.금융거래.관리.컨트롤러 4.설명 :
 * 
 * @Class MPBMetPbokFncTrnMng_CTR.java
 * @author 90190263
 * @since 2024.03.25
 * @version 1.0
 */
@RestController
@RequestMapping("/sml/fns/mpb/metpbokfnctrnmng")
@BxmCategory(logicalName = "모임통장.금융거래.관리.컨트롤러", description = "모임통장의 금융거래를 관리하는 컨트롤러", author = "90190263")
@Api(tags = {""})
public class MPBMetPbokFncTrnMng_CTR {
	private Logger logger = LoggerFactory.getLogger(getClass());

	/**
	 * 모임통장.금융거래.관리.서비스
	 */
	private MPBMetPbokFncTrnMng_SVC mPBMetPbokFncTrnMng_SVC;

	/**
	 * 모임통장에서 원하는 월의 입금현황을 조회하는 컨트롤러
	 * 
	 * @param input
	 *            회비.입금현황.조회.컨트롤러.입력.IO
	 * @return 회비.입금현황.조회.컨트롤러.출력.IO
	 */
	@ApiOperation(value = "회비.입금현황.조회", notes = "")
	@PostMapping(value = "/selectMbpfRcvSts")
	@BxmCategory(logicalName = "회비.입금현황.조회", description = "모임통장에서 원하는 월의 입금현황을 조회하는 컨트롤러", author = "90190263")
	public MPBMetPbokFncTrnMngSelectMbpfRcvSts_ODT selectMbpfRcvSts(
			@ApiParam(value = "input", example = "") @RequestBody MPBMetPbokFncTrnMngSelectMbpfRcvSts_IDT input) {
		/**
		 * @BXMType GetBean
		 */
		mPBMetPbokFncTrnMng_SVC = WFApplicationContext.getBean(
				mPBMetPbokFncTrnMng_SVC, MPBMetPbokFncTrnMng_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokFncTrnMngSelectMbpfRcvSts_ODT output = new MPBMetPbokFncTrnMngSelectMbpfRcvSts_ODT();
		/*
		 * 로직 추가
		 */
		/*
		 * @BXMType ServiceCall 모임통장.금융거래.관리.서비스 회비.입금현황.조회
		 */
		// com.skbank.sml.fns.mpb.svc.MPBMetPbokFncTrnMng_SVC
		output = mPBMetPbokFncTrnMng_SVC.selectMbpfRcvSts(input);

		return output;
	}

	/**
	 * 모임통장에서 회비 미입금 현황을 조회하는 컨트롤러
	 * 
	 * @param input
	 *            회비.미입금현황.조회.컨트롤러.입력.IO
	 * @return 회비.미입금현황.목록.조회.컨트롤러.출력.IO
	 */
	// @ApiOperation(
	// value = "회비.미입금현황.조회"
	// , notes = ""
	// )
	// @PostMapping(value="/selectMbpfNrcvSts")
	// @BxmCategory(logicalName="회비.미입금현황.조회", description="모임통장에서 회비 미입금 현황을
	// 조회하는 컨트롤러", author="90190263")
	// public MPBMetPbokFncTrnMngSelectMbpfRcvSts_ODT selectMbpfNrcvSts(
	// @ApiParam(value="input", example="") @RequestBody
	// MPBMetPbokFncTrnMngSelectMbpfRcvSts_IDT input
	// )
	// {
	// /**
	// * @BXMType GetBean
	// */
	// mPBMetPbokFncTrnMng_SVC=
	// WFApplicationContext.getBean(mPBMetPbokFncTrnMng_SVC,
	// MPBMetPbokFncTrnMng_SVC.class);
	// /**
	// * @BXMType VariableDeclaration
	// */
	// MPBMetPbokFncTrnMngSelectMbpfRcvSts_ODT output= new
	// MPBMetPbokFncTrnMngSelectMbpfRcvSts_ODT();
	//
	// /*
	// * @BXMType ServiceCall
	// * 모임통장.금융거래.관리.서비스 회비.미입금현황.조회
	// */
	// //com.skbank.sml.fns.mpb.svc.MPBMetPbokFncTrnMng_SVC
	// output = mPBMetPbokFncTrnMng_SVC.selectMbpfNrcvSts(input);
	//
	// return output;
	// }

	/**
	 * 모임통장에서 원하는 월의 입금현황을 조회하는 컨트롤러
	 * 
	 * @param input
	 *            회원.회비.입금내역.조회.컨트롤러.입력.IO
	 * @return 회원.회비.입금내역.조회.컨트롤러.출력.IO
	 */
	@ApiOperation(value = "회원별.회비.입금내역.조회", notes = "")
	@PostMapping(value = "/selectByMbhMbpfRcvPrts")
	@BxmCategory(logicalName = "회원별.회비.입금내역.조회", description = "모임통장에서 원하는 월의 입금현황을 조회하는 컨트롤러", author = "90190263")
	public MPBMetPbokFncTrnMngSelectByMbhMbpfRcvPrts_ODT selectByMbhMbpfRcvPrts(
			@ApiParam(value = "input", example = "") @RequestBody MPBMetPbokFncTrnMngSelectByMbhMbpfRcvPrts_IDT input) {
		/**
		 * @BXMType GetBean
		 */
		mPBMetPbokFncTrnMng_SVC = WFApplicationContext.getBean(
				mPBMetPbokFncTrnMng_SVC, MPBMetPbokFncTrnMng_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokFncTrnMngSelectByMbhMbpfRcvPrts_ODT output = new MPBMetPbokFncTrnMngSelectByMbhMbpfRcvPrts_ODT();
		/*
		 * 로직 추가
		 */
		/*
		 * @BXMType ServiceCall 모임통장.금융거래.관리.서비스 회원.회비.입금내역.조회
		 */
		// com.skbank.sml.fns.mpb.svc.MPBMetPbokFncTrnMng_SVC
		output = mPBMetPbokFncTrnMng_SVC.selectByMbhMbpfRcvPrts(input);

		return output;
	}

	/**
	 * 모임통장의 거래내역 을 조회하는 컨트롤러
	 * 
	 * @param input
	 *            모임통장.거래내역.컨트롤러.입력.IO
	 * @return 모임통장.거래내역.컨트롤러.출력.IO
	 */
	@ApiOperation(value = "모임통장.거래.내역.조회", notes = "")
	@PostMapping(value = "/selectMetPbokTrnPrts")
	@BxmCategory(logicalName = "모임통장.거래.내역.조회", description = "모임통장 거래내역을 조회하는 컨트롤러", author = "90190263")
	public MPBMetPbokFncTrnMngSelectMetPbokTrnPrts_ODT selectMetPbokTrnPrts(
			@ApiParam(value = "input", example = "") @RequestBody MPBMetPbokFncTrnMngSelectMetPbokTrnPrts_IDT input) {
		/**
		 * @BXMType GetBean
		 */
		mPBMetPbokFncTrnMng_SVC = WFApplicationContext.getBean(mPBMetPbokFncTrnMng_SVC, MPBMetPbokFncTrnMng_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokFncTrnMngSelectMetPbokTrnPrts_ODT output = new MPBMetPbokFncTrnMngSelectMetPbokTrnPrts_ODT();
		/*
		 * @BXMType ServiceCall 모임통장.금융거래.관리.서비스 모임통장.거래.내역.조회
		 */
		// com.skbank.sml.fns.mpb.svc.MPBMetPbokFncTrnMng_SVC
		output = mPBMetPbokFncTrnMng_SVC.selectMetPbokTrnPrts(input);

		return output;
	}
	
	/**
	 * 모임통장의 거래내역 을 수정하는 컨트롤러
	 * 
	 * @param input
	 *            모임통장.거래내역.컨트롤러.입력.IO
	 * @return 모임통장.거래내역.컨트롤러.출력.IO
	 */
	@ApiOperation(value = "모임통장.거래.내역.수정", notes = "")
	@PostMapping(value = "/updateMetPbokTrnPrts")
	@BxmCategory(logicalName = "모임통장.거래.내역.수정", description = "모임통장 거래내역을 수정하는 컨트롤러", author = "90190263")
	public MPBMetPbokFncTrnMngUpdateMetPbokTrnPrts_ODT updateMetPbokTrnPrts(
			@ApiParam(value = "input", example = "") @RequestBody MPBMetPbokFncTrnMngUpdateMetPbokTrnPrts_IDT input) {
		/**
		 * @BXMType GetBean
		 */
		mPBMetPbokFncTrnMng_SVC = WFApplicationContext.getBean(
				mPBMetPbokFncTrnMng_SVC, MPBMetPbokFncTrnMng_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokFncTrnMngUpdateMetPbokTrnPrts_ODT output = new MPBMetPbokFncTrnMngUpdateMetPbokTrnPrts_ODT();
		/*
		 * @BXMType ServiceCall 모임통장.금융거래.관리.서비스 모임통장.거래.내역.조회
		 */
		// com.skbank.sml.fns.mpb.svc.MPBMetPbokFncTrnMng_SVC
		output = mPBMetPbokFncTrnMng_SVC.updateMetPbokTrnPrts(input);

		return output;
	}
	

	/**
	 * 일반 모임통장의 회비를 수정하는 서비스
	 * 
	 * @param input
	 *            일반.모임.회비.설정.컨트롤러.입력.IO
	 * @return 일반.모임.회비.설정.컨트롤러.출력.IO
	 */
	@ApiOperation(value = "일반.모임.회비.설정.수정", notes = "")
	@PostMapping(value = "/updateGenMetMbpfEst")
	@BxmCategory(logicalName = "일반.모임.회비.설정.수정", description = "일반 모임통장의 회비를 수정하는 서비스", author = "90190263")
	public MPBMetPbokFncTrnMngUpdateGenMetMbpfEst_ODT updateGenMetMbpfEst(
			@ApiParam(value = "input", example = "") @RequestBody MPBMetPbokFncTrnMngUpdateGenMetMbpfEst_IDT input) {
		/**
		 * @BXMType GetBean
		 */
		mPBMetPbokFncTrnMng_SVC = WFApplicationContext.getBean(
				mPBMetPbokFncTrnMng_SVC, MPBMetPbokFncTrnMng_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokFncTrnMngUpdateGenMetMbpfEst_ODT output = new MPBMetPbokFncTrnMngUpdateGenMetMbpfEst_ODT();
		/*
		 * 로직 추가
		 */
		/*
		 * @BXMType ServiceCall 모임통장.금융거래.관리.서비스 일반.모임.회비.설정.수정
		 */
		// com.skbank.sml.fns.mpb.svc.MPBMetPbokFncTrnMng_SVC
		output = mPBMetPbokFncTrnMng_SVC.updateGenMetMbpfEst(input);

		return output;
	}

	/**
	 * 일반 모임통장의 회원별로 회비를 설정 수정 관리 하는 컨트롤러
	 * 
	 * @param input
	 *            회원.회비금액.수정.컨트롤러.입력.IO
	 * @return 회원.회비금액.수정.컨트롤러.출력.IO
	 */
	@ApiOperation(value = "일반.모임.회원별.회비.설정.수정", notes = "")
	@PostMapping(value = "/updateGenMetByMbhMbpfEst")
	@BxmCategory(logicalName = "일반.모임.회원별.회비.설정.수정", description = "일반 모임통장의 회원별로 회비를 설정 수정 관리 하는 컨트롤러 ", author = "90190263")
	public MPBMetPbokFncTrnMngUpdateGenMetByMbhMbpfEst_ODT updateGenMetByMbhMbpfEst(
			@ApiParam(value = "input", example = "") @RequestBody MPBMetPbokFncTrnMngUpdateGenMetByMbhMbpfEst_IDT input) {
		/**
		 * @BXMType GetBean
		 */
		mPBMetPbokFncTrnMng_SVC = WFApplicationContext.getBean(
				mPBMetPbokFncTrnMng_SVC, MPBMetPbokFncTrnMng_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokFncTrnMngUpdateGenMetByMbhMbpfEst_ODT output = new MPBMetPbokFncTrnMngUpdateGenMetByMbhMbpfEst_ODT();

		/*
		 * @BXMType ServiceCall 모임통장.금융거래.관리.서비스 일반.모임.회원.회비.설정.수정
		 */
		// com.skbank.sml.fns.mpb.svc.MPBMetPbokFncTrnMng_SVC
		output = mPBMetPbokFncTrnMng_SVC.updateGenMetByMbhMbpfEst(input);

		return output;
	}

	/**
	 * 일반 모임통장의 회원별로 회비를 면제 관리 하는 컨트롤러
	 * 
	 * @param input
	 *            회원.회비금액.수정.컨트롤러.입력.IO
	 * @return 회원.회비금액.수정.컨트롤러.출력.IO
	 */
	@ApiOperation(value = "일반.모임.회원별.회비.면제.수정", notes = "")
	@PostMapping(value = "/updateGenMetByMbhMbpfXmp")
	@BxmCategory(logicalName = "일반.모임.회원별.회비.면제.수정", description = "일반 모임통장의 회원별로 회비를 면제 관리 하는 컨트롤러 ", author = "90190263")
	public MPBMetPbokFncTrnMngUpdateGenMetByMbhMbpfXmp_ODT updateGenMetByMbhMbpfXmp(
			@ApiParam(value = "input", example = "") @RequestBody MPBMetPbokFncTrnMngUpdateGenMetByMbhMbpfXmp_IDT input) {
		/**
		 * @BXMType GetBean
		 */
		mPBMetPbokFncTrnMng_SVC = WFApplicationContext.getBean(
				mPBMetPbokFncTrnMng_SVC, MPBMetPbokFncTrnMng_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokFncTrnMngUpdateGenMetByMbhMbpfXmp_ODT output = new MPBMetPbokFncTrnMngUpdateGenMetByMbhMbpfXmp_ODT();
		/*
		 * 로직 추가
		 */
		/*
		 * @BXMType ServiceCall 모임통장.금융거래.관리.서비스 일반.모임.회원.회비.설정.수정
		 */
		// com.skbank.sml.fns.mpb.svc.MPBMetPbokFncTrnMng_SVC
		output = mPBMetPbokFncTrnMng_SVC.updateGenMetByMbhMbpfXmp(input);

		return output;
	}

	/**
	 * 모임통장에서 커플통장에 해당하는 모임의 생활비 목표를 조회하는 컨트롤러
	 * 
	 * @param input
	 *            생활비.목표.정보.조회.컨트롤러.입력.IO
	 * @return 생활비.목표.정보.조회.컨트롤러.출력.IO
	 */
	@ApiOperation(value = "부부.모임.생활비.목표.정보.조회", notes = "")
	@PostMapping(value = "/selectHswfMetLifecGoalInf")
	@BxmCategory(logicalName = "부부.모임.생활비.목표.정보.조회", description = "모임통장에서 커플통장에 해당하는 모임의 생활비 목표를 조회하는 컨트롤러", author = "90190263")
	public MPBMetPbokFncTrnMngSelectHswfMetLifecGoalInf_ODT selectHswfMetLifecGoalInf(
			@ApiParam(value = "input", example = "") @RequestBody MPBMetPbokFncTrnMngSelectHswfMetLifecGoalInf_IDT input) {
		/**
		 * @BXMType GetBean
		 */
		mPBMetPbokFncTrnMng_SVC = WFApplicationContext.getBean(
				mPBMetPbokFncTrnMng_SVC, MPBMetPbokFncTrnMng_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokFncTrnMngSelectHswfMetLifecGoalInf_ODT output = new MPBMetPbokFncTrnMngSelectHswfMetLifecGoalInf_ODT();

		/*
		 * @BXMType ServiceCall 모임통장.금융거래.관리.서비스 부부.모임.생활비.목표.정보.조회
		 */
		// com.skbank.sml.fns.mpb.svc.MPBMetPbokFncTrnMng_SVC
		output = mPBMetPbokFncTrnMng_SVC.selectHswfMetLifecGoalInf(input);

		return output;
	}

	/**
	 * 모임통장에서 커플통장에 해당하는 모임의 생활비 목표를 해지하는 컨트롤러
	 * 
	 * @param input
	 *            생활비.목표.설정.컨트롤러.입력.IO
	 * @return 생활비.목표.설정.컨트롤러.출력.IO
	 */
	@ApiOperation(value = "부부.모임.생활비.목표.설정.수정", notes = "")
	@PostMapping(value = "/updateHswfMetLifecGoalEst")
	@BxmCategory(logicalName = "부부.모임.생활비.목표.설정.수정", description = "모임통장에서 커플통장에 해당하는 모임의 생활비 목표를 해지하는 컨트롤러", author = "90190263")
	public MPBMetPbokFncTrnMngUpdateHswfMetLifecGoalEst_ODT updateHswfMetLifecGoalEst(
			@ApiParam(value = "input", example = "") @RequestBody MPBMetPbokFncTrnMngUpdateHswfMetLifecGoalEst_IDT input) {
		/**
		 * @BXMType GetBean
		 */
		mPBMetPbokFncTrnMng_SVC = WFApplicationContext.getBean(
				mPBMetPbokFncTrnMng_SVC, MPBMetPbokFncTrnMng_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokFncTrnMngUpdateHswfMetLifecGoalEst_ODT output = new MPBMetPbokFncTrnMngUpdateHswfMetLifecGoalEst_ODT();
		/*
		 * 로직 추가
		 */
		/*
		 * @BXMType ServiceCall 모임통장.금융거래.관리.서비스 부부.모임.생활비.목표.해지.수정
		 */
		// com.skbank.sml.fns.mpb.svc.MPBMetPbokFncTrnMng_SVC
		output = mPBMetPbokFncTrnMng_SVC.updateHswfMetLifecGoalEst(input);

		return output;
	}

	/**
	 * 이체요청을 하기전 올바른 계좌인지 수취인에 정보를 조회하는 컨트롤러
	 * 
	 * @param input
	 *            이체.요청.수취인.정보.조회.컨트롤러.입력.IO
	 * @return 이체.요청.수취인.정보.조회.컨트롤러.출력.IO
	 */
	@ApiOperation(value = "이체.요청.수취인.정보.조회", notes = "")
	@PostMapping(value = "/selectTsReqRnpeInf")
	@BxmCategory(logicalName = "이체.요청.수취인.정보.조회", description = "이체요청을 하기전 올바른 계좌인지 수취인에 정보를 조회하는 컨트롤러", author = "90190263")
	public MPBMetPbokFncTrnMngSelectTsReqRnpeInf_ODT selectTsReqRnpeInf(
			@ApiParam(value = "input", example = "") @RequestBody MPBMetPbokFncTrnMngSelectTsReqRnpeInf_IDT input) {
		/**
		 * @BXMType GetBean
		 */
		mPBMetPbokFncTrnMng_SVC = WFApplicationContext.getBean(
				mPBMetPbokFncTrnMng_SVC, MPBMetPbokFncTrnMng_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokFncTrnMngSelectTsReqRnpeInf_ODT output = new MPBMetPbokFncTrnMngSelectTsReqRnpeInf_ODT();

		/*
		 * @BXMType ServiceCall 모임통장.금융거래.관리.서비스 이체요청.내역.정보.조회
		 */
		// com.skbank.sml.fns.mpb.svc.MPBMetPbokFncTrnMng_SVC
		output = mPBMetPbokFncTrnMng_SVC.selectTsReqRnpeInf(input);

		return output;
	}
	/**
	 * 모임통장의 이체요청 내역 정보를 조회하는 컨트롤러
	 * 
	 * @param input
	 *            이체요청.정보.조회.컨트롤러.입력.IO
	 * @return 이체요청.정보.조회.컨트롤러.출력.IO
	 */
	@ApiOperation(value = "이체요청.내역.정보.조회", notes = "")
	@PostMapping(value = "/selectTsReqPrtsInf")
	@BxmCategory(logicalName = "이체요청.내역.정보.조회", description = "모임통장의 이체요청 내역 정보를 조회하는 컨트롤러", author = "90190263")
	public MPBMetPbokFncTrnMngSelectTsReqPrtsInf_ODT selectTsReqPrtsInf(
			@ApiParam(value = "input", example = "") @RequestBody MPBMetPbokFncTrnMngSelectTsReqPrtsInf_IDT input) {
		/**
		 * @BXMType GetBean
		 */
		mPBMetPbokFncTrnMng_SVC = WFApplicationContext.getBean(
				mPBMetPbokFncTrnMng_SVC, MPBMetPbokFncTrnMng_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokFncTrnMngSelectTsReqPrtsInf_ODT output = new MPBMetPbokFncTrnMngSelectTsReqPrtsInf_ODT();

		/*
		 * @BXMType ServiceCall 모임통장.금융거래.관리.서비스 이체요청.내역.정보.조회
		 */
		// com.skbank.sml.fns.mpb.svc.MPBMetPbokFncTrnMng_SVC
		output = mPBMetPbokFncTrnMng_SVC.selectTsReqPrtsInf(input);

		return output;
	}

	/**
	 * 모임통장의 모임원이 모임장에게 이체요청을 등록하는 컨트롤러
	 * 
	 * @param input
	 *            이체요청.정보.등록.컨트롤러.입력.IO
	 * @return 이체요청.정보.등록.컨트롤러.출력.IO
	 */
	@ApiOperation(value = "이체요청.내역.정보.등록", notes = "")
	@PostMapping(value = "/insertTsReqPrtsInf")
	@BxmCategory(logicalName = "이체요청.내역.정보.등록", description = "모임통장의 모임원이 모임장에게 이체요청을 등록하는 컨트롤러", author = "90190263")
	public MPBMetPbokFncTrnMngInsertTsReqPrtsInf_ODT insertTsReqPrtsInf(
			@ApiParam(value = "input", example = "") @RequestBody MPBMetPbokFncTrnMngInsertTsReqPrtsInf_IDT input) {
		/**
		 * @BXMType GetBean
		 */
		mPBMetPbokFncTrnMng_SVC = WFApplicationContext.getBean(
				mPBMetPbokFncTrnMng_SVC, MPBMetPbokFncTrnMng_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokFncTrnMngInsertTsReqPrtsInf_ODT output = new MPBMetPbokFncTrnMngInsertTsReqPrtsInf_ODT();

		/*
		 * @BXMType ServiceCall 모임통장.금융거래.관리.서비스 이체요청.내역.정보.등록
		 */
		// com.skbank.sml.fns.mpb.svc.MPBMetPbokFncTrnMng_SVC
		output = mPBMetPbokFncTrnMng_SVC.insertTsReqPrtsInf(input);

		return output;
	}
	
	/**
	 * 모임통장의 모임원이 모임장에게 이체요청을 수정하는 컨트롤러
	 * 
	 * @param input
	 *            이체요청.정보.수정.컨트롤러.입력.IO
	 * @return 이체요청.정보.수정.컨트롤러.출력.IO
	 */
	@ApiOperation(value = "이체요청.내역.정보.수정", notes = "")
	@PostMapping(value = "/updateTsReqPrtsInf")
	@BxmCategory(logicalName = "이체요청.내역.정보.수정", description = "모임통장의 모임원이 모임장에게 이체요청한 결과를 수정하는 컨트롤러", author = "90190263")
	public MPBMetPbokFncTrnMngUpdateTsReqPrtsInf_ODT updateTsReqPrtsInf(
			@ApiParam(value = "input", example = "") @RequestBody MPBMetPbokFncTrnMngUpdateTsReqPrtsInf_IDT input) {
		/**
		 * @BXMType GetBean
		 */
		mPBMetPbokFncTrnMng_SVC = WFApplicationContext.getBean(
				mPBMetPbokFncTrnMng_SVC, MPBMetPbokFncTrnMng_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokFncTrnMngUpdateTsReqPrtsInf_ODT output = new MPBMetPbokFncTrnMngUpdateTsReqPrtsInf_ODT();

		/*
		 * @BXMType ServiceCall 모임통장.금융거래.관리.서비스 이체요청.내역.정보.수정
		 */
		// com.skbank.sml.fns.mpb.svc.MPBMetPbokFncTrnMng_SVC
		output = mPBMetPbokFncTrnMng_SVC.updateTsReqPrtsInf(input);

		return output;
	}

	/**
	 * 모임통장의 모임장이 이체요청, 이체내역을 삭제하는 컨트롤러
	 * 
	 * @param input
	 *            이체요청.정보.삭제.컨트롤러.입력.IO
	 * @return 이체요청.정보.삭제.컨트롤러.출력.IO
	 */
	@ApiOperation(value = "이체요청.내역.정보.삭제", notes = "")
	@PostMapping(value = "/deleteTsReqPrtsInf")
	@BxmCategory(logicalName = "이체요청.내역.정보.삭제", description = "모임통장의 모임장이 이체요청, 이체내역을 삭제하는 컨트롤러", author = "90190263")
	public MPBMetPbokFncTrnMngDeleteTsReqprtsinf_ODT deleteTsReqprtsinf(
			@ApiParam(value = "input", example = "") @RequestBody MPBMetPbokFncTrnMngDeleteTsReqprtsinf_IDT input) {
		/**
		 * @BXMType GetBean
		 */
		mPBMetPbokFncTrnMng_SVC = WFApplicationContext.getBean(
				mPBMetPbokFncTrnMng_SVC, MPBMetPbokFncTrnMng_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokFncTrnMngDeleteTsReqprtsinf_ODT output = new MPBMetPbokFncTrnMngDeleteTsReqprtsinf_ODT();
		/*
		 * @BXMType ServiceCall 모임통장.금융거래.관리.서비스 이체요청.내역.정보.삭제
		 */
		// com.skbank.sml.fns.mpb.svc.MPBMetPbokFncTrnMng_SVC
		output = mPBMetPbokFncTrnMng_SVC.deleteTsReqPrtsInf(input);

		return output;
	}

	/**
	 * 모임통장의 이체를 실행/승인하는 컨트롤러
	 * 
	 * @param input
	 *            이체.승인.등록.컨트롤러.입력.IO
	 * @return 이체.승인.등록.컨트롤러.출력.IO
	 */
	@ApiOperation(value = "이체.승인.등록", notes = "")
	@PostMapping(value = "/insertTsApv")
	@BxmCategory(logicalName = "이체.승인.등록", description = "모임통장의 이체를 실행/승인하는 컨트롤러", author = "90190263")
	public MPBMetPbokFncTrnMngInsertTsApv_ODT insertTsApv(
			@ApiParam(value = "input", example = "") @RequestBody MPBMetPbokFncTrnMngInsertTsApv_IDT input) {
		/**
		 * @BXMType GetBean
		 */
		mPBMetPbokFncTrnMng_SVC = WFApplicationContext.getBean(
				mPBMetPbokFncTrnMng_SVC, MPBMetPbokFncTrnMng_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokFncTrnMngInsertTsApv_ODT output = new MPBMetPbokFncTrnMngInsertTsApv_ODT();

		/*
		 * @BXMType ServiceCall 모임통장.금융거래.관리.서비스 이체요청.내역.정보.등록
		 */
		// com.skbank.sml.fns.mpb.svc.MPBMetPbokFncTrnMng_SVC
		output = mPBMetPbokFncTrnMng_SVC.insertTsApv(input);

		return output;
	}

	/**
	 * 모임통장의 이체를 실행/승인하는 컨트롤러
	 * 
	 * @param input
	 *            이체.승인.등록.컨트롤러.입력.IO
	 * @return 이체.승인.등록.컨트롤러.출력.IO
	 */
	@ApiOperation(value = "공동명의인.이체.승인.등록", notes = "")
	@PostMapping(value = "/insertAsscNompefTsApv")
	@BxmCategory(logicalName = "공동명의인.이체.승인.등록", description = "모임통장의 공동명의인이 이체를 실행/승인하는 컨트롤러", author = "90190263")
	public MPBMetPbokFncTrnMngInsertAsscNompefTsApv_ODT insertAsscNompefTsApv(
			@ApiParam(value = "input", example = "") @RequestBody MPBMetPbokFncTrnMngInsertAsscNompefTsApv_IDT input) {
		/**
		 * @BXMType GetBean
		 */
		mPBMetPbokFncTrnMng_SVC = WFApplicationContext.getBean(mPBMetPbokFncTrnMng_SVC, MPBMetPbokFncTrnMng_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokFncTrnMngInsertAsscNompefTsApv_ODT output = new MPBMetPbokFncTrnMngInsertAsscNompefTsApv_ODT();
	
		/*
		 * @BXMType ServiceCall 모임통장.금융거래.관리.서비스 이체요청.내역.정보.등록
		 */
		// com.skbank.sml.fns.mpb.svc.MPBMetPbokFncTrnMng_SVC
		output = mPBMetPbokFncTrnMng_SVC.insertAsscNompefTsApv(input);
	
		return output;
	}

	/**
	 * 생활비 지출 소비 현황을 조회하는 컨트롤러
	 * 
	 * @param input
	 *            생활비.지출.소비.현황.컨트롤러.입력.IO
	 * @return 생활비.지출.소비.현황.컨트롤러.출력.IO
	 */
	@ApiOperation(value = "생활비.지출.소비.현황.조회", notes = "")
	// @PostMapping(value="/selectLifecExpdCnsmPts")
	@PostMapping(value = "/selectLifecExpdCnsmPts")
	@BxmCategory(logicalName = "생활비.지출.소비.현황.조회", description = "생활비 지출 소비 현황을 조회하는 컨트롤러", author = "90190263")
	public MPBMetPbokFncTrnMngSelectLifecExpdCnsmPts_ODT selectLifecExpdCnsmPts(
			@ApiParam(value = "input", example = "") @RequestBody MPBMetPbokFncTrnMngSelectLifecExpdCnsmPts_IDT input) {
		/**
		 * @BXMType GetBean
		 */
		mPBMetPbokFncTrnMng_SVC = WFApplicationContext.getBean(
				mPBMetPbokFncTrnMng_SVC, MPBMetPbokFncTrnMng_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokFncTrnMngSelectLifecExpdCnsmPts_ODT output = new MPBMetPbokFncTrnMngSelectLifecExpdCnsmPts_ODT();

		/*
		 * @BXMType ServiceCall 모임통장.금융거래.관리.서비스 생활비.지출.소비.현황.조회
		 */
		// com.skbank.sml.fns.mpb.svc.MPBMetPbokFncTrnMng_SVC
		output = mPBMetPbokFncTrnMng_SVC.selectLifecExpdCnsmPts(input);

		return output;
	}

	/**
	 * 생활비 지출 소비진단 현황 을 조회하는 컨트롤러
	 * 
	 * @param input
	 *            생활비.소비.진단.현황.컨트롤러.입력.IO
	 * @return 생활비.소비.진단.현황.컨트롤러.출력.IO
	 */
	// @ApiOperation(
	// value = "생활비.지출.소비.진단.현황.조회"
	// , notes = ""
	// )
	// @PostMapping(value="/selectLifecexpdcnsmdgnspts")
	// @BxmCategory(logicalName="생활비.지출.소비.진단.현황.조회", description="생활비 지출 소비진단
	// 현황 을 조회하는 컨트롤러", author="90190263")
	// public MPBLifecCnsmDgnsPts_ODT selectLifecexpdcnsmdgnspts(
	// @ApiParam(value="input", example="") @RequestBody MPBLifecCnsmDgnsPts_IDT
	// input
	// )
	// {
	// /**
	// * @BXMType GetBean
	// */
	// mPBMetPbokFncTrnMng_SVC=
	// WFApplicationContext.getBean(mPBMetPbokFncTrnMng_SVC,
	// MPBMetPbokFncTrnMng_SVC.class);
	// /**
	// * @BXMType VariableDeclaration
	// */
	// MPBLifecCnsmDgnsPts_ODT output= new MPBLifecCnsmDgnsPts_ODT();
	// /*
	// * TODO
	// * 로직 추가
	// */
	// /*
	// * @BXMType ServiceCall
	// * 모임통장.금융거래.관리.서비스 생활비.지출.소비.진단.현황.조회
	// */
	// // com.skbank.sml.fns.mpb.svc.MPBMetPbokFncTrnMng_SVC
	// // mPBMetPbokFncTrnMng_SVC.selectLifecexpdcnsmdgnspts(..);
	//
	// return output;
	// }

	/**
	 * 모임통장의 거래내역을 조회하여 다운받는 컨트롤러
	 * 
	 * @param input
	 *            모임통장.거래내역.다운로드.컨트롤러.입력.IO
	 * @return 모임통장.거래내역.다운로드.컨트롤러.출력.IO
	 */
	@ApiOperation(value = "모임통장.거래.내역.다운", notes = "")
	@PostMapping(value = "/selectMetPbokTrnPrtsDown")
	@BxmCategory(logicalName = "모임통장.거래.내역.다운로드", description = "모임통장 거래내역을 조회하여 다운로드 받는 컨트롤러", author = "90191355")
	public MPBMetPbokFncTrnMngSelectMetPbokTrnPrtsDown_ODT selectMetPbokTrnPrtsDown(
			@ApiParam(value = "input", example = "") @RequestBody MPBMetPbokFncTrnMngSelectMetPbokTrnPrtsDown_IDT input) {
		/**
		 * @BXMType GetBean
		 */
		mPBMetPbokFncTrnMng_SVC = WFApplicationContext.getBean(
				mPBMetPbokFncTrnMng_SVC, MPBMetPbokFncTrnMng_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokFncTrnMngSelectMetPbokTrnPrtsDown_ODT output = new MPBMetPbokFncTrnMngSelectMetPbokTrnPrtsDown_ODT();
		String errorMsg = "";
		try {
			output = mPBMetPbokFncTrnMng_SVC.selectMetPbokTrnPrtsDown(input);
			
			if ("error".equals(output.getFileNm())) {
				//에러메시지로 사용..
				errorMsg = output.getFileDir();
			}
			
			if (logger.isDebugEnabled()) {
				logger.debug(":::::::::: output :::::::::::::: {} ",
						output.getFileData());
				logger.debug(":::::::::: output :::::::::::::: {} ",
						output.getFilePath());
				logger.debug(":::::::::: output :::::::::::::: {} ",
						output.getFileNm());
			}
			WFFileUtilDTO fDto = new WFFileUtilDTO();
			fDto.setFilePath(output.getFilePath());
			fDto.setFileName(output.getFileNm());

			WFFileUtilDTO oDto = WFFileUtils.readFile(fDto);
			output.setFileNm(fDto.getFileName());
			output.setFileData(oDto.getFileData());
			output.setFileSize(oDto.getFileSize());

			// 파일데이터 처리후 tmp폴더에 파일을 삭제한다.
			// File f = new File(
			// WFFileUtils.getRootFilePath().concat(fDto.getFilePath())
			// .concat(File.separator).concat(fDto.getFileName()));
			// f.delete();
		} catch (Exception e) {
			output.setFileNm("error");
			output.setFileDir(errorMsg);
		}

		return output;
	}
}
