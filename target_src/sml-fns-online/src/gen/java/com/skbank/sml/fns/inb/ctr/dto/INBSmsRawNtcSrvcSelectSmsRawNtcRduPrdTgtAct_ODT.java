/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.inb.ctr.dto;

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
 * SMS입출금통지.감면상품.대상계좌.컨트롤러.출력.IO
 */
@XmlType(propOrder={
	"frduYn", "rduFrcsAm"
}, name="INBSmsRawNtcSrvcSelectSmsRawNtcRduPrdTgtAct_ODT")
@XmlRootElement(name="INBSmsRawNtcSrvcSelectSmsRawNtcRduPrdTgtAct_ODT")
@BxmCategory(logicalName="SMS입출금통지.감면상품.대상계좌.컨트롤러.출력.IO", description="SMS입출금통지.감면상품.대상계좌.컨트롤러.출력.IO") 
public class INBSmsRawNtcSrvcSelectSmsRawNtcRduPrdTgtAct_ODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 1025801416L;
	
	
	
	/**
	 * 수수료감면여부
	 */
	@ApiModelProperty(
		name = "frduYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("frduYn")
	@BxmOmm_Field(length=1, decimal=0, description="수수료감면여부", align="left", fill="")
	private String frduYn= "";
	
	
	/**
	 * 감면예상금액
	 */
	@ApiModelProperty(
		name = "rduFrcsAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("rduFrcsAm")
	@BxmOmm_Field(length=18, decimal=0, description="감면예상금액", align="right", fill="")
	private BigDecimal rduFrcsAm= new BigDecimal("0");
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_frduYn= false;
	protected final boolean isSet_frduYn(){
		return this.isSet_frduYn;
	}
	private void setIsSet_frduYn(boolean value){
		this.isSet_frduYn= value;
	}
	/**
	 * 수수료감면여부
	 */
	@XmlTransient
	public String getFrduYn(){
		return this.frduYn;
	}
	
	/**
	 * 수수료감면여부
	 * 
	 * @param frduYn 수수료감면여부
	 */
	public void setFrduYn(String frduYn){
		this.frduYn= frduYn;
		this.setIsSet_frduYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rduFrcsAm= false;
	protected final boolean isSet_rduFrcsAm(){
		return this.isSet_rduFrcsAm;
	}
	private void setIsSet_rduFrcsAm(boolean value){
		this.isSet_rduFrcsAm= value;
	}
	/**
	 * 감면예상금액
	 * BigDecimal - Double value setter
	 *
	 * @Param rduFrcsAm 감면예상금액
	 */
	public void setRduFrcsAm(double rduFrcsAm) {
		setRduFrcsAm(BigDecimal.valueOf(rduFrcsAm));
	}
	/**
	 * 감면예상금액
	 * BigDecimal - Long value setter
	 *
	 * @Param rduFrcsAm 감면예상금액
	 */
	public void setRduFrcsAm(long rduFrcsAm) {
		setRduFrcsAm(BigDecimal.valueOf(rduFrcsAm));
	}
	/**
	 * 감면예상금액
	 * BigDecimal - String value setter
	 *
	 * @Param rduFrcsAm 감면예상금액
	 */
	public void setRduFrcsAm(String rduFrcsAm) {
		setRduFrcsAm(new BigDecimal(rduFrcsAm));
	}
	/**
	 * 감면예상금액
	 */
	@XmlTransient
	public BigDecimal getRduFrcsAm(){
		return this.rduFrcsAm;
	}
	
	/**
	 * 감면예상금액
	 * 
	 * @param rduFrcsAm 감면예상금액
	 */
	@JsonSetter("rduFrcsAm")
	public void setRduFrcsAm(BigDecimal rduFrcsAm){
		this.rduFrcsAm= rduFrcsAm;
		this.setIsSet_rduFrcsAm(true);
	}
				
	@Override
	public INBSmsRawNtcSrvcSelectSmsRawNtcRduPrdTgtAct_ODT clone(){
		try{
			INBSmsRawNtcSrvcSelectSmsRawNtcRduPrdTgtAct_ODT object= (INBSmsRawNtcSrvcSelectSmsRawNtcRduPrdTgtAct_ODT)super.clone();
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
		
		result= prime * result + ((this.frduYn==null)?0:this.frduYn.hashCode());
		result= prime * result + ((this.rduFrcsAm==null)?0:this.rduFrcsAm.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final INBSmsRawNtcSrvcSelectSmsRawNtcRduPrdTgtAct_ODT other= (INBSmsRawNtcSrvcSelectSmsRawNtcRduPrdTgtAct_ODT)obj;
		{
			Object _frduYn= getFrduYn();
			Object __frduYn= other.getFrduYn();
			if ( _frduYn== null ) { if ( __frduYn!= null ) return false; }
			else if ( !_frduYn.equals(__frduYn) ) return false;
		}
		{
			Object _rduFrcsAm= getRduFrcsAm();
			Object __rduFrcsAm= other.getRduFrcsAm();
			if ( _rduFrcsAm== null ) { if ( __rduFrcsAm!= null ) return false; }
			else if ( !_rduFrcsAm.equals(__rduFrcsAm) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(INBSmsRawNtcSrvcSelectSmsRawNtcRduPrdTgtAct_ODT.class.getName()).append(":\n");
		sb.append("\tfrduYn: ");
		sb.append(frduYn==null?"null":getFrduYn());
		sb.append("\n");
		sb.append("\trduFrcsAm: ");
		sb.append(rduFrcsAm==null?"null":getRduFrcsAm());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 1; /* frduYn */
		messageLen+= 18; /* rduFrcsAm */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("frduYn");
		list.add("rduFrcsAm");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("frduYn", get("frduYn"));
		map.put("rduFrcsAm", get("rduFrcsAm"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -1266418094:/* frduYn */
			return getFrduYn();
		case 1167095275:/* rduFrcsAm */
			return getRduFrcsAm();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -1266418094:/* frduYn */
			setFrduYn((String)value);
			break;
		case 1167095275:/* rduFrcsAm */
			if ( value instanceof String ){
				setRduFrcsAm((String)value);
			}
			else if ( value instanceof Double ){
				setRduFrcsAm((Double)value);
			}
			else if ( value instanceof Long ){
				setRduFrcsAm((Long)value);
			}
			else{
				setRduFrcsAm((BigDecimal)value);
			}
			break;
		default:
			break;
		}
	}
	
}
