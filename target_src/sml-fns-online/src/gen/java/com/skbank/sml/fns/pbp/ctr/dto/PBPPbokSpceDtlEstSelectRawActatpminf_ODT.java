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
	"atpmList"
}, name="PBPPbokSpceDtlEstSelectRawactatpminf_ODT")
@XmlRootElement(name="PBPPbokSpceDtlEstSelectRawactatpminf_ODT")
@BxmCategory(logicalName="입출금계좌.자동납부.정보.조회.컨트롤러.출력.IO", description="") 
public class PBPPbokSpceDtlEstSelectRawActatpminf_ODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 383529074L;
	
	
	
	/**
	 * 입출금계좌.자동납부.정보.목록.조회.컨트롤러.출력.IO
	 */
	@ApiModelProperty(
		name = "atpmList"
		, dataType = "[Lcom.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlEstSelectRawactatpminflist_ODT;"
		)
	@XmlElement(name="item")
	@XmlElementWrapper()
	@JsonProperty("atpmList")
	@BxmOmm_Field(length=0, decimal=0, description="입출금계좌.자동납부.정보.목록.조회.컨트롤러.출력.IO", align="left", fill="", arrayReference="1")
	private List<PBPPbokSpceDtlEstSelectRawactatpminflist_ODT> atpmList= new ArrayList<>();
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atpmList= false;
	protected final boolean isSet_atpmList(){
		return this.isSet_atpmList;
	}
	private void setIsSet_atpmList(boolean value){
		this.isSet_atpmList= value;
	}
	/**
	 * 입출금계좌.자동납부.정보.목록.조회.컨트롤러.출력.IO
	 */
	@XmlTransient
	public List<PBPPbokSpceDtlEstSelectRawactatpminflist_ODT> getAtpmList(){
		return atpmList;
	}
	
	/**
	 * 입출금계좌.자동납부.정보.목록.조회.컨트롤러.출력.IO
	 * 
	 * @param atpmList 입출금계좌.자동납부.정보.목록.조회.컨트롤러.출력.IO
	 */
	@JsonSetter("atpmList")
	public void setAtpmList(List<PBPPbokSpceDtlEstSelectRawactatpminflist_ODT> atpmList){
		this.atpmList= atpmList;
		this.setIsSet_atpmList(true);
	}
	
	public void setAtpmList(PBPPbokSpceDtlEstSelectRawactatpminflist_ODT... items){
		List<PBPPbokSpceDtlEstSelectRawactatpminflist_ODT> _items= new ArrayList<>();
		if ( items!= null && items.length> 0){
			for( PBPPbokSpceDtlEstSelectRawactatpminflist_ODT item: items ){
				_items.add(item);
			}
		}
		this.setAtpmList(_items);
	}
				
	@Override
	public PBPPbokSpceDtlEstSelectRawActatpminf_ODT clone(){
		try{
			PBPPbokSpceDtlEstSelectRawActatpminf_ODT object= (PBPPbokSpceDtlEstSelectRawActatpminf_ODT)super.clone();
			if ( this.atpmList== null ) object.atpmList= null;
			else{
				List<PBPPbokSpceDtlEstSelectRawactatpminflist_ODT> clonedList= new ArrayList<>(this.atpmList.size());
				for( PBPPbokSpceDtlEstSelectRawactatpminflist_ODT item : atpmList ){
					clonedList.add((PBPPbokSpceDtlEstSelectRawactatpminflist_ODT)item.clone());
				}
				object.atpmList= clonedList;
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
		
		result= prime * result + ((this.atpmList==null)?0:this.atpmList.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final PBPPbokSpceDtlEstSelectRawActatpminf_ODT other= (PBPPbokSpceDtlEstSelectRawActatpminf_ODT)obj;
		{
			Object _atpmList= getAtpmList();
			Object __atpmList= other.getAtpmList();
			if ( _atpmList== null ) { if ( __atpmList!= null ) return false; }
			else if ( !_atpmList.equals(__atpmList) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(PBPPbokSpceDtlEstSelectRawActatpminf_ODT.class.getName()).append(":\n");
		sb.append("\tatpmList: ");
		if ( atpmList== null ) sb.append("null");
		else{
			sb.append("array count : ");
			sb.append(atpmList.size());
			sb.append("(items)\n");
	
			int max= (10<atpmList.size())?10:atpmList.size();
	
			for ( int i= 0; i < max; ++i ){
				sb.append("\tatpmList[");
				sb.append(i);
				sb.append("] : ");
				sb.append(atpmList.get(i));
				sb.append("\n");
			}
	
			if ( max < atpmList.size() ){
				sb.append("\tatpmList[.] : ").append("more ").append((atpmList.size()-max)).append(" items").append("\n");
			}
		}
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		{/*atpmList*/
			int size=1;
			int count= atpmList == null ? 0 : atpmList.size();
			int min= size > count?count:size;
			PBPPbokSpceDtlEstSelectRawactatpminflist_ODT emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					PBPPbokSpceDtlEstSelectRawactatpminflist_ODT element= atpmList.get(i);
					if ( element != null && !(element instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= element==null?0:( (Predictable)element).predictMessageLength();
				}else{
					if ( emptyElement== null ) emptyElement= new com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlEstSelectRawactatpminflist_ODT();
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
	
		list.add("atpmList");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("atpmList", get("atpmList"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 434619950:/* atpmList */
			return getAtpmList();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 434619950:/* atpmList */
			setAtpmList((List<PBPPbokSpceDtlEstSelectRawactatpminflist_ODT>)value);
			break;
		default:
			break;
		}
	}
	
}
