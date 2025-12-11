/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.shr.dto;

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
 * 
 */
@XmlType(propOrder={
	"tmsMsgTitl", "tmsMsgTxt", "sndTgtDscd"
}, name="SHRMPBBizSelectPushInfOut_DTO")
@XmlRootElement(name="SHRMPBBizSelectPushInfOut_DTO")
@BxmCategory(logicalName="모임통장푸쉬알림저정보DTO", description="") 
public class SHRMPBBizSelectPushInfOut_DTO implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -435184220L;
	
	
	
	/**
	 * 전송메시지제목
	 */
	@ApiModelProperty(
		name = "tmsMsgTitl"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("tmsMsgTitl")
	@BxmOmm_Field(length=500, decimal=0, description="전송메시지제목", align="left", fill="")
	private String tmsMsgTitl= "";
	
	
	/**
	 * 전송메시지내용
	 */
	@ApiModelProperty(
		name = "tmsMsgTxt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("tmsMsgTxt")
	@BxmOmm_Field(length=2000, decimal=0, description="전송메시지내용", align="left", fill="")
	private String tmsMsgTxt= "";
	
	
	/**
	 * 발송대상구분코드
	 */
	@ApiModelProperty(
		name = "sndTgtDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("sndTgtDscd")
	@BxmOmm_Field(length=1, decimal=0, description="발송대상구분코드", align="left", fill="")
	private String sndTgtDscd= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_tmsMsgTitl= false;
	protected final boolean isSet_tmsMsgTitl(){
		return this.isSet_tmsMsgTitl;
	}
	private void setIsSet_tmsMsgTitl(boolean value){
		this.isSet_tmsMsgTitl= value;
	}
	/**
	 * 전송메시지제목
	 */
	@XmlTransient
	public String getTmsMsgTitl(){
		return this.tmsMsgTitl;
	}
	
	/**
	 * 전송메시지제목
	 * 
	 * @param tmsMsgTitl 전송메시지제목
	 */
	public void setTmsMsgTitl(String tmsMsgTitl){
		this.tmsMsgTitl= tmsMsgTitl;
		this.setIsSet_tmsMsgTitl(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_tmsMsgTxt= false;
	protected final boolean isSet_tmsMsgTxt(){
		return this.isSet_tmsMsgTxt;
	}
	private void setIsSet_tmsMsgTxt(boolean value){
		this.isSet_tmsMsgTxt= value;
	}
	/**
	 * 전송메시지내용
	 */
	@XmlTransient
	public String getTmsMsgTxt(){
		return this.tmsMsgTxt;
	}
	
	/**
	 * 전송메시지내용
	 * 
	 * @param tmsMsgTxt 전송메시지내용
	 */
	public void setTmsMsgTxt(String tmsMsgTxt){
		this.tmsMsgTxt= tmsMsgTxt;
		this.setIsSet_tmsMsgTxt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_sndTgtDscd= false;
	protected final boolean isSet_sndTgtDscd(){
		return this.isSet_sndTgtDscd;
	}
	private void setIsSet_sndTgtDscd(boolean value){
		this.isSet_sndTgtDscd= value;
	}
	/**
	 * 발송대상구분코드
	 */
	@XmlTransient
	public String getSndTgtDscd(){
		return this.sndTgtDscd;
	}
	
	/**
	 * 발송대상구분코드
	 * 
	 * @param sndTgtDscd 발송대상구분코드
	 */
	public void setSndTgtDscd(String sndTgtDscd){
		this.sndTgtDscd= sndTgtDscd;
		this.setIsSet_sndTgtDscd(true);
	}
				
	@Override
	public SHRMPBBizSelectPushInfOut_DTO clone(){
		try{
			SHRMPBBizSelectPushInfOut_DTO object= (SHRMPBBizSelectPushInfOut_DTO)super.clone();
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
		
		result= prime * result + ((this.tmsMsgTitl==null)?0:this.tmsMsgTitl.hashCode());
		result= prime * result + ((this.tmsMsgTxt==null)?0:this.tmsMsgTxt.hashCode());
		result= prime * result + ((this.sndTgtDscd==null)?0:this.sndTgtDscd.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final SHRMPBBizSelectPushInfOut_DTO other= (SHRMPBBizSelectPushInfOut_DTO)obj;
		{
			Object _tmsMsgTitl= getTmsMsgTitl();
			Object __tmsMsgTitl= other.getTmsMsgTitl();
			if ( _tmsMsgTitl== null ) { if ( __tmsMsgTitl!= null ) return false; }
			else if ( !_tmsMsgTitl.equals(__tmsMsgTitl) ) return false;
		}
		{
			Object _tmsMsgTxt= getTmsMsgTxt();
			Object __tmsMsgTxt= other.getTmsMsgTxt();
			if ( _tmsMsgTxt== null ) { if ( __tmsMsgTxt!= null ) return false; }
			else if ( !_tmsMsgTxt.equals(__tmsMsgTxt) ) return false;
		}
		{
			Object _sndTgtDscd= getSndTgtDscd();
			Object __sndTgtDscd= other.getSndTgtDscd();
			if ( _sndTgtDscd== null ) { if ( __sndTgtDscd!= null ) return false; }
			else if ( !_sndTgtDscd.equals(__sndTgtDscd) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(SHRMPBBizSelectPushInfOut_DTO.class.getName()).append(":\n");
		sb.append("\ttmsMsgTitl: ");
		sb.append(tmsMsgTitl==null?"null":getTmsMsgTitl());
		sb.append("\n");
		sb.append("\ttmsMsgTxt: ");
		sb.append(tmsMsgTxt==null?"null":getTmsMsgTxt());
		sb.append("\n");
		sb.append("\tsndTgtDscd: ");
		sb.append(sndTgtDscd==null?"null":getSndTgtDscd());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 500; /* tmsMsgTitl */
		messageLen+= 2000; /* tmsMsgTxt */
		messageLen+= 1; /* sndTgtDscd */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("tmsMsgTitl");
		list.add("tmsMsgTxt");
		list.add("sndTgtDscd");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("tmsMsgTitl", get("tmsMsgTitl"));
		map.put("tmsMsgTxt", get("tmsMsgTxt"));
		map.put("sndTgtDscd", get("sndTgtDscd"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 803343444:/* tmsMsgTitl */
			return getTmsMsgTitl();
		case -1221011223:/* tmsMsgTxt */
			return getTmsMsgTxt();
		case 405598088:/* sndTgtDscd */
			return getSndTgtDscd();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 803343444:/* tmsMsgTitl */
			setTmsMsgTitl((String)value);
			break;
		case -1221011223:/* tmsMsgTxt */
			setTmsMsgTxt((String)value);
			break;
		case 405598088:/* sndTgtDscd */
			setSndTgtDscd((String)value);
			break;
		default:
			break;
		}
	}
	
}
