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
	"atpmMngNo"
}, name="PBPPbokSpceDtlEstInsertSpcedtlestlist_IDT")
@XmlRootElement(name="PBPPbokSpceDtlEstInsertSpcedtlestlist_IDT")
@BxmCategory(logicalName="공간.상세.자동납부.설정.등록.목록.컨트롤러.입력.IO", description="") 
public class PBPPbokSpceDtlEstInsertSpcedtlestlist_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -1117652749L;
	
	
	
	/**
	 * 자동납부관리번호
	 */
	@ApiModelProperty(
		name = "atpmMngNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atpmMngNo")
	@BxmOmm_Field(length=13, decimal=0, description="자동납부관리번호", align="left", fill="")
	private String atpmMngNo= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atpmMngNo= false;
	protected final boolean isSet_atpmMngNo(){
		return this.isSet_atpmMngNo;
	}
	private void setIsSet_atpmMngNo(boolean value){
		this.isSet_atpmMngNo= value;
	}
	/**
	 * 자동납부관리번호
	 */
	@XmlTransient
	public String getAtpmMngNo(){
		return this.atpmMngNo;
	}
	
	/**
	 * 자동납부관리번호
	 * 
	 * @param atpmMngNo 자동납부관리번호
	 */
	public void setAtpmMngNo(String atpmMngNo){
		this.atpmMngNo= atpmMngNo;
		this.setIsSet_atpmMngNo(true);
	}
				
	@Override
	public PBPPbokSpceDtlEstInsertSpcedtlestlist_IDT clone(){
		try{
			PBPPbokSpceDtlEstInsertSpcedtlestlist_IDT object= (PBPPbokSpceDtlEstInsertSpcedtlestlist_IDT)super.clone();
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
		
		result= prime * result + ((this.atpmMngNo==null)?0:this.atpmMngNo.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final PBPPbokSpceDtlEstInsertSpcedtlestlist_IDT other= (PBPPbokSpceDtlEstInsertSpcedtlestlist_IDT)obj;
		{
			Object _atpmMngNo= getAtpmMngNo();
			Object __atpmMngNo= other.getAtpmMngNo();
			if ( _atpmMngNo== null ) { if ( __atpmMngNo!= null ) return false; }
			else if ( !_atpmMngNo.equals(__atpmMngNo) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(PBPPbokSpceDtlEstInsertSpcedtlestlist_IDT.class.getName()).append(":\n");
		sb.append("\tatpmMngNo: ");
		sb.append(atpmMngNo==null?"null":getAtpmMngNo());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 13; /* atpmMngNo */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("atpmMngNo");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("atpmMngNo", get("atpmMngNo"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 589376439:/* atpmMngNo */
			return getAtpmMngNo();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 589376439:/* atpmMngNo */
			setAtpmMngNo((String)value);
			break;
		default:
			break;
		}
	}
	
}
