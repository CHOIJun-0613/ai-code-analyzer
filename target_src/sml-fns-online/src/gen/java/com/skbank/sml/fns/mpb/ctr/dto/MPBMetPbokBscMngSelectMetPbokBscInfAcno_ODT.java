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
	"metMngNo", "metPbokDscd", "metPbokDscdNm", "metMbhSrno", "metMbhAlsNm", "metMbhDscd", "metMbhDscdNm"
}, name="MPBMetPbokBscMngSelectMetPbokBscInfAcno_ODT")
@XmlRootElement(name="MPBMetPbokBscMngSelectMetPbokBscInfAcno_ODT")
@BxmCategory(logicalName="모임통장.기본.정보.계좌번호.컨트롤러.출력.IO ", description="") 
public class MPBMetPbokBscMngSelectMetPbokBscInfAcno_ODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 1442861222L;
	
	
	
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
	 * 모임통장구분코드
	 */
	@ApiModelProperty(
		name = "metPbokDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metPbokDscd")
	@BxmOmm_Field(length=1, decimal=0, description="모임통장구분코드", align="left", fill="")
	private String metPbokDscd= "";
	
	
	/**
	 * 모임통장구분코드명
	 */
	@ApiModelProperty(
		name = "metPbokDscdNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metPbokDscdNm")
	@BxmOmm_Field(length=50, decimal=0, description="모임통장구분코드명", align="left", fill="")
	private String metPbokDscdNm= "";
	
	
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
	 * 모임회원구분코드
	 */
	@ApiModelProperty(
		name = "metMbhDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metMbhDscd")
	@BxmOmm_Field(length=1, decimal=0, description="모임회원구분코드", align="left", fill="")
	private String metMbhDscd= "";
	
	
	/**
	 * 모임회원구분코드명
	 */
	@ApiModelProperty(
		name = "metMbhDscdNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metMbhDscdNm")
	@BxmOmm_Field(length=50, decimal=0, description="모임회원구분코드명", align="left", fill="")
	private String metMbhDscdNm= "";
	
	
	
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
	private boolean isSet_metPbokDscd= false;
	protected final boolean isSet_metPbokDscd(){
		return this.isSet_metPbokDscd;
	}
	private void setIsSet_metPbokDscd(boolean value){
		this.isSet_metPbokDscd= value;
	}
	/**
	 * 모임통장구분코드
	 */
	@XmlTransient
	public String getMetPbokDscd(){
		return this.metPbokDscd;
	}
	
	/**
	 * 모임통장구분코드
	 * 
	 * @param metPbokDscd 모임통장구분코드
	 */
	public void setMetPbokDscd(String metPbokDscd){
		this.metPbokDscd= metPbokDscd;
		this.setIsSet_metPbokDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metPbokDscdNm= false;
	protected final boolean isSet_metPbokDscdNm(){
		return this.isSet_metPbokDscdNm;
	}
	private void setIsSet_metPbokDscdNm(boolean value){
		this.isSet_metPbokDscdNm= value;
	}
	/**
	 * 모임통장구분코드명
	 */
	@XmlTransient
	public String getMetPbokDscdNm(){
		return this.metPbokDscdNm;
	}
	
	/**
	 * 모임통장구분코드명
	 * 
	 * @param metPbokDscdNm 모임통장구분코드명
	 */
	public void setMetPbokDscdNm(String metPbokDscdNm){
		this.metPbokDscdNm= metPbokDscdNm;
		this.setIsSet_metPbokDscdNm(true);
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
	private boolean isSet_metMbhDscd= false;
	protected final boolean isSet_metMbhDscd(){
		return this.isSet_metMbhDscd;
	}
	private void setIsSet_metMbhDscd(boolean value){
		this.isSet_metMbhDscd= value;
	}
	/**
	 * 모임회원구분코드
	 */
	@XmlTransient
	public String getMetMbhDscd(){
		return this.metMbhDscd;
	}
	
	/**
	 * 모임회원구분코드
	 * 
	 * @param metMbhDscd 모임회원구분코드
	 */
	public void setMetMbhDscd(String metMbhDscd){
		this.metMbhDscd= metMbhDscd;
		this.setIsSet_metMbhDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metMbhDscdNm= false;
	protected final boolean isSet_metMbhDscdNm(){
		return this.isSet_metMbhDscdNm;
	}
	private void setIsSet_metMbhDscdNm(boolean value){
		this.isSet_metMbhDscdNm= value;
	}
	/**
	 * 모임회원구분코드명
	 */
	@XmlTransient
	public String getMetMbhDscdNm(){
		return this.metMbhDscdNm;
	}
	
	/**
	 * 모임회원구분코드명
	 * 
	 * @param metMbhDscdNm 모임회원구분코드명
	 */
	public void setMetMbhDscdNm(String metMbhDscdNm){
		this.metMbhDscdNm= metMbhDscdNm;
		this.setIsSet_metMbhDscdNm(true);
	}
				
	@Override
	public MPBMetPbokBscMngSelectMetPbokBscInfAcno_ODT clone(){
		try{
			MPBMetPbokBscMngSelectMetPbokBscInfAcno_ODT object= (MPBMetPbokBscMngSelectMetPbokBscInfAcno_ODT)super.clone();
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
		result= prime * result + ((this.metPbokDscd==null)?0:this.metPbokDscd.hashCode());
		result= prime * result + ((this.metPbokDscdNm==null)?0:this.metPbokDscdNm.hashCode());
		result= prime * result + ((this.metMbhSrno==null)?0:this.metMbhSrno.hashCode());
		result= prime * result + ((this.metMbhAlsNm==null)?0:this.metMbhAlsNm.hashCode());
		result= prime * result + ((this.metMbhDscd==null)?0:this.metMbhDscd.hashCode());
		result= prime * result + ((this.metMbhDscdNm==null)?0:this.metMbhDscdNm.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MPBMetPbokBscMngSelectMetPbokBscInfAcno_ODT other= (MPBMetPbokBscMngSelectMetPbokBscInfAcno_ODT)obj;
		{
			Object _metMngNo= getMetMngNo();
			Object __metMngNo= other.getMetMngNo();
			if ( _metMngNo== null ) { if ( __metMngNo!= null ) return false; }
			else if ( !_metMngNo.equals(__metMngNo) ) return false;
		}
		{
			Object _metPbokDscd= getMetPbokDscd();
			Object __metPbokDscd= other.getMetPbokDscd();
			if ( _metPbokDscd== null ) { if ( __metPbokDscd!= null ) return false; }
			else if ( !_metPbokDscd.equals(__metPbokDscd) ) return false;
		}
		{
			Object _metPbokDscdNm= getMetPbokDscdNm();
			Object __metPbokDscdNm= other.getMetPbokDscdNm();
			if ( _metPbokDscdNm== null ) { if ( __metPbokDscdNm!= null ) return false; }
			else if ( !_metPbokDscdNm.equals(__metPbokDscdNm) ) return false;
		}
		{
			Object _metMbhSrno= getMetMbhSrno();
			Object __metMbhSrno= other.getMetMbhSrno();
			if ( _metMbhSrno== null ) { if ( __metMbhSrno!= null ) return false; }
			else if ( !_metMbhSrno.equals(__metMbhSrno) ) return false;
		}
		{
			Object _metMbhAlsNm= getMetMbhAlsNm();
			Object __metMbhAlsNm= other.getMetMbhAlsNm();
			if ( _metMbhAlsNm== null ) { if ( __metMbhAlsNm!= null ) return false; }
			else if ( !_metMbhAlsNm.equals(__metMbhAlsNm) ) return false;
		}
		{
			Object _metMbhDscd= getMetMbhDscd();
			Object __metMbhDscd= other.getMetMbhDscd();
			if ( _metMbhDscd== null ) { if ( __metMbhDscd!= null ) return false; }
			else if ( !_metMbhDscd.equals(__metMbhDscd) ) return false;
		}
		{
			Object _metMbhDscdNm= getMetMbhDscdNm();
			Object __metMbhDscdNm= other.getMetMbhDscdNm();
			if ( _metMbhDscdNm== null ) { if ( __metMbhDscdNm!= null ) return false; }
			else if ( !_metMbhDscdNm.equals(__metMbhDscdNm) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MPBMetPbokBscMngSelectMetPbokBscInfAcno_ODT.class.getName()).append(":\n");
		sb.append("\tmetMngNo: ");
		sb.append(metMngNo==null?"null":getMetMngNo());
		sb.append("\n");
		sb.append("\tmetPbokDscd: ");
		sb.append(metPbokDscd==null?"null":getMetPbokDscd());
		sb.append("\n");
		sb.append("\tmetPbokDscdNm: ");
		sb.append(metPbokDscdNm==null?"null":getMetPbokDscdNm());
		sb.append("\n");
		sb.append("\tmetMbhSrno: ");
		sb.append(metMbhSrno==null?"null":getMetMbhSrno());
		sb.append("\n");
		sb.append("\tmetMbhAlsNm: ");
		sb.append(metMbhAlsNm==null?"null":getMetMbhAlsNm());
		sb.append("\n");
		sb.append("\tmetMbhDscd: ");
		sb.append(metMbhDscd==null?"null":getMetMbhDscd());
		sb.append("\n");
		sb.append("\tmetMbhDscdNm: ");
		sb.append(metMbhDscdNm==null?"null":getMetMbhDscdNm());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 9; /* metMngNo */
		messageLen+= 1; /* metPbokDscd */
		messageLen+= 50; /* metPbokDscdNm */
		messageLen+= 7; /* metMbhSrno */
		messageLen+= 60; /* metMbhAlsNm */
		messageLen+= 1; /* metMbhDscd */
		messageLen+= 50; /* metMbhDscdNm */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("metMngNo");
		list.add("metPbokDscd");
		list.add("metPbokDscdNm");
		list.add("metMbhSrno");
		list.add("metMbhAlsNm");
		list.add("metMbhDscd");
		list.add("metMbhDscdNm");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("metMngNo", get("metMngNo"));
		map.put("metPbokDscd", get("metPbokDscd"));
		map.put("metPbokDscdNm", get("metPbokDscdNm"));
		map.put("metMbhSrno", get("metMbhSrno"));
		map.put("metMbhAlsNm", get("metMbhAlsNm"));
		map.put("metMbhDscd", get("metMbhDscd"));
		map.put("metMbhDscdNm", get("metMbhDscdNm"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -468172085:/* metMngNo */
			return getMetMngNo();
		case 1867195290:/* metPbokDscd */
			return getMetPbokDscd();
		case -921653511:/* metPbokDscdNm */
			return getMetPbokDscdNm();
		case 715721463:/* metMbhSrno */
			return getMetMbhSrno();
		case 695730640:/* metMbhAlsNm */
			return getMetMbhAlsNm();
		case 715275207:/* metMbhDscd */
			return getMetMbhDscd();
		case 184709094:/* metMbhDscdNm */
			return getMetMbhDscdNm();
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
		case 1867195290:/* metPbokDscd */
			setMetPbokDscd((String)value);
			break;
		case -921653511:/* metPbokDscdNm */
			setMetPbokDscdNm((String)value);
			break;
		case 715721463:/* metMbhSrno */
			setMetMbhSrno((Integer)value);
			break;
		case 695730640:/* metMbhAlsNm */
			setMetMbhAlsNm((String)value);
			break;
		case 715275207:/* metMbhDscd */
			setMetMbhDscd((String)value);
			break;
		case 184709094:/* metMbhDscdNm */
			setMetMbhDscdNm((String)value);
			break;
		default:
			break;
		}
	}
	
}
