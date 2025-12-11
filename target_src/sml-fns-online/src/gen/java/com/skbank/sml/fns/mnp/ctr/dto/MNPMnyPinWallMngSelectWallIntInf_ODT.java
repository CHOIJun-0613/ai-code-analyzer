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
	"gridCnt", "grid", "intSumAm", "nextIntDt", "intIctx", "intCalStaDt", "intCalEndDt", "aplIrt"
}, name="MNPMnyPinWallMngSelectWallIntInf_ODT")
@XmlRootElement(name="MNPMnyPinWallMngSelectWallIntInf_ODT")
@BxmCategory(logicalName="머니클립지갑이자계산정보조회.출력IO", description="") 
public class MNPMnyPinWallMngSelectWallIntInf_ODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 2017510803L;
	
	
	
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
		, dataType = "[Lcom.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinWallMngSelectWallIntInfList_ODT;"
		)
	@XmlElement(name="item")
	@XmlElementWrapper()
	@JsonProperty("grid")
	@BxmOmm_Field(length=0, decimal=0, description="그리드", align="left", fill="", arrayReference="1")
	private List<MNPMnyPinWallMngSelectWallIntInfList_ODT> grid= new ArrayList<>();
	
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
	
	
	/**
	 * 다음이자일
	 */
	@ApiModelProperty(
		name = "nextIntDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("nextIntDt")
	@BxmOmm_Field(length=8, decimal=0, description="다음이자일", align="left", fill="")
	private String nextIntDt= "";
	
	
	/**
	 * 이자소득세
	 */
	@ApiModelProperty(
		name = "intIctx"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("intIctx")
	@BxmOmm_Field(length=19, decimal=3, description="이자소득세", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal intIctx= new BigDecimal("0");
	
	
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
	
	
	/**
	 * 적용이율
	 */
	@ApiModelProperty(
		name = "aplIrt"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("aplIrt")
	@BxmOmm_Field(length=14, decimal=6, description="적용이율", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=C","EIMS_DATA_TYPE=D"})
	private BigDecimal aplIrt= new BigDecimal("0");
	
	
	
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
	public List<MNPMnyPinWallMngSelectWallIntInfList_ODT> getGrid(){
		return grid;
	}
	
	/**
	 * 그리드
	 * 
	 * @param grid 그리드
	 */
	@JsonSetter("grid")
	public void setGrid(List<MNPMnyPinWallMngSelectWallIntInfList_ODT> grid){
		this.grid= grid;
		this.setIsSet_grid(true);
	}
	
	public void setGrid(MNPMnyPinWallMngSelectWallIntInfList_ODT... items){
		List<MNPMnyPinWallMngSelectWallIntInfList_ODT> _items= new ArrayList<>();
		if ( items!= null && items.length> 0){
			for( MNPMnyPinWallMngSelectWallIntInfList_ODT item: items ){
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
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_nextIntDt= false;
	protected final boolean isSet_nextIntDt(){
		return this.isSet_nextIntDt;
	}
	private void setIsSet_nextIntDt(boolean value){
		this.isSet_nextIntDt= value;
	}
	/**
	 * 다음이자일
	 */
	@XmlTransient
	public String getNextIntDt(){
		return this.nextIntDt;
	}
	
	/**
	 * 다음이자일
	 * 
	 * @param nextIntDt 다음이자일
	 */
	public void setNextIntDt(String nextIntDt){
		this.nextIntDt= nextIntDt;
		this.setIsSet_nextIntDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_intIctx= false;
	protected final boolean isSet_intIctx(){
		return this.isSet_intIctx;
	}
	private void setIsSet_intIctx(boolean value){
		this.isSet_intIctx= value;
	}
	/**
	 * 이자소득세
	 * BigDecimal - Double value setter
	 *
	 * @Param intIctx 이자소득세
	 */
	public void setIntIctx(double intIctx) {
		setIntIctx(BigDecimal.valueOf(intIctx));
	}
	/**
	 * 이자소득세
	 * BigDecimal - Long value setter
	 *
	 * @Param intIctx 이자소득세
	 */
	public void setIntIctx(long intIctx) {
		setIntIctx(BigDecimal.valueOf(intIctx));
	}
	/**
	 * 이자소득세
	 * BigDecimal - String value setter
	 *
	 * @Param intIctx 이자소득세
	 */
	public void setIntIctx(String intIctx) {
		setIntIctx(new BigDecimal(intIctx));
	}
	/**
	 * 이자소득세
	 */
	@XmlTransient
	public BigDecimal getIntIctx(){
		return this.intIctx;
	}
	
	/**
	 * 이자소득세
	 * 
	 * @param intIctx 이자소득세
	 */
	@JsonSetter("intIctx")
	public void setIntIctx(BigDecimal intIctx){
		this.intIctx= intIctx;
		this.setIsSet_intIctx(true);
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
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_aplIrt= false;
	protected final boolean isSet_aplIrt(){
		return this.isSet_aplIrt;
	}
	private void setIsSet_aplIrt(boolean value){
		this.isSet_aplIrt= value;
	}
	/**
	 * 적용이율
	 * BigDecimal - Double value setter
	 *
	 * @Param aplIrt 적용이율
	 */
	public void setAplIrt(double aplIrt) {
		setAplIrt(BigDecimal.valueOf(aplIrt));
	}
	/**
	 * 적용이율
	 * BigDecimal - Long value setter
	 *
	 * @Param aplIrt 적용이율
	 */
	public void setAplIrt(long aplIrt) {
		setAplIrt(BigDecimal.valueOf(aplIrt));
	}
	/**
	 * 적용이율
	 * BigDecimal - String value setter
	 *
	 * @Param aplIrt 적용이율
	 */
	public void setAplIrt(String aplIrt) {
		setAplIrt(new BigDecimal(aplIrt));
	}
	/**
	 * 적용이율
	 */
	@XmlTransient
	public BigDecimal getAplIrt(){
		return this.aplIrt;
	}
	
	/**
	 * 적용이율
	 * 
	 * @param aplIrt 적용이율
	 */
	@JsonSetter("aplIrt")
	public void setAplIrt(BigDecimal aplIrt){
		this.aplIrt= aplIrt;
		this.setIsSet_aplIrt(true);
	}
				
	@Override
	public MNPMnyPinWallMngSelectWallIntInf_ODT clone(){
		try{
			MNPMnyPinWallMngSelectWallIntInf_ODT object= (MNPMnyPinWallMngSelectWallIntInf_ODT)super.clone();
			if ( this.grid== null ) object.grid= null;
			else{
				List<MNPMnyPinWallMngSelectWallIntInfList_ODT> clonedList= new ArrayList<>(this.grid.size());
				for( MNPMnyPinWallMngSelectWallIntInfList_ODT item : grid ){
					clonedList.add((MNPMnyPinWallMngSelectWallIntInfList_ODT)item.clone());
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
		result= prime * result + ((this.nextIntDt==null)?0:this.nextIntDt.hashCode());
		result= prime * result + ((this.intIctx==null)?0:this.intIctx.hashCode());
		result= prime * result + ((this.intCalStaDt==null)?0:this.intCalStaDt.hashCode());
		result= prime * result + ((this.intCalEndDt==null)?0:this.intCalEndDt.hashCode());
		result= prime * result + ((this.aplIrt==null)?0:this.aplIrt.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MNPMnyPinWallMngSelectWallIntInf_ODT other= (MNPMnyPinWallMngSelectWallIntInf_ODT)obj;
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
		{
			Object _nextIntDt= getNextIntDt();
			Object __nextIntDt= other.getNextIntDt();
			if ( _nextIntDt== null ) { if ( __nextIntDt!= null ) return false; }
			else if ( !_nextIntDt.equals(__nextIntDt) ) return false;
		}
		{
			Object _intIctx= getIntIctx();
			Object __intIctx= other.getIntIctx();
			if ( _intIctx== null ) { if ( __intIctx!= null ) return false; }
			else if ( !_intIctx.equals(__intIctx) ) return false;
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
		{
			Object _aplIrt= getAplIrt();
			Object __aplIrt= other.getAplIrt();
			if ( _aplIrt== null ) { if ( __aplIrt!= null ) return false; }
			else if ( !_aplIrt.equals(__aplIrt) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MNPMnyPinWallMngSelectWallIntInf_ODT.class.getName()).append(":\n");
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
		sb.append("\tnextIntDt: ");
		sb.append(nextIntDt==null?"null":getNextIntDt());
		sb.append("\n");
		sb.append("\tintIctx: ");
		sb.append(intIctx==null?"null":getIntIctx());
		sb.append("\n");
		sb.append("\tintCalStaDt: ");
		sb.append(intCalStaDt==null?"null":getIntCalStaDt());
		sb.append("\n");
		sb.append("\tintCalEndDt: ");
		sb.append(intCalEndDt==null?"null":getIntCalEndDt());
		sb.append("\n");
		sb.append("\taplIrt: ");
		sb.append(aplIrt==null?"null":getAplIrt());
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
			MNPMnyPinWallMngSelectWallIntInfList_ODT emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					MNPMnyPinWallMngSelectWallIntInfList_ODT element= grid.get(i);
					if ( element != null && !(element instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= element==null?0:( (Predictable)element).predictMessageLength();
				}else{
					if ( emptyElement== null ) emptyElement= new com.skbank.sml.fns.mnp.ctr.dto.MNPMnyPinWallMngSelectWallIntInfList_ODT();
					if ( !(emptyElement instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= ( (Predictable)emptyElement).predictMessageLength();
				}
			}
		}
		messageLen+= 19; /* intSumAm */
		messageLen+= 8; /* nextIntDt */
		messageLen+= 19; /* intIctx */
		messageLen+= 8; /* intCalStaDt */
		messageLen+= 8; /* intCalEndDt */
		messageLen+= 14; /* aplIrt */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("gridCnt");
		list.add("grid");
		list.add("intSumAm");
		list.add("nextIntDt");
		list.add("intIctx");
		list.add("intCalStaDt");
		list.add("intCalEndDt");
		list.add("aplIrt");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("gridCnt", get("gridCnt"));
		map.put("grid", get("grid"));
		map.put("intSumAm", get("intSumAm"));
		map.put("nextIntDt", get("nextIntDt"));
		map.put("intIctx", get("intIctx"));
		map.put("intCalStaDt", get("intCalStaDt"));
		map.put("intCalEndDt", get("intCalEndDt"));
		map.put("aplIrt", get("aplIrt"));
	
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
		case 1196737964:/* nextIntDt */
			return getNextIntDt();
		case 1957214637:/* intIctx */
			return getIntIctx();
		case 815570097:/* intCalStaDt */
			return getIntCalStaDt();
		case 802464940:/* intCalEndDt */
			return getIntCalEndDt();
		case -1411214066:/* aplIrt */
			return getAplIrt();
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
			setGrid((List<MNPMnyPinWallMngSelectWallIntInfList_ODT>)value);
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
		case 1196737964:/* nextIntDt */
			setNextIntDt((String)value);
			break;
		case 1957214637:/* intIctx */
			if ( value instanceof String ){
				setIntIctx((String)value);
			}
			else if ( value instanceof Double ){
				setIntIctx((Double)value);
			}
			else if ( value instanceof Long ){
				setIntIctx((Long)value);
			}
			else{
				setIntIctx((BigDecimal)value);
			}
			break;
		case 815570097:/* intCalStaDt */
			setIntCalStaDt((String)value);
			break;
		case 802464940:/* intCalEndDt */
			setIntCalEndDt((String)value);
			break;
		case -1411214066:/* aplIrt */
			if ( value instanceof String ){
				setAplIrt((String)value);
			}
			else if ( value instanceof Double ){
				setAplIrt((Double)value);
			}
			else if ( value instanceof Long ){
				setAplIrt((Long)value);
			}
			else{
				setAplIrt((BigDecimal)value);
			}
			break;
		default:
			break;
		}
	}
	
}
