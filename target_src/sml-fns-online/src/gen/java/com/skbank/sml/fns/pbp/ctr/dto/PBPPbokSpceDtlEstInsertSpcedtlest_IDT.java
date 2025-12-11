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
	"itcsno", "acno", "spceNm", "spceIconNo", "spceAm", "savGoalEstYn", "cnsmGoalEstYn", "goalStaDt", "goalEndDt", "savGoalAm", "cnsmGoalCycd", "cnsmGoalAm", "atsEstYn", "atsCycd", "atsDd"
	, "atsAm", "pBPSpceDtlAtpmEstInfList_IDT", "spceWdrBalEstCd"
}, name="PBPPbokSpceDtlEstInsertSpcedtlest_IDT")
@XmlRootElement(name="PBPPbokSpceDtlEstInsertSpcedtlest_IDT")
@BxmCategory(logicalName="공간.상세.설정.등록.컨트롤러.입력.IO", description="") 
public class PBPPbokSpceDtlEstInsertSpcedtlest_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -1995653931L;
	
	
	
	/**
	 * 통합고객번호
	 */
	@ApiModelProperty(
		name = "itcsno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("itcsno")
	@BxmOmm_Field(length=36, decimal=0, description="통합고객번호", align="left", fill="")
	private String itcsno= "";
	
	
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
	 * 공간아이콘번호
	 */
	@ApiModelProperty(
		name = "spceIconNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("spceIconNo")
	@BxmOmm_Field(length=40, decimal=0, description="공간아이콘번호", align="left", fill="")
	private String spceIconNo= "";
	
	
	/**
	 * 공간금액
	 */
	@ApiModelProperty(
		name = "spceAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("spceAm")
	@BxmOmm_Field(length=18, decimal=3, description="공간금액", align="right", fill="")
	private BigDecimal spceAm= new BigDecimal("0");
	
	
	/**
	 * 저축목표설정여부
	 */
	@ApiModelProperty(
		name = "savGoalEstYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("savGoalEstYn")
	@BxmOmm_Field(length=1, decimal=0, description="저축목표설정여부", align="left", fill="")
	private String savGoalEstYn= "";
	
	
	/**
	 * 소비목표설정여부
	 */
	@ApiModelProperty(
		name = "cnsmGoalEstYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("cnsmGoalEstYn")
	@BxmOmm_Field(length=1, decimal=0, description="소비목표설정여부", align="left", fill="")
	private String cnsmGoalEstYn= "";
	
	
	/**
	 * 목표시작일자
	 */
	@ApiModelProperty(
		name = "goalStaDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("goalStaDt")
	@BxmOmm_Field(length=8, decimal=0, description="목표시작일자", align="left", fill="")
	private String goalStaDt= "";
	
	
	/**
	 * 목표종료일자
	 */
	@ApiModelProperty(
		name = "goalEndDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("goalEndDt")
	@BxmOmm_Field(length=8, decimal=0, description="목표종료일자", align="left", fill="")
	private String goalEndDt= "";
	
	
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
	 * 소비목표주기코드
	 */
	@ApiModelProperty(
		name = "cnsmGoalCycd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("cnsmGoalCycd")
	@BxmOmm_Field(length=2, decimal=0, description="소비목표주기코드", align="left", fill="")
	private String cnsmGoalCycd= "";
	
	
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
	 * 공간.상세.자동납부.설정.조회.목록.컨트롤러.입력.IO
	 */
	@ApiModelProperty(
		name = "pBPSpceDtlAtpmEstInfList_IDT"
		, dataType = "[Lcom.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlEstInsertSpcedtlestlist_IDT;"
		)
	@XmlElement(name="item")
	@XmlElementWrapper()
	@JsonProperty("pBPSpceDtlAtpmEstInfList_IDT")
	@BxmOmm_Field(length=0, decimal=0, description="공간.상세.자동납부.설정.조회.목록.컨트롤러.입력.IO", align="left", fill="", arrayReference="1")
	private List<PBPPbokSpceDtlEstInsertSpcedtlestlist_IDT> pBPSpceDtlAtpmEstInfList_IDT= new ArrayList<>();
	
	/**
	 * 공간출금잔액설정코드
	 */
	@ApiModelProperty(
		name = "spceWdrBalEstCd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("spceWdrBalEstCd")
	@BxmOmm_Field(length=2, decimal=0, description="공간출금잔액설정코드", align="left", fill="")
	private String spceWdrBalEstCd= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_itcsno= false;
	protected final boolean isSet_itcsno(){
		return this.isSet_itcsno;
	}
	private void setIsSet_itcsno(boolean value){
		this.isSet_itcsno= value;
	}
	/**
	 * 통합고객번호
	 */
	@XmlTransient
	public String getItcsno(){
		return this.itcsno;
	}
	
	/**
	 * 통합고객번호
	 * 
	 * @param itcsno 통합고객번호
	 */
	public void setItcsno(String itcsno){
		this.itcsno= itcsno;
		this.setIsSet_itcsno(true);
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
	private boolean isSet_spceAm= false;
	protected final boolean isSet_spceAm(){
		return this.isSet_spceAm;
	}
	private void setIsSet_spceAm(boolean value){
		this.isSet_spceAm= value;
	}
	/**
	 * 공간금액
	 * BigDecimal - Double value setter
	 *
	 * @Param spceAm 공간금액
	 */
	public void setSpceAm(double spceAm) {
		setSpceAm(BigDecimal.valueOf(spceAm));
	}
	/**
	 * 공간금액
	 * BigDecimal - Long value setter
	 *
	 * @Param spceAm 공간금액
	 */
	public void setSpceAm(long spceAm) {
		setSpceAm(BigDecimal.valueOf(spceAm));
	}
	/**
	 * 공간금액
	 * BigDecimal - String value setter
	 *
	 * @Param spceAm 공간금액
	 */
	public void setSpceAm(String spceAm) {
		setSpceAm(new BigDecimal(spceAm));
	}
	/**
	 * 공간금액
	 */
	@XmlTransient
	public BigDecimal getSpceAm(){
		return this.spceAm;
	}
	
	/**
	 * 공간금액
	 * 
	 * @param spceAm 공간금액
	 */
	@JsonSetter("spceAm")
	public void setSpceAm(BigDecimal spceAm){
		this.spceAm= spceAm;
		this.setIsSet_spceAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_savGoalEstYn= false;
	protected final boolean isSet_savGoalEstYn(){
		return this.isSet_savGoalEstYn;
	}
	private void setIsSet_savGoalEstYn(boolean value){
		this.isSet_savGoalEstYn= value;
	}
	/**
	 * 저축목표설정여부
	 */
	@XmlTransient
	public String getSavGoalEstYn(){
		return this.savGoalEstYn;
	}
	
	/**
	 * 저축목표설정여부
	 * 
	 * @param savGoalEstYn 저축목표설정여부
	 */
	public void setSavGoalEstYn(String savGoalEstYn){
		this.savGoalEstYn= savGoalEstYn;
		this.setIsSet_savGoalEstYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cnsmGoalEstYn= false;
	protected final boolean isSet_cnsmGoalEstYn(){
		return this.isSet_cnsmGoalEstYn;
	}
	private void setIsSet_cnsmGoalEstYn(boolean value){
		this.isSet_cnsmGoalEstYn= value;
	}
	/**
	 * 소비목표설정여부
	 */
	@XmlTransient
	public String getCnsmGoalEstYn(){
		return this.cnsmGoalEstYn;
	}
	
	/**
	 * 소비목표설정여부
	 * 
	 * @param cnsmGoalEstYn 소비목표설정여부
	 */
	public void setCnsmGoalEstYn(String cnsmGoalEstYn){
		this.cnsmGoalEstYn= cnsmGoalEstYn;
		this.setIsSet_cnsmGoalEstYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_goalStaDt= false;
	protected final boolean isSet_goalStaDt(){
		return this.isSet_goalStaDt;
	}
	private void setIsSet_goalStaDt(boolean value){
		this.isSet_goalStaDt= value;
	}
	/**
	 * 목표시작일자
	 */
	@XmlTransient
	public String getGoalStaDt(){
		return this.goalStaDt;
	}
	
	/**
	 * 목표시작일자
	 * 
	 * @param goalStaDt 목표시작일자
	 */
	public void setGoalStaDt(String goalStaDt){
		this.goalStaDt= goalStaDt;
		this.setIsSet_goalStaDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_goalEndDt= false;
	protected final boolean isSet_goalEndDt(){
		return this.isSet_goalEndDt;
	}
	private void setIsSet_goalEndDt(boolean value){
		this.isSet_goalEndDt= value;
	}
	/**
	 * 목표종료일자
	 */
	@XmlTransient
	public String getGoalEndDt(){
		return this.goalEndDt;
	}
	
	/**
	 * 목표종료일자
	 * 
	 * @param goalEndDt 목표종료일자
	 */
	public void setGoalEndDt(String goalEndDt){
		this.goalEndDt= goalEndDt;
		this.setIsSet_goalEndDt(true);
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
	private boolean isSet_cnsmGoalCycd= false;
	protected final boolean isSet_cnsmGoalCycd(){
		return this.isSet_cnsmGoalCycd;
	}
	private void setIsSet_cnsmGoalCycd(boolean value){
		this.isSet_cnsmGoalCycd= value;
	}
	/**
	 * 소비목표주기코드
	 */
	@XmlTransient
	public String getCnsmGoalCycd(){
		return this.cnsmGoalCycd;
	}
	
	/**
	 * 소비목표주기코드
	 * 
	 * @param cnsmGoalCycd 소비목표주기코드
	 */
	public void setCnsmGoalCycd(String cnsmGoalCycd){
		this.cnsmGoalCycd= cnsmGoalCycd;
		this.setIsSet_cnsmGoalCycd(true);
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
	private boolean isSet_pBPSpceDtlAtpmEstInfList_IDT= false;
	protected final boolean isSet_pBPSpceDtlAtpmEstInfList_IDT(){
		return this.isSet_pBPSpceDtlAtpmEstInfList_IDT;
	}
	private void setIsSet_pBPSpceDtlAtpmEstInfList_IDT(boolean value){
		this.isSet_pBPSpceDtlAtpmEstInfList_IDT= value;
	}
	/**
	 * 공간.상세.자동납부.설정.조회.목록.컨트롤러.입력.IO
	 */
	@XmlTransient
	public List<PBPPbokSpceDtlEstInsertSpcedtlestlist_IDT> getpBPSpceDtlAtpmEstInfList_IDT(){
		return pBPSpceDtlAtpmEstInfList_IDT;
	}
	
	/**
	 * 공간.상세.자동납부.설정.조회.목록.컨트롤러.입력.IO
	 * 
	 * @param pBPSpceDtlAtpmEstInfList_IDT 공간.상세.자동납부.설정.조회.목록.컨트롤러.입력.IO
	 */
	@JsonSetter("pBPSpceDtlAtpmEstInfList_IDT")
	public void setpBPSpceDtlAtpmEstInfList_IDT(List<PBPPbokSpceDtlEstInsertSpcedtlestlist_IDT> pBPSpceDtlAtpmEstInfList_IDT){
		this.pBPSpceDtlAtpmEstInfList_IDT= pBPSpceDtlAtpmEstInfList_IDT;
		this.setIsSet_pBPSpceDtlAtpmEstInfList_IDT(true);
	}
	
	public void setpBPSpceDtlAtpmEstInfList_IDT(PBPPbokSpceDtlEstInsertSpcedtlestlist_IDT... items){
		List<PBPPbokSpceDtlEstInsertSpcedtlestlist_IDT> _items= new ArrayList<>();
		if ( items!= null && items.length> 0){
			for( PBPPbokSpceDtlEstInsertSpcedtlestlist_IDT item: items ){
				_items.add(item);
			}
		}
		this.setpBPSpceDtlAtpmEstInfList_IDT(_items);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_spceWdrBalEstCd= false;
	protected final boolean isSet_spceWdrBalEstCd(){
		return this.isSet_spceWdrBalEstCd;
	}
	private void setIsSet_spceWdrBalEstCd(boolean value){
		this.isSet_spceWdrBalEstCd= value;
	}
	/**
	 * 공간출금잔액설정코드
	 */
	@XmlTransient
	public String getSpceWdrBalEstCd(){
		return this.spceWdrBalEstCd;
	}
	
	/**
	 * 공간출금잔액설정코드
	 * 
	 * @param spceWdrBalEstCd 공간출금잔액설정코드
	 */
	public void setSpceWdrBalEstCd(String spceWdrBalEstCd){
		this.spceWdrBalEstCd= spceWdrBalEstCd;
		this.setIsSet_spceWdrBalEstCd(true);
	}
				
	@Override
	public PBPPbokSpceDtlEstInsertSpcedtlest_IDT clone(){
		try{
			PBPPbokSpceDtlEstInsertSpcedtlest_IDT object= (PBPPbokSpceDtlEstInsertSpcedtlest_IDT)super.clone();
			if ( this.pBPSpceDtlAtpmEstInfList_IDT== null ) object.pBPSpceDtlAtpmEstInfList_IDT= null;
			else{
				List<PBPPbokSpceDtlEstInsertSpcedtlestlist_IDT> clonedList= new ArrayList<>(this.pBPSpceDtlAtpmEstInfList_IDT.size());
				for( PBPPbokSpceDtlEstInsertSpcedtlestlist_IDT item : pBPSpceDtlAtpmEstInfList_IDT ){
					clonedList.add((PBPPbokSpceDtlEstInsertSpcedtlestlist_IDT)item.clone());
				}
				object.pBPSpceDtlAtpmEstInfList_IDT= clonedList;
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
		
		result= prime * result + ((this.itcsno==null)?0:this.itcsno.hashCode());
		result= prime * result + ((this.acno==null)?0:this.acno.hashCode());
		result= prime * result + ((this.spceNm==null)?0:this.spceNm.hashCode());
		result= prime * result + ((this.spceIconNo==null)?0:this.spceIconNo.hashCode());
		result= prime * result + ((this.spceAm==null)?0:this.spceAm.hashCode());
		result= prime * result + ((this.savGoalEstYn==null)?0:this.savGoalEstYn.hashCode());
		result= prime * result + ((this.cnsmGoalEstYn==null)?0:this.cnsmGoalEstYn.hashCode());
		result= prime * result + ((this.goalStaDt==null)?0:this.goalStaDt.hashCode());
		result= prime * result + ((this.goalEndDt==null)?0:this.goalEndDt.hashCode());
		result= prime * result + ((this.savGoalAm==null)?0:this.savGoalAm.hashCode());
		result= prime * result + ((this.cnsmGoalCycd==null)?0:this.cnsmGoalCycd.hashCode());
		result= prime * result + ((this.cnsmGoalAm==null)?0:this.cnsmGoalAm.hashCode());
		result= prime * result + ((this.atsEstYn==null)?0:this.atsEstYn.hashCode());
		result= prime * result + ((this.atsCycd==null)?0:this.atsCycd.hashCode());
		result= prime * result + ((this.atsDd==null)?0:this.atsDd.hashCode());
		result= prime * result + ((this.atsAm==null)?0:this.atsAm.hashCode());
		result= prime * result + ((this.pBPSpceDtlAtpmEstInfList_IDT==null)?0:this.pBPSpceDtlAtpmEstInfList_IDT.hashCode());
		result= prime * result + ((this.spceWdrBalEstCd==null)?0:this.spceWdrBalEstCd.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final PBPPbokSpceDtlEstInsertSpcedtlest_IDT other= (PBPPbokSpceDtlEstInsertSpcedtlest_IDT)obj;
		{
			Object _itcsno= getItcsno();
			Object __itcsno= other.getItcsno();
			if ( _itcsno== null ) { if ( __itcsno!= null ) return false; }
			else if ( !_itcsno.equals(__itcsno) ) return false;
		}
		{
			Object _acno= getAcno();
			Object __acno= other.getAcno();
			if ( _acno== null ) { if ( __acno!= null ) return false; }
			else if ( !_acno.equals(__acno) ) return false;
		}
		{
			Object _spceNm= getSpceNm();
			Object __spceNm= other.getSpceNm();
			if ( _spceNm== null ) { if ( __spceNm!= null ) return false; }
			else if ( !_spceNm.equals(__spceNm) ) return false;
		}
		{
			Object _spceIconNo= getSpceIconNo();
			Object __spceIconNo= other.getSpceIconNo();
			if ( _spceIconNo== null ) { if ( __spceIconNo!= null ) return false; }
			else if ( !_spceIconNo.equals(__spceIconNo) ) return false;
		}
		{
			Object _spceAm= getSpceAm();
			Object __spceAm= other.getSpceAm();
			if ( _spceAm== null ) { if ( __spceAm!= null ) return false; }
			else if ( !_spceAm.equals(__spceAm) ) return false;
		}
		{
			Object _savGoalEstYn= getSavGoalEstYn();
			Object __savGoalEstYn= other.getSavGoalEstYn();
			if ( _savGoalEstYn== null ) { if ( __savGoalEstYn!= null ) return false; }
			else if ( !_savGoalEstYn.equals(__savGoalEstYn) ) return false;
		}
		{
			Object _cnsmGoalEstYn= getCnsmGoalEstYn();
			Object __cnsmGoalEstYn= other.getCnsmGoalEstYn();
			if ( _cnsmGoalEstYn== null ) { if ( __cnsmGoalEstYn!= null ) return false; }
			else if ( !_cnsmGoalEstYn.equals(__cnsmGoalEstYn) ) return false;
		}
		{
			Object _goalStaDt= getGoalStaDt();
			Object __goalStaDt= other.getGoalStaDt();
			if ( _goalStaDt== null ) { if ( __goalStaDt!= null ) return false; }
			else if ( !_goalStaDt.equals(__goalStaDt) ) return false;
		}
		{
			Object _goalEndDt= getGoalEndDt();
			Object __goalEndDt= other.getGoalEndDt();
			if ( _goalEndDt== null ) { if ( __goalEndDt!= null ) return false; }
			else if ( !_goalEndDt.equals(__goalEndDt) ) return false;
		}
		{
			Object _savGoalAm= getSavGoalAm();
			Object __savGoalAm= other.getSavGoalAm();
			if ( _savGoalAm== null ) { if ( __savGoalAm!= null ) return false; }
			else if ( !_savGoalAm.equals(__savGoalAm) ) return false;
		}
		{
			Object _cnsmGoalCycd= getCnsmGoalCycd();
			Object __cnsmGoalCycd= other.getCnsmGoalCycd();
			if ( _cnsmGoalCycd== null ) { if ( __cnsmGoalCycd!= null ) return false; }
			else if ( !_cnsmGoalCycd.equals(__cnsmGoalCycd) ) return false;
		}
		{
			Object _cnsmGoalAm= getCnsmGoalAm();
			Object __cnsmGoalAm= other.getCnsmGoalAm();
			if ( _cnsmGoalAm== null ) { if ( __cnsmGoalAm!= null ) return false; }
			else if ( !_cnsmGoalAm.equals(__cnsmGoalAm) ) return false;
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
			Object _atsDd= getAtsDd();
			Object __atsDd= other.getAtsDd();
			if ( _atsDd== null ) { if ( __atsDd!= null ) return false; }
			else if ( !_atsDd.equals(__atsDd) ) return false;
		}
		{
			Object _atsAm= getAtsAm();
			Object __atsAm= other.getAtsAm();
			if ( _atsAm== null ) { if ( __atsAm!= null ) return false; }
			else if ( !_atsAm.equals(__atsAm) ) return false;
		}
		{
			Object _pBPSpceDtlAtpmEstInfList_IDT= getpBPSpceDtlAtpmEstInfList_IDT();
			Object __pBPSpceDtlAtpmEstInfList_IDT= other.getpBPSpceDtlAtpmEstInfList_IDT();
			if ( _pBPSpceDtlAtpmEstInfList_IDT== null ) { if ( __pBPSpceDtlAtpmEstInfList_IDT!= null ) return false; }
			else if ( !_pBPSpceDtlAtpmEstInfList_IDT.equals(__pBPSpceDtlAtpmEstInfList_IDT) ) return false;
		}
		{
			Object _spceWdrBalEstCd= getSpceWdrBalEstCd();
			Object __spceWdrBalEstCd= other.getSpceWdrBalEstCd();
			if ( _spceWdrBalEstCd== null ) { if ( __spceWdrBalEstCd!= null ) return false; }
			else if ( !_spceWdrBalEstCd.equals(__spceWdrBalEstCd) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(PBPPbokSpceDtlEstInsertSpcedtlest_IDT.class.getName()).append(":\n");
		sb.append("\titcsno: ");
		sb.append(itcsno==null?"null":getItcsno());
		sb.append("\n");
		sb.append("\tacno: ");
		sb.append(acno==null?"null":getAcno());
		sb.append("\n");
		sb.append("\tspceNm: ");
		sb.append(spceNm==null?"null":getSpceNm());
		sb.append("\n");
		sb.append("\tspceIconNo: ");
		sb.append(spceIconNo==null?"null":getSpceIconNo());
		sb.append("\n");
		sb.append("\tspceAm: ");
		sb.append(spceAm==null?"null":getSpceAm());
		sb.append("\n");
		sb.append("\tsavGoalEstYn: ");
		sb.append(savGoalEstYn==null?"null":getSavGoalEstYn());
		sb.append("\n");
		sb.append("\tcnsmGoalEstYn: ");
		sb.append(cnsmGoalEstYn==null?"null":getCnsmGoalEstYn());
		sb.append("\n");
		sb.append("\tgoalStaDt: ");
		sb.append(goalStaDt==null?"null":getGoalStaDt());
		sb.append("\n");
		sb.append("\tgoalEndDt: ");
		sb.append(goalEndDt==null?"null":getGoalEndDt());
		sb.append("\n");
		sb.append("\tsavGoalAm: ");
		sb.append(savGoalAm==null?"null":getSavGoalAm());
		sb.append("\n");
		sb.append("\tcnsmGoalCycd: ");
		sb.append(cnsmGoalCycd==null?"null":getCnsmGoalCycd());
		sb.append("\n");
		sb.append("\tcnsmGoalAm: ");
		sb.append(cnsmGoalAm==null?"null":getCnsmGoalAm());
		sb.append("\n");
		sb.append("\tatsEstYn: ");
		sb.append(atsEstYn==null?"null":getAtsEstYn());
		sb.append("\n");
		sb.append("\tatsCycd: ");
		sb.append(atsCycd==null?"null":getAtsCycd());
		sb.append("\n");
		sb.append("\tatsDd: ");
		sb.append(atsDd==null?"null":getAtsDd());
		sb.append("\n");
		sb.append("\tatsAm: ");
		sb.append(atsAm==null?"null":getAtsAm());
		sb.append("\n");
		sb.append("\tpBPSpceDtlAtpmEstInfList_IDT: ");
		if ( pBPSpceDtlAtpmEstInfList_IDT== null ) sb.append("null");
		else{
			sb.append("array count : ");
			sb.append(pBPSpceDtlAtpmEstInfList_IDT.size());
			sb.append("(items)\n");
	
			int max= (10<pBPSpceDtlAtpmEstInfList_IDT.size())?10:pBPSpceDtlAtpmEstInfList_IDT.size();
	
			for ( int i= 0; i < max; ++i ){
				sb.append("\tpBPSpceDtlAtpmEstInfList_IDT[");
				sb.append(i);
				sb.append("] : ");
				sb.append(pBPSpceDtlAtpmEstInfList_IDT.get(i));
				sb.append("\n");
			}
	
			if ( max < pBPSpceDtlAtpmEstInfList_IDT.size() ){
				sb.append("\tpBPSpceDtlAtpmEstInfList_IDT[.] : ").append("more ").append((pBPSpceDtlAtpmEstInfList_IDT.size()-max)).append(" items").append("\n");
			}
		}
		sb.append("\tspceWdrBalEstCd: ");
		sb.append(spceWdrBalEstCd==null?"null":getSpceWdrBalEstCd());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 36; /* itcsno */
		messageLen+= 13; /* acno */
		messageLen+= 50; /* spceNm */
		messageLen+= 40; /* spceIconNo */
		messageLen+= 18; /* spceAm */
		messageLen+= 1; /* savGoalEstYn */
		messageLen+= 1; /* cnsmGoalEstYn */
		messageLen+= 8; /* goalStaDt */
		messageLen+= 8; /* goalEndDt */
		messageLen+= 18; /* savGoalAm */
		messageLen+= 2; /* cnsmGoalCycd */
		messageLen+= 18; /* cnsmGoalAm */
		messageLen+= 1; /* atsEstYn */
		messageLen+= 1; /* atsCycd */
		messageLen+= 8; /* atsDd */
		messageLen+= 18; /* atsAm */
		{/*pBPSpceDtlAtpmEstInfList_IDT*/
			int size=1;
			int count= pBPSpceDtlAtpmEstInfList_IDT == null ? 0 : pBPSpceDtlAtpmEstInfList_IDT.size();
			int min= size > count?count:size;
			PBPPbokSpceDtlEstInsertSpcedtlestlist_IDT emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					PBPPbokSpceDtlEstInsertSpcedtlestlist_IDT element= pBPSpceDtlAtpmEstInfList_IDT.get(i);
					if ( element != null && !(element instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= element==null?0:( (Predictable)element).predictMessageLength();
				}else{
					if ( emptyElement== null ) emptyElement= new com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlEstInsertSpcedtlestlist_IDT();
					if ( !(emptyElement instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= ( (Predictable)emptyElement).predictMessageLength();
				}
			}
		}
		messageLen+= 2; /* spceWdrBalEstCd */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("itcsno");
		list.add("acno");
		list.add("spceNm");
		list.add("spceIconNo");
		list.add("spceAm");
		list.add("savGoalEstYn");
		list.add("cnsmGoalEstYn");
		list.add("goalStaDt");
		list.add("goalEndDt");
		list.add("savGoalAm");
		list.add("cnsmGoalCycd");
		list.add("cnsmGoalAm");
		list.add("atsEstYn");
		list.add("atsCycd");
		list.add("atsDd");
		list.add("atsAm");
		list.add("pBPSpceDtlAtpmEstInfList_IDT");
		list.add("spceWdrBalEstCd");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("itcsno", get("itcsno"));
		map.put("acno", get("acno"));
		map.put("spceNm", get("spceNm"));
		map.put("spceIconNo", get("spceIconNo"));
		map.put("spceAm", get("spceAm"));
		map.put("savGoalEstYn", get("savGoalEstYn"));
		map.put("cnsmGoalEstYn", get("cnsmGoalEstYn"));
		map.put("goalStaDt", get("goalStaDt"));
		map.put("goalEndDt", get("goalEndDt"));
		map.put("savGoalAm", get("savGoalAm"));
		map.put("cnsmGoalCycd", get("cnsmGoalCycd"));
		map.put("cnsmGoalAm", get("cnsmGoalAm"));
		map.put("atsEstYn", get("atsEstYn"));
		map.put("atsCycd", get("atsCycd"));
		map.put("atsDd", get("atsDd"));
		map.put("atsAm", get("atsAm"));
		map.put("pBPSpceDtlAtpmEstInfList_IDT", get("pBPSpceDtlAtpmEstInfList_IDT"));
		map.put("spceWdrBalEstCd", get("spceWdrBalEstCd"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -1178714660:/* itcsno */
			return getItcsno();
		case 2988387:/* acno */
			return getAcno();
		case -896131682:/* spceNm */
			return getSpceNm();
		case 672207993:/* spceIconNo */
			return getSpceIconNo();
		case -896132085:/* spceAm */
			return getSpceAm();
		case 1786157280:/* savGoalEstYn */
			return getSavGoalEstYn();
		case 1646885219:/* cnsmGoalEstYn */
			return getCnsmGoalEstYn();
		case 2054865789:/* goalStaDt */
			return getGoalStaDt();
		case 2041760632:/* goalEndDt */
			return getGoalEndDt();
		case -660526937:/* savGoalAm */
			return getSavGoalAm();
		case 1022902319:/* cnsmGoalCycd */
			return getCnsmGoalCycd();
		case -579940604:/* cnsmGoalAm */
			return getCnsmGoalAm();
		case 484738171:/* atsEstYn */
			return getAtsEstYn();
		case -677154281:/* atsCycd */
			return getAtsCycd();
		case 93150016:/* atsDd */
			return getAtsDd();
		case 93149932:/* atsAm */
			return getAtsAm();
		case 1726196802:/* pBPSpceDtlAtpmEstInfList_IDT */
			return getpBPSpceDtlAtpmEstInfList_IDT();
		case 282382816:/* spceWdrBalEstCd */
			return getSpceWdrBalEstCd();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -1178714660:/* itcsno */
			setItcsno((String)value);
			break;
		case 2988387:/* acno */
			setAcno((String)value);
			break;
		case -896131682:/* spceNm */
			setSpceNm((String)value);
			break;
		case 672207993:/* spceIconNo */
			setSpceIconNo((String)value);
			break;
		case -896132085:/* spceAm */
			if ( value instanceof String ){
				setSpceAm((String)value);
			}
			else if ( value instanceof Double ){
				setSpceAm((Double)value);
			}
			else if ( value instanceof Long ){
				setSpceAm((Long)value);
			}
			else{
				setSpceAm((BigDecimal)value);
			}
			break;
		case 1786157280:/* savGoalEstYn */
			setSavGoalEstYn((String)value);
			break;
		case 1646885219:/* cnsmGoalEstYn */
			setCnsmGoalEstYn((String)value);
			break;
		case 2054865789:/* goalStaDt */
			setGoalStaDt((String)value);
			break;
		case 2041760632:/* goalEndDt */
			setGoalEndDt((String)value);
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
		case 1022902319:/* cnsmGoalCycd */
			setCnsmGoalCycd((String)value);
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
		case 484738171:/* atsEstYn */
			setAtsEstYn((String)value);
			break;
		case -677154281:/* atsCycd */
			setAtsCycd((String)value);
			break;
		case 93150016:/* atsDd */
			setAtsDd((String)value);
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
		case 1726196802:/* pBPSpceDtlAtpmEstInfList_IDT */
			setpBPSpceDtlAtpmEstInfList_IDT((List<PBPPbokSpceDtlEstInsertSpcedtlestlist_IDT>)value);
			break;
		case 282382816:/* spceWdrBalEstCd */
			setSpceWdrBalEstCd((String)value);
			break;
		default:
			break;
		}
	}
	
}
