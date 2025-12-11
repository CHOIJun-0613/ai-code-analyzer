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
 * PUSH알림열람여부
 */
@XmlType(propOrder={
	"readYn"
}, name="SHRINBPushNtfcReadYn_DTO")
@XmlRootElement(name="SHRINBPushNtfcReadYn_DTO")
@BxmCategory(logicalName="PUSH알림열람여부", description="PUSH알림열람여부") 
public class SHRINBPushNtfcReadYn_DTO implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 1166428024L;
	
	
	
	/**
	 * 읽음여부
	 */
	@ApiModelProperty(
		name = "readYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("readYn")
	@BxmOmm_Field(length=1, decimal=0, description="읽음여부", align="left", fill="")
	private String readYn= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_readYn= false;
	protected final boolean isSet_readYn(){
		return this.isSet_readYn;
	}
	private void setIsSet_readYn(boolean value){
		this.isSet_readYn= value;
	}
	/**
	 * 읽음여부
	 */
	@XmlTransient
	public String getReadYn(){
		return this.readYn;
	}
	
	/**
	 * 읽음여부
	 * 
	 * @param readYn 읽음여부
	 */
	public void setReadYn(String readYn){
		this.readYn= readYn;
		this.setIsSet_readYn(true);
	}
				
	@Override
	public SHRINBPushNtfcReadYn_DTO clone(){
		try{
			SHRINBPushNtfcReadYn_DTO object= (SHRINBPushNtfcReadYn_DTO)super.clone();
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
		
		result= prime * result + ((this.readYn==null)?0:this.readYn.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final SHRINBPushNtfcReadYn_DTO other= (SHRINBPushNtfcReadYn_DTO)obj;
		{
			Object _readYn= getReadYn();
			Object __readYn= other.getReadYn();
			if ( _readYn== null ) { if ( __readYn!= null ) return false; }
			else if ( !_readYn.equals(__readYn) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(SHRINBPushNtfcReadYn_DTO.class.getName()).append(":\n");
		sb.append("\treadYn: ");
		sb.append(readYn==null?"null":getReadYn());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 1; /* readYn */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("readYn");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("readYn", get("readYn"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -934979765:/* readYn */
			return getReadYn();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -934979765:/* readYn */
			setReadYn((String)value);
			break;
		default:
			break;
		}
	}
	
}
