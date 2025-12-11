package com.skbank.sml.fns.mpb.svc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.ss.util.CellUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.skbank.sml.bsc.shr.com.SHRAllActInqTbk_COM;
import com.skbank.sml.bsc.shr.com.SHRRnpeFnmInq_COM;
import com.skbank.sml.bsc.shr.cst.cstt.SHRBSCInquiryConstant;
import com.skbank.sml.bsc.shr.dto.SHRRnpeNmInqInp_DTO;
import com.skbank.sml.bsc.shr.dto.SHRRnpeNmInqOup_DTO;
import com.skbank.sml.cmm.shr.com.SHRAIFDSManager_COM;
import com.skbank.sml.cmm.shr.com.SHRCMMEncDecSession_COM;
import com.skbank.sml.cmm.shr.com.SHRCMMInterfaceCfg_COM;
import com.skbank.sml.cmm.shr.com.SHRCMMLoginSession_COM;
import com.skbank.sml.cmm.shr.dto.CMM_CURRENT_CUST;
import com.skbank.sml.cmm.shr.dto.SHRAIFDSManager_DTO;
import com.skbank.sml.fns.mpb.com.MPBMetPbokBscMng_COM;
import com.skbank.sml.fns.mpb.com.MPBMetPbokFncTrnMng_COM;
import com.skbank.sml.fns.mpb.com.MPBMetPbokMbhMng_COM;
import com.skbank.sml.fns.mpb.ctr.dto.MPBLifecExpdCnsmListPts_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMbpfRcvstsListInq_ODT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokBscMbhInfGrid_ODT;
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
import com.skbank.sml.fns.mpb.ctr.dto.MPBTsReqInfDelGrid_IDT;
import com.skbank.sml.fns.mpb.ctr.dto.MPBTsReqInfListInq_ODT;
import com.skbank.sml.fns.mpb.dto.HswfMetLifecExpdPtsSub_DODT;
import com.skbank.sml.fns.mpb.dto.HswfMetLifecExpdPts_DIDT;
import com.skbank.sml.fns.mpb.dto.HswfMetLifecExpdPts_DODT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_LIFEC_MNG_LDG001InsertMetPbokLifecMngLdgPk_DIDT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_LIFEC_MNG_LDG001SelectMetPbokLifecMngLdgPkInfo_DIDT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_LIFEC_MNG_LDG001SelectMetPbokLifecMngLdgPkInfo_DODT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_LIFEC_MNG_LDG001UpdateMetPbokLifecMngLdgPk_DIDT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_MBPF_TS_REQ_INF001DeleteTsReqInf_DIDT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_MBPF_TS_REQ_INF001InsertTsReqInf_DIDT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_MBPF_TS_REQ_INF001SelectAllTsReqInf_DIDT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_MBPF_TS_REQ_INF001SelectAllTsReqInf_DODT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_MBPF_TS_REQ_INF001SelectMbhTsReqInf_DIDT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_MBPF_TS_REQ_INF001SelectMbhTsReqInf_DODT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_MBPF_TS_REQ_INF001SelectMbpfRtunInf_DIDT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_MBPF_TS_REQ_INF001SelectMbpfRtunInf_DODT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_MBPF_TS_REQ_INF001UpdateTsReqStcd_DIDT;
import com.skbank.sml.fns.mpb.dto.MPBByMbhMbpfXmpGrid_DTO;
import com.skbank.sml.fns.mpb.dto.MPBGenMetByMbhMbpfEstGrid_DTO;
import com.skbank.sml.fns.mpb.dto.MPBMbpfRcvstsList2Inq_DTO;
import com.skbank.sml.fns.mpb.dto.MPBMetPbokBscMnginsertMetPbokPushNtfcSndInput_DTO;
import com.skbank.sml.fns.mpb.dto.MPBMetPbokFncTrnMngInsertAsscNompefObkFdtsExeInput_DTO;
import com.skbank.sml.fns.mpb.dto.MPBMetPbokFncTrnMngInsertAsscNompefObkFdtsExeOutput_DTO;
import com.skbank.sml.fns.mpb.dto.MPBMetPbokFncTrnMngInsertAsscNompefTbkFdtsExeInput_DTO;
import com.skbank.sml.fns.mpb.dto.MPBMetPbokFncTrnMngInsertAsscNompefTbkFdtsExeOutput_DTO;
import com.skbank.sml.fns.mpb.dto.MPBMetPbokFncTrnMngSelectAsscNompefObkFdtsInput_DTO;
import com.skbank.sml.fns.mpb.dto.MPBMetPbokFncTrnMngSelectAsscNompefObkFdtsOutput_DTO;
import com.skbank.sml.fns.mpb.dto.MPBMetPbokFncTrnMngSelectAsscNompefTbkFdtsInput_DTO;
import com.skbank.sml.fns.mpb.dto.MPBMetPbokFncTrnMngSelectAsscNompefTbkFdtsOutput_DTO;
import com.skbank.sml.fns.mpb.dto.MPBMetPbokTrnPrts_DTO;
import com.skbank.sml.fns.mpb.dto.MPBUpdateMetPbokTrnPrtsGrid_DTO;
import com.skbank.sml.fns.mpb.dto.MbpfRcvstsInq_DIDT;
import com.skbank.sml.fns.mpb.dto.MbpfRcvstsInq_DODT;
import com.skbank.sml.fns.mpb.dto.MbpfRcvstsList2Inq_DODT;
import com.skbank.sml.fns.mpb.dto.MbpfRcvstsListInq_DODT;
import com.skbank.sml.fns.mpb.dto.MetPbokBscInfGrid;
import com.skbank.sml.fns.mpb.dto.MetPbokBscInfInq_DIDT;
import com.skbank.sml.fns.mpb.dto.MetPbokBscInfInq_DODT;
import com.skbank.sml.fns.mpb.dto.MetPbokBscMbhInfGrid_DIDT;
import com.skbank.sml.fns.mpb.dto.MetPbokBscMbhInfGrid_DODT;
import com.skbank.sml.fns.mpb.dto.MetPbokBscMbhInf_DIDT;
import com.skbank.sml.fns.mpb.dto.MetPbokBscMbhInf_DODT;
import com.skbank.sml.fns.mpb.dto.MetPbokImgInfInq_DODT;
import com.skbank.sml.fns.mpb.dto.MetPbokMbhInfInq_DIDT;
import com.skbank.sml.fns.mpb.dto.MetPbokMbhInfInq_DODT;
import com.skbank.sml.fns.mpb.dto.MetPbokMbhInfListInq_DODT;
import com.skbank.sml.fns.mpb.dto.MetPbokTrnPrtsGrid;
import com.skbank.sml.fns.mpb.dto.MetPbokTrnPrts_DIDT;
import com.skbank.sml.fns.mpb.dto.MetPbokTrnPrts_DODT;
import com.skbank.sml.fns.mpb.dto.ObkFdtsExe_DIDT;
import com.skbank.sml.fns.mpb.dto.ObkFdtsExe_DODT;
import com.skbank.sml.fns.mpb.dto.ObkMbpfReturn_DIDT;
import com.skbank.sml.fns.mpb.dto.ObkMbpfReturn_DODT;
import com.skbank.sml.fns.mpb.dto.ObkTsReqRnpeInf_DIDT;
import com.skbank.sml.fns.mpb.dto.ObkTsReqRnpeInf_DODT;
import com.skbank.sml.fns.mpb.dto.TbkFdtsExe_DIDT;
import com.skbank.sml.fns.mpb.dto.TbkFdtsExe_DODT;
import com.skbank.sml.fns.mpb.dto.TbkMbpfReturn_DIDT;
import com.skbank.sml.fns.mpb.dto.TbkMbpfReturn_DODT;
import com.skbank.sml.fns.mpb.dto.TbkTsReqRnpeInf_DIDT;
import com.skbank.sml.fns.mpb.dto.TbkTsReqRnpeInf_DODT;
import com.skbank.sml.fns.shr.cst.cstt.SHRMPBCmmConstant;
import com.skbank.sml.ifi.mca.eims5.dto.IBSMR0005785_GRID_IDT;
import com.skbank.sml.ifi.mca.eims5.dto.IBSMR0005785_GRID_ODT;
import com.skbank.sml.ifi.mca.eims5.dto.IBSMR0005785_IDT;
import com.skbank.sml.ifi.mca.eims5.dto.IBSMR0005785_ODT;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0005785_COM;

import bxm.common.annotaion.BxmCategory;
import io.micrometer.core.instrument.util.StringUtils;
import fwk.skbank.asis.adaptor.dto.request.WFInterfaceCfg;
import fwk.skbank.asis.adaptor.dto.response.WFInfResponse;
import fwk.skbank.online.context.WFApplicationContext;
import fwk.skbank.online.exception.app.WFApplicationException;
import fwk.skbank.online.exception.frm.SFAdaptorApplicationException;
import fwk.skbank.online.exception.frm.SFInterfaceSystemException;
import fwk.skbank.online.file.util.WFFileUtils;
import fwk.skbank.online.util.WFDateUtils;
import fwk.skbank.online.util.WFStringUtils;

/**
 * 1.업무명 : 금융서비스 2.단위업무명 : NEWWON 중분류 모임통장 3.프로그램명 : 모임통장.금융거래.관리.서비스 4.설명 :
 * 
 * @Class MPBMetPbokFncTrnMng_SVC.java
 * @author 90190263
 * @since 2024.03.25
 * @version 1.0
 */
@Service
@BxmCategory(logicalName = "모임통장.금융거래.관리.서비스", description = "모임통장의 금융거래를 관리하는 서비스")
public class MPBMetPbokFncTrnMng_SVC {
	private Logger logger = LoggerFactory.getLogger(getClass());

	/**
	 * 세션 관리 컴포넌트
	 */
	private SHRCMMLoginSession_COM shrCMMLoginSession_COM;
	/**
	 * WFInterfaceCfg 생성 컴포넌트
	 */
	private SHRCMMInterfaceCfg_COM sHRCMMInterfaceCfg_COM;
	/**
	 * 모임통장.일반.관리.컴포넌트
	 */
	private MPBMetPbokBscMng_COM mPBMetPbokBscMng_COM;
	/**
	 * 모임통장.회원.관리.컴포넌트
	 */
	private MPBMetPbokMbhMng_COM mPBMetPbokMbhMng_COM;
	/**
	 * 모임통장.금융거래.관리.컴포넌트
	 */
	private MPBMetPbokFncTrnMng_COM mPBMetPbokFncTrnMng_COM;
	/**
	 * SHRRnpeFnmInq_COM 공유 공통 컴포넌트
	 */
	private SHRRnpeFnmInq_COM sHRRnpeFnmInq_COM;
	/**
	 * SHRAIFDSManager_COM FDS 컴포넌트
	 */
	private SHRAIFDSManager_COM sHRAIFDSManager_COM;
	
	/**
	 * 모임통장 서비스 거래명세 변경
	 */
	private SHRIBSMR0005785_COM sHRIBSMR0005785_COM;

	/** 계좌정보세션.컴포넌트 */
	private SHRAllActInqTbk_COM sHRAllActInqTbk_COM;
	
	/**
	 * SHRCMMEncDecSession_COM  컴포넌트
	 */
	private SHRCMMEncDecSession_COM  sHRCMMEncDecSession_COM;
	
	/**
	 * 모임통장에서 원하는 월의 입금현황을 조회하는 서비스
	 * 
	 * @param input
	 *            회비.입금현황.조회.컨트롤러.입력.IO
	 * @return 회비.입금현황.조회.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName = "회비.입금현황.조회", description = "모임통장에서 원하는 월의 입금현황을 조회하는 서비스", author = "90190263")
	public MPBMetPbokFncTrnMngSelectMbpfRcvSts_ODT selectMbpfRcvSts(
			MPBMetPbokFncTrnMngSelectMbpfRcvSts_IDT input) {
		/**
		 * @BXMType GetBean
		 */
		mPBMetPbokFncTrnMng_COM = WFApplicationContext.getBean(mPBMetPbokFncTrnMng_COM, MPBMetPbokFncTrnMng_COM.class);
		mPBMetPbokBscMng_COM= WFApplicationContext.getBean(mPBMetPbokBscMng_COM, MPBMetPbokBscMng_COM.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokFncTrnMngSelectMbpfRcvSts_ODT output = new MPBMetPbokFncTrnMngSelectMbpfRcvSts_ODT();

		/*
		 * 로직 추가
		 */
		if (logger.isDebugEnabled()) {
			logger.debug("90190263 회비.입금현황.조회 SVC input {} :: ", input);
		}

		List<MPBMbpfRcvstsListInq_ODT> outRcvGrid = new ArrayList<>();
		List<MPBMbpfRcvstsListInq_ODT> outNrcvGrid = new ArrayList<>();

		// 기타 입금자의 입금내역도 조회 할 것인지 여부를 체크
		if ("Y".equals(input.getEtcRcvInqYn())) {
			boolean nextDataYn = true;
			String nxtTrnDt= input.getInqStaDt();
			int nxtTrnSrno = 0;								
			BigDecimal initAmount = BigDecimal.ZERO;
			BigDecimal totMbpfPymAm = BigDecimal.ZERO;
			
			MPBMbpfRcvstsListInq_ODT outData = new MPBMbpfRcvstsListInq_ODT();
			
			while(nextDataYn) {
				MetPbokTrnPrts_DIDT iTrnPrts = new MetPbokTrnPrts_DIDT();
			
				iTrnPrts.setInqDis("15"); // 조회구분 [05] 거래일자 순차 / [06] 거래일자 역순 / [15] 기타입금내역 순차 / [16] 기타 입금내역 역순차
				iTrnPrts.setMetMngNo(input.getMetMngNo()); // 모임관리번호
				iTrnPrts.setInqStaDt(nxtTrnDt); // 조회시작일자
				iTrnPrts.setInqStaTrnSrno(nxtTrnSrno); // 조회시작거래일련번호
				iTrnPrts.setInqEndDt(input.getInqEndDt()); // 조회종료일자
				iTrnPrts.setInqEndTrnSrno(99999999); // 조회종료거래일련번호
				iTrnPrts.setSctnStaAm(0); // 구간시작금액
				iTrnPrts.setSctnEndAm(0); // 구간종료금액
				iTrnPrts.setRapDscd("1"); // 입지급구분코드
				iTrnPrts.setMetTrnMemoTxt(""); // 모임거래메모내용
				
				if (logger.isDebugEnabled()) {
					logger.debug("90190263 회비.입금현황.조회 SVC 기타 거래내역 조회 iTrnPrts {} :: ",iTrnPrts);
				}
	
				MetPbokTrnPrts_DODT oTrnPrts = mPBMetPbokFncTrnMng_COM.selectMetPbokTrnPrts(iTrnPrts);
	
				if (logger.isDebugEnabled()) {
					logger.debug("90190263 회비.입금현황.조회 SVC 기타 거래내역 조회 oTrnPrts {} :: ",oTrnPrts);
				}
	
				if (!ObjectUtils.isEmpty(oTrnPrts)) {
					/**************************************************** 
					 *  기타 거래 이면서,  모임거래상태코드 [01]:회비입금
					 ****************************************************/
					List<MetPbokTrnPrtsGrid> filterEtcRcvData = oTrnPrts.getGrid().stream().filter(item -> item.getMetMbhSrno() == 0)
																													.filter(item ->  "01".equals(item.getMetTrnStcd()))
																													.collect(Collectors.toList());
					
					if (logger.isDebugEnabled()) {
						logger.debug("90190263 회비.입금현황.조회 SVC 기타 거래내역 조회 filterEtcRcvData {} :: ",filterEtcRcvData);
					}
	
					if (!ObjectUtils.isEmpty(filterEtcRcvData)) {
						for (MetPbokTrnPrtsGrid outEtcRcvData : filterEtcRcvData) {
							totMbpfPymAm = totMbpfPymAm.add(outEtcRcvData.getTrnAm());
							if (logger.isDebugEnabled()) {
								logger.debug("90190263 회비.입금현황.조회 SVC 회비납부금액 누적 중 - totMbpfPymAm {} :: ",totMbpfPymAm);
							}
						}
						
						outData.setMetMbhSrno(0); // 모임회원일련번호
						outData.setMetMbhAlsNm("기타"); // 모임회원별칭명
						outData.setMetMbhDscd("0"); // 모임회원구분코드
						outData.setMbpfPymAm(totMbpfPymAm); // 회비납부금액
						outData.setMbpfPmtgtAm(initAmount); // 회비납부대상금액
						outData.setMetMbpfXmpAm(initAmount); // 회비면제금액
						
					}
					
					if (logger.isDebugEnabled()) {
						logger.debug("90190263 회비.입금현황.조회 SVC 총 기타회비입금금액 totMbpfPymAm {} :: ",totMbpfPymAm);
					}
				}
				
				if(! "".equals(oTrnPrts.getNxtTrnDt())) {
					nxtTrnDt= oTrnPrts.getNxtTrnDt();
					nxtTrnSrno = oTrnPrts.getNxtTrnSrno();		
				} else {
					nextDataYn = false;
					// 기타입금내역이 있을때만 추가
					if (totMbpfPymAm.compareTo(BigDecimal.ZERO) > 0) {
						outRcvGrid.add(outData);
					}
					
					break;
				}

			}
		}
		
		MbpfRcvstsInq_DIDT iMbpfRcvSts = new MbpfRcvstsInq_DIDT();
		iMbpfRcvSts.setInqDis(input.getInqDis()); // 조회구분
		iMbpfRcvSts.setMetMngNo(input.getMetMngNo()); // 모임관리번호
		iMbpfRcvSts.setNxtMetMbhAlsNm(input.getNxtMetMbhAlsNm()); // 다음모임회원별칭명
		iMbpfRcvSts.setInqBasYm(input.getInqBasYm()); // 조회기준년월
		iMbpfRcvSts.setMetMbhSrno(input.getMetMbhSrno()); // 모임회원일련번호
		iMbpfRcvSts.setInqStaDt(input.getInqStaDt()); // 조회시작일자
		iMbpfRcvSts.setInqStaTrnSrno(input.getInqStaTrnSrno()); // 조회시작거래일련번호
		iMbpfRcvSts.setInqEndDt(input.getInqEndDt()); // 조회종료일자
		iMbpfRcvSts.setInqEndTrnSrno(input.getInqEndTrnSrno()); // 조회종료거래일련번호

		MbpfRcvstsInq_DODT oMbpfRcvSts = mPBMetPbokFncTrnMng_COM.selectMetPbokMbpfRcvSts(iMbpfRcvSts);

		if (logger.isDebugEnabled()) {
			logger.debug("90190263 회비.입금현황.조회 SVC oMbpfRcvSts {} :: ",oMbpfRcvSts);
		}

		output.setMetMngNo(oMbpfRcvSts.getMetMngNo()); // 모임관리번호
		output.setEbnkUtzpeNo(oMbpfRcvSts.getEbnkUtzpeNo()); // 전자뱅킹이용자번호
		output.setMetCtrStcd(oMbpfRcvSts.getMetCtrStcd()); // 모임계약상태코드
		output.setMetCtrStcdNm(oMbpfRcvSts.getMetCtrStcdNm()); // 모임계약상태코드명
		output.setMetPbokDscd(oMbpfRcvSts.getMetPbokDscd()); // 모임통장구분코드
		output.setMetPbokDscdNm(oMbpfRcvSts.getMetPbokDscdNm()); // 모임통장구분코드명
		output.setMetNm(oMbpfRcvSts.getMetNm()); // 모임명
		output.setRcvBkwAcno(oMbpfRcvSts.getRcvBkwAcno()); // 입금전행계좌번호
		output.setCusUsgBkwAcno(oMbpfRcvSts.getCusUsgBkwAcno()); // 고객사용전행계좌번호
		output.setItcsno(oMbpfRcvSts.getItcsno()); // 통합고객번호
		output.setCusKorlNm(oMbpfRcvSts.getCusKorlNm()); // 고객한글명
		output.setCusBkpnNm(oMbpfRcvSts.getCusBkpnNm()); // 고객부기명
		output.setCtBal(oMbpfRcvSts.getCtBal()); // 현재잔액
		output.setPayAvlBal(oMbpfRcvSts.getPayAvlBal()); // 지급가능잔액
		output.setPdcd(oMbpfRcvSts.getPdcd()); // 상품코드
		output.setPdcdKorlNm(oMbpfRcvSts.getPdcdKorlNm()); // 상품코드한글명
		output.setPrdKorlAbrNm(oMbpfRcvSts.getPrdKorlAbrNm()); // 상품한글단축명
		output.setRlfAcno(oMbpfRcvSts.getRlfAcno()); // 안심계좌번호
		output.setMbpfPymDt(oMbpfRcvSts.getMbpfPymDt()); // 회비납부일자
		output.setMbpfPymCycd(oMbpfRcvSts.getMbpfPymCycd()); // 회비납부주기코드
		output.setMbpfPymCycdNm(oMbpfRcvSts.getMbpfPymCycdNm()); // 회비납부주기코드명
		output.setMbpfPmtgtAm(oMbpfRcvSts.getMbpfPmtgtAm()); // 회비납부대상금액
		output.setAgmdCollDt(oMbpfRcvSts.getAgmdCollDt()); // 동의서징구일자
		output.setAdvpeEno(oMbpfRcvSts.getAdvpeEno()); // 권유자직원번호
		output.setAsmnlApvCd(oMbpfRcvSts.getAsmnlApvCd()); // 공동명의승인코드
		output.setAsmnlApvCdNm(oMbpfRcvSts.getAsmnlApvCdNm()); // 공동명의승인코드명
		output.setRppeChgRgsYn(oMbpfRcvSts.getRppeChgRgsYn()); // 대표자변경등록여부
		output.setRppeChgRgsDt(oMbpfRcvSts.getRppeChgRgsDt()); // 대표자변경등록일자
		output.setRppeChgVldDt(oMbpfRcvSts.getRppeChgVldDt()); // 대표자변경유효일자
		output.setMetDscd(oMbpfRcvSts.getMetDscd()); // 모임구분코드
		output.setMetDscdNm(oMbpfRcvSts.getMetDscdNm()); // 모임구분코드명
		output.setMetRgsDt(oMbpfRcvSts.getMetRgsDt()); // 모임등록일자
		output.setRgsTm(oMbpfRcvSts.getRgsTm()); // 등록시각
		output.setMetBscImgUrlNm(oMbpfRcvSts.getMetBscImgUrlNm()); // 모임기본이미지URL명
		output.setMetMbhRgsCnt(oMbpfRcvSts.getMetMbhRgsCnt()); // 모임회원등록건수
		output.setMetMbhScssCnt(oMbpfRcvSts.getMetMbhScssCnt()); // 모임회원탈퇴건수
		output.setMetRprsAlsNm(oMbpfRcvSts.getMetRprsAlsNm()); // 모임대표별칭명
		output.setMetRprsMbhNm(oMbpfRcvSts.getMetRprsMbhNm()); // 모임대표회원명
		output.setMetRprsImgUrlNm(oMbpfRcvSts.getMetRprsImgUrlNm()); // 모임대표이미지URL명
		output.setTotMbpfRcvAm(oMbpfRcvSts.getTotMbpfRcvAm()); // 총회비입금금액
		output.setTotMbpfXmpAm(oMbpfRcvSts.getTotMbpfXmpAm()); // 총회비면제금액
		output.setMbpfPymMbhCn(oMbpfRcvSts.getMbpfPymMbhCn()); // 회비납부회원수
		output.setMbpfNpymMbhCn(oMbpfRcvSts.getMbpfNpymMbhCn()); // 회비미납부회원수
		
		output.setNxtMetMbhAlsNm(oMbpfRcvSts.getNxtMetMbhAlsNm()); // 다음모임회원별칭명
		
		BigDecimal initAmount = BigDecimal.ZERO;
		for (MbpfRcvstsListInq_DODT oMbpfRcvStsData : oMbpfRcvSts.getDis1Grid()) {
			MPBMbpfRcvstsListInq_ODT outData = new MPBMbpfRcvstsListInq_ODT();

			MetPbokImgInfInq_DODT mbhImgInfData = new MetPbokImgInfInq_DODT();
			
			if(oMbpfRcvStsData.getMetMbhImgUrlNm().indexOf("FNS/moim") !=-1 ) {
				// 회원의 이미지 정보 조회
				mbhImgInfData  = mPBMetPbokBscMng_COM.selectMetPbokImgInf(oMbpfRcvStsData.getMetMbhImgUrlNm());
			}
			
			outData.setInqBasYm(oMbpfRcvStsData.getInqBasYm()); // 조회기준년월
			outData.setMetMbhSrno(oMbpfRcvStsData.getMetMbhSrno()); // 모임회원일련번호
			outData.setMetMbhAlsNm(oMbpfRcvStsData.getMetMbhAlsNm()); // 모임회원별칭명
			outData.setMetMbhDscd(oMbpfRcvStsData.getMetMbhDscd()); // 모임회원구분코드
			outData.setMetMbhDscdNm(oMbpfRcvStsData.getMetMbhDscdNm()); // 모임회원구분코드명
			outData.setMetMbhImgUrlNm(oMbpfRcvStsData.getMetMbhImgUrlNm()); // 모임회원이미지URL명
			outData.setMbpfPmtgtAm(oMbpfRcvStsData.getMbpfPmtgtAm()); // 회비납부대상금액
			outData.setMbpfPymAm(oMbpfRcvStsData.getMbpfPymAm()); // 회비납부금액
			outData.setMetMbpfXmpAm(oMbpfRcvStsData.getMetMbpfXmpAm()); // 모임회비면제금액
			outData.setMetMbhImgFileData(mbhImgInfData.getFileData());
			
			// 1원이라도 냈을 경우 납부 회원으로 확인
			if (oMbpfRcvStsData.getMbpfPymAm().compareTo(initAmount) > 0) {
				outRcvGrid.add(outData);
			} else {
				outNrcvGrid.add(outData);
			}
		}

		output.setRcvGridCnt(outRcvGrid.size());
		output.setNrcvGridCnt(outNrcvGrid.size());
		output.setRcvGrid(outRcvGrid);
		output.setNrcvGrid(outNrcvGrid);

		if (logger.isDebugEnabled()) {
			logger.debug("90190263 회비.입금현황.조회 SVC output {} :: ", output);
		}
		return output;

	}

	/**
	 * 모임통장에서 원하는 월의 입금현황을 조회하는 서비스
	 * 
	 * 
	 * @param input
	 *            회원.회비.입금내역.조회.컨트롤러.입력.IO
	 * @return 회원.회비.입금내역.조회.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName = "회원별.회비.입금내역.조회", description = "모임통장에서 원하는 월의 입금현황을 조회하는 서비스", author = "90190263")
	public MPBMetPbokFncTrnMngSelectByMbhMbpfRcvPrts_ODT selectByMbhMbpfRcvPrts(
			MPBMetPbokFncTrnMngSelectByMbhMbpfRcvPrts_IDT input) {
		/**
		 * @BXMType GetBean
		 */
		mPBMetPbokFncTrnMng_COM = WFApplicationContext.getBean(mPBMetPbokFncTrnMng_COM, MPBMetPbokFncTrnMng_COM.class);

		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokFncTrnMngSelectByMbhMbpfRcvPrts_ODT output = new MPBMetPbokFncTrnMngSelectByMbhMbpfRcvPrts_ODT();
		MbpfRcvstsInq_DIDT iMbpfRcvSts = new MbpfRcvstsInq_DIDT();
		iMbpfRcvSts.setInqDis(input.getInqDis()); // 조회구분
		iMbpfRcvSts.setMetMngNo(input.getMetMngNo()); // 모임관리번호
		iMbpfRcvSts.setNxtMetMbhAlsNm(input.getNxtMetMbhAlsNm()); // 다음모임회원별칭명
		iMbpfRcvSts.setInqBasYm(input.getInqBasYm()); // 조회기준년월
		iMbpfRcvSts.setMetMbhSrno(input.getMetMbhSrno()); // 모임회원일련번호
		iMbpfRcvSts.setInqStaDt(input.getInqStaDt()); // 조회시작일자
		iMbpfRcvSts.setInqStaTrnSrno(input.getInqStaTrnSrno()); // 조회시작거래일련번호
		iMbpfRcvSts.setInqEndDt(input.getInqEndDt()); // 조회종료일자
		iMbpfRcvSts.setInqEndTrnSrno(input.getInqEndTrnSrno()); // 조회종료거래일련번호
		
		MbpfRcvstsInq_DODT oMbpfRcvSts = mPBMetPbokFncTrnMng_COM.selectMetPbokMbpfRcvSts(iMbpfRcvSts);

		if (logger.isDebugEnabled()) {
			logger.debug("90190263 회원별.회비.입금내역.조회 SVC oMbpfRcvSts {} :: ",oMbpfRcvSts);
		}

		output.setMetMngNo(oMbpfRcvSts.getMetMngNo()); // 모임관리번호
		output.setEbnkUtzpeNo(oMbpfRcvSts.getEbnkUtzpeNo()); // 전자뱅킹이용자번호
		output.setMetCtrStcd(oMbpfRcvSts.getMetCtrStcd()); // 모임계약상태코드
		output.setMetCtrStcdNm(oMbpfRcvSts.getMetCtrStcdNm()); // 모임계약상태코드명
		output.setMetPbokDscd(oMbpfRcvSts.getMetPbokDscd()); // 모임통장구분코드
		output.setMetPbokDscdNm(oMbpfRcvSts.getMetPbokDscdNm()); // 모임통장구분코드명
		output.setMetNm(oMbpfRcvSts.getMetNm()); // 모임명
		output.setRcvBkwAcno(oMbpfRcvSts.getRcvBkwAcno()); // 입금전행계좌번호
		output.setCusUsgBkwAcno(oMbpfRcvSts.getCusUsgBkwAcno()); // 고객사용전행계좌번호
		output.setItcsno(oMbpfRcvSts.getItcsno()); // 통합고객번호
		output.setCusKorlNm(oMbpfRcvSts.getCusKorlNm()); // 고객한글명
		output.setCusBkpnNm(oMbpfRcvSts.getCusBkpnNm()); // 고객부기명
		output.setCtBal(oMbpfRcvSts.getCtBal()); // 현재잔액
		output.setPayAvlBal(oMbpfRcvSts.getPayAvlBal()); // 지급가능잔액
		output.setPdcd(oMbpfRcvSts.getPdcd()); // 상품코드
		output.setPdcdKorlNm(oMbpfRcvSts.getPdcdKorlNm()); // 상품코드한글명
		output.setPrdKorlAbrNm(oMbpfRcvSts.getPrdKorlAbrNm()); // 상품한글단축명
		output.setRlfAcno(oMbpfRcvSts.getRlfAcno()); // 안심계좌번호
		output.setMbpfPymDt(oMbpfRcvSts.getMbpfPymDt()); // 회비납부일자
		output.setMbpfPymCycd(oMbpfRcvSts.getMbpfPymCycd()); // 회비납부주기코드
		output.setMbpfPymCycdNm(oMbpfRcvSts.getMbpfPymCycdNm()); // 회비납부주기코드명
		output.setMbpfPmtgtAm(oMbpfRcvSts.getMbpfPmtgtAm()); // 회비납부대상금액
		output.setAgmdCollDt(oMbpfRcvSts.getAgmdCollDt()); // 동의서징구일자
		output.setAdvpeEno(oMbpfRcvSts.getAdvpeEno()); // 권유자직원번호
		output.setAsmnlApvCd(oMbpfRcvSts.getAsmnlApvCd()); // 공동명의승인코드
		output.setAsmnlApvCdNm(oMbpfRcvSts.getAsmnlApvCdNm()); // 공동명의승인코드명
		output.setRppeChgRgsYn(oMbpfRcvSts.getRppeChgRgsYn()); // 대표자변경등록여부
		output.setRppeChgRgsDt(oMbpfRcvSts.getRppeChgRgsDt()); // 대표자변경등록일자
		output.setRppeChgVldDt(oMbpfRcvSts.getRppeChgVldDt()); // 대표자변경유효일자
		output.setMetDscd(oMbpfRcvSts.getMetDscd()); // 모임구분코드
		output.setMetDscdNm(oMbpfRcvSts.getMetDscdNm()); // 모임구분코드명
		output.setMetRgsDt(oMbpfRcvSts.getMetRgsDt()); // 모임등록일자
		output.setRgsTm(oMbpfRcvSts.getRgsTm()); // 등록시각
		output.setMetBscImgUrlNm(oMbpfRcvSts.getMetBscImgUrlNm()); // 모임기본이미지URL명
		output.setMetMbhRgsCnt(oMbpfRcvSts.getMetMbhRgsCnt()); // 모임회원등록건수
		output.setMetMbhScssCnt(oMbpfRcvSts.getMetMbhScssCnt()); // 모임회원탈퇴건수
		output.setMetRprsAlsNm(oMbpfRcvSts.getMetRprsAlsNm()); // 모임대표별칭명
		output.setMetRprsMbhNm(oMbpfRcvSts.getMetRprsMbhNm()); // 모임대표회원명
		output.setMetRprsImgUrlNm(oMbpfRcvSts.getMetRprsImgUrlNm()); // 모임대표이미지URL명
		output.setTotMbpfRcvAm(oMbpfRcvSts.getTotMbpfRcvAm()); // 총회비입금금액
		output.setTotMbpfXmpAm(oMbpfRcvSts.getTotMbpfXmpAm()); // 총회비면제금액
		output.setMbpfPymMbhCn(oMbpfRcvSts.getMbpfPymMbhCn()); // 회비납부회원수
		output.setMbpfNpymMbhCn(oMbpfRcvSts.getMbpfNpymMbhCn()); // 회비미납부회원수
		output.setNxtMetMbhAlsNm(oMbpfRcvSts.getNxtMetMbhAlsNm()); // 다음모임회원별칭명

		// 회비.입금현황.목록.조회.컨트롤러.출력.IO
		// 모임별 입금내역
		List<MPBMbpfRcvstsListInq_ODT> outDataList = new ArrayList<>();
		for (MbpfRcvstsListInq_DODT oMbpfRcvstsData : oMbpfRcvSts.getDis1Grid()) {
			MPBMbpfRcvstsListInq_ODT outData = new MPBMbpfRcvstsListInq_ODT();
			outData.setInqBasYm(oMbpfRcvstsData.getInqBasYm()); // 조회기준년월
			outData.setMetMbhSrno(oMbpfRcvstsData.getMetMbhSrno()); // 모임회원일련번호
			outData.setMetMbhAlsNm(oMbpfRcvstsData.getMetMbhAlsNm()); // 모임회원별칭명
			outData.setMetMbhDscd(oMbpfRcvstsData.getMetMbhDscd()); // 모임회원구분코드
			outData.setMetMbhDscdNm(oMbpfRcvstsData.getMetMbhDscdNm()); // 모임회원구분코드명
			outData.setMbpfPmtgtAm(oMbpfRcvstsData.getMbpfPmtgtAm()); // 회비납부대상금액
			outData.setMbpfPymAm(oMbpfRcvstsData.getMbpfPymAm()); // 회비납부금액
			outData.setMetMbpfXmpAm(oMbpfRcvstsData.getMetMbpfXmpAm()); // 모임회비면제금액

			outDataList.add(outData);
		}

		output.setDis1Grid(outDataList);
		output.setGrid1Cnt(outDataList.size());

		output.setMetMbhSrno(oMbpfRcvSts.getMetMbhSrno()); // 모임회원일련번호
		output.setMetMbhNm(oMbpfRcvSts.getMetMbhNm()); // 모임회원명
		output.setMetMbhAlsNm(oMbpfRcvSts.getMetMbhAlsNm()); // 모임회원별칭명
		output.setMetMbhDscd(oMbpfRcvSts.getMetMbhDscd()); // 모임회원구분코드
		output.setMetMbhDscdNm(oMbpfRcvSts.getMetMbhDscdNm()); // 모임회원구분코드명
		output.setMetMbhImgUrlNm(oMbpfRcvSts.getMetMbhImgUrlNm()); // 모임회원이미지URL명
		output.setNxtInqTrnDt(oMbpfRcvSts.getNxtInqTrnDt()); // 다음조회거래일자
		output.setNxtTrnSrno(oMbpfRcvSts.getNxtTrnSrno()); // 다음거래일련번호

		// 회비.입금현황.목록2.조회.컨트롤러.출력.IO
		// 회원별 입금내역
		List<MPBMbpfRcvstsList2Inq_DTO> outDataList2 = new ArrayList<>();
		
		for (MbpfRcvstsList2Inq_DODT oByMbhMbpfRcvStsData : oMbpfRcvSts.getDis2Grid()) {
			MPBMbpfRcvstsList2Inq_DTO outData2 = new MPBMbpfRcvstsList2Inq_DTO();
			MET_PBOK_MBPF_TS_REQ_INF001SelectMbpfRtunInf_DODT oMbpfRtun = new MET_PBOK_MBPF_TS_REQ_INF001SelectMbpfRtunInf_DODT();
			
			// 회비돌려받기 건이 신청중 단계인지 확인 필요
			if( "08".equals(input.getInqDis()) ) {
				MET_PBOK_MBPF_TS_REQ_INF001SelectMbpfRtunInf_DIDT iMbpfRtun= new MET_PBOK_MBPF_TS_REQ_INF001SelectMbpfRtunInf_DIDT();
				iMbpfRtun.setMetMngNo(input.getMetMngNo()); // 모임관리번호
				iMbpfRtun.setMetTsReqDscd("2");
				iMbpfRtun.setTrnDt(oByMbhMbpfRcvStsData.getTrnDt().toString());
				iMbpfRtun.setTrnSrno(oByMbhMbpfRcvStsData.getTrnSrno());
				iMbpfRtun.setTsReqDelYn("N");

				if (logger.isDebugEnabled()) {
					logger.debug("90190263  회원별.회비.입금내역.조회SVC 회비돌려받기정보 iMbpfRtun {} :: ",iMbpfRtun);
				}
				
				oMbpfRtun = mPBMetPbokFncTrnMng_COM.selectMbpfRtunInf(iMbpfRtun);
				 

				if (logger.isDebugEnabled()) {
					logger.debug("90190263 회원별.회비.입금내역.조회 SVC 회비돌려받기정보 oMbpfRtun {} :: ",oMbpfRtun);
				}
			}

			outData2.setTrnDt(oByMbhMbpfRcvStsData.getTrnDt()); // 거래일자
			outData2.setTrnSrno(oByMbhMbpfRcvStsData.getTrnSrno()); // 거래일련번호
			outData2.setTrnBkcd(oByMbhMbpfRcvStsData.getTrnBkcd()); // 거래은행코드
			outData2.setTrbkCdNm(oByMbhMbpfRcvStsData.getTrbkCdNm()); // 거래은행코드명
			outData2.setPtnBkwAcno(oByMbhMbpfRcvStsData.getPtnBkwAcno()); // 상대전행계좌번호
			outData2.setTrnTm(oByMbhMbpfRcvStsData.getTrnTm()); // 거래시각
			outData2.setDpsRapDscd(oByMbhMbpfRcvStsData.getDpsRapDscd()); // 수신입지급구분코드
			outData2.setDpsRapDscdNm(oByMbhMbpfRcvStsData.getDpsRapDscdNm()); // 수신입지급구분코드명
			outData2.setMetTrnStcd(oByMbhMbpfRcvStsData.getMetTrnStcd()); // 모임거래상태코드
			outData2.setMetTrnStcdNm(oByMbhMbpfRcvStsData.getMetTrnStcdNm()); // 모임거래상태코드명
			outData2.setRcvMbhNm(oByMbhMbpfRcvStsData.getRcvMbhNm()); // 입금회원명
			outData2.setMbpfPymAm(oByMbhMbpfRcvStsData.getMbpfPymAm()); // 회비납부금액
			outData2.setMbpfPmtgtAm(oByMbhMbpfRcvStsData.getMbpfPmtgtAm()); // 회비납부대상금액
			outData2.setMetMbpfXmpAm(oByMbhMbpfRcvStsData.getMetMbpfXmpAm()); // 모임회비면제금액
			outData2.setInqOtlnTxt(oByMbhMbpfRcvStsData.getInqOtlnTxt()); // 조회적요내용
			outData2.setPbokPrngOtlnTxt(oByMbhMbpfRcvStsData.getPbokPrngOtlnTxt()); // 통장인자적요내용
			outData2.setMetTrnMemoTxt(oByMbhMbpfRcvStsData.getMetTrnMemoTxt()); // 모임거래메모내용
			outData2.setMdKdcd(oByMbhMbpfRcvStsData.getMdKdcd()); // 매체종류코드
			outData2.setMdKdcdNm(oByMbhMbpfRcvStsData.getMdKdcdNm()); // 매체종류코드명
			outData2.setMetmbWdrYn(oByMbhMbpfRcvStsData.getMetmbWdrYn()); // 모임원출금여부
			outData2.setOrtrDt(oByMbhMbpfRcvStsData.getOrtrDt()); // 원거래일자
			outData2.setOrtrSrno(oByMbhMbpfRcvStsData.getOrtrSrno()); // 원거래일련번호
			
			outData2.setMetTsReqStcd(oMbpfRtun.getMetTsReqStcd());
			
			outDataList2.add(outData2);
		}
		output.setDis2Grid(outDataList2);
		output.setGrid2Cnt(outDataList2.size()); // 그리드2건수

		if (logger.isDebugEnabled()) {
			logger.debug("90190263 회원별.회비.입금내역.조회 SVC output {} :: ", output);
		}

		return output;

	}

	/**
	 * 모임통장의 거래내역 을 조회하는 서비스
	 * 
	 * @param input
	 *            모임통장.거래내역.컨트롤러.입력.IO
	 * @return 모임통장.거래내역.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName = "모임통장.거래.내역.조회", description = "모임통장 거래내역을 조회하는 컨트롤러", author = "90190263")
	public MPBMetPbokFncTrnMngSelectMetPbokTrnPrts_ODT selectMetPbokTrnPrts(
			MPBMetPbokFncTrnMngSelectMetPbokTrnPrts_IDT input) {
		/**
		 * @BXMType GetBean
		 */
		mPBMetPbokFncTrnMng_COM = WFApplicationContext.getBean(mPBMetPbokFncTrnMng_COM, MPBMetPbokFncTrnMng_COM.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokFncTrnMngSelectMetPbokTrnPrts_ODT output = new MPBMetPbokFncTrnMngSelectMetPbokTrnPrts_ODT();

		MetPbokTrnPrts_DIDT iTrnPrts = new MetPbokTrnPrts_DIDT();
	
		iTrnPrts.setInqDis(input.getInqDis()); // 조회구분
		iTrnPrts.setMetMngNo(input.getMetMngNo()); // 모임관리번호
		iTrnPrts.setInqStaDt(input.getInqStaDt()); // 조회시작일자
		iTrnPrts.setInqStaTrnSrno(input.getInqStaTrnSrno()); // 조회시작거래일련번호
		iTrnPrts.setInqEndDt(input.getInqEndDt()); // 조회종료일자
		iTrnPrts.setInqEndTrnSrno(input.getInqEndTrnSrno()); // 조회종료거래일련번호
		iTrnPrts.setSctnStaAm(input.getSctnStaAm()); // 구간시작금액
		iTrnPrts.setSctnEndAm(input.getSctnEndAm()); // 구간종료금액
		iTrnPrts.setRapDscd(input.getRapDscd()); // 입지급구분코드
		iTrnPrts.setMetTrnMemoTxt(input.getMemoTxt()); // 모임거래메모내용

		if(logger.isDebugEnabled()) {
			logger.debug("90190263 모임통장 거래내역 조회 SVC iTrnPrts {} ::: ", iTrnPrts);
		}
		
		MetPbokTrnPrts_DODT oTrnPrts = mPBMetPbokFncTrnMng_COM.selectMetPbokTrnPrts(iTrnPrts);

		if(logger.isDebugEnabled()) {
			logger.debug("90190263 모임통장 거래내역 조회 SVC oTrnPrts {} ::: ", oTrnPrts);
		}
		
		
		output.setMetMngNo(oTrnPrts.getMetMngNo()); // 모임관리번호
		output.setEbnkUtzpeNo(oTrnPrts.getEbnkUtzpeNo()); // 전자뱅킹이용자번호
		output.setMetCtrStcd(oTrnPrts.getMetCtrStcd()); // 모임계약상태코드
		output.setMetCtrStcdNm(oTrnPrts.getMetCtrStcdNm()); // 모임계약상태코드명
		output.setMetPbokDscd(oTrnPrts.getMetPbokDscd()); // 모임통장구분코드
		output.setMetPbokDscdNm(oTrnPrts.getMetPbokDscdNm()); // 모임통장구분코드명
		output.setMetNm(oTrnPrts.getMetNm()); // 모임명
		output.setRcvBkwAcno(oTrnPrts.getRcvBkwAcno()); // 입금전행계좌번호
		output.setCusUsgBkwAcno(oTrnPrts.getCusUsgBkwAcno()); // 고객사용전행계좌번호
		output.setItcsno(oTrnPrts.getItcsno()); // 통합고객번호
		output.setCusKorlNm(oTrnPrts.getCusKorlNm()); // 고객한글명
		output.setCusBkpnNm(oTrnPrts.getCusBkpnNm()); // 고객부기명
		output.setCtBal(oTrnPrts.getCtBal()); // 현재잔액
		output.setPayAvlBal(oTrnPrts.getPayAvlBal()); // 지급가능잔액
		output.setPdcd(oTrnPrts.getPdcd()); // 상품코드
		output.setPdcdKorlNm(oTrnPrts.getPdcdKorlNm()); // 상품코드한글명
		output.setPrdKorlAbrNm(oTrnPrts.getPrdKorlAbrNm()); // 상품한글단축명
		output.setRlfAcno(oTrnPrts.getRlfAcno()); // 안심계좌번호
		output.setMbpfPymDt(oTrnPrts.getMbpfPymDt()); // 회비납부일자
		output.setMbpfPymCycd(oTrnPrts.getMbpfPymCycd()); // 회비납부주기코드
		output.setMbpfPymCycdNm(oTrnPrts.getMbpfPymCycdNm()); // 회비납부주기코드명
		output.setMbpfPmtgtAm(oTrnPrts.getMbpfPmtgtAm()); // 회비납부대상금액
		output.setAgmdCollDt(oTrnPrts.getAgmdCollDt()); // 동의서징구일자
		output.setAdvpeEno(oTrnPrts.getAdvpeEno()); // 권유자직원번호
		output.setAsmnlApvCd(oTrnPrts.getAsmnlApvCd()); // 공동명의승인코드
		output.setAsmnlApvCdNm(oTrnPrts.getAsmnlApvCdNm()); // 공동명의승인코드명
		output.setRppeChgRgsYn(oTrnPrts.getRppeChgRgsYn()); // 대표자변경등록여부
		output.setRppeChgRgsDt(oTrnPrts.getRppeChgRgsDt()); // 대표자변경등록일자
		output.setRppeChgVldDt(oTrnPrts.getRppeChgVldDt()); // 대표자변경유효일자
		output.setMetDscd(oTrnPrts.getMetDscd()); // 모임구분코드
		output.setMetDscdNm(oTrnPrts.getMetDscdNm()); // 모임구분코드명
		output.setMetRgsDt(oTrnPrts.getMetRgsDt()); // 모임등록일자
		output.setRgsTm(oTrnPrts.getRgsTm()); // 등록시각
		output.setMetBscImgUrlNm(oTrnPrts.getMetBscImgUrlNm()); // 모임기본이미지URL명
		output.setMetMbhRgsCnt(oTrnPrts.getMetMbhRgsCnt());
		output.setMetMbhScssCnt(oTrnPrts.getMetMbhScssCnt());
		output.setMetMbhSrno(oTrnPrts.getMetMbhSrno()); // 모임회원일련번호
		output.setMetMbhAlsNm(oTrnPrts.getMetMbhAlsNm()); // 모임회원별칭명
		output.setMetMbhNm(oTrnPrts.getMetMbhNm()); // 모임회원명
		output.setMetMbhDscd(oTrnPrts.getMetMbhDscd()); // 모임회원구분코드
		output.setMetMbhDscdNm(oTrnPrts.getMetMbhDscdNm()); // 모임회원구분코드명
		output.setNxtTrnDt(oTrnPrts.getNxtTrnDt()); // 다음거래일자
		output.setNxtTrnSrno(oTrnPrts.getNxtTrnSrno()); // 다음거래일련번호
		

		// 모임통장.거래.내역.컨트롤러.출력.Sub.IO
		output.setGridCnt(oTrnPrts.getGridCnt()); // 그리드건수
		List<MPBMetPbokTrnPrts_DTO> outDataList = new ArrayList<>();

		for (MetPbokTrnPrtsGrid oTrnPrtsData : oTrnPrts.getGrid()) {
			MPBMetPbokTrnPrts_DTO outData = new MPBMetPbokTrnPrts_DTO();

			outData.setTrnDt(oTrnPrtsData.getTrnDt()); // 거래일자
			outData.setTrnSrno(oTrnPrtsData.getTrnSrno()); // 거래일련번호
			outData.setDpsTrnSrno(oTrnPrtsData.getDpsTrnSrno()); // 수신거래일련번호
			outData.setTrnBkcd(oTrnPrtsData.getTrnBkcd()); // 거래은행코드
			outData.setTrbkCdNm(oTrnPrtsData.getTrbkCdNm()); // 거래은행코드명
			outData.setPtnBkwAcno(oTrnPrtsData.getPtnBkwAcno()); // 상대전행계좌번호
			outData.setTrnTm(oTrnPrtsData.getTrnTm()); // 거래시각
			outData.setDpsRapDscd(oTrnPrtsData.getDpsRapDscd()); // 수신입지급구분코드
			outData.setDpsRapDscdNm(oTrnPrtsData.getDpsRapDscdNm()); // 수신입지급구분코드명
			outData.setMetTrnStcd(oTrnPrtsData.getMetTrnStcd()); // 모임거래상태코드
			outData.setMetTrnStcdNm(oTrnPrtsData.getMetTrnStcdNm()); // 모임거래상태코드명
			outData.setTrnAm(oTrnPrtsData.getTrnAm()); // 거래금액
			outData.setRcvMbhNm(oTrnPrtsData.getRcvMbhNm()); // 입금회원명
			outData.setMetMbhAlsNm(oTrnPrtsData.getMetMbhAlsNm()); // 모임회원별칭명
			outData.setMetMbhSrno(oTrnPrtsData.getMetMbhSrno()); // 모임회원일련번호
			outData.setPbokPrngOtlnTxt(oTrnPrtsData.getPbokPrngOtlnTxt()); // 통장인자적요내용
			outData.setMetTrnMemoTxt(oTrnPrtsData.getMetTrnMemoTxt()); // 모임거래메모내용
			outData.setRcvMbhNmChgTgtYn(oTrnPrtsData.getRcvMbhNmChgTgtYn()); // 입금회원명변경대상여부
			outData.setBftrBal(oTrnPrtsData.getBftrBal()); // 거래전잔액
			outData.setAftrBal(oTrnPrtsData.getAftrBal()); // 거래후잔액
			outData.setInqOtlnTxt(oTrnPrtsData.getInqOtlnTxt()); // 조회적요내용
			outData.setMdKdcd(oTrnPrtsData.getMdKdcd()); // 매체종류코드
			outData.setMdKdcdNm(oTrnPrtsData.getMdKdcdNm()); // 매체종류코드명
			outData.setMetmbWdrYn(oTrnPrtsData.getMetmbWdrYn()); // 모임원출금여부
			outData.setOrtrDt(oTrnPrtsData.getOrtrDt()); // 원거래일자
			outData.setOrtrSrno(oTrnPrtsData.getOrtrSrno()); // 원거래일련번호

			outDataList.add(outData);
		}

		output.setGrid(outDataList);
		
		
		if (logger.isDebugEnabled()) {
			logger.debug("90190263 모임통장 거래내역.조회 SVC output {} :: ", output);
		}

		return output;
	}

	/**
	 * 모임통장의 거래내역 을 수정하는 서비스
	 * 
	 * @param input
	 *            모임통장.거래내역.컨트롤러.입력.IO
	 * @return 모임통장.거래내역.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName = "모임통장.거래.내역.수정", description = "모임통장 거래내역을 수정하는 컨트롤러", author = "90190263")
	public MPBMetPbokFncTrnMngUpdateMetPbokTrnPrts_ODT updateMetPbokTrnPrts(
			MPBMetPbokFncTrnMngUpdateMetPbokTrnPrts_IDT input) {
		/**
		 * @BXMType GetBean
		 */
		// WFInterfaceCfg 생성 컴포넌트
		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class);
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		sHRIBSMR0005785_COM = WFApplicationContext.getBean(sHRIBSMR0005785_COM,SHRIBSMR0005785_COM.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokFncTrnMngUpdateMetPbokTrnPrts_ODT output = new MPBMetPbokFncTrnMngUpdateMetPbokTrnPrts_ODT();
		
		if(logger.isDebugEnabled()) {
			logger.debug("90190263 모임통장 거래내역 수정 SVC input {} ::: ", input);
		}
	
		// 세션고객정보
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession();
		if (logger.isDebugEnabled()) {
			logger.debug("currentCust ====== {} ::: ", currentCust);
		}
		
		String errMsgTxt = "";
		String errMsgId = "";
		/**
		 * @BXMType Try
		 * 
		 */
		try {
			/**
			 * 연계시스템 호출 
			 * TYPE : MCA 
			 * ID :IBSMR0005785 
			 * NM : 모임통장 서비스 거래명세 변경 
			 * [41]:회비입금회원명변경(일만모드) -입금회원명
			 * [42]:회비지출내용 변경(생활비(커플)모드) - 회비지출내용
			 * [43]:회비면제등록 - 모임회비면제금액
			 */
			// MCA WFInterfaceCfg 객체 획득
			WFInterfaceCfg interfaceCfg = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg();
			interfaceCfg.setInterfaceId("IBSMR0005785");

			IBSMR0005785_IDT iIBSMR0005785 = new IBSMR0005785_IDT();
			iIBSMR0005785.setMetChgDscd(input.getMetChgDscd()); // 모임변경구분코드 [41] 회비 입금회원명변경 / [42] 회비지출내용변경
			iIBSMR0005785.setMetMngNo(input.getMetMngNo()); // 모임관리번호
			iIBSMR0005785.setCnt(input.getCnt()); // 건수

			List<IBSMR0005785_GRID_IDT> inputDataList = new ArrayList<>();

			for (MPBUpdateMetPbokTrnPrtsGrid_DTO iMetTrnPrtsData : input.getGrid()) {
				IBSMR0005785_GRID_IDT inputData = new IBSMR0005785_GRID_IDT();

				inputData.setTrnDt(iMetTrnPrtsData.getTrnDt()); // 거래일자
				inputData.setTrnSrno(iMetTrnPrtsData.getTrnSrno()); // 거래일련번호
				inputData.setRcvMbhNm(iMetTrnPrtsData.getRcvMbhNm()); // 입금회원명
				inputData.setMetTrnMemoTxt(iMetTrnPrtsData.getMetTrnMemoTxt()); // 모임거래메모내용
				inputData.setMetMbpfXmpAm(iMetTrnPrtsData.getMetMbpfXmpAm()); // 모임회비면제금액
				
				inputDataList.add(inputData);

			}
			iIBSMR0005785.setGrid(inputDataList);


			if(logger.isDebugEnabled()) {
				logger.debug("90190263 모임통장 거래내역 수정 SVC iIBSMR0005785 {} ::: ", iIBSMR0005785);
			}
		
			WFInfResponse<IBSMR0005785_ODT> mcaOutput = sHRIBSMR0005785_COM.callTrx(iIBSMR0005785, interfaceCfg);

			IBSMR0005785_ODT oIBSMR0005785 = mcaOutput.getResponseData();
			if (logger.isDebugEnabled()) {
				logger.debug("90190263 모임통장 거래내역 수정 SVC oIBSMR0005785 {} ::: ",oIBSMR0005785);
			}

			output.setMetChgDscd(oIBSMR0005785.getMetChgDscd()); // 모임변경구분코드
			output.setMetChgDscdNm(oIBSMR0005785.getMetChgDscdNm()); // 모임변경구분코드명
			output.setMetMngNo(oIBSMR0005785.getMetMngNo()); // 모임관리번호
			output.setCnt(oIBSMR0005785.getCnt()); // 건수

			// 회원별.회비.면제.공통.Sub.IO
			List<MPBUpdateMetPbokTrnPrtsGrid_DTO> outDataList = new ArrayList<>();
			for (IBSMR0005785_GRID_ODT oMbpfXmpData : oIBSMR0005785.getGrid()) {
				MPBUpdateMetPbokTrnPrtsGrid_DTO outData = new MPBUpdateMetPbokTrnPrtsGrid_DTO();
				
				outData.setTrnDt(oMbpfXmpData.getTrnDt()); // 거래일자
				outData.setTrnSrno(oMbpfXmpData.getTrnSrno()); // 거래일련번호
				outData.setRcvMbhNm(oMbpfXmpData.getRcvMbhNm()); // 입금회원명
				outData.setMetTrnMemoTxt(oMbpfXmpData.getMetTrnMemoTxt()); // 모임거래메모내용
				outData.setMetMbpfXmpAm(oMbpfXmpData.getMetMbpfXmpAm()); // 모임회비면제금액

				outDataList.add(outData);
			}
			output.setGrid(outDataList);
		}catch(Exception e){
			logger.error("updateMetPbokTrnPrts Exception ::: {}", e);
		
			if ( e instanceof SFAdaptorApplicationException ) {
				SFAdaptorApplicationException se = (SFAdaptorApplicationException) e;
				logger.error("SFAdaptorApplicationException {} ", se);
				
				Object[] args = se.getArguments();
	            
	            if(args != null && args.length>0) {
	            	errMsgTxt = args[0].toString();
				}
	            errMsgId = se.getCode();
	            
			} else if ( e instanceof SFInterfaceSystemException ) {
				SFInterfaceSystemException se = (SFInterfaceSystemException) e;
				logger.error("SFInterfaceSystemException {} ", se);
				errMsgId = se.getMsgId();
				errMsgTxt = se.getMainMsgTxt();
	
			} else if ( e instanceof WFApplicationException) {
				WFApplicationException we = (WFApplicationException) e;
				logger.error("WFApplicationException {} ", we);

				Object[] args = we.getArguments();
				
	            if(args != null && args.length>0) {
	            	errMsgTxt = args[0].toString();
	            	errMsgId = args[1].toString();
				}else {
					errMsgId = we.getCode();
					errMsgTxt = we.getMessage();
				}
			} else {
				logger.error("Exception {} ", e);
				errMsgId = "9999";
				errMsgTxt = e.getMessage();				
			}
			
			throw new WFApplicationException("FNSE0006", null, new Object[] {errMsgId, errMsgTxt});
		}
		
		if (logger.isDebugEnabled()) {
			logger.debug("90190263 모임통장 거래내역.수정 SVC output {} :: ", output);
		}

		return output;
	}
	/**
	 * 일반 모임통장의 회비를 수정하는 서비스
	 * 
	 * @param input
	 *            일반.모임.회비.설정.컨트롤러.입력.IO
	 * @return 일반.모임.회비.설정.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName = "일반.모임.회비.설정.수정", description = "일반 모임통장의 회비를 수정하는 서비스", author = "90190263")
	public MPBMetPbokFncTrnMngUpdateGenMetMbpfEst_ODT updateGenMetMbpfEst(
			MPBMetPbokFncTrnMngUpdateGenMetMbpfEst_IDT input) {
		/**
		 * @BXMType GetBean
		 */
		mPBMetPbokBscMng_COM = WFApplicationContext.getBean(mPBMetPbokBscMng_COM, MPBMetPbokBscMng_COM.class);

		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokFncTrnMngUpdateGenMetMbpfEst_ODT output = new MPBMetPbokFncTrnMngUpdateGenMetMbpfEst_ODT();

		/*
		 * 로직 추가
		 */
		if (logger.isDebugEnabled()) {
			logger.debug("90190263 일반.모임.회비.설정.수정 SVC input {} :: ", input);
		}
		String errMsgTxt = "";
		String errMsgId = "";
		
		try {
			MetPbokBscMbhInf_DIDT iMetPbokBscMbhInf = new MetPbokBscMbhInf_DIDT();
			iMetPbokBscMbhInf.setMetChgDscd(input.getMetChgDscd()); // 모임변경구분코드 [08] 모임회칙등록변경 / [19] 회비그만모으기
			iMetPbokBscMbhInf.setMetMngNo(input.getMetMngNo()); // 모임관리번호
			iMetPbokBscMbhInf.setMbpfPymDt(input.getMbpfPymDt()); // 회비납부일자
			iMetPbokBscMbhInf.setMbpfPmtgtAm(input.getMbpfPmtgtAm()); // 회비납부대상금액

			/*
			 * @BXMType ComponentCall 모임통장.일반.관리.컴포넌트 모임통장.기본.회원.정보.수정
			 */
			MetPbokBscMbhInf_DODT oMetPbokBscMbhInf = mPBMetPbokBscMng_COM.updateMetPbokBscMbhInf(iMetPbokBscMbhInf);

			if (logger.isDebugEnabled()) {
				logger.debug("90190263 일반.모임.회비.설정.수정 SVC oMetPbokBscMbhInf {} :: ",oMetPbokBscMbhInf);
			}

			output.setMetChgDscd(oMetPbokBscMbhInf.getMetChgDscd()); // 모임변경구분코드
			output.setMetChgDscdNm(oMetPbokBscMbhInf.getMetChgDscdNm()); // 모임변경구분코드명
			output.setMetMngNo(oMetPbokBscMbhInf.getMetMngNo()); // 모임관리번호
			output.setMetNm(oMetPbokBscMbhInf.getMetNm()); // 모임명
			output.setMbpfPymDt(oMetPbokBscMbhInf.getMbpfPymDt()); // 회비납부일자
			output.setMbpfPmtgtAm(oMetPbokBscMbhInf.getMbpfPmtgtAm()); // 회비납부대상금액
			output.setMetDscd(oMetPbokBscMbhInf.getMetDscd()); // 모임구분코드
			output.setMetDscdNm(oMetPbokBscMbhInf.getMetDscdNm()); // 모임구분코드명
			output.setAgmdCollDt(oMetPbokBscMbhInf.getAgmdCollDt()); // 동의서징구일자
			output.setLifecAm(oMetPbokBscMbhInf.getLifecAm()); // 생활비금액
			output.setMetBscImgUrlNm(oMetPbokBscMbhInf.getMetBscImgUrlNm()); // 모임기본이미지URL명
			output.setCnt(oMetPbokBscMbhInf.getCnt()); // 건수

			// 모임통장.기본.회원.정보.그리드.수정.출력.IO
			List<MPBMetPbokBscMbhInfGrid_ODT> outDataList = new ArrayList<>();

			for (MetPbokBscMbhInfGrid_DODT oBscMbhData : oMetPbokBscMbhInf.getGrid()) {
				MPBMetPbokBscMbhInfGrid_ODT outData = new MPBMetPbokBscMbhInfGrid_ODT();
				outData.setMetMbhSrno(oBscMbhData.getMetMbhSrno()); // 모임회원일련번호
				outData.setEbnkUtzpeNo(oBscMbhData.getEbnkUtzpeNo()); // 전자뱅킹이용자번호
				outData.setMetMbhNm(oBscMbhData.getMetMbhNm()); // 모임회원명
				outData.setMbpfPmtgtAm(oBscMbhData.getMbpfPmtgtAm()); // 회비납부대상금액
				outData.setAncSndDscd(oBscMbhData.getAncSndDscd()); // 공지발송구분코드
				outData.setAncSndDscdNm(oBscMbhData.getAncSndDscdNm()); // 공지발송구분코드명
				outData.setAgmdCollDt(oBscMbhData.getAgmdCollDt()); // 동의서징구일자
				outData.setMetMbhImgUrlNm(oBscMbhData.getMetMbhImgUrlNm()); // 모임회원이미지URL명

				outDataList.add(outData);
			}

			output.setGrid(outDataList);
		}catch(Exception e){
			logger.error("updateGenMetMbpfEst Exception ::: {}", e);
	
			if ( e instanceof WFApplicationException) {
				WFApplicationException we = (WFApplicationException) e;
				logger.error("WFApplicationException {} ", we);

				Object[] args = we.getArguments();
				
	            if(args != null && args.length>0) {
	            	errMsgTxt = args[0].toString();
	            	errMsgId = args[1].toString();
				}else {
					errMsgId = we.getCode();
					errMsgTxt = we.getMessage();
				}
			} else {
				logger.error("Exception {} ", e);
				errMsgId = "9999";
				errMsgTxt = e.getMessage();				
			}
			
			throw new WFApplicationException("FNSE0006", null, new Object[] {errMsgId, errMsgTxt});
		}		

		if (logger.isDebugEnabled()) {
			logger.debug("90190263 일반.모임.회비.설정.수정 SVC output {} :: ",
					output);
		}

		return output;

	}
	/**
	 * 일반 모임통장의 회원별로 회비를 설정 수정 관리 하는 서비스
	 * 
	 * @param input
	 *            회원.회비금액.수정.컨트롤러.입력.IO
	 * @return 회원.회비금액.수정.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName = "일반.모임.회원별.회비.설정.수정", description = "일반 모임통장의 회원별로 회비를 설정 수정 관리 하는 서비스", author = "90190263")
	public MPBMetPbokFncTrnMngUpdateGenMetByMbhMbpfEst_ODT updateGenMetByMbhMbpfEst(
			MPBMetPbokFncTrnMngUpdateGenMetByMbhMbpfEst_IDT input) {

		/**
		 * @BXMType GetBean
		 */
		mPBMetPbokBscMng_COM = WFApplicationContext.getBean(mPBMetPbokBscMng_COM, MPBMetPbokBscMng_COM.class);

		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokFncTrnMngUpdateGenMetByMbhMbpfEst_ODT output = new MPBMetPbokFncTrnMngUpdateGenMetByMbhMbpfEst_ODT();

		/*
		 * 로직 추가
		 */
		if (logger.isDebugEnabled()) {
			logger.debug("90190263 일반.모임.회원별.회비.설정.수정 SVC input {} :: ", input);
		}
		String errMsgId = "";
		String errMsgTxt = "";
		
		/*
		 * @BXMType ComponentCall 모임통장.금융거래.관리.컴포넌트 일반.모임.회원.회비.설정.수정
		 */
		// com.skbank.sml.fns.mpb.com.MPBMetPbokFncTrnMng_COM
		// mPBMetPbokFncTrnMng_COM.updateGenmetmbhmbpfest(..);
		try {
			MetPbokBscMbhInf_DIDT iMetPbokBscMbhInf = new MetPbokBscMbhInf_DIDT();
			iMetPbokBscMbhInf.setMetChgDscd("23"); // 모임변경구분코드 [23] 모임회비납부금액변경
			iMetPbokBscMbhInf.setMetMngNo(input.getMetMngNo());// 모임관리번호
			iMetPbokBscMbhInf.setCnt(input.getGridCnt());// 건수

			List<MetPbokBscMbhInfGrid_DIDT> inputGrid = new ArrayList<>();
			for (MPBGenMetByMbhMbpfEstGrid_DTO iByMbhMbpfEst : input.getGrid()) {
				MetPbokBscMbhInfGrid_DIDT inputData = new MetPbokBscMbhInfGrid_DIDT();
				inputData.setMetMbhSrno(iByMbhMbpfEst.getMetMbhSrno()); // 모임회원일련번호
				inputData.setMbpfPmtgtAm(iByMbhMbpfEst.getMbpfPmtgtAm()); // 회비납부대상금액

				inputGrid.add(inputData);
			}
			iMetPbokBscMbhInf.setGrid(inputGrid);

			/*
			 * @BXMType ComponentCall 모임통장.일반.관리.컴포넌트 모임통장.기본.회원.정보.수정
			 */
			MetPbokBscMbhInf_DODT oMetPbokBscMbhInf = mPBMetPbokBscMng_COM.updateMetPbokBscMbhInf(iMetPbokBscMbhInf);

			if (logger.isDebugEnabled()) {
				logger.debug("90190263  일반.모임.회원별.회비.설정.수정 SVC oMetPbokBscMbhInf {} :: ",oMetPbokBscMbhInf);
			}

			output.setMetChgDscd(oMetPbokBscMbhInf.getMetChgDscd()); // 모임변경구분코드
			output.setMetChgDscdNm(oMetPbokBscMbhInf.getMetChgDscdNm()); // 모임변경구분코드명
			output.setMetMngNo(oMetPbokBscMbhInf.getMetMngNo()); // 모임관리번호
			output.setMetNm(oMetPbokBscMbhInf.getMetNm()); // 모임명
			output.setMbpfPymDt(oMetPbokBscMbhInf.getMbpfPymDt()); // 회비납부일자
			output.setMbpfPmtgtAm(oMetPbokBscMbhInf.getMbpfPmtgtAm()); // 회비납부대상금액
			output.setMetDscd(oMetPbokBscMbhInf.getMetDscd()); // 모임구분코드
			output.setMetDscdNm(oMetPbokBscMbhInf.getMetDscdNm()); // 모임구분코드명
			output.setAgmdCollDt(oMetPbokBscMbhInf.getAgmdCollDt()); // 동의서징구일자
			output.setLifecAm(oMetPbokBscMbhInf.getLifecAm()); // 생활비금액
			output.setMetBscImgUrlNm(oMetPbokBscMbhInf.getMetBscImgUrlNm()); // 모임기본이미지URL명

			output.setCnt(oMetPbokBscMbhInf.getCnt()); // 건수
			// 모임통장.기본.회원.정보.그리드.수정.출력.IO
			List<MPBMetPbokBscMbhInfGrid_ODT> outDataList = new ArrayList<>();

			for (MetPbokBscMbhInfGrid_DODT oBscMbhData : oMetPbokBscMbhInf.getGrid()) {
				MPBMetPbokBscMbhInfGrid_ODT outData = new MPBMetPbokBscMbhInfGrid_ODT();
				outData.setMetMbhSrno(oBscMbhData.getMetMbhSrno()); // 모임회원일련번호
				outData.setEbnkUtzpeNo(oBscMbhData.getEbnkUtzpeNo()); // 전자뱅킹이용자번호
				outData.setMetMbhNm(oBscMbhData.getMetMbhNm()); // 모임회원명
				outData.setMbpfPmtgtAm(oBscMbhData.getMbpfPmtgtAm()); // 회비납부대상금액
				outData.setAncSndDscd(oBscMbhData.getAncSndDscd()); // 공지발송구분코드
				outData.setAncSndDscdNm(oBscMbhData.getAncSndDscdNm()); // 공지발송구분코드명
				outData.setAgmdCollDt(oBscMbhData.getAgmdCollDt()); // 동의서징구일자
				outData.setMetMbhImgUrlNm(oBscMbhData.getMetMbhImgUrlNm()); // 모임회원이미지URL명

				outDataList.add(outData);
			}

			output.setGrid(outDataList);
		}catch(Exception e){
			logger.error("updateGenMetByMbhMbpfEst Exception ::: {}", e);
	
			if ( e instanceof WFApplicationException) {
				WFApplicationException we = (WFApplicationException) e;
				logger.error("WFApplicationException {} ", we);

				Object[] args = we.getArguments();
				
	            if(args != null && args.length>0) {
	            	errMsgTxt = args[0].toString();
	            	errMsgId = args[1].toString();
				}else {
					errMsgId = we.getCode();
					errMsgTxt = we.getMessage();
				}
			} else {
				logger.error("Exception {} ", e);
				errMsgId = "9999";
				errMsgTxt = e.getMessage();				
			}
			
			throw new WFApplicationException("FNSE0006", null, new Object[] {errMsgId, errMsgTxt});
		}
		

		if (logger.isDebugEnabled()) {
			logger.debug("90190263 일반.모임.회원별.회비.설정.수정 SVC output {} :: ",output);
		}

		return output;

	}
	/**
	 * 일반 모임통장의 회원별로 회비를 면제 수정 관리 하는 서비스
	 * 
	 * @param input
	 *            회원.회비금액.수정.컨트롤러.입력.IO
	 * @return 회원.회비금액.수정.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName = "일반.모임.회원별.회비.면제.수정", description = "일반 모임통장의 회원별로 회비를 면제 수정 관리 하는 서비스", author = "90190263")
	public MPBMetPbokFncTrnMngUpdateGenMetByMbhMbpfXmp_ODT updateGenMetByMbhMbpfXmp(
			MPBMetPbokFncTrnMngUpdateGenMetByMbhMbpfXmp_IDT input) {

		/**
		 * @BXMType GetBean
		 */
		// WFInterfaceCfg 생성 컴포넌트
		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class);
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		mPBMetPbokFncTrnMng_COM = WFApplicationContext.getBean(mPBMetPbokFncTrnMng_COM, MPBMetPbokFncTrnMng_COM.class);
		sHRIBSMR0005785_COM = WFApplicationContext.getBean(sHRIBSMR0005785_COM,SHRIBSMR0005785_COM.class);

		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokFncTrnMngUpdateGenMetByMbhMbpfXmp_ODT output = new MPBMetPbokFncTrnMngUpdateGenMetByMbhMbpfXmp_ODT();

		/*
		 * 로직 추가
		 */
		if (logger.isDebugEnabled()) {
			logger.debug("90190263 일반.모임.회원별.회비.면제.수정 SVC input {} :: ", input);
		}
		// 세션고객정보
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession();
		if (logger.isDebugEnabled()) {
			logger.debug("currentCust ====== {} ::: ", currentCust);
		}
		String errMsgId = "";
		String errMsgTxt = "";
		
		/**
		 * @BXMType Try
		 * 
		 */
		try {
			/**
			 * 연계시스템 호출 TYPE : MCA ID :IBSMR0005785 NM : 모임통장 서비스 거래명세 변경 41 :
			 * 회비입금회원명변경(일만모드) -입금회원명 42 : 회비지출내용 변경(생활비(커플)모드) - 회비지출내용 43 :
			 * 회비면제등록 - 모임회비면제금액
			 */
			// MCA WFInterfaceCfg 객체 획득
			WFInterfaceCfg interfaceCfg = sHRCMMInterfaceCfg_COM.getMcaInterfaceCfg();
			interfaceCfg.setInterfaceId("IBSMR0005785");

			IBSMR0005785_ODT oIBSMR0005785 = new IBSMR0005785_ODT();
			List<IBSMR0005785_GRID_ODT> oIBSMR0005785List = new ArrayList<>();
			
			List<IBSMR0005785_GRID_IDT> inputDataList = new ArrayList<>();
			IBSMR0005785_GRID_IDT inputData = new IBSMR0005785_GRID_IDT();
			
			IBSMR0005785_IDT iIBSMR0005785 = new IBSMR0005785_IDT();
			iIBSMR0005785.setMetMngNo(input.getMetMngNo()); // 모임관리번호
			
			// 회비면제취소 대상 List 분류 
			List<MPBByMbhMbpfXmpGrid_DTO> iMbpfXmpCancList = input.getGrid().stream()
																									 	  .filter(item -> "Y".equals(item.getCanYn()))
																										  .collect(Collectors.toList());
			
			if (logger.isDebugEnabled()) {
				logger.debug("90190263 일반.모임.회원별.회비.면제.취소.수정 SVC 회비면제취소 대상 List 분류 iMbpfXmpCancList {} ::: ",iMbpfXmpCancList);
			}
			
			// 회비면제 대상 List 분류
			List<MPBByMbhMbpfXmpGrid_DTO> iMbpfXmpList = input.getGrid().stream()
																								 	.filter(item -> !"Y".equals(item.getCanYn()))
																									.collect(Collectors.toList());
			
			if (logger.isDebugEnabled()) {
				logger.debug("90190263 일반.모임.회원별.회비.면제.취소.수정 SVC 회비면제 대상 List 분류 iMbpfXmpList {} ::: ",iMbpfXmpList);
			}
			
			// 회비면제취소 대상 - 회비면제취소
			if(iMbpfXmpCancList.size() > 0) {
				
				MetPbokTrnPrts_DIDT iTrnPrts = new MetPbokTrnPrts_DIDT();
				MetPbokTrnPrts_DODT oTrnPrts = new MetPbokTrnPrts_DODT();
				List<MetPbokTrnPrtsGrid> gridTrnPrts = new ArrayList<MetPbokTrnPrtsGrid>();
				
				String nxtTrnDt = WFDateUtils.getDateFrom("yyyyMMdd", 1);
				int nxtTrnSrno = 0;
				boolean nxtDataYn = true;
				
				while(nxtDataYn) {
					iTrnPrts.setInqDis("06"); // 조회구분 [05] 거래일자 순차 / [06] 거래일자 역순 / [15] 기타입금내역 순차 / [16] 기타 입금내역 역순차
					iTrnPrts.setMetMngNo(input.getMetMngNo()); // 모임관리번호
					iTrnPrts.setInqStaDt((WFDateUtils.getDate("yyyyMM") + "01")); // 조회시작일자
					iTrnPrts.setInqStaTrnSrno(0); // 조회시작거래일련번호
					iTrnPrts.setInqEndDt(nxtTrnDt); // 조회종료일자
					iTrnPrts.setInqEndTrnSrno(nxtTrnSrno); // 조회종료거래일련번호
					iTrnPrts.setRapDscd("1"); // 입지급구분코드
					
					if (logger.isDebugEnabled()) {
						logger.debug("90190263 일반.모임.회원별.회비.면제.수정 SVC 회원별 회비 입금 Input {} :: ",iTrnPrts);
					}
					
					oTrnPrts = new MetPbokTrnPrts_DODT();
					oTrnPrts = mPBMetPbokFncTrnMng_COM.selectMetPbokTrnPrts(iTrnPrts);
					
					if (logger.isDebugEnabled()) {
						logger.debug("90190263 일반.모임.회원별.회비.면제.수정 SVC 회원별 회비 입금 Output {} :: ",oTrnPrts);
					}
					
					for( MetPbokTrnPrtsGrid filterTrnPrts : oTrnPrts.getGrid()   ) {
						//모임거래상태코드 : [02] 회비면제
						if("02".equals(filterTrnPrts.getMetTrnStcd() )) {
							gridTrnPrts.add( filterTrnPrts );
						}
					}
					
					
					if (logger.isDebugEnabled()) {
						logger.debug("90190263 일반.모임.회원별.회비.면제.수정 SVC 다음조회 값 nxtTrnDt {} / nxtTrnSrno {} :: ",nxtTrnDt, nxtTrnSrno);
					}
					
					
					nxtTrnDt = oTrnPrts.getNxtTrnDt();
					nxtTrnSrno = oTrnPrts.getNxtTrnSrno();
					
					if( StringUtils.isEmpty(oTrnPrts.getNxtTrnDt()) ) {
						nxtDataYn = false;
						
						break;
					} else {
						if( StringUtils.isEmpty(nxtTrnDt)  ) {
							nxtDataYn = false;
							break;
						}
					}
				}
				
				if (logger.isDebugEnabled()) {
					logger.debug("90190263 일반.모임.회원별.회비.면제.수정 SVC 회원별 회비 입금 gridTrnPrts {} :: ",gridTrnPrts);
				}
				
				MetPbokTrnPrtsGrid filterTrnPrts = new MetPbokTrnPrtsGrid();
				
				for(MPBByMbhMbpfXmpGrid_DTO iMbpfXmpData : iMbpfXmpCancList) {
					filterTrnPrts = new MetPbokTrnPrtsGrid();
					
					//모임거래상태코드 : [02] 회비면제
					filterTrnPrts = oTrnPrts.getGrid().stream()
																.filter(item -> iMbpfXmpData.getMetMbhSrno().equals(item.getMetMbhSrno()))
																.findFirst()
																.orElse(filterTrnPrts);
					if(StringUtils.isEmpty(filterTrnPrts.getTrnDt()) ) {
						String msgTxt = "";
						StringBuffer msgTxt_BUFFER = new StringBuffer();
						msgTxt_BUFFER.append(filterTrnPrts.getRcvMbhNm()); 
						msgTxt_BUFFER.append( "면제 취소를 위한 원거래를 찾을 수 없습니다.");
						msgTxt = msgTxt_BUFFER.toString();
						
						throw new WFApplicationException("FNSE0006", null, new Object[] {"9999", msgTxt});
					} else {
						inputData = new IBSMR0005785_GRID_IDT();
						inputData.setTrnDt( filterTrnPrts.getTrnDt() ); // 거래일자
						inputData.setTrnSrno(filterTrnPrts.getTrnSrno()); // 거래일련번호
						inputData.setRcvMbhNm(filterTrnPrts.getRcvMbhNm()); // 입금회원명
						inputData.setMetTrnMemoTxt(filterTrnPrts.getMetTrnMemoTxt()); // 모임거래메모내용
						inputData.setMetMbpfXmpAm(filterTrnPrts.getTrnAm()); // 모임회비면제금액
						
						inputDataList.add(inputData);
					}
				} // for : end
				
				iIBSMR0005785.setMetChgDscd("45"); // 모임변경구분코드 [45] 회비면제 취소
				iIBSMR0005785.setCnt(inputDataList.size()); // 건수
				iIBSMR0005785.setGrid(inputDataList);
				
				if (logger.isDebugEnabled()) {
					logger.debug("90190263 일반.모임.회원별.회비.면제.취소.수정 iIBSMR0005785 {} ::: ",iIBSMR0005785);
				}
				
				WFInfResponse<IBSMR0005785_ODT> mcaOutput = sHRIBSMR0005785_COM.callTrx(iIBSMR0005785, interfaceCfg);
				
				oIBSMR0005785 = mcaOutput.getResponseData();
				
				if (logger.isDebugEnabled()) {
					logger.debug("90190263 일반.모임.회원별.회비.면제.취소.수정 oIBSMR0005785 {} ::: ",oIBSMR0005785);
				}
				
				for (IBSMR0005785_GRID_ODT oIBSMR0005785ListData : oIBSMR0005785.getGrid()) {
					IBSMR0005785_GRID_ODT outXmpCancData = new IBSMR0005785_GRID_ODT();
					
					outXmpCancData.setTrnDt(oIBSMR0005785ListData.getTrnDt()); // 거래일자
					outXmpCancData.setTrnSrno(oIBSMR0005785ListData.getTrnSrno()); // 거래일련번호
					outXmpCancData.setRcvMbhNm(oIBSMR0005785ListData.getRcvMbhNm()); // 입금회원명
					outXmpCancData.setMetTrnMemoTxt(oIBSMR0005785ListData.getMetTrnMemoTxt()); // 모임거래메모내용
					outXmpCancData.setMetMbpfXmpAm(oIBSMR0005785ListData.getMetMbpfXmpAm()); // 모임회비면제금액
					
					oIBSMR0005785List.add(outXmpCancData);
				}
			}
			
			// 회비면제 대상 - 회비면제
			if(iMbpfXmpList.size() > 0) {			 
				iIBSMR0005785.setMetChgDscd("43"); // 모임변경구분코드 [43] 회비면제
				iIBSMR0005785.setCnt(iMbpfXmpList.size()); // 건수
				inputDataList = new ArrayList<>();
				for(MPBByMbhMbpfXmpGrid_DTO iMbpfXmpData : iMbpfXmpList) {
					inputData = new IBSMR0005785_GRID_IDT();
					inputData.setTrnDt(iMbpfXmpData.getTrnDt()); // 거래일자
					inputData.setTrnSrno(iMbpfXmpData.getTrnSrno()); // 거래일련번호
					inputData.setRcvMbhNm(iMbpfXmpData.getRcvMbhNm()); // 입금회원명
					inputData.setMetTrnMemoTxt(iMbpfXmpData.getMetTrnMemoTxt()); // 모임거래메모내용
					inputData.setMetMbpfXmpAm(iMbpfXmpData.getMetMbpfXmpAm()); // 모임회비면제금액
					
					inputDataList.add(inputData);
				}
				iIBSMR0005785.setGrid(inputDataList);
				
				if (logger.isDebugEnabled()) {
					logger.debug("90190263 일반.모임.회원별.회비.면제.수정 iIBSMR0005785 {} ::: ",iIBSMR0005785);
				}
				
				WFInfResponse<IBSMR0005785_ODT> mcaOutput = sHRIBSMR0005785_COM.callTrx(iIBSMR0005785, interfaceCfg);

				oIBSMR0005785 = mcaOutput.getResponseData();
				
				if (logger.isDebugEnabled()) {
					logger.debug("90190263 일반.모임.회원별.회비.면제.수정 oIBSMR0005785 {} ::: ",oIBSMR0005785);
				}
				
				for (IBSMR0005785_GRID_ODT oIBSMR0005785ListData : oIBSMR0005785.getGrid()) {
					IBSMR0005785_GRID_ODT outXmpData = new IBSMR0005785_GRID_ODT();

					outXmpData.setTrnDt(oIBSMR0005785ListData.getTrnDt()); // 거래일자
					outXmpData.setTrnSrno(oIBSMR0005785ListData.getTrnSrno()); // 거래일련번호
					outXmpData.setRcvMbhNm(oIBSMR0005785ListData.getRcvMbhNm()); // 입금회원명
					outXmpData.setMetTrnMemoTxt(oIBSMR0005785ListData.getMetTrnMemoTxt()); // 모임거래메모내용
					outXmpData.setMetMbpfXmpAm(oIBSMR0005785ListData.getMetMbpfXmpAm()); // 모임회비면제금액
					
					oIBSMR0005785List.add(outXmpData);
				}
				
			}
			
			output.setMetChgDscd(oIBSMR0005785.getMetChgDscd()); // 모임변경구분코드
			output.setMetChgDscdNm(oIBSMR0005785.getMetChgDscdNm()); // 모임변경구분코드명
			output.setMetMngNo(oIBSMR0005785.getMetMngNo()); // 모임관리번호
			output.setCnt(oIBSMR0005785List.size()); // 건수

			// 회원별.회비.면제.공통.Sub.IO
			List<MPBByMbhMbpfXmpGrid_DTO> outDataList = new ArrayList<>();
			for (IBSMR0005785_GRID_ODT oMbpfXmpData : oIBSMR0005785List) {
				MPBByMbhMbpfXmpGrid_DTO outData = new MPBByMbhMbpfXmpGrid_DTO();

				outData.setTrnDt(oMbpfXmpData.getTrnDt()); // 거래일자
				outData.setTrnSrno(oMbpfXmpData.getTrnSrno()); // 거래일련번호
				outData.setRcvMbhNm(oMbpfXmpData.getRcvMbhNm()); // 입금회원명
				outData.setMetTrnMemoTxt(oMbpfXmpData.getMetTrnMemoTxt()); // 모임거래메모내용
				outData.setMetMbpfXmpAm(oMbpfXmpData.getMetMbpfXmpAm()); // 모임회비면제금액
				
				outDataList.add(outData);
			}
			output.setGrid(outDataList);
		}catch(Exception e){
			logger.error("updateGenMetByMbhMbpfXmp Exception ::: {}", e);
			
			if ( e instanceof SFAdaptorApplicationException ) {
				SFAdaptorApplicationException se = (SFAdaptorApplicationException) e;
				logger.error("SFAdaptorApplicationException {} ", se);
				
				Object[] args = se.getArguments();
	            
	            if(args != null && args.length>0) {
	            	errMsgTxt = args[0].toString();
				}
	            errMsgId = se.getCode();
	            
			} else if ( e instanceof SFInterfaceSystemException ) {
				SFInterfaceSystemException se = (SFInterfaceSystemException) e;
				logger.error("SFInterfaceSystemException {} ", se);
				errMsgId = se.getMsgId();
				errMsgTxt = se.getMainMsgTxt();
	
			} else if ( e instanceof WFApplicationException) {
				WFApplicationException we = (WFApplicationException) e;
				logger.error("WFApplicationException {} ", we);

				Object[] args = we.getArguments();
				
	            if(args != null && args.length>0) {
	            	errMsgTxt = args[0].toString();
	            	errMsgId = args[1].toString();
				}else {
					errMsgId = we.getCode();
					errMsgTxt = we.getMessage();
				}
			} else {
				logger.error("Exception {} ", e);
				errMsgId = "9999";
				errMsgTxt = e.getMessage();				
			}
			
			throw new WFApplicationException("FNSE0006", null, new Object[] {errMsgId, errMsgTxt});
		}
		

		return output;

	}

	/**
	 * 모임통장의 이체요청 내역 정보를 조회하는 서비스
	 * 
	 * @param input
	 *            이체요청.정보.조회.컨트롤러.입력.IO
	 * @return 이체요청.정보.조회.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName = "이체요청.내역.정보.조회", description = "모임통장의 이체요청 내역 정보를 조회하는 서비스", author = "90190263")
	public MPBMetPbokFncTrnMngSelectTsReqPrtsInf_ODT selectTsReqPrtsInf(
			MPBMetPbokFncTrnMngSelectTsReqPrtsInf_IDT input) {
		/**
		 * @BXMType GetBean
		 */
		mPBMetPbokFncTrnMng_COM = WFApplicationContext.getBean(mPBMetPbokFncTrnMng_COM, MPBMetPbokFncTrnMng_COM.class);

		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokFncTrnMngSelectTsReqPrtsInf_ODT output = new MPBMetPbokFncTrnMngSelectTsReqPrtsInf_ODT();

		if (logger.isDebugEnabled()) {
			logger.debug("90190263 이체요청.내역.정보.조회 SVC input {} :: ", input);
		}

		/*
		 * 로직 추가
		 */
		List<MET_PBOK_MBPF_TS_REQ_INF001SelectAllTsReqInf_DODT> oTsReqInfAllList = new ArrayList<MET_PBOK_MBPF_TS_REQ_INF001SelectAllTsReqInf_DODT>();
		List<MET_PBOK_MBPF_TS_REQ_INF001SelectMbhTsReqInf_DODT> oTsReqInfMbhList = new ArrayList<MET_PBOK_MBPF_TS_REQ_INF001SelectMbhTsReqInf_DODT>();

		if ("1".equals(input.getMetMbhDscd())) { // 모임회원구분코드 : [1] 모임대표
			MET_PBOK_MBPF_TS_REQ_INF001SelectAllTsReqInf_DIDT iTsReqMetAllInf = new MET_PBOK_MBPF_TS_REQ_INF001SelectAllTsReqInf_DIDT();
			iTsReqMetAllInf.setNxtTsReqDt(input.getNxtTsReqDt()); // 다음이체요청일자
			iTsReqMetAllInf.setNxtTsReqTm(input.getNxtTsReqTm()); // 다음시간
			iTsReqMetAllInf.setNxtTsReqMbhSrno(input.getNxtTsReqMbhSrno()); // 다음이체요청회원일련번호
			iTsReqMetAllInf.setNxtTsReqSrno(input.getNxtTsReqSrno()); // 다음이체요청일련번호
			iTsReqMetAllInf.setInqCnt(input.getInqCnt()); // 조회건수
			iTsReqMetAllInf.setMetMngNo(input.getMetMngNo()); // 모임관리번호
			iTsReqMetAllInf.setTsReqDelYn(input.getTsReqDelYn()); // 이체요청삭제여부

			if (logger.isDebugEnabled()) {
				logger.debug("90190263 전체.이체요청.내역.정보.조회 SVC iTsReqMetAllInf {} :: ",iTsReqMetAllInf);
			}

			/*
			 * @BXMType ComponentCall 모임통장.금융거래.관리.컴포넌트 전체.이체요청.내역.정보.조회
			 */
			// com.skbank.sml.fns.mpb.com.MPBMetPbokFncTrnMng_COM
			oTsReqInfAllList = mPBMetPbokFncTrnMng_COM.selectAllTsReqPrtsInf(iTsReqMetAllInf);
		} else { // [2] 모임원
			MET_PBOK_MBPF_TS_REQ_INF001SelectMbhTsReqInf_DIDT iTsReqMbhInf = new MET_PBOK_MBPF_TS_REQ_INF001SelectMbhTsReqInf_DIDT();
			iTsReqMbhInf.setNxtTsReqDt(input.getNxtTsReqDt()); // 다음이체요청일자
			iTsReqMbhInf.setNxtTsReqTm(input.getNxtTsReqTm()); // 다음시간
			iTsReqMbhInf.setNxtTsReqMbhSrno(input.getNxtTsReqMbhSrno()); // 다음이체요청회원일련번호
			iTsReqMbhInf.setNxtTsReqSrno(input.getNxtTsReqSrno()); // 다음이체요청일련번호
			iTsReqMbhInf.setInqCnt(input.getInqCnt()); // 조회건수
			iTsReqMbhInf.setMetMngNo(input.getMetMngNo()); // 모임관리번호
			iTsReqMbhInf.setTsReqMbhSrno(input.getTsReqMbhSrno()); // 이체요청회원일련번호
			iTsReqMbhInf.setTsReqDelYn(input.getTsReqDelYn()); // 이체요청삭제여부

			if (logger.isDebugEnabled()) {
				logger.debug("90190263 회원.이체요청.내역.정보.조회 SVC input {} :: ",iTsReqMbhInf);
			}

			/*
			 * @BXMType ComponentCall 모임통장.금융거래.관리.컴포넌트 모임원.이체요청.내역.정보.조회
			 */
			// com.skbank.sml.fns.mpb.com.MPBMetPbokFncTrnMng_COM
			oTsReqInfMbhList = mPBMetPbokFncTrnMng_COM.selectMbhTsReqPrtsInf(iTsReqMbhInf);
		}
		/**
		 * @BXMType IF 이체요청 내역 정상조회 여부
		 */
		List<MPBTsReqInfListInq_ODT> outDataList = new ArrayList<>();

		int i = 0;
		if ("1".equals(input.getMetMbhDscd()) && oTsReqInfAllList.size() > 0) {
			for (MET_PBOK_MBPF_TS_REQ_INF001SelectAllTsReqInf_DODT oTsReqData : oTsReqInfAllList) {
				MPBTsReqInfListInq_ODT outData = new MPBTsReqInfListInq_ODT();

				if (logger.isDebugEnabled()) {
					logger.debug("90190263 회원.이체요청.내역.정보.조회 SVC i {} oTsReqData {} :: ", oTsReqData);
				}

				if (input.getInqCnt() > i) {
					outData.setMetMngNo(oTsReqData.getMetMngNo()); // 모임관리번호
					outData.setTsReqDt(oTsReqData.getTsReqDt()); // 이체요청일자
					outData.setTsReqMbhSrno(oTsReqData.getTsReqMbhSrno()); // 이체요청회원일련번호
					outData.setTsReqSrno(oTsReqData.getTsReqSrno()); // 이체요청일련번호
					outData.setTsReqMbhNm(oTsReqData.getTsReqMbhNm()); // 이체요청회원명
					outData.setTsReqBkcd(oTsReqData.getTsReqBkcd()); // 이체요청은행코드
					outData.setTsReqAcno(oTsReqData.getTsReqAcno()); // 이체요청계좌번호
					outData.setTsReqAm(oTsReqData.getTsReqAm()); // 이체요청금액
					outData.setTsCmplAm(oTsReqData.getTsCmplAm()); // 이체완료금액
					outData.setMetTsReqStcd(oTsReqData.getMetTsReqStcd()); // 모임이체요청상태코드
					outData.setApvReqStcd(oTsReqData.getApvReqStcd()); // 승인요청상태코드
					outData.setTsReqTm(oTsReqData.getTsReqTm()); // 이체요청시각
					outData.setMetChifMbhSrno(oTsReqData.getMetChifMbhSrno()); // 모임장회원일련번호
					outData.setRvactOwacNm(oTsReqData.getRvactOwacNm()); // 입금계좌예금주명
					outData.setTsReqMemoTxt(oTsReqData.getTsReqMemoTxt()); // 이체요청메모내용
					outData.setTsReqDelYn(oTsReqData.getTsReqDelYn()); // 이체요청삭제여부
					outData.setMetTsReqDscd(oTsReqData.getMetTsReqDscd()); // 모임이체요청구분코드
					outData.setTrnSrno(oTsReqData.getTrnSrno()); // 거래일련번호
					outData.setTrnDt(oTsReqData.getTrnDt()); // 거래일자

					outDataList.add(outData);
				} else {
					output.setNxtTsReqDt(oTsReqData.getTsReqDt());
					output.setNxtTsReqTm(oTsReqData.getTsReqTm());
					output.setNxtTsReqMbhSrno(oTsReqData.getTsReqMbhSrno());
					output.setNxtTsReqSrno(oTsReqData.getTsReqSrno());
					break;
				}
				i++;
			}

			// 다음조회키값 셋팅
			output.setGrid(outDataList);
			output.setGridCnt(outDataList.size()); // 그리드건수
		} else if ("2".equals(input.getMetMbhDscd())
				&& oTsReqInfMbhList.size() > 0) {

			for (MET_PBOK_MBPF_TS_REQ_INF001SelectMbhTsReqInf_DODT oTsReqData : oTsReqInfMbhList) {
				MPBTsReqInfListInq_ODT outData = new MPBTsReqInfListInq_ODT();

				if (logger.isDebugEnabled()) {
					logger.debug("90190263 회원.이체요청.내역.정보.조회 SVC i {} oTsReqData {} :: ", oTsReqData);
				}

				if (input.getInqCnt() > i) {
					outData.setMetMngNo(oTsReqData.getMetMngNo()); // 모임관리번호
					outData.setTsReqDt(oTsReqData.getTsReqDt()); // 이체요청일자
					outData.setTsReqMbhSrno(oTsReqData.getTsReqMbhSrno()); // 이체요청회원일련번호
					outData.setTsReqSrno(oTsReqData.getTsReqSrno()); // 이체요청일련번호
					outData.setTsReqMbhNm(oTsReqData.getTsReqMbhNm()); // 이체요청회원명
					outData.setTsReqBkcd(oTsReqData.getTsReqBkcd()); // 이체요청은행코드
					outData.setTsReqAcno(oTsReqData.getTsReqAcno()); // 이체요청계좌번호
					outData.setTsReqAm(oTsReqData.getTsReqAm()); // 이체요청금액
					outData.setTsCmplAm(oTsReqData.getTsCmplAm()); // 이체완료금액
					outData.setMetTsReqStcd(oTsReqData.getMetTsReqStcd()); // 모임이체요청상태코드
					outData.setApvReqStcd(oTsReqData.getApvReqStcd()); // 승인요청상태코드
					outData.setTsReqTm(oTsReqData.getTsReqTm()); // 이체요청시각
					outData.setMetChifMbhSrno(oTsReqData.getMetChifMbhSrno()); // 모임장회원일련번호
					outData.setRvactOwacNm(oTsReqData.getRvactOwacNm()); // 입금계좌예금주명
					outData.setTsReqMemoTxt(oTsReqData.getTsReqMemoTxt()); // 이체요청메모내용
					outData.setTsReqDelYn(oTsReqData.getTsReqDelYn()); // 이체요청삭제여부
					outData.setMetTsReqDscd(oTsReqData.getMetTsReqDscd()); // 모임이체요청구분코드
					outData.setTrnSrno(oTsReqData.getTrnSrno()); // 거래일련번호
					outData.setTrnDt(oTsReqData.getTrnDt()); // 거래일자

					outDataList.add(outData);
				} else {
					output.setNxtTsReqDt(oTsReqData.getTsReqDt());
					output.setNxtTsReqTm(oTsReqData.getTsReqTm());
					output.setNxtTsReqMbhSrno(oTsReqData.getTsReqMbhSrno());
					output.setNxtTsReqSrno(oTsReqData.getTsReqSrno());
					break;
				}
				i++;
			}

			// 다음조회키값 셋팅
			output.setGrid(outDataList);
			output.setGridCnt(outDataList.size()); // 그리드건수
		}

		if (logger.isDebugEnabled()) {
			logger.debug("90190263 회원.이체요청.내역.정보.조회 SVC output {} :: ", output);
		}

		return output;

	}

	/**
	 * 이체요청을 하기전 올바른 계좌인지 수취인에 정보를 조회하는 서비스
	 * 
	 * @param input
	 *            이체.요청.수취인.정보.조회.컨트롤러.입력.IO
	 * @return 이체.요청.수취인.정보.조회.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName = "이체.요청.수취인.정보.조회", description = "이체요청을 하기전 올바른 계좌인지 수취인에 정보를 조회하는 서비스", author = "90190263")
	public MPBMetPbokFncTrnMngSelectTsReqRnpeInf_ODT selectTsReqRnpeInf(MPBMetPbokFncTrnMngSelectTsReqRnpeInf_IDT input) {
		/**
		 * @BXMType GetBean
		 */
		mPBMetPbokFncTrnMng_COM = WFApplicationContext.getBean(mPBMetPbokFncTrnMng_COM, MPBMetPbokFncTrnMng_COM.class);
		mPBMetPbokBscMng_COM = WFApplicationContext.getBean(mPBMetPbokBscMng_COM, MPBMetPbokBscMng_COM.class);
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		sHRRnpeFnmInq_COM = WFApplicationContext.getBean(sHRRnpeFnmInq_COM,SHRRnpeFnmInq_COM.class);
		
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession();

		MPBMetPbokFncTrnMngSelectTsReqRnpeInf_ODT output = new MPBMetPbokFncTrnMngSelectTsReqRnpeInf_ODT();
		/*************************************************************
		 * 모임통장기본정보 조회
		 * 
		 * 거래구분 [02] -> 해당 모임관리번호의 정보 조회 모임관리번호를 통해 해당 모임의 실계좌번호로 수취인 조회 진행
		 **************************************************************/
		String rcvBkwAcno = ""; // 모임통장 모임장의 계좌번호
		MetPbokBscInfInq_DIDT iMetPbokBsc = new MetPbokBscInfInq_DIDT();
		iMetPbokBsc.setInqDis("02"); // 거래구분 02
		iMetPbokBsc.setMetMngNo(input.getMetMngNo()); // 모임관리번호
		iMetPbokBsc.setNxtMetMngNo(""); // 다음모임관리번호
		MetPbokBscInfInq_DODT oMetPbokBsc = mPBMetPbokBscMng_COM.selectMetPbokBscInf(iMetPbokBsc);

		if (logger.isDebugEnabled()) {
			logger.debug("90190263 이체.요청.수취인.정보.조회 SVC 모임통장기본정보조회 oMetPbokBsc {} :: ", oMetPbokBsc);
		}

		for (MetPbokBscInfGrid oMetPbokBscData : oMetPbokBsc.getGrid()) {
			rcvBkwAcno = oMetPbokBscData.getRcvBkwAcno();
			
			output.setRcvBkwAcno(rcvBkwAcno);
			break;
		}
		
		String errMsgTxt = "";
		String errMsgId = "";
		try {
			SHRRnpeNmInqInp_DTO shrRnpeNmDto = new SHRRnpeNmInqInp_DTO();

			shrRnpeNmDto.setWdrBkcd("020"); // 출금은행코드
			shrRnpeNmDto.setWdrAcno(rcvBkwAcno); // 출금계좌번호
			shrRnpeNmDto.setTrnAm(input.getTsReqAm()); // 거래금액
			shrRnpeNmDto.setRcvBkcd(input.getTsReqBkcd()); // 입금은행코드
			shrRnpeNmDto.setRcvAcno(input.getTsReqAcno()); // 입금계좌번호
			shrRnpeNmDto.setUserId(currentCust.getUserId()); // 사용자ID
			shrRnpeNmDto.setItcsno(currentCust.getItcsno()); // 통합고객번호
			shrRnpeNmDto.setFdtsYn("Y"); // 자금이체여부
			shrRnpeNmDto.setFrqntRgsSelYn("N"); // 자주쓰는계좌등록조회여부


			if (logger.isDebugEnabled()) {
				logger.debug("90190263 이체.요청.수취인.정보.조회 SVC 수취인조회 shrRnpeNmDto {} :: ", shrRnpeNmDto);
			}

			SHRRnpeNmInqOup_DTO shrRnpeNmOutDto = sHRRnpeFnmInq_COM.selectRnpeNm(shrRnpeNmDto);

			if (logger.isDebugEnabled()) {
				logger.debug("90190263 이체.요청.수취인.정보.조회 SVC 수취인조회 shrRnpeNmOutDto {} :: ", shrRnpeNmOutDto);
			}
			
			if (!ObjectUtils.isEmpty(shrRnpeNmOutDto)) {
				output.setRnpeFnm(shrRnpeNmOutDto.getRnpeFnm()); // 수취인성명
				output.setRscd(shrRnpeNmOutDto.getErrMsgId()); // 오류메시지ID
				output.setRspTxt(shrRnpeNmOutDto.getErrMsgTxt()); // 오류메시지내용
			}
		}catch(WFApplicationException e){
			logger.error("updateGenMetByMbhMbpfXmp WFApplicationException 오류 msgID | errorMsg | : [{}], [{}] [{}] ",e.getCode(), e.getMessage());
			Object[] args = e.getArguments();
            
	        String rtcdTxt = "";
	        if(args != null && args.length>0) {
	        	rtcdTxt = args[0].toString();
			}

			output.setRscd(e.getCode());
			output.setRspTxt(rtcdTxt);
		}catch(Exception e){
			logger.error("updateGenMetByMbhMbpfXmp Exception ::: {}", e);
			if ( e instanceof SFAdaptorApplicationException ) {
				SFAdaptorApplicationException se = (SFAdaptorApplicationException) e;
				logger.error("SFAdaptorApplicationException {} ", se);
				
				Object[] args = se.getArguments();
	            
	            if(args != null && args.length>0) {
	            	errMsgTxt = args[0].toString();
				}
	            errMsgId = se.getCode();
	            
			} else if ( e instanceof SFInterfaceSystemException ) {
				SFInterfaceSystemException se = (SFInterfaceSystemException) e;
				logger.error("SFInterfaceSystemException {} ", se);
				errMsgId = se.getMsgId();
				errMsgTxt = se.getMainMsgTxt();
	
			} else if ( e instanceof WFApplicationException) {
				WFApplicationException we = (WFApplicationException) e;
				logger.error("WFApplicationException {} ", we);

				Object[] args = we.getArguments();
				
	            if(args != null && args.length>0) {
	            	errMsgTxt = args[0].toString();
	            	errMsgId = args[1].toString();
				}else {
					errMsgId = we.getCode();
					errMsgTxt = we.getMessage();
				}
			} else {
				logger.error("Exception {} ", e);
				errMsgTxt = "수취인 조회중 에러가 발생하였습니다.";
				errMsgId = "BSCE0035";
			}
			
			output.setRscd(errMsgId);
			output.setRspTxt(errMsgTxt);
		}
		
		return output;
	}
	/**
	 * 모임통장의 모임원이 모임장에게 이체요청을 등록하는 서비스
	 * 
	 * @param input
	 *            이체요청.정보.등록.컨트롤러.입력.IO
	 * @return 이체요청.정보.등록.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName = "이체요청.내역.정보.등록", description = "모임통장의 모임원이 모임장에게 이체요청을 등록하는 서비스", author = "90190263")
	public MPBMetPbokFncTrnMngInsertTsReqPrtsInf_ODT insertTsReqPrtsInf(MPBMetPbokFncTrnMngInsertTsReqPrtsInf_IDT input) {

		/**
		 * @BXMType GetBean
		 */
		mPBMetPbokFncTrnMng_COM = WFApplicationContext.getBean(mPBMetPbokFncTrnMng_COM, MPBMetPbokFncTrnMng_COM.class);
		mPBMetPbokMbhMng_COM = WFApplicationContext.getBean(mPBMetPbokMbhMng_COM, MPBMetPbokMbhMng_COM.class);
		mPBMetPbokBscMng_COM= WFApplicationContext.getBean(mPBMetPbokBscMng_COM, MPBMetPbokBscMng_COM.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokFncTrnMngInsertTsReqPrtsInf_ODT output = new MPBMetPbokFncTrnMngInsertTsReqPrtsInf_ODT();

		if (logger.isDebugEnabled()) {
			logger.debug("90190263 이체요청.내역.정보.등록 SVC input {} :: ", input);
		}
		
		String errMsgTxt = "";
		int insertCnt = 0;
		try {
			/*************************************************************
			 * 회원정보조회
			 * 
			 * 이체요청 내역을 관리하기 위해 회원정보로 이체요청당시의 모임장의 일련번호를 가져온다. 거래구분 03 - 모임관리번호의
			 * 해당하는 회원목록을 조회한다.
			 **************************************************************/
			MetPbokMbhInfListInq_DODT metRppeData = new MetPbokMbhInfListInq_DODT(); // 모임대표데이터
	
			MetPbokMbhInfInq_DIDT iMetPbokMbh = new MetPbokMbhInfInq_DIDT();
			iMetPbokMbh.setInqDis("03"); // 조회구분
			iMetPbokMbh.setMetMngNo(input.getMetMngNo()); // 모임관리번호
	
			if (logger.isDebugEnabled()) {
				logger.debug("90190263 이체요청.내역.정보.등록 회원정보조회 SVC iMetPbokMbh {} :: ",iMetPbokMbh);
			}
	
			MetPbokMbhInfInq_DODT oMetPbokMbh = mPBMetPbokMbhMng_COM.selectMetPbokMbhInf(iMetPbokMbh);
	
			if (logger.isDebugEnabled()) {
				logger.debug("90190263 이체요청.내역.정보.등록 필터링 회원 SVC {} :: ",metRppeData = (MetPbokMbhInfListInq_DODT) oMetPbokMbh.getGrid().stream()
																																														.filter(x -> "1".equals(x.getMetMbhDscd()))
																																														.findFirst()
																																														.orElseThrow(() -> new IllegalArgumentException()));
			}
	
			metRppeData = oMetPbokMbh.getGrid().stream()
																.filter(x -> "1".equals(x.getMetMbhDscd())).findFirst()
																.orElseThrow(() -> new IllegalArgumentException());
	
			if (logger.isDebugEnabled()) {
				logger.debug("90190263 이체요청.내역.정보.등록 회원정보조회 SVC metRppeData {} :: ",metRppeData);
			}
	
			/*************************************************************
			 * 이체요청 정보 등록
			 **************************************************************/
			MET_PBOK_MBPF_TS_REQ_INF001InsertTsReqInf_DIDT iTsReqInf = new MET_PBOK_MBPF_TS_REQ_INF001InsertTsReqInf_DIDT();
	
			iTsReqInf.setMetMngNo(input.getMetMngNo()); // 모임관리번호
			iTsReqInf.setTsReqDt(input.getTsReqDt()); // 이체요청일자
			iTsReqInf.setTsReqMbhSrno(input.getTsReqMbhSrno()); // 이체요청회원일련번호
			iTsReqInf.setTsReqMbhNm(input.getTsReqMbhNm()); // 이체요청회원명
			iTsReqInf.setTsReqBkcd(input.getTsReqBkcd()); // 이체요청은행코드
			iTsReqInf.setTsReqAcno(input.getTsReqAcno()); // 이체요청계좌번호
			iTsReqInf.setTsReqAm(input.getTsReqAm()); // 이체요청금액
			iTsReqInf.setTsCmplAm(0); // 완료금액
			iTsReqInf.setMetTsReqStcd("1");// 모임이체요청상태코드 1이체요청/2 이체중/3이체완료/4이체거절 /5이체취소
			iTsReqInf.setApvReqStcd("1");// 승인요청상태코드 1승인요청/2 승인완료/3 승인거절/4 사후승인/5승인취소
			iTsReqInf.setTsReqTm(WFDateUtils.getTimeNow());// 이체요청시각
			iTsReqInf.setMetChifMbhSrno(metRppeData.getMetMbhSrno());// 모임장회원일련번호
			iTsReqInf.setRvactOwacNm(input.getRvactOwacNm());// 입금계좌예금주명
			iTsReqInf.setTsReqMemoTxt(input.getTsReqMemoTxt()); // 이체요청메모내용
			iTsReqInf.setTsReqDelYn("N");// 이체요청삭제여부
			iTsReqInf.setMetTsReqDscd(input.getMetTsReqDscd()); // 모임이체요청구분코드
			iTsReqInf.setTrnSrno(input.getTrnSrno()); // 거래일련번호
			iTsReqInf.setTrnDt(input.getTrnDt()); // 거래일자
			iTsReqInf.setRlfAcno(input.getRlfAcno()); // 안심계좌번호
			iTsReqInf.setLstDbChgId(""); // 최종DB변경ID 
			iTsReqInf.setLstDbChgDtm(WFDateUtils.getDateTimeNow()); // 최종DB변경일시
	 
			if (logger.isDebugEnabled()) {
				logger.debug("90190263 이체요청.내역.정보.등록 SVC iTsReqInf {} :: ",iTsReqInf);
			}
	
			/*
			 * @BXMType ComponentCall 모임통장.금융거래.관리.컴포넌트 이체요청.내역.정보.등록
			 */
			// com.skbank.sml.fns.mpb.com.MPBMetPbokFncTrnMng_COM
			insertCnt = mPBMetPbokFncTrnMng_COM.insertTsReqPrtsInf(iTsReqInf);
	
			if (insertCnt <= 0) {
				output.setRspMsgTxt("이체요청 내역 정보 등록 중 오류가 발생했습니다.");
				throw new WFApplicationException("FNSE0003", new Object[]{""});
			} else {
				output.setRspRtcd("0000");
				output.setRspMsgTxt("정상 처리 되었습니다.");
				
			}
		}catch(Exception e){
			logger.error("insertTsReqPrtsInf Exception ::: {}", e);
			
			if ( e instanceof WFApplicationException) {
				WFApplicationException we = (WFApplicationException) e;
				logger.error("WFApplicationException {} ", we);
				
				Object[] args = we.getArguments();
	            
				if(args != null && args.length>0) {
	            	errMsgTxt = args[0].toString();
				} else {
					errMsgTxt = we.getMessage();
				}
			} else {
				logger.error("Exception {} ", e);
				errMsgTxt = e.getMessage();				
			}
			
			throw new WFApplicationException("FNSE0006", null, new Object[] {"9999",errMsgTxt});
		}
		
		if(insertCnt > 0) {
			// PUSH 알림 전송
			MPBMetPbokBscMnginsertMetPbokPushNtfcSndInput_DTO iNtfcSnd = new MPBMetPbokBscMnginsertMetPbokPushNtfcSndInput_DTO();
			
			iNtfcSnd.setUmsTmplCd(SHRMPBCmmConstant.STR_RPWBCESS0132125);
			iNtfcSnd.setMetMngNo(input.getMetMngNo());			// 모임관리번호
			iNtfcSnd.setMetMbhSrno(input.getTsReqMbhSrno());	// 모임회원일련번호
			
			mPBMetPbokBscMng_COM.insertMetPbokPushNtfcSnd(iNtfcSnd);
		}
		
		return output;

	}

	/**
	 * 모임통장의 모임원이 모임장에게 이체요청한 결과를 수정하는 서비스
	 * 
	 * @param input
	 *            이체요청.정보.수정.컨트롤러.입력.IO
	 * @return 이체요청.정보.수정.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName = "이체요청.내역.정보.수정", description = "모임통장의 모임원이 모임장에게 이체요청 결과를 수정하는 서비스", author = "90190263")
	public MPBMetPbokFncTrnMngUpdateTsReqPrtsInf_ODT updateTsReqPrtsInf(MPBMetPbokFncTrnMngUpdateTsReqPrtsInf_IDT input) {

		/**
		 * @BXMType GetBean
		 */
		mPBMetPbokFncTrnMng_COM = WFApplicationContext.getBean(mPBMetPbokFncTrnMng_COM, MPBMetPbokFncTrnMng_COM.class);
		mPBMetPbokMbhMng_COM = WFApplicationContext.getBean(mPBMetPbokMbhMng_COM, MPBMetPbokMbhMng_COM.class);
		mPBMetPbokBscMng_COM= WFApplicationContext.getBean(mPBMetPbokBscMng_COM, MPBMetPbokBscMng_COM.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokFncTrnMngUpdateTsReqPrtsInf_ODT output = new MPBMetPbokFncTrnMngUpdateTsReqPrtsInf_ODT();

		if (logger.isDebugEnabled()) {
			logger.debug("90190263 이체요청.내역.정보.수정 SVC input {} :: ", input);
		}
		String errMsgTxt = "";
		int updateCnt = 0;
		
		try {
			
			/*************************************************************
			 * 이체요청 정보 수정
			 **************************************************************/
			MET_PBOK_MBPF_TS_REQ_INF001UpdateTsReqStcd_DIDT iTsReqAmd = new MET_PBOK_MBPF_TS_REQ_INF001UpdateTsReqStcd_DIDT();
			iTsReqAmd.setMetMngNo(input.getMetMngNo()); // 모임관리번호
			iTsReqAmd.setTsReqDt(input.getTsReqDt()); // 이체요청일자
			iTsReqAmd.setTsReqMbhSrno(input.getTsReqMbhSrno()); // 이체요청회원일련번호
			iTsReqAmd.setTsReqSrno(input.getTsReqSrno()); // 이체요청일련번호
			iTsReqAmd.setTsCmplAm(input.getTsCmplAm()); // 이체완료금액
			iTsReqAmd.setMetTsReqStcd(input.getMetTsReqStcd()); // 모임이체요청상태코드
			iTsReqAmd.setApvReqStcd(input.getApvReqStcd()); // 승인요청상태코드
			iTsReqAmd.setTsReqDelYn(input.getTsReqDelYn()); // 이체요청삭제여부
			iTsReqAmd.setTrnSrno(input.getTrnSrno()); // 거래일련번호
			iTsReqAmd.setLstDbChgId("");// 최종DB변경ID
			iTsReqAmd.setLstDbChgDtm(WFDateUtils.getDateTimeNow());// 최종DB변경일시
	
			
			if (logger.isDebugEnabled()) {
				logger.debug("90190263 이체.승인.등록SVC 승인요청상태코드수정 :: {}", iTsReqAmd);
			}
	
			updateCnt = mPBMetPbokFncTrnMng_COM.updateTsReqStcd(iTsReqAmd);
	
			if (logger.isDebugEnabled()) {
				logger.debug("90190263 이체.승인.등록SVC 승인요청상태코드수정 :: {}", updateCnt);
			}
			
		}catch(Exception e){
			logger.error("updateTsReqPrtsInf Exception ::: {}", e);
		
			if ( e instanceof WFApplicationException) {
				WFApplicationException we = (WFApplicationException) e;
				logger.error("WFApplicationException {} ", we);
				
				Object[] args = we.getArguments();
	            
				if(args != null && args.length>0) {
	            	errMsgTxt = args[0].toString();
				} else {
					errMsgTxt = we.getMessage();
				}
			} else {
				logger.error("Exception {} ", e);
				errMsgTxt = e.getMessage();				
			}
			
			throw new WFApplicationException("FNSE0006", null, new Object[] {"9999", errMsgTxt});
		}
		
		 
		if (updateCnt > 0) {
			// PUSH 알림 전송
			MPBMetPbokBscMnginsertMetPbokPushNtfcSndInput_DTO iNtfcSnd = new MPBMetPbokBscMnginsertMetPbokPushNtfcSndInput_DTO();
			
			iNtfcSnd.setUmsTmplCd(SHRMPBCmmConstant.STR_RPWBCESS0132126);
			iNtfcSnd.setMetMngNo(input.getMetMngNo());
			iNtfcSnd.setMetMbhSrno(input.getTsReqMbhSrno());
			
			mPBMetPbokBscMng_COM.insertMetPbokPushNtfcSnd(iNtfcSnd);
		}
		

		return output;

	}
	

	/**
	 * 모임통장의 모임장이 이체요청, 이체내역을 삭제하는 서비스
	 * 
	 * @param input
	 *            이체요청.정보.삭제.컨트롤러.입력.IO
	 * @return 이체요청.정보.삭제.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName = "이체요청.내역.정보.삭제", description = "모임통장의 모임장이 이체요청, 이체내역을 삭제하는 서비스", author = "90190263")
	public MPBMetPbokFncTrnMngDeleteTsReqprtsinf_ODT deleteTsReqPrtsInf(
			MPBMetPbokFncTrnMngDeleteTsReqprtsinf_IDT input) {

		/**
		 * @BXMType GetBean
		 */
		mPBMetPbokBscMng_COM = WFApplicationContext.getBean(mPBMetPbokBscMng_COM, MPBMetPbokBscMng_COM.class);

		/**
		 * @BXMType GetBean
		 */
		mPBMetPbokFncTrnMng_COM = WFApplicationContext.getBean(mPBMetPbokFncTrnMng_COM, MPBMetPbokFncTrnMng_COM.class);

		/**
		 * @BXMType VariableDeclaration
		 */

		if (logger.isDebugEnabled()) {
			logger.debug("90190263 이체요청.내역.정보.삭제 SVC input {} :: ", input);
		}

		MPBMetPbokFncTrnMngDeleteTsReqprtsinf_ODT output = new MPBMetPbokFncTrnMngDeleteTsReqprtsinf_ODT();

		MET_PBOK_MBPF_TS_REQ_INF001DeleteTsReqInf_DIDT iTsReqInf = new MET_PBOK_MBPF_TS_REQ_INF001DeleteTsReqInf_DIDT();
		/*
		 * 로직 추가
		 */
		try {

			for (MPBTsReqInfDelGrid_IDT iDeleteTsReq : input.getGrid()) {
				iTsReqInf.setMetMngNo(iDeleteTsReq.getMetMngNo()); // 모임관리번호
				iTsReqInf.setTsReqDt(iDeleteTsReq.getTsReqDt()); // 이체요청일자
				iTsReqInf.setTsReqMbhSrno(iDeleteTsReq.getTsReqMbhSrno()); // 이체요청회원일련번호
				iTsReqInf.setTsReqSrno(iDeleteTsReq.getTsReqSrno()); // 이체요청일련번호
				iTsReqInf.setLstDbChgId(""); // 최종DB변경ID
				iTsReqInf.setLstDbChgDtm(WFDateUtils.getDateTimeNow()); // 최종DB변경일시

				if (logger.isDebugEnabled()) {
					logger.debug("90190263 이체요청.내역.정보.삭제 SVC iTsReqInf {} :: ",iTsReqInf);
				}

				/*
				 * @BXMType ComponentCall 모임통장.금융거래.관리.컴포넌트 이체요청.내역.정보.삭제
				 */
				// com.skbank.sml.fns.mpb.com.MPBMetPbokFncTrnMng_COM
				int deleteCnt = mPBMetPbokFncTrnMng_COM.deleteTsReqPrtsInf(iTsReqInf);

				/**
				 * @BXMType IF 이체요청 내역 정상 삭제 여부
				 */
				if (deleteCnt <= 0) /** 코드값이 정상일때 결과코드 리턴 */
				{
					output.setRspRtcd("9999");
					output.setRspMsgTxt("이체요청 내역 정보가 정상적으로 삭제되지 않았습니다.");
				} else {
					output.setRspMsgTxt("정상처리 되었습니다.");
					output.setRspRtcd("0000");
				}

			}
		} catch (Exception e) {
			logger.error("deleteTsReqPrtsInf Exception ::: {}", e);
			output.setRspRtcd("9999");
			output.setRspMsgTxt(e.getMessage());
		}

		return output;

	}

	/**
	 * 모임통장의 이체를 실행/승인 전 계좌 상태를 조회하는 서비스
	 * 
	 * @param input
	 *            계좌.상태.정보.조회.컨트롤러.입력.IO
	 * @return 계좌.상태.정보.조회.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName = "계좌.상태.정보.조회", description = "모임통장의 이체를 실행/승인 전 계좌 상태를 조회하는 서비스", author = "90190263")
	private MPBMetPbokFncTrnMngSelectTsReqRnpeInf_ODT selectAcnoStcdInf(MPBMetPbokFncTrnMngSelectTsReqRnpeInf_IDT input) {
		/**
		 * @BXMType GetBean
		 */
		mPBMetPbokFncTrnMng_COM = WFApplicationContext.getBean(mPBMetPbokFncTrnMng_COM, MPBMetPbokFncTrnMng_COM.class);
		mPBMetPbokBscMng_COM = WFApplicationContext.getBean(mPBMetPbokBscMng_COM, MPBMetPbokBscMng_COM.class);
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);

		MPBMetPbokFncTrnMngSelectTsReqRnpeInf_ODT output = new MPBMetPbokFncTrnMngSelectTsReqRnpeInf_ODT();
		
		String errMsgTxt = "";
		String errMsgId = "";
		
		try {
			/*************************************************************
			 * 모임통장기본정보 조회
			 * 
			 * 거래구분 [02] -> 해당 모임관리번호의 정보 조회 모임관리번호를 통해 해당 모임의 실계좌번호로 수취인 조회 진행
			 **************************************************************/
			String rcvBkwAcno = ""; // 모임통장 모임장의 계좌번호
			MetPbokBscInfInq_DIDT iMetPbokBsc = new MetPbokBscInfInq_DIDT();
			iMetPbokBsc.setInqDis("02"); // 거래구분 02
			iMetPbokBsc.setMetMngNo(input.getMetMngNo()); // 모임관리번호
			iMetPbokBsc.setNxtMetMngNo(""); // 다음모임관리번호
			MetPbokBscInfInq_DODT oMetPbokBsc = mPBMetPbokBscMng_COM.selectMetPbokBscInf(iMetPbokBsc);
	
			if (logger.isDebugEnabled()) {
				logger.debug("90190263 계좌.상태.정보.조회 SVC 모임통장기본정보조회 oMetPbokBsc {} :: ", oMetPbokBsc);
			}
	
			for (MetPbokBscInfGrid oMetPbokBscData : oMetPbokBsc.getGrid()) {
				rcvBkwAcno = oMetPbokBscData.getRcvBkwAcno();
				
				output.setRcvBkwAcno(rcvBkwAcno);
				break;
			}
		
			/*************************************************************
			 * 수계좌상태 조회 020 우리은행 당행 / else 타행
			 **************************************************************/
			if ("020".equals(input.getTsReqBkcd())) {
				TbkTsReqRnpeInf_DIDT iTbkFdts = new TbkTsReqRnpeInf_DIDT();
				iTbkFdts.setWdrAcno(rcvBkwAcno); // 출금계좌번호
				iTbkFdts.setTrnAm(input.getTsReqAm()); // 거래금액
				iTbkFdts.setRcvBkcd(input.getTsReqBkcd()); // 입금은행코드
				iTbkFdts.setRcvAcno(input.getTsReqAcno()); // 입금계좌번호
				iTbkFdts.setActPwnoUsgYn(input.getActPwnoUsgYn()); // 계좌비밀번호사용여부
				iTbkFdts.setActPwno(input.getActPwno()); // 계좌비밀번호
				
				if (logger.isDebugEnabled()) {
					logger.debug("90190263 계좌.상태.정보.조회 SVC 당행 자금이체 조회 SVC iTbkFdts {} :: ",iTbkFdts);
				}
	
				/*************************************************************
				 * 당행 계좌 상태 정보 조회
				 **************************************************************/
				TbkTsReqRnpeInf_DODT oTbkFdts = mPBMetPbokFncTrnMng_COM.selectTbkFdts(iTbkFdts);
	
				if (logger.isDebugEnabled()) {
					logger.debug("90190263 계좌.상태.정보.조회 SVC 당행 자금이체 조회 SVC oTbkFdts {} :: ",oTbkFdts);
				}
	
				output.setOwacFnm(oTbkFdts.getOwacFnm()); // 예금주성명 
				output.setBftrAfBal(oTbkFdts.getBftrAfBal()); // 거래전후잔액
				output.setRnpeFnm(oTbkFdts.getRnpeFnm()); // 수취인성명
				output.setTrnSrno(oTbkFdts.getTrnSrno()); // 거래일련번호
				output.setFeeAm(oTbkFdts.getFeeAm()); // 수수료금액
				output.setRduFeeAm(oTbkFdts.getRduFeeAm()); // 감면수수료금액
				output.setWmbRduAm(oTbkFdts.getWmbRduAm()); // 우리멤버스감면금액
				output.setFrduRncd(oTbkFdts.getFrduRncd()); // 수수료감면사유코드
				output.setOldAtrbDpstDlTgtYn(oTbkFdts.getOldAtrbDpstDlTgtYn()); // 구속성예금취급대상여부
				output.setNrsrYn1(oTbkFdts.getNrsrYn1()); // 비거주자여부_1
				output.setNrsrYn2(oTbkFdts.getNrsrYn2()); // 비거주자여부_2
				output.setRspTxt(oTbkFdts.getRspTxt()); // 응답내용
				output.setRscd(oTbkFdts.getRscd()); // 응답코드
				
			} else {
				ObkTsReqRnpeInf_DIDT iObkFdts = new ObkTsReqRnpeInf_DIDT();
				iObkFdts.setWdrAcno(rcvBkwAcno); // 출금계좌번호
				iObkFdts.setTrnAm(input.getTsReqAm()); // 거래금액
				iObkFdts.setRcvBkcd(input.getTsReqBkcd()); // 입금은행코드
				iObkFdts.setRcvAcno(input.getTsReqAcno()); // 입금계좌번호
				iObkFdts.setActPwnoUsgYn(input.getActPwnoUsgYn()); // 계좌비밀번호사용여부
				iObkFdts.setActPwno(input.getActPwno()); // 계좌비밀번호
				
				if (logger.isDebugEnabled()) {
					logger.debug("90190263 이체.요청.수취인.정보.조회 SVC 타행 수취인 정보 조회 SVC iObkFdts {} :: ",iObkFdts);
				}
	
				/*************************************************************
				 * 타행 계좌 상태 정보 조회
				 **************************************************************/
				ObkTsReqRnpeInf_DODT oObkFdts = mPBMetPbokFncTrnMng_COM.selectObkFdts(iObkFdts);
				
				if (logger.isDebugEnabled()) {
					logger.debug("90190263 이체.요청.수취인.정보.조회 SVC 타행 계좌 상태 정보 조회 SVC oObkFdts {} :: ",oObkFdts);
				}
				
				if("0000".equals(oObkFdts.getRscd())) {
					output.setRspTxt(oObkFdts.getRspTxt()); // 응답내용
					output.setRscd(oObkFdts.getRscd()); // 응답코드
					output.setChnlErrCd(oObkFdts.getChnlErrCd());
					return output;
				}
				
				output.setOwacFnm(oObkFdts.getOwacFnm()); // 예금주성명 
				output.setBftrAfBal(oObkFdts.getBftrAfBal()); // 거래전후잔액
				output.setRnpeFnm(oObkFdts.getRnpeFnm()); // 수취인성명
				output.setTrnSrno(oObkFdts.getTrnSrno()); // 거래일련번호
				output.setFeeAm(oObkFdts.getFeeAm()); // 수수료금액
				output.setRduFeeAm(oObkFdts.getRduFeeAm()); // 감면수수료금액
				output.setWmbRduAm(oObkFdts.getWmbRduAm()); // 우리멤버스감면금액
				output.setFrduRncd(oObkFdts.getFrduRncd()); // 수수료감면사유코드
				output.setOldAtrbDpstDlTgtYn(oObkFdts.getOldAtrbDpstDlTgtYn()); // 구속성예금취급대상여부
				output.setNrsrYn1(oObkFdts.getNrsrYn1()); // 비거주자여부_1
				output.setNrsrYn2(oObkFdts.getNrsrYn2()); // 비거주자여부_2
				output.setTlmNo(oObkFdts.getTlmNo()); // 전문번호
				output.setTnbkNm(oObkFdts.getTnbkNm()); // 상호저축은행명
				output.setRspTxt(oObkFdts.getRspTxt()); // 응답내용
				output.setRscd(oObkFdts.getRscd()); // 응답코드
				
			}
		} catch (Exception e) {
			logger.debug("selectAcnoStcdInf Exception 오류",e);
			if ( e instanceof WFApplicationException) {
				WFApplicationException we = (WFApplicationException) e;
				logger.error("WFApplicationException {} ", we);

				Object[] args = we.getArguments();
				
	            if(args != null && args.length>0) {
	            	errMsgTxt = args[0].toString();
	            	errMsgId = args[1].toString();
				}else {
					errMsgId = we.getCode();
					errMsgTxt = we.getMessage();
				}
			} else {
				logger.error("Exception {} ", e);
				errMsgId = "9999";
				errMsgTxt = e.getMessage();				
			}
			
			throw new WFApplicationException("FNSE0006", null , new Object[] {errMsgId,errMsgTxt});
		}
		
		
		return output;
	}
	
	
	/**
	 * 모임통장의 이체를 실행/승인하는 컨트롤러
	 * 
	 * @param input
	 *            이체.승인.등록.컨트롤러.입력.IO
	 * @return 이체.승인.등록.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName = "이체.승인.등록", description = "모임통장의 이체를 실행/승인하는 서비스", author = "90190263")
	public MPBMetPbokFncTrnMngInsertTsApv_ODT insertTsApv(MPBMetPbokFncTrnMngInsertTsApv_IDT input) {
		/**
		 * @BXMType GetBean
		 */
		mPBMetPbokFncTrnMng_COM = WFApplicationContext.getBean(mPBMetPbokFncTrnMng_COM, MPBMetPbokFncTrnMng_COM.class);
		mPBMetPbokBscMng_COM= WFApplicationContext.getBean(mPBMetPbokBscMng_COM, MPBMetPbokBscMng_COM.class);
		sHRAIFDSManager_COM= WFApplicationContext.getBean(sHRAIFDSManager_COM, SHRAIFDSManager_COM.class);
		sHRAllActInqTbk_COM= WFApplicationContext.getBean(sHRAllActInqTbk_COM, SHRAllActInqTbk_COM.class);
		sHRCMMEncDecSession_COM  = WFApplicationContext.getBean(sHRCMMEncDecSession_COM , SHRCMMEncDecSession_COM .class);
		
		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokFncTrnMngInsertTsApv_ODT output = new MPBMetPbokFncTrnMngInsertTsApv_ODT();

		if (logger.isDebugEnabled()) {
			logger.debug("90190263 이체.승인.등록 SVC input:: {}", input);
		}
		int updateCnt = 0;
		
		String errMsgId = "";
		String errMsgTxt = "";
		try {
			output.setRscd("0000");
			/**********************************************************************************************
			* FDS
			***********************************************************************************************/
			String aiFdsResult = "";
			
			try {
				SHRAIFDSManager_DTO inpAIFDSManager_DTO = new SHRAIFDSManager_DTO();
				inpAIFDSManager_DTO.setWDRW_ACCT_NO(input.getTsReqAcno()); 		// 출금계좌번호
				inpAIFDSManager_DTO.setE_CHNL_SUB_BIZ_CD("PSB"); // 채널구분코드
				
				if (logger.isDebugEnabled()) {
					logger.debug("90190263 이체.승인.등록 SVC FDS inpAIFDSManager_DTO :: {}", inpAIFDSManager_DTO);
				}
				
			   	aiFdsResult = sHRAIFDSManager_COM.verify(inpAIFDSManager_DTO);
			   	
			   	if (logger.isDebugEnabled()) {
			   		logger.debug("90190263 이체.승인.등록 SVC FDS aiFdsResult :: {}", aiFdsResult);
				}
			} catch(WFApplicationException we) {
				if("CMMW0001".equals(we.getCode())) {
					aiFdsResult = "90";
				}
			}
			
			if("90".equals(aiFdsResult)) {
		   		throw new WFApplicationException("BSCE0085");	// 고객님의 소중한 금융자산 보호 및 안전한 거래를 위하여 전자금융거래가 제한되었습니다.
		   	} else if("".equals(aiFdsResult) || "F".equals(aiFdsResult)) {
		   		logger.debug("[TSWTsOpenBnkAddCrt_COM] [FDS] 오픈뱅킹 FDS검증결과 응답없음. 아무것도 안 함");
		   	}
			
			String encyPwno = sHRCMMEncDecSession_COM.decryptDataWithMD5SecKey(input.getActPwno()); 		// 비밀번호 복호화
			
			/*************************************************************
			 * 이체요청수취인정보조회 이체승인전 한번 더 계좌의 상태를 확인한다.
			 **************************************************************/
			MPBMetPbokFncTrnMngSelectTsReqRnpeInf_IDT iTsReqRnpe = new MPBMetPbokFncTrnMngSelectTsReqRnpeInf_IDT();
			iTsReqRnpe.setMetMngNo(input.getMetMngNo()); // 모임관리번호
			iTsReqRnpe.setTsReqBkcd(input.getTsReqBkcd()); // 이체요청은행코드
			iTsReqRnpe.setTsReqAcno(input.getTsReqAcno()); // 이체요청계좌번호
			iTsReqRnpe.setTsReqAm(input.getTsReqAm()); // 이체요청금액
			iTsReqRnpe.setActPwnoUsgYn(input.getActPwnoUsgYn()); // 계좌비밀번호사용여부
			iTsReqRnpe.setActPwno(encyPwno); // 계좌비밀번호
	
			if (logger.isDebugEnabled()) {
				logger.debug("90190263 이체.승인.등록SVC 이체요청수취인정보조회 iTsReqRnpe :: {}",iTsReqRnpe);
			}

			// 계좌상태 정보 조회
			MPBMetPbokFncTrnMngSelectTsReqRnpeInf_ODT oAcnoStcdInf =  this.selectAcnoStcdInf(iTsReqRnpe);

			if (logger.isDebugEnabled()) {
				logger.debug("90190263 이체.승인.등록SVC 계좌상태정보 조회 oAcnoStcdInf :: {}", oAcnoStcdInf);
			}
			
			if(!"0000".equals(oAcnoStcdInf.getRscd())) {
				output.setRscd(oAcnoStcdInf.getRscd());
				output.setRspTxt(oAcnoStcdInf.getRspTxt());
				return output;
			}
			
			/*************************************************************
			 * 020: 우리은행 당행 / else 타행
			 * 
			 * 모임이체요청구분코드 : [1] 이체요청 / [2]돌려받기
			 * 
			 * 이체요청 		1) 당행 IBSMR0000093 
			 * 					2) 타행 IBSMR0000094
			 * 회비 돌려받기 	1) 당행 IBSMR0005931 모임관리번호, 거래일자, 거래일련번호 입력
			 * 		 			2) 타행 IBSMR0005781 모임관리번호, 거래일자, 거래일련번호 입력
			 * 
			 **************************************************************/
			boolean bSuccYn = false;
			if("1".equals(input.getMetTsReqDscd())) {
				if ("020".equals(input.getTsReqBkcd())) {
					TbkFdtsExe_DIDT iTbkFdtsExe = new TbkFdtsExe_DIDT();
		
					iTbkFdtsExe.setWdrAcno(oAcnoStcdInf.getRcvBkwAcno()); // 출금계좌번호
					iTbkFdtsExe.setActPwnoUsgYn(input.getActPwnoUsgYn());// 계좌비밀번호사용여부
					iTbkFdtsExe.setActPwno(encyPwno);// 계좌비밀번호
					iTbkFdtsExe.setTrnAm(input.getTsCmplAm());// 거래금액
					iTbkFdtsExe.setRsvDt("");// 예약일자
					iTbkFdtsExe.setRcvBkcd(input.getTsReqBkcd());// 입금은행코드
					iTbkFdtsExe.setRcvAcno(input.getTsReqAcno());// 입금계좌번호
					iTbkFdtsExe.setPtnPbokPrngTxt(input.getPtnPbokPrngTxt());// 상대통장인자내용
					iTbkFdtsExe.setClnmNoAddSbj("");// 집금번호추가사항
					iTbkFdtsExe.setRnpeFnm(input.getRvactOwacNm());// 수취인성명
					iTbkFdtsExe.setWdrPbokPrngTxt(input.getRvactOwacNm());// 출금통장인자내용
					iTbkFdtsExe.setSaltsDis("");// 급여이체구분
					iTbkFdtsExe.setNrsrYn1("");// 비거주자여부_1
					iTbkFdtsExe.setNrsrYn2("");// 비거주자여부_2
					iTbkFdtsExe.setWibeeMnyDduYn("");// 위비머니차감여부
					iTbkFdtsExe.setMretFdYn("");// 월세자금여부
					iTbkFdtsExe.setOldAtrbDpstDlTgtYn("");// 구속성예금취급대상여부
					
					if (logger.isDebugEnabled()) {
						logger.debug("90190263 이체.승인.등록SVC 당행 자금이체 실행 iTbkFdtsExe :: {}",iTbkFdtsExe);
					}
		
					TbkFdtsExe_DODT oTbkFdtsExe = mPBMetPbokFncTrnMng_COM.insertTbkFdtsExe(iTbkFdtsExe);
					
					if (logger.isDebugEnabled()) {
						logger.debug("90190263 이체.승인.등록SVC 당행 자금이체 실행 oTbkFdtsExe :: {}",oTbkFdtsExe);
					}
		
					if(!"0000".equals(oTbkFdtsExe.getRscd())) {
						output.setRscd(oTbkFdtsExe.getRscd());
						output.setRspTxt(oTbkFdtsExe.getRspTxt());
						return output;
					}
					
					output.setOwacFnm(oTbkFdtsExe.getOwacFnm()); // 예금주성명
					output.setBftrAfBal(oTbkFdtsExe.getBftrAfBal()); // 거래전후잔액
					output.setRnpeFnm(oTbkFdtsExe.getRnpeFnm()); // 수취인성명
					output.setTrnSrno(oTbkFdtsExe.getTrnSrno()); // 거래일련번호
					output.setFeeAm(oTbkFdtsExe.getFeeAm()); // 수수료금액
					output.setRduFeeAm(oTbkFdtsExe.getRduFeeAm()); // 감면수수료금액
					output.setWmbRduAm(oTbkFdtsExe.getWmbRduAm()); // 우리멤버스감면금액
					output.setFrduRncd(oTbkFdtsExe.getFrduRncd()); // 수수료감면사유코드
					output.setNpbokTrnCnt(oTbkFdtsExe.getNpbokTrnCnt()); // 무통장거래건수
					output.setTrhsSrno(oTbkFdtsExe.getTrhsSrno()); // 거래명세일련번호
					output.setRspTxt(oTbkFdtsExe.getRspTxt()); // 응답내용
					
					bSuccYn= true;
				} else {
					
					ObkFdtsExe_DIDT iObkFdtsExe = new ObkFdtsExe_DIDT();
					iObkFdtsExe.setWdrAcno(oAcnoStcdInf.getRcvBkwAcno()); // 출금계좌번호
					iObkFdtsExe.setActPwnoUsgYn(input.getActPwnoUsgYn()); // 계좌비밀번호사용여부
					iObkFdtsExe.setActPwno(encyPwno); // 계좌비밀번호
					iObkFdtsExe.setTrnAm(input.getTsCmplAm()); // 거래금액
					iObkFdtsExe.setRsvDt(""); // 예약일자
					iObkFdtsExe.setRcvBkcd(input.getTsReqBkcd()); // 입금은행코드
					iObkFdtsExe.setRcvAcno(input.getTsReqAcno()); // 입금계좌번호
					iObkFdtsExe.setPtnPbokPrngTxt(input.getPtnPbokPrngTxt()); // 상대통장인자내용
					iObkFdtsExe.setClnmNoAddSbj(""); // 집금번호추가사항
					iObkFdtsExe.setRnpeFnm(input.getRvactOwacNm()); // 수취인성명
					iObkFdtsExe.setWdrPbokPrngTxt(input.getRvactOwacNm()); // 출금통장인자내용
					iObkFdtsExe.setSaltsDis(""); // 급여이체구분
					iObkFdtsExe.setWibeeMnyDduYn(""); // 위비머니차감여부
					iObkFdtsExe.setBokTrnDscd(""); // 한국은행거래구분코드
					iObkFdtsExe.setMretFdYn(""); // 월세자금여부
					iObkFdtsExe.setInqTlmNo(""); // 조회전문번호
					
					if (logger.isDebugEnabled()) {
						logger.debug("90190263 이체.승인.등록SVC 타행 자금이체 실행 iObkFdtsExe :: {}",iObkFdtsExe);
					}
		
					ObkFdtsExe_DODT oObkFdtsExe = mPBMetPbokFncTrnMng_COM.insertObkFdtsExe(iObkFdtsExe);
		
					if (logger.isDebugEnabled()) {
						logger.debug("90190263 이체.승인.등록SVC 타행 자금이체 실행 oObkFdtsExe :: {}",oObkFdtsExe);
					}
					
					if(!"0000".equals(oObkFdtsExe.getRscd())) {
						output.setRspTxt(oObkFdtsExe.getRspTxt()); // 응답내용
						output.setRscd(oObkFdtsExe.getRscd()); // 응답코드
						output.setChnlErrCd(oObkFdtsExe.getChnlErrCd());
						
						return output;
					}
		
					output.setOwacFnm(oObkFdtsExe.getOwacFnm()); // 예금주성명
					output.setBftrAfBal(oObkFdtsExe.getBftrAfBal()); // 거래전후잔액
					output.setRnpeFnm(oObkFdtsExe.getRnpeFnm()); // 수취인성명
					output.setTrnSrno(oObkFdtsExe.getTrnSrno()); // 거래일련번호
					output.setFeeAm(oObkFdtsExe.getFeeAm()); // 수수료금액
					output.setRduFeeAm(oObkFdtsExe.getRduFeeAm()); // 감면수수료금액
					output.setWmbRduAm(oObkFdtsExe.getWmbRduAm()); // 우리멤버스감면금액
					output.setFrduRncd(oObkFdtsExe.getFrduRncd()); // 수수료감면사유코드
					output.setNpbokTrnCnt(oObkFdtsExe.getNpbokTrnCnt()); // 무통장거래건수
					output.setPayActTrnSrno(oObkFdtsExe.getPayActTrnSrno()); // 지급계좌거래일련번호
					output.setRspTxt(oObkFdtsExe.getRspTxt()); // 응답내용
					output.setRscd(oObkFdtsExe.getRscd()); // 응답코드
					
					bSuccYn= true;
				}
		
			} else if("2".equals(input.getMetTsReqDscd())) {

				if ("020".equals(input.getTsReqBkcd())) {
					TbkMbpfReturn_DIDT iTbkMbpfReturn = new TbkMbpfReturn_DIDT(); 
					//모임관리번호, 거래일자, 거래일련번호 필수
					iTbkMbpfReturn.setMetMngNo(input.getMetMngNo()); // 모임관리번호
					iTbkMbpfReturn.setTrnDt(input.getTrnDt());// 거래일자
					iTbkMbpfReturn.setTrnSrno(input.getTrnSrno()); // 거래일련번호
					iTbkMbpfReturn.setWdrAcno(oAcnoStcdInf.getRcvBkwAcno()); // 출금계좌번호
					iTbkMbpfReturn.setActPwnoUsgYn(input.getActPwnoUsgYn()); // 계좌비밀번호사용여부
					iTbkMbpfReturn.setActPwno(encyPwno); // 계좌비밀번호
					iTbkMbpfReturn.setTrnAm(input.getTsCmplAm()); // 거래금액
					iTbkMbpfReturn.setRsvDt(""); // 예약일자
					iTbkMbpfReturn.setRcvBkcd(input.getTsReqBkcd()); // 입금은행코드
					iTbkMbpfReturn.setRcvAcno(input.getTsReqAcno()); // 입금계좌번호
					iTbkMbpfReturn.setPtnPbokPrngTxt(input.getPtnPbokPrngTxt()); // 상대통장인자내용
					iTbkMbpfReturn.setClnmNoAddSbj(""); // 집금번호추가사항
					iTbkMbpfReturn.setRnpeFnm(input.getRvactOwacNm()); // 수취인성명
					iTbkMbpfReturn.setWdrPbokPrngTxt(input.getRvactOwacNm()); //출금통장인자내용
					iTbkMbpfReturn.setSaltsDis("");// 급여이체구분
					iTbkMbpfReturn.setNrsrYn1("");// 비거주자여부_1
					iTbkMbpfReturn.setNrsrYn2("");// 비거주자여부_2
					iTbkMbpfReturn.setWibeeMnyDduYn("");// 위비머니차감여부
					iTbkMbpfReturn.setMretFdYn("");// 월세자금여부
					iTbkMbpfReturn.setOldAtrbDpstDlTgtYn("");// 구속성예금취급대상여부
					
					if (logger.isDebugEnabled()) {
						logger.debug("90190263 이체.승인.등록 SVC 당행 회비 돌려받기 iTbkMbpfReturn :: {}",iTbkMbpfReturn);
					}
		
					TbkMbpfReturn_DODT oTbkMbpfReturn = mPBMetPbokFncTrnMng_COM.insertTbkMbpfReturn(iTbkMbpfReturn);
		
					if (logger.isDebugEnabled()) {
						logger.debug("90190263 이체.승인.등록SVC 당행 회비 돌려받기 oTbkMbpfReturn :: {}",oTbkMbpfReturn);
					}

					if(!"0000".equals(oTbkMbpfReturn.getRscd())) {
						output.setRscd(oTbkMbpfReturn.getRscd());
						output.setRspTxt(oTbkMbpfReturn.getRspTxt());
						return output;
					}
					
					output.setOwacFnm(oTbkMbpfReturn.getOwacFnm()); // 예금주성명 
					output.setBftrAfBal(oTbkMbpfReturn.getBftrAfBal()); // 거래전후잔액
					output.setRnpeFnm(oTbkMbpfReturn.getRnpeFnm()); // 수취인성명
					output.setTrnSrno(oTbkMbpfReturn.getTrnSrno()); // 거래일련번호
					output.setFeeAm(oTbkMbpfReturn.getFeeAm()); // 수수료금액
					output.setRduFeeAm(oTbkMbpfReturn.getRduFeeAm()); // 감면수수료금액
					output.setWmbRduAm(oTbkMbpfReturn.getWmbRduAm()); // 우리멤버스감면금액
					output.setFrduRncd(oTbkMbpfReturn.getFrduRncd()); // 수수료감면사유코드
					output.setNpbokTrnCnt(oTbkMbpfReturn.getNpbokTrnCnt()); // 무통장거래건수
					output.setTrhsSrno(oTbkMbpfReturn.getTrhsSrno()); // 거래명세일련번호
					output.setRspTxt(oTbkMbpfReturn.getRspTxt()); // 응답내용
					bSuccYn= true;
				} else {
					ObkMbpfReturn_DIDT iObkMbpfReturn = new ObkMbpfReturn_DIDT();
					
					//모임관리번호, 거래일자, 거래일련번호 필수
					iObkMbpfReturn.setMetMngNo(input.getMetMngNo()); // 모임관리번호
					iObkMbpfReturn.setTrnDt(input.getTrnDt());// 일자
					iObkMbpfReturn.setTrnSrno(input.getTrnSrno()); // 거래일련번호
					iObkMbpfReturn.setWdrAcno(oAcnoStcdInf.getRcvBkwAcno()); // 출금계좌번호
					iObkMbpfReturn.setActPwnoUsgYn(input.getActPwnoUsgYn()); // 계좌비밀번호사용여부
					iObkMbpfReturn.setActPwno(encyPwno); // 계좌비밀번호
					iObkMbpfReturn.setTrnAm(input.getTsCmplAm()); // 거래금액
					iObkMbpfReturn.setRsvDt(""); // 예약일자
					iObkMbpfReturn.setRcvBkcd(input.getTsReqBkcd()); // 입금은행코드
					iObkMbpfReturn.setRcvAcno(input.getTsReqAcno()); // 입금계좌번호
					iObkMbpfReturn.setPtnPbokPrngTxt(input.getPtnPbokPrngTxt()); // 상대통장인자내용
					iObkMbpfReturn.setClnmNoAddSbj(""); // 집금번호추가사항
					iObkMbpfReturn.setRnpeFnm(input.getRvactOwacNm()); // 수취인성명
					iObkMbpfReturn.setWdrPbokPrngTxt(input.getRvactOwacNm()); //출금통장인자내용
					iObkMbpfReturn.setSaltsDis("");// 급여이체구분
					iObkMbpfReturn.setWibeeMnyDduYn("");// 위비머니차감여부
					iObkMbpfReturn.setBokTrnDscd("");// 한국은행거래구분코드
					iObkMbpfReturn.setMretFdYn("");// 월세자금여부
					iObkMbpfReturn.setInqTlmNo("");// 조회전문번호
					
					if (logger.isDebugEnabled()) {
						logger.debug("90190263 이체.승인.등록 SVC 타행 회비 돌려받기 iObkMbpfReturn :: {}",iObkMbpfReturn);
					}
		
					ObkMbpfReturn_DODT oObkMbpfReturn = mPBMetPbokFncTrnMng_COM.insertObkMbpfReturn(iObkMbpfReturn);
		
					if (logger.isDebugEnabled()) {
						logger.debug("90190263 이체.승인.등록SVC 타행 회비 돌려받기 oObkMbpfReturn :: {}",oObkMbpfReturn);
					}

					if(!"0000".equals(oObkMbpfReturn.getRscd())) {
						output.setRspTxt(oObkMbpfReturn.getRspTxt()); // 응답내용
						output.setRscd(oObkMbpfReturn.getRscd()); // 응답코드
						output.setChnlErrCd(oObkMbpfReturn.getChnlErrCd());
						
						return output;
					}
					
					output.setOwacFnm(oObkMbpfReturn.getOwacFnm()); // 예금주성명 
					output.setBftrAfBal(oObkMbpfReturn.getBftrAfBal()); // 거래전후잔액
					output.setRnpeFnm(oObkMbpfReturn.getRnpeFnm()); // 수취인성명
					output.setTrnSrno(oObkMbpfReturn.getTrnSrno()); // 거래일련번호
					output.setFeeAm(oObkMbpfReturn.getFeeAm()); // 수수료금액
					output.setRduFeeAm(oObkMbpfReturn.getRduFeeAm()); // 감면수수료금액
					output.setWmbRduAm(oObkMbpfReturn.getWmbRduAm()); // 우리멤버스감면금액
					output.setFrduRncd(oObkMbpfReturn.getFrduRncd()); // 수수료감면사유코드
					output.setNpbokTrnCnt(oObkMbpfReturn.getNpbokTrnCnt()); // 무통장거래건수
					output.setPayActTrnSrno(oObkMbpfReturn.getPayActTrnSrno()); // 거래명세일련번호
					bSuccYn= true;
				}
			}
			
			/*************************************************************
			 * 이체요청.내역.정보.수정 
			 * 승인요청상태코드 		1 승인요청 2 승인완료 3 승인거절 4 사후승인 5 승인취소 
			 * 모임이체요청상태코드 	1 이체요청 2 이체중 3 이체완료 4 이체거절 5 이체취소
			 **************************************************************/
			if(bSuccYn) {
				MET_PBOK_MBPF_TS_REQ_INF001UpdateTsReqStcd_DIDT iTsReqAmd = new MET_PBOK_MBPF_TS_REQ_INF001UpdateTsReqStcd_DIDT();
				iTsReqAmd.setMetMngNo(input.getMetMngNo()); // 모임관리번호
				iTsReqAmd.setTsReqDt(input.getTsReqDt()); // 이체요청일자
				iTsReqAmd.setTsReqMbhSrno(input.getTsReqMbhSrno()); // 이체요청회원일련번호
				iTsReqAmd.setTsReqSrno(input.getTsReqSrno()); // 이체요청일련번호
				iTsReqAmd.setTsCmplAm(input.getTsCmplAm()); // 이체완료금액
				iTsReqAmd.setMetTsReqStcd(input.getMetTsReqStcd()); // 모임이체요청상태코드
				iTsReqAmd.setApvReqStcd(input.getApvReqStcd()); // 승인요청상태코드
				iTsReqAmd.setTsReqDelYn(input.getTsReqDelYn()); // 이체요청삭제여부
				iTsReqAmd.setTrnSrno(input.getTrnSrno()); // 거래일련번호
				iTsReqAmd.setLstDbChgId("");// 최종DB변경ID
				iTsReqAmd.setLstDbChgDtm(WFDateUtils.getDateTimeNow());// 최종DB변경일시
		
				if (logger.isDebugEnabled()) {
					logger.debug("90190263 이체.승인.등록SVC 승인요청상태코드수정 :: {}", iTsReqAmd);
				}
		
				updateCnt = mPBMetPbokFncTrnMng_COM.updateTsReqStcd(iTsReqAmd);
		
				if (logger.isDebugEnabled()) {
					logger.debug("90190263 이체.승인.등록SVC 승인요청상태코드수정 :: {}", iTsReqAmd);
				}
				if (updateCnt <= 0) {
					output.setRscd("9999");
					output.setRspTxt("승인요청상태가 정상적으로 수정되지 않았습니다.");
					return output;
				}
			}
	
		} catch (Exception e) {
			if ( e instanceof WFApplicationException) {
				WFApplicationException we = (WFApplicationException) e;
				logger.error("WFApplicationException {} ", we);

				Object[] args = we.getArguments();
				
	            if(args != null && args.length>0) {
	            	errMsgTxt = args[0].toString();
	            	errMsgId = args[1].toString();
				}else {
					errMsgId = we.getCode();
					errMsgTxt = we.getMessage();
				}
			} else {
				logger.error("Exception {} ", e);
				errMsgId = "9999";
				errMsgTxt = e.getMessage();				
			}

			output.setRscd(errMsgId);
			output.setRspTxt(errMsgTxt);
			
		}
		
		if(updateCnt > 0) {
			//모계좌의 잔액이 변동 될 경우 모계좌를 재조회
			sHRAllActInqTbk_COM.selectSessActList(SHRBSCInquiryConstant.BSC_ACT_LIST_INQ_DIS_ALL, true); 
			
			// PUSH 알림 전송
			MPBMetPbokBscMnginsertMetPbokPushNtfcSndInput_DTO iNtfcSnd = new MPBMetPbokBscMnginsertMetPbokPushNtfcSndInput_DTO();
			
			iNtfcSnd.setUmsTmplCd(SHRMPBCmmConstant.STR_RPWBCESS0132126);
			iNtfcSnd.setMetMngNo(input.getMetMngNo());
			iNtfcSnd.setMetMbhSrno(input.getTsReqMbhSrno());
			
			mPBMetPbokBscMng_COM.insertMetPbokPushNtfcSnd(iNtfcSnd);
		}
		
		
		return output;

	}

	/**
	 * 모임통장 공동명의인의 이체를 실행/승인하는 서비스
	 * 
	 * @param input
	 *            공동명의인.이체.승인.등록.컨트롤러.입력.IO
	 * @return 공동명의인.이체.승인.등록.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName = "공동명의인.이체.승인.등록", description = "모임통장 공동명의인의 이체를 실행/승인하는 서비스", author = "90190263")
	public MPBMetPbokFncTrnMngInsertAsscNompefTsApv_ODT insertAsscNompefTsApv(MPBMetPbokFncTrnMngInsertAsscNompefTsApv_IDT input) {
		/**
		 * @BXMType GetBean
		 */
		mPBMetPbokFncTrnMng_COM = WFApplicationContext.getBean(mPBMetPbokFncTrnMng_COM, MPBMetPbokFncTrnMng_COM.class);
		mPBMetPbokBscMng_COM= WFApplicationContext.getBean(mPBMetPbokBscMng_COM, MPBMetPbokBscMng_COM.class);
		sHRAIFDSManager_COM= WFApplicationContext.getBean(sHRAIFDSManager_COM, SHRAIFDSManager_COM.class);
		sHRAllActInqTbk_COM= WFApplicationContext.getBean(sHRAllActInqTbk_COM, SHRAllActInqTbk_COM.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokFncTrnMngInsertAsscNompefTsApv_ODT output = new MPBMetPbokFncTrnMngInsertAsscNompefTsApv_ODT();
	
		if (logger.isDebugEnabled()) {
			logger.debug("90190263 공동명의인.이체.승인.등록 SVC input :: {}", input);
		}
		
		String errMsgId = "";
		String errMsgTxt = "";
		
		try {
			output.setRscd("0000");
			/**********************************************************************************************
			* FDS
			***********************************************************************************************/
			String aiFdsResult = "";
			
			try {
				SHRAIFDSManager_DTO inpAIFDSManager_DTO = new SHRAIFDSManager_DTO();
				inpAIFDSManager_DTO.setWDRW_ACCT_NO(input.getRcvAcno()); 		// 출금계좌번호
				inpAIFDSManager_DTO.setE_CHNL_SUB_BIZ_CD("PSB"); // 채널구분코드
				
				if (logger.isDebugEnabled()) {
					logger.debug("90190263 공동명의인.이체.승인.등록 SVC FDS inpAIFDSManager_DTO :: {}", inpAIFDSManager_DTO);
				}
				
			   	aiFdsResult = sHRAIFDSManager_COM.verify(inpAIFDSManager_DTO);
			   	
			   	if (logger.isDebugEnabled()) {
			   		logger.debug("90190263 공동명의인.이체.승인.등록 SVC FDS aiFdsResult :: {}", aiFdsResult);
				}
			} catch(WFApplicationException we) {
				if("CMMW0001".equals(we.getCode())) {
					aiFdsResult = "90";
				}
			}
			
			if("90".equals(aiFdsResult)) {
		   		throw new WFApplicationException("BSCE0085");	// 고객님의 소중한 금융자산 보호 및 안전한 거래를 위하여 전자금융거래가 제한되었습니다.
		   	} else if("".equals(aiFdsResult) || "F".equals(aiFdsResult)) {
		   		logger.debug("[TSWTsOpenBnkAddCrt_COM] [FDS] 오픈뱅킹 FDS검증결과 응답없음. 아무것도 안 함");
		   	}
			
			/*************************************************************
			 * 020: 우리은행 당행 / else 타행
			 * 
			 * 공동명의이체 	1) 당행 자금 이체 조회 IBSMR0006184
			 * 						당행 자금 이체 실행 IBSMR0006185
			 * 					2) 타행 자금 이체 조회 IBSMR0006186
			 * 						타행 자금 이체 실행 IBSMR0006187
			 **************************************************************/
			if("020".equals(input.getRcvBkcd())) {
				/*************************************************************
				 * 공동명의인 당행 자금 이체 가능 조회
				 **************************************************************/
				MPBMetPbokFncTrnMngSelectAsscNompefTbkFdtsInput_DTO iAsscNompefTbkFdts =new MPBMetPbokFncTrnMngSelectAsscNompefTbkFdtsInput_DTO();
				iAsscNompefTbkFdts.setWdrAcno(input.getWdrAcno()); // 출금계좌번호
				iAsscNompefTbkFdts.setActPwnoUsgYn("N");
				iAsscNompefTbkFdts.setEncyActPwno(input.getEncyActPwno()); // 암호화계좌비밀번호
				iAsscNompefTbkFdts.setTrnAm(input.getTrnAm()); // 거래금액
				iAsscNompefTbkFdts.setRcvBkcd(input.getRcvBkcd()); // 입금은행코드
				iAsscNompefTbkFdts.setRcvAcno(input.getRcvAcno()); // 입금계좌번호
				iAsscNompefTbkFdts.setWdrPbokPrngTxt(input.getWdrPbokPrngTxt()); // 출금통장인자내용
				iAsscNompefTbkFdts.setPtnPbokPrngTxt(input.getPtnPbokPrngTxt()); // 상대통장인자내용
				
				if (logger.isDebugEnabled()) {
					logger.debug("90190263 공동명의인.이체.승인.등록SVC 공동명의인 당행 자금 이체 iAsscNompefTbkFdts :: {}",iAsscNompefTbkFdts);
				}
				
				MPBMetPbokFncTrnMngSelectAsscNompefTbkFdtsOutput_DTO oAsscNompefTbkFdts = mPBMetPbokFncTrnMng_COM.selectAsscNompefTbkFdts(iAsscNompefTbkFdts);
		
				if (logger.isDebugEnabled()) {
					logger.debug("90190263 공동명의인.이체.승인.등록SVC 공동명의인 당행 자금 이체 oAsscNompefTbkFdts :: {}", oAsscNompefTbkFdts);
				}
				
				if( !"0000".equals(oAsscNompefTbkFdts.getRscd() ) ) {
					output.setRscd("9999");
					output.setRspTxt(oAsscNompefTbkFdts.getRspTxt());
					return output;
				}
				
				/*************************************************************
				 * 공동명의인 당행 자금 이체 실행
				 **************************************************************/
				MPBMetPbokFncTrnMngInsertAsscNompefTbkFdtsExeInput_DTO iAsscNompefTbkFdtsExe = new MPBMetPbokFncTrnMngInsertAsscNompefTbkFdtsExeInput_DTO();
				iAsscNompefTbkFdtsExe.setWdrAcno(input.getWdrAcno()); // 출금계좌번호
				iAsscNompefTbkFdtsExe.setActPwnoUsgYn("N");
				iAsscNompefTbkFdtsExe.setEncyActPwno(input.getEncyActPwno()); // 암호화계좌비밀번호
				iAsscNompefTbkFdtsExe.setTrnAm(input.getTrnAm()); // 거래금액
				iAsscNompefTbkFdtsExe.setRcvBkcd(input.getRcvBkcd()); // 입금은행코드
				iAsscNompefTbkFdtsExe.setRcvAcno(input.getRcvAcno()); // 입금계좌번호
				iAsscNompefTbkFdtsExe.setRnpeFnm( oAsscNompefTbkFdts.getRnpeFnm() ); // 수취인성명
				iAsscNompefTbkFdtsExe.setWdrPbokPrngTxt(input.getWdrPbokPrngTxt()); // 출금통장인자내용
				iAsscNompefTbkFdtsExe.setPtnPbokPrngTxt(input.getPtnPbokPrngTxt()); // 상대통장인자내용
				
				if (logger.isDebugEnabled()) {
					logger.debug("90190263 공동명의인.이체.승인.등록SVC 공동명의인 당행 자금 이체 iAsscNompefTbkFdtsExe :: {}",iAsscNompefTbkFdtsExe);
				}
				MPBMetPbokFncTrnMngInsertAsscNompefTbkFdtsExeOutput_DTO oAsscNompefTbkFdtsExe =  mPBMetPbokFncTrnMng_COM.insertAsscNompefTbkFdtsExe(iAsscNompefTbkFdtsExe);
				
				if (logger.isDebugEnabled()) {
					logger.debug("90190263 공동명의인.이체.승인.등록SVC 공동명의인 당행 자금 이체 oAsscNompefTbkFdtsExe :: {}",oAsscNompefTbkFdtsExe);
				}
				
				if(!"0000".equals(oAsscNompefTbkFdtsExe.getRscd())) {
					output.setRscd(oAsscNompefTbkFdtsExe.getRscd());
					output.setRspTxt(oAsscNompefTbkFdtsExe.getRspTxt());
					return output;
				}
				
				output.setOwacFnm(oAsscNompefTbkFdtsExe.getOwacFnm()); // 예금주성명
				output.setBftrAfBal(oAsscNompefTbkFdtsExe.getBftrAfBal()); // 거래전후잔액
				output.setRnpeFnm(oAsscNompefTbkFdtsExe.getRnpeFnm()); // 수취인성명
				output.setTrhsSrno(oAsscNompefTbkFdtsExe.getTrhsSrno()); // 거래명세일련번호
				output.setWdrAcno(oAsscNompefTbkFdtsExe.getWdrAcno()); // 출금계좌번호
				output.setRcvAcno(oAsscNompefTbkFdtsExe.getRcvAcno()); // 입금계좌번호
				output.setTrnAm(oAsscNompefTbkFdtsExe.getTrnAm()); // 거래금액
				output.setPtnPbokPrngTxt(oAsscNompefTbkFdtsExe.getPtnPbokPrngTxt()); // 상대통장인자내용
				output.setRscd("0000");
			} else {
				/*************************************************************
				 * 공동명의인 타행 자금 이체 가능 조회
				 **************************************************************/
				MPBMetPbokFncTrnMngSelectAsscNompefObkFdtsInput_DTO iAsscNompefObkFdts =new MPBMetPbokFncTrnMngSelectAsscNompefObkFdtsInput_DTO();
				iAsscNompefObkFdts.setWdrAcno(input.getWdrAcno()); // 출금계좌번호
				iAsscNompefObkFdts.setActPwnoUsgYn("N");
				iAsscNompefObkFdts.setEncyActPwno(input.getEncyActPwno()); // 암호화계좌비밀번호
				iAsscNompefObkFdts.setTrnAm(input.getTrnAm()); // 거래금액
				iAsscNompefObkFdts.setRcvBkcd(input.getRcvBkcd()); // 입금은행코드
				iAsscNompefObkFdts.setRcvAcno(input.getRcvAcno()); // 입금계좌번호
				iAsscNompefObkFdts.setWdrPbokPrngTxt(input.getWdrPbokPrngTxt()); // 출금통장인자내용
				iAsscNompefObkFdts.setPtnPbokPrngTxt(input.getPtnPbokPrngTxt()); // 상대통장인자내용
				
				if (logger.isDebugEnabled()) {
					logger.debug("90190263 공동명의인.이체.승인.등록SVC 공동명의인 당행 자금 이체 iAsscNompefObkFdts :: {}",iAsscNompefObkFdts);
				}
				
				MPBMetPbokFncTrnMngSelectAsscNompefObkFdtsOutput_DTO oAsscNompefObkFdts = mPBMetPbokFncTrnMng_COM.selectAsscNompefObkFdts(iAsscNompefObkFdts);
		
				if (logger.isDebugEnabled()) {
					logger.debug("90190263 공동명의인.이체.승인.등록SVC 공동명의인 당행 자금 이체 oAsscNompefObkFdts :: {}", oAsscNompefObkFdts);
				}
				
				if( !"0000".equals(oAsscNompefObkFdts.getRscd() ) ) {
					output.setChnlErrCd(oAsscNompefObkFdts.getChnlErrCd());
					output.setRscd(oAsscNompefObkFdts.getRscd());
					output.setRspTxt(oAsscNompefObkFdts.getRspTxt());
					return output;
				}
				
				/*************************************************************
				 * 공동명의인 타행 자금 이체 실행
				 **************************************************************/
				MPBMetPbokFncTrnMngInsertAsscNompefObkFdtsExeInput_DTO iAsscNompefObkFdtsExe = new MPBMetPbokFncTrnMngInsertAsscNompefObkFdtsExeInput_DTO();
				iAsscNompefObkFdtsExe.setWdrAcno(input.getWdrAcno()); // 출금계좌번호
				iAsscNompefObkFdtsExe.setActPwnoUsgYn("N");
				iAsscNompefObkFdtsExe.setEncyActPwno(input.getEncyActPwno()); // 암호화계좌비밀번호
				iAsscNompefObkFdtsExe.setTrnAm(input.getTrnAm()); // 거래금액
				iAsscNompefObkFdtsExe.setRcvBkcd(input.getRcvBkcd()); // 입금은행코드
				iAsscNompefObkFdtsExe.setRcvAcno(input.getRcvAcno()); // 입금계좌번호
				iAsscNompefObkFdtsExe.setRnpeFnm( oAsscNompefObkFdts.getRnpeFnm() ); // 수취인성명
				iAsscNompefObkFdtsExe.setWdrPbokPrngTxt(input.getWdrPbokPrngTxt()); // 출금통장인자내용
				iAsscNompefObkFdtsExe.setPtnPbokPrngTxt(input.getPtnPbokPrngTxt()); // 상대통장인자내용
				 
				if (logger.isDebugEnabled()) {
					logger.debug("90190263 공동명의인.이체.승인.등록SVC 공동명의인 당행 자금 이체 iAsscNompefObkFdtsExe :: {}",iAsscNompefObkFdtsExe);
				}
				MPBMetPbokFncTrnMngInsertAsscNompefObkFdtsExeOutput_DTO oAsscNompefObkFdtsExe = mPBMetPbokFncTrnMng_COM.insertAsscNompefObkFdtsExe(iAsscNompefObkFdtsExe);
				
				if (logger.isDebugEnabled()) {
					logger.debug("90190263 공동명의인.이체.승인.등록SVC 공동명의인 당행 자금 이체 oAsscNompefObkFdtsExe :: {}",oAsscNompefObkFdtsExe);
				}
				
				if( !"0000".equals(oAsscNompefObkFdtsExe.getRscd() ) ) {
					output.setChnlErrCd(oAsscNompefObkFdtsExe.getChnlErrCd());
					output.setRscd(oAsscNompefObkFdtsExe.getRscd());
					output.setRspTxt(oAsscNompefObkFdtsExe.getRspTxt());
					return output;
				}
				
				output.setOwacFnm(oAsscNompefObkFdtsExe.getOwacFnm()); // 예금주성명
				output.setBftrAfBal(oAsscNompefObkFdtsExe.getBftrAfBal()); // 거래전후잔액
				output.setRnpeFnm(oAsscNompefObkFdtsExe.getRnpeFnm()); // 수취인성명
				output.setTrhsSrno(oAsscNompefObkFdtsExe.getTrhsSrno()); // 거래명세일련번호
				output.setWdrAcno(oAsscNompefObkFdtsExe.getWdrAcno()); // 출금계좌번호
				output.setRcvAcno(oAsscNompefObkFdtsExe.getRcvAcno()); // 입금계좌번호
				output.setTrnAm(oAsscNompefObkFdtsExe.getTrnAm()); // 거래금액
				output.setPtnPbokPrngTxt(oAsscNompefObkFdtsExe.getPtnPbokPrngTxt()); // 상대통장인자내용
				output.setRscd("0000");
				output.setChnlErrCd(oAsscNompefObkFdts.getChnlErrCd());
				output.setRspTxt(oAsscNompefObkFdts.getRspTxt());
			}	
			
			// 모계좌의 잔액이 변동 될 경우 모계좌를 재조회
			sHRAllActInqTbk_COM.selectSessActList(SHRBSCInquiryConstant.BSC_ACT_LIST_INQ_DIS_ALL, true);
		
		} catch (Exception e) {
			if ( e instanceof WFApplicationException) {
				WFApplicationException we = (WFApplicationException) e;
				logger.error("WFApplicationException {} ", we);

				Object[] args = we.getArguments();
				
	            if(args != null && args.length>0) {
	            	errMsgTxt = args[0].toString();
	            	errMsgId = args[1].toString();
				}else {
					errMsgId = we.getCode();
					errMsgTxt = we.getMessage();
				}
			} else {
				logger.error("Exception {} ", e);
				errMsgId = "9999";
				errMsgTxt = e.getMessage();				
			}
			
			output.setRscd(errMsgId);
			output.setRspTxt(errMsgTxt);
			
		}
		
		
		return output;
	
	}

	/**
	 * 모임통장에서 커플통장에 해당하는 모임의 생활비 목표를 조회하는 서비스
	 * 
	 * 
	 * @param input
	 *            생활비.목표.정보.조회.컨트롤러.입력.IO
	 * @return 생활비.목표.정보.조회.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName = "부부.모임.생활비.목표.정보.조회", description = "모임통장에서 커플통장에 해당하는 모임의 생활비 목표를 조회하는 서비스\r\n", author = "90190263")
	public MPBMetPbokFncTrnMngSelectHswfMetLifecGoalInf_ODT selectHswfMetLifecGoalInf(
			MPBMetPbokFncTrnMngSelectHswfMetLifecGoalInf_IDT input) {
		/**
		 * @BXMType GetBean
		 */
		mPBMetPbokFncTrnMng_COM = WFApplicationContext.getBean(mPBMetPbokFncTrnMng_COM, MPBMetPbokFncTrnMng_COM.class);

		/**
		 * @BXMType VariableDeclaration
		 */

		MPBMetPbokFncTrnMngSelectHswfMetLifecGoalInf_ODT output = new MPBMetPbokFncTrnMngSelectHswfMetLifecGoalInf_ODT();

		if (logger.isDebugEnabled()) {
			logger.debug("90190263 부부.모임.생활비.목표.정보.조회 SVC input  {} ::: ",input);
		}

		MET_PBOK_LIFEC_MNG_LDG001SelectMetPbokLifecMngLdgPkInfo_DIDT iLifecGoal = new MET_PBOK_LIFEC_MNG_LDG001SelectMetPbokLifecMngLdgPkInfo_DIDT();
		iLifecGoal.setMetMngNo(input.getMetMngNo()); // 모임관리번호

		/*
		 * @BXMType ComponentCall 모임통장.금융거래.관리.컴포넌트 부부.모임.생활비.목표.정보.조회
		 */
		// com.skbank.sml.fns.mpb.com.MPBMetPbokFncTrnMng_COM
		MET_PBOK_LIFEC_MNG_LDG001SelectMetPbokLifecMngLdgPkInfo_DODT oLifecGoal = mPBMetPbokFncTrnMng_COM.selectHswfMetLifecGoalInf(iLifecGoal);

		if (logger.isDebugEnabled()) {
			logger.debug("90190263 모임통장.메인.정보.조회 SVC 부부모임 생활비설정 oLifecGoal  {} ::: ",oLifecGoal);
		}

		if (!ObjectUtils.isEmpty(oLifecGoal)) {
			output.setMetMngNo(oLifecGoal.getMetMngNo()); // 모임관리번호
			output.setMetLifecEstYn(oLifecGoal.getMetLifecEstYn()); // 모임생활비설정여부
			output.setMetLifecAm(oLifecGoal.getMetLifecAm()); // 모임생활비금액
			output.setMetLifecEstDt(oLifecGoal.getMetLifecEstDt()); // 모임생활비설정일자
			output.setMetLifecBasDd(oLifecGoal.getMetLifecBasDd()); // 모임생활비기준일
			
		}
		return output;

	}

	/**
	 * 모임통장에서 커플통장에 해당하는 모임의 생활비 목표를 수정하는 서비스
	 * 
	 * @param input
	 *            생활비.목표.설정.컨트롤러.입력.IO
	 * @return 생활비.목표.설정.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName = "부부.모임.생활비.목표.설정.수정", description = "모임통장에서 커플통장에 해당하는 모임의 생활비 목표 설정 수정하는 서비스", author = "90190263")
	public MPBMetPbokFncTrnMngUpdateHswfMetLifecGoalEst_ODT updateHswfMetLifecGoalEst(
			MPBMetPbokFncTrnMngUpdateHswfMetLifecGoalEst_IDT input) {
		/**
		 * @BXMType GetBean
		 */
		mPBMetPbokFncTrnMng_COM = WFApplicationContext.getBean(mPBMetPbokFncTrnMng_COM, MPBMetPbokFncTrnMng_COM.class);
		mPBMetPbokBscMng_COM= WFApplicationContext.getBean(mPBMetPbokBscMng_COM, MPBMetPbokBscMng_COM.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokFncTrnMngUpdateHswfMetLifecGoalEst_ODT output = new MPBMetPbokFncTrnMngUpdateHswfMetLifecGoalEst_ODT();

		/*
		 * 로직 추가
		 */
		output.setRspRtcd("0000");
		output.setRspMsgTxt("정상 처리 되었습니다.");

		if (logger.isDebugEnabled()) {
			logger.debug("90190263 부부.모임.생활비.목표.설정.수정 SVC input :: ", input);
		}

		int updateCnt = 0;
		String errMsgTxt = "";
		
		try {
			
			// 거래구분 [I] 등록 / [U] 수정
			if ("I".equals(input.getTrnDis())) {
				MET_PBOK_LIFEC_MNG_LDG001InsertMetPbokLifecMngLdgPk_DIDT iLifecGoal = new MET_PBOK_LIFEC_MNG_LDG001InsertMetPbokLifecMngLdgPk_DIDT();
				iLifecGoal.setMetMngNo(input.getMetMngNo()); // 모임관리번호
				iLifecGoal.setMetLifecEstYn(input.getMetLifecEstYn()); // 모임생활비설정여부
				iLifecGoal.setMetLifecAm(input.getMetLifecAm()); // 모임생활비금액
				iLifecGoal.setMetLifecEstDt(input.getMetLifecEstDt()); // 모임생활비설정일자
				iLifecGoal.setMetLifecBasDd(input.getMetLifecBasDd()); // 모임생활비기준일
				iLifecGoal.setLstDbChgId(""); // DB 변경ID
				iLifecGoal.setLstDbChgDtm(WFDateUtils.getDateTimeNow()); // DB 변경일시
	
				/*
				 * @BXMType ComponentCall 모임통장.금융거래.관리.컴포넌트 부부.모임.생활비.목표.설정.등록
				 */
				// com.skbank.sml.fns.mpb.com.MPBMetPbokFncTrnMng_COM
				updateCnt = mPBMetPbokFncTrnMng_COM.insertHswfMetLifecGoalEst(iLifecGoal);
	
			} else if ("U".equals(input.getTrnDis())) {
				MET_PBOK_LIFEC_MNG_LDG001UpdateMetPbokLifecMngLdgPk_DIDT iLifecGoal = new MET_PBOK_LIFEC_MNG_LDG001UpdateMetPbokLifecMngLdgPk_DIDT();
				iLifecGoal.setMetMngNo(input.getMetMngNo()); // 모임관리번호
				iLifecGoal.setMetLifecEstYn(input.getMetLifecEstYn()); // 모임생활비설정여부
				iLifecGoal.setMetLifecAm(input.getMetLifecAm()); // 모임생활비금액
				iLifecGoal.setMetLifecEstDt(input.getMetLifecEstDt()); // 모임생활비설정일자
				iLifecGoal.setMetLifecBasDd(input.getMetLifecBasDd()); // 모임생활비기준일
				iLifecGoal.setLstDbChgId(""); // DB 변경ID
				iLifecGoal.setLstDbChgDtm(WFDateUtils.getDateTimeNow()); // DB 변경일시
				/*
				 * @BXMType ComponentCall 모임통장.금융거래.관리.컴포넌트 부부.모임.생활비.목표.설정.수정
				 */
				// com.skbank.sml.fns.mpb.com.MPBMetPbokFncTrnMng_COM
				updateCnt = mPBMetPbokFncTrnMng_COM.updateHswfMetLifecGoalEst(iLifecGoal);
	
			} else {
				output.setRspRtcd("9999");
				output.setRspMsgTxt("거래구분코드를 확인 해주세요.");
	
				return output;
			}
	
			if (updateCnt <= 0) {
				output.setRspRtcd("9999");
				output.setRspMsgTxt("DB 변경중 오류가 발생했습니다.");
			}
		}catch(Exception e){
			logger.error("updateHswfMetLifecGoalEst 전문 error :: {}", e);
			
			if ( e instanceof WFApplicationException) {
				WFApplicationException we = (WFApplicationException) e;
				logger.error("WFApplicationException {} ", we);
				
				Object[] args = we.getArguments();
	            
				if(args != null && args.length>0) {
	            	errMsgTxt = args[0].toString();
				} else {
					errMsgTxt = we.getMessage();
				}
			} else {
				logger.error("Exception {} ", e);
				errMsgTxt = e.getMessage();				
			}
			throw new WFApplicationException("FNSE0006", null, new Object[] {"9999", errMsgTxt});
		}
		
		if(updateCnt > 0) {
			// PUSH 알림 전송
			MPBMetPbokBscMnginsertMetPbokPushNtfcSndInput_DTO iNtfcSnd = new MPBMetPbokBscMnginsertMetPbokPushNtfcSndInput_DTO();
			
			iNtfcSnd.setUmsTmplCd(SHRMPBCmmConstant.STR_RPWBCESS0132124);
			iNtfcSnd.setMetMngNo(input.getMetMngNo());
			
			mPBMetPbokBscMng_COM.insertMetPbokPushNtfcSnd(iNtfcSnd);
		}
		if (logger.isDebugEnabled()) {
			logger.debug("90190263 부부.모임.생활비.목표.설정.수정 SVC output :: ", output);
		}

		return output;

	}

	/**
	 * 생활비 지출 소비 현황을 조회하는 서비스
	 * 
	 * @param input
	 *            생활비.지출.소비.현황.컨트롤러.입력.IO
	 * @return 생활비.지출.소비.현황.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName = "생활비.지출.소비.현황.조회", description = "생활비 지출 소비 현황을 조회하는 서비스", author = "90190263")
	public MPBMetPbokFncTrnMngSelectLifecExpdCnsmPts_ODT selectLifecExpdCnsmPts(
			MPBMetPbokFncTrnMngSelectLifecExpdCnsmPts_IDT input) {

		/**
		 * @BXMType GetBean
		 */
		mPBMetPbokFncTrnMng_COM = WFApplicationContext.getBean(mPBMetPbokFncTrnMng_COM, MPBMetPbokFncTrnMng_COM.class);

		/**
		 * @BXMType VariableDeclaration
		 */
		MPBMetPbokFncTrnMngSelectLifecExpdCnsmPts_ODT output = new MPBMetPbokFncTrnMngSelectLifecExpdCnsmPts_ODT();

		if (logger.isDebugEnabled()) {
			logger.debug("90190263 생활비.지출.소비.현황.조회 SVC input {} :: ", input);
		}

		/**
		 * @BXMType IF
		 * @Desc 입력 검증 : 필수 입력 값 검증 코드를 작성 하십시오.
		 */
		if (input.getMetMngNo() == null) /** null check - 모임관리번호 */
		{
			throw new WFApplicationException("FNSE0005", null, new Object[]{input.getMetMngNo()});
		} else if (input.getInqStaYm() == null) /** null check - 조회시작년월 */
		{
			throw new WFApplicationException("FNSE0005", null, new Object[]{input.getInqStaYm()});
		} else if (input.getInqEndYm() == null) /** null check - 조회종료년월 */
		{
			throw new WFApplicationException("FNSE0005", null, new Object[]{input.getInqEndYm()});
		}

		/*************************************************************
		 * 부부.모임.생활비.지출.현황.조회
		 **************************************************************/
		HswfMetLifecExpdPts_DIDT iLifecExpdPts = new HswfMetLifecExpdPts_DIDT();

		iLifecExpdPts.setMetMngNo(input.getMetMngNo()); // 모임관리번호
		iLifecExpdPts.setInqStaYm(input.getInqStaYm()); // 조회시작년월
		iLifecExpdPts.setInqEndYm(input.getInqEndYm()); // 조회종료년월

		if (logger.isDebugEnabled()) {
			logger.debug("90190263 생활비.지출.소비.현황.조회 SVC  iLifecExpdPts {} :: ", iLifecExpdPts);
		}

		/*
		 * @BXMType ComponentCall 모임통장.금융거래.관리.컴포넌트 생활비.신용카드.소비.금액.조회
		 */
		// com.skbank.sml.fns.mpb.com.MPBMetPbokFncTrnMng_COM
		HswfMetLifecExpdPts_DODT oLifecExpdPts = mPBMetPbokFncTrnMng_COM.selectHswfMetLifecExpdPts(iLifecExpdPts);

		if (logger.isDebugEnabled()) {
			logger.debug("90190263 생활비.지출.소비.현황.조회 SVC  oLifecExpdPts {} :: ", oLifecExpdPts);
		}

		output.setMetMngNo(oLifecExpdPts.getMetMngNo()); // 모임관리번호
		output.setMetNm(oLifecExpdPts.getMetNm()); // 모임명
		output.setGridCnt(oLifecExpdPts.getGridCnt()); // 그리드건수

		List<MPBLifecExpdCnsmListPts_ODT> outDataList = new ArrayList<>();
		for (HswfMetLifecExpdPtsSub_DODT oLifecExpdPtsData : oLifecExpdPts.getGrid()) {
			MPBLifecExpdCnsmListPts_ODT outData = new MPBLifecExpdCnsmListPts_ODT();

			outData.setBasYm(oLifecExpdPtsData.getBasYm()); // 기준년월
			outData.setExpdAm(oLifecExpdPtsData.getExpdAm()); // 지출금액

			outDataList.add(outData);
		}

		output.setGrid(outDataList);

		if (logger.isDebugEnabled()) {
			logger.debug("90190263 생활비.지출.소비.현황.조회 SVC  output {} :: ", output);
		}

		return output;

	}

	/**
	 * 모임통장의 거래내역을 조회하여 다운받는 컨트롤러
	 * 
	 * @param input 모임통장.거래내역.다운로드.컨트롤러.입력.IO
	 * @return 모임통장.거래내역.다운로드.컨트롤러.출력.IO
	 * @throws IOException
	 */
	@BxmCategory(logicalName = "모임통장.거래.내역.다운로드", description = "모임통장 거래내역을 조회하여 다운받는 컨트롤러", author = "90191355")
	public MPBMetPbokFncTrnMngSelectMetPbokTrnPrtsDown_ODT selectMetPbokTrnPrtsDown(
			MPBMetPbokFncTrnMngSelectMetPbokTrnPrtsDown_IDT input)
			throws IOException {
		
		/**
		 * @BXMType GetBean
		 */
		MPBMetPbokFncTrnMngSelectMetPbokTrnPrts_IDT trnIdt = new MPBMetPbokFncTrnMngSelectMetPbokTrnPrts_IDT();
		trnIdt.setInqDis("06"); // 조회구분 --> 최신순으로 06, 과거순 07
		trnIdt.setMetMngNo(input.getMetMngNo()); // 모임관리번호
		trnIdt.setInqStaDt(input.getInqStaDt()); // 조회시작일자
		trnIdt.setInqStaTrnSrno(0); // 조회시작거래일련번호
		trnIdt.setInqEndDt(input.getInqEndDt()); // 조회종료일자
		trnIdt.setInqEndTrnSrno(999999); // 조회종료거래일련번호
		
		String EXCEL_TEMPLATE_NAME = "trnlist_template.xlsx";
		FileOutputStream fos = null;
		FileInputStream excelTemplateFis = null;
		XSSFWorkbook wb = null;
		MPBMetPbokFncTrnMngSelectMetPbokTrnPrtsDown_ODT output = new MPBMetPbokFncTrnMngSelectMetPbokTrnPrtsDown_ODT();
		String err = "";
		
		try {
			MPBMetPbokFncTrnMngSelectMetPbokTrnPrts_ODT trnOdt = this.selectMetPbokTrnPrts(trnIdt);
			
			if (logger.isDebugEnabled()) {
				logger.debug("모임통장 거래내역 조회 SVC trnPrts cnt {} :: ", trnOdt.getGridCnt());
			}
	//		String[] headerList = {
	//				"거래일시", 
	//				"거래구분", 
	//				"거래금액",
	//				"거래후 잔액", 
	//				"내용",
	//				"메모"};
			List<List<String>> rowList = new ArrayList<List<String>>();
						
			if (logger.isDebugEnabled()) {
				logger.debug(":::::::::: 엑셀 템플릿 파일 읽어오기 시작::::::::::::::");
			}
			
			String strRootPath = WFFileUtils.getRootFilePath();
			String templatePath = File.separator.concat("FNS").concat(File.separator)
					.concat("moim").concat(File.separator);
			
			File excelTemplate = new File(strRootPath.concat(templatePath).concat(EXCEL_TEMPLATE_NAME));
			//로컬
			//File excelTemplate = new File("\\\\10.232.182.90\\파일공유\\3.우리WON뱅킹재구축\\9000.개인폴더\\==========금융서비스\\서종환\\암호화해제\\".concat(EXCEL_TEMPLATE_NAME));
			
			if (!excelTemplate.exists()) {
				err = "거래내역 템플릿 파일이 존재하지 않습니다.";
			}
			excelTemplateFis = new FileInputStream(excelTemplate);
			err = "거래내역 템플릿 파일 처리 중 오류가 발생하였습니다.";
			
			if (logger.isDebugEnabled()) {
				logger.debug(":::::::::: 엑셀 파일 시트 생성 시작::::::::::::::");
			}
			// 파일 생성
			wb = new XSSFWorkbook(excelTemplateFis);
			XSSFSheet sheet = wb.getSheetAt(0);
			
			err = "거래내역 파일 생성 처리 중 오류가 발생하였습니다";

			//해더 폰트
			XSSFFont headerFont = wb.createFont();
			headerFont.setBold(true);
			headerFont.setFontName("맑은 고딕");
			headerFont.setFontHeightInPoints((short)11);
			
			//기본 폰트
			XSSFFont defaultFont = wb.createFont();
			headerFont.setFontName("맑은 고딕");
			headerFont.setFontHeightInPoints((short)11);

			//발급기준일 폰트
			XSSFFont etcFont = wb.createFont();
			headerFont.setFontName("맑은 고딕");
			headerFont.setFontHeightInPoints((short)9);
			
			XSSFCellStyle etcStyle = wb.createCellStyle();
			etcStyle.setFont(etcFont);
			etcStyle.setVerticalAlignment(VerticalAlignment.CENTER);
			etcStyle.setAlignment(HorizontalAlignment.RIGHT);
			
			SimpleDateFormat dateFullformat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
			SimpleDateFormat dateSdf = new SimpleDateFormat("yyyy.MM.dd");
			SimpleDateFormat inputSdf = new SimpleDateFormat("yyyyMMdd");
			SimpleDateFormat dataFullSdf = new SimpleDateFormat("yyyyMMddHHmmss");
			
			//발급기준일 row
			XSSFRow etcRow = sheet.getRow(3);
			XSSFCell etcCell = etcRow.getCell(3);

			StringBuffer sb = new StringBuffer();
			sb.append("발급기준일 : ").append(dateFullformat.format(new Date()));
			etcCell.setCellValue(sb.toString());
			etcCell.setCellStyle(etcStyle);
			
			//조회 기준 테이블 스타일 
			
			BorderStyle borderStyle = BorderStyle.THIN;
			short borderColorIndex = IndexedColors.ROYAL_BLUE.getIndex();
			
			XSSFCellStyle inqTableValueStyle = wb.createCellStyle();
			inqTableValueStyle.setFont(defaultFont);
			inqTableValueStyle.setVerticalAlignment(VerticalAlignment.CENTER);
			inqTableValueStyle.setAlignment(HorizontalAlignment.LEFT);
			inqTableValueStyle.setBorderTop(borderStyle);
			inqTableValueStyle.setTopBorderColor(borderColorIndex);
			inqTableValueStyle.setBorderBottom(borderStyle);
			inqTableValueStyle.setBottomBorderColor(borderColorIndex);
			
			//조회기간
			XSSFRow inqPeriodRow = sheet.getRow(4);
			XSSFCell inqPeriodCell = inqPeriodRow.getCell(1);
			inqPeriodCell.setCellStyle(inqTableValueStyle);
			StringBuffer inqPeriod = new StringBuffer();
			inqPeriod.append(dateSdf.format(inputSdf.parse(input.getInqStaDt())))
			.append("~")
			.append(dateSdf.format(inputSdf.parse(input.getInqEndDt())));
			inqPeriodCell.setCellValue(inqPeriod.toString());
			
			//계좌번호
			XSSFRow acnoRow = sheet.getRow(5);
			XSSFCell acnoCell = acnoRow.getCell(1);
			acnoCell.setCellStyle(inqTableValueStyle);
			acnoCell.setCellValue(WFStringUtils.transAcctMaskWithHypen(trnOdt.getRlfAcno()));
			
			//예금주명 : 모임회원명
			XSSFRow ownerNameRow = sheet.getRow(6);
			XSSFCell ownerNameCell = ownerNameRow.getCell(1);
			ownerNameCell.setCellStyle(inqTableValueStyle);
			ownerNameCell.setCellValue(trnOdt.getMetMbhNm());
			
			//현재잔액
			XSSFRow currentAmountRow = sheet.getRow(7);
			XSSFCell currentAmountCell = currentAmountRow.getCell(1);
			currentAmountCell.setCellStyle(inqTableValueStyle);
			StringBuffer currentAmount = new StringBuffer();
			currentAmount.append(WFStringUtils.addComma(trnOdt.getCtBal().toString())).append("원");
			currentAmountCell.setCellValue(currentAmount.toString());
			
			//거래내역 테이블 스타일 
			XSSFCellStyle trnPrtsTableValueStyle = wb.createCellStyle();
			trnPrtsTableValueStyle.setFont(defaultFont);
			trnPrtsTableValueStyle.setVerticalAlignment(VerticalAlignment.CENTER);
			trnPrtsTableValueStyle.setBorderTop(borderStyle);
			trnPrtsTableValueStyle.setTopBorderColor(borderColorIndex);
			trnPrtsTableValueStyle.setBorderBottom(borderStyle);
			trnPrtsTableValueStyle.setBottomBorderColor(borderColorIndex);
			trnPrtsTableValueStyle.setBorderRight(borderStyle);
			trnPrtsTableValueStyle.setRightBorderColor(borderColorIndex);	
			
			if (logger.isDebugEnabled()) {
				logger.debug(":::::::::: 엑셀 데이터 생성::::::::::::::");
			}
			err = "거래내역 데이터 처리 중 오류가 발생하였습니다";
			
			if (trnOdt.getGridCnt() > 0) {
				String trnDtm = "";
				for (MPBMetPbokTrnPrts_DTO rowItem : trnOdt.getGrid()) {
					List<String> row = new ArrayList<String>();
					trnDtm = "";
					String trnDt = rowItem.getTrnDt();
					String trnTm = rowItem.getTrnTm();
					
					StringBuffer trnDateTimeSb = new StringBuffer();
					trnDateTimeSb.append(trnDt).append(trnTm);
					
					if (!trnDt.isEmpty() && !trnTm.isEmpty()) {
						trnDtm = dateFullformat.format(dataFullSdf.parse(trnDateTimeSb.toString()));	
					} else if (trnDt.isEmpty()) {
						trnDtm = "";
					} else if (!trnDt.isEmpty() && trnTm.isEmpty()) {
						trnDtm = dateSdf.format(inputSdf.parse(trnDt.toString()));
					}
					
					row.add(trnDtm); // 거래일시
					row.add(""); // 병합 셀 빈 값
					
					String dpsRapDscdNm = rowItem.getDpsRapDscdNm();
					row.add("입금".equals(dpsRapDscdNm) ? "입금" : "출금"); // 수신입지급구분코드명
					
					row.add(WFStringUtils.addComma(rowItem.getTrnAm().toPlainString())); // 거래금액
					row.add(WFStringUtils.addComma(rowItem.getAftrBal().toPlainString())); // 거래후잔액
					
					row.add(rowItem.getPbokPrngOtlnTxt()); // 내용
					row.add(rowItem.getMetTrnMemoTxt().isEmpty() ?  rowItem.getMetTrnStcdNm() : rowItem.getMetTrnMemoTxt()); // 메모
					
					rowList.add(row);
				}
			}
			
			err = "거래내역 파일 내용 처리 중 오류가 발생하였습니다";
			int listCnt = rowList.size();
			int rowIndex = 10;
			int colIndex = 0;
			if (listCnt == 0) {
				XSSFRow emptyRow = sheet.getRow(rowIndex);
				emptyRow.createCell(colIndex).setCellValue("거래내역이 존재하지 않습니다.");
			} else {
				for (List<String> items : rowList) {
					XSSFRow dataRow = sheet.createRow(rowIndex);
					colIndex = 0;
					for (int i = 0 ; i < items.size() ; i++) {
						String data = items.get(i);
						XSSFCell trnPrtsTableCell = dataRow.createCell(colIndex++);
						
						if (i == 1) {
							//0, 1 행 병합
							sheet.addMergedRegion(new CellRangeAddress(rowIndex, rowIndex, 0, 1));
						} else {
							trnPrtsTableCell.setCellValue(data);							
						}
						
						if (i == 3 || i == 4) {
							//금액일경우 우측정렬
							trnPrtsTableCell.setCellStyle(trnPrtsTableValueStyle);
							CellUtil.setAlignment(trnPrtsTableCell, HorizontalAlignment.RIGHT);
						} else {
							//외에는 중앙정렬
							trnPrtsTableValueStyle.setAlignment(HorizontalAlignment.CENTER);
							trnPrtsTableCell.setCellStyle(trnPrtsTableValueStyle);
						}
						
						if (i == items.size() - 1) {
							trnPrtsTableCell.setCellStyle(trnPrtsTableValueStyle);
							CellUtil.setCellStyleProperty(trnPrtsTableCell, CellUtil.BORDER_RIGHT, BorderStyle.NONE);
						}
					}
					rowIndex++;
				}
			}
			
			XSSFCellStyle lastRowStyle = wb.createCellStyle();
			inqTableValueStyle.setFont(defaultFont);
			inqTableValueStyle.setVerticalAlignment(VerticalAlignment.CENTER);
			inqTableValueStyle.setAlignment(HorizontalAlignment.LEFT);
			
			rowIndex += 1;
			XSSFRow endRow = sheet.createRow(rowIndex);
			XSSFCell endRowCell = endRow.createCell(0);
			
			endRowCell.setCellStyle(lastRowStyle);
			endRowCell.setCellValue("※ 본 거래내역은 법적효력이 없는 참고용 문서입니다.");

			if (logger.isDebugEnabled()) {
				logger.debug(":::::::::: 엑셀 파일 생성::::::::::::::");
			}

			String path = File.separator.concat("FNS").concat(File.separator)
					.concat("moim").concat(File.separator).concat("trnlist")
					.concat(File.separator);
			
			File file = new File(strRootPath.concat(path));
			String fileNm = "모임통장거래내역".concat(".xlsx");

			if (logger.isDebugEnabled()) {
				logger.debug(":::::::::: FileOutputStream write:::::::::::::: path {}", file.getAbsolutePath());
			}

			fos = new FileOutputStream(file.getAbsolutePath().concat(File.separator).concat(fileNm));
			wb.write(fos);
			
			output.setFileNm(fileNm); // 파일명
			output.setFilePath(path); // 파일경로

			if (logger.isDebugEnabled()) {
				logger.debug(":::::::::: 완료::::::::::::::");
			}
		} catch (Exception e) {
			logger.error(":::::::::: catch error :::::::::::::: {}", e);
			output.setFileNm("error");
			output.setFileDir(err);
		} finally {
			if (fos != null) {
				fos.close();
			}
			if (excelTemplateFis != null) {
				excelTemplateFis.close();
			}
			if (wb != null) {
				wb.close();
			}
		}

		return output;
	}
}
