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
 * 투자전략 동의 여부 IO
 */
@XmlType(propOrder={
	"sbscCnt"
}, name="UCM_SUP_EVT_DTL001SelectIvstStgNtfcagrYn_DODT")
@XmlRootElement(name="UCM_SUP_EVT_DTL001SelectIvstStgNtfcagrYn_DODT")
@BxmCategory(logicalName="투자전략.동의여부.DBM.출력.IO", description="투자전략 동의 여부 IO") 
public class UCM_SUP_EVT_DTL001SelectIvstStgNtfcagrYn_DODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -35478202L;
	
	
	
	/**
	 * 구독개수
	 */
	@ApiModelProperty(
		name = "sbscCnt"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("sbscCnt")
	@BxmOmm_Field(length=5, decimal=0, description="구독개수", align="right", fill="")
	private Integer sbscCnt= 0;
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_sbscCnt= false;
	protected final boolean isSet_sbscCnt(){
		return this.isSet_sbscCnt;
	}
	private void setIsSet_sbscCnt(boolean value){
		this.isSet_sbscCnt= value;
	}
	/**
	 * 구독개수
	 */
	@XmlTransient
	public Integer getSbscCnt(){
		return this.sbscCnt;
	}
	
	/**
	 * 구독개수
	 * 
	 * @param sbscCnt 구독개수
	 */
	public void setSbscCnt(Integer sbscCnt){
		this.sbscCnt= sbscCnt;
		this.setIsSet_sbscCnt(true);
	}
				
	@Override
	public UCM_SUP_EVT_DTL001SelectIvstStgNtfcagrYn_DODT clone(){
		try{
			UCM_SUP_EVT_DTL001SelectIvstStgNtfcagrYn_DODT object= (UCM_SUP_EVT_DTL001SelectIvstStgNtfcagrYn_DODT)super.clone();
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
		
		result= prime * result + ((this.sbscCnt==null)?0:this.sbscCnt.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final UCM_SUP_EVT_DTL001SelectIvstStgNtfcagrYn_DODT other= (UCM_SUP_EVT_DTL001SelectIvstStgNtfcagrYn_DODT)obj;
		{
			Object _sbscCnt= getSbscCnt();
			Object __sbscCnt= other.getSbscCnt();
			if ( _sbscCnt== null ) { if ( __sbscCnt!= null ) return false; }
			else if ( !_sbscCnt.equals(__sbscCnt) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(UCM_SUP_EVT_DTL001SelectIvstStgNtfcagrYn_DODT.class.getName()).append(":\n");
		sb.append("\tsbscCnt: ");
		sb.append(sbscCnt==null?"null":getSbscCnt());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 5; /* sbscCnt */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("sbscCnt");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("sbscCnt", get("sbscCnt"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 1898587146:/* sbscCnt */
			return getSbscCnt();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 1898587146:/* sbscCnt */
			setSbscCnt((Integer)value);
			break;
		default:
			break;
		}
	}
	
}
