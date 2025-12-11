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
import com.skbank.sml.fns.mnp.dto.MNPBscInf_DTO;
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
	"mnyClpMoAcno", "grid"
}, name="MNPMnyPinBscMngUpdateWallSeq_IDT")
@XmlRootElement(name="MNPMnyPinBscMngUpdateWallSeq_IDT")
@BxmCategory(logicalName="머니클립.지갑.순서.수정.컨트롤러.입력.IO", description="") 
public class MNPMnyPinBscMngUpdateWallSeq_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 1200620529L;
	
	
	
	/**
	 * 머니클립모계좌번호
	 */
	@ApiModelProperty(
		name = "mnyClpMoAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("mnyClpMoAcno")
	@BxmOmm_Field(length=13, decimal=0, description="머니클립모계좌번호", align="left", fill="", formatType="masking", format="M141")
	private String mnyClpMoAcno= "";
	
	
	/**
	 * 머니클립기본정보그리드
	 */
	@ApiModelProperty(
		name = "grid"
		, dataType = "[Lcom.skbank.sml.fns.mnp.dto.MNPBscInf_DTO;"
		)
	@XmlElement(name="item")
	@XmlElementWrapper()
	@JsonProperty("grid")
	@BxmOmm_Field(length=0, decimal=0, description="머니클립기본정보그리드", align="left", fill="", arrayReference="1")
	private List<MNPBscInf_DTO> grid= new ArrayList<>();
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mnyClpMoAcno= false;
	protected final boolean isSet_mnyClpMoAcno(){
		return this.isSet_mnyClpMoAcno;
	}
	private void setIsSet_mnyClpMoAcno(boolean value){
		this.isSet_mnyClpMoAcno= value;
	}
	/**
	 * 머니클립모계좌번호
	 */
	@XmlTransient
	public String getMnyClpMoAcno(){
		return this.mnyClpMoAcno;
	}
	
	/**
	 * 머니클립모계좌번호
	 * 
	 * @param mnyClpMoAcno 머니클립모계좌번호
	 */
	public void setMnyClpMoAcno(String mnyClpMoAcno){
		this.mnyClpMoAcno= mnyClpMoAcno;
		this.setIsSet_mnyClpMoAcno(true);
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
	 * 머니클립기본정보그리드
	 */
	@XmlTransient
	public List<MNPBscInf_DTO> getGrid(){
		return grid;
	}
	
	/**
	 * 머니클립기본정보그리드
	 * 
	 * @param grid 머니클립기본정보그리드
	 */
	@JsonSetter("grid")
	public void setGrid(List<MNPBscInf_DTO> grid){
		this.grid= grid;
		this.setIsSet_grid(true);
	}
	
	public void setGrid(MNPBscInf_DTO... items){
		List<MNPBscInf_DTO> _items= new ArrayList<>();
		if ( items!= null && items.length> 0){
			for( MNPBscInf_DTO item: items ){
				_items.add(item);
			}
		}
		this.setGrid(_items);
	}
				
	@Override
	public MNPMnyPinBscMngUpdateWallSeq_IDT clone(){
		try{
			MNPMnyPinBscMngUpdateWallSeq_IDT object= (MNPMnyPinBscMngUpdateWallSeq_IDT)super.clone();
			if ( this.grid== null ) object.grid= null;
			else{
				List<MNPBscInf_DTO> clonedList= new ArrayList<>(this.grid.size());
				for( MNPBscInf_DTO item : grid ){
					clonedList.add((MNPBscInf_DTO)item.clone());
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
		
		result= prime * result + ((this.mnyClpMoAcno==null)?0:this.mnyClpMoAcno.hashCode());
		result= prime * result + ((this.grid==null)?0:this.grid.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MNPMnyPinBscMngUpdateWallSeq_IDT other= (MNPMnyPinBscMngUpdateWallSeq_IDT)obj;
		{
			Object _mnyClpMoAcno= getMnyClpMoAcno();
			Object __mnyClpMoAcno= other.getMnyClpMoAcno();
			if ( _mnyClpMoAcno== null ) { if ( __mnyClpMoAcno!= null ) return false; }
			else if ( !_mnyClpMoAcno.equals(__mnyClpMoAcno) ) return false;
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
	
		sb.append("\n[").append(MNPMnyPinBscMngUpdateWallSeq_IDT.class.getName()).append(":\n");
		sb.append("\tmnyClpMoAcno: ");
		sb.append(mnyClpMoAcno==null?"null":getMnyClpMoAcno().toString().replaceAll(".", "."));
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
		
		messageLen+= 13; /* mnyClpMoAcno */
		{/*grid*/
			int size=1;
			int count= grid == null ? 0 : grid.size();
			int min= size > count?count:size;
			MNPBscInf_DTO emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					MNPBscInf_DTO element= grid.get(i);
					if ( element != null && !(element instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= element==null?0:( (Predictable)element).predictMessageLength();
				}else{
					if ( emptyElement== null ) emptyElement= new com.skbank.sml.fns.mnp.dto.MNPBscInf_DTO();
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
	
		list.add("mnyClpMoAcno");
		list.add("grid");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("mnyClpMoAcno", get("mnyClpMoAcno"));
		map.put("grid", get("grid"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 115408404:/* mnyClpMoAcno */
			return getMnyClpMoAcno();
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
		case 115408404:/* mnyClpMoAcno */
			setMnyClpMoAcno((String)value);
			break;
		case 3181382:/* grid */
			setGrid((List<MNPBscInf_DTO>)value);
			break;
		default:
			break;
		}
	}
	
}
