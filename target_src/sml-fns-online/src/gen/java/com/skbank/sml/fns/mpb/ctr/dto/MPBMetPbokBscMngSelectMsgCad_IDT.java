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
	"metMsgCadDscd"
}, name="MPBMetPbokBscMngSelectMsgCad_IDT")
@XmlRootElement(name="MPBMetPbokBscMngSelectMsgCad_IDT")
@BxmCategory(logicalName="메시지.카드.조회.컨트롤러.입력.IO", description="") 
public class MPBMetPbokBscMngSelectMsgCad_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -520725227L;
	
	
	
	/**
	 * 모임메시지카드구분코드
	 */
	@ApiModelProperty(
		name = "metMsgCadDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metMsgCadDscd")
	@BxmOmm_Field(length=2, decimal=0, description="모임메시지카드구분코드", align="left", fill="")
	private String metMsgCadDscd= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metMsgCadDscd= false;
	protected final boolean isSet_metMsgCadDscd(){
		return this.isSet_metMsgCadDscd;
	}
	private void setIsSet_metMsgCadDscd(boolean value){
		this.isSet_metMsgCadDscd= value;
	}
	/**
	 * 모임메시지카드구분코드
	 */
	@XmlTransient
	public String getMetMsgCadDscd(){
		return this.metMsgCadDscd;
	}
	
	/**
	 * 모임메시지카드구분코드
	 * 
	 * @param metMsgCadDscd 모임메시지카드구분코드
	 */
	public void setMetMsgCadDscd(String metMsgCadDscd){
		this.metMsgCadDscd= metMsgCadDscd;
		this.setIsSet_metMsgCadDscd(true);
	}
				
	@Override
	public MPBMetPbokBscMngSelectMsgCad_IDT clone(){
		try{
			MPBMetPbokBscMngSelectMsgCad_IDT object= (MPBMetPbokBscMngSelectMsgCad_IDT)super.clone();
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
		
		result= prime * result + ((this.metMsgCadDscd==null)?0:this.metMsgCadDscd.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MPBMetPbokBscMngSelectMsgCad_IDT other= (MPBMetPbokBscMngSelectMsgCad_IDT)obj;
		{
			Object _metMsgCadDscd= getMetMsgCadDscd();
			Object __metMsgCadDscd= other.getMetMsgCadDscd();
			if ( _metMsgCadDscd== null ) { if ( __metMsgCadDscd!= null ) return false; }
			else if ( !_metMsgCadDscd.equals(__metMsgCadDscd) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MPBMetPbokBscMngSelectMsgCad_IDT.class.getName()).append(":\n");
		sb.append("\tmetMsgCadDscd: ");
		sb.append(metMsgCadDscd==null?"null":getMetMsgCadDscd());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 2; /* metMsgCadDscd */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("metMsgCadDscd");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("metMsgCadDscd", get("metMsgCadDscd"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 1918393937:/* metMsgCadDscd */
			return getMetMsgCadDscd();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 1918393937:/* metMsgCadDscd */
			setMetMsgCadDscd((String)value);
			break;
		default:
			break;
		}
	}
	
}
