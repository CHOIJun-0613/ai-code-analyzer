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
import com.skbank.sml.fns.inb.dto.INBMyNtfc_DTO;
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
 * 나만의알림삭제IDT
 */
@XmlType(propOrder={
	"myNtfcGrid"
}, name="INBNtfbxPushEtcEstDeleteMyNtfc_IDT")
@XmlRootElement(name="INBNtfbxPushEtcEstDeleteMyNtfc_IDT")
@BxmCategory(logicalName="나만의알림삭제IDT", description="나만의알림삭제IDT") 
public class INBNtfbxPushEtcEstDeleteMyNtfc_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 851901302L;
	
	
	
	/**
	 * 나만의알림그리드
	 */
	@ApiModelProperty(
		name = "myNtfcGrid"
		, dataType = "[Lcom.skbank.sml.fns.inb.dto.INBMyNtfc_DTO;"
		)
	@XmlElement(name="item")
	@XmlElementWrapper()
	@JsonProperty("myNtfcGrid")
	@BxmOmm_Field(length=0, decimal=0, description="나만의알림그리드", align="left", fill="", arrayReference="1")
	private List<INBMyNtfc_DTO> myNtfcGrid= new ArrayList<>();
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_myNtfcGrid= false;
	protected final boolean isSet_myNtfcGrid(){
		return this.isSet_myNtfcGrid;
	}
	private void setIsSet_myNtfcGrid(boolean value){
		this.isSet_myNtfcGrid= value;
	}
	/**
	 * 나만의알림그리드
	 */
	@XmlTransient
	public List<INBMyNtfc_DTO> getMyNtfcGrid(){
		return myNtfcGrid;
	}
	
	/**
	 * 나만의알림그리드
	 * 
	 * @param myNtfcGrid 나만의알림그리드
	 */
	@JsonSetter("myNtfcGrid")
	public void setMyNtfcGrid(List<INBMyNtfc_DTO> myNtfcGrid){
		this.myNtfcGrid= myNtfcGrid;
		this.setIsSet_myNtfcGrid(true);
	}
	
	public void setMyNtfcGrid(INBMyNtfc_DTO... items){
		List<INBMyNtfc_DTO> _items= new ArrayList<>();
		if ( items!= null && items.length> 0){
			for( INBMyNtfc_DTO item: items ){
				_items.add(item);
			}
		}
		this.setMyNtfcGrid(_items);
	}
				
	@Override
	public INBNtfbxPushEtcEstDeleteMyNtfc_IDT clone(){
		try{
			INBNtfbxPushEtcEstDeleteMyNtfc_IDT object= (INBNtfbxPushEtcEstDeleteMyNtfc_IDT)super.clone();
			if ( this.myNtfcGrid== null ) object.myNtfcGrid= null;
			else{
				List<INBMyNtfc_DTO> clonedList= new ArrayList<>(this.myNtfcGrid.size());
				for( INBMyNtfc_DTO item : myNtfcGrid ){
					clonedList.add((INBMyNtfc_DTO)item.clone());
				}
				object.myNtfcGrid= clonedList;
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
		
		result= prime * result + ((this.myNtfcGrid==null)?0:this.myNtfcGrid.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final INBNtfbxPushEtcEstDeleteMyNtfc_IDT other= (INBNtfbxPushEtcEstDeleteMyNtfc_IDT)obj;
		{
			Object _myNtfcGrid= getMyNtfcGrid();
			Object __myNtfcGrid= other.getMyNtfcGrid();
			if ( _myNtfcGrid== null ) { if ( __myNtfcGrid!= null ) return false; }
			else if ( !_myNtfcGrid.equals(__myNtfcGrid) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(INBNtfbxPushEtcEstDeleteMyNtfc_IDT.class.getName()).append(":\n");
		sb.append("\tmyNtfcGrid: ");
		if ( myNtfcGrid== null ) sb.append("null");
		else{
			sb.append("array count : ");
			sb.append(myNtfcGrid.size());
			sb.append("(items)\n");
	
			int max= (10<myNtfcGrid.size())?10:myNtfcGrid.size();
	
			for ( int i= 0; i < max; ++i ){
				sb.append("\tmyNtfcGrid[");
				sb.append(i);
				sb.append("] : ");
				sb.append(myNtfcGrid.get(i));
				sb.append("\n");
			}
	
			if ( max < myNtfcGrid.size() ){
				sb.append("\tmyNtfcGrid[.] : ").append("more ").append((myNtfcGrid.size()-max)).append(" items").append("\n");
			}
		}
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		{/*myNtfcGrid*/
			int size=1;
			int count= myNtfcGrid == null ? 0 : myNtfcGrid.size();
			int min= size > count?count:size;
			INBMyNtfc_DTO emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					INBMyNtfc_DTO element= myNtfcGrid.get(i);
					if ( element != null && !(element instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= element==null?0:( (Predictable)element).predictMessageLength();
				}else{
					if ( emptyElement== null ) emptyElement= new com.skbank.sml.fns.inb.dto.INBMyNtfc_DTO();
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
	
		list.add("myNtfcGrid");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("myNtfcGrid", get("myNtfcGrid"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 1781501109:/* myNtfcGrid */
			return getMyNtfcGrid();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 1781501109:/* myNtfcGrid */
			setMyNtfcGrid((List<INBMyNtfc_DTO>)value);
			break;
		default:
			break;
		}
	}
	
}
