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
import com.skbank.sml.fns.inb.dto.INBActList_DTO;
import com.skbank.sml.fns.inb.dto.INBCusInfInq_DTO;
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
import option.WooriOmmOption;

/**
 * SMS입출금.가입정보.화면.컨트롤러.출력.IO
 */
@WooriOmmOption(propOption=true)
@XmlType(propOrder={
	"iNBCusInfInq_DTO", "iNBActList_DTO", "iNBSmsRawTrnTxtNtcGrid1_DTO"
}, name="INBSmsRawNtcSrvcCallSmsRawJnngInfScrn_ODT")
@XmlRootElement(name="INBSmsRawNtcSrvcCallSmsRawJnngInfScrn_ODT")
@BxmCategory(logicalName="SMS입출금.가입정보.화면.컨트롤러.출력.IO", description="SMS입출금.가입정보.화면.컨트롤러.출력.IO") 
public class INBSmsRawNtcSrvcCallSmsRawJnngInfScrn_ODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 1972542729L;
	
	
	
	/**
	 * 고객정보조회DTO
	 */
	@ApiModelProperty(
		name = "iNBCusInfInq_DTO"
		, dataType = "com.skbank.sml.fns.inb.dto.INBCusInfInq_DTO"
		)
	@XmlElement
	@JsonProperty("iNBCusInfInq_DTO")
	@BxmOmm_Field(length=0, decimal=0, description="고객정보조회DTO", align="left", fill="")
	private INBCusInfInq_DTO iNBCusInfInq_DTO= null;
	
	
	/**
	 * 계좌목록DTO
	 */
	@ApiModelProperty(
		name = "iNBActList_DTO"
		, dataType = "[Lcom.skbank.sml.fns.inb.dto.INBActList_DTO;"
		)
	@XmlElement(name="item")
	@XmlElementWrapper()
	@JsonProperty("iNBActList_DTO")
	@BxmOmm_Field(length=0, decimal=0, description="계좌목록DTO", align="left", fill="", arrayReference="1", etcProperties={"PROP_OPTION_DSCD=L999"})
	private List<INBActList_DTO> iNBActList_DTO= new ArrayList<>();
	
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
	private boolean isSet_iNBCusInfInq_DTO= false;
	protected final boolean isSet_iNBCusInfInq_DTO(){
		return this.isSet_iNBCusInfInq_DTO;
	}
	private void setIsSet_iNBCusInfInq_DTO(boolean value){
		this.isSet_iNBCusInfInq_DTO= value;
	}
	/**
	 * 고객정보조회DTO
	 */
	@XmlTransient
	public INBCusInfInq_DTO getiNBCusInfInq_DTO(){
		return this.iNBCusInfInq_DTO;
	}
	
	/**
	 * 고객정보조회DTO
	 * 
	 * @param iNBCusInfInq_DTO 고객정보조회DTO
	 */
	public void setiNBCusInfInq_DTO(INBCusInfInq_DTO iNBCusInfInq_DTO){
		this.iNBCusInfInq_DTO= iNBCusInfInq_DTO;
		this.setIsSet_iNBCusInfInq_DTO(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_iNBActList_DTO= false;
	protected final boolean isSet_iNBActList_DTO(){
		return this.isSet_iNBActList_DTO;
	}
	private void setIsSet_iNBActList_DTO(boolean value){
		this.isSet_iNBActList_DTO= value;
	}
	/**
	 * 계좌목록DTO
	 */
	@XmlTransient
	public List<INBActList_DTO> getiNBActList_DTO(){
		return iNBActList_DTO;
	}
	
	/**
	 * 계좌목록DTO
	 * 
	 * @param iNBActList_DTO 계좌목록DTO
	 */
	@JsonSetter("iNBActList_DTO")
	public void setiNBActList_DTO(List<INBActList_DTO> iNBActList_DTO){
		this.iNBActList_DTO= iNBActList_DTO;
		this.setIsSet_iNBActList_DTO(true);
	}
	
	public void setiNBActList_DTO(INBActList_DTO... items){
		List<INBActList_DTO> _items= new ArrayList<>();
		if ( items!= null && items.length> 0){
			for( INBActList_DTO item: items ){
				_items.add(item);
			}
		}
		this.setiNBActList_DTO(_items);
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
	public INBSmsRawNtcSrvcCallSmsRawJnngInfScrn_ODT clone(){
		try{
			INBSmsRawNtcSrvcCallSmsRawJnngInfScrn_ODT object= (INBSmsRawNtcSrvcCallSmsRawJnngInfScrn_ODT)super.clone();
			if ( this.iNBCusInfInq_DTO== null ) object.iNBCusInfInq_DTO= null;
			else object.iNBCusInfInq_DTO= (INBCusInfInq_DTO)this.iNBCusInfInq_DTO.clone();
			if ( this.iNBActList_DTO== null ) object.iNBActList_DTO= null;
			else{
				List<INBActList_DTO> clonedList= new ArrayList<>(this.iNBActList_DTO.size());
				for( INBActList_DTO item : iNBActList_DTO ){
					clonedList.add((INBActList_DTO)item.clone());
				}
				object.iNBActList_DTO= clonedList;
			}
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
		
		result= prime * result + ((this.iNBCusInfInq_DTO==null)?0:this.iNBCusInfInq_DTO.hashCode());
		result= prime * result + ((this.iNBActList_DTO==null)?0:this.iNBActList_DTO.hashCode());
		result= prime * result + ((this.iNBSmsRawTrnTxtNtcGrid1_DTO==null)?0:this.iNBSmsRawTrnTxtNtcGrid1_DTO.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final INBSmsRawNtcSrvcCallSmsRawJnngInfScrn_ODT other= (INBSmsRawNtcSrvcCallSmsRawJnngInfScrn_ODT)obj;
		{
			Object _iNBCusInfInq_DTO= getiNBCusInfInq_DTO();
			Object __iNBCusInfInq_DTO= other.getiNBCusInfInq_DTO();
			if ( _iNBCusInfInq_DTO== null ) { if ( __iNBCusInfInq_DTO!= null ) return false; }
			else if ( !_iNBCusInfInq_DTO.equals(__iNBCusInfInq_DTO) ) return false;
		}
		{
			Object _iNBActList_DTO= getiNBActList_DTO();
			Object __iNBActList_DTO= other.getiNBActList_DTO();
			if ( _iNBActList_DTO== null ) { if ( __iNBActList_DTO!= null ) return false; }
			else if ( !_iNBActList_DTO.equals(__iNBActList_DTO) ) return false;
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
	
		sb.append("\n[").append(INBSmsRawNtcSrvcCallSmsRawJnngInfScrn_ODT.class.getName()).append(":\n");
		sb.append("\tiNBCusInfInq_DTO: ");
		sb.append(iNBCusInfInq_DTO==null?"null":getiNBCusInfInq_DTO());
		sb.append("\n");
		sb.append("\tiNBActList_DTO: ");
		if ( iNBActList_DTO== null ) sb.append("null");
		else{
			sb.append("array count : ");
			sb.append(iNBActList_DTO.size());
			sb.append("(items)\n");
	
			int max= (10<iNBActList_DTO.size())?10:iNBActList_DTO.size();
	
			for ( int i= 0; i < max; ++i ){
				sb.append("\tiNBActList_DTO[");
				sb.append(i);
				sb.append("] : ");
				sb.append(iNBActList_DTO.get(i));
				sb.append("\n");
			}
	
			if ( max < iNBActList_DTO.size() ){
				sb.append("\tiNBActList_DTO[.] : ").append("more ").append((iNBActList_DTO.size()-max)).append(" items").append("\n");
			}
		}
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
		
		if ( iNBCusInfInq_DTO != null && !(iNBCusInfInq_DTO instanceof Predictable) )
			throw new IllegalStateException( "Message length can not be predicted.");
		{
			INBCusInfInq_DTO temp= iNBCusInfInq_DTO;
			if ( temp== null ) temp= new INBCusInfInq_DTO();
			messageLen+= ( (Predictable)temp).predictMessageLength(); /* iNBCusInfInq_DTO */
		}
		{/*iNBActList_DTO*/
			int size=1;
			int count= iNBActList_DTO == null ? 0 : iNBActList_DTO.size();
			int min= size > count?count:size;
			INBActList_DTO emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					INBActList_DTO element= iNBActList_DTO.get(i);
					if ( element != null && !(element instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= element==null?0:( (Predictable)element).predictMessageLength();
				}else{
					if ( emptyElement== null ) emptyElement= new com.skbank.sml.fns.inb.dto.INBActList_DTO();
					if ( !(emptyElement instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= ( (Predictable)emptyElement).predictMessageLength();
				}
			}
		}
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
	
		list.add("iNBCusInfInq_DTO");
		list.add("iNBActList_DTO");
		list.add("iNBSmsRawTrnTxtNtcGrid1_DTO");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("iNBCusInfInq_DTO", get("iNBCusInfInq_DTO"));
		map.put("iNBActList_DTO", get("iNBActList_DTO"));
		map.put("iNBSmsRawTrnTxtNtcGrid1_DTO", get("iNBSmsRawTrnTxtNtcGrid1_DTO"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -1914349553:/* iNBCusInfInq_DTO */
			return getiNBCusInfInq_DTO();
		case 356420915:/* iNBActList_DTO */
			return getiNBActList_DTO();
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
		case -1914349553:/* iNBCusInfInq_DTO */
			setiNBCusInfInq_DTO((INBCusInfInq_DTO)value);
			break;
		case 356420915:/* iNBActList_DTO */
			setiNBActList_DTO((List<INBActList_DTO>)value);
			break;
		case 419497082:/* iNBSmsRawTrnTxtNtcGrid1_DTO */
			setiNBSmsRawTrnTxtNtcGrid1_DTO((List<INBSmsRawTrnTxtNtcGrid1_DTO>)value);
			break;
		default:
			break;
		}
	}
	
}
