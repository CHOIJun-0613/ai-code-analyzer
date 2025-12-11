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
	"utzpeNoCfcd", "ebnkUtzpeNo", "esnsMbhNo", "metMbhAlsNm", "agmdCollDt", "ancSndDscd"
}, name="MetPbokMbhInfGrid1Rgs_DIDT")
@XmlRootElement(name="MetPbokMbhInfGrid1Rgs_DIDT")
@BxmCategory(logicalName="모임통장.회원.정보.그리드1.등록.DBM.입력.IO", description="") 
public class MetPbokMbhInfGrid1Rgs_DIDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 1021833175L;
	
	
	
	/**
	 * 이용자번호분류코드
	 */
	@ApiModelProperty(
		name = "utzpeNoCfcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("utzpeNoCfcd")
	@BxmOmm_Field(length=2, decimal=0, description="이용자번호분류코드", align="left", fill="")
	private String utzpeNoCfcd= "";
	
	
	/**
	 * 전자뱅킹이용자번호
	 */
	@ApiModelProperty(
		name = "ebnkUtzpeNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ebnkUtzpeNo")
	@BxmOmm_Field(length=13, decimal=0, description="전자뱅킹이용자번호", align="left", fill="", formatType="masking", format="M191")
	private String ebnkUtzpeNo= "";
	
	
	/**
	 * 간편회원번호
	 */
	@ApiModelProperty(
		name = "esnsMbhNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("esnsMbhNo")
	@BxmOmm_Field(length=11, decimal=0, description="간편회원번호", align="left", fill="")
	private String esnsMbhNo= "";
	
	
	/**
	 * 모임회원별칭명
	 */
	@ApiModelProperty(
		name = "metMbhAlsNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metMbhAlsNm")
	@BxmOmm_Field(length=60, decimal=0, description="모임회원별칭명", align="left", fill="")
	private String metMbhAlsNm= "";
	
	
	/**
	 * 동의서징구일자
	 */
	@ApiModelProperty(
		name = "agmdCollDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("agmdCollDt")
	@BxmOmm_Field(length=8, decimal=0, description="동의서징구일자", align="left", fill="")
	private String agmdCollDt= "";
	
	
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
	private boolean isSet_utzpeNoCfcd= false;
	protected final boolean isSet_utzpeNoCfcd(){
		return this.isSet_utzpeNoCfcd;
	}
	private void setIsSet_utzpeNoCfcd(boolean value){
		this.isSet_utzpeNoCfcd= value;
	}
	/**
	 * 이용자번호분류코드
	 */
	@XmlTransient
	public String getUtzpeNoCfcd(){
		return this.utzpeNoCfcd;
	}
	
	/**
	 * 이용자번호분류코드
	 * 
	 * @param utzpeNoCfcd 이용자번호분류코드
	 */
	public void setUtzpeNoCfcd(String utzpeNoCfcd){
		this.utzpeNoCfcd= utzpeNoCfcd;
		this.setIsSet_utzpeNoCfcd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ebnkUtzpeNo= false;
	protected final boolean isSet_ebnkUtzpeNo(){
		return this.isSet_ebnkUtzpeNo;
	}
	private void setIsSet_ebnkUtzpeNo(boolean value){
		this.isSet_ebnkUtzpeNo= value;
	}
	/**
	 * 전자뱅킹이용자번호
	 */
	@XmlTransient
	public String getEbnkUtzpeNo(){
		return this.ebnkUtzpeNo;
	}
	
	/**
	 * 전자뱅킹이용자번호
	 * 
	 * @param ebnkUtzpeNo 전자뱅킹이용자번호
	 */
	public void setEbnkUtzpeNo(String ebnkUtzpeNo){
		this.ebnkUtzpeNo= ebnkUtzpeNo;
		this.setIsSet_ebnkUtzpeNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_esnsMbhNo= false;
	protected final boolean isSet_esnsMbhNo(){
		return this.isSet_esnsMbhNo;
	}
	private void setIsSet_esnsMbhNo(boolean value){
		this.isSet_esnsMbhNo= value;
	}
	/**
	 * 간편회원번호
	 */
	@XmlTransient
	public String getEsnsMbhNo(){
		return this.esnsMbhNo;
	}
	
	/**
	 * 간편회원번호
	 * 
	 * @param esnsMbhNo 간편회원번호
	 */
	public void setEsnsMbhNo(String esnsMbhNo){
		this.esnsMbhNo= esnsMbhNo;
		this.setIsSet_esnsMbhNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metMbhAlsNm= false;
	protected final boolean isSet_metMbhAlsNm(){
		return this.isSet_metMbhAlsNm;
	}
	private void setIsSet_metMbhAlsNm(boolean value){
		this.isSet_metMbhAlsNm= value;
	}
	/**
	 * 모임회원별칭명
	 */
	@XmlTransient
	public String getMetMbhAlsNm(){
		return this.metMbhAlsNm;
	}
	
	/**
	 * 모임회원별칭명
	 * 
	 * @param metMbhAlsNm 모임회원별칭명
	 */
	public void setMetMbhAlsNm(String metMbhAlsNm){
		this.metMbhAlsNm= metMbhAlsNm;
		this.setIsSet_metMbhAlsNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_agmdCollDt= false;
	protected final boolean isSet_agmdCollDt(){
		return this.isSet_agmdCollDt;
	}
	private void setIsSet_agmdCollDt(boolean value){
		this.isSet_agmdCollDt= value;
	}
	/**
	 * 동의서징구일자
	 */
	@XmlTransient
	public String getAgmdCollDt(){
		return this.agmdCollDt;
	}
	
	/**
	 * 동의서징구일자
	 * 
	 * @param agmdCollDt 동의서징구일자
	 */
	public void setAgmdCollDt(String agmdCollDt){
		this.agmdCollDt= agmdCollDt;
		this.setIsSet_agmdCollDt(true);
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
	public MetPbokMbhInfGrid1Rgs_DIDT clone(){
		try{
			MetPbokMbhInfGrid1Rgs_DIDT object= (MetPbokMbhInfGrid1Rgs_DIDT)super.clone();
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
		
		result= prime * result + ((this.utzpeNoCfcd==null)?0:this.utzpeNoCfcd.hashCode());
		result= prime * result + ((this.ebnkUtzpeNo==null)?0:this.ebnkUtzpeNo.hashCode());
		result= prime * result + ((this.esnsMbhNo==null)?0:this.esnsMbhNo.hashCode());
		result= prime * result + ((this.metMbhAlsNm==null)?0:this.metMbhAlsNm.hashCode());
		result= prime * result + ((this.agmdCollDt==null)?0:this.agmdCollDt.hashCode());
		result= prime * result + ((this.ancSndDscd==null)?0:this.ancSndDscd.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MetPbokMbhInfGrid1Rgs_DIDT other= (MetPbokMbhInfGrid1Rgs_DIDT)obj;
		{
			Object _utzpeNoCfcd= getUtzpeNoCfcd();
			Object __utzpeNoCfcd= other.getUtzpeNoCfcd();
			if ( _utzpeNoCfcd== null ) { if ( __utzpeNoCfcd!= null ) return false; }
			else if ( !_utzpeNoCfcd.equals(__utzpeNoCfcd) ) return false;
		}
		{
			Object _ebnkUtzpeNo= getEbnkUtzpeNo();
			Object __ebnkUtzpeNo= other.getEbnkUtzpeNo();
			if ( _ebnkUtzpeNo== null ) { if ( __ebnkUtzpeNo!= null ) return false; }
			else if ( !_ebnkUtzpeNo.equals(__ebnkUtzpeNo) ) return false;
		}
		{
			Object _esnsMbhNo= getEsnsMbhNo();
			Object __esnsMbhNo= other.getEsnsMbhNo();
			if ( _esnsMbhNo== null ) { if ( __esnsMbhNo!= null ) return false; }
			else if ( !_esnsMbhNo.equals(__esnsMbhNo) ) return false;
		}
		{
			Object _metMbhAlsNm= getMetMbhAlsNm();
			Object __metMbhAlsNm= other.getMetMbhAlsNm();
			if ( _metMbhAlsNm== null ) { if ( __metMbhAlsNm!= null ) return false; }
			else if ( !_metMbhAlsNm.equals(__metMbhAlsNm) ) return false;
		}
		{
			Object _agmdCollDt= getAgmdCollDt();
			Object __agmdCollDt= other.getAgmdCollDt();
			if ( _agmdCollDt== null ) { if ( __agmdCollDt!= null ) return false; }
			else if ( !_agmdCollDt.equals(__agmdCollDt) ) return false;
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
	
		sb.append("\n[").append(MetPbokMbhInfGrid1Rgs_DIDT.class.getName()).append(":\n");
		sb.append("\tutzpeNoCfcd: ");
		sb.append(utzpeNoCfcd==null?"null":getUtzpeNoCfcd());
		sb.append("\n");
		sb.append("\tebnkUtzpeNo: ");
		sb.append(ebnkUtzpeNo==null?"null":getEbnkUtzpeNo().toString().replaceAll(".", "."));
		sb.append("\n");
		sb.append("\tesnsMbhNo: ");
		sb.append(esnsMbhNo==null?"null":getEsnsMbhNo());
		sb.append("\n");
		sb.append("\tmetMbhAlsNm: ");
		sb.append(metMbhAlsNm==null?"null":getMetMbhAlsNm());
		sb.append("\n");
		sb.append("\tagmdCollDt: ");
		sb.append(agmdCollDt==null?"null":getAgmdCollDt());
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
		
		messageLen+= 2; /* utzpeNoCfcd */
		messageLen+= 13; /* ebnkUtzpeNo */
		messageLen+= 11; /* esnsMbhNo */
		messageLen+= 60; /* metMbhAlsNm */
		messageLen+= 8; /* agmdCollDt */
		messageLen+= 1; /* ancSndDscd */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("utzpeNoCfcd");
		list.add("ebnkUtzpeNo");
		list.add("esnsMbhNo");
		list.add("metMbhAlsNm");
		list.add("agmdCollDt");
		list.add("ancSndDscd");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("utzpeNoCfcd", get("utzpeNoCfcd"));
		map.put("ebnkUtzpeNo", get("ebnkUtzpeNo"));
		map.put("esnsMbhNo", get("esnsMbhNo"));
		map.put("metMbhAlsNm", get("metMbhAlsNm"));
		map.put("agmdCollDt", get("agmdCollDt"));
		map.put("ancSndDscd", get("ancSndDscd"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 1125715573:/* utzpeNoCfcd */
			return getUtzpeNoCfcd();
		case -1070809513:/* ebnkUtzpeNo */
			return getEbnkUtzpeNo();
		case -1396906143:/* esnsMbhNo */
			return getEsnsMbhNo();
		case 695730640:/* metMbhAlsNm */
			return getMetMbhAlsNm();
		case -1798348999:/* agmdCollDt */
			return getAgmdCollDt();
		case 1498154883:/* ancSndDscd */
			return getAncSndDscd();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 1125715573:/* utzpeNoCfcd */
			setUtzpeNoCfcd((String)value);
			break;
		case -1070809513:/* ebnkUtzpeNo */
			setEbnkUtzpeNo((String)value);
			break;
		case -1396906143:/* esnsMbhNo */
			setEsnsMbhNo((String)value);
			break;
		case 695730640:/* metMbhAlsNm */
			setMetMbhAlsNm((String)value);
			break;
		case -1798348999:/* agmdCollDt */
			setAgmdCollDt((String)value);
			break;
		case 1498154883:/* ancSndDscd */
			setAncSndDscd((String)value);
			break;
		default:
			break;
		}
	}
	
}
