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
	"prcDscd", "itcsno", "mrktAgrYn", "dmsdDscd", "owhmTelAgrYn", "wrlcTelAgrYn", "hpMrktAgrYn", "smsMrktAgrYn", "emlMrktAgrYn", "eltTmsMdMrktAgrYn"
}, name="IBSMR0000888_DIDT")
@XmlRootElement(name="IBSMR0000888_DIDT")
@BxmCategory(logicalName="개인정보보호 상품동의 조회.DBM.입력.IO", description="개인정보보호 상품동의 조회 IBSMR0000888") 
public class IBSMR0000888_DIDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -2033025237L;
	
	
	
	/**
	 * 처리구분코드
	 */
	@ApiModelProperty(
		name = "prcDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("prcDscd")
	@BxmOmm_Field(length=1, decimal=0, description="처리구분코드", align="left", fill="")
	private String prcDscd= "";
	
	
	/**
	 * 통합고객번호
	 */
	@ApiModelProperty(
		name = "itcsno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("itcsno")
	@BxmOmm_Field(length=11, decimal=0, description="통합고객번호", align="left", fill="")
	private String itcsno= "";
	
	
	/**
	 * 마케팅동의여부
	 */
	@ApiModelProperty(
		name = "mrktAgrYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("mrktAgrYn")
	@BxmOmm_Field(length=1, decimal=0, description="마케팅동의여부", align="left", fill="")
	private String mrktAgrYn= "";
	
	
	/**
	 * DM발송구분코드
	 */
	@ApiModelProperty(
		name = "dmsdDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dmsdDscd")
	@BxmOmm_Field(length=2, decimal=0, description="DM발송구분코드", align="left", fill="")
	private String dmsdDscd= "";
	
	
	/**
	 * 자택전화동의여부
	 */
	@ApiModelProperty(
		name = "owhmTelAgrYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("owhmTelAgrYn")
	@BxmOmm_Field(length=1, decimal=0, description="자택전화동의여부", align="left", fill="")
	private String owhmTelAgrYn= "";
	
	
	/**
	 * 직장전화동의여부
	 */
	@ApiModelProperty(
		name = "wrlcTelAgrYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("wrlcTelAgrYn")
	@BxmOmm_Field(length=1, decimal=0, description="직장전화동의여부", align="left", fill="")
	private String wrlcTelAgrYn= "";
	
	
	/**
	 * 핸드폰마케팅동의여부
	 */
	@ApiModelProperty(
		name = "hpMrktAgrYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("hpMrktAgrYn")
	@BxmOmm_Field(length=1, decimal=0, description="핸드폰마케팅동의여부", align="left", fill="")
	private String hpMrktAgrYn= "";
	
	
	/**
	 * SMS마케팅동의여부
	 */
	@ApiModelProperty(
		name = "smsMrktAgrYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("smsMrktAgrYn")
	@BxmOmm_Field(length=1, decimal=0, description="SMS마케팅동의여부", align="left", fill="")
	private String smsMrktAgrYn= "";
	
	
	/**
	 * 이메일마케팅동의여부
	 */
	@ApiModelProperty(
		name = "emlMrktAgrYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("emlMrktAgrYn")
	@BxmOmm_Field(length=1, decimal=0, description="이메일마케팅동의여부", align="left", fill="")
	private String emlMrktAgrYn= "";
	
	
	/**
	 * 전자전송매체마케팅동의여부
	 */
	@ApiModelProperty(
		name = "eltTmsMdMrktAgrYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("eltTmsMdMrktAgrYn")
	@BxmOmm_Field(length=1, decimal=0, description="전자전송매체마케팅동의여부", align="left", fill="")
	private String eltTmsMdMrktAgrYn= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_prcDscd= false;
	protected final boolean isSet_prcDscd(){
		return this.isSet_prcDscd;
	}
	private void setIsSet_prcDscd(boolean value){
		this.isSet_prcDscd= value;
	}
	/**
	 * 처리구분코드
	 */
	@XmlTransient
	public String getPrcDscd(){
		return this.prcDscd;
	}
	
	/**
	 * 처리구분코드
	 * 
	 * @param prcDscd 처리구분코드
	 */
	public void setPrcDscd(String prcDscd){
		this.prcDscd= prcDscd;
		this.setIsSet_prcDscd(true);
	}
	
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
	private boolean isSet_mrktAgrYn= false;
	protected final boolean isSet_mrktAgrYn(){
		return this.isSet_mrktAgrYn;
	}
	private void setIsSet_mrktAgrYn(boolean value){
		this.isSet_mrktAgrYn= value;
	}
	/**
	 * 마케팅동의여부
	 */
	@XmlTransient
	public String getMrktAgrYn(){
		return this.mrktAgrYn;
	}
	
	/**
	 * 마케팅동의여부
	 * 
	 * @param mrktAgrYn 마케팅동의여부
	 */
	public void setMrktAgrYn(String mrktAgrYn){
		this.mrktAgrYn= mrktAgrYn;
		this.setIsSet_mrktAgrYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dmsdDscd= false;
	protected final boolean isSet_dmsdDscd(){
		return this.isSet_dmsdDscd;
	}
	private void setIsSet_dmsdDscd(boolean value){
		this.isSet_dmsdDscd= value;
	}
	/**
	 * DM발송구분코드
	 */
	@XmlTransient
	public String getDmsdDscd(){
		return this.dmsdDscd;
	}
	
	/**
	 * DM발송구분코드
	 * 
	 * @param dmsdDscd DM발송구분코드
	 */
	public void setDmsdDscd(String dmsdDscd){
		this.dmsdDscd= dmsdDscd;
		this.setIsSet_dmsdDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_owhmTelAgrYn= false;
	protected final boolean isSet_owhmTelAgrYn(){
		return this.isSet_owhmTelAgrYn;
	}
	private void setIsSet_owhmTelAgrYn(boolean value){
		this.isSet_owhmTelAgrYn= value;
	}
	/**
	 * 자택전화동의여부
	 */
	@XmlTransient
	public String getOwhmTelAgrYn(){
		return this.owhmTelAgrYn;
	}
	
	/**
	 * 자택전화동의여부
	 * 
	 * @param owhmTelAgrYn 자택전화동의여부
	 */
	public void setOwhmTelAgrYn(String owhmTelAgrYn){
		this.owhmTelAgrYn= owhmTelAgrYn;
		this.setIsSet_owhmTelAgrYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_wrlcTelAgrYn= false;
	protected final boolean isSet_wrlcTelAgrYn(){
		return this.isSet_wrlcTelAgrYn;
	}
	private void setIsSet_wrlcTelAgrYn(boolean value){
		this.isSet_wrlcTelAgrYn= value;
	}
	/**
	 * 직장전화동의여부
	 */
	@XmlTransient
	public String getWrlcTelAgrYn(){
		return this.wrlcTelAgrYn;
	}
	
	/**
	 * 직장전화동의여부
	 * 
	 * @param wrlcTelAgrYn 직장전화동의여부
	 */
	public void setWrlcTelAgrYn(String wrlcTelAgrYn){
		this.wrlcTelAgrYn= wrlcTelAgrYn;
		this.setIsSet_wrlcTelAgrYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_hpMrktAgrYn= false;
	protected final boolean isSet_hpMrktAgrYn(){
		return this.isSet_hpMrktAgrYn;
	}
	private void setIsSet_hpMrktAgrYn(boolean value){
		this.isSet_hpMrktAgrYn= value;
	}
	/**
	 * 핸드폰마케팅동의여부
	 */
	@XmlTransient
	public String getHpMrktAgrYn(){
		return this.hpMrktAgrYn;
	}
	
	/**
	 * 핸드폰마케팅동의여부
	 * 
	 * @param hpMrktAgrYn 핸드폰마케팅동의여부
	 */
	public void setHpMrktAgrYn(String hpMrktAgrYn){
		this.hpMrktAgrYn= hpMrktAgrYn;
		this.setIsSet_hpMrktAgrYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_smsMrktAgrYn= false;
	protected final boolean isSet_smsMrktAgrYn(){
		return this.isSet_smsMrktAgrYn;
	}
	private void setIsSet_smsMrktAgrYn(boolean value){
		this.isSet_smsMrktAgrYn= value;
	}
	/**
	 * SMS마케팅동의여부
	 */
	@XmlTransient
	public String getSmsMrktAgrYn(){
		return this.smsMrktAgrYn;
	}
	
	/**
	 * SMS마케팅동의여부
	 * 
	 * @param smsMrktAgrYn SMS마케팅동의여부
	 */
	public void setSmsMrktAgrYn(String smsMrktAgrYn){
		this.smsMrktAgrYn= smsMrktAgrYn;
		this.setIsSet_smsMrktAgrYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_emlMrktAgrYn= false;
	protected final boolean isSet_emlMrktAgrYn(){
		return this.isSet_emlMrktAgrYn;
	}
	private void setIsSet_emlMrktAgrYn(boolean value){
		this.isSet_emlMrktAgrYn= value;
	}
	/**
	 * 이메일마케팅동의여부
	 */
	@XmlTransient
	public String getEmlMrktAgrYn(){
		return this.emlMrktAgrYn;
	}
	
	/**
	 * 이메일마케팅동의여부
	 * 
	 * @param emlMrktAgrYn 이메일마케팅동의여부
	 */
	public void setEmlMrktAgrYn(String emlMrktAgrYn){
		this.emlMrktAgrYn= emlMrktAgrYn;
		this.setIsSet_emlMrktAgrYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_eltTmsMdMrktAgrYn= false;
	protected final boolean isSet_eltTmsMdMrktAgrYn(){
		return this.isSet_eltTmsMdMrktAgrYn;
	}
	private void setIsSet_eltTmsMdMrktAgrYn(boolean value){
		this.isSet_eltTmsMdMrktAgrYn= value;
	}
	/**
	 * 전자전송매체마케팅동의여부
	 */
	@XmlTransient
	public String getEltTmsMdMrktAgrYn(){
		return this.eltTmsMdMrktAgrYn;
	}
	
	/**
	 * 전자전송매체마케팅동의여부
	 * 
	 * @param eltTmsMdMrktAgrYn 전자전송매체마케팅동의여부
	 */
	public void setEltTmsMdMrktAgrYn(String eltTmsMdMrktAgrYn){
		this.eltTmsMdMrktAgrYn= eltTmsMdMrktAgrYn;
		this.setIsSet_eltTmsMdMrktAgrYn(true);
	}
				
	@Override
	public IBSMR0000888_DIDT clone(){
		try{
			IBSMR0000888_DIDT object= (IBSMR0000888_DIDT)super.clone();
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
		
		result= prime * result + ((this.prcDscd==null)?0:this.prcDscd.hashCode());
		result= prime * result + ((this.itcsno==null)?0:this.itcsno.hashCode());
		result= prime * result + ((this.mrktAgrYn==null)?0:this.mrktAgrYn.hashCode());
		result= prime * result + ((this.dmsdDscd==null)?0:this.dmsdDscd.hashCode());
		result= prime * result + ((this.owhmTelAgrYn==null)?0:this.owhmTelAgrYn.hashCode());
		result= prime * result + ((this.wrlcTelAgrYn==null)?0:this.wrlcTelAgrYn.hashCode());
		result= prime * result + ((this.hpMrktAgrYn==null)?0:this.hpMrktAgrYn.hashCode());
		result= prime * result + ((this.smsMrktAgrYn==null)?0:this.smsMrktAgrYn.hashCode());
		result= prime * result + ((this.emlMrktAgrYn==null)?0:this.emlMrktAgrYn.hashCode());
		result= prime * result + ((this.eltTmsMdMrktAgrYn==null)?0:this.eltTmsMdMrktAgrYn.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final IBSMR0000888_DIDT other= (IBSMR0000888_DIDT)obj;
		{
			Object _prcDscd= getPrcDscd();
			Object __prcDscd= other.getPrcDscd();
			if ( _prcDscd== null ) { if ( __prcDscd!= null ) return false; }
			else if ( !_prcDscd.equals(__prcDscd) ) return false;
		}
		{
			Object _itcsno= getItcsno();
			Object __itcsno= other.getItcsno();
			if ( _itcsno== null ) { if ( __itcsno!= null ) return false; }
			else if ( !_itcsno.equals(__itcsno) ) return false;
		}
		{
			Object _mrktAgrYn= getMrktAgrYn();
			Object __mrktAgrYn= other.getMrktAgrYn();
			if ( _mrktAgrYn== null ) { if ( __mrktAgrYn!= null ) return false; }
			else if ( !_mrktAgrYn.equals(__mrktAgrYn) ) return false;
		}
		{
			Object _dmsdDscd= getDmsdDscd();
			Object __dmsdDscd= other.getDmsdDscd();
			if ( _dmsdDscd== null ) { if ( __dmsdDscd!= null ) return false; }
			else if ( !_dmsdDscd.equals(__dmsdDscd) ) return false;
		}
		{
			Object _owhmTelAgrYn= getOwhmTelAgrYn();
			Object __owhmTelAgrYn= other.getOwhmTelAgrYn();
			if ( _owhmTelAgrYn== null ) { if ( __owhmTelAgrYn!= null ) return false; }
			else if ( !_owhmTelAgrYn.equals(__owhmTelAgrYn) ) return false;
		}
		{
			Object _wrlcTelAgrYn= getWrlcTelAgrYn();
			Object __wrlcTelAgrYn= other.getWrlcTelAgrYn();
			if ( _wrlcTelAgrYn== null ) { if ( __wrlcTelAgrYn!= null ) return false; }
			else if ( !_wrlcTelAgrYn.equals(__wrlcTelAgrYn) ) return false;
		}
		{
			Object _hpMrktAgrYn= getHpMrktAgrYn();
			Object __hpMrktAgrYn= other.getHpMrktAgrYn();
			if ( _hpMrktAgrYn== null ) { if ( __hpMrktAgrYn!= null ) return false; }
			else if ( !_hpMrktAgrYn.equals(__hpMrktAgrYn) ) return false;
		}
		{
			Object _smsMrktAgrYn= getSmsMrktAgrYn();
			Object __smsMrktAgrYn= other.getSmsMrktAgrYn();
			if ( _smsMrktAgrYn== null ) { if ( __smsMrktAgrYn!= null ) return false; }
			else if ( !_smsMrktAgrYn.equals(__smsMrktAgrYn) ) return false;
		}
		{
			Object _emlMrktAgrYn= getEmlMrktAgrYn();
			Object __emlMrktAgrYn= other.getEmlMrktAgrYn();
			if ( _emlMrktAgrYn== null ) { if ( __emlMrktAgrYn!= null ) return false; }
			else if ( !_emlMrktAgrYn.equals(__emlMrktAgrYn) ) return false;
		}
		{
			Object _eltTmsMdMrktAgrYn= getEltTmsMdMrktAgrYn();
			Object __eltTmsMdMrktAgrYn= other.getEltTmsMdMrktAgrYn();
			if ( _eltTmsMdMrktAgrYn== null ) { if ( __eltTmsMdMrktAgrYn!= null ) return false; }
			else if ( !_eltTmsMdMrktAgrYn.equals(__eltTmsMdMrktAgrYn) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(IBSMR0000888_DIDT.class.getName()).append(":\n");
		sb.append("\tprcDscd: ");
		sb.append(prcDscd==null?"null":getPrcDscd());
		sb.append("\n");
		sb.append("\titcsno: ");
		sb.append(itcsno==null?"null":getItcsno());
		sb.append("\n");
		sb.append("\tmrktAgrYn: ");
		sb.append(mrktAgrYn==null?"null":getMrktAgrYn());
		sb.append("\n");
		sb.append("\tdmsdDscd: ");
		sb.append(dmsdDscd==null?"null":getDmsdDscd());
		sb.append("\n");
		sb.append("\towhmTelAgrYn: ");
		sb.append(owhmTelAgrYn==null?"null":getOwhmTelAgrYn());
		sb.append("\n");
		sb.append("\twrlcTelAgrYn: ");
		sb.append(wrlcTelAgrYn==null?"null":getWrlcTelAgrYn());
		sb.append("\n");
		sb.append("\thpMrktAgrYn: ");
		sb.append(hpMrktAgrYn==null?"null":getHpMrktAgrYn());
		sb.append("\n");
		sb.append("\tsmsMrktAgrYn: ");
		sb.append(smsMrktAgrYn==null?"null":getSmsMrktAgrYn());
		sb.append("\n");
		sb.append("\temlMrktAgrYn: ");
		sb.append(emlMrktAgrYn==null?"null":getEmlMrktAgrYn());
		sb.append("\n");
		sb.append("\teltTmsMdMrktAgrYn: ");
		sb.append(eltTmsMdMrktAgrYn==null?"null":getEltTmsMdMrktAgrYn());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 1; /* prcDscd */
		messageLen+= 11; /* itcsno */
		messageLen+= 1; /* mrktAgrYn */
		messageLen+= 2; /* dmsdDscd */
		messageLen+= 1; /* owhmTelAgrYn */
		messageLen+= 1; /* wrlcTelAgrYn */
		messageLen+= 1; /* hpMrktAgrYn */
		messageLen+= 1; /* smsMrktAgrYn */
		messageLen+= 1; /* emlMrktAgrYn */
		messageLen+= 1; /* eltTmsMdMrktAgrYn */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("prcDscd");
		list.add("itcsno");
		list.add("mrktAgrYn");
		list.add("dmsdDscd");
		list.add("owhmTelAgrYn");
		list.add("wrlcTelAgrYn");
		list.add("hpMrktAgrYn");
		list.add("smsMrktAgrYn");
		list.add("emlMrktAgrYn");
		list.add("eltTmsMdMrktAgrYn");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("prcDscd", get("prcDscd"));
		map.put("itcsno", get("itcsno"));
		map.put("mrktAgrYn", get("mrktAgrYn"));
		map.put("dmsdDscd", get("dmsdDscd"));
		map.put("owhmTelAgrYn", get("owhmTelAgrYn"));
		map.put("wrlcTelAgrYn", get("wrlcTelAgrYn"));
		map.put("hpMrktAgrYn", get("hpMrktAgrYn"));
		map.put("smsMrktAgrYn", get("smsMrktAgrYn"));
		map.put("emlMrktAgrYn", get("emlMrktAgrYn"));
		map.put("eltTmsMdMrktAgrYn", get("eltTmsMdMrktAgrYn"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -321511567:/* prcDscd */
			return getPrcDscd();
		case -1178714660:/* itcsno */
			return getItcsno();
		case 1230679059:/* mrktAgrYn */
			return getMrktAgrYn();
		case -472128278:/* dmsdDscd */
			return getDmsdDscd();
		case -1676213773:/* owhmTelAgrYn */
			return getOwhmTelAgrYn();
		case -140108392:/* wrlcTelAgrYn */
			return getWrlcTelAgrYn();
		case 500623339:/* hpMrktAgrYn */
			return getHpMrktAgrYn();
		case 1475871418:/* smsMrktAgrYn */
			return getSmsMrktAgrYn();
		case 1044307887:/* emlMrktAgrYn */
			return getEmlMrktAgrYn();
		case -912372529:/* eltTmsMdMrktAgrYn */
			return getEltTmsMdMrktAgrYn();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -321511567:/* prcDscd */
			setPrcDscd((String)value);
			break;
		case -1178714660:/* itcsno */
			setItcsno((String)value);
			break;
		case 1230679059:/* mrktAgrYn */
			setMrktAgrYn((String)value);
			break;
		case -472128278:/* dmsdDscd */
			setDmsdDscd((String)value);
			break;
		case -1676213773:/* owhmTelAgrYn */
			setOwhmTelAgrYn((String)value);
			break;
		case -140108392:/* wrlcTelAgrYn */
			setWrlcTelAgrYn((String)value);
			break;
		case 500623339:/* hpMrktAgrYn */
			setHpMrktAgrYn((String)value);
			break;
		case 1475871418:/* smsMrktAgrYn */
			setSmsMrktAgrYn((String)value);
			break;
		case 1044307887:/* emlMrktAgrYn */
			setEmlMrktAgrYn((String)value);
			break;
		case -912372529:/* eltTmsMdMrktAgrYn */
			setEltTmsMdMrktAgrYn((String)value);
			break;
		default:
			break;
		}
	}
	
}
