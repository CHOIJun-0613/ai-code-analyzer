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
 * SMS인증번호발송IDT
 */
@XmlType(propOrder={
	"hpNo"
}, name="INBSmsRawNtcSrvcCallSmsCrtfNoSnd_IDT")
@XmlRootElement(name="INBSmsRawNtcSrvcCallSmsCrtfNoSnd_IDT")
@BxmCategory(logicalName="SMS인증번호발송IDT", description="SMS인증번호발송IDT") 
public class INBSmsRawNtcSrvcCallSmsCrtfNoSnd_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -1324737440L;
	
	
	
	/**
	 * 핸드폰번호
	 */
	@ApiModelProperty(
		name = "hpNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("hpNo")
	@BxmOmm_Field(length=14, decimal=0, description="핸드폰번호", align="left", fill="", comment="AS-IS : TCH_USE_HP_NO")
	private String hpNo= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_hpNo= false;
	protected final boolean isSet_hpNo(){
		return this.isSet_hpNo;
	}
	private void setIsSet_hpNo(boolean value){
		this.isSet_hpNo= value;
	}
	/**
	 * 핸드폰번호
	 */
	@XmlTransient
	public String getHpNo(){
		return this.hpNo;
	}
	
	/**
	 * 핸드폰번호
	 * 
	 * @param hpNo 핸드폰번호
	 */
	public void setHpNo(String hpNo){
		this.hpNo= hpNo;
		this.setIsSet_hpNo(true);
	}
				
	@Override
	public INBSmsRawNtcSrvcCallSmsCrtfNoSnd_IDT clone(){
		try{
			INBSmsRawNtcSrvcCallSmsCrtfNoSnd_IDT object= (INBSmsRawNtcSrvcCallSmsCrtfNoSnd_IDT)super.clone();
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
		
		result= prime * result + ((this.hpNo==null)?0:this.hpNo.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final INBSmsRawNtcSrvcCallSmsCrtfNoSnd_IDT other= (INBSmsRawNtcSrvcCallSmsCrtfNoSnd_IDT)obj;
		{
			Object _hpNo= getHpNo();
			Object __hpNo= other.getHpNo();
			if ( _hpNo== null ) { if ( __hpNo!= null ) return false; }
			else if ( !_hpNo.equals(__hpNo) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(INBSmsRawNtcSrvcCallSmsCrtfNoSnd_IDT.class.getName()).append(":\n");
		sb.append("\thpNo: ");
		sb.append(hpNo==null?"null":getHpNo());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 14; /* hpNo */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("hpNo");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("hpNo", get("hpNo"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 3208425:/* hpNo */
			return getHpNo();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 3208425:/* hpNo */
			setHpNo((String)value);
			break;
		default:
			break;
		}
	}
	
}
