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
	"agrMbhCn", "metPbokRprsChgAgrMbhListInq_DODT"
}, name="MetPbokRprsChgAgrMbhInq_DODT")
@XmlRootElement(name="MetPbokRprsChgAgrMbhInq_DODT")
@BxmCategory(logicalName="모임통장.대표.변경.동의.회원.조회.DBM.출력.IO", description="") 
public class MetPbokRprsChgAgrMbhInq_DODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 415899388L;
	
	
	
	/**
	 * 동의회원수
	 */
	@ApiModelProperty(
		name = "agrMbhCn"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("agrMbhCn")
	@BxmOmm_Field(length=9, decimal=0, description="동의회원수", align="right", fill="")
	private Integer agrMbhCn= 0;
	
	
	/**
	 * 모임통장.대표.변경.동의.미참여.회원.목록.조회.DBM.출력.IO
	 */
	@ApiModelProperty(
		name = "metPbokRprsChgAgrMbhListInq_DODT"
		, dataType = "[Lcom.skbank.sml.fns.mpb.dto.MetPbokRprsChgAgrNtyMbhListInq_DODT;"
		)
	@XmlElement(name="item")
	@XmlElementWrapper()
	@JsonProperty("metPbokRprsChgAgrMbhListInq_DODT")
	@BxmOmm_Field(length=0, decimal=0, description="모임통장.대표.변경.동의.미참여.회원.목록.조회.DBM.출력.IO", align="left", fill="", arrayReference="1")
	private List<MetPbokRprsChgAgrNtyMbhListInq_DODT> metPbokRprsChgAgrMbhListInq_DODT= new ArrayList<>();
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_agrMbhCn= false;
	protected final boolean isSet_agrMbhCn(){
		return this.isSet_agrMbhCn;
	}
	private void setIsSet_agrMbhCn(boolean value){
		this.isSet_agrMbhCn= value;
	}
	/**
	 * 동의회원수
	 */
	@XmlTransient
	public Integer getAgrMbhCn(){
		return this.agrMbhCn;
	}
	
	/**
	 * 동의회원수
	 * 
	 * @param agrMbhCn 동의회원수
	 */
	public void setAgrMbhCn(Integer agrMbhCn){
		this.agrMbhCn= agrMbhCn;
		this.setIsSet_agrMbhCn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metPbokRprsChgAgrMbhListInq_DODT= false;
	protected final boolean isSet_metPbokRprsChgAgrMbhListInq_DODT(){
		return this.isSet_metPbokRprsChgAgrMbhListInq_DODT;
	}
	private void setIsSet_metPbokRprsChgAgrMbhListInq_DODT(boolean value){
		this.isSet_metPbokRprsChgAgrMbhListInq_DODT= value;
	}
	/**
	 * 모임통장.대표.변경.동의.미참여.회원.목록.조회.DBM.출력.IO
	 */
	@XmlTransient
	public List<MetPbokRprsChgAgrNtyMbhListInq_DODT> getMetPbokRprsChgAgrMbhListInq_DODT(){
		return metPbokRprsChgAgrMbhListInq_DODT;
	}
	
	/**
	 * 모임통장.대표.변경.동의.미참여.회원.목록.조회.DBM.출력.IO
	 * 
	 * @param metPbokRprsChgAgrMbhListInq_DODT 모임통장.대표.변경.동의.미참여.회원.목록.조회.DBM.출력.IO
	 */
	@JsonSetter("metPbokRprsChgAgrMbhListInq_DODT")
	public void setMetPbokRprsChgAgrMbhListInq_DODT(List<MetPbokRprsChgAgrNtyMbhListInq_DODT> metPbokRprsChgAgrMbhListInq_DODT){
		this.metPbokRprsChgAgrMbhListInq_DODT= metPbokRprsChgAgrMbhListInq_DODT;
		this.setIsSet_metPbokRprsChgAgrMbhListInq_DODT(true);
	}
	
	public void setMetPbokRprsChgAgrMbhListInq_DODT(MetPbokRprsChgAgrNtyMbhListInq_DODT... items){
		List<MetPbokRprsChgAgrNtyMbhListInq_DODT> _items= new ArrayList<>();
		if ( items!= null && items.length> 0){
			for( MetPbokRprsChgAgrNtyMbhListInq_DODT item: items ){
				_items.add(item);
			}
		}
		this.setMetPbokRprsChgAgrMbhListInq_DODT(_items);
	}
				
	@Override
	public MetPbokRprsChgAgrMbhInq_DODT clone(){
		try{
			MetPbokRprsChgAgrMbhInq_DODT object= (MetPbokRprsChgAgrMbhInq_DODT)super.clone();
			if ( this.metPbokRprsChgAgrMbhListInq_DODT== null ) object.metPbokRprsChgAgrMbhListInq_DODT= null;
			else{
				List<MetPbokRprsChgAgrNtyMbhListInq_DODT> clonedList= new ArrayList<>(this.metPbokRprsChgAgrMbhListInq_DODT.size());
				for( MetPbokRprsChgAgrNtyMbhListInq_DODT item : metPbokRprsChgAgrMbhListInq_DODT ){
					clonedList.add((MetPbokRprsChgAgrNtyMbhListInq_DODT)item.clone());
				}
				object.metPbokRprsChgAgrMbhListInq_DODT= clonedList;
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
		
		result= prime * result + ((this.agrMbhCn==null)?0:this.agrMbhCn.hashCode());
		result= prime * result + ((this.metPbokRprsChgAgrMbhListInq_DODT==null)?0:this.metPbokRprsChgAgrMbhListInq_DODT.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MetPbokRprsChgAgrMbhInq_DODT other= (MetPbokRprsChgAgrMbhInq_DODT)obj;
		{
			Object _agrMbhCn= getAgrMbhCn();
			Object __agrMbhCn= other.getAgrMbhCn();
			if ( _agrMbhCn== null ) { if ( __agrMbhCn!= null ) return false; }
			else if ( !_agrMbhCn.equals(__agrMbhCn) ) return false;
		}
		{
			Object _metPbokRprsChgAgrMbhListInq_DODT= getMetPbokRprsChgAgrMbhListInq_DODT();
			Object __metPbokRprsChgAgrMbhListInq_DODT= other.getMetPbokRprsChgAgrMbhListInq_DODT();
			if ( _metPbokRprsChgAgrMbhListInq_DODT== null ) { if ( __metPbokRprsChgAgrMbhListInq_DODT!= null ) return false; }
			else if ( !_metPbokRprsChgAgrMbhListInq_DODT.equals(__metPbokRprsChgAgrMbhListInq_DODT) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MetPbokRprsChgAgrMbhInq_DODT.class.getName()).append(":\n");
		sb.append("\tagrMbhCn: ");
		sb.append(agrMbhCn==null?"null":getAgrMbhCn());
		sb.append("\n");
		sb.append("\tmetPbokRprsChgAgrMbhListInq_DODT: ");
		if ( metPbokRprsChgAgrMbhListInq_DODT== null ) sb.append("null");
		else{
			sb.append("array count : ");
			sb.append(metPbokRprsChgAgrMbhListInq_DODT.size());
			sb.append("(items)\n");
	
			int max= (10<metPbokRprsChgAgrMbhListInq_DODT.size())?10:metPbokRprsChgAgrMbhListInq_DODT.size();
	
			for ( int i= 0; i < max; ++i ){
				sb.append("\tmetPbokRprsChgAgrMbhListInq_DODT[");
				sb.append(i);
				sb.append("] : ");
				sb.append(metPbokRprsChgAgrMbhListInq_DODT.get(i));
				sb.append("\n");
			}
	
			if ( max < metPbokRprsChgAgrMbhListInq_DODT.size() ){
				sb.append("\tmetPbokRprsChgAgrMbhListInq_DODT[.] : ").append("more ").append((metPbokRprsChgAgrMbhListInq_DODT.size()-max)).append(" items").append("\n");
			}
		}
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 9; /* agrMbhCn */
		{/*metPbokRprsChgAgrMbhListInq_DODT*/
			int size=1;
			int count= metPbokRprsChgAgrMbhListInq_DODT == null ? 0 : metPbokRprsChgAgrMbhListInq_DODT.size();
			int min= size > count?count:size;
			MetPbokRprsChgAgrNtyMbhListInq_DODT emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					MetPbokRprsChgAgrNtyMbhListInq_DODT element= metPbokRprsChgAgrMbhListInq_DODT.get(i);
					if ( element != null && !(element instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= element==null?0:( (Predictable)element).predictMessageLength();
				}else{
					if ( emptyElement== null ) emptyElement= new com.skbank.sml.fns.mpb.dto.MetPbokRprsChgAgrNtyMbhListInq_DODT();
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
	
		list.add("agrMbhCn");
		list.add("metPbokRprsChgAgrMbhListInq_DODT");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("agrMbhCn", get("agrMbhCn"));
		map.put("metPbokRprsChgAgrMbhListInq_DODT", get("metPbokRprsChgAgrMbhListInq_DODT"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 1810332562:/* agrMbhCn */
			return getAgrMbhCn();
		case 328313932:/* metPbokRprsChgAgrMbhListInq_DODT */
			return getMetPbokRprsChgAgrMbhListInq_DODT();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 1810332562:/* agrMbhCn */
			setAgrMbhCn((Integer)value);
			break;
		case 328313932:/* metPbokRprsChgAgrMbhListInq_DODT */
			setMetPbokRprsChgAgrMbhListInq_DODT((List<MetPbokRprsChgAgrNtyMbhListInq_DODT>)value);
			break;
		default:
			break;
		}
	}
	
}
