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
	"metMbhSrno", "hpNo", "metMbhNm", "metMbhAlsNm", "ptcpStcd", "mbhDscd"
}, name="MPBMetPbokRprsChgAgrNtyMbhListInq_ODT")
@XmlRootElement(name="MPBMetPbokRprsChgAgrNtyMbhListInq_ODT")
@BxmCategory(logicalName="모임통장.대표.변경.동의.미참여.회원.목록.조회.컨트롤러.출력.IO", description="") 
public class MPBMetPbokRprsChgAgrNtyMbhListInq_ODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -647005473L;
	
	
	
	/**
	 * 모임회원일련번호
	 */
	@ApiModelProperty(
		name = "metMbhSrno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metMbhSrno")
	@BxmOmm_Field(length=30, decimal=0, description="모임회원일련번호", align="left", fill="")
	private String metMbhSrno= "";
	
	
	/**
	 * 핸드폰번호
	 */
	@ApiModelProperty(
		name = "hpNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("hpNo")
	@BxmOmm_Field(length=14, decimal=0, description="핸드폰번호", align="left", fill="")
	private String hpNo= "";
	
	
	/**
	 * 모임회원명
	 */
	@ApiModelProperty(
		name = "metMbhNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metMbhNm")
	@BxmOmm_Field(length=50, decimal=0, description="모임회원명", align="left", fill="")
	private String metMbhNm= "";
	
	
	/**
	 * 모임회원별칭명
	 */
	@ApiModelProperty(
		name = "metMbhAlsNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metMbhAlsNm")
	@BxmOmm_Field(length=40, decimal=0, description="모임회원별칭명", align="left", fill="")
	private String metMbhAlsNm= "";
	
	
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
	@BxmOmm_Field(length=1, decimal=0, description="회원구분코드", align="left", fill="")
	private String mbhDscd= "";
	
	
	
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
	public String getMetMbhSrno(){
		return this.metMbhSrno;
	}
	
	/**
	 * 모임회원일련번호
	 * 
	 * @param metMbhSrno 모임회원일련번호
	 */
	public void setMetMbhSrno(String metMbhSrno){
		this.metMbhSrno= metMbhSrno;
		this.setIsSet_metMbhSrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_hpNo= false;
	protected final boolean isSet_hpNo(){
		return this.isSet_hpNo;
	}
	private void setIsSet_hpNo(boolean value){
		this.isSet_hpNo= value;
	}
	/**
	 * 핸드폰번호
	 */
	@XmlTransient
	public String getHpNo(){
		return this.hpNo;
	}
	
	/**
	 * 핸드폰번호
	 * 
	 * @param hpNo 핸드폰번호
	 */
	public void setHpNo(String hpNo){
		this.hpNo= hpNo;
		this.setIsSet_hpNo(true);
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
				
	@Override
	public MPBMetPbokRprsChgAgrNtyMbhListInq_ODT clone(){
		try{
			MPBMetPbokRprsChgAgrNtyMbhListInq_ODT object= (MPBMetPbokRprsChgAgrNtyMbhListInq_ODT)super.clone();
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
		
		result= prime * result + ((this.metMbhSrno==null)?0:this.metMbhSrno.hashCode());
		result= prime * result + ((this.hpNo==null)?0:this.hpNo.hashCode());
		result= prime * result + ((this.metMbhNm==null)?0:this.metMbhNm.hashCode());
		result= prime * result + ((this.metMbhAlsNm==null)?0:this.metMbhAlsNm.hashCode());
		result= prime * result + ((this.ptcpStcd==null)?0:this.ptcpStcd.hashCode());
		result= prime * result + ((this.mbhDscd==null)?0:this.mbhDscd.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MPBMetPbokRprsChgAgrNtyMbhListInq_ODT other= (MPBMetPbokRprsChgAgrNtyMbhListInq_ODT)obj;
		{
			Object _metMbhSrno= getMetMbhSrno();
			Object __metMbhSrno= other.getMetMbhSrno();
			if ( _metMbhSrno== null ) { if ( __metMbhSrno!= null ) return false; }
			else if ( !_metMbhSrno.equals(__metMbhSrno) ) return false;
		}
		{
			Object _hpNo= getHpNo();
			Object __hpNo= other.getHpNo();
			if ( _hpNo== null ) { if ( __hpNo!= null ) return false; }
			else if ( !_hpNo.equals(__hpNo) ) return false;
		}
		{
			Object _metMbhNm= getMetMbhNm();
			Object __metMbhNm= other.getMetMbhNm();
			if ( _metMbhNm== null ) { if ( __metMbhNm!= null ) return false; }
			else if ( !_metMbhNm.equals(__metMbhNm) ) return false;
		}
		{
			Object _metMbhAlsNm= getMetMbhAlsNm();
			Object __metMbhAlsNm= other.getMetMbhAlsNm();
			if ( _metMbhAlsNm== null ) { if ( __metMbhAlsNm!= null ) return false; }
			else if ( !_metMbhAlsNm.equals(__metMbhAlsNm) ) return false;
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
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MPBMetPbokRprsChgAgrNtyMbhListInq_ODT.class.getName()).append(":\n");
		sb.append("\tmetMbhSrno: ");
		sb.append(metMbhSrno==null?"null":getMetMbhSrno());
		sb.append("\n");
		sb.append("\thpNo: ");
		sb.append(hpNo==null?"null":getHpNo());
		sb.append("\n");
		sb.append("\tmetMbhNm: ");
		sb.append(metMbhNm==null?"null":getMetMbhNm());
		sb.append("\n");
		sb.append("\tmetMbhAlsNm: ");
		sb.append(metMbhAlsNm==null?"null":getMetMbhAlsNm());
		sb.append("\n");
		sb.append("\tptcpStcd: ");
		sb.append(ptcpStcd==null?"null":getPtcpStcd());
		sb.append("\n");
		sb.append("\tmbhDscd: ");
		sb.append(mbhDscd==null?"null":getMbhDscd());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 30; /* metMbhSrno */
		messageLen+= 14; /* hpNo */
		messageLen+= 50; /* metMbhNm */
		messageLen+= 40; /* metMbhAlsNm */
		messageLen+= 1; /* ptcpStcd */
		messageLen+= 1; /* mbhDscd */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("metMbhSrno");
		list.add("hpNo");
		list.add("metMbhNm");
		list.add("metMbhAlsNm");
		list.add("ptcpStcd");
		list.add("mbhDscd");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("metMbhSrno", get("metMbhSrno"));
		map.put("hpNo", get("hpNo"));
		map.put("metMbhNm", get("metMbhNm"));
		map.put("metMbhAlsNm", get("metMbhAlsNm"));
		map.put("ptcpStcd", get("ptcpStcd"));
		map.put("mbhDscd", get("mbhDscd"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 715721463:/* metMbhSrno */
			return getMetMbhSrno();
		case 3208425:/* hpNo */
			return getHpNo();
		case -468528618:/* metMbhNm */
			return getMetMbhNm();
		case 695730640:/* metMbhAlsNm */
			return getMetMbhAlsNm();
		case 437781395:/* ptcpStcd */
			return getPtcpStcd();
		case 857495875:/* mbhDscd */
			return getMbhDscd();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 715721463:/* metMbhSrno */
			setMetMbhSrno((String)value);
			break;
		case 3208425:/* hpNo */
			setHpNo((String)value);
			break;
		case -468528618:/* metMbhNm */
			setMetMbhNm((String)value);
			break;
		case 695730640:/* metMbhAlsNm */
			setMetMbhAlsNm((String)value);
			break;
		case 437781395:/* ptcpStcd */
			setPtcpStcd((String)value);
			break;
		case 857495875:/* mbhDscd */
			setMbhDscd((String)value);
			break;
		default:
			break;
		}
	}
	
}
