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
	"metMngNo", "trnDt", "trnSrno", "chgAgrYn"
}, name="MetPbokRprsChgAgrMbhInq_DIDT")
@XmlRootElement(name="MetPbokRprsChgAgrMbhInq_DIDT")
@BxmCategory(logicalName="모임통장.대표.변경.동의.회원.조회.DBM.입력.IO", description="") 
public class MetPbokRprsChgAgrMbhInq_DIDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 415893622L;
	
	
	
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
	 * 거래일자
	 */
	@ApiModelProperty(
		name = "trnDt"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("trnDt")
	@BxmOmm_Field(length=8, decimal=0, description="거래일자", align="right", fill="")
	private Integer trnDt= 0;
	
	
	/**
	 * 거래일련번호
	 */
	@ApiModelProperty(
		name = "trnSrno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("trnSrno")
	@BxmOmm_Field(length=4, decimal=0, description="거래일련번호", align="left", fill="")
	private String trnSrno= "";
	
	
	/**
	 * 변경동의여부
	 */
	@ApiModelProperty(
		name = "chgAgrYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("chgAgrYn")
	@BxmOmm_Field(length=1, decimal=0, description="변경동의여부", align="left", fill="")
	private String chgAgrYn= "";
	
	
	
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
	private boolean isSet_trnDt= false;
	protected final boolean isSet_trnDt(){
		return this.isSet_trnDt;
	}
	private void setIsSet_trnDt(boolean value){
		this.isSet_trnDt= value;
	}
	/**
	 * 거래일자
	 */
	@XmlTransient
	public Integer getTrnDt(){
		return this.trnDt;
	}
	
	/**
	 * 거래일자
	 * 
	 * @param trnDt 거래일자
	 */
	public void setTrnDt(Integer trnDt){
		this.trnDt= trnDt;
		this.setIsSet_trnDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_trnSrno= false;
	protected final boolean isSet_trnSrno(){
		return this.isSet_trnSrno;
	}
	private void setIsSet_trnSrno(boolean value){
		this.isSet_trnSrno= value;
	}
	/**
	 * 거래일련번호
	 */
	@XmlTransient
	public String getTrnSrno(){
		return this.trnSrno;
	}
	
	/**
	 * 거래일련번호
	 * 
	 * @param trnSrno 거래일련번호
	 */
	public void setTrnSrno(String trnSrno){
		this.trnSrno= trnSrno;
		this.setIsSet_trnSrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_chgAgrYn= false;
	protected final boolean isSet_chgAgrYn(){
		return this.isSet_chgAgrYn;
	}
	private void setIsSet_chgAgrYn(boolean value){
		this.isSet_chgAgrYn= value;
	}
	/**
	 * 변경동의여부
	 */
	@XmlTransient
	public String getChgAgrYn(){
		return this.chgAgrYn;
	}
	
	/**
	 * 변경동의여부
	 * 
	 * @param chgAgrYn 변경동의여부
	 */
	public void setChgAgrYn(String chgAgrYn){
		this.chgAgrYn= chgAgrYn;
		this.setIsSet_chgAgrYn(true);
	}
				
	@Override
	public MetPbokRprsChgAgrMbhInq_DIDT clone(){
		try{
			MetPbokRprsChgAgrMbhInq_DIDT object= (MetPbokRprsChgAgrMbhInq_DIDT)super.clone();
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
		result= prime * result + ((this.trnDt==null)?0:this.trnDt.hashCode());
		result= prime * result + ((this.trnSrno==null)?0:this.trnSrno.hashCode());
		result= prime * result + ((this.chgAgrYn==null)?0:this.chgAgrYn.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MetPbokRprsChgAgrMbhInq_DIDT other= (MetPbokRprsChgAgrMbhInq_DIDT)obj;
		{
			Object _metMngNo= getMetMngNo();
			Object __metMngNo= other.getMetMngNo();
			if ( _metMngNo== null ) { if ( __metMngNo!= null ) return false; }
			else if ( !_metMngNo.equals(__metMngNo) ) return false;
		}
		{
			Object _trnDt= getTrnDt();
			Object __trnDt= other.getTrnDt();
			if ( _trnDt== null ) { if ( __trnDt!= null ) return false; }
			else if ( !_trnDt.equals(__trnDt) ) return false;
		}
		{
			Object _trnSrno= getTrnSrno();
			Object __trnSrno= other.getTrnSrno();
			if ( _trnSrno== null ) { if ( __trnSrno!= null ) return false; }
			else if ( !_trnSrno.equals(__trnSrno) ) return false;
		}
		{
			Object _chgAgrYn= getChgAgrYn();
			Object __chgAgrYn= other.getChgAgrYn();
			if ( _chgAgrYn== null ) { if ( __chgAgrYn!= null ) return false; }
			else if ( !_chgAgrYn.equals(__chgAgrYn) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MetPbokRprsChgAgrMbhInq_DIDT.class.getName()).append(":\n");
		sb.append("\tmetMngNo: ");
		sb.append(metMngNo==null?"null":getMetMngNo());
		sb.append("\n");
		sb.append("\ttrnDt: ");
		sb.append(trnDt==null?"null":getTrnDt());
		sb.append("\n");
		sb.append("\ttrnSrno: ");
		sb.append(trnSrno==null?"null":getTrnSrno());
		sb.append("\n");
		sb.append("\tchgAgrYn: ");
		sb.append(chgAgrYn==null?"null":getChgAgrYn());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 1; /* metMngNo */
		messageLen+= 8; /* trnDt */
		messageLen+= 4; /* trnSrno */
		messageLen+= 1; /* chgAgrYn */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("metMngNo");
		list.add("trnDt");
		list.add("trnSrno");
		list.add("chgAgrYn");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("metMngNo", get("metMngNo"));
		map.put("trnDt", get("trnDt"));
		map.put("trnSrno", get("trnSrno"));
		map.put("chgAgrYn", get("chgAgrYn"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -468172085:/* metMngNo */
			return getMetMngNo();
		case 110632544:/* trnDt */
			return getTrnDt();
		case -1055859152:/* trnSrno */
			return getTrnSrno();
		case 1562645951:/* chgAgrYn */
			return getChgAgrYn();
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
		case 110632544:/* trnDt */
			setTrnDt((Integer)value);
			break;
		case -1055859152:/* trnSrno */
			setTrnSrno((String)value);
			break;
		case 1562645951:/* chgAgrYn */
			setChgAgrYn((String)value);
			break;
		default:
			break;
		}
	}
	
}
