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
	"metMngNo", "inqStaYm", "inqEndYm"
}, name="MPBMetPbokFncTrnMngSelectLifecExpdCnsmPts_IDT")
@XmlRootElement(name="MPBMetPbokFncTrnMngSelectLifecExpdCnsmPts_IDT")
@BxmCategory(logicalName="생활비.지출.소비.현황.컨트롤러.입력.IO", description="") 
public class MPBMetPbokFncTrnMngSelectLifecExpdCnsmPts_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -2066791715L;
	
	
	
	/**
	 * 모임관리번호 
	 */
	@ApiModelProperty(
		name = "metMngNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metMngNo")
	@BxmOmm_Field(length=9, decimal=0, description="모임관리번호 ", align="left", fill="")
	private String metMngNo= "";
	
	
	/**
	 * 조회시작년월
	 */
	@ApiModelProperty(
		name = "inqStaYm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("inqStaYm")
	@BxmOmm_Field(length=6, decimal=0, description="조회시작년월", align="left", fill="")
	private String inqStaYm= "";
	
	
	/**
	 * 조회종료년월
	 */
	@ApiModelProperty(
		name = "inqEndYm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("inqEndYm")
	@BxmOmm_Field(length=6, decimal=0, description="조회종료년월", align="left", fill="")
	private String inqEndYm= "";
	
	
	
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
	private boolean isSet_inqStaYm= false;
	protected final boolean isSet_inqStaYm(){
		return this.isSet_inqStaYm;
	}
	private void setIsSet_inqStaYm(boolean value){
		this.isSet_inqStaYm= value;
	}
	/**
	 * 조회시작년월
	 */
	@XmlTransient
	public String getInqStaYm(){
		return this.inqStaYm;
	}
	
	/**
	 * 조회시작년월
	 * 
	 * @param inqStaYm 조회시작년월
	 */
	public void setInqStaYm(String inqStaYm){
		this.inqStaYm= inqStaYm;
		this.setIsSet_inqStaYm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_inqEndYm= false;
	protected final boolean isSet_inqEndYm(){
		return this.isSet_inqEndYm;
	}
	private void setIsSet_inqEndYm(boolean value){
		this.isSet_inqEndYm= value;
	}
	/**
	 * 조회종료년월
	 */
	@XmlTransient
	public String getInqEndYm(){
		return this.inqEndYm;
	}
	
	/**
	 * 조회종료년월
	 * 
	 * @param inqEndYm 조회종료년월
	 */
	public void setInqEndYm(String inqEndYm){
		this.inqEndYm= inqEndYm;
		this.setIsSet_inqEndYm(true);
	}
				
	@Override
	public MPBMetPbokFncTrnMngSelectLifecExpdCnsmPts_IDT clone(){
		try{
			MPBMetPbokFncTrnMngSelectLifecExpdCnsmPts_IDT object= (MPBMetPbokFncTrnMngSelectLifecExpdCnsmPts_IDT)super.clone();
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
		result= prime * result + ((this.inqStaYm==null)?0:this.inqStaYm.hashCode());
		result= prime * result + ((this.inqEndYm==null)?0:this.inqEndYm.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MPBMetPbokFncTrnMngSelectLifecExpdCnsmPts_IDT other= (MPBMetPbokFncTrnMngSelectLifecExpdCnsmPts_IDT)obj;
		{
			Object _metMngNo= getMetMngNo();
			Object __metMngNo= other.getMetMngNo();
			if ( _metMngNo== null ) { if ( __metMngNo!= null ) return false; }
			else if ( !_metMngNo.equals(__metMngNo) ) return false;
		}
		{
			Object _inqStaYm= getInqStaYm();
			Object __inqStaYm= other.getInqStaYm();
			if ( _inqStaYm== null ) { if ( __inqStaYm!= null ) return false; }
			else if ( !_inqStaYm.equals(__inqStaYm) ) return false;
		}
		{
			Object _inqEndYm= getInqEndYm();
			Object __inqEndYm= other.getInqEndYm();
			if ( _inqEndYm== null ) { if ( __inqEndYm!= null ) return false; }
			else if ( !_inqEndYm.equals(__inqEndYm) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MPBMetPbokFncTrnMngSelectLifecExpdCnsmPts_IDT.class.getName()).append(":\n");
		sb.append("\tmetMngNo: ");
		sb.append(metMngNo==null?"null":getMetMngNo());
		sb.append("\n");
		sb.append("\tinqStaYm: ");
		sb.append(inqStaYm==null?"null":getInqStaYm());
		sb.append("\n");
		sb.append("\tinqEndYm: ");
		sb.append(inqEndYm==null?"null":getInqEndYm());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 9; /* metMngNo */
		messageLen+= 6; /* inqStaYm */
		messageLen+= 6; /* inqEndYm */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("metMngNo");
		list.add("inqStaYm");
		list.add("inqEndYm");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("metMngNo", get("metMngNo"));
		map.put("inqStaYm", get("inqStaYm"));
		map.put("inqEndYm", get("inqEndYm"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -468172085:/* metMngNo */
			return getMetMngNo();
		case 467946696:/* inqStaYm */
			return getInqStaYm();
		case 454841539:/* inqEndYm */
			return getInqEndYm();
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
		case 467946696:/* inqStaYm */
			setInqStaYm((String)value);
			break;
		case 454841539:/* inqEndYm */
			setInqEndYm((String)value);
			break;
		default:
			break;
		}
	}
	
}
