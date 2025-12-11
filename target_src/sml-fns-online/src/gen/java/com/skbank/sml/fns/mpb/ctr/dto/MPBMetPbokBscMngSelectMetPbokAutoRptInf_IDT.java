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
	"metMngNo", "inqStaDt", "inqEndDt", "inqYM"
}, name="MPBMetPbokBscMngSelectMetPbokAutoRptInf_IDT")
@XmlRootElement(name="MPBMetPbokBscMngSelectMetPbokAutoRptInf_IDT")
@BxmCategory(logicalName="모임통장.관리.메인.정보.조회.컨트롤러.입력.IO", description="") 
public class MPBMetPbokBscMngSelectMetPbokAutoRptInf_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 1384517736L;
	
	
	
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
	 * 조회시작일자
	 */
	@ApiModelProperty(
		name = "inqStaDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("inqStaDt")
	@BxmOmm_Field(length=8, decimal=0, description="조회시작일자", align="left", fill="")
	private String inqStaDt= "";
	
	
	/**
	 * 조회종료일자
	 */
	@ApiModelProperty(
		name = "inqEndDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("inqEndDt")
	@BxmOmm_Field(length=8, decimal=0, description="조회종료일자", align="left", fill="")
	private String inqEndDt= "";
	
	
	/**
	 * 조회년월
	 */
	@ApiModelProperty(
		name = "inqYM"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("inqYM")
	@BxmOmm_Field(length=6, decimal=0, description="조회년월", align="left", fill="")
	private String inqYM= "";
	
	
	
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
	private boolean isSet_inqStaDt= false;
	protected final boolean isSet_inqStaDt(){
		return this.isSet_inqStaDt;
	}
	private void setIsSet_inqStaDt(boolean value){
		this.isSet_inqStaDt= value;
	}
	/**
	 * 조회시작일자
	 */
	@XmlTransient
	public String getInqStaDt(){
		return this.inqStaDt;
	}
	
	/**
	 * 조회시작일자
	 * 
	 * @param inqStaDt 조회시작일자
	 */
	public void setInqStaDt(String inqStaDt){
		this.inqStaDt= inqStaDt;
		this.setIsSet_inqStaDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_inqEndDt= false;
	protected final boolean isSet_inqEndDt(){
		return this.isSet_inqEndDt;
	}
	private void setIsSet_inqEndDt(boolean value){
		this.isSet_inqEndDt= value;
	}
	/**
	 * 조회종료일자
	 */
	@XmlTransient
	public String getInqEndDt(){
		return this.inqEndDt;
	}
	
	/**
	 * 조회종료일자
	 * 
	 * @param inqEndDt 조회종료일자
	 */
	public void setInqEndDt(String inqEndDt){
		this.inqEndDt= inqEndDt;
		this.setIsSet_inqEndDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_inqYM= false;
	protected final boolean isSet_inqYM(){
		return this.isSet_inqYM;
	}
	private void setIsSet_inqYM(boolean value){
		this.isSet_inqYM= value;
	}
	/**
	 * 조회년월
	 */
	@XmlTransient
	public String getInqYM(){
		return this.inqYM;
	}
	
	/**
	 * 조회년월
	 * 
	 * @param inqYM 조회년월
	 */
	public void setInqYM(String inqYM){
		this.inqYM= inqYM;
		this.setIsSet_inqYM(true);
	}
				
	@Override
	public MPBMetPbokBscMngSelectMetPbokAutoRptInf_IDT clone(){
		try{
			MPBMetPbokBscMngSelectMetPbokAutoRptInf_IDT object= (MPBMetPbokBscMngSelectMetPbokAutoRptInf_IDT)super.clone();
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
		result= prime * result + ((this.inqStaDt==null)?0:this.inqStaDt.hashCode());
		result= prime * result + ((this.inqEndDt==null)?0:this.inqEndDt.hashCode());
		result= prime * result + ((this.inqYM==null)?0:this.inqYM.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MPBMetPbokBscMngSelectMetPbokAutoRptInf_IDT other= (MPBMetPbokBscMngSelectMetPbokAutoRptInf_IDT)obj;
		{
			Object _metMngNo= getMetMngNo();
			Object __metMngNo= other.getMetMngNo();
			if ( _metMngNo== null ) { if ( __metMngNo!= null ) return false; }
			else if ( !_metMngNo.equals(__metMngNo) ) return false;
		}
		{
			Object _inqStaDt= getInqStaDt();
			Object __inqStaDt= other.getInqStaDt();
			if ( _inqStaDt== null ) { if ( __inqStaDt!= null ) return false; }
			else if ( !_inqStaDt.equals(__inqStaDt) ) return false;
		}
		{
			Object _inqEndDt= getInqEndDt();
			Object __inqEndDt= other.getInqEndDt();
			if ( _inqEndDt== null ) { if ( __inqEndDt!= null ) return false; }
			else if ( !_inqEndDt.equals(__inqEndDt) ) return false;
		}
		{
			Object _inqYM= getInqYM();
			Object __inqYM= other.getInqYM();
			if ( _inqYM== null ) { if ( __inqYM!= null ) return false; }
			else if ( !_inqYM.equals(__inqYM) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MPBMetPbokBscMngSelectMetPbokAutoRptInf_IDT.class.getName()).append(":\n");
		sb.append("\tmetMngNo: ");
		sb.append(metMngNo==null?"null":getMetMngNo());
		sb.append("\n");
		sb.append("\tinqStaDt: ");
		sb.append(inqStaDt==null?"null":getInqStaDt());
		sb.append("\n");
		sb.append("\tinqEndDt: ");
		sb.append(inqEndDt==null?"null":getInqEndDt());
		sb.append("\n");
		sb.append("\tinqYM: ");
		sb.append(inqYM==null?"null":getInqYM());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 9; /* metMngNo */
		messageLen+= 8; /* inqStaDt */
		messageLen+= 8; /* inqEndDt */
		messageLen+= 6; /* inqYM */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("metMngNo");
		list.add("inqStaDt");
		list.add("inqEndDt");
		list.add("inqYM");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("metMngNo", get("metMngNo"));
		map.put("inqStaDt", get("inqStaDt"));
		map.put("inqEndDt", get("inqEndDt"));
		map.put("inqYM", get("inqYM"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -468172085:/* metMngNo */
			return getMetMngNo();
		case 467946052:/* inqStaDt */
			return getInqStaDt();
		case 454840895:/* inqEndDt */
			return getInqEndDt();
		case 100358144:/* inqYM */
			return getInqYM();
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
		case 467946052:/* inqStaDt */
			setInqStaDt((String)value);
			break;
		case 454840895:/* inqEndDt */
			setInqEndDt((String)value);
			break;
		case 100358144:/* inqYM */
			setInqYM((String)value);
			break;
		default:
			break;
		}
	}
	
}
