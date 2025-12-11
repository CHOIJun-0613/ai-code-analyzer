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
	"metPbokCadPrtsList_DODT"
}, name="MetPbokCadPrts_DODT")
@XmlRootElement(name="MetPbokCadPrts_DODT")
@BxmCategory(logicalName="모임통장.카드내역.DBM.출력.IO", description="") 
public class MetPbokCadPrts_DODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 2016072175L;
	
	
	
	/**
	 * 모임통장.카드내역.목록.DBM.출력.IO
	 */
	@ApiModelProperty(
		name = "metPbokCadPrtsList_DODT"
		, dataType = "com.skbank.sml.fns.mpb.dto.MetPbokCadPrtsList_DODT"
		)
	@XmlElement
	@JsonProperty("metPbokCadPrtsList_DODT")
	@BxmOmm_Field(length=0, decimal=0, description="모임통장.카드내역.목록.DBM.출력.IO", align="left", fill="")
	private MetPbokCadPrtsList_DODT metPbokCadPrtsList_DODT= null;
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metPbokCadPrtsList_DODT= false;
	protected final boolean isSet_metPbokCadPrtsList_DODT(){
		return this.isSet_metPbokCadPrtsList_DODT;
	}
	private void setIsSet_metPbokCadPrtsList_DODT(boolean value){
		this.isSet_metPbokCadPrtsList_DODT= value;
	}
	/**
	 * 모임통장.카드내역.목록.DBM.출력.IO
	 */
	@XmlTransient
	public MetPbokCadPrtsList_DODT getMetPbokCadPrtsList_DODT(){
		return this.metPbokCadPrtsList_DODT;
	}
	
	/**
	 * 모임통장.카드내역.목록.DBM.출력.IO
	 * 
	 * @param metPbokCadPrtsList_DODT 모임통장.카드내역.목록.DBM.출력.IO
	 */
	public void setMetPbokCadPrtsList_DODT(MetPbokCadPrtsList_DODT metPbokCadPrtsList_DODT){
		this.metPbokCadPrtsList_DODT= metPbokCadPrtsList_DODT;
		this.setIsSet_metPbokCadPrtsList_DODT(true);
	}
				
	@Override
	public MetPbokCadPrts_DODT clone(){
		try{
			MetPbokCadPrts_DODT object= (MetPbokCadPrts_DODT)super.clone();
			if ( this.metPbokCadPrtsList_DODT== null ) object.metPbokCadPrtsList_DODT= null;
			else object.metPbokCadPrtsList_DODT= (MetPbokCadPrtsList_DODT)this.metPbokCadPrtsList_DODT.clone();
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
		
		result= prime * result + ((this.metPbokCadPrtsList_DODT==null)?0:this.metPbokCadPrtsList_DODT.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MetPbokCadPrts_DODT other= (MetPbokCadPrts_DODT)obj;
		{
			Object _metPbokCadPrtsList_DODT= getMetPbokCadPrtsList_DODT();
			Object __metPbokCadPrtsList_DODT= other.getMetPbokCadPrtsList_DODT();
			if ( _metPbokCadPrtsList_DODT== null ) { if ( __metPbokCadPrtsList_DODT!= null ) return false; }
			else if ( !_metPbokCadPrtsList_DODT.equals(__metPbokCadPrtsList_DODT) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MetPbokCadPrts_DODT.class.getName()).append(":\n");
		sb.append("\tmetPbokCadPrtsList_DODT: ");
		sb.append(metPbokCadPrtsList_DODT==null?"null":getMetPbokCadPrtsList_DODT());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		if ( metPbokCadPrtsList_DODT != null && !(metPbokCadPrtsList_DODT instanceof Predictable) )
			throw new IllegalStateException( "Message length can not be predicted.");
		{
			MetPbokCadPrtsList_DODT temp= metPbokCadPrtsList_DODT;
			if ( temp== null ) temp= new MetPbokCadPrtsList_DODT();
			messageLen+= ( (Predictable)temp).predictMessageLength(); /* metPbokCadPrtsList_DODT */
		}
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("metPbokCadPrtsList_DODT");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("metPbokCadPrtsList_DODT", get("metPbokCadPrtsList_DODT"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 407037855:/* metPbokCadPrtsList_DODT */
			return getMetPbokCadPrtsList_DODT();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 407037855:/* metPbokCadPrtsList_DODT */
			setMetPbokCadPrtsList_DODT((MetPbokCadPrtsList_DODT)value);
			break;
		default:
			break;
		}
	}
	
}
