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
	"gridRowCnt", "grid", "trnYm", "totPayIntAm", "totIntIctx", "intCalStaDt", "intCalEndDt"
}, name="MNPMnyPinWallMngSelectWallIntDtlPrts_ODT")
@XmlRootElement(name="MNPMnyPinWallMngSelectWallIntDtlPrts_ODT")
@BxmCategory(logicalName="머니클립지갑이자내역조회.출력IO", description="") 
public class MNPMnyPinWallMngSelectWallIntDtlPrts_ODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -61090129L;
	
	
	
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
		, dataType = "[Lcom.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinWallMngSelectWallIntDtlPrtsList_ODT;"
		)
	@XmlElement(name="item")
	@XmlElementWrapper()
	@JsonProperty("grid")
	@BxmOmm_Field(length=0, decimal=0, description="그리드", align="left", fill="", arrayReference="gridRowCnt")
	private List<MNPMnyPinWallMngSelectWallIntDtlPrtsList_ODT> grid= new ArrayList<>();
	
	/**
	 * 거래년월
	 */
	@ApiModelProperty(
		name = "trnYm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("trnYm")
	@BxmOmm_Field(length=6, decimal=0, description="거래년월", align="left", fill="")
	private String trnYm= "";
	
	
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
	
	
	/**
	 * 총이자소득세
	 */
	@ApiModelProperty(
		name = "totIntIctx"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("totIntIctx")
	@BxmOmm_Field(length=19, decimal=3, description="총이자소득세", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=C","EIMS_DATA_TYPE=D"})
	private BigDecimal totIntIctx= new BigDecimal("0");
	
	
	/**
	 * 이자계산시작일자
	 */
	@ApiModelProperty(
		name = "intCalStaDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("intCalStaDt")
	@BxmOmm_Field(length=8, decimal=0, description="이자계산시작일자", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=C","EIMS_DATA_TYPE=S"})
	private String intCalStaDt= "";
	
	
	/**
	 * 이자계산종료일자
	 */
	@ApiModelProperty(
		name = "intCalEndDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("intCalEndDt")
	@BxmOmm_Field(length=8, decimal=0, description="이자계산종료일자", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=C","EIMS_DATA_TYPE=S"})
	private String intCalEndDt= "";
	
	
	
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
	public List<MNPMnyPinWallMngSelectWallIntDtlPrtsList_ODT> getGrid(){
		return grid;
	}
	
	/**
	 * 그리드
	 * 
	 * @param grid 그리드
	 */
	@JsonSetter("grid")
	public void setGrid(List<MNPMnyPinWallMngSelectWallIntDtlPrtsList_ODT> grid){
		this.grid= grid;
		this.setIsSet_grid(true);
	}
	
	public void setGrid(MNPMnyPinWallMngSelectWallIntDtlPrtsList_ODT... items){
		List<MNPMnyPinWallMngSelectWallIntDtlPrtsList_ODT> _items= new ArrayList<>();
		if ( items!= null && items.length> 0){
			for( MNPMnyPinWallMngSelectWallIntDtlPrtsList_ODT item: items ){
				_items.add(item);
			}
		}
		this.setGrid(_items);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_trnYm= false;
	protected final boolean isSet_trnYm(){
		return this.isSet_trnYm;
	}
	private void setIsSet_trnYm(boolean value){
		this.isSet_trnYm= value;
	}
	/**
	 * 거래년월
	 */
	@XmlTransient
	public String getTrnYm(){
		return this.trnYm;
	}
	
	/**
	 * 거래년월
	 * 
	 * @param trnYm 거래년월
	 */
	public void setTrnYm(String trnYm){
		this.trnYm= trnYm;
		this.setIsSet_trnYm(true);
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
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_totIntIctx= false;
	protected final boolean isSet_totIntIctx(){
		return this.isSet_totIntIctx;
	}
	private void setIsSet_totIntIctx(boolean value){
		this.isSet_totIntIctx= value;
	}
	/**
	 * 총이자소득세
	 * BigDecimal - Double value setter
	 *
	 * @Param totIntIctx 총이자소득세
	 */
	public void setTotIntIctx(double totIntIctx) {
		setTotIntIctx(BigDecimal.valueOf(totIntIctx));
	}
	/**
	 * 총이자소득세
	 * BigDecimal - Long value setter
	 *
	 * @Param totIntIctx 총이자소득세
	 */
	public void setTotIntIctx(long totIntIctx) {
		setTotIntIctx(BigDecimal.valueOf(totIntIctx));
	}
	/**
	 * 총이자소득세
	 * BigDecimal - String value setter
	 *
	 * @Param totIntIctx 총이자소득세
	 */
	public void setTotIntIctx(String totIntIctx) {
		setTotIntIctx(new BigDecimal(totIntIctx));
	}
	/**
	 * 총이자소득세
	 */
	@XmlTransient
	public BigDecimal getTotIntIctx(){
		return this.totIntIctx;
	}
	
	/**
	 * 총이자소득세
	 * 
	 * @param totIntIctx 총이자소득세
	 */
	@JsonSetter("totIntIctx")
	public void setTotIntIctx(BigDecimal totIntIctx){
		this.totIntIctx= totIntIctx;
		this.setIsSet_totIntIctx(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_intCalStaDt= false;
	protected final boolean isSet_intCalStaDt(){
		return this.isSet_intCalStaDt;
	}
	private void setIsSet_intCalStaDt(boolean value){
		this.isSet_intCalStaDt= value;
	}
	/**
	 * 이자계산시작일자
	 */
	@XmlTransient
	public String getIntCalStaDt(){
		return this.intCalStaDt;
	}
	
	/**
	 * 이자계산시작일자
	 * 
	 * @param intCalStaDt 이자계산시작일자
	 */
	public void setIntCalStaDt(String intCalStaDt){
		this.intCalStaDt= intCalStaDt;
		this.setIsSet_intCalStaDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_intCalEndDt= false;
	protected final boolean isSet_intCalEndDt(){
		return this.isSet_intCalEndDt;
	}
	private void setIsSet_intCalEndDt(boolean value){
		this.isSet_intCalEndDt= value;
	}
	/**
	 * 이자계산종료일자
	 */
	@XmlTransient
	public String getIntCalEndDt(){
		return this.intCalEndDt;
	}
	
	/**
	 * 이자계산종료일자
	 * 
	 * @param intCalEndDt 이자계산종료일자
	 */
	public void setIntCalEndDt(String intCalEndDt){
		this.intCalEndDt= intCalEndDt;
		this.setIsSet_intCalEndDt(true);
	}
				
	@Override
	public MNPMnyPinWallMngSelectWallIntDtlPrts_ODT clone(){
		try{
			MNPMnyPinWallMngSelectWallIntDtlPrts_ODT object= (MNPMnyPinWallMngSelectWallIntDtlPrts_ODT)super.clone();
			if ( this.grid== null ) object.grid= null;
			else{
				List<MNPMnyPinWallMngSelectWallIntDtlPrtsList_ODT> clonedList= new ArrayList<>(this.grid.size());
				for( MNPMnyPinWallMngSelectWallIntDtlPrtsList_ODT item : grid ){
					clonedList.add((MNPMnyPinWallMngSelectWallIntDtlPrtsList_ODT)item.clone());
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
		result= prime * result + ((this.trnYm==null)?0:this.trnYm.hashCode());
		result= prime * result + ((this.totPayIntAm==null)?0:this.totPayIntAm.hashCode());
		result= prime * result + ((this.totIntIctx==null)?0:this.totIntIctx.hashCode());
		result= prime * result + ((this.intCalStaDt==null)?0:this.intCalStaDt.hashCode());
		result= prime * result + ((this.intCalEndDt==null)?0:this.intCalEndDt.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MNPMnyPinWallMngSelectWallIntDtlPrts_ODT other= (MNPMnyPinWallMngSelectWallIntDtlPrts_ODT)obj;
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
			Object _trnYm= getTrnYm();
			Object __trnYm= other.getTrnYm();
			if ( _trnYm== null ) { if ( __trnYm!= null ) return false; }
			else if ( !_trnYm.equals(__trnYm) ) return false;
		}
		{
			Object _totPayIntAm= getTotPayIntAm();
			Object __totPayIntAm= other.getTotPayIntAm();
			if ( _totPayIntAm== null ) { if ( __totPayIntAm!= null ) return false; }
			else if ( !_totPayIntAm.equals(__totPayIntAm) ) return false;
		}
		{
			Object _totIntIctx= getTotIntIctx();
			Object __totIntIctx= other.getTotIntIctx();
			if ( _totIntIctx== null ) { if ( __totIntIctx!= null ) return false; }
			else if ( !_totIntIctx.equals(__totIntIctx) ) return false;
		}
		{
			Object _intCalStaDt= getIntCalStaDt();
			Object __intCalStaDt= other.getIntCalStaDt();
			if ( _intCalStaDt== null ) { if ( __intCalStaDt!= null ) return false; }
			else if ( !_intCalStaDt.equals(__intCalStaDt) ) return false;
		}
		{
			Object _intCalEndDt= getIntCalEndDt();
			Object __intCalEndDt= other.getIntCalEndDt();
			if ( _intCalEndDt== null ) { if ( __intCalEndDt!= null ) return false; }
			else if ( !_intCalEndDt.equals(__intCalEndDt) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MNPMnyPinWallMngSelectWallIntDtlPrts_ODT.class.getName()).append(":\n");
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
		sb.append("\ttrnYm: ");
		sb.append(trnYm==null?"null":getTrnYm());
		sb.append("\n");
		sb.append("\ttotPayIntAm: ");
		sb.append(totPayIntAm==null?"null":getTotPayIntAm());
		sb.append("\n");
		sb.append("\ttotIntIctx: ");
		sb.append(totIntIctx==null?"null":getTotIntIctx());
		sb.append("\n");
		sb.append("\tintCalStaDt: ");
		sb.append(intCalStaDt==null?"null":getIntCalStaDt());
		sb.append("\n");
		sb.append("\tintCalEndDt: ");
		sb.append(intCalEndDt==null?"null":getIntCalEndDt());
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
			MNPMnyPinWallMngSelectWallIntDtlPrtsList_ODT emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					MNPMnyPinWallMngSelectWallIntDtlPrtsList_ODT element= grid.get(i);
					if ( element != null && !(element instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= element==null?0:( (Predictable)element).predictMessageLength();
				}else{
					if ( emptyElement== null ) emptyElement= new com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinWallMngSelectWallIntDtlPrtsList_ODT();
					if ( !(emptyElement instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= ( (Predictable)emptyElement).predictMessageLength();
				}
			}
		}
		messageLen+= 6; /* trnYm */
		messageLen+= 19; /* totPayIntAm */
		messageLen+= 19; /* totIntIctx */
		messageLen+= 8; /* intCalStaDt */
		messageLen+= 8; /* intCalEndDt */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("gridRowCnt");
		list.add("grid");
		list.add("trnYm");
		list.add("totPayIntAm");
		list.add("totIntIctx");
		list.add("intCalStaDt");
		list.add("intCalEndDt");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("gridRowCnt", get("gridRowCnt"));
		map.put("grid", get("grid"));
		map.put("trnYm", get("trnYm"));
		map.put("totPayIntAm", get("totPayIntAm"));
		map.put("totIntIctx", get("totIntIctx"));
		map.put("intCalStaDt", get("intCalStaDt"));
		map.put("intCalEndDt", get("intCalEndDt"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 663827477:/* gridRowCnt */
			return getGridRowCnt();
		case 3181382:/* grid */
			return getGrid();
		case 110633188:/* trnYm */
			return getTrnYm();
		case -423058132:/* totPayIntAm */
			return getTotPayIntAm();
		case -455276012:/* totIntIctx */
			return getTotIntIctx();
		case 815570097:/* intCalStaDt */
			return getIntCalStaDt();
		case 802464940:/* intCalEndDt */
			return getIntCalEndDt();
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
			setGrid((List<MNPMnyPinWallMngSelectWallIntDtlPrtsList_ODT>)value);
			break;
		case 110633188:/* trnYm */
			setTrnYm((String)value);
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
		case -455276012:/* totIntIctx */
			if ( value instanceof String ){
				setTotIntIctx((String)value);
			}
			else if ( value instanceof Double ){
				setTotIntIctx((Double)value);
			}
			else if ( value instanceof Long ){
				setTotIntIctx((Long)value);
			}
			else{
				setTotIntIctx((BigDecimal)value);
			}
			break;
		case 815570097:/* intCalStaDt */
			setIntCalStaDt((String)value);
			break;
		case 802464940:/* intCalEndDt */
			setIntCalEndDt((String)value);
			break;
		default:
			break;
		}
	}
	
}
