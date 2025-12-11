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
import com.skbank.sml.fns.mnp.dto.MNPMnyPinBscMngSelectMnpChidAcno_DTO;
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
	"dpsInpAcno", "dpacBal", "gridCnt", "grid"
}, name="MNPMnyPinBscMngDeleteMnpWallLst_IDT")
@XmlRootElement(name="MNPMnyPinBscMngDeleteMnpWallLst_IDT")
@BxmCategory(logicalName="머니클립.지갑.목록.삭제.컨트롤러.입력.IO", description="") 
public class MNPMnyPinBscMngDeleteMnpWallLst_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -249683122L;
	
	
	
	/**
	 * 수신입력계좌번호
	 */
	@ApiModelProperty(
		name = "dpsInpAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dpsInpAcno")
	@BxmOmm_Field(length=15, decimal=0, description="수신입력계좌번호", align="left", fill="")
	private String dpsInpAcno= "";
	
	
	/**
	 * 수신계좌잔액
	 */
	@ApiModelProperty(
		name = "dpacBal"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("dpacBal")
	@BxmOmm_Field(length=18, decimal=0, description="수신계좌잔액", align="right", fill="")
	private BigDecimal dpacBal= new BigDecimal("0");
	
	
	/**
	 * 그리드건수
	 */
	@ApiModelProperty(
		name = "gridCnt"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("gridCnt")
	@BxmOmm_Field(length=2, decimal=0, description="그리드건수", align="right", fill="")
	private Integer gridCnt= 0;
	
	
	/**
	 * 머니클립.자.계좌.조회.컴포넌트.공통.출력.IO
	 */
	@ApiModelProperty(
		name = "grid"
		, dataType = "[Lcom.skbank.sml.fns.mnp.dto.MNPMnyPinBscMngSelectMnpChidAcno_DTO;"
		)
	@XmlElement(name="item")
	@XmlElementWrapper()
	@JsonProperty("grid")
	@BxmOmm_Field(length=0, decimal=0, description="머니클립.자.계좌.조회.컴포넌트.공통.출력.IO", align="left", fill="", arrayReference="1")
	private List<MNPMnyPinBscMngSelectMnpChidAcno_DTO> grid= new ArrayList<>();
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dpsInpAcno= false;
	protected final boolean isSet_dpsInpAcno(){
		return this.isSet_dpsInpAcno;
	}
	private void setIsSet_dpsInpAcno(boolean value){
		this.isSet_dpsInpAcno= value;
	}
	/**
	 * 수신입력계좌번호
	 */
	@XmlTransient
	public String getDpsInpAcno(){
		return this.dpsInpAcno;
	}
	
	/**
	 * 수신입력계좌번호
	 * 
	 * @param dpsInpAcno 수신입력계좌번호
	 */
	public void setDpsInpAcno(String dpsInpAcno){
		this.dpsInpAcno= dpsInpAcno;
		this.setIsSet_dpsInpAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dpacBal= false;
	protected final boolean isSet_dpacBal(){
		return this.isSet_dpacBal;
	}
	private void setIsSet_dpacBal(boolean value){
		this.isSet_dpacBal= value;
	}
	/**
	 * 수신계좌잔액
	 * BigDecimal - Double value setter
	 *
	 * @Param dpacBal 수신계좌잔액
	 */
	public void setDpacBal(double dpacBal) {
		setDpacBal(BigDecimal.valueOf(dpacBal));
	}
	/**
	 * 수신계좌잔액
	 * BigDecimal - Long value setter
	 *
	 * @Param dpacBal 수신계좌잔액
	 */
	public void setDpacBal(long dpacBal) {
		setDpacBal(BigDecimal.valueOf(dpacBal));
	}
	/**
	 * 수신계좌잔액
	 * BigDecimal - String value setter
	 *
	 * @Param dpacBal 수신계좌잔액
	 */
	public void setDpacBal(String dpacBal) {
		setDpacBal(new BigDecimal(dpacBal));
	}
	/**
	 * 수신계좌잔액
	 */
	@XmlTransient
	public BigDecimal getDpacBal(){
		return this.dpacBal;
	}
	
	/**
	 * 수신계좌잔액
	 * 
	 * @param dpacBal 수신계좌잔액
	 */
	@JsonSetter("dpacBal")
	public void setDpacBal(BigDecimal dpacBal){
		this.dpacBal= dpacBal;
		this.setIsSet_dpacBal(true);
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
	 * 머니클립.자.계좌.조회.컴포넌트.공통.출력.IO
	 */
	@XmlTransient
	public List<MNPMnyPinBscMngSelectMnpChidAcno_DTO> getGrid(){
		return grid;
	}
	
	/**
	 * 머니클립.자.계좌.조회.컴포넌트.공통.출력.IO
	 * 
	 * @param grid 머니클립.자.계좌.조회.컴포넌트.공통.출력.IO
	 */
	@JsonSetter("grid")
	public void setGrid(List<MNPMnyPinBscMngSelectMnpChidAcno_DTO> grid){
		this.grid= grid;
		this.setIsSet_grid(true);
	}
	
	public void setGrid(MNPMnyPinBscMngSelectMnpChidAcno_DTO... items){
		List<MNPMnyPinBscMngSelectMnpChidAcno_DTO> _items= new ArrayList<>();
		if ( items!= null && items.length> 0){
			for( MNPMnyPinBscMngSelectMnpChidAcno_DTO item: items ){
				_items.add(item);
			}
		}
		this.setGrid(_items);
	}
				
	@Override
	public MNPMnyPinBscMngDeleteMnpWallLst_IDT clone(){
		try{
			MNPMnyPinBscMngDeleteMnpWallLst_IDT object= (MNPMnyPinBscMngDeleteMnpWallLst_IDT)super.clone();
			if ( this.grid== null ) object.grid= null;
			else{
				List<MNPMnyPinBscMngSelectMnpChidAcno_DTO> clonedList= new ArrayList<>(this.grid.size());
				for( MNPMnyPinBscMngSelectMnpChidAcno_DTO item : grid ){
					clonedList.add((MNPMnyPinBscMngSelectMnpChidAcno_DTO)item.clone());
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
		
		result= prime * result + ((this.dpsInpAcno==null)?0:this.dpsInpAcno.hashCode());
		result= prime * result + ((this.dpacBal==null)?0:this.dpacBal.hashCode());
		result= prime * result + ((this.gridCnt==null)?0:this.gridCnt.hashCode());
		result= prime * result + ((this.grid==null)?0:this.grid.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MNPMnyPinBscMngDeleteMnpWallLst_IDT other= (MNPMnyPinBscMngDeleteMnpWallLst_IDT)obj;
		{
			Object _dpsInpAcno= getDpsInpAcno();
			Object __dpsInpAcno= other.getDpsInpAcno();
			if ( _dpsInpAcno== null ) { if ( __dpsInpAcno!= null ) return false; }
			else if ( !_dpsInpAcno.equals(__dpsInpAcno) ) return false;
		}
		{
			Object _dpacBal= getDpacBal();
			Object __dpacBal= other.getDpacBal();
			if ( _dpacBal== null ) { if ( __dpacBal!= null ) return false; }
			else if ( !_dpacBal.equals(__dpacBal) ) return false;
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
	
		sb.append("\n[").append(MNPMnyPinBscMngDeleteMnpWallLst_IDT.class.getName()).append(":\n");
		sb.append("\tdpsInpAcno: ");
		sb.append(dpsInpAcno==null?"null":getDpsInpAcno());
		sb.append("\n");
		sb.append("\tdpacBal: ");
		sb.append(dpacBal==null?"null":getDpacBal());
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
		
		messageLen+= 15; /* dpsInpAcno */
		messageLen+= 18; /* dpacBal */
		messageLen+= 2; /* gridCnt */
		{/*grid*/
			int size=1;
			int count= grid == null ? 0 : grid.size();
			int min= size > count?count:size;
			MNPMnyPinBscMngSelectMnpChidAcno_DTO emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					MNPMnyPinBscMngSelectMnpChidAcno_DTO element= grid.get(i);
					if ( element != null && !(element instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= element==null?0:( (Predictable)element).predictMessageLength();
				}else{
					if ( emptyElement== null ) emptyElement= new com.skbank.sml.fns.mnp.dto.MNPMnyPinBscMngSelectMnpChidAcno_DTO();
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
	
		list.add("dpsInpAcno");
		list.add("dpacBal");
		list.add("gridCnt");
		list.add("grid");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("dpsInpAcno", get("dpsInpAcno"));
		map.put("dpacBal", get("dpacBal"));
		map.put("gridCnt", get("gridCnt"));
		map.put("grid", get("grid"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -865257337:/* dpsInpAcno */
			return getDpsInpAcno();
		case 1855117183:/* dpacBal */
			return getDpacBal();
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
		case -865257337:/* dpsInpAcno */
			setDpsInpAcno((String)value);
			break;
		case 1855117183:/* dpacBal */
			if ( value instanceof String ){
				setDpacBal((String)value);
			}
			else if ( value instanceof Double ){
				setDpacBal((Double)value);
			}
			else if ( value instanceof Long ){
				setDpacBal((Long)value);
			}
			else{
				setDpacBal((BigDecimal)value);
			}
			break;
		case 287338563:/* gridCnt */
			setGridCnt((Integer)value);
			break;
		case 3181382:/* grid */
			setGrid((List<MNPMnyPinBscMngSelectMnpChidAcno_DTO>)value);
			break;
		default:
			break;
		}
	}
	
}
