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
import com.skbank.sml.fns.inb.dto.INBPushListRsp_DTO;
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
 * 통합 알림 목록 조회 IO
 */
@WooriOmmOption(propOption=true)
@XmlType(propOrder={
	"rtcd", "rtcdTxt", "inbPushListRsp_DTO"
}, name="INBNtfbxListInqSelectKataNtfcList_ODT")
@XmlRootElement(name="INBNtfbxListInqSelectKataNtfcList_ODT")
@BxmCategory(logicalName="통합.알림.목록.조회.컨트롤러.출력.IO", description="통합 알림 목록 조회 IO") 
public class INBNtfbxListInqSelectKataNtfcList_ODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 1407611480L;
	
	
	
	/**
	 * 결과코드
	 */
	@ApiModelProperty(
		name = "rtcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rtcd")
	@BxmOmm_Field(length=7, decimal=0, description="결과코드", align="left", fill="")
	private String rtcd= "";
	
	
	/**
	 * 결과코드내용
	 */
	@ApiModelProperty(
		name = "rtcdTxt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rtcdTxt")
	@BxmOmm_Field(length=100, decimal=0, description="결과코드내용", align="left", fill="")
	private String rtcdTxt= "";
	
	
	/**
	 * PUSH목록응답DTO
	 */
	@ApiModelProperty(
		name = "inbPushListRsp_DTO"
		, dataType = "[Lcom.skbank.sml.fns.inb.dto.INBPushListRsp_DTO;"
		)
	@XmlElement(name="item")
	@XmlElementWrapper()
	@JsonProperty("inbPushListRsp_DTO")
	@BxmOmm_Field(length=0, decimal=0, description="PUSH목록응답DTO", align="left", fill="", arrayReference="1", etcProperties={"PROP_OPTION_DSCD=L999"})
	private List<INBPushListRsp_DTO> inbPushListRsp_DTO= new ArrayList<>();
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rtcd= false;
	protected final boolean isSet_rtcd(){
		return this.isSet_rtcd;
	}
	private void setIsSet_rtcd(boolean value){
		this.isSet_rtcd= value;
	}
	/**
	 * 결과코드
	 */
	@XmlTransient
	public String getRtcd(){
		return this.rtcd;
	}
	
	/**
	 * 결과코드
	 * 
	 * @param rtcd 결과코드
	 */
	public void setRtcd(String rtcd){
		this.rtcd= rtcd;
		this.setIsSet_rtcd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rtcdTxt= false;
	protected final boolean isSet_rtcdTxt(){
		return this.isSet_rtcdTxt;
	}
	private void setIsSet_rtcdTxt(boolean value){
		this.isSet_rtcdTxt= value;
	}
	/**
	 * 결과코드내용
	 */
	@XmlTransient
	public String getRtcdTxt(){
		return this.rtcdTxt;
	}
	
	/**
	 * 결과코드내용
	 * 
	 * @param rtcdTxt 결과코드내용
	 */
	public void setRtcdTxt(String rtcdTxt){
		this.rtcdTxt= rtcdTxt;
		this.setIsSet_rtcdTxt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_inbPushListRsp_DTO= false;
	protected final boolean isSet_inbPushListRsp_DTO(){
		return this.isSet_inbPushListRsp_DTO;
	}
	private void setIsSet_inbPushListRsp_DTO(boolean value){
		this.isSet_inbPushListRsp_DTO= value;
	}
	/**
	 * PUSH목록응답DTO
	 */
	@XmlTransient
	public List<INBPushListRsp_DTO> getInbPushListRsp_DTO(){
		return inbPushListRsp_DTO;
	}
	
	/**
	 * PUSH목록응답DTO
	 * 
	 * @param inbPushListRsp_DTO PUSH목록응답DTO
	 */
	@JsonSetter("inbPushListRsp_DTO")
	public void setInbPushListRsp_DTO(List<INBPushListRsp_DTO> inbPushListRsp_DTO){
		this.inbPushListRsp_DTO= inbPushListRsp_DTO;
		this.setIsSet_inbPushListRsp_DTO(true);
	}
	
	public void setInbPushListRsp_DTO(INBPushListRsp_DTO... items){
		List<INBPushListRsp_DTO> _items= new ArrayList<>();
		if ( items!= null && items.length> 0){
			for( INBPushListRsp_DTO item: items ){
				_items.add(item);
			}
		}
		this.setInbPushListRsp_DTO(_items);
	}
				
	@Override
	public INBNtfbxListInqSelectKataNtfcList_ODT clone(){
		try{
			INBNtfbxListInqSelectKataNtfcList_ODT object= (INBNtfbxListInqSelectKataNtfcList_ODT)super.clone();
			if ( this.inbPushListRsp_DTO== null ) object.inbPushListRsp_DTO= null;
			else{
				List<INBPushListRsp_DTO> clonedList= new ArrayList<>(this.inbPushListRsp_DTO.size());
				for( INBPushListRsp_DTO item : inbPushListRsp_DTO ){
					clonedList.add((INBPushListRsp_DTO)item.clone());
				}
				object.inbPushListRsp_DTO= clonedList;
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
		
		result= prime * result + ((this.rtcd==null)?0:this.rtcd.hashCode());
		result= prime * result + ((this.rtcdTxt==null)?0:this.rtcdTxt.hashCode());
		result= prime * result + ((this.inbPushListRsp_DTO==null)?0:this.inbPushListRsp_DTO.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final INBNtfbxListInqSelectKataNtfcList_ODT other= (INBNtfbxListInqSelectKataNtfcList_ODT)obj;
		{
			Object _rtcd= getRtcd();
			Object __rtcd= other.getRtcd();
			if ( _rtcd== null ) { if ( __rtcd!= null ) return false; }
			else if ( !_rtcd.equals(__rtcd) ) return false;
		}
		{
			Object _rtcdTxt= getRtcdTxt();
			Object __rtcdTxt= other.getRtcdTxt();
			if ( _rtcdTxt== null ) { if ( __rtcdTxt!= null ) return false; }
			else if ( !_rtcdTxt.equals(__rtcdTxt) ) return false;
		}
		{
			Object _inbPushListRsp_DTO= getInbPushListRsp_DTO();
			Object __inbPushListRsp_DTO= other.getInbPushListRsp_DTO();
			if ( _inbPushListRsp_DTO== null ) { if ( __inbPushListRsp_DTO!= null ) return false; }
			else if ( !_inbPushListRsp_DTO.equals(__inbPushListRsp_DTO) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(INBNtfbxListInqSelectKataNtfcList_ODT.class.getName()).append(":\n");
		sb.append("\trtcd: ");
		sb.append(rtcd==null?"null":getRtcd());
		sb.append("\n");
		sb.append("\trtcdTxt: ");
		sb.append(rtcdTxt==null?"null":getRtcdTxt());
		sb.append("\n");
		sb.append("\tinbPushListRsp_DTO: ");
		if ( inbPushListRsp_DTO== null ) sb.append("null");
		else{
			sb.append("array count : ");
			sb.append(inbPushListRsp_DTO.size());
			sb.append("(items)\n");
	
			int max= (10<inbPushListRsp_DTO.size())?10:inbPushListRsp_DTO.size();
	
			for ( int i= 0; i < max; ++i ){
				sb.append("\tinbPushListRsp_DTO[");
				sb.append(i);
				sb.append("] : ");
				sb.append(inbPushListRsp_DTO.get(i));
				sb.append("\n");
			}
	
			if ( max < inbPushListRsp_DTO.size() ){
				sb.append("\tinbPushListRsp_DTO[.] : ").append("more ").append((inbPushListRsp_DTO.size()-max)).append(" items").append("\n");
			}
		}
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 7; /* rtcd */
		messageLen+= 100; /* rtcdTxt */
		{/*inbPushListRsp_DTO*/
			int size=1;
			int count= inbPushListRsp_DTO == null ? 0 : inbPushListRsp_DTO.size();
			int min= size > count?count:size;
			INBPushListRsp_DTO emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					INBPushListRsp_DTO element= inbPushListRsp_DTO.get(i);
					if ( element != null && !(element instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= element==null?0:( (Predictable)element).predictMessageLength();
				}else{
					if ( emptyElement== null ) emptyElement= new com.skbank.sml.fns.inb.dto.INBPushListRsp_DTO();
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
	
		list.add("rtcd");
		list.add("rtcdTxt");
		list.add("inbPushListRsp_DTO");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("rtcd", get("rtcd"));
		map.put("rtcdTxt", get("rtcdTxt"));
		map.put("inbPushListRsp_DTO", get("inbPushListRsp_DTO"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 3510819:/* rtcd */
			return getRtcd();
		case 1511678285:/* rtcdTxt */
			return getRtcdTxt();
		case 96271418:/* inbPushListRsp_DTO */
			return getInbPushListRsp_DTO();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 3510819:/* rtcd */
			setRtcd((String)value);
			break;
		case 1511678285:/* rtcdTxt */
			setRtcdTxt((String)value);
			break;
		case 96271418:/* inbPushListRsp_DTO */
			setInbPushListRsp_DTO((List<INBPushListRsp_DTO>)value);
			break;
		default:
			break;
		}
	}
	
}
