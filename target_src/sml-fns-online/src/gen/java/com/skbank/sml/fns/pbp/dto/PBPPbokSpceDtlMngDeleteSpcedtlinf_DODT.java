/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.pbp.dto;

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
	"delCnt"
}, name="PBPPbokSpceDtlMngDeleteSpcedtlinf_DODT")
@XmlRootElement(name="PBPPbokSpceDtlMngDeleteSpcedtlinf_DODT")
@BxmCategory(logicalName="공간.상세.정보.삭제.DBM.출력.IO", description="") 
public class PBPPbokSpceDtlMngDeleteSpcedtlinf_DODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -1889967707L;
	
	
	
	/**
	 * 삭제건수
	 */
	@ApiModelProperty(
		name = "delCnt"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("delCnt")
	@BxmOmm_Field(length=1, decimal=0, description="삭제건수", align="right", fill="")
	private Integer delCnt= 0;
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_delCnt= false;
	protected final boolean isSet_delCnt(){
		return this.isSet_delCnt;
	}
	private void setIsSet_delCnt(boolean value){
		this.isSet_delCnt= value;
	}
	/**
	 * 삭제건수
	 */
	@XmlTransient
	public Integer getDelCnt(){
		return this.delCnt;
	}
	
	/**
	 * 삭제건수
	 * 
	 * @param delCnt 삭제건수
	 */
	public void setDelCnt(Integer delCnt){
		this.delCnt= delCnt;
		this.setIsSet_delCnt(true);
	}
				
	@Override
	public PBPPbokSpceDtlMngDeleteSpcedtlinf_DODT clone(){
		try{
			PBPPbokSpceDtlMngDeleteSpcedtlinf_DODT object= (PBPPbokSpceDtlMngDeleteSpcedtlinf_DODT)super.clone();
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
		
		result= prime * result + ((this.delCnt==null)?0:this.delCnt.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final PBPPbokSpceDtlMngDeleteSpcedtlinf_DODT other= (PBPPbokSpceDtlMngDeleteSpcedtlinf_DODT)obj;
		{
			Object _delCnt= getDelCnt();
			Object __delCnt= other.getDelCnt();
			if ( _delCnt== null ) { if ( __delCnt!= null ) return false; }
			else if ( !_delCnt.equals(__delCnt) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(PBPPbokSpceDtlMngDeleteSpcedtlinf_DODT.class.getName()).append(":\n");
		sb.append("\tdelCnt: ");
		sb.append(delCnt==null?"null":getDelCnt());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 1; /* delCnt */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("delCnt");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("delCnt", get("delCnt"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -1335491234:/* delCnt */
			return getDelCnt();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -1335491234:/* delCnt */
			setDelCnt((Integer)value);
			break;
		default:
			break;
		}
	}
	
}
