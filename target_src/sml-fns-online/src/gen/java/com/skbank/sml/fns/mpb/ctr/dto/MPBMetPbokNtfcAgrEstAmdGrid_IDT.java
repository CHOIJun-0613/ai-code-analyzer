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
	"metMngNo", "metMbhSrno", "ancSndDscd"
}, name="MPBMetPbokNtfcAgrEstAmdGrid_IDT")
@XmlRootElement(name="MPBMetPbokNtfcAgrEstAmdGrid_IDT")
@BxmCategory(logicalName="모임통장.알림.동의.설정.수정.그리드.컨트롤러.입력.IO", description="") 
public class MPBMetPbokNtfcAgrEstAmdGrid_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 832553877L;
	
	
	
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
	 * 공지발송구분코드
	 */
	@ApiModelProperty(
		name = "ancSndDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ancSndDscd")
	@BxmOmm_Field(length=1, decimal=0, description="공지발송구분코드", align="left", fill="")
	private String ancSndDscd= "";
	
	
	
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
	private boolean isSet_ancSndDscd= false;
	protected final boolean isSet_ancSndDscd(){
		return this.isSet_ancSndDscd;
	}
	private void setIsSet_ancSndDscd(boolean value){
		this.isSet_ancSndDscd= value;
	}
	/**
	 * 공지발송구분코드
	 */
	@XmlTransient
	public String getAncSndDscd(){
		return this.ancSndDscd;
	}
	
	/**
	 * 공지발송구분코드
	 * 
	 * @param ancSndDscd 공지발송구분코드
	 */
	public void setAncSndDscd(String ancSndDscd){
		this.ancSndDscd= ancSndDscd;
		this.setIsSet_ancSndDscd(true);
	}
				
	@Override
	public MPBMetPbokNtfcAgrEstAmdGrid_IDT clone(){
		try{
			MPBMetPbokNtfcAgrEstAmdGrid_IDT object= (MPBMetPbokNtfcAgrEstAmdGrid_IDT)super.clone();
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
		
		result= prime * result + ((this.metMngNo==null)?0:this.metMngNo.hashCode());
		result= prime * result + ((this.metMbhSrno==null)?0:this.metMbhSrno.hashCode());
		result= prime * result + ((this.ancSndDscd==null)?0:this.ancSndDscd.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MPBMetPbokNtfcAgrEstAmdGrid_IDT other= (MPBMetPbokNtfcAgrEstAmdGrid_IDT)obj;
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
			Object _ancSndDscd= getAncSndDscd();
			Object __ancSndDscd= other.getAncSndDscd();
			if ( _ancSndDscd== null ) { if ( __ancSndDscd!= null ) return false; }
			else if ( !_ancSndDscd.equals(__ancSndDscd) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MPBMetPbokNtfcAgrEstAmdGrid_IDT.class.getName()).append(":\n");
		sb.append("\tmetMngNo: ");
		sb.append(metMngNo==null?"null":getMetMngNo());
		sb.append("\n");
		sb.append("\tmetMbhSrno: ");
		sb.append(metMbhSrno==null?"null":getMetMbhSrno());
		sb.append("\n");
		sb.append("\tancSndDscd: ");
		sb.append(ancSndDscd==null?"null":getAncSndDscd());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 9; /* metMngNo */
		messageLen+= 7; /* metMbhSrno */
		messageLen+= 1; /* ancSndDscd */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("metMngNo");
		list.add("metMbhSrno");
		list.add("ancSndDscd");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("metMngNo", get("metMngNo"));
		map.put("metMbhSrno", get("metMbhSrno"));
		map.put("ancSndDscd", get("ancSndDscd"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -468172085:/* metMngNo */
			return getMetMngNo();
		case 715721463:/* metMbhSrno */
			return getMetMbhSrno();
		case 1498154883:/* ancSndDscd */
			return getAncSndDscd();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -468172085:/* metMngNo */
			setMetMngNo((String)value);
			break;
		case 715721463:/* metMbhSrno */
			setMetMbhSrno((Integer)value);
			break;
		case 1498154883:/* ancSndDscd */
			setAncSndDscd((String)value);
			break;
		default:
			break;
		}
	}
	
}
