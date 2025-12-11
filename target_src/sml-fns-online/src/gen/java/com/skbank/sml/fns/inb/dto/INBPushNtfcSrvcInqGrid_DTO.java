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
import option.WooriOmmOption;

/**
 * PUSH알림서비스조회GRID(01249)
 */
@WooriOmmOption(propOption=true)
@XmlType(propOrder={
	"dpacNo", "ebnkSrvcStcd", "hpNo", "ntcTgtTrnDscd", "balNtrsnYn", "smsTmsLimAm", "tmsStaTm", "tmsEndTm", "prcSrno", "smsLstNtcDt", "lstNtcCnt", "smsCtrDt", "rgpe", "fstCtrDt", "mdKdcd"
	, "advpeEno", "smsCancDt", "atsSndLimYn", "cusInfNlkgYn", "newAcno", "acctNo", "acctAliasNm", "pushAgrYn", "isChecked", "isDisabled"
}, name="INBPushNtfcSrvcInqGrid_DTO")
@XmlRootElement(name="INBPushNtfcSrvcInqGrid_DTO")
@BxmCategory(logicalName="PUSH알림서비스조회GRID", description="PUSH알림서비스조회GRID(01249)") 
public class INBPushNtfcSrvcInqGrid_DTO implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -1136136388L;
	
	
	
	/**
	 * 수신계좌번호
	 */
	@ApiModelProperty(
		name = "dpacNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dpacNo")
	@BxmOmm_Field(length=20, decimal=0, description="수신계좌번호", align="left", fill="")
	private String dpacNo= "";
	
	
	/**
	 * 전자뱅킹서비스상태코드
	 */
	@ApiModelProperty(
		name = "ebnkSrvcStcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ebnkSrvcStcd")
	@BxmOmm_Field(length=2, decimal=0, description="전자뱅킹서비스상태코드", align="left", fill="")
	private String ebnkSrvcStcd= "";
	
	
	/**
	 * 핸드폰번호
	 */
	@ApiModelProperty(
		name = "hpNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("hpNo")
	@BxmOmm_Field(length=20, decimal=0, description="핸드폰번호", align="left", fill="")
	private String hpNo= "";
	
	
	/**
	 * 통지대상거래구분코드
	 */
	@ApiModelProperty(
		name = "ntcTgtTrnDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ntcTgtTrnDscd")
	@BxmOmm_Field(length=1, decimal=0, description="통지대상거래구분코드", align="left", fill="")
	private String ntcTgtTrnDscd= "";
	
	
	/**
	 * 잔액미전송여부
	 */
	@ApiModelProperty(
		name = "balNtrsnYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("balNtrsnYn")
	@BxmOmm_Field(length=1, decimal=0, description="잔액미전송여부", align="left", fill="")
	private String balNtrsnYn= "";
	
	
	/**
	 * SMS전송제한금액
	 */
	@ApiModelProperty(
		name = "smsTmsLimAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("smsTmsLimAm")
	@BxmOmm_Field(length=18, decimal=0, description="SMS전송제한금액", align="right", fill="")
	private BigDecimal smsTmsLimAm= new BigDecimal("0");
	
	
	/**
	 * 전송시작시각
	 */
	@ApiModelProperty(
		name = "tmsStaTm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("tmsStaTm")
	@BxmOmm_Field(length=2, decimal=0, description="전송시작시각", align="left", fill="")
	private String tmsStaTm= "";
	
	
	/**
	 * 전송종료시각
	 */
	@ApiModelProperty(
		name = "tmsEndTm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("tmsEndTm")
	@BxmOmm_Field(length=2, decimal=0, description="전송종료시각", align="left", fill="")
	private String tmsEndTm= "";
	
	
	/**
	 * 처리일련번호
	 */
	@ApiModelProperty(
		name = "prcSrno"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("prcSrno")
	@BxmOmm_Field(length=5, decimal=0, description="처리일련번호", align="right", fill="")
	private Integer prcSrno= 0;
	
	
	/**
	 * SMS최종통지일자
	 */
	@ApiModelProperty(
		name = "smsLstNtcDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("smsLstNtcDt")
	@BxmOmm_Field(length=8, decimal=0, description="SMS최종통지일자", align="left", fill="")
	private String smsLstNtcDt= "";
	
	
	/**
	 * 최종통지건수
	 */
	@ApiModelProperty(
		name = "lstNtcCnt"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("lstNtcCnt")
	@BxmOmm_Field(length=6, decimal=0, description="최종통지건수", align="right", fill="")
	private Integer lstNtcCnt= 0;
	
	
	/**
	 * SMS계약일자
	 */
	@ApiModelProperty(
		name = "smsCtrDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("smsCtrDt")
	@BxmOmm_Field(length=8, decimal=0, description="SMS계약일자", align="left", fill="")
	private String smsCtrDt= "";
	
	
	/**
	 * 등록자
	 */
	@ApiModelProperty(
		name = "rgpe"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rgpe")
	@BxmOmm_Field(length=30, decimal=0, description="등록자", align="left", fill="")
	private String rgpe= "";
	
	
	/**
	 * 최초계약일자
	 */
	@ApiModelProperty(
		name = "fstCtrDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("fstCtrDt")
	@BxmOmm_Field(length=8, decimal=0, description="최초계약일자", align="left", fill="")
	private String fstCtrDt= "";
	
	
	/**
	 * 매체종류코드
	 */
	@ApiModelProperty(
		name = "mdKdcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("mdKdcd")
	@BxmOmm_Field(length=8, decimal=0, description="매체종류코드", align="left", fill="")
	private String mdKdcd= "";
	
	
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
	 * SMS해지일자
	 */
	@ApiModelProperty(
		name = "smsCancDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("smsCancDt")
	@BxmOmm_Field(length=8, decimal=0, description="SMS해지일자", align="left", fill="")
	private String smsCancDt= "";
	
	
	/**
	 * 자동이체발송제한여부
	 */
	@ApiModelProperty(
		name = "atsSndLimYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atsSndLimYn")
	@BxmOmm_Field(length=1, decimal=0, description="자동이체발송제한여부", align="left", fill="")
	private String atsSndLimYn= "";
	
	
	/**
	 * 고객정보미연동여부
	 */
	@ApiModelProperty(
		name = "cusInfNlkgYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("cusInfNlkgYn")
	@BxmOmm_Field(length=1, decimal=0, description="고객정보미연동여부", align="left", fill="")
	private String cusInfNlkgYn= "";
	
	
	/**
	 * 신계좌번호
	 */
	@ApiModelProperty(
		name = "newAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("newAcno")
	@BxmOmm_Field(length=13, decimal=0, description="신계좌번호", align="left", fill="")
	private String newAcno= "";
	
	
	/**
	 * 계좌번호
	 */
	@ApiModelProperty(
		name = "acctNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("acctNo")
	@BxmOmm_Field(length=20, decimal=0, description="계좌번호", align="left", fill="", etcProperties={"PROP_OPTION_DSCD=L999"})
	private String acctNo= "";
	
	
	/**
	 * 계좌명
	 */
	@ApiModelProperty(
		name = "acctAliasNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("acctAliasNm")
	@BxmOmm_Field(length=200, decimal=0, description="계좌명", align="left", fill="")
	private String acctAliasNm= "";
	
	
	/**
	 * PUSH동의여부
	 */
	@ApiModelProperty(
		name = "pushAgrYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("pushAgrYn")
	@BxmOmm_Field(length=1, decimal=0, description="PUSH동의여부", align="left", fill="")
	private String pushAgrYn= "";
	
	
	/**
	 * 체크여부
	 */
	@ApiModelProperty(
		name = "isChecked"
		, dataType = "java.lang.Boolean"
		)
	@XmlElement
	@JsonProperty("isChecked")
	@BxmOmm_Field(length=1, decimal=0, description="체크여부", align="left", fill="")
	private Boolean isChecked= false;
	
	
	/**
	 * disable여부
	 */
	@ApiModelProperty(
		name = "isDisabled"
		, dataType = "java.lang.Boolean"
		)
	@XmlElement
	@JsonProperty("isDisabled")
	@BxmOmm_Field(length=1, decimal=0, description="disable여부", align="left", fill="")
	private Boolean isDisabled= false;
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dpacNo= false;
	protected final boolean isSet_dpacNo(){
		return this.isSet_dpacNo;
	}
	private void setIsSet_dpacNo(boolean value){
		this.isSet_dpacNo= value;
	}
	/**
	 * 수신계좌번호
	 */
	@XmlTransient
	public String getDpacNo(){
		return this.dpacNo;
	}
	
	/**
	 * 수신계좌번호
	 * 
	 * @param dpacNo 수신계좌번호
	 */
	public void setDpacNo(String dpacNo){
		this.dpacNo= dpacNo;
		this.setIsSet_dpacNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ebnkSrvcStcd= false;
	protected final boolean isSet_ebnkSrvcStcd(){
		return this.isSet_ebnkSrvcStcd;
	}
	private void setIsSet_ebnkSrvcStcd(boolean value){
		this.isSet_ebnkSrvcStcd= value;
	}
	/**
	 * 전자뱅킹서비스상태코드
	 */
	@XmlTransient
	public String getEbnkSrvcStcd(){
		return this.ebnkSrvcStcd;
	}
	
	/**
	 * 전자뱅킹서비스상태코드
	 * 
	 * @param ebnkSrvcStcd 전자뱅킹서비스상태코드
	 */
	public void setEbnkSrvcStcd(String ebnkSrvcStcd){
		this.ebnkSrvcStcd= ebnkSrvcStcd;
		this.setIsSet_ebnkSrvcStcd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_hpNo= false;
	protected final boolean isSet_hpNo(){
		return this.isSet_hpNo;
	}
	private void setIsSet_hpNo(boolean value){
		this.isSet_hpNo= value;
	}
	/**
	 * 핸드폰번호
	 */
	@XmlTransient
	public String getHpNo(){
		return this.hpNo;
	}
	
	/**
	 * 핸드폰번호
	 * 
	 * @param hpNo 핸드폰번호
	 */
	public void setHpNo(String hpNo){
		this.hpNo= hpNo;
		this.setIsSet_hpNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ntcTgtTrnDscd= false;
	protected final boolean isSet_ntcTgtTrnDscd(){
		return this.isSet_ntcTgtTrnDscd;
	}
	private void setIsSet_ntcTgtTrnDscd(boolean value){
		this.isSet_ntcTgtTrnDscd= value;
	}
	/**
	 * 통지대상거래구분코드
	 */
	@XmlTransient
	public String getNtcTgtTrnDscd(){
		return this.ntcTgtTrnDscd;
	}
	
	/**
	 * 통지대상거래구분코드
	 * 
	 * @param ntcTgtTrnDscd 통지대상거래구분코드
	 */
	public void setNtcTgtTrnDscd(String ntcTgtTrnDscd){
		this.ntcTgtTrnDscd= ntcTgtTrnDscd;
		this.setIsSet_ntcTgtTrnDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_balNtrsnYn= false;
	protected final boolean isSet_balNtrsnYn(){
		return this.isSet_balNtrsnYn;
	}
	private void setIsSet_balNtrsnYn(boolean value){
		this.isSet_balNtrsnYn= value;
	}
	/**
	 * 잔액미전송여부
	 */
	@XmlTransient
	public String getBalNtrsnYn(){
		return this.balNtrsnYn;
	}
	
	/**
	 * 잔액미전송여부
	 * 
	 * @param balNtrsnYn 잔액미전송여부
	 */
	public void setBalNtrsnYn(String balNtrsnYn){
		this.balNtrsnYn= balNtrsnYn;
		this.setIsSet_balNtrsnYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_smsTmsLimAm= false;
	protected final boolean isSet_smsTmsLimAm(){
		return this.isSet_smsTmsLimAm;
	}
	private void setIsSet_smsTmsLimAm(boolean value){
		this.isSet_smsTmsLimAm= value;
	}
	/**
	 * SMS전송제한금액
	 * BigDecimal - Double value setter
	 *
	 * @Param smsTmsLimAm SMS전송제한금액
	 */
	public void setSmsTmsLimAm(double smsTmsLimAm) {
		setSmsTmsLimAm(BigDecimal.valueOf(smsTmsLimAm));
	}
	/**
	 * SMS전송제한금액
	 * BigDecimal - Long value setter
	 *
	 * @Param smsTmsLimAm SMS전송제한금액
	 */
	public void setSmsTmsLimAm(long smsTmsLimAm) {
		setSmsTmsLimAm(BigDecimal.valueOf(smsTmsLimAm));
	}
	/**
	 * SMS전송제한금액
	 * BigDecimal - String value setter
	 *
	 * @Param smsTmsLimAm SMS전송제한금액
	 */
	public void setSmsTmsLimAm(String smsTmsLimAm) {
		setSmsTmsLimAm(new BigDecimal(smsTmsLimAm));
	}
	/**
	 * SMS전송제한금액
	 */
	@XmlTransient
	public BigDecimal getSmsTmsLimAm(){
		return this.smsTmsLimAm;
	}
	
	/**
	 * SMS전송제한금액
	 * 
	 * @param smsTmsLimAm SMS전송제한금액
	 */
	@JsonSetter("smsTmsLimAm")
	public void setSmsTmsLimAm(BigDecimal smsTmsLimAm){
		this.smsTmsLimAm= smsTmsLimAm;
		this.setIsSet_smsTmsLimAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_tmsStaTm= false;
	protected final boolean isSet_tmsStaTm(){
		return this.isSet_tmsStaTm;
	}
	private void setIsSet_tmsStaTm(boolean value){
		this.isSet_tmsStaTm= value;
	}
	/**
	 * 전송시작시각
	 */
	@XmlTransient
	public String getTmsStaTm(){
		return this.tmsStaTm;
	}
	
	/**
	 * 전송시작시각
	 * 
	 * @param tmsStaTm 전송시작시각
	 */
	public void setTmsStaTm(String tmsStaTm){
		this.tmsStaTm= tmsStaTm;
		this.setIsSet_tmsStaTm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_tmsEndTm= false;
	protected final boolean isSet_tmsEndTm(){
		return this.isSet_tmsEndTm;
	}
	private void setIsSet_tmsEndTm(boolean value){
		this.isSet_tmsEndTm= value;
	}
	/**
	 * 전송종료시각
	 */
	@XmlTransient
	public String getTmsEndTm(){
		return this.tmsEndTm;
	}
	
	/**
	 * 전송종료시각
	 * 
	 * @param tmsEndTm 전송종료시각
	 */
	public void setTmsEndTm(String tmsEndTm){
		this.tmsEndTm= tmsEndTm;
		this.setIsSet_tmsEndTm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_prcSrno= false;
	protected final boolean isSet_prcSrno(){
		return this.isSet_prcSrno;
	}
	private void setIsSet_prcSrno(boolean value){
		this.isSet_prcSrno= value;
	}
	/**
	 * 처리일련번호
	 */
	@XmlTransient
	public Integer getPrcSrno(){
		return this.prcSrno;
	}
	
	/**
	 * 처리일련번호
	 * 
	 * @param prcSrno 처리일련번호
	 */
	public void setPrcSrno(Integer prcSrno){
		this.prcSrno= prcSrno;
		this.setIsSet_prcSrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_smsLstNtcDt= false;
	protected final boolean isSet_smsLstNtcDt(){
		return this.isSet_smsLstNtcDt;
	}
	private void setIsSet_smsLstNtcDt(boolean value){
		this.isSet_smsLstNtcDt= value;
	}
	/**
	 * SMS최종통지일자
	 */
	@XmlTransient
	public String getSmsLstNtcDt(){
		return this.smsLstNtcDt;
	}
	
	/**
	 * SMS최종통지일자
	 * 
	 * @param smsLstNtcDt SMS최종통지일자
	 */
	public void setSmsLstNtcDt(String smsLstNtcDt){
		this.smsLstNtcDt= smsLstNtcDt;
		this.setIsSet_smsLstNtcDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_lstNtcCnt= false;
	protected final boolean isSet_lstNtcCnt(){
		return this.isSet_lstNtcCnt;
	}
	private void setIsSet_lstNtcCnt(boolean value){
		this.isSet_lstNtcCnt= value;
	}
	/**
	 * 최종통지건수
	 */
	@XmlTransient
	public Integer getLstNtcCnt(){
		return this.lstNtcCnt;
	}
	
	/**
	 * 최종통지건수
	 * 
	 * @param lstNtcCnt 최종통지건수
	 */
	public void setLstNtcCnt(Integer lstNtcCnt){
		this.lstNtcCnt= lstNtcCnt;
		this.setIsSet_lstNtcCnt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_smsCtrDt= false;
	protected final boolean isSet_smsCtrDt(){
		return this.isSet_smsCtrDt;
	}
	private void setIsSet_smsCtrDt(boolean value){
		this.isSet_smsCtrDt= value;
	}
	/**
	 * SMS계약일자
	 */
	@XmlTransient
	public String getSmsCtrDt(){
		return this.smsCtrDt;
	}
	
	/**
	 * SMS계약일자
	 * 
	 * @param smsCtrDt SMS계약일자
	 */
	public void setSmsCtrDt(String smsCtrDt){
		this.smsCtrDt= smsCtrDt;
		this.setIsSet_smsCtrDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rgpe= false;
	protected final boolean isSet_rgpe(){
		return this.isSet_rgpe;
	}
	private void setIsSet_rgpe(boolean value){
		this.isSet_rgpe= value;
	}
	/**
	 * 등록자
	 */
	@XmlTransient
	public String getRgpe(){
		return this.rgpe;
	}
	
	/**
	 * 등록자
	 * 
	 * @param rgpe 등록자
	 */
	public void setRgpe(String rgpe){
		this.rgpe= rgpe;
		this.setIsSet_rgpe(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_fstCtrDt= false;
	protected final boolean isSet_fstCtrDt(){
		return this.isSet_fstCtrDt;
	}
	private void setIsSet_fstCtrDt(boolean value){
		this.isSet_fstCtrDt= value;
	}
	/**
	 * 최초계약일자
	 */
	@XmlTransient
	public String getFstCtrDt(){
		return this.fstCtrDt;
	}
	
	/**
	 * 최초계약일자
	 * 
	 * @param fstCtrDt 최초계약일자
	 */
	public void setFstCtrDt(String fstCtrDt){
		this.fstCtrDt= fstCtrDt;
		this.setIsSet_fstCtrDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mdKdcd= false;
	protected final boolean isSet_mdKdcd(){
		return this.isSet_mdKdcd;
	}
	private void setIsSet_mdKdcd(boolean value){
		this.isSet_mdKdcd= value;
	}
	/**
	 * 매체종류코드
	 */
	@XmlTransient
	public String getMdKdcd(){
		return this.mdKdcd;
	}
	
	/**
	 * 매체종류코드
	 * 
	 * @param mdKdcd 매체종류코드
	 */
	public void setMdKdcd(String mdKdcd){
		this.mdKdcd= mdKdcd;
		this.setIsSet_mdKdcd(true);
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
	private boolean isSet_smsCancDt= false;
	protected final boolean isSet_smsCancDt(){
		return this.isSet_smsCancDt;
	}
	private void setIsSet_smsCancDt(boolean value){
		this.isSet_smsCancDt= value;
	}
	/**
	 * SMS해지일자
	 */
	@XmlTransient
	public String getSmsCancDt(){
		return this.smsCancDt;
	}
	
	/**
	 * SMS해지일자
	 * 
	 * @param smsCancDt SMS해지일자
	 */
	public void setSmsCancDt(String smsCancDt){
		this.smsCancDt= smsCancDt;
		this.setIsSet_smsCancDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atsSndLimYn= false;
	protected final boolean isSet_atsSndLimYn(){
		return this.isSet_atsSndLimYn;
	}
	private void setIsSet_atsSndLimYn(boolean value){
		this.isSet_atsSndLimYn= value;
	}
	/**
	 * 자동이체발송제한여부
	 */
	@XmlTransient
	public String getAtsSndLimYn(){
		return this.atsSndLimYn;
	}
	
	/**
	 * 자동이체발송제한여부
	 * 
	 * @param atsSndLimYn 자동이체발송제한여부
	 */
	public void setAtsSndLimYn(String atsSndLimYn){
		this.atsSndLimYn= atsSndLimYn;
		this.setIsSet_atsSndLimYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cusInfNlkgYn= false;
	protected final boolean isSet_cusInfNlkgYn(){
		return this.isSet_cusInfNlkgYn;
	}
	private void setIsSet_cusInfNlkgYn(boolean value){
		this.isSet_cusInfNlkgYn= value;
	}
	/**
	 * 고객정보미연동여부
	 */
	@XmlTransient
	public String getCusInfNlkgYn(){
		return this.cusInfNlkgYn;
	}
	
	/**
	 * 고객정보미연동여부
	 * 
	 * @param cusInfNlkgYn 고객정보미연동여부
	 */
	public void setCusInfNlkgYn(String cusInfNlkgYn){
		this.cusInfNlkgYn= cusInfNlkgYn;
		this.setIsSet_cusInfNlkgYn(true);
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
	private boolean isSet_acctNo= false;
	protected final boolean isSet_acctNo(){
		return this.isSet_acctNo;
	}
	private void setIsSet_acctNo(boolean value){
		this.isSet_acctNo= value;
	}
	/**
	 * 계좌번호
	 */
	@XmlTransient
	public String getAcctNo(){
		return this.acctNo;
	}
	
	/**
	 * 계좌번호
	 * 
	 * @param acctNo 계좌번호
	 */
	public void setAcctNo(String acctNo){
		this.acctNo= acctNo;
		this.setIsSet_acctNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_acctAliasNm= false;
	protected final boolean isSet_acctAliasNm(){
		return this.isSet_acctAliasNm;
	}
	private void setIsSet_acctAliasNm(boolean value){
		this.isSet_acctAliasNm= value;
	}
	/**
	 * 계좌명
	 */
	@XmlTransient
	public String getAcctAliasNm(){
		return this.acctAliasNm;
	}
	
	/**
	 * 계좌명
	 * 
	 * @param acctAliasNm 계좌명
	 */
	public void setAcctAliasNm(String acctAliasNm){
		this.acctAliasNm= acctAliasNm;
		this.setIsSet_acctAliasNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pushAgrYn= false;
	protected final boolean isSet_pushAgrYn(){
		return this.isSet_pushAgrYn;
	}
	private void setIsSet_pushAgrYn(boolean value){
		this.isSet_pushAgrYn= value;
	}
	/**
	 * PUSH동의여부
	 */
	@XmlTransient
	public String getPushAgrYn(){
		return this.pushAgrYn;
	}
	
	/**
	 * PUSH동의여부
	 * 
	 * @param pushAgrYn PUSH동의여부
	 */
	public void setPushAgrYn(String pushAgrYn){
		this.pushAgrYn= pushAgrYn;
		this.setIsSet_pushAgrYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_isChecked= false;
	protected final boolean isSet_isChecked(){
		return this.isSet_isChecked;
	}
	private void setIsSet_isChecked(boolean value){
		this.isSet_isChecked= value;
	}
	/**
	 * 체크여부
	 */
	@XmlTransient
	public Boolean isIsChecked(){
		return this.isChecked;
	}
	
	/**
	 * 체크여부
	 * 
	 * @param isChecked 체크여부
	 */
	public void setIsChecked(Boolean isChecked){
		this.isChecked= isChecked;
		this.setIsSet_isChecked(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_isDisabled= false;
	protected final boolean isSet_isDisabled(){
		return this.isSet_isDisabled;
	}
	private void setIsSet_isDisabled(boolean value){
		this.isSet_isDisabled= value;
	}
	/**
	 * disable여부
	 */
	@XmlTransient
	public Boolean isIsDisabled(){
		return this.isDisabled;
	}
	
	/**
	 * disable여부
	 * 
	 * @param isDisabled disable여부
	 */
	public void setIsDisabled(Boolean isDisabled){
		this.isDisabled= isDisabled;
		this.setIsSet_isDisabled(true);
	}
				
	@Override
	public INBPushNtfcSrvcInqGrid_DTO clone(){
		try{
			INBPushNtfcSrvcInqGrid_DTO object= (INBPushNtfcSrvcInqGrid_DTO)super.clone();
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
		
		result= prime * result + ((this.dpacNo==null)?0:this.dpacNo.hashCode());
		result= prime * result + ((this.ebnkSrvcStcd==null)?0:this.ebnkSrvcStcd.hashCode());
		result= prime * result + ((this.hpNo==null)?0:this.hpNo.hashCode());
		result= prime * result + ((this.ntcTgtTrnDscd==null)?0:this.ntcTgtTrnDscd.hashCode());
		result= prime * result + ((this.balNtrsnYn==null)?0:this.balNtrsnYn.hashCode());
		result= prime * result + ((this.smsTmsLimAm==null)?0:this.smsTmsLimAm.hashCode());
		result= prime * result + ((this.tmsStaTm==null)?0:this.tmsStaTm.hashCode());
		result= prime * result + ((this.tmsEndTm==null)?0:this.tmsEndTm.hashCode());
		result= prime * result + ((this.prcSrno==null)?0:this.prcSrno.hashCode());
		result= prime * result + ((this.smsLstNtcDt==null)?0:this.smsLstNtcDt.hashCode());
		result= prime * result + ((this.lstNtcCnt==null)?0:this.lstNtcCnt.hashCode());
		result= prime * result + ((this.smsCtrDt==null)?0:this.smsCtrDt.hashCode());
		result= prime * result + ((this.rgpe==null)?0:this.rgpe.hashCode());
		result= prime * result + ((this.fstCtrDt==null)?0:this.fstCtrDt.hashCode());
		result= prime * result + ((this.mdKdcd==null)?0:this.mdKdcd.hashCode());
		result= prime * result + ((this.advpeEno==null)?0:this.advpeEno.hashCode());
		result= prime * result + ((this.smsCancDt==null)?0:this.smsCancDt.hashCode());
		result= prime * result + ((this.atsSndLimYn==null)?0:this.atsSndLimYn.hashCode());
		result= prime * result + ((this.cusInfNlkgYn==null)?0:this.cusInfNlkgYn.hashCode());
		result= prime * result + ((this.newAcno==null)?0:this.newAcno.hashCode());
		result= prime * result + ((this.acctNo==null)?0:this.acctNo.hashCode());
		result= prime * result + ((this.acctAliasNm==null)?0:this.acctAliasNm.hashCode());
		result= prime * result + ((this.pushAgrYn==null)?0:this.pushAgrYn.hashCode());
		result= prime * result + ((this.isChecked==null)?0:this.isChecked.hashCode());
		result= prime * result + ((this.isDisabled==null)?0:this.isDisabled.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final INBPushNtfcSrvcInqGrid_DTO other= (INBPushNtfcSrvcInqGrid_DTO)obj;
		{
			Object _dpacNo= getDpacNo();
			Object __dpacNo= other.getDpacNo();
			if ( _dpacNo== null ) { if ( __dpacNo!= null ) return false; }
			else if ( !_dpacNo.equals(__dpacNo) ) return false;
		}
		{
			Object _ebnkSrvcStcd= getEbnkSrvcStcd();
			Object __ebnkSrvcStcd= other.getEbnkSrvcStcd();
			if ( _ebnkSrvcStcd== null ) { if ( __ebnkSrvcStcd!= null ) return false; }
			else if ( !_ebnkSrvcStcd.equals(__ebnkSrvcStcd) ) return false;
		}
		{
			Object _hpNo= getHpNo();
			Object __hpNo= other.getHpNo();
			if ( _hpNo== null ) { if ( __hpNo!= null ) return false; }
			else if ( !_hpNo.equals(__hpNo) ) return false;
		}
		{
			Object _ntcTgtTrnDscd= getNtcTgtTrnDscd();
			Object __ntcTgtTrnDscd= other.getNtcTgtTrnDscd();
			if ( _ntcTgtTrnDscd== null ) { if ( __ntcTgtTrnDscd!= null ) return false; }
			else if ( !_ntcTgtTrnDscd.equals(__ntcTgtTrnDscd) ) return false;
		}
		{
			Object _balNtrsnYn= getBalNtrsnYn();
			Object __balNtrsnYn= other.getBalNtrsnYn();
			if ( _balNtrsnYn== null ) { if ( __balNtrsnYn!= null ) return false; }
			else if ( !_balNtrsnYn.equals(__balNtrsnYn) ) return false;
		}
		{
			Object _smsTmsLimAm= getSmsTmsLimAm();
			Object __smsTmsLimAm= other.getSmsTmsLimAm();
			if ( _smsTmsLimAm== null ) { if ( __smsTmsLimAm!= null ) return false; }
			else if ( !_smsTmsLimAm.equals(__smsTmsLimAm) ) return false;
		}
		{
			Object _tmsStaTm= getTmsStaTm();
			Object __tmsStaTm= other.getTmsStaTm();
			if ( _tmsStaTm== null ) { if ( __tmsStaTm!= null ) return false; }
			else if ( !_tmsStaTm.equals(__tmsStaTm) ) return false;
		}
		{
			Object _tmsEndTm= getTmsEndTm();
			Object __tmsEndTm= other.getTmsEndTm();
			if ( _tmsEndTm== null ) { if ( __tmsEndTm!= null ) return false; }
			else if ( !_tmsEndTm.equals(__tmsEndTm) ) return false;
		}
		{
			Object _prcSrno= getPrcSrno();
			Object __prcSrno= other.getPrcSrno();
			if ( _prcSrno== null ) { if ( __prcSrno!= null ) return false; }
			else if ( !_prcSrno.equals(__prcSrno) ) return false;
		}
		{
			Object _smsLstNtcDt= getSmsLstNtcDt();
			Object __smsLstNtcDt= other.getSmsLstNtcDt();
			if ( _smsLstNtcDt== null ) { if ( __smsLstNtcDt!= null ) return false; }
			else if ( !_smsLstNtcDt.equals(__smsLstNtcDt) ) return false;
		}
		{
			Object _lstNtcCnt= getLstNtcCnt();
			Object __lstNtcCnt= other.getLstNtcCnt();
			if ( _lstNtcCnt== null ) { if ( __lstNtcCnt!= null ) return false; }
			else if ( !_lstNtcCnt.equals(__lstNtcCnt) ) return false;
		}
		{
			Object _smsCtrDt= getSmsCtrDt();
			Object __smsCtrDt= other.getSmsCtrDt();
			if ( _smsCtrDt== null ) { if ( __smsCtrDt!= null ) return false; }
			else if ( !_smsCtrDt.equals(__smsCtrDt) ) return false;
		}
		{
			Object _rgpe= getRgpe();
			Object __rgpe= other.getRgpe();
			if ( _rgpe== null ) { if ( __rgpe!= null ) return false; }
			else if ( !_rgpe.equals(__rgpe) ) return false;
		}
		{
			Object _fstCtrDt= getFstCtrDt();
			Object __fstCtrDt= other.getFstCtrDt();
			if ( _fstCtrDt== null ) { if ( __fstCtrDt!= null ) return false; }
			else if ( !_fstCtrDt.equals(__fstCtrDt) ) return false;
		}
		{
			Object _mdKdcd= getMdKdcd();
			Object __mdKdcd= other.getMdKdcd();
			if ( _mdKdcd== null ) { if ( __mdKdcd!= null ) return false; }
			else if ( !_mdKdcd.equals(__mdKdcd) ) return false;
		}
		{
			Object _advpeEno= getAdvpeEno();
			Object __advpeEno= other.getAdvpeEno();
			if ( _advpeEno== null ) { if ( __advpeEno!= null ) return false; }
			else if ( !_advpeEno.equals(__advpeEno) ) return false;
		}
		{
			Object _smsCancDt= getSmsCancDt();
			Object __smsCancDt= other.getSmsCancDt();
			if ( _smsCancDt== null ) { if ( __smsCancDt!= null ) return false; }
			else if ( !_smsCancDt.equals(__smsCancDt) ) return false;
		}
		{
			Object _atsSndLimYn= getAtsSndLimYn();
			Object __atsSndLimYn= other.getAtsSndLimYn();
			if ( _atsSndLimYn== null ) { if ( __atsSndLimYn!= null ) return false; }
			else if ( !_atsSndLimYn.equals(__atsSndLimYn) ) return false;
		}
		{
			Object _cusInfNlkgYn= getCusInfNlkgYn();
			Object __cusInfNlkgYn= other.getCusInfNlkgYn();
			if ( _cusInfNlkgYn== null ) { if ( __cusInfNlkgYn!= null ) return false; }
			else if ( !_cusInfNlkgYn.equals(__cusInfNlkgYn) ) return false;
		}
		{
			Object _newAcno= getNewAcno();
			Object __newAcno= other.getNewAcno();
			if ( _newAcno== null ) { if ( __newAcno!= null ) return false; }
			else if ( !_newAcno.equals(__newAcno) ) return false;
		}
		{
			Object _acctNo= getAcctNo();
			Object __acctNo= other.getAcctNo();
			if ( _acctNo== null ) { if ( __acctNo!= null ) return false; }
			else if ( !_acctNo.equals(__acctNo) ) return false;
		}
		{
			Object _acctAliasNm= getAcctAliasNm();
			Object __acctAliasNm= other.getAcctAliasNm();
			if ( _acctAliasNm== null ) { if ( __acctAliasNm!= null ) return false; }
			else if ( !_acctAliasNm.equals(__acctAliasNm) ) return false;
		}
		{
			Object _pushAgrYn= getPushAgrYn();
			Object __pushAgrYn= other.getPushAgrYn();
			if ( _pushAgrYn== null ) { if ( __pushAgrYn!= null ) return false; }
			else if ( !_pushAgrYn.equals(__pushAgrYn) ) return false;
		}
		{
			Object _isChecked= isIsChecked();
			Object __isChecked= other.isIsChecked();
			if ( _isChecked== null ) { if ( __isChecked!= null ) return false; }
			else if ( !_isChecked.equals(__isChecked) ) return false;
		}
		{
			Object _isDisabled= isIsDisabled();
			Object __isDisabled= other.isIsDisabled();
			if ( _isDisabled== null ) { if ( __isDisabled!= null ) return false; }
			else if ( !_isDisabled.equals(__isDisabled) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(INBPushNtfcSrvcInqGrid_DTO.class.getName()).append(":\n");
		sb.append("\tdpacNo: ");
		sb.append(dpacNo==null?"null":getDpacNo());
		sb.append("\n");
		sb.append("\tebnkSrvcStcd: ");
		sb.append(ebnkSrvcStcd==null?"null":getEbnkSrvcStcd());
		sb.append("\n");
		sb.append("\thpNo: ");
		sb.append(hpNo==null?"null":getHpNo());
		sb.append("\n");
		sb.append("\tntcTgtTrnDscd: ");
		sb.append(ntcTgtTrnDscd==null?"null":getNtcTgtTrnDscd());
		sb.append("\n");
		sb.append("\tbalNtrsnYn: ");
		sb.append(balNtrsnYn==null?"null":getBalNtrsnYn());
		sb.append("\n");
		sb.append("\tsmsTmsLimAm: ");
		sb.append(smsTmsLimAm==null?"null":getSmsTmsLimAm());
		sb.append("\n");
		sb.append("\ttmsStaTm: ");
		sb.append(tmsStaTm==null?"null":getTmsStaTm());
		sb.append("\n");
		sb.append("\ttmsEndTm: ");
		sb.append(tmsEndTm==null?"null":getTmsEndTm());
		sb.append("\n");
		sb.append("\tprcSrno: ");
		sb.append(prcSrno==null?"null":getPrcSrno());
		sb.append("\n");
		sb.append("\tsmsLstNtcDt: ");
		sb.append(smsLstNtcDt==null?"null":getSmsLstNtcDt());
		sb.append("\n");
		sb.append("\tlstNtcCnt: ");
		sb.append(lstNtcCnt==null?"null":getLstNtcCnt());
		sb.append("\n");
		sb.append("\tsmsCtrDt: ");
		sb.append(smsCtrDt==null?"null":getSmsCtrDt());
		sb.append("\n");
		sb.append("\trgpe: ");
		sb.append(rgpe==null?"null":getRgpe());
		sb.append("\n");
		sb.append("\tfstCtrDt: ");
		sb.append(fstCtrDt==null?"null":getFstCtrDt());
		sb.append("\n");
		sb.append("\tmdKdcd: ");
		sb.append(mdKdcd==null?"null":getMdKdcd());
		sb.append("\n");
		sb.append("\tadvpeEno: ");
		sb.append(advpeEno==null?"null":getAdvpeEno());
		sb.append("\n");
		sb.append("\tsmsCancDt: ");
		sb.append(smsCancDt==null?"null":getSmsCancDt());
		sb.append("\n");
		sb.append("\tatsSndLimYn: ");
		sb.append(atsSndLimYn==null?"null":getAtsSndLimYn());
		sb.append("\n");
		sb.append("\tcusInfNlkgYn: ");
		sb.append(cusInfNlkgYn==null?"null":getCusInfNlkgYn());
		sb.append("\n");
		sb.append("\tnewAcno: ");
		sb.append(newAcno==null?"null":getNewAcno());
		sb.append("\n");
		sb.append("\tacctNo: ");
		sb.append(acctNo==null?"null":getAcctNo());
		sb.append("\n");
		sb.append("\tacctAliasNm: ");
		sb.append(acctAliasNm==null?"null":getAcctAliasNm());
		sb.append("\n");
		sb.append("\tpushAgrYn: ");
		sb.append(pushAgrYn==null?"null":getPushAgrYn());
		sb.append("\n");
		sb.append("\tisChecked: ");
		sb.append(isChecked==null?"null":isIsChecked());
		sb.append("\n");
		sb.append("\tisDisabled: ");
		sb.append(isDisabled==null?"null":isIsDisabled());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 20; /* dpacNo */
		messageLen+= 2; /* ebnkSrvcStcd */
		messageLen+= 20; /* hpNo */
		messageLen+= 1; /* ntcTgtTrnDscd */
		messageLen+= 1; /* balNtrsnYn */
		messageLen+= 18; /* smsTmsLimAm */
		messageLen+= 2; /* tmsStaTm */
		messageLen+= 2; /* tmsEndTm */
		messageLen+= 5; /* prcSrno */
		messageLen+= 8; /* smsLstNtcDt */
		messageLen+= 6; /* lstNtcCnt */
		messageLen+= 8; /* smsCtrDt */
		messageLen+= 30; /* rgpe */
		messageLen+= 8; /* fstCtrDt */
		messageLen+= 8; /* mdKdcd */
		messageLen+= 8; /* advpeEno */
		messageLen+= 8; /* smsCancDt */
		messageLen+= 1; /* atsSndLimYn */
		messageLen+= 1; /* cusInfNlkgYn */
		messageLen+= 13; /* newAcno */
		messageLen+= 20; /* acctNo */
		messageLen+= 200; /* acctAliasNm */
		messageLen+= 1; /* pushAgrYn */
		messageLen+= 1; /* isChecked */
		messageLen+= 1; /* isDisabled */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("dpacNo");
		list.add("ebnkSrvcStcd");
		list.add("hpNo");
		list.add("ntcTgtTrnDscd");
		list.add("balNtrsnYn");
		list.add("smsTmsLimAm");
		list.add("tmsStaTm");
		list.add("tmsEndTm");
		list.add("prcSrno");
		list.add("smsLstNtcDt");
		list.add("lstNtcCnt");
		list.add("smsCtrDt");
		list.add("rgpe");
		list.add("fstCtrDt");
		list.add("mdKdcd");
		list.add("advpeEno");
		list.add("smsCancDt");
		list.add("atsSndLimYn");
		list.add("cusInfNlkgYn");
		list.add("newAcno");
		list.add("acctNo");
		list.add("acctAliasNm");
		list.add("pushAgrYn");
		list.add("isChecked");
		list.add("isDisabled");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("dpacNo", get("dpacNo"));
		map.put("ebnkSrvcStcd", get("ebnkSrvcStcd"));
		map.put("hpNo", get("hpNo"));
		map.put("ntcTgtTrnDscd", get("ntcTgtTrnDscd"));
		map.put("balNtrsnYn", get("balNtrsnYn"));
		map.put("smsTmsLimAm", get("smsTmsLimAm"));
		map.put("tmsStaTm", get("tmsStaTm"));
		map.put("tmsEndTm", get("tmsEndTm"));
		map.put("prcSrno", get("prcSrno"));
		map.put("smsLstNtcDt", get("smsLstNtcDt"));
		map.put("lstNtcCnt", get("lstNtcCnt"));
		map.put("smsCtrDt", get("smsCtrDt"));
		map.put("rgpe", get("rgpe"));
		map.put("fstCtrDt", get("fstCtrDt"));
		map.put("mdKdcd", get("mdKdcd"));
		map.put("advpeEno", get("advpeEno"));
		map.put("smsCancDt", get("smsCancDt"));
		map.put("atsSndLimYn", get("atsSndLimYn"));
		map.put("cusInfNlkgYn", get("cusInfNlkgYn"));
		map.put("newAcno", get("newAcno"));
		map.put("acctNo", get("acctNo"));
		map.put("acctAliasNm", get("acctAliasNm"));
		map.put("pushAgrYn", get("pushAgrYn"));
		map.put("isChecked", get("isChecked"));
		map.put("isDisabled", get("isDisabled"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -1325630449:/* dpacNo */
			return getDpacNo();
		case 71960360:/* ebnkSrvcStcd */
			return getEbnkSrvcStcd();
		case 3208425:/* hpNo */
			return getHpNo();
		case -1825988964:/* ntcTgtTrnDscd */
			return getNtcTgtTrnDscd();
		case 1872684911:/* balNtrsnYn */
			return getBalNtrsnYn();
		case -448336293:/* smsTmsLimAm */
			return getSmsTmsLimAm();
		case 1628745663:/* tmsStaTm */
			return getTmsStaTm();
		case 1615640506:/* tmsEndTm */
			return getTmsEndTm();
		case -321065311:/* prcSrno */
			return getPrcSrno();
		case -445067911:/* smsLstNtcDt */
			return getSmsLstNtcDt();
		case -1157396743:/* lstNtcCnt */
			return getLstNtcCnt();
		case -128825160:/* smsCtrDt */
			return getSmsCtrDt();
		case 3498730:/* rgpe */
			return getRgpe();
		case -251839094:/* fstCtrDt */
			return getFstCtrDt();
		case -1079704143:/* mdKdcd */
			return getMdKdcd();
		case -705281570:/* advpeEno */
			return getAdvpeEno();
		case 283749692:/* smsCancDt */
			return getSmsCancDt();
		case -828320612:/* atsSndLimYn */
			return getAtsSndLimYn();
		case 1282743887:/* cusInfNlkgYn */
			return getCusInfNlkgYn();
		case 1844635427:/* newAcno */
			return getNewAcno();
		case -1423447756:/* acctNo */
			return getAcctNo();
		case 2017697948:/* acctAliasNm */
			return getAcctAliasNm();
		case -796708281:/* pushAgrYn */
			return getPushAgrYn();
		case 162535197:/* isChecked */
			return isIsChecked();
		case -522329658:/* isDisabled */
			return isIsDisabled();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -1325630449:/* dpacNo */
			setDpacNo((String)value);
			break;
		case 71960360:/* ebnkSrvcStcd */
			setEbnkSrvcStcd((String)value);
			break;
		case 3208425:/* hpNo */
			setHpNo((String)value);
			break;
		case -1825988964:/* ntcTgtTrnDscd */
			setNtcTgtTrnDscd((String)value);
			break;
		case 1872684911:/* balNtrsnYn */
			setBalNtrsnYn((String)value);
			break;
		case -448336293:/* smsTmsLimAm */
			if ( value instanceof String ){
				setSmsTmsLimAm((String)value);
			}
			else if ( value instanceof Double ){
				setSmsTmsLimAm((Double)value);
			}
			else if ( value instanceof Long ){
				setSmsTmsLimAm((Long)value);
			}
			else{
				setSmsTmsLimAm((BigDecimal)value);
			}
			break;
		case 1628745663:/* tmsStaTm */
			setTmsStaTm((String)value);
			break;
		case 1615640506:/* tmsEndTm */
			setTmsEndTm((String)value);
			break;
		case -321065311:/* prcSrno */
			setPrcSrno((Integer)value);
			break;
		case -445067911:/* smsLstNtcDt */
			setSmsLstNtcDt((String)value);
			break;
		case -1157396743:/* lstNtcCnt */
			setLstNtcCnt((Integer)value);
			break;
		case -128825160:/* smsCtrDt */
			setSmsCtrDt((String)value);
			break;
		case 3498730:/* rgpe */
			setRgpe((String)value);
			break;
		case -251839094:/* fstCtrDt */
			setFstCtrDt((String)value);
			break;
		case -1079704143:/* mdKdcd */
			setMdKdcd((String)value);
			break;
		case -705281570:/* advpeEno */
			setAdvpeEno((String)value);
			break;
		case 283749692:/* smsCancDt */
			setSmsCancDt((String)value);
			break;
		case -828320612:/* atsSndLimYn */
			setAtsSndLimYn((String)value);
			break;
		case 1282743887:/* cusInfNlkgYn */
			setCusInfNlkgYn((String)value);
			break;
		case 1844635427:/* newAcno */
			setNewAcno((String)value);
			break;
		case -1423447756:/* acctNo */
			setAcctNo((String)value);
			break;
		case 2017697948:/* acctAliasNm */
			setAcctAliasNm((String)value);
			break;
		case -796708281:/* pushAgrYn */
			setPushAgrYn((String)value);
			break;
		case 162535197:/* isChecked */
			setIsChecked((Boolean)value);
			break;
		case -522329658:/* isDisabled */
			setIsDisabled((Boolean)value);
			break;
		default:
			break;
		}
	}
	
}
