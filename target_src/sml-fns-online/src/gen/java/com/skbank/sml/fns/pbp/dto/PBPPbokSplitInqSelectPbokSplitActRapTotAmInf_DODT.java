/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.pbp.dto;

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
	"paySumCnt", "paySumAm", "rcvSumCnt", "rcvSumAm", "ctBal"
}, name="PBPPbokSplitInqSelectPbokSplitActRapTotAmInf_DODT")
@XmlRootElement(name="PBPPbokSplitInqSelectPbokSplitActRapTotAmInf_DODT")
@BxmCategory(logicalName="통장.쪼개기.계좌.입지급.합계.금액.정보.조회.DBM.출력.IO", description="") 
public class PBPPbokSplitInqSelectPbokSplitActRapTotAmInf_DODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 354777006L;
	
	
	
	/**
	 * 지급합계건수
	 */
	@ApiModelProperty(
		name = "paySumCnt"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("paySumCnt")
	@BxmOmm_Field(length=6, decimal=0, description="지급합계건수", align="right", fill="")
	private Integer paySumCnt= 0;
	
	
	/**
	 * 지급합계금액
	 */
	@ApiModelProperty(
		name = "paySumAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("paySumAm")
	@BxmOmm_Field(length=19, decimal=3, description="지급합계금액", align="right", fill="")
	private BigDecimal paySumAm= new BigDecimal("0");
	
	
	/**
	 * 입금합계건수
	 */
	@ApiModelProperty(
		name = "rcvSumCnt"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("rcvSumCnt")
	@BxmOmm_Field(length=6, decimal=0, description="입금합계건수", align="right", fill="")
	private Integer rcvSumCnt= 0;
	
	
	/**
	 * 입금합계금액
	 */
	@ApiModelProperty(
		name = "rcvSumAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("rcvSumAm")
	@BxmOmm_Field(length=19, decimal=3, description="입금합계금액", align="right", fill="")
	private BigDecimal rcvSumAm= new BigDecimal("0");
	
	
	/**
	 * 현재잔액
	 */
	@ApiModelProperty(
		name = "ctBal"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("ctBal")
	@BxmOmm_Field(length=19, decimal=3, description="현재잔액", align="right", fill="")
	private BigDecimal ctBal= new BigDecimal("0");
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_paySumCnt= false;
	protected final boolean isSet_paySumCnt(){
		return this.isSet_paySumCnt;
	}
	private void setIsSet_paySumCnt(boolean value){
		this.isSet_paySumCnt= value;
	}
	/**
	 * 지급합계건수
	 */
	@XmlTransient
	public Integer getPaySumCnt(){
		return this.paySumCnt;
	}
	
	/**
	 * 지급합계건수
	 * 
	 * @param paySumCnt 지급합계건수
	 */
	public void setPaySumCnt(Integer paySumCnt){
		this.paySumCnt= paySumCnt;
		this.setIsSet_paySumCnt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_paySumAm= false;
	protected final boolean isSet_paySumAm(){
		return this.isSet_paySumAm;
	}
	private void setIsSet_paySumAm(boolean value){
		this.isSet_paySumAm= value;
	}
	/**
	 * 지급합계금액
	 * BigDecimal - Double value setter
	 *
	 * @Param paySumAm 지급합계금액
	 */
	public void setPaySumAm(double paySumAm) {
		setPaySumAm(BigDecimal.valueOf(paySumAm));
	}
	/**
	 * 지급합계금액
	 * BigDecimal - Long value setter
	 *
	 * @Param paySumAm 지급합계금액
	 */
	public void setPaySumAm(long paySumAm) {
		setPaySumAm(BigDecimal.valueOf(paySumAm));
	}
	/**
	 * 지급합계금액
	 * BigDecimal - String value setter
	 *
	 * @Param paySumAm 지급합계금액
	 */
	public void setPaySumAm(String paySumAm) {
		setPaySumAm(new BigDecimal(paySumAm));
	}
	/**
	 * 지급합계금액
	 */
	@XmlTransient
	public BigDecimal getPaySumAm(){
		return this.paySumAm;
	}
	
	/**
	 * 지급합계금액
	 * 
	 * @param paySumAm 지급합계금액
	 */
	@JsonSetter("paySumAm")
	public void setPaySumAm(BigDecimal paySumAm){
		this.paySumAm= paySumAm;
		this.setIsSet_paySumAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rcvSumCnt= false;
	protected final boolean isSet_rcvSumCnt(){
		return this.isSet_rcvSumCnt;
	}
	private void setIsSet_rcvSumCnt(boolean value){
		this.isSet_rcvSumCnt= value;
	}
	/**
	 * 입금합계건수
	 */
	@XmlTransient
	public Integer getRcvSumCnt(){
		return this.rcvSumCnt;
	}
	
	/**
	 * 입금합계건수
	 * 
	 * @param rcvSumCnt 입금합계건수
	 */
	public void setRcvSumCnt(Integer rcvSumCnt){
		this.rcvSumCnt= rcvSumCnt;
		this.setIsSet_rcvSumCnt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rcvSumAm= false;
	protected final boolean isSet_rcvSumAm(){
		return this.isSet_rcvSumAm;
	}
	private void setIsSet_rcvSumAm(boolean value){
		this.isSet_rcvSumAm= value;
	}
	/**
	 * 입금합계금액
	 * BigDecimal - Double value setter
	 *
	 * @Param rcvSumAm 입금합계금액
	 */
	public void setRcvSumAm(double rcvSumAm) {
		setRcvSumAm(BigDecimal.valueOf(rcvSumAm));
	}
	/**
	 * 입금합계금액
	 * BigDecimal - Long value setter
	 *
	 * @Param rcvSumAm 입금합계금액
	 */
	public void setRcvSumAm(long rcvSumAm) {
		setRcvSumAm(BigDecimal.valueOf(rcvSumAm));
	}
	/**
	 * 입금합계금액
	 * BigDecimal - String value setter
	 *
	 * @Param rcvSumAm 입금합계금액
	 */
	public void setRcvSumAm(String rcvSumAm) {
		setRcvSumAm(new BigDecimal(rcvSumAm));
	}
	/**
	 * 입금합계금액
	 */
	@XmlTransient
	public BigDecimal getRcvSumAm(){
		return this.rcvSumAm;
	}
	
	/**
	 * 입금합계금액
	 * 
	 * @param rcvSumAm 입금합계금액
	 */
	@JsonSetter("rcvSumAm")
	public void setRcvSumAm(BigDecimal rcvSumAm){
		this.rcvSumAm= rcvSumAm;
		this.setIsSet_rcvSumAm(true);
	}
	
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
				
	@Override
	public PBPPbokSplitInqSelectPbokSplitActRapTotAmInf_DODT clone(){
		try{
			PBPPbokSplitInqSelectPbokSplitActRapTotAmInf_DODT object= (PBPPbokSplitInqSelectPbokSplitActRapTotAmInf_DODT)super.clone();
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
		
		result= prime * result + ((this.paySumCnt==null)?0:this.paySumCnt.hashCode());
		result= prime * result + ((this.paySumAm==null)?0:this.paySumAm.hashCode());
		result= prime * result + ((this.rcvSumCnt==null)?0:this.rcvSumCnt.hashCode());
		result= prime * result + ((this.rcvSumAm==null)?0:this.rcvSumAm.hashCode());
		result= prime * result + ((this.ctBal==null)?0:this.ctBal.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final PBPPbokSplitInqSelectPbokSplitActRapTotAmInf_DODT other= (PBPPbokSplitInqSelectPbokSplitActRapTotAmInf_DODT)obj;
		{
			Object _paySumCnt= getPaySumCnt();
			Object __paySumCnt= other.getPaySumCnt();
			if ( _paySumCnt== null ) { if ( __paySumCnt!= null ) return false; }
			else if ( !_paySumCnt.equals(__paySumCnt) ) return false;
		}
		{
			Object _paySumAm= getPaySumAm();
			Object __paySumAm= other.getPaySumAm();
			if ( _paySumAm== null ) { if ( __paySumAm!= null ) return false; }
			else if ( !_paySumAm.equals(__paySumAm) ) return false;
		}
		{
			Object _rcvSumCnt= getRcvSumCnt();
			Object __rcvSumCnt= other.getRcvSumCnt();
			if ( _rcvSumCnt== null ) { if ( __rcvSumCnt!= null ) return false; }
			else if ( !_rcvSumCnt.equals(__rcvSumCnt) ) return false;
		}
		{
			Object _rcvSumAm= getRcvSumAm();
			Object __rcvSumAm= other.getRcvSumAm();
			if ( _rcvSumAm== null ) { if ( __rcvSumAm!= null ) return false; }
			else if ( !_rcvSumAm.equals(__rcvSumAm) ) return false;
		}
		{
			Object _ctBal= getCtBal();
			Object __ctBal= other.getCtBal();
			if ( _ctBal== null ) { if ( __ctBal!= null ) return false; }
			else if ( !_ctBal.equals(__ctBal) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(PBPPbokSplitInqSelectPbokSplitActRapTotAmInf_DODT.class.getName()).append(":\n");
		sb.append("\tpaySumCnt: ");
		sb.append(paySumCnt==null?"null":getPaySumCnt());
		sb.append("\n");
		sb.append("\tpaySumAm: ");
		sb.append(paySumAm==null?"null":getPaySumAm());
		sb.append("\n");
		sb.append("\trcvSumCnt: ");
		sb.append(rcvSumCnt==null?"null":getRcvSumCnt());
		sb.append("\n");
		sb.append("\trcvSumAm: ");
		sb.append(rcvSumAm==null?"null":getRcvSumAm());
		sb.append("\n");
		sb.append("\tctBal: ");
		sb.append(ctBal==null?"null":getCtBal());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 6; /* paySumCnt */
		messageLen+= 19; /* paySumAm */
		messageLen+= 6; /* rcvSumCnt */
		messageLen+= 19; /* rcvSumAm */
		messageLen+= 19; /* ctBal */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("paySumCnt");
		list.add("paySumAm");
		list.add("rcvSumCnt");
		list.add("rcvSumAm");
		list.add("ctBal");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("paySumCnt", get("paySumCnt"));
		map.put("paySumAm", get("paySumAm"));
		map.put("rcvSumCnt", get("rcvSumCnt"));
		map.put("rcvSumAm", get("rcvSumAm"));
		map.put("ctBal", get("ctBal"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -816176666:/* paySumCnt */
			return getPaySumCnt();
		case 1359144975:/* paySumAm */
			return getPaySumAm();
		case 686991331:/* rcvSumCnt */
			return getRcvSumCnt();
		case -2056049038:/* rcvSumAm */
			return getRcvSumAm();
		case 94950876:/* ctBal */
			return getCtBal();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -816176666:/* paySumCnt */
			setPaySumCnt((Integer)value);
			break;
		case 1359144975:/* paySumAm */
			if ( value instanceof String ){
				setPaySumAm((String)value);
			}
			else if ( value instanceof Double ){
				setPaySumAm((Double)value);
			}
			else if ( value instanceof Long ){
				setPaySumAm((Long)value);
			}
			else{
				setPaySumAm((BigDecimal)value);
			}
			break;
		case 686991331:/* rcvSumCnt */
			setRcvSumCnt((Integer)value);
			break;
		case -2056049038:/* rcvSumAm */
			if ( value instanceof String ){
				setRcvSumAm((String)value);
			}
			else if ( value instanceof Double ){
				setRcvSumAm((Double)value);
			}
			else if ( value instanceof Long ){
				setRcvSumAm((Long)value);
			}
			else{
				setRcvSumAm((BigDecimal)value);
			}
			break;
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
		default:
			break;
		}
	}
	
}
