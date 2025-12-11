/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.pbp.ctr.dto;

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
	"ntfcAcnoCnt"
}, name="PBPPbokSpceBscMngUpdateNtfcAgrYn_ODT")
@XmlRootElement(name="PBPPbokSpceBscMngUpdateNtfcAgrYn_ODT")
@BxmCategory(logicalName="공간.서비스.알림.여부.컨트롤러.출력.IO", description="") 
public class PBPPbokSpceBscMngUpdateNtfcAgrYn_ODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -1716395406L;
	
	
	
	/**
	 * 알림계좌건수
	 */
	@ApiModelProperty(
		name = "ntfcAcnoCnt"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("ntfcAcnoCnt")
	@BxmOmm_Field(length=3, decimal=0, description="알림계좌건수", align="right", fill="")
	private Integer ntfcAcnoCnt= 0;
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ntfcAcnoCnt= false;
	protected final boolean isSet_ntfcAcnoCnt(){
		return this.isSet_ntfcAcnoCnt;
	}
	private void setIsSet_ntfcAcnoCnt(boolean value){
		this.isSet_ntfcAcnoCnt= value;
	}
	/**
	 * 알림계좌건수
	 */
	@XmlTransient
	public Integer getNtfcAcnoCnt(){
		return this.ntfcAcnoCnt;
	}
	
	/**
	 * 알림계좌건수
	 * 
	 * @param ntfcAcnoCnt 알림계좌건수
	 */
	public void setNtfcAcnoCnt(Integer ntfcAcnoCnt){
		this.ntfcAcnoCnt= ntfcAcnoCnt;
		this.setIsSet_ntfcAcnoCnt(true);
	}
				
	@Override
	public PBPPbokSpceBscMngUpdateNtfcAgrYn_ODT clone(){
		try{
			PBPPbokSpceBscMngUpdateNtfcAgrYn_ODT object= (PBPPbokSpceBscMngUpdateNtfcAgrYn_ODT)super.clone();
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
		
		result= prime * result + ((this.ntfcAcnoCnt==null)?0:this.ntfcAcnoCnt.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final PBPPbokSpceBscMngUpdateNtfcAgrYn_ODT other= (PBPPbokSpceBscMngUpdateNtfcAgrYn_ODT)obj;
		{
			Object _ntfcAcnoCnt= getNtfcAcnoCnt();
			Object __ntfcAcnoCnt= other.getNtfcAcnoCnt();
			if ( _ntfcAcnoCnt== null ) { if ( __ntfcAcnoCnt!= null ) return false; }
			else if ( !_ntfcAcnoCnt.equals(__ntfcAcnoCnt) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(PBPPbokSpceBscMngUpdateNtfcAgrYn_ODT.class.getName()).append(":\n");
		sb.append("\tntfcAcnoCnt: ");
		sb.append(ntfcAcnoCnt==null?"null":getNtfcAcnoCnt());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 3; /* ntfcAcnoCnt */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("ntfcAcnoCnt");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("ntfcAcnoCnt", get("ntfcAcnoCnt"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 143330947:/* ntfcAcnoCnt */
			return getNtfcAcnoCnt();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 143330947:/* ntfcAcnoCnt */
			setNtfcAcnoCnt((Integer)value);
			break;
		default:
			break;
		}
	}
	
}
