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
	"trnDis", "metMngNo", "grid1Cnt", "dis1Grid", "grid2Cnt", "dis2Grid"
}, name="MPBMetPbokMbhMngInsertMetPbokMbhInf_IDT")
@XmlRootElement(name="MPBMetPbokMbhMngInsertMetPbokMbhInf_IDT")
@BxmCategory(logicalName="모임통장.회원.정보.등록.탈퇴.입력.IO", description="") 
public class MPBMetPbokMbhMngInsertMetPbokMbhInf_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -934065888L;
	
	
	
	/**
	 * 거래구분
	 */
	@ApiModelProperty(
		name = "trnDis"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("trnDis")
	@BxmOmm_Field(length=1, decimal=0, description="거래구분", align="left", fill="")
	private String trnDis= "";
	
	
	/**
	 * 모임관리번호
	 */
	@ApiModelProperty(
		name = "metMngNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metMngNo")
	@BxmOmm_Field(length=9, decimal=0, description="모임관리번호", align="left", fill="")
	private String metMngNo= "";
	
	
	/**
	 * 그리드1건수 
	 */
	@ApiModelProperty(
		name = "grid1Cnt"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("grid1Cnt")
	@BxmOmm_Field(length=3, decimal=0, description="그리드1건수 ", align="right", fill="0")
	private Integer grid1Cnt= 0;
	
	
	/**
	 * 
	 */
	@ApiModelProperty(
		name = "dis1Grid"
		, dataType = "[Lcom.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokMbhInfRgsScssGrid1_IDT;"
		)
	@XmlElement(name="item")
	@XmlElementWrapper()
	@JsonProperty("dis1Grid")
	@BxmOmm_Field(length=0, decimal=0, align="left", fill="", arrayReference="1")
	private List<MPBMetPbokMbhInfRgsScssGrid1_IDT> dis1Grid= new ArrayList<>();
	
	/**
	 * 그리드2건수
	 */
	@ApiModelProperty(
		name = "grid2Cnt"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("grid2Cnt")
	@BxmOmm_Field(length=3, decimal=0, description="그리드2건수", align="right", fill="0")
	private Integer grid2Cnt= 0;
	
	
	/**
	 * 모임통장.회원.정보.그리드2.등록.탈퇴.입력.IO
	 */
	@ApiModelProperty(
		name = "dis2Grid"
		, dataType = "[Lcom.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokMbhInfRgsScssGrid2_IDT;"
		)
	@XmlElement(name="item")
	@XmlElementWrapper()
	@JsonProperty("dis2Grid")
	@BxmOmm_Field(length=0, decimal=0, description="모임통장.회원.정보.그리드2.등록.탈퇴.입력.IO", align="left", fill="", arrayReference="1")
	private List<MPBMetPbokMbhInfRgsScssGrid2_IDT> dis2Grid= new ArrayList<>();
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_trnDis= false;
	protected final boolean isSet_trnDis(){
		return this.isSet_trnDis;
	}
	private void setIsSet_trnDis(boolean value){
		this.isSet_trnDis= value;
	}
	/**
	 * 거래구분
	 */
	@XmlTransient
	public String getTrnDis(){
		return this.trnDis;
	}
	
	/**
	 * 거래구분
	 * 
	 * @param trnDis 거래구분
	 */
	public void setTrnDis(String trnDis){
		this.trnDis= trnDis;
		this.setIsSet_trnDis(true);
	}
	
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
	private boolean isSet_grid1Cnt= false;
	protected final boolean isSet_grid1Cnt(){
		return this.isSet_grid1Cnt;
	}
	private void setIsSet_grid1Cnt(boolean value){
		this.isSet_grid1Cnt= value;
	}
	/**
	 * 그리드1건수 
	 */
	@XmlTransient
	public Integer getGrid1Cnt(){
		return this.grid1Cnt;
	}
	
	/**
	 * 그리드1건수 
	 * 
	 * @param grid1Cnt 그리드1건수 
	 */
	public void setGrid1Cnt(Integer grid1Cnt){
		this.grid1Cnt= grid1Cnt;
		this.setIsSet_grid1Cnt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dis1Grid= false;
	protected final boolean isSet_dis1Grid(){
		return this.isSet_dis1Grid;
	}
	private void setIsSet_dis1Grid(boolean value){
		this.isSet_dis1Grid= value;
	}
	/**
	 * 
	 */
	@XmlTransient
	public List<MPBMetPbokMbhInfRgsScssGrid1_IDT> getDis1Grid(){
		return dis1Grid;
	}
	
	/**
	 * 
	 * 
	 * @param dis1Grid 
	 */
	@JsonSetter("dis1Grid")
	public void setDis1Grid(List<MPBMetPbokMbhInfRgsScssGrid1_IDT> dis1Grid){
		this.dis1Grid= dis1Grid;
		this.setIsSet_dis1Grid(true);
	}
	
	public void setDis1Grid(MPBMetPbokMbhInfRgsScssGrid1_IDT... items){
		List<MPBMetPbokMbhInfRgsScssGrid1_IDT> _items= new ArrayList<>();
		if ( items!= null && items.length> 0){
			for( MPBMetPbokMbhInfRgsScssGrid1_IDT item: items ){
				_items.add(item);
			}
		}
		this.setDis1Grid(_items);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_grid2Cnt= false;
	protected final boolean isSet_grid2Cnt(){
		return this.isSet_grid2Cnt;
	}
	private void setIsSet_grid2Cnt(boolean value){
		this.isSet_grid2Cnt= value;
	}
	/**
	 * 그리드2건수
	 */
	@XmlTransient
	public Integer getGrid2Cnt(){
		return this.grid2Cnt;
	}
	
	/**
	 * 그리드2건수
	 * 
	 * @param grid2Cnt 그리드2건수
	 */
	public void setGrid2Cnt(Integer grid2Cnt){
		this.grid2Cnt= grid2Cnt;
		this.setIsSet_grid2Cnt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dis2Grid= false;
	protected final boolean isSet_dis2Grid(){
		return this.isSet_dis2Grid;
	}
	private void setIsSet_dis2Grid(boolean value){
		this.isSet_dis2Grid= value;
	}
	/**
	 * 모임통장.회원.정보.그리드2.등록.탈퇴.입력.IO
	 */
	@XmlTransient
	public List<MPBMetPbokMbhInfRgsScssGrid2_IDT> getDis2Grid(){
		return dis2Grid;
	}
	
	/**
	 * 모임통장.회원.정보.그리드2.등록.탈퇴.입력.IO
	 * 
	 * @param dis2Grid 모임통장.회원.정보.그리드2.등록.탈퇴.입력.IO
	 */
	@JsonSetter("dis2Grid")
	public void setDis2Grid(List<MPBMetPbokMbhInfRgsScssGrid2_IDT> dis2Grid){
		this.dis2Grid= dis2Grid;
		this.setIsSet_dis2Grid(true);
	}
	
	public void setDis2Grid(MPBMetPbokMbhInfRgsScssGrid2_IDT... items){
		List<MPBMetPbokMbhInfRgsScssGrid2_IDT> _items= new ArrayList<>();
		if ( items!= null && items.length> 0){
			for( MPBMetPbokMbhInfRgsScssGrid2_IDT item: items ){
				_items.add(item);
			}
		}
		this.setDis2Grid(_items);
	}
				
	@Override
	public MPBMetPbokMbhMngInsertMetPbokMbhInf_IDT clone(){
		try{
			MPBMetPbokMbhMngInsertMetPbokMbhInf_IDT object= (MPBMetPbokMbhMngInsertMetPbokMbhInf_IDT)super.clone();
			if ( this.dis1Grid== null ) object.dis1Grid= null;
			else{
				List<MPBMetPbokMbhInfRgsScssGrid1_IDT> clonedList= new ArrayList<>(this.dis1Grid.size());
				for( MPBMetPbokMbhInfRgsScssGrid1_IDT item : dis1Grid ){
					clonedList.add((MPBMetPbokMbhInfRgsScssGrid1_IDT)item.clone());
				}
				object.dis1Grid= clonedList;
			}
			if ( this.dis2Grid== null ) object.dis2Grid= null;
			else{
				List<MPBMetPbokMbhInfRgsScssGrid2_IDT> clonedList= new ArrayList<>(this.dis2Grid.size());
				for( MPBMetPbokMbhInfRgsScssGrid2_IDT item : dis2Grid ){
					clonedList.add((MPBMetPbokMbhInfRgsScssGrid2_IDT)item.clone());
				}
				object.dis2Grid= clonedList;
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
		
		result= prime * result + ((this.trnDis==null)?0:this.trnDis.hashCode());
		result= prime * result + ((this.metMngNo==null)?0:this.metMngNo.hashCode());
		result= prime * result + ((this.grid1Cnt==null)?0:this.grid1Cnt.hashCode());
		result= prime * result + ((this.dis1Grid==null)?0:this.dis1Grid.hashCode());
		result= prime * result + ((this.grid2Cnt==null)?0:this.grid2Cnt.hashCode());
		result= prime * result + ((this.dis2Grid==null)?0:this.dis2Grid.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MPBMetPbokMbhMngInsertMetPbokMbhInf_IDT other= (MPBMetPbokMbhMngInsertMetPbokMbhInf_IDT)obj;
		{
			Object _trnDis= getTrnDis();
			Object __trnDis= other.getTrnDis();
			if ( _trnDis== null ) { if ( __trnDis!= null ) return false; }
			else if ( !_trnDis.equals(__trnDis) ) return false;
		}
		{
			Object _metMngNo= getMetMngNo();
			Object __metMngNo= other.getMetMngNo();
			if ( _metMngNo== null ) { if ( __metMngNo!= null ) return false; }
			else if ( !_metMngNo.equals(__metMngNo) ) return false;
		}
		{
			Object _grid1Cnt= getGrid1Cnt();
			Object __grid1Cnt= other.getGrid1Cnt();
			if ( _grid1Cnt== null ) { if ( __grid1Cnt!= null ) return false; }
			else if ( !_grid1Cnt.equals(__grid1Cnt) ) return false;
		}
		{
			Object _dis1Grid= getDis1Grid();
			Object __dis1Grid= other.getDis1Grid();
			if ( _dis1Grid== null ) { if ( __dis1Grid!= null ) return false; }
			else if ( !_dis1Grid.equals(__dis1Grid) ) return false;
		}
		{
			Object _grid2Cnt= getGrid2Cnt();
			Object __grid2Cnt= other.getGrid2Cnt();
			if ( _grid2Cnt== null ) { if ( __grid2Cnt!= null ) return false; }
			else if ( !_grid2Cnt.equals(__grid2Cnt) ) return false;
		}
		{
			Object _dis2Grid= getDis2Grid();
			Object __dis2Grid= other.getDis2Grid();
			if ( _dis2Grid== null ) { if ( __dis2Grid!= null ) return false; }
			else if ( !_dis2Grid.equals(__dis2Grid) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MPBMetPbokMbhMngInsertMetPbokMbhInf_IDT.class.getName()).append(":\n");
		sb.append("\ttrnDis: ");
		sb.append(trnDis==null?"null":getTrnDis());
		sb.append("\n");
		sb.append("\tmetMngNo: ");
		sb.append(metMngNo==null?"null":getMetMngNo());
		sb.append("\n");
		sb.append("\tgrid1Cnt: ");
		sb.append(grid1Cnt==null?"null":getGrid1Cnt());
		sb.append("\n");
		sb.append("\tdis1Grid: ");
		if ( dis1Grid== null ) sb.append("null");
		else{
			sb.append("array count : ");
			sb.append(dis1Grid.size());
			sb.append("(items)\n");
	
			int max= (10<dis1Grid.size())?10:dis1Grid.size();
	
			for ( int i= 0; i < max; ++i ){
				sb.append("\tdis1Grid[");
				sb.append(i);
				sb.append("] : ");
				sb.append(dis1Grid.get(i));
				sb.append("\n");
			}
	
			if ( max < dis1Grid.size() ){
				sb.append("\tdis1Grid[.] : ").append("more ").append((dis1Grid.size()-max)).append(" items").append("\n");
			}
		}
		sb.append("\tgrid2Cnt: ");
		sb.append(grid2Cnt==null?"null":getGrid2Cnt());
		sb.append("\n");
		sb.append("\tdis2Grid: ");
		if ( dis2Grid== null ) sb.append("null");
		else{
			sb.append("array count : ");
			sb.append(dis2Grid.size());
			sb.append("(items)\n");
	
			int max= (10<dis2Grid.size())?10:dis2Grid.size();
	
			for ( int i= 0; i < max; ++i ){
				sb.append("\tdis2Grid[");
				sb.append(i);
				sb.append("] : ");
				sb.append(dis2Grid.get(i));
				sb.append("\n");
			}
	
			if ( max < dis2Grid.size() ){
				sb.append("\tdis2Grid[.] : ").append("more ").append((dis2Grid.size()-max)).append(" items").append("\n");
			}
		}
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 1; /* trnDis */
		messageLen+= 9; /* metMngNo */
		messageLen+= 3; /* grid1Cnt */
		{/*dis1Grid*/
			int size=1;
			int count= dis1Grid == null ? 0 : dis1Grid.size();
			int min= size > count?count:size;
			MPBMetPbokMbhInfRgsScssGrid1_IDT emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					MPBMetPbokMbhInfRgsScssGrid1_IDT element= dis1Grid.get(i);
					if ( element != null && !(element instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= element==null?0:( (Predictable)element).predictMessageLength();
				}else{
					if ( emptyElement== null ) emptyElement= new com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokMbhInfRgsScssGrid1_IDT();
					if ( !(emptyElement instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= ( (Predictable)emptyElement).predictMessageLength();
				}
			}
		}
		messageLen+= 3; /* grid2Cnt */
		{/*dis2Grid*/
			int size=1;
			int count= dis2Grid == null ? 0 : dis2Grid.size();
			int min= size > count?count:size;
			MPBMetPbokMbhInfRgsScssGrid2_IDT emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					MPBMetPbokMbhInfRgsScssGrid2_IDT element= dis2Grid.get(i);
					if ( element != null && !(element instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= element==null?0:( (Predictable)element).predictMessageLength();
				}else{
					if ( emptyElement== null ) emptyElement= new com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokMbhInfRgsScssGrid2_IDT();
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
	
		list.add("trnDis");
		list.add("metMngNo");
		list.add("grid1Cnt");
		list.add("dis1Grid");
		list.add("grid2Cnt");
		list.add("dis2Grid");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("trnDis", get("trnDis"));
		map.put("metMngNo", get("metMngNo"));
		map.put("grid1Cnt", get("grid1Cnt"));
		map.put("dis1Grid", get("dis1Grid"));
		map.put("grid2Cnt", get("grid2Cnt"));
		map.put("dis2Grid", get("dis2Grid"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -865358658:/* trnDis */
			return getTrnDis();
		case -468172085:/* metMngNo */
			return getMetMngNo();
		case 316983230:/* grid1Cnt */
			return getGrid1Cnt();
		case 225813321:/* dis1Grid */
			return getDis1Grid();
		case 317013021:/* grid2Cnt */
			return getGrid2Cnt();
		case 226736842:/* dis2Grid */
			return getDis2Grid();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -865358658:/* trnDis */
			setTrnDis((String)value);
			break;
		case -468172085:/* metMngNo */
			setMetMngNo((String)value);
			break;
		case 316983230:/* grid1Cnt */
			setGrid1Cnt((Integer)value);
			break;
		case 225813321:/* dis1Grid */
			setDis1Grid((List<MPBMetPbokMbhInfRgsScssGrid1_IDT>)value);
			break;
		case 317013021:/* grid2Cnt */
			setGrid2Cnt((Integer)value);
			break;
		case 226736842:/* dis2Grid */
			setDis2Grid((List<MPBMetPbokMbhInfRgsScssGrid2_IDT>)value);
			break;
		default:
			break;
		}
	}
	
}
