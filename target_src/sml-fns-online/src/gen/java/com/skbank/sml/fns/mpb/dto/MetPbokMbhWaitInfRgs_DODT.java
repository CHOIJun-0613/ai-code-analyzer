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
	"metPbokMbhInfListInq_DODT"
}, name="MetPbokMbhWaitInfRgs_DODT")
@XmlRootElement(name="MetPbokMbhWaitInfRgs_DODT")
@BxmCategory(logicalName="모임통장.회원.대기정보.등록.DBM.출력.IO", description="") 
public class MetPbokMbhWaitInfRgs_DODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 1266653105L;
	
	
	
	/**
	 * 모임통장.회원.정보.목록.조회.DBM.출력.IO
	 */
	@ApiModelProperty(
		name = "metPbokMbhInfListInq_DODT"
		, dataType = "[Lcom.skbank.sml.fns.mpb.dto.MetPbokMbhInfListInq_DODT;"
		)
	@XmlElement(name="item")
	@XmlElementWrapper()
	@JsonProperty("metPbokMbhInfListInq_DODT")
	@BxmOmm_Field(length=0, decimal=0, description="모임통장.회원.정보.목록.조회.DBM.출력.IO", align="left", fill="", arrayReference="1")
	private List<MetPbokMbhInfListInq_DODT> metPbokMbhInfListInq_DODT= new ArrayList<>();
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metPbokMbhInfListInq_DODT= false;
	protected final boolean isSet_metPbokMbhInfListInq_DODT(){
		return this.isSet_metPbokMbhInfListInq_DODT;
	}
	private void setIsSet_metPbokMbhInfListInq_DODT(boolean value){
		this.isSet_metPbokMbhInfListInq_DODT= value;
	}
	/**
	 * 모임통장.회원.정보.목록.조회.DBM.출력.IO
	 */
	@XmlTransient
	public List<MetPbokMbhInfListInq_DODT> getMetPbokMbhInfListInq_DODT(){
		return metPbokMbhInfListInq_DODT;
	}
	
	/**
	 * 모임통장.회원.정보.목록.조회.DBM.출력.IO
	 * 
	 * @param metPbokMbhInfListInq_DODT 모임통장.회원.정보.목록.조회.DBM.출력.IO
	 */
	@JsonSetter("metPbokMbhInfListInq_DODT")
	public void setMetPbokMbhInfListInq_DODT(List<MetPbokMbhInfListInq_DODT> metPbokMbhInfListInq_DODT){
		this.metPbokMbhInfListInq_DODT= metPbokMbhInfListInq_DODT;
		this.setIsSet_metPbokMbhInfListInq_DODT(true);
	}
	
	public void setMetPbokMbhInfListInq_DODT(MetPbokMbhInfListInq_DODT... items){
		List<MetPbokMbhInfListInq_DODT> _items= new ArrayList<>();
		if ( items!= null && items.length> 0){
			for( MetPbokMbhInfListInq_DODT item: items ){
				_items.add(item);
			}
		}
		this.setMetPbokMbhInfListInq_DODT(_items);
	}
				
	@Override
	public MetPbokMbhWaitInfRgs_DODT clone(){
		try{
			MetPbokMbhWaitInfRgs_DODT object= (MetPbokMbhWaitInfRgs_DODT)super.clone();
			if ( this.metPbokMbhInfListInq_DODT== null ) object.metPbokMbhInfListInq_DODT= null;
			else{
				List<MetPbokMbhInfListInq_DODT> clonedList= new ArrayList<>(this.metPbokMbhInfListInq_DODT.size());
				for( MetPbokMbhInfListInq_DODT item : metPbokMbhInfListInq_DODT ){
					clonedList.add((MetPbokMbhInfListInq_DODT)item.clone());
				}
				object.metPbokMbhInfListInq_DODT= clonedList;
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
		
		result= prime * result + ((this.metPbokMbhInfListInq_DODT==null)?0:this.metPbokMbhInfListInq_DODT.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MetPbokMbhWaitInfRgs_DODT other= (MetPbokMbhWaitInfRgs_DODT)obj;
		{
			Object _metPbokMbhInfListInq_DODT= getMetPbokMbhInfListInq_DODT();
			Object __metPbokMbhInfListInq_DODT= other.getMetPbokMbhInfListInq_DODT();
			if ( _metPbokMbhInfListInq_DODT== null ) { if ( __metPbokMbhInfListInq_DODT!= null ) return false; }
			else if ( !_metPbokMbhInfListInq_DODT.equals(__metPbokMbhInfListInq_DODT) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MetPbokMbhWaitInfRgs_DODT.class.getName()).append(":\n");
		sb.append("\tmetPbokMbhInfListInq_DODT: ");
		if ( metPbokMbhInfListInq_DODT== null ) sb.append("null");
		else{
			sb.append("array count : ");
			sb.append(metPbokMbhInfListInq_DODT.size());
			sb.append("(items)\n");
	
			int max= (10<metPbokMbhInfListInq_DODT.size())?10:metPbokMbhInfListInq_DODT.size();
	
			for ( int i= 0; i < max; ++i ){
				sb.append("\tmetPbokMbhInfListInq_DODT[");
				sb.append(i);
				sb.append("] : ");
				sb.append(metPbokMbhInfListInq_DODT.get(i));
				sb.append("\n");
			}
	
			if ( max < metPbokMbhInfListInq_DODT.size() ){
				sb.append("\tmetPbokMbhInfListInq_DODT[.] : ").append("more ").append((metPbokMbhInfListInq_DODT.size()-max)).append(" items").append("\n");
			}
		}
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		{/*metPbokMbhInfListInq_DODT*/
			int size=1;
			int count= metPbokMbhInfListInq_DODT == null ? 0 : metPbokMbhInfListInq_DODT.size();
			int min= size > count?count:size;
			MetPbokMbhInfListInq_DODT emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					MetPbokMbhInfListInq_DODT element= metPbokMbhInfListInq_DODT.get(i);
					if ( element != null && !(element instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= element==null?0:( (Predictable)element).predictMessageLength();
				}else{
					if ( emptyElement== null ) emptyElement= new com.skbank.sml.fns.mpb.dto.MetPbokMbhInfListInq_DODT();
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
	
		list.add("metPbokMbhInfListInq_DODT");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("metPbokMbhInfListInq_DODT", get("metPbokMbhInfListInq_DODT"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 1434162948:/* metPbokMbhInfListInq_DODT */
			return getMetPbokMbhInfListInq_DODT();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 1434162948:/* metPbokMbhInfListInq_DODT */
			setMetPbokMbhInfListInq_DODT((List<MetPbokMbhInfListInq_DODT>)value);
			break;
		default:
			break;
		}
	}
	
}
