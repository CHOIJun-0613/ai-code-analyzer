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
	"gridRowCnt", "grid"
}, name="MNPMnyPinFncTrnSelectMnpIntPrts_DODT")
@XmlRootElement(name="MNPMnyPinFncTrnSelectMnpIntPrts_DODT")
@BxmCategory(logicalName="머니클립이자계산정보조회.컴포넌트.출력.IO", description="") 
public class MNPMnyPinFncTrnSelectMnpIntPrts_DODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -1006436550L;
	
	
	
	/**
	 * 그리드열건수
	 */
	@ApiModelProperty(
		name = "gridRowCnt"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("gridRowCnt")
	@BxmOmm_Field(length=6, decimal=0, description="그리드열건수", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=N"})
	private Integer gridRowCnt= 0;
	
	
	/**
	 * 그리드
	 */
	@ApiModelProperty(
		name = "grid"
		, dataType = "[Lcom.skbank.sml.fns.mnp.dto.MNPMnyPinFncTrnSelectMnpIntPrtsList_DODT;"
		)
	@XmlElement(name="item")
	@XmlElementWrapper()
	@JsonProperty("grid")
	@BxmOmm_Field(length=0, decimal=0, description="그리드", align="left", fill="", arrayReference="1")
	private List<MNPMnyPinFncTrnSelectMnpIntPrtsList_DODT> grid= new ArrayList<>();
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_gridRowCnt= false;
	protected final boolean isSet_gridRowCnt(){
		return this.isSet_gridRowCnt;
	}
	private void setIsSet_gridRowCnt(boolean value){
		this.isSet_gridRowCnt= value;
	}
	/**
	 * 그리드열건수
	 */
	@XmlTransient
	public Integer getGridRowCnt(){
		return this.gridRowCnt;
	}
	
	/**
	 * 그리드열건수
	 * 
	 * @param gridRowCnt 그리드열건수
	 */
	public void setGridRowCnt(Integer gridRowCnt){
		this.gridRowCnt= gridRowCnt;
		this.setIsSet_gridRowCnt(true);
	}
	
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
	 * 그리드
	 */
	@XmlTransient
	public List<MNPMnyPinFncTrnSelectMnpIntPrtsList_DODT> getGrid(){
		return grid;
	}
	
	/**
	 * 그리드
	 * 
	 * @param grid 그리드
	 */
	@JsonSetter("grid")
	public void setGrid(List<MNPMnyPinFncTrnSelectMnpIntPrtsList_DODT> grid){
		this.grid= grid;
		this.setIsSet_grid(true);
	}
	
	public void setGrid(MNPMnyPinFncTrnSelectMnpIntPrtsList_DODT... items){
		List<MNPMnyPinFncTrnSelectMnpIntPrtsList_DODT> _items= new ArrayList<>();
		if ( items!= null && items.length> 0){
			for( MNPMnyPinFncTrnSelectMnpIntPrtsList_DODT item: items ){
				_items.add(item);
			}
		}
		this.setGrid(_items);
	}
				
	@Override
	public MNPMnyPinFncTrnSelectMnpIntPrts_DODT clone(){
		try{
			MNPMnyPinFncTrnSelectMnpIntPrts_DODT object= (MNPMnyPinFncTrnSelectMnpIntPrts_DODT)super.clone();
			if ( this.grid== null ) object.grid= null;
			else{
				List<MNPMnyPinFncTrnSelectMnpIntPrtsList_DODT> clonedList= new ArrayList<>(this.grid.size());
				for( MNPMnyPinFncTrnSelectMnpIntPrtsList_DODT item : grid ){
					clonedList.add((MNPMnyPinFncTrnSelectMnpIntPrtsList_DODT)item.clone());
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
		
		result= prime * result + ((this.gridRowCnt==null)?0:this.gridRowCnt.hashCode());
		result= prime * result + ((this.grid==null)?0:this.grid.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MNPMnyPinFncTrnSelectMnpIntPrts_DODT other= (MNPMnyPinFncTrnSelectMnpIntPrts_DODT)obj;
		{
			Object _gridRowCnt= getGridRowCnt();
			Object __gridRowCnt= other.getGridRowCnt();
			if ( _gridRowCnt== null ) { if ( __gridRowCnt!= null ) return false; }
			else if ( !_gridRowCnt.equals(__gridRowCnt) ) return false;
		}
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
	
		sb.append("\n[").append(MNPMnyPinFncTrnSelectMnpIntPrts_DODT.class.getName()).append(":\n");
		sb.append("\tgridRowCnt: ");
		sb.append(gridRowCnt==null?"null":getGridRowCnt());
		sb.append("\n");
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
		
		messageLen+= 6; /* gridRowCnt */
		{/*grid*/
			int size=1;
			int count= grid == null ? 0 : grid.size();
			int min= size > count?count:size;
			MNPMnyPinFncTrnSelectMnpIntPrtsList_DODT emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					MNPMnyPinFncTrnSelectMnpIntPrtsList_DODT element= grid.get(i);
					if ( element != null && !(element instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= element==null?0:( (Predictable)element).predictMessageLength();
				}else{
					if ( emptyElement== null ) emptyElement= new com.skbank.sml.fns.mnp.dto.MNPMnyPinFncTrnSelectMnpIntPrtsList_DODT();
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
	
		list.add("gridRowCnt");
		list.add("grid");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("gridRowCnt", get("gridRowCnt"));
		map.put("grid", get("grid"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 663827477:/* gridRowCnt */
			return getGridRowCnt();
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
		case 663827477:/* gridRowCnt */
			setGridRowCnt((Integer)value);
			break;
		case 3181382:/* grid */
			setGrid((List<MNPMnyPinFncTrnSelectMnpIntPrtsList_DODT>)value);
			break;
		default:
			break;
		}
	}
	
}
