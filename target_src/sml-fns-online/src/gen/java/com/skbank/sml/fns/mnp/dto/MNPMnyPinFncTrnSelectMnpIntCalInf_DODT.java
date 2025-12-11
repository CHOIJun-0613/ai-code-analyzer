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
import java.math.BigDecimal;
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
	"gridCnt", "grid", "intSumAm"
}, name="MNPMnyPinFncTrnSelectMnpIntCalInf_DODT")
@XmlRootElement(name="MNPMnyPinFncTrnSelectMnpIntCalInf_DODT")
@BxmCategory(logicalName="머니클립이자계산정보조회.컴포넌트.출력.IO", description="") 
public class MNPMnyPinFncTrnSelectMnpIntCalInf_DODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -1374594808L;
	
	
	
	/**
	 * 그리드건수
	 */
	@ApiModelProperty(
		name = "gridCnt"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("gridCnt")
	@BxmOmm_Field(length=5, decimal=0, description="그리드건수", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=N"})
	private Integer gridCnt= 0;
	
	
	/**
	 * 그리드
	 */
	@ApiModelProperty(
		name = "grid"
		, dataType = "[Lcom.skbank.sml.fns.mnp.dto.MNPMnyPinFncTrnSelectMnpIntCalInfList_DODT;"
		)
	@XmlElement(name="item")
	@XmlElementWrapper()
	@JsonProperty("grid")
	@BxmOmm_Field(length=0, decimal=0, description="그리드", align="left", fill="", arrayReference="1")
	private List<MNPMnyPinFncTrnSelectMnpIntCalInfList_DODT> grid= new ArrayList<>();
	
	/**
	 * 이자합계금액
	 */
	@ApiModelProperty(
		name = "intSumAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("intSumAm")
	@BxmOmm_Field(length=19, decimal=3, description="이자합계금액", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal intSumAm= new BigDecimal("0");
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_gridCnt= false;
	protected final boolean isSet_gridCnt(){
		return this.isSet_gridCnt;
	}
	private void setIsSet_gridCnt(boolean value){
		this.isSet_gridCnt= value;
	}
	/**
	 * 그리드건수
	 */
	@XmlTransient
	public Integer getGridCnt(){
		return this.gridCnt;
	}
	
	/**
	 * 그리드건수
	 * 
	 * @param gridCnt 그리드건수
	 */
	public void setGridCnt(Integer gridCnt){
		this.gridCnt= gridCnt;
		this.setIsSet_gridCnt(true);
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
	public List<MNPMnyPinFncTrnSelectMnpIntCalInfList_DODT> getGrid(){
		return grid;
	}
	
	/**
	 * 그리드
	 * 
	 * @param grid 그리드
	 */
	@JsonSetter("grid")
	public void setGrid(List<MNPMnyPinFncTrnSelectMnpIntCalInfList_DODT> grid){
		this.grid= grid;
		this.setIsSet_grid(true);
	}
	
	public void setGrid(MNPMnyPinFncTrnSelectMnpIntCalInfList_DODT... items){
		List<MNPMnyPinFncTrnSelectMnpIntCalInfList_DODT> _items= new ArrayList<>();
		if ( items!= null && items.length> 0){
			for( MNPMnyPinFncTrnSelectMnpIntCalInfList_DODT item: items ){
				_items.add(item);
			}
		}
		this.setGrid(_items);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_intSumAm= false;
	protected final boolean isSet_intSumAm(){
		return this.isSet_intSumAm;
	}
	private void setIsSet_intSumAm(boolean value){
		this.isSet_intSumAm= value;
	}
	/**
	 * 이자합계금액
	 * BigDecimal - Double value setter
	 *
	 * @Param intSumAm 이자합계금액
	 */
	public void setIntSumAm(double intSumAm) {
		setIntSumAm(BigDecimal.valueOf(intSumAm));
	}
	/**
	 * 이자합계금액
	 * BigDecimal - Long value setter
	 *
	 * @Param intSumAm 이자합계금액
	 */
	public void setIntSumAm(long intSumAm) {
		setIntSumAm(BigDecimal.valueOf(intSumAm));
	}
	/**
	 * 이자합계금액
	 * BigDecimal - String value setter
	 *
	 * @Param intSumAm 이자합계금액
	 */
	public void setIntSumAm(String intSumAm) {
		setIntSumAm(new BigDecimal(intSumAm));
	}
	/**
	 * 이자합계금액
	 */
	@XmlTransient
	public BigDecimal getIntSumAm(){
		return this.intSumAm;
	}
	
	/**
	 * 이자합계금액
	 * 
	 * @param intSumAm 이자합계금액
	 */
	@JsonSetter("intSumAm")
	public void setIntSumAm(BigDecimal intSumAm){
		this.intSumAm= intSumAm;
		this.setIsSet_intSumAm(true);
	}
				
	@Override
	public MNPMnyPinFncTrnSelectMnpIntCalInf_DODT clone(){
		try{
			MNPMnyPinFncTrnSelectMnpIntCalInf_DODT object= (MNPMnyPinFncTrnSelectMnpIntCalInf_DODT)super.clone();
			if ( this.grid== null ) object.grid= null;
			else{
				List<MNPMnyPinFncTrnSelectMnpIntCalInfList_DODT> clonedList= new ArrayList<>(this.grid.size());
				for( MNPMnyPinFncTrnSelectMnpIntCalInfList_DODT item : grid ){
					clonedList.add((MNPMnyPinFncTrnSelectMnpIntCalInfList_DODT)item.clone());
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
		
		result= prime * result + ((this.gridCnt==null)?0:this.gridCnt.hashCode());
		result= prime * result + ((this.grid==null)?0:this.grid.hashCode());
		result= prime * result + ((this.intSumAm==null)?0:this.intSumAm.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MNPMnyPinFncTrnSelectMnpIntCalInf_DODT other= (MNPMnyPinFncTrnSelectMnpIntCalInf_DODT)obj;
		{
			Object _gridCnt= getGridCnt();
			Object __gridCnt= other.getGridCnt();
			if ( _gridCnt== null ) { if ( __gridCnt!= null ) return false; }
			else if ( !_gridCnt.equals(__gridCnt) ) return false;
		}
		{
			Object _grid= getGrid();
			Object __grid= other.getGrid();
			if ( _grid== null ) { if ( __grid!= null ) return false; }
			else if ( !_grid.equals(__grid) ) return false;
		}
		{
			Object _intSumAm= getIntSumAm();
			Object __intSumAm= other.getIntSumAm();
			if ( _intSumAm== null ) { if ( __intSumAm!= null ) return false; }
			else if ( !_intSumAm.equals(__intSumAm) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MNPMnyPinFncTrnSelectMnpIntCalInf_DODT.class.getName()).append(":\n");
		sb.append("\tgridCnt: ");
		sb.append(gridCnt==null?"null":getGridCnt());
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
		sb.append("\tintSumAm: ");
		sb.append(intSumAm==null?"null":getIntSumAm());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 5; /* gridCnt */
		{/*grid*/
			int size=1;
			int count= grid == null ? 0 : grid.size();
			int min= size > count?count:size;
			MNPMnyPinFncTrnSelectMnpIntCalInfList_DODT emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					MNPMnyPinFncTrnSelectMnpIntCalInfList_DODT element= grid.get(i);
					if ( element != null && !(element instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= element==null?0:( (Predictable)element).predictMessageLength();
				}else{
					if ( emptyElement== null ) emptyElement= new com.skbank.sml.fns.mnp.dto.MNPMnyPinFncTrnSelectMnpIntCalInfList_DODT();
					if ( !(emptyElement instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= ( (Predictable)emptyElement).predictMessageLength();
				}
			}
		}
		messageLen+= 19; /* intSumAm */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("gridCnt");
		list.add("grid");
		list.add("intSumAm");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("gridCnt", get("gridCnt"));
		map.put("grid", get("grid"));
		map.put("intSumAm", get("intSumAm"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 287338563:/* gridCnt */
			return getGridCnt();
		case 3181382:/* grid */
			return getGrid();
		case 553874728:/* intSumAm */
			return getIntSumAm();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 287338563:/* gridCnt */
			setGridCnt((Integer)value);
			break;
		case 3181382:/* grid */
			setGrid((List<MNPMnyPinFncTrnSelectMnpIntCalInfList_DODT>)value);
			break;
		case 553874728:/* intSumAm */
			if ( value instanceof String ){
				setIntSumAm((String)value);
			}
			else if ( value instanceof Double ){
				setIntSumAm((Double)value);
			}
			else if ( value instanceof Long ){
				setIntSumAm((Long)value);
			}
			else{
				setIntSumAm((BigDecimal)value);
			}
			break;
		default:
			break;
		}
	}
	
}
