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
	"scrtMdUsgYn", "dniAcnmCnfYn"
}, name="MPBMetPbokBscMngSelectMetPbokCmnScrtCrtf_IDT")
@XmlRootElement(name="MPBMetPbokBscMngSelectMetPbokCmnScrtCrtf_IDT")
@BxmCategory(logicalName="모임통장.공통.보안인증.셋팅.입력.IO", description="") 
public class MPBMetPbokBscMngSelectMetPbokCmnScrtCrtf_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 2095674909L;
	
	
	
	/**
	 * 보안매체사용여부
	 */
	@ApiModelProperty(
		name = "scrtMdUsgYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("scrtMdUsgYn")
	@BxmOmm_Field(length=1, decimal=0, description="보안매체사용여부", align="left", fill="")
	private String scrtMdUsgYn= "";
	
	
	/**
	 * 비대면실명확인여부 
	 */
	@ApiModelProperty(
		name = "dniAcnmCnfYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dniAcnmCnfYn")
	@BxmOmm_Field(length=1, decimal=0, description="비대면실명확인여부 ", align="left", fill="")
	private String dniAcnmCnfYn= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_scrtMdUsgYn= false;
	protected final boolean isSet_scrtMdUsgYn(){
		return this.isSet_scrtMdUsgYn;
	}
	private void setIsSet_scrtMdUsgYn(boolean value){
		this.isSet_scrtMdUsgYn= value;
	}
	/**
	 * 보안매체사용여부
	 */
	@XmlTransient
	public String getScrtMdUsgYn(){
		return this.scrtMdUsgYn;
	}
	
	/**
	 * 보안매체사용여부
	 * 
	 * @param scrtMdUsgYn 보안매체사용여부
	 */
	public void setScrtMdUsgYn(String scrtMdUsgYn){
		this.scrtMdUsgYn= scrtMdUsgYn;
		this.setIsSet_scrtMdUsgYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dniAcnmCnfYn= false;
	protected final boolean isSet_dniAcnmCnfYn(){
		return this.isSet_dniAcnmCnfYn;
	}
	private void setIsSet_dniAcnmCnfYn(boolean value){
		this.isSet_dniAcnmCnfYn= value;
	}
	/**
	 * 비대면실명확인여부 
	 */
	@XmlTransient
	public String getDniAcnmCnfYn(){
		return this.dniAcnmCnfYn;
	}
	
	/**
	 * 비대면실명확인여부 
	 * 
	 * @param dniAcnmCnfYn 비대면실명확인여부 
	 */
	public void setDniAcnmCnfYn(String dniAcnmCnfYn){
		this.dniAcnmCnfYn= dniAcnmCnfYn;
		this.setIsSet_dniAcnmCnfYn(true);
	}
				
	@Override
	public MPBMetPbokBscMngSelectMetPbokCmnScrtCrtf_IDT clone(){
		try{
			MPBMetPbokBscMngSelectMetPbokCmnScrtCrtf_IDT object= (MPBMetPbokBscMngSelectMetPbokCmnScrtCrtf_IDT)super.clone();
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
		
		result= prime * result + ((this.scrtMdUsgYn==null)?0:this.scrtMdUsgYn.hashCode());
		result= prime * result + ((this.dniAcnmCnfYn==null)?0:this.dniAcnmCnfYn.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MPBMetPbokBscMngSelectMetPbokCmnScrtCrtf_IDT other= (MPBMetPbokBscMngSelectMetPbokCmnScrtCrtf_IDT)obj;
		{
			Object _scrtMdUsgYn= getScrtMdUsgYn();
			Object __scrtMdUsgYn= other.getScrtMdUsgYn();
			if ( _scrtMdUsgYn== null ) { if ( __scrtMdUsgYn!= null ) return false; }
			else if ( !_scrtMdUsgYn.equals(__scrtMdUsgYn) ) return false;
		}
		{
			Object _dniAcnmCnfYn= getDniAcnmCnfYn();
			Object __dniAcnmCnfYn= other.getDniAcnmCnfYn();
			if ( _dniAcnmCnfYn== null ) { if ( __dniAcnmCnfYn!= null ) return false; }
			else if ( !_dniAcnmCnfYn.equals(__dniAcnmCnfYn) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MPBMetPbokBscMngSelectMetPbokCmnScrtCrtf_IDT.class.getName()).append(":\n");
		sb.append("\tscrtMdUsgYn: ");
		sb.append(scrtMdUsgYn==null?"null":getScrtMdUsgYn());
		sb.append("\n");
		sb.append("\tdniAcnmCnfYn: ");
		sb.append(dniAcnmCnfYn==null?"null":getDniAcnmCnfYn());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 1; /* scrtMdUsgYn */
		messageLen+= 1; /* dniAcnmCnfYn */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("scrtMdUsgYn");
		list.add("dniAcnmCnfYn");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("scrtMdUsgYn", get("scrtMdUsgYn"));
		map.put("dniAcnmCnfYn", get("dniAcnmCnfYn"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 208462389:/* scrtMdUsgYn */
			return getScrtMdUsgYn();
		case 2014231184:/* dniAcnmCnfYn */
			return getDniAcnmCnfYn();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 208462389:/* scrtMdUsgYn */
			setScrtMdUsgYn((String)value);
			break;
		case 2014231184:/* dniAcnmCnfYn */
			setDniAcnmCnfYn((String)value);
			break;
		default:
			break;
		}
	}
	
}
