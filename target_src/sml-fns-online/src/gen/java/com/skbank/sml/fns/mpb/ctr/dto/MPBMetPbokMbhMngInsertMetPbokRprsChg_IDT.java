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
	"rgsRvkDscd", "metMngNo", "chgRppeMetMbhSrno"
}, name="MPBMetPbokMbhMngInsertMetPbokRprsChg_IDT")
@XmlRootElement(name="MPBMetPbokMbhMngInsertMetPbokRprsChg_IDT")
@BxmCategory(logicalName="모임통장.대표.변경.등록.컨트롤러.입력.IO", description="") 
public class MPBMetPbokMbhMngInsertMetPbokRprsChg_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 2103952805L;
	
	
	
	/**
	 * 등록해제구분코드
	 */
	@ApiModelProperty(
		name = "rgsRvkDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rgsRvkDscd")
	@BxmOmm_Field(length=1, decimal=0, description="등록해제구분코드", align="left", fill="")
	private String rgsRvkDscd= "";
	
	
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
	 * 변경대표자모임회원일련번호
	 */
	@ApiModelProperty(
		name = "chgRppeMetMbhSrno"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("chgRppeMetMbhSrno")
	@BxmOmm_Field(length=7, decimal=0, description="변경대표자모임회원일련번호", align="right", fill="0")
	private Integer chgRppeMetMbhSrno= 0;
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rgsRvkDscd= false;
	protected final boolean isSet_rgsRvkDscd(){
		return this.isSet_rgsRvkDscd;
	}
	private void setIsSet_rgsRvkDscd(boolean value){
		this.isSet_rgsRvkDscd= value;
	}
	/**
	 * 등록해제구분코드
	 */
	@XmlTransient
	public String getRgsRvkDscd(){
		return this.rgsRvkDscd;
	}
	
	/**
	 * 등록해제구분코드
	 * 
	 * @param rgsRvkDscd 등록해제구분코드
	 */
	public void setRgsRvkDscd(String rgsRvkDscd){
		this.rgsRvkDscd= rgsRvkDscd;
		this.setIsSet_rgsRvkDscd(true);
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
	private boolean isSet_chgRppeMetMbhSrno= false;
	protected final boolean isSet_chgRppeMetMbhSrno(){
		return this.isSet_chgRppeMetMbhSrno;
	}
	private void setIsSet_chgRppeMetMbhSrno(boolean value){
		this.isSet_chgRppeMetMbhSrno= value;
	}
	/**
	 * 변경대표자모임회원일련번호
	 */
	@XmlTransient
	public Integer getChgRppeMetMbhSrno(){
		return this.chgRppeMetMbhSrno;
	}
	
	/**
	 * 변경대표자모임회원일련번호
	 * 
	 * @param chgRppeMetMbhSrno 변경대표자모임회원일련번호
	 */
	public void setChgRppeMetMbhSrno(Integer chgRppeMetMbhSrno){
		this.chgRppeMetMbhSrno= chgRppeMetMbhSrno;
		this.setIsSet_chgRppeMetMbhSrno(true);
	}
				
	@Override
	public MPBMetPbokMbhMngInsertMetPbokRprsChg_IDT clone(){
		try{
			MPBMetPbokMbhMngInsertMetPbokRprsChg_IDT object= (MPBMetPbokMbhMngInsertMetPbokRprsChg_IDT)super.clone();
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
		
		result= prime * result + ((this.rgsRvkDscd==null)?0:this.rgsRvkDscd.hashCode());
		result= prime * result + ((this.metMngNo==null)?0:this.metMngNo.hashCode());
		result= prime * result + ((this.chgRppeMetMbhSrno==null)?0:this.chgRppeMetMbhSrno.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MPBMetPbokMbhMngInsertMetPbokRprsChg_IDT other= (MPBMetPbokMbhMngInsertMetPbokRprsChg_IDT)obj;
		{
			Object _rgsRvkDscd= getRgsRvkDscd();
			Object __rgsRvkDscd= other.getRgsRvkDscd();
			if ( _rgsRvkDscd== null ) { if ( __rgsRvkDscd!= null ) return false; }
			else if ( !_rgsRvkDscd.equals(__rgsRvkDscd) ) return false;
		}
		{
			Object _metMngNo= getMetMngNo();
			Object __metMngNo= other.getMetMngNo();
			if ( _metMngNo== null ) { if ( __metMngNo!= null ) return false; }
			else if ( !_metMngNo.equals(__metMngNo) ) return false;
		}
		{
			Object _chgRppeMetMbhSrno= getChgRppeMetMbhSrno();
			Object __chgRppeMetMbhSrno= other.getChgRppeMetMbhSrno();
			if ( _chgRppeMetMbhSrno== null ) { if ( __chgRppeMetMbhSrno!= null ) return false; }
			else if ( !_chgRppeMetMbhSrno.equals(__chgRppeMetMbhSrno) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MPBMetPbokMbhMngInsertMetPbokRprsChg_IDT.class.getName()).append(":\n");
		sb.append("\trgsRvkDscd: ");
		sb.append(rgsRvkDscd==null?"null":getRgsRvkDscd());
		sb.append("\n");
		sb.append("\tmetMngNo: ");
		sb.append(metMngNo==null?"null":getMetMngNo());
		sb.append("\n");
		sb.append("\tchgRppeMetMbhSrno: ");
		sb.append(chgRppeMetMbhSrno==null?"null":getChgRppeMetMbhSrno());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 1; /* rgsRvkDscd */
		messageLen+= 9; /* metMngNo */
		messageLen+= 7; /* chgRppeMetMbhSrno */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("rgsRvkDscd");
		list.add("metMngNo");
		list.add("chgRppeMetMbhSrno");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("rgsRvkDscd", get("rgsRvkDscd"));
		map.put("metMngNo", get("metMngNo"));
		map.put("chgRppeMetMbhSrno", get("chgRppeMetMbhSrno"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -612139591:/* rgsRvkDscd */
			return getRgsRvkDscd();
		case -468172085:/* metMngNo */
			return getMetMngNo();
		case 1812328780:/* chgRppeMetMbhSrno */
			return getChgRppeMetMbhSrno();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -612139591:/* rgsRvkDscd */
			setRgsRvkDscd((String)value);
			break;
		case -468172085:/* metMngNo */
			setMetMngNo((String)value);
			break;
		case 1812328780:/* chgRppeMetMbhSrno */
			setChgRppeMetMbhSrno((Integer)value);
			break;
		default:
			break;
		}
	}
	
}
