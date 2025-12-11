/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.pbp.ctr.dto;

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
 * 
 */
@WooriOmmOption(propOption=true)
@XmlType(propOrder={
	"pBPJnngAvlActInf_DTO"
}, name="PBPPbokSpceBscMngSelectActlist_ODT")
@XmlRootElement(name="PBPPbokSpceBscMngSelectActlist_ODT")
@BxmCategory(logicalName="계좌.정보.컨트롤러.출력.IO", description="") 
public class PBPPbokSpceBscMngSelectActlist_ODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 837765777L;
	
	
	
	/**
	 * 계좌.정보.목록.컨트롤러.출력.IO
	 */
	@ApiModelProperty(
		name = "pBPJnngAvlActInf_DTO"
		, dataType = "[Lcom.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceBscMngSelectActinf_ODT;"
		)
	@XmlElement(name="item")
	@XmlElementWrapper()
	@JsonProperty("pBPJnngAvlActInf_DTO")
	@BxmOmm_Field(length=0, decimal=0, description="계좌.정보.목록.컨트롤러.출력.IO", align="left", fill="", arrayReference="1", etcProperties={"PROP_OPTION_DSCD=L999"})
	private List<PBPPbokSpceBscMngSelectActinf_ODT> pBPJnngAvlActInf_DTO= new ArrayList<>();
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pBPJnngAvlActInf_DTO= false;
	protected final boolean isSet_pBPJnngAvlActInf_DTO(){
		return this.isSet_pBPJnngAvlActInf_DTO;
	}
	private void setIsSet_pBPJnngAvlActInf_DTO(boolean value){
		this.isSet_pBPJnngAvlActInf_DTO= value;
	}
	/**
	 * 계좌.정보.목록.컨트롤러.출력.IO
	 */
	@XmlTransient
	public List<PBPPbokSpceBscMngSelectActinf_ODT> getpBPJnngAvlActInf_DTO(){
		return pBPJnngAvlActInf_DTO;
	}
	
	/**
	 * 계좌.정보.목록.컨트롤러.출력.IO
	 * 
	 * @param pBPJnngAvlActInf_DTO 계좌.정보.목록.컨트롤러.출력.IO
	 */
	@JsonSetter("pBPJnngAvlActInf_DTO")
	public void setpBPJnngAvlActInf_DTO(List<PBPPbokSpceBscMngSelectActinf_ODT> pBPJnngAvlActInf_DTO){
		this.pBPJnngAvlActInf_DTO= pBPJnngAvlActInf_DTO;
		this.setIsSet_pBPJnngAvlActInf_DTO(true);
	}
	
	public void setpBPJnngAvlActInf_DTO(PBPPbokSpceBscMngSelectActinf_ODT... items){
		List<PBPPbokSpceBscMngSelectActinf_ODT> _items= new ArrayList<>();
		if ( items!= null && items.length> 0){
			for( PBPPbokSpceBscMngSelectActinf_ODT item: items ){
				_items.add(item);
			}
		}
		this.setpBPJnngAvlActInf_DTO(_items);
	}
				
	@Override
	public PBPPbokSpceBscMngSelectActlist_ODT clone(){
		try{
			PBPPbokSpceBscMngSelectActlist_ODT object= (PBPPbokSpceBscMngSelectActlist_ODT)super.clone();
			if ( this.pBPJnngAvlActInf_DTO== null ) object.pBPJnngAvlActInf_DTO= null;
			else{
				List<PBPPbokSpceBscMngSelectActinf_ODT> clonedList= new ArrayList<>(this.pBPJnngAvlActInf_DTO.size());
				for( PBPPbokSpceBscMngSelectActinf_ODT item : pBPJnngAvlActInf_DTO ){
					clonedList.add((PBPPbokSpceBscMngSelectActinf_ODT)item.clone());
				}
				object.pBPJnngAvlActInf_DTO= clonedList;
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
		
		result= prime * result + ((this.pBPJnngAvlActInf_DTO==null)?0:this.pBPJnngAvlActInf_DTO.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final PBPPbokSpceBscMngSelectActlist_ODT other= (PBPPbokSpceBscMngSelectActlist_ODT)obj;
		{
			Object _pBPJnngAvlActInf_DTO= getpBPJnngAvlActInf_DTO();
			Object __pBPJnngAvlActInf_DTO= other.getpBPJnngAvlActInf_DTO();
			if ( _pBPJnngAvlActInf_DTO== null ) { if ( __pBPJnngAvlActInf_DTO!= null ) return false; }
			else if ( !_pBPJnngAvlActInf_DTO.equals(__pBPJnngAvlActInf_DTO) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(PBPPbokSpceBscMngSelectActlist_ODT.class.getName()).append(":\n");
		sb.append("\tpBPJnngAvlActInf_DTO: ");
		if ( pBPJnngAvlActInf_DTO== null ) sb.append("null");
		else{
			sb.append("array count : ");
			sb.append(pBPJnngAvlActInf_DTO.size());
			sb.append("(items)\n");
	
			int max= (10<pBPJnngAvlActInf_DTO.size())?10:pBPJnngAvlActInf_DTO.size();
	
			for ( int i= 0; i < max; ++i ){
				sb.append("\tpBPJnngAvlActInf_DTO[");
				sb.append(i);
				sb.append("] : ");
				sb.append(pBPJnngAvlActInf_DTO.get(i));
				sb.append("\n");
			}
	
			if ( max < pBPJnngAvlActInf_DTO.size() ){
				sb.append("\tpBPJnngAvlActInf_DTO[.] : ").append("more ").append((pBPJnngAvlActInf_DTO.size()-max)).append(" items").append("\n");
			}
		}
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		{/*pBPJnngAvlActInf_DTO*/
			int size=1;
			int count= pBPJnngAvlActInf_DTO == null ? 0 : pBPJnngAvlActInf_DTO.size();
			int min= size > count?count:size;
			PBPPbokSpceBscMngSelectActinf_ODT emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					PBPPbokSpceBscMngSelectActinf_ODT element= pBPJnngAvlActInf_DTO.get(i);
					if ( element != null && !(element instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= element==null?0:( (Predictable)element).predictMessageLength();
				}else{
					if ( emptyElement== null ) emptyElement= new com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceBscMngSelectActinf_ODT();
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
	
		list.add("pBPJnngAvlActInf_DTO");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("pBPJnngAvlActInf_DTO", get("pBPJnngAvlActInf_DTO"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -1232484981:/* pBPJnngAvlActInf_DTO */
			return getpBPJnngAvlActInf_DTO();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -1232484981:/* pBPJnngAvlActInf_DTO */
			setpBPJnngAvlActInf_DTO((List<PBPPbokSpceBscMngSelectActinf_ODT>)value);
			break;
		default:
			break;
		}
	}
	
}
