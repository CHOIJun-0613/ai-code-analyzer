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
	"trnMm", "dpsRapDscd", "totTrnAm", "rcvMbhNm"
}, name="MbhMbpfRcvPrtsListInq_DODT")
@XmlRootElement(name="MbhMbpfRcvPrtsListInq_DODT")
@BxmCategory(logicalName="회원.회비.입금내역.목록.조회.DBM.출력.IO", description="") 
public class MbhMbpfRcvPrtsListInq_DODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 1731178594L;
	
	
	
	/**
	 * 거래월
	 */
	@ApiModelProperty(
		name = "trnMm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("trnMm")
	@BxmOmm_Field(length=2, decimal=0, description="거래월", align="left", fill="")
	private String trnMm= "";
	
	
	/**
	 * 수신입지급구분코드
	 */
	@ApiModelProperty(
		name = "dpsRapDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dpsRapDscd")
	@BxmOmm_Field(length=1, decimal=0, description="수신입지급구분코드", align="left", fill="")
	private String dpsRapDscd= "";
	
	
	/**
	 * 총거래금액
	 */
	@ApiModelProperty(
		name = "totTrnAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("totTrnAm")
	@BxmOmm_Field(length=18, decimal=3, description="총거래금액", align="right", fill="")
	private BigDecimal totTrnAm= new BigDecimal("0");
	
	
	/**
	 * 입금회원명
	 */
	@ApiModelProperty(
		name = "rcvMbhNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rcvMbhNm")
	@BxmOmm_Field(length=60, decimal=0, description="입금회원명", align="left", fill="")
	private String rcvMbhNm= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_trnMm= false;
	protected final boolean isSet_trnMm(){
		return this.isSet_trnMm;
	}
	private void setIsSet_trnMm(boolean value){
		this.isSet_trnMm= value;
	}
	/**
	 * 거래월
	 */
	@XmlTransient
	public String getTrnMm(){
		return this.trnMm;
	}
	
	/**
	 * 거래월
	 * 
	 * @param trnMm 거래월
	 */
	public void setTrnMm(String trnMm){
		this.trnMm= trnMm;
		this.setIsSet_trnMm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dpsRapDscd= false;
	protected final boolean isSet_dpsRapDscd(){
		return this.isSet_dpsRapDscd;
	}
	private void setIsSet_dpsRapDscd(boolean value){
		this.isSet_dpsRapDscd= value;
	}
	/**
	 * 수신입지급구분코드
	 */
	@XmlTransient
	public String getDpsRapDscd(){
		return this.dpsRapDscd;
	}
	
	/**
	 * 수신입지급구분코드
	 * 
	 * @param dpsRapDscd 수신입지급구분코드
	 */
	public void setDpsRapDscd(String dpsRapDscd){
		this.dpsRapDscd= dpsRapDscd;
		this.setIsSet_dpsRapDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_totTrnAm= false;
	protected final boolean isSet_totTrnAm(){
		return this.isSet_totTrnAm;
	}
	private void setIsSet_totTrnAm(boolean value){
		this.isSet_totTrnAm= value;
	}
	/**
	 * 총거래금액
	 * BigDecimal - Double value setter
	 *
	 * @Param totTrnAm 총거래금액
	 */
	public void setTotTrnAm(double totTrnAm) {
		setTotTrnAm(BigDecimal.valueOf(totTrnAm));
	}
	/**
	 * 총거래금액
	 * BigDecimal - Long value setter
	 *
	 * @Param totTrnAm 총거래금액
	 */
	public void setTotTrnAm(long totTrnAm) {
		setTotTrnAm(BigDecimal.valueOf(totTrnAm));
	}
	/**
	 * 총거래금액
	 * BigDecimal - String value setter
	 *
	 * @Param totTrnAm 총거래금액
	 */
	public void setTotTrnAm(String totTrnAm) {
		setTotTrnAm(new BigDecimal(totTrnAm));
	}
	/**
	 * 총거래금액
	 */
	@XmlTransient
	public BigDecimal getTotTrnAm(){
		return this.totTrnAm;
	}
	
	/**
	 * 총거래금액
	 * 
	 * @param totTrnAm 총거래금액
	 */
	@JsonSetter("totTrnAm")
	public void setTotTrnAm(BigDecimal totTrnAm){
		this.totTrnAm= totTrnAm;
		this.setIsSet_totTrnAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rcvMbhNm= false;
	protected final boolean isSet_rcvMbhNm(){
		return this.isSet_rcvMbhNm;
	}
	private void setIsSet_rcvMbhNm(boolean value){
		this.isSet_rcvMbhNm= value;
	}
	/**
	 * 입금회원명
	 */
	@XmlTransient
	public String getRcvMbhNm(){
		return this.rcvMbhNm;
	}
	
	/**
	 * 입금회원명
	 * 
	 * @param rcvMbhNm 입금회원명
	 */
	public void setRcvMbhNm(String rcvMbhNm){
		this.rcvMbhNm= rcvMbhNm;
		this.setIsSet_rcvMbhNm(true);
	}
				
	@Override
	public MbhMbpfRcvPrtsListInq_DODT clone(){
		try{
			MbhMbpfRcvPrtsListInq_DODT object= (MbhMbpfRcvPrtsListInq_DODT)super.clone();
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
		
		result= prime * result + ((this.trnMm==null)?0:this.trnMm.hashCode());
		result= prime * result + ((this.dpsRapDscd==null)?0:this.dpsRapDscd.hashCode());
		result= prime * result + ((this.totTrnAm==null)?0:this.totTrnAm.hashCode());
		result= prime * result + ((this.rcvMbhNm==null)?0:this.rcvMbhNm.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MbhMbpfRcvPrtsListInq_DODT other= (MbhMbpfRcvPrtsListInq_DODT)obj;
		{
			Object _trnMm= getTrnMm();
			Object __trnMm= other.getTrnMm();
			if ( _trnMm== null ) { if ( __trnMm!= null ) return false; }
			else if ( !_trnMm.equals(__trnMm) ) return false;
		}
		{
			Object _dpsRapDscd= getDpsRapDscd();
			Object __dpsRapDscd= other.getDpsRapDscd();
			if ( _dpsRapDscd== null ) { if ( __dpsRapDscd!= null ) return false; }
			else if ( !_dpsRapDscd.equals(__dpsRapDscd) ) return false;
		}
		{
			Object _totTrnAm= getTotTrnAm();
			Object __totTrnAm= other.getTotTrnAm();
			if ( _totTrnAm== null ) { if ( __totTrnAm!= null ) return false; }
			else if ( !_totTrnAm.equals(__totTrnAm) ) return false;
		}
		{
			Object _rcvMbhNm= getRcvMbhNm();
			Object __rcvMbhNm= other.getRcvMbhNm();
			if ( _rcvMbhNm== null ) { if ( __rcvMbhNm!= null ) return false; }
			else if ( !_rcvMbhNm.equals(__rcvMbhNm) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MbhMbpfRcvPrtsListInq_DODT.class.getName()).append(":\n");
		sb.append("\ttrnMm: ");
		sb.append(trnMm==null?"null":getTrnMm());
		sb.append("\n");
		sb.append("\tdpsRapDscd: ");
		sb.append(dpsRapDscd==null?"null":getDpsRapDscd());
		sb.append("\n");
		sb.append("\ttotTrnAm: ");
		sb.append(totTrnAm==null?"null":getTotTrnAm());
		sb.append("\n");
		sb.append("\trcvMbhNm: ");
		sb.append(rcvMbhNm==null?"null":getRcvMbhNm());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 2; /* trnMm */
		messageLen+= 1; /* dpsRapDscd */
		messageLen+= 18; /* totTrnAm */
		messageLen+= 60; /* rcvMbhNm */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("trnMm");
		list.add("dpsRapDscd");
		list.add("totTrnAm");
		list.add("rcvMbhNm");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("trnMm", get("trnMm"));
		map.put("dpsRapDscd", get("dpsRapDscd"));
		map.put("totTrnAm", get("totTrnAm"));
		map.put("rcvMbhNm", get("rcvMbhNm"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 110632816:/* trnMm */
			return getTrnMm();
		case -1839733366:/* dpsRapDscd */
			return getDpsRapDscd();
		case -861709277:/* totTrnAm */
			return getTotTrnAm();
		case -2062160595:/* rcvMbhNm */
			return getRcvMbhNm();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 110632816:/* trnMm */
			setTrnMm((String)value);
			break;
		case -1839733366:/* dpsRapDscd */
			setDpsRapDscd((String)value);
			break;
		case -861709277:/* totTrnAm */
			if ( value instanceof String ){
				setTotTrnAm((String)value);
			}
			else if ( value instanceof Double ){
				setTotTrnAm((Double)value);
			}
			else if ( value instanceof Long ){
				setTotTrnAm((Long)value);
			}
			else{
				setTotTrnAm((BigDecimal)value);
			}
			break;
		case -2062160595:/* rcvMbhNm */
			setRcvMbhNm((String)value);
			break;
		default:
			break;
		}
	}
	
}
