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
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 */
@XmlType(propOrder={
	"metChgDscd", "metMngNo", "metMbhSrno", "metMbhNm", "metImgUrlNm", "bscImgUrlNm"
}, name="MPBMetPbokBscMngUpdateMetPbokImgInfInlt_IDT")
@XmlRootElement(name="MPBMetPbokBscMngUpdateMetPbokImgInfInlt_IDT")
@BxmCategory(logicalName="모임통장 이미지 정보 초기화 수정", description="") 
public class MPBMetPbokBscMngUpdateMetPbokImgInfInlt_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 225784140L;
	
	
	
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
	 * 모임관리번호
	 */
	@ApiModelProperty(
		name = "metMngNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metMngNo")
	@BxmOmm_Field(length=1, decimal=0, description="모임관리번호", align="left", fill="")
	private String metMngNo= "";
	
	
	/**
	 * 모임회원일련번호
	 */
	@ApiModelProperty(
		name = "metMbhSrno"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("metMbhSrno")
	@BxmOmm_Field(length=7, decimal=0, description="모임회원일련번호", align="right", fill="0")
	private Integer metMbhSrno= 0;
	
	
	/**
	 * 모임회원명
	 */
	@ApiModelProperty(
		name = "metMbhNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metMbhNm")
	@BxmOmm_Field(length=60, decimal=0, description="모임회원명", align="left", fill="")
	private String metMbhNm= "";
	
	
	/**
	 * 모임이미지URL명
	 */
	@ApiModelProperty(
		name = "metImgUrlNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metImgUrlNm")
	@BxmOmm_Field(length=100, decimal=0, description="모임이미지URL명", align="left", fill="")
	private String metImgUrlNm= "";
	
	
	/**
	 * 기본이미지URL명
	 */
	@ApiModelProperty(
		name = "bscImgUrlNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("bscImgUrlNm")
	@BxmOmm_Field(length=100, decimal=0, description="기본이미지URL명", align="left", fill="")
	private String bscImgUrlNm= "";
	
	
	
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
	private boolean isSet_metMbhSrno= false;
	protected final boolean isSet_metMbhSrno(){
		return this.isSet_metMbhSrno;
	}
	private void setIsSet_metMbhSrno(boolean value){
		this.isSet_metMbhSrno= value;
	}
	/**
	 * 모임회원일련번호
	 */
	@XmlTransient
	public Integer getMetMbhSrno(){
		return this.metMbhSrno;
	}
	
	/**
	 * 모임회원일련번호
	 * 
	 * @param metMbhSrno 모임회원일련번호
	 */
	public void setMetMbhSrno(Integer metMbhSrno){
		this.metMbhSrno= metMbhSrno;
		this.setIsSet_metMbhSrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metMbhNm= false;
	protected final boolean isSet_metMbhNm(){
		return this.isSet_metMbhNm;
	}
	private void setIsSet_metMbhNm(boolean value){
		this.isSet_metMbhNm= value;
	}
	/**
	 * 모임회원명
	 */
	@XmlTransient
	public String getMetMbhNm(){
		return this.metMbhNm;
	}
	
	/**
	 * 모임회원명
	 * 
	 * @param metMbhNm 모임회원명
	 */
	public void setMetMbhNm(String metMbhNm){
		this.metMbhNm= metMbhNm;
		this.setIsSet_metMbhNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metImgUrlNm= false;
	protected final boolean isSet_metImgUrlNm(){
		return this.isSet_metImgUrlNm;
	}
	private void setIsSet_metImgUrlNm(boolean value){
		this.isSet_metImgUrlNm= value;
	}
	/**
	 * 모임이미지URL명
	 */
	@XmlTransient
	public String getMetImgUrlNm(){
		return this.metImgUrlNm;
	}
	
	/**
	 * 모임이미지URL명
	 * 
	 * @param metImgUrlNm 모임이미지URL명
	 */
	public void setMetImgUrlNm(String metImgUrlNm){
		this.metImgUrlNm= metImgUrlNm;
		this.setIsSet_metImgUrlNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_bscImgUrlNm= false;
	protected final boolean isSet_bscImgUrlNm(){
		return this.isSet_bscImgUrlNm;
	}
	private void setIsSet_bscImgUrlNm(boolean value){
		this.isSet_bscImgUrlNm= value;
	}
	/**
	 * 기본이미지URL명
	 */
	@XmlTransient
	public String getBscImgUrlNm(){
		return this.bscImgUrlNm;
	}
	
	/**
	 * 기본이미지URL명
	 * 
	 * @param bscImgUrlNm 기본이미지URL명
	 */
	public void setBscImgUrlNm(String bscImgUrlNm){
		this.bscImgUrlNm= bscImgUrlNm;
		this.setIsSet_bscImgUrlNm(true);
	}
				
	@Override
	public MPBMetPbokBscMngUpdateMetPbokImgInfInlt_IDT clone(){
		try{
			MPBMetPbokBscMngUpdateMetPbokImgInfInlt_IDT object= (MPBMetPbokBscMngUpdateMetPbokImgInfInlt_IDT)super.clone();
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
		result= prime * result + ((this.metMngNo==null)?0:this.metMngNo.hashCode());
		result= prime * result + ((this.metMbhSrno==null)?0:this.metMbhSrno.hashCode());
		result= prime * result + ((this.metMbhNm==null)?0:this.metMbhNm.hashCode());
		result= prime * result + ((this.metImgUrlNm==null)?0:this.metImgUrlNm.hashCode());
		result= prime * result + ((this.bscImgUrlNm==null)?0:this.bscImgUrlNm.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MPBMetPbokBscMngUpdateMetPbokImgInfInlt_IDT other= (MPBMetPbokBscMngUpdateMetPbokImgInfInlt_IDT)obj;
		{
			Object _metChgDscd= getMetChgDscd();
			Object __metChgDscd= other.getMetChgDscd();
			if ( _metChgDscd== null ) { if ( __metChgDscd!= null ) return false; }
			else if ( !_metChgDscd.equals(__metChgDscd) ) return false;
		}
		{
			Object _metMngNo= getMetMngNo();
			Object __metMngNo= other.getMetMngNo();
			if ( _metMngNo== null ) { if ( __metMngNo!= null ) return false; }
			else if ( !_metMngNo.equals(__metMngNo) ) return false;
		}
		{
			Object _metMbhSrno= getMetMbhSrno();
			Object __metMbhSrno= other.getMetMbhSrno();
			if ( _metMbhSrno== null ) { if ( __metMbhSrno!= null ) return false; }
			else if ( !_metMbhSrno.equals(__metMbhSrno) ) return false;
		}
		{
			Object _metMbhNm= getMetMbhNm();
			Object __metMbhNm= other.getMetMbhNm();
			if ( _metMbhNm== null ) { if ( __metMbhNm!= null ) return false; }
			else if ( !_metMbhNm.equals(__metMbhNm) ) return false;
		}
		{
			Object _metImgUrlNm= getMetImgUrlNm();
			Object __metImgUrlNm= other.getMetImgUrlNm();
			if ( _metImgUrlNm== null ) { if ( __metImgUrlNm!= null ) return false; }
			else if ( !_metImgUrlNm.equals(__metImgUrlNm) ) return false;
		}
		{
			Object _bscImgUrlNm= getBscImgUrlNm();
			Object __bscImgUrlNm= other.getBscImgUrlNm();
			if ( _bscImgUrlNm== null ) { if ( __bscImgUrlNm!= null ) return false; }
			else if ( !_bscImgUrlNm.equals(__bscImgUrlNm) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MPBMetPbokBscMngUpdateMetPbokImgInfInlt_IDT.class.getName()).append(":\n");
		sb.append("\tmetChgDscd: ");
		sb.append(metChgDscd==null?"null":getMetChgDscd());
		sb.append("\n");
		sb.append("\tmetMngNo: ");
		sb.append(metMngNo==null?"null":getMetMngNo());
		sb.append("\n");
		sb.append("\tmetMbhSrno: ");
		sb.append(metMbhSrno==null?"null":getMetMbhSrno());
		sb.append("\n");
		sb.append("\tmetMbhNm: ");
		sb.append(metMbhNm==null?"null":getMetMbhNm());
		sb.append("\n");
		sb.append("\tmetImgUrlNm: ");
		sb.append(metImgUrlNm==null?"null":getMetImgUrlNm());
		sb.append("\n");
		sb.append("\tbscImgUrlNm: ");
		sb.append(bscImgUrlNm==null?"null":getBscImgUrlNm());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 2; /* metChgDscd */
		messageLen+= 1; /* metMngNo */
		messageLen+= 7; /* metMbhSrno */
		messageLen+= 60; /* metMbhNm */
		messageLen+= 100; /* metImgUrlNm */
		messageLen+= 100; /* bscImgUrlNm */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("metChgDscd");
		list.add("metMngNo");
		list.add("metMbhSrno");
		list.add("metMbhNm");
		list.add("metImgUrlNm");
		list.add("bscImgUrlNm");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("metChgDscd", get("metChgDscd"));
		map.put("metMngNo", get("metMngNo"));
		map.put("metMbhSrno", get("metMbhSrno"));
		map.put("metMbhNm", get("metMbhNm"));
		map.put("metImgUrlNm", get("metImgUrlNm"));
		map.put("bscImgUrlNm", get("bscImgUrlNm"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 601024374:/* metChgDscd */
			return getMetChgDscd();
		case -468172085:/* metMngNo */
			return getMetMngNo();
		case 715721463:/* metMbhSrno */
			return getMetMbhSrno();
		case -468528618:/* metMbhNm */
			return getMetMbhNm();
		case -817924217:/* metImgUrlNm */
			return getMetImgUrlNm();
		case -320562723:/* bscImgUrlNm */
			return getBscImgUrlNm();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 601024374:/* metChgDscd */
			setMetChgDscd((String)value);
			break;
		case -468172085:/* metMngNo */
			setMetMngNo((String)value);
			break;
		case 715721463:/* metMbhSrno */
			setMetMbhSrno((Integer)value);
			break;
		case -468528618:/* metMbhNm */
			setMetMbhNm((String)value);
			break;
		case -817924217:/* metImgUrlNm */
			setMetImgUrlNm((String)value);
			break;
		case -320562723:/* bscImgUrlNm */
			setBscImgUrlNm((String)value);
			break;
		default:
			break;
		}
	}
	
}
