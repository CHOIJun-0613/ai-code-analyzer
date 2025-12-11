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
 * SMS인증번호확인ODT
 */
@XmlType(propOrder={
	"crtfNoRslt"
}, name="INBSmsRawNtcSrvcCallSmsCrtfNoChk_ODT")
@XmlRootElement(name="INBSmsRawNtcSrvcCallSmsCrtfNoChk_ODT")
@BxmCategory(logicalName="SMS인증번호확인ODT", description="SMS인증번호확인ODT") 
public class INBSmsRawNtcSrvcCallSmsCrtfNoChk_ODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 1489768355L;
	
	
	
	/**
	 * 인증번호결과
	 */
	@ApiModelProperty(
		name = "crtfNoRslt"
		, dataType = "java.lang.Boolean"
		)
	@XmlElement
	@JsonProperty("crtfNoRslt")
	@BxmOmm_Field(length=1, decimal=0, description="인증번호결과", align="left", fill="")
	private Boolean crtfNoRslt= false;
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_crtfNoRslt= false;
	protected final boolean isSet_crtfNoRslt(){
		return this.isSet_crtfNoRslt;
	}
	private void setIsSet_crtfNoRslt(boolean value){
		this.isSet_crtfNoRslt= value;
	}
	/**
	 * 인증번호결과
	 */
	@XmlTransient
	public Boolean isCrtfNoRslt(){
		return this.crtfNoRslt;
	}
	
	/**
	 * 인증번호결과
	 * 
	 * @param crtfNoRslt 인증번호결과
	 */
	public void setCrtfNoRslt(Boolean crtfNoRslt){
		this.crtfNoRslt= crtfNoRslt;
		this.setIsSet_crtfNoRslt(true);
	}
				
	@Override
	public INBSmsRawNtcSrvcCallSmsCrtfNoChk_ODT clone(){
		try{
			INBSmsRawNtcSrvcCallSmsCrtfNoChk_ODT object= (INBSmsRawNtcSrvcCallSmsCrtfNoChk_ODT)super.clone();
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
		
		result= prime * result + ((this.crtfNoRslt==null)?0:this.crtfNoRslt.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final INBSmsRawNtcSrvcCallSmsCrtfNoChk_ODT other= (INBSmsRawNtcSrvcCallSmsCrtfNoChk_ODT)obj;
		{
			Object _crtfNoRslt= isCrtfNoRslt();
			Object __crtfNoRslt= other.isCrtfNoRslt();
			if ( _crtfNoRslt== null ) { if ( __crtfNoRslt!= null ) return false; }
			else if ( !_crtfNoRslt.equals(__crtfNoRslt) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(INBSmsRawNtcSrvcCallSmsCrtfNoChk_ODT.class.getName()).append(":\n");
		sb.append("\tcrtfNoRslt: ");
		sb.append(crtfNoRslt==null?"null":isCrtfNoRslt());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 1; /* crtfNoRslt */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("crtfNoRslt");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("crtfNoRslt", get("crtfNoRslt"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 805393259:/* crtfNoRslt */
			return isCrtfNoRslt();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 805393259:/* crtfNoRslt */
			setCrtfNoRslt((Boolean)value);
			break;
		default:
			break;
		}
	}
	
}
