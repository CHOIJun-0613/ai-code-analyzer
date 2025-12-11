/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.inb.dto;

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
 * 선불서비스 학교기본정보_틴틴급식알림동의여부IDT
 */
@XmlType(propOrder={
	"cusCiNo"
}, name="UCM_PP_SCHUL_INFOselectTeenTeenPvmNtfcAgrYn_DIDT")
@XmlRootElement(name="UCM_PP_SCHUL_INFOselectTeenTeenPvmNtfcAgrYn_DIDT")
@BxmCategory(logicalName="선불서비스 학교기본정보_틴틴급식알림동의여부IDT", description="선불서비스 학교기본정보_틴틴급식알림동의여부IDT") 
public class UCM_PP_SCHUL_INFOselectTeenTeenPvmNtfcAgrYn_DIDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -1628122144L;
	
	
	
	/**
	 * 고객CI번호
	 */
	@ApiModelProperty(
		name = "cusCiNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("cusCiNo")
	@BxmOmm_Field(length=88, decimal=0, description="고객CI번호", align="left", fill="")
	private String cusCiNo= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cusCiNo= false;
	protected final boolean isSet_cusCiNo(){
		return this.isSet_cusCiNo;
	}
	private void setIsSet_cusCiNo(boolean value){
		this.isSet_cusCiNo= value;
	}
	/**
	 * 고객CI번호
	 */
	@XmlTransient
	public String getCusCiNo(){
		return this.cusCiNo;
	}
	
	/**
	 * 고객CI번호
	 * 
	 * @param cusCiNo 고객CI번호
	 */
	public void setCusCiNo(String cusCiNo){
		this.cusCiNo= cusCiNo;
		this.setIsSet_cusCiNo(true);
	}
				
	@Override
	public UCM_PP_SCHUL_INFOselectTeenTeenPvmNtfcAgrYn_DIDT clone(){
		try{
			UCM_PP_SCHUL_INFOselectTeenTeenPvmNtfcAgrYn_DIDT object= (UCM_PP_SCHUL_INFOselectTeenTeenPvmNtfcAgrYn_DIDT)super.clone();
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
		
		result= prime * result + ((this.cusCiNo==null)?0:this.cusCiNo.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final UCM_PP_SCHUL_INFOselectTeenTeenPvmNtfcAgrYn_DIDT other= (UCM_PP_SCHUL_INFOselectTeenTeenPvmNtfcAgrYn_DIDT)obj;
		{
			Object _cusCiNo= getCusCiNo();
			Object __cusCiNo= other.getCusCiNo();
			if ( _cusCiNo== null ) { if ( __cusCiNo!= null ) return false; }
			else if ( !_cusCiNo.equals(__cusCiNo) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(UCM_PP_SCHUL_INFOselectTeenTeenPvmNtfcAgrYn_DIDT.class.getName()).append(":\n");
		sb.append("\tcusCiNo: ");
		sb.append(cusCiNo==null?"null":getCusCiNo());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 88; /* cusCiNo */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("cusCiNo");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("cusCiNo", get("cusCiNo"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 1126466216:/* cusCiNo */
			return getCusCiNo();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 1126466216:/* cusCiNo */
			setCusCiNo((String)value);
			break;
		default:
			break;
		}
	}
	
}
