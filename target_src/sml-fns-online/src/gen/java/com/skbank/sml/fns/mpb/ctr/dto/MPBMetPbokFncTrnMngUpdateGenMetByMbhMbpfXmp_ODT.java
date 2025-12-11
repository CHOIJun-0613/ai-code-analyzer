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
import com.skbank.sml.fns.mpb.dto.MPBByMbhMbpfXmpGrid_DTO;
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
	"metChgDscd", "metChgDscdNm", "metMngNo", "cnt", "grid"
}, name="MPBMetPbokFncTrnMngUpdateGenMetByMbhMbpfXmp_ODT")
@XmlRootElement(name="MPBMetPbokFncTrnMngUpdateGenMetByMbhMbpfXmp_ODT")
@BxmCategory(logicalName="회원별.회비.면제.출력.IO", description="") 
public class MPBMetPbokFncTrnMngUpdateGenMetByMbhMbpfXmp_ODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 1742748532L;
	
	
	
	/**
	 * 모임변경구분코드
	 */
	@ApiModelProperty(
		name = "metChgDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metChgDscd")
	@BxmOmm_Field(length=2, decimal=0, description="모임변경구분코드", align="left", fill="")
	private String metChgDscd= "";
	
	
	/**
	 * 모임변경구분코드명
	 */
	@ApiModelProperty(
		name = "metChgDscdNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metChgDscdNm")
	@BxmOmm_Field(length=30, decimal=0, description="모임변경구분코드명", align="left", fill="")
	private String metChgDscdNm= "";
	
	
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
	 * 건수
	 */
	@ApiModelProperty(
		name = "cnt"
		, dataType = "java.math.BigInteger"
		)
	@JsonProperty("cnt")
	@BxmOmm_Field(length=3, decimal=0, description="건수", align="right", fill="0")
	private Integer cnt= 0;
	
	
	/**
	 * 회원별.회비.면제.공통.Sub.IO
	 */
	@ApiModelProperty(
		name = "grid"
		, dataType = "[Lcom.skbank.sml.fns.mpb.dto.MPBByMbhMbpfXmpGrid_DTO;"
		)
	@XmlElement(name="item")
	@XmlElementWrapper()
	@JsonProperty("grid")
	@BxmOmm_Field(length=0, decimal=0, description="회원별.회비.면제.공통.Sub.IO", align="left", fill="", arrayReference="cnt")
	private List<MPBByMbhMbpfXmpGrid_DTO> grid= new ArrayList<>();
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metChgDscd= false;
	protected final boolean isSet_metChgDscd(){
		return this.isSet_metChgDscd;
	}
	private void setIsSet_metChgDscd(boolean value){
		this.isSet_metChgDscd= value;
	}
	/**
	 * 모임변경구분코드
	 */
	@XmlTransient
	public String getMetChgDscd(){
		return this.metChgDscd;
	}
	
	/**
	 * 모임변경구분코드
	 * 
	 * @param metChgDscd 모임변경구분코드
	 */
	public void setMetChgDscd(String metChgDscd){
		this.metChgDscd= metChgDscd;
		this.setIsSet_metChgDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metChgDscdNm= false;
	protected final boolean isSet_metChgDscdNm(){
		return this.isSet_metChgDscdNm;
	}
	private void setIsSet_metChgDscdNm(boolean value){
		this.isSet_metChgDscdNm= value;
	}
	/**
	 * 모임변경구분코드명
	 */
	@XmlTransient
	public String getMetChgDscdNm(){
		return this.metChgDscdNm;
	}
	
	/**
	 * 모임변경구분코드명
	 * 
	 * @param metChgDscdNm 모임변경구분코드명
	 */
	public void setMetChgDscdNm(String metChgDscdNm){
		this.metChgDscdNm= metChgDscdNm;
		this.setIsSet_metChgDscdNm(true);
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
	private boolean isSet_cnt= false;
	protected final boolean isSet_cnt(){
		return this.isSet_cnt;
	}
	private void setIsSet_cnt(boolean value){
		this.isSet_cnt= value;
	}
	/**
	 * 건수
	 */
	@XmlElement
	public Integer getCnt(){
		if ( isSet_cnt )	return cnt;
		else{
			if ( grid == null || grid.size() == 0 ) return 0;
			else return grid.size();
		}
	}
	
	/**
	 * 건수
	 * 
	 * @param cnt 건수
	 */
	public void setCnt(Integer cnt){
		this.cnt= cnt;
		this.setIsSet_cnt(true);
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
	 * 회원별.회비.면제.공통.Sub.IO
	 */
	@XmlTransient
	public List<MPBByMbhMbpfXmpGrid_DTO> getGrid(){
		return grid;
	}
	
	/**
	 * 회원별.회비.면제.공통.Sub.IO
	 * 
	 * @param grid 회원별.회비.면제.공통.Sub.IO
	 */
	@JsonSetter("grid")
	public void setGrid(List<MPBByMbhMbpfXmpGrid_DTO> grid){
		this.grid= grid;
		this.setIsSet_grid(true);
	}
	
	public void setGrid(MPBByMbhMbpfXmpGrid_DTO... items){
		List<MPBByMbhMbpfXmpGrid_DTO> _items= new ArrayList<>();
		if ( items!= null && items.length> 0){
			for( MPBByMbhMbpfXmpGrid_DTO item: items ){
				_items.add(item);
			}
		}
		this.setGrid(_items);
	}
				
	@Override
	public MPBMetPbokFncTrnMngUpdateGenMetByMbhMbpfXmp_ODT clone(){
		try{
			MPBMetPbokFncTrnMngUpdateGenMetByMbhMbpfXmp_ODT object= (MPBMetPbokFncTrnMngUpdateGenMetByMbhMbpfXmp_ODT)super.clone();
			if ( this.grid== null ) object.grid= null;
			else{
				List<MPBByMbhMbpfXmpGrid_DTO> clonedList= new ArrayList<>(this.grid.size());
				for( MPBByMbhMbpfXmpGrid_DTO item : grid ){
					clonedList.add((MPBByMbhMbpfXmpGrid_DTO)item.clone());
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
		
		result= prime * result + ((this.metChgDscd==null)?0:this.metChgDscd.hashCode());
		result= prime * result + ((this.metChgDscdNm==null)?0:this.metChgDscdNm.hashCode());
		result= prime * result + ((this.metMngNo==null)?0:this.metMngNo.hashCode());
		result= prime * result + ((this.cnt==null)?0:this.cnt.hashCode());
		result= prime * result + ((this.grid==null)?0:this.grid.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MPBMetPbokFncTrnMngUpdateGenMetByMbhMbpfXmp_ODT other= (MPBMetPbokFncTrnMngUpdateGenMetByMbhMbpfXmp_ODT)obj;
		{
			Object _metChgDscd= getMetChgDscd();
			Object __metChgDscd= other.getMetChgDscd();
			if ( _metChgDscd== null ) { if ( __metChgDscd!= null ) return false; }
			else if ( !_metChgDscd.equals(__metChgDscd) ) return false;
		}
		{
			Object _metChgDscdNm= getMetChgDscdNm();
			Object __metChgDscdNm= other.getMetChgDscdNm();
			if ( _metChgDscdNm== null ) { if ( __metChgDscdNm!= null ) return false; }
			else if ( !_metChgDscdNm.equals(__metChgDscdNm) ) return false;
		}
		{
			Object _metMngNo= getMetMngNo();
			Object __metMngNo= other.getMetMngNo();
			if ( _metMngNo== null ) { if ( __metMngNo!= null ) return false; }
			else if ( !_metMngNo.equals(__metMngNo) ) return false;
		}
		{
			Object _cnt= getCnt();
			Object __cnt= other.getCnt();
			if ( _cnt== null ) { if ( __cnt!= null ) return false; }
			else if ( !_cnt.equals(__cnt) ) return false;
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
	
		sb.append("\n[").append(MPBMetPbokFncTrnMngUpdateGenMetByMbhMbpfXmp_ODT.class.getName()).append(":\n");
		sb.append("\tmetChgDscd: ");
		sb.append(metChgDscd==null?"null":getMetChgDscd());
		sb.append("\n");
		sb.append("\tmetChgDscdNm: ");
		sb.append(metChgDscdNm==null?"null":getMetChgDscdNm());
		sb.append("\n");
		sb.append("\tmetMngNo: ");
		sb.append(metMngNo==null?"null":getMetMngNo());
		sb.append("\n");
		sb.append("\tcnt: ");
		sb.append(cnt==null?"null":getCnt());
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
		
		messageLen+= 2; /* metChgDscd */
		messageLen+= 30; /* metChgDscdNm */
		messageLen+= 9; /* metMngNo */
		messageLen+= 3; /* cnt */
		{/*grid*/
			int size=getCnt();
			int count= grid == null ? 0 : grid.size();
			int min= size > count?count:size;
			MPBByMbhMbpfXmpGrid_DTO emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					MPBByMbhMbpfXmpGrid_DTO element= grid.get(i);
					if ( element != null && !(element instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= element==null?0:( (Predictable)element).predictMessageLength();
				}else{
					if ( emptyElement== null ) emptyElement= new com.skbank.sml.fns.mpb.dto.MPBByMbhMbpfXmpGrid_DTO();
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
	
		list.add("metChgDscd");
		list.add("metChgDscdNm");
		list.add("metMngNo");
		list.add("cnt");
		list.add("grid");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("metChgDscd", get("metChgDscd"));
		map.put("metChgDscdNm", get("metChgDscdNm"));
		map.put("metMngNo", get("metMngNo"));
		map.put("cnt", get("cnt"));
		map.put("grid", get("grid"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 601024374:/* metChgDscd */
			return getMetChgDscd();
		case 2058808277:/* metChgDscdNm */
			return getMetChgDscdNm();
		case -468172085:/* metMngNo */
			return getMetMngNo();
		case 98665:/* cnt */
			return getCnt();
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
		case 601024374:/* metChgDscd */
			setMetChgDscd((String)value);
			break;
		case 2058808277:/* metChgDscdNm */
			setMetChgDscdNm((String)value);
			break;
		case -468172085:/* metMngNo */
			setMetMngNo((String)value);
			break;
		case 98665:/* cnt */
			setCnt((Integer)value);
			break;
		case 3181382:/* grid */
			setGrid((List<MPBByMbhMbpfXmpGrid_DTO>)value);
			break;
		default:
			break;
		}
	}
	
}
