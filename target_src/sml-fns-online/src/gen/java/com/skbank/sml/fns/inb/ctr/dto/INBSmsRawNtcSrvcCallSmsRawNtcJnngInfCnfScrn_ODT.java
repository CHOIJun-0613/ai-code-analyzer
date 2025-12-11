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
import com.skbank.sml.fns.inb.dto.INBCusInfInq_DTO;
import com.skbank.sml.fns.inb.dto.INBSmsRawTrnTxtNtcGrid1_DTO;
import com.skbank.sml.fns.inb.dto.INBSmsRawTrnTxtNtcGrid2_DTO;
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
 * SMS입출금통지.가입정보.확인.화면ODT
 */
@XmlType(propOrder={
	"cnt", "cnt2", "iNBSmsRawTrnTxtNtcGrid1_DTO", "iNBSmsRawTrnTxtNtcGrid2_DTO", "smsRawNtcSrvcJnngYn", "iNBCusInfInq_DTO"
}, name="INBSmsRawNtcSrvcCallSmsRawNtcJnngInfCnfScrn_ODT")
@XmlRootElement(name="INBSmsRawNtcSrvcCallSmsRawNtcJnngInfCnfScrn_ODT")
@BxmCategory(logicalName="SMS입출금통지.가입정보.확인.화면ODT", description="SMS입출금통지.가입정보.확인.화면ODT") 
public class INBSmsRawNtcSrvcCallSmsRawNtcJnngInfCnfScrn_ODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -1084308743L;
	
	
	
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
	 * 건수_2
	 */
	@ApiModelProperty(
		name = "cnt2"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("cnt2")
	@BxmOmm_Field(length=5, decimal=0, description="건수_2", align="right", fill="")
	private Integer cnt2= 0;
	
	
	/**
	 * SMS입출금.거래내용.통지.GRID1.공통.IO
	 */
	@ApiModelProperty(
		name = "iNBSmsRawTrnTxtNtcGrid1_DTO"
		, dataType = "com.skbank.sml.fns.inb.dto.INBSmsRawTrnTxtNtcGrid1_DTO"
		)
	@XmlElement
	@JsonProperty("iNBSmsRawTrnTxtNtcGrid1_DTO")
	@BxmOmm_Field(length=0, decimal=0, description="SMS입출금.거래내용.통지.GRID1.공통.IO", align="left", fill="")
	private INBSmsRawTrnTxtNtcGrid1_DTO iNBSmsRawTrnTxtNtcGrid1_DTO= null;
	
	
	/**
	 * SMS입출금.거래내용.통지.GRID2.공통.IO
	 */
	@ApiModelProperty(
		name = "iNBSmsRawTrnTxtNtcGrid2_DTO"
		, dataType = "[Lcom.skbank.sml.fns.inb.dto.INBSmsRawTrnTxtNtcGrid2_DTO;"
		)
	@XmlElement(name="item")
	@XmlElementWrapper()
	@JsonProperty("iNBSmsRawTrnTxtNtcGrid2_DTO")
	@BxmOmm_Field(length=0, decimal=0, description="SMS입출금.거래내용.통지.GRID2.공통.IO", align="left", fill="", arrayReference="1")
	private List<INBSmsRawTrnTxtNtcGrid2_DTO> iNBSmsRawTrnTxtNtcGrid2_DTO= new ArrayList<>();
	
	/**
	 * SMS입출금통지서비스가입여부
	 */
	@ApiModelProperty(
		name = "smsRawNtcSrvcJnngYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("smsRawNtcSrvcJnngYn")
	@BxmOmm_Field(length=1, decimal=0, description="SMS입출금통지서비스가입여부", align="left", fill="")
	private String smsRawNtcSrvcJnngYn= "";
	
	
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
	private boolean isSet_cnt2= false;
	protected final boolean isSet_cnt2(){
		return this.isSet_cnt2;
	}
	private void setIsSet_cnt2(boolean value){
		this.isSet_cnt2= value;
	}
	/**
	 * 건수_2
	 */
	@XmlTransient
	public Integer getCnt2(){
		return this.cnt2;
	}
	
	/**
	 * 건수_2
	 * 
	 * @param cnt2 건수_2
	 */
	public void setCnt2(Integer cnt2){
		this.cnt2= cnt2;
		this.setIsSet_cnt2(true);
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
	public INBSmsRawTrnTxtNtcGrid1_DTO getiNBSmsRawTrnTxtNtcGrid1_DTO(){
		return this.iNBSmsRawTrnTxtNtcGrid1_DTO;
	}
	
	/**
	 * SMS입출금.거래내용.통지.GRID1.공통.IO
	 * 
	 * @param iNBSmsRawTrnTxtNtcGrid1_DTO SMS입출금.거래내용.통지.GRID1.공통.IO
	 */
	public void setiNBSmsRawTrnTxtNtcGrid1_DTO(INBSmsRawTrnTxtNtcGrid1_DTO iNBSmsRawTrnTxtNtcGrid1_DTO){
		this.iNBSmsRawTrnTxtNtcGrid1_DTO= iNBSmsRawTrnTxtNtcGrid1_DTO;
		this.setIsSet_iNBSmsRawTrnTxtNtcGrid1_DTO(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_iNBSmsRawTrnTxtNtcGrid2_DTO= false;
	protected final boolean isSet_iNBSmsRawTrnTxtNtcGrid2_DTO(){
		return this.isSet_iNBSmsRawTrnTxtNtcGrid2_DTO;
	}
	private void setIsSet_iNBSmsRawTrnTxtNtcGrid2_DTO(boolean value){
		this.isSet_iNBSmsRawTrnTxtNtcGrid2_DTO= value;
	}
	/**
	 * SMS입출금.거래내용.통지.GRID2.공통.IO
	 */
	@XmlTransient
	public List<INBSmsRawTrnTxtNtcGrid2_DTO> getiNBSmsRawTrnTxtNtcGrid2_DTO(){
		return iNBSmsRawTrnTxtNtcGrid2_DTO;
	}
	
	/**
	 * SMS입출금.거래내용.통지.GRID2.공통.IO
	 * 
	 * @param iNBSmsRawTrnTxtNtcGrid2_DTO SMS입출금.거래내용.통지.GRID2.공통.IO
	 */
	@JsonSetter("iNBSmsRawTrnTxtNtcGrid2_DTO")
	public void setiNBSmsRawTrnTxtNtcGrid2_DTO(List<INBSmsRawTrnTxtNtcGrid2_DTO> iNBSmsRawTrnTxtNtcGrid2_DTO){
		this.iNBSmsRawTrnTxtNtcGrid2_DTO= iNBSmsRawTrnTxtNtcGrid2_DTO;
		this.setIsSet_iNBSmsRawTrnTxtNtcGrid2_DTO(true);
	}
	
	public void setiNBSmsRawTrnTxtNtcGrid2_DTO(INBSmsRawTrnTxtNtcGrid2_DTO... items){
		List<INBSmsRawTrnTxtNtcGrid2_DTO> _items= new ArrayList<>();
		if ( items!= null && items.length> 0){
			for( INBSmsRawTrnTxtNtcGrid2_DTO item: items ){
				_items.add(item);
			}
		}
		this.setiNBSmsRawTrnTxtNtcGrid2_DTO(_items);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_smsRawNtcSrvcJnngYn= false;
	protected final boolean isSet_smsRawNtcSrvcJnngYn(){
		return this.isSet_smsRawNtcSrvcJnngYn;
	}
	private void setIsSet_smsRawNtcSrvcJnngYn(boolean value){
		this.isSet_smsRawNtcSrvcJnngYn= value;
	}
	/**
	 * SMS입출금통지서비스가입여부
	 */
	@XmlTransient
	public String getSmsRawNtcSrvcJnngYn(){
		return this.smsRawNtcSrvcJnngYn;
	}
	
	/**
	 * SMS입출금통지서비스가입여부
	 * 
	 * @param smsRawNtcSrvcJnngYn SMS입출금통지서비스가입여부
	 */
	public void setSmsRawNtcSrvcJnngYn(String smsRawNtcSrvcJnngYn){
		this.smsRawNtcSrvcJnngYn= smsRawNtcSrvcJnngYn;
		this.setIsSet_smsRawNtcSrvcJnngYn(true);
	}
	
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
				
	@Override
	public INBSmsRawNtcSrvcCallSmsRawNtcJnngInfCnfScrn_ODT clone(){
		try{
			INBSmsRawNtcSrvcCallSmsRawNtcJnngInfCnfScrn_ODT object= (INBSmsRawNtcSrvcCallSmsRawNtcJnngInfCnfScrn_ODT)super.clone();
			if ( this.iNBSmsRawTrnTxtNtcGrid1_DTO== null ) object.iNBSmsRawTrnTxtNtcGrid1_DTO= null;
			else object.iNBSmsRawTrnTxtNtcGrid1_DTO= (INBSmsRawTrnTxtNtcGrid1_DTO)this.iNBSmsRawTrnTxtNtcGrid1_DTO.clone();
			if ( this.iNBSmsRawTrnTxtNtcGrid2_DTO== null ) object.iNBSmsRawTrnTxtNtcGrid2_DTO= null;
			else{
				List<INBSmsRawTrnTxtNtcGrid2_DTO> clonedList= new ArrayList<>(this.iNBSmsRawTrnTxtNtcGrid2_DTO.size());
				for( INBSmsRawTrnTxtNtcGrid2_DTO item : iNBSmsRawTrnTxtNtcGrid2_DTO ){
					clonedList.add((INBSmsRawTrnTxtNtcGrid2_DTO)item.clone());
				}
				object.iNBSmsRawTrnTxtNtcGrid2_DTO= clonedList;
			}
			if ( this.iNBCusInfInq_DTO== null ) object.iNBCusInfInq_DTO= null;
			else object.iNBCusInfInq_DTO= (INBCusInfInq_DTO)this.iNBCusInfInq_DTO.clone();
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
		result= prime * result + ((this.cnt2==null)?0:this.cnt2.hashCode());
		result= prime * result + ((this.iNBSmsRawTrnTxtNtcGrid1_DTO==null)?0:this.iNBSmsRawTrnTxtNtcGrid1_DTO.hashCode());
		result= prime * result + ((this.iNBSmsRawTrnTxtNtcGrid2_DTO==null)?0:this.iNBSmsRawTrnTxtNtcGrid2_DTO.hashCode());
		result= prime * result + ((this.smsRawNtcSrvcJnngYn==null)?0:this.smsRawNtcSrvcJnngYn.hashCode());
		result= prime * result + ((this.iNBCusInfInq_DTO==null)?0:this.iNBCusInfInq_DTO.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final INBSmsRawNtcSrvcCallSmsRawNtcJnngInfCnfScrn_ODT other= (INBSmsRawNtcSrvcCallSmsRawNtcJnngInfCnfScrn_ODT)obj;
		{
			Object _cnt= getCnt();
			Object __cnt= other.getCnt();
			if ( _cnt== null ) { if ( __cnt!= null ) return false; }
			else if ( !_cnt.equals(__cnt) ) return false;
		}
		{
			Object _cnt2= getCnt2();
			Object __cnt2= other.getCnt2();
			if ( _cnt2== null ) { if ( __cnt2!= null ) return false; }
			else if ( !_cnt2.equals(__cnt2) ) return false;
		}
		{
			Object _iNBSmsRawTrnTxtNtcGrid1_DTO= getiNBSmsRawTrnTxtNtcGrid1_DTO();
			Object __iNBSmsRawTrnTxtNtcGrid1_DTO= other.getiNBSmsRawTrnTxtNtcGrid1_DTO();
			if ( _iNBSmsRawTrnTxtNtcGrid1_DTO== null ) { if ( __iNBSmsRawTrnTxtNtcGrid1_DTO!= null ) return false; }
			else if ( !_iNBSmsRawTrnTxtNtcGrid1_DTO.equals(__iNBSmsRawTrnTxtNtcGrid1_DTO) ) return false;
		}
		{
			Object _iNBSmsRawTrnTxtNtcGrid2_DTO= getiNBSmsRawTrnTxtNtcGrid2_DTO();
			Object __iNBSmsRawTrnTxtNtcGrid2_DTO= other.getiNBSmsRawTrnTxtNtcGrid2_DTO();
			if ( _iNBSmsRawTrnTxtNtcGrid2_DTO== null ) { if ( __iNBSmsRawTrnTxtNtcGrid2_DTO!= null ) return false; }
			else if ( !_iNBSmsRawTrnTxtNtcGrid2_DTO.equals(__iNBSmsRawTrnTxtNtcGrid2_DTO) ) return false;
		}
		{
			Object _smsRawNtcSrvcJnngYn= getSmsRawNtcSrvcJnngYn();
			Object __smsRawNtcSrvcJnngYn= other.getSmsRawNtcSrvcJnngYn();
			if ( _smsRawNtcSrvcJnngYn== null ) { if ( __smsRawNtcSrvcJnngYn!= null ) return false; }
			else if ( !_smsRawNtcSrvcJnngYn.equals(__smsRawNtcSrvcJnngYn) ) return false;
		}
		{
			Object _iNBCusInfInq_DTO= getiNBCusInfInq_DTO();
			Object __iNBCusInfInq_DTO= other.getiNBCusInfInq_DTO();
			if ( _iNBCusInfInq_DTO== null ) { if ( __iNBCusInfInq_DTO!= null ) return false; }
			else if ( !_iNBCusInfInq_DTO.equals(__iNBCusInfInq_DTO) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(INBSmsRawNtcSrvcCallSmsRawNtcJnngInfCnfScrn_ODT.class.getName()).append(":\n");
		sb.append("\tcnt: ");
		sb.append(cnt==null?"null":getCnt());
		sb.append("\n");
		sb.append("\tcnt2: ");
		sb.append(cnt2==null?"null":getCnt2());
		sb.append("\n");
		sb.append("\tiNBSmsRawTrnTxtNtcGrid1_DTO: ");
		sb.append(iNBSmsRawTrnTxtNtcGrid1_DTO==null?"null":getiNBSmsRawTrnTxtNtcGrid1_DTO());
		sb.append("\n");
		sb.append("\tiNBSmsRawTrnTxtNtcGrid2_DTO: ");
		if ( iNBSmsRawTrnTxtNtcGrid2_DTO== null ) sb.append("null");
		else{
			sb.append("array count : ");
			sb.append(iNBSmsRawTrnTxtNtcGrid2_DTO.size());
			sb.append("(items)\n");
	
			int max= (10<iNBSmsRawTrnTxtNtcGrid2_DTO.size())?10:iNBSmsRawTrnTxtNtcGrid2_DTO.size();
	
			for ( int i= 0; i < max; ++i ){
				sb.append("\tiNBSmsRawTrnTxtNtcGrid2_DTO[");
				sb.append(i);
				sb.append("] : ");
				sb.append(iNBSmsRawTrnTxtNtcGrid2_DTO.get(i));
				sb.append("\n");
			}
	
			if ( max < iNBSmsRawTrnTxtNtcGrid2_DTO.size() ){
				sb.append("\tiNBSmsRawTrnTxtNtcGrid2_DTO[.] : ").append("more ").append((iNBSmsRawTrnTxtNtcGrid2_DTO.size()-max)).append(" items").append("\n");
			}
		}
		sb.append("\tsmsRawNtcSrvcJnngYn: ");
		sb.append(smsRawNtcSrvcJnngYn==null?"null":getSmsRawNtcSrvcJnngYn());
		sb.append("\n");
		sb.append("\tiNBCusInfInq_DTO: ");
		sb.append(iNBCusInfInq_DTO==null?"null":getiNBCusInfInq_DTO());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 5; /* cnt */
		messageLen+= 5; /* cnt2 */
		if ( iNBSmsRawTrnTxtNtcGrid1_DTO != null && !(iNBSmsRawTrnTxtNtcGrid1_DTO instanceof Predictable) )
			throw new IllegalStateException( "Message length can not be predicted.");
		{
			INBSmsRawTrnTxtNtcGrid1_DTO temp= iNBSmsRawTrnTxtNtcGrid1_DTO;
			if ( temp== null ) temp= new INBSmsRawTrnTxtNtcGrid1_DTO();
			messageLen+= ( (Predictable)temp).predictMessageLength(); /* iNBSmsRawTrnTxtNtcGrid1_DTO */
		}
		{/*iNBSmsRawTrnTxtNtcGrid2_DTO*/
			int size=1;
			int count= iNBSmsRawTrnTxtNtcGrid2_DTO == null ? 0 : iNBSmsRawTrnTxtNtcGrid2_DTO.size();
			int min= size > count?count:size;
			INBSmsRawTrnTxtNtcGrid2_DTO emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					INBSmsRawTrnTxtNtcGrid2_DTO element= iNBSmsRawTrnTxtNtcGrid2_DTO.get(i);
					if ( element != null && !(element instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= element==null?0:( (Predictable)element).predictMessageLength();
				}else{
					if ( emptyElement== null ) emptyElement= new com.skbank.sml.fns.inb.dto.INBSmsRawTrnTxtNtcGrid2_DTO();
					if ( !(emptyElement instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= ( (Predictable)emptyElement).predictMessageLength();
				}
			}
		}
		messageLen+= 1; /* smsRawNtcSrvcJnngYn */
		if ( iNBCusInfInq_DTO != null && !(iNBCusInfInq_DTO instanceof Predictable) )
			throw new IllegalStateException( "Message length can not be predicted.");
		{
			INBCusInfInq_DTO temp= iNBCusInfInq_DTO;
			if ( temp== null ) temp= new INBCusInfInq_DTO();
			messageLen+= ( (Predictable)temp).predictMessageLength(); /* iNBCusInfInq_DTO */
		}
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("cnt");
		list.add("cnt2");
		list.add("iNBSmsRawTrnTxtNtcGrid1_DTO");
		list.add("iNBSmsRawTrnTxtNtcGrid2_DTO");
		list.add("smsRawNtcSrvcJnngYn");
		list.add("iNBCusInfInq_DTO");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("cnt", get("cnt"));
		map.put("cnt2", get("cnt2"));
		map.put("iNBSmsRawTrnTxtNtcGrid1_DTO", get("iNBSmsRawTrnTxtNtcGrid1_DTO"));
		map.put("iNBSmsRawTrnTxtNtcGrid2_DTO", get("iNBSmsRawTrnTxtNtcGrid2_DTO"));
		map.put("smsRawNtcSrvcJnngYn", get("smsRawNtcSrvcJnngYn"));
		map.put("iNBCusInfInq_DTO", get("iNBCusInfInq_DTO"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 98665:/* cnt */
			return getCnt();
		case 3058665:/* cnt2 */
			return getCnt2();
		case 419497082:/* iNBSmsRawTrnTxtNtcGrid1_DTO */
			return getiNBSmsRawTrnTxtNtcGrid1_DTO();
		case 420420603:/* iNBSmsRawTrnTxtNtcGrid2_DTO */
			return getiNBSmsRawTrnTxtNtcGrid2_DTO();
		case 1869348300:/* smsRawNtcSrvcJnngYn */
			return getSmsRawNtcSrvcJnngYn();
		case -1914349553:/* iNBCusInfInq_DTO */
			return getiNBCusInfInq_DTO();
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
		case 3058665:/* cnt2 */
			setCnt2((Integer)value);
			break;
		case 419497082:/* iNBSmsRawTrnTxtNtcGrid1_DTO */
			setiNBSmsRawTrnTxtNtcGrid1_DTO((INBSmsRawTrnTxtNtcGrid1_DTO)value);
			break;
		case 420420603:/* iNBSmsRawTrnTxtNtcGrid2_DTO */
			setiNBSmsRawTrnTxtNtcGrid2_DTO((List<INBSmsRawTrnTxtNtcGrid2_DTO>)value);
			break;
		case 1869348300:/* smsRawNtcSrvcJnngYn */
			setSmsRawNtcSrvcJnngYn((String)value);
			break;
		case -1914349553:/* iNBCusInfInq_DTO */
			setiNBCusInfInq_DTO((INBCusInfInq_DTO)value);
			break;
		default:
			break;
		}
	}
	
}
