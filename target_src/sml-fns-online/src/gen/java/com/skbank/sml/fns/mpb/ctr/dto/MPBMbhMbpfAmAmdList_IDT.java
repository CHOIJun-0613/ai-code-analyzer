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
	"metMngNo", "metMbhSrno", "mbpfPymDt", "mbpfPymCycd", "mbpfPymAm"
}, name="MPBMbhMbpfAmAmdList_IDT")
@XmlRootElement(name="MPBMbhMbpfAmAmdList_IDT")
@BxmCategory(logicalName="회원.회비금액.수정.목록.컨트롤러.입력.IO", description="") 
public class MPBMbhMbpfAmAmdList_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 217877642L;
	
	
	
	/**
	 * 모임관리번호
	 */
	@ApiModelProperty(
		name = "metMngNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metMngNo")
	@BxmOmm_Field(length=1, decimal=0, description="모임관리번호", align="left", fill="")
	private String metMngNo= "";
	
	
	/**
	 * 모임회원일련번호
	 */
	@ApiModelProperty(
		name = "metMbhSrno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metMbhSrno")
	@BxmOmm_Field(length=30, decimal=0, description="모임회원일련번호", align="left", fill="")
	private String metMbhSrno= "";
	
	
	/**
	 * 회비납부일자
	 */
	@ApiModelProperty(
		name = "mbpfPymDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("mbpfPymDt")
	@BxmOmm_Field(length=8, decimal=0, description="회비납부일자", align="left", fill="")
	private String mbpfPymDt= "";
	
	
	/**
	 * 회비납부주기코드
	 */
	@ApiModelProperty(
		name = "mbpfPymCycd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("mbpfPymCycd")
	@BxmOmm_Field(length=2, decimal=0, description="회비납부주기코드", align="left", fill="")
	private String mbpfPymCycd= "";
	
	
	/**
	 * 회비납부금액
	 */
	@ApiModelProperty(
		name = "mbpfPymAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("mbpfPymAm")
	@BxmOmm_Field(length=18, decimal=3, description="회비납부금액", align="right", fill="")
	private BigDecimal mbpfPymAm= new BigDecimal("0");
	
	
	
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
	public String getMetMbhSrno(){
		return this.metMbhSrno;
	}
	
	/**
	 * 모임회원일련번호
	 * 
	 * @param metMbhSrno 모임회원일련번호
	 */
	public void setMetMbhSrno(String metMbhSrno){
		this.metMbhSrno= metMbhSrno;
		this.setIsSet_metMbhSrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mbpfPymDt= false;
	protected final boolean isSet_mbpfPymDt(){
		return this.isSet_mbpfPymDt;
	}
	private void setIsSet_mbpfPymDt(boolean value){
		this.isSet_mbpfPymDt= value;
	}
	/**
	 * 회비납부일자
	 */
	@XmlTransient
	public String getMbpfPymDt(){
		return this.mbpfPymDt;
	}
	
	/**
	 * 회비납부일자
	 * 
	 * @param mbpfPymDt 회비납부일자
	 */
	public void setMbpfPymDt(String mbpfPymDt){
		this.mbpfPymDt= mbpfPymDt;
		this.setIsSet_mbpfPymDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mbpfPymCycd= false;
	protected final boolean isSet_mbpfPymCycd(){
		return this.isSet_mbpfPymCycd;
	}
	private void setIsSet_mbpfPymCycd(boolean value){
		this.isSet_mbpfPymCycd= value;
	}
	/**
	 * 회비납부주기코드
	 */
	@XmlTransient
	public String getMbpfPymCycd(){
		return this.mbpfPymCycd;
	}
	
	/**
	 * 회비납부주기코드
	 * 
	 * @param mbpfPymCycd 회비납부주기코드
	 */
	public void setMbpfPymCycd(String mbpfPymCycd){
		this.mbpfPymCycd= mbpfPymCycd;
		this.setIsSet_mbpfPymCycd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mbpfPymAm= false;
	protected final boolean isSet_mbpfPymAm(){
		return this.isSet_mbpfPymAm;
	}
	private void setIsSet_mbpfPymAm(boolean value){
		this.isSet_mbpfPymAm= value;
	}
	/**
	 * 회비납부금액
	 * BigDecimal - Double value setter
	 *
	 * @Param mbpfPymAm 회비납부금액
	 */
	public void setMbpfPymAm(double mbpfPymAm) {
		setMbpfPymAm(BigDecimal.valueOf(mbpfPymAm));
	}
	/**
	 * 회비납부금액
	 * BigDecimal - Long value setter
	 *
	 * @Param mbpfPymAm 회비납부금액
	 */
	public void setMbpfPymAm(long mbpfPymAm) {
		setMbpfPymAm(BigDecimal.valueOf(mbpfPymAm));
	}
	/**
	 * 회비납부금액
	 * BigDecimal - String value setter
	 *
	 * @Param mbpfPymAm 회비납부금액
	 */
	public void setMbpfPymAm(String mbpfPymAm) {
		setMbpfPymAm(new BigDecimal(mbpfPymAm));
	}
	/**
	 * 회비납부금액
	 */
	@XmlTransient
	public BigDecimal getMbpfPymAm(){
		return this.mbpfPymAm;
	}
	
	/**
	 * 회비납부금액
	 * 
	 * @param mbpfPymAm 회비납부금액
	 */
	@JsonSetter("mbpfPymAm")
	public void setMbpfPymAm(BigDecimal mbpfPymAm){
		this.mbpfPymAm= mbpfPymAm;
		this.setIsSet_mbpfPymAm(true);
	}
				
	@Override
	public MPBMbhMbpfAmAmdList_IDT clone(){
		try{
			MPBMbhMbpfAmAmdList_IDT object= (MPBMbhMbpfAmAmdList_IDT)super.clone();
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
		result= prime * result + ((this.metMbhSrno==null)?0:this.metMbhSrno.hashCode());
		result= prime * result + ((this.mbpfPymDt==null)?0:this.mbpfPymDt.hashCode());
		result= prime * result + ((this.mbpfPymCycd==null)?0:this.mbpfPymCycd.hashCode());
		result= prime * result + ((this.mbpfPymAm==null)?0:this.mbpfPymAm.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MPBMbhMbpfAmAmdList_IDT other= (MPBMbhMbpfAmAmdList_IDT)obj;
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
		{
			Object _mbpfPymDt= getMbpfPymDt();
			Object __mbpfPymDt= other.getMbpfPymDt();
			if ( _mbpfPymDt== null ) { if ( __mbpfPymDt!= null ) return false; }
			else if ( !_mbpfPymDt.equals(__mbpfPymDt) ) return false;
		}
		{
			Object _mbpfPymCycd= getMbpfPymCycd();
			Object __mbpfPymCycd= other.getMbpfPymCycd();
			if ( _mbpfPymCycd== null ) { if ( __mbpfPymCycd!= null ) return false; }
			else if ( !_mbpfPymCycd.equals(__mbpfPymCycd) ) return false;
		}
		{
			Object _mbpfPymAm= getMbpfPymAm();
			Object __mbpfPymAm= other.getMbpfPymAm();
			if ( _mbpfPymAm== null ) { if ( __mbpfPymAm!= null ) return false; }
			else if ( !_mbpfPymAm.equals(__mbpfPymAm) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MPBMbhMbpfAmAmdList_IDT.class.getName()).append(":\n");
		sb.append("\tmetMngNo: ");
		sb.append(metMngNo==null?"null":getMetMngNo());
		sb.append("\n");
		sb.append("\tmetMbhSrno: ");
		sb.append(metMbhSrno==null?"null":getMetMbhSrno());
		sb.append("\n");
		sb.append("\tmbpfPymDt: ");
		sb.append(mbpfPymDt==null?"null":getMbpfPymDt());
		sb.append("\n");
		sb.append("\tmbpfPymCycd: ");
		sb.append(mbpfPymCycd==null?"null":getMbpfPymCycd());
		sb.append("\n");
		sb.append("\tmbpfPymAm: ");
		sb.append(mbpfPymAm==null?"null":getMbpfPymAm());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 1; /* metMngNo */
		messageLen+= 30; /* metMbhSrno */
		messageLen+= 8; /* mbpfPymDt */
		messageLen+= 2; /* mbpfPymCycd */
		messageLen+= 18; /* mbpfPymAm */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("metMngNo");
		list.add("metMbhSrno");
		list.add("mbpfPymDt");
		list.add("mbpfPymCycd");
		list.add("mbpfPymAm");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("metMngNo", get("metMngNo"));
		map.put("metMbhSrno", get("metMbhSrno"));
		map.put("mbpfPymDt", get("mbpfPymDt"));
		map.put("mbpfPymCycd", get("mbpfPymCycd"));
		map.put("mbpfPymAm", get("mbpfPymAm"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -468172085:/* metMngNo */
			return getMetMngNo();
		case 715721463:/* metMbhSrno */
			return getMetMbhSrno();
		case -1128355927:/* mbpfPymDt */
			return getMbpfPymDt();
		case -2018309072:/* mbpfPymCycd */
			return getMbpfPymCycd();
		case -1128356027:/* mbpfPymAm */
			return getMbpfPymAm();
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
		case 715721463:/* metMbhSrno */
			setMetMbhSrno((String)value);
			break;
		case -1128355927:/* mbpfPymDt */
			setMbpfPymDt((String)value);
			break;
		case -2018309072:/* mbpfPymCycd */
			setMbpfPymCycd((String)value);
			break;
		case -1128356027:/* mbpfPymAm */
			if ( value instanceof String ){
				setMbpfPymAm((String)value);
			}
			else if ( value instanceof Double ){
				setMbpfPymAm((Double)value);
			}
			else if ( value instanceof Long ){
				setMbpfPymAm((Long)value);
			}
			else{
				setMbpfPymAm((BigDecimal)value);
			}
			break;
		default:
			break;
		}
	}
	
}
