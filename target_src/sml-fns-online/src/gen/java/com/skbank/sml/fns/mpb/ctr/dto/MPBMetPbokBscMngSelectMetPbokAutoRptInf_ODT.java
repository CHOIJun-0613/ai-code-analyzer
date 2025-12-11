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
	"ctBal", "mbhGridCnt", "mbpfPmtSumAm", "expdSumAm"
}, name="MPBMetPbokBscMngSelectMetPbokAutoRptInf_ODT")
@XmlRootElement(name="MPBMetPbokBscMngSelectMetPbokAutoRptInf_ODT")
@BxmCategory(logicalName="모임통장.관리.메인.정보.조회.컨트롤러.출력.IO", description="") 
public class MPBMetPbokBscMngSelectMetPbokAutoRptInf_ODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 1384523502L;
	
	
	
	/**
	 * 현재잔액
	 */
	@ApiModelProperty(
		name = "ctBal"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("ctBal")
	@BxmOmm_Field(length=19, decimal=3, description="현재잔액", align="right", fill="0")
	private BigDecimal ctBal= new BigDecimal("0");
	
	
	/**
	 * 회원그리드건수
	 */
	@ApiModelProperty(
		name = "mbhGridCnt"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("mbhGridCnt")
	@BxmOmm_Field(length=5, decimal=0, description="회원그리드건수", align="right", fill="0")
	private Integer mbhGridCnt= 0;
	
	
	/**
	 * 회비납부합계금액
	 */
	@ApiModelProperty(
		name = "mbpfPmtSumAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("mbpfPmtSumAm")
	@BxmOmm_Field(length=19, decimal=3, description="회비납부합계금액", align="right", fill="0")
	private BigDecimal mbpfPmtSumAm= new BigDecimal("0");
	
	
	/**
	 * 지출합계금액
	 */
	@ApiModelProperty(
		name = "expdSumAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("expdSumAm")
	@BxmOmm_Field(length=19, decimal=3, description="지출합계금액", align="right", fill="0")
	private BigDecimal expdSumAm= new BigDecimal("0");
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ctBal= false;
	protected final boolean isSet_ctBal(){
		return this.isSet_ctBal;
	}
	private void setIsSet_ctBal(boolean value){
		this.isSet_ctBal= value;
	}
	/**
	 * 현재잔액
	 * BigDecimal - Double value setter
	 *
	 * @Param ctBal 현재잔액
	 */
	public void setCtBal(double ctBal) {
		setCtBal(BigDecimal.valueOf(ctBal));
	}
	/**
	 * 현재잔액
	 * BigDecimal - Long value setter
	 *
	 * @Param ctBal 현재잔액
	 */
	public void setCtBal(long ctBal) {
		setCtBal(BigDecimal.valueOf(ctBal));
	}
	/**
	 * 현재잔액
	 * BigDecimal - String value setter
	 *
	 * @Param ctBal 현재잔액
	 */
	public void setCtBal(String ctBal) {
		setCtBal(new BigDecimal(ctBal));
	}
	/**
	 * 현재잔액
	 */
	@XmlTransient
	public BigDecimal getCtBal(){
		return this.ctBal;
	}
	
	/**
	 * 현재잔액
	 * 
	 * @param ctBal 현재잔액
	 */
	@JsonSetter("ctBal")
	public void setCtBal(BigDecimal ctBal){
		this.ctBal= ctBal;
		this.setIsSet_ctBal(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mbhGridCnt= false;
	protected final boolean isSet_mbhGridCnt(){
		return this.isSet_mbhGridCnt;
	}
	private void setIsSet_mbhGridCnt(boolean value){
		this.isSet_mbhGridCnt= value;
	}
	/**
	 * 회원그리드건수
	 */
	@XmlTransient
	public Integer getMbhGridCnt(){
		return this.mbhGridCnt;
	}
	
	/**
	 * 회원그리드건수
	 * 
	 * @param mbhGridCnt 회원그리드건수
	 */
	public void setMbhGridCnt(Integer mbhGridCnt){
		this.mbhGridCnt= mbhGridCnt;
		this.setIsSet_mbhGridCnt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mbpfPmtSumAm= false;
	protected final boolean isSet_mbpfPmtSumAm(){
		return this.isSet_mbpfPmtSumAm;
	}
	private void setIsSet_mbpfPmtSumAm(boolean value){
		this.isSet_mbpfPmtSumAm= value;
	}
	/**
	 * 회비납부합계금액
	 * BigDecimal - Double value setter
	 *
	 * @Param mbpfPmtSumAm 회비납부합계금액
	 */
	public void setMbpfPmtSumAm(double mbpfPmtSumAm) {
		setMbpfPmtSumAm(BigDecimal.valueOf(mbpfPmtSumAm));
	}
	/**
	 * 회비납부합계금액
	 * BigDecimal - Long value setter
	 *
	 * @Param mbpfPmtSumAm 회비납부합계금액
	 */
	public void setMbpfPmtSumAm(long mbpfPmtSumAm) {
		setMbpfPmtSumAm(BigDecimal.valueOf(mbpfPmtSumAm));
	}
	/**
	 * 회비납부합계금액
	 * BigDecimal - String value setter
	 *
	 * @Param mbpfPmtSumAm 회비납부합계금액
	 */
	public void setMbpfPmtSumAm(String mbpfPmtSumAm) {
		setMbpfPmtSumAm(new BigDecimal(mbpfPmtSumAm));
	}
	/**
	 * 회비납부합계금액
	 */
	@XmlTransient
	public BigDecimal getMbpfPmtSumAm(){
		return this.mbpfPmtSumAm;
	}
	
	/**
	 * 회비납부합계금액
	 * 
	 * @param mbpfPmtSumAm 회비납부합계금액
	 */
	@JsonSetter("mbpfPmtSumAm")
	public void setMbpfPmtSumAm(BigDecimal mbpfPmtSumAm){
		this.mbpfPmtSumAm= mbpfPmtSumAm;
		this.setIsSet_mbpfPmtSumAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_expdSumAm= false;
	protected final boolean isSet_expdSumAm(){
		return this.isSet_expdSumAm;
	}
	private void setIsSet_expdSumAm(boolean value){
		this.isSet_expdSumAm= value;
	}
	/**
	 * 지출합계금액
	 * BigDecimal - Double value setter
	 *
	 * @Param expdSumAm 지출합계금액
	 */
	public void setExpdSumAm(double expdSumAm) {
		setExpdSumAm(BigDecimal.valueOf(expdSumAm));
	}
	/**
	 * 지출합계금액
	 * BigDecimal - Long value setter
	 *
	 * @Param expdSumAm 지출합계금액
	 */
	public void setExpdSumAm(long expdSumAm) {
		setExpdSumAm(BigDecimal.valueOf(expdSumAm));
	}
	/**
	 * 지출합계금액
	 * BigDecimal - String value setter
	 *
	 * @Param expdSumAm 지출합계금액
	 */
	public void setExpdSumAm(String expdSumAm) {
		setExpdSumAm(new BigDecimal(expdSumAm));
	}
	/**
	 * 지출합계금액
	 */
	@XmlTransient
	public BigDecimal getExpdSumAm(){
		return this.expdSumAm;
	}
	
	/**
	 * 지출합계금액
	 * 
	 * @param expdSumAm 지출합계금액
	 */
	@JsonSetter("expdSumAm")
	public void setExpdSumAm(BigDecimal expdSumAm){
		this.expdSumAm= expdSumAm;
		this.setIsSet_expdSumAm(true);
	}
				
	@Override
	public MPBMetPbokBscMngSelectMetPbokAutoRptInf_ODT clone(){
		try{
			MPBMetPbokBscMngSelectMetPbokAutoRptInf_ODT object= (MPBMetPbokBscMngSelectMetPbokAutoRptInf_ODT)super.clone();
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
		
		result= prime * result + ((this.ctBal==null)?0:this.ctBal.hashCode());
		result= prime * result + ((this.mbhGridCnt==null)?0:this.mbhGridCnt.hashCode());
		result= prime * result + ((this.mbpfPmtSumAm==null)?0:this.mbpfPmtSumAm.hashCode());
		result= prime * result + ((this.expdSumAm==null)?0:this.expdSumAm.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MPBMetPbokBscMngSelectMetPbokAutoRptInf_ODT other= (MPBMetPbokBscMngSelectMetPbokAutoRptInf_ODT)obj;
		{
			Object _ctBal= getCtBal();
			Object __ctBal= other.getCtBal();
			if ( _ctBal== null ) { if ( __ctBal!= null ) return false; }
			else if ( !_ctBal.equals(__ctBal) ) return false;
		}
		{
			Object _mbhGridCnt= getMbhGridCnt();
			Object __mbhGridCnt= other.getMbhGridCnt();
			if ( _mbhGridCnt== null ) { if ( __mbhGridCnt!= null ) return false; }
			else if ( !_mbhGridCnt.equals(__mbhGridCnt) ) return false;
		}
		{
			Object _mbpfPmtSumAm= getMbpfPmtSumAm();
			Object __mbpfPmtSumAm= other.getMbpfPmtSumAm();
			if ( _mbpfPmtSumAm== null ) { if ( __mbpfPmtSumAm!= null ) return false; }
			else if ( !_mbpfPmtSumAm.equals(__mbpfPmtSumAm) ) return false;
		}
		{
			Object _expdSumAm= getExpdSumAm();
			Object __expdSumAm= other.getExpdSumAm();
			if ( _expdSumAm== null ) { if ( __expdSumAm!= null ) return false; }
			else if ( !_expdSumAm.equals(__expdSumAm) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MPBMetPbokBscMngSelectMetPbokAutoRptInf_ODT.class.getName()).append(":\n");
		sb.append("\tctBal: ");
		sb.append(ctBal==null?"null":getCtBal());
		sb.append("\n");
		sb.append("\tmbhGridCnt: ");
		sb.append(mbhGridCnt==null?"null":getMbhGridCnt());
		sb.append("\n");
		sb.append("\tmbpfPmtSumAm: ");
		sb.append(mbpfPmtSumAm==null?"null":getMbpfPmtSumAm());
		sb.append("\n");
		sb.append("\texpdSumAm: ");
		sb.append(expdSumAm==null?"null":getExpdSumAm());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 19; /* ctBal */
		messageLen+= 5; /* mbhGridCnt */
		messageLen+= 19; /* mbpfPmtSumAm */
		messageLen+= 19; /* expdSumAm */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("ctBal");
		list.add("mbhGridCnt");
		list.add("mbpfPmtSumAm");
		list.add("expdSumAm");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("ctBal", get("ctBal"));
		map.put("mbhGridCnt", get("mbhGridCnt"));
		map.put("mbpfPmtSumAm", get("mbpfPmtSumAm"));
		map.put("expdSumAm", get("expdSumAm"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 94950876:/* ctBal */
			return getCtBal();
		case 1833626448:/* mbhGridCnt */
			return getMbhGridCnt();
		case 11888491:/* mbpfPmtSumAm */
			return getMbpfPmtSumAm();
		case 78892592:/* expdSumAm */
			return getExpdSumAm();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 94950876:/* ctBal */
			if ( value instanceof String ){
				setCtBal((String)value);
			}
			else if ( value instanceof Double ){
				setCtBal((Double)value);
			}
			else if ( value instanceof Long ){
				setCtBal((Long)value);
			}
			else{
				setCtBal((BigDecimal)value);
			}
			break;
		case 1833626448:/* mbhGridCnt */
			setMbhGridCnt((Integer)value);
			break;
		case 11888491:/* mbpfPmtSumAm */
			if ( value instanceof String ){
				setMbpfPmtSumAm((String)value);
			}
			else if ( value instanceof Double ){
				setMbpfPmtSumAm((Double)value);
			}
			else if ( value instanceof Long ){
				setMbpfPmtSumAm((Long)value);
			}
			else{
				setMbpfPmtSumAm((BigDecimal)value);
			}
			break;
		case 78892592:/* expdSumAm */
			if ( value instanceof String ){
				setExpdSumAm((String)value);
			}
			else if ( value instanceof Double ){
				setExpdSumAm((Double)value);
			}
			else if ( value instanceof Long ){
				setExpdSumAm((Long)value);
			}
			else{
				setExpdSumAm((BigDecimal)value);
			}
			break;
		default:
			break;
		}
	}
	
}
