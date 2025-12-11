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
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 */
@XmlType(propOrder={
	"tmntFrcsDt", "newDt", "xprDt", "cancDisNm", "prnAm", "totIntAm", "bscIntAm", "spclIntAm", "afepIntAm", "rstrIctx", "rstrRdtx", "rstrSrtx", "impAttxSumAm", "intIctx", "intIcmRdtx"
	, "intIcmSrtx", "cnrnAm", "rrint", "ddctSumAm", "dduPayAm", "ectx", "dftx", "rvsnAm", "slchIntx", "slchPvnsIctx", "paySumAm", "fcIntAm", "fcRstrAttxAm", "fcRrintAm", "fcImpAttxAm"
	, "pstmRticmStaxAm", "pstmPnsnIctx", "pstmRticmUsgAm", "pstmPnsnRdtx", "pstmRticmTax", "pstmRtrtRdtx", "rtnPocpFee", "etcIcmStaxAm", "staxHovMnuAdj", "feeStaxDdu", "usumEvlAm", "moAcno", "frgStcLossOfst", "staxDduTcmPfeAm", "lstStaxAm"
	, "smplPrftRt", "hcanFee", "yrXcPtrt", "etcIctx", "etcRdtx", "pnsnIctx", "pnsnPvnsIctx", "pnsnIcmStaxAm", "atcnt", "ctrmvFee", "lnintAm", "fintAm", "lnPrnDelyRprnm", "dpacLnNcitAm", "lnNcitDelyRprnm"
	, "lmtNuseFee", "krxcAm", "krxcCancAm", "prftRt", "lstStaxAm2", "mvavBuyUp", "tetBuyRt", "trtFndYn", "fractYn", "gTrnDscd", "lnYn", "dpsApirt", "dntnAm", "hmnyAcldAm", "ppayIntAm"
	, "etcTxt", "inqCucd", "slchStaxAm", "payBasPr", "staxBasPr", "krwXchInciAm", "krxcWthdAm", "plAm", "cusPrftRt", "potWthdAm", "avgXrtIntAm", "cusAplSellXrt", "ddctAm", "wthdAmSumAm", "bfdnAcmPrftRt"
	, "afdnAcmPrftRt"
}, name="MNPMnyPinFncTrnSelectMnpTxIntInf_DODT")
@XmlRootElement(name="MNPMnyPinFncTrnSelectMnpTxIntInf_DODT")
@BxmCategory(logicalName="머니클립세금이자정보조회.컴포넌트.출력.IO", description="") 
public class MNPMnyPinFncTrnSelectMnpTxIntInf_DODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -1581212844L;
	
	
	
	/**
	 * 해지예상일자
	 */
	@ApiModelProperty(
		name = "tmntFrcsDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("tmntFrcsDt")
	@BxmOmm_Field(length=8, decimal=0, description="해지예상일자", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String tmntFrcsDt= "";
	
	
	/**
	 * 신규일자
	 */
	@ApiModelProperty(
		name = "newDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("newDt")
	@BxmOmm_Field(length=8, decimal=0, description="신규일자", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String newDt= "";
	
	
	/**
	 * 만기일자
	 */
	@ApiModelProperty(
		name = "xprDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("xprDt")
	@BxmOmm_Field(length=8, decimal=0, description="만기일자", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String xprDt= "";
	
	
	/**
	 * 해지구분명
	 */
	@ApiModelProperty(
		name = "cancDisNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("cancDisNm")
	@BxmOmm_Field(length=40, decimal=0, description="해지구분명", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String cancDisNm= "";
	
	
	/**
	 * 원금금액
	 */
	@ApiModelProperty(
		name = "prnAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("prnAm")
	@BxmOmm_Field(length=19, decimal=3, description="원금금액", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal prnAm= new BigDecimal("0");
	
	
	/**
	 * 총이자금액
	 */
	@ApiModelProperty(
		name = "totIntAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("totIntAm")
	@BxmOmm_Field(length=19, decimal=3, description="총이자금액", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal totIntAm= new BigDecimal("0");
	
	
	/**
	 * 기본이자금액
	 */
	@ApiModelProperty(
		name = "bscIntAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("bscIntAm")
	@BxmOmm_Field(length=19, decimal=3, description="기본이자금액", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal bscIntAm= new BigDecimal("0");
	
	
	/**
	 * 특별이자금액
	 */
	@ApiModelProperty(
		name = "spclIntAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("spclIntAm")
	@BxmOmm_Field(length=19, decimal=3, description="특별이자금액", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal spclIntAm= new BigDecimal("0");
	
	
	/**
	 * 만기후이자금액
	 */
	@ApiModelProperty(
		name = "afepIntAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("afepIntAm")
	@BxmOmm_Field(length=19, decimal=3, description="만기후이자금액", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal afepIntAm= new BigDecimal("0");
	
	
	/**
	 * 환출소득세
	 */
	@ApiModelProperty(
		name = "rstrIctx"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("rstrIctx")
	@BxmOmm_Field(length=19, decimal=3, description="환출소득세", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal rstrIctx= new BigDecimal("0");
	
	
	/**
	 * 환출주민세
	 */
	@ApiModelProperty(
		name = "rstrRdtx"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("rstrRdtx")
	@BxmOmm_Field(length=19, decimal=3, description="환출주민세", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal rstrRdtx= new BigDecimal("0");
	
	
	/**
	 * 환출농특세
	 */
	@ApiModelProperty(
		name = "rstrSrtx"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("rstrSrtx")
	@BxmOmm_Field(length=19, decimal=3, description="환출농특세", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal rstrSrtx= new BigDecimal("0");
	
	
	/**
	 * 수입제세합계금액
	 */
	@ApiModelProperty(
		name = "impAttxSumAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("impAttxSumAm")
	@BxmOmm_Field(length=19, decimal=3, description="수입제세합계금액", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal impAttxSumAm= new BigDecimal("0");
	
	
	/**
	 * 이자소득세
	 */
	@ApiModelProperty(
		name = "intIctx"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("intIctx")
	@BxmOmm_Field(length=19, decimal=3, description="이자소득세", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal intIctx= new BigDecimal("0");
	
	
	/**
	 * 이자소득주민세
	 */
	@ApiModelProperty(
		name = "intIcmRdtx"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("intIcmRdtx")
	@BxmOmm_Field(length=19, decimal=3, description="이자소득주민세", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal intIcmRdtx= new BigDecimal("0");
	
	
	/**
	 * 이자소득농특세
	 */
	@ApiModelProperty(
		name = "intIcmSrtx"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("intIcmSrtx")
	@BxmOmm_Field(length=19, decimal=3, description="이자소득농특세", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal intIcmSrtx= new BigDecimal("0");
	
	
	/**
	 * 출연금액
	 */
	@ApiModelProperty(
		name = "cnrnAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("cnrnAm")
	@BxmOmm_Field(length=19, decimal=3, description="출연금액", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal cnrnAm= new BigDecimal("0");
	
	
	/**
	 * 환입이자
	 */
	@ApiModelProperty(
		name = "rrint"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("rrint")
	@BxmOmm_Field(length=19, decimal=3, description="환입이자", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal rrint= new BigDecimal("0");
	
	
	/**
	 * 공제합계금액
	 */
	@ApiModelProperty(
		name = "ddctSumAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("ddctSumAm")
	@BxmOmm_Field(length=19, decimal=3, description="공제합계금액", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal ddctSumAm= new BigDecimal("0");
	
	
	/**
	 * 차감지급금액
	 */
	@ApiModelProperty(
		name = "dduPayAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("dduPayAm")
	@BxmOmm_Field(length=19, decimal=3, description="차감지급금액", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal dduPayAm= new BigDecimal("0");
	
	
	/**
	 * 교육세
	 */
	@ApiModelProperty(
		name = "ectx"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("ectx")
	@BxmOmm_Field(length=19, decimal=3, description="교육세", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal ectx= new BigDecimal("0");
	
	
	/**
	 * 방위세
	 */
	@ApiModelProperty(
		name = "dftx"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("dftx")
	@BxmOmm_Field(length=19, decimal=3, description="방위세", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal dftx= new BigDecimal("0");
	
	
	/**
	 * 보정금액
	 */
	@ApiModelProperty(
		name = "rvsnAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("rvsnAm")
	@BxmOmm_Field(length=19, decimal=3, description="보정금액", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal rvsnAm= new BigDecimal("0");
	
	
	/**
	 * 추징이자세
	 */
	@ApiModelProperty(
		name = "slchIntx"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("slchIntx")
	@BxmOmm_Field(length=19, decimal=3, description="추징이자세", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal slchIntx= new BigDecimal("0");
	
	
	/**
	 * 추징지방소득세
	 */
	@ApiModelProperty(
		name = "slchPvnsIctx"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("slchPvnsIctx")
	@BxmOmm_Field(length=19, decimal=3, description="추징지방소득세", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal slchPvnsIctx= new BigDecimal("0");
	
	
	/**
	 * 지급합계금액
	 */
	@ApiModelProperty(
		name = "paySumAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("paySumAm")
	@BxmOmm_Field(length=19, decimal=3, description="지급합계금액", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal paySumAm= new BigDecimal("0");
	
	
	/**
	 * 외화이자금액
	 */
	@ApiModelProperty(
		name = "fcIntAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("fcIntAm")
	@BxmOmm_Field(length=19, decimal=3, description="외화이자금액", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal fcIntAm= new BigDecimal("0");
	
	
	/**
	 * 외화환출제세금액
	 */
	@ApiModelProperty(
		name = "fcRstrAttxAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("fcRstrAttxAm")
	@BxmOmm_Field(length=19, decimal=3, description="외화환출제세금액", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal fcRstrAttxAm= new BigDecimal("0");
	
	
	/**
	 * 외화환입이자금액
	 */
	@ApiModelProperty(
		name = "fcRrintAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("fcRrintAm")
	@BxmOmm_Field(length=19, decimal=3, description="외화환입이자금액", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal fcRrintAm= new BigDecimal("0");
	
	
	/**
	 * 외화수입제세금액
	 */
	@ApiModelProperty(
		name = "fcImpAttxAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("fcImpAttxAm")
	@BxmOmm_Field(length=19, decimal=3, description="외화수입제세금액", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal fcImpAttxAm= new BigDecimal("0");
	
	
	/**
	 * 이연퇴직소득과세표준금액
	 */
	@ApiModelProperty(
		name = "pstmRticmStaxAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("pstmRticmStaxAm")
	@BxmOmm_Field(length=19, decimal=3, description="이연퇴직소득과세표준금액", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal pstmRticmStaxAm= new BigDecimal("0");
	
	
	/**
	 * 이연연금소득세
	 */
	@ApiModelProperty(
		name = "pstmPnsnIctx"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("pstmPnsnIctx")
	@BxmOmm_Field(length=19, decimal=3, description="이연연금소득세", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal pstmPnsnIctx= new BigDecimal("0");
	
	
	/**
	 * 이연퇴직소득사용금액
	 */
	@ApiModelProperty(
		name = "pstmRticmUsgAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("pstmRticmUsgAm")
	@BxmOmm_Field(length=19, decimal=3, description="이연퇴직소득사용금액", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal pstmRticmUsgAm= new BigDecimal("0");
	
	
	/**
	 * 이연연금주민세
	 */
	@ApiModelProperty(
		name = "pstmPnsnRdtx"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("pstmPnsnRdtx")
	@BxmOmm_Field(length=19, decimal=3, description="이연연금주민세", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal pstmPnsnRdtx= new BigDecimal("0");
	
	
	/**
	 * 이연퇴직소득세
	 */
	@ApiModelProperty(
		name = "pstmRticmTax"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("pstmRticmTax")
	@BxmOmm_Field(length=19, decimal=3, description="이연퇴직소득세", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal pstmRticmTax= new BigDecimal("0");
	
	
	/**
	 * 이연퇴직주민세
	 */
	@ApiModelProperty(
		name = "pstmRtrtRdtx"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("pstmRtrtRdtx")
	@BxmOmm_Field(length=19, decimal=3, description="이연퇴직주민세", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal pstmRtrtRdtx= new BigDecimal("0");
	
	
	/**
	 * 반환선취수수료
	 */
	@ApiModelProperty(
		name = "rtnPocpFee"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("rtnPocpFee")
	@BxmOmm_Field(length=19, decimal=3, description="반환선취수수료", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal rtnPocpFee= new BigDecimal("0");
	
	
	/**
	 * 기타소득과세표준금액
	 */
	@ApiModelProperty(
		name = "etcIcmStaxAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("etcIcmStaxAm")
	@BxmOmm_Field(length=19, decimal=3, description="기타소득과세표준금액", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal etcIcmStaxAm= new BigDecimal("0");
	
	
	/**
	 * 과세표준유보분조정
	 */
	@ApiModelProperty(
		name = "staxHovMnuAdj"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("staxHovMnuAdj")
	@BxmOmm_Field(length=19, decimal=3, description="과세표준유보분조정", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal staxHovMnuAdj= new BigDecimal("0");
	
	
	/**
	 * 수수료과세표준차감
	 */
	@ApiModelProperty(
		name = "feeStaxDdu"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("feeStaxDdu")
	@BxmOmm_Field(length=19, decimal=3, description="수수료과세표준차감", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal feeStaxDdu= new BigDecimal("0");
	
	
	/**
	 * 합산평가금액
	 */
	@ApiModelProperty(
		name = "usumEvlAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("usumEvlAm")
	@BxmOmm_Field(length=19, decimal=3, description="합산평가금액", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal usumEvlAm= new BigDecimal("0");
	
	
	/**
	 * 모계좌번호
	 */
	@ApiModelProperty(
		name = "moAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("moAcno")
	@BxmOmm_Field(length=15, decimal=0, description="모계좌번호", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String moAcno= "";
	
	
	/**
	 * 해외주식손실상계
	 */
	@ApiModelProperty(
		name = "frgStcLossOfst"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("frgStcLossOfst")
	@BxmOmm_Field(length=19, decimal=3, description="해외주식손실상계", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal frgStcLossOfst= new BigDecimal("0");
	
	
	/**
	 * 과세표준차감성과보수금액
	 */
	@ApiModelProperty(
		name = "staxDduTcmPfeAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("staxDduTcmPfeAm")
	@BxmOmm_Field(length=19, decimal=3, description="과세표준차감성과보수금액", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal staxDduTcmPfeAm= new BigDecimal("0");
	
	
	/**
	 * 최종과세표준금액
	 */
	@ApiModelProperty(
		name = "lstStaxAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("lstStaxAm")
	@BxmOmm_Field(length=19, decimal=3, description="최종과세표준금액", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal lstStaxAm= new BigDecimal("0");
	
	
	/**
	 * 단순수익율
	 */
	@ApiModelProperty(
		name = "smplPrftRt"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("smplPrftRt")
	@BxmOmm_Field(length=10, decimal=6, description="단순수익율", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal smplPrftRt= new BigDecimal("0");
	
	
	/**
	 * 중도해지수수료
	 */
	@ApiModelProperty(
		name = "hcanFee"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("hcanFee")
	@BxmOmm_Field(length=19, decimal=3, description="중도해지수수료", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal hcanFee= new BigDecimal("0");
	
	
	/**
	 * 연환산수익률
	 */
	@ApiModelProperty(
		name = "yrXcPtrt"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("yrXcPtrt")
	@BxmOmm_Field(length=9, decimal=4, description="연환산수익률", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal yrXcPtrt= new BigDecimal("0");
	
	
	/**
	 * 기타소득세
	 */
	@ApiModelProperty(
		name = "etcIctx"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("etcIctx")
	@BxmOmm_Field(length=19, decimal=3, description="기타소득세", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal etcIctx= new BigDecimal("0");
	
	
	/**
	 * 기타주민세
	 */
	@ApiModelProperty(
		name = "etcRdtx"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("etcRdtx")
	@BxmOmm_Field(length=19, decimal=3, description="기타주민세", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal etcRdtx= new BigDecimal("0");
	
	
	/**
	 * 연금소득세
	 */
	@ApiModelProperty(
		name = "pnsnIctx"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("pnsnIctx")
	@BxmOmm_Field(length=19, decimal=3, description="연금소득세", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal pnsnIctx= new BigDecimal("0");
	
	
	/**
	 * 연금지방소득세
	 */
	@ApiModelProperty(
		name = "pnsnPvnsIctx"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("pnsnPvnsIctx")
	@BxmOmm_Field(length=19, decimal=3, description="연금지방소득세", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal pnsnPvnsIctx= new BigDecimal("0");
	
	
	/**
	 * 연금소득과세표준금액
	 */
	@ApiModelProperty(
		name = "pnsnIcmStaxAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("pnsnIcmStaxAm")
	@BxmOmm_Field(length=19, decimal=3, description="연금소득과세표준금액", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal pnsnIcmStaxAm= new BigDecimal("0");
	
	
	/**
	 * 좌수
	 */
	@ApiModelProperty(
		name = "atcnt"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("atcnt")
	@BxmOmm_Field(length=19, decimal=3, description="좌수", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal atcnt= new BigDecimal("0");
	
	
	/**
	 * 계약이전수수료
	 */
	@ApiModelProperty(
		name = "ctrmvFee"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("ctrmvFee")
	@BxmOmm_Field(length=19, decimal=3, description="계약이전수수료", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal ctrmvFee= new BigDecimal("0");
	
	
	/**
	 * 대출이자금액
	 */
	@ApiModelProperty(
		name = "lnintAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("lnintAm")
	@BxmOmm_Field(length=19, decimal=3, description="대출이자금액", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal lnintAm= new BigDecimal("0");
	
	
	/**
	 * 연체이자금액
	 */
	@ApiModelProperty(
		name = "fintAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("fintAm")
	@BxmOmm_Field(length=19, decimal=3, description="연체이자금액", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal fintAm= new BigDecimal("0");
	
	
	/**
	 * 대출원금지연배상금
	 */
	@ApiModelProperty(
		name = "lnPrnDelyRprnm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("lnPrnDelyRprnm")
	@BxmOmm_Field(length=19, decimal=3, description="대출원금지연배상금", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal lnPrnDelyRprnm= new BigDecimal("0");
	
	
	/**
	 * 수신계좌대출미수이자금액
	 */
	@ApiModelProperty(
		name = "dpacLnNcitAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("dpacLnNcitAm")
	@BxmOmm_Field(length=19, decimal=3, description="수신계좌대출미수이자금액", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal dpacLnNcitAm= new BigDecimal("0");
	
	
	/**
	 * 대출미수이자지연배상금
	 */
	@ApiModelProperty(
		name = "lnNcitDelyRprnm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("lnNcitDelyRprnm")
	@BxmOmm_Field(length=19, decimal=3, description="대출미수이자지연배상금", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal lnNcitDelyRprnm= new BigDecimal("0");
	
	
	/**
	 * 한도미사용수수료
	 */
	@ApiModelProperty(
		name = "lmtNuseFee"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("lmtNuseFee")
	@BxmOmm_Field(length=19, decimal=3, description="한도미사용수수료", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal lmtNuseFee= new BigDecimal("0");
	
	
	/**
	 * 원화환산금액
	 */
	@ApiModelProperty(
		name = "krxcAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("krxcAm")
	@BxmOmm_Field(length=19, decimal=3, description="원화환산금액", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal krxcAm= new BigDecimal("0");
	
	
	/**
	 * 원화환산해지금액
	 */
	@ApiModelProperty(
		name = "krxcCancAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("krxcCancAm")
	@BxmOmm_Field(length=19, decimal=3, description="원화환산해지금액", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal krxcCancAm= new BigDecimal("0");
	
	
	/**
	 * 수익율
	 */
	@ApiModelProperty(
		name = "prftRt"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("prftRt")
	@BxmOmm_Field(length=9, decimal=2, description="수익율", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal prftRt= new BigDecimal("0");
	
	
	/**
	 * 최종과세표준금액_2
	 */
	@ApiModelProperty(
		name = "lstStaxAm2"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("lstStaxAm2")
	@BxmOmm_Field(length=19, decimal=3, description="최종과세표준금액_2", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal lstStaxAm2= new BigDecimal("0");
	
	
	/**
	 * 이동평균매입단가
	 */
	@ApiModelProperty(
		name = "mvavBuyUp"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("mvavBuyUp")
	@BxmOmm_Field(length=19, decimal=3, description="이동평균매입단가", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal mvavBuyUp= new BigDecimal("0");
	
	
	/**
	 * 전신환매입율
	 */
	@ApiModelProperty(
		name = "tetBuyRt"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("tetBuyRt")
	@BxmOmm_Field(length=9, decimal=2, description="전신환매입율", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal tetBuyRt= new BigDecimal("0");
	
	
	/**
	 * 신탁펀드여부
	 */
	@ApiModelProperty(
		name = "trtFndYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("trtFndYn")
	@BxmOmm_Field(length=1, decimal=0, description="신탁펀드여부", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String trtFndYn= "";
	
	
	/**
	 * 외화계좌여부
	 */
	@ApiModelProperty(
		name = "fractYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("fractYn")
	@BxmOmm_Field(length=1, decimal=0, description="외화계좌여부", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String fractYn= "";
	
	
	/**
	 * 골드거래구분코드
	 */
	@ApiModelProperty(
		name = "gTrnDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("gTrnDscd")
	@BxmOmm_Field(length=1, decimal=0, description="골드거래구분코드", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String gTrnDscd= "";
	
	
	/**
	 * 대출여부
	 */
	@ApiModelProperty(
		name = "lnYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("lnYn")
	@BxmOmm_Field(length=1, decimal=0, description="대출여부", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String lnYn= "";
	
	
	/**
	 * 수신적용이율
	 */
	@ApiModelProperty(
		name = "dpsApirt"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("dpsApirt")
	@BxmOmm_Field(length=10, decimal=6, description="수신적용이율", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal dpsApirt= new BigDecimal("0");
	
	
	/**
	 * 기부금액
	 */
	@ApiModelProperty(
		name = "dntnAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("dntnAm")
	@BxmOmm_Field(length=19, decimal=3, description="기부금액", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal dntnAm= new BigDecimal("0");
	
	
	/**
	 * 꿀머니적립금액
	 */
	@ApiModelProperty(
		name = "hmnyAcldAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("hmnyAcldAm")
	@BxmOmm_Field(length=19, decimal=3, description="꿀머니적립금액", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal hmnyAcldAm= new BigDecimal("0");
	
	
	/**
	 * 선지급이자금액
	 */
	@ApiModelProperty(
		name = "ppayIntAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("ppayIntAm")
	@BxmOmm_Field(length=19, decimal=3, description="선지급이자금액", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal ppayIntAm= new BigDecimal("0");
	
	
	/**
	 * 기타내용
	 */
	@ApiModelProperty(
		name = "etcTxt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("etcTxt")
	@BxmOmm_Field(length=1000, decimal=0, description="기타내용", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String etcTxt= "";
	
	
	/**
	 * 조회통화코드
	 */
	@ApiModelProperty(
		name = "inqCucd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("inqCucd")
	@BxmOmm_Field(length=3, decimal=0, description="조회통화코드", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String inqCucd= "";
	
	
	/**
	 * 추징과세표준금액
	 */
	@ApiModelProperty(
		name = "slchStaxAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("slchStaxAm")
	@BxmOmm_Field(length=19, decimal=3, description="추징과세표준금액", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal slchStaxAm= new BigDecimal("0");
	
	
	/**
	 * 지급기준가격
	 */
	@ApiModelProperty(
		name = "payBasPr"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("payBasPr")
	@BxmOmm_Field(length=19, decimal=7, description="지급기준가격", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal payBasPr= new BigDecimal("0");
	
	
	/**
	 * 과세표준기준가격
	 */
	@ApiModelProperty(
		name = "staxBasPr"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("staxBasPr")
	@BxmOmm_Field(length=19, decimal=7, description="과세표준기준가격", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal staxBasPr= new BigDecimal("0");
	
	
	/**
	 * 원화환산입금액
	 */
	@ApiModelProperty(
		name = "krwXchInciAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("krwXchInciAm")
	@BxmOmm_Field(length=18, decimal=0, description="원화환산입금액", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=N"})
	private BigDecimal krwXchInciAm= new BigDecimal("0");
	
	
	/**
	 * 원화환산인출금액
	 */
	@ApiModelProperty(
		name = "krxcWthdAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("krxcWthdAm")
	@BxmOmm_Field(length=18, decimal=0, description="원화환산인출금액", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=N"})
	private BigDecimal krxcWthdAm= new BigDecimal("0");
	
	
	/**
	 * 손익금액
	 */
	@ApiModelProperty(
		name = "plAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("plAm")
	@BxmOmm_Field(length=19, decimal=3, description="손익금액", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal plAm= new BigDecimal("0");
	
	
	/**
	 * 고객수익율
	 */
	@ApiModelProperty(
		name = "cusPrftRt"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("cusPrftRt")
	@BxmOmm_Field(length=7, decimal=2, description="고객수익율", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal cusPrftRt= new BigDecimal("0");
	
	
	/**
	 * 일부인출금액
	 */
	@ApiModelProperty(
		name = "potWthdAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("potWthdAm")
	@BxmOmm_Field(length=19, decimal=3, description="일부인출금액", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal potWthdAm= new BigDecimal("0");
	
	
	/**
	 * 평균환율이자금액
	 */
	@ApiModelProperty(
		name = "avgXrtIntAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("avgXrtIntAm")
	@BxmOmm_Field(length=19, decimal=3, description="평균환율이자금액", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal avgXrtIntAm= new BigDecimal("0");
	
	
	/**
	 * 고객적용매도환율
	 */
	@ApiModelProperty(
		name = "cusAplSellXrt"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("cusAplSellXrt")
	@BxmOmm_Field(length=9, decimal=2, description="고객적용매도환율", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal cusAplSellXrt= new BigDecimal("0");
	
	
	/**
	 * 공제금액
	 */
	@ApiModelProperty(
		name = "ddctAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("ddctAm")
	@BxmOmm_Field(length=19, decimal=3, description="공제금액", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal ddctAm= new BigDecimal("0");
	
	
	/**
	 * 인출금액합계금액
	 */
	@ApiModelProperty(
		name = "wthdAmSumAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("wthdAmSumAm")
	@BxmOmm_Field(length=20, decimal=0, description="인출금액합계금액", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=N"})
	private BigDecimal wthdAmSumAm= new BigDecimal("0");
	
	
	/**
	 * 차감전누적수익율
	 */
	@ApiModelProperty(
		name = "bfdnAcmPrftRt"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("bfdnAcmPrftRt")
	@BxmOmm_Field(length=6, decimal=2, description="차감전누적수익율", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal bfdnAcmPrftRt= new BigDecimal("0");
	
	
	/**
	 * 차감후누적수익율
	 */
	@ApiModelProperty(
		name = "afdnAcmPrftRt"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("afdnAcmPrftRt")
	@BxmOmm_Field(length=6, decimal=2, description="차감후누적수익율", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal afdnAcmPrftRt= new BigDecimal("0");
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_tmntFrcsDt= false;
	protected final boolean isSet_tmntFrcsDt(){
		return this.isSet_tmntFrcsDt;
	}
	private void setIsSet_tmntFrcsDt(boolean value){
		this.isSet_tmntFrcsDt= value;
	}
	/**
	 * 해지예상일자
	 */
	@XmlTransient
	public String getTmntFrcsDt(){
		return this.tmntFrcsDt;
	}
	
	/**
	 * 해지예상일자
	 * 
	 * @param tmntFrcsDt 해지예상일자
	 */
	public void setTmntFrcsDt(String tmntFrcsDt){
		this.tmntFrcsDt= tmntFrcsDt;
		this.setIsSet_tmntFrcsDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_newDt= false;
	protected final boolean isSet_newDt(){
		return this.isSet_newDt;
	}
	private void setIsSet_newDt(boolean value){
		this.isSet_newDt= value;
	}
	/**
	 * 신규일자
	 */
	@XmlTransient
	public String getNewDt(){
		return this.newDt;
	}
	
	/**
	 * 신규일자
	 * 
	 * @param newDt 신규일자
	 */
	public void setNewDt(String newDt){
		this.newDt= newDt;
		this.setIsSet_newDt(true);
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
	private boolean isSet_cancDisNm= false;
	protected final boolean isSet_cancDisNm(){
		return this.isSet_cancDisNm;
	}
	private void setIsSet_cancDisNm(boolean value){
		this.isSet_cancDisNm= value;
	}
	/**
	 * 해지구분명
	 */
	@XmlTransient
	public String getCancDisNm(){
		return this.cancDisNm;
	}
	
	/**
	 * 해지구분명
	 * 
	 * @param cancDisNm 해지구분명
	 */
	public void setCancDisNm(String cancDisNm){
		this.cancDisNm= cancDisNm;
		this.setIsSet_cancDisNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_prnAm= false;
	protected final boolean isSet_prnAm(){
		return this.isSet_prnAm;
	}
	private void setIsSet_prnAm(boolean value){
		this.isSet_prnAm= value;
	}
	/**
	 * 원금금액
	 * BigDecimal - Double value setter
	 *
	 * @Param prnAm 원금금액
	 */
	public void setPrnAm(double prnAm) {
		setPrnAm(BigDecimal.valueOf(prnAm));
	}
	/**
	 * 원금금액
	 * BigDecimal - Long value setter
	 *
	 * @Param prnAm 원금금액
	 */
	public void setPrnAm(long prnAm) {
		setPrnAm(BigDecimal.valueOf(prnAm));
	}
	/**
	 * 원금금액
	 * BigDecimal - String value setter
	 *
	 * @Param prnAm 원금금액
	 */
	public void setPrnAm(String prnAm) {
		setPrnAm(new BigDecimal(prnAm));
	}
	/**
	 * 원금금액
	 */
	@XmlTransient
	public BigDecimal getPrnAm(){
		return this.prnAm;
	}
	
	/**
	 * 원금금액
	 * 
	 * @param prnAm 원금금액
	 */
	@JsonSetter("prnAm")
	public void setPrnAm(BigDecimal prnAm){
		this.prnAm= prnAm;
		this.setIsSet_prnAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_totIntAm= false;
	protected final boolean isSet_totIntAm(){
		return this.isSet_totIntAm;
	}
	private void setIsSet_totIntAm(boolean value){
		this.isSet_totIntAm= value;
	}
	/**
	 * 총이자금액
	 * BigDecimal - Double value setter
	 *
	 * @Param totIntAm 총이자금액
	 */
	public void setTotIntAm(double totIntAm) {
		setTotIntAm(BigDecimal.valueOf(totIntAm));
	}
	/**
	 * 총이자금액
	 * BigDecimal - Long value setter
	 *
	 * @Param totIntAm 총이자금액
	 */
	public void setTotIntAm(long totIntAm) {
		setTotIntAm(BigDecimal.valueOf(totIntAm));
	}
	/**
	 * 총이자금액
	 * BigDecimal - String value setter
	 *
	 * @Param totIntAm 총이자금액
	 */
	public void setTotIntAm(String totIntAm) {
		setTotIntAm(new BigDecimal(totIntAm));
	}
	/**
	 * 총이자금액
	 */
	@XmlTransient
	public BigDecimal getTotIntAm(){
		return this.totIntAm;
	}
	
	/**
	 * 총이자금액
	 * 
	 * @param totIntAm 총이자금액
	 */
	@JsonSetter("totIntAm")
	public void setTotIntAm(BigDecimal totIntAm){
		this.totIntAm= totIntAm;
		this.setIsSet_totIntAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_bscIntAm= false;
	protected final boolean isSet_bscIntAm(){
		return this.isSet_bscIntAm;
	}
	private void setIsSet_bscIntAm(boolean value){
		this.isSet_bscIntAm= value;
	}
	/**
	 * 기본이자금액
	 * BigDecimal - Double value setter
	 *
	 * @Param bscIntAm 기본이자금액
	 */
	public void setBscIntAm(double bscIntAm) {
		setBscIntAm(BigDecimal.valueOf(bscIntAm));
	}
	/**
	 * 기본이자금액
	 * BigDecimal - Long value setter
	 *
	 * @Param bscIntAm 기본이자금액
	 */
	public void setBscIntAm(long bscIntAm) {
		setBscIntAm(BigDecimal.valueOf(bscIntAm));
	}
	/**
	 * 기본이자금액
	 * BigDecimal - String value setter
	 *
	 * @Param bscIntAm 기본이자금액
	 */
	public void setBscIntAm(String bscIntAm) {
		setBscIntAm(new BigDecimal(bscIntAm));
	}
	/**
	 * 기본이자금액
	 */
	@XmlTransient
	public BigDecimal getBscIntAm(){
		return this.bscIntAm;
	}
	
	/**
	 * 기본이자금액
	 * 
	 * @param bscIntAm 기본이자금액
	 */
	@JsonSetter("bscIntAm")
	public void setBscIntAm(BigDecimal bscIntAm){
		this.bscIntAm= bscIntAm;
		this.setIsSet_bscIntAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_spclIntAm= false;
	protected final boolean isSet_spclIntAm(){
		return this.isSet_spclIntAm;
	}
	private void setIsSet_spclIntAm(boolean value){
		this.isSet_spclIntAm= value;
	}
	/**
	 * 특별이자금액
	 * BigDecimal - Double value setter
	 *
	 * @Param spclIntAm 특별이자금액
	 */
	public void setSpclIntAm(double spclIntAm) {
		setSpclIntAm(BigDecimal.valueOf(spclIntAm));
	}
	/**
	 * 특별이자금액
	 * BigDecimal - Long value setter
	 *
	 * @Param spclIntAm 특별이자금액
	 */
	public void setSpclIntAm(long spclIntAm) {
		setSpclIntAm(BigDecimal.valueOf(spclIntAm));
	}
	/**
	 * 특별이자금액
	 * BigDecimal - String value setter
	 *
	 * @Param spclIntAm 특별이자금액
	 */
	public void setSpclIntAm(String spclIntAm) {
		setSpclIntAm(new BigDecimal(spclIntAm));
	}
	/**
	 * 특별이자금액
	 */
	@XmlTransient
	public BigDecimal getSpclIntAm(){
		return this.spclIntAm;
	}
	
	/**
	 * 특별이자금액
	 * 
	 * @param spclIntAm 특별이자금액
	 */
	@JsonSetter("spclIntAm")
	public void setSpclIntAm(BigDecimal spclIntAm){
		this.spclIntAm= spclIntAm;
		this.setIsSet_spclIntAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_afepIntAm= false;
	protected final boolean isSet_afepIntAm(){
		return this.isSet_afepIntAm;
	}
	private void setIsSet_afepIntAm(boolean value){
		this.isSet_afepIntAm= value;
	}
	/**
	 * 만기후이자금액
	 * BigDecimal - Double value setter
	 *
	 * @Param afepIntAm 만기후이자금액
	 */
	public void setAfepIntAm(double afepIntAm) {
		setAfepIntAm(BigDecimal.valueOf(afepIntAm));
	}
	/**
	 * 만기후이자금액
	 * BigDecimal - Long value setter
	 *
	 * @Param afepIntAm 만기후이자금액
	 */
	public void setAfepIntAm(long afepIntAm) {
		setAfepIntAm(BigDecimal.valueOf(afepIntAm));
	}
	/**
	 * 만기후이자금액
	 * BigDecimal - String value setter
	 *
	 * @Param afepIntAm 만기후이자금액
	 */
	public void setAfepIntAm(String afepIntAm) {
		setAfepIntAm(new BigDecimal(afepIntAm));
	}
	/**
	 * 만기후이자금액
	 */
	@XmlTransient
	public BigDecimal getAfepIntAm(){
		return this.afepIntAm;
	}
	
	/**
	 * 만기후이자금액
	 * 
	 * @param afepIntAm 만기후이자금액
	 */
	@JsonSetter("afepIntAm")
	public void setAfepIntAm(BigDecimal afepIntAm){
		this.afepIntAm= afepIntAm;
		this.setIsSet_afepIntAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rstrIctx= false;
	protected final boolean isSet_rstrIctx(){
		return this.isSet_rstrIctx;
	}
	private void setIsSet_rstrIctx(boolean value){
		this.isSet_rstrIctx= value;
	}
	/**
	 * 환출소득세
	 * BigDecimal - Double value setter
	 *
	 * @Param rstrIctx 환출소득세
	 */
	public void setRstrIctx(double rstrIctx) {
		setRstrIctx(BigDecimal.valueOf(rstrIctx));
	}
	/**
	 * 환출소득세
	 * BigDecimal - Long value setter
	 *
	 * @Param rstrIctx 환출소득세
	 */
	public void setRstrIctx(long rstrIctx) {
		setRstrIctx(BigDecimal.valueOf(rstrIctx));
	}
	/**
	 * 환출소득세
	 * BigDecimal - String value setter
	 *
	 * @Param rstrIctx 환출소득세
	 */
	public void setRstrIctx(String rstrIctx) {
		setRstrIctx(new BigDecimal(rstrIctx));
	}
	/**
	 * 환출소득세
	 */
	@XmlTransient
	public BigDecimal getRstrIctx(){
		return this.rstrIctx;
	}
	
	/**
	 * 환출소득세
	 * 
	 * @param rstrIctx 환출소득세
	 */
	@JsonSetter("rstrIctx")
	public void setRstrIctx(BigDecimal rstrIctx){
		this.rstrIctx= rstrIctx;
		this.setIsSet_rstrIctx(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rstrRdtx= false;
	protected final boolean isSet_rstrRdtx(){
		return this.isSet_rstrRdtx;
	}
	private void setIsSet_rstrRdtx(boolean value){
		this.isSet_rstrRdtx= value;
	}
	/**
	 * 환출주민세
	 * BigDecimal - Double value setter
	 *
	 * @Param rstrRdtx 환출주민세
	 */
	public void setRstrRdtx(double rstrRdtx) {
		setRstrRdtx(BigDecimal.valueOf(rstrRdtx));
	}
	/**
	 * 환출주민세
	 * BigDecimal - Long value setter
	 *
	 * @Param rstrRdtx 환출주민세
	 */
	public void setRstrRdtx(long rstrRdtx) {
		setRstrRdtx(BigDecimal.valueOf(rstrRdtx));
	}
	/**
	 * 환출주민세
	 * BigDecimal - String value setter
	 *
	 * @Param rstrRdtx 환출주민세
	 */
	public void setRstrRdtx(String rstrRdtx) {
		setRstrRdtx(new BigDecimal(rstrRdtx));
	}
	/**
	 * 환출주민세
	 */
	@XmlTransient
	public BigDecimal getRstrRdtx(){
		return this.rstrRdtx;
	}
	
	/**
	 * 환출주민세
	 * 
	 * @param rstrRdtx 환출주민세
	 */
	@JsonSetter("rstrRdtx")
	public void setRstrRdtx(BigDecimal rstrRdtx){
		this.rstrRdtx= rstrRdtx;
		this.setIsSet_rstrRdtx(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rstrSrtx= false;
	protected final boolean isSet_rstrSrtx(){
		return this.isSet_rstrSrtx;
	}
	private void setIsSet_rstrSrtx(boolean value){
		this.isSet_rstrSrtx= value;
	}
	/**
	 * 환출농특세
	 * BigDecimal - Double value setter
	 *
	 * @Param rstrSrtx 환출농특세
	 */
	public void setRstrSrtx(double rstrSrtx) {
		setRstrSrtx(BigDecimal.valueOf(rstrSrtx));
	}
	/**
	 * 환출농특세
	 * BigDecimal - Long value setter
	 *
	 * @Param rstrSrtx 환출농특세
	 */
	public void setRstrSrtx(long rstrSrtx) {
		setRstrSrtx(BigDecimal.valueOf(rstrSrtx));
	}
	/**
	 * 환출농특세
	 * BigDecimal - String value setter
	 *
	 * @Param rstrSrtx 환출농특세
	 */
	public void setRstrSrtx(String rstrSrtx) {
		setRstrSrtx(new BigDecimal(rstrSrtx));
	}
	/**
	 * 환출농특세
	 */
	@XmlTransient
	public BigDecimal getRstrSrtx(){
		return this.rstrSrtx;
	}
	
	/**
	 * 환출농특세
	 * 
	 * @param rstrSrtx 환출농특세
	 */
	@JsonSetter("rstrSrtx")
	public void setRstrSrtx(BigDecimal rstrSrtx){
		this.rstrSrtx= rstrSrtx;
		this.setIsSet_rstrSrtx(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_impAttxSumAm= false;
	protected final boolean isSet_impAttxSumAm(){
		return this.isSet_impAttxSumAm;
	}
	private void setIsSet_impAttxSumAm(boolean value){
		this.isSet_impAttxSumAm= value;
	}
	/**
	 * 수입제세합계금액
	 * BigDecimal - Double value setter
	 *
	 * @Param impAttxSumAm 수입제세합계금액
	 */
	public void setImpAttxSumAm(double impAttxSumAm) {
		setImpAttxSumAm(BigDecimal.valueOf(impAttxSumAm));
	}
	/**
	 * 수입제세합계금액
	 * BigDecimal - Long value setter
	 *
	 * @Param impAttxSumAm 수입제세합계금액
	 */
	public void setImpAttxSumAm(long impAttxSumAm) {
		setImpAttxSumAm(BigDecimal.valueOf(impAttxSumAm));
	}
	/**
	 * 수입제세합계금액
	 * BigDecimal - String value setter
	 *
	 * @Param impAttxSumAm 수입제세합계금액
	 */
	public void setImpAttxSumAm(String impAttxSumAm) {
		setImpAttxSumAm(new BigDecimal(impAttxSumAm));
	}
	/**
	 * 수입제세합계금액
	 */
	@XmlTransient
	public BigDecimal getImpAttxSumAm(){
		return this.impAttxSumAm;
	}
	
	/**
	 * 수입제세합계금액
	 * 
	 * @param impAttxSumAm 수입제세합계금액
	 */
	@JsonSetter("impAttxSumAm")
	public void setImpAttxSumAm(BigDecimal impAttxSumAm){
		this.impAttxSumAm= impAttxSumAm;
		this.setIsSet_impAttxSumAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_intIctx= false;
	protected final boolean isSet_intIctx(){
		return this.isSet_intIctx;
	}
	private void setIsSet_intIctx(boolean value){
		this.isSet_intIctx= value;
	}
	/**
	 * 이자소득세
	 * BigDecimal - Double value setter
	 *
	 * @Param intIctx 이자소득세
	 */
	public void setIntIctx(double intIctx) {
		setIntIctx(BigDecimal.valueOf(intIctx));
	}
	/**
	 * 이자소득세
	 * BigDecimal - Long value setter
	 *
	 * @Param intIctx 이자소득세
	 */
	public void setIntIctx(long intIctx) {
		setIntIctx(BigDecimal.valueOf(intIctx));
	}
	/**
	 * 이자소득세
	 * BigDecimal - String value setter
	 *
	 * @Param intIctx 이자소득세
	 */
	public void setIntIctx(String intIctx) {
		setIntIctx(new BigDecimal(intIctx));
	}
	/**
	 * 이자소득세
	 */
	@XmlTransient
	public BigDecimal getIntIctx(){
		return this.intIctx;
	}
	
	/**
	 * 이자소득세
	 * 
	 * @param intIctx 이자소득세
	 */
	@JsonSetter("intIctx")
	public void setIntIctx(BigDecimal intIctx){
		this.intIctx= intIctx;
		this.setIsSet_intIctx(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_intIcmRdtx= false;
	protected final boolean isSet_intIcmRdtx(){
		return this.isSet_intIcmRdtx;
	}
	private void setIsSet_intIcmRdtx(boolean value){
		this.isSet_intIcmRdtx= value;
	}
	/**
	 * 이자소득주민세
	 * BigDecimal - Double value setter
	 *
	 * @Param intIcmRdtx 이자소득주민세
	 */
	public void setIntIcmRdtx(double intIcmRdtx) {
		setIntIcmRdtx(BigDecimal.valueOf(intIcmRdtx));
	}
	/**
	 * 이자소득주민세
	 * BigDecimal - Long value setter
	 *
	 * @Param intIcmRdtx 이자소득주민세
	 */
	public void setIntIcmRdtx(long intIcmRdtx) {
		setIntIcmRdtx(BigDecimal.valueOf(intIcmRdtx));
	}
	/**
	 * 이자소득주민세
	 * BigDecimal - String value setter
	 *
	 * @Param intIcmRdtx 이자소득주민세
	 */
	public void setIntIcmRdtx(String intIcmRdtx) {
		setIntIcmRdtx(new BigDecimal(intIcmRdtx));
	}
	/**
	 * 이자소득주민세
	 */
	@XmlTransient
	public BigDecimal getIntIcmRdtx(){
		return this.intIcmRdtx;
	}
	
	/**
	 * 이자소득주민세
	 * 
	 * @param intIcmRdtx 이자소득주민세
	 */
	@JsonSetter("intIcmRdtx")
	public void setIntIcmRdtx(BigDecimal intIcmRdtx){
		this.intIcmRdtx= intIcmRdtx;
		this.setIsSet_intIcmRdtx(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_intIcmSrtx= false;
	protected final boolean isSet_intIcmSrtx(){
		return this.isSet_intIcmSrtx;
	}
	private void setIsSet_intIcmSrtx(boolean value){
		this.isSet_intIcmSrtx= value;
	}
	/**
	 * 이자소득농특세
	 * BigDecimal - Double value setter
	 *
	 * @Param intIcmSrtx 이자소득농특세
	 */
	public void setIntIcmSrtx(double intIcmSrtx) {
		setIntIcmSrtx(BigDecimal.valueOf(intIcmSrtx));
	}
	/**
	 * 이자소득농특세
	 * BigDecimal - Long value setter
	 *
	 * @Param intIcmSrtx 이자소득농특세
	 */
	public void setIntIcmSrtx(long intIcmSrtx) {
		setIntIcmSrtx(BigDecimal.valueOf(intIcmSrtx));
	}
	/**
	 * 이자소득농특세
	 * BigDecimal - String value setter
	 *
	 * @Param intIcmSrtx 이자소득농특세
	 */
	public void setIntIcmSrtx(String intIcmSrtx) {
		setIntIcmSrtx(new BigDecimal(intIcmSrtx));
	}
	/**
	 * 이자소득농특세
	 */
	@XmlTransient
	public BigDecimal getIntIcmSrtx(){
		return this.intIcmSrtx;
	}
	
	/**
	 * 이자소득농특세
	 * 
	 * @param intIcmSrtx 이자소득농특세
	 */
	@JsonSetter("intIcmSrtx")
	public void setIntIcmSrtx(BigDecimal intIcmSrtx){
		this.intIcmSrtx= intIcmSrtx;
		this.setIsSet_intIcmSrtx(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cnrnAm= false;
	protected final boolean isSet_cnrnAm(){
		return this.isSet_cnrnAm;
	}
	private void setIsSet_cnrnAm(boolean value){
		this.isSet_cnrnAm= value;
	}
	/**
	 * 출연금액
	 * BigDecimal - Double value setter
	 *
	 * @Param cnrnAm 출연금액
	 */
	public void setCnrnAm(double cnrnAm) {
		setCnrnAm(BigDecimal.valueOf(cnrnAm));
	}
	/**
	 * 출연금액
	 * BigDecimal - Long value setter
	 *
	 * @Param cnrnAm 출연금액
	 */
	public void setCnrnAm(long cnrnAm) {
		setCnrnAm(BigDecimal.valueOf(cnrnAm));
	}
	/**
	 * 출연금액
	 * BigDecimal - String value setter
	 *
	 * @Param cnrnAm 출연금액
	 */
	public void setCnrnAm(String cnrnAm) {
		setCnrnAm(new BigDecimal(cnrnAm));
	}
	/**
	 * 출연금액
	 */
	@XmlTransient
	public BigDecimal getCnrnAm(){
		return this.cnrnAm;
	}
	
	/**
	 * 출연금액
	 * 
	 * @param cnrnAm 출연금액
	 */
	@JsonSetter("cnrnAm")
	public void setCnrnAm(BigDecimal cnrnAm){
		this.cnrnAm= cnrnAm;
		this.setIsSet_cnrnAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rrint= false;
	protected final boolean isSet_rrint(){
		return this.isSet_rrint;
	}
	private void setIsSet_rrint(boolean value){
		this.isSet_rrint= value;
	}
	/**
	 * 환입이자
	 * BigDecimal - Double value setter
	 *
	 * @Param rrint 환입이자
	 */
	public void setRrint(double rrint) {
		setRrint(BigDecimal.valueOf(rrint));
	}
	/**
	 * 환입이자
	 * BigDecimal - Long value setter
	 *
	 * @Param rrint 환입이자
	 */
	public void setRrint(long rrint) {
		setRrint(BigDecimal.valueOf(rrint));
	}
	/**
	 * 환입이자
	 * BigDecimal - String value setter
	 *
	 * @Param rrint 환입이자
	 */
	public void setRrint(String rrint) {
		setRrint(new BigDecimal(rrint));
	}
	/**
	 * 환입이자
	 */
	@XmlTransient
	public BigDecimal getRrint(){
		return this.rrint;
	}
	
	/**
	 * 환입이자
	 * 
	 * @param rrint 환입이자
	 */
	@JsonSetter("rrint")
	public void setRrint(BigDecimal rrint){
		this.rrint= rrint;
		this.setIsSet_rrint(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ddctSumAm= false;
	protected final boolean isSet_ddctSumAm(){
		return this.isSet_ddctSumAm;
	}
	private void setIsSet_ddctSumAm(boolean value){
		this.isSet_ddctSumAm= value;
	}
	/**
	 * 공제합계금액
	 * BigDecimal - Double value setter
	 *
	 * @Param ddctSumAm 공제합계금액
	 */
	public void setDdctSumAm(double ddctSumAm) {
		setDdctSumAm(BigDecimal.valueOf(ddctSumAm));
	}
	/**
	 * 공제합계금액
	 * BigDecimal - Long value setter
	 *
	 * @Param ddctSumAm 공제합계금액
	 */
	public void setDdctSumAm(long ddctSumAm) {
		setDdctSumAm(BigDecimal.valueOf(ddctSumAm));
	}
	/**
	 * 공제합계금액
	 * BigDecimal - String value setter
	 *
	 * @Param ddctSumAm 공제합계금액
	 */
	public void setDdctSumAm(String ddctSumAm) {
		setDdctSumAm(new BigDecimal(ddctSumAm));
	}
	/**
	 * 공제합계금액
	 */
	@XmlTransient
	public BigDecimal getDdctSumAm(){
		return this.ddctSumAm;
	}
	
	/**
	 * 공제합계금액
	 * 
	 * @param ddctSumAm 공제합계금액
	 */
	@JsonSetter("ddctSumAm")
	public void setDdctSumAm(BigDecimal ddctSumAm){
		this.ddctSumAm= ddctSumAm;
		this.setIsSet_ddctSumAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dduPayAm= false;
	protected final boolean isSet_dduPayAm(){
		return this.isSet_dduPayAm;
	}
	private void setIsSet_dduPayAm(boolean value){
		this.isSet_dduPayAm= value;
	}
	/**
	 * 차감지급금액
	 * BigDecimal - Double value setter
	 *
	 * @Param dduPayAm 차감지급금액
	 */
	public void setDduPayAm(double dduPayAm) {
		setDduPayAm(BigDecimal.valueOf(dduPayAm));
	}
	/**
	 * 차감지급금액
	 * BigDecimal - Long value setter
	 *
	 * @Param dduPayAm 차감지급금액
	 */
	public void setDduPayAm(long dduPayAm) {
		setDduPayAm(BigDecimal.valueOf(dduPayAm));
	}
	/**
	 * 차감지급금액
	 * BigDecimal - String value setter
	 *
	 * @Param dduPayAm 차감지급금액
	 */
	public void setDduPayAm(String dduPayAm) {
		setDduPayAm(new BigDecimal(dduPayAm));
	}
	/**
	 * 차감지급금액
	 */
	@XmlTransient
	public BigDecimal getDduPayAm(){
		return this.dduPayAm;
	}
	
	/**
	 * 차감지급금액
	 * 
	 * @param dduPayAm 차감지급금액
	 */
	@JsonSetter("dduPayAm")
	public void setDduPayAm(BigDecimal dduPayAm){
		this.dduPayAm= dduPayAm;
		this.setIsSet_dduPayAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ectx= false;
	protected final boolean isSet_ectx(){
		return this.isSet_ectx;
	}
	private void setIsSet_ectx(boolean value){
		this.isSet_ectx= value;
	}
	/**
	 * 교육세
	 * BigDecimal - Double value setter
	 *
	 * @Param ectx 교육세
	 */
	public void setEctx(double ectx) {
		setEctx(BigDecimal.valueOf(ectx));
	}
	/**
	 * 교육세
	 * BigDecimal - Long value setter
	 *
	 * @Param ectx 교육세
	 */
	public void setEctx(long ectx) {
		setEctx(BigDecimal.valueOf(ectx));
	}
	/**
	 * 교육세
	 * BigDecimal - String value setter
	 *
	 * @Param ectx 교육세
	 */
	public void setEctx(String ectx) {
		setEctx(new BigDecimal(ectx));
	}
	/**
	 * 교육세
	 */
	@XmlTransient
	public BigDecimal getEctx(){
		return this.ectx;
	}
	
	/**
	 * 교육세
	 * 
	 * @param ectx 교육세
	 */
	@JsonSetter("ectx")
	public void setEctx(BigDecimal ectx){
		this.ectx= ectx;
		this.setIsSet_ectx(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dftx= false;
	protected final boolean isSet_dftx(){
		return this.isSet_dftx;
	}
	private void setIsSet_dftx(boolean value){
		this.isSet_dftx= value;
	}
	/**
	 * 방위세
	 * BigDecimal - Double value setter
	 *
	 * @Param dftx 방위세
	 */
	public void setDftx(double dftx) {
		setDftx(BigDecimal.valueOf(dftx));
	}
	/**
	 * 방위세
	 * BigDecimal - Long value setter
	 *
	 * @Param dftx 방위세
	 */
	public void setDftx(long dftx) {
		setDftx(BigDecimal.valueOf(dftx));
	}
	/**
	 * 방위세
	 * BigDecimal - String value setter
	 *
	 * @Param dftx 방위세
	 */
	public void setDftx(String dftx) {
		setDftx(new BigDecimal(dftx));
	}
	/**
	 * 방위세
	 */
	@XmlTransient
	public BigDecimal getDftx(){
		return this.dftx;
	}
	
	/**
	 * 방위세
	 * 
	 * @param dftx 방위세
	 */
	@JsonSetter("dftx")
	public void setDftx(BigDecimal dftx){
		this.dftx= dftx;
		this.setIsSet_dftx(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rvsnAm= false;
	protected final boolean isSet_rvsnAm(){
		return this.isSet_rvsnAm;
	}
	private void setIsSet_rvsnAm(boolean value){
		this.isSet_rvsnAm= value;
	}
	/**
	 * 보정금액
	 * BigDecimal - Double value setter
	 *
	 * @Param rvsnAm 보정금액
	 */
	public void setRvsnAm(double rvsnAm) {
		setRvsnAm(BigDecimal.valueOf(rvsnAm));
	}
	/**
	 * 보정금액
	 * BigDecimal - Long value setter
	 *
	 * @Param rvsnAm 보정금액
	 */
	public void setRvsnAm(long rvsnAm) {
		setRvsnAm(BigDecimal.valueOf(rvsnAm));
	}
	/**
	 * 보정금액
	 * BigDecimal - String value setter
	 *
	 * @Param rvsnAm 보정금액
	 */
	public void setRvsnAm(String rvsnAm) {
		setRvsnAm(new BigDecimal(rvsnAm));
	}
	/**
	 * 보정금액
	 */
	@XmlTransient
	public BigDecimal getRvsnAm(){
		return this.rvsnAm;
	}
	
	/**
	 * 보정금액
	 * 
	 * @param rvsnAm 보정금액
	 */
	@JsonSetter("rvsnAm")
	public void setRvsnAm(BigDecimal rvsnAm){
		this.rvsnAm= rvsnAm;
		this.setIsSet_rvsnAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_slchIntx= false;
	protected final boolean isSet_slchIntx(){
		return this.isSet_slchIntx;
	}
	private void setIsSet_slchIntx(boolean value){
		this.isSet_slchIntx= value;
	}
	/**
	 * 추징이자세
	 * BigDecimal - Double value setter
	 *
	 * @Param slchIntx 추징이자세
	 */
	public void setSlchIntx(double slchIntx) {
		setSlchIntx(BigDecimal.valueOf(slchIntx));
	}
	/**
	 * 추징이자세
	 * BigDecimal - Long value setter
	 *
	 * @Param slchIntx 추징이자세
	 */
	public void setSlchIntx(long slchIntx) {
		setSlchIntx(BigDecimal.valueOf(slchIntx));
	}
	/**
	 * 추징이자세
	 * BigDecimal - String value setter
	 *
	 * @Param slchIntx 추징이자세
	 */
	public void setSlchIntx(String slchIntx) {
		setSlchIntx(new BigDecimal(slchIntx));
	}
	/**
	 * 추징이자세
	 */
	@XmlTransient
	public BigDecimal getSlchIntx(){
		return this.slchIntx;
	}
	
	/**
	 * 추징이자세
	 * 
	 * @param slchIntx 추징이자세
	 */
	@JsonSetter("slchIntx")
	public void setSlchIntx(BigDecimal slchIntx){
		this.slchIntx= slchIntx;
		this.setIsSet_slchIntx(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_slchPvnsIctx= false;
	protected final boolean isSet_slchPvnsIctx(){
		return this.isSet_slchPvnsIctx;
	}
	private void setIsSet_slchPvnsIctx(boolean value){
		this.isSet_slchPvnsIctx= value;
	}
	/**
	 * 추징지방소득세
	 * BigDecimal - Double value setter
	 *
	 * @Param slchPvnsIctx 추징지방소득세
	 */
	public void setSlchPvnsIctx(double slchPvnsIctx) {
		setSlchPvnsIctx(BigDecimal.valueOf(slchPvnsIctx));
	}
	/**
	 * 추징지방소득세
	 * BigDecimal - Long value setter
	 *
	 * @Param slchPvnsIctx 추징지방소득세
	 */
	public void setSlchPvnsIctx(long slchPvnsIctx) {
		setSlchPvnsIctx(BigDecimal.valueOf(slchPvnsIctx));
	}
	/**
	 * 추징지방소득세
	 * BigDecimal - String value setter
	 *
	 * @Param slchPvnsIctx 추징지방소득세
	 */
	public void setSlchPvnsIctx(String slchPvnsIctx) {
		setSlchPvnsIctx(new BigDecimal(slchPvnsIctx));
	}
	/**
	 * 추징지방소득세
	 */
	@XmlTransient
	public BigDecimal getSlchPvnsIctx(){
		return this.slchPvnsIctx;
	}
	
	/**
	 * 추징지방소득세
	 * 
	 * @param slchPvnsIctx 추징지방소득세
	 */
	@JsonSetter("slchPvnsIctx")
	public void setSlchPvnsIctx(BigDecimal slchPvnsIctx){
		this.slchPvnsIctx= slchPvnsIctx;
		this.setIsSet_slchPvnsIctx(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_paySumAm= false;
	protected final boolean isSet_paySumAm(){
		return this.isSet_paySumAm;
	}
	private void setIsSet_paySumAm(boolean value){
		this.isSet_paySumAm= value;
	}
	/**
	 * 지급합계금액
	 * BigDecimal - Double value setter
	 *
	 * @Param paySumAm 지급합계금액
	 */
	public void setPaySumAm(double paySumAm) {
		setPaySumAm(BigDecimal.valueOf(paySumAm));
	}
	/**
	 * 지급합계금액
	 * BigDecimal - Long value setter
	 *
	 * @Param paySumAm 지급합계금액
	 */
	public void setPaySumAm(long paySumAm) {
		setPaySumAm(BigDecimal.valueOf(paySumAm));
	}
	/**
	 * 지급합계금액
	 * BigDecimal - String value setter
	 *
	 * @Param paySumAm 지급합계금액
	 */
	public void setPaySumAm(String paySumAm) {
		setPaySumAm(new BigDecimal(paySumAm));
	}
	/**
	 * 지급합계금액
	 */
	@XmlTransient
	public BigDecimal getPaySumAm(){
		return this.paySumAm;
	}
	
	/**
	 * 지급합계금액
	 * 
	 * @param paySumAm 지급합계금액
	 */
	@JsonSetter("paySumAm")
	public void setPaySumAm(BigDecimal paySumAm){
		this.paySumAm= paySumAm;
		this.setIsSet_paySumAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_fcIntAm= false;
	protected final boolean isSet_fcIntAm(){
		return this.isSet_fcIntAm;
	}
	private void setIsSet_fcIntAm(boolean value){
		this.isSet_fcIntAm= value;
	}
	/**
	 * 외화이자금액
	 * BigDecimal - Double value setter
	 *
	 * @Param fcIntAm 외화이자금액
	 */
	public void setFcIntAm(double fcIntAm) {
		setFcIntAm(BigDecimal.valueOf(fcIntAm));
	}
	/**
	 * 외화이자금액
	 * BigDecimal - Long value setter
	 *
	 * @Param fcIntAm 외화이자금액
	 */
	public void setFcIntAm(long fcIntAm) {
		setFcIntAm(BigDecimal.valueOf(fcIntAm));
	}
	/**
	 * 외화이자금액
	 * BigDecimal - String value setter
	 *
	 * @Param fcIntAm 외화이자금액
	 */
	public void setFcIntAm(String fcIntAm) {
		setFcIntAm(new BigDecimal(fcIntAm));
	}
	/**
	 * 외화이자금액
	 */
	@XmlTransient
	public BigDecimal getFcIntAm(){
		return this.fcIntAm;
	}
	
	/**
	 * 외화이자금액
	 * 
	 * @param fcIntAm 외화이자금액
	 */
	@JsonSetter("fcIntAm")
	public void setFcIntAm(BigDecimal fcIntAm){
		this.fcIntAm= fcIntAm;
		this.setIsSet_fcIntAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_fcRstrAttxAm= false;
	protected final boolean isSet_fcRstrAttxAm(){
		return this.isSet_fcRstrAttxAm;
	}
	private void setIsSet_fcRstrAttxAm(boolean value){
		this.isSet_fcRstrAttxAm= value;
	}
	/**
	 * 외화환출제세금액
	 * BigDecimal - Double value setter
	 *
	 * @Param fcRstrAttxAm 외화환출제세금액
	 */
	public void setFcRstrAttxAm(double fcRstrAttxAm) {
		setFcRstrAttxAm(BigDecimal.valueOf(fcRstrAttxAm));
	}
	/**
	 * 외화환출제세금액
	 * BigDecimal - Long value setter
	 *
	 * @Param fcRstrAttxAm 외화환출제세금액
	 */
	public void setFcRstrAttxAm(long fcRstrAttxAm) {
		setFcRstrAttxAm(BigDecimal.valueOf(fcRstrAttxAm));
	}
	/**
	 * 외화환출제세금액
	 * BigDecimal - String value setter
	 *
	 * @Param fcRstrAttxAm 외화환출제세금액
	 */
	public void setFcRstrAttxAm(String fcRstrAttxAm) {
		setFcRstrAttxAm(new BigDecimal(fcRstrAttxAm));
	}
	/**
	 * 외화환출제세금액
	 */
	@XmlTransient
	public BigDecimal getFcRstrAttxAm(){
		return this.fcRstrAttxAm;
	}
	
	/**
	 * 외화환출제세금액
	 * 
	 * @param fcRstrAttxAm 외화환출제세금액
	 */
	@JsonSetter("fcRstrAttxAm")
	public void setFcRstrAttxAm(BigDecimal fcRstrAttxAm){
		this.fcRstrAttxAm= fcRstrAttxAm;
		this.setIsSet_fcRstrAttxAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_fcRrintAm= false;
	protected final boolean isSet_fcRrintAm(){
		return this.isSet_fcRrintAm;
	}
	private void setIsSet_fcRrintAm(boolean value){
		this.isSet_fcRrintAm= value;
	}
	/**
	 * 외화환입이자금액
	 * BigDecimal - Double value setter
	 *
	 * @Param fcRrintAm 외화환입이자금액
	 */
	public void setFcRrintAm(double fcRrintAm) {
		setFcRrintAm(BigDecimal.valueOf(fcRrintAm));
	}
	/**
	 * 외화환입이자금액
	 * BigDecimal - Long value setter
	 *
	 * @Param fcRrintAm 외화환입이자금액
	 */
	public void setFcRrintAm(long fcRrintAm) {
		setFcRrintAm(BigDecimal.valueOf(fcRrintAm));
	}
	/**
	 * 외화환입이자금액
	 * BigDecimal - String value setter
	 *
	 * @Param fcRrintAm 외화환입이자금액
	 */
	public void setFcRrintAm(String fcRrintAm) {
		setFcRrintAm(new BigDecimal(fcRrintAm));
	}
	/**
	 * 외화환입이자금액
	 */
	@XmlTransient
	public BigDecimal getFcRrintAm(){
		return this.fcRrintAm;
	}
	
	/**
	 * 외화환입이자금액
	 * 
	 * @param fcRrintAm 외화환입이자금액
	 */
	@JsonSetter("fcRrintAm")
	public void setFcRrintAm(BigDecimal fcRrintAm){
		this.fcRrintAm= fcRrintAm;
		this.setIsSet_fcRrintAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_fcImpAttxAm= false;
	protected final boolean isSet_fcImpAttxAm(){
		return this.isSet_fcImpAttxAm;
	}
	private void setIsSet_fcImpAttxAm(boolean value){
		this.isSet_fcImpAttxAm= value;
	}
	/**
	 * 외화수입제세금액
	 * BigDecimal - Double value setter
	 *
	 * @Param fcImpAttxAm 외화수입제세금액
	 */
	public void setFcImpAttxAm(double fcImpAttxAm) {
		setFcImpAttxAm(BigDecimal.valueOf(fcImpAttxAm));
	}
	/**
	 * 외화수입제세금액
	 * BigDecimal - Long value setter
	 *
	 * @Param fcImpAttxAm 외화수입제세금액
	 */
	public void setFcImpAttxAm(long fcImpAttxAm) {
		setFcImpAttxAm(BigDecimal.valueOf(fcImpAttxAm));
	}
	/**
	 * 외화수입제세금액
	 * BigDecimal - String value setter
	 *
	 * @Param fcImpAttxAm 외화수입제세금액
	 */
	public void setFcImpAttxAm(String fcImpAttxAm) {
		setFcImpAttxAm(new BigDecimal(fcImpAttxAm));
	}
	/**
	 * 외화수입제세금액
	 */
	@XmlTransient
	public BigDecimal getFcImpAttxAm(){
		return this.fcImpAttxAm;
	}
	
	/**
	 * 외화수입제세금액
	 * 
	 * @param fcImpAttxAm 외화수입제세금액
	 */
	@JsonSetter("fcImpAttxAm")
	public void setFcImpAttxAm(BigDecimal fcImpAttxAm){
		this.fcImpAttxAm= fcImpAttxAm;
		this.setIsSet_fcImpAttxAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pstmRticmStaxAm= false;
	protected final boolean isSet_pstmRticmStaxAm(){
		return this.isSet_pstmRticmStaxAm;
	}
	private void setIsSet_pstmRticmStaxAm(boolean value){
		this.isSet_pstmRticmStaxAm= value;
	}
	/**
	 * 이연퇴직소득과세표준금액
	 * BigDecimal - Double value setter
	 *
	 * @Param pstmRticmStaxAm 이연퇴직소득과세표준금액
	 */
	public void setPstmRticmStaxAm(double pstmRticmStaxAm) {
		setPstmRticmStaxAm(BigDecimal.valueOf(pstmRticmStaxAm));
	}
	/**
	 * 이연퇴직소득과세표준금액
	 * BigDecimal - Long value setter
	 *
	 * @Param pstmRticmStaxAm 이연퇴직소득과세표준금액
	 */
	public void setPstmRticmStaxAm(long pstmRticmStaxAm) {
		setPstmRticmStaxAm(BigDecimal.valueOf(pstmRticmStaxAm));
	}
	/**
	 * 이연퇴직소득과세표준금액
	 * BigDecimal - String value setter
	 *
	 * @Param pstmRticmStaxAm 이연퇴직소득과세표준금액
	 */
	public void setPstmRticmStaxAm(String pstmRticmStaxAm) {
		setPstmRticmStaxAm(new BigDecimal(pstmRticmStaxAm));
	}
	/**
	 * 이연퇴직소득과세표준금액
	 */
	@XmlTransient
	public BigDecimal getPstmRticmStaxAm(){
		return this.pstmRticmStaxAm;
	}
	
	/**
	 * 이연퇴직소득과세표준금액
	 * 
	 * @param pstmRticmStaxAm 이연퇴직소득과세표준금액
	 */
	@JsonSetter("pstmRticmStaxAm")
	public void setPstmRticmStaxAm(BigDecimal pstmRticmStaxAm){
		this.pstmRticmStaxAm= pstmRticmStaxAm;
		this.setIsSet_pstmRticmStaxAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pstmPnsnIctx= false;
	protected final boolean isSet_pstmPnsnIctx(){
		return this.isSet_pstmPnsnIctx;
	}
	private void setIsSet_pstmPnsnIctx(boolean value){
		this.isSet_pstmPnsnIctx= value;
	}
	/**
	 * 이연연금소득세
	 * BigDecimal - Double value setter
	 *
	 * @Param pstmPnsnIctx 이연연금소득세
	 */
	public void setPstmPnsnIctx(double pstmPnsnIctx) {
		setPstmPnsnIctx(BigDecimal.valueOf(pstmPnsnIctx));
	}
	/**
	 * 이연연금소득세
	 * BigDecimal - Long value setter
	 *
	 * @Param pstmPnsnIctx 이연연금소득세
	 */
	public void setPstmPnsnIctx(long pstmPnsnIctx) {
		setPstmPnsnIctx(BigDecimal.valueOf(pstmPnsnIctx));
	}
	/**
	 * 이연연금소득세
	 * BigDecimal - String value setter
	 *
	 * @Param pstmPnsnIctx 이연연금소득세
	 */
	public void setPstmPnsnIctx(String pstmPnsnIctx) {
		setPstmPnsnIctx(new BigDecimal(pstmPnsnIctx));
	}
	/**
	 * 이연연금소득세
	 */
	@XmlTransient
	public BigDecimal getPstmPnsnIctx(){
		return this.pstmPnsnIctx;
	}
	
	/**
	 * 이연연금소득세
	 * 
	 * @param pstmPnsnIctx 이연연금소득세
	 */
	@JsonSetter("pstmPnsnIctx")
	public void setPstmPnsnIctx(BigDecimal pstmPnsnIctx){
		this.pstmPnsnIctx= pstmPnsnIctx;
		this.setIsSet_pstmPnsnIctx(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pstmRticmUsgAm= false;
	protected final boolean isSet_pstmRticmUsgAm(){
		return this.isSet_pstmRticmUsgAm;
	}
	private void setIsSet_pstmRticmUsgAm(boolean value){
		this.isSet_pstmRticmUsgAm= value;
	}
	/**
	 * 이연퇴직소득사용금액
	 * BigDecimal - Double value setter
	 *
	 * @Param pstmRticmUsgAm 이연퇴직소득사용금액
	 */
	public void setPstmRticmUsgAm(double pstmRticmUsgAm) {
		setPstmRticmUsgAm(BigDecimal.valueOf(pstmRticmUsgAm));
	}
	/**
	 * 이연퇴직소득사용금액
	 * BigDecimal - Long value setter
	 *
	 * @Param pstmRticmUsgAm 이연퇴직소득사용금액
	 */
	public void setPstmRticmUsgAm(long pstmRticmUsgAm) {
		setPstmRticmUsgAm(BigDecimal.valueOf(pstmRticmUsgAm));
	}
	/**
	 * 이연퇴직소득사용금액
	 * BigDecimal - String value setter
	 *
	 * @Param pstmRticmUsgAm 이연퇴직소득사용금액
	 */
	public void setPstmRticmUsgAm(String pstmRticmUsgAm) {
		setPstmRticmUsgAm(new BigDecimal(pstmRticmUsgAm));
	}
	/**
	 * 이연퇴직소득사용금액
	 */
	@XmlTransient
	public BigDecimal getPstmRticmUsgAm(){
		return this.pstmRticmUsgAm;
	}
	
	/**
	 * 이연퇴직소득사용금액
	 * 
	 * @param pstmRticmUsgAm 이연퇴직소득사용금액
	 */
	@JsonSetter("pstmRticmUsgAm")
	public void setPstmRticmUsgAm(BigDecimal pstmRticmUsgAm){
		this.pstmRticmUsgAm= pstmRticmUsgAm;
		this.setIsSet_pstmRticmUsgAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pstmPnsnRdtx= false;
	protected final boolean isSet_pstmPnsnRdtx(){
		return this.isSet_pstmPnsnRdtx;
	}
	private void setIsSet_pstmPnsnRdtx(boolean value){
		this.isSet_pstmPnsnRdtx= value;
	}
	/**
	 * 이연연금주민세
	 * BigDecimal - Double value setter
	 *
	 * @Param pstmPnsnRdtx 이연연금주민세
	 */
	public void setPstmPnsnRdtx(double pstmPnsnRdtx) {
		setPstmPnsnRdtx(BigDecimal.valueOf(pstmPnsnRdtx));
	}
	/**
	 * 이연연금주민세
	 * BigDecimal - Long value setter
	 *
	 * @Param pstmPnsnRdtx 이연연금주민세
	 */
	public void setPstmPnsnRdtx(long pstmPnsnRdtx) {
		setPstmPnsnRdtx(BigDecimal.valueOf(pstmPnsnRdtx));
	}
	/**
	 * 이연연금주민세
	 * BigDecimal - String value setter
	 *
	 * @Param pstmPnsnRdtx 이연연금주민세
	 */
	public void setPstmPnsnRdtx(String pstmPnsnRdtx) {
		setPstmPnsnRdtx(new BigDecimal(pstmPnsnRdtx));
	}
	/**
	 * 이연연금주민세
	 */
	@XmlTransient
	public BigDecimal getPstmPnsnRdtx(){
		return this.pstmPnsnRdtx;
	}
	
	/**
	 * 이연연금주민세
	 * 
	 * @param pstmPnsnRdtx 이연연금주민세
	 */
	@JsonSetter("pstmPnsnRdtx")
	public void setPstmPnsnRdtx(BigDecimal pstmPnsnRdtx){
		this.pstmPnsnRdtx= pstmPnsnRdtx;
		this.setIsSet_pstmPnsnRdtx(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pstmRticmTax= false;
	protected final boolean isSet_pstmRticmTax(){
		return this.isSet_pstmRticmTax;
	}
	private void setIsSet_pstmRticmTax(boolean value){
		this.isSet_pstmRticmTax= value;
	}
	/**
	 * 이연퇴직소득세
	 * BigDecimal - Double value setter
	 *
	 * @Param pstmRticmTax 이연퇴직소득세
	 */
	public void setPstmRticmTax(double pstmRticmTax) {
		setPstmRticmTax(BigDecimal.valueOf(pstmRticmTax));
	}
	/**
	 * 이연퇴직소득세
	 * BigDecimal - Long value setter
	 *
	 * @Param pstmRticmTax 이연퇴직소득세
	 */
	public void setPstmRticmTax(long pstmRticmTax) {
		setPstmRticmTax(BigDecimal.valueOf(pstmRticmTax));
	}
	/**
	 * 이연퇴직소득세
	 * BigDecimal - String value setter
	 *
	 * @Param pstmRticmTax 이연퇴직소득세
	 */
	public void setPstmRticmTax(String pstmRticmTax) {
		setPstmRticmTax(new BigDecimal(pstmRticmTax));
	}
	/**
	 * 이연퇴직소득세
	 */
	@XmlTransient
	public BigDecimal getPstmRticmTax(){
		return this.pstmRticmTax;
	}
	
	/**
	 * 이연퇴직소득세
	 * 
	 * @param pstmRticmTax 이연퇴직소득세
	 */
	@JsonSetter("pstmRticmTax")
	public void setPstmRticmTax(BigDecimal pstmRticmTax){
		this.pstmRticmTax= pstmRticmTax;
		this.setIsSet_pstmRticmTax(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pstmRtrtRdtx= false;
	protected final boolean isSet_pstmRtrtRdtx(){
		return this.isSet_pstmRtrtRdtx;
	}
	private void setIsSet_pstmRtrtRdtx(boolean value){
		this.isSet_pstmRtrtRdtx= value;
	}
	/**
	 * 이연퇴직주민세
	 * BigDecimal - Double value setter
	 *
	 * @Param pstmRtrtRdtx 이연퇴직주민세
	 */
	public void setPstmRtrtRdtx(double pstmRtrtRdtx) {
		setPstmRtrtRdtx(BigDecimal.valueOf(pstmRtrtRdtx));
	}
	/**
	 * 이연퇴직주민세
	 * BigDecimal - Long value setter
	 *
	 * @Param pstmRtrtRdtx 이연퇴직주민세
	 */
	public void setPstmRtrtRdtx(long pstmRtrtRdtx) {
		setPstmRtrtRdtx(BigDecimal.valueOf(pstmRtrtRdtx));
	}
	/**
	 * 이연퇴직주민세
	 * BigDecimal - String value setter
	 *
	 * @Param pstmRtrtRdtx 이연퇴직주민세
	 */
	public void setPstmRtrtRdtx(String pstmRtrtRdtx) {
		setPstmRtrtRdtx(new BigDecimal(pstmRtrtRdtx));
	}
	/**
	 * 이연퇴직주민세
	 */
	@XmlTransient
	public BigDecimal getPstmRtrtRdtx(){
		return this.pstmRtrtRdtx;
	}
	
	/**
	 * 이연퇴직주민세
	 * 
	 * @param pstmRtrtRdtx 이연퇴직주민세
	 */
	@JsonSetter("pstmRtrtRdtx")
	public void setPstmRtrtRdtx(BigDecimal pstmRtrtRdtx){
		this.pstmRtrtRdtx= pstmRtrtRdtx;
		this.setIsSet_pstmRtrtRdtx(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rtnPocpFee= false;
	protected final boolean isSet_rtnPocpFee(){
		return this.isSet_rtnPocpFee;
	}
	private void setIsSet_rtnPocpFee(boolean value){
		this.isSet_rtnPocpFee= value;
	}
	/**
	 * 반환선취수수료
	 * BigDecimal - Double value setter
	 *
	 * @Param rtnPocpFee 반환선취수수료
	 */
	public void setRtnPocpFee(double rtnPocpFee) {
		setRtnPocpFee(BigDecimal.valueOf(rtnPocpFee));
	}
	/**
	 * 반환선취수수료
	 * BigDecimal - Long value setter
	 *
	 * @Param rtnPocpFee 반환선취수수료
	 */
	public void setRtnPocpFee(long rtnPocpFee) {
		setRtnPocpFee(BigDecimal.valueOf(rtnPocpFee));
	}
	/**
	 * 반환선취수수료
	 * BigDecimal - String value setter
	 *
	 * @Param rtnPocpFee 반환선취수수료
	 */
	public void setRtnPocpFee(String rtnPocpFee) {
		setRtnPocpFee(new BigDecimal(rtnPocpFee));
	}
	/**
	 * 반환선취수수료
	 */
	@XmlTransient
	public BigDecimal getRtnPocpFee(){
		return this.rtnPocpFee;
	}
	
	/**
	 * 반환선취수수료
	 * 
	 * @param rtnPocpFee 반환선취수수료
	 */
	@JsonSetter("rtnPocpFee")
	public void setRtnPocpFee(BigDecimal rtnPocpFee){
		this.rtnPocpFee= rtnPocpFee;
		this.setIsSet_rtnPocpFee(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_etcIcmStaxAm= false;
	protected final boolean isSet_etcIcmStaxAm(){
		return this.isSet_etcIcmStaxAm;
	}
	private void setIsSet_etcIcmStaxAm(boolean value){
		this.isSet_etcIcmStaxAm= value;
	}
	/**
	 * 기타소득과세표준금액
	 * BigDecimal - Double value setter
	 *
	 * @Param etcIcmStaxAm 기타소득과세표준금액
	 */
	public void setEtcIcmStaxAm(double etcIcmStaxAm) {
		setEtcIcmStaxAm(BigDecimal.valueOf(etcIcmStaxAm));
	}
	/**
	 * 기타소득과세표준금액
	 * BigDecimal - Long value setter
	 *
	 * @Param etcIcmStaxAm 기타소득과세표준금액
	 */
	public void setEtcIcmStaxAm(long etcIcmStaxAm) {
		setEtcIcmStaxAm(BigDecimal.valueOf(etcIcmStaxAm));
	}
	/**
	 * 기타소득과세표준금액
	 * BigDecimal - String value setter
	 *
	 * @Param etcIcmStaxAm 기타소득과세표준금액
	 */
	public void setEtcIcmStaxAm(String etcIcmStaxAm) {
		setEtcIcmStaxAm(new BigDecimal(etcIcmStaxAm));
	}
	/**
	 * 기타소득과세표준금액
	 */
	@XmlTransient
	public BigDecimal getEtcIcmStaxAm(){
		return this.etcIcmStaxAm;
	}
	
	/**
	 * 기타소득과세표준금액
	 * 
	 * @param etcIcmStaxAm 기타소득과세표준금액
	 */
	@JsonSetter("etcIcmStaxAm")
	public void setEtcIcmStaxAm(BigDecimal etcIcmStaxAm){
		this.etcIcmStaxAm= etcIcmStaxAm;
		this.setIsSet_etcIcmStaxAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_staxHovMnuAdj= false;
	protected final boolean isSet_staxHovMnuAdj(){
		return this.isSet_staxHovMnuAdj;
	}
	private void setIsSet_staxHovMnuAdj(boolean value){
		this.isSet_staxHovMnuAdj= value;
	}
	/**
	 * 과세표준유보분조정
	 * BigDecimal - Double value setter
	 *
	 * @Param staxHovMnuAdj 과세표준유보분조정
	 */
	public void setStaxHovMnuAdj(double staxHovMnuAdj) {
		setStaxHovMnuAdj(BigDecimal.valueOf(staxHovMnuAdj));
	}
	/**
	 * 과세표준유보분조정
	 * BigDecimal - Long value setter
	 *
	 * @Param staxHovMnuAdj 과세표준유보분조정
	 */
	public void setStaxHovMnuAdj(long staxHovMnuAdj) {
		setStaxHovMnuAdj(BigDecimal.valueOf(staxHovMnuAdj));
	}
	/**
	 * 과세표준유보분조정
	 * BigDecimal - String value setter
	 *
	 * @Param staxHovMnuAdj 과세표준유보분조정
	 */
	public void setStaxHovMnuAdj(String staxHovMnuAdj) {
		setStaxHovMnuAdj(new BigDecimal(staxHovMnuAdj));
	}
	/**
	 * 과세표준유보분조정
	 */
	@XmlTransient
	public BigDecimal getStaxHovMnuAdj(){
		return this.staxHovMnuAdj;
	}
	
	/**
	 * 과세표준유보분조정
	 * 
	 * @param staxHovMnuAdj 과세표준유보분조정
	 */
	@JsonSetter("staxHovMnuAdj")
	public void setStaxHovMnuAdj(BigDecimal staxHovMnuAdj){
		this.staxHovMnuAdj= staxHovMnuAdj;
		this.setIsSet_staxHovMnuAdj(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_feeStaxDdu= false;
	protected final boolean isSet_feeStaxDdu(){
		return this.isSet_feeStaxDdu;
	}
	private void setIsSet_feeStaxDdu(boolean value){
		this.isSet_feeStaxDdu= value;
	}
	/**
	 * 수수료과세표준차감
	 * BigDecimal - Double value setter
	 *
	 * @Param feeStaxDdu 수수료과세표준차감
	 */
	public void setFeeStaxDdu(double feeStaxDdu) {
		setFeeStaxDdu(BigDecimal.valueOf(feeStaxDdu));
	}
	/**
	 * 수수료과세표준차감
	 * BigDecimal - Long value setter
	 *
	 * @Param feeStaxDdu 수수료과세표준차감
	 */
	public void setFeeStaxDdu(long feeStaxDdu) {
		setFeeStaxDdu(BigDecimal.valueOf(feeStaxDdu));
	}
	/**
	 * 수수료과세표준차감
	 * BigDecimal - String value setter
	 *
	 * @Param feeStaxDdu 수수료과세표준차감
	 */
	public void setFeeStaxDdu(String feeStaxDdu) {
		setFeeStaxDdu(new BigDecimal(feeStaxDdu));
	}
	/**
	 * 수수료과세표준차감
	 */
	@XmlTransient
	public BigDecimal getFeeStaxDdu(){
		return this.feeStaxDdu;
	}
	
	/**
	 * 수수료과세표준차감
	 * 
	 * @param feeStaxDdu 수수료과세표준차감
	 */
	@JsonSetter("feeStaxDdu")
	public void setFeeStaxDdu(BigDecimal feeStaxDdu){
		this.feeStaxDdu= feeStaxDdu;
		this.setIsSet_feeStaxDdu(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_usumEvlAm= false;
	protected final boolean isSet_usumEvlAm(){
		return this.isSet_usumEvlAm;
	}
	private void setIsSet_usumEvlAm(boolean value){
		this.isSet_usumEvlAm= value;
	}
	/**
	 * 합산평가금액
	 * BigDecimal - Double value setter
	 *
	 * @Param usumEvlAm 합산평가금액
	 */
	public void setUsumEvlAm(double usumEvlAm) {
		setUsumEvlAm(BigDecimal.valueOf(usumEvlAm));
	}
	/**
	 * 합산평가금액
	 * BigDecimal - Long value setter
	 *
	 * @Param usumEvlAm 합산평가금액
	 */
	public void setUsumEvlAm(long usumEvlAm) {
		setUsumEvlAm(BigDecimal.valueOf(usumEvlAm));
	}
	/**
	 * 합산평가금액
	 * BigDecimal - String value setter
	 *
	 * @Param usumEvlAm 합산평가금액
	 */
	public void setUsumEvlAm(String usumEvlAm) {
		setUsumEvlAm(new BigDecimal(usumEvlAm));
	}
	/**
	 * 합산평가금액
	 */
	@XmlTransient
	public BigDecimal getUsumEvlAm(){
		return this.usumEvlAm;
	}
	
	/**
	 * 합산평가금액
	 * 
	 * @param usumEvlAm 합산평가금액
	 */
	@JsonSetter("usumEvlAm")
	public void setUsumEvlAm(BigDecimal usumEvlAm){
		this.usumEvlAm= usumEvlAm;
		this.setIsSet_usumEvlAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_moAcno= false;
	protected final boolean isSet_moAcno(){
		return this.isSet_moAcno;
	}
	private void setIsSet_moAcno(boolean value){
		this.isSet_moAcno= value;
	}
	/**
	 * 모계좌번호
	 */
	@XmlTransient
	public String getMoAcno(){
		return this.moAcno;
	}
	
	/**
	 * 모계좌번호
	 * 
	 * @param moAcno 모계좌번호
	 */
	public void setMoAcno(String moAcno){
		this.moAcno= moAcno;
		this.setIsSet_moAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_frgStcLossOfst= false;
	protected final boolean isSet_frgStcLossOfst(){
		return this.isSet_frgStcLossOfst;
	}
	private void setIsSet_frgStcLossOfst(boolean value){
		this.isSet_frgStcLossOfst= value;
	}
	/**
	 * 해외주식손실상계
	 * BigDecimal - Double value setter
	 *
	 * @Param frgStcLossOfst 해외주식손실상계
	 */
	public void setFrgStcLossOfst(double frgStcLossOfst) {
		setFrgStcLossOfst(BigDecimal.valueOf(frgStcLossOfst));
	}
	/**
	 * 해외주식손실상계
	 * BigDecimal - Long value setter
	 *
	 * @Param frgStcLossOfst 해외주식손실상계
	 */
	public void setFrgStcLossOfst(long frgStcLossOfst) {
		setFrgStcLossOfst(BigDecimal.valueOf(frgStcLossOfst));
	}
	/**
	 * 해외주식손실상계
	 * BigDecimal - String value setter
	 *
	 * @Param frgStcLossOfst 해외주식손실상계
	 */
	public void setFrgStcLossOfst(String frgStcLossOfst) {
		setFrgStcLossOfst(new BigDecimal(frgStcLossOfst));
	}
	/**
	 * 해외주식손실상계
	 */
	@XmlTransient
	public BigDecimal getFrgStcLossOfst(){
		return this.frgStcLossOfst;
	}
	
	/**
	 * 해외주식손실상계
	 * 
	 * @param frgStcLossOfst 해외주식손실상계
	 */
	@JsonSetter("frgStcLossOfst")
	public void setFrgStcLossOfst(BigDecimal frgStcLossOfst){
		this.frgStcLossOfst= frgStcLossOfst;
		this.setIsSet_frgStcLossOfst(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_staxDduTcmPfeAm= false;
	protected final boolean isSet_staxDduTcmPfeAm(){
		return this.isSet_staxDduTcmPfeAm;
	}
	private void setIsSet_staxDduTcmPfeAm(boolean value){
		this.isSet_staxDduTcmPfeAm= value;
	}
	/**
	 * 과세표준차감성과보수금액
	 * BigDecimal - Double value setter
	 *
	 * @Param staxDduTcmPfeAm 과세표준차감성과보수금액
	 */
	public void setStaxDduTcmPfeAm(double staxDduTcmPfeAm) {
		setStaxDduTcmPfeAm(BigDecimal.valueOf(staxDduTcmPfeAm));
	}
	/**
	 * 과세표준차감성과보수금액
	 * BigDecimal - Long value setter
	 *
	 * @Param staxDduTcmPfeAm 과세표준차감성과보수금액
	 */
	public void setStaxDduTcmPfeAm(long staxDduTcmPfeAm) {
		setStaxDduTcmPfeAm(BigDecimal.valueOf(staxDduTcmPfeAm));
	}
	/**
	 * 과세표준차감성과보수금액
	 * BigDecimal - String value setter
	 *
	 * @Param staxDduTcmPfeAm 과세표준차감성과보수금액
	 */
	public void setStaxDduTcmPfeAm(String staxDduTcmPfeAm) {
		setStaxDduTcmPfeAm(new BigDecimal(staxDduTcmPfeAm));
	}
	/**
	 * 과세표준차감성과보수금액
	 */
	@XmlTransient
	public BigDecimal getStaxDduTcmPfeAm(){
		return this.staxDduTcmPfeAm;
	}
	
	/**
	 * 과세표준차감성과보수금액
	 * 
	 * @param staxDduTcmPfeAm 과세표준차감성과보수금액
	 */
	@JsonSetter("staxDduTcmPfeAm")
	public void setStaxDduTcmPfeAm(BigDecimal staxDduTcmPfeAm){
		this.staxDduTcmPfeAm= staxDduTcmPfeAm;
		this.setIsSet_staxDduTcmPfeAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_lstStaxAm= false;
	protected final boolean isSet_lstStaxAm(){
		return this.isSet_lstStaxAm;
	}
	private void setIsSet_lstStaxAm(boolean value){
		this.isSet_lstStaxAm= value;
	}
	/**
	 * 최종과세표준금액
	 * BigDecimal - Double value setter
	 *
	 * @Param lstStaxAm 최종과세표준금액
	 */
	public void setLstStaxAm(double lstStaxAm) {
		setLstStaxAm(BigDecimal.valueOf(lstStaxAm));
	}
	/**
	 * 최종과세표준금액
	 * BigDecimal - Long value setter
	 *
	 * @Param lstStaxAm 최종과세표준금액
	 */
	public void setLstStaxAm(long lstStaxAm) {
		setLstStaxAm(BigDecimal.valueOf(lstStaxAm));
	}
	/**
	 * 최종과세표준금액
	 * BigDecimal - String value setter
	 *
	 * @Param lstStaxAm 최종과세표준금액
	 */
	public void setLstStaxAm(String lstStaxAm) {
		setLstStaxAm(new BigDecimal(lstStaxAm));
	}
	/**
	 * 최종과세표준금액
	 */
	@XmlTransient
	public BigDecimal getLstStaxAm(){
		return this.lstStaxAm;
	}
	
	/**
	 * 최종과세표준금액
	 * 
	 * @param lstStaxAm 최종과세표준금액
	 */
	@JsonSetter("lstStaxAm")
	public void setLstStaxAm(BigDecimal lstStaxAm){
		this.lstStaxAm= lstStaxAm;
		this.setIsSet_lstStaxAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_smplPrftRt= false;
	protected final boolean isSet_smplPrftRt(){
		return this.isSet_smplPrftRt;
	}
	private void setIsSet_smplPrftRt(boolean value){
		this.isSet_smplPrftRt= value;
	}
	/**
	 * 단순수익율
	 * BigDecimal - Double value setter
	 *
	 * @Param smplPrftRt 단순수익율
	 */
	public void setSmplPrftRt(double smplPrftRt) {
		setSmplPrftRt(BigDecimal.valueOf(smplPrftRt));
	}
	/**
	 * 단순수익율
	 * BigDecimal - Long value setter
	 *
	 * @Param smplPrftRt 단순수익율
	 */
	public void setSmplPrftRt(long smplPrftRt) {
		setSmplPrftRt(BigDecimal.valueOf(smplPrftRt));
	}
	/**
	 * 단순수익율
	 * BigDecimal - String value setter
	 *
	 * @Param smplPrftRt 단순수익율
	 */
	public void setSmplPrftRt(String smplPrftRt) {
		setSmplPrftRt(new BigDecimal(smplPrftRt));
	}
	/**
	 * 단순수익율
	 */
	@XmlTransient
	public BigDecimal getSmplPrftRt(){
		return this.smplPrftRt;
	}
	
	/**
	 * 단순수익율
	 * 
	 * @param smplPrftRt 단순수익율
	 */
	@JsonSetter("smplPrftRt")
	public void setSmplPrftRt(BigDecimal smplPrftRt){
		this.smplPrftRt= smplPrftRt;
		this.setIsSet_smplPrftRt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_hcanFee= false;
	protected final boolean isSet_hcanFee(){
		return this.isSet_hcanFee;
	}
	private void setIsSet_hcanFee(boolean value){
		this.isSet_hcanFee= value;
	}
	/**
	 * 중도해지수수료
	 * BigDecimal - Double value setter
	 *
	 * @Param hcanFee 중도해지수수료
	 */
	public void setHcanFee(double hcanFee) {
		setHcanFee(BigDecimal.valueOf(hcanFee));
	}
	/**
	 * 중도해지수수료
	 * BigDecimal - Long value setter
	 *
	 * @Param hcanFee 중도해지수수료
	 */
	public void setHcanFee(long hcanFee) {
		setHcanFee(BigDecimal.valueOf(hcanFee));
	}
	/**
	 * 중도해지수수료
	 * BigDecimal - String value setter
	 *
	 * @Param hcanFee 중도해지수수료
	 */
	public void setHcanFee(String hcanFee) {
		setHcanFee(new BigDecimal(hcanFee));
	}
	/**
	 * 중도해지수수료
	 */
	@XmlTransient
	public BigDecimal getHcanFee(){
		return this.hcanFee;
	}
	
	/**
	 * 중도해지수수료
	 * 
	 * @param hcanFee 중도해지수수료
	 */
	@JsonSetter("hcanFee")
	public void setHcanFee(BigDecimal hcanFee){
		this.hcanFee= hcanFee;
		this.setIsSet_hcanFee(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_yrXcPtrt= false;
	protected final boolean isSet_yrXcPtrt(){
		return this.isSet_yrXcPtrt;
	}
	private void setIsSet_yrXcPtrt(boolean value){
		this.isSet_yrXcPtrt= value;
	}
	/**
	 * 연환산수익률
	 * BigDecimal - Double value setter
	 *
	 * @Param yrXcPtrt 연환산수익률
	 */
	public void setYrXcPtrt(double yrXcPtrt) {
		setYrXcPtrt(BigDecimal.valueOf(yrXcPtrt));
	}
	/**
	 * 연환산수익률
	 * BigDecimal - Long value setter
	 *
	 * @Param yrXcPtrt 연환산수익률
	 */
	public void setYrXcPtrt(long yrXcPtrt) {
		setYrXcPtrt(BigDecimal.valueOf(yrXcPtrt));
	}
	/**
	 * 연환산수익률
	 * BigDecimal - String value setter
	 *
	 * @Param yrXcPtrt 연환산수익률
	 */
	public void setYrXcPtrt(String yrXcPtrt) {
		setYrXcPtrt(new BigDecimal(yrXcPtrt));
	}
	/**
	 * 연환산수익률
	 */
	@XmlTransient
	public BigDecimal getYrXcPtrt(){
		return this.yrXcPtrt;
	}
	
	/**
	 * 연환산수익률
	 * 
	 * @param yrXcPtrt 연환산수익률
	 */
	@JsonSetter("yrXcPtrt")
	public void setYrXcPtrt(BigDecimal yrXcPtrt){
		this.yrXcPtrt= yrXcPtrt;
		this.setIsSet_yrXcPtrt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_etcIctx= false;
	protected final boolean isSet_etcIctx(){
		return this.isSet_etcIctx;
	}
	private void setIsSet_etcIctx(boolean value){
		this.isSet_etcIctx= value;
	}
	/**
	 * 기타소득세
	 * BigDecimal - Double value setter
	 *
	 * @Param etcIctx 기타소득세
	 */
	public void setEtcIctx(double etcIctx) {
		setEtcIctx(BigDecimal.valueOf(etcIctx));
	}
	/**
	 * 기타소득세
	 * BigDecimal - Long value setter
	 *
	 * @Param etcIctx 기타소득세
	 */
	public void setEtcIctx(long etcIctx) {
		setEtcIctx(BigDecimal.valueOf(etcIctx));
	}
	/**
	 * 기타소득세
	 * BigDecimal - String value setter
	 *
	 * @Param etcIctx 기타소득세
	 */
	public void setEtcIctx(String etcIctx) {
		setEtcIctx(new BigDecimal(etcIctx));
	}
	/**
	 * 기타소득세
	 */
	@XmlTransient
	public BigDecimal getEtcIctx(){
		return this.etcIctx;
	}
	
	/**
	 * 기타소득세
	 * 
	 * @param etcIctx 기타소득세
	 */
	@JsonSetter("etcIctx")
	public void setEtcIctx(BigDecimal etcIctx){
		this.etcIctx= etcIctx;
		this.setIsSet_etcIctx(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_etcRdtx= false;
	protected final boolean isSet_etcRdtx(){
		return this.isSet_etcRdtx;
	}
	private void setIsSet_etcRdtx(boolean value){
		this.isSet_etcRdtx= value;
	}
	/**
	 * 기타주민세
	 * BigDecimal - Double value setter
	 *
	 * @Param etcRdtx 기타주민세
	 */
	public void setEtcRdtx(double etcRdtx) {
		setEtcRdtx(BigDecimal.valueOf(etcRdtx));
	}
	/**
	 * 기타주민세
	 * BigDecimal - Long value setter
	 *
	 * @Param etcRdtx 기타주민세
	 */
	public void setEtcRdtx(long etcRdtx) {
		setEtcRdtx(BigDecimal.valueOf(etcRdtx));
	}
	/**
	 * 기타주민세
	 * BigDecimal - String value setter
	 *
	 * @Param etcRdtx 기타주민세
	 */
	public void setEtcRdtx(String etcRdtx) {
		setEtcRdtx(new BigDecimal(etcRdtx));
	}
	/**
	 * 기타주민세
	 */
	@XmlTransient
	public BigDecimal getEtcRdtx(){
		return this.etcRdtx;
	}
	
	/**
	 * 기타주민세
	 * 
	 * @param etcRdtx 기타주민세
	 */
	@JsonSetter("etcRdtx")
	public void setEtcRdtx(BigDecimal etcRdtx){
		this.etcRdtx= etcRdtx;
		this.setIsSet_etcRdtx(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pnsnIctx= false;
	protected final boolean isSet_pnsnIctx(){
		return this.isSet_pnsnIctx;
	}
	private void setIsSet_pnsnIctx(boolean value){
		this.isSet_pnsnIctx= value;
	}
	/**
	 * 연금소득세
	 * BigDecimal - Double value setter
	 *
	 * @Param pnsnIctx 연금소득세
	 */
	public void setPnsnIctx(double pnsnIctx) {
		setPnsnIctx(BigDecimal.valueOf(pnsnIctx));
	}
	/**
	 * 연금소득세
	 * BigDecimal - Long value setter
	 *
	 * @Param pnsnIctx 연금소득세
	 */
	public void setPnsnIctx(long pnsnIctx) {
		setPnsnIctx(BigDecimal.valueOf(pnsnIctx));
	}
	/**
	 * 연금소득세
	 * BigDecimal - String value setter
	 *
	 * @Param pnsnIctx 연금소득세
	 */
	public void setPnsnIctx(String pnsnIctx) {
		setPnsnIctx(new BigDecimal(pnsnIctx));
	}
	/**
	 * 연금소득세
	 */
	@XmlTransient
	public BigDecimal getPnsnIctx(){
		return this.pnsnIctx;
	}
	
	/**
	 * 연금소득세
	 * 
	 * @param pnsnIctx 연금소득세
	 */
	@JsonSetter("pnsnIctx")
	public void setPnsnIctx(BigDecimal pnsnIctx){
		this.pnsnIctx= pnsnIctx;
		this.setIsSet_pnsnIctx(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pnsnPvnsIctx= false;
	protected final boolean isSet_pnsnPvnsIctx(){
		return this.isSet_pnsnPvnsIctx;
	}
	private void setIsSet_pnsnPvnsIctx(boolean value){
		this.isSet_pnsnPvnsIctx= value;
	}
	/**
	 * 연금지방소득세
	 * BigDecimal - Double value setter
	 *
	 * @Param pnsnPvnsIctx 연금지방소득세
	 */
	public void setPnsnPvnsIctx(double pnsnPvnsIctx) {
		setPnsnPvnsIctx(BigDecimal.valueOf(pnsnPvnsIctx));
	}
	/**
	 * 연금지방소득세
	 * BigDecimal - Long value setter
	 *
	 * @Param pnsnPvnsIctx 연금지방소득세
	 */
	public void setPnsnPvnsIctx(long pnsnPvnsIctx) {
		setPnsnPvnsIctx(BigDecimal.valueOf(pnsnPvnsIctx));
	}
	/**
	 * 연금지방소득세
	 * BigDecimal - String value setter
	 *
	 * @Param pnsnPvnsIctx 연금지방소득세
	 */
	public void setPnsnPvnsIctx(String pnsnPvnsIctx) {
		setPnsnPvnsIctx(new BigDecimal(pnsnPvnsIctx));
	}
	/**
	 * 연금지방소득세
	 */
	@XmlTransient
	public BigDecimal getPnsnPvnsIctx(){
		return this.pnsnPvnsIctx;
	}
	
	/**
	 * 연금지방소득세
	 * 
	 * @param pnsnPvnsIctx 연금지방소득세
	 */
	@JsonSetter("pnsnPvnsIctx")
	public void setPnsnPvnsIctx(BigDecimal pnsnPvnsIctx){
		this.pnsnPvnsIctx= pnsnPvnsIctx;
		this.setIsSet_pnsnPvnsIctx(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pnsnIcmStaxAm= false;
	protected final boolean isSet_pnsnIcmStaxAm(){
		return this.isSet_pnsnIcmStaxAm;
	}
	private void setIsSet_pnsnIcmStaxAm(boolean value){
		this.isSet_pnsnIcmStaxAm= value;
	}
	/**
	 * 연금소득과세표준금액
	 * BigDecimal - Double value setter
	 *
	 * @Param pnsnIcmStaxAm 연금소득과세표준금액
	 */
	public void setPnsnIcmStaxAm(double pnsnIcmStaxAm) {
		setPnsnIcmStaxAm(BigDecimal.valueOf(pnsnIcmStaxAm));
	}
	/**
	 * 연금소득과세표준금액
	 * BigDecimal - Long value setter
	 *
	 * @Param pnsnIcmStaxAm 연금소득과세표준금액
	 */
	public void setPnsnIcmStaxAm(long pnsnIcmStaxAm) {
		setPnsnIcmStaxAm(BigDecimal.valueOf(pnsnIcmStaxAm));
	}
	/**
	 * 연금소득과세표준금액
	 * BigDecimal - String value setter
	 *
	 * @Param pnsnIcmStaxAm 연금소득과세표준금액
	 */
	public void setPnsnIcmStaxAm(String pnsnIcmStaxAm) {
		setPnsnIcmStaxAm(new BigDecimal(pnsnIcmStaxAm));
	}
	/**
	 * 연금소득과세표준금액
	 */
	@XmlTransient
	public BigDecimal getPnsnIcmStaxAm(){
		return this.pnsnIcmStaxAm;
	}
	
	/**
	 * 연금소득과세표준금액
	 * 
	 * @param pnsnIcmStaxAm 연금소득과세표준금액
	 */
	@JsonSetter("pnsnIcmStaxAm")
	public void setPnsnIcmStaxAm(BigDecimal pnsnIcmStaxAm){
		this.pnsnIcmStaxAm= pnsnIcmStaxAm;
		this.setIsSet_pnsnIcmStaxAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atcnt= false;
	protected final boolean isSet_atcnt(){
		return this.isSet_atcnt;
	}
	private void setIsSet_atcnt(boolean value){
		this.isSet_atcnt= value;
	}
	/**
	 * 좌수
	 * BigDecimal - Double value setter
	 *
	 * @Param atcnt 좌수
	 */
	public void setAtcnt(double atcnt) {
		setAtcnt(BigDecimal.valueOf(atcnt));
	}
	/**
	 * 좌수
	 * BigDecimal - Long value setter
	 *
	 * @Param atcnt 좌수
	 */
	public void setAtcnt(long atcnt) {
		setAtcnt(BigDecimal.valueOf(atcnt));
	}
	/**
	 * 좌수
	 * BigDecimal - String value setter
	 *
	 * @Param atcnt 좌수
	 */
	public void setAtcnt(String atcnt) {
		setAtcnt(new BigDecimal(atcnt));
	}
	/**
	 * 좌수
	 */
	@XmlTransient
	public BigDecimal getAtcnt(){
		return this.atcnt;
	}
	
	/**
	 * 좌수
	 * 
	 * @param atcnt 좌수
	 */
	@JsonSetter("atcnt")
	public void setAtcnt(BigDecimal atcnt){
		this.atcnt= atcnt;
		this.setIsSet_atcnt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ctrmvFee= false;
	protected final boolean isSet_ctrmvFee(){
		return this.isSet_ctrmvFee;
	}
	private void setIsSet_ctrmvFee(boolean value){
		this.isSet_ctrmvFee= value;
	}
	/**
	 * 계약이전수수료
	 * BigDecimal - Double value setter
	 *
	 * @Param ctrmvFee 계약이전수수료
	 */
	public void setCtrmvFee(double ctrmvFee) {
		setCtrmvFee(BigDecimal.valueOf(ctrmvFee));
	}
	/**
	 * 계약이전수수료
	 * BigDecimal - Long value setter
	 *
	 * @Param ctrmvFee 계약이전수수료
	 */
	public void setCtrmvFee(long ctrmvFee) {
		setCtrmvFee(BigDecimal.valueOf(ctrmvFee));
	}
	/**
	 * 계약이전수수료
	 * BigDecimal - String value setter
	 *
	 * @Param ctrmvFee 계약이전수수료
	 */
	public void setCtrmvFee(String ctrmvFee) {
		setCtrmvFee(new BigDecimal(ctrmvFee));
	}
	/**
	 * 계약이전수수료
	 */
	@XmlTransient
	public BigDecimal getCtrmvFee(){
		return this.ctrmvFee;
	}
	
	/**
	 * 계약이전수수료
	 * 
	 * @param ctrmvFee 계약이전수수료
	 */
	@JsonSetter("ctrmvFee")
	public void setCtrmvFee(BigDecimal ctrmvFee){
		this.ctrmvFee= ctrmvFee;
		this.setIsSet_ctrmvFee(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_lnintAm= false;
	protected final boolean isSet_lnintAm(){
		return this.isSet_lnintAm;
	}
	private void setIsSet_lnintAm(boolean value){
		this.isSet_lnintAm= value;
	}
	/**
	 * 대출이자금액
	 * BigDecimal - Double value setter
	 *
	 * @Param lnintAm 대출이자금액
	 */
	public void setLnintAm(double lnintAm) {
		setLnintAm(BigDecimal.valueOf(lnintAm));
	}
	/**
	 * 대출이자금액
	 * BigDecimal - Long value setter
	 *
	 * @Param lnintAm 대출이자금액
	 */
	public void setLnintAm(long lnintAm) {
		setLnintAm(BigDecimal.valueOf(lnintAm));
	}
	/**
	 * 대출이자금액
	 * BigDecimal - String value setter
	 *
	 * @Param lnintAm 대출이자금액
	 */
	public void setLnintAm(String lnintAm) {
		setLnintAm(new BigDecimal(lnintAm));
	}
	/**
	 * 대출이자금액
	 */
	@XmlTransient
	public BigDecimal getLnintAm(){
		return this.lnintAm;
	}
	
	/**
	 * 대출이자금액
	 * 
	 * @param lnintAm 대출이자금액
	 */
	@JsonSetter("lnintAm")
	public void setLnintAm(BigDecimal lnintAm){
		this.lnintAm= lnintAm;
		this.setIsSet_lnintAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_fintAm= false;
	protected final boolean isSet_fintAm(){
		return this.isSet_fintAm;
	}
	private void setIsSet_fintAm(boolean value){
		this.isSet_fintAm= value;
	}
	/**
	 * 연체이자금액
	 * BigDecimal - Double value setter
	 *
	 * @Param fintAm 연체이자금액
	 */
	public void setFintAm(double fintAm) {
		setFintAm(BigDecimal.valueOf(fintAm));
	}
	/**
	 * 연체이자금액
	 * BigDecimal - Long value setter
	 *
	 * @Param fintAm 연체이자금액
	 */
	public void setFintAm(long fintAm) {
		setFintAm(BigDecimal.valueOf(fintAm));
	}
	/**
	 * 연체이자금액
	 * BigDecimal - String value setter
	 *
	 * @Param fintAm 연체이자금액
	 */
	public void setFintAm(String fintAm) {
		setFintAm(new BigDecimal(fintAm));
	}
	/**
	 * 연체이자금액
	 */
	@XmlTransient
	public BigDecimal getFintAm(){
		return this.fintAm;
	}
	
	/**
	 * 연체이자금액
	 * 
	 * @param fintAm 연체이자금액
	 */
	@JsonSetter("fintAm")
	public void setFintAm(BigDecimal fintAm){
		this.fintAm= fintAm;
		this.setIsSet_fintAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_lnPrnDelyRprnm= false;
	protected final boolean isSet_lnPrnDelyRprnm(){
		return this.isSet_lnPrnDelyRprnm;
	}
	private void setIsSet_lnPrnDelyRprnm(boolean value){
		this.isSet_lnPrnDelyRprnm= value;
	}
	/**
	 * 대출원금지연배상금
	 * BigDecimal - Double value setter
	 *
	 * @Param lnPrnDelyRprnm 대출원금지연배상금
	 */
	public void setLnPrnDelyRprnm(double lnPrnDelyRprnm) {
		setLnPrnDelyRprnm(BigDecimal.valueOf(lnPrnDelyRprnm));
	}
	/**
	 * 대출원금지연배상금
	 * BigDecimal - Long value setter
	 *
	 * @Param lnPrnDelyRprnm 대출원금지연배상금
	 */
	public void setLnPrnDelyRprnm(long lnPrnDelyRprnm) {
		setLnPrnDelyRprnm(BigDecimal.valueOf(lnPrnDelyRprnm));
	}
	/**
	 * 대출원금지연배상금
	 * BigDecimal - String value setter
	 *
	 * @Param lnPrnDelyRprnm 대출원금지연배상금
	 */
	public void setLnPrnDelyRprnm(String lnPrnDelyRprnm) {
		setLnPrnDelyRprnm(new BigDecimal(lnPrnDelyRprnm));
	}
	/**
	 * 대출원금지연배상금
	 */
	@XmlTransient
	public BigDecimal getLnPrnDelyRprnm(){
		return this.lnPrnDelyRprnm;
	}
	
	/**
	 * 대출원금지연배상금
	 * 
	 * @param lnPrnDelyRprnm 대출원금지연배상금
	 */
	@JsonSetter("lnPrnDelyRprnm")
	public void setLnPrnDelyRprnm(BigDecimal lnPrnDelyRprnm){
		this.lnPrnDelyRprnm= lnPrnDelyRprnm;
		this.setIsSet_lnPrnDelyRprnm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dpacLnNcitAm= false;
	protected final boolean isSet_dpacLnNcitAm(){
		return this.isSet_dpacLnNcitAm;
	}
	private void setIsSet_dpacLnNcitAm(boolean value){
		this.isSet_dpacLnNcitAm= value;
	}
	/**
	 * 수신계좌대출미수이자금액
	 * BigDecimal - Double value setter
	 *
	 * @Param dpacLnNcitAm 수신계좌대출미수이자금액
	 */
	public void setDpacLnNcitAm(double dpacLnNcitAm) {
		setDpacLnNcitAm(BigDecimal.valueOf(dpacLnNcitAm));
	}
	/**
	 * 수신계좌대출미수이자금액
	 * BigDecimal - Long value setter
	 *
	 * @Param dpacLnNcitAm 수신계좌대출미수이자금액
	 */
	public void setDpacLnNcitAm(long dpacLnNcitAm) {
		setDpacLnNcitAm(BigDecimal.valueOf(dpacLnNcitAm));
	}
	/**
	 * 수신계좌대출미수이자금액
	 * BigDecimal - String value setter
	 *
	 * @Param dpacLnNcitAm 수신계좌대출미수이자금액
	 */
	public void setDpacLnNcitAm(String dpacLnNcitAm) {
		setDpacLnNcitAm(new BigDecimal(dpacLnNcitAm));
	}
	/**
	 * 수신계좌대출미수이자금액
	 */
	@XmlTransient
	public BigDecimal getDpacLnNcitAm(){
		return this.dpacLnNcitAm;
	}
	
	/**
	 * 수신계좌대출미수이자금액
	 * 
	 * @param dpacLnNcitAm 수신계좌대출미수이자금액
	 */
	@JsonSetter("dpacLnNcitAm")
	public void setDpacLnNcitAm(BigDecimal dpacLnNcitAm){
		this.dpacLnNcitAm= dpacLnNcitAm;
		this.setIsSet_dpacLnNcitAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_lnNcitDelyRprnm= false;
	protected final boolean isSet_lnNcitDelyRprnm(){
		return this.isSet_lnNcitDelyRprnm;
	}
	private void setIsSet_lnNcitDelyRprnm(boolean value){
		this.isSet_lnNcitDelyRprnm= value;
	}
	/**
	 * 대출미수이자지연배상금
	 * BigDecimal - Double value setter
	 *
	 * @Param lnNcitDelyRprnm 대출미수이자지연배상금
	 */
	public void setLnNcitDelyRprnm(double lnNcitDelyRprnm) {
		setLnNcitDelyRprnm(BigDecimal.valueOf(lnNcitDelyRprnm));
	}
	/**
	 * 대출미수이자지연배상금
	 * BigDecimal - Long value setter
	 *
	 * @Param lnNcitDelyRprnm 대출미수이자지연배상금
	 */
	public void setLnNcitDelyRprnm(long lnNcitDelyRprnm) {
		setLnNcitDelyRprnm(BigDecimal.valueOf(lnNcitDelyRprnm));
	}
	/**
	 * 대출미수이자지연배상금
	 * BigDecimal - String value setter
	 *
	 * @Param lnNcitDelyRprnm 대출미수이자지연배상금
	 */
	public void setLnNcitDelyRprnm(String lnNcitDelyRprnm) {
		setLnNcitDelyRprnm(new BigDecimal(lnNcitDelyRprnm));
	}
	/**
	 * 대출미수이자지연배상금
	 */
	@XmlTransient
	public BigDecimal getLnNcitDelyRprnm(){
		return this.lnNcitDelyRprnm;
	}
	
	/**
	 * 대출미수이자지연배상금
	 * 
	 * @param lnNcitDelyRprnm 대출미수이자지연배상금
	 */
	@JsonSetter("lnNcitDelyRprnm")
	public void setLnNcitDelyRprnm(BigDecimal lnNcitDelyRprnm){
		this.lnNcitDelyRprnm= lnNcitDelyRprnm;
		this.setIsSet_lnNcitDelyRprnm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_lmtNuseFee= false;
	protected final boolean isSet_lmtNuseFee(){
		return this.isSet_lmtNuseFee;
	}
	private void setIsSet_lmtNuseFee(boolean value){
		this.isSet_lmtNuseFee= value;
	}
	/**
	 * 한도미사용수수료
	 * BigDecimal - Double value setter
	 *
	 * @Param lmtNuseFee 한도미사용수수료
	 */
	public void setLmtNuseFee(double lmtNuseFee) {
		setLmtNuseFee(BigDecimal.valueOf(lmtNuseFee));
	}
	/**
	 * 한도미사용수수료
	 * BigDecimal - Long value setter
	 *
	 * @Param lmtNuseFee 한도미사용수수료
	 */
	public void setLmtNuseFee(long lmtNuseFee) {
		setLmtNuseFee(BigDecimal.valueOf(lmtNuseFee));
	}
	/**
	 * 한도미사용수수료
	 * BigDecimal - String value setter
	 *
	 * @Param lmtNuseFee 한도미사용수수료
	 */
	public void setLmtNuseFee(String lmtNuseFee) {
		setLmtNuseFee(new BigDecimal(lmtNuseFee));
	}
	/**
	 * 한도미사용수수료
	 */
	@XmlTransient
	public BigDecimal getLmtNuseFee(){
		return this.lmtNuseFee;
	}
	
	/**
	 * 한도미사용수수료
	 * 
	 * @param lmtNuseFee 한도미사용수수료
	 */
	@JsonSetter("lmtNuseFee")
	public void setLmtNuseFee(BigDecimal lmtNuseFee){
		this.lmtNuseFee= lmtNuseFee;
		this.setIsSet_lmtNuseFee(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_krxcAm= false;
	protected final boolean isSet_krxcAm(){
		return this.isSet_krxcAm;
	}
	private void setIsSet_krxcAm(boolean value){
		this.isSet_krxcAm= value;
	}
	/**
	 * 원화환산금액
	 * BigDecimal - Double value setter
	 *
	 * @Param krxcAm 원화환산금액
	 */
	public void setKrxcAm(double krxcAm) {
		setKrxcAm(BigDecimal.valueOf(krxcAm));
	}
	/**
	 * 원화환산금액
	 * BigDecimal - Long value setter
	 *
	 * @Param krxcAm 원화환산금액
	 */
	public void setKrxcAm(long krxcAm) {
		setKrxcAm(BigDecimal.valueOf(krxcAm));
	}
	/**
	 * 원화환산금액
	 * BigDecimal - String value setter
	 *
	 * @Param krxcAm 원화환산금액
	 */
	public void setKrxcAm(String krxcAm) {
		setKrxcAm(new BigDecimal(krxcAm));
	}
	/**
	 * 원화환산금액
	 */
	@XmlTransient
	public BigDecimal getKrxcAm(){
		return this.krxcAm;
	}
	
	/**
	 * 원화환산금액
	 * 
	 * @param krxcAm 원화환산금액
	 */
	@JsonSetter("krxcAm")
	public void setKrxcAm(BigDecimal krxcAm){
		this.krxcAm= krxcAm;
		this.setIsSet_krxcAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_krxcCancAm= false;
	protected final boolean isSet_krxcCancAm(){
		return this.isSet_krxcCancAm;
	}
	private void setIsSet_krxcCancAm(boolean value){
		this.isSet_krxcCancAm= value;
	}
	/**
	 * 원화환산해지금액
	 * BigDecimal - Double value setter
	 *
	 * @Param krxcCancAm 원화환산해지금액
	 */
	public void setKrxcCancAm(double krxcCancAm) {
		setKrxcCancAm(BigDecimal.valueOf(krxcCancAm));
	}
	/**
	 * 원화환산해지금액
	 * BigDecimal - Long value setter
	 *
	 * @Param krxcCancAm 원화환산해지금액
	 */
	public void setKrxcCancAm(long krxcCancAm) {
		setKrxcCancAm(BigDecimal.valueOf(krxcCancAm));
	}
	/**
	 * 원화환산해지금액
	 * BigDecimal - String value setter
	 *
	 * @Param krxcCancAm 원화환산해지금액
	 */
	public void setKrxcCancAm(String krxcCancAm) {
		setKrxcCancAm(new BigDecimal(krxcCancAm));
	}
	/**
	 * 원화환산해지금액
	 */
	@XmlTransient
	public BigDecimal getKrxcCancAm(){
		return this.krxcCancAm;
	}
	
	/**
	 * 원화환산해지금액
	 * 
	 * @param krxcCancAm 원화환산해지금액
	 */
	@JsonSetter("krxcCancAm")
	public void setKrxcCancAm(BigDecimal krxcCancAm){
		this.krxcCancAm= krxcCancAm;
		this.setIsSet_krxcCancAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_prftRt= false;
	protected final boolean isSet_prftRt(){
		return this.isSet_prftRt;
	}
	private void setIsSet_prftRt(boolean value){
		this.isSet_prftRt= value;
	}
	/**
	 * 수익율
	 * BigDecimal - Double value setter
	 *
	 * @Param prftRt 수익율
	 */
	public void setPrftRt(double prftRt) {
		setPrftRt(BigDecimal.valueOf(prftRt));
	}
	/**
	 * 수익율
	 * BigDecimal - Long value setter
	 *
	 * @Param prftRt 수익율
	 */
	public void setPrftRt(long prftRt) {
		setPrftRt(BigDecimal.valueOf(prftRt));
	}
	/**
	 * 수익율
	 * BigDecimal - String value setter
	 *
	 * @Param prftRt 수익율
	 */
	public void setPrftRt(String prftRt) {
		setPrftRt(new BigDecimal(prftRt));
	}
	/**
	 * 수익율
	 */
	@XmlTransient
	public BigDecimal getPrftRt(){
		return this.prftRt;
	}
	
	/**
	 * 수익율
	 * 
	 * @param prftRt 수익율
	 */
	@JsonSetter("prftRt")
	public void setPrftRt(BigDecimal prftRt){
		this.prftRt= prftRt;
		this.setIsSet_prftRt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_lstStaxAm2= false;
	protected final boolean isSet_lstStaxAm2(){
		return this.isSet_lstStaxAm2;
	}
	private void setIsSet_lstStaxAm2(boolean value){
		this.isSet_lstStaxAm2= value;
	}
	/**
	 * 최종과세표준금액_2
	 * BigDecimal - Double value setter
	 *
	 * @Param lstStaxAm2 최종과세표준금액_2
	 */
	public void setLstStaxAm2(double lstStaxAm2) {
		setLstStaxAm2(BigDecimal.valueOf(lstStaxAm2));
	}
	/**
	 * 최종과세표준금액_2
	 * BigDecimal - Long value setter
	 *
	 * @Param lstStaxAm2 최종과세표준금액_2
	 */
	public void setLstStaxAm2(long lstStaxAm2) {
		setLstStaxAm2(BigDecimal.valueOf(lstStaxAm2));
	}
	/**
	 * 최종과세표준금액_2
	 * BigDecimal - String value setter
	 *
	 * @Param lstStaxAm2 최종과세표준금액_2
	 */
	public void setLstStaxAm2(String lstStaxAm2) {
		setLstStaxAm2(new BigDecimal(lstStaxAm2));
	}
	/**
	 * 최종과세표준금액_2
	 */
	@XmlTransient
	public BigDecimal getLstStaxAm2(){
		return this.lstStaxAm2;
	}
	
	/**
	 * 최종과세표준금액_2
	 * 
	 * @param lstStaxAm2 최종과세표준금액_2
	 */
	@JsonSetter("lstStaxAm2")
	public void setLstStaxAm2(BigDecimal lstStaxAm2){
		this.lstStaxAm2= lstStaxAm2;
		this.setIsSet_lstStaxAm2(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mvavBuyUp= false;
	protected final boolean isSet_mvavBuyUp(){
		return this.isSet_mvavBuyUp;
	}
	private void setIsSet_mvavBuyUp(boolean value){
		this.isSet_mvavBuyUp= value;
	}
	/**
	 * 이동평균매입단가
	 * BigDecimal - Double value setter
	 *
	 * @Param mvavBuyUp 이동평균매입단가
	 */
	public void setMvavBuyUp(double mvavBuyUp) {
		setMvavBuyUp(BigDecimal.valueOf(mvavBuyUp));
	}
	/**
	 * 이동평균매입단가
	 * BigDecimal - Long value setter
	 *
	 * @Param mvavBuyUp 이동평균매입단가
	 */
	public void setMvavBuyUp(long mvavBuyUp) {
		setMvavBuyUp(BigDecimal.valueOf(mvavBuyUp));
	}
	/**
	 * 이동평균매입단가
	 * BigDecimal - String value setter
	 *
	 * @Param mvavBuyUp 이동평균매입단가
	 */
	public void setMvavBuyUp(String mvavBuyUp) {
		setMvavBuyUp(new BigDecimal(mvavBuyUp));
	}
	/**
	 * 이동평균매입단가
	 */
	@XmlTransient
	public BigDecimal getMvavBuyUp(){
		return this.mvavBuyUp;
	}
	
	/**
	 * 이동평균매입단가
	 * 
	 * @param mvavBuyUp 이동평균매입단가
	 */
	@JsonSetter("mvavBuyUp")
	public void setMvavBuyUp(BigDecimal mvavBuyUp){
		this.mvavBuyUp= mvavBuyUp;
		this.setIsSet_mvavBuyUp(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_tetBuyRt= false;
	protected final boolean isSet_tetBuyRt(){
		return this.isSet_tetBuyRt;
	}
	private void setIsSet_tetBuyRt(boolean value){
		this.isSet_tetBuyRt= value;
	}
	/**
	 * 전신환매입율
	 * BigDecimal - Double value setter
	 *
	 * @Param tetBuyRt 전신환매입율
	 */
	public void setTetBuyRt(double tetBuyRt) {
		setTetBuyRt(BigDecimal.valueOf(tetBuyRt));
	}
	/**
	 * 전신환매입율
	 * BigDecimal - Long value setter
	 *
	 * @Param tetBuyRt 전신환매입율
	 */
	public void setTetBuyRt(long tetBuyRt) {
		setTetBuyRt(BigDecimal.valueOf(tetBuyRt));
	}
	/**
	 * 전신환매입율
	 * BigDecimal - String value setter
	 *
	 * @Param tetBuyRt 전신환매입율
	 */
	public void setTetBuyRt(String tetBuyRt) {
		setTetBuyRt(new BigDecimal(tetBuyRt));
	}
	/**
	 * 전신환매입율
	 */
	@XmlTransient
	public BigDecimal getTetBuyRt(){
		return this.tetBuyRt;
	}
	
	/**
	 * 전신환매입율
	 * 
	 * @param tetBuyRt 전신환매입율
	 */
	@JsonSetter("tetBuyRt")
	public void setTetBuyRt(BigDecimal tetBuyRt){
		this.tetBuyRt= tetBuyRt;
		this.setIsSet_tetBuyRt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_trtFndYn= false;
	protected final boolean isSet_trtFndYn(){
		return this.isSet_trtFndYn;
	}
	private void setIsSet_trtFndYn(boolean value){
		this.isSet_trtFndYn= value;
	}
	/**
	 * 신탁펀드여부
	 */
	@XmlTransient
	public String getTrtFndYn(){
		return this.trtFndYn;
	}
	
	/**
	 * 신탁펀드여부
	 * 
	 * @param trtFndYn 신탁펀드여부
	 */
	public void setTrtFndYn(String trtFndYn){
		this.trtFndYn= trtFndYn;
		this.setIsSet_trtFndYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_fractYn= false;
	protected final boolean isSet_fractYn(){
		return this.isSet_fractYn;
	}
	private void setIsSet_fractYn(boolean value){
		this.isSet_fractYn= value;
	}
	/**
	 * 외화계좌여부
	 */
	@XmlTransient
	public String getFractYn(){
		return this.fractYn;
	}
	
	/**
	 * 외화계좌여부
	 * 
	 * @param fractYn 외화계좌여부
	 */
	public void setFractYn(String fractYn){
		this.fractYn= fractYn;
		this.setIsSet_fractYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_gTrnDscd= false;
	protected final boolean isSet_gTrnDscd(){
		return this.isSet_gTrnDscd;
	}
	private void setIsSet_gTrnDscd(boolean value){
		this.isSet_gTrnDscd= value;
	}
	/**
	 * 골드거래구분코드
	 */
	@XmlTransient
	public String getgTrnDscd(){
		return this.gTrnDscd;
	}
	
	/**
	 * 골드거래구분코드
	 * 
	 * @param gTrnDscd 골드거래구분코드
	 */
	public void setgTrnDscd(String gTrnDscd){
		this.gTrnDscd= gTrnDscd;
		this.setIsSet_gTrnDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_lnYn= false;
	protected final boolean isSet_lnYn(){
		return this.isSet_lnYn;
	}
	private void setIsSet_lnYn(boolean value){
		this.isSet_lnYn= value;
	}
	/**
	 * 대출여부
	 */
	@XmlTransient
	public String getLnYn(){
		return this.lnYn;
	}
	
	/**
	 * 대출여부
	 * 
	 * @param lnYn 대출여부
	 */
	public void setLnYn(String lnYn){
		this.lnYn= lnYn;
		this.setIsSet_lnYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dpsApirt= false;
	protected final boolean isSet_dpsApirt(){
		return this.isSet_dpsApirt;
	}
	private void setIsSet_dpsApirt(boolean value){
		this.isSet_dpsApirt= value;
	}
	/**
	 * 수신적용이율
	 * BigDecimal - Double value setter
	 *
	 * @Param dpsApirt 수신적용이율
	 */
	public void setDpsApirt(double dpsApirt) {
		setDpsApirt(BigDecimal.valueOf(dpsApirt));
	}
	/**
	 * 수신적용이율
	 * BigDecimal - Long value setter
	 *
	 * @Param dpsApirt 수신적용이율
	 */
	public void setDpsApirt(long dpsApirt) {
		setDpsApirt(BigDecimal.valueOf(dpsApirt));
	}
	/**
	 * 수신적용이율
	 * BigDecimal - String value setter
	 *
	 * @Param dpsApirt 수신적용이율
	 */
	public void setDpsApirt(String dpsApirt) {
		setDpsApirt(new BigDecimal(dpsApirt));
	}
	/**
	 * 수신적용이율
	 */
	@XmlTransient
	public BigDecimal getDpsApirt(){
		return this.dpsApirt;
	}
	
	/**
	 * 수신적용이율
	 * 
	 * @param dpsApirt 수신적용이율
	 */
	@JsonSetter("dpsApirt")
	public void setDpsApirt(BigDecimal dpsApirt){
		this.dpsApirt= dpsApirt;
		this.setIsSet_dpsApirt(true);
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
	private boolean isSet_hmnyAcldAm= false;
	protected final boolean isSet_hmnyAcldAm(){
		return this.isSet_hmnyAcldAm;
	}
	private void setIsSet_hmnyAcldAm(boolean value){
		this.isSet_hmnyAcldAm= value;
	}
	/**
	 * 꿀머니적립금액
	 * BigDecimal - Double value setter
	 *
	 * @Param hmnyAcldAm 꿀머니적립금액
	 */
	public void setHmnyAcldAm(double hmnyAcldAm) {
		setHmnyAcldAm(BigDecimal.valueOf(hmnyAcldAm));
	}
	/**
	 * 꿀머니적립금액
	 * BigDecimal - Long value setter
	 *
	 * @Param hmnyAcldAm 꿀머니적립금액
	 */
	public void setHmnyAcldAm(long hmnyAcldAm) {
		setHmnyAcldAm(BigDecimal.valueOf(hmnyAcldAm));
	}
	/**
	 * 꿀머니적립금액
	 * BigDecimal - String value setter
	 *
	 * @Param hmnyAcldAm 꿀머니적립금액
	 */
	public void setHmnyAcldAm(String hmnyAcldAm) {
		setHmnyAcldAm(new BigDecimal(hmnyAcldAm));
	}
	/**
	 * 꿀머니적립금액
	 */
	@XmlTransient
	public BigDecimal getHmnyAcldAm(){
		return this.hmnyAcldAm;
	}
	
	/**
	 * 꿀머니적립금액
	 * 
	 * @param hmnyAcldAm 꿀머니적립금액
	 */
	@JsonSetter("hmnyAcldAm")
	public void setHmnyAcldAm(BigDecimal hmnyAcldAm){
		this.hmnyAcldAm= hmnyAcldAm;
		this.setIsSet_hmnyAcldAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ppayIntAm= false;
	protected final boolean isSet_ppayIntAm(){
		return this.isSet_ppayIntAm;
	}
	private void setIsSet_ppayIntAm(boolean value){
		this.isSet_ppayIntAm= value;
	}
	/**
	 * 선지급이자금액
	 * BigDecimal - Double value setter
	 *
	 * @Param ppayIntAm 선지급이자금액
	 */
	public void setPpayIntAm(double ppayIntAm) {
		setPpayIntAm(BigDecimal.valueOf(ppayIntAm));
	}
	/**
	 * 선지급이자금액
	 * BigDecimal - Long value setter
	 *
	 * @Param ppayIntAm 선지급이자금액
	 */
	public void setPpayIntAm(long ppayIntAm) {
		setPpayIntAm(BigDecimal.valueOf(ppayIntAm));
	}
	/**
	 * 선지급이자금액
	 * BigDecimal - String value setter
	 *
	 * @Param ppayIntAm 선지급이자금액
	 */
	public void setPpayIntAm(String ppayIntAm) {
		setPpayIntAm(new BigDecimal(ppayIntAm));
	}
	/**
	 * 선지급이자금액
	 */
	@XmlTransient
	public BigDecimal getPpayIntAm(){
		return this.ppayIntAm;
	}
	
	/**
	 * 선지급이자금액
	 * 
	 * @param ppayIntAm 선지급이자금액
	 */
	@JsonSetter("ppayIntAm")
	public void setPpayIntAm(BigDecimal ppayIntAm){
		this.ppayIntAm= ppayIntAm;
		this.setIsSet_ppayIntAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_etcTxt= false;
	protected final boolean isSet_etcTxt(){
		return this.isSet_etcTxt;
	}
	private void setIsSet_etcTxt(boolean value){
		this.isSet_etcTxt= value;
	}
	/**
	 * 기타내용
	 */
	@XmlTransient
	public String getEtcTxt(){
		return this.etcTxt;
	}
	
	/**
	 * 기타내용
	 * 
	 * @param etcTxt 기타내용
	 */
	public void setEtcTxt(String etcTxt){
		this.etcTxt= etcTxt;
		this.setIsSet_etcTxt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_inqCucd= false;
	protected final boolean isSet_inqCucd(){
		return this.isSet_inqCucd;
	}
	private void setIsSet_inqCucd(boolean value){
		this.isSet_inqCucd= value;
	}
	/**
	 * 조회통화코드
	 */
	@XmlTransient
	public String getInqCucd(){
		return this.inqCucd;
	}
	
	/**
	 * 조회통화코드
	 * 
	 * @param inqCucd 조회통화코드
	 */
	public void setInqCucd(String inqCucd){
		this.inqCucd= inqCucd;
		this.setIsSet_inqCucd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_slchStaxAm= false;
	protected final boolean isSet_slchStaxAm(){
		return this.isSet_slchStaxAm;
	}
	private void setIsSet_slchStaxAm(boolean value){
		this.isSet_slchStaxAm= value;
	}
	/**
	 * 추징과세표준금액
	 * BigDecimal - Double value setter
	 *
	 * @Param slchStaxAm 추징과세표준금액
	 */
	public void setSlchStaxAm(double slchStaxAm) {
		setSlchStaxAm(BigDecimal.valueOf(slchStaxAm));
	}
	/**
	 * 추징과세표준금액
	 * BigDecimal - Long value setter
	 *
	 * @Param slchStaxAm 추징과세표준금액
	 */
	public void setSlchStaxAm(long slchStaxAm) {
		setSlchStaxAm(BigDecimal.valueOf(slchStaxAm));
	}
	/**
	 * 추징과세표준금액
	 * BigDecimal - String value setter
	 *
	 * @Param slchStaxAm 추징과세표준금액
	 */
	public void setSlchStaxAm(String slchStaxAm) {
		setSlchStaxAm(new BigDecimal(slchStaxAm));
	}
	/**
	 * 추징과세표준금액
	 */
	@XmlTransient
	public BigDecimal getSlchStaxAm(){
		return this.slchStaxAm;
	}
	
	/**
	 * 추징과세표준금액
	 * 
	 * @param slchStaxAm 추징과세표준금액
	 */
	@JsonSetter("slchStaxAm")
	public void setSlchStaxAm(BigDecimal slchStaxAm){
		this.slchStaxAm= slchStaxAm;
		this.setIsSet_slchStaxAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_payBasPr= false;
	protected final boolean isSet_payBasPr(){
		return this.isSet_payBasPr;
	}
	private void setIsSet_payBasPr(boolean value){
		this.isSet_payBasPr= value;
	}
	/**
	 * 지급기준가격
	 * BigDecimal - Double value setter
	 *
	 * @Param payBasPr 지급기준가격
	 */
	public void setPayBasPr(double payBasPr) {
		setPayBasPr(BigDecimal.valueOf(payBasPr));
	}
	/**
	 * 지급기준가격
	 * BigDecimal - Long value setter
	 *
	 * @Param payBasPr 지급기준가격
	 */
	public void setPayBasPr(long payBasPr) {
		setPayBasPr(BigDecimal.valueOf(payBasPr));
	}
	/**
	 * 지급기준가격
	 * BigDecimal - String value setter
	 *
	 * @Param payBasPr 지급기준가격
	 */
	public void setPayBasPr(String payBasPr) {
		setPayBasPr(new BigDecimal(payBasPr));
	}
	/**
	 * 지급기준가격
	 */
	@XmlTransient
	public BigDecimal getPayBasPr(){
		return this.payBasPr;
	}
	
	/**
	 * 지급기준가격
	 * 
	 * @param payBasPr 지급기준가격
	 */
	@JsonSetter("payBasPr")
	public void setPayBasPr(BigDecimal payBasPr){
		this.payBasPr= payBasPr;
		this.setIsSet_payBasPr(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_staxBasPr= false;
	protected final boolean isSet_staxBasPr(){
		return this.isSet_staxBasPr;
	}
	private void setIsSet_staxBasPr(boolean value){
		this.isSet_staxBasPr= value;
	}
	/**
	 * 과세표준기준가격
	 * BigDecimal - Double value setter
	 *
	 * @Param staxBasPr 과세표준기준가격
	 */
	public void setStaxBasPr(double staxBasPr) {
		setStaxBasPr(BigDecimal.valueOf(staxBasPr));
	}
	/**
	 * 과세표준기준가격
	 * BigDecimal - Long value setter
	 *
	 * @Param staxBasPr 과세표준기준가격
	 */
	public void setStaxBasPr(long staxBasPr) {
		setStaxBasPr(BigDecimal.valueOf(staxBasPr));
	}
	/**
	 * 과세표준기준가격
	 * BigDecimal - String value setter
	 *
	 * @Param staxBasPr 과세표준기준가격
	 */
	public void setStaxBasPr(String staxBasPr) {
		setStaxBasPr(new BigDecimal(staxBasPr));
	}
	/**
	 * 과세표준기준가격
	 */
	@XmlTransient
	public BigDecimal getStaxBasPr(){
		return this.staxBasPr;
	}
	
	/**
	 * 과세표준기준가격
	 * 
	 * @param staxBasPr 과세표준기준가격
	 */
	@JsonSetter("staxBasPr")
	public void setStaxBasPr(BigDecimal staxBasPr){
		this.staxBasPr= staxBasPr;
		this.setIsSet_staxBasPr(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_krwXchInciAm= false;
	protected final boolean isSet_krwXchInciAm(){
		return this.isSet_krwXchInciAm;
	}
	private void setIsSet_krwXchInciAm(boolean value){
		this.isSet_krwXchInciAm= value;
	}
	/**
	 * 원화환산입금액
	 * BigDecimal - Double value setter
	 *
	 * @Param krwXchInciAm 원화환산입금액
	 */
	public void setKrwXchInciAm(double krwXchInciAm) {
		setKrwXchInciAm(BigDecimal.valueOf(krwXchInciAm));
	}
	/**
	 * 원화환산입금액
	 * BigDecimal - Long value setter
	 *
	 * @Param krwXchInciAm 원화환산입금액
	 */
	public void setKrwXchInciAm(long krwXchInciAm) {
		setKrwXchInciAm(BigDecimal.valueOf(krwXchInciAm));
	}
	/**
	 * 원화환산입금액
	 * BigDecimal - String value setter
	 *
	 * @Param krwXchInciAm 원화환산입금액
	 */
	public void setKrwXchInciAm(String krwXchInciAm) {
		setKrwXchInciAm(new BigDecimal(krwXchInciAm));
	}
	/**
	 * 원화환산입금액
	 */
	@XmlTransient
	public BigDecimal getKrwXchInciAm(){
		return this.krwXchInciAm;
	}
	
	/**
	 * 원화환산입금액
	 * 
	 * @param krwXchInciAm 원화환산입금액
	 */
	@JsonSetter("krwXchInciAm")
	public void setKrwXchInciAm(BigDecimal krwXchInciAm){
		this.krwXchInciAm= krwXchInciAm;
		this.setIsSet_krwXchInciAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_krxcWthdAm= false;
	protected final boolean isSet_krxcWthdAm(){
		return this.isSet_krxcWthdAm;
	}
	private void setIsSet_krxcWthdAm(boolean value){
		this.isSet_krxcWthdAm= value;
	}
	/**
	 * 원화환산인출금액
	 * BigDecimal - Double value setter
	 *
	 * @Param krxcWthdAm 원화환산인출금액
	 */
	public void setKrxcWthdAm(double krxcWthdAm) {
		setKrxcWthdAm(BigDecimal.valueOf(krxcWthdAm));
	}
	/**
	 * 원화환산인출금액
	 * BigDecimal - Long value setter
	 *
	 * @Param krxcWthdAm 원화환산인출금액
	 */
	public void setKrxcWthdAm(long krxcWthdAm) {
		setKrxcWthdAm(BigDecimal.valueOf(krxcWthdAm));
	}
	/**
	 * 원화환산인출금액
	 * BigDecimal - String value setter
	 *
	 * @Param krxcWthdAm 원화환산인출금액
	 */
	public void setKrxcWthdAm(String krxcWthdAm) {
		setKrxcWthdAm(new BigDecimal(krxcWthdAm));
	}
	/**
	 * 원화환산인출금액
	 */
	@XmlTransient
	public BigDecimal getKrxcWthdAm(){
		return this.krxcWthdAm;
	}
	
	/**
	 * 원화환산인출금액
	 * 
	 * @param krxcWthdAm 원화환산인출금액
	 */
	@JsonSetter("krxcWthdAm")
	public void setKrxcWthdAm(BigDecimal krxcWthdAm){
		this.krxcWthdAm= krxcWthdAm;
		this.setIsSet_krxcWthdAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_plAm= false;
	protected final boolean isSet_plAm(){
		return this.isSet_plAm;
	}
	private void setIsSet_plAm(boolean value){
		this.isSet_plAm= value;
	}
	/**
	 * 손익금액
	 * BigDecimal - Double value setter
	 *
	 * @Param plAm 손익금액
	 */
	public void setPlAm(double plAm) {
		setPlAm(BigDecimal.valueOf(plAm));
	}
	/**
	 * 손익금액
	 * BigDecimal - Long value setter
	 *
	 * @Param plAm 손익금액
	 */
	public void setPlAm(long plAm) {
		setPlAm(BigDecimal.valueOf(plAm));
	}
	/**
	 * 손익금액
	 * BigDecimal - String value setter
	 *
	 * @Param plAm 손익금액
	 */
	public void setPlAm(String plAm) {
		setPlAm(new BigDecimal(plAm));
	}
	/**
	 * 손익금액
	 */
	@XmlTransient
	public BigDecimal getPlAm(){
		return this.plAm;
	}
	
	/**
	 * 손익금액
	 * 
	 * @param plAm 손익금액
	 */
	@JsonSetter("plAm")
	public void setPlAm(BigDecimal plAm){
		this.plAm= plAm;
		this.setIsSet_plAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cusPrftRt= false;
	protected final boolean isSet_cusPrftRt(){
		return this.isSet_cusPrftRt;
	}
	private void setIsSet_cusPrftRt(boolean value){
		this.isSet_cusPrftRt= value;
	}
	/**
	 * 고객수익율
	 * BigDecimal - Double value setter
	 *
	 * @Param cusPrftRt 고객수익율
	 */
	public void setCusPrftRt(double cusPrftRt) {
		setCusPrftRt(BigDecimal.valueOf(cusPrftRt));
	}
	/**
	 * 고객수익율
	 * BigDecimal - Long value setter
	 *
	 * @Param cusPrftRt 고객수익율
	 */
	public void setCusPrftRt(long cusPrftRt) {
		setCusPrftRt(BigDecimal.valueOf(cusPrftRt));
	}
	/**
	 * 고객수익율
	 * BigDecimal - String value setter
	 *
	 * @Param cusPrftRt 고객수익율
	 */
	public void setCusPrftRt(String cusPrftRt) {
		setCusPrftRt(new BigDecimal(cusPrftRt));
	}
	/**
	 * 고객수익율
	 */
	@XmlTransient
	public BigDecimal getCusPrftRt(){
		return this.cusPrftRt;
	}
	
	/**
	 * 고객수익율
	 * 
	 * @param cusPrftRt 고객수익율
	 */
	@JsonSetter("cusPrftRt")
	public void setCusPrftRt(BigDecimal cusPrftRt){
		this.cusPrftRt= cusPrftRt;
		this.setIsSet_cusPrftRt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_potWthdAm= false;
	protected final boolean isSet_potWthdAm(){
		return this.isSet_potWthdAm;
	}
	private void setIsSet_potWthdAm(boolean value){
		this.isSet_potWthdAm= value;
	}
	/**
	 * 일부인출금액
	 * BigDecimal - Double value setter
	 *
	 * @Param potWthdAm 일부인출금액
	 */
	public void setPotWthdAm(double potWthdAm) {
		setPotWthdAm(BigDecimal.valueOf(potWthdAm));
	}
	/**
	 * 일부인출금액
	 * BigDecimal - Long value setter
	 *
	 * @Param potWthdAm 일부인출금액
	 */
	public void setPotWthdAm(long potWthdAm) {
		setPotWthdAm(BigDecimal.valueOf(potWthdAm));
	}
	/**
	 * 일부인출금액
	 * BigDecimal - String value setter
	 *
	 * @Param potWthdAm 일부인출금액
	 */
	public void setPotWthdAm(String potWthdAm) {
		setPotWthdAm(new BigDecimal(potWthdAm));
	}
	/**
	 * 일부인출금액
	 */
	@XmlTransient
	public BigDecimal getPotWthdAm(){
		return this.potWthdAm;
	}
	
	/**
	 * 일부인출금액
	 * 
	 * @param potWthdAm 일부인출금액
	 */
	@JsonSetter("potWthdAm")
	public void setPotWthdAm(BigDecimal potWthdAm){
		this.potWthdAm= potWthdAm;
		this.setIsSet_potWthdAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_avgXrtIntAm= false;
	protected final boolean isSet_avgXrtIntAm(){
		return this.isSet_avgXrtIntAm;
	}
	private void setIsSet_avgXrtIntAm(boolean value){
		this.isSet_avgXrtIntAm= value;
	}
	/**
	 * 평균환율이자금액
	 * BigDecimal - Double value setter
	 *
	 * @Param avgXrtIntAm 평균환율이자금액
	 */
	public void setAvgXrtIntAm(double avgXrtIntAm) {
		setAvgXrtIntAm(BigDecimal.valueOf(avgXrtIntAm));
	}
	/**
	 * 평균환율이자금액
	 * BigDecimal - Long value setter
	 *
	 * @Param avgXrtIntAm 평균환율이자금액
	 */
	public void setAvgXrtIntAm(long avgXrtIntAm) {
		setAvgXrtIntAm(BigDecimal.valueOf(avgXrtIntAm));
	}
	/**
	 * 평균환율이자금액
	 * BigDecimal - String value setter
	 *
	 * @Param avgXrtIntAm 평균환율이자금액
	 */
	public void setAvgXrtIntAm(String avgXrtIntAm) {
		setAvgXrtIntAm(new BigDecimal(avgXrtIntAm));
	}
	/**
	 * 평균환율이자금액
	 */
	@XmlTransient
	public BigDecimal getAvgXrtIntAm(){
		return this.avgXrtIntAm;
	}
	
	/**
	 * 평균환율이자금액
	 * 
	 * @param avgXrtIntAm 평균환율이자금액
	 */
	@JsonSetter("avgXrtIntAm")
	public void setAvgXrtIntAm(BigDecimal avgXrtIntAm){
		this.avgXrtIntAm= avgXrtIntAm;
		this.setIsSet_avgXrtIntAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cusAplSellXrt= false;
	protected final boolean isSet_cusAplSellXrt(){
		return this.isSet_cusAplSellXrt;
	}
	private void setIsSet_cusAplSellXrt(boolean value){
		this.isSet_cusAplSellXrt= value;
	}
	/**
	 * 고객적용매도환율
	 * BigDecimal - Double value setter
	 *
	 * @Param cusAplSellXrt 고객적용매도환율
	 */
	public void setCusAplSellXrt(double cusAplSellXrt) {
		setCusAplSellXrt(BigDecimal.valueOf(cusAplSellXrt));
	}
	/**
	 * 고객적용매도환율
	 * BigDecimal - Long value setter
	 *
	 * @Param cusAplSellXrt 고객적용매도환율
	 */
	public void setCusAplSellXrt(long cusAplSellXrt) {
		setCusAplSellXrt(BigDecimal.valueOf(cusAplSellXrt));
	}
	/**
	 * 고객적용매도환율
	 * BigDecimal - String value setter
	 *
	 * @Param cusAplSellXrt 고객적용매도환율
	 */
	public void setCusAplSellXrt(String cusAplSellXrt) {
		setCusAplSellXrt(new BigDecimal(cusAplSellXrt));
	}
	/**
	 * 고객적용매도환율
	 */
	@XmlTransient
	public BigDecimal getCusAplSellXrt(){
		return this.cusAplSellXrt;
	}
	
	/**
	 * 고객적용매도환율
	 * 
	 * @param cusAplSellXrt 고객적용매도환율
	 */
	@JsonSetter("cusAplSellXrt")
	public void setCusAplSellXrt(BigDecimal cusAplSellXrt){
		this.cusAplSellXrt= cusAplSellXrt;
		this.setIsSet_cusAplSellXrt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ddctAm= false;
	protected final boolean isSet_ddctAm(){
		return this.isSet_ddctAm;
	}
	private void setIsSet_ddctAm(boolean value){
		this.isSet_ddctAm= value;
	}
	/**
	 * 공제금액
	 * BigDecimal - Double value setter
	 *
	 * @Param ddctAm 공제금액
	 */
	public void setDdctAm(double ddctAm) {
		setDdctAm(BigDecimal.valueOf(ddctAm));
	}
	/**
	 * 공제금액
	 * BigDecimal - Long value setter
	 *
	 * @Param ddctAm 공제금액
	 */
	public void setDdctAm(long ddctAm) {
		setDdctAm(BigDecimal.valueOf(ddctAm));
	}
	/**
	 * 공제금액
	 * BigDecimal - String value setter
	 *
	 * @Param ddctAm 공제금액
	 */
	public void setDdctAm(String ddctAm) {
		setDdctAm(new BigDecimal(ddctAm));
	}
	/**
	 * 공제금액
	 */
	@XmlTransient
	public BigDecimal getDdctAm(){
		return this.ddctAm;
	}
	
	/**
	 * 공제금액
	 * 
	 * @param ddctAm 공제금액
	 */
	@JsonSetter("ddctAm")
	public void setDdctAm(BigDecimal ddctAm){
		this.ddctAm= ddctAm;
		this.setIsSet_ddctAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_wthdAmSumAm= false;
	protected final boolean isSet_wthdAmSumAm(){
		return this.isSet_wthdAmSumAm;
	}
	private void setIsSet_wthdAmSumAm(boolean value){
		this.isSet_wthdAmSumAm= value;
	}
	/**
	 * 인출금액합계금액
	 * BigDecimal - Double value setter
	 *
	 * @Param wthdAmSumAm 인출금액합계금액
	 */
	public void setWthdAmSumAm(double wthdAmSumAm) {
		setWthdAmSumAm(BigDecimal.valueOf(wthdAmSumAm));
	}
	/**
	 * 인출금액합계금액
	 * BigDecimal - Long value setter
	 *
	 * @Param wthdAmSumAm 인출금액합계금액
	 */
	public void setWthdAmSumAm(long wthdAmSumAm) {
		setWthdAmSumAm(BigDecimal.valueOf(wthdAmSumAm));
	}
	/**
	 * 인출금액합계금액
	 * BigDecimal - String value setter
	 *
	 * @Param wthdAmSumAm 인출금액합계금액
	 */
	public void setWthdAmSumAm(String wthdAmSumAm) {
		setWthdAmSumAm(new BigDecimal(wthdAmSumAm));
	}
	/**
	 * 인출금액합계금액
	 */
	@XmlTransient
	public BigDecimal getWthdAmSumAm(){
		return this.wthdAmSumAm;
	}
	
	/**
	 * 인출금액합계금액
	 * 
	 * @param wthdAmSumAm 인출금액합계금액
	 */
	@JsonSetter("wthdAmSumAm")
	public void setWthdAmSumAm(BigDecimal wthdAmSumAm){
		this.wthdAmSumAm= wthdAmSumAm;
		this.setIsSet_wthdAmSumAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_bfdnAcmPrftRt= false;
	protected final boolean isSet_bfdnAcmPrftRt(){
		return this.isSet_bfdnAcmPrftRt;
	}
	private void setIsSet_bfdnAcmPrftRt(boolean value){
		this.isSet_bfdnAcmPrftRt= value;
	}
	/**
	 * 차감전누적수익율
	 * BigDecimal - Double value setter
	 *
	 * @Param bfdnAcmPrftRt 차감전누적수익율
	 */
	public void setBfdnAcmPrftRt(double bfdnAcmPrftRt) {
		setBfdnAcmPrftRt(BigDecimal.valueOf(bfdnAcmPrftRt));
	}
	/**
	 * 차감전누적수익율
	 * BigDecimal - Long value setter
	 *
	 * @Param bfdnAcmPrftRt 차감전누적수익율
	 */
	public void setBfdnAcmPrftRt(long bfdnAcmPrftRt) {
		setBfdnAcmPrftRt(BigDecimal.valueOf(bfdnAcmPrftRt));
	}
	/**
	 * 차감전누적수익율
	 * BigDecimal - String value setter
	 *
	 * @Param bfdnAcmPrftRt 차감전누적수익율
	 */
	public void setBfdnAcmPrftRt(String bfdnAcmPrftRt) {
		setBfdnAcmPrftRt(new BigDecimal(bfdnAcmPrftRt));
	}
	/**
	 * 차감전누적수익율
	 */
	@XmlTransient
	public BigDecimal getBfdnAcmPrftRt(){
		return this.bfdnAcmPrftRt;
	}
	
	/**
	 * 차감전누적수익율
	 * 
	 * @param bfdnAcmPrftRt 차감전누적수익율
	 */
	@JsonSetter("bfdnAcmPrftRt")
	public void setBfdnAcmPrftRt(BigDecimal bfdnAcmPrftRt){
		this.bfdnAcmPrftRt= bfdnAcmPrftRt;
		this.setIsSet_bfdnAcmPrftRt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_afdnAcmPrftRt= false;
	protected final boolean isSet_afdnAcmPrftRt(){
		return this.isSet_afdnAcmPrftRt;
	}
	private void setIsSet_afdnAcmPrftRt(boolean value){
		this.isSet_afdnAcmPrftRt= value;
	}
	/**
	 * 차감후누적수익율
	 * BigDecimal - Double value setter
	 *
	 * @Param afdnAcmPrftRt 차감후누적수익율
	 */
	public void setAfdnAcmPrftRt(double afdnAcmPrftRt) {
		setAfdnAcmPrftRt(BigDecimal.valueOf(afdnAcmPrftRt));
	}
	/**
	 * 차감후누적수익율
	 * BigDecimal - Long value setter
	 *
	 * @Param afdnAcmPrftRt 차감후누적수익율
	 */
	public void setAfdnAcmPrftRt(long afdnAcmPrftRt) {
		setAfdnAcmPrftRt(BigDecimal.valueOf(afdnAcmPrftRt));
	}
	/**
	 * 차감후누적수익율
	 * BigDecimal - String value setter
	 *
	 * @Param afdnAcmPrftRt 차감후누적수익율
	 */
	public void setAfdnAcmPrftRt(String afdnAcmPrftRt) {
		setAfdnAcmPrftRt(new BigDecimal(afdnAcmPrftRt));
	}
	/**
	 * 차감후누적수익율
	 */
	@XmlTransient
	public BigDecimal getAfdnAcmPrftRt(){
		return this.afdnAcmPrftRt;
	}
	
	/**
	 * 차감후누적수익율
	 * 
	 * @param afdnAcmPrftRt 차감후누적수익율
	 */
	@JsonSetter("afdnAcmPrftRt")
	public void setAfdnAcmPrftRt(BigDecimal afdnAcmPrftRt){
		this.afdnAcmPrftRt= afdnAcmPrftRt;
		this.setIsSet_afdnAcmPrftRt(true);
	}
				
	@Override
	public MNPMnyPinFncTrnSelectMnpTxIntInf_DODT clone(){
		try{
			MNPMnyPinFncTrnSelectMnpTxIntInf_DODT object= (MNPMnyPinFncTrnSelectMnpTxIntInf_DODT)super.clone();
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
		
		result= prime * result + ((this.tmntFrcsDt==null)?0:this.tmntFrcsDt.hashCode());
		result= prime * result + ((this.newDt==null)?0:this.newDt.hashCode());
		result= prime * result + ((this.xprDt==null)?0:this.xprDt.hashCode());
		result= prime * result + ((this.cancDisNm==null)?0:this.cancDisNm.hashCode());
		result= prime * result + ((this.prnAm==null)?0:this.prnAm.hashCode());
		result= prime * result + ((this.totIntAm==null)?0:this.totIntAm.hashCode());
		result= prime * result + ((this.bscIntAm==null)?0:this.bscIntAm.hashCode());
		result= prime * result + ((this.spclIntAm==null)?0:this.spclIntAm.hashCode());
		result= prime * result + ((this.afepIntAm==null)?0:this.afepIntAm.hashCode());
		result= prime * result + ((this.rstrIctx==null)?0:this.rstrIctx.hashCode());
		result= prime * result + ((this.rstrRdtx==null)?0:this.rstrRdtx.hashCode());
		result= prime * result + ((this.rstrSrtx==null)?0:this.rstrSrtx.hashCode());
		result= prime * result + ((this.impAttxSumAm==null)?0:this.impAttxSumAm.hashCode());
		result= prime * result + ((this.intIctx==null)?0:this.intIctx.hashCode());
		result= prime * result + ((this.intIcmRdtx==null)?0:this.intIcmRdtx.hashCode());
		result= prime * result + ((this.intIcmSrtx==null)?0:this.intIcmSrtx.hashCode());
		result= prime * result + ((this.cnrnAm==null)?0:this.cnrnAm.hashCode());
		result= prime * result + ((this.rrint==null)?0:this.rrint.hashCode());
		result= prime * result + ((this.ddctSumAm==null)?0:this.ddctSumAm.hashCode());
		result= prime * result + ((this.dduPayAm==null)?0:this.dduPayAm.hashCode());
		result= prime * result + ((this.ectx==null)?0:this.ectx.hashCode());
		result= prime * result + ((this.dftx==null)?0:this.dftx.hashCode());
		result= prime * result + ((this.rvsnAm==null)?0:this.rvsnAm.hashCode());
		result= prime * result + ((this.slchIntx==null)?0:this.slchIntx.hashCode());
		result= prime * result + ((this.slchPvnsIctx==null)?0:this.slchPvnsIctx.hashCode());
		result= prime * result + ((this.paySumAm==null)?0:this.paySumAm.hashCode());
		result= prime * result + ((this.fcIntAm==null)?0:this.fcIntAm.hashCode());
		result= prime * result + ((this.fcRstrAttxAm==null)?0:this.fcRstrAttxAm.hashCode());
		result= prime * result + ((this.fcRrintAm==null)?0:this.fcRrintAm.hashCode());
		result= prime * result + ((this.fcImpAttxAm==null)?0:this.fcImpAttxAm.hashCode());
		result= prime * result + ((this.pstmRticmStaxAm==null)?0:this.pstmRticmStaxAm.hashCode());
		result= prime * result + ((this.pstmPnsnIctx==null)?0:this.pstmPnsnIctx.hashCode());
		result= prime * result + ((this.pstmRticmUsgAm==null)?0:this.pstmRticmUsgAm.hashCode());
		result= prime * result + ((this.pstmPnsnRdtx==null)?0:this.pstmPnsnRdtx.hashCode());
		result= prime * result + ((this.pstmRticmTax==null)?0:this.pstmRticmTax.hashCode());
		result= prime * result + ((this.pstmRtrtRdtx==null)?0:this.pstmRtrtRdtx.hashCode());
		result= prime * result + ((this.rtnPocpFee==null)?0:this.rtnPocpFee.hashCode());
		result= prime * result + ((this.etcIcmStaxAm==null)?0:this.etcIcmStaxAm.hashCode());
		result= prime * result + ((this.staxHovMnuAdj==null)?0:this.staxHovMnuAdj.hashCode());
		result= prime * result + ((this.feeStaxDdu==null)?0:this.feeStaxDdu.hashCode());
		result= prime * result + ((this.usumEvlAm==null)?0:this.usumEvlAm.hashCode());
		result= prime * result + ((this.moAcno==null)?0:this.moAcno.hashCode());
		result= prime * result + ((this.frgStcLossOfst==null)?0:this.frgStcLossOfst.hashCode());
		result= prime * result + ((this.staxDduTcmPfeAm==null)?0:this.staxDduTcmPfeAm.hashCode());
		result= prime * result + ((this.lstStaxAm==null)?0:this.lstStaxAm.hashCode());
		result= prime * result + ((this.smplPrftRt==null)?0:this.smplPrftRt.hashCode());
		result= prime * result + ((this.hcanFee==null)?0:this.hcanFee.hashCode());
		result= prime * result + ((this.yrXcPtrt==null)?0:this.yrXcPtrt.hashCode());
		result= prime * result + ((this.etcIctx==null)?0:this.etcIctx.hashCode());
		result= prime * result + ((this.etcRdtx==null)?0:this.etcRdtx.hashCode());
		result= prime * result + ((this.pnsnIctx==null)?0:this.pnsnIctx.hashCode());
		result= prime * result + ((this.pnsnPvnsIctx==null)?0:this.pnsnPvnsIctx.hashCode());
		result= prime * result + ((this.pnsnIcmStaxAm==null)?0:this.pnsnIcmStaxAm.hashCode());
		result= prime * result + ((this.atcnt==null)?0:this.atcnt.hashCode());
		result= prime * result + ((this.ctrmvFee==null)?0:this.ctrmvFee.hashCode());
		result= prime * result + ((this.lnintAm==null)?0:this.lnintAm.hashCode());
		result= prime * result + ((this.fintAm==null)?0:this.fintAm.hashCode());
		result= prime * result + ((this.lnPrnDelyRprnm==null)?0:this.lnPrnDelyRprnm.hashCode());
		result= prime * result + ((this.dpacLnNcitAm==null)?0:this.dpacLnNcitAm.hashCode());
		result= prime * result + ((this.lnNcitDelyRprnm==null)?0:this.lnNcitDelyRprnm.hashCode());
		result= prime * result + ((this.lmtNuseFee==null)?0:this.lmtNuseFee.hashCode());
		result= prime * result + ((this.krxcAm==null)?0:this.krxcAm.hashCode());
		result= prime * result + ((this.krxcCancAm==null)?0:this.krxcCancAm.hashCode());
		result= prime * result + ((this.prftRt==null)?0:this.prftRt.hashCode());
		result= prime * result + ((this.lstStaxAm2==null)?0:this.lstStaxAm2.hashCode());
		result= prime * result + ((this.mvavBuyUp==null)?0:this.mvavBuyUp.hashCode());
		result= prime * result + ((this.tetBuyRt==null)?0:this.tetBuyRt.hashCode());
		result= prime * result + ((this.trtFndYn==null)?0:this.trtFndYn.hashCode());
		result= prime * result + ((this.fractYn==null)?0:this.fractYn.hashCode());
		result= prime * result + ((this.gTrnDscd==null)?0:this.gTrnDscd.hashCode());
		result= prime * result + ((this.lnYn==null)?0:this.lnYn.hashCode());
		result= prime * result + ((this.dpsApirt==null)?0:this.dpsApirt.hashCode());
		result= prime * result + ((this.dntnAm==null)?0:this.dntnAm.hashCode());
		result= prime * result + ((this.hmnyAcldAm==null)?0:this.hmnyAcldAm.hashCode());
		result= prime * result + ((this.ppayIntAm==null)?0:this.ppayIntAm.hashCode());
		result= prime * result + ((this.etcTxt==null)?0:this.etcTxt.hashCode());
		result= prime * result + ((this.inqCucd==null)?0:this.inqCucd.hashCode());
		result= prime * result + ((this.slchStaxAm==null)?0:this.slchStaxAm.hashCode());
		result= prime * result + ((this.payBasPr==null)?0:this.payBasPr.hashCode());
		result= prime * result + ((this.staxBasPr==null)?0:this.staxBasPr.hashCode());
		result= prime * result + ((this.krwXchInciAm==null)?0:this.krwXchInciAm.hashCode());
		result= prime * result + ((this.krxcWthdAm==null)?0:this.krxcWthdAm.hashCode());
		result= prime * result + ((this.plAm==null)?0:this.plAm.hashCode());
		result= prime * result + ((this.cusPrftRt==null)?0:this.cusPrftRt.hashCode());
		result= prime * result + ((this.potWthdAm==null)?0:this.potWthdAm.hashCode());
		result= prime * result + ((this.avgXrtIntAm==null)?0:this.avgXrtIntAm.hashCode());
		result= prime * result + ((this.cusAplSellXrt==null)?0:this.cusAplSellXrt.hashCode());
		result= prime * result + ((this.ddctAm==null)?0:this.ddctAm.hashCode());
		result= prime * result + ((this.wthdAmSumAm==null)?0:this.wthdAmSumAm.hashCode());
		result= prime * result + ((this.bfdnAcmPrftRt==null)?0:this.bfdnAcmPrftRt.hashCode());
		result= prime * result + ((this.afdnAcmPrftRt==null)?0:this.afdnAcmPrftRt.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MNPMnyPinFncTrnSelectMnpTxIntInf_DODT other= (MNPMnyPinFncTrnSelectMnpTxIntInf_DODT)obj;
		{
			Object _tmntFrcsDt= getTmntFrcsDt();
			Object __tmntFrcsDt= other.getTmntFrcsDt();
			if ( _tmntFrcsDt== null ) { if ( __tmntFrcsDt!= null ) return false; }
			else if ( !_tmntFrcsDt.equals(__tmntFrcsDt) ) return false;
		}
		{
			Object _newDt= getNewDt();
			Object __newDt= other.getNewDt();
			if ( _newDt== null ) { if ( __newDt!= null ) return false; }
			else if ( !_newDt.equals(__newDt) ) return false;
		}
		{
			Object _xprDt= getXprDt();
			Object __xprDt= other.getXprDt();
			if ( _xprDt== null ) { if ( __xprDt!= null ) return false; }
			else if ( !_xprDt.equals(__xprDt) ) return false;
		}
		{
			Object _cancDisNm= getCancDisNm();
			Object __cancDisNm= other.getCancDisNm();
			if ( _cancDisNm== null ) { if ( __cancDisNm!= null ) return false; }
			else if ( !_cancDisNm.equals(__cancDisNm) ) return false;
		}
		{
			Object _prnAm= getPrnAm();
			Object __prnAm= other.getPrnAm();
			if ( _prnAm== null ) { if ( __prnAm!= null ) return false; }
			else if ( !_prnAm.equals(__prnAm) ) return false;
		}
		{
			Object _totIntAm= getTotIntAm();
			Object __totIntAm= other.getTotIntAm();
			if ( _totIntAm== null ) { if ( __totIntAm!= null ) return false; }
			else if ( !_totIntAm.equals(__totIntAm) ) return false;
		}
		{
			Object _bscIntAm= getBscIntAm();
			Object __bscIntAm= other.getBscIntAm();
			if ( _bscIntAm== null ) { if ( __bscIntAm!= null ) return false; }
			else if ( !_bscIntAm.equals(__bscIntAm) ) return false;
		}
		{
			Object _spclIntAm= getSpclIntAm();
			Object __spclIntAm= other.getSpclIntAm();
			if ( _spclIntAm== null ) { if ( __spclIntAm!= null ) return false; }
			else if ( !_spclIntAm.equals(__spclIntAm) ) return false;
		}
		{
			Object _afepIntAm= getAfepIntAm();
			Object __afepIntAm= other.getAfepIntAm();
			if ( _afepIntAm== null ) { if ( __afepIntAm!= null ) return false; }
			else if ( !_afepIntAm.equals(__afepIntAm) ) return false;
		}
		{
			Object _rstrIctx= getRstrIctx();
			Object __rstrIctx= other.getRstrIctx();
			if ( _rstrIctx== null ) { if ( __rstrIctx!= null ) return false; }
			else if ( !_rstrIctx.equals(__rstrIctx) ) return false;
		}
		{
			Object _rstrRdtx= getRstrRdtx();
			Object __rstrRdtx= other.getRstrRdtx();
			if ( _rstrRdtx== null ) { if ( __rstrRdtx!= null ) return false; }
			else if ( !_rstrRdtx.equals(__rstrRdtx) ) return false;
		}
		{
			Object _rstrSrtx= getRstrSrtx();
			Object __rstrSrtx= other.getRstrSrtx();
			if ( _rstrSrtx== null ) { if ( __rstrSrtx!= null ) return false; }
			else if ( !_rstrSrtx.equals(__rstrSrtx) ) return false;
		}
		{
			Object _impAttxSumAm= getImpAttxSumAm();
			Object __impAttxSumAm= other.getImpAttxSumAm();
			if ( _impAttxSumAm== null ) { if ( __impAttxSumAm!= null ) return false; }
			else if ( !_impAttxSumAm.equals(__impAttxSumAm) ) return false;
		}
		{
			Object _intIctx= getIntIctx();
			Object __intIctx= other.getIntIctx();
			if ( _intIctx== null ) { if ( __intIctx!= null ) return false; }
			else if ( !_intIctx.equals(__intIctx) ) return false;
		}
		{
			Object _intIcmRdtx= getIntIcmRdtx();
			Object __intIcmRdtx= other.getIntIcmRdtx();
			if ( _intIcmRdtx== null ) { if ( __intIcmRdtx!= null ) return false; }
			else if ( !_intIcmRdtx.equals(__intIcmRdtx) ) return false;
		}
		{
			Object _intIcmSrtx= getIntIcmSrtx();
			Object __intIcmSrtx= other.getIntIcmSrtx();
			if ( _intIcmSrtx== null ) { if ( __intIcmSrtx!= null ) return false; }
			else if ( !_intIcmSrtx.equals(__intIcmSrtx) ) return false;
		}
		{
			Object _cnrnAm= getCnrnAm();
			Object __cnrnAm= other.getCnrnAm();
			if ( _cnrnAm== null ) { if ( __cnrnAm!= null ) return false; }
			else if ( !_cnrnAm.equals(__cnrnAm) ) return false;
		}
		{
			Object _rrint= getRrint();
			Object __rrint= other.getRrint();
			if ( _rrint== null ) { if ( __rrint!= null ) return false; }
			else if ( !_rrint.equals(__rrint) ) return false;
		}
		{
			Object _ddctSumAm= getDdctSumAm();
			Object __ddctSumAm= other.getDdctSumAm();
			if ( _ddctSumAm== null ) { if ( __ddctSumAm!= null ) return false; }
			else if ( !_ddctSumAm.equals(__ddctSumAm) ) return false;
		}
		{
			Object _dduPayAm= getDduPayAm();
			Object __dduPayAm= other.getDduPayAm();
			if ( _dduPayAm== null ) { if ( __dduPayAm!= null ) return false; }
			else if ( !_dduPayAm.equals(__dduPayAm) ) return false;
		}
		{
			Object _ectx= getEctx();
			Object __ectx= other.getEctx();
			if ( _ectx== null ) { if ( __ectx!= null ) return false; }
			else if ( !_ectx.equals(__ectx) ) return false;
		}
		{
			Object _dftx= getDftx();
			Object __dftx= other.getDftx();
			if ( _dftx== null ) { if ( __dftx!= null ) return false; }
			else if ( !_dftx.equals(__dftx) ) return false;
		}
		{
			Object _rvsnAm= getRvsnAm();
			Object __rvsnAm= other.getRvsnAm();
			if ( _rvsnAm== null ) { if ( __rvsnAm!= null ) return false; }
			else if ( !_rvsnAm.equals(__rvsnAm) ) return false;
		}
		{
			Object _slchIntx= getSlchIntx();
			Object __slchIntx= other.getSlchIntx();
			if ( _slchIntx== null ) { if ( __slchIntx!= null ) return false; }
			else if ( !_slchIntx.equals(__slchIntx) ) return false;
		}
		{
			Object _slchPvnsIctx= getSlchPvnsIctx();
			Object __slchPvnsIctx= other.getSlchPvnsIctx();
			if ( _slchPvnsIctx== null ) { if ( __slchPvnsIctx!= null ) return false; }
			else if ( !_slchPvnsIctx.equals(__slchPvnsIctx) ) return false;
		}
		{
			Object _paySumAm= getPaySumAm();
			Object __paySumAm= other.getPaySumAm();
			if ( _paySumAm== null ) { if ( __paySumAm!= null ) return false; }
			else if ( !_paySumAm.equals(__paySumAm) ) return false;
		}
		{
			Object _fcIntAm= getFcIntAm();
			Object __fcIntAm= other.getFcIntAm();
			if ( _fcIntAm== null ) { if ( __fcIntAm!= null ) return false; }
			else if ( !_fcIntAm.equals(__fcIntAm) ) return false;
		}
		{
			Object _fcRstrAttxAm= getFcRstrAttxAm();
			Object __fcRstrAttxAm= other.getFcRstrAttxAm();
			if ( _fcRstrAttxAm== null ) { if ( __fcRstrAttxAm!= null ) return false; }
			else if ( !_fcRstrAttxAm.equals(__fcRstrAttxAm) ) return false;
		}
		{
			Object _fcRrintAm= getFcRrintAm();
			Object __fcRrintAm= other.getFcRrintAm();
			if ( _fcRrintAm== null ) { if ( __fcRrintAm!= null ) return false; }
			else if ( !_fcRrintAm.equals(__fcRrintAm) ) return false;
		}
		{
			Object _fcImpAttxAm= getFcImpAttxAm();
			Object __fcImpAttxAm= other.getFcImpAttxAm();
			if ( _fcImpAttxAm== null ) { if ( __fcImpAttxAm!= null ) return false; }
			else if ( !_fcImpAttxAm.equals(__fcImpAttxAm) ) return false;
		}
		{
			Object _pstmRticmStaxAm= getPstmRticmStaxAm();
			Object __pstmRticmStaxAm= other.getPstmRticmStaxAm();
			if ( _pstmRticmStaxAm== null ) { if ( __pstmRticmStaxAm!= null ) return false; }
			else if ( !_pstmRticmStaxAm.equals(__pstmRticmStaxAm) ) return false;
		}
		{
			Object _pstmPnsnIctx= getPstmPnsnIctx();
			Object __pstmPnsnIctx= other.getPstmPnsnIctx();
			if ( _pstmPnsnIctx== null ) { if ( __pstmPnsnIctx!= null ) return false; }
			else if ( !_pstmPnsnIctx.equals(__pstmPnsnIctx) ) return false;
		}
		{
			Object _pstmRticmUsgAm= getPstmRticmUsgAm();
			Object __pstmRticmUsgAm= other.getPstmRticmUsgAm();
			if ( _pstmRticmUsgAm== null ) { if ( __pstmRticmUsgAm!= null ) return false; }
			else if ( !_pstmRticmUsgAm.equals(__pstmRticmUsgAm) ) return false;
		}
		{
			Object _pstmPnsnRdtx= getPstmPnsnRdtx();
			Object __pstmPnsnRdtx= other.getPstmPnsnRdtx();
			if ( _pstmPnsnRdtx== null ) { if ( __pstmPnsnRdtx!= null ) return false; }
			else if ( !_pstmPnsnRdtx.equals(__pstmPnsnRdtx) ) return false;
		}
		{
			Object _pstmRticmTax= getPstmRticmTax();
			Object __pstmRticmTax= other.getPstmRticmTax();
			if ( _pstmRticmTax== null ) { if ( __pstmRticmTax!= null ) return false; }
			else if ( !_pstmRticmTax.equals(__pstmRticmTax) ) return false;
		}
		{
			Object _pstmRtrtRdtx= getPstmRtrtRdtx();
			Object __pstmRtrtRdtx= other.getPstmRtrtRdtx();
			if ( _pstmRtrtRdtx== null ) { if ( __pstmRtrtRdtx!= null ) return false; }
			else if ( !_pstmRtrtRdtx.equals(__pstmRtrtRdtx) ) return false;
		}
		{
			Object _rtnPocpFee= getRtnPocpFee();
			Object __rtnPocpFee= other.getRtnPocpFee();
			if ( _rtnPocpFee== null ) { if ( __rtnPocpFee!= null ) return false; }
			else if ( !_rtnPocpFee.equals(__rtnPocpFee) ) return false;
		}
		{
			Object _etcIcmStaxAm= getEtcIcmStaxAm();
			Object __etcIcmStaxAm= other.getEtcIcmStaxAm();
			if ( _etcIcmStaxAm== null ) { if ( __etcIcmStaxAm!= null ) return false; }
			else if ( !_etcIcmStaxAm.equals(__etcIcmStaxAm) ) return false;
		}
		{
			Object _staxHovMnuAdj= getStaxHovMnuAdj();
			Object __staxHovMnuAdj= other.getStaxHovMnuAdj();
			if ( _staxHovMnuAdj== null ) { if ( __staxHovMnuAdj!= null ) return false; }
			else if ( !_staxHovMnuAdj.equals(__staxHovMnuAdj) ) return false;
		}
		{
			Object _feeStaxDdu= getFeeStaxDdu();
			Object __feeStaxDdu= other.getFeeStaxDdu();
			if ( _feeStaxDdu== null ) { if ( __feeStaxDdu!= null ) return false; }
			else if ( !_feeStaxDdu.equals(__feeStaxDdu) ) return false;
		}
		{
			Object _usumEvlAm= getUsumEvlAm();
			Object __usumEvlAm= other.getUsumEvlAm();
			if ( _usumEvlAm== null ) { if ( __usumEvlAm!= null ) return false; }
			else if ( !_usumEvlAm.equals(__usumEvlAm) ) return false;
		}
		{
			Object _moAcno= getMoAcno();
			Object __moAcno= other.getMoAcno();
			if ( _moAcno== null ) { if ( __moAcno!= null ) return false; }
			else if ( !_moAcno.equals(__moAcno) ) return false;
		}
		{
			Object _frgStcLossOfst= getFrgStcLossOfst();
			Object __frgStcLossOfst= other.getFrgStcLossOfst();
			if ( _frgStcLossOfst== null ) { if ( __frgStcLossOfst!= null ) return false; }
			else if ( !_frgStcLossOfst.equals(__frgStcLossOfst) ) return false;
		}
		{
			Object _staxDduTcmPfeAm= getStaxDduTcmPfeAm();
			Object __staxDduTcmPfeAm= other.getStaxDduTcmPfeAm();
			if ( _staxDduTcmPfeAm== null ) { if ( __staxDduTcmPfeAm!= null ) return false; }
			else if ( !_staxDduTcmPfeAm.equals(__staxDduTcmPfeAm) ) return false;
		}
		{
			Object _lstStaxAm= getLstStaxAm();
			Object __lstStaxAm= other.getLstStaxAm();
			if ( _lstStaxAm== null ) { if ( __lstStaxAm!= null ) return false; }
			else if ( !_lstStaxAm.equals(__lstStaxAm) ) return false;
		}
		{
			Object _smplPrftRt= getSmplPrftRt();
			Object __smplPrftRt= other.getSmplPrftRt();
			if ( _smplPrftRt== null ) { if ( __smplPrftRt!= null ) return false; }
			else if ( !_smplPrftRt.equals(__smplPrftRt) ) return false;
		}
		{
			Object _hcanFee= getHcanFee();
			Object __hcanFee= other.getHcanFee();
			if ( _hcanFee== null ) { if ( __hcanFee!= null ) return false; }
			else if ( !_hcanFee.equals(__hcanFee) ) return false;
		}
		{
			Object _yrXcPtrt= getYrXcPtrt();
			Object __yrXcPtrt= other.getYrXcPtrt();
			if ( _yrXcPtrt== null ) { if ( __yrXcPtrt!= null ) return false; }
			else if ( !_yrXcPtrt.equals(__yrXcPtrt) ) return false;
		}
		{
			Object _etcIctx= getEtcIctx();
			Object __etcIctx= other.getEtcIctx();
			if ( _etcIctx== null ) { if ( __etcIctx!= null ) return false; }
			else if ( !_etcIctx.equals(__etcIctx) ) return false;
		}
		{
			Object _etcRdtx= getEtcRdtx();
			Object __etcRdtx= other.getEtcRdtx();
			if ( _etcRdtx== null ) { if ( __etcRdtx!= null ) return false; }
			else if ( !_etcRdtx.equals(__etcRdtx) ) return false;
		}
		{
			Object _pnsnIctx= getPnsnIctx();
			Object __pnsnIctx= other.getPnsnIctx();
			if ( _pnsnIctx== null ) { if ( __pnsnIctx!= null ) return false; }
			else if ( !_pnsnIctx.equals(__pnsnIctx) ) return false;
		}
		{
			Object _pnsnPvnsIctx= getPnsnPvnsIctx();
			Object __pnsnPvnsIctx= other.getPnsnPvnsIctx();
			if ( _pnsnPvnsIctx== null ) { if ( __pnsnPvnsIctx!= null ) return false; }
			else if ( !_pnsnPvnsIctx.equals(__pnsnPvnsIctx) ) return false;
		}
		{
			Object _pnsnIcmStaxAm= getPnsnIcmStaxAm();
			Object __pnsnIcmStaxAm= other.getPnsnIcmStaxAm();
			if ( _pnsnIcmStaxAm== null ) { if ( __pnsnIcmStaxAm!= null ) return false; }
			else if ( !_pnsnIcmStaxAm.equals(__pnsnIcmStaxAm) ) return false;
		}
		{
			Object _atcnt= getAtcnt();
			Object __atcnt= other.getAtcnt();
			if ( _atcnt== null ) { if ( __atcnt!= null ) return false; }
			else if ( !_atcnt.equals(__atcnt) ) return false;
		}
		{
			Object _ctrmvFee= getCtrmvFee();
			Object __ctrmvFee= other.getCtrmvFee();
			if ( _ctrmvFee== null ) { if ( __ctrmvFee!= null ) return false; }
			else if ( !_ctrmvFee.equals(__ctrmvFee) ) return false;
		}
		{
			Object _lnintAm= getLnintAm();
			Object __lnintAm= other.getLnintAm();
			if ( _lnintAm== null ) { if ( __lnintAm!= null ) return false; }
			else if ( !_lnintAm.equals(__lnintAm) ) return false;
		}
		{
			Object _fintAm= getFintAm();
			Object __fintAm= other.getFintAm();
			if ( _fintAm== null ) { if ( __fintAm!= null ) return false; }
			else if ( !_fintAm.equals(__fintAm) ) return false;
		}
		{
			Object _lnPrnDelyRprnm= getLnPrnDelyRprnm();
			Object __lnPrnDelyRprnm= other.getLnPrnDelyRprnm();
			if ( _lnPrnDelyRprnm== null ) { if ( __lnPrnDelyRprnm!= null ) return false; }
			else if ( !_lnPrnDelyRprnm.equals(__lnPrnDelyRprnm) ) return false;
		}
		{
			Object _dpacLnNcitAm= getDpacLnNcitAm();
			Object __dpacLnNcitAm= other.getDpacLnNcitAm();
			if ( _dpacLnNcitAm== null ) { if ( __dpacLnNcitAm!= null ) return false; }
			else if ( !_dpacLnNcitAm.equals(__dpacLnNcitAm) ) return false;
		}
		{
			Object _lnNcitDelyRprnm= getLnNcitDelyRprnm();
			Object __lnNcitDelyRprnm= other.getLnNcitDelyRprnm();
			if ( _lnNcitDelyRprnm== null ) { if ( __lnNcitDelyRprnm!= null ) return false; }
			else if ( !_lnNcitDelyRprnm.equals(__lnNcitDelyRprnm) ) return false;
		}
		{
			Object _lmtNuseFee= getLmtNuseFee();
			Object __lmtNuseFee= other.getLmtNuseFee();
			if ( _lmtNuseFee== null ) { if ( __lmtNuseFee!= null ) return false; }
			else if ( !_lmtNuseFee.equals(__lmtNuseFee) ) return false;
		}
		{
			Object _krxcAm= getKrxcAm();
			Object __krxcAm= other.getKrxcAm();
			if ( _krxcAm== null ) { if ( __krxcAm!= null ) return false; }
			else if ( !_krxcAm.equals(__krxcAm) ) return false;
		}
		{
			Object _krxcCancAm= getKrxcCancAm();
			Object __krxcCancAm= other.getKrxcCancAm();
			if ( _krxcCancAm== null ) { if ( __krxcCancAm!= null ) return false; }
			else if ( !_krxcCancAm.equals(__krxcCancAm) ) return false;
		}
		{
			Object _prftRt= getPrftRt();
			Object __prftRt= other.getPrftRt();
			if ( _prftRt== null ) { if ( __prftRt!= null ) return false; }
			else if ( !_prftRt.equals(__prftRt) ) return false;
		}
		{
			Object _lstStaxAm2= getLstStaxAm2();
			Object __lstStaxAm2= other.getLstStaxAm2();
			if ( _lstStaxAm2== null ) { if ( __lstStaxAm2!= null ) return false; }
			else if ( !_lstStaxAm2.equals(__lstStaxAm2) ) return false;
		}
		{
			Object _mvavBuyUp= getMvavBuyUp();
			Object __mvavBuyUp= other.getMvavBuyUp();
			if ( _mvavBuyUp== null ) { if ( __mvavBuyUp!= null ) return false; }
			else if ( !_mvavBuyUp.equals(__mvavBuyUp) ) return false;
		}
		{
			Object _tetBuyRt= getTetBuyRt();
			Object __tetBuyRt= other.getTetBuyRt();
			if ( _tetBuyRt== null ) { if ( __tetBuyRt!= null ) return false; }
			else if ( !_tetBuyRt.equals(__tetBuyRt) ) return false;
		}
		{
			Object _trtFndYn= getTrtFndYn();
			Object __trtFndYn= other.getTrtFndYn();
			if ( _trtFndYn== null ) { if ( __trtFndYn!= null ) return false; }
			else if ( !_trtFndYn.equals(__trtFndYn) ) return false;
		}
		{
			Object _fractYn= getFractYn();
			Object __fractYn= other.getFractYn();
			if ( _fractYn== null ) { if ( __fractYn!= null ) return false; }
			else if ( !_fractYn.equals(__fractYn) ) return false;
		}
		{
			Object _gTrnDscd= getgTrnDscd();
			Object __gTrnDscd= other.getgTrnDscd();
			if ( _gTrnDscd== null ) { if ( __gTrnDscd!= null ) return false; }
			else if ( !_gTrnDscd.equals(__gTrnDscd) ) return false;
		}
		{
			Object _lnYn= getLnYn();
			Object __lnYn= other.getLnYn();
			if ( _lnYn== null ) { if ( __lnYn!= null ) return false; }
			else if ( !_lnYn.equals(__lnYn) ) return false;
		}
		{
			Object _dpsApirt= getDpsApirt();
			Object __dpsApirt= other.getDpsApirt();
			if ( _dpsApirt== null ) { if ( __dpsApirt!= null ) return false; }
			else if ( !_dpsApirt.equals(__dpsApirt) ) return false;
		}
		{
			Object _dntnAm= getDntnAm();
			Object __dntnAm= other.getDntnAm();
			if ( _dntnAm== null ) { if ( __dntnAm!= null ) return false; }
			else if ( !_dntnAm.equals(__dntnAm) ) return false;
		}
		{
			Object _hmnyAcldAm= getHmnyAcldAm();
			Object __hmnyAcldAm= other.getHmnyAcldAm();
			if ( _hmnyAcldAm== null ) { if ( __hmnyAcldAm!= null ) return false; }
			else if ( !_hmnyAcldAm.equals(__hmnyAcldAm) ) return false;
		}
		{
			Object _ppayIntAm= getPpayIntAm();
			Object __ppayIntAm= other.getPpayIntAm();
			if ( _ppayIntAm== null ) { if ( __ppayIntAm!= null ) return false; }
			else if ( !_ppayIntAm.equals(__ppayIntAm) ) return false;
		}
		{
			Object _etcTxt= getEtcTxt();
			Object __etcTxt= other.getEtcTxt();
			if ( _etcTxt== null ) { if ( __etcTxt!= null ) return false; }
			else if ( !_etcTxt.equals(__etcTxt) ) return false;
		}
		{
			Object _inqCucd= getInqCucd();
			Object __inqCucd= other.getInqCucd();
			if ( _inqCucd== null ) { if ( __inqCucd!= null ) return false; }
			else if ( !_inqCucd.equals(__inqCucd) ) return false;
		}
		{
			Object _slchStaxAm= getSlchStaxAm();
			Object __slchStaxAm= other.getSlchStaxAm();
			if ( _slchStaxAm== null ) { if ( __slchStaxAm!= null ) return false; }
			else if ( !_slchStaxAm.equals(__slchStaxAm) ) return false;
		}
		{
			Object _payBasPr= getPayBasPr();
			Object __payBasPr= other.getPayBasPr();
			if ( _payBasPr== null ) { if ( __payBasPr!= null ) return false; }
			else if ( !_payBasPr.equals(__payBasPr) ) return false;
		}
		{
			Object _staxBasPr= getStaxBasPr();
			Object __staxBasPr= other.getStaxBasPr();
			if ( _staxBasPr== null ) { if ( __staxBasPr!= null ) return false; }
			else if ( !_staxBasPr.equals(__staxBasPr) ) return false;
		}
		{
			Object _krwXchInciAm= getKrwXchInciAm();
			Object __krwXchInciAm= other.getKrwXchInciAm();
			if ( _krwXchInciAm== null ) { if ( __krwXchInciAm!= null ) return false; }
			else if ( !_krwXchInciAm.equals(__krwXchInciAm) ) return false;
		}
		{
			Object _krxcWthdAm= getKrxcWthdAm();
			Object __krxcWthdAm= other.getKrxcWthdAm();
			if ( _krxcWthdAm== null ) { if ( __krxcWthdAm!= null ) return false; }
			else if ( !_krxcWthdAm.equals(__krxcWthdAm) ) return false;
		}
		{
			Object _plAm= getPlAm();
			Object __plAm= other.getPlAm();
			if ( _plAm== null ) { if ( __plAm!= null ) return false; }
			else if ( !_plAm.equals(__plAm) ) return false;
		}
		{
			Object _cusPrftRt= getCusPrftRt();
			Object __cusPrftRt= other.getCusPrftRt();
			if ( _cusPrftRt== null ) { if ( __cusPrftRt!= null ) return false; }
			else if ( !_cusPrftRt.equals(__cusPrftRt) ) return false;
		}
		{
			Object _potWthdAm= getPotWthdAm();
			Object __potWthdAm= other.getPotWthdAm();
			if ( _potWthdAm== null ) { if ( __potWthdAm!= null ) return false; }
			else if ( !_potWthdAm.equals(__potWthdAm) ) return false;
		}
		{
			Object _avgXrtIntAm= getAvgXrtIntAm();
			Object __avgXrtIntAm= other.getAvgXrtIntAm();
			if ( _avgXrtIntAm== null ) { if ( __avgXrtIntAm!= null ) return false; }
			else if ( !_avgXrtIntAm.equals(__avgXrtIntAm) ) return false;
		}
		{
			Object _cusAplSellXrt= getCusAplSellXrt();
			Object __cusAplSellXrt= other.getCusAplSellXrt();
			if ( _cusAplSellXrt== null ) { if ( __cusAplSellXrt!= null ) return false; }
			else if ( !_cusAplSellXrt.equals(__cusAplSellXrt) ) return false;
		}
		{
			Object _ddctAm= getDdctAm();
			Object __ddctAm= other.getDdctAm();
			if ( _ddctAm== null ) { if ( __ddctAm!= null ) return false; }
			else if ( !_ddctAm.equals(__ddctAm) ) return false;
		}
		{
			Object _wthdAmSumAm= getWthdAmSumAm();
			Object __wthdAmSumAm= other.getWthdAmSumAm();
			if ( _wthdAmSumAm== null ) { if ( __wthdAmSumAm!= null ) return false; }
			else if ( !_wthdAmSumAm.equals(__wthdAmSumAm) ) return false;
		}
		{
			Object _bfdnAcmPrftRt= getBfdnAcmPrftRt();
			Object __bfdnAcmPrftRt= other.getBfdnAcmPrftRt();
			if ( _bfdnAcmPrftRt== null ) { if ( __bfdnAcmPrftRt!= null ) return false; }
			else if ( !_bfdnAcmPrftRt.equals(__bfdnAcmPrftRt) ) return false;
		}
		{
			Object _afdnAcmPrftRt= getAfdnAcmPrftRt();
			Object __afdnAcmPrftRt= other.getAfdnAcmPrftRt();
			if ( _afdnAcmPrftRt== null ) { if ( __afdnAcmPrftRt!= null ) return false; }
			else if ( !_afdnAcmPrftRt.equals(__afdnAcmPrftRt) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MNPMnyPinFncTrnSelectMnpTxIntInf_DODT.class.getName()).append(":\n");
		sb.append("\ttmntFrcsDt: ");
		sb.append(tmntFrcsDt==null?"null":getTmntFrcsDt());
		sb.append("\n");
		sb.append("\tnewDt: ");
		sb.append(newDt==null?"null":getNewDt());
		sb.append("\n");
		sb.append("\txprDt: ");
		sb.append(xprDt==null?"null":getXprDt());
		sb.append("\n");
		sb.append("\tcancDisNm: ");
		sb.append(cancDisNm==null?"null":getCancDisNm());
		sb.append("\n");
		sb.append("\tprnAm: ");
		sb.append(prnAm==null?"null":getPrnAm());
		sb.append("\n");
		sb.append("\ttotIntAm: ");
		sb.append(totIntAm==null?"null":getTotIntAm());
		sb.append("\n");
		sb.append("\tbscIntAm: ");
		sb.append(bscIntAm==null?"null":getBscIntAm());
		sb.append("\n");
		sb.append("\tspclIntAm: ");
		sb.append(spclIntAm==null?"null":getSpclIntAm());
		sb.append("\n");
		sb.append("\tafepIntAm: ");
		sb.append(afepIntAm==null?"null":getAfepIntAm());
		sb.append("\n");
		sb.append("\trstrIctx: ");
		sb.append(rstrIctx==null?"null":getRstrIctx());
		sb.append("\n");
		sb.append("\trstrRdtx: ");
		sb.append(rstrRdtx==null?"null":getRstrRdtx());
		sb.append("\n");
		sb.append("\trstrSrtx: ");
		sb.append(rstrSrtx==null?"null":getRstrSrtx());
		sb.append("\n");
		sb.append("\timpAttxSumAm: ");
		sb.append(impAttxSumAm==null?"null":getImpAttxSumAm());
		sb.append("\n");
		sb.append("\tintIctx: ");
		sb.append(intIctx==null?"null":getIntIctx());
		sb.append("\n");
		sb.append("\tintIcmRdtx: ");
		sb.append(intIcmRdtx==null?"null":getIntIcmRdtx());
		sb.append("\n");
		sb.append("\tintIcmSrtx: ");
		sb.append(intIcmSrtx==null?"null":getIntIcmSrtx());
		sb.append("\n");
		sb.append("\tcnrnAm: ");
		sb.append(cnrnAm==null?"null":getCnrnAm());
		sb.append("\n");
		sb.append("\trrint: ");
		sb.append(rrint==null?"null":getRrint());
		sb.append("\n");
		sb.append("\tddctSumAm: ");
		sb.append(ddctSumAm==null?"null":getDdctSumAm());
		sb.append("\n");
		sb.append("\tdduPayAm: ");
		sb.append(dduPayAm==null?"null":getDduPayAm());
		sb.append("\n");
		sb.append("\tectx: ");
		sb.append(ectx==null?"null":getEctx());
		sb.append("\n");
		sb.append("\tdftx: ");
		sb.append(dftx==null?"null":getDftx());
		sb.append("\n");
		sb.append("\trvsnAm: ");
		sb.append(rvsnAm==null?"null":getRvsnAm());
		sb.append("\n");
		sb.append("\tslchIntx: ");
		sb.append(slchIntx==null?"null":getSlchIntx());
		sb.append("\n");
		sb.append("\tslchPvnsIctx: ");
		sb.append(slchPvnsIctx==null?"null":getSlchPvnsIctx());
		sb.append("\n");
		sb.append("\tpaySumAm: ");
		sb.append(paySumAm==null?"null":getPaySumAm());
		sb.append("\n");
		sb.append("\tfcIntAm: ");
		sb.append(fcIntAm==null?"null":getFcIntAm());
		sb.append("\n");
		sb.append("\tfcRstrAttxAm: ");
		sb.append(fcRstrAttxAm==null?"null":getFcRstrAttxAm());
		sb.append("\n");
		sb.append("\tfcRrintAm: ");
		sb.append(fcRrintAm==null?"null":getFcRrintAm());
		sb.append("\n");
		sb.append("\tfcImpAttxAm: ");
		sb.append(fcImpAttxAm==null?"null":getFcImpAttxAm());
		sb.append("\n");
		sb.append("\tpstmRticmStaxAm: ");
		sb.append(pstmRticmStaxAm==null?"null":getPstmRticmStaxAm());
		sb.append("\n");
		sb.append("\tpstmPnsnIctx: ");
		sb.append(pstmPnsnIctx==null?"null":getPstmPnsnIctx());
		sb.append("\n");
		sb.append("\tpstmRticmUsgAm: ");
		sb.append(pstmRticmUsgAm==null?"null":getPstmRticmUsgAm());
		sb.append("\n");
		sb.append("\tpstmPnsnRdtx: ");
		sb.append(pstmPnsnRdtx==null?"null":getPstmPnsnRdtx());
		sb.append("\n");
		sb.append("\tpstmRticmTax: ");
		sb.append(pstmRticmTax==null?"null":getPstmRticmTax());
		sb.append("\n");
		sb.append("\tpstmRtrtRdtx: ");
		sb.append(pstmRtrtRdtx==null?"null":getPstmRtrtRdtx());
		sb.append("\n");
		sb.append("\trtnPocpFee: ");
		sb.append(rtnPocpFee==null?"null":getRtnPocpFee());
		sb.append("\n");
		sb.append("\tetcIcmStaxAm: ");
		sb.append(etcIcmStaxAm==null?"null":getEtcIcmStaxAm());
		sb.append("\n");
		sb.append("\tstaxHovMnuAdj: ");
		sb.append(staxHovMnuAdj==null?"null":getStaxHovMnuAdj());
		sb.append("\n");
		sb.append("\tfeeStaxDdu: ");
		sb.append(feeStaxDdu==null?"null":getFeeStaxDdu());
		sb.append("\n");
		sb.append("\tusumEvlAm: ");
		sb.append(usumEvlAm==null?"null":getUsumEvlAm());
		sb.append("\n");
		sb.append("\tmoAcno: ");
		sb.append(moAcno==null?"null":getMoAcno());
		sb.append("\n");
		sb.append("\tfrgStcLossOfst: ");
		sb.append(frgStcLossOfst==null?"null":getFrgStcLossOfst());
		sb.append("\n");
		sb.append("\tstaxDduTcmPfeAm: ");
		sb.append(staxDduTcmPfeAm==null?"null":getStaxDduTcmPfeAm());
		sb.append("\n");
		sb.append("\tlstStaxAm: ");
		sb.append(lstStaxAm==null?"null":getLstStaxAm());
		sb.append("\n");
		sb.append("\tsmplPrftRt: ");
		sb.append(smplPrftRt==null?"null":getSmplPrftRt());
		sb.append("\n");
		sb.append("\thcanFee: ");
		sb.append(hcanFee==null?"null":getHcanFee());
		sb.append("\n");
		sb.append("\tyrXcPtrt: ");
		sb.append(yrXcPtrt==null?"null":getYrXcPtrt());
		sb.append("\n");
		sb.append("\tetcIctx: ");
		sb.append(etcIctx==null?"null":getEtcIctx());
		sb.append("\n");
		sb.append("\tetcRdtx: ");
		sb.append(etcRdtx==null?"null":getEtcRdtx());
		sb.append("\n");
		sb.append("\tpnsnIctx: ");
		sb.append(pnsnIctx==null?"null":getPnsnIctx());
		sb.append("\n");
		sb.append("\tpnsnPvnsIctx: ");
		sb.append(pnsnPvnsIctx==null?"null":getPnsnPvnsIctx());
		sb.append("\n");
		sb.append("\tpnsnIcmStaxAm: ");
		sb.append(pnsnIcmStaxAm==null?"null":getPnsnIcmStaxAm());
		sb.append("\n");
		sb.append("\tatcnt: ");
		sb.append(atcnt==null?"null":getAtcnt());
		sb.append("\n");
		sb.append("\tctrmvFee: ");
		sb.append(ctrmvFee==null?"null":getCtrmvFee());
		sb.append("\n");
		sb.append("\tlnintAm: ");
		sb.append(lnintAm==null?"null":getLnintAm());
		sb.append("\n");
		sb.append("\tfintAm: ");
		sb.append(fintAm==null?"null":getFintAm());
		sb.append("\n");
		sb.append("\tlnPrnDelyRprnm: ");
		sb.append(lnPrnDelyRprnm==null?"null":getLnPrnDelyRprnm());
		sb.append("\n");
		sb.append("\tdpacLnNcitAm: ");
		sb.append(dpacLnNcitAm==null?"null":getDpacLnNcitAm());
		sb.append("\n");
		sb.append("\tlnNcitDelyRprnm: ");
		sb.append(lnNcitDelyRprnm==null?"null":getLnNcitDelyRprnm());
		sb.append("\n");
		sb.append("\tlmtNuseFee: ");
		sb.append(lmtNuseFee==null?"null":getLmtNuseFee());
		sb.append("\n");
		sb.append("\tkrxcAm: ");
		sb.append(krxcAm==null?"null":getKrxcAm());
		sb.append("\n");
		sb.append("\tkrxcCancAm: ");
		sb.append(krxcCancAm==null?"null":getKrxcCancAm());
		sb.append("\n");
		sb.append("\tprftRt: ");
		sb.append(prftRt==null?"null":getPrftRt());
		sb.append("\n");
		sb.append("\tlstStaxAm2: ");
		sb.append(lstStaxAm2==null?"null":getLstStaxAm2());
		sb.append("\n");
		sb.append("\tmvavBuyUp: ");
		sb.append(mvavBuyUp==null?"null":getMvavBuyUp());
		sb.append("\n");
		sb.append("\ttetBuyRt: ");
		sb.append(tetBuyRt==null?"null":getTetBuyRt());
		sb.append("\n");
		sb.append("\ttrtFndYn: ");
		sb.append(trtFndYn==null?"null":getTrtFndYn());
		sb.append("\n");
		sb.append("\tfractYn: ");
		sb.append(fractYn==null?"null":getFractYn());
		sb.append("\n");
		sb.append("\tgTrnDscd: ");
		sb.append(gTrnDscd==null?"null":getgTrnDscd());
		sb.append("\n");
		sb.append("\tlnYn: ");
		sb.append(lnYn==null?"null":getLnYn());
		sb.append("\n");
		sb.append("\tdpsApirt: ");
		sb.append(dpsApirt==null?"null":getDpsApirt());
		sb.append("\n");
		sb.append("\tdntnAm: ");
		sb.append(dntnAm==null?"null":getDntnAm());
		sb.append("\n");
		sb.append("\thmnyAcldAm: ");
		sb.append(hmnyAcldAm==null?"null":getHmnyAcldAm());
		sb.append("\n");
		sb.append("\tppayIntAm: ");
		sb.append(ppayIntAm==null?"null":getPpayIntAm());
		sb.append("\n");
		sb.append("\tetcTxt: ");
		sb.append(etcTxt==null?"null":getEtcTxt());
		sb.append("\n");
		sb.append("\tinqCucd: ");
		sb.append(inqCucd==null?"null":getInqCucd());
		sb.append("\n");
		sb.append("\tslchStaxAm: ");
		sb.append(slchStaxAm==null?"null":getSlchStaxAm());
		sb.append("\n");
		sb.append("\tpayBasPr: ");
		sb.append(payBasPr==null?"null":getPayBasPr());
		sb.append("\n");
		sb.append("\tstaxBasPr: ");
		sb.append(staxBasPr==null?"null":getStaxBasPr());
		sb.append("\n");
		sb.append("\tkrwXchInciAm: ");
		sb.append(krwXchInciAm==null?"null":getKrwXchInciAm());
		sb.append("\n");
		sb.append("\tkrxcWthdAm: ");
		sb.append(krxcWthdAm==null?"null":getKrxcWthdAm());
		sb.append("\n");
		sb.append("\tplAm: ");
		sb.append(plAm==null?"null":getPlAm());
		sb.append("\n");
		sb.append("\tcusPrftRt: ");
		sb.append(cusPrftRt==null?"null":getCusPrftRt());
		sb.append("\n");
		sb.append("\tpotWthdAm: ");
		sb.append(potWthdAm==null?"null":getPotWthdAm());
		sb.append("\n");
		sb.append("\tavgXrtIntAm: ");
		sb.append(avgXrtIntAm==null?"null":getAvgXrtIntAm());
		sb.append("\n");
		sb.append("\tcusAplSellXrt: ");
		sb.append(cusAplSellXrt==null?"null":getCusAplSellXrt());
		sb.append("\n");
		sb.append("\tddctAm: ");
		sb.append(ddctAm==null?"null":getDdctAm());
		sb.append("\n");
		sb.append("\twthdAmSumAm: ");
		sb.append(wthdAmSumAm==null?"null":getWthdAmSumAm());
		sb.append("\n");
		sb.append("\tbfdnAcmPrftRt: ");
		sb.append(bfdnAcmPrftRt==null?"null":getBfdnAcmPrftRt());
		sb.append("\n");
		sb.append("\tafdnAcmPrftRt: ");
		sb.append(afdnAcmPrftRt==null?"null":getAfdnAcmPrftRt());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 8; /* tmntFrcsDt */
		messageLen+= 8; /* newDt */
		messageLen+= 8; /* xprDt */
		messageLen+= 40; /* cancDisNm */
		messageLen+= 19; /* prnAm */
		messageLen+= 19; /* totIntAm */
		messageLen+= 19; /* bscIntAm */
		messageLen+= 19; /* spclIntAm */
		messageLen+= 19; /* afepIntAm */
		messageLen+= 19; /* rstrIctx */
		messageLen+= 19; /* rstrRdtx */
		messageLen+= 19; /* rstrSrtx */
		messageLen+= 19; /* impAttxSumAm */
		messageLen+= 19; /* intIctx */
		messageLen+= 19; /* intIcmRdtx */
		messageLen+= 19; /* intIcmSrtx */
		messageLen+= 19; /* cnrnAm */
		messageLen+= 19; /* rrint */
		messageLen+= 19; /* ddctSumAm */
		messageLen+= 19; /* dduPayAm */
		messageLen+= 19; /* ectx */
		messageLen+= 19; /* dftx */
		messageLen+= 19; /* rvsnAm */
		messageLen+= 19; /* slchIntx */
		messageLen+= 19; /* slchPvnsIctx */
		messageLen+= 19; /* paySumAm */
		messageLen+= 19; /* fcIntAm */
		messageLen+= 19; /* fcRstrAttxAm */
		messageLen+= 19; /* fcRrintAm */
		messageLen+= 19; /* fcImpAttxAm */
		messageLen+= 19; /* pstmRticmStaxAm */
		messageLen+= 19; /* pstmPnsnIctx */
		messageLen+= 19; /* pstmRticmUsgAm */
		messageLen+= 19; /* pstmPnsnRdtx */
		messageLen+= 19; /* pstmRticmTax */
		messageLen+= 19; /* pstmRtrtRdtx */
		messageLen+= 19; /* rtnPocpFee */
		messageLen+= 19; /* etcIcmStaxAm */
		messageLen+= 19; /* staxHovMnuAdj */
		messageLen+= 19; /* feeStaxDdu */
		messageLen+= 19; /* usumEvlAm */
		messageLen+= 15; /* moAcno */
		messageLen+= 19; /* frgStcLossOfst */
		messageLen+= 19; /* staxDduTcmPfeAm */
		messageLen+= 19; /* lstStaxAm */
		messageLen+= 10; /* smplPrftRt */
		messageLen+= 19; /* hcanFee */
		messageLen+= 9; /* yrXcPtrt */
		messageLen+= 19; /* etcIctx */
		messageLen+= 19; /* etcRdtx */
		messageLen+= 19; /* pnsnIctx */
		messageLen+= 19; /* pnsnPvnsIctx */
		messageLen+= 19; /* pnsnIcmStaxAm */
		messageLen+= 19; /* atcnt */
		messageLen+= 19; /* ctrmvFee */
		messageLen+= 19; /* lnintAm */
		messageLen+= 19; /* fintAm */
		messageLen+= 19; /* lnPrnDelyRprnm */
		messageLen+= 19; /* dpacLnNcitAm */
		messageLen+= 19; /* lnNcitDelyRprnm */
		messageLen+= 19; /* lmtNuseFee */
		messageLen+= 19; /* krxcAm */
		messageLen+= 19; /* krxcCancAm */
		messageLen+= 9; /* prftRt */
		messageLen+= 19; /* lstStaxAm2 */
		messageLen+= 19; /* mvavBuyUp */
		messageLen+= 9; /* tetBuyRt */
		messageLen+= 1; /* trtFndYn */
		messageLen+= 1; /* fractYn */
		messageLen+= 1; /* gTrnDscd */
		messageLen+= 1; /* lnYn */
		messageLen+= 10; /* dpsApirt */
		messageLen+= 19; /* dntnAm */
		messageLen+= 19; /* hmnyAcldAm */
		messageLen+= 19; /* ppayIntAm */
		messageLen+= 1000; /* etcTxt */
		messageLen+= 3; /* inqCucd */
		messageLen+= 19; /* slchStaxAm */
		messageLen+= 19; /* payBasPr */
		messageLen+= 19; /* staxBasPr */
		messageLen+= 18; /* krwXchInciAm */
		messageLen+= 18; /* krxcWthdAm */
		messageLen+= 19; /* plAm */
		messageLen+= 7; /* cusPrftRt */
		messageLen+= 19; /* potWthdAm */
		messageLen+= 19; /* avgXrtIntAm */
		messageLen+= 9; /* cusAplSellXrt */
		messageLen+= 19; /* ddctAm */
		messageLen+= 20; /* wthdAmSumAm */
		messageLen+= 6; /* bfdnAcmPrftRt */
		messageLen+= 6; /* afdnAcmPrftRt */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("tmntFrcsDt");
		list.add("newDt");
		list.add("xprDt");
		list.add("cancDisNm");
		list.add("prnAm");
		list.add("totIntAm");
		list.add("bscIntAm");
		list.add("spclIntAm");
		list.add("afepIntAm");
		list.add("rstrIctx");
		list.add("rstrRdtx");
		list.add("rstrSrtx");
		list.add("impAttxSumAm");
		list.add("intIctx");
		list.add("intIcmRdtx");
		list.add("intIcmSrtx");
		list.add("cnrnAm");
		list.add("rrint");
		list.add("ddctSumAm");
		list.add("dduPayAm");
		list.add("ectx");
		list.add("dftx");
		list.add("rvsnAm");
		list.add("slchIntx");
		list.add("slchPvnsIctx");
		list.add("paySumAm");
		list.add("fcIntAm");
		list.add("fcRstrAttxAm");
		list.add("fcRrintAm");
		list.add("fcImpAttxAm");
		list.add("pstmRticmStaxAm");
		list.add("pstmPnsnIctx");
		list.add("pstmRticmUsgAm");
		list.add("pstmPnsnRdtx");
		list.add("pstmRticmTax");
		list.add("pstmRtrtRdtx");
		list.add("rtnPocpFee");
		list.add("etcIcmStaxAm");
		list.add("staxHovMnuAdj");
		list.add("feeStaxDdu");
		list.add("usumEvlAm");
		list.add("moAcno");
		list.add("frgStcLossOfst");
		list.add("staxDduTcmPfeAm");
		list.add("lstStaxAm");
		list.add("smplPrftRt");
		list.add("hcanFee");
		list.add("yrXcPtrt");
		list.add("etcIctx");
		list.add("etcRdtx");
		list.add("pnsnIctx");
		list.add("pnsnPvnsIctx");
		list.add("pnsnIcmStaxAm");
		list.add("atcnt");
		list.add("ctrmvFee");
		list.add("lnintAm");
		list.add("fintAm");
		list.add("lnPrnDelyRprnm");
		list.add("dpacLnNcitAm");
		list.add("lnNcitDelyRprnm");
		list.add("lmtNuseFee");
		list.add("krxcAm");
		list.add("krxcCancAm");
		list.add("prftRt");
		list.add("lstStaxAm2");
		list.add("mvavBuyUp");
		list.add("tetBuyRt");
		list.add("trtFndYn");
		list.add("fractYn");
		list.add("gTrnDscd");
		list.add("lnYn");
		list.add("dpsApirt");
		list.add("dntnAm");
		list.add("hmnyAcldAm");
		list.add("ppayIntAm");
		list.add("etcTxt");
		list.add("inqCucd");
		list.add("slchStaxAm");
		list.add("payBasPr");
		list.add("staxBasPr");
		list.add("krwXchInciAm");
		list.add("krxcWthdAm");
		list.add("plAm");
		list.add("cusPrftRt");
		list.add("potWthdAm");
		list.add("avgXrtIntAm");
		list.add("cusAplSellXrt");
		list.add("ddctAm");
		list.add("wthdAmSumAm");
		list.add("bfdnAcmPrftRt");
		list.add("afdnAcmPrftRt");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("tmntFrcsDt", get("tmntFrcsDt"));
		map.put("newDt", get("newDt"));
		map.put("xprDt", get("xprDt"));
		map.put("cancDisNm", get("cancDisNm"));
		map.put("prnAm", get("prnAm"));
		map.put("totIntAm", get("totIntAm"));
		map.put("bscIntAm", get("bscIntAm"));
		map.put("spclIntAm", get("spclIntAm"));
		map.put("afepIntAm", get("afepIntAm"));
		map.put("rstrIctx", get("rstrIctx"));
		map.put("rstrRdtx", get("rstrRdtx"));
		map.put("rstrSrtx", get("rstrSrtx"));
		map.put("impAttxSumAm", get("impAttxSumAm"));
		map.put("intIctx", get("intIctx"));
		map.put("intIcmRdtx", get("intIcmRdtx"));
		map.put("intIcmSrtx", get("intIcmSrtx"));
		map.put("cnrnAm", get("cnrnAm"));
		map.put("rrint", get("rrint"));
		map.put("ddctSumAm", get("ddctSumAm"));
		map.put("dduPayAm", get("dduPayAm"));
		map.put("ectx", get("ectx"));
		map.put("dftx", get("dftx"));
		map.put("rvsnAm", get("rvsnAm"));
		map.put("slchIntx", get("slchIntx"));
		map.put("slchPvnsIctx", get("slchPvnsIctx"));
		map.put("paySumAm", get("paySumAm"));
		map.put("fcIntAm", get("fcIntAm"));
		map.put("fcRstrAttxAm", get("fcRstrAttxAm"));
		map.put("fcRrintAm", get("fcRrintAm"));
		map.put("fcImpAttxAm", get("fcImpAttxAm"));
		map.put("pstmRticmStaxAm", get("pstmRticmStaxAm"));
		map.put("pstmPnsnIctx", get("pstmPnsnIctx"));
		map.put("pstmRticmUsgAm", get("pstmRticmUsgAm"));
		map.put("pstmPnsnRdtx", get("pstmPnsnRdtx"));
		map.put("pstmRticmTax", get("pstmRticmTax"));
		map.put("pstmRtrtRdtx", get("pstmRtrtRdtx"));
		map.put("rtnPocpFee", get("rtnPocpFee"));
		map.put("etcIcmStaxAm", get("etcIcmStaxAm"));
		map.put("staxHovMnuAdj", get("staxHovMnuAdj"));
		map.put("feeStaxDdu", get("feeStaxDdu"));
		map.put("usumEvlAm", get("usumEvlAm"));
		map.put("moAcno", get("moAcno"));
		map.put("frgStcLossOfst", get("frgStcLossOfst"));
		map.put("staxDduTcmPfeAm", get("staxDduTcmPfeAm"));
		map.put("lstStaxAm", get("lstStaxAm"));
		map.put("smplPrftRt", get("smplPrftRt"));
		map.put("hcanFee", get("hcanFee"));
		map.put("yrXcPtrt", get("yrXcPtrt"));
		map.put("etcIctx", get("etcIctx"));
		map.put("etcRdtx", get("etcRdtx"));
		map.put("pnsnIctx", get("pnsnIctx"));
		map.put("pnsnPvnsIctx", get("pnsnPvnsIctx"));
		map.put("pnsnIcmStaxAm", get("pnsnIcmStaxAm"));
		map.put("atcnt", get("atcnt"));
		map.put("ctrmvFee", get("ctrmvFee"));
		map.put("lnintAm", get("lnintAm"));
		map.put("fintAm", get("fintAm"));
		map.put("lnPrnDelyRprnm", get("lnPrnDelyRprnm"));
		map.put("dpacLnNcitAm", get("dpacLnNcitAm"));
		map.put("lnNcitDelyRprnm", get("lnNcitDelyRprnm"));
		map.put("lmtNuseFee", get("lmtNuseFee"));
		map.put("krxcAm", get("krxcAm"));
		map.put("krxcCancAm", get("krxcCancAm"));
		map.put("prftRt", get("prftRt"));
		map.put("lstStaxAm2", get("lstStaxAm2"));
		map.put("mvavBuyUp", get("mvavBuyUp"));
		map.put("tetBuyRt", get("tetBuyRt"));
		map.put("trtFndYn", get("trtFndYn"));
		map.put("fractYn", get("fractYn"));
		map.put("gTrnDscd", get("gTrnDscd"));
		map.put("lnYn", get("lnYn"));
		map.put("dpsApirt", get("dpsApirt"));
		map.put("dntnAm", get("dntnAm"));
		map.put("hmnyAcldAm", get("hmnyAcldAm"));
		map.put("ppayIntAm", get("ppayIntAm"));
		map.put("etcTxt", get("etcTxt"));
		map.put("inqCucd", get("inqCucd"));
		map.put("slchStaxAm", get("slchStaxAm"));
		map.put("payBasPr", get("payBasPr"));
		map.put("staxBasPr", get("staxBasPr"));
		map.put("krwXchInciAm", get("krwXchInciAm"));
		map.put("krxcWthdAm", get("krxcWthdAm"));
		map.put("plAm", get("plAm"));
		map.put("cusPrftRt", get("cusPrftRt"));
		map.put("potWthdAm", get("potWthdAm"));
		map.put("avgXrtIntAm", get("avgXrtIntAm"));
		map.put("cusAplSellXrt", get("cusAplSellXrt"));
		map.put("ddctAm", get("ddctAm"));
		map.put("wthdAmSumAm", get("wthdAmSumAm"));
		map.put("bfdnAcmPrftRt", get("bfdnAcmPrftRt"));
		map.put("afdnAcmPrftRt", get("afdnAcmPrftRt"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -345566517:/* tmntFrcsDt */
			return getTmntFrcsDt();
		case 104712784:/* newDt */
			return getNewDt();
		case 114270890:/* xprDt */
			return getXprDt();
		case 446028826:/* cancDisNm */
			return getCancDisNm();
		case 106938360:/* prnAm */
			return getPrnAm();
		case -871981406:/* totIntAm */
			return getTotIntAm();
		case 885522793:/* bscIntAm */
			return getBscIntAm();
		case 1053703317:/* spclIntAm */
			return getSpclIntAm();
		case 869435083:/* afepIntAm */
			return getAfepIntAm();
		case -770840003:/* rstrIctx */
			return getRstrIctx();
		case -770570923:/* rstrRdtx */
			return getRstrRdtx();
		case -770527678:/* rstrSrtx */
			return getRstrSrtx();
		case -290994764:/* impAttxSumAm */
			return getImpAttxSumAm();
		case 1957214637:/* intIctx */
			return getIntIctx();
		case -1102256518:/* intIcmRdtx */
			return getIntIcmRdtx();
		case -1102213273:/* intIcmSrtx */
			return getIntIcmSrtx();
		case -1355590029:/* cnrnAm */
			return getCnrnAm();
		case 108781999:/* rrint */
			return getRrint();
		case -1099668122:/* ddctSumAm */
			return getDdctSumAm();
		case 169929727:/* dduPayAm */
			return getDduPayAm();
		case 3107746:/* ectx */
			return getEctx();
		case 3080838:/* dftx */
			return getDftx();
		case -918734805:/* rvsnAm */
			return getRvsnAm();
		case -1441508345:/* slchIntx */
			return getSlchIntx();
		case -1809435481:/* slchPvnsIctx */
			return getSlchPvnsIctx();
		case 1359144975:/* paySumAm */
			return getPaySumAm();
		case -1058811458:/* fcIntAm */
			return getFcIntAm();
		case -1785724289:/* fcRstrAttxAm */
			return getFcRstrAttxAm();
		case -107256130:/* fcRrintAm */
			return getFcRrintAm();
		case -400043214:/* fcImpAttxAm */
			return getFcImpAttxAm();
		case -1718956103:/* pstmRticmStaxAm */
			return getPstmRticmStaxAm();
		case 244892019:/* pstmPnsnIctx */
			return getPstmPnsnIctx();
		case 362013152:/* pstmRticmUsgAm */
			return getPstmRticmUsgAm();
		case 245161099:/* pstmPnsnRdtx */
			return getPstmPnsnRdtx();
		case 170207414:/* pstmRticmTax */
			return getPstmRticmTax();
		case 442781238:/* pstmRtrtRdtx */
			return getPstmRtrtRdtx();
		case -444892882:/* rtnPocpFee */
			return getRtnPocpFee();
		case -2031092253:/* etcIcmStaxAm */
			return getEtcIcmStaxAm();
		case 941230794:/* staxHovMnuAdj */
			return getStaxHovMnuAdj();
		case -1036029929:/* feeStaxDdu */
			return getFeeStaxDdu();
		case 1487588177:/* usumEvlAm */
			return getUsumEvlAm();
		case -1069843931:/* moAcno */
			return getMoAcno();
		case 746143842:/* frgStcLossOfst */
			return getFrgStcLossOfst();
		case -1221291494:/* staxDduTcmPfeAm */
			return getStaxDduTcmPfeAm();
		case -1014261039:/* lstStaxAm */
			return getLstStaxAm();
		case 817887784:/* smplPrftRt */
			return getSmplPrftRt();
		case 738317310:/* hcanFee */
			return getHcanFee();
		case 1136149834:/* yrXcPtrt */
			return getYrXcPtrt();
		case -1436725038:/* etcIctx */
			return getEtcIctx();
		case -1436455958:/* etcRdtx */
			return getEtcRdtx();
		case -136367721:/* pnsnIctx */
			return getPnsnIctx();
		case 1695307266:/* pnsnPvnsIctx */
			return getPnsnPvnsIctx();
		case 264556606:/* pnsnIcmStaxAm */
			return getPnsnIcmStaxAm();
		case 93135958:/* atcnt */
			return getAtcnt();
		case -316251236:/* ctrmvFee */
			return getCtrmvFee();
		case 315716665:/* lnintAm */
			return getLnintAm();
		case -1274433579:/* fintAm */
			return getFintAm();
		case -182486309:/* lnPrnDelyRprnm */
			return getLnPrnDelyRprnm();
		case 675474908:/* dpacLnNcitAm */
			return getDpacLnNcitAm();
		case -521620125:/* lnNcitDelyRprnm */
			return getLnNcitDelyRprnm();
		case 779611098:/* lmtNuseFee */
			return getLmtNuseFee();
		case -1122694562:/* krxcAm */
			return getKrxcAm();
		case -1079984303:/* krxcCancAm */
			return getKrxcCancAm();
		case -980068174:/* prftRt */
			return getPrftRt();
		case -1377321087:/* lstStaxAm2 */
			return getLstStaxAm2();
		case -614510909:/* mvavBuyUp */
			return getMvavBuyUp();
		case -1163334395:/* tetBuyRt */
			return getTetBuyRt();
		case 1787744443:/* trtFndYn */
			return getTrtFndYn();
		case -607536645:/* fractYn */
			return getFractYn();
		case -270814055:/* gTrnDscd */
			return getgTrnDscd();
		case 3326007:/* lnYn */
			return getLnYn();
		case -2135606091:/* dpsApirt */
			return getDpsApirt();
		case -1326901296:/* dntnAm */
			return getDntnAm();
		case 1998401686:/* hmnyAcldAm */
			return getHmnyAcldAm();
		case 778271011:/* ppayIntAm */
			return getPpayIntAm();
		case -1293260740:/* etcTxt */
			return getEtcTxt();
		case 1954282079:/* inqCucd */
			return getInqCucd();
		case -2018781502:/* slchStaxAm */
			return getSlchStaxAm();
		case 1342855534:/* payBasPr */
			return getPayBasPr();
		case -2003299906:/* staxBasPr */
			return getStaxBasPr();
		case 925652228:/* krwXchInciAm */
			return getKrwXchInciAm();
		case -490032169:/* krxcWthdAm */
			return getKrxcWthdAm();
		case 3442504:/* plAm */
			return getPlAm();
		case 583488083:/* cusPrftRt */
			return getCusPrftRt();
		case 2079254874:/* potWthdAm */
			return getPotWthdAm();
		case -1172115245:/* avgXrtIntAm */
			return getAvgXrtIntAm();
		case 877700172:/* cusAplSellXrt */
			return getCusAplSellXrt();
		case -1336637187:/* ddctAm */
			return getDdctAm();
		case -459886542:/* wthdAmSumAm */
			return getWthdAmSumAm();
		case 1716181231:/* bfdnAcmPrftRt */
			return getBfdnAcmPrftRt();
		case 2009584238:/* afdnAcmPrftRt */
			return getAfdnAcmPrftRt();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -345566517:/* tmntFrcsDt */
			setTmntFrcsDt((String)value);
			break;
		case 104712784:/* newDt */
			setNewDt((String)value);
			break;
		case 114270890:/* xprDt */
			setXprDt((String)value);
			break;
		case 446028826:/* cancDisNm */
			setCancDisNm((String)value);
			break;
		case 106938360:/* prnAm */
			if ( value instanceof String ){
				setPrnAm((String)value);
			}
			else if ( value instanceof Double ){
				setPrnAm((Double)value);
			}
			else if ( value instanceof Long ){
				setPrnAm((Long)value);
			}
			else{
				setPrnAm((BigDecimal)value);
			}
			break;
		case -871981406:/* totIntAm */
			if ( value instanceof String ){
				setTotIntAm((String)value);
			}
			else if ( value instanceof Double ){
				setTotIntAm((Double)value);
			}
			else if ( value instanceof Long ){
				setTotIntAm((Long)value);
			}
			else{
				setTotIntAm((BigDecimal)value);
			}
			break;
		case 885522793:/* bscIntAm */
			if ( value instanceof String ){
				setBscIntAm((String)value);
			}
			else if ( value instanceof Double ){
				setBscIntAm((Double)value);
			}
			else if ( value instanceof Long ){
				setBscIntAm((Long)value);
			}
			else{
				setBscIntAm((BigDecimal)value);
			}
			break;
		case 1053703317:/* spclIntAm */
			if ( value instanceof String ){
				setSpclIntAm((String)value);
			}
			else if ( value instanceof Double ){
				setSpclIntAm((Double)value);
			}
			else if ( value instanceof Long ){
				setSpclIntAm((Long)value);
			}
			else{
				setSpclIntAm((BigDecimal)value);
			}
			break;
		case 869435083:/* afepIntAm */
			if ( value instanceof String ){
				setAfepIntAm((String)value);
			}
			else if ( value instanceof Double ){
				setAfepIntAm((Double)value);
			}
			else if ( value instanceof Long ){
				setAfepIntAm((Long)value);
			}
			else{
				setAfepIntAm((BigDecimal)value);
			}
			break;
		case -770840003:/* rstrIctx */
			if ( value instanceof String ){
				setRstrIctx((String)value);
			}
			else if ( value instanceof Double ){
				setRstrIctx((Double)value);
			}
			else if ( value instanceof Long ){
				setRstrIctx((Long)value);
			}
			else{
				setRstrIctx((BigDecimal)value);
			}
			break;
		case -770570923:/* rstrRdtx */
			if ( value instanceof String ){
				setRstrRdtx((String)value);
			}
			else if ( value instanceof Double ){
				setRstrRdtx((Double)value);
			}
			else if ( value instanceof Long ){
				setRstrRdtx((Long)value);
			}
			else{
				setRstrRdtx((BigDecimal)value);
			}
			break;
		case -770527678:/* rstrSrtx */
			if ( value instanceof String ){
				setRstrSrtx((String)value);
			}
			else if ( value instanceof Double ){
				setRstrSrtx((Double)value);
			}
			else if ( value instanceof Long ){
				setRstrSrtx((Long)value);
			}
			else{
				setRstrSrtx((BigDecimal)value);
			}
			break;
		case -290994764:/* impAttxSumAm */
			if ( value instanceof String ){
				setImpAttxSumAm((String)value);
			}
			else if ( value instanceof Double ){
				setImpAttxSumAm((Double)value);
			}
			else if ( value instanceof Long ){
				setImpAttxSumAm((Long)value);
			}
			else{
				setImpAttxSumAm((BigDecimal)value);
			}
			break;
		case 1957214637:/* intIctx */
			if ( value instanceof String ){
				setIntIctx((String)value);
			}
			else if ( value instanceof Double ){
				setIntIctx((Double)value);
			}
			else if ( value instanceof Long ){
				setIntIctx((Long)value);
			}
			else{
				setIntIctx((BigDecimal)value);
			}
			break;
		case -1102256518:/* intIcmRdtx */
			if ( value instanceof String ){
				setIntIcmRdtx((String)value);
			}
			else if ( value instanceof Double ){
				setIntIcmRdtx((Double)value);
			}
			else if ( value instanceof Long ){
				setIntIcmRdtx((Long)value);
			}
			else{
				setIntIcmRdtx((BigDecimal)value);
			}
			break;
		case -1102213273:/* intIcmSrtx */
			if ( value instanceof String ){
				setIntIcmSrtx((String)value);
			}
			else if ( value instanceof Double ){
				setIntIcmSrtx((Double)value);
			}
			else if ( value instanceof Long ){
				setIntIcmSrtx((Long)value);
			}
			else{
				setIntIcmSrtx((BigDecimal)value);
			}
			break;
		case -1355590029:/* cnrnAm */
			if ( value instanceof String ){
				setCnrnAm((String)value);
			}
			else if ( value instanceof Double ){
				setCnrnAm((Double)value);
			}
			else if ( value instanceof Long ){
				setCnrnAm((Long)value);
			}
			else{
				setCnrnAm((BigDecimal)value);
			}
			break;
		case 108781999:/* rrint */
			if ( value instanceof String ){
				setRrint((String)value);
			}
			else if ( value instanceof Double ){
				setRrint((Double)value);
			}
			else if ( value instanceof Long ){
				setRrint((Long)value);
			}
			else{
				setRrint((BigDecimal)value);
			}
			break;
		case -1099668122:/* ddctSumAm */
			if ( value instanceof String ){
				setDdctSumAm((String)value);
			}
			else if ( value instanceof Double ){
				setDdctSumAm((Double)value);
			}
			else if ( value instanceof Long ){
				setDdctSumAm((Long)value);
			}
			else{
				setDdctSumAm((BigDecimal)value);
			}
			break;
		case 169929727:/* dduPayAm */
			if ( value instanceof String ){
				setDduPayAm((String)value);
			}
			else if ( value instanceof Double ){
				setDduPayAm((Double)value);
			}
			else if ( value instanceof Long ){
				setDduPayAm((Long)value);
			}
			else{
				setDduPayAm((BigDecimal)value);
			}
			break;
		case 3107746:/* ectx */
			if ( value instanceof String ){
				setEctx((String)value);
			}
			else if ( value instanceof Double ){
				setEctx((Double)value);
			}
			else if ( value instanceof Long ){
				setEctx((Long)value);
			}
			else{
				setEctx((BigDecimal)value);
			}
			break;
		case 3080838:/* dftx */
			if ( value instanceof String ){
				setDftx((String)value);
			}
			else if ( value instanceof Double ){
				setDftx((Double)value);
			}
			else if ( value instanceof Long ){
				setDftx((Long)value);
			}
			else{
				setDftx((BigDecimal)value);
			}
			break;
		case -918734805:/* rvsnAm */
			if ( value instanceof String ){
				setRvsnAm((String)value);
			}
			else if ( value instanceof Double ){
				setRvsnAm((Double)value);
			}
			else if ( value instanceof Long ){
				setRvsnAm((Long)value);
			}
			else{
				setRvsnAm((BigDecimal)value);
			}
			break;
		case -1441508345:/* slchIntx */
			if ( value instanceof String ){
				setSlchIntx((String)value);
			}
			else if ( value instanceof Double ){
				setSlchIntx((Double)value);
			}
			else if ( value instanceof Long ){
				setSlchIntx((Long)value);
			}
			else{
				setSlchIntx((BigDecimal)value);
			}
			break;
		case -1809435481:/* slchPvnsIctx */
			if ( value instanceof String ){
				setSlchPvnsIctx((String)value);
			}
			else if ( value instanceof Double ){
				setSlchPvnsIctx((Double)value);
			}
			else if ( value instanceof Long ){
				setSlchPvnsIctx((Long)value);
			}
			else{
				setSlchPvnsIctx((BigDecimal)value);
			}
			break;
		case 1359144975:/* paySumAm */
			if ( value instanceof String ){
				setPaySumAm((String)value);
			}
			else if ( value instanceof Double ){
				setPaySumAm((Double)value);
			}
			else if ( value instanceof Long ){
				setPaySumAm((Long)value);
			}
			else{
				setPaySumAm((BigDecimal)value);
			}
			break;
		case -1058811458:/* fcIntAm */
			if ( value instanceof String ){
				setFcIntAm((String)value);
			}
			else if ( value instanceof Double ){
				setFcIntAm((Double)value);
			}
			else if ( value instanceof Long ){
				setFcIntAm((Long)value);
			}
			else{
				setFcIntAm((BigDecimal)value);
			}
			break;
		case -1785724289:/* fcRstrAttxAm */
			if ( value instanceof String ){
				setFcRstrAttxAm((String)value);
			}
			else if ( value instanceof Double ){
				setFcRstrAttxAm((Double)value);
			}
			else if ( value instanceof Long ){
				setFcRstrAttxAm((Long)value);
			}
			else{
				setFcRstrAttxAm((BigDecimal)value);
			}
			break;
		case -107256130:/* fcRrintAm */
			if ( value instanceof String ){
				setFcRrintAm((String)value);
			}
			else if ( value instanceof Double ){
				setFcRrintAm((Double)value);
			}
			else if ( value instanceof Long ){
				setFcRrintAm((Long)value);
			}
			else{
				setFcRrintAm((BigDecimal)value);
			}
			break;
		case -400043214:/* fcImpAttxAm */
			if ( value instanceof String ){
				setFcImpAttxAm((String)value);
			}
			else if ( value instanceof Double ){
				setFcImpAttxAm((Double)value);
			}
			else if ( value instanceof Long ){
				setFcImpAttxAm((Long)value);
			}
			else{
				setFcImpAttxAm((BigDecimal)value);
			}
			break;
		case -1718956103:/* pstmRticmStaxAm */
			if ( value instanceof String ){
				setPstmRticmStaxAm((String)value);
			}
			else if ( value instanceof Double ){
				setPstmRticmStaxAm((Double)value);
			}
			else if ( value instanceof Long ){
				setPstmRticmStaxAm((Long)value);
			}
			else{
				setPstmRticmStaxAm((BigDecimal)value);
			}
			break;
		case 244892019:/* pstmPnsnIctx */
			if ( value instanceof String ){
				setPstmPnsnIctx((String)value);
			}
			else if ( value instanceof Double ){
				setPstmPnsnIctx((Double)value);
			}
			else if ( value instanceof Long ){
				setPstmPnsnIctx((Long)value);
			}
			else{
				setPstmPnsnIctx((BigDecimal)value);
			}
			break;
		case 362013152:/* pstmRticmUsgAm */
			if ( value instanceof String ){
				setPstmRticmUsgAm((String)value);
			}
			else if ( value instanceof Double ){
				setPstmRticmUsgAm((Double)value);
			}
			else if ( value instanceof Long ){
				setPstmRticmUsgAm((Long)value);
			}
			else{
				setPstmRticmUsgAm((BigDecimal)value);
			}
			break;
		case 245161099:/* pstmPnsnRdtx */
			if ( value instanceof String ){
				setPstmPnsnRdtx((String)value);
			}
			else if ( value instanceof Double ){
				setPstmPnsnRdtx((Double)value);
			}
			else if ( value instanceof Long ){
				setPstmPnsnRdtx((Long)value);
			}
			else{
				setPstmPnsnRdtx((BigDecimal)value);
			}
			break;
		case 170207414:/* pstmRticmTax */
			if ( value instanceof String ){
				setPstmRticmTax((String)value);
			}
			else if ( value instanceof Double ){
				setPstmRticmTax((Double)value);
			}
			else if ( value instanceof Long ){
				setPstmRticmTax((Long)value);
			}
			else{
				setPstmRticmTax((BigDecimal)value);
			}
			break;
		case 442781238:/* pstmRtrtRdtx */
			if ( value instanceof String ){
				setPstmRtrtRdtx((String)value);
			}
			else if ( value instanceof Double ){
				setPstmRtrtRdtx((Double)value);
			}
			else if ( value instanceof Long ){
				setPstmRtrtRdtx((Long)value);
			}
			else{
				setPstmRtrtRdtx((BigDecimal)value);
			}
			break;
		case -444892882:/* rtnPocpFee */
			if ( value instanceof String ){
				setRtnPocpFee((String)value);
			}
			else if ( value instanceof Double ){
				setRtnPocpFee((Double)value);
			}
			else if ( value instanceof Long ){
				setRtnPocpFee((Long)value);
			}
			else{
				setRtnPocpFee((BigDecimal)value);
			}
			break;
		case -2031092253:/* etcIcmStaxAm */
			if ( value instanceof String ){
				setEtcIcmStaxAm((String)value);
			}
			else if ( value instanceof Double ){
				setEtcIcmStaxAm((Double)value);
			}
			else if ( value instanceof Long ){
				setEtcIcmStaxAm((Long)value);
			}
			else{
				setEtcIcmStaxAm((BigDecimal)value);
			}
			break;
		case 941230794:/* staxHovMnuAdj */
			if ( value instanceof String ){
				setStaxHovMnuAdj((String)value);
			}
			else if ( value instanceof Double ){
				setStaxHovMnuAdj((Double)value);
			}
			else if ( value instanceof Long ){
				setStaxHovMnuAdj((Long)value);
			}
			else{
				setStaxHovMnuAdj((BigDecimal)value);
			}
			break;
		case -1036029929:/* feeStaxDdu */
			if ( value instanceof String ){
				setFeeStaxDdu((String)value);
			}
			else if ( value instanceof Double ){
				setFeeStaxDdu((Double)value);
			}
			else if ( value instanceof Long ){
				setFeeStaxDdu((Long)value);
			}
			else{
				setFeeStaxDdu((BigDecimal)value);
			}
			break;
		case 1487588177:/* usumEvlAm */
			if ( value instanceof String ){
				setUsumEvlAm((String)value);
			}
			else if ( value instanceof Double ){
				setUsumEvlAm((Double)value);
			}
			else if ( value instanceof Long ){
				setUsumEvlAm((Long)value);
			}
			else{
				setUsumEvlAm((BigDecimal)value);
			}
			break;
		case -1069843931:/* moAcno */
			setMoAcno((String)value);
			break;
		case 746143842:/* frgStcLossOfst */
			if ( value instanceof String ){
				setFrgStcLossOfst((String)value);
			}
			else if ( value instanceof Double ){
				setFrgStcLossOfst((Double)value);
			}
			else if ( value instanceof Long ){
				setFrgStcLossOfst((Long)value);
			}
			else{
				setFrgStcLossOfst((BigDecimal)value);
			}
			break;
		case -1221291494:/* staxDduTcmPfeAm */
			if ( value instanceof String ){
				setStaxDduTcmPfeAm((String)value);
			}
			else if ( value instanceof Double ){
				setStaxDduTcmPfeAm((Double)value);
			}
			else if ( value instanceof Long ){
				setStaxDduTcmPfeAm((Long)value);
			}
			else{
				setStaxDduTcmPfeAm((BigDecimal)value);
			}
			break;
		case -1014261039:/* lstStaxAm */
			if ( value instanceof String ){
				setLstStaxAm((String)value);
			}
			else if ( value instanceof Double ){
				setLstStaxAm((Double)value);
			}
			else if ( value instanceof Long ){
				setLstStaxAm((Long)value);
			}
			else{
				setLstStaxAm((BigDecimal)value);
			}
			break;
		case 817887784:/* smplPrftRt */
			if ( value instanceof String ){
				setSmplPrftRt((String)value);
			}
			else if ( value instanceof Double ){
				setSmplPrftRt((Double)value);
			}
			else if ( value instanceof Long ){
				setSmplPrftRt((Long)value);
			}
			else{
				setSmplPrftRt((BigDecimal)value);
			}
			break;
		case 738317310:/* hcanFee */
			if ( value instanceof String ){
				setHcanFee((String)value);
			}
			else if ( value instanceof Double ){
				setHcanFee((Double)value);
			}
			else if ( value instanceof Long ){
				setHcanFee((Long)value);
			}
			else{
				setHcanFee((BigDecimal)value);
			}
			break;
		case 1136149834:/* yrXcPtrt */
			if ( value instanceof String ){
				setYrXcPtrt((String)value);
			}
			else if ( value instanceof Double ){
				setYrXcPtrt((Double)value);
			}
			else if ( value instanceof Long ){
				setYrXcPtrt((Long)value);
			}
			else{
				setYrXcPtrt((BigDecimal)value);
			}
			break;
		case -1436725038:/* etcIctx */
			if ( value instanceof String ){
				setEtcIctx((String)value);
			}
			else if ( value instanceof Double ){
				setEtcIctx((Double)value);
			}
			else if ( value instanceof Long ){
				setEtcIctx((Long)value);
			}
			else{
				setEtcIctx((BigDecimal)value);
			}
			break;
		case -1436455958:/* etcRdtx */
			if ( value instanceof String ){
				setEtcRdtx((String)value);
			}
			else if ( value instanceof Double ){
				setEtcRdtx((Double)value);
			}
			else if ( value instanceof Long ){
				setEtcRdtx((Long)value);
			}
			else{
				setEtcRdtx((BigDecimal)value);
			}
			break;
		case -136367721:/* pnsnIctx */
			if ( value instanceof String ){
				setPnsnIctx((String)value);
			}
			else if ( value instanceof Double ){
				setPnsnIctx((Double)value);
			}
			else if ( value instanceof Long ){
				setPnsnIctx((Long)value);
			}
			else{
				setPnsnIctx((BigDecimal)value);
			}
			break;
		case 1695307266:/* pnsnPvnsIctx */
			if ( value instanceof String ){
				setPnsnPvnsIctx((String)value);
			}
			else if ( value instanceof Double ){
				setPnsnPvnsIctx((Double)value);
			}
			else if ( value instanceof Long ){
				setPnsnPvnsIctx((Long)value);
			}
			else{
				setPnsnPvnsIctx((BigDecimal)value);
			}
			break;
		case 264556606:/* pnsnIcmStaxAm */
			if ( value instanceof String ){
				setPnsnIcmStaxAm((String)value);
			}
			else if ( value instanceof Double ){
				setPnsnIcmStaxAm((Double)value);
			}
			else if ( value instanceof Long ){
				setPnsnIcmStaxAm((Long)value);
			}
			else{
				setPnsnIcmStaxAm((BigDecimal)value);
			}
			break;
		case 93135958:/* atcnt */
			if ( value instanceof String ){
				setAtcnt((String)value);
			}
			else if ( value instanceof Double ){
				setAtcnt((Double)value);
			}
			else if ( value instanceof Long ){
				setAtcnt((Long)value);
			}
			else{
				setAtcnt((BigDecimal)value);
			}
			break;
		case -316251236:/* ctrmvFee */
			if ( value instanceof String ){
				setCtrmvFee((String)value);
			}
			else if ( value instanceof Double ){
				setCtrmvFee((Double)value);
			}
			else if ( value instanceof Long ){
				setCtrmvFee((Long)value);
			}
			else{
				setCtrmvFee((BigDecimal)value);
			}
			break;
		case 315716665:/* lnintAm */
			if ( value instanceof String ){
				setLnintAm((String)value);
			}
			else if ( value instanceof Double ){
				setLnintAm((Double)value);
			}
			else if ( value instanceof Long ){
				setLnintAm((Long)value);
			}
			else{
				setLnintAm((BigDecimal)value);
			}
			break;
		case -1274433579:/* fintAm */
			if ( value instanceof String ){
				setFintAm((String)value);
			}
			else if ( value instanceof Double ){
				setFintAm((Double)value);
			}
			else if ( value instanceof Long ){
				setFintAm((Long)value);
			}
			else{
				setFintAm((BigDecimal)value);
			}
			break;
		case -182486309:/* lnPrnDelyRprnm */
			if ( value instanceof String ){
				setLnPrnDelyRprnm((String)value);
			}
			else if ( value instanceof Double ){
				setLnPrnDelyRprnm((Double)value);
			}
			else if ( value instanceof Long ){
				setLnPrnDelyRprnm((Long)value);
			}
			else{
				setLnPrnDelyRprnm((BigDecimal)value);
			}
			break;
		case 675474908:/* dpacLnNcitAm */
			if ( value instanceof String ){
				setDpacLnNcitAm((String)value);
			}
			else if ( value instanceof Double ){
				setDpacLnNcitAm((Double)value);
			}
			else if ( value instanceof Long ){
				setDpacLnNcitAm((Long)value);
			}
			else{
				setDpacLnNcitAm((BigDecimal)value);
			}
			break;
		case -521620125:/* lnNcitDelyRprnm */
			if ( value instanceof String ){
				setLnNcitDelyRprnm((String)value);
			}
			else if ( value instanceof Double ){
				setLnNcitDelyRprnm((Double)value);
			}
			else if ( value instanceof Long ){
				setLnNcitDelyRprnm((Long)value);
			}
			else{
				setLnNcitDelyRprnm((BigDecimal)value);
			}
			break;
		case 779611098:/* lmtNuseFee */
			if ( value instanceof String ){
				setLmtNuseFee((String)value);
			}
			else if ( value instanceof Double ){
				setLmtNuseFee((Double)value);
			}
			else if ( value instanceof Long ){
				setLmtNuseFee((Long)value);
			}
			else{
				setLmtNuseFee((BigDecimal)value);
			}
			break;
		case -1122694562:/* krxcAm */
			if ( value instanceof String ){
				setKrxcAm((String)value);
			}
			else if ( value instanceof Double ){
				setKrxcAm((Double)value);
			}
			else if ( value instanceof Long ){
				setKrxcAm((Long)value);
			}
			else{
				setKrxcAm((BigDecimal)value);
			}
			break;
		case -1079984303:/* krxcCancAm */
			if ( value instanceof String ){
				setKrxcCancAm((String)value);
			}
			else if ( value instanceof Double ){
				setKrxcCancAm((Double)value);
			}
			else if ( value instanceof Long ){
				setKrxcCancAm((Long)value);
			}
			else{
				setKrxcCancAm((BigDecimal)value);
			}
			break;
		case -980068174:/* prftRt */
			if ( value instanceof String ){
				setPrftRt((String)value);
			}
			else if ( value instanceof Double ){
				setPrftRt((Double)value);
			}
			else if ( value instanceof Long ){
				setPrftRt((Long)value);
			}
			else{
				setPrftRt((BigDecimal)value);
			}
			break;
		case -1377321087:/* lstStaxAm2 */
			if ( value instanceof String ){
				setLstStaxAm2((String)value);
			}
			else if ( value instanceof Double ){
				setLstStaxAm2((Double)value);
			}
			else if ( value instanceof Long ){
				setLstStaxAm2((Long)value);
			}
			else{
				setLstStaxAm2((BigDecimal)value);
			}
			break;
		case -614510909:/* mvavBuyUp */
			if ( value instanceof String ){
				setMvavBuyUp((String)value);
			}
			else if ( value instanceof Double ){
				setMvavBuyUp((Double)value);
			}
			else if ( value instanceof Long ){
				setMvavBuyUp((Long)value);
			}
			else{
				setMvavBuyUp((BigDecimal)value);
			}
			break;
		case -1163334395:/* tetBuyRt */
			if ( value instanceof String ){
				setTetBuyRt((String)value);
			}
			else if ( value instanceof Double ){
				setTetBuyRt((Double)value);
			}
			else if ( value instanceof Long ){
				setTetBuyRt((Long)value);
			}
			else{
				setTetBuyRt((BigDecimal)value);
			}
			break;
		case 1787744443:/* trtFndYn */
			setTrtFndYn((String)value);
			break;
		case -607536645:/* fractYn */
			setFractYn((String)value);
			break;
		case -270814055:/* gTrnDscd */
			setgTrnDscd((String)value);
			break;
		case 3326007:/* lnYn */
			setLnYn((String)value);
			break;
		case -2135606091:/* dpsApirt */
			if ( value instanceof String ){
				setDpsApirt((String)value);
			}
			else if ( value instanceof Double ){
				setDpsApirt((Double)value);
			}
			else if ( value instanceof Long ){
				setDpsApirt((Long)value);
			}
			else{
				setDpsApirt((BigDecimal)value);
			}
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
		case 1998401686:/* hmnyAcldAm */
			if ( value instanceof String ){
				setHmnyAcldAm((String)value);
			}
			else if ( value instanceof Double ){
				setHmnyAcldAm((Double)value);
			}
			else if ( value instanceof Long ){
				setHmnyAcldAm((Long)value);
			}
			else{
				setHmnyAcldAm((BigDecimal)value);
			}
			break;
		case 778271011:/* ppayIntAm */
			if ( value instanceof String ){
				setPpayIntAm((String)value);
			}
			else if ( value instanceof Double ){
				setPpayIntAm((Double)value);
			}
			else if ( value instanceof Long ){
				setPpayIntAm((Long)value);
			}
			else{
				setPpayIntAm((BigDecimal)value);
			}
			break;
		case -1293260740:/* etcTxt */
			setEtcTxt((String)value);
			break;
		case 1954282079:/* inqCucd */
			setInqCucd((String)value);
			break;
		case -2018781502:/* slchStaxAm */
			if ( value instanceof String ){
				setSlchStaxAm((String)value);
			}
			else if ( value instanceof Double ){
				setSlchStaxAm((Double)value);
			}
			else if ( value instanceof Long ){
				setSlchStaxAm((Long)value);
			}
			else{
				setSlchStaxAm((BigDecimal)value);
			}
			break;
		case 1342855534:/* payBasPr */
			if ( value instanceof String ){
				setPayBasPr((String)value);
			}
			else if ( value instanceof Double ){
				setPayBasPr((Double)value);
			}
			else if ( value instanceof Long ){
				setPayBasPr((Long)value);
			}
			else{
				setPayBasPr((BigDecimal)value);
			}
			break;
		case -2003299906:/* staxBasPr */
			if ( value instanceof String ){
				setStaxBasPr((String)value);
			}
			else if ( value instanceof Double ){
				setStaxBasPr((Double)value);
			}
			else if ( value instanceof Long ){
				setStaxBasPr((Long)value);
			}
			else{
				setStaxBasPr((BigDecimal)value);
			}
			break;
		case 925652228:/* krwXchInciAm */
			if ( value instanceof String ){
				setKrwXchInciAm((String)value);
			}
			else if ( value instanceof Double ){
				setKrwXchInciAm((Double)value);
			}
			else if ( value instanceof Long ){
				setKrwXchInciAm((Long)value);
			}
			else{
				setKrwXchInciAm((BigDecimal)value);
			}
			break;
		case -490032169:/* krxcWthdAm */
			if ( value instanceof String ){
				setKrxcWthdAm((String)value);
			}
			else if ( value instanceof Double ){
				setKrxcWthdAm((Double)value);
			}
			else if ( value instanceof Long ){
				setKrxcWthdAm((Long)value);
			}
			else{
				setKrxcWthdAm((BigDecimal)value);
			}
			break;
		case 3442504:/* plAm */
			if ( value instanceof String ){
				setPlAm((String)value);
			}
			else if ( value instanceof Double ){
				setPlAm((Double)value);
			}
			else if ( value instanceof Long ){
				setPlAm((Long)value);
			}
			else{
				setPlAm((BigDecimal)value);
			}
			break;
		case 583488083:/* cusPrftRt */
			if ( value instanceof String ){
				setCusPrftRt((String)value);
			}
			else if ( value instanceof Double ){
				setCusPrftRt((Double)value);
			}
			else if ( value instanceof Long ){
				setCusPrftRt((Long)value);
			}
			else{
				setCusPrftRt((BigDecimal)value);
			}
			break;
		case 2079254874:/* potWthdAm */
			if ( value instanceof String ){
				setPotWthdAm((String)value);
			}
			else if ( value instanceof Double ){
				setPotWthdAm((Double)value);
			}
			else if ( value instanceof Long ){
				setPotWthdAm((Long)value);
			}
			else{
				setPotWthdAm((BigDecimal)value);
			}
			break;
		case -1172115245:/* avgXrtIntAm */
			if ( value instanceof String ){
				setAvgXrtIntAm((String)value);
			}
			else if ( value instanceof Double ){
				setAvgXrtIntAm((Double)value);
			}
			else if ( value instanceof Long ){
				setAvgXrtIntAm((Long)value);
			}
			else{
				setAvgXrtIntAm((BigDecimal)value);
			}
			break;
		case 877700172:/* cusAplSellXrt */
			if ( value instanceof String ){
				setCusAplSellXrt((String)value);
			}
			else if ( value instanceof Double ){
				setCusAplSellXrt((Double)value);
			}
			else if ( value instanceof Long ){
				setCusAplSellXrt((Long)value);
			}
			else{
				setCusAplSellXrt((BigDecimal)value);
			}
			break;
		case -1336637187:/* ddctAm */
			if ( value instanceof String ){
				setDdctAm((String)value);
			}
			else if ( value instanceof Double ){
				setDdctAm((Double)value);
			}
			else if ( value instanceof Long ){
				setDdctAm((Long)value);
			}
			else{
				setDdctAm((BigDecimal)value);
			}
			break;
		case -459886542:/* wthdAmSumAm */
			if ( value instanceof String ){
				setWthdAmSumAm((String)value);
			}
			else if ( value instanceof Double ){
				setWthdAmSumAm((Double)value);
			}
			else if ( value instanceof Long ){
				setWthdAmSumAm((Long)value);
			}
			else{
				setWthdAmSumAm((BigDecimal)value);
			}
			break;
		case 1716181231:/* bfdnAcmPrftRt */
			if ( value instanceof String ){
				setBfdnAcmPrftRt((String)value);
			}
			else if ( value instanceof Double ){
				setBfdnAcmPrftRt((Double)value);
			}
			else if ( value instanceof Long ){
				setBfdnAcmPrftRt((Long)value);
			}
			else{
				setBfdnAcmPrftRt((BigDecimal)value);
			}
			break;
		case 2009584238:/* afdnAcmPrftRt */
			if ( value instanceof String ){
				setAfdnAcmPrftRt((String)value);
			}
			else if ( value instanceof Double ){
				setAfdnAcmPrftRt((Double)value);
			}
			else if ( value instanceof Long ){
				setAfdnAcmPrftRt((Long)value);
			}
			else{
				setAfdnAcmPrftRt((BigDecimal)value);
			}
			break;
		default:
			break;
		}
	}
	
}
