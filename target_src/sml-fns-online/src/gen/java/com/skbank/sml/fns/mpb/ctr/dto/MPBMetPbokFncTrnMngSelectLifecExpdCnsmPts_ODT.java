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
	"metMngNo", "metNm", "gridCnt", "grid"
}, name="MPBMetPbokFncTrnMngSelectLifecExpdCnsmPts_ODT")
@XmlRootElement(name="MPBMetPbokFncTrnMngSelectLifecExpdCnsmPts_ODT")
@BxmCategory(logicalName="생활비.지출.소비.현황.컨트롤러.출력.IO", description="") 
public class MPBMetPbokFncTrnMngSelectLifecExpdCnsmPts_ODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -2066785949L;
	
	
	
	/**
	 * 모임관리번호 
	 */
	@ApiModelProperty(
		name = "metMngNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metMngNo")
	@BxmOmm_Field(length=9, decimal=0, description="모임관리번호 ", align="left", fill="")
	private String metMngNo= "";
	
	
	/**
	 * 모임명
	 */
	@ApiModelProperty(
		name = "metNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metNm")
	@BxmOmm_Field(length=100, decimal=0, description="모임명", align="left", fill="")
	private String metNm= "";
	
	
	/**
	 * 그리드건수
	 */
	@ApiModelProperty(
		name = "gridCnt"
		, dataType = "java.math.BigInteger"
		)
	@JsonProperty("gridCnt")
	@BxmOmm_Field(length=5, decimal=0, description="그리드건수", align="right", fill="0")
	private Integer gridCnt= 0;
	
	
	/**
	 * 생활비.지출.소비.목록.현황.컨트롤러.출력.IO
	 */
	@ApiModelProperty(
		name = "grid"
		, dataType = "[Lcom.skbank.sml.fns.mpb.ctr.dto.MPBLifecExpdCnsmListPts_ODT;"
		)
	@XmlElement(name="item")
	@XmlElementWrapper()
	@JsonProperty("grid")
	@BxmOmm_Field(length=0, decimal=0, description="생활비.지출.소비.목록.현황.컨트롤러.출력.IO", align="left", fill="", arrayReference="gridCnt")
	private List<MPBLifecExpdCnsmListPts_ODT> grid= new ArrayList<>();
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metMngNo= false;
	protected final boolean isSet_metMngNo(){
		return this.isSet_metMngNo;
	}
	private void setIsSet_metMngNo(boolean value){
		this.isSet_metMngNo= value;
	}
	/**
	 * 모임관리번호 
	 */
	@XmlTransient
	public String getMetMngNo(){
		return this.metMngNo;
	}
	
	/**
	 * 모임관리번호 
	 * 
	 * @param metMngNo 모임관리번호 
	 */
	public void setMetMngNo(String metMngNo){
		this.metMngNo= metMngNo;
		this.setIsSet_metMngNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metNm= false;
	protected final boolean isSet_metNm(){
		return this.isSet_metNm;
	}
	private void setIsSet_metNm(boolean value){
		this.isSet_metNm= value;
	}
	/**
	 * 모임명
	 */
	@XmlTransient
	public String getMetNm(){
		return this.metNm;
	}
	
	/**
	 * 모임명
	 * 
	 * @param metNm 모임명
	 */
	public void setMetNm(String metNm){
		this.metNm= metNm;
		this.setIsSet_metNm(true);
	}
	
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
	@XmlElement
	public Integer getGridCnt(){
		if ( isSet_gridCnt )	return gridCnt;
		else{
			if ( grid == null || grid.size() == 0 ) return 0;
			else return grid.size();
		}
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
	 * 생활비.지출.소비.목록.현황.컨트롤러.출력.IO
	 */
	@XmlTransient
	public List<MPBLifecExpdCnsmListPts_ODT> getGrid(){
		return grid;
	}
	
	/**
	 * 생활비.지출.소비.목록.현황.컨트롤러.출력.IO
	 * 
	 * @param grid 생활비.지출.소비.목록.현황.컨트롤러.출력.IO
	 */
	@JsonSetter("grid")
	public void setGrid(List<MPBLifecExpdCnsmListPts_ODT> grid){
		this.grid= grid;
		this.setIsSet_grid(true);
	}
	
	public void setGrid(MPBLifecExpdCnsmListPts_ODT... items){
		List<MPBLifecExpdCnsmListPts_ODT> _items= new ArrayList<>();
		if ( items!= null && items.length> 0){
			for( MPBLifecExpdCnsmListPts_ODT item: items ){
				_items.add(item);
			}
		}
		this.setGrid(_items);
	}
				
	@Override
	public MPBMetPbokFncTrnMngSelectLifecExpdCnsmPts_ODT clone(){
		try{
			MPBMetPbokFncTrnMngSelectLifecExpdCnsmPts_ODT object= (MPBMetPbokFncTrnMngSelectLifecExpdCnsmPts_ODT)super.clone();
			if ( this.grid== null ) object.grid= null;
			else{
				List<MPBLifecExpdCnsmListPts_ODT> clonedList= new ArrayList<>(this.grid.size());
				for( MPBLifecExpdCnsmListPts_ODT item : grid ){
					clonedList.add((MPBLifecExpdCnsmListPts_ODT)item.clone());
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
		
		result= prime * result + ((this.metMngNo==null)?0:this.metMngNo.hashCode());
		result= prime * result + ((this.metNm==null)?0:this.metNm.hashCode());
		result= prime * result + ((this.gridCnt==null)?0:this.gridCnt.hashCode());
		result= prime * result + ((this.grid==null)?0:this.grid.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MPBMetPbokFncTrnMngSelectLifecExpdCnsmPts_ODT other= (MPBMetPbokFncTrnMngSelectLifecExpdCnsmPts_ODT)obj;
		{
			Object _metMngNo= getMetMngNo();
			Object __metMngNo= other.getMetMngNo();
			if ( _metMngNo== null ) { if ( __metMngNo!= null ) return false; }
			else if ( !_metMngNo.equals(__metMngNo) ) return false;
		}
		{
			Object _metNm= getMetNm();
			Object __metNm= other.getMetNm();
			if ( _metNm== null ) { if ( __metNm!= null ) return false; }
			else if ( !_metNm.equals(__metNm) ) return false;
		}
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
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MPBMetPbokFncTrnMngSelectLifecExpdCnsmPts_ODT.class.getName()).append(":\n");
		sb.append("\tmetMngNo: ");
		sb.append(metMngNo==null?"null":getMetMngNo());
		sb.append("\n");
		sb.append("\tmetNm: ");
		sb.append(metNm==null?"null":getMetNm());
		sb.append("\n");
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
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 9; /* metMngNo */
		messageLen+= 100; /* metNm */
		messageLen+= 5; /* gridCnt */
		{/*grid*/
			int size=getGridCnt();
			int count= grid == null ? 0 : grid.size();
			int min= size > count?count:size;
			MPBLifecExpdCnsmListPts_ODT emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					MPBLifecExpdCnsmListPts_ODT element= grid.get(i);
					if ( element != null && !(element instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= element==null?0:( (Predictable)element).predictMessageLength();
				}else{
					if ( emptyElement== null ) emptyElement= new com.skbank.sml.fns.mpb.ctr.dto.MPBLifecExpdCnsmListPts_ODT();
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
	
		list.add("metMngNo");
		list.add("metNm");
		list.add("gridCnt");
		list.add("grid");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("metMngNo", get("metMngNo"));
		map.put("metNm", get("metNm"));
		map.put("gridCnt", get("gridCnt"));
		map.put("grid", get("grid"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -468172085:/* metMngNo */
			return getMetMngNo();
		case 103786683:/* metNm */
			return getMetNm();
		case 287338563:/* gridCnt */
			return getGridCnt();
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
		case -468172085:/* metMngNo */
			setMetMngNo((String)value);
			break;
		case 103786683:/* metNm */
			setMetNm((String)value);
			break;
		case 287338563:/* gridCnt */
			setGridCnt((Integer)value);
			break;
		case 3181382:/* grid */
			setGrid((List<MPBLifecExpdCnsmListPts_ODT>)value);
			break;
		default:
			break;
		}
	}
	
}
