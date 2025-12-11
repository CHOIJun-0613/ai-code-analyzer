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
	"atsMngNo", "atsWdrBkwAcno", "rcvAcno", "atsAm", "atsItcd", "atsItmTxt"
}, name="MNPMnyPinSafMngUpdateSafGoalInfScss_IDT")
@XmlRootElement(name="MNPMnyPinSafMngUpdateSafGoalInfScss_IDT")
@BxmCategory(logicalName="머니클립.금고.목표.정보.해지.수정.컨트롤러.입력.IO", description="") 
public class MNPMnyPinSafMngUpdateSafGoalInfScss_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 42305400L;
	
	
	
	/**
	 * 자동이체관리번호
	 */
	@ApiModelProperty(
		name = "atsMngNo"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("atsMngNo")
	@BxmOmm_Field(length=13, decimal=0, description="자동이체관리번호", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=N"})
	private BigDecimal atsMngNo= new BigDecimal("0");
	
	
	/**
	 * 자동이체출금전행계좌번호
	 */
	@ApiModelProperty(
		name = "atsWdrBkwAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atsWdrBkwAcno")
	@BxmOmm_Field(length=20, decimal=0, description="자동이체출금전행계좌번호", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String atsWdrBkwAcno= "";
	
	
	/**
	 * 입금계좌번호
	 */
	@ApiModelProperty(
		name = "rcvAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rcvAcno")
	@BxmOmm_Field(length=15, decimal=0, description="입금계좌번호", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String rcvAcno= "";
	
	
	/**
	 * 자동이체금액
	 */
	@ApiModelProperty(
		name = "atsAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("atsAm")
	@BxmOmm_Field(length=18, decimal=0, description="자동이체금액", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=N"})
	private BigDecimal atsAm= new BigDecimal("0");
	
	
	/**
	 * 자동이체항목코드
	 */
	@ApiModelProperty(
		name = "atsItcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atsItcd")
	@BxmOmm_Field(length=2, decimal=0, description="자동이체항목코드", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String atsItcd= "";
	
	
	/**
	 * 자동이체항목내용
	 */
	@ApiModelProperty(
		name = "atsItmTxt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atsItmTxt")
	@BxmOmm_Field(length=70, decimal=0, description="자동이체항목내용", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String atsItmTxt= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atsMngNo= false;
	protected final boolean isSet_atsMngNo(){
		return this.isSet_atsMngNo;
	}
	private void setIsSet_atsMngNo(boolean value){
		this.isSet_atsMngNo= value;
	}
	/**
	 * 자동이체관리번호
	 * BigDecimal - Double value setter
	 *
	 * @Param atsMngNo 자동이체관리번호
	 */
	public void setAtsMngNo(double atsMngNo) {
		setAtsMngNo(BigDecimal.valueOf(atsMngNo));
	}
	/**
	 * 자동이체관리번호
	 * BigDecimal - Long value setter
	 *
	 * @Param atsMngNo 자동이체관리번호
	 */
	public void setAtsMngNo(long atsMngNo) {
		setAtsMngNo(BigDecimal.valueOf(atsMngNo));
	}
	/**
	 * 자동이체관리번호
	 * BigDecimal - String value setter
	 *
	 * @Param atsMngNo 자동이체관리번호
	 */
	public void setAtsMngNo(String atsMngNo) {
		setAtsMngNo(new BigDecimal(atsMngNo));
	}
	/**
	 * 자동이체관리번호
	 */
	@XmlTransient
	public BigDecimal getAtsMngNo(){
		return this.atsMngNo;
	}
	
	/**
	 * 자동이체관리번호
	 * 
	 * @param atsMngNo 자동이체관리번호
	 */
	@JsonSetter("atsMngNo")
	public void setAtsMngNo(BigDecimal atsMngNo){
		this.atsMngNo= atsMngNo;
		this.setIsSet_atsMngNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atsWdrBkwAcno= false;
	protected final boolean isSet_atsWdrBkwAcno(){
		return this.isSet_atsWdrBkwAcno;
	}
	private void setIsSet_atsWdrBkwAcno(boolean value){
		this.isSet_atsWdrBkwAcno= value;
	}
	/**
	 * 자동이체출금전행계좌번호
	 */
	@XmlTransient
	public String getAtsWdrBkwAcno(){
		return this.atsWdrBkwAcno;
	}
	
	/**
	 * 자동이체출금전행계좌번호
	 * 
	 * @param atsWdrBkwAcno 자동이체출금전행계좌번호
	 */
	public void setAtsWdrBkwAcno(String atsWdrBkwAcno){
		this.atsWdrBkwAcno= atsWdrBkwAcno;
		this.setIsSet_atsWdrBkwAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rcvAcno= false;
	protected final boolean isSet_rcvAcno(){
		return this.isSet_rcvAcno;
	}
	private void setIsSet_rcvAcno(boolean value){
		this.isSet_rcvAcno= value;
	}
	/**
	 * 입금계좌번호
	 */
	@XmlTransient
	public String getRcvAcno(){
		return this.rcvAcno;
	}
	
	/**
	 * 입금계좌번호
	 * 
	 * @param rcvAcno 입금계좌번호
	 */
	public void setRcvAcno(String rcvAcno){
		this.rcvAcno= rcvAcno;
		this.setIsSet_rcvAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atsAm= false;
	protected final boolean isSet_atsAm(){
		return this.isSet_atsAm;
	}
	private void setIsSet_atsAm(boolean value){
		this.isSet_atsAm= value;
	}
	/**
	 * 자동이체금액
	 * BigDecimal - Double value setter
	 *
	 * @Param atsAm 자동이체금액
	 */
	public void setAtsAm(double atsAm) {
		setAtsAm(BigDecimal.valueOf(atsAm));
	}
	/**
	 * 자동이체금액
	 * BigDecimal - Long value setter
	 *
	 * @Param atsAm 자동이체금액
	 */
	public void setAtsAm(long atsAm) {
		setAtsAm(BigDecimal.valueOf(atsAm));
	}
	/**
	 * 자동이체금액
	 * BigDecimal - String value setter
	 *
	 * @Param atsAm 자동이체금액
	 */
	public void setAtsAm(String atsAm) {
		setAtsAm(new BigDecimal(atsAm));
	}
	/**
	 * 자동이체금액
	 */
	@XmlTransient
	public BigDecimal getAtsAm(){
		return this.atsAm;
	}
	
	/**
	 * 자동이체금액
	 * 
	 * @param atsAm 자동이체금액
	 */
	@JsonSetter("atsAm")
	public void setAtsAm(BigDecimal atsAm){
		this.atsAm= atsAm;
		this.setIsSet_atsAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atsItcd= false;
	protected final boolean isSet_atsItcd(){
		return this.isSet_atsItcd;
	}
	private void setIsSet_atsItcd(boolean value){
		this.isSet_atsItcd= value;
	}
	/**
	 * 자동이체항목코드
	 */
	@XmlTransient
	public String getAtsItcd(){
		return this.atsItcd;
	}
	
	/**
	 * 자동이체항목코드
	 * 
	 * @param atsItcd 자동이체항목코드
	 */
	public void setAtsItcd(String atsItcd){
		this.atsItcd= atsItcd;
		this.setIsSet_atsItcd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atsItmTxt= false;
	protected final boolean isSet_atsItmTxt(){
		return this.isSet_atsItmTxt;
	}
	private void setIsSet_atsItmTxt(boolean value){
		this.isSet_atsItmTxt= value;
	}
	/**
	 * 자동이체항목내용
	 */
	@XmlTransient
	public String getAtsItmTxt(){
		return this.atsItmTxt;
	}
	
	/**
	 * 자동이체항목내용
	 * 
	 * @param atsItmTxt 자동이체항목내용
	 */
	public void setAtsItmTxt(String atsItmTxt){
		this.atsItmTxt= atsItmTxt;
		this.setIsSet_atsItmTxt(true);
	}
				
	@Override
	public MNPMnyPinSafMngUpdateSafGoalInfScss_IDT clone(){
		try{
			MNPMnyPinSafMngUpdateSafGoalInfScss_IDT object= (MNPMnyPinSafMngUpdateSafGoalInfScss_IDT)super.clone();
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
		
		result= prime * result + ((this.atsMngNo==null)?0:this.atsMngNo.hashCode());
		result= prime * result + ((this.atsWdrBkwAcno==null)?0:this.atsWdrBkwAcno.hashCode());
		result= prime * result + ((this.rcvAcno==null)?0:this.rcvAcno.hashCode());
		result= prime * result + ((this.atsAm==null)?0:this.atsAm.hashCode());
		result= prime * result + ((this.atsItcd==null)?0:this.atsItcd.hashCode());
		result= prime * result + ((this.atsItmTxt==null)?0:this.atsItmTxt.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MNPMnyPinSafMngUpdateSafGoalInfScss_IDT other= (MNPMnyPinSafMngUpdateSafGoalInfScss_IDT)obj;
		{
			Object _atsMngNo= getAtsMngNo();
			Object __atsMngNo= other.getAtsMngNo();
			if ( _atsMngNo== null ) { if ( __atsMngNo!= null ) return false; }
			else if ( !_atsMngNo.equals(__atsMngNo) ) return false;
		}
		{
			Object _atsWdrBkwAcno= getAtsWdrBkwAcno();
			Object __atsWdrBkwAcno= other.getAtsWdrBkwAcno();
			if ( _atsWdrBkwAcno== null ) { if ( __atsWdrBkwAcno!= null ) return false; }
			else if ( !_atsWdrBkwAcno.equals(__atsWdrBkwAcno) ) return false;
		}
		{
			Object _rcvAcno= getRcvAcno();
			Object __rcvAcno= other.getRcvAcno();
			if ( _rcvAcno== null ) { if ( __rcvAcno!= null ) return false; }
			else if ( !_rcvAcno.equals(__rcvAcno) ) return false;
		}
		{
			Object _atsAm= getAtsAm();
			Object __atsAm= other.getAtsAm();
			if ( _atsAm== null ) { if ( __atsAm!= null ) return false; }
			else if ( !_atsAm.equals(__atsAm) ) return false;
		}
		{
			Object _atsItcd= getAtsItcd();
			Object __atsItcd= other.getAtsItcd();
			if ( _atsItcd== null ) { if ( __atsItcd!= null ) return false; }
			else if ( !_atsItcd.equals(__atsItcd) ) return false;
		}
		{
			Object _atsItmTxt= getAtsItmTxt();
			Object __atsItmTxt= other.getAtsItmTxt();
			if ( _atsItmTxt== null ) { if ( __atsItmTxt!= null ) return false; }
			else if ( !_atsItmTxt.equals(__atsItmTxt) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MNPMnyPinSafMngUpdateSafGoalInfScss_IDT.class.getName()).append(":\n");
		sb.append("\tatsMngNo: ");
		sb.append(atsMngNo==null?"null":getAtsMngNo());
		sb.append("\n");
		sb.append("\tatsWdrBkwAcno: ");
		sb.append(atsWdrBkwAcno==null?"null":getAtsWdrBkwAcno());
		sb.append("\n");
		sb.append("\trcvAcno: ");
		sb.append(rcvAcno==null?"null":getRcvAcno());
		sb.append("\n");
		sb.append("\tatsAm: ");
		sb.append(atsAm==null?"null":getAtsAm());
		sb.append("\n");
		sb.append("\tatsItcd: ");
		sb.append(atsItcd==null?"null":getAtsItcd());
		sb.append("\n");
		sb.append("\tatsItmTxt: ");
		sb.append(atsItmTxt==null?"null":getAtsItmTxt());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 13; /* atsMngNo */
		messageLen+= 20; /* atsWdrBkwAcno */
		messageLen+= 15; /* rcvAcno */
		messageLen+= 18; /* atsAm */
		messageLen+= 2; /* atsItcd */
		messageLen+= 70; /* atsItmTxt */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("atsMngNo");
		list.add("atsWdrBkwAcno");
		list.add("rcvAcno");
		list.add("atsAm");
		list.add("atsItcd");
		list.add("atsItmTxt");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("atsMngNo", get("atsMngNo"));
		map.put("atsWdrBkwAcno", get("atsWdrBkwAcno"));
		map.put("rcvAcno", get("rcvAcno"));
		map.put("atsAm", get("atsAm"));
		map.put("atsItcd", get("atsItcd"));
		map.put("atsItmTxt", get("atsItmTxt"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 491964551:/* atsMngNo */
			return getAtsMngNo();
		case 1366640524:/* atsWdrBkwAcno */
			return getAtsWdrBkwAcno();
		case 1041501032:/* rcvAcno */
			return getRcvAcno();
		case 93149932:/* atsAm */
			return getAtsAm();
		case -676980340:/* atsItcd */
			return getAtsItcd();
		case -2037758674:/* atsItmTxt */
			return getAtsItmTxt();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 491964551:/* atsMngNo */
			if ( value instanceof String ){
				setAtsMngNo((String)value);
			}
			else if ( value instanceof Double ){
				setAtsMngNo((Double)value);
			}
			else if ( value instanceof Long ){
				setAtsMngNo((Long)value);
			}
			else{
				setAtsMngNo((BigDecimal)value);
			}
			break;
		case 1366640524:/* atsWdrBkwAcno */
			setAtsWdrBkwAcno((String)value);
			break;
		case 1041501032:/* rcvAcno */
			setRcvAcno((String)value);
			break;
		case 93149932:/* atsAm */
			if ( value instanceof String ){
				setAtsAm((String)value);
			}
			else if ( value instanceof Double ){
				setAtsAm((Double)value);
			}
			else if ( value instanceof Long ){
				setAtsAm((Long)value);
			}
			else{
				setAtsAm((BigDecimal)value);
			}
			break;
		case -676980340:/* atsItcd */
			setAtsItcd((String)value);
			break;
		case -2037758674:/* atsItmTxt */
			setAtsItmTxt((String)value);
			break;
		default:
			break;
		}
	}
	
}
