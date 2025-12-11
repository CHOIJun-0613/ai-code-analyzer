/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.mnp.dto;

import bxm.common.annotaion.BxmCategory;
import bxm.omm.annotation.BxmOmm_Field;
import bxm.omm.exception.CloneFailedException;
import bxm.omm.predict.FieldInfo;
import bxm.omm.predict.Predictable;
import bxm.omm.root.IOmmObject;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.skbank.sml.ifi.mca.eims3.dto.IBSMR0004063_GRID_2_IDT;
import com.skbank.sml.ifi.mca.eims3.dto.IBSMR0004063_GRID_IDT;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import option.WooriOmmOption;

/**
 * 
 */
@WooriOmmOption(propOption=true)
@XmlType(propOrder={
	"sqcNmTrnCfdocCollYn", "dpsNewDscd", "dpsRsvNewDscd", "encyActPwno", "sealSignUsgDscd", "pdcd", "csno", "cusDgnAcno", "prrRgsPwnoKey", "smsdDscd", "psnInfExpsCnfYn", "scanUablRncd", "psnInfAgmdMngNo", "acnmCnfEno", "advpeEno"
	, "idcrDscd", "idcrFnm", "idcrEncyRsdlNo", "idcrIsuDt", "idcrImgKey", "idcrCnfShap", "idcrRuseYn", "idcrAgnpeTrnYn", "appRgsDscd", "appRgsBrcd", "appRgsDt", "appRgsSrno", "wmsLnkYn", "snthAsetMngCsno", "snthAsetMngDesgnPrdCnt"
	, "snthAsetMngAltrIvstWgt", "snthAsetMngBksWgt", "snthAsetMngFrgBndWgt", "snthAsetMngFrgStcWgt", "snthAsetMngPdcd", "appRgsPwno", "appRgsAtsAcno", "wmLnkTrnSrno", "snthAsetMngDeedCd", "snthAsetMngFlwWgt", "snthAsetMngDomStcWgt", "snthAsetMngDomBndWgt", "prdStbyAnlsSrno", "inlnAnlsSrno", "asetIstMngNo"
	, "rtpenPlanOrgPdcd", "jnpeTycd", "fndSgpFpCnslSrvcDscd", "rsdlBzpeNo", "frnrLstVldTem", "inetRsvRcpDscd", "inetRsvIdfNo", "inetRsvNo", "inetRsvCusPureNewYn", "synpbPdcd", "actUsgAimDis", "frnrEmptEduYn", "fncTrnAimCollDis", "lnoActOpngRsn", "depaCrdcCollYn"
	, "idCadIsuRqdcUsgYn", "rcvVcrMlsChidYn", "saltsScdDd", "atmWdrDscd", "cctnTrnKdcd", "idCadIsuYn", "ptnrPrmeIr1Yn", "ptnrPrmeIr2Yn", "ptnrPrmeIr3Yn", "ptnrPrmeIr4Yn", "ascnPbokNm", "rcvpeNm", "rcvDd", "dntnAtsEndDt", "patnAscnAcno"
	, "patnAscnNm", "aimFdNm", "patnAscnDis", "patnHpNo", "chilRrno", "dntnInfOfrAgrYn", "dntnlCd", "clsaAtsRqYn", "clsaAtsPmnyAcno", "clsaAtsEndDt", "fncTaxtSmsRqYn", "wfFclUnqNo", "locaPrmeYn", "afiBzcd", "emlNtcSrvcYn"
	, "fmbkCtrdCollYn", "adrpRgsYn", "mbhYn", "psnInfAgrYn", "datAcldHpNo", "dpsBatRqsNo", "dpsBatRqsSrno", "agnpeEncyRrno", "agnpeFnm", "rppeDupOmitYn", "rppeAgnpeAcrdYn", "rppeFnm", "rppeEncyRrno", "agnpeDupYn", "rppeDupYn"
	, "itpyMecd", "itpyCycd", "nextItpyDt", "actMngBrcd", "asscNmnlDpstYn", "netrApvNo", "mbpbkJnngYn", "mblPbokInetBnkgId", "npbokIccadIsuDis", "ideedCd", "pbokEngPrngYn", "nlDscd", "dpsDeedNo", "pbokIssuYn", "prdGdncPbokPrngYn"
	, "nrsrCnfDocCollYn", "bokStttPermXtYn", "nrsrPwnoRgsYn", "nrsrAccCd", "krwDpsAccDscd", "nrsrKrwInfwDscd", "txprDscd", "txprLmtAm", "prchAm", "pmbilAm", "cackAm", "bokBchkAm", "etcDeedAm", "fncTrnAimCd", "trnFdSrcCd"
	, "fdOwpeYn", "fncTrnAimTxt", "trnFdSrcCdTxt", "ckbilKdcd", "cacGramRcvYn", "cacGramRcvCrtdIsuYn", "cacGramRcvAm", "cacGramTrfAm", "cacGramBchkAm", "feeRcvYn", "feeCshtfDscd", "rctsOupYn", "feeAm", "wdrAcno", "encyWdrActPwno"
	, "xprRcvAcno", "irprmTgt1Dscd", "irprmTgt2Dscd", "irprmTgt3Dscd", "irprmTgt4Dscd", "irprmTgt5Dscd", "irprmTgt6Dscd", "xprPrcMecd", "dntnAtsAcno", "newFdDscd", "spcfMonyTrtAcno", "pnsnPayTemEstYn", "pnsnPayCtrtmYcnt", "pnsnPayCycd", "lnoActPbokIssuYn"
	, "bscAcno", "oldAtrbXtRncd", "cpblChckTgtYn", "rpcmDpstTgtYn", "oldAtrbCeoRgsrDrtrYn", "oldAtrbApvNo", "rdepAcno", "oldAtrbApvRsn", "oldAtrbChckTim", "ccadRsltInqYn", "tbkCcadHldgYn", "cadStlActTbkYn", "ccadBasRsltAm", "utzRsltBasStaDt", "utzRsltBasEndDt"
	, "utzRsltInqTim", "amfRispeDis", "amfRispeFnm", "amfRispeRrno", "amfRispeCnad", "anrvNprcYn", "pbamAcno", "pbamSnnmAcno", "pmnyTrnUnqNo", "ctrtmMcn", "ctrtmDcnt", "xprDt", "rcknDt", "encyAtsActPwno", "atsCycd"
	, "atsStaDt", "atsEndDt", "atsCucd", "atsDd", "atsMecn", "atsAcno", "atsAm", "tbkSltCopCd", "tbkSltCopOfemYn", "dntnRqYn", "dntnAmDscd", "dntnAm", "xprCancRcvAcno", "bchrCponNo", "bchrSupAm"
	, "bchrCusPidAm", "apvNo", "cponCrtfNo", "autoRdepYn", "insuJnngAgrYn", "jnngTgtDscd", "ccadHldgYn", "frcsDshgDt", "cusDgnPrdNm", "xcoCd", "frndAcno", "spdtDgnMm", "spdtDgnDd", "aplIr", "emlFpAcblNtfcRqYn"
	, "emlFpAcblNtfcBsdt", "fpPrftRtSmsNtfcRqYn", "fpPrftRtSmsNtfcBsdt", "goalPrSmsRqYn", "goalPr", "alwPr", "gBnkgGoalPrftRtDscd", "gBnkgAlwLossDscd", "fcPsklUseYn", "xrtTsTycd", "xrtMaxAcldAm", "dgnXrtNtfcSrvcDscd", "ntfcSrvcDgnXrt", "ovtbCdno", "fmbkCoNo"
	, "atrnDscd", "rvactNo", "irRotCycd", "fcfndInfwDscd", "fcDpsAccDscd", "fornXchStttCrtcSbmtDis", "fxRapRncd", "payRncdCfcd", "hsCd", "ivpeId", "secrComNm", "fcApvCd", "pnsnAcldCtrYcnt", "pnsnAcldCtrMcn", "pnsnRcveBgnDt"
	, "prftRtRptdSndDscd", "rprhLnkNewYn", "rprhLnkCancAcno", "rprhLnkTamNewYn", "afepAddPidYn", "fndPdcd", "fndScntRqdcNprtYn", "opgPtsNtcSndDscd", "gBnkgGoalPrftRtPsnb", "gBnkgGoalPrftRtDcml", "gBnkgAlwLossRtPsnb", "gBnkgAlwLossRtDcml", "wooriOnwlMoAcno", "bznUseActYn", "agnpeItcsno"
	, "rppeItcsno", "atsNaNtfcRqYn", "acldFndTsXprNtfcRqYn", "fwxcAcno", "fndCnvrTmntAcno", "dvdamRinvDscd", "fndCnvrNewYn", "lonXprAdvnYn", "lnApvCmplYn", "priPrpeBrNm", "grnTrno", "escrUnmrNo", "priPrpeAcno", "prpeAcno", "priPrpeBzpeNo"
	, "prpeBzpeNo", "ppmtAmRcveAcno", "orcpPrpeCsno", "pftPrpeCsno", "orcpPrpeNrsrCollYn", "pftPrpeNrsrCollYn", "pocpPfeAm", "etfTprt", "opgOrdsTxt", "sa1Txt", "sa2Txt", "sa3Txt", "sptxYn", "nnmCsno", "fndItmsCd"
	, "dpsRcvAm", "trfAm", "bchkAm", "bchkInqmAm", "inqmScnt", "inqmFeeXmpDis", "tamTrfYn", "pxrt", "krwTrfAm", "cucd", "ioffSbDscd", "cshtfDscd", "cshFeeLevyDscd", "cshFee", "tgtKrwAm"
	, "fcTrfAm", "fcCshRcvAm", "coinAm", "krfd", "apxrt", "cusPrmeXrt", "ioffSbRt", "fwxcCtrMcnt", "newAcno", "ksdFndNo", "rtpenTrnDisNo", "rcmGoalAm", "jnngCtgrCd", "rcpMdKdcd", "hsscMajTxtPbokPrngYn"
	, "prdDesOupYn", "acicJnngYn", "hsscNewDscd", "hsscRgslZpno", "hsscInddRgsYn", "hsscHopeRgnZpno", "hopeHousKdDscd", "housXuseSqmDscd", "hopeMovinYm", "esnsNewRgsDt", "esnsNewRgsTm", "esnsNewEbnkUtzpeNo", "atsKdcd", "lnoActOpngRncd", "scanInfAcnmCnfDscd"
	, "agnpeTrnYn", "dpsPwnoRgsDscd", "prrRgsPwnoKeyCnf", "encyActPwnoCnf", "wdcPbokYn", "wooriLovPlsDntnAscnDscd", "sameRqdcSrno", "etcDeedDscd", "actApvNo", "fndRblnNewYn", "bgnnRcvWdrYn", "copItcsno", "inbkNewYn", "smrtBnkgNewYn", "tlbnkNewYn"
	, "ntsvcRgsYn", "inbkWdrActRgsYn", "inetBnkgUserId", "ebnkPwno", "engNm", "tms1TsLmtAm", "d1TsLmtAm", "secrdSrno", "otpcSrno", "otpPwd", "otpIsuCostXmpDscd", "datDpsTelNo", "synpbDscd", "inetBnkgRcpSrno", "inbkRsvRgbrCd"
	, "inbkRsvRgsDt", "inbkRsvRgsSrno", "smrtBnkgInetBnkgId", "smrtBnkgHpComCd", "smrtBnkgHpTlenNo", "smrtBnkgHpSrno", "tlbnkSecrdSrno", "encyEbnkPwno", "tlbnkD1TsLmt", "tlbnkTms1TsLmt", "ntsvcRawDscd", "ntsvcBalNtyMarkYn", "ntsvcHpComCd", "ntsvcHpTlenNo", "ntsvcHpSrno"
	, "ntsvcInotAm", "astPrtsNtcYn", "ntsvcTmsStaTim", "ntsvcTmsEndTim", "wdrActRgsInetBnkgId", "ebnkWdrActCnccRgsYn", "tlbnkWdrActCnccRgsYn", "hswfPbokDocSndYn", "faOwacCsno", "flieRgsYn", "atsYn", "hmnyUsgAm", "etcAcno", "trtpyRtPsnb", "trtpyRtDcml"
	, "fltIrNtcDscd", "etpCoplsDpstNewYn", "atsXtYn", "spslPdcd", "trtPocpPfeRtPsnb", "trtPocpPfeRtDcml", "trtDfanPfeRtPsnb", "trtDfanPfeRtDcml", "cponInpDscd", "agmIrtPsnb", "agmIrtDcml", "pbokOtln", "ascnBlgCd", "acldCrtdSndDscd", "isaMajSbjPbokPrngYn"
	, "isaNewDscd", "isaJnngDscd", "jnngAdvpeEno", "extxDscd", "dtjnTemDscd", "mndDocCollYn", "enmtDt", "dshgDt", "ctrmvIscd", "rtrtInsuCnvrAm", "aldJnpeTycd", "fstJnngDt", "tfrAcno", "planNo", "brdmKdcd"
	, "scdOrdsMngNo", "rtpenCobdnAm", "rtpenPbdnAm", "opgMngFee", "asetMngFee", "stlAcno", "encyStlActPwno", "afepAddPidDscd", "rprhLnkNewDscd", "cancRsvFndAcno", "rprhAmTamNewDscd", "xcoPrmeIrt", "fndGoalPrftRtPsnb", "fndGoalPrftRtDcml", "srvcRqAm"
	, "fndAcblNtcDis", "fndAcblNtfcBasDd", "fndPrftRtSmsChrRqDscd", "fndSmsRqTprtPsnb", "fndSmsRqTprtDcml", "fndSmsRqTprtDscd", "fndSmsRqLossAwrtPsnb", "fndSmsRqLossAwrtDcml", "fndSmsRqLossAwrtDscd", "fndFpPrftRtSmsChrRqDscd", "fndFpPrftRtSmsChrRqDtDscd", "scntRqdcPrngOmitYn", "oldAtrbChckHisSrno", "newVstrMngNo", "payVstrMngNo"
	, "spotTfrRtpenPrdNo", "rtttIscd", "spotTfrRtpenPlanDscd", "intRcvFcAcno", "pbdeedPrngYn", "dgnXrtPsnb", "dgnXrtDcml", "mkshMbhYn", "asstmPbokDscd", "wbbtJnngHpNo", "prdOpgDscd", "newInqYn", "pwnoNuseYn", "bchrInqTim", "bchrNewAvlYn"
	, "prdMajTxtPbokPrngYn", "apirtPsnb", "apirtDcml", "hqapNo", "acnmCsno", "fcbdNewYn", "irKdcd", "efctPrftRtPsnb", "efctPrftRtDcml", "vrBilNewDscd", "istIvpeBatNewTrnDscd", "dppeCsno", "dppeActIdfNo", "dpsBatNewBzcd", "ascnNewRprsAcno"
	, "ascnNewRprsActYn", "pbamActAcctYy", "pmnySnnmActAcctYy", "hsscOwhmAdrKdcd", "hsscOwhmBldMngNo", "hsscOwhmPostSrno", "hsscOwhmStdoNo", "agmtCoCd", "wooriHopeDremJnngTgtDscd", "asetMngIscd", "rpbdDscd", "cctnAcno", "npbdSbsrRqYn", "npbdItmsCd", "bndKdDis"
	, "tunMmHo", "hdgTgtYn", "idCadNhssDscd", "fndPlsOpgDscd", "grnInsuKey", "preIntRcvDscd", "preIntRcvAcno", "dpsRcmNo", "sldrAldCn", "dlpmPbokGenRgsYn", "smrtMchrMdlInf", "wibeeRcvRgsYn", "wibeeTsAcno", "wibeePushRgsYn", "atsKrwTsAcno"
	, "irngBrcd", "krwFmbkFxpdYn", "krwSscoFmbkFxpdYn", "hopeHousXuseSqmDscd", "rrrgMvinDt", "dppeUnqNo", "dppeItmsNo", "cshbAtsAcno", "cusDntnAscnCd", "cusBrdnCnrnRt", "dinsvGoalAm", "txprInqYn", "frno", "acnmRgsCd", "coaOmitYn"
	, "wbbmLnkNewYn", "wbbtRcmRgsHpNo", "smrtLnJnngYn", "dinsvDscd", "aucId", "gmktId", "wbbmId", "dniAcnmCnfNewDscd", "dniRcvAm", "dniHpNo", "dniPtnAcno", "dniPtnNewAcno", "dniPtnbkCd", "rjnngAcno", "insvAcldPlanKdcd"
	, "insvAcldFstTsAm", "insvAcldTsStaWkdDscd", "insvAcldTsStaDt", "insvAcldPlanChcYn", "insvAcldPlanLifeAm", "pidMecd", "selcMvbDtlsIdfCd", "ptnBkwAcno", "ptnSelcIscd", "fndslcMvbCfdocIsuDt", "taxTycd", "rprhAfImnwYn", "elfSelfDgnsYn", "wmsPrtfDis", "ptnIstCnfYn"
	, "ivsdesSrno", "fndSvvlAcuCn", "cusPrtfRgsNo", "rcpDtm", "pnsfndAcno", "mmfFndAcno", "pnsfndNewYn", "frstNwactNo", "scndNwactNo", "fndOpngDt", "krwSscoNewTlmNo", "atsDtlDscd", "atsRcvLmtAm", "krwFmbkMmdaYn", "opgOrdsMngNo"
	, "spcfPrdMoAcno", "restTxprLmtAm", "dppeAcno", "pmnyIdeedYn", "tdyCancAcno", "cbrseNewYn", "fmbkNewCitAtsCancYn", "cnstDdctFxpdGrnYr5OverYn", "aprrBrdmCd", "cmpnOv1peYn", "pnsfndCoreOupYn", "rtpenPlanAplDt", "rtpenPlanItcsno", "glblBnkgJnngYn", "idCadNewDscd"
	, "encyEbnkPwnoCnf", "tlbnkPwnoCnf", "gridRowCnt", "grid", "gridRowCnt2", "grid2"
}, name="MnyPinBscMngInsertMnpMoAcno_DIDT")
@XmlRootElement(name="MnyPinBscMngInsertMnpMoAcno_DIDT")
@BxmCategory(logicalName="머니클립.모.계좌.등록.컴포넌트.입력.IO", description="") 
public class MnyPinBscMngInsertMnpMoAcno_DIDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -1581663800L;
	
	
	
	/**
	 * 차명거래확인서징구여부
	 */
	@ApiModelProperty(
		name = "sqcNmTrnCfdocCollYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("sqcNmTrnCfdocCollYn")
	@BxmOmm_Field(length=1, decimal=0, description="차명거래확인서징구여부", align="left", fill="")
	private String sqcNmTrnCfdocCollYn= "";
	
	
	/**
	 * 수신신규구분코드
	 */
	@ApiModelProperty(
		name = "dpsNewDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dpsNewDscd")
	@BxmOmm_Field(length=2, decimal=0, description="수신신규구분코드", align="left", fill="")
	private String dpsNewDscd= "";
	
	
	/**
	 * 수신예약신규구분코드
	 */
	@ApiModelProperty(
		name = "dpsRsvNewDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dpsRsvNewDscd")
	@BxmOmm_Field(length=1, decimal=0, description="수신예약신규구분코드", align="left", fill="")
	private String dpsRsvNewDscd= "";
	
	
	/**
	 * 암호화계좌비밀번호
	 */
	@ApiModelProperty(
		name = "encyActPwno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("encyActPwno")
	@BxmOmm_Field(length=32, decimal=0, description="암호화계좌비밀번호", align="left", fill="")
	private String encyActPwno= "";
	
	
	/**
	 * 인감서명사용구분코드
	 */
	@ApiModelProperty(
		name = "sealSignUsgDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("sealSignUsgDscd")
	@BxmOmm_Field(length=1, decimal=0, description="인감서명사용구분코드", align="left", fill="")
	private String sealSignUsgDscd= "";
	
	
	/**
	 * 상품코드
	 */
	@ApiModelProperty(
		name = "pdcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("pdcd")
	@BxmOmm_Field(length=13, decimal=0, description="상품코드", align="left", fill="")
	private String pdcd= "";
	
	
	/**
	 * 고객번호
	 */
	@ApiModelProperty(
		name = "csno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("csno")
	@BxmOmm_Field(length=9, decimal=0, description="고객번호", align="left", fill="")
	private String csno= "";
	
	
	/**
	 * 고객지정계좌번호
	 */
	@ApiModelProperty(
		name = "cusDgnAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("cusDgnAcno")
	@BxmOmm_Field(length=6, decimal=0, description="고객지정계좌번호", align="left", fill="")
	private String cusDgnAcno= "";
	
	
	/**
	 * 사전등록비밀번호키
	 */
	@ApiModelProperty(
		name = "prrRgsPwnoKey"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("prrRgsPwnoKey")
	@BxmOmm_Field(length=7, decimal=0, description="사전등록비밀번호키", align="left", fill="")
	private String prrRgsPwnoKey= "";
	
	
	/**
	 * SMS발송구분코드
	 */
	@ApiModelProperty(
		name = "smsdDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("smsdDscd")
	@BxmOmm_Field(length=1, decimal=0, description="SMS발송구분코드", align="left", fill="")
	private String smsdDscd= "";
	
	
	/**
	 * 개인정보노출확인여부
	 */
	@ApiModelProperty(
		name = "psnInfExpsCnfYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("psnInfExpsCnfYn")
	@BxmOmm_Field(length=1, decimal=0, description="개인정보노출확인여부", align="left", fill="")
	private String psnInfExpsCnfYn= "";
	
	
	/**
	 * 스캔불가사유코드
	 */
	@ApiModelProperty(
		name = "scanUablRncd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("scanUablRncd")
	@BxmOmm_Field(length=1, decimal=0, description="스캔불가사유코드", align="left", fill="")
	private String scanUablRncd= "";
	
	
	/**
	 * 개인정보동의서관리번호
	 */
	@ApiModelProperty(
		name = "psnInfAgmdMngNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("psnInfAgmdMngNo")
	@BxmOmm_Field(length=19, decimal=0, description="개인정보동의서관리번호", align="left", fill="")
	private String psnInfAgmdMngNo= "";
	
	
	/**
	 * 실명확인직원번호
	 */
	@ApiModelProperty(
		name = "acnmCnfEno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("acnmCnfEno")
	@BxmOmm_Field(length=8, decimal=0, description="실명확인직원번호", align="left", fill="")
	private String acnmCnfEno= "";
	
	
	/**
	 * 권유자직원번호
	 */
	@ApiModelProperty(
		name = "advpeEno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("advpeEno")
	@BxmOmm_Field(length=8, decimal=0, description="권유자직원번호", align="left", fill="")
	private String advpeEno= "";
	
	
	/**
	 * 신분증구분코드
	 */
	@ApiModelProperty(
		name = "idcrDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("idcrDscd")
	@BxmOmm_Field(length=2, decimal=0, description="신분증구분코드", align="left", fill="")
	private String idcrDscd= "";
	
	
	/**
	 * 신분증성명
	 */
	@ApiModelProperty(
		name = "idcrFnm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("idcrFnm")
	@BxmOmm_Field(length=50, decimal=0, description="신분증성명", align="left", fill="")
	private String idcrFnm= "";
	
	
	/**
	 * 신분증암호화주민번호
	 */
	@ApiModelProperty(
		name = "idcrEncyRsdlNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("idcrEncyRsdlNo")
	@BxmOmm_Field(length=32, decimal=0, description="신분증암호화주민번호", align="left", fill="")
	private String idcrEncyRsdlNo= "";
	
	
	/**
	 * 신분증발급일자
	 */
	@ApiModelProperty(
		name = "idcrIsuDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("idcrIsuDt")
	@BxmOmm_Field(length=8, decimal=0, description="신분증발급일자", align="left", fill="")
	private String idcrIsuDt= "";
	
	
	/**
	 * 신분증이미지키
	 */
	@ApiModelProperty(
		name = "idcrImgKey"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("idcrImgKey")
	@BxmOmm_Field(length=13, decimal=0, description="신분증이미지키", align="left", fill="")
	private String idcrImgKey= "";
	
	
	/**
	 * 신분증확인형태
	 */
	@ApiModelProperty(
		name = "idcrCnfShap"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("idcrCnfShap")
	@BxmOmm_Field(length=1, decimal=0, description="신분증확인형태", align="left", fill="")
	private String idcrCnfShap= "";
	
	
	/**
	 * 신분증재사용여부
	 */
	@ApiModelProperty(
		name = "idcrRuseYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("idcrRuseYn")
	@BxmOmm_Field(length=1, decimal=0, description="신분증재사용여부", align="left", fill="")
	private String idcrRuseYn= "";
	
	
	/**
	 * 신분증대리인거래여부
	 */
	@ApiModelProperty(
		name = "idcrAgnpeTrnYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("idcrAgnpeTrnYn")
	@BxmOmm_Field(length=1, decimal=0, description="신분증대리인거래여부", align="left", fill="")
	private String idcrAgnpeTrnYn= "";
	
	
	/**
	 * 앱등록구분코드
	 */
	@ApiModelProperty(
		name = "appRgsDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("appRgsDscd")
	@BxmOmm_Field(length=5, decimal=0, description="앱등록구분코드", align="left", fill="")
	private String appRgsDscd= "";
	
	
	/**
	 * 앱등록점코드
	 */
	@ApiModelProperty(
		name = "appRgsBrcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("appRgsBrcd")
	@BxmOmm_Field(length=6, decimal=0, description="앱등록점코드", align="left", fill="")
	private String appRgsBrcd= "";
	
	
	/**
	 * 앱등록일자
	 */
	@ApiModelProperty(
		name = "appRgsDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("appRgsDt")
	@BxmOmm_Field(length=8, decimal=0, description="앱등록일자", align="left", fill="")
	private String appRgsDt= "";
	
	
	/**
	 * 앱등록일련번호
	 */
	@ApiModelProperty(
		name = "appRgsSrno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("appRgsSrno")
	@BxmOmm_Field(length=5, decimal=0, description="앱등록일련번호", align="left", fill="")
	private String appRgsSrno= "";
	
	
	/**
	 * WMS연동여부
	 */
	@ApiModelProperty(
		name = "wmsLnkYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("wmsLnkYn")
	@BxmOmm_Field(length=1, decimal=0, description="WMS연동여부", align="left", fill="")
	private String wmsLnkYn= "";
	
	
	/**
	 * 종합자산관리고객번호
	 */
	@ApiModelProperty(
		name = "snthAsetMngCsno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("snthAsetMngCsno")
	@BxmOmm_Field(length=9, decimal=0, description="종합자산관리고객번호", align="left", fill="")
	private String snthAsetMngCsno= "";
	
	
	/**
	 * 종합자산관리설계상품건수
	 */
	@ApiModelProperty(
		name = "snthAsetMngDesgnPrdCnt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("snthAsetMngDesgnPrdCnt")
	@BxmOmm_Field(length=6, decimal=0, description="종합자산관리설계상품건수", align="left", fill="")
	private String snthAsetMngDesgnPrdCnt= "";
	
	
	/**
	 * 종합자산관리대안투자비중
	 */
	@ApiModelProperty(
		name = "snthAsetMngAltrIvstWgt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("snthAsetMngAltrIvstWgt")
	@BxmOmm_Field(length=6, decimal=0, description="종합자산관리대안투자비중", align="left", fill="")
	private String snthAsetMngAltrIvstWgt= "";
	
	
	/**
	 * 종합자산관리방카슈랑스비중
	 */
	@ApiModelProperty(
		name = "snthAsetMngBksWgt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("snthAsetMngBksWgt")
	@BxmOmm_Field(length=6, decimal=0, description="종합자산관리방카슈랑스비중", align="left", fill="")
	private String snthAsetMngBksWgt= "";
	
	
	/**
	 * 종합자산관리해외채권비중
	 */
	@ApiModelProperty(
		name = "snthAsetMngFrgBndWgt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("snthAsetMngFrgBndWgt")
	@BxmOmm_Field(length=6, decimal=0, description="종합자산관리해외채권비중", align="left", fill="")
	private String snthAsetMngFrgBndWgt= "";
	
	
	/**
	 * 종합자산관리해외주식비중
	 */
	@ApiModelProperty(
		name = "snthAsetMngFrgStcWgt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("snthAsetMngFrgStcWgt")
	@BxmOmm_Field(length=6, decimal=0, description="종합자산관리해외주식비중", align="left", fill="")
	private String snthAsetMngFrgStcWgt= "";
	
	
	/**
	 * 종합자산관리상품코드
	 */
	@ApiModelProperty(
		name = "snthAsetMngPdcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("snthAsetMngPdcd")
	@BxmOmm_Field(length=13, decimal=0, description="종합자산관리상품코드", align="left", fill="")
	private String snthAsetMngPdcd= "";
	
	
	/**
	 * 앱등록비밀번호
	 */
	@ApiModelProperty(
		name = "appRgsPwno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("appRgsPwno")
	@BxmOmm_Field(length=32, decimal=0, description="앱등록비밀번호", align="left", fill="")
	private String appRgsPwno= "";
	
	
	/**
	 * 앱등록자동이체계좌번호
	 */
	@ApiModelProperty(
		name = "appRgsAtsAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("appRgsAtsAcno")
	@BxmOmm_Field(length=15, decimal=0, description="앱등록자동이체계좌번호", align="left", fill="")
	private String appRgsAtsAcno= "";
	
	
	/**
	 * WM연동거래일련번호
	 */
	@ApiModelProperty(
		name = "wmLnkTrnSrno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("wmLnkTrnSrno")
	@BxmOmm_Field(length=16, decimal=0, description="WM연동거래일련번호", align="left", fill="")
	private String wmLnkTrnSrno= "";
	
	
	/**
	 * 종합자산관리증서코드
	 */
	@ApiModelProperty(
		name = "snthAsetMngDeedCd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("snthAsetMngDeedCd")
	@BxmOmm_Field(length=4, decimal=0, description="종합자산관리증서코드", align="left", fill="")
	private String snthAsetMngDeedCd= "";
	
	
	/**
	 * 종합자산관리유동성비중
	 */
	@ApiModelProperty(
		name = "snthAsetMngFlwWgt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("snthAsetMngFlwWgt")
	@BxmOmm_Field(length=6, decimal=0, description="종합자산관리유동성비중", align="left", fill="")
	private String snthAsetMngFlwWgt= "";
	
	
	/**
	 * 종합자산관리국내주식비중
	 */
	@ApiModelProperty(
		name = "snthAsetMngDomStcWgt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("snthAsetMngDomStcWgt")
	@BxmOmm_Field(length=6, decimal=0, description="종합자산관리국내주식비중", align="left", fill="")
	private String snthAsetMngDomStcWgt= "";
	
	
	/**
	 * 종합자산관리국내채권비중
	 */
	@ApiModelProperty(
		name = "snthAsetMngDomBndWgt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("snthAsetMngDomBndWgt")
	@BxmOmm_Field(length=6, decimal=0, description="종합자산관리국내채권비중", align="left", fill="")
	private String snthAsetMngDomBndWgt= "";
	
	
	/**
	 * 상품적합성분석일련번호
	 */
	@ApiModelProperty(
		name = "prdStbyAnlsSrno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("prdStbyAnlsSrno")
	@BxmOmm_Field(length=5, decimal=0, description="상품적합성분석일련번호", align="left", fill="")
	private String prdStbyAnlsSrno= "";
	
	
	/**
	 * 성향분석일련번호
	 */
	@ApiModelProperty(
		name = "inlnAnlsSrno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("inlnAnlsSrno")
	@BxmOmm_Field(length=8, decimal=0, description="성향분석일련번호", align="left", fill="")
	private String inlnAnlsSrno= "";
	
	
	/**
	 * 자산기관관리번호
	 */
	@ApiModelProperty(
		name = "asetIstMngNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("asetIstMngNo")
	@BxmOmm_Field(length=20, decimal=0, description="자산기관관리번호", align="left", fill="")
	private String asetIstMngNo= "";
	
	
	/**
	 * 퇴직연금플랜원상품코드
	 */
	@ApiModelProperty(
		name = "rtpenPlanOrgPdcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rtpenPlanOrgPdcd")
	@BxmOmm_Field(length=13, decimal=0, description="퇴직연금플랜원상품코드", align="left", fill="")
	private String rtpenPlanOrgPdcd= "";
	
	
	/**
	 * 가입자유형코드
	 */
	@ApiModelProperty(
		name = "jnpeTycd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("jnpeTycd")
	@BxmOmm_Field(length=1, decimal=0, description="가입자유형코드", align="left", fill="")
	private String jnpeTycd= "";
	
	
	/**
	 * 펀드전문가정기상담서비스구분코드
	 */
	@ApiModelProperty(
		name = "fndSgpFpCnslSrvcDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("fndSgpFpCnslSrvcDscd")
	@BxmOmm_Field(length=1, decimal=0, description="펀드전문가정기상담서비스구분코드", align="left", fill="")
	private String fndSgpFpCnslSrvcDscd= "";
	
	
	/**
	 * 주민사업자번호
	 */
	@ApiModelProperty(
		name = "rsdlBzpeNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rsdlBzpeNo")
	@BxmOmm_Field(length=13, decimal=0, description="주민사업자번호", align="left", fill="")
	private String rsdlBzpeNo= "";
	
	
	/**
	 * 외국인최종유효기간
	 */
	@ApiModelProperty(
		name = "frnrLstVldTem"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("frnrLstVldTem")
	@BxmOmm_Field(length=10, decimal=0, description="외국인최종유효기간", align="left", fill="")
	private String frnrLstVldTem= "";
	
	
	/**
	 * 인터넷예약접수구분코드
	 */
	@ApiModelProperty(
		name = "inetRsvRcpDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("inetRsvRcpDscd")
	@BxmOmm_Field(length=1, decimal=0, description="인터넷예약접수구분코드", align="left", fill="")
	private String inetRsvRcpDscd= "";
	
	
	/**
	 * 인터넷예약식별번호
	 */
	@ApiModelProperty(
		name = "inetRsvIdfNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("inetRsvIdfNo")
	@BxmOmm_Field(length=13, decimal=0, description="인터넷예약식별번호", align="left", fill="")
	private String inetRsvIdfNo= "";
	
	
	/**
	 * 인터넷예약번호
	 */
	@ApiModelProperty(
		name = "inetRsvNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("inetRsvNo")
	@BxmOmm_Field(length=5, decimal=0, description="인터넷예약번호", align="left", fill="")
	private String inetRsvNo= "";
	
	
	/**
	 * 인터넷예약고객순신규여부
	 */
	@ApiModelProperty(
		name = "inetRsvCusPureNewYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("inetRsvCusPureNewYn")
	@BxmOmm_Field(length=1, decimal=0, description="인터넷예약고객순신규여부", align="left", fill="")
	private String inetRsvCusPureNewYn= "";
	
	
	/**
	 * 종합통장상품코드
	 */
	@ApiModelProperty(
		name = "synpbPdcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("synpbPdcd")
	@BxmOmm_Field(length=13, decimal=0, description="종합통장상품코드", align="left", fill="")
	private String synpbPdcd= "";
	
	
	/**
	 * 계좌사용목적구분
	 */
	@ApiModelProperty(
		name = "actUsgAimDis"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("actUsgAimDis")
	@BxmOmm_Field(length=1, decimal=0, description="계좌사용목적구분", align="left", fill="")
	private String actUsgAimDis= "";
	
	
	/**
	 * 외국인취업교육여부
	 */
	@ApiModelProperty(
		name = "frnrEmptEduYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("frnrEmptEduYn")
	@BxmOmm_Field(length=1, decimal=0, description="외국인취업교육여부", align="left", fill="")
	private String frnrEmptEduYn= "";
	
	
	/**
	 * 금융거래목적징구구분
	 */
	@ApiModelProperty(
		name = "fncTrnAimCollDis"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("fncTrnAimCollDis")
	@BxmOmm_Field(length=1, decimal=0, description="금융거래목적징구구분", align="left", fill="")
	private String fncTrnAimCollDis= "";
	
	
	/**
	 * 다수계좌개설사유
	 */
	@ApiModelProperty(
		name = "lnoActOpngRsn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("lnoActOpngRsn")
	@BxmOmm_Field(length=1, decimal=0, description="다수계좌개설사유", align="left", fill="")
	private String lnoActOpngRsn= "";
	
	
	/**
	 * 대포통장증빙서류징구여부
	 */
	@ApiModelProperty(
		name = "depaCrdcCollYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("depaCrdcCollYn")
	@BxmOmm_Field(length=1, decimal=0, description="대포통장증빙서류징구여부", align="left", fill="")
	private String depaCrdcCollYn= "";
	
	
	/**
	 * ID카드발급신청서사용여부
	 */
	@ApiModelProperty(
		name = "idCadIsuRqdcUsgYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("idCadIsuRqdcUsgYn")
	@BxmOmm_Field(length=1, decimal=0, description="ID카드발급신청서사용여부", align="left", fill="")
	private String idCadIsuRqdcUsgYn= "";
	
	
	/**
	 * 입금증무인자여부
	 */
	@ApiModelProperty(
		name = "rcvVcrMlsChidYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rcvVcrMlsChidYn")
	@BxmOmm_Field(length=1, decimal=0, description="입금증무인자여부", align="left", fill="")
	private String rcvVcrMlsChidYn= "";
	
	
	/**
	 * 급여이체예정일
	 */
	@ApiModelProperty(
		name = "saltsScdDd"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("saltsScdDd")
	@BxmOmm_Field(length=2, decimal=0, description="급여이체예정일", align="right", fill="0")
	private Integer saltsScdDd= 0;
	
	
	/**
	 * 자동화기기출금구분코드
	 */
	@ApiModelProperty(
		name = "atmWdrDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atmWdrDscd")
	@BxmOmm_Field(length=1, decimal=0, description="자동화기기출금구분코드", align="left", fill="")
	private String atmWdrDscd= "";
	
	
	/**
	 * 연결거래종류코드
	 */
	@ApiModelProperty(
		name = "cctnTrnKdcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("cctnTrnKdcd")
	@BxmOmm_Field(length=1, decimal=0, description="연결거래종류코드", align="left", fill="")
	private String cctnTrnKdcd= "";
	
	
	/**
	 * ID카드발급여부
	 */
	@ApiModelProperty(
		name = "idCadIsuYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("idCadIsuYn")
	@BxmOmm_Field(length=1, decimal=0, description="ID카드발급여부", align="left", fill="")
	private String idCadIsuYn= "";
	
	
	/**
	 * 파트너우대금리1여부
	 */
	@ApiModelProperty(
		name = "ptnrPrmeIr1Yn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ptnrPrmeIr1Yn")
	@BxmOmm_Field(length=1, decimal=0, description="파트너우대금리1여부", align="left", fill="")
	private String ptnrPrmeIr1Yn= "";
	
	
	/**
	 * 파트너우대금리2여부
	 */
	@ApiModelProperty(
		name = "ptnrPrmeIr2Yn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ptnrPrmeIr2Yn")
	@BxmOmm_Field(length=1, decimal=0, description="파트너우대금리2여부", align="left", fill="")
	private String ptnrPrmeIr2Yn= "";
	
	
	/**
	 * 파트너우대금리3여부
	 */
	@ApiModelProperty(
		name = "ptnrPrmeIr3Yn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ptnrPrmeIr3Yn")
	@BxmOmm_Field(length=1, decimal=0, description="파트너우대금리3여부", align="left", fill="")
	private String ptnrPrmeIr3Yn= "";
	
	
	/**
	 * 파트너우대금리4여부
	 */
	@ApiModelProperty(
		name = "ptnrPrmeIr4Yn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ptnrPrmeIr4Yn")
	@BxmOmm_Field(length=1, decimal=0, description="파트너우대금리4여부", align="left", fill="")
	private String ptnrPrmeIr4Yn= "";
	
	
	/**
	 * 단체통장명
	 */
	@ApiModelProperty(
		name = "ascnPbokNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ascnPbokNm")
	@BxmOmm_Field(length=20, decimal=0, description="단체통장명", align="left", fill="")
	private String ascnPbokNm= "";
	
	
	/**
	 * 입금자명
	 */
	@ApiModelProperty(
		name = "rcvpeNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rcvpeNm")
	@BxmOmm_Field(length=22, decimal=0, description="입금자명", align="left", fill="")
	private String rcvpeNm= "";
	
	
	/**
	 * 입금일
	 */
	@ApiModelProperty(
		name = "rcvDd"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("rcvDd")
	@BxmOmm_Field(length=2, decimal=0, description="입금일", align="right", fill="0")
	private Integer rcvDd= 0;
	
	
	/**
	 * 기부자동이체종료일자
	 */
	@ApiModelProperty(
		name = "dntnAtsEndDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dntnAtsEndDt")
	@BxmOmm_Field(length=8, decimal=0, description="기부자동이체종료일자", align="left", fill="")
	private String dntnAtsEndDt= "";
	
	
	/**
	 * 후원단체계좌번호
	 */
	@ApiModelProperty(
		name = "patnAscnAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("patnAscnAcno")
	@BxmOmm_Field(length=13, decimal=0, description="후원단체계좌번호", align="left", fill="")
	private String patnAscnAcno= "";
	
	
	/**
	 * 후원단체명
	 */
	@ApiModelProperty(
		name = "patnAscnNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("patnAscnNm")
	@BxmOmm_Field(length=32, decimal=0, description="후원단체명", align="left", fill="")
	private String patnAscnNm= "";
	
	
	/**
	 * 목적자금명
	 */
	@ApiModelProperty(
		name = "aimFdNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("aimFdNm")
	@BxmOmm_Field(length=40, decimal=0, description="목적자금명", align="left", fill="")
	private String aimFdNm= "";
	
	
	/**
	 * 후원단체구분
	 */
	@ApiModelProperty(
		name = "patnAscnDis"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("patnAscnDis")
	@BxmOmm_Field(length=1, decimal=0, description="후원단체구분", align="left", fill="")
	private String patnAscnDis= "";
	
	
	/**
	 * 후원핸드폰번호
	 */
	@ApiModelProperty(
		name = "patnHpNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("patnHpNo")
	@BxmOmm_Field(length=4, decimal=0, description="후원핸드폰번호", align="left", fill="")
	private String patnHpNo= "";
	
	
	/**
	 * 자녀주민등록번호
	 */
	@ApiModelProperty(
		name = "chilRrno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("chilRrno")
	@BxmOmm_Field(length=13, decimal=0, description="자녀주민등록번호", align="left", fill="")
	private String chilRrno= "";
	
	
	/**
	 * 기부정보제공동의여부
	 */
	@ApiModelProperty(
		name = "dntnInfOfrAgrYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dntnInfOfrAgrYn")
	@BxmOmm_Field(length=1, decimal=0, description="기부정보제공동의여부", align="left", fill="")
	private String dntnInfOfrAgrYn= "";
	
	
	/**
	 * 기부처코드
	 */
	@ApiModelProperty(
		name = "dntnlCd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dntnlCd")
	@BxmOmm_Field(length=1, decimal=0, description="기부처코드", align="left", fill="")
	private String dntnlCd= "";
	
	
	/**
	 * 결산자동이체신청여부
	 */
	@ApiModelProperty(
		name = "clsaAtsRqYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("clsaAtsRqYn")
	@BxmOmm_Field(length=1, decimal=0, description="결산자동이체신청여부", align="left", fill="")
	private String clsaAtsRqYn= "";
	
	
	/**
	 * 결산자동이체공금계좌번호
	 */
	@ApiModelProperty(
		name = "clsaAtsPmnyAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("clsaAtsPmnyAcno")
	@BxmOmm_Field(length=15, decimal=0, description="결산자동이체공금계좌번호", align="left", fill="")
	private String clsaAtsPmnyAcno= "";
	
	
	/**
	 * 결산자동이체종료일자
	 */
	@ApiModelProperty(
		name = "clsaAtsEndDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("clsaAtsEndDt")
	@BxmOmm_Field(length=8, decimal=0, description="결산자동이체종료일자", align="left", fill="")
	private String clsaAtsEndDt= "";
	
	
	/**
	 * 금융과세SMS신청여부
	 */
	@ApiModelProperty(
		name = "fncTaxtSmsRqYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("fncTaxtSmsRqYn")
	@BxmOmm_Field(length=1, decimal=0, description="금융과세SMS신청여부", align="left", fill="")
	private String fncTaxtSmsRqYn= "";
	
	
	/**
	 * 복지시설고유번호
	 */
	@ApiModelProperty(
		name = "wfFclUnqNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("wfFclUnqNo")
	@BxmOmm_Field(length=5, decimal=0, description="복지시설고유번호", align="left", fill="")
	private String wfFclUnqNo= "";
	
	
	/**
	 * 저탄소우대여부
	 */
	@ApiModelProperty(
		name = "locaPrmeYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("locaPrmeYn")
	@BxmOmm_Field(length=1, decimal=0, description="저탄소우대여부", align="left", fill="")
	private String locaPrmeYn= "";
	
	
	/**
	 * 제휴업무코드
	 */
	@ApiModelProperty(
		name = "afiBzcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("afiBzcd")
	@BxmOmm_Field(length=2, decimal=0, description="제휴업무코드", align="left", fill="")
	private String afiBzcd= "";
	
	
	/**
	 * 이메일통지서비스여부
	 */
	@ApiModelProperty(
		name = "emlNtcSrvcYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("emlNtcSrvcYn")
	@BxmOmm_Field(length=1, decimal=0, description="이메일통지서비스여부", align="left", fill="")
	private String emlNtcSrvcYn= "";
	
	
	/**
	 * 펌뱅킹계약서징구여부
	 */
	@ApiModelProperty(
		name = "fmbkCtrdCollYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("fmbkCtrdCollYn")
	@BxmOmm_Field(length=1, decimal=0, description="펌뱅킹계약서징구여부", align="left", fill="")
	private String fmbkCtrdCollYn= "";
	
	
	/**
	 * 사고신고등록여부
	 */
	@ApiModelProperty(
		name = "adrpRgsYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("adrpRgsYn")
	@BxmOmm_Field(length=1, decimal=0, description="사고신고등록여부", align="left", fill="")
	private String adrpRgsYn= "";
	
	
	/**
	 * 회원여부
	 */
	@ApiModelProperty(
		name = "mbhYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("mbhYn")
	@BxmOmm_Field(length=1, decimal=0, description="회원여부", align="left", fill="")
	private String mbhYn= "";
	
	
	/**
	 * 개인정보동의여부
	 */
	@ApiModelProperty(
		name = "psnInfAgrYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("psnInfAgrYn")
	@BxmOmm_Field(length=1, decimal=0, description="개인정보동의여부", align="left", fill="")
	private String psnInfAgrYn= "";
	
	
	/**
	 * 데이터적립핸드폰번호
	 */
	@ApiModelProperty(
		name = "datAcldHpNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("datAcldHpNo")
	@BxmOmm_Field(length=11, decimal=0, description="데이터적립핸드폰번호", align="left", fill="")
	private String datAcldHpNo= "";
	
	
	/**
	 * 수신일괄의뢰번호
	 */
	@ApiModelProperty(
		name = "dpsBatRqsNo"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("dpsBatRqsNo")
	@BxmOmm_Field(length=3, decimal=0, description="수신일괄의뢰번호", align="right", fill="0")
	private Integer dpsBatRqsNo= 0;
	
	
	/**
	 * 수신일괄의뢰일련번호
	 */
	@ApiModelProperty(
		name = "dpsBatRqsSrno"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("dpsBatRqsSrno")
	@BxmOmm_Field(length=7, decimal=0, description="수신일괄의뢰일련번호", align="right", fill="0")
	private Integer dpsBatRqsSrno= 0;
	
	
	/**
	 * 대리인암호화주민등록번호
	 */
	@ApiModelProperty(
		name = "agnpeEncyRrno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("agnpeEncyRrno")
	@BxmOmm_Field(length=32, decimal=0, description="대리인암호화주민등록번호", align="left", fill="")
	private String agnpeEncyRrno= "";
	
	
	/**
	 * 대리인성명
	 */
	@ApiModelProperty(
		name = "agnpeFnm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("agnpeFnm")
	@BxmOmm_Field(length=30, decimal=0, description="대리인성명", align="left", fill="")
	private String agnpeFnm= "";
	
	
	/**
	 * 대표자중복생략여부
	 */
	@ApiModelProperty(
		name = "rppeDupOmitYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rppeDupOmitYn")
	@BxmOmm_Field(length=1, decimal=0, description="대표자중복생략여부", align="left", fill="")
	private String rppeDupOmitYn= "";
	
	
	/**
	 * 대표자대리인일치여부
	 */
	@ApiModelProperty(
		name = "rppeAgnpeAcrdYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rppeAgnpeAcrdYn")
	@BxmOmm_Field(length=1, decimal=0, description="대표자대리인일치여부", align="left", fill="")
	private String rppeAgnpeAcrdYn= "";
	
	
	/**
	 * 대표자성명
	 */
	@ApiModelProperty(
		name = "rppeFnm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rppeFnm")
	@BxmOmm_Field(length=30, decimal=0, description="대표자성명", align="left", fill="")
	private String rppeFnm= "";
	
	
	/**
	 * 대표자암호화주민등록번호
	 */
	@ApiModelProperty(
		name = "rppeEncyRrno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rppeEncyRrno")
	@BxmOmm_Field(length=32, decimal=0, description="대표자암호화주민등록번호", align="left", fill="")
	private String rppeEncyRrno= "";
	
	
	/**
	 * 대리인중복여부
	 */
	@ApiModelProperty(
		name = "agnpeDupYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("agnpeDupYn")
	@BxmOmm_Field(length=1, decimal=0, description="대리인중복여부", align="left", fill="")
	private String agnpeDupYn= "";
	
	
	/**
	 * 대표자중복여부
	 */
	@ApiModelProperty(
		name = "rppeDupYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rppeDupYn")
	@BxmOmm_Field(length=1, decimal=0, description="대표자중복여부", align="left", fill="")
	private String rppeDupYn= "";
	
	
	/**
	 * 이자지급방법코드
	 */
	@ApiModelProperty(
		name = "itpyMecd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("itpyMecd")
	@BxmOmm_Field(length=2, decimal=0, description="이자지급방법코드", align="left", fill="")
	private String itpyMecd= "";
	
	
	/**
	 * 이자지급주기코드
	 */
	@ApiModelProperty(
		name = "itpyCycd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("itpyCycd")
	@BxmOmm_Field(length=2, decimal=0, description="이자지급주기코드", align="left", fill="")
	private String itpyCycd= "";
	
	
	/**
	 * 차기이자지급일자
	 */
	@ApiModelProperty(
		name = "nextItpyDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("nextItpyDt")
	@BxmOmm_Field(length=8, decimal=0, description="차기이자지급일자", align="left", fill="")
	private String nextItpyDt= "";
	
	
	/**
	 * 계좌관리점코드
	 */
	@ApiModelProperty(
		name = "actMngBrcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("actMngBrcd")
	@BxmOmm_Field(length=6, decimal=0, description="계좌관리점코드", align="left", fill="")
	private String actMngBrcd= "";
	
	
	/**
	 * 공동명의예금여부
	 */
	@ApiModelProperty(
		name = "asscNmnlDpstYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("asscNmnlDpstYn")
	@BxmOmm_Field(length=1, decimal=0, description="공동명의예금여부", align="left", fill="")
	private String asscNmnlDpstYn= "";
	
	
	/**
	 * NET거래승인번호
	 */
	@ApiModelProperty(
		name = "netrApvNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("netrApvNo")
	@BxmOmm_Field(length=4, decimal=0, description="NET거래승인번호", align="left", fill="")
	private String netrApvNo= "";
	
	
	/**
	 * 모바일통장가입여부
	 */
	@ApiModelProperty(
		name = "mbpbkJnngYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("mbpbkJnngYn")
	@BxmOmm_Field(length=1, decimal=0, description="모바일통장가입여부", align="left", fill="")
	private String mbpbkJnngYn= "";
	
	
	/**
	 * 모바일통장인터넷뱅킹ID
	 */
	@ApiModelProperty(
		name = "mblPbokInetBnkgId"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("mblPbokInetBnkgId")
	@BxmOmm_Field(length=10, decimal=0, description="모바일통장인터넷뱅킹ID", align="left", fill="")
	private String mblPbokInetBnkgId= "";
	
	
	/**
	 * 무통장IC카드발급구분
	 */
	@ApiModelProperty(
		name = "npbokIccadIsuDis"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("npbokIccadIsuDis")
	@BxmOmm_Field(length=1, decimal=0, description="무통장IC카드발급구분", align="left", fill="")
	private String npbokIccadIsuDis= "";
	
	
	/**
	 * 중요증서코드
	 */
	@ApiModelProperty(
		name = "ideedCd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ideedCd")
	@BxmOmm_Field(length=4, decimal=0, description="중요증서코드", align="left", fill="")
	private String ideedCd= "";
	
	
	/**
	 * 통장영문인자여부
	 */
	@ApiModelProperty(
		name = "pbokEngPrngYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("pbokEngPrngYn")
	@BxmOmm_Field(length=1, decimal=0, description="통장영문인자여부", align="left", fill="")
	private String pbokEngPrngYn= "";
	
	
	/**
	 * 국가구분코드
	 */
	@ApiModelProperty(
		name = "nlDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("nlDscd")
	@BxmOmm_Field(length=1, decimal=0, description="국가구분코드", align="left", fill="")
	private String nlDscd= "";
	
	
	/**
	 * 수신증서번호
	 */
	@ApiModelProperty(
		name = "dpsDeedNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dpsDeedNo")
	@BxmOmm_Field(length=8, decimal=0, description="수신증서번호", align="left", fill="")
	private String dpsDeedNo= "";
	
	
	/**
	 * 통장발행여부
	 */
	@ApiModelProperty(
		name = "pbokIssuYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("pbokIssuYn")
	@BxmOmm_Field(length=1, decimal=0, description="통장발행여부", align="left", fill="")
	private String pbokIssuYn= "";
	
	
	/**
	 * 상품안내통장인자여부
	 */
	@ApiModelProperty(
		name = "prdGdncPbokPrngYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("prdGdncPbokPrngYn")
	@BxmOmm_Field(length=1, decimal=0, description="상품안내통장인자여부", align="left", fill="")
	private String prdGdncPbokPrngYn= "";
	
	
	/**
	 * 비거주자확인서류징구여부
	 */
	@ApiModelProperty(
		name = "nrsrCnfDocCollYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("nrsrCnfDocCollYn")
	@BxmOmm_Field(length=1, decimal=0, description="비거주자확인서류징구여부", align="left", fill="")
	private String nrsrCnfDocCollYn= "";
	
	
	/**
	 * 한국은행신고허가제외여부
	 */
	@ApiModelProperty(
		name = "bokStttPermXtYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("bokStttPermXtYn")
	@BxmOmm_Field(length=1, decimal=0, description="한국은행신고허가제외여부", align="left", fill="")
	private String bokStttPermXtYn= "";
	
	
	/**
	 * 비거주자비밀번호등록여부
	 */
	@ApiModelProperty(
		name = "nrsrPwnoRgsYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("nrsrPwnoRgsYn")
	@BxmOmm_Field(length=1, decimal=0, description="비거주자비밀번호등록여부", align="left", fill="")
	private String nrsrPwnoRgsYn= "";
	
	
	/**
	 * 비거주자계정코드
	 */
	@ApiModelProperty(
		name = "nrsrAccCd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("nrsrAccCd")
	@BxmOmm_Field(length=1, decimal=0, description="비거주자계정코드", align="left", fill="")
	private String nrsrAccCd= "";
	
	
	/**
	 * 원화수신계정구분코드
	 */
	@ApiModelProperty(
		name = "krwDpsAccDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("krwDpsAccDscd")
	@BxmOmm_Field(length=2, decimal=0, description="원화수신계정구분코드", align="left", fill="")
	private String krwDpsAccDscd= "";
	
	
	/**
	 * 비거주자원화유입구분코드
	 */
	@ApiModelProperty(
		name = "nrsrKrwInfwDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("nrsrKrwInfwDscd")
	@BxmOmm_Field(length=2, decimal=0, description="비거주자원화유입구분코드", align="left", fill="")
	private String nrsrKrwInfwDscd= "";
	
	
	/**
	 * 세금우대구분코드
	 */
	@ApiModelProperty(
		name = "txprDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("txprDscd")
	@BxmOmm_Field(length=2, decimal=0, description="세금우대구분코드", align="left", fill="")
	private String txprDscd= "";
	
	
	/**
	 * 세금우대한도금액
	 */
	@ApiModelProperty(
		name = "txprLmtAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("txprLmtAm")
	@BxmOmm_Field(length=19, decimal=3, description="세금우대한도금액", align="right", fill="0")
	private BigDecimal txprLmtAm= new BigDecimal("0");
	
	
	/**
	 * 가계수표금액
	 */
	@ApiModelProperty(
		name = "prchAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("prchAm")
	@BxmOmm_Field(length=19, decimal=3, description="가계수표금액", align="right", fill="0")
	private BigDecimal prchAm= new BigDecimal("0");
	
	
	/**
	 * 약속어음금액
	 */
	@ApiModelProperty(
		name = "pmbilAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("pmbilAm")
	@BxmOmm_Field(length=19, decimal=3, description="약속어음금액", align="right", fill="0")
	private BigDecimal pmbilAm= new BigDecimal("0");
	
	
	/**
	 * 당좌수표금액
	 */
	@ApiModelProperty(
		name = "cackAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("cackAm")
	@BxmOmm_Field(length=19, decimal=3, description="당좌수표금액", align="right", fill="0")
	private BigDecimal cackAm= new BigDecimal("0");
	
	
	/**
	 * 한국은행자기앞수표금액
	 */
	@ApiModelProperty(
		name = "bokBchkAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("bokBchkAm")
	@BxmOmm_Field(length=19, decimal=3, description="한국은행자기앞수표금액", align="right", fill="0")
	private BigDecimal bokBchkAm= new BigDecimal("0");
	
	
	/**
	 * 기타증서금액
	 */
	@ApiModelProperty(
		name = "etcDeedAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("etcDeedAm")
	@BxmOmm_Field(length=19, decimal=3, description="기타증서금액", align="right", fill="0")
	private BigDecimal etcDeedAm= new BigDecimal("0");
	
	
	/**
	 * 금융거래목적코드
	 */
	@ApiModelProperty(
		name = "fncTrnAimCd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("fncTrnAimCd")
	@BxmOmm_Field(length=2, decimal=0, description="금융거래목적코드", align="left", fill="")
	private String fncTrnAimCd= "";
	
	
	/**
	 * 거래자금원천코드
	 */
	@ApiModelProperty(
		name = "trnFdSrcCd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("trnFdSrcCd")
	@BxmOmm_Field(length=2, decimal=0, description="거래자금원천코드", align="left", fill="")
	private String trnFdSrcCd= "";
	
	
	/**
	 * 자금소유자여부
	 */
	@ApiModelProperty(
		name = "fdOwpeYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("fdOwpeYn")
	@BxmOmm_Field(length=1, decimal=0, description="자금소유자여부", align="left", fill="")
	private String fdOwpeYn= "";
	
	
	/**
	 * 금융거래목적내용
	 */
	@ApiModelProperty(
		name = "fncTrnAimTxt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("fncTrnAimTxt")
	@BxmOmm_Field(length=100, decimal=0, description="금융거래목적내용", align="left", fill="")
	private String fncTrnAimTxt= "";
	
	
	/**
	 * 거래자금원천코드내용
	 */
	@ApiModelProperty(
		name = "trnFdSrcCdTxt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("trnFdSrcCdTxt")
	@BxmOmm_Field(length=50, decimal=0, description="거래자금원천코드내용", align="left", fill="")
	private String trnFdSrcCdTxt= "";
	
	
	/**
	 * 수표어음종류코드
	 */
	@ApiModelProperty(
		name = "ckbilKdcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ckbilKdcd")
	@BxmOmm_Field(length=2, decimal=0, description="수표어음종류코드", align="left", fill="")
	private String ckbilKdcd= "";
	
	
	/**
	 * 당좌보증금입금여부
	 */
	@ApiModelProperty(
		name = "cacGramRcvYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("cacGramRcvYn")
	@BxmOmm_Field(length=1, decimal=0, description="당좌보증금입금여부", align="left", fill="")
	private String cacGramRcvYn= "";
	
	
	/**
	 * 당좌보증금입금증명서발급여부
	 */
	@ApiModelProperty(
		name = "cacGramRcvCrtdIsuYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("cacGramRcvCrtdIsuYn")
	@BxmOmm_Field(length=1, decimal=0, description="당좌보증금입금증명서발급여부", align="left", fill="")
	private String cacGramRcvCrtdIsuYn= "";
	
	
	/**
	 * 당좌보증금입금금액
	 */
	@ApiModelProperty(
		name = "cacGramRcvAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("cacGramRcvAm")
	@BxmOmm_Field(length=15, decimal=0, description="당좌보증금입금금액", align="right", fill="0")
	private BigDecimal cacGramRcvAm= new BigDecimal("0");
	
	
	/**
	 * 당좌보증금대체금액
	 */
	@ApiModelProperty(
		name = "cacGramTrfAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("cacGramTrfAm")
	@BxmOmm_Field(length=15, decimal=0, description="당좌보증금대체금액", align="right", fill="0")
	private BigDecimal cacGramTrfAm= new BigDecimal("0");
	
	
	/**
	 * 당좌보증금자기앞수표금액
	 */
	@ApiModelProperty(
		name = "cacGramBchkAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("cacGramBchkAm")
	@BxmOmm_Field(length=15, decimal=0, description="당좌보증금자기앞수표금액", align="right", fill="0")
	private BigDecimal cacGramBchkAm= new BigDecimal("0");
	
	
	/**
	 * 수수료입금여부
	 */
	@ApiModelProperty(
		name = "feeRcvYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("feeRcvYn")
	@BxmOmm_Field(length=1, decimal=0, description="수수료입금여부", align="left", fill="")
	private String feeRcvYn= "";
	
	
	/**
	 * 수수료현금대체구분코드
	 */
	@ApiModelProperty(
		name = "feeCshtfDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("feeCshtfDscd")
	@BxmOmm_Field(length=1, decimal=0, description="수수료현금대체구분코드", align="left", fill="")
	private String feeCshtfDscd= "";
	
	
	/**
	 * 영수증출력여부
	 */
	@ApiModelProperty(
		name = "rctsOupYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rctsOupYn")
	@BxmOmm_Field(length=1, decimal=0, description="영수증출력여부", align="left", fill="")
	private String rctsOupYn= "";
	
	
	/**
	 * 수수료금액
	 */
	@ApiModelProperty(
		name = "feeAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("feeAm")
	@BxmOmm_Field(length=15, decimal=0, description="수수료금액", align="right", fill="0")
	private BigDecimal feeAm= new BigDecimal("0");
	
	
	/**
	 * 출금계좌번호
	 */
	@ApiModelProperty(
		name = "wdrAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("wdrAcno")
	@BxmOmm_Field(length=15, decimal=0, description="출금계좌번호", align="left", fill="")
	private String wdrAcno= "";
	
	
	/**
	 * 암호화출금계좌비밀번호
	 */
	@ApiModelProperty(
		name = "encyWdrActPwno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("encyWdrActPwno")
	@BxmOmm_Field(length=32, decimal=0, description="암호화출금계좌비밀번호", align="left", fill="")
	private String encyWdrActPwno= "";
	
	
	/**
	 * 만기입금계좌번호
	 */
	@ApiModelProperty(
		name = "xprRcvAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("xprRcvAcno")
	@BxmOmm_Field(length=15, decimal=0, description="만기입금계좌번호", align="left", fill="")
	private String xprRcvAcno= "";
	
	
	/**
	 * 금리우대대상1구분코드
	 */
	@ApiModelProperty(
		name = "irprmTgt1Dscd"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("irprmTgt1Dscd")
	@BxmOmm_Field(length=2, decimal=0, description="금리우대대상1구분코드", align="right", fill="0")
	private Integer irprmTgt1Dscd= 0;
	
	
	/**
	 * 금리우대대상2구분코드
	 */
	@ApiModelProperty(
		name = "irprmTgt2Dscd"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("irprmTgt2Dscd")
	@BxmOmm_Field(length=2, decimal=0, description="금리우대대상2구분코드", align="right", fill="0")
	private Integer irprmTgt2Dscd= 0;
	
	
	/**
	 * 금리우대대상3구분코드
	 */
	@ApiModelProperty(
		name = "irprmTgt3Dscd"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("irprmTgt3Dscd")
	@BxmOmm_Field(length=2, decimal=0, description="금리우대대상3구분코드", align="right", fill="0")
	private Integer irprmTgt3Dscd= 0;
	
	
	/**
	 * 금리우대대상4구분코드
	 */
	@ApiModelProperty(
		name = "irprmTgt4Dscd"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("irprmTgt4Dscd")
	@BxmOmm_Field(length=2, decimal=0, description="금리우대대상4구분코드", align="right", fill="0")
	private Integer irprmTgt4Dscd= 0;
	
	
	/**
	 * 금리우대대상5구분코드
	 */
	@ApiModelProperty(
		name = "irprmTgt5Dscd"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("irprmTgt5Dscd")
	@BxmOmm_Field(length=2, decimal=0, description="금리우대대상5구분코드", align="right", fill="0")
	private Integer irprmTgt5Dscd= 0;
	
	
	/**
	 * 금리우대대상6구분코드
	 */
	@ApiModelProperty(
		name = "irprmTgt6Dscd"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("irprmTgt6Dscd")
	@BxmOmm_Field(length=2, decimal=0, description="금리우대대상6구분코드", align="right", fill="0")
	private Integer irprmTgt6Dscd= 0;
	
	
	/**
	 * 만기처리방법코드
	 */
	@ApiModelProperty(
		name = "xprPrcMecd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("xprPrcMecd")
	@BxmOmm_Field(length=1, decimal=0, description="만기처리방법코드", align="left", fill="")
	private String xprPrcMecd= "";
	
	
	/**
	 * 기부자동이체계좌번호
	 */
	@ApiModelProperty(
		name = "dntnAtsAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dntnAtsAcno")
	@BxmOmm_Field(length=15, decimal=0, description="기부자동이체계좌번호", align="left", fill="")
	private String dntnAtsAcno= "";
	
	
	/**
	 * 신규자금구분코드
	 */
	@ApiModelProperty(
		name = "newFdDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("newFdDscd")
	@BxmOmm_Field(length=1, decimal=0, description="신규자금구분코드", align="left", fill="")
	private String newFdDscd= "";
	
	
	/**
	 * 특정금전신탁계좌번호
	 */
	@ApiModelProperty(
		name = "spcfMonyTrtAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("spcfMonyTrtAcno")
	@BxmOmm_Field(length=15, decimal=0, description="특정금전신탁계좌번호", align="left", fill="")
	private String spcfMonyTrtAcno= "";
	
	
	/**
	 * 연금지급기간설정여부
	 */
	@ApiModelProperty(
		name = "pnsnPayTemEstYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("pnsnPayTemEstYn")
	@BxmOmm_Field(length=1, decimal=0, description="연금지급기간설정여부", align="left", fill="")
	private String pnsnPayTemEstYn= "";
	
	
	/**
	 * 연금지급계약기간년수
	 */
	@ApiModelProperty(
		name = "pnsnPayCtrtmYcnt"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("pnsnPayCtrtmYcnt")
	@BxmOmm_Field(length=3, decimal=0, description="연금지급계약기간년수", align="right", fill="0")
	private Integer pnsnPayCtrtmYcnt= 0;
	
	
	/**
	 * 연금지급주기코드
	 */
	@ApiModelProperty(
		name = "pnsnPayCycd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("pnsnPayCycd")
	@BxmOmm_Field(length=2, decimal=0, description="연금지급주기코드", align="left", fill="")
	private String pnsnPayCycd= "";
	
	
	/**
	 * 다수계좌통장발행여부
	 */
	@ApiModelProperty(
		name = "lnoActPbokIssuYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("lnoActPbokIssuYn")
	@BxmOmm_Field(length=1, decimal=0, description="다수계좌통장발행여부", align="left", fill="")
	private String lnoActPbokIssuYn= "";
	
	
	/**
	 * 기본계좌번호
	 */
	@ApiModelProperty(
		name = "bscAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("bscAcno")
	@BxmOmm_Field(length=15, decimal=0, description="기본계좌번호", align="left", fill="")
	private String bscAcno= "";
	
	
	/**
	 * 구속성제외사유코드
	 */
	@ApiModelProperty(
		name = "oldAtrbXtRncd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("oldAtrbXtRncd")
	@BxmOmm_Field(length=1, decimal=0, description="구속성제외사유코드", align="left", fill="")
	private String oldAtrbXtRncd= "";
	
	
	/**
	 * 구속성예금점검대상여부
	 */
	@ApiModelProperty(
		name = "cpblChckTgtYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("cpblChckTgtYn")
	@BxmOmm_Field(length=1, decimal=0, description="구속성예금점검대상여부", align="left", fill="")
	private String cpblChckTgtYn= "";
	
	
	/**
	 * 대표자구속성예금대상여부
	 */
	@ApiModelProperty(
		name = "rpcmDpstTgtYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rpcmDpstTgtYn")
	@BxmOmm_Field(length=1, decimal=0, description="대표자구속성예금대상여부", align="left", fill="")
	private String rpcmDpstTgtYn= "";
	
	
	/**
	 * 구속성대표이사등기임원여부
	 */
	@ApiModelProperty(
		name = "oldAtrbCeoRgsrDrtrYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("oldAtrbCeoRgsrDrtrYn")
	@BxmOmm_Field(length=1, decimal=0, description="구속성대표이사등기임원여부", align="left", fill="")
	private String oldAtrbCeoRgsrDrtrYn= "";
	
	
	/**
	 * 구속성승인번호
	 */
	@ApiModelProperty(
		name = "oldAtrbApvNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("oldAtrbApvNo")
	@BxmOmm_Field(length=4, decimal=0, description="구속성승인번호", align="left", fill="")
	private String oldAtrbApvNo= "";
	
	
	/**
	 * 재예치계좌번호
	 */
	@ApiModelProperty(
		name = "rdepAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rdepAcno")
	@BxmOmm_Field(length=15, decimal=0, description="재예치계좌번호", align="left", fill="")
	private String rdepAcno= "";
	
	
	/**
	 * 구속성승인사유
	 */
	@ApiModelProperty(
		name = "oldAtrbApvRsn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("oldAtrbApvRsn")
	@BxmOmm_Field(length=50, decimal=0, description="구속성승인사유", align="left", fill="")
	private String oldAtrbApvRsn= "";
	
	
	/**
	 * 구속성점검시간
	 */
	@ApiModelProperty(
		name = "oldAtrbChckTim"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("oldAtrbChckTim")
	@BxmOmm_Field(length=6, decimal=0, description="구속성점검시간", align="left", fill="")
	private String oldAtrbChckTim= "";
	
	
	/**
	 * 신용카드실적조회여부
	 */
	@ApiModelProperty(
		name = "ccadRsltInqYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ccadRsltInqYn")
	@BxmOmm_Field(length=1, decimal=0, description="신용카드실적조회여부", align="left", fill="")
	private String ccadRsltInqYn= "";
	
	
	/**
	 * 당행신용카드보유여부
	 */
	@ApiModelProperty(
		name = "tbkCcadHldgYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("tbkCcadHldgYn")
	@BxmOmm_Field(length=1, decimal=0, description="당행신용카드보유여부", align="left", fill="")
	private String tbkCcadHldgYn= "";
	
	
	/**
	 * 카드결제계좌당행여부
	 */
	@ApiModelProperty(
		name = "cadStlActTbkYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("cadStlActTbkYn")
	@BxmOmm_Field(length=1, decimal=0, description="카드결제계좌당행여부", align="left", fill="")
	private String cadStlActTbkYn= "";
	
	
	/**
	 * 신용카드기준실적금액
	 */
	@ApiModelProperty(
		name = "ccadBasRsltAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("ccadBasRsltAm")
	@BxmOmm_Field(length=15, decimal=0, description="신용카드기준실적금액", align="right", fill="0")
	private BigDecimal ccadBasRsltAm= new BigDecimal("0");
	
	
	/**
	 * 이용실적기준시작일자
	 */
	@ApiModelProperty(
		name = "utzRsltBasStaDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("utzRsltBasStaDt")
	@BxmOmm_Field(length=8, decimal=0, description="이용실적기준시작일자", align="left", fill="")
	private String utzRsltBasStaDt= "";
	
	
	/**
	 * 이용실적기준종료일자
	 */
	@ApiModelProperty(
		name = "utzRsltBasEndDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("utzRsltBasEndDt")
	@BxmOmm_Field(length=8, decimal=0, description="이용실적기준종료일자", align="left", fill="")
	private String utzRsltBasEndDt= "";
	
	
	/**
	 * 이용실적조회시간
	 */
	@ApiModelProperty(
		name = "utzRsltInqTim"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("utzRsltInqTim")
	@BxmOmm_Field(length=4, decimal=0, description="이용실적조회시간", align="left", fill="")
	private String utzRsltInqTim= "";
	
	
	/**
	 * 상조피보험자구분
	 */
	@ApiModelProperty(
		name = "amfRispeDis"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("amfRispeDis")
	@BxmOmm_Field(length=1, decimal=0, description="상조피보험자구분", align="left", fill="")
	private String amfRispeDis= "";
	
	
	/**
	 * 상조피보험자성명
	 */
	@ApiModelProperty(
		name = "amfRispeFnm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("amfRispeFnm")
	@BxmOmm_Field(length=20, decimal=0, description="상조피보험자성명", align="left", fill="")
	private String amfRispeFnm= "";
	
	
	/**
	 * 상조피보험자주민등록번호
	 */
	@ApiModelProperty(
		name = "amfRispeRrno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("amfRispeRrno")
	@BxmOmm_Field(length=13, decimal=0, description="상조피보험자주민등록번호", align="left", fill="")
	private String amfRispeRrno= "";
	
	
	/**
	 * 상조피보험자연락처
	 */
	@ApiModelProperty(
		name = "amfRispeCnad"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("amfRispeCnad")
	@BxmOmm_Field(length=11, decimal=0, description="상조피보험자연락처", align="left", fill="")
	private String amfRispeCnad= "";
	
	
	/**
	 * 세입미처리여부
	 */
	@ApiModelProperty(
		name = "anrvNprcYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("anrvNprcYn")
	@BxmOmm_Field(length=1, decimal=0, description="세입미처리여부", align="left", fill="")
	private String anrvNprcYn= "";
	
	
	/**
	 * 공금예금계좌번호
	 */
	@ApiModelProperty(
		name = "pbamAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("pbamAcno")
	@BxmOmm_Field(length=13, decimal=0, description="공금예금계좌번호", align="left", fill="")
	private String pbamAcno= "";
	
	
	/**
	 * 공금예금단수계좌번호
	 */
	@ApiModelProperty(
		name = "pbamSnnmAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("pbamSnnmAcno")
	@BxmOmm_Field(length=13, decimal=0, description="공금예금단수계좌번호", align="left", fill="")
	private String pbamSnnmAcno= "";
	
	
	/**
	 * 공금거래고유번호
	 */
	@ApiModelProperty(
		name = "pmnyTrnUnqNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("pmnyTrnUnqNo")
	@BxmOmm_Field(length=13, decimal=0, description="공금거래고유번호", align="left", fill="")
	private String pmnyTrnUnqNo= "";
	
	
	/**
	 * 계약기간월수
	 */
	@ApiModelProperty(
		name = "ctrtmMcn"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("ctrtmMcn")
	@BxmOmm_Field(length=3, decimal=0, description="계약기간월수", align="right", fill="0")
	private Integer ctrtmMcn= 0;
	
	
	/**
	 * 계약기간일수
	 */
	@ApiModelProperty(
		name = "ctrtmDcnt"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("ctrtmDcnt")
	@BxmOmm_Field(length=3, decimal=0, description="계약기간일수", align="right", fill="0")
	private Integer ctrtmDcnt= 0;
	
	
	/**
	 * 만기일자
	 */
	@ApiModelProperty(
		name = "xprDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("xprDt")
	@BxmOmm_Field(length=8, decimal=0, description="만기일자", align="left", fill="")
	private String xprDt= "";
	
	
	/**
	 * 기산일자
	 */
	@ApiModelProperty(
		name = "rcknDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rcknDt")
	@BxmOmm_Field(length=8, decimal=0, description="기산일자", align="left", fill="")
	private String rcknDt= "";
	
	
	/**
	 * 암호화자동이체계좌비밀번호
	 */
	@ApiModelProperty(
		name = "encyAtsActPwno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("encyAtsActPwno")
	@BxmOmm_Field(length=32, decimal=0, description="암호화자동이체계좌비밀번호", align="left", fill="")
	private String encyAtsActPwno= "";
	
	
	/**
	 * 자동이체주기코드
	 */
	@ApiModelProperty(
		name = "atsCycd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atsCycd")
	@BxmOmm_Field(length=2, decimal=0, description="자동이체주기코드", align="left", fill="")
	private String atsCycd= "";
	
	
	/**
	 * 자동이체시작일자
	 */
	@ApiModelProperty(
		name = "atsStaDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atsStaDt")
	@BxmOmm_Field(length=8, decimal=0, description="자동이체시작일자", align="left", fill="")
	private String atsStaDt= "";
	
	
	/**
	 * 자동이체종료일자
	 */
	@ApiModelProperty(
		name = "atsEndDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atsEndDt")
	@BxmOmm_Field(length=8, decimal=0, description="자동이체종료일자", align="left", fill="")
	private String atsEndDt= "";
	
	
	/**
	 * 자동이체통화코드
	 */
	@ApiModelProperty(
		name = "atsCucd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atsCucd")
	@BxmOmm_Field(length=3, decimal=0, description="자동이체통화코드", align="left", fill="")
	private String atsCucd= "";
	
	
	/**
	 * 자동이체일
	 */
	@ApiModelProperty(
		name = "atsDd"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("atsDd")
	@BxmOmm_Field(length=2, decimal=0, description="자동이체일", align="right", fill="0")
	private Integer atsDd= 0;
	
	
	/**
	 * 자동이체개월수
	 */
	@ApiModelProperty(
		name = "atsMecn"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("atsMecn")
	@BxmOmm_Field(length=3, decimal=0, description="자동이체개월수", align="right", fill="0")
	private Integer atsMecn= 0;
	
	
	/**
	 * 자동이체계좌번호
	 */
	@ApiModelProperty(
		name = "atsAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atsAcno")
	@BxmOmm_Field(length=20, decimal=0, description="자동이체계좌번호", align="left", fill="")
	private String atsAcno= "";
	
	
	/**
	 * 자동이체금액
	 */
	@ApiModelProperty(
		name = "atsAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("atsAm")
	@BxmOmm_Field(length=19, decimal=3, description="자동이체금액", align="right", fill="0")
	private BigDecimal atsAm= new BigDecimal("0");
	
	
	/**
	 * 당행선정기업코드
	 */
	@ApiModelProperty(
		name = "tbkSltCopCd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("tbkSltCopCd")
	@BxmOmm_Field(length=3, decimal=0, description="당행선정기업코드", align="left", fill="")
	private String tbkSltCopCd= "";
	
	
	/**
	 * 당행선정기업임직원여부
	 */
	@ApiModelProperty(
		name = "tbkSltCopOfemYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("tbkSltCopOfemYn")
	@BxmOmm_Field(length=1, decimal=0, description="당행선정기업임직원여부", align="left", fill="")
	private String tbkSltCopOfemYn= "";
	
	
	/**
	 * 기부신청여부
	 */
	@ApiModelProperty(
		name = "dntnRqYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dntnRqYn")
	@BxmOmm_Field(length=1, decimal=0, description="기부신청여부", align="left", fill="")
	private String dntnRqYn= "";
	
	
	/**
	 * 기부금액구분코드
	 */
	@ApiModelProperty(
		name = "dntnAmDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dntnAmDscd")
	@BxmOmm_Field(length=1, decimal=0, description="기부금액구분코드", align="left", fill="")
	private String dntnAmDscd= "";
	
	
	/**
	 * 기부금액
	 */
	@ApiModelProperty(
		name = "dntnAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("dntnAm")
	@BxmOmm_Field(length=15, decimal=0, description="기부금액", align="right", fill="0")
	private BigDecimal dntnAm= new BigDecimal("0");
	
	
	/**
	 * 만기해지입금계좌번호
	 */
	@ApiModelProperty(
		name = "xprCancRcvAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("xprCancRcvAcno")
	@BxmOmm_Field(length=15, decimal=0, description="만기해지입금계좌번호", align="left", fill="")
	private String xprCancRcvAcno= "";
	
	
	/**
	 * 바우처쿠폰번호
	 */
	@ApiModelProperty(
		name = "bchrCponNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("bchrCponNo")
	@BxmOmm_Field(length=8, decimal=0, description="바우처쿠폰번호", align="left", fill="")
	private String bchrCponNo= "";
	
	
	/**
	 * 바우처지원금액
	 */
	@ApiModelProperty(
		name = "bchrSupAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("bchrSupAm")
	@BxmOmm_Field(length=12, decimal=0, description="바우처지원금액", align="right", fill="0")
	private BigDecimal bchrSupAm= new BigDecimal("0");
	
	
	/**
	 * 바우처고객납입금액
	 */
	@ApiModelProperty(
		name = "bchrCusPidAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("bchrCusPidAm")
	@BxmOmm_Field(length=15, decimal=0, description="바우처고객납입금액", align="right", fill="0")
	private BigDecimal bchrCusPidAm= new BigDecimal("0");
	
	
	/**
	 * 승인번호
	 */
	@ApiModelProperty(
		name = "apvNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("apvNo")
	@BxmOmm_Field(length=8, decimal=0, description="승인번호", align="left", fill="")
	private String apvNo= "";
	
	
	/**
	 * 쿠폰인증번호
	 */
	@ApiModelProperty(
		name = "cponCrtfNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("cponCrtfNo")
	@BxmOmm_Field(length=20, decimal=0, description="쿠폰인증번호", align="left", fill="")
	private String cponCrtfNo= "";
	
	
	/**
	 * 자동재예치여부
	 */
	@ApiModelProperty(
		name = "autoRdepYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("autoRdepYn")
	@BxmOmm_Field(length=1, decimal=0, description="자동재예치여부", align="left", fill="")
	private String autoRdepYn= "";
	
	
	/**
	 * 보험가입동의여부
	 */
	@ApiModelProperty(
		name = "insuJnngAgrYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("insuJnngAgrYn")
	@BxmOmm_Field(length=1, decimal=0, description="보험가입동의여부", align="left", fill="")
	private String insuJnngAgrYn= "";
	
	
	/**
	 * 가입대상구분코드
	 */
	@ApiModelProperty(
		name = "jnngTgtDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("jnngTgtDscd")
	@BxmOmm_Field(length=1, decimal=0, description="가입대상구분코드", align="left", fill="")
	private String jnngTgtDscd= "";
	
	
	/**
	 * 신용카드보유여부
	 */
	@ApiModelProperty(
		name = "ccadHldgYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ccadHldgYn")
	@BxmOmm_Field(length=1, decimal=0, description="신용카드보유여부", align="left", fill="")
	private String ccadHldgYn= "";
	
	
	/**
	 * 예상전역일자
	 */
	@ApiModelProperty(
		name = "frcsDshgDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("frcsDshgDt")
	@BxmOmm_Field(length=8, decimal=0, description="예상전역일자", align="left", fill="")
	private String frcsDshgDt= "";
	
	
	/**
	 * 고객지정상품명
	 */
	@ApiModelProperty(
		name = "cusDgnPrdNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("cusDgnPrdNm")
	@BxmOmm_Field(length=50, decimal=0, description="고객지정상품명", align="left", fill="")
	private String cusDgnPrdNm= "";
	
	
	/**
	 * 우수기업코드
	 */
	@ApiModelProperty(
		name = "xcoCd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("xcoCd")
	@BxmOmm_Field(length=20, decimal=0, description="우수기업코드", align="left", fill="")
	private String xcoCd= "";
	
	
	/**
	 * 친구계좌번호
	 */
	@ApiModelProperty(
		name = "frndAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("frndAcno")
	@BxmOmm_Field(length=20, decimal=0, description="친구계좌번호", align="left", fill="")
	private String frndAcno= "";
	
	
	/**
	 * 특정일지정월
	 */
	@ApiModelProperty(
		name = "spdtDgnMm"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("spdtDgnMm")
	@BxmOmm_Field(length=2, decimal=0, description="특정일지정월", align="right", fill="0")
	private Integer spdtDgnMm= 0;
	
	
	/**
	 * 특정일지정일
	 */
	@ApiModelProperty(
		name = "spdtDgnDd"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("spdtDgnDd")
	@BxmOmm_Field(length=2, decimal=0, description="특정일지정일", align="right", fill="0")
	private Integer spdtDgnDd= 0;
	
	
	/**
	 * 적용금리
	 */
	@ApiModelProperty(
		name = "aplIr"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("aplIr")
	@BxmOmm_Field(length=6, decimal=3, description="적용금리", align="right", fill="0")
	private BigDecimal aplIr= new BigDecimal("0");
	
	
	/**
	 * 이메일정기잔고알림신청여부
	 */
	@ApiModelProperty(
		name = "emlFpAcblNtfcRqYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("emlFpAcblNtfcRqYn")
	@BxmOmm_Field(length=1, decimal=0, description="이메일정기잔고알림신청여부", align="left", fill="")
	private String emlFpAcblNtfcRqYn= "";
	
	
	/**
	 * 이메일정기잔고알림기준일
	 */
	@ApiModelProperty(
		name = "emlFpAcblNtfcBsdt"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("emlFpAcblNtfcBsdt")
	@BxmOmm_Field(length=2, decimal=0, description="이메일정기잔고알림기준일", align="right", fill="0")
	private Integer emlFpAcblNtfcBsdt= 0;
	
	
	/**
	 * 정기수익율SMS알림신청여부
	 */
	@ApiModelProperty(
		name = "fpPrftRtSmsNtfcRqYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("fpPrftRtSmsNtfcRqYn")
	@BxmOmm_Field(length=1, decimal=0, description="정기수익율SMS알림신청여부", align="left", fill="")
	private String fpPrftRtSmsNtfcRqYn= "";
	
	
	/**
	 * 정기수익율SMS알림기준일
	 */
	@ApiModelProperty(
		name = "fpPrftRtSmsNtfcBsdt"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("fpPrftRtSmsNtfcBsdt")
	@BxmOmm_Field(length=2, decimal=0, description="정기수익율SMS알림기준일", align="right", fill="0")
	private Integer fpPrftRtSmsNtfcBsdt= 0;
	
	
	/**
	 * 목표가격SMS신청여부
	 */
	@ApiModelProperty(
		name = "goalPrSmsRqYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("goalPrSmsRqYn")
	@BxmOmm_Field(length=1, decimal=0, description="목표가격SMS신청여부", align="left", fill="")
	private String goalPrSmsRqYn= "";
	
	
	/**
	 * 목표가격
	 */
	@ApiModelProperty(
		name = "goalPr"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("goalPr")
	@BxmOmm_Field(length=15, decimal=0, description="목표가격", align="right", fill="0")
	private BigDecimal goalPr= new BigDecimal("0");
	
	
	/**
	 * 허용가격
	 */
	@ApiModelProperty(
		name = "alwPr"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("alwPr")
	@BxmOmm_Field(length=15, decimal=0, description="허용가격", align="right", fill="0")
	private BigDecimal alwPr= new BigDecimal("0");
	
	
	/**
	 * 골드뱅킹목표수익율구분코드
	 */
	@ApiModelProperty(
		name = "gBnkgGoalPrftRtDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("gBnkgGoalPrftRtDscd")
	@BxmOmm_Field(length=1, decimal=0, description="골드뱅킹목표수익율구분코드", align="left", fill="")
	private String gBnkgGoalPrftRtDscd= "";
	
	
	/**
	 * 골드뱅킹허용손실구분코드
	 */
	@ApiModelProperty(
		name = "gBnkgAlwLossDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("gBnkgAlwLossDscd")
	@BxmOmm_Field(length=1, decimal=0, description="골드뱅킹허용손실구분코드", align="left", fill="")
	private String gBnkgAlwLossDscd= "";
	
	
	/**
	 * 외화통장대출용여부
	 */
	@ApiModelProperty(
		name = "fcPsklUseYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("fcPsklUseYn")
	@BxmOmm_Field(length=1, decimal=0, description="외화통장대출용여부", align="left", fill="")
	private String fcPsklUseYn= "";
	
	
	/**
	 * 환율이체유형코드
	 */
	@ApiModelProperty(
		name = "xrtTsTycd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("xrtTsTycd")
	@BxmOmm_Field(length=2, decimal=0, description="환율이체유형코드", align="left", fill="")
	private String xrtTsTycd= "";
	
	
	/**
	 * 환율최대적립금액
	 */
	@ApiModelProperty(
		name = "xrtMaxAcldAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("xrtMaxAcldAm")
	@BxmOmm_Field(length=15, decimal=0, description="환율최대적립금액", align="right", fill="0")
	private BigDecimal xrtMaxAcldAm= new BigDecimal("0");
	
	
	/**
	 * 지정환율알림서비스구분코드
	 */
	@ApiModelProperty(
		name = "dgnXrtNtfcSrvcDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dgnXrtNtfcSrvcDscd")
	@BxmOmm_Field(length=1, decimal=0, description="지정환율알림서비스구분코드", align="left", fill="")
	private String dgnXrtNtfcSrvcDscd= "";
	
	
	/**
	 * 알림서비스지정환율
	 */
	@ApiModelProperty(
		name = "ntfcSrvcDgnXrt"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("ntfcSrvcDgnXrt")
	@BxmOmm_Field(length=8, decimal=2, description="알림서비스지정환율", align="right", fill="0")
	private BigDecimal ntfcSrvcDgnXrt= new BigDecimal("0");
	
	
	/**
	 * 해외로보너스카드번호
	 */
	@ApiModelProperty(
		name = "ovtbCdno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ovtbCdno")
	@BxmOmm_Field(length=10, decimal=0, description="해외로보너스카드번호", align="left", fill="")
	private String ovtbCdno= "";
	
	
	/**
	 * 펌뱅킹업체번호
	 */
	@ApiModelProperty(
		name = "fmbkCoNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("fmbkCoNo")
	@BxmOmm_Field(length=20, decimal=0, description="펌뱅킹업체번호", align="left", fill="")
	private String fmbkCoNo= "";
	
	
	/**
	 * 자동갱신구분코드
	 */
	@ApiModelProperty(
		name = "atrnDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atrnDscd")
	@BxmOmm_Field(length=1, decimal=0, description="자동갱신구분코드", align="left", fill="")
	private String atrnDscd= "";
	
	
	/**
	 * 입금계좌번호
	 */
	@ApiModelProperty(
		name = "rvactNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rvactNo")
	@BxmOmm_Field(length=15, decimal=0, description="입금계좌번호", align="left", fill="")
	private String rvactNo= "";
	
	
	/**
	 * 금리회전주기코드
	 */
	@ApiModelProperty(
		name = "irRotCycd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("irRotCycd")
	@BxmOmm_Field(length=2, decimal=0, description="금리회전주기코드", align="left", fill="")
	private String irRotCycd= "";
	
	
	/**
	 * 외화자금유입구분코드
	 */
	@ApiModelProperty(
		name = "fcfndInfwDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("fcfndInfwDscd")
	@BxmOmm_Field(length=2, decimal=0, description="외화자금유입구분코드", align="left", fill="")
	private String fcfndInfwDscd= "";
	
	
	/**
	 * 외화수신계정구분코드
	 */
	@ApiModelProperty(
		name = "fcDpsAccDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("fcDpsAccDscd")
	@BxmOmm_Field(length=3, decimal=0, description="외화수신계정구분코드", align="left", fill="")
	private String fcDpsAccDscd= "";
	
	
	/**
	 * 외국환신고필증제출구분
	 */
	@ApiModelProperty(
		name = "fornXchStttCrtcSbmtDis"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("fornXchStttCrtcSbmtDis")
	@BxmOmm_Field(length=1, decimal=0, description="외국환신고필증제출구분", align="left", fill="")
	private String fornXchStttCrtcSbmtDis= "";
	
	
	/**
	 * 외환입지급사유코드
	 */
	@ApiModelProperty(
		name = "fxRapRncd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("fxRapRncd")
	@BxmOmm_Field(length=5, decimal=0, description="외환입지급사유코드", align="left", fill="")
	private String fxRapRncd= "";
	
	
	/**
	 * 지급사유코드분류코드
	 */
	@ApiModelProperty(
		name = "payRncdCfcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("payRncdCfcd")
	@BxmOmm_Field(length=1, decimal=0, description="지급사유코드분류코드", align="left", fill="")
	private String payRncdCfcd= "";
	
	
	/**
	 * HS코드
	 */
	@ApiModelProperty(
		name = "hsCd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("hsCd")
	@BxmOmm_Field(length=10, decimal=0, description="HS코드", align="left", fill="")
	private String hsCd= "";
	
	
	/**
	 * 투자자ID
	 */
	@ApiModelProperty(
		name = "ivpeId"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ivpeId")
	@BxmOmm_Field(length=6, decimal=0, description="투자자ID", align="left", fill="")
	private String ivpeId= "";
	
	
	/**
	 * 증권회사명
	 */
	@ApiModelProperty(
		name = "secrComNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("secrComNm")
	@BxmOmm_Field(length=40, decimal=0, description="증권회사명", align="left", fill="")
	private String secrComNm= "";
	
	
	/**
	 * 외화승인코드
	 */
	@ApiModelProperty(
		name = "fcApvCd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("fcApvCd")
	@BxmOmm_Field(length=4, decimal=0, description="외화승인코드", align="left", fill="")
	private String fcApvCd= "";
	
	
	/**
	 * 연금적립계약년수
	 */
	@ApiModelProperty(
		name = "pnsnAcldCtrYcnt"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("pnsnAcldCtrYcnt")
	@BxmOmm_Field(length=3, decimal=0, description="연금적립계약년수", align="right", fill="0")
	private Integer pnsnAcldCtrYcnt= 0;
	
	
	/**
	 * 연금적립계약월수
	 */
	@ApiModelProperty(
		name = "pnsnAcldCtrMcn"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("pnsnAcldCtrMcn")
	@BxmOmm_Field(length=3, decimal=0, description="연금적립계약월수", align="right", fill="0")
	private Integer pnsnAcldCtrMcn= 0;
	
	
	/**
	 * 연금수령개시일자
	 */
	@ApiModelProperty(
		name = "pnsnRcveBgnDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("pnsnRcveBgnDt")
	@BxmOmm_Field(length=8, decimal=0, description="연금수령개시일자", align="left", fill="")
	private String pnsnRcveBgnDt= "";
	
	
	/**
	 * 수익율보고서발송구분코드
	 */
	@ApiModelProperty(
		name = "prftRtRptdSndDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("prftRtRptdSndDscd")
	@BxmOmm_Field(length=1, decimal=0, description="수익율보고서발송구분코드", align="left", fill="")
	private String prftRtRptdSndDscd= "";
	
	
	/**
	 * 환매연동신규여부
	 */
	@ApiModelProperty(
		name = "rprhLnkNewYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rprhLnkNewYn")
	@BxmOmm_Field(length=1, decimal=0, description="환매연동신규여부", align="left", fill="")
	private String rprhLnkNewYn= "";
	
	
	/**
	 * 환매연동해지계좌번호
	 */
	@ApiModelProperty(
		name = "rprhLnkCancAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rprhLnkCancAcno")
	@BxmOmm_Field(length=13, decimal=0, description="환매연동해지계좌번호", align="left", fill="")
	private String rprhLnkCancAcno= "";
	
	
	/**
	 * 환매연동전액신규여부
	 */
	@ApiModelProperty(
		name = "rprhLnkTamNewYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rprhLnkTamNewYn")
	@BxmOmm_Field(length=1, decimal=0, description="환매연동전액신규여부", align="left", fill="")
	private String rprhLnkTamNewYn= "";
	
	
	/**
	 * 만기후추가납입여부
	 */
	@ApiModelProperty(
		name = "afepAddPidYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("afepAddPidYn")
	@BxmOmm_Field(length=1, decimal=0, description="만기후추가납입여부", align="left", fill="")
	private String afepAddPidYn= "";
	
	
	/**
	 * 펀드상품코드
	 */
	@ApiModelProperty(
		name = "fndPdcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("fndPdcd")
	@BxmOmm_Field(length=13, decimal=0, description="펀드상품코드", align="left", fill="")
	private String fndPdcd= "";
	
	
	/**
	 * 펀드매수신청서무인자여부
	 */
	@ApiModelProperty(
		name = "fndScntRqdcNprtYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("fndScntRqdcNprtYn")
	@BxmOmm_Field(length=1, decimal=0, description="펀드매수신청서무인자여부", align="left", fill="")
	private String fndScntRqdcNprtYn= "";
	
	
	/**
	 * 운용현황통지발송구분코드
	 */
	@ApiModelProperty(
		name = "opgPtsNtcSndDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("opgPtsNtcSndDscd")
	@BxmOmm_Field(length=1, decimal=0, description="운용현황통지발송구분코드", align="left", fill="")
	private String opgPtsNtcSndDscd= "";
	
	
	/**
	 * 골드뱅킹목표수익율정수
	 */
	@ApiModelProperty(
		name = "gBnkgGoalPrftRtPsnb"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("gBnkgGoalPrftRtPsnb")
	@BxmOmm_Field(length=6, decimal=0, description="골드뱅킹목표수익율정수", align="right", fill="0")
	private Integer gBnkgGoalPrftRtPsnb= 0;
	
	
	/**
	 * 골드뱅킹목표수익율소수
	 */
	@ApiModelProperty(
		name = "gBnkgGoalPrftRtDcml"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("gBnkgGoalPrftRtDcml")
	@BxmOmm_Field(length=2, decimal=0, description="골드뱅킹목표수익율소수", align="left", fill="")
	private String gBnkgGoalPrftRtDcml= "";
	
	
	/**
	 * 골드뱅킹허용손실율정수
	 */
	@ApiModelProperty(
		name = "gBnkgAlwLossRtPsnb"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("gBnkgAlwLossRtPsnb")
	@BxmOmm_Field(length=6, decimal=0, description="골드뱅킹허용손실율정수", align="right", fill="0")
	private Integer gBnkgAlwLossRtPsnb= 0;
	
	
	/**
	 * 골드뱅킹허용손실율소수
	 */
	@ApiModelProperty(
		name = "gBnkgAlwLossRtDcml"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("gBnkgAlwLossRtDcml")
	@BxmOmm_Field(length=2, decimal=0, description="골드뱅킹허용손실율소수", align="left", fill="")
	private String gBnkgAlwLossRtDcml= "";
	
	
	/**
	 * 우리평생모계좌번호
	 */
	@ApiModelProperty(
		name = "wooriOnwlMoAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("wooriOnwlMoAcno")
	@BxmOmm_Field(length=15, decimal=0, description="우리평생모계좌번호", align="left", fill="")
	private String wooriOnwlMoAcno= "";
	
	
	/**
	 * 사업용계좌여부
	 */
	@ApiModelProperty(
		name = "bznUseActYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("bznUseActYn")
	@BxmOmm_Field(length=1, decimal=0, description="사업용계좌여부", align="left", fill="")
	private String bznUseActYn= "";
	
	
	/**
	 * 대리인통합고객번호
	 */
	@ApiModelProperty(
		name = "agnpeItcsno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("agnpeItcsno")
	@BxmOmm_Field(length=11, decimal=0, description="대리인통합고객번호", align="left", fill="")
	private String agnpeItcsno= "";
	
	
	/**
	 * 대표자통합고객번호
	 */
	@ApiModelProperty(
		name = "rppeItcsno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rppeItcsno")
	@BxmOmm_Field(length=11, decimal=0, description="대표자통합고객번호", align="left", fill="")
	private String rppeItcsno= "";
	
	
	/**
	 * 자동이체불능알림신청여부
	 */
	@ApiModelProperty(
		name = "atsNaNtfcRqYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atsNaNtfcRqYn")
	@BxmOmm_Field(length=1, decimal=0, description="자동이체불능알림신청여부", align="left", fill="")
	private String atsNaNtfcRqYn= "";
	
	
	/**
	 * 적립펀드이체만기알림신청여부
	 */
	@ApiModelProperty(
		name = "acldFndTsXprNtfcRqYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("acldFndTsXprNtfcRqYn")
	@BxmOmm_Field(length=1, decimal=0, description="적립펀드이체만기알림신청여부", align="left", fill="")
	private String acldFndTsXprNtfcRqYn= "";
	
	
	/**
	 * 선물환계좌번호
	 */
	@ApiModelProperty(
		name = "fwxcAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("fwxcAcno")
	@BxmOmm_Field(length=13, decimal=0, description="선물환계좌번호", align="left", fill="")
	private String fwxcAcno= "";
	
	
	/**
	 * 펀드전환해지계좌번호
	 */
	@ApiModelProperty(
		name = "fndCnvrTmntAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("fndCnvrTmntAcno")
	@BxmOmm_Field(length=15, decimal=0, description="펀드전환해지계좌번호", align="left", fill="")
	private String fndCnvrTmntAcno= "";
	
	
	/**
	 * 배당금재투자구분코드
	 */
	@ApiModelProperty(
		name = "dvdamRinvDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dvdamRinvDscd")
	@BxmOmm_Field(length=1, decimal=0, description="배당금재투자구분코드", align="left", fill="")
	private String dvdamRinvDscd= "";
	
	
	/**
	 * 펀드전환신규여부
	 */
	@ApiModelProperty(
		name = "fndCnvrNewYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("fndCnvrNewYn")
	@BxmOmm_Field(length=1, decimal=0, description="펀드전환신규여부", align="left", fill="")
	private String fndCnvrNewYn= "";
	
	
	/**
	 * 여신만기도래여부
	 */
	@ApiModelProperty(
		name = "lonXprAdvnYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("lonXprAdvnYn")
	@BxmOmm_Field(length=1, decimal=0, description="여신만기도래여부", align="left", fill="")
	private String lonXprAdvnYn= "";
	
	
	/**
	 * 대출승인완료여부
	 */
	@ApiModelProperty(
		name = "lnApvCmplYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("lnApvCmplYn")
	@BxmOmm_Field(length=1, decimal=0, description="대출승인완료여부", align="left", fill="")
	private String lnApvCmplYn= "";
	
	
	/**
	 * 우선수익자지점명
	 */
	@ApiModelProperty(
		name = "priPrpeBrNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("priPrpeBrNm")
	@BxmOmm_Field(length=30, decimal=0, description="우선수익자지점명", align="left", fill="")
	private String priPrpeBrNm= "";
	
	
	/**
	 * 보증거래번호
	 */
	@ApiModelProperty(
		name = "grnTrno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("grnTrno")
	@BxmOmm_Field(length=10, decimal=0, description="보증거래번호", align="left", fill="")
	private String grnTrno= "";
	
	
	/**
	 * 에스크로조합원번호
	 */
	@ApiModelProperty(
		name = "escrUnmrNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("escrUnmrNo")
	@BxmOmm_Field(length=10, decimal=0, description="에스크로조합원번호", align="left", fill="")
	private String escrUnmrNo= "";
	
	
	/**
	 * 우선수익자계좌번호
	 */
	@ApiModelProperty(
		name = "priPrpeAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("priPrpeAcno")
	@BxmOmm_Field(length=15, decimal=0, description="우선수익자계좌번호", align="left", fill="")
	private String priPrpeAcno= "";
	
	
	/**
	 * 수익자계좌번호
	 */
	@ApiModelProperty(
		name = "prpeAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("prpeAcno")
	@BxmOmm_Field(length=15, decimal=0, description="수익자계좌번호", align="left", fill="")
	private String prpeAcno= "";
	
	
	/**
	 * 우선수익자사업자번호
	 */
	@ApiModelProperty(
		name = "priPrpeBzpeNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("priPrpeBzpeNo")
	@BxmOmm_Field(length=10, decimal=0, description="우선수익자사업자번호", align="left", fill="")
	private String priPrpeBzpeNo= "";
	
	
	/**
	 * 수익자사업자번호
	 */
	@ApiModelProperty(
		name = "prpeBzpeNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("prpeBzpeNo")
	@BxmOmm_Field(length=10, decimal=0, description="수익자사업자번호", align="left", fill="")
	private String prpeBzpeNo= "";
	
	
	/**
	 * 선급금액수령계좌번호
	 */
	@ApiModelProperty(
		name = "ppmtAmRcveAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ppmtAmRcveAcno")
	@BxmOmm_Field(length=15, decimal=0, description="선급금액수령계좌번호", align="left", fill="")
	private String ppmtAmRcveAcno= "";
	
	
	/**
	 * 원본수익자고객번호
	 */
	@ApiModelProperty(
		name = "orcpPrpeCsno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("orcpPrpeCsno")
	@BxmOmm_Field(length=9, decimal=0, description="원본수익자고객번호", align="left", fill="")
	private String orcpPrpeCsno= "";
	
	
	/**
	 * 이익수익자고객번호
	 */
	@ApiModelProperty(
		name = "pftPrpeCsno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("pftPrpeCsno")
	@BxmOmm_Field(length=9, decimal=0, description="이익수익자고객번호", align="left", fill="")
	private String pftPrpeCsno= "";
	
	
	/**
	 * 원본수익자비거주자징구여부
	 */
	@ApiModelProperty(
		name = "orcpPrpeNrsrCollYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("orcpPrpeNrsrCollYn")
	@BxmOmm_Field(length=1, decimal=0, description="원본수익자비거주자징구여부", align="left", fill="")
	private String orcpPrpeNrsrCollYn= "";
	
	
	/**
	 * 이익수익자비거주자징구여부
	 */
	@ApiModelProperty(
		name = "pftPrpeNrsrCollYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("pftPrpeNrsrCollYn")
	@BxmOmm_Field(length=1, decimal=0, description="이익수익자비거주자징구여부", align="left", fill="")
	private String pftPrpeNrsrCollYn= "";
	
	
	/**
	 * 선취보수금액
	 */
	@ApiModelProperty(
		name = "pocpPfeAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("pocpPfeAm")
	@BxmOmm_Field(length=15, decimal=0, description="선취보수금액", align="right", fill="0")
	private BigDecimal pocpPfeAm= new BigDecimal("0");
	
	
	/**
	 * ETF목표수익율
	 */
	@ApiModelProperty(
		name = "etfTprt"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("etfTprt")
	@BxmOmm_Field(length=3, decimal=0, description="ETF목표수익율", align="right", fill="0")
	private Integer etfTprt= 0;
	
	
	/**
	 * 운용지시내용
	 */
	@ApiModelProperty(
		name = "opgOrdsTxt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("opgOrdsTxt")
	@BxmOmm_Field(length=40, decimal=0, description="운용지시내용", align="left", fill="")
	private String opgOrdsTxt= "";
	
	
	/**
	 * 특약1내용
	 */
	@ApiModelProperty(
		name = "sa1Txt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("sa1Txt")
	@BxmOmm_Field(length=62, decimal=0, description="특약1내용", align="left", fill="")
	private String sa1Txt= "";
	
	
	/**
	 * 특약2내용
	 */
	@ApiModelProperty(
		name = "sa2Txt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("sa2Txt")
	@BxmOmm_Field(length=62, decimal=0, description="특약2내용", align="left", fill="")
	private String sa2Txt= "";
	
	
	/**
	 * 특약3내용
	 */
	@ApiModelProperty(
		name = "sa3Txt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("sa3Txt")
	@BxmOmm_Field(length=62, decimal=0, description="특약3내용", align="left", fill="")
	private String sa3Txt= "";
	
	
	/**
	 * 분리과세여부
	 */
	@ApiModelProperty(
		name = "sptxYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("sptxYn")
	@BxmOmm_Field(length=1, decimal=0, description="분리과세여부", align="left", fill="")
	private String sptxYn= "";
	
	
	/**
	 * 무기명고객번호
	 */
	@ApiModelProperty(
		name = "nnmCsno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("nnmCsno")
	@BxmOmm_Field(length=9, decimal=0, description="무기명고객번호", align="left", fill="")
	private String nnmCsno= "";
	
	
	/**
	 * 펀드종목코드
	 */
	@ApiModelProperty(
		name = "fndItmsCd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("fndItmsCd")
	@BxmOmm_Field(length=12, decimal=0, description="펀드종목코드", align="left", fill="")
	private String fndItmsCd= "";
	
	
	/**
	 * 수신입금금액
	 */
	@ApiModelProperty(
		name = "dpsRcvAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("dpsRcvAm")
	@BxmOmm_Field(length=19, decimal=3, description="수신입금금액", align="right", fill="0")
	private BigDecimal dpsRcvAm= new BigDecimal("0");
	
	
	/**
	 * 대체금액
	 */
	@ApiModelProperty(
		name = "trfAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("trfAm")
	@BxmOmm_Field(length=19, decimal=3, description="대체금액", align="right", fill="0")
	private BigDecimal trfAm= new BigDecimal("0");
	
	
	/**
	 * 자기앞수표금액
	 */
	@ApiModelProperty(
		name = "bchkAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("bchkAm")
	@BxmOmm_Field(length=19, decimal=3, description="자기앞수표금액", align="right", fill="0")
	private BigDecimal bchkAm= new BigDecimal("0");
	
	
	/**
	 * 자기앞수표조회필금액
	 */
	@ApiModelProperty(
		name = "bchkInqmAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("bchkInqmAm")
	@BxmOmm_Field(length=19, decimal=3, description="자기앞수표조회필금액", align="right", fill="0")
	private BigDecimal bchkInqmAm= new BigDecimal("0");
	
	
	/**
	 * 조회필매수
	 */
	@ApiModelProperty(
		name = "inqmScnt"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("inqmScnt")
	@BxmOmm_Field(length=3, decimal=0, description="조회필매수", align="right", fill="0")
	private Integer inqmScnt= 0;
	
	
	/**
	 * 조회필수수료면제구분
	 */
	@ApiModelProperty(
		name = "inqmFeeXmpDis"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("inqmFeeXmpDis")
	@BxmOmm_Field(length=1, decimal=0, description="조회필수수료면제구분", align="left", fill="")
	private String inqmFeeXmpDis= "";
	
	
	/**
	 * 전액대체여부
	 */
	@ApiModelProperty(
		name = "tamTrfYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("tamTrfYn")
	@BxmOmm_Field(length=1, decimal=0, description="전액대체여부", align="left", fill="")
	private String tamTrfYn= "";
	
	
	/**
	 * 우대환율
	 */
	@ApiModelProperty(
		name = "pxrt"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("pxrt")
	@BxmOmm_Field(length=2, decimal=0, description="우대환율", align="right", fill="0")
	private Integer pxrt= 0;
	
	
	/**
	 * 원화대체금액
	 */
	@ApiModelProperty(
		name = "krwTrfAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("krwTrfAm")
	@BxmOmm_Field(length=12, decimal=0, description="원화대체금액", align="right", fill="0")
	private BigDecimal krwTrfAm= new BigDecimal("0");
	
	
	/**
	 * 통화코드
	 */
	@ApiModelProperty(
		name = "cucd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("cucd")
	@BxmOmm_Field(length=3, decimal=0, description="통화코드", align="left", fill="")
	private String cucd= "";
	
	
	/**
	 * 본지점매매구분코드
	 */
	@ApiModelProperty(
		name = "ioffSbDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ioffSbDscd")
	@BxmOmm_Field(length=1, decimal=0, description="본지점매매구분코드", align="left", fill="")
	private String ioffSbDscd= "";
	
	
	/**
	 * 현금대체구분코드
	 */
	@ApiModelProperty(
		name = "cshtfDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("cshtfDscd")
	@BxmOmm_Field(length=1, decimal=0, description="현금대체구분코드", align="left", fill="")
	private String cshtfDscd= "";
	
	
	/**
	 * 현찰수수료징수구분코드
	 */
	@ApiModelProperty(
		name = "cshFeeLevyDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("cshFeeLevyDscd")
	@BxmOmm_Field(length=4, decimal=0, description="현찰수수료징수구분코드", align="left", fill="")
	private String cshFeeLevyDscd= "";
	
	
	/**
	 * 현찰수수료
	 */
	@ApiModelProperty(
		name = "cshFee"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("cshFee")
	@BxmOmm_Field(length=19, decimal=3, description="현찰수수료", align="right", fill="0")
	private BigDecimal cshFee= new BigDecimal("0");
	
	
	/**
	 * 대상원화금액
	 */
	@ApiModelProperty(
		name = "tgtKrwAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("tgtKrwAm")
	@BxmOmm_Field(length=19, decimal=3, description="대상원화금액", align="right", fill="0")
	private BigDecimal tgtKrwAm= new BigDecimal("0");
	
	
	/**
	 * 외화대체금액
	 */
	@ApiModelProperty(
		name = "fcTrfAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("fcTrfAm")
	@BxmOmm_Field(length=19, decimal=3, description="외화대체금액", align="right", fill="0")
	private BigDecimal fcTrfAm= new BigDecimal("0");
	
	
	/**
	 * 외화현찰입금금액
	 */
	@ApiModelProperty(
		name = "fcCshRcvAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("fcCshRcvAm")
	@BxmOmm_Field(length=19, decimal=3, description="외화현찰입금금액", align="right", fill="0")
	private BigDecimal fcCshRcvAm= new BigDecimal("0");
	
	
	/**
	 * 주화금액
	 */
	@ApiModelProperty(
		name = "coinAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("coinAm")
	@BxmOmm_Field(length=19, decimal=3, description="주화금액", align="right", fill="0")
	private BigDecimal coinAm= new BigDecimal("0");
	
	
	/**
	 * 원화자금
	 */
	@ApiModelProperty(
		name = "krfd"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("krfd")
	@BxmOmm_Field(length=19, decimal=3, description="원화자금", align="right", fill="0")
	private BigDecimal krfd= new BigDecimal("0");
	
	
	/**
	 * 적용환율
	 */
	@ApiModelProperty(
		name = "apxrt"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("apxrt")
	@BxmOmm_Field(length=9, decimal=2, description="적용환율", align="right", fill="0")
	private BigDecimal apxrt= new BigDecimal("0");
	
	
	/**
	 * 고객우대환율
	 */
	@ApiModelProperty(
		name = "cusPrmeXrt"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("cusPrmeXrt")
	@BxmOmm_Field(length=9, decimal=2, description="고객우대환율", align="right", fill="0")
	private BigDecimal cusPrmeXrt= new BigDecimal("0");
	
	
	/**
	 * 본지점매매율
	 */
	@ApiModelProperty(
		name = "ioffSbRt"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("ioffSbRt")
	@BxmOmm_Field(length=9, decimal=2, description="본지점매매율", align="right", fill="0")
	private BigDecimal ioffSbRt= new BigDecimal("0");
	
	
	/**
	 * 선물환계약월수
	 */
	@ApiModelProperty(
		name = "fwxcCtrMcnt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("fwxcCtrMcnt")
	@BxmOmm_Field(length=3, decimal=0, description="선물환계약월수", align="left", fill="")
	private String fwxcCtrMcnt= "";
	
	
	/**
	 * 신규계좌번호
	 */
	@ApiModelProperty(
		name = "newAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("newAcno")
	@BxmOmm_Field(length=20, decimal=0, description="신규계좌번호", align="left", fill="")
	private String newAcno= "";
	
	
	/**
	 * 증권예탁원펀드번호
	 */
	@ApiModelProperty(
		name = "ksdFndNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ksdFndNo")
	@BxmOmm_Field(length=12, decimal=0, description="증권예탁원펀드번호", align="left", fill="")
	private String ksdFndNo= "";
	
	
	/**
	 * 퇴직연금거래구분번호
	 */
	@ApiModelProperty(
		name = "rtpenTrnDisNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rtpenTrnDisNo")
	@BxmOmm_Field(length=6, decimal=0, description="퇴직연금거래구분번호", align="left", fill="")
	private String rtpenTrnDisNo= "";
	
	
	/**
	 * 추천목표금액
	 */
	@ApiModelProperty(
		name = "rcmGoalAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("rcmGoalAm")
	@BxmOmm_Field(length=19, decimal=3, description="추천목표금액", align="right", fill="0")
	private BigDecimal rcmGoalAm= new BigDecimal("0");
	
	
	/**
	 * 가입카테고리코드
	 */
	@ApiModelProperty(
		name = "jnngCtgrCd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("jnngCtgrCd")
	@BxmOmm_Field(length=2, decimal=0, description="가입카테고리코드", align="left", fill="")
	private String jnngCtgrCd= "";
	
	
	/**
	 * 접수매체종류코드
	 */
	@ApiModelProperty(
		name = "rcpMdKdcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rcpMdKdcd")
	@BxmOmm_Field(length=8, decimal=0, description="접수매체종류코드", align="left", fill="")
	private String rcpMdKdcd= "";
	
	
	/**
	 * 주택청약주요내용통장인자여부
	 */
	@ApiModelProperty(
		name = "hsscMajTxtPbokPrngYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("hsscMajTxtPbokPrngYn")
	@BxmOmm_Field(length=1, decimal=0, description="주택청약주요내용통장인자여부", align="left", fill="")
	private String hsscMajTxtPbokPrngYn= "";
	
	
	/**
	 * 상품설명출력여부
	 */
	@ApiModelProperty(
		name = "prdDesOupYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("prdDesOupYn")
	@BxmOmm_Field(length=1, decimal=0, description="상품설명출력여부", align="left", fill="")
	private String prdDesOupYn= "";
	
	
	/**
	 * 상해보험가입여부
	 */
	@ApiModelProperty(
		name = "acicJnngYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("acicJnngYn")
	@BxmOmm_Field(length=1, decimal=0, description="상해보험가입여부", align="left", fill="")
	private String acicJnngYn= "";
	
	
	/**
	 * 주택청약신규구분코드
	 */
	@ApiModelProperty(
		name = "hsscNewDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("hsscNewDscd")
	@BxmOmm_Field(length=2, decimal=0, description="주택청약신규구분코드", align="left", fill="")
	private String hsscNewDscd= "";
	
	
	/**
	 * 주택청약주민등록지우편번호
	 */
	@ApiModelProperty(
		name = "hsscRgslZpno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("hsscRgslZpno")
	@BxmOmm_Field(length=6, decimal=0, description="주택청약주민등록지우편번호", align="left", fill="")
	private String hsscRgslZpno= "";
	
	
	/**
	 * 주택청약소득공제등록여부
	 */
	@ApiModelProperty(
		name = "hsscInddRgsYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("hsscInddRgsYn")
	@BxmOmm_Field(length=1, decimal=0, description="주택청약소득공제등록여부", align="left", fill="")
	private String hsscInddRgsYn= "";
	
	
	/**
	 * 주택청약희망지역우편번호
	 */
	@ApiModelProperty(
		name = "hsscHopeRgnZpno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("hsscHopeRgnZpno")
	@BxmOmm_Field(length=6, decimal=0, description="주택청약희망지역우편번호", align="left", fill="")
	private String hsscHopeRgnZpno= "";
	
	
	/**
	 * 희망주택종류구분코드
	 */
	@ApiModelProperty(
		name = "hopeHousKdDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("hopeHousKdDscd")
	@BxmOmm_Field(length=1, decimal=0, description="희망주택종류구분코드", align="left", fill="")
	private String hopeHousKdDscd= "";
	
	
	/**
	 * 주택전용면적구분코드
	 */
	@ApiModelProperty(
		name = "housXuseSqmDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("housXuseSqmDscd")
	@BxmOmm_Field(length=1, decimal=0, description="주택전용면적구분코드", align="left", fill="")
	private String housXuseSqmDscd= "";
	
	
	/**
	 * 희망입주년월
	 */
	@ApiModelProperty(
		name = "hopeMovinYm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("hopeMovinYm")
	@BxmOmm_Field(length=6, decimal=0, description="희망입주년월", align="left", fill="")
	private String hopeMovinYm= "";
	
	
	/**
	 * 간편신규등록일자
	 */
	@ApiModelProperty(
		name = "esnsNewRgsDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("esnsNewRgsDt")
	@BxmOmm_Field(length=8, decimal=0, description="간편신규등록일자", align="left", fill="")
	private String esnsNewRgsDt= "";
	
	
	/**
	 * 간편신규등록시각
	 */
	@ApiModelProperty(
		name = "esnsNewRgsTm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("esnsNewRgsTm")
	@BxmOmm_Field(length=6, decimal=0, description="간편신규등록시각", align="left", fill="")
	private String esnsNewRgsTm= "";
	
	
	/**
	 * 간편신규전자뱅킹이용자번호
	 */
	@ApiModelProperty(
		name = "esnsNewEbnkUtzpeNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("esnsNewEbnkUtzpeNo")
	@BxmOmm_Field(length=13, decimal=0, description="간편신규전자뱅킹이용자번호", align="left", fill="")
	private String esnsNewEbnkUtzpeNo= "";
	
	
	/**
	 * 자동이체종류코드
	 */
	@ApiModelProperty(
		name = "atsKdcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atsKdcd")
	@BxmOmm_Field(length=3, decimal=0, description="자동이체종류코드", align="left", fill="")
	private String atsKdcd= "";
	
	
	/**
	 * 다수계좌개설사유코드
	 */
	@ApiModelProperty(
		name = "lnoActOpngRncd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("lnoActOpngRncd")
	@BxmOmm_Field(length=1, decimal=0, description="다수계좌개설사유코드", align="left", fill="")
	private String lnoActOpngRncd= "";
	
	
	/**
	 * 스캔정보실명확인구분코드
	 */
	@ApiModelProperty(
		name = "scanInfAcnmCnfDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("scanInfAcnmCnfDscd")
	@BxmOmm_Field(length=1, decimal=0, description="스캔정보실명확인구분코드", align="left", fill="")
	private String scanInfAcnmCnfDscd= "";
	
	
	/**
	 * 대리인거래여부
	 */
	@ApiModelProperty(
		name = "agnpeTrnYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("agnpeTrnYn")
	@BxmOmm_Field(length=1, decimal=0, description="대리인거래여부", align="left", fill="")
	private String agnpeTrnYn= "";
	
	
	/**
	 * 수신비밀번호등록구분코드
	 */
	@ApiModelProperty(
		name = "dpsPwnoRgsDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dpsPwnoRgsDscd")
	@BxmOmm_Field(length=2, decimal=0, description="수신비밀번호등록구분코드", align="left", fill="")
	private String dpsPwnoRgsDscd= "";
	
	
	/**
	 * 사전등록비밀번호키확인
	 */
	@ApiModelProperty(
		name = "prrRgsPwnoKeyCnf"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("prrRgsPwnoKeyCnf")
	@BxmOmm_Field(length=7, decimal=0, description="사전등록비밀번호키확인", align="left", fill="")
	private String prrRgsPwnoKeyCnf= "";
	
	
	/**
	 * 암호화계좌비밀번호확인
	 */
	@ApiModelProperty(
		name = "encyActPwnoCnf"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("encyActPwnoCnf")
	@BxmOmm_Field(length=32, decimal=0, description="암호화계좌비밀번호확인", align="left", fill="")
	private String encyActPwnoCnf= "";
	
	
	/**
	 * 우리닷컴통장여부
	 */
	@ApiModelProperty(
		name = "wdcPbokYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("wdcPbokYn")
	@BxmOmm_Field(length=1, decimal=0, description="우리닷컴통장여부", align="left", fill="")
	private String wdcPbokYn= "";
	
	
	/**
	 * 우리사랑플러스기부단체구분코드
	 */
	@ApiModelProperty(
		name = "wooriLovPlsDntnAscnDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("wooriLovPlsDntnAscnDscd")
	@BxmOmm_Field(length=1, decimal=0, description="우리사랑플러스기부단체구분코드", align="left", fill="")
	private String wooriLovPlsDntnAscnDscd= "";
	
	
	/**
	 * 동일신청서일련번호
	 */
	@ApiModelProperty(
		name = "sameRqdcSrno"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("sameRqdcSrno")
	@BxmOmm_Field(length=1, decimal=0, description="동일신청서일련번호", align="right", fill="0")
	private Integer sameRqdcSrno= 0;
	
	
	/**
	 * 기타증서구분코드
	 */
	@ApiModelProperty(
		name = "etcDeedDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("etcDeedDscd")
	@BxmOmm_Field(length=2, decimal=0, description="기타증서구분코드", align="left", fill="")
	private String etcDeedDscd= "";
	
	
	/**
	 * 계좌승인번호
	 */
	@ApiModelProperty(
		name = "actApvNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("actApvNo")
	@BxmOmm_Field(length=4, decimal=0, description="계좌승인번호", align="left", fill="")
	private String actApvNo= "";
	
	
	/**
	 * 펀드리밸런싱신규여부
	 */
	@ApiModelProperty(
		name = "fndRblnNewYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("fndRblnNewYn")
	@BxmOmm_Field(length=1, decimal=0, description="펀드리밸런싱신규여부", align="left", fill="")
	private String fndRblnNewYn= "";
	
	
	/**
	 * 초입금출금여부
	 */
	@ApiModelProperty(
		name = "bgnnRcvWdrYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("bgnnRcvWdrYn")
	@BxmOmm_Field(length=1, decimal=0, description="초입금출금여부", align="left", fill="")
	private String bgnnRcvWdrYn= "";
	
	
	/**
	 * 기업통합고객번호
	 */
	@ApiModelProperty(
		name = "copItcsno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("copItcsno")
	@BxmOmm_Field(length=11, decimal=0, description="기업통합고객번호", align="left", fill="")
	private String copItcsno= "";
	
	
	/**
	 * 인터넷뱅킹신규여부
	 */
	@ApiModelProperty(
		name = "inbkNewYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("inbkNewYn")
	@BxmOmm_Field(length=1, decimal=0, description="인터넷뱅킹신규여부", align="left", fill="")
	private String inbkNewYn= "";
	
	
	/**
	 * 스마트뱅킹신규여부
	 */
	@ApiModelProperty(
		name = "smrtBnkgNewYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("smrtBnkgNewYn")
	@BxmOmm_Field(length=1, decimal=0, description="스마트뱅킹신규여부", align="left", fill="")
	private String smrtBnkgNewYn= "";
	
	
	/**
	 * 텔레뱅킹신규여부
	 */
	@ApiModelProperty(
		name = "tlbnkNewYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("tlbnkNewYn")
	@BxmOmm_Field(length=1, decimal=0, description="텔레뱅킹신규여부", align="left", fill="")
	private String tlbnkNewYn= "";
	
	
	/**
	 * 알림서비스등록여부
	 */
	@ApiModelProperty(
		name = "ntsvcRgsYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ntsvcRgsYn")
	@BxmOmm_Field(length=1, decimal=0, description="알림서비스등록여부", align="left", fill="")
	private String ntsvcRgsYn= "";
	
	
	/**
	 * 인터넷뱅킹출금계좌등록여부
	 */
	@ApiModelProperty(
		name = "inbkWdrActRgsYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("inbkWdrActRgsYn")
	@BxmOmm_Field(length=1, decimal=0, description="인터넷뱅킹출금계좌등록여부", align="left", fill="")
	private String inbkWdrActRgsYn= "";
	
	
	/**
	 * 인터넷뱅킹사용자ID
	 */
	@ApiModelProperty(
		name = "inetBnkgUserId"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("inetBnkgUserId")
	@BxmOmm_Field(length=10, decimal=0, description="인터넷뱅킹사용자ID", align="left", fill="")
	private String inetBnkgUserId= "";
	
	
	/**
	 * 전자뱅킹비밀번호
	 */
	@ApiModelProperty(
		name = "ebnkPwno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ebnkPwno")
	@BxmOmm_Field(length=50, decimal=0, description="전자뱅킹비밀번호", align="left", fill="")
	private String ebnkPwno= "";
	
	
	/**
	 * 영문성명
	 */
	@ApiModelProperty(
		name = "engNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("engNm")
	@BxmOmm_Field(length=40, decimal=0, description="영문성명", align="left", fill="")
	private String engNm= "";
	
	
	/**
	 * 1회이체한도금액
	 */
	@ApiModelProperty(
		name = "tms1TsLmtAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("tms1TsLmtAm")
	@BxmOmm_Field(length=19, decimal=3, description="1회이체한도금액", align="right", fill="0")
	private BigDecimal tms1TsLmtAm= new BigDecimal("0");
	
	
	/**
	 * 1일이체한도금액
	 */
	@ApiModelProperty(
		name = "d1TsLmtAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("d1TsLmtAm")
	@BxmOmm_Field(length=19, decimal=3, description="1일이체한도금액", align="right", fill="0")
	private BigDecimal d1TsLmtAm= new BigDecimal("0");
	
	
	/**
	 * 보안카드일련번호
	 */
	@ApiModelProperty(
		name = "secrdSrno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("secrdSrno")
	@BxmOmm_Field(length=10, decimal=0, description="보안카드일련번호", align="left", fill="")
	private String secrdSrno= "";
	
	
	/**
	 * OTP카드일련번호
	 */
	@ApiModelProperty(
		name = "otpcSrno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("otpcSrno")
	@BxmOmm_Field(length=16, decimal=0, description="OTP카드일련번호", align="left", fill="")
	private String otpcSrno= "";
	
	
	/**
	 * OTP발생기비밀번호
	 */
	@ApiModelProperty(
		name = "otpPwd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("otpPwd")
	@BxmOmm_Field(length=32, decimal=0, description="OTP발생기비밀번호", align="left", fill="")
	private String otpPwd= "";
	
	
	/**
	 * OTP발급비용면제구분코드
	 */
	@ApiModelProperty(
		name = "otpIsuCostXmpDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("otpIsuCostXmpDscd")
	@BxmOmm_Field(length=1, decimal=0, description="OTP발급비용면제구분코드", align="left", fill="")
	private String otpIsuCostXmpDscd= "";
	
	
	/**
	 * 데이터수신전화번호
	 */
	@ApiModelProperty(
		name = "datDpsTelNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("datDpsTelNo")
	@BxmOmm_Field(length=14, decimal=0, description="데이터수신전화번호", align="left", fill="")
	private String datDpsTelNo= "";
	
	
	/**
	 * 종합통장구분코드
	 */
	@ApiModelProperty(
		name = "synpbDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("synpbDscd")
	@BxmOmm_Field(length=1, decimal=0, description="종합통장구분코드", align="left", fill="")
	private String synpbDscd= "";
	
	
	/**
	 * 인터넷뱅킹접수일련번호
	 */
	@ApiModelProperty(
		name = "inetBnkgRcpSrno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("inetBnkgRcpSrno")
	@BxmOmm_Field(length=20, decimal=0, description="인터넷뱅킹접수일련번호", align="left", fill="")
	private String inetBnkgRcpSrno= "";
	
	
	/**
	 * 인터넷뱅킹예약등록점코드
	 */
	@ApiModelProperty(
		name = "inbkRsvRgbrCd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("inbkRsvRgbrCd")
	@BxmOmm_Field(length=6, decimal=0, description="인터넷뱅킹예약등록점코드", align="left", fill="")
	private String inbkRsvRgbrCd= "";
	
	
	/**
	 * 인터넷뱅킹예약등록일자
	 */
	@ApiModelProperty(
		name = "inbkRsvRgsDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("inbkRsvRgsDt")
	@BxmOmm_Field(length=8, decimal=0, description="인터넷뱅킹예약등록일자", align="left", fill="")
	private String inbkRsvRgsDt= "";
	
	
	/**
	 * 인터넷뱅킹예약등록일련번호
	 */
	@ApiModelProperty(
		name = "inbkRsvRgsSrno"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("inbkRsvRgsSrno")
	@BxmOmm_Field(length=5, decimal=0, description="인터넷뱅킹예약등록일련번호", align="right", fill="0")
	private Integer inbkRsvRgsSrno= 0;
	
	
	/**
	 * 스마트뱅킹인터넷뱅킹ID
	 */
	@ApiModelProperty(
		name = "smrtBnkgInetBnkgId"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("smrtBnkgInetBnkgId")
	@BxmOmm_Field(length=10, decimal=0, description="스마트뱅킹인터넷뱅킹ID", align="left", fill="")
	private String smrtBnkgInetBnkgId= "";
	
	
	/**
	 * 스마트뱅킹핸드폰회사코드
	 */
	@ApiModelProperty(
		name = "smrtBnkgHpComCd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("smrtBnkgHpComCd")
	@BxmOmm_Field(length=4, decimal=0, description="스마트뱅킹핸드폰회사코드", align="left", fill="")
	private String smrtBnkgHpComCd= "";
	
	
	/**
	 * 스마트뱅킹핸드폰국번번호
	 */
	@ApiModelProperty(
		name = "smrtBnkgHpTlenNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("smrtBnkgHpTlenNo")
	@BxmOmm_Field(length=4, decimal=0, description="스마트뱅킹핸드폰국번번호", align="left", fill="")
	private String smrtBnkgHpTlenNo= "";
	
	
	/**
	 * 스마트뱅킹핸드폰일련번호
	 */
	@ApiModelProperty(
		name = "smrtBnkgHpSrno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("smrtBnkgHpSrno")
	@BxmOmm_Field(length=4, decimal=0, description="스마트뱅킹핸드폰일련번호", align="left", fill="")
	private String smrtBnkgHpSrno= "";
	
	
	/**
	 * 텔레뱅킹보안카드일련번호
	 */
	@ApiModelProperty(
		name = "tlbnkSecrdSrno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("tlbnkSecrdSrno")
	@BxmOmm_Field(length=10, decimal=0, description="텔레뱅킹보안카드일련번호", align="left", fill="")
	private String tlbnkSecrdSrno= "";
	
	
	/**
	 * 암호화전자뱅킹비밀번호
	 */
	@ApiModelProperty(
		name = "encyEbnkPwno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("encyEbnkPwno")
	@BxmOmm_Field(length=32, decimal=0, description="암호화전자뱅킹비밀번호", align="left", fill="")
	private String encyEbnkPwno= "";
	
	
	/**
	 * 텔레뱅킹1일이체한도
	 */
	@ApiModelProperty(
		name = "tlbnkD1TsLmt"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("tlbnkD1TsLmt")
	@BxmOmm_Field(length=15, decimal=0, description="텔레뱅킹1일이체한도", align="right", fill="0")
	private BigDecimal tlbnkD1TsLmt= new BigDecimal("0");
	
	
	/**
	 * 텔레뱅킹1회이체한도
	 */
	@ApiModelProperty(
		name = "tlbnkTms1TsLmt"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("tlbnkTms1TsLmt")
	@BxmOmm_Field(length=15, decimal=0, description="텔레뱅킹1회이체한도", align="right", fill="0")
	private BigDecimal tlbnkTms1TsLmt= new BigDecimal("0");
	
	
	/**
	 * 알림서비스입출금구분코드
	 */
	@ApiModelProperty(
		name = "ntsvcRawDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ntsvcRawDscd")
	@BxmOmm_Field(length=1, decimal=0, description="알림서비스입출금구분코드", align="left", fill="")
	private String ntsvcRawDscd= "";
	
	
	/**
	 * 알림서비스잔액미표시여부
	 */
	@ApiModelProperty(
		name = "ntsvcBalNtyMarkYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ntsvcBalNtyMarkYn")
	@BxmOmm_Field(length=1, decimal=0, description="알림서비스잔액미표시여부", align="left", fill="")
	private String ntsvcBalNtyMarkYn= "";
	
	
	/**
	 * 알림서비스핸드폰회사코드
	 */
	@ApiModelProperty(
		name = "ntsvcHpComCd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ntsvcHpComCd")
	@BxmOmm_Field(length=4, decimal=0, description="알림서비스핸드폰회사코드", align="left", fill="")
	private String ntsvcHpComCd= "";
	
	
	/**
	 * 알림서비스핸드폰국번번호
	 */
	@ApiModelProperty(
		name = "ntsvcHpTlenNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ntsvcHpTlenNo")
	@BxmOmm_Field(length=4, decimal=0, description="알림서비스핸드폰국번번호", align="left", fill="")
	private String ntsvcHpTlenNo= "";
	
	
	/**
	 * 알림서비스핸드폰일련번호
	 */
	@ApiModelProperty(
		name = "ntsvcHpSrno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ntsvcHpSrno")
	@BxmOmm_Field(length=4, decimal=0, description="알림서비스핸드폰일련번호", align="left", fill="")
	private String ntsvcHpSrno= "";
	
	
	/**
	 * 알림서비스입출금액
	 */
	@ApiModelProperty(
		name = "ntsvcInotAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("ntsvcInotAm")
	@BxmOmm_Field(length=15, decimal=0, description="알림서비스입출금액", align="right", fill="0")
	private BigDecimal ntsvcInotAm= new BigDecimal("0");
	
	
	/**
	 * 자동이체내역통지여부
	 */
	@ApiModelProperty(
		name = "astPrtsNtcYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("astPrtsNtcYn")
	@BxmOmm_Field(length=1, decimal=0, description="자동이체내역통지여부", align="left", fill="")
	private String astPrtsNtcYn= "";
	
	
	/**
	 * 알림서비스전송시작시간
	 */
	@ApiModelProperty(
		name = "ntsvcTmsStaTim"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ntsvcTmsStaTim")
	@BxmOmm_Field(length=2, decimal=0, description="알림서비스전송시작시간", align="left", fill="")
	private String ntsvcTmsStaTim= "";
	
	
	/**
	 * 알림서비스전송종료시간
	 */
	@ApiModelProperty(
		name = "ntsvcTmsEndTim"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ntsvcTmsEndTim")
	@BxmOmm_Field(length=2, decimal=0, description="알림서비스전송종료시간", align="left", fill="")
	private String ntsvcTmsEndTim= "";
	
	
	/**
	 * 출금계좌등록인터넷뱅킹ID
	 */
	@ApiModelProperty(
		name = "wdrActRgsInetBnkgId"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("wdrActRgsInetBnkgId")
	@BxmOmm_Field(length=10, decimal=0, description="출금계좌등록인터넷뱅킹ID", align="left", fill="")
	private String wdrActRgsInetBnkgId= "";
	
	
	/**
	 * 전자뱅킹출금계좌동시등록여부
	 */
	@ApiModelProperty(
		name = "ebnkWdrActCnccRgsYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ebnkWdrActCnccRgsYn")
	@BxmOmm_Field(length=1, decimal=0, description="전자뱅킹출금계좌동시등록여부", align="left", fill="")
	private String ebnkWdrActCnccRgsYn= "";
	
	
	/**
	 * 텔레뱅킹출금계좌동시등록여부
	 */
	@ApiModelProperty(
		name = "tlbnkWdrActCnccRgsYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("tlbnkWdrActCnccRgsYn")
	@BxmOmm_Field(length=1, decimal=0, description="텔레뱅킹출금계좌동시등록여부", align="left", fill="")
	private String tlbnkWdrActCnccRgsYn= "";
	
	
	/**
	 * 부부통장서류발송여부
	 */
	@ApiModelProperty(
		name = "hswfPbokDocSndYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("hswfPbokDocSndYn")
	@BxmOmm_Field(length=1, decimal=0, description="부부통장서류발송여부", align="left", fill="")
	private String hswfPbokDocSndYn= "";
	
	
	/**
	 * 부예금주고객번호
	 */
	@ApiModelProperty(
		name = "faOwacCsno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("faOwacCsno")
	@BxmOmm_Field(length=9, decimal=0, description="부예금주고객번호", align="left", fill="")
	private String faOwacCsno= "";
	
	
	/**
	 * 금융사기등록여부
	 */
	@ApiModelProperty(
		name = "flieRgsYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("flieRgsYn")
	@BxmOmm_Field(length=1, decimal=0, description="금융사기등록여부", align="left", fill="")
	private String flieRgsYn= "";
	
	
	/**
	 * 자동이체여부
	 */
	@ApiModelProperty(
		name = "atsYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atsYn")
	@BxmOmm_Field(length=1, decimal=0, description="자동이체여부", align="left", fill="")
	private String atsYn= "";
	
	
	/**
	 * 꿀머니사용금액
	 */
	@ApiModelProperty(
		name = "hmnyUsgAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("hmnyUsgAm")
	@BxmOmm_Field(length=19, decimal=3, description="꿀머니사용금액", align="right", fill="0")
	private BigDecimal hmnyUsgAm= new BigDecimal("0");
	
	
	/**
	 * 기타계좌번호
	 */
	@ApiModelProperty(
		name = "etcAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("etcAcno")
	@BxmOmm_Field(length=15, decimal=0, description="기타계좌번호", align="left", fill="")
	private String etcAcno= "";
	
	
	/**
	 * 신탁보수율정수
	 */
	@ApiModelProperty(
		name = "trtpyRtPsnb"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("trtpyRtPsnb")
	@BxmOmm_Field(length=6, decimal=0, description="신탁보수율정수", align="left", fill="")
	private String trtpyRtPsnb= "";
	
	
	/**
	 * 신탁보수율소수
	 */
	@ApiModelProperty(
		name = "trtpyRtDcml"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("trtpyRtDcml")
	@BxmOmm_Field(length=2, decimal=0, description="신탁보수율소수", align="left", fill="")
	private String trtpyRtDcml= "";
	
	
	/**
	 * 변동금리통지구분코드
	 */
	@ApiModelProperty(
		name = "fltIrNtcDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("fltIrNtcDscd")
	@BxmOmm_Field(length=2, decimal=0, description="변동금리통지구분코드", align="left", fill="")
	private String fltIrNtcDscd= "";
	
	
	/**
	 * 대기업상생예금신규여부
	 */
	@ApiModelProperty(
		name = "etpCoplsDpstNewYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("etpCoplsDpstNewYn")
	@BxmOmm_Field(length=1, decimal=0, description="대기업상생예금신규여부", align="left", fill="")
	private String etpCoplsDpstNewYn= "";
	
	
	/**
	 * 자동이체제외여부
	 */
	@ApiModelProperty(
		name = "atsXtYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atsXtYn")
	@BxmOmm_Field(length=1, decimal=0, description="자동이체제외여부", align="left", fill="")
	private String atsXtYn= "";
	
	
	/**
	 * 특판상품코드
	 */
	@ApiModelProperty(
		name = "spslPdcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("spslPdcd")
	@BxmOmm_Field(length=13, decimal=0, description="특판상품코드", align="left", fill="")
	private String spslPdcd= "";
	
	
	/**
	 * 신탁선취보수율정수
	 */
	@ApiModelProperty(
		name = "trtPocpPfeRtPsnb"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("trtPocpPfeRtPsnb")
	@BxmOmm_Field(length=2, decimal=0, description="신탁선취보수율정수", align="left", fill="")
	private String trtPocpPfeRtPsnb= "";
	
	
	/**
	 * 신탁선취보수율소수
	 */
	@ApiModelProperty(
		name = "trtPocpPfeRtDcml"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("trtPocpPfeRtDcml")
	@BxmOmm_Field(length=3, decimal=0, description="신탁선취보수율소수", align="left", fill="")
	private String trtPocpPfeRtDcml= "";
	
	
	/**
	 * 신탁후취보수율정수
	 */
	@ApiModelProperty(
		name = "trtDfanPfeRtPsnb"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("trtDfanPfeRtPsnb")
	@BxmOmm_Field(length=2, decimal=0, description="신탁후취보수율정수", align="left", fill="")
	private String trtDfanPfeRtPsnb= "";
	
	
	/**
	 * 신탁후취보수율소수
	 */
	@ApiModelProperty(
		name = "trtDfanPfeRtDcml"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("trtDfanPfeRtDcml")
	@BxmOmm_Field(length=3, decimal=0, description="신탁후취보수율소수", align="left", fill="")
	private String trtDfanPfeRtDcml= "";
	
	
	/**
	 * 쿠폰입력구분코드
	 */
	@ApiModelProperty(
		name = "cponInpDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("cponInpDscd")
	@BxmOmm_Field(length=1, decimal=0, description="쿠폰입력구분코드", align="left", fill="")
	private String cponInpDscd= "";
	
	
	/**
	 * 약정이율정수
	 */
	@ApiModelProperty(
		name = "agmIrtPsnb"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("agmIrtPsnb")
	@BxmOmm_Field(length=6, decimal=0, description="약정이율정수", align="right", fill="0")
	private Integer agmIrtPsnb= 0;
	
	
	/**
	 * 약정이율소수
	 */
	@ApiModelProperty(
		name = "agmIrtDcml"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("agmIrtDcml")
	@BxmOmm_Field(length=2, decimal=0, description="약정이율소수", align="left", fill="")
	private String agmIrtDcml= "";
	
	
	/**
	 * 통장적요
	 */
	@ApiModelProperty(
		name = "pbokOtln"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("pbokOtln")
	@BxmOmm_Field(length=20, decimal=0, description="통장적요", align="left", fill="")
	private String pbokOtln= "";
	
	
	/**
	 * 단체소속코드
	 */
	@ApiModelProperty(
		name = "ascnBlgCd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ascnBlgCd")
	@BxmOmm_Field(length=2, decimal=0, description="단체소속코드", align="left", fill="")
	private String ascnBlgCd= "";
	
	
	/**
	 * 적립증명서발송구분코드
	 */
	@ApiModelProperty(
		name = "acldCrtdSndDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("acldCrtdSndDscd")
	@BxmOmm_Field(length=1, decimal=0, description="적립증명서발송구분코드", align="left", fill="")
	private String acldCrtdSndDscd= "";
	
	
	/**
	 * ISA주요사항통장인자여부
	 */
	@ApiModelProperty(
		name = "isaMajSbjPbokPrngYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("isaMajSbjPbokPrngYn")
	@BxmOmm_Field(length=1, decimal=0, description="ISA주요사항통장인자여부", align="left", fill="")
	private String isaMajSbjPbokPrngYn= "";
	
	
	/**
	 * ISA신규구분코드
	 */
	@ApiModelProperty(
		name = "isaNewDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("isaNewDscd")
	@BxmOmm_Field(length=1, decimal=0, description="ISA신규구분코드", align="left", fill="")
	private String isaNewDscd= "";
	
	
	/**
	 * ISA가입구분코드
	 */
	@ApiModelProperty(
		name = "isaJnngDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("isaJnngDscd")
	@BxmOmm_Field(length=1, decimal=0, description="ISA가입구분코드", align="left", fill="")
	private String isaJnngDscd= "";
	
	
	/**
	 * 가입권유자직원번호
	 */
	@ApiModelProperty(
		name = "jnngAdvpeEno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("jnngAdvpeEno")
	@BxmOmm_Field(length=8, decimal=0, description="가입권유자직원번호", align="left", fill="")
	private String jnngAdvpeEno= "";
	
	
	/**
	 * 비과세구분코드
	 */
	@ApiModelProperty(
		name = "extxDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("extxDscd")
	@BxmOmm_Field(length=1, decimal=0, description="비과세구분코드", align="left", fill="")
	private String extxDscd= "";
	
	
	/**
	 * 의무가입기간구분코드
	 */
	@ApiModelProperty(
		name = "dtjnTemDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dtjnTemDscd")
	@BxmOmm_Field(length=1, decimal=0, description="의무가입기간구분코드", align="left", fill="")
	private String dtjnTemDscd= "";
	
	
	/**
	 * 필수서류징구여부
	 */
	@ApiModelProperty(
		name = "mndDocCollYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("mndDocCollYn")
	@BxmOmm_Field(length=1, decimal=0, description="필수서류징구여부", align="left", fill="")
	private String mndDocCollYn= "";
	
	
	/**
	 * 입영일자
	 */
	@ApiModelProperty(
		name = "enmtDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("enmtDt")
	@BxmOmm_Field(length=8, decimal=0, description="입영일자", align="left", fill="")
	private String enmtDt= "";
	
	
	/**
	 * 전역일자
	 */
	@ApiModelProperty(
		name = "dshgDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dshgDt")
	@BxmOmm_Field(length=8, decimal=0, description="전역일자", align="left", fill="")
	private String dshgDt= "";
	
	
	/**
	 * 계약이전기관코드
	 */
	@ApiModelProperty(
		name = "ctrmvIscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ctrmvIscd")
	@BxmOmm_Field(length=4, decimal=0, description="계약이전기관코드", align="left", fill="")
	private String ctrmvIscd= "";
	
	
	/**
	 * 퇴직보험전환금액
	 */
	@ApiModelProperty(
		name = "rtrtInsuCnvrAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("rtrtInsuCnvrAm")
	@BxmOmm_Field(length=19, decimal=3, description="퇴직보험전환금액", align="right", fill="0")
	private BigDecimal rtrtInsuCnvrAm= new BigDecimal("0");
	
	
	/**
	 * 기가입자유형코드
	 */
	@ApiModelProperty(
		name = "aldJnpeTycd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("aldJnpeTycd")
	@BxmOmm_Field(length=2, decimal=0, description="기가입자유형코드", align="left", fill="")
	private String aldJnpeTycd= "";
	
	
	/**
	 * 최초가입일자
	 */
	@ApiModelProperty(
		name = "fstJnngDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("fstJnngDt")
	@BxmOmm_Field(length=8, decimal=0, description="최초가입일자", align="left", fill="")
	private String fstJnngDt= "";
	
	
	/**
	 * 이전계좌번호
	 */
	@ApiModelProperty(
		name = "tfrAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("tfrAcno")
	@BxmOmm_Field(length=20, decimal=0, description="이전계좌번호", align="left", fill="")
	private String tfrAcno= "";
	
	
	/**
	 * 플랜번호
	 */
	@ApiModelProperty(
		name = "planNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("planNo")
	@BxmOmm_Field(length=14, decimal=0, description="플랜번호", align="left", fill="")
	private String planNo= "";
	
	
	/**
	 * 부담금종류코드
	 */
	@ApiModelProperty(
		name = "brdmKdcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("brdmKdcd")
	@BxmOmm_Field(length=2, decimal=0, description="부담금종류코드", align="left", fill="")
	private String brdmKdcd= "";
	
	
	/**
	 * 예정지시관리번호
	 */
	@ApiModelProperty(
		name = "scdOrdsMngNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("scdOrdsMngNo")
	@BxmOmm_Field(length=24, decimal=0, description="예정지시관리번호", align="left", fill="")
	private String scdOrdsMngNo= "";
	
	
	/**
	 * 퇴직연금기업부담금액
	 */
	@ApiModelProperty(
		name = "rtpenCobdnAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("rtpenCobdnAm")
	@BxmOmm_Field(length=19, decimal=3, description="퇴직연금기업부담금액", align="right", fill="0")
	private BigDecimal rtpenCobdnAm= new BigDecimal("0");
	
	
	/**
	 * 퇴직연금개인부담금액
	 */
	@ApiModelProperty(
		name = "rtpenPbdnAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("rtpenPbdnAm")
	@BxmOmm_Field(length=19, decimal=3, description="퇴직연금개인부담금액", align="right", fill="0")
	private BigDecimal rtpenPbdnAm= new BigDecimal("0");
	
	
	/**
	 * 운용관리수수료
	 */
	@ApiModelProperty(
		name = "opgMngFee"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("opgMngFee")
	@BxmOmm_Field(length=19, decimal=3, description="운용관리수수료", align="right", fill="0")
	private BigDecimal opgMngFee= new BigDecimal("0");
	
	
	/**
	 * 자산관리수수료
	 */
	@ApiModelProperty(
		name = "asetMngFee"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("asetMngFee")
	@BxmOmm_Field(length=19, decimal=3, description="자산관리수수료", align="right", fill="0")
	private BigDecimal asetMngFee= new BigDecimal("0");
	
	
	/**
	 * 결제계좌번호
	 */
	@ApiModelProperty(
		name = "stlAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("stlAcno")
	@BxmOmm_Field(length=20, decimal=0, description="결제계좌번호", align="left", fill="")
	private String stlAcno= "";
	
	
	/**
	 * 암호화결제계좌비밀번호
	 */
	@ApiModelProperty(
		name = "encyStlActPwno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("encyStlActPwno")
	@BxmOmm_Field(length=32, decimal=0, description="암호화결제계좌비밀번호", align="left", fill="")
	private String encyStlActPwno= "";
	
	
	/**
	 * 만기후추가납입구분코드
	 */
	@ApiModelProperty(
		name = "afepAddPidDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("afepAddPidDscd")
	@BxmOmm_Field(length=1, decimal=0, description="만기후추가납입구분코드", align="left", fill="")
	private String afepAddPidDscd= "";
	
	
	/**
	 * 환매연동신규구분코드
	 */
	@ApiModelProperty(
		name = "rprhLnkNewDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rprhLnkNewDscd")
	@BxmOmm_Field(length=1, decimal=0, description="환매연동신규구분코드", align="left", fill="")
	private String rprhLnkNewDscd= "";
	
	
	/**
	 * 해지예약펀드계좌번호
	 */
	@ApiModelProperty(
		name = "cancRsvFndAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("cancRsvFndAcno")
	@BxmOmm_Field(length=13, decimal=0, description="해지예약펀드계좌번호", align="left", fill="")
	private String cancRsvFndAcno= "";
	
	
	/**
	 * 환매금액전액신규구분코드
	 */
	@ApiModelProperty(
		name = "rprhAmTamNewDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rprhAmTamNewDscd")
	@BxmOmm_Field(length=1, decimal=0, description="환매금액전액신규구분코드", align="left", fill="")
	private String rprhAmTamNewDscd= "";
	
	
	/**
	 * 우수기업우대이율
	 */
	@ApiModelProperty(
		name = "xcoPrmeIrt"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("xcoPrmeIrt")
	@BxmOmm_Field(length=7, decimal=3, description="우수기업우대이율", align="right", fill="0")
	private BigDecimal xcoPrmeIrt= new BigDecimal("0");
	
	
	/**
	 * 펀드목표수익율정수
	 */
	@ApiModelProperty(
		name = "fndGoalPrftRtPsnb"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("fndGoalPrftRtPsnb")
	@BxmOmm_Field(length=6, decimal=0, description="펀드목표수익율정수", align="right", fill="0")
	private Integer fndGoalPrftRtPsnb= 0;
	
	
	/**
	 * 펀드목표수익율소수
	 */
	@ApiModelProperty(
		name = "fndGoalPrftRtDcml"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("fndGoalPrftRtDcml")
	@BxmOmm_Field(length=2, decimal=0, description="펀드목표수익율소수", align="left", fill="")
	private String fndGoalPrftRtDcml= "";
	
	
	/**
	 * 서비스신청금액
	 */
	@ApiModelProperty(
		name = "srvcRqAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("srvcRqAm")
	@BxmOmm_Field(length=18, decimal=0, description="서비스신청금액", align="right", fill="0")
	private BigDecimal srvcRqAm= new BigDecimal("0");
	
	
	/**
	 * 펀드잔고통지구분
	 */
	@ApiModelProperty(
		name = "fndAcblNtcDis"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("fndAcblNtcDis")
	@BxmOmm_Field(length=1, decimal=0, description="펀드잔고통지구분", align="left", fill="")
	private String fndAcblNtcDis= "";
	
	
	/**
	 * 펀드잔고알림기준일
	 */
	@ApiModelProperty(
		name = "fndAcblNtfcBasDd"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("fndAcblNtfcBasDd")
	@BxmOmm_Field(length=2, decimal=0, description="펀드잔고알림기준일", align="right", fill="0")
	private Integer fndAcblNtfcBasDd= 0;
	
	
	/**
	 * 펀드수익율SMS문자신청구분코드
	 */
	@ApiModelProperty(
		name = "fndPrftRtSmsChrRqDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("fndPrftRtSmsChrRqDscd")
	@BxmOmm_Field(length=1, decimal=0, description="펀드수익율SMS문자신청구분코드", align="left", fill="")
	private String fndPrftRtSmsChrRqDscd= "";
	
	
	/**
	 * 펀드SMS신청목표수익율정수
	 */
	@ApiModelProperty(
		name = "fndSmsRqTprtPsnb"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("fndSmsRqTprtPsnb")
	@BxmOmm_Field(length=6, decimal=0, description="펀드SMS신청목표수익율정수", align="right", fill="0")
	private Integer fndSmsRqTprtPsnb= 0;
	
	
	/**
	 * 펀드SMS신청목표수익율소수
	 */
	@ApiModelProperty(
		name = "fndSmsRqTprtDcml"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("fndSmsRqTprtDcml")
	@BxmOmm_Field(length=2, decimal=0, description="펀드SMS신청목표수익율소수", align="left", fill="")
	private String fndSmsRqTprtDcml= "";
	
	
	/**
	 * 펀드SMS신청목표수익율구분코드
	 */
	@ApiModelProperty(
		name = "fndSmsRqTprtDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("fndSmsRqTprtDscd")
	@BxmOmm_Field(length=1, decimal=0, description="펀드SMS신청목표수익율구분코드", align="left", fill="")
	private String fndSmsRqTprtDscd= "";
	
	
	/**
	 * 펀드SMS신청손실허용율정수
	 */
	@ApiModelProperty(
		name = "fndSmsRqLossAwrtPsnb"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("fndSmsRqLossAwrtPsnb")
	@BxmOmm_Field(length=6, decimal=0, description="펀드SMS신청손실허용율정수", align="right", fill="0")
	private Integer fndSmsRqLossAwrtPsnb= 0;
	
	
	/**
	 * 펀드SMS신청손실허용율소수
	 */
	@ApiModelProperty(
		name = "fndSmsRqLossAwrtDcml"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("fndSmsRqLossAwrtDcml")
	@BxmOmm_Field(length=2, decimal=0, description="펀드SMS신청손실허용율소수", align="left", fill="")
	private String fndSmsRqLossAwrtDcml= "";
	
	
	/**
	 * 펀드SMS신청손실허용율구분코드
	 */
	@ApiModelProperty(
		name = "fndSmsRqLossAwrtDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("fndSmsRqLossAwrtDscd")
	@BxmOmm_Field(length=1, decimal=0, description="펀드SMS신청손실허용율구분코드", align="left", fill="")
	private String fndSmsRqLossAwrtDscd= "";
	
	
	/**
	 * 펀드정기수익율SMS문자신청구분코드
	 */
	@ApiModelProperty(
		name = "fndFpPrftRtSmsChrRqDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("fndFpPrftRtSmsChrRqDscd")
	@BxmOmm_Field(length=1, decimal=0, description="펀드정기수익율SMS문자신청구분코드", align="left", fill="")
	private String fndFpPrftRtSmsChrRqDscd= "";
	
	
	/**
	 * 펀드정기수익율SMS문자신청일자구분코드
	 */
	@ApiModelProperty(
		name = "fndFpPrftRtSmsChrRqDtDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("fndFpPrftRtSmsChrRqDtDscd")
	@BxmOmm_Field(length=2, decimal=0, description="펀드정기수익율SMS문자신청일자구분코드", align="left", fill="")
	private String fndFpPrftRtSmsChrRqDtDscd= "";
	
	
	/**
	 * 매수신청서인자생략여부
	 */
	@ApiModelProperty(
		name = "scntRqdcPrngOmitYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("scntRqdcPrngOmitYn")
	@BxmOmm_Field(length=1, decimal=0, description="매수신청서인자생략여부", align="left", fill="")
	private String scntRqdcPrngOmitYn= "";
	
	
	/**
	 * 구속성점검명세일련번호
	 */
	@ApiModelProperty(
		name = "oldAtrbChckHisSrno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("oldAtrbChckHisSrno")
	@BxmOmm_Field(length=15, decimal=0, description="구속성점검명세일련번호", align="left", fill="")
	private String oldAtrbChckHisSrno= "";
	
	
	/**
	 * 신규보스트로관리번호
	 */
	@ApiModelProperty(
		name = "newVstrMngNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("newVstrMngNo")
	@BxmOmm_Field(length=10, decimal=0, description="신규보스트로관리번호", align="left", fill="")
	private String newVstrMngNo= "";
	
	
	/**
	 * 지급보스트로관리번호
	 */
	@ApiModelProperty(
		name = "payVstrMngNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("payVstrMngNo")
	@BxmOmm_Field(length=10, decimal=0, description="지급보스트로관리번호", align="left", fill="")
	private String payVstrMngNo= "";
	
	
	/**
	 * 현물이전퇴직연금상품번호
	 */
	@ApiModelProperty(
		name = "spotTfrRtpenPrdNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("spotTfrRtpenPrdNo")
	@BxmOmm_Field(length=12, decimal=0, description="현물이전퇴직연금상품번호", align="left", fill="")
	private String spotTfrRtpenPrdNo= "";
	
	
	/**
	 * 퇴직신탁기관코드
	 */
	@ApiModelProperty(
		name = "rtttIscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rtttIscd")
	@BxmOmm_Field(length=4, decimal=0, description="퇴직신탁기관코드", align="left", fill="")
	private String rtttIscd= "";
	
	
	/**
	 * 현물이전퇴직연금플랜구분코드
	 */
	@ApiModelProperty(
		name = "spotTfrRtpenPlanDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("spotTfrRtpenPlanDscd")
	@BxmOmm_Field(length=1, decimal=0, description="현물이전퇴직연금플랜구분코드", align="left", fill="")
	private String spotTfrRtpenPlanDscd= "";
	
	
	/**
	 * 이자입금외화계좌번호
	 */
	@ApiModelProperty(
		name = "intRcvFcAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("intRcvFcAcno")
	@BxmOmm_Field(length=15, decimal=0, description="이자입금외화계좌번호", align="left", fill="")
	private String intRcvFcAcno= "";
	
	
	/**
	 * 통장증서인자여부
	 */
	@ApiModelProperty(
		name = "pbdeedPrngYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("pbdeedPrngYn")
	@BxmOmm_Field(length=1, decimal=0, description="통장증서인자여부", align="left", fill="")
	private String pbdeedPrngYn= "";
	
	
	/**
	 * 지정환율정수
	 */
	@ApiModelProperty(
		name = "dgnXrtPsnb"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("dgnXrtPsnb")
	@BxmOmm_Field(length=6, decimal=0, description="지정환율정수", align="right", fill="0")
	private Integer dgnXrtPsnb= 0;
	
	
	/**
	 * 지정환율소수
	 */
	@ApiModelProperty(
		name = "dgnXrtDcml"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dgnXrtDcml")
	@BxmOmm_Field(length=2, decimal=0, description="지정환율소수", align="left", fill="")
	private String dgnXrtDcml= "";
	
	
	/**
	 * 메이크샵회원여부
	 */
	@ApiModelProperty(
		name = "mkshMbhYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("mkshMbhYn")
	@BxmOmm_Field(length=1, decimal=0, description="메이크샵회원여부", align="left", fill="")
	private String mkshMbhYn= "";
	
	
	/**
	 * 보조금통장구분코드
	 */
	@ApiModelProperty(
		name = "asstmPbokDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("asstmPbokDscd")
	@BxmOmm_Field(length=1, decimal=0, description="보조금통장구분코드", align="left", fill="")
	private String asstmPbokDscd= "";
	
	
	/**
	 * 위비톡가입핸드폰번호
	 */
	@ApiModelProperty(
		name = "wbbtJnngHpNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("wbbtJnngHpNo")
	@BxmOmm_Field(length=14, decimal=0, description="위비톡가입핸드폰번호", align="left", fill="")
	private String wbbtJnngHpNo= "";
	
	
	/**
	 * 상품운용구분코드
	 */
	@ApiModelProperty(
		name = "prdOpgDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("prdOpgDscd")
	@BxmOmm_Field(length=2, decimal=0, description="상품운용구분코드", align="left", fill="")
	private String prdOpgDscd= "";
	
	
	/**
	 * 신규조회여부
	 */
	@ApiModelProperty(
		name = "newInqYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("newInqYn")
	@BxmOmm_Field(length=1, decimal=0, description="신규조회여부", align="left", fill="")
	private String newInqYn= "";
	
	
	/**
	 * 비밀번호미사용여부
	 */
	@ApiModelProperty(
		name = "pwnoNuseYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("pwnoNuseYn")
	@BxmOmm_Field(length=1, decimal=0, description="비밀번호미사용여부", align="left", fill="")
	private String pwnoNuseYn= "";
	
	
	/**
	 * 바우처조회시간
	 */
	@ApiModelProperty(
		name = "bchrInqTim"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("bchrInqTim")
	@BxmOmm_Field(length=4, decimal=0, description="바우처조회시간", align="left", fill="")
	private String bchrInqTim= "";
	
	
	/**
	 * 바우처신규가능여부
	 */
	@ApiModelProperty(
		name = "bchrNewAvlYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("bchrNewAvlYn")
	@BxmOmm_Field(length=1, decimal=0, description="바우처신규가능여부", align="left", fill="")
	private String bchrNewAvlYn= "";
	
	
	/**
	 * 상품주요내용통장인자여부
	 */
	@ApiModelProperty(
		name = "prdMajTxtPbokPrngYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("prdMajTxtPbokPrngYn")
	@BxmOmm_Field(length=1, decimal=0, description="상품주요내용통장인자여부", align="left", fill="")
	private String prdMajTxtPbokPrngYn= "";
	
	
	/**
	 * 적용이율정수
	 */
	@ApiModelProperty(
		name = "apirtPsnb"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("apirtPsnb")
	@BxmOmm_Field(length=6, decimal=0, description="적용이율정수", align="right", fill="0")
	private Integer apirtPsnb= 0;
	
	
	/**
	 * 적용이율소수
	 */
	@ApiModelProperty(
		name = "apirtDcml"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("apirtDcml")
	@BxmOmm_Field(length=5, decimal=0, description="적용이율소수", align="left", fill="")
	private String apirtDcml= "";
	
	
	/**
	 * 본부승인번호
	 */
	@ApiModelProperty(
		name = "hqapNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("hqapNo")
	@BxmOmm_Field(length=8, decimal=0, description="본부승인번호", align="left", fill="")
	private String hqapNo= "";
	
	
	/**
	 * 실명고객번호
	 */
	@ApiModelProperty(
		name = "acnmCsno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("acnmCsno")
	@BxmOmm_Field(length=9, decimal=0, description="실명고객번호", align="left", fill="")
	private String acnmCsno= "";
	
	
	/**
	 * 액면신규여부
	 */
	@ApiModelProperty(
		name = "fcbdNewYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("fcbdNewYn")
	@BxmOmm_Field(length=1, decimal=0, description="액면신규여부", align="left", fill="")
	private String fcbdNewYn= "";
	
	
	/**
	 * 금리종류코드
	 */
	@ApiModelProperty(
		name = "irKdcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("irKdcd")
	@BxmOmm_Field(length=2, decimal=0, description="금리종류코드", align="left", fill="")
	private String irKdcd= "";
	
	
	/**
	 * 실효수익율정수
	 */
	@ApiModelProperty(
		name = "efctPrftRtPsnb"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("efctPrftRtPsnb")
	@BxmOmm_Field(length=2, decimal=0, description="실효수익율정수", align="right", fill="0")
	private Integer efctPrftRtPsnb= 0;
	
	
	/**
	 * 실효수익율소수
	 */
	@ApiModelProperty(
		name = "efctPrftRtDcml"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("efctPrftRtDcml")
	@BxmOmm_Field(length=5, decimal=0, description="실효수익율소수", align="left", fill="")
	private String efctPrftRtDcml= "";
	
	
	/**
	 * 표지어음신규구분코드
	 */
	@ApiModelProperty(
		name = "vrBilNewDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("vrBilNewDscd")
	@BxmOmm_Field(length=1, decimal=0, description="표지어음신규구분코드", align="left", fill="")
	private String vrBilNewDscd= "";
	
	
	/**
	 * 기관투자자일괄신규거래구분코드
	 */
	@ApiModelProperty(
		name = "istIvpeBatNewTrnDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("istIvpeBatNewTrnDscd")
	@BxmOmm_Field(length=1, decimal=0, description="기관투자자일괄신규거래구분코드", align="left", fill="")
	private String istIvpeBatNewTrnDscd= "";
	
	
	/**
	 * 예탁자고객번호
	 */
	@ApiModelProperty(
		name = "dppeCsno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dppeCsno")
	@BxmOmm_Field(length=6, decimal=0, description="예탁자고객번호", align="left", fill="")
	private String dppeCsno= "";
	
	
	/**
	 * 예탁자계좌식별번호
	 */
	@ApiModelProperty(
		name = "dppeActIdfNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dppeActIdfNo")
	@BxmOmm_Field(length=4, decimal=0, description="예탁자계좌식별번호", align="left", fill="")
	private String dppeActIdfNo= "";
	
	
	/**
	 * 수신일괄신규업무코드
	 */
	@ApiModelProperty(
		name = "dpsBatNewBzcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dpsBatNewBzcd")
	@BxmOmm_Field(length=2, decimal=0, description="수신일괄신규업무코드", align="left", fill="")
	private String dpsBatNewBzcd= "";
	
	
	/**
	 * 단체신규대표계좌번호
	 */
	@ApiModelProperty(
		name = "ascnNewRprsAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ascnNewRprsAcno")
	@BxmOmm_Field(length=13, decimal=0, description="단체신규대표계좌번호", align="left", fill="")
	private String ascnNewRprsAcno= "";
	
	
	/**
	 * 단체신규대표계좌여부
	 */
	@ApiModelProperty(
		name = "ascnNewRprsActYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ascnNewRprsActYn")
	@BxmOmm_Field(length=1, decimal=0, description="단체신규대표계좌여부", align="left", fill="")
	private String ascnNewRprsActYn= "";
	
	
	/**
	 * 공금예금계좌회계년도
	 */
	@ApiModelProperty(
		name = "pbamActAcctYy"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("pbamActAcctYy")
	@BxmOmm_Field(length=4, decimal=0, description="공금예금계좌회계년도", align="left", fill="")
	private String pbamActAcctYy= "";
	
	
	/**
	 * 공금단수계좌회계년도
	 */
	@ApiModelProperty(
		name = "pmnySnnmActAcctYy"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("pmnySnnmActAcctYy")
	@BxmOmm_Field(length=4, decimal=0, description="공금단수계좌회계년도", align="left", fill="")
	private String pmnySnnmActAcctYy= "";
	
	
	/**
	 * 주택청약자택주소종류코드
	 */
	@ApiModelProperty(
		name = "hsscOwhmAdrKdcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("hsscOwhmAdrKdcd")
	@BxmOmm_Field(length=1, decimal=0, description="주택청약자택주소종류코드", align="left", fill="")
	private String hsscOwhmAdrKdcd= "";
	
	
	/**
	 * 주택청약자택건물관리번호
	 */
	@ApiModelProperty(
		name = "hsscOwhmBldMngNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("hsscOwhmBldMngNo")
	@BxmOmm_Field(length=25, decimal=0, description="주택청약자택건물관리번호", align="left", fill="")
	private String hsscOwhmBldMngNo= "";
	
	
	/**
	 * 주택청약자택우편일련번호
	 */
	@ApiModelProperty(
		name = "hsscOwhmPostSrno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("hsscOwhmPostSrno")
	@BxmOmm_Field(length=3, decimal=0, description="주택청약자택우편일련번호", align="left", fill="")
	private String hsscOwhmPostSrno= "";
	
	
	/**
	 * 주택청약자택법정동번호
	 */
	@ApiModelProperty(
		name = "hsscOwhmStdoNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("hsscOwhmStdoNo")
	@BxmOmm_Field(length=10, decimal=0, description="주택청약자택법정동번호", align="left", fill="")
	private String hsscOwhmStdoNo= "";
	
	
	/**
	 * 협약업체코드
	 */
	@ApiModelProperty(
		name = "agmtCoCd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("agmtCoCd")
	@BxmOmm_Field(length=3, decimal=0, description="협약업체코드", align="left", fill="")
	private String agmtCoCd= "";
	
	
	/**
	 * 우리희망드림가입대상구분코드
	 */
	@ApiModelProperty(
		name = "wooriHopeDremJnngTgtDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("wooriHopeDremJnngTgtDscd")
	@BxmOmm_Field(length=2, decimal=0, description="우리희망드림가입대상구분코드", align="left", fill="")
	private String wooriHopeDremJnngTgtDscd= "";
	
	
	/**
	 * 자산관리기관코드
	 */
	@ApiModelProperty(
		name = "asetMngIscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("asetMngIscd")
	@BxmOmm_Field(length=4, decimal=0, description="자산관리기관코드", align="left", fill="")
	private String asetMngIscd= "";
	
	
	/**
	 * 환매채구분코드
	 */
	@ApiModelProperty(
		name = "rpbdDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rpbdDscd")
	@BxmOmm_Field(length=1, decimal=0, description="환매채구분코드", align="left", fill="")
	private String rpbdDscd= "";
	
	
	/**
	 * 연결계좌번호
	 */
	@ApiModelProperty(
		name = "cctnAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("cctnAcno")
	@BxmOmm_Field(length=15, decimal=0, description="연결계좌번호", align="left", fill="")
	private String cctnAcno= "";
	
	
	/**
	 * 국공채청약신청여부
	 */
	@ApiModelProperty(
		name = "npbdSbsrRqYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("npbdSbsrRqYn")
	@BxmOmm_Field(length=1, decimal=0, description="국공채청약신청여부", align="left", fill="")
	private String npbdSbsrRqYn= "";
	
	
	/**
	 * 국공채종목코드
	 */
	@ApiModelProperty(
		name = "npbdItmsCd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("npbdItmsCd")
	@BxmOmm_Field(length=9, decimal=0, description="국공채종목코드", align="left", fill="")
	private String npbdItmsCd= "";
	
	
	/**
	 * 채권종류구분
	 */
	@ApiModelProperty(
		name = "bndKdDis"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("bndKdDis")
	@BxmOmm_Field(length=2, decimal=0, description="채권종류구분", align="left", fill="")
	private String bndKdDis= "";
	
	
	/**
	 * 회월호
	 */
	@ApiModelProperty(
		name = "tunMmHo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("tunMmHo")
	@BxmOmm_Field(length=6, decimal=0, description="회월호", align="left", fill="")
	private String tunMmHo= "";
	
	
	/**
	 * 헷지대상여부
	 */
	@ApiModelProperty(
		name = "hdgTgtYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("hdgTgtYn")
	@BxmOmm_Field(length=1, decimal=0, description="헷지대상여부", align="left", fill="")
	private String hdgTgtYn= "";
	
	
	/**
	 * ID카드청약종합저축구분코드
	 */
	@ApiModelProperty(
		name = "idCadNhssDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("idCadNhssDscd")
	@BxmOmm_Field(length=1, decimal=0, description="ID카드청약종합저축구분코드", align="left", fill="")
	private String idCadNhssDscd= "";
	
	
	/**
	 * 펀드플러스운용구분코드
	 */
	@ApiModelProperty(
		name = "fndPlsOpgDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("fndPlsOpgDscd")
	@BxmOmm_Field(length=1, decimal=0, description="펀드플러스운용구분코드", align="left", fill="")
	private String fndPlsOpgDscd= "";
	
	
	/**
	 * 보증보험키
	 */
	@ApiModelProperty(
		name = "grnInsuKey"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("grnInsuKey")
	@BxmOmm_Field(length=16, decimal=0, description="보증보험키", align="left", fill="")
	private String grnInsuKey= "";
	
	
	/**
	 * 선이자입금구분코드
	 */
	@ApiModelProperty(
		name = "preIntRcvDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("preIntRcvDscd")
	@BxmOmm_Field(length=1, decimal=0, description="선이자입금구분코드", align="left", fill="")
	private String preIntRcvDscd= "";
	
	
	/**
	 * 선이자입금계좌번호
	 */
	@ApiModelProperty(
		name = "preIntRcvAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("preIntRcvAcno")
	@BxmOmm_Field(length=15, decimal=0, description="선이자입금계좌번호", align="left", fill="")
	private String preIntRcvAcno= "";
	
	
	/**
	 * 수신추천번호
	 */
	@ApiModelProperty(
		name = "dpsRcmNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dpsRcmNo")
	@BxmOmm_Field(length=6, decimal=0, description="수신추천번호", align="left", fill="")
	private String dpsRcmNo= "";
	
	
	/**
	 * 군인기수
	 */
	@ApiModelProperty(
		name = "sldrAldCn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("sldrAldCn")
	@BxmOmm_Field(length=3, decimal=0, description="군인기수", align="left", fill="")
	private String sldrAldCn= "";
	
	
	/**
	 * 체불통장일반등록여부
	 */
	@ApiModelProperty(
		name = "dlpmPbokGenRgsYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dlpmPbokGenRgsYn")
	@BxmOmm_Field(length=1, decimal=0, description="체불통장일반등록여부", align="left", fill="")
	private String dlpmPbokGenRgsYn= "";
	
	
	/**
	 * 스마트기기모델정보
	 */
	@ApiModelProperty(
		name = "smrtMchrMdlInf"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("smrtMchrMdlInf")
	@BxmOmm_Field(length=60, decimal=0, description="스마트기기모델정보", align="left", fill="")
	private String smrtMchrMdlInf= "";
	
	
	/**
	 * 위비입금등록여부
	 */
	@ApiModelProperty(
		name = "wibeeRcvRgsYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("wibeeRcvRgsYn")
	@BxmOmm_Field(length=1, decimal=0, description="위비입금등록여부", align="left", fill="")
	private String wibeeRcvRgsYn= "";
	
	
	/**
	 * 위비이체계좌번호
	 */
	@ApiModelProperty(
		name = "wibeeTsAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("wibeeTsAcno")
	@BxmOmm_Field(length=15, decimal=0, description="위비이체계좌번호", align="left", fill="")
	private String wibeeTsAcno= "";
	
	
	/**
	 * 위비PUSH등록여부
	 */
	@ApiModelProperty(
		name = "wibeePushRgsYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("wibeePushRgsYn")
	@BxmOmm_Field(length=1, decimal=0, description="위비PUSH등록여부", align="left", fill="")
	private String wibeePushRgsYn= "";
	
	
	/**
	 * 자동이체원화이체계좌번호
	 */
	@ApiModelProperty(
		name = "atsKrwTsAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atsKrwTsAcno")
	@BxmOmm_Field(length=13, decimal=0, description="자동이체원화이체계좌번호", align="left", fill="")
	private String atsKrwTsAcno= "";
	
	
	/**
	 * 금리네고점코드
	 */
	@ApiModelProperty(
		name = "irngBrcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("irngBrcd")
	@BxmOmm_Field(length=6, decimal=0, description="금리네고점코드", align="left", fill="")
	private String irngBrcd= "";
	
	
	/**
	 * 원화펌뱅킹정기예금여부
	 */
	@ApiModelProperty(
		name = "krwFmbkFxpdYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("krwFmbkFxpdYn")
	@BxmOmm_Field(length=1, decimal=0, description="원화펌뱅킹정기예금여부", align="left", fill="")
	private String krwFmbkFxpdYn= "";
	
	
	/**
	 * 원화삼성펌뱅킹정기예금여부
	 */
	@ApiModelProperty(
		name = "krwSscoFmbkFxpdYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("krwSscoFmbkFxpdYn")
	@BxmOmm_Field(length=1, decimal=0, description="원화삼성펌뱅킹정기예금여부", align="left", fill="")
	private String krwSscoFmbkFxpdYn= "";
	
	
	/**
	 * 희망주택전용면적구분코드
	 */
	@ApiModelProperty(
		name = "hopeHousXuseSqmDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("hopeHousXuseSqmDscd")
	@BxmOmm_Field(length=1, decimal=0, description="희망주택전용면적구분코드", align="left", fill="")
	private String hopeHousXuseSqmDscd= "";
	
	
	/**
	 * 주민등록전입일자
	 */
	@ApiModelProperty(
		name = "rrrgMvinDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rrrgMvinDt")
	@BxmOmm_Field(length=8, decimal=0, description="주민등록전입일자", align="left", fill="")
	private String rrrgMvinDt= "";
	
	
	/**
	 * 예탁자고유번호
	 */
	@ApiModelProperty(
		name = "dppeUnqNo"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("dppeUnqNo")
	@BxmOmm_Field(length=8, decimal=0, description="예탁자고유번호", align="right", fill="0")
	private Integer dppeUnqNo= 0;
	
	
	/**
	 * 예탁자종목번호
	 */
	@ApiModelProperty(
		name = "dppeItmsNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dppeItmsNo")
	@BxmOmm_Field(length=12, decimal=0, description="예탁자종목번호", align="left", fill="")
	private String dppeItmsNo= "";
	
	
	/**
	 * 캐쉬백자동이체계좌번호
	 */
	@ApiModelProperty(
		name = "cshbAtsAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("cshbAtsAcno")
	@BxmOmm_Field(length=15, decimal=0, description="캐쉬백자동이체계좌번호", align="left", fill="")
	private String cshbAtsAcno= "";
	
	
	/**
	 * 고객기부단체코드
	 */
	@ApiModelProperty(
		name = "cusDntnAscnCd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("cusDntnAscnCd")
	@BxmOmm_Field(length=3, decimal=0, description="고객기부단체코드", align="left", fill="")
	private String cusDntnAscnCd= "";
	
	
	/**
	 * 고객부담출연율
	 */
	@ApiModelProperty(
		name = "cusBrdnCnrnRt"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("cusBrdnCnrnRt")
	@BxmOmm_Field(length=8, decimal=4, description="고객부담출연율", align="right", fill="0")
	private BigDecimal cusBrdnCnrnRt= new BigDecimal("0");
	
	
	/**
	 * 꿈적금목표금액
	 */
	@ApiModelProperty(
		name = "dinsvGoalAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("dinsvGoalAm")
	@BxmOmm_Field(length=19, decimal=3, description="꿈적금목표금액", align="right", fill="0")
	private BigDecimal dinsvGoalAm= new BigDecimal("0");
	
	
	/**
	 * 세금우대조회여부
	 */
	@ApiModelProperty(
		name = "txprInqYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("txprInqYn")
	@BxmOmm_Field(length=1, decimal=0, description="세금우대조회여부", align="left", fill="")
	private String txprInqYn= "";
	
	
	/**
	 * 외국인등록번호
	 */
	@ApiModelProperty(
		name = "frno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("frno")
	@BxmOmm_Field(length=13, decimal=0, description="외국인등록번호", align="left", fill="", etcProperties={"PROP_OPTION_DSCD=L999"})
	private String frno= "";
	
	
	/**
	 * 실명등록코드
	 */
	@ApiModelProperty(
		name = "acnmRgsCd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("acnmRgsCd")
	@BxmOmm_Field(length=1, decimal=0, description="실명등록코드", align="left", fill="")
	private String acnmRgsCd= "";
	
	
	/**
	 * 공인인증서생략여부
	 */
	@ApiModelProperty(
		name = "coaOmitYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("coaOmitYn")
	@BxmOmm_Field(length=1, decimal=0, description="공인인증서생략여부", align="left", fill="")
	private String coaOmitYn= "";
	
	
	/**
	 * 위비마켓연동신규여부
	 */
	@ApiModelProperty(
		name = "wbbmLnkNewYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("wbbmLnkNewYn")
	@BxmOmm_Field(length=1, decimal=0, description="위비마켓연동신규여부", align="left", fill="")
	private String wbbmLnkNewYn= "";
	
	
	/**
	 * 위비톡추천등록핸드폰번호
	 */
	@ApiModelProperty(
		name = "wbbtRcmRgsHpNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("wbbtRcmRgsHpNo")
	@BxmOmm_Field(length=11, decimal=0, description="위비톡추천등록핸드폰번호", align="left", fill="")
	private String wbbtRcmRgsHpNo= "";
	
	
	/**
	 * 스마트론가입여부
	 */
	@ApiModelProperty(
		name = "smrtLnJnngYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("smrtLnJnngYn")
	@BxmOmm_Field(length=1, decimal=0, description="스마트론가입여부", align="left", fill="")
	private String smrtLnJnngYn= "";
	
	
	/**
	 * 꿈적금구분코드
	 */
	@ApiModelProperty(
		name = "dinsvDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dinsvDscd")
	@BxmOmm_Field(length=2, decimal=0, description="꿈적금구분코드", align="left", fill="")
	private String dinsvDscd= "";
	
	
	/**
	 * 옥션ID
	 */
	@ApiModelProperty(
		name = "aucId"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("aucId")
	@BxmOmm_Field(length=20, decimal=0, description="옥션ID", align="left", fill="")
	private String aucId= "";
	
	
	/**
	 * 지마켓ID
	 */
	@ApiModelProperty(
		name = "gmktId"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("gmktId")
	@BxmOmm_Field(length=20, decimal=0, description="지마켓ID", align="left", fill="")
	private String gmktId= "";
	
	
	/**
	 * 위비마켓ID
	 */
	@ApiModelProperty(
		name = "wbbmId"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("wbbmId")
	@BxmOmm_Field(length=50, decimal=0, description="위비마켓ID", align="left", fill="")
	private String wbbmId= "";
	
	
	/**
	 * 비대면실명확인신규구분코드
	 */
	@ApiModelProperty(
		name = "dniAcnmCnfNewDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dniAcnmCnfNewDscd")
	@BxmOmm_Field(length=1, decimal=0, description="비대면실명확인신규구분코드", align="left", fill="")
	private String dniAcnmCnfNewDscd= "";
	
	
	/**
	 * 비대면입금금액
	 */
	@ApiModelProperty(
		name = "dniRcvAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("dniRcvAm")
	@BxmOmm_Field(length=16, decimal=3, description="비대면입금금액", align="right", fill="0")
	private BigDecimal dniRcvAm= new BigDecimal("0");
	
	
	/**
	 * 비대면핸드폰번호
	 */
	@ApiModelProperty(
		name = "dniHpNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dniHpNo")
	@BxmOmm_Field(length=12, decimal=0, description="비대면핸드폰번호", align="left", fill="")
	private String dniHpNo= "";
	
	
	/**
	 * 비대면상대계좌번호
	 */
	@ApiModelProperty(
		name = "dniPtnAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dniPtnAcno")
	@BxmOmm_Field(length=15, decimal=0, description="비대면상대계좌번호", align="left", fill="")
	private String dniPtnAcno= "";
	
	
	/**
	 * 비대면상대신계좌번호
	 */
	@ApiModelProperty(
		name = "dniPtnNewAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dniPtnNewAcno")
	@BxmOmm_Field(length=15, decimal=0, description="비대면상대신계좌번호", align="left", fill="")
	private String dniPtnNewAcno= "";
	
	
	/**
	 * 비대면상대은행코드
	 */
	@ApiModelProperty(
		name = "dniPtnbkCd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dniPtnbkCd")
	@BxmOmm_Field(length=3, decimal=0, description="비대면상대은행코드", align="left", fill="")
	private String dniPtnbkCd= "";
	
	
	/**
	 * 재가입계좌번호
	 */
	@ApiModelProperty(
		name = "rjnngAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rjnngAcno")
	@BxmOmm_Field(length=15, decimal=0, description="재가입계좌번호", align="left", fill="")
	private String rjnngAcno= "";
	
	
	/**
	 * 적금적립플랜종류코드
	 */
	@ApiModelProperty(
		name = "insvAcldPlanKdcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("insvAcldPlanKdcd")
	@BxmOmm_Field(length=1, decimal=0, description="적금적립플랜종류코드", align="left", fill="")
	private String insvAcldPlanKdcd= "";
	
	
	/**
	 * 적금적립최초이체금액
	 */
	@ApiModelProperty(
		name = "insvAcldFstTsAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("insvAcldFstTsAm")
	@BxmOmm_Field(length=16, decimal=3, description="적금적립최초이체금액", align="right", fill="0")
	private BigDecimal insvAcldFstTsAm= new BigDecimal("0");
	
	
	/**
	 * 적금적립이체시작요일구분코드
	 */
	@ApiModelProperty(
		name = "insvAcldTsStaWkdDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("insvAcldTsStaWkdDscd")
	@BxmOmm_Field(length=1, decimal=0, description="적금적립이체시작요일구분코드", align="left", fill="")
	private String insvAcldTsStaWkdDscd= "";
	
	
	/**
	 * 적금적립이체시작일자
	 */
	@ApiModelProperty(
		name = "insvAcldTsStaDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("insvAcldTsStaDt")
	@BxmOmm_Field(length=8, decimal=0, description="적금적립이체시작일자", align="left", fill="")
	private String insvAcldTsStaDt= "";
	
	
	/**
	 * 적금적립플랜선택여부
	 */
	@ApiModelProperty(
		name = "insvAcldPlanChcYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("insvAcldPlanChcYn")
	@BxmOmm_Field(length=1, decimal=0, description="적금적립플랜선택여부", align="left", fill="")
	private String insvAcldPlanChcYn= "";
	
	
	/**
	 * 적금적립플랜생활금액
	 */
	@ApiModelProperty(
		name = "insvAcldPlanLifeAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("insvAcldPlanLifeAm")
	@BxmOmm_Field(length=16, decimal=3, description="적금적립플랜생활금액", align="right", fill="0")
	private BigDecimal insvAcldPlanLifeAm= new BigDecimal("0");
	
	
	/**
	 * 납입방법코드
	 */
	@ApiModelProperty(
		name = "pidMecd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("pidMecd")
	@BxmOmm_Field(length=2, decimal=0, description="납입방법코드", align="left", fill="")
	private String pidMecd= "";
	
	
	/**
	 * 판매사이동세부식별코드
	 */
	@ApiModelProperty(
		name = "selcMvbDtlsIdfCd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("selcMvbDtlsIdfCd")
	@BxmOmm_Field(length=20, decimal=0, description="판매사이동세부식별코드", align="left", fill="")
	private String selcMvbDtlsIdfCd= "";
	
	
	/**
	 * 상대전행계좌번호
	 */
	@ApiModelProperty(
		name = "ptnBkwAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ptnBkwAcno")
	@BxmOmm_Field(length=20, decimal=0, description="상대전행계좌번호", align="left", fill="")
	private String ptnBkwAcno= "";
	
	
	/**
	 * 상대판매사기관코드
	 */
	@ApiModelProperty(
		name = "ptnSelcIscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ptnSelcIscd")
	@BxmOmm_Field(length=10, decimal=0, description="상대판매사기관코드", align="left", fill="")
	private String ptnSelcIscd= "";
	
	
	/**
	 * 펀드판매사이동확인서발급일자
	 */
	@ApiModelProperty(
		name = "fndslcMvbCfdocIsuDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("fndslcMvbCfdocIsuDt")
	@BxmOmm_Field(length=8, decimal=0, description="펀드판매사이동확인서발급일자", align="left", fill="")
	private String fndslcMvbCfdocIsuDt= "";
	
	
	/**
	 * 세금유형코드
	 */
	@ApiModelProperty(
		name = "taxTycd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("taxTycd")
	@BxmOmm_Field(length=2, decimal=0, description="세금유형코드", align="left", fill="")
	private String taxTycd= "";
	
	
	/**
	 * 환매후즉시신규여부
	 */
	@ApiModelProperty(
		name = "rprhAfImnwYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rprhAfImnwYn")
	@BxmOmm_Field(length=1, decimal=0, description="환매후즉시신규여부", align="left", fill="")
	private String rprhAfImnwYn= "";
	
	
	/**
	 * ELF자가진단여부
	 */
	@ApiModelProperty(
		name = "elfSelfDgnsYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("elfSelfDgnsYn")
	@BxmOmm_Field(length=1, decimal=0, description="ELF자가진단여부", align="left", fill="")
	private String elfSelfDgnsYn= "";
	
	
	/**
	 * WMS포트폴리오구분
	 */
	@ApiModelProperty(
		name = "wmsPrtfDis"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("wmsPrtfDis")
	@BxmOmm_Field(length=2, decimal=0, description="WMS포트폴리오구분", align="left", fill="")
	private String wmsPrtfDis= "";
	
	
	/**
	 * 상대기관확인여부
	 */
	@ApiModelProperty(
		name = "ptnIstCnfYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ptnIstCnfYn")
	@BxmOmm_Field(length=1, decimal=0, description="상대기관확인여부", align="left", fill="")
	private String ptnIstCnfYn= "";
	
	
	/**
	 * 투자설계일련번호
	 */
	@ApiModelProperty(
		name = "ivsdesSrno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ivsdesSrno")
	@BxmOmm_Field(length=30, decimal=0, description="투자설계일련번호", align="left", fill="")
	private String ivsdesSrno= "";
	
	
	/**
	 * 펀드잔존좌수
	 */
	@ApiModelProperty(
		name = "fndSvvlAcuCn"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("fndSvvlAcuCn")
	@BxmOmm_Field(length=18, decimal=0, description="펀드잔존좌수", align="right", fill="0")
	private BigDecimal fndSvvlAcuCn= new BigDecimal("0");
	
	
	/**
	 * 고객포트폴리오등록번호
	 */
	@ApiModelProperty(
		name = "cusPrtfRgsNo"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("cusPrtfRgsNo")
	@BxmOmm_Field(length=16, decimal=0, description="고객포트폴리오등록번호", align="right", fill="0")
	private BigDecimal cusPrtfRgsNo= new BigDecimal("0");
	
	
	/**
	 * 접수일시
	 */
	@ApiModelProperty(
		name = "rcpDtm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rcpDtm")
	@BxmOmm_Field(length=14, decimal=0, description="접수일시", align="left", fill="")
	private String rcpDtm= "";
	
	
	/**
	 * 연금펀드계좌번호
	 */
	@ApiModelProperty(
		name = "pnsfndAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("pnsfndAcno")
	@BxmOmm_Field(length=13, decimal=0, description="연금펀드계좌번호", align="left", fill="")
	private String pnsfndAcno= "";
	
	
	/**
	 * MMF펀드계좌번호
	 */
	@ApiModelProperty(
		name = "mmfFndAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("mmfFndAcno")
	@BxmOmm_Field(length=15, decimal=0, description="MMF펀드계좌번호", align="left", fill="")
	private String mmfFndAcno= "";
	
	
	/**
	 * 연금펀드신규여부
	 */
	@ApiModelProperty(
		name = "pnsfndNewYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("pnsfndNewYn")
	@BxmOmm_Field(length=1, decimal=0, description="연금펀드신규여부", align="left", fill="")
	private String pnsfndNewYn= "";
	
	
	/**
	 * 첫번째신규계좌번호
	 */
	@ApiModelProperty(
		name = "frstNwactNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("frstNwactNo")
	@BxmOmm_Field(length=13, decimal=0, description="첫번째신규계좌번호", align="left", fill="")
	private String frstNwactNo= "";
	
	
	/**
	 * 두번째신규계좌번호
	 */
	@ApiModelProperty(
		name = "scndNwactNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("scndNwactNo")
	@BxmOmm_Field(length=13, decimal=0, description="두번째신규계좌번호", align="left", fill="")
	private String scndNwactNo= "";
	
	
	/**
	 * 펀드개설일자
	 */
	@ApiModelProperty(
		name = "fndOpngDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("fndOpngDt")
	@BxmOmm_Field(length=8, decimal=0, description="펀드개설일자", align="left", fill="")
	private String fndOpngDt= "";
	
	
	/**
	 * 원화삼성신규전문번호
	 */
	@ApiModelProperty(
		name = "krwSscoNewTlmNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("krwSscoNewTlmNo")
	@BxmOmm_Field(length=6, decimal=0, description="원화삼성신규전문번호", align="left", fill="")
	private String krwSscoNewTlmNo= "";
	
	
	/**
	 * 자동이체상세구분코드
	 */
	@ApiModelProperty(
		name = "atsDtlDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atsDtlDscd")
	@BxmOmm_Field(length=2, decimal=0, description="자동이체상세구분코드", align="left", fill="")
	private String atsDtlDscd= "";
	
	
	/**
	 * 자동이체입금한도금액
	 */
	@ApiModelProperty(
		name = "atsRcvLmtAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("atsRcvLmtAm")
	@BxmOmm_Field(length=19, decimal=3, description="자동이체입금한도금액", align="right", fill="0")
	private BigDecimal atsRcvLmtAm= new BigDecimal("0");
	
	
	/**
	 * 원화펌뱅킹MMDA여부
	 */
	@ApiModelProperty(
		name = "krwFmbkMmdaYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("krwFmbkMmdaYn")
	@BxmOmm_Field(length=1, decimal=0, description="원화펌뱅킹MMDA여부", align="left", fill="")
	private String krwFmbkMmdaYn= "";
	
	
	/**
	 * 운용지시관리번호
	 */
	@ApiModelProperty(
		name = "opgOrdsMngNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("opgOrdsMngNo")
	@BxmOmm_Field(length=24, decimal=0, description="운용지시관리번호", align="left", fill="")
	private String opgOrdsMngNo= "";
	
	
	/**
	 * 특정상품모계좌번호
	 */
	@ApiModelProperty(
		name = "spcfPrdMoAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("spcfPrdMoAcno")
	@BxmOmm_Field(length=13, decimal=0, description="특정상품모계좌번호", align="left", fill="")
	private String spcfPrdMoAcno= "";
	
	
	/**
	 * 잔여세금우대한도금액
	 */
	@ApiModelProperty(
		name = "restTxprLmtAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("restTxprLmtAm")
	@BxmOmm_Field(length=19, decimal=3, description="잔여세금우대한도금액", align="right", fill="0")
	private BigDecimal restTxprLmtAm= new BigDecimal("0");
	
	
	/**
	 * 예탁자계좌번호
	 */
	@ApiModelProperty(
		name = "dppeAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dppeAcno")
	@BxmOmm_Field(length=13, decimal=0, description="예탁자계좌번호", align="left", fill="")
	private String dppeAcno= "";
	
	
	/**
	 * 공금중요증서여부
	 */
	@ApiModelProperty(
		name = "pmnyIdeedYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("pmnyIdeedYn")
	@BxmOmm_Field(length=1, decimal=0, description="공금중요증서여부", align="left", fill="")
	private String pmnyIdeedYn= "";
	
	
	/**
	 * 당일해지계좌번호
	 */
	@ApiModelProperty(
		name = "tdyCancAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("tdyCancAcno")
	@BxmOmm_Field(length=15, decimal=0, description="당일해지계좌번호", align="left", fill="")
	private String tdyCancAcno= "";
	
	
	/**
	 * 사이버증권신규여부
	 */
	@ApiModelProperty(
		name = "cbrseNewYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("cbrseNewYn")
	@BxmOmm_Field(length=1, decimal=0, description="사이버증권신규여부", align="left", fill="")
	private String cbrseNewYn= "";
	
	
	/**
	 * 펌뱅킹신규시자동이체해지여부
	 */
	@ApiModelProperty(
		name = "fmbkNewCitAtsCancYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("fmbkNewCitAtsCancYn")
	@BxmOmm_Field(length=1, decimal=0, description="펌뱅킹신규시자동이체해지여부", align="left", fill="")
	private String fmbkNewCitAtsCancYn= "";
	
	
	/**
	 * 건설공제정기예금보증5년초과여부
	 */
	@ApiModelProperty(
		name = "cnstDdctFxpdGrnYr5OverYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("cnstDdctFxpdGrnYr5OverYn")
	@BxmOmm_Field(length=1, decimal=0, description="건설공제정기예금보증5년초과여부", align="left", fill="")
	private String cnstDdctFxpdGrnYr5OverYn= "";
	
	
	/**
	 * 충당부담금코드
	 */
	@ApiModelProperty(
		name = "aprrBrdmCd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("aprrBrdmCd")
	@BxmOmm_Field(length=4, decimal=0, description="충당부담금코드", align="left", fill="")
	private String aprrBrdmCd= "";
	
	
	/**
	 * 구속성1퍼센트초과여부
	 */
	@ApiModelProperty(
		name = "cmpnOv1peYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("cmpnOv1peYn")
	@BxmOmm_Field(length=1, decimal=0, description="구속성1퍼센트초과여부", align="left", fill="")
	private String cmpnOv1peYn= "";
	
	
	/**
	 * 연금펀드핵심출력여부
	 */
	@ApiModelProperty(
		name = "pnsfndCoreOupYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("pnsfndCoreOupYn")
	@BxmOmm_Field(length=1, decimal=0, description="연금펀드핵심출력여부", align="left", fill="")
	private String pnsfndCoreOupYn= "";
	
	
	/**
	 * 퇴직연금플랜적용일자
	 */
	@ApiModelProperty(
		name = "rtpenPlanAplDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rtpenPlanAplDt")
	@BxmOmm_Field(length=8, decimal=0, description="퇴직연금플랜적용일자", align="left", fill="")
	private String rtpenPlanAplDt= "";
	
	
	/**
	 * 퇴직연금플랜통합고객번호
	 */
	@ApiModelProperty(
		name = "rtpenPlanItcsno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rtpenPlanItcsno")
	@BxmOmm_Field(length=11, decimal=0, description="퇴직연금플랜통합고객번호", align="left", fill="")
	private String rtpenPlanItcsno= "";
	
	
	/**
	 * 글로벌뱅킹가입여부
	 */
	@ApiModelProperty(
		name = "glblBnkgJnngYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("glblBnkgJnngYn")
	@BxmOmm_Field(length=1, decimal=0, description="글로벌뱅킹가입여부", align="left", fill="")
	private String glblBnkgJnngYn= "";
	
	
	/**
	 * ID카드신규구분코드
	 */
	@ApiModelProperty(
		name = "idCadNewDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("idCadNewDscd")
	@BxmOmm_Field(length=1, decimal=0, description="ID카드신규구분코드", align="left", fill="")
	private String idCadNewDscd= "";
	
	
	/**
	 * 암호화전자뱅킹비밀번호확인
	 */
	@ApiModelProperty(
		name = "encyEbnkPwnoCnf"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("encyEbnkPwnoCnf")
	@BxmOmm_Field(length=32, decimal=0, description="암호화전자뱅킹비밀번호확인", align="left", fill="")
	private String encyEbnkPwnoCnf= "";
	
	
	/**
	 * 텔레뱅킹비밀번호확인
	 */
	@ApiModelProperty(
		name = "tlbnkPwnoCnf"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("tlbnkPwnoCnf")
	@BxmOmm_Field(length=50, decimal=0, description="텔레뱅킹비밀번호확인", align="left", fill="")
	private String tlbnkPwnoCnf= "";
	
	
	/**
	 * 그리드열건수
	 */
	@ApiModelProperty(
		name = "gridRowCnt"
		, dataType = "java.math.BigInteger"
		)
	@JsonProperty("gridRowCnt")
	@BxmOmm_Field(length=5, decimal=0, description="그리드열건수", align="right", fill="0")
	private Integer gridRowCnt= 0;
	
	
	/**
	 * 그리드
	 */
	@ApiModelProperty(
		name = "grid"
		, dataType = "[Lcom.skbank.sml.ifi.mca.eims3.dto.IBSMR0004063_GRID_IDT;"
		)
	@XmlElement(name="item")
	@XmlElementWrapper()
	@JsonProperty("grid")
	@BxmOmm_Field(length=0, decimal=0, description="그리드", align="left", fill="", arrayReference="gridRowCnt")
	private List<IBSMR0004063_GRID_IDT> grid= new ArrayList<>();
	
	/**
	 * 그리드열건수_2
	 */
	@ApiModelProperty(
		name = "gridRowCnt2"
		, dataType = "java.math.BigInteger"
		)
	@JsonProperty("gridRowCnt2")
	@BxmOmm_Field(length=5, decimal=0, description="그리드열건수_2", align="right", fill="0")
	private Integer gridRowCnt2= 0;
	
	
	/**
	 * 그리드_2
	 */
	@ApiModelProperty(
		name = "grid2"
		, dataType = "[Lcom.skbank.sml.ifi.mca.eims3.dto.IBSMR0004063_GRID_2_IDT;"
		)
	@XmlElement(name="item")
	@XmlElementWrapper()
	@JsonProperty("grid2")
	@BxmOmm_Field(length=0, decimal=0, description="그리드_2", align="left", fill="", arrayReference="gridRowCnt2")
	private List<IBSMR0004063_GRID_2_IDT> grid2= new ArrayList<>();
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_sqcNmTrnCfdocCollYn= false;
	protected final boolean isSet_sqcNmTrnCfdocCollYn(){
		return this.isSet_sqcNmTrnCfdocCollYn;
	}
	private void setIsSet_sqcNmTrnCfdocCollYn(boolean value){
		this.isSet_sqcNmTrnCfdocCollYn= value;
	}
	/**
	 * 차명거래확인서징구여부
	 */
	@XmlTransient
	public String getSqcNmTrnCfdocCollYn(){
		return this.sqcNmTrnCfdocCollYn;
	}
	
	/**
	 * 차명거래확인서징구여부
	 * 
	 * @param sqcNmTrnCfdocCollYn 차명거래확인서징구여부
	 */
	public void setSqcNmTrnCfdocCollYn(String sqcNmTrnCfdocCollYn){
		this.sqcNmTrnCfdocCollYn= sqcNmTrnCfdocCollYn;
		this.setIsSet_sqcNmTrnCfdocCollYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dpsNewDscd= false;
	protected final boolean isSet_dpsNewDscd(){
		return this.isSet_dpsNewDscd;
	}
	private void setIsSet_dpsNewDscd(boolean value){
		this.isSet_dpsNewDscd= value;
	}
	/**
	 * 수신신규구분코드
	 */
	@XmlTransient
	public String getDpsNewDscd(){
		return this.dpsNewDscd;
	}
	
	/**
	 * 수신신규구분코드
	 * 
	 * @param dpsNewDscd 수신신규구분코드
	 */
	public void setDpsNewDscd(String dpsNewDscd){
		this.dpsNewDscd= dpsNewDscd;
		this.setIsSet_dpsNewDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dpsRsvNewDscd= false;
	protected final boolean isSet_dpsRsvNewDscd(){
		return this.isSet_dpsRsvNewDscd;
	}
	private void setIsSet_dpsRsvNewDscd(boolean value){
		this.isSet_dpsRsvNewDscd= value;
	}
	/**
	 * 수신예약신규구분코드
	 */
	@XmlTransient
	public String getDpsRsvNewDscd(){
		return this.dpsRsvNewDscd;
	}
	
	/**
	 * 수신예약신규구분코드
	 * 
	 * @param dpsRsvNewDscd 수신예약신규구분코드
	 */
	public void setDpsRsvNewDscd(String dpsRsvNewDscd){
		this.dpsRsvNewDscd= dpsRsvNewDscd;
		this.setIsSet_dpsRsvNewDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_encyActPwno= false;
	protected final boolean isSet_encyActPwno(){
		return this.isSet_encyActPwno;
	}
	private void setIsSet_encyActPwno(boolean value){
		this.isSet_encyActPwno= value;
	}
	/**
	 * 암호화계좌비밀번호
	 */
	@XmlTransient
	public String getEncyActPwno(){
		return this.encyActPwno;
	}
	
	/**
	 * 암호화계좌비밀번호
	 * 
	 * @param encyActPwno 암호화계좌비밀번호
	 */
	public void setEncyActPwno(String encyActPwno){
		this.encyActPwno= encyActPwno;
		this.setIsSet_encyActPwno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_sealSignUsgDscd= false;
	protected final boolean isSet_sealSignUsgDscd(){
		return this.isSet_sealSignUsgDscd;
	}
	private void setIsSet_sealSignUsgDscd(boolean value){
		this.isSet_sealSignUsgDscd= value;
	}
	/**
	 * 인감서명사용구분코드
	 */
	@XmlTransient
	public String getSealSignUsgDscd(){
		return this.sealSignUsgDscd;
	}
	
	/**
	 * 인감서명사용구분코드
	 * 
	 * @param sealSignUsgDscd 인감서명사용구분코드
	 */
	public void setSealSignUsgDscd(String sealSignUsgDscd){
		this.sealSignUsgDscd= sealSignUsgDscd;
		this.setIsSet_sealSignUsgDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pdcd= false;
	protected final boolean isSet_pdcd(){
		return this.isSet_pdcd;
	}
	private void setIsSet_pdcd(boolean value){
		this.isSet_pdcd= value;
	}
	/**
	 * 상품코드
	 */
	@XmlTransient
	public String getPdcd(){
		return this.pdcd;
	}
	
	/**
	 * 상품코드
	 * 
	 * @param pdcd 상품코드
	 */
	public void setPdcd(String pdcd){
		this.pdcd= pdcd;
		this.setIsSet_pdcd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_csno= false;
	protected final boolean isSet_csno(){
		return this.isSet_csno;
	}
	private void setIsSet_csno(boolean value){
		this.isSet_csno= value;
	}
	/**
	 * 고객번호
	 */
	@XmlTransient
	public String getCsno(){
		return this.csno;
	}
	
	/**
	 * 고객번호
	 * 
	 * @param csno 고객번호
	 */
	public void setCsno(String csno){
		this.csno= csno;
		this.setIsSet_csno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cusDgnAcno= false;
	protected final boolean isSet_cusDgnAcno(){
		return this.isSet_cusDgnAcno;
	}
	private void setIsSet_cusDgnAcno(boolean value){
		this.isSet_cusDgnAcno= value;
	}
	/**
	 * 고객지정계좌번호
	 */
	@XmlTransient
	public String getCusDgnAcno(){
		return this.cusDgnAcno;
	}
	
	/**
	 * 고객지정계좌번호
	 * 
	 * @param cusDgnAcno 고객지정계좌번호
	 */
	public void setCusDgnAcno(String cusDgnAcno){
		this.cusDgnAcno= cusDgnAcno;
		this.setIsSet_cusDgnAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_prrRgsPwnoKey= false;
	protected final boolean isSet_prrRgsPwnoKey(){
		return this.isSet_prrRgsPwnoKey;
	}
	private void setIsSet_prrRgsPwnoKey(boolean value){
		this.isSet_prrRgsPwnoKey= value;
	}
	/**
	 * 사전등록비밀번호키
	 */
	@XmlTransient
	public String getPrrRgsPwnoKey(){
		return this.prrRgsPwnoKey;
	}
	
	/**
	 * 사전등록비밀번호키
	 * 
	 * @param prrRgsPwnoKey 사전등록비밀번호키
	 */
	public void setPrrRgsPwnoKey(String prrRgsPwnoKey){
		this.prrRgsPwnoKey= prrRgsPwnoKey;
		this.setIsSet_prrRgsPwnoKey(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_smsdDscd= false;
	protected final boolean isSet_smsdDscd(){
		return this.isSet_smsdDscd;
	}
	private void setIsSet_smsdDscd(boolean value){
		this.isSet_smsdDscd= value;
	}
	/**
	 * SMS발송구분코드
	 */
	@XmlTransient
	public String getSmsdDscd(){
		return this.smsdDscd;
	}
	
	/**
	 * SMS발송구분코드
	 * 
	 * @param smsdDscd SMS발송구분코드
	 */
	public void setSmsdDscd(String smsdDscd){
		this.smsdDscd= smsdDscd;
		this.setIsSet_smsdDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_psnInfExpsCnfYn= false;
	protected final boolean isSet_psnInfExpsCnfYn(){
		return this.isSet_psnInfExpsCnfYn;
	}
	private void setIsSet_psnInfExpsCnfYn(boolean value){
		this.isSet_psnInfExpsCnfYn= value;
	}
	/**
	 * 개인정보노출확인여부
	 */
	@XmlTransient
	public String getPsnInfExpsCnfYn(){
		return this.psnInfExpsCnfYn;
	}
	
	/**
	 * 개인정보노출확인여부
	 * 
	 * @param psnInfExpsCnfYn 개인정보노출확인여부
	 */
	public void setPsnInfExpsCnfYn(String psnInfExpsCnfYn){
		this.psnInfExpsCnfYn= psnInfExpsCnfYn;
		this.setIsSet_psnInfExpsCnfYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_scanUablRncd= false;
	protected final boolean isSet_scanUablRncd(){
		return this.isSet_scanUablRncd;
	}
	private void setIsSet_scanUablRncd(boolean value){
		this.isSet_scanUablRncd= value;
	}
	/**
	 * 스캔불가사유코드
	 */
	@XmlTransient
	public String getScanUablRncd(){
		return this.scanUablRncd;
	}
	
	/**
	 * 스캔불가사유코드
	 * 
	 * @param scanUablRncd 스캔불가사유코드
	 */
	public void setScanUablRncd(String scanUablRncd){
		this.scanUablRncd= scanUablRncd;
		this.setIsSet_scanUablRncd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_psnInfAgmdMngNo= false;
	protected final boolean isSet_psnInfAgmdMngNo(){
		return this.isSet_psnInfAgmdMngNo;
	}
	private void setIsSet_psnInfAgmdMngNo(boolean value){
		this.isSet_psnInfAgmdMngNo= value;
	}
	/**
	 * 개인정보동의서관리번호
	 */
	@XmlTransient
	public String getPsnInfAgmdMngNo(){
		return this.psnInfAgmdMngNo;
	}
	
	/**
	 * 개인정보동의서관리번호
	 * 
	 * @param psnInfAgmdMngNo 개인정보동의서관리번호
	 */
	public void setPsnInfAgmdMngNo(String psnInfAgmdMngNo){
		this.psnInfAgmdMngNo= psnInfAgmdMngNo;
		this.setIsSet_psnInfAgmdMngNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_acnmCnfEno= false;
	protected final boolean isSet_acnmCnfEno(){
		return this.isSet_acnmCnfEno;
	}
	private void setIsSet_acnmCnfEno(boolean value){
		this.isSet_acnmCnfEno= value;
	}
	/**
	 * 실명확인직원번호
	 */
	@XmlTransient
	public String getAcnmCnfEno(){
		return this.acnmCnfEno;
	}
	
	/**
	 * 실명확인직원번호
	 * 
	 * @param acnmCnfEno 실명확인직원번호
	 */
	public void setAcnmCnfEno(String acnmCnfEno){
		this.acnmCnfEno= acnmCnfEno;
		this.setIsSet_acnmCnfEno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_advpeEno= false;
	protected final boolean isSet_advpeEno(){
		return this.isSet_advpeEno;
	}
	private void setIsSet_advpeEno(boolean value){
		this.isSet_advpeEno= value;
	}
	/**
	 * 권유자직원번호
	 */
	@XmlTransient
	public String getAdvpeEno(){
		return this.advpeEno;
	}
	
	/**
	 * 권유자직원번호
	 * 
	 * @param advpeEno 권유자직원번호
	 */
	public void setAdvpeEno(String advpeEno){
		this.advpeEno= advpeEno;
		this.setIsSet_advpeEno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_idcrDscd= false;
	protected final boolean isSet_idcrDscd(){
		return this.isSet_idcrDscd;
	}
	private void setIsSet_idcrDscd(boolean value){
		this.isSet_idcrDscd= value;
	}
	/**
	 * 신분증구분코드
	 */
	@XmlTransient
	public String getIdcrDscd(){
		return this.idcrDscd;
	}
	
	/**
	 * 신분증구분코드
	 * 
	 * @param idcrDscd 신분증구분코드
	 */
	public void setIdcrDscd(String idcrDscd){
		this.idcrDscd= idcrDscd;
		this.setIsSet_idcrDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_idcrFnm= false;
	protected final boolean isSet_idcrFnm(){
		return this.isSet_idcrFnm;
	}
	private void setIsSet_idcrFnm(boolean value){
		this.isSet_idcrFnm= value;
	}
	/**
	 * 신분증성명
	 */
	@XmlTransient
	public String getIdcrFnm(){
		return this.idcrFnm;
	}
	
	/**
	 * 신분증성명
	 * 
	 * @param idcrFnm 신분증성명
	 */
	public void setIdcrFnm(String idcrFnm){
		this.idcrFnm= idcrFnm;
		this.setIsSet_idcrFnm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_idcrEncyRsdlNo= false;
	protected final boolean isSet_idcrEncyRsdlNo(){
		return this.isSet_idcrEncyRsdlNo;
	}
	private void setIsSet_idcrEncyRsdlNo(boolean value){
		this.isSet_idcrEncyRsdlNo= value;
	}
	/**
	 * 신분증암호화주민번호
	 */
	@XmlTransient
	public String getIdcrEncyRsdlNo(){
		return this.idcrEncyRsdlNo;
	}
	
	/**
	 * 신분증암호화주민번호
	 * 
	 * @param idcrEncyRsdlNo 신분증암호화주민번호
	 */
	public void setIdcrEncyRsdlNo(String idcrEncyRsdlNo){
		this.idcrEncyRsdlNo= idcrEncyRsdlNo;
		this.setIsSet_idcrEncyRsdlNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_idcrIsuDt= false;
	protected final boolean isSet_idcrIsuDt(){
		return this.isSet_idcrIsuDt;
	}
	private void setIsSet_idcrIsuDt(boolean value){
		this.isSet_idcrIsuDt= value;
	}
	/**
	 * 신분증발급일자
	 */
	@XmlTransient
	public String getIdcrIsuDt(){
		return this.idcrIsuDt;
	}
	
	/**
	 * 신분증발급일자
	 * 
	 * @param idcrIsuDt 신분증발급일자
	 */
	public void setIdcrIsuDt(String idcrIsuDt){
		this.idcrIsuDt= idcrIsuDt;
		this.setIsSet_idcrIsuDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_idcrImgKey= false;
	protected final boolean isSet_idcrImgKey(){
		return this.isSet_idcrImgKey;
	}
	private void setIsSet_idcrImgKey(boolean value){
		this.isSet_idcrImgKey= value;
	}
	/**
	 * 신분증이미지키
	 */
	@XmlTransient
	public String getIdcrImgKey(){
		return this.idcrImgKey;
	}
	
	/**
	 * 신분증이미지키
	 * 
	 * @param idcrImgKey 신분증이미지키
	 */
	public void setIdcrImgKey(String idcrImgKey){
		this.idcrImgKey= idcrImgKey;
		this.setIsSet_idcrImgKey(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_idcrCnfShap= false;
	protected final boolean isSet_idcrCnfShap(){
		return this.isSet_idcrCnfShap;
	}
	private void setIsSet_idcrCnfShap(boolean value){
		this.isSet_idcrCnfShap= value;
	}
	/**
	 * 신분증확인형태
	 */
	@XmlTransient
	public String getIdcrCnfShap(){
		return this.idcrCnfShap;
	}
	
	/**
	 * 신분증확인형태
	 * 
	 * @param idcrCnfShap 신분증확인형태
	 */
	public void setIdcrCnfShap(String idcrCnfShap){
		this.idcrCnfShap= idcrCnfShap;
		this.setIsSet_idcrCnfShap(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_idcrRuseYn= false;
	protected final boolean isSet_idcrRuseYn(){
		return this.isSet_idcrRuseYn;
	}
	private void setIsSet_idcrRuseYn(boolean value){
		this.isSet_idcrRuseYn= value;
	}
	/**
	 * 신분증재사용여부
	 */
	@XmlTransient
	public String getIdcrRuseYn(){
		return this.idcrRuseYn;
	}
	
	/**
	 * 신분증재사용여부
	 * 
	 * @param idcrRuseYn 신분증재사용여부
	 */
	public void setIdcrRuseYn(String idcrRuseYn){
		this.idcrRuseYn= idcrRuseYn;
		this.setIsSet_idcrRuseYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_idcrAgnpeTrnYn= false;
	protected final boolean isSet_idcrAgnpeTrnYn(){
		return this.isSet_idcrAgnpeTrnYn;
	}
	private void setIsSet_idcrAgnpeTrnYn(boolean value){
		this.isSet_idcrAgnpeTrnYn= value;
	}
	/**
	 * 신분증대리인거래여부
	 */
	@XmlTransient
	public String getIdcrAgnpeTrnYn(){
		return this.idcrAgnpeTrnYn;
	}
	
	/**
	 * 신분증대리인거래여부
	 * 
	 * @param idcrAgnpeTrnYn 신분증대리인거래여부
	 */
	public void setIdcrAgnpeTrnYn(String idcrAgnpeTrnYn){
		this.idcrAgnpeTrnYn= idcrAgnpeTrnYn;
		this.setIsSet_idcrAgnpeTrnYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_appRgsDscd= false;
	protected final boolean isSet_appRgsDscd(){
		return this.isSet_appRgsDscd;
	}
	private void setIsSet_appRgsDscd(boolean value){
		this.isSet_appRgsDscd= value;
	}
	/**
	 * 앱등록구분코드
	 */
	@XmlTransient
	public String getAppRgsDscd(){
		return this.appRgsDscd;
	}
	
	/**
	 * 앱등록구분코드
	 * 
	 * @param appRgsDscd 앱등록구분코드
	 */
	public void setAppRgsDscd(String appRgsDscd){
		this.appRgsDscd= appRgsDscd;
		this.setIsSet_appRgsDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_appRgsBrcd= false;
	protected final boolean isSet_appRgsBrcd(){
		return this.isSet_appRgsBrcd;
	}
	private void setIsSet_appRgsBrcd(boolean value){
		this.isSet_appRgsBrcd= value;
	}
	/**
	 * 앱등록점코드
	 */
	@XmlTransient
	public String getAppRgsBrcd(){
		return this.appRgsBrcd;
	}
	
	/**
	 * 앱등록점코드
	 * 
	 * @param appRgsBrcd 앱등록점코드
	 */
	public void setAppRgsBrcd(String appRgsBrcd){
		this.appRgsBrcd= appRgsBrcd;
		this.setIsSet_appRgsBrcd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_appRgsDt= false;
	protected final boolean isSet_appRgsDt(){
		return this.isSet_appRgsDt;
	}
	private void setIsSet_appRgsDt(boolean value){
		this.isSet_appRgsDt= value;
	}
	/**
	 * 앱등록일자
	 */
	@XmlTransient
	public String getAppRgsDt(){
		return this.appRgsDt;
	}
	
	/**
	 * 앱등록일자
	 * 
	 * @param appRgsDt 앱등록일자
	 */
	public void setAppRgsDt(String appRgsDt){
		this.appRgsDt= appRgsDt;
		this.setIsSet_appRgsDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_appRgsSrno= false;
	protected final boolean isSet_appRgsSrno(){
		return this.isSet_appRgsSrno;
	}
	private void setIsSet_appRgsSrno(boolean value){
		this.isSet_appRgsSrno= value;
	}
	/**
	 * 앱등록일련번호
	 */
	@XmlTransient
	public String getAppRgsSrno(){
		return this.appRgsSrno;
	}
	
	/**
	 * 앱등록일련번호
	 * 
	 * @param appRgsSrno 앱등록일련번호
	 */
	public void setAppRgsSrno(String appRgsSrno){
		this.appRgsSrno= appRgsSrno;
		this.setIsSet_appRgsSrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_wmsLnkYn= false;
	protected final boolean isSet_wmsLnkYn(){
		return this.isSet_wmsLnkYn;
	}
	private void setIsSet_wmsLnkYn(boolean value){
		this.isSet_wmsLnkYn= value;
	}
	/**
	 * WMS연동여부
	 */
	@XmlTransient
	public String getWmsLnkYn(){
		return this.wmsLnkYn;
	}
	
	/**
	 * WMS연동여부
	 * 
	 * @param wmsLnkYn WMS연동여부
	 */
	public void setWmsLnkYn(String wmsLnkYn){
		this.wmsLnkYn= wmsLnkYn;
		this.setIsSet_wmsLnkYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_snthAsetMngCsno= false;
	protected final boolean isSet_snthAsetMngCsno(){
		return this.isSet_snthAsetMngCsno;
	}
	private void setIsSet_snthAsetMngCsno(boolean value){
		this.isSet_snthAsetMngCsno= value;
	}
	/**
	 * 종합자산관리고객번호
	 */
	@XmlTransient
	public String getSnthAsetMngCsno(){
		return this.snthAsetMngCsno;
	}
	
	/**
	 * 종합자산관리고객번호
	 * 
	 * @param snthAsetMngCsno 종합자산관리고객번호
	 */
	public void setSnthAsetMngCsno(String snthAsetMngCsno){
		this.snthAsetMngCsno= snthAsetMngCsno;
		this.setIsSet_snthAsetMngCsno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_snthAsetMngDesgnPrdCnt= false;
	protected final boolean isSet_snthAsetMngDesgnPrdCnt(){
		return this.isSet_snthAsetMngDesgnPrdCnt;
	}
	private void setIsSet_snthAsetMngDesgnPrdCnt(boolean value){
		this.isSet_snthAsetMngDesgnPrdCnt= value;
	}
	/**
	 * 종합자산관리설계상품건수
	 */
	@XmlTransient
	public String getSnthAsetMngDesgnPrdCnt(){
		return this.snthAsetMngDesgnPrdCnt;
	}
	
	/**
	 * 종합자산관리설계상품건수
	 * 
	 * @param snthAsetMngDesgnPrdCnt 종합자산관리설계상품건수
	 */
	public void setSnthAsetMngDesgnPrdCnt(String snthAsetMngDesgnPrdCnt){
		this.snthAsetMngDesgnPrdCnt= snthAsetMngDesgnPrdCnt;
		this.setIsSet_snthAsetMngDesgnPrdCnt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_snthAsetMngAltrIvstWgt= false;
	protected final boolean isSet_snthAsetMngAltrIvstWgt(){
		return this.isSet_snthAsetMngAltrIvstWgt;
	}
	private void setIsSet_snthAsetMngAltrIvstWgt(boolean value){
		this.isSet_snthAsetMngAltrIvstWgt= value;
	}
	/**
	 * 종합자산관리대안투자비중
	 */
	@XmlTransient
	public String getSnthAsetMngAltrIvstWgt(){
		return this.snthAsetMngAltrIvstWgt;
	}
	
	/**
	 * 종합자산관리대안투자비중
	 * 
	 * @param snthAsetMngAltrIvstWgt 종합자산관리대안투자비중
	 */
	public void setSnthAsetMngAltrIvstWgt(String snthAsetMngAltrIvstWgt){
		this.snthAsetMngAltrIvstWgt= snthAsetMngAltrIvstWgt;
		this.setIsSet_snthAsetMngAltrIvstWgt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_snthAsetMngBksWgt= false;
	protected final boolean isSet_snthAsetMngBksWgt(){
		return this.isSet_snthAsetMngBksWgt;
	}
	private void setIsSet_snthAsetMngBksWgt(boolean value){
		this.isSet_snthAsetMngBksWgt= value;
	}
	/**
	 * 종합자산관리방카슈랑스비중
	 */
	@XmlTransient
	public String getSnthAsetMngBksWgt(){
		return this.snthAsetMngBksWgt;
	}
	
	/**
	 * 종합자산관리방카슈랑스비중
	 * 
	 * @param snthAsetMngBksWgt 종합자산관리방카슈랑스비중
	 */
	public void setSnthAsetMngBksWgt(String snthAsetMngBksWgt){
		this.snthAsetMngBksWgt= snthAsetMngBksWgt;
		this.setIsSet_snthAsetMngBksWgt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_snthAsetMngFrgBndWgt= false;
	protected final boolean isSet_snthAsetMngFrgBndWgt(){
		return this.isSet_snthAsetMngFrgBndWgt;
	}
	private void setIsSet_snthAsetMngFrgBndWgt(boolean value){
		this.isSet_snthAsetMngFrgBndWgt= value;
	}
	/**
	 * 종합자산관리해외채권비중
	 */
	@XmlTransient
	public String getSnthAsetMngFrgBndWgt(){
		return this.snthAsetMngFrgBndWgt;
	}
	
	/**
	 * 종합자산관리해외채권비중
	 * 
	 * @param snthAsetMngFrgBndWgt 종합자산관리해외채권비중
	 */
	public void setSnthAsetMngFrgBndWgt(String snthAsetMngFrgBndWgt){
		this.snthAsetMngFrgBndWgt= snthAsetMngFrgBndWgt;
		this.setIsSet_snthAsetMngFrgBndWgt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_snthAsetMngFrgStcWgt= false;
	protected final boolean isSet_snthAsetMngFrgStcWgt(){
		return this.isSet_snthAsetMngFrgStcWgt;
	}
	private void setIsSet_snthAsetMngFrgStcWgt(boolean value){
		this.isSet_snthAsetMngFrgStcWgt= value;
	}
	/**
	 * 종합자산관리해외주식비중
	 */
	@XmlTransient
	public String getSnthAsetMngFrgStcWgt(){
		return this.snthAsetMngFrgStcWgt;
	}
	
	/**
	 * 종합자산관리해외주식비중
	 * 
	 * @param snthAsetMngFrgStcWgt 종합자산관리해외주식비중
	 */
	public void setSnthAsetMngFrgStcWgt(String snthAsetMngFrgStcWgt){
		this.snthAsetMngFrgStcWgt= snthAsetMngFrgStcWgt;
		this.setIsSet_snthAsetMngFrgStcWgt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_snthAsetMngPdcd= false;
	protected final boolean isSet_snthAsetMngPdcd(){
		return this.isSet_snthAsetMngPdcd;
	}
	private void setIsSet_snthAsetMngPdcd(boolean value){
		this.isSet_snthAsetMngPdcd= value;
	}
	/**
	 * 종합자산관리상품코드
	 */
	@XmlTransient
	public String getSnthAsetMngPdcd(){
		return this.snthAsetMngPdcd;
	}
	
	/**
	 * 종합자산관리상품코드
	 * 
	 * @param snthAsetMngPdcd 종합자산관리상품코드
	 */
	public void setSnthAsetMngPdcd(String snthAsetMngPdcd){
		this.snthAsetMngPdcd= snthAsetMngPdcd;
		this.setIsSet_snthAsetMngPdcd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_appRgsPwno= false;
	protected final boolean isSet_appRgsPwno(){
		return this.isSet_appRgsPwno;
	}
	private void setIsSet_appRgsPwno(boolean value){
		this.isSet_appRgsPwno= value;
	}
	/**
	 * 앱등록비밀번호
	 */
	@XmlTransient
	public String getAppRgsPwno(){
		return this.appRgsPwno;
	}
	
	/**
	 * 앱등록비밀번호
	 * 
	 * @param appRgsPwno 앱등록비밀번호
	 */
	public void setAppRgsPwno(String appRgsPwno){
		this.appRgsPwno= appRgsPwno;
		this.setIsSet_appRgsPwno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_appRgsAtsAcno= false;
	protected final boolean isSet_appRgsAtsAcno(){
		return this.isSet_appRgsAtsAcno;
	}
	private void setIsSet_appRgsAtsAcno(boolean value){
		this.isSet_appRgsAtsAcno= value;
	}
	/**
	 * 앱등록자동이체계좌번호
	 */
	@XmlTransient
	public String getAppRgsAtsAcno(){
		return this.appRgsAtsAcno;
	}
	
	/**
	 * 앱등록자동이체계좌번호
	 * 
	 * @param appRgsAtsAcno 앱등록자동이체계좌번호
	 */
	public void setAppRgsAtsAcno(String appRgsAtsAcno){
		this.appRgsAtsAcno= appRgsAtsAcno;
		this.setIsSet_appRgsAtsAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_wmLnkTrnSrno= false;
	protected final boolean isSet_wmLnkTrnSrno(){
		return this.isSet_wmLnkTrnSrno;
	}
	private void setIsSet_wmLnkTrnSrno(boolean value){
		this.isSet_wmLnkTrnSrno= value;
	}
	/**
	 * WM연동거래일련번호
	 */
	@XmlTransient
	public String getWmLnkTrnSrno(){
		return this.wmLnkTrnSrno;
	}
	
	/**
	 * WM연동거래일련번호
	 * 
	 * @param wmLnkTrnSrno WM연동거래일련번호
	 */
	public void setWmLnkTrnSrno(String wmLnkTrnSrno){
		this.wmLnkTrnSrno= wmLnkTrnSrno;
		this.setIsSet_wmLnkTrnSrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_snthAsetMngDeedCd= false;
	protected final boolean isSet_snthAsetMngDeedCd(){
		return this.isSet_snthAsetMngDeedCd;
	}
	private void setIsSet_snthAsetMngDeedCd(boolean value){
		this.isSet_snthAsetMngDeedCd= value;
	}
	/**
	 * 종합자산관리증서코드
	 */
	@XmlTransient
	public String getSnthAsetMngDeedCd(){
		return this.snthAsetMngDeedCd;
	}
	
	/**
	 * 종합자산관리증서코드
	 * 
	 * @param snthAsetMngDeedCd 종합자산관리증서코드
	 */
	public void setSnthAsetMngDeedCd(String snthAsetMngDeedCd){
		this.snthAsetMngDeedCd= snthAsetMngDeedCd;
		this.setIsSet_snthAsetMngDeedCd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_snthAsetMngFlwWgt= false;
	protected final boolean isSet_snthAsetMngFlwWgt(){
		return this.isSet_snthAsetMngFlwWgt;
	}
	private void setIsSet_snthAsetMngFlwWgt(boolean value){
		this.isSet_snthAsetMngFlwWgt= value;
	}
	/**
	 * 종합자산관리유동성비중
	 */
	@XmlTransient
	public String getSnthAsetMngFlwWgt(){
		return this.snthAsetMngFlwWgt;
	}
	
	/**
	 * 종합자산관리유동성비중
	 * 
	 * @param snthAsetMngFlwWgt 종합자산관리유동성비중
	 */
	public void setSnthAsetMngFlwWgt(String snthAsetMngFlwWgt){
		this.snthAsetMngFlwWgt= snthAsetMngFlwWgt;
		this.setIsSet_snthAsetMngFlwWgt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_snthAsetMngDomStcWgt= false;
	protected final boolean isSet_snthAsetMngDomStcWgt(){
		return this.isSet_snthAsetMngDomStcWgt;
	}
	private void setIsSet_snthAsetMngDomStcWgt(boolean value){
		this.isSet_snthAsetMngDomStcWgt= value;
	}
	/**
	 * 종합자산관리국내주식비중
	 */
	@XmlTransient
	public String getSnthAsetMngDomStcWgt(){
		return this.snthAsetMngDomStcWgt;
	}
	
	/**
	 * 종합자산관리국내주식비중
	 * 
	 * @param snthAsetMngDomStcWgt 종합자산관리국내주식비중
	 */
	public void setSnthAsetMngDomStcWgt(String snthAsetMngDomStcWgt){
		this.snthAsetMngDomStcWgt= snthAsetMngDomStcWgt;
		this.setIsSet_snthAsetMngDomStcWgt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_snthAsetMngDomBndWgt= false;
	protected final boolean isSet_snthAsetMngDomBndWgt(){
		return this.isSet_snthAsetMngDomBndWgt;
	}
	private void setIsSet_snthAsetMngDomBndWgt(boolean value){
		this.isSet_snthAsetMngDomBndWgt= value;
	}
	/**
	 * 종합자산관리국내채권비중
	 */
	@XmlTransient
	public String getSnthAsetMngDomBndWgt(){
		return this.snthAsetMngDomBndWgt;
	}
	
	/**
	 * 종합자산관리국내채권비중
	 * 
	 * @param snthAsetMngDomBndWgt 종합자산관리국내채권비중
	 */
	public void setSnthAsetMngDomBndWgt(String snthAsetMngDomBndWgt){
		this.snthAsetMngDomBndWgt= snthAsetMngDomBndWgt;
		this.setIsSet_snthAsetMngDomBndWgt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_prdStbyAnlsSrno= false;
	protected final boolean isSet_prdStbyAnlsSrno(){
		return this.isSet_prdStbyAnlsSrno;
	}
	private void setIsSet_prdStbyAnlsSrno(boolean value){
		this.isSet_prdStbyAnlsSrno= value;
	}
	/**
	 * 상품적합성분석일련번호
	 */
	@XmlTransient
	public String getPrdStbyAnlsSrno(){
		return this.prdStbyAnlsSrno;
	}
	
	/**
	 * 상품적합성분석일련번호
	 * 
	 * @param prdStbyAnlsSrno 상품적합성분석일련번호
	 */
	public void setPrdStbyAnlsSrno(String prdStbyAnlsSrno){
		this.prdStbyAnlsSrno= prdStbyAnlsSrno;
		this.setIsSet_prdStbyAnlsSrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_inlnAnlsSrno= false;
	protected final boolean isSet_inlnAnlsSrno(){
		return this.isSet_inlnAnlsSrno;
	}
	private void setIsSet_inlnAnlsSrno(boolean value){
		this.isSet_inlnAnlsSrno= value;
	}
	/**
	 * 성향분석일련번호
	 */
	@XmlTransient
	public String getInlnAnlsSrno(){
		return this.inlnAnlsSrno;
	}
	
	/**
	 * 성향분석일련번호
	 * 
	 * @param inlnAnlsSrno 성향분석일련번호
	 */
	public void setInlnAnlsSrno(String inlnAnlsSrno){
		this.inlnAnlsSrno= inlnAnlsSrno;
		this.setIsSet_inlnAnlsSrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_asetIstMngNo= false;
	protected final boolean isSet_asetIstMngNo(){
		return this.isSet_asetIstMngNo;
	}
	private void setIsSet_asetIstMngNo(boolean value){
		this.isSet_asetIstMngNo= value;
	}
	/**
	 * 자산기관관리번호
	 */
	@XmlTransient
	public String getAsetIstMngNo(){
		return this.asetIstMngNo;
	}
	
	/**
	 * 자산기관관리번호
	 * 
	 * @param asetIstMngNo 자산기관관리번호
	 */
	public void setAsetIstMngNo(String asetIstMngNo){
		this.asetIstMngNo= asetIstMngNo;
		this.setIsSet_asetIstMngNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rtpenPlanOrgPdcd= false;
	protected final boolean isSet_rtpenPlanOrgPdcd(){
		return this.isSet_rtpenPlanOrgPdcd;
	}
	private void setIsSet_rtpenPlanOrgPdcd(boolean value){
		this.isSet_rtpenPlanOrgPdcd= value;
	}
	/**
	 * 퇴직연금플랜원상품코드
	 */
	@XmlTransient
	public String getRtpenPlanOrgPdcd(){
		return this.rtpenPlanOrgPdcd;
	}
	
	/**
	 * 퇴직연금플랜원상품코드
	 * 
	 * @param rtpenPlanOrgPdcd 퇴직연금플랜원상품코드
	 */
	public void setRtpenPlanOrgPdcd(String rtpenPlanOrgPdcd){
		this.rtpenPlanOrgPdcd= rtpenPlanOrgPdcd;
		this.setIsSet_rtpenPlanOrgPdcd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_jnpeTycd= false;
	protected final boolean isSet_jnpeTycd(){
		return this.isSet_jnpeTycd;
	}
	private void setIsSet_jnpeTycd(boolean value){
		this.isSet_jnpeTycd= value;
	}
	/**
	 * 가입자유형코드
	 */
	@XmlTransient
	public String getJnpeTycd(){
		return this.jnpeTycd;
	}
	
	/**
	 * 가입자유형코드
	 * 
	 * @param jnpeTycd 가입자유형코드
	 */
	public void setJnpeTycd(String jnpeTycd){
		this.jnpeTycd= jnpeTycd;
		this.setIsSet_jnpeTycd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_fndSgpFpCnslSrvcDscd= false;
	protected final boolean isSet_fndSgpFpCnslSrvcDscd(){
		return this.isSet_fndSgpFpCnslSrvcDscd;
	}
	private void setIsSet_fndSgpFpCnslSrvcDscd(boolean value){
		this.isSet_fndSgpFpCnslSrvcDscd= value;
	}
	/**
	 * 펀드전문가정기상담서비스구분코드
	 */
	@XmlTransient
	public String getFndSgpFpCnslSrvcDscd(){
		return this.fndSgpFpCnslSrvcDscd;
	}
	
	/**
	 * 펀드전문가정기상담서비스구분코드
	 * 
	 * @param fndSgpFpCnslSrvcDscd 펀드전문가정기상담서비스구분코드
	 */
	public void setFndSgpFpCnslSrvcDscd(String fndSgpFpCnslSrvcDscd){
		this.fndSgpFpCnslSrvcDscd= fndSgpFpCnslSrvcDscd;
		this.setIsSet_fndSgpFpCnslSrvcDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rsdlBzpeNo= false;
	protected final boolean isSet_rsdlBzpeNo(){
		return this.isSet_rsdlBzpeNo;
	}
	private void setIsSet_rsdlBzpeNo(boolean value){
		this.isSet_rsdlBzpeNo= value;
	}
	/**
	 * 주민사업자번호
	 */
	@XmlTransient
	public String getRsdlBzpeNo(){
		return this.rsdlBzpeNo;
	}
	
	/**
	 * 주민사업자번호
	 * 
	 * @param rsdlBzpeNo 주민사업자번호
	 */
	public void setRsdlBzpeNo(String rsdlBzpeNo){
		this.rsdlBzpeNo= rsdlBzpeNo;
		this.setIsSet_rsdlBzpeNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_frnrLstVldTem= false;
	protected final boolean isSet_frnrLstVldTem(){
		return this.isSet_frnrLstVldTem;
	}
	private void setIsSet_frnrLstVldTem(boolean value){
		this.isSet_frnrLstVldTem= value;
	}
	/**
	 * 외국인최종유효기간
	 */
	@XmlTransient
	public String getFrnrLstVldTem(){
		return this.frnrLstVldTem;
	}
	
	/**
	 * 외국인최종유효기간
	 * 
	 * @param frnrLstVldTem 외국인최종유효기간
	 */
	public void setFrnrLstVldTem(String frnrLstVldTem){
		this.frnrLstVldTem= frnrLstVldTem;
		this.setIsSet_frnrLstVldTem(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_inetRsvRcpDscd= false;
	protected final boolean isSet_inetRsvRcpDscd(){
		return this.isSet_inetRsvRcpDscd;
	}
	private void setIsSet_inetRsvRcpDscd(boolean value){
		this.isSet_inetRsvRcpDscd= value;
	}
	/**
	 * 인터넷예약접수구분코드
	 */
	@XmlTransient
	public String getInetRsvRcpDscd(){
		return this.inetRsvRcpDscd;
	}
	
	/**
	 * 인터넷예약접수구분코드
	 * 
	 * @param inetRsvRcpDscd 인터넷예약접수구분코드
	 */
	public void setInetRsvRcpDscd(String inetRsvRcpDscd){
		this.inetRsvRcpDscd= inetRsvRcpDscd;
		this.setIsSet_inetRsvRcpDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_inetRsvIdfNo= false;
	protected final boolean isSet_inetRsvIdfNo(){
		return this.isSet_inetRsvIdfNo;
	}
	private void setIsSet_inetRsvIdfNo(boolean value){
		this.isSet_inetRsvIdfNo= value;
	}
	/**
	 * 인터넷예약식별번호
	 */
	@XmlTransient
	public String getInetRsvIdfNo(){
		return this.inetRsvIdfNo;
	}
	
	/**
	 * 인터넷예약식별번호
	 * 
	 * @param inetRsvIdfNo 인터넷예약식별번호
	 */
	public void setInetRsvIdfNo(String inetRsvIdfNo){
		this.inetRsvIdfNo= inetRsvIdfNo;
		this.setIsSet_inetRsvIdfNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_inetRsvNo= false;
	protected final boolean isSet_inetRsvNo(){
		return this.isSet_inetRsvNo;
	}
	private void setIsSet_inetRsvNo(boolean value){
		this.isSet_inetRsvNo= value;
	}
	/**
	 * 인터넷예약번호
	 */
	@XmlTransient
	public String getInetRsvNo(){
		return this.inetRsvNo;
	}
	
	/**
	 * 인터넷예약번호
	 * 
	 * @param inetRsvNo 인터넷예약번호
	 */
	public void setInetRsvNo(String inetRsvNo){
		this.inetRsvNo= inetRsvNo;
		this.setIsSet_inetRsvNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_inetRsvCusPureNewYn= false;
	protected final boolean isSet_inetRsvCusPureNewYn(){
		return this.isSet_inetRsvCusPureNewYn;
	}
	private void setIsSet_inetRsvCusPureNewYn(boolean value){
		this.isSet_inetRsvCusPureNewYn= value;
	}
	/**
	 * 인터넷예약고객순신규여부
	 */
	@XmlTransient
	public String getInetRsvCusPureNewYn(){
		return this.inetRsvCusPureNewYn;
	}
	
	/**
	 * 인터넷예약고객순신규여부
	 * 
	 * @param inetRsvCusPureNewYn 인터넷예약고객순신규여부
	 */
	public void setInetRsvCusPureNewYn(String inetRsvCusPureNewYn){
		this.inetRsvCusPureNewYn= inetRsvCusPureNewYn;
		this.setIsSet_inetRsvCusPureNewYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_synpbPdcd= false;
	protected final boolean isSet_synpbPdcd(){
		return this.isSet_synpbPdcd;
	}
	private void setIsSet_synpbPdcd(boolean value){
		this.isSet_synpbPdcd= value;
	}
	/**
	 * 종합통장상품코드
	 */
	@XmlTransient
	public String getSynpbPdcd(){
		return this.synpbPdcd;
	}
	
	/**
	 * 종합통장상품코드
	 * 
	 * @param synpbPdcd 종합통장상품코드
	 */
	public void setSynpbPdcd(String synpbPdcd){
		this.synpbPdcd= synpbPdcd;
		this.setIsSet_synpbPdcd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_actUsgAimDis= false;
	protected final boolean isSet_actUsgAimDis(){
		return this.isSet_actUsgAimDis;
	}
	private void setIsSet_actUsgAimDis(boolean value){
		this.isSet_actUsgAimDis= value;
	}
	/**
	 * 계좌사용목적구분
	 */
	@XmlTransient
	public String getActUsgAimDis(){
		return this.actUsgAimDis;
	}
	
	/**
	 * 계좌사용목적구분
	 * 
	 * @param actUsgAimDis 계좌사용목적구분
	 */
	public void setActUsgAimDis(String actUsgAimDis){
		this.actUsgAimDis= actUsgAimDis;
		this.setIsSet_actUsgAimDis(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_frnrEmptEduYn= false;
	protected final boolean isSet_frnrEmptEduYn(){
		return this.isSet_frnrEmptEduYn;
	}
	private void setIsSet_frnrEmptEduYn(boolean value){
		this.isSet_frnrEmptEduYn= value;
	}
	/**
	 * 외국인취업교육여부
	 */
	@XmlTransient
	public String getFrnrEmptEduYn(){
		return this.frnrEmptEduYn;
	}
	
	/**
	 * 외국인취업교육여부
	 * 
	 * @param frnrEmptEduYn 외국인취업교육여부
	 */
	public void setFrnrEmptEduYn(String frnrEmptEduYn){
		this.frnrEmptEduYn= frnrEmptEduYn;
		this.setIsSet_frnrEmptEduYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_fncTrnAimCollDis= false;
	protected final boolean isSet_fncTrnAimCollDis(){
		return this.isSet_fncTrnAimCollDis;
	}
	private void setIsSet_fncTrnAimCollDis(boolean value){
		this.isSet_fncTrnAimCollDis= value;
	}
	/**
	 * 금융거래목적징구구분
	 */
	@XmlTransient
	public String getFncTrnAimCollDis(){
		return this.fncTrnAimCollDis;
	}
	
	/**
	 * 금융거래목적징구구분
	 * 
	 * @param fncTrnAimCollDis 금융거래목적징구구분
	 */
	public void setFncTrnAimCollDis(String fncTrnAimCollDis){
		this.fncTrnAimCollDis= fncTrnAimCollDis;
		this.setIsSet_fncTrnAimCollDis(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_lnoActOpngRsn= false;
	protected final boolean isSet_lnoActOpngRsn(){
		return this.isSet_lnoActOpngRsn;
	}
	private void setIsSet_lnoActOpngRsn(boolean value){
		this.isSet_lnoActOpngRsn= value;
	}
	/**
	 * 다수계좌개설사유
	 */
	@XmlTransient
	public String getLnoActOpngRsn(){
		return this.lnoActOpngRsn;
	}
	
	/**
	 * 다수계좌개설사유
	 * 
	 * @param lnoActOpngRsn 다수계좌개설사유
	 */
	public void setLnoActOpngRsn(String lnoActOpngRsn){
		this.lnoActOpngRsn= lnoActOpngRsn;
		this.setIsSet_lnoActOpngRsn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_depaCrdcCollYn= false;
	protected final boolean isSet_depaCrdcCollYn(){
		return this.isSet_depaCrdcCollYn;
	}
	private void setIsSet_depaCrdcCollYn(boolean value){
		this.isSet_depaCrdcCollYn= value;
	}
	/**
	 * 대포통장증빙서류징구여부
	 */
	@XmlTransient
	public String getDepaCrdcCollYn(){
		return this.depaCrdcCollYn;
	}
	
	/**
	 * 대포통장증빙서류징구여부
	 * 
	 * @param depaCrdcCollYn 대포통장증빙서류징구여부
	 */
	public void setDepaCrdcCollYn(String depaCrdcCollYn){
		this.depaCrdcCollYn= depaCrdcCollYn;
		this.setIsSet_depaCrdcCollYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_idCadIsuRqdcUsgYn= false;
	protected final boolean isSet_idCadIsuRqdcUsgYn(){
		return this.isSet_idCadIsuRqdcUsgYn;
	}
	private void setIsSet_idCadIsuRqdcUsgYn(boolean value){
		this.isSet_idCadIsuRqdcUsgYn= value;
	}
	/**
	 * ID카드발급신청서사용여부
	 */
	@XmlTransient
	public String getIdCadIsuRqdcUsgYn(){
		return this.idCadIsuRqdcUsgYn;
	}
	
	/**
	 * ID카드발급신청서사용여부
	 * 
	 * @param idCadIsuRqdcUsgYn ID카드발급신청서사용여부
	 */
	public void setIdCadIsuRqdcUsgYn(String idCadIsuRqdcUsgYn){
		this.idCadIsuRqdcUsgYn= idCadIsuRqdcUsgYn;
		this.setIsSet_idCadIsuRqdcUsgYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rcvVcrMlsChidYn= false;
	protected final boolean isSet_rcvVcrMlsChidYn(){
		return this.isSet_rcvVcrMlsChidYn;
	}
	private void setIsSet_rcvVcrMlsChidYn(boolean value){
		this.isSet_rcvVcrMlsChidYn= value;
	}
	/**
	 * 입금증무인자여부
	 */
	@XmlTransient
	public String getRcvVcrMlsChidYn(){
		return this.rcvVcrMlsChidYn;
	}
	
	/**
	 * 입금증무인자여부
	 * 
	 * @param rcvVcrMlsChidYn 입금증무인자여부
	 */
	public void setRcvVcrMlsChidYn(String rcvVcrMlsChidYn){
		this.rcvVcrMlsChidYn= rcvVcrMlsChidYn;
		this.setIsSet_rcvVcrMlsChidYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_saltsScdDd= false;
	protected final boolean isSet_saltsScdDd(){
		return this.isSet_saltsScdDd;
	}
	private void setIsSet_saltsScdDd(boolean value){
		this.isSet_saltsScdDd= value;
	}
	/**
	 * 급여이체예정일
	 */
	@XmlTransient
	public Integer getSaltsScdDd(){
		return this.saltsScdDd;
	}
	
	/**
	 * 급여이체예정일
	 * 
	 * @param saltsScdDd 급여이체예정일
	 */
	public void setSaltsScdDd(Integer saltsScdDd){
		this.saltsScdDd= saltsScdDd;
		this.setIsSet_saltsScdDd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atmWdrDscd= false;
	protected final boolean isSet_atmWdrDscd(){
		return this.isSet_atmWdrDscd;
	}
	private void setIsSet_atmWdrDscd(boolean value){
		this.isSet_atmWdrDscd= value;
	}
	/**
	 * 자동화기기출금구분코드
	 */
	@XmlTransient
	public String getAtmWdrDscd(){
		return this.atmWdrDscd;
	}
	
	/**
	 * 자동화기기출금구분코드
	 * 
	 * @param atmWdrDscd 자동화기기출금구분코드
	 */
	public void setAtmWdrDscd(String atmWdrDscd){
		this.atmWdrDscd= atmWdrDscd;
		this.setIsSet_atmWdrDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cctnTrnKdcd= false;
	protected final boolean isSet_cctnTrnKdcd(){
		return this.isSet_cctnTrnKdcd;
	}
	private void setIsSet_cctnTrnKdcd(boolean value){
		this.isSet_cctnTrnKdcd= value;
	}
	/**
	 * 연결거래종류코드
	 */
	@XmlTransient
	public String getCctnTrnKdcd(){
		return this.cctnTrnKdcd;
	}
	
	/**
	 * 연결거래종류코드
	 * 
	 * @param cctnTrnKdcd 연결거래종류코드
	 */
	public void setCctnTrnKdcd(String cctnTrnKdcd){
		this.cctnTrnKdcd= cctnTrnKdcd;
		this.setIsSet_cctnTrnKdcd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_idCadIsuYn= false;
	protected final boolean isSet_idCadIsuYn(){
		return this.isSet_idCadIsuYn;
	}
	private void setIsSet_idCadIsuYn(boolean value){
		this.isSet_idCadIsuYn= value;
	}
	/**
	 * ID카드발급여부
	 */
	@XmlTransient
	public String getIdCadIsuYn(){
		return this.idCadIsuYn;
	}
	
	/**
	 * ID카드발급여부
	 * 
	 * @param idCadIsuYn ID카드발급여부
	 */
	public void setIdCadIsuYn(String idCadIsuYn){
		this.idCadIsuYn= idCadIsuYn;
		this.setIsSet_idCadIsuYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ptnrPrmeIr1Yn= false;
	protected final boolean isSet_ptnrPrmeIr1Yn(){
		return this.isSet_ptnrPrmeIr1Yn;
	}
	private void setIsSet_ptnrPrmeIr1Yn(boolean value){
		this.isSet_ptnrPrmeIr1Yn= value;
	}
	/**
	 * 파트너우대금리1여부
	 */
	@XmlTransient
	public String getPtnrPrmeIr1Yn(){
		return this.ptnrPrmeIr1Yn;
	}
	
	/**
	 * 파트너우대금리1여부
	 * 
	 * @param ptnrPrmeIr1Yn 파트너우대금리1여부
	 */
	public void setPtnrPrmeIr1Yn(String ptnrPrmeIr1Yn){
		this.ptnrPrmeIr1Yn= ptnrPrmeIr1Yn;
		this.setIsSet_ptnrPrmeIr1Yn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ptnrPrmeIr2Yn= false;
	protected final boolean isSet_ptnrPrmeIr2Yn(){
		return this.isSet_ptnrPrmeIr2Yn;
	}
	private void setIsSet_ptnrPrmeIr2Yn(boolean value){
		this.isSet_ptnrPrmeIr2Yn= value;
	}
	/**
	 * 파트너우대금리2여부
	 */
	@XmlTransient
	public String getPtnrPrmeIr2Yn(){
		return this.ptnrPrmeIr2Yn;
	}
	
	/**
	 * 파트너우대금리2여부
	 * 
	 * @param ptnrPrmeIr2Yn 파트너우대금리2여부
	 */
	public void setPtnrPrmeIr2Yn(String ptnrPrmeIr2Yn){
		this.ptnrPrmeIr2Yn= ptnrPrmeIr2Yn;
		this.setIsSet_ptnrPrmeIr2Yn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ptnrPrmeIr3Yn= false;
	protected final boolean isSet_ptnrPrmeIr3Yn(){
		return this.isSet_ptnrPrmeIr3Yn;
	}
	private void setIsSet_ptnrPrmeIr3Yn(boolean value){
		this.isSet_ptnrPrmeIr3Yn= value;
	}
	/**
	 * 파트너우대금리3여부
	 */
	@XmlTransient
	public String getPtnrPrmeIr3Yn(){
		return this.ptnrPrmeIr3Yn;
	}
	
	/**
	 * 파트너우대금리3여부
	 * 
	 * @param ptnrPrmeIr3Yn 파트너우대금리3여부
	 */
	public void setPtnrPrmeIr3Yn(String ptnrPrmeIr3Yn){
		this.ptnrPrmeIr3Yn= ptnrPrmeIr3Yn;
		this.setIsSet_ptnrPrmeIr3Yn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ptnrPrmeIr4Yn= false;
	protected final boolean isSet_ptnrPrmeIr4Yn(){
		return this.isSet_ptnrPrmeIr4Yn;
	}
	private void setIsSet_ptnrPrmeIr4Yn(boolean value){
		this.isSet_ptnrPrmeIr4Yn= value;
	}
	/**
	 * 파트너우대금리4여부
	 */
	@XmlTransient
	public String getPtnrPrmeIr4Yn(){
		return this.ptnrPrmeIr4Yn;
	}
	
	/**
	 * 파트너우대금리4여부
	 * 
	 * @param ptnrPrmeIr4Yn 파트너우대금리4여부
	 */
	public void setPtnrPrmeIr4Yn(String ptnrPrmeIr4Yn){
		this.ptnrPrmeIr4Yn= ptnrPrmeIr4Yn;
		this.setIsSet_ptnrPrmeIr4Yn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ascnPbokNm= false;
	protected final boolean isSet_ascnPbokNm(){
		return this.isSet_ascnPbokNm;
	}
	private void setIsSet_ascnPbokNm(boolean value){
		this.isSet_ascnPbokNm= value;
	}
	/**
	 * 단체통장명
	 */
	@XmlTransient
	public String getAscnPbokNm(){
		return this.ascnPbokNm;
	}
	
	/**
	 * 단체통장명
	 * 
	 * @param ascnPbokNm 단체통장명
	 */
	public void setAscnPbokNm(String ascnPbokNm){
		this.ascnPbokNm= ascnPbokNm;
		this.setIsSet_ascnPbokNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rcvpeNm= false;
	protected final boolean isSet_rcvpeNm(){
		return this.isSet_rcvpeNm;
	}
	private void setIsSet_rcvpeNm(boolean value){
		this.isSet_rcvpeNm= value;
	}
	/**
	 * 입금자명
	 */
	@XmlTransient
	public String getRcvpeNm(){
		return this.rcvpeNm;
	}
	
	/**
	 * 입금자명
	 * 
	 * @param rcvpeNm 입금자명
	 */
	public void setRcvpeNm(String rcvpeNm){
		this.rcvpeNm= rcvpeNm;
		this.setIsSet_rcvpeNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rcvDd= false;
	protected final boolean isSet_rcvDd(){
		return this.isSet_rcvDd;
	}
	private void setIsSet_rcvDd(boolean value){
		this.isSet_rcvDd= value;
	}
	/**
	 * 입금일
	 */
	@XmlTransient
	public Integer getRcvDd(){
		return this.rcvDd;
	}
	
	/**
	 * 입금일
	 * 
	 * @param rcvDd 입금일
	 */
	public void setRcvDd(Integer rcvDd){
		this.rcvDd= rcvDd;
		this.setIsSet_rcvDd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dntnAtsEndDt= false;
	protected final boolean isSet_dntnAtsEndDt(){
		return this.isSet_dntnAtsEndDt;
	}
	private void setIsSet_dntnAtsEndDt(boolean value){
		this.isSet_dntnAtsEndDt= value;
	}
	/**
	 * 기부자동이체종료일자
	 */
	@XmlTransient
	public String getDntnAtsEndDt(){
		return this.dntnAtsEndDt;
	}
	
	/**
	 * 기부자동이체종료일자
	 * 
	 * @param dntnAtsEndDt 기부자동이체종료일자
	 */
	public void setDntnAtsEndDt(String dntnAtsEndDt){
		this.dntnAtsEndDt= dntnAtsEndDt;
		this.setIsSet_dntnAtsEndDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_patnAscnAcno= false;
	protected final boolean isSet_patnAscnAcno(){
		return this.isSet_patnAscnAcno;
	}
	private void setIsSet_patnAscnAcno(boolean value){
		this.isSet_patnAscnAcno= value;
	}
	/**
	 * 후원단체계좌번호
	 */
	@XmlTransient
	public String getPatnAscnAcno(){
		return this.patnAscnAcno;
	}
	
	/**
	 * 후원단체계좌번호
	 * 
	 * @param patnAscnAcno 후원단체계좌번호
	 */
	public void setPatnAscnAcno(String patnAscnAcno){
		this.patnAscnAcno= patnAscnAcno;
		this.setIsSet_patnAscnAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_patnAscnNm= false;
	protected final boolean isSet_patnAscnNm(){
		return this.isSet_patnAscnNm;
	}
	private void setIsSet_patnAscnNm(boolean value){
		this.isSet_patnAscnNm= value;
	}
	/**
	 * 후원단체명
	 */
	@XmlTransient
	public String getPatnAscnNm(){
		return this.patnAscnNm;
	}
	
	/**
	 * 후원단체명
	 * 
	 * @param patnAscnNm 후원단체명
	 */
	public void setPatnAscnNm(String patnAscnNm){
		this.patnAscnNm= patnAscnNm;
		this.setIsSet_patnAscnNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_aimFdNm= false;
	protected final boolean isSet_aimFdNm(){
		return this.isSet_aimFdNm;
	}
	private void setIsSet_aimFdNm(boolean value){
		this.isSet_aimFdNm= value;
	}
	/**
	 * 목적자금명
	 */
	@XmlTransient
	public String getAimFdNm(){
		return this.aimFdNm;
	}
	
	/**
	 * 목적자금명
	 * 
	 * @param aimFdNm 목적자금명
	 */
	public void setAimFdNm(String aimFdNm){
		this.aimFdNm= aimFdNm;
		this.setIsSet_aimFdNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_patnAscnDis= false;
	protected final boolean isSet_patnAscnDis(){
		return this.isSet_patnAscnDis;
	}
	private void setIsSet_patnAscnDis(boolean value){
		this.isSet_patnAscnDis= value;
	}
	/**
	 * 후원단체구분
	 */
	@XmlTransient
	public String getPatnAscnDis(){
		return this.patnAscnDis;
	}
	
	/**
	 * 후원단체구분
	 * 
	 * @param patnAscnDis 후원단체구분
	 */
	public void setPatnAscnDis(String patnAscnDis){
		this.patnAscnDis= patnAscnDis;
		this.setIsSet_patnAscnDis(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_patnHpNo= false;
	protected final boolean isSet_patnHpNo(){
		return this.isSet_patnHpNo;
	}
	private void setIsSet_patnHpNo(boolean value){
		this.isSet_patnHpNo= value;
	}
	/**
	 * 후원핸드폰번호
	 */
	@XmlTransient
	public String getPatnHpNo(){
		return this.patnHpNo;
	}
	
	/**
	 * 후원핸드폰번호
	 * 
	 * @param patnHpNo 후원핸드폰번호
	 */
	public void setPatnHpNo(String patnHpNo){
		this.patnHpNo= patnHpNo;
		this.setIsSet_patnHpNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_chilRrno= false;
	protected final boolean isSet_chilRrno(){
		return this.isSet_chilRrno;
	}
	private void setIsSet_chilRrno(boolean value){
		this.isSet_chilRrno= value;
	}
	/**
	 * 자녀주민등록번호
	 */
	@XmlTransient
	public String getChilRrno(){
		return this.chilRrno;
	}
	
	/**
	 * 자녀주민등록번호
	 * 
	 * @param chilRrno 자녀주민등록번호
	 */
	public void setChilRrno(String chilRrno){
		this.chilRrno= chilRrno;
		this.setIsSet_chilRrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dntnInfOfrAgrYn= false;
	protected final boolean isSet_dntnInfOfrAgrYn(){
		return this.isSet_dntnInfOfrAgrYn;
	}
	private void setIsSet_dntnInfOfrAgrYn(boolean value){
		this.isSet_dntnInfOfrAgrYn= value;
	}
	/**
	 * 기부정보제공동의여부
	 */
	@XmlTransient
	public String getDntnInfOfrAgrYn(){
		return this.dntnInfOfrAgrYn;
	}
	
	/**
	 * 기부정보제공동의여부
	 * 
	 * @param dntnInfOfrAgrYn 기부정보제공동의여부
	 */
	public void setDntnInfOfrAgrYn(String dntnInfOfrAgrYn){
		this.dntnInfOfrAgrYn= dntnInfOfrAgrYn;
		this.setIsSet_dntnInfOfrAgrYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dntnlCd= false;
	protected final boolean isSet_dntnlCd(){
		return this.isSet_dntnlCd;
	}
	private void setIsSet_dntnlCd(boolean value){
		this.isSet_dntnlCd= value;
	}
	/**
	 * 기부처코드
	 */
	@XmlTransient
	public String getDntnlCd(){
		return this.dntnlCd;
	}
	
	/**
	 * 기부처코드
	 * 
	 * @param dntnlCd 기부처코드
	 */
	public void setDntnlCd(String dntnlCd){
		this.dntnlCd= dntnlCd;
		this.setIsSet_dntnlCd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_clsaAtsRqYn= false;
	protected final boolean isSet_clsaAtsRqYn(){
		return this.isSet_clsaAtsRqYn;
	}
	private void setIsSet_clsaAtsRqYn(boolean value){
		this.isSet_clsaAtsRqYn= value;
	}
	/**
	 * 결산자동이체신청여부
	 */
	@XmlTransient
	public String getClsaAtsRqYn(){
		return this.clsaAtsRqYn;
	}
	
	/**
	 * 결산자동이체신청여부
	 * 
	 * @param clsaAtsRqYn 결산자동이체신청여부
	 */
	public void setClsaAtsRqYn(String clsaAtsRqYn){
		this.clsaAtsRqYn= clsaAtsRqYn;
		this.setIsSet_clsaAtsRqYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_clsaAtsPmnyAcno= false;
	protected final boolean isSet_clsaAtsPmnyAcno(){
		return this.isSet_clsaAtsPmnyAcno;
	}
	private void setIsSet_clsaAtsPmnyAcno(boolean value){
		this.isSet_clsaAtsPmnyAcno= value;
	}
	/**
	 * 결산자동이체공금계좌번호
	 */
	@XmlTransient
	public String getClsaAtsPmnyAcno(){
		return this.clsaAtsPmnyAcno;
	}
	
	/**
	 * 결산자동이체공금계좌번호
	 * 
	 * @param clsaAtsPmnyAcno 결산자동이체공금계좌번호
	 */
	public void setClsaAtsPmnyAcno(String clsaAtsPmnyAcno){
		this.clsaAtsPmnyAcno= clsaAtsPmnyAcno;
		this.setIsSet_clsaAtsPmnyAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_clsaAtsEndDt= false;
	protected final boolean isSet_clsaAtsEndDt(){
		return this.isSet_clsaAtsEndDt;
	}
	private void setIsSet_clsaAtsEndDt(boolean value){
		this.isSet_clsaAtsEndDt= value;
	}
	/**
	 * 결산자동이체종료일자
	 */
	@XmlTransient
	public String getClsaAtsEndDt(){
		return this.clsaAtsEndDt;
	}
	
	/**
	 * 결산자동이체종료일자
	 * 
	 * @param clsaAtsEndDt 결산자동이체종료일자
	 */
	public void setClsaAtsEndDt(String clsaAtsEndDt){
		this.clsaAtsEndDt= clsaAtsEndDt;
		this.setIsSet_clsaAtsEndDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_fncTaxtSmsRqYn= false;
	protected final boolean isSet_fncTaxtSmsRqYn(){
		return this.isSet_fncTaxtSmsRqYn;
	}
	private void setIsSet_fncTaxtSmsRqYn(boolean value){
		this.isSet_fncTaxtSmsRqYn= value;
	}
	/**
	 * 금융과세SMS신청여부
	 */
	@XmlTransient
	public String getFncTaxtSmsRqYn(){
		return this.fncTaxtSmsRqYn;
	}
	
	/**
	 * 금융과세SMS신청여부
	 * 
	 * @param fncTaxtSmsRqYn 금융과세SMS신청여부
	 */
	public void setFncTaxtSmsRqYn(String fncTaxtSmsRqYn){
		this.fncTaxtSmsRqYn= fncTaxtSmsRqYn;
		this.setIsSet_fncTaxtSmsRqYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_wfFclUnqNo= false;
	protected final boolean isSet_wfFclUnqNo(){
		return this.isSet_wfFclUnqNo;
	}
	private void setIsSet_wfFclUnqNo(boolean value){
		this.isSet_wfFclUnqNo= value;
	}
	/**
	 * 복지시설고유번호
	 */
	@XmlTransient
	public String getWfFclUnqNo(){
		return this.wfFclUnqNo;
	}
	
	/**
	 * 복지시설고유번호
	 * 
	 * @param wfFclUnqNo 복지시설고유번호
	 */
	public void setWfFclUnqNo(String wfFclUnqNo){
		this.wfFclUnqNo= wfFclUnqNo;
		this.setIsSet_wfFclUnqNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_locaPrmeYn= false;
	protected final boolean isSet_locaPrmeYn(){
		return this.isSet_locaPrmeYn;
	}
	private void setIsSet_locaPrmeYn(boolean value){
		this.isSet_locaPrmeYn= value;
	}
	/**
	 * 저탄소우대여부
	 */
	@XmlTransient
	public String getLocaPrmeYn(){
		return this.locaPrmeYn;
	}
	
	/**
	 * 저탄소우대여부
	 * 
	 * @param locaPrmeYn 저탄소우대여부
	 */
	public void setLocaPrmeYn(String locaPrmeYn){
		this.locaPrmeYn= locaPrmeYn;
		this.setIsSet_locaPrmeYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_afiBzcd= false;
	protected final boolean isSet_afiBzcd(){
		return this.isSet_afiBzcd;
	}
	private void setIsSet_afiBzcd(boolean value){
		this.isSet_afiBzcd= value;
	}
	/**
	 * 제휴업무코드
	 */
	@XmlTransient
	public String getAfiBzcd(){
		return this.afiBzcd;
	}
	
	/**
	 * 제휴업무코드
	 * 
	 * @param afiBzcd 제휴업무코드
	 */
	public void setAfiBzcd(String afiBzcd){
		this.afiBzcd= afiBzcd;
		this.setIsSet_afiBzcd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_emlNtcSrvcYn= false;
	protected final boolean isSet_emlNtcSrvcYn(){
		return this.isSet_emlNtcSrvcYn;
	}
	private void setIsSet_emlNtcSrvcYn(boolean value){
		this.isSet_emlNtcSrvcYn= value;
	}
	/**
	 * 이메일통지서비스여부
	 */
	@XmlTransient
	public String getEmlNtcSrvcYn(){
		return this.emlNtcSrvcYn;
	}
	
	/**
	 * 이메일통지서비스여부
	 * 
	 * @param emlNtcSrvcYn 이메일통지서비스여부
	 */
	public void setEmlNtcSrvcYn(String emlNtcSrvcYn){
		this.emlNtcSrvcYn= emlNtcSrvcYn;
		this.setIsSet_emlNtcSrvcYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_fmbkCtrdCollYn= false;
	protected final boolean isSet_fmbkCtrdCollYn(){
		return this.isSet_fmbkCtrdCollYn;
	}
	private void setIsSet_fmbkCtrdCollYn(boolean value){
		this.isSet_fmbkCtrdCollYn= value;
	}
	/**
	 * 펌뱅킹계약서징구여부
	 */
	@XmlTransient
	public String getFmbkCtrdCollYn(){
		return this.fmbkCtrdCollYn;
	}
	
	/**
	 * 펌뱅킹계약서징구여부
	 * 
	 * @param fmbkCtrdCollYn 펌뱅킹계약서징구여부
	 */
	public void setFmbkCtrdCollYn(String fmbkCtrdCollYn){
		this.fmbkCtrdCollYn= fmbkCtrdCollYn;
		this.setIsSet_fmbkCtrdCollYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_adrpRgsYn= false;
	protected final boolean isSet_adrpRgsYn(){
		return this.isSet_adrpRgsYn;
	}
	private void setIsSet_adrpRgsYn(boolean value){
		this.isSet_adrpRgsYn= value;
	}
	/**
	 * 사고신고등록여부
	 */
	@XmlTransient
	public String getAdrpRgsYn(){
		return this.adrpRgsYn;
	}
	
	/**
	 * 사고신고등록여부
	 * 
	 * @param adrpRgsYn 사고신고등록여부
	 */
	public void setAdrpRgsYn(String adrpRgsYn){
		this.adrpRgsYn= adrpRgsYn;
		this.setIsSet_adrpRgsYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mbhYn= false;
	protected final boolean isSet_mbhYn(){
		return this.isSet_mbhYn;
	}
	private void setIsSet_mbhYn(boolean value){
		this.isSet_mbhYn= value;
	}
	/**
	 * 회원여부
	 */
	@XmlTransient
	public String getMbhYn(){
		return this.mbhYn;
	}
	
	/**
	 * 회원여부
	 * 
	 * @param mbhYn 회원여부
	 */
	public void setMbhYn(String mbhYn){
		this.mbhYn= mbhYn;
		this.setIsSet_mbhYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_psnInfAgrYn= false;
	protected final boolean isSet_psnInfAgrYn(){
		return this.isSet_psnInfAgrYn;
	}
	private void setIsSet_psnInfAgrYn(boolean value){
		this.isSet_psnInfAgrYn= value;
	}
	/**
	 * 개인정보동의여부
	 */
	@XmlTransient
	public String getPsnInfAgrYn(){
		return this.psnInfAgrYn;
	}
	
	/**
	 * 개인정보동의여부
	 * 
	 * @param psnInfAgrYn 개인정보동의여부
	 */
	public void setPsnInfAgrYn(String psnInfAgrYn){
		this.psnInfAgrYn= psnInfAgrYn;
		this.setIsSet_psnInfAgrYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_datAcldHpNo= false;
	protected final boolean isSet_datAcldHpNo(){
		return this.isSet_datAcldHpNo;
	}
	private void setIsSet_datAcldHpNo(boolean value){
		this.isSet_datAcldHpNo= value;
	}
	/**
	 * 데이터적립핸드폰번호
	 */
	@XmlTransient
	public String getDatAcldHpNo(){
		return this.datAcldHpNo;
	}
	
	/**
	 * 데이터적립핸드폰번호
	 * 
	 * @param datAcldHpNo 데이터적립핸드폰번호
	 */
	public void setDatAcldHpNo(String datAcldHpNo){
		this.datAcldHpNo= datAcldHpNo;
		this.setIsSet_datAcldHpNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dpsBatRqsNo= false;
	protected final boolean isSet_dpsBatRqsNo(){
		return this.isSet_dpsBatRqsNo;
	}
	private void setIsSet_dpsBatRqsNo(boolean value){
		this.isSet_dpsBatRqsNo= value;
	}
	/**
	 * 수신일괄의뢰번호
	 */
	@XmlTransient
	public Integer getDpsBatRqsNo(){
		return this.dpsBatRqsNo;
	}
	
	/**
	 * 수신일괄의뢰번호
	 * 
	 * @param dpsBatRqsNo 수신일괄의뢰번호
	 */
	public void setDpsBatRqsNo(Integer dpsBatRqsNo){
		this.dpsBatRqsNo= dpsBatRqsNo;
		this.setIsSet_dpsBatRqsNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dpsBatRqsSrno= false;
	protected final boolean isSet_dpsBatRqsSrno(){
		return this.isSet_dpsBatRqsSrno;
	}
	private void setIsSet_dpsBatRqsSrno(boolean value){
		this.isSet_dpsBatRqsSrno= value;
	}
	/**
	 * 수신일괄의뢰일련번호
	 */
	@XmlTransient
	public Integer getDpsBatRqsSrno(){
		return this.dpsBatRqsSrno;
	}
	
	/**
	 * 수신일괄의뢰일련번호
	 * 
	 * @param dpsBatRqsSrno 수신일괄의뢰일련번호
	 */
	public void setDpsBatRqsSrno(Integer dpsBatRqsSrno){
		this.dpsBatRqsSrno= dpsBatRqsSrno;
		this.setIsSet_dpsBatRqsSrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_agnpeEncyRrno= false;
	protected final boolean isSet_agnpeEncyRrno(){
		return this.isSet_agnpeEncyRrno;
	}
	private void setIsSet_agnpeEncyRrno(boolean value){
		this.isSet_agnpeEncyRrno= value;
	}
	/**
	 * 대리인암호화주민등록번호
	 */
	@XmlTransient
	public String getAgnpeEncyRrno(){
		return this.agnpeEncyRrno;
	}
	
	/**
	 * 대리인암호화주민등록번호
	 * 
	 * @param agnpeEncyRrno 대리인암호화주민등록번호
	 */
	public void setAgnpeEncyRrno(String agnpeEncyRrno){
		this.agnpeEncyRrno= agnpeEncyRrno;
		this.setIsSet_agnpeEncyRrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_agnpeFnm= false;
	protected final boolean isSet_agnpeFnm(){
		return this.isSet_agnpeFnm;
	}
	private void setIsSet_agnpeFnm(boolean value){
		this.isSet_agnpeFnm= value;
	}
	/**
	 * 대리인성명
	 */
	@XmlTransient
	public String getAgnpeFnm(){
		return this.agnpeFnm;
	}
	
	/**
	 * 대리인성명
	 * 
	 * @param agnpeFnm 대리인성명
	 */
	public void setAgnpeFnm(String agnpeFnm){
		this.agnpeFnm= agnpeFnm;
		this.setIsSet_agnpeFnm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rppeDupOmitYn= false;
	protected final boolean isSet_rppeDupOmitYn(){
		return this.isSet_rppeDupOmitYn;
	}
	private void setIsSet_rppeDupOmitYn(boolean value){
		this.isSet_rppeDupOmitYn= value;
	}
	/**
	 * 대표자중복생략여부
	 */
	@XmlTransient
	public String getRppeDupOmitYn(){
		return this.rppeDupOmitYn;
	}
	
	/**
	 * 대표자중복생략여부
	 * 
	 * @param rppeDupOmitYn 대표자중복생략여부
	 */
	public void setRppeDupOmitYn(String rppeDupOmitYn){
		this.rppeDupOmitYn= rppeDupOmitYn;
		this.setIsSet_rppeDupOmitYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rppeAgnpeAcrdYn= false;
	protected final boolean isSet_rppeAgnpeAcrdYn(){
		return this.isSet_rppeAgnpeAcrdYn;
	}
	private void setIsSet_rppeAgnpeAcrdYn(boolean value){
		this.isSet_rppeAgnpeAcrdYn= value;
	}
	/**
	 * 대표자대리인일치여부
	 */
	@XmlTransient
	public String getRppeAgnpeAcrdYn(){
		return this.rppeAgnpeAcrdYn;
	}
	
	/**
	 * 대표자대리인일치여부
	 * 
	 * @param rppeAgnpeAcrdYn 대표자대리인일치여부
	 */
	public void setRppeAgnpeAcrdYn(String rppeAgnpeAcrdYn){
		this.rppeAgnpeAcrdYn= rppeAgnpeAcrdYn;
		this.setIsSet_rppeAgnpeAcrdYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rppeFnm= false;
	protected final boolean isSet_rppeFnm(){
		return this.isSet_rppeFnm;
	}
	private void setIsSet_rppeFnm(boolean value){
		this.isSet_rppeFnm= value;
	}
	/**
	 * 대표자성명
	 */
	@XmlTransient
	public String getRppeFnm(){
		return this.rppeFnm;
	}
	
	/**
	 * 대표자성명
	 * 
	 * @param rppeFnm 대표자성명
	 */
	public void setRppeFnm(String rppeFnm){
		this.rppeFnm= rppeFnm;
		this.setIsSet_rppeFnm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rppeEncyRrno= false;
	protected final boolean isSet_rppeEncyRrno(){
		return this.isSet_rppeEncyRrno;
	}
	private void setIsSet_rppeEncyRrno(boolean value){
		this.isSet_rppeEncyRrno= value;
	}
	/**
	 * 대표자암호화주민등록번호
	 */
	@XmlTransient
	public String getRppeEncyRrno(){
		return this.rppeEncyRrno;
	}
	
	/**
	 * 대표자암호화주민등록번호
	 * 
	 * @param rppeEncyRrno 대표자암호화주민등록번호
	 */
	public void setRppeEncyRrno(String rppeEncyRrno){
		this.rppeEncyRrno= rppeEncyRrno;
		this.setIsSet_rppeEncyRrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_agnpeDupYn= false;
	protected final boolean isSet_agnpeDupYn(){
		return this.isSet_agnpeDupYn;
	}
	private void setIsSet_agnpeDupYn(boolean value){
		this.isSet_agnpeDupYn= value;
	}
	/**
	 * 대리인중복여부
	 */
	@XmlTransient
	public String getAgnpeDupYn(){
		return this.agnpeDupYn;
	}
	
	/**
	 * 대리인중복여부
	 * 
	 * @param agnpeDupYn 대리인중복여부
	 */
	public void setAgnpeDupYn(String agnpeDupYn){
		this.agnpeDupYn= agnpeDupYn;
		this.setIsSet_agnpeDupYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rppeDupYn= false;
	protected final boolean isSet_rppeDupYn(){
		return this.isSet_rppeDupYn;
	}
	private void setIsSet_rppeDupYn(boolean value){
		this.isSet_rppeDupYn= value;
	}
	/**
	 * 대표자중복여부
	 */
	@XmlTransient
	public String getRppeDupYn(){
		return this.rppeDupYn;
	}
	
	/**
	 * 대표자중복여부
	 * 
	 * @param rppeDupYn 대표자중복여부
	 */
	public void setRppeDupYn(String rppeDupYn){
		this.rppeDupYn= rppeDupYn;
		this.setIsSet_rppeDupYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_itpyMecd= false;
	protected final boolean isSet_itpyMecd(){
		return this.isSet_itpyMecd;
	}
	private void setIsSet_itpyMecd(boolean value){
		this.isSet_itpyMecd= value;
	}
	/**
	 * 이자지급방법코드
	 */
	@XmlTransient
	public String getItpyMecd(){
		return this.itpyMecd;
	}
	
	/**
	 * 이자지급방법코드
	 * 
	 * @param itpyMecd 이자지급방법코드
	 */
	public void setItpyMecd(String itpyMecd){
		this.itpyMecd= itpyMecd;
		this.setIsSet_itpyMecd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_itpyCycd= false;
	protected final boolean isSet_itpyCycd(){
		return this.isSet_itpyCycd;
	}
	private void setIsSet_itpyCycd(boolean value){
		this.isSet_itpyCycd= value;
	}
	/**
	 * 이자지급주기코드
	 */
	@XmlTransient
	public String getItpyCycd(){
		return this.itpyCycd;
	}
	
	/**
	 * 이자지급주기코드
	 * 
	 * @param itpyCycd 이자지급주기코드
	 */
	public void setItpyCycd(String itpyCycd){
		this.itpyCycd= itpyCycd;
		this.setIsSet_itpyCycd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_nextItpyDt= false;
	protected final boolean isSet_nextItpyDt(){
		return this.isSet_nextItpyDt;
	}
	private void setIsSet_nextItpyDt(boolean value){
		this.isSet_nextItpyDt= value;
	}
	/**
	 * 차기이자지급일자
	 */
	@XmlTransient
	public String getNextItpyDt(){
		return this.nextItpyDt;
	}
	
	/**
	 * 차기이자지급일자
	 * 
	 * @param nextItpyDt 차기이자지급일자
	 */
	public void setNextItpyDt(String nextItpyDt){
		this.nextItpyDt= nextItpyDt;
		this.setIsSet_nextItpyDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_actMngBrcd= false;
	protected final boolean isSet_actMngBrcd(){
		return this.isSet_actMngBrcd;
	}
	private void setIsSet_actMngBrcd(boolean value){
		this.isSet_actMngBrcd= value;
	}
	/**
	 * 계좌관리점코드
	 */
	@XmlTransient
	public String getActMngBrcd(){
		return this.actMngBrcd;
	}
	
	/**
	 * 계좌관리점코드
	 * 
	 * @param actMngBrcd 계좌관리점코드
	 */
	public void setActMngBrcd(String actMngBrcd){
		this.actMngBrcd= actMngBrcd;
		this.setIsSet_actMngBrcd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_asscNmnlDpstYn= false;
	protected final boolean isSet_asscNmnlDpstYn(){
		return this.isSet_asscNmnlDpstYn;
	}
	private void setIsSet_asscNmnlDpstYn(boolean value){
		this.isSet_asscNmnlDpstYn= value;
	}
	/**
	 * 공동명의예금여부
	 */
	@XmlTransient
	public String getAsscNmnlDpstYn(){
		return this.asscNmnlDpstYn;
	}
	
	/**
	 * 공동명의예금여부
	 * 
	 * @param asscNmnlDpstYn 공동명의예금여부
	 */
	public void setAsscNmnlDpstYn(String asscNmnlDpstYn){
		this.asscNmnlDpstYn= asscNmnlDpstYn;
		this.setIsSet_asscNmnlDpstYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_netrApvNo= false;
	protected final boolean isSet_netrApvNo(){
		return this.isSet_netrApvNo;
	}
	private void setIsSet_netrApvNo(boolean value){
		this.isSet_netrApvNo= value;
	}
	/**
	 * NET거래승인번호
	 */
	@XmlTransient
	public String getNetrApvNo(){
		return this.netrApvNo;
	}
	
	/**
	 * NET거래승인번호
	 * 
	 * @param netrApvNo NET거래승인번호
	 */
	public void setNetrApvNo(String netrApvNo){
		this.netrApvNo= netrApvNo;
		this.setIsSet_netrApvNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mbpbkJnngYn= false;
	protected final boolean isSet_mbpbkJnngYn(){
		return this.isSet_mbpbkJnngYn;
	}
	private void setIsSet_mbpbkJnngYn(boolean value){
		this.isSet_mbpbkJnngYn= value;
	}
	/**
	 * 모바일통장가입여부
	 */
	@XmlTransient
	public String getMbpbkJnngYn(){
		return this.mbpbkJnngYn;
	}
	
	/**
	 * 모바일통장가입여부
	 * 
	 * @param mbpbkJnngYn 모바일통장가입여부
	 */
	public void setMbpbkJnngYn(String mbpbkJnngYn){
		this.mbpbkJnngYn= mbpbkJnngYn;
		this.setIsSet_mbpbkJnngYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mblPbokInetBnkgId= false;
	protected final boolean isSet_mblPbokInetBnkgId(){
		return this.isSet_mblPbokInetBnkgId;
	}
	private void setIsSet_mblPbokInetBnkgId(boolean value){
		this.isSet_mblPbokInetBnkgId= value;
	}
	/**
	 * 모바일통장인터넷뱅킹ID
	 */
	@XmlTransient
	public String getMblPbokInetBnkgId(){
		return this.mblPbokInetBnkgId;
	}
	
	/**
	 * 모바일통장인터넷뱅킹ID
	 * 
	 * @param mblPbokInetBnkgId 모바일통장인터넷뱅킹ID
	 */
	public void setMblPbokInetBnkgId(String mblPbokInetBnkgId){
		this.mblPbokInetBnkgId= mblPbokInetBnkgId;
		this.setIsSet_mblPbokInetBnkgId(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_npbokIccadIsuDis= false;
	protected final boolean isSet_npbokIccadIsuDis(){
		return this.isSet_npbokIccadIsuDis;
	}
	private void setIsSet_npbokIccadIsuDis(boolean value){
		this.isSet_npbokIccadIsuDis= value;
	}
	/**
	 * 무통장IC카드발급구분
	 */
	@XmlTransient
	public String getNpbokIccadIsuDis(){
		return this.npbokIccadIsuDis;
	}
	
	/**
	 * 무통장IC카드발급구분
	 * 
	 * @param npbokIccadIsuDis 무통장IC카드발급구분
	 */
	public void setNpbokIccadIsuDis(String npbokIccadIsuDis){
		this.npbokIccadIsuDis= npbokIccadIsuDis;
		this.setIsSet_npbokIccadIsuDis(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ideedCd= false;
	protected final boolean isSet_ideedCd(){
		return this.isSet_ideedCd;
	}
	private void setIsSet_ideedCd(boolean value){
		this.isSet_ideedCd= value;
	}
	/**
	 * 중요증서코드
	 */
	@XmlTransient
	public String getIdeedCd(){
		return this.ideedCd;
	}
	
	/**
	 * 중요증서코드
	 * 
	 * @param ideedCd 중요증서코드
	 */
	public void setIdeedCd(String ideedCd){
		this.ideedCd= ideedCd;
		this.setIsSet_ideedCd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pbokEngPrngYn= false;
	protected final boolean isSet_pbokEngPrngYn(){
		return this.isSet_pbokEngPrngYn;
	}
	private void setIsSet_pbokEngPrngYn(boolean value){
		this.isSet_pbokEngPrngYn= value;
	}
	/**
	 * 통장영문인자여부
	 */
	@XmlTransient
	public String getPbokEngPrngYn(){
		return this.pbokEngPrngYn;
	}
	
	/**
	 * 통장영문인자여부
	 * 
	 * @param pbokEngPrngYn 통장영문인자여부
	 */
	public void setPbokEngPrngYn(String pbokEngPrngYn){
		this.pbokEngPrngYn= pbokEngPrngYn;
		this.setIsSet_pbokEngPrngYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_nlDscd= false;
	protected final boolean isSet_nlDscd(){
		return this.isSet_nlDscd;
	}
	private void setIsSet_nlDscd(boolean value){
		this.isSet_nlDscd= value;
	}
	/**
	 * 국가구분코드
	 */
	@XmlTransient
	public String getNlDscd(){
		return this.nlDscd;
	}
	
	/**
	 * 국가구분코드
	 * 
	 * @param nlDscd 국가구분코드
	 */
	public void setNlDscd(String nlDscd){
		this.nlDscd= nlDscd;
		this.setIsSet_nlDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dpsDeedNo= false;
	protected final boolean isSet_dpsDeedNo(){
		return this.isSet_dpsDeedNo;
	}
	private void setIsSet_dpsDeedNo(boolean value){
		this.isSet_dpsDeedNo= value;
	}
	/**
	 * 수신증서번호
	 */
	@XmlTransient
	public String getDpsDeedNo(){
		return this.dpsDeedNo;
	}
	
	/**
	 * 수신증서번호
	 * 
	 * @param dpsDeedNo 수신증서번호
	 */
	public void setDpsDeedNo(String dpsDeedNo){
		this.dpsDeedNo= dpsDeedNo;
		this.setIsSet_dpsDeedNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pbokIssuYn= false;
	protected final boolean isSet_pbokIssuYn(){
		return this.isSet_pbokIssuYn;
	}
	private void setIsSet_pbokIssuYn(boolean value){
		this.isSet_pbokIssuYn= value;
	}
	/**
	 * 통장발행여부
	 */
	@XmlTransient
	public String getPbokIssuYn(){
		return this.pbokIssuYn;
	}
	
	/**
	 * 통장발행여부
	 * 
	 * @param pbokIssuYn 통장발행여부
	 */
	public void setPbokIssuYn(String pbokIssuYn){
		this.pbokIssuYn= pbokIssuYn;
		this.setIsSet_pbokIssuYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_prdGdncPbokPrngYn= false;
	protected final boolean isSet_prdGdncPbokPrngYn(){
		return this.isSet_prdGdncPbokPrngYn;
	}
	private void setIsSet_prdGdncPbokPrngYn(boolean value){
		this.isSet_prdGdncPbokPrngYn= value;
	}
	/**
	 * 상품안내통장인자여부
	 */
	@XmlTransient
	public String getPrdGdncPbokPrngYn(){
		return this.prdGdncPbokPrngYn;
	}
	
	/**
	 * 상품안내통장인자여부
	 * 
	 * @param prdGdncPbokPrngYn 상품안내통장인자여부
	 */
	public void setPrdGdncPbokPrngYn(String prdGdncPbokPrngYn){
		this.prdGdncPbokPrngYn= prdGdncPbokPrngYn;
		this.setIsSet_prdGdncPbokPrngYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_nrsrCnfDocCollYn= false;
	protected final boolean isSet_nrsrCnfDocCollYn(){
		return this.isSet_nrsrCnfDocCollYn;
	}
	private void setIsSet_nrsrCnfDocCollYn(boolean value){
		this.isSet_nrsrCnfDocCollYn= value;
	}
	/**
	 * 비거주자확인서류징구여부
	 */
	@XmlTransient
	public String getNrsrCnfDocCollYn(){
		return this.nrsrCnfDocCollYn;
	}
	
	/**
	 * 비거주자확인서류징구여부
	 * 
	 * @param nrsrCnfDocCollYn 비거주자확인서류징구여부
	 */
	public void setNrsrCnfDocCollYn(String nrsrCnfDocCollYn){
		this.nrsrCnfDocCollYn= nrsrCnfDocCollYn;
		this.setIsSet_nrsrCnfDocCollYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_bokStttPermXtYn= false;
	protected final boolean isSet_bokStttPermXtYn(){
		return this.isSet_bokStttPermXtYn;
	}
	private void setIsSet_bokStttPermXtYn(boolean value){
		this.isSet_bokStttPermXtYn= value;
	}
	/**
	 * 한국은행신고허가제외여부
	 */
	@XmlTransient
	public String getBokStttPermXtYn(){
		return this.bokStttPermXtYn;
	}
	
	/**
	 * 한국은행신고허가제외여부
	 * 
	 * @param bokStttPermXtYn 한국은행신고허가제외여부
	 */
	public void setBokStttPermXtYn(String bokStttPermXtYn){
		this.bokStttPermXtYn= bokStttPermXtYn;
		this.setIsSet_bokStttPermXtYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_nrsrPwnoRgsYn= false;
	protected final boolean isSet_nrsrPwnoRgsYn(){
		return this.isSet_nrsrPwnoRgsYn;
	}
	private void setIsSet_nrsrPwnoRgsYn(boolean value){
		this.isSet_nrsrPwnoRgsYn= value;
	}
	/**
	 * 비거주자비밀번호등록여부
	 */
	@XmlTransient
	public String getNrsrPwnoRgsYn(){
		return this.nrsrPwnoRgsYn;
	}
	
	/**
	 * 비거주자비밀번호등록여부
	 * 
	 * @param nrsrPwnoRgsYn 비거주자비밀번호등록여부
	 */
	public void setNrsrPwnoRgsYn(String nrsrPwnoRgsYn){
		this.nrsrPwnoRgsYn= nrsrPwnoRgsYn;
		this.setIsSet_nrsrPwnoRgsYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_nrsrAccCd= false;
	protected final boolean isSet_nrsrAccCd(){
		return this.isSet_nrsrAccCd;
	}
	private void setIsSet_nrsrAccCd(boolean value){
		this.isSet_nrsrAccCd= value;
	}
	/**
	 * 비거주자계정코드
	 */
	@XmlTransient
	public String getNrsrAccCd(){
		return this.nrsrAccCd;
	}
	
	/**
	 * 비거주자계정코드
	 * 
	 * @param nrsrAccCd 비거주자계정코드
	 */
	public void setNrsrAccCd(String nrsrAccCd){
		this.nrsrAccCd= nrsrAccCd;
		this.setIsSet_nrsrAccCd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_krwDpsAccDscd= false;
	protected final boolean isSet_krwDpsAccDscd(){
		return this.isSet_krwDpsAccDscd;
	}
	private void setIsSet_krwDpsAccDscd(boolean value){
		this.isSet_krwDpsAccDscd= value;
	}
	/**
	 * 원화수신계정구분코드
	 */
	@XmlTransient
	public String getKrwDpsAccDscd(){
		return this.krwDpsAccDscd;
	}
	
	/**
	 * 원화수신계정구분코드
	 * 
	 * @param krwDpsAccDscd 원화수신계정구분코드
	 */
	public void setKrwDpsAccDscd(String krwDpsAccDscd){
		this.krwDpsAccDscd= krwDpsAccDscd;
		this.setIsSet_krwDpsAccDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_nrsrKrwInfwDscd= false;
	protected final boolean isSet_nrsrKrwInfwDscd(){
		return this.isSet_nrsrKrwInfwDscd;
	}
	private void setIsSet_nrsrKrwInfwDscd(boolean value){
		this.isSet_nrsrKrwInfwDscd= value;
	}
	/**
	 * 비거주자원화유입구분코드
	 */
	@XmlTransient
	public String getNrsrKrwInfwDscd(){
		return this.nrsrKrwInfwDscd;
	}
	
	/**
	 * 비거주자원화유입구분코드
	 * 
	 * @param nrsrKrwInfwDscd 비거주자원화유입구분코드
	 */
	public void setNrsrKrwInfwDscd(String nrsrKrwInfwDscd){
		this.nrsrKrwInfwDscd= nrsrKrwInfwDscd;
		this.setIsSet_nrsrKrwInfwDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_txprDscd= false;
	protected final boolean isSet_txprDscd(){
		return this.isSet_txprDscd;
	}
	private void setIsSet_txprDscd(boolean value){
		this.isSet_txprDscd= value;
	}
	/**
	 * 세금우대구분코드
	 */
	@XmlTransient
	public String getTxprDscd(){
		return this.txprDscd;
	}
	
	/**
	 * 세금우대구분코드
	 * 
	 * @param txprDscd 세금우대구분코드
	 */
	public void setTxprDscd(String txprDscd){
		this.txprDscd= txprDscd;
		this.setIsSet_txprDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_txprLmtAm= false;
	protected final boolean isSet_txprLmtAm(){
		return this.isSet_txprLmtAm;
	}
	private void setIsSet_txprLmtAm(boolean value){
		this.isSet_txprLmtAm= value;
	}
	/**
	 * 세금우대한도금액
	 * BigDecimal - Double value setter
	 *
	 * @Param txprLmtAm 세금우대한도금액
	 */
	public void setTxprLmtAm(double txprLmtAm) {
		setTxprLmtAm(BigDecimal.valueOf(txprLmtAm));
	}
	/**
	 * 세금우대한도금액
	 * BigDecimal - Long value setter
	 *
	 * @Param txprLmtAm 세금우대한도금액
	 */
	public void setTxprLmtAm(long txprLmtAm) {
		setTxprLmtAm(BigDecimal.valueOf(txprLmtAm));
	}
	/**
	 * 세금우대한도금액
	 * BigDecimal - String value setter
	 *
	 * @Param txprLmtAm 세금우대한도금액
	 */
	public void setTxprLmtAm(String txprLmtAm) {
		setTxprLmtAm(new BigDecimal(txprLmtAm));
	}
	/**
	 * 세금우대한도금액
	 */
	@XmlTransient
	public BigDecimal getTxprLmtAm(){
		return this.txprLmtAm;
	}
	
	/**
	 * 세금우대한도금액
	 * 
	 * @param txprLmtAm 세금우대한도금액
	 */
	@JsonSetter("txprLmtAm")
	public void setTxprLmtAm(BigDecimal txprLmtAm){
		this.txprLmtAm= txprLmtAm;
		this.setIsSet_txprLmtAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_prchAm= false;
	protected final boolean isSet_prchAm(){
		return this.isSet_prchAm;
	}
	private void setIsSet_prchAm(boolean value){
		this.isSet_prchAm= value;
	}
	/**
	 * 가계수표금액
	 * BigDecimal - Double value setter
	 *
	 * @Param prchAm 가계수표금액
	 */
	public void setPrchAm(double prchAm) {
		setPrchAm(BigDecimal.valueOf(prchAm));
	}
	/**
	 * 가계수표금액
	 * BigDecimal - Long value setter
	 *
	 * @Param prchAm 가계수표금액
	 */
	public void setPrchAm(long prchAm) {
		setPrchAm(BigDecimal.valueOf(prchAm));
	}
	/**
	 * 가계수표금액
	 * BigDecimal - String value setter
	 *
	 * @Param prchAm 가계수표금액
	 */
	public void setPrchAm(String prchAm) {
		setPrchAm(new BigDecimal(prchAm));
	}
	/**
	 * 가계수표금액
	 */
	@XmlTransient
	public BigDecimal getPrchAm(){
		return this.prchAm;
	}
	
	/**
	 * 가계수표금액
	 * 
	 * @param prchAm 가계수표금액
	 */
	@JsonSetter("prchAm")
	public void setPrchAm(BigDecimal prchAm){
		this.prchAm= prchAm;
		this.setIsSet_prchAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pmbilAm= false;
	protected final boolean isSet_pmbilAm(){
		return this.isSet_pmbilAm;
	}
	private void setIsSet_pmbilAm(boolean value){
		this.isSet_pmbilAm= value;
	}
	/**
	 * 약속어음금액
	 * BigDecimal - Double value setter
	 *
	 * @Param pmbilAm 약속어음금액
	 */
	public void setPmbilAm(double pmbilAm) {
		setPmbilAm(BigDecimal.valueOf(pmbilAm));
	}
	/**
	 * 약속어음금액
	 * BigDecimal - Long value setter
	 *
	 * @Param pmbilAm 약속어음금액
	 */
	public void setPmbilAm(long pmbilAm) {
		setPmbilAm(BigDecimal.valueOf(pmbilAm));
	}
	/**
	 * 약속어음금액
	 * BigDecimal - String value setter
	 *
	 * @Param pmbilAm 약속어음금액
	 */
	public void setPmbilAm(String pmbilAm) {
		setPmbilAm(new BigDecimal(pmbilAm));
	}
	/**
	 * 약속어음금액
	 */
	@XmlTransient
	public BigDecimal getPmbilAm(){
		return this.pmbilAm;
	}
	
	/**
	 * 약속어음금액
	 * 
	 * @param pmbilAm 약속어음금액
	 */
	@JsonSetter("pmbilAm")
	public void setPmbilAm(BigDecimal pmbilAm){
		this.pmbilAm= pmbilAm;
		this.setIsSet_pmbilAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cackAm= false;
	protected final boolean isSet_cackAm(){
		return this.isSet_cackAm;
	}
	private void setIsSet_cackAm(boolean value){
		this.isSet_cackAm= value;
	}
	/**
	 * 당좌수표금액
	 * BigDecimal - Double value setter
	 *
	 * @Param cackAm 당좌수표금액
	 */
	public void setCackAm(double cackAm) {
		setCackAm(BigDecimal.valueOf(cackAm));
	}
	/**
	 * 당좌수표금액
	 * BigDecimal - Long value setter
	 *
	 * @Param cackAm 당좌수표금액
	 */
	public void setCackAm(long cackAm) {
		setCackAm(BigDecimal.valueOf(cackAm));
	}
	/**
	 * 당좌수표금액
	 * BigDecimal - String value setter
	 *
	 * @Param cackAm 당좌수표금액
	 */
	public void setCackAm(String cackAm) {
		setCackAm(new BigDecimal(cackAm));
	}
	/**
	 * 당좌수표금액
	 */
	@XmlTransient
	public BigDecimal getCackAm(){
		return this.cackAm;
	}
	
	/**
	 * 당좌수표금액
	 * 
	 * @param cackAm 당좌수표금액
	 */
	@JsonSetter("cackAm")
	public void setCackAm(BigDecimal cackAm){
		this.cackAm= cackAm;
		this.setIsSet_cackAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_bokBchkAm= false;
	protected final boolean isSet_bokBchkAm(){
		return this.isSet_bokBchkAm;
	}
	private void setIsSet_bokBchkAm(boolean value){
		this.isSet_bokBchkAm= value;
	}
	/**
	 * 한국은행자기앞수표금액
	 * BigDecimal - Double value setter
	 *
	 * @Param bokBchkAm 한국은행자기앞수표금액
	 */
	public void setBokBchkAm(double bokBchkAm) {
		setBokBchkAm(BigDecimal.valueOf(bokBchkAm));
	}
	/**
	 * 한국은행자기앞수표금액
	 * BigDecimal - Long value setter
	 *
	 * @Param bokBchkAm 한국은행자기앞수표금액
	 */
	public void setBokBchkAm(long bokBchkAm) {
		setBokBchkAm(BigDecimal.valueOf(bokBchkAm));
	}
	/**
	 * 한국은행자기앞수표금액
	 * BigDecimal - String value setter
	 *
	 * @Param bokBchkAm 한국은행자기앞수표금액
	 */
	public void setBokBchkAm(String bokBchkAm) {
		setBokBchkAm(new BigDecimal(bokBchkAm));
	}
	/**
	 * 한국은행자기앞수표금액
	 */
	@XmlTransient
	public BigDecimal getBokBchkAm(){
		return this.bokBchkAm;
	}
	
	/**
	 * 한국은행자기앞수표금액
	 * 
	 * @param bokBchkAm 한국은행자기앞수표금액
	 */
	@JsonSetter("bokBchkAm")
	public void setBokBchkAm(BigDecimal bokBchkAm){
		this.bokBchkAm= bokBchkAm;
		this.setIsSet_bokBchkAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_etcDeedAm= false;
	protected final boolean isSet_etcDeedAm(){
		return this.isSet_etcDeedAm;
	}
	private void setIsSet_etcDeedAm(boolean value){
		this.isSet_etcDeedAm= value;
	}
	/**
	 * 기타증서금액
	 * BigDecimal - Double value setter
	 *
	 * @Param etcDeedAm 기타증서금액
	 */
	public void setEtcDeedAm(double etcDeedAm) {
		setEtcDeedAm(BigDecimal.valueOf(etcDeedAm));
	}
	/**
	 * 기타증서금액
	 * BigDecimal - Long value setter
	 *
	 * @Param etcDeedAm 기타증서금액
	 */
	public void setEtcDeedAm(long etcDeedAm) {
		setEtcDeedAm(BigDecimal.valueOf(etcDeedAm));
	}
	/**
	 * 기타증서금액
	 * BigDecimal - String value setter
	 *
	 * @Param etcDeedAm 기타증서금액
	 */
	public void setEtcDeedAm(String etcDeedAm) {
		setEtcDeedAm(new BigDecimal(etcDeedAm));
	}
	/**
	 * 기타증서금액
	 */
	@XmlTransient
	public BigDecimal getEtcDeedAm(){
		return this.etcDeedAm;
	}
	
	/**
	 * 기타증서금액
	 * 
	 * @param etcDeedAm 기타증서금액
	 */
	@JsonSetter("etcDeedAm")
	public void setEtcDeedAm(BigDecimal etcDeedAm){
		this.etcDeedAm= etcDeedAm;
		this.setIsSet_etcDeedAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_fncTrnAimCd= false;
	protected final boolean isSet_fncTrnAimCd(){
		return this.isSet_fncTrnAimCd;
	}
	private void setIsSet_fncTrnAimCd(boolean value){
		this.isSet_fncTrnAimCd= value;
	}
	/**
	 * 금융거래목적코드
	 */
	@XmlTransient
	public String getFncTrnAimCd(){
		return this.fncTrnAimCd;
	}
	
	/**
	 * 금융거래목적코드
	 * 
	 * @param fncTrnAimCd 금융거래목적코드
	 */
	public void setFncTrnAimCd(String fncTrnAimCd){
		this.fncTrnAimCd= fncTrnAimCd;
		this.setIsSet_fncTrnAimCd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_trnFdSrcCd= false;
	protected final boolean isSet_trnFdSrcCd(){
		return this.isSet_trnFdSrcCd;
	}
	private void setIsSet_trnFdSrcCd(boolean value){
		this.isSet_trnFdSrcCd= value;
	}
	/**
	 * 거래자금원천코드
	 */
	@XmlTransient
	public String getTrnFdSrcCd(){
		return this.trnFdSrcCd;
	}
	
	/**
	 * 거래자금원천코드
	 * 
	 * @param trnFdSrcCd 거래자금원천코드
	 */
	public void setTrnFdSrcCd(String trnFdSrcCd){
		this.trnFdSrcCd= trnFdSrcCd;
		this.setIsSet_trnFdSrcCd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_fdOwpeYn= false;
	protected final boolean isSet_fdOwpeYn(){
		return this.isSet_fdOwpeYn;
	}
	private void setIsSet_fdOwpeYn(boolean value){
		this.isSet_fdOwpeYn= value;
	}
	/**
	 * 자금소유자여부
	 */
	@XmlTransient
	public String getFdOwpeYn(){
		return this.fdOwpeYn;
	}
	
	/**
	 * 자금소유자여부
	 * 
	 * @param fdOwpeYn 자금소유자여부
	 */
	public void setFdOwpeYn(String fdOwpeYn){
		this.fdOwpeYn= fdOwpeYn;
		this.setIsSet_fdOwpeYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_fncTrnAimTxt= false;
	protected final boolean isSet_fncTrnAimTxt(){
		return this.isSet_fncTrnAimTxt;
	}
	private void setIsSet_fncTrnAimTxt(boolean value){
		this.isSet_fncTrnAimTxt= value;
	}
	/**
	 * 금융거래목적내용
	 */
	@XmlTransient
	public String getFncTrnAimTxt(){
		return this.fncTrnAimTxt;
	}
	
	/**
	 * 금융거래목적내용
	 * 
	 * @param fncTrnAimTxt 금융거래목적내용
	 */
	public void setFncTrnAimTxt(String fncTrnAimTxt){
		this.fncTrnAimTxt= fncTrnAimTxt;
		this.setIsSet_fncTrnAimTxt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_trnFdSrcCdTxt= false;
	protected final boolean isSet_trnFdSrcCdTxt(){
		return this.isSet_trnFdSrcCdTxt;
	}
	private void setIsSet_trnFdSrcCdTxt(boolean value){
		this.isSet_trnFdSrcCdTxt= value;
	}
	/**
	 * 거래자금원천코드내용
	 */
	@XmlTransient
	public String getTrnFdSrcCdTxt(){
		return this.trnFdSrcCdTxt;
	}
	
	/**
	 * 거래자금원천코드내용
	 * 
	 * @param trnFdSrcCdTxt 거래자금원천코드내용
	 */
	public void setTrnFdSrcCdTxt(String trnFdSrcCdTxt){
		this.trnFdSrcCdTxt= trnFdSrcCdTxt;
		this.setIsSet_trnFdSrcCdTxt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ckbilKdcd= false;
	protected final boolean isSet_ckbilKdcd(){
		return this.isSet_ckbilKdcd;
	}
	private void setIsSet_ckbilKdcd(boolean value){
		this.isSet_ckbilKdcd= value;
	}
	/**
	 * 수표어음종류코드
	 */
	@XmlTransient
	public String getCkbilKdcd(){
		return this.ckbilKdcd;
	}
	
	/**
	 * 수표어음종류코드
	 * 
	 * @param ckbilKdcd 수표어음종류코드
	 */
	public void setCkbilKdcd(String ckbilKdcd){
		this.ckbilKdcd= ckbilKdcd;
		this.setIsSet_ckbilKdcd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cacGramRcvYn= false;
	protected final boolean isSet_cacGramRcvYn(){
		return this.isSet_cacGramRcvYn;
	}
	private void setIsSet_cacGramRcvYn(boolean value){
		this.isSet_cacGramRcvYn= value;
	}
	/**
	 * 당좌보증금입금여부
	 */
	@XmlTransient
	public String getCacGramRcvYn(){
		return this.cacGramRcvYn;
	}
	
	/**
	 * 당좌보증금입금여부
	 * 
	 * @param cacGramRcvYn 당좌보증금입금여부
	 */
	public void setCacGramRcvYn(String cacGramRcvYn){
		this.cacGramRcvYn= cacGramRcvYn;
		this.setIsSet_cacGramRcvYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cacGramRcvCrtdIsuYn= false;
	protected final boolean isSet_cacGramRcvCrtdIsuYn(){
		return this.isSet_cacGramRcvCrtdIsuYn;
	}
	private void setIsSet_cacGramRcvCrtdIsuYn(boolean value){
		this.isSet_cacGramRcvCrtdIsuYn= value;
	}
	/**
	 * 당좌보증금입금증명서발급여부
	 */
	@XmlTransient
	public String getCacGramRcvCrtdIsuYn(){
		return this.cacGramRcvCrtdIsuYn;
	}
	
	/**
	 * 당좌보증금입금증명서발급여부
	 * 
	 * @param cacGramRcvCrtdIsuYn 당좌보증금입금증명서발급여부
	 */
	public void setCacGramRcvCrtdIsuYn(String cacGramRcvCrtdIsuYn){
		this.cacGramRcvCrtdIsuYn= cacGramRcvCrtdIsuYn;
		this.setIsSet_cacGramRcvCrtdIsuYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cacGramRcvAm= false;
	protected final boolean isSet_cacGramRcvAm(){
		return this.isSet_cacGramRcvAm;
	}
	private void setIsSet_cacGramRcvAm(boolean value){
		this.isSet_cacGramRcvAm= value;
	}
	/**
	 * 당좌보증금입금금액
	 * BigDecimal - Double value setter
	 *
	 * @Param cacGramRcvAm 당좌보증금입금금액
	 */
	public void setCacGramRcvAm(double cacGramRcvAm) {
		setCacGramRcvAm(BigDecimal.valueOf(cacGramRcvAm));
	}
	/**
	 * 당좌보증금입금금액
	 * BigDecimal - Long value setter
	 *
	 * @Param cacGramRcvAm 당좌보증금입금금액
	 */
	public void setCacGramRcvAm(long cacGramRcvAm) {
		setCacGramRcvAm(BigDecimal.valueOf(cacGramRcvAm));
	}
	/**
	 * 당좌보증금입금금액
	 * BigDecimal - String value setter
	 *
	 * @Param cacGramRcvAm 당좌보증금입금금액
	 */
	public void setCacGramRcvAm(String cacGramRcvAm) {
		setCacGramRcvAm(new BigDecimal(cacGramRcvAm));
	}
	/**
	 * 당좌보증금입금금액
	 */
	@XmlTransient
	public BigDecimal getCacGramRcvAm(){
		return this.cacGramRcvAm;
	}
	
	/**
	 * 당좌보증금입금금액
	 * 
	 * @param cacGramRcvAm 당좌보증금입금금액
	 */
	@JsonSetter("cacGramRcvAm")
	public void setCacGramRcvAm(BigDecimal cacGramRcvAm){
		this.cacGramRcvAm= cacGramRcvAm;
		this.setIsSet_cacGramRcvAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cacGramTrfAm= false;
	protected final boolean isSet_cacGramTrfAm(){
		return this.isSet_cacGramTrfAm;
	}
	private void setIsSet_cacGramTrfAm(boolean value){
		this.isSet_cacGramTrfAm= value;
	}
	/**
	 * 당좌보증금대체금액
	 * BigDecimal - Double value setter
	 *
	 * @Param cacGramTrfAm 당좌보증금대체금액
	 */
	public void setCacGramTrfAm(double cacGramTrfAm) {
		setCacGramTrfAm(BigDecimal.valueOf(cacGramTrfAm));
	}
	/**
	 * 당좌보증금대체금액
	 * BigDecimal - Long value setter
	 *
	 * @Param cacGramTrfAm 당좌보증금대체금액
	 */
	public void setCacGramTrfAm(long cacGramTrfAm) {
		setCacGramTrfAm(BigDecimal.valueOf(cacGramTrfAm));
	}
	/**
	 * 당좌보증금대체금액
	 * BigDecimal - String value setter
	 *
	 * @Param cacGramTrfAm 당좌보증금대체금액
	 */
	public void setCacGramTrfAm(String cacGramTrfAm) {
		setCacGramTrfAm(new BigDecimal(cacGramTrfAm));
	}
	/**
	 * 당좌보증금대체금액
	 */
	@XmlTransient
	public BigDecimal getCacGramTrfAm(){
		return this.cacGramTrfAm;
	}
	
	/**
	 * 당좌보증금대체금액
	 * 
	 * @param cacGramTrfAm 당좌보증금대체금액
	 */
	@JsonSetter("cacGramTrfAm")
	public void setCacGramTrfAm(BigDecimal cacGramTrfAm){
		this.cacGramTrfAm= cacGramTrfAm;
		this.setIsSet_cacGramTrfAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cacGramBchkAm= false;
	protected final boolean isSet_cacGramBchkAm(){
		return this.isSet_cacGramBchkAm;
	}
	private void setIsSet_cacGramBchkAm(boolean value){
		this.isSet_cacGramBchkAm= value;
	}
	/**
	 * 당좌보증금자기앞수표금액
	 * BigDecimal - Double value setter
	 *
	 * @Param cacGramBchkAm 당좌보증금자기앞수표금액
	 */
	public void setCacGramBchkAm(double cacGramBchkAm) {
		setCacGramBchkAm(BigDecimal.valueOf(cacGramBchkAm));
	}
	/**
	 * 당좌보증금자기앞수표금액
	 * BigDecimal - Long value setter
	 *
	 * @Param cacGramBchkAm 당좌보증금자기앞수표금액
	 */
	public void setCacGramBchkAm(long cacGramBchkAm) {
		setCacGramBchkAm(BigDecimal.valueOf(cacGramBchkAm));
	}
	/**
	 * 당좌보증금자기앞수표금액
	 * BigDecimal - String value setter
	 *
	 * @Param cacGramBchkAm 당좌보증금자기앞수표금액
	 */
	public void setCacGramBchkAm(String cacGramBchkAm) {
		setCacGramBchkAm(new BigDecimal(cacGramBchkAm));
	}
	/**
	 * 당좌보증금자기앞수표금액
	 */
	@XmlTransient
	public BigDecimal getCacGramBchkAm(){
		return this.cacGramBchkAm;
	}
	
	/**
	 * 당좌보증금자기앞수표금액
	 * 
	 * @param cacGramBchkAm 당좌보증금자기앞수표금액
	 */
	@JsonSetter("cacGramBchkAm")
	public void setCacGramBchkAm(BigDecimal cacGramBchkAm){
		this.cacGramBchkAm= cacGramBchkAm;
		this.setIsSet_cacGramBchkAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_feeRcvYn= false;
	protected final boolean isSet_feeRcvYn(){
		return this.isSet_feeRcvYn;
	}
	private void setIsSet_feeRcvYn(boolean value){
		this.isSet_feeRcvYn= value;
	}
	/**
	 * 수수료입금여부
	 */
	@XmlTransient
	public String getFeeRcvYn(){
		return this.feeRcvYn;
	}
	
	/**
	 * 수수료입금여부
	 * 
	 * @param feeRcvYn 수수료입금여부
	 */
	public void setFeeRcvYn(String feeRcvYn){
		this.feeRcvYn= feeRcvYn;
		this.setIsSet_feeRcvYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_feeCshtfDscd= false;
	protected final boolean isSet_feeCshtfDscd(){
		return this.isSet_feeCshtfDscd;
	}
	private void setIsSet_feeCshtfDscd(boolean value){
		this.isSet_feeCshtfDscd= value;
	}
	/**
	 * 수수료현금대체구분코드
	 */
	@XmlTransient
	public String getFeeCshtfDscd(){
		return this.feeCshtfDscd;
	}
	
	/**
	 * 수수료현금대체구분코드
	 * 
	 * @param feeCshtfDscd 수수료현금대체구분코드
	 */
	public void setFeeCshtfDscd(String feeCshtfDscd){
		this.feeCshtfDscd= feeCshtfDscd;
		this.setIsSet_feeCshtfDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rctsOupYn= false;
	protected final boolean isSet_rctsOupYn(){
		return this.isSet_rctsOupYn;
	}
	private void setIsSet_rctsOupYn(boolean value){
		this.isSet_rctsOupYn= value;
	}
	/**
	 * 영수증출력여부
	 */
	@XmlTransient
	public String getRctsOupYn(){
		return this.rctsOupYn;
	}
	
	/**
	 * 영수증출력여부
	 * 
	 * @param rctsOupYn 영수증출력여부
	 */
	public void setRctsOupYn(String rctsOupYn){
		this.rctsOupYn= rctsOupYn;
		this.setIsSet_rctsOupYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_feeAm= false;
	protected final boolean isSet_feeAm(){
		return this.isSet_feeAm;
	}
	private void setIsSet_feeAm(boolean value){
		this.isSet_feeAm= value;
	}
	/**
	 * 수수료금액
	 * BigDecimal - Double value setter
	 *
	 * @Param feeAm 수수료금액
	 */
	public void setFeeAm(double feeAm) {
		setFeeAm(BigDecimal.valueOf(feeAm));
	}
	/**
	 * 수수료금액
	 * BigDecimal - Long value setter
	 *
	 * @Param feeAm 수수료금액
	 */
	public void setFeeAm(long feeAm) {
		setFeeAm(BigDecimal.valueOf(feeAm));
	}
	/**
	 * 수수료금액
	 * BigDecimal - String value setter
	 *
	 * @Param feeAm 수수료금액
	 */
	public void setFeeAm(String feeAm) {
		setFeeAm(new BigDecimal(feeAm));
	}
	/**
	 * 수수료금액
	 */
	@XmlTransient
	public BigDecimal getFeeAm(){
		return this.feeAm;
	}
	
	/**
	 * 수수료금액
	 * 
	 * @param feeAm 수수료금액
	 */
	@JsonSetter("feeAm")
	public void setFeeAm(BigDecimal feeAm){
		this.feeAm= feeAm;
		this.setIsSet_feeAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_wdrAcno= false;
	protected final boolean isSet_wdrAcno(){
		return this.isSet_wdrAcno;
	}
	private void setIsSet_wdrAcno(boolean value){
		this.isSet_wdrAcno= value;
	}
	/**
	 * 출금계좌번호
	 */
	@XmlTransient
	public String getWdrAcno(){
		return this.wdrAcno;
	}
	
	/**
	 * 출금계좌번호
	 * 
	 * @param wdrAcno 출금계좌번호
	 */
	public void setWdrAcno(String wdrAcno){
		this.wdrAcno= wdrAcno;
		this.setIsSet_wdrAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_encyWdrActPwno= false;
	protected final boolean isSet_encyWdrActPwno(){
		return this.isSet_encyWdrActPwno;
	}
	private void setIsSet_encyWdrActPwno(boolean value){
		this.isSet_encyWdrActPwno= value;
	}
	/**
	 * 암호화출금계좌비밀번호
	 */
	@XmlTransient
	public String getEncyWdrActPwno(){
		return this.encyWdrActPwno;
	}
	
	/**
	 * 암호화출금계좌비밀번호
	 * 
	 * @param encyWdrActPwno 암호화출금계좌비밀번호
	 */
	public void setEncyWdrActPwno(String encyWdrActPwno){
		this.encyWdrActPwno= encyWdrActPwno;
		this.setIsSet_encyWdrActPwno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_xprRcvAcno= false;
	protected final boolean isSet_xprRcvAcno(){
		return this.isSet_xprRcvAcno;
	}
	private void setIsSet_xprRcvAcno(boolean value){
		this.isSet_xprRcvAcno= value;
	}
	/**
	 * 만기입금계좌번호
	 */
	@XmlTransient
	public String getXprRcvAcno(){
		return this.xprRcvAcno;
	}
	
	/**
	 * 만기입금계좌번호
	 * 
	 * @param xprRcvAcno 만기입금계좌번호
	 */
	public void setXprRcvAcno(String xprRcvAcno){
		this.xprRcvAcno= xprRcvAcno;
		this.setIsSet_xprRcvAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_irprmTgt1Dscd= false;
	protected final boolean isSet_irprmTgt1Dscd(){
		return this.isSet_irprmTgt1Dscd;
	}
	private void setIsSet_irprmTgt1Dscd(boolean value){
		this.isSet_irprmTgt1Dscd= value;
	}
	/**
	 * 금리우대대상1구분코드
	 */
	@XmlTransient
	public Integer getIrprmTgt1Dscd(){
		return this.irprmTgt1Dscd;
	}
	
	/**
	 * 금리우대대상1구분코드
	 * 
	 * @param irprmTgt1Dscd 금리우대대상1구분코드
	 */
	public void setIrprmTgt1Dscd(Integer irprmTgt1Dscd){
		this.irprmTgt1Dscd= irprmTgt1Dscd;
		this.setIsSet_irprmTgt1Dscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_irprmTgt2Dscd= false;
	protected final boolean isSet_irprmTgt2Dscd(){
		return this.isSet_irprmTgt2Dscd;
	}
	private void setIsSet_irprmTgt2Dscd(boolean value){
		this.isSet_irprmTgt2Dscd= value;
	}
	/**
	 * 금리우대대상2구분코드
	 */
	@XmlTransient
	public Integer getIrprmTgt2Dscd(){
		return this.irprmTgt2Dscd;
	}
	
	/**
	 * 금리우대대상2구분코드
	 * 
	 * @param irprmTgt2Dscd 금리우대대상2구분코드
	 */
	public void setIrprmTgt2Dscd(Integer irprmTgt2Dscd){
		this.irprmTgt2Dscd= irprmTgt2Dscd;
		this.setIsSet_irprmTgt2Dscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_irprmTgt3Dscd= false;
	protected final boolean isSet_irprmTgt3Dscd(){
		return this.isSet_irprmTgt3Dscd;
	}
	private void setIsSet_irprmTgt3Dscd(boolean value){
		this.isSet_irprmTgt3Dscd= value;
	}
	/**
	 * 금리우대대상3구분코드
	 */
	@XmlTransient
	public Integer getIrprmTgt3Dscd(){
		return this.irprmTgt3Dscd;
	}
	
	/**
	 * 금리우대대상3구분코드
	 * 
	 * @param irprmTgt3Dscd 금리우대대상3구분코드
	 */
	public void setIrprmTgt3Dscd(Integer irprmTgt3Dscd){
		this.irprmTgt3Dscd= irprmTgt3Dscd;
		this.setIsSet_irprmTgt3Dscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_irprmTgt4Dscd= false;
	protected final boolean isSet_irprmTgt4Dscd(){
		return this.isSet_irprmTgt4Dscd;
	}
	private void setIsSet_irprmTgt4Dscd(boolean value){
		this.isSet_irprmTgt4Dscd= value;
	}
	/**
	 * 금리우대대상4구분코드
	 */
	@XmlTransient
	public Integer getIrprmTgt4Dscd(){
		return this.irprmTgt4Dscd;
	}
	
	/**
	 * 금리우대대상4구분코드
	 * 
	 * @param irprmTgt4Dscd 금리우대대상4구분코드
	 */
	public void setIrprmTgt4Dscd(Integer irprmTgt4Dscd){
		this.irprmTgt4Dscd= irprmTgt4Dscd;
		this.setIsSet_irprmTgt4Dscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_irprmTgt5Dscd= false;
	protected final boolean isSet_irprmTgt5Dscd(){
		return this.isSet_irprmTgt5Dscd;
	}
	private void setIsSet_irprmTgt5Dscd(boolean value){
		this.isSet_irprmTgt5Dscd= value;
	}
	/**
	 * 금리우대대상5구분코드
	 */
	@XmlTransient
	public Integer getIrprmTgt5Dscd(){
		return this.irprmTgt5Dscd;
	}
	
	/**
	 * 금리우대대상5구분코드
	 * 
	 * @param irprmTgt5Dscd 금리우대대상5구분코드
	 */
	public void setIrprmTgt5Dscd(Integer irprmTgt5Dscd){
		this.irprmTgt5Dscd= irprmTgt5Dscd;
		this.setIsSet_irprmTgt5Dscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_irprmTgt6Dscd= false;
	protected final boolean isSet_irprmTgt6Dscd(){
		return this.isSet_irprmTgt6Dscd;
	}
	private void setIsSet_irprmTgt6Dscd(boolean value){
		this.isSet_irprmTgt6Dscd= value;
	}
	/**
	 * 금리우대대상6구분코드
	 */
	@XmlTransient
	public Integer getIrprmTgt6Dscd(){
		return this.irprmTgt6Dscd;
	}
	
	/**
	 * 금리우대대상6구분코드
	 * 
	 * @param irprmTgt6Dscd 금리우대대상6구분코드
	 */
	public void setIrprmTgt6Dscd(Integer irprmTgt6Dscd){
		this.irprmTgt6Dscd= irprmTgt6Dscd;
		this.setIsSet_irprmTgt6Dscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_xprPrcMecd= false;
	protected final boolean isSet_xprPrcMecd(){
		return this.isSet_xprPrcMecd;
	}
	private void setIsSet_xprPrcMecd(boolean value){
		this.isSet_xprPrcMecd= value;
	}
	/**
	 * 만기처리방법코드
	 */
	@XmlTransient
	public String getXprPrcMecd(){
		return this.xprPrcMecd;
	}
	
	/**
	 * 만기처리방법코드
	 * 
	 * @param xprPrcMecd 만기처리방법코드
	 */
	public void setXprPrcMecd(String xprPrcMecd){
		this.xprPrcMecd= xprPrcMecd;
		this.setIsSet_xprPrcMecd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dntnAtsAcno= false;
	protected final boolean isSet_dntnAtsAcno(){
		return this.isSet_dntnAtsAcno;
	}
	private void setIsSet_dntnAtsAcno(boolean value){
		this.isSet_dntnAtsAcno= value;
	}
	/**
	 * 기부자동이체계좌번호
	 */
	@XmlTransient
	public String getDntnAtsAcno(){
		return this.dntnAtsAcno;
	}
	
	/**
	 * 기부자동이체계좌번호
	 * 
	 * @param dntnAtsAcno 기부자동이체계좌번호
	 */
	public void setDntnAtsAcno(String dntnAtsAcno){
		this.dntnAtsAcno= dntnAtsAcno;
		this.setIsSet_dntnAtsAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_newFdDscd= false;
	protected final boolean isSet_newFdDscd(){
		return this.isSet_newFdDscd;
	}
	private void setIsSet_newFdDscd(boolean value){
		this.isSet_newFdDscd= value;
	}
	/**
	 * 신규자금구분코드
	 */
	@XmlTransient
	public String getNewFdDscd(){
		return this.newFdDscd;
	}
	
	/**
	 * 신규자금구분코드
	 * 
	 * @param newFdDscd 신규자금구분코드
	 */
	public void setNewFdDscd(String newFdDscd){
		this.newFdDscd= newFdDscd;
		this.setIsSet_newFdDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_spcfMonyTrtAcno= false;
	protected final boolean isSet_spcfMonyTrtAcno(){
		return this.isSet_spcfMonyTrtAcno;
	}
	private void setIsSet_spcfMonyTrtAcno(boolean value){
		this.isSet_spcfMonyTrtAcno= value;
	}
	/**
	 * 특정금전신탁계좌번호
	 */
	@XmlTransient
	public String getSpcfMonyTrtAcno(){
		return this.spcfMonyTrtAcno;
	}
	
	/**
	 * 특정금전신탁계좌번호
	 * 
	 * @param spcfMonyTrtAcno 특정금전신탁계좌번호
	 */
	public void setSpcfMonyTrtAcno(String spcfMonyTrtAcno){
		this.spcfMonyTrtAcno= spcfMonyTrtAcno;
		this.setIsSet_spcfMonyTrtAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pnsnPayTemEstYn= false;
	protected final boolean isSet_pnsnPayTemEstYn(){
		return this.isSet_pnsnPayTemEstYn;
	}
	private void setIsSet_pnsnPayTemEstYn(boolean value){
		this.isSet_pnsnPayTemEstYn= value;
	}
	/**
	 * 연금지급기간설정여부
	 */
	@XmlTransient
	public String getPnsnPayTemEstYn(){
		return this.pnsnPayTemEstYn;
	}
	
	/**
	 * 연금지급기간설정여부
	 * 
	 * @param pnsnPayTemEstYn 연금지급기간설정여부
	 */
	public void setPnsnPayTemEstYn(String pnsnPayTemEstYn){
		this.pnsnPayTemEstYn= pnsnPayTemEstYn;
		this.setIsSet_pnsnPayTemEstYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pnsnPayCtrtmYcnt= false;
	protected final boolean isSet_pnsnPayCtrtmYcnt(){
		return this.isSet_pnsnPayCtrtmYcnt;
	}
	private void setIsSet_pnsnPayCtrtmYcnt(boolean value){
		this.isSet_pnsnPayCtrtmYcnt= value;
	}
	/**
	 * 연금지급계약기간년수
	 */
	@XmlTransient
	public Integer getPnsnPayCtrtmYcnt(){
		return this.pnsnPayCtrtmYcnt;
	}
	
	/**
	 * 연금지급계약기간년수
	 * 
	 * @param pnsnPayCtrtmYcnt 연금지급계약기간년수
	 */
	public void setPnsnPayCtrtmYcnt(Integer pnsnPayCtrtmYcnt){
		this.pnsnPayCtrtmYcnt= pnsnPayCtrtmYcnt;
		this.setIsSet_pnsnPayCtrtmYcnt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pnsnPayCycd= false;
	protected final boolean isSet_pnsnPayCycd(){
		return this.isSet_pnsnPayCycd;
	}
	private void setIsSet_pnsnPayCycd(boolean value){
		this.isSet_pnsnPayCycd= value;
	}
	/**
	 * 연금지급주기코드
	 */
	@XmlTransient
	public String getPnsnPayCycd(){
		return this.pnsnPayCycd;
	}
	
	/**
	 * 연금지급주기코드
	 * 
	 * @param pnsnPayCycd 연금지급주기코드
	 */
	public void setPnsnPayCycd(String pnsnPayCycd){
		this.pnsnPayCycd= pnsnPayCycd;
		this.setIsSet_pnsnPayCycd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_lnoActPbokIssuYn= false;
	protected final boolean isSet_lnoActPbokIssuYn(){
		return this.isSet_lnoActPbokIssuYn;
	}
	private void setIsSet_lnoActPbokIssuYn(boolean value){
		this.isSet_lnoActPbokIssuYn= value;
	}
	/**
	 * 다수계좌통장발행여부
	 */
	@XmlTransient
	public String getLnoActPbokIssuYn(){
		return this.lnoActPbokIssuYn;
	}
	
	/**
	 * 다수계좌통장발행여부
	 * 
	 * @param lnoActPbokIssuYn 다수계좌통장발행여부
	 */
	public void setLnoActPbokIssuYn(String lnoActPbokIssuYn){
		this.lnoActPbokIssuYn= lnoActPbokIssuYn;
		this.setIsSet_lnoActPbokIssuYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_bscAcno= false;
	protected final boolean isSet_bscAcno(){
		return this.isSet_bscAcno;
	}
	private void setIsSet_bscAcno(boolean value){
		this.isSet_bscAcno= value;
	}
	/**
	 * 기본계좌번호
	 */
	@XmlTransient
	public String getBscAcno(){
		return this.bscAcno;
	}
	
	/**
	 * 기본계좌번호
	 * 
	 * @param bscAcno 기본계좌번호
	 */
	public void setBscAcno(String bscAcno){
		this.bscAcno= bscAcno;
		this.setIsSet_bscAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_oldAtrbXtRncd= false;
	protected final boolean isSet_oldAtrbXtRncd(){
		return this.isSet_oldAtrbXtRncd;
	}
	private void setIsSet_oldAtrbXtRncd(boolean value){
		this.isSet_oldAtrbXtRncd= value;
	}
	/**
	 * 구속성제외사유코드
	 */
	@XmlTransient
	public String getOldAtrbXtRncd(){
		return this.oldAtrbXtRncd;
	}
	
	/**
	 * 구속성제외사유코드
	 * 
	 * @param oldAtrbXtRncd 구속성제외사유코드
	 */
	public void setOldAtrbXtRncd(String oldAtrbXtRncd){
		this.oldAtrbXtRncd= oldAtrbXtRncd;
		this.setIsSet_oldAtrbXtRncd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cpblChckTgtYn= false;
	protected final boolean isSet_cpblChckTgtYn(){
		return this.isSet_cpblChckTgtYn;
	}
	private void setIsSet_cpblChckTgtYn(boolean value){
		this.isSet_cpblChckTgtYn= value;
	}
	/**
	 * 구속성예금점검대상여부
	 */
	@XmlTransient
	public String getCpblChckTgtYn(){
		return this.cpblChckTgtYn;
	}
	
	/**
	 * 구속성예금점검대상여부
	 * 
	 * @param cpblChckTgtYn 구속성예금점검대상여부
	 */
	public void setCpblChckTgtYn(String cpblChckTgtYn){
		this.cpblChckTgtYn= cpblChckTgtYn;
		this.setIsSet_cpblChckTgtYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rpcmDpstTgtYn= false;
	protected final boolean isSet_rpcmDpstTgtYn(){
		return this.isSet_rpcmDpstTgtYn;
	}
	private void setIsSet_rpcmDpstTgtYn(boolean value){
		this.isSet_rpcmDpstTgtYn= value;
	}
	/**
	 * 대표자구속성예금대상여부
	 */
	@XmlTransient
	public String getRpcmDpstTgtYn(){
		return this.rpcmDpstTgtYn;
	}
	
	/**
	 * 대표자구속성예금대상여부
	 * 
	 * @param rpcmDpstTgtYn 대표자구속성예금대상여부
	 */
	public void setRpcmDpstTgtYn(String rpcmDpstTgtYn){
		this.rpcmDpstTgtYn= rpcmDpstTgtYn;
		this.setIsSet_rpcmDpstTgtYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_oldAtrbCeoRgsrDrtrYn= false;
	protected final boolean isSet_oldAtrbCeoRgsrDrtrYn(){
		return this.isSet_oldAtrbCeoRgsrDrtrYn;
	}
	private void setIsSet_oldAtrbCeoRgsrDrtrYn(boolean value){
		this.isSet_oldAtrbCeoRgsrDrtrYn= value;
	}
	/**
	 * 구속성대표이사등기임원여부
	 */
	@XmlTransient
	public String getOldAtrbCeoRgsrDrtrYn(){
		return this.oldAtrbCeoRgsrDrtrYn;
	}
	
	/**
	 * 구속성대표이사등기임원여부
	 * 
	 * @param oldAtrbCeoRgsrDrtrYn 구속성대표이사등기임원여부
	 */
	public void setOldAtrbCeoRgsrDrtrYn(String oldAtrbCeoRgsrDrtrYn){
		this.oldAtrbCeoRgsrDrtrYn= oldAtrbCeoRgsrDrtrYn;
		this.setIsSet_oldAtrbCeoRgsrDrtrYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_oldAtrbApvNo= false;
	protected final boolean isSet_oldAtrbApvNo(){
		return this.isSet_oldAtrbApvNo;
	}
	private void setIsSet_oldAtrbApvNo(boolean value){
		this.isSet_oldAtrbApvNo= value;
	}
	/**
	 * 구속성승인번호
	 */
	@XmlTransient
	public String getOldAtrbApvNo(){
		return this.oldAtrbApvNo;
	}
	
	/**
	 * 구속성승인번호
	 * 
	 * @param oldAtrbApvNo 구속성승인번호
	 */
	public void setOldAtrbApvNo(String oldAtrbApvNo){
		this.oldAtrbApvNo= oldAtrbApvNo;
		this.setIsSet_oldAtrbApvNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rdepAcno= false;
	protected final boolean isSet_rdepAcno(){
		return this.isSet_rdepAcno;
	}
	private void setIsSet_rdepAcno(boolean value){
		this.isSet_rdepAcno= value;
	}
	/**
	 * 재예치계좌번호
	 */
	@XmlTransient
	public String getRdepAcno(){
		return this.rdepAcno;
	}
	
	/**
	 * 재예치계좌번호
	 * 
	 * @param rdepAcno 재예치계좌번호
	 */
	public void setRdepAcno(String rdepAcno){
		this.rdepAcno= rdepAcno;
		this.setIsSet_rdepAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_oldAtrbApvRsn= false;
	protected final boolean isSet_oldAtrbApvRsn(){
		return this.isSet_oldAtrbApvRsn;
	}
	private void setIsSet_oldAtrbApvRsn(boolean value){
		this.isSet_oldAtrbApvRsn= value;
	}
	/**
	 * 구속성승인사유
	 */
	@XmlTransient
	public String getOldAtrbApvRsn(){
		return this.oldAtrbApvRsn;
	}
	
	/**
	 * 구속성승인사유
	 * 
	 * @param oldAtrbApvRsn 구속성승인사유
	 */
	public void setOldAtrbApvRsn(String oldAtrbApvRsn){
		this.oldAtrbApvRsn= oldAtrbApvRsn;
		this.setIsSet_oldAtrbApvRsn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_oldAtrbChckTim= false;
	protected final boolean isSet_oldAtrbChckTim(){
		return this.isSet_oldAtrbChckTim;
	}
	private void setIsSet_oldAtrbChckTim(boolean value){
		this.isSet_oldAtrbChckTim= value;
	}
	/**
	 * 구속성점검시간
	 */
	@XmlTransient
	public String getOldAtrbChckTim(){
		return this.oldAtrbChckTim;
	}
	
	/**
	 * 구속성점검시간
	 * 
	 * @param oldAtrbChckTim 구속성점검시간
	 */
	public void setOldAtrbChckTim(String oldAtrbChckTim){
		this.oldAtrbChckTim= oldAtrbChckTim;
		this.setIsSet_oldAtrbChckTim(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ccadRsltInqYn= false;
	protected final boolean isSet_ccadRsltInqYn(){
		return this.isSet_ccadRsltInqYn;
	}
	private void setIsSet_ccadRsltInqYn(boolean value){
		this.isSet_ccadRsltInqYn= value;
	}
	/**
	 * 신용카드실적조회여부
	 */
	@XmlTransient
	public String getCcadRsltInqYn(){
		return this.ccadRsltInqYn;
	}
	
	/**
	 * 신용카드실적조회여부
	 * 
	 * @param ccadRsltInqYn 신용카드실적조회여부
	 */
	public void setCcadRsltInqYn(String ccadRsltInqYn){
		this.ccadRsltInqYn= ccadRsltInqYn;
		this.setIsSet_ccadRsltInqYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_tbkCcadHldgYn= false;
	protected final boolean isSet_tbkCcadHldgYn(){
		return this.isSet_tbkCcadHldgYn;
	}
	private void setIsSet_tbkCcadHldgYn(boolean value){
		this.isSet_tbkCcadHldgYn= value;
	}
	/**
	 * 당행신용카드보유여부
	 */
	@XmlTransient
	public String getTbkCcadHldgYn(){
		return this.tbkCcadHldgYn;
	}
	
	/**
	 * 당행신용카드보유여부
	 * 
	 * @param tbkCcadHldgYn 당행신용카드보유여부
	 */
	public void setTbkCcadHldgYn(String tbkCcadHldgYn){
		this.tbkCcadHldgYn= tbkCcadHldgYn;
		this.setIsSet_tbkCcadHldgYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cadStlActTbkYn= false;
	protected final boolean isSet_cadStlActTbkYn(){
		return this.isSet_cadStlActTbkYn;
	}
	private void setIsSet_cadStlActTbkYn(boolean value){
		this.isSet_cadStlActTbkYn= value;
	}
	/**
	 * 카드결제계좌당행여부
	 */
	@XmlTransient
	public String getCadStlActTbkYn(){
		return this.cadStlActTbkYn;
	}
	
	/**
	 * 카드결제계좌당행여부
	 * 
	 * @param cadStlActTbkYn 카드결제계좌당행여부
	 */
	public void setCadStlActTbkYn(String cadStlActTbkYn){
		this.cadStlActTbkYn= cadStlActTbkYn;
		this.setIsSet_cadStlActTbkYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ccadBasRsltAm= false;
	protected final boolean isSet_ccadBasRsltAm(){
		return this.isSet_ccadBasRsltAm;
	}
	private void setIsSet_ccadBasRsltAm(boolean value){
		this.isSet_ccadBasRsltAm= value;
	}
	/**
	 * 신용카드기준실적금액
	 * BigDecimal - Double value setter
	 *
	 * @Param ccadBasRsltAm 신용카드기준실적금액
	 */
	public void setCcadBasRsltAm(double ccadBasRsltAm) {
		setCcadBasRsltAm(BigDecimal.valueOf(ccadBasRsltAm));
	}
	/**
	 * 신용카드기준실적금액
	 * BigDecimal - Long value setter
	 *
	 * @Param ccadBasRsltAm 신용카드기준실적금액
	 */
	public void setCcadBasRsltAm(long ccadBasRsltAm) {
		setCcadBasRsltAm(BigDecimal.valueOf(ccadBasRsltAm));
	}
	/**
	 * 신용카드기준실적금액
	 * BigDecimal - String value setter
	 *
	 * @Param ccadBasRsltAm 신용카드기준실적금액
	 */
	public void setCcadBasRsltAm(String ccadBasRsltAm) {
		setCcadBasRsltAm(new BigDecimal(ccadBasRsltAm));
	}
	/**
	 * 신용카드기준실적금액
	 */
	@XmlTransient
	public BigDecimal getCcadBasRsltAm(){
		return this.ccadBasRsltAm;
	}
	
	/**
	 * 신용카드기준실적금액
	 * 
	 * @param ccadBasRsltAm 신용카드기준실적금액
	 */
	@JsonSetter("ccadBasRsltAm")
	public void setCcadBasRsltAm(BigDecimal ccadBasRsltAm){
		this.ccadBasRsltAm= ccadBasRsltAm;
		this.setIsSet_ccadBasRsltAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_utzRsltBasStaDt= false;
	protected final boolean isSet_utzRsltBasStaDt(){
		return this.isSet_utzRsltBasStaDt;
	}
	private void setIsSet_utzRsltBasStaDt(boolean value){
		this.isSet_utzRsltBasStaDt= value;
	}
	/**
	 * 이용실적기준시작일자
	 */
	@XmlTransient
	public String getUtzRsltBasStaDt(){
		return this.utzRsltBasStaDt;
	}
	
	/**
	 * 이용실적기준시작일자
	 * 
	 * @param utzRsltBasStaDt 이용실적기준시작일자
	 */
	public void setUtzRsltBasStaDt(String utzRsltBasStaDt){
		this.utzRsltBasStaDt= utzRsltBasStaDt;
		this.setIsSet_utzRsltBasStaDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_utzRsltBasEndDt= false;
	protected final boolean isSet_utzRsltBasEndDt(){
		return this.isSet_utzRsltBasEndDt;
	}
	private void setIsSet_utzRsltBasEndDt(boolean value){
		this.isSet_utzRsltBasEndDt= value;
	}
	/**
	 * 이용실적기준종료일자
	 */
	@XmlTransient
	public String getUtzRsltBasEndDt(){
		return this.utzRsltBasEndDt;
	}
	
	/**
	 * 이용실적기준종료일자
	 * 
	 * @param utzRsltBasEndDt 이용실적기준종료일자
	 */
	public void setUtzRsltBasEndDt(String utzRsltBasEndDt){
		this.utzRsltBasEndDt= utzRsltBasEndDt;
		this.setIsSet_utzRsltBasEndDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_utzRsltInqTim= false;
	protected final boolean isSet_utzRsltInqTim(){
		return this.isSet_utzRsltInqTim;
	}
	private void setIsSet_utzRsltInqTim(boolean value){
		this.isSet_utzRsltInqTim= value;
	}
	/**
	 * 이용실적조회시간
	 */
	@XmlTransient
	public String getUtzRsltInqTim(){
		return this.utzRsltInqTim;
	}
	
	/**
	 * 이용실적조회시간
	 * 
	 * @param utzRsltInqTim 이용실적조회시간
	 */
	public void setUtzRsltInqTim(String utzRsltInqTim){
		this.utzRsltInqTim= utzRsltInqTim;
		this.setIsSet_utzRsltInqTim(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_amfRispeDis= false;
	protected final boolean isSet_amfRispeDis(){
		return this.isSet_amfRispeDis;
	}
	private void setIsSet_amfRispeDis(boolean value){
		this.isSet_amfRispeDis= value;
	}
	/**
	 * 상조피보험자구분
	 */
	@XmlTransient
	public String getAmfRispeDis(){
		return this.amfRispeDis;
	}
	
	/**
	 * 상조피보험자구분
	 * 
	 * @param amfRispeDis 상조피보험자구분
	 */
	public void setAmfRispeDis(String amfRispeDis){
		this.amfRispeDis= amfRispeDis;
		this.setIsSet_amfRispeDis(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_amfRispeFnm= false;
	protected final boolean isSet_amfRispeFnm(){
		return this.isSet_amfRispeFnm;
	}
	private void setIsSet_amfRispeFnm(boolean value){
		this.isSet_amfRispeFnm= value;
	}
	/**
	 * 상조피보험자성명
	 */
	@XmlTransient
	public String getAmfRispeFnm(){
		return this.amfRispeFnm;
	}
	
	/**
	 * 상조피보험자성명
	 * 
	 * @param amfRispeFnm 상조피보험자성명
	 */
	public void setAmfRispeFnm(String amfRispeFnm){
		this.amfRispeFnm= amfRispeFnm;
		this.setIsSet_amfRispeFnm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_amfRispeRrno= false;
	protected final boolean isSet_amfRispeRrno(){
		return this.isSet_amfRispeRrno;
	}
	private void setIsSet_amfRispeRrno(boolean value){
		this.isSet_amfRispeRrno= value;
	}
	/**
	 * 상조피보험자주민등록번호
	 */
	@XmlTransient
	public String getAmfRispeRrno(){
		return this.amfRispeRrno;
	}
	
	/**
	 * 상조피보험자주민등록번호
	 * 
	 * @param amfRispeRrno 상조피보험자주민등록번호
	 */
	public void setAmfRispeRrno(String amfRispeRrno){
		this.amfRispeRrno= amfRispeRrno;
		this.setIsSet_amfRispeRrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_amfRispeCnad= false;
	protected final boolean isSet_amfRispeCnad(){
		return this.isSet_amfRispeCnad;
	}
	private void setIsSet_amfRispeCnad(boolean value){
		this.isSet_amfRispeCnad= value;
	}
	/**
	 * 상조피보험자연락처
	 */
	@XmlTransient
	public String getAmfRispeCnad(){
		return this.amfRispeCnad;
	}
	
	/**
	 * 상조피보험자연락처
	 * 
	 * @param amfRispeCnad 상조피보험자연락처
	 */
	public void setAmfRispeCnad(String amfRispeCnad){
		this.amfRispeCnad= amfRispeCnad;
		this.setIsSet_amfRispeCnad(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_anrvNprcYn= false;
	protected final boolean isSet_anrvNprcYn(){
		return this.isSet_anrvNprcYn;
	}
	private void setIsSet_anrvNprcYn(boolean value){
		this.isSet_anrvNprcYn= value;
	}
	/**
	 * 세입미처리여부
	 */
	@XmlTransient
	public String getAnrvNprcYn(){
		return this.anrvNprcYn;
	}
	
	/**
	 * 세입미처리여부
	 * 
	 * @param anrvNprcYn 세입미처리여부
	 */
	public void setAnrvNprcYn(String anrvNprcYn){
		this.anrvNprcYn= anrvNprcYn;
		this.setIsSet_anrvNprcYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pbamAcno= false;
	protected final boolean isSet_pbamAcno(){
		return this.isSet_pbamAcno;
	}
	private void setIsSet_pbamAcno(boolean value){
		this.isSet_pbamAcno= value;
	}
	/**
	 * 공금예금계좌번호
	 */
	@XmlTransient
	public String getPbamAcno(){
		return this.pbamAcno;
	}
	
	/**
	 * 공금예금계좌번호
	 * 
	 * @param pbamAcno 공금예금계좌번호
	 */
	public void setPbamAcno(String pbamAcno){
		this.pbamAcno= pbamAcno;
		this.setIsSet_pbamAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pbamSnnmAcno= false;
	protected final boolean isSet_pbamSnnmAcno(){
		return this.isSet_pbamSnnmAcno;
	}
	private void setIsSet_pbamSnnmAcno(boolean value){
		this.isSet_pbamSnnmAcno= value;
	}
	/**
	 * 공금예금단수계좌번호
	 */
	@XmlTransient
	public String getPbamSnnmAcno(){
		return this.pbamSnnmAcno;
	}
	
	/**
	 * 공금예금단수계좌번호
	 * 
	 * @param pbamSnnmAcno 공금예금단수계좌번호
	 */
	public void setPbamSnnmAcno(String pbamSnnmAcno){
		this.pbamSnnmAcno= pbamSnnmAcno;
		this.setIsSet_pbamSnnmAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pmnyTrnUnqNo= false;
	protected final boolean isSet_pmnyTrnUnqNo(){
		return this.isSet_pmnyTrnUnqNo;
	}
	private void setIsSet_pmnyTrnUnqNo(boolean value){
		this.isSet_pmnyTrnUnqNo= value;
	}
	/**
	 * 공금거래고유번호
	 */
	@XmlTransient
	public String getPmnyTrnUnqNo(){
		return this.pmnyTrnUnqNo;
	}
	
	/**
	 * 공금거래고유번호
	 * 
	 * @param pmnyTrnUnqNo 공금거래고유번호
	 */
	public void setPmnyTrnUnqNo(String pmnyTrnUnqNo){
		this.pmnyTrnUnqNo= pmnyTrnUnqNo;
		this.setIsSet_pmnyTrnUnqNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ctrtmMcn= false;
	protected final boolean isSet_ctrtmMcn(){
		return this.isSet_ctrtmMcn;
	}
	private void setIsSet_ctrtmMcn(boolean value){
		this.isSet_ctrtmMcn= value;
	}
	/**
	 * 계약기간월수
	 */
	@XmlTransient
	public Integer getCtrtmMcn(){
		return this.ctrtmMcn;
	}
	
	/**
	 * 계약기간월수
	 * 
	 * @param ctrtmMcn 계약기간월수
	 */
	public void setCtrtmMcn(Integer ctrtmMcn){
		this.ctrtmMcn= ctrtmMcn;
		this.setIsSet_ctrtmMcn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ctrtmDcnt= false;
	protected final boolean isSet_ctrtmDcnt(){
		return this.isSet_ctrtmDcnt;
	}
	private void setIsSet_ctrtmDcnt(boolean value){
		this.isSet_ctrtmDcnt= value;
	}
	/**
	 * 계약기간일수
	 */
	@XmlTransient
	public Integer getCtrtmDcnt(){
		return this.ctrtmDcnt;
	}
	
	/**
	 * 계약기간일수
	 * 
	 * @param ctrtmDcnt 계약기간일수
	 */
	public void setCtrtmDcnt(Integer ctrtmDcnt){
		this.ctrtmDcnt= ctrtmDcnt;
		this.setIsSet_ctrtmDcnt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_xprDt= false;
	protected final boolean isSet_xprDt(){
		return this.isSet_xprDt;
	}
	private void setIsSet_xprDt(boolean value){
		this.isSet_xprDt= value;
	}
	/**
	 * 만기일자
	 */
	@XmlTransient
	public String getXprDt(){
		return this.xprDt;
	}
	
	/**
	 * 만기일자
	 * 
	 * @param xprDt 만기일자
	 */
	public void setXprDt(String xprDt){
		this.xprDt= xprDt;
		this.setIsSet_xprDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rcknDt= false;
	protected final boolean isSet_rcknDt(){
		return this.isSet_rcknDt;
	}
	private void setIsSet_rcknDt(boolean value){
		this.isSet_rcknDt= value;
	}
	/**
	 * 기산일자
	 */
	@XmlTransient
	public String getRcknDt(){
		return this.rcknDt;
	}
	
	/**
	 * 기산일자
	 * 
	 * @param rcknDt 기산일자
	 */
	public void setRcknDt(String rcknDt){
		this.rcknDt= rcknDt;
		this.setIsSet_rcknDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_encyAtsActPwno= false;
	protected final boolean isSet_encyAtsActPwno(){
		return this.isSet_encyAtsActPwno;
	}
	private void setIsSet_encyAtsActPwno(boolean value){
		this.isSet_encyAtsActPwno= value;
	}
	/**
	 * 암호화자동이체계좌비밀번호
	 */
	@XmlTransient
	public String getEncyAtsActPwno(){
		return this.encyAtsActPwno;
	}
	
	/**
	 * 암호화자동이체계좌비밀번호
	 * 
	 * @param encyAtsActPwno 암호화자동이체계좌비밀번호
	 */
	public void setEncyAtsActPwno(String encyAtsActPwno){
		this.encyAtsActPwno= encyAtsActPwno;
		this.setIsSet_encyAtsActPwno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atsCycd= false;
	protected final boolean isSet_atsCycd(){
		return this.isSet_atsCycd;
	}
	private void setIsSet_atsCycd(boolean value){
		this.isSet_atsCycd= value;
	}
	/**
	 * 자동이체주기코드
	 */
	@XmlTransient
	public String getAtsCycd(){
		return this.atsCycd;
	}
	
	/**
	 * 자동이체주기코드
	 * 
	 * @param atsCycd 자동이체주기코드
	 */
	public void setAtsCycd(String atsCycd){
		this.atsCycd= atsCycd;
		this.setIsSet_atsCycd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atsStaDt= false;
	protected final boolean isSet_atsStaDt(){
		return this.isSet_atsStaDt;
	}
	private void setIsSet_atsStaDt(boolean value){
		this.isSet_atsStaDt= value;
	}
	/**
	 * 자동이체시작일자
	 */
	@XmlTransient
	public String getAtsStaDt(){
		return this.atsStaDt;
	}
	
	/**
	 * 자동이체시작일자
	 * 
	 * @param atsStaDt 자동이체시작일자
	 */
	public void setAtsStaDt(String atsStaDt){
		this.atsStaDt= atsStaDt;
		this.setIsSet_atsStaDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atsEndDt= false;
	protected final boolean isSet_atsEndDt(){
		return this.isSet_atsEndDt;
	}
	private void setIsSet_atsEndDt(boolean value){
		this.isSet_atsEndDt= value;
	}
	/**
	 * 자동이체종료일자
	 */
	@XmlTransient
	public String getAtsEndDt(){
		return this.atsEndDt;
	}
	
	/**
	 * 자동이체종료일자
	 * 
	 * @param atsEndDt 자동이체종료일자
	 */
	public void setAtsEndDt(String atsEndDt){
		this.atsEndDt= atsEndDt;
		this.setIsSet_atsEndDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atsCucd= false;
	protected final boolean isSet_atsCucd(){
		return this.isSet_atsCucd;
	}
	private void setIsSet_atsCucd(boolean value){
		this.isSet_atsCucd= value;
	}
	/**
	 * 자동이체통화코드
	 */
	@XmlTransient
	public String getAtsCucd(){
		return this.atsCucd;
	}
	
	/**
	 * 자동이체통화코드
	 * 
	 * @param atsCucd 자동이체통화코드
	 */
	public void setAtsCucd(String atsCucd){
		this.atsCucd= atsCucd;
		this.setIsSet_atsCucd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atsDd= false;
	protected final boolean isSet_atsDd(){
		return this.isSet_atsDd;
	}
	private void setIsSet_atsDd(boolean value){
		this.isSet_atsDd= value;
	}
	/**
	 * 자동이체일
	 */
	@XmlTransient
	public Integer getAtsDd(){
		return this.atsDd;
	}
	
	/**
	 * 자동이체일
	 * 
	 * @param atsDd 자동이체일
	 */
	public void setAtsDd(Integer atsDd){
		this.atsDd= atsDd;
		this.setIsSet_atsDd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atsMecn= false;
	protected final boolean isSet_atsMecn(){
		return this.isSet_atsMecn;
	}
	private void setIsSet_atsMecn(boolean value){
		this.isSet_atsMecn= value;
	}
	/**
	 * 자동이체개월수
	 */
	@XmlTransient
	public Integer getAtsMecn(){
		return this.atsMecn;
	}
	
	/**
	 * 자동이체개월수
	 * 
	 * @param atsMecn 자동이체개월수
	 */
	public void setAtsMecn(Integer atsMecn){
		this.atsMecn= atsMecn;
		this.setIsSet_atsMecn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atsAcno= false;
	protected final boolean isSet_atsAcno(){
		return this.isSet_atsAcno;
	}
	private void setIsSet_atsAcno(boolean value){
		this.isSet_atsAcno= value;
	}
	/**
	 * 자동이체계좌번호
	 */
	@XmlTransient
	public String getAtsAcno(){
		return this.atsAcno;
	}
	
	/**
	 * 자동이체계좌번호
	 * 
	 * @param atsAcno 자동이체계좌번호
	 */
	public void setAtsAcno(String atsAcno){
		this.atsAcno= atsAcno;
		this.setIsSet_atsAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atsAm= false;
	protected final boolean isSet_atsAm(){
		return this.isSet_atsAm;
	}
	private void setIsSet_atsAm(boolean value){
		this.isSet_atsAm= value;
	}
	/**
	 * 자동이체금액
	 * BigDecimal - Double value setter
	 *
	 * @Param atsAm 자동이체금액
	 */
	public void setAtsAm(double atsAm) {
		setAtsAm(BigDecimal.valueOf(atsAm));
	}
	/**
	 * 자동이체금액
	 * BigDecimal - Long value setter
	 *
	 * @Param atsAm 자동이체금액
	 */
	public void setAtsAm(long atsAm) {
		setAtsAm(BigDecimal.valueOf(atsAm));
	}
	/**
	 * 자동이체금액
	 * BigDecimal - String value setter
	 *
	 * @Param atsAm 자동이체금액
	 */
	public void setAtsAm(String atsAm) {
		setAtsAm(new BigDecimal(atsAm));
	}
	/**
	 * 자동이체금액
	 */
	@XmlTransient
	public BigDecimal getAtsAm(){
		return this.atsAm;
	}
	
	/**
	 * 자동이체금액
	 * 
	 * @param atsAm 자동이체금액
	 */
	@JsonSetter("atsAm")
	public void setAtsAm(BigDecimal atsAm){
		this.atsAm= atsAm;
		this.setIsSet_atsAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_tbkSltCopCd= false;
	protected final boolean isSet_tbkSltCopCd(){
		return this.isSet_tbkSltCopCd;
	}
	private void setIsSet_tbkSltCopCd(boolean value){
		this.isSet_tbkSltCopCd= value;
	}
	/**
	 * 당행선정기업코드
	 */
	@XmlTransient
	public String getTbkSltCopCd(){
		return this.tbkSltCopCd;
	}
	
	/**
	 * 당행선정기업코드
	 * 
	 * @param tbkSltCopCd 당행선정기업코드
	 */
	public void setTbkSltCopCd(String tbkSltCopCd){
		this.tbkSltCopCd= tbkSltCopCd;
		this.setIsSet_tbkSltCopCd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_tbkSltCopOfemYn= false;
	protected final boolean isSet_tbkSltCopOfemYn(){
		return this.isSet_tbkSltCopOfemYn;
	}
	private void setIsSet_tbkSltCopOfemYn(boolean value){
		this.isSet_tbkSltCopOfemYn= value;
	}
	/**
	 * 당행선정기업임직원여부
	 */
	@XmlTransient
	public String getTbkSltCopOfemYn(){
		return this.tbkSltCopOfemYn;
	}
	
	/**
	 * 당행선정기업임직원여부
	 * 
	 * @param tbkSltCopOfemYn 당행선정기업임직원여부
	 */
	public void setTbkSltCopOfemYn(String tbkSltCopOfemYn){
		this.tbkSltCopOfemYn= tbkSltCopOfemYn;
		this.setIsSet_tbkSltCopOfemYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dntnRqYn= false;
	protected final boolean isSet_dntnRqYn(){
		return this.isSet_dntnRqYn;
	}
	private void setIsSet_dntnRqYn(boolean value){
		this.isSet_dntnRqYn= value;
	}
	/**
	 * 기부신청여부
	 */
	@XmlTransient
	public String getDntnRqYn(){
		return this.dntnRqYn;
	}
	
	/**
	 * 기부신청여부
	 * 
	 * @param dntnRqYn 기부신청여부
	 */
	public void setDntnRqYn(String dntnRqYn){
		this.dntnRqYn= dntnRqYn;
		this.setIsSet_dntnRqYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dntnAmDscd= false;
	protected final boolean isSet_dntnAmDscd(){
		return this.isSet_dntnAmDscd;
	}
	private void setIsSet_dntnAmDscd(boolean value){
		this.isSet_dntnAmDscd= value;
	}
	/**
	 * 기부금액구분코드
	 */
	@XmlTransient
	public String getDntnAmDscd(){
		return this.dntnAmDscd;
	}
	
	/**
	 * 기부금액구분코드
	 * 
	 * @param dntnAmDscd 기부금액구분코드
	 */
	public void setDntnAmDscd(String dntnAmDscd){
		this.dntnAmDscd= dntnAmDscd;
		this.setIsSet_dntnAmDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dntnAm= false;
	protected final boolean isSet_dntnAm(){
		return this.isSet_dntnAm;
	}
	private void setIsSet_dntnAm(boolean value){
		this.isSet_dntnAm= value;
	}
	/**
	 * 기부금액
	 * BigDecimal - Double value setter
	 *
	 * @Param dntnAm 기부금액
	 */
	public void setDntnAm(double dntnAm) {
		setDntnAm(BigDecimal.valueOf(dntnAm));
	}
	/**
	 * 기부금액
	 * BigDecimal - Long value setter
	 *
	 * @Param dntnAm 기부금액
	 */
	public void setDntnAm(long dntnAm) {
		setDntnAm(BigDecimal.valueOf(dntnAm));
	}
	/**
	 * 기부금액
	 * BigDecimal - String value setter
	 *
	 * @Param dntnAm 기부금액
	 */
	public void setDntnAm(String dntnAm) {
		setDntnAm(new BigDecimal(dntnAm));
	}
	/**
	 * 기부금액
	 */
	@XmlTransient
	public BigDecimal getDntnAm(){
		return this.dntnAm;
	}
	
	/**
	 * 기부금액
	 * 
	 * @param dntnAm 기부금액
	 */
	@JsonSetter("dntnAm")
	public void setDntnAm(BigDecimal dntnAm){
		this.dntnAm= dntnAm;
		this.setIsSet_dntnAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_xprCancRcvAcno= false;
	protected final boolean isSet_xprCancRcvAcno(){
		return this.isSet_xprCancRcvAcno;
	}
	private void setIsSet_xprCancRcvAcno(boolean value){
		this.isSet_xprCancRcvAcno= value;
	}
	/**
	 * 만기해지입금계좌번호
	 */
	@XmlTransient
	public String getXprCancRcvAcno(){
		return this.xprCancRcvAcno;
	}
	
	/**
	 * 만기해지입금계좌번호
	 * 
	 * @param xprCancRcvAcno 만기해지입금계좌번호
	 */
	public void setXprCancRcvAcno(String xprCancRcvAcno){
		this.xprCancRcvAcno= xprCancRcvAcno;
		this.setIsSet_xprCancRcvAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_bchrCponNo= false;
	protected final boolean isSet_bchrCponNo(){
		return this.isSet_bchrCponNo;
	}
	private void setIsSet_bchrCponNo(boolean value){
		this.isSet_bchrCponNo= value;
	}
	/**
	 * 바우처쿠폰번호
	 */
	@XmlTransient
	public String getBchrCponNo(){
		return this.bchrCponNo;
	}
	
	/**
	 * 바우처쿠폰번호
	 * 
	 * @param bchrCponNo 바우처쿠폰번호
	 */
	public void setBchrCponNo(String bchrCponNo){
		this.bchrCponNo= bchrCponNo;
		this.setIsSet_bchrCponNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_bchrSupAm= false;
	protected final boolean isSet_bchrSupAm(){
		return this.isSet_bchrSupAm;
	}
	private void setIsSet_bchrSupAm(boolean value){
		this.isSet_bchrSupAm= value;
	}
	/**
	 * 바우처지원금액
	 * BigDecimal - Double value setter
	 *
	 * @Param bchrSupAm 바우처지원금액
	 */
	public void setBchrSupAm(double bchrSupAm) {
		setBchrSupAm(BigDecimal.valueOf(bchrSupAm));
	}
	/**
	 * 바우처지원금액
	 * BigDecimal - Long value setter
	 *
	 * @Param bchrSupAm 바우처지원금액
	 */
	public void setBchrSupAm(long bchrSupAm) {
		setBchrSupAm(BigDecimal.valueOf(bchrSupAm));
	}
	/**
	 * 바우처지원금액
	 * BigDecimal - String value setter
	 *
	 * @Param bchrSupAm 바우처지원금액
	 */
	public void setBchrSupAm(String bchrSupAm) {
		setBchrSupAm(new BigDecimal(bchrSupAm));
	}
	/**
	 * 바우처지원금액
	 */
	@XmlTransient
	public BigDecimal getBchrSupAm(){
		return this.bchrSupAm;
	}
	
	/**
	 * 바우처지원금액
	 * 
	 * @param bchrSupAm 바우처지원금액
	 */
	@JsonSetter("bchrSupAm")
	public void setBchrSupAm(BigDecimal bchrSupAm){
		this.bchrSupAm= bchrSupAm;
		this.setIsSet_bchrSupAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_bchrCusPidAm= false;
	protected final boolean isSet_bchrCusPidAm(){
		return this.isSet_bchrCusPidAm;
	}
	private void setIsSet_bchrCusPidAm(boolean value){
		this.isSet_bchrCusPidAm= value;
	}
	/**
	 * 바우처고객납입금액
	 * BigDecimal - Double value setter
	 *
	 * @Param bchrCusPidAm 바우처고객납입금액
	 */
	public void setBchrCusPidAm(double bchrCusPidAm) {
		setBchrCusPidAm(BigDecimal.valueOf(bchrCusPidAm));
	}
	/**
	 * 바우처고객납입금액
	 * BigDecimal - Long value setter
	 *
	 * @Param bchrCusPidAm 바우처고객납입금액
	 */
	public void setBchrCusPidAm(long bchrCusPidAm) {
		setBchrCusPidAm(BigDecimal.valueOf(bchrCusPidAm));
	}
	/**
	 * 바우처고객납입금액
	 * BigDecimal - String value setter
	 *
	 * @Param bchrCusPidAm 바우처고객납입금액
	 */
	public void setBchrCusPidAm(String bchrCusPidAm) {
		setBchrCusPidAm(new BigDecimal(bchrCusPidAm));
	}
	/**
	 * 바우처고객납입금액
	 */
	@XmlTransient
	public BigDecimal getBchrCusPidAm(){
		return this.bchrCusPidAm;
	}
	
	/**
	 * 바우처고객납입금액
	 * 
	 * @param bchrCusPidAm 바우처고객납입금액
	 */
	@JsonSetter("bchrCusPidAm")
	public void setBchrCusPidAm(BigDecimal bchrCusPidAm){
		this.bchrCusPidAm= bchrCusPidAm;
		this.setIsSet_bchrCusPidAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_apvNo= false;
	protected final boolean isSet_apvNo(){
		return this.isSet_apvNo;
	}
	private void setIsSet_apvNo(boolean value){
		this.isSet_apvNo= value;
	}
	/**
	 * 승인번호
	 */
	@XmlTransient
	public String getApvNo(){
		return this.apvNo;
	}
	
	/**
	 * 승인번호
	 * 
	 * @param apvNo 승인번호
	 */
	public void setApvNo(String apvNo){
		this.apvNo= apvNo;
		this.setIsSet_apvNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cponCrtfNo= false;
	protected final boolean isSet_cponCrtfNo(){
		return this.isSet_cponCrtfNo;
	}
	private void setIsSet_cponCrtfNo(boolean value){
		this.isSet_cponCrtfNo= value;
	}
	/**
	 * 쿠폰인증번호
	 */
	@XmlTransient
	public String getCponCrtfNo(){
		return this.cponCrtfNo;
	}
	
	/**
	 * 쿠폰인증번호
	 * 
	 * @param cponCrtfNo 쿠폰인증번호
	 */
	public void setCponCrtfNo(String cponCrtfNo){
		this.cponCrtfNo= cponCrtfNo;
		this.setIsSet_cponCrtfNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_autoRdepYn= false;
	protected final boolean isSet_autoRdepYn(){
		return this.isSet_autoRdepYn;
	}
	private void setIsSet_autoRdepYn(boolean value){
		this.isSet_autoRdepYn= value;
	}
	/**
	 * 자동재예치여부
	 */
	@XmlTransient
	public String getAutoRdepYn(){
		return this.autoRdepYn;
	}
	
	/**
	 * 자동재예치여부
	 * 
	 * @param autoRdepYn 자동재예치여부
	 */
	public void setAutoRdepYn(String autoRdepYn){
		this.autoRdepYn= autoRdepYn;
		this.setIsSet_autoRdepYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_insuJnngAgrYn= false;
	protected final boolean isSet_insuJnngAgrYn(){
		return this.isSet_insuJnngAgrYn;
	}
	private void setIsSet_insuJnngAgrYn(boolean value){
		this.isSet_insuJnngAgrYn= value;
	}
	/**
	 * 보험가입동의여부
	 */
	@XmlTransient
	public String getInsuJnngAgrYn(){
		return this.insuJnngAgrYn;
	}
	
	/**
	 * 보험가입동의여부
	 * 
	 * @param insuJnngAgrYn 보험가입동의여부
	 */
	public void setInsuJnngAgrYn(String insuJnngAgrYn){
		this.insuJnngAgrYn= insuJnngAgrYn;
		this.setIsSet_insuJnngAgrYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_jnngTgtDscd= false;
	protected final boolean isSet_jnngTgtDscd(){
		return this.isSet_jnngTgtDscd;
	}
	private void setIsSet_jnngTgtDscd(boolean value){
		this.isSet_jnngTgtDscd= value;
	}
	/**
	 * 가입대상구분코드
	 */
	@XmlTransient
	public String getJnngTgtDscd(){
		return this.jnngTgtDscd;
	}
	
	/**
	 * 가입대상구분코드
	 * 
	 * @param jnngTgtDscd 가입대상구분코드
	 */
	public void setJnngTgtDscd(String jnngTgtDscd){
		this.jnngTgtDscd= jnngTgtDscd;
		this.setIsSet_jnngTgtDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ccadHldgYn= false;
	protected final boolean isSet_ccadHldgYn(){
		return this.isSet_ccadHldgYn;
	}
	private void setIsSet_ccadHldgYn(boolean value){
		this.isSet_ccadHldgYn= value;
	}
	/**
	 * 신용카드보유여부
	 */
	@XmlTransient
	public String getCcadHldgYn(){
		return this.ccadHldgYn;
	}
	
	/**
	 * 신용카드보유여부
	 * 
	 * @param ccadHldgYn 신용카드보유여부
	 */
	public void setCcadHldgYn(String ccadHldgYn){
		this.ccadHldgYn= ccadHldgYn;
		this.setIsSet_ccadHldgYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_frcsDshgDt= false;
	protected final boolean isSet_frcsDshgDt(){
		return this.isSet_frcsDshgDt;
	}
	private void setIsSet_frcsDshgDt(boolean value){
		this.isSet_frcsDshgDt= value;
	}
	/**
	 * 예상전역일자
	 */
	@XmlTransient
	public String getFrcsDshgDt(){
		return this.frcsDshgDt;
	}
	
	/**
	 * 예상전역일자
	 * 
	 * @param frcsDshgDt 예상전역일자
	 */
	public void setFrcsDshgDt(String frcsDshgDt){
		this.frcsDshgDt= frcsDshgDt;
		this.setIsSet_frcsDshgDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cusDgnPrdNm= false;
	protected final boolean isSet_cusDgnPrdNm(){
		return this.isSet_cusDgnPrdNm;
	}
	private void setIsSet_cusDgnPrdNm(boolean value){
		this.isSet_cusDgnPrdNm= value;
	}
	/**
	 * 고객지정상품명
	 */
	@XmlTransient
	public String getCusDgnPrdNm(){
		return this.cusDgnPrdNm;
	}
	
	/**
	 * 고객지정상품명
	 * 
	 * @param cusDgnPrdNm 고객지정상품명
	 */
	public void setCusDgnPrdNm(String cusDgnPrdNm){
		this.cusDgnPrdNm= cusDgnPrdNm;
		this.setIsSet_cusDgnPrdNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_xcoCd= false;
	protected final boolean isSet_xcoCd(){
		return this.isSet_xcoCd;
	}
	private void setIsSet_xcoCd(boolean value){
		this.isSet_xcoCd= value;
	}
	/**
	 * 우수기업코드
	 */
	@XmlTransient
	public String getXcoCd(){
		return this.xcoCd;
	}
	
	/**
	 * 우수기업코드
	 * 
	 * @param xcoCd 우수기업코드
	 */
	public void setXcoCd(String xcoCd){
		this.xcoCd= xcoCd;
		this.setIsSet_xcoCd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_frndAcno= false;
	protected final boolean isSet_frndAcno(){
		return this.isSet_frndAcno;
	}
	private void setIsSet_frndAcno(boolean value){
		this.isSet_frndAcno= value;
	}
	/**
	 * 친구계좌번호
	 */
	@XmlTransient
	public String getFrndAcno(){
		return this.frndAcno;
	}
	
	/**
	 * 친구계좌번호
	 * 
	 * @param frndAcno 친구계좌번호
	 */
	public void setFrndAcno(String frndAcno){
		this.frndAcno= frndAcno;
		this.setIsSet_frndAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_spdtDgnMm= false;
	protected final boolean isSet_spdtDgnMm(){
		return this.isSet_spdtDgnMm;
	}
	private void setIsSet_spdtDgnMm(boolean value){
		this.isSet_spdtDgnMm= value;
	}
	/**
	 * 특정일지정월
	 */
	@XmlTransient
	public Integer getSpdtDgnMm(){
		return this.spdtDgnMm;
	}
	
	/**
	 * 특정일지정월
	 * 
	 * @param spdtDgnMm 특정일지정월
	 */
	public void setSpdtDgnMm(Integer spdtDgnMm){
		this.spdtDgnMm= spdtDgnMm;
		this.setIsSet_spdtDgnMm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_spdtDgnDd= false;
	protected final boolean isSet_spdtDgnDd(){
		return this.isSet_spdtDgnDd;
	}
	private void setIsSet_spdtDgnDd(boolean value){
		this.isSet_spdtDgnDd= value;
	}
	/**
	 * 특정일지정일
	 */
	@XmlTransient
	public Integer getSpdtDgnDd(){
		return this.spdtDgnDd;
	}
	
	/**
	 * 특정일지정일
	 * 
	 * @param spdtDgnDd 특정일지정일
	 */
	public void setSpdtDgnDd(Integer spdtDgnDd){
		this.spdtDgnDd= spdtDgnDd;
		this.setIsSet_spdtDgnDd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_aplIr= false;
	protected final boolean isSet_aplIr(){
		return this.isSet_aplIr;
	}
	private void setIsSet_aplIr(boolean value){
		this.isSet_aplIr= value;
	}
	/**
	 * 적용금리
	 * BigDecimal - Double value setter
	 *
	 * @Param aplIr 적용금리
	 */
	public void setAplIr(double aplIr) {
		setAplIr(BigDecimal.valueOf(aplIr));
	}
	/**
	 * 적용금리
	 * BigDecimal - Long value setter
	 *
	 * @Param aplIr 적용금리
	 */
	public void setAplIr(long aplIr) {
		setAplIr(BigDecimal.valueOf(aplIr));
	}
	/**
	 * 적용금리
	 * BigDecimal - String value setter
	 *
	 * @Param aplIr 적용금리
	 */
	public void setAplIr(String aplIr) {
		setAplIr(new BigDecimal(aplIr));
	}
	/**
	 * 적용금리
	 */
	@XmlTransient
	public BigDecimal getAplIr(){
		return this.aplIr;
	}
	
	/**
	 * 적용금리
	 * 
	 * @param aplIr 적용금리
	 */
	@JsonSetter("aplIr")
	public void setAplIr(BigDecimal aplIr){
		this.aplIr= aplIr;
		this.setIsSet_aplIr(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_emlFpAcblNtfcRqYn= false;
	protected final boolean isSet_emlFpAcblNtfcRqYn(){
		return this.isSet_emlFpAcblNtfcRqYn;
	}
	private void setIsSet_emlFpAcblNtfcRqYn(boolean value){
		this.isSet_emlFpAcblNtfcRqYn= value;
	}
	/**
	 * 이메일정기잔고알림신청여부
	 */
	@XmlTransient
	public String getEmlFpAcblNtfcRqYn(){
		return this.emlFpAcblNtfcRqYn;
	}
	
	/**
	 * 이메일정기잔고알림신청여부
	 * 
	 * @param emlFpAcblNtfcRqYn 이메일정기잔고알림신청여부
	 */
	public void setEmlFpAcblNtfcRqYn(String emlFpAcblNtfcRqYn){
		this.emlFpAcblNtfcRqYn= emlFpAcblNtfcRqYn;
		this.setIsSet_emlFpAcblNtfcRqYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_emlFpAcblNtfcBsdt= false;
	protected final boolean isSet_emlFpAcblNtfcBsdt(){
		return this.isSet_emlFpAcblNtfcBsdt;
	}
	private void setIsSet_emlFpAcblNtfcBsdt(boolean value){
		this.isSet_emlFpAcblNtfcBsdt= value;
	}
	/**
	 * 이메일정기잔고알림기준일
	 */
	@XmlTransient
	public Integer getEmlFpAcblNtfcBsdt(){
		return this.emlFpAcblNtfcBsdt;
	}
	
	/**
	 * 이메일정기잔고알림기준일
	 * 
	 * @param emlFpAcblNtfcBsdt 이메일정기잔고알림기준일
	 */
	public void setEmlFpAcblNtfcBsdt(Integer emlFpAcblNtfcBsdt){
		this.emlFpAcblNtfcBsdt= emlFpAcblNtfcBsdt;
		this.setIsSet_emlFpAcblNtfcBsdt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_fpPrftRtSmsNtfcRqYn= false;
	protected final boolean isSet_fpPrftRtSmsNtfcRqYn(){
		return this.isSet_fpPrftRtSmsNtfcRqYn;
	}
	private void setIsSet_fpPrftRtSmsNtfcRqYn(boolean value){
		this.isSet_fpPrftRtSmsNtfcRqYn= value;
	}
	/**
	 * 정기수익율SMS알림신청여부
	 */
	@XmlTransient
	public String getFpPrftRtSmsNtfcRqYn(){
		return this.fpPrftRtSmsNtfcRqYn;
	}
	
	/**
	 * 정기수익율SMS알림신청여부
	 * 
	 * @param fpPrftRtSmsNtfcRqYn 정기수익율SMS알림신청여부
	 */
	public void setFpPrftRtSmsNtfcRqYn(String fpPrftRtSmsNtfcRqYn){
		this.fpPrftRtSmsNtfcRqYn= fpPrftRtSmsNtfcRqYn;
		this.setIsSet_fpPrftRtSmsNtfcRqYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_fpPrftRtSmsNtfcBsdt= false;
	protected final boolean isSet_fpPrftRtSmsNtfcBsdt(){
		return this.isSet_fpPrftRtSmsNtfcBsdt;
	}
	private void setIsSet_fpPrftRtSmsNtfcBsdt(boolean value){
		this.isSet_fpPrftRtSmsNtfcBsdt= value;
	}
	/**
	 * 정기수익율SMS알림기준일
	 */
	@XmlTransient
	public Integer getFpPrftRtSmsNtfcBsdt(){
		return this.fpPrftRtSmsNtfcBsdt;
	}
	
	/**
	 * 정기수익율SMS알림기준일
	 * 
	 * @param fpPrftRtSmsNtfcBsdt 정기수익율SMS알림기준일
	 */
	public void setFpPrftRtSmsNtfcBsdt(Integer fpPrftRtSmsNtfcBsdt){
		this.fpPrftRtSmsNtfcBsdt= fpPrftRtSmsNtfcBsdt;
		this.setIsSet_fpPrftRtSmsNtfcBsdt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_goalPrSmsRqYn= false;
	protected final boolean isSet_goalPrSmsRqYn(){
		return this.isSet_goalPrSmsRqYn;
	}
	private void setIsSet_goalPrSmsRqYn(boolean value){
		this.isSet_goalPrSmsRqYn= value;
	}
	/**
	 * 목표가격SMS신청여부
	 */
	@XmlTransient
	public String getGoalPrSmsRqYn(){
		return this.goalPrSmsRqYn;
	}
	
	/**
	 * 목표가격SMS신청여부
	 * 
	 * @param goalPrSmsRqYn 목표가격SMS신청여부
	 */
	public void setGoalPrSmsRqYn(String goalPrSmsRqYn){
		this.goalPrSmsRqYn= goalPrSmsRqYn;
		this.setIsSet_goalPrSmsRqYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_goalPr= false;
	protected final boolean isSet_goalPr(){
		return this.isSet_goalPr;
	}
	private void setIsSet_goalPr(boolean value){
		this.isSet_goalPr= value;
	}
	/**
	 * 목표가격
	 * BigDecimal - Double value setter
	 *
	 * @Param goalPr 목표가격
	 */
	public void setGoalPr(double goalPr) {
		setGoalPr(BigDecimal.valueOf(goalPr));
	}
	/**
	 * 목표가격
	 * BigDecimal - Long value setter
	 *
	 * @Param goalPr 목표가격
	 */
	public void setGoalPr(long goalPr) {
		setGoalPr(BigDecimal.valueOf(goalPr));
	}
	/**
	 * 목표가격
	 * BigDecimal - String value setter
	 *
	 * @Param goalPr 목표가격
	 */
	public void setGoalPr(String goalPr) {
		setGoalPr(new BigDecimal(goalPr));
	}
	/**
	 * 목표가격
	 */
	@XmlTransient
	public BigDecimal getGoalPr(){
		return this.goalPr;
	}
	
	/**
	 * 목표가격
	 * 
	 * @param goalPr 목표가격
	 */
	@JsonSetter("goalPr")
	public void setGoalPr(BigDecimal goalPr){
		this.goalPr= goalPr;
		this.setIsSet_goalPr(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_alwPr= false;
	protected final boolean isSet_alwPr(){
		return this.isSet_alwPr;
	}
	private void setIsSet_alwPr(boolean value){
		this.isSet_alwPr= value;
	}
	/**
	 * 허용가격
	 * BigDecimal - Double value setter
	 *
	 * @Param alwPr 허용가격
	 */
	public void setAlwPr(double alwPr) {
		setAlwPr(BigDecimal.valueOf(alwPr));
	}
	/**
	 * 허용가격
	 * BigDecimal - Long value setter
	 *
	 * @Param alwPr 허용가격
	 */
	public void setAlwPr(long alwPr) {
		setAlwPr(BigDecimal.valueOf(alwPr));
	}
	/**
	 * 허용가격
	 * BigDecimal - String value setter
	 *
	 * @Param alwPr 허용가격
	 */
	public void setAlwPr(String alwPr) {
		setAlwPr(new BigDecimal(alwPr));
	}
	/**
	 * 허용가격
	 */
	@XmlTransient
	public BigDecimal getAlwPr(){
		return this.alwPr;
	}
	
	/**
	 * 허용가격
	 * 
	 * @param alwPr 허용가격
	 */
	@JsonSetter("alwPr")
	public void setAlwPr(BigDecimal alwPr){
		this.alwPr= alwPr;
		this.setIsSet_alwPr(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_gBnkgGoalPrftRtDscd= false;
	protected final boolean isSet_gBnkgGoalPrftRtDscd(){
		return this.isSet_gBnkgGoalPrftRtDscd;
	}
	private void setIsSet_gBnkgGoalPrftRtDscd(boolean value){
		this.isSet_gBnkgGoalPrftRtDscd= value;
	}
	/**
	 * 골드뱅킹목표수익율구분코드
	 */
	@XmlTransient
	public String getgBnkgGoalPrftRtDscd(){
		return this.gBnkgGoalPrftRtDscd;
	}
	
	/**
	 * 골드뱅킹목표수익율구분코드
	 * 
	 * @param gBnkgGoalPrftRtDscd 골드뱅킹목표수익율구분코드
	 */
	public void setgBnkgGoalPrftRtDscd(String gBnkgGoalPrftRtDscd){
		this.gBnkgGoalPrftRtDscd= gBnkgGoalPrftRtDscd;
		this.setIsSet_gBnkgGoalPrftRtDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_gBnkgAlwLossDscd= false;
	protected final boolean isSet_gBnkgAlwLossDscd(){
		return this.isSet_gBnkgAlwLossDscd;
	}
	private void setIsSet_gBnkgAlwLossDscd(boolean value){
		this.isSet_gBnkgAlwLossDscd= value;
	}
	/**
	 * 골드뱅킹허용손실구분코드
	 */
	@XmlTransient
	public String getgBnkgAlwLossDscd(){
		return this.gBnkgAlwLossDscd;
	}
	
	/**
	 * 골드뱅킹허용손실구분코드
	 * 
	 * @param gBnkgAlwLossDscd 골드뱅킹허용손실구분코드
	 */
	public void setgBnkgAlwLossDscd(String gBnkgAlwLossDscd){
		this.gBnkgAlwLossDscd= gBnkgAlwLossDscd;
		this.setIsSet_gBnkgAlwLossDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_fcPsklUseYn= false;
	protected final boolean isSet_fcPsklUseYn(){
		return this.isSet_fcPsklUseYn;
	}
	private void setIsSet_fcPsklUseYn(boolean value){
		this.isSet_fcPsklUseYn= value;
	}
	/**
	 * 외화통장대출용여부
	 */
	@XmlTransient
	public String getFcPsklUseYn(){
		return this.fcPsklUseYn;
	}
	
	/**
	 * 외화통장대출용여부
	 * 
	 * @param fcPsklUseYn 외화통장대출용여부
	 */
	public void setFcPsklUseYn(String fcPsklUseYn){
		this.fcPsklUseYn= fcPsklUseYn;
		this.setIsSet_fcPsklUseYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_xrtTsTycd= false;
	protected final boolean isSet_xrtTsTycd(){
		return this.isSet_xrtTsTycd;
	}
	private void setIsSet_xrtTsTycd(boolean value){
		this.isSet_xrtTsTycd= value;
	}
	/**
	 * 환율이체유형코드
	 */
	@XmlTransient
	public String getXrtTsTycd(){
		return this.xrtTsTycd;
	}
	
	/**
	 * 환율이체유형코드
	 * 
	 * @param xrtTsTycd 환율이체유형코드
	 */
	public void setXrtTsTycd(String xrtTsTycd){
		this.xrtTsTycd= xrtTsTycd;
		this.setIsSet_xrtTsTycd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_xrtMaxAcldAm= false;
	protected final boolean isSet_xrtMaxAcldAm(){
		return this.isSet_xrtMaxAcldAm;
	}
	private void setIsSet_xrtMaxAcldAm(boolean value){
		this.isSet_xrtMaxAcldAm= value;
	}
	/**
	 * 환율최대적립금액
	 * BigDecimal - Double value setter
	 *
	 * @Param xrtMaxAcldAm 환율최대적립금액
	 */
	public void setXrtMaxAcldAm(double xrtMaxAcldAm) {
		setXrtMaxAcldAm(BigDecimal.valueOf(xrtMaxAcldAm));
	}
	/**
	 * 환율최대적립금액
	 * BigDecimal - Long value setter
	 *
	 * @Param xrtMaxAcldAm 환율최대적립금액
	 */
	public void setXrtMaxAcldAm(long xrtMaxAcldAm) {
		setXrtMaxAcldAm(BigDecimal.valueOf(xrtMaxAcldAm));
	}
	/**
	 * 환율최대적립금액
	 * BigDecimal - String value setter
	 *
	 * @Param xrtMaxAcldAm 환율최대적립금액
	 */
	public void setXrtMaxAcldAm(String xrtMaxAcldAm) {
		setXrtMaxAcldAm(new BigDecimal(xrtMaxAcldAm));
	}
	/**
	 * 환율최대적립금액
	 */
	@XmlTransient
	public BigDecimal getXrtMaxAcldAm(){
		return this.xrtMaxAcldAm;
	}
	
	/**
	 * 환율최대적립금액
	 * 
	 * @param xrtMaxAcldAm 환율최대적립금액
	 */
	@JsonSetter("xrtMaxAcldAm")
	public void setXrtMaxAcldAm(BigDecimal xrtMaxAcldAm){
		this.xrtMaxAcldAm= xrtMaxAcldAm;
		this.setIsSet_xrtMaxAcldAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dgnXrtNtfcSrvcDscd= false;
	protected final boolean isSet_dgnXrtNtfcSrvcDscd(){
		return this.isSet_dgnXrtNtfcSrvcDscd;
	}
	private void setIsSet_dgnXrtNtfcSrvcDscd(boolean value){
		this.isSet_dgnXrtNtfcSrvcDscd= value;
	}
	/**
	 * 지정환율알림서비스구분코드
	 */
	@XmlTransient
	public String getDgnXrtNtfcSrvcDscd(){
		return this.dgnXrtNtfcSrvcDscd;
	}
	
	/**
	 * 지정환율알림서비스구분코드
	 * 
	 * @param dgnXrtNtfcSrvcDscd 지정환율알림서비스구분코드
	 */
	public void setDgnXrtNtfcSrvcDscd(String dgnXrtNtfcSrvcDscd){
		this.dgnXrtNtfcSrvcDscd= dgnXrtNtfcSrvcDscd;
		this.setIsSet_dgnXrtNtfcSrvcDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ntfcSrvcDgnXrt= false;
	protected final boolean isSet_ntfcSrvcDgnXrt(){
		return this.isSet_ntfcSrvcDgnXrt;
	}
	private void setIsSet_ntfcSrvcDgnXrt(boolean value){
		this.isSet_ntfcSrvcDgnXrt= value;
	}
	/**
	 * 알림서비스지정환율
	 * BigDecimal - Double value setter
	 *
	 * @Param ntfcSrvcDgnXrt 알림서비스지정환율
	 */
	public void setNtfcSrvcDgnXrt(double ntfcSrvcDgnXrt) {
		setNtfcSrvcDgnXrt(BigDecimal.valueOf(ntfcSrvcDgnXrt));
	}
	/**
	 * 알림서비스지정환율
	 * BigDecimal - Long value setter
	 *
	 * @Param ntfcSrvcDgnXrt 알림서비스지정환율
	 */
	public void setNtfcSrvcDgnXrt(long ntfcSrvcDgnXrt) {
		setNtfcSrvcDgnXrt(BigDecimal.valueOf(ntfcSrvcDgnXrt));
	}
	/**
	 * 알림서비스지정환율
	 * BigDecimal - String value setter
	 *
	 * @Param ntfcSrvcDgnXrt 알림서비스지정환율
	 */
	public void setNtfcSrvcDgnXrt(String ntfcSrvcDgnXrt) {
		setNtfcSrvcDgnXrt(new BigDecimal(ntfcSrvcDgnXrt));
	}
	/**
	 * 알림서비스지정환율
	 */
	@XmlTransient
	public BigDecimal getNtfcSrvcDgnXrt(){
		return this.ntfcSrvcDgnXrt;
	}
	
	/**
	 * 알림서비스지정환율
	 * 
	 * @param ntfcSrvcDgnXrt 알림서비스지정환율
	 */
	@JsonSetter("ntfcSrvcDgnXrt")
	public void setNtfcSrvcDgnXrt(BigDecimal ntfcSrvcDgnXrt){
		this.ntfcSrvcDgnXrt= ntfcSrvcDgnXrt;
		this.setIsSet_ntfcSrvcDgnXrt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ovtbCdno= false;
	protected final boolean isSet_ovtbCdno(){
		return this.isSet_ovtbCdno;
	}
	private void setIsSet_ovtbCdno(boolean value){
		this.isSet_ovtbCdno= value;
	}
	/**
	 * 해외로보너스카드번호
	 */
	@XmlTransient
	public String getOvtbCdno(){
		return this.ovtbCdno;
	}
	
	/**
	 * 해외로보너스카드번호
	 * 
	 * @param ovtbCdno 해외로보너스카드번호
	 */
	public void setOvtbCdno(String ovtbCdno){
		this.ovtbCdno= ovtbCdno;
		this.setIsSet_ovtbCdno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_fmbkCoNo= false;
	protected final boolean isSet_fmbkCoNo(){
		return this.isSet_fmbkCoNo;
	}
	private void setIsSet_fmbkCoNo(boolean value){
		this.isSet_fmbkCoNo= value;
	}
	/**
	 * 펌뱅킹업체번호
	 */
	@XmlTransient
	public String getFmbkCoNo(){
		return this.fmbkCoNo;
	}
	
	/**
	 * 펌뱅킹업체번호
	 * 
	 * @param fmbkCoNo 펌뱅킹업체번호
	 */
	public void setFmbkCoNo(String fmbkCoNo){
		this.fmbkCoNo= fmbkCoNo;
		this.setIsSet_fmbkCoNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atrnDscd= false;
	protected final boolean isSet_atrnDscd(){
		return this.isSet_atrnDscd;
	}
	private void setIsSet_atrnDscd(boolean value){
		this.isSet_atrnDscd= value;
	}
	/**
	 * 자동갱신구분코드
	 */
	@XmlTransient
	public String getAtrnDscd(){
		return this.atrnDscd;
	}
	
	/**
	 * 자동갱신구분코드
	 * 
	 * @param atrnDscd 자동갱신구분코드
	 */
	public void setAtrnDscd(String atrnDscd){
		this.atrnDscd= atrnDscd;
		this.setIsSet_atrnDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rvactNo= false;
	protected final boolean isSet_rvactNo(){
		return this.isSet_rvactNo;
	}
	private void setIsSet_rvactNo(boolean value){
		this.isSet_rvactNo= value;
	}
	/**
	 * 입금계좌번호
	 */
	@XmlTransient
	public String getRvactNo(){
		return this.rvactNo;
	}
	
	/**
	 * 입금계좌번호
	 * 
	 * @param rvactNo 입금계좌번호
	 */
	public void setRvactNo(String rvactNo){
		this.rvactNo= rvactNo;
		this.setIsSet_rvactNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_irRotCycd= false;
	protected final boolean isSet_irRotCycd(){
		return this.isSet_irRotCycd;
	}
	private void setIsSet_irRotCycd(boolean value){
		this.isSet_irRotCycd= value;
	}
	/**
	 * 금리회전주기코드
	 */
	@XmlTransient
	public String getIrRotCycd(){
		return this.irRotCycd;
	}
	
	/**
	 * 금리회전주기코드
	 * 
	 * @param irRotCycd 금리회전주기코드
	 */
	public void setIrRotCycd(String irRotCycd){
		this.irRotCycd= irRotCycd;
		this.setIsSet_irRotCycd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_fcfndInfwDscd= false;
	protected final boolean isSet_fcfndInfwDscd(){
		return this.isSet_fcfndInfwDscd;
	}
	private void setIsSet_fcfndInfwDscd(boolean value){
		this.isSet_fcfndInfwDscd= value;
	}
	/**
	 * 외화자금유입구분코드
	 */
	@XmlTransient
	public String getFcfndInfwDscd(){
		return this.fcfndInfwDscd;
	}
	
	/**
	 * 외화자금유입구분코드
	 * 
	 * @param fcfndInfwDscd 외화자금유입구분코드
	 */
	public void setFcfndInfwDscd(String fcfndInfwDscd){
		this.fcfndInfwDscd= fcfndInfwDscd;
		this.setIsSet_fcfndInfwDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_fcDpsAccDscd= false;
	protected final boolean isSet_fcDpsAccDscd(){
		return this.isSet_fcDpsAccDscd;
	}
	private void setIsSet_fcDpsAccDscd(boolean value){
		this.isSet_fcDpsAccDscd= value;
	}
	/**
	 * 외화수신계정구분코드
	 */
	@XmlTransient
	public String getFcDpsAccDscd(){
		return this.fcDpsAccDscd;
	}
	
	/**
	 * 외화수신계정구분코드
	 * 
	 * @param fcDpsAccDscd 외화수신계정구분코드
	 */
	public void setFcDpsAccDscd(String fcDpsAccDscd){
		this.fcDpsAccDscd= fcDpsAccDscd;
		this.setIsSet_fcDpsAccDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_fornXchStttCrtcSbmtDis= false;
	protected final boolean isSet_fornXchStttCrtcSbmtDis(){
		return this.isSet_fornXchStttCrtcSbmtDis;
	}
	private void setIsSet_fornXchStttCrtcSbmtDis(boolean value){
		this.isSet_fornXchStttCrtcSbmtDis= value;
	}
	/**
	 * 외국환신고필증제출구분
	 */
	@XmlTransient
	public String getFornXchStttCrtcSbmtDis(){
		return this.fornXchStttCrtcSbmtDis;
	}
	
	/**
	 * 외국환신고필증제출구분
	 * 
	 * @param fornXchStttCrtcSbmtDis 외국환신고필증제출구분
	 */
	public void setFornXchStttCrtcSbmtDis(String fornXchStttCrtcSbmtDis){
		this.fornXchStttCrtcSbmtDis= fornXchStttCrtcSbmtDis;
		this.setIsSet_fornXchStttCrtcSbmtDis(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_fxRapRncd= false;
	protected final boolean isSet_fxRapRncd(){
		return this.isSet_fxRapRncd;
	}
	private void setIsSet_fxRapRncd(boolean value){
		this.isSet_fxRapRncd= value;
	}
	/**
	 * 외환입지급사유코드
	 */
	@XmlTransient
	public String getFxRapRncd(){
		return this.fxRapRncd;
	}
	
	/**
	 * 외환입지급사유코드
	 * 
	 * @param fxRapRncd 외환입지급사유코드
	 */
	public void setFxRapRncd(String fxRapRncd){
		this.fxRapRncd= fxRapRncd;
		this.setIsSet_fxRapRncd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_payRncdCfcd= false;
	protected final boolean isSet_payRncdCfcd(){
		return this.isSet_payRncdCfcd;
	}
	private void setIsSet_payRncdCfcd(boolean value){
		this.isSet_payRncdCfcd= value;
	}
	/**
	 * 지급사유코드분류코드
	 */
	@XmlTransient
	public String getPayRncdCfcd(){
		return this.payRncdCfcd;
	}
	
	/**
	 * 지급사유코드분류코드
	 * 
	 * @param payRncdCfcd 지급사유코드분류코드
	 */
	public void setPayRncdCfcd(String payRncdCfcd){
		this.payRncdCfcd= payRncdCfcd;
		this.setIsSet_payRncdCfcd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_hsCd= false;
	protected final boolean isSet_hsCd(){
		return this.isSet_hsCd;
	}
	private void setIsSet_hsCd(boolean value){
		this.isSet_hsCd= value;
	}
	/**
	 * HS코드
	 */
	@XmlTransient
	public String getHsCd(){
		return this.hsCd;
	}
	
	/**
	 * HS코드
	 * 
	 * @param hsCd HS코드
	 */
	public void setHsCd(String hsCd){
		this.hsCd= hsCd;
		this.setIsSet_hsCd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ivpeId= false;
	protected final boolean isSet_ivpeId(){
		return this.isSet_ivpeId;
	}
	private void setIsSet_ivpeId(boolean value){
		this.isSet_ivpeId= value;
	}
	/**
	 * 투자자ID
	 */
	@XmlTransient
	public String getIvpeId(){
		return this.ivpeId;
	}
	
	/**
	 * 투자자ID
	 * 
	 * @param ivpeId 투자자ID
	 */
	public void setIvpeId(String ivpeId){
		this.ivpeId= ivpeId;
		this.setIsSet_ivpeId(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_secrComNm= false;
	protected final boolean isSet_secrComNm(){
		return this.isSet_secrComNm;
	}
	private void setIsSet_secrComNm(boolean value){
		this.isSet_secrComNm= value;
	}
	/**
	 * 증권회사명
	 */
	@XmlTransient
	public String getSecrComNm(){
		return this.secrComNm;
	}
	
	/**
	 * 증권회사명
	 * 
	 * @param secrComNm 증권회사명
	 */
	public void setSecrComNm(String secrComNm){
		this.secrComNm= secrComNm;
		this.setIsSet_secrComNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_fcApvCd= false;
	protected final boolean isSet_fcApvCd(){
		return this.isSet_fcApvCd;
	}
	private void setIsSet_fcApvCd(boolean value){
		this.isSet_fcApvCd= value;
	}
	/**
	 * 외화승인코드
	 */
	@XmlTransient
	public String getFcApvCd(){
		return this.fcApvCd;
	}
	
	/**
	 * 외화승인코드
	 * 
	 * @param fcApvCd 외화승인코드
	 */
	public void setFcApvCd(String fcApvCd){
		this.fcApvCd= fcApvCd;
		this.setIsSet_fcApvCd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pnsnAcldCtrYcnt= false;
	protected final boolean isSet_pnsnAcldCtrYcnt(){
		return this.isSet_pnsnAcldCtrYcnt;
	}
	private void setIsSet_pnsnAcldCtrYcnt(boolean value){
		this.isSet_pnsnAcldCtrYcnt= value;
	}
	/**
	 * 연금적립계약년수
	 */
	@XmlTransient
	public Integer getPnsnAcldCtrYcnt(){
		return this.pnsnAcldCtrYcnt;
	}
	
	/**
	 * 연금적립계약년수
	 * 
	 * @param pnsnAcldCtrYcnt 연금적립계약년수
	 */
	public void setPnsnAcldCtrYcnt(Integer pnsnAcldCtrYcnt){
		this.pnsnAcldCtrYcnt= pnsnAcldCtrYcnt;
		this.setIsSet_pnsnAcldCtrYcnt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pnsnAcldCtrMcn= false;
	protected final boolean isSet_pnsnAcldCtrMcn(){
		return this.isSet_pnsnAcldCtrMcn;
	}
	private void setIsSet_pnsnAcldCtrMcn(boolean value){
		this.isSet_pnsnAcldCtrMcn= value;
	}
	/**
	 * 연금적립계약월수
	 */
	@XmlTransient
	public Integer getPnsnAcldCtrMcn(){
		return this.pnsnAcldCtrMcn;
	}
	
	/**
	 * 연금적립계약월수
	 * 
	 * @param pnsnAcldCtrMcn 연금적립계약월수
	 */
	public void setPnsnAcldCtrMcn(Integer pnsnAcldCtrMcn){
		this.pnsnAcldCtrMcn= pnsnAcldCtrMcn;
		this.setIsSet_pnsnAcldCtrMcn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pnsnRcveBgnDt= false;
	protected final boolean isSet_pnsnRcveBgnDt(){
		return this.isSet_pnsnRcveBgnDt;
	}
	private void setIsSet_pnsnRcveBgnDt(boolean value){
		this.isSet_pnsnRcveBgnDt= value;
	}
	/**
	 * 연금수령개시일자
	 */
	@XmlTransient
	public String getPnsnRcveBgnDt(){
		return this.pnsnRcveBgnDt;
	}
	
	/**
	 * 연금수령개시일자
	 * 
	 * @param pnsnRcveBgnDt 연금수령개시일자
	 */
	public void setPnsnRcveBgnDt(String pnsnRcveBgnDt){
		this.pnsnRcveBgnDt= pnsnRcveBgnDt;
		this.setIsSet_pnsnRcveBgnDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_prftRtRptdSndDscd= false;
	protected final boolean isSet_prftRtRptdSndDscd(){
		return this.isSet_prftRtRptdSndDscd;
	}
	private void setIsSet_prftRtRptdSndDscd(boolean value){
		this.isSet_prftRtRptdSndDscd= value;
	}
	/**
	 * 수익율보고서발송구분코드
	 */
	@XmlTransient
	public String getPrftRtRptdSndDscd(){
		return this.prftRtRptdSndDscd;
	}
	
	/**
	 * 수익율보고서발송구분코드
	 * 
	 * @param prftRtRptdSndDscd 수익율보고서발송구분코드
	 */
	public void setPrftRtRptdSndDscd(String prftRtRptdSndDscd){
		this.prftRtRptdSndDscd= prftRtRptdSndDscd;
		this.setIsSet_prftRtRptdSndDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rprhLnkNewYn= false;
	protected final boolean isSet_rprhLnkNewYn(){
		return this.isSet_rprhLnkNewYn;
	}
	private void setIsSet_rprhLnkNewYn(boolean value){
		this.isSet_rprhLnkNewYn= value;
	}
	/**
	 * 환매연동신규여부
	 */
	@XmlTransient
	public String getRprhLnkNewYn(){
		return this.rprhLnkNewYn;
	}
	
	/**
	 * 환매연동신규여부
	 * 
	 * @param rprhLnkNewYn 환매연동신규여부
	 */
	public void setRprhLnkNewYn(String rprhLnkNewYn){
		this.rprhLnkNewYn= rprhLnkNewYn;
		this.setIsSet_rprhLnkNewYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rprhLnkCancAcno= false;
	protected final boolean isSet_rprhLnkCancAcno(){
		return this.isSet_rprhLnkCancAcno;
	}
	private void setIsSet_rprhLnkCancAcno(boolean value){
		this.isSet_rprhLnkCancAcno= value;
	}
	/**
	 * 환매연동해지계좌번호
	 */
	@XmlTransient
	public String getRprhLnkCancAcno(){
		return this.rprhLnkCancAcno;
	}
	
	/**
	 * 환매연동해지계좌번호
	 * 
	 * @param rprhLnkCancAcno 환매연동해지계좌번호
	 */
	public void setRprhLnkCancAcno(String rprhLnkCancAcno){
		this.rprhLnkCancAcno= rprhLnkCancAcno;
		this.setIsSet_rprhLnkCancAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rprhLnkTamNewYn= false;
	protected final boolean isSet_rprhLnkTamNewYn(){
		return this.isSet_rprhLnkTamNewYn;
	}
	private void setIsSet_rprhLnkTamNewYn(boolean value){
		this.isSet_rprhLnkTamNewYn= value;
	}
	/**
	 * 환매연동전액신규여부
	 */
	@XmlTransient
	public String getRprhLnkTamNewYn(){
		return this.rprhLnkTamNewYn;
	}
	
	/**
	 * 환매연동전액신규여부
	 * 
	 * @param rprhLnkTamNewYn 환매연동전액신규여부
	 */
	public void setRprhLnkTamNewYn(String rprhLnkTamNewYn){
		this.rprhLnkTamNewYn= rprhLnkTamNewYn;
		this.setIsSet_rprhLnkTamNewYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_afepAddPidYn= false;
	protected final boolean isSet_afepAddPidYn(){
		return this.isSet_afepAddPidYn;
	}
	private void setIsSet_afepAddPidYn(boolean value){
		this.isSet_afepAddPidYn= value;
	}
	/**
	 * 만기후추가납입여부
	 */
	@XmlTransient
	public String getAfepAddPidYn(){
		return this.afepAddPidYn;
	}
	
	/**
	 * 만기후추가납입여부
	 * 
	 * @param afepAddPidYn 만기후추가납입여부
	 */
	public void setAfepAddPidYn(String afepAddPidYn){
		this.afepAddPidYn= afepAddPidYn;
		this.setIsSet_afepAddPidYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_fndPdcd= false;
	protected final boolean isSet_fndPdcd(){
		return this.isSet_fndPdcd;
	}
	private void setIsSet_fndPdcd(boolean value){
		this.isSet_fndPdcd= value;
	}
	/**
	 * 펀드상품코드
	 */
	@XmlTransient
	public String getFndPdcd(){
		return this.fndPdcd;
	}
	
	/**
	 * 펀드상품코드
	 * 
	 * @param fndPdcd 펀드상품코드
	 */
	public void setFndPdcd(String fndPdcd){
		this.fndPdcd= fndPdcd;
		this.setIsSet_fndPdcd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_fndScntRqdcNprtYn= false;
	protected final boolean isSet_fndScntRqdcNprtYn(){
		return this.isSet_fndScntRqdcNprtYn;
	}
	private void setIsSet_fndScntRqdcNprtYn(boolean value){
		this.isSet_fndScntRqdcNprtYn= value;
	}
	/**
	 * 펀드매수신청서무인자여부
	 */
	@XmlTransient
	public String getFndScntRqdcNprtYn(){
		return this.fndScntRqdcNprtYn;
	}
	
	/**
	 * 펀드매수신청서무인자여부
	 * 
	 * @param fndScntRqdcNprtYn 펀드매수신청서무인자여부
	 */
	public void setFndScntRqdcNprtYn(String fndScntRqdcNprtYn){
		this.fndScntRqdcNprtYn= fndScntRqdcNprtYn;
		this.setIsSet_fndScntRqdcNprtYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_opgPtsNtcSndDscd= false;
	protected final boolean isSet_opgPtsNtcSndDscd(){
		return this.isSet_opgPtsNtcSndDscd;
	}
	private void setIsSet_opgPtsNtcSndDscd(boolean value){
		this.isSet_opgPtsNtcSndDscd= value;
	}
	/**
	 * 운용현황통지발송구분코드
	 */
	@XmlTransient
	public String getOpgPtsNtcSndDscd(){
		return this.opgPtsNtcSndDscd;
	}
	
	/**
	 * 운용현황통지발송구분코드
	 * 
	 * @param opgPtsNtcSndDscd 운용현황통지발송구분코드
	 */
	public void setOpgPtsNtcSndDscd(String opgPtsNtcSndDscd){
		this.opgPtsNtcSndDscd= opgPtsNtcSndDscd;
		this.setIsSet_opgPtsNtcSndDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_gBnkgGoalPrftRtPsnb= false;
	protected final boolean isSet_gBnkgGoalPrftRtPsnb(){
		return this.isSet_gBnkgGoalPrftRtPsnb;
	}
	private void setIsSet_gBnkgGoalPrftRtPsnb(boolean value){
		this.isSet_gBnkgGoalPrftRtPsnb= value;
	}
	/**
	 * 골드뱅킹목표수익율정수
	 */
	@XmlTransient
	public Integer getgBnkgGoalPrftRtPsnb(){
		return this.gBnkgGoalPrftRtPsnb;
	}
	
	/**
	 * 골드뱅킹목표수익율정수
	 * 
	 * @param gBnkgGoalPrftRtPsnb 골드뱅킹목표수익율정수
	 */
	public void setgBnkgGoalPrftRtPsnb(Integer gBnkgGoalPrftRtPsnb){
		this.gBnkgGoalPrftRtPsnb= gBnkgGoalPrftRtPsnb;
		this.setIsSet_gBnkgGoalPrftRtPsnb(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_gBnkgGoalPrftRtDcml= false;
	protected final boolean isSet_gBnkgGoalPrftRtDcml(){
		return this.isSet_gBnkgGoalPrftRtDcml;
	}
	private void setIsSet_gBnkgGoalPrftRtDcml(boolean value){
		this.isSet_gBnkgGoalPrftRtDcml= value;
	}
	/**
	 * 골드뱅킹목표수익율소수
	 */
	@XmlTransient
	public String getgBnkgGoalPrftRtDcml(){
		return this.gBnkgGoalPrftRtDcml;
	}
	
	/**
	 * 골드뱅킹목표수익율소수
	 * 
	 * @param gBnkgGoalPrftRtDcml 골드뱅킹목표수익율소수
	 */
	public void setgBnkgGoalPrftRtDcml(String gBnkgGoalPrftRtDcml){
		this.gBnkgGoalPrftRtDcml= gBnkgGoalPrftRtDcml;
		this.setIsSet_gBnkgGoalPrftRtDcml(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_gBnkgAlwLossRtPsnb= false;
	protected final boolean isSet_gBnkgAlwLossRtPsnb(){
		return this.isSet_gBnkgAlwLossRtPsnb;
	}
	private void setIsSet_gBnkgAlwLossRtPsnb(boolean value){
		this.isSet_gBnkgAlwLossRtPsnb= value;
	}
	/**
	 * 골드뱅킹허용손실율정수
	 */
	@XmlTransient
	public Integer getgBnkgAlwLossRtPsnb(){
		return this.gBnkgAlwLossRtPsnb;
	}
	
	/**
	 * 골드뱅킹허용손실율정수
	 * 
	 * @param gBnkgAlwLossRtPsnb 골드뱅킹허용손실율정수
	 */
	public void setgBnkgAlwLossRtPsnb(Integer gBnkgAlwLossRtPsnb){
		this.gBnkgAlwLossRtPsnb= gBnkgAlwLossRtPsnb;
		this.setIsSet_gBnkgAlwLossRtPsnb(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_gBnkgAlwLossRtDcml= false;
	protected final boolean isSet_gBnkgAlwLossRtDcml(){
		return this.isSet_gBnkgAlwLossRtDcml;
	}
	private void setIsSet_gBnkgAlwLossRtDcml(boolean value){
		this.isSet_gBnkgAlwLossRtDcml= value;
	}
	/**
	 * 골드뱅킹허용손실율소수
	 */
	@XmlTransient
	public String getgBnkgAlwLossRtDcml(){
		return this.gBnkgAlwLossRtDcml;
	}
	
	/**
	 * 골드뱅킹허용손실율소수
	 * 
	 * @param gBnkgAlwLossRtDcml 골드뱅킹허용손실율소수
	 */
	public void setgBnkgAlwLossRtDcml(String gBnkgAlwLossRtDcml){
		this.gBnkgAlwLossRtDcml= gBnkgAlwLossRtDcml;
		this.setIsSet_gBnkgAlwLossRtDcml(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_wooriOnwlMoAcno= false;
	protected final boolean isSet_wooriOnwlMoAcno(){
		return this.isSet_wooriOnwlMoAcno;
	}
	private void setIsSet_wooriOnwlMoAcno(boolean value){
		this.isSet_wooriOnwlMoAcno= value;
	}
	/**
	 * 우리평생모계좌번호
	 */
	@XmlTransient
	public String getWooriOnwlMoAcno(){
		return this.wooriOnwlMoAcno;
	}
	
	/**
	 * 우리평생모계좌번호
	 * 
	 * @param wooriOnwlMoAcno 우리평생모계좌번호
	 */
	public void setWooriOnwlMoAcno(String wooriOnwlMoAcno){
		this.wooriOnwlMoAcno= wooriOnwlMoAcno;
		this.setIsSet_wooriOnwlMoAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_bznUseActYn= false;
	protected final boolean isSet_bznUseActYn(){
		return this.isSet_bznUseActYn;
	}
	private void setIsSet_bznUseActYn(boolean value){
		this.isSet_bznUseActYn= value;
	}
	/**
	 * 사업용계좌여부
	 */
	@XmlTransient
	public String getBznUseActYn(){
		return this.bznUseActYn;
	}
	
	/**
	 * 사업용계좌여부
	 * 
	 * @param bznUseActYn 사업용계좌여부
	 */
	public void setBznUseActYn(String bznUseActYn){
		this.bznUseActYn= bznUseActYn;
		this.setIsSet_bznUseActYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_agnpeItcsno= false;
	protected final boolean isSet_agnpeItcsno(){
		return this.isSet_agnpeItcsno;
	}
	private void setIsSet_agnpeItcsno(boolean value){
		this.isSet_agnpeItcsno= value;
	}
	/**
	 * 대리인통합고객번호
	 */
	@XmlTransient
	public String getAgnpeItcsno(){
		return this.agnpeItcsno;
	}
	
	/**
	 * 대리인통합고객번호
	 * 
	 * @param agnpeItcsno 대리인통합고객번호
	 */
	public void setAgnpeItcsno(String agnpeItcsno){
		this.agnpeItcsno= agnpeItcsno;
		this.setIsSet_agnpeItcsno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rppeItcsno= false;
	protected final boolean isSet_rppeItcsno(){
		return this.isSet_rppeItcsno;
	}
	private void setIsSet_rppeItcsno(boolean value){
		this.isSet_rppeItcsno= value;
	}
	/**
	 * 대표자통합고객번호
	 */
	@XmlTransient
	public String getRppeItcsno(){
		return this.rppeItcsno;
	}
	
	/**
	 * 대표자통합고객번호
	 * 
	 * @param rppeItcsno 대표자통합고객번호
	 */
	public void setRppeItcsno(String rppeItcsno){
		this.rppeItcsno= rppeItcsno;
		this.setIsSet_rppeItcsno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atsNaNtfcRqYn= false;
	protected final boolean isSet_atsNaNtfcRqYn(){
		return this.isSet_atsNaNtfcRqYn;
	}
	private void setIsSet_atsNaNtfcRqYn(boolean value){
		this.isSet_atsNaNtfcRqYn= value;
	}
	/**
	 * 자동이체불능알림신청여부
	 */
	@XmlTransient
	public String getAtsNaNtfcRqYn(){
		return this.atsNaNtfcRqYn;
	}
	
	/**
	 * 자동이체불능알림신청여부
	 * 
	 * @param atsNaNtfcRqYn 자동이체불능알림신청여부
	 */
	public void setAtsNaNtfcRqYn(String atsNaNtfcRqYn){
		this.atsNaNtfcRqYn= atsNaNtfcRqYn;
		this.setIsSet_atsNaNtfcRqYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_acldFndTsXprNtfcRqYn= false;
	protected final boolean isSet_acldFndTsXprNtfcRqYn(){
		return this.isSet_acldFndTsXprNtfcRqYn;
	}
	private void setIsSet_acldFndTsXprNtfcRqYn(boolean value){
		this.isSet_acldFndTsXprNtfcRqYn= value;
	}
	/**
	 * 적립펀드이체만기알림신청여부
	 */
	@XmlTransient
	public String getAcldFndTsXprNtfcRqYn(){
		return this.acldFndTsXprNtfcRqYn;
	}
	
	/**
	 * 적립펀드이체만기알림신청여부
	 * 
	 * @param acldFndTsXprNtfcRqYn 적립펀드이체만기알림신청여부
	 */
	public void setAcldFndTsXprNtfcRqYn(String acldFndTsXprNtfcRqYn){
		this.acldFndTsXprNtfcRqYn= acldFndTsXprNtfcRqYn;
		this.setIsSet_acldFndTsXprNtfcRqYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_fwxcAcno= false;
	protected final boolean isSet_fwxcAcno(){
		return this.isSet_fwxcAcno;
	}
	private void setIsSet_fwxcAcno(boolean value){
		this.isSet_fwxcAcno= value;
	}
	/**
	 * 선물환계좌번호
	 */
	@XmlTransient
	public String getFwxcAcno(){
		return this.fwxcAcno;
	}
	
	/**
	 * 선물환계좌번호
	 * 
	 * @param fwxcAcno 선물환계좌번호
	 */
	public void setFwxcAcno(String fwxcAcno){
		this.fwxcAcno= fwxcAcno;
		this.setIsSet_fwxcAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_fndCnvrTmntAcno= false;
	protected final boolean isSet_fndCnvrTmntAcno(){
		return this.isSet_fndCnvrTmntAcno;
	}
	private void setIsSet_fndCnvrTmntAcno(boolean value){
		this.isSet_fndCnvrTmntAcno= value;
	}
	/**
	 * 펀드전환해지계좌번호
	 */
	@XmlTransient
	public String getFndCnvrTmntAcno(){
		return this.fndCnvrTmntAcno;
	}
	
	/**
	 * 펀드전환해지계좌번호
	 * 
	 * @param fndCnvrTmntAcno 펀드전환해지계좌번호
	 */
	public void setFndCnvrTmntAcno(String fndCnvrTmntAcno){
		this.fndCnvrTmntAcno= fndCnvrTmntAcno;
		this.setIsSet_fndCnvrTmntAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dvdamRinvDscd= false;
	protected final boolean isSet_dvdamRinvDscd(){
		return this.isSet_dvdamRinvDscd;
	}
	private void setIsSet_dvdamRinvDscd(boolean value){
		this.isSet_dvdamRinvDscd= value;
	}
	/**
	 * 배당금재투자구분코드
	 */
	@XmlTransient
	public String getDvdamRinvDscd(){
		return this.dvdamRinvDscd;
	}
	
	/**
	 * 배당금재투자구분코드
	 * 
	 * @param dvdamRinvDscd 배당금재투자구분코드
	 */
	public void setDvdamRinvDscd(String dvdamRinvDscd){
		this.dvdamRinvDscd= dvdamRinvDscd;
		this.setIsSet_dvdamRinvDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_fndCnvrNewYn= false;
	protected final boolean isSet_fndCnvrNewYn(){
		return this.isSet_fndCnvrNewYn;
	}
	private void setIsSet_fndCnvrNewYn(boolean value){
		this.isSet_fndCnvrNewYn= value;
	}
	/**
	 * 펀드전환신규여부
	 */
	@XmlTransient
	public String getFndCnvrNewYn(){
		return this.fndCnvrNewYn;
	}
	
	/**
	 * 펀드전환신규여부
	 * 
	 * @param fndCnvrNewYn 펀드전환신규여부
	 */
	public void setFndCnvrNewYn(String fndCnvrNewYn){
		this.fndCnvrNewYn= fndCnvrNewYn;
		this.setIsSet_fndCnvrNewYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_lonXprAdvnYn= false;
	protected final boolean isSet_lonXprAdvnYn(){
		return this.isSet_lonXprAdvnYn;
	}
	private void setIsSet_lonXprAdvnYn(boolean value){
		this.isSet_lonXprAdvnYn= value;
	}
	/**
	 * 여신만기도래여부
	 */
	@XmlTransient
	public String getLonXprAdvnYn(){
		return this.lonXprAdvnYn;
	}
	
	/**
	 * 여신만기도래여부
	 * 
	 * @param lonXprAdvnYn 여신만기도래여부
	 */
	public void setLonXprAdvnYn(String lonXprAdvnYn){
		this.lonXprAdvnYn= lonXprAdvnYn;
		this.setIsSet_lonXprAdvnYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_lnApvCmplYn= false;
	protected final boolean isSet_lnApvCmplYn(){
		return this.isSet_lnApvCmplYn;
	}
	private void setIsSet_lnApvCmplYn(boolean value){
		this.isSet_lnApvCmplYn= value;
	}
	/**
	 * 대출승인완료여부
	 */
	@XmlTransient
	public String getLnApvCmplYn(){
		return this.lnApvCmplYn;
	}
	
	/**
	 * 대출승인완료여부
	 * 
	 * @param lnApvCmplYn 대출승인완료여부
	 */
	public void setLnApvCmplYn(String lnApvCmplYn){
		this.lnApvCmplYn= lnApvCmplYn;
		this.setIsSet_lnApvCmplYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_priPrpeBrNm= false;
	protected final boolean isSet_priPrpeBrNm(){
		return this.isSet_priPrpeBrNm;
	}
	private void setIsSet_priPrpeBrNm(boolean value){
		this.isSet_priPrpeBrNm= value;
	}
	/**
	 * 우선수익자지점명
	 */
	@XmlTransient
	public String getPriPrpeBrNm(){
		return this.priPrpeBrNm;
	}
	
	/**
	 * 우선수익자지점명
	 * 
	 * @param priPrpeBrNm 우선수익자지점명
	 */
	public void setPriPrpeBrNm(String priPrpeBrNm){
		this.priPrpeBrNm= priPrpeBrNm;
		this.setIsSet_priPrpeBrNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_grnTrno= false;
	protected final boolean isSet_grnTrno(){
		return this.isSet_grnTrno;
	}
	private void setIsSet_grnTrno(boolean value){
		this.isSet_grnTrno= value;
	}
	/**
	 * 보증거래번호
	 */
	@XmlTransient
	public String getGrnTrno(){
		return this.grnTrno;
	}
	
	/**
	 * 보증거래번호
	 * 
	 * @param grnTrno 보증거래번호
	 */
	public void setGrnTrno(String grnTrno){
		this.grnTrno= grnTrno;
		this.setIsSet_grnTrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_escrUnmrNo= false;
	protected final boolean isSet_escrUnmrNo(){
		return this.isSet_escrUnmrNo;
	}
	private void setIsSet_escrUnmrNo(boolean value){
		this.isSet_escrUnmrNo= value;
	}
	/**
	 * 에스크로조합원번호
	 */
	@XmlTransient
	public String getEscrUnmrNo(){
		return this.escrUnmrNo;
	}
	
	/**
	 * 에스크로조합원번호
	 * 
	 * @param escrUnmrNo 에스크로조합원번호
	 */
	public void setEscrUnmrNo(String escrUnmrNo){
		this.escrUnmrNo= escrUnmrNo;
		this.setIsSet_escrUnmrNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_priPrpeAcno= false;
	protected final boolean isSet_priPrpeAcno(){
		return this.isSet_priPrpeAcno;
	}
	private void setIsSet_priPrpeAcno(boolean value){
		this.isSet_priPrpeAcno= value;
	}
	/**
	 * 우선수익자계좌번호
	 */
	@XmlTransient
	public String getPriPrpeAcno(){
		return this.priPrpeAcno;
	}
	
	/**
	 * 우선수익자계좌번호
	 * 
	 * @param priPrpeAcno 우선수익자계좌번호
	 */
	public void setPriPrpeAcno(String priPrpeAcno){
		this.priPrpeAcno= priPrpeAcno;
		this.setIsSet_priPrpeAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_prpeAcno= false;
	protected final boolean isSet_prpeAcno(){
		return this.isSet_prpeAcno;
	}
	private void setIsSet_prpeAcno(boolean value){
		this.isSet_prpeAcno= value;
	}
	/**
	 * 수익자계좌번호
	 */
	@XmlTransient
	public String getPrpeAcno(){
		return this.prpeAcno;
	}
	
	/**
	 * 수익자계좌번호
	 * 
	 * @param prpeAcno 수익자계좌번호
	 */
	public void setPrpeAcno(String prpeAcno){
		this.prpeAcno= prpeAcno;
		this.setIsSet_prpeAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_priPrpeBzpeNo= false;
	protected final boolean isSet_priPrpeBzpeNo(){
		return this.isSet_priPrpeBzpeNo;
	}
	private void setIsSet_priPrpeBzpeNo(boolean value){
		this.isSet_priPrpeBzpeNo= value;
	}
	/**
	 * 우선수익자사업자번호
	 */
	@XmlTransient
	public String getPriPrpeBzpeNo(){
		return this.priPrpeBzpeNo;
	}
	
	/**
	 * 우선수익자사업자번호
	 * 
	 * @param priPrpeBzpeNo 우선수익자사업자번호
	 */
	public void setPriPrpeBzpeNo(String priPrpeBzpeNo){
		this.priPrpeBzpeNo= priPrpeBzpeNo;
		this.setIsSet_priPrpeBzpeNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_prpeBzpeNo= false;
	protected final boolean isSet_prpeBzpeNo(){
		return this.isSet_prpeBzpeNo;
	}
	private void setIsSet_prpeBzpeNo(boolean value){
		this.isSet_prpeBzpeNo= value;
	}
	/**
	 * 수익자사업자번호
	 */
	@XmlTransient
	public String getPrpeBzpeNo(){
		return this.prpeBzpeNo;
	}
	
	/**
	 * 수익자사업자번호
	 * 
	 * @param prpeBzpeNo 수익자사업자번호
	 */
	public void setPrpeBzpeNo(String prpeBzpeNo){
		this.prpeBzpeNo= prpeBzpeNo;
		this.setIsSet_prpeBzpeNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ppmtAmRcveAcno= false;
	protected final boolean isSet_ppmtAmRcveAcno(){
		return this.isSet_ppmtAmRcveAcno;
	}
	private void setIsSet_ppmtAmRcveAcno(boolean value){
		this.isSet_ppmtAmRcveAcno= value;
	}
	/**
	 * 선급금액수령계좌번호
	 */
	@XmlTransient
	public String getPpmtAmRcveAcno(){
		return this.ppmtAmRcveAcno;
	}
	
	/**
	 * 선급금액수령계좌번호
	 * 
	 * @param ppmtAmRcveAcno 선급금액수령계좌번호
	 */
	public void setPpmtAmRcveAcno(String ppmtAmRcveAcno){
		this.ppmtAmRcveAcno= ppmtAmRcveAcno;
		this.setIsSet_ppmtAmRcveAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_orcpPrpeCsno= false;
	protected final boolean isSet_orcpPrpeCsno(){
		return this.isSet_orcpPrpeCsno;
	}
	private void setIsSet_orcpPrpeCsno(boolean value){
		this.isSet_orcpPrpeCsno= value;
	}
	/**
	 * 원본수익자고객번호
	 */
	@XmlTransient
	public String getOrcpPrpeCsno(){
		return this.orcpPrpeCsno;
	}
	
	/**
	 * 원본수익자고객번호
	 * 
	 * @param orcpPrpeCsno 원본수익자고객번호
	 */
	public void setOrcpPrpeCsno(String orcpPrpeCsno){
		this.orcpPrpeCsno= orcpPrpeCsno;
		this.setIsSet_orcpPrpeCsno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pftPrpeCsno= false;
	protected final boolean isSet_pftPrpeCsno(){
		return this.isSet_pftPrpeCsno;
	}
	private void setIsSet_pftPrpeCsno(boolean value){
		this.isSet_pftPrpeCsno= value;
	}
	/**
	 * 이익수익자고객번호
	 */
	@XmlTransient
	public String getPftPrpeCsno(){
		return this.pftPrpeCsno;
	}
	
	/**
	 * 이익수익자고객번호
	 * 
	 * @param pftPrpeCsno 이익수익자고객번호
	 */
	public void setPftPrpeCsno(String pftPrpeCsno){
		this.pftPrpeCsno= pftPrpeCsno;
		this.setIsSet_pftPrpeCsno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_orcpPrpeNrsrCollYn= false;
	protected final boolean isSet_orcpPrpeNrsrCollYn(){
		return this.isSet_orcpPrpeNrsrCollYn;
	}
	private void setIsSet_orcpPrpeNrsrCollYn(boolean value){
		this.isSet_orcpPrpeNrsrCollYn= value;
	}
	/**
	 * 원본수익자비거주자징구여부
	 */
	@XmlTransient
	public String getOrcpPrpeNrsrCollYn(){
		return this.orcpPrpeNrsrCollYn;
	}
	
	/**
	 * 원본수익자비거주자징구여부
	 * 
	 * @param orcpPrpeNrsrCollYn 원본수익자비거주자징구여부
	 */
	public void setOrcpPrpeNrsrCollYn(String orcpPrpeNrsrCollYn){
		this.orcpPrpeNrsrCollYn= orcpPrpeNrsrCollYn;
		this.setIsSet_orcpPrpeNrsrCollYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pftPrpeNrsrCollYn= false;
	protected final boolean isSet_pftPrpeNrsrCollYn(){
		return this.isSet_pftPrpeNrsrCollYn;
	}
	private void setIsSet_pftPrpeNrsrCollYn(boolean value){
		this.isSet_pftPrpeNrsrCollYn= value;
	}
	/**
	 * 이익수익자비거주자징구여부
	 */
	@XmlTransient
	public String getPftPrpeNrsrCollYn(){
		return this.pftPrpeNrsrCollYn;
	}
	
	/**
	 * 이익수익자비거주자징구여부
	 * 
	 * @param pftPrpeNrsrCollYn 이익수익자비거주자징구여부
	 */
	public void setPftPrpeNrsrCollYn(String pftPrpeNrsrCollYn){
		this.pftPrpeNrsrCollYn= pftPrpeNrsrCollYn;
		this.setIsSet_pftPrpeNrsrCollYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pocpPfeAm= false;
	protected final boolean isSet_pocpPfeAm(){
		return this.isSet_pocpPfeAm;
	}
	private void setIsSet_pocpPfeAm(boolean value){
		this.isSet_pocpPfeAm= value;
	}
	/**
	 * 선취보수금액
	 * BigDecimal - Double value setter
	 *
	 * @Param pocpPfeAm 선취보수금액
	 */
	public void setPocpPfeAm(double pocpPfeAm) {
		setPocpPfeAm(BigDecimal.valueOf(pocpPfeAm));
	}
	/**
	 * 선취보수금액
	 * BigDecimal - Long value setter
	 *
	 * @Param pocpPfeAm 선취보수금액
	 */
	public void setPocpPfeAm(long pocpPfeAm) {
		setPocpPfeAm(BigDecimal.valueOf(pocpPfeAm));
	}
	/**
	 * 선취보수금액
	 * BigDecimal - String value setter
	 *
	 * @Param pocpPfeAm 선취보수금액
	 */
	public void setPocpPfeAm(String pocpPfeAm) {
		setPocpPfeAm(new BigDecimal(pocpPfeAm));
	}
	/**
	 * 선취보수금액
	 */
	@XmlTransient
	public BigDecimal getPocpPfeAm(){
		return this.pocpPfeAm;
	}
	
	/**
	 * 선취보수금액
	 * 
	 * @param pocpPfeAm 선취보수금액
	 */
	@JsonSetter("pocpPfeAm")
	public void setPocpPfeAm(BigDecimal pocpPfeAm){
		this.pocpPfeAm= pocpPfeAm;
		this.setIsSet_pocpPfeAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_etfTprt= false;
	protected final boolean isSet_etfTprt(){
		return this.isSet_etfTprt;
	}
	private void setIsSet_etfTprt(boolean value){
		this.isSet_etfTprt= value;
	}
	/**
	 * ETF목표수익율
	 */
	@XmlTransient
	public Integer getEtfTprt(){
		return this.etfTprt;
	}
	
	/**
	 * ETF목표수익율
	 * 
	 * @param etfTprt ETF목표수익율
	 */
	public void setEtfTprt(Integer etfTprt){
		this.etfTprt= etfTprt;
		this.setIsSet_etfTprt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_opgOrdsTxt= false;
	protected final boolean isSet_opgOrdsTxt(){
		return this.isSet_opgOrdsTxt;
	}
	private void setIsSet_opgOrdsTxt(boolean value){
		this.isSet_opgOrdsTxt= value;
	}
	/**
	 * 운용지시내용
	 */
	@XmlTransient
	public String getOpgOrdsTxt(){
		return this.opgOrdsTxt;
	}
	
	/**
	 * 운용지시내용
	 * 
	 * @param opgOrdsTxt 운용지시내용
	 */
	public void setOpgOrdsTxt(String opgOrdsTxt){
		this.opgOrdsTxt= opgOrdsTxt;
		this.setIsSet_opgOrdsTxt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_sa1Txt= false;
	protected final boolean isSet_sa1Txt(){
		return this.isSet_sa1Txt;
	}
	private void setIsSet_sa1Txt(boolean value){
		this.isSet_sa1Txt= value;
	}
	/**
	 * 특약1내용
	 */
	@XmlTransient
	public String getSa1Txt(){
		return this.sa1Txt;
	}
	
	/**
	 * 특약1내용
	 * 
	 * @param sa1Txt 특약1내용
	 */
	public void setSa1Txt(String sa1Txt){
		this.sa1Txt= sa1Txt;
		this.setIsSet_sa1Txt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_sa2Txt= false;
	protected final boolean isSet_sa2Txt(){
		return this.isSet_sa2Txt;
	}
	private void setIsSet_sa2Txt(boolean value){
		this.isSet_sa2Txt= value;
	}
	/**
	 * 특약2내용
	 */
	@XmlTransient
	public String getSa2Txt(){
		return this.sa2Txt;
	}
	
	/**
	 * 특약2내용
	 * 
	 * @param sa2Txt 특약2내용
	 */
	public void setSa2Txt(String sa2Txt){
		this.sa2Txt= sa2Txt;
		this.setIsSet_sa2Txt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_sa3Txt= false;
	protected final boolean isSet_sa3Txt(){
		return this.isSet_sa3Txt;
	}
	private void setIsSet_sa3Txt(boolean value){
		this.isSet_sa3Txt= value;
	}
	/**
	 * 특약3내용
	 */
	@XmlTransient
	public String getSa3Txt(){
		return this.sa3Txt;
	}
	
	/**
	 * 특약3내용
	 * 
	 * @param sa3Txt 특약3내용
	 */
	public void setSa3Txt(String sa3Txt){
		this.sa3Txt= sa3Txt;
		this.setIsSet_sa3Txt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_sptxYn= false;
	protected final boolean isSet_sptxYn(){
		return this.isSet_sptxYn;
	}
	private void setIsSet_sptxYn(boolean value){
		this.isSet_sptxYn= value;
	}
	/**
	 * 분리과세여부
	 */
	@XmlTransient
	public String getSptxYn(){
		return this.sptxYn;
	}
	
	/**
	 * 분리과세여부
	 * 
	 * @param sptxYn 분리과세여부
	 */
	public void setSptxYn(String sptxYn){
		this.sptxYn= sptxYn;
		this.setIsSet_sptxYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_nnmCsno= false;
	protected final boolean isSet_nnmCsno(){
		return this.isSet_nnmCsno;
	}
	private void setIsSet_nnmCsno(boolean value){
		this.isSet_nnmCsno= value;
	}
	/**
	 * 무기명고객번호
	 */
	@XmlTransient
	public String getNnmCsno(){
		return this.nnmCsno;
	}
	
	/**
	 * 무기명고객번호
	 * 
	 * @param nnmCsno 무기명고객번호
	 */
	public void setNnmCsno(String nnmCsno){
		this.nnmCsno= nnmCsno;
		this.setIsSet_nnmCsno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_fndItmsCd= false;
	protected final boolean isSet_fndItmsCd(){
		return this.isSet_fndItmsCd;
	}
	private void setIsSet_fndItmsCd(boolean value){
		this.isSet_fndItmsCd= value;
	}
	/**
	 * 펀드종목코드
	 */
	@XmlTransient
	public String getFndItmsCd(){
		return this.fndItmsCd;
	}
	
	/**
	 * 펀드종목코드
	 * 
	 * @param fndItmsCd 펀드종목코드
	 */
	public void setFndItmsCd(String fndItmsCd){
		this.fndItmsCd= fndItmsCd;
		this.setIsSet_fndItmsCd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dpsRcvAm= false;
	protected final boolean isSet_dpsRcvAm(){
		return this.isSet_dpsRcvAm;
	}
	private void setIsSet_dpsRcvAm(boolean value){
		this.isSet_dpsRcvAm= value;
	}
	/**
	 * 수신입금금액
	 * BigDecimal - Double value setter
	 *
	 * @Param dpsRcvAm 수신입금금액
	 */
	public void setDpsRcvAm(double dpsRcvAm) {
		setDpsRcvAm(BigDecimal.valueOf(dpsRcvAm));
	}
	/**
	 * 수신입금금액
	 * BigDecimal - Long value setter
	 *
	 * @Param dpsRcvAm 수신입금금액
	 */
	public void setDpsRcvAm(long dpsRcvAm) {
		setDpsRcvAm(BigDecimal.valueOf(dpsRcvAm));
	}
	/**
	 * 수신입금금액
	 * BigDecimal - String value setter
	 *
	 * @Param dpsRcvAm 수신입금금액
	 */
	public void setDpsRcvAm(String dpsRcvAm) {
		setDpsRcvAm(new BigDecimal(dpsRcvAm));
	}
	/**
	 * 수신입금금액
	 */
	@XmlTransient
	public BigDecimal getDpsRcvAm(){
		return this.dpsRcvAm;
	}
	
	/**
	 * 수신입금금액
	 * 
	 * @param dpsRcvAm 수신입금금액
	 */
	@JsonSetter("dpsRcvAm")
	public void setDpsRcvAm(BigDecimal dpsRcvAm){
		this.dpsRcvAm= dpsRcvAm;
		this.setIsSet_dpsRcvAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_trfAm= false;
	protected final boolean isSet_trfAm(){
		return this.isSet_trfAm;
	}
	private void setIsSet_trfAm(boolean value){
		this.isSet_trfAm= value;
	}
	/**
	 * 대체금액
	 * BigDecimal - Double value setter
	 *
	 * @Param trfAm 대체금액
	 */
	public void setTrfAm(double trfAm) {
		setTrfAm(BigDecimal.valueOf(trfAm));
	}
	/**
	 * 대체금액
	 * BigDecimal - Long value setter
	 *
	 * @Param trfAm 대체금액
	 */
	public void setTrfAm(long trfAm) {
		setTrfAm(BigDecimal.valueOf(trfAm));
	}
	/**
	 * 대체금액
	 * BigDecimal - String value setter
	 *
	 * @Param trfAm 대체금액
	 */
	public void setTrfAm(String trfAm) {
		setTrfAm(new BigDecimal(trfAm));
	}
	/**
	 * 대체금액
	 */
	@XmlTransient
	public BigDecimal getTrfAm(){
		return this.trfAm;
	}
	
	/**
	 * 대체금액
	 * 
	 * @param trfAm 대체금액
	 */
	@JsonSetter("trfAm")
	public void setTrfAm(BigDecimal trfAm){
		this.trfAm= trfAm;
		this.setIsSet_trfAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_bchkAm= false;
	protected final boolean isSet_bchkAm(){
		return this.isSet_bchkAm;
	}
	private void setIsSet_bchkAm(boolean value){
		this.isSet_bchkAm= value;
	}
	/**
	 * 자기앞수표금액
	 * BigDecimal - Double value setter
	 *
	 * @Param bchkAm 자기앞수표금액
	 */
	public void setBchkAm(double bchkAm) {
		setBchkAm(BigDecimal.valueOf(bchkAm));
	}
	/**
	 * 자기앞수표금액
	 * BigDecimal - Long value setter
	 *
	 * @Param bchkAm 자기앞수표금액
	 */
	public void setBchkAm(long bchkAm) {
		setBchkAm(BigDecimal.valueOf(bchkAm));
	}
	/**
	 * 자기앞수표금액
	 * BigDecimal - String value setter
	 *
	 * @Param bchkAm 자기앞수표금액
	 */
	public void setBchkAm(String bchkAm) {
		setBchkAm(new BigDecimal(bchkAm));
	}
	/**
	 * 자기앞수표금액
	 */
	@XmlTransient
	public BigDecimal getBchkAm(){
		return this.bchkAm;
	}
	
	/**
	 * 자기앞수표금액
	 * 
	 * @param bchkAm 자기앞수표금액
	 */
	@JsonSetter("bchkAm")
	public void setBchkAm(BigDecimal bchkAm){
		this.bchkAm= bchkAm;
		this.setIsSet_bchkAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_bchkInqmAm= false;
	protected final boolean isSet_bchkInqmAm(){
		return this.isSet_bchkInqmAm;
	}
	private void setIsSet_bchkInqmAm(boolean value){
		this.isSet_bchkInqmAm= value;
	}
	/**
	 * 자기앞수표조회필금액
	 * BigDecimal - Double value setter
	 *
	 * @Param bchkInqmAm 자기앞수표조회필금액
	 */
	public void setBchkInqmAm(double bchkInqmAm) {
		setBchkInqmAm(BigDecimal.valueOf(bchkInqmAm));
	}
	/**
	 * 자기앞수표조회필금액
	 * BigDecimal - Long value setter
	 *
	 * @Param bchkInqmAm 자기앞수표조회필금액
	 */
	public void setBchkInqmAm(long bchkInqmAm) {
		setBchkInqmAm(BigDecimal.valueOf(bchkInqmAm));
	}
	/**
	 * 자기앞수표조회필금액
	 * BigDecimal - String value setter
	 *
	 * @Param bchkInqmAm 자기앞수표조회필금액
	 */
	public void setBchkInqmAm(String bchkInqmAm) {
		setBchkInqmAm(new BigDecimal(bchkInqmAm));
	}
	/**
	 * 자기앞수표조회필금액
	 */
	@XmlTransient
	public BigDecimal getBchkInqmAm(){
		return this.bchkInqmAm;
	}
	
	/**
	 * 자기앞수표조회필금액
	 * 
	 * @param bchkInqmAm 자기앞수표조회필금액
	 */
	@JsonSetter("bchkInqmAm")
	public void setBchkInqmAm(BigDecimal bchkInqmAm){
		this.bchkInqmAm= bchkInqmAm;
		this.setIsSet_bchkInqmAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_inqmScnt= false;
	protected final boolean isSet_inqmScnt(){
		return this.isSet_inqmScnt;
	}
	private void setIsSet_inqmScnt(boolean value){
		this.isSet_inqmScnt= value;
	}
	/**
	 * 조회필매수
	 */
	@XmlTransient
	public Integer getInqmScnt(){
		return this.inqmScnt;
	}
	
	/**
	 * 조회필매수
	 * 
	 * @param inqmScnt 조회필매수
	 */
	public void setInqmScnt(Integer inqmScnt){
		this.inqmScnt= inqmScnt;
		this.setIsSet_inqmScnt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_inqmFeeXmpDis= false;
	protected final boolean isSet_inqmFeeXmpDis(){
		return this.isSet_inqmFeeXmpDis;
	}
	private void setIsSet_inqmFeeXmpDis(boolean value){
		this.isSet_inqmFeeXmpDis= value;
	}
	/**
	 * 조회필수수료면제구분
	 */
	@XmlTransient
	public String getInqmFeeXmpDis(){
		return this.inqmFeeXmpDis;
	}
	
	/**
	 * 조회필수수료면제구분
	 * 
	 * @param inqmFeeXmpDis 조회필수수료면제구분
	 */
	public void setInqmFeeXmpDis(String inqmFeeXmpDis){
		this.inqmFeeXmpDis= inqmFeeXmpDis;
		this.setIsSet_inqmFeeXmpDis(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_tamTrfYn= false;
	protected final boolean isSet_tamTrfYn(){
		return this.isSet_tamTrfYn;
	}
	private void setIsSet_tamTrfYn(boolean value){
		this.isSet_tamTrfYn= value;
	}
	/**
	 * 전액대체여부
	 */
	@XmlTransient
	public String getTamTrfYn(){
		return this.tamTrfYn;
	}
	
	/**
	 * 전액대체여부
	 * 
	 * @param tamTrfYn 전액대체여부
	 */
	public void setTamTrfYn(String tamTrfYn){
		this.tamTrfYn= tamTrfYn;
		this.setIsSet_tamTrfYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pxrt= false;
	protected final boolean isSet_pxrt(){
		return this.isSet_pxrt;
	}
	private void setIsSet_pxrt(boolean value){
		this.isSet_pxrt= value;
	}
	/**
	 * 우대환율
	 */
	@XmlTransient
	public Integer getPxrt(){
		return this.pxrt;
	}
	
	/**
	 * 우대환율
	 * 
	 * @param pxrt 우대환율
	 */
	public void setPxrt(Integer pxrt){
		this.pxrt= pxrt;
		this.setIsSet_pxrt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_krwTrfAm= false;
	protected final boolean isSet_krwTrfAm(){
		return this.isSet_krwTrfAm;
	}
	private void setIsSet_krwTrfAm(boolean value){
		this.isSet_krwTrfAm= value;
	}
	/**
	 * 원화대체금액
	 * BigDecimal - Double value setter
	 *
	 * @Param krwTrfAm 원화대체금액
	 */
	public void setKrwTrfAm(double krwTrfAm) {
		setKrwTrfAm(BigDecimal.valueOf(krwTrfAm));
	}
	/**
	 * 원화대체금액
	 * BigDecimal - Long value setter
	 *
	 * @Param krwTrfAm 원화대체금액
	 */
	public void setKrwTrfAm(long krwTrfAm) {
		setKrwTrfAm(BigDecimal.valueOf(krwTrfAm));
	}
	/**
	 * 원화대체금액
	 * BigDecimal - String value setter
	 *
	 * @Param krwTrfAm 원화대체금액
	 */
	public void setKrwTrfAm(String krwTrfAm) {
		setKrwTrfAm(new BigDecimal(krwTrfAm));
	}
	/**
	 * 원화대체금액
	 */
	@XmlTransient
	public BigDecimal getKrwTrfAm(){
		return this.krwTrfAm;
	}
	
	/**
	 * 원화대체금액
	 * 
	 * @param krwTrfAm 원화대체금액
	 */
	@JsonSetter("krwTrfAm")
	public void setKrwTrfAm(BigDecimal krwTrfAm){
		this.krwTrfAm= krwTrfAm;
		this.setIsSet_krwTrfAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cucd= false;
	protected final boolean isSet_cucd(){
		return this.isSet_cucd;
	}
	private void setIsSet_cucd(boolean value){
		this.isSet_cucd= value;
	}
	/**
	 * 통화코드
	 */
	@XmlTransient
	public String getCucd(){
		return this.cucd;
	}
	
	/**
	 * 통화코드
	 * 
	 * @param cucd 통화코드
	 */
	public void setCucd(String cucd){
		this.cucd= cucd;
		this.setIsSet_cucd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ioffSbDscd= false;
	protected final boolean isSet_ioffSbDscd(){
		return this.isSet_ioffSbDscd;
	}
	private void setIsSet_ioffSbDscd(boolean value){
		this.isSet_ioffSbDscd= value;
	}
	/**
	 * 본지점매매구분코드
	 */
	@XmlTransient
	public String getIoffSbDscd(){
		return this.ioffSbDscd;
	}
	
	/**
	 * 본지점매매구분코드
	 * 
	 * @param ioffSbDscd 본지점매매구분코드
	 */
	public void setIoffSbDscd(String ioffSbDscd){
		this.ioffSbDscd= ioffSbDscd;
		this.setIsSet_ioffSbDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cshtfDscd= false;
	protected final boolean isSet_cshtfDscd(){
		return this.isSet_cshtfDscd;
	}
	private void setIsSet_cshtfDscd(boolean value){
		this.isSet_cshtfDscd= value;
	}
	/**
	 * 현금대체구분코드
	 */
	@XmlTransient
	public String getCshtfDscd(){
		return this.cshtfDscd;
	}
	
	/**
	 * 현금대체구분코드
	 * 
	 * @param cshtfDscd 현금대체구분코드
	 */
	public void setCshtfDscd(String cshtfDscd){
		this.cshtfDscd= cshtfDscd;
		this.setIsSet_cshtfDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cshFeeLevyDscd= false;
	protected final boolean isSet_cshFeeLevyDscd(){
		return this.isSet_cshFeeLevyDscd;
	}
	private void setIsSet_cshFeeLevyDscd(boolean value){
		this.isSet_cshFeeLevyDscd= value;
	}
	/**
	 * 현찰수수료징수구분코드
	 */
	@XmlTransient
	public String getCshFeeLevyDscd(){
		return this.cshFeeLevyDscd;
	}
	
	/**
	 * 현찰수수료징수구분코드
	 * 
	 * @param cshFeeLevyDscd 현찰수수료징수구분코드
	 */
	public void setCshFeeLevyDscd(String cshFeeLevyDscd){
		this.cshFeeLevyDscd= cshFeeLevyDscd;
		this.setIsSet_cshFeeLevyDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cshFee= false;
	protected final boolean isSet_cshFee(){
		return this.isSet_cshFee;
	}
	private void setIsSet_cshFee(boolean value){
		this.isSet_cshFee= value;
	}
	/**
	 * 현찰수수료
	 * BigDecimal - Double value setter
	 *
	 * @Param cshFee 현찰수수료
	 */
	public void setCshFee(double cshFee) {
		setCshFee(BigDecimal.valueOf(cshFee));
	}
	/**
	 * 현찰수수료
	 * BigDecimal - Long value setter
	 *
	 * @Param cshFee 현찰수수료
	 */
	public void setCshFee(long cshFee) {
		setCshFee(BigDecimal.valueOf(cshFee));
	}
	/**
	 * 현찰수수료
	 * BigDecimal - String value setter
	 *
	 * @Param cshFee 현찰수수료
	 */
	public void setCshFee(String cshFee) {
		setCshFee(new BigDecimal(cshFee));
	}
	/**
	 * 현찰수수료
	 */
	@XmlTransient
	public BigDecimal getCshFee(){
		return this.cshFee;
	}
	
	/**
	 * 현찰수수료
	 * 
	 * @param cshFee 현찰수수료
	 */
	@JsonSetter("cshFee")
	public void setCshFee(BigDecimal cshFee){
		this.cshFee= cshFee;
		this.setIsSet_cshFee(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_tgtKrwAm= false;
	protected final boolean isSet_tgtKrwAm(){
		return this.isSet_tgtKrwAm;
	}
	private void setIsSet_tgtKrwAm(boolean value){
		this.isSet_tgtKrwAm= value;
	}
	/**
	 * 대상원화금액
	 * BigDecimal - Double value setter
	 *
	 * @Param tgtKrwAm 대상원화금액
	 */
	public void setTgtKrwAm(double tgtKrwAm) {
		setTgtKrwAm(BigDecimal.valueOf(tgtKrwAm));
	}
	/**
	 * 대상원화금액
	 * BigDecimal - Long value setter
	 *
	 * @Param tgtKrwAm 대상원화금액
	 */
	public void setTgtKrwAm(long tgtKrwAm) {
		setTgtKrwAm(BigDecimal.valueOf(tgtKrwAm));
	}
	/**
	 * 대상원화금액
	 * BigDecimal - String value setter
	 *
	 * @Param tgtKrwAm 대상원화금액
	 */
	public void setTgtKrwAm(String tgtKrwAm) {
		setTgtKrwAm(new BigDecimal(tgtKrwAm));
	}
	/**
	 * 대상원화금액
	 */
	@XmlTransient
	public BigDecimal getTgtKrwAm(){
		return this.tgtKrwAm;
	}
	
	/**
	 * 대상원화금액
	 * 
	 * @param tgtKrwAm 대상원화금액
	 */
	@JsonSetter("tgtKrwAm")
	public void setTgtKrwAm(BigDecimal tgtKrwAm){
		this.tgtKrwAm= tgtKrwAm;
		this.setIsSet_tgtKrwAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_fcTrfAm= false;
	protected final boolean isSet_fcTrfAm(){
		return this.isSet_fcTrfAm;
	}
	private void setIsSet_fcTrfAm(boolean value){
		this.isSet_fcTrfAm= value;
	}
	/**
	 * 외화대체금액
	 * BigDecimal - Double value setter
	 *
	 * @Param fcTrfAm 외화대체금액
	 */
	public void setFcTrfAm(double fcTrfAm) {
		setFcTrfAm(BigDecimal.valueOf(fcTrfAm));
	}
	/**
	 * 외화대체금액
	 * BigDecimal - Long value setter
	 *
	 * @Param fcTrfAm 외화대체금액
	 */
	public void setFcTrfAm(long fcTrfAm) {
		setFcTrfAm(BigDecimal.valueOf(fcTrfAm));
	}
	/**
	 * 외화대체금액
	 * BigDecimal - String value setter
	 *
	 * @Param fcTrfAm 외화대체금액
	 */
	public void setFcTrfAm(String fcTrfAm) {
		setFcTrfAm(new BigDecimal(fcTrfAm));
	}
	/**
	 * 외화대체금액
	 */
	@XmlTransient
	public BigDecimal getFcTrfAm(){
		return this.fcTrfAm;
	}
	
	/**
	 * 외화대체금액
	 * 
	 * @param fcTrfAm 외화대체금액
	 */
	@JsonSetter("fcTrfAm")
	public void setFcTrfAm(BigDecimal fcTrfAm){
		this.fcTrfAm= fcTrfAm;
		this.setIsSet_fcTrfAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_fcCshRcvAm= false;
	protected final boolean isSet_fcCshRcvAm(){
		return this.isSet_fcCshRcvAm;
	}
	private void setIsSet_fcCshRcvAm(boolean value){
		this.isSet_fcCshRcvAm= value;
	}
	/**
	 * 외화현찰입금금액
	 * BigDecimal - Double value setter
	 *
	 * @Param fcCshRcvAm 외화현찰입금금액
	 */
	public void setFcCshRcvAm(double fcCshRcvAm) {
		setFcCshRcvAm(BigDecimal.valueOf(fcCshRcvAm));
	}
	/**
	 * 외화현찰입금금액
	 * BigDecimal - Long value setter
	 *
	 * @Param fcCshRcvAm 외화현찰입금금액
	 */
	public void setFcCshRcvAm(long fcCshRcvAm) {
		setFcCshRcvAm(BigDecimal.valueOf(fcCshRcvAm));
	}
	/**
	 * 외화현찰입금금액
	 * BigDecimal - String value setter
	 *
	 * @Param fcCshRcvAm 외화현찰입금금액
	 */
	public void setFcCshRcvAm(String fcCshRcvAm) {
		setFcCshRcvAm(new BigDecimal(fcCshRcvAm));
	}
	/**
	 * 외화현찰입금금액
	 */
	@XmlTransient
	public BigDecimal getFcCshRcvAm(){
		return this.fcCshRcvAm;
	}
	
	/**
	 * 외화현찰입금금액
	 * 
	 * @param fcCshRcvAm 외화현찰입금금액
	 */
	@JsonSetter("fcCshRcvAm")
	public void setFcCshRcvAm(BigDecimal fcCshRcvAm){
		this.fcCshRcvAm= fcCshRcvAm;
		this.setIsSet_fcCshRcvAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_coinAm= false;
	protected final boolean isSet_coinAm(){
		return this.isSet_coinAm;
	}
	private void setIsSet_coinAm(boolean value){
		this.isSet_coinAm= value;
	}
	/**
	 * 주화금액
	 * BigDecimal - Double value setter
	 *
	 * @Param coinAm 주화금액
	 */
	public void setCoinAm(double coinAm) {
		setCoinAm(BigDecimal.valueOf(coinAm));
	}
	/**
	 * 주화금액
	 * BigDecimal - Long value setter
	 *
	 * @Param coinAm 주화금액
	 */
	public void setCoinAm(long coinAm) {
		setCoinAm(BigDecimal.valueOf(coinAm));
	}
	/**
	 * 주화금액
	 * BigDecimal - String value setter
	 *
	 * @Param coinAm 주화금액
	 */
	public void setCoinAm(String coinAm) {
		setCoinAm(new BigDecimal(coinAm));
	}
	/**
	 * 주화금액
	 */
	@XmlTransient
	public BigDecimal getCoinAm(){
		return this.coinAm;
	}
	
	/**
	 * 주화금액
	 * 
	 * @param coinAm 주화금액
	 */
	@JsonSetter("coinAm")
	public void setCoinAm(BigDecimal coinAm){
		this.coinAm= coinAm;
		this.setIsSet_coinAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_krfd= false;
	protected final boolean isSet_krfd(){
		return this.isSet_krfd;
	}
	private void setIsSet_krfd(boolean value){
		this.isSet_krfd= value;
	}
	/**
	 * 원화자금
	 * BigDecimal - Double value setter
	 *
	 * @Param krfd 원화자금
	 */
	public void setKrfd(double krfd) {
		setKrfd(BigDecimal.valueOf(krfd));
	}
	/**
	 * 원화자금
	 * BigDecimal - Long value setter
	 *
	 * @Param krfd 원화자금
	 */
	public void setKrfd(long krfd) {
		setKrfd(BigDecimal.valueOf(krfd));
	}
	/**
	 * 원화자금
	 * BigDecimal - String value setter
	 *
	 * @Param krfd 원화자금
	 */
	public void setKrfd(String krfd) {
		setKrfd(new BigDecimal(krfd));
	}
	/**
	 * 원화자금
	 */
	@XmlTransient
	public BigDecimal getKrfd(){
		return this.krfd;
	}
	
	/**
	 * 원화자금
	 * 
	 * @param krfd 원화자금
	 */
	@JsonSetter("krfd")
	public void setKrfd(BigDecimal krfd){
		this.krfd= krfd;
		this.setIsSet_krfd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_apxrt= false;
	protected final boolean isSet_apxrt(){
		return this.isSet_apxrt;
	}
	private void setIsSet_apxrt(boolean value){
		this.isSet_apxrt= value;
	}
	/**
	 * 적용환율
	 * BigDecimal - Double value setter
	 *
	 * @Param apxrt 적용환율
	 */
	public void setApxrt(double apxrt) {
		setApxrt(BigDecimal.valueOf(apxrt));
	}
	/**
	 * 적용환율
	 * BigDecimal - Long value setter
	 *
	 * @Param apxrt 적용환율
	 */
	public void setApxrt(long apxrt) {
		setApxrt(BigDecimal.valueOf(apxrt));
	}
	/**
	 * 적용환율
	 * BigDecimal - String value setter
	 *
	 * @Param apxrt 적용환율
	 */
	public void setApxrt(String apxrt) {
		setApxrt(new BigDecimal(apxrt));
	}
	/**
	 * 적용환율
	 */
	@XmlTransient
	public BigDecimal getApxrt(){
		return this.apxrt;
	}
	
	/**
	 * 적용환율
	 * 
	 * @param apxrt 적용환율
	 */
	@JsonSetter("apxrt")
	public void setApxrt(BigDecimal apxrt){
		this.apxrt= apxrt;
		this.setIsSet_apxrt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cusPrmeXrt= false;
	protected final boolean isSet_cusPrmeXrt(){
		return this.isSet_cusPrmeXrt;
	}
	private void setIsSet_cusPrmeXrt(boolean value){
		this.isSet_cusPrmeXrt= value;
	}
	/**
	 * 고객우대환율
	 * BigDecimal - Double value setter
	 *
	 * @Param cusPrmeXrt 고객우대환율
	 */
	public void setCusPrmeXrt(double cusPrmeXrt) {
		setCusPrmeXrt(BigDecimal.valueOf(cusPrmeXrt));
	}
	/**
	 * 고객우대환율
	 * BigDecimal - Long value setter
	 *
	 * @Param cusPrmeXrt 고객우대환율
	 */
	public void setCusPrmeXrt(long cusPrmeXrt) {
		setCusPrmeXrt(BigDecimal.valueOf(cusPrmeXrt));
	}
	/**
	 * 고객우대환율
	 * BigDecimal - String value setter
	 *
	 * @Param cusPrmeXrt 고객우대환율
	 */
	public void setCusPrmeXrt(String cusPrmeXrt) {
		setCusPrmeXrt(new BigDecimal(cusPrmeXrt));
	}
	/**
	 * 고객우대환율
	 */
	@XmlTransient
	public BigDecimal getCusPrmeXrt(){
		return this.cusPrmeXrt;
	}
	
	/**
	 * 고객우대환율
	 * 
	 * @param cusPrmeXrt 고객우대환율
	 */
	@JsonSetter("cusPrmeXrt")
	public void setCusPrmeXrt(BigDecimal cusPrmeXrt){
		this.cusPrmeXrt= cusPrmeXrt;
		this.setIsSet_cusPrmeXrt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ioffSbRt= false;
	protected final boolean isSet_ioffSbRt(){
		return this.isSet_ioffSbRt;
	}
	private void setIsSet_ioffSbRt(boolean value){
		this.isSet_ioffSbRt= value;
	}
	/**
	 * 본지점매매율
	 * BigDecimal - Double value setter
	 *
	 * @Param ioffSbRt 본지점매매율
	 */
	public void setIoffSbRt(double ioffSbRt) {
		setIoffSbRt(BigDecimal.valueOf(ioffSbRt));
	}
	/**
	 * 본지점매매율
	 * BigDecimal - Long value setter
	 *
	 * @Param ioffSbRt 본지점매매율
	 */
	public void setIoffSbRt(long ioffSbRt) {
		setIoffSbRt(BigDecimal.valueOf(ioffSbRt));
	}
	/**
	 * 본지점매매율
	 * BigDecimal - String value setter
	 *
	 * @Param ioffSbRt 본지점매매율
	 */
	public void setIoffSbRt(String ioffSbRt) {
		setIoffSbRt(new BigDecimal(ioffSbRt));
	}
	/**
	 * 본지점매매율
	 */
	@XmlTransient
	public BigDecimal getIoffSbRt(){
		return this.ioffSbRt;
	}
	
	/**
	 * 본지점매매율
	 * 
	 * @param ioffSbRt 본지점매매율
	 */
	@JsonSetter("ioffSbRt")
	public void setIoffSbRt(BigDecimal ioffSbRt){
		this.ioffSbRt= ioffSbRt;
		this.setIsSet_ioffSbRt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_fwxcCtrMcnt= false;
	protected final boolean isSet_fwxcCtrMcnt(){
		return this.isSet_fwxcCtrMcnt;
	}
	private void setIsSet_fwxcCtrMcnt(boolean value){
		this.isSet_fwxcCtrMcnt= value;
	}
	/**
	 * 선물환계약월수
	 */
	@XmlTransient
	public String getFwxcCtrMcnt(){
		return this.fwxcCtrMcnt;
	}
	
	/**
	 * 선물환계약월수
	 * 
	 * @param fwxcCtrMcnt 선물환계약월수
	 */
	public void setFwxcCtrMcnt(String fwxcCtrMcnt){
		this.fwxcCtrMcnt= fwxcCtrMcnt;
		this.setIsSet_fwxcCtrMcnt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_newAcno= false;
	protected final boolean isSet_newAcno(){
		return this.isSet_newAcno;
	}
	private void setIsSet_newAcno(boolean value){
		this.isSet_newAcno= value;
	}
	/**
	 * 신규계좌번호
	 */
	@XmlTransient
	public String getNewAcno(){
		return this.newAcno;
	}
	
	/**
	 * 신규계좌번호
	 * 
	 * @param newAcno 신규계좌번호
	 */
	public void setNewAcno(String newAcno){
		this.newAcno= newAcno;
		this.setIsSet_newAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ksdFndNo= false;
	protected final boolean isSet_ksdFndNo(){
		return this.isSet_ksdFndNo;
	}
	private void setIsSet_ksdFndNo(boolean value){
		this.isSet_ksdFndNo= value;
	}
	/**
	 * 증권예탁원펀드번호
	 */
	@XmlTransient
	public String getKsdFndNo(){
		return this.ksdFndNo;
	}
	
	/**
	 * 증권예탁원펀드번호
	 * 
	 * @param ksdFndNo 증권예탁원펀드번호
	 */
	public void setKsdFndNo(String ksdFndNo){
		this.ksdFndNo= ksdFndNo;
		this.setIsSet_ksdFndNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rtpenTrnDisNo= false;
	protected final boolean isSet_rtpenTrnDisNo(){
		return this.isSet_rtpenTrnDisNo;
	}
	private void setIsSet_rtpenTrnDisNo(boolean value){
		this.isSet_rtpenTrnDisNo= value;
	}
	/**
	 * 퇴직연금거래구분번호
	 */
	@XmlTransient
	public String getRtpenTrnDisNo(){
		return this.rtpenTrnDisNo;
	}
	
	/**
	 * 퇴직연금거래구분번호
	 * 
	 * @param rtpenTrnDisNo 퇴직연금거래구분번호
	 */
	public void setRtpenTrnDisNo(String rtpenTrnDisNo){
		this.rtpenTrnDisNo= rtpenTrnDisNo;
		this.setIsSet_rtpenTrnDisNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rcmGoalAm= false;
	protected final boolean isSet_rcmGoalAm(){
		return this.isSet_rcmGoalAm;
	}
	private void setIsSet_rcmGoalAm(boolean value){
		this.isSet_rcmGoalAm= value;
	}
	/**
	 * 추천목표금액
	 * BigDecimal - Double value setter
	 *
	 * @Param rcmGoalAm 추천목표금액
	 */
	public void setRcmGoalAm(double rcmGoalAm) {
		setRcmGoalAm(BigDecimal.valueOf(rcmGoalAm));
	}
	/**
	 * 추천목표금액
	 * BigDecimal - Long value setter
	 *
	 * @Param rcmGoalAm 추천목표금액
	 */
	public void setRcmGoalAm(long rcmGoalAm) {
		setRcmGoalAm(BigDecimal.valueOf(rcmGoalAm));
	}
	/**
	 * 추천목표금액
	 * BigDecimal - String value setter
	 *
	 * @Param rcmGoalAm 추천목표금액
	 */
	public void setRcmGoalAm(String rcmGoalAm) {
		setRcmGoalAm(new BigDecimal(rcmGoalAm));
	}
	/**
	 * 추천목표금액
	 */
	@XmlTransient
	public BigDecimal getRcmGoalAm(){
		return this.rcmGoalAm;
	}
	
	/**
	 * 추천목표금액
	 * 
	 * @param rcmGoalAm 추천목표금액
	 */
	@JsonSetter("rcmGoalAm")
	public void setRcmGoalAm(BigDecimal rcmGoalAm){
		this.rcmGoalAm= rcmGoalAm;
		this.setIsSet_rcmGoalAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_jnngCtgrCd= false;
	protected final boolean isSet_jnngCtgrCd(){
		return this.isSet_jnngCtgrCd;
	}
	private void setIsSet_jnngCtgrCd(boolean value){
		this.isSet_jnngCtgrCd= value;
	}
	/**
	 * 가입카테고리코드
	 */
	@XmlTransient
	public String getJnngCtgrCd(){
		return this.jnngCtgrCd;
	}
	
	/**
	 * 가입카테고리코드
	 * 
	 * @param jnngCtgrCd 가입카테고리코드
	 */
	public void setJnngCtgrCd(String jnngCtgrCd){
		this.jnngCtgrCd= jnngCtgrCd;
		this.setIsSet_jnngCtgrCd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rcpMdKdcd= false;
	protected final boolean isSet_rcpMdKdcd(){
		return this.isSet_rcpMdKdcd;
	}
	private void setIsSet_rcpMdKdcd(boolean value){
		this.isSet_rcpMdKdcd= value;
	}
	/**
	 * 접수매체종류코드
	 */
	@XmlTransient
	public String getRcpMdKdcd(){
		return this.rcpMdKdcd;
	}
	
	/**
	 * 접수매체종류코드
	 * 
	 * @param rcpMdKdcd 접수매체종류코드
	 */
	public void setRcpMdKdcd(String rcpMdKdcd){
		this.rcpMdKdcd= rcpMdKdcd;
		this.setIsSet_rcpMdKdcd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_hsscMajTxtPbokPrngYn= false;
	protected final boolean isSet_hsscMajTxtPbokPrngYn(){
		return this.isSet_hsscMajTxtPbokPrngYn;
	}
	private void setIsSet_hsscMajTxtPbokPrngYn(boolean value){
		this.isSet_hsscMajTxtPbokPrngYn= value;
	}
	/**
	 * 주택청약주요내용통장인자여부
	 */
	@XmlTransient
	public String getHsscMajTxtPbokPrngYn(){
		return this.hsscMajTxtPbokPrngYn;
	}
	
	/**
	 * 주택청약주요내용통장인자여부
	 * 
	 * @param hsscMajTxtPbokPrngYn 주택청약주요내용통장인자여부
	 */
	public void setHsscMajTxtPbokPrngYn(String hsscMajTxtPbokPrngYn){
		this.hsscMajTxtPbokPrngYn= hsscMajTxtPbokPrngYn;
		this.setIsSet_hsscMajTxtPbokPrngYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_prdDesOupYn= false;
	protected final boolean isSet_prdDesOupYn(){
		return this.isSet_prdDesOupYn;
	}
	private void setIsSet_prdDesOupYn(boolean value){
		this.isSet_prdDesOupYn= value;
	}
	/**
	 * 상품설명출력여부
	 */
	@XmlTransient
	public String getPrdDesOupYn(){
		return this.prdDesOupYn;
	}
	
	/**
	 * 상품설명출력여부
	 * 
	 * @param prdDesOupYn 상품설명출력여부
	 */
	public void setPrdDesOupYn(String prdDesOupYn){
		this.prdDesOupYn= prdDesOupYn;
		this.setIsSet_prdDesOupYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_acicJnngYn= false;
	protected final boolean isSet_acicJnngYn(){
		return this.isSet_acicJnngYn;
	}
	private void setIsSet_acicJnngYn(boolean value){
		this.isSet_acicJnngYn= value;
	}
	/**
	 * 상해보험가입여부
	 */
	@XmlTransient
	public String getAcicJnngYn(){
		return this.acicJnngYn;
	}
	
	/**
	 * 상해보험가입여부
	 * 
	 * @param acicJnngYn 상해보험가입여부
	 */
	public void setAcicJnngYn(String acicJnngYn){
		this.acicJnngYn= acicJnngYn;
		this.setIsSet_acicJnngYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_hsscNewDscd= false;
	protected final boolean isSet_hsscNewDscd(){
		return this.isSet_hsscNewDscd;
	}
	private void setIsSet_hsscNewDscd(boolean value){
		this.isSet_hsscNewDscd= value;
	}
	/**
	 * 주택청약신규구분코드
	 */
	@XmlTransient
	public String getHsscNewDscd(){
		return this.hsscNewDscd;
	}
	
	/**
	 * 주택청약신규구분코드
	 * 
	 * @param hsscNewDscd 주택청약신규구분코드
	 */
	public void setHsscNewDscd(String hsscNewDscd){
		this.hsscNewDscd= hsscNewDscd;
		this.setIsSet_hsscNewDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_hsscRgslZpno= false;
	protected final boolean isSet_hsscRgslZpno(){
		return this.isSet_hsscRgslZpno;
	}
	private void setIsSet_hsscRgslZpno(boolean value){
		this.isSet_hsscRgslZpno= value;
	}
	/**
	 * 주택청약주민등록지우편번호
	 */
	@XmlTransient
	public String getHsscRgslZpno(){
		return this.hsscRgslZpno;
	}
	
	/**
	 * 주택청약주민등록지우편번호
	 * 
	 * @param hsscRgslZpno 주택청약주민등록지우편번호
	 */
	public void setHsscRgslZpno(String hsscRgslZpno){
		this.hsscRgslZpno= hsscRgslZpno;
		this.setIsSet_hsscRgslZpno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_hsscInddRgsYn= false;
	protected final boolean isSet_hsscInddRgsYn(){
		return this.isSet_hsscInddRgsYn;
	}
	private void setIsSet_hsscInddRgsYn(boolean value){
		this.isSet_hsscInddRgsYn= value;
	}
	/**
	 * 주택청약소득공제등록여부
	 */
	@XmlTransient
	public String getHsscInddRgsYn(){
		return this.hsscInddRgsYn;
	}
	
	/**
	 * 주택청약소득공제등록여부
	 * 
	 * @param hsscInddRgsYn 주택청약소득공제등록여부
	 */
	public void setHsscInddRgsYn(String hsscInddRgsYn){
		this.hsscInddRgsYn= hsscInddRgsYn;
		this.setIsSet_hsscInddRgsYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_hsscHopeRgnZpno= false;
	protected final boolean isSet_hsscHopeRgnZpno(){
		return this.isSet_hsscHopeRgnZpno;
	}
	private void setIsSet_hsscHopeRgnZpno(boolean value){
		this.isSet_hsscHopeRgnZpno= value;
	}
	/**
	 * 주택청약희망지역우편번호
	 */
	@XmlTransient
	public String getHsscHopeRgnZpno(){
		return this.hsscHopeRgnZpno;
	}
	
	/**
	 * 주택청약희망지역우편번호
	 * 
	 * @param hsscHopeRgnZpno 주택청약희망지역우편번호
	 */
	public void setHsscHopeRgnZpno(String hsscHopeRgnZpno){
		this.hsscHopeRgnZpno= hsscHopeRgnZpno;
		this.setIsSet_hsscHopeRgnZpno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_hopeHousKdDscd= false;
	protected final boolean isSet_hopeHousKdDscd(){
		return this.isSet_hopeHousKdDscd;
	}
	private void setIsSet_hopeHousKdDscd(boolean value){
		this.isSet_hopeHousKdDscd= value;
	}
	/**
	 * 희망주택종류구분코드
	 */
	@XmlTransient
	public String getHopeHousKdDscd(){
		return this.hopeHousKdDscd;
	}
	
	/**
	 * 희망주택종류구분코드
	 * 
	 * @param hopeHousKdDscd 희망주택종류구분코드
	 */
	public void setHopeHousKdDscd(String hopeHousKdDscd){
		this.hopeHousKdDscd= hopeHousKdDscd;
		this.setIsSet_hopeHousKdDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_housXuseSqmDscd= false;
	protected final boolean isSet_housXuseSqmDscd(){
		return this.isSet_housXuseSqmDscd;
	}
	private void setIsSet_housXuseSqmDscd(boolean value){
		this.isSet_housXuseSqmDscd= value;
	}
	/**
	 * 주택전용면적구분코드
	 */
	@XmlTransient
	public String getHousXuseSqmDscd(){
		return this.housXuseSqmDscd;
	}
	
	/**
	 * 주택전용면적구분코드
	 * 
	 * @param housXuseSqmDscd 주택전용면적구분코드
	 */
	public void setHousXuseSqmDscd(String housXuseSqmDscd){
		this.housXuseSqmDscd= housXuseSqmDscd;
		this.setIsSet_housXuseSqmDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_hopeMovinYm= false;
	protected final boolean isSet_hopeMovinYm(){
		return this.isSet_hopeMovinYm;
	}
	private void setIsSet_hopeMovinYm(boolean value){
		this.isSet_hopeMovinYm= value;
	}
	/**
	 * 희망입주년월
	 */
	@XmlTransient
	public String getHopeMovinYm(){
		return this.hopeMovinYm;
	}
	
	/**
	 * 희망입주년월
	 * 
	 * @param hopeMovinYm 희망입주년월
	 */
	public void setHopeMovinYm(String hopeMovinYm){
		this.hopeMovinYm= hopeMovinYm;
		this.setIsSet_hopeMovinYm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_esnsNewRgsDt= false;
	protected final boolean isSet_esnsNewRgsDt(){
		return this.isSet_esnsNewRgsDt;
	}
	private void setIsSet_esnsNewRgsDt(boolean value){
		this.isSet_esnsNewRgsDt= value;
	}
	/**
	 * 간편신규등록일자
	 */
	@XmlTransient
	public String getEsnsNewRgsDt(){
		return this.esnsNewRgsDt;
	}
	
	/**
	 * 간편신규등록일자
	 * 
	 * @param esnsNewRgsDt 간편신규등록일자
	 */
	public void setEsnsNewRgsDt(String esnsNewRgsDt){
		this.esnsNewRgsDt= esnsNewRgsDt;
		this.setIsSet_esnsNewRgsDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_esnsNewRgsTm= false;
	protected final boolean isSet_esnsNewRgsTm(){
		return this.isSet_esnsNewRgsTm;
	}
	private void setIsSet_esnsNewRgsTm(boolean value){
		this.isSet_esnsNewRgsTm= value;
	}
	/**
	 * 간편신규등록시각
	 */
	@XmlTransient
	public String getEsnsNewRgsTm(){
		return this.esnsNewRgsTm;
	}
	
	/**
	 * 간편신규등록시각
	 * 
	 * @param esnsNewRgsTm 간편신규등록시각
	 */
	public void setEsnsNewRgsTm(String esnsNewRgsTm){
		this.esnsNewRgsTm= esnsNewRgsTm;
		this.setIsSet_esnsNewRgsTm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_esnsNewEbnkUtzpeNo= false;
	protected final boolean isSet_esnsNewEbnkUtzpeNo(){
		return this.isSet_esnsNewEbnkUtzpeNo;
	}
	private void setIsSet_esnsNewEbnkUtzpeNo(boolean value){
		this.isSet_esnsNewEbnkUtzpeNo= value;
	}
	/**
	 * 간편신규전자뱅킹이용자번호
	 */
	@XmlTransient
	public String getEsnsNewEbnkUtzpeNo(){
		return this.esnsNewEbnkUtzpeNo;
	}
	
	/**
	 * 간편신규전자뱅킹이용자번호
	 * 
	 * @param esnsNewEbnkUtzpeNo 간편신규전자뱅킹이용자번호
	 */
	public void setEsnsNewEbnkUtzpeNo(String esnsNewEbnkUtzpeNo){
		this.esnsNewEbnkUtzpeNo= esnsNewEbnkUtzpeNo;
		this.setIsSet_esnsNewEbnkUtzpeNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atsKdcd= false;
	protected final boolean isSet_atsKdcd(){
		return this.isSet_atsKdcd;
	}
	private void setIsSet_atsKdcd(boolean value){
		this.isSet_atsKdcd= value;
	}
	/**
	 * 자동이체종류코드
	 */
	@XmlTransient
	public String getAtsKdcd(){
		return this.atsKdcd;
	}
	
	/**
	 * 자동이체종류코드
	 * 
	 * @param atsKdcd 자동이체종류코드
	 */
	public void setAtsKdcd(String atsKdcd){
		this.atsKdcd= atsKdcd;
		this.setIsSet_atsKdcd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_lnoActOpngRncd= false;
	protected final boolean isSet_lnoActOpngRncd(){
		return this.isSet_lnoActOpngRncd;
	}
	private void setIsSet_lnoActOpngRncd(boolean value){
		this.isSet_lnoActOpngRncd= value;
	}
	/**
	 * 다수계좌개설사유코드
	 */
	@XmlTransient
	public String getLnoActOpngRncd(){
		return this.lnoActOpngRncd;
	}
	
	/**
	 * 다수계좌개설사유코드
	 * 
	 * @param lnoActOpngRncd 다수계좌개설사유코드
	 */
	public void setLnoActOpngRncd(String lnoActOpngRncd){
		this.lnoActOpngRncd= lnoActOpngRncd;
		this.setIsSet_lnoActOpngRncd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_scanInfAcnmCnfDscd= false;
	protected final boolean isSet_scanInfAcnmCnfDscd(){
		return this.isSet_scanInfAcnmCnfDscd;
	}
	private void setIsSet_scanInfAcnmCnfDscd(boolean value){
		this.isSet_scanInfAcnmCnfDscd= value;
	}
	/**
	 * 스캔정보실명확인구분코드
	 */
	@XmlTransient
	public String getScanInfAcnmCnfDscd(){
		return this.scanInfAcnmCnfDscd;
	}
	
	/**
	 * 스캔정보실명확인구분코드
	 * 
	 * @param scanInfAcnmCnfDscd 스캔정보실명확인구분코드
	 */
	public void setScanInfAcnmCnfDscd(String scanInfAcnmCnfDscd){
		this.scanInfAcnmCnfDscd= scanInfAcnmCnfDscd;
		this.setIsSet_scanInfAcnmCnfDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_agnpeTrnYn= false;
	protected final boolean isSet_agnpeTrnYn(){
		return this.isSet_agnpeTrnYn;
	}
	private void setIsSet_agnpeTrnYn(boolean value){
		this.isSet_agnpeTrnYn= value;
	}
	/**
	 * 대리인거래여부
	 */
	@XmlTransient
	public String getAgnpeTrnYn(){
		return this.agnpeTrnYn;
	}
	
	/**
	 * 대리인거래여부
	 * 
	 * @param agnpeTrnYn 대리인거래여부
	 */
	public void setAgnpeTrnYn(String agnpeTrnYn){
		this.agnpeTrnYn= agnpeTrnYn;
		this.setIsSet_agnpeTrnYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dpsPwnoRgsDscd= false;
	protected final boolean isSet_dpsPwnoRgsDscd(){
		return this.isSet_dpsPwnoRgsDscd;
	}
	private void setIsSet_dpsPwnoRgsDscd(boolean value){
		this.isSet_dpsPwnoRgsDscd= value;
	}
	/**
	 * 수신비밀번호등록구분코드
	 */
	@XmlTransient
	public String getDpsPwnoRgsDscd(){
		return this.dpsPwnoRgsDscd;
	}
	
	/**
	 * 수신비밀번호등록구분코드
	 * 
	 * @param dpsPwnoRgsDscd 수신비밀번호등록구분코드
	 */
	public void setDpsPwnoRgsDscd(String dpsPwnoRgsDscd){
		this.dpsPwnoRgsDscd= dpsPwnoRgsDscd;
		this.setIsSet_dpsPwnoRgsDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_prrRgsPwnoKeyCnf= false;
	protected final boolean isSet_prrRgsPwnoKeyCnf(){
		return this.isSet_prrRgsPwnoKeyCnf;
	}
	private void setIsSet_prrRgsPwnoKeyCnf(boolean value){
		this.isSet_prrRgsPwnoKeyCnf= value;
	}
	/**
	 * 사전등록비밀번호키확인
	 */
	@XmlTransient
	public String getPrrRgsPwnoKeyCnf(){
		return this.prrRgsPwnoKeyCnf;
	}
	
	/**
	 * 사전등록비밀번호키확인
	 * 
	 * @param prrRgsPwnoKeyCnf 사전등록비밀번호키확인
	 */
	public void setPrrRgsPwnoKeyCnf(String prrRgsPwnoKeyCnf){
		this.prrRgsPwnoKeyCnf= prrRgsPwnoKeyCnf;
		this.setIsSet_prrRgsPwnoKeyCnf(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_encyActPwnoCnf= false;
	protected final boolean isSet_encyActPwnoCnf(){
		return this.isSet_encyActPwnoCnf;
	}
	private void setIsSet_encyActPwnoCnf(boolean value){
		this.isSet_encyActPwnoCnf= value;
	}
	/**
	 * 암호화계좌비밀번호확인
	 */
	@XmlTransient
	public String getEncyActPwnoCnf(){
		return this.encyActPwnoCnf;
	}
	
	/**
	 * 암호화계좌비밀번호확인
	 * 
	 * @param encyActPwnoCnf 암호화계좌비밀번호확인
	 */
	public void setEncyActPwnoCnf(String encyActPwnoCnf){
		this.encyActPwnoCnf= encyActPwnoCnf;
		this.setIsSet_encyActPwnoCnf(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_wdcPbokYn= false;
	protected final boolean isSet_wdcPbokYn(){
		return this.isSet_wdcPbokYn;
	}
	private void setIsSet_wdcPbokYn(boolean value){
		this.isSet_wdcPbokYn= value;
	}
	/**
	 * 우리닷컴통장여부
	 */
	@XmlTransient
	public String getWdcPbokYn(){
		return this.wdcPbokYn;
	}
	
	/**
	 * 우리닷컴통장여부
	 * 
	 * @param wdcPbokYn 우리닷컴통장여부
	 */
	public void setWdcPbokYn(String wdcPbokYn){
		this.wdcPbokYn= wdcPbokYn;
		this.setIsSet_wdcPbokYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_wooriLovPlsDntnAscnDscd= false;
	protected final boolean isSet_wooriLovPlsDntnAscnDscd(){
		return this.isSet_wooriLovPlsDntnAscnDscd;
	}
	private void setIsSet_wooriLovPlsDntnAscnDscd(boolean value){
		this.isSet_wooriLovPlsDntnAscnDscd= value;
	}
	/**
	 * 우리사랑플러스기부단체구분코드
	 */
	@XmlTransient
	public String getWooriLovPlsDntnAscnDscd(){
		return this.wooriLovPlsDntnAscnDscd;
	}
	
	/**
	 * 우리사랑플러스기부단체구분코드
	 * 
	 * @param wooriLovPlsDntnAscnDscd 우리사랑플러스기부단체구분코드
	 */
	public void setWooriLovPlsDntnAscnDscd(String wooriLovPlsDntnAscnDscd){
		this.wooriLovPlsDntnAscnDscd= wooriLovPlsDntnAscnDscd;
		this.setIsSet_wooriLovPlsDntnAscnDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_sameRqdcSrno= false;
	protected final boolean isSet_sameRqdcSrno(){
		return this.isSet_sameRqdcSrno;
	}
	private void setIsSet_sameRqdcSrno(boolean value){
		this.isSet_sameRqdcSrno= value;
	}
	/**
	 * 동일신청서일련번호
	 */
	@XmlTransient
	public Integer getSameRqdcSrno(){
		return this.sameRqdcSrno;
	}
	
	/**
	 * 동일신청서일련번호
	 * 
	 * @param sameRqdcSrno 동일신청서일련번호
	 */
	public void setSameRqdcSrno(Integer sameRqdcSrno){
		this.sameRqdcSrno= sameRqdcSrno;
		this.setIsSet_sameRqdcSrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_etcDeedDscd= false;
	protected final boolean isSet_etcDeedDscd(){
		return this.isSet_etcDeedDscd;
	}
	private void setIsSet_etcDeedDscd(boolean value){
		this.isSet_etcDeedDscd= value;
	}
	/**
	 * 기타증서구분코드
	 */
	@XmlTransient
	public String getEtcDeedDscd(){
		return this.etcDeedDscd;
	}
	
	/**
	 * 기타증서구분코드
	 * 
	 * @param etcDeedDscd 기타증서구분코드
	 */
	public void setEtcDeedDscd(String etcDeedDscd){
		this.etcDeedDscd= etcDeedDscd;
		this.setIsSet_etcDeedDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_actApvNo= false;
	protected final boolean isSet_actApvNo(){
		return this.isSet_actApvNo;
	}
	private void setIsSet_actApvNo(boolean value){
		this.isSet_actApvNo= value;
	}
	/**
	 * 계좌승인번호
	 */
	@XmlTransient
	public String getActApvNo(){
		return this.actApvNo;
	}
	
	/**
	 * 계좌승인번호
	 * 
	 * @param actApvNo 계좌승인번호
	 */
	public void setActApvNo(String actApvNo){
		this.actApvNo= actApvNo;
		this.setIsSet_actApvNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_fndRblnNewYn= false;
	protected final boolean isSet_fndRblnNewYn(){
		return this.isSet_fndRblnNewYn;
	}
	private void setIsSet_fndRblnNewYn(boolean value){
		this.isSet_fndRblnNewYn= value;
	}
	/**
	 * 펀드리밸런싱신규여부
	 */
	@XmlTransient
	public String getFndRblnNewYn(){
		return this.fndRblnNewYn;
	}
	
	/**
	 * 펀드리밸런싱신규여부
	 * 
	 * @param fndRblnNewYn 펀드리밸런싱신규여부
	 */
	public void setFndRblnNewYn(String fndRblnNewYn){
		this.fndRblnNewYn= fndRblnNewYn;
		this.setIsSet_fndRblnNewYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_bgnnRcvWdrYn= false;
	protected final boolean isSet_bgnnRcvWdrYn(){
		return this.isSet_bgnnRcvWdrYn;
	}
	private void setIsSet_bgnnRcvWdrYn(boolean value){
		this.isSet_bgnnRcvWdrYn= value;
	}
	/**
	 * 초입금출금여부
	 */
	@XmlTransient
	public String getBgnnRcvWdrYn(){
		return this.bgnnRcvWdrYn;
	}
	
	/**
	 * 초입금출금여부
	 * 
	 * @param bgnnRcvWdrYn 초입금출금여부
	 */
	public void setBgnnRcvWdrYn(String bgnnRcvWdrYn){
		this.bgnnRcvWdrYn= bgnnRcvWdrYn;
		this.setIsSet_bgnnRcvWdrYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_copItcsno= false;
	protected final boolean isSet_copItcsno(){
		return this.isSet_copItcsno;
	}
	private void setIsSet_copItcsno(boolean value){
		this.isSet_copItcsno= value;
	}
	/**
	 * 기업통합고객번호
	 */
	@XmlTransient
	public String getCopItcsno(){
		return this.copItcsno;
	}
	
	/**
	 * 기업통합고객번호
	 * 
	 * @param copItcsno 기업통합고객번호
	 */
	public void setCopItcsno(String copItcsno){
		this.copItcsno= copItcsno;
		this.setIsSet_copItcsno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_inbkNewYn= false;
	protected final boolean isSet_inbkNewYn(){
		return this.isSet_inbkNewYn;
	}
	private void setIsSet_inbkNewYn(boolean value){
		this.isSet_inbkNewYn= value;
	}
	/**
	 * 인터넷뱅킹신규여부
	 */
	@XmlTransient
	public String getInbkNewYn(){
		return this.inbkNewYn;
	}
	
	/**
	 * 인터넷뱅킹신규여부
	 * 
	 * @param inbkNewYn 인터넷뱅킹신규여부
	 */
	public void setInbkNewYn(String inbkNewYn){
		this.inbkNewYn= inbkNewYn;
		this.setIsSet_inbkNewYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_smrtBnkgNewYn= false;
	protected final boolean isSet_smrtBnkgNewYn(){
		return this.isSet_smrtBnkgNewYn;
	}
	private void setIsSet_smrtBnkgNewYn(boolean value){
		this.isSet_smrtBnkgNewYn= value;
	}
	/**
	 * 스마트뱅킹신규여부
	 */
	@XmlTransient
	public String getSmrtBnkgNewYn(){
		return this.smrtBnkgNewYn;
	}
	
	/**
	 * 스마트뱅킹신규여부
	 * 
	 * @param smrtBnkgNewYn 스마트뱅킹신규여부
	 */
	public void setSmrtBnkgNewYn(String smrtBnkgNewYn){
		this.smrtBnkgNewYn= smrtBnkgNewYn;
		this.setIsSet_smrtBnkgNewYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_tlbnkNewYn= false;
	protected final boolean isSet_tlbnkNewYn(){
		return this.isSet_tlbnkNewYn;
	}
	private void setIsSet_tlbnkNewYn(boolean value){
		this.isSet_tlbnkNewYn= value;
	}
	/**
	 * 텔레뱅킹신규여부
	 */
	@XmlTransient
	public String getTlbnkNewYn(){
		return this.tlbnkNewYn;
	}
	
	/**
	 * 텔레뱅킹신규여부
	 * 
	 * @param tlbnkNewYn 텔레뱅킹신규여부
	 */
	public void setTlbnkNewYn(String tlbnkNewYn){
		this.tlbnkNewYn= tlbnkNewYn;
		this.setIsSet_tlbnkNewYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ntsvcRgsYn= false;
	protected final boolean isSet_ntsvcRgsYn(){
		return this.isSet_ntsvcRgsYn;
	}
	private void setIsSet_ntsvcRgsYn(boolean value){
		this.isSet_ntsvcRgsYn= value;
	}
	/**
	 * 알림서비스등록여부
	 */
	@XmlTransient
	public String getNtsvcRgsYn(){
		return this.ntsvcRgsYn;
	}
	
	/**
	 * 알림서비스등록여부
	 * 
	 * @param ntsvcRgsYn 알림서비스등록여부
	 */
	public void setNtsvcRgsYn(String ntsvcRgsYn){
		this.ntsvcRgsYn= ntsvcRgsYn;
		this.setIsSet_ntsvcRgsYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_inbkWdrActRgsYn= false;
	protected final boolean isSet_inbkWdrActRgsYn(){
		return this.isSet_inbkWdrActRgsYn;
	}
	private void setIsSet_inbkWdrActRgsYn(boolean value){
		this.isSet_inbkWdrActRgsYn= value;
	}
	/**
	 * 인터넷뱅킹출금계좌등록여부
	 */
	@XmlTransient
	public String getInbkWdrActRgsYn(){
		return this.inbkWdrActRgsYn;
	}
	
	/**
	 * 인터넷뱅킹출금계좌등록여부
	 * 
	 * @param inbkWdrActRgsYn 인터넷뱅킹출금계좌등록여부
	 */
	public void setInbkWdrActRgsYn(String inbkWdrActRgsYn){
		this.inbkWdrActRgsYn= inbkWdrActRgsYn;
		this.setIsSet_inbkWdrActRgsYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_inetBnkgUserId= false;
	protected final boolean isSet_inetBnkgUserId(){
		return this.isSet_inetBnkgUserId;
	}
	private void setIsSet_inetBnkgUserId(boolean value){
		this.isSet_inetBnkgUserId= value;
	}
	/**
	 * 인터넷뱅킹사용자ID
	 */
	@XmlTransient
	public String getInetBnkgUserId(){
		return this.inetBnkgUserId;
	}
	
	/**
	 * 인터넷뱅킹사용자ID
	 * 
	 * @param inetBnkgUserId 인터넷뱅킹사용자ID
	 */
	public void setInetBnkgUserId(String inetBnkgUserId){
		this.inetBnkgUserId= inetBnkgUserId;
		this.setIsSet_inetBnkgUserId(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ebnkPwno= false;
	protected final boolean isSet_ebnkPwno(){
		return this.isSet_ebnkPwno;
	}
	private void setIsSet_ebnkPwno(boolean value){
		this.isSet_ebnkPwno= value;
	}
	/**
	 * 전자뱅킹비밀번호
	 */
	@XmlTransient
	public String getEbnkPwno(){
		return this.ebnkPwno;
	}
	
	/**
	 * 전자뱅킹비밀번호
	 * 
	 * @param ebnkPwno 전자뱅킹비밀번호
	 */
	public void setEbnkPwno(String ebnkPwno){
		this.ebnkPwno= ebnkPwno;
		this.setIsSet_ebnkPwno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_engNm= false;
	protected final boolean isSet_engNm(){
		return this.isSet_engNm;
	}
	private void setIsSet_engNm(boolean value){
		this.isSet_engNm= value;
	}
	/**
	 * 영문성명
	 */
	@XmlTransient
	public String getEngNm(){
		return this.engNm;
	}
	
	/**
	 * 영문성명
	 * 
	 * @param engNm 영문성명
	 */
	public void setEngNm(String engNm){
		this.engNm= engNm;
		this.setIsSet_engNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_tms1TsLmtAm= false;
	protected final boolean isSet_tms1TsLmtAm(){
		return this.isSet_tms1TsLmtAm;
	}
	private void setIsSet_tms1TsLmtAm(boolean value){
		this.isSet_tms1TsLmtAm= value;
	}
	/**
	 * 1회이체한도금액
	 * BigDecimal - Double value setter
	 *
	 * @Param tms1TsLmtAm 1회이체한도금액
	 */
	public void setTms1TsLmtAm(double tms1TsLmtAm) {
		setTms1TsLmtAm(BigDecimal.valueOf(tms1TsLmtAm));
	}
	/**
	 * 1회이체한도금액
	 * BigDecimal - Long value setter
	 *
	 * @Param tms1TsLmtAm 1회이체한도금액
	 */
	public void setTms1TsLmtAm(long tms1TsLmtAm) {
		setTms1TsLmtAm(BigDecimal.valueOf(tms1TsLmtAm));
	}
	/**
	 * 1회이체한도금액
	 * BigDecimal - String value setter
	 *
	 * @Param tms1TsLmtAm 1회이체한도금액
	 */
	public void setTms1TsLmtAm(String tms1TsLmtAm) {
		setTms1TsLmtAm(new BigDecimal(tms1TsLmtAm));
	}
	/**
	 * 1회이체한도금액
	 */
	@XmlTransient
	public BigDecimal getTms1TsLmtAm(){
		return this.tms1TsLmtAm;
	}
	
	/**
	 * 1회이체한도금액
	 * 
	 * @param tms1TsLmtAm 1회이체한도금액
	 */
	@JsonSetter("tms1TsLmtAm")
	public void setTms1TsLmtAm(BigDecimal tms1TsLmtAm){
		this.tms1TsLmtAm= tms1TsLmtAm;
		this.setIsSet_tms1TsLmtAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_d1TsLmtAm= false;
	protected final boolean isSet_d1TsLmtAm(){
		return this.isSet_d1TsLmtAm;
	}
	private void setIsSet_d1TsLmtAm(boolean value){
		this.isSet_d1TsLmtAm= value;
	}
	/**
	 * 1일이체한도금액
	 * BigDecimal - Double value setter
	 *
	 * @Param d1TsLmtAm 1일이체한도금액
	 */
	public void setD1TsLmtAm(double d1TsLmtAm) {
		setD1TsLmtAm(BigDecimal.valueOf(d1TsLmtAm));
	}
	/**
	 * 1일이체한도금액
	 * BigDecimal - Long value setter
	 *
	 * @Param d1TsLmtAm 1일이체한도금액
	 */
	public void setD1TsLmtAm(long d1TsLmtAm) {
		setD1TsLmtAm(BigDecimal.valueOf(d1TsLmtAm));
	}
	/**
	 * 1일이체한도금액
	 * BigDecimal - String value setter
	 *
	 * @Param d1TsLmtAm 1일이체한도금액
	 */
	public void setD1TsLmtAm(String d1TsLmtAm) {
		setD1TsLmtAm(new BigDecimal(d1TsLmtAm));
	}
	/**
	 * 1일이체한도금액
	 */
	@XmlTransient
	public BigDecimal getD1TsLmtAm(){
		return this.d1TsLmtAm;
	}
	
	/**
	 * 1일이체한도금액
	 * 
	 * @param d1TsLmtAm 1일이체한도금액
	 */
	@JsonSetter("d1TsLmtAm")
	public void setD1TsLmtAm(BigDecimal d1TsLmtAm){
		this.d1TsLmtAm= d1TsLmtAm;
		this.setIsSet_d1TsLmtAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_secrdSrno= false;
	protected final boolean isSet_secrdSrno(){
		return this.isSet_secrdSrno;
	}
	private void setIsSet_secrdSrno(boolean value){
		this.isSet_secrdSrno= value;
	}
	/**
	 * 보안카드일련번호
	 */
	@XmlTransient
	public String getSecrdSrno(){
		return this.secrdSrno;
	}
	
	/**
	 * 보안카드일련번호
	 * 
	 * @param secrdSrno 보안카드일련번호
	 */
	public void setSecrdSrno(String secrdSrno){
		this.secrdSrno= secrdSrno;
		this.setIsSet_secrdSrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_otpcSrno= false;
	protected final boolean isSet_otpcSrno(){
		return this.isSet_otpcSrno;
	}
	private void setIsSet_otpcSrno(boolean value){
		this.isSet_otpcSrno= value;
	}
	/**
	 * OTP카드일련번호
	 */
	@XmlTransient
	public String getOtpcSrno(){
		return this.otpcSrno;
	}
	
	/**
	 * OTP카드일련번호
	 * 
	 * @param otpcSrno OTP카드일련번호
	 */
	public void setOtpcSrno(String otpcSrno){
		this.otpcSrno= otpcSrno;
		this.setIsSet_otpcSrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_otpPwd= false;
	protected final boolean isSet_otpPwd(){
		return this.isSet_otpPwd;
	}
	private void setIsSet_otpPwd(boolean value){
		this.isSet_otpPwd= value;
	}
	/**
	 * OTP발생기비밀번호
	 */
	@XmlTransient
	public String getOtpPwd(){
		return this.otpPwd;
	}
	
	/**
	 * OTP발생기비밀번호
	 * 
	 * @param otpPwd OTP발생기비밀번호
	 */
	public void setOtpPwd(String otpPwd){
		this.otpPwd= otpPwd;
		this.setIsSet_otpPwd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_otpIsuCostXmpDscd= false;
	protected final boolean isSet_otpIsuCostXmpDscd(){
		return this.isSet_otpIsuCostXmpDscd;
	}
	private void setIsSet_otpIsuCostXmpDscd(boolean value){
		this.isSet_otpIsuCostXmpDscd= value;
	}
	/**
	 * OTP발급비용면제구분코드
	 */
	@XmlTransient
	public String getOtpIsuCostXmpDscd(){
		return this.otpIsuCostXmpDscd;
	}
	
	/**
	 * OTP발급비용면제구분코드
	 * 
	 * @param otpIsuCostXmpDscd OTP발급비용면제구분코드
	 */
	public void setOtpIsuCostXmpDscd(String otpIsuCostXmpDscd){
		this.otpIsuCostXmpDscd= otpIsuCostXmpDscd;
		this.setIsSet_otpIsuCostXmpDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_datDpsTelNo= false;
	protected final boolean isSet_datDpsTelNo(){
		return this.isSet_datDpsTelNo;
	}
	private void setIsSet_datDpsTelNo(boolean value){
		this.isSet_datDpsTelNo= value;
	}
	/**
	 * 데이터수신전화번호
	 */
	@XmlTransient
	public String getDatDpsTelNo(){
		return this.datDpsTelNo;
	}
	
	/**
	 * 데이터수신전화번호
	 * 
	 * @param datDpsTelNo 데이터수신전화번호
	 */
	public void setDatDpsTelNo(String datDpsTelNo){
		this.datDpsTelNo= datDpsTelNo;
		this.setIsSet_datDpsTelNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_synpbDscd= false;
	protected final boolean isSet_synpbDscd(){
		return this.isSet_synpbDscd;
	}
	private void setIsSet_synpbDscd(boolean value){
		this.isSet_synpbDscd= value;
	}
	/**
	 * 종합통장구분코드
	 */
	@XmlTransient
	public String getSynpbDscd(){
		return this.synpbDscd;
	}
	
	/**
	 * 종합통장구분코드
	 * 
	 * @param synpbDscd 종합통장구분코드
	 */
	public void setSynpbDscd(String synpbDscd){
		this.synpbDscd= synpbDscd;
		this.setIsSet_synpbDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_inetBnkgRcpSrno= false;
	protected final boolean isSet_inetBnkgRcpSrno(){
		return this.isSet_inetBnkgRcpSrno;
	}
	private void setIsSet_inetBnkgRcpSrno(boolean value){
		this.isSet_inetBnkgRcpSrno= value;
	}
	/**
	 * 인터넷뱅킹접수일련번호
	 */
	@XmlTransient
	public String getInetBnkgRcpSrno(){
		return this.inetBnkgRcpSrno;
	}
	
	/**
	 * 인터넷뱅킹접수일련번호
	 * 
	 * @param inetBnkgRcpSrno 인터넷뱅킹접수일련번호
	 */
	public void setInetBnkgRcpSrno(String inetBnkgRcpSrno){
		this.inetBnkgRcpSrno= inetBnkgRcpSrno;
		this.setIsSet_inetBnkgRcpSrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_inbkRsvRgbrCd= false;
	protected final boolean isSet_inbkRsvRgbrCd(){
		return this.isSet_inbkRsvRgbrCd;
	}
	private void setIsSet_inbkRsvRgbrCd(boolean value){
		this.isSet_inbkRsvRgbrCd= value;
	}
	/**
	 * 인터넷뱅킹예약등록점코드
	 */
	@XmlTransient
	public String getInbkRsvRgbrCd(){
		return this.inbkRsvRgbrCd;
	}
	
	/**
	 * 인터넷뱅킹예약등록점코드
	 * 
	 * @param inbkRsvRgbrCd 인터넷뱅킹예약등록점코드
	 */
	public void setInbkRsvRgbrCd(String inbkRsvRgbrCd){
		this.inbkRsvRgbrCd= inbkRsvRgbrCd;
		this.setIsSet_inbkRsvRgbrCd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_inbkRsvRgsDt= false;
	protected final boolean isSet_inbkRsvRgsDt(){
		return this.isSet_inbkRsvRgsDt;
	}
	private void setIsSet_inbkRsvRgsDt(boolean value){
		this.isSet_inbkRsvRgsDt= value;
	}
	/**
	 * 인터넷뱅킹예약등록일자
	 */
	@XmlTransient
	public String getInbkRsvRgsDt(){
		return this.inbkRsvRgsDt;
	}
	
	/**
	 * 인터넷뱅킹예약등록일자
	 * 
	 * @param inbkRsvRgsDt 인터넷뱅킹예약등록일자
	 */
	public void setInbkRsvRgsDt(String inbkRsvRgsDt){
		this.inbkRsvRgsDt= inbkRsvRgsDt;
		this.setIsSet_inbkRsvRgsDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_inbkRsvRgsSrno= false;
	protected final boolean isSet_inbkRsvRgsSrno(){
		return this.isSet_inbkRsvRgsSrno;
	}
	private void setIsSet_inbkRsvRgsSrno(boolean value){
		this.isSet_inbkRsvRgsSrno= value;
	}
	/**
	 * 인터넷뱅킹예약등록일련번호
	 */
	@XmlTransient
	public Integer getInbkRsvRgsSrno(){
		return this.inbkRsvRgsSrno;
	}
	
	/**
	 * 인터넷뱅킹예약등록일련번호
	 * 
	 * @param inbkRsvRgsSrno 인터넷뱅킹예약등록일련번호
	 */
	public void setInbkRsvRgsSrno(Integer inbkRsvRgsSrno){
		this.inbkRsvRgsSrno= inbkRsvRgsSrno;
		this.setIsSet_inbkRsvRgsSrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_smrtBnkgInetBnkgId= false;
	protected final boolean isSet_smrtBnkgInetBnkgId(){
		return this.isSet_smrtBnkgInetBnkgId;
	}
	private void setIsSet_smrtBnkgInetBnkgId(boolean value){
		this.isSet_smrtBnkgInetBnkgId= value;
	}
	/**
	 * 스마트뱅킹인터넷뱅킹ID
	 */
	@XmlTransient
	public String getSmrtBnkgInetBnkgId(){
		return this.smrtBnkgInetBnkgId;
	}
	
	/**
	 * 스마트뱅킹인터넷뱅킹ID
	 * 
	 * @param smrtBnkgInetBnkgId 스마트뱅킹인터넷뱅킹ID
	 */
	public void setSmrtBnkgInetBnkgId(String smrtBnkgInetBnkgId){
		this.smrtBnkgInetBnkgId= smrtBnkgInetBnkgId;
		this.setIsSet_smrtBnkgInetBnkgId(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_smrtBnkgHpComCd= false;
	protected final boolean isSet_smrtBnkgHpComCd(){
		return this.isSet_smrtBnkgHpComCd;
	}
	private void setIsSet_smrtBnkgHpComCd(boolean value){
		this.isSet_smrtBnkgHpComCd= value;
	}
	/**
	 * 스마트뱅킹핸드폰회사코드
	 */
	@XmlTransient
	public String getSmrtBnkgHpComCd(){
		return this.smrtBnkgHpComCd;
	}
	
	/**
	 * 스마트뱅킹핸드폰회사코드
	 * 
	 * @param smrtBnkgHpComCd 스마트뱅킹핸드폰회사코드
	 */
	public void setSmrtBnkgHpComCd(String smrtBnkgHpComCd){
		this.smrtBnkgHpComCd= smrtBnkgHpComCd;
		this.setIsSet_smrtBnkgHpComCd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_smrtBnkgHpTlenNo= false;
	protected final boolean isSet_smrtBnkgHpTlenNo(){
		return this.isSet_smrtBnkgHpTlenNo;
	}
	private void setIsSet_smrtBnkgHpTlenNo(boolean value){
		this.isSet_smrtBnkgHpTlenNo= value;
	}
	/**
	 * 스마트뱅킹핸드폰국번번호
	 */
	@XmlTransient
	public String getSmrtBnkgHpTlenNo(){
		return this.smrtBnkgHpTlenNo;
	}
	
	/**
	 * 스마트뱅킹핸드폰국번번호
	 * 
	 * @param smrtBnkgHpTlenNo 스마트뱅킹핸드폰국번번호
	 */
	public void setSmrtBnkgHpTlenNo(String smrtBnkgHpTlenNo){
		this.smrtBnkgHpTlenNo= smrtBnkgHpTlenNo;
		this.setIsSet_smrtBnkgHpTlenNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_smrtBnkgHpSrno= false;
	protected final boolean isSet_smrtBnkgHpSrno(){
		return this.isSet_smrtBnkgHpSrno;
	}
	private void setIsSet_smrtBnkgHpSrno(boolean value){
		this.isSet_smrtBnkgHpSrno= value;
	}
	/**
	 * 스마트뱅킹핸드폰일련번호
	 */
	@XmlTransient
	public String getSmrtBnkgHpSrno(){
		return this.smrtBnkgHpSrno;
	}
	
	/**
	 * 스마트뱅킹핸드폰일련번호
	 * 
	 * @param smrtBnkgHpSrno 스마트뱅킹핸드폰일련번호
	 */
	public void setSmrtBnkgHpSrno(String smrtBnkgHpSrno){
		this.smrtBnkgHpSrno= smrtBnkgHpSrno;
		this.setIsSet_smrtBnkgHpSrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_tlbnkSecrdSrno= false;
	protected final boolean isSet_tlbnkSecrdSrno(){
		return this.isSet_tlbnkSecrdSrno;
	}
	private void setIsSet_tlbnkSecrdSrno(boolean value){
		this.isSet_tlbnkSecrdSrno= value;
	}
	/**
	 * 텔레뱅킹보안카드일련번호
	 */
	@XmlTransient
	public String getTlbnkSecrdSrno(){
		return this.tlbnkSecrdSrno;
	}
	
	/**
	 * 텔레뱅킹보안카드일련번호
	 * 
	 * @param tlbnkSecrdSrno 텔레뱅킹보안카드일련번호
	 */
	public void setTlbnkSecrdSrno(String tlbnkSecrdSrno){
		this.tlbnkSecrdSrno= tlbnkSecrdSrno;
		this.setIsSet_tlbnkSecrdSrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_encyEbnkPwno= false;
	protected final boolean isSet_encyEbnkPwno(){
		return this.isSet_encyEbnkPwno;
	}
	private void setIsSet_encyEbnkPwno(boolean value){
		this.isSet_encyEbnkPwno= value;
	}
	/**
	 * 암호화전자뱅킹비밀번호
	 */
	@XmlTransient
	public String getEncyEbnkPwno(){
		return this.encyEbnkPwno;
	}
	
	/**
	 * 암호화전자뱅킹비밀번호
	 * 
	 * @param encyEbnkPwno 암호화전자뱅킹비밀번호
	 */
	public void setEncyEbnkPwno(String encyEbnkPwno){
		this.encyEbnkPwno= encyEbnkPwno;
		this.setIsSet_encyEbnkPwno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_tlbnkD1TsLmt= false;
	protected final boolean isSet_tlbnkD1TsLmt(){
		return this.isSet_tlbnkD1TsLmt;
	}
	private void setIsSet_tlbnkD1TsLmt(boolean value){
		this.isSet_tlbnkD1TsLmt= value;
	}
	/**
	 * 텔레뱅킹1일이체한도
	 * BigDecimal - Double value setter
	 *
	 * @Param tlbnkD1TsLmt 텔레뱅킹1일이체한도
	 */
	public void setTlbnkD1TsLmt(double tlbnkD1TsLmt) {
		setTlbnkD1TsLmt(BigDecimal.valueOf(tlbnkD1TsLmt));
	}
	/**
	 * 텔레뱅킹1일이체한도
	 * BigDecimal - Long value setter
	 *
	 * @Param tlbnkD1TsLmt 텔레뱅킹1일이체한도
	 */
	public void setTlbnkD1TsLmt(long tlbnkD1TsLmt) {
		setTlbnkD1TsLmt(BigDecimal.valueOf(tlbnkD1TsLmt));
	}
	/**
	 * 텔레뱅킹1일이체한도
	 * BigDecimal - String value setter
	 *
	 * @Param tlbnkD1TsLmt 텔레뱅킹1일이체한도
	 */
	public void setTlbnkD1TsLmt(String tlbnkD1TsLmt) {
		setTlbnkD1TsLmt(new BigDecimal(tlbnkD1TsLmt));
	}
	/**
	 * 텔레뱅킹1일이체한도
	 */
	@XmlTransient
	public BigDecimal getTlbnkD1TsLmt(){
		return this.tlbnkD1TsLmt;
	}
	
	/**
	 * 텔레뱅킹1일이체한도
	 * 
	 * @param tlbnkD1TsLmt 텔레뱅킹1일이체한도
	 */
	@JsonSetter("tlbnkD1TsLmt")
	public void setTlbnkD1TsLmt(BigDecimal tlbnkD1TsLmt){
		this.tlbnkD1TsLmt= tlbnkD1TsLmt;
		this.setIsSet_tlbnkD1TsLmt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_tlbnkTms1TsLmt= false;
	protected final boolean isSet_tlbnkTms1TsLmt(){
		return this.isSet_tlbnkTms1TsLmt;
	}
	private void setIsSet_tlbnkTms1TsLmt(boolean value){
		this.isSet_tlbnkTms1TsLmt= value;
	}
	/**
	 * 텔레뱅킹1회이체한도
	 * BigDecimal - Double value setter
	 *
	 * @Param tlbnkTms1TsLmt 텔레뱅킹1회이체한도
	 */
	public void setTlbnkTms1TsLmt(double tlbnkTms1TsLmt) {
		setTlbnkTms1TsLmt(BigDecimal.valueOf(tlbnkTms1TsLmt));
	}
	/**
	 * 텔레뱅킹1회이체한도
	 * BigDecimal - Long value setter
	 *
	 * @Param tlbnkTms1TsLmt 텔레뱅킹1회이체한도
	 */
	public void setTlbnkTms1TsLmt(long tlbnkTms1TsLmt) {
		setTlbnkTms1TsLmt(BigDecimal.valueOf(tlbnkTms1TsLmt));
	}
	/**
	 * 텔레뱅킹1회이체한도
	 * BigDecimal - String value setter
	 *
	 * @Param tlbnkTms1TsLmt 텔레뱅킹1회이체한도
	 */
	public void setTlbnkTms1TsLmt(String tlbnkTms1TsLmt) {
		setTlbnkTms1TsLmt(new BigDecimal(tlbnkTms1TsLmt));
	}
	/**
	 * 텔레뱅킹1회이체한도
	 */
	@XmlTransient
	public BigDecimal getTlbnkTms1TsLmt(){
		return this.tlbnkTms1TsLmt;
	}
	
	/**
	 * 텔레뱅킹1회이체한도
	 * 
	 * @param tlbnkTms1TsLmt 텔레뱅킹1회이체한도
	 */
	@JsonSetter("tlbnkTms1TsLmt")
	public void setTlbnkTms1TsLmt(BigDecimal tlbnkTms1TsLmt){
		this.tlbnkTms1TsLmt= tlbnkTms1TsLmt;
		this.setIsSet_tlbnkTms1TsLmt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ntsvcRawDscd= false;
	protected final boolean isSet_ntsvcRawDscd(){
		return this.isSet_ntsvcRawDscd;
	}
	private void setIsSet_ntsvcRawDscd(boolean value){
		this.isSet_ntsvcRawDscd= value;
	}
	/**
	 * 알림서비스입출금구분코드
	 */
	@XmlTransient
	public String getNtsvcRawDscd(){
		return this.ntsvcRawDscd;
	}
	
	/**
	 * 알림서비스입출금구분코드
	 * 
	 * @param ntsvcRawDscd 알림서비스입출금구분코드
	 */
	public void setNtsvcRawDscd(String ntsvcRawDscd){
		this.ntsvcRawDscd= ntsvcRawDscd;
		this.setIsSet_ntsvcRawDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ntsvcBalNtyMarkYn= false;
	protected final boolean isSet_ntsvcBalNtyMarkYn(){
		return this.isSet_ntsvcBalNtyMarkYn;
	}
	private void setIsSet_ntsvcBalNtyMarkYn(boolean value){
		this.isSet_ntsvcBalNtyMarkYn= value;
	}
	/**
	 * 알림서비스잔액미표시여부
	 */
	@XmlTransient
	public String getNtsvcBalNtyMarkYn(){
		return this.ntsvcBalNtyMarkYn;
	}
	
	/**
	 * 알림서비스잔액미표시여부
	 * 
	 * @param ntsvcBalNtyMarkYn 알림서비스잔액미표시여부
	 */
	public void setNtsvcBalNtyMarkYn(String ntsvcBalNtyMarkYn){
		this.ntsvcBalNtyMarkYn= ntsvcBalNtyMarkYn;
		this.setIsSet_ntsvcBalNtyMarkYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ntsvcHpComCd= false;
	protected final boolean isSet_ntsvcHpComCd(){
		return this.isSet_ntsvcHpComCd;
	}
	private void setIsSet_ntsvcHpComCd(boolean value){
		this.isSet_ntsvcHpComCd= value;
	}
	/**
	 * 알림서비스핸드폰회사코드
	 */
	@XmlTransient
	public String getNtsvcHpComCd(){
		return this.ntsvcHpComCd;
	}
	
	/**
	 * 알림서비스핸드폰회사코드
	 * 
	 * @param ntsvcHpComCd 알림서비스핸드폰회사코드
	 */
	public void setNtsvcHpComCd(String ntsvcHpComCd){
		this.ntsvcHpComCd= ntsvcHpComCd;
		this.setIsSet_ntsvcHpComCd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ntsvcHpTlenNo= false;
	protected final boolean isSet_ntsvcHpTlenNo(){
		return this.isSet_ntsvcHpTlenNo;
	}
	private void setIsSet_ntsvcHpTlenNo(boolean value){
		this.isSet_ntsvcHpTlenNo= value;
	}
	/**
	 * 알림서비스핸드폰국번번호
	 */
	@XmlTransient
	public String getNtsvcHpTlenNo(){
		return this.ntsvcHpTlenNo;
	}
	
	/**
	 * 알림서비스핸드폰국번번호
	 * 
	 * @param ntsvcHpTlenNo 알림서비스핸드폰국번번호
	 */
	public void setNtsvcHpTlenNo(String ntsvcHpTlenNo){
		this.ntsvcHpTlenNo= ntsvcHpTlenNo;
		this.setIsSet_ntsvcHpTlenNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ntsvcHpSrno= false;
	protected final boolean isSet_ntsvcHpSrno(){
		return this.isSet_ntsvcHpSrno;
	}
	private void setIsSet_ntsvcHpSrno(boolean value){
		this.isSet_ntsvcHpSrno= value;
	}
	/**
	 * 알림서비스핸드폰일련번호
	 */
	@XmlTransient
	public String getNtsvcHpSrno(){
		return this.ntsvcHpSrno;
	}
	
	/**
	 * 알림서비스핸드폰일련번호
	 * 
	 * @param ntsvcHpSrno 알림서비스핸드폰일련번호
	 */
	public void setNtsvcHpSrno(String ntsvcHpSrno){
		this.ntsvcHpSrno= ntsvcHpSrno;
		this.setIsSet_ntsvcHpSrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ntsvcInotAm= false;
	protected final boolean isSet_ntsvcInotAm(){
		return this.isSet_ntsvcInotAm;
	}
	private void setIsSet_ntsvcInotAm(boolean value){
		this.isSet_ntsvcInotAm= value;
	}
	/**
	 * 알림서비스입출금액
	 * BigDecimal - Double value setter
	 *
	 * @Param ntsvcInotAm 알림서비스입출금액
	 */
	public void setNtsvcInotAm(double ntsvcInotAm) {
		setNtsvcInotAm(BigDecimal.valueOf(ntsvcInotAm));
	}
	/**
	 * 알림서비스입출금액
	 * BigDecimal - Long value setter
	 *
	 * @Param ntsvcInotAm 알림서비스입출금액
	 */
	public void setNtsvcInotAm(long ntsvcInotAm) {
		setNtsvcInotAm(BigDecimal.valueOf(ntsvcInotAm));
	}
	/**
	 * 알림서비스입출금액
	 * BigDecimal - String value setter
	 *
	 * @Param ntsvcInotAm 알림서비스입출금액
	 */
	public void setNtsvcInotAm(String ntsvcInotAm) {
		setNtsvcInotAm(new BigDecimal(ntsvcInotAm));
	}
	/**
	 * 알림서비스입출금액
	 */
	@XmlTransient
	public BigDecimal getNtsvcInotAm(){
		return this.ntsvcInotAm;
	}
	
	/**
	 * 알림서비스입출금액
	 * 
	 * @param ntsvcInotAm 알림서비스입출금액
	 */
	@JsonSetter("ntsvcInotAm")
	public void setNtsvcInotAm(BigDecimal ntsvcInotAm){
		this.ntsvcInotAm= ntsvcInotAm;
		this.setIsSet_ntsvcInotAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_astPrtsNtcYn= false;
	protected final boolean isSet_astPrtsNtcYn(){
		return this.isSet_astPrtsNtcYn;
	}
	private void setIsSet_astPrtsNtcYn(boolean value){
		this.isSet_astPrtsNtcYn= value;
	}
	/**
	 * 자동이체내역통지여부
	 */
	@XmlTransient
	public String getAstPrtsNtcYn(){
		return this.astPrtsNtcYn;
	}
	
	/**
	 * 자동이체내역통지여부
	 * 
	 * @param astPrtsNtcYn 자동이체내역통지여부
	 */
	public void setAstPrtsNtcYn(String astPrtsNtcYn){
		this.astPrtsNtcYn= astPrtsNtcYn;
		this.setIsSet_astPrtsNtcYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ntsvcTmsStaTim= false;
	protected final boolean isSet_ntsvcTmsStaTim(){
		return this.isSet_ntsvcTmsStaTim;
	}
	private void setIsSet_ntsvcTmsStaTim(boolean value){
		this.isSet_ntsvcTmsStaTim= value;
	}
	/**
	 * 알림서비스전송시작시간
	 */
	@XmlTransient
	public String getNtsvcTmsStaTim(){
		return this.ntsvcTmsStaTim;
	}
	
	/**
	 * 알림서비스전송시작시간
	 * 
	 * @param ntsvcTmsStaTim 알림서비스전송시작시간
	 */
	public void setNtsvcTmsStaTim(String ntsvcTmsStaTim){
		this.ntsvcTmsStaTim= ntsvcTmsStaTim;
		this.setIsSet_ntsvcTmsStaTim(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ntsvcTmsEndTim= false;
	protected final boolean isSet_ntsvcTmsEndTim(){
		return this.isSet_ntsvcTmsEndTim;
	}
	private void setIsSet_ntsvcTmsEndTim(boolean value){
		this.isSet_ntsvcTmsEndTim= value;
	}
	/**
	 * 알림서비스전송종료시간
	 */
	@XmlTransient
	public String getNtsvcTmsEndTim(){
		return this.ntsvcTmsEndTim;
	}
	
	/**
	 * 알림서비스전송종료시간
	 * 
	 * @param ntsvcTmsEndTim 알림서비스전송종료시간
	 */
	public void setNtsvcTmsEndTim(String ntsvcTmsEndTim){
		this.ntsvcTmsEndTim= ntsvcTmsEndTim;
		this.setIsSet_ntsvcTmsEndTim(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_wdrActRgsInetBnkgId= false;
	protected final boolean isSet_wdrActRgsInetBnkgId(){
		return this.isSet_wdrActRgsInetBnkgId;
	}
	private void setIsSet_wdrActRgsInetBnkgId(boolean value){
		this.isSet_wdrActRgsInetBnkgId= value;
	}
	/**
	 * 출금계좌등록인터넷뱅킹ID
	 */
	@XmlTransient
	public String getWdrActRgsInetBnkgId(){
		return this.wdrActRgsInetBnkgId;
	}
	
	/**
	 * 출금계좌등록인터넷뱅킹ID
	 * 
	 * @param wdrActRgsInetBnkgId 출금계좌등록인터넷뱅킹ID
	 */
	public void setWdrActRgsInetBnkgId(String wdrActRgsInetBnkgId){
		this.wdrActRgsInetBnkgId= wdrActRgsInetBnkgId;
		this.setIsSet_wdrActRgsInetBnkgId(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ebnkWdrActCnccRgsYn= false;
	protected final boolean isSet_ebnkWdrActCnccRgsYn(){
		return this.isSet_ebnkWdrActCnccRgsYn;
	}
	private void setIsSet_ebnkWdrActCnccRgsYn(boolean value){
		this.isSet_ebnkWdrActCnccRgsYn= value;
	}
	/**
	 * 전자뱅킹출금계좌동시등록여부
	 */
	@XmlTransient
	public String getEbnkWdrActCnccRgsYn(){
		return this.ebnkWdrActCnccRgsYn;
	}
	
	/**
	 * 전자뱅킹출금계좌동시등록여부
	 * 
	 * @param ebnkWdrActCnccRgsYn 전자뱅킹출금계좌동시등록여부
	 */
	public void setEbnkWdrActCnccRgsYn(String ebnkWdrActCnccRgsYn){
		this.ebnkWdrActCnccRgsYn= ebnkWdrActCnccRgsYn;
		this.setIsSet_ebnkWdrActCnccRgsYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_tlbnkWdrActCnccRgsYn= false;
	protected final boolean isSet_tlbnkWdrActCnccRgsYn(){
		return this.isSet_tlbnkWdrActCnccRgsYn;
	}
	private void setIsSet_tlbnkWdrActCnccRgsYn(boolean value){
		this.isSet_tlbnkWdrActCnccRgsYn= value;
	}
	/**
	 * 텔레뱅킹출금계좌동시등록여부
	 */
	@XmlTransient
	public String getTlbnkWdrActCnccRgsYn(){
		return this.tlbnkWdrActCnccRgsYn;
	}
	
	/**
	 * 텔레뱅킹출금계좌동시등록여부
	 * 
	 * @param tlbnkWdrActCnccRgsYn 텔레뱅킹출금계좌동시등록여부
	 */
	public void setTlbnkWdrActCnccRgsYn(String tlbnkWdrActCnccRgsYn){
		this.tlbnkWdrActCnccRgsYn= tlbnkWdrActCnccRgsYn;
		this.setIsSet_tlbnkWdrActCnccRgsYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_hswfPbokDocSndYn= false;
	protected final boolean isSet_hswfPbokDocSndYn(){
		return this.isSet_hswfPbokDocSndYn;
	}
	private void setIsSet_hswfPbokDocSndYn(boolean value){
		this.isSet_hswfPbokDocSndYn= value;
	}
	/**
	 * 부부통장서류발송여부
	 */
	@XmlTransient
	public String getHswfPbokDocSndYn(){
		return this.hswfPbokDocSndYn;
	}
	
	/**
	 * 부부통장서류발송여부
	 * 
	 * @param hswfPbokDocSndYn 부부통장서류발송여부
	 */
	public void setHswfPbokDocSndYn(String hswfPbokDocSndYn){
		this.hswfPbokDocSndYn= hswfPbokDocSndYn;
		this.setIsSet_hswfPbokDocSndYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_faOwacCsno= false;
	protected final boolean isSet_faOwacCsno(){
		return this.isSet_faOwacCsno;
	}
	private void setIsSet_faOwacCsno(boolean value){
		this.isSet_faOwacCsno= value;
	}
	/**
	 * 부예금주고객번호
	 */
	@XmlTransient
	public String getFaOwacCsno(){
		return this.faOwacCsno;
	}
	
	/**
	 * 부예금주고객번호
	 * 
	 * @param faOwacCsno 부예금주고객번호
	 */
	public void setFaOwacCsno(String faOwacCsno){
		this.faOwacCsno= faOwacCsno;
		this.setIsSet_faOwacCsno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_flieRgsYn= false;
	protected final boolean isSet_flieRgsYn(){
		return this.isSet_flieRgsYn;
	}
	private void setIsSet_flieRgsYn(boolean value){
		this.isSet_flieRgsYn= value;
	}
	/**
	 * 금융사기등록여부
	 */
	@XmlTransient
	public String getFlieRgsYn(){
		return this.flieRgsYn;
	}
	
	/**
	 * 금융사기등록여부
	 * 
	 * @param flieRgsYn 금융사기등록여부
	 */
	public void setFlieRgsYn(String flieRgsYn){
		this.flieRgsYn= flieRgsYn;
		this.setIsSet_flieRgsYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atsYn= false;
	protected final boolean isSet_atsYn(){
		return this.isSet_atsYn;
	}
	private void setIsSet_atsYn(boolean value){
		this.isSet_atsYn= value;
	}
	/**
	 * 자동이체여부
	 */
	@XmlTransient
	public String getAtsYn(){
		return this.atsYn;
	}
	
	/**
	 * 자동이체여부
	 * 
	 * @param atsYn 자동이체여부
	 */
	public void setAtsYn(String atsYn){
		this.atsYn= atsYn;
		this.setIsSet_atsYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_hmnyUsgAm= false;
	protected final boolean isSet_hmnyUsgAm(){
		return this.isSet_hmnyUsgAm;
	}
	private void setIsSet_hmnyUsgAm(boolean value){
		this.isSet_hmnyUsgAm= value;
	}
	/**
	 * 꿀머니사용금액
	 * BigDecimal - Double value setter
	 *
	 * @Param hmnyUsgAm 꿀머니사용금액
	 */
	public void setHmnyUsgAm(double hmnyUsgAm) {
		setHmnyUsgAm(BigDecimal.valueOf(hmnyUsgAm));
	}
	/**
	 * 꿀머니사용금액
	 * BigDecimal - Long value setter
	 *
	 * @Param hmnyUsgAm 꿀머니사용금액
	 */
	public void setHmnyUsgAm(long hmnyUsgAm) {
		setHmnyUsgAm(BigDecimal.valueOf(hmnyUsgAm));
	}
	/**
	 * 꿀머니사용금액
	 * BigDecimal - String value setter
	 *
	 * @Param hmnyUsgAm 꿀머니사용금액
	 */
	public void setHmnyUsgAm(String hmnyUsgAm) {
		setHmnyUsgAm(new BigDecimal(hmnyUsgAm));
	}
	/**
	 * 꿀머니사용금액
	 */
	@XmlTransient
	public BigDecimal getHmnyUsgAm(){
		return this.hmnyUsgAm;
	}
	
	/**
	 * 꿀머니사용금액
	 * 
	 * @param hmnyUsgAm 꿀머니사용금액
	 */
	@JsonSetter("hmnyUsgAm")
	public void setHmnyUsgAm(BigDecimal hmnyUsgAm){
		this.hmnyUsgAm= hmnyUsgAm;
		this.setIsSet_hmnyUsgAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_etcAcno= false;
	protected final boolean isSet_etcAcno(){
		return this.isSet_etcAcno;
	}
	private void setIsSet_etcAcno(boolean value){
		this.isSet_etcAcno= value;
	}
	/**
	 * 기타계좌번호
	 */
	@XmlTransient
	public String getEtcAcno(){
		return this.etcAcno;
	}
	
	/**
	 * 기타계좌번호
	 * 
	 * @param etcAcno 기타계좌번호
	 */
	public void setEtcAcno(String etcAcno){
		this.etcAcno= etcAcno;
		this.setIsSet_etcAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_trtpyRtPsnb= false;
	protected final boolean isSet_trtpyRtPsnb(){
		return this.isSet_trtpyRtPsnb;
	}
	private void setIsSet_trtpyRtPsnb(boolean value){
		this.isSet_trtpyRtPsnb= value;
	}
	/**
	 * 신탁보수율정수
	 */
	@XmlTransient
	public String getTrtpyRtPsnb(){
		return this.trtpyRtPsnb;
	}
	
	/**
	 * 신탁보수율정수
	 * 
	 * @param trtpyRtPsnb 신탁보수율정수
	 */
	public void setTrtpyRtPsnb(String trtpyRtPsnb){
		this.trtpyRtPsnb= trtpyRtPsnb;
		this.setIsSet_trtpyRtPsnb(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_trtpyRtDcml= false;
	protected final boolean isSet_trtpyRtDcml(){
		return this.isSet_trtpyRtDcml;
	}
	private void setIsSet_trtpyRtDcml(boolean value){
		this.isSet_trtpyRtDcml= value;
	}
	/**
	 * 신탁보수율소수
	 */
	@XmlTransient
	public String getTrtpyRtDcml(){
		return this.trtpyRtDcml;
	}
	
	/**
	 * 신탁보수율소수
	 * 
	 * @param trtpyRtDcml 신탁보수율소수
	 */
	public void setTrtpyRtDcml(String trtpyRtDcml){
		this.trtpyRtDcml= trtpyRtDcml;
		this.setIsSet_trtpyRtDcml(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_fltIrNtcDscd= false;
	protected final boolean isSet_fltIrNtcDscd(){
		return this.isSet_fltIrNtcDscd;
	}
	private void setIsSet_fltIrNtcDscd(boolean value){
		this.isSet_fltIrNtcDscd= value;
	}
	/**
	 * 변동금리통지구분코드
	 */
	@XmlTransient
	public String getFltIrNtcDscd(){
		return this.fltIrNtcDscd;
	}
	
	/**
	 * 변동금리통지구분코드
	 * 
	 * @param fltIrNtcDscd 변동금리통지구분코드
	 */
	public void setFltIrNtcDscd(String fltIrNtcDscd){
		this.fltIrNtcDscd= fltIrNtcDscd;
		this.setIsSet_fltIrNtcDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_etpCoplsDpstNewYn= false;
	protected final boolean isSet_etpCoplsDpstNewYn(){
		return this.isSet_etpCoplsDpstNewYn;
	}
	private void setIsSet_etpCoplsDpstNewYn(boolean value){
		this.isSet_etpCoplsDpstNewYn= value;
	}
	/**
	 * 대기업상생예금신규여부
	 */
	@XmlTransient
	public String getEtpCoplsDpstNewYn(){
		return this.etpCoplsDpstNewYn;
	}
	
	/**
	 * 대기업상생예금신규여부
	 * 
	 * @param etpCoplsDpstNewYn 대기업상생예금신규여부
	 */
	public void setEtpCoplsDpstNewYn(String etpCoplsDpstNewYn){
		this.etpCoplsDpstNewYn= etpCoplsDpstNewYn;
		this.setIsSet_etpCoplsDpstNewYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atsXtYn= false;
	protected final boolean isSet_atsXtYn(){
		return this.isSet_atsXtYn;
	}
	private void setIsSet_atsXtYn(boolean value){
		this.isSet_atsXtYn= value;
	}
	/**
	 * 자동이체제외여부
	 */
	@XmlTransient
	public String getAtsXtYn(){
		return this.atsXtYn;
	}
	
	/**
	 * 자동이체제외여부
	 * 
	 * @param atsXtYn 자동이체제외여부
	 */
	public void setAtsXtYn(String atsXtYn){
		this.atsXtYn= atsXtYn;
		this.setIsSet_atsXtYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_spslPdcd= false;
	protected final boolean isSet_spslPdcd(){
		return this.isSet_spslPdcd;
	}
	private void setIsSet_spslPdcd(boolean value){
		this.isSet_spslPdcd= value;
	}
	/**
	 * 특판상품코드
	 */
	@XmlTransient
	public String getSpslPdcd(){
		return this.spslPdcd;
	}
	
	/**
	 * 특판상품코드
	 * 
	 * @param spslPdcd 특판상품코드
	 */
	public void setSpslPdcd(String spslPdcd){
		this.spslPdcd= spslPdcd;
		this.setIsSet_spslPdcd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_trtPocpPfeRtPsnb= false;
	protected final boolean isSet_trtPocpPfeRtPsnb(){
		return this.isSet_trtPocpPfeRtPsnb;
	}
	private void setIsSet_trtPocpPfeRtPsnb(boolean value){
		this.isSet_trtPocpPfeRtPsnb= value;
	}
	/**
	 * 신탁선취보수율정수
	 */
	@XmlTransient
	public String getTrtPocpPfeRtPsnb(){
		return this.trtPocpPfeRtPsnb;
	}
	
	/**
	 * 신탁선취보수율정수
	 * 
	 * @param trtPocpPfeRtPsnb 신탁선취보수율정수
	 */
	public void setTrtPocpPfeRtPsnb(String trtPocpPfeRtPsnb){
		this.trtPocpPfeRtPsnb= trtPocpPfeRtPsnb;
		this.setIsSet_trtPocpPfeRtPsnb(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_trtPocpPfeRtDcml= false;
	protected final boolean isSet_trtPocpPfeRtDcml(){
		return this.isSet_trtPocpPfeRtDcml;
	}
	private void setIsSet_trtPocpPfeRtDcml(boolean value){
		this.isSet_trtPocpPfeRtDcml= value;
	}
	/**
	 * 신탁선취보수율소수
	 */
	@XmlTransient
	public String getTrtPocpPfeRtDcml(){
		return this.trtPocpPfeRtDcml;
	}
	
	/**
	 * 신탁선취보수율소수
	 * 
	 * @param trtPocpPfeRtDcml 신탁선취보수율소수
	 */
	public void setTrtPocpPfeRtDcml(String trtPocpPfeRtDcml){
		this.trtPocpPfeRtDcml= trtPocpPfeRtDcml;
		this.setIsSet_trtPocpPfeRtDcml(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_trtDfanPfeRtPsnb= false;
	protected final boolean isSet_trtDfanPfeRtPsnb(){
		return this.isSet_trtDfanPfeRtPsnb;
	}
	private void setIsSet_trtDfanPfeRtPsnb(boolean value){
		this.isSet_trtDfanPfeRtPsnb= value;
	}
	/**
	 * 신탁후취보수율정수
	 */
	@XmlTransient
	public String getTrtDfanPfeRtPsnb(){
		return this.trtDfanPfeRtPsnb;
	}
	
	/**
	 * 신탁후취보수율정수
	 * 
	 * @param trtDfanPfeRtPsnb 신탁후취보수율정수
	 */
	public void setTrtDfanPfeRtPsnb(String trtDfanPfeRtPsnb){
		this.trtDfanPfeRtPsnb= trtDfanPfeRtPsnb;
		this.setIsSet_trtDfanPfeRtPsnb(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_trtDfanPfeRtDcml= false;
	protected final boolean isSet_trtDfanPfeRtDcml(){
		return this.isSet_trtDfanPfeRtDcml;
	}
	private void setIsSet_trtDfanPfeRtDcml(boolean value){
		this.isSet_trtDfanPfeRtDcml= value;
	}
	/**
	 * 신탁후취보수율소수
	 */
	@XmlTransient
	public String getTrtDfanPfeRtDcml(){
		return this.trtDfanPfeRtDcml;
	}
	
	/**
	 * 신탁후취보수율소수
	 * 
	 * @param trtDfanPfeRtDcml 신탁후취보수율소수
	 */
	public void setTrtDfanPfeRtDcml(String trtDfanPfeRtDcml){
		this.trtDfanPfeRtDcml= trtDfanPfeRtDcml;
		this.setIsSet_trtDfanPfeRtDcml(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cponInpDscd= false;
	protected final boolean isSet_cponInpDscd(){
		return this.isSet_cponInpDscd;
	}
	private void setIsSet_cponInpDscd(boolean value){
		this.isSet_cponInpDscd= value;
	}
	/**
	 * 쿠폰입력구분코드
	 */
	@XmlTransient
	public String getCponInpDscd(){
		return this.cponInpDscd;
	}
	
	/**
	 * 쿠폰입력구분코드
	 * 
	 * @param cponInpDscd 쿠폰입력구분코드
	 */
	public void setCponInpDscd(String cponInpDscd){
		this.cponInpDscd= cponInpDscd;
		this.setIsSet_cponInpDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_agmIrtPsnb= false;
	protected final boolean isSet_agmIrtPsnb(){
		return this.isSet_agmIrtPsnb;
	}
	private void setIsSet_agmIrtPsnb(boolean value){
		this.isSet_agmIrtPsnb= value;
	}
	/**
	 * 약정이율정수
	 */
	@XmlTransient
	public Integer getAgmIrtPsnb(){
		return this.agmIrtPsnb;
	}
	
	/**
	 * 약정이율정수
	 * 
	 * @param agmIrtPsnb 약정이율정수
	 */
	public void setAgmIrtPsnb(Integer agmIrtPsnb){
		this.agmIrtPsnb= agmIrtPsnb;
		this.setIsSet_agmIrtPsnb(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_agmIrtDcml= false;
	protected final boolean isSet_agmIrtDcml(){
		return this.isSet_agmIrtDcml;
	}
	private void setIsSet_agmIrtDcml(boolean value){
		this.isSet_agmIrtDcml= value;
	}
	/**
	 * 약정이율소수
	 */
	@XmlTransient
	public String getAgmIrtDcml(){
		return this.agmIrtDcml;
	}
	
	/**
	 * 약정이율소수
	 * 
	 * @param agmIrtDcml 약정이율소수
	 */
	public void setAgmIrtDcml(String agmIrtDcml){
		this.agmIrtDcml= agmIrtDcml;
		this.setIsSet_agmIrtDcml(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pbokOtln= false;
	protected final boolean isSet_pbokOtln(){
		return this.isSet_pbokOtln;
	}
	private void setIsSet_pbokOtln(boolean value){
		this.isSet_pbokOtln= value;
	}
	/**
	 * 통장적요
	 */
	@XmlTransient
	public String getPbokOtln(){
		return this.pbokOtln;
	}
	
	/**
	 * 통장적요
	 * 
	 * @param pbokOtln 통장적요
	 */
	public void setPbokOtln(String pbokOtln){
		this.pbokOtln= pbokOtln;
		this.setIsSet_pbokOtln(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ascnBlgCd= false;
	protected final boolean isSet_ascnBlgCd(){
		return this.isSet_ascnBlgCd;
	}
	private void setIsSet_ascnBlgCd(boolean value){
		this.isSet_ascnBlgCd= value;
	}
	/**
	 * 단체소속코드
	 */
	@XmlTransient
	public String getAscnBlgCd(){
		return this.ascnBlgCd;
	}
	
	/**
	 * 단체소속코드
	 * 
	 * @param ascnBlgCd 단체소속코드
	 */
	public void setAscnBlgCd(String ascnBlgCd){
		this.ascnBlgCd= ascnBlgCd;
		this.setIsSet_ascnBlgCd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_acldCrtdSndDscd= false;
	protected final boolean isSet_acldCrtdSndDscd(){
		return this.isSet_acldCrtdSndDscd;
	}
	private void setIsSet_acldCrtdSndDscd(boolean value){
		this.isSet_acldCrtdSndDscd= value;
	}
	/**
	 * 적립증명서발송구분코드
	 */
	@XmlTransient
	public String getAcldCrtdSndDscd(){
		return this.acldCrtdSndDscd;
	}
	
	/**
	 * 적립증명서발송구분코드
	 * 
	 * @param acldCrtdSndDscd 적립증명서발송구분코드
	 */
	public void setAcldCrtdSndDscd(String acldCrtdSndDscd){
		this.acldCrtdSndDscd= acldCrtdSndDscd;
		this.setIsSet_acldCrtdSndDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_isaMajSbjPbokPrngYn= false;
	protected final boolean isSet_isaMajSbjPbokPrngYn(){
		return this.isSet_isaMajSbjPbokPrngYn;
	}
	private void setIsSet_isaMajSbjPbokPrngYn(boolean value){
		this.isSet_isaMajSbjPbokPrngYn= value;
	}
	/**
	 * ISA주요사항통장인자여부
	 */
	@XmlTransient
	public String getIsaMajSbjPbokPrngYn(){
		return this.isaMajSbjPbokPrngYn;
	}
	
	/**
	 * ISA주요사항통장인자여부
	 * 
	 * @param isaMajSbjPbokPrngYn ISA주요사항통장인자여부
	 */
	public void setIsaMajSbjPbokPrngYn(String isaMajSbjPbokPrngYn){
		this.isaMajSbjPbokPrngYn= isaMajSbjPbokPrngYn;
		this.setIsSet_isaMajSbjPbokPrngYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_isaNewDscd= false;
	protected final boolean isSet_isaNewDscd(){
		return this.isSet_isaNewDscd;
	}
	private void setIsSet_isaNewDscd(boolean value){
		this.isSet_isaNewDscd= value;
	}
	/**
	 * ISA신규구분코드
	 */
	@XmlTransient
	public String getIsaNewDscd(){
		return this.isaNewDscd;
	}
	
	/**
	 * ISA신규구분코드
	 * 
	 * @param isaNewDscd ISA신규구분코드
	 */
	public void setIsaNewDscd(String isaNewDscd){
		this.isaNewDscd= isaNewDscd;
		this.setIsSet_isaNewDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_isaJnngDscd= false;
	protected final boolean isSet_isaJnngDscd(){
		return this.isSet_isaJnngDscd;
	}
	private void setIsSet_isaJnngDscd(boolean value){
		this.isSet_isaJnngDscd= value;
	}
	/**
	 * ISA가입구분코드
	 */
	@XmlTransient
	public String getIsaJnngDscd(){
		return this.isaJnngDscd;
	}
	
	/**
	 * ISA가입구분코드
	 * 
	 * @param isaJnngDscd ISA가입구분코드
	 */
	public void setIsaJnngDscd(String isaJnngDscd){
		this.isaJnngDscd= isaJnngDscd;
		this.setIsSet_isaJnngDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_jnngAdvpeEno= false;
	protected final boolean isSet_jnngAdvpeEno(){
		return this.isSet_jnngAdvpeEno;
	}
	private void setIsSet_jnngAdvpeEno(boolean value){
		this.isSet_jnngAdvpeEno= value;
	}
	/**
	 * 가입권유자직원번호
	 */
	@XmlTransient
	public String getJnngAdvpeEno(){
		return this.jnngAdvpeEno;
	}
	
	/**
	 * 가입권유자직원번호
	 * 
	 * @param jnngAdvpeEno 가입권유자직원번호
	 */
	public void setJnngAdvpeEno(String jnngAdvpeEno){
		this.jnngAdvpeEno= jnngAdvpeEno;
		this.setIsSet_jnngAdvpeEno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_extxDscd= false;
	protected final boolean isSet_extxDscd(){
		return this.isSet_extxDscd;
	}
	private void setIsSet_extxDscd(boolean value){
		this.isSet_extxDscd= value;
	}
	/**
	 * 비과세구분코드
	 */
	@XmlTransient
	public String getExtxDscd(){
		return this.extxDscd;
	}
	
	/**
	 * 비과세구분코드
	 * 
	 * @param extxDscd 비과세구분코드
	 */
	public void setExtxDscd(String extxDscd){
		this.extxDscd= extxDscd;
		this.setIsSet_extxDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dtjnTemDscd= false;
	protected final boolean isSet_dtjnTemDscd(){
		return this.isSet_dtjnTemDscd;
	}
	private void setIsSet_dtjnTemDscd(boolean value){
		this.isSet_dtjnTemDscd= value;
	}
	/**
	 * 의무가입기간구분코드
	 */
	@XmlTransient
	public String getDtjnTemDscd(){
		return this.dtjnTemDscd;
	}
	
	/**
	 * 의무가입기간구분코드
	 * 
	 * @param dtjnTemDscd 의무가입기간구분코드
	 */
	public void setDtjnTemDscd(String dtjnTemDscd){
		this.dtjnTemDscd= dtjnTemDscd;
		this.setIsSet_dtjnTemDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mndDocCollYn= false;
	protected final boolean isSet_mndDocCollYn(){
		return this.isSet_mndDocCollYn;
	}
	private void setIsSet_mndDocCollYn(boolean value){
		this.isSet_mndDocCollYn= value;
	}
	/**
	 * 필수서류징구여부
	 */
	@XmlTransient
	public String getMndDocCollYn(){
		return this.mndDocCollYn;
	}
	
	/**
	 * 필수서류징구여부
	 * 
	 * @param mndDocCollYn 필수서류징구여부
	 */
	public void setMndDocCollYn(String mndDocCollYn){
		this.mndDocCollYn= mndDocCollYn;
		this.setIsSet_mndDocCollYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_enmtDt= false;
	protected final boolean isSet_enmtDt(){
		return this.isSet_enmtDt;
	}
	private void setIsSet_enmtDt(boolean value){
		this.isSet_enmtDt= value;
	}
	/**
	 * 입영일자
	 */
	@XmlTransient
	public String getEnmtDt(){
		return this.enmtDt;
	}
	
	/**
	 * 입영일자
	 * 
	 * @param enmtDt 입영일자
	 */
	public void setEnmtDt(String enmtDt){
		this.enmtDt= enmtDt;
		this.setIsSet_enmtDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dshgDt= false;
	protected final boolean isSet_dshgDt(){
		return this.isSet_dshgDt;
	}
	private void setIsSet_dshgDt(boolean value){
		this.isSet_dshgDt= value;
	}
	/**
	 * 전역일자
	 */
	@XmlTransient
	public String getDshgDt(){
		return this.dshgDt;
	}
	
	/**
	 * 전역일자
	 * 
	 * @param dshgDt 전역일자
	 */
	public void setDshgDt(String dshgDt){
		this.dshgDt= dshgDt;
		this.setIsSet_dshgDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ctrmvIscd= false;
	protected final boolean isSet_ctrmvIscd(){
		return this.isSet_ctrmvIscd;
	}
	private void setIsSet_ctrmvIscd(boolean value){
		this.isSet_ctrmvIscd= value;
	}
	/**
	 * 계약이전기관코드
	 */
	@XmlTransient
	public String getCtrmvIscd(){
		return this.ctrmvIscd;
	}
	
	/**
	 * 계약이전기관코드
	 * 
	 * @param ctrmvIscd 계약이전기관코드
	 */
	public void setCtrmvIscd(String ctrmvIscd){
		this.ctrmvIscd= ctrmvIscd;
		this.setIsSet_ctrmvIscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rtrtInsuCnvrAm= false;
	protected final boolean isSet_rtrtInsuCnvrAm(){
		return this.isSet_rtrtInsuCnvrAm;
	}
	private void setIsSet_rtrtInsuCnvrAm(boolean value){
		this.isSet_rtrtInsuCnvrAm= value;
	}
	/**
	 * 퇴직보험전환금액
	 * BigDecimal - Double value setter
	 *
	 * @Param rtrtInsuCnvrAm 퇴직보험전환금액
	 */
	public void setRtrtInsuCnvrAm(double rtrtInsuCnvrAm) {
		setRtrtInsuCnvrAm(BigDecimal.valueOf(rtrtInsuCnvrAm));
	}
	/**
	 * 퇴직보험전환금액
	 * BigDecimal - Long value setter
	 *
	 * @Param rtrtInsuCnvrAm 퇴직보험전환금액
	 */
	public void setRtrtInsuCnvrAm(long rtrtInsuCnvrAm) {
		setRtrtInsuCnvrAm(BigDecimal.valueOf(rtrtInsuCnvrAm));
	}
	/**
	 * 퇴직보험전환금액
	 * BigDecimal - String value setter
	 *
	 * @Param rtrtInsuCnvrAm 퇴직보험전환금액
	 */
	public void setRtrtInsuCnvrAm(String rtrtInsuCnvrAm) {
		setRtrtInsuCnvrAm(new BigDecimal(rtrtInsuCnvrAm));
	}
	/**
	 * 퇴직보험전환금액
	 */
	@XmlTransient
	public BigDecimal getRtrtInsuCnvrAm(){
		return this.rtrtInsuCnvrAm;
	}
	
	/**
	 * 퇴직보험전환금액
	 * 
	 * @param rtrtInsuCnvrAm 퇴직보험전환금액
	 */
	@JsonSetter("rtrtInsuCnvrAm")
	public void setRtrtInsuCnvrAm(BigDecimal rtrtInsuCnvrAm){
		this.rtrtInsuCnvrAm= rtrtInsuCnvrAm;
		this.setIsSet_rtrtInsuCnvrAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_aldJnpeTycd= false;
	protected final boolean isSet_aldJnpeTycd(){
		return this.isSet_aldJnpeTycd;
	}
	private void setIsSet_aldJnpeTycd(boolean value){
		this.isSet_aldJnpeTycd= value;
	}
	/**
	 * 기가입자유형코드
	 */
	@XmlTransient
	public String getAldJnpeTycd(){
		return this.aldJnpeTycd;
	}
	
	/**
	 * 기가입자유형코드
	 * 
	 * @param aldJnpeTycd 기가입자유형코드
	 */
	public void setAldJnpeTycd(String aldJnpeTycd){
		this.aldJnpeTycd= aldJnpeTycd;
		this.setIsSet_aldJnpeTycd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_fstJnngDt= false;
	protected final boolean isSet_fstJnngDt(){
		return this.isSet_fstJnngDt;
	}
	private void setIsSet_fstJnngDt(boolean value){
		this.isSet_fstJnngDt= value;
	}
	/**
	 * 최초가입일자
	 */
	@XmlTransient
	public String getFstJnngDt(){
		return this.fstJnngDt;
	}
	
	/**
	 * 최초가입일자
	 * 
	 * @param fstJnngDt 최초가입일자
	 */
	public void setFstJnngDt(String fstJnngDt){
		this.fstJnngDt= fstJnngDt;
		this.setIsSet_fstJnngDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_tfrAcno= false;
	protected final boolean isSet_tfrAcno(){
		return this.isSet_tfrAcno;
	}
	private void setIsSet_tfrAcno(boolean value){
		this.isSet_tfrAcno= value;
	}
	/**
	 * 이전계좌번호
	 */
	@XmlTransient
	public String getTfrAcno(){
		return this.tfrAcno;
	}
	
	/**
	 * 이전계좌번호
	 * 
	 * @param tfrAcno 이전계좌번호
	 */
	public void setTfrAcno(String tfrAcno){
		this.tfrAcno= tfrAcno;
		this.setIsSet_tfrAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_planNo= false;
	protected final boolean isSet_planNo(){
		return this.isSet_planNo;
	}
	private void setIsSet_planNo(boolean value){
		this.isSet_planNo= value;
	}
	/**
	 * 플랜번호
	 */
	@XmlTransient
	public String getPlanNo(){
		return this.planNo;
	}
	
	/**
	 * 플랜번호
	 * 
	 * @param planNo 플랜번호
	 */
	public void setPlanNo(String planNo){
		this.planNo= planNo;
		this.setIsSet_planNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_brdmKdcd= false;
	protected final boolean isSet_brdmKdcd(){
		return this.isSet_brdmKdcd;
	}
	private void setIsSet_brdmKdcd(boolean value){
		this.isSet_brdmKdcd= value;
	}
	/**
	 * 부담금종류코드
	 */
	@XmlTransient
	public String getBrdmKdcd(){
		return this.brdmKdcd;
	}
	
	/**
	 * 부담금종류코드
	 * 
	 * @param brdmKdcd 부담금종류코드
	 */
	public void setBrdmKdcd(String brdmKdcd){
		this.brdmKdcd= brdmKdcd;
		this.setIsSet_brdmKdcd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_scdOrdsMngNo= false;
	protected final boolean isSet_scdOrdsMngNo(){
		return this.isSet_scdOrdsMngNo;
	}
	private void setIsSet_scdOrdsMngNo(boolean value){
		this.isSet_scdOrdsMngNo= value;
	}
	/**
	 * 예정지시관리번호
	 */
	@XmlTransient
	public String getScdOrdsMngNo(){
		return this.scdOrdsMngNo;
	}
	
	/**
	 * 예정지시관리번호
	 * 
	 * @param scdOrdsMngNo 예정지시관리번호
	 */
	public void setScdOrdsMngNo(String scdOrdsMngNo){
		this.scdOrdsMngNo= scdOrdsMngNo;
		this.setIsSet_scdOrdsMngNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rtpenCobdnAm= false;
	protected final boolean isSet_rtpenCobdnAm(){
		return this.isSet_rtpenCobdnAm;
	}
	private void setIsSet_rtpenCobdnAm(boolean value){
		this.isSet_rtpenCobdnAm= value;
	}
	/**
	 * 퇴직연금기업부담금액
	 * BigDecimal - Double value setter
	 *
	 * @Param rtpenCobdnAm 퇴직연금기업부담금액
	 */
	public void setRtpenCobdnAm(double rtpenCobdnAm) {
		setRtpenCobdnAm(BigDecimal.valueOf(rtpenCobdnAm));
	}
	/**
	 * 퇴직연금기업부담금액
	 * BigDecimal - Long value setter
	 *
	 * @Param rtpenCobdnAm 퇴직연금기업부담금액
	 */
	public void setRtpenCobdnAm(long rtpenCobdnAm) {
		setRtpenCobdnAm(BigDecimal.valueOf(rtpenCobdnAm));
	}
	/**
	 * 퇴직연금기업부담금액
	 * BigDecimal - String value setter
	 *
	 * @Param rtpenCobdnAm 퇴직연금기업부담금액
	 */
	public void setRtpenCobdnAm(String rtpenCobdnAm) {
		setRtpenCobdnAm(new BigDecimal(rtpenCobdnAm));
	}
	/**
	 * 퇴직연금기업부담금액
	 */
	@XmlTransient
	public BigDecimal getRtpenCobdnAm(){
		return this.rtpenCobdnAm;
	}
	
	/**
	 * 퇴직연금기업부담금액
	 * 
	 * @param rtpenCobdnAm 퇴직연금기업부담금액
	 */
	@JsonSetter("rtpenCobdnAm")
	public void setRtpenCobdnAm(BigDecimal rtpenCobdnAm){
		this.rtpenCobdnAm= rtpenCobdnAm;
		this.setIsSet_rtpenCobdnAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rtpenPbdnAm= false;
	protected final boolean isSet_rtpenPbdnAm(){
		return this.isSet_rtpenPbdnAm;
	}
	private void setIsSet_rtpenPbdnAm(boolean value){
		this.isSet_rtpenPbdnAm= value;
	}
	/**
	 * 퇴직연금개인부담금액
	 * BigDecimal - Double value setter
	 *
	 * @Param rtpenPbdnAm 퇴직연금개인부담금액
	 */
	public void setRtpenPbdnAm(double rtpenPbdnAm) {
		setRtpenPbdnAm(BigDecimal.valueOf(rtpenPbdnAm));
	}
	/**
	 * 퇴직연금개인부담금액
	 * BigDecimal - Long value setter
	 *
	 * @Param rtpenPbdnAm 퇴직연금개인부담금액
	 */
	public void setRtpenPbdnAm(long rtpenPbdnAm) {
		setRtpenPbdnAm(BigDecimal.valueOf(rtpenPbdnAm));
	}
	/**
	 * 퇴직연금개인부담금액
	 * BigDecimal - String value setter
	 *
	 * @Param rtpenPbdnAm 퇴직연금개인부담금액
	 */
	public void setRtpenPbdnAm(String rtpenPbdnAm) {
		setRtpenPbdnAm(new BigDecimal(rtpenPbdnAm));
	}
	/**
	 * 퇴직연금개인부담금액
	 */
	@XmlTransient
	public BigDecimal getRtpenPbdnAm(){
		return this.rtpenPbdnAm;
	}
	
	/**
	 * 퇴직연금개인부담금액
	 * 
	 * @param rtpenPbdnAm 퇴직연금개인부담금액
	 */
	@JsonSetter("rtpenPbdnAm")
	public void setRtpenPbdnAm(BigDecimal rtpenPbdnAm){
		this.rtpenPbdnAm= rtpenPbdnAm;
		this.setIsSet_rtpenPbdnAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_opgMngFee= false;
	protected final boolean isSet_opgMngFee(){
		return this.isSet_opgMngFee;
	}
	private void setIsSet_opgMngFee(boolean value){
		this.isSet_opgMngFee= value;
	}
	/**
	 * 운용관리수수료
	 * BigDecimal - Double value setter
	 *
	 * @Param opgMngFee 운용관리수수료
	 */
	public void setOpgMngFee(double opgMngFee) {
		setOpgMngFee(BigDecimal.valueOf(opgMngFee));
	}
	/**
	 * 운용관리수수료
	 * BigDecimal - Long value setter
	 *
	 * @Param opgMngFee 운용관리수수료
	 */
	public void setOpgMngFee(long opgMngFee) {
		setOpgMngFee(BigDecimal.valueOf(opgMngFee));
	}
	/**
	 * 운용관리수수료
	 * BigDecimal - String value setter
	 *
	 * @Param opgMngFee 운용관리수수료
	 */
	public void setOpgMngFee(String opgMngFee) {
		setOpgMngFee(new BigDecimal(opgMngFee));
	}
	/**
	 * 운용관리수수료
	 */
	@XmlTransient
	public BigDecimal getOpgMngFee(){
		return this.opgMngFee;
	}
	
	/**
	 * 운용관리수수료
	 * 
	 * @param opgMngFee 운용관리수수료
	 */
	@JsonSetter("opgMngFee")
	public void setOpgMngFee(BigDecimal opgMngFee){
		this.opgMngFee= opgMngFee;
		this.setIsSet_opgMngFee(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_asetMngFee= false;
	protected final boolean isSet_asetMngFee(){
		return this.isSet_asetMngFee;
	}
	private void setIsSet_asetMngFee(boolean value){
		this.isSet_asetMngFee= value;
	}
	/**
	 * 자산관리수수료
	 * BigDecimal - Double value setter
	 *
	 * @Param asetMngFee 자산관리수수료
	 */
	public void setAsetMngFee(double asetMngFee) {
		setAsetMngFee(BigDecimal.valueOf(asetMngFee));
	}
	/**
	 * 자산관리수수료
	 * BigDecimal - Long value setter
	 *
	 * @Param asetMngFee 자산관리수수료
	 */
	public void setAsetMngFee(long asetMngFee) {
		setAsetMngFee(BigDecimal.valueOf(asetMngFee));
	}
	/**
	 * 자산관리수수료
	 * BigDecimal - String value setter
	 *
	 * @Param asetMngFee 자산관리수수료
	 */
	public void setAsetMngFee(String asetMngFee) {
		setAsetMngFee(new BigDecimal(asetMngFee));
	}
	/**
	 * 자산관리수수료
	 */
	@XmlTransient
	public BigDecimal getAsetMngFee(){
		return this.asetMngFee;
	}
	
	/**
	 * 자산관리수수료
	 * 
	 * @param asetMngFee 자산관리수수료
	 */
	@JsonSetter("asetMngFee")
	public void setAsetMngFee(BigDecimal asetMngFee){
		this.asetMngFee= asetMngFee;
		this.setIsSet_asetMngFee(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_stlAcno= false;
	protected final boolean isSet_stlAcno(){
		return this.isSet_stlAcno;
	}
	private void setIsSet_stlAcno(boolean value){
		this.isSet_stlAcno= value;
	}
	/**
	 * 결제계좌번호
	 */
	@XmlTransient
	public String getStlAcno(){
		return this.stlAcno;
	}
	
	/**
	 * 결제계좌번호
	 * 
	 * @param stlAcno 결제계좌번호
	 */
	public void setStlAcno(String stlAcno){
		this.stlAcno= stlAcno;
		this.setIsSet_stlAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_encyStlActPwno= false;
	protected final boolean isSet_encyStlActPwno(){
		return this.isSet_encyStlActPwno;
	}
	private void setIsSet_encyStlActPwno(boolean value){
		this.isSet_encyStlActPwno= value;
	}
	/**
	 * 암호화결제계좌비밀번호
	 */
	@XmlTransient
	public String getEncyStlActPwno(){
		return this.encyStlActPwno;
	}
	
	/**
	 * 암호화결제계좌비밀번호
	 * 
	 * @param encyStlActPwno 암호화결제계좌비밀번호
	 */
	public void setEncyStlActPwno(String encyStlActPwno){
		this.encyStlActPwno= encyStlActPwno;
		this.setIsSet_encyStlActPwno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_afepAddPidDscd= false;
	protected final boolean isSet_afepAddPidDscd(){
		return this.isSet_afepAddPidDscd;
	}
	private void setIsSet_afepAddPidDscd(boolean value){
		this.isSet_afepAddPidDscd= value;
	}
	/**
	 * 만기후추가납입구분코드
	 */
	@XmlTransient
	public String getAfepAddPidDscd(){
		return this.afepAddPidDscd;
	}
	
	/**
	 * 만기후추가납입구분코드
	 * 
	 * @param afepAddPidDscd 만기후추가납입구분코드
	 */
	public void setAfepAddPidDscd(String afepAddPidDscd){
		this.afepAddPidDscd= afepAddPidDscd;
		this.setIsSet_afepAddPidDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rprhLnkNewDscd= false;
	protected final boolean isSet_rprhLnkNewDscd(){
		return this.isSet_rprhLnkNewDscd;
	}
	private void setIsSet_rprhLnkNewDscd(boolean value){
		this.isSet_rprhLnkNewDscd= value;
	}
	/**
	 * 환매연동신규구분코드
	 */
	@XmlTransient
	public String getRprhLnkNewDscd(){
		return this.rprhLnkNewDscd;
	}
	
	/**
	 * 환매연동신규구분코드
	 * 
	 * @param rprhLnkNewDscd 환매연동신규구분코드
	 */
	public void setRprhLnkNewDscd(String rprhLnkNewDscd){
		this.rprhLnkNewDscd= rprhLnkNewDscd;
		this.setIsSet_rprhLnkNewDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cancRsvFndAcno= false;
	protected final boolean isSet_cancRsvFndAcno(){
		return this.isSet_cancRsvFndAcno;
	}
	private void setIsSet_cancRsvFndAcno(boolean value){
		this.isSet_cancRsvFndAcno= value;
	}
	/**
	 * 해지예약펀드계좌번호
	 */
	@XmlTransient
	public String getCancRsvFndAcno(){
		return this.cancRsvFndAcno;
	}
	
	/**
	 * 해지예약펀드계좌번호
	 * 
	 * @param cancRsvFndAcno 해지예약펀드계좌번호
	 */
	public void setCancRsvFndAcno(String cancRsvFndAcno){
		this.cancRsvFndAcno= cancRsvFndAcno;
		this.setIsSet_cancRsvFndAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rprhAmTamNewDscd= false;
	protected final boolean isSet_rprhAmTamNewDscd(){
		return this.isSet_rprhAmTamNewDscd;
	}
	private void setIsSet_rprhAmTamNewDscd(boolean value){
		this.isSet_rprhAmTamNewDscd= value;
	}
	/**
	 * 환매금액전액신규구분코드
	 */
	@XmlTransient
	public String getRprhAmTamNewDscd(){
		return this.rprhAmTamNewDscd;
	}
	
	/**
	 * 환매금액전액신규구분코드
	 * 
	 * @param rprhAmTamNewDscd 환매금액전액신규구분코드
	 */
	public void setRprhAmTamNewDscd(String rprhAmTamNewDscd){
		this.rprhAmTamNewDscd= rprhAmTamNewDscd;
		this.setIsSet_rprhAmTamNewDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_xcoPrmeIrt= false;
	protected final boolean isSet_xcoPrmeIrt(){
		return this.isSet_xcoPrmeIrt;
	}
	private void setIsSet_xcoPrmeIrt(boolean value){
		this.isSet_xcoPrmeIrt= value;
	}
	/**
	 * 우수기업우대이율
	 * BigDecimal - Double value setter
	 *
	 * @Param xcoPrmeIrt 우수기업우대이율
	 */
	public void setXcoPrmeIrt(double xcoPrmeIrt) {
		setXcoPrmeIrt(BigDecimal.valueOf(xcoPrmeIrt));
	}
	/**
	 * 우수기업우대이율
	 * BigDecimal - Long value setter
	 *
	 * @Param xcoPrmeIrt 우수기업우대이율
	 */
	public void setXcoPrmeIrt(long xcoPrmeIrt) {
		setXcoPrmeIrt(BigDecimal.valueOf(xcoPrmeIrt));
	}
	/**
	 * 우수기업우대이율
	 * BigDecimal - String value setter
	 *
	 * @Param xcoPrmeIrt 우수기업우대이율
	 */
	public void setXcoPrmeIrt(String xcoPrmeIrt) {
		setXcoPrmeIrt(new BigDecimal(xcoPrmeIrt));
	}
	/**
	 * 우수기업우대이율
	 */
	@XmlTransient
	public BigDecimal getXcoPrmeIrt(){
		return this.xcoPrmeIrt;
	}
	
	/**
	 * 우수기업우대이율
	 * 
	 * @param xcoPrmeIrt 우수기업우대이율
	 */
	@JsonSetter("xcoPrmeIrt")
	public void setXcoPrmeIrt(BigDecimal xcoPrmeIrt){
		this.xcoPrmeIrt= xcoPrmeIrt;
		this.setIsSet_xcoPrmeIrt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_fndGoalPrftRtPsnb= false;
	protected final boolean isSet_fndGoalPrftRtPsnb(){
		return this.isSet_fndGoalPrftRtPsnb;
	}
	private void setIsSet_fndGoalPrftRtPsnb(boolean value){
		this.isSet_fndGoalPrftRtPsnb= value;
	}
	/**
	 * 펀드목표수익율정수
	 */
	@XmlTransient
	public Integer getFndGoalPrftRtPsnb(){
		return this.fndGoalPrftRtPsnb;
	}
	
	/**
	 * 펀드목표수익율정수
	 * 
	 * @param fndGoalPrftRtPsnb 펀드목표수익율정수
	 */
	public void setFndGoalPrftRtPsnb(Integer fndGoalPrftRtPsnb){
		this.fndGoalPrftRtPsnb= fndGoalPrftRtPsnb;
		this.setIsSet_fndGoalPrftRtPsnb(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_fndGoalPrftRtDcml= false;
	protected final boolean isSet_fndGoalPrftRtDcml(){
		return this.isSet_fndGoalPrftRtDcml;
	}
	private void setIsSet_fndGoalPrftRtDcml(boolean value){
		this.isSet_fndGoalPrftRtDcml= value;
	}
	/**
	 * 펀드목표수익율소수
	 */
	@XmlTransient
	public String getFndGoalPrftRtDcml(){
		return this.fndGoalPrftRtDcml;
	}
	
	/**
	 * 펀드목표수익율소수
	 * 
	 * @param fndGoalPrftRtDcml 펀드목표수익율소수
	 */
	public void setFndGoalPrftRtDcml(String fndGoalPrftRtDcml){
		this.fndGoalPrftRtDcml= fndGoalPrftRtDcml;
		this.setIsSet_fndGoalPrftRtDcml(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_srvcRqAm= false;
	protected final boolean isSet_srvcRqAm(){
		return this.isSet_srvcRqAm;
	}
	private void setIsSet_srvcRqAm(boolean value){
		this.isSet_srvcRqAm= value;
	}
	/**
	 * 서비스신청금액
	 * BigDecimal - Double value setter
	 *
	 * @Param srvcRqAm 서비스신청금액
	 */
	public void setSrvcRqAm(double srvcRqAm) {
		setSrvcRqAm(BigDecimal.valueOf(srvcRqAm));
	}
	/**
	 * 서비스신청금액
	 * BigDecimal - Long value setter
	 *
	 * @Param srvcRqAm 서비스신청금액
	 */
	public void setSrvcRqAm(long srvcRqAm) {
		setSrvcRqAm(BigDecimal.valueOf(srvcRqAm));
	}
	/**
	 * 서비스신청금액
	 * BigDecimal - String value setter
	 *
	 * @Param srvcRqAm 서비스신청금액
	 */
	public void setSrvcRqAm(String srvcRqAm) {
		setSrvcRqAm(new BigDecimal(srvcRqAm));
	}
	/**
	 * 서비스신청금액
	 */
	@XmlTransient
	public BigDecimal getSrvcRqAm(){
		return this.srvcRqAm;
	}
	
	/**
	 * 서비스신청금액
	 * 
	 * @param srvcRqAm 서비스신청금액
	 */
	@JsonSetter("srvcRqAm")
	public void setSrvcRqAm(BigDecimal srvcRqAm){
		this.srvcRqAm= srvcRqAm;
		this.setIsSet_srvcRqAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_fndAcblNtcDis= false;
	protected final boolean isSet_fndAcblNtcDis(){
		return this.isSet_fndAcblNtcDis;
	}
	private void setIsSet_fndAcblNtcDis(boolean value){
		this.isSet_fndAcblNtcDis= value;
	}
	/**
	 * 펀드잔고통지구분
	 */
	@XmlTransient
	public String getFndAcblNtcDis(){
		return this.fndAcblNtcDis;
	}
	
	/**
	 * 펀드잔고통지구분
	 * 
	 * @param fndAcblNtcDis 펀드잔고통지구분
	 */
	public void setFndAcblNtcDis(String fndAcblNtcDis){
		this.fndAcblNtcDis= fndAcblNtcDis;
		this.setIsSet_fndAcblNtcDis(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_fndAcblNtfcBasDd= false;
	protected final boolean isSet_fndAcblNtfcBasDd(){
		return this.isSet_fndAcblNtfcBasDd;
	}
	private void setIsSet_fndAcblNtfcBasDd(boolean value){
		this.isSet_fndAcblNtfcBasDd= value;
	}
	/**
	 * 펀드잔고알림기준일
	 */
	@XmlTransient
	public Integer getFndAcblNtfcBasDd(){
		return this.fndAcblNtfcBasDd;
	}
	
	/**
	 * 펀드잔고알림기준일
	 * 
	 * @param fndAcblNtfcBasDd 펀드잔고알림기준일
	 */
	public void setFndAcblNtfcBasDd(Integer fndAcblNtfcBasDd){
		this.fndAcblNtfcBasDd= fndAcblNtfcBasDd;
		this.setIsSet_fndAcblNtfcBasDd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_fndPrftRtSmsChrRqDscd= false;
	protected final boolean isSet_fndPrftRtSmsChrRqDscd(){
		return this.isSet_fndPrftRtSmsChrRqDscd;
	}
	private void setIsSet_fndPrftRtSmsChrRqDscd(boolean value){
		this.isSet_fndPrftRtSmsChrRqDscd= value;
	}
	/**
	 * 펀드수익율SMS문자신청구분코드
	 */
	@XmlTransient
	public String getFndPrftRtSmsChrRqDscd(){
		return this.fndPrftRtSmsChrRqDscd;
	}
	
	/**
	 * 펀드수익율SMS문자신청구분코드
	 * 
	 * @param fndPrftRtSmsChrRqDscd 펀드수익율SMS문자신청구분코드
	 */
	public void setFndPrftRtSmsChrRqDscd(String fndPrftRtSmsChrRqDscd){
		this.fndPrftRtSmsChrRqDscd= fndPrftRtSmsChrRqDscd;
		this.setIsSet_fndPrftRtSmsChrRqDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_fndSmsRqTprtPsnb= false;
	protected final boolean isSet_fndSmsRqTprtPsnb(){
		return this.isSet_fndSmsRqTprtPsnb;
	}
	private void setIsSet_fndSmsRqTprtPsnb(boolean value){
		this.isSet_fndSmsRqTprtPsnb= value;
	}
	/**
	 * 펀드SMS신청목표수익율정수
	 */
	@XmlTransient
	public Integer getFndSmsRqTprtPsnb(){
		return this.fndSmsRqTprtPsnb;
	}
	
	/**
	 * 펀드SMS신청목표수익율정수
	 * 
	 * @param fndSmsRqTprtPsnb 펀드SMS신청목표수익율정수
	 */
	public void setFndSmsRqTprtPsnb(Integer fndSmsRqTprtPsnb){
		this.fndSmsRqTprtPsnb= fndSmsRqTprtPsnb;
		this.setIsSet_fndSmsRqTprtPsnb(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_fndSmsRqTprtDcml= false;
	protected final boolean isSet_fndSmsRqTprtDcml(){
		return this.isSet_fndSmsRqTprtDcml;
	}
	private void setIsSet_fndSmsRqTprtDcml(boolean value){
		this.isSet_fndSmsRqTprtDcml= value;
	}
	/**
	 * 펀드SMS신청목표수익율소수
	 */
	@XmlTransient
	public String getFndSmsRqTprtDcml(){
		return this.fndSmsRqTprtDcml;
	}
	
	/**
	 * 펀드SMS신청목표수익율소수
	 * 
	 * @param fndSmsRqTprtDcml 펀드SMS신청목표수익율소수
	 */
	public void setFndSmsRqTprtDcml(String fndSmsRqTprtDcml){
		this.fndSmsRqTprtDcml= fndSmsRqTprtDcml;
		this.setIsSet_fndSmsRqTprtDcml(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_fndSmsRqTprtDscd= false;
	protected final boolean isSet_fndSmsRqTprtDscd(){
		return this.isSet_fndSmsRqTprtDscd;
	}
	private void setIsSet_fndSmsRqTprtDscd(boolean value){
		this.isSet_fndSmsRqTprtDscd= value;
	}
	/**
	 * 펀드SMS신청목표수익율구분코드
	 */
	@XmlTransient
	public String getFndSmsRqTprtDscd(){
		return this.fndSmsRqTprtDscd;
	}
	
	/**
	 * 펀드SMS신청목표수익율구분코드
	 * 
	 * @param fndSmsRqTprtDscd 펀드SMS신청목표수익율구분코드
	 */
	public void setFndSmsRqTprtDscd(String fndSmsRqTprtDscd){
		this.fndSmsRqTprtDscd= fndSmsRqTprtDscd;
		this.setIsSet_fndSmsRqTprtDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_fndSmsRqLossAwrtPsnb= false;
	protected final boolean isSet_fndSmsRqLossAwrtPsnb(){
		return this.isSet_fndSmsRqLossAwrtPsnb;
	}
	private void setIsSet_fndSmsRqLossAwrtPsnb(boolean value){
		this.isSet_fndSmsRqLossAwrtPsnb= value;
	}
	/**
	 * 펀드SMS신청손실허용율정수
	 */
	@XmlTransient
	public Integer getFndSmsRqLossAwrtPsnb(){
		return this.fndSmsRqLossAwrtPsnb;
	}
	
	/**
	 * 펀드SMS신청손실허용율정수
	 * 
	 * @param fndSmsRqLossAwrtPsnb 펀드SMS신청손실허용율정수
	 */
	public void setFndSmsRqLossAwrtPsnb(Integer fndSmsRqLossAwrtPsnb){
		this.fndSmsRqLossAwrtPsnb= fndSmsRqLossAwrtPsnb;
		this.setIsSet_fndSmsRqLossAwrtPsnb(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_fndSmsRqLossAwrtDcml= false;
	protected final boolean isSet_fndSmsRqLossAwrtDcml(){
		return this.isSet_fndSmsRqLossAwrtDcml;
	}
	private void setIsSet_fndSmsRqLossAwrtDcml(boolean value){
		this.isSet_fndSmsRqLossAwrtDcml= value;
	}
	/**
	 * 펀드SMS신청손실허용율소수
	 */
	@XmlTransient
	public String getFndSmsRqLossAwrtDcml(){
		return this.fndSmsRqLossAwrtDcml;
	}
	
	/**
	 * 펀드SMS신청손실허용율소수
	 * 
	 * @param fndSmsRqLossAwrtDcml 펀드SMS신청손실허용율소수
	 */
	public void setFndSmsRqLossAwrtDcml(String fndSmsRqLossAwrtDcml){
		this.fndSmsRqLossAwrtDcml= fndSmsRqLossAwrtDcml;
		this.setIsSet_fndSmsRqLossAwrtDcml(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_fndSmsRqLossAwrtDscd= false;
	protected final boolean isSet_fndSmsRqLossAwrtDscd(){
		return this.isSet_fndSmsRqLossAwrtDscd;
	}
	private void setIsSet_fndSmsRqLossAwrtDscd(boolean value){
		this.isSet_fndSmsRqLossAwrtDscd= value;
	}
	/**
	 * 펀드SMS신청손실허용율구분코드
	 */
	@XmlTransient
	public String getFndSmsRqLossAwrtDscd(){
		return this.fndSmsRqLossAwrtDscd;
	}
	
	/**
	 * 펀드SMS신청손실허용율구분코드
	 * 
	 * @param fndSmsRqLossAwrtDscd 펀드SMS신청손실허용율구분코드
	 */
	public void setFndSmsRqLossAwrtDscd(String fndSmsRqLossAwrtDscd){
		this.fndSmsRqLossAwrtDscd= fndSmsRqLossAwrtDscd;
		this.setIsSet_fndSmsRqLossAwrtDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_fndFpPrftRtSmsChrRqDscd= false;
	protected final boolean isSet_fndFpPrftRtSmsChrRqDscd(){
		return this.isSet_fndFpPrftRtSmsChrRqDscd;
	}
	private void setIsSet_fndFpPrftRtSmsChrRqDscd(boolean value){
		this.isSet_fndFpPrftRtSmsChrRqDscd= value;
	}
	/**
	 * 펀드정기수익율SMS문자신청구분코드
	 */
	@XmlTransient
	public String getFndFpPrftRtSmsChrRqDscd(){
		return this.fndFpPrftRtSmsChrRqDscd;
	}
	
	/**
	 * 펀드정기수익율SMS문자신청구분코드
	 * 
	 * @param fndFpPrftRtSmsChrRqDscd 펀드정기수익율SMS문자신청구분코드
	 */
	public void setFndFpPrftRtSmsChrRqDscd(String fndFpPrftRtSmsChrRqDscd){
		this.fndFpPrftRtSmsChrRqDscd= fndFpPrftRtSmsChrRqDscd;
		this.setIsSet_fndFpPrftRtSmsChrRqDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_fndFpPrftRtSmsChrRqDtDscd= false;
	protected final boolean isSet_fndFpPrftRtSmsChrRqDtDscd(){
		return this.isSet_fndFpPrftRtSmsChrRqDtDscd;
	}
	private void setIsSet_fndFpPrftRtSmsChrRqDtDscd(boolean value){
		this.isSet_fndFpPrftRtSmsChrRqDtDscd= value;
	}
	/**
	 * 펀드정기수익율SMS문자신청일자구분코드
	 */
	@XmlTransient
	public String getFndFpPrftRtSmsChrRqDtDscd(){
		return this.fndFpPrftRtSmsChrRqDtDscd;
	}
	
	/**
	 * 펀드정기수익율SMS문자신청일자구분코드
	 * 
	 * @param fndFpPrftRtSmsChrRqDtDscd 펀드정기수익율SMS문자신청일자구분코드
	 */
	public void setFndFpPrftRtSmsChrRqDtDscd(String fndFpPrftRtSmsChrRqDtDscd){
		this.fndFpPrftRtSmsChrRqDtDscd= fndFpPrftRtSmsChrRqDtDscd;
		this.setIsSet_fndFpPrftRtSmsChrRqDtDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_scntRqdcPrngOmitYn= false;
	protected final boolean isSet_scntRqdcPrngOmitYn(){
		return this.isSet_scntRqdcPrngOmitYn;
	}
	private void setIsSet_scntRqdcPrngOmitYn(boolean value){
		this.isSet_scntRqdcPrngOmitYn= value;
	}
	/**
	 * 매수신청서인자생략여부
	 */
	@XmlTransient
	public String getScntRqdcPrngOmitYn(){
		return this.scntRqdcPrngOmitYn;
	}
	
	/**
	 * 매수신청서인자생략여부
	 * 
	 * @param scntRqdcPrngOmitYn 매수신청서인자생략여부
	 */
	public void setScntRqdcPrngOmitYn(String scntRqdcPrngOmitYn){
		this.scntRqdcPrngOmitYn= scntRqdcPrngOmitYn;
		this.setIsSet_scntRqdcPrngOmitYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_oldAtrbChckHisSrno= false;
	protected final boolean isSet_oldAtrbChckHisSrno(){
		return this.isSet_oldAtrbChckHisSrno;
	}
	private void setIsSet_oldAtrbChckHisSrno(boolean value){
		this.isSet_oldAtrbChckHisSrno= value;
	}
	/**
	 * 구속성점검명세일련번호
	 */
	@XmlTransient
	public String getOldAtrbChckHisSrno(){
		return this.oldAtrbChckHisSrno;
	}
	
	/**
	 * 구속성점검명세일련번호
	 * 
	 * @param oldAtrbChckHisSrno 구속성점검명세일련번호
	 */
	public void setOldAtrbChckHisSrno(String oldAtrbChckHisSrno){
		this.oldAtrbChckHisSrno= oldAtrbChckHisSrno;
		this.setIsSet_oldAtrbChckHisSrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_newVstrMngNo= false;
	protected final boolean isSet_newVstrMngNo(){
		return this.isSet_newVstrMngNo;
	}
	private void setIsSet_newVstrMngNo(boolean value){
		this.isSet_newVstrMngNo= value;
	}
	/**
	 * 신규보스트로관리번호
	 */
	@XmlTransient
	public String getNewVstrMngNo(){
		return this.newVstrMngNo;
	}
	
	/**
	 * 신규보스트로관리번호
	 * 
	 * @param newVstrMngNo 신규보스트로관리번호
	 */
	public void setNewVstrMngNo(String newVstrMngNo){
		this.newVstrMngNo= newVstrMngNo;
		this.setIsSet_newVstrMngNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_payVstrMngNo= false;
	protected final boolean isSet_payVstrMngNo(){
		return this.isSet_payVstrMngNo;
	}
	private void setIsSet_payVstrMngNo(boolean value){
		this.isSet_payVstrMngNo= value;
	}
	/**
	 * 지급보스트로관리번호
	 */
	@XmlTransient
	public String getPayVstrMngNo(){
		return this.payVstrMngNo;
	}
	
	/**
	 * 지급보스트로관리번호
	 * 
	 * @param payVstrMngNo 지급보스트로관리번호
	 */
	public void setPayVstrMngNo(String payVstrMngNo){
		this.payVstrMngNo= payVstrMngNo;
		this.setIsSet_payVstrMngNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_spotTfrRtpenPrdNo= false;
	protected final boolean isSet_spotTfrRtpenPrdNo(){
		return this.isSet_spotTfrRtpenPrdNo;
	}
	private void setIsSet_spotTfrRtpenPrdNo(boolean value){
		this.isSet_spotTfrRtpenPrdNo= value;
	}
	/**
	 * 현물이전퇴직연금상품번호
	 */
	@XmlTransient
	public String getSpotTfrRtpenPrdNo(){
		return this.spotTfrRtpenPrdNo;
	}
	
	/**
	 * 현물이전퇴직연금상품번호
	 * 
	 * @param spotTfrRtpenPrdNo 현물이전퇴직연금상품번호
	 */
	public void setSpotTfrRtpenPrdNo(String spotTfrRtpenPrdNo){
		this.spotTfrRtpenPrdNo= spotTfrRtpenPrdNo;
		this.setIsSet_spotTfrRtpenPrdNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rtttIscd= false;
	protected final boolean isSet_rtttIscd(){
		return this.isSet_rtttIscd;
	}
	private void setIsSet_rtttIscd(boolean value){
		this.isSet_rtttIscd= value;
	}
	/**
	 * 퇴직신탁기관코드
	 */
	@XmlTransient
	public String getRtttIscd(){
		return this.rtttIscd;
	}
	
	/**
	 * 퇴직신탁기관코드
	 * 
	 * @param rtttIscd 퇴직신탁기관코드
	 */
	public void setRtttIscd(String rtttIscd){
		this.rtttIscd= rtttIscd;
		this.setIsSet_rtttIscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_spotTfrRtpenPlanDscd= false;
	protected final boolean isSet_spotTfrRtpenPlanDscd(){
		return this.isSet_spotTfrRtpenPlanDscd;
	}
	private void setIsSet_spotTfrRtpenPlanDscd(boolean value){
		this.isSet_spotTfrRtpenPlanDscd= value;
	}
	/**
	 * 현물이전퇴직연금플랜구분코드
	 */
	@XmlTransient
	public String getSpotTfrRtpenPlanDscd(){
		return this.spotTfrRtpenPlanDscd;
	}
	
	/**
	 * 현물이전퇴직연금플랜구분코드
	 * 
	 * @param spotTfrRtpenPlanDscd 현물이전퇴직연금플랜구분코드
	 */
	public void setSpotTfrRtpenPlanDscd(String spotTfrRtpenPlanDscd){
		this.spotTfrRtpenPlanDscd= spotTfrRtpenPlanDscd;
		this.setIsSet_spotTfrRtpenPlanDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_intRcvFcAcno= false;
	protected final boolean isSet_intRcvFcAcno(){
		return this.isSet_intRcvFcAcno;
	}
	private void setIsSet_intRcvFcAcno(boolean value){
		this.isSet_intRcvFcAcno= value;
	}
	/**
	 * 이자입금외화계좌번호
	 */
	@XmlTransient
	public String getIntRcvFcAcno(){
		return this.intRcvFcAcno;
	}
	
	/**
	 * 이자입금외화계좌번호
	 * 
	 * @param intRcvFcAcno 이자입금외화계좌번호
	 */
	public void setIntRcvFcAcno(String intRcvFcAcno){
		this.intRcvFcAcno= intRcvFcAcno;
		this.setIsSet_intRcvFcAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pbdeedPrngYn= false;
	protected final boolean isSet_pbdeedPrngYn(){
		return this.isSet_pbdeedPrngYn;
	}
	private void setIsSet_pbdeedPrngYn(boolean value){
		this.isSet_pbdeedPrngYn= value;
	}
	/**
	 * 통장증서인자여부
	 */
	@XmlTransient
	public String getPbdeedPrngYn(){
		return this.pbdeedPrngYn;
	}
	
	/**
	 * 통장증서인자여부
	 * 
	 * @param pbdeedPrngYn 통장증서인자여부
	 */
	public void setPbdeedPrngYn(String pbdeedPrngYn){
		this.pbdeedPrngYn= pbdeedPrngYn;
		this.setIsSet_pbdeedPrngYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dgnXrtPsnb= false;
	protected final boolean isSet_dgnXrtPsnb(){
		return this.isSet_dgnXrtPsnb;
	}
	private void setIsSet_dgnXrtPsnb(boolean value){
		this.isSet_dgnXrtPsnb= value;
	}
	/**
	 * 지정환율정수
	 */
	@XmlTransient
	public Integer getDgnXrtPsnb(){
		return this.dgnXrtPsnb;
	}
	
	/**
	 * 지정환율정수
	 * 
	 * @param dgnXrtPsnb 지정환율정수
	 */
	public void setDgnXrtPsnb(Integer dgnXrtPsnb){
		this.dgnXrtPsnb= dgnXrtPsnb;
		this.setIsSet_dgnXrtPsnb(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dgnXrtDcml= false;
	protected final boolean isSet_dgnXrtDcml(){
		return this.isSet_dgnXrtDcml;
	}
	private void setIsSet_dgnXrtDcml(boolean value){
		this.isSet_dgnXrtDcml= value;
	}
	/**
	 * 지정환율소수
	 */
	@XmlTransient
	public String getDgnXrtDcml(){
		return this.dgnXrtDcml;
	}
	
	/**
	 * 지정환율소수
	 * 
	 * @param dgnXrtDcml 지정환율소수
	 */
	public void setDgnXrtDcml(String dgnXrtDcml){
		this.dgnXrtDcml= dgnXrtDcml;
		this.setIsSet_dgnXrtDcml(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mkshMbhYn= false;
	protected final boolean isSet_mkshMbhYn(){
		return this.isSet_mkshMbhYn;
	}
	private void setIsSet_mkshMbhYn(boolean value){
		this.isSet_mkshMbhYn= value;
	}
	/**
	 * 메이크샵회원여부
	 */
	@XmlTransient
	public String getMkshMbhYn(){
		return this.mkshMbhYn;
	}
	
	/**
	 * 메이크샵회원여부
	 * 
	 * @param mkshMbhYn 메이크샵회원여부
	 */
	public void setMkshMbhYn(String mkshMbhYn){
		this.mkshMbhYn= mkshMbhYn;
		this.setIsSet_mkshMbhYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_asstmPbokDscd= false;
	protected final boolean isSet_asstmPbokDscd(){
		return this.isSet_asstmPbokDscd;
	}
	private void setIsSet_asstmPbokDscd(boolean value){
		this.isSet_asstmPbokDscd= value;
	}
	/**
	 * 보조금통장구분코드
	 */
	@XmlTransient
	public String getAsstmPbokDscd(){
		return this.asstmPbokDscd;
	}
	
	/**
	 * 보조금통장구분코드
	 * 
	 * @param asstmPbokDscd 보조금통장구분코드
	 */
	public void setAsstmPbokDscd(String asstmPbokDscd){
		this.asstmPbokDscd= asstmPbokDscd;
		this.setIsSet_asstmPbokDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_wbbtJnngHpNo= false;
	protected final boolean isSet_wbbtJnngHpNo(){
		return this.isSet_wbbtJnngHpNo;
	}
	private void setIsSet_wbbtJnngHpNo(boolean value){
		this.isSet_wbbtJnngHpNo= value;
	}
	/**
	 * 위비톡가입핸드폰번호
	 */
	@XmlTransient
	public String getWbbtJnngHpNo(){
		return this.wbbtJnngHpNo;
	}
	
	/**
	 * 위비톡가입핸드폰번호
	 * 
	 * @param wbbtJnngHpNo 위비톡가입핸드폰번호
	 */
	public void setWbbtJnngHpNo(String wbbtJnngHpNo){
		this.wbbtJnngHpNo= wbbtJnngHpNo;
		this.setIsSet_wbbtJnngHpNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_prdOpgDscd= false;
	protected final boolean isSet_prdOpgDscd(){
		return this.isSet_prdOpgDscd;
	}
	private void setIsSet_prdOpgDscd(boolean value){
		this.isSet_prdOpgDscd= value;
	}
	/**
	 * 상품운용구분코드
	 */
	@XmlTransient
	public String getPrdOpgDscd(){
		return this.prdOpgDscd;
	}
	
	/**
	 * 상품운용구분코드
	 * 
	 * @param prdOpgDscd 상품운용구분코드
	 */
	public void setPrdOpgDscd(String prdOpgDscd){
		this.prdOpgDscd= prdOpgDscd;
		this.setIsSet_prdOpgDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_newInqYn= false;
	protected final boolean isSet_newInqYn(){
		return this.isSet_newInqYn;
	}
	private void setIsSet_newInqYn(boolean value){
		this.isSet_newInqYn= value;
	}
	/**
	 * 신규조회여부
	 */
	@XmlTransient
	public String getNewInqYn(){
		return this.newInqYn;
	}
	
	/**
	 * 신규조회여부
	 * 
	 * @param newInqYn 신규조회여부
	 */
	public void setNewInqYn(String newInqYn){
		this.newInqYn= newInqYn;
		this.setIsSet_newInqYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pwnoNuseYn= false;
	protected final boolean isSet_pwnoNuseYn(){
		return this.isSet_pwnoNuseYn;
	}
	private void setIsSet_pwnoNuseYn(boolean value){
		this.isSet_pwnoNuseYn= value;
	}
	/**
	 * 비밀번호미사용여부
	 */
	@XmlTransient
	public String getPwnoNuseYn(){
		return this.pwnoNuseYn;
	}
	
	/**
	 * 비밀번호미사용여부
	 * 
	 * @param pwnoNuseYn 비밀번호미사용여부
	 */
	public void setPwnoNuseYn(String pwnoNuseYn){
		this.pwnoNuseYn= pwnoNuseYn;
		this.setIsSet_pwnoNuseYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_bchrInqTim= false;
	protected final boolean isSet_bchrInqTim(){
		return this.isSet_bchrInqTim;
	}
	private void setIsSet_bchrInqTim(boolean value){
		this.isSet_bchrInqTim= value;
	}
	/**
	 * 바우처조회시간
	 */
	@XmlTransient
	public String getBchrInqTim(){
		return this.bchrInqTim;
	}
	
	/**
	 * 바우처조회시간
	 * 
	 * @param bchrInqTim 바우처조회시간
	 */
	public void setBchrInqTim(String bchrInqTim){
		this.bchrInqTim= bchrInqTim;
		this.setIsSet_bchrInqTim(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_bchrNewAvlYn= false;
	protected final boolean isSet_bchrNewAvlYn(){
		return this.isSet_bchrNewAvlYn;
	}
	private void setIsSet_bchrNewAvlYn(boolean value){
		this.isSet_bchrNewAvlYn= value;
	}
	/**
	 * 바우처신규가능여부
	 */
	@XmlTransient
	public String getBchrNewAvlYn(){
		return this.bchrNewAvlYn;
	}
	
	/**
	 * 바우처신규가능여부
	 * 
	 * @param bchrNewAvlYn 바우처신규가능여부
	 */
	public void setBchrNewAvlYn(String bchrNewAvlYn){
		this.bchrNewAvlYn= bchrNewAvlYn;
		this.setIsSet_bchrNewAvlYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_prdMajTxtPbokPrngYn= false;
	protected final boolean isSet_prdMajTxtPbokPrngYn(){
		return this.isSet_prdMajTxtPbokPrngYn;
	}
	private void setIsSet_prdMajTxtPbokPrngYn(boolean value){
		this.isSet_prdMajTxtPbokPrngYn= value;
	}
	/**
	 * 상품주요내용통장인자여부
	 */
	@XmlTransient
	public String getPrdMajTxtPbokPrngYn(){
		return this.prdMajTxtPbokPrngYn;
	}
	
	/**
	 * 상품주요내용통장인자여부
	 * 
	 * @param prdMajTxtPbokPrngYn 상품주요내용통장인자여부
	 */
	public void setPrdMajTxtPbokPrngYn(String prdMajTxtPbokPrngYn){
		this.prdMajTxtPbokPrngYn= prdMajTxtPbokPrngYn;
		this.setIsSet_prdMajTxtPbokPrngYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_apirtPsnb= false;
	protected final boolean isSet_apirtPsnb(){
		return this.isSet_apirtPsnb;
	}
	private void setIsSet_apirtPsnb(boolean value){
		this.isSet_apirtPsnb= value;
	}
	/**
	 * 적용이율정수
	 */
	@XmlTransient
	public Integer getApirtPsnb(){
		return this.apirtPsnb;
	}
	
	/**
	 * 적용이율정수
	 * 
	 * @param apirtPsnb 적용이율정수
	 */
	public void setApirtPsnb(Integer apirtPsnb){
		this.apirtPsnb= apirtPsnb;
		this.setIsSet_apirtPsnb(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_apirtDcml= false;
	protected final boolean isSet_apirtDcml(){
		return this.isSet_apirtDcml;
	}
	private void setIsSet_apirtDcml(boolean value){
		this.isSet_apirtDcml= value;
	}
	/**
	 * 적용이율소수
	 */
	@XmlTransient
	public String getApirtDcml(){
		return this.apirtDcml;
	}
	
	/**
	 * 적용이율소수
	 * 
	 * @param apirtDcml 적용이율소수
	 */
	public void setApirtDcml(String apirtDcml){
		this.apirtDcml= apirtDcml;
		this.setIsSet_apirtDcml(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_hqapNo= false;
	protected final boolean isSet_hqapNo(){
		return this.isSet_hqapNo;
	}
	private void setIsSet_hqapNo(boolean value){
		this.isSet_hqapNo= value;
	}
	/**
	 * 본부승인번호
	 */
	@XmlTransient
	public String getHqapNo(){
		return this.hqapNo;
	}
	
	/**
	 * 본부승인번호
	 * 
	 * @param hqapNo 본부승인번호
	 */
	public void setHqapNo(String hqapNo){
		this.hqapNo= hqapNo;
		this.setIsSet_hqapNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_acnmCsno= false;
	protected final boolean isSet_acnmCsno(){
		return this.isSet_acnmCsno;
	}
	private void setIsSet_acnmCsno(boolean value){
		this.isSet_acnmCsno= value;
	}
	/**
	 * 실명고객번호
	 */
	@XmlTransient
	public String getAcnmCsno(){
		return this.acnmCsno;
	}
	
	/**
	 * 실명고객번호
	 * 
	 * @param acnmCsno 실명고객번호
	 */
	public void setAcnmCsno(String acnmCsno){
		this.acnmCsno= acnmCsno;
		this.setIsSet_acnmCsno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_fcbdNewYn= false;
	protected final boolean isSet_fcbdNewYn(){
		return this.isSet_fcbdNewYn;
	}
	private void setIsSet_fcbdNewYn(boolean value){
		this.isSet_fcbdNewYn= value;
	}
	/**
	 * 액면신규여부
	 */
	@XmlTransient
	public String getFcbdNewYn(){
		return this.fcbdNewYn;
	}
	
	/**
	 * 액면신규여부
	 * 
	 * @param fcbdNewYn 액면신규여부
	 */
	public void setFcbdNewYn(String fcbdNewYn){
		this.fcbdNewYn= fcbdNewYn;
		this.setIsSet_fcbdNewYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_irKdcd= false;
	protected final boolean isSet_irKdcd(){
		return this.isSet_irKdcd;
	}
	private void setIsSet_irKdcd(boolean value){
		this.isSet_irKdcd= value;
	}
	/**
	 * 금리종류코드
	 */
	@XmlTransient
	public String getIrKdcd(){
		return this.irKdcd;
	}
	
	/**
	 * 금리종류코드
	 * 
	 * @param irKdcd 금리종류코드
	 */
	public void setIrKdcd(String irKdcd){
		this.irKdcd= irKdcd;
		this.setIsSet_irKdcd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_efctPrftRtPsnb= false;
	protected final boolean isSet_efctPrftRtPsnb(){
		return this.isSet_efctPrftRtPsnb;
	}
	private void setIsSet_efctPrftRtPsnb(boolean value){
		this.isSet_efctPrftRtPsnb= value;
	}
	/**
	 * 실효수익율정수
	 */
	@XmlTransient
	public Integer getEfctPrftRtPsnb(){
		return this.efctPrftRtPsnb;
	}
	
	/**
	 * 실효수익율정수
	 * 
	 * @param efctPrftRtPsnb 실효수익율정수
	 */
	public void setEfctPrftRtPsnb(Integer efctPrftRtPsnb){
		this.efctPrftRtPsnb= efctPrftRtPsnb;
		this.setIsSet_efctPrftRtPsnb(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_efctPrftRtDcml= false;
	protected final boolean isSet_efctPrftRtDcml(){
		return this.isSet_efctPrftRtDcml;
	}
	private void setIsSet_efctPrftRtDcml(boolean value){
		this.isSet_efctPrftRtDcml= value;
	}
	/**
	 * 실효수익율소수
	 */
	@XmlTransient
	public String getEfctPrftRtDcml(){
		return this.efctPrftRtDcml;
	}
	
	/**
	 * 실효수익율소수
	 * 
	 * @param efctPrftRtDcml 실효수익율소수
	 */
	public void setEfctPrftRtDcml(String efctPrftRtDcml){
		this.efctPrftRtDcml= efctPrftRtDcml;
		this.setIsSet_efctPrftRtDcml(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_vrBilNewDscd= false;
	protected final boolean isSet_vrBilNewDscd(){
		return this.isSet_vrBilNewDscd;
	}
	private void setIsSet_vrBilNewDscd(boolean value){
		this.isSet_vrBilNewDscd= value;
	}
	/**
	 * 표지어음신규구분코드
	 */
	@XmlTransient
	public String getVrBilNewDscd(){
		return this.vrBilNewDscd;
	}
	
	/**
	 * 표지어음신규구분코드
	 * 
	 * @param vrBilNewDscd 표지어음신규구분코드
	 */
	public void setVrBilNewDscd(String vrBilNewDscd){
		this.vrBilNewDscd= vrBilNewDscd;
		this.setIsSet_vrBilNewDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_istIvpeBatNewTrnDscd= false;
	protected final boolean isSet_istIvpeBatNewTrnDscd(){
		return this.isSet_istIvpeBatNewTrnDscd;
	}
	private void setIsSet_istIvpeBatNewTrnDscd(boolean value){
		this.isSet_istIvpeBatNewTrnDscd= value;
	}
	/**
	 * 기관투자자일괄신규거래구분코드
	 */
	@XmlTransient
	public String getIstIvpeBatNewTrnDscd(){
		return this.istIvpeBatNewTrnDscd;
	}
	
	/**
	 * 기관투자자일괄신규거래구분코드
	 * 
	 * @param istIvpeBatNewTrnDscd 기관투자자일괄신규거래구분코드
	 */
	public void setIstIvpeBatNewTrnDscd(String istIvpeBatNewTrnDscd){
		this.istIvpeBatNewTrnDscd= istIvpeBatNewTrnDscd;
		this.setIsSet_istIvpeBatNewTrnDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dppeCsno= false;
	protected final boolean isSet_dppeCsno(){
		return this.isSet_dppeCsno;
	}
	private void setIsSet_dppeCsno(boolean value){
		this.isSet_dppeCsno= value;
	}
	/**
	 * 예탁자고객번호
	 */
	@XmlTransient
	public String getDppeCsno(){
		return this.dppeCsno;
	}
	
	/**
	 * 예탁자고객번호
	 * 
	 * @param dppeCsno 예탁자고객번호
	 */
	public void setDppeCsno(String dppeCsno){
		this.dppeCsno= dppeCsno;
		this.setIsSet_dppeCsno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dppeActIdfNo= false;
	protected final boolean isSet_dppeActIdfNo(){
		return this.isSet_dppeActIdfNo;
	}
	private void setIsSet_dppeActIdfNo(boolean value){
		this.isSet_dppeActIdfNo= value;
	}
	/**
	 * 예탁자계좌식별번호
	 */
	@XmlTransient
	public String getDppeActIdfNo(){
		return this.dppeActIdfNo;
	}
	
	/**
	 * 예탁자계좌식별번호
	 * 
	 * @param dppeActIdfNo 예탁자계좌식별번호
	 */
	public void setDppeActIdfNo(String dppeActIdfNo){
		this.dppeActIdfNo= dppeActIdfNo;
		this.setIsSet_dppeActIdfNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dpsBatNewBzcd= false;
	protected final boolean isSet_dpsBatNewBzcd(){
		return this.isSet_dpsBatNewBzcd;
	}
	private void setIsSet_dpsBatNewBzcd(boolean value){
		this.isSet_dpsBatNewBzcd= value;
	}
	/**
	 * 수신일괄신규업무코드
	 */
	@XmlTransient
	public String getDpsBatNewBzcd(){
		return this.dpsBatNewBzcd;
	}
	
	/**
	 * 수신일괄신규업무코드
	 * 
	 * @param dpsBatNewBzcd 수신일괄신규업무코드
	 */
	public void setDpsBatNewBzcd(String dpsBatNewBzcd){
		this.dpsBatNewBzcd= dpsBatNewBzcd;
		this.setIsSet_dpsBatNewBzcd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ascnNewRprsAcno= false;
	protected final boolean isSet_ascnNewRprsAcno(){
		return this.isSet_ascnNewRprsAcno;
	}
	private void setIsSet_ascnNewRprsAcno(boolean value){
		this.isSet_ascnNewRprsAcno= value;
	}
	/**
	 * 단체신규대표계좌번호
	 */
	@XmlTransient
	public String getAscnNewRprsAcno(){
		return this.ascnNewRprsAcno;
	}
	
	/**
	 * 단체신규대표계좌번호
	 * 
	 * @param ascnNewRprsAcno 단체신규대표계좌번호
	 */
	public void setAscnNewRprsAcno(String ascnNewRprsAcno){
		this.ascnNewRprsAcno= ascnNewRprsAcno;
		this.setIsSet_ascnNewRprsAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ascnNewRprsActYn= false;
	protected final boolean isSet_ascnNewRprsActYn(){
		return this.isSet_ascnNewRprsActYn;
	}
	private void setIsSet_ascnNewRprsActYn(boolean value){
		this.isSet_ascnNewRprsActYn= value;
	}
	/**
	 * 단체신규대표계좌여부
	 */
	@XmlTransient
	public String getAscnNewRprsActYn(){
		return this.ascnNewRprsActYn;
	}
	
	/**
	 * 단체신규대표계좌여부
	 * 
	 * @param ascnNewRprsActYn 단체신규대표계좌여부
	 */
	public void setAscnNewRprsActYn(String ascnNewRprsActYn){
		this.ascnNewRprsActYn= ascnNewRprsActYn;
		this.setIsSet_ascnNewRprsActYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pbamActAcctYy= false;
	protected final boolean isSet_pbamActAcctYy(){
		return this.isSet_pbamActAcctYy;
	}
	private void setIsSet_pbamActAcctYy(boolean value){
		this.isSet_pbamActAcctYy= value;
	}
	/**
	 * 공금예금계좌회계년도
	 */
	@XmlTransient
	public String getPbamActAcctYy(){
		return this.pbamActAcctYy;
	}
	
	/**
	 * 공금예금계좌회계년도
	 * 
	 * @param pbamActAcctYy 공금예금계좌회계년도
	 */
	public void setPbamActAcctYy(String pbamActAcctYy){
		this.pbamActAcctYy= pbamActAcctYy;
		this.setIsSet_pbamActAcctYy(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pmnySnnmActAcctYy= false;
	protected final boolean isSet_pmnySnnmActAcctYy(){
		return this.isSet_pmnySnnmActAcctYy;
	}
	private void setIsSet_pmnySnnmActAcctYy(boolean value){
		this.isSet_pmnySnnmActAcctYy= value;
	}
	/**
	 * 공금단수계좌회계년도
	 */
	@XmlTransient
	public String getPmnySnnmActAcctYy(){
		return this.pmnySnnmActAcctYy;
	}
	
	/**
	 * 공금단수계좌회계년도
	 * 
	 * @param pmnySnnmActAcctYy 공금단수계좌회계년도
	 */
	public void setPmnySnnmActAcctYy(String pmnySnnmActAcctYy){
		this.pmnySnnmActAcctYy= pmnySnnmActAcctYy;
		this.setIsSet_pmnySnnmActAcctYy(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_hsscOwhmAdrKdcd= false;
	protected final boolean isSet_hsscOwhmAdrKdcd(){
		return this.isSet_hsscOwhmAdrKdcd;
	}
	private void setIsSet_hsscOwhmAdrKdcd(boolean value){
		this.isSet_hsscOwhmAdrKdcd= value;
	}
	/**
	 * 주택청약자택주소종류코드
	 */
	@XmlTransient
	public String getHsscOwhmAdrKdcd(){
		return this.hsscOwhmAdrKdcd;
	}
	
	/**
	 * 주택청약자택주소종류코드
	 * 
	 * @param hsscOwhmAdrKdcd 주택청약자택주소종류코드
	 */
	public void setHsscOwhmAdrKdcd(String hsscOwhmAdrKdcd){
		this.hsscOwhmAdrKdcd= hsscOwhmAdrKdcd;
		this.setIsSet_hsscOwhmAdrKdcd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_hsscOwhmBldMngNo= false;
	protected final boolean isSet_hsscOwhmBldMngNo(){
		return this.isSet_hsscOwhmBldMngNo;
	}
	private void setIsSet_hsscOwhmBldMngNo(boolean value){
		this.isSet_hsscOwhmBldMngNo= value;
	}
	/**
	 * 주택청약자택건물관리번호
	 */
	@XmlTransient
	public String getHsscOwhmBldMngNo(){
		return this.hsscOwhmBldMngNo;
	}
	
	/**
	 * 주택청약자택건물관리번호
	 * 
	 * @param hsscOwhmBldMngNo 주택청약자택건물관리번호
	 */
	public void setHsscOwhmBldMngNo(String hsscOwhmBldMngNo){
		this.hsscOwhmBldMngNo= hsscOwhmBldMngNo;
		this.setIsSet_hsscOwhmBldMngNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_hsscOwhmPostSrno= false;
	protected final boolean isSet_hsscOwhmPostSrno(){
		return this.isSet_hsscOwhmPostSrno;
	}
	private void setIsSet_hsscOwhmPostSrno(boolean value){
		this.isSet_hsscOwhmPostSrno= value;
	}
	/**
	 * 주택청약자택우편일련번호
	 */
	@XmlTransient
	public String getHsscOwhmPostSrno(){
		return this.hsscOwhmPostSrno;
	}
	
	/**
	 * 주택청약자택우편일련번호
	 * 
	 * @param hsscOwhmPostSrno 주택청약자택우편일련번호
	 */
	public void setHsscOwhmPostSrno(String hsscOwhmPostSrno){
		this.hsscOwhmPostSrno= hsscOwhmPostSrno;
		this.setIsSet_hsscOwhmPostSrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_hsscOwhmStdoNo= false;
	protected final boolean isSet_hsscOwhmStdoNo(){
		return this.isSet_hsscOwhmStdoNo;
	}
	private void setIsSet_hsscOwhmStdoNo(boolean value){
		this.isSet_hsscOwhmStdoNo= value;
	}
	/**
	 * 주택청약자택법정동번호
	 */
	@XmlTransient
	public String getHsscOwhmStdoNo(){
		return this.hsscOwhmStdoNo;
	}
	
	/**
	 * 주택청약자택법정동번호
	 * 
	 * @param hsscOwhmStdoNo 주택청약자택법정동번호
	 */
	public void setHsscOwhmStdoNo(String hsscOwhmStdoNo){
		this.hsscOwhmStdoNo= hsscOwhmStdoNo;
		this.setIsSet_hsscOwhmStdoNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_agmtCoCd= false;
	protected final boolean isSet_agmtCoCd(){
		return this.isSet_agmtCoCd;
	}
	private void setIsSet_agmtCoCd(boolean value){
		this.isSet_agmtCoCd= value;
	}
	/**
	 * 협약업체코드
	 */
	@XmlTransient
	public String getAgmtCoCd(){
		return this.agmtCoCd;
	}
	
	/**
	 * 협약업체코드
	 * 
	 * @param agmtCoCd 협약업체코드
	 */
	public void setAgmtCoCd(String agmtCoCd){
		this.agmtCoCd= agmtCoCd;
		this.setIsSet_agmtCoCd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_wooriHopeDremJnngTgtDscd= false;
	protected final boolean isSet_wooriHopeDremJnngTgtDscd(){
		return this.isSet_wooriHopeDremJnngTgtDscd;
	}
	private void setIsSet_wooriHopeDremJnngTgtDscd(boolean value){
		this.isSet_wooriHopeDremJnngTgtDscd= value;
	}
	/**
	 * 우리희망드림가입대상구분코드
	 */
	@XmlTransient
	public String getWooriHopeDremJnngTgtDscd(){
		return this.wooriHopeDremJnngTgtDscd;
	}
	
	/**
	 * 우리희망드림가입대상구분코드
	 * 
	 * @param wooriHopeDremJnngTgtDscd 우리희망드림가입대상구분코드
	 */
	public void setWooriHopeDremJnngTgtDscd(String wooriHopeDremJnngTgtDscd){
		this.wooriHopeDremJnngTgtDscd= wooriHopeDremJnngTgtDscd;
		this.setIsSet_wooriHopeDremJnngTgtDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_asetMngIscd= false;
	protected final boolean isSet_asetMngIscd(){
		return this.isSet_asetMngIscd;
	}
	private void setIsSet_asetMngIscd(boolean value){
		this.isSet_asetMngIscd= value;
	}
	/**
	 * 자산관리기관코드
	 */
	@XmlTransient
	public String getAsetMngIscd(){
		return this.asetMngIscd;
	}
	
	/**
	 * 자산관리기관코드
	 * 
	 * @param asetMngIscd 자산관리기관코드
	 */
	public void setAsetMngIscd(String asetMngIscd){
		this.asetMngIscd= asetMngIscd;
		this.setIsSet_asetMngIscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rpbdDscd= false;
	protected final boolean isSet_rpbdDscd(){
		return this.isSet_rpbdDscd;
	}
	private void setIsSet_rpbdDscd(boolean value){
		this.isSet_rpbdDscd= value;
	}
	/**
	 * 환매채구분코드
	 */
	@XmlTransient
	public String getRpbdDscd(){
		return this.rpbdDscd;
	}
	
	/**
	 * 환매채구분코드
	 * 
	 * @param rpbdDscd 환매채구분코드
	 */
	public void setRpbdDscd(String rpbdDscd){
		this.rpbdDscd= rpbdDscd;
		this.setIsSet_rpbdDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cctnAcno= false;
	protected final boolean isSet_cctnAcno(){
		return this.isSet_cctnAcno;
	}
	private void setIsSet_cctnAcno(boolean value){
		this.isSet_cctnAcno= value;
	}
	/**
	 * 연결계좌번호
	 */
	@XmlTransient
	public String getCctnAcno(){
		return this.cctnAcno;
	}
	
	/**
	 * 연결계좌번호
	 * 
	 * @param cctnAcno 연결계좌번호
	 */
	public void setCctnAcno(String cctnAcno){
		this.cctnAcno= cctnAcno;
		this.setIsSet_cctnAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_npbdSbsrRqYn= false;
	protected final boolean isSet_npbdSbsrRqYn(){
		return this.isSet_npbdSbsrRqYn;
	}
	private void setIsSet_npbdSbsrRqYn(boolean value){
		this.isSet_npbdSbsrRqYn= value;
	}
	/**
	 * 국공채청약신청여부
	 */
	@XmlTransient
	public String getNpbdSbsrRqYn(){
		return this.npbdSbsrRqYn;
	}
	
	/**
	 * 국공채청약신청여부
	 * 
	 * @param npbdSbsrRqYn 국공채청약신청여부
	 */
	public void setNpbdSbsrRqYn(String npbdSbsrRqYn){
		this.npbdSbsrRqYn= npbdSbsrRqYn;
		this.setIsSet_npbdSbsrRqYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_npbdItmsCd= false;
	protected final boolean isSet_npbdItmsCd(){
		return this.isSet_npbdItmsCd;
	}
	private void setIsSet_npbdItmsCd(boolean value){
		this.isSet_npbdItmsCd= value;
	}
	/**
	 * 국공채종목코드
	 */
	@XmlTransient
	public String getNpbdItmsCd(){
		return this.npbdItmsCd;
	}
	
	/**
	 * 국공채종목코드
	 * 
	 * @param npbdItmsCd 국공채종목코드
	 */
	public void setNpbdItmsCd(String npbdItmsCd){
		this.npbdItmsCd= npbdItmsCd;
		this.setIsSet_npbdItmsCd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_bndKdDis= false;
	protected final boolean isSet_bndKdDis(){
		return this.isSet_bndKdDis;
	}
	private void setIsSet_bndKdDis(boolean value){
		this.isSet_bndKdDis= value;
	}
	/**
	 * 채권종류구분
	 */
	@XmlTransient
	public String getBndKdDis(){
		return this.bndKdDis;
	}
	
	/**
	 * 채권종류구분
	 * 
	 * @param bndKdDis 채권종류구분
	 */
	public void setBndKdDis(String bndKdDis){
		this.bndKdDis= bndKdDis;
		this.setIsSet_bndKdDis(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_tunMmHo= false;
	protected final boolean isSet_tunMmHo(){
		return this.isSet_tunMmHo;
	}
	private void setIsSet_tunMmHo(boolean value){
		this.isSet_tunMmHo= value;
	}
	/**
	 * 회월호
	 */
	@XmlTransient
	public String getTunMmHo(){
		return this.tunMmHo;
	}
	
	/**
	 * 회월호
	 * 
	 * @param tunMmHo 회월호
	 */
	public void setTunMmHo(String tunMmHo){
		this.tunMmHo= tunMmHo;
		this.setIsSet_tunMmHo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_hdgTgtYn= false;
	protected final boolean isSet_hdgTgtYn(){
		return this.isSet_hdgTgtYn;
	}
	private void setIsSet_hdgTgtYn(boolean value){
		this.isSet_hdgTgtYn= value;
	}
	/**
	 * 헷지대상여부
	 */
	@XmlTransient
	public String getHdgTgtYn(){
		return this.hdgTgtYn;
	}
	
	/**
	 * 헷지대상여부
	 * 
	 * @param hdgTgtYn 헷지대상여부
	 */
	public void setHdgTgtYn(String hdgTgtYn){
		this.hdgTgtYn= hdgTgtYn;
		this.setIsSet_hdgTgtYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_idCadNhssDscd= false;
	protected final boolean isSet_idCadNhssDscd(){
		return this.isSet_idCadNhssDscd;
	}
	private void setIsSet_idCadNhssDscd(boolean value){
		this.isSet_idCadNhssDscd= value;
	}
	/**
	 * ID카드청약종합저축구분코드
	 */
	@XmlTransient
	public String getIdCadNhssDscd(){
		return this.idCadNhssDscd;
	}
	
	/**
	 * ID카드청약종합저축구분코드
	 * 
	 * @param idCadNhssDscd ID카드청약종합저축구분코드
	 */
	public void setIdCadNhssDscd(String idCadNhssDscd){
		this.idCadNhssDscd= idCadNhssDscd;
		this.setIsSet_idCadNhssDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_fndPlsOpgDscd= false;
	protected final boolean isSet_fndPlsOpgDscd(){
		return this.isSet_fndPlsOpgDscd;
	}
	private void setIsSet_fndPlsOpgDscd(boolean value){
		this.isSet_fndPlsOpgDscd= value;
	}
	/**
	 * 펀드플러스운용구분코드
	 */
	@XmlTransient
	public String getFndPlsOpgDscd(){
		return this.fndPlsOpgDscd;
	}
	
	/**
	 * 펀드플러스운용구분코드
	 * 
	 * @param fndPlsOpgDscd 펀드플러스운용구분코드
	 */
	public void setFndPlsOpgDscd(String fndPlsOpgDscd){
		this.fndPlsOpgDscd= fndPlsOpgDscd;
		this.setIsSet_fndPlsOpgDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_grnInsuKey= false;
	protected final boolean isSet_grnInsuKey(){
		return this.isSet_grnInsuKey;
	}
	private void setIsSet_grnInsuKey(boolean value){
		this.isSet_grnInsuKey= value;
	}
	/**
	 * 보증보험키
	 */
	@XmlTransient
	public String getGrnInsuKey(){
		return this.grnInsuKey;
	}
	
	/**
	 * 보증보험키
	 * 
	 * @param grnInsuKey 보증보험키
	 */
	public void setGrnInsuKey(String grnInsuKey){
		this.grnInsuKey= grnInsuKey;
		this.setIsSet_grnInsuKey(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_preIntRcvDscd= false;
	protected final boolean isSet_preIntRcvDscd(){
		return this.isSet_preIntRcvDscd;
	}
	private void setIsSet_preIntRcvDscd(boolean value){
		this.isSet_preIntRcvDscd= value;
	}
	/**
	 * 선이자입금구분코드
	 */
	@XmlTransient
	public String getPreIntRcvDscd(){
		return this.preIntRcvDscd;
	}
	
	/**
	 * 선이자입금구분코드
	 * 
	 * @param preIntRcvDscd 선이자입금구분코드
	 */
	public void setPreIntRcvDscd(String preIntRcvDscd){
		this.preIntRcvDscd= preIntRcvDscd;
		this.setIsSet_preIntRcvDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_preIntRcvAcno= false;
	protected final boolean isSet_preIntRcvAcno(){
		return this.isSet_preIntRcvAcno;
	}
	private void setIsSet_preIntRcvAcno(boolean value){
		this.isSet_preIntRcvAcno= value;
	}
	/**
	 * 선이자입금계좌번호
	 */
	@XmlTransient
	public String getPreIntRcvAcno(){
		return this.preIntRcvAcno;
	}
	
	/**
	 * 선이자입금계좌번호
	 * 
	 * @param preIntRcvAcno 선이자입금계좌번호
	 */
	public void setPreIntRcvAcno(String preIntRcvAcno){
		this.preIntRcvAcno= preIntRcvAcno;
		this.setIsSet_preIntRcvAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dpsRcmNo= false;
	protected final boolean isSet_dpsRcmNo(){
		return this.isSet_dpsRcmNo;
	}
	private void setIsSet_dpsRcmNo(boolean value){
		this.isSet_dpsRcmNo= value;
	}
	/**
	 * 수신추천번호
	 */
	@XmlTransient
	public String getDpsRcmNo(){
		return this.dpsRcmNo;
	}
	
	/**
	 * 수신추천번호
	 * 
	 * @param dpsRcmNo 수신추천번호
	 */
	public void setDpsRcmNo(String dpsRcmNo){
		this.dpsRcmNo= dpsRcmNo;
		this.setIsSet_dpsRcmNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_sldrAldCn= false;
	protected final boolean isSet_sldrAldCn(){
		return this.isSet_sldrAldCn;
	}
	private void setIsSet_sldrAldCn(boolean value){
		this.isSet_sldrAldCn= value;
	}
	/**
	 * 군인기수
	 */
	@XmlTransient
	public String getSldrAldCn(){
		return this.sldrAldCn;
	}
	
	/**
	 * 군인기수
	 * 
	 * @param sldrAldCn 군인기수
	 */
	public void setSldrAldCn(String sldrAldCn){
		this.sldrAldCn= sldrAldCn;
		this.setIsSet_sldrAldCn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dlpmPbokGenRgsYn= false;
	protected final boolean isSet_dlpmPbokGenRgsYn(){
		return this.isSet_dlpmPbokGenRgsYn;
	}
	private void setIsSet_dlpmPbokGenRgsYn(boolean value){
		this.isSet_dlpmPbokGenRgsYn= value;
	}
	/**
	 * 체불통장일반등록여부
	 */
	@XmlTransient
	public String getDlpmPbokGenRgsYn(){
		return this.dlpmPbokGenRgsYn;
	}
	
	/**
	 * 체불통장일반등록여부
	 * 
	 * @param dlpmPbokGenRgsYn 체불통장일반등록여부
	 */
	public void setDlpmPbokGenRgsYn(String dlpmPbokGenRgsYn){
		this.dlpmPbokGenRgsYn= dlpmPbokGenRgsYn;
		this.setIsSet_dlpmPbokGenRgsYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_smrtMchrMdlInf= false;
	protected final boolean isSet_smrtMchrMdlInf(){
		return this.isSet_smrtMchrMdlInf;
	}
	private void setIsSet_smrtMchrMdlInf(boolean value){
		this.isSet_smrtMchrMdlInf= value;
	}
	/**
	 * 스마트기기모델정보
	 */
	@XmlTransient
	public String getSmrtMchrMdlInf(){
		return this.smrtMchrMdlInf;
	}
	
	/**
	 * 스마트기기모델정보
	 * 
	 * @param smrtMchrMdlInf 스마트기기모델정보
	 */
	public void setSmrtMchrMdlInf(String smrtMchrMdlInf){
		this.smrtMchrMdlInf= smrtMchrMdlInf;
		this.setIsSet_smrtMchrMdlInf(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_wibeeRcvRgsYn= false;
	protected final boolean isSet_wibeeRcvRgsYn(){
		return this.isSet_wibeeRcvRgsYn;
	}
	private void setIsSet_wibeeRcvRgsYn(boolean value){
		this.isSet_wibeeRcvRgsYn= value;
	}
	/**
	 * 위비입금등록여부
	 */
	@XmlTransient
	public String getWibeeRcvRgsYn(){
		return this.wibeeRcvRgsYn;
	}
	
	/**
	 * 위비입금등록여부
	 * 
	 * @param wibeeRcvRgsYn 위비입금등록여부
	 */
	public void setWibeeRcvRgsYn(String wibeeRcvRgsYn){
		this.wibeeRcvRgsYn= wibeeRcvRgsYn;
		this.setIsSet_wibeeRcvRgsYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_wibeeTsAcno= false;
	protected final boolean isSet_wibeeTsAcno(){
		return this.isSet_wibeeTsAcno;
	}
	private void setIsSet_wibeeTsAcno(boolean value){
		this.isSet_wibeeTsAcno= value;
	}
	/**
	 * 위비이체계좌번호
	 */
	@XmlTransient
	public String getWibeeTsAcno(){
		return this.wibeeTsAcno;
	}
	
	/**
	 * 위비이체계좌번호
	 * 
	 * @param wibeeTsAcno 위비이체계좌번호
	 */
	public void setWibeeTsAcno(String wibeeTsAcno){
		this.wibeeTsAcno= wibeeTsAcno;
		this.setIsSet_wibeeTsAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_wibeePushRgsYn= false;
	protected final boolean isSet_wibeePushRgsYn(){
		return this.isSet_wibeePushRgsYn;
	}
	private void setIsSet_wibeePushRgsYn(boolean value){
		this.isSet_wibeePushRgsYn= value;
	}
	/**
	 * 위비PUSH등록여부
	 */
	@XmlTransient
	public String getWibeePushRgsYn(){
		return this.wibeePushRgsYn;
	}
	
	/**
	 * 위비PUSH등록여부
	 * 
	 * @param wibeePushRgsYn 위비PUSH등록여부
	 */
	public void setWibeePushRgsYn(String wibeePushRgsYn){
		this.wibeePushRgsYn= wibeePushRgsYn;
		this.setIsSet_wibeePushRgsYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atsKrwTsAcno= false;
	protected final boolean isSet_atsKrwTsAcno(){
		return this.isSet_atsKrwTsAcno;
	}
	private void setIsSet_atsKrwTsAcno(boolean value){
		this.isSet_atsKrwTsAcno= value;
	}
	/**
	 * 자동이체원화이체계좌번호
	 */
	@XmlTransient
	public String getAtsKrwTsAcno(){
		return this.atsKrwTsAcno;
	}
	
	/**
	 * 자동이체원화이체계좌번호
	 * 
	 * @param atsKrwTsAcno 자동이체원화이체계좌번호
	 */
	public void setAtsKrwTsAcno(String atsKrwTsAcno){
		this.atsKrwTsAcno= atsKrwTsAcno;
		this.setIsSet_atsKrwTsAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_irngBrcd= false;
	protected final boolean isSet_irngBrcd(){
		return this.isSet_irngBrcd;
	}
	private void setIsSet_irngBrcd(boolean value){
		this.isSet_irngBrcd= value;
	}
	/**
	 * 금리네고점코드
	 */
	@XmlTransient
	public String getIrngBrcd(){
		return this.irngBrcd;
	}
	
	/**
	 * 금리네고점코드
	 * 
	 * @param irngBrcd 금리네고점코드
	 */
	public void setIrngBrcd(String irngBrcd){
		this.irngBrcd= irngBrcd;
		this.setIsSet_irngBrcd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_krwFmbkFxpdYn= false;
	protected final boolean isSet_krwFmbkFxpdYn(){
		return this.isSet_krwFmbkFxpdYn;
	}
	private void setIsSet_krwFmbkFxpdYn(boolean value){
		this.isSet_krwFmbkFxpdYn= value;
	}
	/**
	 * 원화펌뱅킹정기예금여부
	 */
	@XmlTransient
	public String getKrwFmbkFxpdYn(){
		return this.krwFmbkFxpdYn;
	}
	
	/**
	 * 원화펌뱅킹정기예금여부
	 * 
	 * @param krwFmbkFxpdYn 원화펌뱅킹정기예금여부
	 */
	public void setKrwFmbkFxpdYn(String krwFmbkFxpdYn){
		this.krwFmbkFxpdYn= krwFmbkFxpdYn;
		this.setIsSet_krwFmbkFxpdYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_krwSscoFmbkFxpdYn= false;
	protected final boolean isSet_krwSscoFmbkFxpdYn(){
		return this.isSet_krwSscoFmbkFxpdYn;
	}
	private void setIsSet_krwSscoFmbkFxpdYn(boolean value){
		this.isSet_krwSscoFmbkFxpdYn= value;
	}
	/**
	 * 원화삼성펌뱅킹정기예금여부
	 */
	@XmlTransient
	public String getKrwSscoFmbkFxpdYn(){
		return this.krwSscoFmbkFxpdYn;
	}
	
	/**
	 * 원화삼성펌뱅킹정기예금여부
	 * 
	 * @param krwSscoFmbkFxpdYn 원화삼성펌뱅킹정기예금여부
	 */
	public void setKrwSscoFmbkFxpdYn(String krwSscoFmbkFxpdYn){
		this.krwSscoFmbkFxpdYn= krwSscoFmbkFxpdYn;
		this.setIsSet_krwSscoFmbkFxpdYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_hopeHousXuseSqmDscd= false;
	protected final boolean isSet_hopeHousXuseSqmDscd(){
		return this.isSet_hopeHousXuseSqmDscd;
	}
	private void setIsSet_hopeHousXuseSqmDscd(boolean value){
		this.isSet_hopeHousXuseSqmDscd= value;
	}
	/**
	 * 희망주택전용면적구분코드
	 */
	@XmlTransient
	public String getHopeHousXuseSqmDscd(){
		return this.hopeHousXuseSqmDscd;
	}
	
	/**
	 * 희망주택전용면적구분코드
	 * 
	 * @param hopeHousXuseSqmDscd 희망주택전용면적구분코드
	 */
	public void setHopeHousXuseSqmDscd(String hopeHousXuseSqmDscd){
		this.hopeHousXuseSqmDscd= hopeHousXuseSqmDscd;
		this.setIsSet_hopeHousXuseSqmDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rrrgMvinDt= false;
	protected final boolean isSet_rrrgMvinDt(){
		return this.isSet_rrrgMvinDt;
	}
	private void setIsSet_rrrgMvinDt(boolean value){
		this.isSet_rrrgMvinDt= value;
	}
	/**
	 * 주민등록전입일자
	 */
	@XmlTransient
	public String getRrrgMvinDt(){
		return this.rrrgMvinDt;
	}
	
	/**
	 * 주민등록전입일자
	 * 
	 * @param rrrgMvinDt 주민등록전입일자
	 */
	public void setRrrgMvinDt(String rrrgMvinDt){
		this.rrrgMvinDt= rrrgMvinDt;
		this.setIsSet_rrrgMvinDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dppeUnqNo= false;
	protected final boolean isSet_dppeUnqNo(){
		return this.isSet_dppeUnqNo;
	}
	private void setIsSet_dppeUnqNo(boolean value){
		this.isSet_dppeUnqNo= value;
	}
	/**
	 * 예탁자고유번호
	 */
	@XmlTransient
	public Integer getDppeUnqNo(){
		return this.dppeUnqNo;
	}
	
	/**
	 * 예탁자고유번호
	 * 
	 * @param dppeUnqNo 예탁자고유번호
	 */
	public void setDppeUnqNo(Integer dppeUnqNo){
		this.dppeUnqNo= dppeUnqNo;
		this.setIsSet_dppeUnqNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dppeItmsNo= false;
	protected final boolean isSet_dppeItmsNo(){
		return this.isSet_dppeItmsNo;
	}
	private void setIsSet_dppeItmsNo(boolean value){
		this.isSet_dppeItmsNo= value;
	}
	/**
	 * 예탁자종목번호
	 */
	@XmlTransient
	public String getDppeItmsNo(){
		return this.dppeItmsNo;
	}
	
	/**
	 * 예탁자종목번호
	 * 
	 * @param dppeItmsNo 예탁자종목번호
	 */
	public void setDppeItmsNo(String dppeItmsNo){
		this.dppeItmsNo= dppeItmsNo;
		this.setIsSet_dppeItmsNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cshbAtsAcno= false;
	protected final boolean isSet_cshbAtsAcno(){
		return this.isSet_cshbAtsAcno;
	}
	private void setIsSet_cshbAtsAcno(boolean value){
		this.isSet_cshbAtsAcno= value;
	}
	/**
	 * 캐쉬백자동이체계좌번호
	 */
	@XmlTransient
	public String getCshbAtsAcno(){
		return this.cshbAtsAcno;
	}
	
	/**
	 * 캐쉬백자동이체계좌번호
	 * 
	 * @param cshbAtsAcno 캐쉬백자동이체계좌번호
	 */
	public void setCshbAtsAcno(String cshbAtsAcno){
		this.cshbAtsAcno= cshbAtsAcno;
		this.setIsSet_cshbAtsAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cusDntnAscnCd= false;
	protected final boolean isSet_cusDntnAscnCd(){
		return this.isSet_cusDntnAscnCd;
	}
	private void setIsSet_cusDntnAscnCd(boolean value){
		this.isSet_cusDntnAscnCd= value;
	}
	/**
	 * 고객기부단체코드
	 */
	@XmlTransient
	public String getCusDntnAscnCd(){
		return this.cusDntnAscnCd;
	}
	
	/**
	 * 고객기부단체코드
	 * 
	 * @param cusDntnAscnCd 고객기부단체코드
	 */
	public void setCusDntnAscnCd(String cusDntnAscnCd){
		this.cusDntnAscnCd= cusDntnAscnCd;
		this.setIsSet_cusDntnAscnCd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cusBrdnCnrnRt= false;
	protected final boolean isSet_cusBrdnCnrnRt(){
		return this.isSet_cusBrdnCnrnRt;
	}
	private void setIsSet_cusBrdnCnrnRt(boolean value){
		this.isSet_cusBrdnCnrnRt= value;
	}
	/**
	 * 고객부담출연율
	 * BigDecimal - Double value setter
	 *
	 * @Param cusBrdnCnrnRt 고객부담출연율
	 */
	public void setCusBrdnCnrnRt(double cusBrdnCnrnRt) {
		setCusBrdnCnrnRt(BigDecimal.valueOf(cusBrdnCnrnRt));
	}
	/**
	 * 고객부담출연율
	 * BigDecimal - Long value setter
	 *
	 * @Param cusBrdnCnrnRt 고객부담출연율
	 */
	public void setCusBrdnCnrnRt(long cusBrdnCnrnRt) {
		setCusBrdnCnrnRt(BigDecimal.valueOf(cusBrdnCnrnRt));
	}
	/**
	 * 고객부담출연율
	 * BigDecimal - String value setter
	 *
	 * @Param cusBrdnCnrnRt 고객부담출연율
	 */
	public void setCusBrdnCnrnRt(String cusBrdnCnrnRt) {
		setCusBrdnCnrnRt(new BigDecimal(cusBrdnCnrnRt));
	}
	/**
	 * 고객부담출연율
	 */
	@XmlTransient
	public BigDecimal getCusBrdnCnrnRt(){
		return this.cusBrdnCnrnRt;
	}
	
	/**
	 * 고객부담출연율
	 * 
	 * @param cusBrdnCnrnRt 고객부담출연율
	 */
	@JsonSetter("cusBrdnCnrnRt")
	public void setCusBrdnCnrnRt(BigDecimal cusBrdnCnrnRt){
		this.cusBrdnCnrnRt= cusBrdnCnrnRt;
		this.setIsSet_cusBrdnCnrnRt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dinsvGoalAm= false;
	protected final boolean isSet_dinsvGoalAm(){
		return this.isSet_dinsvGoalAm;
	}
	private void setIsSet_dinsvGoalAm(boolean value){
		this.isSet_dinsvGoalAm= value;
	}
	/**
	 * 꿈적금목표금액
	 * BigDecimal - Double value setter
	 *
	 * @Param dinsvGoalAm 꿈적금목표금액
	 */
	public void setDinsvGoalAm(double dinsvGoalAm) {
		setDinsvGoalAm(BigDecimal.valueOf(dinsvGoalAm));
	}
	/**
	 * 꿈적금목표금액
	 * BigDecimal - Long value setter
	 *
	 * @Param dinsvGoalAm 꿈적금목표금액
	 */
	public void setDinsvGoalAm(long dinsvGoalAm) {
		setDinsvGoalAm(BigDecimal.valueOf(dinsvGoalAm));
	}
	/**
	 * 꿈적금목표금액
	 * BigDecimal - String value setter
	 *
	 * @Param dinsvGoalAm 꿈적금목표금액
	 */
	public void setDinsvGoalAm(String dinsvGoalAm) {
		setDinsvGoalAm(new BigDecimal(dinsvGoalAm));
	}
	/**
	 * 꿈적금목표금액
	 */
	@XmlTransient
	public BigDecimal getDinsvGoalAm(){
		return this.dinsvGoalAm;
	}
	
	/**
	 * 꿈적금목표금액
	 * 
	 * @param dinsvGoalAm 꿈적금목표금액
	 */
	@JsonSetter("dinsvGoalAm")
	public void setDinsvGoalAm(BigDecimal dinsvGoalAm){
		this.dinsvGoalAm= dinsvGoalAm;
		this.setIsSet_dinsvGoalAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_txprInqYn= false;
	protected final boolean isSet_txprInqYn(){
		return this.isSet_txprInqYn;
	}
	private void setIsSet_txprInqYn(boolean value){
		this.isSet_txprInqYn= value;
	}
	/**
	 * 세금우대조회여부
	 */
	@XmlTransient
	public String getTxprInqYn(){
		return this.txprInqYn;
	}
	
	/**
	 * 세금우대조회여부
	 * 
	 * @param txprInqYn 세금우대조회여부
	 */
	public void setTxprInqYn(String txprInqYn){
		this.txprInqYn= txprInqYn;
		this.setIsSet_txprInqYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_frno= false;
	protected final boolean isSet_frno(){
		return this.isSet_frno;
	}
	private void setIsSet_frno(boolean value){
		this.isSet_frno= value;
	}
	/**
	 * 외국인등록번호
	 */
	@XmlTransient
	public String getFrno(){
		return this.frno;
	}
	
	/**
	 * 외국인등록번호
	 * 
	 * @param frno 외국인등록번호
	 */
	public void setFrno(String frno){
		this.frno= frno;
		this.setIsSet_frno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_acnmRgsCd= false;
	protected final boolean isSet_acnmRgsCd(){
		return this.isSet_acnmRgsCd;
	}
	private void setIsSet_acnmRgsCd(boolean value){
		this.isSet_acnmRgsCd= value;
	}
	/**
	 * 실명등록코드
	 */
	@XmlTransient
	public String getAcnmRgsCd(){
		return this.acnmRgsCd;
	}
	
	/**
	 * 실명등록코드
	 * 
	 * @param acnmRgsCd 실명등록코드
	 */
	public void setAcnmRgsCd(String acnmRgsCd){
		this.acnmRgsCd= acnmRgsCd;
		this.setIsSet_acnmRgsCd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_coaOmitYn= false;
	protected final boolean isSet_coaOmitYn(){
		return this.isSet_coaOmitYn;
	}
	private void setIsSet_coaOmitYn(boolean value){
		this.isSet_coaOmitYn= value;
	}
	/**
	 * 공인인증서생략여부
	 */
	@XmlTransient
	public String getCoaOmitYn(){
		return this.coaOmitYn;
	}
	
	/**
	 * 공인인증서생략여부
	 * 
	 * @param coaOmitYn 공인인증서생략여부
	 */
	public void setCoaOmitYn(String coaOmitYn){
		this.coaOmitYn= coaOmitYn;
		this.setIsSet_coaOmitYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_wbbmLnkNewYn= false;
	protected final boolean isSet_wbbmLnkNewYn(){
		return this.isSet_wbbmLnkNewYn;
	}
	private void setIsSet_wbbmLnkNewYn(boolean value){
		this.isSet_wbbmLnkNewYn= value;
	}
	/**
	 * 위비마켓연동신규여부
	 */
	@XmlTransient
	public String getWbbmLnkNewYn(){
		return this.wbbmLnkNewYn;
	}
	
	/**
	 * 위비마켓연동신규여부
	 * 
	 * @param wbbmLnkNewYn 위비마켓연동신규여부
	 */
	public void setWbbmLnkNewYn(String wbbmLnkNewYn){
		this.wbbmLnkNewYn= wbbmLnkNewYn;
		this.setIsSet_wbbmLnkNewYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_wbbtRcmRgsHpNo= false;
	protected final boolean isSet_wbbtRcmRgsHpNo(){
		return this.isSet_wbbtRcmRgsHpNo;
	}
	private void setIsSet_wbbtRcmRgsHpNo(boolean value){
		this.isSet_wbbtRcmRgsHpNo= value;
	}
	/**
	 * 위비톡추천등록핸드폰번호
	 */
	@XmlTransient
	public String getWbbtRcmRgsHpNo(){
		return this.wbbtRcmRgsHpNo;
	}
	
	/**
	 * 위비톡추천등록핸드폰번호
	 * 
	 * @param wbbtRcmRgsHpNo 위비톡추천등록핸드폰번호
	 */
	public void setWbbtRcmRgsHpNo(String wbbtRcmRgsHpNo){
		this.wbbtRcmRgsHpNo= wbbtRcmRgsHpNo;
		this.setIsSet_wbbtRcmRgsHpNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_smrtLnJnngYn= false;
	protected final boolean isSet_smrtLnJnngYn(){
		return this.isSet_smrtLnJnngYn;
	}
	private void setIsSet_smrtLnJnngYn(boolean value){
		this.isSet_smrtLnJnngYn= value;
	}
	/**
	 * 스마트론가입여부
	 */
	@XmlTransient
	public String getSmrtLnJnngYn(){
		return this.smrtLnJnngYn;
	}
	
	/**
	 * 스마트론가입여부
	 * 
	 * @param smrtLnJnngYn 스마트론가입여부
	 */
	public void setSmrtLnJnngYn(String smrtLnJnngYn){
		this.smrtLnJnngYn= smrtLnJnngYn;
		this.setIsSet_smrtLnJnngYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dinsvDscd= false;
	protected final boolean isSet_dinsvDscd(){
		return this.isSet_dinsvDscd;
	}
	private void setIsSet_dinsvDscd(boolean value){
		this.isSet_dinsvDscd= value;
	}
	/**
	 * 꿈적금구분코드
	 */
	@XmlTransient
	public String getDinsvDscd(){
		return this.dinsvDscd;
	}
	
	/**
	 * 꿈적금구분코드
	 * 
	 * @param dinsvDscd 꿈적금구분코드
	 */
	public void setDinsvDscd(String dinsvDscd){
		this.dinsvDscd= dinsvDscd;
		this.setIsSet_dinsvDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_aucId= false;
	protected final boolean isSet_aucId(){
		return this.isSet_aucId;
	}
	private void setIsSet_aucId(boolean value){
		this.isSet_aucId= value;
	}
	/**
	 * 옥션ID
	 */
	@XmlTransient
	public String getAucId(){
		return this.aucId;
	}
	
	/**
	 * 옥션ID
	 * 
	 * @param aucId 옥션ID
	 */
	public void setAucId(String aucId){
		this.aucId= aucId;
		this.setIsSet_aucId(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_gmktId= false;
	protected final boolean isSet_gmktId(){
		return this.isSet_gmktId;
	}
	private void setIsSet_gmktId(boolean value){
		this.isSet_gmktId= value;
	}
	/**
	 * 지마켓ID
	 */
	@XmlTransient
	public String getGmktId(){
		return this.gmktId;
	}
	
	/**
	 * 지마켓ID
	 * 
	 * @param gmktId 지마켓ID
	 */
	public void setGmktId(String gmktId){
		this.gmktId= gmktId;
		this.setIsSet_gmktId(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_wbbmId= false;
	protected final boolean isSet_wbbmId(){
		return this.isSet_wbbmId;
	}
	private void setIsSet_wbbmId(boolean value){
		this.isSet_wbbmId= value;
	}
	/**
	 * 위비마켓ID
	 */
	@XmlTransient
	public String getWbbmId(){
		return this.wbbmId;
	}
	
	/**
	 * 위비마켓ID
	 * 
	 * @param wbbmId 위비마켓ID
	 */
	public void setWbbmId(String wbbmId){
		this.wbbmId= wbbmId;
		this.setIsSet_wbbmId(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dniAcnmCnfNewDscd= false;
	protected final boolean isSet_dniAcnmCnfNewDscd(){
		return this.isSet_dniAcnmCnfNewDscd;
	}
	private void setIsSet_dniAcnmCnfNewDscd(boolean value){
		this.isSet_dniAcnmCnfNewDscd= value;
	}
	/**
	 * 비대면실명확인신규구분코드
	 */
	@XmlTransient
	public String getDniAcnmCnfNewDscd(){
		return this.dniAcnmCnfNewDscd;
	}
	
	/**
	 * 비대면실명확인신규구분코드
	 * 
	 * @param dniAcnmCnfNewDscd 비대면실명확인신규구분코드
	 */
	public void setDniAcnmCnfNewDscd(String dniAcnmCnfNewDscd){
		this.dniAcnmCnfNewDscd= dniAcnmCnfNewDscd;
		this.setIsSet_dniAcnmCnfNewDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dniRcvAm= false;
	protected final boolean isSet_dniRcvAm(){
		return this.isSet_dniRcvAm;
	}
	private void setIsSet_dniRcvAm(boolean value){
		this.isSet_dniRcvAm= value;
	}
	/**
	 * 비대면입금금액
	 * BigDecimal - Double value setter
	 *
	 * @Param dniRcvAm 비대면입금금액
	 */
	public void setDniRcvAm(double dniRcvAm) {
		setDniRcvAm(BigDecimal.valueOf(dniRcvAm));
	}
	/**
	 * 비대면입금금액
	 * BigDecimal - Long value setter
	 *
	 * @Param dniRcvAm 비대면입금금액
	 */
	public void setDniRcvAm(long dniRcvAm) {
		setDniRcvAm(BigDecimal.valueOf(dniRcvAm));
	}
	/**
	 * 비대면입금금액
	 * BigDecimal - String value setter
	 *
	 * @Param dniRcvAm 비대면입금금액
	 */
	public void setDniRcvAm(String dniRcvAm) {
		setDniRcvAm(new BigDecimal(dniRcvAm));
	}
	/**
	 * 비대면입금금액
	 */
	@XmlTransient
	public BigDecimal getDniRcvAm(){
		return this.dniRcvAm;
	}
	
	/**
	 * 비대면입금금액
	 * 
	 * @param dniRcvAm 비대면입금금액
	 */
	@JsonSetter("dniRcvAm")
	public void setDniRcvAm(BigDecimal dniRcvAm){
		this.dniRcvAm= dniRcvAm;
		this.setIsSet_dniRcvAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dniHpNo= false;
	protected final boolean isSet_dniHpNo(){
		return this.isSet_dniHpNo;
	}
	private void setIsSet_dniHpNo(boolean value){
		this.isSet_dniHpNo= value;
	}
	/**
	 * 비대면핸드폰번호
	 */
	@XmlTransient
	public String getDniHpNo(){
		return this.dniHpNo;
	}
	
	/**
	 * 비대면핸드폰번호
	 * 
	 * @param dniHpNo 비대면핸드폰번호
	 */
	public void setDniHpNo(String dniHpNo){
		this.dniHpNo= dniHpNo;
		this.setIsSet_dniHpNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dniPtnAcno= false;
	protected final boolean isSet_dniPtnAcno(){
		return this.isSet_dniPtnAcno;
	}
	private void setIsSet_dniPtnAcno(boolean value){
		this.isSet_dniPtnAcno= value;
	}
	/**
	 * 비대면상대계좌번호
	 */
	@XmlTransient
	public String getDniPtnAcno(){
		return this.dniPtnAcno;
	}
	
	/**
	 * 비대면상대계좌번호
	 * 
	 * @param dniPtnAcno 비대면상대계좌번호
	 */
	public void setDniPtnAcno(String dniPtnAcno){
		this.dniPtnAcno= dniPtnAcno;
		this.setIsSet_dniPtnAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dniPtnNewAcno= false;
	protected final boolean isSet_dniPtnNewAcno(){
		return this.isSet_dniPtnNewAcno;
	}
	private void setIsSet_dniPtnNewAcno(boolean value){
		this.isSet_dniPtnNewAcno= value;
	}
	/**
	 * 비대면상대신계좌번호
	 */
	@XmlTransient
	public String getDniPtnNewAcno(){
		return this.dniPtnNewAcno;
	}
	
	/**
	 * 비대면상대신계좌번호
	 * 
	 * @param dniPtnNewAcno 비대면상대신계좌번호
	 */
	public void setDniPtnNewAcno(String dniPtnNewAcno){
		this.dniPtnNewAcno= dniPtnNewAcno;
		this.setIsSet_dniPtnNewAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dniPtnbkCd= false;
	protected final boolean isSet_dniPtnbkCd(){
		return this.isSet_dniPtnbkCd;
	}
	private void setIsSet_dniPtnbkCd(boolean value){
		this.isSet_dniPtnbkCd= value;
	}
	/**
	 * 비대면상대은행코드
	 */
	@XmlTransient
	public String getDniPtnbkCd(){
		return this.dniPtnbkCd;
	}
	
	/**
	 * 비대면상대은행코드
	 * 
	 * @param dniPtnbkCd 비대면상대은행코드
	 */
	public void setDniPtnbkCd(String dniPtnbkCd){
		this.dniPtnbkCd= dniPtnbkCd;
		this.setIsSet_dniPtnbkCd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rjnngAcno= false;
	protected final boolean isSet_rjnngAcno(){
		return this.isSet_rjnngAcno;
	}
	private void setIsSet_rjnngAcno(boolean value){
		this.isSet_rjnngAcno= value;
	}
	/**
	 * 재가입계좌번호
	 */
	@XmlTransient
	public String getRjnngAcno(){
		return this.rjnngAcno;
	}
	
	/**
	 * 재가입계좌번호
	 * 
	 * @param rjnngAcno 재가입계좌번호
	 */
	public void setRjnngAcno(String rjnngAcno){
		this.rjnngAcno= rjnngAcno;
		this.setIsSet_rjnngAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_insvAcldPlanKdcd= false;
	protected final boolean isSet_insvAcldPlanKdcd(){
		return this.isSet_insvAcldPlanKdcd;
	}
	private void setIsSet_insvAcldPlanKdcd(boolean value){
		this.isSet_insvAcldPlanKdcd= value;
	}
	/**
	 * 적금적립플랜종류코드
	 */
	@XmlTransient
	public String getInsvAcldPlanKdcd(){
		return this.insvAcldPlanKdcd;
	}
	
	/**
	 * 적금적립플랜종류코드
	 * 
	 * @param insvAcldPlanKdcd 적금적립플랜종류코드
	 */
	public void setInsvAcldPlanKdcd(String insvAcldPlanKdcd){
		this.insvAcldPlanKdcd= insvAcldPlanKdcd;
		this.setIsSet_insvAcldPlanKdcd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_insvAcldFstTsAm= false;
	protected final boolean isSet_insvAcldFstTsAm(){
		return this.isSet_insvAcldFstTsAm;
	}
	private void setIsSet_insvAcldFstTsAm(boolean value){
		this.isSet_insvAcldFstTsAm= value;
	}
	/**
	 * 적금적립최초이체금액
	 * BigDecimal - Double value setter
	 *
	 * @Param insvAcldFstTsAm 적금적립최초이체금액
	 */
	public void setInsvAcldFstTsAm(double insvAcldFstTsAm) {
		setInsvAcldFstTsAm(BigDecimal.valueOf(insvAcldFstTsAm));
	}
	/**
	 * 적금적립최초이체금액
	 * BigDecimal - Long value setter
	 *
	 * @Param insvAcldFstTsAm 적금적립최초이체금액
	 */
	public void setInsvAcldFstTsAm(long insvAcldFstTsAm) {
		setInsvAcldFstTsAm(BigDecimal.valueOf(insvAcldFstTsAm));
	}
	/**
	 * 적금적립최초이체금액
	 * BigDecimal - String value setter
	 *
	 * @Param insvAcldFstTsAm 적금적립최초이체금액
	 */
	public void setInsvAcldFstTsAm(String insvAcldFstTsAm) {
		setInsvAcldFstTsAm(new BigDecimal(insvAcldFstTsAm));
	}
	/**
	 * 적금적립최초이체금액
	 */
	@XmlTransient
	public BigDecimal getInsvAcldFstTsAm(){
		return this.insvAcldFstTsAm;
	}
	
	/**
	 * 적금적립최초이체금액
	 * 
	 * @param insvAcldFstTsAm 적금적립최초이체금액
	 */
	@JsonSetter("insvAcldFstTsAm")
	public void setInsvAcldFstTsAm(BigDecimal insvAcldFstTsAm){
		this.insvAcldFstTsAm= insvAcldFstTsAm;
		this.setIsSet_insvAcldFstTsAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_insvAcldTsStaWkdDscd= false;
	protected final boolean isSet_insvAcldTsStaWkdDscd(){
		return this.isSet_insvAcldTsStaWkdDscd;
	}
	private void setIsSet_insvAcldTsStaWkdDscd(boolean value){
		this.isSet_insvAcldTsStaWkdDscd= value;
	}
	/**
	 * 적금적립이체시작요일구분코드
	 */
	@XmlTransient
	public String getInsvAcldTsStaWkdDscd(){
		return this.insvAcldTsStaWkdDscd;
	}
	
	/**
	 * 적금적립이체시작요일구분코드
	 * 
	 * @param insvAcldTsStaWkdDscd 적금적립이체시작요일구분코드
	 */
	public void setInsvAcldTsStaWkdDscd(String insvAcldTsStaWkdDscd){
		this.insvAcldTsStaWkdDscd= insvAcldTsStaWkdDscd;
		this.setIsSet_insvAcldTsStaWkdDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_insvAcldTsStaDt= false;
	protected final boolean isSet_insvAcldTsStaDt(){
		return this.isSet_insvAcldTsStaDt;
	}
	private void setIsSet_insvAcldTsStaDt(boolean value){
		this.isSet_insvAcldTsStaDt= value;
	}
	/**
	 * 적금적립이체시작일자
	 */
	@XmlTransient
	public String getInsvAcldTsStaDt(){
		return this.insvAcldTsStaDt;
	}
	
	/**
	 * 적금적립이체시작일자
	 * 
	 * @param insvAcldTsStaDt 적금적립이체시작일자
	 */
	public void setInsvAcldTsStaDt(String insvAcldTsStaDt){
		this.insvAcldTsStaDt= insvAcldTsStaDt;
		this.setIsSet_insvAcldTsStaDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_insvAcldPlanChcYn= false;
	protected final boolean isSet_insvAcldPlanChcYn(){
		return this.isSet_insvAcldPlanChcYn;
	}
	private void setIsSet_insvAcldPlanChcYn(boolean value){
		this.isSet_insvAcldPlanChcYn= value;
	}
	/**
	 * 적금적립플랜선택여부
	 */
	@XmlTransient
	public String getInsvAcldPlanChcYn(){
		return this.insvAcldPlanChcYn;
	}
	
	/**
	 * 적금적립플랜선택여부
	 * 
	 * @param insvAcldPlanChcYn 적금적립플랜선택여부
	 */
	public void setInsvAcldPlanChcYn(String insvAcldPlanChcYn){
		this.insvAcldPlanChcYn= insvAcldPlanChcYn;
		this.setIsSet_insvAcldPlanChcYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_insvAcldPlanLifeAm= false;
	protected final boolean isSet_insvAcldPlanLifeAm(){
		return this.isSet_insvAcldPlanLifeAm;
	}
	private void setIsSet_insvAcldPlanLifeAm(boolean value){
		this.isSet_insvAcldPlanLifeAm= value;
	}
	/**
	 * 적금적립플랜생활금액
	 * BigDecimal - Double value setter
	 *
	 * @Param insvAcldPlanLifeAm 적금적립플랜생활금액
	 */
	public void setInsvAcldPlanLifeAm(double insvAcldPlanLifeAm) {
		setInsvAcldPlanLifeAm(BigDecimal.valueOf(insvAcldPlanLifeAm));
	}
	/**
	 * 적금적립플랜생활금액
	 * BigDecimal - Long value setter
	 *
	 * @Param insvAcldPlanLifeAm 적금적립플랜생활금액
	 */
	public void setInsvAcldPlanLifeAm(long insvAcldPlanLifeAm) {
		setInsvAcldPlanLifeAm(BigDecimal.valueOf(insvAcldPlanLifeAm));
	}
	/**
	 * 적금적립플랜생활금액
	 * BigDecimal - String value setter
	 *
	 * @Param insvAcldPlanLifeAm 적금적립플랜생활금액
	 */
	public void setInsvAcldPlanLifeAm(String insvAcldPlanLifeAm) {
		setInsvAcldPlanLifeAm(new BigDecimal(insvAcldPlanLifeAm));
	}
	/**
	 * 적금적립플랜생활금액
	 */
	@XmlTransient
	public BigDecimal getInsvAcldPlanLifeAm(){
		return this.insvAcldPlanLifeAm;
	}
	
	/**
	 * 적금적립플랜생활금액
	 * 
	 * @param insvAcldPlanLifeAm 적금적립플랜생활금액
	 */
	@JsonSetter("insvAcldPlanLifeAm")
	public void setInsvAcldPlanLifeAm(BigDecimal insvAcldPlanLifeAm){
		this.insvAcldPlanLifeAm= insvAcldPlanLifeAm;
		this.setIsSet_insvAcldPlanLifeAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pidMecd= false;
	protected final boolean isSet_pidMecd(){
		return this.isSet_pidMecd;
	}
	private void setIsSet_pidMecd(boolean value){
		this.isSet_pidMecd= value;
	}
	/**
	 * 납입방법코드
	 */
	@XmlTransient
	public String getPidMecd(){
		return this.pidMecd;
	}
	
	/**
	 * 납입방법코드
	 * 
	 * @param pidMecd 납입방법코드
	 */
	public void setPidMecd(String pidMecd){
		this.pidMecd= pidMecd;
		this.setIsSet_pidMecd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_selcMvbDtlsIdfCd= false;
	protected final boolean isSet_selcMvbDtlsIdfCd(){
		return this.isSet_selcMvbDtlsIdfCd;
	}
	private void setIsSet_selcMvbDtlsIdfCd(boolean value){
		this.isSet_selcMvbDtlsIdfCd= value;
	}
	/**
	 * 판매사이동세부식별코드
	 */
	@XmlTransient
	public String getSelcMvbDtlsIdfCd(){
		return this.selcMvbDtlsIdfCd;
	}
	
	/**
	 * 판매사이동세부식별코드
	 * 
	 * @param selcMvbDtlsIdfCd 판매사이동세부식별코드
	 */
	public void setSelcMvbDtlsIdfCd(String selcMvbDtlsIdfCd){
		this.selcMvbDtlsIdfCd= selcMvbDtlsIdfCd;
		this.setIsSet_selcMvbDtlsIdfCd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ptnBkwAcno= false;
	protected final boolean isSet_ptnBkwAcno(){
		return this.isSet_ptnBkwAcno;
	}
	private void setIsSet_ptnBkwAcno(boolean value){
		this.isSet_ptnBkwAcno= value;
	}
	/**
	 * 상대전행계좌번호
	 */
	@XmlTransient
	public String getPtnBkwAcno(){
		return this.ptnBkwAcno;
	}
	
	/**
	 * 상대전행계좌번호
	 * 
	 * @param ptnBkwAcno 상대전행계좌번호
	 */
	public void setPtnBkwAcno(String ptnBkwAcno){
		this.ptnBkwAcno= ptnBkwAcno;
		this.setIsSet_ptnBkwAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ptnSelcIscd= false;
	protected final boolean isSet_ptnSelcIscd(){
		return this.isSet_ptnSelcIscd;
	}
	private void setIsSet_ptnSelcIscd(boolean value){
		this.isSet_ptnSelcIscd= value;
	}
	/**
	 * 상대판매사기관코드
	 */
	@XmlTransient
	public String getPtnSelcIscd(){
		return this.ptnSelcIscd;
	}
	
	/**
	 * 상대판매사기관코드
	 * 
	 * @param ptnSelcIscd 상대판매사기관코드
	 */
	public void setPtnSelcIscd(String ptnSelcIscd){
		this.ptnSelcIscd= ptnSelcIscd;
		this.setIsSet_ptnSelcIscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_fndslcMvbCfdocIsuDt= false;
	protected final boolean isSet_fndslcMvbCfdocIsuDt(){
		return this.isSet_fndslcMvbCfdocIsuDt;
	}
	private void setIsSet_fndslcMvbCfdocIsuDt(boolean value){
		this.isSet_fndslcMvbCfdocIsuDt= value;
	}
	/**
	 * 펀드판매사이동확인서발급일자
	 */
	@XmlTransient
	public String getFndslcMvbCfdocIsuDt(){
		return this.fndslcMvbCfdocIsuDt;
	}
	
	/**
	 * 펀드판매사이동확인서발급일자
	 * 
	 * @param fndslcMvbCfdocIsuDt 펀드판매사이동확인서발급일자
	 */
	public void setFndslcMvbCfdocIsuDt(String fndslcMvbCfdocIsuDt){
		this.fndslcMvbCfdocIsuDt= fndslcMvbCfdocIsuDt;
		this.setIsSet_fndslcMvbCfdocIsuDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_taxTycd= false;
	protected final boolean isSet_taxTycd(){
		return this.isSet_taxTycd;
	}
	private void setIsSet_taxTycd(boolean value){
		this.isSet_taxTycd= value;
	}
	/**
	 * 세금유형코드
	 */
	@XmlTransient
	public String getTaxTycd(){
		return this.taxTycd;
	}
	
	/**
	 * 세금유형코드
	 * 
	 * @param taxTycd 세금유형코드
	 */
	public void setTaxTycd(String taxTycd){
		this.taxTycd= taxTycd;
		this.setIsSet_taxTycd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rprhAfImnwYn= false;
	protected final boolean isSet_rprhAfImnwYn(){
		return this.isSet_rprhAfImnwYn;
	}
	private void setIsSet_rprhAfImnwYn(boolean value){
		this.isSet_rprhAfImnwYn= value;
	}
	/**
	 * 환매후즉시신규여부
	 */
	@XmlTransient
	public String getRprhAfImnwYn(){
		return this.rprhAfImnwYn;
	}
	
	/**
	 * 환매후즉시신규여부
	 * 
	 * @param rprhAfImnwYn 환매후즉시신규여부
	 */
	public void setRprhAfImnwYn(String rprhAfImnwYn){
		this.rprhAfImnwYn= rprhAfImnwYn;
		this.setIsSet_rprhAfImnwYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_elfSelfDgnsYn= false;
	protected final boolean isSet_elfSelfDgnsYn(){
		return this.isSet_elfSelfDgnsYn;
	}
	private void setIsSet_elfSelfDgnsYn(boolean value){
		this.isSet_elfSelfDgnsYn= value;
	}
	/**
	 * ELF자가진단여부
	 */
	@XmlTransient
	public String getElfSelfDgnsYn(){
		return this.elfSelfDgnsYn;
	}
	
	/**
	 * ELF자가진단여부
	 * 
	 * @param elfSelfDgnsYn ELF자가진단여부
	 */
	public void setElfSelfDgnsYn(String elfSelfDgnsYn){
		this.elfSelfDgnsYn= elfSelfDgnsYn;
		this.setIsSet_elfSelfDgnsYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_wmsPrtfDis= false;
	protected final boolean isSet_wmsPrtfDis(){
		return this.isSet_wmsPrtfDis;
	}
	private void setIsSet_wmsPrtfDis(boolean value){
		this.isSet_wmsPrtfDis= value;
	}
	/**
	 * WMS포트폴리오구분
	 */
	@XmlTransient
	public String getWmsPrtfDis(){
		return this.wmsPrtfDis;
	}
	
	/**
	 * WMS포트폴리오구분
	 * 
	 * @param wmsPrtfDis WMS포트폴리오구분
	 */
	public void setWmsPrtfDis(String wmsPrtfDis){
		this.wmsPrtfDis= wmsPrtfDis;
		this.setIsSet_wmsPrtfDis(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ptnIstCnfYn= false;
	protected final boolean isSet_ptnIstCnfYn(){
		return this.isSet_ptnIstCnfYn;
	}
	private void setIsSet_ptnIstCnfYn(boolean value){
		this.isSet_ptnIstCnfYn= value;
	}
	/**
	 * 상대기관확인여부
	 */
	@XmlTransient
	public String getPtnIstCnfYn(){
		return this.ptnIstCnfYn;
	}
	
	/**
	 * 상대기관확인여부
	 * 
	 * @param ptnIstCnfYn 상대기관확인여부
	 */
	public void setPtnIstCnfYn(String ptnIstCnfYn){
		this.ptnIstCnfYn= ptnIstCnfYn;
		this.setIsSet_ptnIstCnfYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ivsdesSrno= false;
	protected final boolean isSet_ivsdesSrno(){
		return this.isSet_ivsdesSrno;
	}
	private void setIsSet_ivsdesSrno(boolean value){
		this.isSet_ivsdesSrno= value;
	}
	/**
	 * 투자설계일련번호
	 */
	@XmlTransient
	public String getIvsdesSrno(){
		return this.ivsdesSrno;
	}
	
	/**
	 * 투자설계일련번호
	 * 
	 * @param ivsdesSrno 투자설계일련번호
	 */
	public void setIvsdesSrno(String ivsdesSrno){
		this.ivsdesSrno= ivsdesSrno;
		this.setIsSet_ivsdesSrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_fndSvvlAcuCn= false;
	protected final boolean isSet_fndSvvlAcuCn(){
		return this.isSet_fndSvvlAcuCn;
	}
	private void setIsSet_fndSvvlAcuCn(boolean value){
		this.isSet_fndSvvlAcuCn= value;
	}
	/**
	 * 펀드잔존좌수
	 * BigDecimal - Double value setter
	 *
	 * @Param fndSvvlAcuCn 펀드잔존좌수
	 */
	public void setFndSvvlAcuCn(double fndSvvlAcuCn) {
		setFndSvvlAcuCn(BigDecimal.valueOf(fndSvvlAcuCn));
	}
	/**
	 * 펀드잔존좌수
	 * BigDecimal - Long value setter
	 *
	 * @Param fndSvvlAcuCn 펀드잔존좌수
	 */
	public void setFndSvvlAcuCn(long fndSvvlAcuCn) {
		setFndSvvlAcuCn(BigDecimal.valueOf(fndSvvlAcuCn));
	}
	/**
	 * 펀드잔존좌수
	 * BigDecimal - String value setter
	 *
	 * @Param fndSvvlAcuCn 펀드잔존좌수
	 */
	public void setFndSvvlAcuCn(String fndSvvlAcuCn) {
		setFndSvvlAcuCn(new BigDecimal(fndSvvlAcuCn));
	}
	/**
	 * 펀드잔존좌수
	 */
	@XmlTransient
	public BigDecimal getFndSvvlAcuCn(){
		return this.fndSvvlAcuCn;
	}
	
	/**
	 * 펀드잔존좌수
	 * 
	 * @param fndSvvlAcuCn 펀드잔존좌수
	 */
	@JsonSetter("fndSvvlAcuCn")
	public void setFndSvvlAcuCn(BigDecimal fndSvvlAcuCn){
		this.fndSvvlAcuCn= fndSvvlAcuCn;
		this.setIsSet_fndSvvlAcuCn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cusPrtfRgsNo= false;
	protected final boolean isSet_cusPrtfRgsNo(){
		return this.isSet_cusPrtfRgsNo;
	}
	private void setIsSet_cusPrtfRgsNo(boolean value){
		this.isSet_cusPrtfRgsNo= value;
	}
	/**
	 * 고객포트폴리오등록번호
	 * BigDecimal - Double value setter
	 *
	 * @Param cusPrtfRgsNo 고객포트폴리오등록번호
	 */
	public void setCusPrtfRgsNo(double cusPrtfRgsNo) {
		setCusPrtfRgsNo(BigDecimal.valueOf(cusPrtfRgsNo));
	}
	/**
	 * 고객포트폴리오등록번호
	 * BigDecimal - Long value setter
	 *
	 * @Param cusPrtfRgsNo 고객포트폴리오등록번호
	 */
	public void setCusPrtfRgsNo(long cusPrtfRgsNo) {
		setCusPrtfRgsNo(BigDecimal.valueOf(cusPrtfRgsNo));
	}
	/**
	 * 고객포트폴리오등록번호
	 * BigDecimal - String value setter
	 *
	 * @Param cusPrtfRgsNo 고객포트폴리오등록번호
	 */
	public void setCusPrtfRgsNo(String cusPrtfRgsNo) {
		setCusPrtfRgsNo(new BigDecimal(cusPrtfRgsNo));
	}
	/**
	 * 고객포트폴리오등록번호
	 */
	@XmlTransient
	public BigDecimal getCusPrtfRgsNo(){
		return this.cusPrtfRgsNo;
	}
	
	/**
	 * 고객포트폴리오등록번호
	 * 
	 * @param cusPrtfRgsNo 고객포트폴리오등록번호
	 */
	@JsonSetter("cusPrtfRgsNo")
	public void setCusPrtfRgsNo(BigDecimal cusPrtfRgsNo){
		this.cusPrtfRgsNo= cusPrtfRgsNo;
		this.setIsSet_cusPrtfRgsNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rcpDtm= false;
	protected final boolean isSet_rcpDtm(){
		return this.isSet_rcpDtm;
	}
	private void setIsSet_rcpDtm(boolean value){
		this.isSet_rcpDtm= value;
	}
	/**
	 * 접수일시
	 */
	@XmlTransient
	public String getRcpDtm(){
		return this.rcpDtm;
	}
	
	/**
	 * 접수일시
	 * 
	 * @param rcpDtm 접수일시
	 */
	public void setRcpDtm(String rcpDtm){
		this.rcpDtm= rcpDtm;
		this.setIsSet_rcpDtm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pnsfndAcno= false;
	protected final boolean isSet_pnsfndAcno(){
		return this.isSet_pnsfndAcno;
	}
	private void setIsSet_pnsfndAcno(boolean value){
		this.isSet_pnsfndAcno= value;
	}
	/**
	 * 연금펀드계좌번호
	 */
	@XmlTransient
	public String getPnsfndAcno(){
		return this.pnsfndAcno;
	}
	
	/**
	 * 연금펀드계좌번호
	 * 
	 * @param pnsfndAcno 연금펀드계좌번호
	 */
	public void setPnsfndAcno(String pnsfndAcno){
		this.pnsfndAcno= pnsfndAcno;
		this.setIsSet_pnsfndAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mmfFndAcno= false;
	protected final boolean isSet_mmfFndAcno(){
		return this.isSet_mmfFndAcno;
	}
	private void setIsSet_mmfFndAcno(boolean value){
		this.isSet_mmfFndAcno= value;
	}
	/**
	 * MMF펀드계좌번호
	 */
	@XmlTransient
	public String getMmfFndAcno(){
		return this.mmfFndAcno;
	}
	
	/**
	 * MMF펀드계좌번호
	 * 
	 * @param mmfFndAcno MMF펀드계좌번호
	 */
	public void setMmfFndAcno(String mmfFndAcno){
		this.mmfFndAcno= mmfFndAcno;
		this.setIsSet_mmfFndAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pnsfndNewYn= false;
	protected final boolean isSet_pnsfndNewYn(){
		return this.isSet_pnsfndNewYn;
	}
	private void setIsSet_pnsfndNewYn(boolean value){
		this.isSet_pnsfndNewYn= value;
	}
	/**
	 * 연금펀드신규여부
	 */
	@XmlTransient
	public String getPnsfndNewYn(){
		return this.pnsfndNewYn;
	}
	
	/**
	 * 연금펀드신규여부
	 * 
	 * @param pnsfndNewYn 연금펀드신규여부
	 */
	public void setPnsfndNewYn(String pnsfndNewYn){
		this.pnsfndNewYn= pnsfndNewYn;
		this.setIsSet_pnsfndNewYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_frstNwactNo= false;
	protected final boolean isSet_frstNwactNo(){
		return this.isSet_frstNwactNo;
	}
	private void setIsSet_frstNwactNo(boolean value){
		this.isSet_frstNwactNo= value;
	}
	/**
	 * 첫번째신규계좌번호
	 */
	@XmlTransient
	public String getFrstNwactNo(){
		return this.frstNwactNo;
	}
	
	/**
	 * 첫번째신규계좌번호
	 * 
	 * @param frstNwactNo 첫번째신규계좌번호
	 */
	public void setFrstNwactNo(String frstNwactNo){
		this.frstNwactNo= frstNwactNo;
		this.setIsSet_frstNwactNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_scndNwactNo= false;
	protected final boolean isSet_scndNwactNo(){
		return this.isSet_scndNwactNo;
	}
	private void setIsSet_scndNwactNo(boolean value){
		this.isSet_scndNwactNo= value;
	}
	/**
	 * 두번째신규계좌번호
	 */
	@XmlTransient
	public String getScndNwactNo(){
		return this.scndNwactNo;
	}
	
	/**
	 * 두번째신규계좌번호
	 * 
	 * @param scndNwactNo 두번째신규계좌번호
	 */
	public void setScndNwactNo(String scndNwactNo){
		this.scndNwactNo= scndNwactNo;
		this.setIsSet_scndNwactNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_fndOpngDt= false;
	protected final boolean isSet_fndOpngDt(){
		return this.isSet_fndOpngDt;
	}
	private void setIsSet_fndOpngDt(boolean value){
		this.isSet_fndOpngDt= value;
	}
	/**
	 * 펀드개설일자
	 */
	@XmlTransient
	public String getFndOpngDt(){
		return this.fndOpngDt;
	}
	
	/**
	 * 펀드개설일자
	 * 
	 * @param fndOpngDt 펀드개설일자
	 */
	public void setFndOpngDt(String fndOpngDt){
		this.fndOpngDt= fndOpngDt;
		this.setIsSet_fndOpngDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_krwSscoNewTlmNo= false;
	protected final boolean isSet_krwSscoNewTlmNo(){
		return this.isSet_krwSscoNewTlmNo;
	}
	private void setIsSet_krwSscoNewTlmNo(boolean value){
		this.isSet_krwSscoNewTlmNo= value;
	}
	/**
	 * 원화삼성신규전문번호
	 */
	@XmlTransient
	public String getKrwSscoNewTlmNo(){
		return this.krwSscoNewTlmNo;
	}
	
	/**
	 * 원화삼성신규전문번호
	 * 
	 * @param krwSscoNewTlmNo 원화삼성신규전문번호
	 */
	public void setKrwSscoNewTlmNo(String krwSscoNewTlmNo){
		this.krwSscoNewTlmNo= krwSscoNewTlmNo;
		this.setIsSet_krwSscoNewTlmNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atsDtlDscd= false;
	protected final boolean isSet_atsDtlDscd(){
		return this.isSet_atsDtlDscd;
	}
	private void setIsSet_atsDtlDscd(boolean value){
		this.isSet_atsDtlDscd= value;
	}
	/**
	 * 자동이체상세구분코드
	 */
	@XmlTransient
	public String getAtsDtlDscd(){
		return this.atsDtlDscd;
	}
	
	/**
	 * 자동이체상세구분코드
	 * 
	 * @param atsDtlDscd 자동이체상세구분코드
	 */
	public void setAtsDtlDscd(String atsDtlDscd){
		this.atsDtlDscd= atsDtlDscd;
		this.setIsSet_atsDtlDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atsRcvLmtAm= false;
	protected final boolean isSet_atsRcvLmtAm(){
		return this.isSet_atsRcvLmtAm;
	}
	private void setIsSet_atsRcvLmtAm(boolean value){
		this.isSet_atsRcvLmtAm= value;
	}
	/**
	 * 자동이체입금한도금액
	 * BigDecimal - Double value setter
	 *
	 * @Param atsRcvLmtAm 자동이체입금한도금액
	 */
	public void setAtsRcvLmtAm(double atsRcvLmtAm) {
		setAtsRcvLmtAm(BigDecimal.valueOf(atsRcvLmtAm));
	}
	/**
	 * 자동이체입금한도금액
	 * BigDecimal - Long value setter
	 *
	 * @Param atsRcvLmtAm 자동이체입금한도금액
	 */
	public void setAtsRcvLmtAm(long atsRcvLmtAm) {
		setAtsRcvLmtAm(BigDecimal.valueOf(atsRcvLmtAm));
	}
	/**
	 * 자동이체입금한도금액
	 * BigDecimal - String value setter
	 *
	 * @Param atsRcvLmtAm 자동이체입금한도금액
	 */
	public void setAtsRcvLmtAm(String atsRcvLmtAm) {
		setAtsRcvLmtAm(new BigDecimal(atsRcvLmtAm));
	}
	/**
	 * 자동이체입금한도금액
	 */
	@XmlTransient
	public BigDecimal getAtsRcvLmtAm(){
		return this.atsRcvLmtAm;
	}
	
	/**
	 * 자동이체입금한도금액
	 * 
	 * @param atsRcvLmtAm 자동이체입금한도금액
	 */
	@JsonSetter("atsRcvLmtAm")
	public void setAtsRcvLmtAm(BigDecimal atsRcvLmtAm){
		this.atsRcvLmtAm= atsRcvLmtAm;
		this.setIsSet_atsRcvLmtAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_krwFmbkMmdaYn= false;
	protected final boolean isSet_krwFmbkMmdaYn(){
		return this.isSet_krwFmbkMmdaYn;
	}
	private void setIsSet_krwFmbkMmdaYn(boolean value){
		this.isSet_krwFmbkMmdaYn= value;
	}
	/**
	 * 원화펌뱅킹MMDA여부
	 */
	@XmlTransient
	public String getKrwFmbkMmdaYn(){
		return this.krwFmbkMmdaYn;
	}
	
	/**
	 * 원화펌뱅킹MMDA여부
	 * 
	 * @param krwFmbkMmdaYn 원화펌뱅킹MMDA여부
	 */
	public void setKrwFmbkMmdaYn(String krwFmbkMmdaYn){
		this.krwFmbkMmdaYn= krwFmbkMmdaYn;
		this.setIsSet_krwFmbkMmdaYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_opgOrdsMngNo= false;
	protected final boolean isSet_opgOrdsMngNo(){
		return this.isSet_opgOrdsMngNo;
	}
	private void setIsSet_opgOrdsMngNo(boolean value){
		this.isSet_opgOrdsMngNo= value;
	}
	/**
	 * 운용지시관리번호
	 */
	@XmlTransient
	public String getOpgOrdsMngNo(){
		return this.opgOrdsMngNo;
	}
	
	/**
	 * 운용지시관리번호
	 * 
	 * @param opgOrdsMngNo 운용지시관리번호
	 */
	public void setOpgOrdsMngNo(String opgOrdsMngNo){
		this.opgOrdsMngNo= opgOrdsMngNo;
		this.setIsSet_opgOrdsMngNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_spcfPrdMoAcno= false;
	protected final boolean isSet_spcfPrdMoAcno(){
		return this.isSet_spcfPrdMoAcno;
	}
	private void setIsSet_spcfPrdMoAcno(boolean value){
		this.isSet_spcfPrdMoAcno= value;
	}
	/**
	 * 특정상품모계좌번호
	 */
	@XmlTransient
	public String getSpcfPrdMoAcno(){
		return this.spcfPrdMoAcno;
	}
	
	/**
	 * 특정상품모계좌번호
	 * 
	 * @param spcfPrdMoAcno 특정상품모계좌번호
	 */
	public void setSpcfPrdMoAcno(String spcfPrdMoAcno){
		this.spcfPrdMoAcno= spcfPrdMoAcno;
		this.setIsSet_spcfPrdMoAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_restTxprLmtAm= false;
	protected final boolean isSet_restTxprLmtAm(){
		return this.isSet_restTxprLmtAm;
	}
	private void setIsSet_restTxprLmtAm(boolean value){
		this.isSet_restTxprLmtAm= value;
	}
	/**
	 * 잔여세금우대한도금액
	 * BigDecimal - Double value setter
	 *
	 * @Param restTxprLmtAm 잔여세금우대한도금액
	 */
	public void setRestTxprLmtAm(double restTxprLmtAm) {
		setRestTxprLmtAm(BigDecimal.valueOf(restTxprLmtAm));
	}
	/**
	 * 잔여세금우대한도금액
	 * BigDecimal - Long value setter
	 *
	 * @Param restTxprLmtAm 잔여세금우대한도금액
	 */
	public void setRestTxprLmtAm(long restTxprLmtAm) {
		setRestTxprLmtAm(BigDecimal.valueOf(restTxprLmtAm));
	}
	/**
	 * 잔여세금우대한도금액
	 * BigDecimal - String value setter
	 *
	 * @Param restTxprLmtAm 잔여세금우대한도금액
	 */
	public void setRestTxprLmtAm(String restTxprLmtAm) {
		setRestTxprLmtAm(new BigDecimal(restTxprLmtAm));
	}
	/**
	 * 잔여세금우대한도금액
	 */
	@XmlTransient
	public BigDecimal getRestTxprLmtAm(){
		return this.restTxprLmtAm;
	}
	
	/**
	 * 잔여세금우대한도금액
	 * 
	 * @param restTxprLmtAm 잔여세금우대한도금액
	 */
	@JsonSetter("restTxprLmtAm")
	public void setRestTxprLmtAm(BigDecimal restTxprLmtAm){
		this.restTxprLmtAm= restTxprLmtAm;
		this.setIsSet_restTxprLmtAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dppeAcno= false;
	protected final boolean isSet_dppeAcno(){
		return this.isSet_dppeAcno;
	}
	private void setIsSet_dppeAcno(boolean value){
		this.isSet_dppeAcno= value;
	}
	/**
	 * 예탁자계좌번호
	 */
	@XmlTransient
	public String getDppeAcno(){
		return this.dppeAcno;
	}
	
	/**
	 * 예탁자계좌번호
	 * 
	 * @param dppeAcno 예탁자계좌번호
	 */
	public void setDppeAcno(String dppeAcno){
		this.dppeAcno= dppeAcno;
		this.setIsSet_dppeAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pmnyIdeedYn= false;
	protected final boolean isSet_pmnyIdeedYn(){
		return this.isSet_pmnyIdeedYn;
	}
	private void setIsSet_pmnyIdeedYn(boolean value){
		this.isSet_pmnyIdeedYn= value;
	}
	/**
	 * 공금중요증서여부
	 */
	@XmlTransient
	public String getPmnyIdeedYn(){
		return this.pmnyIdeedYn;
	}
	
	/**
	 * 공금중요증서여부
	 * 
	 * @param pmnyIdeedYn 공금중요증서여부
	 */
	public void setPmnyIdeedYn(String pmnyIdeedYn){
		this.pmnyIdeedYn= pmnyIdeedYn;
		this.setIsSet_pmnyIdeedYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_tdyCancAcno= false;
	protected final boolean isSet_tdyCancAcno(){
		return this.isSet_tdyCancAcno;
	}
	private void setIsSet_tdyCancAcno(boolean value){
		this.isSet_tdyCancAcno= value;
	}
	/**
	 * 당일해지계좌번호
	 */
	@XmlTransient
	public String getTdyCancAcno(){
		return this.tdyCancAcno;
	}
	
	/**
	 * 당일해지계좌번호
	 * 
	 * @param tdyCancAcno 당일해지계좌번호
	 */
	public void setTdyCancAcno(String tdyCancAcno){
		this.tdyCancAcno= tdyCancAcno;
		this.setIsSet_tdyCancAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cbrseNewYn= false;
	protected final boolean isSet_cbrseNewYn(){
		return this.isSet_cbrseNewYn;
	}
	private void setIsSet_cbrseNewYn(boolean value){
		this.isSet_cbrseNewYn= value;
	}
	/**
	 * 사이버증권신규여부
	 */
	@XmlTransient
	public String getCbrseNewYn(){
		return this.cbrseNewYn;
	}
	
	/**
	 * 사이버증권신규여부
	 * 
	 * @param cbrseNewYn 사이버증권신규여부
	 */
	public void setCbrseNewYn(String cbrseNewYn){
		this.cbrseNewYn= cbrseNewYn;
		this.setIsSet_cbrseNewYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_fmbkNewCitAtsCancYn= false;
	protected final boolean isSet_fmbkNewCitAtsCancYn(){
		return this.isSet_fmbkNewCitAtsCancYn;
	}
	private void setIsSet_fmbkNewCitAtsCancYn(boolean value){
		this.isSet_fmbkNewCitAtsCancYn= value;
	}
	/**
	 * 펌뱅킹신규시자동이체해지여부
	 */
	@XmlTransient
	public String getFmbkNewCitAtsCancYn(){
		return this.fmbkNewCitAtsCancYn;
	}
	
	/**
	 * 펌뱅킹신규시자동이체해지여부
	 * 
	 * @param fmbkNewCitAtsCancYn 펌뱅킹신규시자동이체해지여부
	 */
	public void setFmbkNewCitAtsCancYn(String fmbkNewCitAtsCancYn){
		this.fmbkNewCitAtsCancYn= fmbkNewCitAtsCancYn;
		this.setIsSet_fmbkNewCitAtsCancYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cnstDdctFxpdGrnYr5OverYn= false;
	protected final boolean isSet_cnstDdctFxpdGrnYr5OverYn(){
		return this.isSet_cnstDdctFxpdGrnYr5OverYn;
	}
	private void setIsSet_cnstDdctFxpdGrnYr5OverYn(boolean value){
		this.isSet_cnstDdctFxpdGrnYr5OverYn= value;
	}
	/**
	 * 건설공제정기예금보증5년초과여부
	 */
	@XmlTransient
	public String getCnstDdctFxpdGrnYr5OverYn(){
		return this.cnstDdctFxpdGrnYr5OverYn;
	}
	
	/**
	 * 건설공제정기예금보증5년초과여부
	 * 
	 * @param cnstDdctFxpdGrnYr5OverYn 건설공제정기예금보증5년초과여부
	 */
	public void setCnstDdctFxpdGrnYr5OverYn(String cnstDdctFxpdGrnYr5OverYn){
		this.cnstDdctFxpdGrnYr5OverYn= cnstDdctFxpdGrnYr5OverYn;
		this.setIsSet_cnstDdctFxpdGrnYr5OverYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_aprrBrdmCd= false;
	protected final boolean isSet_aprrBrdmCd(){
		return this.isSet_aprrBrdmCd;
	}
	private void setIsSet_aprrBrdmCd(boolean value){
		this.isSet_aprrBrdmCd= value;
	}
	/**
	 * 충당부담금코드
	 */
	@XmlTransient
	public String getAprrBrdmCd(){
		return this.aprrBrdmCd;
	}
	
	/**
	 * 충당부담금코드
	 * 
	 * @param aprrBrdmCd 충당부담금코드
	 */
	public void setAprrBrdmCd(String aprrBrdmCd){
		this.aprrBrdmCd= aprrBrdmCd;
		this.setIsSet_aprrBrdmCd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cmpnOv1peYn= false;
	protected final boolean isSet_cmpnOv1peYn(){
		return this.isSet_cmpnOv1peYn;
	}
	private void setIsSet_cmpnOv1peYn(boolean value){
		this.isSet_cmpnOv1peYn= value;
	}
	/**
	 * 구속성1퍼센트초과여부
	 */
	@XmlTransient
	public String getCmpnOv1peYn(){
		return this.cmpnOv1peYn;
	}
	
	/**
	 * 구속성1퍼센트초과여부
	 * 
	 * @param cmpnOv1peYn 구속성1퍼센트초과여부
	 */
	public void setCmpnOv1peYn(String cmpnOv1peYn){
		this.cmpnOv1peYn= cmpnOv1peYn;
		this.setIsSet_cmpnOv1peYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pnsfndCoreOupYn= false;
	protected final boolean isSet_pnsfndCoreOupYn(){
		return this.isSet_pnsfndCoreOupYn;
	}
	private void setIsSet_pnsfndCoreOupYn(boolean value){
		this.isSet_pnsfndCoreOupYn= value;
	}
	/**
	 * 연금펀드핵심출력여부
	 */
	@XmlTransient
	public String getPnsfndCoreOupYn(){
		return this.pnsfndCoreOupYn;
	}
	
	/**
	 * 연금펀드핵심출력여부
	 * 
	 * @param pnsfndCoreOupYn 연금펀드핵심출력여부
	 */
	public void setPnsfndCoreOupYn(String pnsfndCoreOupYn){
		this.pnsfndCoreOupYn= pnsfndCoreOupYn;
		this.setIsSet_pnsfndCoreOupYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rtpenPlanAplDt= false;
	protected final boolean isSet_rtpenPlanAplDt(){
		return this.isSet_rtpenPlanAplDt;
	}
	private void setIsSet_rtpenPlanAplDt(boolean value){
		this.isSet_rtpenPlanAplDt= value;
	}
	/**
	 * 퇴직연금플랜적용일자
	 */
	@XmlTransient
	public String getRtpenPlanAplDt(){
		return this.rtpenPlanAplDt;
	}
	
	/**
	 * 퇴직연금플랜적용일자
	 * 
	 * @param rtpenPlanAplDt 퇴직연금플랜적용일자
	 */
	public void setRtpenPlanAplDt(String rtpenPlanAplDt){
		this.rtpenPlanAplDt= rtpenPlanAplDt;
		this.setIsSet_rtpenPlanAplDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rtpenPlanItcsno= false;
	protected final boolean isSet_rtpenPlanItcsno(){
		return this.isSet_rtpenPlanItcsno;
	}
	private void setIsSet_rtpenPlanItcsno(boolean value){
		this.isSet_rtpenPlanItcsno= value;
	}
	/**
	 * 퇴직연금플랜통합고객번호
	 */
	@XmlTransient
	public String getRtpenPlanItcsno(){
		return this.rtpenPlanItcsno;
	}
	
	/**
	 * 퇴직연금플랜통합고객번호
	 * 
	 * @param rtpenPlanItcsno 퇴직연금플랜통합고객번호
	 */
	public void setRtpenPlanItcsno(String rtpenPlanItcsno){
		this.rtpenPlanItcsno= rtpenPlanItcsno;
		this.setIsSet_rtpenPlanItcsno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_glblBnkgJnngYn= false;
	protected final boolean isSet_glblBnkgJnngYn(){
		return this.isSet_glblBnkgJnngYn;
	}
	private void setIsSet_glblBnkgJnngYn(boolean value){
		this.isSet_glblBnkgJnngYn= value;
	}
	/**
	 * 글로벌뱅킹가입여부
	 */
	@XmlTransient
	public String getGlblBnkgJnngYn(){
		return this.glblBnkgJnngYn;
	}
	
	/**
	 * 글로벌뱅킹가입여부
	 * 
	 * @param glblBnkgJnngYn 글로벌뱅킹가입여부
	 */
	public void setGlblBnkgJnngYn(String glblBnkgJnngYn){
		this.glblBnkgJnngYn= glblBnkgJnngYn;
		this.setIsSet_glblBnkgJnngYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_idCadNewDscd= false;
	protected final boolean isSet_idCadNewDscd(){
		return this.isSet_idCadNewDscd;
	}
	private void setIsSet_idCadNewDscd(boolean value){
		this.isSet_idCadNewDscd= value;
	}
	/**
	 * ID카드신규구분코드
	 */
	@XmlTransient
	public String getIdCadNewDscd(){
		return this.idCadNewDscd;
	}
	
	/**
	 * ID카드신규구분코드
	 * 
	 * @param idCadNewDscd ID카드신규구분코드
	 */
	public void setIdCadNewDscd(String idCadNewDscd){
		this.idCadNewDscd= idCadNewDscd;
		this.setIsSet_idCadNewDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_encyEbnkPwnoCnf= false;
	protected final boolean isSet_encyEbnkPwnoCnf(){
		return this.isSet_encyEbnkPwnoCnf;
	}
	private void setIsSet_encyEbnkPwnoCnf(boolean value){
		this.isSet_encyEbnkPwnoCnf= value;
	}
	/**
	 * 암호화전자뱅킹비밀번호확인
	 */
	@XmlTransient
	public String getEncyEbnkPwnoCnf(){
		return this.encyEbnkPwnoCnf;
	}
	
	/**
	 * 암호화전자뱅킹비밀번호확인
	 * 
	 * @param encyEbnkPwnoCnf 암호화전자뱅킹비밀번호확인
	 */
	public void setEncyEbnkPwnoCnf(String encyEbnkPwnoCnf){
		this.encyEbnkPwnoCnf= encyEbnkPwnoCnf;
		this.setIsSet_encyEbnkPwnoCnf(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_tlbnkPwnoCnf= false;
	protected final boolean isSet_tlbnkPwnoCnf(){
		return this.isSet_tlbnkPwnoCnf;
	}
	private void setIsSet_tlbnkPwnoCnf(boolean value){
		this.isSet_tlbnkPwnoCnf= value;
	}
	/**
	 * 텔레뱅킹비밀번호확인
	 */
	@XmlTransient
	public String getTlbnkPwnoCnf(){
		return this.tlbnkPwnoCnf;
	}
	
	/**
	 * 텔레뱅킹비밀번호확인
	 * 
	 * @param tlbnkPwnoCnf 텔레뱅킹비밀번호확인
	 */
	public void setTlbnkPwnoCnf(String tlbnkPwnoCnf){
		this.tlbnkPwnoCnf= tlbnkPwnoCnf;
		this.setIsSet_tlbnkPwnoCnf(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_gridRowCnt= false;
	protected final boolean isSet_gridRowCnt(){
		return this.isSet_gridRowCnt;
	}
	private void setIsSet_gridRowCnt(boolean value){
		this.isSet_gridRowCnt= value;
	}
	/**
	 * 그리드열건수
	 */
	@XmlElement
	public Integer getGridRowCnt(){
		if ( isSet_gridRowCnt )	return gridRowCnt;
		else{
			if ( grid == null || grid.size() == 0 ) return 0;
			else return grid.size();
		}
	}
	
	/**
	 * 그리드열건수
	 * 
	 * @param gridRowCnt 그리드열건수
	 */
	public void setGridRowCnt(Integer gridRowCnt){
		this.gridRowCnt= gridRowCnt;
		this.setIsSet_gridRowCnt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_grid= false;
	protected final boolean isSet_grid(){
		return this.isSet_grid;
	}
	private void setIsSet_grid(boolean value){
		this.isSet_grid= value;
	}
	/**
	 * 그리드
	 */
	@XmlTransient
	public List<IBSMR0004063_GRID_IDT> getGrid(){
		return grid;
	}
	
	/**
	 * 그리드
	 * 
	 * @param grid 그리드
	 */
	@JsonSetter("grid")
	public void setGrid(List<IBSMR0004063_GRID_IDT> grid){
		this.grid= grid;
		this.setIsSet_grid(true);
	}
	
	public void setGrid(IBSMR0004063_GRID_IDT... items){
		List<IBSMR0004063_GRID_IDT> _items= new ArrayList<>();
		if ( items!= null && items.length> 0){
			for( IBSMR0004063_GRID_IDT item: items ){
				_items.add(item);
			}
		}
		this.setGrid(_items);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_gridRowCnt2= false;
	protected final boolean isSet_gridRowCnt2(){
		return this.isSet_gridRowCnt2;
	}
	private void setIsSet_gridRowCnt2(boolean value){
		this.isSet_gridRowCnt2= value;
	}
	/**
	 * 그리드열건수_2
	 */
	@XmlElement
	public Integer getGridRowCnt2(){
		if ( isSet_gridRowCnt2 )	return gridRowCnt2;
		else{
			if ( grid2 == null || grid2.size() == 0 ) return 0;
			else return grid2.size();
		}
	}
	
	/**
	 * 그리드열건수_2
	 * 
	 * @param gridRowCnt2 그리드열건수_2
	 */
	public void setGridRowCnt2(Integer gridRowCnt2){
		this.gridRowCnt2= gridRowCnt2;
		this.setIsSet_gridRowCnt2(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_grid2= false;
	protected final boolean isSet_grid2(){
		return this.isSet_grid2;
	}
	private void setIsSet_grid2(boolean value){
		this.isSet_grid2= value;
	}
	/**
	 * 그리드_2
	 */
	@XmlTransient
	public List<IBSMR0004063_GRID_2_IDT> getGrid2(){
		return grid2;
	}
	
	/**
	 * 그리드_2
	 * 
	 * @param grid2 그리드_2
	 */
	@JsonSetter("grid2")
	public void setGrid2(List<IBSMR0004063_GRID_2_IDT> grid2){
		this.grid2= grid2;
		this.setIsSet_grid2(true);
	}
	
	public void setGrid2(IBSMR0004063_GRID_2_IDT... items){
		List<IBSMR0004063_GRID_2_IDT> _items= new ArrayList<>();
		if ( items!= null && items.length> 0){
			for( IBSMR0004063_GRID_2_IDT item: items ){
				_items.add(item);
			}
		}
		this.setGrid2(_items);
	}
				
	@Override
	public MnyPinBscMngInsertMnpMoAcno_DIDT clone(){
		try{
			MnyPinBscMngInsertMnpMoAcno_DIDT object= (MnyPinBscMngInsertMnpMoAcno_DIDT)super.clone();
			if ( this.grid== null ) object.grid= null;
			else{
				List<IBSMR0004063_GRID_IDT> clonedList= new ArrayList<>(this.grid.size());
				for( IBSMR0004063_GRID_IDT item : grid ){
					clonedList.add((IBSMR0004063_GRID_IDT)item.clone());
				}
				object.grid= clonedList;
			}
			if ( this.grid2== null ) object.grid2= null;
			else{
				List<IBSMR0004063_GRID_2_IDT> clonedList= new ArrayList<>(this.grid2.size());
				for( IBSMR0004063_GRID_2_IDT item : grid2 ){
					clonedList.add((IBSMR0004063_GRID_2_IDT)item.clone());
				}
				object.grid2= clonedList;
			}
			return object;
		}
		catch(CloneNotSupportedException e){
			throw new CloneFailedException(e);
		}
	}
	
	@Override
	public int hashCode(){
		final int prime=31;
		int result= 1;
		
		result= prime * result + ((this.sqcNmTrnCfdocCollYn==null)?0:this.sqcNmTrnCfdocCollYn.hashCode());
		result= prime * result + ((this.dpsNewDscd==null)?0:this.dpsNewDscd.hashCode());
		result= prime * result + ((this.dpsRsvNewDscd==null)?0:this.dpsRsvNewDscd.hashCode());
		result= prime * result + ((this.encyActPwno==null)?0:this.encyActPwno.hashCode());
		result= prime * result + ((this.sealSignUsgDscd==null)?0:this.sealSignUsgDscd.hashCode());
		result= prime * result + ((this.pdcd==null)?0:this.pdcd.hashCode());
		result= prime * result + ((this.csno==null)?0:this.csno.hashCode());
		result= prime * result + ((this.cusDgnAcno==null)?0:this.cusDgnAcno.hashCode());
		result= prime * result + ((this.prrRgsPwnoKey==null)?0:this.prrRgsPwnoKey.hashCode());
		result= prime * result + ((this.smsdDscd==null)?0:this.smsdDscd.hashCode());
		result= prime * result + ((this.psnInfExpsCnfYn==null)?0:this.psnInfExpsCnfYn.hashCode());
		result= prime * result + ((this.scanUablRncd==null)?0:this.scanUablRncd.hashCode());
		result= prime * result + ((this.psnInfAgmdMngNo==null)?0:this.psnInfAgmdMngNo.hashCode());
		result= prime * result + ((this.acnmCnfEno==null)?0:this.acnmCnfEno.hashCode());
		result= prime * result + ((this.advpeEno==null)?0:this.advpeEno.hashCode());
		result= prime * result + ((this.idcrDscd==null)?0:this.idcrDscd.hashCode());
		result= prime * result + ((this.idcrFnm==null)?0:this.idcrFnm.hashCode());
		result= prime * result + ((this.idcrEncyRsdlNo==null)?0:this.idcrEncyRsdlNo.hashCode());
		result= prime * result + ((this.idcrIsuDt==null)?0:this.idcrIsuDt.hashCode());
		result= prime * result + ((this.idcrImgKey==null)?0:this.idcrImgKey.hashCode());
		result= prime * result + ((this.idcrCnfShap==null)?0:this.idcrCnfShap.hashCode());
		result= prime * result + ((this.idcrRuseYn==null)?0:this.idcrRuseYn.hashCode());
		result= prime * result + ((this.idcrAgnpeTrnYn==null)?0:this.idcrAgnpeTrnYn.hashCode());
		result= prime * result + ((this.appRgsDscd==null)?0:this.appRgsDscd.hashCode());
		result= prime * result + ((this.appRgsBrcd==null)?0:this.appRgsBrcd.hashCode());
		result= prime * result + ((this.appRgsDt==null)?0:this.appRgsDt.hashCode());
		result= prime * result + ((this.appRgsSrno==null)?0:this.appRgsSrno.hashCode());
		result= prime * result + ((this.wmsLnkYn==null)?0:this.wmsLnkYn.hashCode());
		result= prime * result + ((this.snthAsetMngCsno==null)?0:this.snthAsetMngCsno.hashCode());
		result= prime * result + ((this.snthAsetMngDesgnPrdCnt==null)?0:this.snthAsetMngDesgnPrdCnt.hashCode());
		result= prime * result + ((this.snthAsetMngAltrIvstWgt==null)?0:this.snthAsetMngAltrIvstWgt.hashCode());
		result= prime * result + ((this.snthAsetMngBksWgt==null)?0:this.snthAsetMngBksWgt.hashCode());
		result= prime * result + ((this.snthAsetMngFrgBndWgt==null)?0:this.snthAsetMngFrgBndWgt.hashCode());
		result= prime * result + ((this.snthAsetMngFrgStcWgt==null)?0:this.snthAsetMngFrgStcWgt.hashCode());
		result= prime * result + ((this.snthAsetMngPdcd==null)?0:this.snthAsetMngPdcd.hashCode());
		result= prime * result + ((this.appRgsPwno==null)?0:this.appRgsPwno.hashCode());
		result= prime * result + ((this.appRgsAtsAcno==null)?0:this.appRgsAtsAcno.hashCode());
		result= prime * result + ((this.wmLnkTrnSrno==null)?0:this.wmLnkTrnSrno.hashCode());
		result= prime * result + ((this.snthAsetMngDeedCd==null)?0:this.snthAsetMngDeedCd.hashCode());
		result= prime * result + ((this.snthAsetMngFlwWgt==null)?0:this.snthAsetMngFlwWgt.hashCode());
		result= prime * result + ((this.snthAsetMngDomStcWgt==null)?0:this.snthAsetMngDomStcWgt.hashCode());
		result= prime * result + ((this.snthAsetMngDomBndWgt==null)?0:this.snthAsetMngDomBndWgt.hashCode());
		result= prime * result + ((this.prdStbyAnlsSrno==null)?0:this.prdStbyAnlsSrno.hashCode());
		result= prime * result + ((this.inlnAnlsSrno==null)?0:this.inlnAnlsSrno.hashCode());
		result= prime * result + ((this.asetIstMngNo==null)?0:this.asetIstMngNo.hashCode());
		result= prime * result + ((this.rtpenPlanOrgPdcd==null)?0:this.rtpenPlanOrgPdcd.hashCode());
		result= prime * result + ((this.jnpeTycd==null)?0:this.jnpeTycd.hashCode());
		result= prime * result + ((this.fndSgpFpCnslSrvcDscd==null)?0:this.fndSgpFpCnslSrvcDscd.hashCode());
		result= prime * result + ((this.rsdlBzpeNo==null)?0:this.rsdlBzpeNo.hashCode());
		result= prime * result + ((this.frnrLstVldTem==null)?0:this.frnrLstVldTem.hashCode());
		result= prime * result + ((this.inetRsvRcpDscd==null)?0:this.inetRsvRcpDscd.hashCode());
		result= prime * result + ((this.inetRsvIdfNo==null)?0:this.inetRsvIdfNo.hashCode());
		result= prime * result + ((this.inetRsvNo==null)?0:this.inetRsvNo.hashCode());
		result= prime * result + ((this.inetRsvCusPureNewYn==null)?0:this.inetRsvCusPureNewYn.hashCode());
		result= prime * result + ((this.synpbPdcd==null)?0:this.synpbPdcd.hashCode());
		result= prime * result + ((this.actUsgAimDis==null)?0:this.actUsgAimDis.hashCode());
		result= prime * result + ((this.frnrEmptEduYn==null)?0:this.frnrEmptEduYn.hashCode());
		result= prime * result + ((this.fncTrnAimCollDis==null)?0:this.fncTrnAimCollDis.hashCode());
		result= prime * result + ((this.lnoActOpngRsn==null)?0:this.lnoActOpngRsn.hashCode());
		result= prime * result + ((this.depaCrdcCollYn==null)?0:this.depaCrdcCollYn.hashCode());
		result= prime * result + ((this.idCadIsuRqdcUsgYn==null)?0:this.idCadIsuRqdcUsgYn.hashCode());
		result= prime * result + ((this.rcvVcrMlsChidYn==null)?0:this.rcvVcrMlsChidYn.hashCode());
		result= prime * result + ((this.saltsScdDd==null)?0:this.saltsScdDd.hashCode());
		result= prime * result + ((this.atmWdrDscd==null)?0:this.atmWdrDscd.hashCode());
		result= prime * result + ((this.cctnTrnKdcd==null)?0:this.cctnTrnKdcd.hashCode());
		result= prime * result + ((this.idCadIsuYn==null)?0:this.idCadIsuYn.hashCode());
		result= prime * result + ((this.ptnrPrmeIr1Yn==null)?0:this.ptnrPrmeIr1Yn.hashCode());
		result= prime * result + ((this.ptnrPrmeIr2Yn==null)?0:this.ptnrPrmeIr2Yn.hashCode());
		result= prime * result + ((this.ptnrPrmeIr3Yn==null)?0:this.ptnrPrmeIr3Yn.hashCode());
		result= prime * result + ((this.ptnrPrmeIr4Yn==null)?0:this.ptnrPrmeIr4Yn.hashCode());
		result= prime * result + ((this.ascnPbokNm==null)?0:this.ascnPbokNm.hashCode());
		result= prime * result + ((this.rcvpeNm==null)?0:this.rcvpeNm.hashCode());
		result= prime * result + ((this.rcvDd==null)?0:this.rcvDd.hashCode());
		result= prime * result + ((this.dntnAtsEndDt==null)?0:this.dntnAtsEndDt.hashCode());
		result= prime * result + ((this.patnAscnAcno==null)?0:this.patnAscnAcno.hashCode());
		result= prime * result + ((this.patnAscnNm==null)?0:this.patnAscnNm.hashCode());
		result= prime * result + ((this.aimFdNm==null)?0:this.aimFdNm.hashCode());
		result= prime * result + ((this.patnAscnDis==null)?0:this.patnAscnDis.hashCode());
		result= prime * result + ((this.patnHpNo==null)?0:this.patnHpNo.hashCode());
		result= prime * result + ((this.chilRrno==null)?0:this.chilRrno.hashCode());
		result= prime * result + ((this.dntnInfOfrAgrYn==null)?0:this.dntnInfOfrAgrYn.hashCode());
		result= prime * result + ((this.dntnlCd==null)?0:this.dntnlCd.hashCode());
		result= prime * result + ((this.clsaAtsRqYn==null)?0:this.clsaAtsRqYn.hashCode());
		result= prime * result + ((this.clsaAtsPmnyAcno==null)?0:this.clsaAtsPmnyAcno.hashCode());
		result= prime * result + ((this.clsaAtsEndDt==null)?0:this.clsaAtsEndDt.hashCode());
		result= prime * result + ((this.fncTaxtSmsRqYn==null)?0:this.fncTaxtSmsRqYn.hashCode());
		result= prime * result + ((this.wfFclUnqNo==null)?0:this.wfFclUnqNo.hashCode());
		result= prime * result + ((this.locaPrmeYn==null)?0:this.locaPrmeYn.hashCode());
		result= prime * result + ((this.afiBzcd==null)?0:this.afiBzcd.hashCode());
		result= prime * result + ((this.emlNtcSrvcYn==null)?0:this.emlNtcSrvcYn.hashCode());
		result= prime * result + ((this.fmbkCtrdCollYn==null)?0:this.fmbkCtrdCollYn.hashCode());
		result= prime * result + ((this.adrpRgsYn==null)?0:this.adrpRgsYn.hashCode());
		result= prime * result + ((this.mbhYn==null)?0:this.mbhYn.hashCode());
		result= prime * result + ((this.psnInfAgrYn==null)?0:this.psnInfAgrYn.hashCode());
		result= prime * result + ((this.datAcldHpNo==null)?0:this.datAcldHpNo.hashCode());
		result= prime * result + ((this.dpsBatRqsNo==null)?0:this.dpsBatRqsNo.hashCode());
		result= prime * result + ((this.dpsBatRqsSrno==null)?0:this.dpsBatRqsSrno.hashCode());
		result= prime * result + ((this.agnpeEncyRrno==null)?0:this.agnpeEncyRrno.hashCode());
		result= prime * result + ((this.agnpeFnm==null)?0:this.agnpeFnm.hashCode());
		result= prime * result + ((this.rppeDupOmitYn==null)?0:this.rppeDupOmitYn.hashCode());
		result= prime * result + ((this.rppeAgnpeAcrdYn==null)?0:this.rppeAgnpeAcrdYn.hashCode());
		result= prime * result + ((this.rppeFnm==null)?0:this.rppeFnm.hashCode());
		result= prime * result + ((this.rppeEncyRrno==null)?0:this.rppeEncyRrno.hashCode());
		result= prime * result + ((this.agnpeDupYn==null)?0:this.agnpeDupYn.hashCode());
		result= prime * result + ((this.rppeDupYn==null)?0:this.rppeDupYn.hashCode());
		result= prime * result + ((this.itpyMecd==null)?0:this.itpyMecd.hashCode());
		result= prime * result + ((this.itpyCycd==null)?0:this.itpyCycd.hashCode());
		result= prime * result + ((this.nextItpyDt==null)?0:this.nextItpyDt.hashCode());
		result= prime * result + ((this.actMngBrcd==null)?0:this.actMngBrcd.hashCode());
		result= prime * result + ((this.asscNmnlDpstYn==null)?0:this.asscNmnlDpstYn.hashCode());
		result= prime * result + ((this.netrApvNo==null)?0:this.netrApvNo.hashCode());
		result= prime * result + ((this.mbpbkJnngYn==null)?0:this.mbpbkJnngYn.hashCode());
		result= prime * result + ((this.mblPbokInetBnkgId==null)?0:this.mblPbokInetBnkgId.hashCode());
		result= prime * result + ((this.npbokIccadIsuDis==null)?0:this.npbokIccadIsuDis.hashCode());
		result= prime * result + ((this.ideedCd==null)?0:this.ideedCd.hashCode());
		result= prime * result + ((this.pbokEngPrngYn==null)?0:this.pbokEngPrngYn.hashCode());
		result= prime * result + ((this.nlDscd==null)?0:this.nlDscd.hashCode());
		result= prime * result + ((this.dpsDeedNo==null)?0:this.dpsDeedNo.hashCode());
		result= prime * result + ((this.pbokIssuYn==null)?0:this.pbokIssuYn.hashCode());
		result= prime * result + ((this.prdGdncPbokPrngYn==null)?0:this.prdGdncPbokPrngYn.hashCode());
		result= prime * result + ((this.nrsrCnfDocCollYn==null)?0:this.nrsrCnfDocCollYn.hashCode());
		result= prime * result + ((this.bokStttPermXtYn==null)?0:this.bokStttPermXtYn.hashCode());
		result= prime * result + ((this.nrsrPwnoRgsYn==null)?0:this.nrsrPwnoRgsYn.hashCode());
		result= prime * result + ((this.nrsrAccCd==null)?0:this.nrsrAccCd.hashCode());
		result= prime * result + ((this.krwDpsAccDscd==null)?0:this.krwDpsAccDscd.hashCode());
		result= prime * result + ((this.nrsrKrwInfwDscd==null)?0:this.nrsrKrwInfwDscd.hashCode());
		result= prime * result + ((this.txprDscd==null)?0:this.txprDscd.hashCode());
		result= prime * result + ((this.txprLmtAm==null)?0:this.txprLmtAm.hashCode());
		result= prime * result + ((this.prchAm==null)?0:this.prchAm.hashCode());
		result= prime * result + ((this.pmbilAm==null)?0:this.pmbilAm.hashCode());
		result= prime * result + ((this.cackAm==null)?0:this.cackAm.hashCode());
		result= prime * result + ((this.bokBchkAm==null)?0:this.bokBchkAm.hashCode());
		result= prime * result + ((this.etcDeedAm==null)?0:this.etcDeedAm.hashCode());
		result= prime * result + ((this.fncTrnAimCd==null)?0:this.fncTrnAimCd.hashCode());
		result= prime * result + ((this.trnFdSrcCd==null)?0:this.trnFdSrcCd.hashCode());
		result= prime * result + ((this.fdOwpeYn==null)?0:this.fdOwpeYn.hashCode());
		result= prime * result + ((this.fncTrnAimTxt==null)?0:this.fncTrnAimTxt.hashCode());
		result= prime * result + ((this.trnFdSrcCdTxt==null)?0:this.trnFdSrcCdTxt.hashCode());
		result= prime * result + ((this.ckbilKdcd==null)?0:this.ckbilKdcd.hashCode());
		result= prime * result + ((this.cacGramRcvYn==null)?0:this.cacGramRcvYn.hashCode());
		result= prime * result + ((this.cacGramRcvCrtdIsuYn==null)?0:this.cacGramRcvCrtdIsuYn.hashCode());
		result= prime * result + ((this.cacGramRcvAm==null)?0:this.cacGramRcvAm.hashCode());
		result= prime * result + ((this.cacGramTrfAm==null)?0:this.cacGramTrfAm.hashCode());
		result= prime * result + ((this.cacGramBchkAm==null)?0:this.cacGramBchkAm.hashCode());
		result= prime * result + ((this.feeRcvYn==null)?0:this.feeRcvYn.hashCode());
		result= prime * result + ((this.feeCshtfDscd==null)?0:this.feeCshtfDscd.hashCode());
		result= prime * result + ((this.rctsOupYn==null)?0:this.rctsOupYn.hashCode());
		result= prime * result + ((this.feeAm==null)?0:this.feeAm.hashCode());
		result= prime * result + ((this.wdrAcno==null)?0:this.wdrAcno.hashCode());
		result= prime * result + ((this.encyWdrActPwno==null)?0:this.encyWdrActPwno.hashCode());
		result= prime * result + ((this.xprRcvAcno==null)?0:this.xprRcvAcno.hashCode());
		result= prime * result + ((this.irprmTgt1Dscd==null)?0:this.irprmTgt1Dscd.hashCode());
		result= prime * result + ((this.irprmTgt2Dscd==null)?0:this.irprmTgt2Dscd.hashCode());
		result= prime * result + ((this.irprmTgt3Dscd==null)?0:this.irprmTgt3Dscd.hashCode());
		result= prime * result + ((this.irprmTgt4Dscd==null)?0:this.irprmTgt4Dscd.hashCode());
		result= prime * result + ((this.irprmTgt5Dscd==null)?0:this.irprmTgt5Dscd.hashCode());
		result= prime * result + ((this.irprmTgt6Dscd==null)?0:this.irprmTgt6Dscd.hashCode());
		result= prime * result + ((this.xprPrcMecd==null)?0:this.xprPrcMecd.hashCode());
		result= prime * result + ((this.dntnAtsAcno==null)?0:this.dntnAtsAcno.hashCode());
		result= prime * result + ((this.newFdDscd==null)?0:this.newFdDscd.hashCode());
		result= prime * result + ((this.spcfMonyTrtAcno==null)?0:this.spcfMonyTrtAcno.hashCode());
		result= prime * result + ((this.pnsnPayTemEstYn==null)?0:this.pnsnPayTemEstYn.hashCode());
		result= prime * result + ((this.pnsnPayCtrtmYcnt==null)?0:this.pnsnPayCtrtmYcnt.hashCode());
		result= prime * result + ((this.pnsnPayCycd==null)?0:this.pnsnPayCycd.hashCode());
		result= prime * result + ((this.lnoActPbokIssuYn==null)?0:this.lnoActPbokIssuYn.hashCode());
		result= prime * result + ((this.bscAcno==null)?0:this.bscAcno.hashCode());
		result= prime * result + ((this.oldAtrbXtRncd==null)?0:this.oldAtrbXtRncd.hashCode());
		result= prime * result + ((this.cpblChckTgtYn==null)?0:this.cpblChckTgtYn.hashCode());
		result= prime * result + ((this.rpcmDpstTgtYn==null)?0:this.rpcmDpstTgtYn.hashCode());
		result= prime * result + ((this.oldAtrbCeoRgsrDrtrYn==null)?0:this.oldAtrbCeoRgsrDrtrYn.hashCode());
		result= prime * result + ((this.oldAtrbApvNo==null)?0:this.oldAtrbApvNo.hashCode());
		result= prime * result + ((this.rdepAcno==null)?0:this.rdepAcno.hashCode());
		result= prime * result + ((this.oldAtrbApvRsn==null)?0:this.oldAtrbApvRsn.hashCode());
		result= prime * result + ((this.oldAtrbChckTim==null)?0:this.oldAtrbChckTim.hashCode());
		result= prime * result + ((this.ccadRsltInqYn==null)?0:this.ccadRsltInqYn.hashCode());
		result= prime * result + ((this.tbkCcadHldgYn==null)?0:this.tbkCcadHldgYn.hashCode());
		result= prime * result + ((this.cadStlActTbkYn==null)?0:this.cadStlActTbkYn.hashCode());
		result= prime * result + ((this.ccadBasRsltAm==null)?0:this.ccadBasRsltAm.hashCode());
		result= prime * result + ((this.utzRsltBasStaDt==null)?0:this.utzRsltBasStaDt.hashCode());
		result= prime * result + ((this.utzRsltBasEndDt==null)?0:this.utzRsltBasEndDt.hashCode());
		result= prime * result + ((this.utzRsltInqTim==null)?0:this.utzRsltInqTim.hashCode());
		result= prime * result + ((this.amfRispeDis==null)?0:this.amfRispeDis.hashCode());
		result= prime * result + ((this.amfRispeFnm==null)?0:this.amfRispeFnm.hashCode());
		result= prime * result + ((this.amfRispeRrno==null)?0:this.amfRispeRrno.hashCode());
		result= prime * result + ((this.amfRispeCnad==null)?0:this.amfRispeCnad.hashCode());
		result= prime * result + ((this.anrvNprcYn==null)?0:this.anrvNprcYn.hashCode());
		result= prime * result + ((this.pbamAcno==null)?0:this.pbamAcno.hashCode());
		result= prime * result + ((this.pbamSnnmAcno==null)?0:this.pbamSnnmAcno.hashCode());
		result= prime * result + ((this.pmnyTrnUnqNo==null)?0:this.pmnyTrnUnqNo.hashCode());
		result= prime * result + ((this.ctrtmMcn==null)?0:this.ctrtmMcn.hashCode());
		result= prime * result + ((this.ctrtmDcnt==null)?0:this.ctrtmDcnt.hashCode());
		result= prime * result + ((this.xprDt==null)?0:this.xprDt.hashCode());
		result= prime * result + ((this.rcknDt==null)?0:this.rcknDt.hashCode());
		result= prime * result + ((this.encyAtsActPwno==null)?0:this.encyAtsActPwno.hashCode());
		result= prime * result + ((this.atsCycd==null)?0:this.atsCycd.hashCode());
		result= prime * result + ((this.atsStaDt==null)?0:this.atsStaDt.hashCode());
		result= prime * result + ((this.atsEndDt==null)?0:this.atsEndDt.hashCode());
		result= prime * result + ((this.atsCucd==null)?0:this.atsCucd.hashCode());
		result= prime * result + ((this.atsDd==null)?0:this.atsDd.hashCode());
		result= prime * result + ((this.atsMecn==null)?0:this.atsMecn.hashCode());
		result= prime * result + ((this.atsAcno==null)?0:this.atsAcno.hashCode());
		result= prime * result + ((this.atsAm==null)?0:this.atsAm.hashCode());
		result= prime * result + ((this.tbkSltCopCd==null)?0:this.tbkSltCopCd.hashCode());
		result= prime * result + ((this.tbkSltCopOfemYn==null)?0:this.tbkSltCopOfemYn.hashCode());
		result= prime * result + ((this.dntnRqYn==null)?0:this.dntnRqYn.hashCode());
		result= prime * result + ((this.dntnAmDscd==null)?0:this.dntnAmDscd.hashCode());
		result= prime * result + ((this.dntnAm==null)?0:this.dntnAm.hashCode());
		result= prime * result + ((this.xprCancRcvAcno==null)?0:this.xprCancRcvAcno.hashCode());
		result= prime * result + ((this.bchrCponNo==null)?0:this.bchrCponNo.hashCode());
		result= prime * result + ((this.bchrSupAm==null)?0:this.bchrSupAm.hashCode());
		result= prime * result + ((this.bchrCusPidAm==null)?0:this.bchrCusPidAm.hashCode());
		result= prime * result + ((this.apvNo==null)?0:this.apvNo.hashCode());
		result= prime * result + ((this.cponCrtfNo==null)?0:this.cponCrtfNo.hashCode());
		result= prime * result + ((this.autoRdepYn==null)?0:this.autoRdepYn.hashCode());
		result= prime * result + ((this.insuJnngAgrYn==null)?0:this.insuJnngAgrYn.hashCode());
		result= prime * result + ((this.jnngTgtDscd==null)?0:this.jnngTgtDscd.hashCode());
		result= prime * result + ((this.ccadHldgYn==null)?0:this.ccadHldgYn.hashCode());
		result= prime * result + ((this.frcsDshgDt==null)?0:this.frcsDshgDt.hashCode());
		result= prime * result + ((this.cusDgnPrdNm==null)?0:this.cusDgnPrdNm.hashCode());
		result= prime * result + ((this.xcoCd==null)?0:this.xcoCd.hashCode());
		result= prime * result + ((this.frndAcno==null)?0:this.frndAcno.hashCode());
		result= prime * result + ((this.spdtDgnMm==null)?0:this.spdtDgnMm.hashCode());
		result= prime * result + ((this.spdtDgnDd==null)?0:this.spdtDgnDd.hashCode());
		result= prime * result + ((this.aplIr==null)?0:this.aplIr.hashCode());
		result= prime * result + ((this.emlFpAcblNtfcRqYn==null)?0:this.emlFpAcblNtfcRqYn.hashCode());
		result= prime * result + ((this.emlFpAcblNtfcBsdt==null)?0:this.emlFpAcblNtfcBsdt.hashCode());
		result= prime * result + ((this.fpPrftRtSmsNtfcRqYn==null)?0:this.fpPrftRtSmsNtfcRqYn.hashCode());
		result= prime * result + ((this.fpPrftRtSmsNtfcBsdt==null)?0:this.fpPrftRtSmsNtfcBsdt.hashCode());
		result= prime * result + ((this.goalPrSmsRqYn==null)?0:this.goalPrSmsRqYn.hashCode());
		result= prime * result + ((this.goalPr==null)?0:this.goalPr.hashCode());
		result= prime * result + ((this.alwPr==null)?0:this.alwPr.hashCode());
		result= prime * result + ((this.gBnkgGoalPrftRtDscd==null)?0:this.gBnkgGoalPrftRtDscd.hashCode());
		result= prime * result + ((this.gBnkgAlwLossDscd==null)?0:this.gBnkgAlwLossDscd.hashCode());
		result= prime * result + ((this.fcPsklUseYn==null)?0:this.fcPsklUseYn.hashCode());
		result= prime * result + ((this.xrtTsTycd==null)?0:this.xrtTsTycd.hashCode());
		result= prime * result + ((this.xrtMaxAcldAm==null)?0:this.xrtMaxAcldAm.hashCode());
		result= prime * result + ((this.dgnXrtNtfcSrvcDscd==null)?0:this.dgnXrtNtfcSrvcDscd.hashCode());
		result= prime * result + ((this.ntfcSrvcDgnXrt==null)?0:this.ntfcSrvcDgnXrt.hashCode());
		result= prime * result + ((this.ovtbCdno==null)?0:this.ovtbCdno.hashCode());
		result= prime * result + ((this.fmbkCoNo==null)?0:this.fmbkCoNo.hashCode());
		result= prime * result + ((this.atrnDscd==null)?0:this.atrnDscd.hashCode());
		result= prime * result + ((this.rvactNo==null)?0:this.rvactNo.hashCode());
		result= prime * result + ((this.irRotCycd==null)?0:this.irRotCycd.hashCode());
		result= prime * result + ((this.fcfndInfwDscd==null)?0:this.fcfndInfwDscd.hashCode());
		result= prime * result + ((this.fcDpsAccDscd==null)?0:this.fcDpsAccDscd.hashCode());
		result= prime * result + ((this.fornXchStttCrtcSbmtDis==null)?0:this.fornXchStttCrtcSbmtDis.hashCode());
		result= prime * result + ((this.fxRapRncd==null)?0:this.fxRapRncd.hashCode());
		result= prime * result + ((this.payRncdCfcd==null)?0:this.payRncdCfcd.hashCode());
		result= prime * result + ((this.hsCd==null)?0:this.hsCd.hashCode());
		result= prime * result + ((this.ivpeId==null)?0:this.ivpeId.hashCode());
		result= prime * result + ((this.secrComNm==null)?0:this.secrComNm.hashCode());
		result= prime * result + ((this.fcApvCd==null)?0:this.fcApvCd.hashCode());
		result= prime * result + ((this.pnsnAcldCtrYcnt==null)?0:this.pnsnAcldCtrYcnt.hashCode());
		result= prime * result + ((this.pnsnAcldCtrMcn==null)?0:this.pnsnAcldCtrMcn.hashCode());
		result= prime * result + ((this.pnsnRcveBgnDt==null)?0:this.pnsnRcveBgnDt.hashCode());
		result= prime * result + ((this.prftRtRptdSndDscd==null)?0:this.prftRtRptdSndDscd.hashCode());
		result= prime * result + ((this.rprhLnkNewYn==null)?0:this.rprhLnkNewYn.hashCode());
		result= prime * result + ((this.rprhLnkCancAcno==null)?0:this.rprhLnkCancAcno.hashCode());
		result= prime * result + ((this.rprhLnkTamNewYn==null)?0:this.rprhLnkTamNewYn.hashCode());
		result= prime * result + ((this.afepAddPidYn==null)?0:this.afepAddPidYn.hashCode());
		result= prime * result + ((this.fndPdcd==null)?0:this.fndPdcd.hashCode());
		result= prime * result + ((this.fndScntRqdcNprtYn==null)?0:this.fndScntRqdcNprtYn.hashCode());
		result= prime * result + ((this.opgPtsNtcSndDscd==null)?0:this.opgPtsNtcSndDscd.hashCode());
		result= prime * result + ((this.gBnkgGoalPrftRtPsnb==null)?0:this.gBnkgGoalPrftRtPsnb.hashCode());
		result= prime * result + ((this.gBnkgGoalPrftRtDcml==null)?0:this.gBnkgGoalPrftRtDcml.hashCode());
		result= prime * result + ((this.gBnkgAlwLossRtPsnb==null)?0:this.gBnkgAlwLossRtPsnb.hashCode());
		result= prime * result + ((this.gBnkgAlwLossRtDcml==null)?0:this.gBnkgAlwLossRtDcml.hashCode());
		result= prime * result + ((this.wooriOnwlMoAcno==null)?0:this.wooriOnwlMoAcno.hashCode());
		result= prime * result + ((this.bznUseActYn==null)?0:this.bznUseActYn.hashCode());
		result= prime * result + ((this.agnpeItcsno==null)?0:this.agnpeItcsno.hashCode());
		result= prime * result + ((this.rppeItcsno==null)?0:this.rppeItcsno.hashCode());
		result= prime * result + ((this.atsNaNtfcRqYn==null)?0:this.atsNaNtfcRqYn.hashCode());
		result= prime * result + ((this.acldFndTsXprNtfcRqYn==null)?0:this.acldFndTsXprNtfcRqYn.hashCode());
		result= prime * result + ((this.fwxcAcno==null)?0:this.fwxcAcno.hashCode());
		result= prime * result + ((this.fndCnvrTmntAcno==null)?0:this.fndCnvrTmntAcno.hashCode());
		result= prime * result + ((this.dvdamRinvDscd==null)?0:this.dvdamRinvDscd.hashCode());
		result= prime * result + ((this.fndCnvrNewYn==null)?0:this.fndCnvrNewYn.hashCode());
		result= prime * result + ((this.lonXprAdvnYn==null)?0:this.lonXprAdvnYn.hashCode());
		result= prime * result + ((this.lnApvCmplYn==null)?0:this.lnApvCmplYn.hashCode());
		result= prime * result + ((this.priPrpeBrNm==null)?0:this.priPrpeBrNm.hashCode());
		result= prime * result + ((this.grnTrno==null)?0:this.grnTrno.hashCode());
		result= prime * result + ((this.escrUnmrNo==null)?0:this.escrUnmrNo.hashCode());
		result= prime * result + ((this.priPrpeAcno==null)?0:this.priPrpeAcno.hashCode());
		result= prime * result + ((this.prpeAcno==null)?0:this.prpeAcno.hashCode());
		result= prime * result + ((this.priPrpeBzpeNo==null)?0:this.priPrpeBzpeNo.hashCode());
		result= prime * result + ((this.prpeBzpeNo==null)?0:this.prpeBzpeNo.hashCode());
		result= prime * result + ((this.ppmtAmRcveAcno==null)?0:this.ppmtAmRcveAcno.hashCode());
		result= prime * result + ((this.orcpPrpeCsno==null)?0:this.orcpPrpeCsno.hashCode());
		result= prime * result + ((this.pftPrpeCsno==null)?0:this.pftPrpeCsno.hashCode());
		result= prime * result + ((this.orcpPrpeNrsrCollYn==null)?0:this.orcpPrpeNrsrCollYn.hashCode());
		result= prime * result + ((this.pftPrpeNrsrCollYn==null)?0:this.pftPrpeNrsrCollYn.hashCode());
		result= prime * result + ((this.pocpPfeAm==null)?0:this.pocpPfeAm.hashCode());
		result= prime * result + ((this.etfTprt==null)?0:this.etfTprt.hashCode());
		result= prime * result + ((this.opgOrdsTxt==null)?0:this.opgOrdsTxt.hashCode());
		result= prime * result + ((this.sa1Txt==null)?0:this.sa1Txt.hashCode());
		result= prime * result + ((this.sa2Txt==null)?0:this.sa2Txt.hashCode());
		result= prime * result + ((this.sa3Txt==null)?0:this.sa3Txt.hashCode());
		result= prime * result + ((this.sptxYn==null)?0:this.sptxYn.hashCode());
		result= prime * result + ((this.nnmCsno==null)?0:this.nnmCsno.hashCode());
		result= prime * result + ((this.fndItmsCd==null)?0:this.fndItmsCd.hashCode());
		result= prime * result + ((this.dpsRcvAm==null)?0:this.dpsRcvAm.hashCode());
		result= prime * result + ((this.trfAm==null)?0:this.trfAm.hashCode());
		result= prime * result + ((this.bchkAm==null)?0:this.bchkAm.hashCode());
		result= prime * result + ((this.bchkInqmAm==null)?0:this.bchkInqmAm.hashCode());
		result= prime * result + ((this.inqmScnt==null)?0:this.inqmScnt.hashCode());
		result= prime * result + ((this.inqmFeeXmpDis==null)?0:this.inqmFeeXmpDis.hashCode());
		result= prime * result + ((this.tamTrfYn==null)?0:this.tamTrfYn.hashCode());
		result= prime * result + ((this.pxrt==null)?0:this.pxrt.hashCode());
		result= prime * result + ((this.krwTrfAm==null)?0:this.krwTrfAm.hashCode());
		result= prime * result + ((this.cucd==null)?0:this.cucd.hashCode());
		result= prime * result + ((this.ioffSbDscd==null)?0:this.ioffSbDscd.hashCode());
		result= prime * result + ((this.cshtfDscd==null)?0:this.cshtfDscd.hashCode());
		result= prime * result + ((this.cshFeeLevyDscd==null)?0:this.cshFeeLevyDscd.hashCode());
		result= prime * result + ((this.cshFee==null)?0:this.cshFee.hashCode());
		result= prime * result + ((this.tgtKrwAm==null)?0:this.tgtKrwAm.hashCode());
		result= prime * result + ((this.fcTrfAm==null)?0:this.fcTrfAm.hashCode());
		result= prime * result + ((this.fcCshRcvAm==null)?0:this.fcCshRcvAm.hashCode());
		result= prime * result + ((this.coinAm==null)?0:this.coinAm.hashCode());
		result= prime * result + ((this.krfd==null)?0:this.krfd.hashCode());
		result= prime * result + ((this.apxrt==null)?0:this.apxrt.hashCode());
		result= prime * result + ((this.cusPrmeXrt==null)?0:this.cusPrmeXrt.hashCode());
		result= prime * result + ((this.ioffSbRt==null)?0:this.ioffSbRt.hashCode());
		result= prime * result + ((this.fwxcCtrMcnt==null)?0:this.fwxcCtrMcnt.hashCode());
		result= prime * result + ((this.newAcno==null)?0:this.newAcno.hashCode());
		result= prime * result + ((this.ksdFndNo==null)?0:this.ksdFndNo.hashCode());
		result= prime * result + ((this.rtpenTrnDisNo==null)?0:this.rtpenTrnDisNo.hashCode());
		result= prime * result + ((this.rcmGoalAm==null)?0:this.rcmGoalAm.hashCode());
		result= prime * result + ((this.jnngCtgrCd==null)?0:this.jnngCtgrCd.hashCode());
		result= prime * result + ((this.rcpMdKdcd==null)?0:this.rcpMdKdcd.hashCode());
		result= prime * result + ((this.hsscMajTxtPbokPrngYn==null)?0:this.hsscMajTxtPbokPrngYn.hashCode());
		result= prime * result + ((this.prdDesOupYn==null)?0:this.prdDesOupYn.hashCode());
		result= prime * result + ((this.acicJnngYn==null)?0:this.acicJnngYn.hashCode());
		result= prime * result + ((this.hsscNewDscd==null)?0:this.hsscNewDscd.hashCode());
		result= prime * result + ((this.hsscRgslZpno==null)?0:this.hsscRgslZpno.hashCode());
		result= prime * result + ((this.hsscInddRgsYn==null)?0:this.hsscInddRgsYn.hashCode());
		result= prime * result + ((this.hsscHopeRgnZpno==null)?0:this.hsscHopeRgnZpno.hashCode());
		result= prime * result + ((this.hopeHousKdDscd==null)?0:this.hopeHousKdDscd.hashCode());
		result= prime * result + ((this.housXuseSqmDscd==null)?0:this.housXuseSqmDscd.hashCode());
		result= prime * result + ((this.hopeMovinYm==null)?0:this.hopeMovinYm.hashCode());
		result= prime * result + ((this.esnsNewRgsDt==null)?0:this.esnsNewRgsDt.hashCode());
		result= prime * result + ((this.esnsNewRgsTm==null)?0:this.esnsNewRgsTm.hashCode());
		result= prime * result + ((this.esnsNewEbnkUtzpeNo==null)?0:this.esnsNewEbnkUtzpeNo.hashCode());
		result= prime * result + ((this.atsKdcd==null)?0:this.atsKdcd.hashCode());
		result= prime * result + ((this.lnoActOpngRncd==null)?0:this.lnoActOpngRncd.hashCode());
		result= prime * result + ((this.scanInfAcnmCnfDscd==null)?0:this.scanInfAcnmCnfDscd.hashCode());
		result= prime * result + ((this.agnpeTrnYn==null)?0:this.agnpeTrnYn.hashCode());
		result= prime * result + ((this.dpsPwnoRgsDscd==null)?0:this.dpsPwnoRgsDscd.hashCode());
		result= prime * result + ((this.prrRgsPwnoKeyCnf==null)?0:this.prrRgsPwnoKeyCnf.hashCode());
		result= prime * result + ((this.encyActPwnoCnf==null)?0:this.encyActPwnoCnf.hashCode());
		result= prime * result + ((this.wdcPbokYn==null)?0:this.wdcPbokYn.hashCode());
		result= prime * result + ((this.wooriLovPlsDntnAscnDscd==null)?0:this.wooriLovPlsDntnAscnDscd.hashCode());
		result= prime * result + ((this.sameRqdcSrno==null)?0:this.sameRqdcSrno.hashCode());
		result= prime * result + ((this.etcDeedDscd==null)?0:this.etcDeedDscd.hashCode());
		result= prime * result + ((this.actApvNo==null)?0:this.actApvNo.hashCode());
		result= prime * result + ((this.fndRblnNewYn==null)?0:this.fndRblnNewYn.hashCode());
		result= prime * result + ((this.bgnnRcvWdrYn==null)?0:this.bgnnRcvWdrYn.hashCode());
		result= prime * result + ((this.copItcsno==null)?0:this.copItcsno.hashCode());
		result= prime * result + ((this.inbkNewYn==null)?0:this.inbkNewYn.hashCode());
		result= prime * result + ((this.smrtBnkgNewYn==null)?0:this.smrtBnkgNewYn.hashCode());
		result= prime * result + ((this.tlbnkNewYn==null)?0:this.tlbnkNewYn.hashCode());
		result= prime * result + ((this.ntsvcRgsYn==null)?0:this.ntsvcRgsYn.hashCode());
		result= prime * result + ((this.inbkWdrActRgsYn==null)?0:this.inbkWdrActRgsYn.hashCode());
		result= prime * result + ((this.inetBnkgUserId==null)?0:this.inetBnkgUserId.hashCode());
		result= prime * result + ((this.ebnkPwno==null)?0:this.ebnkPwno.hashCode());
		result= prime * result + ((this.engNm==null)?0:this.engNm.hashCode());
		result= prime * result + ((this.tms1TsLmtAm==null)?0:this.tms1TsLmtAm.hashCode());
		result= prime * result + ((this.d1TsLmtAm==null)?0:this.d1TsLmtAm.hashCode());
		result= prime * result + ((this.secrdSrno==null)?0:this.secrdSrno.hashCode());
		result= prime * result + ((this.otpcSrno==null)?0:this.otpcSrno.hashCode());
		result= prime * result + ((this.otpPwd==null)?0:this.otpPwd.hashCode());
		result= prime * result + ((this.otpIsuCostXmpDscd==null)?0:this.otpIsuCostXmpDscd.hashCode());
		result= prime * result + ((this.datDpsTelNo==null)?0:this.datDpsTelNo.hashCode());
		result= prime * result + ((this.synpbDscd==null)?0:this.synpbDscd.hashCode());
		result= prime * result + ((this.inetBnkgRcpSrno==null)?0:this.inetBnkgRcpSrno.hashCode());
		result= prime * result + ((this.inbkRsvRgbrCd==null)?0:this.inbkRsvRgbrCd.hashCode());
		result= prime * result + ((this.inbkRsvRgsDt==null)?0:this.inbkRsvRgsDt.hashCode());
		result= prime * result + ((this.inbkRsvRgsSrno==null)?0:this.inbkRsvRgsSrno.hashCode());
		result= prime * result + ((this.smrtBnkgInetBnkgId==null)?0:this.smrtBnkgInetBnkgId.hashCode());
		result= prime * result + ((this.smrtBnkgHpComCd==null)?0:this.smrtBnkgHpComCd.hashCode());
		result= prime * result + ((this.smrtBnkgHpTlenNo==null)?0:this.smrtBnkgHpTlenNo.hashCode());
		result= prime * result + ((this.smrtBnkgHpSrno==null)?0:this.smrtBnkgHpSrno.hashCode());
		result= prime * result + ((this.tlbnkSecrdSrno==null)?0:this.tlbnkSecrdSrno.hashCode());
		result= prime * result + ((this.encyEbnkPwno==null)?0:this.encyEbnkPwno.hashCode());
		result= prime * result + ((this.tlbnkD1TsLmt==null)?0:this.tlbnkD1TsLmt.hashCode());
		result= prime * result + ((this.tlbnkTms1TsLmt==null)?0:this.tlbnkTms1TsLmt.hashCode());
		result= prime * result + ((this.ntsvcRawDscd==null)?0:this.ntsvcRawDscd.hashCode());
		result= prime * result + ((this.ntsvcBalNtyMarkYn==null)?0:this.ntsvcBalNtyMarkYn.hashCode());
		result= prime * result + ((this.ntsvcHpComCd==null)?0:this.ntsvcHpComCd.hashCode());
		result= prime * result + ((this.ntsvcHpTlenNo==null)?0:this.ntsvcHpTlenNo.hashCode());
		result= prime * result + ((this.ntsvcHpSrno==null)?0:this.ntsvcHpSrno.hashCode());
		result= prime * result + ((this.ntsvcInotAm==null)?0:this.ntsvcInotAm.hashCode());
		result= prime * result + ((this.astPrtsNtcYn==null)?0:this.astPrtsNtcYn.hashCode());
		result= prime * result + ((this.ntsvcTmsStaTim==null)?0:this.ntsvcTmsStaTim.hashCode());
		result= prime * result + ((this.ntsvcTmsEndTim==null)?0:this.ntsvcTmsEndTim.hashCode());
		result= prime * result + ((this.wdrActRgsInetBnkgId==null)?0:this.wdrActRgsInetBnkgId.hashCode());
		result= prime * result + ((this.ebnkWdrActCnccRgsYn==null)?0:this.ebnkWdrActCnccRgsYn.hashCode());
		result= prime * result + ((this.tlbnkWdrActCnccRgsYn==null)?0:this.tlbnkWdrActCnccRgsYn.hashCode());
		result= prime * result + ((this.hswfPbokDocSndYn==null)?0:this.hswfPbokDocSndYn.hashCode());
		result= prime * result + ((this.faOwacCsno==null)?0:this.faOwacCsno.hashCode());
		result= prime * result + ((this.flieRgsYn==null)?0:this.flieRgsYn.hashCode());
		result= prime * result + ((this.atsYn==null)?0:this.atsYn.hashCode());
		result= prime * result + ((this.hmnyUsgAm==null)?0:this.hmnyUsgAm.hashCode());
		result= prime * result + ((this.etcAcno==null)?0:this.etcAcno.hashCode());
		result= prime * result + ((this.trtpyRtPsnb==null)?0:this.trtpyRtPsnb.hashCode());
		result= prime * result + ((this.trtpyRtDcml==null)?0:this.trtpyRtDcml.hashCode());
		result= prime * result + ((this.fltIrNtcDscd==null)?0:this.fltIrNtcDscd.hashCode());
		result= prime * result + ((this.etpCoplsDpstNewYn==null)?0:this.etpCoplsDpstNewYn.hashCode());
		result= prime * result + ((this.atsXtYn==null)?0:this.atsXtYn.hashCode());
		result= prime * result + ((this.spslPdcd==null)?0:this.spslPdcd.hashCode());
		result= prime * result + ((this.trtPocpPfeRtPsnb==null)?0:this.trtPocpPfeRtPsnb.hashCode());
		result= prime * result + ((this.trtPocpPfeRtDcml==null)?0:this.trtPocpPfeRtDcml.hashCode());
		result= prime * result + ((this.trtDfanPfeRtPsnb==null)?0:this.trtDfanPfeRtPsnb.hashCode());
		result= prime * result + ((this.trtDfanPfeRtDcml==null)?0:this.trtDfanPfeRtDcml.hashCode());
		result= prime * result + ((this.cponInpDscd==null)?0:this.cponInpDscd.hashCode());
		result= prime * result + ((this.agmIrtPsnb==null)?0:this.agmIrtPsnb.hashCode());
		result= prime * result + ((this.agmIrtDcml==null)?0:this.agmIrtDcml.hashCode());
		result= prime * result + ((this.pbokOtln==null)?0:this.pbokOtln.hashCode());
		result= prime * result + ((this.ascnBlgCd==null)?0:this.ascnBlgCd.hashCode());
		result= prime * result + ((this.acldCrtdSndDscd==null)?0:this.acldCrtdSndDscd.hashCode());
		result= prime * result + ((this.isaMajSbjPbokPrngYn==null)?0:this.isaMajSbjPbokPrngYn.hashCode());
		result= prime * result + ((this.isaNewDscd==null)?0:this.isaNewDscd.hashCode());
		result= prime * result + ((this.isaJnngDscd==null)?0:this.isaJnngDscd.hashCode());
		result= prime * result + ((this.jnngAdvpeEno==null)?0:this.jnngAdvpeEno.hashCode());
		result= prime * result + ((this.extxDscd==null)?0:this.extxDscd.hashCode());
		result= prime * result + ((this.dtjnTemDscd==null)?0:this.dtjnTemDscd.hashCode());
		result= prime * result + ((this.mndDocCollYn==null)?0:this.mndDocCollYn.hashCode());
		result= prime * result + ((this.enmtDt==null)?0:this.enmtDt.hashCode());
		result= prime * result + ((this.dshgDt==null)?0:this.dshgDt.hashCode());
		result= prime * result + ((this.ctrmvIscd==null)?0:this.ctrmvIscd.hashCode());
		result= prime * result + ((this.rtrtInsuCnvrAm==null)?0:this.rtrtInsuCnvrAm.hashCode());
		result= prime * result + ((this.aldJnpeTycd==null)?0:this.aldJnpeTycd.hashCode());
		result= prime * result + ((this.fstJnngDt==null)?0:this.fstJnngDt.hashCode());
		result= prime * result + ((this.tfrAcno==null)?0:this.tfrAcno.hashCode());
		result= prime * result + ((this.planNo==null)?0:this.planNo.hashCode());
		result= prime * result + ((this.brdmKdcd==null)?0:this.brdmKdcd.hashCode());
		result= prime * result + ((this.scdOrdsMngNo==null)?0:this.scdOrdsMngNo.hashCode());
		result= prime * result + ((this.rtpenCobdnAm==null)?0:this.rtpenCobdnAm.hashCode());
		result= prime * result + ((this.rtpenPbdnAm==null)?0:this.rtpenPbdnAm.hashCode());
		result= prime * result + ((this.opgMngFee==null)?0:this.opgMngFee.hashCode());
		result= prime * result + ((this.asetMngFee==null)?0:this.asetMngFee.hashCode());
		result= prime * result + ((this.stlAcno==null)?0:this.stlAcno.hashCode());
		result= prime * result + ((this.encyStlActPwno==null)?0:this.encyStlActPwno.hashCode());
		result= prime * result + ((this.afepAddPidDscd==null)?0:this.afepAddPidDscd.hashCode());
		result= prime * result + ((this.rprhLnkNewDscd==null)?0:this.rprhLnkNewDscd.hashCode());
		result= prime * result + ((this.cancRsvFndAcno==null)?0:this.cancRsvFndAcno.hashCode());
		result= prime * result + ((this.rprhAmTamNewDscd==null)?0:this.rprhAmTamNewDscd.hashCode());
		result= prime * result + ((this.xcoPrmeIrt==null)?0:this.xcoPrmeIrt.hashCode());
		result= prime * result + ((this.fndGoalPrftRtPsnb==null)?0:this.fndGoalPrftRtPsnb.hashCode());
		result= prime * result + ((this.fndGoalPrftRtDcml==null)?0:this.fndGoalPrftRtDcml.hashCode());
		result= prime * result + ((this.srvcRqAm==null)?0:this.srvcRqAm.hashCode());
		result= prime * result + ((this.fndAcblNtcDis==null)?0:this.fndAcblNtcDis.hashCode());
		result= prime * result + ((this.fndAcblNtfcBasDd==null)?0:this.fndAcblNtfcBasDd.hashCode());
		result= prime * result + ((this.fndPrftRtSmsChrRqDscd==null)?0:this.fndPrftRtSmsChrRqDscd.hashCode());
		result= prime * result + ((this.fndSmsRqTprtPsnb==null)?0:this.fndSmsRqTprtPsnb.hashCode());
		result= prime * result + ((this.fndSmsRqTprtDcml==null)?0:this.fndSmsRqTprtDcml.hashCode());
		result= prime * result + ((this.fndSmsRqTprtDscd==null)?0:this.fndSmsRqTprtDscd.hashCode());
		result= prime * result + ((this.fndSmsRqLossAwrtPsnb==null)?0:this.fndSmsRqLossAwrtPsnb.hashCode());
		result= prime * result + ((this.fndSmsRqLossAwrtDcml==null)?0:this.fndSmsRqLossAwrtDcml.hashCode());
		result= prime * result + ((this.fndSmsRqLossAwrtDscd==null)?0:this.fndSmsRqLossAwrtDscd.hashCode());
		result= prime * result + ((this.fndFpPrftRtSmsChrRqDscd==null)?0:this.fndFpPrftRtSmsChrRqDscd.hashCode());
		result= prime * result + ((this.fndFpPrftRtSmsChrRqDtDscd==null)?0:this.fndFpPrftRtSmsChrRqDtDscd.hashCode());
		result= prime * result + ((this.scntRqdcPrngOmitYn==null)?0:this.scntRqdcPrngOmitYn.hashCode());
		result= prime * result + ((this.oldAtrbChckHisSrno==null)?0:this.oldAtrbChckHisSrno.hashCode());
		result= prime * result + ((this.newVstrMngNo==null)?0:this.newVstrMngNo.hashCode());
		result= prime * result + ((this.payVstrMngNo==null)?0:this.payVstrMngNo.hashCode());
		result= prime * result + ((this.spotTfrRtpenPrdNo==null)?0:this.spotTfrRtpenPrdNo.hashCode());
		result= prime * result + ((this.rtttIscd==null)?0:this.rtttIscd.hashCode());
		result= prime * result + ((this.spotTfrRtpenPlanDscd==null)?0:this.spotTfrRtpenPlanDscd.hashCode());
		result= prime * result + ((this.intRcvFcAcno==null)?0:this.intRcvFcAcno.hashCode());
		result= prime * result + ((this.pbdeedPrngYn==null)?0:this.pbdeedPrngYn.hashCode());
		result= prime * result + ((this.dgnXrtPsnb==null)?0:this.dgnXrtPsnb.hashCode());
		result= prime * result + ((this.dgnXrtDcml==null)?0:this.dgnXrtDcml.hashCode());
		result= prime * result + ((this.mkshMbhYn==null)?0:this.mkshMbhYn.hashCode());
		result= prime * result + ((this.asstmPbokDscd==null)?0:this.asstmPbokDscd.hashCode());
		result= prime * result + ((this.wbbtJnngHpNo==null)?0:this.wbbtJnngHpNo.hashCode());
		result= prime * result + ((this.prdOpgDscd==null)?0:this.prdOpgDscd.hashCode());
		result= prime * result + ((this.newInqYn==null)?0:this.newInqYn.hashCode());
		result= prime * result + ((this.pwnoNuseYn==null)?0:this.pwnoNuseYn.hashCode());
		result= prime * result + ((this.bchrInqTim==null)?0:this.bchrInqTim.hashCode());
		result= prime * result + ((this.bchrNewAvlYn==null)?0:this.bchrNewAvlYn.hashCode());
		result= prime * result + ((this.prdMajTxtPbokPrngYn==null)?0:this.prdMajTxtPbokPrngYn.hashCode());
		result= prime * result + ((this.apirtPsnb==null)?0:this.apirtPsnb.hashCode());
		result= prime * result + ((this.apirtDcml==null)?0:this.apirtDcml.hashCode());
		result= prime * result + ((this.hqapNo==null)?0:this.hqapNo.hashCode());
		result= prime * result + ((this.acnmCsno==null)?0:this.acnmCsno.hashCode());
		result= prime * result + ((this.fcbdNewYn==null)?0:this.fcbdNewYn.hashCode());
		result= prime * result + ((this.irKdcd==null)?0:this.irKdcd.hashCode());
		result= prime * result + ((this.efctPrftRtPsnb==null)?0:this.efctPrftRtPsnb.hashCode());
		result= prime * result + ((this.efctPrftRtDcml==null)?0:this.efctPrftRtDcml.hashCode());
		result= prime * result + ((this.vrBilNewDscd==null)?0:this.vrBilNewDscd.hashCode());
		result= prime * result + ((this.istIvpeBatNewTrnDscd==null)?0:this.istIvpeBatNewTrnDscd.hashCode());
		result= prime * result + ((this.dppeCsno==null)?0:this.dppeCsno.hashCode());
		result= prime * result + ((this.dppeActIdfNo==null)?0:this.dppeActIdfNo.hashCode());
		result= prime * result + ((this.dpsBatNewBzcd==null)?0:this.dpsBatNewBzcd.hashCode());
		result= prime * result + ((this.ascnNewRprsAcno==null)?0:this.ascnNewRprsAcno.hashCode());
		result= prime * result + ((this.ascnNewRprsActYn==null)?0:this.ascnNewRprsActYn.hashCode());
		result= prime * result + ((this.pbamActAcctYy==null)?0:this.pbamActAcctYy.hashCode());
		result= prime * result + ((this.pmnySnnmActAcctYy==null)?0:this.pmnySnnmActAcctYy.hashCode());
		result= prime * result + ((this.hsscOwhmAdrKdcd==null)?0:this.hsscOwhmAdrKdcd.hashCode());
		result= prime * result + ((this.hsscOwhmBldMngNo==null)?0:this.hsscOwhmBldMngNo.hashCode());
		result= prime * result + ((this.hsscOwhmPostSrno==null)?0:this.hsscOwhmPostSrno.hashCode());
		result= prime * result + ((this.hsscOwhmStdoNo==null)?0:this.hsscOwhmStdoNo.hashCode());
		result= prime * result + ((this.agmtCoCd==null)?0:this.agmtCoCd.hashCode());
		result= prime * result + ((this.wooriHopeDremJnngTgtDscd==null)?0:this.wooriHopeDremJnngTgtDscd.hashCode());
		result= prime * result + ((this.asetMngIscd==null)?0:this.asetMngIscd.hashCode());
		result= prime * result + ((this.rpbdDscd==null)?0:this.rpbdDscd.hashCode());
		result= prime * result + ((this.cctnAcno==null)?0:this.cctnAcno.hashCode());
		result= prime * result + ((this.npbdSbsrRqYn==null)?0:this.npbdSbsrRqYn.hashCode());
		result= prime * result + ((this.npbdItmsCd==null)?0:this.npbdItmsCd.hashCode());
		result= prime * result + ((this.bndKdDis==null)?0:this.bndKdDis.hashCode());
		result= prime * result + ((this.tunMmHo==null)?0:this.tunMmHo.hashCode());
		result= prime * result + ((this.hdgTgtYn==null)?0:this.hdgTgtYn.hashCode());
		result= prime * result + ((this.idCadNhssDscd==null)?0:this.idCadNhssDscd.hashCode());
		result= prime * result + ((this.fndPlsOpgDscd==null)?0:this.fndPlsOpgDscd.hashCode());
		result= prime * result + ((this.grnInsuKey==null)?0:this.grnInsuKey.hashCode());
		result= prime * result + ((this.preIntRcvDscd==null)?0:this.preIntRcvDscd.hashCode());
		result= prime * result + ((this.preIntRcvAcno==null)?0:this.preIntRcvAcno.hashCode());
		result= prime * result + ((this.dpsRcmNo==null)?0:this.dpsRcmNo.hashCode());
		result= prime * result + ((this.sldrAldCn==null)?0:this.sldrAldCn.hashCode());
		result= prime * result + ((this.dlpmPbokGenRgsYn==null)?0:this.dlpmPbokGenRgsYn.hashCode());
		result= prime * result + ((this.smrtMchrMdlInf==null)?0:this.smrtMchrMdlInf.hashCode());
		result= prime * result + ((this.wibeeRcvRgsYn==null)?0:this.wibeeRcvRgsYn.hashCode());
		result= prime * result + ((this.wibeeTsAcno==null)?0:this.wibeeTsAcno.hashCode());
		result= prime * result + ((this.wibeePushRgsYn==null)?0:this.wibeePushRgsYn.hashCode());
		result= prime * result + ((this.atsKrwTsAcno==null)?0:this.atsKrwTsAcno.hashCode());
		result= prime * result + ((this.irngBrcd==null)?0:this.irngBrcd.hashCode());
		result= prime * result + ((this.krwFmbkFxpdYn==null)?0:this.krwFmbkFxpdYn.hashCode());
		result= prime * result + ((this.krwSscoFmbkFxpdYn==null)?0:this.krwSscoFmbkFxpdYn.hashCode());
		result= prime * result + ((this.hopeHousXuseSqmDscd==null)?0:this.hopeHousXuseSqmDscd.hashCode());
		result= prime * result + ((this.rrrgMvinDt==null)?0:this.rrrgMvinDt.hashCode());
		result= prime * result + ((this.dppeUnqNo==null)?0:this.dppeUnqNo.hashCode());
		result= prime * result + ((this.dppeItmsNo==null)?0:this.dppeItmsNo.hashCode());
		result= prime * result + ((this.cshbAtsAcno==null)?0:this.cshbAtsAcno.hashCode());
		result= prime * result + ((this.cusDntnAscnCd==null)?0:this.cusDntnAscnCd.hashCode());
		result= prime * result + ((this.cusBrdnCnrnRt==null)?0:this.cusBrdnCnrnRt.hashCode());
		result= prime * result + ((this.dinsvGoalAm==null)?0:this.dinsvGoalAm.hashCode());
		result= prime * result + ((this.txprInqYn==null)?0:this.txprInqYn.hashCode());
		result= prime * result + ((this.frno==null)?0:this.frno.hashCode());
		result= prime * result + ((this.acnmRgsCd==null)?0:this.acnmRgsCd.hashCode());
		result= prime * result + ((this.coaOmitYn==null)?0:this.coaOmitYn.hashCode());
		result= prime * result + ((this.wbbmLnkNewYn==null)?0:this.wbbmLnkNewYn.hashCode());
		result= prime * result + ((this.wbbtRcmRgsHpNo==null)?0:this.wbbtRcmRgsHpNo.hashCode());
		result= prime * result + ((this.smrtLnJnngYn==null)?0:this.smrtLnJnngYn.hashCode());
		result= prime * result + ((this.dinsvDscd==null)?0:this.dinsvDscd.hashCode());
		result= prime * result + ((this.aucId==null)?0:this.aucId.hashCode());
		result= prime * result + ((this.gmktId==null)?0:this.gmktId.hashCode());
		result= prime * result + ((this.wbbmId==null)?0:this.wbbmId.hashCode());
		result= prime * result + ((this.dniAcnmCnfNewDscd==null)?0:this.dniAcnmCnfNewDscd.hashCode());
		result= prime * result + ((this.dniRcvAm==null)?0:this.dniRcvAm.hashCode());
		result= prime * result + ((this.dniHpNo==null)?0:this.dniHpNo.hashCode());
		result= prime * result + ((this.dniPtnAcno==null)?0:this.dniPtnAcno.hashCode());
		result= prime * result + ((this.dniPtnNewAcno==null)?0:this.dniPtnNewAcno.hashCode());
		result= prime * result + ((this.dniPtnbkCd==null)?0:this.dniPtnbkCd.hashCode());
		result= prime * result + ((this.rjnngAcno==null)?0:this.rjnngAcno.hashCode());
		result= prime * result + ((this.insvAcldPlanKdcd==null)?0:this.insvAcldPlanKdcd.hashCode());
		result= prime * result + ((this.insvAcldFstTsAm==null)?0:this.insvAcldFstTsAm.hashCode());
		result= prime * result + ((this.insvAcldTsStaWkdDscd==null)?0:this.insvAcldTsStaWkdDscd.hashCode());
		result= prime * result + ((this.insvAcldTsStaDt==null)?0:this.insvAcldTsStaDt.hashCode());
		result= prime * result + ((this.insvAcldPlanChcYn==null)?0:this.insvAcldPlanChcYn.hashCode());
		result= prime * result + ((this.insvAcldPlanLifeAm==null)?0:this.insvAcldPlanLifeAm.hashCode());
		result= prime * result + ((this.pidMecd==null)?0:this.pidMecd.hashCode());
		result= prime * result + ((this.selcMvbDtlsIdfCd==null)?0:this.selcMvbDtlsIdfCd.hashCode());
		result= prime * result + ((this.ptnBkwAcno==null)?0:this.ptnBkwAcno.hashCode());
		result= prime * result + ((this.ptnSelcIscd==null)?0:this.ptnSelcIscd.hashCode());
		result= prime * result + ((this.fndslcMvbCfdocIsuDt==null)?0:this.fndslcMvbCfdocIsuDt.hashCode());
		result= prime * result + ((this.taxTycd==null)?0:this.taxTycd.hashCode());
		result= prime * result + ((this.rprhAfImnwYn==null)?0:this.rprhAfImnwYn.hashCode());
		result= prime * result + ((this.elfSelfDgnsYn==null)?0:this.elfSelfDgnsYn.hashCode());
		result= prime * result + ((this.wmsPrtfDis==null)?0:this.wmsPrtfDis.hashCode());
		result= prime * result + ((this.ptnIstCnfYn==null)?0:this.ptnIstCnfYn.hashCode());
		result= prime * result + ((this.ivsdesSrno==null)?0:this.ivsdesSrno.hashCode());
		result= prime * result + ((this.fndSvvlAcuCn==null)?0:this.fndSvvlAcuCn.hashCode());
		result= prime * result + ((this.cusPrtfRgsNo==null)?0:this.cusPrtfRgsNo.hashCode());
		result= prime * result + ((this.rcpDtm==null)?0:this.rcpDtm.hashCode());
		result= prime * result + ((this.pnsfndAcno==null)?0:this.pnsfndAcno.hashCode());
		result= prime * result + ((this.mmfFndAcno==null)?0:this.mmfFndAcno.hashCode());
		result= prime * result + ((this.pnsfndNewYn==null)?0:this.pnsfndNewYn.hashCode());
		result= prime * result + ((this.frstNwactNo==null)?0:this.frstNwactNo.hashCode());
		result= prime * result + ((this.scndNwactNo==null)?0:this.scndNwactNo.hashCode());
		result= prime * result + ((this.fndOpngDt==null)?0:this.fndOpngDt.hashCode());
		result= prime * result + ((this.krwSscoNewTlmNo==null)?0:this.krwSscoNewTlmNo.hashCode());
		result= prime * result + ((this.atsDtlDscd==null)?0:this.atsDtlDscd.hashCode());
		result= prime * result + ((this.atsRcvLmtAm==null)?0:this.atsRcvLmtAm.hashCode());
		result= prime * result + ((this.krwFmbkMmdaYn==null)?0:this.krwFmbkMmdaYn.hashCode());
		result= prime * result + ((this.opgOrdsMngNo==null)?0:this.opgOrdsMngNo.hashCode());
		result= prime * result + ((this.spcfPrdMoAcno==null)?0:this.spcfPrdMoAcno.hashCode());
		result= prime * result + ((this.restTxprLmtAm==null)?0:this.restTxprLmtAm.hashCode());
		result= prime * result + ((this.dppeAcno==null)?0:this.dppeAcno.hashCode());
		result= prime * result + ((this.pmnyIdeedYn==null)?0:this.pmnyIdeedYn.hashCode());
		result= prime * result + ((this.tdyCancAcno==null)?0:this.tdyCancAcno.hashCode());
		result= prime * result + ((this.cbrseNewYn==null)?0:this.cbrseNewYn.hashCode());
		result= prime * result + ((this.fmbkNewCitAtsCancYn==null)?0:this.fmbkNewCitAtsCancYn.hashCode());
		result= prime * result + ((this.cnstDdctFxpdGrnYr5OverYn==null)?0:this.cnstDdctFxpdGrnYr5OverYn.hashCode());
		result= prime * result + ((this.aprrBrdmCd==null)?0:this.aprrBrdmCd.hashCode());
		result= prime * result + ((this.cmpnOv1peYn==null)?0:this.cmpnOv1peYn.hashCode());
		result= prime * result + ((this.pnsfndCoreOupYn==null)?0:this.pnsfndCoreOupYn.hashCode());
		result= prime * result + ((this.rtpenPlanAplDt==null)?0:this.rtpenPlanAplDt.hashCode());
		result= prime * result + ((this.rtpenPlanItcsno==null)?0:this.rtpenPlanItcsno.hashCode());
		result= prime * result + ((this.glblBnkgJnngYn==null)?0:this.glblBnkgJnngYn.hashCode());
		result= prime * result + ((this.idCadNewDscd==null)?0:this.idCadNewDscd.hashCode());
		result= prime * result + ((this.encyEbnkPwnoCnf==null)?0:this.encyEbnkPwnoCnf.hashCode());
		result= prime * result + ((this.tlbnkPwnoCnf==null)?0:this.tlbnkPwnoCnf.hashCode());
		result= prime * result + ((this.gridRowCnt==null)?0:this.gridRowCnt.hashCode());
		result= prime * result + ((this.grid==null)?0:this.grid.hashCode());
		result= prime * result + ((this.gridRowCnt2==null)?0:this.gridRowCnt2.hashCode());
		result= prime * result + ((this.grid2==null)?0:this.grid2.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MnyPinBscMngInsertMnpMoAcno_DIDT other= (MnyPinBscMngInsertMnpMoAcno_DIDT)obj;
		{
			Object _sqcNmTrnCfdocCollYn= getSqcNmTrnCfdocCollYn();
			Object __sqcNmTrnCfdocCollYn= other.getSqcNmTrnCfdocCollYn();
			if ( _sqcNmTrnCfdocCollYn== null ) { if ( __sqcNmTrnCfdocCollYn!= null ) return false; }
			else if ( !_sqcNmTrnCfdocCollYn.equals(__sqcNmTrnCfdocCollYn) ) return false;
		}
		{
			Object _dpsNewDscd= getDpsNewDscd();
			Object __dpsNewDscd= other.getDpsNewDscd();
			if ( _dpsNewDscd== null ) { if ( __dpsNewDscd!= null ) return false; }
			else if ( !_dpsNewDscd.equals(__dpsNewDscd) ) return false;
		}
		{
			Object _dpsRsvNewDscd= getDpsRsvNewDscd();
			Object __dpsRsvNewDscd= other.getDpsRsvNewDscd();
			if ( _dpsRsvNewDscd== null ) { if ( __dpsRsvNewDscd!= null ) return false; }
			else if ( !_dpsRsvNewDscd.equals(__dpsRsvNewDscd) ) return false;
		}
		{
			Object _encyActPwno= getEncyActPwno();
			Object __encyActPwno= other.getEncyActPwno();
			if ( _encyActPwno== null ) { if ( __encyActPwno!= null ) return false; }
			else if ( !_encyActPwno.equals(__encyActPwno) ) return false;
		}
		{
			Object _sealSignUsgDscd= getSealSignUsgDscd();
			Object __sealSignUsgDscd= other.getSealSignUsgDscd();
			if ( _sealSignUsgDscd== null ) { if ( __sealSignUsgDscd!= null ) return false; }
			else if ( !_sealSignUsgDscd.equals(__sealSignUsgDscd) ) return false;
		}
		{
			Object _pdcd= getPdcd();
			Object __pdcd= other.getPdcd();
			if ( _pdcd== null ) { if ( __pdcd!= null ) return false; }
			else if ( !_pdcd.equals(__pdcd) ) return false;
		}
		{
			Object _csno= getCsno();
			Object __csno= other.getCsno();
			if ( _csno== null ) { if ( __csno!= null ) return false; }
			else if ( !_csno.equals(__csno) ) return false;
		}
		{
			Object _cusDgnAcno= getCusDgnAcno();
			Object __cusDgnAcno= other.getCusDgnAcno();
			if ( _cusDgnAcno== null ) { if ( __cusDgnAcno!= null ) return false; }
			else if ( !_cusDgnAcno.equals(__cusDgnAcno) ) return false;
		}
		{
			Object _prrRgsPwnoKey= getPrrRgsPwnoKey();
			Object __prrRgsPwnoKey= other.getPrrRgsPwnoKey();
			if ( _prrRgsPwnoKey== null ) { if ( __prrRgsPwnoKey!= null ) return false; }
			else if ( !_prrRgsPwnoKey.equals(__prrRgsPwnoKey) ) return false;
		}
		{
			Object _smsdDscd= getSmsdDscd();
			Object __smsdDscd= other.getSmsdDscd();
			if ( _smsdDscd== null ) { if ( __smsdDscd!= null ) return false; }
			else if ( !_smsdDscd.equals(__smsdDscd) ) return false;
		}
		{
			Object _psnInfExpsCnfYn= getPsnInfExpsCnfYn();
			Object __psnInfExpsCnfYn= other.getPsnInfExpsCnfYn();
			if ( _psnInfExpsCnfYn== null ) { if ( __psnInfExpsCnfYn!= null ) return false; }
			else if ( !_psnInfExpsCnfYn.equals(__psnInfExpsCnfYn) ) return false;
		}
		{
			Object _scanUablRncd= getScanUablRncd();
			Object __scanUablRncd= other.getScanUablRncd();
			if ( _scanUablRncd== null ) { if ( __scanUablRncd!= null ) return false; }
			else if ( !_scanUablRncd.equals(__scanUablRncd) ) return false;
		}
		{
			Object _psnInfAgmdMngNo= getPsnInfAgmdMngNo();
			Object __psnInfAgmdMngNo= other.getPsnInfAgmdMngNo();
			if ( _psnInfAgmdMngNo== null ) { if ( __psnInfAgmdMngNo!= null ) return false; }
			else if ( !_psnInfAgmdMngNo.equals(__psnInfAgmdMngNo) ) return false;
		}
		{
			Object _acnmCnfEno= getAcnmCnfEno();
			Object __acnmCnfEno= other.getAcnmCnfEno();
			if ( _acnmCnfEno== null ) { if ( __acnmCnfEno!= null ) return false; }
			else if ( !_acnmCnfEno.equals(__acnmCnfEno) ) return false;
		}
		{
			Object _advpeEno= getAdvpeEno();
			Object __advpeEno= other.getAdvpeEno();
			if ( _advpeEno== null ) { if ( __advpeEno!= null ) return false; }
			else if ( !_advpeEno.equals(__advpeEno) ) return false;
		}
		{
			Object _idcrDscd= getIdcrDscd();
			Object __idcrDscd= other.getIdcrDscd();
			if ( _idcrDscd== null ) { if ( __idcrDscd!= null ) return false; }
			else if ( !_idcrDscd.equals(__idcrDscd) ) return false;
		}
		{
			Object _idcrFnm= getIdcrFnm();
			Object __idcrFnm= other.getIdcrFnm();
			if ( _idcrFnm== null ) { if ( __idcrFnm!= null ) return false; }
			else if ( !_idcrFnm.equals(__idcrFnm) ) return false;
		}
		{
			Object _idcrEncyRsdlNo= getIdcrEncyRsdlNo();
			Object __idcrEncyRsdlNo= other.getIdcrEncyRsdlNo();
			if ( _idcrEncyRsdlNo== null ) { if ( __idcrEncyRsdlNo!= null ) return false; }
			else if ( !_idcrEncyRsdlNo.equals(__idcrEncyRsdlNo) ) return false;
		}
		{
			Object _idcrIsuDt= getIdcrIsuDt();
			Object __idcrIsuDt= other.getIdcrIsuDt();
			if ( _idcrIsuDt== null ) { if ( __idcrIsuDt!= null ) return false; }
			else if ( !_idcrIsuDt.equals(__idcrIsuDt) ) return false;
		}
		{
			Object _idcrImgKey= getIdcrImgKey();
			Object __idcrImgKey= other.getIdcrImgKey();
			if ( _idcrImgKey== null ) { if ( __idcrImgKey!= null ) return false; }
			else if ( !_idcrImgKey.equals(__idcrImgKey) ) return false;
		}
		{
			Object _idcrCnfShap= getIdcrCnfShap();
			Object __idcrCnfShap= other.getIdcrCnfShap();
			if ( _idcrCnfShap== null ) { if ( __idcrCnfShap!= null ) return false; }
			else if ( !_idcrCnfShap.equals(__idcrCnfShap) ) return false;
		}
		{
			Object _idcrRuseYn= getIdcrRuseYn();
			Object __idcrRuseYn= other.getIdcrRuseYn();
			if ( _idcrRuseYn== null ) { if ( __idcrRuseYn!= null ) return false; }
			else if ( !_idcrRuseYn.equals(__idcrRuseYn) ) return false;
		}
		{
			Object _idcrAgnpeTrnYn= getIdcrAgnpeTrnYn();
			Object __idcrAgnpeTrnYn= other.getIdcrAgnpeTrnYn();
			if ( _idcrAgnpeTrnYn== null ) { if ( __idcrAgnpeTrnYn!= null ) return false; }
			else if ( !_idcrAgnpeTrnYn.equals(__idcrAgnpeTrnYn) ) return false;
		}
		{
			Object _appRgsDscd= getAppRgsDscd();
			Object __appRgsDscd= other.getAppRgsDscd();
			if ( _appRgsDscd== null ) { if ( __appRgsDscd!= null ) return false; }
			else if ( !_appRgsDscd.equals(__appRgsDscd) ) return false;
		}
		{
			Object _appRgsBrcd= getAppRgsBrcd();
			Object __appRgsBrcd= other.getAppRgsBrcd();
			if ( _appRgsBrcd== null ) { if ( __appRgsBrcd!= null ) return false; }
			else if ( !_appRgsBrcd.equals(__appRgsBrcd) ) return false;
		}
		{
			Object _appRgsDt= getAppRgsDt();
			Object __appRgsDt= other.getAppRgsDt();
			if ( _appRgsDt== null ) { if ( __appRgsDt!= null ) return false; }
			else if ( !_appRgsDt.equals(__appRgsDt) ) return false;
		}
		{
			Object _appRgsSrno= getAppRgsSrno();
			Object __appRgsSrno= other.getAppRgsSrno();
			if ( _appRgsSrno== null ) { if ( __appRgsSrno!= null ) return false; }
			else if ( !_appRgsSrno.equals(__appRgsSrno) ) return false;
		}
		{
			Object _wmsLnkYn= getWmsLnkYn();
			Object __wmsLnkYn= other.getWmsLnkYn();
			if ( _wmsLnkYn== null ) { if ( __wmsLnkYn!= null ) return false; }
			else if ( !_wmsLnkYn.equals(__wmsLnkYn) ) return false;
		}
		{
			Object _snthAsetMngCsno= getSnthAsetMngCsno();
			Object __snthAsetMngCsno= other.getSnthAsetMngCsno();
			if ( _snthAsetMngCsno== null ) { if ( __snthAsetMngCsno!= null ) return false; }
			else if ( !_snthAsetMngCsno.equals(__snthAsetMngCsno) ) return false;
		}
		{
			Object _snthAsetMngDesgnPrdCnt= getSnthAsetMngDesgnPrdCnt();
			Object __snthAsetMngDesgnPrdCnt= other.getSnthAsetMngDesgnPrdCnt();
			if ( _snthAsetMngDesgnPrdCnt== null ) { if ( __snthAsetMngDesgnPrdCnt!= null ) return false; }
			else if ( !_snthAsetMngDesgnPrdCnt.equals(__snthAsetMngDesgnPrdCnt) ) return false;
		}
		{
			Object _snthAsetMngAltrIvstWgt= getSnthAsetMngAltrIvstWgt();
			Object __snthAsetMngAltrIvstWgt= other.getSnthAsetMngAltrIvstWgt();
			if ( _snthAsetMngAltrIvstWgt== null ) { if ( __snthAsetMngAltrIvstWgt!= null ) return false; }
			else if ( !_snthAsetMngAltrIvstWgt.equals(__snthAsetMngAltrIvstWgt) ) return false;
		}
		{
			Object _snthAsetMngBksWgt= getSnthAsetMngBksWgt();
			Object __snthAsetMngBksWgt= other.getSnthAsetMngBksWgt();
			if ( _snthAsetMngBksWgt== null ) { if ( __snthAsetMngBksWgt!= null ) return false; }
			else if ( !_snthAsetMngBksWgt.equals(__snthAsetMngBksWgt) ) return false;
		}
		{
			Object _snthAsetMngFrgBndWgt= getSnthAsetMngFrgBndWgt();
			Object __snthAsetMngFrgBndWgt= other.getSnthAsetMngFrgBndWgt();
			if ( _snthAsetMngFrgBndWgt== null ) { if ( __snthAsetMngFrgBndWgt!= null ) return false; }
			else if ( !_snthAsetMngFrgBndWgt.equals(__snthAsetMngFrgBndWgt) ) return false;
		}
		{
			Object _snthAsetMngFrgStcWgt= getSnthAsetMngFrgStcWgt();
			Object __snthAsetMngFrgStcWgt= other.getSnthAsetMngFrgStcWgt();
			if ( _snthAsetMngFrgStcWgt== null ) { if ( __snthAsetMngFrgStcWgt!= null ) return false; }
			else if ( !_snthAsetMngFrgStcWgt.equals(__snthAsetMngFrgStcWgt) ) return false;
		}
		{
			Object _snthAsetMngPdcd= getSnthAsetMngPdcd();
			Object __snthAsetMngPdcd= other.getSnthAsetMngPdcd();
			if ( _snthAsetMngPdcd== null ) { if ( __snthAsetMngPdcd!= null ) return false; }
			else if ( !_snthAsetMngPdcd.equals(__snthAsetMngPdcd) ) return false;
		}
		{
			Object _appRgsPwno= getAppRgsPwno();
			Object __appRgsPwno= other.getAppRgsPwno();
			if ( _appRgsPwno== null ) { if ( __appRgsPwno!= null ) return false; }
			else if ( !_appRgsPwno.equals(__appRgsPwno) ) return false;
		}
		{
			Object _appRgsAtsAcno= getAppRgsAtsAcno();
			Object __appRgsAtsAcno= other.getAppRgsAtsAcno();
			if ( _appRgsAtsAcno== null ) { if ( __appRgsAtsAcno!= null ) return false; }
			else if ( !_appRgsAtsAcno.equals(__appRgsAtsAcno) ) return false;
		}
		{
			Object _wmLnkTrnSrno= getWmLnkTrnSrno();
			Object __wmLnkTrnSrno= other.getWmLnkTrnSrno();
			if ( _wmLnkTrnSrno== null ) { if ( __wmLnkTrnSrno!= null ) return false; }
			else if ( !_wmLnkTrnSrno.equals(__wmLnkTrnSrno) ) return false;
		}
		{
			Object _snthAsetMngDeedCd= getSnthAsetMngDeedCd();
			Object __snthAsetMngDeedCd= other.getSnthAsetMngDeedCd();
			if ( _snthAsetMngDeedCd== null ) { if ( __snthAsetMngDeedCd!= null ) return false; }
			else if ( !_snthAsetMngDeedCd.equals(__snthAsetMngDeedCd) ) return false;
		}
		{
			Object _snthAsetMngFlwWgt= getSnthAsetMngFlwWgt();
			Object __snthAsetMngFlwWgt= other.getSnthAsetMngFlwWgt();
			if ( _snthAsetMngFlwWgt== null ) { if ( __snthAsetMngFlwWgt!= null ) return false; }
			else if ( !_snthAsetMngFlwWgt.equals(__snthAsetMngFlwWgt) ) return false;
		}
		{
			Object _snthAsetMngDomStcWgt= getSnthAsetMngDomStcWgt();
			Object __snthAsetMngDomStcWgt= other.getSnthAsetMngDomStcWgt();
			if ( _snthAsetMngDomStcWgt== null ) { if ( __snthAsetMngDomStcWgt!= null ) return false; }
			else if ( !_snthAsetMngDomStcWgt.equals(__snthAsetMngDomStcWgt) ) return false;
		}
		{
			Object _snthAsetMngDomBndWgt= getSnthAsetMngDomBndWgt();
			Object __snthAsetMngDomBndWgt= other.getSnthAsetMngDomBndWgt();
			if ( _snthAsetMngDomBndWgt== null ) { if ( __snthAsetMngDomBndWgt!= null ) return false; }
			else if ( !_snthAsetMngDomBndWgt.equals(__snthAsetMngDomBndWgt) ) return false;
		}
		{
			Object _prdStbyAnlsSrno= getPrdStbyAnlsSrno();
			Object __prdStbyAnlsSrno= other.getPrdStbyAnlsSrno();
			if ( _prdStbyAnlsSrno== null ) { if ( __prdStbyAnlsSrno!= null ) return false; }
			else if ( !_prdStbyAnlsSrno.equals(__prdStbyAnlsSrno) ) return false;
		}
		{
			Object _inlnAnlsSrno= getInlnAnlsSrno();
			Object __inlnAnlsSrno= other.getInlnAnlsSrno();
			if ( _inlnAnlsSrno== null ) { if ( __inlnAnlsSrno!= null ) return false; }
			else if ( !_inlnAnlsSrno.equals(__inlnAnlsSrno) ) return false;
		}
		{
			Object _asetIstMngNo= getAsetIstMngNo();
			Object __asetIstMngNo= other.getAsetIstMngNo();
			if ( _asetIstMngNo== null ) { if ( __asetIstMngNo!= null ) return false; }
			else if ( !_asetIstMngNo.equals(__asetIstMngNo) ) return false;
		}
		{
			Object _rtpenPlanOrgPdcd= getRtpenPlanOrgPdcd();
			Object __rtpenPlanOrgPdcd= other.getRtpenPlanOrgPdcd();
			if ( _rtpenPlanOrgPdcd== null ) { if ( __rtpenPlanOrgPdcd!= null ) return false; }
			else if ( !_rtpenPlanOrgPdcd.equals(__rtpenPlanOrgPdcd) ) return false;
		}
		{
			Object _jnpeTycd= getJnpeTycd();
			Object __jnpeTycd= other.getJnpeTycd();
			if ( _jnpeTycd== null ) { if ( __jnpeTycd!= null ) return false; }
			else if ( !_jnpeTycd.equals(__jnpeTycd) ) return false;
		}
		{
			Object _fndSgpFpCnslSrvcDscd= getFndSgpFpCnslSrvcDscd();
			Object __fndSgpFpCnslSrvcDscd= other.getFndSgpFpCnslSrvcDscd();
			if ( _fndSgpFpCnslSrvcDscd== null ) { if ( __fndSgpFpCnslSrvcDscd!= null ) return false; }
			else if ( !_fndSgpFpCnslSrvcDscd.equals(__fndSgpFpCnslSrvcDscd) ) return false;
		}
		{
			Object _rsdlBzpeNo= getRsdlBzpeNo();
			Object __rsdlBzpeNo= other.getRsdlBzpeNo();
			if ( _rsdlBzpeNo== null ) { if ( __rsdlBzpeNo!= null ) return false; }
			else if ( !_rsdlBzpeNo.equals(__rsdlBzpeNo) ) return false;
		}
		{
			Object _frnrLstVldTem= getFrnrLstVldTem();
			Object __frnrLstVldTem= other.getFrnrLstVldTem();
			if ( _frnrLstVldTem== null ) { if ( __frnrLstVldTem!= null ) return false; }
			else if ( !_frnrLstVldTem.equals(__frnrLstVldTem) ) return false;
		}
		{
			Object _inetRsvRcpDscd= getInetRsvRcpDscd();
			Object __inetRsvRcpDscd= other.getInetRsvRcpDscd();
			if ( _inetRsvRcpDscd== null ) { if ( __inetRsvRcpDscd!= null ) return false; }
			else if ( !_inetRsvRcpDscd.equals(__inetRsvRcpDscd) ) return false;
		}
		{
			Object _inetRsvIdfNo= getInetRsvIdfNo();
			Object __inetRsvIdfNo= other.getInetRsvIdfNo();
			if ( _inetRsvIdfNo== null ) { if ( __inetRsvIdfNo!= null ) return false; }
			else if ( !_inetRsvIdfNo.equals(__inetRsvIdfNo) ) return false;
		}
		{
			Object _inetRsvNo= getInetRsvNo();
			Object __inetRsvNo= other.getInetRsvNo();
			if ( _inetRsvNo== null ) { if ( __inetRsvNo!= null ) return false; }
			else if ( !_inetRsvNo.equals(__inetRsvNo) ) return false;
		}
		{
			Object _inetRsvCusPureNewYn= getInetRsvCusPureNewYn();
			Object __inetRsvCusPureNewYn= other.getInetRsvCusPureNewYn();
			if ( _inetRsvCusPureNewYn== null ) { if ( __inetRsvCusPureNewYn!= null ) return false; }
			else if ( !_inetRsvCusPureNewYn.equals(__inetRsvCusPureNewYn) ) return false;
		}
		{
			Object _synpbPdcd= getSynpbPdcd();
			Object __synpbPdcd= other.getSynpbPdcd();
			if ( _synpbPdcd== null ) { if ( __synpbPdcd!= null ) return false; }
			else if ( !_synpbPdcd.equals(__synpbPdcd) ) return false;
		}
		{
			Object _actUsgAimDis= getActUsgAimDis();
			Object __actUsgAimDis= other.getActUsgAimDis();
			if ( _actUsgAimDis== null ) { if ( __actUsgAimDis!= null ) return false; }
			else if ( !_actUsgAimDis.equals(__actUsgAimDis) ) return false;
		}
		{
			Object _frnrEmptEduYn= getFrnrEmptEduYn();
			Object __frnrEmptEduYn= other.getFrnrEmptEduYn();
			if ( _frnrEmptEduYn== null ) { if ( __frnrEmptEduYn!= null ) return false; }
			else if ( !_frnrEmptEduYn.equals(__frnrEmptEduYn) ) return false;
		}
		{
			Object _fncTrnAimCollDis= getFncTrnAimCollDis();
			Object __fncTrnAimCollDis= other.getFncTrnAimCollDis();
			if ( _fncTrnAimCollDis== null ) { if ( __fncTrnAimCollDis!= null ) return false; }
			else if ( !_fncTrnAimCollDis.equals(__fncTrnAimCollDis) ) return false;
		}
		{
			Object _lnoActOpngRsn= getLnoActOpngRsn();
			Object __lnoActOpngRsn= other.getLnoActOpngRsn();
			if ( _lnoActOpngRsn== null ) { if ( __lnoActOpngRsn!= null ) return false; }
			else if ( !_lnoActOpngRsn.equals(__lnoActOpngRsn) ) return false;
		}
		{
			Object _depaCrdcCollYn= getDepaCrdcCollYn();
			Object __depaCrdcCollYn= other.getDepaCrdcCollYn();
			if ( _depaCrdcCollYn== null ) { if ( __depaCrdcCollYn!= null ) return false; }
			else if ( !_depaCrdcCollYn.equals(__depaCrdcCollYn) ) return false;
		}
		{
			Object _idCadIsuRqdcUsgYn= getIdCadIsuRqdcUsgYn();
			Object __idCadIsuRqdcUsgYn= other.getIdCadIsuRqdcUsgYn();
			if ( _idCadIsuRqdcUsgYn== null ) { if ( __idCadIsuRqdcUsgYn!= null ) return false; }
			else if ( !_idCadIsuRqdcUsgYn.equals(__idCadIsuRqdcUsgYn) ) return false;
		}
		{
			Object _rcvVcrMlsChidYn= getRcvVcrMlsChidYn();
			Object __rcvVcrMlsChidYn= other.getRcvVcrMlsChidYn();
			if ( _rcvVcrMlsChidYn== null ) { if ( __rcvVcrMlsChidYn!= null ) return false; }
			else if ( !_rcvVcrMlsChidYn.equals(__rcvVcrMlsChidYn) ) return false;
		}
		{
			Object _saltsScdDd= getSaltsScdDd();
			Object __saltsScdDd= other.getSaltsScdDd();
			if ( _saltsScdDd== null ) { if ( __saltsScdDd!= null ) return false; }
			else if ( !_saltsScdDd.equals(__saltsScdDd) ) return false;
		}
		{
			Object _atmWdrDscd= getAtmWdrDscd();
			Object __atmWdrDscd= other.getAtmWdrDscd();
			if ( _atmWdrDscd== null ) { if ( __atmWdrDscd!= null ) return false; }
			else if ( !_atmWdrDscd.equals(__atmWdrDscd) ) return false;
		}
		{
			Object _cctnTrnKdcd= getCctnTrnKdcd();
			Object __cctnTrnKdcd= other.getCctnTrnKdcd();
			if ( _cctnTrnKdcd== null ) { if ( __cctnTrnKdcd!= null ) return false; }
			else if ( !_cctnTrnKdcd.equals(__cctnTrnKdcd) ) return false;
		}
		{
			Object _idCadIsuYn= getIdCadIsuYn();
			Object __idCadIsuYn= other.getIdCadIsuYn();
			if ( _idCadIsuYn== null ) { if ( __idCadIsuYn!= null ) return false; }
			else if ( !_idCadIsuYn.equals(__idCadIsuYn) ) return false;
		}
		{
			Object _ptnrPrmeIr1Yn= getPtnrPrmeIr1Yn();
			Object __ptnrPrmeIr1Yn= other.getPtnrPrmeIr1Yn();
			if ( _ptnrPrmeIr1Yn== null ) { if ( __ptnrPrmeIr1Yn!= null ) return false; }
			else if ( !_ptnrPrmeIr1Yn.equals(__ptnrPrmeIr1Yn) ) return false;
		}
		{
			Object _ptnrPrmeIr2Yn= getPtnrPrmeIr2Yn();
			Object __ptnrPrmeIr2Yn= other.getPtnrPrmeIr2Yn();
			if ( _ptnrPrmeIr2Yn== null ) { if ( __ptnrPrmeIr2Yn!= null ) return false; }
			else if ( !_ptnrPrmeIr2Yn.equals(__ptnrPrmeIr2Yn) ) return false;
		}
		{
			Object _ptnrPrmeIr3Yn= getPtnrPrmeIr3Yn();
			Object __ptnrPrmeIr3Yn= other.getPtnrPrmeIr3Yn();
			if ( _ptnrPrmeIr3Yn== null ) { if ( __ptnrPrmeIr3Yn!= null ) return false; }
			else if ( !_ptnrPrmeIr3Yn.equals(__ptnrPrmeIr3Yn) ) return false;
		}
		{
			Object _ptnrPrmeIr4Yn= getPtnrPrmeIr4Yn();
			Object __ptnrPrmeIr4Yn= other.getPtnrPrmeIr4Yn();
			if ( _ptnrPrmeIr4Yn== null ) { if ( __ptnrPrmeIr4Yn!= null ) return false; }
			else if ( !_ptnrPrmeIr4Yn.equals(__ptnrPrmeIr4Yn) ) return false;
		}
		{
			Object _ascnPbokNm= getAscnPbokNm();
			Object __ascnPbokNm= other.getAscnPbokNm();
			if ( _ascnPbokNm== null ) { if ( __ascnPbokNm!= null ) return false; }
			else if ( !_ascnPbokNm.equals(__ascnPbokNm) ) return false;
		}
		{
			Object _rcvpeNm= getRcvpeNm();
			Object __rcvpeNm= other.getRcvpeNm();
			if ( _rcvpeNm== null ) { if ( __rcvpeNm!= null ) return false; }
			else if ( !_rcvpeNm.equals(__rcvpeNm) ) return false;
		}
		{
			Object _rcvDd= getRcvDd();
			Object __rcvDd= other.getRcvDd();
			if ( _rcvDd== null ) { if ( __rcvDd!= null ) return false; }
			else if ( !_rcvDd.equals(__rcvDd) ) return false;
		}
		{
			Object _dntnAtsEndDt= getDntnAtsEndDt();
			Object __dntnAtsEndDt= other.getDntnAtsEndDt();
			if ( _dntnAtsEndDt== null ) { if ( __dntnAtsEndDt!= null ) return false; }
			else if ( !_dntnAtsEndDt.equals(__dntnAtsEndDt) ) return false;
		}
		{
			Object _patnAscnAcno= getPatnAscnAcno();
			Object __patnAscnAcno= other.getPatnAscnAcno();
			if ( _patnAscnAcno== null ) { if ( __patnAscnAcno!= null ) return false; }
			else if ( !_patnAscnAcno.equals(__patnAscnAcno) ) return false;
		}
		{
			Object _patnAscnNm= getPatnAscnNm();
			Object __patnAscnNm= other.getPatnAscnNm();
			if ( _patnAscnNm== null ) { if ( __patnAscnNm!= null ) return false; }
			else if ( !_patnAscnNm.equals(__patnAscnNm) ) return false;
		}
		{
			Object _aimFdNm= getAimFdNm();
			Object __aimFdNm= other.getAimFdNm();
			if ( _aimFdNm== null ) { if ( __aimFdNm!= null ) return false; }
			else if ( !_aimFdNm.equals(__aimFdNm) ) return false;
		}
		{
			Object _patnAscnDis= getPatnAscnDis();
			Object __patnAscnDis= other.getPatnAscnDis();
			if ( _patnAscnDis== null ) { if ( __patnAscnDis!= null ) return false; }
			else if ( !_patnAscnDis.equals(__patnAscnDis) ) return false;
		}
		{
			Object _patnHpNo= getPatnHpNo();
			Object __patnHpNo= other.getPatnHpNo();
			if ( _patnHpNo== null ) { if ( __patnHpNo!= null ) return false; }
			else if ( !_patnHpNo.equals(__patnHpNo) ) return false;
		}
		{
			Object _chilRrno= getChilRrno();
			Object __chilRrno= other.getChilRrno();
			if ( _chilRrno== null ) { if ( __chilRrno!= null ) return false; }
			else if ( !_chilRrno.equals(__chilRrno) ) return false;
		}
		{
			Object _dntnInfOfrAgrYn= getDntnInfOfrAgrYn();
			Object __dntnInfOfrAgrYn= other.getDntnInfOfrAgrYn();
			if ( _dntnInfOfrAgrYn== null ) { if ( __dntnInfOfrAgrYn!= null ) return false; }
			else if ( !_dntnInfOfrAgrYn.equals(__dntnInfOfrAgrYn) ) return false;
		}
		{
			Object _dntnlCd= getDntnlCd();
			Object __dntnlCd= other.getDntnlCd();
			if ( _dntnlCd== null ) { if ( __dntnlCd!= null ) return false; }
			else if ( !_dntnlCd.equals(__dntnlCd) ) return false;
		}
		{
			Object _clsaAtsRqYn= getClsaAtsRqYn();
			Object __clsaAtsRqYn= other.getClsaAtsRqYn();
			if ( _clsaAtsRqYn== null ) { if ( __clsaAtsRqYn!= null ) return false; }
			else if ( !_clsaAtsRqYn.equals(__clsaAtsRqYn) ) return false;
		}
		{
			Object _clsaAtsPmnyAcno= getClsaAtsPmnyAcno();
			Object __clsaAtsPmnyAcno= other.getClsaAtsPmnyAcno();
			if ( _clsaAtsPmnyAcno== null ) { if ( __clsaAtsPmnyAcno!= null ) return false; }
			else if ( !_clsaAtsPmnyAcno.equals(__clsaAtsPmnyAcno) ) return false;
		}
		{
			Object _clsaAtsEndDt= getClsaAtsEndDt();
			Object __clsaAtsEndDt= other.getClsaAtsEndDt();
			if ( _clsaAtsEndDt== null ) { if ( __clsaAtsEndDt!= null ) return false; }
			else if ( !_clsaAtsEndDt.equals(__clsaAtsEndDt) ) return false;
		}
		{
			Object _fncTaxtSmsRqYn= getFncTaxtSmsRqYn();
			Object __fncTaxtSmsRqYn= other.getFncTaxtSmsRqYn();
			if ( _fncTaxtSmsRqYn== null ) { if ( __fncTaxtSmsRqYn!= null ) return false; }
			else if ( !_fncTaxtSmsRqYn.equals(__fncTaxtSmsRqYn) ) return false;
		}
		{
			Object _wfFclUnqNo= getWfFclUnqNo();
			Object __wfFclUnqNo= other.getWfFclUnqNo();
			if ( _wfFclUnqNo== null ) { if ( __wfFclUnqNo!= null ) return false; }
			else if ( !_wfFclUnqNo.equals(__wfFclUnqNo) ) return false;
		}
		{
			Object _locaPrmeYn= getLocaPrmeYn();
			Object __locaPrmeYn= other.getLocaPrmeYn();
			if ( _locaPrmeYn== null ) { if ( __locaPrmeYn!= null ) return false; }
			else if ( !_locaPrmeYn.equals(__locaPrmeYn) ) return false;
		}
		{
			Object _afiBzcd= getAfiBzcd();
			Object __afiBzcd= other.getAfiBzcd();
			if ( _afiBzcd== null ) { if ( __afiBzcd!= null ) return false; }
			else if ( !_afiBzcd.equals(__afiBzcd) ) return false;
		}
		{
			Object _emlNtcSrvcYn= getEmlNtcSrvcYn();
			Object __emlNtcSrvcYn= other.getEmlNtcSrvcYn();
			if ( _emlNtcSrvcYn== null ) { if ( __emlNtcSrvcYn!= null ) return false; }
			else if ( !_emlNtcSrvcYn.equals(__emlNtcSrvcYn) ) return false;
		}
		{
			Object _fmbkCtrdCollYn= getFmbkCtrdCollYn();
			Object __fmbkCtrdCollYn= other.getFmbkCtrdCollYn();
			if ( _fmbkCtrdCollYn== null ) { if ( __fmbkCtrdCollYn!= null ) return false; }
			else if ( !_fmbkCtrdCollYn.equals(__fmbkCtrdCollYn) ) return false;
		}
		{
			Object _adrpRgsYn= getAdrpRgsYn();
			Object __adrpRgsYn= other.getAdrpRgsYn();
			if ( _adrpRgsYn== null ) { if ( __adrpRgsYn!= null ) return false; }
			else if ( !_adrpRgsYn.equals(__adrpRgsYn) ) return false;
		}
		{
			Object _mbhYn= getMbhYn();
			Object __mbhYn= other.getMbhYn();
			if ( _mbhYn== null ) { if ( __mbhYn!= null ) return false; }
			else if ( !_mbhYn.equals(__mbhYn) ) return false;
		}
		{
			Object _psnInfAgrYn= getPsnInfAgrYn();
			Object __psnInfAgrYn= other.getPsnInfAgrYn();
			if ( _psnInfAgrYn== null ) { if ( __psnInfAgrYn!= null ) return false; }
			else if ( !_psnInfAgrYn.equals(__psnInfAgrYn) ) return false;
		}
		{
			Object _datAcldHpNo= getDatAcldHpNo();
			Object __datAcldHpNo= other.getDatAcldHpNo();
			if ( _datAcldHpNo== null ) { if ( __datAcldHpNo!= null ) return false; }
			else if ( !_datAcldHpNo.equals(__datAcldHpNo) ) return false;
		}
		{
			Object _dpsBatRqsNo= getDpsBatRqsNo();
			Object __dpsBatRqsNo= other.getDpsBatRqsNo();
			if ( _dpsBatRqsNo== null ) { if ( __dpsBatRqsNo!= null ) return false; }
			else if ( !_dpsBatRqsNo.equals(__dpsBatRqsNo) ) return false;
		}
		{
			Object _dpsBatRqsSrno= getDpsBatRqsSrno();
			Object __dpsBatRqsSrno= other.getDpsBatRqsSrno();
			if ( _dpsBatRqsSrno== null ) { if ( __dpsBatRqsSrno!= null ) return false; }
			else if ( !_dpsBatRqsSrno.equals(__dpsBatRqsSrno) ) return false;
		}
		{
			Object _agnpeEncyRrno= getAgnpeEncyRrno();
			Object __agnpeEncyRrno= other.getAgnpeEncyRrno();
			if ( _agnpeEncyRrno== null ) { if ( __agnpeEncyRrno!= null ) return false; }
			else if ( !_agnpeEncyRrno.equals(__agnpeEncyRrno) ) return false;
		}
		{
			Object _agnpeFnm= getAgnpeFnm();
			Object __agnpeFnm= other.getAgnpeFnm();
			if ( _agnpeFnm== null ) { if ( __agnpeFnm!= null ) return false; }
			else if ( !_agnpeFnm.equals(__agnpeFnm) ) return false;
		}
		{
			Object _rppeDupOmitYn= getRppeDupOmitYn();
			Object __rppeDupOmitYn= other.getRppeDupOmitYn();
			if ( _rppeDupOmitYn== null ) { if ( __rppeDupOmitYn!= null ) return false; }
			else if ( !_rppeDupOmitYn.equals(__rppeDupOmitYn) ) return false;
		}
		{
			Object _rppeAgnpeAcrdYn= getRppeAgnpeAcrdYn();
			Object __rppeAgnpeAcrdYn= other.getRppeAgnpeAcrdYn();
			if ( _rppeAgnpeAcrdYn== null ) { if ( __rppeAgnpeAcrdYn!= null ) return false; }
			else if ( !_rppeAgnpeAcrdYn.equals(__rppeAgnpeAcrdYn) ) return false;
		}
		{
			Object _rppeFnm= getRppeFnm();
			Object __rppeFnm= other.getRppeFnm();
			if ( _rppeFnm== null ) { if ( __rppeFnm!= null ) return false; }
			else if ( !_rppeFnm.equals(__rppeFnm) ) return false;
		}
		{
			Object _rppeEncyRrno= getRppeEncyRrno();
			Object __rppeEncyRrno= other.getRppeEncyRrno();
			if ( _rppeEncyRrno== null ) { if ( __rppeEncyRrno!= null ) return false; }
			else if ( !_rppeEncyRrno.equals(__rppeEncyRrno) ) return false;
		}
		{
			Object _agnpeDupYn= getAgnpeDupYn();
			Object __agnpeDupYn= other.getAgnpeDupYn();
			if ( _agnpeDupYn== null ) { if ( __agnpeDupYn!= null ) return false; }
			else if ( !_agnpeDupYn.equals(__agnpeDupYn) ) return false;
		}
		{
			Object _rppeDupYn= getRppeDupYn();
			Object __rppeDupYn= other.getRppeDupYn();
			if ( _rppeDupYn== null ) { if ( __rppeDupYn!= null ) return false; }
			else if ( !_rppeDupYn.equals(__rppeDupYn) ) return false;
		}
		{
			Object _itpyMecd= getItpyMecd();
			Object __itpyMecd= other.getItpyMecd();
			if ( _itpyMecd== null ) { if ( __itpyMecd!= null ) return false; }
			else if ( !_itpyMecd.equals(__itpyMecd) ) return false;
		}
		{
			Object _itpyCycd= getItpyCycd();
			Object __itpyCycd= other.getItpyCycd();
			if ( _itpyCycd== null ) { if ( __itpyCycd!= null ) return false; }
			else if ( !_itpyCycd.equals(__itpyCycd) ) return false;
		}
		{
			Object _nextItpyDt= getNextItpyDt();
			Object __nextItpyDt= other.getNextItpyDt();
			if ( _nextItpyDt== null ) { if ( __nextItpyDt!= null ) return false; }
			else if ( !_nextItpyDt.equals(__nextItpyDt) ) return false;
		}
		{
			Object _actMngBrcd= getActMngBrcd();
			Object __actMngBrcd= other.getActMngBrcd();
			if ( _actMngBrcd== null ) { if ( __actMngBrcd!= null ) return false; }
			else if ( !_actMngBrcd.equals(__actMngBrcd) ) return false;
		}
		{
			Object _asscNmnlDpstYn= getAsscNmnlDpstYn();
			Object __asscNmnlDpstYn= other.getAsscNmnlDpstYn();
			if ( _asscNmnlDpstYn== null ) { if ( __asscNmnlDpstYn!= null ) return false; }
			else if ( !_asscNmnlDpstYn.equals(__asscNmnlDpstYn) ) return false;
		}
		{
			Object _netrApvNo= getNetrApvNo();
			Object __netrApvNo= other.getNetrApvNo();
			if ( _netrApvNo== null ) { if ( __netrApvNo!= null ) return false; }
			else if ( !_netrApvNo.equals(__netrApvNo) ) return false;
		}
		{
			Object _mbpbkJnngYn= getMbpbkJnngYn();
			Object __mbpbkJnngYn= other.getMbpbkJnngYn();
			if ( _mbpbkJnngYn== null ) { if ( __mbpbkJnngYn!= null ) return false; }
			else if ( !_mbpbkJnngYn.equals(__mbpbkJnngYn) ) return false;
		}
		{
			Object _mblPbokInetBnkgId= getMblPbokInetBnkgId();
			Object __mblPbokInetBnkgId= other.getMblPbokInetBnkgId();
			if ( _mblPbokInetBnkgId== null ) { if ( __mblPbokInetBnkgId!= null ) return false; }
			else if ( !_mblPbokInetBnkgId.equals(__mblPbokInetBnkgId) ) return false;
		}
		{
			Object _npbokIccadIsuDis= getNpbokIccadIsuDis();
			Object __npbokIccadIsuDis= other.getNpbokIccadIsuDis();
			if ( _npbokIccadIsuDis== null ) { if ( __npbokIccadIsuDis!= null ) return false; }
			else if ( !_npbokIccadIsuDis.equals(__npbokIccadIsuDis) ) return false;
		}
		{
			Object _ideedCd= getIdeedCd();
			Object __ideedCd= other.getIdeedCd();
			if ( _ideedCd== null ) { if ( __ideedCd!= null ) return false; }
			else if ( !_ideedCd.equals(__ideedCd) ) return false;
		}
		{
			Object _pbokEngPrngYn= getPbokEngPrngYn();
			Object __pbokEngPrngYn= other.getPbokEngPrngYn();
			if ( _pbokEngPrngYn== null ) { if ( __pbokEngPrngYn!= null ) return false; }
			else if ( !_pbokEngPrngYn.equals(__pbokEngPrngYn) ) return false;
		}
		{
			Object _nlDscd= getNlDscd();
			Object __nlDscd= other.getNlDscd();
			if ( _nlDscd== null ) { if ( __nlDscd!= null ) return false; }
			else if ( !_nlDscd.equals(__nlDscd) ) return false;
		}
		{
			Object _dpsDeedNo= getDpsDeedNo();
			Object __dpsDeedNo= other.getDpsDeedNo();
			if ( _dpsDeedNo== null ) { if ( __dpsDeedNo!= null ) return false; }
			else if ( !_dpsDeedNo.equals(__dpsDeedNo) ) return false;
		}
		{
			Object _pbokIssuYn= getPbokIssuYn();
			Object __pbokIssuYn= other.getPbokIssuYn();
			if ( _pbokIssuYn== null ) { if ( __pbokIssuYn!= null ) return false; }
			else if ( !_pbokIssuYn.equals(__pbokIssuYn) ) return false;
		}
		{
			Object _prdGdncPbokPrngYn= getPrdGdncPbokPrngYn();
			Object __prdGdncPbokPrngYn= other.getPrdGdncPbokPrngYn();
			if ( _prdGdncPbokPrngYn== null ) { if ( __prdGdncPbokPrngYn!= null ) return false; }
			else if ( !_prdGdncPbokPrngYn.equals(__prdGdncPbokPrngYn) ) return false;
		}
		{
			Object _nrsrCnfDocCollYn= getNrsrCnfDocCollYn();
			Object __nrsrCnfDocCollYn= other.getNrsrCnfDocCollYn();
			if ( _nrsrCnfDocCollYn== null ) { if ( __nrsrCnfDocCollYn!= null ) return false; }
			else if ( !_nrsrCnfDocCollYn.equals(__nrsrCnfDocCollYn) ) return false;
		}
		{
			Object _bokStttPermXtYn= getBokStttPermXtYn();
			Object __bokStttPermXtYn= other.getBokStttPermXtYn();
			if ( _bokStttPermXtYn== null ) { if ( __bokStttPermXtYn!= null ) return false; }
			else if ( !_bokStttPermXtYn.equals(__bokStttPermXtYn) ) return false;
		}
		{
			Object _nrsrPwnoRgsYn= getNrsrPwnoRgsYn();
			Object __nrsrPwnoRgsYn= other.getNrsrPwnoRgsYn();
			if ( _nrsrPwnoRgsYn== null ) { if ( __nrsrPwnoRgsYn!= null ) return false; }
			else if ( !_nrsrPwnoRgsYn.equals(__nrsrPwnoRgsYn) ) return false;
		}
		{
			Object _nrsrAccCd= getNrsrAccCd();
			Object __nrsrAccCd= other.getNrsrAccCd();
			if ( _nrsrAccCd== null ) { if ( __nrsrAccCd!= null ) return false; }
			else if ( !_nrsrAccCd.equals(__nrsrAccCd) ) return false;
		}
		{
			Object _krwDpsAccDscd= getKrwDpsAccDscd();
			Object __krwDpsAccDscd= other.getKrwDpsAccDscd();
			if ( _krwDpsAccDscd== null ) { if ( __krwDpsAccDscd!= null ) return false; }
			else if ( !_krwDpsAccDscd.equals(__krwDpsAccDscd) ) return false;
		}
		{
			Object _nrsrKrwInfwDscd= getNrsrKrwInfwDscd();
			Object __nrsrKrwInfwDscd= other.getNrsrKrwInfwDscd();
			if ( _nrsrKrwInfwDscd== null ) { if ( __nrsrKrwInfwDscd!= null ) return false; }
			else if ( !_nrsrKrwInfwDscd.equals(__nrsrKrwInfwDscd) ) return false;
		}
		{
			Object _txprDscd= getTxprDscd();
			Object __txprDscd= other.getTxprDscd();
			if ( _txprDscd== null ) { if ( __txprDscd!= null ) return false; }
			else if ( !_txprDscd.equals(__txprDscd) ) return false;
		}
		{
			Object _txprLmtAm= getTxprLmtAm();
			Object __txprLmtAm= other.getTxprLmtAm();
			if ( _txprLmtAm== null ) { if ( __txprLmtAm!= null ) return false; }
			else if ( !_txprLmtAm.equals(__txprLmtAm) ) return false;
		}
		{
			Object _prchAm= getPrchAm();
			Object __prchAm= other.getPrchAm();
			if ( _prchAm== null ) { if ( __prchAm!= null ) return false; }
			else if ( !_prchAm.equals(__prchAm) ) return false;
		}
		{
			Object _pmbilAm= getPmbilAm();
			Object __pmbilAm= other.getPmbilAm();
			if ( _pmbilAm== null ) { if ( __pmbilAm!= null ) return false; }
			else if ( !_pmbilAm.equals(__pmbilAm) ) return false;
		}
		{
			Object _cackAm= getCackAm();
			Object __cackAm= other.getCackAm();
			if ( _cackAm== null ) { if ( __cackAm!= null ) return false; }
			else if ( !_cackAm.equals(__cackAm) ) return false;
		}
		{
			Object _bokBchkAm= getBokBchkAm();
			Object __bokBchkAm= other.getBokBchkAm();
			if ( _bokBchkAm== null ) { if ( __bokBchkAm!= null ) return false; }
			else if ( !_bokBchkAm.equals(__bokBchkAm) ) return false;
		}
		{
			Object _etcDeedAm= getEtcDeedAm();
			Object __etcDeedAm= other.getEtcDeedAm();
			if ( _etcDeedAm== null ) { if ( __etcDeedAm!= null ) return false; }
			else if ( !_etcDeedAm.equals(__etcDeedAm) ) return false;
		}
		{
			Object _fncTrnAimCd= getFncTrnAimCd();
			Object __fncTrnAimCd= other.getFncTrnAimCd();
			if ( _fncTrnAimCd== null ) { if ( __fncTrnAimCd!= null ) return false; }
			else if ( !_fncTrnAimCd.equals(__fncTrnAimCd) ) return false;
		}
		{
			Object _trnFdSrcCd= getTrnFdSrcCd();
			Object __trnFdSrcCd= other.getTrnFdSrcCd();
			if ( _trnFdSrcCd== null ) { if ( __trnFdSrcCd!= null ) return false; }
			else if ( !_trnFdSrcCd.equals(__trnFdSrcCd) ) return false;
		}
		{
			Object _fdOwpeYn= getFdOwpeYn();
			Object __fdOwpeYn= other.getFdOwpeYn();
			if ( _fdOwpeYn== null ) { if ( __fdOwpeYn!= null ) return false; }
			else if ( !_fdOwpeYn.equals(__fdOwpeYn) ) return false;
		}
		{
			Object _fncTrnAimTxt= getFncTrnAimTxt();
			Object __fncTrnAimTxt= other.getFncTrnAimTxt();
			if ( _fncTrnAimTxt== null ) { if ( __fncTrnAimTxt!= null ) return false; }
			else if ( !_fncTrnAimTxt.equals(__fncTrnAimTxt) ) return false;
		}
		{
			Object _trnFdSrcCdTxt= getTrnFdSrcCdTxt();
			Object __trnFdSrcCdTxt= other.getTrnFdSrcCdTxt();
			if ( _trnFdSrcCdTxt== null ) { if ( __trnFdSrcCdTxt!= null ) return false; }
			else if ( !_trnFdSrcCdTxt.equals(__trnFdSrcCdTxt) ) return false;
		}
		{
			Object _ckbilKdcd= getCkbilKdcd();
			Object __ckbilKdcd= other.getCkbilKdcd();
			if ( _ckbilKdcd== null ) { if ( __ckbilKdcd!= null ) return false; }
			else if ( !_ckbilKdcd.equals(__ckbilKdcd) ) return false;
		}
		{
			Object _cacGramRcvYn= getCacGramRcvYn();
			Object __cacGramRcvYn= other.getCacGramRcvYn();
			if ( _cacGramRcvYn== null ) { if ( __cacGramRcvYn!= null ) return false; }
			else if ( !_cacGramRcvYn.equals(__cacGramRcvYn) ) return false;
		}
		{
			Object _cacGramRcvCrtdIsuYn= getCacGramRcvCrtdIsuYn();
			Object __cacGramRcvCrtdIsuYn= other.getCacGramRcvCrtdIsuYn();
			if ( _cacGramRcvCrtdIsuYn== null ) { if ( __cacGramRcvCrtdIsuYn!= null ) return false; }
			else if ( !_cacGramRcvCrtdIsuYn.equals(__cacGramRcvCrtdIsuYn) ) return false;
		}
		{
			Object _cacGramRcvAm= getCacGramRcvAm();
			Object __cacGramRcvAm= other.getCacGramRcvAm();
			if ( _cacGramRcvAm== null ) { if ( __cacGramRcvAm!= null ) return false; }
			else if ( !_cacGramRcvAm.equals(__cacGramRcvAm) ) return false;
		}
		{
			Object _cacGramTrfAm= getCacGramTrfAm();
			Object __cacGramTrfAm= other.getCacGramTrfAm();
			if ( _cacGramTrfAm== null ) { if ( __cacGramTrfAm!= null ) return false; }
			else if ( !_cacGramTrfAm.equals(__cacGramTrfAm) ) return false;
		}
		{
			Object _cacGramBchkAm= getCacGramBchkAm();
			Object __cacGramBchkAm= other.getCacGramBchkAm();
			if ( _cacGramBchkAm== null ) { if ( __cacGramBchkAm!= null ) return false; }
			else if ( !_cacGramBchkAm.equals(__cacGramBchkAm) ) return false;
		}
		{
			Object _feeRcvYn= getFeeRcvYn();
			Object __feeRcvYn= other.getFeeRcvYn();
			if ( _feeRcvYn== null ) { if ( __feeRcvYn!= null ) return false; }
			else if ( !_feeRcvYn.equals(__feeRcvYn) ) return false;
		}
		{
			Object _feeCshtfDscd= getFeeCshtfDscd();
			Object __feeCshtfDscd= other.getFeeCshtfDscd();
			if ( _feeCshtfDscd== null ) { if ( __feeCshtfDscd!= null ) return false; }
			else if ( !_feeCshtfDscd.equals(__feeCshtfDscd) ) return false;
		}
		{
			Object _rctsOupYn= getRctsOupYn();
			Object __rctsOupYn= other.getRctsOupYn();
			if ( _rctsOupYn== null ) { if ( __rctsOupYn!= null ) return false; }
			else if ( !_rctsOupYn.equals(__rctsOupYn) ) return false;
		}
		{
			Object _feeAm= getFeeAm();
			Object __feeAm= other.getFeeAm();
			if ( _feeAm== null ) { if ( __feeAm!= null ) return false; }
			else if ( !_feeAm.equals(__feeAm) ) return false;
		}
		{
			Object _wdrAcno= getWdrAcno();
			Object __wdrAcno= other.getWdrAcno();
			if ( _wdrAcno== null ) { if ( __wdrAcno!= null ) return false; }
			else if ( !_wdrAcno.equals(__wdrAcno) ) return false;
		}
		{
			Object _encyWdrActPwno= getEncyWdrActPwno();
			Object __encyWdrActPwno= other.getEncyWdrActPwno();
			if ( _encyWdrActPwno== null ) { if ( __encyWdrActPwno!= null ) return false; }
			else if ( !_encyWdrActPwno.equals(__encyWdrActPwno) ) return false;
		}
		{
			Object _xprRcvAcno= getXprRcvAcno();
			Object __xprRcvAcno= other.getXprRcvAcno();
			if ( _xprRcvAcno== null ) { if ( __xprRcvAcno!= null ) return false; }
			else if ( !_xprRcvAcno.equals(__xprRcvAcno) ) return false;
		}
		{
			Object _irprmTgt1Dscd= getIrprmTgt1Dscd();
			Object __irprmTgt1Dscd= other.getIrprmTgt1Dscd();
			if ( _irprmTgt1Dscd== null ) { if ( __irprmTgt1Dscd!= null ) return false; }
			else if ( !_irprmTgt1Dscd.equals(__irprmTgt1Dscd) ) return false;
		}
		{
			Object _irprmTgt2Dscd= getIrprmTgt2Dscd();
			Object __irprmTgt2Dscd= other.getIrprmTgt2Dscd();
			if ( _irprmTgt2Dscd== null ) { if ( __irprmTgt2Dscd!= null ) return false; }
			else if ( !_irprmTgt2Dscd.equals(__irprmTgt2Dscd) ) return false;
		}
		{
			Object _irprmTgt3Dscd= getIrprmTgt3Dscd();
			Object __irprmTgt3Dscd= other.getIrprmTgt3Dscd();
			if ( _irprmTgt3Dscd== null ) { if ( __irprmTgt3Dscd!= null ) return false; }
			else if ( !_irprmTgt3Dscd.equals(__irprmTgt3Dscd) ) return false;
		}
		{
			Object _irprmTgt4Dscd= getIrprmTgt4Dscd();
			Object __irprmTgt4Dscd= other.getIrprmTgt4Dscd();
			if ( _irprmTgt4Dscd== null ) { if ( __irprmTgt4Dscd!= null ) return false; }
			else if ( !_irprmTgt4Dscd.equals(__irprmTgt4Dscd) ) return false;
		}
		{
			Object _irprmTgt5Dscd= getIrprmTgt5Dscd();
			Object __irprmTgt5Dscd= other.getIrprmTgt5Dscd();
			if ( _irprmTgt5Dscd== null ) { if ( __irprmTgt5Dscd!= null ) return false; }
			else if ( !_irprmTgt5Dscd.equals(__irprmTgt5Dscd) ) return false;
		}
		{
			Object _irprmTgt6Dscd= getIrprmTgt6Dscd();
			Object __irprmTgt6Dscd= other.getIrprmTgt6Dscd();
			if ( _irprmTgt6Dscd== null ) { if ( __irprmTgt6Dscd!= null ) return false; }
			else if ( !_irprmTgt6Dscd.equals(__irprmTgt6Dscd) ) return false;
		}
		{
			Object _xprPrcMecd= getXprPrcMecd();
			Object __xprPrcMecd= other.getXprPrcMecd();
			if ( _xprPrcMecd== null ) { if ( __xprPrcMecd!= null ) return false; }
			else if ( !_xprPrcMecd.equals(__xprPrcMecd) ) return false;
		}
		{
			Object _dntnAtsAcno= getDntnAtsAcno();
			Object __dntnAtsAcno= other.getDntnAtsAcno();
			if ( _dntnAtsAcno== null ) { if ( __dntnAtsAcno!= null ) return false; }
			else if ( !_dntnAtsAcno.equals(__dntnAtsAcno) ) return false;
		}
		{
			Object _newFdDscd= getNewFdDscd();
			Object __newFdDscd= other.getNewFdDscd();
			if ( _newFdDscd== null ) { if ( __newFdDscd!= null ) return false; }
			else if ( !_newFdDscd.equals(__newFdDscd) ) return false;
		}
		{
			Object _spcfMonyTrtAcno= getSpcfMonyTrtAcno();
			Object __spcfMonyTrtAcno= other.getSpcfMonyTrtAcno();
			if ( _spcfMonyTrtAcno== null ) { if ( __spcfMonyTrtAcno!= null ) return false; }
			else if ( !_spcfMonyTrtAcno.equals(__spcfMonyTrtAcno) ) return false;
		}
		{
			Object _pnsnPayTemEstYn= getPnsnPayTemEstYn();
			Object __pnsnPayTemEstYn= other.getPnsnPayTemEstYn();
			if ( _pnsnPayTemEstYn== null ) { if ( __pnsnPayTemEstYn!= null ) return false; }
			else if ( !_pnsnPayTemEstYn.equals(__pnsnPayTemEstYn) ) return false;
		}
		{
			Object _pnsnPayCtrtmYcnt= getPnsnPayCtrtmYcnt();
			Object __pnsnPayCtrtmYcnt= other.getPnsnPayCtrtmYcnt();
			if ( _pnsnPayCtrtmYcnt== null ) { if ( __pnsnPayCtrtmYcnt!= null ) return false; }
			else if ( !_pnsnPayCtrtmYcnt.equals(__pnsnPayCtrtmYcnt) ) return false;
		}
		{
			Object _pnsnPayCycd= getPnsnPayCycd();
			Object __pnsnPayCycd= other.getPnsnPayCycd();
			if ( _pnsnPayCycd== null ) { if ( __pnsnPayCycd!= null ) return false; }
			else if ( !_pnsnPayCycd.equals(__pnsnPayCycd) ) return false;
		}
		{
			Object _lnoActPbokIssuYn= getLnoActPbokIssuYn();
			Object __lnoActPbokIssuYn= other.getLnoActPbokIssuYn();
			if ( _lnoActPbokIssuYn== null ) { if ( __lnoActPbokIssuYn!= null ) return false; }
			else if ( !_lnoActPbokIssuYn.equals(__lnoActPbokIssuYn) ) return false;
		}
		{
			Object _bscAcno= getBscAcno();
			Object __bscAcno= other.getBscAcno();
			if ( _bscAcno== null ) { if ( __bscAcno!= null ) return false; }
			else if ( !_bscAcno.equals(__bscAcno) ) return false;
		}
		{
			Object _oldAtrbXtRncd= getOldAtrbXtRncd();
			Object __oldAtrbXtRncd= other.getOldAtrbXtRncd();
			if ( _oldAtrbXtRncd== null ) { if ( __oldAtrbXtRncd!= null ) return false; }
			else if ( !_oldAtrbXtRncd.equals(__oldAtrbXtRncd) ) return false;
		}
		{
			Object _cpblChckTgtYn= getCpblChckTgtYn();
			Object __cpblChckTgtYn= other.getCpblChckTgtYn();
			if ( _cpblChckTgtYn== null ) { if ( __cpblChckTgtYn!= null ) return false; }
			else if ( !_cpblChckTgtYn.equals(__cpblChckTgtYn) ) return false;
		}
		{
			Object _rpcmDpstTgtYn= getRpcmDpstTgtYn();
			Object __rpcmDpstTgtYn= other.getRpcmDpstTgtYn();
			if ( _rpcmDpstTgtYn== null ) { if ( __rpcmDpstTgtYn!= null ) return false; }
			else if ( !_rpcmDpstTgtYn.equals(__rpcmDpstTgtYn) ) return false;
		}
		{
			Object _oldAtrbCeoRgsrDrtrYn= getOldAtrbCeoRgsrDrtrYn();
			Object __oldAtrbCeoRgsrDrtrYn= other.getOldAtrbCeoRgsrDrtrYn();
			if ( _oldAtrbCeoRgsrDrtrYn== null ) { if ( __oldAtrbCeoRgsrDrtrYn!= null ) return false; }
			else if ( !_oldAtrbCeoRgsrDrtrYn.equals(__oldAtrbCeoRgsrDrtrYn) ) return false;
		}
		{
			Object _oldAtrbApvNo= getOldAtrbApvNo();
			Object __oldAtrbApvNo= other.getOldAtrbApvNo();
			if ( _oldAtrbApvNo== null ) { if ( __oldAtrbApvNo!= null ) return false; }
			else if ( !_oldAtrbApvNo.equals(__oldAtrbApvNo) ) return false;
		}
		{
			Object _rdepAcno= getRdepAcno();
			Object __rdepAcno= other.getRdepAcno();
			if ( _rdepAcno== null ) { if ( __rdepAcno!= null ) return false; }
			else if ( !_rdepAcno.equals(__rdepAcno) ) return false;
		}
		{
			Object _oldAtrbApvRsn= getOldAtrbApvRsn();
			Object __oldAtrbApvRsn= other.getOldAtrbApvRsn();
			if ( _oldAtrbApvRsn== null ) { if ( __oldAtrbApvRsn!= null ) return false; }
			else if ( !_oldAtrbApvRsn.equals(__oldAtrbApvRsn) ) return false;
		}
		{
			Object _oldAtrbChckTim= getOldAtrbChckTim();
			Object __oldAtrbChckTim= other.getOldAtrbChckTim();
			if ( _oldAtrbChckTim== null ) { if ( __oldAtrbChckTim!= null ) return false; }
			else if ( !_oldAtrbChckTim.equals(__oldAtrbChckTim) ) return false;
		}
		{
			Object _ccadRsltInqYn= getCcadRsltInqYn();
			Object __ccadRsltInqYn= other.getCcadRsltInqYn();
			if ( _ccadRsltInqYn== null ) { if ( __ccadRsltInqYn!= null ) return false; }
			else if ( !_ccadRsltInqYn.equals(__ccadRsltInqYn) ) return false;
		}
		{
			Object _tbkCcadHldgYn= getTbkCcadHldgYn();
			Object __tbkCcadHldgYn= other.getTbkCcadHldgYn();
			if ( _tbkCcadHldgYn== null ) { if ( __tbkCcadHldgYn!= null ) return false; }
			else if ( !_tbkCcadHldgYn.equals(__tbkCcadHldgYn) ) return false;
		}
		{
			Object _cadStlActTbkYn= getCadStlActTbkYn();
			Object __cadStlActTbkYn= other.getCadStlActTbkYn();
			if ( _cadStlActTbkYn== null ) { if ( __cadStlActTbkYn!= null ) return false; }
			else if ( !_cadStlActTbkYn.equals(__cadStlActTbkYn) ) return false;
		}
		{
			Object _ccadBasRsltAm= getCcadBasRsltAm();
			Object __ccadBasRsltAm= other.getCcadBasRsltAm();
			if ( _ccadBasRsltAm== null ) { if ( __ccadBasRsltAm!= null ) return false; }
			else if ( !_ccadBasRsltAm.equals(__ccadBasRsltAm) ) return false;
		}
		{
			Object _utzRsltBasStaDt= getUtzRsltBasStaDt();
			Object __utzRsltBasStaDt= other.getUtzRsltBasStaDt();
			if ( _utzRsltBasStaDt== null ) { if ( __utzRsltBasStaDt!= null ) return false; }
			else if ( !_utzRsltBasStaDt.equals(__utzRsltBasStaDt) ) return false;
		}
		{
			Object _utzRsltBasEndDt= getUtzRsltBasEndDt();
			Object __utzRsltBasEndDt= other.getUtzRsltBasEndDt();
			if ( _utzRsltBasEndDt== null ) { if ( __utzRsltBasEndDt!= null ) return false; }
			else if ( !_utzRsltBasEndDt.equals(__utzRsltBasEndDt) ) return false;
		}
		{
			Object _utzRsltInqTim= getUtzRsltInqTim();
			Object __utzRsltInqTim= other.getUtzRsltInqTim();
			if ( _utzRsltInqTim== null ) { if ( __utzRsltInqTim!= null ) return false; }
			else if ( !_utzRsltInqTim.equals(__utzRsltInqTim) ) return false;
		}
		{
			Object _amfRispeDis= getAmfRispeDis();
			Object __amfRispeDis= other.getAmfRispeDis();
			if ( _amfRispeDis== null ) { if ( __amfRispeDis!= null ) return false; }
			else if ( !_amfRispeDis.equals(__amfRispeDis) ) return false;
		}
		{
			Object _amfRispeFnm= getAmfRispeFnm();
			Object __amfRispeFnm= other.getAmfRispeFnm();
			if ( _amfRispeFnm== null ) { if ( __amfRispeFnm!= null ) return false; }
			else if ( !_amfRispeFnm.equals(__amfRispeFnm) ) return false;
		}
		{
			Object _amfRispeRrno= getAmfRispeRrno();
			Object __amfRispeRrno= other.getAmfRispeRrno();
			if ( _amfRispeRrno== null ) { if ( __amfRispeRrno!= null ) return false; }
			else if ( !_amfRispeRrno.equals(__amfRispeRrno) ) return false;
		}
		{
			Object _amfRispeCnad= getAmfRispeCnad();
			Object __amfRispeCnad= other.getAmfRispeCnad();
			if ( _amfRispeCnad== null ) { if ( __amfRispeCnad!= null ) return false; }
			else if ( !_amfRispeCnad.equals(__amfRispeCnad) ) return false;
		}
		{
			Object _anrvNprcYn= getAnrvNprcYn();
			Object __anrvNprcYn= other.getAnrvNprcYn();
			if ( _anrvNprcYn== null ) { if ( __anrvNprcYn!= null ) return false; }
			else if ( !_anrvNprcYn.equals(__anrvNprcYn) ) return false;
		}
		{
			Object _pbamAcno= getPbamAcno();
			Object __pbamAcno= other.getPbamAcno();
			if ( _pbamAcno== null ) { if ( __pbamAcno!= null ) return false; }
			else if ( !_pbamAcno.equals(__pbamAcno) ) return false;
		}
		{
			Object _pbamSnnmAcno= getPbamSnnmAcno();
			Object __pbamSnnmAcno= other.getPbamSnnmAcno();
			if ( _pbamSnnmAcno== null ) { if ( __pbamSnnmAcno!= null ) return false; }
			else if ( !_pbamSnnmAcno.equals(__pbamSnnmAcno) ) return false;
		}
		{
			Object _pmnyTrnUnqNo= getPmnyTrnUnqNo();
			Object __pmnyTrnUnqNo= other.getPmnyTrnUnqNo();
			if ( _pmnyTrnUnqNo== null ) { if ( __pmnyTrnUnqNo!= null ) return false; }
			else if ( !_pmnyTrnUnqNo.equals(__pmnyTrnUnqNo) ) return false;
		}
		{
			Object _ctrtmMcn= getCtrtmMcn();
			Object __ctrtmMcn= other.getCtrtmMcn();
			if ( _ctrtmMcn== null ) { if ( __ctrtmMcn!= null ) return false; }
			else if ( !_ctrtmMcn.equals(__ctrtmMcn) ) return false;
		}
		{
			Object _ctrtmDcnt= getCtrtmDcnt();
			Object __ctrtmDcnt= other.getCtrtmDcnt();
			if ( _ctrtmDcnt== null ) { if ( __ctrtmDcnt!= null ) return false; }
			else if ( !_ctrtmDcnt.equals(__ctrtmDcnt) ) return false;
		}
		{
			Object _xprDt= getXprDt();
			Object __xprDt= other.getXprDt();
			if ( _xprDt== null ) { if ( __xprDt!= null ) return false; }
			else if ( !_xprDt.equals(__xprDt) ) return false;
		}
		{
			Object _rcknDt= getRcknDt();
			Object __rcknDt= other.getRcknDt();
			if ( _rcknDt== null ) { if ( __rcknDt!= null ) return false; }
			else if ( !_rcknDt.equals(__rcknDt) ) return false;
		}
		{
			Object _encyAtsActPwno= getEncyAtsActPwno();
			Object __encyAtsActPwno= other.getEncyAtsActPwno();
			if ( _encyAtsActPwno== null ) { if ( __encyAtsActPwno!= null ) return false; }
			else if ( !_encyAtsActPwno.equals(__encyAtsActPwno) ) return false;
		}
		{
			Object _atsCycd= getAtsCycd();
			Object __atsCycd= other.getAtsCycd();
			if ( _atsCycd== null ) { if ( __atsCycd!= null ) return false; }
			else if ( !_atsCycd.equals(__atsCycd) ) return false;
		}
		{
			Object _atsStaDt= getAtsStaDt();
			Object __atsStaDt= other.getAtsStaDt();
			if ( _atsStaDt== null ) { if ( __atsStaDt!= null ) return false; }
			else if ( !_atsStaDt.equals(__atsStaDt) ) return false;
		}
		{
			Object _atsEndDt= getAtsEndDt();
			Object __atsEndDt= other.getAtsEndDt();
			if ( _atsEndDt== null ) { if ( __atsEndDt!= null ) return false; }
			else if ( !_atsEndDt.equals(__atsEndDt) ) return false;
		}
		{
			Object _atsCucd= getAtsCucd();
			Object __atsCucd= other.getAtsCucd();
			if ( _atsCucd== null ) { if ( __atsCucd!= null ) return false; }
			else if ( !_atsCucd.equals(__atsCucd) ) return false;
		}
		{
			Object _atsDd= getAtsDd();
			Object __atsDd= other.getAtsDd();
			if ( _atsDd== null ) { if ( __atsDd!= null ) return false; }
			else if ( !_atsDd.equals(__atsDd) ) return false;
		}
		{
			Object _atsMecn= getAtsMecn();
			Object __atsMecn= other.getAtsMecn();
			if ( _atsMecn== null ) { if ( __atsMecn!= null ) return false; }
			else if ( !_atsMecn.equals(__atsMecn) ) return false;
		}
		{
			Object _atsAcno= getAtsAcno();
			Object __atsAcno= other.getAtsAcno();
			if ( _atsAcno== null ) { if ( __atsAcno!= null ) return false; }
			else if ( !_atsAcno.equals(__atsAcno) ) return false;
		}
		{
			Object _atsAm= getAtsAm();
			Object __atsAm= other.getAtsAm();
			if ( _atsAm== null ) { if ( __atsAm!= null ) return false; }
			else if ( !_atsAm.equals(__atsAm) ) return false;
		}
		{
			Object _tbkSltCopCd= getTbkSltCopCd();
			Object __tbkSltCopCd= other.getTbkSltCopCd();
			if ( _tbkSltCopCd== null ) { if ( __tbkSltCopCd!= null ) return false; }
			else if ( !_tbkSltCopCd.equals(__tbkSltCopCd) ) return false;
		}
		{
			Object _tbkSltCopOfemYn= getTbkSltCopOfemYn();
			Object __tbkSltCopOfemYn= other.getTbkSltCopOfemYn();
			if ( _tbkSltCopOfemYn== null ) { if ( __tbkSltCopOfemYn!= null ) return false; }
			else if ( !_tbkSltCopOfemYn.equals(__tbkSltCopOfemYn) ) return false;
		}
		{
			Object _dntnRqYn= getDntnRqYn();
			Object __dntnRqYn= other.getDntnRqYn();
			if ( _dntnRqYn== null ) { if ( __dntnRqYn!= null ) return false; }
			else if ( !_dntnRqYn.equals(__dntnRqYn) ) return false;
		}
		{
			Object _dntnAmDscd= getDntnAmDscd();
			Object __dntnAmDscd= other.getDntnAmDscd();
			if ( _dntnAmDscd== null ) { if ( __dntnAmDscd!= null ) return false; }
			else if ( !_dntnAmDscd.equals(__dntnAmDscd) ) return false;
		}
		{
			Object _dntnAm= getDntnAm();
			Object __dntnAm= other.getDntnAm();
			if ( _dntnAm== null ) { if ( __dntnAm!= null ) return false; }
			else if ( !_dntnAm.equals(__dntnAm) ) return false;
		}
		{
			Object _xprCancRcvAcno= getXprCancRcvAcno();
			Object __xprCancRcvAcno= other.getXprCancRcvAcno();
			if ( _xprCancRcvAcno== null ) { if ( __xprCancRcvAcno!= null ) return false; }
			else if ( !_xprCancRcvAcno.equals(__xprCancRcvAcno) ) return false;
		}
		{
			Object _bchrCponNo= getBchrCponNo();
			Object __bchrCponNo= other.getBchrCponNo();
			if ( _bchrCponNo== null ) { if ( __bchrCponNo!= null ) return false; }
			else if ( !_bchrCponNo.equals(__bchrCponNo) ) return false;
		}
		{
			Object _bchrSupAm= getBchrSupAm();
			Object __bchrSupAm= other.getBchrSupAm();
			if ( _bchrSupAm== null ) { if ( __bchrSupAm!= null ) return false; }
			else if ( !_bchrSupAm.equals(__bchrSupAm) ) return false;
		}
		{
			Object _bchrCusPidAm= getBchrCusPidAm();
			Object __bchrCusPidAm= other.getBchrCusPidAm();
			if ( _bchrCusPidAm== null ) { if ( __bchrCusPidAm!= null ) return false; }
			else if ( !_bchrCusPidAm.equals(__bchrCusPidAm) ) return false;
		}
		{
			Object _apvNo= getApvNo();
			Object __apvNo= other.getApvNo();
			if ( _apvNo== null ) { if ( __apvNo!= null ) return false; }
			else if ( !_apvNo.equals(__apvNo) ) return false;
		}
		{
			Object _cponCrtfNo= getCponCrtfNo();
			Object __cponCrtfNo= other.getCponCrtfNo();
			if ( _cponCrtfNo== null ) { if ( __cponCrtfNo!= null ) return false; }
			else if ( !_cponCrtfNo.equals(__cponCrtfNo) ) return false;
		}
		{
			Object _autoRdepYn= getAutoRdepYn();
			Object __autoRdepYn= other.getAutoRdepYn();
			if ( _autoRdepYn== null ) { if ( __autoRdepYn!= null ) return false; }
			else if ( !_autoRdepYn.equals(__autoRdepYn) ) return false;
		}
		{
			Object _insuJnngAgrYn= getInsuJnngAgrYn();
			Object __insuJnngAgrYn= other.getInsuJnngAgrYn();
			if ( _insuJnngAgrYn== null ) { if ( __insuJnngAgrYn!= null ) return false; }
			else if ( !_insuJnngAgrYn.equals(__insuJnngAgrYn) ) return false;
		}
		{
			Object _jnngTgtDscd= getJnngTgtDscd();
			Object __jnngTgtDscd= other.getJnngTgtDscd();
			if ( _jnngTgtDscd== null ) { if ( __jnngTgtDscd!= null ) return false; }
			else if ( !_jnngTgtDscd.equals(__jnngTgtDscd) ) return false;
		}
		{
			Object _ccadHldgYn= getCcadHldgYn();
			Object __ccadHldgYn= other.getCcadHldgYn();
			if ( _ccadHldgYn== null ) { if ( __ccadHldgYn!= null ) return false; }
			else if ( !_ccadHldgYn.equals(__ccadHldgYn) ) return false;
		}
		{
			Object _frcsDshgDt= getFrcsDshgDt();
			Object __frcsDshgDt= other.getFrcsDshgDt();
			if ( _frcsDshgDt== null ) { if ( __frcsDshgDt!= null ) return false; }
			else if ( !_frcsDshgDt.equals(__frcsDshgDt) ) return false;
		}
		{
			Object _cusDgnPrdNm= getCusDgnPrdNm();
			Object __cusDgnPrdNm= other.getCusDgnPrdNm();
			if ( _cusDgnPrdNm== null ) { if ( __cusDgnPrdNm!= null ) return false; }
			else if ( !_cusDgnPrdNm.equals(__cusDgnPrdNm) ) return false;
		}
		{
			Object _xcoCd= getXcoCd();
			Object __xcoCd= other.getXcoCd();
			if ( _xcoCd== null ) { if ( __xcoCd!= null ) return false; }
			else if ( !_xcoCd.equals(__xcoCd) ) return false;
		}
		{
			Object _frndAcno= getFrndAcno();
			Object __frndAcno= other.getFrndAcno();
			if ( _frndAcno== null ) { if ( __frndAcno!= null ) return false; }
			else if ( !_frndAcno.equals(__frndAcno) ) return false;
		}
		{
			Object _spdtDgnMm= getSpdtDgnMm();
			Object __spdtDgnMm= other.getSpdtDgnMm();
			if ( _spdtDgnMm== null ) { if ( __spdtDgnMm!= null ) return false; }
			else if ( !_spdtDgnMm.equals(__spdtDgnMm) ) return false;
		}
		{
			Object _spdtDgnDd= getSpdtDgnDd();
			Object __spdtDgnDd= other.getSpdtDgnDd();
			if ( _spdtDgnDd== null ) { if ( __spdtDgnDd!= null ) return false; }
			else if ( !_spdtDgnDd.equals(__spdtDgnDd) ) return false;
		}
		{
			Object _aplIr= getAplIr();
			Object __aplIr= other.getAplIr();
			if ( _aplIr== null ) { if ( __aplIr!= null ) return false; }
			else if ( !_aplIr.equals(__aplIr) ) return false;
		}
		{
			Object _emlFpAcblNtfcRqYn= getEmlFpAcblNtfcRqYn();
			Object __emlFpAcblNtfcRqYn= other.getEmlFpAcblNtfcRqYn();
			if ( _emlFpAcblNtfcRqYn== null ) { if ( __emlFpAcblNtfcRqYn!= null ) return false; }
			else if ( !_emlFpAcblNtfcRqYn.equals(__emlFpAcblNtfcRqYn) ) return false;
		}
		{
			Object _emlFpAcblNtfcBsdt= getEmlFpAcblNtfcBsdt();
			Object __emlFpAcblNtfcBsdt= other.getEmlFpAcblNtfcBsdt();
			if ( _emlFpAcblNtfcBsdt== null ) { if ( __emlFpAcblNtfcBsdt!= null ) return false; }
			else if ( !_emlFpAcblNtfcBsdt.equals(__emlFpAcblNtfcBsdt) ) return false;
		}
		{
			Object _fpPrftRtSmsNtfcRqYn= getFpPrftRtSmsNtfcRqYn();
			Object __fpPrftRtSmsNtfcRqYn= other.getFpPrftRtSmsNtfcRqYn();
			if ( _fpPrftRtSmsNtfcRqYn== null ) { if ( __fpPrftRtSmsNtfcRqYn!= null ) return false; }
			else if ( !_fpPrftRtSmsNtfcRqYn.equals(__fpPrftRtSmsNtfcRqYn) ) return false;
		}
		{
			Object _fpPrftRtSmsNtfcBsdt= getFpPrftRtSmsNtfcBsdt();
			Object __fpPrftRtSmsNtfcBsdt= other.getFpPrftRtSmsNtfcBsdt();
			if ( _fpPrftRtSmsNtfcBsdt== null ) { if ( __fpPrftRtSmsNtfcBsdt!= null ) return false; }
			else if ( !_fpPrftRtSmsNtfcBsdt.equals(__fpPrftRtSmsNtfcBsdt) ) return false;
		}
		{
			Object _goalPrSmsRqYn= getGoalPrSmsRqYn();
			Object __goalPrSmsRqYn= other.getGoalPrSmsRqYn();
			if ( _goalPrSmsRqYn== null ) { if ( __goalPrSmsRqYn!= null ) return false; }
			else if ( !_goalPrSmsRqYn.equals(__goalPrSmsRqYn) ) return false;
		}
		{
			Object _goalPr= getGoalPr();
			Object __goalPr= other.getGoalPr();
			if ( _goalPr== null ) { if ( __goalPr!= null ) return false; }
			else if ( !_goalPr.equals(__goalPr) ) return false;
		}
		{
			Object _alwPr= getAlwPr();
			Object __alwPr= other.getAlwPr();
			if ( _alwPr== null ) { if ( __alwPr!= null ) return false; }
			else if ( !_alwPr.equals(__alwPr) ) return false;
		}
		{
			Object _gBnkgGoalPrftRtDscd= getgBnkgGoalPrftRtDscd();
			Object __gBnkgGoalPrftRtDscd= other.getgBnkgGoalPrftRtDscd();
			if ( _gBnkgGoalPrftRtDscd== null ) { if ( __gBnkgGoalPrftRtDscd!= null ) return false; }
			else if ( !_gBnkgGoalPrftRtDscd.equals(__gBnkgGoalPrftRtDscd) ) return false;
		}
		{
			Object _gBnkgAlwLossDscd= getgBnkgAlwLossDscd();
			Object __gBnkgAlwLossDscd= other.getgBnkgAlwLossDscd();
			if ( _gBnkgAlwLossDscd== null ) { if ( __gBnkgAlwLossDscd!= null ) return false; }
			else if ( !_gBnkgAlwLossDscd.equals(__gBnkgAlwLossDscd) ) return false;
		}
		{
			Object _fcPsklUseYn= getFcPsklUseYn();
			Object __fcPsklUseYn= other.getFcPsklUseYn();
			if ( _fcPsklUseYn== null ) { if ( __fcPsklUseYn!= null ) return false; }
			else if ( !_fcPsklUseYn.equals(__fcPsklUseYn) ) return false;
		}
		{
			Object _xrtTsTycd= getXrtTsTycd();
			Object __xrtTsTycd= other.getXrtTsTycd();
			if ( _xrtTsTycd== null ) { if ( __xrtTsTycd!= null ) return false; }
			else if ( !_xrtTsTycd.equals(__xrtTsTycd) ) return false;
		}
		{
			Object _xrtMaxAcldAm= getXrtMaxAcldAm();
			Object __xrtMaxAcldAm= other.getXrtMaxAcldAm();
			if ( _xrtMaxAcldAm== null ) { if ( __xrtMaxAcldAm!= null ) return false; }
			else if ( !_xrtMaxAcldAm.equals(__xrtMaxAcldAm) ) return false;
		}
		{
			Object _dgnXrtNtfcSrvcDscd= getDgnXrtNtfcSrvcDscd();
			Object __dgnXrtNtfcSrvcDscd= other.getDgnXrtNtfcSrvcDscd();
			if ( _dgnXrtNtfcSrvcDscd== null ) { if ( __dgnXrtNtfcSrvcDscd!= null ) return false; }
			else if ( !_dgnXrtNtfcSrvcDscd.equals(__dgnXrtNtfcSrvcDscd) ) return false;
		}
		{
			Object _ntfcSrvcDgnXrt= getNtfcSrvcDgnXrt();
			Object __ntfcSrvcDgnXrt= other.getNtfcSrvcDgnXrt();
			if ( _ntfcSrvcDgnXrt== null ) { if ( __ntfcSrvcDgnXrt!= null ) return false; }
			else if ( !_ntfcSrvcDgnXrt.equals(__ntfcSrvcDgnXrt) ) return false;
		}
		{
			Object _ovtbCdno= getOvtbCdno();
			Object __ovtbCdno= other.getOvtbCdno();
			if ( _ovtbCdno== null ) { if ( __ovtbCdno!= null ) return false; }
			else if ( !_ovtbCdno.equals(__ovtbCdno) ) return false;
		}
		{
			Object _fmbkCoNo= getFmbkCoNo();
			Object __fmbkCoNo= other.getFmbkCoNo();
			if ( _fmbkCoNo== null ) { if ( __fmbkCoNo!= null ) return false; }
			else if ( !_fmbkCoNo.equals(__fmbkCoNo) ) return false;
		}
		{
			Object _atrnDscd= getAtrnDscd();
			Object __atrnDscd= other.getAtrnDscd();
			if ( _atrnDscd== null ) { if ( __atrnDscd!= null ) return false; }
			else if ( !_atrnDscd.equals(__atrnDscd) ) return false;
		}
		{
			Object _rvactNo= getRvactNo();
			Object __rvactNo= other.getRvactNo();
			if ( _rvactNo== null ) { if ( __rvactNo!= null ) return false; }
			else if ( !_rvactNo.equals(__rvactNo) ) return false;
		}
		{
			Object _irRotCycd= getIrRotCycd();
			Object __irRotCycd= other.getIrRotCycd();
			if ( _irRotCycd== null ) { if ( __irRotCycd!= null ) return false; }
			else if ( !_irRotCycd.equals(__irRotCycd) ) return false;
		}
		{
			Object _fcfndInfwDscd= getFcfndInfwDscd();
			Object __fcfndInfwDscd= other.getFcfndInfwDscd();
			if ( _fcfndInfwDscd== null ) { if ( __fcfndInfwDscd!= null ) return false; }
			else if ( !_fcfndInfwDscd.equals(__fcfndInfwDscd) ) return false;
		}
		{
			Object _fcDpsAccDscd= getFcDpsAccDscd();
			Object __fcDpsAccDscd= other.getFcDpsAccDscd();
			if ( _fcDpsAccDscd== null ) { if ( __fcDpsAccDscd!= null ) return false; }
			else if ( !_fcDpsAccDscd.equals(__fcDpsAccDscd) ) return false;
		}
		{
			Object _fornXchStttCrtcSbmtDis= getFornXchStttCrtcSbmtDis();
			Object __fornXchStttCrtcSbmtDis= other.getFornXchStttCrtcSbmtDis();
			if ( _fornXchStttCrtcSbmtDis== null ) { if ( __fornXchStttCrtcSbmtDis!= null ) return false; }
			else if ( !_fornXchStttCrtcSbmtDis.equals(__fornXchStttCrtcSbmtDis) ) return false;
		}
		{
			Object _fxRapRncd= getFxRapRncd();
			Object __fxRapRncd= other.getFxRapRncd();
			if ( _fxRapRncd== null ) { if ( __fxRapRncd!= null ) return false; }
			else if ( !_fxRapRncd.equals(__fxRapRncd) ) return false;
		}
		{
			Object _payRncdCfcd= getPayRncdCfcd();
			Object __payRncdCfcd= other.getPayRncdCfcd();
			if ( _payRncdCfcd== null ) { if ( __payRncdCfcd!= null ) return false; }
			else if ( !_payRncdCfcd.equals(__payRncdCfcd) ) return false;
		}
		{
			Object _hsCd= getHsCd();
			Object __hsCd= other.getHsCd();
			if ( _hsCd== null ) { if ( __hsCd!= null ) return false; }
			else if ( !_hsCd.equals(__hsCd) ) return false;
		}
		{
			Object _ivpeId= getIvpeId();
			Object __ivpeId= other.getIvpeId();
			if ( _ivpeId== null ) { if ( __ivpeId!= null ) return false; }
			else if ( !_ivpeId.equals(__ivpeId) ) return false;
		}
		{
			Object _secrComNm= getSecrComNm();
			Object __secrComNm= other.getSecrComNm();
			if ( _secrComNm== null ) { if ( __secrComNm!= null ) return false; }
			else if ( !_secrComNm.equals(__secrComNm) ) return false;
		}
		{
			Object _fcApvCd= getFcApvCd();
			Object __fcApvCd= other.getFcApvCd();
			if ( _fcApvCd== null ) { if ( __fcApvCd!= null ) return false; }
			else if ( !_fcApvCd.equals(__fcApvCd) ) return false;
		}
		{
			Object _pnsnAcldCtrYcnt= getPnsnAcldCtrYcnt();
			Object __pnsnAcldCtrYcnt= other.getPnsnAcldCtrYcnt();
			if ( _pnsnAcldCtrYcnt== null ) { if ( __pnsnAcldCtrYcnt!= null ) return false; }
			else if ( !_pnsnAcldCtrYcnt.equals(__pnsnAcldCtrYcnt) ) return false;
		}
		{
			Object _pnsnAcldCtrMcn= getPnsnAcldCtrMcn();
			Object __pnsnAcldCtrMcn= other.getPnsnAcldCtrMcn();
			if ( _pnsnAcldCtrMcn== null ) { if ( __pnsnAcldCtrMcn!= null ) return false; }
			else if ( !_pnsnAcldCtrMcn.equals(__pnsnAcldCtrMcn) ) return false;
		}
		{
			Object _pnsnRcveBgnDt= getPnsnRcveBgnDt();
			Object __pnsnRcveBgnDt= other.getPnsnRcveBgnDt();
			if ( _pnsnRcveBgnDt== null ) { if ( __pnsnRcveBgnDt!= null ) return false; }
			else if ( !_pnsnRcveBgnDt.equals(__pnsnRcveBgnDt) ) return false;
		}
		{
			Object _prftRtRptdSndDscd= getPrftRtRptdSndDscd();
			Object __prftRtRptdSndDscd= other.getPrftRtRptdSndDscd();
			if ( _prftRtRptdSndDscd== null ) { if ( __prftRtRptdSndDscd!= null ) return false; }
			else if ( !_prftRtRptdSndDscd.equals(__prftRtRptdSndDscd) ) return false;
		}
		{
			Object _rprhLnkNewYn= getRprhLnkNewYn();
			Object __rprhLnkNewYn= other.getRprhLnkNewYn();
			if ( _rprhLnkNewYn== null ) { if ( __rprhLnkNewYn!= null ) return false; }
			else if ( !_rprhLnkNewYn.equals(__rprhLnkNewYn) ) return false;
		}
		{
			Object _rprhLnkCancAcno= getRprhLnkCancAcno();
			Object __rprhLnkCancAcno= other.getRprhLnkCancAcno();
			if ( _rprhLnkCancAcno== null ) { if ( __rprhLnkCancAcno!= null ) return false; }
			else if ( !_rprhLnkCancAcno.equals(__rprhLnkCancAcno) ) return false;
		}
		{
			Object _rprhLnkTamNewYn= getRprhLnkTamNewYn();
			Object __rprhLnkTamNewYn= other.getRprhLnkTamNewYn();
			if ( _rprhLnkTamNewYn== null ) { if ( __rprhLnkTamNewYn!= null ) return false; }
			else if ( !_rprhLnkTamNewYn.equals(__rprhLnkTamNewYn) ) return false;
		}
		{
			Object _afepAddPidYn= getAfepAddPidYn();
			Object __afepAddPidYn= other.getAfepAddPidYn();
			if ( _afepAddPidYn== null ) { if ( __afepAddPidYn!= null ) return false; }
			else if ( !_afepAddPidYn.equals(__afepAddPidYn) ) return false;
		}
		{
			Object _fndPdcd= getFndPdcd();
			Object __fndPdcd= other.getFndPdcd();
			if ( _fndPdcd== null ) { if ( __fndPdcd!= null ) return false; }
			else if ( !_fndPdcd.equals(__fndPdcd) ) return false;
		}
		{
			Object _fndScntRqdcNprtYn= getFndScntRqdcNprtYn();
			Object __fndScntRqdcNprtYn= other.getFndScntRqdcNprtYn();
			if ( _fndScntRqdcNprtYn== null ) { if ( __fndScntRqdcNprtYn!= null ) return false; }
			else if ( !_fndScntRqdcNprtYn.equals(__fndScntRqdcNprtYn) ) return false;
		}
		{
			Object _opgPtsNtcSndDscd= getOpgPtsNtcSndDscd();
			Object __opgPtsNtcSndDscd= other.getOpgPtsNtcSndDscd();
			if ( _opgPtsNtcSndDscd== null ) { if ( __opgPtsNtcSndDscd!= null ) return false; }
			else if ( !_opgPtsNtcSndDscd.equals(__opgPtsNtcSndDscd) ) return false;
		}
		{
			Object _gBnkgGoalPrftRtPsnb= getgBnkgGoalPrftRtPsnb();
			Object __gBnkgGoalPrftRtPsnb= other.getgBnkgGoalPrftRtPsnb();
			if ( _gBnkgGoalPrftRtPsnb== null ) { if ( __gBnkgGoalPrftRtPsnb!= null ) return false; }
			else if ( !_gBnkgGoalPrftRtPsnb.equals(__gBnkgGoalPrftRtPsnb) ) return false;
		}
		{
			Object _gBnkgGoalPrftRtDcml= getgBnkgGoalPrftRtDcml();
			Object __gBnkgGoalPrftRtDcml= other.getgBnkgGoalPrftRtDcml();
			if ( _gBnkgGoalPrftRtDcml== null ) { if ( __gBnkgGoalPrftRtDcml!= null ) return false; }
			else if ( !_gBnkgGoalPrftRtDcml.equals(__gBnkgGoalPrftRtDcml) ) return false;
		}
		{
			Object _gBnkgAlwLossRtPsnb= getgBnkgAlwLossRtPsnb();
			Object __gBnkgAlwLossRtPsnb= other.getgBnkgAlwLossRtPsnb();
			if ( _gBnkgAlwLossRtPsnb== null ) { if ( __gBnkgAlwLossRtPsnb!= null ) return false; }
			else if ( !_gBnkgAlwLossRtPsnb.equals(__gBnkgAlwLossRtPsnb) ) return false;
		}
		{
			Object _gBnkgAlwLossRtDcml= getgBnkgAlwLossRtDcml();
			Object __gBnkgAlwLossRtDcml= other.getgBnkgAlwLossRtDcml();
			if ( _gBnkgAlwLossRtDcml== null ) { if ( __gBnkgAlwLossRtDcml!= null ) return false; }
			else if ( !_gBnkgAlwLossRtDcml.equals(__gBnkgAlwLossRtDcml) ) return false;
		}
		{
			Object _wooriOnwlMoAcno= getWooriOnwlMoAcno();
			Object __wooriOnwlMoAcno= other.getWooriOnwlMoAcno();
			if ( _wooriOnwlMoAcno== null ) { if ( __wooriOnwlMoAcno!= null ) return false; }
			else if ( !_wooriOnwlMoAcno.equals(__wooriOnwlMoAcno) ) return false;
		}
		{
			Object _bznUseActYn= getBznUseActYn();
			Object __bznUseActYn= other.getBznUseActYn();
			if ( _bznUseActYn== null ) { if ( __bznUseActYn!= null ) return false; }
			else if ( !_bznUseActYn.equals(__bznUseActYn) ) return false;
		}
		{
			Object _agnpeItcsno= getAgnpeItcsno();
			Object __agnpeItcsno= other.getAgnpeItcsno();
			if ( _agnpeItcsno== null ) { if ( __agnpeItcsno!= null ) return false; }
			else if ( !_agnpeItcsno.equals(__agnpeItcsno) ) return false;
		}
		{
			Object _rppeItcsno= getRppeItcsno();
			Object __rppeItcsno= other.getRppeItcsno();
			if ( _rppeItcsno== null ) { if ( __rppeItcsno!= null ) return false; }
			else if ( !_rppeItcsno.equals(__rppeItcsno) ) return false;
		}
		{
			Object _atsNaNtfcRqYn= getAtsNaNtfcRqYn();
			Object __atsNaNtfcRqYn= other.getAtsNaNtfcRqYn();
			if ( _atsNaNtfcRqYn== null ) { if ( __atsNaNtfcRqYn!= null ) return false; }
			else if ( !_atsNaNtfcRqYn.equals(__atsNaNtfcRqYn) ) return false;
		}
		{
			Object _acldFndTsXprNtfcRqYn= getAcldFndTsXprNtfcRqYn();
			Object __acldFndTsXprNtfcRqYn= other.getAcldFndTsXprNtfcRqYn();
			if ( _acldFndTsXprNtfcRqYn== null ) { if ( __acldFndTsXprNtfcRqYn!= null ) return false; }
			else if ( !_acldFndTsXprNtfcRqYn.equals(__acldFndTsXprNtfcRqYn) ) return false;
		}
		{
			Object _fwxcAcno= getFwxcAcno();
			Object __fwxcAcno= other.getFwxcAcno();
			if ( _fwxcAcno== null ) { if ( __fwxcAcno!= null ) return false; }
			else if ( !_fwxcAcno.equals(__fwxcAcno) ) return false;
		}
		{
			Object _fndCnvrTmntAcno= getFndCnvrTmntAcno();
			Object __fndCnvrTmntAcno= other.getFndCnvrTmntAcno();
			if ( _fndCnvrTmntAcno== null ) { if ( __fndCnvrTmntAcno!= null ) return false; }
			else if ( !_fndCnvrTmntAcno.equals(__fndCnvrTmntAcno) ) return false;
		}
		{
			Object _dvdamRinvDscd= getDvdamRinvDscd();
			Object __dvdamRinvDscd= other.getDvdamRinvDscd();
			if ( _dvdamRinvDscd== null ) { if ( __dvdamRinvDscd!= null ) return false; }
			else if ( !_dvdamRinvDscd.equals(__dvdamRinvDscd) ) return false;
		}
		{
			Object _fndCnvrNewYn= getFndCnvrNewYn();
			Object __fndCnvrNewYn= other.getFndCnvrNewYn();
			if ( _fndCnvrNewYn== null ) { if ( __fndCnvrNewYn!= null ) return false; }
			else if ( !_fndCnvrNewYn.equals(__fndCnvrNewYn) ) return false;
		}
		{
			Object _lonXprAdvnYn= getLonXprAdvnYn();
			Object __lonXprAdvnYn= other.getLonXprAdvnYn();
			if ( _lonXprAdvnYn== null ) { if ( __lonXprAdvnYn!= null ) return false; }
			else if ( !_lonXprAdvnYn.equals(__lonXprAdvnYn) ) return false;
		}
		{
			Object _lnApvCmplYn= getLnApvCmplYn();
			Object __lnApvCmplYn= other.getLnApvCmplYn();
			if ( _lnApvCmplYn== null ) { if ( __lnApvCmplYn!= null ) return false; }
			else if ( !_lnApvCmplYn.equals(__lnApvCmplYn) ) return false;
		}
		{
			Object _priPrpeBrNm= getPriPrpeBrNm();
			Object __priPrpeBrNm= other.getPriPrpeBrNm();
			if ( _priPrpeBrNm== null ) { if ( __priPrpeBrNm!= null ) return false; }
			else if ( !_priPrpeBrNm.equals(__priPrpeBrNm) ) return false;
		}
		{
			Object _grnTrno= getGrnTrno();
			Object __grnTrno= other.getGrnTrno();
			if ( _grnTrno== null ) { if ( __grnTrno!= null ) return false; }
			else if ( !_grnTrno.equals(__grnTrno) ) return false;
		}
		{
			Object _escrUnmrNo= getEscrUnmrNo();
			Object __escrUnmrNo= other.getEscrUnmrNo();
			if ( _escrUnmrNo== null ) { if ( __escrUnmrNo!= null ) return false; }
			else if ( !_escrUnmrNo.equals(__escrUnmrNo) ) return false;
		}
		{
			Object _priPrpeAcno= getPriPrpeAcno();
			Object __priPrpeAcno= other.getPriPrpeAcno();
			if ( _priPrpeAcno== null ) { if ( __priPrpeAcno!= null ) return false; }
			else if ( !_priPrpeAcno.equals(__priPrpeAcno) ) return false;
		}
		{
			Object _prpeAcno= getPrpeAcno();
			Object __prpeAcno= other.getPrpeAcno();
			if ( _prpeAcno== null ) { if ( __prpeAcno!= null ) return false; }
			else if ( !_prpeAcno.equals(__prpeAcno) ) return false;
		}
		{
			Object _priPrpeBzpeNo= getPriPrpeBzpeNo();
			Object __priPrpeBzpeNo= other.getPriPrpeBzpeNo();
			if ( _priPrpeBzpeNo== null ) { if ( __priPrpeBzpeNo!= null ) return false; }
			else if ( !_priPrpeBzpeNo.equals(__priPrpeBzpeNo) ) return false;
		}
		{
			Object _prpeBzpeNo= getPrpeBzpeNo();
			Object __prpeBzpeNo= other.getPrpeBzpeNo();
			if ( _prpeBzpeNo== null ) { if ( __prpeBzpeNo!= null ) return false; }
			else if ( !_prpeBzpeNo.equals(__prpeBzpeNo) ) return false;
		}
		{
			Object _ppmtAmRcveAcno= getPpmtAmRcveAcno();
			Object __ppmtAmRcveAcno= other.getPpmtAmRcveAcno();
			if ( _ppmtAmRcveAcno== null ) { if ( __ppmtAmRcveAcno!= null ) return false; }
			else if ( !_ppmtAmRcveAcno.equals(__ppmtAmRcveAcno) ) return false;
		}
		{
			Object _orcpPrpeCsno= getOrcpPrpeCsno();
			Object __orcpPrpeCsno= other.getOrcpPrpeCsno();
			if ( _orcpPrpeCsno== null ) { if ( __orcpPrpeCsno!= null ) return false; }
			else if ( !_orcpPrpeCsno.equals(__orcpPrpeCsno) ) return false;
		}
		{
			Object _pftPrpeCsno= getPftPrpeCsno();
			Object __pftPrpeCsno= other.getPftPrpeCsno();
			if ( _pftPrpeCsno== null ) { if ( __pftPrpeCsno!= null ) return false; }
			else if ( !_pftPrpeCsno.equals(__pftPrpeCsno) ) return false;
		}
		{
			Object _orcpPrpeNrsrCollYn= getOrcpPrpeNrsrCollYn();
			Object __orcpPrpeNrsrCollYn= other.getOrcpPrpeNrsrCollYn();
			if ( _orcpPrpeNrsrCollYn== null ) { if ( __orcpPrpeNrsrCollYn!= null ) return false; }
			else if ( !_orcpPrpeNrsrCollYn.equals(__orcpPrpeNrsrCollYn) ) return false;
		}
		{
			Object _pftPrpeNrsrCollYn= getPftPrpeNrsrCollYn();
			Object __pftPrpeNrsrCollYn= other.getPftPrpeNrsrCollYn();
			if ( _pftPrpeNrsrCollYn== null ) { if ( __pftPrpeNrsrCollYn!= null ) return false; }
			else if ( !_pftPrpeNrsrCollYn.equals(__pftPrpeNrsrCollYn) ) return false;
		}
		{
			Object _pocpPfeAm= getPocpPfeAm();
			Object __pocpPfeAm= other.getPocpPfeAm();
			if ( _pocpPfeAm== null ) { if ( __pocpPfeAm!= null ) return false; }
			else if ( !_pocpPfeAm.equals(__pocpPfeAm) ) return false;
		}
		{
			Object _etfTprt= getEtfTprt();
			Object __etfTprt= other.getEtfTprt();
			if ( _etfTprt== null ) { if ( __etfTprt!= null ) return false; }
			else if ( !_etfTprt.equals(__etfTprt) ) return false;
		}
		{
			Object _opgOrdsTxt= getOpgOrdsTxt();
			Object __opgOrdsTxt= other.getOpgOrdsTxt();
			if ( _opgOrdsTxt== null ) { if ( __opgOrdsTxt!= null ) return false; }
			else if ( !_opgOrdsTxt.equals(__opgOrdsTxt) ) return false;
		}
		{
			Object _sa1Txt= getSa1Txt();
			Object __sa1Txt= other.getSa1Txt();
			if ( _sa1Txt== null ) { if ( __sa1Txt!= null ) return false; }
			else if ( !_sa1Txt.equals(__sa1Txt) ) return false;
		}
		{
			Object _sa2Txt= getSa2Txt();
			Object __sa2Txt= other.getSa2Txt();
			if ( _sa2Txt== null ) { if ( __sa2Txt!= null ) return false; }
			else if ( !_sa2Txt.equals(__sa2Txt) ) return false;
		}
		{
			Object _sa3Txt= getSa3Txt();
			Object __sa3Txt= other.getSa3Txt();
			if ( _sa3Txt== null ) { if ( __sa3Txt!= null ) return false; }
			else if ( !_sa3Txt.equals(__sa3Txt) ) return false;
		}
		{
			Object _sptxYn= getSptxYn();
			Object __sptxYn= other.getSptxYn();
			if ( _sptxYn== null ) { if ( __sptxYn!= null ) return false; }
			else if ( !_sptxYn.equals(__sptxYn) ) return false;
		}
		{
			Object _nnmCsno= getNnmCsno();
			Object __nnmCsno= other.getNnmCsno();
			if ( _nnmCsno== null ) { if ( __nnmCsno!= null ) return false; }
			else if ( !_nnmCsno.equals(__nnmCsno) ) return false;
		}
		{
			Object _fndItmsCd= getFndItmsCd();
			Object __fndItmsCd= other.getFndItmsCd();
			if ( _fndItmsCd== null ) { if ( __fndItmsCd!= null ) return false; }
			else if ( !_fndItmsCd.equals(__fndItmsCd) ) return false;
		}
		{
			Object _dpsRcvAm= getDpsRcvAm();
			Object __dpsRcvAm= other.getDpsRcvAm();
			if ( _dpsRcvAm== null ) { if ( __dpsRcvAm!= null ) return false; }
			else if ( !_dpsRcvAm.equals(__dpsRcvAm) ) return false;
		}
		{
			Object _trfAm= getTrfAm();
			Object __trfAm= other.getTrfAm();
			if ( _trfAm== null ) { if ( __trfAm!= null ) return false; }
			else if ( !_trfAm.equals(__trfAm) ) return false;
		}
		{
			Object _bchkAm= getBchkAm();
			Object __bchkAm= other.getBchkAm();
			if ( _bchkAm== null ) { if ( __bchkAm!= null ) return false; }
			else if ( !_bchkAm.equals(__bchkAm) ) return false;
		}
		{
			Object _bchkInqmAm= getBchkInqmAm();
			Object __bchkInqmAm= other.getBchkInqmAm();
			if ( _bchkInqmAm== null ) { if ( __bchkInqmAm!= null ) return false; }
			else if ( !_bchkInqmAm.equals(__bchkInqmAm) ) return false;
		}
		{
			Object _inqmScnt= getInqmScnt();
			Object __inqmScnt= other.getInqmScnt();
			if ( _inqmScnt== null ) { if ( __inqmScnt!= null ) return false; }
			else if ( !_inqmScnt.equals(__inqmScnt) ) return false;
		}
		{
			Object _inqmFeeXmpDis= getInqmFeeXmpDis();
			Object __inqmFeeXmpDis= other.getInqmFeeXmpDis();
			if ( _inqmFeeXmpDis== null ) { if ( __inqmFeeXmpDis!= null ) return false; }
			else if ( !_inqmFeeXmpDis.equals(__inqmFeeXmpDis) ) return false;
		}
		{
			Object _tamTrfYn= getTamTrfYn();
			Object __tamTrfYn= other.getTamTrfYn();
			if ( _tamTrfYn== null ) { if ( __tamTrfYn!= null ) return false; }
			else if ( !_tamTrfYn.equals(__tamTrfYn) ) return false;
		}
		{
			Object _pxrt= getPxrt();
			Object __pxrt= other.getPxrt();
			if ( _pxrt== null ) { if ( __pxrt!= null ) return false; }
			else if ( !_pxrt.equals(__pxrt) ) return false;
		}
		{
			Object _krwTrfAm= getKrwTrfAm();
			Object __krwTrfAm= other.getKrwTrfAm();
			if ( _krwTrfAm== null ) { if ( __krwTrfAm!= null ) return false; }
			else if ( !_krwTrfAm.equals(__krwTrfAm) ) return false;
		}
		{
			Object _cucd= getCucd();
			Object __cucd= other.getCucd();
			if ( _cucd== null ) { if ( __cucd!= null ) return false; }
			else if ( !_cucd.equals(__cucd) ) return false;
		}
		{
			Object _ioffSbDscd= getIoffSbDscd();
			Object __ioffSbDscd= other.getIoffSbDscd();
			if ( _ioffSbDscd== null ) { if ( __ioffSbDscd!= null ) return false; }
			else if ( !_ioffSbDscd.equals(__ioffSbDscd) ) return false;
		}
		{
			Object _cshtfDscd= getCshtfDscd();
			Object __cshtfDscd= other.getCshtfDscd();
			if ( _cshtfDscd== null ) { if ( __cshtfDscd!= null ) return false; }
			else if ( !_cshtfDscd.equals(__cshtfDscd) ) return false;
		}
		{
			Object _cshFeeLevyDscd= getCshFeeLevyDscd();
			Object __cshFeeLevyDscd= other.getCshFeeLevyDscd();
			if ( _cshFeeLevyDscd== null ) { if ( __cshFeeLevyDscd!= null ) return false; }
			else if ( !_cshFeeLevyDscd.equals(__cshFeeLevyDscd) ) return false;
		}
		{
			Object _cshFee= getCshFee();
			Object __cshFee= other.getCshFee();
			if ( _cshFee== null ) { if ( __cshFee!= null ) return false; }
			else if ( !_cshFee.equals(__cshFee) ) return false;
		}
		{
			Object _tgtKrwAm= getTgtKrwAm();
			Object __tgtKrwAm= other.getTgtKrwAm();
			if ( _tgtKrwAm== null ) { if ( __tgtKrwAm!= null ) return false; }
			else if ( !_tgtKrwAm.equals(__tgtKrwAm) ) return false;
		}
		{
			Object _fcTrfAm= getFcTrfAm();
			Object __fcTrfAm= other.getFcTrfAm();
			if ( _fcTrfAm== null ) { if ( __fcTrfAm!= null ) return false; }
			else if ( !_fcTrfAm.equals(__fcTrfAm) ) return false;
		}
		{
			Object _fcCshRcvAm= getFcCshRcvAm();
			Object __fcCshRcvAm= other.getFcCshRcvAm();
			if ( _fcCshRcvAm== null ) { if ( __fcCshRcvAm!= null ) return false; }
			else if ( !_fcCshRcvAm.equals(__fcCshRcvAm) ) return false;
		}
		{
			Object _coinAm= getCoinAm();
			Object __coinAm= other.getCoinAm();
			if ( _coinAm== null ) { if ( __coinAm!= null ) return false; }
			else if ( !_coinAm.equals(__coinAm) ) return false;
		}
		{
			Object _krfd= getKrfd();
			Object __krfd= other.getKrfd();
			if ( _krfd== null ) { if ( __krfd!= null ) return false; }
			else if ( !_krfd.equals(__krfd) ) return false;
		}
		{
			Object _apxrt= getApxrt();
			Object __apxrt= other.getApxrt();
			if ( _apxrt== null ) { if ( __apxrt!= null ) return false; }
			else if ( !_apxrt.equals(__apxrt) ) return false;
		}
		{
			Object _cusPrmeXrt= getCusPrmeXrt();
			Object __cusPrmeXrt= other.getCusPrmeXrt();
			if ( _cusPrmeXrt== null ) { if ( __cusPrmeXrt!= null ) return false; }
			else if ( !_cusPrmeXrt.equals(__cusPrmeXrt) ) return false;
		}
		{
			Object _ioffSbRt= getIoffSbRt();
			Object __ioffSbRt= other.getIoffSbRt();
			if ( _ioffSbRt== null ) { if ( __ioffSbRt!= null ) return false; }
			else if ( !_ioffSbRt.equals(__ioffSbRt) ) return false;
		}
		{
			Object _fwxcCtrMcnt= getFwxcCtrMcnt();
			Object __fwxcCtrMcnt= other.getFwxcCtrMcnt();
			if ( _fwxcCtrMcnt== null ) { if ( __fwxcCtrMcnt!= null ) return false; }
			else if ( !_fwxcCtrMcnt.equals(__fwxcCtrMcnt) ) return false;
		}
		{
			Object _newAcno= getNewAcno();
			Object __newAcno= other.getNewAcno();
			if ( _newAcno== null ) { if ( __newAcno!= null ) return false; }
			else if ( !_newAcno.equals(__newAcno) ) return false;
		}
		{
			Object _ksdFndNo= getKsdFndNo();
			Object __ksdFndNo= other.getKsdFndNo();
			if ( _ksdFndNo== null ) { if ( __ksdFndNo!= null ) return false; }
			else if ( !_ksdFndNo.equals(__ksdFndNo) ) return false;
		}
		{
			Object _rtpenTrnDisNo= getRtpenTrnDisNo();
			Object __rtpenTrnDisNo= other.getRtpenTrnDisNo();
			if ( _rtpenTrnDisNo== null ) { if ( __rtpenTrnDisNo!= null ) return false; }
			else if ( !_rtpenTrnDisNo.equals(__rtpenTrnDisNo) ) return false;
		}
		{
			Object _rcmGoalAm= getRcmGoalAm();
			Object __rcmGoalAm= other.getRcmGoalAm();
			if ( _rcmGoalAm== null ) { if ( __rcmGoalAm!= null ) return false; }
			else if ( !_rcmGoalAm.equals(__rcmGoalAm) ) return false;
		}
		{
			Object _jnngCtgrCd= getJnngCtgrCd();
			Object __jnngCtgrCd= other.getJnngCtgrCd();
			if ( _jnngCtgrCd== null ) { if ( __jnngCtgrCd!= null ) return false; }
			else if ( !_jnngCtgrCd.equals(__jnngCtgrCd) ) return false;
		}
		{
			Object _rcpMdKdcd= getRcpMdKdcd();
			Object __rcpMdKdcd= other.getRcpMdKdcd();
			if ( _rcpMdKdcd== null ) { if ( __rcpMdKdcd!= null ) return false; }
			else if ( !_rcpMdKdcd.equals(__rcpMdKdcd) ) return false;
		}
		{
			Object _hsscMajTxtPbokPrngYn= getHsscMajTxtPbokPrngYn();
			Object __hsscMajTxtPbokPrngYn= other.getHsscMajTxtPbokPrngYn();
			if ( _hsscMajTxtPbokPrngYn== null ) { if ( __hsscMajTxtPbokPrngYn!= null ) return false; }
			else if ( !_hsscMajTxtPbokPrngYn.equals(__hsscMajTxtPbokPrngYn) ) return false;
		}
		{
			Object _prdDesOupYn= getPrdDesOupYn();
			Object __prdDesOupYn= other.getPrdDesOupYn();
			if ( _prdDesOupYn== null ) { if ( __prdDesOupYn!= null ) return false; }
			else if ( !_prdDesOupYn.equals(__prdDesOupYn) ) return false;
		}
		{
			Object _acicJnngYn= getAcicJnngYn();
			Object __acicJnngYn= other.getAcicJnngYn();
			if ( _acicJnngYn== null ) { if ( __acicJnngYn!= null ) return false; }
			else if ( !_acicJnngYn.equals(__acicJnngYn) ) return false;
		}
		{
			Object _hsscNewDscd= getHsscNewDscd();
			Object __hsscNewDscd= other.getHsscNewDscd();
			if ( _hsscNewDscd== null ) { if ( __hsscNewDscd!= null ) return false; }
			else if ( !_hsscNewDscd.equals(__hsscNewDscd) ) return false;
		}
		{
			Object _hsscRgslZpno= getHsscRgslZpno();
			Object __hsscRgslZpno= other.getHsscRgslZpno();
			if ( _hsscRgslZpno== null ) { if ( __hsscRgslZpno!= null ) return false; }
			else if ( !_hsscRgslZpno.equals(__hsscRgslZpno) ) return false;
		}
		{
			Object _hsscInddRgsYn= getHsscInddRgsYn();
			Object __hsscInddRgsYn= other.getHsscInddRgsYn();
			if ( _hsscInddRgsYn== null ) { if ( __hsscInddRgsYn!= null ) return false; }
			else if ( !_hsscInddRgsYn.equals(__hsscInddRgsYn) ) return false;
		}
		{
			Object _hsscHopeRgnZpno= getHsscHopeRgnZpno();
			Object __hsscHopeRgnZpno= other.getHsscHopeRgnZpno();
			if ( _hsscHopeRgnZpno== null ) { if ( __hsscHopeRgnZpno!= null ) return false; }
			else if ( !_hsscHopeRgnZpno.equals(__hsscHopeRgnZpno) ) return false;
		}
		{
			Object _hopeHousKdDscd= getHopeHousKdDscd();
			Object __hopeHousKdDscd= other.getHopeHousKdDscd();
			if ( _hopeHousKdDscd== null ) { if ( __hopeHousKdDscd!= null ) return false; }
			else if ( !_hopeHousKdDscd.equals(__hopeHousKdDscd) ) return false;
		}
		{
			Object _housXuseSqmDscd= getHousXuseSqmDscd();
			Object __housXuseSqmDscd= other.getHousXuseSqmDscd();
			if ( _housXuseSqmDscd== null ) { if ( __housXuseSqmDscd!= null ) return false; }
			else if ( !_housXuseSqmDscd.equals(__housXuseSqmDscd) ) return false;
		}
		{
			Object _hopeMovinYm= getHopeMovinYm();
			Object __hopeMovinYm= other.getHopeMovinYm();
			if ( _hopeMovinYm== null ) { if ( __hopeMovinYm!= null ) return false; }
			else if ( !_hopeMovinYm.equals(__hopeMovinYm) ) return false;
		}
		{
			Object _esnsNewRgsDt= getEsnsNewRgsDt();
			Object __esnsNewRgsDt= other.getEsnsNewRgsDt();
			if ( _esnsNewRgsDt== null ) { if ( __esnsNewRgsDt!= null ) return false; }
			else if ( !_esnsNewRgsDt.equals(__esnsNewRgsDt) ) return false;
		}
		{
			Object _esnsNewRgsTm= getEsnsNewRgsTm();
			Object __esnsNewRgsTm= other.getEsnsNewRgsTm();
			if ( _esnsNewRgsTm== null ) { if ( __esnsNewRgsTm!= null ) return false; }
			else if ( !_esnsNewRgsTm.equals(__esnsNewRgsTm) ) return false;
		}
		{
			Object _esnsNewEbnkUtzpeNo= getEsnsNewEbnkUtzpeNo();
			Object __esnsNewEbnkUtzpeNo= other.getEsnsNewEbnkUtzpeNo();
			if ( _esnsNewEbnkUtzpeNo== null ) { if ( __esnsNewEbnkUtzpeNo!= null ) return false; }
			else if ( !_esnsNewEbnkUtzpeNo.equals(__esnsNewEbnkUtzpeNo) ) return false;
		}
		{
			Object _atsKdcd= getAtsKdcd();
			Object __atsKdcd= other.getAtsKdcd();
			if ( _atsKdcd== null ) { if ( __atsKdcd!= null ) return false; }
			else if ( !_atsKdcd.equals(__atsKdcd) ) return false;
		}
		{
			Object _lnoActOpngRncd= getLnoActOpngRncd();
			Object __lnoActOpngRncd= other.getLnoActOpngRncd();
			if ( _lnoActOpngRncd== null ) { if ( __lnoActOpngRncd!= null ) return false; }
			else if ( !_lnoActOpngRncd.equals(__lnoActOpngRncd) ) return false;
		}
		{
			Object _scanInfAcnmCnfDscd= getScanInfAcnmCnfDscd();
			Object __scanInfAcnmCnfDscd= other.getScanInfAcnmCnfDscd();
			if ( _scanInfAcnmCnfDscd== null ) { if ( __scanInfAcnmCnfDscd!= null ) return false; }
			else if ( !_scanInfAcnmCnfDscd.equals(__scanInfAcnmCnfDscd) ) return false;
		}
		{
			Object _agnpeTrnYn= getAgnpeTrnYn();
			Object __agnpeTrnYn= other.getAgnpeTrnYn();
			if ( _agnpeTrnYn== null ) { if ( __agnpeTrnYn!= null ) return false; }
			else if ( !_agnpeTrnYn.equals(__agnpeTrnYn) ) return false;
		}
		{
			Object _dpsPwnoRgsDscd= getDpsPwnoRgsDscd();
			Object __dpsPwnoRgsDscd= other.getDpsPwnoRgsDscd();
			if ( _dpsPwnoRgsDscd== null ) { if ( __dpsPwnoRgsDscd!= null ) return false; }
			else if ( !_dpsPwnoRgsDscd.equals(__dpsPwnoRgsDscd) ) return false;
		}
		{
			Object _prrRgsPwnoKeyCnf= getPrrRgsPwnoKeyCnf();
			Object __prrRgsPwnoKeyCnf= other.getPrrRgsPwnoKeyCnf();
			if ( _prrRgsPwnoKeyCnf== null ) { if ( __prrRgsPwnoKeyCnf!= null ) return false; }
			else if ( !_prrRgsPwnoKeyCnf.equals(__prrRgsPwnoKeyCnf) ) return false;
		}
		{
			Object _encyActPwnoCnf= getEncyActPwnoCnf();
			Object __encyActPwnoCnf= other.getEncyActPwnoCnf();
			if ( _encyActPwnoCnf== null ) { if ( __encyActPwnoCnf!= null ) return false; }
			else if ( !_encyActPwnoCnf.equals(__encyActPwnoCnf) ) return false;
		}
		{
			Object _wdcPbokYn= getWdcPbokYn();
			Object __wdcPbokYn= other.getWdcPbokYn();
			if ( _wdcPbokYn== null ) { if ( __wdcPbokYn!= null ) return false; }
			else if ( !_wdcPbokYn.equals(__wdcPbokYn) ) return false;
		}
		{
			Object _wooriLovPlsDntnAscnDscd= getWooriLovPlsDntnAscnDscd();
			Object __wooriLovPlsDntnAscnDscd= other.getWooriLovPlsDntnAscnDscd();
			if ( _wooriLovPlsDntnAscnDscd== null ) { if ( __wooriLovPlsDntnAscnDscd!= null ) return false; }
			else if ( !_wooriLovPlsDntnAscnDscd.equals(__wooriLovPlsDntnAscnDscd) ) return false;
		}
		{
			Object _sameRqdcSrno= getSameRqdcSrno();
			Object __sameRqdcSrno= other.getSameRqdcSrno();
			if ( _sameRqdcSrno== null ) { if ( __sameRqdcSrno!= null ) return false; }
			else if ( !_sameRqdcSrno.equals(__sameRqdcSrno) ) return false;
		}
		{
			Object _etcDeedDscd= getEtcDeedDscd();
			Object __etcDeedDscd= other.getEtcDeedDscd();
			if ( _etcDeedDscd== null ) { if ( __etcDeedDscd!= null ) return false; }
			else if ( !_etcDeedDscd.equals(__etcDeedDscd) ) return false;
		}
		{
			Object _actApvNo= getActApvNo();
			Object __actApvNo= other.getActApvNo();
			if ( _actApvNo== null ) { if ( __actApvNo!= null ) return false; }
			else if ( !_actApvNo.equals(__actApvNo) ) return false;
		}
		{
			Object _fndRblnNewYn= getFndRblnNewYn();
			Object __fndRblnNewYn= other.getFndRblnNewYn();
			if ( _fndRblnNewYn== null ) { if ( __fndRblnNewYn!= null ) return false; }
			else if ( !_fndRblnNewYn.equals(__fndRblnNewYn) ) return false;
		}
		{
			Object _bgnnRcvWdrYn= getBgnnRcvWdrYn();
			Object __bgnnRcvWdrYn= other.getBgnnRcvWdrYn();
			if ( _bgnnRcvWdrYn== null ) { if ( __bgnnRcvWdrYn!= null ) return false; }
			else if ( !_bgnnRcvWdrYn.equals(__bgnnRcvWdrYn) ) return false;
		}
		{
			Object _copItcsno= getCopItcsno();
			Object __copItcsno= other.getCopItcsno();
			if ( _copItcsno== null ) { if ( __copItcsno!= null ) return false; }
			else if ( !_copItcsno.equals(__copItcsno) ) return false;
		}
		{
			Object _inbkNewYn= getInbkNewYn();
			Object __inbkNewYn= other.getInbkNewYn();
			if ( _inbkNewYn== null ) { if ( __inbkNewYn!= null ) return false; }
			else if ( !_inbkNewYn.equals(__inbkNewYn) ) return false;
		}
		{
			Object _smrtBnkgNewYn= getSmrtBnkgNewYn();
			Object __smrtBnkgNewYn= other.getSmrtBnkgNewYn();
			if ( _smrtBnkgNewYn== null ) { if ( __smrtBnkgNewYn!= null ) return false; }
			else if ( !_smrtBnkgNewYn.equals(__smrtBnkgNewYn) ) return false;
		}
		{
			Object _tlbnkNewYn= getTlbnkNewYn();
			Object __tlbnkNewYn= other.getTlbnkNewYn();
			if ( _tlbnkNewYn== null ) { if ( __tlbnkNewYn!= null ) return false; }
			else if ( !_tlbnkNewYn.equals(__tlbnkNewYn) ) return false;
		}
		{
			Object _ntsvcRgsYn= getNtsvcRgsYn();
			Object __ntsvcRgsYn= other.getNtsvcRgsYn();
			if ( _ntsvcRgsYn== null ) { if ( __ntsvcRgsYn!= null ) return false; }
			else if ( !_ntsvcRgsYn.equals(__ntsvcRgsYn) ) return false;
		}
		{
			Object _inbkWdrActRgsYn= getInbkWdrActRgsYn();
			Object __inbkWdrActRgsYn= other.getInbkWdrActRgsYn();
			if ( _inbkWdrActRgsYn== null ) { if ( __inbkWdrActRgsYn!= null ) return false; }
			else if ( !_inbkWdrActRgsYn.equals(__inbkWdrActRgsYn) ) return false;
		}
		{
			Object _inetBnkgUserId= getInetBnkgUserId();
			Object __inetBnkgUserId= other.getInetBnkgUserId();
			if ( _inetBnkgUserId== null ) { if ( __inetBnkgUserId!= null ) return false; }
			else if ( !_inetBnkgUserId.equals(__inetBnkgUserId) ) return false;
		}
		{
			Object _ebnkPwno= getEbnkPwno();
			Object __ebnkPwno= other.getEbnkPwno();
			if ( _ebnkPwno== null ) { if ( __ebnkPwno!= null ) return false; }
			else if ( !_ebnkPwno.equals(__ebnkPwno) ) return false;
		}
		{
			Object _engNm= getEngNm();
			Object __engNm= other.getEngNm();
			if ( _engNm== null ) { if ( __engNm!= null ) return false; }
			else if ( !_engNm.equals(__engNm) ) return false;
		}
		{
			Object _tms1TsLmtAm= getTms1TsLmtAm();
			Object __tms1TsLmtAm= other.getTms1TsLmtAm();
			if ( _tms1TsLmtAm== null ) { if ( __tms1TsLmtAm!= null ) return false; }
			else if ( !_tms1TsLmtAm.equals(__tms1TsLmtAm) ) return false;
		}
		{
			Object _d1TsLmtAm= getD1TsLmtAm();
			Object __d1TsLmtAm= other.getD1TsLmtAm();
			if ( _d1TsLmtAm== null ) { if ( __d1TsLmtAm!= null ) return false; }
			else if ( !_d1TsLmtAm.equals(__d1TsLmtAm) ) return false;
		}
		{
			Object _secrdSrno= getSecrdSrno();
			Object __secrdSrno= other.getSecrdSrno();
			if ( _secrdSrno== null ) { if ( __secrdSrno!= null ) return false; }
			else if ( !_secrdSrno.equals(__secrdSrno) ) return false;
		}
		{
			Object _otpcSrno= getOtpcSrno();
			Object __otpcSrno= other.getOtpcSrno();
			if ( _otpcSrno== null ) { if ( __otpcSrno!= null ) return false; }
			else if ( !_otpcSrno.equals(__otpcSrno) ) return false;
		}
		{
			Object _otpPwd= getOtpPwd();
			Object __otpPwd= other.getOtpPwd();
			if ( _otpPwd== null ) { if ( __otpPwd!= null ) return false; }
			else if ( !_otpPwd.equals(__otpPwd) ) return false;
		}
		{
			Object _otpIsuCostXmpDscd= getOtpIsuCostXmpDscd();
			Object __otpIsuCostXmpDscd= other.getOtpIsuCostXmpDscd();
			if ( _otpIsuCostXmpDscd== null ) { if ( __otpIsuCostXmpDscd!= null ) return false; }
			else if ( !_otpIsuCostXmpDscd.equals(__otpIsuCostXmpDscd) ) return false;
		}
		{
			Object _datDpsTelNo= getDatDpsTelNo();
			Object __datDpsTelNo= other.getDatDpsTelNo();
			if ( _datDpsTelNo== null ) { if ( __datDpsTelNo!= null ) return false; }
			else if ( !_datDpsTelNo.equals(__datDpsTelNo) ) return false;
		}
		{
			Object _synpbDscd= getSynpbDscd();
			Object __synpbDscd= other.getSynpbDscd();
			if ( _synpbDscd== null ) { if ( __synpbDscd!= null ) return false; }
			else if ( !_synpbDscd.equals(__synpbDscd) ) return false;
		}
		{
			Object _inetBnkgRcpSrno= getInetBnkgRcpSrno();
			Object __inetBnkgRcpSrno= other.getInetBnkgRcpSrno();
			if ( _inetBnkgRcpSrno== null ) { if ( __inetBnkgRcpSrno!= null ) return false; }
			else if ( !_inetBnkgRcpSrno.equals(__inetBnkgRcpSrno) ) return false;
		}
		{
			Object _inbkRsvRgbrCd= getInbkRsvRgbrCd();
			Object __inbkRsvRgbrCd= other.getInbkRsvRgbrCd();
			if ( _inbkRsvRgbrCd== null ) { if ( __inbkRsvRgbrCd!= null ) return false; }
			else if ( !_inbkRsvRgbrCd.equals(__inbkRsvRgbrCd) ) return false;
		}
		{
			Object _inbkRsvRgsDt= getInbkRsvRgsDt();
			Object __inbkRsvRgsDt= other.getInbkRsvRgsDt();
			if ( _inbkRsvRgsDt== null ) { if ( __inbkRsvRgsDt!= null ) return false; }
			else if ( !_inbkRsvRgsDt.equals(__inbkRsvRgsDt) ) return false;
		}
		{
			Object _inbkRsvRgsSrno= getInbkRsvRgsSrno();
			Object __inbkRsvRgsSrno= other.getInbkRsvRgsSrno();
			if ( _inbkRsvRgsSrno== null ) { if ( __inbkRsvRgsSrno!= null ) return false; }
			else if ( !_inbkRsvRgsSrno.equals(__inbkRsvRgsSrno) ) return false;
		}
		{
			Object _smrtBnkgInetBnkgId= getSmrtBnkgInetBnkgId();
			Object __smrtBnkgInetBnkgId= other.getSmrtBnkgInetBnkgId();
			if ( _smrtBnkgInetBnkgId== null ) { if ( __smrtBnkgInetBnkgId!= null ) return false; }
			else if ( !_smrtBnkgInetBnkgId.equals(__smrtBnkgInetBnkgId) ) return false;
		}
		{
			Object _smrtBnkgHpComCd= getSmrtBnkgHpComCd();
			Object __smrtBnkgHpComCd= other.getSmrtBnkgHpComCd();
			if ( _smrtBnkgHpComCd== null ) { if ( __smrtBnkgHpComCd!= null ) return false; }
			else if ( !_smrtBnkgHpComCd.equals(__smrtBnkgHpComCd) ) return false;
		}
		{
			Object _smrtBnkgHpTlenNo= getSmrtBnkgHpTlenNo();
			Object __smrtBnkgHpTlenNo= other.getSmrtBnkgHpTlenNo();
			if ( _smrtBnkgHpTlenNo== null ) { if ( __smrtBnkgHpTlenNo!= null ) return false; }
			else if ( !_smrtBnkgHpTlenNo.equals(__smrtBnkgHpTlenNo) ) return false;
		}
		{
			Object _smrtBnkgHpSrno= getSmrtBnkgHpSrno();
			Object __smrtBnkgHpSrno= other.getSmrtBnkgHpSrno();
			if ( _smrtBnkgHpSrno== null ) { if ( __smrtBnkgHpSrno!= null ) return false; }
			else if ( !_smrtBnkgHpSrno.equals(__smrtBnkgHpSrno) ) return false;
		}
		{
			Object _tlbnkSecrdSrno= getTlbnkSecrdSrno();
			Object __tlbnkSecrdSrno= other.getTlbnkSecrdSrno();
			if ( _tlbnkSecrdSrno== null ) { if ( __tlbnkSecrdSrno!= null ) return false; }
			else if ( !_tlbnkSecrdSrno.equals(__tlbnkSecrdSrno) ) return false;
		}
		{
			Object _encyEbnkPwno= getEncyEbnkPwno();
			Object __encyEbnkPwno= other.getEncyEbnkPwno();
			if ( _encyEbnkPwno== null ) { if ( __encyEbnkPwno!= null ) return false; }
			else if ( !_encyEbnkPwno.equals(__encyEbnkPwno) ) return false;
		}
		{
			Object _tlbnkD1TsLmt= getTlbnkD1TsLmt();
			Object __tlbnkD1TsLmt= other.getTlbnkD1TsLmt();
			if ( _tlbnkD1TsLmt== null ) { if ( __tlbnkD1TsLmt!= null ) return false; }
			else if ( !_tlbnkD1TsLmt.equals(__tlbnkD1TsLmt) ) return false;
		}
		{
			Object _tlbnkTms1TsLmt= getTlbnkTms1TsLmt();
			Object __tlbnkTms1TsLmt= other.getTlbnkTms1TsLmt();
			if ( _tlbnkTms1TsLmt== null ) { if ( __tlbnkTms1TsLmt!= null ) return false; }
			else if ( !_tlbnkTms1TsLmt.equals(__tlbnkTms1TsLmt) ) return false;
		}
		{
			Object _ntsvcRawDscd= getNtsvcRawDscd();
			Object __ntsvcRawDscd= other.getNtsvcRawDscd();
			if ( _ntsvcRawDscd== null ) { if ( __ntsvcRawDscd!= null ) return false; }
			else if ( !_ntsvcRawDscd.equals(__ntsvcRawDscd) ) return false;
		}
		{
			Object _ntsvcBalNtyMarkYn= getNtsvcBalNtyMarkYn();
			Object __ntsvcBalNtyMarkYn= other.getNtsvcBalNtyMarkYn();
			if ( _ntsvcBalNtyMarkYn== null ) { if ( __ntsvcBalNtyMarkYn!= null ) return false; }
			else if ( !_ntsvcBalNtyMarkYn.equals(__ntsvcBalNtyMarkYn) ) return false;
		}
		{
			Object _ntsvcHpComCd= getNtsvcHpComCd();
			Object __ntsvcHpComCd= other.getNtsvcHpComCd();
			if ( _ntsvcHpComCd== null ) { if ( __ntsvcHpComCd!= null ) return false; }
			else if ( !_ntsvcHpComCd.equals(__ntsvcHpComCd) ) return false;
		}
		{
			Object _ntsvcHpTlenNo= getNtsvcHpTlenNo();
			Object __ntsvcHpTlenNo= other.getNtsvcHpTlenNo();
			if ( _ntsvcHpTlenNo== null ) { if ( __ntsvcHpTlenNo!= null ) return false; }
			else if ( !_ntsvcHpTlenNo.equals(__ntsvcHpTlenNo) ) return false;
		}
		{
			Object _ntsvcHpSrno= getNtsvcHpSrno();
			Object __ntsvcHpSrno= other.getNtsvcHpSrno();
			if ( _ntsvcHpSrno== null ) { if ( __ntsvcHpSrno!= null ) return false; }
			else if ( !_ntsvcHpSrno.equals(__ntsvcHpSrno) ) return false;
		}
		{
			Object _ntsvcInotAm= getNtsvcInotAm();
			Object __ntsvcInotAm= other.getNtsvcInotAm();
			if ( _ntsvcInotAm== null ) { if ( __ntsvcInotAm!= null ) return false; }
			else if ( !_ntsvcInotAm.equals(__ntsvcInotAm) ) return false;
		}
		{
			Object _astPrtsNtcYn= getAstPrtsNtcYn();
			Object __astPrtsNtcYn= other.getAstPrtsNtcYn();
			if ( _astPrtsNtcYn== null ) { if ( __astPrtsNtcYn!= null ) return false; }
			else if ( !_astPrtsNtcYn.equals(__astPrtsNtcYn) ) return false;
		}
		{
			Object _ntsvcTmsStaTim= getNtsvcTmsStaTim();
			Object __ntsvcTmsStaTim= other.getNtsvcTmsStaTim();
			if ( _ntsvcTmsStaTim== null ) { if ( __ntsvcTmsStaTim!= null ) return false; }
			else if ( !_ntsvcTmsStaTim.equals(__ntsvcTmsStaTim) ) return false;
		}
		{
			Object _ntsvcTmsEndTim= getNtsvcTmsEndTim();
			Object __ntsvcTmsEndTim= other.getNtsvcTmsEndTim();
			if ( _ntsvcTmsEndTim== null ) { if ( __ntsvcTmsEndTim!= null ) return false; }
			else if ( !_ntsvcTmsEndTim.equals(__ntsvcTmsEndTim) ) return false;
		}
		{
			Object _wdrActRgsInetBnkgId= getWdrActRgsInetBnkgId();
			Object __wdrActRgsInetBnkgId= other.getWdrActRgsInetBnkgId();
			if ( _wdrActRgsInetBnkgId== null ) { if ( __wdrActRgsInetBnkgId!= null ) return false; }
			else if ( !_wdrActRgsInetBnkgId.equals(__wdrActRgsInetBnkgId) ) return false;
		}
		{
			Object _ebnkWdrActCnccRgsYn= getEbnkWdrActCnccRgsYn();
			Object __ebnkWdrActCnccRgsYn= other.getEbnkWdrActCnccRgsYn();
			if ( _ebnkWdrActCnccRgsYn== null ) { if ( __ebnkWdrActCnccRgsYn!= null ) return false; }
			else if ( !_ebnkWdrActCnccRgsYn.equals(__ebnkWdrActCnccRgsYn) ) return false;
		}
		{
			Object _tlbnkWdrActCnccRgsYn= getTlbnkWdrActCnccRgsYn();
			Object __tlbnkWdrActCnccRgsYn= other.getTlbnkWdrActCnccRgsYn();
			if ( _tlbnkWdrActCnccRgsYn== null ) { if ( __tlbnkWdrActCnccRgsYn!= null ) return false; }
			else if ( !_tlbnkWdrActCnccRgsYn.equals(__tlbnkWdrActCnccRgsYn) ) return false;
		}
		{
			Object _hswfPbokDocSndYn= getHswfPbokDocSndYn();
			Object __hswfPbokDocSndYn= other.getHswfPbokDocSndYn();
			if ( _hswfPbokDocSndYn== null ) { if ( __hswfPbokDocSndYn!= null ) return false; }
			else if ( !_hswfPbokDocSndYn.equals(__hswfPbokDocSndYn) ) return false;
		}
		{
			Object _faOwacCsno= getFaOwacCsno();
			Object __faOwacCsno= other.getFaOwacCsno();
			if ( _faOwacCsno== null ) { if ( __faOwacCsno!= null ) return false; }
			else if ( !_faOwacCsno.equals(__faOwacCsno) ) return false;
		}
		{
			Object _flieRgsYn= getFlieRgsYn();
			Object __flieRgsYn= other.getFlieRgsYn();
			if ( _flieRgsYn== null ) { if ( __flieRgsYn!= null ) return false; }
			else if ( !_flieRgsYn.equals(__flieRgsYn) ) return false;
		}
		{
			Object _atsYn= getAtsYn();
			Object __atsYn= other.getAtsYn();
			if ( _atsYn== null ) { if ( __atsYn!= null ) return false; }
			else if ( !_atsYn.equals(__atsYn) ) return false;
		}
		{
			Object _hmnyUsgAm= getHmnyUsgAm();
			Object __hmnyUsgAm= other.getHmnyUsgAm();
			if ( _hmnyUsgAm== null ) { if ( __hmnyUsgAm!= null ) return false; }
			else if ( !_hmnyUsgAm.equals(__hmnyUsgAm) ) return false;
		}
		{
			Object _etcAcno= getEtcAcno();
			Object __etcAcno= other.getEtcAcno();
			if ( _etcAcno== null ) { if ( __etcAcno!= null ) return false; }
			else if ( !_etcAcno.equals(__etcAcno) ) return false;
		}
		{
			Object _trtpyRtPsnb= getTrtpyRtPsnb();
			Object __trtpyRtPsnb= other.getTrtpyRtPsnb();
			if ( _trtpyRtPsnb== null ) { if ( __trtpyRtPsnb!= null ) return false; }
			else if ( !_trtpyRtPsnb.equals(__trtpyRtPsnb) ) return false;
		}
		{
			Object _trtpyRtDcml= getTrtpyRtDcml();
			Object __trtpyRtDcml= other.getTrtpyRtDcml();
			if ( _trtpyRtDcml== null ) { if ( __trtpyRtDcml!= null ) return false; }
			else if ( !_trtpyRtDcml.equals(__trtpyRtDcml) ) return false;
		}
		{
			Object _fltIrNtcDscd= getFltIrNtcDscd();
			Object __fltIrNtcDscd= other.getFltIrNtcDscd();
			if ( _fltIrNtcDscd== null ) { if ( __fltIrNtcDscd!= null ) return false; }
			else if ( !_fltIrNtcDscd.equals(__fltIrNtcDscd) ) return false;
		}
		{
			Object _etpCoplsDpstNewYn= getEtpCoplsDpstNewYn();
			Object __etpCoplsDpstNewYn= other.getEtpCoplsDpstNewYn();
			if ( _etpCoplsDpstNewYn== null ) { if ( __etpCoplsDpstNewYn!= null ) return false; }
			else if ( !_etpCoplsDpstNewYn.equals(__etpCoplsDpstNewYn) ) return false;
		}
		{
			Object _atsXtYn= getAtsXtYn();
			Object __atsXtYn= other.getAtsXtYn();
			if ( _atsXtYn== null ) { if ( __atsXtYn!= null ) return false; }
			else if ( !_atsXtYn.equals(__atsXtYn) ) return false;
		}
		{
			Object _spslPdcd= getSpslPdcd();
			Object __spslPdcd= other.getSpslPdcd();
			if ( _spslPdcd== null ) { if ( __spslPdcd!= null ) return false; }
			else if ( !_spslPdcd.equals(__spslPdcd) ) return false;
		}
		{
			Object _trtPocpPfeRtPsnb= getTrtPocpPfeRtPsnb();
			Object __trtPocpPfeRtPsnb= other.getTrtPocpPfeRtPsnb();
			if ( _trtPocpPfeRtPsnb== null ) { if ( __trtPocpPfeRtPsnb!= null ) return false; }
			else if ( !_trtPocpPfeRtPsnb.equals(__trtPocpPfeRtPsnb) ) return false;
		}
		{
			Object _trtPocpPfeRtDcml= getTrtPocpPfeRtDcml();
			Object __trtPocpPfeRtDcml= other.getTrtPocpPfeRtDcml();
			if ( _trtPocpPfeRtDcml== null ) { if ( __trtPocpPfeRtDcml!= null ) return false; }
			else if ( !_trtPocpPfeRtDcml.equals(__trtPocpPfeRtDcml) ) return false;
		}
		{
			Object _trtDfanPfeRtPsnb= getTrtDfanPfeRtPsnb();
			Object __trtDfanPfeRtPsnb= other.getTrtDfanPfeRtPsnb();
			if ( _trtDfanPfeRtPsnb== null ) { if ( __trtDfanPfeRtPsnb!= null ) return false; }
			else if ( !_trtDfanPfeRtPsnb.equals(__trtDfanPfeRtPsnb) ) return false;
		}
		{
			Object _trtDfanPfeRtDcml= getTrtDfanPfeRtDcml();
			Object __trtDfanPfeRtDcml= other.getTrtDfanPfeRtDcml();
			if ( _trtDfanPfeRtDcml== null ) { if ( __trtDfanPfeRtDcml!= null ) return false; }
			else if ( !_trtDfanPfeRtDcml.equals(__trtDfanPfeRtDcml) ) return false;
		}
		{
			Object _cponInpDscd= getCponInpDscd();
			Object __cponInpDscd= other.getCponInpDscd();
			if ( _cponInpDscd== null ) { if ( __cponInpDscd!= null ) return false; }
			else if ( !_cponInpDscd.equals(__cponInpDscd) ) return false;
		}
		{
			Object _agmIrtPsnb= getAgmIrtPsnb();
			Object __agmIrtPsnb= other.getAgmIrtPsnb();
			if ( _agmIrtPsnb== null ) { if ( __agmIrtPsnb!= null ) return false; }
			else if ( !_agmIrtPsnb.equals(__agmIrtPsnb) ) return false;
		}
		{
			Object _agmIrtDcml= getAgmIrtDcml();
			Object __agmIrtDcml= other.getAgmIrtDcml();
			if ( _agmIrtDcml== null ) { if ( __agmIrtDcml!= null ) return false; }
			else if ( !_agmIrtDcml.equals(__agmIrtDcml) ) return false;
		}
		{
			Object _pbokOtln= getPbokOtln();
			Object __pbokOtln= other.getPbokOtln();
			if ( _pbokOtln== null ) { if ( __pbokOtln!= null ) return false; }
			else if ( !_pbokOtln.equals(__pbokOtln) ) return false;
		}
		{
			Object _ascnBlgCd= getAscnBlgCd();
			Object __ascnBlgCd= other.getAscnBlgCd();
			if ( _ascnBlgCd== null ) { if ( __ascnBlgCd!= null ) return false; }
			else if ( !_ascnBlgCd.equals(__ascnBlgCd) ) return false;
		}
		{
			Object _acldCrtdSndDscd= getAcldCrtdSndDscd();
			Object __acldCrtdSndDscd= other.getAcldCrtdSndDscd();
			if ( _acldCrtdSndDscd== null ) { if ( __acldCrtdSndDscd!= null ) return false; }
			else if ( !_acldCrtdSndDscd.equals(__acldCrtdSndDscd) ) return false;
		}
		{
			Object _isaMajSbjPbokPrngYn= getIsaMajSbjPbokPrngYn();
			Object __isaMajSbjPbokPrngYn= other.getIsaMajSbjPbokPrngYn();
			if ( _isaMajSbjPbokPrngYn== null ) { if ( __isaMajSbjPbokPrngYn!= null ) return false; }
			else if ( !_isaMajSbjPbokPrngYn.equals(__isaMajSbjPbokPrngYn) ) return false;
		}
		{
			Object _isaNewDscd= getIsaNewDscd();
			Object __isaNewDscd= other.getIsaNewDscd();
			if ( _isaNewDscd== null ) { if ( __isaNewDscd!= null ) return false; }
			else if ( !_isaNewDscd.equals(__isaNewDscd) ) return false;
		}
		{
			Object _isaJnngDscd= getIsaJnngDscd();
			Object __isaJnngDscd= other.getIsaJnngDscd();
			if ( _isaJnngDscd== null ) { if ( __isaJnngDscd!= null ) return false; }
			else if ( !_isaJnngDscd.equals(__isaJnngDscd) ) return false;
		}
		{
			Object _jnngAdvpeEno= getJnngAdvpeEno();
			Object __jnngAdvpeEno= other.getJnngAdvpeEno();
			if ( _jnngAdvpeEno== null ) { if ( __jnngAdvpeEno!= null ) return false; }
			else if ( !_jnngAdvpeEno.equals(__jnngAdvpeEno) ) return false;
		}
		{
			Object _extxDscd= getExtxDscd();
			Object __extxDscd= other.getExtxDscd();
			if ( _extxDscd== null ) { if ( __extxDscd!= null ) return false; }
			else if ( !_extxDscd.equals(__extxDscd) ) return false;
		}
		{
			Object _dtjnTemDscd= getDtjnTemDscd();
			Object __dtjnTemDscd= other.getDtjnTemDscd();
			if ( _dtjnTemDscd== null ) { if ( __dtjnTemDscd!= null ) return false; }
			else if ( !_dtjnTemDscd.equals(__dtjnTemDscd) ) return false;
		}
		{
			Object _mndDocCollYn= getMndDocCollYn();
			Object __mndDocCollYn= other.getMndDocCollYn();
			if ( _mndDocCollYn== null ) { if ( __mndDocCollYn!= null ) return false; }
			else if ( !_mndDocCollYn.equals(__mndDocCollYn) ) return false;
		}
		{
			Object _enmtDt= getEnmtDt();
			Object __enmtDt= other.getEnmtDt();
			if ( _enmtDt== null ) { if ( __enmtDt!= null ) return false; }
			else if ( !_enmtDt.equals(__enmtDt) ) return false;
		}
		{
			Object _dshgDt= getDshgDt();
			Object __dshgDt= other.getDshgDt();
			if ( _dshgDt== null ) { if ( __dshgDt!= null ) return false; }
			else if ( !_dshgDt.equals(__dshgDt) ) return false;
		}
		{
			Object _ctrmvIscd= getCtrmvIscd();
			Object __ctrmvIscd= other.getCtrmvIscd();
			if ( _ctrmvIscd== null ) { if ( __ctrmvIscd!= null ) return false; }
			else if ( !_ctrmvIscd.equals(__ctrmvIscd) ) return false;
		}
		{
			Object _rtrtInsuCnvrAm= getRtrtInsuCnvrAm();
			Object __rtrtInsuCnvrAm= other.getRtrtInsuCnvrAm();
			if ( _rtrtInsuCnvrAm== null ) { if ( __rtrtInsuCnvrAm!= null ) return false; }
			else if ( !_rtrtInsuCnvrAm.equals(__rtrtInsuCnvrAm) ) return false;
		}
		{
			Object _aldJnpeTycd= getAldJnpeTycd();
			Object __aldJnpeTycd= other.getAldJnpeTycd();
			if ( _aldJnpeTycd== null ) { if ( __aldJnpeTycd!= null ) return false; }
			else if ( !_aldJnpeTycd.equals(__aldJnpeTycd) ) return false;
		}
		{
			Object _fstJnngDt= getFstJnngDt();
			Object __fstJnngDt= other.getFstJnngDt();
			if ( _fstJnngDt== null ) { if ( __fstJnngDt!= null ) return false; }
			else if ( !_fstJnngDt.equals(__fstJnngDt) ) return false;
		}
		{
			Object _tfrAcno= getTfrAcno();
			Object __tfrAcno= other.getTfrAcno();
			if ( _tfrAcno== null ) { if ( __tfrAcno!= null ) return false; }
			else if ( !_tfrAcno.equals(__tfrAcno) ) return false;
		}
		{
			Object _planNo= getPlanNo();
			Object __planNo= other.getPlanNo();
			if ( _planNo== null ) { if ( __planNo!= null ) return false; }
			else if ( !_planNo.equals(__planNo) ) return false;
		}
		{
			Object _brdmKdcd= getBrdmKdcd();
			Object __brdmKdcd= other.getBrdmKdcd();
			if ( _brdmKdcd== null ) { if ( __brdmKdcd!= null ) return false; }
			else if ( !_brdmKdcd.equals(__brdmKdcd) ) return false;
		}
		{
			Object _scdOrdsMngNo= getScdOrdsMngNo();
			Object __scdOrdsMngNo= other.getScdOrdsMngNo();
			if ( _scdOrdsMngNo== null ) { if ( __scdOrdsMngNo!= null ) return false; }
			else if ( !_scdOrdsMngNo.equals(__scdOrdsMngNo) ) return false;
		}
		{
			Object _rtpenCobdnAm= getRtpenCobdnAm();
			Object __rtpenCobdnAm= other.getRtpenCobdnAm();
			if ( _rtpenCobdnAm== null ) { if ( __rtpenCobdnAm!= null ) return false; }
			else if ( !_rtpenCobdnAm.equals(__rtpenCobdnAm) ) return false;
		}
		{
			Object _rtpenPbdnAm= getRtpenPbdnAm();
			Object __rtpenPbdnAm= other.getRtpenPbdnAm();
			if ( _rtpenPbdnAm== null ) { if ( __rtpenPbdnAm!= null ) return false; }
			else if ( !_rtpenPbdnAm.equals(__rtpenPbdnAm) ) return false;
		}
		{
			Object _opgMngFee= getOpgMngFee();
			Object __opgMngFee= other.getOpgMngFee();
			if ( _opgMngFee== null ) { if ( __opgMngFee!= null ) return false; }
			else if ( !_opgMngFee.equals(__opgMngFee) ) return false;
		}
		{
			Object _asetMngFee= getAsetMngFee();
			Object __asetMngFee= other.getAsetMngFee();
			if ( _asetMngFee== null ) { if ( __asetMngFee!= null ) return false; }
			else if ( !_asetMngFee.equals(__asetMngFee) ) return false;
		}
		{
			Object _stlAcno= getStlAcno();
			Object __stlAcno= other.getStlAcno();
			if ( _stlAcno== null ) { if ( __stlAcno!= null ) return false; }
			else if ( !_stlAcno.equals(__stlAcno) ) return false;
		}
		{
			Object _encyStlActPwno= getEncyStlActPwno();
			Object __encyStlActPwno= other.getEncyStlActPwno();
			if ( _encyStlActPwno== null ) { if ( __encyStlActPwno!= null ) return false; }
			else if ( !_encyStlActPwno.equals(__encyStlActPwno) ) return false;
		}
		{
			Object _afepAddPidDscd= getAfepAddPidDscd();
			Object __afepAddPidDscd= other.getAfepAddPidDscd();
			if ( _afepAddPidDscd== null ) { if ( __afepAddPidDscd!= null ) return false; }
			else if ( !_afepAddPidDscd.equals(__afepAddPidDscd) ) return false;
		}
		{
			Object _rprhLnkNewDscd= getRprhLnkNewDscd();
			Object __rprhLnkNewDscd= other.getRprhLnkNewDscd();
			if ( _rprhLnkNewDscd== null ) { if ( __rprhLnkNewDscd!= null ) return false; }
			else if ( !_rprhLnkNewDscd.equals(__rprhLnkNewDscd) ) return false;
		}
		{
			Object _cancRsvFndAcno= getCancRsvFndAcno();
			Object __cancRsvFndAcno= other.getCancRsvFndAcno();
			if ( _cancRsvFndAcno== null ) { if ( __cancRsvFndAcno!= null ) return false; }
			else if ( !_cancRsvFndAcno.equals(__cancRsvFndAcno) ) return false;
		}
		{
			Object _rprhAmTamNewDscd= getRprhAmTamNewDscd();
			Object __rprhAmTamNewDscd= other.getRprhAmTamNewDscd();
			if ( _rprhAmTamNewDscd== null ) { if ( __rprhAmTamNewDscd!= null ) return false; }
			else if ( !_rprhAmTamNewDscd.equals(__rprhAmTamNewDscd) ) return false;
		}
		{
			Object _xcoPrmeIrt= getXcoPrmeIrt();
			Object __xcoPrmeIrt= other.getXcoPrmeIrt();
			if ( _xcoPrmeIrt== null ) { if ( __xcoPrmeIrt!= null ) return false; }
			else if ( !_xcoPrmeIrt.equals(__xcoPrmeIrt) ) return false;
		}
		{
			Object _fndGoalPrftRtPsnb= getFndGoalPrftRtPsnb();
			Object __fndGoalPrftRtPsnb= other.getFndGoalPrftRtPsnb();
			if ( _fndGoalPrftRtPsnb== null ) { if ( __fndGoalPrftRtPsnb!= null ) return false; }
			else if ( !_fndGoalPrftRtPsnb.equals(__fndGoalPrftRtPsnb) ) return false;
		}
		{
			Object _fndGoalPrftRtDcml= getFndGoalPrftRtDcml();
			Object __fndGoalPrftRtDcml= other.getFndGoalPrftRtDcml();
			if ( _fndGoalPrftRtDcml== null ) { if ( __fndGoalPrftRtDcml!= null ) return false; }
			else if ( !_fndGoalPrftRtDcml.equals(__fndGoalPrftRtDcml) ) return false;
		}
		{
			Object _srvcRqAm= getSrvcRqAm();
			Object __srvcRqAm= other.getSrvcRqAm();
			if ( _srvcRqAm== null ) { if ( __srvcRqAm!= null ) return false; }
			else if ( !_srvcRqAm.equals(__srvcRqAm) ) return false;
		}
		{
			Object _fndAcblNtcDis= getFndAcblNtcDis();
			Object __fndAcblNtcDis= other.getFndAcblNtcDis();
			if ( _fndAcblNtcDis== null ) { if ( __fndAcblNtcDis!= null ) return false; }
			else if ( !_fndAcblNtcDis.equals(__fndAcblNtcDis) ) return false;
		}
		{
			Object _fndAcblNtfcBasDd= getFndAcblNtfcBasDd();
			Object __fndAcblNtfcBasDd= other.getFndAcblNtfcBasDd();
			if ( _fndAcblNtfcBasDd== null ) { if ( __fndAcblNtfcBasDd!= null ) return false; }
			else if ( !_fndAcblNtfcBasDd.equals(__fndAcblNtfcBasDd) ) return false;
		}
		{
			Object _fndPrftRtSmsChrRqDscd= getFndPrftRtSmsChrRqDscd();
			Object __fndPrftRtSmsChrRqDscd= other.getFndPrftRtSmsChrRqDscd();
			if ( _fndPrftRtSmsChrRqDscd== null ) { if ( __fndPrftRtSmsChrRqDscd!= null ) return false; }
			else if ( !_fndPrftRtSmsChrRqDscd.equals(__fndPrftRtSmsChrRqDscd) ) return false;
		}
		{
			Object _fndSmsRqTprtPsnb= getFndSmsRqTprtPsnb();
			Object __fndSmsRqTprtPsnb= other.getFndSmsRqTprtPsnb();
			if ( _fndSmsRqTprtPsnb== null ) { if ( __fndSmsRqTprtPsnb!= null ) return false; }
			else if ( !_fndSmsRqTprtPsnb.equals(__fndSmsRqTprtPsnb) ) return false;
		}
		{
			Object _fndSmsRqTprtDcml= getFndSmsRqTprtDcml();
			Object __fndSmsRqTprtDcml= other.getFndSmsRqTprtDcml();
			if ( _fndSmsRqTprtDcml== null ) { if ( __fndSmsRqTprtDcml!= null ) return false; }
			else if ( !_fndSmsRqTprtDcml.equals(__fndSmsRqTprtDcml) ) return false;
		}
		{
			Object _fndSmsRqTprtDscd= getFndSmsRqTprtDscd();
			Object __fndSmsRqTprtDscd= other.getFndSmsRqTprtDscd();
			if ( _fndSmsRqTprtDscd== null ) { if ( __fndSmsRqTprtDscd!= null ) return false; }
			else if ( !_fndSmsRqTprtDscd.equals(__fndSmsRqTprtDscd) ) return false;
		}
		{
			Object _fndSmsRqLossAwrtPsnb= getFndSmsRqLossAwrtPsnb();
			Object __fndSmsRqLossAwrtPsnb= other.getFndSmsRqLossAwrtPsnb();
			if ( _fndSmsRqLossAwrtPsnb== null ) { if ( __fndSmsRqLossAwrtPsnb!= null ) return false; }
			else if ( !_fndSmsRqLossAwrtPsnb.equals(__fndSmsRqLossAwrtPsnb) ) return false;
		}
		{
			Object _fndSmsRqLossAwrtDcml= getFndSmsRqLossAwrtDcml();
			Object __fndSmsRqLossAwrtDcml= other.getFndSmsRqLossAwrtDcml();
			if ( _fndSmsRqLossAwrtDcml== null ) { if ( __fndSmsRqLossAwrtDcml!= null ) return false; }
			else if ( !_fndSmsRqLossAwrtDcml.equals(__fndSmsRqLossAwrtDcml) ) return false;
		}
		{
			Object _fndSmsRqLossAwrtDscd= getFndSmsRqLossAwrtDscd();
			Object __fndSmsRqLossAwrtDscd= other.getFndSmsRqLossAwrtDscd();
			if ( _fndSmsRqLossAwrtDscd== null ) { if ( __fndSmsRqLossAwrtDscd!= null ) return false; }
			else if ( !_fndSmsRqLossAwrtDscd.equals(__fndSmsRqLossAwrtDscd) ) return false;
		}
		{
			Object _fndFpPrftRtSmsChrRqDscd= getFndFpPrftRtSmsChrRqDscd();
			Object __fndFpPrftRtSmsChrRqDscd= other.getFndFpPrftRtSmsChrRqDscd();
			if ( _fndFpPrftRtSmsChrRqDscd== null ) { if ( __fndFpPrftRtSmsChrRqDscd!= null ) return false; }
			else if ( !_fndFpPrftRtSmsChrRqDscd.equals(__fndFpPrftRtSmsChrRqDscd) ) return false;
		}
		{
			Object _fndFpPrftRtSmsChrRqDtDscd= getFndFpPrftRtSmsChrRqDtDscd();
			Object __fndFpPrftRtSmsChrRqDtDscd= other.getFndFpPrftRtSmsChrRqDtDscd();
			if ( _fndFpPrftRtSmsChrRqDtDscd== null ) { if ( __fndFpPrftRtSmsChrRqDtDscd!= null ) return false; }
			else if ( !_fndFpPrftRtSmsChrRqDtDscd.equals(__fndFpPrftRtSmsChrRqDtDscd) ) return false;
		}
		{
			Object _scntRqdcPrngOmitYn= getScntRqdcPrngOmitYn();
			Object __scntRqdcPrngOmitYn= other.getScntRqdcPrngOmitYn();
			if ( _scntRqdcPrngOmitYn== null ) { if ( __scntRqdcPrngOmitYn!= null ) return false; }
			else if ( !_scntRqdcPrngOmitYn.equals(__scntRqdcPrngOmitYn) ) return false;
		}
		{
			Object _oldAtrbChckHisSrno= getOldAtrbChckHisSrno();
			Object __oldAtrbChckHisSrno= other.getOldAtrbChckHisSrno();
			if ( _oldAtrbChckHisSrno== null ) { if ( __oldAtrbChckHisSrno!= null ) return false; }
			else if ( !_oldAtrbChckHisSrno.equals(__oldAtrbChckHisSrno) ) return false;
		}
		{
			Object _newVstrMngNo= getNewVstrMngNo();
			Object __newVstrMngNo= other.getNewVstrMngNo();
			if ( _newVstrMngNo== null ) { if ( __newVstrMngNo!= null ) return false; }
			else if ( !_newVstrMngNo.equals(__newVstrMngNo) ) return false;
		}
		{
			Object _payVstrMngNo= getPayVstrMngNo();
			Object __payVstrMngNo= other.getPayVstrMngNo();
			if ( _payVstrMngNo== null ) { if ( __payVstrMngNo!= null ) return false; }
			else if ( !_payVstrMngNo.equals(__payVstrMngNo) ) return false;
		}
		{
			Object _spotTfrRtpenPrdNo= getSpotTfrRtpenPrdNo();
			Object __spotTfrRtpenPrdNo= other.getSpotTfrRtpenPrdNo();
			if ( _spotTfrRtpenPrdNo== null ) { if ( __spotTfrRtpenPrdNo!= null ) return false; }
			else if ( !_spotTfrRtpenPrdNo.equals(__spotTfrRtpenPrdNo) ) return false;
		}
		{
			Object _rtttIscd= getRtttIscd();
			Object __rtttIscd= other.getRtttIscd();
			if ( _rtttIscd== null ) { if ( __rtttIscd!= null ) return false; }
			else if ( !_rtttIscd.equals(__rtttIscd) ) return false;
		}
		{
			Object _spotTfrRtpenPlanDscd= getSpotTfrRtpenPlanDscd();
			Object __spotTfrRtpenPlanDscd= other.getSpotTfrRtpenPlanDscd();
			if ( _spotTfrRtpenPlanDscd== null ) { if ( __spotTfrRtpenPlanDscd!= null ) return false; }
			else if ( !_spotTfrRtpenPlanDscd.equals(__spotTfrRtpenPlanDscd) ) return false;
		}
		{
			Object _intRcvFcAcno= getIntRcvFcAcno();
			Object __intRcvFcAcno= other.getIntRcvFcAcno();
			if ( _intRcvFcAcno== null ) { if ( __intRcvFcAcno!= null ) return false; }
			else if ( !_intRcvFcAcno.equals(__intRcvFcAcno) ) return false;
		}
		{
			Object _pbdeedPrngYn= getPbdeedPrngYn();
			Object __pbdeedPrngYn= other.getPbdeedPrngYn();
			if ( _pbdeedPrngYn== null ) { if ( __pbdeedPrngYn!= null ) return false; }
			else if ( !_pbdeedPrngYn.equals(__pbdeedPrngYn) ) return false;
		}
		{
			Object _dgnXrtPsnb= getDgnXrtPsnb();
			Object __dgnXrtPsnb= other.getDgnXrtPsnb();
			if ( _dgnXrtPsnb== null ) { if ( __dgnXrtPsnb!= null ) return false; }
			else if ( !_dgnXrtPsnb.equals(__dgnXrtPsnb) ) return false;
		}
		{
			Object _dgnXrtDcml= getDgnXrtDcml();
			Object __dgnXrtDcml= other.getDgnXrtDcml();
			if ( _dgnXrtDcml== null ) { if ( __dgnXrtDcml!= null ) return false; }
			else if ( !_dgnXrtDcml.equals(__dgnXrtDcml) ) return false;
		}
		{
			Object _mkshMbhYn= getMkshMbhYn();
			Object __mkshMbhYn= other.getMkshMbhYn();
			if ( _mkshMbhYn== null ) { if ( __mkshMbhYn!= null ) return false; }
			else if ( !_mkshMbhYn.equals(__mkshMbhYn) ) return false;
		}
		{
			Object _asstmPbokDscd= getAsstmPbokDscd();
			Object __asstmPbokDscd= other.getAsstmPbokDscd();
			if ( _asstmPbokDscd== null ) { if ( __asstmPbokDscd!= null ) return false; }
			else if ( !_asstmPbokDscd.equals(__asstmPbokDscd) ) return false;
		}
		{
			Object _wbbtJnngHpNo= getWbbtJnngHpNo();
			Object __wbbtJnngHpNo= other.getWbbtJnngHpNo();
			if ( _wbbtJnngHpNo== null ) { if ( __wbbtJnngHpNo!= null ) return false; }
			else if ( !_wbbtJnngHpNo.equals(__wbbtJnngHpNo) ) return false;
		}
		{
			Object _prdOpgDscd= getPrdOpgDscd();
			Object __prdOpgDscd= other.getPrdOpgDscd();
			if ( _prdOpgDscd== null ) { if ( __prdOpgDscd!= null ) return false; }
			else if ( !_prdOpgDscd.equals(__prdOpgDscd) ) return false;
		}
		{
			Object _newInqYn= getNewInqYn();
			Object __newInqYn= other.getNewInqYn();
			if ( _newInqYn== null ) { if ( __newInqYn!= null ) return false; }
			else if ( !_newInqYn.equals(__newInqYn) ) return false;
		}
		{
			Object _pwnoNuseYn= getPwnoNuseYn();
			Object __pwnoNuseYn= other.getPwnoNuseYn();
			if ( _pwnoNuseYn== null ) { if ( __pwnoNuseYn!= null ) return false; }
			else if ( !_pwnoNuseYn.equals(__pwnoNuseYn) ) return false;
		}
		{
			Object _bchrInqTim= getBchrInqTim();
			Object __bchrInqTim= other.getBchrInqTim();
			if ( _bchrInqTim== null ) { if ( __bchrInqTim!= null ) return false; }
			else if ( !_bchrInqTim.equals(__bchrInqTim) ) return false;
		}
		{
			Object _bchrNewAvlYn= getBchrNewAvlYn();
			Object __bchrNewAvlYn= other.getBchrNewAvlYn();
			if ( _bchrNewAvlYn== null ) { if ( __bchrNewAvlYn!= null ) return false; }
			else if ( !_bchrNewAvlYn.equals(__bchrNewAvlYn) ) return false;
		}
		{
			Object _prdMajTxtPbokPrngYn= getPrdMajTxtPbokPrngYn();
			Object __prdMajTxtPbokPrngYn= other.getPrdMajTxtPbokPrngYn();
			if ( _prdMajTxtPbokPrngYn== null ) { if ( __prdMajTxtPbokPrngYn!= null ) return false; }
			else if ( !_prdMajTxtPbokPrngYn.equals(__prdMajTxtPbokPrngYn) ) return false;
		}
		{
			Object _apirtPsnb= getApirtPsnb();
			Object __apirtPsnb= other.getApirtPsnb();
			if ( _apirtPsnb== null ) { if ( __apirtPsnb!= null ) return false; }
			else if ( !_apirtPsnb.equals(__apirtPsnb) ) return false;
		}
		{
			Object _apirtDcml= getApirtDcml();
			Object __apirtDcml= other.getApirtDcml();
			if ( _apirtDcml== null ) { if ( __apirtDcml!= null ) return false; }
			else if ( !_apirtDcml.equals(__apirtDcml) ) return false;
		}
		{
			Object _hqapNo= getHqapNo();
			Object __hqapNo= other.getHqapNo();
			if ( _hqapNo== null ) { if ( __hqapNo!= null ) return false; }
			else if ( !_hqapNo.equals(__hqapNo) ) return false;
		}
		{
			Object _acnmCsno= getAcnmCsno();
			Object __acnmCsno= other.getAcnmCsno();
			if ( _acnmCsno== null ) { if ( __acnmCsno!= null ) return false; }
			else if ( !_acnmCsno.equals(__acnmCsno) ) return false;
		}
		{
			Object _fcbdNewYn= getFcbdNewYn();
			Object __fcbdNewYn= other.getFcbdNewYn();
			if ( _fcbdNewYn== null ) { if ( __fcbdNewYn!= null ) return false; }
			else if ( !_fcbdNewYn.equals(__fcbdNewYn) ) return false;
		}
		{
			Object _irKdcd= getIrKdcd();
			Object __irKdcd= other.getIrKdcd();
			if ( _irKdcd== null ) { if ( __irKdcd!= null ) return false; }
			else if ( !_irKdcd.equals(__irKdcd) ) return false;
		}
		{
			Object _efctPrftRtPsnb= getEfctPrftRtPsnb();
			Object __efctPrftRtPsnb= other.getEfctPrftRtPsnb();
			if ( _efctPrftRtPsnb== null ) { if ( __efctPrftRtPsnb!= null ) return false; }
			else if ( !_efctPrftRtPsnb.equals(__efctPrftRtPsnb) ) return false;
		}
		{
			Object _efctPrftRtDcml= getEfctPrftRtDcml();
			Object __efctPrftRtDcml= other.getEfctPrftRtDcml();
			if ( _efctPrftRtDcml== null ) { if ( __efctPrftRtDcml!= null ) return false; }
			else if ( !_efctPrftRtDcml.equals(__efctPrftRtDcml) ) return false;
		}
		{
			Object _vrBilNewDscd= getVrBilNewDscd();
			Object __vrBilNewDscd= other.getVrBilNewDscd();
			if ( _vrBilNewDscd== null ) { if ( __vrBilNewDscd!= null ) return false; }
			else if ( !_vrBilNewDscd.equals(__vrBilNewDscd) ) return false;
		}
		{
			Object _istIvpeBatNewTrnDscd= getIstIvpeBatNewTrnDscd();
			Object __istIvpeBatNewTrnDscd= other.getIstIvpeBatNewTrnDscd();
			if ( _istIvpeBatNewTrnDscd== null ) { if ( __istIvpeBatNewTrnDscd!= null ) return false; }
			else if ( !_istIvpeBatNewTrnDscd.equals(__istIvpeBatNewTrnDscd) ) return false;
		}
		{
			Object _dppeCsno= getDppeCsno();
			Object __dppeCsno= other.getDppeCsno();
			if ( _dppeCsno== null ) { if ( __dppeCsno!= null ) return false; }
			else if ( !_dppeCsno.equals(__dppeCsno) ) return false;
		}
		{
			Object _dppeActIdfNo= getDppeActIdfNo();
			Object __dppeActIdfNo= other.getDppeActIdfNo();
			if ( _dppeActIdfNo== null ) { if ( __dppeActIdfNo!= null ) return false; }
			else if ( !_dppeActIdfNo.equals(__dppeActIdfNo) ) return false;
		}
		{
			Object _dpsBatNewBzcd= getDpsBatNewBzcd();
			Object __dpsBatNewBzcd= other.getDpsBatNewBzcd();
			if ( _dpsBatNewBzcd== null ) { if ( __dpsBatNewBzcd!= null ) return false; }
			else if ( !_dpsBatNewBzcd.equals(__dpsBatNewBzcd) ) return false;
		}
		{
			Object _ascnNewRprsAcno= getAscnNewRprsAcno();
			Object __ascnNewRprsAcno= other.getAscnNewRprsAcno();
			if ( _ascnNewRprsAcno== null ) { if ( __ascnNewRprsAcno!= null ) return false; }
			else if ( !_ascnNewRprsAcno.equals(__ascnNewRprsAcno) ) return false;
		}
		{
			Object _ascnNewRprsActYn= getAscnNewRprsActYn();
			Object __ascnNewRprsActYn= other.getAscnNewRprsActYn();
			if ( _ascnNewRprsActYn== null ) { if ( __ascnNewRprsActYn!= null ) return false; }
			else if ( !_ascnNewRprsActYn.equals(__ascnNewRprsActYn) ) return false;
		}
		{
			Object _pbamActAcctYy= getPbamActAcctYy();
			Object __pbamActAcctYy= other.getPbamActAcctYy();
			if ( _pbamActAcctYy== null ) { if ( __pbamActAcctYy!= null ) return false; }
			else if ( !_pbamActAcctYy.equals(__pbamActAcctYy) ) return false;
		}
		{
			Object _pmnySnnmActAcctYy= getPmnySnnmActAcctYy();
			Object __pmnySnnmActAcctYy= other.getPmnySnnmActAcctYy();
			if ( _pmnySnnmActAcctYy== null ) { if ( __pmnySnnmActAcctYy!= null ) return false; }
			else if ( !_pmnySnnmActAcctYy.equals(__pmnySnnmActAcctYy) ) return false;
		}
		{
			Object _hsscOwhmAdrKdcd= getHsscOwhmAdrKdcd();
			Object __hsscOwhmAdrKdcd= other.getHsscOwhmAdrKdcd();
			if ( _hsscOwhmAdrKdcd== null ) { if ( __hsscOwhmAdrKdcd!= null ) return false; }
			else if ( !_hsscOwhmAdrKdcd.equals(__hsscOwhmAdrKdcd) ) return false;
		}
		{
			Object _hsscOwhmBldMngNo= getHsscOwhmBldMngNo();
			Object __hsscOwhmBldMngNo= other.getHsscOwhmBldMngNo();
			if ( _hsscOwhmBldMngNo== null ) { if ( __hsscOwhmBldMngNo!= null ) return false; }
			else if ( !_hsscOwhmBldMngNo.equals(__hsscOwhmBldMngNo) ) return false;
		}
		{
			Object _hsscOwhmPostSrno= getHsscOwhmPostSrno();
			Object __hsscOwhmPostSrno= other.getHsscOwhmPostSrno();
			if ( _hsscOwhmPostSrno== null ) { if ( __hsscOwhmPostSrno!= null ) return false; }
			else if ( !_hsscOwhmPostSrno.equals(__hsscOwhmPostSrno) ) return false;
		}
		{
			Object _hsscOwhmStdoNo= getHsscOwhmStdoNo();
			Object __hsscOwhmStdoNo= other.getHsscOwhmStdoNo();
			if ( _hsscOwhmStdoNo== null ) { if ( __hsscOwhmStdoNo!= null ) return false; }
			else if ( !_hsscOwhmStdoNo.equals(__hsscOwhmStdoNo) ) return false;
		}
		{
			Object _agmtCoCd= getAgmtCoCd();
			Object __agmtCoCd= other.getAgmtCoCd();
			if ( _agmtCoCd== null ) { if ( __agmtCoCd!= null ) return false; }
			else if ( !_agmtCoCd.equals(__agmtCoCd) ) return false;
		}
		{
			Object _wooriHopeDremJnngTgtDscd= getWooriHopeDremJnngTgtDscd();
			Object __wooriHopeDremJnngTgtDscd= other.getWooriHopeDremJnngTgtDscd();
			if ( _wooriHopeDremJnngTgtDscd== null ) { if ( __wooriHopeDremJnngTgtDscd!= null ) return false; }
			else if ( !_wooriHopeDremJnngTgtDscd.equals(__wooriHopeDremJnngTgtDscd) ) return false;
		}
		{
			Object _asetMngIscd= getAsetMngIscd();
			Object __asetMngIscd= other.getAsetMngIscd();
			if ( _asetMngIscd== null ) { if ( __asetMngIscd!= null ) return false; }
			else if ( !_asetMngIscd.equals(__asetMngIscd) ) return false;
		}
		{
			Object _rpbdDscd= getRpbdDscd();
			Object __rpbdDscd= other.getRpbdDscd();
			if ( _rpbdDscd== null ) { if ( __rpbdDscd!= null ) return false; }
			else if ( !_rpbdDscd.equals(__rpbdDscd) ) return false;
		}
		{
			Object _cctnAcno= getCctnAcno();
			Object __cctnAcno= other.getCctnAcno();
			if ( _cctnAcno== null ) { if ( __cctnAcno!= null ) return false; }
			else if ( !_cctnAcno.equals(__cctnAcno) ) return false;
		}
		{
			Object _npbdSbsrRqYn= getNpbdSbsrRqYn();
			Object __npbdSbsrRqYn= other.getNpbdSbsrRqYn();
			if ( _npbdSbsrRqYn== null ) { if ( __npbdSbsrRqYn!= null ) return false; }
			else if ( !_npbdSbsrRqYn.equals(__npbdSbsrRqYn) ) return false;
		}
		{
			Object _npbdItmsCd= getNpbdItmsCd();
			Object __npbdItmsCd= other.getNpbdItmsCd();
			if ( _npbdItmsCd== null ) { if ( __npbdItmsCd!= null ) return false; }
			else if ( !_npbdItmsCd.equals(__npbdItmsCd) ) return false;
		}
		{
			Object _bndKdDis= getBndKdDis();
			Object __bndKdDis= other.getBndKdDis();
			if ( _bndKdDis== null ) { if ( __bndKdDis!= null ) return false; }
			else if ( !_bndKdDis.equals(__bndKdDis) ) return false;
		}
		{
			Object _tunMmHo= getTunMmHo();
			Object __tunMmHo= other.getTunMmHo();
			if ( _tunMmHo== null ) { if ( __tunMmHo!= null ) return false; }
			else if ( !_tunMmHo.equals(__tunMmHo) ) return false;
		}
		{
			Object _hdgTgtYn= getHdgTgtYn();
			Object __hdgTgtYn= other.getHdgTgtYn();
			if ( _hdgTgtYn== null ) { if ( __hdgTgtYn!= null ) return false; }
			else if ( !_hdgTgtYn.equals(__hdgTgtYn) ) return false;
		}
		{
			Object _idCadNhssDscd= getIdCadNhssDscd();
			Object __idCadNhssDscd= other.getIdCadNhssDscd();
			if ( _idCadNhssDscd== null ) { if ( __idCadNhssDscd!= null ) return false; }
			else if ( !_idCadNhssDscd.equals(__idCadNhssDscd) ) return false;
		}
		{
			Object _fndPlsOpgDscd= getFndPlsOpgDscd();
			Object __fndPlsOpgDscd= other.getFndPlsOpgDscd();
			if ( _fndPlsOpgDscd== null ) { if ( __fndPlsOpgDscd!= null ) return false; }
			else if ( !_fndPlsOpgDscd.equals(__fndPlsOpgDscd) ) return false;
		}
		{
			Object _grnInsuKey= getGrnInsuKey();
			Object __grnInsuKey= other.getGrnInsuKey();
			if ( _grnInsuKey== null ) { if ( __grnInsuKey!= null ) return false; }
			else if ( !_grnInsuKey.equals(__grnInsuKey) ) return false;
		}
		{
			Object _preIntRcvDscd= getPreIntRcvDscd();
			Object __preIntRcvDscd= other.getPreIntRcvDscd();
			if ( _preIntRcvDscd== null ) { if ( __preIntRcvDscd!= null ) return false; }
			else if ( !_preIntRcvDscd.equals(__preIntRcvDscd) ) return false;
		}
		{
			Object _preIntRcvAcno= getPreIntRcvAcno();
			Object __preIntRcvAcno= other.getPreIntRcvAcno();
			if ( _preIntRcvAcno== null ) { if ( __preIntRcvAcno!= null ) return false; }
			else if ( !_preIntRcvAcno.equals(__preIntRcvAcno) ) return false;
		}
		{
			Object _dpsRcmNo= getDpsRcmNo();
			Object __dpsRcmNo= other.getDpsRcmNo();
			if ( _dpsRcmNo== null ) { if ( __dpsRcmNo!= null ) return false; }
			else if ( !_dpsRcmNo.equals(__dpsRcmNo) ) return false;
		}
		{
			Object _sldrAldCn= getSldrAldCn();
			Object __sldrAldCn= other.getSldrAldCn();
			if ( _sldrAldCn== null ) { if ( __sldrAldCn!= null ) return false; }
			else if ( !_sldrAldCn.equals(__sldrAldCn) ) return false;
		}
		{
			Object _dlpmPbokGenRgsYn= getDlpmPbokGenRgsYn();
			Object __dlpmPbokGenRgsYn= other.getDlpmPbokGenRgsYn();
			if ( _dlpmPbokGenRgsYn== null ) { if ( __dlpmPbokGenRgsYn!= null ) return false; }
			else if ( !_dlpmPbokGenRgsYn.equals(__dlpmPbokGenRgsYn) ) return false;
		}
		{
			Object _smrtMchrMdlInf= getSmrtMchrMdlInf();
			Object __smrtMchrMdlInf= other.getSmrtMchrMdlInf();
			if ( _smrtMchrMdlInf== null ) { if ( __smrtMchrMdlInf!= null ) return false; }
			else if ( !_smrtMchrMdlInf.equals(__smrtMchrMdlInf) ) return false;
		}
		{
			Object _wibeeRcvRgsYn= getWibeeRcvRgsYn();
			Object __wibeeRcvRgsYn= other.getWibeeRcvRgsYn();
			if ( _wibeeRcvRgsYn== null ) { if ( __wibeeRcvRgsYn!= null ) return false; }
			else if ( !_wibeeRcvRgsYn.equals(__wibeeRcvRgsYn) ) return false;
		}
		{
			Object _wibeeTsAcno= getWibeeTsAcno();
			Object __wibeeTsAcno= other.getWibeeTsAcno();
			if ( _wibeeTsAcno== null ) { if ( __wibeeTsAcno!= null ) return false; }
			else if ( !_wibeeTsAcno.equals(__wibeeTsAcno) ) return false;
		}
		{
			Object _wibeePushRgsYn= getWibeePushRgsYn();
			Object __wibeePushRgsYn= other.getWibeePushRgsYn();
			if ( _wibeePushRgsYn== null ) { if ( __wibeePushRgsYn!= null ) return false; }
			else if ( !_wibeePushRgsYn.equals(__wibeePushRgsYn) ) return false;
		}
		{
			Object _atsKrwTsAcno= getAtsKrwTsAcno();
			Object __atsKrwTsAcno= other.getAtsKrwTsAcno();
			if ( _atsKrwTsAcno== null ) { if ( __atsKrwTsAcno!= null ) return false; }
			else if ( !_atsKrwTsAcno.equals(__atsKrwTsAcno) ) return false;
		}
		{
			Object _irngBrcd= getIrngBrcd();
			Object __irngBrcd= other.getIrngBrcd();
			if ( _irngBrcd== null ) { if ( __irngBrcd!= null ) return false; }
			else if ( !_irngBrcd.equals(__irngBrcd) ) return false;
		}
		{
			Object _krwFmbkFxpdYn= getKrwFmbkFxpdYn();
			Object __krwFmbkFxpdYn= other.getKrwFmbkFxpdYn();
			if ( _krwFmbkFxpdYn== null ) { if ( __krwFmbkFxpdYn!= null ) return false; }
			else if ( !_krwFmbkFxpdYn.equals(__krwFmbkFxpdYn) ) return false;
		}
		{
			Object _krwSscoFmbkFxpdYn= getKrwSscoFmbkFxpdYn();
			Object __krwSscoFmbkFxpdYn= other.getKrwSscoFmbkFxpdYn();
			if ( _krwSscoFmbkFxpdYn== null ) { if ( __krwSscoFmbkFxpdYn!= null ) return false; }
			else if ( !_krwSscoFmbkFxpdYn.equals(__krwSscoFmbkFxpdYn) ) return false;
		}
		{
			Object _hopeHousXuseSqmDscd= getHopeHousXuseSqmDscd();
			Object __hopeHousXuseSqmDscd= other.getHopeHousXuseSqmDscd();
			if ( _hopeHousXuseSqmDscd== null ) { if ( __hopeHousXuseSqmDscd!= null ) return false; }
			else if ( !_hopeHousXuseSqmDscd.equals(__hopeHousXuseSqmDscd) ) return false;
		}
		{
			Object _rrrgMvinDt= getRrrgMvinDt();
			Object __rrrgMvinDt= other.getRrrgMvinDt();
			if ( _rrrgMvinDt== null ) { if ( __rrrgMvinDt!= null ) return false; }
			else if ( !_rrrgMvinDt.equals(__rrrgMvinDt) ) return false;
		}
		{
			Object _dppeUnqNo= getDppeUnqNo();
			Object __dppeUnqNo= other.getDppeUnqNo();
			if ( _dppeUnqNo== null ) { if ( __dppeUnqNo!= null ) return false; }
			else if ( !_dppeUnqNo.equals(__dppeUnqNo) ) return false;
		}
		{
			Object _dppeItmsNo= getDppeItmsNo();
			Object __dppeItmsNo= other.getDppeItmsNo();
			if ( _dppeItmsNo== null ) { if ( __dppeItmsNo!= null ) return false; }
			else if ( !_dppeItmsNo.equals(__dppeItmsNo) ) return false;
		}
		{
			Object _cshbAtsAcno= getCshbAtsAcno();
			Object __cshbAtsAcno= other.getCshbAtsAcno();
			if ( _cshbAtsAcno== null ) { if ( __cshbAtsAcno!= null ) return false; }
			else if ( !_cshbAtsAcno.equals(__cshbAtsAcno) ) return false;
		}
		{
			Object _cusDntnAscnCd= getCusDntnAscnCd();
			Object __cusDntnAscnCd= other.getCusDntnAscnCd();
			if ( _cusDntnAscnCd== null ) { if ( __cusDntnAscnCd!= null ) return false; }
			else if ( !_cusDntnAscnCd.equals(__cusDntnAscnCd) ) return false;
		}
		{
			Object _cusBrdnCnrnRt= getCusBrdnCnrnRt();
			Object __cusBrdnCnrnRt= other.getCusBrdnCnrnRt();
			if ( _cusBrdnCnrnRt== null ) { if ( __cusBrdnCnrnRt!= null ) return false; }
			else if ( !_cusBrdnCnrnRt.equals(__cusBrdnCnrnRt) ) return false;
		}
		{
			Object _dinsvGoalAm= getDinsvGoalAm();
			Object __dinsvGoalAm= other.getDinsvGoalAm();
			if ( _dinsvGoalAm== null ) { if ( __dinsvGoalAm!= null ) return false; }
			else if ( !_dinsvGoalAm.equals(__dinsvGoalAm) ) return false;
		}
		{
			Object _txprInqYn= getTxprInqYn();
			Object __txprInqYn= other.getTxprInqYn();
			if ( _txprInqYn== null ) { if ( __txprInqYn!= null ) return false; }
			else if ( !_txprInqYn.equals(__txprInqYn) ) return false;
		}
		{
			Object _frno= getFrno();
			Object __frno= other.getFrno();
			if ( _frno== null ) { if ( __frno!= null ) return false; }
			else if ( !_frno.equals(__frno) ) return false;
		}
		{
			Object _acnmRgsCd= getAcnmRgsCd();
			Object __acnmRgsCd= other.getAcnmRgsCd();
			if ( _acnmRgsCd== null ) { if ( __acnmRgsCd!= null ) return false; }
			else if ( !_acnmRgsCd.equals(__acnmRgsCd) ) return false;
		}
		{
			Object _coaOmitYn= getCoaOmitYn();
			Object __coaOmitYn= other.getCoaOmitYn();
			if ( _coaOmitYn== null ) { if ( __coaOmitYn!= null ) return false; }
			else if ( !_coaOmitYn.equals(__coaOmitYn) ) return false;
		}
		{
			Object _wbbmLnkNewYn= getWbbmLnkNewYn();
			Object __wbbmLnkNewYn= other.getWbbmLnkNewYn();
			if ( _wbbmLnkNewYn== null ) { if ( __wbbmLnkNewYn!= null ) return false; }
			else if ( !_wbbmLnkNewYn.equals(__wbbmLnkNewYn) ) return false;
		}
		{
			Object _wbbtRcmRgsHpNo= getWbbtRcmRgsHpNo();
			Object __wbbtRcmRgsHpNo= other.getWbbtRcmRgsHpNo();
			if ( _wbbtRcmRgsHpNo== null ) { if ( __wbbtRcmRgsHpNo!= null ) return false; }
			else if ( !_wbbtRcmRgsHpNo.equals(__wbbtRcmRgsHpNo) ) return false;
		}
		{
			Object _smrtLnJnngYn= getSmrtLnJnngYn();
			Object __smrtLnJnngYn= other.getSmrtLnJnngYn();
			if ( _smrtLnJnngYn== null ) { if ( __smrtLnJnngYn!= null ) return false; }
			else if ( !_smrtLnJnngYn.equals(__smrtLnJnngYn) ) return false;
		}
		{
			Object _dinsvDscd= getDinsvDscd();
			Object __dinsvDscd= other.getDinsvDscd();
			if ( _dinsvDscd== null ) { if ( __dinsvDscd!= null ) return false; }
			else if ( !_dinsvDscd.equals(__dinsvDscd) ) return false;
		}
		{
			Object _aucId= getAucId();
			Object __aucId= other.getAucId();
			if ( _aucId== null ) { if ( __aucId!= null ) return false; }
			else if ( !_aucId.equals(__aucId) ) return false;
		}
		{
			Object _gmktId= getGmktId();
			Object __gmktId= other.getGmktId();
			if ( _gmktId== null ) { if ( __gmktId!= null ) return false; }
			else if ( !_gmktId.equals(__gmktId) ) return false;
		}
		{
			Object _wbbmId= getWbbmId();
			Object __wbbmId= other.getWbbmId();
			if ( _wbbmId== null ) { if ( __wbbmId!= null ) return false; }
			else if ( !_wbbmId.equals(__wbbmId) ) return false;
		}
		{
			Object _dniAcnmCnfNewDscd= getDniAcnmCnfNewDscd();
			Object __dniAcnmCnfNewDscd= other.getDniAcnmCnfNewDscd();
			if ( _dniAcnmCnfNewDscd== null ) { if ( __dniAcnmCnfNewDscd!= null ) return false; }
			else if ( !_dniAcnmCnfNewDscd.equals(__dniAcnmCnfNewDscd) ) return false;
		}
		{
			Object _dniRcvAm= getDniRcvAm();
			Object __dniRcvAm= other.getDniRcvAm();
			if ( _dniRcvAm== null ) { if ( __dniRcvAm!= null ) return false; }
			else if ( !_dniRcvAm.equals(__dniRcvAm) ) return false;
		}
		{
			Object _dniHpNo= getDniHpNo();
			Object __dniHpNo= other.getDniHpNo();
			if ( _dniHpNo== null ) { if ( __dniHpNo!= null ) return false; }
			else if ( !_dniHpNo.equals(__dniHpNo) ) return false;
		}
		{
			Object _dniPtnAcno= getDniPtnAcno();
			Object __dniPtnAcno= other.getDniPtnAcno();
			if ( _dniPtnAcno== null ) { if ( __dniPtnAcno!= null ) return false; }
			else if ( !_dniPtnAcno.equals(__dniPtnAcno) ) return false;
		}
		{
			Object _dniPtnNewAcno= getDniPtnNewAcno();
			Object __dniPtnNewAcno= other.getDniPtnNewAcno();
			if ( _dniPtnNewAcno== null ) { if ( __dniPtnNewAcno!= null ) return false; }
			else if ( !_dniPtnNewAcno.equals(__dniPtnNewAcno) ) return false;
		}
		{
			Object _dniPtnbkCd= getDniPtnbkCd();
			Object __dniPtnbkCd= other.getDniPtnbkCd();
			if ( _dniPtnbkCd== null ) { if ( __dniPtnbkCd!= null ) return false; }
			else if ( !_dniPtnbkCd.equals(__dniPtnbkCd) ) return false;
		}
		{
			Object _rjnngAcno= getRjnngAcno();
			Object __rjnngAcno= other.getRjnngAcno();
			if ( _rjnngAcno== null ) { if ( __rjnngAcno!= null ) return false; }
			else if ( !_rjnngAcno.equals(__rjnngAcno) ) return false;
		}
		{
			Object _insvAcldPlanKdcd= getInsvAcldPlanKdcd();
			Object __insvAcldPlanKdcd= other.getInsvAcldPlanKdcd();
			if ( _insvAcldPlanKdcd== null ) { if ( __insvAcldPlanKdcd!= null ) return false; }
			else if ( !_insvAcldPlanKdcd.equals(__insvAcldPlanKdcd) ) return false;
		}
		{
			Object _insvAcldFstTsAm= getInsvAcldFstTsAm();
			Object __insvAcldFstTsAm= other.getInsvAcldFstTsAm();
			if ( _insvAcldFstTsAm== null ) { if ( __insvAcldFstTsAm!= null ) return false; }
			else if ( !_insvAcldFstTsAm.equals(__insvAcldFstTsAm) ) return false;
		}
		{
			Object _insvAcldTsStaWkdDscd= getInsvAcldTsStaWkdDscd();
			Object __insvAcldTsStaWkdDscd= other.getInsvAcldTsStaWkdDscd();
			if ( _insvAcldTsStaWkdDscd== null ) { if ( __insvAcldTsStaWkdDscd!= null ) return false; }
			else if ( !_insvAcldTsStaWkdDscd.equals(__insvAcldTsStaWkdDscd) ) return false;
		}
		{
			Object _insvAcldTsStaDt= getInsvAcldTsStaDt();
			Object __insvAcldTsStaDt= other.getInsvAcldTsStaDt();
			if ( _insvAcldTsStaDt== null ) { if ( __insvAcldTsStaDt!= null ) return false; }
			else if ( !_insvAcldTsStaDt.equals(__insvAcldTsStaDt) ) return false;
		}
		{
			Object _insvAcldPlanChcYn= getInsvAcldPlanChcYn();
			Object __insvAcldPlanChcYn= other.getInsvAcldPlanChcYn();
			if ( _insvAcldPlanChcYn== null ) { if ( __insvAcldPlanChcYn!= null ) return false; }
			else if ( !_insvAcldPlanChcYn.equals(__insvAcldPlanChcYn) ) return false;
		}
		{
			Object _insvAcldPlanLifeAm= getInsvAcldPlanLifeAm();
			Object __insvAcldPlanLifeAm= other.getInsvAcldPlanLifeAm();
			if ( _insvAcldPlanLifeAm== null ) { if ( __insvAcldPlanLifeAm!= null ) return false; }
			else if ( !_insvAcldPlanLifeAm.equals(__insvAcldPlanLifeAm) ) return false;
		}
		{
			Object _pidMecd= getPidMecd();
			Object __pidMecd= other.getPidMecd();
			if ( _pidMecd== null ) { if ( __pidMecd!= null ) return false; }
			else if ( !_pidMecd.equals(__pidMecd) ) return false;
		}
		{
			Object _selcMvbDtlsIdfCd= getSelcMvbDtlsIdfCd();
			Object __selcMvbDtlsIdfCd= other.getSelcMvbDtlsIdfCd();
			if ( _selcMvbDtlsIdfCd== null ) { if ( __selcMvbDtlsIdfCd!= null ) return false; }
			else if ( !_selcMvbDtlsIdfCd.equals(__selcMvbDtlsIdfCd) ) return false;
		}
		{
			Object _ptnBkwAcno= getPtnBkwAcno();
			Object __ptnBkwAcno= other.getPtnBkwAcno();
			if ( _ptnBkwAcno== null ) { if ( __ptnBkwAcno!= null ) return false; }
			else if ( !_ptnBkwAcno.equals(__ptnBkwAcno) ) return false;
		}
		{
			Object _ptnSelcIscd= getPtnSelcIscd();
			Object __ptnSelcIscd= other.getPtnSelcIscd();
			if ( _ptnSelcIscd== null ) { if ( __ptnSelcIscd!= null ) return false; }
			else if ( !_ptnSelcIscd.equals(__ptnSelcIscd) ) return false;
		}
		{
			Object _fndslcMvbCfdocIsuDt= getFndslcMvbCfdocIsuDt();
			Object __fndslcMvbCfdocIsuDt= other.getFndslcMvbCfdocIsuDt();
			if ( _fndslcMvbCfdocIsuDt== null ) { if ( __fndslcMvbCfdocIsuDt!= null ) return false; }
			else if ( !_fndslcMvbCfdocIsuDt.equals(__fndslcMvbCfdocIsuDt) ) return false;
		}
		{
			Object _taxTycd= getTaxTycd();
			Object __taxTycd= other.getTaxTycd();
			if ( _taxTycd== null ) { if ( __taxTycd!= null ) return false; }
			else if ( !_taxTycd.equals(__taxTycd) ) return false;
		}
		{
			Object _rprhAfImnwYn= getRprhAfImnwYn();
			Object __rprhAfImnwYn= other.getRprhAfImnwYn();
			if ( _rprhAfImnwYn== null ) { if ( __rprhAfImnwYn!= null ) return false; }
			else if ( !_rprhAfImnwYn.equals(__rprhAfImnwYn) ) return false;
		}
		{
			Object _elfSelfDgnsYn= getElfSelfDgnsYn();
			Object __elfSelfDgnsYn= other.getElfSelfDgnsYn();
			if ( _elfSelfDgnsYn== null ) { if ( __elfSelfDgnsYn!= null ) return false; }
			else if ( !_elfSelfDgnsYn.equals(__elfSelfDgnsYn) ) return false;
		}
		{
			Object _wmsPrtfDis= getWmsPrtfDis();
			Object __wmsPrtfDis= other.getWmsPrtfDis();
			if ( _wmsPrtfDis== null ) { if ( __wmsPrtfDis!= null ) return false; }
			else if ( !_wmsPrtfDis.equals(__wmsPrtfDis) ) return false;
		}
		{
			Object _ptnIstCnfYn= getPtnIstCnfYn();
			Object __ptnIstCnfYn= other.getPtnIstCnfYn();
			if ( _ptnIstCnfYn== null ) { if ( __ptnIstCnfYn!= null ) return false; }
			else if ( !_ptnIstCnfYn.equals(__ptnIstCnfYn) ) return false;
		}
		{
			Object _ivsdesSrno= getIvsdesSrno();
			Object __ivsdesSrno= other.getIvsdesSrno();
			if ( _ivsdesSrno== null ) { if ( __ivsdesSrno!= null ) return false; }
			else if ( !_ivsdesSrno.equals(__ivsdesSrno) ) return false;
		}
		{
			Object _fndSvvlAcuCn= getFndSvvlAcuCn();
			Object __fndSvvlAcuCn= other.getFndSvvlAcuCn();
			if ( _fndSvvlAcuCn== null ) { if ( __fndSvvlAcuCn!= null ) return false; }
			else if ( !_fndSvvlAcuCn.equals(__fndSvvlAcuCn) ) return false;
		}
		{
			Object _cusPrtfRgsNo= getCusPrtfRgsNo();
			Object __cusPrtfRgsNo= other.getCusPrtfRgsNo();
			if ( _cusPrtfRgsNo== null ) { if ( __cusPrtfRgsNo!= null ) return false; }
			else if ( !_cusPrtfRgsNo.equals(__cusPrtfRgsNo) ) return false;
		}
		{
			Object _rcpDtm= getRcpDtm();
			Object __rcpDtm= other.getRcpDtm();
			if ( _rcpDtm== null ) { if ( __rcpDtm!= null ) return false; }
			else if ( !_rcpDtm.equals(__rcpDtm) ) return false;
		}
		{
			Object _pnsfndAcno= getPnsfndAcno();
			Object __pnsfndAcno= other.getPnsfndAcno();
			if ( _pnsfndAcno== null ) { if ( __pnsfndAcno!= null ) return false; }
			else if ( !_pnsfndAcno.equals(__pnsfndAcno) ) return false;
		}
		{
			Object _mmfFndAcno= getMmfFndAcno();
			Object __mmfFndAcno= other.getMmfFndAcno();
			if ( _mmfFndAcno== null ) { if ( __mmfFndAcno!= null ) return false; }
			else if ( !_mmfFndAcno.equals(__mmfFndAcno) ) return false;
		}
		{
			Object _pnsfndNewYn= getPnsfndNewYn();
			Object __pnsfndNewYn= other.getPnsfndNewYn();
			if ( _pnsfndNewYn== null ) { if ( __pnsfndNewYn!= null ) return false; }
			else if ( !_pnsfndNewYn.equals(__pnsfndNewYn) ) return false;
		}
		{
			Object _frstNwactNo= getFrstNwactNo();
			Object __frstNwactNo= other.getFrstNwactNo();
			if ( _frstNwactNo== null ) { if ( __frstNwactNo!= null ) return false; }
			else if ( !_frstNwactNo.equals(__frstNwactNo) ) return false;
		}
		{
			Object _scndNwactNo= getScndNwactNo();
			Object __scndNwactNo= other.getScndNwactNo();
			if ( _scndNwactNo== null ) { if ( __scndNwactNo!= null ) return false; }
			else if ( !_scndNwactNo.equals(__scndNwactNo) ) return false;
		}
		{
			Object _fndOpngDt= getFndOpngDt();
			Object __fndOpngDt= other.getFndOpngDt();
			if ( _fndOpngDt== null ) { if ( __fndOpngDt!= null ) return false; }
			else if ( !_fndOpngDt.equals(__fndOpngDt) ) return false;
		}
		{
			Object _krwSscoNewTlmNo= getKrwSscoNewTlmNo();
			Object __krwSscoNewTlmNo= other.getKrwSscoNewTlmNo();
			if ( _krwSscoNewTlmNo== null ) { if ( __krwSscoNewTlmNo!= null ) return false; }
			else if ( !_krwSscoNewTlmNo.equals(__krwSscoNewTlmNo) ) return false;
		}
		{
			Object _atsDtlDscd= getAtsDtlDscd();
			Object __atsDtlDscd= other.getAtsDtlDscd();
			if ( _atsDtlDscd== null ) { if ( __atsDtlDscd!= null ) return false; }
			else if ( !_atsDtlDscd.equals(__atsDtlDscd) ) return false;
		}
		{
			Object _atsRcvLmtAm= getAtsRcvLmtAm();
			Object __atsRcvLmtAm= other.getAtsRcvLmtAm();
			if ( _atsRcvLmtAm== null ) { if ( __atsRcvLmtAm!= null ) return false; }
			else if ( !_atsRcvLmtAm.equals(__atsRcvLmtAm) ) return false;
		}
		{
			Object _krwFmbkMmdaYn= getKrwFmbkMmdaYn();
			Object __krwFmbkMmdaYn= other.getKrwFmbkMmdaYn();
			if ( _krwFmbkMmdaYn== null ) { if ( __krwFmbkMmdaYn!= null ) return false; }
			else if ( !_krwFmbkMmdaYn.equals(__krwFmbkMmdaYn) ) return false;
		}
		{
			Object _opgOrdsMngNo= getOpgOrdsMngNo();
			Object __opgOrdsMngNo= other.getOpgOrdsMngNo();
			if ( _opgOrdsMngNo== null ) { if ( __opgOrdsMngNo!= null ) return false; }
			else if ( !_opgOrdsMngNo.equals(__opgOrdsMngNo) ) return false;
		}
		{
			Object _spcfPrdMoAcno= getSpcfPrdMoAcno();
			Object __spcfPrdMoAcno= other.getSpcfPrdMoAcno();
			if ( _spcfPrdMoAcno== null ) { if ( __spcfPrdMoAcno!= null ) return false; }
			else if ( !_spcfPrdMoAcno.equals(__spcfPrdMoAcno) ) return false;
		}
		{
			Object _restTxprLmtAm= getRestTxprLmtAm();
			Object __restTxprLmtAm= other.getRestTxprLmtAm();
			if ( _restTxprLmtAm== null ) { if ( __restTxprLmtAm!= null ) return false; }
			else if ( !_restTxprLmtAm.equals(__restTxprLmtAm) ) return false;
		}
		{
			Object _dppeAcno= getDppeAcno();
			Object __dppeAcno= other.getDppeAcno();
			if ( _dppeAcno== null ) { if ( __dppeAcno!= null ) return false; }
			else if ( !_dppeAcno.equals(__dppeAcno) ) return false;
		}
		{
			Object _pmnyIdeedYn= getPmnyIdeedYn();
			Object __pmnyIdeedYn= other.getPmnyIdeedYn();
			if ( _pmnyIdeedYn== null ) { if ( __pmnyIdeedYn!= null ) return false; }
			else if ( !_pmnyIdeedYn.equals(__pmnyIdeedYn) ) return false;
		}
		{
			Object _tdyCancAcno= getTdyCancAcno();
			Object __tdyCancAcno= other.getTdyCancAcno();
			if ( _tdyCancAcno== null ) { if ( __tdyCancAcno!= null ) return false; }
			else if ( !_tdyCancAcno.equals(__tdyCancAcno) ) return false;
		}
		{
			Object _cbrseNewYn= getCbrseNewYn();
			Object __cbrseNewYn= other.getCbrseNewYn();
			if ( _cbrseNewYn== null ) { if ( __cbrseNewYn!= null ) return false; }
			else if ( !_cbrseNewYn.equals(__cbrseNewYn) ) return false;
		}
		{
			Object _fmbkNewCitAtsCancYn= getFmbkNewCitAtsCancYn();
			Object __fmbkNewCitAtsCancYn= other.getFmbkNewCitAtsCancYn();
			if ( _fmbkNewCitAtsCancYn== null ) { if ( __fmbkNewCitAtsCancYn!= null ) return false; }
			else if ( !_fmbkNewCitAtsCancYn.equals(__fmbkNewCitAtsCancYn) ) return false;
		}
		{
			Object _cnstDdctFxpdGrnYr5OverYn= getCnstDdctFxpdGrnYr5OverYn();
			Object __cnstDdctFxpdGrnYr5OverYn= other.getCnstDdctFxpdGrnYr5OverYn();
			if ( _cnstDdctFxpdGrnYr5OverYn== null ) { if ( __cnstDdctFxpdGrnYr5OverYn!= null ) return false; }
			else if ( !_cnstDdctFxpdGrnYr5OverYn.equals(__cnstDdctFxpdGrnYr5OverYn) ) return false;
		}
		{
			Object _aprrBrdmCd= getAprrBrdmCd();
			Object __aprrBrdmCd= other.getAprrBrdmCd();
			if ( _aprrBrdmCd== null ) { if ( __aprrBrdmCd!= null ) return false; }
			else if ( !_aprrBrdmCd.equals(__aprrBrdmCd) ) return false;
		}
		{
			Object _cmpnOv1peYn= getCmpnOv1peYn();
			Object __cmpnOv1peYn= other.getCmpnOv1peYn();
			if ( _cmpnOv1peYn== null ) { if ( __cmpnOv1peYn!= null ) return false; }
			else if ( !_cmpnOv1peYn.equals(__cmpnOv1peYn) ) return false;
		}
		{
			Object _pnsfndCoreOupYn= getPnsfndCoreOupYn();
			Object __pnsfndCoreOupYn= other.getPnsfndCoreOupYn();
			if ( _pnsfndCoreOupYn== null ) { if ( __pnsfndCoreOupYn!= null ) return false; }
			else if ( !_pnsfndCoreOupYn.equals(__pnsfndCoreOupYn) ) return false;
		}
		{
			Object _rtpenPlanAplDt= getRtpenPlanAplDt();
			Object __rtpenPlanAplDt= other.getRtpenPlanAplDt();
			if ( _rtpenPlanAplDt== null ) { if ( __rtpenPlanAplDt!= null ) return false; }
			else if ( !_rtpenPlanAplDt.equals(__rtpenPlanAplDt) ) return false;
		}
		{
			Object _rtpenPlanItcsno= getRtpenPlanItcsno();
			Object __rtpenPlanItcsno= other.getRtpenPlanItcsno();
			if ( _rtpenPlanItcsno== null ) { if ( __rtpenPlanItcsno!= null ) return false; }
			else if ( !_rtpenPlanItcsno.equals(__rtpenPlanItcsno) ) return false;
		}
		{
			Object _glblBnkgJnngYn= getGlblBnkgJnngYn();
			Object __glblBnkgJnngYn= other.getGlblBnkgJnngYn();
			if ( _glblBnkgJnngYn== null ) { if ( __glblBnkgJnngYn!= null ) return false; }
			else if ( !_glblBnkgJnngYn.equals(__glblBnkgJnngYn) ) return false;
		}
		{
			Object _idCadNewDscd= getIdCadNewDscd();
			Object __idCadNewDscd= other.getIdCadNewDscd();
			if ( _idCadNewDscd== null ) { if ( __idCadNewDscd!= null ) return false; }
			else if ( !_idCadNewDscd.equals(__idCadNewDscd) ) return false;
		}
		{
			Object _encyEbnkPwnoCnf= getEncyEbnkPwnoCnf();
			Object __encyEbnkPwnoCnf= other.getEncyEbnkPwnoCnf();
			if ( _encyEbnkPwnoCnf== null ) { if ( __encyEbnkPwnoCnf!= null ) return false; }
			else if ( !_encyEbnkPwnoCnf.equals(__encyEbnkPwnoCnf) ) return false;
		}
		{
			Object _tlbnkPwnoCnf= getTlbnkPwnoCnf();
			Object __tlbnkPwnoCnf= other.getTlbnkPwnoCnf();
			if ( _tlbnkPwnoCnf== null ) { if ( __tlbnkPwnoCnf!= null ) return false; }
			else if ( !_tlbnkPwnoCnf.equals(__tlbnkPwnoCnf) ) return false;
		}
		{
			Object _gridRowCnt= getGridRowCnt();
			Object __gridRowCnt= other.getGridRowCnt();
			if ( _gridRowCnt== null ) { if ( __gridRowCnt!= null ) return false; }
			else if ( !_gridRowCnt.equals(__gridRowCnt) ) return false;
		}
		{
			Object _grid= getGrid();
			Object __grid= other.getGrid();
			if ( _grid== null ) { if ( __grid!= null ) return false; }
			else if ( !_grid.equals(__grid) ) return false;
		}
		{
			Object _gridRowCnt2= getGridRowCnt2();
			Object __gridRowCnt2= other.getGridRowCnt2();
			if ( _gridRowCnt2== null ) { if ( __gridRowCnt2!= null ) return false; }
			else if ( !_gridRowCnt2.equals(__gridRowCnt2) ) return false;
		}
		{
			Object _grid2= getGrid2();
			Object __grid2= other.getGrid2();
			if ( _grid2== null ) { if ( __grid2!= null ) return false; }
			else if ( !_grid2.equals(__grid2) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MnyPinBscMngInsertMnpMoAcno_DIDT.class.getName()).append(":\n");
		sb.append("\tsqcNmTrnCfdocCollYn: ");
		sb.append(sqcNmTrnCfdocCollYn==null?"null":getSqcNmTrnCfdocCollYn());
		sb.append("\n");
		sb.append("\tdpsNewDscd: ");
		sb.append(dpsNewDscd==null?"null":getDpsNewDscd());
		sb.append("\n");
		sb.append("\tdpsRsvNewDscd: ");
		sb.append(dpsRsvNewDscd==null?"null":getDpsRsvNewDscd());
		sb.append("\n");
		sb.append("\tencyActPwno: ");
		sb.append(encyActPwno==null?"null":getEncyActPwno());
		sb.append("\n");
		sb.append("\tsealSignUsgDscd: ");
		sb.append(sealSignUsgDscd==null?"null":getSealSignUsgDscd());
		sb.append("\n");
		sb.append("\tpdcd: ");
		sb.append(pdcd==null?"null":getPdcd());
		sb.append("\n");
		sb.append("\tcsno: ");
		sb.append(csno==null?"null":getCsno());
		sb.append("\n");
		sb.append("\tcusDgnAcno: ");
		sb.append(cusDgnAcno==null?"null":getCusDgnAcno());
		sb.append("\n");
		sb.append("\tprrRgsPwnoKey: ");
		sb.append(prrRgsPwnoKey==null?"null":getPrrRgsPwnoKey());
		sb.append("\n");
		sb.append("\tsmsdDscd: ");
		sb.append(smsdDscd==null?"null":getSmsdDscd());
		sb.append("\n");
		sb.append("\tpsnInfExpsCnfYn: ");
		sb.append(psnInfExpsCnfYn==null?"null":getPsnInfExpsCnfYn());
		sb.append("\n");
		sb.append("\tscanUablRncd: ");
		sb.append(scanUablRncd==null?"null":getScanUablRncd());
		sb.append("\n");
		sb.append("\tpsnInfAgmdMngNo: ");
		sb.append(psnInfAgmdMngNo==null?"null":getPsnInfAgmdMngNo());
		sb.append("\n");
		sb.append("\tacnmCnfEno: ");
		sb.append(acnmCnfEno==null?"null":getAcnmCnfEno());
		sb.append("\n");
		sb.append("\tadvpeEno: ");
		sb.append(advpeEno==null?"null":getAdvpeEno());
		sb.append("\n");
		sb.append("\tidcrDscd: ");
		sb.append(idcrDscd==null?"null":getIdcrDscd());
		sb.append("\n");
		sb.append("\tidcrFnm: ");
		sb.append(idcrFnm==null?"null":getIdcrFnm());
		sb.append("\n");
		sb.append("\tidcrEncyRsdlNo: ");
		sb.append(idcrEncyRsdlNo==null?"null":getIdcrEncyRsdlNo());
		sb.append("\n");
		sb.append("\tidcrIsuDt: ");
		sb.append(idcrIsuDt==null?"null":getIdcrIsuDt());
		sb.append("\n");
		sb.append("\tidcrImgKey: ");
		sb.append(idcrImgKey==null?"null":getIdcrImgKey());
		sb.append("\n");
		sb.append("\tidcrCnfShap: ");
		sb.append(idcrCnfShap==null?"null":getIdcrCnfShap());
		sb.append("\n");
		sb.append("\tidcrRuseYn: ");
		sb.append(idcrRuseYn==null?"null":getIdcrRuseYn());
		sb.append("\n");
		sb.append("\tidcrAgnpeTrnYn: ");
		sb.append(idcrAgnpeTrnYn==null?"null":getIdcrAgnpeTrnYn());
		sb.append("\n");
		sb.append("\tappRgsDscd: ");
		sb.append(appRgsDscd==null?"null":getAppRgsDscd());
		sb.append("\n");
		sb.append("\tappRgsBrcd: ");
		sb.append(appRgsBrcd==null?"null":getAppRgsBrcd());
		sb.append("\n");
		sb.append("\tappRgsDt: ");
		sb.append(appRgsDt==null?"null":getAppRgsDt());
		sb.append("\n");
		sb.append("\tappRgsSrno: ");
		sb.append(appRgsSrno==null?"null":getAppRgsSrno());
		sb.append("\n");
		sb.append("\twmsLnkYn: ");
		sb.append(wmsLnkYn==null?"null":getWmsLnkYn());
		sb.append("\n");
		sb.append("\tsnthAsetMngCsno: ");
		sb.append(snthAsetMngCsno==null?"null":getSnthAsetMngCsno());
		sb.append("\n");
		sb.append("\tsnthAsetMngDesgnPrdCnt: ");
		sb.append(snthAsetMngDesgnPrdCnt==null?"null":getSnthAsetMngDesgnPrdCnt());
		sb.append("\n");
		sb.append("\tsnthAsetMngAltrIvstWgt: ");
		sb.append(snthAsetMngAltrIvstWgt==null?"null":getSnthAsetMngAltrIvstWgt());
		sb.append("\n");
		sb.append("\tsnthAsetMngBksWgt: ");
		sb.append(snthAsetMngBksWgt==null?"null":getSnthAsetMngBksWgt());
		sb.append("\n");
		sb.append("\tsnthAsetMngFrgBndWgt: ");
		sb.append(snthAsetMngFrgBndWgt==null?"null":getSnthAsetMngFrgBndWgt());
		sb.append("\n");
		sb.append("\tsnthAsetMngFrgStcWgt: ");
		sb.append(snthAsetMngFrgStcWgt==null?"null":getSnthAsetMngFrgStcWgt());
		sb.append("\n");
		sb.append("\tsnthAsetMngPdcd: ");
		sb.append(snthAsetMngPdcd==null?"null":getSnthAsetMngPdcd());
		sb.append("\n");
		sb.append("\tappRgsPwno: ");
		sb.append(appRgsPwno==null?"null":getAppRgsPwno());
		sb.append("\n");
		sb.append("\tappRgsAtsAcno: ");
		sb.append(appRgsAtsAcno==null?"null":getAppRgsAtsAcno());
		sb.append("\n");
		sb.append("\twmLnkTrnSrno: ");
		sb.append(wmLnkTrnSrno==null?"null":getWmLnkTrnSrno());
		sb.append("\n");
		sb.append("\tsnthAsetMngDeedCd: ");
		sb.append(snthAsetMngDeedCd==null?"null":getSnthAsetMngDeedCd());
		sb.append("\n");
		sb.append("\tsnthAsetMngFlwWgt: ");
		sb.append(snthAsetMngFlwWgt==null?"null":getSnthAsetMngFlwWgt());
		sb.append("\n");
		sb.append("\tsnthAsetMngDomStcWgt: ");
		sb.append(snthAsetMngDomStcWgt==null?"null":getSnthAsetMngDomStcWgt());
		sb.append("\n");
		sb.append("\tsnthAsetMngDomBndWgt: ");
		sb.append(snthAsetMngDomBndWgt==null?"null":getSnthAsetMngDomBndWgt());
		sb.append("\n");
		sb.append("\tprdStbyAnlsSrno: ");
		sb.append(prdStbyAnlsSrno==null?"null":getPrdStbyAnlsSrno());
		sb.append("\n");
		sb.append("\tinlnAnlsSrno: ");
		sb.append(inlnAnlsSrno==null?"null":getInlnAnlsSrno());
		sb.append("\n");
		sb.append("\tasetIstMngNo: ");
		sb.append(asetIstMngNo==null?"null":getAsetIstMngNo());
		sb.append("\n");
		sb.append("\trtpenPlanOrgPdcd: ");
		sb.append(rtpenPlanOrgPdcd==null?"null":getRtpenPlanOrgPdcd());
		sb.append("\n");
		sb.append("\tjnpeTycd: ");
		sb.append(jnpeTycd==null?"null":getJnpeTycd());
		sb.append("\n");
		sb.append("\tfndSgpFpCnslSrvcDscd: ");
		sb.append(fndSgpFpCnslSrvcDscd==null?"null":getFndSgpFpCnslSrvcDscd());
		sb.append("\n");
		sb.append("\trsdlBzpeNo: ");
		sb.append(rsdlBzpeNo==null?"null":getRsdlBzpeNo());
		sb.append("\n");
		sb.append("\tfrnrLstVldTem: ");
		sb.append(frnrLstVldTem==null?"null":getFrnrLstVldTem());
		sb.append("\n");
		sb.append("\tinetRsvRcpDscd: ");
		sb.append(inetRsvRcpDscd==null?"null":getInetRsvRcpDscd());
		sb.append("\n");
		sb.append("\tinetRsvIdfNo: ");
		sb.append(inetRsvIdfNo==null?"null":getInetRsvIdfNo());
		sb.append("\n");
		sb.append("\tinetRsvNo: ");
		sb.append(inetRsvNo==null?"null":getInetRsvNo());
		sb.append("\n");
		sb.append("\tinetRsvCusPureNewYn: ");
		sb.append(inetRsvCusPureNewYn==null?"null":getInetRsvCusPureNewYn());
		sb.append("\n");
		sb.append("\tsynpbPdcd: ");
		sb.append(synpbPdcd==null?"null":getSynpbPdcd());
		sb.append("\n");
		sb.append("\tactUsgAimDis: ");
		sb.append(actUsgAimDis==null?"null":getActUsgAimDis());
		sb.append("\n");
		sb.append("\tfrnrEmptEduYn: ");
		sb.append(frnrEmptEduYn==null?"null":getFrnrEmptEduYn());
		sb.append("\n");
		sb.append("\tfncTrnAimCollDis: ");
		sb.append(fncTrnAimCollDis==null?"null":getFncTrnAimCollDis());
		sb.append("\n");
		sb.append("\tlnoActOpngRsn: ");
		sb.append(lnoActOpngRsn==null?"null":getLnoActOpngRsn());
		sb.append("\n");
		sb.append("\tdepaCrdcCollYn: ");
		sb.append(depaCrdcCollYn==null?"null":getDepaCrdcCollYn());
		sb.append("\n");
		sb.append("\tidCadIsuRqdcUsgYn: ");
		sb.append(idCadIsuRqdcUsgYn==null?"null":getIdCadIsuRqdcUsgYn());
		sb.append("\n");
		sb.append("\trcvVcrMlsChidYn: ");
		sb.append(rcvVcrMlsChidYn==null?"null":getRcvVcrMlsChidYn());
		sb.append("\n");
		sb.append("\tsaltsScdDd: ");
		sb.append(saltsScdDd==null?"null":getSaltsScdDd());
		sb.append("\n");
		sb.append("\tatmWdrDscd: ");
		sb.append(atmWdrDscd==null?"null":getAtmWdrDscd());
		sb.append("\n");
		sb.append("\tcctnTrnKdcd: ");
		sb.append(cctnTrnKdcd==null?"null":getCctnTrnKdcd());
		sb.append("\n");
		sb.append("\tidCadIsuYn: ");
		sb.append(idCadIsuYn==null?"null":getIdCadIsuYn());
		sb.append("\n");
		sb.append("\tptnrPrmeIr1Yn: ");
		sb.append(ptnrPrmeIr1Yn==null?"null":getPtnrPrmeIr1Yn());
		sb.append("\n");
		sb.append("\tptnrPrmeIr2Yn: ");
		sb.append(ptnrPrmeIr2Yn==null?"null":getPtnrPrmeIr2Yn());
		sb.append("\n");
		sb.append("\tptnrPrmeIr3Yn: ");
		sb.append(ptnrPrmeIr3Yn==null?"null":getPtnrPrmeIr3Yn());
		sb.append("\n");
		sb.append("\tptnrPrmeIr4Yn: ");
		sb.append(ptnrPrmeIr4Yn==null?"null":getPtnrPrmeIr4Yn());
		sb.append("\n");
		sb.append("\tascnPbokNm: ");
		sb.append(ascnPbokNm==null?"null":getAscnPbokNm());
		sb.append("\n");
		sb.append("\trcvpeNm: ");
		sb.append(rcvpeNm==null?"null":getRcvpeNm());
		sb.append("\n");
		sb.append("\trcvDd: ");
		sb.append(rcvDd==null?"null":getRcvDd());
		sb.append("\n");
		sb.append("\tdntnAtsEndDt: ");
		sb.append(dntnAtsEndDt==null?"null":getDntnAtsEndDt());
		sb.append("\n");
		sb.append("\tpatnAscnAcno: ");
		sb.append(patnAscnAcno==null?"null":getPatnAscnAcno());
		sb.append("\n");
		sb.append("\tpatnAscnNm: ");
		sb.append(patnAscnNm==null?"null":getPatnAscnNm());
		sb.append("\n");
		sb.append("\taimFdNm: ");
		sb.append(aimFdNm==null?"null":getAimFdNm());
		sb.append("\n");
		sb.append("\tpatnAscnDis: ");
		sb.append(patnAscnDis==null?"null":getPatnAscnDis());
		sb.append("\n");
		sb.append("\tpatnHpNo: ");
		sb.append(patnHpNo==null?"null":getPatnHpNo());
		sb.append("\n");
		sb.append("\tchilRrno: ");
		sb.append(chilRrno==null?"null":getChilRrno());
		sb.append("\n");
		sb.append("\tdntnInfOfrAgrYn: ");
		sb.append(dntnInfOfrAgrYn==null?"null":getDntnInfOfrAgrYn());
		sb.append("\n");
		sb.append("\tdntnlCd: ");
		sb.append(dntnlCd==null?"null":getDntnlCd());
		sb.append("\n");
		sb.append("\tclsaAtsRqYn: ");
		sb.append(clsaAtsRqYn==null?"null":getClsaAtsRqYn());
		sb.append("\n");
		sb.append("\tclsaAtsPmnyAcno: ");
		sb.append(clsaAtsPmnyAcno==null?"null":getClsaAtsPmnyAcno());
		sb.append("\n");
		sb.append("\tclsaAtsEndDt: ");
		sb.append(clsaAtsEndDt==null?"null":getClsaAtsEndDt());
		sb.append("\n");
		sb.append("\tfncTaxtSmsRqYn: ");
		sb.append(fncTaxtSmsRqYn==null?"null":getFncTaxtSmsRqYn());
		sb.append("\n");
		sb.append("\twfFclUnqNo: ");
		sb.append(wfFclUnqNo==null?"null":getWfFclUnqNo());
		sb.append("\n");
		sb.append("\tlocaPrmeYn: ");
		sb.append(locaPrmeYn==null?"null":getLocaPrmeYn());
		sb.append("\n");
		sb.append("\tafiBzcd: ");
		sb.append(afiBzcd==null?"null":getAfiBzcd());
		sb.append("\n");
		sb.append("\temlNtcSrvcYn: ");
		sb.append(emlNtcSrvcYn==null?"null":getEmlNtcSrvcYn());
		sb.append("\n");
		sb.append("\tfmbkCtrdCollYn: ");
		sb.append(fmbkCtrdCollYn==null?"null":getFmbkCtrdCollYn());
		sb.append("\n");
		sb.append("\tadrpRgsYn: ");
		sb.append(adrpRgsYn==null?"null":getAdrpRgsYn());
		sb.append("\n");
		sb.append("\tmbhYn: ");
		sb.append(mbhYn==null?"null":getMbhYn());
		sb.append("\n");
		sb.append("\tpsnInfAgrYn: ");
		sb.append(psnInfAgrYn==null?"null":getPsnInfAgrYn());
		sb.append("\n");
		sb.append("\tdatAcldHpNo: ");
		sb.append(datAcldHpNo==null?"null":getDatAcldHpNo());
		sb.append("\n");
		sb.append("\tdpsBatRqsNo: ");
		sb.append(dpsBatRqsNo==null?"null":getDpsBatRqsNo());
		sb.append("\n");
		sb.append("\tdpsBatRqsSrno: ");
		sb.append(dpsBatRqsSrno==null?"null":getDpsBatRqsSrno());
		sb.append("\n");
		sb.append("\tagnpeEncyRrno: ");
		sb.append(agnpeEncyRrno==null?"null":getAgnpeEncyRrno());
		sb.append("\n");
		sb.append("\tagnpeFnm: ");
		sb.append(agnpeFnm==null?"null":getAgnpeFnm());
		sb.append("\n");
		sb.append("\trppeDupOmitYn: ");
		sb.append(rppeDupOmitYn==null?"null":getRppeDupOmitYn());
		sb.append("\n");
		sb.append("\trppeAgnpeAcrdYn: ");
		sb.append(rppeAgnpeAcrdYn==null?"null":getRppeAgnpeAcrdYn());
		sb.append("\n");
		sb.append("\trppeFnm: ");
		sb.append(rppeFnm==null?"null":getRppeFnm());
		sb.append("\n");
		sb.append("\trppeEncyRrno: ");
		sb.append(rppeEncyRrno==null?"null":getRppeEncyRrno());
		sb.append("\n");
		sb.append("\tagnpeDupYn: ");
		sb.append(agnpeDupYn==null?"null":getAgnpeDupYn());
		sb.append("\n");
		sb.append("\trppeDupYn: ");
		sb.append(rppeDupYn==null?"null":getRppeDupYn());
		sb.append("\n");
		sb.append("\titpyMecd: ");
		sb.append(itpyMecd==null?"null":getItpyMecd());
		sb.append("\n");
		sb.append("\titpyCycd: ");
		sb.append(itpyCycd==null?"null":getItpyCycd());
		sb.append("\n");
		sb.append("\tnextItpyDt: ");
		sb.append(nextItpyDt==null?"null":getNextItpyDt());
		sb.append("\n");
		sb.append("\tactMngBrcd: ");
		sb.append(actMngBrcd==null?"null":getActMngBrcd());
		sb.append("\n");
		sb.append("\tasscNmnlDpstYn: ");
		sb.append(asscNmnlDpstYn==null?"null":getAsscNmnlDpstYn());
		sb.append("\n");
		sb.append("\tnetrApvNo: ");
		sb.append(netrApvNo==null?"null":getNetrApvNo());
		sb.append("\n");
		sb.append("\tmbpbkJnngYn: ");
		sb.append(mbpbkJnngYn==null?"null":getMbpbkJnngYn());
		sb.append("\n");
		sb.append("\tmblPbokInetBnkgId: ");
		sb.append(mblPbokInetBnkgId==null?"null":getMblPbokInetBnkgId());
		sb.append("\n");
		sb.append("\tnpbokIccadIsuDis: ");
		sb.append(npbokIccadIsuDis==null?"null":getNpbokIccadIsuDis());
		sb.append("\n");
		sb.append("\tideedCd: ");
		sb.append(ideedCd==null?"null":getIdeedCd());
		sb.append("\n");
		sb.append("\tpbokEngPrngYn: ");
		sb.append(pbokEngPrngYn==null?"null":getPbokEngPrngYn());
		sb.append("\n");
		sb.append("\tnlDscd: ");
		sb.append(nlDscd==null?"null":getNlDscd());
		sb.append("\n");
		sb.append("\tdpsDeedNo: ");
		sb.append(dpsDeedNo==null?"null":getDpsDeedNo());
		sb.append("\n");
		sb.append("\tpbokIssuYn: ");
		sb.append(pbokIssuYn==null?"null":getPbokIssuYn());
		sb.append("\n");
		sb.append("\tprdGdncPbokPrngYn: ");
		sb.append(prdGdncPbokPrngYn==null?"null":getPrdGdncPbokPrngYn());
		sb.append("\n");
		sb.append("\tnrsrCnfDocCollYn: ");
		sb.append(nrsrCnfDocCollYn==null?"null":getNrsrCnfDocCollYn());
		sb.append("\n");
		sb.append("\tbokStttPermXtYn: ");
		sb.append(bokStttPermXtYn==null?"null":getBokStttPermXtYn());
		sb.append("\n");
		sb.append("\tnrsrPwnoRgsYn: ");
		sb.append(nrsrPwnoRgsYn==null?"null":getNrsrPwnoRgsYn());
		sb.append("\n");
		sb.append("\tnrsrAccCd: ");
		sb.append(nrsrAccCd==null?"null":getNrsrAccCd());
		sb.append("\n");
		sb.append("\tkrwDpsAccDscd: ");
		sb.append(krwDpsAccDscd==null?"null":getKrwDpsAccDscd());
		sb.append("\n");
		sb.append("\tnrsrKrwInfwDscd: ");
		sb.append(nrsrKrwInfwDscd==null?"null":getNrsrKrwInfwDscd());
		sb.append("\n");
		sb.append("\ttxprDscd: ");
		sb.append(txprDscd==null?"null":getTxprDscd());
		sb.append("\n");
		sb.append("\ttxprLmtAm: ");
		sb.append(txprLmtAm==null?"null":getTxprLmtAm());
		sb.append("\n");
		sb.append("\tprchAm: ");
		sb.append(prchAm==null?"null":getPrchAm());
		sb.append("\n");
		sb.append("\tpmbilAm: ");
		sb.append(pmbilAm==null?"null":getPmbilAm());
		sb.append("\n");
		sb.append("\tcackAm: ");
		sb.append(cackAm==null?"null":getCackAm());
		sb.append("\n");
		sb.append("\tbokBchkAm: ");
		sb.append(bokBchkAm==null?"null":getBokBchkAm());
		sb.append("\n");
		sb.append("\tetcDeedAm: ");
		sb.append(etcDeedAm==null?"null":getEtcDeedAm());
		sb.append("\n");
		sb.append("\tfncTrnAimCd: ");
		sb.append(fncTrnAimCd==null?"null":getFncTrnAimCd());
		sb.append("\n");
		sb.append("\ttrnFdSrcCd: ");
		sb.append(trnFdSrcCd==null?"null":getTrnFdSrcCd());
		sb.append("\n");
		sb.append("\tfdOwpeYn: ");
		sb.append(fdOwpeYn==null?"null":getFdOwpeYn());
		sb.append("\n");
		sb.append("\tfncTrnAimTxt: ");
		sb.append(fncTrnAimTxt==null?"null":getFncTrnAimTxt());
		sb.append("\n");
		sb.append("\ttrnFdSrcCdTxt: ");
		sb.append(trnFdSrcCdTxt==null?"null":getTrnFdSrcCdTxt());
		sb.append("\n");
		sb.append("\tckbilKdcd: ");
		sb.append(ckbilKdcd==null?"null":getCkbilKdcd());
		sb.append("\n");
		sb.append("\tcacGramRcvYn: ");
		sb.append(cacGramRcvYn==null?"null":getCacGramRcvYn());
		sb.append("\n");
		sb.append("\tcacGramRcvCrtdIsuYn: ");
		sb.append(cacGramRcvCrtdIsuYn==null?"null":getCacGramRcvCrtdIsuYn());
		sb.append("\n");
		sb.append("\tcacGramRcvAm: ");
		sb.append(cacGramRcvAm==null?"null":getCacGramRcvAm());
		sb.append("\n");
		sb.append("\tcacGramTrfAm: ");
		sb.append(cacGramTrfAm==null?"null":getCacGramTrfAm());
		sb.append("\n");
		sb.append("\tcacGramBchkAm: ");
		sb.append(cacGramBchkAm==null?"null":getCacGramBchkAm());
		sb.append("\n");
		sb.append("\tfeeRcvYn: ");
		sb.append(feeRcvYn==null?"null":getFeeRcvYn());
		sb.append("\n");
		sb.append("\tfeeCshtfDscd: ");
		sb.append(feeCshtfDscd==null?"null":getFeeCshtfDscd());
		sb.append("\n");
		sb.append("\trctsOupYn: ");
		sb.append(rctsOupYn==null?"null":getRctsOupYn());
		sb.append("\n");
		sb.append("\tfeeAm: ");
		sb.append(feeAm==null?"null":getFeeAm());
		sb.append("\n");
		sb.append("\twdrAcno: ");
		sb.append(wdrAcno==null?"null":getWdrAcno());
		sb.append("\n");
		sb.append("\tencyWdrActPwno: ");
		sb.append(encyWdrActPwno==null?"null":getEncyWdrActPwno());
		sb.append("\n");
		sb.append("\txprRcvAcno: ");
		sb.append(xprRcvAcno==null?"null":getXprRcvAcno());
		sb.append("\n");
		sb.append("\tirprmTgt1Dscd: ");
		sb.append(irprmTgt1Dscd==null?"null":getIrprmTgt1Dscd());
		sb.append("\n");
		sb.append("\tirprmTgt2Dscd: ");
		sb.append(irprmTgt2Dscd==null?"null":getIrprmTgt2Dscd());
		sb.append("\n");
		sb.append("\tirprmTgt3Dscd: ");
		sb.append(irprmTgt3Dscd==null?"null":getIrprmTgt3Dscd());
		sb.append("\n");
		sb.append("\tirprmTgt4Dscd: ");
		sb.append(irprmTgt4Dscd==null?"null":getIrprmTgt4Dscd());
		sb.append("\n");
		sb.append("\tirprmTgt5Dscd: ");
		sb.append(irprmTgt5Dscd==null?"null":getIrprmTgt5Dscd());
		sb.append("\n");
		sb.append("\tirprmTgt6Dscd: ");
		sb.append(irprmTgt6Dscd==null?"null":getIrprmTgt6Dscd());
		sb.append("\n");
		sb.append("\txprPrcMecd: ");
		sb.append(xprPrcMecd==null?"null":getXprPrcMecd());
		sb.append("\n");
		sb.append("\tdntnAtsAcno: ");
		sb.append(dntnAtsAcno==null?"null":getDntnAtsAcno());
		sb.append("\n");
		sb.append("\tnewFdDscd: ");
		sb.append(newFdDscd==null?"null":getNewFdDscd());
		sb.append("\n");
		sb.append("\tspcfMonyTrtAcno: ");
		sb.append(spcfMonyTrtAcno==null?"null":getSpcfMonyTrtAcno());
		sb.append("\n");
		sb.append("\tpnsnPayTemEstYn: ");
		sb.append(pnsnPayTemEstYn==null?"null":getPnsnPayTemEstYn());
		sb.append("\n");
		sb.append("\tpnsnPayCtrtmYcnt: ");
		sb.append(pnsnPayCtrtmYcnt==null?"null":getPnsnPayCtrtmYcnt());
		sb.append("\n");
		sb.append("\tpnsnPayCycd: ");
		sb.append(pnsnPayCycd==null?"null":getPnsnPayCycd());
		sb.append("\n");
		sb.append("\tlnoActPbokIssuYn: ");
		sb.append(lnoActPbokIssuYn==null?"null":getLnoActPbokIssuYn());
		sb.append("\n");
		sb.append("\tbscAcno: ");
		sb.append(bscAcno==null?"null":getBscAcno());
		sb.append("\n");
		sb.append("\toldAtrbXtRncd: ");
		sb.append(oldAtrbXtRncd==null?"null":getOldAtrbXtRncd());
		sb.append("\n");
		sb.append("\tcpblChckTgtYn: ");
		sb.append(cpblChckTgtYn==null?"null":getCpblChckTgtYn());
		sb.append("\n");
		sb.append("\trpcmDpstTgtYn: ");
		sb.append(rpcmDpstTgtYn==null?"null":getRpcmDpstTgtYn());
		sb.append("\n");
		sb.append("\toldAtrbCeoRgsrDrtrYn: ");
		sb.append(oldAtrbCeoRgsrDrtrYn==null?"null":getOldAtrbCeoRgsrDrtrYn());
		sb.append("\n");
		sb.append("\toldAtrbApvNo: ");
		sb.append(oldAtrbApvNo==null?"null":getOldAtrbApvNo());
		sb.append("\n");
		sb.append("\trdepAcno: ");
		sb.append(rdepAcno==null?"null":getRdepAcno());
		sb.append("\n");
		sb.append("\toldAtrbApvRsn: ");
		sb.append(oldAtrbApvRsn==null?"null":getOldAtrbApvRsn());
		sb.append("\n");
		sb.append("\toldAtrbChckTim: ");
		sb.append(oldAtrbChckTim==null?"null":getOldAtrbChckTim());
		sb.append("\n");
		sb.append("\tccadRsltInqYn: ");
		sb.append(ccadRsltInqYn==null?"null":getCcadRsltInqYn());
		sb.append("\n");
		sb.append("\ttbkCcadHldgYn: ");
		sb.append(tbkCcadHldgYn==null?"null":getTbkCcadHldgYn());
		sb.append("\n");
		sb.append("\tcadStlActTbkYn: ");
		sb.append(cadStlActTbkYn==null?"null":getCadStlActTbkYn());
		sb.append("\n");
		sb.append("\tccadBasRsltAm: ");
		sb.append(ccadBasRsltAm==null?"null":getCcadBasRsltAm());
		sb.append("\n");
		sb.append("\tutzRsltBasStaDt: ");
		sb.append(utzRsltBasStaDt==null?"null":getUtzRsltBasStaDt());
		sb.append("\n");
		sb.append("\tutzRsltBasEndDt: ");
		sb.append(utzRsltBasEndDt==null?"null":getUtzRsltBasEndDt());
		sb.append("\n");
		sb.append("\tutzRsltInqTim: ");
		sb.append(utzRsltInqTim==null?"null":getUtzRsltInqTim());
		sb.append("\n");
		sb.append("\tamfRispeDis: ");
		sb.append(amfRispeDis==null?"null":getAmfRispeDis());
		sb.append("\n");
		sb.append("\tamfRispeFnm: ");
		sb.append(amfRispeFnm==null?"null":getAmfRispeFnm());
		sb.append("\n");
		sb.append("\tamfRispeRrno: ");
		sb.append(amfRispeRrno==null?"null":getAmfRispeRrno());
		sb.append("\n");
		sb.append("\tamfRispeCnad: ");
		sb.append(amfRispeCnad==null?"null":getAmfRispeCnad());
		sb.append("\n");
		sb.append("\tanrvNprcYn: ");
		sb.append(anrvNprcYn==null?"null":getAnrvNprcYn());
		sb.append("\n");
		sb.append("\tpbamAcno: ");
		sb.append(pbamAcno==null?"null":getPbamAcno());
		sb.append("\n");
		sb.append("\tpbamSnnmAcno: ");
		sb.append(pbamSnnmAcno==null?"null":getPbamSnnmAcno());
		sb.append("\n");
		sb.append("\tpmnyTrnUnqNo: ");
		sb.append(pmnyTrnUnqNo==null?"null":getPmnyTrnUnqNo());
		sb.append("\n");
		sb.append("\tctrtmMcn: ");
		sb.append(ctrtmMcn==null?"null":getCtrtmMcn());
		sb.append("\n");
		sb.append("\tctrtmDcnt: ");
		sb.append(ctrtmDcnt==null?"null":getCtrtmDcnt());
		sb.append("\n");
		sb.append("\txprDt: ");
		sb.append(xprDt==null?"null":getXprDt());
		sb.append("\n");
		sb.append("\trcknDt: ");
		sb.append(rcknDt==null?"null":getRcknDt());
		sb.append("\n");
		sb.append("\tencyAtsActPwno: ");
		sb.append(encyAtsActPwno==null?"null":getEncyAtsActPwno());
		sb.append("\n");
		sb.append("\tatsCycd: ");
		sb.append(atsCycd==null?"null":getAtsCycd());
		sb.append("\n");
		sb.append("\tatsStaDt: ");
		sb.append(atsStaDt==null?"null":getAtsStaDt());
		sb.append("\n");
		sb.append("\tatsEndDt: ");
		sb.append(atsEndDt==null?"null":getAtsEndDt());
		sb.append("\n");
		sb.append("\tatsCucd: ");
		sb.append(atsCucd==null?"null":getAtsCucd());
		sb.append("\n");
		sb.append("\tatsDd: ");
		sb.append(atsDd==null?"null":getAtsDd());
		sb.append("\n");
		sb.append("\tatsMecn: ");
		sb.append(atsMecn==null?"null":getAtsMecn());
		sb.append("\n");
		sb.append("\tatsAcno: ");
		sb.append(atsAcno==null?"null":getAtsAcno());
		sb.append("\n");
		sb.append("\tatsAm: ");
		sb.append(atsAm==null?"null":getAtsAm());
		sb.append("\n");
		sb.append("\ttbkSltCopCd: ");
		sb.append(tbkSltCopCd==null?"null":getTbkSltCopCd());
		sb.append("\n");
		sb.append("\ttbkSltCopOfemYn: ");
		sb.append(tbkSltCopOfemYn==null?"null":getTbkSltCopOfemYn());
		sb.append("\n");
		sb.append("\tdntnRqYn: ");
		sb.append(dntnRqYn==null?"null":getDntnRqYn());
		sb.append("\n");
		sb.append("\tdntnAmDscd: ");
		sb.append(dntnAmDscd==null?"null":getDntnAmDscd());
		sb.append("\n");
		sb.append("\tdntnAm: ");
		sb.append(dntnAm==null?"null":getDntnAm());
		sb.append("\n");
		sb.append("\txprCancRcvAcno: ");
		sb.append(xprCancRcvAcno==null?"null":getXprCancRcvAcno());
		sb.append("\n");
		sb.append("\tbchrCponNo: ");
		sb.append(bchrCponNo==null?"null":getBchrCponNo());
		sb.append("\n");
		sb.append("\tbchrSupAm: ");
		sb.append(bchrSupAm==null?"null":getBchrSupAm());
		sb.append("\n");
		sb.append("\tbchrCusPidAm: ");
		sb.append(bchrCusPidAm==null?"null":getBchrCusPidAm());
		sb.append("\n");
		sb.append("\tapvNo: ");
		sb.append(apvNo==null?"null":getApvNo());
		sb.append("\n");
		sb.append("\tcponCrtfNo: ");
		sb.append(cponCrtfNo==null?"null":getCponCrtfNo());
		sb.append("\n");
		sb.append("\tautoRdepYn: ");
		sb.append(autoRdepYn==null?"null":getAutoRdepYn());
		sb.append("\n");
		sb.append("\tinsuJnngAgrYn: ");
		sb.append(insuJnngAgrYn==null?"null":getInsuJnngAgrYn());
		sb.append("\n");
		sb.append("\tjnngTgtDscd: ");
		sb.append(jnngTgtDscd==null?"null":getJnngTgtDscd());
		sb.append("\n");
		sb.append("\tccadHldgYn: ");
		sb.append(ccadHldgYn==null?"null":getCcadHldgYn());
		sb.append("\n");
		sb.append("\tfrcsDshgDt: ");
		sb.append(frcsDshgDt==null?"null":getFrcsDshgDt());
		sb.append("\n");
		sb.append("\tcusDgnPrdNm: ");
		sb.append(cusDgnPrdNm==null?"null":getCusDgnPrdNm());
		sb.append("\n");
		sb.append("\txcoCd: ");
		sb.append(xcoCd==null?"null":getXcoCd());
		sb.append("\n");
		sb.append("\tfrndAcno: ");
		sb.append(frndAcno==null?"null":getFrndAcno());
		sb.append("\n");
		sb.append("\tspdtDgnMm: ");
		sb.append(spdtDgnMm==null?"null":getSpdtDgnMm());
		sb.append("\n");
		sb.append("\tspdtDgnDd: ");
		sb.append(spdtDgnDd==null?"null":getSpdtDgnDd());
		sb.append("\n");
		sb.append("\taplIr: ");
		sb.append(aplIr==null?"null":getAplIr());
		sb.append("\n");
		sb.append("\temlFpAcblNtfcRqYn: ");
		sb.append(emlFpAcblNtfcRqYn==null?"null":getEmlFpAcblNtfcRqYn());
		sb.append("\n");
		sb.append("\temlFpAcblNtfcBsdt: ");
		sb.append(emlFpAcblNtfcBsdt==null?"null":getEmlFpAcblNtfcBsdt());
		sb.append("\n");
		sb.append("\tfpPrftRtSmsNtfcRqYn: ");
		sb.append(fpPrftRtSmsNtfcRqYn==null?"null":getFpPrftRtSmsNtfcRqYn());
		sb.append("\n");
		sb.append("\tfpPrftRtSmsNtfcBsdt: ");
		sb.append(fpPrftRtSmsNtfcBsdt==null?"null":getFpPrftRtSmsNtfcBsdt());
		sb.append("\n");
		sb.append("\tgoalPrSmsRqYn: ");
		sb.append(goalPrSmsRqYn==null?"null":getGoalPrSmsRqYn());
		sb.append("\n");
		sb.append("\tgoalPr: ");
		sb.append(goalPr==null?"null":getGoalPr());
		sb.append("\n");
		sb.append("\talwPr: ");
		sb.append(alwPr==null?"null":getAlwPr());
		sb.append("\n");
		sb.append("\tgBnkgGoalPrftRtDscd: ");
		sb.append(gBnkgGoalPrftRtDscd==null?"null":getgBnkgGoalPrftRtDscd());
		sb.append("\n");
		sb.append("\tgBnkgAlwLossDscd: ");
		sb.append(gBnkgAlwLossDscd==null?"null":getgBnkgAlwLossDscd());
		sb.append("\n");
		sb.append("\tfcPsklUseYn: ");
		sb.append(fcPsklUseYn==null?"null":getFcPsklUseYn());
		sb.append("\n");
		sb.append("\txrtTsTycd: ");
		sb.append(xrtTsTycd==null?"null":getXrtTsTycd());
		sb.append("\n");
		sb.append("\txrtMaxAcldAm: ");
		sb.append(xrtMaxAcldAm==null?"null":getXrtMaxAcldAm());
		sb.append("\n");
		sb.append("\tdgnXrtNtfcSrvcDscd: ");
		sb.append(dgnXrtNtfcSrvcDscd==null?"null":getDgnXrtNtfcSrvcDscd());
		sb.append("\n");
		sb.append("\tntfcSrvcDgnXrt: ");
		sb.append(ntfcSrvcDgnXrt==null?"null":getNtfcSrvcDgnXrt());
		sb.append("\n");
		sb.append("\tovtbCdno: ");
		sb.append(ovtbCdno==null?"null":getOvtbCdno());
		sb.append("\n");
		sb.append("\tfmbkCoNo: ");
		sb.append(fmbkCoNo==null?"null":getFmbkCoNo());
		sb.append("\n");
		sb.append("\tatrnDscd: ");
		sb.append(atrnDscd==null?"null":getAtrnDscd());
		sb.append("\n");
		sb.append("\trvactNo: ");
		sb.append(rvactNo==null?"null":getRvactNo());
		sb.append("\n");
		sb.append("\tirRotCycd: ");
		sb.append(irRotCycd==null?"null":getIrRotCycd());
		sb.append("\n");
		sb.append("\tfcfndInfwDscd: ");
		sb.append(fcfndInfwDscd==null?"null":getFcfndInfwDscd());
		sb.append("\n");
		sb.append("\tfcDpsAccDscd: ");
		sb.append(fcDpsAccDscd==null?"null":getFcDpsAccDscd());
		sb.append("\n");
		sb.append("\tfornXchStttCrtcSbmtDis: ");
		sb.append(fornXchStttCrtcSbmtDis==null?"null":getFornXchStttCrtcSbmtDis());
		sb.append("\n");
		sb.append("\tfxRapRncd: ");
		sb.append(fxRapRncd==null?"null":getFxRapRncd());
		sb.append("\n");
		sb.append("\tpayRncdCfcd: ");
		sb.append(payRncdCfcd==null?"null":getPayRncdCfcd());
		sb.append("\n");
		sb.append("\thsCd: ");
		sb.append(hsCd==null?"null":getHsCd());
		sb.append("\n");
		sb.append("\tivpeId: ");
		sb.append(ivpeId==null?"null":getIvpeId());
		sb.append("\n");
		sb.append("\tsecrComNm: ");
		sb.append(secrComNm==null?"null":getSecrComNm());
		sb.append("\n");
		sb.append("\tfcApvCd: ");
		sb.append(fcApvCd==null?"null":getFcApvCd());
		sb.append("\n");
		sb.append("\tpnsnAcldCtrYcnt: ");
		sb.append(pnsnAcldCtrYcnt==null?"null":getPnsnAcldCtrYcnt());
		sb.append("\n");
		sb.append("\tpnsnAcldCtrMcn: ");
		sb.append(pnsnAcldCtrMcn==null?"null":getPnsnAcldCtrMcn());
		sb.append("\n");
		sb.append("\tpnsnRcveBgnDt: ");
		sb.append(pnsnRcveBgnDt==null?"null":getPnsnRcveBgnDt());
		sb.append("\n");
		sb.append("\tprftRtRptdSndDscd: ");
		sb.append(prftRtRptdSndDscd==null?"null":getPrftRtRptdSndDscd());
		sb.append("\n");
		sb.append("\trprhLnkNewYn: ");
		sb.append(rprhLnkNewYn==null?"null":getRprhLnkNewYn());
		sb.append("\n");
		sb.append("\trprhLnkCancAcno: ");
		sb.append(rprhLnkCancAcno==null?"null":getRprhLnkCancAcno());
		sb.append("\n");
		sb.append("\trprhLnkTamNewYn: ");
		sb.append(rprhLnkTamNewYn==null?"null":getRprhLnkTamNewYn());
		sb.append("\n");
		sb.append("\tafepAddPidYn: ");
		sb.append(afepAddPidYn==null?"null":getAfepAddPidYn());
		sb.append("\n");
		sb.append("\tfndPdcd: ");
		sb.append(fndPdcd==null?"null":getFndPdcd());
		sb.append("\n");
		sb.append("\tfndScntRqdcNprtYn: ");
		sb.append(fndScntRqdcNprtYn==null?"null":getFndScntRqdcNprtYn());
		sb.append("\n");
		sb.append("\topgPtsNtcSndDscd: ");
		sb.append(opgPtsNtcSndDscd==null?"null":getOpgPtsNtcSndDscd());
		sb.append("\n");
		sb.append("\tgBnkgGoalPrftRtPsnb: ");
		sb.append(gBnkgGoalPrftRtPsnb==null?"null":getgBnkgGoalPrftRtPsnb());
		sb.append("\n");
		sb.append("\tgBnkgGoalPrftRtDcml: ");
		sb.append(gBnkgGoalPrftRtDcml==null?"null":getgBnkgGoalPrftRtDcml());
		sb.append("\n");
		sb.append("\tgBnkgAlwLossRtPsnb: ");
		sb.append(gBnkgAlwLossRtPsnb==null?"null":getgBnkgAlwLossRtPsnb());
		sb.append("\n");
		sb.append("\tgBnkgAlwLossRtDcml: ");
		sb.append(gBnkgAlwLossRtDcml==null?"null":getgBnkgAlwLossRtDcml());
		sb.append("\n");
		sb.append("\twooriOnwlMoAcno: ");
		sb.append(wooriOnwlMoAcno==null?"null":getWooriOnwlMoAcno());
		sb.append("\n");
		sb.append("\tbznUseActYn: ");
		sb.append(bznUseActYn==null?"null":getBznUseActYn());
		sb.append("\n");
		sb.append("\tagnpeItcsno: ");
		sb.append(agnpeItcsno==null?"null":getAgnpeItcsno());
		sb.append("\n");
		sb.append("\trppeItcsno: ");
		sb.append(rppeItcsno==null?"null":getRppeItcsno());
		sb.append("\n");
		sb.append("\tatsNaNtfcRqYn: ");
		sb.append(atsNaNtfcRqYn==null?"null":getAtsNaNtfcRqYn());
		sb.append("\n");
		sb.append("\tacldFndTsXprNtfcRqYn: ");
		sb.append(acldFndTsXprNtfcRqYn==null?"null":getAcldFndTsXprNtfcRqYn());
		sb.append("\n");
		sb.append("\tfwxcAcno: ");
		sb.append(fwxcAcno==null?"null":getFwxcAcno());
		sb.append("\n");
		sb.append("\tfndCnvrTmntAcno: ");
		sb.append(fndCnvrTmntAcno==null?"null":getFndCnvrTmntAcno());
		sb.append("\n");
		sb.append("\tdvdamRinvDscd: ");
		sb.append(dvdamRinvDscd==null?"null":getDvdamRinvDscd());
		sb.append("\n");
		sb.append("\tfndCnvrNewYn: ");
		sb.append(fndCnvrNewYn==null?"null":getFndCnvrNewYn());
		sb.append("\n");
		sb.append("\tlonXprAdvnYn: ");
		sb.append(lonXprAdvnYn==null?"null":getLonXprAdvnYn());
		sb.append("\n");
		sb.append("\tlnApvCmplYn: ");
		sb.append(lnApvCmplYn==null?"null":getLnApvCmplYn());
		sb.append("\n");
		sb.append("\tpriPrpeBrNm: ");
		sb.append(priPrpeBrNm==null?"null":getPriPrpeBrNm());
		sb.append("\n");
		sb.append("\tgrnTrno: ");
		sb.append(grnTrno==null?"null":getGrnTrno());
		sb.append("\n");
		sb.append("\tescrUnmrNo: ");
		sb.append(escrUnmrNo==null?"null":getEscrUnmrNo());
		sb.append("\n");
		sb.append("\tpriPrpeAcno: ");
		sb.append(priPrpeAcno==null?"null":getPriPrpeAcno());
		sb.append("\n");
		sb.append("\tprpeAcno: ");
		sb.append(prpeAcno==null?"null":getPrpeAcno());
		sb.append("\n");
		sb.append("\tpriPrpeBzpeNo: ");
		sb.append(priPrpeBzpeNo==null?"null":getPriPrpeBzpeNo());
		sb.append("\n");
		sb.append("\tprpeBzpeNo: ");
		sb.append(prpeBzpeNo==null?"null":getPrpeBzpeNo());
		sb.append("\n");
		sb.append("\tppmtAmRcveAcno: ");
		sb.append(ppmtAmRcveAcno==null?"null":getPpmtAmRcveAcno());
		sb.append("\n");
		sb.append("\torcpPrpeCsno: ");
		sb.append(orcpPrpeCsno==null?"null":getOrcpPrpeCsno());
		sb.append("\n");
		sb.append("\tpftPrpeCsno: ");
		sb.append(pftPrpeCsno==null?"null":getPftPrpeCsno());
		sb.append("\n");
		sb.append("\torcpPrpeNrsrCollYn: ");
		sb.append(orcpPrpeNrsrCollYn==null?"null":getOrcpPrpeNrsrCollYn());
		sb.append("\n");
		sb.append("\tpftPrpeNrsrCollYn: ");
		sb.append(pftPrpeNrsrCollYn==null?"null":getPftPrpeNrsrCollYn());
		sb.append("\n");
		sb.append("\tpocpPfeAm: ");
		sb.append(pocpPfeAm==null?"null":getPocpPfeAm());
		sb.append("\n");
		sb.append("\tetfTprt: ");
		sb.append(etfTprt==null?"null":getEtfTprt());
		sb.append("\n");
		sb.append("\topgOrdsTxt: ");
		sb.append(opgOrdsTxt==null?"null":getOpgOrdsTxt());
		sb.append("\n");
		sb.append("\tsa1Txt: ");
		sb.append(sa1Txt==null?"null":getSa1Txt());
		sb.append("\n");
		sb.append("\tsa2Txt: ");
		sb.append(sa2Txt==null?"null":getSa2Txt());
		sb.append("\n");
		sb.append("\tsa3Txt: ");
		sb.append(sa3Txt==null?"null":getSa3Txt());
		sb.append("\n");
		sb.append("\tsptxYn: ");
		sb.append(sptxYn==null?"null":getSptxYn());
		sb.append("\n");
		sb.append("\tnnmCsno: ");
		sb.append(nnmCsno==null?"null":getNnmCsno());
		sb.append("\n");
		sb.append("\tfndItmsCd: ");
		sb.append(fndItmsCd==null?"null":getFndItmsCd());
		sb.append("\n");
		sb.append("\tdpsRcvAm: ");
		sb.append(dpsRcvAm==null?"null":getDpsRcvAm());
		sb.append("\n");
		sb.append("\ttrfAm: ");
		sb.append(trfAm==null?"null":getTrfAm());
		sb.append("\n");
		sb.append("\tbchkAm: ");
		sb.append(bchkAm==null?"null":getBchkAm());
		sb.append("\n");
		sb.append("\tbchkInqmAm: ");
		sb.append(bchkInqmAm==null?"null":getBchkInqmAm());
		sb.append("\n");
		sb.append("\tinqmScnt: ");
		sb.append(inqmScnt==null?"null":getInqmScnt());
		sb.append("\n");
		sb.append("\tinqmFeeXmpDis: ");
		sb.append(inqmFeeXmpDis==null?"null":getInqmFeeXmpDis());
		sb.append("\n");
		sb.append("\ttamTrfYn: ");
		sb.append(tamTrfYn==null?"null":getTamTrfYn());
		sb.append("\n");
		sb.append("\tpxrt: ");
		sb.append(pxrt==null?"null":getPxrt());
		sb.append("\n");
		sb.append("\tkrwTrfAm: ");
		sb.append(krwTrfAm==null?"null":getKrwTrfAm());
		sb.append("\n");
		sb.append("\tcucd: ");
		sb.append(cucd==null?"null":getCucd());
		sb.append("\n");
		sb.append("\tioffSbDscd: ");
		sb.append(ioffSbDscd==null?"null":getIoffSbDscd());
		sb.append("\n");
		sb.append("\tcshtfDscd: ");
		sb.append(cshtfDscd==null?"null":getCshtfDscd());
		sb.append("\n");
		sb.append("\tcshFeeLevyDscd: ");
		sb.append(cshFeeLevyDscd==null?"null":getCshFeeLevyDscd());
		sb.append("\n");
		sb.append("\tcshFee: ");
		sb.append(cshFee==null?"null":getCshFee());
		sb.append("\n");
		sb.append("\ttgtKrwAm: ");
		sb.append(tgtKrwAm==null?"null":getTgtKrwAm());
		sb.append("\n");
		sb.append("\tfcTrfAm: ");
		sb.append(fcTrfAm==null?"null":getFcTrfAm());
		sb.append("\n");
		sb.append("\tfcCshRcvAm: ");
		sb.append(fcCshRcvAm==null?"null":getFcCshRcvAm());
		sb.append("\n");
		sb.append("\tcoinAm: ");
		sb.append(coinAm==null?"null":getCoinAm());
		sb.append("\n");
		sb.append("\tkrfd: ");
		sb.append(krfd==null?"null":getKrfd());
		sb.append("\n");
		sb.append("\tapxrt: ");
		sb.append(apxrt==null?"null":getApxrt());
		sb.append("\n");
		sb.append("\tcusPrmeXrt: ");
		sb.append(cusPrmeXrt==null?"null":getCusPrmeXrt());
		sb.append("\n");
		sb.append("\tioffSbRt: ");
		sb.append(ioffSbRt==null?"null":getIoffSbRt());
		sb.append("\n");
		sb.append("\tfwxcCtrMcnt: ");
		sb.append(fwxcCtrMcnt==null?"null":getFwxcCtrMcnt());
		sb.append("\n");
		sb.append("\tnewAcno: ");
		sb.append(newAcno==null?"null":getNewAcno());
		sb.append("\n");
		sb.append("\tksdFndNo: ");
		sb.append(ksdFndNo==null?"null":getKsdFndNo());
		sb.append("\n");
		sb.append("\trtpenTrnDisNo: ");
		sb.append(rtpenTrnDisNo==null?"null":getRtpenTrnDisNo());
		sb.append("\n");
		sb.append("\trcmGoalAm: ");
		sb.append(rcmGoalAm==null?"null":getRcmGoalAm());
		sb.append("\n");
		sb.append("\tjnngCtgrCd: ");
		sb.append(jnngCtgrCd==null?"null":getJnngCtgrCd());
		sb.append("\n");
		sb.append("\trcpMdKdcd: ");
		sb.append(rcpMdKdcd==null?"null":getRcpMdKdcd());
		sb.append("\n");
		sb.append("\thsscMajTxtPbokPrngYn: ");
		sb.append(hsscMajTxtPbokPrngYn==null?"null":getHsscMajTxtPbokPrngYn());
		sb.append("\n");
		sb.append("\tprdDesOupYn: ");
		sb.append(prdDesOupYn==null?"null":getPrdDesOupYn());
		sb.append("\n");
		sb.append("\tacicJnngYn: ");
		sb.append(acicJnngYn==null?"null":getAcicJnngYn());
		sb.append("\n");
		sb.append("\thsscNewDscd: ");
		sb.append(hsscNewDscd==null?"null":getHsscNewDscd());
		sb.append("\n");
		sb.append("\thsscRgslZpno: ");
		sb.append(hsscRgslZpno==null?"null":getHsscRgslZpno());
		sb.append("\n");
		sb.append("\thsscInddRgsYn: ");
		sb.append(hsscInddRgsYn==null?"null":getHsscInddRgsYn());
		sb.append("\n");
		sb.append("\thsscHopeRgnZpno: ");
		sb.append(hsscHopeRgnZpno==null?"null":getHsscHopeRgnZpno());
		sb.append("\n");
		sb.append("\thopeHousKdDscd: ");
		sb.append(hopeHousKdDscd==null?"null":getHopeHousKdDscd());
		sb.append("\n");
		sb.append("\thousXuseSqmDscd: ");
		sb.append(housXuseSqmDscd==null?"null":getHousXuseSqmDscd());
		sb.append("\n");
		sb.append("\thopeMovinYm: ");
		sb.append(hopeMovinYm==null?"null":getHopeMovinYm());
		sb.append("\n");
		sb.append("\tesnsNewRgsDt: ");
		sb.append(esnsNewRgsDt==null?"null":getEsnsNewRgsDt());
		sb.append("\n");
		sb.append("\tesnsNewRgsTm: ");
		sb.append(esnsNewRgsTm==null?"null":getEsnsNewRgsTm());
		sb.append("\n");
		sb.append("\tesnsNewEbnkUtzpeNo: ");
		sb.append(esnsNewEbnkUtzpeNo==null?"null":getEsnsNewEbnkUtzpeNo());
		sb.append("\n");
		sb.append("\tatsKdcd: ");
		sb.append(atsKdcd==null?"null":getAtsKdcd());
		sb.append("\n");
		sb.append("\tlnoActOpngRncd: ");
		sb.append(lnoActOpngRncd==null?"null":getLnoActOpngRncd());
		sb.append("\n");
		sb.append("\tscanInfAcnmCnfDscd: ");
		sb.append(scanInfAcnmCnfDscd==null?"null":getScanInfAcnmCnfDscd());
		sb.append("\n");
		sb.append("\tagnpeTrnYn: ");
		sb.append(agnpeTrnYn==null?"null":getAgnpeTrnYn());
		sb.append("\n");
		sb.append("\tdpsPwnoRgsDscd: ");
		sb.append(dpsPwnoRgsDscd==null?"null":getDpsPwnoRgsDscd());
		sb.append("\n");
		sb.append("\tprrRgsPwnoKeyCnf: ");
		sb.append(prrRgsPwnoKeyCnf==null?"null":getPrrRgsPwnoKeyCnf());
		sb.append("\n");
		sb.append("\tencyActPwnoCnf: ");
		sb.append(encyActPwnoCnf==null?"null":getEncyActPwnoCnf());
		sb.append("\n");
		sb.append("\twdcPbokYn: ");
		sb.append(wdcPbokYn==null?"null":getWdcPbokYn());
		sb.append("\n");
		sb.append("\twooriLovPlsDntnAscnDscd: ");
		sb.append(wooriLovPlsDntnAscnDscd==null?"null":getWooriLovPlsDntnAscnDscd());
		sb.append("\n");
		sb.append("\tsameRqdcSrno: ");
		sb.append(sameRqdcSrno==null?"null":getSameRqdcSrno());
		sb.append("\n");
		sb.append("\tetcDeedDscd: ");
		sb.append(etcDeedDscd==null?"null":getEtcDeedDscd());
		sb.append("\n");
		sb.append("\tactApvNo: ");
		sb.append(actApvNo==null?"null":getActApvNo());
		sb.append("\n");
		sb.append("\tfndRblnNewYn: ");
		sb.append(fndRblnNewYn==null?"null":getFndRblnNewYn());
		sb.append("\n");
		sb.append("\tbgnnRcvWdrYn: ");
		sb.append(bgnnRcvWdrYn==null?"null":getBgnnRcvWdrYn());
		sb.append("\n");
		sb.append("\tcopItcsno: ");
		sb.append(copItcsno==null?"null":getCopItcsno());
		sb.append("\n");
		sb.append("\tinbkNewYn: ");
		sb.append(inbkNewYn==null?"null":getInbkNewYn());
		sb.append("\n");
		sb.append("\tsmrtBnkgNewYn: ");
		sb.append(smrtBnkgNewYn==null?"null":getSmrtBnkgNewYn());
		sb.append("\n");
		sb.append("\ttlbnkNewYn: ");
		sb.append(tlbnkNewYn==null?"null":getTlbnkNewYn());
		sb.append("\n");
		sb.append("\tntsvcRgsYn: ");
		sb.append(ntsvcRgsYn==null?"null":getNtsvcRgsYn());
		sb.append("\n");
		sb.append("\tinbkWdrActRgsYn: ");
		sb.append(inbkWdrActRgsYn==null?"null":getInbkWdrActRgsYn());
		sb.append("\n");
		sb.append("\tinetBnkgUserId: ");
		sb.append(inetBnkgUserId==null?"null":getInetBnkgUserId());
		sb.append("\n");
		sb.append("\tebnkPwno: ");
		sb.append(ebnkPwno==null?"null":getEbnkPwno());
		sb.append("\n");
		sb.append("\tengNm: ");
		sb.append(engNm==null?"null":getEngNm());
		sb.append("\n");
		sb.append("\ttms1TsLmtAm: ");
		sb.append(tms1TsLmtAm==null?"null":getTms1TsLmtAm());
		sb.append("\n");
		sb.append("\td1TsLmtAm: ");
		sb.append(d1TsLmtAm==null?"null":getD1TsLmtAm());
		sb.append("\n");
		sb.append("\tsecrdSrno: ");
		sb.append(secrdSrno==null?"null":getSecrdSrno());
		sb.append("\n");
		sb.append("\totpcSrno: ");
		sb.append(otpcSrno==null?"null":getOtpcSrno());
		sb.append("\n");
		sb.append("\totpPwd: ");
		sb.append(otpPwd==null?"null":getOtpPwd());
		sb.append("\n");
		sb.append("\totpIsuCostXmpDscd: ");
		sb.append(otpIsuCostXmpDscd==null?"null":getOtpIsuCostXmpDscd());
		sb.append("\n");
		sb.append("\tdatDpsTelNo: ");
		sb.append(datDpsTelNo==null?"null":getDatDpsTelNo());
		sb.append("\n");
		sb.append("\tsynpbDscd: ");
		sb.append(synpbDscd==null?"null":getSynpbDscd());
		sb.append("\n");
		sb.append("\tinetBnkgRcpSrno: ");
		sb.append(inetBnkgRcpSrno==null?"null":getInetBnkgRcpSrno());
		sb.append("\n");
		sb.append("\tinbkRsvRgbrCd: ");
		sb.append(inbkRsvRgbrCd==null?"null":getInbkRsvRgbrCd());
		sb.append("\n");
		sb.append("\tinbkRsvRgsDt: ");
		sb.append(inbkRsvRgsDt==null?"null":getInbkRsvRgsDt());
		sb.append("\n");
		sb.append("\tinbkRsvRgsSrno: ");
		sb.append(inbkRsvRgsSrno==null?"null":getInbkRsvRgsSrno());
		sb.append("\n");
		sb.append("\tsmrtBnkgInetBnkgId: ");
		sb.append(smrtBnkgInetBnkgId==null?"null":getSmrtBnkgInetBnkgId());
		sb.append("\n");
		sb.append("\tsmrtBnkgHpComCd: ");
		sb.append(smrtBnkgHpComCd==null?"null":getSmrtBnkgHpComCd());
		sb.append("\n");
		sb.append("\tsmrtBnkgHpTlenNo: ");
		sb.append(smrtBnkgHpTlenNo==null?"null":getSmrtBnkgHpTlenNo());
		sb.append("\n");
		sb.append("\tsmrtBnkgHpSrno: ");
		sb.append(smrtBnkgHpSrno==null?"null":getSmrtBnkgHpSrno());
		sb.append("\n");
		sb.append("\ttlbnkSecrdSrno: ");
		sb.append(tlbnkSecrdSrno==null?"null":getTlbnkSecrdSrno());
		sb.append("\n");
		sb.append("\tencyEbnkPwno: ");
		sb.append(encyEbnkPwno==null?"null":getEncyEbnkPwno());
		sb.append("\n");
		sb.append("\ttlbnkD1TsLmt: ");
		sb.append(tlbnkD1TsLmt==null?"null":getTlbnkD1TsLmt());
		sb.append("\n");
		sb.append("\ttlbnkTms1TsLmt: ");
		sb.append(tlbnkTms1TsLmt==null?"null":getTlbnkTms1TsLmt());
		sb.append("\n");
		sb.append("\tntsvcRawDscd: ");
		sb.append(ntsvcRawDscd==null?"null":getNtsvcRawDscd());
		sb.append("\n");
		sb.append("\tntsvcBalNtyMarkYn: ");
		sb.append(ntsvcBalNtyMarkYn==null?"null":getNtsvcBalNtyMarkYn());
		sb.append("\n");
		sb.append("\tntsvcHpComCd: ");
		sb.append(ntsvcHpComCd==null?"null":getNtsvcHpComCd());
		sb.append("\n");
		sb.append("\tntsvcHpTlenNo: ");
		sb.append(ntsvcHpTlenNo==null?"null":getNtsvcHpTlenNo());
		sb.append("\n");
		sb.append("\tntsvcHpSrno: ");
		sb.append(ntsvcHpSrno==null?"null":getNtsvcHpSrno());
		sb.append("\n");
		sb.append("\tntsvcInotAm: ");
		sb.append(ntsvcInotAm==null?"null":getNtsvcInotAm());
		sb.append("\n");
		sb.append("\tastPrtsNtcYn: ");
		sb.append(astPrtsNtcYn==null?"null":getAstPrtsNtcYn());
		sb.append("\n");
		sb.append("\tntsvcTmsStaTim: ");
		sb.append(ntsvcTmsStaTim==null?"null":getNtsvcTmsStaTim());
		sb.append("\n");
		sb.append("\tntsvcTmsEndTim: ");
		sb.append(ntsvcTmsEndTim==null?"null":getNtsvcTmsEndTim());
		sb.append("\n");
		sb.append("\twdrActRgsInetBnkgId: ");
		sb.append(wdrActRgsInetBnkgId==null?"null":getWdrActRgsInetBnkgId());
		sb.append("\n");
		sb.append("\tebnkWdrActCnccRgsYn: ");
		sb.append(ebnkWdrActCnccRgsYn==null?"null":getEbnkWdrActCnccRgsYn());
		sb.append("\n");
		sb.append("\ttlbnkWdrActCnccRgsYn: ");
		sb.append(tlbnkWdrActCnccRgsYn==null?"null":getTlbnkWdrActCnccRgsYn());
		sb.append("\n");
		sb.append("\thswfPbokDocSndYn: ");
		sb.append(hswfPbokDocSndYn==null?"null":getHswfPbokDocSndYn());
		sb.append("\n");
		sb.append("\tfaOwacCsno: ");
		sb.append(faOwacCsno==null?"null":getFaOwacCsno());
		sb.append("\n");
		sb.append("\tflieRgsYn: ");
		sb.append(flieRgsYn==null?"null":getFlieRgsYn());
		sb.append("\n");
		sb.append("\tatsYn: ");
		sb.append(atsYn==null?"null":getAtsYn());
		sb.append("\n");
		sb.append("\thmnyUsgAm: ");
		sb.append(hmnyUsgAm==null?"null":getHmnyUsgAm());
		sb.append("\n");
		sb.append("\tetcAcno: ");
		sb.append(etcAcno==null?"null":getEtcAcno());
		sb.append("\n");
		sb.append("\ttrtpyRtPsnb: ");
		sb.append(trtpyRtPsnb==null?"null":getTrtpyRtPsnb());
		sb.append("\n");
		sb.append("\ttrtpyRtDcml: ");
		sb.append(trtpyRtDcml==null?"null":getTrtpyRtDcml());
		sb.append("\n");
		sb.append("\tfltIrNtcDscd: ");
		sb.append(fltIrNtcDscd==null?"null":getFltIrNtcDscd());
		sb.append("\n");
		sb.append("\tetpCoplsDpstNewYn: ");
		sb.append(etpCoplsDpstNewYn==null?"null":getEtpCoplsDpstNewYn());
		sb.append("\n");
		sb.append("\tatsXtYn: ");
		sb.append(atsXtYn==null?"null":getAtsXtYn());
		sb.append("\n");
		sb.append("\tspslPdcd: ");
		sb.append(spslPdcd==null?"null":getSpslPdcd());
		sb.append("\n");
		sb.append("\ttrtPocpPfeRtPsnb: ");
		sb.append(trtPocpPfeRtPsnb==null?"null":getTrtPocpPfeRtPsnb());
		sb.append("\n");
		sb.append("\ttrtPocpPfeRtDcml: ");
		sb.append(trtPocpPfeRtDcml==null?"null":getTrtPocpPfeRtDcml());
		sb.append("\n");
		sb.append("\ttrtDfanPfeRtPsnb: ");
		sb.append(trtDfanPfeRtPsnb==null?"null":getTrtDfanPfeRtPsnb());
		sb.append("\n");
		sb.append("\ttrtDfanPfeRtDcml: ");
		sb.append(trtDfanPfeRtDcml==null?"null":getTrtDfanPfeRtDcml());
		sb.append("\n");
		sb.append("\tcponInpDscd: ");
		sb.append(cponInpDscd==null?"null":getCponInpDscd());
		sb.append("\n");
		sb.append("\tagmIrtPsnb: ");
		sb.append(agmIrtPsnb==null?"null":getAgmIrtPsnb());
		sb.append("\n");
		sb.append("\tagmIrtDcml: ");
		sb.append(agmIrtDcml==null?"null":getAgmIrtDcml());
		sb.append("\n");
		sb.append("\tpbokOtln: ");
		sb.append(pbokOtln==null?"null":getPbokOtln());
		sb.append("\n");
		sb.append("\tascnBlgCd: ");
		sb.append(ascnBlgCd==null?"null":getAscnBlgCd());
		sb.append("\n");
		sb.append("\tacldCrtdSndDscd: ");
		sb.append(acldCrtdSndDscd==null?"null":getAcldCrtdSndDscd());
		sb.append("\n");
		sb.append("\tisaMajSbjPbokPrngYn: ");
		sb.append(isaMajSbjPbokPrngYn==null?"null":getIsaMajSbjPbokPrngYn());
		sb.append("\n");
		sb.append("\tisaNewDscd: ");
		sb.append(isaNewDscd==null?"null":getIsaNewDscd());
		sb.append("\n");
		sb.append("\tisaJnngDscd: ");
		sb.append(isaJnngDscd==null?"null":getIsaJnngDscd());
		sb.append("\n");
		sb.append("\tjnngAdvpeEno: ");
		sb.append(jnngAdvpeEno==null?"null":getJnngAdvpeEno());
		sb.append("\n");
		sb.append("\textxDscd: ");
		sb.append(extxDscd==null?"null":getExtxDscd());
		sb.append("\n");
		sb.append("\tdtjnTemDscd: ");
		sb.append(dtjnTemDscd==null?"null":getDtjnTemDscd());
		sb.append("\n");
		sb.append("\tmndDocCollYn: ");
		sb.append(mndDocCollYn==null?"null":getMndDocCollYn());
		sb.append("\n");
		sb.append("\tenmtDt: ");
		sb.append(enmtDt==null?"null":getEnmtDt());
		sb.append("\n");
		sb.append("\tdshgDt: ");
		sb.append(dshgDt==null?"null":getDshgDt());
		sb.append("\n");
		sb.append("\tctrmvIscd: ");
		sb.append(ctrmvIscd==null?"null":getCtrmvIscd());
		sb.append("\n");
		sb.append("\trtrtInsuCnvrAm: ");
		sb.append(rtrtInsuCnvrAm==null?"null":getRtrtInsuCnvrAm());
		sb.append("\n");
		sb.append("\taldJnpeTycd: ");
		sb.append(aldJnpeTycd==null?"null":getAldJnpeTycd());
		sb.append("\n");
		sb.append("\tfstJnngDt: ");
		sb.append(fstJnngDt==null?"null":getFstJnngDt());
		sb.append("\n");
		sb.append("\ttfrAcno: ");
		sb.append(tfrAcno==null?"null":getTfrAcno());
		sb.append("\n");
		sb.append("\tplanNo: ");
		sb.append(planNo==null?"null":getPlanNo());
		sb.append("\n");
		sb.append("\tbrdmKdcd: ");
		sb.append(brdmKdcd==null?"null":getBrdmKdcd());
		sb.append("\n");
		sb.append("\tscdOrdsMngNo: ");
		sb.append(scdOrdsMngNo==null?"null":getScdOrdsMngNo());
		sb.append("\n");
		sb.append("\trtpenCobdnAm: ");
		sb.append(rtpenCobdnAm==null?"null":getRtpenCobdnAm());
		sb.append("\n");
		sb.append("\trtpenPbdnAm: ");
		sb.append(rtpenPbdnAm==null?"null":getRtpenPbdnAm());
		sb.append("\n");
		sb.append("\topgMngFee: ");
		sb.append(opgMngFee==null?"null":getOpgMngFee());
		sb.append("\n");
		sb.append("\tasetMngFee: ");
		sb.append(asetMngFee==null?"null":getAsetMngFee());
		sb.append("\n");
		sb.append("\tstlAcno: ");
		sb.append(stlAcno==null?"null":getStlAcno());
		sb.append("\n");
		sb.append("\tencyStlActPwno: ");
		sb.append(encyStlActPwno==null?"null":getEncyStlActPwno());
		sb.append("\n");
		sb.append("\tafepAddPidDscd: ");
		sb.append(afepAddPidDscd==null?"null":getAfepAddPidDscd());
		sb.append("\n");
		sb.append("\trprhLnkNewDscd: ");
		sb.append(rprhLnkNewDscd==null?"null":getRprhLnkNewDscd());
		sb.append("\n");
		sb.append("\tcancRsvFndAcno: ");
		sb.append(cancRsvFndAcno==null?"null":getCancRsvFndAcno());
		sb.append("\n");
		sb.append("\trprhAmTamNewDscd: ");
		sb.append(rprhAmTamNewDscd==null?"null":getRprhAmTamNewDscd());
		sb.append("\n");
		sb.append("\txcoPrmeIrt: ");
		sb.append(xcoPrmeIrt==null?"null":getXcoPrmeIrt());
		sb.append("\n");
		sb.append("\tfndGoalPrftRtPsnb: ");
		sb.append(fndGoalPrftRtPsnb==null?"null":getFndGoalPrftRtPsnb());
		sb.append("\n");
		sb.append("\tfndGoalPrftRtDcml: ");
		sb.append(fndGoalPrftRtDcml==null?"null":getFndGoalPrftRtDcml());
		sb.append("\n");
		sb.append("\tsrvcRqAm: ");
		sb.append(srvcRqAm==null?"null":getSrvcRqAm());
		sb.append("\n");
		sb.append("\tfndAcblNtcDis: ");
		sb.append(fndAcblNtcDis==null?"null":getFndAcblNtcDis());
		sb.append("\n");
		sb.append("\tfndAcblNtfcBasDd: ");
		sb.append(fndAcblNtfcBasDd==null?"null":getFndAcblNtfcBasDd());
		sb.append("\n");
		sb.append("\tfndPrftRtSmsChrRqDscd: ");
		sb.append(fndPrftRtSmsChrRqDscd==null?"null":getFndPrftRtSmsChrRqDscd());
		sb.append("\n");
		sb.append("\tfndSmsRqTprtPsnb: ");
		sb.append(fndSmsRqTprtPsnb==null?"null":getFndSmsRqTprtPsnb());
		sb.append("\n");
		sb.append("\tfndSmsRqTprtDcml: ");
		sb.append(fndSmsRqTprtDcml==null?"null":getFndSmsRqTprtDcml());
		sb.append("\n");
		sb.append("\tfndSmsRqTprtDscd: ");
		sb.append(fndSmsRqTprtDscd==null?"null":getFndSmsRqTprtDscd());
		sb.append("\n");
		sb.append("\tfndSmsRqLossAwrtPsnb: ");
		sb.append(fndSmsRqLossAwrtPsnb==null?"null":getFndSmsRqLossAwrtPsnb());
		sb.append("\n");
		sb.append("\tfndSmsRqLossAwrtDcml: ");
		sb.append(fndSmsRqLossAwrtDcml==null?"null":getFndSmsRqLossAwrtDcml());
		sb.append("\n");
		sb.append("\tfndSmsRqLossAwrtDscd: ");
		sb.append(fndSmsRqLossAwrtDscd==null?"null":getFndSmsRqLossAwrtDscd());
		sb.append("\n");
		sb.append("\tfndFpPrftRtSmsChrRqDscd: ");
		sb.append(fndFpPrftRtSmsChrRqDscd==null?"null":getFndFpPrftRtSmsChrRqDscd());
		sb.append("\n");
		sb.append("\tfndFpPrftRtSmsChrRqDtDscd: ");
		sb.append(fndFpPrftRtSmsChrRqDtDscd==null?"null":getFndFpPrftRtSmsChrRqDtDscd());
		sb.append("\n");
		sb.append("\tscntRqdcPrngOmitYn: ");
		sb.append(scntRqdcPrngOmitYn==null?"null":getScntRqdcPrngOmitYn());
		sb.append("\n");
		sb.append("\toldAtrbChckHisSrno: ");
		sb.append(oldAtrbChckHisSrno==null?"null":getOldAtrbChckHisSrno());
		sb.append("\n");
		sb.append("\tnewVstrMngNo: ");
		sb.append(newVstrMngNo==null?"null":getNewVstrMngNo());
		sb.append("\n");
		sb.append("\tpayVstrMngNo: ");
		sb.append(payVstrMngNo==null?"null":getPayVstrMngNo());
		sb.append("\n");
		sb.append("\tspotTfrRtpenPrdNo: ");
		sb.append(spotTfrRtpenPrdNo==null?"null":getSpotTfrRtpenPrdNo());
		sb.append("\n");
		sb.append("\trtttIscd: ");
		sb.append(rtttIscd==null?"null":getRtttIscd());
		sb.append("\n");
		sb.append("\tspotTfrRtpenPlanDscd: ");
		sb.append(spotTfrRtpenPlanDscd==null?"null":getSpotTfrRtpenPlanDscd());
		sb.append("\n");
		sb.append("\tintRcvFcAcno: ");
		sb.append(intRcvFcAcno==null?"null":getIntRcvFcAcno());
		sb.append("\n");
		sb.append("\tpbdeedPrngYn: ");
		sb.append(pbdeedPrngYn==null?"null":getPbdeedPrngYn());
		sb.append("\n");
		sb.append("\tdgnXrtPsnb: ");
		sb.append(dgnXrtPsnb==null?"null":getDgnXrtPsnb());
		sb.append("\n");
		sb.append("\tdgnXrtDcml: ");
		sb.append(dgnXrtDcml==null?"null":getDgnXrtDcml());
		sb.append("\n");
		sb.append("\tmkshMbhYn: ");
		sb.append(mkshMbhYn==null?"null":getMkshMbhYn());
		sb.append("\n");
		sb.append("\tasstmPbokDscd: ");
		sb.append(asstmPbokDscd==null?"null":getAsstmPbokDscd());
		sb.append("\n");
		sb.append("\twbbtJnngHpNo: ");
		sb.append(wbbtJnngHpNo==null?"null":getWbbtJnngHpNo());
		sb.append("\n");
		sb.append("\tprdOpgDscd: ");
		sb.append(prdOpgDscd==null?"null":getPrdOpgDscd());
		sb.append("\n");
		sb.append("\tnewInqYn: ");
		sb.append(newInqYn==null?"null":getNewInqYn());
		sb.append("\n");
		sb.append("\tpwnoNuseYn: ");
		sb.append(pwnoNuseYn==null?"null":getPwnoNuseYn());
		sb.append("\n");
		sb.append("\tbchrInqTim: ");
		sb.append(bchrInqTim==null?"null":getBchrInqTim());
		sb.append("\n");
		sb.append("\tbchrNewAvlYn: ");
		sb.append(bchrNewAvlYn==null?"null":getBchrNewAvlYn());
		sb.append("\n");
		sb.append("\tprdMajTxtPbokPrngYn: ");
		sb.append(prdMajTxtPbokPrngYn==null?"null":getPrdMajTxtPbokPrngYn());
		sb.append("\n");
		sb.append("\tapirtPsnb: ");
		sb.append(apirtPsnb==null?"null":getApirtPsnb());
		sb.append("\n");
		sb.append("\tapirtDcml: ");
		sb.append(apirtDcml==null?"null":getApirtDcml());
		sb.append("\n");
		sb.append("\thqapNo: ");
		sb.append(hqapNo==null?"null":getHqapNo());
		sb.append("\n");
		sb.append("\tacnmCsno: ");
		sb.append(acnmCsno==null?"null":getAcnmCsno());
		sb.append("\n");
		sb.append("\tfcbdNewYn: ");
		sb.append(fcbdNewYn==null?"null":getFcbdNewYn());
		sb.append("\n");
		sb.append("\tirKdcd: ");
		sb.append(irKdcd==null?"null":getIrKdcd());
		sb.append("\n");
		sb.append("\tefctPrftRtPsnb: ");
		sb.append(efctPrftRtPsnb==null?"null":getEfctPrftRtPsnb());
		sb.append("\n");
		sb.append("\tefctPrftRtDcml: ");
		sb.append(efctPrftRtDcml==null?"null":getEfctPrftRtDcml());
		sb.append("\n");
		sb.append("\tvrBilNewDscd: ");
		sb.append(vrBilNewDscd==null?"null":getVrBilNewDscd());
		sb.append("\n");
		sb.append("\tistIvpeBatNewTrnDscd: ");
		sb.append(istIvpeBatNewTrnDscd==null?"null":getIstIvpeBatNewTrnDscd());
		sb.append("\n");
		sb.append("\tdppeCsno: ");
		sb.append(dppeCsno==null?"null":getDppeCsno());
		sb.append("\n");
		sb.append("\tdppeActIdfNo: ");
		sb.append(dppeActIdfNo==null?"null":getDppeActIdfNo());
		sb.append("\n");
		sb.append("\tdpsBatNewBzcd: ");
		sb.append(dpsBatNewBzcd==null?"null":getDpsBatNewBzcd());
		sb.append("\n");
		sb.append("\tascnNewRprsAcno: ");
		sb.append(ascnNewRprsAcno==null?"null":getAscnNewRprsAcno());
		sb.append("\n");
		sb.append("\tascnNewRprsActYn: ");
		sb.append(ascnNewRprsActYn==null?"null":getAscnNewRprsActYn());
		sb.append("\n");
		sb.append("\tpbamActAcctYy: ");
		sb.append(pbamActAcctYy==null?"null":getPbamActAcctYy());
		sb.append("\n");
		sb.append("\tpmnySnnmActAcctYy: ");
		sb.append(pmnySnnmActAcctYy==null?"null":getPmnySnnmActAcctYy());
		sb.append("\n");
		sb.append("\thsscOwhmAdrKdcd: ");
		sb.append(hsscOwhmAdrKdcd==null?"null":getHsscOwhmAdrKdcd());
		sb.append("\n");
		sb.append("\thsscOwhmBldMngNo: ");
		sb.append(hsscOwhmBldMngNo==null?"null":getHsscOwhmBldMngNo());
		sb.append("\n");
		sb.append("\thsscOwhmPostSrno: ");
		sb.append(hsscOwhmPostSrno==null?"null":getHsscOwhmPostSrno());
		sb.append("\n");
		sb.append("\thsscOwhmStdoNo: ");
		sb.append(hsscOwhmStdoNo==null?"null":getHsscOwhmStdoNo());
		sb.append("\n");
		sb.append("\tagmtCoCd: ");
		sb.append(agmtCoCd==null?"null":getAgmtCoCd());
		sb.append("\n");
		sb.append("\twooriHopeDremJnngTgtDscd: ");
		sb.append(wooriHopeDremJnngTgtDscd==null?"null":getWooriHopeDremJnngTgtDscd());
		sb.append("\n");
		sb.append("\tasetMngIscd: ");
		sb.append(asetMngIscd==null?"null":getAsetMngIscd());
		sb.append("\n");
		sb.append("\trpbdDscd: ");
		sb.append(rpbdDscd==null?"null":getRpbdDscd());
		sb.append("\n");
		sb.append("\tcctnAcno: ");
		sb.append(cctnAcno==null?"null":getCctnAcno());
		sb.append("\n");
		sb.append("\tnpbdSbsrRqYn: ");
		sb.append(npbdSbsrRqYn==null?"null":getNpbdSbsrRqYn());
		sb.append("\n");
		sb.append("\tnpbdItmsCd: ");
		sb.append(npbdItmsCd==null?"null":getNpbdItmsCd());
		sb.append("\n");
		sb.append("\tbndKdDis: ");
		sb.append(bndKdDis==null?"null":getBndKdDis());
		sb.append("\n");
		sb.append("\ttunMmHo: ");
		sb.append(tunMmHo==null?"null":getTunMmHo());
		sb.append("\n");
		sb.append("\thdgTgtYn: ");
		sb.append(hdgTgtYn==null?"null":getHdgTgtYn());
		sb.append("\n");
		sb.append("\tidCadNhssDscd: ");
		sb.append(idCadNhssDscd==null?"null":getIdCadNhssDscd());
		sb.append("\n");
		sb.append("\tfndPlsOpgDscd: ");
		sb.append(fndPlsOpgDscd==null?"null":getFndPlsOpgDscd());
		sb.append("\n");
		sb.append("\tgrnInsuKey: ");
		sb.append(grnInsuKey==null?"null":getGrnInsuKey());
		sb.append("\n");
		sb.append("\tpreIntRcvDscd: ");
		sb.append(preIntRcvDscd==null?"null":getPreIntRcvDscd());
		sb.append("\n");
		sb.append("\tpreIntRcvAcno: ");
		sb.append(preIntRcvAcno==null?"null":getPreIntRcvAcno());
		sb.append("\n");
		sb.append("\tdpsRcmNo: ");
		sb.append(dpsRcmNo==null?"null":getDpsRcmNo());
		sb.append("\n");
		sb.append("\tsldrAldCn: ");
		sb.append(sldrAldCn==null?"null":getSldrAldCn());
		sb.append("\n");
		sb.append("\tdlpmPbokGenRgsYn: ");
		sb.append(dlpmPbokGenRgsYn==null?"null":getDlpmPbokGenRgsYn());
		sb.append("\n");
		sb.append("\tsmrtMchrMdlInf: ");
		sb.append(smrtMchrMdlInf==null?"null":getSmrtMchrMdlInf());
		sb.append("\n");
		sb.append("\twibeeRcvRgsYn: ");
		sb.append(wibeeRcvRgsYn==null?"null":getWibeeRcvRgsYn());
		sb.append("\n");
		sb.append("\twibeeTsAcno: ");
		sb.append(wibeeTsAcno==null?"null":getWibeeTsAcno());
		sb.append("\n");
		sb.append("\twibeePushRgsYn: ");
		sb.append(wibeePushRgsYn==null?"null":getWibeePushRgsYn());
		sb.append("\n");
		sb.append("\tatsKrwTsAcno: ");
		sb.append(atsKrwTsAcno==null?"null":getAtsKrwTsAcno());
		sb.append("\n");
		sb.append("\tirngBrcd: ");
		sb.append(irngBrcd==null?"null":getIrngBrcd());
		sb.append("\n");
		sb.append("\tkrwFmbkFxpdYn: ");
		sb.append(krwFmbkFxpdYn==null?"null":getKrwFmbkFxpdYn());
		sb.append("\n");
		sb.append("\tkrwSscoFmbkFxpdYn: ");
		sb.append(krwSscoFmbkFxpdYn==null?"null":getKrwSscoFmbkFxpdYn());
		sb.append("\n");
		sb.append("\thopeHousXuseSqmDscd: ");
		sb.append(hopeHousXuseSqmDscd==null?"null":getHopeHousXuseSqmDscd());
		sb.append("\n");
		sb.append("\trrrgMvinDt: ");
		sb.append(rrrgMvinDt==null?"null":getRrrgMvinDt());
		sb.append("\n");
		sb.append("\tdppeUnqNo: ");
		sb.append(dppeUnqNo==null?"null":getDppeUnqNo());
		sb.append("\n");
		sb.append("\tdppeItmsNo: ");
		sb.append(dppeItmsNo==null?"null":getDppeItmsNo());
		sb.append("\n");
		sb.append("\tcshbAtsAcno: ");
		sb.append(cshbAtsAcno==null?"null":getCshbAtsAcno());
		sb.append("\n");
		sb.append("\tcusDntnAscnCd: ");
		sb.append(cusDntnAscnCd==null?"null":getCusDntnAscnCd());
		sb.append("\n");
		sb.append("\tcusBrdnCnrnRt: ");
		sb.append(cusBrdnCnrnRt==null?"null":getCusBrdnCnrnRt());
		sb.append("\n");
		sb.append("\tdinsvGoalAm: ");
		sb.append(dinsvGoalAm==null?"null":getDinsvGoalAm());
		sb.append("\n");
		sb.append("\ttxprInqYn: ");
		sb.append(txprInqYn==null?"null":getTxprInqYn());
		sb.append("\n");
		sb.append("\tfrno: ");
		sb.append(frno==null?"null":getFrno());
		sb.append("\n");
		sb.append("\tacnmRgsCd: ");
		sb.append(acnmRgsCd==null?"null":getAcnmRgsCd());
		sb.append("\n");
		sb.append("\tcoaOmitYn: ");
		sb.append(coaOmitYn==null?"null":getCoaOmitYn());
		sb.append("\n");
		sb.append("\twbbmLnkNewYn: ");
		sb.append(wbbmLnkNewYn==null?"null":getWbbmLnkNewYn());
		sb.append("\n");
		sb.append("\twbbtRcmRgsHpNo: ");
		sb.append(wbbtRcmRgsHpNo==null?"null":getWbbtRcmRgsHpNo());
		sb.append("\n");
		sb.append("\tsmrtLnJnngYn: ");
		sb.append(smrtLnJnngYn==null?"null":getSmrtLnJnngYn());
		sb.append("\n");
		sb.append("\tdinsvDscd: ");
		sb.append(dinsvDscd==null?"null":getDinsvDscd());
		sb.append("\n");
		sb.append("\taucId: ");
		sb.append(aucId==null?"null":getAucId());
		sb.append("\n");
		sb.append("\tgmktId: ");
		sb.append(gmktId==null?"null":getGmktId());
		sb.append("\n");
		sb.append("\twbbmId: ");
		sb.append(wbbmId==null?"null":getWbbmId());
		sb.append("\n");
		sb.append("\tdniAcnmCnfNewDscd: ");
		sb.append(dniAcnmCnfNewDscd==null?"null":getDniAcnmCnfNewDscd());
		sb.append("\n");
		sb.append("\tdniRcvAm: ");
		sb.append(dniRcvAm==null?"null":getDniRcvAm());
		sb.append("\n");
		sb.append("\tdniHpNo: ");
		sb.append(dniHpNo==null?"null":getDniHpNo());
		sb.append("\n");
		sb.append("\tdniPtnAcno: ");
		sb.append(dniPtnAcno==null?"null":getDniPtnAcno());
		sb.append("\n");
		sb.append("\tdniPtnNewAcno: ");
		sb.append(dniPtnNewAcno==null?"null":getDniPtnNewAcno());
		sb.append("\n");
		sb.append("\tdniPtnbkCd: ");
		sb.append(dniPtnbkCd==null?"null":getDniPtnbkCd());
		sb.append("\n");
		sb.append("\trjnngAcno: ");
		sb.append(rjnngAcno==null?"null":getRjnngAcno());
		sb.append("\n");
		sb.append("\tinsvAcldPlanKdcd: ");
		sb.append(insvAcldPlanKdcd==null?"null":getInsvAcldPlanKdcd());
		sb.append("\n");
		sb.append("\tinsvAcldFstTsAm: ");
		sb.append(insvAcldFstTsAm==null?"null":getInsvAcldFstTsAm());
		sb.append("\n");
		sb.append("\tinsvAcldTsStaWkdDscd: ");
		sb.append(insvAcldTsStaWkdDscd==null?"null":getInsvAcldTsStaWkdDscd());
		sb.append("\n");
		sb.append("\tinsvAcldTsStaDt: ");
		sb.append(insvAcldTsStaDt==null?"null":getInsvAcldTsStaDt());
		sb.append("\n");
		sb.append("\tinsvAcldPlanChcYn: ");
		sb.append(insvAcldPlanChcYn==null?"null":getInsvAcldPlanChcYn());
		sb.append("\n");
		sb.append("\tinsvAcldPlanLifeAm: ");
		sb.append(insvAcldPlanLifeAm==null?"null":getInsvAcldPlanLifeAm());
		sb.append("\n");
		sb.append("\tpidMecd: ");
		sb.append(pidMecd==null?"null":getPidMecd());
		sb.append("\n");
		sb.append("\tselcMvbDtlsIdfCd: ");
		sb.append(selcMvbDtlsIdfCd==null?"null":getSelcMvbDtlsIdfCd());
		sb.append("\n");
		sb.append("\tptnBkwAcno: ");
		sb.append(ptnBkwAcno==null?"null":getPtnBkwAcno());
		sb.append("\n");
		sb.append("\tptnSelcIscd: ");
		sb.append(ptnSelcIscd==null?"null":getPtnSelcIscd());
		sb.append("\n");
		sb.append("\tfndslcMvbCfdocIsuDt: ");
		sb.append(fndslcMvbCfdocIsuDt==null?"null":getFndslcMvbCfdocIsuDt());
		sb.append("\n");
		sb.append("\ttaxTycd: ");
		sb.append(taxTycd==null?"null":getTaxTycd());
		sb.append("\n");
		sb.append("\trprhAfImnwYn: ");
		sb.append(rprhAfImnwYn==null?"null":getRprhAfImnwYn());
		sb.append("\n");
		sb.append("\telfSelfDgnsYn: ");
		sb.append(elfSelfDgnsYn==null?"null":getElfSelfDgnsYn());
		sb.append("\n");
		sb.append("\twmsPrtfDis: ");
		sb.append(wmsPrtfDis==null?"null":getWmsPrtfDis());
		sb.append("\n");
		sb.append("\tptnIstCnfYn: ");
		sb.append(ptnIstCnfYn==null?"null":getPtnIstCnfYn());
		sb.append("\n");
		sb.append("\tivsdesSrno: ");
		sb.append(ivsdesSrno==null?"null":getIvsdesSrno());
		sb.append("\n");
		sb.append("\tfndSvvlAcuCn: ");
		sb.append(fndSvvlAcuCn==null?"null":getFndSvvlAcuCn());
		sb.append("\n");
		sb.append("\tcusPrtfRgsNo: ");
		sb.append(cusPrtfRgsNo==null?"null":getCusPrtfRgsNo());
		sb.append("\n");
		sb.append("\trcpDtm: ");
		sb.append(rcpDtm==null?"null":getRcpDtm());
		sb.append("\n");
		sb.append("\tpnsfndAcno: ");
		sb.append(pnsfndAcno==null?"null":getPnsfndAcno());
		sb.append("\n");
		sb.append("\tmmfFndAcno: ");
		sb.append(mmfFndAcno==null?"null":getMmfFndAcno());
		sb.append("\n");
		sb.append("\tpnsfndNewYn: ");
		sb.append(pnsfndNewYn==null?"null":getPnsfndNewYn());
		sb.append("\n");
		sb.append("\tfrstNwactNo: ");
		sb.append(frstNwactNo==null?"null":getFrstNwactNo());
		sb.append("\n");
		sb.append("\tscndNwactNo: ");
		sb.append(scndNwactNo==null?"null":getScndNwactNo());
		sb.append("\n");
		sb.append("\tfndOpngDt: ");
		sb.append(fndOpngDt==null?"null":getFndOpngDt());
		sb.append("\n");
		sb.append("\tkrwSscoNewTlmNo: ");
		sb.append(krwSscoNewTlmNo==null?"null":getKrwSscoNewTlmNo());
		sb.append("\n");
		sb.append("\tatsDtlDscd: ");
		sb.append(atsDtlDscd==null?"null":getAtsDtlDscd());
		sb.append("\n");
		sb.append("\tatsRcvLmtAm: ");
		sb.append(atsRcvLmtAm==null?"null":getAtsRcvLmtAm());
		sb.append("\n");
		sb.append("\tkrwFmbkMmdaYn: ");
		sb.append(krwFmbkMmdaYn==null?"null":getKrwFmbkMmdaYn());
		sb.append("\n");
		sb.append("\topgOrdsMngNo: ");
		sb.append(opgOrdsMngNo==null?"null":getOpgOrdsMngNo());
		sb.append("\n");
		sb.append("\tspcfPrdMoAcno: ");
		sb.append(spcfPrdMoAcno==null?"null":getSpcfPrdMoAcno());
		sb.append("\n");
		sb.append("\trestTxprLmtAm: ");
		sb.append(restTxprLmtAm==null?"null":getRestTxprLmtAm());
		sb.append("\n");
		sb.append("\tdppeAcno: ");
		sb.append(dppeAcno==null?"null":getDppeAcno());
		sb.append("\n");
		sb.append("\tpmnyIdeedYn: ");
		sb.append(pmnyIdeedYn==null?"null":getPmnyIdeedYn());
		sb.append("\n");
		sb.append("\ttdyCancAcno: ");
		sb.append(tdyCancAcno==null?"null":getTdyCancAcno());
		sb.append("\n");
		sb.append("\tcbrseNewYn: ");
		sb.append(cbrseNewYn==null?"null":getCbrseNewYn());
		sb.append("\n");
		sb.append("\tfmbkNewCitAtsCancYn: ");
		sb.append(fmbkNewCitAtsCancYn==null?"null":getFmbkNewCitAtsCancYn());
		sb.append("\n");
		sb.append("\tcnstDdctFxpdGrnYr5OverYn: ");
		sb.append(cnstDdctFxpdGrnYr5OverYn==null?"null":getCnstDdctFxpdGrnYr5OverYn());
		sb.append("\n");
		sb.append("\taprrBrdmCd: ");
		sb.append(aprrBrdmCd==null?"null":getAprrBrdmCd());
		sb.append("\n");
		sb.append("\tcmpnOv1peYn: ");
		sb.append(cmpnOv1peYn==null?"null":getCmpnOv1peYn());
		sb.append("\n");
		sb.append("\tpnsfndCoreOupYn: ");
		sb.append(pnsfndCoreOupYn==null?"null":getPnsfndCoreOupYn());
		sb.append("\n");
		sb.append("\trtpenPlanAplDt: ");
		sb.append(rtpenPlanAplDt==null?"null":getRtpenPlanAplDt());
		sb.append("\n");
		sb.append("\trtpenPlanItcsno: ");
		sb.append(rtpenPlanItcsno==null?"null":getRtpenPlanItcsno());
		sb.append("\n");
		sb.append("\tglblBnkgJnngYn: ");
		sb.append(glblBnkgJnngYn==null?"null":getGlblBnkgJnngYn());
		sb.append("\n");
		sb.append("\tidCadNewDscd: ");
		sb.append(idCadNewDscd==null?"null":getIdCadNewDscd());
		sb.append("\n");
		sb.append("\tencyEbnkPwnoCnf: ");
		sb.append(encyEbnkPwnoCnf==null?"null":getEncyEbnkPwnoCnf());
		sb.append("\n");
		sb.append("\ttlbnkPwnoCnf: ");
		sb.append(tlbnkPwnoCnf==null?"null":getTlbnkPwnoCnf());
		sb.append("\n");
		sb.append("\tgridRowCnt: ");
		sb.append(gridRowCnt==null?"null":getGridRowCnt());
		sb.append("\n");
		sb.append("\tgrid: ");
		if ( grid== null ) sb.append("null");
		else{
			sb.append("array count : ");
			sb.append(grid.size());
			sb.append("(items)\n");
	
			int max= (10<grid.size())?10:grid.size();
	
			for ( int i= 0; i < max; ++i ){
				sb.append("\tgrid[");
				sb.append(i);
				sb.append("] : ");
				sb.append(grid.get(i));
				sb.append("\n");
			}
	
			if ( max < grid.size() ){
				sb.append("\tgrid[.] : ").append("more ").append((grid.size()-max)).append(" items").append("\n");
			}
		}
		sb.append("\tgridRowCnt2: ");
		sb.append(gridRowCnt2==null?"null":getGridRowCnt2());
		sb.append("\n");
		sb.append("\tgrid2: ");
		if ( grid2== null ) sb.append("null");
		else{
			sb.append("array count : ");
			sb.append(grid2.size());
			sb.append("(items)\n");
	
			int max= (10<grid2.size())?10:grid2.size();
	
			for ( int i= 0; i < max; ++i ){
				sb.append("\tgrid2[");
				sb.append(i);
				sb.append("] : ");
				sb.append(grid2.get(i));
				sb.append("\n");
			}
	
			if ( max < grid2.size() ){
				sb.append("\tgrid2[.] : ").append("more ").append((grid2.size()-max)).append(" items").append("\n");
			}
		}
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 1; /* sqcNmTrnCfdocCollYn */
		messageLen+= 2; /* dpsNewDscd */
		messageLen+= 1; /* dpsRsvNewDscd */
		messageLen+= 32; /* encyActPwno */
		messageLen+= 1; /* sealSignUsgDscd */
		messageLen+= 13; /* pdcd */
		messageLen+= 9; /* csno */
		messageLen+= 6; /* cusDgnAcno */
		messageLen+= 7; /* prrRgsPwnoKey */
		messageLen+= 1; /* smsdDscd */
		messageLen+= 1; /* psnInfExpsCnfYn */
		messageLen+= 1; /* scanUablRncd */
		messageLen+= 19; /* psnInfAgmdMngNo */
		messageLen+= 8; /* acnmCnfEno */
		messageLen+= 8; /* advpeEno */
		messageLen+= 2; /* idcrDscd */
		messageLen+= 50; /* idcrFnm */
		messageLen+= 32; /* idcrEncyRsdlNo */
		messageLen+= 8; /* idcrIsuDt */
		messageLen+= 13; /* idcrImgKey */
		messageLen+= 1; /* idcrCnfShap */
		messageLen+= 1; /* idcrRuseYn */
		messageLen+= 1; /* idcrAgnpeTrnYn */
		messageLen+= 5; /* appRgsDscd */
		messageLen+= 6; /* appRgsBrcd */
		messageLen+= 8; /* appRgsDt */
		messageLen+= 5; /* appRgsSrno */
		messageLen+= 1; /* wmsLnkYn */
		messageLen+= 9; /* snthAsetMngCsno */
		messageLen+= 6; /* snthAsetMngDesgnPrdCnt */
		messageLen+= 6; /* snthAsetMngAltrIvstWgt */
		messageLen+= 6; /* snthAsetMngBksWgt */
		messageLen+= 6; /* snthAsetMngFrgBndWgt */
		messageLen+= 6; /* snthAsetMngFrgStcWgt */
		messageLen+= 13; /* snthAsetMngPdcd */
		messageLen+= 32; /* appRgsPwno */
		messageLen+= 15; /* appRgsAtsAcno */
		messageLen+= 16; /* wmLnkTrnSrno */
		messageLen+= 4; /* snthAsetMngDeedCd */
		messageLen+= 6; /* snthAsetMngFlwWgt */
		messageLen+= 6; /* snthAsetMngDomStcWgt */
		messageLen+= 6; /* snthAsetMngDomBndWgt */
		messageLen+= 5; /* prdStbyAnlsSrno */
		messageLen+= 8; /* inlnAnlsSrno */
		messageLen+= 20; /* asetIstMngNo */
		messageLen+= 13; /* rtpenPlanOrgPdcd */
		messageLen+= 1; /* jnpeTycd */
		messageLen+= 1; /* fndSgpFpCnslSrvcDscd */
		messageLen+= 13; /* rsdlBzpeNo */
		messageLen+= 10; /* frnrLstVldTem */
		messageLen+= 1; /* inetRsvRcpDscd */
		messageLen+= 13; /* inetRsvIdfNo */
		messageLen+= 5; /* inetRsvNo */
		messageLen+= 1; /* inetRsvCusPureNewYn */
		messageLen+= 13; /* synpbPdcd */
		messageLen+= 1; /* actUsgAimDis */
		messageLen+= 1; /* frnrEmptEduYn */
		messageLen+= 1; /* fncTrnAimCollDis */
		messageLen+= 1; /* lnoActOpngRsn */
		messageLen+= 1; /* depaCrdcCollYn */
		messageLen+= 1; /* idCadIsuRqdcUsgYn */
		messageLen+= 1; /* rcvVcrMlsChidYn */
		messageLen+= 2; /* saltsScdDd */
		messageLen+= 1; /* atmWdrDscd */
		messageLen+= 1; /* cctnTrnKdcd */
		messageLen+= 1; /* idCadIsuYn */
		messageLen+= 1; /* ptnrPrmeIr1Yn */
		messageLen+= 1; /* ptnrPrmeIr2Yn */
		messageLen+= 1; /* ptnrPrmeIr3Yn */
		messageLen+= 1; /* ptnrPrmeIr4Yn */
		messageLen+= 20; /* ascnPbokNm */
		messageLen+= 22; /* rcvpeNm */
		messageLen+= 2; /* rcvDd */
		messageLen+= 8; /* dntnAtsEndDt */
		messageLen+= 13; /* patnAscnAcno */
		messageLen+= 32; /* patnAscnNm */
		messageLen+= 40; /* aimFdNm */
		messageLen+= 1; /* patnAscnDis */
		messageLen+= 4; /* patnHpNo */
		messageLen+= 13; /* chilRrno */
		messageLen+= 1; /* dntnInfOfrAgrYn */
		messageLen+= 1; /* dntnlCd */
		messageLen+= 1; /* clsaAtsRqYn */
		messageLen+= 15; /* clsaAtsPmnyAcno */
		messageLen+= 8; /* clsaAtsEndDt */
		messageLen+= 1; /* fncTaxtSmsRqYn */
		messageLen+= 5; /* wfFclUnqNo */
		messageLen+= 1; /* locaPrmeYn */
		messageLen+= 2; /* afiBzcd */
		messageLen+= 1; /* emlNtcSrvcYn */
		messageLen+= 1; /* fmbkCtrdCollYn */
		messageLen+= 1; /* adrpRgsYn */
		messageLen+= 1; /* mbhYn */
		messageLen+= 1; /* psnInfAgrYn */
		messageLen+= 11; /* datAcldHpNo */
		messageLen+= 3; /* dpsBatRqsNo */
		messageLen+= 7; /* dpsBatRqsSrno */
		messageLen+= 32; /* agnpeEncyRrno */
		messageLen+= 30; /* agnpeFnm */
		messageLen+= 1; /* rppeDupOmitYn */
		messageLen+= 1; /* rppeAgnpeAcrdYn */
		messageLen+= 30; /* rppeFnm */
		messageLen+= 32; /* rppeEncyRrno */
		messageLen+= 1; /* agnpeDupYn */
		messageLen+= 1; /* rppeDupYn */
		messageLen+= 2; /* itpyMecd */
		messageLen+= 2; /* itpyCycd */
		messageLen+= 8; /* nextItpyDt */
		messageLen+= 6; /* actMngBrcd */
		messageLen+= 1; /* asscNmnlDpstYn */
		messageLen+= 4; /* netrApvNo */
		messageLen+= 1; /* mbpbkJnngYn */
		messageLen+= 10; /* mblPbokInetBnkgId */
		messageLen+= 1; /* npbokIccadIsuDis */
		messageLen+= 4; /* ideedCd */
		messageLen+= 1; /* pbokEngPrngYn */
		messageLen+= 1; /* nlDscd */
		messageLen+= 8; /* dpsDeedNo */
		messageLen+= 1; /* pbokIssuYn */
		messageLen+= 1; /* prdGdncPbokPrngYn */
		messageLen+= 1; /* nrsrCnfDocCollYn */
		messageLen+= 1; /* bokStttPermXtYn */
		messageLen+= 1; /* nrsrPwnoRgsYn */
		messageLen+= 1; /* nrsrAccCd */
		messageLen+= 2; /* krwDpsAccDscd */
		messageLen+= 2; /* nrsrKrwInfwDscd */
		messageLen+= 2; /* txprDscd */
		messageLen+= 19; /* txprLmtAm */
		messageLen+= 19; /* prchAm */
		messageLen+= 19; /* pmbilAm */
		messageLen+= 19; /* cackAm */
		messageLen+= 19; /* bokBchkAm */
		messageLen+= 19; /* etcDeedAm */
		messageLen+= 2; /* fncTrnAimCd */
		messageLen+= 2; /* trnFdSrcCd */
		messageLen+= 1; /* fdOwpeYn */
		messageLen+= 100; /* fncTrnAimTxt */
		messageLen+= 50; /* trnFdSrcCdTxt */
		messageLen+= 2; /* ckbilKdcd */
		messageLen+= 1; /* cacGramRcvYn */
		messageLen+= 1; /* cacGramRcvCrtdIsuYn */
		messageLen+= 15; /* cacGramRcvAm */
		messageLen+= 15; /* cacGramTrfAm */
		messageLen+= 15; /* cacGramBchkAm */
		messageLen+= 1; /* feeRcvYn */
		messageLen+= 1; /* feeCshtfDscd */
		messageLen+= 1; /* rctsOupYn */
		messageLen+= 15; /* feeAm */
		messageLen+= 15; /* wdrAcno */
		messageLen+= 32; /* encyWdrActPwno */
		messageLen+= 15; /* xprRcvAcno */
		messageLen+= 2; /* irprmTgt1Dscd */
		messageLen+= 2; /* irprmTgt2Dscd */
		messageLen+= 2; /* irprmTgt3Dscd */
		messageLen+= 2; /* irprmTgt4Dscd */
		messageLen+= 2; /* irprmTgt5Dscd */
		messageLen+= 2; /* irprmTgt6Dscd */
		messageLen+= 1; /* xprPrcMecd */
		messageLen+= 15; /* dntnAtsAcno */
		messageLen+= 1; /* newFdDscd */
		messageLen+= 15; /* spcfMonyTrtAcno */
		messageLen+= 1; /* pnsnPayTemEstYn */
		messageLen+= 3; /* pnsnPayCtrtmYcnt */
		messageLen+= 2; /* pnsnPayCycd */
		messageLen+= 1; /* lnoActPbokIssuYn */
		messageLen+= 15; /* bscAcno */
		messageLen+= 1; /* oldAtrbXtRncd */
		messageLen+= 1; /* cpblChckTgtYn */
		messageLen+= 1; /* rpcmDpstTgtYn */
		messageLen+= 1; /* oldAtrbCeoRgsrDrtrYn */
		messageLen+= 4; /* oldAtrbApvNo */
		messageLen+= 15; /* rdepAcno */
		messageLen+= 50; /* oldAtrbApvRsn */
		messageLen+= 6; /* oldAtrbChckTim */
		messageLen+= 1; /* ccadRsltInqYn */
		messageLen+= 1; /* tbkCcadHldgYn */
		messageLen+= 1; /* cadStlActTbkYn */
		messageLen+= 15; /* ccadBasRsltAm */
		messageLen+= 8; /* utzRsltBasStaDt */
		messageLen+= 8; /* utzRsltBasEndDt */
		messageLen+= 4; /* utzRsltInqTim */
		messageLen+= 1; /* amfRispeDis */
		messageLen+= 20; /* amfRispeFnm */
		messageLen+= 13; /* amfRispeRrno */
		messageLen+= 11; /* amfRispeCnad */
		messageLen+= 1; /* anrvNprcYn */
		messageLen+= 13; /* pbamAcno */
		messageLen+= 13; /* pbamSnnmAcno */
		messageLen+= 13; /* pmnyTrnUnqNo */
		messageLen+= 3; /* ctrtmMcn */
		messageLen+= 3; /* ctrtmDcnt */
		messageLen+= 8; /* xprDt */
		messageLen+= 8; /* rcknDt */
		messageLen+= 32; /* encyAtsActPwno */
		messageLen+= 2; /* atsCycd */
		messageLen+= 8; /* atsStaDt */
		messageLen+= 8; /* atsEndDt */
		messageLen+= 3; /* atsCucd */
		messageLen+= 2; /* atsDd */
		messageLen+= 3; /* atsMecn */
		messageLen+= 20; /* atsAcno */
		messageLen+= 19; /* atsAm */
		messageLen+= 3; /* tbkSltCopCd */
		messageLen+= 1; /* tbkSltCopOfemYn */
		messageLen+= 1; /* dntnRqYn */
		messageLen+= 1; /* dntnAmDscd */
		messageLen+= 15; /* dntnAm */
		messageLen+= 15; /* xprCancRcvAcno */
		messageLen+= 8; /* bchrCponNo */
		messageLen+= 12; /* bchrSupAm */
		messageLen+= 15; /* bchrCusPidAm */
		messageLen+= 8; /* apvNo */
		messageLen+= 20; /* cponCrtfNo */
		messageLen+= 1; /* autoRdepYn */
		messageLen+= 1; /* insuJnngAgrYn */
		messageLen+= 1; /* jnngTgtDscd */
		messageLen+= 1; /* ccadHldgYn */
		messageLen+= 8; /* frcsDshgDt */
		messageLen+= 50; /* cusDgnPrdNm */
		messageLen+= 20; /* xcoCd */
		messageLen+= 20; /* frndAcno */
		messageLen+= 2; /* spdtDgnMm */
		messageLen+= 2; /* spdtDgnDd */
		messageLen+= 6; /* aplIr */
		messageLen+= 1; /* emlFpAcblNtfcRqYn */
		messageLen+= 2; /* emlFpAcblNtfcBsdt */
		messageLen+= 1; /* fpPrftRtSmsNtfcRqYn */
		messageLen+= 2; /* fpPrftRtSmsNtfcBsdt */
		messageLen+= 1; /* goalPrSmsRqYn */
		messageLen+= 15; /* goalPr */
		messageLen+= 15; /* alwPr */
		messageLen+= 1; /* gBnkgGoalPrftRtDscd */
		messageLen+= 1; /* gBnkgAlwLossDscd */
		messageLen+= 1; /* fcPsklUseYn */
		messageLen+= 2; /* xrtTsTycd */
		messageLen+= 15; /* xrtMaxAcldAm */
		messageLen+= 1; /* dgnXrtNtfcSrvcDscd */
		messageLen+= 8; /* ntfcSrvcDgnXrt */
		messageLen+= 10; /* ovtbCdno */
		messageLen+= 20; /* fmbkCoNo */
		messageLen+= 1; /* atrnDscd */
		messageLen+= 15; /* rvactNo */
		messageLen+= 2; /* irRotCycd */
		messageLen+= 2; /* fcfndInfwDscd */
		messageLen+= 3; /* fcDpsAccDscd */
		messageLen+= 1; /* fornXchStttCrtcSbmtDis */
		messageLen+= 5; /* fxRapRncd */
		messageLen+= 1; /* payRncdCfcd */
		messageLen+= 10; /* hsCd */
		messageLen+= 6; /* ivpeId */
		messageLen+= 40; /* secrComNm */
		messageLen+= 4; /* fcApvCd */
		messageLen+= 3; /* pnsnAcldCtrYcnt */
		messageLen+= 3; /* pnsnAcldCtrMcn */
		messageLen+= 8; /* pnsnRcveBgnDt */
		messageLen+= 1; /* prftRtRptdSndDscd */
		messageLen+= 1; /* rprhLnkNewYn */
		messageLen+= 13; /* rprhLnkCancAcno */
		messageLen+= 1; /* rprhLnkTamNewYn */
		messageLen+= 1; /* afepAddPidYn */
		messageLen+= 13; /* fndPdcd */
		messageLen+= 1; /* fndScntRqdcNprtYn */
		messageLen+= 1; /* opgPtsNtcSndDscd */
		messageLen+= 6; /* gBnkgGoalPrftRtPsnb */
		messageLen+= 2; /* gBnkgGoalPrftRtDcml */
		messageLen+= 6; /* gBnkgAlwLossRtPsnb */
		messageLen+= 2; /* gBnkgAlwLossRtDcml */
		messageLen+= 15; /* wooriOnwlMoAcno */
		messageLen+= 1; /* bznUseActYn */
		messageLen+= 11; /* agnpeItcsno */
		messageLen+= 11; /* rppeItcsno */
		messageLen+= 1; /* atsNaNtfcRqYn */
		messageLen+= 1; /* acldFndTsXprNtfcRqYn */
		messageLen+= 13; /* fwxcAcno */
		messageLen+= 15; /* fndCnvrTmntAcno */
		messageLen+= 1; /* dvdamRinvDscd */
		messageLen+= 1; /* fndCnvrNewYn */
		messageLen+= 1; /* lonXprAdvnYn */
		messageLen+= 1; /* lnApvCmplYn */
		messageLen+= 30; /* priPrpeBrNm */
		messageLen+= 10; /* grnTrno */
		messageLen+= 10; /* escrUnmrNo */
		messageLen+= 15; /* priPrpeAcno */
		messageLen+= 15; /* prpeAcno */
		messageLen+= 10; /* priPrpeBzpeNo */
		messageLen+= 10; /* prpeBzpeNo */
		messageLen+= 15; /* ppmtAmRcveAcno */
		messageLen+= 9; /* orcpPrpeCsno */
		messageLen+= 9; /* pftPrpeCsno */
		messageLen+= 1; /* orcpPrpeNrsrCollYn */
		messageLen+= 1; /* pftPrpeNrsrCollYn */
		messageLen+= 15; /* pocpPfeAm */
		messageLen+= 3; /* etfTprt */
		messageLen+= 40; /* opgOrdsTxt */
		messageLen+= 62; /* sa1Txt */
		messageLen+= 62; /* sa2Txt */
		messageLen+= 62; /* sa3Txt */
		messageLen+= 1; /* sptxYn */
		messageLen+= 9; /* nnmCsno */
		messageLen+= 12; /* fndItmsCd */
		messageLen+= 19; /* dpsRcvAm */
		messageLen+= 19; /* trfAm */
		messageLen+= 19; /* bchkAm */
		messageLen+= 19; /* bchkInqmAm */
		messageLen+= 3; /* inqmScnt */
		messageLen+= 1; /* inqmFeeXmpDis */
		messageLen+= 1; /* tamTrfYn */
		messageLen+= 2; /* pxrt */
		messageLen+= 12; /* krwTrfAm */
		messageLen+= 3; /* cucd */
		messageLen+= 1; /* ioffSbDscd */
		messageLen+= 1; /* cshtfDscd */
		messageLen+= 4; /* cshFeeLevyDscd */
		messageLen+= 19; /* cshFee */
		messageLen+= 19; /* tgtKrwAm */
		messageLen+= 19; /* fcTrfAm */
		messageLen+= 19; /* fcCshRcvAm */
		messageLen+= 19; /* coinAm */
		messageLen+= 19; /* krfd */
		messageLen+= 9; /* apxrt */
		messageLen+= 9; /* cusPrmeXrt */
		messageLen+= 9; /* ioffSbRt */
		messageLen+= 3; /* fwxcCtrMcnt */
		messageLen+= 20; /* newAcno */
		messageLen+= 12; /* ksdFndNo */
		messageLen+= 6; /* rtpenTrnDisNo */
		messageLen+= 19; /* rcmGoalAm */
		messageLen+= 2; /* jnngCtgrCd */
		messageLen+= 8; /* rcpMdKdcd */
		messageLen+= 1; /* hsscMajTxtPbokPrngYn */
		messageLen+= 1; /* prdDesOupYn */
		messageLen+= 1; /* acicJnngYn */
		messageLen+= 2; /* hsscNewDscd */
		messageLen+= 6; /* hsscRgslZpno */
		messageLen+= 1; /* hsscInddRgsYn */
		messageLen+= 6; /* hsscHopeRgnZpno */
		messageLen+= 1; /* hopeHousKdDscd */
		messageLen+= 1; /* housXuseSqmDscd */
		messageLen+= 6; /* hopeMovinYm */
		messageLen+= 8; /* esnsNewRgsDt */
		messageLen+= 6; /* esnsNewRgsTm */
		messageLen+= 13; /* esnsNewEbnkUtzpeNo */
		messageLen+= 3; /* atsKdcd */
		messageLen+= 1; /* lnoActOpngRncd */
		messageLen+= 1; /* scanInfAcnmCnfDscd */
		messageLen+= 1; /* agnpeTrnYn */
		messageLen+= 2; /* dpsPwnoRgsDscd */
		messageLen+= 7; /* prrRgsPwnoKeyCnf */
		messageLen+= 32; /* encyActPwnoCnf */
		messageLen+= 1; /* wdcPbokYn */
		messageLen+= 1; /* wooriLovPlsDntnAscnDscd */
		messageLen+= 1; /* sameRqdcSrno */
		messageLen+= 2; /* etcDeedDscd */
		messageLen+= 4; /* actApvNo */
		messageLen+= 1; /* fndRblnNewYn */
		messageLen+= 1; /* bgnnRcvWdrYn */
		messageLen+= 11; /* copItcsno */
		messageLen+= 1; /* inbkNewYn */
		messageLen+= 1; /* smrtBnkgNewYn */
		messageLen+= 1; /* tlbnkNewYn */
		messageLen+= 1; /* ntsvcRgsYn */
		messageLen+= 1; /* inbkWdrActRgsYn */
		messageLen+= 10; /* inetBnkgUserId */
		messageLen+= 50; /* ebnkPwno */
		messageLen+= 40; /* engNm */
		messageLen+= 19; /* tms1TsLmtAm */
		messageLen+= 19; /* d1TsLmtAm */
		messageLen+= 10; /* secrdSrno */
		messageLen+= 16; /* otpcSrno */
		messageLen+= 32; /* otpPwd */
		messageLen+= 1; /* otpIsuCostXmpDscd */
		messageLen+= 14; /* datDpsTelNo */
		messageLen+= 1; /* synpbDscd */
		messageLen+= 20; /* inetBnkgRcpSrno */
		messageLen+= 6; /* inbkRsvRgbrCd */
		messageLen+= 8; /* inbkRsvRgsDt */
		messageLen+= 5; /* inbkRsvRgsSrno */
		messageLen+= 10; /* smrtBnkgInetBnkgId */
		messageLen+= 4; /* smrtBnkgHpComCd */
		messageLen+= 4; /* smrtBnkgHpTlenNo */
		messageLen+= 4; /* smrtBnkgHpSrno */
		messageLen+= 10; /* tlbnkSecrdSrno */
		messageLen+= 32; /* encyEbnkPwno */
		messageLen+= 15; /* tlbnkD1TsLmt */
		messageLen+= 15; /* tlbnkTms1TsLmt */
		messageLen+= 1; /* ntsvcRawDscd */
		messageLen+= 1; /* ntsvcBalNtyMarkYn */
		messageLen+= 4; /* ntsvcHpComCd */
		messageLen+= 4; /* ntsvcHpTlenNo */
		messageLen+= 4; /* ntsvcHpSrno */
		messageLen+= 15; /* ntsvcInotAm */
		messageLen+= 1; /* astPrtsNtcYn */
		messageLen+= 2; /* ntsvcTmsStaTim */
		messageLen+= 2; /* ntsvcTmsEndTim */
		messageLen+= 10; /* wdrActRgsInetBnkgId */
		messageLen+= 1; /* ebnkWdrActCnccRgsYn */
		messageLen+= 1; /* tlbnkWdrActCnccRgsYn */
		messageLen+= 1; /* hswfPbokDocSndYn */
		messageLen+= 9; /* faOwacCsno */
		messageLen+= 1; /* flieRgsYn */
		messageLen+= 1; /* atsYn */
		messageLen+= 19; /* hmnyUsgAm */
		messageLen+= 15; /* etcAcno */
		messageLen+= 6; /* trtpyRtPsnb */
		messageLen+= 2; /* trtpyRtDcml */
		messageLen+= 2; /* fltIrNtcDscd */
		messageLen+= 1; /* etpCoplsDpstNewYn */
		messageLen+= 1; /* atsXtYn */
		messageLen+= 13; /* spslPdcd */
		messageLen+= 2; /* trtPocpPfeRtPsnb */
		messageLen+= 3; /* trtPocpPfeRtDcml */
		messageLen+= 2; /* trtDfanPfeRtPsnb */
		messageLen+= 3; /* trtDfanPfeRtDcml */
		messageLen+= 1; /* cponInpDscd */
		messageLen+= 6; /* agmIrtPsnb */
		messageLen+= 2; /* agmIrtDcml */
		messageLen+= 20; /* pbokOtln */
		messageLen+= 2; /* ascnBlgCd */
		messageLen+= 1; /* acldCrtdSndDscd */
		messageLen+= 1; /* isaMajSbjPbokPrngYn */
		messageLen+= 1; /* isaNewDscd */
		messageLen+= 1; /* isaJnngDscd */
		messageLen+= 8; /* jnngAdvpeEno */
		messageLen+= 1; /* extxDscd */
		messageLen+= 1; /* dtjnTemDscd */
		messageLen+= 1; /* mndDocCollYn */
		messageLen+= 8; /* enmtDt */
		messageLen+= 8; /* dshgDt */
		messageLen+= 4; /* ctrmvIscd */
		messageLen+= 19; /* rtrtInsuCnvrAm */
		messageLen+= 2; /* aldJnpeTycd */
		messageLen+= 8; /* fstJnngDt */
		messageLen+= 20; /* tfrAcno */
		messageLen+= 14; /* planNo */
		messageLen+= 2; /* brdmKdcd */
		messageLen+= 24; /* scdOrdsMngNo */
		messageLen+= 19; /* rtpenCobdnAm */
		messageLen+= 19; /* rtpenPbdnAm */
		messageLen+= 19; /* opgMngFee */
		messageLen+= 19; /* asetMngFee */
		messageLen+= 20; /* stlAcno */
		messageLen+= 32; /* encyStlActPwno */
		messageLen+= 1; /* afepAddPidDscd */
		messageLen+= 1; /* rprhLnkNewDscd */
		messageLen+= 13; /* cancRsvFndAcno */
		messageLen+= 1; /* rprhAmTamNewDscd */
		messageLen+= 7; /* xcoPrmeIrt */
		messageLen+= 6; /* fndGoalPrftRtPsnb */
		messageLen+= 2; /* fndGoalPrftRtDcml */
		messageLen+= 18; /* srvcRqAm */
		messageLen+= 1; /* fndAcblNtcDis */
		messageLen+= 2; /* fndAcblNtfcBasDd */
		messageLen+= 1; /* fndPrftRtSmsChrRqDscd */
		messageLen+= 6; /* fndSmsRqTprtPsnb */
		messageLen+= 2; /* fndSmsRqTprtDcml */
		messageLen+= 1; /* fndSmsRqTprtDscd */
		messageLen+= 6; /* fndSmsRqLossAwrtPsnb */
		messageLen+= 2; /* fndSmsRqLossAwrtDcml */
		messageLen+= 1; /* fndSmsRqLossAwrtDscd */
		messageLen+= 1; /* fndFpPrftRtSmsChrRqDscd */
		messageLen+= 2; /* fndFpPrftRtSmsChrRqDtDscd */
		messageLen+= 1; /* scntRqdcPrngOmitYn */
		messageLen+= 15; /* oldAtrbChckHisSrno */
		messageLen+= 10; /* newVstrMngNo */
		messageLen+= 10; /* payVstrMngNo */
		messageLen+= 12; /* spotTfrRtpenPrdNo */
		messageLen+= 4; /* rtttIscd */
		messageLen+= 1; /* spotTfrRtpenPlanDscd */
		messageLen+= 15; /* intRcvFcAcno */
		messageLen+= 1; /* pbdeedPrngYn */
		messageLen+= 6; /* dgnXrtPsnb */
		messageLen+= 2; /* dgnXrtDcml */
		messageLen+= 1; /* mkshMbhYn */
		messageLen+= 1; /* asstmPbokDscd */
		messageLen+= 14; /* wbbtJnngHpNo */
		messageLen+= 2; /* prdOpgDscd */
		messageLen+= 1; /* newInqYn */
		messageLen+= 1; /* pwnoNuseYn */
		messageLen+= 4; /* bchrInqTim */
		messageLen+= 1; /* bchrNewAvlYn */
		messageLen+= 1; /* prdMajTxtPbokPrngYn */
		messageLen+= 6; /* apirtPsnb */
		messageLen+= 5; /* apirtDcml */
		messageLen+= 8; /* hqapNo */
		messageLen+= 9; /* acnmCsno */
		messageLen+= 1; /* fcbdNewYn */
		messageLen+= 2; /* irKdcd */
		messageLen+= 2; /* efctPrftRtPsnb */
		messageLen+= 5; /* efctPrftRtDcml */
		messageLen+= 1; /* vrBilNewDscd */
		messageLen+= 1; /* istIvpeBatNewTrnDscd */
		messageLen+= 6; /* dppeCsno */
		messageLen+= 4; /* dppeActIdfNo */
		messageLen+= 2; /* dpsBatNewBzcd */
		messageLen+= 13; /* ascnNewRprsAcno */
		messageLen+= 1; /* ascnNewRprsActYn */
		messageLen+= 4; /* pbamActAcctYy */
		messageLen+= 4; /* pmnySnnmActAcctYy */
		messageLen+= 1; /* hsscOwhmAdrKdcd */
		messageLen+= 25; /* hsscOwhmBldMngNo */
		messageLen+= 3; /* hsscOwhmPostSrno */
		messageLen+= 10; /* hsscOwhmStdoNo */
		messageLen+= 3; /* agmtCoCd */
		messageLen+= 2; /* wooriHopeDremJnngTgtDscd */
		messageLen+= 4; /* asetMngIscd */
		messageLen+= 1; /* rpbdDscd */
		messageLen+= 15; /* cctnAcno */
		messageLen+= 1; /* npbdSbsrRqYn */
		messageLen+= 9; /* npbdItmsCd */
		messageLen+= 2; /* bndKdDis */
		messageLen+= 6; /* tunMmHo */
		messageLen+= 1; /* hdgTgtYn */
		messageLen+= 1; /* idCadNhssDscd */
		messageLen+= 1; /* fndPlsOpgDscd */
		messageLen+= 16; /* grnInsuKey */
		messageLen+= 1; /* preIntRcvDscd */
		messageLen+= 15; /* preIntRcvAcno */
		messageLen+= 6; /* dpsRcmNo */
		messageLen+= 3; /* sldrAldCn */
		messageLen+= 1; /* dlpmPbokGenRgsYn */
		messageLen+= 60; /* smrtMchrMdlInf */
		messageLen+= 1; /* wibeeRcvRgsYn */
		messageLen+= 15; /* wibeeTsAcno */
		messageLen+= 1; /* wibeePushRgsYn */
		messageLen+= 13; /* atsKrwTsAcno */
		messageLen+= 6; /* irngBrcd */
		messageLen+= 1; /* krwFmbkFxpdYn */
		messageLen+= 1; /* krwSscoFmbkFxpdYn */
		messageLen+= 1; /* hopeHousXuseSqmDscd */
		messageLen+= 8; /* rrrgMvinDt */
		messageLen+= 8; /* dppeUnqNo */
		messageLen+= 12; /* dppeItmsNo */
		messageLen+= 15; /* cshbAtsAcno */
		messageLen+= 3; /* cusDntnAscnCd */
		messageLen+= 8; /* cusBrdnCnrnRt */
		messageLen+= 19; /* dinsvGoalAm */
		messageLen+= 1; /* txprInqYn */
		messageLen+= 13; /* frno */
		messageLen+= 1; /* acnmRgsCd */
		messageLen+= 1; /* coaOmitYn */
		messageLen+= 1; /* wbbmLnkNewYn */
		messageLen+= 11; /* wbbtRcmRgsHpNo */
		messageLen+= 1; /* smrtLnJnngYn */
		messageLen+= 2; /* dinsvDscd */
		messageLen+= 20; /* aucId */
		messageLen+= 20; /* gmktId */
		messageLen+= 50; /* wbbmId */
		messageLen+= 1; /* dniAcnmCnfNewDscd */
		messageLen+= 16; /* dniRcvAm */
		messageLen+= 12; /* dniHpNo */
		messageLen+= 15; /* dniPtnAcno */
		messageLen+= 15; /* dniPtnNewAcno */
		messageLen+= 3; /* dniPtnbkCd */
		messageLen+= 15; /* rjnngAcno */
		messageLen+= 1; /* insvAcldPlanKdcd */
		messageLen+= 16; /* insvAcldFstTsAm */
		messageLen+= 1; /* insvAcldTsStaWkdDscd */
		messageLen+= 8; /* insvAcldTsStaDt */
		messageLen+= 1; /* insvAcldPlanChcYn */
		messageLen+= 16; /* insvAcldPlanLifeAm */
		messageLen+= 2; /* pidMecd */
		messageLen+= 20; /* selcMvbDtlsIdfCd */
		messageLen+= 20; /* ptnBkwAcno */
		messageLen+= 10; /* ptnSelcIscd */
		messageLen+= 8; /* fndslcMvbCfdocIsuDt */
		messageLen+= 2; /* taxTycd */
		messageLen+= 1; /* rprhAfImnwYn */
		messageLen+= 1; /* elfSelfDgnsYn */
		messageLen+= 2; /* wmsPrtfDis */
		messageLen+= 1; /* ptnIstCnfYn */
		messageLen+= 30; /* ivsdesSrno */
		messageLen+= 18; /* fndSvvlAcuCn */
		messageLen+= 16; /* cusPrtfRgsNo */
		messageLen+= 14; /* rcpDtm */
		messageLen+= 13; /* pnsfndAcno */
		messageLen+= 15; /* mmfFndAcno */
		messageLen+= 1; /* pnsfndNewYn */
		messageLen+= 13; /* frstNwactNo */
		messageLen+= 13; /* scndNwactNo */
		messageLen+= 8; /* fndOpngDt */
		messageLen+= 6; /* krwSscoNewTlmNo */
		messageLen+= 2; /* atsDtlDscd */
		messageLen+= 19; /* atsRcvLmtAm */
		messageLen+= 1; /* krwFmbkMmdaYn */
		messageLen+= 24; /* opgOrdsMngNo */
		messageLen+= 13; /* spcfPrdMoAcno */
		messageLen+= 19; /* restTxprLmtAm */
		messageLen+= 13; /* dppeAcno */
		messageLen+= 1; /* pmnyIdeedYn */
		messageLen+= 15; /* tdyCancAcno */
		messageLen+= 1; /* cbrseNewYn */
		messageLen+= 1; /* fmbkNewCitAtsCancYn */
		messageLen+= 1; /* cnstDdctFxpdGrnYr5OverYn */
		messageLen+= 4; /* aprrBrdmCd */
		messageLen+= 1; /* cmpnOv1peYn */
		messageLen+= 1; /* pnsfndCoreOupYn */
		messageLen+= 8; /* rtpenPlanAplDt */
		messageLen+= 11; /* rtpenPlanItcsno */
		messageLen+= 1; /* glblBnkgJnngYn */
		messageLen+= 1; /* idCadNewDscd */
		messageLen+= 32; /* encyEbnkPwnoCnf */
		messageLen+= 50; /* tlbnkPwnoCnf */
		messageLen+= 5; /* gridRowCnt */
		{/*grid*/
			int size=getGridRowCnt();
			int count= grid == null ? 0 : grid.size();
			int min= size > count?count:size;
			IBSMR0004063_GRID_IDT emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					IBSMR0004063_GRID_IDT element= grid.get(i);
					if ( element != null && !(element instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= element==null?0:( (Predictable)element).predictMessageLength();
				}else{
					if ( emptyElement== null ) emptyElement= new com.skbank.sml.ifi.mca.eims3.dto.IBSMR0004063_GRID_IDT();
					if ( !(emptyElement instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= ( (Predictable)emptyElement).predictMessageLength();
				}
			}
		}
		messageLen+= 5; /* gridRowCnt2 */
		{/*grid2*/
			int size=getGridRowCnt2();
			int count= grid2 == null ? 0 : grid2.size();
			int min= size > count?count:size;
			IBSMR0004063_GRID_2_IDT emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					IBSMR0004063_GRID_2_IDT element= grid2.get(i);
					if ( element != null && !(element instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= element==null?0:( (Predictable)element).predictMessageLength();
				}else{
					if ( emptyElement== null ) emptyElement= new com.skbank.sml.ifi.mca.eims3.dto.IBSMR0004063_GRID_2_IDT();
					if ( !(emptyElement instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= ( (Predictable)emptyElement).predictMessageLength();
				}
			}
		}
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("sqcNmTrnCfdocCollYn");
		list.add("dpsNewDscd");
		list.add("dpsRsvNewDscd");
		list.add("encyActPwno");
		list.add("sealSignUsgDscd");
		list.add("pdcd");
		list.add("csno");
		list.add("cusDgnAcno");
		list.add("prrRgsPwnoKey");
		list.add("smsdDscd");
		list.add("psnInfExpsCnfYn");
		list.add("scanUablRncd");
		list.add("psnInfAgmdMngNo");
		list.add("acnmCnfEno");
		list.add("advpeEno");
		list.add("idcrDscd");
		list.add("idcrFnm");
		list.add("idcrEncyRsdlNo");
		list.add("idcrIsuDt");
		list.add("idcrImgKey");
		list.add("idcrCnfShap");
		list.add("idcrRuseYn");
		list.add("idcrAgnpeTrnYn");
		list.add("appRgsDscd");
		list.add("appRgsBrcd");
		list.add("appRgsDt");
		list.add("appRgsSrno");
		list.add("wmsLnkYn");
		list.add("snthAsetMngCsno");
		list.add("snthAsetMngDesgnPrdCnt");
		list.add("snthAsetMngAltrIvstWgt");
		list.add("snthAsetMngBksWgt");
		list.add("snthAsetMngFrgBndWgt");
		list.add("snthAsetMngFrgStcWgt");
		list.add("snthAsetMngPdcd");
		list.add("appRgsPwno");
		list.add("appRgsAtsAcno");
		list.add("wmLnkTrnSrno");
		list.add("snthAsetMngDeedCd");
		list.add("snthAsetMngFlwWgt");
		list.add("snthAsetMngDomStcWgt");
		list.add("snthAsetMngDomBndWgt");
		list.add("prdStbyAnlsSrno");
		list.add("inlnAnlsSrno");
		list.add("asetIstMngNo");
		list.add("rtpenPlanOrgPdcd");
		list.add("jnpeTycd");
		list.add("fndSgpFpCnslSrvcDscd");
		list.add("rsdlBzpeNo");
		list.add("frnrLstVldTem");
		list.add("inetRsvRcpDscd");
		list.add("inetRsvIdfNo");
		list.add("inetRsvNo");
		list.add("inetRsvCusPureNewYn");
		list.add("synpbPdcd");
		list.add("actUsgAimDis");
		list.add("frnrEmptEduYn");
		list.add("fncTrnAimCollDis");
		list.add("lnoActOpngRsn");
		list.add("depaCrdcCollYn");
		list.add("idCadIsuRqdcUsgYn");
		list.add("rcvVcrMlsChidYn");
		list.add("saltsScdDd");
		list.add("atmWdrDscd");
		list.add("cctnTrnKdcd");
		list.add("idCadIsuYn");
		list.add("ptnrPrmeIr1Yn");
		list.add("ptnrPrmeIr2Yn");
		list.add("ptnrPrmeIr3Yn");
		list.add("ptnrPrmeIr4Yn");
		list.add("ascnPbokNm");
		list.add("rcvpeNm");
		list.add("rcvDd");
		list.add("dntnAtsEndDt");
		list.add("patnAscnAcno");
		list.add("patnAscnNm");
		list.add("aimFdNm");
		list.add("patnAscnDis");
		list.add("patnHpNo");
		list.add("chilRrno");
		list.add("dntnInfOfrAgrYn");
		list.add("dntnlCd");
		list.add("clsaAtsRqYn");
		list.add("clsaAtsPmnyAcno");
		list.add("clsaAtsEndDt");
		list.add("fncTaxtSmsRqYn");
		list.add("wfFclUnqNo");
		list.add("locaPrmeYn");
		list.add("afiBzcd");
		list.add("emlNtcSrvcYn");
		list.add("fmbkCtrdCollYn");
		list.add("adrpRgsYn");
		list.add("mbhYn");
		list.add("psnInfAgrYn");
		list.add("datAcldHpNo");
		list.add("dpsBatRqsNo");
		list.add("dpsBatRqsSrno");
		list.add("agnpeEncyRrno");
		list.add("agnpeFnm");
		list.add("rppeDupOmitYn");
		list.add("rppeAgnpeAcrdYn");
		list.add("rppeFnm");
		list.add("rppeEncyRrno");
		list.add("agnpeDupYn");
		list.add("rppeDupYn");
		list.add("itpyMecd");
		list.add("itpyCycd");
		list.add("nextItpyDt");
		list.add("actMngBrcd");
		list.add("asscNmnlDpstYn");
		list.add("netrApvNo");
		list.add("mbpbkJnngYn");
		list.add("mblPbokInetBnkgId");
		list.add("npbokIccadIsuDis");
		list.add("ideedCd");
		list.add("pbokEngPrngYn");
		list.add("nlDscd");
		list.add("dpsDeedNo");
		list.add("pbokIssuYn");
		list.add("prdGdncPbokPrngYn");
		list.add("nrsrCnfDocCollYn");
		list.add("bokStttPermXtYn");
		list.add("nrsrPwnoRgsYn");
		list.add("nrsrAccCd");
		list.add("krwDpsAccDscd");
		list.add("nrsrKrwInfwDscd");
		list.add("txprDscd");
		list.add("txprLmtAm");
		list.add("prchAm");
		list.add("pmbilAm");
		list.add("cackAm");
		list.add("bokBchkAm");
		list.add("etcDeedAm");
		list.add("fncTrnAimCd");
		list.add("trnFdSrcCd");
		list.add("fdOwpeYn");
		list.add("fncTrnAimTxt");
		list.add("trnFdSrcCdTxt");
		list.add("ckbilKdcd");
		list.add("cacGramRcvYn");
		list.add("cacGramRcvCrtdIsuYn");
		list.add("cacGramRcvAm");
		list.add("cacGramTrfAm");
		list.add("cacGramBchkAm");
		list.add("feeRcvYn");
		list.add("feeCshtfDscd");
		list.add("rctsOupYn");
		list.add("feeAm");
		list.add("wdrAcno");
		list.add("encyWdrActPwno");
		list.add("xprRcvAcno");
		list.add("irprmTgt1Dscd");
		list.add("irprmTgt2Dscd");
		list.add("irprmTgt3Dscd");
		list.add("irprmTgt4Dscd");
		list.add("irprmTgt5Dscd");
		list.add("irprmTgt6Dscd");
		list.add("xprPrcMecd");
		list.add("dntnAtsAcno");
		list.add("newFdDscd");
		list.add("spcfMonyTrtAcno");
		list.add("pnsnPayTemEstYn");
		list.add("pnsnPayCtrtmYcnt");
		list.add("pnsnPayCycd");
		list.add("lnoActPbokIssuYn");
		list.add("bscAcno");
		list.add("oldAtrbXtRncd");
		list.add("cpblChckTgtYn");
		list.add("rpcmDpstTgtYn");
		list.add("oldAtrbCeoRgsrDrtrYn");
		list.add("oldAtrbApvNo");
		list.add("rdepAcno");
		list.add("oldAtrbApvRsn");
		list.add("oldAtrbChckTim");
		list.add("ccadRsltInqYn");
		list.add("tbkCcadHldgYn");
		list.add("cadStlActTbkYn");
		list.add("ccadBasRsltAm");
		list.add("utzRsltBasStaDt");
		list.add("utzRsltBasEndDt");
		list.add("utzRsltInqTim");
		list.add("amfRispeDis");
		list.add("amfRispeFnm");
		list.add("amfRispeRrno");
		list.add("amfRispeCnad");
		list.add("anrvNprcYn");
		list.add("pbamAcno");
		list.add("pbamSnnmAcno");
		list.add("pmnyTrnUnqNo");
		list.add("ctrtmMcn");
		list.add("ctrtmDcnt");
		list.add("xprDt");
		list.add("rcknDt");
		list.add("encyAtsActPwno");
		list.add("atsCycd");
		list.add("atsStaDt");
		list.add("atsEndDt");
		list.add("atsCucd");
		list.add("atsDd");
		list.add("atsMecn");
		list.add("atsAcno");
		list.add("atsAm");
		list.add("tbkSltCopCd");
		list.add("tbkSltCopOfemYn");
		list.add("dntnRqYn");
		list.add("dntnAmDscd");
		list.add("dntnAm");
		list.add("xprCancRcvAcno");
		list.add("bchrCponNo");
		list.add("bchrSupAm");
		list.add("bchrCusPidAm");
		list.add("apvNo");
		list.add("cponCrtfNo");
		list.add("autoRdepYn");
		list.add("insuJnngAgrYn");
		list.add("jnngTgtDscd");
		list.add("ccadHldgYn");
		list.add("frcsDshgDt");
		list.add("cusDgnPrdNm");
		list.add("xcoCd");
		list.add("frndAcno");
		list.add("spdtDgnMm");
		list.add("spdtDgnDd");
		list.add("aplIr");
		list.add("emlFpAcblNtfcRqYn");
		list.add("emlFpAcblNtfcBsdt");
		list.add("fpPrftRtSmsNtfcRqYn");
		list.add("fpPrftRtSmsNtfcBsdt");
		list.add("goalPrSmsRqYn");
		list.add("goalPr");
		list.add("alwPr");
		list.add("gBnkgGoalPrftRtDscd");
		list.add("gBnkgAlwLossDscd");
		list.add("fcPsklUseYn");
		list.add("xrtTsTycd");
		list.add("xrtMaxAcldAm");
		list.add("dgnXrtNtfcSrvcDscd");
		list.add("ntfcSrvcDgnXrt");
		list.add("ovtbCdno");
		list.add("fmbkCoNo");
		list.add("atrnDscd");
		list.add("rvactNo");
		list.add("irRotCycd");
		list.add("fcfndInfwDscd");
		list.add("fcDpsAccDscd");
		list.add("fornXchStttCrtcSbmtDis");
		list.add("fxRapRncd");
		list.add("payRncdCfcd");
		list.add("hsCd");
		list.add("ivpeId");
		list.add("secrComNm");
		list.add("fcApvCd");
		list.add("pnsnAcldCtrYcnt");
		list.add("pnsnAcldCtrMcn");
		list.add("pnsnRcveBgnDt");
		list.add("prftRtRptdSndDscd");
		list.add("rprhLnkNewYn");
		list.add("rprhLnkCancAcno");
		list.add("rprhLnkTamNewYn");
		list.add("afepAddPidYn");
		list.add("fndPdcd");
		list.add("fndScntRqdcNprtYn");
		list.add("opgPtsNtcSndDscd");
		list.add("gBnkgGoalPrftRtPsnb");
		list.add("gBnkgGoalPrftRtDcml");
		list.add("gBnkgAlwLossRtPsnb");
		list.add("gBnkgAlwLossRtDcml");
		list.add("wooriOnwlMoAcno");
		list.add("bznUseActYn");
		list.add("agnpeItcsno");
		list.add("rppeItcsno");
		list.add("atsNaNtfcRqYn");
		list.add("acldFndTsXprNtfcRqYn");
		list.add("fwxcAcno");
		list.add("fndCnvrTmntAcno");
		list.add("dvdamRinvDscd");
		list.add("fndCnvrNewYn");
		list.add("lonXprAdvnYn");
		list.add("lnApvCmplYn");
		list.add("priPrpeBrNm");
		list.add("grnTrno");
		list.add("escrUnmrNo");
		list.add("priPrpeAcno");
		list.add("prpeAcno");
		list.add("priPrpeBzpeNo");
		list.add("prpeBzpeNo");
		list.add("ppmtAmRcveAcno");
		list.add("orcpPrpeCsno");
		list.add("pftPrpeCsno");
		list.add("orcpPrpeNrsrCollYn");
		list.add("pftPrpeNrsrCollYn");
		list.add("pocpPfeAm");
		list.add("etfTprt");
		list.add("opgOrdsTxt");
		list.add("sa1Txt");
		list.add("sa2Txt");
		list.add("sa3Txt");
		list.add("sptxYn");
		list.add("nnmCsno");
		list.add("fndItmsCd");
		list.add("dpsRcvAm");
		list.add("trfAm");
		list.add("bchkAm");
		list.add("bchkInqmAm");
		list.add("inqmScnt");
		list.add("inqmFeeXmpDis");
		list.add("tamTrfYn");
		list.add("pxrt");
		list.add("krwTrfAm");
		list.add("cucd");
		list.add("ioffSbDscd");
		list.add("cshtfDscd");
		list.add("cshFeeLevyDscd");
		list.add("cshFee");
		list.add("tgtKrwAm");
		list.add("fcTrfAm");
		list.add("fcCshRcvAm");
		list.add("coinAm");
		list.add("krfd");
		list.add("apxrt");
		list.add("cusPrmeXrt");
		list.add("ioffSbRt");
		list.add("fwxcCtrMcnt");
		list.add("newAcno");
		list.add("ksdFndNo");
		list.add("rtpenTrnDisNo");
		list.add("rcmGoalAm");
		list.add("jnngCtgrCd");
		list.add("rcpMdKdcd");
		list.add("hsscMajTxtPbokPrngYn");
		list.add("prdDesOupYn");
		list.add("acicJnngYn");
		list.add("hsscNewDscd");
		list.add("hsscRgslZpno");
		list.add("hsscInddRgsYn");
		list.add("hsscHopeRgnZpno");
		list.add("hopeHousKdDscd");
		list.add("housXuseSqmDscd");
		list.add("hopeMovinYm");
		list.add("esnsNewRgsDt");
		list.add("esnsNewRgsTm");
		list.add("esnsNewEbnkUtzpeNo");
		list.add("atsKdcd");
		list.add("lnoActOpngRncd");
		list.add("scanInfAcnmCnfDscd");
		list.add("agnpeTrnYn");
		list.add("dpsPwnoRgsDscd");
		list.add("prrRgsPwnoKeyCnf");
		list.add("encyActPwnoCnf");
		list.add("wdcPbokYn");
		list.add("wooriLovPlsDntnAscnDscd");
		list.add("sameRqdcSrno");
		list.add("etcDeedDscd");
		list.add("actApvNo");
		list.add("fndRblnNewYn");
		list.add("bgnnRcvWdrYn");
		list.add("copItcsno");
		list.add("inbkNewYn");
		list.add("smrtBnkgNewYn");
		list.add("tlbnkNewYn");
		list.add("ntsvcRgsYn");
		list.add("inbkWdrActRgsYn");
		list.add("inetBnkgUserId");
		list.add("ebnkPwno");
		list.add("engNm");
		list.add("tms1TsLmtAm");
		list.add("d1TsLmtAm");
		list.add("secrdSrno");
		list.add("otpcSrno");
		list.add("otpPwd");
		list.add("otpIsuCostXmpDscd");
		list.add("datDpsTelNo");
		list.add("synpbDscd");
		list.add("inetBnkgRcpSrno");
		list.add("inbkRsvRgbrCd");
		list.add("inbkRsvRgsDt");
		list.add("inbkRsvRgsSrno");
		list.add("smrtBnkgInetBnkgId");
		list.add("smrtBnkgHpComCd");
		list.add("smrtBnkgHpTlenNo");
		list.add("smrtBnkgHpSrno");
		list.add("tlbnkSecrdSrno");
		list.add("encyEbnkPwno");
		list.add("tlbnkD1TsLmt");
		list.add("tlbnkTms1TsLmt");
		list.add("ntsvcRawDscd");
		list.add("ntsvcBalNtyMarkYn");
		list.add("ntsvcHpComCd");
		list.add("ntsvcHpTlenNo");
		list.add("ntsvcHpSrno");
		list.add("ntsvcInotAm");
		list.add("astPrtsNtcYn");
		list.add("ntsvcTmsStaTim");
		list.add("ntsvcTmsEndTim");
		list.add("wdrActRgsInetBnkgId");
		list.add("ebnkWdrActCnccRgsYn");
		list.add("tlbnkWdrActCnccRgsYn");
		list.add("hswfPbokDocSndYn");
		list.add("faOwacCsno");
		list.add("flieRgsYn");
		list.add("atsYn");
		list.add("hmnyUsgAm");
		list.add("etcAcno");
		list.add("trtpyRtPsnb");
		list.add("trtpyRtDcml");
		list.add("fltIrNtcDscd");
		list.add("etpCoplsDpstNewYn");
		list.add("atsXtYn");
		list.add("spslPdcd");
		list.add("trtPocpPfeRtPsnb");
		list.add("trtPocpPfeRtDcml");
		list.add("trtDfanPfeRtPsnb");
		list.add("trtDfanPfeRtDcml");
		list.add("cponInpDscd");
		list.add("agmIrtPsnb");
		list.add("agmIrtDcml");
		list.add("pbokOtln");
		list.add("ascnBlgCd");
		list.add("acldCrtdSndDscd");
		list.add("isaMajSbjPbokPrngYn");
		list.add("isaNewDscd");
		list.add("isaJnngDscd");
		list.add("jnngAdvpeEno");
		list.add("extxDscd");
		list.add("dtjnTemDscd");
		list.add("mndDocCollYn");
		list.add("enmtDt");
		list.add("dshgDt");
		list.add("ctrmvIscd");
		list.add("rtrtInsuCnvrAm");
		list.add("aldJnpeTycd");
		list.add("fstJnngDt");
		list.add("tfrAcno");
		list.add("planNo");
		list.add("brdmKdcd");
		list.add("scdOrdsMngNo");
		list.add("rtpenCobdnAm");
		list.add("rtpenPbdnAm");
		list.add("opgMngFee");
		list.add("asetMngFee");
		list.add("stlAcno");
		list.add("encyStlActPwno");
		list.add("afepAddPidDscd");
		list.add("rprhLnkNewDscd");
		list.add("cancRsvFndAcno");
		list.add("rprhAmTamNewDscd");
		list.add("xcoPrmeIrt");
		list.add("fndGoalPrftRtPsnb");
		list.add("fndGoalPrftRtDcml");
		list.add("srvcRqAm");
		list.add("fndAcblNtcDis");
		list.add("fndAcblNtfcBasDd");
		list.add("fndPrftRtSmsChrRqDscd");
		list.add("fndSmsRqTprtPsnb");
		list.add("fndSmsRqTprtDcml");
		list.add("fndSmsRqTprtDscd");
		list.add("fndSmsRqLossAwrtPsnb");
		list.add("fndSmsRqLossAwrtDcml");
		list.add("fndSmsRqLossAwrtDscd");
		list.add("fndFpPrftRtSmsChrRqDscd");
		list.add("fndFpPrftRtSmsChrRqDtDscd");
		list.add("scntRqdcPrngOmitYn");
		list.add("oldAtrbChckHisSrno");
		list.add("newVstrMngNo");
		list.add("payVstrMngNo");
		list.add("spotTfrRtpenPrdNo");
		list.add("rtttIscd");
		list.add("spotTfrRtpenPlanDscd");
		list.add("intRcvFcAcno");
		list.add("pbdeedPrngYn");
		list.add("dgnXrtPsnb");
		list.add("dgnXrtDcml");
		list.add("mkshMbhYn");
		list.add("asstmPbokDscd");
		list.add("wbbtJnngHpNo");
		list.add("prdOpgDscd");
		list.add("newInqYn");
		list.add("pwnoNuseYn");
		list.add("bchrInqTim");
		list.add("bchrNewAvlYn");
		list.add("prdMajTxtPbokPrngYn");
		list.add("apirtPsnb");
		list.add("apirtDcml");
		list.add("hqapNo");
		list.add("acnmCsno");
		list.add("fcbdNewYn");
		list.add("irKdcd");
		list.add("efctPrftRtPsnb");
		list.add("efctPrftRtDcml");
		list.add("vrBilNewDscd");
		list.add("istIvpeBatNewTrnDscd");
		list.add("dppeCsno");
		list.add("dppeActIdfNo");
		list.add("dpsBatNewBzcd");
		list.add("ascnNewRprsAcno");
		list.add("ascnNewRprsActYn");
		list.add("pbamActAcctYy");
		list.add("pmnySnnmActAcctYy");
		list.add("hsscOwhmAdrKdcd");
		list.add("hsscOwhmBldMngNo");
		list.add("hsscOwhmPostSrno");
		list.add("hsscOwhmStdoNo");
		list.add("agmtCoCd");
		list.add("wooriHopeDremJnngTgtDscd");
		list.add("asetMngIscd");
		list.add("rpbdDscd");
		list.add("cctnAcno");
		list.add("npbdSbsrRqYn");
		list.add("npbdItmsCd");
		list.add("bndKdDis");
		list.add("tunMmHo");
		list.add("hdgTgtYn");
		list.add("idCadNhssDscd");
		list.add("fndPlsOpgDscd");
		list.add("grnInsuKey");
		list.add("preIntRcvDscd");
		list.add("preIntRcvAcno");
		list.add("dpsRcmNo");
		list.add("sldrAldCn");
		list.add("dlpmPbokGenRgsYn");
		list.add("smrtMchrMdlInf");
		list.add("wibeeRcvRgsYn");
		list.add("wibeeTsAcno");
		list.add("wibeePushRgsYn");
		list.add("atsKrwTsAcno");
		list.add("irngBrcd");
		list.add("krwFmbkFxpdYn");
		list.add("krwSscoFmbkFxpdYn");
		list.add("hopeHousXuseSqmDscd");
		list.add("rrrgMvinDt");
		list.add("dppeUnqNo");
		list.add("dppeItmsNo");
		list.add("cshbAtsAcno");
		list.add("cusDntnAscnCd");
		list.add("cusBrdnCnrnRt");
		list.add("dinsvGoalAm");
		list.add("txprInqYn");
		list.add("frno");
		list.add("acnmRgsCd");
		list.add("coaOmitYn");
		list.add("wbbmLnkNewYn");
		list.add("wbbtRcmRgsHpNo");
		list.add("smrtLnJnngYn");
		list.add("dinsvDscd");
		list.add("aucId");
		list.add("gmktId");
		list.add("wbbmId");
		list.add("dniAcnmCnfNewDscd");
		list.add("dniRcvAm");
		list.add("dniHpNo");
		list.add("dniPtnAcno");
		list.add("dniPtnNewAcno");
		list.add("dniPtnbkCd");
		list.add("rjnngAcno");
		list.add("insvAcldPlanKdcd");
		list.add("insvAcldFstTsAm");
		list.add("insvAcldTsStaWkdDscd");
		list.add("insvAcldTsStaDt");
		list.add("insvAcldPlanChcYn");
		list.add("insvAcldPlanLifeAm");
		list.add("pidMecd");
		list.add("selcMvbDtlsIdfCd");
		list.add("ptnBkwAcno");
		list.add("ptnSelcIscd");
		list.add("fndslcMvbCfdocIsuDt");
		list.add("taxTycd");
		list.add("rprhAfImnwYn");
		list.add("elfSelfDgnsYn");
		list.add("wmsPrtfDis");
		list.add("ptnIstCnfYn");
		list.add("ivsdesSrno");
		list.add("fndSvvlAcuCn");
		list.add("cusPrtfRgsNo");
		list.add("rcpDtm");
		list.add("pnsfndAcno");
		list.add("mmfFndAcno");
		list.add("pnsfndNewYn");
		list.add("frstNwactNo");
		list.add("scndNwactNo");
		list.add("fndOpngDt");
		list.add("krwSscoNewTlmNo");
		list.add("atsDtlDscd");
		list.add("atsRcvLmtAm");
		list.add("krwFmbkMmdaYn");
		list.add("opgOrdsMngNo");
		list.add("spcfPrdMoAcno");
		list.add("restTxprLmtAm");
		list.add("dppeAcno");
		list.add("pmnyIdeedYn");
		list.add("tdyCancAcno");
		list.add("cbrseNewYn");
		list.add("fmbkNewCitAtsCancYn");
		list.add("cnstDdctFxpdGrnYr5OverYn");
		list.add("aprrBrdmCd");
		list.add("cmpnOv1peYn");
		list.add("pnsfndCoreOupYn");
		list.add("rtpenPlanAplDt");
		list.add("rtpenPlanItcsno");
		list.add("glblBnkgJnngYn");
		list.add("idCadNewDscd");
		list.add("encyEbnkPwnoCnf");
		list.add("tlbnkPwnoCnf");
		list.add("gridRowCnt");
		list.add("grid");
		list.add("gridRowCnt2");
		list.add("grid2");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("sqcNmTrnCfdocCollYn", get("sqcNmTrnCfdocCollYn"));
		map.put("dpsNewDscd", get("dpsNewDscd"));
		map.put("dpsRsvNewDscd", get("dpsRsvNewDscd"));
		map.put("encyActPwno", get("encyActPwno"));
		map.put("sealSignUsgDscd", get("sealSignUsgDscd"));
		map.put("pdcd", get("pdcd"));
		map.put("csno", get("csno"));
		map.put("cusDgnAcno", get("cusDgnAcno"));
		map.put("prrRgsPwnoKey", get("prrRgsPwnoKey"));
		map.put("smsdDscd", get("smsdDscd"));
		map.put("psnInfExpsCnfYn", get("psnInfExpsCnfYn"));
		map.put("scanUablRncd", get("scanUablRncd"));
		map.put("psnInfAgmdMngNo", get("psnInfAgmdMngNo"));
		map.put("acnmCnfEno", get("acnmCnfEno"));
		map.put("advpeEno", get("advpeEno"));
		map.put("idcrDscd", get("idcrDscd"));
		map.put("idcrFnm", get("idcrFnm"));
		map.put("idcrEncyRsdlNo", get("idcrEncyRsdlNo"));
		map.put("idcrIsuDt", get("idcrIsuDt"));
		map.put("idcrImgKey", get("idcrImgKey"));
		map.put("idcrCnfShap", get("idcrCnfShap"));
		map.put("idcrRuseYn", get("idcrRuseYn"));
		map.put("idcrAgnpeTrnYn", get("idcrAgnpeTrnYn"));
		map.put("appRgsDscd", get("appRgsDscd"));
		map.put("appRgsBrcd", get("appRgsBrcd"));
		map.put("appRgsDt", get("appRgsDt"));
		map.put("appRgsSrno", get("appRgsSrno"));
		map.put("wmsLnkYn", get("wmsLnkYn"));
		map.put("snthAsetMngCsno", get("snthAsetMngCsno"));
		map.put("snthAsetMngDesgnPrdCnt", get("snthAsetMngDesgnPrdCnt"));
		map.put("snthAsetMngAltrIvstWgt", get("snthAsetMngAltrIvstWgt"));
		map.put("snthAsetMngBksWgt", get("snthAsetMngBksWgt"));
		map.put("snthAsetMngFrgBndWgt", get("snthAsetMngFrgBndWgt"));
		map.put("snthAsetMngFrgStcWgt", get("snthAsetMngFrgStcWgt"));
		map.put("snthAsetMngPdcd", get("snthAsetMngPdcd"));
		map.put("appRgsPwno", get("appRgsPwno"));
		map.put("appRgsAtsAcno", get("appRgsAtsAcno"));
		map.put("wmLnkTrnSrno", get("wmLnkTrnSrno"));
		map.put("snthAsetMngDeedCd", get("snthAsetMngDeedCd"));
		map.put("snthAsetMngFlwWgt", get("snthAsetMngFlwWgt"));
		map.put("snthAsetMngDomStcWgt", get("snthAsetMngDomStcWgt"));
		map.put("snthAsetMngDomBndWgt", get("snthAsetMngDomBndWgt"));
		map.put("prdStbyAnlsSrno", get("prdStbyAnlsSrno"));
		map.put("inlnAnlsSrno", get("inlnAnlsSrno"));
		map.put("asetIstMngNo", get("asetIstMngNo"));
		map.put("rtpenPlanOrgPdcd", get("rtpenPlanOrgPdcd"));
		map.put("jnpeTycd", get("jnpeTycd"));
		map.put("fndSgpFpCnslSrvcDscd", get("fndSgpFpCnslSrvcDscd"));
		map.put("rsdlBzpeNo", get("rsdlBzpeNo"));
		map.put("frnrLstVldTem", get("frnrLstVldTem"));
		map.put("inetRsvRcpDscd", get("inetRsvRcpDscd"));
		map.put("inetRsvIdfNo", get("inetRsvIdfNo"));
		map.put("inetRsvNo", get("inetRsvNo"));
		map.put("inetRsvCusPureNewYn", get("inetRsvCusPureNewYn"));
		map.put("synpbPdcd", get("synpbPdcd"));
		map.put("actUsgAimDis", get("actUsgAimDis"));
		map.put("frnrEmptEduYn", get("frnrEmptEduYn"));
		map.put("fncTrnAimCollDis", get("fncTrnAimCollDis"));
		map.put("lnoActOpngRsn", get("lnoActOpngRsn"));
		map.put("depaCrdcCollYn", get("depaCrdcCollYn"));
		map.put("idCadIsuRqdcUsgYn", get("idCadIsuRqdcUsgYn"));
		map.put("rcvVcrMlsChidYn", get("rcvVcrMlsChidYn"));
		map.put("saltsScdDd", get("saltsScdDd"));
		map.put("atmWdrDscd", get("atmWdrDscd"));
		map.put("cctnTrnKdcd", get("cctnTrnKdcd"));
		map.put("idCadIsuYn", get("idCadIsuYn"));
		map.put("ptnrPrmeIr1Yn", get("ptnrPrmeIr1Yn"));
		map.put("ptnrPrmeIr2Yn", get("ptnrPrmeIr2Yn"));
		map.put("ptnrPrmeIr3Yn", get("ptnrPrmeIr3Yn"));
		map.put("ptnrPrmeIr4Yn", get("ptnrPrmeIr4Yn"));
		map.put("ascnPbokNm", get("ascnPbokNm"));
		map.put("rcvpeNm", get("rcvpeNm"));
		map.put("rcvDd", get("rcvDd"));
		map.put("dntnAtsEndDt", get("dntnAtsEndDt"));
		map.put("patnAscnAcno", get("patnAscnAcno"));
		map.put("patnAscnNm", get("patnAscnNm"));
		map.put("aimFdNm", get("aimFdNm"));
		map.put("patnAscnDis", get("patnAscnDis"));
		map.put("patnHpNo", get("patnHpNo"));
		map.put("chilRrno", get("chilRrno"));
		map.put("dntnInfOfrAgrYn", get("dntnInfOfrAgrYn"));
		map.put("dntnlCd", get("dntnlCd"));
		map.put("clsaAtsRqYn", get("clsaAtsRqYn"));
		map.put("clsaAtsPmnyAcno", get("clsaAtsPmnyAcno"));
		map.put("clsaAtsEndDt", get("clsaAtsEndDt"));
		map.put("fncTaxtSmsRqYn", get("fncTaxtSmsRqYn"));
		map.put("wfFclUnqNo", get("wfFclUnqNo"));
		map.put("locaPrmeYn", get("locaPrmeYn"));
		map.put("afiBzcd", get("afiBzcd"));
		map.put("emlNtcSrvcYn", get("emlNtcSrvcYn"));
		map.put("fmbkCtrdCollYn", get("fmbkCtrdCollYn"));
		map.put("adrpRgsYn", get("adrpRgsYn"));
		map.put("mbhYn", get("mbhYn"));
		map.put("psnInfAgrYn", get("psnInfAgrYn"));
		map.put("datAcldHpNo", get("datAcldHpNo"));
		map.put("dpsBatRqsNo", get("dpsBatRqsNo"));
		map.put("dpsBatRqsSrno", get("dpsBatRqsSrno"));
		map.put("agnpeEncyRrno", get("agnpeEncyRrno"));
		map.put("agnpeFnm", get("agnpeFnm"));
		map.put("rppeDupOmitYn", get("rppeDupOmitYn"));
		map.put("rppeAgnpeAcrdYn", get("rppeAgnpeAcrdYn"));
		map.put("rppeFnm", get("rppeFnm"));
		map.put("rppeEncyRrno", get("rppeEncyRrno"));
		map.put("agnpeDupYn", get("agnpeDupYn"));
		map.put("rppeDupYn", get("rppeDupYn"));
		map.put("itpyMecd", get("itpyMecd"));
		map.put("itpyCycd", get("itpyCycd"));
		map.put("nextItpyDt", get("nextItpyDt"));
		map.put("actMngBrcd", get("actMngBrcd"));
		map.put("asscNmnlDpstYn", get("asscNmnlDpstYn"));
		map.put("netrApvNo", get("netrApvNo"));
		map.put("mbpbkJnngYn", get("mbpbkJnngYn"));
		map.put("mblPbokInetBnkgId", get("mblPbokInetBnkgId"));
		map.put("npbokIccadIsuDis", get("npbokIccadIsuDis"));
		map.put("ideedCd", get("ideedCd"));
		map.put("pbokEngPrngYn", get("pbokEngPrngYn"));
		map.put("nlDscd", get("nlDscd"));
		map.put("dpsDeedNo", get("dpsDeedNo"));
		map.put("pbokIssuYn", get("pbokIssuYn"));
		map.put("prdGdncPbokPrngYn", get("prdGdncPbokPrngYn"));
		map.put("nrsrCnfDocCollYn", get("nrsrCnfDocCollYn"));
		map.put("bokStttPermXtYn", get("bokStttPermXtYn"));
		map.put("nrsrPwnoRgsYn", get("nrsrPwnoRgsYn"));
		map.put("nrsrAccCd", get("nrsrAccCd"));
		map.put("krwDpsAccDscd", get("krwDpsAccDscd"));
		map.put("nrsrKrwInfwDscd", get("nrsrKrwInfwDscd"));
		map.put("txprDscd", get("txprDscd"));
		map.put("txprLmtAm", get("txprLmtAm"));
		map.put("prchAm", get("prchAm"));
		map.put("pmbilAm", get("pmbilAm"));
		map.put("cackAm", get("cackAm"));
		map.put("bokBchkAm", get("bokBchkAm"));
		map.put("etcDeedAm", get("etcDeedAm"));
		map.put("fncTrnAimCd", get("fncTrnAimCd"));
		map.put("trnFdSrcCd", get("trnFdSrcCd"));
		map.put("fdOwpeYn", get("fdOwpeYn"));
		map.put("fncTrnAimTxt", get("fncTrnAimTxt"));
		map.put("trnFdSrcCdTxt", get("trnFdSrcCdTxt"));
		map.put("ckbilKdcd", get("ckbilKdcd"));
		map.put("cacGramRcvYn", get("cacGramRcvYn"));
		map.put("cacGramRcvCrtdIsuYn", get("cacGramRcvCrtdIsuYn"));
		map.put("cacGramRcvAm", get("cacGramRcvAm"));
		map.put("cacGramTrfAm", get("cacGramTrfAm"));
		map.put("cacGramBchkAm", get("cacGramBchkAm"));
		map.put("feeRcvYn", get("feeRcvYn"));
		map.put("feeCshtfDscd", get("feeCshtfDscd"));
		map.put("rctsOupYn", get("rctsOupYn"));
		map.put("feeAm", get("feeAm"));
		map.put("wdrAcno", get("wdrAcno"));
		map.put("encyWdrActPwno", get("encyWdrActPwno"));
		map.put("xprRcvAcno", get("xprRcvAcno"));
		map.put("irprmTgt1Dscd", get("irprmTgt1Dscd"));
		map.put("irprmTgt2Dscd", get("irprmTgt2Dscd"));
		map.put("irprmTgt3Dscd", get("irprmTgt3Dscd"));
		map.put("irprmTgt4Dscd", get("irprmTgt4Dscd"));
		map.put("irprmTgt5Dscd", get("irprmTgt5Dscd"));
		map.put("irprmTgt6Dscd", get("irprmTgt6Dscd"));
		map.put("xprPrcMecd", get("xprPrcMecd"));
		map.put("dntnAtsAcno", get("dntnAtsAcno"));
		map.put("newFdDscd", get("newFdDscd"));
		map.put("spcfMonyTrtAcno", get("spcfMonyTrtAcno"));
		map.put("pnsnPayTemEstYn", get("pnsnPayTemEstYn"));
		map.put("pnsnPayCtrtmYcnt", get("pnsnPayCtrtmYcnt"));
		map.put("pnsnPayCycd", get("pnsnPayCycd"));
		map.put("lnoActPbokIssuYn", get("lnoActPbokIssuYn"));
		map.put("bscAcno", get("bscAcno"));
		map.put("oldAtrbXtRncd", get("oldAtrbXtRncd"));
		map.put("cpblChckTgtYn", get("cpblChckTgtYn"));
		map.put("rpcmDpstTgtYn", get("rpcmDpstTgtYn"));
		map.put("oldAtrbCeoRgsrDrtrYn", get("oldAtrbCeoRgsrDrtrYn"));
		map.put("oldAtrbApvNo", get("oldAtrbApvNo"));
		map.put("rdepAcno", get("rdepAcno"));
		map.put("oldAtrbApvRsn", get("oldAtrbApvRsn"));
		map.put("oldAtrbChckTim", get("oldAtrbChckTim"));
		map.put("ccadRsltInqYn", get("ccadRsltInqYn"));
		map.put("tbkCcadHldgYn", get("tbkCcadHldgYn"));
		map.put("cadStlActTbkYn", get("cadStlActTbkYn"));
		map.put("ccadBasRsltAm", get("ccadBasRsltAm"));
		map.put("utzRsltBasStaDt", get("utzRsltBasStaDt"));
		map.put("utzRsltBasEndDt", get("utzRsltBasEndDt"));
		map.put("utzRsltInqTim", get("utzRsltInqTim"));
		map.put("amfRispeDis", get("amfRispeDis"));
		map.put("amfRispeFnm", get("amfRispeFnm"));
		map.put("amfRispeRrno", get("amfRispeRrno"));
		map.put("amfRispeCnad", get("amfRispeCnad"));
		map.put("anrvNprcYn", get("anrvNprcYn"));
		map.put("pbamAcno", get("pbamAcno"));
		map.put("pbamSnnmAcno", get("pbamSnnmAcno"));
		map.put("pmnyTrnUnqNo", get("pmnyTrnUnqNo"));
		map.put("ctrtmMcn", get("ctrtmMcn"));
		map.put("ctrtmDcnt", get("ctrtmDcnt"));
		map.put("xprDt", get("xprDt"));
		map.put("rcknDt", get("rcknDt"));
		map.put("encyAtsActPwno", get("encyAtsActPwno"));
		map.put("atsCycd", get("atsCycd"));
		map.put("atsStaDt", get("atsStaDt"));
		map.put("atsEndDt", get("atsEndDt"));
		map.put("atsCucd", get("atsCucd"));
		map.put("atsDd", get("atsDd"));
		map.put("atsMecn", get("atsMecn"));
		map.put("atsAcno", get("atsAcno"));
		map.put("atsAm", get("atsAm"));
		map.put("tbkSltCopCd", get("tbkSltCopCd"));
		map.put("tbkSltCopOfemYn", get("tbkSltCopOfemYn"));
		map.put("dntnRqYn", get("dntnRqYn"));
		map.put("dntnAmDscd", get("dntnAmDscd"));
		map.put("dntnAm", get("dntnAm"));
		map.put("xprCancRcvAcno", get("xprCancRcvAcno"));
		map.put("bchrCponNo", get("bchrCponNo"));
		map.put("bchrSupAm", get("bchrSupAm"));
		map.put("bchrCusPidAm", get("bchrCusPidAm"));
		map.put("apvNo", get("apvNo"));
		map.put("cponCrtfNo", get("cponCrtfNo"));
		map.put("autoRdepYn", get("autoRdepYn"));
		map.put("insuJnngAgrYn", get("insuJnngAgrYn"));
		map.put("jnngTgtDscd", get("jnngTgtDscd"));
		map.put("ccadHldgYn", get("ccadHldgYn"));
		map.put("frcsDshgDt", get("frcsDshgDt"));
		map.put("cusDgnPrdNm", get("cusDgnPrdNm"));
		map.put("xcoCd", get("xcoCd"));
		map.put("frndAcno", get("frndAcno"));
		map.put("spdtDgnMm", get("spdtDgnMm"));
		map.put("spdtDgnDd", get("spdtDgnDd"));
		map.put("aplIr", get("aplIr"));
		map.put("emlFpAcblNtfcRqYn", get("emlFpAcblNtfcRqYn"));
		map.put("emlFpAcblNtfcBsdt", get("emlFpAcblNtfcBsdt"));
		map.put("fpPrftRtSmsNtfcRqYn", get("fpPrftRtSmsNtfcRqYn"));
		map.put("fpPrftRtSmsNtfcBsdt", get("fpPrftRtSmsNtfcBsdt"));
		map.put("goalPrSmsRqYn", get("goalPrSmsRqYn"));
		map.put("goalPr", get("goalPr"));
		map.put("alwPr", get("alwPr"));
		map.put("gBnkgGoalPrftRtDscd", get("gBnkgGoalPrftRtDscd"));
		map.put("gBnkgAlwLossDscd", get("gBnkgAlwLossDscd"));
		map.put("fcPsklUseYn", get("fcPsklUseYn"));
		map.put("xrtTsTycd", get("xrtTsTycd"));
		map.put("xrtMaxAcldAm", get("xrtMaxAcldAm"));
		map.put("dgnXrtNtfcSrvcDscd", get("dgnXrtNtfcSrvcDscd"));
		map.put("ntfcSrvcDgnXrt", get("ntfcSrvcDgnXrt"));
		map.put("ovtbCdno", get("ovtbCdno"));
		map.put("fmbkCoNo", get("fmbkCoNo"));
		map.put("atrnDscd", get("atrnDscd"));
		map.put("rvactNo", get("rvactNo"));
		map.put("irRotCycd", get("irRotCycd"));
		map.put("fcfndInfwDscd", get("fcfndInfwDscd"));
		map.put("fcDpsAccDscd", get("fcDpsAccDscd"));
		map.put("fornXchStttCrtcSbmtDis", get("fornXchStttCrtcSbmtDis"));
		map.put("fxRapRncd", get("fxRapRncd"));
		map.put("payRncdCfcd", get("payRncdCfcd"));
		map.put("hsCd", get("hsCd"));
		map.put("ivpeId", get("ivpeId"));
		map.put("secrComNm", get("secrComNm"));
		map.put("fcApvCd", get("fcApvCd"));
		map.put("pnsnAcldCtrYcnt", get("pnsnAcldCtrYcnt"));
		map.put("pnsnAcldCtrMcn", get("pnsnAcldCtrMcn"));
		map.put("pnsnRcveBgnDt", get("pnsnRcveBgnDt"));
		map.put("prftRtRptdSndDscd", get("prftRtRptdSndDscd"));
		map.put("rprhLnkNewYn", get("rprhLnkNewYn"));
		map.put("rprhLnkCancAcno", get("rprhLnkCancAcno"));
		map.put("rprhLnkTamNewYn", get("rprhLnkTamNewYn"));
		map.put("afepAddPidYn", get("afepAddPidYn"));
		map.put("fndPdcd", get("fndPdcd"));
		map.put("fndScntRqdcNprtYn", get("fndScntRqdcNprtYn"));
		map.put("opgPtsNtcSndDscd", get("opgPtsNtcSndDscd"));
		map.put("gBnkgGoalPrftRtPsnb", get("gBnkgGoalPrftRtPsnb"));
		map.put("gBnkgGoalPrftRtDcml", get("gBnkgGoalPrftRtDcml"));
		map.put("gBnkgAlwLossRtPsnb", get("gBnkgAlwLossRtPsnb"));
		map.put("gBnkgAlwLossRtDcml", get("gBnkgAlwLossRtDcml"));
		map.put("wooriOnwlMoAcno", get("wooriOnwlMoAcno"));
		map.put("bznUseActYn", get("bznUseActYn"));
		map.put("agnpeItcsno", get("agnpeItcsno"));
		map.put("rppeItcsno", get("rppeItcsno"));
		map.put("atsNaNtfcRqYn", get("atsNaNtfcRqYn"));
		map.put("acldFndTsXprNtfcRqYn", get("acldFndTsXprNtfcRqYn"));
		map.put("fwxcAcno", get("fwxcAcno"));
		map.put("fndCnvrTmntAcno", get("fndCnvrTmntAcno"));
		map.put("dvdamRinvDscd", get("dvdamRinvDscd"));
		map.put("fndCnvrNewYn", get("fndCnvrNewYn"));
		map.put("lonXprAdvnYn", get("lonXprAdvnYn"));
		map.put("lnApvCmplYn", get("lnApvCmplYn"));
		map.put("priPrpeBrNm", get("priPrpeBrNm"));
		map.put("grnTrno", get("grnTrno"));
		map.put("escrUnmrNo", get("escrUnmrNo"));
		map.put("priPrpeAcno", get("priPrpeAcno"));
		map.put("prpeAcno", get("prpeAcno"));
		map.put("priPrpeBzpeNo", get("priPrpeBzpeNo"));
		map.put("prpeBzpeNo", get("prpeBzpeNo"));
		map.put("ppmtAmRcveAcno", get("ppmtAmRcveAcno"));
		map.put("orcpPrpeCsno", get("orcpPrpeCsno"));
		map.put("pftPrpeCsno", get("pftPrpeCsno"));
		map.put("orcpPrpeNrsrCollYn", get("orcpPrpeNrsrCollYn"));
		map.put("pftPrpeNrsrCollYn", get("pftPrpeNrsrCollYn"));
		map.put("pocpPfeAm", get("pocpPfeAm"));
		map.put("etfTprt", get("etfTprt"));
		map.put("opgOrdsTxt", get("opgOrdsTxt"));
		map.put("sa1Txt", get("sa1Txt"));
		map.put("sa2Txt", get("sa2Txt"));
		map.put("sa3Txt", get("sa3Txt"));
		map.put("sptxYn", get("sptxYn"));
		map.put("nnmCsno", get("nnmCsno"));
		map.put("fndItmsCd", get("fndItmsCd"));
		map.put("dpsRcvAm", get("dpsRcvAm"));
		map.put("trfAm", get("trfAm"));
		map.put("bchkAm", get("bchkAm"));
		map.put("bchkInqmAm", get("bchkInqmAm"));
		map.put("inqmScnt", get("inqmScnt"));
		map.put("inqmFeeXmpDis", get("inqmFeeXmpDis"));
		map.put("tamTrfYn", get("tamTrfYn"));
		map.put("pxrt", get("pxrt"));
		map.put("krwTrfAm", get("krwTrfAm"));
		map.put("cucd", get("cucd"));
		map.put("ioffSbDscd", get("ioffSbDscd"));
		map.put("cshtfDscd", get("cshtfDscd"));
		map.put("cshFeeLevyDscd", get("cshFeeLevyDscd"));
		map.put("cshFee", get("cshFee"));
		map.put("tgtKrwAm", get("tgtKrwAm"));
		map.put("fcTrfAm", get("fcTrfAm"));
		map.put("fcCshRcvAm", get("fcCshRcvAm"));
		map.put("coinAm", get("coinAm"));
		map.put("krfd", get("krfd"));
		map.put("apxrt", get("apxrt"));
		map.put("cusPrmeXrt", get("cusPrmeXrt"));
		map.put("ioffSbRt", get("ioffSbRt"));
		map.put("fwxcCtrMcnt", get("fwxcCtrMcnt"));
		map.put("newAcno", get("newAcno"));
		map.put("ksdFndNo", get("ksdFndNo"));
		map.put("rtpenTrnDisNo", get("rtpenTrnDisNo"));
		map.put("rcmGoalAm", get("rcmGoalAm"));
		map.put("jnngCtgrCd", get("jnngCtgrCd"));
		map.put("rcpMdKdcd", get("rcpMdKdcd"));
		map.put("hsscMajTxtPbokPrngYn", get("hsscMajTxtPbokPrngYn"));
		map.put("prdDesOupYn", get("prdDesOupYn"));
		map.put("acicJnngYn", get("acicJnngYn"));
		map.put("hsscNewDscd", get("hsscNewDscd"));
		map.put("hsscRgslZpno", get("hsscRgslZpno"));
		map.put("hsscInddRgsYn", get("hsscInddRgsYn"));
		map.put("hsscHopeRgnZpno", get("hsscHopeRgnZpno"));
		map.put("hopeHousKdDscd", get("hopeHousKdDscd"));
		map.put("housXuseSqmDscd", get("housXuseSqmDscd"));
		map.put("hopeMovinYm", get("hopeMovinYm"));
		map.put("esnsNewRgsDt", get("esnsNewRgsDt"));
		map.put("esnsNewRgsTm", get("esnsNewRgsTm"));
		map.put("esnsNewEbnkUtzpeNo", get("esnsNewEbnkUtzpeNo"));
		map.put("atsKdcd", get("atsKdcd"));
		map.put("lnoActOpngRncd", get("lnoActOpngRncd"));
		map.put("scanInfAcnmCnfDscd", get("scanInfAcnmCnfDscd"));
		map.put("agnpeTrnYn", get("agnpeTrnYn"));
		map.put("dpsPwnoRgsDscd", get("dpsPwnoRgsDscd"));
		map.put("prrRgsPwnoKeyCnf", get("prrRgsPwnoKeyCnf"));
		map.put("encyActPwnoCnf", get("encyActPwnoCnf"));
		map.put("wdcPbokYn", get("wdcPbokYn"));
		map.put("wooriLovPlsDntnAscnDscd", get("wooriLovPlsDntnAscnDscd"));
		map.put("sameRqdcSrno", get("sameRqdcSrno"));
		map.put("etcDeedDscd", get("etcDeedDscd"));
		map.put("actApvNo", get("actApvNo"));
		map.put("fndRblnNewYn", get("fndRblnNewYn"));
		map.put("bgnnRcvWdrYn", get("bgnnRcvWdrYn"));
		map.put("copItcsno", get("copItcsno"));
		map.put("inbkNewYn", get("inbkNewYn"));
		map.put("smrtBnkgNewYn", get("smrtBnkgNewYn"));
		map.put("tlbnkNewYn", get("tlbnkNewYn"));
		map.put("ntsvcRgsYn", get("ntsvcRgsYn"));
		map.put("inbkWdrActRgsYn", get("inbkWdrActRgsYn"));
		map.put("inetBnkgUserId", get("inetBnkgUserId"));
		map.put("ebnkPwno", get("ebnkPwno"));
		map.put("engNm", get("engNm"));
		map.put("tms1TsLmtAm", get("tms1TsLmtAm"));
		map.put("d1TsLmtAm", get("d1TsLmtAm"));
		map.put("secrdSrno", get("secrdSrno"));
		map.put("otpcSrno", get("otpcSrno"));
		map.put("otpPwd", get("otpPwd"));
		map.put("otpIsuCostXmpDscd", get("otpIsuCostXmpDscd"));
		map.put("datDpsTelNo", get("datDpsTelNo"));
		map.put("synpbDscd", get("synpbDscd"));
		map.put("inetBnkgRcpSrno", get("inetBnkgRcpSrno"));
		map.put("inbkRsvRgbrCd", get("inbkRsvRgbrCd"));
		map.put("inbkRsvRgsDt", get("inbkRsvRgsDt"));
		map.put("inbkRsvRgsSrno", get("inbkRsvRgsSrno"));
		map.put("smrtBnkgInetBnkgId", get("smrtBnkgInetBnkgId"));
		map.put("smrtBnkgHpComCd", get("smrtBnkgHpComCd"));
		map.put("smrtBnkgHpTlenNo", get("smrtBnkgHpTlenNo"));
		map.put("smrtBnkgHpSrno", get("smrtBnkgHpSrno"));
		map.put("tlbnkSecrdSrno", get("tlbnkSecrdSrno"));
		map.put("encyEbnkPwno", get("encyEbnkPwno"));
		map.put("tlbnkD1TsLmt", get("tlbnkD1TsLmt"));
		map.put("tlbnkTms1TsLmt", get("tlbnkTms1TsLmt"));
		map.put("ntsvcRawDscd", get("ntsvcRawDscd"));
		map.put("ntsvcBalNtyMarkYn", get("ntsvcBalNtyMarkYn"));
		map.put("ntsvcHpComCd", get("ntsvcHpComCd"));
		map.put("ntsvcHpTlenNo", get("ntsvcHpTlenNo"));
		map.put("ntsvcHpSrno", get("ntsvcHpSrno"));
		map.put("ntsvcInotAm", get("ntsvcInotAm"));
		map.put("astPrtsNtcYn", get("astPrtsNtcYn"));
		map.put("ntsvcTmsStaTim", get("ntsvcTmsStaTim"));
		map.put("ntsvcTmsEndTim", get("ntsvcTmsEndTim"));
		map.put("wdrActRgsInetBnkgId", get("wdrActRgsInetBnkgId"));
		map.put("ebnkWdrActCnccRgsYn", get("ebnkWdrActCnccRgsYn"));
		map.put("tlbnkWdrActCnccRgsYn", get("tlbnkWdrActCnccRgsYn"));
		map.put("hswfPbokDocSndYn", get("hswfPbokDocSndYn"));
		map.put("faOwacCsno", get("faOwacCsno"));
		map.put("flieRgsYn", get("flieRgsYn"));
		map.put("atsYn", get("atsYn"));
		map.put("hmnyUsgAm", get("hmnyUsgAm"));
		map.put("etcAcno", get("etcAcno"));
		map.put("trtpyRtPsnb", get("trtpyRtPsnb"));
		map.put("trtpyRtDcml", get("trtpyRtDcml"));
		map.put("fltIrNtcDscd", get("fltIrNtcDscd"));
		map.put("etpCoplsDpstNewYn", get("etpCoplsDpstNewYn"));
		map.put("atsXtYn", get("atsXtYn"));
		map.put("spslPdcd", get("spslPdcd"));
		map.put("trtPocpPfeRtPsnb", get("trtPocpPfeRtPsnb"));
		map.put("trtPocpPfeRtDcml", get("trtPocpPfeRtDcml"));
		map.put("trtDfanPfeRtPsnb", get("trtDfanPfeRtPsnb"));
		map.put("trtDfanPfeRtDcml", get("trtDfanPfeRtDcml"));
		map.put("cponInpDscd", get("cponInpDscd"));
		map.put("agmIrtPsnb", get("agmIrtPsnb"));
		map.put("agmIrtDcml", get("agmIrtDcml"));
		map.put("pbokOtln", get("pbokOtln"));
		map.put("ascnBlgCd", get("ascnBlgCd"));
		map.put("acldCrtdSndDscd", get("acldCrtdSndDscd"));
		map.put("isaMajSbjPbokPrngYn", get("isaMajSbjPbokPrngYn"));
		map.put("isaNewDscd", get("isaNewDscd"));
		map.put("isaJnngDscd", get("isaJnngDscd"));
		map.put("jnngAdvpeEno", get("jnngAdvpeEno"));
		map.put("extxDscd", get("extxDscd"));
		map.put("dtjnTemDscd", get("dtjnTemDscd"));
		map.put("mndDocCollYn", get("mndDocCollYn"));
		map.put("enmtDt", get("enmtDt"));
		map.put("dshgDt", get("dshgDt"));
		map.put("ctrmvIscd", get("ctrmvIscd"));
		map.put("rtrtInsuCnvrAm", get("rtrtInsuCnvrAm"));
		map.put("aldJnpeTycd", get("aldJnpeTycd"));
		map.put("fstJnngDt", get("fstJnngDt"));
		map.put("tfrAcno", get("tfrAcno"));
		map.put("planNo", get("planNo"));
		map.put("brdmKdcd", get("brdmKdcd"));
		map.put("scdOrdsMngNo", get("scdOrdsMngNo"));
		map.put("rtpenCobdnAm", get("rtpenCobdnAm"));
		map.put("rtpenPbdnAm", get("rtpenPbdnAm"));
		map.put("opgMngFee", get("opgMngFee"));
		map.put("asetMngFee", get("asetMngFee"));
		map.put("stlAcno", get("stlAcno"));
		map.put("encyStlActPwno", get("encyStlActPwno"));
		map.put("afepAddPidDscd", get("afepAddPidDscd"));
		map.put("rprhLnkNewDscd", get("rprhLnkNewDscd"));
		map.put("cancRsvFndAcno", get("cancRsvFndAcno"));
		map.put("rprhAmTamNewDscd", get("rprhAmTamNewDscd"));
		map.put("xcoPrmeIrt", get("xcoPrmeIrt"));
		map.put("fndGoalPrftRtPsnb", get("fndGoalPrftRtPsnb"));
		map.put("fndGoalPrftRtDcml", get("fndGoalPrftRtDcml"));
		map.put("srvcRqAm", get("srvcRqAm"));
		map.put("fndAcblNtcDis", get("fndAcblNtcDis"));
		map.put("fndAcblNtfcBasDd", get("fndAcblNtfcBasDd"));
		map.put("fndPrftRtSmsChrRqDscd", get("fndPrftRtSmsChrRqDscd"));
		map.put("fndSmsRqTprtPsnb", get("fndSmsRqTprtPsnb"));
		map.put("fndSmsRqTprtDcml", get("fndSmsRqTprtDcml"));
		map.put("fndSmsRqTprtDscd", get("fndSmsRqTprtDscd"));
		map.put("fndSmsRqLossAwrtPsnb", get("fndSmsRqLossAwrtPsnb"));
		map.put("fndSmsRqLossAwrtDcml", get("fndSmsRqLossAwrtDcml"));
		map.put("fndSmsRqLossAwrtDscd", get("fndSmsRqLossAwrtDscd"));
		map.put("fndFpPrftRtSmsChrRqDscd", get("fndFpPrftRtSmsChrRqDscd"));
		map.put("fndFpPrftRtSmsChrRqDtDscd", get("fndFpPrftRtSmsChrRqDtDscd"));
		map.put("scntRqdcPrngOmitYn", get("scntRqdcPrngOmitYn"));
		map.put("oldAtrbChckHisSrno", get("oldAtrbChckHisSrno"));
		map.put("newVstrMngNo", get("newVstrMngNo"));
		map.put("payVstrMngNo", get("payVstrMngNo"));
		map.put("spotTfrRtpenPrdNo", get("spotTfrRtpenPrdNo"));
		map.put("rtttIscd", get("rtttIscd"));
		map.put("spotTfrRtpenPlanDscd", get("spotTfrRtpenPlanDscd"));
		map.put("intRcvFcAcno", get("intRcvFcAcno"));
		map.put("pbdeedPrngYn", get("pbdeedPrngYn"));
		map.put("dgnXrtPsnb", get("dgnXrtPsnb"));
		map.put("dgnXrtDcml", get("dgnXrtDcml"));
		map.put("mkshMbhYn", get("mkshMbhYn"));
		map.put("asstmPbokDscd", get("asstmPbokDscd"));
		map.put("wbbtJnngHpNo", get("wbbtJnngHpNo"));
		map.put("prdOpgDscd", get("prdOpgDscd"));
		map.put("newInqYn", get("newInqYn"));
		map.put("pwnoNuseYn", get("pwnoNuseYn"));
		map.put("bchrInqTim", get("bchrInqTim"));
		map.put("bchrNewAvlYn", get("bchrNewAvlYn"));
		map.put("prdMajTxtPbokPrngYn", get("prdMajTxtPbokPrngYn"));
		map.put("apirtPsnb", get("apirtPsnb"));
		map.put("apirtDcml", get("apirtDcml"));
		map.put("hqapNo", get("hqapNo"));
		map.put("acnmCsno", get("acnmCsno"));
		map.put("fcbdNewYn", get("fcbdNewYn"));
		map.put("irKdcd", get("irKdcd"));
		map.put("efctPrftRtPsnb", get("efctPrftRtPsnb"));
		map.put("efctPrftRtDcml", get("efctPrftRtDcml"));
		map.put("vrBilNewDscd", get("vrBilNewDscd"));
		map.put("istIvpeBatNewTrnDscd", get("istIvpeBatNewTrnDscd"));
		map.put("dppeCsno", get("dppeCsno"));
		map.put("dppeActIdfNo", get("dppeActIdfNo"));
		map.put("dpsBatNewBzcd", get("dpsBatNewBzcd"));
		map.put("ascnNewRprsAcno", get("ascnNewRprsAcno"));
		map.put("ascnNewRprsActYn", get("ascnNewRprsActYn"));
		map.put("pbamActAcctYy", get("pbamActAcctYy"));
		map.put("pmnySnnmActAcctYy", get("pmnySnnmActAcctYy"));
		map.put("hsscOwhmAdrKdcd", get("hsscOwhmAdrKdcd"));
		map.put("hsscOwhmBldMngNo", get("hsscOwhmBldMngNo"));
		map.put("hsscOwhmPostSrno", get("hsscOwhmPostSrno"));
		map.put("hsscOwhmStdoNo", get("hsscOwhmStdoNo"));
		map.put("agmtCoCd", get("agmtCoCd"));
		map.put("wooriHopeDremJnngTgtDscd", get("wooriHopeDremJnngTgtDscd"));
		map.put("asetMngIscd", get("asetMngIscd"));
		map.put("rpbdDscd", get("rpbdDscd"));
		map.put("cctnAcno", get("cctnAcno"));
		map.put("npbdSbsrRqYn", get("npbdSbsrRqYn"));
		map.put("npbdItmsCd", get("npbdItmsCd"));
		map.put("bndKdDis", get("bndKdDis"));
		map.put("tunMmHo", get("tunMmHo"));
		map.put("hdgTgtYn", get("hdgTgtYn"));
		map.put("idCadNhssDscd", get("idCadNhssDscd"));
		map.put("fndPlsOpgDscd", get("fndPlsOpgDscd"));
		map.put("grnInsuKey", get("grnInsuKey"));
		map.put("preIntRcvDscd", get("preIntRcvDscd"));
		map.put("preIntRcvAcno", get("preIntRcvAcno"));
		map.put("dpsRcmNo", get("dpsRcmNo"));
		map.put("sldrAldCn", get("sldrAldCn"));
		map.put("dlpmPbokGenRgsYn", get("dlpmPbokGenRgsYn"));
		map.put("smrtMchrMdlInf", get("smrtMchrMdlInf"));
		map.put("wibeeRcvRgsYn", get("wibeeRcvRgsYn"));
		map.put("wibeeTsAcno", get("wibeeTsAcno"));
		map.put("wibeePushRgsYn", get("wibeePushRgsYn"));
		map.put("atsKrwTsAcno", get("atsKrwTsAcno"));
		map.put("irngBrcd", get("irngBrcd"));
		map.put("krwFmbkFxpdYn", get("krwFmbkFxpdYn"));
		map.put("krwSscoFmbkFxpdYn", get("krwSscoFmbkFxpdYn"));
		map.put("hopeHousXuseSqmDscd", get("hopeHousXuseSqmDscd"));
		map.put("rrrgMvinDt", get("rrrgMvinDt"));
		map.put("dppeUnqNo", get("dppeUnqNo"));
		map.put("dppeItmsNo", get("dppeItmsNo"));
		map.put("cshbAtsAcno", get("cshbAtsAcno"));
		map.put("cusDntnAscnCd", get("cusDntnAscnCd"));
		map.put("cusBrdnCnrnRt", get("cusBrdnCnrnRt"));
		map.put("dinsvGoalAm", get("dinsvGoalAm"));
		map.put("txprInqYn", get("txprInqYn"));
		map.put("frno", get("frno"));
		map.put("acnmRgsCd", get("acnmRgsCd"));
		map.put("coaOmitYn", get("coaOmitYn"));
		map.put("wbbmLnkNewYn", get("wbbmLnkNewYn"));
		map.put("wbbtRcmRgsHpNo", get("wbbtRcmRgsHpNo"));
		map.put("smrtLnJnngYn", get("smrtLnJnngYn"));
		map.put("dinsvDscd", get("dinsvDscd"));
		map.put("aucId", get("aucId"));
		map.put("gmktId", get("gmktId"));
		map.put("wbbmId", get("wbbmId"));
		map.put("dniAcnmCnfNewDscd", get("dniAcnmCnfNewDscd"));
		map.put("dniRcvAm", get("dniRcvAm"));
		map.put("dniHpNo", get("dniHpNo"));
		map.put("dniPtnAcno", get("dniPtnAcno"));
		map.put("dniPtnNewAcno", get("dniPtnNewAcno"));
		map.put("dniPtnbkCd", get("dniPtnbkCd"));
		map.put("rjnngAcno", get("rjnngAcno"));
		map.put("insvAcldPlanKdcd", get("insvAcldPlanKdcd"));
		map.put("insvAcldFstTsAm", get("insvAcldFstTsAm"));
		map.put("insvAcldTsStaWkdDscd", get("insvAcldTsStaWkdDscd"));
		map.put("insvAcldTsStaDt", get("insvAcldTsStaDt"));
		map.put("insvAcldPlanChcYn", get("insvAcldPlanChcYn"));
		map.put("insvAcldPlanLifeAm", get("insvAcldPlanLifeAm"));
		map.put("pidMecd", get("pidMecd"));
		map.put("selcMvbDtlsIdfCd", get("selcMvbDtlsIdfCd"));
		map.put("ptnBkwAcno", get("ptnBkwAcno"));
		map.put("ptnSelcIscd", get("ptnSelcIscd"));
		map.put("fndslcMvbCfdocIsuDt", get("fndslcMvbCfdocIsuDt"));
		map.put("taxTycd", get("taxTycd"));
		map.put("rprhAfImnwYn", get("rprhAfImnwYn"));
		map.put("elfSelfDgnsYn", get("elfSelfDgnsYn"));
		map.put("wmsPrtfDis", get("wmsPrtfDis"));
		map.put("ptnIstCnfYn", get("ptnIstCnfYn"));
		map.put("ivsdesSrno", get("ivsdesSrno"));
		map.put("fndSvvlAcuCn", get("fndSvvlAcuCn"));
		map.put("cusPrtfRgsNo", get("cusPrtfRgsNo"));
		map.put("rcpDtm", get("rcpDtm"));
		map.put("pnsfndAcno", get("pnsfndAcno"));
		map.put("mmfFndAcno", get("mmfFndAcno"));
		map.put("pnsfndNewYn", get("pnsfndNewYn"));
		map.put("frstNwactNo", get("frstNwactNo"));
		map.put("scndNwactNo", get("scndNwactNo"));
		map.put("fndOpngDt", get("fndOpngDt"));
		map.put("krwSscoNewTlmNo", get("krwSscoNewTlmNo"));
		map.put("atsDtlDscd", get("atsDtlDscd"));
		map.put("atsRcvLmtAm", get("atsRcvLmtAm"));
		map.put("krwFmbkMmdaYn", get("krwFmbkMmdaYn"));
		map.put("opgOrdsMngNo", get("opgOrdsMngNo"));
		map.put("spcfPrdMoAcno", get("spcfPrdMoAcno"));
		map.put("restTxprLmtAm", get("restTxprLmtAm"));
		map.put("dppeAcno", get("dppeAcno"));
		map.put("pmnyIdeedYn", get("pmnyIdeedYn"));
		map.put("tdyCancAcno", get("tdyCancAcno"));
		map.put("cbrseNewYn", get("cbrseNewYn"));
		map.put("fmbkNewCitAtsCancYn", get("fmbkNewCitAtsCancYn"));
		map.put("cnstDdctFxpdGrnYr5OverYn", get("cnstDdctFxpdGrnYr5OverYn"));
		map.put("aprrBrdmCd", get("aprrBrdmCd"));
		map.put("cmpnOv1peYn", get("cmpnOv1peYn"));
		map.put("pnsfndCoreOupYn", get("pnsfndCoreOupYn"));
		map.put("rtpenPlanAplDt", get("rtpenPlanAplDt"));
		map.put("rtpenPlanItcsno", get("rtpenPlanItcsno"));
		map.put("glblBnkgJnngYn", get("glblBnkgJnngYn"));
		map.put("idCadNewDscd", get("idCadNewDscd"));
		map.put("encyEbnkPwnoCnf", get("encyEbnkPwnoCnf"));
		map.put("tlbnkPwnoCnf", get("tlbnkPwnoCnf"));
		map.put("gridRowCnt", get("gridRowCnt"));
		map.put("grid", get("grid"));
		map.put("gridRowCnt2", get("gridRowCnt2"));
		map.put("grid2", get("grid2"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 672774442:/* sqcNmTrnCfdocCollYn */
			return getSqcNmTrnCfdocCollYn();
		case -973799543:/* dpsNewDscd */
			return getDpsNewDscd();
		case -119599198:/* dpsRsvNewDscd */
			return getDpsRsvNewDscd();
		case 1134290395:/* encyActPwno */
			return getEncyActPwno();
		case 900916127:/* sealSignUsgDscd */
			return getSealSignUsgDscd();
		case 3435861:/* pdcd */
			return getPdcd();
		case 3063345:/* csno */
			return getCsno();
		case -1460883763:/* cusDgnAcno */
			return getCusDgnAcno();
		case -20902071:/* prrRgsPwnoKey */
			return getPrrRgsPwnoKey();
		case -99777029:/* smsdDscd */
			return getSmsdDscd();
		case 1492567300:/* psnInfExpsCnfYn */
			return getPsnInfExpsCnfYn();
		case -2066867664:/* scanUablRncd */
			return getScanUablRncd();
		case 1781700756:/* psnInfAgmdMngNo */
			return getPsnInfAgmdMngNo();
		case -2019195316:/* acnmCnfEno */
			return getAcnmCnfEno();
		case -705281570:/* advpeEno */
			return getAdvpeEno();
		case -190746854:/* idcrDscd */
			return getIdcrDscd();
		case 1656416635:/* idcrFnm */
			return getIdcrFnm();
		case 1664834643:/* idcrEncyRsdlNo */
			return getIdcrEncyRsdlNo();
		case -1613551151:/* idcrIsuDt */
			return getIdcrIsuDt();
		case 1513570054:/* idcrImgKey */
			return getIdcrImgKey();
		case -1326077163:/* idcrCnfShap */
			return getIdcrCnfShap();
		case 1779002676:/* idcrRuseYn */
			return getIdcrRuseYn();
		case 1032390738:/* idcrAgnpeTrnYn */
			return getIdcrAgnpeTrnYn();
		case -2009111091:/* appRgsDscd */
			return getAppRgsDscd();
		case -2009171634:/* appRgsBrcd */
			return getAppRgsBrcd();
		case 1155449965:/* appRgsDt */
			return getAppRgsDt();
		case -2008664835:/* appRgsSrno */
			return getAppRgsSrno();
		case -1739391551:/* wmsLnkYn */
			return getWmsLnkYn();
		case 1698652423:/* snthAsetMngCsno */
			return getSnthAsetMngCsno();
		case 1478303146:/* snthAsetMngDesgnPrdCnt */
			return getSnthAsetMngDesgnPrdCnt();
		case -301352777:/* snthAsetMngAltrIvstWgt */
			return getSnthAsetMngAltrIvstWgt();
		case 281517904:/* snthAsetMngBksWgt */
			return getSnthAsetMngBksWgt();
		case 943356625:/* snthAsetMngFrgBndWgt */
			return getSnthAsetMngFrgBndWgt();
		case 1435563527:/* snthAsetMngFrgStcWgt */
			return getSnthAsetMngFrgStcWgt();
		case 1699024939:/* snthAsetMngPdcd */
			return getSnthAsetMngPdcd();
		case -2008749403:/* appRgsPwno */
			return getAppRgsPwno();
		case -1384324506:/* appRgsAtsAcno */
			return getAppRgsAtsAcno();
		case -1013941699:/* wmLnkTrnSrno */
			return getWmLnkTrnSrno();
		case 332829367:/* snthAsetMngDeedCd */
			return getSnthAsetMngDeedCd();
		case 397077193:/* snthAsetMngFlwWgt */
			return getSnthAsetMngFlwWgt();
		case 852096238:/* snthAsetMngDomStcWgt */
			return getSnthAsetMngDomStcWgt();
		case 359889336:/* snthAsetMngDomBndWgt */
			return getSnthAsetMngDomBndWgt();
		case 2021749582:/* prdStbyAnlsSrno */
			return getPrdStbyAnlsSrno();
		case -1067036805:/* inlnAnlsSrno */
			return getInlnAnlsSrno();
		case -1978854306:/* asetIstMngNo */
			return getAsetIstMngNo();
		case -436679975:/* rtpenPlanOrgPdcd */
			return getRtpenPlanOrgPdcd();
		case -2097145985:/* jnpeTycd */
			return getJnpeTycd();
		case 444511530:/* fndSgpFpCnslSrvcDscd */
			return getFndSgpFpCnslSrvcDscd();
		case -1072415017:/* rsdlBzpeNo */
			return getRsdlBzpeNo();
		case 2012597579:/* frnrLstVldTem */
			return getFrnrLstVldTem();
		case -33279538:/* inetRsvRcpDscd */
			return getInetRsvRcpDscd();
		case -1992681173:/* inetRsvIdfNo */
			return getInetRsvIdfNo();
		case 475261634:/* inetRsvNo */
			return getInetRsvNo();
		case -442126531:/* inetRsvCusPureNewYn */
			return getInetRsvCusPureNewYn();
		case 868429615:/* synpbPdcd */
			return getSynpbPdcd();
		case -764468352:/* actUsgAimDis */
			return getActUsgAimDis();
		case 1480790639:/* frnrEmptEduYn */
			return getFrnrEmptEduYn();
		case 753956338:/* fncTrnAimCollDis */
			return getFncTrnAimCollDis();
		case 72582830:/* lnoActOpngRsn */
			return getLnoActOpngRsn();
		case -1811382847:/* depaCrdcCollYn */
			return getDepaCrdcCollYn();
		case -514618848:/* idCadIsuRqdcUsgYn */
			return getIdCadIsuRqdcUsgYn();
		case -420298135:/* rcvVcrMlsChidYn */
			return getRcvVcrMlsChidYn();
		case 2134578903:/* saltsScdDd */
			return getSaltsScdDd();
		case -1526717925:/* atmWdrDscd */
			return getAtmWdrDscd();
		case 48304400:/* cctnTrnKdcd */
			return getCctnTrnKdcd();
		case 115691285:/* idCadIsuYn */
			return getIdCadIsuYn();
		case 1728945275:/* ptnrPrmeIr1Yn */
			return getPtnrPrmeIr1Yn();
		case 1728946236:/* ptnrPrmeIr2Yn */
			return getPtnrPrmeIr2Yn();
		case 1728947197:/* ptnrPrmeIr3Yn */
			return getPtnrPrmeIr3Yn();
		case 1728948158:/* ptnrPrmeIr4Yn */
			return getPtnrPrmeIr4Yn();
		case -1615836118:/* ascnPbokNm */
			return getAscnPbokNm();
		case 1042902137:/* rcvpeNm */
			return getRcvpeNm();
		case 108346309:/* rcvDd */
			return getRcvDd();
		case -2095791953:/* dntnAtsEndDt */
			return getDntnAtsEndDt();
		case 29685867:/* patnAscnAcno */
			return getPatnAscnAcno();
		case 1349750471:/* patnAscnNm */
			return getPatnAscnNm();
		case -997547518:/* aimFdNm */
			return getAimFdNm();
		case -1107417978:/* patnAscnDis */
			return getPatnAscnDis();
		case 1239596980:/* patnHpNo */
			return getPatnHpNo();
		case 1658990697:/* chilRrno */
			return getChilRrno();
		case -247111581:/* dntnInfOfrAgrYn */
			return getDntnInfOfrAgrYn();
		case 1815772905:/* dntnlCd */
			return getDntnlCd();
		case -715164675:/* clsaAtsRqYn */
			return getClsaAtsRqYn();
		case -242238508:/* clsaAtsPmnyAcno */
			return getClsaAtsPmnyAcno();
		case -707354206:/* clsaAtsEndDt */
			return getClsaAtsEndDt();
		case 1484386473:/* fncTaxtSmsRqYn */
			return getFncTaxtSmsRqYn();
		case 992993977:/* wfFclUnqNo */
			return getWfFclUnqNo();
		case 519431248:/* locaPrmeYn */
			return getLocaPrmeYn();
		case -1087226435:/* afiBzcd */
			return getAfiBzcd();
		case -981665062:/* emlNtcSrvcYn */
			return getEmlNtcSrvcYn();
		case 1020510932:/* fmbkCtrdCollYn */
			return getFmbkCtrdCollYn();
		case 339530610:/* adrpRgsYn */
			return getAdrpRgsYn();
		case 103686120:/* mbhYn */
			return getMbhYn();
		case -1570125365:/* psnInfAgrYn */
			return getPsnInfAgrYn();
		case 2068858330:/* datAcldHpNo */
			return getDatAcldHpNo();
		case 1110047335:/* dpsBatRqsNo */
			return getDpsBatRqsNo();
		case 1603754886:/* dpsBatRqsSrno */
			return getDpsBatRqsSrno();
		case 1004767133:/* agnpeEncyRrno */
			return getAgnpeEncyRrno();
		case 1728197224:/* agnpeFnm */
			return getAgnpeFnm();
		case -1494592534:/* rppeDupOmitYn */
			return getRppeDupOmitYn();
		case -904354637:/* rppeAgnpeAcrdYn */
			return getRppeAgnpeAcrdYn();
		case 1409183474:/* rppeFnm */
			return getRppeFnm();
		case 1521062227:/* rppeEncyRrno */
			return getRppeEncyRrno();
		case -1356444041:/* agnpeDupYn */
			return getAgnpeDupYn();
		case 1308987521:/* rppeDupYn */
			return getRppeDupYn();
		case 1503308429:/* itpyMecd */
			return getItpyMecd();
		case 1503029739:/* itpyCycd */
			return getItpyCycd();
		case -1550357257:/* nextItpyDt */
			return getNextItpyDt();
		case -1559022651:/* actMngBrcd */
			return getActMngBrcd();
		case -1057778271:/* asscNmnlDpstYn */
			return getAsscNmnlDpstYn();
		case 1877105875:/* netrApvNo */
			return getNetrApvNo();
		case 744763926:/* mbpbkJnngYn */
			return getMbpbkJnngYn();
		case -650979620:/* mblPbokInetBnkgId */
			return getMblPbokInetBnkgId();
		case 588598579:/* npbokIccadIsuDis */
			return getNpbokIccadIsuDis();
		case 1657903882:/* ideedCd */
			return getIdeedCd();
		case 1711452800:/* pbokEngPrngYn */
			return getPbokEngPrngYn();
		case -1043880946:/* nlDscd */
			return getNlDscd();
		case -1703684344:/* dpsDeedNo */
			return getDpsDeedNo();
		case 1280152111:/* pbokIssuYn */
			return getPbokIssuYn();
		case 1483988178:/* prdGdncPbokPrngYn */
			return getPrdGdncPbokPrngYn();
		case 1256177185:/* nrsrCnfDocCollYn */
			return getNrsrCnfDocCollYn();
		case -95053088:/* bokStttPermXtYn */
			return getBokStttPermXtYn();
		case -1326243960:/* nrsrPwnoRgsYn */
			return getNrsrPwnoRgsYn();
		case -2124073121:/* nrsrAccCd */
			return getNrsrAccCd();
		case -591346182:/* krwDpsAccDscd */
			return getKrwDpsAccDscd();
		case 627473395:/* nrsrKrwInfwDscd */
			return getNrsrKrwInfwDscd();
		case -1552286250:/* txprDscd */
			return getTxprDscd();
		case -869008711:/* txprLmtAm */
			return getTxprLmtAm();
		case -980169613:/* prchAm */
			return getPrchAm();
		case -464486348:/* pmbilAm */
			return getPmbilAm();
		case -1368045550:/* cackAm */
			return getCackAm();
		case 1599309742:/* bokBchkAm */
			return getBokBchkAm();
		case 2144945120:/* etcDeedAm */
			return getEtcDeedAm();
		case 84428401:/* fncTrnAimCd */
			return getFncTrnAimCd();
		case -2132691081:/* trnFdSrcCd */
			return getTrnFdSrcCd();
		case -1690878928:/* fdOwpeYn */
			return getFdOwpeYn();
		case -1677669792:/* fncTrnAimTxt */
			return getFncTrnAimTxt();
		case 451300217:/* trnFdSrcCdTxt */
			return getTrnFdSrcCdTxt();
		case -1158038345:/* ckbilKdcd */
			return getCkbilKdcd();
		case 133246974:/* cacGramRcvYn */
			return getCacGramRcvYn();
		case 1215026200:/* cacGramRcvCrtdIsuYn */
			return getCacGramRcvCrtdIsuYn();
		case 133246229:/* cacGramRcvAm */
			return getCacGramRcvAm();
		case 135524760:/* cacGramTrfAm */
			return getCacGramTrfAm();
		case -622778580:/* cacGramBchkAm */
			return getCacGramBchkAm();
		case -208075148:/* feeRcvYn */
			return getFeeRcvYn();
		case -247169580:/* feeCshtfDscd */
			return getFeeCshtfDscd();
		case -206696081:/* rctsOupYn */
			return getRctsOupYn();
		case 97307218:/* feeAm */
			return getFeeAm();
		case 1208987208:/* wdrAcno */
			return getWdrAcno();
		case 1115501300:/* encyWdrActPwno */
			return getEncyWdrActPwno();
		case 1139815822:/* xprRcvAcno */
			return getXprRcvAcno();
		case 1980302402:/* irprmTgt1Dscd */
			return getIrprmTgt1Dscd();
		case 1981225923:/* irprmTgt2Dscd */
			return getIrprmTgt2Dscd();
		case 1982149444:/* irprmTgt3Dscd */
			return getIrprmTgt3Dscd();
		case 1983072965:/* irprmTgt4Dscd */
			return getIrprmTgt4Dscd();
		case 1983996486:/* irprmTgt5Dscd */
			return getIrprmTgt5Dscd();
		case 1984920007:/* irprmTgt6Dscd */
			return getIrprmTgt6Dscd();
		case -222942112:/* xprPrcMecd */
			return getXprPrcMecd();
		case 763548415:/* dntnAtsAcno */
			return getDntnAtsAcno();
		case -984022834:/* newFdDscd */
			return getNewFdDscd();
		case 605662444:/* spcfMonyTrtAcno */
			return getSpcfMonyTrtAcno();
		case -1361380690:/* pnsnPayTemEstYn */
			return getPnsnPayTemEstYn();
		case -1032004229:/* pnsnPayCtrtmYcnt */
			return getPnsnPayCtrtmYcnt();
		case -1923223290:/* pnsnPayCycd */
			return getPnsnPayCycd();
		case 2025043508:/* lnoActPbokIssuYn */
			return getLnoActPbokIssuYn();
		case 166863541:/* bscAcno */
			return getBscAcno();
		case 668739011:/* oldAtrbXtRncd */
			return getOldAtrbXtRncd();
		case -625014766:/* cpblChckTgtYn */
			return getCpblChckTgtYn();
		case -1901611743:/* rpcmDpstTgtYn */
			return getRpcmDpstTgtYn();
		case -961723368:/* oldAtrbCeoRgsrDrtrYn */
			return getOldAtrbCeoRgsrDrtrYn();
		case -2077964290:/* oldAtrbApvNo */
			return getOldAtrbApvNo();
		case -1630016160:/* rdepAcno */
			return getRdepAcno();
		case 7620528:/* oldAtrbApvRsn */
			return getOldAtrbApvRsn();
		case 1765378561:/* oldAtrbChckTim */
			return getOldAtrbChckTim();
		case 1360308437:/* ccadRsltInqYn */
			return getCcadRsltInqYn();
		case 233144316:/* tbkCcadHldgYn */
			return getTbkCcadHldgYn();
		case -569349659:/* cadStlActTbkYn */
			return getCadStlActTbkYn();
		case -108108410:/* ccadBasRsltAm */
			return getCcadBasRsltAm();
		case 1210610464:/* utzRsltBasStaDt */
			return getUtzRsltBasStaDt();
		case 1197505307:/* utzRsltBasEndDt */
			return getUtzRsltBasEndDt();
		case -1681359344:/* utzRsltInqTim */
			return getUtzRsltInqTim();
		case 1146509975:/* amfRispeDis */
			return getAmfRispeDis();
		case 1146512046:/* amfRispeFnm */
			return getAmfRispeFnm();
		case 1182496536:/* amfRispeRrno */
			return getAmfRispeRrno();
		case 1182045413:/* amfRispeCnad */
			return getAmfRispeCnad();
		case 1964668025:/* anrvNprcYn */
			return getAnrvNprcYn();
		case 1582003233:/* pbamAcno */
			return getPbamAcno();
		case 956239259:/* pbamSnnmAcno */
			return getPbamSnnmAcno();
		case 872364465:/* pmnyTrnUnqNo */
			return getPmnyTrnUnqNo();
		case -310048034:/* ctrtmMcn */
			return getCtrtmMcn();
		case -1021822465:/* ctrtmDcnt */
			return getCtrtmDcnt();
		case 114270890:/* xprDt */
			return getXprDt();
		case -936519932:/* rcknDt */
			return getRcknDt();
		case -262826183:/* encyAtsActPwno */
			return getEncyAtsActPwno();
		case -677154281:/* atsCycd */
			return getAtsCycd();
		case 497678352:/* atsStaDt */
			return getAtsStaDt();
		case 484573195:/* atsEndDt */
			return getAtsEndDt();
		case -677158125:/* atsCucd */
			return getAtsCucd();
		case 93150016:/* atsDd */
			return getAtsDd();
		case -676875581:/* atsMecn */
			return getAtsMecn();
		case -677234653:/* atsAcno */
			return getAtsAcno();
		case 93149932:/* atsAm */
			return getAtsAm();
		case -1118720153:/* tbkSltCopCd */
			return getTbkSltCopCd();
		case 1767082042:/* tbkSltCopOfemYn */
			return getTbkSltCopOfemYn();
		case 453654616:/* dntnRqYn */
			return getDntnRqYn();
		case 1679381792:/* dntnAmDscd */
			return getDntnAmDscd();
		case -1326901296:/* dntnAm */
			return getDntnAm();
		case -1327737733:/* xprCancRcvAcno */
			return getXprCancRcvAcno();
		case 357035736:/* bchrCponNo */
			return getBchrCponNo();
		case 857726159:/* bchrSupAm */
			return getBchrSupAm();
		case -255883391:/* bchrCusPidAm */
			return getBchrCusPidAm();
		case 93034056:/* apvNo */
			return getApvNo();
		case -1799837970:/* cponCrtfNo */
			return getCponCrtfNo();
		case -426456863:/* autoRdepYn */
			return getAutoRdepYn();
		case -1755433283:/* insuJnngAgrYn */
			return getInsuJnngAgrYn();
		case 823346292:/* jnngTgtDscd */
			return getJnngTgtDscd();
		case 1444719711:/* ccadHldgYn */
			return getCcadHldgYn();
		case -976460710:/* frcsDshgDt */
			return getFrcsDshgDt();
		case 1971532759:/* cusDgnPrdNm */
			return getCusDgnPrdNm();
		case 113880677:/* xcoCd */
			return getXcoCd();
		case -1282173947:/* frndAcno */
			return getFrndAcno();
		case -2129558626:/* spdtDgnMm */
			return getSpdtDgnMm();
		case -2129558914:/* spdtDgnDd */
			return getSpdtDgnDd();
		case 93024294:/* aplIr */
			return getAplIr();
		case -825753295:/* emlFpAcblNtfcRqYn */
			return getEmlFpAcblNtfcRqYn();
		case -826227682:/* emlFpAcblNtfcBsdt */
			return getEmlFpAcblNtfcBsdt();
		case -656234988:/* fpPrftRtSmsNtfcRqYn */
			return getFpPrftRtSmsNtfcRqYn();
		case -656709375:/* fpPrftRtSmsNtfcBsdt */
			return getFpPrftRtSmsNtfcBsdt();
		case 1160473720:/* goalPrSmsRqYn */
			return getGoalPrSmsRqYn();
		case -1240657803:/* goalPr */
			return getGoalPr();
		case 92915918:/* alwPr */
			return getAlwPr();
		case -1687387644:/* gBnkgGoalPrftRtDscd */
			return getgBnkgGoalPrftRtDscd();
		case 487049616:/* gBnkgAlwLossDscd */
			return getgBnkgAlwLossDscd();
		case -1535536517:/* fcPsklUseYn */
			return getFcPsklUseYn();
		case 1350599199:/* xrtTsTycd */
			return getXrtTsTycd();
		case -808961584:/* xrtMaxAcldAm */
			return getXrtMaxAcldAm();
		case 1015293134:/* dgnXrtNtfcSrvcDscd */
			return getDgnXrtNtfcSrvcDscd();
		case -789993922:/* ntfcSrvcDgnXrt */
			return getNtfcSrvcDgnXrt();
		case 943253015:/* ovtbCdno */
			return getOvtbCdno();
		case -1761740099:/* fmbkCoNo */
			return getFmbkCoNo();
		case 492572543:/* atrnDscd */
			return getAtrnDscd();
		case 1567089199:/* rvactNo */
			return getRvactNo();
		case -939304859:/* irRotCycd */
			return getIrRotCycd();
		case 1177542373:/* fcfndInfwDscd */
			return getFcfndInfwDscd();
		case 768300679:/* fcDpsAccDscd */
			return getFcDpsAccDscd();
		case -164140767:/* fornXchStttCrtcSbmtDis */
			return getFornXchStttCrtcSbmtDis();
		case 1650952748:/* fxRapRncd */
			return getFxRapRncd();
		case 2010731017:/* payRncdCfcd */
			return getPayRncdCfcd();
		case 3210956:/* hsCd */
			return getHsCd();
		case -1176494947:/* ivpeId */
			return getIvpeId();
		case -771083937:/* secrComNm */
			return getSecrComNm();
		case -1066138069:/* fcApvCd */
			return getFcApvCd();
		case -596857090:/* pnsnAcldCtrYcnt */
			return getPnsnAcldCtrYcnt();
		case 257829674:/* pnsnAcldCtrMcn */
			return getPnsnAcldCtrMcn();
		case 1044252064:/* pnsnRcveBgnDt */
			return getPnsnRcveBgnDt();
		case 33510681:/* prftRtRptdSndDscd */
			return getPrftRtRptdSndDscd();
		case -494698432:/* rprhLnkNewYn */
			return getRprhLnkNewYn();
		case 1271011147:/* rprhLnkCancAcno */
			return getRprhLnkCancAcno();
		case 787083722:/* rprhLnkTamNewYn */
			return getRprhLnkTamNewYn();
		case 900845967:/* afepAddPidYn */
			return getAfepAddPidYn();
		case -719863791:/* fndPdcd */
			return getFndPdcd();
		case -1378958647:/* fndScntRqdcNprtYn */
			return getFndScntRqdcNprtYn();
		case -1743106203:/* opgPtsNtcSndDscd */
			return getOpgPtsNtcSndDscd();
		case -1687029813:/* gBnkgGoalPrftRtPsnb */
			return getgBnkgGoalPrftRtPsnb();
		case -1687402702:/* gBnkgGoalPrftRtDcml */
			return getgBnkgGoalPrftRtDcml();
		case 304429241:/* gBnkgAlwLossRtPsnb */
			return getgBnkgAlwLossRtPsnb();
		case 304056352:/* gBnkgAlwLossRtDcml */
			return getgBnkgAlwLossRtDcml();
		case -631213081:/* wooriOnwlMoAcno */
			return getWooriOnwlMoAcno();
		case 289454902:/* bznUseActYn */
			return getBznUseActYn();
		case 1041767737:/* agnpeItcsno */
			return getAgnpeItcsno();
		case 2065767535:/* rppeItcsno */
			return getRppeItcsno();
		case -1379524886:/* atsNaNtfcRqYn */
			return getAtsNaNtfcRqYn();
		case 1636035056:/* acldFndTsXprNtfcRqYn */
			return getAcldFndTsXprNtfcRqYn();
		case -854254849:/* fwxcAcno */
			return getFwxcAcno();
		case 35579973:/* fndCnvrTmntAcno */
			return getFndCnvrTmntAcno();
		case 1279325165:/* dvdamRinvDscd */
			return getDvdamRinvDscd();
		case 294247282:/* fndCnvrNewYn */
			return getFndCnvrNewYn();
		case 853379231:/* lonXprAdvnYn */
			return getLonXprAdvnYn();
		case -1164549312:/* lnApvCmplYn */
			return getLnApvCmplYn();
		case -2038020595:/* priPrpeBrNm */
			return getPriPrpeBrNm();
		case 291524674:/* grnTrno */
			return getGrnTrno();
		case 1302299740:/* escrUnmrNo */
			return getEscrUnmrNo();
		case -2038063807:/* priPrpeAcno */
			return getPriPrpeAcno();
		case -975757958:/* prpeAcno */
			return getPrpeAcno();
		case -24308916:/* priPrpeBzpeNo */
			return getPriPrpeBzpeNo();
		case -1350604475:/* prpeBzpeNo */
			return getPrpeBzpeNo();
		case -1701058186:/* ppmtAmRcveAcno */
			return getPpmtAmRcveAcno();
		case -1008188424:/* orcpPrpeCsno */
			return getOrcpPrpeCsno();
		case 1913010598:/* pftPrpeCsno */
			return getPftPrpeCsno();
		case -1072495445:/* orcpPrpeNrsrCollYn */
			return getOrcpPrpeNrsrCollYn();
		case -274628647:/* pftPrpeNrsrCollYn */
			return getPftPrpeNrsrCollYn();
		case 559017583:/* pocpPfeAm */
			return getPocpPfeAm();
		case -1433614347:/* etfTprt */
			return getEtfTprt();
		case -1330828840:/* opgOrdsTxt */
			return getOpgOrdsTxt();
		case -911489075:/* sa1Txt */
			return getSa1Txt();
		case -911459284:/* sa2Txt */
			return getSa2Txt();
		case -911429493:/* sa3Txt */
			return getSa3Txt();
		case -895606634:/* sptxYn */
			return getSptxYn();
		case 2093137534:/* nnmCsno */
			return getNnmCsno();
		case -484681714:/* fndItmsCd */
			return getFndItmsCd();
		case -2120282550:/* dpsRcvAm */
			return getDpsRcvAm();
		case 110624756:/* trfAm */
			return getTrfAm();
		case -1394678704:/* bchkAm */
			return getBchkAm();
		case -1390536655:/* bchkInqmAm */
			return getBchkInqmAm();
		case 490977719:/* inqmScnt */
			return getInqmScnt();
		case -536106856:/* inqmFeeXmpDis */
			return getInqmFeeXmpDis();
		case -602269923:/* tamTrfYn */
			return getTamTrfYn();
		case 3455562:/* pxrt */
			return getPxrt();
		case -913709596:/* krwTrfAm */
			return getKrwTrfAm();
		case 3064915:/* cucd */
			return getCucd();
		case -2040077275:/* ioffSbDscd */
			return getIoffSbDscd();
		case 1238782650:/* cshtfDscd */
			return getCshtfDscd();
		case -1172132390:/* cshFeeLevyDscd */
			return getCshFeeLevyDscd();
		case -1351307666:/* cshFee */
			return getCshFee();
		case 619892827:/* tgtKrwAm */
			return getTgtKrwAm();
		case -1048547017:/* fcTrfAm */
			return getFcTrfAm();
		case 1430235190:/* fcCshRcvAm */
			return getFcCshRcvAm();
		case -1354934627:/* coinAm */
			return getCoinAm();
		case 3300453:/* krfd */
			return getKrfd();
		case 93037099:/* apxrt */
			return getApxrt();
		case 914284991:/* cusPrmeXrt */
			return getCusPrmeXrt();
		case 1057094263:/* ioffSbRt */
			return getIoffSbRt();
		case 839505025:/* fwxcCtrMcnt */
			return getFwxcCtrMcnt();
		case 1844635427:/* newAcno */
			return getNewAcno();
		case -583209759:/* ksdFndNo */
			return getKsdFndNo();
		case 1364541398:/* rtpenTrnDisNo */
			return getRtpenTrnDisNo();
		case 939982363:/* rcmGoalAm */
			return getRcmGoalAm();
		case 1075545850:/* jnngCtgrCd */
			return getJnngCtgrCd();
		case -531519760:/* rcpMdKdcd */
			return getRcpMdKdcd();
		case -1941940173:/* hsscMajTxtPbokPrngYn */
			return getHsscMajTxtPbokPrngYn();
		case 384871375:/* prdDesOupYn */
			return getPrdDesOupYn();
		case 2067227086:/* acicJnngYn */
			return getAcicJnngYn();
		case -773472811:/* hsscNewDscd */
			return getHsscNewDscd();
		case 1870153120:/* hsscRgslZpno */
			return getHsscRgslZpno();
		case -122175277:/* hsscInddRgsYn */
			return getHsscInddRgsYn();
		case 1677724537:/* hsscHopeRgnZpno */
			return getHsscHopeRgnZpno();
		case 170129098:/* hopeHousKdDscd */
			return getHopeHousKdDscd();
		case 1062800235:/* housXuseSqmDscd */
			return getHousXuseSqmDscd();
		case -270407855:/* hopeMovinYm */
			return getHopeMovinYm();
		case -749415327:/* esnsNewRgsDt */
			return getEsnsNewRgsDt();
		case -749414838:/* esnsNewRgsTm */
			return getEsnsNewRgsTm();
		case -1232451990:/* esnsNewEbnkUtzpeNo */
			return getEsnsNewEbnkUtzpeNo();
		case -676936134:/* atsKdcd */
			return getAtsKdcd();
		case -2044904612:/* lnoActOpngRncd */
			return getLnoActOpngRncd();
		case 1502469574:/* scanInfAcnmCnfDscd */
			return getScanInfAcnmCnfDscd();
		case -1341759000:/* agnpeTrnYn */
			return getAgnpeTrnYn();
		case -2040540129:/* dpsPwnoRgsDscd */
			return getDpsPwnoRgsDscd();
		case 76728658:/* prrRgsPwnoKeyCnf */
			return getPrrRgsPwnoKeyCnf();
		case -1157459584:/* encyActPwnoCnf */
			return getEncyActPwnoCnf();
		case -2098541095:/* wdcPbokYn */
			return getWdcPbokYn();
		case -665044733:/* wooriLovPlsDntnAscnDscd */
			return getWooriLovPlsDntnAscnDscd();
		case -1313232124:/* sameRqdcSrno */
			return getSameRqdcSrno();
		case -291943452:/* etcDeedDscd */
			return getEtcDeedDscd();
		case -1693075242:/* actApvNo */
			return getActApvNo();
		case -886272249:/* fndRblnNewYn */
			return getFndRblnNewYn();
		case 276419514:/* bgnnRcvWdrYn */
			return getBgnnRcvWdrYn();
		case 150370432:/* copItcsno */
			return getCopItcsno();
		case 1845945671:/* inbkNewYn */
			return getInbkNewYn();
		case 394059857:/* smrtBnkgNewYn */
			return getSmrtBnkgNewYn();
		case 2019041518:/* tlbnkNewYn */
			return getTlbnkNewYn();
		case -528795175:/* ntsvcRgsYn */
			return getNtsvcRgsYn();
		case 443661432:/* inbkWdrActRgsYn */
			return getInbkWdrActRgsYn();
		case -1667085630:/* inetBnkgUserId */
			return getInetBnkgUserId();
		case -38243262:/* ebnkPwno */
			return getEbnkPwno();
		case 96654141:/* engNm */
			return getEngNm();
		case 468230409:/* tms1TsLmtAm */
			return getTms1TsLmtAm();
		case -251660717:/* d1TsLmtAm */
			return getD1TsLmtAm();
		case -741436093:/* secrdSrno */
			return getSecrdSrno();
		case -944857320:/* otpcSrno */
			return getOtpcSrno();
		case -1006585838:/* otpPwd */
			return getOtpPwd();
		case 284284382:/* otpIsuCostXmpDscd */
			return getOtpIsuCostXmpDscd();
		case 1841455820:/* datDpsTelNo */
			return getDatDpsTelNo();
		case 868086538:/* synpbDscd */
			return getSynpbDscd();
		case 1043617891:/* inetBnkgRcpSrno */
			return getInetBnkgRcpSrno();
		case 1481281197:/* inbkRsvRgbrCd */
			return getInbkRsvRgbrCd();
		case 1987460871:/* inbkRsvRgsDt */
			return getInbkRsvRgsDt();
		case -1310101225:/* inbkRsvRgsSrno */
			return getInbkRsvRgsSrno();
		case 1885241755:/* smrtBnkgInetBnkgId */
			return getSmrtBnkgInetBnkgId();
		case -28100074:/* smrtBnkgHpComCd */
			return getSmrtBnkgHpComCd();
		case -387374866:/* smrtBnkgHpTlenNo */
			return getSmrtBnkgHpTlenNo();
		case -831710836:/* smrtBnkgHpSrno */
			return getSmrtBnkgHpSrno();
		case 1241461980:/* tlbnkSecrdSrno */
			return getTlbnkSecrdSrno();
		case -1850926015:/* encyEbnkPwno */
			return getEncyEbnkPwno();
		case 1463252384:/* tlbnkD1TsLmt */
			return getTlbnkD1TsLmt();
		case -68009066:/* tlbnkTms1TsLmt */
			return getTlbnkTms1TsLmt();
		case -1534720706:/* ntsvcRawDscd */
			return getNtsvcRawDscd();
		case -744301950:/* ntsvcBalNtyMarkYn */
			return getNtsvcBalNtyMarkYn();
		case -1437134496:/* ntsvcHpComCd */
			return getNtsvcHpComCd();
		case -1117768988:/* ntsvcHpTlenNo */
			return getNtsvcHpTlenNo();
		case 508309762:/* ntsvcHpSrno */
			return getNtsvcHpSrno();
		case 535926544:/* ntsvcInotAm */
			return getNtsvcInotAm();
		case -686985361:/* astPrtsNtcYn */
			return getAstPrtsNtcYn();
		case -398628264:/* ntsvcTmsStaTim */
			return getNtsvcTmsStaTim();
		case -804888131:/* ntsvcTmsEndTim */
			return getNtsvcTmsEndTim();
		case -674760440:/* wdrActRgsInetBnkgId */
			return getWdrActRgsInetBnkgId();
		case 482180673:/* ebnkWdrActCnccRgsYn */
			return getEbnkWdrActCnccRgsYn();
		case -1313124972:/* tlbnkWdrActCnccRgsYn */
			return getTlbnkWdrActCnccRgsYn();
		case -2013577298:/* hswfPbokDocSndYn */
			return getHswfPbokDocSndYn();
		case -741547210:/* faOwacCsno */
			return getFaOwacCsno();
		case 1237254481:/* flieRgsYn */
			return getFlieRgsYn();
		case 93150677:/* atsYn */
			return getAtsYn();
		case 83405797:/* hmnyUsgAm */
			return getHmnyUsgAm();
		case -1436963561:/* etcAcno */
			return getEtcAcno();
		case 1965257592:/* trtpyRtPsnb */
			return getTrtpyRtPsnb();
		case 1964884703:/* trtpyRtDcml */
			return getTrtpyRtDcml();
		case 100672502:/* fltIrNtcDscd */
			return getFltIrNtcDscd();
		case 783517470:/* etpCoplsDpstNewYn */
			return getEtpCoplsDpstNewYn();
		case -676533775:/* atsXtYn */
			return getAtsXtYn();
		case -1724502037:/* spslPdcd */
			return getSpslPdcd();
		case 272541446:/* trtPocpPfeRtPsnb */
			return getTrtPocpPfeRtPsnb();
		case 272168557:/* trtPocpPfeRtDcml */
			return getTrtPocpPfeRtDcml();
		case -1971371805:/* trtDfanPfeRtPsnb */
			return getTrtDfanPfeRtPsnb();
		case -1971744694:/* trtDfanPfeRtDcml */
			return getTrtDfanPfeRtDcml();
		case 950464271:/* cponInpDscd */
			return getCponInpDscd();
		case 1358216955:/* agmIrtPsnb */
			return getAgmIrtPsnb();
		case 1357844066:/* agmIrtDcml */
			return getAgmIrtDcml();
		case 1981397653:/* pbokOtln */
			return getPbokOtln();
		case 212330625:/* ascnBlgCd */
			return getAscnBlgCd();
		case 1897311392:/* acldCrtdSndDscd */
			return getAcldCrtdSndDscd();
		case 1607433178:/* isaMajSbjPbokPrngYn */
			return getIsaMajSbjPbokPrngYn();
		case -94610823:/* isaNewDscd */
			return getIsaNewDscd();
		case -2143367580:/* isaJnngDscd */
			return getIsaJnngDscd();
		case -1564790021:/* jnngAdvpeEno */
			return getJnngAdvpeEno();
		case -1804579769:/* extxDscd */
			return getExtxDscd();
		case -273030408:/* dtjnTemDscd */
			return getDtjnTemDscd();
		case 135585494:/* mndDocCollYn */
			return getMndDocCollYn();
		case -1298474816:/* enmtDt */
			return getEnmtDt();
		case -1322647810:/* dshgDt */
			return getDshgDt();
		case -1213750859:/* ctrmvIscd */
			return getCtrmvIscd();
		case 993178430:/* rtrtInsuCnvrAm */
			return getRtrtInsuCnvrAm();
		case -348566472:/* aldJnpeTycd */
			return getAldJnpeTycd();
		case 977698708:/* fstJnngDt */
			return getFstJnngDt();
		case -1396265533:/* tfrAcno */
			return getTfrAcno();
		case -985764150:/* planNo */
			return getPlanNo();
		case 58838003:/* brdmKdcd */
			return getBrdmKdcd();
		case -336598271:/* scdOrdsMngNo */
			return getScdOrdsMngNo();
		case -2116109003:/* rtpenCobdnAm */
			return getRtpenCobdnAm();
		case 569074111:/* rtpenPbdnAm */
			return getRtpenPbdnAm();
		case -1904951034:/* opgMngFee */
			return getOpgMngFee();
		case -1470206335:/* asetMngFee */
			return getAsetMngFee();
		case -1888502226:/* stlAcno */
			return getStlAcno();
		case 1180127566:/* encyStlActPwno */
			return getEncyStlActPwno();
		case -1871037142:/* afepAddPidDscd */
			return getAfepAddPidDscd();
		case 1335559067:/* rprhLnkNewDscd */
			return getRprhLnkNewDscd();
		case -1886852355:/* cancRsvFndAcno */
			return getCancRsvFndAcno();
		case -125751408:/* rprhAmTamNewDscd */
			return getRprhAmTamNewDscd();
		case 875589485:/* xcoPrmeIrt */
			return getXcoPrmeIrt();
		case 1075626488:/* fndGoalPrftRtPsnb */
			return getFndGoalPrftRtPsnb();
		case 1075253599:/* fndGoalPrftRtDcml */
			return getFndGoalPrftRtDcml();
		case 128152119:/* srvcRqAm */
			return getSrvcRqAm();
		case 2113601721:/* fndAcblNtcDis */
			return getFndAcblNtcDis();
		case 1306917545:/* fndAcblNtfcBasDd */
			return getFndAcblNtfcBasDd();
		case 56644945:/* fndPrftRtSmsChrRqDscd */
			return getFndPrftRtSmsChrRqDscd();
		case -364069839:/* fndSmsRqTprtPsnb */
			return getFndSmsRqTprtPsnb();
		case -364442728:/* fndSmsRqTprtDcml */
			return getFndSmsRqTprtDcml();
		case -364427670:/* fndSmsRqTprtDscd */
			return getFndSmsRqTprtDscd();
		case -1825386322:/* fndSmsRqLossAwrtPsnb */
			return getFndSmsRqLossAwrtPsnb();
		case -1825759211:/* fndSmsRqLossAwrtDcml */
			return getFndSmsRqLossAwrtDcml();
		case -1825744153:/* fndSmsRqLossAwrtDscd */
			return getFndSmsRqLossAwrtDscd();
		case -1172651845:/* fndFpPrftRtSmsChrRqDscd */
			return getFndFpPrftRtSmsChrRqDscd();
		case -1636973909:/* fndFpPrftRtSmsChrRqDtDscd */
			return getFndFpPrftRtSmsChrRqDtDscd();
		case 802771693:/* scntRqdcPrngOmitYn */
			return getScntRqdcPrngOmitYn();
		case 1126423547:/* oldAtrbChckHisSrno */
			return getOldAtrbChckHisSrno();
		case -752645044:/* newVstrMngNo */
			return getNewVstrMngNo();
		case 2005331524:/* payVstrMngNo */
			return getPayVstrMngNo();
		case 1553147178:/* spotTfrRtpenPrdNo */
			return getSpotTfrRtpenPrdNo();
		case 118525549:/* rtttIscd */
			return getRtttIscd();
		case -962656910:/* spotTfrRtpenPlanDscd */
			return getSpotTfrRtpenPlanDscd();
		case 1552776534:/* intRcvFcAcno */
			return getIntRcvFcAcno();
		case 2109232162:/* pbdeedPrngYn */
			return getPbdeedPrngYn();
		case -1355827194:/* dgnXrtPsnb */
			return getDgnXrtPsnb();
		case -1356200083:/* dgnXrtDcml */
			return getDgnXrtDcml();
		case 93377333:/* mkshMbhYn */
			return getMkshMbhYn();
		case 59288696:/* asstmPbokDscd */
			return getAsstmPbokDscd();
		case -909686781:/* wbbtJnngHpNo */
			return getWbbtJnngHpNo();
		case -1836606476:/* prdOpgDscd */
			return getPrdOpgDscd();
		case 1356841569:/* newInqYn */
			return getNewInqYn();
		case -364471434:/* pwnoNuseYn */
			return getPwnoNuseYn();
		case 526999031:/* bchrInqTim */
			return getBchrInqTim();
		case 521063607:/* bchrNewAvlYn */
			return getBchrNewAvlYn();
		case -1785063366:/* prdMajTxtPbokPrngYn */
			return getPrdMajTxtPbokPrngYn();
		case 468793075:/* apirtPsnb */
			return getApirtPsnb();
		case 468420186:/* apirtDcml */
			return getApirtDcml();
		case -1210177831:/* hqapNo */
			return getHqapNo();
		case -1825557710:/* acnmCsno */
			return getAcnmCsno();
		case 781893206:/* fcbdNewYn */
			return getFcbdNewYn();
		case -1181291453:/* irKdcd */
			return getIrKdcd();
		case -503923397:/* efctPrftRtPsnb */
			return getEfctPrftRtPsnb();
		case -504296286:/* efctPrftRtDcml */
			return getEfctPrftRtDcml();
		case 1223068167:/* vrBilNewDscd */
			return getVrBilNewDscd();
		case 406323977:/* istIvpeBatNewTrnDscd */
			return getIstIvpeBatNewTrnDscd();
		case 2105389394:/* dppeCsno */
			return getDppeCsno();
		case 602881787:/* dppeActIdfNo */
			return getDppeActIdfNo();
		case 2008352619:/* dpsBatNewBzcd */
			return getDpsBatNewBzcd();
		case -334268315:/* ascnNewRprsAcno */
			return getAscnNewRprsAcno();
		case -1772377979:/* ascnNewRprsActYn */
			return getAscnNewRprsActYn();
		case -141212217:/* pbamActAcctYy */
			return getPbamActAcctYy();
		case -1841894941:/* pmnySnnmActAcctYy */
			return getPmnySnnmActAcctYy();
		case 758860673:/* hsscOwhmAdrKdcd */
			return getHsscOwhmAdrKdcd();
		case 1904089685:/* hsscOwhmBldMngNo */
			return getHsscOwhmBldMngNo();
		case -634163864:/* hsscOwhmPostSrno */
			return getHsscOwhmPostSrno();
		case -1939654699:/* hsscOwhmStdoNo */
			return getHsscOwhmStdoNo();
		case 1702287322:/* agmtCoCd */
			return getAgmtCoCd();
		case 94184468:/* wooriHopeDremJnngTgtDscd */
			return getWooriHopeDremJnngTgtDscd();
		case 1668346736:/* asetMngIscd */
			return getAsetMngIscd();
		case 333228112:/* rpbdDscd */
			return getRpbdDscd();
		case 1832686429:/* cctnAcno */
			return getCctnAcno();
		case -1710560922:/* npbdSbsrRqYn */
			return getNpbdSbsrRqYn();
		case -959893770:/* npbdItmsCd */
			return getNpbdItmsCd();
		case 773105085:/* bndKdDis */
			return getBndKdDis();
		case -970156428:/* tunMmHo */
			return getTunMmHo();
		case -1845702869:/* hdgTgtYn */
			return getHdgTgtYn();
		case 912426933:/* idCadNhssDscd */
			return getIdCadNhssDscd();
		case 634386619:/* fndPlsOpgDscd */
			return getFndPlsOpgDscd();
		case -894560203:/* grnInsuKey */
			return getGrnInsuKey();
		case -1772583095:/* preIntRcvDscd */
			return getPreIntRcvDscd();
		case -1772687492:/* preIntRcvAcno */
			return getPreIntRcvAcno();
		case -2120290794:/* dpsRcmNo */
			return getDpsRcmNo();
		case -570755203:/* sldrAldCn */
			return getSldrAldCn();
		case 512885174:/* dlpmPbokGenRgsYn */
			return getDlpmPbokGenRgsYn();
		case 80681576:/* smrtMchrMdlInf */
			return getSmrtMchrMdlInf();
		case 1870916542:/* wibeeRcvRgsYn */
			return getWibeeRcvRgsYn();
		case -1692942062:/* wibeeTsAcno */
			return getWibeeTsAcno();
		case 737197833:/* wibeePushRgsYn */
			return getWibeePushRgsYn();
		case -32426542:/* atsKrwTsAcno */
			return getAtsKrwTsAcno();
		case -345895821:/* irngBrcd */
			return getIrngBrcd();
		case -1609088133:/* krwFmbkFxpdYn */
			return getKrwFmbkFxpdYn();
		case 595364711:/* krwSscoFmbkFxpdYn */
			return getKrwSscoFmbkFxpdYn();
		case 356658831:/* hopeHousXuseSqmDscd */
			return getHopeHousXuseSqmDscd();
		case -466944365:/* rrrgMvinDt */
			return getRrrgMvinDt();
		case 859038168:/* dppeUnqNo */
			return getDppeUnqNo();
		case 522286227:/* dppeItmsNo */
			return getDppeItmsNo();
		case -1941305511:/* cshbAtsAcno */
			return getCshbAtsAcno();
		case 2129011747:/* cusDntnAscnCd */
			return getCusDntnAscnCd();
		case 1820081956:/* cusBrdnCnrnRt */
			return getCusBrdnCnrnRt();
		case -1667932565:/* dinsvGoalAm */
			return getDinsvGoalAm();
		case -871751621:/* txprInqYn */
			return getTxprInqYn();
		case 3151757:/* frno */
			return getFrno();
		case -744215298:/* acnmRgsCd */
			return getAcnmRgsCd();
		case -111793581:/* coaOmitYn */
			return getCoaOmitYn();
		case -2059858526:/* wbbmLnkNewYn */
			return getWbbmLnkNewYn();
		case 783934248:/* wbbtRcmRgsHpNo */
			return getWbbtRcmRgsHpNo();
		case -399302576:/* smrtLnJnngYn */
			return getSmrtLnJnngYn();
		case 199295996:/* dinsvDscd */
			return getDinsvDscd();
		case 93164586:/* aucId */
			return getAucId();
		case -1242199478:/* gmktId */
			return getGmktId();
		case -794566639:/* wbbmId */
			return getWbbmId();
		case 1832699989:/* dniAcnmCnfNewDscd */
			return getDniAcnmCnfNewDscd();
		case 113385874:/* dniRcvAm */
			return getDniRcvAm();
		case 1804486312:/* dniHpNo */
			return getDniHpNo();
		case 293936462:/* dniPtnAcno */
			return getDniPtnAcno();
		case -2060232872:/* dniPtnNewAcno */
			return getDniPtnNewAcno();
		case 294925909:/* dniPtnbkCd */
			return getDniPtnbkCd();
		case -2044522638:/* rjnngAcno */
			return getRjnngAcno();
		case 2107390949:/* insvAcldPlanKdcd */
			return getInsvAcldPlanKdcd();
		case 1108470544:/* insvAcldFstTsAm */
			return getInsvAcldFstTsAm();
		case 900720545:/* insvAcldTsStaWkdDscd */
			return getInsvAcldTsStaWkdDscd();
		case 619080111:/* insvAcldTsStaDt */
			return getInsvAcldTsStaDt();
		case 897340744:/* insvAcldPlanChcYn */
			return getInsvAcldPlanChcYn();
		case -1988522509:/* insvAcldPlanLifeAm */
			return getInsvAcldPlanLifeAm();
		case -577995740:/* pidMecd */
			return getPidMecd();
		case 1376938661:/* selcMvbDtlsIdfCd */
			return getSelcMvbDtlsIdfCd();
		case 310566279:/* ptnBkwAcno */
			return getPtnBkwAcno();
		case -713721090:/* ptnSelcIscd */
			return getPtnSelcIscd();
		case -49187375:/* fndslcMvbCfdocIsuDt */
			return getFndslcMvbCfdocIsuDt();
		case -1533283343:/* taxTycd */
			return getTaxTycd();
		case -1940331653:/* rprhAfImnwYn */
			return getRprhAfImnwYn();
		case -1087026392:/* elfSelfDgnsYn */
			return getElfSelfDgnsYn();
		case -1434776355:/* wmsPrtfDis */
			return getWmsPrtfDis();
		case -1221235600:/* ptnIstCnfYn */
			return getPtnIstCnfYn();
		case -1869195284:/* ivsdesSrno */
			return getIvsdesSrno();
		case -1981482423:/* fndSvvlAcuCn */
			return getFndSvvlAcuCn();
		case 99901034:/* cusPrtfRgsNo */
			return getCusPrtfRgsNo();
		case -936409858:/* rcpDtm */
			return getRcpDtm();
		case 348210250:/* pnsfndAcno */
			return getPnsfndAcno();
		case -1066806663:/* mmfFndAcno */
			return getMmfFndAcno();
		case -2078310706:/* pnsfndNewYn */
			return getPnsfndNewYn();
		case -1219088163:/* frstNwactNo */
			return getFrstNwactNo();
		case -1824740636:/* scndNwactNo */
			return getScndNwactNo();
		case -316582586:/* fndOpngDt */
			return getFndOpngDt();
		case 2065511122:/* krwSscoNewTlmNo */
			return getKrwSscoNewTlmNo();
		case 1110034028:/* atsDtlDscd */
			return getAtsDtlDscd();
		case 1066680314:/* atsRcvLmtAm */
			return getAtsRcvLmtAm();
		case -1419203182:/* krwFmbkMmdaYn */
			return getKrwFmbkMmdaYn();
		case 966966447:/* opgOrdsMngNo */
			return getOpgOrdsMngNo();
		case 931180487:/* spcfPrdMoAcno */
			return getSpcfPrdMoAcno();
		case 387501381:/* restTxprLmtAm */
			return getRestTxprLmtAm();
		case 2105314436:/* dppeAcno */
			return getDppeAcno();
		case -1137476586:/* pmnyIdeedYn */
			return getPmnyIdeedYn();
		case -182709825:/* tdyCancAcno */
			return getTdyCancAcno();
		case -249550256:/* cbrseNewYn */
			return getCbrseNewYn();
		case -494339350:/* fmbkNewCitAtsCancYn */
			return getFmbkNewCitAtsCancYn();
		case 1745931109:/* cnstDdctFxpdGrnYr5OverYn */
			return getCnstDdctFxpdGrnYr5OverYn();
		case -1247399255:/* aprrBrdmCd */
			return getAprrBrdmCd();
		case 934753548:/* cmpnOv1peYn */
			return getCmpnOv1peYn();
		case 299854105:/* pnsfndCoreOupYn */
			return getPnsfndCoreOupYn();
		case -1363158003:/* rtpenPlanAplDt */
			return getRtpenPlanAplDt();
		case 924279132:/* rtpenPlanItcsno */
			return getRtpenPlanItcsno();
		case 715018249:/* glblBnkgJnngYn */
			return getGlblBnkgJnngYn();
		case -746852411:/* idCadNewDscd */
			return getIdCadNewDscd();
		case -2146698918:/* encyEbnkPwnoCnf */
			return getEncyEbnkPwnoCnf();
		case 1256318988:/* tlbnkPwnoCnf */
			return getTlbnkPwnoCnf();
		case 663827477:/* gridRowCnt */
			return getGridRowCnt();
		case 3181382:/* grid */
			return getGrid();
		case -896184643:/* gridRowCnt2 */
			return getGridRowCnt2();
		case 98622892:/* grid2 */
			return getGrid2();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 672774442:/* sqcNmTrnCfdocCollYn */
			setSqcNmTrnCfdocCollYn((String)value);
			break;
		case -973799543:/* dpsNewDscd */
			setDpsNewDscd((String)value);
			break;
		case -119599198:/* dpsRsvNewDscd */
			setDpsRsvNewDscd((String)value);
			break;
		case 1134290395:/* encyActPwno */
			setEncyActPwno((String)value);
			break;
		case 900916127:/* sealSignUsgDscd */
			setSealSignUsgDscd((String)value);
			break;
		case 3435861:/* pdcd */
			setPdcd((String)value);
			break;
		case 3063345:/* csno */
			setCsno((String)value);
			break;
		case -1460883763:/* cusDgnAcno */
			setCusDgnAcno((String)value);
			break;
		case -20902071:/* prrRgsPwnoKey */
			setPrrRgsPwnoKey((String)value);
			break;
		case -99777029:/* smsdDscd */
			setSmsdDscd((String)value);
			break;
		case 1492567300:/* psnInfExpsCnfYn */
			setPsnInfExpsCnfYn((String)value);
			break;
		case -2066867664:/* scanUablRncd */
			setScanUablRncd((String)value);
			break;
		case 1781700756:/* psnInfAgmdMngNo */
			setPsnInfAgmdMngNo((String)value);
			break;
		case -2019195316:/* acnmCnfEno */
			setAcnmCnfEno((String)value);
			break;
		case -705281570:/* advpeEno */
			setAdvpeEno((String)value);
			break;
		case -190746854:/* idcrDscd */
			setIdcrDscd((String)value);
			break;
		case 1656416635:/* idcrFnm */
			setIdcrFnm((String)value);
			break;
		case 1664834643:/* idcrEncyRsdlNo */
			setIdcrEncyRsdlNo((String)value);
			break;
		case -1613551151:/* idcrIsuDt */
			setIdcrIsuDt((String)value);
			break;
		case 1513570054:/* idcrImgKey */
			setIdcrImgKey((String)value);
			break;
		case -1326077163:/* idcrCnfShap */
			setIdcrCnfShap((String)value);
			break;
		case 1779002676:/* idcrRuseYn */
			setIdcrRuseYn((String)value);
			break;
		case 1032390738:/* idcrAgnpeTrnYn */
			setIdcrAgnpeTrnYn((String)value);
			break;
		case -2009111091:/* appRgsDscd */
			setAppRgsDscd((String)value);
			break;
		case -2009171634:/* appRgsBrcd */
			setAppRgsBrcd((String)value);
			break;
		case 1155449965:/* appRgsDt */
			setAppRgsDt((String)value);
			break;
		case -2008664835:/* appRgsSrno */
			setAppRgsSrno((String)value);
			break;
		case -1739391551:/* wmsLnkYn */
			setWmsLnkYn((String)value);
			break;
		case 1698652423:/* snthAsetMngCsno */
			setSnthAsetMngCsno((String)value);
			break;
		case 1478303146:/* snthAsetMngDesgnPrdCnt */
			setSnthAsetMngDesgnPrdCnt((String)value);
			break;
		case -301352777:/* snthAsetMngAltrIvstWgt */
			setSnthAsetMngAltrIvstWgt((String)value);
			break;
		case 281517904:/* snthAsetMngBksWgt */
			setSnthAsetMngBksWgt((String)value);
			break;
		case 943356625:/* snthAsetMngFrgBndWgt */
			setSnthAsetMngFrgBndWgt((String)value);
			break;
		case 1435563527:/* snthAsetMngFrgStcWgt */
			setSnthAsetMngFrgStcWgt((String)value);
			break;
		case 1699024939:/* snthAsetMngPdcd */
			setSnthAsetMngPdcd((String)value);
			break;
		case -2008749403:/* appRgsPwno */
			setAppRgsPwno((String)value);
			break;
		case -1384324506:/* appRgsAtsAcno */
			setAppRgsAtsAcno((String)value);
			break;
		case -1013941699:/* wmLnkTrnSrno */
			setWmLnkTrnSrno((String)value);
			break;
		case 332829367:/* snthAsetMngDeedCd */
			setSnthAsetMngDeedCd((String)value);
			break;
		case 397077193:/* snthAsetMngFlwWgt */
			setSnthAsetMngFlwWgt((String)value);
			break;
		case 852096238:/* snthAsetMngDomStcWgt */
			setSnthAsetMngDomStcWgt((String)value);
			break;
		case 359889336:/* snthAsetMngDomBndWgt */
			setSnthAsetMngDomBndWgt((String)value);
			break;
		case 2021749582:/* prdStbyAnlsSrno */
			setPrdStbyAnlsSrno((String)value);
			break;
		case -1067036805:/* inlnAnlsSrno */
			setInlnAnlsSrno((String)value);
			break;
		case -1978854306:/* asetIstMngNo */
			setAsetIstMngNo((String)value);
			break;
		case -436679975:/* rtpenPlanOrgPdcd */
			setRtpenPlanOrgPdcd((String)value);
			break;
		case -2097145985:/* jnpeTycd */
			setJnpeTycd((String)value);
			break;
		case 444511530:/* fndSgpFpCnslSrvcDscd */
			setFndSgpFpCnslSrvcDscd((String)value);
			break;
		case -1072415017:/* rsdlBzpeNo */
			setRsdlBzpeNo((String)value);
			break;
		case 2012597579:/* frnrLstVldTem */
			setFrnrLstVldTem((String)value);
			break;
		case -33279538:/* inetRsvRcpDscd */
			setInetRsvRcpDscd((String)value);
			break;
		case -1992681173:/* inetRsvIdfNo */
			setInetRsvIdfNo((String)value);
			break;
		case 475261634:/* inetRsvNo */
			setInetRsvNo((String)value);
			break;
		case -442126531:/* inetRsvCusPureNewYn */
			setInetRsvCusPureNewYn((String)value);
			break;
		case 868429615:/* synpbPdcd */
			setSynpbPdcd((String)value);
			break;
		case -764468352:/* actUsgAimDis */
			setActUsgAimDis((String)value);
			break;
		case 1480790639:/* frnrEmptEduYn */
			setFrnrEmptEduYn((String)value);
			break;
		case 753956338:/* fncTrnAimCollDis */
			setFncTrnAimCollDis((String)value);
			break;
		case 72582830:/* lnoActOpngRsn */
			setLnoActOpngRsn((String)value);
			break;
		case -1811382847:/* depaCrdcCollYn */
			setDepaCrdcCollYn((String)value);
			break;
		case -514618848:/* idCadIsuRqdcUsgYn */
			setIdCadIsuRqdcUsgYn((String)value);
			break;
		case -420298135:/* rcvVcrMlsChidYn */
			setRcvVcrMlsChidYn((String)value);
			break;
		case 2134578903:/* saltsScdDd */
			setSaltsScdDd((Integer)value);
			break;
		case -1526717925:/* atmWdrDscd */
			setAtmWdrDscd((String)value);
			break;
		case 48304400:/* cctnTrnKdcd */
			setCctnTrnKdcd((String)value);
			break;
		case 115691285:/* idCadIsuYn */
			setIdCadIsuYn((String)value);
			break;
		case 1728945275:/* ptnrPrmeIr1Yn */
			setPtnrPrmeIr1Yn((String)value);
			break;
		case 1728946236:/* ptnrPrmeIr2Yn */
			setPtnrPrmeIr2Yn((String)value);
			break;
		case 1728947197:/* ptnrPrmeIr3Yn */
			setPtnrPrmeIr3Yn((String)value);
			break;
		case 1728948158:/* ptnrPrmeIr4Yn */
			setPtnrPrmeIr4Yn((String)value);
			break;
		case -1615836118:/* ascnPbokNm */
			setAscnPbokNm((String)value);
			break;
		case 1042902137:/* rcvpeNm */
			setRcvpeNm((String)value);
			break;
		case 108346309:/* rcvDd */
			setRcvDd((Integer)value);
			break;
		case -2095791953:/* dntnAtsEndDt */
			setDntnAtsEndDt((String)value);
			break;
		case 29685867:/* patnAscnAcno */
			setPatnAscnAcno((String)value);
			break;
		case 1349750471:/* patnAscnNm */
			setPatnAscnNm((String)value);
			break;
		case -997547518:/* aimFdNm */
			setAimFdNm((String)value);
			break;
		case -1107417978:/* patnAscnDis */
			setPatnAscnDis((String)value);
			break;
		case 1239596980:/* patnHpNo */
			setPatnHpNo((String)value);
			break;
		case 1658990697:/* chilRrno */
			setChilRrno((String)value);
			break;
		case -247111581:/* dntnInfOfrAgrYn */
			setDntnInfOfrAgrYn((String)value);
			break;
		case 1815772905:/* dntnlCd */
			setDntnlCd((String)value);
			break;
		case -715164675:/* clsaAtsRqYn */
			setClsaAtsRqYn((String)value);
			break;
		case -242238508:/* clsaAtsPmnyAcno */
			setClsaAtsPmnyAcno((String)value);
			break;
		case -707354206:/* clsaAtsEndDt */
			setClsaAtsEndDt((String)value);
			break;
		case 1484386473:/* fncTaxtSmsRqYn */
			setFncTaxtSmsRqYn((String)value);
			break;
		case 992993977:/* wfFclUnqNo */
			setWfFclUnqNo((String)value);
			break;
		case 519431248:/* locaPrmeYn */
			setLocaPrmeYn((String)value);
			break;
		case -1087226435:/* afiBzcd */
			setAfiBzcd((String)value);
			break;
		case -981665062:/* emlNtcSrvcYn */
			setEmlNtcSrvcYn((String)value);
			break;
		case 1020510932:/* fmbkCtrdCollYn */
			setFmbkCtrdCollYn((String)value);
			break;
		case 339530610:/* adrpRgsYn */
			setAdrpRgsYn((String)value);
			break;
		case 103686120:/* mbhYn */
			setMbhYn((String)value);
			break;
		case -1570125365:/* psnInfAgrYn */
			setPsnInfAgrYn((String)value);
			break;
		case 2068858330:/* datAcldHpNo */
			setDatAcldHpNo((String)value);
			break;
		case 1110047335:/* dpsBatRqsNo */
			setDpsBatRqsNo((Integer)value);
			break;
		case 1603754886:/* dpsBatRqsSrno */
			setDpsBatRqsSrno((Integer)value);
			break;
		case 1004767133:/* agnpeEncyRrno */
			setAgnpeEncyRrno((String)value);
			break;
		case 1728197224:/* agnpeFnm */
			setAgnpeFnm((String)value);
			break;
		case -1494592534:/* rppeDupOmitYn */
			setRppeDupOmitYn((String)value);
			break;
		case -904354637:/* rppeAgnpeAcrdYn */
			setRppeAgnpeAcrdYn((String)value);
			break;
		case 1409183474:/* rppeFnm */
			setRppeFnm((String)value);
			break;
		case 1521062227:/* rppeEncyRrno */
			setRppeEncyRrno((String)value);
			break;
		case -1356444041:/* agnpeDupYn */
			setAgnpeDupYn((String)value);
			break;
		case 1308987521:/* rppeDupYn */
			setRppeDupYn((String)value);
			break;
		case 1503308429:/* itpyMecd */
			setItpyMecd((String)value);
			break;
		case 1503029739:/* itpyCycd */
			setItpyCycd((String)value);
			break;
		case -1550357257:/* nextItpyDt */
			setNextItpyDt((String)value);
			break;
		case -1559022651:/* actMngBrcd */
			setActMngBrcd((String)value);
			break;
		case -1057778271:/* asscNmnlDpstYn */
			setAsscNmnlDpstYn((String)value);
			break;
		case 1877105875:/* netrApvNo */
			setNetrApvNo((String)value);
			break;
		case 744763926:/* mbpbkJnngYn */
			setMbpbkJnngYn((String)value);
			break;
		case -650979620:/* mblPbokInetBnkgId */
			setMblPbokInetBnkgId((String)value);
			break;
		case 588598579:/* npbokIccadIsuDis */
			setNpbokIccadIsuDis((String)value);
			break;
		case 1657903882:/* ideedCd */
			setIdeedCd((String)value);
			break;
		case 1711452800:/* pbokEngPrngYn */
			setPbokEngPrngYn((String)value);
			break;
		case -1043880946:/* nlDscd */
			setNlDscd((String)value);
			break;
		case -1703684344:/* dpsDeedNo */
			setDpsDeedNo((String)value);
			break;
		case 1280152111:/* pbokIssuYn */
			setPbokIssuYn((String)value);
			break;
		case 1483988178:/* prdGdncPbokPrngYn */
			setPrdGdncPbokPrngYn((String)value);
			break;
		case 1256177185:/* nrsrCnfDocCollYn */
			setNrsrCnfDocCollYn((String)value);
			break;
		case -95053088:/* bokStttPermXtYn */
			setBokStttPermXtYn((String)value);
			break;
		case -1326243960:/* nrsrPwnoRgsYn */
			setNrsrPwnoRgsYn((String)value);
			break;
		case -2124073121:/* nrsrAccCd */
			setNrsrAccCd((String)value);
			break;
		case -591346182:/* krwDpsAccDscd */
			setKrwDpsAccDscd((String)value);
			break;
		case 627473395:/* nrsrKrwInfwDscd */
			setNrsrKrwInfwDscd((String)value);
			break;
		case -1552286250:/* txprDscd */
			setTxprDscd((String)value);
			break;
		case -869008711:/* txprLmtAm */
			if ( value instanceof String ){
				setTxprLmtAm((String)value);
			}
			else if ( value instanceof Double ){
				setTxprLmtAm((Double)value);
			}
			else if ( value instanceof Long ){
				setTxprLmtAm((Long)value);
			}
			else{
				setTxprLmtAm((BigDecimal)value);
			}
			break;
		case -980169613:/* prchAm */
			if ( value instanceof String ){
				setPrchAm((String)value);
			}
			else if ( value instanceof Double ){
				setPrchAm((Double)value);
			}
			else if ( value instanceof Long ){
				setPrchAm((Long)value);
			}
			else{
				setPrchAm((BigDecimal)value);
			}
			break;
		case -464486348:/* pmbilAm */
			if ( value instanceof String ){
				setPmbilAm((String)value);
			}
			else if ( value instanceof Double ){
				setPmbilAm((Double)value);
			}
			else if ( value instanceof Long ){
				setPmbilAm((Long)value);
			}
			else{
				setPmbilAm((BigDecimal)value);
			}
			break;
		case -1368045550:/* cackAm */
			if ( value instanceof String ){
				setCackAm((String)value);
			}
			else if ( value instanceof Double ){
				setCackAm((Double)value);
			}
			else if ( value instanceof Long ){
				setCackAm((Long)value);
			}
			else{
				setCackAm((BigDecimal)value);
			}
			break;
		case 1599309742:/* bokBchkAm */
			if ( value instanceof String ){
				setBokBchkAm((String)value);
			}
			else if ( value instanceof Double ){
				setBokBchkAm((Double)value);
			}
			else if ( value instanceof Long ){
				setBokBchkAm((Long)value);
			}
			else{
				setBokBchkAm((BigDecimal)value);
			}
			break;
		case 2144945120:/* etcDeedAm */
			if ( value instanceof String ){
				setEtcDeedAm((String)value);
			}
			else if ( value instanceof Double ){
				setEtcDeedAm((Double)value);
			}
			else if ( value instanceof Long ){
				setEtcDeedAm((Long)value);
			}
			else{
				setEtcDeedAm((BigDecimal)value);
			}
			break;
		case 84428401:/* fncTrnAimCd */
			setFncTrnAimCd((String)value);
			break;
		case -2132691081:/* trnFdSrcCd */
			setTrnFdSrcCd((String)value);
			break;
		case -1690878928:/* fdOwpeYn */
			setFdOwpeYn((String)value);
			break;
		case -1677669792:/* fncTrnAimTxt */
			setFncTrnAimTxt((String)value);
			break;
		case 451300217:/* trnFdSrcCdTxt */
			setTrnFdSrcCdTxt((String)value);
			break;
		case -1158038345:/* ckbilKdcd */
			setCkbilKdcd((String)value);
			break;
		case 133246974:/* cacGramRcvYn */
			setCacGramRcvYn((String)value);
			break;
		case 1215026200:/* cacGramRcvCrtdIsuYn */
			setCacGramRcvCrtdIsuYn((String)value);
			break;
		case 133246229:/* cacGramRcvAm */
			if ( value instanceof String ){
				setCacGramRcvAm((String)value);
			}
			else if ( value instanceof Double ){
				setCacGramRcvAm((Double)value);
			}
			else if ( value instanceof Long ){
				setCacGramRcvAm((Long)value);
			}
			else{
				setCacGramRcvAm((BigDecimal)value);
			}
			break;
		case 135524760:/* cacGramTrfAm */
			if ( value instanceof String ){
				setCacGramTrfAm((String)value);
			}
			else if ( value instanceof Double ){
				setCacGramTrfAm((Double)value);
			}
			else if ( value instanceof Long ){
				setCacGramTrfAm((Long)value);
			}
			else{
				setCacGramTrfAm((BigDecimal)value);
			}
			break;
		case -622778580:/* cacGramBchkAm */
			if ( value instanceof String ){
				setCacGramBchkAm((String)value);
			}
			else if ( value instanceof Double ){
				setCacGramBchkAm((Double)value);
			}
			else if ( value instanceof Long ){
				setCacGramBchkAm((Long)value);
			}
			else{
				setCacGramBchkAm((BigDecimal)value);
			}
			break;
		case -208075148:/* feeRcvYn */
			setFeeRcvYn((String)value);
			break;
		case -247169580:/* feeCshtfDscd */
			setFeeCshtfDscd((String)value);
			break;
		case -206696081:/* rctsOupYn */
			setRctsOupYn((String)value);
			break;
		case 97307218:/* feeAm */
			if ( value instanceof String ){
				setFeeAm((String)value);
			}
			else if ( value instanceof Double ){
				setFeeAm((Double)value);
			}
			else if ( value instanceof Long ){
				setFeeAm((Long)value);
			}
			else{
				setFeeAm((BigDecimal)value);
			}
			break;
		case 1208987208:/* wdrAcno */
			setWdrAcno((String)value);
			break;
		case 1115501300:/* encyWdrActPwno */
			setEncyWdrActPwno((String)value);
			break;
		case 1139815822:/* xprRcvAcno */
			setXprRcvAcno((String)value);
			break;
		case 1980302402:/* irprmTgt1Dscd */
			setIrprmTgt1Dscd((Integer)value);
			break;
		case 1981225923:/* irprmTgt2Dscd */
			setIrprmTgt2Dscd((Integer)value);
			break;
		case 1982149444:/* irprmTgt3Dscd */
			setIrprmTgt3Dscd((Integer)value);
			break;
		case 1983072965:/* irprmTgt4Dscd */
			setIrprmTgt4Dscd((Integer)value);
			break;
		case 1983996486:/* irprmTgt5Dscd */
			setIrprmTgt5Dscd((Integer)value);
			break;
		case 1984920007:/* irprmTgt6Dscd */
			setIrprmTgt6Dscd((Integer)value);
			break;
		case -222942112:/* xprPrcMecd */
			setXprPrcMecd((String)value);
			break;
		case 763548415:/* dntnAtsAcno */
			setDntnAtsAcno((String)value);
			break;
		case -984022834:/* newFdDscd */
			setNewFdDscd((String)value);
			break;
		case 605662444:/* spcfMonyTrtAcno */
			setSpcfMonyTrtAcno((String)value);
			break;
		case -1361380690:/* pnsnPayTemEstYn */
			setPnsnPayTemEstYn((String)value);
			break;
		case -1032004229:/* pnsnPayCtrtmYcnt */
			setPnsnPayCtrtmYcnt((Integer)value);
			break;
		case -1923223290:/* pnsnPayCycd */
			setPnsnPayCycd((String)value);
			break;
		case 2025043508:/* lnoActPbokIssuYn */
			setLnoActPbokIssuYn((String)value);
			break;
		case 166863541:/* bscAcno */
			setBscAcno((String)value);
			break;
		case 668739011:/* oldAtrbXtRncd */
			setOldAtrbXtRncd((String)value);
			break;
		case -625014766:/* cpblChckTgtYn */
			setCpblChckTgtYn((String)value);
			break;
		case -1901611743:/* rpcmDpstTgtYn */
			setRpcmDpstTgtYn((String)value);
			break;
		case -961723368:/* oldAtrbCeoRgsrDrtrYn */
			setOldAtrbCeoRgsrDrtrYn((String)value);
			break;
		case -2077964290:/* oldAtrbApvNo */
			setOldAtrbApvNo((String)value);
			break;
		case -1630016160:/* rdepAcno */
			setRdepAcno((String)value);
			break;
		case 7620528:/* oldAtrbApvRsn */
			setOldAtrbApvRsn((String)value);
			break;
		case 1765378561:/* oldAtrbChckTim */
			setOldAtrbChckTim((String)value);
			break;
		case 1360308437:/* ccadRsltInqYn */
			setCcadRsltInqYn((String)value);
			break;
		case 233144316:/* tbkCcadHldgYn */
			setTbkCcadHldgYn((String)value);
			break;
		case -569349659:/* cadStlActTbkYn */
			setCadStlActTbkYn((String)value);
			break;
		case -108108410:/* ccadBasRsltAm */
			if ( value instanceof String ){
				setCcadBasRsltAm((String)value);
			}
			else if ( value instanceof Double ){
				setCcadBasRsltAm((Double)value);
			}
			else if ( value instanceof Long ){
				setCcadBasRsltAm((Long)value);
			}
			else{
				setCcadBasRsltAm((BigDecimal)value);
			}
			break;
		case 1210610464:/* utzRsltBasStaDt */
			setUtzRsltBasStaDt((String)value);
			break;
		case 1197505307:/* utzRsltBasEndDt */
			setUtzRsltBasEndDt((String)value);
			break;
		case -1681359344:/* utzRsltInqTim */
			setUtzRsltInqTim((String)value);
			break;
		case 1146509975:/* amfRispeDis */
			setAmfRispeDis((String)value);
			break;
		case 1146512046:/* amfRispeFnm */
			setAmfRispeFnm((String)value);
			break;
		case 1182496536:/* amfRispeRrno */
			setAmfRispeRrno((String)value);
			break;
		case 1182045413:/* amfRispeCnad */
			setAmfRispeCnad((String)value);
			break;
		case 1964668025:/* anrvNprcYn */
			setAnrvNprcYn((String)value);
			break;
		case 1582003233:/* pbamAcno */
			setPbamAcno((String)value);
			break;
		case 956239259:/* pbamSnnmAcno */
			setPbamSnnmAcno((String)value);
			break;
		case 872364465:/* pmnyTrnUnqNo */
			setPmnyTrnUnqNo((String)value);
			break;
		case -310048034:/* ctrtmMcn */
			setCtrtmMcn((Integer)value);
			break;
		case -1021822465:/* ctrtmDcnt */
			setCtrtmDcnt((Integer)value);
			break;
		case 114270890:/* xprDt */
			setXprDt((String)value);
			break;
		case -936519932:/* rcknDt */
			setRcknDt((String)value);
			break;
		case -262826183:/* encyAtsActPwno */
			setEncyAtsActPwno((String)value);
			break;
		case -677154281:/* atsCycd */
			setAtsCycd((String)value);
			break;
		case 497678352:/* atsStaDt */
			setAtsStaDt((String)value);
			break;
		case 484573195:/* atsEndDt */
			setAtsEndDt((String)value);
			break;
		case -677158125:/* atsCucd */
			setAtsCucd((String)value);
			break;
		case 93150016:/* atsDd */
			setAtsDd((Integer)value);
			break;
		case -676875581:/* atsMecn */
			setAtsMecn((Integer)value);
			break;
		case -677234653:/* atsAcno */
			setAtsAcno((String)value);
			break;
		case 93149932:/* atsAm */
			if ( value instanceof String ){
				setAtsAm((String)value);
			}
			else if ( value instanceof Double ){
				setAtsAm((Double)value);
			}
			else if ( value instanceof Long ){
				setAtsAm((Long)value);
			}
			else{
				setAtsAm((BigDecimal)value);
			}
			break;
		case -1118720153:/* tbkSltCopCd */
			setTbkSltCopCd((String)value);
			break;
		case 1767082042:/* tbkSltCopOfemYn */
			setTbkSltCopOfemYn((String)value);
			break;
		case 453654616:/* dntnRqYn */
			setDntnRqYn((String)value);
			break;
		case 1679381792:/* dntnAmDscd */
			setDntnAmDscd((String)value);
			break;
		case -1326901296:/* dntnAm */
			if ( value instanceof String ){
				setDntnAm((String)value);
			}
			else if ( value instanceof Double ){
				setDntnAm((Double)value);
			}
			else if ( value instanceof Long ){
				setDntnAm((Long)value);
			}
			else{
				setDntnAm((BigDecimal)value);
			}
			break;
		case -1327737733:/* xprCancRcvAcno */
			setXprCancRcvAcno((String)value);
			break;
		case 357035736:/* bchrCponNo */
			setBchrCponNo((String)value);
			break;
		case 857726159:/* bchrSupAm */
			if ( value instanceof String ){
				setBchrSupAm((String)value);
			}
			else if ( value instanceof Double ){
				setBchrSupAm((Double)value);
			}
			else if ( value instanceof Long ){
				setBchrSupAm((Long)value);
			}
			else{
				setBchrSupAm((BigDecimal)value);
			}
			break;
		case -255883391:/* bchrCusPidAm */
			if ( value instanceof String ){
				setBchrCusPidAm((String)value);
			}
			else if ( value instanceof Double ){
				setBchrCusPidAm((Double)value);
			}
			else if ( value instanceof Long ){
				setBchrCusPidAm((Long)value);
			}
			else{
				setBchrCusPidAm((BigDecimal)value);
			}
			break;
		case 93034056:/* apvNo */
			setApvNo((String)value);
			break;
		case -1799837970:/* cponCrtfNo */
			setCponCrtfNo((String)value);
			break;
		case -426456863:/* autoRdepYn */
			setAutoRdepYn((String)value);
			break;
		case -1755433283:/* insuJnngAgrYn */
			setInsuJnngAgrYn((String)value);
			break;
		case 823346292:/* jnngTgtDscd */
			setJnngTgtDscd((String)value);
			break;
		case 1444719711:/* ccadHldgYn */
			setCcadHldgYn((String)value);
			break;
		case -976460710:/* frcsDshgDt */
			setFrcsDshgDt((String)value);
			break;
		case 1971532759:/* cusDgnPrdNm */
			setCusDgnPrdNm((String)value);
			break;
		case 113880677:/* xcoCd */
			setXcoCd((String)value);
			break;
		case -1282173947:/* frndAcno */
			setFrndAcno((String)value);
			break;
		case -2129558626:/* spdtDgnMm */
			setSpdtDgnMm((Integer)value);
			break;
		case -2129558914:/* spdtDgnDd */
			setSpdtDgnDd((Integer)value);
			break;
		case 93024294:/* aplIr */
			if ( value instanceof String ){
				setAplIr((String)value);
			}
			else if ( value instanceof Double ){
				setAplIr((Double)value);
			}
			else if ( value instanceof Long ){
				setAplIr((Long)value);
			}
			else{
				setAplIr((BigDecimal)value);
			}
			break;
		case -825753295:/* emlFpAcblNtfcRqYn */
			setEmlFpAcblNtfcRqYn((String)value);
			break;
		case -826227682:/* emlFpAcblNtfcBsdt */
			setEmlFpAcblNtfcBsdt((Integer)value);
			break;
		case -656234988:/* fpPrftRtSmsNtfcRqYn */
			setFpPrftRtSmsNtfcRqYn((String)value);
			break;
		case -656709375:/* fpPrftRtSmsNtfcBsdt */
			setFpPrftRtSmsNtfcBsdt((Integer)value);
			break;
		case 1160473720:/* goalPrSmsRqYn */
			setGoalPrSmsRqYn((String)value);
			break;
		case -1240657803:/* goalPr */
			if ( value instanceof String ){
				setGoalPr((String)value);
			}
			else if ( value instanceof Double ){
				setGoalPr((Double)value);
			}
			else if ( value instanceof Long ){
				setGoalPr((Long)value);
			}
			else{
				setGoalPr((BigDecimal)value);
			}
			break;
		case 92915918:/* alwPr */
			if ( value instanceof String ){
				setAlwPr((String)value);
			}
			else if ( value instanceof Double ){
				setAlwPr((Double)value);
			}
			else if ( value instanceof Long ){
				setAlwPr((Long)value);
			}
			else{
				setAlwPr((BigDecimal)value);
			}
			break;
		case -1687387644:/* gBnkgGoalPrftRtDscd */
			setgBnkgGoalPrftRtDscd((String)value);
			break;
		case 487049616:/* gBnkgAlwLossDscd */
			setgBnkgAlwLossDscd((String)value);
			break;
		case -1535536517:/* fcPsklUseYn */
			setFcPsklUseYn((String)value);
			break;
		case 1350599199:/* xrtTsTycd */
			setXrtTsTycd((String)value);
			break;
		case -808961584:/* xrtMaxAcldAm */
			if ( value instanceof String ){
				setXrtMaxAcldAm((String)value);
			}
			else if ( value instanceof Double ){
				setXrtMaxAcldAm((Double)value);
			}
			else if ( value instanceof Long ){
				setXrtMaxAcldAm((Long)value);
			}
			else{
				setXrtMaxAcldAm((BigDecimal)value);
			}
			break;
		case 1015293134:/* dgnXrtNtfcSrvcDscd */
			setDgnXrtNtfcSrvcDscd((String)value);
			break;
		case -789993922:/* ntfcSrvcDgnXrt */
			if ( value instanceof String ){
				setNtfcSrvcDgnXrt((String)value);
			}
			else if ( value instanceof Double ){
				setNtfcSrvcDgnXrt((Double)value);
			}
			else if ( value instanceof Long ){
				setNtfcSrvcDgnXrt((Long)value);
			}
			else{
				setNtfcSrvcDgnXrt((BigDecimal)value);
			}
			break;
		case 943253015:/* ovtbCdno */
			setOvtbCdno((String)value);
			break;
		case -1761740099:/* fmbkCoNo */
			setFmbkCoNo((String)value);
			break;
		case 492572543:/* atrnDscd */
			setAtrnDscd((String)value);
			break;
		case 1567089199:/* rvactNo */
			setRvactNo((String)value);
			break;
		case -939304859:/* irRotCycd */
			setIrRotCycd((String)value);
			break;
		case 1177542373:/* fcfndInfwDscd */
			setFcfndInfwDscd((String)value);
			break;
		case 768300679:/* fcDpsAccDscd */
			setFcDpsAccDscd((String)value);
			break;
		case -164140767:/* fornXchStttCrtcSbmtDis */
			setFornXchStttCrtcSbmtDis((String)value);
			break;
		case 1650952748:/* fxRapRncd */
			setFxRapRncd((String)value);
			break;
		case 2010731017:/* payRncdCfcd */
			setPayRncdCfcd((String)value);
			break;
		case 3210956:/* hsCd */
			setHsCd((String)value);
			break;
		case -1176494947:/* ivpeId */
			setIvpeId((String)value);
			break;
		case -771083937:/* secrComNm */
			setSecrComNm((String)value);
			break;
		case -1066138069:/* fcApvCd */
			setFcApvCd((String)value);
			break;
		case -596857090:/* pnsnAcldCtrYcnt */
			setPnsnAcldCtrYcnt((Integer)value);
			break;
		case 257829674:/* pnsnAcldCtrMcn */
			setPnsnAcldCtrMcn((Integer)value);
			break;
		case 1044252064:/* pnsnRcveBgnDt */
			setPnsnRcveBgnDt((String)value);
			break;
		case 33510681:/* prftRtRptdSndDscd */
			setPrftRtRptdSndDscd((String)value);
			break;
		case -494698432:/* rprhLnkNewYn */
			setRprhLnkNewYn((String)value);
			break;
		case 1271011147:/* rprhLnkCancAcno */
			setRprhLnkCancAcno((String)value);
			break;
		case 787083722:/* rprhLnkTamNewYn */
			setRprhLnkTamNewYn((String)value);
			break;
		case 900845967:/* afepAddPidYn */
			setAfepAddPidYn((String)value);
			break;
		case -719863791:/* fndPdcd */
			setFndPdcd((String)value);
			break;
		case -1378958647:/* fndScntRqdcNprtYn */
			setFndScntRqdcNprtYn((String)value);
			break;
		case -1743106203:/* opgPtsNtcSndDscd */
			setOpgPtsNtcSndDscd((String)value);
			break;
		case -1687029813:/* gBnkgGoalPrftRtPsnb */
			setgBnkgGoalPrftRtPsnb((Integer)value);
			break;
		case -1687402702:/* gBnkgGoalPrftRtDcml */
			setgBnkgGoalPrftRtDcml((String)value);
			break;
		case 304429241:/* gBnkgAlwLossRtPsnb */
			setgBnkgAlwLossRtPsnb((Integer)value);
			break;
		case 304056352:/* gBnkgAlwLossRtDcml */
			setgBnkgAlwLossRtDcml((String)value);
			break;
		case -631213081:/* wooriOnwlMoAcno */
			setWooriOnwlMoAcno((String)value);
			break;
		case 289454902:/* bznUseActYn */
			setBznUseActYn((String)value);
			break;
		case 1041767737:/* agnpeItcsno */
			setAgnpeItcsno((String)value);
			break;
		case 2065767535:/* rppeItcsno */
			setRppeItcsno((String)value);
			break;
		case -1379524886:/* atsNaNtfcRqYn */
			setAtsNaNtfcRqYn((String)value);
			break;
		case 1636035056:/* acldFndTsXprNtfcRqYn */
			setAcldFndTsXprNtfcRqYn((String)value);
			break;
		case -854254849:/* fwxcAcno */
			setFwxcAcno((String)value);
			break;
		case 35579973:/* fndCnvrTmntAcno */
			setFndCnvrTmntAcno((String)value);
			break;
		case 1279325165:/* dvdamRinvDscd */
			setDvdamRinvDscd((String)value);
			break;
		case 294247282:/* fndCnvrNewYn */
			setFndCnvrNewYn((String)value);
			break;
		case 853379231:/* lonXprAdvnYn */
			setLonXprAdvnYn((String)value);
			break;
		case -1164549312:/* lnApvCmplYn */
			setLnApvCmplYn((String)value);
			break;
		case -2038020595:/* priPrpeBrNm */
			setPriPrpeBrNm((String)value);
			break;
		case 291524674:/* grnTrno */
			setGrnTrno((String)value);
			break;
		case 1302299740:/* escrUnmrNo */
			setEscrUnmrNo((String)value);
			break;
		case -2038063807:/* priPrpeAcno */
			setPriPrpeAcno((String)value);
			break;
		case -975757958:/* prpeAcno */
			setPrpeAcno((String)value);
			break;
		case -24308916:/* priPrpeBzpeNo */
			setPriPrpeBzpeNo((String)value);
			break;
		case -1350604475:/* prpeBzpeNo */
			setPrpeBzpeNo((String)value);
			break;
		case -1701058186:/* ppmtAmRcveAcno */
			setPpmtAmRcveAcno((String)value);
			break;
		case -1008188424:/* orcpPrpeCsno */
			setOrcpPrpeCsno((String)value);
			break;
		case 1913010598:/* pftPrpeCsno */
			setPftPrpeCsno((String)value);
			break;
		case -1072495445:/* orcpPrpeNrsrCollYn */
			setOrcpPrpeNrsrCollYn((String)value);
			break;
		case -274628647:/* pftPrpeNrsrCollYn */
			setPftPrpeNrsrCollYn((String)value);
			break;
		case 559017583:/* pocpPfeAm */
			if ( value instanceof String ){
				setPocpPfeAm((String)value);
			}
			else if ( value instanceof Double ){
				setPocpPfeAm((Double)value);
			}
			else if ( value instanceof Long ){
				setPocpPfeAm((Long)value);
			}
			else{
				setPocpPfeAm((BigDecimal)value);
			}
			break;
		case -1433614347:/* etfTprt */
			setEtfTprt((Integer)value);
			break;
		case -1330828840:/* opgOrdsTxt */
			setOpgOrdsTxt((String)value);
			break;
		case -911489075:/* sa1Txt */
			setSa1Txt((String)value);
			break;
		case -911459284:/* sa2Txt */
			setSa2Txt((String)value);
			break;
		case -911429493:/* sa3Txt */
			setSa3Txt((String)value);
			break;
		case -895606634:/* sptxYn */
			setSptxYn((String)value);
			break;
		case 2093137534:/* nnmCsno */
			setNnmCsno((String)value);
			break;
		case -484681714:/* fndItmsCd */
			setFndItmsCd((String)value);
			break;
		case -2120282550:/* dpsRcvAm */
			if ( value instanceof String ){
				setDpsRcvAm((String)value);
			}
			else if ( value instanceof Double ){
				setDpsRcvAm((Double)value);
			}
			else if ( value instanceof Long ){
				setDpsRcvAm((Long)value);
			}
			else{
				setDpsRcvAm((BigDecimal)value);
			}
			break;
		case 110624756:/* trfAm */
			if ( value instanceof String ){
				setTrfAm((String)value);
			}
			else if ( value instanceof Double ){
				setTrfAm((Double)value);
			}
			else if ( value instanceof Long ){
				setTrfAm((Long)value);
			}
			else{
				setTrfAm((BigDecimal)value);
			}
			break;
		case -1394678704:/* bchkAm */
			if ( value instanceof String ){
				setBchkAm((String)value);
			}
			else if ( value instanceof Double ){
				setBchkAm((Double)value);
			}
			else if ( value instanceof Long ){
				setBchkAm((Long)value);
			}
			else{
				setBchkAm((BigDecimal)value);
			}
			break;
		case -1390536655:/* bchkInqmAm */
			if ( value instanceof String ){
				setBchkInqmAm((String)value);
			}
			else if ( value instanceof Double ){
				setBchkInqmAm((Double)value);
			}
			else if ( value instanceof Long ){
				setBchkInqmAm((Long)value);
			}
			else{
				setBchkInqmAm((BigDecimal)value);
			}
			break;
		case 490977719:/* inqmScnt */
			setInqmScnt((Integer)value);
			break;
		case -536106856:/* inqmFeeXmpDis */
			setInqmFeeXmpDis((String)value);
			break;
		case -602269923:/* tamTrfYn */
			setTamTrfYn((String)value);
			break;
		case 3455562:/* pxrt */
			setPxrt((Integer)value);
			break;
		case -913709596:/* krwTrfAm */
			if ( value instanceof String ){
				setKrwTrfAm((String)value);
			}
			else if ( value instanceof Double ){
				setKrwTrfAm((Double)value);
			}
			else if ( value instanceof Long ){
				setKrwTrfAm((Long)value);
			}
			else{
				setKrwTrfAm((BigDecimal)value);
			}
			break;
		case 3064915:/* cucd */
			setCucd((String)value);
			break;
		case -2040077275:/* ioffSbDscd */
			setIoffSbDscd((String)value);
			break;
		case 1238782650:/* cshtfDscd */
			setCshtfDscd((String)value);
			break;
		case -1172132390:/* cshFeeLevyDscd */
			setCshFeeLevyDscd((String)value);
			break;
		case -1351307666:/* cshFee */
			if ( value instanceof String ){
				setCshFee((String)value);
			}
			else if ( value instanceof Double ){
				setCshFee((Double)value);
			}
			else if ( value instanceof Long ){
				setCshFee((Long)value);
			}
			else{
				setCshFee((BigDecimal)value);
			}
			break;
		case 619892827:/* tgtKrwAm */
			if ( value instanceof String ){
				setTgtKrwAm((String)value);
			}
			else if ( value instanceof Double ){
				setTgtKrwAm((Double)value);
			}
			else if ( value instanceof Long ){
				setTgtKrwAm((Long)value);
			}
			else{
				setTgtKrwAm((BigDecimal)value);
			}
			break;
		case -1048547017:/* fcTrfAm */
			if ( value instanceof String ){
				setFcTrfAm((String)value);
			}
			else if ( value instanceof Double ){
				setFcTrfAm((Double)value);
			}
			else if ( value instanceof Long ){
				setFcTrfAm((Long)value);
			}
			else{
				setFcTrfAm((BigDecimal)value);
			}
			break;
		case 1430235190:/* fcCshRcvAm */
			if ( value instanceof String ){
				setFcCshRcvAm((String)value);
			}
			else if ( value instanceof Double ){
				setFcCshRcvAm((Double)value);
			}
			else if ( value instanceof Long ){
				setFcCshRcvAm((Long)value);
			}
			else{
				setFcCshRcvAm((BigDecimal)value);
			}
			break;
		case -1354934627:/* coinAm */
			if ( value instanceof String ){
				setCoinAm((String)value);
			}
			else if ( value instanceof Double ){
				setCoinAm((Double)value);
			}
			else if ( value instanceof Long ){
				setCoinAm((Long)value);
			}
			else{
				setCoinAm((BigDecimal)value);
			}
			break;
		case 3300453:/* krfd */
			if ( value instanceof String ){
				setKrfd((String)value);
			}
			else if ( value instanceof Double ){
				setKrfd((Double)value);
			}
			else if ( value instanceof Long ){
				setKrfd((Long)value);
			}
			else{
				setKrfd((BigDecimal)value);
			}
			break;
		case 93037099:/* apxrt */
			if ( value instanceof String ){
				setApxrt((String)value);
			}
			else if ( value instanceof Double ){
				setApxrt((Double)value);
			}
			else if ( value instanceof Long ){
				setApxrt((Long)value);
			}
			else{
				setApxrt((BigDecimal)value);
			}
			break;
		case 914284991:/* cusPrmeXrt */
			if ( value instanceof String ){
				setCusPrmeXrt((String)value);
			}
			else if ( value instanceof Double ){
				setCusPrmeXrt((Double)value);
			}
			else if ( value instanceof Long ){
				setCusPrmeXrt((Long)value);
			}
			else{
				setCusPrmeXrt((BigDecimal)value);
			}
			break;
		case 1057094263:/* ioffSbRt */
			if ( value instanceof String ){
				setIoffSbRt((String)value);
			}
			else if ( value instanceof Double ){
				setIoffSbRt((Double)value);
			}
			else if ( value instanceof Long ){
				setIoffSbRt((Long)value);
			}
			else{
				setIoffSbRt((BigDecimal)value);
			}
			break;
		case 839505025:/* fwxcCtrMcnt */
			setFwxcCtrMcnt((String)value);
			break;
		case 1844635427:/* newAcno */
			setNewAcno((String)value);
			break;
		case -583209759:/* ksdFndNo */
			setKsdFndNo((String)value);
			break;
		case 1364541398:/* rtpenTrnDisNo */
			setRtpenTrnDisNo((String)value);
			break;
		case 939982363:/* rcmGoalAm */
			if ( value instanceof String ){
				setRcmGoalAm((String)value);
			}
			else if ( value instanceof Double ){
				setRcmGoalAm((Double)value);
			}
			else if ( value instanceof Long ){
				setRcmGoalAm((Long)value);
			}
			else{
				setRcmGoalAm((BigDecimal)value);
			}
			break;
		case 1075545850:/* jnngCtgrCd */
			setJnngCtgrCd((String)value);
			break;
		case -531519760:/* rcpMdKdcd */
			setRcpMdKdcd((String)value);
			break;
		case -1941940173:/* hsscMajTxtPbokPrngYn */
			setHsscMajTxtPbokPrngYn((String)value);
			break;
		case 384871375:/* prdDesOupYn */
			setPrdDesOupYn((String)value);
			break;
		case 2067227086:/* acicJnngYn */
			setAcicJnngYn((String)value);
			break;
		case -773472811:/* hsscNewDscd */
			setHsscNewDscd((String)value);
			break;
		case 1870153120:/* hsscRgslZpno */
			setHsscRgslZpno((String)value);
			break;
		case -122175277:/* hsscInddRgsYn */
			setHsscInddRgsYn((String)value);
			break;
		case 1677724537:/* hsscHopeRgnZpno */
			setHsscHopeRgnZpno((String)value);
			break;
		case 170129098:/* hopeHousKdDscd */
			setHopeHousKdDscd((String)value);
			break;
		case 1062800235:/* housXuseSqmDscd */
			setHousXuseSqmDscd((String)value);
			break;
		case -270407855:/* hopeMovinYm */
			setHopeMovinYm((String)value);
			break;
		case -749415327:/* esnsNewRgsDt */
			setEsnsNewRgsDt((String)value);
			break;
		case -749414838:/* esnsNewRgsTm */
			setEsnsNewRgsTm((String)value);
			break;
		case -1232451990:/* esnsNewEbnkUtzpeNo */
			setEsnsNewEbnkUtzpeNo((String)value);
			break;
		case -676936134:/* atsKdcd */
			setAtsKdcd((String)value);
			break;
		case -2044904612:/* lnoActOpngRncd */
			setLnoActOpngRncd((String)value);
			break;
		case 1502469574:/* scanInfAcnmCnfDscd */
			setScanInfAcnmCnfDscd((String)value);
			break;
		case -1341759000:/* agnpeTrnYn */
			setAgnpeTrnYn((String)value);
			break;
		case -2040540129:/* dpsPwnoRgsDscd */
			setDpsPwnoRgsDscd((String)value);
			break;
		case 76728658:/* prrRgsPwnoKeyCnf */
			setPrrRgsPwnoKeyCnf((String)value);
			break;
		case -1157459584:/* encyActPwnoCnf */
			setEncyActPwnoCnf((String)value);
			break;
		case -2098541095:/* wdcPbokYn */
			setWdcPbokYn((String)value);
			break;
		case -665044733:/* wooriLovPlsDntnAscnDscd */
			setWooriLovPlsDntnAscnDscd((String)value);
			break;
		case -1313232124:/* sameRqdcSrno */
			setSameRqdcSrno((Integer)value);
			break;
		case -291943452:/* etcDeedDscd */
			setEtcDeedDscd((String)value);
			break;
		case -1693075242:/* actApvNo */
			setActApvNo((String)value);
			break;
		case -886272249:/* fndRblnNewYn */
			setFndRblnNewYn((String)value);
			break;
		case 276419514:/* bgnnRcvWdrYn */
			setBgnnRcvWdrYn((String)value);
			break;
		case 150370432:/* copItcsno */
			setCopItcsno((String)value);
			break;
		case 1845945671:/* inbkNewYn */
			setInbkNewYn((String)value);
			break;
		case 394059857:/* smrtBnkgNewYn */
			setSmrtBnkgNewYn((String)value);
			break;
		case 2019041518:/* tlbnkNewYn */
			setTlbnkNewYn((String)value);
			break;
		case -528795175:/* ntsvcRgsYn */
			setNtsvcRgsYn((String)value);
			break;
		case 443661432:/* inbkWdrActRgsYn */
			setInbkWdrActRgsYn((String)value);
			break;
		case -1667085630:/* inetBnkgUserId */
			setInetBnkgUserId((String)value);
			break;
		case -38243262:/* ebnkPwno */
			setEbnkPwno((String)value);
			break;
		case 96654141:/* engNm */
			setEngNm((String)value);
			break;
		case 468230409:/* tms1TsLmtAm */
			if ( value instanceof String ){
				setTms1TsLmtAm((String)value);
			}
			else if ( value instanceof Double ){
				setTms1TsLmtAm((Double)value);
			}
			else if ( value instanceof Long ){
				setTms1TsLmtAm((Long)value);
			}
			else{
				setTms1TsLmtAm((BigDecimal)value);
			}
			break;
		case -251660717:/* d1TsLmtAm */
			if ( value instanceof String ){
				setD1TsLmtAm((String)value);
			}
			else if ( value instanceof Double ){
				setD1TsLmtAm((Double)value);
			}
			else if ( value instanceof Long ){
				setD1TsLmtAm((Long)value);
			}
			else{
				setD1TsLmtAm((BigDecimal)value);
			}
			break;
		case -741436093:/* secrdSrno */
			setSecrdSrno((String)value);
			break;
		case -944857320:/* otpcSrno */
			setOtpcSrno((String)value);
			break;
		case -1006585838:/* otpPwd */
			setOtpPwd((String)value);
			break;
		case 284284382:/* otpIsuCostXmpDscd */
			setOtpIsuCostXmpDscd((String)value);
			break;
		case 1841455820:/* datDpsTelNo */
			setDatDpsTelNo((String)value);
			break;
		case 868086538:/* synpbDscd */
			setSynpbDscd((String)value);
			break;
		case 1043617891:/* inetBnkgRcpSrno */
			setInetBnkgRcpSrno((String)value);
			break;
		case 1481281197:/* inbkRsvRgbrCd */
			setInbkRsvRgbrCd((String)value);
			break;
		case 1987460871:/* inbkRsvRgsDt */
			setInbkRsvRgsDt((String)value);
			break;
		case -1310101225:/* inbkRsvRgsSrno */
			setInbkRsvRgsSrno((Integer)value);
			break;
		case 1885241755:/* smrtBnkgInetBnkgId */
			setSmrtBnkgInetBnkgId((String)value);
			break;
		case -28100074:/* smrtBnkgHpComCd */
			setSmrtBnkgHpComCd((String)value);
			break;
		case -387374866:/* smrtBnkgHpTlenNo */
			setSmrtBnkgHpTlenNo((String)value);
			break;
		case -831710836:/* smrtBnkgHpSrno */
			setSmrtBnkgHpSrno((String)value);
			break;
		case 1241461980:/* tlbnkSecrdSrno */
			setTlbnkSecrdSrno((String)value);
			break;
		case -1850926015:/* encyEbnkPwno */
			setEncyEbnkPwno((String)value);
			break;
		case 1463252384:/* tlbnkD1TsLmt */
			if ( value instanceof String ){
				setTlbnkD1TsLmt((String)value);
			}
			else if ( value instanceof Double ){
				setTlbnkD1TsLmt((Double)value);
			}
			else if ( value instanceof Long ){
				setTlbnkD1TsLmt((Long)value);
			}
			else{
				setTlbnkD1TsLmt((BigDecimal)value);
			}
			break;
		case -68009066:/* tlbnkTms1TsLmt */
			if ( value instanceof String ){
				setTlbnkTms1TsLmt((String)value);
			}
			else if ( value instanceof Double ){
				setTlbnkTms1TsLmt((Double)value);
			}
			else if ( value instanceof Long ){
				setTlbnkTms1TsLmt((Long)value);
			}
			else{
				setTlbnkTms1TsLmt((BigDecimal)value);
			}
			break;
		case -1534720706:/* ntsvcRawDscd */
			setNtsvcRawDscd((String)value);
			break;
		case -744301950:/* ntsvcBalNtyMarkYn */
			setNtsvcBalNtyMarkYn((String)value);
			break;
		case -1437134496:/* ntsvcHpComCd */
			setNtsvcHpComCd((String)value);
			break;
		case -1117768988:/* ntsvcHpTlenNo */
			setNtsvcHpTlenNo((String)value);
			break;
		case 508309762:/* ntsvcHpSrno */
			setNtsvcHpSrno((String)value);
			break;
		case 535926544:/* ntsvcInotAm */
			if ( value instanceof String ){
				setNtsvcInotAm((String)value);
			}
			else if ( value instanceof Double ){
				setNtsvcInotAm((Double)value);
			}
			else if ( value instanceof Long ){
				setNtsvcInotAm((Long)value);
			}
			else{
				setNtsvcInotAm((BigDecimal)value);
			}
			break;
		case -686985361:/* astPrtsNtcYn */
			setAstPrtsNtcYn((String)value);
			break;
		case -398628264:/* ntsvcTmsStaTim */
			setNtsvcTmsStaTim((String)value);
			break;
		case -804888131:/* ntsvcTmsEndTim */
			setNtsvcTmsEndTim((String)value);
			break;
		case -674760440:/* wdrActRgsInetBnkgId */
			setWdrActRgsInetBnkgId((String)value);
			break;
		case 482180673:/* ebnkWdrActCnccRgsYn */
			setEbnkWdrActCnccRgsYn((String)value);
			break;
		case -1313124972:/* tlbnkWdrActCnccRgsYn */
			setTlbnkWdrActCnccRgsYn((String)value);
			break;
		case -2013577298:/* hswfPbokDocSndYn */
			setHswfPbokDocSndYn((String)value);
			break;
		case -741547210:/* faOwacCsno */
			setFaOwacCsno((String)value);
			break;
		case 1237254481:/* flieRgsYn */
			setFlieRgsYn((String)value);
			break;
		case 93150677:/* atsYn */
			setAtsYn((String)value);
			break;
		case 83405797:/* hmnyUsgAm */
			if ( value instanceof String ){
				setHmnyUsgAm((String)value);
			}
			else if ( value instanceof Double ){
				setHmnyUsgAm((Double)value);
			}
			else if ( value instanceof Long ){
				setHmnyUsgAm((Long)value);
			}
			else{
				setHmnyUsgAm((BigDecimal)value);
			}
			break;
		case -1436963561:/* etcAcno */
			setEtcAcno((String)value);
			break;
		case 1965257592:/* trtpyRtPsnb */
			setTrtpyRtPsnb((String)value);
			break;
		case 1964884703:/* trtpyRtDcml */
			setTrtpyRtDcml((String)value);
			break;
		case 100672502:/* fltIrNtcDscd */
			setFltIrNtcDscd((String)value);
			break;
		case 783517470:/* etpCoplsDpstNewYn */
			setEtpCoplsDpstNewYn((String)value);
			break;
		case -676533775:/* atsXtYn */
			setAtsXtYn((String)value);
			break;
		case -1724502037:/* spslPdcd */
			setSpslPdcd((String)value);
			break;
		case 272541446:/* trtPocpPfeRtPsnb */
			setTrtPocpPfeRtPsnb((String)value);
			break;
		case 272168557:/* trtPocpPfeRtDcml */
			setTrtPocpPfeRtDcml((String)value);
			break;
		case -1971371805:/* trtDfanPfeRtPsnb */
			setTrtDfanPfeRtPsnb((String)value);
			break;
		case -1971744694:/* trtDfanPfeRtDcml */
			setTrtDfanPfeRtDcml((String)value);
			break;
		case 950464271:/* cponInpDscd */
			setCponInpDscd((String)value);
			break;
		case 1358216955:/* agmIrtPsnb */
			setAgmIrtPsnb((Integer)value);
			break;
		case 1357844066:/* agmIrtDcml */
			setAgmIrtDcml((String)value);
			break;
		case 1981397653:/* pbokOtln */
			setPbokOtln((String)value);
			break;
		case 212330625:/* ascnBlgCd */
			setAscnBlgCd((String)value);
			break;
		case 1897311392:/* acldCrtdSndDscd */
			setAcldCrtdSndDscd((String)value);
			break;
		case 1607433178:/* isaMajSbjPbokPrngYn */
			setIsaMajSbjPbokPrngYn((String)value);
			break;
		case -94610823:/* isaNewDscd */
			setIsaNewDscd((String)value);
			break;
		case -2143367580:/* isaJnngDscd */
			setIsaJnngDscd((String)value);
			break;
		case -1564790021:/* jnngAdvpeEno */
			setJnngAdvpeEno((String)value);
			break;
		case -1804579769:/* extxDscd */
			setExtxDscd((String)value);
			break;
		case -273030408:/* dtjnTemDscd */
			setDtjnTemDscd((String)value);
			break;
		case 135585494:/* mndDocCollYn */
			setMndDocCollYn((String)value);
			break;
		case -1298474816:/* enmtDt */
			setEnmtDt((String)value);
			break;
		case -1322647810:/* dshgDt */
			setDshgDt((String)value);
			break;
		case -1213750859:/* ctrmvIscd */
			setCtrmvIscd((String)value);
			break;
		case 993178430:/* rtrtInsuCnvrAm */
			if ( value instanceof String ){
				setRtrtInsuCnvrAm((String)value);
			}
			else if ( value instanceof Double ){
				setRtrtInsuCnvrAm((Double)value);
			}
			else if ( value instanceof Long ){
				setRtrtInsuCnvrAm((Long)value);
			}
			else{
				setRtrtInsuCnvrAm((BigDecimal)value);
			}
			break;
		case -348566472:/* aldJnpeTycd */
			setAldJnpeTycd((String)value);
			break;
		case 977698708:/* fstJnngDt */
			setFstJnngDt((String)value);
			break;
		case -1396265533:/* tfrAcno */
			setTfrAcno((String)value);
			break;
		case -985764150:/* planNo */
			setPlanNo((String)value);
			break;
		case 58838003:/* brdmKdcd */
			setBrdmKdcd((String)value);
			break;
		case -336598271:/* scdOrdsMngNo */
			setScdOrdsMngNo((String)value);
			break;
		case -2116109003:/* rtpenCobdnAm */
			if ( value instanceof String ){
				setRtpenCobdnAm((String)value);
			}
			else if ( value instanceof Double ){
				setRtpenCobdnAm((Double)value);
			}
			else if ( value instanceof Long ){
				setRtpenCobdnAm((Long)value);
			}
			else{
				setRtpenCobdnAm((BigDecimal)value);
			}
			break;
		case 569074111:/* rtpenPbdnAm */
			if ( value instanceof String ){
				setRtpenPbdnAm((String)value);
			}
			else if ( value instanceof Double ){
				setRtpenPbdnAm((Double)value);
			}
			else if ( value instanceof Long ){
				setRtpenPbdnAm((Long)value);
			}
			else{
				setRtpenPbdnAm((BigDecimal)value);
			}
			break;
		case -1904951034:/* opgMngFee */
			if ( value instanceof String ){
				setOpgMngFee((String)value);
			}
			else if ( value instanceof Double ){
				setOpgMngFee((Double)value);
			}
			else if ( value instanceof Long ){
				setOpgMngFee((Long)value);
			}
			else{
				setOpgMngFee((BigDecimal)value);
			}
			break;
		case -1470206335:/* asetMngFee */
			if ( value instanceof String ){
				setAsetMngFee((String)value);
			}
			else if ( value instanceof Double ){
				setAsetMngFee((Double)value);
			}
			else if ( value instanceof Long ){
				setAsetMngFee((Long)value);
			}
			else{
				setAsetMngFee((BigDecimal)value);
			}
			break;
		case -1888502226:/* stlAcno */
			setStlAcno((String)value);
			break;
		case 1180127566:/* encyStlActPwno */
			setEncyStlActPwno((String)value);
			break;
		case -1871037142:/* afepAddPidDscd */
			setAfepAddPidDscd((String)value);
			break;
		case 1335559067:/* rprhLnkNewDscd */
			setRprhLnkNewDscd((String)value);
			break;
		case -1886852355:/* cancRsvFndAcno */
			setCancRsvFndAcno((String)value);
			break;
		case -125751408:/* rprhAmTamNewDscd */
			setRprhAmTamNewDscd((String)value);
			break;
		case 875589485:/* xcoPrmeIrt */
			if ( value instanceof String ){
				setXcoPrmeIrt((String)value);
			}
			else if ( value instanceof Double ){
				setXcoPrmeIrt((Double)value);
			}
			else if ( value instanceof Long ){
				setXcoPrmeIrt((Long)value);
			}
			else{
				setXcoPrmeIrt((BigDecimal)value);
			}
			break;
		case 1075626488:/* fndGoalPrftRtPsnb */
			setFndGoalPrftRtPsnb((Integer)value);
			break;
		case 1075253599:/* fndGoalPrftRtDcml */
			setFndGoalPrftRtDcml((String)value);
			break;
		case 128152119:/* srvcRqAm */
			if ( value instanceof String ){
				setSrvcRqAm((String)value);
			}
			else if ( value instanceof Double ){
				setSrvcRqAm((Double)value);
			}
			else if ( value instanceof Long ){
				setSrvcRqAm((Long)value);
			}
			else{
				setSrvcRqAm((BigDecimal)value);
			}
			break;
		case 2113601721:/* fndAcblNtcDis */
			setFndAcblNtcDis((String)value);
			break;
		case 1306917545:/* fndAcblNtfcBasDd */
			setFndAcblNtfcBasDd((Integer)value);
			break;
		case 56644945:/* fndPrftRtSmsChrRqDscd */
			setFndPrftRtSmsChrRqDscd((String)value);
			break;
		case -364069839:/* fndSmsRqTprtPsnb */
			setFndSmsRqTprtPsnb((Integer)value);
			break;
		case -364442728:/* fndSmsRqTprtDcml */
			setFndSmsRqTprtDcml((String)value);
			break;
		case -364427670:/* fndSmsRqTprtDscd */
			setFndSmsRqTprtDscd((String)value);
			break;
		case -1825386322:/* fndSmsRqLossAwrtPsnb */
			setFndSmsRqLossAwrtPsnb((Integer)value);
			break;
		case -1825759211:/* fndSmsRqLossAwrtDcml */
			setFndSmsRqLossAwrtDcml((String)value);
			break;
		case -1825744153:/* fndSmsRqLossAwrtDscd */
			setFndSmsRqLossAwrtDscd((String)value);
			break;
		case -1172651845:/* fndFpPrftRtSmsChrRqDscd */
			setFndFpPrftRtSmsChrRqDscd((String)value);
			break;
		case -1636973909:/* fndFpPrftRtSmsChrRqDtDscd */
			setFndFpPrftRtSmsChrRqDtDscd((String)value);
			break;
		case 802771693:/* scntRqdcPrngOmitYn */
			setScntRqdcPrngOmitYn((String)value);
			break;
		case 1126423547:/* oldAtrbChckHisSrno */
			setOldAtrbChckHisSrno((String)value);
			break;
		case -752645044:/* newVstrMngNo */
			setNewVstrMngNo((String)value);
			break;
		case 2005331524:/* payVstrMngNo */
			setPayVstrMngNo((String)value);
			break;
		case 1553147178:/* spotTfrRtpenPrdNo */
			setSpotTfrRtpenPrdNo((String)value);
			break;
		case 118525549:/* rtttIscd */
			setRtttIscd((String)value);
			break;
		case -962656910:/* spotTfrRtpenPlanDscd */
			setSpotTfrRtpenPlanDscd((String)value);
			break;
		case 1552776534:/* intRcvFcAcno */
			setIntRcvFcAcno((String)value);
			break;
		case 2109232162:/* pbdeedPrngYn */
			setPbdeedPrngYn((String)value);
			break;
		case -1355827194:/* dgnXrtPsnb */
			setDgnXrtPsnb((Integer)value);
			break;
		case -1356200083:/* dgnXrtDcml */
			setDgnXrtDcml((String)value);
			break;
		case 93377333:/* mkshMbhYn */
			setMkshMbhYn((String)value);
			break;
		case 59288696:/* asstmPbokDscd */
			setAsstmPbokDscd((String)value);
			break;
		case -909686781:/* wbbtJnngHpNo */
			setWbbtJnngHpNo((String)value);
			break;
		case -1836606476:/* prdOpgDscd */
			setPrdOpgDscd((String)value);
			break;
		case 1356841569:/* newInqYn */
			setNewInqYn((String)value);
			break;
		case -364471434:/* pwnoNuseYn */
			setPwnoNuseYn((String)value);
			break;
		case 526999031:/* bchrInqTim */
			setBchrInqTim((String)value);
			break;
		case 521063607:/* bchrNewAvlYn */
			setBchrNewAvlYn((String)value);
			break;
		case -1785063366:/* prdMajTxtPbokPrngYn */
			setPrdMajTxtPbokPrngYn((String)value);
			break;
		case 468793075:/* apirtPsnb */
			setApirtPsnb((Integer)value);
			break;
		case 468420186:/* apirtDcml */
			setApirtDcml((String)value);
			break;
		case -1210177831:/* hqapNo */
			setHqapNo((String)value);
			break;
		case -1825557710:/* acnmCsno */
			setAcnmCsno((String)value);
			break;
		case 781893206:/* fcbdNewYn */
			setFcbdNewYn((String)value);
			break;
		case -1181291453:/* irKdcd */
			setIrKdcd((String)value);
			break;
		case -503923397:/* efctPrftRtPsnb */
			setEfctPrftRtPsnb((Integer)value);
			break;
		case -504296286:/* efctPrftRtDcml */
			setEfctPrftRtDcml((String)value);
			break;
		case 1223068167:/* vrBilNewDscd */
			setVrBilNewDscd((String)value);
			break;
		case 406323977:/* istIvpeBatNewTrnDscd */
			setIstIvpeBatNewTrnDscd((String)value);
			break;
		case 2105389394:/* dppeCsno */
			setDppeCsno((String)value);
			break;
		case 602881787:/* dppeActIdfNo */
			setDppeActIdfNo((String)value);
			break;
		case 2008352619:/* dpsBatNewBzcd */
			setDpsBatNewBzcd((String)value);
			break;
		case -334268315:/* ascnNewRprsAcno */
			setAscnNewRprsAcno((String)value);
			break;
		case -1772377979:/* ascnNewRprsActYn */
			setAscnNewRprsActYn((String)value);
			break;
		case -141212217:/* pbamActAcctYy */
			setPbamActAcctYy((String)value);
			break;
		case -1841894941:/* pmnySnnmActAcctYy */
			setPmnySnnmActAcctYy((String)value);
			break;
		case 758860673:/* hsscOwhmAdrKdcd */
			setHsscOwhmAdrKdcd((String)value);
			break;
		case 1904089685:/* hsscOwhmBldMngNo */
			setHsscOwhmBldMngNo((String)value);
			break;
		case -634163864:/* hsscOwhmPostSrno */
			setHsscOwhmPostSrno((String)value);
			break;
		case -1939654699:/* hsscOwhmStdoNo */
			setHsscOwhmStdoNo((String)value);
			break;
		case 1702287322:/* agmtCoCd */
			setAgmtCoCd((String)value);
			break;
		case 94184468:/* wooriHopeDremJnngTgtDscd */
			setWooriHopeDremJnngTgtDscd((String)value);
			break;
		case 1668346736:/* asetMngIscd */
			setAsetMngIscd((String)value);
			break;
		case 333228112:/* rpbdDscd */
			setRpbdDscd((String)value);
			break;
		case 1832686429:/* cctnAcno */
			setCctnAcno((String)value);
			break;
		case -1710560922:/* npbdSbsrRqYn */
			setNpbdSbsrRqYn((String)value);
			break;
		case -959893770:/* npbdItmsCd */
			setNpbdItmsCd((String)value);
			break;
		case 773105085:/* bndKdDis */
			setBndKdDis((String)value);
			break;
		case -970156428:/* tunMmHo */
			setTunMmHo((String)value);
			break;
		case -1845702869:/* hdgTgtYn */
			setHdgTgtYn((String)value);
			break;
		case 912426933:/* idCadNhssDscd */
			setIdCadNhssDscd((String)value);
			break;
		case 634386619:/* fndPlsOpgDscd */
			setFndPlsOpgDscd((String)value);
			break;
		case -894560203:/* grnInsuKey */
			setGrnInsuKey((String)value);
			break;
		case -1772583095:/* preIntRcvDscd */
			setPreIntRcvDscd((String)value);
			break;
		case -1772687492:/* preIntRcvAcno */
			setPreIntRcvAcno((String)value);
			break;
		case -2120290794:/* dpsRcmNo */
			setDpsRcmNo((String)value);
			break;
		case -570755203:/* sldrAldCn */
			setSldrAldCn((String)value);
			break;
		case 512885174:/* dlpmPbokGenRgsYn */
			setDlpmPbokGenRgsYn((String)value);
			break;
		case 80681576:/* smrtMchrMdlInf */
			setSmrtMchrMdlInf((String)value);
			break;
		case 1870916542:/* wibeeRcvRgsYn */
			setWibeeRcvRgsYn((String)value);
			break;
		case -1692942062:/* wibeeTsAcno */
			setWibeeTsAcno((String)value);
			break;
		case 737197833:/* wibeePushRgsYn */
			setWibeePushRgsYn((String)value);
			break;
		case -32426542:/* atsKrwTsAcno */
			setAtsKrwTsAcno((String)value);
			break;
		case -345895821:/* irngBrcd */
			setIrngBrcd((String)value);
			break;
		case -1609088133:/* krwFmbkFxpdYn */
			setKrwFmbkFxpdYn((String)value);
			break;
		case 595364711:/* krwSscoFmbkFxpdYn */
			setKrwSscoFmbkFxpdYn((String)value);
			break;
		case 356658831:/* hopeHousXuseSqmDscd */
			setHopeHousXuseSqmDscd((String)value);
			break;
		case -466944365:/* rrrgMvinDt */
			setRrrgMvinDt((String)value);
			break;
		case 859038168:/* dppeUnqNo */
			setDppeUnqNo((Integer)value);
			break;
		case 522286227:/* dppeItmsNo */
			setDppeItmsNo((String)value);
			break;
		case -1941305511:/* cshbAtsAcno */
			setCshbAtsAcno((String)value);
			break;
		case 2129011747:/* cusDntnAscnCd */
			setCusDntnAscnCd((String)value);
			break;
		case 1820081956:/* cusBrdnCnrnRt */
			if ( value instanceof String ){
				setCusBrdnCnrnRt((String)value);
			}
			else if ( value instanceof Double ){
				setCusBrdnCnrnRt((Double)value);
			}
			else if ( value instanceof Long ){
				setCusBrdnCnrnRt((Long)value);
			}
			else{
				setCusBrdnCnrnRt((BigDecimal)value);
			}
			break;
		case -1667932565:/* dinsvGoalAm */
			if ( value instanceof String ){
				setDinsvGoalAm((String)value);
			}
			else if ( value instanceof Double ){
				setDinsvGoalAm((Double)value);
			}
			else if ( value instanceof Long ){
				setDinsvGoalAm((Long)value);
			}
			else{
				setDinsvGoalAm((BigDecimal)value);
			}
			break;
		case -871751621:/* txprInqYn */
			setTxprInqYn((String)value);
			break;
		case 3151757:/* frno */
			setFrno((String)value);
			break;
		case -744215298:/* acnmRgsCd */
			setAcnmRgsCd((String)value);
			break;
		case -111793581:/* coaOmitYn */
			setCoaOmitYn((String)value);
			break;
		case -2059858526:/* wbbmLnkNewYn */
			setWbbmLnkNewYn((String)value);
			break;
		case 783934248:/* wbbtRcmRgsHpNo */
			setWbbtRcmRgsHpNo((String)value);
			break;
		case -399302576:/* smrtLnJnngYn */
			setSmrtLnJnngYn((String)value);
			break;
		case 199295996:/* dinsvDscd */
			setDinsvDscd((String)value);
			break;
		case 93164586:/* aucId */
			setAucId((String)value);
			break;
		case -1242199478:/* gmktId */
			setGmktId((String)value);
			break;
		case -794566639:/* wbbmId */
			setWbbmId((String)value);
			break;
		case 1832699989:/* dniAcnmCnfNewDscd */
			setDniAcnmCnfNewDscd((String)value);
			break;
		case 113385874:/* dniRcvAm */
			if ( value instanceof String ){
				setDniRcvAm((String)value);
			}
			else if ( value instanceof Double ){
				setDniRcvAm((Double)value);
			}
			else if ( value instanceof Long ){
				setDniRcvAm((Long)value);
			}
			else{
				setDniRcvAm((BigDecimal)value);
			}
			break;
		case 1804486312:/* dniHpNo */
			setDniHpNo((String)value);
			break;
		case 293936462:/* dniPtnAcno */
			setDniPtnAcno((String)value);
			break;
		case -2060232872:/* dniPtnNewAcno */
			setDniPtnNewAcno((String)value);
			break;
		case 294925909:/* dniPtnbkCd */
			setDniPtnbkCd((String)value);
			break;
		case -2044522638:/* rjnngAcno */
			setRjnngAcno((String)value);
			break;
		case 2107390949:/* insvAcldPlanKdcd */
			setInsvAcldPlanKdcd((String)value);
			break;
		case 1108470544:/* insvAcldFstTsAm */
			if ( value instanceof String ){
				setInsvAcldFstTsAm((String)value);
			}
			else if ( value instanceof Double ){
				setInsvAcldFstTsAm((Double)value);
			}
			else if ( value instanceof Long ){
				setInsvAcldFstTsAm((Long)value);
			}
			else{
				setInsvAcldFstTsAm((BigDecimal)value);
			}
			break;
		case 900720545:/* insvAcldTsStaWkdDscd */
			setInsvAcldTsStaWkdDscd((String)value);
			break;
		case 619080111:/* insvAcldTsStaDt */
			setInsvAcldTsStaDt((String)value);
			break;
		case 897340744:/* insvAcldPlanChcYn */
			setInsvAcldPlanChcYn((String)value);
			break;
		case -1988522509:/* insvAcldPlanLifeAm */
			if ( value instanceof String ){
				setInsvAcldPlanLifeAm((String)value);
			}
			else if ( value instanceof Double ){
				setInsvAcldPlanLifeAm((Double)value);
			}
			else if ( value instanceof Long ){
				setInsvAcldPlanLifeAm((Long)value);
			}
			else{
				setInsvAcldPlanLifeAm((BigDecimal)value);
			}
			break;
		case -577995740:/* pidMecd */
			setPidMecd((String)value);
			break;
		case 1376938661:/* selcMvbDtlsIdfCd */
			setSelcMvbDtlsIdfCd((String)value);
			break;
		case 310566279:/* ptnBkwAcno */
			setPtnBkwAcno((String)value);
			break;
		case -713721090:/* ptnSelcIscd */
			setPtnSelcIscd((String)value);
			break;
		case -49187375:/* fndslcMvbCfdocIsuDt */
			setFndslcMvbCfdocIsuDt((String)value);
			break;
		case -1533283343:/* taxTycd */
			setTaxTycd((String)value);
			break;
		case -1940331653:/* rprhAfImnwYn */
			setRprhAfImnwYn((String)value);
			break;
		case -1087026392:/* elfSelfDgnsYn */
			setElfSelfDgnsYn((String)value);
			break;
		case -1434776355:/* wmsPrtfDis */
			setWmsPrtfDis((String)value);
			break;
		case -1221235600:/* ptnIstCnfYn */
			setPtnIstCnfYn((String)value);
			break;
		case -1869195284:/* ivsdesSrno */
			setIvsdesSrno((String)value);
			break;
		case -1981482423:/* fndSvvlAcuCn */
			if ( value instanceof String ){
				setFndSvvlAcuCn((String)value);
			}
			else if ( value instanceof Double ){
				setFndSvvlAcuCn((Double)value);
			}
			else if ( value instanceof Long ){
				setFndSvvlAcuCn((Long)value);
			}
			else{
				setFndSvvlAcuCn((BigDecimal)value);
			}
			break;
		case 99901034:/* cusPrtfRgsNo */
			if ( value instanceof String ){
				setCusPrtfRgsNo((String)value);
			}
			else if ( value instanceof Double ){
				setCusPrtfRgsNo((Double)value);
			}
			else if ( value instanceof Long ){
				setCusPrtfRgsNo((Long)value);
			}
			else{
				setCusPrtfRgsNo((BigDecimal)value);
			}
			break;
		case -936409858:/* rcpDtm */
			setRcpDtm((String)value);
			break;
		case 348210250:/* pnsfndAcno */
			setPnsfndAcno((String)value);
			break;
		case -1066806663:/* mmfFndAcno */
			setMmfFndAcno((String)value);
			break;
		case -2078310706:/* pnsfndNewYn */
			setPnsfndNewYn((String)value);
			break;
		case -1219088163:/* frstNwactNo */
			setFrstNwactNo((String)value);
			break;
		case -1824740636:/* scndNwactNo */
			setScndNwactNo((String)value);
			break;
		case -316582586:/* fndOpngDt */
			setFndOpngDt((String)value);
			break;
		case 2065511122:/* krwSscoNewTlmNo */
			setKrwSscoNewTlmNo((String)value);
			break;
		case 1110034028:/* atsDtlDscd */
			setAtsDtlDscd((String)value);
			break;
		case 1066680314:/* atsRcvLmtAm */
			if ( value instanceof String ){
				setAtsRcvLmtAm((String)value);
			}
			else if ( value instanceof Double ){
				setAtsRcvLmtAm((Double)value);
			}
			else if ( value instanceof Long ){
				setAtsRcvLmtAm((Long)value);
			}
			else{
				setAtsRcvLmtAm((BigDecimal)value);
			}
			break;
		case -1419203182:/* krwFmbkMmdaYn */
			setKrwFmbkMmdaYn((String)value);
			break;
		case 966966447:/* opgOrdsMngNo */
			setOpgOrdsMngNo((String)value);
			break;
		case 931180487:/* spcfPrdMoAcno */
			setSpcfPrdMoAcno((String)value);
			break;
		case 387501381:/* restTxprLmtAm */
			if ( value instanceof String ){
				setRestTxprLmtAm((String)value);
			}
			else if ( value instanceof Double ){
				setRestTxprLmtAm((Double)value);
			}
			else if ( value instanceof Long ){
				setRestTxprLmtAm((Long)value);
			}
			else{
				setRestTxprLmtAm((BigDecimal)value);
			}
			break;
		case 2105314436:/* dppeAcno */
			setDppeAcno((String)value);
			break;
		case -1137476586:/* pmnyIdeedYn */
			setPmnyIdeedYn((String)value);
			break;
		case -182709825:/* tdyCancAcno */
			setTdyCancAcno((String)value);
			break;
		case -249550256:/* cbrseNewYn */
			setCbrseNewYn((String)value);
			break;
		case -494339350:/* fmbkNewCitAtsCancYn */
			setFmbkNewCitAtsCancYn((String)value);
			break;
		case 1745931109:/* cnstDdctFxpdGrnYr5OverYn */
			setCnstDdctFxpdGrnYr5OverYn((String)value);
			break;
		case -1247399255:/* aprrBrdmCd */
			setAprrBrdmCd((String)value);
			break;
		case 934753548:/* cmpnOv1peYn */
			setCmpnOv1peYn((String)value);
			break;
		case 299854105:/* pnsfndCoreOupYn */
			setPnsfndCoreOupYn((String)value);
			break;
		case -1363158003:/* rtpenPlanAplDt */
			setRtpenPlanAplDt((String)value);
			break;
		case 924279132:/* rtpenPlanItcsno */
			setRtpenPlanItcsno((String)value);
			break;
		case 715018249:/* glblBnkgJnngYn */
			setGlblBnkgJnngYn((String)value);
			break;
		case -746852411:/* idCadNewDscd */
			setIdCadNewDscd((String)value);
			break;
		case -2146698918:/* encyEbnkPwnoCnf */
			setEncyEbnkPwnoCnf((String)value);
			break;
		case 1256318988:/* tlbnkPwnoCnf */
			setTlbnkPwnoCnf((String)value);
			break;
		case 663827477:/* gridRowCnt */
			setGridRowCnt((Integer)value);
			break;
		case 3181382:/* grid */
			setGrid((List<IBSMR0004063_GRID_IDT>)value);
			break;
		case -896184643:/* gridRowCnt2 */
			setGridRowCnt2((Integer)value);
			break;
		case 98622892:/* grid2 */
			setGrid2((List<IBSMR0004063_GRID_2_IDT>)value);
			break;
		default:
			break;
		}
	}
	
}
