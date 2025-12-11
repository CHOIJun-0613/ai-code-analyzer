/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.mnp.ctr.dto;

import bxm.common.annotaion.BxmCategory;
import bxm.omm.annotation.BxmOmm_Field;
import bxm.omm.exception.CloneFailedException;
import bxm.omm.predict.FieldInfo;
import bxm.omm.predict.Predictable;
import bxm.omm.root.IOmmObject;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.skbank.sml.fns.mnp.dto.MNPMnyPinFncTrnSelectTrnPrts_DTO;
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
	"fstNewRcknDt", "nsnctPrchPvdt", "nsnctCackPvdt", "payAvlAm", "nsnctBchkPvdt", "cnrnRgsYn", "owacFnm", "pdcd", "nsnctEtcObcPvdt", "cusUsgAcno", "synpbPdcd", "newRcknDt", "cnsgComNm", "ctBal", "acno"
	, "adntYn", "nsnctBokBchkPvdt", "lstTrnDt", "nsnctPmbilPvdt", "inqAcno", "psklEpdt", "actMngBrcd", "pbokLnlmAm", "nxtPidDt", "nstlObcAm", "totBal", "paySumAm", "rcvSumAm", "totSumAm", "pdcdNm"
	, "pageUsgYn", "nxtPageYn", "totCnt", "totPage", "pageNo", "inqStaNo", "inqCnt", "srchKrd", "minAm", "maxAm", "grid"
}, name="MNPMnyPinWallMngSelectWallTrnPrts_ODT")
@XmlRootElement(name="MNPMnyPinWallMngSelectWallTrnPrts_ODT")
@BxmCategory(logicalName="머니클립금고거래내역조회.컨트롤러.출력.IO", description="") 
public class MNPMnyPinWallMngSelectWallTrnPrts_ODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 285018384L;
	
	
	
	/**
	 * 최초신규기산일자
	 */
	@ApiModelProperty(
		name = "fstNewRcknDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("fstNewRcknDt")
	@BxmOmm_Field(length=8, decimal=0, description="최초신규기산일자", align="left", fill="")
	private String fstNewRcknDt= "";
	
	
	/**
	 * 미결재가계수표전일
	 */
	@ApiModelProperty(
		name = "nsnctPrchPvdt"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("nsnctPrchPvdt")
	@BxmOmm_Field(length=19, decimal=3, description="미결재가계수표전일", align="right", fill="")
	private BigDecimal nsnctPrchPvdt= new BigDecimal("0");
	
	
	/**
	 * 미결재당좌수표전일
	 */
	@ApiModelProperty(
		name = "nsnctCackPvdt"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("nsnctCackPvdt")
	@BxmOmm_Field(length=19, decimal=3, description="미결재당좌수표전일", align="right", fill="")
	private BigDecimal nsnctCackPvdt= new BigDecimal("0");
	
	
	/**
	 * 지급가능금액
	 */
	@ApiModelProperty(
		name = "payAvlAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("payAvlAm")
	@BxmOmm_Field(length=19, decimal=3, description="지급가능금액", align="right", fill="")
	private BigDecimal payAvlAm= new BigDecimal("0");
	
	
	/**
	 * 미결재자기앞수표전일
	 */
	@ApiModelProperty(
		name = "nsnctBchkPvdt"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("nsnctBchkPvdt")
	@BxmOmm_Field(length=19, decimal=3, description="미결재자기앞수표전일", align="right", fill="")
	private BigDecimal nsnctBchkPvdt= new BigDecimal("0");
	
	
	/**
	 * 출연등록여부
	 */
	@ApiModelProperty(
		name = "cnrnRgsYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("cnrnRgsYn")
	@BxmOmm_Field(length=1, decimal=0, description="출연등록여부", align="left", fill="")
	private String cnrnRgsYn= "";
	
	
	/**
	 * 예금주성명
	 */
	@ApiModelProperty(
		name = "owacFnm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("owacFnm")
	@BxmOmm_Field(length=50, decimal=0, description="예금주성명", align="left", fill="")
	private String owacFnm= "";
	
	
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
	 * 미결재기타타점권전일
	 */
	@ApiModelProperty(
		name = "nsnctEtcObcPvdt"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("nsnctEtcObcPvdt")
	@BxmOmm_Field(length=19, decimal=3, description="미결재기타타점권전일", align="right", fill="")
	private BigDecimal nsnctEtcObcPvdt= new BigDecimal("0");
	
	
	/**
	 * 고객사용계좌번호
	 */
	@ApiModelProperty(
		name = "cusUsgAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("cusUsgAcno")
	@BxmOmm_Field(length=20, decimal=0, description="고객사용계좌번호", align="left", fill="")
	private String cusUsgAcno= "";
	
	
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
	 * 신규기산일자
	 */
	@ApiModelProperty(
		name = "newRcknDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("newRcknDt")
	@BxmOmm_Field(length=8, decimal=0, description="신규기산일자", align="left", fill="")
	private String newRcknDt= "";
	
	
	/**
	 * 위탁회사명
	 */
	@ApiModelProperty(
		name = "cnsgComNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("cnsgComNm")
	@BxmOmm_Field(length=50, decimal=0, description="위탁회사명", align="left", fill="")
	private String cnsgComNm= "";
	
	
	/**
	 * 현재잔액
	 */
	@ApiModelProperty(
		name = "ctBal"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("ctBal")
	@BxmOmm_Field(length=19, decimal=3, description="현재잔액", align="right", fill="")
	private BigDecimal ctBal= new BigDecimal("0");
	
	
	/**
	 * 계좌번호
	 */
	@ApiModelProperty(
		name = "acno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("acno")
	@BxmOmm_Field(length=13, decimal=0, description="계좌번호", align="left", fill="", etcProperties={"PROP_OPTION_DSCD=L999"})
	private String acno= "";
	
	
	/**
	 * 사고여부
	 */
	@ApiModelProperty(
		name = "adntYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("adntYn")
	@BxmOmm_Field(length=40, decimal=0, description="사고여부", align="left", fill="")
	private String adntYn= "";
	
	
	/**
	 * 미결재한국은행자기앞수표전일
	 */
	@ApiModelProperty(
		name = "nsnctBokBchkPvdt"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("nsnctBokBchkPvdt")
	@BxmOmm_Field(length=19, decimal=3, description="미결재한국은행자기앞수표전일", align="right", fill="")
	private BigDecimal nsnctBokBchkPvdt= new BigDecimal("0");
	
	
	/**
	 * 최종거래일자
	 */
	@ApiModelProperty(
		name = "lstTrnDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("lstTrnDt")
	@BxmOmm_Field(length=8, decimal=0, description="최종거래일자", align="left", fill="")
	private String lstTrnDt= "";
	
	
	/**
	 * 미결재약속어음전일
	 */
	@ApiModelProperty(
		name = "nsnctPmbilPvdt"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("nsnctPmbilPvdt")
	@BxmOmm_Field(length=19, decimal=3, description="미결재약속어음전일", align="right", fill="")
	private BigDecimal nsnctPmbilPvdt= new BigDecimal("0");
	
	
	/**
	 * 조회계좌번호
	 */
	@ApiModelProperty(
		name = "inqAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("inqAcno")
	@BxmOmm_Field(length=15, decimal=0, description="조회계좌번호", align="left", fill="")
	private String inqAcno= "";
	
	
	/**
	 * 통장대출만기일
	 */
	@ApiModelProperty(
		name = "psklEpdt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("psklEpdt")
	@BxmOmm_Field(length=20, decimal=0, description="통장대출만기일", align="left", fill="")
	private String psklEpdt= "";
	
	
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
	 * 통장대출한도금액
	 */
	@ApiModelProperty(
		name = "pbokLnlmAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("pbokLnlmAm")
	@BxmOmm_Field(length=19, decimal=3, description="통장대출한도금액", align="right", fill="")
	private BigDecimal pbokLnlmAm= new BigDecimal("0");
	
	
	/**
	 * 다음납입일자
	 */
	@ApiModelProperty(
		name = "nxtPidDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("nxtPidDt")
	@BxmOmm_Field(length=8, decimal=0, description="다음납입일자", align="left", fill="")
	private String nxtPidDt= "";
	
	
	/**
	 * 미결제타점권금액
	 */
	@ApiModelProperty(
		name = "nstlObcAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("nstlObcAm")
	@BxmOmm_Field(length=19, decimal=3, description="미결제타점권금액", align="right", fill="")
	private BigDecimal nstlObcAm= new BigDecimal("0");
	
	
	/**
	 * 총잔액
	 */
	@ApiModelProperty(
		name = "totBal"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("totBal")
	@BxmOmm_Field(length=19, decimal=3, description="총잔액", align="right", fill="")
	private BigDecimal totBal= new BigDecimal("0");
	
	
	/**
	 * 지급합계금액
	 */
	@ApiModelProperty(
		name = "paySumAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("paySumAm")
	@BxmOmm_Field(length=16, decimal=0, description="지급합계금액", align="right", fill="")
	private BigDecimal paySumAm= new BigDecimal("0");
	
	
	/**
	 * 입금합계금액
	 */
	@ApiModelProperty(
		name = "rcvSumAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("rcvSumAm")
	@BxmOmm_Field(length=16, decimal=0, description="입금합계금액", align="right", fill="")
	private BigDecimal rcvSumAm= new BigDecimal("0");
	
	
	/**
	 * 총합계금액
	 */
	@ApiModelProperty(
		name = "totSumAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("totSumAm")
	@BxmOmm_Field(length=16, decimal=0, description="총합계금액", align="right", fill="")
	private BigDecimal totSumAm= new BigDecimal("0");
	
	
	/**
	 * 상품코드명
	 */
	@ApiModelProperty(
		name = "pdcdNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("pdcdNm")
	@BxmOmm_Field(length=100, decimal=0, description="상품코드명", align="left", fill="")
	private String pdcdNm= "";
	
	
	/**
	 * 페이지사용여부
	 */
	@ApiModelProperty(
		name = "pageUsgYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("pageUsgYn")
	@BxmOmm_Field(length=1, decimal=0, description="페이지사용여부", align="left", fill="")
	private String pageUsgYn= "";
	
	
	/**
	 * 다음페이지여부
	 */
	@ApiModelProperty(
		name = "nxtPageYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("nxtPageYn")
	@BxmOmm_Field(length=1, decimal=0, description="다음페이지여부", align="left", fill="")
	private String nxtPageYn= "";
	
	
	/**
	 * 총건수
	 */
	@ApiModelProperty(
		name = "totCnt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("totCnt")
	@BxmOmm_Field(length=6, decimal=0, description="총건수", align="left", fill="")
	private String totCnt= "";
	
	
	/**
	 * 총페이지
	 */
	@ApiModelProperty(
		name = "totPage"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("totPage")
	@BxmOmm_Field(length=6, decimal=0, description="총페이지", align="left", fill="")
	private String totPage= "";
	
	
	/**
	 * 페이지번호
	 */
	@ApiModelProperty(
		name = "pageNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("pageNo")
	@BxmOmm_Field(length=6, decimal=0, description="페이지번호", align="left", fill="")
	private String pageNo= "";
	
	
	/**
	 * 조회시작번호
	 */
	@ApiModelProperty(
		name = "inqStaNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("inqStaNo")
	@BxmOmm_Field(length=6, decimal=0, description="조회시작번호", align="left", fill="")
	private String inqStaNo= "";
	
	
	/**
	 * 조회건수
	 */
	@ApiModelProperty(
		name = "inqCnt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("inqCnt")
	@BxmOmm_Field(length=6, decimal=0, description="조회건수", align="left", fill="")
	private String inqCnt= "";
	
	
	/**
	 * 검색키워드
	 */
	@ApiModelProperty(
		name = "srchKrd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("srchKrd")
	@BxmOmm_Field(length=100, decimal=0, description="검색키워드", align="left", fill="")
	private String srchKrd= "";
	
	
	/**
	 * 최소금액
	 */
	@ApiModelProperty(
		name = "minAm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("minAm")
	@BxmOmm_Field(length=16, decimal=0, description="최소금액", align="left", fill="")
	private String minAm= "";
	
	
	/**
	 * 최대금액
	 */
	@ApiModelProperty(
		name = "maxAm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("maxAm")
	@BxmOmm_Field(length=16, decimal=0, description="최대금액", align="left", fill="")
	private String maxAm= "";
	
	
	/**
	 * 머니클립거래내역조회.공통.출력.IO
	 */
	@ApiModelProperty(
		name = "grid"
		, dataType = "[Lcom.skbank.sml.fns.mnp.dto.MNPMnyPinFncTrnSelectTrnPrts_DTO;"
		)
	@XmlElement(name="item")
	@XmlElementWrapper()
	@JsonProperty("grid")
	@BxmOmm_Field(length=0, decimal=0, description="머니클립거래내역조회.공통.출력.IO", align="left", fill="", arrayReference="1")
	private List<MNPMnyPinFncTrnSelectTrnPrts_DTO> grid= new ArrayList<>();
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_fstNewRcknDt= false;
	protected final boolean isSet_fstNewRcknDt(){
		return this.isSet_fstNewRcknDt;
	}
	private void setIsSet_fstNewRcknDt(boolean value){
		this.isSet_fstNewRcknDt= value;
	}
	/**
	 * 최초신규기산일자
	 */
	@XmlTransient
	public String getFstNewRcknDt(){
		return this.fstNewRcknDt;
	}
	
	/**
	 * 최초신규기산일자
	 * 
	 * @param fstNewRcknDt 최초신규기산일자
	 */
	public void setFstNewRcknDt(String fstNewRcknDt){
		this.fstNewRcknDt= fstNewRcknDt;
		this.setIsSet_fstNewRcknDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_nsnctPrchPvdt= false;
	protected final boolean isSet_nsnctPrchPvdt(){
		return this.isSet_nsnctPrchPvdt;
	}
	private void setIsSet_nsnctPrchPvdt(boolean value){
		this.isSet_nsnctPrchPvdt= value;
	}
	/**
	 * 미결재가계수표전일
	 * BigDecimal - Double value setter
	 *
	 * @Param nsnctPrchPvdt 미결재가계수표전일
	 */
	public void setNsnctPrchPvdt(double nsnctPrchPvdt) {
		setNsnctPrchPvdt(BigDecimal.valueOf(nsnctPrchPvdt));
	}
	/**
	 * 미결재가계수표전일
	 * BigDecimal - Long value setter
	 *
	 * @Param nsnctPrchPvdt 미결재가계수표전일
	 */
	public void setNsnctPrchPvdt(long nsnctPrchPvdt) {
		setNsnctPrchPvdt(BigDecimal.valueOf(nsnctPrchPvdt));
	}
	/**
	 * 미결재가계수표전일
	 * BigDecimal - String value setter
	 *
	 * @Param nsnctPrchPvdt 미결재가계수표전일
	 */
	public void setNsnctPrchPvdt(String nsnctPrchPvdt) {
		setNsnctPrchPvdt(new BigDecimal(nsnctPrchPvdt));
	}
	/**
	 * 미결재가계수표전일
	 */
	@XmlTransient
	public BigDecimal getNsnctPrchPvdt(){
		return this.nsnctPrchPvdt;
	}
	
	/**
	 * 미결재가계수표전일
	 * 
	 * @param nsnctPrchPvdt 미결재가계수표전일
	 */
	@JsonSetter("nsnctPrchPvdt")
	public void setNsnctPrchPvdt(BigDecimal nsnctPrchPvdt){
		this.nsnctPrchPvdt= nsnctPrchPvdt;
		this.setIsSet_nsnctPrchPvdt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_nsnctCackPvdt= false;
	protected final boolean isSet_nsnctCackPvdt(){
		return this.isSet_nsnctCackPvdt;
	}
	private void setIsSet_nsnctCackPvdt(boolean value){
		this.isSet_nsnctCackPvdt= value;
	}
	/**
	 * 미결재당좌수표전일
	 * BigDecimal - Double value setter
	 *
	 * @Param nsnctCackPvdt 미결재당좌수표전일
	 */
	public void setNsnctCackPvdt(double nsnctCackPvdt) {
		setNsnctCackPvdt(BigDecimal.valueOf(nsnctCackPvdt));
	}
	/**
	 * 미결재당좌수표전일
	 * BigDecimal - Long value setter
	 *
	 * @Param nsnctCackPvdt 미결재당좌수표전일
	 */
	public void setNsnctCackPvdt(long nsnctCackPvdt) {
		setNsnctCackPvdt(BigDecimal.valueOf(nsnctCackPvdt));
	}
	/**
	 * 미결재당좌수표전일
	 * BigDecimal - String value setter
	 *
	 * @Param nsnctCackPvdt 미결재당좌수표전일
	 */
	public void setNsnctCackPvdt(String nsnctCackPvdt) {
		setNsnctCackPvdt(new BigDecimal(nsnctCackPvdt));
	}
	/**
	 * 미결재당좌수표전일
	 */
	@XmlTransient
	public BigDecimal getNsnctCackPvdt(){
		return this.nsnctCackPvdt;
	}
	
	/**
	 * 미결재당좌수표전일
	 * 
	 * @param nsnctCackPvdt 미결재당좌수표전일
	 */
	@JsonSetter("nsnctCackPvdt")
	public void setNsnctCackPvdt(BigDecimal nsnctCackPvdt){
		this.nsnctCackPvdt= nsnctCackPvdt;
		this.setIsSet_nsnctCackPvdt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_payAvlAm= false;
	protected final boolean isSet_payAvlAm(){
		return this.isSet_payAvlAm;
	}
	private void setIsSet_payAvlAm(boolean value){
		this.isSet_payAvlAm= value;
	}
	/**
	 * 지급가능금액
	 * BigDecimal - Double value setter
	 *
	 * @Param payAvlAm 지급가능금액
	 */
	public void setPayAvlAm(double payAvlAm) {
		setPayAvlAm(BigDecimal.valueOf(payAvlAm));
	}
	/**
	 * 지급가능금액
	 * BigDecimal - Long value setter
	 *
	 * @Param payAvlAm 지급가능금액
	 */
	public void setPayAvlAm(long payAvlAm) {
		setPayAvlAm(BigDecimal.valueOf(payAvlAm));
	}
	/**
	 * 지급가능금액
	 * BigDecimal - String value setter
	 *
	 * @Param payAvlAm 지급가능금액
	 */
	public void setPayAvlAm(String payAvlAm) {
		setPayAvlAm(new BigDecimal(payAvlAm));
	}
	/**
	 * 지급가능금액
	 */
	@XmlTransient
	public BigDecimal getPayAvlAm(){
		return this.payAvlAm;
	}
	
	/**
	 * 지급가능금액
	 * 
	 * @param payAvlAm 지급가능금액
	 */
	@JsonSetter("payAvlAm")
	public void setPayAvlAm(BigDecimal payAvlAm){
		this.payAvlAm= payAvlAm;
		this.setIsSet_payAvlAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_nsnctBchkPvdt= false;
	protected final boolean isSet_nsnctBchkPvdt(){
		return this.isSet_nsnctBchkPvdt;
	}
	private void setIsSet_nsnctBchkPvdt(boolean value){
		this.isSet_nsnctBchkPvdt= value;
	}
	/**
	 * 미결재자기앞수표전일
	 * BigDecimal - Double value setter
	 *
	 * @Param nsnctBchkPvdt 미결재자기앞수표전일
	 */
	public void setNsnctBchkPvdt(double nsnctBchkPvdt) {
		setNsnctBchkPvdt(BigDecimal.valueOf(nsnctBchkPvdt));
	}
	/**
	 * 미결재자기앞수표전일
	 * BigDecimal - Long value setter
	 *
	 * @Param nsnctBchkPvdt 미결재자기앞수표전일
	 */
	public void setNsnctBchkPvdt(long nsnctBchkPvdt) {
		setNsnctBchkPvdt(BigDecimal.valueOf(nsnctBchkPvdt));
	}
	/**
	 * 미결재자기앞수표전일
	 * BigDecimal - String value setter
	 *
	 * @Param nsnctBchkPvdt 미결재자기앞수표전일
	 */
	public void setNsnctBchkPvdt(String nsnctBchkPvdt) {
		setNsnctBchkPvdt(new BigDecimal(nsnctBchkPvdt));
	}
	/**
	 * 미결재자기앞수표전일
	 */
	@XmlTransient
	public BigDecimal getNsnctBchkPvdt(){
		return this.nsnctBchkPvdt;
	}
	
	/**
	 * 미결재자기앞수표전일
	 * 
	 * @param nsnctBchkPvdt 미결재자기앞수표전일
	 */
	@JsonSetter("nsnctBchkPvdt")
	public void setNsnctBchkPvdt(BigDecimal nsnctBchkPvdt){
		this.nsnctBchkPvdt= nsnctBchkPvdt;
		this.setIsSet_nsnctBchkPvdt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cnrnRgsYn= false;
	protected final boolean isSet_cnrnRgsYn(){
		return this.isSet_cnrnRgsYn;
	}
	private void setIsSet_cnrnRgsYn(boolean value){
		this.isSet_cnrnRgsYn= value;
	}
	/**
	 * 출연등록여부
	 */
	@XmlTransient
	public String getCnrnRgsYn(){
		return this.cnrnRgsYn;
	}
	
	/**
	 * 출연등록여부
	 * 
	 * @param cnrnRgsYn 출연등록여부
	 */
	public void setCnrnRgsYn(String cnrnRgsYn){
		this.cnrnRgsYn= cnrnRgsYn;
		this.setIsSet_cnrnRgsYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_owacFnm= false;
	protected final boolean isSet_owacFnm(){
		return this.isSet_owacFnm;
	}
	private void setIsSet_owacFnm(boolean value){
		this.isSet_owacFnm= value;
	}
	/**
	 * 예금주성명
	 */
	@XmlTransient
	public String getOwacFnm(){
		return this.owacFnm;
	}
	
	/**
	 * 예금주성명
	 * 
	 * @param owacFnm 예금주성명
	 */
	public void setOwacFnm(String owacFnm){
		this.owacFnm= owacFnm;
		this.setIsSet_owacFnm(true);
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
	private boolean isSet_nsnctEtcObcPvdt= false;
	protected final boolean isSet_nsnctEtcObcPvdt(){
		return this.isSet_nsnctEtcObcPvdt;
	}
	private void setIsSet_nsnctEtcObcPvdt(boolean value){
		this.isSet_nsnctEtcObcPvdt= value;
	}
	/**
	 * 미결재기타타점권전일
	 * BigDecimal - Double value setter
	 *
	 * @Param nsnctEtcObcPvdt 미결재기타타점권전일
	 */
	public void setNsnctEtcObcPvdt(double nsnctEtcObcPvdt) {
		setNsnctEtcObcPvdt(BigDecimal.valueOf(nsnctEtcObcPvdt));
	}
	/**
	 * 미결재기타타점권전일
	 * BigDecimal - Long value setter
	 *
	 * @Param nsnctEtcObcPvdt 미결재기타타점권전일
	 */
	public void setNsnctEtcObcPvdt(long nsnctEtcObcPvdt) {
		setNsnctEtcObcPvdt(BigDecimal.valueOf(nsnctEtcObcPvdt));
	}
	/**
	 * 미결재기타타점권전일
	 * BigDecimal - String value setter
	 *
	 * @Param nsnctEtcObcPvdt 미결재기타타점권전일
	 */
	public void setNsnctEtcObcPvdt(String nsnctEtcObcPvdt) {
		setNsnctEtcObcPvdt(new BigDecimal(nsnctEtcObcPvdt));
	}
	/**
	 * 미결재기타타점권전일
	 */
	@XmlTransient
	public BigDecimal getNsnctEtcObcPvdt(){
		return this.nsnctEtcObcPvdt;
	}
	
	/**
	 * 미결재기타타점권전일
	 * 
	 * @param nsnctEtcObcPvdt 미결재기타타점권전일
	 */
	@JsonSetter("nsnctEtcObcPvdt")
	public void setNsnctEtcObcPvdt(BigDecimal nsnctEtcObcPvdt){
		this.nsnctEtcObcPvdt= nsnctEtcObcPvdt;
		this.setIsSet_nsnctEtcObcPvdt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cusUsgAcno= false;
	protected final boolean isSet_cusUsgAcno(){
		return this.isSet_cusUsgAcno;
	}
	private void setIsSet_cusUsgAcno(boolean value){
		this.isSet_cusUsgAcno= value;
	}
	/**
	 * 고객사용계좌번호
	 */
	@XmlTransient
	public String getCusUsgAcno(){
		return this.cusUsgAcno;
	}
	
	/**
	 * 고객사용계좌번호
	 * 
	 * @param cusUsgAcno 고객사용계좌번호
	 */
	public void setCusUsgAcno(String cusUsgAcno){
		this.cusUsgAcno= cusUsgAcno;
		this.setIsSet_cusUsgAcno(true);
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
	private boolean isSet_newRcknDt= false;
	protected final boolean isSet_newRcknDt(){
		return this.isSet_newRcknDt;
	}
	private void setIsSet_newRcknDt(boolean value){
		this.isSet_newRcknDt= value;
	}
	/**
	 * 신규기산일자
	 */
	@XmlTransient
	public String getNewRcknDt(){
		return this.newRcknDt;
	}
	
	/**
	 * 신규기산일자
	 * 
	 * @param newRcknDt 신규기산일자
	 */
	public void setNewRcknDt(String newRcknDt){
		this.newRcknDt= newRcknDt;
		this.setIsSet_newRcknDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cnsgComNm= false;
	protected final boolean isSet_cnsgComNm(){
		return this.isSet_cnsgComNm;
	}
	private void setIsSet_cnsgComNm(boolean value){
		this.isSet_cnsgComNm= value;
	}
	/**
	 * 위탁회사명
	 */
	@XmlTransient
	public String getCnsgComNm(){
		return this.cnsgComNm;
	}
	
	/**
	 * 위탁회사명
	 * 
	 * @param cnsgComNm 위탁회사명
	 */
	public void setCnsgComNm(String cnsgComNm){
		this.cnsgComNm= cnsgComNm;
		this.setIsSet_cnsgComNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ctBal= false;
	protected final boolean isSet_ctBal(){
		return this.isSet_ctBal;
	}
	private void setIsSet_ctBal(boolean value){
		this.isSet_ctBal= value;
	}
	/**
	 * 현재잔액
	 * BigDecimal - Double value setter
	 *
	 * @Param ctBal 현재잔액
	 */
	public void setCtBal(double ctBal) {
		setCtBal(BigDecimal.valueOf(ctBal));
	}
	/**
	 * 현재잔액
	 * BigDecimal - Long value setter
	 *
	 * @Param ctBal 현재잔액
	 */
	public void setCtBal(long ctBal) {
		setCtBal(BigDecimal.valueOf(ctBal));
	}
	/**
	 * 현재잔액
	 * BigDecimal - String value setter
	 *
	 * @Param ctBal 현재잔액
	 */
	public void setCtBal(String ctBal) {
		setCtBal(new BigDecimal(ctBal));
	}
	/**
	 * 현재잔액
	 */
	@XmlTransient
	public BigDecimal getCtBal(){
		return this.ctBal;
	}
	
	/**
	 * 현재잔액
	 * 
	 * @param ctBal 현재잔액
	 */
	@JsonSetter("ctBal")
	public void setCtBal(BigDecimal ctBal){
		this.ctBal= ctBal;
		this.setIsSet_ctBal(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_acno= false;
	protected final boolean isSet_acno(){
		return this.isSet_acno;
	}
	private void setIsSet_acno(boolean value){
		this.isSet_acno= value;
	}
	/**
	 * 계좌번호
	 */
	@XmlTransient
	public String getAcno(){
		return this.acno;
	}
	
	/**
	 * 계좌번호
	 * 
	 * @param acno 계좌번호
	 */
	public void setAcno(String acno){
		this.acno= acno;
		this.setIsSet_acno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_adntYn= false;
	protected final boolean isSet_adntYn(){
		return this.isSet_adntYn;
	}
	private void setIsSet_adntYn(boolean value){
		this.isSet_adntYn= value;
	}
	/**
	 * 사고여부
	 */
	@XmlTransient
	public String getAdntYn(){
		return this.adntYn;
	}
	
	/**
	 * 사고여부
	 * 
	 * @param adntYn 사고여부
	 */
	public void setAdntYn(String adntYn){
		this.adntYn= adntYn;
		this.setIsSet_adntYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_nsnctBokBchkPvdt= false;
	protected final boolean isSet_nsnctBokBchkPvdt(){
		return this.isSet_nsnctBokBchkPvdt;
	}
	private void setIsSet_nsnctBokBchkPvdt(boolean value){
		this.isSet_nsnctBokBchkPvdt= value;
	}
	/**
	 * 미결재한국은행자기앞수표전일
	 * BigDecimal - Double value setter
	 *
	 * @Param nsnctBokBchkPvdt 미결재한국은행자기앞수표전일
	 */
	public void setNsnctBokBchkPvdt(double nsnctBokBchkPvdt) {
		setNsnctBokBchkPvdt(BigDecimal.valueOf(nsnctBokBchkPvdt));
	}
	/**
	 * 미결재한국은행자기앞수표전일
	 * BigDecimal - Long value setter
	 *
	 * @Param nsnctBokBchkPvdt 미결재한국은행자기앞수표전일
	 */
	public void setNsnctBokBchkPvdt(long nsnctBokBchkPvdt) {
		setNsnctBokBchkPvdt(BigDecimal.valueOf(nsnctBokBchkPvdt));
	}
	/**
	 * 미결재한국은행자기앞수표전일
	 * BigDecimal - String value setter
	 *
	 * @Param nsnctBokBchkPvdt 미결재한국은행자기앞수표전일
	 */
	public void setNsnctBokBchkPvdt(String nsnctBokBchkPvdt) {
		setNsnctBokBchkPvdt(new BigDecimal(nsnctBokBchkPvdt));
	}
	/**
	 * 미결재한국은행자기앞수표전일
	 */
	@XmlTransient
	public BigDecimal getNsnctBokBchkPvdt(){
		return this.nsnctBokBchkPvdt;
	}
	
	/**
	 * 미결재한국은행자기앞수표전일
	 * 
	 * @param nsnctBokBchkPvdt 미결재한국은행자기앞수표전일
	 */
	@JsonSetter("nsnctBokBchkPvdt")
	public void setNsnctBokBchkPvdt(BigDecimal nsnctBokBchkPvdt){
		this.nsnctBokBchkPvdt= nsnctBokBchkPvdt;
		this.setIsSet_nsnctBokBchkPvdt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_lstTrnDt= false;
	protected final boolean isSet_lstTrnDt(){
		return this.isSet_lstTrnDt;
	}
	private void setIsSet_lstTrnDt(boolean value){
		this.isSet_lstTrnDt= value;
	}
	/**
	 * 최종거래일자
	 */
	@XmlTransient
	public String getLstTrnDt(){
		return this.lstTrnDt;
	}
	
	/**
	 * 최종거래일자
	 * 
	 * @param lstTrnDt 최종거래일자
	 */
	public void setLstTrnDt(String lstTrnDt){
		this.lstTrnDt= lstTrnDt;
		this.setIsSet_lstTrnDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_nsnctPmbilPvdt= false;
	protected final boolean isSet_nsnctPmbilPvdt(){
		return this.isSet_nsnctPmbilPvdt;
	}
	private void setIsSet_nsnctPmbilPvdt(boolean value){
		this.isSet_nsnctPmbilPvdt= value;
	}
	/**
	 * 미결재약속어음전일
	 * BigDecimal - Double value setter
	 *
	 * @Param nsnctPmbilPvdt 미결재약속어음전일
	 */
	public void setNsnctPmbilPvdt(double nsnctPmbilPvdt) {
		setNsnctPmbilPvdt(BigDecimal.valueOf(nsnctPmbilPvdt));
	}
	/**
	 * 미결재약속어음전일
	 * BigDecimal - Long value setter
	 *
	 * @Param nsnctPmbilPvdt 미결재약속어음전일
	 */
	public void setNsnctPmbilPvdt(long nsnctPmbilPvdt) {
		setNsnctPmbilPvdt(BigDecimal.valueOf(nsnctPmbilPvdt));
	}
	/**
	 * 미결재약속어음전일
	 * BigDecimal - String value setter
	 *
	 * @Param nsnctPmbilPvdt 미결재약속어음전일
	 */
	public void setNsnctPmbilPvdt(String nsnctPmbilPvdt) {
		setNsnctPmbilPvdt(new BigDecimal(nsnctPmbilPvdt));
	}
	/**
	 * 미결재약속어음전일
	 */
	@XmlTransient
	public BigDecimal getNsnctPmbilPvdt(){
		return this.nsnctPmbilPvdt;
	}
	
	/**
	 * 미결재약속어음전일
	 * 
	 * @param nsnctPmbilPvdt 미결재약속어음전일
	 */
	@JsonSetter("nsnctPmbilPvdt")
	public void setNsnctPmbilPvdt(BigDecimal nsnctPmbilPvdt){
		this.nsnctPmbilPvdt= nsnctPmbilPvdt;
		this.setIsSet_nsnctPmbilPvdt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_inqAcno= false;
	protected final boolean isSet_inqAcno(){
		return this.isSet_inqAcno;
	}
	private void setIsSet_inqAcno(boolean value){
		this.isSet_inqAcno= value;
	}
	/**
	 * 조회계좌번호
	 */
	@XmlTransient
	public String getInqAcno(){
		return this.inqAcno;
	}
	
	/**
	 * 조회계좌번호
	 * 
	 * @param inqAcno 조회계좌번호
	 */
	public void setInqAcno(String inqAcno){
		this.inqAcno= inqAcno;
		this.setIsSet_inqAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_psklEpdt= false;
	protected final boolean isSet_psklEpdt(){
		return this.isSet_psklEpdt;
	}
	private void setIsSet_psklEpdt(boolean value){
		this.isSet_psklEpdt= value;
	}
	/**
	 * 통장대출만기일
	 */
	@XmlTransient
	public String getPsklEpdt(){
		return this.psklEpdt;
	}
	
	/**
	 * 통장대출만기일
	 * 
	 * @param psklEpdt 통장대출만기일
	 */
	public void setPsklEpdt(String psklEpdt){
		this.psklEpdt= psklEpdt;
		this.setIsSet_psklEpdt(true);
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
	private boolean isSet_pbokLnlmAm= false;
	protected final boolean isSet_pbokLnlmAm(){
		return this.isSet_pbokLnlmAm;
	}
	private void setIsSet_pbokLnlmAm(boolean value){
		this.isSet_pbokLnlmAm= value;
	}
	/**
	 * 통장대출한도금액
	 * BigDecimal - Double value setter
	 *
	 * @Param pbokLnlmAm 통장대출한도금액
	 */
	public void setPbokLnlmAm(double pbokLnlmAm) {
		setPbokLnlmAm(BigDecimal.valueOf(pbokLnlmAm));
	}
	/**
	 * 통장대출한도금액
	 * BigDecimal - Long value setter
	 *
	 * @Param pbokLnlmAm 통장대출한도금액
	 */
	public void setPbokLnlmAm(long pbokLnlmAm) {
		setPbokLnlmAm(BigDecimal.valueOf(pbokLnlmAm));
	}
	/**
	 * 통장대출한도금액
	 * BigDecimal - String value setter
	 *
	 * @Param pbokLnlmAm 통장대출한도금액
	 */
	public void setPbokLnlmAm(String pbokLnlmAm) {
		setPbokLnlmAm(new BigDecimal(pbokLnlmAm));
	}
	/**
	 * 통장대출한도금액
	 */
	@XmlTransient
	public BigDecimal getPbokLnlmAm(){
		return this.pbokLnlmAm;
	}
	
	/**
	 * 통장대출한도금액
	 * 
	 * @param pbokLnlmAm 통장대출한도금액
	 */
	@JsonSetter("pbokLnlmAm")
	public void setPbokLnlmAm(BigDecimal pbokLnlmAm){
		this.pbokLnlmAm= pbokLnlmAm;
		this.setIsSet_pbokLnlmAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_nxtPidDt= false;
	protected final boolean isSet_nxtPidDt(){
		return this.isSet_nxtPidDt;
	}
	private void setIsSet_nxtPidDt(boolean value){
		this.isSet_nxtPidDt= value;
	}
	/**
	 * 다음납입일자
	 */
	@XmlTransient
	public String getNxtPidDt(){
		return this.nxtPidDt;
	}
	
	/**
	 * 다음납입일자
	 * 
	 * @param nxtPidDt 다음납입일자
	 */
	public void setNxtPidDt(String nxtPidDt){
		this.nxtPidDt= nxtPidDt;
		this.setIsSet_nxtPidDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_nstlObcAm= false;
	protected final boolean isSet_nstlObcAm(){
		return this.isSet_nstlObcAm;
	}
	private void setIsSet_nstlObcAm(boolean value){
		this.isSet_nstlObcAm= value;
	}
	/**
	 * 미결제타점권금액
	 * BigDecimal - Double value setter
	 *
	 * @Param nstlObcAm 미결제타점권금액
	 */
	public void setNstlObcAm(double nstlObcAm) {
		setNstlObcAm(BigDecimal.valueOf(nstlObcAm));
	}
	/**
	 * 미결제타점권금액
	 * BigDecimal - Long value setter
	 *
	 * @Param nstlObcAm 미결제타점권금액
	 */
	public void setNstlObcAm(long nstlObcAm) {
		setNstlObcAm(BigDecimal.valueOf(nstlObcAm));
	}
	/**
	 * 미결제타점권금액
	 * BigDecimal - String value setter
	 *
	 * @Param nstlObcAm 미결제타점권금액
	 */
	public void setNstlObcAm(String nstlObcAm) {
		setNstlObcAm(new BigDecimal(nstlObcAm));
	}
	/**
	 * 미결제타점권금액
	 */
	@XmlTransient
	public BigDecimal getNstlObcAm(){
		return this.nstlObcAm;
	}
	
	/**
	 * 미결제타점권금액
	 * 
	 * @param nstlObcAm 미결제타점권금액
	 */
	@JsonSetter("nstlObcAm")
	public void setNstlObcAm(BigDecimal nstlObcAm){
		this.nstlObcAm= nstlObcAm;
		this.setIsSet_nstlObcAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_totBal= false;
	protected final boolean isSet_totBal(){
		return this.isSet_totBal;
	}
	private void setIsSet_totBal(boolean value){
		this.isSet_totBal= value;
	}
	/**
	 * 총잔액
	 * BigDecimal - Double value setter
	 *
	 * @Param totBal 총잔액
	 */
	public void setTotBal(double totBal) {
		setTotBal(BigDecimal.valueOf(totBal));
	}
	/**
	 * 총잔액
	 * BigDecimal - Long value setter
	 *
	 * @Param totBal 총잔액
	 */
	public void setTotBal(long totBal) {
		setTotBal(BigDecimal.valueOf(totBal));
	}
	/**
	 * 총잔액
	 * BigDecimal - String value setter
	 *
	 * @Param totBal 총잔액
	 */
	public void setTotBal(String totBal) {
		setTotBal(new BigDecimal(totBal));
	}
	/**
	 * 총잔액
	 */
	@XmlTransient
	public BigDecimal getTotBal(){
		return this.totBal;
	}
	
	/**
	 * 총잔액
	 * 
	 * @param totBal 총잔액
	 */
	@JsonSetter("totBal")
	public void setTotBal(BigDecimal totBal){
		this.totBal= totBal;
		this.setIsSet_totBal(true);
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
	private boolean isSet_rcvSumAm= false;
	protected final boolean isSet_rcvSumAm(){
		return this.isSet_rcvSumAm;
	}
	private void setIsSet_rcvSumAm(boolean value){
		this.isSet_rcvSumAm= value;
	}
	/**
	 * 입금합계금액
	 * BigDecimal - Double value setter
	 *
	 * @Param rcvSumAm 입금합계금액
	 */
	public void setRcvSumAm(double rcvSumAm) {
		setRcvSumAm(BigDecimal.valueOf(rcvSumAm));
	}
	/**
	 * 입금합계금액
	 * BigDecimal - Long value setter
	 *
	 * @Param rcvSumAm 입금합계금액
	 */
	public void setRcvSumAm(long rcvSumAm) {
		setRcvSumAm(BigDecimal.valueOf(rcvSumAm));
	}
	/**
	 * 입금합계금액
	 * BigDecimal - String value setter
	 *
	 * @Param rcvSumAm 입금합계금액
	 */
	public void setRcvSumAm(String rcvSumAm) {
		setRcvSumAm(new BigDecimal(rcvSumAm));
	}
	/**
	 * 입금합계금액
	 */
	@XmlTransient
	public BigDecimal getRcvSumAm(){
		return this.rcvSumAm;
	}
	
	/**
	 * 입금합계금액
	 * 
	 * @param rcvSumAm 입금합계금액
	 */
	@JsonSetter("rcvSumAm")
	public void setRcvSumAm(BigDecimal rcvSumAm){
		this.rcvSumAm= rcvSumAm;
		this.setIsSet_rcvSumAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_totSumAm= false;
	protected final boolean isSet_totSumAm(){
		return this.isSet_totSumAm;
	}
	private void setIsSet_totSumAm(boolean value){
		this.isSet_totSumAm= value;
	}
	/**
	 * 총합계금액
	 * BigDecimal - Double value setter
	 *
	 * @Param totSumAm 총합계금액
	 */
	public void setTotSumAm(double totSumAm) {
		setTotSumAm(BigDecimal.valueOf(totSumAm));
	}
	/**
	 * 총합계금액
	 * BigDecimal - Long value setter
	 *
	 * @Param totSumAm 총합계금액
	 */
	public void setTotSumAm(long totSumAm) {
		setTotSumAm(BigDecimal.valueOf(totSumAm));
	}
	/**
	 * 총합계금액
	 * BigDecimal - String value setter
	 *
	 * @Param totSumAm 총합계금액
	 */
	public void setTotSumAm(String totSumAm) {
		setTotSumAm(new BigDecimal(totSumAm));
	}
	/**
	 * 총합계금액
	 */
	@XmlTransient
	public BigDecimal getTotSumAm(){
		return this.totSumAm;
	}
	
	/**
	 * 총합계금액
	 * 
	 * @param totSumAm 총합계금액
	 */
	@JsonSetter("totSumAm")
	public void setTotSumAm(BigDecimal totSumAm){
		this.totSumAm= totSumAm;
		this.setIsSet_totSumAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pdcdNm= false;
	protected final boolean isSet_pdcdNm(){
		return this.isSet_pdcdNm;
	}
	private void setIsSet_pdcdNm(boolean value){
		this.isSet_pdcdNm= value;
	}
	/**
	 * 상품코드명
	 */
	@XmlTransient
	public String getPdcdNm(){
		return this.pdcdNm;
	}
	
	/**
	 * 상품코드명
	 * 
	 * @param pdcdNm 상품코드명
	 */
	public void setPdcdNm(String pdcdNm){
		this.pdcdNm= pdcdNm;
		this.setIsSet_pdcdNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pageUsgYn= false;
	protected final boolean isSet_pageUsgYn(){
		return this.isSet_pageUsgYn;
	}
	private void setIsSet_pageUsgYn(boolean value){
		this.isSet_pageUsgYn= value;
	}
	/**
	 * 페이지사용여부
	 */
	@XmlTransient
	public String getPageUsgYn(){
		return this.pageUsgYn;
	}
	
	/**
	 * 페이지사용여부
	 * 
	 * @param pageUsgYn 페이지사용여부
	 */
	public void setPageUsgYn(String pageUsgYn){
		this.pageUsgYn= pageUsgYn;
		this.setIsSet_pageUsgYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_nxtPageYn= false;
	protected final boolean isSet_nxtPageYn(){
		return this.isSet_nxtPageYn;
	}
	private void setIsSet_nxtPageYn(boolean value){
		this.isSet_nxtPageYn= value;
	}
	/**
	 * 다음페이지여부
	 */
	@XmlTransient
	public String getNxtPageYn(){
		return this.nxtPageYn;
	}
	
	/**
	 * 다음페이지여부
	 * 
	 * @param nxtPageYn 다음페이지여부
	 */
	public void setNxtPageYn(String nxtPageYn){
		this.nxtPageYn= nxtPageYn;
		this.setIsSet_nxtPageYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_totCnt= false;
	protected final boolean isSet_totCnt(){
		return this.isSet_totCnt;
	}
	private void setIsSet_totCnt(boolean value){
		this.isSet_totCnt= value;
	}
	/**
	 * 총건수
	 */
	@XmlTransient
	public String getTotCnt(){
		return this.totCnt;
	}
	
	/**
	 * 총건수
	 * 
	 * @param totCnt 총건수
	 */
	public void setTotCnt(String totCnt){
		this.totCnt= totCnt;
		this.setIsSet_totCnt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_totPage= false;
	protected final boolean isSet_totPage(){
		return this.isSet_totPage;
	}
	private void setIsSet_totPage(boolean value){
		this.isSet_totPage= value;
	}
	/**
	 * 총페이지
	 */
	@XmlTransient
	public String getTotPage(){
		return this.totPage;
	}
	
	/**
	 * 총페이지
	 * 
	 * @param totPage 총페이지
	 */
	public void setTotPage(String totPage){
		this.totPage= totPage;
		this.setIsSet_totPage(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pageNo= false;
	protected final boolean isSet_pageNo(){
		return this.isSet_pageNo;
	}
	private void setIsSet_pageNo(boolean value){
		this.isSet_pageNo= value;
	}
	/**
	 * 페이지번호
	 */
	@XmlTransient
	public String getPageNo(){
		return this.pageNo;
	}
	
	/**
	 * 페이지번호
	 * 
	 * @param pageNo 페이지번호
	 */
	public void setPageNo(String pageNo){
		this.pageNo= pageNo;
		this.setIsSet_pageNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_inqStaNo= false;
	protected final boolean isSet_inqStaNo(){
		return this.isSet_inqStaNo;
	}
	private void setIsSet_inqStaNo(boolean value){
		this.isSet_inqStaNo= value;
	}
	/**
	 * 조회시작번호
	 */
	@XmlTransient
	public String getInqStaNo(){
		return this.inqStaNo;
	}
	
	/**
	 * 조회시작번호
	 * 
	 * @param inqStaNo 조회시작번호
	 */
	public void setInqStaNo(String inqStaNo){
		this.inqStaNo= inqStaNo;
		this.setIsSet_inqStaNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_inqCnt= false;
	protected final boolean isSet_inqCnt(){
		return this.isSet_inqCnt;
	}
	private void setIsSet_inqCnt(boolean value){
		this.isSet_inqCnt= value;
	}
	/**
	 * 조회건수
	 */
	@XmlTransient
	public String getInqCnt(){
		return this.inqCnt;
	}
	
	/**
	 * 조회건수
	 * 
	 * @param inqCnt 조회건수
	 */
	public void setInqCnt(String inqCnt){
		this.inqCnt= inqCnt;
		this.setIsSet_inqCnt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_srchKrd= false;
	protected final boolean isSet_srchKrd(){
		return this.isSet_srchKrd;
	}
	private void setIsSet_srchKrd(boolean value){
		this.isSet_srchKrd= value;
	}
	/**
	 * 검색키워드
	 */
	@XmlTransient
	public String getSrchKrd(){
		return this.srchKrd;
	}
	
	/**
	 * 검색키워드
	 * 
	 * @param srchKrd 검색키워드
	 */
	public void setSrchKrd(String srchKrd){
		this.srchKrd= srchKrd;
		this.setIsSet_srchKrd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_minAm= false;
	protected final boolean isSet_minAm(){
		return this.isSet_minAm;
	}
	private void setIsSet_minAm(boolean value){
		this.isSet_minAm= value;
	}
	/**
	 * 최소금액
	 */
	@XmlTransient
	public String getMinAm(){
		return this.minAm;
	}
	
	/**
	 * 최소금액
	 * 
	 * @param minAm 최소금액
	 */
	public void setMinAm(String minAm){
		this.minAm= minAm;
		this.setIsSet_minAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_maxAm= false;
	protected final boolean isSet_maxAm(){
		return this.isSet_maxAm;
	}
	private void setIsSet_maxAm(boolean value){
		this.isSet_maxAm= value;
	}
	/**
	 * 최대금액
	 */
	@XmlTransient
	public String getMaxAm(){
		return this.maxAm;
	}
	
	/**
	 * 최대금액
	 * 
	 * @param maxAm 최대금액
	 */
	public void setMaxAm(String maxAm){
		this.maxAm= maxAm;
		this.setIsSet_maxAm(true);
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
	 * 머니클립거래내역조회.공통.출력.IO
	 */
	@XmlTransient
	public List<MNPMnyPinFncTrnSelectTrnPrts_DTO> getGrid(){
		return grid;
	}
	
	/**
	 * 머니클립거래내역조회.공통.출력.IO
	 * 
	 * @param grid 머니클립거래내역조회.공통.출력.IO
	 */
	@JsonSetter("grid")
	public void setGrid(List<MNPMnyPinFncTrnSelectTrnPrts_DTO> grid){
		this.grid= grid;
		this.setIsSet_grid(true);
	}
	
	public void setGrid(MNPMnyPinFncTrnSelectTrnPrts_DTO... items){
		List<MNPMnyPinFncTrnSelectTrnPrts_DTO> _items= new ArrayList<>();
		if ( items!= null && items.length> 0){
			for( MNPMnyPinFncTrnSelectTrnPrts_DTO item: items ){
				_items.add(item);
			}
		}
		this.setGrid(_items);
	}
				
	@Override
	public MNPMnyPinWallMngSelectWallTrnPrts_ODT clone(){
		try{
			MNPMnyPinWallMngSelectWallTrnPrts_ODT object= (MNPMnyPinWallMngSelectWallTrnPrts_ODT)super.clone();
			if ( this.grid== null ) object.grid= null;
			else{
				List<MNPMnyPinFncTrnSelectTrnPrts_DTO> clonedList= new ArrayList<>(this.grid.size());
				for( MNPMnyPinFncTrnSelectTrnPrts_DTO item : grid ){
					clonedList.add((MNPMnyPinFncTrnSelectTrnPrts_DTO)item.clone());
				}
				object.grid= clonedList;
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
		
		result= prime * result + ((this.fstNewRcknDt==null)?0:this.fstNewRcknDt.hashCode());
		result= prime * result + ((this.nsnctPrchPvdt==null)?0:this.nsnctPrchPvdt.hashCode());
		result= prime * result + ((this.nsnctCackPvdt==null)?0:this.nsnctCackPvdt.hashCode());
		result= prime * result + ((this.payAvlAm==null)?0:this.payAvlAm.hashCode());
		result= prime * result + ((this.nsnctBchkPvdt==null)?0:this.nsnctBchkPvdt.hashCode());
		result= prime * result + ((this.cnrnRgsYn==null)?0:this.cnrnRgsYn.hashCode());
		result= prime * result + ((this.owacFnm==null)?0:this.owacFnm.hashCode());
		result= prime * result + ((this.pdcd==null)?0:this.pdcd.hashCode());
		result= prime * result + ((this.nsnctEtcObcPvdt==null)?0:this.nsnctEtcObcPvdt.hashCode());
		result= prime * result + ((this.cusUsgAcno==null)?0:this.cusUsgAcno.hashCode());
		result= prime * result + ((this.synpbPdcd==null)?0:this.synpbPdcd.hashCode());
		result= prime * result + ((this.newRcknDt==null)?0:this.newRcknDt.hashCode());
		result= prime * result + ((this.cnsgComNm==null)?0:this.cnsgComNm.hashCode());
		result= prime * result + ((this.ctBal==null)?0:this.ctBal.hashCode());
		result= prime * result + ((this.acno==null)?0:this.acno.hashCode());
		result= prime * result + ((this.adntYn==null)?0:this.adntYn.hashCode());
		result= prime * result + ((this.nsnctBokBchkPvdt==null)?0:this.nsnctBokBchkPvdt.hashCode());
		result= prime * result + ((this.lstTrnDt==null)?0:this.lstTrnDt.hashCode());
		result= prime * result + ((this.nsnctPmbilPvdt==null)?0:this.nsnctPmbilPvdt.hashCode());
		result= prime * result + ((this.inqAcno==null)?0:this.inqAcno.hashCode());
		result= prime * result + ((this.psklEpdt==null)?0:this.psklEpdt.hashCode());
		result= prime * result + ((this.actMngBrcd==null)?0:this.actMngBrcd.hashCode());
		result= prime * result + ((this.pbokLnlmAm==null)?0:this.pbokLnlmAm.hashCode());
		result= prime * result + ((this.nxtPidDt==null)?0:this.nxtPidDt.hashCode());
		result= prime * result + ((this.nstlObcAm==null)?0:this.nstlObcAm.hashCode());
		result= prime * result + ((this.totBal==null)?0:this.totBal.hashCode());
		result= prime * result + ((this.paySumAm==null)?0:this.paySumAm.hashCode());
		result= prime * result + ((this.rcvSumAm==null)?0:this.rcvSumAm.hashCode());
		result= prime * result + ((this.totSumAm==null)?0:this.totSumAm.hashCode());
		result= prime * result + ((this.pdcdNm==null)?0:this.pdcdNm.hashCode());
		result= prime * result + ((this.pageUsgYn==null)?0:this.pageUsgYn.hashCode());
		result= prime * result + ((this.nxtPageYn==null)?0:this.nxtPageYn.hashCode());
		result= prime * result + ((this.totCnt==null)?0:this.totCnt.hashCode());
		result= prime * result + ((this.totPage==null)?0:this.totPage.hashCode());
		result= prime * result + ((this.pageNo==null)?0:this.pageNo.hashCode());
		result= prime * result + ((this.inqStaNo==null)?0:this.inqStaNo.hashCode());
		result= prime * result + ((this.inqCnt==null)?0:this.inqCnt.hashCode());
		result= prime * result + ((this.srchKrd==null)?0:this.srchKrd.hashCode());
		result= prime * result + ((this.minAm==null)?0:this.minAm.hashCode());
		result= prime * result + ((this.maxAm==null)?0:this.maxAm.hashCode());
		result= prime * result + ((this.grid==null)?0:this.grid.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MNPMnyPinWallMngSelectWallTrnPrts_ODT other= (MNPMnyPinWallMngSelectWallTrnPrts_ODT)obj;
		{
			Object _fstNewRcknDt= getFstNewRcknDt();
			Object __fstNewRcknDt= other.getFstNewRcknDt();
			if ( _fstNewRcknDt== null ) { if ( __fstNewRcknDt!= null ) return false; }
			else if ( !_fstNewRcknDt.equals(__fstNewRcknDt) ) return false;
		}
		{
			Object _nsnctPrchPvdt= getNsnctPrchPvdt();
			Object __nsnctPrchPvdt= other.getNsnctPrchPvdt();
			if ( _nsnctPrchPvdt== null ) { if ( __nsnctPrchPvdt!= null ) return false; }
			else if ( !_nsnctPrchPvdt.equals(__nsnctPrchPvdt) ) return false;
		}
		{
			Object _nsnctCackPvdt= getNsnctCackPvdt();
			Object __nsnctCackPvdt= other.getNsnctCackPvdt();
			if ( _nsnctCackPvdt== null ) { if ( __nsnctCackPvdt!= null ) return false; }
			else if ( !_nsnctCackPvdt.equals(__nsnctCackPvdt) ) return false;
		}
		{
			Object _payAvlAm= getPayAvlAm();
			Object __payAvlAm= other.getPayAvlAm();
			if ( _payAvlAm== null ) { if ( __payAvlAm!= null ) return false; }
			else if ( !_payAvlAm.equals(__payAvlAm) ) return false;
		}
		{
			Object _nsnctBchkPvdt= getNsnctBchkPvdt();
			Object __nsnctBchkPvdt= other.getNsnctBchkPvdt();
			if ( _nsnctBchkPvdt== null ) { if ( __nsnctBchkPvdt!= null ) return false; }
			else if ( !_nsnctBchkPvdt.equals(__nsnctBchkPvdt) ) return false;
		}
		{
			Object _cnrnRgsYn= getCnrnRgsYn();
			Object __cnrnRgsYn= other.getCnrnRgsYn();
			if ( _cnrnRgsYn== null ) { if ( __cnrnRgsYn!= null ) return false; }
			else if ( !_cnrnRgsYn.equals(__cnrnRgsYn) ) return false;
		}
		{
			Object _owacFnm= getOwacFnm();
			Object __owacFnm= other.getOwacFnm();
			if ( _owacFnm== null ) { if ( __owacFnm!= null ) return false; }
			else if ( !_owacFnm.equals(__owacFnm) ) return false;
		}
		{
			Object _pdcd= getPdcd();
			Object __pdcd= other.getPdcd();
			if ( _pdcd== null ) { if ( __pdcd!= null ) return false; }
			else if ( !_pdcd.equals(__pdcd) ) return false;
		}
		{
			Object _nsnctEtcObcPvdt= getNsnctEtcObcPvdt();
			Object __nsnctEtcObcPvdt= other.getNsnctEtcObcPvdt();
			if ( _nsnctEtcObcPvdt== null ) { if ( __nsnctEtcObcPvdt!= null ) return false; }
			else if ( !_nsnctEtcObcPvdt.equals(__nsnctEtcObcPvdt) ) return false;
		}
		{
			Object _cusUsgAcno= getCusUsgAcno();
			Object __cusUsgAcno= other.getCusUsgAcno();
			if ( _cusUsgAcno== null ) { if ( __cusUsgAcno!= null ) return false; }
			else if ( !_cusUsgAcno.equals(__cusUsgAcno) ) return false;
		}
		{
			Object _synpbPdcd= getSynpbPdcd();
			Object __synpbPdcd= other.getSynpbPdcd();
			if ( _synpbPdcd== null ) { if ( __synpbPdcd!= null ) return false; }
			else if ( !_synpbPdcd.equals(__synpbPdcd) ) return false;
		}
		{
			Object _newRcknDt= getNewRcknDt();
			Object __newRcknDt= other.getNewRcknDt();
			if ( _newRcknDt== null ) { if ( __newRcknDt!= null ) return false; }
			else if ( !_newRcknDt.equals(__newRcknDt) ) return false;
		}
		{
			Object _cnsgComNm= getCnsgComNm();
			Object __cnsgComNm= other.getCnsgComNm();
			if ( _cnsgComNm== null ) { if ( __cnsgComNm!= null ) return false; }
			else if ( !_cnsgComNm.equals(__cnsgComNm) ) return false;
		}
		{
			Object _ctBal= getCtBal();
			Object __ctBal= other.getCtBal();
			if ( _ctBal== null ) { if ( __ctBal!= null ) return false; }
			else if ( !_ctBal.equals(__ctBal) ) return false;
		}
		{
			Object _acno= getAcno();
			Object __acno= other.getAcno();
			if ( _acno== null ) { if ( __acno!= null ) return false; }
			else if ( !_acno.equals(__acno) ) return false;
		}
		{
			Object _adntYn= getAdntYn();
			Object __adntYn= other.getAdntYn();
			if ( _adntYn== null ) { if ( __adntYn!= null ) return false; }
			else if ( !_adntYn.equals(__adntYn) ) return false;
		}
		{
			Object _nsnctBokBchkPvdt= getNsnctBokBchkPvdt();
			Object __nsnctBokBchkPvdt= other.getNsnctBokBchkPvdt();
			if ( _nsnctBokBchkPvdt== null ) { if ( __nsnctBokBchkPvdt!= null ) return false; }
			else if ( !_nsnctBokBchkPvdt.equals(__nsnctBokBchkPvdt) ) return false;
		}
		{
			Object _lstTrnDt= getLstTrnDt();
			Object __lstTrnDt= other.getLstTrnDt();
			if ( _lstTrnDt== null ) { if ( __lstTrnDt!= null ) return false; }
			else if ( !_lstTrnDt.equals(__lstTrnDt) ) return false;
		}
		{
			Object _nsnctPmbilPvdt= getNsnctPmbilPvdt();
			Object __nsnctPmbilPvdt= other.getNsnctPmbilPvdt();
			if ( _nsnctPmbilPvdt== null ) { if ( __nsnctPmbilPvdt!= null ) return false; }
			else if ( !_nsnctPmbilPvdt.equals(__nsnctPmbilPvdt) ) return false;
		}
		{
			Object _inqAcno= getInqAcno();
			Object __inqAcno= other.getInqAcno();
			if ( _inqAcno== null ) { if ( __inqAcno!= null ) return false; }
			else if ( !_inqAcno.equals(__inqAcno) ) return false;
		}
		{
			Object _psklEpdt= getPsklEpdt();
			Object __psklEpdt= other.getPsklEpdt();
			if ( _psklEpdt== null ) { if ( __psklEpdt!= null ) return false; }
			else if ( !_psklEpdt.equals(__psklEpdt) ) return false;
		}
		{
			Object _actMngBrcd= getActMngBrcd();
			Object __actMngBrcd= other.getActMngBrcd();
			if ( _actMngBrcd== null ) { if ( __actMngBrcd!= null ) return false; }
			else if ( !_actMngBrcd.equals(__actMngBrcd) ) return false;
		}
		{
			Object _pbokLnlmAm= getPbokLnlmAm();
			Object __pbokLnlmAm= other.getPbokLnlmAm();
			if ( _pbokLnlmAm== null ) { if ( __pbokLnlmAm!= null ) return false; }
			else if ( !_pbokLnlmAm.equals(__pbokLnlmAm) ) return false;
		}
		{
			Object _nxtPidDt= getNxtPidDt();
			Object __nxtPidDt= other.getNxtPidDt();
			if ( _nxtPidDt== null ) { if ( __nxtPidDt!= null ) return false; }
			else if ( !_nxtPidDt.equals(__nxtPidDt) ) return false;
		}
		{
			Object _nstlObcAm= getNstlObcAm();
			Object __nstlObcAm= other.getNstlObcAm();
			if ( _nstlObcAm== null ) { if ( __nstlObcAm!= null ) return false; }
			else if ( !_nstlObcAm.equals(__nstlObcAm) ) return false;
		}
		{
			Object _totBal= getTotBal();
			Object __totBal= other.getTotBal();
			if ( _totBal== null ) { if ( __totBal!= null ) return false; }
			else if ( !_totBal.equals(__totBal) ) return false;
		}
		{
			Object _paySumAm= getPaySumAm();
			Object __paySumAm= other.getPaySumAm();
			if ( _paySumAm== null ) { if ( __paySumAm!= null ) return false; }
			else if ( !_paySumAm.equals(__paySumAm) ) return false;
		}
		{
			Object _rcvSumAm= getRcvSumAm();
			Object __rcvSumAm= other.getRcvSumAm();
			if ( _rcvSumAm== null ) { if ( __rcvSumAm!= null ) return false; }
			else if ( !_rcvSumAm.equals(__rcvSumAm) ) return false;
		}
		{
			Object _totSumAm= getTotSumAm();
			Object __totSumAm= other.getTotSumAm();
			if ( _totSumAm== null ) { if ( __totSumAm!= null ) return false; }
			else if ( !_totSumAm.equals(__totSumAm) ) return false;
		}
		{
			Object _pdcdNm= getPdcdNm();
			Object __pdcdNm= other.getPdcdNm();
			if ( _pdcdNm== null ) { if ( __pdcdNm!= null ) return false; }
			else if ( !_pdcdNm.equals(__pdcdNm) ) return false;
		}
		{
			Object _pageUsgYn= getPageUsgYn();
			Object __pageUsgYn= other.getPageUsgYn();
			if ( _pageUsgYn== null ) { if ( __pageUsgYn!= null ) return false; }
			else if ( !_pageUsgYn.equals(__pageUsgYn) ) return false;
		}
		{
			Object _nxtPageYn= getNxtPageYn();
			Object __nxtPageYn= other.getNxtPageYn();
			if ( _nxtPageYn== null ) { if ( __nxtPageYn!= null ) return false; }
			else if ( !_nxtPageYn.equals(__nxtPageYn) ) return false;
		}
		{
			Object _totCnt= getTotCnt();
			Object __totCnt= other.getTotCnt();
			if ( _totCnt== null ) { if ( __totCnt!= null ) return false; }
			else if ( !_totCnt.equals(__totCnt) ) return false;
		}
		{
			Object _totPage= getTotPage();
			Object __totPage= other.getTotPage();
			if ( _totPage== null ) { if ( __totPage!= null ) return false; }
			else if ( !_totPage.equals(__totPage) ) return false;
		}
		{
			Object _pageNo= getPageNo();
			Object __pageNo= other.getPageNo();
			if ( _pageNo== null ) { if ( __pageNo!= null ) return false; }
			else if ( !_pageNo.equals(__pageNo) ) return false;
		}
		{
			Object _inqStaNo= getInqStaNo();
			Object __inqStaNo= other.getInqStaNo();
			if ( _inqStaNo== null ) { if ( __inqStaNo!= null ) return false; }
			else if ( !_inqStaNo.equals(__inqStaNo) ) return false;
		}
		{
			Object _inqCnt= getInqCnt();
			Object __inqCnt= other.getInqCnt();
			if ( _inqCnt== null ) { if ( __inqCnt!= null ) return false; }
			else if ( !_inqCnt.equals(__inqCnt) ) return false;
		}
		{
			Object _srchKrd= getSrchKrd();
			Object __srchKrd= other.getSrchKrd();
			if ( _srchKrd== null ) { if ( __srchKrd!= null ) return false; }
			else if ( !_srchKrd.equals(__srchKrd) ) return false;
		}
		{
			Object _minAm= getMinAm();
			Object __minAm= other.getMinAm();
			if ( _minAm== null ) { if ( __minAm!= null ) return false; }
			else if ( !_minAm.equals(__minAm) ) return false;
		}
		{
			Object _maxAm= getMaxAm();
			Object __maxAm= other.getMaxAm();
			if ( _maxAm== null ) { if ( __maxAm!= null ) return false; }
			else if ( !_maxAm.equals(__maxAm) ) return false;
		}
		{
			Object _grid= getGrid();
			Object __grid= other.getGrid();
			if ( _grid== null ) { if ( __grid!= null ) return false; }
			else if ( !_grid.equals(__grid) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MNPMnyPinWallMngSelectWallTrnPrts_ODT.class.getName()).append(":\n");
		sb.append("\tfstNewRcknDt: ");
		sb.append(fstNewRcknDt==null?"null":getFstNewRcknDt());
		sb.append("\n");
		sb.append("\tnsnctPrchPvdt: ");
		sb.append(nsnctPrchPvdt==null?"null":getNsnctPrchPvdt());
		sb.append("\n");
		sb.append("\tnsnctCackPvdt: ");
		sb.append(nsnctCackPvdt==null?"null":getNsnctCackPvdt());
		sb.append("\n");
		sb.append("\tpayAvlAm: ");
		sb.append(payAvlAm==null?"null":getPayAvlAm());
		sb.append("\n");
		sb.append("\tnsnctBchkPvdt: ");
		sb.append(nsnctBchkPvdt==null?"null":getNsnctBchkPvdt());
		sb.append("\n");
		sb.append("\tcnrnRgsYn: ");
		sb.append(cnrnRgsYn==null?"null":getCnrnRgsYn());
		sb.append("\n");
		sb.append("\towacFnm: ");
		sb.append(owacFnm==null?"null":getOwacFnm());
		sb.append("\n");
		sb.append("\tpdcd: ");
		sb.append(pdcd==null?"null":getPdcd());
		sb.append("\n");
		sb.append("\tnsnctEtcObcPvdt: ");
		sb.append(nsnctEtcObcPvdt==null?"null":getNsnctEtcObcPvdt());
		sb.append("\n");
		sb.append("\tcusUsgAcno: ");
		sb.append(cusUsgAcno==null?"null":getCusUsgAcno());
		sb.append("\n");
		sb.append("\tsynpbPdcd: ");
		sb.append(synpbPdcd==null?"null":getSynpbPdcd());
		sb.append("\n");
		sb.append("\tnewRcknDt: ");
		sb.append(newRcknDt==null?"null":getNewRcknDt());
		sb.append("\n");
		sb.append("\tcnsgComNm: ");
		sb.append(cnsgComNm==null?"null":getCnsgComNm());
		sb.append("\n");
		sb.append("\tctBal: ");
		sb.append(ctBal==null?"null":getCtBal());
		sb.append("\n");
		sb.append("\tacno: ");
		sb.append(acno==null?"null":getAcno());
		sb.append("\n");
		sb.append("\tadntYn: ");
		sb.append(adntYn==null?"null":getAdntYn());
		sb.append("\n");
		sb.append("\tnsnctBokBchkPvdt: ");
		sb.append(nsnctBokBchkPvdt==null?"null":getNsnctBokBchkPvdt());
		sb.append("\n");
		sb.append("\tlstTrnDt: ");
		sb.append(lstTrnDt==null?"null":getLstTrnDt());
		sb.append("\n");
		sb.append("\tnsnctPmbilPvdt: ");
		sb.append(nsnctPmbilPvdt==null?"null":getNsnctPmbilPvdt());
		sb.append("\n");
		sb.append("\tinqAcno: ");
		sb.append(inqAcno==null?"null":getInqAcno());
		sb.append("\n");
		sb.append("\tpsklEpdt: ");
		sb.append(psklEpdt==null?"null":getPsklEpdt());
		sb.append("\n");
		sb.append("\tactMngBrcd: ");
		sb.append(actMngBrcd==null?"null":getActMngBrcd());
		sb.append("\n");
		sb.append("\tpbokLnlmAm: ");
		sb.append(pbokLnlmAm==null?"null":getPbokLnlmAm());
		sb.append("\n");
		sb.append("\tnxtPidDt: ");
		sb.append(nxtPidDt==null?"null":getNxtPidDt());
		sb.append("\n");
		sb.append("\tnstlObcAm: ");
		sb.append(nstlObcAm==null?"null":getNstlObcAm());
		sb.append("\n");
		sb.append("\ttotBal: ");
		sb.append(totBal==null?"null":getTotBal());
		sb.append("\n");
		sb.append("\tpaySumAm: ");
		sb.append(paySumAm==null?"null":getPaySumAm());
		sb.append("\n");
		sb.append("\trcvSumAm: ");
		sb.append(rcvSumAm==null?"null":getRcvSumAm());
		sb.append("\n");
		sb.append("\ttotSumAm: ");
		sb.append(totSumAm==null?"null":getTotSumAm());
		sb.append("\n");
		sb.append("\tpdcdNm: ");
		sb.append(pdcdNm==null?"null":getPdcdNm());
		sb.append("\n");
		sb.append("\tpageUsgYn: ");
		sb.append(pageUsgYn==null?"null":getPageUsgYn());
		sb.append("\n");
		sb.append("\tnxtPageYn: ");
		sb.append(nxtPageYn==null?"null":getNxtPageYn());
		sb.append("\n");
		sb.append("\ttotCnt: ");
		sb.append(totCnt==null?"null":getTotCnt());
		sb.append("\n");
		sb.append("\ttotPage: ");
		sb.append(totPage==null?"null":getTotPage());
		sb.append("\n");
		sb.append("\tpageNo: ");
		sb.append(pageNo==null?"null":getPageNo());
		sb.append("\n");
		sb.append("\tinqStaNo: ");
		sb.append(inqStaNo==null?"null":getInqStaNo());
		sb.append("\n");
		sb.append("\tinqCnt: ");
		sb.append(inqCnt==null?"null":getInqCnt());
		sb.append("\n");
		sb.append("\tsrchKrd: ");
		sb.append(srchKrd==null?"null":getSrchKrd());
		sb.append("\n");
		sb.append("\tminAm: ");
		sb.append(minAm==null?"null":getMinAm());
		sb.append("\n");
		sb.append("\tmaxAm: ");
		sb.append(maxAm==null?"null":getMaxAm());
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
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 8; /* fstNewRcknDt */
		messageLen+= 19; /* nsnctPrchPvdt */
		messageLen+= 19; /* nsnctCackPvdt */
		messageLen+= 19; /* payAvlAm */
		messageLen+= 19; /* nsnctBchkPvdt */
		messageLen+= 1; /* cnrnRgsYn */
		messageLen+= 50; /* owacFnm */
		messageLen+= 13; /* pdcd */
		messageLen+= 19; /* nsnctEtcObcPvdt */
		messageLen+= 20; /* cusUsgAcno */
		messageLen+= 13; /* synpbPdcd */
		messageLen+= 8; /* newRcknDt */
		messageLen+= 50; /* cnsgComNm */
		messageLen+= 19; /* ctBal */
		messageLen+= 13; /* acno */
		messageLen+= 40; /* adntYn */
		messageLen+= 19; /* nsnctBokBchkPvdt */
		messageLen+= 8; /* lstTrnDt */
		messageLen+= 19; /* nsnctPmbilPvdt */
		messageLen+= 15; /* inqAcno */
		messageLen+= 20; /* psklEpdt */
		messageLen+= 6; /* actMngBrcd */
		messageLen+= 19; /* pbokLnlmAm */
		messageLen+= 8; /* nxtPidDt */
		messageLen+= 19; /* nstlObcAm */
		messageLen+= 19; /* totBal */
		messageLen+= 16; /* paySumAm */
		messageLen+= 16; /* rcvSumAm */
		messageLen+= 16; /* totSumAm */
		messageLen+= 100; /* pdcdNm */
		messageLen+= 1; /* pageUsgYn */
		messageLen+= 1; /* nxtPageYn */
		messageLen+= 6; /* totCnt */
		messageLen+= 6; /* totPage */
		messageLen+= 6; /* pageNo */
		messageLen+= 6; /* inqStaNo */
		messageLen+= 6; /* inqCnt */
		messageLen+= 100; /* srchKrd */
		messageLen+= 16; /* minAm */
		messageLen+= 16; /* maxAm */
		{/*grid*/
			int size=1;
			int count= grid == null ? 0 : grid.size();
			int min= size > count?count:size;
			MNPMnyPinFncTrnSelectTrnPrts_DTO emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					MNPMnyPinFncTrnSelectTrnPrts_DTO element= grid.get(i);
					if ( element != null && !(element instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= element==null?0:( (Predictable)element).predictMessageLength();
				}else{
					if ( emptyElement== null ) emptyElement= new com.skbank.sml.fns.mnp.dto.MNPMnyPinFncTrnSelectTrnPrts_DTO();
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
	
		list.add("fstNewRcknDt");
		list.add("nsnctPrchPvdt");
		list.add("nsnctCackPvdt");
		list.add("payAvlAm");
		list.add("nsnctBchkPvdt");
		list.add("cnrnRgsYn");
		list.add("owacFnm");
		list.add("pdcd");
		list.add("nsnctEtcObcPvdt");
		list.add("cusUsgAcno");
		list.add("synpbPdcd");
		list.add("newRcknDt");
		list.add("cnsgComNm");
		list.add("ctBal");
		list.add("acno");
		list.add("adntYn");
		list.add("nsnctBokBchkPvdt");
		list.add("lstTrnDt");
		list.add("nsnctPmbilPvdt");
		list.add("inqAcno");
		list.add("psklEpdt");
		list.add("actMngBrcd");
		list.add("pbokLnlmAm");
		list.add("nxtPidDt");
		list.add("nstlObcAm");
		list.add("totBal");
		list.add("paySumAm");
		list.add("rcvSumAm");
		list.add("totSumAm");
		list.add("pdcdNm");
		list.add("pageUsgYn");
		list.add("nxtPageYn");
		list.add("totCnt");
		list.add("totPage");
		list.add("pageNo");
		list.add("inqStaNo");
		list.add("inqCnt");
		list.add("srchKrd");
		list.add("minAm");
		list.add("maxAm");
		list.add("grid");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("fstNewRcknDt", get("fstNewRcknDt"));
		map.put("nsnctPrchPvdt", get("nsnctPrchPvdt"));
		map.put("nsnctCackPvdt", get("nsnctCackPvdt"));
		map.put("payAvlAm", get("payAvlAm"));
		map.put("nsnctBchkPvdt", get("nsnctBchkPvdt"));
		map.put("cnrnRgsYn", get("cnrnRgsYn"));
		map.put("owacFnm", get("owacFnm"));
		map.put("pdcd", get("pdcd"));
		map.put("nsnctEtcObcPvdt", get("nsnctEtcObcPvdt"));
		map.put("cusUsgAcno", get("cusUsgAcno"));
		map.put("synpbPdcd", get("synpbPdcd"));
		map.put("newRcknDt", get("newRcknDt"));
		map.put("cnsgComNm", get("cnsgComNm"));
		map.put("ctBal", get("ctBal"));
		map.put("acno", get("acno"));
		map.put("adntYn", get("adntYn"));
		map.put("nsnctBokBchkPvdt", get("nsnctBokBchkPvdt"));
		map.put("lstTrnDt", get("lstTrnDt"));
		map.put("nsnctPmbilPvdt", get("nsnctPmbilPvdt"));
		map.put("inqAcno", get("inqAcno"));
		map.put("psklEpdt", get("psklEpdt"));
		map.put("actMngBrcd", get("actMngBrcd"));
		map.put("pbokLnlmAm", get("pbokLnlmAm"));
		map.put("nxtPidDt", get("nxtPidDt"));
		map.put("nstlObcAm", get("nstlObcAm"));
		map.put("totBal", get("totBal"));
		map.put("paySumAm", get("paySumAm"));
		map.put("rcvSumAm", get("rcvSumAm"));
		map.put("totSumAm", get("totSumAm"));
		map.put("pdcdNm", get("pdcdNm"));
		map.put("pageUsgYn", get("pageUsgYn"));
		map.put("nxtPageYn", get("nxtPageYn"));
		map.put("totCnt", get("totCnt"));
		map.put("totPage", get("totPage"));
		map.put("pageNo", get("pageNo"));
		map.put("inqStaNo", get("inqStaNo"));
		map.put("inqCnt", get("inqCnt"));
		map.put("srchKrd", get("srchKrd"));
		map.put("minAm", get("minAm"));
		map.put("maxAm", get("maxAm"));
		map.put("grid", get("grid"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -166443203:/* fstNewRcknDt */
			return getFstNewRcknDt();
		case 1182519095:/* nsnctPrchPvdt */
			return getNsnctPrchPvdt();
		case 2095898390:/* nsnctCackPvdt */
			return getNsnctCackPvdt();
		case 1342550427:/* payAvlAm */
			return getPayAvlAm();
		case -2023726124:/* nsnctBchkPvdt */
			return getNsnctBchkPvdt();
		case 1210564844:/* cnrnRgsYn */
			return getCnrnRgsYn();
		case -1066835909:/* owacFnm */
			return getOwacFnm();
		case 3435861:/* pdcd */
			return getPdcd();
		case 860655372:/* nsnctEtcObcPvdt */
			return getNsnctEtcObcPvdt();
		case 1078862091:/* cusUsgAcno */
			return getCusUsgAcno();
		case 868429615:/* synpbPdcd */
			return getSynpbPdcd();
		case -640240444:/* newRcknDt */
			return getNewRcknDt();
		case 1884043873:/* cnsgComNm */
			return getCnsgComNm();
		case 94950876:/* ctBal */
			return getCtBal();
		case 2988387:/* acno */
			return getAcno();
		case -1422196194:/* adntYn */
			return getAdntYn();
		case 1287004734:/* nsnctBokBchkPvdt */
			return getNsnctBokBchkPvdt();
		case 1630724755:/* lstTrnDt */
			return getLstTrnDt();
		case 1340105412:/* nsnctPmbilPvdt */
			return getNsnctPmbilPvdt();
		case 1954205551:/* inqAcno */
			return getInqAcno();
		case -224804033:/* psklEpdt */
			return getPsklEpdt();
		case -1559022651:/* actMngBrcd */
			return getActMngBrcd();
		case 1361204989:/* pbokLnlmAm */
			return getPbokLnlmAm();
		case 959957425:/* nxtPidDt */
			return getNxtPidDt();
		case 347365439:/* nstlObcAm */
			return getNstlObcAm();
		case -867952652:/* totBal */
			return getTotBal();
		case 1359144975:/* paySumAm */
			return getPaySumAm();
		case -2056049038:/* rcvSumAm */
			return getRcvSumAm();
		case -862544386:/* totSumAm */
			return getTotSumAm();
		case -993102348:/* pdcdNm */
			return getPdcdNm();
		case 874610991:/* pageUsgYn */
			return getPageUsgYn();
		case -313358706:/* nxtPageYn */
			return getNxtPageYn();
		case -867951280:/* totCnt */
			return getTotCnt();
		case -1136311416:/* totPage */
			return getTotPage();
		case -995752784:/* pageNo */
			return getPageNo();
		case 467946357:/* inqStaNo */
			return getInqStaNo();
		case -1183884835:/* inqCnt */
			return getInqCnt();
		case -1952933319:/* srchKrd */
			return getSrchKrd();
		case 103899678:/* minAm */
			return getMinAm();
		case 103670960:/* maxAm */
			return getMaxAm();
		case 3181382:/* grid */
			return getGrid();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -166443203:/* fstNewRcknDt */
			setFstNewRcknDt((String)value);
			break;
		case 1182519095:/* nsnctPrchPvdt */
			if ( value instanceof String ){
				setNsnctPrchPvdt((String)value);
			}
			else if ( value instanceof Double ){
				setNsnctPrchPvdt((Double)value);
			}
			else if ( value instanceof Long ){
				setNsnctPrchPvdt((Long)value);
			}
			else{
				setNsnctPrchPvdt((BigDecimal)value);
			}
			break;
		case 2095898390:/* nsnctCackPvdt */
			if ( value instanceof String ){
				setNsnctCackPvdt((String)value);
			}
			else if ( value instanceof Double ){
				setNsnctCackPvdt((Double)value);
			}
			else if ( value instanceof Long ){
				setNsnctCackPvdt((Long)value);
			}
			else{
				setNsnctCackPvdt((BigDecimal)value);
			}
			break;
		case 1342550427:/* payAvlAm */
			if ( value instanceof String ){
				setPayAvlAm((String)value);
			}
			else if ( value instanceof Double ){
				setPayAvlAm((Double)value);
			}
			else if ( value instanceof Long ){
				setPayAvlAm((Long)value);
			}
			else{
				setPayAvlAm((BigDecimal)value);
			}
			break;
		case -2023726124:/* nsnctBchkPvdt */
			if ( value instanceof String ){
				setNsnctBchkPvdt((String)value);
			}
			else if ( value instanceof Double ){
				setNsnctBchkPvdt((Double)value);
			}
			else if ( value instanceof Long ){
				setNsnctBchkPvdt((Long)value);
			}
			else{
				setNsnctBchkPvdt((BigDecimal)value);
			}
			break;
		case 1210564844:/* cnrnRgsYn */
			setCnrnRgsYn((String)value);
			break;
		case -1066835909:/* owacFnm */
			setOwacFnm((String)value);
			break;
		case 3435861:/* pdcd */
			setPdcd((String)value);
			break;
		case 860655372:/* nsnctEtcObcPvdt */
			if ( value instanceof String ){
				setNsnctEtcObcPvdt((String)value);
			}
			else if ( value instanceof Double ){
				setNsnctEtcObcPvdt((Double)value);
			}
			else if ( value instanceof Long ){
				setNsnctEtcObcPvdt((Long)value);
			}
			else{
				setNsnctEtcObcPvdt((BigDecimal)value);
			}
			break;
		case 1078862091:/* cusUsgAcno */
			setCusUsgAcno((String)value);
			break;
		case 868429615:/* synpbPdcd */
			setSynpbPdcd((String)value);
			break;
		case -640240444:/* newRcknDt */
			setNewRcknDt((String)value);
			break;
		case 1884043873:/* cnsgComNm */
			setCnsgComNm((String)value);
			break;
		case 94950876:/* ctBal */
			if ( value instanceof String ){
				setCtBal((String)value);
			}
			else if ( value instanceof Double ){
				setCtBal((Double)value);
			}
			else if ( value instanceof Long ){
				setCtBal((Long)value);
			}
			else{
				setCtBal((BigDecimal)value);
			}
			break;
		case 2988387:/* acno */
			setAcno((String)value);
			break;
		case -1422196194:/* adntYn */
			setAdntYn((String)value);
			break;
		case 1287004734:/* nsnctBokBchkPvdt */
			if ( value instanceof String ){
				setNsnctBokBchkPvdt((String)value);
			}
			else if ( value instanceof Double ){
				setNsnctBokBchkPvdt((Double)value);
			}
			else if ( value instanceof Long ){
				setNsnctBokBchkPvdt((Long)value);
			}
			else{
				setNsnctBokBchkPvdt((BigDecimal)value);
			}
			break;
		case 1630724755:/* lstTrnDt */
			setLstTrnDt((String)value);
			break;
		case 1340105412:/* nsnctPmbilPvdt */
			if ( value instanceof String ){
				setNsnctPmbilPvdt((String)value);
			}
			else if ( value instanceof Double ){
				setNsnctPmbilPvdt((Double)value);
			}
			else if ( value instanceof Long ){
				setNsnctPmbilPvdt((Long)value);
			}
			else{
				setNsnctPmbilPvdt((BigDecimal)value);
			}
			break;
		case 1954205551:/* inqAcno */
			setInqAcno((String)value);
			break;
		case -224804033:/* psklEpdt */
			setPsklEpdt((String)value);
			break;
		case -1559022651:/* actMngBrcd */
			setActMngBrcd((String)value);
			break;
		case 1361204989:/* pbokLnlmAm */
			if ( value instanceof String ){
				setPbokLnlmAm((String)value);
			}
			else if ( value instanceof Double ){
				setPbokLnlmAm((Double)value);
			}
			else if ( value instanceof Long ){
				setPbokLnlmAm((Long)value);
			}
			else{
				setPbokLnlmAm((BigDecimal)value);
			}
			break;
		case 959957425:/* nxtPidDt */
			setNxtPidDt((String)value);
			break;
		case 347365439:/* nstlObcAm */
			if ( value instanceof String ){
				setNstlObcAm((String)value);
			}
			else if ( value instanceof Double ){
				setNstlObcAm((Double)value);
			}
			else if ( value instanceof Long ){
				setNstlObcAm((Long)value);
			}
			else{
				setNstlObcAm((BigDecimal)value);
			}
			break;
		case -867952652:/* totBal */
			if ( value instanceof String ){
				setTotBal((String)value);
			}
			else if ( value instanceof Double ){
				setTotBal((Double)value);
			}
			else if ( value instanceof Long ){
				setTotBal((Long)value);
			}
			else{
				setTotBal((BigDecimal)value);
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
		case -2056049038:/* rcvSumAm */
			if ( value instanceof String ){
				setRcvSumAm((String)value);
			}
			else if ( value instanceof Double ){
				setRcvSumAm((Double)value);
			}
			else if ( value instanceof Long ){
				setRcvSumAm((Long)value);
			}
			else{
				setRcvSumAm((BigDecimal)value);
			}
			break;
		case -862544386:/* totSumAm */
			if ( value instanceof String ){
				setTotSumAm((String)value);
			}
			else if ( value instanceof Double ){
				setTotSumAm((Double)value);
			}
			else if ( value instanceof Long ){
				setTotSumAm((Long)value);
			}
			else{
				setTotSumAm((BigDecimal)value);
			}
			break;
		case -993102348:/* pdcdNm */
			setPdcdNm((String)value);
			break;
		case 874610991:/* pageUsgYn */
			setPageUsgYn((String)value);
			break;
		case -313358706:/* nxtPageYn */
			setNxtPageYn((String)value);
			break;
		case -867951280:/* totCnt */
			setTotCnt((String)value);
			break;
		case -1136311416:/* totPage */
			setTotPage((String)value);
			break;
		case -995752784:/* pageNo */
			setPageNo((String)value);
			break;
		case 467946357:/* inqStaNo */
			setInqStaNo((String)value);
			break;
		case -1183884835:/* inqCnt */
			setInqCnt((String)value);
			break;
		case -1952933319:/* srchKrd */
			setSrchKrd((String)value);
			break;
		case 103899678:/* minAm */
			setMinAm((String)value);
			break;
		case 103670960:/* maxAm */
			setMaxAm((String)value);
			break;
		case 3181382:/* grid */
			setGrid((List<MNPMnyPinFncTrnSelectTrnPrts_DTO>)value);
			break;
		default:
			break;
		}
	}
	
}
