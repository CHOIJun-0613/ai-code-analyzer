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
	"nxtTsReqDt", "nxtTsReqTm", "nxtTsReqMbhSrno", "nxtTsReqSrno", "gridCnt", "grid"
}, name="MPBTsReqInfInq_ODT")
@XmlRootElement(name="MPBTsReqInfInq_ODT")
@BxmCategory(logicalName="이체요청.정보.조회.컨트롤러.출력.IO", description="") 
public class MPBMetPbokFncTrnMngSelectTsReqPrtsInf_ODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 847051494L;
	
	
	
	/**
	 * 다음이체요청일자
	 */
	@ApiModelProperty(
		name = "nxtTsReqDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("nxtTsReqDt")
	@BxmOmm_Field(length=8, decimal=0, description="다음이체요청일자", align="left", fill="")
	private String nxtTsReqDt= "";
	
	
	/**
	 * 다음이체요청시간
	 */
	@ApiModelProperty(
		name = "nxtTsReqTm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("nxtTsReqTm")
	@BxmOmm_Field(length=6, decimal=0, description="다음이체요청시간", align="left", fill="")
	private String nxtTsReqTm= "";
	
	
	/**
	 * 다음이체요청회원일련번호
	 */
	@ApiModelProperty(
		name = "nxtTsReqMbhSrno"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("nxtTsReqMbhSrno")
	@BxmOmm_Field(length=7, decimal=0, description="다음이체요청회원일련번호", align="right", fill="")
	private Integer nxtTsReqMbhSrno= 0;
	
	
	/**
	 * 다음이체요청일련번호
	 */
	@ApiModelProperty(
		name = "nxtTsReqSrno"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("nxtTsReqSrno")
	@BxmOmm_Field(length=5, decimal=0, description="다음이체요청일련번호", align="right", fill="")
	private Integer nxtTsReqSrno= 0;
	
	
	/**
	 * 그리드건수
	 */
	@ApiModelProperty(
		name = "gridCnt"
		, dataType = "java.math.BigInteger"
		)
	@JsonProperty("gridCnt")
	@BxmOmm_Field(length=2, decimal=0, description="그리드건수", align="right", fill="")
	private Integer gridCnt= 0;
	
	
	/**
	 * 이체요청.정보.목록.조회.컨트롤러.출력.IO
	 */
	@ApiModelProperty(
		name = "grid"
		, dataType = "[Lcom.skbank.sml.fns.mpb.ctr.dto.MPBTsReqInfListInq_ODT;"
		)
	@XmlElement(name="item")
	@XmlElementWrapper()
	@JsonProperty("grid")
	@BxmOmm_Field(length=0, decimal=0, description="이체요청.정보.목록.조회.컨트롤러.출력.IO", align="left", fill="", arrayReference="gridCnt")
	private List<MPBTsReqInfListInq_ODT> grid= new ArrayList<>();
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_nxtTsReqDt= false;
	protected final boolean isSet_nxtTsReqDt(){
		return this.isSet_nxtTsReqDt;
	}
	private void setIsSet_nxtTsReqDt(boolean value){
		this.isSet_nxtTsReqDt= value;
	}
	/**
	 * 다음이체요청일자
	 */
	@XmlTransient
	public String getNxtTsReqDt(){
		return this.nxtTsReqDt;
	}
	
	/**
	 * 다음이체요청일자
	 * 
	 * @param nxtTsReqDt 다음이체요청일자
	 */
	public void setNxtTsReqDt(String nxtTsReqDt){
		this.nxtTsReqDt= nxtTsReqDt;
		this.setIsSet_nxtTsReqDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_nxtTsReqTm= false;
	protected final boolean isSet_nxtTsReqTm(){
		return this.isSet_nxtTsReqTm;
	}
	private void setIsSet_nxtTsReqTm(boolean value){
		this.isSet_nxtTsReqTm= value;
	}
	/**
	 * 다음이체요청시간
	 */
	@XmlTransient
	public String getNxtTsReqTm(){
		return this.nxtTsReqTm;
	}
	
	/**
	 * 다음이체요청시간
	 * 
	 * @param nxtTsReqTm 다음이체요청시간
	 */
	public void setNxtTsReqTm(String nxtTsReqTm){
		this.nxtTsReqTm= nxtTsReqTm;
		this.setIsSet_nxtTsReqTm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_nxtTsReqMbhSrno= false;
	protected final boolean isSet_nxtTsReqMbhSrno(){
		return this.isSet_nxtTsReqMbhSrno;
	}
	private void setIsSet_nxtTsReqMbhSrno(boolean value){
		this.isSet_nxtTsReqMbhSrno= value;
	}
	/**
	 * 다음이체요청회원일련번호
	 */
	@XmlTransient
	public Integer getNxtTsReqMbhSrno(){
		return this.nxtTsReqMbhSrno;
	}
	
	/**
	 * 다음이체요청회원일련번호
	 * 
	 * @param nxtTsReqMbhSrno 다음이체요청회원일련번호
	 */
	public void setNxtTsReqMbhSrno(Integer nxtTsReqMbhSrno){
		this.nxtTsReqMbhSrno= nxtTsReqMbhSrno;
		this.setIsSet_nxtTsReqMbhSrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_nxtTsReqSrno= false;
	protected final boolean isSet_nxtTsReqSrno(){
		return this.isSet_nxtTsReqSrno;
	}
	private void setIsSet_nxtTsReqSrno(boolean value){
		this.isSet_nxtTsReqSrno= value;
	}
	/**
	 * 다음이체요청일련번호
	 */
	@XmlTransient
	public Integer getNxtTsReqSrno(){
		return this.nxtTsReqSrno;
	}
	
	/**
	 * 다음이체요청일련번호
	 * 
	 * @param nxtTsReqSrno 다음이체요청일련번호
	 */
	public void setNxtTsReqSrno(Integer nxtTsReqSrno){
		this.nxtTsReqSrno= nxtTsReqSrno;
		this.setIsSet_nxtTsReqSrno(true);
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
	 * 이체요청.정보.목록.조회.컨트롤러.출력.IO
	 */
	@XmlTransient
	public List<MPBTsReqInfListInq_ODT> getGrid(){
		return grid;
	}
	
	/**
	 * 이체요청.정보.목록.조회.컨트롤러.출력.IO
	 * 
	 * @param grid 이체요청.정보.목록.조회.컨트롤러.출력.IO
	 */
	@JsonSetter("grid")
	public void setGrid(List<MPBTsReqInfListInq_ODT> grid){
		this.grid= grid;
		this.setIsSet_grid(true);
	}
	
	public void setGrid(MPBTsReqInfListInq_ODT... items){
		List<MPBTsReqInfListInq_ODT> _items= new ArrayList<>();
		if ( items!= null && items.length> 0){
			for( MPBTsReqInfListInq_ODT item: items ){
				_items.add(item);
			}
		}
		this.setGrid(_items);
	}
				
	@Override
	public MPBMetPbokFncTrnMngSelectTsReqPrtsInf_ODT clone(){
		try{
			MPBMetPbokFncTrnMngSelectTsReqPrtsInf_ODT object= (MPBMetPbokFncTrnMngSelectTsReqPrtsInf_ODT)super.clone();
			if ( this.grid== null ) object.grid= null;
			else{
				List<MPBTsReqInfListInq_ODT> clonedList= new ArrayList<>(this.grid.size());
				for( MPBTsReqInfListInq_ODT item : grid ){
					clonedList.add((MPBTsReqInfListInq_ODT)item.clone());
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
		
		result= prime * result + ((this.nxtTsReqDt==null)?0:this.nxtTsReqDt.hashCode());
		result= prime * result + ((this.nxtTsReqTm==null)?0:this.nxtTsReqTm.hashCode());
		result= prime * result + ((this.nxtTsReqMbhSrno==null)?0:this.nxtTsReqMbhSrno.hashCode());
		result= prime * result + ((this.nxtTsReqSrno==null)?0:this.nxtTsReqSrno.hashCode());
		result= prime * result + ((this.gridCnt==null)?0:this.gridCnt.hashCode());
		result= prime * result + ((this.grid==null)?0:this.grid.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MPBMetPbokFncTrnMngSelectTsReqPrtsInf_ODT other= (MPBMetPbokFncTrnMngSelectTsReqPrtsInf_ODT)obj;
		{
			Object _nxtTsReqDt= getNxtTsReqDt();
			Object __nxtTsReqDt= other.getNxtTsReqDt();
			if ( _nxtTsReqDt== null ) { if ( __nxtTsReqDt!= null ) return false; }
			else if ( !_nxtTsReqDt.equals(__nxtTsReqDt) ) return false;
		}
		{
			Object _nxtTsReqTm= getNxtTsReqTm();
			Object __nxtTsReqTm= other.getNxtTsReqTm();
			if ( _nxtTsReqTm== null ) { if ( __nxtTsReqTm!= null ) return false; }
			else if ( !_nxtTsReqTm.equals(__nxtTsReqTm) ) return false;
		}
		{
			Object _nxtTsReqMbhSrno= getNxtTsReqMbhSrno();
			Object __nxtTsReqMbhSrno= other.getNxtTsReqMbhSrno();
			if ( _nxtTsReqMbhSrno== null ) { if ( __nxtTsReqMbhSrno!= null ) return false; }
			else if ( !_nxtTsReqMbhSrno.equals(__nxtTsReqMbhSrno) ) return false;
		}
		{
			Object _nxtTsReqSrno= getNxtTsReqSrno();
			Object __nxtTsReqSrno= other.getNxtTsReqSrno();
			if ( _nxtTsReqSrno== null ) { if ( __nxtTsReqSrno!= null ) return false; }
			else if ( !_nxtTsReqSrno.equals(__nxtTsReqSrno) ) return false;
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
	
		sb.append("\n[").append(MPBMetPbokFncTrnMngSelectTsReqPrtsInf_ODT.class.getName()).append(":\n");
		sb.append("\tnxtTsReqDt: ");
		sb.append(nxtTsReqDt==null?"null":getNxtTsReqDt());
		sb.append("\n");
		sb.append("\tnxtTsReqTm: ");
		sb.append(nxtTsReqTm==null?"null":getNxtTsReqTm());
		sb.append("\n");
		sb.append("\tnxtTsReqMbhSrno: ");
		sb.append(nxtTsReqMbhSrno==null?"null":getNxtTsReqMbhSrno());
		sb.append("\n");
		sb.append("\tnxtTsReqSrno: ");
		sb.append(nxtTsReqSrno==null?"null":getNxtTsReqSrno());
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
		
		messageLen+= 8; /* nxtTsReqDt */
		messageLen+= 6; /* nxtTsReqTm */
		messageLen+= 7; /* nxtTsReqMbhSrno */
		messageLen+= 5; /* nxtTsReqSrno */
		messageLen+= 2; /* gridCnt */
		{/*grid*/
			int size=getGridCnt();
			int count= grid == null ? 0 : grid.size();
			int min= size > count?count:size;
			MPBTsReqInfListInq_ODT emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					MPBTsReqInfListInq_ODT element= grid.get(i);
					if ( element != null && !(element instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= element==null?0:( (Predictable)element).predictMessageLength();
				}else{
					if ( emptyElement== null ) emptyElement= new com.skbank.sml.fns.mpb.ctr.dto.MPBTsReqInfListInq_ODT();
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
	
		list.add("nxtTsReqDt");
		list.add("nxtTsReqTm");
		list.add("nxtTsReqMbhSrno");
		list.add("nxtTsReqSrno");
		list.add("gridCnt");
		list.add("grid");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("nxtTsReqDt", get("nxtTsReqDt"));
		map.put("nxtTsReqTm", get("nxtTsReqTm"));
		map.put("nxtTsReqMbhSrno", get("nxtTsReqMbhSrno"));
		map.put("nxtTsReqSrno", get("nxtTsReqSrno"));
		map.put("gridCnt", get("gridCnt"));
		map.put("grid", get("grid"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -1373185211:/* nxtTsReqDt */
			return getNxtTsReqDt();
		case -1373184722:/* nxtTsReqTm */
			return getNxtTsReqTm();
		case 669663966:/* nxtTsReqMbhSrno */
			return getNxtTsReqMbhSrno();
		case -1075579435:/* nxtTsReqSrno */
			return getNxtTsReqSrno();
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
		case -1373185211:/* nxtTsReqDt */
			setNxtTsReqDt((String)value);
			break;
		case -1373184722:/* nxtTsReqTm */
			setNxtTsReqTm((String)value);
			break;
		case 669663966:/* nxtTsReqMbhSrno */
			setNxtTsReqMbhSrno((Integer)value);
			break;
		case -1075579435:/* nxtTsReqSrno */
			setNxtTsReqSrno((Integer)value);
			break;
		case 287338563:/* gridCnt */
			setGridCnt((Integer)value);
			break;
		case 3181382:/* grid */
			setGrid((List<MPBTsReqInfListInq_ODT>)value);
			break;
		default:
			break;
		}
	}
	
}
