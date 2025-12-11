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
	"metMngNo", "trnPrtsInqStaDt", "trnPrtsInqEndDt"
}, name="MPBMetPbokBscMngSelectMetPbokMainInf_IDT")
@XmlRootElement(name="MPBMetPbokBscMngSelectMetPbokMainInf_IDT")
@BxmCategory(logicalName="모임통장.관리.메인.정보.조회.컨트롤러.입력.IO", description="") 
public class MPBMetPbokBscMngSelectMetPbokMainInf_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 1298427598L;
	
	
	
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
	 * 거래내역조회시작일자
	 */
	@ApiModelProperty(
		name = "trnPrtsInqStaDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("trnPrtsInqStaDt")
	@BxmOmm_Field(length=8, decimal=0, description="거래내역조회시작일자", align="left", fill="")
	private String trnPrtsInqStaDt= "";
	
	
	/**
	 * 거래내역조회종료일자
	 */
	@ApiModelProperty(
		name = "trnPrtsInqEndDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("trnPrtsInqEndDt")
	@BxmOmm_Field(length=8, decimal=0, description="거래내역조회종료일자", align="left", fill="")
	private String trnPrtsInqEndDt= "";
	
	
	
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
	private boolean isSet_trnPrtsInqStaDt= false;
	protected final boolean isSet_trnPrtsInqStaDt(){
		return this.isSet_trnPrtsInqStaDt;
	}
	private void setIsSet_trnPrtsInqStaDt(boolean value){
		this.isSet_trnPrtsInqStaDt= value;
	}
	/**
	 * 거래내역조회시작일자
	 */
	@XmlTransient
	public String getTrnPrtsInqStaDt(){
		return this.trnPrtsInqStaDt;
	}
	
	/**
	 * 거래내역조회시작일자
	 * 
	 * @param trnPrtsInqStaDt 거래내역조회시작일자
	 */
	public void setTrnPrtsInqStaDt(String trnPrtsInqStaDt){
		this.trnPrtsInqStaDt= trnPrtsInqStaDt;
		this.setIsSet_trnPrtsInqStaDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_trnPrtsInqEndDt= false;
	protected final boolean isSet_trnPrtsInqEndDt(){
		return this.isSet_trnPrtsInqEndDt;
	}
	private void setIsSet_trnPrtsInqEndDt(boolean value){
		this.isSet_trnPrtsInqEndDt= value;
	}
	/**
	 * 거래내역조회종료일자
	 */
	@XmlTransient
	public String getTrnPrtsInqEndDt(){
		return this.trnPrtsInqEndDt;
	}
	
	/**
	 * 거래내역조회종료일자
	 * 
	 * @param trnPrtsInqEndDt 거래내역조회종료일자
	 */
	public void setTrnPrtsInqEndDt(String trnPrtsInqEndDt){
		this.trnPrtsInqEndDt= trnPrtsInqEndDt;
		this.setIsSet_trnPrtsInqEndDt(true);
	}
				
	@Override
	public MPBMetPbokBscMngSelectMetPbokMainInf_IDT clone(){
		try{
			MPBMetPbokBscMngSelectMetPbokMainInf_IDT object= (MPBMetPbokBscMngSelectMetPbokMainInf_IDT)super.clone();
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
		result= prime * result + ((this.trnPrtsInqStaDt==null)?0:this.trnPrtsInqStaDt.hashCode());
		result= prime * result + ((this.trnPrtsInqEndDt==null)?0:this.trnPrtsInqEndDt.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MPBMetPbokBscMngSelectMetPbokMainInf_IDT other= (MPBMetPbokBscMngSelectMetPbokMainInf_IDT)obj;
		{
			Object _metMngNo= getMetMngNo();
			Object __metMngNo= other.getMetMngNo();
			if ( _metMngNo== null ) { if ( __metMngNo!= null ) return false; }
			else if ( !_metMngNo.equals(__metMngNo) ) return false;
		}
		{
			Object _trnPrtsInqStaDt= getTrnPrtsInqStaDt();
			Object __trnPrtsInqStaDt= other.getTrnPrtsInqStaDt();
			if ( _trnPrtsInqStaDt== null ) { if ( __trnPrtsInqStaDt!= null ) return false; }
			else if ( !_trnPrtsInqStaDt.equals(__trnPrtsInqStaDt) ) return false;
		}
		{
			Object _trnPrtsInqEndDt= getTrnPrtsInqEndDt();
			Object __trnPrtsInqEndDt= other.getTrnPrtsInqEndDt();
			if ( _trnPrtsInqEndDt== null ) { if ( __trnPrtsInqEndDt!= null ) return false; }
			else if ( !_trnPrtsInqEndDt.equals(__trnPrtsInqEndDt) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MPBMetPbokBscMngSelectMetPbokMainInf_IDT.class.getName()).append(":\n");
		sb.append("\tmetMngNo: ");
		sb.append(metMngNo==null?"null":getMetMngNo());
		sb.append("\n");
		sb.append("\ttrnPrtsInqStaDt: ");
		sb.append(trnPrtsInqStaDt==null?"null":getTrnPrtsInqStaDt());
		sb.append("\n");
		sb.append("\ttrnPrtsInqEndDt: ");
		sb.append(trnPrtsInqEndDt==null?"null":getTrnPrtsInqEndDt());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 9; /* metMngNo */
		messageLen+= 8; /* trnPrtsInqStaDt */
		messageLen+= 8; /* trnPrtsInqEndDt */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("metMngNo");
		list.add("trnPrtsInqStaDt");
		list.add("trnPrtsInqEndDt");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("metMngNo", get("metMngNo"));
		map.put("trnPrtsInqStaDt", get("trnPrtsInqStaDt"));
		map.put("trnPrtsInqEndDt", get("trnPrtsInqEndDt"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -468172085:/* metMngNo */
			return getMetMngNo();
		case -375664843:/* trnPrtsInqStaDt */
			return getTrnPrtsInqStaDt();
		case -388770000:/* trnPrtsInqEndDt */
			return getTrnPrtsInqEndDt();
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
		case -375664843:/* trnPrtsInqStaDt */
			setTrnPrtsInqStaDt((String)value);
			break;
		case -388770000:/* trnPrtsInqEndDt */
			setTrnPrtsInqEndDt((String)value);
			break;
		default:
			break;
		}
	}
	
}
