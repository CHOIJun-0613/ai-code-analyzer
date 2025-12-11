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
	"dt", "bal"
}, name="MNPMnyPinFncTrnSelectMnyBal_DTO")
@XmlRootElement(name="MNPMnyPinFncTrnSelectMnyBal_DTO")
@BxmCategory(logicalName="머니클립 월말 잔액조회.컴포넌트.출력SubIO", description="") 
public class MNPMnyPinFncTrnSelectMnyBal_DTO implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -110537212L;
	
	
	
	/**
	 * 일자
	 */
	@ApiModelProperty(
		name = "dt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dt")
	@BxmOmm_Field(length=8, decimal=0, description="일자", align="left", fill="")
	private String dt= "";
	
	
	/**
	 * 잔액
	 */
	@ApiModelProperty(
		name = "bal"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("bal")
	@BxmOmm_Field(length=19, decimal=3, description="잔액", align="right", fill="0")
	private BigDecimal bal= new BigDecimal("0");
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dt= false;
	protected final boolean isSet_dt(){
		return this.isSet_dt;
	}
	private void setIsSet_dt(boolean value){
		this.isSet_dt= value;
	}
	/**
	 * 일자
	 */
	@XmlTransient
	public String getDt(){
		return this.dt;
	}
	
	/**
	 * 일자
	 * 
	 * @param dt 일자
	 */
	public void setDt(String dt){
		this.dt= dt;
		this.setIsSet_dt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_bal= false;
	protected final boolean isSet_bal(){
		return this.isSet_bal;
	}
	private void setIsSet_bal(boolean value){
		this.isSet_bal= value;
	}
	/**
	 * 잔액
	 * BigDecimal - Double value setter
	 *
	 * @Param bal 잔액
	 */
	public void setBal(double bal) {
		setBal(BigDecimal.valueOf(bal));
	}
	/**
	 * 잔액
	 * BigDecimal - Long value setter
	 *
	 * @Param bal 잔액
	 */
	public void setBal(long bal) {
		setBal(BigDecimal.valueOf(bal));
	}
	/**
	 * 잔액
	 * BigDecimal - String value setter
	 *
	 * @Param bal 잔액
	 */
	public void setBal(String bal) {
		setBal(new BigDecimal(bal));
	}
	/**
	 * 잔액
	 */
	@XmlTransient
	public BigDecimal getBal(){
		return this.bal;
	}
	
	/**
	 * 잔액
	 * 
	 * @param bal 잔액
	 */
	@JsonSetter("bal")
	public void setBal(BigDecimal bal){
		this.bal= bal;
		this.setIsSet_bal(true);
	}
				
	@Override
	public MNPMnyPinFncTrnSelectMnyBal_DTO clone(){
		try{
			MNPMnyPinFncTrnSelectMnyBal_DTO object= (MNPMnyPinFncTrnSelectMnyBal_DTO)super.clone();
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
		
		result= prime * result + ((this.dt==null)?0:this.dt.hashCode());
		result= prime * result + ((this.bal==null)?0:this.bal.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MNPMnyPinFncTrnSelectMnyBal_DTO other= (MNPMnyPinFncTrnSelectMnyBal_DTO)obj;
		{
			Object _dt= getDt();
			Object __dt= other.getDt();
			if ( _dt== null ) { if ( __dt!= null ) return false; }
			else if ( !_dt.equals(__dt) ) return false;
		}
		{
			Object _bal= getBal();
			Object __bal= other.getBal();
			if ( _bal== null ) { if ( __bal!= null ) return false; }
			else if ( !_bal.equals(__bal) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MNPMnyPinFncTrnSelectMnyBal_DTO.class.getName()).append(":\n");
		sb.append("\tdt: ");
		sb.append(dt==null?"null":getDt());
		sb.append("\n");
		sb.append("\tbal: ");
		sb.append(bal==null?"null":getBal());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 8; /* dt */
		messageLen+= 19; /* bal */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("dt");
		list.add("bal");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("dt", get("dt"));
		map.put("bal", get("bal"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 3216:/* dt */
			return getDt();
		case 97293:/* bal */
			return getBal();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 3216:/* dt */
			setDt((String)value);
			break;
		case 97293:/* bal */
			if ( value instanceof String ){
				setBal((String)value);
			}
			else if ( value instanceof Double ){
				setBal((Double)value);
			}
			else if ( value instanceof Long ){
				setBal((Long)value);
			}
			else{
				setBal((BigDecimal)value);
			}
			break;
		default:
			break;
		}
	}
	
}
