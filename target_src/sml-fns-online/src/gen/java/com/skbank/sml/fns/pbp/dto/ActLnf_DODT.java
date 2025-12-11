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
import com.fasterxml.jackson.annotation.JsonSetter;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 */
@XmlType(propOrder={
	"jnngAvlActInfList_DODT"
}, name="ActLnf_DODT")
@XmlRootElement(name="ActLnf_DODT")
@BxmCategory(logicalName="계좌.정보.DBM.출력.IO", description="") 
public class ActLnf_DODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 1445786041L;
	
	
	
	/**
	 * 계좌.정보.목록.DBM.출력.IO
	 */
	@ApiModelProperty(
		name = "jnngAvlActInfList_DODT"
		, dataType = "[Lcom.skbank.sml.fns.pbp.dto.ActInfList_DODT;"
		)
	@XmlElement(name="item")
	@XmlElementWrapper()
	@JsonProperty("jnngAvlActInfList_DODT")
	@BxmOmm_Field(length=0, decimal=0, description="계좌.정보.목록.DBM.출력.IO", align="left", fill="", arrayReference="1")
	private List<ActInfList_DODT> jnngAvlActInfList_DODT= new ArrayList<>();
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_jnngAvlActInfList_DODT= false;
	protected final boolean isSet_jnngAvlActInfList_DODT(){
		return this.isSet_jnngAvlActInfList_DODT;
	}
	private void setIsSet_jnngAvlActInfList_DODT(boolean value){
		this.isSet_jnngAvlActInfList_DODT= value;
	}
	/**
	 * 계좌.정보.목록.DBM.출력.IO
	 */
	@XmlTransient
	public List<ActInfList_DODT> getJnngAvlActInfList_DODT(){
		return jnngAvlActInfList_DODT;
	}
	
	/**
	 * 계좌.정보.목록.DBM.출력.IO
	 * 
	 * @param jnngAvlActInfList_DODT 계좌.정보.목록.DBM.출력.IO
	 */
	@JsonSetter("jnngAvlActInfList_DODT")
	public void setJnngAvlActInfList_DODT(List<ActInfList_DODT> jnngAvlActInfList_DODT){
		this.jnngAvlActInfList_DODT= jnngAvlActInfList_DODT;
		this.setIsSet_jnngAvlActInfList_DODT(true);
	}
	
	public void setJnngAvlActInfList_DODT(ActInfList_DODT... items){
		List<ActInfList_DODT> _items= new ArrayList<>();
		if ( items!= null && items.length> 0){
			for( ActInfList_DODT item: items ){
				_items.add(item);
			}
		}
		this.setJnngAvlActInfList_DODT(_items);
	}
				
	@Override
	public ActLnf_DODT clone(){
		try{
			ActLnf_DODT object= (ActLnf_DODT)super.clone();
			if ( this.jnngAvlActInfList_DODT== null ) object.jnngAvlActInfList_DODT= null;
			else{
				List<ActInfList_DODT> clonedList= new ArrayList<>(this.jnngAvlActInfList_DODT.size());
				for( ActInfList_DODT item : jnngAvlActInfList_DODT ){
					clonedList.add((ActInfList_DODT)item.clone());
				}
				object.jnngAvlActInfList_DODT= clonedList;
			}
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
		
		result= prime * result + ((this.jnngAvlActInfList_DODT==null)?0:this.jnngAvlActInfList_DODT.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final ActLnf_DODT other= (ActLnf_DODT)obj;
		{
			Object _jnngAvlActInfList_DODT= getJnngAvlActInfList_DODT();
			Object __jnngAvlActInfList_DODT= other.getJnngAvlActInfList_DODT();
			if ( _jnngAvlActInfList_DODT== null ) { if ( __jnngAvlActInfList_DODT!= null ) return false; }
			else if ( !_jnngAvlActInfList_DODT.equals(__jnngAvlActInfList_DODT) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(ActLnf_DODT.class.getName()).append(":\n");
		sb.append("\tjnngAvlActInfList_DODT: ");
		if ( jnngAvlActInfList_DODT== null ) sb.append("null");
		else{
			sb.append("array count : ");
			sb.append(jnngAvlActInfList_DODT.size());
			sb.append("(items)\n");
	
			int max= (10<jnngAvlActInfList_DODT.size())?10:jnngAvlActInfList_DODT.size();
	
			for ( int i= 0; i < max; ++i ){
				sb.append("\tjnngAvlActInfList_DODT[");
				sb.append(i);
				sb.append("] : ");
				sb.append(jnngAvlActInfList_DODT.get(i));
				sb.append("\n");
			}
	
			if ( max < jnngAvlActInfList_DODT.size() ){
				sb.append("\tjnngAvlActInfList_DODT[.] : ").append("more ").append((jnngAvlActInfList_DODT.size()-max)).append(" items").append("\n");
			}
		}
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		{/*jnngAvlActInfList_DODT*/
			int size=1;
			int count= jnngAvlActInfList_DODT == null ? 0 : jnngAvlActInfList_DODT.size();
			int min= size > count?count:size;
			ActInfList_DODT emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					ActInfList_DODT element= jnngAvlActInfList_DODT.get(i);
					if ( element != null && !(element instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= element==null?0:( (Predictable)element).predictMessageLength();
				}else{
					if ( emptyElement== null ) emptyElement= new com.skbank.sml.fns.pbp.dto.ActInfList_DODT();
					if ( !(emptyElement instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= ( (Predictable)emptyElement).predictMessageLength();
				}
			}
		}
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("jnngAvlActInfList_DODT");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("jnngAvlActInfList_DODT", get("jnngAvlActInfList_DODT"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -1853853389:/* jnngAvlActInfList_DODT */
			return getJnngAvlActInfList_DODT();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -1853853389:/* jnngAvlActInfList_DODT */
			setJnngAvlActInfList_DODT((List<ActInfList_DODT>)value);
			break;
		default:
			break;
		}
	}
	
}
