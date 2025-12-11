/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.mpb.ctr.dto;

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
	"agrtDscd"
}, name="MPBMetPbokBscMngSelectAgrtInfList_IDT")
@XmlRootElement(name="MPBMetPbokBscMngSelectAgrtInfList_IDT")
@BxmCategory(logicalName="약관.정보.컨트롤러.입력.IO", description="") 
public class MPBMetPbokBscMngSelectAgrtInfList_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -957285125L;
	
	
	
	/**
	 * 약관구분코드
	 */
	@ApiModelProperty(
		name = "agrtDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("agrtDscd")
	@BxmOmm_Field(length=2, decimal=0, description="약관구분코드", align="left", fill="")
	private String agrtDscd= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_agrtDscd= false;
	protected final boolean isSet_agrtDscd(){
		return this.isSet_agrtDscd;
	}
	private void setIsSet_agrtDscd(boolean value){
		this.isSet_agrtDscd= value;
	}
	/**
	 * 약관구분코드
	 */
	@XmlTransient
	public String getAgrtDscd(){
		return this.agrtDscd;
	}
	
	/**
	 * 약관구분코드
	 * 
	 * @param agrtDscd 약관구분코드
	 */
	public void setAgrtDscd(String agrtDscd){
		this.agrtDscd= agrtDscd;
		this.setIsSet_agrtDscd(true);
	}
				
	@Override
	public MPBMetPbokBscMngSelectAgrtInfList_IDT clone(){
		try{
			MPBMetPbokBscMngSelectAgrtInfList_IDT object= (MPBMetPbokBscMngSelectAgrtInfList_IDT)super.clone();
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
		
		result= prime * result + ((this.agrtDscd==null)?0:this.agrtDscd.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MPBMetPbokBscMngSelectAgrtInfList_IDT other= (MPBMetPbokBscMngSelectAgrtInfList_IDT)obj;
		{
			Object _agrtDscd= getAgrtDscd();
			Object __agrtDscd= other.getAgrtDscd();
			if ( _agrtDscd== null ) { if ( __agrtDscd!= null ) return false; }
			else if ( !_agrtDscd.equals(__agrtDscd) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MPBMetPbokBscMngSelectAgrtInfList_IDT.class.getName()).append(":\n");
		sb.append("\tagrtDscd: ");
		sb.append(agrtDscd==null?"null":getAgrtDscd());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 2; /* agrtDscd */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("agrtDscd");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("agrtDscd", get("agrtDscd"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 1845467704:/* agrtDscd */
			return getAgrtDscd();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 1845467704:/* agrtDscd */
			setAgrtDscd((String)value);
			break;
		default:
			break;
		}
	}
	
}
