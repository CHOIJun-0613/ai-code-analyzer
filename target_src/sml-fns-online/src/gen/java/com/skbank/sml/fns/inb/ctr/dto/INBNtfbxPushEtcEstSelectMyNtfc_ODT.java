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
 * 나만의알림조회ODT
 */
@XmlType(propOrder={
	"myNtfcInqGrid"
}, name="INBNtfbxPushEtcEstSelectMyNtfc_ODT")
@XmlRootElement(name="INBNtfbxPushEtcEstSelectMyNtfc_ODT")
@BxmCategory(logicalName="나만의알림조회ODT", description="나만의알림조회ODT") 
public class INBNtfbxPushEtcEstSelectMyNtfc_ODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -1595043827L;
	
	
	
	/**
	 * 나만의알림조회Grid
	 */
	@ApiModelProperty(
		name = "myNtfcInqGrid"
		, dataType = "[Lcom.skbank.sml.fns.inb.dto.INBMyNtfc_DTO;"
		)
	@XmlElement(name="item")
	@XmlElementWrapper()
	@JsonProperty("myNtfcInqGrid")
	@BxmOmm_Field(length=0, decimal=0, description="나만의알림조회Grid", align="left", fill="", arrayReference="1")
	private List<INBMyNtfc_DTO> myNtfcInqGrid= new ArrayList<>();
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_myNtfcInqGrid= false;
	protected final boolean isSet_myNtfcInqGrid(){
		return this.isSet_myNtfcInqGrid;
	}
	private void setIsSet_myNtfcInqGrid(boolean value){
		this.isSet_myNtfcInqGrid= value;
	}
	/**
	 * 나만의알림조회Grid
	 */
	@XmlTransient
	public List<INBMyNtfc_DTO> getMyNtfcInqGrid(){
		return myNtfcInqGrid;
	}
	
	/**
	 * 나만의알림조회Grid
	 * 
	 * @param myNtfcInqGrid 나만의알림조회Grid
	 */
	@JsonSetter("myNtfcInqGrid")
	public void setMyNtfcInqGrid(List<INBMyNtfc_DTO> myNtfcInqGrid){
		this.myNtfcInqGrid= myNtfcInqGrid;
		this.setIsSet_myNtfcInqGrid(true);
	}
	
	public void setMyNtfcInqGrid(INBMyNtfc_DTO... items){
		List<INBMyNtfc_DTO> _items= new ArrayList<>();
		if ( items!= null && items.length> 0){
			for( INBMyNtfc_DTO item: items ){
				_items.add(item);
			}
		}
		this.setMyNtfcInqGrid(_items);
	}
				
	@Override
	public INBNtfbxPushEtcEstSelectMyNtfc_ODT clone(){
		try{
			INBNtfbxPushEtcEstSelectMyNtfc_ODT object= (INBNtfbxPushEtcEstSelectMyNtfc_ODT)super.clone();
			if ( this.myNtfcInqGrid== null ) object.myNtfcInqGrid= null;
			else{
				List<INBMyNtfc_DTO> clonedList= new ArrayList<>(this.myNtfcInqGrid.size());
				for( INBMyNtfc_DTO item : myNtfcInqGrid ){
					clonedList.add((INBMyNtfc_DTO)item.clone());
				}
				object.myNtfcInqGrid= clonedList;
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
		
		result= prime * result + ((this.myNtfcInqGrid==null)?0:this.myNtfcInqGrid.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final INBNtfbxPushEtcEstSelectMyNtfc_ODT other= (INBNtfbxPushEtcEstSelectMyNtfc_ODT)obj;
		{
			Object _myNtfcInqGrid= getMyNtfcInqGrid();
			Object __myNtfcInqGrid= other.getMyNtfcInqGrid();
			if ( _myNtfcInqGrid== null ) { if ( __myNtfcInqGrid!= null ) return false; }
			else if ( !_myNtfcInqGrid.equals(__myNtfcInqGrid) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(INBNtfbxPushEtcEstSelectMyNtfc_ODT.class.getName()).append(":\n");
		sb.append("\tmyNtfcInqGrid: ");
		if ( myNtfcInqGrid== null ) sb.append("null");
		else{
			sb.append("array count : ");
			sb.append(myNtfcInqGrid.size());
			sb.append("(items)\n");
	
			int max= (10<myNtfcInqGrid.size())?10:myNtfcInqGrid.size();
	
			for ( int i= 0; i < max; ++i ){
				sb.append("\tmyNtfcInqGrid[");
				sb.append(i);
				sb.append("] : ");
				sb.append(myNtfcInqGrid.get(i));
				sb.append("\n");
			}
	
			if ( max < myNtfcInqGrid.size() ){
				sb.append("\tmyNtfcInqGrid[.] : ").append("more ").append((myNtfcInqGrid.size()-max)).append(" items").append("\n");
			}
		}
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		{/*myNtfcInqGrid*/
			int size=1;
			int count= myNtfcInqGrid == null ? 0 : myNtfcInqGrid.size();
			int min= size > count?count:size;
			INBMyNtfc_DTO emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					INBMyNtfc_DTO element= myNtfcInqGrid.get(i);
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
	
		list.add("myNtfcInqGrid");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("myNtfcInqGrid", get("myNtfcInqGrid"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 1455789443:/* myNtfcInqGrid */
			return getMyNtfcInqGrid();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 1455789443:/* myNtfcInqGrid */
			setMyNtfcInqGrid((List<INBMyNtfc_DTO>)value);
			break;
		default:
			break;
		}
	}
	
}
