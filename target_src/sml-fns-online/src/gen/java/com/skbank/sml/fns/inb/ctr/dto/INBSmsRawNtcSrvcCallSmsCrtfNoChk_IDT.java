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
 * SMS인증번호확인IDT
 */
@XmlType(propOrder={
	"crtfNo"
}, name="INBSmsRawNtcSrvcCallSmsCrtfNoChk_IDT")
@XmlRootElement(name="INBSmsRawNtcSrvcCallSmsCrtfNoChk_IDT")
@BxmCategory(logicalName="SMS인증번호확인IDT", description="SMS인증번호확인IDT") 
public class INBSmsRawNtcSrvcCallSmsCrtfNoChk_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 1489762589L;
	
	
	
	/**
	 * 인증번호
	 */
	@ApiModelProperty(
		name = "crtfNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("crtfNo")
	@BxmOmm_Field(length=4, decimal=0, description="인증번호", align="left", fill="")
	private String crtfNo= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_crtfNo= false;
	protected final boolean isSet_crtfNo(){
		return this.isSet_crtfNo;
	}
	private void setIsSet_crtfNo(boolean value){
		this.isSet_crtfNo= value;
	}
	/**
	 * 인증번호
	 */
	@XmlTransient
	public String getCrtfNo(){
		return this.crtfNo;
	}
	
	/**
	 * 인증번호
	 * 
	 * @param crtfNo 인증번호
	 */
	public void setCrtfNo(String crtfNo){
		this.crtfNo= crtfNo;
		this.setIsSet_crtfNo(true);
	}
				
	@Override
	public INBSmsRawNtcSrvcCallSmsCrtfNoChk_IDT clone(){
		try{
			INBSmsRawNtcSrvcCallSmsCrtfNoChk_IDT object= (INBSmsRawNtcSrvcCallSmsCrtfNoChk_IDT)super.clone();
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
		
		result= prime * result + ((this.crtfNo==null)?0:this.crtfNo.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final INBSmsRawNtcSrvcCallSmsCrtfNoChk_IDT other= (INBSmsRawNtcSrvcCallSmsCrtfNoChk_IDT)obj;
		{
			Object _crtfNo= getCrtfNo();
			Object __crtfNo= other.getCrtfNo();
			if ( _crtfNo== null ) { if ( __crtfNo!= null ) return false; }
			else if ( !_crtfNo.equals(__crtfNo) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(INBSmsRawNtcSrvcCallSmsCrtfNoChk_IDT.class.getName()).append(":\n");
		sb.append("\tcrtfNo: ");
		sb.append(crtfNo==null?"null":getCrtfNo());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 4; /* crtfNo */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("crtfNo");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("crtfNo", get("crtfNo"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -1351843646:/* crtfNo */
			return getCrtfNo();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -1351843646:/* crtfNo */
			setCrtfNo((String)value);
			break;
		default:
			break;
		}
	}
	
}
