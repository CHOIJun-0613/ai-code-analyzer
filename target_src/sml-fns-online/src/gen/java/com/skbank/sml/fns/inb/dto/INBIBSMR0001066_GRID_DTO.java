/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.inb.dto;

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
 * 개인계좌보유조회 IBSMR0001066
 */
@XmlType(propOrder={
	"newAcno", "cusUsgAcno", "pdcd", "prdNm", "cucd", "pbokBal", "faxcBal", "wdrAvlAm", "faxcWdrAvlAm", "psklActYn", "lactYn", "fxActYn", "pbokKd", "newDt", "lstTrnDt"
	, "epdt", "adntRgsYn", "crtdIsuActYn", "wdrActYn", "csno", "ntrnnActYn", "wdrActUnitRcvDgnYn", "prdDisSmlItm", "psnMmfYn", "elfYn", "actKrxcBal", "hdnActYn", "pnsnPayStepDscd"
}, name="INBIBSMR0001066_GRID_DTO")
@XmlRootElement(name="INBIBSMR0001066_GRID_DTO")
@BxmCategory(logicalName="개인계좌보유조회_GRID.공통.IO", description="개인계좌보유조회 IBSMR0001066") 
public class INBIBSMR0001066_GRID_DTO implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 1701281896L;
	
	
	
	/**
	 * 신계좌번호
	 */
	@ApiModelProperty(
		name = "newAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("newAcno")
	@BxmOmm_Field(length=15, decimal=0, description="신계좌번호", align="left", fill="")
	private String newAcno= "";
	
	
	/**
	 * 고객사용계좌번호
	 */
	@ApiModelProperty(
		name = "cusUsgAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("cusUsgAcno")
	@BxmOmm_Field(length=15, decimal=0, description="고객사용계좌번호", align="left", fill="")
	private String cusUsgAcno= "";
	
	
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
	 * 통장잔액
	 */
	@ApiModelProperty(
		name = "pbokBal"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("pbokBal")
	@BxmOmm_Field(length=19, decimal=3, description="통장잔액", align="right", fill="")
	private BigDecimal pbokBal= new BigDecimal("0");
	
	
	/**
	 * 대미환산잔액
	 */
	@ApiModelProperty(
		name = "faxcBal"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("faxcBal")
	@BxmOmm_Field(length=19, decimal=3, description="대미환산잔액", align="right", fill="")
	private BigDecimal faxcBal= new BigDecimal("0");
	
	
	/**
	 * 출금가능금액
	 */
	@ApiModelProperty(
		name = "wdrAvlAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("wdrAvlAm")
	@BxmOmm_Field(length=19, decimal=3, description="출금가능금액", align="right", fill="")
	private BigDecimal wdrAvlAm= new BigDecimal("0");
	
	
	/**
	 * 대미환산출금가능금액
	 */
	@ApiModelProperty(
		name = "faxcWdrAvlAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("faxcWdrAvlAm")
	@BxmOmm_Field(length=19, decimal=3, description="대미환산출금가능금액", align="right", fill="")
	private BigDecimal faxcWdrAvlAm= new BigDecimal("0");
	
	
	/**
	 * 통장대출계좌여부
	 */
	@ApiModelProperty(
		name = "psklActYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("psklActYn")
	@BxmOmm_Field(length=1, decimal=0, description="통장대출계좌여부", align="left", fill="")
	private String psklActYn= "";
	
	
	/**
	 * 여신계좌여부
	 */
	@ApiModelProperty(
		name = "lactYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("lactYn")
	@BxmOmm_Field(length=1, decimal=0, description="여신계좌여부", align="left", fill="")
	private String lactYn= "";
	
	
	/**
	 * 외환계좌여부
	 */
	@ApiModelProperty(
		name = "fxActYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("fxActYn")
	@BxmOmm_Field(length=1, decimal=0, description="외환계좌여부", align="left", fill="")
	private String fxActYn= "";
	
	
	/**
	 * 통장종류
	 */
	@ApiModelProperty(
		name = "pbokKd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("pbokKd")
	@BxmOmm_Field(length=4, decimal=0, description="통장종류", align="left", fill="")
	private String pbokKd= "";
	
	
	/**
	 * 신규일자
	 */
	@ApiModelProperty(
		name = "newDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("newDt")
	@BxmOmm_Field(length=8, decimal=0, description="신규일자", align="left", fill="")
	private String newDt= "";
	
	
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
	 * 만기일
	 */
	@ApiModelProperty(
		name = "epdt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("epdt")
	@BxmOmm_Field(length=8, decimal=0, description="만기일", align="left", fill="")
	private String epdt= "";
	
	
	/**
	 * 사고등록여부
	 */
	@ApiModelProperty(
		name = "adntRgsYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("adntRgsYn")
	@BxmOmm_Field(length=1, decimal=0, description="사고등록여부", align="left", fill="")
	private String adntRgsYn= "";
	
	
	/**
	 * 증명서발급계좌여부
	 */
	@ApiModelProperty(
		name = "crtdIsuActYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("crtdIsuActYn")
	@BxmOmm_Field(length=1, decimal=0, description="증명서발급계좌여부", align="left", fill="")
	private String crtdIsuActYn= "";
	
	
	/**
	 * 출금계좌여부
	 */
	@ApiModelProperty(
		name = "wdrActYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("wdrActYn")
	@BxmOmm_Field(length=1, decimal=0, description="출금계좌여부", align="left", fill="")
	private String wdrActYn= "";
	
	
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
	 * 무거래계좌여부
	 */
	@ApiModelProperty(
		name = "ntrnnActYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ntrnnActYn")
	@BxmOmm_Field(length=1, decimal=0, description="무거래계좌여부", align="left", fill="")
	private String ntrnnActYn= "";
	
	
	/**
	 * 출금계좌단위입금지정여부
	 */
	@ApiModelProperty(
		name = "wdrActUnitRcvDgnYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("wdrActUnitRcvDgnYn")
	@BxmOmm_Field(length=1, decimal=0, description="출금계좌단위입금지정여부", align="left", fill="")
	private String wdrActUnitRcvDgnYn= "";
	
	
	/**
	 * 상품구분소항목
	 */
	@ApiModelProperty(
		name = "prdDisSmlItm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("prdDisSmlItm")
	@BxmOmm_Field(length=1, decimal=0, description="상품구분소항목", align="left", fill="")
	private String prdDisSmlItm= "";
	
	
	/**
	 * 개인MMF여부
	 */
	@ApiModelProperty(
		name = "psnMmfYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("psnMmfYn")
	@BxmOmm_Field(length=1, decimal=0, description="개인MMF여부", align="left", fill="")
	private String psnMmfYn= "";
	
	
	/**
	 * ELF여부
	 */
	@ApiModelProperty(
		name = "elfYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("elfYn")
	@BxmOmm_Field(length=1, decimal=0, description="ELF여부", align="left", fill="")
	private String elfYn= "";
	
	
	/**
	 * 계좌원화환산잔액
	 */
	@ApiModelProperty(
		name = "actKrxcBal"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("actKrxcBal")
	@BxmOmm_Field(length=19, decimal=3, description="계좌원화환산잔액", align="right", fill="")
	private BigDecimal actKrxcBal= new BigDecimal("0");
	
	
	/**
	 * 숨김계좌여부
	 */
	@ApiModelProperty(
		name = "hdnActYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("hdnActYn")
	@BxmOmm_Field(length=1, decimal=0, description="숨김계좌여부", align="left", fill="")
	private String hdnActYn= "";
	
	
	/**
	 * 연금지급단계구분코드
	 */
	@ApiModelProperty(
		name = "pnsnPayStepDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("pnsnPayStepDscd")
	@BxmOmm_Field(length=1, decimal=0, description="연금지급단계구분코드", align="left", fill="")
	private String pnsnPayStepDscd= "";
	
	
	
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
	 * 신계좌번호
	 */
	@XmlTransient
	public String getNewAcno(){
		return this.newAcno;
	}
	
	/**
	 * 신계좌번호
	 * 
	 * @param newAcno 신계좌번호
	 */
	public void setNewAcno(String newAcno){
		this.newAcno= newAcno;
		this.setIsSet_newAcno(true);
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
	private boolean isSet_pbokBal= false;
	protected final boolean isSet_pbokBal(){
		return this.isSet_pbokBal;
	}
	private void setIsSet_pbokBal(boolean value){
		this.isSet_pbokBal= value;
	}
	/**
	 * 통장잔액
	 * BigDecimal - Double value setter
	 *
	 * @Param pbokBal 통장잔액
	 */
	public void setPbokBal(double pbokBal) {
		setPbokBal(BigDecimal.valueOf(pbokBal));
	}
	/**
	 * 통장잔액
	 * BigDecimal - Long value setter
	 *
	 * @Param pbokBal 통장잔액
	 */
	public void setPbokBal(long pbokBal) {
		setPbokBal(BigDecimal.valueOf(pbokBal));
	}
	/**
	 * 통장잔액
	 * BigDecimal - String value setter
	 *
	 * @Param pbokBal 통장잔액
	 */
	public void setPbokBal(String pbokBal) {
		setPbokBal(new BigDecimal(pbokBal));
	}
	/**
	 * 통장잔액
	 */
	@XmlTransient
	public BigDecimal getPbokBal(){
		return this.pbokBal;
	}
	
	/**
	 * 통장잔액
	 * 
	 * @param pbokBal 통장잔액
	 */
	@JsonSetter("pbokBal")
	public void setPbokBal(BigDecimal pbokBal){
		this.pbokBal= pbokBal;
		this.setIsSet_pbokBal(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_faxcBal= false;
	protected final boolean isSet_faxcBal(){
		return this.isSet_faxcBal;
	}
	private void setIsSet_faxcBal(boolean value){
		this.isSet_faxcBal= value;
	}
	/**
	 * 대미환산잔액
	 * BigDecimal - Double value setter
	 *
	 * @Param faxcBal 대미환산잔액
	 */
	public void setFaxcBal(double faxcBal) {
		setFaxcBal(BigDecimal.valueOf(faxcBal));
	}
	/**
	 * 대미환산잔액
	 * BigDecimal - Long value setter
	 *
	 * @Param faxcBal 대미환산잔액
	 */
	public void setFaxcBal(long faxcBal) {
		setFaxcBal(BigDecimal.valueOf(faxcBal));
	}
	/**
	 * 대미환산잔액
	 * BigDecimal - String value setter
	 *
	 * @Param faxcBal 대미환산잔액
	 */
	public void setFaxcBal(String faxcBal) {
		setFaxcBal(new BigDecimal(faxcBal));
	}
	/**
	 * 대미환산잔액
	 */
	@XmlTransient
	public BigDecimal getFaxcBal(){
		return this.faxcBal;
	}
	
	/**
	 * 대미환산잔액
	 * 
	 * @param faxcBal 대미환산잔액
	 */
	@JsonSetter("faxcBal")
	public void setFaxcBal(BigDecimal faxcBal){
		this.faxcBal= faxcBal;
		this.setIsSet_faxcBal(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_wdrAvlAm= false;
	protected final boolean isSet_wdrAvlAm(){
		return this.isSet_wdrAvlAm;
	}
	private void setIsSet_wdrAvlAm(boolean value){
		this.isSet_wdrAvlAm= value;
	}
	/**
	 * 출금가능금액
	 * BigDecimal - Double value setter
	 *
	 * @Param wdrAvlAm 출금가능금액
	 */
	public void setWdrAvlAm(double wdrAvlAm) {
		setWdrAvlAm(BigDecimal.valueOf(wdrAvlAm));
	}
	/**
	 * 출금가능금액
	 * BigDecimal - Long value setter
	 *
	 * @Param wdrAvlAm 출금가능금액
	 */
	public void setWdrAvlAm(long wdrAvlAm) {
		setWdrAvlAm(BigDecimal.valueOf(wdrAvlAm));
	}
	/**
	 * 출금가능금액
	 * BigDecimal - String value setter
	 *
	 * @Param wdrAvlAm 출금가능금액
	 */
	public void setWdrAvlAm(String wdrAvlAm) {
		setWdrAvlAm(new BigDecimal(wdrAvlAm));
	}
	/**
	 * 출금가능금액
	 */
	@XmlTransient
	public BigDecimal getWdrAvlAm(){
		return this.wdrAvlAm;
	}
	
	/**
	 * 출금가능금액
	 * 
	 * @param wdrAvlAm 출금가능금액
	 */
	@JsonSetter("wdrAvlAm")
	public void setWdrAvlAm(BigDecimal wdrAvlAm){
		this.wdrAvlAm= wdrAvlAm;
		this.setIsSet_wdrAvlAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_faxcWdrAvlAm= false;
	protected final boolean isSet_faxcWdrAvlAm(){
		return this.isSet_faxcWdrAvlAm;
	}
	private void setIsSet_faxcWdrAvlAm(boolean value){
		this.isSet_faxcWdrAvlAm= value;
	}
	/**
	 * 대미환산출금가능금액
	 * BigDecimal - Double value setter
	 *
	 * @Param faxcWdrAvlAm 대미환산출금가능금액
	 */
	public void setFaxcWdrAvlAm(double faxcWdrAvlAm) {
		setFaxcWdrAvlAm(BigDecimal.valueOf(faxcWdrAvlAm));
	}
	/**
	 * 대미환산출금가능금액
	 * BigDecimal - Long value setter
	 *
	 * @Param faxcWdrAvlAm 대미환산출금가능금액
	 */
	public void setFaxcWdrAvlAm(long faxcWdrAvlAm) {
		setFaxcWdrAvlAm(BigDecimal.valueOf(faxcWdrAvlAm));
	}
	/**
	 * 대미환산출금가능금액
	 * BigDecimal - String value setter
	 *
	 * @Param faxcWdrAvlAm 대미환산출금가능금액
	 */
	public void setFaxcWdrAvlAm(String faxcWdrAvlAm) {
		setFaxcWdrAvlAm(new BigDecimal(faxcWdrAvlAm));
	}
	/**
	 * 대미환산출금가능금액
	 */
	@XmlTransient
	public BigDecimal getFaxcWdrAvlAm(){
		return this.faxcWdrAvlAm;
	}
	
	/**
	 * 대미환산출금가능금액
	 * 
	 * @param faxcWdrAvlAm 대미환산출금가능금액
	 */
	@JsonSetter("faxcWdrAvlAm")
	public void setFaxcWdrAvlAm(BigDecimal faxcWdrAvlAm){
		this.faxcWdrAvlAm= faxcWdrAvlAm;
		this.setIsSet_faxcWdrAvlAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_psklActYn= false;
	protected final boolean isSet_psklActYn(){
		return this.isSet_psklActYn;
	}
	private void setIsSet_psklActYn(boolean value){
		this.isSet_psklActYn= value;
	}
	/**
	 * 통장대출계좌여부
	 */
	@XmlTransient
	public String getPsklActYn(){
		return this.psklActYn;
	}
	
	/**
	 * 통장대출계좌여부
	 * 
	 * @param psklActYn 통장대출계좌여부
	 */
	public void setPsklActYn(String psklActYn){
		this.psklActYn= psklActYn;
		this.setIsSet_psklActYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_lactYn= false;
	protected final boolean isSet_lactYn(){
		return this.isSet_lactYn;
	}
	private void setIsSet_lactYn(boolean value){
		this.isSet_lactYn= value;
	}
	/**
	 * 여신계좌여부
	 */
	@XmlTransient
	public String getLactYn(){
		return this.lactYn;
	}
	
	/**
	 * 여신계좌여부
	 * 
	 * @param lactYn 여신계좌여부
	 */
	public void setLactYn(String lactYn){
		this.lactYn= lactYn;
		this.setIsSet_lactYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_fxActYn= false;
	protected final boolean isSet_fxActYn(){
		return this.isSet_fxActYn;
	}
	private void setIsSet_fxActYn(boolean value){
		this.isSet_fxActYn= value;
	}
	/**
	 * 외환계좌여부
	 */
	@XmlTransient
	public String getFxActYn(){
		return this.fxActYn;
	}
	
	/**
	 * 외환계좌여부
	 * 
	 * @param fxActYn 외환계좌여부
	 */
	public void setFxActYn(String fxActYn){
		this.fxActYn= fxActYn;
		this.setIsSet_fxActYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pbokKd= false;
	protected final boolean isSet_pbokKd(){
		return this.isSet_pbokKd;
	}
	private void setIsSet_pbokKd(boolean value){
		this.isSet_pbokKd= value;
	}
	/**
	 * 통장종류
	 */
	@XmlTransient
	public String getPbokKd(){
		return this.pbokKd;
	}
	
	/**
	 * 통장종류
	 * 
	 * @param pbokKd 통장종류
	 */
	public void setPbokKd(String pbokKd){
		this.pbokKd= pbokKd;
		this.setIsSet_pbokKd(true);
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
	private boolean isSet_epdt= false;
	protected final boolean isSet_epdt(){
		return this.isSet_epdt;
	}
	private void setIsSet_epdt(boolean value){
		this.isSet_epdt= value;
	}
	/**
	 * 만기일
	 */
	@XmlTransient
	public String getEpdt(){
		return this.epdt;
	}
	
	/**
	 * 만기일
	 * 
	 * @param epdt 만기일
	 */
	public void setEpdt(String epdt){
		this.epdt= epdt;
		this.setIsSet_epdt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_adntRgsYn= false;
	protected final boolean isSet_adntRgsYn(){
		return this.isSet_adntRgsYn;
	}
	private void setIsSet_adntRgsYn(boolean value){
		this.isSet_adntRgsYn= value;
	}
	/**
	 * 사고등록여부
	 */
	@XmlTransient
	public String getAdntRgsYn(){
		return this.adntRgsYn;
	}
	
	/**
	 * 사고등록여부
	 * 
	 * @param adntRgsYn 사고등록여부
	 */
	public void setAdntRgsYn(String adntRgsYn){
		this.adntRgsYn= adntRgsYn;
		this.setIsSet_adntRgsYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_crtdIsuActYn= false;
	protected final boolean isSet_crtdIsuActYn(){
		return this.isSet_crtdIsuActYn;
	}
	private void setIsSet_crtdIsuActYn(boolean value){
		this.isSet_crtdIsuActYn= value;
	}
	/**
	 * 증명서발급계좌여부
	 */
	@XmlTransient
	public String getCrtdIsuActYn(){
		return this.crtdIsuActYn;
	}
	
	/**
	 * 증명서발급계좌여부
	 * 
	 * @param crtdIsuActYn 증명서발급계좌여부
	 */
	public void setCrtdIsuActYn(String crtdIsuActYn){
		this.crtdIsuActYn= crtdIsuActYn;
		this.setIsSet_crtdIsuActYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_wdrActYn= false;
	protected final boolean isSet_wdrActYn(){
		return this.isSet_wdrActYn;
	}
	private void setIsSet_wdrActYn(boolean value){
		this.isSet_wdrActYn= value;
	}
	/**
	 * 출금계좌여부
	 */
	@XmlTransient
	public String getWdrActYn(){
		return this.wdrActYn;
	}
	
	/**
	 * 출금계좌여부
	 * 
	 * @param wdrActYn 출금계좌여부
	 */
	public void setWdrActYn(String wdrActYn){
		this.wdrActYn= wdrActYn;
		this.setIsSet_wdrActYn(true);
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
	private boolean isSet_ntrnnActYn= false;
	protected final boolean isSet_ntrnnActYn(){
		return this.isSet_ntrnnActYn;
	}
	private void setIsSet_ntrnnActYn(boolean value){
		this.isSet_ntrnnActYn= value;
	}
	/**
	 * 무거래계좌여부
	 */
	@XmlTransient
	public String getNtrnnActYn(){
		return this.ntrnnActYn;
	}
	
	/**
	 * 무거래계좌여부
	 * 
	 * @param ntrnnActYn 무거래계좌여부
	 */
	public void setNtrnnActYn(String ntrnnActYn){
		this.ntrnnActYn= ntrnnActYn;
		this.setIsSet_ntrnnActYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_wdrActUnitRcvDgnYn= false;
	protected final boolean isSet_wdrActUnitRcvDgnYn(){
		return this.isSet_wdrActUnitRcvDgnYn;
	}
	private void setIsSet_wdrActUnitRcvDgnYn(boolean value){
		this.isSet_wdrActUnitRcvDgnYn= value;
	}
	/**
	 * 출금계좌단위입금지정여부
	 */
	@XmlTransient
	public String getWdrActUnitRcvDgnYn(){
		return this.wdrActUnitRcvDgnYn;
	}
	
	/**
	 * 출금계좌단위입금지정여부
	 * 
	 * @param wdrActUnitRcvDgnYn 출금계좌단위입금지정여부
	 */
	public void setWdrActUnitRcvDgnYn(String wdrActUnitRcvDgnYn){
		this.wdrActUnitRcvDgnYn= wdrActUnitRcvDgnYn;
		this.setIsSet_wdrActUnitRcvDgnYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_prdDisSmlItm= false;
	protected final boolean isSet_prdDisSmlItm(){
		return this.isSet_prdDisSmlItm;
	}
	private void setIsSet_prdDisSmlItm(boolean value){
		this.isSet_prdDisSmlItm= value;
	}
	/**
	 * 상품구분소항목
	 */
	@XmlTransient
	public String getPrdDisSmlItm(){
		return this.prdDisSmlItm;
	}
	
	/**
	 * 상품구분소항목
	 * 
	 * @param prdDisSmlItm 상품구분소항목
	 */
	public void setPrdDisSmlItm(String prdDisSmlItm){
		this.prdDisSmlItm= prdDisSmlItm;
		this.setIsSet_prdDisSmlItm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_psnMmfYn= false;
	protected final boolean isSet_psnMmfYn(){
		return this.isSet_psnMmfYn;
	}
	private void setIsSet_psnMmfYn(boolean value){
		this.isSet_psnMmfYn= value;
	}
	/**
	 * 개인MMF여부
	 */
	@XmlTransient
	public String getPsnMmfYn(){
		return this.psnMmfYn;
	}
	
	/**
	 * 개인MMF여부
	 * 
	 * @param psnMmfYn 개인MMF여부
	 */
	public void setPsnMmfYn(String psnMmfYn){
		this.psnMmfYn= psnMmfYn;
		this.setIsSet_psnMmfYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_elfYn= false;
	protected final boolean isSet_elfYn(){
		return this.isSet_elfYn;
	}
	private void setIsSet_elfYn(boolean value){
		this.isSet_elfYn= value;
	}
	/**
	 * ELF여부
	 */
	@XmlTransient
	public String getElfYn(){
		return this.elfYn;
	}
	
	/**
	 * ELF여부
	 * 
	 * @param elfYn ELF여부
	 */
	public void setElfYn(String elfYn){
		this.elfYn= elfYn;
		this.setIsSet_elfYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_actKrxcBal= false;
	protected final boolean isSet_actKrxcBal(){
		return this.isSet_actKrxcBal;
	}
	private void setIsSet_actKrxcBal(boolean value){
		this.isSet_actKrxcBal= value;
	}
	/**
	 * 계좌원화환산잔액
	 * BigDecimal - Double value setter
	 *
	 * @Param actKrxcBal 계좌원화환산잔액
	 */
	public void setActKrxcBal(double actKrxcBal) {
		setActKrxcBal(BigDecimal.valueOf(actKrxcBal));
	}
	/**
	 * 계좌원화환산잔액
	 * BigDecimal - Long value setter
	 *
	 * @Param actKrxcBal 계좌원화환산잔액
	 */
	public void setActKrxcBal(long actKrxcBal) {
		setActKrxcBal(BigDecimal.valueOf(actKrxcBal));
	}
	/**
	 * 계좌원화환산잔액
	 * BigDecimal - String value setter
	 *
	 * @Param actKrxcBal 계좌원화환산잔액
	 */
	public void setActKrxcBal(String actKrxcBal) {
		setActKrxcBal(new BigDecimal(actKrxcBal));
	}
	/**
	 * 계좌원화환산잔액
	 */
	@XmlTransient
	public BigDecimal getActKrxcBal(){
		return this.actKrxcBal;
	}
	
	/**
	 * 계좌원화환산잔액
	 * 
	 * @param actKrxcBal 계좌원화환산잔액
	 */
	@JsonSetter("actKrxcBal")
	public void setActKrxcBal(BigDecimal actKrxcBal){
		this.actKrxcBal= actKrxcBal;
		this.setIsSet_actKrxcBal(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_hdnActYn= false;
	protected final boolean isSet_hdnActYn(){
		return this.isSet_hdnActYn;
	}
	private void setIsSet_hdnActYn(boolean value){
		this.isSet_hdnActYn= value;
	}
	/**
	 * 숨김계좌여부
	 */
	@XmlTransient
	public String getHdnActYn(){
		return this.hdnActYn;
	}
	
	/**
	 * 숨김계좌여부
	 * 
	 * @param hdnActYn 숨김계좌여부
	 */
	public void setHdnActYn(String hdnActYn){
		this.hdnActYn= hdnActYn;
		this.setIsSet_hdnActYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pnsnPayStepDscd= false;
	protected final boolean isSet_pnsnPayStepDscd(){
		return this.isSet_pnsnPayStepDscd;
	}
	private void setIsSet_pnsnPayStepDscd(boolean value){
		this.isSet_pnsnPayStepDscd= value;
	}
	/**
	 * 연금지급단계구분코드
	 */
	@XmlTransient
	public String getPnsnPayStepDscd(){
		return this.pnsnPayStepDscd;
	}
	
	/**
	 * 연금지급단계구분코드
	 * 
	 * @param pnsnPayStepDscd 연금지급단계구분코드
	 */
	public void setPnsnPayStepDscd(String pnsnPayStepDscd){
		this.pnsnPayStepDscd= pnsnPayStepDscd;
		this.setIsSet_pnsnPayStepDscd(true);
	}
				
	@Override
	public INBIBSMR0001066_GRID_DTO clone(){
		try{
			INBIBSMR0001066_GRID_DTO object= (INBIBSMR0001066_GRID_DTO)super.clone();
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
		
		result= prime * result + ((this.newAcno==null)?0:this.newAcno.hashCode());
		result= prime * result + ((this.cusUsgAcno==null)?0:this.cusUsgAcno.hashCode());
		result= prime * result + ((this.pdcd==null)?0:this.pdcd.hashCode());
		result= prime * result + ((this.prdNm==null)?0:this.prdNm.hashCode());
		result= prime * result + ((this.cucd==null)?0:this.cucd.hashCode());
		result= prime * result + ((this.pbokBal==null)?0:this.pbokBal.hashCode());
		result= prime * result + ((this.faxcBal==null)?0:this.faxcBal.hashCode());
		result= prime * result + ((this.wdrAvlAm==null)?0:this.wdrAvlAm.hashCode());
		result= prime * result + ((this.faxcWdrAvlAm==null)?0:this.faxcWdrAvlAm.hashCode());
		result= prime * result + ((this.psklActYn==null)?0:this.psklActYn.hashCode());
		result= prime * result + ((this.lactYn==null)?0:this.lactYn.hashCode());
		result= prime * result + ((this.fxActYn==null)?0:this.fxActYn.hashCode());
		result= prime * result + ((this.pbokKd==null)?0:this.pbokKd.hashCode());
		result= prime * result + ((this.newDt==null)?0:this.newDt.hashCode());
		result= prime * result + ((this.lstTrnDt==null)?0:this.lstTrnDt.hashCode());
		result= prime * result + ((this.epdt==null)?0:this.epdt.hashCode());
		result= prime * result + ((this.adntRgsYn==null)?0:this.adntRgsYn.hashCode());
		result= prime * result + ((this.crtdIsuActYn==null)?0:this.crtdIsuActYn.hashCode());
		result= prime * result + ((this.wdrActYn==null)?0:this.wdrActYn.hashCode());
		result= prime * result + ((this.csno==null)?0:this.csno.hashCode());
		result= prime * result + ((this.ntrnnActYn==null)?0:this.ntrnnActYn.hashCode());
		result= prime * result + ((this.wdrActUnitRcvDgnYn==null)?0:this.wdrActUnitRcvDgnYn.hashCode());
		result= prime * result + ((this.prdDisSmlItm==null)?0:this.prdDisSmlItm.hashCode());
		result= prime * result + ((this.psnMmfYn==null)?0:this.psnMmfYn.hashCode());
		result= prime * result + ((this.elfYn==null)?0:this.elfYn.hashCode());
		result= prime * result + ((this.actKrxcBal==null)?0:this.actKrxcBal.hashCode());
		result= prime * result + ((this.hdnActYn==null)?0:this.hdnActYn.hashCode());
		result= prime * result + ((this.pnsnPayStepDscd==null)?0:this.pnsnPayStepDscd.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final INBIBSMR0001066_GRID_DTO other= (INBIBSMR0001066_GRID_DTO)obj;
		{
			Object _newAcno= getNewAcno();
			Object __newAcno= other.getNewAcno();
			if ( _newAcno== null ) { if ( __newAcno!= null ) return false; }
			else if ( !_newAcno.equals(__newAcno) ) return false;
		}
		{
			Object _cusUsgAcno= getCusUsgAcno();
			Object __cusUsgAcno= other.getCusUsgAcno();
			if ( _cusUsgAcno== null ) { if ( __cusUsgAcno!= null ) return false; }
			else if ( !_cusUsgAcno.equals(__cusUsgAcno) ) return false;
		}
		{
			Object _pdcd= getPdcd();
			Object __pdcd= other.getPdcd();
			if ( _pdcd== null ) { if ( __pdcd!= null ) return false; }
			else if ( !_pdcd.equals(__pdcd) ) return false;
		}
		{
			Object _prdNm= getPrdNm();
			Object __prdNm= other.getPrdNm();
			if ( _prdNm== null ) { if ( __prdNm!= null ) return false; }
			else if ( !_prdNm.equals(__prdNm) ) return false;
		}
		{
			Object _cucd= getCucd();
			Object __cucd= other.getCucd();
			if ( _cucd== null ) { if ( __cucd!= null ) return false; }
			else if ( !_cucd.equals(__cucd) ) return false;
		}
		{
			Object _pbokBal= getPbokBal();
			Object __pbokBal= other.getPbokBal();
			if ( _pbokBal== null ) { if ( __pbokBal!= null ) return false; }
			else if ( !_pbokBal.equals(__pbokBal) ) return false;
		}
		{
			Object _faxcBal= getFaxcBal();
			Object __faxcBal= other.getFaxcBal();
			if ( _faxcBal== null ) { if ( __faxcBal!= null ) return false; }
			else if ( !_faxcBal.equals(__faxcBal) ) return false;
		}
		{
			Object _wdrAvlAm= getWdrAvlAm();
			Object __wdrAvlAm= other.getWdrAvlAm();
			if ( _wdrAvlAm== null ) { if ( __wdrAvlAm!= null ) return false; }
			else if ( !_wdrAvlAm.equals(__wdrAvlAm) ) return false;
		}
		{
			Object _faxcWdrAvlAm= getFaxcWdrAvlAm();
			Object __faxcWdrAvlAm= other.getFaxcWdrAvlAm();
			if ( _faxcWdrAvlAm== null ) { if ( __faxcWdrAvlAm!= null ) return false; }
			else if ( !_faxcWdrAvlAm.equals(__faxcWdrAvlAm) ) return false;
		}
		{
			Object _psklActYn= getPsklActYn();
			Object __psklActYn= other.getPsklActYn();
			if ( _psklActYn== null ) { if ( __psklActYn!= null ) return false; }
			else if ( !_psklActYn.equals(__psklActYn) ) return false;
		}
		{
			Object _lactYn= getLactYn();
			Object __lactYn= other.getLactYn();
			if ( _lactYn== null ) { if ( __lactYn!= null ) return false; }
			else if ( !_lactYn.equals(__lactYn) ) return false;
		}
		{
			Object _fxActYn= getFxActYn();
			Object __fxActYn= other.getFxActYn();
			if ( _fxActYn== null ) { if ( __fxActYn!= null ) return false; }
			else if ( !_fxActYn.equals(__fxActYn) ) return false;
		}
		{
			Object _pbokKd= getPbokKd();
			Object __pbokKd= other.getPbokKd();
			if ( _pbokKd== null ) { if ( __pbokKd!= null ) return false; }
			else if ( !_pbokKd.equals(__pbokKd) ) return false;
		}
		{
			Object _newDt= getNewDt();
			Object __newDt= other.getNewDt();
			if ( _newDt== null ) { if ( __newDt!= null ) return false; }
			else if ( !_newDt.equals(__newDt) ) return false;
		}
		{
			Object _lstTrnDt= getLstTrnDt();
			Object __lstTrnDt= other.getLstTrnDt();
			if ( _lstTrnDt== null ) { if ( __lstTrnDt!= null ) return false; }
			else if ( !_lstTrnDt.equals(__lstTrnDt) ) return false;
		}
		{
			Object _epdt= getEpdt();
			Object __epdt= other.getEpdt();
			if ( _epdt== null ) { if ( __epdt!= null ) return false; }
			else if ( !_epdt.equals(__epdt) ) return false;
		}
		{
			Object _adntRgsYn= getAdntRgsYn();
			Object __adntRgsYn= other.getAdntRgsYn();
			if ( _adntRgsYn== null ) { if ( __adntRgsYn!= null ) return false; }
			else if ( !_adntRgsYn.equals(__adntRgsYn) ) return false;
		}
		{
			Object _crtdIsuActYn= getCrtdIsuActYn();
			Object __crtdIsuActYn= other.getCrtdIsuActYn();
			if ( _crtdIsuActYn== null ) { if ( __crtdIsuActYn!= null ) return false; }
			else if ( !_crtdIsuActYn.equals(__crtdIsuActYn) ) return false;
		}
		{
			Object _wdrActYn= getWdrActYn();
			Object __wdrActYn= other.getWdrActYn();
			if ( _wdrActYn== null ) { if ( __wdrActYn!= null ) return false; }
			else if ( !_wdrActYn.equals(__wdrActYn) ) return false;
		}
		{
			Object _csno= getCsno();
			Object __csno= other.getCsno();
			if ( _csno== null ) { if ( __csno!= null ) return false; }
			else if ( !_csno.equals(__csno) ) return false;
		}
		{
			Object _ntrnnActYn= getNtrnnActYn();
			Object __ntrnnActYn= other.getNtrnnActYn();
			if ( _ntrnnActYn== null ) { if ( __ntrnnActYn!= null ) return false; }
			else if ( !_ntrnnActYn.equals(__ntrnnActYn) ) return false;
		}
		{
			Object _wdrActUnitRcvDgnYn= getWdrActUnitRcvDgnYn();
			Object __wdrActUnitRcvDgnYn= other.getWdrActUnitRcvDgnYn();
			if ( _wdrActUnitRcvDgnYn== null ) { if ( __wdrActUnitRcvDgnYn!= null ) return false; }
			else if ( !_wdrActUnitRcvDgnYn.equals(__wdrActUnitRcvDgnYn) ) return false;
		}
		{
			Object _prdDisSmlItm= getPrdDisSmlItm();
			Object __prdDisSmlItm= other.getPrdDisSmlItm();
			if ( _prdDisSmlItm== null ) { if ( __prdDisSmlItm!= null ) return false; }
			else if ( !_prdDisSmlItm.equals(__prdDisSmlItm) ) return false;
		}
		{
			Object _psnMmfYn= getPsnMmfYn();
			Object __psnMmfYn= other.getPsnMmfYn();
			if ( _psnMmfYn== null ) { if ( __psnMmfYn!= null ) return false; }
			else if ( !_psnMmfYn.equals(__psnMmfYn) ) return false;
		}
		{
			Object _elfYn= getElfYn();
			Object __elfYn= other.getElfYn();
			if ( _elfYn== null ) { if ( __elfYn!= null ) return false; }
			else if ( !_elfYn.equals(__elfYn) ) return false;
		}
		{
			Object _actKrxcBal= getActKrxcBal();
			Object __actKrxcBal= other.getActKrxcBal();
			if ( _actKrxcBal== null ) { if ( __actKrxcBal!= null ) return false; }
			else if ( !_actKrxcBal.equals(__actKrxcBal) ) return false;
		}
		{
			Object _hdnActYn= getHdnActYn();
			Object __hdnActYn= other.getHdnActYn();
			if ( _hdnActYn== null ) { if ( __hdnActYn!= null ) return false; }
			else if ( !_hdnActYn.equals(__hdnActYn) ) return false;
		}
		{
			Object _pnsnPayStepDscd= getPnsnPayStepDscd();
			Object __pnsnPayStepDscd= other.getPnsnPayStepDscd();
			if ( _pnsnPayStepDscd== null ) { if ( __pnsnPayStepDscd!= null ) return false; }
			else if ( !_pnsnPayStepDscd.equals(__pnsnPayStepDscd) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(INBIBSMR0001066_GRID_DTO.class.getName()).append(":\n");
		sb.append("\tnewAcno: ");
		sb.append(newAcno==null?"null":getNewAcno());
		sb.append("\n");
		sb.append("\tcusUsgAcno: ");
		sb.append(cusUsgAcno==null?"null":getCusUsgAcno());
		sb.append("\n");
		sb.append("\tpdcd: ");
		sb.append(pdcd==null?"null":getPdcd());
		sb.append("\n");
		sb.append("\tprdNm: ");
		sb.append(prdNm==null?"null":getPrdNm());
		sb.append("\n");
		sb.append("\tcucd: ");
		sb.append(cucd==null?"null":getCucd());
		sb.append("\n");
		sb.append("\tpbokBal: ");
		sb.append(pbokBal==null?"null":getPbokBal());
		sb.append("\n");
		sb.append("\tfaxcBal: ");
		sb.append(faxcBal==null?"null":getFaxcBal());
		sb.append("\n");
		sb.append("\twdrAvlAm: ");
		sb.append(wdrAvlAm==null?"null":getWdrAvlAm());
		sb.append("\n");
		sb.append("\tfaxcWdrAvlAm: ");
		sb.append(faxcWdrAvlAm==null?"null":getFaxcWdrAvlAm());
		sb.append("\n");
		sb.append("\tpsklActYn: ");
		sb.append(psklActYn==null?"null":getPsklActYn());
		sb.append("\n");
		sb.append("\tlactYn: ");
		sb.append(lactYn==null?"null":getLactYn());
		sb.append("\n");
		sb.append("\tfxActYn: ");
		sb.append(fxActYn==null?"null":getFxActYn());
		sb.append("\n");
		sb.append("\tpbokKd: ");
		sb.append(pbokKd==null?"null":getPbokKd());
		sb.append("\n");
		sb.append("\tnewDt: ");
		sb.append(newDt==null?"null":getNewDt());
		sb.append("\n");
		sb.append("\tlstTrnDt: ");
		sb.append(lstTrnDt==null?"null":getLstTrnDt());
		sb.append("\n");
		sb.append("\tepdt: ");
		sb.append(epdt==null?"null":getEpdt());
		sb.append("\n");
		sb.append("\tadntRgsYn: ");
		sb.append(adntRgsYn==null?"null":getAdntRgsYn());
		sb.append("\n");
		sb.append("\tcrtdIsuActYn: ");
		sb.append(crtdIsuActYn==null?"null":getCrtdIsuActYn());
		sb.append("\n");
		sb.append("\twdrActYn: ");
		sb.append(wdrActYn==null?"null":getWdrActYn());
		sb.append("\n");
		sb.append("\tcsno: ");
		sb.append(csno==null?"null":getCsno());
		sb.append("\n");
		sb.append("\tntrnnActYn: ");
		sb.append(ntrnnActYn==null?"null":getNtrnnActYn());
		sb.append("\n");
		sb.append("\twdrActUnitRcvDgnYn: ");
		sb.append(wdrActUnitRcvDgnYn==null?"null":getWdrActUnitRcvDgnYn());
		sb.append("\n");
		sb.append("\tprdDisSmlItm: ");
		sb.append(prdDisSmlItm==null?"null":getPrdDisSmlItm());
		sb.append("\n");
		sb.append("\tpsnMmfYn: ");
		sb.append(psnMmfYn==null?"null":getPsnMmfYn());
		sb.append("\n");
		sb.append("\telfYn: ");
		sb.append(elfYn==null?"null":getElfYn());
		sb.append("\n");
		sb.append("\tactKrxcBal: ");
		sb.append(actKrxcBal==null?"null":getActKrxcBal());
		sb.append("\n");
		sb.append("\thdnActYn: ");
		sb.append(hdnActYn==null?"null":getHdnActYn());
		sb.append("\n");
		sb.append("\tpnsnPayStepDscd: ");
		sb.append(pnsnPayStepDscd==null?"null":getPnsnPayStepDscd());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 15; /* newAcno */
		messageLen+= 15; /* cusUsgAcno */
		messageLen+= 13; /* pdcd */
		messageLen+= 100; /* prdNm */
		messageLen+= 3; /* cucd */
		messageLen+= 19; /* pbokBal */
		messageLen+= 19; /* faxcBal */
		messageLen+= 19; /* wdrAvlAm */
		messageLen+= 19; /* faxcWdrAvlAm */
		messageLen+= 1; /* psklActYn */
		messageLen+= 1; /* lactYn */
		messageLen+= 1; /* fxActYn */
		messageLen+= 4; /* pbokKd */
		messageLen+= 8; /* newDt */
		messageLen+= 8; /* lstTrnDt */
		messageLen+= 8; /* epdt */
		messageLen+= 1; /* adntRgsYn */
		messageLen+= 1; /* crtdIsuActYn */
		messageLen+= 1; /* wdrActYn */
		messageLen+= 9; /* csno */
		messageLen+= 1; /* ntrnnActYn */
		messageLen+= 1; /* wdrActUnitRcvDgnYn */
		messageLen+= 1; /* prdDisSmlItm */
		messageLen+= 1; /* psnMmfYn */
		messageLen+= 1; /* elfYn */
		messageLen+= 19; /* actKrxcBal */
		messageLen+= 1; /* hdnActYn */
		messageLen+= 1; /* pnsnPayStepDscd */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("newAcno");
		list.add("cusUsgAcno");
		list.add("pdcd");
		list.add("prdNm");
		list.add("cucd");
		list.add("pbokBal");
		list.add("faxcBal");
		list.add("wdrAvlAm");
		list.add("faxcWdrAvlAm");
		list.add("psklActYn");
		list.add("lactYn");
		list.add("fxActYn");
		list.add("pbokKd");
		list.add("newDt");
		list.add("lstTrnDt");
		list.add("epdt");
		list.add("adntRgsYn");
		list.add("crtdIsuActYn");
		list.add("wdrActYn");
		list.add("csno");
		list.add("ntrnnActYn");
		list.add("wdrActUnitRcvDgnYn");
		list.add("prdDisSmlItm");
		list.add("psnMmfYn");
		list.add("elfYn");
		list.add("actKrxcBal");
		list.add("hdnActYn");
		list.add("pnsnPayStepDscd");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("newAcno", get("newAcno"));
		map.put("cusUsgAcno", get("cusUsgAcno"));
		map.put("pdcd", get("pdcd"));
		map.put("prdNm", get("prdNm"));
		map.put("cucd", get("cucd"));
		map.put("pbokBal", get("pbokBal"));
		map.put("faxcBal", get("faxcBal"));
		map.put("wdrAvlAm", get("wdrAvlAm"));
		map.put("faxcWdrAvlAm", get("faxcWdrAvlAm"));
		map.put("psklActYn", get("psklActYn"));
		map.put("lactYn", get("lactYn"));
		map.put("fxActYn", get("fxActYn"));
		map.put("pbokKd", get("pbokKd"));
		map.put("newDt", get("newDt"));
		map.put("lstTrnDt", get("lstTrnDt"));
		map.put("epdt", get("epdt"));
		map.put("adntRgsYn", get("adntRgsYn"));
		map.put("crtdIsuActYn", get("crtdIsuActYn"));
		map.put("wdrActYn", get("wdrActYn"));
		map.put("csno", get("csno"));
		map.put("ntrnnActYn", get("ntrnnActYn"));
		map.put("wdrActUnitRcvDgnYn", get("wdrActUnitRcvDgnYn"));
		map.put("prdDisSmlItm", get("prdDisSmlItm"));
		map.put("psnMmfYn", get("psnMmfYn"));
		map.put("elfYn", get("elfYn"));
		map.put("actKrxcBal", get("actKrxcBal"));
		map.put("hdnActYn", get("hdnActYn"));
		map.put("pnsnPayStepDscd", get("pnsnPayStepDscd"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 1844635427:/* newAcno */
			return getNewAcno();
		case 1078862091:/* cusUsgAcno */
			return getCusUsgAcno();
		case 3435861:/* pdcd */
			return getPdcd();
		case 106929153:/* prdNm */
			return getPrdNm();
		case 3064915:/* cucd */
			return getCucd();
		case -767381025:/* pbokBal */
			return getPbokBal();
		case -1073039033:/* faxcBal */
			return getFaxcBal();
		case -1175539426:/* wdrAvlAm */
			return getWdrAvlAm();
		case 303867940:/* faxcWdrAvlAm */
			return getFaxcWdrAvlAm();
		case 1616942851:/* psklActYn */
			return getPsklActYn();
		case -1110373797:/* lactYn */
			return getLactYn();
		case -465314411:/* fxActYn */
			return getFxActYn();
		case -994585273:/* pbokKd */
			return getPbokKd();
		case 104712784:/* newDt */
			return getNewDt();
		case 1630724755:/* lstTrnDt */
			return getLstTrnDt();
		case 3119739:/* epdt */
			return getEpdt();
		case 1198999786:/* adntRgsYn */
			return getAdntRgsYn();
		case 295259579:/* crtdIsuActYn */
			return getCrtdIsuActYn();
		case -1176097022:/* wdrActYn */
			return getWdrActYn();
		case 3063345:/* csno */
			return getCsno();
		case -482597765:/* ntrnnActYn */
			return getNtrnnActYn();
		case 63949996:/* wdrActUnitRcvDgnYn */
			return getWdrActUnitRcvDgnYn();
		case 1829378972:/* prdDisSmlItm */
			return getPrdDisSmlItm();
		case -166364048:/* psnMmfYn */
			return getPsnMmfYn();
		case 96593940:/* elfYn */
			return getElfYn();
		case 1092090665:/* actKrxcBal */
			return getActKrxcBal();
		case -1662964875:/* hdnActYn */
			return getHdnActYn();
		case 1427706955:/* pnsnPayStepDscd */
			return getPnsnPayStepDscd();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 1844635427:/* newAcno */
			setNewAcno((String)value);
			break;
		case 1078862091:/* cusUsgAcno */
			setCusUsgAcno((String)value);
			break;
		case 3435861:/* pdcd */
			setPdcd((String)value);
			break;
		case 106929153:/* prdNm */
			setPrdNm((String)value);
			break;
		case 3064915:/* cucd */
			setCucd((String)value);
			break;
		case -767381025:/* pbokBal */
			if ( value instanceof String ){
				setPbokBal((String)value);
			}
			else if ( value instanceof Double ){
				setPbokBal((Double)value);
			}
			else if ( value instanceof Long ){
				setPbokBal((Long)value);
			}
			else{
				setPbokBal((BigDecimal)value);
			}
			break;
		case -1073039033:/* faxcBal */
			if ( value instanceof String ){
				setFaxcBal((String)value);
			}
			else if ( value instanceof Double ){
				setFaxcBal((Double)value);
			}
			else if ( value instanceof Long ){
				setFaxcBal((Long)value);
			}
			else{
				setFaxcBal((BigDecimal)value);
			}
			break;
		case -1175539426:/* wdrAvlAm */
			if ( value instanceof String ){
				setWdrAvlAm((String)value);
			}
			else if ( value instanceof Double ){
				setWdrAvlAm((Double)value);
			}
			else if ( value instanceof Long ){
				setWdrAvlAm((Long)value);
			}
			else{
				setWdrAvlAm((BigDecimal)value);
			}
			break;
		case 303867940:/* faxcWdrAvlAm */
			if ( value instanceof String ){
				setFaxcWdrAvlAm((String)value);
			}
			else if ( value instanceof Double ){
				setFaxcWdrAvlAm((Double)value);
			}
			else if ( value instanceof Long ){
				setFaxcWdrAvlAm((Long)value);
			}
			else{
				setFaxcWdrAvlAm((BigDecimal)value);
			}
			break;
		case 1616942851:/* psklActYn */
			setPsklActYn((String)value);
			break;
		case -1110373797:/* lactYn */
			setLactYn((String)value);
			break;
		case -465314411:/* fxActYn */
			setFxActYn((String)value);
			break;
		case -994585273:/* pbokKd */
			setPbokKd((String)value);
			break;
		case 104712784:/* newDt */
			setNewDt((String)value);
			break;
		case 1630724755:/* lstTrnDt */
			setLstTrnDt((String)value);
			break;
		case 3119739:/* epdt */
			setEpdt((String)value);
			break;
		case 1198999786:/* adntRgsYn */
			setAdntRgsYn((String)value);
			break;
		case 295259579:/* crtdIsuActYn */
			setCrtdIsuActYn((String)value);
			break;
		case -1176097022:/* wdrActYn */
			setWdrActYn((String)value);
			break;
		case 3063345:/* csno */
			setCsno((String)value);
			break;
		case -482597765:/* ntrnnActYn */
			setNtrnnActYn((String)value);
			break;
		case 63949996:/* wdrActUnitRcvDgnYn */
			setWdrActUnitRcvDgnYn((String)value);
			break;
		case 1829378972:/* prdDisSmlItm */
			setPrdDisSmlItm((String)value);
			break;
		case -166364048:/* psnMmfYn */
			setPsnMmfYn((String)value);
			break;
		case 96593940:/* elfYn */
			setElfYn((String)value);
			break;
		case 1092090665:/* actKrxcBal */
			if ( value instanceof String ){
				setActKrxcBal((String)value);
			}
			else if ( value instanceof Double ){
				setActKrxcBal((Double)value);
			}
			else if ( value instanceof Long ){
				setActKrxcBal((Long)value);
			}
			else{
				setActKrxcBal((BigDecimal)value);
			}
			break;
		case -1662964875:/* hdnActYn */
			setHdnActYn((String)value);
			break;
		case 1427706955:/* pnsnPayStepDscd */
			setPnsnPayStepDscd((String)value);
			break;
		default:
			break;
		}
	}
	
}
