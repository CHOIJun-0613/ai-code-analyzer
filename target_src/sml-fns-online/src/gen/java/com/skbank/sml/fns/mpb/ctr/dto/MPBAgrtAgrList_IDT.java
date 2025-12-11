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
	"agrtDscd", "agrtId", "agrtAgrYn"
}, name="MPBAgrtAgrList_IDT")
@XmlRootElement(name="MPBAgrtAgrList_IDT")
@BxmCategory(logicalName="약관동의.목록.컨트롤러.입력.IO", description="") 
public class MPBAgrtAgrList_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 1409213272L;
	
	
	
	/**
	 * 약관구분코드
	 */
	@ApiModelProperty(
		name = "agrtDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("agrtDscd")
	@BxmOmm_Field(length=2, decimal=0, description="약관구분코드", align="left", fill="")
	private String agrtDscd= "";
	
	
	/**
	 * 약관ID
	 */
	@ApiModelProperty(
		name = "agrtId"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("agrtId")
	@BxmOmm_Field(length=10, decimal=0, description="약관ID", align="left", fill="")
	private String agrtId= "";
	
	
	/**
	 * 약관동의여부
	 */
	@ApiModelProperty(
		name = "agrtAgrYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("agrtAgrYn")
	@BxmOmm_Field(length=1, decimal=0, description="약관동의여부", align="left", fill="")
	private String agrtAgrYn= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_agrtDscd= false;
	protected final boolean isSet_agrtDscd(){
		return this.isSet_agrtDscd;
	}
	private void setIsSet_agrtDscd(boolean value){
		this.isSet_agrtDscd= value;
	}
	/**
	 * 약관구분코드
	 */
	@XmlTransient
	public String getAgrtDscd(){
		return this.agrtDscd;
	}
	
	/**
	 * 약관구분코드
	 * 
	 * @param agrtDscd 약관구분코드
	 */
	public void setAgrtDscd(String agrtDscd){
		this.agrtDscd= agrtDscd;
		this.setIsSet_agrtDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_agrtId= false;
	protected final boolean isSet_agrtId(){
		return this.isSet_agrtId;
	}
	private void setIsSet_agrtId(boolean value){
		this.isSet_agrtId= value;
	}
	/**
	 * 약관ID
	 */
	@XmlTransient
	public String getAgrtId(){
		return this.agrtId;
	}
	
	/**
	 * 약관ID
	 * 
	 * @param agrtId 약관ID
	 */
	public void setAgrtId(String agrtId){
		this.agrtId= agrtId;
		this.setIsSet_agrtId(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_agrtAgrYn= false;
	protected final boolean isSet_agrtAgrYn(){
		return this.isSet_agrtAgrYn;
	}
	private void setIsSet_agrtAgrYn(boolean value){
		this.isSet_agrtAgrYn= value;
	}
	/**
	 * 약관동의여부
	 */
	@XmlTransient
	public String getAgrtAgrYn(){
		return this.agrtAgrYn;
	}
	
	/**
	 * 약관동의여부
	 * 
	 * @param agrtAgrYn 약관동의여부
	 */
	public void setAgrtAgrYn(String agrtAgrYn){
		this.agrtAgrYn= agrtAgrYn;
		this.setIsSet_agrtAgrYn(true);
	}
				
	@Override
	public MPBAgrtAgrList_IDT clone(){
		try{
			MPBAgrtAgrList_IDT object= (MPBAgrtAgrList_IDT)super.clone();
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
		
		result= prime * result + ((this.agrtDscd==null)?0:this.agrtDscd.hashCode());
		result= prime * result + ((this.agrtId==null)?0:this.agrtId.hashCode());
		result= prime * result + ((this.agrtAgrYn==null)?0:this.agrtAgrYn.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MPBAgrtAgrList_IDT other= (MPBAgrtAgrList_IDT)obj;
		{
			Object _agrtDscd= getAgrtDscd();
			Object __agrtDscd= other.getAgrtDscd();
			if ( _agrtDscd== null ) { if ( __agrtDscd!= null ) return false; }
			else if ( !_agrtDscd.equals(__agrtDscd) ) return false;
		}
		{
			Object _agrtId= getAgrtId();
			Object __agrtId= other.getAgrtId();
			if ( _agrtId== null ) { if ( __agrtId!= null ) return false; }
			else if ( !_agrtId.equals(__agrtId) ) return false;
		}
		{
			Object _agrtAgrYn= getAgrtAgrYn();
			Object __agrtAgrYn= other.getAgrtAgrYn();
			if ( _agrtAgrYn== null ) { if ( __agrtAgrYn!= null ) return false; }
			else if ( !_agrtAgrYn.equals(__agrtAgrYn) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MPBAgrtAgrList_IDT.class.getName()).append(":\n");
		sb.append("\tagrtDscd: ");
		sb.append(agrtDscd==null?"null":getAgrtDscd());
		sb.append("\n");
		sb.append("\tagrtId: ");
		sb.append(agrtId==null?"null":getAgrtId());
		sb.append("\n");
		sb.append("\tagrtAgrYn: ");
		sb.append(agrtAgrYn==null?"null":getAgrtAgrYn());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 2; /* agrtDscd */
		messageLen+= 10; /* agrtId */
		messageLen+= 1; /* agrtAgrYn */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("agrtDscd");
		list.add("agrtId");
		list.add("agrtAgrYn");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("agrtDscd", get("agrtDscd"));
		map.put("agrtId", get("agrtId"));
		map.put("agrtAgrYn", get("agrtAgrYn"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 1845467704:/* agrtDscd */
			return getAgrtDscd();
		case -1419306973:/* agrtId */
			return getAgrtId();
		case 1371810105:/* agrtAgrYn */
			return getAgrtAgrYn();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 1845467704:/* agrtDscd */
			setAgrtDscd((String)value);
			break;
		case -1419306973:/* agrtId */
			setAgrtId((String)value);
			break;
		case 1371810105:/* agrtAgrYn */
			setAgrtAgrYn((String)value);
			break;
		default:
			break;
		}
	}
	
}
