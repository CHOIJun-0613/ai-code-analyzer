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
 * 
 */
@XmlType(propOrder={
	"mrktAgrYn"
}, name="INBNtfbxPushEtcEstUpdatePushMrktAgrYn_IDT")
@XmlRootElement(name="INBNtfbxPushEtcEstUpdatePushMrktAgrYn_IDT")
@BxmCategory(logicalName="PUSH.마케팅동의여부.컨트롤러.입력.IO", description="") 
public class INBNtfbxPushEtcEstUpdatePushMrktAgrYn_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -1069934808L;
	
	
	
	/**
	 * 마케팅동의여부 
	 */
	@ApiModelProperty(
		name = "mrktAgrYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("mrktAgrYn")
	@BxmOmm_Field(length=1, decimal=0, description="마케팅동의여부 ", align="left", fill="")
	private String mrktAgrYn= "";
	
	
	
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
				
	@Override
	public INBNtfbxPushEtcEstUpdatePushMrktAgrYn_IDT clone(){
		try{
			INBNtfbxPushEtcEstUpdatePushMrktAgrYn_IDT object= (INBNtfbxPushEtcEstUpdatePushMrktAgrYn_IDT)super.clone();
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
		
		result= prime * result + ((this.mrktAgrYn==null)?0:this.mrktAgrYn.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final INBNtfbxPushEtcEstUpdatePushMrktAgrYn_IDT other= (INBNtfbxPushEtcEstUpdatePushMrktAgrYn_IDT)obj;
		{
			Object _mrktAgrYn= getMrktAgrYn();
			Object __mrktAgrYn= other.getMrktAgrYn();
			if ( _mrktAgrYn== null ) { if ( __mrktAgrYn!= null ) return false; }
			else if ( !_mrktAgrYn.equals(__mrktAgrYn) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(INBNtfbxPushEtcEstUpdatePushMrktAgrYn_IDT.class.getName()).append(":\n");
		sb.append("\tmrktAgrYn: ");
		sb.append(mrktAgrYn==null?"null":getMrktAgrYn());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 1; /* mrktAgrYn */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("mrktAgrYn");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("mrktAgrYn", get("mrktAgrYn"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 1230679059:/* mrktAgrYn */
			return getMrktAgrYn();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 1230679059:/* mrktAgrYn */
			setMrktAgrYn((String)value);
			break;
		default:
			break;
		}
	}
	
}
