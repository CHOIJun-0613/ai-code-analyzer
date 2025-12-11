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
	"pushListInq_DODT"
}, name="PushLstInqList_DODT")
@XmlRootElement(name="PushLstInqList_DODT")
@BxmCategory(logicalName="푸시.목록.조회.리스트.DBM.출력.IO", description="") 
public class PushLstInqList_DODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 1105157715L;
	
	
	
	/**
	 * 푸시.목록.조회.DBM.출력.IO
	 */
	@ApiModelProperty(
		name = "pushListInq_DODT"
		, dataType = "[Lcom.skbank.sml.fns.inb.dto.PushListInq_DODT;"
		)
	@XmlElement(name="item")
	@XmlElementWrapper()
	@JsonProperty("pushListInq_DODT")
	@BxmOmm_Field(length=0, decimal=0, description="푸시.목록.조회.DBM.출력.IO", align="left", fill="", arrayReference="1")
	private List<PushListInq_DODT> pushListInq_DODT= new ArrayList<>();
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pushListInq_DODT= false;
	protected final boolean isSet_pushListInq_DODT(){
		return this.isSet_pushListInq_DODT;
	}
	private void setIsSet_pushListInq_DODT(boolean value){
		this.isSet_pushListInq_DODT= value;
	}
	/**
	 * 푸시.목록.조회.DBM.출력.IO
	 */
	@XmlTransient
	public List<PushListInq_DODT> getPushListInq_DODT(){
		return pushListInq_DODT;
	}
	
	/**
	 * 푸시.목록.조회.DBM.출력.IO
	 * 
	 * @param pushListInq_DODT 푸시.목록.조회.DBM.출력.IO
	 */
	@JsonSetter("pushListInq_DODT")
	public void setPushListInq_DODT(List<PushListInq_DODT> pushListInq_DODT){
		this.pushListInq_DODT= pushListInq_DODT;
		this.setIsSet_pushListInq_DODT(true);
	}
	
	public void setPushListInq_DODT(PushListInq_DODT... items){
		List<PushListInq_DODT> _items= new ArrayList<>();
		if ( items!= null && items.length> 0){
			for( PushListInq_DODT item: items ){
				_items.add(item);
			}
		}
		this.setPushListInq_DODT(_items);
	}
				
	@Override
	public PushLstInqList_DODT clone(){
		try{
			PushLstInqList_DODT object= (PushLstInqList_DODT)super.clone();
			if ( this.pushListInq_DODT== null ) object.pushListInq_DODT= null;
			else{
				List<PushListInq_DODT> clonedList= new ArrayList<>(this.pushListInq_DODT.size());
				for( PushListInq_DODT item : pushListInq_DODT ){
					clonedList.add((PushListInq_DODT)item.clone());
				}
				object.pushListInq_DODT= clonedList;
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
		
		result= prime * result + ((this.pushListInq_DODT==null)?0:this.pushListInq_DODT.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final PushLstInqList_DODT other= (PushLstInqList_DODT)obj;
		{
			Object _pushListInq_DODT= getPushListInq_DODT();
			Object __pushListInq_DODT= other.getPushListInq_DODT();
			if ( _pushListInq_DODT== null ) { if ( __pushListInq_DODT!= null ) return false; }
			else if ( !_pushListInq_DODT.equals(__pushListInq_DODT) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(PushLstInqList_DODT.class.getName()).append(":\n");
		sb.append("\tpushListInq_DODT: ");
		if ( pushListInq_DODT== null ) sb.append("null");
		else{
			sb.append("array count : ");
			sb.append(pushListInq_DODT.size());
			sb.append("(items)\n");
	
			int max= (10<pushListInq_DODT.size())?10:pushListInq_DODT.size();
	
			for ( int i= 0; i < max; ++i ){
				sb.append("\tpushListInq_DODT[");
				sb.append(i);
				sb.append("] : ");
				sb.append(pushListInq_DODT.get(i));
				sb.append("\n");
			}
	
			if ( max < pushListInq_DODT.size() ){
				sb.append("\tpushListInq_DODT[.] : ").append("more ").append((pushListInq_DODT.size()-max)).append(" items").append("\n");
			}
		}
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		{/*pushListInq_DODT*/
			int size=1;
			int count= pushListInq_DODT == null ? 0 : pushListInq_DODT.size();
			int min= size > count?count:size;
			PushListInq_DODT emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					PushListInq_DODT element= pushListInq_DODT.get(i);
					if ( element != null && !(element instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= element==null?0:( (Predictable)element).predictMessageLength();
				}else{
					if ( emptyElement== null ) emptyElement= new com.skbank.sml.fns.inb.dto.PushListInq_DODT();
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
	
		list.add("pushListInq_DODT");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("pushListInq_DODT", get("pushListInq_DODT"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -2083450426:/* pushListInq_DODT */
			return getPushListInq_DODT();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -2083450426:/* pushListInq_DODT */
			setPushListInq_DODT((List<PushListInq_DODT>)value);
			break;
		default:
			break;
		}
	}
	
}
