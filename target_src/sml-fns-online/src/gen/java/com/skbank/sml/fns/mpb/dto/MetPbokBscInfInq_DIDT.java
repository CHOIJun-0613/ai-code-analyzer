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
 * IBSMR0005769
 */
@XmlType(propOrder={
	"inqDis", "nxtMetMngNo", "metMngNo"
}, name="MetPbokBscInfInq_DIDT")
@XmlRootElement(name="MetPbokBscInfInq_DIDT")
@BxmCategory(logicalName="모임통장.기본.정보.조회.DBM.입력.IO", description="IBSMR0005769") 
public class MetPbokBscInfInq_DIDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 1366812147L;
	
	
	
	/**
	 * 조회구분
	 */
	@ApiModelProperty(
		name = "inqDis"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("inqDis")
	@BxmOmm_Field(length=2, decimal=0, description="조회구분", align="left", fill="")
	private String inqDis= "";
	
	
	/**
	 * 다음모임관리번호
	 */
	@ApiModelProperty(
		name = "nxtMetMngNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("nxtMetMngNo")
	@BxmOmm_Field(length=9, decimal=0, description="다음모임관리번호", align="left", fill="")
	private String nxtMetMngNo= "";
	
	
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
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_inqDis= false;
	protected final boolean isSet_inqDis(){
		return this.isSet_inqDis;
	}
	private void setIsSet_inqDis(boolean value){
		this.isSet_inqDis= value;
	}
	/**
	 * 조회구분
	 */
	@XmlTransient
	public String getInqDis(){
		return this.inqDis;
	}
	
	/**
	 * 조회구분
	 * 
	 * @param inqDis 조회구분
	 */
	public void setInqDis(String inqDis){
		this.inqDis= inqDis;
		this.setIsSet_inqDis(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_nxtMetMngNo= false;
	protected final boolean isSet_nxtMetMngNo(){
		return this.isSet_nxtMetMngNo;
	}
	private void setIsSet_nxtMetMngNo(boolean value){
		this.isSet_nxtMetMngNo= value;
	}
	/**
	 * 다음모임관리번호
	 */
	@XmlTransient
	public String getNxtMetMngNo(){
		return this.nxtMetMngNo;
	}
	
	/**
	 * 다음모임관리번호
	 * 
	 * @param nxtMetMngNo 다음모임관리번호
	 */
	public void setNxtMetMngNo(String nxtMetMngNo){
		this.nxtMetMngNo= nxtMetMngNo;
		this.setIsSet_nxtMetMngNo(true);
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
				
	@Override
	public MetPbokBscInfInq_DIDT clone(){
		try{
			MetPbokBscInfInq_DIDT object= (MetPbokBscInfInq_DIDT)super.clone();
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
		
		result= prime * result + ((this.inqDis==null)?0:this.inqDis.hashCode());
		result= prime * result + ((this.nxtMetMngNo==null)?0:this.nxtMetMngNo.hashCode());
		result= prime * result + ((this.metMngNo==null)?0:this.metMngNo.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MetPbokBscInfInq_DIDT other= (MetPbokBscInfInq_DIDT)obj;
		{
			Object _inqDis= getInqDis();
			Object __inqDis= other.getInqDis();
			if ( _inqDis== null ) { if ( __inqDis!= null ) return false; }
			else if ( !_inqDis.equals(__inqDis) ) return false;
		}
		{
			Object _nxtMetMngNo= getNxtMetMngNo();
			Object __nxtMetMngNo= other.getNxtMetMngNo();
			if ( _nxtMetMngNo== null ) { if ( __nxtMetMngNo!= null ) return false; }
			else if ( !_nxtMetMngNo.equals(__nxtMetMngNo) ) return false;
		}
		{
			Object _metMngNo= getMetMngNo();
			Object __metMngNo= other.getMetMngNo();
			if ( _metMngNo== null ) { if ( __metMngNo!= null ) return false; }
			else if ( !_metMngNo.equals(__metMngNo) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MetPbokBscInfInq_DIDT.class.getName()).append(":\n");
		sb.append("\tinqDis: ");
		sb.append(inqDis==null?"null":getInqDis());
		sb.append("\n");
		sb.append("\tnxtMetMngNo: ");
		sb.append(nxtMetMngNo==null?"null":getNxtMetMngNo());
		sb.append("\n");
		sb.append("\tmetMngNo: ");
		sb.append(metMngNo==null?"null":getMetMngNo());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 2; /* inqDis */
		messageLen+= 9; /* nxtMetMngNo */
		messageLen+= 9; /* metMngNo */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("inqDis");
		list.add("nxtMetMngNo");
		list.add("metMngNo");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("inqDis", get("inqDis"));
		map.put("nxtMetMngNo", get("nxtMetMngNo"));
		map.put("metMngNo", get("metMngNo"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -1183884030:/* inqDis */
			return getInqDis();
		case -1817786155:/* nxtMetMngNo */
			return getNxtMetMngNo();
		case -468172085:/* metMngNo */
			return getMetMngNo();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -1183884030:/* inqDis */
			setInqDis((String)value);
			break;
		case -1817786155:/* nxtMetMngNo */
			setNxtMetMngNo((String)value);
			break;
		case -468172085:/* metMngNo */
			setMetMngNo((String)value);
			break;
		default:
			break;
		}
	}
	
}
