/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.inb.ctr.dto;

import bxm.common.annotaion.BxmCategory;
import bxm.omm.annotation.BxmOmm_Field;
import bxm.omm.exception.CloneFailedException;
import bxm.omm.predict.FieldInfo;
import bxm.omm.predict.Predictable;
import bxm.omm.root.IOmmObject;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.skbank.sml.fns.inb.dto.INBSmsRawTrnTxtNtcGrid1_DTO;
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
 * SMS입출금.수수료목록.조회ODT
 */
@XmlType(propOrder={
	"cnt", "iNBSmsRawTrnTxtNtcGrid1_DTO"
}, name="INBSmsRawNtcSrvcSelectSmsRawFeeList_ODT")
@XmlRootElement(name="INBSmsRawNtcSrvcSelectSmsRawFeeList_ODT")
@BxmCategory(logicalName="SMS입출금.수수료목록.조회ODT", description="SMS입출금.수수료목록.조회ODT") 
public class INBSmsRawNtcSrvcSelectSmsRawFeeList_ODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -2141567713L;
	
	
	
	/**
	 * 건수
	 */
	@ApiModelProperty(
		name = "cnt"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("cnt")
	@BxmOmm_Field(length=5, decimal=0, description="건수", align="right", fill="")
	private Integer cnt= 0;
	
	
	/**
	 * SMS입출금.거래내용.통지.GRID1.공통.IO
	 */
	@ApiModelProperty(
		name = "iNBSmsRawTrnTxtNtcGrid1_DTO"
		, dataType = "[Lcom.skbank.sml.fns.inb.dto.INBSmsRawTrnTxtNtcGrid1_DTO;"
		)
	@XmlElement(name="item")
	@XmlElementWrapper()
	@JsonProperty("iNBSmsRawTrnTxtNtcGrid1_DTO")
	@BxmOmm_Field(length=0, decimal=0, description="SMS입출금.거래내용.통지.GRID1.공통.IO", align="left", fill="", arrayReference="1")
	private List<INBSmsRawTrnTxtNtcGrid1_DTO> iNBSmsRawTrnTxtNtcGrid1_DTO= new ArrayList<>();
	
	
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
	@XmlTransient
	public Integer getCnt(){
		return this.cnt;
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
	private boolean isSet_iNBSmsRawTrnTxtNtcGrid1_DTO= false;
	protected final boolean isSet_iNBSmsRawTrnTxtNtcGrid1_DTO(){
		return this.isSet_iNBSmsRawTrnTxtNtcGrid1_DTO;
	}
	private void setIsSet_iNBSmsRawTrnTxtNtcGrid1_DTO(boolean value){
		this.isSet_iNBSmsRawTrnTxtNtcGrid1_DTO= value;
	}
	/**
	 * SMS입출금.거래내용.통지.GRID1.공통.IO
	 */
	@XmlTransient
	public List<INBSmsRawTrnTxtNtcGrid1_DTO> getiNBSmsRawTrnTxtNtcGrid1_DTO(){
		return iNBSmsRawTrnTxtNtcGrid1_DTO;
	}
	
	/**
	 * SMS입출금.거래내용.통지.GRID1.공통.IO
	 * 
	 * @param iNBSmsRawTrnTxtNtcGrid1_DTO SMS입출금.거래내용.통지.GRID1.공통.IO
	 */
	@JsonSetter("iNBSmsRawTrnTxtNtcGrid1_DTO")
	public void setiNBSmsRawTrnTxtNtcGrid1_DTO(List<INBSmsRawTrnTxtNtcGrid1_DTO> iNBSmsRawTrnTxtNtcGrid1_DTO){
		this.iNBSmsRawTrnTxtNtcGrid1_DTO= iNBSmsRawTrnTxtNtcGrid1_DTO;
		this.setIsSet_iNBSmsRawTrnTxtNtcGrid1_DTO(true);
	}
	
	public void setiNBSmsRawTrnTxtNtcGrid1_DTO(INBSmsRawTrnTxtNtcGrid1_DTO... items){
		List<INBSmsRawTrnTxtNtcGrid1_DTO> _items= new ArrayList<>();
		if ( items!= null && items.length> 0){
			for( INBSmsRawTrnTxtNtcGrid1_DTO item: items ){
				_items.add(item);
			}
		}
		this.setiNBSmsRawTrnTxtNtcGrid1_DTO(_items);
	}
				
	@Override
	public INBSmsRawNtcSrvcSelectSmsRawFeeList_ODT clone(){
		try{
			INBSmsRawNtcSrvcSelectSmsRawFeeList_ODT object= (INBSmsRawNtcSrvcSelectSmsRawFeeList_ODT)super.clone();
			if ( this.iNBSmsRawTrnTxtNtcGrid1_DTO== null ) object.iNBSmsRawTrnTxtNtcGrid1_DTO= null;
			else{
				List<INBSmsRawTrnTxtNtcGrid1_DTO> clonedList= new ArrayList<>(this.iNBSmsRawTrnTxtNtcGrid1_DTO.size());
				for( INBSmsRawTrnTxtNtcGrid1_DTO item : iNBSmsRawTrnTxtNtcGrid1_DTO ){
					clonedList.add((INBSmsRawTrnTxtNtcGrid1_DTO)item.clone());
				}
				object.iNBSmsRawTrnTxtNtcGrid1_DTO= clonedList;
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
		
		result= prime * result + ((this.cnt==null)?0:this.cnt.hashCode());
		result= prime * result + ((this.iNBSmsRawTrnTxtNtcGrid1_DTO==null)?0:this.iNBSmsRawTrnTxtNtcGrid1_DTO.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final INBSmsRawNtcSrvcSelectSmsRawFeeList_ODT other= (INBSmsRawNtcSrvcSelectSmsRawFeeList_ODT)obj;
		{
			Object _cnt= getCnt();
			Object __cnt= other.getCnt();
			if ( _cnt== null ) { if ( __cnt!= null ) return false; }
			else if ( !_cnt.equals(__cnt) ) return false;
		}
		{
			Object _iNBSmsRawTrnTxtNtcGrid1_DTO= getiNBSmsRawTrnTxtNtcGrid1_DTO();
			Object __iNBSmsRawTrnTxtNtcGrid1_DTO= other.getiNBSmsRawTrnTxtNtcGrid1_DTO();
			if ( _iNBSmsRawTrnTxtNtcGrid1_DTO== null ) { if ( __iNBSmsRawTrnTxtNtcGrid1_DTO!= null ) return false; }
			else if ( !_iNBSmsRawTrnTxtNtcGrid1_DTO.equals(__iNBSmsRawTrnTxtNtcGrid1_DTO) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(INBSmsRawNtcSrvcSelectSmsRawFeeList_ODT.class.getName()).append(":\n");
		sb.append("\tcnt: ");
		sb.append(cnt==null?"null":getCnt());
		sb.append("\n");
		sb.append("\tiNBSmsRawTrnTxtNtcGrid1_DTO: ");
		if ( iNBSmsRawTrnTxtNtcGrid1_DTO== null ) sb.append("null");
		else{
			sb.append("array count : ");
			sb.append(iNBSmsRawTrnTxtNtcGrid1_DTO.size());
			sb.append("(items)\n");
	
			int max= (10<iNBSmsRawTrnTxtNtcGrid1_DTO.size())?10:iNBSmsRawTrnTxtNtcGrid1_DTO.size();
	
			for ( int i= 0; i < max; ++i ){
				sb.append("\tiNBSmsRawTrnTxtNtcGrid1_DTO[");
				sb.append(i);
				sb.append("] : ");
				sb.append(iNBSmsRawTrnTxtNtcGrid1_DTO.get(i));
				sb.append("\n");
			}
	
			if ( max < iNBSmsRawTrnTxtNtcGrid1_DTO.size() ){
				sb.append("\tiNBSmsRawTrnTxtNtcGrid1_DTO[.] : ").append("more ").append((iNBSmsRawTrnTxtNtcGrid1_DTO.size()-max)).append(" items").append("\n");
			}
		}
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 5; /* cnt */
		{/*iNBSmsRawTrnTxtNtcGrid1_DTO*/
			int size=1;
			int count= iNBSmsRawTrnTxtNtcGrid1_DTO == null ? 0 : iNBSmsRawTrnTxtNtcGrid1_DTO.size();
			int min= size > count?count:size;
			INBSmsRawTrnTxtNtcGrid1_DTO emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					INBSmsRawTrnTxtNtcGrid1_DTO element= iNBSmsRawTrnTxtNtcGrid1_DTO.get(i);
					if ( element != null && !(element instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= element==null?0:( (Predictable)element).predictMessageLength();
				}else{
					if ( emptyElement== null ) emptyElement= new com.skbank.sml.fns.inb.dto.INBSmsRawTrnTxtNtcGrid1_DTO();
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
	
		list.add("cnt");
		list.add("iNBSmsRawTrnTxtNtcGrid1_DTO");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("cnt", get("cnt"));
		map.put("iNBSmsRawTrnTxtNtcGrid1_DTO", get("iNBSmsRawTrnTxtNtcGrid1_DTO"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 98665:/* cnt */
			return getCnt();
		case 419497082:/* iNBSmsRawTrnTxtNtcGrid1_DTO */
			return getiNBSmsRawTrnTxtNtcGrid1_DTO();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 98665:/* cnt */
			setCnt((Integer)value);
			break;
		case 419497082:/* iNBSmsRawTrnTxtNtcGrid1_DTO */
			setiNBSmsRawTrnTxtNtcGrid1_DTO((List<INBSmsRawTrnTxtNtcGrid1_DTO>)value);
			break;
		default:
			break;
		}
	}
	
}
