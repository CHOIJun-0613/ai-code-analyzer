/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.mpb.dto;

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
 * IBSMR0005769
 */
@XmlType(propOrder={
	"metOrgJnngYn", "metMbhJnngCnt", "metmbDlyWdrLmtAvlAm", "nxtMetMngNo", "gridCnt", "grid"
}, name="MetPbokBscInfInq_DODT")
@XmlRootElement(name="MetPbokBscInfInq_DODT")
@BxmCategory(logicalName="모임통장.기본.정보.조회.DBM.출력.IO", description="IBSMR0005769") 
public class MetPbokBscInfInq_DODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 1366817913L;
	
	
	
	/**
	 * 모임원가입여부
	 */
	@ApiModelProperty(
		name = "metOrgJnngYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metOrgJnngYn")
	@BxmOmm_Field(length=1, decimal=0, description="모임원가입여부", align="left", fill="")
	private String metOrgJnngYn= "";
	
	
	/**
	 * 모임회원가입건수
	 */
	@ApiModelProperty(
		name = "metMbhJnngCnt"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("metMbhJnngCnt")
	@BxmOmm_Field(length=3, decimal=0, description="모임회원가입건수", align="right", fill="0")
	private Integer metMbhJnngCnt= 0;
	
	
	/**
	 * 모임원일일출금한도가능금액
	 */
	@ApiModelProperty(
		name = "metmbDlyWdrLmtAvlAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("metmbDlyWdrLmtAvlAm")
	@BxmOmm_Field(length=19, decimal=3, description="모임원일일출금한도가능금액", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal metmbDlyWdrLmtAvlAm= new BigDecimal("0");
	
	
	/**
	 * 다음모임관리번호 
	 */
	@ApiModelProperty(
		name = "nxtMetMngNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("nxtMetMngNo")
	@BxmOmm_Field(length=9, decimal=0, description="다음모임관리번호 ", align="left", fill="")
	private String nxtMetMngNo= "";
	
	
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
	 * 모임통장.기본.정보.조회.DBM. 출력.IO
	 */
	@ApiModelProperty(
		name = "grid"
		, dataType = "[Lcom.skbank.sml.fns.mpb.dto.MetPbokBscInfGrid;"
		)
	@XmlElement(name="item")
	@XmlElementWrapper()
	@JsonProperty("grid")
	@BxmOmm_Field(length=0, decimal=0, description="모임통장.기본.정보.조회.DBM. 출력.IO", align="left", fill="", arrayReference="gridCnt")
	private List<MetPbokBscInfGrid> grid= new ArrayList<>();
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metOrgJnngYn= false;
	protected final boolean isSet_metOrgJnngYn(){
		return this.isSet_metOrgJnngYn;
	}
	private void setIsSet_metOrgJnngYn(boolean value){
		this.isSet_metOrgJnngYn= value;
	}
	/**
	 * 모임원가입여부
	 */
	@XmlTransient
	public String getMetOrgJnngYn(){
		return this.metOrgJnngYn;
	}
	
	/**
	 * 모임원가입여부
	 * 
	 * @param metOrgJnngYn 모임원가입여부
	 */
	public void setMetOrgJnngYn(String metOrgJnngYn){
		this.metOrgJnngYn= metOrgJnngYn;
		this.setIsSet_metOrgJnngYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metMbhJnngCnt= false;
	protected final boolean isSet_metMbhJnngCnt(){
		return this.isSet_metMbhJnngCnt;
	}
	private void setIsSet_metMbhJnngCnt(boolean value){
		this.isSet_metMbhJnngCnt= value;
	}
	/**
	 * 모임회원가입건수
	 */
	@XmlTransient
	public Integer getMetMbhJnngCnt(){
		return this.metMbhJnngCnt;
	}
	
	/**
	 * 모임회원가입건수
	 * 
	 * @param metMbhJnngCnt 모임회원가입건수
	 */
	public void setMetMbhJnngCnt(Integer metMbhJnngCnt){
		this.metMbhJnngCnt= metMbhJnngCnt;
		this.setIsSet_metMbhJnngCnt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metmbDlyWdrLmtAvlAm= false;
	protected final boolean isSet_metmbDlyWdrLmtAvlAm(){
		return this.isSet_metmbDlyWdrLmtAvlAm;
	}
	private void setIsSet_metmbDlyWdrLmtAvlAm(boolean value){
		this.isSet_metmbDlyWdrLmtAvlAm= value;
	}
	/**
	 * 모임원일일출금한도가능금액
	 * BigDecimal - Double value setter
	 *
	 * @Param metmbDlyWdrLmtAvlAm 모임원일일출금한도가능금액
	 */
	public void setMetmbDlyWdrLmtAvlAm(double metmbDlyWdrLmtAvlAm) {
		setMetmbDlyWdrLmtAvlAm(BigDecimal.valueOf(metmbDlyWdrLmtAvlAm));
	}
	/**
	 * 모임원일일출금한도가능금액
	 * BigDecimal - Long value setter
	 *
	 * @Param metmbDlyWdrLmtAvlAm 모임원일일출금한도가능금액
	 */
	public void setMetmbDlyWdrLmtAvlAm(long metmbDlyWdrLmtAvlAm) {
		setMetmbDlyWdrLmtAvlAm(BigDecimal.valueOf(metmbDlyWdrLmtAvlAm));
	}
	/**
	 * 모임원일일출금한도가능금액
	 * BigDecimal - String value setter
	 *
	 * @Param metmbDlyWdrLmtAvlAm 모임원일일출금한도가능금액
	 */
	public void setMetmbDlyWdrLmtAvlAm(String metmbDlyWdrLmtAvlAm) {
		setMetmbDlyWdrLmtAvlAm(new BigDecimal(metmbDlyWdrLmtAvlAm));
	}
	/**
	 * 모임원일일출금한도가능금액
	 */
	@XmlTransient
	public BigDecimal getMetmbDlyWdrLmtAvlAm(){
		return this.metmbDlyWdrLmtAvlAm;
	}
	
	/**
	 * 모임원일일출금한도가능금액
	 * 
	 * @param metmbDlyWdrLmtAvlAm 모임원일일출금한도가능금액
	 */
	@JsonSetter("metmbDlyWdrLmtAvlAm")
	public void setMetmbDlyWdrLmtAvlAm(BigDecimal metmbDlyWdrLmtAvlAm){
		this.metmbDlyWdrLmtAvlAm= metmbDlyWdrLmtAvlAm;
		this.setIsSet_metmbDlyWdrLmtAvlAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_nxtMetMngNo= false;
	protected final boolean isSet_nxtMetMngNo(){
		return this.isSet_nxtMetMngNo;
	}
	private void setIsSet_nxtMetMngNo(boolean value){
		this.isSet_nxtMetMngNo= value;
	}
	/**
	 * 다음모임관리번호 
	 */
	@XmlTransient
	public String getNxtMetMngNo(){
		return this.nxtMetMngNo;
	}
	
	/**
	 * 다음모임관리번호 
	 * 
	 * @param nxtMetMngNo 다음모임관리번호 
	 */
	public void setNxtMetMngNo(String nxtMetMngNo){
		this.nxtMetMngNo= nxtMetMngNo;
		this.setIsSet_nxtMetMngNo(true);
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
	 * 모임통장.기본.정보.조회.DBM. 출력.IO
	 */
	@XmlTransient
	public List<MetPbokBscInfGrid> getGrid(){
		return grid;
	}
	
	/**
	 * 모임통장.기본.정보.조회.DBM. 출력.IO
	 * 
	 * @param grid 모임통장.기본.정보.조회.DBM. 출력.IO
	 */
	@JsonSetter("grid")
	public void setGrid(List<MetPbokBscInfGrid> grid){
		this.grid= grid;
		this.setIsSet_grid(true);
	}
	
	public void setGrid(MetPbokBscInfGrid... items){
		List<MetPbokBscInfGrid> _items= new ArrayList<>();
		if ( items!= null && items.length> 0){
			for( MetPbokBscInfGrid item: items ){
				_items.add(item);
			}
		}
		this.setGrid(_items);
	}
				
	@Override
	public MetPbokBscInfInq_DODT clone(){
		try{
			MetPbokBscInfInq_DODT object= (MetPbokBscInfInq_DODT)super.clone();
			if ( this.grid== null ) object.grid= null;
			else{
				List<MetPbokBscInfGrid> clonedList= new ArrayList<>(this.grid.size());
				for( MetPbokBscInfGrid item : grid ){
					clonedList.add((MetPbokBscInfGrid)item.clone());
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
		
		result= prime * result + ((this.metOrgJnngYn==null)?0:this.metOrgJnngYn.hashCode());
		result= prime * result + ((this.metMbhJnngCnt==null)?0:this.metMbhJnngCnt.hashCode());
		result= prime * result + ((this.metmbDlyWdrLmtAvlAm==null)?0:this.metmbDlyWdrLmtAvlAm.hashCode());
		result= prime * result + ((this.nxtMetMngNo==null)?0:this.nxtMetMngNo.hashCode());
		result= prime * result + ((this.gridCnt==null)?0:this.gridCnt.hashCode());
		result= prime * result + ((this.grid==null)?0:this.grid.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MetPbokBscInfInq_DODT other= (MetPbokBscInfInq_DODT)obj;
		{
			Object _metOrgJnngYn= getMetOrgJnngYn();
			Object __metOrgJnngYn= other.getMetOrgJnngYn();
			if ( _metOrgJnngYn== null ) { if ( __metOrgJnngYn!= null ) return false; }
			else if ( !_metOrgJnngYn.equals(__metOrgJnngYn) ) return false;
		}
		{
			Object _metMbhJnngCnt= getMetMbhJnngCnt();
			Object __metMbhJnngCnt= other.getMetMbhJnngCnt();
			if ( _metMbhJnngCnt== null ) { if ( __metMbhJnngCnt!= null ) return false; }
			else if ( !_metMbhJnngCnt.equals(__metMbhJnngCnt) ) return false;
		}
		{
			Object _metmbDlyWdrLmtAvlAm= getMetmbDlyWdrLmtAvlAm();
			Object __metmbDlyWdrLmtAvlAm= other.getMetmbDlyWdrLmtAvlAm();
			if ( _metmbDlyWdrLmtAvlAm== null ) { if ( __metmbDlyWdrLmtAvlAm!= null ) return false; }
			else if ( !_metmbDlyWdrLmtAvlAm.equals(__metmbDlyWdrLmtAvlAm) ) return false;
		}
		{
			Object _nxtMetMngNo= getNxtMetMngNo();
			Object __nxtMetMngNo= other.getNxtMetMngNo();
			if ( _nxtMetMngNo== null ) { if ( __nxtMetMngNo!= null ) return false; }
			else if ( !_nxtMetMngNo.equals(__nxtMetMngNo) ) return false;
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
	
		sb.append("\n[").append(MetPbokBscInfInq_DODT.class.getName()).append(":\n");
		sb.append("\tmetOrgJnngYn: ");
		sb.append(metOrgJnngYn==null?"null":getMetOrgJnngYn());
		sb.append("\n");
		sb.append("\tmetMbhJnngCnt: ");
		sb.append(metMbhJnngCnt==null?"null":getMetMbhJnngCnt());
		sb.append("\n");
		sb.append("\tmetmbDlyWdrLmtAvlAm: ");
		sb.append(metmbDlyWdrLmtAvlAm==null?"null":getMetmbDlyWdrLmtAvlAm());
		sb.append("\n");
		sb.append("\tnxtMetMngNo: ");
		sb.append(nxtMetMngNo==null?"null":getNxtMetMngNo());
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
		
		messageLen+= 1; /* metOrgJnngYn */
		messageLen+= 3; /* metMbhJnngCnt */
		messageLen+= 19; /* metmbDlyWdrLmtAvlAm */
		messageLen+= 9; /* nxtMetMngNo */
		messageLen+= 5; /* gridCnt */
		{/*grid*/
			int size=getGridCnt();
			int count= grid == null ? 0 : grid.size();
			int min= size > count?count:size;
			MetPbokBscInfGrid emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					MetPbokBscInfGrid element= grid.get(i);
					if ( element != null && !(element instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= element==null?0:( (Predictable)element).predictMessageLength();
				}else{
					if ( emptyElement== null ) emptyElement= new com.skbank.sml.fns.mpb.dto.MetPbokBscInfGrid();
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
	
		list.add("metOrgJnngYn");
		list.add("metMbhJnngCnt");
		list.add("metmbDlyWdrLmtAvlAm");
		list.add("nxtMetMngNo");
		list.add("gridCnt");
		list.add("grid");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("metOrgJnngYn", get("metOrgJnngYn"));
		map.put("metMbhJnngCnt", get("metMbhJnngCnt"));
		map.put("metmbDlyWdrLmtAvlAm", get("metmbDlyWdrLmtAvlAm"));
		map.put("nxtMetMngNo", get("nxtMetMngNo"));
		map.put("gridCnt", get("gridCnt"));
		map.put("grid", get("grid"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -2035053702:/* metOrgJnngYn */
			return getMetOrgJnngYn();
		case -1966805963:/* metMbhJnngCnt */
			return getMetMbhJnngCnt();
		case -1848355435:/* metmbDlyWdrLmtAvlAm */
			return getMetmbDlyWdrLmtAvlAm();
		case -1817786155:/* nxtMetMngNo */
			return getNxtMetMngNo();
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
		case -2035053702:/* metOrgJnngYn */
			setMetOrgJnngYn((String)value);
			break;
		case -1966805963:/* metMbhJnngCnt */
			setMetMbhJnngCnt((Integer)value);
			break;
		case -1848355435:/* metmbDlyWdrLmtAvlAm */
			if ( value instanceof String ){
				setMetmbDlyWdrLmtAvlAm((String)value);
			}
			else if ( value instanceof Double ){
				setMetmbDlyWdrLmtAvlAm((Double)value);
			}
			else if ( value instanceof Long ){
				setMetmbDlyWdrLmtAvlAm((Long)value);
			}
			else{
				setMetmbDlyWdrLmtAvlAm((BigDecimal)value);
			}
			break;
		case -1817786155:/* nxtMetMngNo */
			setNxtMetMngNo((String)value);
			break;
		case 287338563:/* gridCnt */
			setGridCnt((Integer)value);
			break;
		case 3181382:/* grid */
			setGrid((List<MetPbokBscInfGrid>)value);
			break;
		default:
			break;
		}
	}
	
}
