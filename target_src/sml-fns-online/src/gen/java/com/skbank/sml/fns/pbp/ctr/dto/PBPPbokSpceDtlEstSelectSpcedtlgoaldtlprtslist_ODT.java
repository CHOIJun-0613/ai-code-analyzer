/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.pbp.ctr.dto;

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
	"dt", "goalAm"
}, name="PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprtslist_ODT")
@XmlRootElement(name="PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprtslist_ODT")
@BxmCategory(logicalName="공간.상세.목표.금액.목록.컨트롤러.출력.IO", description="") 
public class PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprtslist_ODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -264387872L;
	
	
	
	/**
	 * 날짜
	 */
	@ApiModelProperty(
		name = "dt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dt")
	@BxmOmm_Field(length=8, decimal=0, description="날짜", align="left", fill="")
	private String dt= "";
	
	
	/**
	 * 목표금액
	 */
	@ApiModelProperty(
		name = "goalAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("goalAm")
	@BxmOmm_Field(length=18, decimal=3, description="목표금액", align="right", fill="")
	private BigDecimal goalAm= new BigDecimal("0");
	
	
	
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
	 * 날짜
	 */
	@XmlTransient
	public String getDt(){
		return this.dt;
	}
	
	/**
	 * 날짜
	 * 
	 * @param dt 날짜
	 */
	public void setDt(String dt){
		this.dt= dt;
		this.setIsSet_dt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_goalAm= false;
	protected final boolean isSet_goalAm(){
		return this.isSet_goalAm;
	}
	private void setIsSet_goalAm(boolean value){
		this.isSet_goalAm= value;
	}
	/**
	 * 목표금액
	 * BigDecimal - Double value setter
	 *
	 * @Param goalAm 목표금액
	 */
	public void setGoalAm(double goalAm) {
		setGoalAm(BigDecimal.valueOf(goalAm));
	}
	/**
	 * 목표금액
	 * BigDecimal - Long value setter
	 *
	 * @Param goalAm 목표금액
	 */
	public void setGoalAm(long goalAm) {
		setGoalAm(BigDecimal.valueOf(goalAm));
	}
	/**
	 * 목표금액
	 * BigDecimal - String value setter
	 *
	 * @Param goalAm 목표금액
	 */
	public void setGoalAm(String goalAm) {
		setGoalAm(new BigDecimal(goalAm));
	}
	/**
	 * 목표금액
	 */
	@XmlTransient
	public BigDecimal getGoalAm(){
		return this.goalAm;
	}
	
	/**
	 * 목표금액
	 * 
	 * @param goalAm 목표금액
	 */
	@JsonSetter("goalAm")
	public void setGoalAm(BigDecimal goalAm){
		this.goalAm= goalAm;
		this.setIsSet_goalAm(true);
	}
				
	@Override
	public PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprtslist_ODT clone(){
		try{
			PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprtslist_ODT object= (PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprtslist_ODT)super.clone();
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
		result= prime * result + ((this.goalAm==null)?0:this.goalAm.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprtslist_ODT other= (PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprtslist_ODT)obj;
		{
			Object _dt= getDt();
			Object __dt= other.getDt();
			if ( _dt== null ) { if ( __dt!= null ) return false; }
			else if ( !_dt.equals(__dt) ) return false;
		}
		{
			Object _goalAm= getGoalAm();
			Object __goalAm= other.getGoalAm();
			if ( _goalAm== null ) { if ( __goalAm!= null ) return false; }
			else if ( !_goalAm.equals(__goalAm) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprtslist_ODT.class.getName()).append(":\n");
		sb.append("\tdt: ");
		sb.append(dt==null?"null":getDt());
		sb.append("\n");
		sb.append("\tgoalAm: ");
		sb.append(goalAm==null?"null":getGoalAm());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 8; /* dt */
		messageLen+= 18; /* goalAm */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("dt");
		list.add("goalAm");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("dt", get("dt"));
		map.put("goalAm", get("goalAm"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 3216:/* dt */
			return getDt();
		case -1240658273:/* goalAm */
			return getGoalAm();
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
		case -1240658273:/* goalAm */
			if ( value instanceof String ){
				setGoalAm((String)value);
			}
			else if ( value instanceof Double ){
				setGoalAm((Double)value);
			}
			else if ( value instanceof Long ){
				setGoalAm((Long)value);
			}
			else{
				setGoalAm((BigDecimal)value);
			}
			break;
		default:
			break;
		}
	}
	
}
