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
import com.skbank.sml.fns.inb.dto.INBCtgrClfGrid_DTO;
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
 * 카테고리분류.컨트롤러.출력.IO
 */
@XmlType(propOrder={
	"iNBCtgrClfGrid_DTO"
}, name="INBNtfbxListInqSelectCtgrClf_ODT")
@XmlRootElement(name="INBNtfbxListInqSelectCtgrClf_ODT")
@BxmCategory(logicalName="카테고리분류.컨트롤러.출력.IO", description="카테고리분류.컨트롤러.출력.IO") 
public class INBNtfbxListInqSelectCtgrClf_ODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 956792173L;
	
	
	
	/**
	 * 카테고리분류.GRID.공통.IO
	 */
	@ApiModelProperty(
		name = "iNBCtgrClfGrid_DTO"
		, dataType = "[Lcom.skbank.sml.fns.inb.dto.INBCtgrClfGrid_DTO;"
		)
	@XmlElement(name="item")
	@XmlElementWrapper()
	@JsonProperty("iNBCtgrClfGrid_DTO")
	@BxmOmm_Field(length=0, decimal=0, description="카테고리분류.GRID.공통.IO", align="left", fill="", arrayReference="1")
	private List<INBCtgrClfGrid_DTO> iNBCtgrClfGrid_DTO= new ArrayList<>();
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_iNBCtgrClfGrid_DTO= false;
	protected final boolean isSet_iNBCtgrClfGrid_DTO(){
		return this.isSet_iNBCtgrClfGrid_DTO;
	}
	private void setIsSet_iNBCtgrClfGrid_DTO(boolean value){
		this.isSet_iNBCtgrClfGrid_DTO= value;
	}
	/**
	 * 카테고리분류.GRID.공통.IO
	 */
	@XmlTransient
	public List<INBCtgrClfGrid_DTO> getiNBCtgrClfGrid_DTO(){
		return iNBCtgrClfGrid_DTO;
	}
	
	/**
	 * 카테고리분류.GRID.공통.IO
	 * 
	 * @param iNBCtgrClfGrid_DTO 카테고리분류.GRID.공통.IO
	 */
	@JsonSetter("iNBCtgrClfGrid_DTO")
	public void setiNBCtgrClfGrid_DTO(List<INBCtgrClfGrid_DTO> iNBCtgrClfGrid_DTO){
		this.iNBCtgrClfGrid_DTO= iNBCtgrClfGrid_DTO;
		this.setIsSet_iNBCtgrClfGrid_DTO(true);
	}
	
	public void setiNBCtgrClfGrid_DTO(INBCtgrClfGrid_DTO... items){
		List<INBCtgrClfGrid_DTO> _items= new ArrayList<>();
		if ( items!= null && items.length> 0){
			for( INBCtgrClfGrid_DTO item: items ){
				_items.add(item);
			}
		}
		this.setiNBCtgrClfGrid_DTO(_items);
	}
				
	@Override
	public INBNtfbxListInqSelectCtgrClf_ODT clone(){
		try{
			INBNtfbxListInqSelectCtgrClf_ODT object= (INBNtfbxListInqSelectCtgrClf_ODT)super.clone();
			if ( this.iNBCtgrClfGrid_DTO== null ) object.iNBCtgrClfGrid_DTO= null;
			else{
				List<INBCtgrClfGrid_DTO> clonedList= new ArrayList<>(this.iNBCtgrClfGrid_DTO.size());
				for( INBCtgrClfGrid_DTO item : iNBCtgrClfGrid_DTO ){
					clonedList.add((INBCtgrClfGrid_DTO)item.clone());
				}
				object.iNBCtgrClfGrid_DTO= clonedList;
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
		
		result= prime * result + ((this.iNBCtgrClfGrid_DTO==null)?0:this.iNBCtgrClfGrid_DTO.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final INBNtfbxListInqSelectCtgrClf_ODT other= (INBNtfbxListInqSelectCtgrClf_ODT)obj;
		{
			Object _iNBCtgrClfGrid_DTO= getiNBCtgrClfGrid_DTO();
			Object __iNBCtgrClfGrid_DTO= other.getiNBCtgrClfGrid_DTO();
			if ( _iNBCtgrClfGrid_DTO== null ) { if ( __iNBCtgrClfGrid_DTO!= null ) return false; }
			else if ( !_iNBCtgrClfGrid_DTO.equals(__iNBCtgrClfGrid_DTO) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(INBNtfbxListInqSelectCtgrClf_ODT.class.getName()).append(":\n");
		sb.append("\tiNBCtgrClfGrid_DTO: ");
		if ( iNBCtgrClfGrid_DTO== null ) sb.append("null");
		else{
			sb.append("array count : ");
			sb.append(iNBCtgrClfGrid_DTO.size());
			sb.append("(items)\n");
	
			int max= (10<iNBCtgrClfGrid_DTO.size())?10:iNBCtgrClfGrid_DTO.size();
	
			for ( int i= 0; i < max; ++i ){
				sb.append("\tiNBCtgrClfGrid_DTO[");
				sb.append(i);
				sb.append("] : ");
				sb.append(iNBCtgrClfGrid_DTO.get(i));
				sb.append("\n");
			}
	
			if ( max < iNBCtgrClfGrid_DTO.size() ){
				sb.append("\tiNBCtgrClfGrid_DTO[.] : ").append("more ").append((iNBCtgrClfGrid_DTO.size()-max)).append(" items").append("\n");
			}
		}
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		{/*iNBCtgrClfGrid_DTO*/
			int size=1;
			int count= iNBCtgrClfGrid_DTO == null ? 0 : iNBCtgrClfGrid_DTO.size();
			int min= size > count?count:size;
			INBCtgrClfGrid_DTO emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					INBCtgrClfGrid_DTO element= iNBCtgrClfGrid_DTO.get(i);
					if ( element != null && !(element instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= element==null?0:( (Predictable)element).predictMessageLength();
				}else{
					if ( emptyElement== null ) emptyElement= new com.skbank.sml.fns.inb.dto.INBCtgrClfGrid_DTO();
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
	
		list.add("iNBCtgrClfGrid_DTO");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("iNBCtgrClfGrid_DTO", get("iNBCtgrClfGrid_DTO"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -857680598:/* iNBCtgrClfGrid_DTO */
			return getiNBCtgrClfGrid_DTO();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -857680598:/* iNBCtgrClfGrid_DTO */
			setiNBCtgrClfGrid_DTO((List<INBCtgrClfGrid_DTO>)value);
			break;
		default:
			break;
		}
	}
	
}
