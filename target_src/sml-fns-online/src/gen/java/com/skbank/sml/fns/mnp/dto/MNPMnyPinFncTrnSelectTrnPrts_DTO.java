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
	"payAm", "pbokPrngOtlnCd", "trnTm", "rqspeNm", "trnDt", "trnTxt", "otbrKd", "rcvAm", "trnSrno", "dpsBal", "otbrAm", "trbkGicd", "trbkGicdNm", "otbrKdNm", "trfrvAm"
	, "trbkGicdFlag", "memo", "memoDis", "payYn", "payTmDscd", "d7UnderDtlDpsBal", "d7OverDtlDpsBal", "d31OverDtlDpsBal"
}, name="MNPMnyPinFncTrnSelectTrnPrts_DTO")
@XmlRootElement(name="MNPMnyPinFncTrnSelectTrnPrts_DTO")
@BxmCategory(logicalName="머니클립거래내역조회.공통.출력.IO", description="") 
public class MNPMnyPinFncTrnSelectTrnPrts_DTO implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -1189021486L;
	
	
	
	/**
	 * 지급금액
	 */
	@ApiModelProperty(
		name = "payAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("payAm")
	@BxmOmm_Field(length=19, decimal=3, description="지급금액", align="right", fill="")
	private BigDecimal payAm= new BigDecimal("0");
	
	
	/**
	 * 통장인자적요코드
	 */
	@ApiModelProperty(
		name = "pbokPrngOtlnCd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("pbokPrngOtlnCd")
	@BxmOmm_Field(length=4, decimal=0, description="통장인자적요코드", align="left", fill="")
	private String pbokPrngOtlnCd= "";
	
	
	/**
	 * 거래시각
	 */
	@ApiModelProperty(
		name = "trnTm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("trnTm")
	@BxmOmm_Field(length=6, decimal=0, description="거래시각", align="left", fill="")
	private String trnTm= "";
	
	
	/**
	 * 의뢰인명
	 */
	@ApiModelProperty(
		name = "rqspeNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rqspeNm")
	@BxmOmm_Field(length=16, decimal=0, description="의뢰인명", align="left", fill="")
	private String rqspeNm= "";
	
	
	/**
	 * 거래일자
	 */
	@ApiModelProperty(
		name = "trnDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("trnDt")
	@BxmOmm_Field(length=8, decimal=0, description="거래일자", align="left", fill="")
	private String trnDt= "";
	
	
	/**
	 * 거래내용
	 */
	@ApiModelProperty(
		name = "trnTxt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("trnTxt")
	@BxmOmm_Field(length=40, decimal=0, description="거래내용", align="left", fill="")
	private String trnTxt= "";
	
	
	/**
	 * 타점종류
	 */
	@ApiModelProperty(
		name = "otbrKd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("otbrKd")
	@BxmOmm_Field(length=2, decimal=0, description="타점종류", align="left", fill="")
	private String otbrKd= "";
	
	
	/**
	 * 입금금액
	 */
	@ApiModelProperty(
		name = "rcvAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("rcvAm")
	@BxmOmm_Field(length=19, decimal=3, description="입금금액", align="right", fill="")
	private BigDecimal rcvAm= new BigDecimal("0");
	
	
	/**
	 * 거래일련번호
	 */
	@ApiModelProperty(
		name = "trnSrno"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("trnSrno")
	@BxmOmm_Field(length=7, decimal=0, description="거래일련번호", align="right", fill="")
	private Integer trnSrno= 0;
	
	
	/**
	 * 수신잔액
	 */
	@ApiModelProperty(
		name = "dpsBal"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("dpsBal")
	@BxmOmm_Field(length=19, decimal=3, description="수신잔액", align="right", fill="")
	private BigDecimal dpsBal= new BigDecimal("0");
	
	
	/**
	 * 타점금액
	 */
	@ApiModelProperty(
		name = "otbrAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("otbrAm")
	@BxmOmm_Field(length=19, decimal=3, description="타점금액", align="right", fill="")
	private BigDecimal otbrAm= new BigDecimal("0");
	
	
	/**
	 * 거래은행지로코드
	 */
	@ApiModelProperty(
		name = "trbkGicd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("trbkGicd")
	@BxmOmm_Field(length=7, decimal=0, description="거래은행지로코드", align="left", fill="")
	private String trbkGicd= "";
	
	
	/**
	 * 거래은행지로코드명
	 */
	@ApiModelProperty(
		name = "trbkGicdNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("trbkGicdNm")
	@BxmOmm_Field(length=100, decimal=0, description="거래은행지로코드명", align="left", fill="")
	private String trbkGicdNm= "";
	
	
	/**
	 * 타점종류명
	 */
	@ApiModelProperty(
		name = "otbrKdNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("otbrKdNm")
	@BxmOmm_Field(length=100, decimal=0, description="타점종류명", align="left", fill="")
	private String otbrKdNm= "";
	
	
	/**
	 * 대체입금금액
	 */
	@ApiModelProperty(
		name = "trfrvAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("trfrvAm")
	@BxmOmm_Field(length=19, decimal=3, description="대체입금금액", align="right", fill="")
	private BigDecimal trfrvAm= new BigDecimal("0");
	
	
	/**
	 * 거래은행지로코드플래그
	 */
	@ApiModelProperty(
		name = "trbkGicdFlag"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("trbkGicdFlag")
	@BxmOmm_Field(length=1, decimal=0, description="거래은행지로코드플래그", align="left", fill="")
	private String trbkGicdFlag= "";
	
	
	/**
	 * 메모
	 */
	@ApiModelProperty(
		name = "memo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("memo")
	@BxmOmm_Field(length=40, decimal=0, description="메모", align="left", fill="")
	private String memo= "";
	
	
	/**
	 * 메모구분
	 */
	@ApiModelProperty(
		name = "memoDis"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("memoDis")
	@BxmOmm_Field(length=2, decimal=0, description="메모구분", align="left", fill="")
	private String memoDis= "";
	
	
	/**
	 * 지급여부
	 */
	@ApiModelProperty(
		name = "payYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("payYn")
	@BxmOmm_Field(length=1, decimal=0, description="지급여부", align="left", fill="")
	private String payYn= "";
	
	
	/**
	 * 지급기간구분코드
	 */
	@ApiModelProperty(
		name = "payTmDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("payTmDscd")
	@BxmOmm_Field(length=1, decimal=0, description="지급기간구분코드", align="left", fill="")
	private String payTmDscd= "";
	
	
	/**
	 * 7일미만상세수신잔액
	 */
	@ApiModelProperty(
		name = "d7UnderDtlDpsBal"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("d7UnderDtlDpsBal")
	@BxmOmm_Field(length=19, decimal=3, description="7일미만상세수신잔액", align="right", fill="")
	private BigDecimal d7UnderDtlDpsBal= new BigDecimal("0");
	
	
	/**
	 * 7일이상상세수신잔액
	 */
	@ApiModelProperty(
		name = "d7OverDtlDpsBal"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("d7OverDtlDpsBal")
	@BxmOmm_Field(length=19, decimal=3, description="7일이상상세수신잔액", align="right", fill="")
	private BigDecimal d7OverDtlDpsBal= new BigDecimal("0");
	
	
	/**
	 * 31일이상상세수신잔액
	 */
	@ApiModelProperty(
		name = "d31OverDtlDpsBal"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("d31OverDtlDpsBal")
	@BxmOmm_Field(length=19, decimal=3, description="31일이상상세수신잔액", align="right", fill="")
	private BigDecimal d31OverDtlDpsBal= new BigDecimal("0");
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_payAm= false;
	protected final boolean isSet_payAm(){
		return this.isSet_payAm;
	}
	private void setIsSet_payAm(boolean value){
		this.isSet_payAm= value;
	}
	/**
	 * 지급금액
	 * BigDecimal - Double value setter
	 *
	 * @Param payAm 지급금액
	 */
	public void setPayAm(double payAm) {
		setPayAm(BigDecimal.valueOf(payAm));
	}
	/**
	 * 지급금액
	 * BigDecimal - Long value setter
	 *
	 * @Param payAm 지급금액
	 */
	public void setPayAm(long payAm) {
		setPayAm(BigDecimal.valueOf(payAm));
	}
	/**
	 * 지급금액
	 * BigDecimal - String value setter
	 *
	 * @Param payAm 지급금액
	 */
	public void setPayAm(String payAm) {
		setPayAm(new BigDecimal(payAm));
	}
	/**
	 * 지급금액
	 */
	@XmlTransient
	public BigDecimal getPayAm(){
		return this.payAm;
	}
	
	/**
	 * 지급금액
	 * 
	 * @param payAm 지급금액
	 */
	@JsonSetter("payAm")
	public void setPayAm(BigDecimal payAm){
		this.payAm= payAm;
		this.setIsSet_payAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pbokPrngOtlnCd= false;
	protected final boolean isSet_pbokPrngOtlnCd(){
		return this.isSet_pbokPrngOtlnCd;
	}
	private void setIsSet_pbokPrngOtlnCd(boolean value){
		this.isSet_pbokPrngOtlnCd= value;
	}
	/**
	 * 통장인자적요코드
	 */
	@XmlTransient
	public String getPbokPrngOtlnCd(){
		return this.pbokPrngOtlnCd;
	}
	
	/**
	 * 통장인자적요코드
	 * 
	 * @param pbokPrngOtlnCd 통장인자적요코드
	 */
	public void setPbokPrngOtlnCd(String pbokPrngOtlnCd){
		this.pbokPrngOtlnCd= pbokPrngOtlnCd;
		this.setIsSet_pbokPrngOtlnCd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_trnTm= false;
	protected final boolean isSet_trnTm(){
		return this.isSet_trnTm;
	}
	private void setIsSet_trnTm(boolean value){
		this.isSet_trnTm= value;
	}
	/**
	 * 거래시각
	 */
	@XmlTransient
	public String getTrnTm(){
		return this.trnTm;
	}
	
	/**
	 * 거래시각
	 * 
	 * @param trnTm 거래시각
	 */
	public void setTrnTm(String trnTm){
		this.trnTm= trnTm;
		this.setIsSet_trnTm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rqspeNm= false;
	protected final boolean isSet_rqspeNm(){
		return this.isSet_rqspeNm;
	}
	private void setIsSet_rqspeNm(boolean value){
		this.isSet_rqspeNm= value;
	}
	/**
	 * 의뢰인명
	 */
	@XmlTransient
	public String getRqspeNm(){
		return this.rqspeNm;
	}
	
	/**
	 * 의뢰인명
	 * 
	 * @param rqspeNm 의뢰인명
	 */
	public void setRqspeNm(String rqspeNm){
		this.rqspeNm= rqspeNm;
		this.setIsSet_rqspeNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_trnDt= false;
	protected final boolean isSet_trnDt(){
		return this.isSet_trnDt;
	}
	private void setIsSet_trnDt(boolean value){
		this.isSet_trnDt= value;
	}
	/**
	 * 거래일자
	 */
	@XmlTransient
	public String getTrnDt(){
		return this.trnDt;
	}
	
	/**
	 * 거래일자
	 * 
	 * @param trnDt 거래일자
	 */
	public void setTrnDt(String trnDt){
		this.trnDt= trnDt;
		this.setIsSet_trnDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_trnTxt= false;
	protected final boolean isSet_trnTxt(){
		return this.isSet_trnTxt;
	}
	private void setIsSet_trnTxt(boolean value){
		this.isSet_trnTxt= value;
	}
	/**
	 * 거래내용
	 */
	@XmlTransient
	public String getTrnTxt(){
		return this.trnTxt;
	}
	
	/**
	 * 거래내용
	 * 
	 * @param trnTxt 거래내용
	 */
	public void setTrnTxt(String trnTxt){
		this.trnTxt= trnTxt;
		this.setIsSet_trnTxt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_otbrKd= false;
	protected final boolean isSet_otbrKd(){
		return this.isSet_otbrKd;
	}
	private void setIsSet_otbrKd(boolean value){
		this.isSet_otbrKd= value;
	}
	/**
	 * 타점종류
	 */
	@XmlTransient
	public String getOtbrKd(){
		return this.otbrKd;
	}
	
	/**
	 * 타점종류
	 * 
	 * @param otbrKd 타점종류
	 */
	public void setOtbrKd(String otbrKd){
		this.otbrKd= otbrKd;
		this.setIsSet_otbrKd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rcvAm= false;
	protected final boolean isSet_rcvAm(){
		return this.isSet_rcvAm;
	}
	private void setIsSet_rcvAm(boolean value){
		this.isSet_rcvAm= value;
	}
	/**
	 * 입금금액
	 * BigDecimal - Double value setter
	 *
	 * @Param rcvAm 입금금액
	 */
	public void setRcvAm(double rcvAm) {
		setRcvAm(BigDecimal.valueOf(rcvAm));
	}
	/**
	 * 입금금액
	 * BigDecimal - Long value setter
	 *
	 * @Param rcvAm 입금금액
	 */
	public void setRcvAm(long rcvAm) {
		setRcvAm(BigDecimal.valueOf(rcvAm));
	}
	/**
	 * 입금금액
	 * BigDecimal - String value setter
	 *
	 * @Param rcvAm 입금금액
	 */
	public void setRcvAm(String rcvAm) {
		setRcvAm(new BigDecimal(rcvAm));
	}
	/**
	 * 입금금액
	 */
	@XmlTransient
	public BigDecimal getRcvAm(){
		return this.rcvAm;
	}
	
	/**
	 * 입금금액
	 * 
	 * @param rcvAm 입금금액
	 */
	@JsonSetter("rcvAm")
	public void setRcvAm(BigDecimal rcvAm){
		this.rcvAm= rcvAm;
		this.setIsSet_rcvAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_trnSrno= false;
	protected final boolean isSet_trnSrno(){
		return this.isSet_trnSrno;
	}
	private void setIsSet_trnSrno(boolean value){
		this.isSet_trnSrno= value;
	}
	/**
	 * 거래일련번호
	 */
	@XmlTransient
	public Integer getTrnSrno(){
		return this.trnSrno;
	}
	
	/**
	 * 거래일련번호
	 * 
	 * @param trnSrno 거래일련번호
	 */
	public void setTrnSrno(Integer trnSrno){
		this.trnSrno= trnSrno;
		this.setIsSet_trnSrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dpsBal= false;
	protected final boolean isSet_dpsBal(){
		return this.isSet_dpsBal;
	}
	private void setIsSet_dpsBal(boolean value){
		this.isSet_dpsBal= value;
	}
	/**
	 * 수신잔액
	 * BigDecimal - Double value setter
	 *
	 * @Param dpsBal 수신잔액
	 */
	public void setDpsBal(double dpsBal) {
		setDpsBal(BigDecimal.valueOf(dpsBal));
	}
	/**
	 * 수신잔액
	 * BigDecimal - Long value setter
	 *
	 * @Param dpsBal 수신잔액
	 */
	public void setDpsBal(long dpsBal) {
		setDpsBal(BigDecimal.valueOf(dpsBal));
	}
	/**
	 * 수신잔액
	 * BigDecimal - String value setter
	 *
	 * @Param dpsBal 수신잔액
	 */
	public void setDpsBal(String dpsBal) {
		setDpsBal(new BigDecimal(dpsBal));
	}
	/**
	 * 수신잔액
	 */
	@XmlTransient
	public BigDecimal getDpsBal(){
		return this.dpsBal;
	}
	
	/**
	 * 수신잔액
	 * 
	 * @param dpsBal 수신잔액
	 */
	@JsonSetter("dpsBal")
	public void setDpsBal(BigDecimal dpsBal){
		this.dpsBal= dpsBal;
		this.setIsSet_dpsBal(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_otbrAm= false;
	protected final boolean isSet_otbrAm(){
		return this.isSet_otbrAm;
	}
	private void setIsSet_otbrAm(boolean value){
		this.isSet_otbrAm= value;
	}
	/**
	 * 타점금액
	 * BigDecimal - Double value setter
	 *
	 * @Param otbrAm 타점금액
	 */
	public void setOtbrAm(double otbrAm) {
		setOtbrAm(BigDecimal.valueOf(otbrAm));
	}
	/**
	 * 타점금액
	 * BigDecimal - Long value setter
	 *
	 * @Param otbrAm 타점금액
	 */
	public void setOtbrAm(long otbrAm) {
		setOtbrAm(BigDecimal.valueOf(otbrAm));
	}
	/**
	 * 타점금액
	 * BigDecimal - String value setter
	 *
	 * @Param otbrAm 타점금액
	 */
	public void setOtbrAm(String otbrAm) {
		setOtbrAm(new BigDecimal(otbrAm));
	}
	/**
	 * 타점금액
	 */
	@XmlTransient
	public BigDecimal getOtbrAm(){
		return this.otbrAm;
	}
	
	/**
	 * 타점금액
	 * 
	 * @param otbrAm 타점금액
	 */
	@JsonSetter("otbrAm")
	public void setOtbrAm(BigDecimal otbrAm){
		this.otbrAm= otbrAm;
		this.setIsSet_otbrAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_trbkGicd= false;
	protected final boolean isSet_trbkGicd(){
		return this.isSet_trbkGicd;
	}
	private void setIsSet_trbkGicd(boolean value){
		this.isSet_trbkGicd= value;
	}
	/**
	 * 거래은행지로코드
	 */
	@XmlTransient
	public String getTrbkGicd(){
		return this.trbkGicd;
	}
	
	/**
	 * 거래은행지로코드
	 * 
	 * @param trbkGicd 거래은행지로코드
	 */
	public void setTrbkGicd(String trbkGicd){
		this.trbkGicd= trbkGicd;
		this.setIsSet_trbkGicd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_trbkGicdNm= false;
	protected final boolean isSet_trbkGicdNm(){
		return this.isSet_trbkGicdNm;
	}
	private void setIsSet_trbkGicdNm(boolean value){
		this.isSet_trbkGicdNm= value;
	}
	/**
	 * 거래은행지로코드명
	 */
	@XmlTransient
	public String getTrbkGicdNm(){
		return this.trbkGicdNm;
	}
	
	/**
	 * 거래은행지로코드명
	 * 
	 * @param trbkGicdNm 거래은행지로코드명
	 */
	public void setTrbkGicdNm(String trbkGicdNm){
		this.trbkGicdNm= trbkGicdNm;
		this.setIsSet_trbkGicdNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_otbrKdNm= false;
	protected final boolean isSet_otbrKdNm(){
		return this.isSet_otbrKdNm;
	}
	private void setIsSet_otbrKdNm(boolean value){
		this.isSet_otbrKdNm= value;
	}
	/**
	 * 타점종류명
	 */
	@XmlTransient
	public String getOtbrKdNm(){
		return this.otbrKdNm;
	}
	
	/**
	 * 타점종류명
	 * 
	 * @param otbrKdNm 타점종류명
	 */
	public void setOtbrKdNm(String otbrKdNm){
		this.otbrKdNm= otbrKdNm;
		this.setIsSet_otbrKdNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_trfrvAm= false;
	protected final boolean isSet_trfrvAm(){
		return this.isSet_trfrvAm;
	}
	private void setIsSet_trfrvAm(boolean value){
		this.isSet_trfrvAm= value;
	}
	/**
	 * 대체입금금액
	 * BigDecimal - Double value setter
	 *
	 * @Param trfrvAm 대체입금금액
	 */
	public void setTrfrvAm(double trfrvAm) {
		setTrfrvAm(BigDecimal.valueOf(trfrvAm));
	}
	/**
	 * 대체입금금액
	 * BigDecimal - Long value setter
	 *
	 * @Param trfrvAm 대체입금금액
	 */
	public void setTrfrvAm(long trfrvAm) {
		setTrfrvAm(BigDecimal.valueOf(trfrvAm));
	}
	/**
	 * 대체입금금액
	 * BigDecimal - String value setter
	 *
	 * @Param trfrvAm 대체입금금액
	 */
	public void setTrfrvAm(String trfrvAm) {
		setTrfrvAm(new BigDecimal(trfrvAm));
	}
	/**
	 * 대체입금금액
	 */
	@XmlTransient
	public BigDecimal getTrfrvAm(){
		return this.trfrvAm;
	}
	
	/**
	 * 대체입금금액
	 * 
	 * @param trfrvAm 대체입금금액
	 */
	@JsonSetter("trfrvAm")
	public void setTrfrvAm(BigDecimal trfrvAm){
		this.trfrvAm= trfrvAm;
		this.setIsSet_trfrvAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_trbkGicdFlag= false;
	protected final boolean isSet_trbkGicdFlag(){
		return this.isSet_trbkGicdFlag;
	}
	private void setIsSet_trbkGicdFlag(boolean value){
		this.isSet_trbkGicdFlag= value;
	}
	/**
	 * 거래은행지로코드플래그
	 */
	@XmlTransient
	public String getTrbkGicdFlag(){
		return this.trbkGicdFlag;
	}
	
	/**
	 * 거래은행지로코드플래그
	 * 
	 * @param trbkGicdFlag 거래은행지로코드플래그
	 */
	public void setTrbkGicdFlag(String trbkGicdFlag){
		this.trbkGicdFlag= trbkGicdFlag;
		this.setIsSet_trbkGicdFlag(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_memo= false;
	protected final boolean isSet_memo(){
		return this.isSet_memo;
	}
	private void setIsSet_memo(boolean value){
		this.isSet_memo= value;
	}
	/**
	 * 메모
	 */
	@XmlTransient
	public String getMemo(){
		return this.memo;
	}
	
	/**
	 * 메모
	 * 
	 * @param memo 메모
	 */
	public void setMemo(String memo){
		this.memo= memo;
		this.setIsSet_memo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_memoDis= false;
	protected final boolean isSet_memoDis(){
		return this.isSet_memoDis;
	}
	private void setIsSet_memoDis(boolean value){
		this.isSet_memoDis= value;
	}
	/**
	 * 메모구분
	 */
	@XmlTransient
	public String getMemoDis(){
		return this.memoDis;
	}
	
	/**
	 * 메모구분
	 * 
	 * @param memoDis 메모구분
	 */
	public void setMemoDis(String memoDis){
		this.memoDis= memoDis;
		this.setIsSet_memoDis(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_payYn= false;
	protected final boolean isSet_payYn(){
		return this.isSet_payYn;
	}
	private void setIsSet_payYn(boolean value){
		this.isSet_payYn= value;
	}
	/**
	 * 지급여부
	 */
	@XmlTransient
	public String getPayYn(){
		return this.payYn;
	}
	
	/**
	 * 지급여부
	 * 
	 * @param payYn 지급여부
	 */
	public void setPayYn(String payYn){
		this.payYn= payYn;
		this.setIsSet_payYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_payTmDscd= false;
	protected final boolean isSet_payTmDscd(){
		return this.isSet_payTmDscd;
	}
	private void setIsSet_payTmDscd(boolean value){
		this.isSet_payTmDscd= value;
	}
	/**
	 * 지급기간구분코드
	 */
	@XmlTransient
	public String getPayTmDscd(){
		return this.payTmDscd;
	}
	
	/**
	 * 지급기간구분코드
	 * 
	 * @param payTmDscd 지급기간구분코드
	 */
	public void setPayTmDscd(String payTmDscd){
		this.payTmDscd= payTmDscd;
		this.setIsSet_payTmDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_d7UnderDtlDpsBal= false;
	protected final boolean isSet_d7UnderDtlDpsBal(){
		return this.isSet_d7UnderDtlDpsBal;
	}
	private void setIsSet_d7UnderDtlDpsBal(boolean value){
		this.isSet_d7UnderDtlDpsBal= value;
	}
	/**
	 * 7일미만상세수신잔액
	 * BigDecimal - Double value setter
	 *
	 * @Param d7UnderDtlDpsBal 7일미만상세수신잔액
	 */
	public void setD7UnderDtlDpsBal(double d7UnderDtlDpsBal) {
		setD7UnderDtlDpsBal(BigDecimal.valueOf(d7UnderDtlDpsBal));
	}
	/**
	 * 7일미만상세수신잔액
	 * BigDecimal - Long value setter
	 *
	 * @Param d7UnderDtlDpsBal 7일미만상세수신잔액
	 */
	public void setD7UnderDtlDpsBal(long d7UnderDtlDpsBal) {
		setD7UnderDtlDpsBal(BigDecimal.valueOf(d7UnderDtlDpsBal));
	}
	/**
	 * 7일미만상세수신잔액
	 * BigDecimal - String value setter
	 *
	 * @Param d7UnderDtlDpsBal 7일미만상세수신잔액
	 */
	public void setD7UnderDtlDpsBal(String d7UnderDtlDpsBal) {
		setD7UnderDtlDpsBal(new BigDecimal(d7UnderDtlDpsBal));
	}
	/**
	 * 7일미만상세수신잔액
	 */
	@XmlTransient
	public BigDecimal getD7UnderDtlDpsBal(){
		return this.d7UnderDtlDpsBal;
	}
	
	/**
	 * 7일미만상세수신잔액
	 * 
	 * @param d7UnderDtlDpsBal 7일미만상세수신잔액
	 */
	@JsonSetter("d7UnderDtlDpsBal")
	public void setD7UnderDtlDpsBal(BigDecimal d7UnderDtlDpsBal){
		this.d7UnderDtlDpsBal= d7UnderDtlDpsBal;
		this.setIsSet_d7UnderDtlDpsBal(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_d7OverDtlDpsBal= false;
	protected final boolean isSet_d7OverDtlDpsBal(){
		return this.isSet_d7OverDtlDpsBal;
	}
	private void setIsSet_d7OverDtlDpsBal(boolean value){
		this.isSet_d7OverDtlDpsBal= value;
	}
	/**
	 * 7일이상상세수신잔액
	 * BigDecimal - Double value setter
	 *
	 * @Param d7OverDtlDpsBal 7일이상상세수신잔액
	 */
	public void setD7OverDtlDpsBal(double d7OverDtlDpsBal) {
		setD7OverDtlDpsBal(BigDecimal.valueOf(d7OverDtlDpsBal));
	}
	/**
	 * 7일이상상세수신잔액
	 * BigDecimal - Long value setter
	 *
	 * @Param d7OverDtlDpsBal 7일이상상세수신잔액
	 */
	public void setD7OverDtlDpsBal(long d7OverDtlDpsBal) {
		setD7OverDtlDpsBal(BigDecimal.valueOf(d7OverDtlDpsBal));
	}
	/**
	 * 7일이상상세수신잔액
	 * BigDecimal - String value setter
	 *
	 * @Param d7OverDtlDpsBal 7일이상상세수신잔액
	 */
	public void setD7OverDtlDpsBal(String d7OverDtlDpsBal) {
		setD7OverDtlDpsBal(new BigDecimal(d7OverDtlDpsBal));
	}
	/**
	 * 7일이상상세수신잔액
	 */
	@XmlTransient
	public BigDecimal getD7OverDtlDpsBal(){
		return this.d7OverDtlDpsBal;
	}
	
	/**
	 * 7일이상상세수신잔액
	 * 
	 * @param d7OverDtlDpsBal 7일이상상세수신잔액
	 */
	@JsonSetter("d7OverDtlDpsBal")
	public void setD7OverDtlDpsBal(BigDecimal d7OverDtlDpsBal){
		this.d7OverDtlDpsBal= d7OverDtlDpsBal;
		this.setIsSet_d7OverDtlDpsBal(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_d31OverDtlDpsBal= false;
	protected final boolean isSet_d31OverDtlDpsBal(){
		return this.isSet_d31OverDtlDpsBal;
	}
	private void setIsSet_d31OverDtlDpsBal(boolean value){
		this.isSet_d31OverDtlDpsBal= value;
	}
	/**
	 * 31일이상상세수신잔액
	 * BigDecimal - Double value setter
	 *
	 * @Param d31OverDtlDpsBal 31일이상상세수신잔액
	 */
	public void setD31OverDtlDpsBal(double d31OverDtlDpsBal) {
		setD31OverDtlDpsBal(BigDecimal.valueOf(d31OverDtlDpsBal));
	}
	/**
	 * 31일이상상세수신잔액
	 * BigDecimal - Long value setter
	 *
	 * @Param d31OverDtlDpsBal 31일이상상세수신잔액
	 */
	public void setD31OverDtlDpsBal(long d31OverDtlDpsBal) {
		setD31OverDtlDpsBal(BigDecimal.valueOf(d31OverDtlDpsBal));
	}
	/**
	 * 31일이상상세수신잔액
	 * BigDecimal - String value setter
	 *
	 * @Param d31OverDtlDpsBal 31일이상상세수신잔액
	 */
	public void setD31OverDtlDpsBal(String d31OverDtlDpsBal) {
		setD31OverDtlDpsBal(new BigDecimal(d31OverDtlDpsBal));
	}
	/**
	 * 31일이상상세수신잔액
	 */
	@XmlTransient
	public BigDecimal getD31OverDtlDpsBal(){
		return this.d31OverDtlDpsBal;
	}
	
	/**
	 * 31일이상상세수신잔액
	 * 
	 * @param d31OverDtlDpsBal 31일이상상세수신잔액
	 */
	@JsonSetter("d31OverDtlDpsBal")
	public void setD31OverDtlDpsBal(BigDecimal d31OverDtlDpsBal){
		this.d31OverDtlDpsBal= d31OverDtlDpsBal;
		this.setIsSet_d31OverDtlDpsBal(true);
	}
				
	@Override
	public MNPMnyPinFncTrnSelectTrnPrts_DTO clone(){
		try{
			MNPMnyPinFncTrnSelectTrnPrts_DTO object= (MNPMnyPinFncTrnSelectTrnPrts_DTO)super.clone();
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
		
		result= prime * result + ((this.payAm==null)?0:this.payAm.hashCode());
		result= prime * result + ((this.pbokPrngOtlnCd==null)?0:this.pbokPrngOtlnCd.hashCode());
		result= prime * result + ((this.trnTm==null)?0:this.trnTm.hashCode());
		result= prime * result + ((this.rqspeNm==null)?0:this.rqspeNm.hashCode());
		result= prime * result + ((this.trnDt==null)?0:this.trnDt.hashCode());
		result= prime * result + ((this.trnTxt==null)?0:this.trnTxt.hashCode());
		result= prime * result + ((this.otbrKd==null)?0:this.otbrKd.hashCode());
		result= prime * result + ((this.rcvAm==null)?0:this.rcvAm.hashCode());
		result= prime * result + ((this.trnSrno==null)?0:this.trnSrno.hashCode());
		result= prime * result + ((this.dpsBal==null)?0:this.dpsBal.hashCode());
		result= prime * result + ((this.otbrAm==null)?0:this.otbrAm.hashCode());
		result= prime * result + ((this.trbkGicd==null)?0:this.trbkGicd.hashCode());
		result= prime * result + ((this.trbkGicdNm==null)?0:this.trbkGicdNm.hashCode());
		result= prime * result + ((this.otbrKdNm==null)?0:this.otbrKdNm.hashCode());
		result= prime * result + ((this.trfrvAm==null)?0:this.trfrvAm.hashCode());
		result= prime * result + ((this.trbkGicdFlag==null)?0:this.trbkGicdFlag.hashCode());
		result= prime * result + ((this.memo==null)?0:this.memo.hashCode());
		result= prime * result + ((this.memoDis==null)?0:this.memoDis.hashCode());
		result= prime * result + ((this.payYn==null)?0:this.payYn.hashCode());
		result= prime * result + ((this.payTmDscd==null)?0:this.payTmDscd.hashCode());
		result= prime * result + ((this.d7UnderDtlDpsBal==null)?0:this.d7UnderDtlDpsBal.hashCode());
		result= prime * result + ((this.d7OverDtlDpsBal==null)?0:this.d7OverDtlDpsBal.hashCode());
		result= prime * result + ((this.d31OverDtlDpsBal==null)?0:this.d31OverDtlDpsBal.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MNPMnyPinFncTrnSelectTrnPrts_DTO other= (MNPMnyPinFncTrnSelectTrnPrts_DTO)obj;
		{
			Object _payAm= getPayAm();
			Object __payAm= other.getPayAm();
			if ( _payAm== null ) { if ( __payAm!= null ) return false; }
			else if ( !_payAm.equals(__payAm) ) return false;
		}
		{
			Object _pbokPrngOtlnCd= getPbokPrngOtlnCd();
			Object __pbokPrngOtlnCd= other.getPbokPrngOtlnCd();
			if ( _pbokPrngOtlnCd== null ) { if ( __pbokPrngOtlnCd!= null ) return false; }
			else if ( !_pbokPrngOtlnCd.equals(__pbokPrngOtlnCd) ) return false;
		}
		{
			Object _trnTm= getTrnTm();
			Object __trnTm= other.getTrnTm();
			if ( _trnTm== null ) { if ( __trnTm!= null ) return false; }
			else if ( !_trnTm.equals(__trnTm) ) return false;
		}
		{
			Object _rqspeNm= getRqspeNm();
			Object __rqspeNm= other.getRqspeNm();
			if ( _rqspeNm== null ) { if ( __rqspeNm!= null ) return false; }
			else if ( !_rqspeNm.equals(__rqspeNm) ) return false;
		}
		{
			Object _trnDt= getTrnDt();
			Object __trnDt= other.getTrnDt();
			if ( _trnDt== null ) { if ( __trnDt!= null ) return false; }
			else if ( !_trnDt.equals(__trnDt) ) return false;
		}
		{
			Object _trnTxt= getTrnTxt();
			Object __trnTxt= other.getTrnTxt();
			if ( _trnTxt== null ) { if ( __trnTxt!= null ) return false; }
			else if ( !_trnTxt.equals(__trnTxt) ) return false;
		}
		{
			Object _otbrKd= getOtbrKd();
			Object __otbrKd= other.getOtbrKd();
			if ( _otbrKd== null ) { if ( __otbrKd!= null ) return false; }
			else if ( !_otbrKd.equals(__otbrKd) ) return false;
		}
		{
			Object _rcvAm= getRcvAm();
			Object __rcvAm= other.getRcvAm();
			if ( _rcvAm== null ) { if ( __rcvAm!= null ) return false; }
			else if ( !_rcvAm.equals(__rcvAm) ) return false;
		}
		{
			Object _trnSrno= getTrnSrno();
			Object __trnSrno= other.getTrnSrno();
			if ( _trnSrno== null ) { if ( __trnSrno!= null ) return false; }
			else if ( !_trnSrno.equals(__trnSrno) ) return false;
		}
		{
			Object _dpsBal= getDpsBal();
			Object __dpsBal= other.getDpsBal();
			if ( _dpsBal== null ) { if ( __dpsBal!= null ) return false; }
			else if ( !_dpsBal.equals(__dpsBal) ) return false;
		}
		{
			Object _otbrAm= getOtbrAm();
			Object __otbrAm= other.getOtbrAm();
			if ( _otbrAm== null ) { if ( __otbrAm!= null ) return false; }
			else if ( !_otbrAm.equals(__otbrAm) ) return false;
		}
		{
			Object _trbkGicd= getTrbkGicd();
			Object __trbkGicd= other.getTrbkGicd();
			if ( _trbkGicd== null ) { if ( __trbkGicd!= null ) return false; }
			else if ( !_trbkGicd.equals(__trbkGicd) ) return false;
		}
		{
			Object _trbkGicdNm= getTrbkGicdNm();
			Object __trbkGicdNm= other.getTrbkGicdNm();
			if ( _trbkGicdNm== null ) { if ( __trbkGicdNm!= null ) return false; }
			else if ( !_trbkGicdNm.equals(__trbkGicdNm) ) return false;
		}
		{
			Object _otbrKdNm= getOtbrKdNm();
			Object __otbrKdNm= other.getOtbrKdNm();
			if ( _otbrKdNm== null ) { if ( __otbrKdNm!= null ) return false; }
			else if ( !_otbrKdNm.equals(__otbrKdNm) ) return false;
		}
		{
			Object _trfrvAm= getTrfrvAm();
			Object __trfrvAm= other.getTrfrvAm();
			if ( _trfrvAm== null ) { if ( __trfrvAm!= null ) return false; }
			else if ( !_trfrvAm.equals(__trfrvAm) ) return false;
		}
		{
			Object _trbkGicdFlag= getTrbkGicdFlag();
			Object __trbkGicdFlag= other.getTrbkGicdFlag();
			if ( _trbkGicdFlag== null ) { if ( __trbkGicdFlag!= null ) return false; }
			else if ( !_trbkGicdFlag.equals(__trbkGicdFlag) ) return false;
		}
		{
			Object _memo= getMemo();
			Object __memo= other.getMemo();
			if ( _memo== null ) { if ( __memo!= null ) return false; }
			else if ( !_memo.equals(__memo) ) return false;
		}
		{
			Object _memoDis= getMemoDis();
			Object __memoDis= other.getMemoDis();
			if ( _memoDis== null ) { if ( __memoDis!= null ) return false; }
			else if ( !_memoDis.equals(__memoDis) ) return false;
		}
		{
			Object _payYn= getPayYn();
			Object __payYn= other.getPayYn();
			if ( _payYn== null ) { if ( __payYn!= null ) return false; }
			else if ( !_payYn.equals(__payYn) ) return false;
		}
		{
			Object _payTmDscd= getPayTmDscd();
			Object __payTmDscd= other.getPayTmDscd();
			if ( _payTmDscd== null ) { if ( __payTmDscd!= null ) return false; }
			else if ( !_payTmDscd.equals(__payTmDscd) ) return false;
		}
		{
			Object _d7UnderDtlDpsBal= getD7UnderDtlDpsBal();
			Object __d7UnderDtlDpsBal= other.getD7UnderDtlDpsBal();
			if ( _d7UnderDtlDpsBal== null ) { if ( __d7UnderDtlDpsBal!= null ) return false; }
			else if ( !_d7UnderDtlDpsBal.equals(__d7UnderDtlDpsBal) ) return false;
		}
		{
			Object _d7OverDtlDpsBal= getD7OverDtlDpsBal();
			Object __d7OverDtlDpsBal= other.getD7OverDtlDpsBal();
			if ( _d7OverDtlDpsBal== null ) { if ( __d7OverDtlDpsBal!= null ) return false; }
			else if ( !_d7OverDtlDpsBal.equals(__d7OverDtlDpsBal) ) return false;
		}
		{
			Object _d31OverDtlDpsBal= getD31OverDtlDpsBal();
			Object __d31OverDtlDpsBal= other.getD31OverDtlDpsBal();
			if ( _d31OverDtlDpsBal== null ) { if ( __d31OverDtlDpsBal!= null ) return false; }
			else if ( !_d31OverDtlDpsBal.equals(__d31OverDtlDpsBal) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MNPMnyPinFncTrnSelectTrnPrts_DTO.class.getName()).append(":\n");
		sb.append("\tpayAm: ");
		sb.append(payAm==null?"null":getPayAm());
		sb.append("\n");
		sb.append("\tpbokPrngOtlnCd: ");
		sb.append(pbokPrngOtlnCd==null?"null":getPbokPrngOtlnCd());
		sb.append("\n");
		sb.append("\ttrnTm: ");
		sb.append(trnTm==null?"null":getTrnTm());
		sb.append("\n");
		sb.append("\trqspeNm: ");
		sb.append(rqspeNm==null?"null":getRqspeNm());
		sb.append("\n");
		sb.append("\ttrnDt: ");
		sb.append(trnDt==null?"null":getTrnDt());
		sb.append("\n");
		sb.append("\ttrnTxt: ");
		sb.append(trnTxt==null?"null":getTrnTxt());
		sb.append("\n");
		sb.append("\totbrKd: ");
		sb.append(otbrKd==null?"null":getOtbrKd());
		sb.append("\n");
		sb.append("\trcvAm: ");
		sb.append(rcvAm==null?"null":getRcvAm());
		sb.append("\n");
		sb.append("\ttrnSrno: ");
		sb.append(trnSrno==null?"null":getTrnSrno());
		sb.append("\n");
		sb.append("\tdpsBal: ");
		sb.append(dpsBal==null?"null":getDpsBal());
		sb.append("\n");
		sb.append("\totbrAm: ");
		sb.append(otbrAm==null?"null":getOtbrAm());
		sb.append("\n");
		sb.append("\ttrbkGicd: ");
		sb.append(trbkGicd==null?"null":getTrbkGicd());
		sb.append("\n");
		sb.append("\ttrbkGicdNm: ");
		sb.append(trbkGicdNm==null?"null":getTrbkGicdNm());
		sb.append("\n");
		sb.append("\totbrKdNm: ");
		sb.append(otbrKdNm==null?"null":getOtbrKdNm());
		sb.append("\n");
		sb.append("\ttrfrvAm: ");
		sb.append(trfrvAm==null?"null":getTrfrvAm());
		sb.append("\n");
		sb.append("\ttrbkGicdFlag: ");
		sb.append(trbkGicdFlag==null?"null":getTrbkGicdFlag());
		sb.append("\n");
		sb.append("\tmemo: ");
		sb.append(memo==null?"null":getMemo());
		sb.append("\n");
		sb.append("\tmemoDis: ");
		sb.append(memoDis==null?"null":getMemoDis());
		sb.append("\n");
		sb.append("\tpayYn: ");
		sb.append(payYn==null?"null":getPayYn());
		sb.append("\n");
		sb.append("\tpayTmDscd: ");
		sb.append(payTmDscd==null?"null":getPayTmDscd());
		sb.append("\n");
		sb.append("\td7UnderDtlDpsBal: ");
		sb.append(d7UnderDtlDpsBal==null?"null":getD7UnderDtlDpsBal());
		sb.append("\n");
		sb.append("\td7OverDtlDpsBal: ");
		sb.append(d7OverDtlDpsBal==null?"null":getD7OverDtlDpsBal());
		sb.append("\n");
		sb.append("\td31OverDtlDpsBal: ");
		sb.append(d31OverDtlDpsBal==null?"null":getD31OverDtlDpsBal());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 19; /* payAm */
		messageLen+= 4; /* pbokPrngOtlnCd */
		messageLen+= 6; /* trnTm */
		messageLen+= 16; /* rqspeNm */
		messageLen+= 8; /* trnDt */
		messageLen+= 40; /* trnTxt */
		messageLen+= 2; /* otbrKd */
		messageLen+= 19; /* rcvAm */
		messageLen+= 7; /* trnSrno */
		messageLen+= 19; /* dpsBal */
		messageLen+= 19; /* otbrAm */
		messageLen+= 7; /* trbkGicd */
		messageLen+= 100; /* trbkGicdNm */
		messageLen+= 100; /* otbrKdNm */
		messageLen+= 19; /* trfrvAm */
		messageLen+= 1; /* trbkGicdFlag */
		messageLen+= 40; /* memo */
		messageLen+= 2; /* memoDis */
		messageLen+= 1; /* payYn */
		messageLen+= 1; /* payTmDscd */
		messageLen+= 19; /* d7UnderDtlDpsBal */
		messageLen+= 19; /* d7OverDtlDpsBal */
		messageLen+= 19; /* d31OverDtlDpsBal */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("payAm");
		list.add("pbokPrngOtlnCd");
		list.add("trnTm");
		list.add("rqspeNm");
		list.add("trnDt");
		list.add("trnTxt");
		list.add("otbrKd");
		list.add("rcvAm");
		list.add("trnSrno");
		list.add("dpsBal");
		list.add("otbrAm");
		list.add("trbkGicd");
		list.add("trbkGicdNm");
		list.add("otbrKdNm");
		list.add("trfrvAm");
		list.add("trbkGicdFlag");
		list.add("memo");
		list.add("memoDis");
		list.add("payYn");
		list.add("payTmDscd");
		list.add("d7UnderDtlDpsBal");
		list.add("d7OverDtlDpsBal");
		list.add("d31OverDtlDpsBal");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("payAm", get("payAm"));
		map.put("pbokPrngOtlnCd", get("pbokPrngOtlnCd"));
		map.put("trnTm", get("trnTm"));
		map.put("rqspeNm", get("rqspeNm"));
		map.put("trnDt", get("trnDt"));
		map.put("trnTxt", get("trnTxt"));
		map.put("otbrKd", get("otbrKd"));
		map.put("rcvAm", get("rcvAm"));
		map.put("trnSrno", get("trnSrno"));
		map.put("dpsBal", get("dpsBal"));
		map.put("otbrAm", get("otbrAm"));
		map.put("trbkGicd", get("trbkGicd"));
		map.put("trbkGicdNm", get("trbkGicdNm"));
		map.put("otbrKdNm", get("otbrKdNm"));
		map.put("trfrvAm", get("trfrvAm"));
		map.put("trbkGicdFlag", get("trbkGicdFlag"));
		map.put("memo", get("memo"));
		map.put("memoDis", get("memoDis"));
		map.put("payYn", get("payYn"));
		map.put("payTmDscd", get("payTmDscd"));
		map.put("d7UnderDtlDpsBal", get("d7UnderDtlDpsBal"));
		map.put("d7OverDtlDpsBal", get("d7OverDtlDpsBal"));
		map.put("d31OverDtlDpsBal", get("d31OverDtlDpsBal"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 106442484:/* payAm */
			return getPayAm();
		case -2029895183:/* pbokPrngOtlnCd */
			return getPbokPrngOtlnCd();
		case 110633033:/* trnTm */
			return getTrnTm();
		case 1440939688:/* rqspeNm */
			return getRqspeNm();
		case 110632544:/* trnDt */
			return getTrnDt();
		case -865342816:/* trnTxt */
			return getTrnTxt();
		case -1006971602:/* otbrKd */
			return getOtbrKd();
		case 108346225:/* rcvAm */
			return getRcvAm();
		case -1055859152:/* trnSrno */
			return getTrnSrno();
		case -1325125338:/* dpsBal */
			return getDpsBal();
		case -1006971903:/* otbrAm */
			return getOtbrAm();
		case 1305433258:/* trbkGicd */
			return getTrbkGicd();
		case 390913033:/* trbkGicdNm */
			return getTrbkGicdNm();
		case -1332065395:/* otbrKdNm */
			return getOtbrKdNm();
		case -1062321352:/* trfrvAm */
			return getTrfrvAm();
		case 2005033782:/* trbkGicdFlag */
			return getTrbkGicdFlag();
		case 3347770:/* memo */
			return getMemo();
		case 949236980:/* memoDis */
			return getMemoDis();
		case 106443229:/* payYn */
			return getPayYn();
		case -796111343:/* payTmDscd */
			return getPayTmDscd();
		case -1373460131:/* d7UnderDtlDpsBal */
			return getD7UnderDtlDpsBal();
		case -1923358181:/* d7OverDtlDpsBal */
			return getD7OverDtlDpsBal();
		case 740588812:/* d31OverDtlDpsBal */
			return getD31OverDtlDpsBal();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 106442484:/* payAm */
			if ( value instanceof String ){
				setPayAm((String)value);
			}
			else if ( value instanceof Double ){
				setPayAm((Double)value);
			}
			else if ( value instanceof Long ){
				setPayAm((Long)value);
			}
			else{
				setPayAm((BigDecimal)value);
			}
			break;
		case -2029895183:/* pbokPrngOtlnCd */
			setPbokPrngOtlnCd((String)value);
			break;
		case 110633033:/* trnTm */
			setTrnTm((String)value);
			break;
		case 1440939688:/* rqspeNm */
			setRqspeNm((String)value);
			break;
		case 110632544:/* trnDt */
			setTrnDt((String)value);
			break;
		case -865342816:/* trnTxt */
			setTrnTxt((String)value);
			break;
		case -1006971602:/* otbrKd */
			setOtbrKd((String)value);
			break;
		case 108346225:/* rcvAm */
			if ( value instanceof String ){
				setRcvAm((String)value);
			}
			else if ( value instanceof Double ){
				setRcvAm((Double)value);
			}
			else if ( value instanceof Long ){
				setRcvAm((Long)value);
			}
			else{
				setRcvAm((BigDecimal)value);
			}
			break;
		case -1055859152:/* trnSrno */
			setTrnSrno((Integer)value);
			break;
		case -1325125338:/* dpsBal */
			if ( value instanceof String ){
				setDpsBal((String)value);
			}
			else if ( value instanceof Double ){
				setDpsBal((Double)value);
			}
			else if ( value instanceof Long ){
				setDpsBal((Long)value);
			}
			else{
				setDpsBal((BigDecimal)value);
			}
			break;
		case -1006971903:/* otbrAm */
			if ( value instanceof String ){
				setOtbrAm((String)value);
			}
			else if ( value instanceof Double ){
				setOtbrAm((Double)value);
			}
			else if ( value instanceof Long ){
				setOtbrAm((Long)value);
			}
			else{
				setOtbrAm((BigDecimal)value);
			}
			break;
		case 1305433258:/* trbkGicd */
			setTrbkGicd((String)value);
			break;
		case 390913033:/* trbkGicdNm */
			setTrbkGicdNm((String)value);
			break;
		case -1332065395:/* otbrKdNm */
			setOtbrKdNm((String)value);
			break;
		case -1062321352:/* trfrvAm */
			if ( value instanceof String ){
				setTrfrvAm((String)value);
			}
			else if ( value instanceof Double ){
				setTrfrvAm((Double)value);
			}
			else if ( value instanceof Long ){
				setTrfrvAm((Long)value);
			}
			else{
				setTrfrvAm((BigDecimal)value);
			}
			break;
		case 2005033782:/* trbkGicdFlag */
			setTrbkGicdFlag((String)value);
			break;
		case 3347770:/* memo */
			setMemo((String)value);
			break;
		case 949236980:/* memoDis */
			setMemoDis((String)value);
			break;
		case 106443229:/* payYn */
			setPayYn((String)value);
			break;
		case -796111343:/* payTmDscd */
			setPayTmDscd((String)value);
			break;
		case -1373460131:/* d7UnderDtlDpsBal */
			if ( value instanceof String ){
				setD7UnderDtlDpsBal((String)value);
			}
			else if ( value instanceof Double ){
				setD7UnderDtlDpsBal((Double)value);
			}
			else if ( value instanceof Long ){
				setD7UnderDtlDpsBal((Long)value);
			}
			else{
				setD7UnderDtlDpsBal((BigDecimal)value);
			}
			break;
		case -1923358181:/* d7OverDtlDpsBal */
			if ( value instanceof String ){
				setD7OverDtlDpsBal((String)value);
			}
			else if ( value instanceof Double ){
				setD7OverDtlDpsBal((Double)value);
			}
			else if ( value instanceof Long ){
				setD7OverDtlDpsBal((Long)value);
			}
			else{
				setD7OverDtlDpsBal((BigDecimal)value);
			}
			break;
		case 740588812:/* d31OverDtlDpsBal */
			if ( value instanceof String ){
				setD31OverDtlDpsBal((String)value);
			}
			else if ( value instanceof Double ){
				setD31OverDtlDpsBal((Double)value);
			}
			else if ( value instanceof Long ){
				setD31OverDtlDpsBal((Long)value);
			}
			else{
				setD31OverDtlDpsBal((BigDecimal)value);
			}
			break;
		default:
			break;
		}
	}
	
}
