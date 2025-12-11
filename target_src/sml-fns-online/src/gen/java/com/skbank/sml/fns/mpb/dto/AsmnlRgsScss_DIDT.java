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
	"metChgDscd", "canYn", "metMngNo", "metMbhSrno"
}, name="AsmnlRgsScss_DIDT")
@XmlRootElement(name="AsmnlRgsScss_DIDT")
@BxmCategory(logicalName="공동명의.등록.해제.DBM.출력IO", description="") 
public class AsmnlRgsScss_DIDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -297791951L;
	
	
	
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
	 * 취소여부
	 */
	@ApiModelProperty(
		name = "canYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("canYn")
	@BxmOmm_Field(length=1, decimal=0, description="취소여부", align="left", fill="")
	private String canYn= "";
	
	
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
	private boolean isSet_canYn= false;
	protected final boolean isSet_canYn(){
		return this.isSet_canYn;
	}
	private void setIsSet_canYn(boolean value){
		this.isSet_canYn= value;
	}
	/**
	 * 취소여부
	 */
	@XmlTransient
	public String getCanYn(){
		return this.canYn;
	}
	
	/**
	 * 취소여부
	 * 
	 * @param canYn 취소여부
	 */
	public void setCanYn(String canYn){
		this.canYn= canYn;
		this.setIsSet_canYn(true);
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
				
	@Override
	public AsmnlRgsScss_DIDT clone(){
		try{
			AsmnlRgsScss_DIDT object= (AsmnlRgsScss_DIDT)super.clone();
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
		result= prime * result + ((this.canYn==null)?0:this.canYn.hashCode());
		result= prime * result + ((this.metMngNo==null)?0:this.metMngNo.hashCode());
		result= prime * result + ((this.metMbhSrno==null)?0:this.metMbhSrno.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final AsmnlRgsScss_DIDT other= (AsmnlRgsScss_DIDT)obj;
		{
			Object _metChgDscd= getMetChgDscd();
			Object __metChgDscd= other.getMetChgDscd();
			if ( _metChgDscd== null ) { if ( __metChgDscd!= null ) return false; }
			else if ( !_metChgDscd.equals(__metChgDscd) ) return false;
		}
		{
			Object _canYn= getCanYn();
			Object __canYn= other.getCanYn();
			if ( _canYn== null ) { if ( __canYn!= null ) return false; }
			else if ( !_canYn.equals(__canYn) ) return false;
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
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(AsmnlRgsScss_DIDT.class.getName()).append(":\n");
		sb.append("\tmetChgDscd: ");
		sb.append(metChgDscd==null?"null":getMetChgDscd());
		sb.append("\n");
		sb.append("\tcanYn: ");
		sb.append(canYn==null?"null":getCanYn());
		sb.append("\n");
		sb.append("\tmetMngNo: ");
		sb.append(metMngNo==null?"null":getMetMngNo());
		sb.append("\n");
		sb.append("\tmetMbhSrno: ");
		sb.append(metMbhSrno==null?"null":getMetMbhSrno());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 2; /* metChgDscd */
		messageLen+= 1; /* canYn */
		messageLen+= 9; /* metMngNo */
		messageLen+= 7; /* metMbhSrno */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("metChgDscd");
		list.add("canYn");
		list.add("metMngNo");
		list.add("metMbhSrno");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("metChgDscd", get("metChgDscd"));
		map.put("canYn", get("canYn"));
		map.put("metMngNo", get("metMngNo"));
		map.put("metMbhSrno", get("metMbhSrno"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 601024374:/* metChgDscd */
			return getMetChgDscd();
		case 94426885:/* canYn */
			return getCanYn();
		case -468172085:/* metMngNo */
			return getMetMngNo();
		case 715721463:/* metMbhSrno */
			return getMetMbhSrno();
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
		case 94426885:/* canYn */
			setCanYn((String)value);
			break;
		case -468172085:/* metMngNo */
			setMetMngNo((String)value);
			break;
		case 715721463:/* metMbhSrno */
			setMetMbhSrno((Integer)value);
			break;
		default:
			break;
		}
	}
	
}
