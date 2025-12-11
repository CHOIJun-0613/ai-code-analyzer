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
 * 통장쪼개기.자동납부.등록 out
 */
@XmlType(propOrder={
	"atpmRgsCnt"
}, name="PBPSpceAtpmRgs_ODT")
@XmlRootElement(name="PBPSpceAtpmRgs_ODT")
@BxmCategory(logicalName="공간.자동납부.등록.컨트롤러.출력.IO", description="통장쪼개기.자동납부.등록 out") 
public class PBPSpceAtpmRgs_ODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 480189933L;
	
	
	
	/**
	 * 자동납부등록건수
	 */
	@ApiModelProperty(
		name = "atpmRgsCnt"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("atpmRgsCnt")
	@BxmOmm_Field(length=3, decimal=0, description="자동납부등록건수", align="right", fill="")
	private Integer atpmRgsCnt= 0;
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atpmRgsCnt= false;
	protected final boolean isSet_atpmRgsCnt(){
		return this.isSet_atpmRgsCnt;
	}
	private void setIsSet_atpmRgsCnt(boolean value){
		this.isSet_atpmRgsCnt= value;
	}
	/**
	 * 자동납부등록건수
	 */
	@XmlTransient
	public Integer getAtpmRgsCnt(){
		return this.atpmRgsCnt;
	}
	
	/**
	 * 자동납부등록건수
	 * 
	 * @param atpmRgsCnt 자동납부등록건수
	 */
	public void setAtpmRgsCnt(Integer atpmRgsCnt){
		this.atpmRgsCnt= atpmRgsCnt;
		this.setIsSet_atpmRgsCnt(true);
	}
				
	@Override
	public PBPSpceAtpmRgs_ODT clone(){
		try{
			PBPSpceAtpmRgs_ODT object= (PBPSpceAtpmRgs_ODT)super.clone();
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
		
		result= prime * result + ((this.atpmRgsCnt==null)?0:this.atpmRgsCnt.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final PBPSpceAtpmRgs_ODT other= (PBPSpceAtpmRgs_ODT)obj;
		{
			Object _atpmRgsCnt= getAtpmRgsCnt();
			Object __atpmRgsCnt= other.getAtpmRgsCnt();
			if ( _atpmRgsCnt== null ) { if ( __atpmRgsCnt!= null ) return false; }
			else if ( !_atpmRgsCnt.equals(__atpmRgsCnt) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(PBPSpceAtpmRgs_ODT.class.getName()).append(":\n");
		sb.append("\tatpmRgsCnt: ");
		sb.append(atpmRgsCnt==null?"null":getAtpmRgsCnt());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 3; /* atpmRgsCnt */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("atpmRgsCnt");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("atpmRgsCnt", get("atpmRgsCnt"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 1227828539:/* atpmRgsCnt */
			return getAtpmRgsCnt();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 1227828539:/* atpmRgsCnt */
			setAtpmRgsCnt((Integer)value);
			break;
		default:
			break;
		}
	}
	
}
