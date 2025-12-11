/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.mpb.dto;

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
	"metMngNo", "ptcpStcd", "mbhDscd", "metScssDt", "metScssTm"
}, name="MetPbokAllMbhScss_DIDT")
@XmlRootElement(name="MetPbokAllMbhScss_DIDT")
@BxmCategory(logicalName="모임통장.전체.회원.탈퇴.DBM.입력.IO", description="") 
public class MetPbokAllMbhScss_DIDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -1489220266L;
	
	
	
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
	 * 참여상태코드
	 */
	@ApiModelProperty(
		name = "ptcpStcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ptcpStcd")
	@BxmOmm_Field(length=1, decimal=0, description="참여상태코드", align="left", fill="")
	private String ptcpStcd= "";
	
	
	/**
	 * 회원구분코드
	 */
	@ApiModelProperty(
		name = "mbhDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("mbhDscd")
	@BxmOmm_Field(length=100, decimal=0, description="회원구분코드", align="left", fill="")
	private String mbhDscd= "";
	
	
	/**
	 * 모임탈퇴일자
	 */
	@ApiModelProperty(
		name = "metScssDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metScssDt")
	@BxmOmm_Field(length=8, decimal=0, description="모임탈퇴일자", align="left", fill="")
	private String metScssDt= "";
	
	
	/**
	 * 모임탈퇴시각
	 */
	@ApiModelProperty(
		name = "metScssTm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metScssTm")
	@BxmOmm_Field(length=6, decimal=0, description="모임탈퇴시각", align="left", fill="")
	private String metScssTm= "";
	
	
	
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
	private boolean isSet_ptcpStcd= false;
	protected final boolean isSet_ptcpStcd(){
		return this.isSet_ptcpStcd;
	}
	private void setIsSet_ptcpStcd(boolean value){
		this.isSet_ptcpStcd= value;
	}
	/**
	 * 참여상태코드
	 */
	@XmlTransient
	public String getPtcpStcd(){
		return this.ptcpStcd;
	}
	
	/**
	 * 참여상태코드
	 * 
	 * @param ptcpStcd 참여상태코드
	 */
	public void setPtcpStcd(String ptcpStcd){
		this.ptcpStcd= ptcpStcd;
		this.setIsSet_ptcpStcd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mbhDscd= false;
	protected final boolean isSet_mbhDscd(){
		return this.isSet_mbhDscd;
	}
	private void setIsSet_mbhDscd(boolean value){
		this.isSet_mbhDscd= value;
	}
	/**
	 * 회원구분코드
	 */
	@XmlTransient
	public String getMbhDscd(){
		return this.mbhDscd;
	}
	
	/**
	 * 회원구분코드
	 * 
	 * @param mbhDscd 회원구분코드
	 */
	public void setMbhDscd(String mbhDscd){
		this.mbhDscd= mbhDscd;
		this.setIsSet_mbhDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metScssDt= false;
	protected final boolean isSet_metScssDt(){
		return this.isSet_metScssDt;
	}
	private void setIsSet_metScssDt(boolean value){
		this.isSet_metScssDt= value;
	}
	/**
	 * 모임탈퇴일자
	 */
	@XmlTransient
	public String getMetScssDt(){
		return this.metScssDt;
	}
	
	/**
	 * 모임탈퇴일자
	 * 
	 * @param metScssDt 모임탈퇴일자
	 */
	public void setMetScssDt(String metScssDt){
		this.metScssDt= metScssDt;
		this.setIsSet_metScssDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metScssTm= false;
	protected final boolean isSet_metScssTm(){
		return this.isSet_metScssTm;
	}
	private void setIsSet_metScssTm(boolean value){
		this.isSet_metScssTm= value;
	}
	/**
	 * 모임탈퇴시각
	 */
	@XmlTransient
	public String getMetScssTm(){
		return this.metScssTm;
	}
	
	/**
	 * 모임탈퇴시각
	 * 
	 * @param metScssTm 모임탈퇴시각
	 */
	public void setMetScssTm(String metScssTm){
		this.metScssTm= metScssTm;
		this.setIsSet_metScssTm(true);
	}
				
	@Override
	public MetPbokAllMbhScss_DIDT clone(){
		try{
			MetPbokAllMbhScss_DIDT object= (MetPbokAllMbhScss_DIDT)super.clone();
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
		result= prime * result + ((this.ptcpStcd==null)?0:this.ptcpStcd.hashCode());
		result= prime * result + ((this.mbhDscd==null)?0:this.mbhDscd.hashCode());
		result= prime * result + ((this.metScssDt==null)?0:this.metScssDt.hashCode());
		result= prime * result + ((this.metScssTm==null)?0:this.metScssTm.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MetPbokAllMbhScss_DIDT other= (MetPbokAllMbhScss_DIDT)obj;
		{
			Object _metMngNo= getMetMngNo();
			Object __metMngNo= other.getMetMngNo();
			if ( _metMngNo== null ) { if ( __metMngNo!= null ) return false; }
			else if ( !_metMngNo.equals(__metMngNo) ) return false;
		}
		{
			Object _ptcpStcd= getPtcpStcd();
			Object __ptcpStcd= other.getPtcpStcd();
			if ( _ptcpStcd== null ) { if ( __ptcpStcd!= null ) return false; }
			else if ( !_ptcpStcd.equals(__ptcpStcd) ) return false;
		}
		{
			Object _mbhDscd= getMbhDscd();
			Object __mbhDscd= other.getMbhDscd();
			if ( _mbhDscd== null ) { if ( __mbhDscd!= null ) return false; }
			else if ( !_mbhDscd.equals(__mbhDscd) ) return false;
		}
		{
			Object _metScssDt= getMetScssDt();
			Object __metScssDt= other.getMetScssDt();
			if ( _metScssDt== null ) { if ( __metScssDt!= null ) return false; }
			else if ( !_metScssDt.equals(__metScssDt) ) return false;
		}
		{
			Object _metScssTm= getMetScssTm();
			Object __metScssTm= other.getMetScssTm();
			if ( _metScssTm== null ) { if ( __metScssTm!= null ) return false; }
			else if ( !_metScssTm.equals(__metScssTm) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MetPbokAllMbhScss_DIDT.class.getName()).append(":\n");
		sb.append("\tmetMngNo: ");
		sb.append(metMngNo==null?"null":getMetMngNo());
		sb.append("\n");
		sb.append("\tptcpStcd: ");
		sb.append(ptcpStcd==null?"null":getPtcpStcd());
		sb.append("\n");
		sb.append("\tmbhDscd: ");
		sb.append(mbhDscd==null?"null":getMbhDscd());
		sb.append("\n");
		sb.append("\tmetScssDt: ");
		sb.append(metScssDt==null?"null":getMetScssDt());
		sb.append("\n");
		sb.append("\tmetScssTm: ");
		sb.append(metScssTm==null?"null":getMetScssTm());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 1; /* metMngNo */
		messageLen+= 1; /* ptcpStcd */
		messageLen+= 100; /* mbhDscd */
		messageLen+= 8; /* metScssDt */
		messageLen+= 6; /* metScssTm */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("metMngNo");
		list.add("ptcpStcd");
		list.add("mbhDscd");
		list.add("metScssDt");
		list.add("metScssTm");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("metMngNo", get("metMngNo"));
		map.put("ptcpStcd", get("ptcpStcd"));
		map.put("mbhDscd", get("mbhDscd"));
		map.put("metScssDt", get("metScssDt"));
		map.put("metScssTm", get("metScssTm"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -468172085:/* metMngNo */
			return getMetMngNo();
		case 437781395:/* ptcpStcd */
			return getPtcpStcd();
		case 857495875:/* mbhDscd */
			return getMbhDscd();
		case -1466424740:/* metScssDt */
			return getMetScssDt();
		case -1466424251:/* metScssTm */
			return getMetScssTm();
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
		case 437781395:/* ptcpStcd */
			setPtcpStcd((String)value);
			break;
		case 857495875:/* mbhDscd */
			setMbhDscd((String)value);
			break;
		case -1466424740:/* metScssDt */
			setMetScssDt((String)value);
			break;
		case -1466424251:/* metScssTm */
			setMetScssTm((String)value);
			break;
		default:
			break;
		}
	}
	
}
