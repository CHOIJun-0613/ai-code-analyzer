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
import com.skbank.sml.fns.inb.dto.INBRawNtfcEstRgs_DTO;
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
 * 입출금알림동의여부해지IDT
 */
@XmlType(propOrder={
	"rawNtfcEstRgsGrid", "switchAllYn"
}, name="INBNtfbxPushRawEstDeleteRawNtfcAgrYn_IDT")
@XmlRootElement(name="INBNtfbxPushRawEstDeleteRawNtfcAgrYn_IDT")
@BxmCategory(logicalName="입출금알림동의여부해지IDT", description="입출금알림동의여부해지IDT") 
public class INBNtfbxPushRawEstDeleteRawNtfcAgrYn_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -508521463L;
	
	
	
	/**
	 * 입출금알림등록GRID
	 */
	@ApiModelProperty(
		name = "rawNtfcEstRgsGrid"
		, dataType = "[Lcom.skbank.sml.fns.inb.dto.INBRawNtfcEstRgs_DTO;"
		)
	@XmlElement(name="item")
	@XmlElementWrapper()
	@JsonProperty("rawNtfcEstRgsGrid")
	@BxmOmm_Field(length=0, decimal=0, description="입출금알림등록GRID", align="left", fill="", arrayReference="1")
	private List<INBRawNtfcEstRgs_DTO> rawNtfcEstRgsGrid= new ArrayList<>();
	
	/**
	 * 스위치전체여부 
	 */
	@ApiModelProperty(
		name = "switchAllYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("switchAllYn")
	@BxmOmm_Field(length=1, decimal=0, description="스위치전체여부 ", align="left", fill="")
	private String switchAllYn= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rawNtfcEstRgsGrid= false;
	protected final boolean isSet_rawNtfcEstRgsGrid(){
		return this.isSet_rawNtfcEstRgsGrid;
	}
	private void setIsSet_rawNtfcEstRgsGrid(boolean value){
		this.isSet_rawNtfcEstRgsGrid= value;
	}
	/**
	 * 입출금알림등록GRID
	 */
	@XmlTransient
	public List<INBRawNtfcEstRgs_DTO> getRawNtfcEstRgsGrid(){
		return rawNtfcEstRgsGrid;
	}
	
	/**
	 * 입출금알림등록GRID
	 * 
	 * @param rawNtfcEstRgsGrid 입출금알림등록GRID
	 */
	@JsonSetter("rawNtfcEstRgsGrid")
	public void setRawNtfcEstRgsGrid(List<INBRawNtfcEstRgs_DTO> rawNtfcEstRgsGrid){
		this.rawNtfcEstRgsGrid= rawNtfcEstRgsGrid;
		this.setIsSet_rawNtfcEstRgsGrid(true);
	}
	
	public void setRawNtfcEstRgsGrid(INBRawNtfcEstRgs_DTO... items){
		List<INBRawNtfcEstRgs_DTO> _items= new ArrayList<>();
		if ( items!= null && items.length> 0){
			for( INBRawNtfcEstRgs_DTO item: items ){
				_items.add(item);
			}
		}
		this.setRawNtfcEstRgsGrid(_items);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_switchAllYn= false;
	protected final boolean isSet_switchAllYn(){
		return this.isSet_switchAllYn;
	}
	private void setIsSet_switchAllYn(boolean value){
		this.isSet_switchAllYn= value;
	}
	/**
	 * 스위치전체여부 
	 */
	@XmlTransient
	public String getSwitchAllYn(){
		return this.switchAllYn;
	}
	
	/**
	 * 스위치전체여부 
	 * 
	 * @param switchAllYn 스위치전체여부 
	 */
	public void setSwitchAllYn(String switchAllYn){
		this.switchAllYn= switchAllYn;
		this.setIsSet_switchAllYn(true);
	}
				
	@Override
	public INBNtfbxPushRawEstDeleteRawNtfcAgrYn_IDT clone(){
		try{
			INBNtfbxPushRawEstDeleteRawNtfcAgrYn_IDT object= (INBNtfbxPushRawEstDeleteRawNtfcAgrYn_IDT)super.clone();
			if ( this.rawNtfcEstRgsGrid== null ) object.rawNtfcEstRgsGrid= null;
			else{
				List<INBRawNtfcEstRgs_DTO> clonedList= new ArrayList<>(this.rawNtfcEstRgsGrid.size());
				for( INBRawNtfcEstRgs_DTO item : rawNtfcEstRgsGrid ){
					clonedList.add((INBRawNtfcEstRgs_DTO)item.clone());
				}
				object.rawNtfcEstRgsGrid= clonedList;
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
		
		result= prime * result + ((this.rawNtfcEstRgsGrid==null)?0:this.rawNtfcEstRgsGrid.hashCode());
		result= prime * result + ((this.switchAllYn==null)?0:this.switchAllYn.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final INBNtfbxPushRawEstDeleteRawNtfcAgrYn_IDT other= (INBNtfbxPushRawEstDeleteRawNtfcAgrYn_IDT)obj;
		{
			Object _rawNtfcEstRgsGrid= getRawNtfcEstRgsGrid();
			Object __rawNtfcEstRgsGrid= other.getRawNtfcEstRgsGrid();
			if ( _rawNtfcEstRgsGrid== null ) { if ( __rawNtfcEstRgsGrid!= null ) return false; }
			else if ( !_rawNtfcEstRgsGrid.equals(__rawNtfcEstRgsGrid) ) return false;
		}
		{
			Object _switchAllYn= getSwitchAllYn();
			Object __switchAllYn= other.getSwitchAllYn();
			if ( _switchAllYn== null ) { if ( __switchAllYn!= null ) return false; }
			else if ( !_switchAllYn.equals(__switchAllYn) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(INBNtfbxPushRawEstDeleteRawNtfcAgrYn_IDT.class.getName()).append(":\n");
		sb.append("\trawNtfcEstRgsGrid: ");
		if ( rawNtfcEstRgsGrid== null ) sb.append("null");
		else{
			sb.append("array count : ");
			sb.append(rawNtfcEstRgsGrid.size());
			sb.append("(items)\n");
	
			int max= (10<rawNtfcEstRgsGrid.size())?10:rawNtfcEstRgsGrid.size();
	
			for ( int i= 0; i < max; ++i ){
				sb.append("\trawNtfcEstRgsGrid[");
				sb.append(i);
				sb.append("] : ");
				sb.append(rawNtfcEstRgsGrid.get(i));
				sb.append("\n");
			}
	
			if ( max < rawNtfcEstRgsGrid.size() ){
				sb.append("\trawNtfcEstRgsGrid[.] : ").append("more ").append((rawNtfcEstRgsGrid.size()-max)).append(" items").append("\n");
			}
		}
		sb.append("\tswitchAllYn: ");
		sb.append(switchAllYn==null?"null":getSwitchAllYn());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		{/*rawNtfcEstRgsGrid*/
			int size=1;
			int count= rawNtfcEstRgsGrid == null ? 0 : rawNtfcEstRgsGrid.size();
			int min= size > count?count:size;
			INBRawNtfcEstRgs_DTO emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					INBRawNtfcEstRgs_DTO element= rawNtfcEstRgsGrid.get(i);
					if ( element != null && !(element instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= element==null?0:( (Predictable)element).predictMessageLength();
				}else{
					if ( emptyElement== null ) emptyElement= new com.skbank.sml.fns.inb.dto.INBRawNtfcEstRgs_DTO();
					if ( !(emptyElement instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= ( (Predictable)emptyElement).predictMessageLength();
				}
			}
		}
		messageLen+= 1; /* switchAllYn */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("rawNtfcEstRgsGrid");
		list.add("switchAllYn");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("rawNtfcEstRgsGrid", get("rawNtfcEstRgsGrid"));
		map.put("switchAllYn", get("switchAllYn"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -543287159:/* rawNtfcEstRgsGrid */
			return getRawNtfcEstRgsGrid();
		case 2101434818:/* switchAllYn */
			return getSwitchAllYn();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -543287159:/* rawNtfcEstRgsGrid */
			setRawNtfcEstRgsGrid((List<INBRawNtfcEstRgs_DTO>)value);
			break;
		case 2101434818:/* switchAllYn */
			setSwitchAllYn((String)value);
			break;
		default:
			break;
		}
	}
	
}
