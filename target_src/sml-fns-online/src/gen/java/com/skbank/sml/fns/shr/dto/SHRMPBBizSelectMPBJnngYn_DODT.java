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
 * 모임통장 가입여부 DODT
 */
@XmlType(propOrder={
	"metPbokJnngYn"
}, name="SHRMPBBizSelectMPBJnngYn_DODT")
@XmlRootElement(name="SHRMPBBizSelectMPBJnngYn_DODT")
@BxmCategory(logicalName="모임통장 가입여부", description="모임통장 가입여부 DODT") 
public class SHRMPBBizSelectMPBJnngYn_DODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -1777363802L;
	
	
	
	/**
	 * 모임통장 가입여부
	 */
	@ApiModelProperty(
		name = "metPbokJnngYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metPbokJnngYn")
	@BxmOmm_Field(length=1, decimal=0, description="모임통장 가입여부", align="left", fill="")
	private String metPbokJnngYn= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metPbokJnngYn= false;
	protected final boolean isSet_metPbokJnngYn(){
		return this.isSet_metPbokJnngYn;
	}
	private void setIsSet_metPbokJnngYn(boolean value){
		this.isSet_metPbokJnngYn= value;
	}
	/**
	 * 모임통장 가입여부
	 */
	@XmlTransient
	public String getMetPbokJnngYn(){
		return this.metPbokJnngYn;
	}
	
	/**
	 * 모임통장 가입여부
	 * 
	 * @param metPbokJnngYn 모임통장 가입여부
	 */
	public void setMetPbokJnngYn(String metPbokJnngYn){
		this.metPbokJnngYn= metPbokJnngYn;
		this.setIsSet_metPbokJnngYn(true);
	}
				
	@Override
	public SHRMPBBizSelectMPBJnngYn_DODT clone(){
		try{
			SHRMPBBizSelectMPBJnngYn_DODT object= (SHRMPBBizSelectMPBJnngYn_DODT)super.clone();
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
		
		result= prime * result + ((this.metPbokJnngYn==null)?0:this.metPbokJnngYn.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final SHRMPBBizSelectMPBJnngYn_DODT other= (SHRMPBBizSelectMPBJnngYn_DODT)obj;
		{
			Object _metPbokJnngYn= getMetPbokJnngYn();
			Object __metPbokJnngYn= other.getMetPbokJnngYn();
			if ( _metPbokJnngYn== null ) { if ( __metPbokJnngYn!= null ) return false; }
			else if ( !_metPbokJnngYn.equals(__metPbokJnngYn) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(SHRMPBBizSelectMPBJnngYn_DODT.class.getName()).append(":\n");
		sb.append("\tmetPbokJnngYn: ");
		sb.append(metPbokJnngYn==null?"null":getMetPbokJnngYn());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 1; /* metPbokJnngYn */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("metPbokJnngYn");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("metPbokJnngYn", get("metPbokJnngYn"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -754165284:/* metPbokJnngYn */
			return getMetPbokJnngYn();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -754165284:/* metPbokJnngYn */
			setMetPbokJnngYn((String)value);
			break;
		default:
			break;
		}
	}
	
}
