/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.inb.ctr.dto;

import bxm.common.annotaion.BxmCategory;
import bxm.omm.annotation.BxmOmm_Field;
import bxm.omm.exception.CloneFailedException;
import bxm.omm.predict.FieldInfo;
import bxm.omm.predict.Predictable;
import bxm.omm.root.IOmmObject;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 * 기타알림 동의 여부 컨트롤러 IO
 */
@XmlType(propOrder={
	"dpidTrtXprNtfcAgrYn", "fnsXprNtfcAgrYn", "lnXprNtfcAgrYn", "lnintPidNtfcAgrYn", "atsXprNtfcAgrYn", "eltUndasPrNtfcAgrYn", "sltMndNtfcAgrYn", "xprNtfcIdx", "dayilyAgrYn", "weeklyAgrYn", "monthlyAgrYn", "issueAgrYn", "tim9brfAgrYn", "wctfcNtfcAgrYn", "mrktAgrYn1"
	, "smsMrktAgrYn1", "etcEstDis", "evtDis", "nlginAgrYn"
}, name="INBNtfbxPushEtcEstUpdateEtcNtfcAgrYn_IDT")
@XmlRootElement(name="INBNtfbxPushEtcEstUpdateEtcNtfcAgrYn_IDT")
@BxmCategory(logicalName="기타알림.동의여부.컨트롤러.입력.IO", description="기타알림 동의 여부 컨트롤러 IO") 
public class INBNtfbxPushEtcEstUpdateEtcNtfcAgrYn_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 1516603727L;
	
	
	
	/**
	 * 예적금신탁만기알림동의여부
	 */
	@ApiModelProperty(
		name = "dpidTrtXprNtfcAgrYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dpidTrtXprNtfcAgrYn")
	@BxmOmm_Field(length=1, decimal=0, description="예적금신탁만기알림동의여부", align="left", fill="")
	private String dpidTrtXprNtfcAgrYn= "";
	
	
	/**
	 * 펀드만기알림동의여부
	 */
	@ApiModelProperty(
		name = "fnsXprNtfcAgrYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("fnsXprNtfcAgrYn")
	@BxmOmm_Field(length=1, decimal=0, description="펀드만기알림동의여부", align="left", fill="")
	private String fnsXprNtfcAgrYn= "";
	
	
	/**
	 * 대출만기알림동의여부
	 */
	@ApiModelProperty(
		name = "lnXprNtfcAgrYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("lnXprNtfcAgrYn")
	@BxmOmm_Field(length=1, decimal=0, description="대출만기알림동의여부", align="left", fill="")
	private String lnXprNtfcAgrYn= "";
	
	
	/**
	 * 대출이자납입알림동의여부
	 */
	@ApiModelProperty(
		name = "lnintPidNtfcAgrYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("lnintPidNtfcAgrYn")
	@BxmOmm_Field(length=1, decimal=0, description="대출이자납입알림동의여부", align="left", fill="")
	private String lnintPidNtfcAgrYn= "";
	
	
	/**
	 * 자동이체만기알림동의여부
	 */
	@ApiModelProperty(
		name = "atsXprNtfcAgrYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atsXprNtfcAgrYn")
	@BxmOmm_Field(length=1, decimal=0, description="자동이체만기알림동의여부", align="left", fill="")
	private String atsXprNtfcAgrYn= "";
	
	
	/**
	 * ELT기초자산가격알림동의여부
	 */
	@ApiModelProperty(
		name = "eltUndasPrNtfcAgrYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("eltUndasPrNtfcAgrYn")
	@BxmOmm_Field(length=1, decimal=0, description="ELT기초자산가격알림동의여부", align="left", fill="")
	private String eltUndasPrNtfcAgrYn= "";
	
	
	/**
	 * 기타알림동의여부
	 */
	@ApiModelProperty(
		name = "sltMndNtfcAgrYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("sltMndNtfcAgrYn")
	@BxmOmm_Field(length=1, decimal=0, description="기타알림동의여부", align="left", fill="")
	private String sltMndNtfcAgrYn= "";
	
	
	/**
	 * 만기여부인덱스
	 */
	@ApiModelProperty(
		name = "xprNtfcIdx"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("xprNtfcIdx")
	@BxmOmm_Field(length=1, decimal=0, description="만기여부인덱스", align="right", fill="")
	private Integer xprNtfcIdx= 0;
	
	
	/**
	 * dayily구독여부
	 */
	@ApiModelProperty(
		name = "dayilyAgrYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dayilyAgrYn")
	@BxmOmm_Field(length=1, decimal=0, description="dayily구독여부", align="left", fill="")
	private String dayilyAgrYn= "";
	
	
	/**
	 * weekly구독여부
	 */
	@ApiModelProperty(
		name = "weeklyAgrYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("weeklyAgrYn")
	@BxmOmm_Field(length=1, decimal=0, description="weekly구독여부", align="left", fill="")
	private String weeklyAgrYn= "";
	
	
	/**
	 * monthly구독여부
	 */
	@ApiModelProperty(
		name = "monthlyAgrYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("monthlyAgrYn")
	@BxmOmm_Field(length=1, decimal=0, description="monthly구독여부", align="left", fill="")
	private String monthlyAgrYn= "";
	
	
	/**
	 * issue구독여부
	 */
	@ApiModelProperty(
		name = "issueAgrYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("issueAgrYn")
	@BxmOmm_Field(length=1, decimal=0, description="issue구독여부", align="left", fill="")
	private String issueAgrYn= "";
	
	
	/**
	 * 9시브리핑동의여부
	 */
	@ApiModelProperty(
		name = "tim9brfAgrYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("tim9brfAgrYn")
	@BxmOmm_Field(length=1, decimal=0, description="9시브리핑동의여부", align="left", fill="")
	private String tim9brfAgrYn= "";
	
	
	/**
	 * 우리WON인증알림동의여부
	 */
	@ApiModelProperty(
		name = "wctfcNtfcAgrYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("wctfcNtfcAgrYn")
	@BxmOmm_Field(length=1, decimal=0, description="우리WON인증알림동의여부", align="left", fill="")
	private String wctfcNtfcAgrYn= "";
	
	
	/**
	 * 마케팅동의여부_1
	 */
	@ApiModelProperty(
		name = "mrktAgrYn1"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("mrktAgrYn1")
	@BxmOmm_Field(length=1, decimal=0, description="마케팅동의여부_1", align="left", fill="")
	private String mrktAgrYn1= "";
	
	
	/**
	 * SMS마케팅동의여부_1
	 */
	@ApiModelProperty(
		name = "smsMrktAgrYn1"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("smsMrktAgrYn1")
	@BxmOmm_Field(length=1, decimal=0, description="SMS마케팅동의여부_1", align="left", fill="")
	private String smsMrktAgrYn1= "";
	
	
	/**
	 * 기타설정구분
	 */
	@ApiModelProperty(
		name = "etcEstDis"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("etcEstDis")
	@BxmOmm_Field(length=200, decimal=0, description="기타설정구분", align="left", fill="")
	private String etcEstDis= "";
	
	
	/**
	 * 이벤트구분번호
	 */
	@ApiModelProperty(
		name = "evtDis"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("evtDis")
	@BxmOmm_Field(length=2, decimal=0, description="이벤트구분번호", align="left", fill="")
	private String evtDis= "";
	
	
	/**
	 * 비로그인동의여부
	 */
	@ApiModelProperty(
		name = "nlginAgrYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("nlginAgrYn")
	@BxmOmm_Field(length=1, decimal=0, description="비로그인동의여부", align="left", fill="")
	private String nlginAgrYn= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dpidTrtXprNtfcAgrYn= false;
	protected final boolean isSet_dpidTrtXprNtfcAgrYn(){
		return this.isSet_dpidTrtXprNtfcAgrYn;
	}
	private void setIsSet_dpidTrtXprNtfcAgrYn(boolean value){
		this.isSet_dpidTrtXprNtfcAgrYn= value;
	}
	/**
	 * 예적금신탁만기알림동의여부
	 */
	@XmlTransient
	public String getDpidTrtXprNtfcAgrYn(){
		return this.dpidTrtXprNtfcAgrYn;
	}
	
	/**
	 * 예적금신탁만기알림동의여부
	 * 
	 * @param dpidTrtXprNtfcAgrYn 예적금신탁만기알림동의여부
	 */
	public void setDpidTrtXprNtfcAgrYn(String dpidTrtXprNtfcAgrYn){
		this.dpidTrtXprNtfcAgrYn= dpidTrtXprNtfcAgrYn;
		this.setIsSet_dpidTrtXprNtfcAgrYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_fnsXprNtfcAgrYn= false;
	protected final boolean isSet_fnsXprNtfcAgrYn(){
		return this.isSet_fnsXprNtfcAgrYn;
	}
	private void setIsSet_fnsXprNtfcAgrYn(boolean value){
		this.isSet_fnsXprNtfcAgrYn= value;
	}
	/**
	 * 펀드만기알림동의여부
	 */
	@XmlTransient
	public String getFnsXprNtfcAgrYn(){
		return this.fnsXprNtfcAgrYn;
	}
	
	/**
	 * 펀드만기알림동의여부
	 * 
	 * @param fnsXprNtfcAgrYn 펀드만기알림동의여부
	 */
	public void setFnsXprNtfcAgrYn(String fnsXprNtfcAgrYn){
		this.fnsXprNtfcAgrYn= fnsXprNtfcAgrYn;
		this.setIsSet_fnsXprNtfcAgrYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_lnXprNtfcAgrYn= false;
	protected final boolean isSet_lnXprNtfcAgrYn(){
		return this.isSet_lnXprNtfcAgrYn;
	}
	private void setIsSet_lnXprNtfcAgrYn(boolean value){
		this.isSet_lnXprNtfcAgrYn= value;
	}
	/**
	 * 대출만기알림동의여부
	 */
	@XmlTransient
	public String getLnXprNtfcAgrYn(){
		return this.lnXprNtfcAgrYn;
	}
	
	/**
	 * 대출만기알림동의여부
	 * 
	 * @param lnXprNtfcAgrYn 대출만기알림동의여부
	 */
	public void setLnXprNtfcAgrYn(String lnXprNtfcAgrYn){
		this.lnXprNtfcAgrYn= lnXprNtfcAgrYn;
		this.setIsSet_lnXprNtfcAgrYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_lnintPidNtfcAgrYn= false;
	protected final boolean isSet_lnintPidNtfcAgrYn(){
		return this.isSet_lnintPidNtfcAgrYn;
	}
	private void setIsSet_lnintPidNtfcAgrYn(boolean value){
		this.isSet_lnintPidNtfcAgrYn= value;
	}
	/**
	 * 대출이자납입알림동의여부
	 */
	@XmlTransient
	public String getLnintPidNtfcAgrYn(){
		return this.lnintPidNtfcAgrYn;
	}
	
	/**
	 * 대출이자납입알림동의여부
	 * 
	 * @param lnintPidNtfcAgrYn 대출이자납입알림동의여부
	 */
	public void setLnintPidNtfcAgrYn(String lnintPidNtfcAgrYn){
		this.lnintPidNtfcAgrYn= lnintPidNtfcAgrYn;
		this.setIsSet_lnintPidNtfcAgrYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atsXprNtfcAgrYn= false;
	protected final boolean isSet_atsXprNtfcAgrYn(){
		return this.isSet_atsXprNtfcAgrYn;
	}
	private void setIsSet_atsXprNtfcAgrYn(boolean value){
		this.isSet_atsXprNtfcAgrYn= value;
	}
	/**
	 * 자동이체만기알림동의여부
	 */
	@XmlTransient
	public String getAtsXprNtfcAgrYn(){
		return this.atsXprNtfcAgrYn;
	}
	
	/**
	 * 자동이체만기알림동의여부
	 * 
	 * @param atsXprNtfcAgrYn 자동이체만기알림동의여부
	 */
	public void setAtsXprNtfcAgrYn(String atsXprNtfcAgrYn){
		this.atsXprNtfcAgrYn= atsXprNtfcAgrYn;
		this.setIsSet_atsXprNtfcAgrYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_eltUndasPrNtfcAgrYn= false;
	protected final boolean isSet_eltUndasPrNtfcAgrYn(){
		return this.isSet_eltUndasPrNtfcAgrYn;
	}
	private void setIsSet_eltUndasPrNtfcAgrYn(boolean value){
		this.isSet_eltUndasPrNtfcAgrYn= value;
	}
	/**
	 * ELT기초자산가격알림동의여부
	 */
	@XmlTransient
	public String getEltUndasPrNtfcAgrYn(){
		return this.eltUndasPrNtfcAgrYn;
	}
	
	/**
	 * ELT기초자산가격알림동의여부
	 * 
	 * @param eltUndasPrNtfcAgrYn ELT기초자산가격알림동의여부
	 */
	public void setEltUndasPrNtfcAgrYn(String eltUndasPrNtfcAgrYn){
		this.eltUndasPrNtfcAgrYn= eltUndasPrNtfcAgrYn;
		this.setIsSet_eltUndasPrNtfcAgrYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_sltMndNtfcAgrYn= false;
	protected final boolean isSet_sltMndNtfcAgrYn(){
		return this.isSet_sltMndNtfcAgrYn;
	}
	private void setIsSet_sltMndNtfcAgrYn(boolean value){
		this.isSet_sltMndNtfcAgrYn= value;
	}
	/**
	 * 기타알림동의여부
	 */
	@XmlTransient
	public String getSltMndNtfcAgrYn(){
		return this.sltMndNtfcAgrYn;
	}
	
	/**
	 * 기타알림동의여부
	 * 
	 * @param sltMndNtfcAgrYn 기타알림동의여부
	 */
	public void setSltMndNtfcAgrYn(String sltMndNtfcAgrYn){
		this.sltMndNtfcAgrYn= sltMndNtfcAgrYn;
		this.setIsSet_sltMndNtfcAgrYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_xprNtfcIdx= false;
	protected final boolean isSet_xprNtfcIdx(){
		return this.isSet_xprNtfcIdx;
	}
	private void setIsSet_xprNtfcIdx(boolean value){
		this.isSet_xprNtfcIdx= value;
	}
	/**
	 * 만기여부인덱스
	 */
	@XmlTransient
	public Integer getXprNtfcIdx(){
		return this.xprNtfcIdx;
	}
	
	/**
	 * 만기여부인덱스
	 * 
	 * @param xprNtfcIdx 만기여부인덱스
	 */
	public void setXprNtfcIdx(Integer xprNtfcIdx){
		this.xprNtfcIdx= xprNtfcIdx;
		this.setIsSet_xprNtfcIdx(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dayilyAgrYn= false;
	protected final boolean isSet_dayilyAgrYn(){
		return this.isSet_dayilyAgrYn;
	}
	private void setIsSet_dayilyAgrYn(boolean value){
		this.isSet_dayilyAgrYn= value;
	}
	/**
	 * dayily구독여부
	 */
	@XmlTransient
	public String getDayilyAgrYn(){
		return this.dayilyAgrYn;
	}
	
	/**
	 * dayily구독여부
	 * 
	 * @param dayilyAgrYn dayily구독여부
	 */
	public void setDayilyAgrYn(String dayilyAgrYn){
		this.dayilyAgrYn= dayilyAgrYn;
		this.setIsSet_dayilyAgrYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_weeklyAgrYn= false;
	protected final boolean isSet_weeklyAgrYn(){
		return this.isSet_weeklyAgrYn;
	}
	private void setIsSet_weeklyAgrYn(boolean value){
		this.isSet_weeklyAgrYn= value;
	}
	/**
	 * weekly구독여부
	 */
	@XmlTransient
	public String getWeeklyAgrYn(){
		return this.weeklyAgrYn;
	}
	
	/**
	 * weekly구독여부
	 * 
	 * @param weeklyAgrYn weekly구독여부
	 */
	public void setWeeklyAgrYn(String weeklyAgrYn){
		this.weeklyAgrYn= weeklyAgrYn;
		this.setIsSet_weeklyAgrYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_monthlyAgrYn= false;
	protected final boolean isSet_monthlyAgrYn(){
		return this.isSet_monthlyAgrYn;
	}
	private void setIsSet_monthlyAgrYn(boolean value){
		this.isSet_monthlyAgrYn= value;
	}
	/**
	 * monthly구독여부
	 */
	@XmlTransient
	public String getMonthlyAgrYn(){
		return this.monthlyAgrYn;
	}
	
	/**
	 * monthly구독여부
	 * 
	 * @param monthlyAgrYn monthly구독여부
	 */
	public void setMonthlyAgrYn(String monthlyAgrYn){
		this.monthlyAgrYn= monthlyAgrYn;
		this.setIsSet_monthlyAgrYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_issueAgrYn= false;
	protected final boolean isSet_issueAgrYn(){
		return this.isSet_issueAgrYn;
	}
	private void setIsSet_issueAgrYn(boolean value){
		this.isSet_issueAgrYn= value;
	}
	/**
	 * issue구독여부
	 */
	@XmlTransient
	public String getIssueAgrYn(){
		return this.issueAgrYn;
	}
	
	/**
	 * issue구독여부
	 * 
	 * @param issueAgrYn issue구독여부
	 */
	public void setIssueAgrYn(String issueAgrYn){
		this.issueAgrYn= issueAgrYn;
		this.setIsSet_issueAgrYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_tim9brfAgrYn= false;
	protected final boolean isSet_tim9brfAgrYn(){
		return this.isSet_tim9brfAgrYn;
	}
	private void setIsSet_tim9brfAgrYn(boolean value){
		this.isSet_tim9brfAgrYn= value;
	}
	/**
	 * 9시브리핑동의여부
	 */
	@XmlTransient
	public String getTim9brfAgrYn(){
		return this.tim9brfAgrYn;
	}
	
	/**
	 * 9시브리핑동의여부
	 * 
	 * @param tim9brfAgrYn 9시브리핑동의여부
	 */
	public void setTim9brfAgrYn(String tim9brfAgrYn){
		this.tim9brfAgrYn= tim9brfAgrYn;
		this.setIsSet_tim9brfAgrYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_wctfcNtfcAgrYn= false;
	protected final boolean isSet_wctfcNtfcAgrYn(){
		return this.isSet_wctfcNtfcAgrYn;
	}
	private void setIsSet_wctfcNtfcAgrYn(boolean value){
		this.isSet_wctfcNtfcAgrYn= value;
	}
	/**
	 * 우리WON인증알림동의여부
	 */
	@XmlTransient
	public String getWctfcNtfcAgrYn(){
		return this.wctfcNtfcAgrYn;
	}
	
	/**
	 * 우리WON인증알림동의여부
	 * 
	 * @param wctfcNtfcAgrYn 우리WON인증알림동의여부
	 */
	public void setWctfcNtfcAgrYn(String wctfcNtfcAgrYn){
		this.wctfcNtfcAgrYn= wctfcNtfcAgrYn;
		this.setIsSet_wctfcNtfcAgrYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mrktAgrYn1= false;
	protected final boolean isSet_mrktAgrYn1(){
		return this.isSet_mrktAgrYn1;
	}
	private void setIsSet_mrktAgrYn1(boolean value){
		this.isSet_mrktAgrYn1= value;
	}
	/**
	 * 마케팅동의여부_1
	 */
	@XmlTransient
	public String getMrktAgrYn1(){
		return this.mrktAgrYn1;
	}
	
	/**
	 * 마케팅동의여부_1
	 * 
	 * @param mrktAgrYn1 마케팅동의여부_1
	 */
	public void setMrktAgrYn1(String mrktAgrYn1){
		this.mrktAgrYn1= mrktAgrYn1;
		this.setIsSet_mrktAgrYn1(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_smsMrktAgrYn1= false;
	protected final boolean isSet_smsMrktAgrYn1(){
		return this.isSet_smsMrktAgrYn1;
	}
	private void setIsSet_smsMrktAgrYn1(boolean value){
		this.isSet_smsMrktAgrYn1= value;
	}
	/**
	 * SMS마케팅동의여부_1
	 */
	@XmlTransient
	public String getSmsMrktAgrYn1(){
		return this.smsMrktAgrYn1;
	}
	
	/**
	 * SMS마케팅동의여부_1
	 * 
	 * @param smsMrktAgrYn1 SMS마케팅동의여부_1
	 */
	public void setSmsMrktAgrYn1(String smsMrktAgrYn1){
		this.smsMrktAgrYn1= smsMrktAgrYn1;
		this.setIsSet_smsMrktAgrYn1(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_etcEstDis= false;
	protected final boolean isSet_etcEstDis(){
		return this.isSet_etcEstDis;
	}
	private void setIsSet_etcEstDis(boolean value){
		this.isSet_etcEstDis= value;
	}
	/**
	 * 기타설정구분
	 */
	@XmlTransient
	public String getEtcEstDis(){
		return this.etcEstDis;
	}
	
	/**
	 * 기타설정구분
	 * 
	 * @param etcEstDis 기타설정구분
	 */
	public void setEtcEstDis(String etcEstDis){
		this.etcEstDis= etcEstDis;
		this.setIsSet_etcEstDis(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_evtDis= false;
	protected final boolean isSet_evtDis(){
		return this.isSet_evtDis;
	}
	private void setIsSet_evtDis(boolean value){
		this.isSet_evtDis= value;
	}
	/**
	 * 이벤트구분번호
	 */
	@XmlTransient
	public String getEvtDis(){
		return this.evtDis;
	}
	
	/**
	 * 이벤트구분번호
	 * 
	 * @param evtDis 이벤트구분번호
	 */
	public void setEvtDis(String evtDis){
		this.evtDis= evtDis;
		this.setIsSet_evtDis(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_nlginAgrYn= false;
	protected final boolean isSet_nlginAgrYn(){
		return this.isSet_nlginAgrYn;
	}
	private void setIsSet_nlginAgrYn(boolean value){
		this.isSet_nlginAgrYn= value;
	}
	/**
	 * 비로그인동의여부
	 */
	@XmlTransient
	public String getNlginAgrYn(){
		return this.nlginAgrYn;
	}
	
	/**
	 * 비로그인동의여부
	 * 
	 * @param nlginAgrYn 비로그인동의여부
	 */
	public void setNlginAgrYn(String nlginAgrYn){
		this.nlginAgrYn= nlginAgrYn;
		this.setIsSet_nlginAgrYn(true);
	}
				
	@Override
	public INBNtfbxPushEtcEstUpdateEtcNtfcAgrYn_IDT clone(){
		try{
			INBNtfbxPushEtcEstUpdateEtcNtfcAgrYn_IDT object= (INBNtfbxPushEtcEstUpdateEtcNtfcAgrYn_IDT)super.clone();
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
		
		result= prime * result + ((this.dpidTrtXprNtfcAgrYn==null)?0:this.dpidTrtXprNtfcAgrYn.hashCode());
		result= prime * result + ((this.fnsXprNtfcAgrYn==null)?0:this.fnsXprNtfcAgrYn.hashCode());
		result= prime * result + ((this.lnXprNtfcAgrYn==null)?0:this.lnXprNtfcAgrYn.hashCode());
		result= prime * result + ((this.lnintPidNtfcAgrYn==null)?0:this.lnintPidNtfcAgrYn.hashCode());
		result= prime * result + ((this.atsXprNtfcAgrYn==null)?0:this.atsXprNtfcAgrYn.hashCode());
		result= prime * result + ((this.eltUndasPrNtfcAgrYn==null)?0:this.eltUndasPrNtfcAgrYn.hashCode());
		result= prime * result + ((this.sltMndNtfcAgrYn==null)?0:this.sltMndNtfcAgrYn.hashCode());
		result= prime * result + ((this.xprNtfcIdx==null)?0:this.xprNtfcIdx.hashCode());
		result= prime * result + ((this.dayilyAgrYn==null)?0:this.dayilyAgrYn.hashCode());
		result= prime * result + ((this.weeklyAgrYn==null)?0:this.weeklyAgrYn.hashCode());
		result= prime * result + ((this.monthlyAgrYn==null)?0:this.monthlyAgrYn.hashCode());
		result= prime * result + ((this.issueAgrYn==null)?0:this.issueAgrYn.hashCode());
		result= prime * result + ((this.tim9brfAgrYn==null)?0:this.tim9brfAgrYn.hashCode());
		result= prime * result + ((this.wctfcNtfcAgrYn==null)?0:this.wctfcNtfcAgrYn.hashCode());
		result= prime * result + ((this.mrktAgrYn1==null)?0:this.mrktAgrYn1.hashCode());
		result= prime * result + ((this.smsMrktAgrYn1==null)?0:this.smsMrktAgrYn1.hashCode());
		result= prime * result + ((this.etcEstDis==null)?0:this.etcEstDis.hashCode());
		result= prime * result + ((this.evtDis==null)?0:this.evtDis.hashCode());
		result= prime * result + ((this.nlginAgrYn==null)?0:this.nlginAgrYn.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final INBNtfbxPushEtcEstUpdateEtcNtfcAgrYn_IDT other= (INBNtfbxPushEtcEstUpdateEtcNtfcAgrYn_IDT)obj;
		{
			Object _dpidTrtXprNtfcAgrYn= getDpidTrtXprNtfcAgrYn();
			Object __dpidTrtXprNtfcAgrYn= other.getDpidTrtXprNtfcAgrYn();
			if ( _dpidTrtXprNtfcAgrYn== null ) { if ( __dpidTrtXprNtfcAgrYn!= null ) return false; }
			else if ( !_dpidTrtXprNtfcAgrYn.equals(__dpidTrtXprNtfcAgrYn) ) return false;
		}
		{
			Object _fnsXprNtfcAgrYn= getFnsXprNtfcAgrYn();
			Object __fnsXprNtfcAgrYn= other.getFnsXprNtfcAgrYn();
			if ( _fnsXprNtfcAgrYn== null ) { if ( __fnsXprNtfcAgrYn!= null ) return false; }
			else if ( !_fnsXprNtfcAgrYn.equals(__fnsXprNtfcAgrYn) ) return false;
		}
		{
			Object _lnXprNtfcAgrYn= getLnXprNtfcAgrYn();
			Object __lnXprNtfcAgrYn= other.getLnXprNtfcAgrYn();
			if ( _lnXprNtfcAgrYn== null ) { if ( __lnXprNtfcAgrYn!= null ) return false; }
			else if ( !_lnXprNtfcAgrYn.equals(__lnXprNtfcAgrYn) ) return false;
		}
		{
			Object _lnintPidNtfcAgrYn= getLnintPidNtfcAgrYn();
			Object __lnintPidNtfcAgrYn= other.getLnintPidNtfcAgrYn();
			if ( _lnintPidNtfcAgrYn== null ) { if ( __lnintPidNtfcAgrYn!= null ) return false; }
			else if ( !_lnintPidNtfcAgrYn.equals(__lnintPidNtfcAgrYn) ) return false;
		}
		{
			Object _atsXprNtfcAgrYn= getAtsXprNtfcAgrYn();
			Object __atsXprNtfcAgrYn= other.getAtsXprNtfcAgrYn();
			if ( _atsXprNtfcAgrYn== null ) { if ( __atsXprNtfcAgrYn!= null ) return false; }
			else if ( !_atsXprNtfcAgrYn.equals(__atsXprNtfcAgrYn) ) return false;
		}
		{
			Object _eltUndasPrNtfcAgrYn= getEltUndasPrNtfcAgrYn();
			Object __eltUndasPrNtfcAgrYn= other.getEltUndasPrNtfcAgrYn();
			if ( _eltUndasPrNtfcAgrYn== null ) { if ( __eltUndasPrNtfcAgrYn!= null ) return false; }
			else if ( !_eltUndasPrNtfcAgrYn.equals(__eltUndasPrNtfcAgrYn) ) return false;
		}
		{
			Object _sltMndNtfcAgrYn= getSltMndNtfcAgrYn();
			Object __sltMndNtfcAgrYn= other.getSltMndNtfcAgrYn();
			if ( _sltMndNtfcAgrYn== null ) { if ( __sltMndNtfcAgrYn!= null ) return false; }
			else if ( !_sltMndNtfcAgrYn.equals(__sltMndNtfcAgrYn) ) return false;
		}
		{
			Object _xprNtfcIdx= getXprNtfcIdx();
			Object __xprNtfcIdx= other.getXprNtfcIdx();
			if ( _xprNtfcIdx== null ) { if ( __xprNtfcIdx!= null ) return false; }
			else if ( !_xprNtfcIdx.equals(__xprNtfcIdx) ) return false;
		}
		{
			Object _dayilyAgrYn= getDayilyAgrYn();
			Object __dayilyAgrYn= other.getDayilyAgrYn();
			if ( _dayilyAgrYn== null ) { if ( __dayilyAgrYn!= null ) return false; }
			else if ( !_dayilyAgrYn.equals(__dayilyAgrYn) ) return false;
		}
		{
			Object _weeklyAgrYn= getWeeklyAgrYn();
			Object __weeklyAgrYn= other.getWeeklyAgrYn();
			if ( _weeklyAgrYn== null ) { if ( __weeklyAgrYn!= null ) return false; }
			else if ( !_weeklyAgrYn.equals(__weeklyAgrYn) ) return false;
		}
		{
			Object _monthlyAgrYn= getMonthlyAgrYn();
			Object __monthlyAgrYn= other.getMonthlyAgrYn();
			if ( _monthlyAgrYn== null ) { if ( __monthlyAgrYn!= null ) return false; }
			else if ( !_monthlyAgrYn.equals(__monthlyAgrYn) ) return false;
		}
		{
			Object _issueAgrYn= getIssueAgrYn();
			Object __issueAgrYn= other.getIssueAgrYn();
			if ( _issueAgrYn== null ) { if ( __issueAgrYn!= null ) return false; }
			else if ( !_issueAgrYn.equals(__issueAgrYn) ) return false;
		}
		{
			Object _tim9brfAgrYn= getTim9brfAgrYn();
			Object __tim9brfAgrYn= other.getTim9brfAgrYn();
			if ( _tim9brfAgrYn== null ) { if ( __tim9brfAgrYn!= null ) return false; }
			else if ( !_tim9brfAgrYn.equals(__tim9brfAgrYn) ) return false;
		}
		{
			Object _wctfcNtfcAgrYn= getWctfcNtfcAgrYn();
			Object __wctfcNtfcAgrYn= other.getWctfcNtfcAgrYn();
			if ( _wctfcNtfcAgrYn== null ) { if ( __wctfcNtfcAgrYn!= null ) return false; }
			else if ( !_wctfcNtfcAgrYn.equals(__wctfcNtfcAgrYn) ) return false;
		}
		{
			Object _mrktAgrYn1= getMrktAgrYn1();
			Object __mrktAgrYn1= other.getMrktAgrYn1();
			if ( _mrktAgrYn1== null ) { if ( __mrktAgrYn1!= null ) return false; }
			else if ( !_mrktAgrYn1.equals(__mrktAgrYn1) ) return false;
		}
		{
			Object _smsMrktAgrYn1= getSmsMrktAgrYn1();
			Object __smsMrktAgrYn1= other.getSmsMrktAgrYn1();
			if ( _smsMrktAgrYn1== null ) { if ( __smsMrktAgrYn1!= null ) return false; }
			else if ( !_smsMrktAgrYn1.equals(__smsMrktAgrYn1) ) return false;
		}
		{
			Object _etcEstDis= getEtcEstDis();
			Object __etcEstDis= other.getEtcEstDis();
			if ( _etcEstDis== null ) { if ( __etcEstDis!= null ) return false; }
			else if ( !_etcEstDis.equals(__etcEstDis) ) return false;
		}
		{
			Object _evtDis= getEvtDis();
			Object __evtDis= other.getEvtDis();
			if ( _evtDis== null ) { if ( __evtDis!= null ) return false; }
			else if ( !_evtDis.equals(__evtDis) ) return false;
		}
		{
			Object _nlginAgrYn= getNlginAgrYn();
			Object __nlginAgrYn= other.getNlginAgrYn();
			if ( _nlginAgrYn== null ) { if ( __nlginAgrYn!= null ) return false; }
			else if ( !_nlginAgrYn.equals(__nlginAgrYn) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(INBNtfbxPushEtcEstUpdateEtcNtfcAgrYn_IDT.class.getName()).append(":\n");
		sb.append("\tdpidTrtXprNtfcAgrYn: ");
		sb.append(dpidTrtXprNtfcAgrYn==null?"null":getDpidTrtXprNtfcAgrYn());
		sb.append("\n");
		sb.append("\tfnsXprNtfcAgrYn: ");
		sb.append(fnsXprNtfcAgrYn==null?"null":getFnsXprNtfcAgrYn());
		sb.append("\n");
		sb.append("\tlnXprNtfcAgrYn: ");
		sb.append(lnXprNtfcAgrYn==null?"null":getLnXprNtfcAgrYn());
		sb.append("\n");
		sb.append("\tlnintPidNtfcAgrYn: ");
		sb.append(lnintPidNtfcAgrYn==null?"null":getLnintPidNtfcAgrYn());
		sb.append("\n");
		sb.append("\tatsXprNtfcAgrYn: ");
		sb.append(atsXprNtfcAgrYn==null?"null":getAtsXprNtfcAgrYn());
		sb.append("\n");
		sb.append("\teltUndasPrNtfcAgrYn: ");
		sb.append(eltUndasPrNtfcAgrYn==null?"null":getEltUndasPrNtfcAgrYn());
		sb.append("\n");
		sb.append("\tsltMndNtfcAgrYn: ");
		sb.append(sltMndNtfcAgrYn==null?"null":getSltMndNtfcAgrYn());
		sb.append("\n");
		sb.append("\txprNtfcIdx: ");
		sb.append(xprNtfcIdx==null?"null":getXprNtfcIdx());
		sb.append("\n");
		sb.append("\tdayilyAgrYn: ");
		sb.append(dayilyAgrYn==null?"null":getDayilyAgrYn());
		sb.append("\n");
		sb.append("\tweeklyAgrYn: ");
		sb.append(weeklyAgrYn==null?"null":getWeeklyAgrYn());
		sb.append("\n");
		sb.append("\tmonthlyAgrYn: ");
		sb.append(monthlyAgrYn==null?"null":getMonthlyAgrYn());
		sb.append("\n");
		sb.append("\tissueAgrYn: ");
		sb.append(issueAgrYn==null?"null":getIssueAgrYn());
		sb.append("\n");
		sb.append("\ttim9brfAgrYn: ");
		sb.append(tim9brfAgrYn==null?"null":getTim9brfAgrYn());
		sb.append("\n");
		sb.append("\twctfcNtfcAgrYn: ");
		sb.append(wctfcNtfcAgrYn==null?"null":getWctfcNtfcAgrYn());
		sb.append("\n");
		sb.append("\tmrktAgrYn1: ");
		sb.append(mrktAgrYn1==null?"null":getMrktAgrYn1());
		sb.append("\n");
		sb.append("\tsmsMrktAgrYn1: ");
		sb.append(smsMrktAgrYn1==null?"null":getSmsMrktAgrYn1());
		sb.append("\n");
		sb.append("\tetcEstDis: ");
		sb.append(etcEstDis==null?"null":getEtcEstDis());
		sb.append("\n");
		sb.append("\tevtDis: ");
		sb.append(evtDis==null?"null":getEvtDis());
		sb.append("\n");
		sb.append("\tnlginAgrYn: ");
		sb.append(nlginAgrYn==null?"null":getNlginAgrYn());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 1; /* dpidTrtXprNtfcAgrYn */
		messageLen+= 1; /* fnsXprNtfcAgrYn */
		messageLen+= 1; /* lnXprNtfcAgrYn */
		messageLen+= 1; /* lnintPidNtfcAgrYn */
		messageLen+= 1; /* atsXprNtfcAgrYn */
		messageLen+= 1; /* eltUndasPrNtfcAgrYn */
		messageLen+= 1; /* sltMndNtfcAgrYn */
		messageLen+= 1; /* xprNtfcIdx */
		messageLen+= 1; /* dayilyAgrYn */
		messageLen+= 1; /* weeklyAgrYn */
		messageLen+= 1; /* monthlyAgrYn */
		messageLen+= 1; /* issueAgrYn */
		messageLen+= 1; /* tim9brfAgrYn */
		messageLen+= 1; /* wctfcNtfcAgrYn */
		messageLen+= 1; /* mrktAgrYn1 */
		messageLen+= 1; /* smsMrktAgrYn1 */
		messageLen+= 200; /* etcEstDis */
		messageLen+= 2; /* evtDis */
		messageLen+= 1; /* nlginAgrYn */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("dpidTrtXprNtfcAgrYn");
		list.add("fnsXprNtfcAgrYn");
		list.add("lnXprNtfcAgrYn");
		list.add("lnintPidNtfcAgrYn");
		list.add("atsXprNtfcAgrYn");
		list.add("eltUndasPrNtfcAgrYn");
		list.add("sltMndNtfcAgrYn");
		list.add("xprNtfcIdx");
		list.add("dayilyAgrYn");
		list.add("weeklyAgrYn");
		list.add("monthlyAgrYn");
		list.add("issueAgrYn");
		list.add("tim9brfAgrYn");
		list.add("wctfcNtfcAgrYn");
		list.add("mrktAgrYn1");
		list.add("smsMrktAgrYn1");
		list.add("etcEstDis");
		list.add("evtDis");
		list.add("nlginAgrYn");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("dpidTrtXprNtfcAgrYn", get("dpidTrtXprNtfcAgrYn"));
		map.put("fnsXprNtfcAgrYn", get("fnsXprNtfcAgrYn"));
		map.put("lnXprNtfcAgrYn", get("lnXprNtfcAgrYn"));
		map.put("lnintPidNtfcAgrYn", get("lnintPidNtfcAgrYn"));
		map.put("atsXprNtfcAgrYn", get("atsXprNtfcAgrYn"));
		map.put("eltUndasPrNtfcAgrYn", get("eltUndasPrNtfcAgrYn"));
		map.put("sltMndNtfcAgrYn", get("sltMndNtfcAgrYn"));
		map.put("xprNtfcIdx", get("xprNtfcIdx"));
		map.put("dayilyAgrYn", get("dayilyAgrYn"));
		map.put("weeklyAgrYn", get("weeklyAgrYn"));
		map.put("monthlyAgrYn", get("monthlyAgrYn"));
		map.put("issueAgrYn", get("issueAgrYn"));
		map.put("tim9brfAgrYn", get("tim9brfAgrYn"));
		map.put("wctfcNtfcAgrYn", get("wctfcNtfcAgrYn"));
		map.put("mrktAgrYn1", get("mrktAgrYn1"));
		map.put("smsMrktAgrYn1", get("smsMrktAgrYn1"));
		map.put("etcEstDis", get("etcEstDis"));
		map.put("evtDis", get("evtDis"));
		map.put("nlginAgrYn", get("nlginAgrYn"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 1045358035:/* dpidTrtXprNtfcAgrYn */
			return getDpidTrtXprNtfcAgrYn();
		case -1866835217:/* fnsXprNtfcAgrYn */
			return getFnsXprNtfcAgrYn();
		case 1459835206:/* lnXprNtfcAgrYn */
			return getLnXprNtfcAgrYn();
		case -715890560:/* lnintPidNtfcAgrYn */
			return getLnintPidNtfcAgrYn();
		case 446955876:/* atsXprNtfcAgrYn */
			return getAtsXprNtfcAgrYn();
		case 2131143244:/* eltUndasPrNtfcAgrYn */
			return getEltUndasPrNtfcAgrYn();
		case 1899397942:/* sltMndNtfcAgrYn */
			return getSltMndNtfcAgrYn();
		case -1937292064:/* xprNtfcIdx */
			return getXprNtfcIdx();
		case -1942129977:/* dayilyAgrYn */
			return getDayilyAgrYn();
		case -1530517184:/* weeklyAgrYn */
			return getWeeklyAgrYn();
		case 1396175156:/* monthlyAgrYn */
			return getMonthlyAgrYn();
		case 1415280616:/* issueAgrYn */
			return getIssueAgrYn();
		case -1722121620:/* tim9brfAgrYn */
			return getTim9brfAgrYn();
		case -2112148071:/* wctfcNtfcAgrYn */
			return getWctfcNtfcAgrYn();
		case -503654786:/* mrktAgrYn1 */
			return getMrktAgrYn1();
		case -1492626249:/* smsMrktAgrYn1 */
			return getSmsMrktAgrYn1();
		case -2108046372:/* etcEstDis */
			return getEtcEstDis();
		case -1290923093:/* evtDis */
			return getEvtDis();
		case -1041342317:/* nlginAgrYn */
			return getNlginAgrYn();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 1045358035:/* dpidTrtXprNtfcAgrYn */
			setDpidTrtXprNtfcAgrYn((String)value);
			break;
		case -1866835217:/* fnsXprNtfcAgrYn */
			setFnsXprNtfcAgrYn((String)value);
			break;
		case 1459835206:/* lnXprNtfcAgrYn */
			setLnXprNtfcAgrYn((String)value);
			break;
		case -715890560:/* lnintPidNtfcAgrYn */
			setLnintPidNtfcAgrYn((String)value);
			break;
		case 446955876:/* atsXprNtfcAgrYn */
			setAtsXprNtfcAgrYn((String)value);
			break;
		case 2131143244:/* eltUndasPrNtfcAgrYn */
			setEltUndasPrNtfcAgrYn((String)value);
			break;
		case 1899397942:/* sltMndNtfcAgrYn */
			setSltMndNtfcAgrYn((String)value);
			break;
		case -1937292064:/* xprNtfcIdx */
			setXprNtfcIdx((Integer)value);
			break;
		case -1942129977:/* dayilyAgrYn */
			setDayilyAgrYn((String)value);
			break;
		case -1530517184:/* weeklyAgrYn */
			setWeeklyAgrYn((String)value);
			break;
		case 1396175156:/* monthlyAgrYn */
			setMonthlyAgrYn((String)value);
			break;
		case 1415280616:/* issueAgrYn */
			setIssueAgrYn((String)value);
			break;
		case -1722121620:/* tim9brfAgrYn */
			setTim9brfAgrYn((String)value);
			break;
		case -2112148071:/* wctfcNtfcAgrYn */
			setWctfcNtfcAgrYn((String)value);
			break;
		case -503654786:/* mrktAgrYn1 */
			setMrktAgrYn1((String)value);
			break;
		case -1492626249:/* smsMrktAgrYn1 */
			setSmsMrktAgrYn1((String)value);
			break;
		case -2108046372:/* etcEstDis */
			setEtcEstDis((String)value);
			break;
		case -1290923093:/* evtDis */
			setEvtDis((String)value);
			break;
		case -1041342317:/* nlginAgrYn */
			setNlginAgrYn((String)value);
			break;
		default:
			break;
		}
	}
	
}
