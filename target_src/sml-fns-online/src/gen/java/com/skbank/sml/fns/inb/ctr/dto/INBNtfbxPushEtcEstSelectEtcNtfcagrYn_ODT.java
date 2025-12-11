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
	"xrtNtcSrvcYn", "dgnNtfcSrvcYn", "useYn1", "useYn2", "useYn3", "useYn4", "useYn5", "useYn6", "usgYn99", "pushEtcNtfcRgsYn", "pushAppDscd", "tim9brfAgrYn", "wctfcNtfcAgrYn", "mrktAgrYn1", "smsMrktAgrYn1"
	, "dayilyAgrYn", "weeklyAgrYn", "monthlyAgrYn", "issueAgrYn"
}, name="INBNtfbxPushEtcEstSelectEtcNtfcagrYn_ODT")
@XmlRootElement(name="INBNtfbxPushEtcEstSelectEtcNtfcagrYn_ODT")
@BxmCategory(logicalName="기타알림.동의여부.컨트롤러.출력.IO", description="기타알림 동의 여부 컨트롤러 IO") 
public class INBNtfbxPushEtcEstSelectEtcNtfcagrYn_ODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 1800517160L;
	
	
	
	/**
	 * 환율통지서비스여부
	 */
	@ApiModelProperty(
		name = "xrtNtcSrvcYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("xrtNtcSrvcYn")
	@BxmOmm_Field(length=1, decimal=0, description="환율통지서비스여부", align="left", fill="")
	private String xrtNtcSrvcYn= "";
	
	
	/**
	 * 지정알림서비스여부
	 */
	@ApiModelProperty(
		name = "dgnNtfcSrvcYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dgnNtfcSrvcYn")
	@BxmOmm_Field(length=1, decimal=0, description="지정알림서비스여부", align="left", fill="")
	private String dgnNtfcSrvcYn= "";
	
	
	/**
	 * 사용여부_1
	 */
	@ApiModelProperty(
		name = "useYn1"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("useYn1")
	@BxmOmm_Field(length=1, decimal=0, description="사용여부_1", align="left", fill="")
	private String useYn1= "";
	
	
	/**
	 * 사용여부_2
	 */
	@ApiModelProperty(
		name = "useYn2"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("useYn2")
	@BxmOmm_Field(length=1, decimal=0, description="사용여부_2", align="left", fill="")
	private String useYn2= "";
	
	
	/**
	 * 사용여부_3
	 */
	@ApiModelProperty(
		name = "useYn3"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("useYn3")
	@BxmOmm_Field(length=1, decimal=0, description="사용여부_3", align="left", fill="")
	private String useYn3= "";
	
	
	/**
	 * 사용여부_4
	 */
	@ApiModelProperty(
		name = "useYn4"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("useYn4")
	@BxmOmm_Field(length=1, decimal=0, description="사용여부_4", align="left", fill="")
	private String useYn4= "";
	
	
	/**
	 * 사용여부_5
	 */
	@ApiModelProperty(
		name = "useYn5"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("useYn5")
	@BxmOmm_Field(length=1, decimal=0, description="사용여부_5", align="left", fill="")
	private String useYn5= "";
	
	
	/**
	 * 사용여부_6
	 */
	@ApiModelProperty(
		name = "useYn6"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("useYn6")
	@BxmOmm_Field(length=1, decimal=0, description="사용여부_6", align="left", fill="")
	private String useYn6= "";
	
	
	/**
	 * 사용여부_99
	 */
	@ApiModelProperty(
		name = "usgYn99"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("usgYn99")
	@BxmOmm_Field(length=1, decimal=0, description="사용여부_99", align="left", fill="")
	private String usgYn99= "";
	
	
	/**
	 * PUSH기타알림등록여부
	 */
	@ApiModelProperty(
		name = "pushEtcNtfcRgsYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("pushEtcNtfcRgsYn")
	@BxmOmm_Field(length=1, decimal=0, description="PUSH기타알림등록여부", align="left", fill="")
	private String pushEtcNtfcRgsYn= "";
	
	
	/**
	 * PUSH앱구분코드
	 */
	@ApiModelProperty(
		name = "pushAppDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("pushAppDscd")
	@BxmOmm_Field(length=2, decimal=0, description="PUSH앱구분코드", align="left", fill="")
	private String pushAppDscd= "";
	
	
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
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_xrtNtcSrvcYn= false;
	protected final boolean isSet_xrtNtcSrvcYn(){
		return this.isSet_xrtNtcSrvcYn;
	}
	private void setIsSet_xrtNtcSrvcYn(boolean value){
		this.isSet_xrtNtcSrvcYn= value;
	}
	/**
	 * 환율통지서비스여부
	 */
	@XmlTransient
	public String getXrtNtcSrvcYn(){
		return this.xrtNtcSrvcYn;
	}
	
	/**
	 * 환율통지서비스여부
	 * 
	 * @param xrtNtcSrvcYn 환율통지서비스여부
	 */
	public void setXrtNtcSrvcYn(String xrtNtcSrvcYn){
		this.xrtNtcSrvcYn= xrtNtcSrvcYn;
		this.setIsSet_xrtNtcSrvcYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dgnNtfcSrvcYn= false;
	protected final boolean isSet_dgnNtfcSrvcYn(){
		return this.isSet_dgnNtfcSrvcYn;
	}
	private void setIsSet_dgnNtfcSrvcYn(boolean value){
		this.isSet_dgnNtfcSrvcYn= value;
	}
	/**
	 * 지정알림서비스여부
	 */
	@XmlTransient
	public String getDgnNtfcSrvcYn(){
		return this.dgnNtfcSrvcYn;
	}
	
	/**
	 * 지정알림서비스여부
	 * 
	 * @param dgnNtfcSrvcYn 지정알림서비스여부
	 */
	public void setDgnNtfcSrvcYn(String dgnNtfcSrvcYn){
		this.dgnNtfcSrvcYn= dgnNtfcSrvcYn;
		this.setIsSet_dgnNtfcSrvcYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_useYn1= false;
	protected final boolean isSet_useYn1(){
		return this.isSet_useYn1;
	}
	private void setIsSet_useYn1(boolean value){
		this.isSet_useYn1= value;
	}
	/**
	 * 사용여부_1
	 */
	@XmlTransient
	public String getUseYn1(){
		return this.useYn1;
	}
	
	/**
	 * 사용여부_1
	 * 
	 * @param useYn1 사용여부_1
	 */
	public void setUseYn1(String useYn1){
		this.useYn1= useYn1;
		this.setIsSet_useYn1(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_useYn2= false;
	protected final boolean isSet_useYn2(){
		return this.isSet_useYn2;
	}
	private void setIsSet_useYn2(boolean value){
		this.isSet_useYn2= value;
	}
	/**
	 * 사용여부_2
	 */
	@XmlTransient
	public String getUseYn2(){
		return this.useYn2;
	}
	
	/**
	 * 사용여부_2
	 * 
	 * @param useYn2 사용여부_2
	 */
	public void setUseYn2(String useYn2){
		this.useYn2= useYn2;
		this.setIsSet_useYn2(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_useYn3= false;
	protected final boolean isSet_useYn3(){
		return this.isSet_useYn3;
	}
	private void setIsSet_useYn3(boolean value){
		this.isSet_useYn3= value;
	}
	/**
	 * 사용여부_3
	 */
	@XmlTransient
	public String getUseYn3(){
		return this.useYn3;
	}
	
	/**
	 * 사용여부_3
	 * 
	 * @param useYn3 사용여부_3
	 */
	public void setUseYn3(String useYn3){
		this.useYn3= useYn3;
		this.setIsSet_useYn3(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_useYn4= false;
	protected final boolean isSet_useYn4(){
		return this.isSet_useYn4;
	}
	private void setIsSet_useYn4(boolean value){
		this.isSet_useYn4= value;
	}
	/**
	 * 사용여부_4
	 */
	@XmlTransient
	public String getUseYn4(){
		return this.useYn4;
	}
	
	/**
	 * 사용여부_4
	 * 
	 * @param useYn4 사용여부_4
	 */
	public void setUseYn4(String useYn4){
		this.useYn4= useYn4;
		this.setIsSet_useYn4(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_useYn5= false;
	protected final boolean isSet_useYn5(){
		return this.isSet_useYn5;
	}
	private void setIsSet_useYn5(boolean value){
		this.isSet_useYn5= value;
	}
	/**
	 * 사용여부_5
	 */
	@XmlTransient
	public String getUseYn5(){
		return this.useYn5;
	}
	
	/**
	 * 사용여부_5
	 * 
	 * @param useYn5 사용여부_5
	 */
	public void setUseYn5(String useYn5){
		this.useYn5= useYn5;
		this.setIsSet_useYn5(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_useYn6= false;
	protected final boolean isSet_useYn6(){
		return this.isSet_useYn6;
	}
	private void setIsSet_useYn6(boolean value){
		this.isSet_useYn6= value;
	}
	/**
	 * 사용여부_6
	 */
	@XmlTransient
	public String getUseYn6(){
		return this.useYn6;
	}
	
	/**
	 * 사용여부_6
	 * 
	 * @param useYn6 사용여부_6
	 */
	public void setUseYn6(String useYn6){
		this.useYn6= useYn6;
		this.setIsSet_useYn6(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_usgYn99= false;
	protected final boolean isSet_usgYn99(){
		return this.isSet_usgYn99;
	}
	private void setIsSet_usgYn99(boolean value){
		this.isSet_usgYn99= value;
	}
	/**
	 * 사용여부_99
	 */
	@XmlTransient
	public String getUsgYn99(){
		return this.usgYn99;
	}
	
	/**
	 * 사용여부_99
	 * 
	 * @param usgYn99 사용여부_99
	 */
	public void setUsgYn99(String usgYn99){
		this.usgYn99= usgYn99;
		this.setIsSet_usgYn99(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pushEtcNtfcRgsYn= false;
	protected final boolean isSet_pushEtcNtfcRgsYn(){
		return this.isSet_pushEtcNtfcRgsYn;
	}
	private void setIsSet_pushEtcNtfcRgsYn(boolean value){
		this.isSet_pushEtcNtfcRgsYn= value;
	}
	/**
	 * PUSH기타알림등록여부
	 */
	@XmlTransient
	public String getPushEtcNtfcRgsYn(){
		return this.pushEtcNtfcRgsYn;
	}
	
	/**
	 * PUSH기타알림등록여부
	 * 
	 * @param pushEtcNtfcRgsYn PUSH기타알림등록여부
	 */
	public void setPushEtcNtfcRgsYn(String pushEtcNtfcRgsYn){
		this.pushEtcNtfcRgsYn= pushEtcNtfcRgsYn;
		this.setIsSet_pushEtcNtfcRgsYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pushAppDscd= false;
	protected final boolean isSet_pushAppDscd(){
		return this.isSet_pushAppDscd;
	}
	private void setIsSet_pushAppDscd(boolean value){
		this.isSet_pushAppDscd= value;
	}
	/**
	 * PUSH앱구분코드
	 */
	@XmlTransient
	public String getPushAppDscd(){
		return this.pushAppDscd;
	}
	
	/**
	 * PUSH앱구분코드
	 * 
	 * @param pushAppDscd PUSH앱구분코드
	 */
	public void setPushAppDscd(String pushAppDscd){
		this.pushAppDscd= pushAppDscd;
		this.setIsSet_pushAppDscd(true);
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
				
	@Override
	public INBNtfbxPushEtcEstSelectEtcNtfcagrYn_ODT clone(){
		try{
			INBNtfbxPushEtcEstSelectEtcNtfcagrYn_ODT object= (INBNtfbxPushEtcEstSelectEtcNtfcagrYn_ODT)super.clone();
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
		
		result= prime * result + ((this.xrtNtcSrvcYn==null)?0:this.xrtNtcSrvcYn.hashCode());
		result= prime * result + ((this.dgnNtfcSrvcYn==null)?0:this.dgnNtfcSrvcYn.hashCode());
		result= prime * result + ((this.useYn1==null)?0:this.useYn1.hashCode());
		result= prime * result + ((this.useYn2==null)?0:this.useYn2.hashCode());
		result= prime * result + ((this.useYn3==null)?0:this.useYn3.hashCode());
		result= prime * result + ((this.useYn4==null)?0:this.useYn4.hashCode());
		result= prime * result + ((this.useYn5==null)?0:this.useYn5.hashCode());
		result= prime * result + ((this.useYn6==null)?0:this.useYn6.hashCode());
		result= prime * result + ((this.usgYn99==null)?0:this.usgYn99.hashCode());
		result= prime * result + ((this.pushEtcNtfcRgsYn==null)?0:this.pushEtcNtfcRgsYn.hashCode());
		result= prime * result + ((this.pushAppDscd==null)?0:this.pushAppDscd.hashCode());
		result= prime * result + ((this.tim9brfAgrYn==null)?0:this.tim9brfAgrYn.hashCode());
		result= prime * result + ((this.wctfcNtfcAgrYn==null)?0:this.wctfcNtfcAgrYn.hashCode());
		result= prime * result + ((this.mrktAgrYn1==null)?0:this.mrktAgrYn1.hashCode());
		result= prime * result + ((this.smsMrktAgrYn1==null)?0:this.smsMrktAgrYn1.hashCode());
		result= prime * result + ((this.dayilyAgrYn==null)?0:this.dayilyAgrYn.hashCode());
		result= prime * result + ((this.weeklyAgrYn==null)?0:this.weeklyAgrYn.hashCode());
		result= prime * result + ((this.monthlyAgrYn==null)?0:this.monthlyAgrYn.hashCode());
		result= prime * result + ((this.issueAgrYn==null)?0:this.issueAgrYn.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final INBNtfbxPushEtcEstSelectEtcNtfcagrYn_ODT other= (INBNtfbxPushEtcEstSelectEtcNtfcagrYn_ODT)obj;
		{
			Object _xrtNtcSrvcYn= getXrtNtcSrvcYn();
			Object __xrtNtcSrvcYn= other.getXrtNtcSrvcYn();
			if ( _xrtNtcSrvcYn== null ) { if ( __xrtNtcSrvcYn!= null ) return false; }
			else if ( !_xrtNtcSrvcYn.equals(__xrtNtcSrvcYn) ) return false;
		}
		{
			Object _dgnNtfcSrvcYn= getDgnNtfcSrvcYn();
			Object __dgnNtfcSrvcYn= other.getDgnNtfcSrvcYn();
			if ( _dgnNtfcSrvcYn== null ) { if ( __dgnNtfcSrvcYn!= null ) return false; }
			else if ( !_dgnNtfcSrvcYn.equals(__dgnNtfcSrvcYn) ) return false;
		}
		{
			Object _useYn1= getUseYn1();
			Object __useYn1= other.getUseYn1();
			if ( _useYn1== null ) { if ( __useYn1!= null ) return false; }
			else if ( !_useYn1.equals(__useYn1) ) return false;
		}
		{
			Object _useYn2= getUseYn2();
			Object __useYn2= other.getUseYn2();
			if ( _useYn2== null ) { if ( __useYn2!= null ) return false; }
			else if ( !_useYn2.equals(__useYn2) ) return false;
		}
		{
			Object _useYn3= getUseYn3();
			Object __useYn3= other.getUseYn3();
			if ( _useYn3== null ) { if ( __useYn3!= null ) return false; }
			else if ( !_useYn3.equals(__useYn3) ) return false;
		}
		{
			Object _useYn4= getUseYn4();
			Object __useYn4= other.getUseYn4();
			if ( _useYn4== null ) { if ( __useYn4!= null ) return false; }
			else if ( !_useYn4.equals(__useYn4) ) return false;
		}
		{
			Object _useYn5= getUseYn5();
			Object __useYn5= other.getUseYn5();
			if ( _useYn5== null ) { if ( __useYn5!= null ) return false; }
			else if ( !_useYn5.equals(__useYn5) ) return false;
		}
		{
			Object _useYn6= getUseYn6();
			Object __useYn6= other.getUseYn6();
			if ( _useYn6== null ) { if ( __useYn6!= null ) return false; }
			else if ( !_useYn6.equals(__useYn6) ) return false;
		}
		{
			Object _usgYn99= getUsgYn99();
			Object __usgYn99= other.getUsgYn99();
			if ( _usgYn99== null ) { if ( __usgYn99!= null ) return false; }
			else if ( !_usgYn99.equals(__usgYn99) ) return false;
		}
		{
			Object _pushEtcNtfcRgsYn= getPushEtcNtfcRgsYn();
			Object __pushEtcNtfcRgsYn= other.getPushEtcNtfcRgsYn();
			if ( _pushEtcNtfcRgsYn== null ) { if ( __pushEtcNtfcRgsYn!= null ) return false; }
			else if ( !_pushEtcNtfcRgsYn.equals(__pushEtcNtfcRgsYn) ) return false;
		}
		{
			Object _pushAppDscd= getPushAppDscd();
			Object __pushAppDscd= other.getPushAppDscd();
			if ( _pushAppDscd== null ) { if ( __pushAppDscd!= null ) return false; }
			else if ( !_pushAppDscd.equals(__pushAppDscd) ) return false;
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
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(INBNtfbxPushEtcEstSelectEtcNtfcagrYn_ODT.class.getName()).append(":\n");
		sb.append("\txrtNtcSrvcYn: ");
		sb.append(xrtNtcSrvcYn==null?"null":getXrtNtcSrvcYn());
		sb.append("\n");
		sb.append("\tdgnNtfcSrvcYn: ");
		sb.append(dgnNtfcSrvcYn==null?"null":getDgnNtfcSrvcYn());
		sb.append("\n");
		sb.append("\tuseYn1: ");
		sb.append(useYn1==null?"null":getUseYn1());
		sb.append("\n");
		sb.append("\tuseYn2: ");
		sb.append(useYn2==null?"null":getUseYn2());
		sb.append("\n");
		sb.append("\tuseYn3: ");
		sb.append(useYn3==null?"null":getUseYn3());
		sb.append("\n");
		sb.append("\tuseYn4: ");
		sb.append(useYn4==null?"null":getUseYn4());
		sb.append("\n");
		sb.append("\tuseYn5: ");
		sb.append(useYn5==null?"null":getUseYn5());
		sb.append("\n");
		sb.append("\tuseYn6: ");
		sb.append(useYn6==null?"null":getUseYn6());
		sb.append("\n");
		sb.append("\tusgYn99: ");
		sb.append(usgYn99==null?"null":getUsgYn99());
		sb.append("\n");
		sb.append("\tpushEtcNtfcRgsYn: ");
		sb.append(pushEtcNtfcRgsYn==null?"null":getPushEtcNtfcRgsYn());
		sb.append("\n");
		sb.append("\tpushAppDscd: ");
		sb.append(pushAppDscd==null?"null":getPushAppDscd());
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
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 1; /* xrtNtcSrvcYn */
		messageLen+= 1; /* dgnNtfcSrvcYn */
		messageLen+= 1; /* useYn1 */
		messageLen+= 1; /* useYn2 */
		messageLen+= 1; /* useYn3 */
		messageLen+= 1; /* useYn4 */
		messageLen+= 1; /* useYn5 */
		messageLen+= 1; /* useYn6 */
		messageLen+= 1; /* usgYn99 */
		messageLen+= 1; /* pushEtcNtfcRgsYn */
		messageLen+= 2; /* pushAppDscd */
		messageLen+= 1; /* tim9brfAgrYn */
		messageLen+= 1; /* wctfcNtfcAgrYn */
		messageLen+= 1; /* mrktAgrYn1 */
		messageLen+= 1; /* smsMrktAgrYn1 */
		messageLen+= 1; /* dayilyAgrYn */
		messageLen+= 1; /* weeklyAgrYn */
		messageLen+= 1; /* monthlyAgrYn */
		messageLen+= 1; /* issueAgrYn */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("xrtNtcSrvcYn");
		list.add("dgnNtfcSrvcYn");
		list.add("useYn1");
		list.add("useYn2");
		list.add("useYn3");
		list.add("useYn4");
		list.add("useYn5");
		list.add("useYn6");
		list.add("usgYn99");
		list.add("pushEtcNtfcRgsYn");
		list.add("pushAppDscd");
		list.add("tim9brfAgrYn");
		list.add("wctfcNtfcAgrYn");
		list.add("mrktAgrYn1");
		list.add("smsMrktAgrYn1");
		list.add("dayilyAgrYn");
		list.add("weeklyAgrYn");
		list.add("monthlyAgrYn");
		list.add("issueAgrYn");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("xrtNtcSrvcYn", get("xrtNtcSrvcYn"));
		map.put("dgnNtfcSrvcYn", get("dgnNtfcSrvcYn"));
		map.put("useYn1", get("useYn1"));
		map.put("useYn2", get("useYn2"));
		map.put("useYn3", get("useYn3"));
		map.put("useYn4", get("useYn4"));
		map.put("useYn5", get("useYn5"));
		map.put("useYn6", get("useYn6"));
		map.put("usgYn99", get("usgYn99"));
		map.put("pushEtcNtfcRgsYn", get("pushEtcNtfcRgsYn"));
		map.put("pushAppDscd", get("pushAppDscd"));
		map.put("tim9brfAgrYn", get("tim9brfAgrYn"));
		map.put("wctfcNtfcAgrYn", get("wctfcNtfcAgrYn"));
		map.put("mrktAgrYn1", get("mrktAgrYn1"));
		map.put("smsMrktAgrYn1", get("smsMrktAgrYn1"));
		map.put("dayilyAgrYn", get("dayilyAgrYn"));
		map.put("weeklyAgrYn", get("weeklyAgrYn"));
		map.put("monthlyAgrYn", get("monthlyAgrYn"));
		map.put("issueAgrYn", get("issueAgrYn"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -496023644:/* xrtNtcSrvcYn */
			return getXrtNtcSrvcYn();
		case 1211123471:/* dgnNtfcSrvcYn */
			return getDgnNtfcSrvcYn();
		case -836053835:/* useYn1 */
			return getUseYn1();
		case -836053834:/* useYn2 */
			return getUseYn2();
		case -836053833:/* useYn3 */
			return getUseYn3();
		case -836053832:/* useYn4 */
			return getUseYn4();
		case -836053831:/* useYn5 */
			return getUseYn5();
		case -836053830:/* useYn6 */
			return getUseYn6();
		case -146017762:/* usgYn99 */
			return getUsgYn99();
		case 538953302:/* pushEtcNtfcRgsYn */
			return getPushEtcNtfcRgsYn();
		case -877281673:/* pushAppDscd */
			return getPushAppDscd();
		case -1722121620:/* tim9brfAgrYn */
			return getTim9brfAgrYn();
		case -2112148071:/* wctfcNtfcAgrYn */
			return getWctfcNtfcAgrYn();
		case -503654786:/* mrktAgrYn1 */
			return getMrktAgrYn1();
		case -1492626249:/* smsMrktAgrYn1 */
			return getSmsMrktAgrYn1();
		case -1942129977:/* dayilyAgrYn */
			return getDayilyAgrYn();
		case -1530517184:/* weeklyAgrYn */
			return getWeeklyAgrYn();
		case 1396175156:/* monthlyAgrYn */
			return getMonthlyAgrYn();
		case 1415280616:/* issueAgrYn */
			return getIssueAgrYn();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -496023644:/* xrtNtcSrvcYn */
			setXrtNtcSrvcYn((String)value);
			break;
		case 1211123471:/* dgnNtfcSrvcYn */
			setDgnNtfcSrvcYn((String)value);
			break;
		case -836053835:/* useYn1 */
			setUseYn1((String)value);
			break;
		case -836053834:/* useYn2 */
			setUseYn2((String)value);
			break;
		case -836053833:/* useYn3 */
			setUseYn3((String)value);
			break;
		case -836053832:/* useYn4 */
			setUseYn4((String)value);
			break;
		case -836053831:/* useYn5 */
			setUseYn5((String)value);
			break;
		case -836053830:/* useYn6 */
			setUseYn6((String)value);
			break;
		case -146017762:/* usgYn99 */
			setUsgYn99((String)value);
			break;
		case 538953302:/* pushEtcNtfcRgsYn */
			setPushEtcNtfcRgsYn((String)value);
			break;
		case -877281673:/* pushAppDscd */
			setPushAppDscd((String)value);
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
		default:
			break;
		}
	}
	
}
