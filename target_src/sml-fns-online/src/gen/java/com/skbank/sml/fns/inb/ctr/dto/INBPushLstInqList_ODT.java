/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.inb.ctr.dto;

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
	"iNBPushListInq_ODT"
}, name="INBPushLstInqList_ODT")
@XmlRootElement(name="INBPushLstInqList_ODT")
@BxmCategory(logicalName="푸시.목록.조회.리스트.컨트롤러.출력.IO", description="") 
public class INBPushLstInqList_ODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 717194487L;
	
	
	
	/**
	 * 푸시.목록.조회.컨트롤러.출력.IO
	 */
	@ApiModelProperty(
		name = "iNBPushListInq_ODT"
		, dataType = "[Lcom.skbank.sml.fns.inb.ctr.dto.INBPushListInq_ODT;"
		)
	@XmlElement(name="item")
	@XmlElementWrapper()
	@JsonProperty("iNBPushListInq_ODT")
	@BxmOmm_Field(length=0, decimal=0, description="푸시.목록.조회.컨트롤러.출력.IO", align="left", fill="", arrayReference="1")
	private List<INBPushListInq_ODT> iNBPushListInq_ODT= new ArrayList<>();
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_iNBPushListInq_ODT= false;
	protected final boolean isSet_iNBPushListInq_ODT(){
		return this.isSet_iNBPushListInq_ODT;
	}
	private void setIsSet_iNBPushListInq_ODT(boolean value){
		this.isSet_iNBPushListInq_ODT= value;
	}
	/**
	 * 푸시.목록.조회.컨트롤러.출력.IO
	 */
	@XmlTransient
	public List<INBPushListInq_ODT> getiNBPushListInq_ODT(){
		return iNBPushListInq_ODT;
	}
	
	/**
	 * 푸시.목록.조회.컨트롤러.출력.IO
	 * 
	 * @param iNBPushListInq_ODT 푸시.목록.조회.컨트롤러.출력.IO
	 */
	@JsonSetter("iNBPushListInq_ODT")
	public void setiNBPushListInq_ODT(List<INBPushListInq_ODT> iNBPushListInq_ODT){
		this.iNBPushListInq_ODT= iNBPushListInq_ODT;
		this.setIsSet_iNBPushListInq_ODT(true);
	}
	
	public void setiNBPushListInq_ODT(INBPushListInq_ODT... items){
		List<INBPushListInq_ODT> _items= new ArrayList<>();
		if ( items!= null && items.length> 0){
			for( INBPushListInq_ODT item: items ){
				_items.add(item);
			}
		}
		this.setiNBPushListInq_ODT(_items);
	}
				
	@Override
	public INBPushLstInqList_ODT clone(){
		try{
			INBPushLstInqList_ODT object= (INBPushLstInqList_ODT)super.clone();
			if ( this.iNBPushListInq_ODT== null ) object.iNBPushListInq_ODT= null;
			else{
				List<INBPushListInq_ODT> clonedList= new ArrayList<>(this.iNBPushListInq_ODT.size());
				for( INBPushListInq_ODT item : iNBPushListInq_ODT ){
					clonedList.add((INBPushListInq_ODT)item.clone());
				}
				object.iNBPushListInq_ODT= clonedList;
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
		
		result= prime * result + ((this.iNBPushListInq_ODT==null)?0:this.iNBPushListInq_ODT.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final INBPushLstInqList_ODT other= (INBPushLstInqList_ODT)obj;
		{
			Object _iNBPushListInq_ODT= getiNBPushListInq_ODT();
			Object __iNBPushListInq_ODT= other.getiNBPushListInq_ODT();
			if ( _iNBPushListInq_ODT== null ) { if ( __iNBPushListInq_ODT!= null ) return false; }
			else if ( !_iNBPushListInq_ODT.equals(__iNBPushListInq_ODT) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(INBPushLstInqList_ODT.class.getName()).append(":\n");
		sb.append("\tiNBPushListInq_ODT: ");
		if ( iNBPushListInq_ODT== null ) sb.append("null");
		else{
			sb.append("array count : ");
			sb.append(iNBPushListInq_ODT.size());
			sb.append("(items)\n");
	
			int max= (10<iNBPushListInq_ODT.size())?10:iNBPushListInq_ODT.size();
	
			for ( int i= 0; i < max; ++i ){
				sb.append("\tiNBPushListInq_ODT[");
				sb.append(i);
				sb.append("] : ");
				sb.append(iNBPushListInq_ODT.get(i));
				sb.append("\n");
			}
	
			if ( max < iNBPushListInq_ODT.size() ){
				sb.append("\tiNBPushListInq_ODT[.] : ").append("more ").append((iNBPushListInq_ODT.size()-max)).append(" items").append("\n");
			}
		}
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		{/*iNBPushListInq_ODT*/
			int size=1;
			int count= iNBPushListInq_ODT == null ? 0 : iNBPushListInq_ODT.size();
			int min= size > count?count:size;
			INBPushListInq_ODT emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					INBPushListInq_ODT element= iNBPushListInq_ODT.get(i);
					if ( element != null && !(element instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= element==null?0:( (Predictable)element).predictMessageLength();
				}else{
					if ( emptyElement== null ) emptyElement= new com.skbank.sml.fns.inb.ctr.dto.INBPushListInq_ODT();
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
	
		list.add("iNBPushListInq_ODT");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("iNBPushListInq_ODT", get("iNBPushListInq_ODT"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -642552137:/* iNBPushListInq_ODT */
			return getiNBPushListInq_ODT();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -642552137:/* iNBPushListInq_ODT */
			setiNBPushListInq_ODT((List<INBPushListInq_ODT>)value);
			break;
		default:
			break;
		}
	}
	
}
