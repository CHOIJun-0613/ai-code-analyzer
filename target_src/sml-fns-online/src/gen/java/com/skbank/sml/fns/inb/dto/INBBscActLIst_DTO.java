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
import option.WooriOmmOption;

/**
 * 알림함계좌목록DTO
 */
@WooriOmmOption(propOption=true)
@XmlType(propOrder={
	"iNBActList_DTO"
}, name="INBBscActLIst_DTO")
@XmlRootElement(name="INBBscActLIst_DTO")
@BxmCategory(logicalName="알림함계좌목록DTO", description="알림함계좌목록DTO") 
public class INBBscActLIst_DTO implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -1416013205L;
	
	
	
	/**
	 * 계좌목록DTO
	 */
	@ApiModelProperty(
		name = "iNBActList_DTO"
		, dataType = "[Lcom.skbank.sml.fns.inb.dto.INBActList_DTO;"
		)
	@XmlElement(name="item")
	@XmlElementWrapper()
	@JsonProperty("iNBActList_DTO")
	@BxmOmm_Field(length=0, decimal=0, description="계좌목록DTO", align="left", fill="", arrayReference="1", etcProperties={"PROP_OPTION_DSCD=L999"})
	private List<INBActList_DTO> iNBActList_DTO= new ArrayList<>();
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_iNBActList_DTO= false;
	protected final boolean isSet_iNBActList_DTO(){
		return this.isSet_iNBActList_DTO;
	}
	private void setIsSet_iNBActList_DTO(boolean value){
		this.isSet_iNBActList_DTO= value;
	}
	/**
	 * 계좌목록DTO
	 */
	@XmlTransient
	public List<INBActList_DTO> getiNBActList_DTO(){
		return iNBActList_DTO;
	}
	
	/**
	 * 계좌목록DTO
	 * 
	 * @param iNBActList_DTO 계좌목록DTO
	 */
	@JsonSetter("iNBActList_DTO")
	public void setiNBActList_DTO(List<INBActList_DTO> iNBActList_DTO){
		this.iNBActList_DTO= iNBActList_DTO;
		this.setIsSet_iNBActList_DTO(true);
	}
	
	public void setiNBActList_DTO(INBActList_DTO... items){
		List<INBActList_DTO> _items= new ArrayList<>();
		if ( items!= null && items.length> 0){
			for( INBActList_DTO item: items ){
				_items.add(item);
			}
		}
		this.setiNBActList_DTO(_items);
	}
				
	@Override
	public INBBscActLIst_DTO clone(){
		try{
			INBBscActLIst_DTO object= (INBBscActLIst_DTO)super.clone();
			if ( this.iNBActList_DTO== null ) object.iNBActList_DTO= null;
			else{
				List<INBActList_DTO> clonedList= new ArrayList<>(this.iNBActList_DTO.size());
				for( INBActList_DTO item : iNBActList_DTO ){
					clonedList.add((INBActList_DTO)item.clone());
				}
				object.iNBActList_DTO= clonedList;
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
		
		result= prime * result + ((this.iNBActList_DTO==null)?0:this.iNBActList_DTO.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final INBBscActLIst_DTO other= (INBBscActLIst_DTO)obj;
		{
			Object _iNBActList_DTO= getiNBActList_DTO();
			Object __iNBActList_DTO= other.getiNBActList_DTO();
			if ( _iNBActList_DTO== null ) { if ( __iNBActList_DTO!= null ) return false; }
			else if ( !_iNBActList_DTO.equals(__iNBActList_DTO) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(INBBscActLIst_DTO.class.getName()).append(":\n");
		sb.append("\tiNBActList_DTO: ");
		if ( iNBActList_DTO== null ) sb.append("null");
		else{
			sb.append("array count : ");
			sb.append(iNBActList_DTO.size());
			sb.append("(items)\n");
	
			int max= (10<iNBActList_DTO.size())?10:iNBActList_DTO.size();
	
			for ( int i= 0; i < max; ++i ){
				sb.append("\tiNBActList_DTO[");
				sb.append(i);
				sb.append("] : ");
				sb.append(iNBActList_DTO.get(i));
				sb.append("\n");
			}
	
			if ( max < iNBActList_DTO.size() ){
				sb.append("\tiNBActList_DTO[.] : ").append("more ").append((iNBActList_DTO.size()-max)).append(" items").append("\n");
			}
		}
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		{/*iNBActList_DTO*/
			int size=1;
			int count= iNBActList_DTO == null ? 0 : iNBActList_DTO.size();
			int min= size > count?count:size;
			INBActList_DTO emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					INBActList_DTO element= iNBActList_DTO.get(i);
					if ( element != null && !(element instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= element==null?0:( (Predictable)element).predictMessageLength();
				}else{
					if ( emptyElement== null ) emptyElement= new com.skbank.sml.fns.inb.dto.INBActList_DTO();
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
	
		list.add("iNBActList_DTO");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("iNBActList_DTO", get("iNBActList_DTO"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 356420915:/* iNBActList_DTO */
			return getiNBActList_DTO();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 356420915:/* iNBActList_DTO */
			setiNBActList_DTO((List<INBActList_DTO>)value);
			break;
		default:
			break;
		}
	}
	
}
