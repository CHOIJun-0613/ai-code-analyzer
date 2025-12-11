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
import com.skbank.sml.ifi.mca.eims4.dto.IBSMR0004224_GRID_ODT;
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
	"trnRstCd", "trnRstTxt", "dpsInpAcno", "dpsRgsChgItcd", "gridRowCnt", "grid"
}, name="MnyPinBscMngUpdateMnpChidAcno_DODT")
@XmlRootElement(name="MnyPinBscMngUpdateMnpChidAcno_DODT")
@BxmCategory(logicalName="머니클립.자.계좌.수정.컴포넌트.출력IO", description="") 
public class MnyPinBscMngUpdateMnpChidAcno_DODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -1371697344L;
	
	
	
	/**
	 * 거래결과코드
	 */
	@ApiModelProperty(
		name = "trnRstCd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("trnRstCd")
	@BxmOmm_Field(length=4, decimal=0, description="거래결과코드", align="left", fill="")
	private String trnRstCd= "";
	
	
	/**
	 * 거래결과내용
	 */
	@ApiModelProperty(
		name = "trnRstTxt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("trnRstTxt")
	@BxmOmm_Field(length=80, decimal=0, description="거래결과내용", align="left", fill="")
	private String trnRstTxt= "";
	
	
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
		, dataType = "[Lcom.skbank.sml.ifi.mca.eims4.dto.IBSMR0004224_GRID_ODT;"
		)
	@XmlElement(name="item")
	@XmlElementWrapper()
	@JsonProperty("grid")
	@BxmOmm_Field(length=0, decimal=0, description="그리드", align="left", fill="", arrayReference="gridRowCnt")
	private List<IBSMR0004224_GRID_ODT> grid= new ArrayList<>();
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_trnRstCd= false;
	protected final boolean isSet_trnRstCd(){
		return this.isSet_trnRstCd;
	}
	private void setIsSet_trnRstCd(boolean value){
		this.isSet_trnRstCd= value;
	}
	/**
	 * 거래결과코드
	 */
	@XmlTransient
	public String getTrnRstCd(){
		return this.trnRstCd;
	}
	
	/**
	 * 거래결과코드
	 * 
	 * @param trnRstCd 거래결과코드
	 */
	public void setTrnRstCd(String trnRstCd){
		this.trnRstCd= trnRstCd;
		this.setIsSet_trnRstCd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_trnRstTxt= false;
	protected final boolean isSet_trnRstTxt(){
		return this.isSet_trnRstTxt;
	}
	private void setIsSet_trnRstTxt(boolean value){
		this.isSet_trnRstTxt= value;
	}
	/**
	 * 거래결과내용
	 */
	@XmlTransient
	public String getTrnRstTxt(){
		return this.trnRstTxt;
	}
	
	/**
	 * 거래결과내용
	 * 
	 * @param trnRstTxt 거래결과내용
	 */
	public void setTrnRstTxt(String trnRstTxt){
		this.trnRstTxt= trnRstTxt;
		this.setIsSet_trnRstTxt(true);
	}
	
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
	public List<IBSMR0004224_GRID_ODT> getGrid(){
		return grid;
	}
	
	/**
	 * 그리드
	 * 
	 * @param grid 그리드
	 */
	@JsonSetter("grid")
	public void setGrid(List<IBSMR0004224_GRID_ODT> grid){
		this.grid= grid;
		this.setIsSet_grid(true);
	}
	
	public void setGrid(IBSMR0004224_GRID_ODT... items){
		List<IBSMR0004224_GRID_ODT> _items= new ArrayList<>();
		if ( items!= null && items.length> 0){
			for( IBSMR0004224_GRID_ODT item: items ){
				_items.add(item);
			}
		}
		this.setGrid(_items);
	}
				
	@Override
	public MnyPinBscMngUpdateMnpChidAcno_DODT clone(){
		try{
			MnyPinBscMngUpdateMnpChidAcno_DODT object= (MnyPinBscMngUpdateMnpChidAcno_DODT)super.clone();
			if ( this.grid== null ) object.grid= null;
			else{
				List<IBSMR0004224_GRID_ODT> clonedList= new ArrayList<>(this.grid.size());
				for( IBSMR0004224_GRID_ODT item : grid ){
					clonedList.add((IBSMR0004224_GRID_ODT)item.clone());
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
		
		result= prime * result + ((this.trnRstCd==null)?0:this.trnRstCd.hashCode());
		result= prime * result + ((this.trnRstTxt==null)?0:this.trnRstTxt.hashCode());
		result= prime * result + ((this.dpsInpAcno==null)?0:this.dpsInpAcno.hashCode());
		result= prime * result + ((this.dpsRgsChgItcd==null)?0:this.dpsRgsChgItcd.hashCode());
		result= prime * result + ((this.gridRowCnt==null)?0:this.gridRowCnt.hashCode());
		result= prime * result + ((this.grid==null)?0:this.grid.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MnyPinBscMngUpdateMnpChidAcno_DODT other= (MnyPinBscMngUpdateMnpChidAcno_DODT)obj;
		{
			Object _trnRstCd= getTrnRstCd();
			Object __trnRstCd= other.getTrnRstCd();
			if ( _trnRstCd== null ) { if ( __trnRstCd!= null ) return false; }
			else if ( !_trnRstCd.equals(__trnRstCd) ) return false;
		}
		{
			Object _trnRstTxt= getTrnRstTxt();
			Object __trnRstTxt= other.getTrnRstTxt();
			if ( _trnRstTxt== null ) { if ( __trnRstTxt!= null ) return false; }
			else if ( !_trnRstTxt.equals(__trnRstTxt) ) return false;
		}
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
	
		sb.append("\n[").append(MnyPinBscMngUpdateMnpChidAcno_DODT.class.getName()).append(":\n");
		sb.append("\ttrnRstCd: ");
		sb.append(trnRstCd==null?"null":getTrnRstCd());
		sb.append("\n");
		sb.append("\ttrnRstTxt: ");
		sb.append(trnRstTxt==null?"null":getTrnRstTxt());
		sb.append("\n");
		sb.append("\tdpsInpAcno: ");
		sb.append(dpsInpAcno==null?"null":getDpsInpAcno());
		sb.append("\n");
		sb.append("\tdpsRgsChgItcd: ");
		sb.append(dpsRgsChgItcd==null?"null":getDpsRgsChgItcd());
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
		
		messageLen+= 4; /* trnRstCd */
		messageLen+= 80; /* trnRstTxt */
		messageLen+= 15; /* dpsInpAcno */
		messageLen+= 6; /* dpsRgsChgItcd */
		messageLen+= 5; /* gridRowCnt */
		{/*grid*/
			int size=getGridRowCnt();
			int count= grid == null ? 0 : grid.size();
			int min= size > count?count:size;
			IBSMR0004224_GRID_ODT emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					IBSMR0004224_GRID_ODT element= grid.get(i);
					if ( element != null && !(element instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= element==null?0:( (Predictable)element).predictMessageLength();
				}else{
					if ( emptyElement== null ) emptyElement= new com.skbank.sml.ifi.mca.eims4.dto.IBSMR0004224_GRID_ODT();
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
	
		list.add("trnRstCd");
		list.add("trnRstTxt");
		list.add("dpsInpAcno");
		list.add("dpsRgsChgItcd");
		list.add("gridRowCnt");
		list.add("grid");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("trnRstCd", get("trnRstCd"));
		map.put("trnRstTxt", get("trnRstTxt"));
		map.put("dpsInpAcno", get("dpsInpAcno"));
		map.put("dpsRgsChgItcd", get("dpsRgsChgItcd"));
		map.put("gridRowCnt", get("gridRowCnt"));
		map.put("grid", get("grid"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 1627215428:/* trnRstCd */
			return getTrnRstCd();
		case -1095912211:/* trnRstTxt */
			return getTrnRstTxt();
		case -865257337:/* dpsInpAcno */
			return getDpsInpAcno();
		case -1939790697:/* dpsRgsChgItcd */
			return getDpsRgsChgItcd();
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
		case 1627215428:/* trnRstCd */
			setTrnRstCd((String)value);
			break;
		case -1095912211:/* trnRstTxt */
			setTrnRstTxt((String)value);
			break;
		case -865257337:/* dpsInpAcno */
			setDpsInpAcno((String)value);
			break;
		case -1939790697:/* dpsRgsChgItcd */
			setDpsRgsChgItcd((String)value);
			break;
		case 663827477:/* gridRowCnt */
			setGridRowCnt((Integer)value);
			break;
		case 3181382:/* grid */
			setGrid((List<IBSMR0004224_GRID_ODT>)value);
			break;
		default:
			break;
		}
	}
	
}
