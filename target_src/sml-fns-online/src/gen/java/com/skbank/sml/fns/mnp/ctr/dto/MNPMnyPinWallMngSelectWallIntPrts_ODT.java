/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.mnp.ctr.dto;

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
	"gridRowCnt", "grid", "trnY", "totPayIntAm"
}, name="MNPMnyPinWallMngSelectWallIntPrts_ODT")
@XmlRootElement(name="MNPMnyPinWallMngSelectWallIntPrts_ODT")
@BxmCategory(logicalName="머니클립지갑이자내역조회.출력IO", description="") 
public class MNPMnyPinWallMngSelectWallIntPrts_ODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 1402875983L;
	
	
	
	/**
	 * 그리드열건수
	 */
	@ApiModelProperty(
		name = "gridRowCnt"
		, dataType = "java.math.BigInteger"
		)
	@JsonProperty("gridRowCnt")
	@BxmOmm_Field(length=6, decimal=0, description="그리드열건수", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=N"})
	private Integer gridRowCnt= 0;
	
	
	/**
	 * 그리드
	 */
	@ApiModelProperty(
		name = "grid"
		, dataType = "[Lcom.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinWallMngSelectWallIntPrtsList_ODT;"
		)
	@XmlElement(name="item")
	@XmlElementWrapper()
	@JsonProperty("grid")
	@BxmOmm_Field(length=0, decimal=0, description="그리드", align="left", fill="", arrayReference="gridRowCnt")
	private List<MNPMnyPinWallMngSelectWallIntPrtsList_ODT> grid= new ArrayList<>();
	
	/**
	 * 거래년
	 */
	@ApiModelProperty(
		name = "trnY"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("trnY")
	@BxmOmm_Field(length=4, decimal=0, description="거래년", align="left", fill="")
	private String trnY= "";
	
	
	/**
	 * 총지급이자금액
	 */
	@ApiModelProperty(
		name = "totPayIntAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("totPayIntAm")
	@BxmOmm_Field(length=19, decimal=3, description="총지급이자금액", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=C","EIMS_DATA_TYPE=D"})
	private BigDecimal totPayIntAm= new BigDecimal("0");
	
	
	
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
	@XmlElement
	public Integer getGridRowCnt(){
		if ( isSet_gridRowCnt )	return gridRowCnt;
		else{
			if ( grid == null || grid.size() == 0 ) return 0;
			else return grid.size();
		}
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
	public List<MNPMnyPinWallMngSelectWallIntPrtsList_ODT> getGrid(){
		return grid;
	}
	
	/**
	 * 그리드
	 * 
	 * @param grid 그리드
	 */
	@JsonSetter("grid")
	public void setGrid(List<MNPMnyPinWallMngSelectWallIntPrtsList_ODT> grid){
		this.grid= grid;
		this.setIsSet_grid(true);
	}
	
	public void setGrid(MNPMnyPinWallMngSelectWallIntPrtsList_ODT... items){
		List<MNPMnyPinWallMngSelectWallIntPrtsList_ODT> _items= new ArrayList<>();
		if ( items!= null && items.length> 0){
			for( MNPMnyPinWallMngSelectWallIntPrtsList_ODT item: items ){
				_items.add(item);
			}
		}
		this.setGrid(_items);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_trnY= false;
	protected final boolean isSet_trnY(){
		return this.isSet_trnY;
	}
	private void setIsSet_trnY(boolean value){
		this.isSet_trnY= value;
	}
	/**
	 * 거래년
	 */
	@XmlTransient
	public String getTrnY(){
		return this.trnY;
	}
	
	/**
	 * 거래년
	 * 
	 * @param trnY 거래년
	 */
	public void setTrnY(String trnY){
		this.trnY= trnY;
		this.setIsSet_trnY(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_totPayIntAm= false;
	protected final boolean isSet_totPayIntAm(){
		return this.isSet_totPayIntAm;
	}
	private void setIsSet_totPayIntAm(boolean value){
		this.isSet_totPayIntAm= value;
	}
	/**
	 * 총지급이자금액
	 * BigDecimal - Double value setter
	 *
	 * @Param totPayIntAm 총지급이자금액
	 */
	public void setTotPayIntAm(double totPayIntAm) {
		setTotPayIntAm(BigDecimal.valueOf(totPayIntAm));
	}
	/**
	 * 총지급이자금액
	 * BigDecimal - Long value setter
	 *
	 * @Param totPayIntAm 총지급이자금액
	 */
	public void setTotPayIntAm(long totPayIntAm) {
		setTotPayIntAm(BigDecimal.valueOf(totPayIntAm));
	}
	/**
	 * 총지급이자금액
	 * BigDecimal - String value setter
	 *
	 * @Param totPayIntAm 총지급이자금액
	 */
	public void setTotPayIntAm(String totPayIntAm) {
		setTotPayIntAm(new BigDecimal(totPayIntAm));
	}
	/**
	 * 총지급이자금액
	 */
	@XmlTransient
	public BigDecimal getTotPayIntAm(){
		return this.totPayIntAm;
	}
	
	/**
	 * 총지급이자금액
	 * 
	 * @param totPayIntAm 총지급이자금액
	 */
	@JsonSetter("totPayIntAm")
	public void setTotPayIntAm(BigDecimal totPayIntAm){
		this.totPayIntAm= totPayIntAm;
		this.setIsSet_totPayIntAm(true);
	}
				
	@Override
	public MNPMnyPinWallMngSelectWallIntPrts_ODT clone(){
		try{
			MNPMnyPinWallMngSelectWallIntPrts_ODT object= (MNPMnyPinWallMngSelectWallIntPrts_ODT)super.clone();
			if ( this.grid== null ) object.grid= null;
			else{
				List<MNPMnyPinWallMngSelectWallIntPrtsList_ODT> clonedList= new ArrayList<>(this.grid.size());
				for( MNPMnyPinWallMngSelectWallIntPrtsList_ODT item : grid ){
					clonedList.add((MNPMnyPinWallMngSelectWallIntPrtsList_ODT)item.clone());
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
		result= prime * result + ((this.trnY==null)?0:this.trnY.hashCode());
		result= prime * result + ((this.totPayIntAm==null)?0:this.totPayIntAm.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MNPMnyPinWallMngSelectWallIntPrts_ODT other= (MNPMnyPinWallMngSelectWallIntPrts_ODT)obj;
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
		{
			Object _trnY= getTrnY();
			Object __trnY= other.getTrnY();
			if ( _trnY== null ) { if ( __trnY!= null ) return false; }
			else if ( !_trnY.equals(__trnY) ) return false;
		}
		{
			Object _totPayIntAm= getTotPayIntAm();
			Object __totPayIntAm= other.getTotPayIntAm();
			if ( _totPayIntAm== null ) { if ( __totPayIntAm!= null ) return false; }
			else if ( !_totPayIntAm.equals(__totPayIntAm) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MNPMnyPinWallMngSelectWallIntPrts_ODT.class.getName()).append(":\n");
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
		sb.append("\ttrnY: ");
		sb.append(trnY==null?"null":getTrnY());
		sb.append("\n");
		sb.append("\ttotPayIntAm: ");
		sb.append(totPayIntAm==null?"null":getTotPayIntAm());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 6; /* gridRowCnt */
		{/*grid*/
			int size=getGridRowCnt();
			int count= grid == null ? 0 : grid.size();
			int min= size > count?count:size;
			MNPMnyPinWallMngSelectWallIntPrtsList_ODT emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					MNPMnyPinWallMngSelectWallIntPrtsList_ODT element= grid.get(i);
					if ( element != null && !(element instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= element==null?0:( (Predictable)element).predictMessageLength();
				}else{
					if ( emptyElement== null ) emptyElement= new com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinWallMngSelectWallIntPrtsList_ODT();
					if ( !(emptyElement instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= ( (Predictable)emptyElement).predictMessageLength();
				}
			}
		}
		messageLen+= 4; /* trnY */
		messageLen+= 19; /* totPayIntAm */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("gridRowCnt");
		list.add("grid");
		list.add("trnY");
		list.add("totPayIntAm");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("gridRowCnt", get("gridRowCnt"));
		map.put("grid", get("grid"));
		map.put("trnY", get("trnY"));
		map.put("totPayIntAm", get("totPayIntAm"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 663827477:/* gridRowCnt */
			return getGridRowCnt();
		case 3181382:/* grid */
			return getGrid();
		case 3568809:/* trnY */
			return getTrnY();
		case -423058132:/* totPayIntAm */
			return getTotPayIntAm();
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
			setGrid((List<MNPMnyPinWallMngSelectWallIntPrtsList_ODT>)value);
			break;
		case 3568809:/* trnY */
			setTrnY((String)value);
			break;
		case -423058132:/* totPayIntAm */
			if ( value instanceof String ){
				setTotPayIntAm((String)value);
			}
			else if ( value instanceof Double ){
				setTotPayIntAm((Double)value);
			}
			else if ( value instanceof Long ){
				setTotPayIntAm((Long)value);
			}
			else{
				setTotPayIntAm((BigDecimal)value);
			}
			break;
		default:
			break;
		}
	}
	
}
