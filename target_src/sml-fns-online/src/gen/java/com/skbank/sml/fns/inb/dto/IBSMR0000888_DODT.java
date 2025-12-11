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
 * 개인정보보호 상품동의 조회 IBSMR0000888
 */
@XmlType(propOrder={
	"itcsno1", "mrktAgrYn1", "dmsdDscd1", "owhmTelAgrYn1", "wrlcTelAgrYn1", "hpMrktAgrYn1", "smsMrktAgrYn1", "emlMrktAgrYn1", "eltTmsMdMrktAgrYn1", "chckTgtYn1", "csguAgmdCollDt"
}, name="IBSMR0000888_DODT")
@XmlRootElement(name="IBSMR0000888_DODT")
@BxmCategory(logicalName="개인정보보호 상품동의 조회.DBM.출력.IO", description="개인정보보호 상품동의 조회 IBSMR0000888") 
public class IBSMR0000888_DODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -2033019471L;
	
	
	
	/**
	 * 통합고객번호_1
	 */
	@ApiModelProperty(
		name = "itcsno1"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("itcsno1")
	@BxmOmm_Field(length=11, decimal=0, description="통합고객번호_1", align="left", fill="")
	private String itcsno1= "";
	
	
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
	 * DM발송구분코드_1
	 */
	@ApiModelProperty(
		name = "dmsdDscd1"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dmsdDscd1")
	@BxmOmm_Field(length=2, decimal=0, description="DM발송구분코드_1", align="left", fill="")
	private String dmsdDscd1= "";
	
	
	/**
	 * 자택전화동의여부_1
	 */
	@ApiModelProperty(
		name = "owhmTelAgrYn1"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("owhmTelAgrYn1")
	@BxmOmm_Field(length=1, decimal=0, description="자택전화동의여부_1", align="left", fill="")
	private String owhmTelAgrYn1= "";
	
	
	/**
	 * 직장전화동의여부_1
	 */
	@ApiModelProperty(
		name = "wrlcTelAgrYn1"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("wrlcTelAgrYn1")
	@BxmOmm_Field(length=1, decimal=0, description="직장전화동의여부_1", align="left", fill="")
	private String wrlcTelAgrYn1= "";
	
	
	/**
	 * 핸드폰마케팅동의여부_1
	 */
	@ApiModelProperty(
		name = "hpMrktAgrYn1"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("hpMrktAgrYn1")
	@BxmOmm_Field(length=1, decimal=0, description="핸드폰마케팅동의여부_1", align="left", fill="")
	private String hpMrktAgrYn1= "";
	
	
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
	 * 이메일마케팅동의여부_1
	 */
	@ApiModelProperty(
		name = "emlMrktAgrYn1"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("emlMrktAgrYn1")
	@BxmOmm_Field(length=1, decimal=0, description="이메일마케팅동의여부_1", align="left", fill="")
	private String emlMrktAgrYn1= "";
	
	
	/**
	 * 전자전송매체마케팅동의여부_1
	 */
	@ApiModelProperty(
		name = "eltTmsMdMrktAgrYn1"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("eltTmsMdMrktAgrYn1")
	@BxmOmm_Field(length=1, decimal=0, description="전자전송매체마케팅동의여부_1", align="left", fill="")
	private String eltTmsMdMrktAgrYn1= "";
	
	
	/**
	 * 점검대상여부_1
	 */
	@ApiModelProperty(
		name = "chckTgtYn1"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("chckTgtYn1")
	@BxmOmm_Field(length=1, decimal=0, description="점검대상여부_1", align="left", fill="")
	private String chckTgtYn1= "";
	
	
	/**
	 * 상품서비스안내동의서징구일자
	 */
	@ApiModelProperty(
		name = "csguAgmdCollDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("csguAgmdCollDt")
	@BxmOmm_Field(length=8, decimal=0, description="상품서비스안내동의서징구일자", align="left", fill="")
	private String csguAgmdCollDt= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_itcsno1= false;
	protected final boolean isSet_itcsno1(){
		return this.isSet_itcsno1;
	}
	private void setIsSet_itcsno1(boolean value){
		this.isSet_itcsno1= value;
	}
	/**
	 * 통합고객번호_1
	 */
	@XmlTransient
	public String getItcsno1(){
		return this.itcsno1;
	}
	
	/**
	 * 통합고객번호_1
	 * 
	 * @param itcsno1 통합고객번호_1
	 */
	public void setItcsno1(String itcsno1){
		this.itcsno1= itcsno1;
		this.setIsSet_itcsno1(true);
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
	private boolean isSet_dmsdDscd1= false;
	protected final boolean isSet_dmsdDscd1(){
		return this.isSet_dmsdDscd1;
	}
	private void setIsSet_dmsdDscd1(boolean value){
		this.isSet_dmsdDscd1= value;
	}
	/**
	 * DM발송구분코드_1
	 */
	@XmlTransient
	public String getDmsdDscd1(){
		return this.dmsdDscd1;
	}
	
	/**
	 * DM발송구분코드_1
	 * 
	 * @param dmsdDscd1 DM발송구분코드_1
	 */
	public void setDmsdDscd1(String dmsdDscd1){
		this.dmsdDscd1= dmsdDscd1;
		this.setIsSet_dmsdDscd1(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_owhmTelAgrYn1= false;
	protected final boolean isSet_owhmTelAgrYn1(){
		return this.isSet_owhmTelAgrYn1;
	}
	private void setIsSet_owhmTelAgrYn1(boolean value){
		this.isSet_owhmTelAgrYn1= value;
	}
	/**
	 * 자택전화동의여부_1
	 */
	@XmlTransient
	public String getOwhmTelAgrYn1(){
		return this.owhmTelAgrYn1;
	}
	
	/**
	 * 자택전화동의여부_1
	 * 
	 * @param owhmTelAgrYn1 자택전화동의여부_1
	 */
	public void setOwhmTelAgrYn1(String owhmTelAgrYn1){
		this.owhmTelAgrYn1= owhmTelAgrYn1;
		this.setIsSet_owhmTelAgrYn1(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_wrlcTelAgrYn1= false;
	protected final boolean isSet_wrlcTelAgrYn1(){
		return this.isSet_wrlcTelAgrYn1;
	}
	private void setIsSet_wrlcTelAgrYn1(boolean value){
		this.isSet_wrlcTelAgrYn1= value;
	}
	/**
	 * 직장전화동의여부_1
	 */
	@XmlTransient
	public String getWrlcTelAgrYn1(){
		return this.wrlcTelAgrYn1;
	}
	
	/**
	 * 직장전화동의여부_1
	 * 
	 * @param wrlcTelAgrYn1 직장전화동의여부_1
	 */
	public void setWrlcTelAgrYn1(String wrlcTelAgrYn1){
		this.wrlcTelAgrYn1= wrlcTelAgrYn1;
		this.setIsSet_wrlcTelAgrYn1(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_hpMrktAgrYn1= false;
	protected final boolean isSet_hpMrktAgrYn1(){
		return this.isSet_hpMrktAgrYn1;
	}
	private void setIsSet_hpMrktAgrYn1(boolean value){
		this.isSet_hpMrktAgrYn1= value;
	}
	/**
	 * 핸드폰마케팅동의여부_1
	 */
	@XmlTransient
	public String getHpMrktAgrYn1(){
		return this.hpMrktAgrYn1;
	}
	
	/**
	 * 핸드폰마케팅동의여부_1
	 * 
	 * @param hpMrktAgrYn1 핸드폰마케팅동의여부_1
	 */
	public void setHpMrktAgrYn1(String hpMrktAgrYn1){
		this.hpMrktAgrYn1= hpMrktAgrYn1;
		this.setIsSet_hpMrktAgrYn1(true);
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
	private boolean isSet_emlMrktAgrYn1= false;
	protected final boolean isSet_emlMrktAgrYn1(){
		return this.isSet_emlMrktAgrYn1;
	}
	private void setIsSet_emlMrktAgrYn1(boolean value){
		this.isSet_emlMrktAgrYn1= value;
	}
	/**
	 * 이메일마케팅동의여부_1
	 */
	@XmlTransient
	public String getEmlMrktAgrYn1(){
		return this.emlMrktAgrYn1;
	}
	
	/**
	 * 이메일마케팅동의여부_1
	 * 
	 * @param emlMrktAgrYn1 이메일마케팅동의여부_1
	 */
	public void setEmlMrktAgrYn1(String emlMrktAgrYn1){
		this.emlMrktAgrYn1= emlMrktAgrYn1;
		this.setIsSet_emlMrktAgrYn1(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_eltTmsMdMrktAgrYn1= false;
	protected final boolean isSet_eltTmsMdMrktAgrYn1(){
		return this.isSet_eltTmsMdMrktAgrYn1;
	}
	private void setIsSet_eltTmsMdMrktAgrYn1(boolean value){
		this.isSet_eltTmsMdMrktAgrYn1= value;
	}
	/**
	 * 전자전송매체마케팅동의여부_1
	 */
	@XmlTransient
	public String getEltTmsMdMrktAgrYn1(){
		return this.eltTmsMdMrktAgrYn1;
	}
	
	/**
	 * 전자전송매체마케팅동의여부_1
	 * 
	 * @param eltTmsMdMrktAgrYn1 전자전송매체마케팅동의여부_1
	 */
	public void setEltTmsMdMrktAgrYn1(String eltTmsMdMrktAgrYn1){
		this.eltTmsMdMrktAgrYn1= eltTmsMdMrktAgrYn1;
		this.setIsSet_eltTmsMdMrktAgrYn1(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_chckTgtYn1= false;
	protected final boolean isSet_chckTgtYn1(){
		return this.isSet_chckTgtYn1;
	}
	private void setIsSet_chckTgtYn1(boolean value){
		this.isSet_chckTgtYn1= value;
	}
	/**
	 * 점검대상여부_1
	 */
	@XmlTransient
	public String getChckTgtYn1(){
		return this.chckTgtYn1;
	}
	
	/**
	 * 점검대상여부_1
	 * 
	 * @param chckTgtYn1 점검대상여부_1
	 */
	public void setChckTgtYn1(String chckTgtYn1){
		this.chckTgtYn1= chckTgtYn1;
		this.setIsSet_chckTgtYn1(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_csguAgmdCollDt= false;
	protected final boolean isSet_csguAgmdCollDt(){
		return this.isSet_csguAgmdCollDt;
	}
	private void setIsSet_csguAgmdCollDt(boolean value){
		this.isSet_csguAgmdCollDt= value;
	}
	/**
	 * 상품서비스안내동의서징구일자
	 */
	@XmlTransient
	public String getCsguAgmdCollDt(){
		return this.csguAgmdCollDt;
	}
	
	/**
	 * 상품서비스안내동의서징구일자
	 * 
	 * @param csguAgmdCollDt 상품서비스안내동의서징구일자
	 */
	public void setCsguAgmdCollDt(String csguAgmdCollDt){
		this.csguAgmdCollDt= csguAgmdCollDt;
		this.setIsSet_csguAgmdCollDt(true);
	}
				
	@Override
	public IBSMR0000888_DODT clone(){
		try{
			IBSMR0000888_DODT object= (IBSMR0000888_DODT)super.clone();
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
		
		result= prime * result + ((this.itcsno1==null)?0:this.itcsno1.hashCode());
		result= prime * result + ((this.mrktAgrYn1==null)?0:this.mrktAgrYn1.hashCode());
		result= prime * result + ((this.dmsdDscd1==null)?0:this.dmsdDscd1.hashCode());
		result= prime * result + ((this.owhmTelAgrYn1==null)?0:this.owhmTelAgrYn1.hashCode());
		result= prime * result + ((this.wrlcTelAgrYn1==null)?0:this.wrlcTelAgrYn1.hashCode());
		result= prime * result + ((this.hpMrktAgrYn1==null)?0:this.hpMrktAgrYn1.hashCode());
		result= prime * result + ((this.smsMrktAgrYn1==null)?0:this.smsMrktAgrYn1.hashCode());
		result= prime * result + ((this.emlMrktAgrYn1==null)?0:this.emlMrktAgrYn1.hashCode());
		result= prime * result + ((this.eltTmsMdMrktAgrYn1==null)?0:this.eltTmsMdMrktAgrYn1.hashCode());
		result= prime * result + ((this.chckTgtYn1==null)?0:this.chckTgtYn1.hashCode());
		result= prime * result + ((this.csguAgmdCollDt==null)?0:this.csguAgmdCollDt.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final IBSMR0000888_DODT other= (IBSMR0000888_DODT)obj;
		{
			Object _itcsno1= getItcsno1();
			Object __itcsno1= other.getItcsno1();
			if ( _itcsno1== null ) { if ( __itcsno1!= null ) return false; }
			else if ( !_itcsno1.equals(__itcsno1) ) return false;
		}
		{
			Object _mrktAgrYn1= getMrktAgrYn1();
			Object __mrktAgrYn1= other.getMrktAgrYn1();
			if ( _mrktAgrYn1== null ) { if ( __mrktAgrYn1!= null ) return false; }
			else if ( !_mrktAgrYn1.equals(__mrktAgrYn1) ) return false;
		}
		{
			Object _dmsdDscd1= getDmsdDscd1();
			Object __dmsdDscd1= other.getDmsdDscd1();
			if ( _dmsdDscd1== null ) { if ( __dmsdDscd1!= null ) return false; }
			else if ( !_dmsdDscd1.equals(__dmsdDscd1) ) return false;
		}
		{
			Object _owhmTelAgrYn1= getOwhmTelAgrYn1();
			Object __owhmTelAgrYn1= other.getOwhmTelAgrYn1();
			if ( _owhmTelAgrYn1== null ) { if ( __owhmTelAgrYn1!= null ) return false; }
			else if ( !_owhmTelAgrYn1.equals(__owhmTelAgrYn1) ) return false;
		}
		{
			Object _wrlcTelAgrYn1= getWrlcTelAgrYn1();
			Object __wrlcTelAgrYn1= other.getWrlcTelAgrYn1();
			if ( _wrlcTelAgrYn1== null ) { if ( __wrlcTelAgrYn1!= null ) return false; }
			else if ( !_wrlcTelAgrYn1.equals(__wrlcTelAgrYn1) ) return false;
		}
		{
			Object _hpMrktAgrYn1= getHpMrktAgrYn1();
			Object __hpMrktAgrYn1= other.getHpMrktAgrYn1();
			if ( _hpMrktAgrYn1== null ) { if ( __hpMrktAgrYn1!= null ) return false; }
			else if ( !_hpMrktAgrYn1.equals(__hpMrktAgrYn1) ) return false;
		}
		{
			Object _smsMrktAgrYn1= getSmsMrktAgrYn1();
			Object __smsMrktAgrYn1= other.getSmsMrktAgrYn1();
			if ( _smsMrktAgrYn1== null ) { if ( __smsMrktAgrYn1!= null ) return false; }
			else if ( !_smsMrktAgrYn1.equals(__smsMrktAgrYn1) ) return false;
		}
		{
			Object _emlMrktAgrYn1= getEmlMrktAgrYn1();
			Object __emlMrktAgrYn1= other.getEmlMrktAgrYn1();
			if ( _emlMrktAgrYn1== null ) { if ( __emlMrktAgrYn1!= null ) return false; }
			else if ( !_emlMrktAgrYn1.equals(__emlMrktAgrYn1) ) return false;
		}
		{
			Object _eltTmsMdMrktAgrYn1= getEltTmsMdMrktAgrYn1();
			Object __eltTmsMdMrktAgrYn1= other.getEltTmsMdMrktAgrYn1();
			if ( _eltTmsMdMrktAgrYn1== null ) { if ( __eltTmsMdMrktAgrYn1!= null ) return false; }
			else if ( !_eltTmsMdMrktAgrYn1.equals(__eltTmsMdMrktAgrYn1) ) return false;
		}
		{
			Object _chckTgtYn1= getChckTgtYn1();
			Object __chckTgtYn1= other.getChckTgtYn1();
			if ( _chckTgtYn1== null ) { if ( __chckTgtYn1!= null ) return false; }
			else if ( !_chckTgtYn1.equals(__chckTgtYn1) ) return false;
		}
		{
			Object _csguAgmdCollDt= getCsguAgmdCollDt();
			Object __csguAgmdCollDt= other.getCsguAgmdCollDt();
			if ( _csguAgmdCollDt== null ) { if ( __csguAgmdCollDt!= null ) return false; }
			else if ( !_csguAgmdCollDt.equals(__csguAgmdCollDt) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(IBSMR0000888_DODT.class.getName()).append(":\n");
		sb.append("\titcsno1: ");
		sb.append(itcsno1==null?"null":getItcsno1());
		sb.append("\n");
		sb.append("\tmrktAgrYn1: ");
		sb.append(mrktAgrYn1==null?"null":getMrktAgrYn1());
		sb.append("\n");
		sb.append("\tdmsdDscd1: ");
		sb.append(dmsdDscd1==null?"null":getDmsdDscd1());
		sb.append("\n");
		sb.append("\towhmTelAgrYn1: ");
		sb.append(owhmTelAgrYn1==null?"null":getOwhmTelAgrYn1());
		sb.append("\n");
		sb.append("\twrlcTelAgrYn1: ");
		sb.append(wrlcTelAgrYn1==null?"null":getWrlcTelAgrYn1());
		sb.append("\n");
		sb.append("\thpMrktAgrYn1: ");
		sb.append(hpMrktAgrYn1==null?"null":getHpMrktAgrYn1());
		sb.append("\n");
		sb.append("\tsmsMrktAgrYn1: ");
		sb.append(smsMrktAgrYn1==null?"null":getSmsMrktAgrYn1());
		sb.append("\n");
		sb.append("\temlMrktAgrYn1: ");
		sb.append(emlMrktAgrYn1==null?"null":getEmlMrktAgrYn1());
		sb.append("\n");
		sb.append("\teltTmsMdMrktAgrYn1: ");
		sb.append(eltTmsMdMrktAgrYn1==null?"null":getEltTmsMdMrktAgrYn1());
		sb.append("\n");
		sb.append("\tchckTgtYn1: ");
		sb.append(chckTgtYn1==null?"null":getChckTgtYn1());
		sb.append("\n");
		sb.append("\tcsguAgmdCollDt: ");
		sb.append(csguAgmdCollDt==null?"null":getCsguAgmdCollDt());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 11; /* itcsno1 */
		messageLen+= 1; /* mrktAgrYn1 */
		messageLen+= 2; /* dmsdDscd1 */
		messageLen+= 1; /* owhmTelAgrYn1 */
		messageLen+= 1; /* wrlcTelAgrYn1 */
		messageLen+= 1; /* hpMrktAgrYn1 */
		messageLen+= 1; /* smsMrktAgrYn1 */
		messageLen+= 1; /* emlMrktAgrYn1 */
		messageLen+= 1; /* eltTmsMdMrktAgrYn1 */
		messageLen+= 1; /* chckTgtYn1 */
		messageLen+= 8; /* csguAgmdCollDt */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("itcsno1");
		list.add("mrktAgrYn1");
		list.add("dmsdDscd1");
		list.add("owhmTelAgrYn1");
		list.add("wrlcTelAgrYn1");
		list.add("hpMrktAgrYn1");
		list.add("smsMrktAgrYn1");
		list.add("emlMrktAgrYn1");
		list.add("eltTmsMdMrktAgrYn1");
		list.add("chckTgtYn1");
		list.add("csguAgmdCollDt");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("itcsno1", get("itcsno1"));
		map.put("mrktAgrYn1", get("mrktAgrYn1"));
		map.put("dmsdDscd1", get("dmsdDscd1"));
		map.put("owhmTelAgrYn1", get("owhmTelAgrYn1"));
		map.put("wrlcTelAgrYn1", get("wrlcTelAgrYn1"));
		map.put("hpMrktAgrYn1", get("hpMrktAgrYn1"));
		map.put("smsMrktAgrYn1", get("smsMrktAgrYn1"));
		map.put("emlMrktAgrYn1", get("emlMrktAgrYn1"));
		map.put("eltTmsMdMrktAgrYn1", get("eltTmsMdMrktAgrYn1"));
		map.put("chckTgtYn1", get("chckTgtYn1"));
		map.put("csguAgmdCollDt", get("csguAgmdCollDt"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 2114551253:/* itcsno1 */
			return getItcsno1();
		case -503654786:/* mrktAgrYn1 */
			return getMrktAgrYn1();
		case -1751074681:/* dmsdDscd1 */
			return getDmsdDscd1();
		case -423019362:/* owhmTelAgrYn1 */
			return getOwhmTelAgrYn1();
		case -48392807:/* wrlcTelAgrYn1 */
			return getWrlcTelAgrYn1();
		case -1660545626:/* hpMrktAgrYn1 */
			return getHpMrktAgrYn1();
		case -1492626249:/* smsMrktAgrYn1 */
			return getSmsMrktAgrYn1();
		case -1986193822:/* emlMrktAgrYn1 */
			return getEmlMrktAgrYn1();
		case 1781222722:/* eltTmsMdMrktAgrYn1 */
			return getEltTmsMdMrktAgrYn1();
		case -1849977464:/* chckTgtYn1 */
			return getChckTgtYn1();
		case -1371448521:/* csguAgmdCollDt */
			return getCsguAgmdCollDt();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 2114551253:/* itcsno1 */
			setItcsno1((String)value);
			break;
		case -503654786:/* mrktAgrYn1 */
			setMrktAgrYn1((String)value);
			break;
		case -1751074681:/* dmsdDscd1 */
			setDmsdDscd1((String)value);
			break;
		case -423019362:/* owhmTelAgrYn1 */
			setOwhmTelAgrYn1((String)value);
			break;
		case -48392807:/* wrlcTelAgrYn1 */
			setWrlcTelAgrYn1((String)value);
			break;
		case -1660545626:/* hpMrktAgrYn1 */
			setHpMrktAgrYn1((String)value);
			break;
		case -1492626249:/* smsMrktAgrYn1 */
			setSmsMrktAgrYn1((String)value);
			break;
		case -1986193822:/* emlMrktAgrYn1 */
			setEmlMrktAgrYn1((String)value);
			break;
		case 1781222722:/* eltTmsMdMrktAgrYn1 */
			setEltTmsMdMrktAgrYn1((String)value);
			break;
		case -1849977464:/* chckTgtYn1 */
			setChckTgtYn1((String)value);
			break;
		case -1371448521:/* csguAgmdCollDt */
			setCsguAgmdCollDt((String)value);
			break;
		default:
			break;
		}
	}
	
}
