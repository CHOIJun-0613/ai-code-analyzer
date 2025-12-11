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
	"metMngNo", "reloadCnt"
}, name="MPBMetPbokBscMngSelectNtarInf_IDT")
@XmlRootElement(name="MPBMetPbokBscMngSelectNtarInf_IDT")
@BxmCategory(logicalName="공지사항.정보.조회.컨트롤러.입력.IO", description="") 
public class MPBMetPbokBscMngSelectNtarInf_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 2074585678L;
	
	
	
	/**
	 * 모임관리번호 
	 */
	@ApiModelProperty(
		name = "metMngNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metMngNo")
	@BxmOmm_Field(length=9, decimal=0, description="모임관리번호 ", align="left", fill="")
	private String metMngNo= "";
	
	
	/**
	 * 재조회건수
	 */
	@ApiModelProperty(
		name = "reloadCnt"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("reloadCnt")
	@BxmOmm_Field(length=2, decimal=0, description="재조회건수", align="right", fill="")
	private Integer reloadCnt= 0;
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metMngNo= false;
	protected final boolean isSet_metMngNo(){
		return this.isSet_metMngNo;
	}
	private void setIsSet_metMngNo(boolean value){
		this.isSet_metMngNo= value;
	}
	/**
	 * 모임관리번호 
	 */
	@XmlTransient
	public String getMetMngNo(){
		return this.metMngNo;
	}
	
	/**
	 * 모임관리번호 
	 * 
	 * @param metMngNo 모임관리번호 
	 */
	public void setMetMngNo(String metMngNo){
		this.metMngNo= metMngNo;
		this.setIsSet_metMngNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_reloadCnt= false;
	protected final boolean isSet_reloadCnt(){
		return this.isSet_reloadCnt;
	}
	private void setIsSet_reloadCnt(boolean value){
		this.isSet_reloadCnt= value;
	}
	/**
	 * 재조회건수
	 */
	@XmlTransient
	public Integer getReloadCnt(){
		return this.reloadCnt;
	}
	
	/**
	 * 재조회건수
	 * 
	 * @param reloadCnt 재조회건수
	 */
	public void setReloadCnt(Integer reloadCnt){
		this.reloadCnt= reloadCnt;
		this.setIsSet_reloadCnt(true);
	}
				
	@Override
	public MPBMetPbokBscMngSelectNtarInf_IDT clone(){
		try{
			MPBMetPbokBscMngSelectNtarInf_IDT object= (MPBMetPbokBscMngSelectNtarInf_IDT)super.clone();
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
		
		result= prime * result + ((this.metMngNo==null)?0:this.metMngNo.hashCode());
		result= prime * result + ((this.reloadCnt==null)?0:this.reloadCnt.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MPBMetPbokBscMngSelectNtarInf_IDT other= (MPBMetPbokBscMngSelectNtarInf_IDT)obj;
		{
			Object _metMngNo= getMetMngNo();
			Object __metMngNo= other.getMetMngNo();
			if ( _metMngNo== null ) { if ( __metMngNo!= null ) return false; }
			else if ( !_metMngNo.equals(__metMngNo) ) return false;
		}
		{
			Object _reloadCnt= getReloadCnt();
			Object __reloadCnt= other.getReloadCnt();
			if ( _reloadCnt== null ) { if ( __reloadCnt!= null ) return false; }
			else if ( !_reloadCnt.equals(__reloadCnt) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MPBMetPbokBscMngSelectNtarInf_IDT.class.getName()).append(":\n");
		sb.append("\tmetMngNo: ");
		sb.append(metMngNo==null?"null":getMetMngNo());
		sb.append("\n");
		sb.append("\treloadCnt: ");
		sb.append(reloadCnt==null?"null":getReloadCnt());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 9; /* metMngNo */
		messageLen+= 2; /* reloadCnt */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("metMngNo");
		list.add("reloadCnt");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("metMngNo", get("metMngNo"));
		map.put("reloadCnt", get("reloadCnt"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -468172085:/* metMngNo */
			return getMetMngNo();
		case 375420176:/* reloadCnt */
			return getReloadCnt();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -468172085:/* metMngNo */
			setMetMngNo((String)value);
			break;
		case 375420176:/* reloadCnt */
			setReloadCnt((Integer)value);
			break;
		default:
			break;
		}
	}
	
}
