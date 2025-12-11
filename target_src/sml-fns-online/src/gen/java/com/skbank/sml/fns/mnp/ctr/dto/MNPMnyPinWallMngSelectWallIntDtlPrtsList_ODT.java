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
	"trnDt", "trnSrno", "intCalStaDt", "intCalEndDt", "trnBasAm", "totPayIntAm", "intIctx", "intIcmRdtx", "intIcmSrtx", "hcanFee", "rrintAm", "rstrIctx", "rstrRdtx", "rstrSrtx", "prmeYn"
}, name="MNPMnyPinWallMngSelectWallIntDtlPrtsList_ODT")
@XmlRootElement(name="MNPMnyPinWallMngSelectWallIntDtlPrtsList_ODT")
@BxmCategory(logicalName="머니클립지갑이자내역상세조회.출력IO", description="") 
public class MNPMnyPinWallMngSelectWallIntDtlPrtsList_ODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 603041005L;
	
	
	
	/**
	 * 거래일자
	 */
	@ApiModelProperty(
		name = "trnDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("trnDt")
	@BxmOmm_Field(length=8, decimal=0, description="거래일자", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=C","EIMS_DATA_TYPE=S"})
	private String trnDt= "";
	
	
	/**
	 * 거래일련번호
	 */
	@ApiModelProperty(
		name = "trnSrno"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("trnSrno")
	@BxmOmm_Field(length=8, decimal=0, description="거래일련번호", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=C","EIMS_DATA_TYPE=N"})
	private Integer trnSrno= 0;
	
	
	/**
	 * 이자계산시작일자
	 */
	@ApiModelProperty(
		name = "intCalStaDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("intCalStaDt")
	@BxmOmm_Field(length=8, decimal=0, description="이자계산시작일자", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=C","EIMS_DATA_TYPE=S"})
	private String intCalStaDt= "";
	
	
	/**
	 * 이자계산종료일자
	 */
	@ApiModelProperty(
		name = "intCalEndDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("intCalEndDt")
	@BxmOmm_Field(length=8, decimal=0, description="이자계산종료일자", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=C","EIMS_DATA_TYPE=S"})
	private String intCalEndDt= "";
	
	
	/**
	 * 거래기준금액
	 */
	@ApiModelProperty(
		name = "trnBasAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("trnBasAm")
	@BxmOmm_Field(length=19, decimal=3, description="거래기준금액", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=C","EIMS_DATA_TYPE=D"})
	private BigDecimal trnBasAm= new BigDecimal("0");
	
	
	/**
	 * 총지급이자금액
	 */
	@ApiModelProperty(
		name = "totPayIntAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("totPayIntAm")
	@BxmOmm_Field(length=19, decimal=3, description="총지급이자금액", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=C","EIMS_DATA_TYPE=D"})
	private BigDecimal totPayIntAm= new BigDecimal("0");
	
	
	/**
	 * 이자소득세
	 */
	@ApiModelProperty(
		name = "intIctx"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("intIctx")
	@BxmOmm_Field(length=19, decimal=3, description="이자소득세", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=C","EIMS_DATA_TYPE=D"})
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
	@BxmOmm_Field(length=19, decimal=3, description="이자소득주민세", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=C","EIMS_DATA_TYPE=D"})
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
	@BxmOmm_Field(length=19, decimal=3, description="이자소득농특세", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=C","EIMS_DATA_TYPE=D"})
	private BigDecimal intIcmSrtx= new BigDecimal("0");
	
	
	/**
	 * 중도해지수수료
	 */
	@ApiModelProperty(
		name = "hcanFee"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("hcanFee")
	@BxmOmm_Field(length=19, decimal=3, description="중도해지수수료", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=C","EIMS_DATA_TYPE=D"})
	private BigDecimal hcanFee= new BigDecimal("0");
	
	
	/**
	 * 환입이자금액
	 */
	@ApiModelProperty(
		name = "rrintAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("rrintAm")
	@BxmOmm_Field(length=19, decimal=3, description="환입이자금액", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=C","EIMS_DATA_TYPE=D"})
	private BigDecimal rrintAm= new BigDecimal("0");
	
	
	/**
	 * 환출소득세
	 */
	@ApiModelProperty(
		name = "rstrIctx"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("rstrIctx")
	@BxmOmm_Field(length=19, decimal=3, description="환출소득세", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=C","EIMS_DATA_TYPE=D"})
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
	@BxmOmm_Field(length=19, decimal=3, description="환출주민세", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=C","EIMS_DATA_TYPE=D"})
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
	@BxmOmm_Field(length=19, decimal=3, description="환출농특세", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=C","EIMS_DATA_TYPE=D"})
	private BigDecimal rstrSrtx= new BigDecimal("0");
	
	
	/**
	 * 우대여부
	 */
	@ApiModelProperty(
		name = "prmeYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("prmeYn")
	@BxmOmm_Field(length=1, decimal=0, description="우대여부", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=C","EIMS_DATA_TYPE=S"})
	private String prmeYn= "";
	
	
	
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
	private boolean isSet_intCalStaDt= false;
	protected final boolean isSet_intCalStaDt(){
		return this.isSet_intCalStaDt;
	}
	private void setIsSet_intCalStaDt(boolean value){
		this.isSet_intCalStaDt= value;
	}
	/**
	 * 이자계산시작일자
	 */
	@XmlTransient
	public String getIntCalStaDt(){
		return this.intCalStaDt;
	}
	
	/**
	 * 이자계산시작일자
	 * 
	 * @param intCalStaDt 이자계산시작일자
	 */
	public void setIntCalStaDt(String intCalStaDt){
		this.intCalStaDt= intCalStaDt;
		this.setIsSet_intCalStaDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_intCalEndDt= false;
	protected final boolean isSet_intCalEndDt(){
		return this.isSet_intCalEndDt;
	}
	private void setIsSet_intCalEndDt(boolean value){
		this.isSet_intCalEndDt= value;
	}
	/**
	 * 이자계산종료일자
	 */
	@XmlTransient
	public String getIntCalEndDt(){
		return this.intCalEndDt;
	}
	
	/**
	 * 이자계산종료일자
	 * 
	 * @param intCalEndDt 이자계산종료일자
	 */
	public void setIntCalEndDt(String intCalEndDt){
		this.intCalEndDt= intCalEndDt;
		this.setIsSet_intCalEndDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_trnBasAm= false;
	protected final boolean isSet_trnBasAm(){
		return this.isSet_trnBasAm;
	}
	private void setIsSet_trnBasAm(boolean value){
		this.isSet_trnBasAm= value;
	}
	/**
	 * 거래기준금액
	 * BigDecimal - Double value setter
	 *
	 * @Param trnBasAm 거래기준금액
	 */
	public void setTrnBasAm(double trnBasAm) {
		setTrnBasAm(BigDecimal.valueOf(trnBasAm));
	}
	/**
	 * 거래기준금액
	 * BigDecimal - Long value setter
	 *
	 * @Param trnBasAm 거래기준금액
	 */
	public void setTrnBasAm(long trnBasAm) {
		setTrnBasAm(BigDecimal.valueOf(trnBasAm));
	}
	/**
	 * 거래기준금액
	 * BigDecimal - String value setter
	 *
	 * @Param trnBasAm 거래기준금액
	 */
	public void setTrnBasAm(String trnBasAm) {
		setTrnBasAm(new BigDecimal(trnBasAm));
	}
	/**
	 * 거래기준금액
	 */
	@XmlTransient
	public BigDecimal getTrnBasAm(){
		return this.trnBasAm;
	}
	
	/**
	 * 거래기준금액
	 * 
	 * @param trnBasAm 거래기준금액
	 */
	@JsonSetter("trnBasAm")
	public void setTrnBasAm(BigDecimal trnBasAm){
		this.trnBasAm= trnBasAm;
		this.setIsSet_trnBasAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_totPayIntAm= false;
	protected final boolean isSet_totPayIntAm(){
		return this.isSet_totPayIntAm;
	}
	private void setIsSet_totPayIntAm(boolean value){
		this.isSet_totPayIntAm= value;
	}
	/**
	 * 총지급이자금액
	 * BigDecimal - Double value setter
	 *
	 * @Param totPayIntAm 총지급이자금액
	 */
	public void setTotPayIntAm(double totPayIntAm) {
		setTotPayIntAm(BigDecimal.valueOf(totPayIntAm));
	}
	/**
	 * 총지급이자금액
	 * BigDecimal - Long value setter
	 *
	 * @Param totPayIntAm 총지급이자금액
	 */
	public void setTotPayIntAm(long totPayIntAm) {
		setTotPayIntAm(BigDecimal.valueOf(totPayIntAm));
	}
	/**
	 * 총지급이자금액
	 * BigDecimal - String value setter
	 *
	 * @Param totPayIntAm 총지급이자금액
	 */
	public void setTotPayIntAm(String totPayIntAm) {
		setTotPayIntAm(new BigDecimal(totPayIntAm));
	}
	/**
	 * 총지급이자금액
	 */
	@XmlTransient
	public BigDecimal getTotPayIntAm(){
		return this.totPayIntAm;
	}
	
	/**
	 * 총지급이자금액
	 * 
	 * @param totPayIntAm 총지급이자금액
	 */
	@JsonSetter("totPayIntAm")
	public void setTotPayIntAm(BigDecimal totPayIntAm){
		this.totPayIntAm= totPayIntAm;
		this.setIsSet_totPayIntAm(true);
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
	private boolean isSet_rrintAm= false;
	protected final boolean isSet_rrintAm(){
		return this.isSet_rrintAm;
	}
	private void setIsSet_rrintAm(boolean value){
		this.isSet_rrintAm= value;
	}
	/**
	 * 환입이자금액
	 * BigDecimal - Double value setter
	 *
	 * @Param rrintAm 환입이자금액
	 */
	public void setRrintAm(double rrintAm) {
		setRrintAm(BigDecimal.valueOf(rrintAm));
	}
	/**
	 * 환입이자금액
	 * BigDecimal - Long value setter
	 *
	 * @Param rrintAm 환입이자금액
	 */
	public void setRrintAm(long rrintAm) {
		setRrintAm(BigDecimal.valueOf(rrintAm));
	}
	/**
	 * 환입이자금액
	 * BigDecimal - String value setter
	 *
	 * @Param rrintAm 환입이자금액
	 */
	public void setRrintAm(String rrintAm) {
		setRrintAm(new BigDecimal(rrintAm));
	}
	/**
	 * 환입이자금액
	 */
	@XmlTransient
	public BigDecimal getRrintAm(){
		return this.rrintAm;
	}
	
	/**
	 * 환입이자금액
	 * 
	 * @param rrintAm 환입이자금액
	 */
	@JsonSetter("rrintAm")
	public void setRrintAm(BigDecimal rrintAm){
		this.rrintAm= rrintAm;
		this.setIsSet_rrintAm(true);
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
	private boolean isSet_prmeYn= false;
	protected final boolean isSet_prmeYn(){
		return this.isSet_prmeYn;
	}
	private void setIsSet_prmeYn(boolean value){
		this.isSet_prmeYn= value;
	}
	/**
	 * 우대여부
	 */
	@XmlTransient
	public String getPrmeYn(){
		return this.prmeYn;
	}
	
	/**
	 * 우대여부
	 * 
	 * @param prmeYn 우대여부
	 */
	public void setPrmeYn(String prmeYn){
		this.prmeYn= prmeYn;
		this.setIsSet_prmeYn(true);
	}
				
	@Override
	public MNPMnyPinWallMngSelectWallIntDtlPrtsList_ODT clone(){
		try{
			MNPMnyPinWallMngSelectWallIntDtlPrtsList_ODT object= (MNPMnyPinWallMngSelectWallIntDtlPrtsList_ODT)super.clone();
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
		
		result= prime * result + ((this.trnDt==null)?0:this.trnDt.hashCode());
		result= prime * result + ((this.trnSrno==null)?0:this.trnSrno.hashCode());
		result= prime * result + ((this.intCalStaDt==null)?0:this.intCalStaDt.hashCode());
		result= prime * result + ((this.intCalEndDt==null)?0:this.intCalEndDt.hashCode());
		result= prime * result + ((this.trnBasAm==null)?0:this.trnBasAm.hashCode());
		result= prime * result + ((this.totPayIntAm==null)?0:this.totPayIntAm.hashCode());
		result= prime * result + ((this.intIctx==null)?0:this.intIctx.hashCode());
		result= prime * result + ((this.intIcmRdtx==null)?0:this.intIcmRdtx.hashCode());
		result= prime * result + ((this.intIcmSrtx==null)?0:this.intIcmSrtx.hashCode());
		result= prime * result + ((this.hcanFee==null)?0:this.hcanFee.hashCode());
		result= prime * result + ((this.rrintAm==null)?0:this.rrintAm.hashCode());
		result= prime * result + ((this.rstrIctx==null)?0:this.rstrIctx.hashCode());
		result= prime * result + ((this.rstrRdtx==null)?0:this.rstrRdtx.hashCode());
		result= prime * result + ((this.rstrSrtx==null)?0:this.rstrSrtx.hashCode());
		result= prime * result + ((this.prmeYn==null)?0:this.prmeYn.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MNPMnyPinWallMngSelectWallIntDtlPrtsList_ODT other= (MNPMnyPinWallMngSelectWallIntDtlPrtsList_ODT)obj;
		{
			Object _trnDt= getTrnDt();
			Object __trnDt= other.getTrnDt();
			if ( _trnDt== null ) { if ( __trnDt!= null ) return false; }
			else if ( !_trnDt.equals(__trnDt) ) return false;
		}
		{
			Object _trnSrno= getTrnSrno();
			Object __trnSrno= other.getTrnSrno();
			if ( _trnSrno== null ) { if ( __trnSrno!= null ) return false; }
			else if ( !_trnSrno.equals(__trnSrno) ) return false;
		}
		{
			Object _intCalStaDt= getIntCalStaDt();
			Object __intCalStaDt= other.getIntCalStaDt();
			if ( _intCalStaDt== null ) { if ( __intCalStaDt!= null ) return false; }
			else if ( !_intCalStaDt.equals(__intCalStaDt) ) return false;
		}
		{
			Object _intCalEndDt= getIntCalEndDt();
			Object __intCalEndDt= other.getIntCalEndDt();
			if ( _intCalEndDt== null ) { if ( __intCalEndDt!= null ) return false; }
			else if ( !_intCalEndDt.equals(__intCalEndDt) ) return false;
		}
		{
			Object _trnBasAm= getTrnBasAm();
			Object __trnBasAm= other.getTrnBasAm();
			if ( _trnBasAm== null ) { if ( __trnBasAm!= null ) return false; }
			else if ( !_trnBasAm.equals(__trnBasAm) ) return false;
		}
		{
			Object _totPayIntAm= getTotPayIntAm();
			Object __totPayIntAm= other.getTotPayIntAm();
			if ( _totPayIntAm== null ) { if ( __totPayIntAm!= null ) return false; }
			else if ( !_totPayIntAm.equals(__totPayIntAm) ) return false;
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
			Object _hcanFee= getHcanFee();
			Object __hcanFee= other.getHcanFee();
			if ( _hcanFee== null ) { if ( __hcanFee!= null ) return false; }
			else if ( !_hcanFee.equals(__hcanFee) ) return false;
		}
		{
			Object _rrintAm= getRrintAm();
			Object __rrintAm= other.getRrintAm();
			if ( _rrintAm== null ) { if ( __rrintAm!= null ) return false; }
			else if ( !_rrintAm.equals(__rrintAm) ) return false;
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
			Object _prmeYn= getPrmeYn();
			Object __prmeYn= other.getPrmeYn();
			if ( _prmeYn== null ) { if ( __prmeYn!= null ) return false; }
			else if ( !_prmeYn.equals(__prmeYn) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MNPMnyPinWallMngSelectWallIntDtlPrtsList_ODT.class.getName()).append(":\n");
		sb.append("\ttrnDt: ");
		sb.append(trnDt==null?"null":getTrnDt());
		sb.append("\n");
		sb.append("\ttrnSrno: ");
		sb.append(trnSrno==null?"null":getTrnSrno());
		sb.append("\n");
		sb.append("\tintCalStaDt: ");
		sb.append(intCalStaDt==null?"null":getIntCalStaDt());
		sb.append("\n");
		sb.append("\tintCalEndDt: ");
		sb.append(intCalEndDt==null?"null":getIntCalEndDt());
		sb.append("\n");
		sb.append("\ttrnBasAm: ");
		sb.append(trnBasAm==null?"null":getTrnBasAm());
		sb.append("\n");
		sb.append("\ttotPayIntAm: ");
		sb.append(totPayIntAm==null?"null":getTotPayIntAm());
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
		sb.append("\thcanFee: ");
		sb.append(hcanFee==null?"null":getHcanFee());
		sb.append("\n");
		sb.append("\trrintAm: ");
		sb.append(rrintAm==null?"null":getRrintAm());
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
		sb.append("\tprmeYn: ");
		sb.append(prmeYn==null?"null":getPrmeYn());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 8; /* trnDt */
		messageLen+= 8; /* trnSrno */
		messageLen+= 8; /* intCalStaDt */
		messageLen+= 8; /* intCalEndDt */
		messageLen+= 19; /* trnBasAm */
		messageLen+= 19; /* totPayIntAm */
		messageLen+= 19; /* intIctx */
		messageLen+= 19; /* intIcmRdtx */
		messageLen+= 19; /* intIcmSrtx */
		messageLen+= 19; /* hcanFee */
		messageLen+= 19; /* rrintAm */
		messageLen+= 19; /* rstrIctx */
		messageLen+= 19; /* rstrRdtx */
		messageLen+= 19; /* rstrSrtx */
		messageLen+= 1; /* prmeYn */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("trnDt");
		list.add("trnSrno");
		list.add("intCalStaDt");
		list.add("intCalEndDt");
		list.add("trnBasAm");
		list.add("totPayIntAm");
		list.add("intIctx");
		list.add("intIcmRdtx");
		list.add("intIcmSrtx");
		list.add("hcanFee");
		list.add("rrintAm");
		list.add("rstrIctx");
		list.add("rstrRdtx");
		list.add("rstrSrtx");
		list.add("prmeYn");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("trnDt", get("trnDt"));
		map.put("trnSrno", get("trnSrno"));
		map.put("intCalStaDt", get("intCalStaDt"));
		map.put("intCalEndDt", get("intCalEndDt"));
		map.put("trnBasAm", get("trnBasAm"));
		map.put("totPayIntAm", get("totPayIntAm"));
		map.put("intIctx", get("intIctx"));
		map.put("intIcmRdtx", get("intIcmRdtx"));
		map.put("intIcmSrtx", get("intIcmSrtx"));
		map.put("hcanFee", get("hcanFee"));
		map.put("rrintAm", get("rrintAm"));
		map.put("rstrIctx", get("rstrIctx"));
		map.put("rstrRdtx", get("rstrRdtx"));
		map.put("rstrSrtx", get("rstrSrtx"));
		map.put("prmeYn", get("prmeYn"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 110632544:/* trnDt */
			return getTrnDt();
		case -1055859152:/* trnSrno */
			return getTrnSrno();
		case 815570097:/* intCalStaDt */
			return getIntCalStaDt();
		case 802464940:/* intCalEndDt */
			return getIntCalEndDt();
		case 1611901840:/* trnBasAm */
			return getTrnBasAm();
		case -423058132:/* totPayIntAm */
			return getTotPayIntAm();
		case 1957214637:/* intIctx */
			return getIntIctx();
		case -1102256518:/* intIcmRdtx */
			return getIntIcmRdtx();
		case -1102213273:/* intIcmSrtx */
			return getIntIcmSrtx();
		case 738317310:/* hcanFee */
			return getHcanFee();
		case 1460288059:/* rrintAm */
			return getRrintAm();
		case -770840003:/* rstrIctx */
			return getRstrIctx();
		case -770570923:/* rstrRdtx */
			return getRstrRdtx();
		case -770527678:/* rstrSrtx */
			return getRstrSrtx();
		case -979873841:/* prmeYn */
			return getPrmeYn();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 110632544:/* trnDt */
			setTrnDt((String)value);
			break;
		case -1055859152:/* trnSrno */
			setTrnSrno((Integer)value);
			break;
		case 815570097:/* intCalStaDt */
			setIntCalStaDt((String)value);
			break;
		case 802464940:/* intCalEndDt */
			setIntCalEndDt((String)value);
			break;
		case 1611901840:/* trnBasAm */
			if ( value instanceof String ){
				setTrnBasAm((String)value);
			}
			else if ( value instanceof Double ){
				setTrnBasAm((Double)value);
			}
			else if ( value instanceof Long ){
				setTrnBasAm((Long)value);
			}
			else{
				setTrnBasAm((BigDecimal)value);
			}
			break;
		case -423058132:/* totPayIntAm */
			if ( value instanceof String ){
				setTotPayIntAm((String)value);
			}
			else if ( value instanceof Double ){
				setTotPayIntAm((Double)value);
			}
			else if ( value instanceof Long ){
				setTotPayIntAm((Long)value);
			}
			else{
				setTotPayIntAm((BigDecimal)value);
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
		case 1460288059:/* rrintAm */
			if ( value instanceof String ){
				setRrintAm((String)value);
			}
			else if ( value instanceof Double ){
				setRrintAm((Double)value);
			}
			else if ( value instanceof Long ){
				setRrintAm((Long)value);
			}
			else{
				setRrintAm((BigDecimal)value);
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
		case -979873841:/* prmeYn */
			setPrmeYn((String)value);
			break;
		default:
			break;
		}
	}
	
}
