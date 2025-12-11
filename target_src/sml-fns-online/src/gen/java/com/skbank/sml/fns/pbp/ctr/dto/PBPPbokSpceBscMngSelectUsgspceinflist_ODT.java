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

/**
 * 
 */
@XmlType(propOrder={
	"spaceList"
}, name="PBPPbokSpceBscMngSelectUsgspceinflist_ODT")
@XmlRootElement(name="PBPPbokSpceBscMngSelectUsgspceinflist_ODT")
@BxmCategory(logicalName="사용.공간.정보.컨트롤러.출력.IO", description="") 
public class PBPPbokSpceBscMngSelectUsgspceinflist_ODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 168279606L;
	
	
	
	/**
	 * 사용.공간.정보.목록.컨트롤러.출력.IO
	 */
	@ApiModelProperty(
		name = "spaceList"
		, dataType = "[Lcom.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceBscMngSelectUsgspceinf_ODT;"
		)
	@XmlElement(name="item")
	@XmlElementWrapper()
	@JsonProperty("spaceList")
	@BxmOmm_Field(length=0, decimal=0, description="사용.공간.정보.목록.컨트롤러.출력.IO", align="left", fill="", arrayReference="1")
	private List<PBPPbokSpceBscMngSelectUsgspceinf_ODT> spaceList= new ArrayList<>();
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_spaceList= false;
	protected final boolean isSet_spaceList(){
		return this.isSet_spaceList;
	}
	private void setIsSet_spaceList(boolean value){
		this.isSet_spaceList= value;
	}
	/**
	 * 사용.공간.정보.목록.컨트롤러.출력.IO
	 */
	@XmlTransient
	public List<PBPPbokSpceBscMngSelectUsgspceinf_ODT> getSpaceList(){
		return spaceList;
	}
	
	/**
	 * 사용.공간.정보.목록.컨트롤러.출력.IO
	 * 
	 * @param spaceList 사용.공간.정보.목록.컨트롤러.출력.IO
	 */
	@JsonSetter("spaceList")
	public void setSpaceList(List<PBPPbokSpceBscMngSelectUsgspceinf_ODT> spaceList){
		this.spaceList= spaceList;
		this.setIsSet_spaceList(true);
	}
	
	public void setSpaceList(PBPPbokSpceBscMngSelectUsgspceinf_ODT... items){
		List<PBPPbokSpceBscMngSelectUsgspceinf_ODT> _items= new ArrayList<>();
		if ( items!= null && items.length> 0){
			for( PBPPbokSpceBscMngSelectUsgspceinf_ODT item: items ){
				_items.add(item);
			}
		}
		this.setSpaceList(_items);
	}
				
	@Override
	public PBPPbokSpceBscMngSelectUsgspceinflist_ODT clone(){
		try{
			PBPPbokSpceBscMngSelectUsgspceinflist_ODT object= (PBPPbokSpceBscMngSelectUsgspceinflist_ODT)super.clone();
			if ( this.spaceList== null ) object.spaceList= null;
			else{
				List<PBPPbokSpceBscMngSelectUsgspceinf_ODT> clonedList= new ArrayList<>(this.spaceList.size());
				for( PBPPbokSpceBscMngSelectUsgspceinf_ODT item : spaceList ){
					clonedList.add((PBPPbokSpceBscMngSelectUsgspceinf_ODT)item.clone());
				}
				object.spaceList= clonedList;
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
		
		result= prime * result + ((this.spaceList==null)?0:this.spaceList.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final PBPPbokSpceBscMngSelectUsgspceinflist_ODT other= (PBPPbokSpceBscMngSelectUsgspceinflist_ODT)obj;
		{
			Object _spaceList= getSpaceList();
			Object __spaceList= other.getSpaceList();
			if ( _spaceList== null ) { if ( __spaceList!= null ) return false; }
			else if ( !_spaceList.equals(__spaceList) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(PBPPbokSpceBscMngSelectUsgspceinflist_ODT.class.getName()).append(":\n");
		sb.append("\tspaceList: ");
		if ( spaceList== null ) sb.append("null");
		else{
			sb.append("array count : ");
			sb.append(spaceList.size());
			sb.append("(items)\n");
	
			int max= (10<spaceList.size())?10:spaceList.size();
	
			for ( int i= 0; i < max; ++i ){
				sb.append("\tspaceList[");
				sb.append(i);
				sb.append("] : ");
				sb.append(spaceList.get(i));
				sb.append("\n");
			}
	
			if ( max < spaceList.size() ){
				sb.append("\tspaceList[.] : ").append("more ").append((spaceList.size()-max)).append(" items").append("\n");
			}
		}
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		{/*spaceList*/
			int size=1;
			int count= spaceList == null ? 0 : spaceList.size();
			int min= size > count?count:size;
			PBPPbokSpceBscMngSelectUsgspceinf_ODT emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					PBPPbokSpceBscMngSelectUsgspceinf_ODT element= spaceList.get(i);
					if ( element != null && !(element instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= element==null?0:( (Predictable)element).predictMessageLength();
				}else{
					if ( emptyElement== null ) emptyElement= new com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceBscMngSelectUsgspceinf_ODT();
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
	
		list.add("spaceList");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("spaceList", get("spaceList"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -954129724:/* spaceList */
			return getSpaceList();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -954129724:/* spaceList */
			setSpaceList((List<PBPPbokSpceBscMngSelectUsgspceinf_ODT>)value);
			break;
		default:
			break;
		}
	}
	
}
