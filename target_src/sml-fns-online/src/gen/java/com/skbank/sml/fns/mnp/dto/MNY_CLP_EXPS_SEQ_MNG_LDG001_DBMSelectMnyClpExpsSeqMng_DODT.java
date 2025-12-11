/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.mnp.dto;

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
	"mnpBscInfGrid"
}, name="MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMSelectMnyClpExpsSeqMng_DODT")
@XmlRootElement(name="MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMSelectMnyClpExpsSeqMng_DODT")
@BxmCategory(logicalName="머니클립노출순서기본조회.DBM.출력.IO", description="") 
public class MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMSelectMnyClpExpsSeqMng_DODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -307502821L;
	
	
	
	/**
	 * 머니클립기본정보
	 */
	@ApiModelProperty(
		name = "mnpBscInfGrid"
		, dataType = "[Lcom.skbank.sml.fns.mnp.dto.MNPBscInf_DTO;"
		)
	@XmlElement(name="item")
	@XmlElementWrapper()
	@JsonProperty("mnpBscInfGrid")
	@BxmOmm_Field(length=0, decimal=0, description="머니클립기본정보", align="left", fill="", arrayReference="1")
	private List<MNPBscInf_DTO> mnpBscInfGrid= new ArrayList<>();
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mnpBscInfGrid= false;
	protected final boolean isSet_mnpBscInfGrid(){
		return this.isSet_mnpBscInfGrid;
	}
	private void setIsSet_mnpBscInfGrid(boolean value){
		this.isSet_mnpBscInfGrid= value;
	}
	/**
	 * 머니클립기본정보
	 */
	@XmlTransient
	public List<MNPBscInf_DTO> getMnpBscInfGrid(){
		return mnpBscInfGrid;
	}
	
	/**
	 * 머니클립기본정보
	 * 
	 * @param mnpBscInfGrid 머니클립기본정보
	 */
	@JsonSetter("mnpBscInfGrid")
	public void setMnpBscInfGrid(List<MNPBscInf_DTO> mnpBscInfGrid){
		this.mnpBscInfGrid= mnpBscInfGrid;
		this.setIsSet_mnpBscInfGrid(true);
	}
	
	public void setMnpBscInfGrid(MNPBscInf_DTO... items){
		List<MNPBscInf_DTO> _items= new ArrayList<>();
		if ( items!= null && items.length> 0){
			for( MNPBscInf_DTO item: items ){
				_items.add(item);
			}
		}
		this.setMnpBscInfGrid(_items);
	}
				
	@Override
	public MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMSelectMnyClpExpsSeqMng_DODT clone(){
		try{
			MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMSelectMnyClpExpsSeqMng_DODT object= (MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMSelectMnyClpExpsSeqMng_DODT)super.clone();
			if ( this.mnpBscInfGrid== null ) object.mnpBscInfGrid= null;
			else{
				List<MNPBscInf_DTO> clonedList= new ArrayList<>(this.mnpBscInfGrid.size());
				for( MNPBscInf_DTO item : mnpBscInfGrid ){
					clonedList.add((MNPBscInf_DTO)item.clone());
				}
				object.mnpBscInfGrid= clonedList;
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
		
		result= prime * result + ((this.mnpBscInfGrid==null)?0:this.mnpBscInfGrid.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMSelectMnyClpExpsSeqMng_DODT other= (MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMSelectMnyClpExpsSeqMng_DODT)obj;
		{
			Object _mnpBscInfGrid= getMnpBscInfGrid();
			Object __mnpBscInfGrid= other.getMnpBscInfGrid();
			if ( _mnpBscInfGrid== null ) { if ( __mnpBscInfGrid!= null ) return false; }
			else if ( !_mnpBscInfGrid.equals(__mnpBscInfGrid) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMSelectMnyClpExpsSeqMng_DODT.class.getName()).append(":\n");
		sb.append("\tmnpBscInfGrid: ");
		if ( mnpBscInfGrid== null ) sb.append("null");
		else{
			sb.append("array count : ");
			sb.append(mnpBscInfGrid.size());
			sb.append("(items)\n");
	
			int max= (10<mnpBscInfGrid.size())?10:mnpBscInfGrid.size();
	
			for ( int i= 0; i < max; ++i ){
				sb.append("\tmnpBscInfGrid[");
				sb.append(i);
				sb.append("] : ");
				sb.append(mnpBscInfGrid.get(i));
				sb.append("\n");
			}
	
			if ( max < mnpBscInfGrid.size() ){
				sb.append("\tmnpBscInfGrid[.] : ").append("more ").append((mnpBscInfGrid.size()-max)).append(" items").append("\n");
			}
		}
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		{/*mnpBscInfGrid*/
			int size=1;
			int count= mnpBscInfGrid == null ? 0 : mnpBscInfGrid.size();
			int min= size > count?count:size;
			MNPBscInf_DTO emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					MNPBscInf_DTO element= mnpBscInfGrid.get(i);
					if ( element != null && !(element instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= element==null?0:( (Predictable)element).predictMessageLength();
				}else{
					if ( emptyElement== null ) emptyElement= new com.skbank.sml.fns.mnp.dto.MNPBscInf_DTO();
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
	
		list.add("mnpBscInfGrid");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("mnpBscInfGrid", get("mnpBscInfGrid"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -1727414140:/* mnpBscInfGrid */
			return getMnpBscInfGrid();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -1727414140:/* mnpBscInfGrid */
			setMnpBscInfGrid((List<MNPBscInf_DTO>)value);
			break;
		default:
			break;
		}
	}
	
}
