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
import com.fasterxml.jackson.annotation.JsonSetter;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
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
	"basYm", "expdAm"
}, name="MPBLifecExpdCnsmListPts_ODT")
@XmlRootElement(name="MPBLifecExpdCnsmListPts_ODT")
@BxmCategory(logicalName="생활비.지출.소비.목록.현황.컨트롤러.출력.IO", description="") 
public class MPBLifecExpdCnsmListPts_ODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 51644802L;
	
	
	
	/**
	 * 기준년월
	 */
	@ApiModelProperty(
		name = "basYm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("basYm")
	@BxmOmm_Field(length=7, decimal=0, description="기준년월", align="left", fill="")
	private String basYm= "";
	
	
	/**
	 * 지출금액
	 */
	@ApiModelProperty(
		name = "expdAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("expdAm")
	@BxmOmm_Field(length=19, decimal=3, description="지출금액", align="right", fill="0")
	private BigDecimal expdAm= new BigDecimal("0");
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_basYm= false;
	protected final boolean isSet_basYm(){
		return this.isSet_basYm;
	}
	private void setIsSet_basYm(boolean value){
		this.isSet_basYm= value;
	}
	/**
	 * 기준년월
	 */
	@XmlTransient
	public String getBasYm(){
		return this.basYm;
	}
	
	/**
	 * 기준년월
	 * 
	 * @param basYm 기준년월
	 */
	public void setBasYm(String basYm){
		this.basYm= basYm;
		this.setIsSet_basYm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_expdAm= false;
	protected final boolean isSet_expdAm(){
		return this.isSet_expdAm;
	}
	private void setIsSet_expdAm(boolean value){
		this.isSet_expdAm= value;
	}
	/**
	 * 지출금액
	 * BigDecimal - Double value setter
	 *
	 * @Param expdAm 지출금액
	 */
	public void setExpdAm(double expdAm) {
		setExpdAm(BigDecimal.valueOf(expdAm));
	}
	/**
	 * 지출금액
	 * BigDecimal - Long value setter
	 *
	 * @Param expdAm 지출금액
	 */
	public void setExpdAm(long expdAm) {
		setExpdAm(BigDecimal.valueOf(expdAm));
	}
	/**
	 * 지출금액
	 * BigDecimal - String value setter
	 *
	 * @Param expdAm 지출금액
	 */
	public void setExpdAm(String expdAm) {
		setExpdAm(new BigDecimal(expdAm));
	}
	/**
	 * 지출금액
	 */
	@XmlTransient
	public BigDecimal getExpdAm(){
		return this.expdAm;
	}
	
	/**
	 * 지출금액
	 * 
	 * @param expdAm 지출금액
	 */
	@JsonSetter("expdAm")
	public void setExpdAm(BigDecimal expdAm){
		this.expdAm= expdAm;
		this.setIsSet_expdAm(true);
	}
				
	@Override
	public MPBLifecExpdCnsmListPts_ODT clone(){
		try{
			MPBLifecExpdCnsmListPts_ODT object= (MPBLifecExpdCnsmListPts_ODT)super.clone();
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
		
		result= prime * result + ((this.basYm==null)?0:this.basYm.hashCode());
		result= prime * result + ((this.expdAm==null)?0:this.expdAm.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MPBLifecExpdCnsmListPts_ODT other= (MPBLifecExpdCnsmListPts_ODT)obj;
		{
			Object _basYm= getBasYm();
			Object __basYm= other.getBasYm();
			if ( _basYm== null ) { if ( __basYm!= null ) return false; }
			else if ( !_basYm.equals(__basYm) ) return false;
		}
		{
			Object _expdAm= getExpdAm();
			Object __expdAm= other.getExpdAm();
			if ( _expdAm== null ) { if ( __expdAm!= null ) return false; }
			else if ( !_expdAm.equals(__expdAm) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MPBLifecExpdCnsmListPts_ODT.class.getName()).append(":\n");
		sb.append("\tbasYm: ");
		sb.append(basYm==null?"null":getBasYm());
		sb.append("\n");
		sb.append("\texpdAm: ");
		sb.append(expdAm==null?"null":getExpdAm());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 7; /* basYm */
		messageLen+= 19; /* expdAm */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("basYm");
		list.add("expdAm");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("basYm", get("basYm"));
		map.put("expdAm", get("expdAm"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 93508168:/* basYm */
			return getBasYm();
		case -1289165709:/* expdAm */
			return getExpdAm();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 93508168:/* basYm */
			setBasYm((String)value);
			break;
		case -1289165709:/* expdAm */
			if ( value instanceof String ){
				setExpdAm((String)value);
			}
			else if ( value instanceof Double ){
				setExpdAm((Double)value);
			}
			else if ( value instanceof Long ){
				setExpdAm((Long)value);
			}
			else{
				setExpdAm((BigDecimal)value);
			}
			break;
		default:
			break;
		}
	}
	
}
