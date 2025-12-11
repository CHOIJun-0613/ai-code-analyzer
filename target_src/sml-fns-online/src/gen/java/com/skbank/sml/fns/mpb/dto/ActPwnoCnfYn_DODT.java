/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.mpb.dto;

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
	"nmlYn"
}, name="ActPwnoCnfYn_DODT")
@XmlRootElement(name="ActPwnoCnfYn_DODT")
@BxmCategory(logicalName="계좌.비밀번호.확인.여부.DBM.출력.IO", description="") 
public class ActPwnoCnfYn_DODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 897927190L;
	
	
	
	/**
	 * 정상여부
	 */
	@ApiModelProperty(
		name = "nmlYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("nmlYn")
	@BxmOmm_Field(length=3, decimal=0, description="정상여부", align="left", fill="")
	private String nmlYn= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_nmlYn= false;
	protected final boolean isSet_nmlYn(){
		return this.isSet_nmlYn;
	}
	private void setIsSet_nmlYn(boolean value){
		this.isSet_nmlYn= value;
	}
	/**
	 * 정상여부
	 */
	@XmlTransient
	public String getNmlYn(){
		return this.nmlYn;
	}
	
	/**
	 * 정상여부
	 * 
	 * @param nmlYn 정상여부
	 */
	public void setNmlYn(String nmlYn){
		this.nmlYn= nmlYn;
		this.setIsSet_nmlYn(true);
	}
				
	@Override
	public ActPwnoCnfYn_DODT clone(){
		try{
			ActPwnoCnfYn_DODT object= (ActPwnoCnfYn_DODT)super.clone();
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
		
		result= prime * result + ((this.nmlYn==null)?0:this.nmlYn.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final ActPwnoCnfYn_DODT other= (ActPwnoCnfYn_DODT)obj;
		{
			Object _nmlYn= getNmlYn();
			Object __nmlYn= other.getNmlYn();
			if ( _nmlYn== null ) { if ( __nmlYn!= null ) return false; }
			else if ( !_nmlYn.equals(__nmlYn) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(ActPwnoCnfYn_DODT.class.getName()).append(":\n");
		sb.append("\tnmlYn: ");
		sb.append(nmlYn==null?"null":getNmlYn());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 3; /* nmlYn */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("nmlYn");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("nmlYn", get("nmlYn"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 104941186:/* nmlYn */
			return getNmlYn();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 104941186:/* nmlYn */
			setNmlYn((String)value);
			break;
		default:
			break;
		}
	}
	
}
