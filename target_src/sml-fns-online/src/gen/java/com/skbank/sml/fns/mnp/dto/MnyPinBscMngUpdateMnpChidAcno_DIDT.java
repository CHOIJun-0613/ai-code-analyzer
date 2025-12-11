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
import com.skbank.sml.ifi.mca.eims4.dto.IBSMR0004224_GRID_IDT;
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
	"dpsInpAcno", "dpsRgsChgItcd", "prcDscd", "dpsRecdStcd", "cucd", "itmChgRsnTxt", "frotPrcYn", "gridRowCnt", "grid"
}, name="MnyPinBscMngUpdateMnpChidAcno_DIDT")
@XmlRootElement(name="MnyPinBscMngUpdateMnpChidAcno_DIDT")
@BxmCategory(logicalName="머니클립.자.계좌.수정.컴포넌트.입력IO", description="") 
public class MnyPinBscMngUpdateMnpChidAcno_DIDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -1371703110L;
	
	
	
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
	 * 수신등록변경항목코드
	 */
	@ApiModelProperty(
		name = "dpsRgsChgItcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dpsRgsChgItcd")
	@BxmOmm_Field(length=6, decimal=0, description="수신등록변경항목코드", align="left", fill="")
	private String dpsRgsChgItcd= "";
	
	
	/**
	 * 처리구분코드
	 */
	@ApiModelProperty(
		name = "prcDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("prcDscd")
	@BxmOmm_Field(length=2, decimal=0, description="처리구분코드", align="left", fill="")
	private String prcDscd= "";
	
	
	/**
	 * 수신레코드상태코드
	 */
	@ApiModelProperty(
		name = "dpsRecdStcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dpsRecdStcd")
	@BxmOmm_Field(length=2, decimal=0, description="수신레코드상태코드", align="left", fill="")
	private String dpsRecdStcd= "";
	
	
	/**
	 * 통화코드
	 */
	@ApiModelProperty(
		name = "cucd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("cucd")
	@BxmOmm_Field(length=3, decimal=0, description="통화코드", align="left", fill="")
	private String cucd= "";
	
	
	/**
	 * 항목변경사유내용
	 */
	@ApiModelProperty(
		name = "itmChgRsnTxt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("itmChgRsnTxt")
	@BxmOmm_Field(length=100, decimal=0, description="항목변경사유내용", align="left", fill="")
	private String itmChgRsnTxt= "";
	
	
	/**
	 * 대외처리여부
	 */
	@ApiModelProperty(
		name = "frotPrcYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("frotPrcYn")
	@BxmOmm_Field(length=1, decimal=0, description="대외처리여부", align="left", fill="")
	private String frotPrcYn= "";
	
	
	/**
	 * 그리드열건수
	 */
	@ApiModelProperty(
		name = "gridRowCnt"
		, dataType = "java.math.BigInteger"
		)
	@JsonProperty("gridRowCnt")
	@BxmOmm_Field(length=5, decimal=0, description="그리드열건수", align="right", fill="0")
	private Integer gridRowCnt= 0;
	
	
	/**
	 * 그리드
	 */
	@ApiModelProperty(
		name = "grid"
		, dataType = "[Lcom.skbank.sml.ifi.mca.eims4.dto.IBSMR0004224_GRID_IDT;"
		)
	@XmlElement(name="item")
	@XmlElementWrapper()
	@JsonProperty("grid")
	@BxmOmm_Field(length=0, decimal=0, description="그리드", align="left", fill="", arrayReference="gridRowCnt")
	private List<IBSMR0004224_GRID_IDT> grid= new ArrayList<>();
	
	
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
	private boolean isSet_dpsRgsChgItcd= false;
	protected final boolean isSet_dpsRgsChgItcd(){
		return this.isSet_dpsRgsChgItcd;
	}
	private void setIsSet_dpsRgsChgItcd(boolean value){
		this.isSet_dpsRgsChgItcd= value;
	}
	/**
	 * 수신등록변경항목코드
	 */
	@XmlTransient
	public String getDpsRgsChgItcd(){
		return this.dpsRgsChgItcd;
	}
	
	/**
	 * 수신등록변경항목코드
	 * 
	 * @param dpsRgsChgItcd 수신등록변경항목코드
	 */
	public void setDpsRgsChgItcd(String dpsRgsChgItcd){
		this.dpsRgsChgItcd= dpsRgsChgItcd;
		this.setIsSet_dpsRgsChgItcd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_prcDscd= false;
	protected final boolean isSet_prcDscd(){
		return this.isSet_prcDscd;
	}
	private void setIsSet_prcDscd(boolean value){
		this.isSet_prcDscd= value;
	}
	/**
	 * 처리구분코드
	 */
	@XmlTransient
	public String getPrcDscd(){
		return this.prcDscd;
	}
	
	/**
	 * 처리구분코드
	 * 
	 * @param prcDscd 처리구분코드
	 */
	public void setPrcDscd(String prcDscd){
		this.prcDscd= prcDscd;
		this.setIsSet_prcDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dpsRecdStcd= false;
	protected final boolean isSet_dpsRecdStcd(){
		return this.isSet_dpsRecdStcd;
	}
	private void setIsSet_dpsRecdStcd(boolean value){
		this.isSet_dpsRecdStcd= value;
	}
	/**
	 * 수신레코드상태코드
	 */
	@XmlTransient
	public String getDpsRecdStcd(){
		return this.dpsRecdStcd;
	}
	
	/**
	 * 수신레코드상태코드
	 * 
	 * @param dpsRecdStcd 수신레코드상태코드
	 */
	public void setDpsRecdStcd(String dpsRecdStcd){
		this.dpsRecdStcd= dpsRecdStcd;
		this.setIsSet_dpsRecdStcd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cucd= false;
	protected final boolean isSet_cucd(){
		return this.isSet_cucd;
	}
	private void setIsSet_cucd(boolean value){
		this.isSet_cucd= value;
	}
	/**
	 * 통화코드
	 */
	@XmlTransient
	public String getCucd(){
		return this.cucd;
	}
	
	/**
	 * 통화코드
	 * 
	 * @param cucd 통화코드
	 */
	public void setCucd(String cucd){
		this.cucd= cucd;
		this.setIsSet_cucd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_itmChgRsnTxt= false;
	protected final boolean isSet_itmChgRsnTxt(){
		return this.isSet_itmChgRsnTxt;
	}
	private void setIsSet_itmChgRsnTxt(boolean value){
		this.isSet_itmChgRsnTxt= value;
	}
	/**
	 * 항목변경사유내용
	 */
	@XmlTransient
	public String getItmChgRsnTxt(){
		return this.itmChgRsnTxt;
	}
	
	/**
	 * 항목변경사유내용
	 * 
	 * @param itmChgRsnTxt 항목변경사유내용
	 */
	public void setItmChgRsnTxt(String itmChgRsnTxt){
		this.itmChgRsnTxt= itmChgRsnTxt;
		this.setIsSet_itmChgRsnTxt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_frotPrcYn= false;
	protected final boolean isSet_frotPrcYn(){
		return this.isSet_frotPrcYn;
	}
	private void setIsSet_frotPrcYn(boolean value){
		this.isSet_frotPrcYn= value;
	}
	/**
	 * 대외처리여부
	 */
	@XmlTransient
	public String getFrotPrcYn(){
		return this.frotPrcYn;
	}
	
	/**
	 * 대외처리여부
	 * 
	 * @param frotPrcYn 대외처리여부
	 */
	public void setFrotPrcYn(String frotPrcYn){
		this.frotPrcYn= frotPrcYn;
		this.setIsSet_frotPrcYn(true);
	}
	
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
	public List<IBSMR0004224_GRID_IDT> getGrid(){
		return grid;
	}
	
	/**
	 * 그리드
	 * 
	 * @param grid 그리드
	 */
	@JsonSetter("grid")
	public void setGrid(List<IBSMR0004224_GRID_IDT> grid){
		this.grid= grid;
		this.setIsSet_grid(true);
	}
	
	public void setGrid(IBSMR0004224_GRID_IDT... items){
		List<IBSMR0004224_GRID_IDT> _items= new ArrayList<>();
		if ( items!= null && items.length> 0){
			for( IBSMR0004224_GRID_IDT item: items ){
				_items.add(item);
			}
		}
		this.setGrid(_items);
	}
				
	@Override
	public MnyPinBscMngUpdateMnpChidAcno_DIDT clone(){
		try{
			MnyPinBscMngUpdateMnpChidAcno_DIDT object= (MnyPinBscMngUpdateMnpChidAcno_DIDT)super.clone();
			if ( this.grid== null ) object.grid= null;
			else{
				List<IBSMR0004224_GRID_IDT> clonedList= new ArrayList<>(this.grid.size());
				for( IBSMR0004224_GRID_IDT item : grid ){
					clonedList.add((IBSMR0004224_GRID_IDT)item.clone());
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
		result= prime * result + ((this.dpsRgsChgItcd==null)?0:this.dpsRgsChgItcd.hashCode());
		result= prime * result + ((this.prcDscd==null)?0:this.prcDscd.hashCode());
		result= prime * result + ((this.dpsRecdStcd==null)?0:this.dpsRecdStcd.hashCode());
		result= prime * result + ((this.cucd==null)?0:this.cucd.hashCode());
		result= prime * result + ((this.itmChgRsnTxt==null)?0:this.itmChgRsnTxt.hashCode());
		result= prime * result + ((this.frotPrcYn==null)?0:this.frotPrcYn.hashCode());
		result= prime * result + ((this.gridRowCnt==null)?0:this.gridRowCnt.hashCode());
		result= prime * result + ((this.grid==null)?0:this.grid.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MnyPinBscMngUpdateMnpChidAcno_DIDT other= (MnyPinBscMngUpdateMnpChidAcno_DIDT)obj;
		{
			Object _dpsInpAcno= getDpsInpAcno();
			Object __dpsInpAcno= other.getDpsInpAcno();
			if ( _dpsInpAcno== null ) { if ( __dpsInpAcno!= null ) return false; }
			else if ( !_dpsInpAcno.equals(__dpsInpAcno) ) return false;
		}
		{
			Object _dpsRgsChgItcd= getDpsRgsChgItcd();
			Object __dpsRgsChgItcd= other.getDpsRgsChgItcd();
			if ( _dpsRgsChgItcd== null ) { if ( __dpsRgsChgItcd!= null ) return false; }
			else if ( !_dpsRgsChgItcd.equals(__dpsRgsChgItcd) ) return false;
		}
		{
			Object _prcDscd= getPrcDscd();
			Object __prcDscd= other.getPrcDscd();
			if ( _prcDscd== null ) { if ( __prcDscd!= null ) return false; }
			else if ( !_prcDscd.equals(__prcDscd) ) return false;
		}
		{
			Object _dpsRecdStcd= getDpsRecdStcd();
			Object __dpsRecdStcd= other.getDpsRecdStcd();
			if ( _dpsRecdStcd== null ) { if ( __dpsRecdStcd!= null ) return false; }
			else if ( !_dpsRecdStcd.equals(__dpsRecdStcd) ) return false;
		}
		{
			Object _cucd= getCucd();
			Object __cucd= other.getCucd();
			if ( _cucd== null ) { if ( __cucd!= null ) return false; }
			else if ( !_cucd.equals(__cucd) ) return false;
		}
		{
			Object _itmChgRsnTxt= getItmChgRsnTxt();
			Object __itmChgRsnTxt= other.getItmChgRsnTxt();
			if ( _itmChgRsnTxt== null ) { if ( __itmChgRsnTxt!= null ) return false; }
			else if ( !_itmChgRsnTxt.equals(__itmChgRsnTxt) ) return false;
		}
		{
			Object _frotPrcYn= getFrotPrcYn();
			Object __frotPrcYn= other.getFrotPrcYn();
			if ( _frotPrcYn== null ) { if ( __frotPrcYn!= null ) return false; }
			else if ( !_frotPrcYn.equals(__frotPrcYn) ) return false;
		}
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
	
		sb.append("\n[").append(MnyPinBscMngUpdateMnpChidAcno_DIDT.class.getName()).append(":\n");
		sb.append("\tdpsInpAcno: ");
		sb.append(dpsInpAcno==null?"null":getDpsInpAcno());
		sb.append("\n");
		sb.append("\tdpsRgsChgItcd: ");
		sb.append(dpsRgsChgItcd==null?"null":getDpsRgsChgItcd());
		sb.append("\n");
		sb.append("\tprcDscd: ");
		sb.append(prcDscd==null?"null":getPrcDscd());
		sb.append("\n");
		sb.append("\tdpsRecdStcd: ");
		sb.append(dpsRecdStcd==null?"null":getDpsRecdStcd());
		sb.append("\n");
		sb.append("\tcucd: ");
		sb.append(cucd==null?"null":getCucd());
		sb.append("\n");
		sb.append("\titmChgRsnTxt: ");
		sb.append(itmChgRsnTxt==null?"null":getItmChgRsnTxt());
		sb.append("\n");
		sb.append("\tfrotPrcYn: ");
		sb.append(frotPrcYn==null?"null":getFrotPrcYn());
		sb.append("\n");
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
		
		messageLen+= 15; /* dpsInpAcno */
		messageLen+= 6; /* dpsRgsChgItcd */
		messageLen+= 2; /* prcDscd */
		messageLen+= 2; /* dpsRecdStcd */
		messageLen+= 3; /* cucd */
		messageLen+= 100; /* itmChgRsnTxt */
		messageLen+= 1; /* frotPrcYn */
		messageLen+= 5; /* gridRowCnt */
		{/*grid*/
			int size=getGridRowCnt();
			int count= grid == null ? 0 : grid.size();
			int min= size > count?count:size;
			IBSMR0004224_GRID_IDT emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					IBSMR0004224_GRID_IDT element= grid.get(i);
					if ( element != null && !(element instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= element==null?0:( (Predictable)element).predictMessageLength();
				}else{
					if ( emptyElement== null ) emptyElement= new com.skbank.sml.ifi.mca.eims4.dto.IBSMR0004224_GRID_IDT();
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
		list.add("dpsRgsChgItcd");
		list.add("prcDscd");
		list.add("dpsRecdStcd");
		list.add("cucd");
		list.add("itmChgRsnTxt");
		list.add("frotPrcYn");
		list.add("gridRowCnt");
		list.add("grid");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("dpsInpAcno", get("dpsInpAcno"));
		map.put("dpsRgsChgItcd", get("dpsRgsChgItcd"));
		map.put("prcDscd", get("prcDscd"));
		map.put("dpsRecdStcd", get("dpsRecdStcd"));
		map.put("cucd", get("cucd"));
		map.put("itmChgRsnTxt", get("itmChgRsnTxt"));
		map.put("frotPrcYn", get("frotPrcYn"));
		map.put("gridRowCnt", get("gridRowCnt"));
		map.put("grid", get("grid"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -865257337:/* dpsInpAcno */
			return getDpsInpAcno();
		case -1939790697:/* dpsRgsChgItcd */
			return getDpsRgsChgItcd();
		case -321511567:/* prcDscd */
			return getPrcDscd();
		case 2009292029:/* dpsRecdStcd */
			return getDpsRecdStcd();
		case 3064915:/* cucd */
			return getCucd();
		case 2134727075:/* itmChgRsnTxt */
			return getItmChgRsnTxt();
		case 267171941:/* frotPrcYn */
			return getFrotPrcYn();
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
		case -865257337:/* dpsInpAcno */
			setDpsInpAcno((String)value);
			break;
		case -1939790697:/* dpsRgsChgItcd */
			setDpsRgsChgItcd((String)value);
			break;
		case -321511567:/* prcDscd */
			setPrcDscd((String)value);
			break;
		case 2009292029:/* dpsRecdStcd */
			setDpsRecdStcd((String)value);
			break;
		case 3064915:/* cucd */
			setCucd((String)value);
			break;
		case 2134727075:/* itmChgRsnTxt */
			setItmChgRsnTxt((String)value);
			break;
		case 267171941:/* frotPrcYn */
			setFrotPrcYn((String)value);
			break;
		case 663827477:/* gridRowCnt */
			setGridRowCnt((Integer)value);
			break;
		case 3181382:/* grid */
			setGrid((List<IBSMR0004224_GRID_IDT>)value);
			break;
		default:
			break;
		}
	}
	
}
