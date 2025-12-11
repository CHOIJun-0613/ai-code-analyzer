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
 * 알림열람여부 DIDT
 */
@XmlType(propOrder={
	"itcsno", "iNBNtfcReadYnGrid_DTO"
}, name="NtfcReadYn_DIDT")
@XmlRootElement(name="NtfcReadYn_DIDT")
@BxmCategory(logicalName="알림열람여부 DIDT", description="알림열람여부 DIDT") 
public class NtfcReadYn_DIDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -1149750058L;
	
	
	
	/**
	 * 통합고객번호
	 */
	@ApiModelProperty(
		name = "itcsno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("itcsno")
	@BxmOmm_Field(length=11, decimal=0, description="통합고객번호", align="left", fill="")
	private String itcsno= "";
	
	
	/**
	 * 메시지리스트
	 */
	@ApiModelProperty(
		name = "iNBNtfcReadYnGrid_DTO"
		, dataType = "[Lcom.skbank.sml.fns.inb.dto.INBNtfcReadYnGrid_DTO;"
		)
	@XmlElement(name="item")
	@XmlElementWrapper()
	@JsonProperty("iNBNtfcReadYnGrid_DTO")
	@BxmOmm_Field(length=0, decimal=0, description="메시지리스트", align="left", fill="", arrayReference="1")
	private List<INBNtfcReadYnGrid_DTO> iNBNtfcReadYnGrid_DTO= new ArrayList<>();
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_itcsno= false;
	protected final boolean isSet_itcsno(){
		return this.isSet_itcsno;
	}
	private void setIsSet_itcsno(boolean value){
		this.isSet_itcsno= value;
	}
	/**
	 * 통합고객번호
	 */
	@XmlTransient
	public String getItcsno(){
		return this.itcsno;
	}
	
	/**
	 * 통합고객번호
	 * 
	 * @param itcsno 통합고객번호
	 */
	public void setItcsno(String itcsno){
		this.itcsno= itcsno;
		this.setIsSet_itcsno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_iNBNtfcReadYnGrid_DTO= false;
	protected final boolean isSet_iNBNtfcReadYnGrid_DTO(){
		return this.isSet_iNBNtfcReadYnGrid_DTO;
	}
	private void setIsSet_iNBNtfcReadYnGrid_DTO(boolean value){
		this.isSet_iNBNtfcReadYnGrid_DTO= value;
	}
	/**
	 * 메시지리스트
	 */
	@XmlTransient
	public List<INBNtfcReadYnGrid_DTO> getiNBNtfcReadYnGrid_DTO(){
		return iNBNtfcReadYnGrid_DTO;
	}
	
	/**
	 * 메시지리스트
	 * 
	 * @param iNBNtfcReadYnGrid_DTO 메시지리스트
	 */
	@JsonSetter("iNBNtfcReadYnGrid_DTO")
	public void setiNBNtfcReadYnGrid_DTO(List<INBNtfcReadYnGrid_DTO> iNBNtfcReadYnGrid_DTO){
		this.iNBNtfcReadYnGrid_DTO= iNBNtfcReadYnGrid_DTO;
		this.setIsSet_iNBNtfcReadYnGrid_DTO(true);
	}
	
	public void setiNBNtfcReadYnGrid_DTO(INBNtfcReadYnGrid_DTO... items){
		List<INBNtfcReadYnGrid_DTO> _items= new ArrayList<>();
		if ( items!= null && items.length> 0){
			for( INBNtfcReadYnGrid_DTO item: items ){
				_items.add(item);
			}
		}
		this.setiNBNtfcReadYnGrid_DTO(_items);
	}
				
	@Override
	public NtfcReadYn_DIDT clone(){
		try{
			NtfcReadYn_DIDT object= (NtfcReadYn_DIDT)super.clone();
			if ( this.iNBNtfcReadYnGrid_DTO== null ) object.iNBNtfcReadYnGrid_DTO= null;
			else{
				List<INBNtfcReadYnGrid_DTO> clonedList= new ArrayList<>(this.iNBNtfcReadYnGrid_DTO.size());
				for( INBNtfcReadYnGrid_DTO item : iNBNtfcReadYnGrid_DTO ){
					clonedList.add((INBNtfcReadYnGrid_DTO)item.clone());
				}
				object.iNBNtfcReadYnGrid_DTO= clonedList;
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
		
		result= prime * result + ((this.itcsno==null)?0:this.itcsno.hashCode());
		result= prime * result + ((this.iNBNtfcReadYnGrid_DTO==null)?0:this.iNBNtfcReadYnGrid_DTO.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final NtfcReadYn_DIDT other= (NtfcReadYn_DIDT)obj;
		{
			Object _itcsno= getItcsno();
			Object __itcsno= other.getItcsno();
			if ( _itcsno== null ) { if ( __itcsno!= null ) return false; }
			else if ( !_itcsno.equals(__itcsno) ) return false;
		}
		{
			Object _iNBNtfcReadYnGrid_DTO= getiNBNtfcReadYnGrid_DTO();
			Object __iNBNtfcReadYnGrid_DTO= other.getiNBNtfcReadYnGrid_DTO();
			if ( _iNBNtfcReadYnGrid_DTO== null ) { if ( __iNBNtfcReadYnGrid_DTO!= null ) return false; }
			else if ( !_iNBNtfcReadYnGrid_DTO.equals(__iNBNtfcReadYnGrid_DTO) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(NtfcReadYn_DIDT.class.getName()).append(":\n");
		sb.append("\titcsno: ");
		sb.append(itcsno==null?"null":getItcsno());
		sb.append("\n");
		sb.append("\tiNBNtfcReadYnGrid_DTO: ");
		if ( iNBNtfcReadYnGrid_DTO== null ) sb.append("null");
		else{
			sb.append("array count : ");
			sb.append(iNBNtfcReadYnGrid_DTO.size());
			sb.append("(items)\n");
	
			int max= (10<iNBNtfcReadYnGrid_DTO.size())?10:iNBNtfcReadYnGrid_DTO.size();
	
			for ( int i= 0; i < max; ++i ){
				sb.append("\tiNBNtfcReadYnGrid_DTO[");
				sb.append(i);
				sb.append("] : ");
				sb.append(iNBNtfcReadYnGrid_DTO.get(i));
				sb.append("\n");
			}
	
			if ( max < iNBNtfcReadYnGrid_DTO.size() ){
				sb.append("\tiNBNtfcReadYnGrid_DTO[.] : ").append("more ").append((iNBNtfcReadYnGrid_DTO.size()-max)).append(" items").append("\n");
			}
		}
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 11; /* itcsno */
		{/*iNBNtfcReadYnGrid_DTO*/
			int size=1;
			int count= iNBNtfcReadYnGrid_DTO == null ? 0 : iNBNtfcReadYnGrid_DTO.size();
			int min= size > count?count:size;
			INBNtfcReadYnGrid_DTO emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					INBNtfcReadYnGrid_DTO element= iNBNtfcReadYnGrid_DTO.get(i);
					if ( element != null && !(element instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= element==null?0:( (Predictable)element).predictMessageLength();
				}else{
					if ( emptyElement== null ) emptyElement= new com.skbank.sml.fns.inb.dto.INBNtfcReadYnGrid_DTO();
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
	
		list.add("itcsno");
		list.add("iNBNtfcReadYnGrid_DTO");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("itcsno", get("itcsno"));
		map.put("iNBNtfcReadYnGrid_DTO", get("iNBNtfcReadYnGrid_DTO"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -1178714660:/* itcsno */
			return getItcsno();
		case 360902737:/* iNBNtfcReadYnGrid_DTO */
			return getiNBNtfcReadYnGrid_DTO();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -1178714660:/* itcsno */
			setItcsno((String)value);
			break;
		case 360902737:/* iNBNtfcReadYnGrid_DTO */
			setiNBNtfcReadYnGrid_DTO((List<INBNtfcReadYnGrid_DTO>)value);
			break;
		default:
			break;
		}
	}
	
}
