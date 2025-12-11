package com.skbank.sml.fns.pbp.ctr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceBscMngDeletePbokSplitSrvcScss_IDT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceBscMngDeletePbokSplitSrvcScss_ODT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceBscMngInsertPboksprnmbhJnng_IDT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceBscMngInsertPboksprnmbhJnng_ODT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceBscMngSelectActlist_IDT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceBscMngSelectActlist_ODT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceBscMngSelectMainspceinf_IDT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceBscMngSelectMainspceinf_ODT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceBscMngSelectSpcesrvcJnngactlist_IDT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceBscMngSelectSpcesrvcJnngactlist_ODT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceBscMngSelectSpcesrvcjnngavlyn_IDT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceBscMngSelectSpcesrvcjnngavlyn_ODT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceBscMngSelectUsgspceinflist_IDT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceBscMngSelectUsgspceinflist_ODT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceBscMngSetPbokSplitCmnScrtCrtf_IDT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceBscMngUpdateNtfcAgrYn_IDT;
import com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceBscMngUpdateNtfcAgrYn_ODT;
import com.skbank.sml.fns.pbp.svc.PBPPbokSpceBscMng_SVC;

import bxm.common.annotaion.BxmCategory;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import fwk.skbank.online.context.WFApplicationContext;

/**
 * 1.업무명 : 금융서비스 
 * 2.단위업무명 : NEWWON 중분류 통장쪼개기 
 * 3.프로그램명 : 통장.공간.일반.관리.컨트롤러 
 * 4.설명 : 통장쪼개기 서비스와 관련된 기능을 지원하는 컨트롤러
 * 
 * 
 * @Class PBPPbokSpceBscMng_CTR.java
 * @author 90191355
 * @since 2024.04.15
 * @version 1.0
 */
@RestController
@RequestMapping("/sml/fns/pbp/pbokspcebscmng")
@BxmCategory(logicalName = "통장.공간.일반.관리.컨트롤러", description = "통장쪼개기 서비스와 관련된 기능을 지원하는 컨트롤러\r\n", author = "90191355")
@Api(tags = {""})
public class PBPPbokSpceBscMng_CTR {
	private Logger logger = LoggerFactory.getLogger(getClass());

	/**
	 * 통장.공간.일반.관리.서비스
	 */
	private PBPPbokSpceBscMng_SVC pBPPbokSpceBscMng_SVC;

	/**
	 *통장쪼개기.공통.보안인증.셋팅
	 * 
	 * @param input 
	 * @return 
	 */
	@ApiOperation(
		value = "통장쪼개기.공통.보안인증.셋팅"
		, notes = ""
	)
	@PostMapping(value="/setPbokSplitCmnScrtCrtf")
	@BxmCategory(logicalName="통장쪼개기.공통.보안인증.셋팅", description="통장쪼개기.공통.보안인증.셋팅 및 로그인 세션 정보를 조회한다", author="90191355")
	public void setPbokSplitCmnScrtCrtf(
		@ApiParam(value="input", example="") @RequestBody PBPPbokSpceBscMngSetPbokSplitCmnScrtCrtf_IDT input
		)
	{
		/**
		* @BXMType GetBean
		*/
		pBPPbokSpceBscMng_SVC= WFApplicationContext.getBean(pBPPbokSpceBscMng_SVC, PBPPbokSpceBscMng_SVC.class);

		/**
		 * @BXMType VariableDeclaration
		 */

		pBPPbokSpceBscMng_SVC.setPbokSplitCmnScrtCrtf(input);
		
		return;
	}
	
	/**
	 * 통장쪼개기 서비스에 가입 가능한 계좌 목록 조회 컨트롤러
	 * 
	 * @param input 계좌.정보.컨트롤러.입력.IO
	 * @return 계좌.정보.컨트롤러.출력.IO
	 */
	@ApiOperation(value = "계좌.목록.조회", notes = "")
	@PostMapping(value = "/selectActlist")
	@BxmCategory(logicalName = "계좌.목록.조회", description = "통장쪼개기 서비스에 가입 가능한 계좌 목록 조회 컨트롤러", author = "90191355")
	public PBPPbokSpceBscMngSelectActlist_ODT selectActlist(@ApiParam(value = "input", example = "") @RequestBody PBPPbokSpceBscMngSelectActlist_IDT input) {
		/**
		 * @BXMType GetBean
		 */
		pBPPbokSpceBscMng_SVC = WFApplicationContext.getBean(pBPPbokSpceBscMng_SVC, PBPPbokSpceBscMng_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */

		PBPPbokSpceBscMngSelectActlist_ODT result = pBPPbokSpceBscMng_SVC.selectAllact(input);

		return result;
	}

	/**
	 * @param input 공간.서비스가입.계좌.정보.컨트롤러.입력.IO
	 * @return 공간.서비스가입.계좌.정보.컨트롤러.출력.IO
	 */
	@ApiOperation(value = "공간.서비스가입.계좌.목록.조회", notes = "")
	@PostMapping(value = "/selectSpcesrvcJnngactlist")
	@BxmCategory(logicalName = "공간.서비스가입.계좌.목록.조회", description = "통장쪼개기 서비스에 가입한 계좌 목록 조회", author = "90191355")
	public PBPPbokSpceBscMngSelectSpcesrvcJnngactlist_ODT selectSpcesrvcJnngactlist(@ApiParam(value = "input", example = "") @RequestBody PBPPbokSpceBscMngSelectSpcesrvcJnngactlist_IDT input) {
		/**
		 * @BXMType GetBean
		 */
		pBPPbokSpceBscMng_SVC = WFApplicationContext.getBean(pBPPbokSpceBscMng_SVC, PBPPbokSpceBscMng_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		PBPPbokSpceBscMngSelectSpcesrvcJnngactlist_ODT output = pBPPbokSpceBscMng_SVC.selectAllspcesrvcJnngact(input);
		
		return output;
	}

	/**
	 * 통장쪼개기 서비스의 가입가능 대상여부를 조회하는 컨트롤러
	 * 
	 * @param input 공간.서비스가입.가능.정보.컨트롤러.입력.IO
	 * @return 공간.서비스가입.가능.정보.컨트롤러.출력.IO
	 */
	@ApiOperation(value = "공간.서비스가입.가능.여부.조회", notes = "")
	@PostMapping(value = "/selectSpcesrvcjnngavlyn")
	@BxmCategory(logicalName = "공간.서비스가입.가능.여부.조회", description = "통장쪼개기 서비스의 가입가능 대상여부를 조회하는 컨트롤러", author = "90191355")
	public PBPPbokSpceBscMngSelectSpcesrvcjnngavlyn_ODT selectSpcesrvcjnngavlyn(@ApiParam(value = "input", example = "") @RequestBody PBPPbokSpceBscMngSelectSpcesrvcjnngavlyn_IDT input) {

		pBPPbokSpceBscMng_SVC = WFApplicationContext.getBean(pBPPbokSpceBscMng_SVC, PBPPbokSpceBscMng_SVC.class);

		PBPPbokSpceBscMngSelectSpcesrvcjnngavlyn_ODT output = pBPPbokSpceBscMng_SVC.selectSpcesrvcjnngavlyn(input);

		return output;
	}

	/**
	 * 통장쪼개기 서비스를 가입하기 위한 회원의 약관동의 처리 컨트롤러
	 * 
	 * @param input 통장.분리.회원가입.컨트롤러.입력.IO
	 * @return 통장.분리.회원가입.컨트롤러.출력.IO
	 */
	@ApiOperation(value = "통장.분리.회원가입.등록", notes = "")
	@PostMapping(value = "/insertPboksprnmbhJnng")
	@BxmCategory(logicalName = "통장.분리.회원가입.등록", description = "통장쪼개기 서비스를 가입하기 위한 회원의 약관동의 처리 컨트롤러", author = "90191355")
	public PBPPbokSpceBscMngInsertPboksprnmbhJnng_ODT insertPboksprnmbhJnng(@ApiParam(value = "input", example = "") @RequestBody PBPPbokSpceBscMngInsertPboksprnmbhJnng_IDT input) {
		/**
		 * @BXMType GetBean
		 */
		pBPPbokSpceBscMng_SVC = WFApplicationContext.getBean(pBPPbokSpceBscMng_SVC, PBPPbokSpceBscMng_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */	
		PBPPbokSpceBscMngInsertPboksprnmbhJnng_ODT output = pBPPbokSpceBscMng_SVC.insertPboksprnmbhJnng(input);
		
		return output;
	}

	/**
	 * 통장쪼개기 서비스를 해지 수정 하는 컨트롤러
	 * 
	 * @param input 통장.쪼개기.서비스.탈퇴.정보.컨트롤러.입력.IO
	 * @return 통장.쪼개기.서비스.탈퇴.정보.컨트롤러.출력.IO
	 */
	@ApiOperation(value = "통장.쪼개기.서비스.탈퇴", notes = "")
	@PostMapping(value = "/deletePbokSplitSrvcScss")
	@BxmCategory(logicalName = "통장.쪼개기.서비스.탈퇴", description = "통장쪼개기 서비스를 탈퇴하는 컨트롤러", author = "90191355")
	public PBPPbokSpceBscMngDeletePbokSplitSrvcScss_ODT deletePbokSplitSrvcScss(@ApiParam(value = "input", example = "") @RequestBody PBPPbokSpceBscMngDeletePbokSplitSrvcScss_IDT input) {
		/**
		 * @BXMType GetBean
		 */
		pBPPbokSpceBscMng_SVC = WFApplicationContext.getBean(pBPPbokSpceBscMng_SVC, PBPPbokSpceBscMng_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		PBPPbokSpceBscMngDeletePbokSplitSrvcScss_ODT output = pBPPbokSpceBscMng_SVC.deletePbokSplitSrvcScss(input);
		
		return output;
	}

	/**
	 * 통장쪼개기를 통해 생성된 공간의 목록을 조회하는 컨트롤러
	 * 
	 * @param input 사용.공간.정보.컨트롤러.입력.IO
	 * @return 사용.공간.정보.컨트롤러.출력.IO
	 */
	@ApiOperation(value = "사용.공간.정보.목록.조회", notes = "")
	@PostMapping(value = "/selectUsgspceinflist")
	@BxmCategory(logicalName = "사용.공간.정보.목록.조회", description = "통장쪼개기를 통해 생성된 공간의 목록을 조회하는 컨트롤러 ", author = "90191355")
	public PBPPbokSpceBscMngSelectUsgspceinflist_ODT selectUsgspceinflist(@ApiParam(value = "input", example = "") @RequestBody PBPPbokSpceBscMngSelectUsgspceinflist_IDT input) {
		/**
		 * @BXMType GetBean
		 */
		pBPPbokSpceBscMng_SVC = WFApplicationContext.getBean(pBPPbokSpceBscMng_SVC, PBPPbokSpceBscMng_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		PBPPbokSpceBscMngSelectUsgspceinflist_ODT output = pBPPbokSpceBscMng_SVC.selectUsgspceinflist(input);
		
		return output;
	}

	/**
	 * 메인공간의 정보를 조회하기 위한 컨트롤러
	 * 
	 * @param input 메인.공간.정보.조회.컨트롤러.입력.IO
	 * @return 메인.공간.정보.조회.컨트롤러.출력.IO
	 */
	@ApiOperation(value = "메인.공간.정보.조회", notes = "")
	@PostMapping(value = "/selectMainspceinf")
	@BxmCategory(logicalName = "메인.공간.정보.조회", description = "메인공간의 정보를 조회하기 위한 컨트롤러", author = "90191355")
	public PBPPbokSpceBscMngSelectMainspceinf_ODT selectMainspceinf(@ApiParam(value = "input", example = "") @RequestBody PBPPbokSpceBscMngSelectMainspceinf_IDT input) {
		/**
		 * @BXMType GetBean
		 */
		pBPPbokSpceBscMng_SVC = WFApplicationContext.getBean(pBPPbokSpceBscMng_SVC, PBPPbokSpceBscMng_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		PBPPbokSpceBscMngSelectMainspceinf_ODT output = pBPPbokSpceBscMng_SVC.selectMainspceinf(input);
		
		return output;
	}

	/**
	 * 통장쪼개기 서비스에 가입 가능한 계좌 목록 조회 컨트롤러
	 * 
	 * @param input 공간.서비스.알림.가능.여부.컨트롤러.입력.IO
	 * @return 공간.서비스.알림.가능.여부.컨트롤러.출력.IO
	 */
	@ApiOperation(value = "알림.동의.여부.수정", notes = "")
	@PostMapping(value = "/updateNtfcAgrYn")
	@BxmCategory(logicalName = "알림.동의.여부.수정", description = "통장쪼개기 서비스에 가입 가능한 계좌 목록 조회 컨트롤러", author = "90190263")
	public PBPPbokSpceBscMngUpdateNtfcAgrYn_ODT updateNtfcAgrYn(@ApiParam(value = "input", example = "") @RequestBody PBPPbokSpceBscMngUpdateNtfcAgrYn_IDT input) {
		/**
		 * @BXMType GetBean
		 */
		pBPPbokSpceBscMng_SVC = WFApplicationContext.getBean(pBPPbokSpceBscMng_SVC, PBPPbokSpceBscMng_SVC.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		
		PBPPbokSpceBscMngUpdateNtfcAgrYn_ODT output = pBPPbokSpceBscMng_SVC.updateSpceSrvcNtfcYn(input);

		return output;
	}	
}
