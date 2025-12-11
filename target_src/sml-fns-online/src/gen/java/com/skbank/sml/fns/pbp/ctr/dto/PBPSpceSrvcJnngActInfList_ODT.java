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
	"acno", "prdNm", "rawActBal", "actOpnd", "spceSrvcJnngYn", "spceSrvcJnngDt", "subSpceCnt", "goalNtfcYn"
}, name="PBPSpceSrvcJnngActInfList_ODT")
@XmlRootElement(name="PBPSpceSrvcJnngActInfList_ODT")
@BxmCategory(logicalName="공간.서비스가입.계좌.정보.목록.컨트롤러.출력.IO", description="") 
public class PBPSpceSrvcJnngActInfList_ODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -474843593L;
	
	
	
	/**
	 * 계좌번호
	 */
	@ApiModelProperty(
		name = "acno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("acno")
	@BxmOmm_Field(length=20, decimal=0, description="계좌번호", align="left", fill="")
	private String acno= "";
	
	
	/**
	 * 상품명
	 */
	@ApiModelProperty(
		name = "prdNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("prdNm")
	@BxmOmm_Field(length=40, decimal=0, description="상품명", align="left", fill="")
	private String prdNm= "";
	
	
	/**
	 * 입출금계좌잔액
	 */
	@ApiModelProperty(
		name = "rawActBal"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("rawActBal")
	@BxmOmm_Field(length=18, decimal=3, description="입출금계좌잔액", align="right", fill="")
	private BigDecimal rawActBal= new BigDecimal("0");
	
	
	/**
	 * 계좌개설일
	 */
	@ApiModelProperty(
		name = "actOpnd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("actOpnd")
	@BxmOmm_Field(length=8, decimal=0, description="계좌개설일", align="left", fill="")
	private String actOpnd= "";
	
	
	/**
	 * 공간서비스가입여부
	 */
	@ApiModelProperty(
		name = "spceSrvcJnngYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("spceSrvcJnngYn")
	@BxmOmm_Field(length=1, decimal=0, description="공간서비스가입여부", align="left", fill="")
	private String spceSrvcJnngYn= "";
	
	
	/**
	 * 공간서비스가입일자
	 */
	@ApiModelProperty(
		name = "spceSrvcJnngDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("spceSrvcJnngDt")
	@BxmOmm_Field(length=8, decimal=0, description="공간서비스가입일자", align="left", fill="")
	private String spceSrvcJnngDt= "";
	
	
	/**
	 * 서브공간갯수
	 */
	@ApiModelProperty(
		name = "subSpceCnt"
		, dataType = "int"
		)
	@XmlElement
	@JsonProperty("subSpceCnt")
	@BxmOmm_Field(length=2, decimal=0, description="서브공간갯수", align="left", fill="")
	private int subSpceCnt= 0;
	
	
	/**
	 * 목표알림여부
	 */
	@ApiModelProperty(
		name = "goalNtfcYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("goalNtfcYn")
	@BxmOmm_Field(length=1, decimal=0, description="목표알림여부", align="left", fill="")
	private String goalNtfcYn= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_acno= false;
	protected final boolean isSet_acno(){
		return this.isSet_acno;
	}
	private void setIsSet_acno(boolean value){
		this.isSet_acno= value;
	}
	/**
	 * 계좌번호
	 */
	@XmlTransient
	public String getAcno(){
		return this.acno;
	}
	
	/**
	 * 계좌번호
	 * 
	 * @param acno 계좌번호
	 */
	public void setAcno(String acno){
		this.acno= acno;
		this.setIsSet_acno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_prdNm= false;
	protected final boolean isSet_prdNm(){
		return this.isSet_prdNm;
	}
	private void setIsSet_prdNm(boolean value){
		this.isSet_prdNm= value;
	}
	/**
	 * 상품명
	 */
	@XmlTransient
	public String getPrdNm(){
		return this.prdNm;
	}
	
	/**
	 * 상품명
	 * 
	 * @param prdNm 상품명
	 */
	public void setPrdNm(String prdNm){
		this.prdNm= prdNm;
		this.setIsSet_prdNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rawActBal= false;
	protected final boolean isSet_rawActBal(){
		return this.isSet_rawActBal;
	}
	private void setIsSet_rawActBal(boolean value){
		this.isSet_rawActBal= value;
	}
	/**
	 * 입출금계좌잔액
	 * BigDecimal - Double value setter
	 *
	 * @Param rawActBal 입출금계좌잔액
	 */
	public void setRawActBal(double rawActBal) {
		setRawActBal(BigDecimal.valueOf(rawActBal));
	}
	/**
	 * 입출금계좌잔액
	 * BigDecimal - Long value setter
	 *
	 * @Param rawActBal 입출금계좌잔액
	 */
	public void setRawActBal(long rawActBal) {
		setRawActBal(BigDecimal.valueOf(rawActBal));
	}
	/**
	 * 입출금계좌잔액
	 * BigDecimal - String value setter
	 *
	 * @Param rawActBal 입출금계좌잔액
	 */
	public void setRawActBal(String rawActBal) {
		setRawActBal(new BigDecimal(rawActBal));
	}
	/**
	 * 입출금계좌잔액
	 */
	@XmlTransient
	public BigDecimal getRawActBal(){
		return this.rawActBal;
	}
	
	/**
	 * 입출금계좌잔액
	 * 
	 * @param rawActBal 입출금계좌잔액
	 */
	@JsonSetter("rawActBal")
	public void setRawActBal(BigDecimal rawActBal){
		this.rawActBal= rawActBal;
		this.setIsSet_rawActBal(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_actOpnd= false;
	protected final boolean isSet_actOpnd(){
		return this.isSet_actOpnd;
	}
	private void setIsSet_actOpnd(boolean value){
		this.isSet_actOpnd= value;
	}
	/**
	 * 계좌개설일
	 */
	@XmlTransient
	public String getActOpnd(){
		return this.actOpnd;
	}
	
	/**
	 * 계좌개설일
	 * 
	 * @param actOpnd 계좌개설일
	 */
	public void setActOpnd(String actOpnd){
		this.actOpnd= actOpnd;
		this.setIsSet_actOpnd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_spceSrvcJnngYn= false;
	protected final boolean isSet_spceSrvcJnngYn(){
		return this.isSet_spceSrvcJnngYn;
	}
	private void setIsSet_spceSrvcJnngYn(boolean value){
		this.isSet_spceSrvcJnngYn= value;
	}
	/**
	 * 공간서비스가입여부
	 */
	@XmlTransient
	public String getSpceSrvcJnngYn(){
		return this.spceSrvcJnngYn;
	}
	
	/**
	 * 공간서비스가입여부
	 * 
	 * @param spceSrvcJnngYn 공간서비스가입여부
	 */
	public void setSpceSrvcJnngYn(String spceSrvcJnngYn){
		this.spceSrvcJnngYn= spceSrvcJnngYn;
		this.setIsSet_spceSrvcJnngYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_spceSrvcJnngDt= false;
	protected final boolean isSet_spceSrvcJnngDt(){
		return this.isSet_spceSrvcJnngDt;
	}
	private void setIsSet_spceSrvcJnngDt(boolean value){
		this.isSet_spceSrvcJnngDt= value;
	}
	/**
	 * 공간서비스가입일자
	 */
	@XmlTransient
	public String getSpceSrvcJnngDt(){
		return this.spceSrvcJnngDt;
	}
	
	/**
	 * 공간서비스가입일자
	 * 
	 * @param spceSrvcJnngDt 공간서비스가입일자
	 */
	public void setSpceSrvcJnngDt(String spceSrvcJnngDt){
		this.spceSrvcJnngDt= spceSrvcJnngDt;
		this.setIsSet_spceSrvcJnngDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_subSpceCnt= false;
	protected final boolean isSet_subSpceCnt(){
		return this.isSet_subSpceCnt;
	}
	private void setIsSet_subSpceCnt(boolean value){
		this.isSet_subSpceCnt= value;
	}
	/**
	 * 서브공간갯수
	 */
	@XmlTransient
	public int getSubSpceCnt(){
		return this.subSpceCnt;
	}
	
	/**
	 * 서브공간갯수
	 * 
	 * @param subSpceCnt 서브공간갯수
	 */
	public void setSubSpceCnt(int subSpceCnt){
		this.subSpceCnt= subSpceCnt;
		this.setIsSet_subSpceCnt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_goalNtfcYn= false;
	protected final boolean isSet_goalNtfcYn(){
		return this.isSet_goalNtfcYn;
	}
	private void setIsSet_goalNtfcYn(boolean value){
		this.isSet_goalNtfcYn= value;
	}
	/**
	 * 목표알림여부
	 */
	@XmlTransient
	public String getGoalNtfcYn(){
		return this.goalNtfcYn;
	}
	
	/**
	 * 목표알림여부
	 * 
	 * @param goalNtfcYn 목표알림여부
	 */
	public void setGoalNtfcYn(String goalNtfcYn){
		this.goalNtfcYn= goalNtfcYn;
		this.setIsSet_goalNtfcYn(true);
	}
				
	@Override
	public PBPSpceSrvcJnngActInfList_ODT clone(){
		try{
			PBPSpceSrvcJnngActInfList_ODT object= (PBPSpceSrvcJnngActInfList_ODT)super.clone();
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
		
		result= prime * result + ((this.acno==null)?0:this.acno.hashCode());
		result= prime * result + ((this.prdNm==null)?0:this.prdNm.hashCode());
		result= prime * result + ((this.rawActBal==null)?0:this.rawActBal.hashCode());
		result= prime * result + ((this.actOpnd==null)?0:this.actOpnd.hashCode());
		result= prime * result + ((this.spceSrvcJnngYn==null)?0:this.spceSrvcJnngYn.hashCode());
		result= prime * result + ((this.spceSrvcJnngDt==null)?0:this.spceSrvcJnngDt.hashCode());
		result= prime * result + (int)this.subSpceCnt;
		result= prime * result + ((this.goalNtfcYn==null)?0:this.goalNtfcYn.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final PBPSpceSrvcJnngActInfList_ODT other= (PBPSpceSrvcJnngActInfList_ODT)obj;
		{
			Object _acno= getAcno();
			Object __acno= other.getAcno();
			if ( _acno== null ) { if ( __acno!= null ) return false; }
			else if ( !_acno.equals(__acno) ) return false;
		}
		{
			Object _prdNm= getPrdNm();
			Object __prdNm= other.getPrdNm();
			if ( _prdNm== null ) { if ( __prdNm!= null ) return false; }
			else if ( !_prdNm.equals(__prdNm) ) return false;
		}
		{
			Object _rawActBal= getRawActBal();
			Object __rawActBal= other.getRawActBal();
			if ( _rawActBal== null ) { if ( __rawActBal!= null ) return false; }
			else if ( !_rawActBal.equals(__rawActBal) ) return false;
		}
		{
			Object _actOpnd= getActOpnd();
			Object __actOpnd= other.getActOpnd();
			if ( _actOpnd== null ) { if ( __actOpnd!= null ) return false; }
			else if ( !_actOpnd.equals(__actOpnd) ) return false;
		}
		{
			Object _spceSrvcJnngYn= getSpceSrvcJnngYn();
			Object __spceSrvcJnngYn= other.getSpceSrvcJnngYn();
			if ( _spceSrvcJnngYn== null ) { if ( __spceSrvcJnngYn!= null ) return false; }
			else if ( !_spceSrvcJnngYn.equals(__spceSrvcJnngYn) ) return false;
		}
		{
			Object _spceSrvcJnngDt= getSpceSrvcJnngDt();
			Object __spceSrvcJnngDt= other.getSpceSrvcJnngDt();
			if ( _spceSrvcJnngDt== null ) { if ( __spceSrvcJnngDt!= null ) return false; }
			else if ( !_spceSrvcJnngDt.equals(__spceSrvcJnngDt) ) return false;
		}
		{
			if ( subSpceCnt!= other.subSpceCnt) return false;
		}
		{
			Object _goalNtfcYn= getGoalNtfcYn();
			Object __goalNtfcYn= other.getGoalNtfcYn();
			if ( _goalNtfcYn== null ) { if ( __goalNtfcYn!= null ) return false; }
			else if ( !_goalNtfcYn.equals(__goalNtfcYn) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(PBPSpceSrvcJnngActInfList_ODT.class.getName()).append(":\n");
		sb.append("\tacno: ");
		sb.append(acno==null?"null":getAcno());
		sb.append("\n");
		sb.append("\tprdNm: ");
		sb.append(prdNm==null?"null":getPrdNm());
		sb.append("\n");
		sb.append("\trawActBal: ");
		sb.append(rawActBal==null?"null":getRawActBal());
		sb.append("\n");
		sb.append("\tactOpnd: ");
		sb.append(actOpnd==null?"null":getActOpnd());
		sb.append("\n");
		sb.append("\tspceSrvcJnngYn: ");
		sb.append(spceSrvcJnngYn==null?"null":getSpceSrvcJnngYn());
		sb.append("\n");
		sb.append("\tspceSrvcJnngDt: ");
		sb.append(spceSrvcJnngDt==null?"null":getSpceSrvcJnngDt());
		sb.append("\n");
		sb.append("\tsubSpceCnt: ");
		sb.append(getSubSpceCnt());
		sb.append("\n");
		sb.append("\tgoalNtfcYn: ");
		sb.append(goalNtfcYn==null?"null":getGoalNtfcYn());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 20; /* acno */
		messageLen+= 40; /* prdNm */
		messageLen+= 18; /* rawActBal */
		messageLen+= 8; /* actOpnd */
		messageLen+= 1; /* spceSrvcJnngYn */
		messageLen+= 8; /* spceSrvcJnngDt */
		messageLen+= 2; /* subSpceCnt */
		messageLen+= 1; /* goalNtfcYn */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("acno");
		list.add("prdNm");
		list.add("rawActBal");
		list.add("actOpnd");
		list.add("spceSrvcJnngYn");
		list.add("spceSrvcJnngDt");
		list.add("subSpceCnt");
		list.add("goalNtfcYn");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("acno", get("acno"));
		map.put("prdNm", get("prdNm"));
		map.put("rawActBal", get("rawActBal"));
		map.put("actOpnd", get("actOpnd"));
		map.put("spceSrvcJnngYn", get("spceSrvcJnngYn"));
		map.put("spceSrvcJnngDt", get("spceSrvcJnngDt"));
		map.put("subSpceCnt", get("subSpceCnt"));
		map.put("goalNtfcYn", get("goalNtfcYn"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 2988387:/* acno */
			return getAcno();
		case 106929153:/* prdNm */
			return getPrdNm();
		case 1852100707:/* rawActBal */
			return getRawActBal();
		case -1162577143:/* actOpnd */
			return getActOpnd();
		case -1652105411:/* spceSrvcJnngYn */
			return getSpceSrvcJnngYn();
		case -1652106056:/* spceSrvcJnngDt */
			return getSpceSrvcJnngDt();
		case 803061514:/* subSpceCnt */
			return getSubSpceCnt();
		case -866637717:/* goalNtfcYn */
			return getGoalNtfcYn();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 2988387:/* acno */
			setAcno((String)value);
			break;
		case 106929153:/* prdNm */
			setPrdNm((String)value);
			break;
		case 1852100707:/* rawActBal */
			if ( value instanceof String ){
				setRawActBal((String)value);
			}
			else if ( value instanceof Double ){
				setRawActBal((Double)value);
			}
			else if ( value instanceof Long ){
				setRawActBal((Long)value);
			}
			else{
				setRawActBal((BigDecimal)value);
			}
			break;
		case -1162577143:/* actOpnd */
			setActOpnd((String)value);
			break;
		case -1652105411:/* spceSrvcJnngYn */
			setSpceSrvcJnngYn((String)value);
			break;
		case -1652106056:/* spceSrvcJnngDt */
			setSpceSrvcJnngDt((String)value);
			break;
		case 803061514:/* subSpceCnt */
			setSubSpceCnt((int)value);
			break;
		case -866637717:/* goalNtfcYn */
			setGoalNtfcYn((String)value);
			break;
		default:
			break;
		}
	}
	
}
