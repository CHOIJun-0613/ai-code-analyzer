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
	"scsCnt"
}, name="MPBMetPbokBscMngInsertMetPbokAutoRptPush_ODT")
@XmlRootElement(name="MPBMetPbokBscMngInsertMetPbokAutoRptPush_ODT")
@BxmCategory(logicalName="모임통장.관리.자동.리포트.푸쉬.생성.컨트롤러.출력.IO", description="") 
public class MPBMetPbokBscMngInsertMetPbokAutoRptPush_ODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -887110934L;
	
	
	
	/**
	 * 성공건수
	 */
	@ApiModelProperty(
		name = "scsCnt"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("scsCnt")
	@BxmOmm_Field(length=3, decimal=0, description="성공건수", align="left", fill="")
	private Integer scsCnt= 0;
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_scsCnt= false;
	protected final boolean isSet_scsCnt(){
		return this.isSet_scsCnt;
	}
	private void setIsSet_scsCnt(boolean value){
		this.isSet_scsCnt= value;
	}
	/**
	 * 성공건수
	 */
	@XmlTransient
	public Integer getScsCnt(){
		return this.scsCnt;
	}
	
	/**
	 * 성공건수
	 * 
	 * @param scsCnt 성공건수
	 */
	public void setScsCnt(Integer scsCnt){
		this.scsCnt= scsCnt;
		this.setIsSet_scsCnt(true);
	}
				
	@Override
	public MPBMetPbokBscMngInsertMetPbokAutoRptPush_ODT clone(){
		try{
			MPBMetPbokBscMngInsertMetPbokAutoRptPush_ODT object= (MPBMetPbokBscMngInsertMetPbokAutoRptPush_ODT)super.clone();
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
		
		result= prime * result + ((this.scsCnt==null)?0:this.scsCnt.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MPBMetPbokBscMngInsertMetPbokAutoRptPush_ODT other= (MPBMetPbokBscMngInsertMetPbokAutoRptPush_ODT)obj;
		{
			Object _scsCnt= getScsCnt();
			Object __scsCnt= other.getScsCnt();
			if ( _scsCnt== null ) { if ( __scsCnt!= null ) return false; }
			else if ( !_scsCnt.equals(__scsCnt) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MPBMetPbokBscMngInsertMetPbokAutoRptPush_ODT.class.getName()).append(":\n");
		sb.append("\tscsCnt: ");
		sb.append(scsCnt==null?"null":getScsCnt());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 3; /* scsCnt */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("scsCnt");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("scsCnt", get("scsCnt"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -907692474:/* scsCnt */
			return getScsCnt();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -907692474:/* scsCnt */
			setScsCnt((Integer)value);
			break;
		default:
			break;
		}
	}
	
}
