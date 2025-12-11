/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.pbp.ctr.dto;

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
	"acno", "acnoBal", "splitAvlAm", "prdNm", "spceIconNo", "spceSrno", "spceNm", "spceBal", "savGoalAm", "savGoalStaDt", "savGoalEndDt", "cnsmGoalAm", "cnsmAmBscd", "cnsmAmBscdNm", "atsMngNo"
	, "atsEstYn", "atsCycd", "atsCycdNm", "atsDd", "atsWkdDscd", "atsWkdDscdNm", "atsAm", "atpmListCnt", "pBPSpceDtlTrnPrtsList_ODT"
}, name="PBPPbokSpceDtlMngSelectSpcedtlinf_ODT")
@XmlRootElement(name="PBPPbokSpceDtlMngSelectSpcedtlinf_ODT")
@BxmCategory(logicalName="공간.상세.정보.컨트롤러.출력.IO", description="") 
public class PBPPbokSpceDtlMngSelectSpcedtlinf_ODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -1706055015L;
	
	
	
	/**
	 * 계좌번호
	 */
	@ApiModelProperty(
		name = "acno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("acno")
	@BxmOmm_Field(length=20, decimal=0, description="계좌번호", align="left", fill="", etcProperties={"PROP_OPTION_DSCD=L999"})
	private String acno= "";
	
	
	/**
	 * 계좌잔액
	 */
	@ApiModelProperty(
		name = "acnoBal"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("acnoBal")
	@BxmOmm_Field(length=18, decimal=3, description="계좌잔액", align="right", fill="")
	private BigDecimal acnoBal= new BigDecimal("0");
	
	
	/**
	 * 쪼개기가능금액
	 */
	@ApiModelProperty(
		name = "splitAvlAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("splitAvlAm")
	@BxmOmm_Field(length=18, decimal=3, description="쪼개기가능금액", align="right", fill="")
	private BigDecimal splitAvlAm= new BigDecimal("0");
	
	
	/**
	 * 상품명
	 */
	@ApiModelProperty(
		name = "prdNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("prdNm")
	@BxmOmm_Field(length=100, decimal=0, description="상품명", align="left", fill="")
	private String prdNm= "";
	
	
	/**
	 * 공간아이콘번호
	 */
	@ApiModelProperty(
		name = "spceIconNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("spceIconNo")
	@BxmOmm_Field(length=3, decimal=0, description="공간아이콘번호", align="left", fill="")
	private String spceIconNo= "";
	
	
	/**
	 * 공간일련번호
	 */
	@ApiModelProperty(
		name = "spceSrno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("spceSrno")
	@BxmOmm_Field(length=10, decimal=0, description="공간일련번호", align="left", fill="")
	private String spceSrno= "";
	
	
	/**
	 * 공간명
	 */
	@ApiModelProperty(
		name = "spceNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("spceNm")
	@BxmOmm_Field(length=50, decimal=0, description="공간명", align="left", fill="")
	private String spceNm= "";
	
	
	/**
	 * 공간잔액
	 */
	@ApiModelProperty(
		name = "spceBal"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("spceBal")
	@BxmOmm_Field(length=18, decimal=3, description="공간잔액", align="right", fill="")
	private BigDecimal spceBal= new BigDecimal("0");
	
	
	/**
	 * 저축목표금액
	 */
	@ApiModelProperty(
		name = "savGoalAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("savGoalAm")
	@BxmOmm_Field(length=18, decimal=3, description="저축목표금액", align="right", fill="")
	private BigDecimal savGoalAm= new BigDecimal("0");
	
	
	/**
	 * 저축목표시작일자
	 */
	@ApiModelProperty(
		name = "savGoalStaDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("savGoalStaDt")
	@BxmOmm_Field(length=8, decimal=0, description="저축목표시작일자", align="left", fill="")
	private String savGoalStaDt= "";
	
	
	/**
	 * 저축목표종료일자
	 */
	@ApiModelProperty(
		name = "savGoalEndDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("savGoalEndDt")
	@BxmOmm_Field(length=8, decimal=0, description="저축목표종료일자", align="left", fill="")
	private String savGoalEndDt= "";
	
	
	/**
	 * 소비목표금액
	 */
	@ApiModelProperty(
		name = "cnsmGoalAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("cnsmGoalAm")
	@BxmOmm_Field(length=18, decimal=3, description="소비목표금액", align="right", fill="")
	private BigDecimal cnsmGoalAm= new BigDecimal("0");
	
	
	/**
	 * 소비금액기준코드
	 */
	@ApiModelProperty(
		name = "cnsmAmBscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("cnsmAmBscd")
	@BxmOmm_Field(length=1, decimal=0, description="소비금액기준코드", align="left", fill="")
	private String cnsmAmBscd= "";
	
	
	/**
	 * 소비금액기준코드명
	 */
	@ApiModelProperty(
		name = "cnsmAmBscdNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("cnsmAmBscdNm")
	@BxmOmm_Field(length=40, decimal=0, description="소비금액기준코드명", align="left", fill="")
	private String cnsmAmBscdNm= "";
	
	
	/**
	 * 자동이체관리번호
	 */
	@ApiModelProperty(
		name = "atsMngNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atsMngNo")
	@BxmOmm_Field(length=13, decimal=0, description="자동이체관리번호", align="left", fill="")
	private String atsMngNo= "";
	
	
	/**
	 * 자동이체설정여부
	 */
	@ApiModelProperty(
		name = "atsEstYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atsEstYn")
	@BxmOmm_Field(length=1, decimal=0, description="자동이체설정여부", align="left", fill="")
	private String atsEstYn= "";
	
	
	/**
	 * 자동이체주기코드
	 */
	@ApiModelProperty(
		name = "atsCycd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atsCycd")
	@BxmOmm_Field(length=1, decimal=0, description="자동이체주기코드", align="left", fill="")
	private String atsCycd= "";
	
	
	/**
	 * 자동이체주기코드명
	 */
	@ApiModelProperty(
		name = "atsCycdNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atsCycdNm")
	@BxmOmm_Field(length=40, decimal=0, description="자동이체주기코드명", align="left", fill="")
	private String atsCycdNm= "";
	
	
	/**
	 * 자동이체일
	 */
	@ApiModelProperty(
		name = "atsDd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atsDd")
	@BxmOmm_Field(length=8, decimal=0, description="자동이체일", align="left", fill="")
	private String atsDd= "";
	
	
	/**
	 * 자동이체요일구분코드
	 */
	@ApiModelProperty(
		name = "atsWkdDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atsWkdDscd")
	@BxmOmm_Field(length=1, decimal=0, description="자동이체요일구분코드", align="left", fill="")
	private String atsWkdDscd= "";
	
	
	/**
	 * 자동이체요일구분코드명
	 */
	@ApiModelProperty(
		name = "atsWkdDscdNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atsWkdDscdNm")
	@BxmOmm_Field(length=40, decimal=0, description="자동이체요일구분코드명", align="left", fill="")
	private String atsWkdDscdNm= "";
	
	
	/**
	 * 자동이체금액
	 */
	@ApiModelProperty(
		name = "atsAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("atsAm")
	@BxmOmm_Field(length=18, decimal=3, description="자동이체금액", align="right", fill="")
	private BigDecimal atsAm= new BigDecimal("0");
	
	
	/**
	 * 자동납부목록건수
	 */
	@ApiModelProperty(
		name = "atpmListCnt"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("atpmListCnt")
	@BxmOmm_Field(length=3, decimal=0, description="자동납부목록건수", align="right", fill="")
	private Integer atpmListCnt= 0;
	
	
	/**
	 * 공간.상세.거래내역.목록.컨트롤러.출력.IO
	 */
	@ApiModelProperty(
		name = "pBPSpceDtlTrnPrtsList_ODT"
		, dataType = "[Lcom.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlMngSelectSpcedtltrnprtslist_ODT;"
		)
	@XmlElement(name="item")
	@XmlElementWrapper()
	@JsonProperty("pBPSpceDtlTrnPrtsList_ODT")
	@BxmOmm_Field(length=0, decimal=0, description="공간.상세.거래내역.목록.컨트롤러.출력.IO", align="left", fill="", arrayReference="1")
	private List<PBPPbokSpceDtlMngSelectSpcedtltrnprtslist_ODT> pBPSpceDtlTrnPrtsList_ODT= new ArrayList<>();
	
	
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
	private boolean isSet_acnoBal= false;
	protected final boolean isSet_acnoBal(){
		return this.isSet_acnoBal;
	}
	private void setIsSet_acnoBal(boolean value){
		this.isSet_acnoBal= value;
	}
	/**
	 * 계좌잔액
	 * BigDecimal - Double value setter
	 *
	 * @Param acnoBal 계좌잔액
	 */
	public void setAcnoBal(double acnoBal) {
		setAcnoBal(BigDecimal.valueOf(acnoBal));
	}
	/**
	 * 계좌잔액
	 * BigDecimal - Long value setter
	 *
	 * @Param acnoBal 계좌잔액
	 */
	public void setAcnoBal(long acnoBal) {
		setAcnoBal(BigDecimal.valueOf(acnoBal));
	}
	/**
	 * 계좌잔액
	 * BigDecimal - String value setter
	 *
	 * @Param acnoBal 계좌잔액
	 */
	public void setAcnoBal(String acnoBal) {
		setAcnoBal(new BigDecimal(acnoBal));
	}
	/**
	 * 계좌잔액
	 */
	@XmlTransient
	public BigDecimal getAcnoBal(){
		return this.acnoBal;
	}
	
	/**
	 * 계좌잔액
	 * 
	 * @param acnoBal 계좌잔액
	 */
	@JsonSetter("acnoBal")
	public void setAcnoBal(BigDecimal acnoBal){
		this.acnoBal= acnoBal;
		this.setIsSet_acnoBal(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_splitAvlAm= false;
	protected final boolean isSet_splitAvlAm(){
		return this.isSet_splitAvlAm;
	}
	private void setIsSet_splitAvlAm(boolean value){
		this.isSet_splitAvlAm= value;
	}
	/**
	 * 쪼개기가능금액
	 * BigDecimal - Double value setter
	 *
	 * @Param splitAvlAm 쪼개기가능금액
	 */
	public void setSplitAvlAm(double splitAvlAm) {
		setSplitAvlAm(BigDecimal.valueOf(splitAvlAm));
	}
	/**
	 * 쪼개기가능금액
	 * BigDecimal - Long value setter
	 *
	 * @Param splitAvlAm 쪼개기가능금액
	 */
	public void setSplitAvlAm(long splitAvlAm) {
		setSplitAvlAm(BigDecimal.valueOf(splitAvlAm));
	}
	/**
	 * 쪼개기가능금액
	 * BigDecimal - String value setter
	 *
	 * @Param splitAvlAm 쪼개기가능금액
	 */
	public void setSplitAvlAm(String splitAvlAm) {
		setSplitAvlAm(new BigDecimal(splitAvlAm));
	}
	/**
	 * 쪼개기가능금액
	 */
	@XmlTransient
	public BigDecimal getSplitAvlAm(){
		return this.splitAvlAm;
	}
	
	/**
	 * 쪼개기가능금액
	 * 
	 * @param splitAvlAm 쪼개기가능금액
	 */
	@JsonSetter("splitAvlAm")
	public void setSplitAvlAm(BigDecimal splitAvlAm){
		this.splitAvlAm= splitAvlAm;
		this.setIsSet_splitAvlAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_prdNm= false;
	protected final boolean isSet_prdNm(){
		return this.isSet_prdNm;
	}
	private void setIsSet_prdNm(boolean value){
		this.isSet_prdNm= value;
	}
	/**
	 * 상품명
	 */
	@XmlTransient
	public String getPrdNm(){
		return this.prdNm;
	}
	
	/**
	 * 상품명
	 * 
	 * @param prdNm 상품명
	 */
	public void setPrdNm(String prdNm){
		this.prdNm= prdNm;
		this.setIsSet_prdNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_spceIconNo= false;
	protected final boolean isSet_spceIconNo(){
		return this.isSet_spceIconNo;
	}
	private void setIsSet_spceIconNo(boolean value){
		this.isSet_spceIconNo= value;
	}
	/**
	 * 공간아이콘번호
	 */
	@XmlTransient
	public String getSpceIconNo(){
		return this.spceIconNo;
	}
	
	/**
	 * 공간아이콘번호
	 * 
	 * @param spceIconNo 공간아이콘번호
	 */
	public void setSpceIconNo(String spceIconNo){
		this.spceIconNo= spceIconNo;
		this.setIsSet_spceIconNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_spceSrno= false;
	protected final boolean isSet_spceSrno(){
		return this.isSet_spceSrno;
	}
	private void setIsSet_spceSrno(boolean value){
		this.isSet_spceSrno= value;
	}
	/**
	 * 공간일련번호
	 */
	@XmlTransient
	public String getSpceSrno(){
		return this.spceSrno;
	}
	
	/**
	 * 공간일련번호
	 * 
	 * @param spceSrno 공간일련번호
	 */
	public void setSpceSrno(String spceSrno){
		this.spceSrno= spceSrno;
		this.setIsSet_spceSrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_spceNm= false;
	protected final boolean isSet_spceNm(){
		return this.isSet_spceNm;
	}
	private void setIsSet_spceNm(boolean value){
		this.isSet_spceNm= value;
	}
	/**
	 * 공간명
	 */
	@XmlTransient
	public String getSpceNm(){
		return this.spceNm;
	}
	
	/**
	 * 공간명
	 * 
	 * @param spceNm 공간명
	 */
	public void setSpceNm(String spceNm){
		this.spceNm= spceNm;
		this.setIsSet_spceNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_spceBal= false;
	protected final boolean isSet_spceBal(){
		return this.isSet_spceBal;
	}
	private void setIsSet_spceBal(boolean value){
		this.isSet_spceBal= value;
	}
	/**
	 * 공간잔액
	 * BigDecimal - Double value setter
	 *
	 * @Param spceBal 공간잔액
	 */
	public void setSpceBal(double spceBal) {
		setSpceBal(BigDecimal.valueOf(spceBal));
	}
	/**
	 * 공간잔액
	 * BigDecimal - Long value setter
	 *
	 * @Param spceBal 공간잔액
	 */
	public void setSpceBal(long spceBal) {
		setSpceBal(BigDecimal.valueOf(spceBal));
	}
	/**
	 * 공간잔액
	 * BigDecimal - String value setter
	 *
	 * @Param spceBal 공간잔액
	 */
	public void setSpceBal(String spceBal) {
		setSpceBal(new BigDecimal(spceBal));
	}
	/**
	 * 공간잔액
	 */
	@XmlTransient
	public BigDecimal getSpceBal(){
		return this.spceBal;
	}
	
	/**
	 * 공간잔액
	 * 
	 * @param spceBal 공간잔액
	 */
	@JsonSetter("spceBal")
	public void setSpceBal(BigDecimal spceBal){
		this.spceBal= spceBal;
		this.setIsSet_spceBal(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_savGoalAm= false;
	protected final boolean isSet_savGoalAm(){
		return this.isSet_savGoalAm;
	}
	private void setIsSet_savGoalAm(boolean value){
		this.isSet_savGoalAm= value;
	}
	/**
	 * 저축목표금액
	 * BigDecimal - Double value setter
	 *
	 * @Param savGoalAm 저축목표금액
	 */
	public void setSavGoalAm(double savGoalAm) {
		setSavGoalAm(BigDecimal.valueOf(savGoalAm));
	}
	/**
	 * 저축목표금액
	 * BigDecimal - Long value setter
	 *
	 * @Param savGoalAm 저축목표금액
	 */
	public void setSavGoalAm(long savGoalAm) {
		setSavGoalAm(BigDecimal.valueOf(savGoalAm));
	}
	/**
	 * 저축목표금액
	 * BigDecimal - String value setter
	 *
	 * @Param savGoalAm 저축목표금액
	 */
	public void setSavGoalAm(String savGoalAm) {
		setSavGoalAm(new BigDecimal(savGoalAm));
	}
	/**
	 * 저축목표금액
	 */
	@XmlTransient
	public BigDecimal getSavGoalAm(){
		return this.savGoalAm;
	}
	
	/**
	 * 저축목표금액
	 * 
	 * @param savGoalAm 저축목표금액
	 */
	@JsonSetter("savGoalAm")
	public void setSavGoalAm(BigDecimal savGoalAm){
		this.savGoalAm= savGoalAm;
		this.setIsSet_savGoalAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_savGoalStaDt= false;
	protected final boolean isSet_savGoalStaDt(){
		return this.isSet_savGoalStaDt;
	}
	private void setIsSet_savGoalStaDt(boolean value){
		this.isSet_savGoalStaDt= value;
	}
	/**
	 * 저축목표시작일자
	 */
	@XmlTransient
	public String getSavGoalStaDt(){
		return this.savGoalStaDt;
	}
	
	/**
	 * 저축목표시작일자
	 * 
	 * @param savGoalStaDt 저축목표시작일자
	 */
	public void setSavGoalStaDt(String savGoalStaDt){
		this.savGoalStaDt= savGoalStaDt;
		this.setIsSet_savGoalStaDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_savGoalEndDt= false;
	protected final boolean isSet_savGoalEndDt(){
		return this.isSet_savGoalEndDt;
	}
	private void setIsSet_savGoalEndDt(boolean value){
		this.isSet_savGoalEndDt= value;
	}
	/**
	 * 저축목표종료일자
	 */
	@XmlTransient
	public String getSavGoalEndDt(){
		return this.savGoalEndDt;
	}
	
	/**
	 * 저축목표종료일자
	 * 
	 * @param savGoalEndDt 저축목표종료일자
	 */
	public void setSavGoalEndDt(String savGoalEndDt){
		this.savGoalEndDt= savGoalEndDt;
		this.setIsSet_savGoalEndDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cnsmGoalAm= false;
	protected final boolean isSet_cnsmGoalAm(){
		return this.isSet_cnsmGoalAm;
	}
	private void setIsSet_cnsmGoalAm(boolean value){
		this.isSet_cnsmGoalAm= value;
	}
	/**
	 * 소비목표금액
	 * BigDecimal - Double value setter
	 *
	 * @Param cnsmGoalAm 소비목표금액
	 */
	public void setCnsmGoalAm(double cnsmGoalAm) {
		setCnsmGoalAm(BigDecimal.valueOf(cnsmGoalAm));
	}
	/**
	 * 소비목표금액
	 * BigDecimal - Long value setter
	 *
	 * @Param cnsmGoalAm 소비목표금액
	 */
	public void setCnsmGoalAm(long cnsmGoalAm) {
		setCnsmGoalAm(BigDecimal.valueOf(cnsmGoalAm));
	}
	/**
	 * 소비목표금액
	 * BigDecimal - String value setter
	 *
	 * @Param cnsmGoalAm 소비목표금액
	 */
	public void setCnsmGoalAm(String cnsmGoalAm) {
		setCnsmGoalAm(new BigDecimal(cnsmGoalAm));
	}
	/**
	 * 소비목표금액
	 */
	@XmlTransient
	public BigDecimal getCnsmGoalAm(){
		return this.cnsmGoalAm;
	}
	
	/**
	 * 소비목표금액
	 * 
	 * @param cnsmGoalAm 소비목표금액
	 */
	@JsonSetter("cnsmGoalAm")
	public void setCnsmGoalAm(BigDecimal cnsmGoalAm){
		this.cnsmGoalAm= cnsmGoalAm;
		this.setIsSet_cnsmGoalAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cnsmAmBscd= false;
	protected final boolean isSet_cnsmAmBscd(){
		return this.isSet_cnsmAmBscd;
	}
	private void setIsSet_cnsmAmBscd(boolean value){
		this.isSet_cnsmAmBscd= value;
	}
	/**
	 * 소비금액기준코드
	 */
	@XmlTransient
	public String getCnsmAmBscd(){
		return this.cnsmAmBscd;
	}
	
	/**
	 * 소비금액기준코드
	 * 
	 * @param cnsmAmBscd 소비금액기준코드
	 */
	public void setCnsmAmBscd(String cnsmAmBscd){
		this.cnsmAmBscd= cnsmAmBscd;
		this.setIsSet_cnsmAmBscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cnsmAmBscdNm= false;
	protected final boolean isSet_cnsmAmBscdNm(){
		return this.isSet_cnsmAmBscdNm;
	}
	private void setIsSet_cnsmAmBscdNm(boolean value){
		this.isSet_cnsmAmBscdNm= value;
	}
	/**
	 * 소비금액기준코드명
	 */
	@XmlTransient
	public String getCnsmAmBscdNm(){
		return this.cnsmAmBscdNm;
	}
	
	/**
	 * 소비금액기준코드명
	 * 
	 * @param cnsmAmBscdNm 소비금액기준코드명
	 */
	public void setCnsmAmBscdNm(String cnsmAmBscdNm){
		this.cnsmAmBscdNm= cnsmAmBscdNm;
		this.setIsSet_cnsmAmBscdNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atsMngNo= false;
	protected final boolean isSet_atsMngNo(){
		return this.isSet_atsMngNo;
	}
	private void setIsSet_atsMngNo(boolean value){
		this.isSet_atsMngNo= value;
	}
	/**
	 * 자동이체관리번호
	 */
	@XmlTransient
	public String getAtsMngNo(){
		return this.atsMngNo;
	}
	
	/**
	 * 자동이체관리번호
	 * 
	 * @param atsMngNo 자동이체관리번호
	 */
	public void setAtsMngNo(String atsMngNo){
		this.atsMngNo= atsMngNo;
		this.setIsSet_atsMngNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atsEstYn= false;
	protected final boolean isSet_atsEstYn(){
		return this.isSet_atsEstYn;
	}
	private void setIsSet_atsEstYn(boolean value){
		this.isSet_atsEstYn= value;
	}
	/**
	 * 자동이체설정여부
	 */
	@XmlTransient
	public String getAtsEstYn(){
		return this.atsEstYn;
	}
	
	/**
	 * 자동이체설정여부
	 * 
	 * @param atsEstYn 자동이체설정여부
	 */
	public void setAtsEstYn(String atsEstYn){
		this.atsEstYn= atsEstYn;
		this.setIsSet_atsEstYn(true);
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
	private boolean isSet_atsCycdNm= false;
	protected final boolean isSet_atsCycdNm(){
		return this.isSet_atsCycdNm;
	}
	private void setIsSet_atsCycdNm(boolean value){
		this.isSet_atsCycdNm= value;
	}
	/**
	 * 자동이체주기코드명
	 */
	@XmlTransient
	public String getAtsCycdNm(){
		return this.atsCycdNm;
	}
	
	/**
	 * 자동이체주기코드명
	 * 
	 * @param atsCycdNm 자동이체주기코드명
	 */
	public void setAtsCycdNm(String atsCycdNm){
		this.atsCycdNm= atsCycdNm;
		this.setIsSet_atsCycdNm(true);
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
	public String getAtsDd(){
		return this.atsDd;
	}
	
	/**
	 * 자동이체일
	 * 
	 * @param atsDd 자동이체일
	 */
	public void setAtsDd(String atsDd){
		this.atsDd= atsDd;
		this.setIsSet_atsDd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atsWkdDscd= false;
	protected final boolean isSet_atsWkdDscd(){
		return this.isSet_atsWkdDscd;
	}
	private void setIsSet_atsWkdDscd(boolean value){
		this.isSet_atsWkdDscd= value;
	}
	/**
	 * 자동이체요일구분코드
	 */
	@XmlTransient
	public String getAtsWkdDscd(){
		return this.atsWkdDscd;
	}
	
	/**
	 * 자동이체요일구분코드
	 * 
	 * @param atsWkdDscd 자동이체요일구분코드
	 */
	public void setAtsWkdDscd(String atsWkdDscd){
		this.atsWkdDscd= atsWkdDscd;
		this.setIsSet_atsWkdDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atsWkdDscdNm= false;
	protected final boolean isSet_atsWkdDscdNm(){
		return this.isSet_atsWkdDscdNm;
	}
	private void setIsSet_atsWkdDscdNm(boolean value){
		this.isSet_atsWkdDscdNm= value;
	}
	/**
	 * 자동이체요일구분코드명
	 */
	@XmlTransient
	public String getAtsWkdDscdNm(){
		return this.atsWkdDscdNm;
	}
	
	/**
	 * 자동이체요일구분코드명
	 * 
	 * @param atsWkdDscdNm 자동이체요일구분코드명
	 */
	public void setAtsWkdDscdNm(String atsWkdDscdNm){
		this.atsWkdDscdNm= atsWkdDscdNm;
		this.setIsSet_atsWkdDscdNm(true);
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
	private boolean isSet_atpmListCnt= false;
	protected final boolean isSet_atpmListCnt(){
		return this.isSet_atpmListCnt;
	}
	private void setIsSet_atpmListCnt(boolean value){
		this.isSet_atpmListCnt= value;
	}
	/**
	 * 자동납부목록건수
	 */
	@XmlTransient
	public Integer getAtpmListCnt(){
		return this.atpmListCnt;
	}
	
	/**
	 * 자동납부목록건수
	 * 
	 * @param atpmListCnt 자동납부목록건수
	 */
	public void setAtpmListCnt(Integer atpmListCnt){
		this.atpmListCnt= atpmListCnt;
		this.setIsSet_atpmListCnt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pBPSpceDtlTrnPrtsList_ODT= false;
	protected final boolean isSet_pBPSpceDtlTrnPrtsList_ODT(){
		return this.isSet_pBPSpceDtlTrnPrtsList_ODT;
	}
	private void setIsSet_pBPSpceDtlTrnPrtsList_ODT(boolean value){
		this.isSet_pBPSpceDtlTrnPrtsList_ODT= value;
	}
	/**
	 * 공간.상세.거래내역.목록.컨트롤러.출력.IO
	 */
	@XmlTransient
	public List<PBPPbokSpceDtlMngSelectSpcedtltrnprtslist_ODT> getpBPSpceDtlTrnPrtsList_ODT(){
		return pBPSpceDtlTrnPrtsList_ODT;
	}
	
	/**
	 * 공간.상세.거래내역.목록.컨트롤러.출력.IO
	 * 
	 * @param pBPSpceDtlTrnPrtsList_ODT 공간.상세.거래내역.목록.컨트롤러.출력.IO
	 */
	@JsonSetter("pBPSpceDtlTrnPrtsList_ODT")
	public void setpBPSpceDtlTrnPrtsList_ODT(List<PBPPbokSpceDtlMngSelectSpcedtltrnprtslist_ODT> pBPSpceDtlTrnPrtsList_ODT){
		this.pBPSpceDtlTrnPrtsList_ODT= pBPSpceDtlTrnPrtsList_ODT;
		this.setIsSet_pBPSpceDtlTrnPrtsList_ODT(true);
	}
	
	public void setpBPSpceDtlTrnPrtsList_ODT(PBPPbokSpceDtlMngSelectSpcedtltrnprtslist_ODT... items){
		List<PBPPbokSpceDtlMngSelectSpcedtltrnprtslist_ODT> _items= new ArrayList<>();
		if ( items!= null && items.length> 0){
			for( PBPPbokSpceDtlMngSelectSpcedtltrnprtslist_ODT item: items ){
				_items.add(item);
			}
		}
		this.setpBPSpceDtlTrnPrtsList_ODT(_items);
	}
				
	@Override
	public PBPPbokSpceDtlMngSelectSpcedtlinf_ODT clone(){
		try{
			PBPPbokSpceDtlMngSelectSpcedtlinf_ODT object= (PBPPbokSpceDtlMngSelectSpcedtlinf_ODT)super.clone();
			if ( this.pBPSpceDtlTrnPrtsList_ODT== null ) object.pBPSpceDtlTrnPrtsList_ODT= null;
			else{
				List<PBPPbokSpceDtlMngSelectSpcedtltrnprtslist_ODT> clonedList= new ArrayList<>(this.pBPSpceDtlTrnPrtsList_ODT.size());
				for( PBPPbokSpceDtlMngSelectSpcedtltrnprtslist_ODT item : pBPSpceDtlTrnPrtsList_ODT ){
					clonedList.add((PBPPbokSpceDtlMngSelectSpcedtltrnprtslist_ODT)item.clone());
				}
				object.pBPSpceDtlTrnPrtsList_ODT= clonedList;
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
		
		result= prime * result + ((this.acno==null)?0:this.acno.hashCode());
		result= prime * result + ((this.acnoBal==null)?0:this.acnoBal.hashCode());
		result= prime * result + ((this.splitAvlAm==null)?0:this.splitAvlAm.hashCode());
		result= prime * result + ((this.prdNm==null)?0:this.prdNm.hashCode());
		result= prime * result + ((this.spceIconNo==null)?0:this.spceIconNo.hashCode());
		result= prime * result + ((this.spceSrno==null)?0:this.spceSrno.hashCode());
		result= prime * result + ((this.spceNm==null)?0:this.spceNm.hashCode());
		result= prime * result + ((this.spceBal==null)?0:this.spceBal.hashCode());
		result= prime * result + ((this.savGoalAm==null)?0:this.savGoalAm.hashCode());
		result= prime * result + ((this.savGoalStaDt==null)?0:this.savGoalStaDt.hashCode());
		result= prime * result + ((this.savGoalEndDt==null)?0:this.savGoalEndDt.hashCode());
		result= prime * result + ((this.cnsmGoalAm==null)?0:this.cnsmGoalAm.hashCode());
		result= prime * result + ((this.cnsmAmBscd==null)?0:this.cnsmAmBscd.hashCode());
		result= prime * result + ((this.cnsmAmBscdNm==null)?0:this.cnsmAmBscdNm.hashCode());
		result= prime * result + ((this.atsMngNo==null)?0:this.atsMngNo.hashCode());
		result= prime * result + ((this.atsEstYn==null)?0:this.atsEstYn.hashCode());
		result= prime * result + ((this.atsCycd==null)?0:this.atsCycd.hashCode());
		result= prime * result + ((this.atsCycdNm==null)?0:this.atsCycdNm.hashCode());
		result= prime * result + ((this.atsDd==null)?0:this.atsDd.hashCode());
		result= prime * result + ((this.atsWkdDscd==null)?0:this.atsWkdDscd.hashCode());
		result= prime * result + ((this.atsWkdDscdNm==null)?0:this.atsWkdDscdNm.hashCode());
		result= prime * result + ((this.atsAm==null)?0:this.atsAm.hashCode());
		result= prime * result + ((this.atpmListCnt==null)?0:this.atpmListCnt.hashCode());
		result= prime * result + ((this.pBPSpceDtlTrnPrtsList_ODT==null)?0:this.pBPSpceDtlTrnPrtsList_ODT.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final PBPPbokSpceDtlMngSelectSpcedtlinf_ODT other= (PBPPbokSpceDtlMngSelectSpcedtlinf_ODT)obj;
		{
			Object _acno= getAcno();
			Object __acno= other.getAcno();
			if ( _acno== null ) { if ( __acno!= null ) return false; }
			else if ( !_acno.equals(__acno) ) return false;
		}
		{
			Object _acnoBal= getAcnoBal();
			Object __acnoBal= other.getAcnoBal();
			if ( _acnoBal== null ) { if ( __acnoBal!= null ) return false; }
			else if ( !_acnoBal.equals(__acnoBal) ) return false;
		}
		{
			Object _splitAvlAm= getSplitAvlAm();
			Object __splitAvlAm= other.getSplitAvlAm();
			if ( _splitAvlAm== null ) { if ( __splitAvlAm!= null ) return false; }
			else if ( !_splitAvlAm.equals(__splitAvlAm) ) return false;
		}
		{
			Object _prdNm= getPrdNm();
			Object __prdNm= other.getPrdNm();
			if ( _prdNm== null ) { if ( __prdNm!= null ) return false; }
			else if ( !_prdNm.equals(__prdNm) ) return false;
		}
		{
			Object _spceIconNo= getSpceIconNo();
			Object __spceIconNo= other.getSpceIconNo();
			if ( _spceIconNo== null ) { if ( __spceIconNo!= null ) return false; }
			else if ( !_spceIconNo.equals(__spceIconNo) ) return false;
		}
		{
			Object _spceSrno= getSpceSrno();
			Object __spceSrno= other.getSpceSrno();
			if ( _spceSrno== null ) { if ( __spceSrno!= null ) return false; }
			else if ( !_spceSrno.equals(__spceSrno) ) return false;
		}
		{
			Object _spceNm= getSpceNm();
			Object __spceNm= other.getSpceNm();
			if ( _spceNm== null ) { if ( __spceNm!= null ) return false; }
			else if ( !_spceNm.equals(__spceNm) ) return false;
		}
		{
			Object _spceBal= getSpceBal();
			Object __spceBal= other.getSpceBal();
			if ( _spceBal== null ) { if ( __spceBal!= null ) return false; }
			else if ( !_spceBal.equals(__spceBal) ) return false;
		}
		{
			Object _savGoalAm= getSavGoalAm();
			Object __savGoalAm= other.getSavGoalAm();
			if ( _savGoalAm== null ) { if ( __savGoalAm!= null ) return false; }
			else if ( !_savGoalAm.equals(__savGoalAm) ) return false;
		}
		{
			Object _savGoalStaDt= getSavGoalStaDt();
			Object __savGoalStaDt= other.getSavGoalStaDt();
			if ( _savGoalStaDt== null ) { if ( __savGoalStaDt!= null ) return false; }
			else if ( !_savGoalStaDt.equals(__savGoalStaDt) ) return false;
		}
		{
			Object _savGoalEndDt= getSavGoalEndDt();
			Object __savGoalEndDt= other.getSavGoalEndDt();
			if ( _savGoalEndDt== null ) { if ( __savGoalEndDt!= null ) return false; }
			else if ( !_savGoalEndDt.equals(__savGoalEndDt) ) return false;
		}
		{
			Object _cnsmGoalAm= getCnsmGoalAm();
			Object __cnsmGoalAm= other.getCnsmGoalAm();
			if ( _cnsmGoalAm== null ) { if ( __cnsmGoalAm!= null ) return false; }
			else if ( !_cnsmGoalAm.equals(__cnsmGoalAm) ) return false;
		}
		{
			Object _cnsmAmBscd= getCnsmAmBscd();
			Object __cnsmAmBscd= other.getCnsmAmBscd();
			if ( _cnsmAmBscd== null ) { if ( __cnsmAmBscd!= null ) return false; }
			else if ( !_cnsmAmBscd.equals(__cnsmAmBscd) ) return false;
		}
		{
			Object _cnsmAmBscdNm= getCnsmAmBscdNm();
			Object __cnsmAmBscdNm= other.getCnsmAmBscdNm();
			if ( _cnsmAmBscdNm== null ) { if ( __cnsmAmBscdNm!= null ) return false; }
			else if ( !_cnsmAmBscdNm.equals(__cnsmAmBscdNm) ) return false;
		}
		{
			Object _atsMngNo= getAtsMngNo();
			Object __atsMngNo= other.getAtsMngNo();
			if ( _atsMngNo== null ) { if ( __atsMngNo!= null ) return false; }
			else if ( !_atsMngNo.equals(__atsMngNo) ) return false;
		}
		{
			Object _atsEstYn= getAtsEstYn();
			Object __atsEstYn= other.getAtsEstYn();
			if ( _atsEstYn== null ) { if ( __atsEstYn!= null ) return false; }
			else if ( !_atsEstYn.equals(__atsEstYn) ) return false;
		}
		{
			Object _atsCycd= getAtsCycd();
			Object __atsCycd= other.getAtsCycd();
			if ( _atsCycd== null ) { if ( __atsCycd!= null ) return false; }
			else if ( !_atsCycd.equals(__atsCycd) ) return false;
		}
		{
			Object _atsCycdNm= getAtsCycdNm();
			Object __atsCycdNm= other.getAtsCycdNm();
			if ( _atsCycdNm== null ) { if ( __atsCycdNm!= null ) return false; }
			else if ( !_atsCycdNm.equals(__atsCycdNm) ) return false;
		}
		{
			Object _atsDd= getAtsDd();
			Object __atsDd= other.getAtsDd();
			if ( _atsDd== null ) { if ( __atsDd!= null ) return false; }
			else if ( !_atsDd.equals(__atsDd) ) return false;
		}
		{
			Object _atsWkdDscd= getAtsWkdDscd();
			Object __atsWkdDscd= other.getAtsWkdDscd();
			if ( _atsWkdDscd== null ) { if ( __atsWkdDscd!= null ) return false; }
			else if ( !_atsWkdDscd.equals(__atsWkdDscd) ) return false;
		}
		{
			Object _atsWkdDscdNm= getAtsWkdDscdNm();
			Object __atsWkdDscdNm= other.getAtsWkdDscdNm();
			if ( _atsWkdDscdNm== null ) { if ( __atsWkdDscdNm!= null ) return false; }
			else if ( !_atsWkdDscdNm.equals(__atsWkdDscdNm) ) return false;
		}
		{
			Object _atsAm= getAtsAm();
			Object __atsAm= other.getAtsAm();
			if ( _atsAm== null ) { if ( __atsAm!= null ) return false; }
			else if ( !_atsAm.equals(__atsAm) ) return false;
		}
		{
			Object _atpmListCnt= getAtpmListCnt();
			Object __atpmListCnt= other.getAtpmListCnt();
			if ( _atpmListCnt== null ) { if ( __atpmListCnt!= null ) return false; }
			else if ( !_atpmListCnt.equals(__atpmListCnt) ) return false;
		}
		{
			Object _pBPSpceDtlTrnPrtsList_ODT= getpBPSpceDtlTrnPrtsList_ODT();
			Object __pBPSpceDtlTrnPrtsList_ODT= other.getpBPSpceDtlTrnPrtsList_ODT();
			if ( _pBPSpceDtlTrnPrtsList_ODT== null ) { if ( __pBPSpceDtlTrnPrtsList_ODT!= null ) return false; }
			else if ( !_pBPSpceDtlTrnPrtsList_ODT.equals(__pBPSpceDtlTrnPrtsList_ODT) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(PBPPbokSpceDtlMngSelectSpcedtlinf_ODT.class.getName()).append(":\n");
		sb.append("\tacno: ");
		sb.append(acno==null?"null":getAcno());
		sb.append("\n");
		sb.append("\tacnoBal: ");
		sb.append(acnoBal==null?"null":getAcnoBal());
		sb.append("\n");
		sb.append("\tsplitAvlAm: ");
		sb.append(splitAvlAm==null?"null":getSplitAvlAm());
		sb.append("\n");
		sb.append("\tprdNm: ");
		sb.append(prdNm==null?"null":getPrdNm());
		sb.append("\n");
		sb.append("\tspceIconNo: ");
		sb.append(spceIconNo==null?"null":getSpceIconNo());
		sb.append("\n");
		sb.append("\tspceSrno: ");
		sb.append(spceSrno==null?"null":getSpceSrno());
		sb.append("\n");
		sb.append("\tspceNm: ");
		sb.append(spceNm==null?"null":getSpceNm());
		sb.append("\n");
		sb.append("\tspceBal: ");
		sb.append(spceBal==null?"null":getSpceBal());
		sb.append("\n");
		sb.append("\tsavGoalAm: ");
		sb.append(savGoalAm==null?"null":getSavGoalAm());
		sb.append("\n");
		sb.append("\tsavGoalStaDt: ");
		sb.append(savGoalStaDt==null?"null":getSavGoalStaDt());
		sb.append("\n");
		sb.append("\tsavGoalEndDt: ");
		sb.append(savGoalEndDt==null?"null":getSavGoalEndDt());
		sb.append("\n");
		sb.append("\tcnsmGoalAm: ");
		sb.append(cnsmGoalAm==null?"null":getCnsmGoalAm());
		sb.append("\n");
		sb.append("\tcnsmAmBscd: ");
		sb.append(cnsmAmBscd==null?"null":getCnsmAmBscd());
		sb.append("\n");
		sb.append("\tcnsmAmBscdNm: ");
		sb.append(cnsmAmBscdNm==null?"null":getCnsmAmBscdNm());
		sb.append("\n");
		sb.append("\tatsMngNo: ");
		sb.append(atsMngNo==null?"null":getAtsMngNo());
		sb.append("\n");
		sb.append("\tatsEstYn: ");
		sb.append(atsEstYn==null?"null":getAtsEstYn());
		sb.append("\n");
		sb.append("\tatsCycd: ");
		sb.append(atsCycd==null?"null":getAtsCycd());
		sb.append("\n");
		sb.append("\tatsCycdNm: ");
		sb.append(atsCycdNm==null?"null":getAtsCycdNm());
		sb.append("\n");
		sb.append("\tatsDd: ");
		sb.append(atsDd==null?"null":getAtsDd());
		sb.append("\n");
		sb.append("\tatsWkdDscd: ");
		sb.append(atsWkdDscd==null?"null":getAtsWkdDscd());
		sb.append("\n");
		sb.append("\tatsWkdDscdNm: ");
		sb.append(atsWkdDscdNm==null?"null":getAtsWkdDscdNm());
		sb.append("\n");
		sb.append("\tatsAm: ");
		sb.append(atsAm==null?"null":getAtsAm());
		sb.append("\n");
		sb.append("\tatpmListCnt: ");
		sb.append(atpmListCnt==null?"null":getAtpmListCnt());
		sb.append("\n");
		sb.append("\tpBPSpceDtlTrnPrtsList_ODT: ");
		if ( pBPSpceDtlTrnPrtsList_ODT== null ) sb.append("null");
		else{
			sb.append("array count : ");
			sb.append(pBPSpceDtlTrnPrtsList_ODT.size());
			sb.append("(items)\n");
	
			int max= (10<pBPSpceDtlTrnPrtsList_ODT.size())?10:pBPSpceDtlTrnPrtsList_ODT.size();
	
			for ( int i= 0; i < max; ++i ){
				sb.append("\tpBPSpceDtlTrnPrtsList_ODT[");
				sb.append(i);
				sb.append("] : ");
				sb.append(pBPSpceDtlTrnPrtsList_ODT.get(i));
				sb.append("\n");
			}
	
			if ( max < pBPSpceDtlTrnPrtsList_ODT.size() ){
				sb.append("\tpBPSpceDtlTrnPrtsList_ODT[.] : ").append("more ").append((pBPSpceDtlTrnPrtsList_ODT.size()-max)).append(" items").append("\n");
			}
		}
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 20; /* acno */
		messageLen+= 18; /* acnoBal */
		messageLen+= 18; /* splitAvlAm */
		messageLen+= 100; /* prdNm */
		messageLen+= 3; /* spceIconNo */
		messageLen+= 10; /* spceSrno */
		messageLen+= 50; /* spceNm */
		messageLen+= 18; /* spceBal */
		messageLen+= 18; /* savGoalAm */
		messageLen+= 8; /* savGoalStaDt */
		messageLen+= 8; /* savGoalEndDt */
		messageLen+= 18; /* cnsmGoalAm */
		messageLen+= 1; /* cnsmAmBscd */
		messageLen+= 40; /* cnsmAmBscdNm */
		messageLen+= 13; /* atsMngNo */
		messageLen+= 1; /* atsEstYn */
		messageLen+= 1; /* atsCycd */
		messageLen+= 40; /* atsCycdNm */
		messageLen+= 8; /* atsDd */
		messageLen+= 1; /* atsWkdDscd */
		messageLen+= 40; /* atsWkdDscdNm */
		messageLen+= 18; /* atsAm */
		messageLen+= 3; /* atpmListCnt */
		{/*pBPSpceDtlTrnPrtsList_ODT*/
			int size=1;
			int count= pBPSpceDtlTrnPrtsList_ODT == null ? 0 : pBPSpceDtlTrnPrtsList_ODT.size();
			int min= size > count?count:size;
			PBPPbokSpceDtlMngSelectSpcedtltrnprtslist_ODT emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					PBPPbokSpceDtlMngSelectSpcedtltrnprtslist_ODT element= pBPSpceDtlTrnPrtsList_ODT.get(i);
					if ( element != null && !(element instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= element==null?0:( (Predictable)element).predictMessageLength();
				}else{
					if ( emptyElement== null ) emptyElement= new com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlMngSelectSpcedtltrnprtslist_ODT();
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
	
		list.add("acno");
		list.add("acnoBal");
		list.add("splitAvlAm");
		list.add("prdNm");
		list.add("spceIconNo");
		list.add("spceSrno");
		list.add("spceNm");
		list.add("spceBal");
		list.add("savGoalAm");
		list.add("savGoalStaDt");
		list.add("savGoalEndDt");
		list.add("cnsmGoalAm");
		list.add("cnsmAmBscd");
		list.add("cnsmAmBscdNm");
		list.add("atsMngNo");
		list.add("atsEstYn");
		list.add("atsCycd");
		list.add("atsCycdNm");
		list.add("atsDd");
		list.add("atsWkdDscd");
		list.add("atsWkdDscdNm");
		list.add("atsAm");
		list.add("atpmListCnt");
		list.add("pBPSpceDtlTrnPrtsList_ODT");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("acno", get("acno"));
		map.put("acnoBal", get("acnoBal"));
		map.put("splitAvlAm", get("splitAvlAm"));
		map.put("prdNm", get("prdNm"));
		map.put("spceIconNo", get("spceIconNo"));
		map.put("spceSrno", get("spceSrno"));
		map.put("spceNm", get("spceNm"));
		map.put("spceBal", get("spceBal"));
		map.put("savGoalAm", get("savGoalAm"));
		map.put("savGoalStaDt", get("savGoalStaDt"));
		map.put("savGoalEndDt", get("savGoalEndDt"));
		map.put("cnsmGoalAm", get("cnsmGoalAm"));
		map.put("cnsmAmBscd", get("cnsmAmBscd"));
		map.put("cnsmAmBscdNm", get("cnsmAmBscdNm"));
		map.put("atsMngNo", get("atsMngNo"));
		map.put("atsEstYn", get("atsEstYn"));
		map.put("atsCycd", get("atsCycd"));
		map.put("atsCycdNm", get("atsCycdNm"));
		map.put("atsDd", get("atsDd"));
		map.put("atsWkdDscd", get("atsWkdDscd"));
		map.put("atsWkdDscdNm", get("atsWkdDscdNm"));
		map.put("atsAm", get("atsAm"));
		map.put("atpmListCnt", get("atpmListCnt"));
		map.put("pBPSpceDtlTrnPrtsList_ODT", get("pBPSpceDtlTrnPrtsList_ODT"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 2988387:/* acno */
			return getAcno();
		case -1167209558:/* acnoBal */
			return getAcnoBal();
		case -367460759:/* splitAvlAm */
			return getSplitAvlAm();
		case 106929153:/* prdNm */
			return getPrdNm();
		case 672207993:/* spceIconNo */
			return getSpceIconNo();
		case 2106037375:/* spceSrno */
			return getSpceSrno();
		case -896131682:/* spceNm */
			return getSpceNm();
		case -2010290162:/* spceBal */
			return getSpceBal();
		case -660526937:/* savGoalAm */
			return getSavGoalAm();
		case 1799097461:/* savGoalStaDt */
			return getSavGoalStaDt();
		case 1785992304:/* savGoalEndDt */
			return getSavGoalEndDt();
		case -579940604:/* cnsmGoalAm */
			return getCnsmGoalAm();
		case -754478301:/* cnsmAmBscd */
			return getCnsmAmBscd();
		case 795828290:/* cnsmAmBscdNm */
			return getCnsmAmBscdNm();
		case 491964551:/* atsMngNo */
			return getAtsMngNo();
		case 484738171:/* atsEstYn */
			return getAtsEstYn();
		case -677154281:/* atsCycd */
			return getAtsCycd();
		case 2089767478:/* atsCycdNm */
			return getAtsCycdNm();
		case 93150016:/* atsDd */
			return getAtsDd();
		case 527684256:/* atsWkdDscd */
			return getAtsWkdDscd();
		case 298431615:/* atsWkdDscdNm */
			return getAtsWkdDscdNm();
		case 93149932:/* atsAm */
			return getAtsAm();
		case -1563399077:/* atpmListCnt */
			return getAtpmListCnt();
		case -1528570448:/* pBPSpceDtlTrnPrtsList_ODT */
			return getpBPSpceDtlTrnPrtsList_ODT();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 2988387:/* acno */
			setAcno((String)value);
			break;
		case -1167209558:/* acnoBal */
			if ( value instanceof String ){
				setAcnoBal((String)value);
			}
			else if ( value instanceof Double ){
				setAcnoBal((Double)value);
			}
			else if ( value instanceof Long ){
				setAcnoBal((Long)value);
			}
			else{
				setAcnoBal((BigDecimal)value);
			}
			break;
		case -367460759:/* splitAvlAm */
			if ( value instanceof String ){
				setSplitAvlAm((String)value);
			}
			else if ( value instanceof Double ){
				setSplitAvlAm((Double)value);
			}
			else if ( value instanceof Long ){
				setSplitAvlAm((Long)value);
			}
			else{
				setSplitAvlAm((BigDecimal)value);
			}
			break;
		case 106929153:/* prdNm */
			setPrdNm((String)value);
			break;
		case 672207993:/* spceIconNo */
			setSpceIconNo((String)value);
			break;
		case 2106037375:/* spceSrno */
			setSpceSrno((String)value);
			break;
		case -896131682:/* spceNm */
			setSpceNm((String)value);
			break;
		case -2010290162:/* spceBal */
			if ( value instanceof String ){
				setSpceBal((String)value);
			}
			else if ( value instanceof Double ){
				setSpceBal((Double)value);
			}
			else if ( value instanceof Long ){
				setSpceBal((Long)value);
			}
			else{
				setSpceBal((BigDecimal)value);
			}
			break;
		case -660526937:/* savGoalAm */
			if ( value instanceof String ){
				setSavGoalAm((String)value);
			}
			else if ( value instanceof Double ){
				setSavGoalAm((Double)value);
			}
			else if ( value instanceof Long ){
				setSavGoalAm((Long)value);
			}
			else{
				setSavGoalAm((BigDecimal)value);
			}
			break;
		case 1799097461:/* savGoalStaDt */
			setSavGoalStaDt((String)value);
			break;
		case 1785992304:/* savGoalEndDt */
			setSavGoalEndDt((String)value);
			break;
		case -579940604:/* cnsmGoalAm */
			if ( value instanceof String ){
				setCnsmGoalAm((String)value);
			}
			else if ( value instanceof Double ){
				setCnsmGoalAm((Double)value);
			}
			else if ( value instanceof Long ){
				setCnsmGoalAm((Long)value);
			}
			else{
				setCnsmGoalAm((BigDecimal)value);
			}
			break;
		case -754478301:/* cnsmAmBscd */
			setCnsmAmBscd((String)value);
			break;
		case 795828290:/* cnsmAmBscdNm */
			setCnsmAmBscdNm((String)value);
			break;
		case 491964551:/* atsMngNo */
			setAtsMngNo((String)value);
			break;
		case 484738171:/* atsEstYn */
			setAtsEstYn((String)value);
			break;
		case -677154281:/* atsCycd */
			setAtsCycd((String)value);
			break;
		case 2089767478:/* atsCycdNm */
			setAtsCycdNm((String)value);
			break;
		case 93150016:/* atsDd */
			setAtsDd((String)value);
			break;
		case 527684256:/* atsWkdDscd */
			setAtsWkdDscd((String)value);
			break;
		case 298431615:/* atsWkdDscdNm */
			setAtsWkdDscdNm((String)value);
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
		case -1563399077:/* atpmListCnt */
			setAtpmListCnt((Integer)value);
			break;
		case -1528570448:/* pBPSpceDtlTrnPrtsList_ODT */
			setpBPSpceDtlTrnPrtsList_ODT((List<PBPPbokSpceDtlMngSelectSpcedtltrnprtslist_ODT>)value);
			break;
		default:
			break;
		}
	}
	
}
