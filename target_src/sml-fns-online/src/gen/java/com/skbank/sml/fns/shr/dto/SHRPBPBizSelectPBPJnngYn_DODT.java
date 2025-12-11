/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.shr.dto;

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
 * 통장쪼개기 가입여부 DODT
 */
@XmlType(propOrder={
	"pbokSplitJnngYn", "pbokSplitJnngAvlYn"
}, name="SHRPBPBizSelectPBPJnngYn_DODT")
@XmlRootElement(name="SHRPBPBizSelectPBPJnngYn_DODT")
@BxmCategory(logicalName="통장쪼개기 가입여부", description="통장쪼개기 가입여부 DODT") 
public class SHRPBPBizSelectPBPJnngYn_DODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 791885096L;
	
	
	
	/**
	 * 통장쪼개기 가입여부
	 */
	@ApiModelProperty(
		name = "pbokSplitJnngYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("pbokSplitJnngYn")
	@BxmOmm_Field(length=1, decimal=0, description="통장쪼개기 가입여부", align="left", fill="")
	private String pbokSplitJnngYn= "";
	
	
	/**
	 * 통장쪼개기 가입가능여부
	 */
	@ApiModelProperty(
		name = "pbokSplitJnngAvlYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("pbokSplitJnngAvlYn")
	@BxmOmm_Field(length=1, decimal=0, description="통장쪼개기 가입가능여부", align="left", fill="")
	private String pbokSplitJnngAvlYn= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pbokSplitJnngYn= false;
	protected final boolean isSet_pbokSplitJnngYn(){
		return this.isSet_pbokSplitJnngYn;
	}
	private void setIsSet_pbokSplitJnngYn(boolean value){
		this.isSet_pbokSplitJnngYn= value;
	}
	/**
	 * 통장쪼개기 가입여부
	 */
	@XmlTransient
	public String getPbokSplitJnngYn(){
		return this.pbokSplitJnngYn;
	}
	
	/**
	 * 통장쪼개기 가입여부
	 * 
	 * @param pbokSplitJnngYn 통장쪼개기 가입여부
	 */
	public void setPbokSplitJnngYn(String pbokSplitJnngYn){
		this.pbokSplitJnngYn= pbokSplitJnngYn;
		this.setIsSet_pbokSplitJnngYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pbokSplitJnngAvlYn= false;
	protected final boolean isSet_pbokSplitJnngAvlYn(){
		return this.isSet_pbokSplitJnngAvlYn;
	}
	private void setIsSet_pbokSplitJnngAvlYn(boolean value){
		this.isSet_pbokSplitJnngAvlYn= value;
	}
	/**
	 * 통장쪼개기 가입가능여부
	 */
	@XmlTransient
	public String getPbokSplitJnngAvlYn(){
		return this.pbokSplitJnngAvlYn;
	}
	
	/**
	 * 통장쪼개기 가입가능여부
	 * 
	 * @param pbokSplitJnngAvlYn 통장쪼개기 가입가능여부
	 */
	public void setPbokSplitJnngAvlYn(String pbokSplitJnngAvlYn){
		this.pbokSplitJnngAvlYn= pbokSplitJnngAvlYn;
		this.setIsSet_pbokSplitJnngAvlYn(true);
	}
				
	@Override
	public SHRPBPBizSelectPBPJnngYn_DODT clone(){
		try{
			SHRPBPBizSelectPBPJnngYn_DODT object= (SHRPBPBizSelectPBPJnngYn_DODT)super.clone();
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
		
		result= prime * result + ((this.pbokSplitJnngYn==null)?0:this.pbokSplitJnngYn.hashCode());
		result= prime * result + ((this.pbokSplitJnngAvlYn==null)?0:this.pbokSplitJnngAvlYn.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final SHRPBPBizSelectPBPJnngYn_DODT other= (SHRPBPBizSelectPBPJnngYn_DODT)obj;
		{
			Object _pbokSplitJnngYn= getPbokSplitJnngYn();
			Object __pbokSplitJnngYn= other.getPbokSplitJnngYn();
			if ( _pbokSplitJnngYn== null ) { if ( __pbokSplitJnngYn!= null ) return false; }
			else if ( !_pbokSplitJnngYn.equals(__pbokSplitJnngYn) ) return false;
		}
		{
			Object _pbokSplitJnngAvlYn= getPbokSplitJnngAvlYn();
			Object __pbokSplitJnngAvlYn= other.getPbokSplitJnngAvlYn();
			if ( _pbokSplitJnngAvlYn== null ) { if ( __pbokSplitJnngAvlYn!= null ) return false; }
			else if ( !_pbokSplitJnngAvlYn.equals(__pbokSplitJnngAvlYn) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(SHRPBPBizSelectPBPJnngYn_DODT.class.getName()).append(":\n");
		sb.append("\tpbokSplitJnngYn: ");
		sb.append(pbokSplitJnngYn==null?"null":getPbokSplitJnngYn());
		sb.append("\n");
		sb.append("\tpbokSplitJnngAvlYn: ");
		sb.append(pbokSplitJnngAvlYn==null?"null":getPbokSplitJnngAvlYn());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 1; /* pbokSplitJnngYn */
		messageLen+= 1; /* pbokSplitJnngAvlYn */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("pbokSplitJnngYn");
		list.add("pbokSplitJnngAvlYn");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("pbokSplitJnngYn", get("pbokSplitJnngYn"));
		map.put("pbokSplitJnngAvlYn", get("pbokSplitJnngAvlYn"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 877816190:/* pbokSplitJnngYn */
			return getPbokSplitJnngYn();
		case -1055568573:/* pbokSplitJnngAvlYn */
			return getPbokSplitJnngAvlYn();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 877816190:/* pbokSplitJnngYn */
			setPbokSplitJnngYn((String)value);
			break;
		case -1055568573:/* pbokSplitJnngAvlYn */
			setPbokSplitJnngAvlYn((String)value);
			break;
		default:
			break;
		}
	}
	
}
