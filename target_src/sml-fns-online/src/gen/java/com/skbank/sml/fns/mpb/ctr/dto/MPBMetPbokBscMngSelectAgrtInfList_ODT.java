/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.mpb.ctr.dto;

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
	"grid"
}, name="MPBMetPbokBscMngSelectAgrtInfList_ODT")
@XmlRootElement(name="MPBMetPbokBscMngSelectAgrtInfList_ODT")
@BxmCategory(logicalName="약관.정보.컨트롤러.출력.IO", description="") 
public class MPBMetPbokBscMngSelectAgrtInfList_ODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -957279359L;
	
	
	
	/**
	 * 약관.정보.목록.컨트롤러.출력.IO
	 */
	@ApiModelProperty(
		name = "grid"
		, dataType = "[Lcom.skbank.sml.fns.mpb.ctr.dto.MPBAgrtInfList_ODT;"
		)
	@XmlElement(name="item")
	@XmlElementWrapper()
	@JsonProperty("grid")
	@BxmOmm_Field(length=0, decimal=0, description="약관.정보.목록.컨트롤러.출력.IO", align="left", fill="", arrayReference="1")
	private List<MPBAgrtInfList_ODT> grid= new ArrayList<>();
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_grid= false;
	protected final boolean isSet_grid(){
		return this.isSet_grid;
	}
	private void setIsSet_grid(boolean value){
		this.isSet_grid= value;
	}
	/**
	 * 약관.정보.목록.컨트롤러.출력.IO
	 */
	@XmlTransient
	public List<MPBAgrtInfList_ODT> getGrid(){
		return grid;
	}
	
	/**
	 * 약관.정보.목록.컨트롤러.출력.IO
	 * 
	 * @param grid 약관.정보.목록.컨트롤러.출력.IO
	 */
	@JsonSetter("grid")
	public void setGrid(List<MPBAgrtInfList_ODT> grid){
		this.grid= grid;
		this.setIsSet_grid(true);
	}
	
	public void setGrid(MPBAgrtInfList_ODT... items){
		List<MPBAgrtInfList_ODT> _items= new ArrayList<>();
		if ( items!= null && items.length> 0){
			for( MPBAgrtInfList_ODT item: items ){
				_items.add(item);
			}
		}
		this.setGrid(_items);
	}
				
	@Override
	public MPBMetPbokBscMngSelectAgrtInfList_ODT clone(){
		try{
			MPBMetPbokBscMngSelectAgrtInfList_ODT object= (MPBMetPbokBscMngSelectAgrtInfList_ODT)super.clone();
			if ( this.grid== null ) object.grid= null;
			else{
				List<MPBAgrtInfList_ODT> clonedList= new ArrayList<>(this.grid.size());
				for( MPBAgrtInfList_ODT item : grid ){
					clonedList.add((MPBAgrtInfList_ODT)item.clone());
				}
				object.grid= clonedList;
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
		
		result= prime * result + ((this.grid==null)?0:this.grid.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MPBMetPbokBscMngSelectAgrtInfList_ODT other= (MPBMetPbokBscMngSelectAgrtInfList_ODT)obj;
		{
			Object _grid= getGrid();
			Object __grid= other.getGrid();
			if ( _grid== null ) { if ( __grid!= null ) return false; }
			else if ( !_grid.equals(__grid) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MPBMetPbokBscMngSelectAgrtInfList_ODT.class.getName()).append(":\n");
		sb.append("\tgrid: ");
		if ( grid== null ) sb.append("null");
		else{
			sb.append("array count : ");
			sb.append(grid.size());
			sb.append("(items)\n");
	
			int max= (10<grid.size())?10:grid.size();
	
			for ( int i= 0; i < max; ++i ){
				sb.append("\tgrid[");
				sb.append(i);
				sb.append("] : ");
				sb.append(grid.get(i));
				sb.append("\n");
			}
	
			if ( max < grid.size() ){
				sb.append("\tgrid[.] : ").append("more ").append((grid.size()-max)).append(" items").append("\n");
			}
		}
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		{/*grid*/
			int size=1;
			int count= grid == null ? 0 : grid.size();
			int min= size > count?count:size;
			MPBAgrtInfList_ODT emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					MPBAgrtInfList_ODT element= grid.get(i);
					if ( element != null && !(element instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= element==null?0:( (Predictable)element).predictMessageLength();
				}else{
					if ( emptyElement== null ) emptyElement= new com.skbank.sml.fns.mpb.ctr.dto.MPBAgrtInfList_ODT();
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
	
		list.add("grid");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("grid", get("grid"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 3181382:/* grid */
			return getGrid();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 3181382:/* grid */
			setGrid((List<MPBAgrtInfList_ODT>)value);
			break;
		default:
			break;
		}
	}
	
}
