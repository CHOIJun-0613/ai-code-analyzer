/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.mnp.ctr.dto;

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
	"trnYm", "trnIntAm"
}, name="MNPMnyPinWallMngSelectWallIntPrtsList_ODT")
@XmlRootElement(name="MNPMnyPinWallMngSelectWallIntPrtsList_ODT")
@BxmCategory(logicalName="머니클립지갑이자내역목록.출력IO", description="") 
public class MNPMnyPinWallMngSelectWallIntPrtsList_ODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -114411891L;
	
	
	
	/**
	 * 거래년월
	 */
	@ApiModelProperty(
		name = "trnYm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("trnYm")
	@BxmOmm_Field(length=6, decimal=0, description="거래년월", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=C","EIMS_DATA_TYPE=S"})
	private String trnYm= "";
	
	
	/**
	 * 거래이자금액
	 */
	@ApiModelProperty(
		name = "trnIntAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("trnIntAm")
	@BxmOmm_Field(length=19, decimal=3, description="거래이자금액", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=C","EIMS_DATA_TYPE=D"})
	private BigDecimal trnIntAm= new BigDecimal("0");
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_trnYm= false;
	protected final boolean isSet_trnYm(){
		return this.isSet_trnYm;
	}
	private void setIsSet_trnYm(boolean value){
		this.isSet_trnYm= value;
	}
	/**
	 * 거래년월
	 */
	@XmlTransient
	public String getTrnYm(){
		return this.trnYm;
	}
	
	/**
	 * 거래년월
	 * 
	 * @param trnYm 거래년월
	 */
	public void setTrnYm(String trnYm){
		this.trnYm= trnYm;
		this.setIsSet_trnYm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_trnIntAm= false;
	protected final boolean isSet_trnIntAm(){
		return this.isSet_trnIntAm;
	}
	private void setIsSet_trnIntAm(boolean value){
		this.isSet_trnIntAm= value;
	}
	/**
	 * 거래이자금액
	 * BigDecimal - Double value setter
	 *
	 * @Param trnIntAm 거래이자금액
	 */
	public void setTrnIntAm(double trnIntAm) {
		setTrnIntAm(BigDecimal.valueOf(trnIntAm));
	}
	/**
	 * 거래이자금액
	 * BigDecimal - Long value setter
	 *
	 * @Param trnIntAm 거래이자금액
	 */
	public void setTrnIntAm(long trnIntAm) {
		setTrnIntAm(BigDecimal.valueOf(trnIntAm));
	}
	/**
	 * 거래이자금액
	 * BigDecimal - String value setter
	 *
	 * @Param trnIntAm 거래이자금액
	 */
	public void setTrnIntAm(String trnIntAm) {
		setTrnIntAm(new BigDecimal(trnIntAm));
	}
	/**
	 * 거래이자금액
	 */
	@XmlTransient
	public BigDecimal getTrnIntAm(){
		return this.trnIntAm;
	}
	
	/**
	 * 거래이자금액
	 * 
	 * @param trnIntAm 거래이자금액
	 */
	@JsonSetter("trnIntAm")
	public void setTrnIntAm(BigDecimal trnIntAm){
		this.trnIntAm= trnIntAm;
		this.setIsSet_trnIntAm(true);
	}
				
	@Override
	public MNPMnyPinWallMngSelectWallIntPrtsList_ODT clone(){
		try{
			MNPMnyPinWallMngSelectWallIntPrtsList_ODT object= (MNPMnyPinWallMngSelectWallIntPrtsList_ODT)super.clone();
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
		
		result= prime * result + ((this.trnYm==null)?0:this.trnYm.hashCode());
		result= prime * result + ((this.trnIntAm==null)?0:this.trnIntAm.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MNPMnyPinWallMngSelectWallIntPrtsList_ODT other= (MNPMnyPinWallMngSelectWallIntPrtsList_ODT)obj;
		{
			Object _trnYm= getTrnYm();
			Object __trnYm= other.getTrnYm();
			if ( _trnYm== null ) { if ( __trnYm!= null ) return false; }
			else if ( !_trnYm.equals(__trnYm) ) return false;
		}
		{
			Object _trnIntAm= getTrnIntAm();
			Object __trnIntAm= other.getTrnIntAm();
			if ( _trnIntAm== null ) { if ( __trnIntAm!= null ) return false; }
			else if ( !_trnIntAm.equals(__trnIntAm) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MNPMnyPinWallMngSelectWallIntPrtsList_ODT.class.getName()).append(":\n");
		sb.append("\ttrnYm: ");
		sb.append(trnYm==null?"null":getTrnYm());
		sb.append("\n");
		sb.append("\ttrnIntAm: ");
		sb.append(trnIntAm==null?"null":getTrnIntAm());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 6; /* trnYm */
		messageLen+= 19; /* trnIntAm */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("trnYm");
		list.add("trnIntAm");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("trnYm", get("trnYm"));
		map.put("trnIntAm", get("trnIntAm"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 110633188:/* trnYm */
			return getTrnYm();
		case 1618754731:/* trnIntAm */
			return getTrnIntAm();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 110633188:/* trnYm */
			setTrnYm((String)value);
			break;
		case 1618754731:/* trnIntAm */
			if ( value instanceof String ){
				setTrnIntAm((String)value);
			}
			else if ( value instanceof Double ){
				setTrnIntAm((Double)value);
			}
			else if ( value instanceof Long ){
				setTrnIntAm((Long)value);
			}
			else{
				setTrnIntAm((BigDecimal)value);
			}
			break;
		default:
			break;
		}
	}
	
}
