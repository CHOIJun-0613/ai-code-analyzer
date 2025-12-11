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
	"cancAcno", "dpacBal", "rcvAcno", "actPwnoUsgYn", "encyActPwno"
}, name="MNPMnyPinSafMngUpdateSafScss_IDT")
@XmlRootElement(name="MNPMnyPinSafMngUpdateSafScss_IDT")
@BxmCategory(logicalName="머니클립.금고.해지.컨트롤러.입력.IO", description="") 
public class MNPMnyPinSafMngUpdateSafScss_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 1501030282L;
	
	
	
	/**
	 * 해지계좌번호
	 */
	@ApiModelProperty(
		name = "cancAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("cancAcno")
	@BxmOmm_Field(length=20, decimal=0, description="해지계좌번호", align="left", fill="")
	private String cancAcno= "";
	
	
	/**
	 * 수신계좌잔액
	 */
	@ApiModelProperty(
		name = "dpacBal"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("dpacBal")
	@BxmOmm_Field(length=64, decimal=0, description="수신계좌잔액", align="right", fill="")
	private BigDecimal dpacBal= new BigDecimal("0");
	
	
	/**
	 * 입금계좌번호
	 */
	@ApiModelProperty(
		name = "rcvAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rcvAcno")
	@BxmOmm_Field(length=30, decimal=0, description="입금계좌번호", align="left", fill="")
	private String rcvAcno= "";
	
	
	/**
	 * 계좌비밀번호사용여부
	 */
	@ApiModelProperty(
		name = "actPwnoUsgYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("actPwnoUsgYn")
	@BxmOmm_Field(length=1, decimal=0, description="계좌비밀번호사용여부", align="left", fill="")
	private String actPwnoUsgYn= "";
	
	
	/**
	 * 암호화계좌비밀번호
	 */
	@ApiModelProperty(
		name = "encyActPwno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("encyActPwno")
	@BxmOmm_Field(length=32, decimal=0, description="암호화계좌비밀번호", align="left", fill="")
	private String encyActPwno= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cancAcno= false;
	protected final boolean isSet_cancAcno(){
		return this.isSet_cancAcno;
	}
	private void setIsSet_cancAcno(boolean value){
		this.isSet_cancAcno= value;
	}
	/**
	 * 해지계좌번호
	 */
	@XmlTransient
	public String getCancAcno(){
		return this.cancAcno;
	}
	
	/**
	 * 해지계좌번호
	 * 
	 * @param cancAcno 해지계좌번호
	 */
	public void setCancAcno(String cancAcno){
		this.cancAcno= cancAcno;
		this.setIsSet_cancAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dpacBal= false;
	protected final boolean isSet_dpacBal(){
		return this.isSet_dpacBal;
	}
	private void setIsSet_dpacBal(boolean value){
		this.isSet_dpacBal= value;
	}
	/**
	 * 수신계좌잔액
	 * BigDecimal - Double value setter
	 *
	 * @Param dpacBal 수신계좌잔액
	 */
	public void setDpacBal(double dpacBal) {
		setDpacBal(BigDecimal.valueOf(dpacBal));
	}
	/**
	 * 수신계좌잔액
	 * BigDecimal - Long value setter
	 *
	 * @Param dpacBal 수신계좌잔액
	 */
	public void setDpacBal(long dpacBal) {
		setDpacBal(BigDecimal.valueOf(dpacBal));
	}
	/**
	 * 수신계좌잔액
	 * BigDecimal - String value setter
	 *
	 * @Param dpacBal 수신계좌잔액
	 */
	public void setDpacBal(String dpacBal) {
		setDpacBal(new BigDecimal(dpacBal));
	}
	/**
	 * 수신계좌잔액
	 */
	@XmlTransient
	public BigDecimal getDpacBal(){
		return this.dpacBal;
	}
	
	/**
	 * 수신계좌잔액
	 * 
	 * @param dpacBal 수신계좌잔액
	 */
	@JsonSetter("dpacBal")
	public void setDpacBal(BigDecimal dpacBal){
		this.dpacBal= dpacBal;
		this.setIsSet_dpacBal(true);
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
	private boolean isSet_actPwnoUsgYn= false;
	protected final boolean isSet_actPwnoUsgYn(){
		return this.isSet_actPwnoUsgYn;
	}
	private void setIsSet_actPwnoUsgYn(boolean value){
		this.isSet_actPwnoUsgYn= value;
	}
	/**
	 * 계좌비밀번호사용여부
	 */
	@XmlTransient
	public String getActPwnoUsgYn(){
		return this.actPwnoUsgYn;
	}
	
	/**
	 * 계좌비밀번호사용여부
	 * 
	 * @param actPwnoUsgYn 계좌비밀번호사용여부
	 */
	public void setActPwnoUsgYn(String actPwnoUsgYn){
		this.actPwnoUsgYn= actPwnoUsgYn;
		this.setIsSet_actPwnoUsgYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_encyActPwno= false;
	protected final boolean isSet_encyActPwno(){
		return this.isSet_encyActPwno;
	}
	private void setIsSet_encyActPwno(boolean value){
		this.isSet_encyActPwno= value;
	}
	/**
	 * 암호화계좌비밀번호
	 */
	@XmlTransient
	public String getEncyActPwno(){
		return this.encyActPwno;
	}
	
	/**
	 * 암호화계좌비밀번호
	 * 
	 * @param encyActPwno 암호화계좌비밀번호
	 */
	public void setEncyActPwno(String encyActPwno){
		this.encyActPwno= encyActPwno;
		this.setIsSet_encyActPwno(true);
	}
				
	@Override
	public MNPMnyPinSafMngUpdateSafScss_IDT clone(){
		try{
			MNPMnyPinSafMngUpdateSafScss_IDT object= (MNPMnyPinSafMngUpdateSafScss_IDT)super.clone();
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
		
		result= prime * result + ((this.cancAcno==null)?0:this.cancAcno.hashCode());
		result= prime * result + ((this.dpacBal==null)?0:this.dpacBal.hashCode());
		result= prime * result + ((this.rcvAcno==null)?0:this.rcvAcno.hashCode());
		result= prime * result + ((this.actPwnoUsgYn==null)?0:this.actPwnoUsgYn.hashCode());
		result= prime * result + ((this.encyActPwno==null)?0:this.encyActPwno.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MNPMnyPinSafMngUpdateSafScss_IDT other= (MNPMnyPinSafMngUpdateSafScss_IDT)obj;
		{
			Object _cancAcno= getCancAcno();
			Object __cancAcno= other.getCancAcno();
			if ( _cancAcno== null ) { if ( __cancAcno!= null ) return false; }
			else if ( !_cancAcno.equals(__cancAcno) ) return false;
		}
		{
			Object _dpacBal= getDpacBal();
			Object __dpacBal= other.getDpacBal();
			if ( _dpacBal== null ) { if ( __dpacBal!= null ) return false; }
			else if ( !_dpacBal.equals(__dpacBal) ) return false;
		}
		{
			Object _rcvAcno= getRcvAcno();
			Object __rcvAcno= other.getRcvAcno();
			if ( _rcvAcno== null ) { if ( __rcvAcno!= null ) return false; }
			else if ( !_rcvAcno.equals(__rcvAcno) ) return false;
		}
		{
			Object _actPwnoUsgYn= getActPwnoUsgYn();
			Object __actPwnoUsgYn= other.getActPwnoUsgYn();
			if ( _actPwnoUsgYn== null ) { if ( __actPwnoUsgYn!= null ) return false; }
			else if ( !_actPwnoUsgYn.equals(__actPwnoUsgYn) ) return false;
		}
		{
			Object _encyActPwno= getEncyActPwno();
			Object __encyActPwno= other.getEncyActPwno();
			if ( _encyActPwno== null ) { if ( __encyActPwno!= null ) return false; }
			else if ( !_encyActPwno.equals(__encyActPwno) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MNPMnyPinSafMngUpdateSafScss_IDT.class.getName()).append(":\n");
		sb.append("\tcancAcno: ");
		sb.append(cancAcno==null?"null":getCancAcno());
		sb.append("\n");
		sb.append("\tdpacBal: ");
		sb.append(dpacBal==null?"null":getDpacBal());
		sb.append("\n");
		sb.append("\trcvAcno: ");
		sb.append(rcvAcno==null?"null":getRcvAcno());
		sb.append("\n");
		sb.append("\tactPwnoUsgYn: ");
		sb.append(actPwnoUsgYn==null?"null":getActPwnoUsgYn());
		sb.append("\n");
		sb.append("\tencyActPwno: ");
		sb.append(encyActPwno==null?"null":getEncyActPwno());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 20; /* cancAcno */
		messageLen+= 64; /* dpacBal */
		messageLen+= 30; /* rcvAcno */
		messageLen+= 1; /* actPwnoUsgYn */
		messageLen+= 32; /* encyActPwno */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("cancAcno");
		list.add("dpacBal");
		list.add("rcvAcno");
		list.add("actPwnoUsgYn");
		list.add("encyActPwno");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("cancAcno", get("cancAcno"));
		map.put("dpacBal", get("dpacBal"));
		map.put("rcvAcno", get("rcvAcno"));
		map.put("actPwnoUsgYn", get("actPwnoUsgYn"));
		map.put("encyActPwno", get("encyActPwno"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -124254570:/* cancAcno */
			return getCancAcno();
		case 1855117183:/* dpacBal */
			return getDpacBal();
		case 1041501032:/* rcvAcno */
			return getRcvAcno();
		case 1280416996:/* actPwnoUsgYn */
			return getActPwnoUsgYn();
		case 1134290395:/* encyActPwno */
			return getEncyActPwno();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -124254570:/* cancAcno */
			setCancAcno((String)value);
			break;
		case 1855117183:/* dpacBal */
			if ( value instanceof String ){
				setDpacBal((String)value);
			}
			else if ( value instanceof Double ){
				setDpacBal((Double)value);
			}
			else if ( value instanceof Long ){
				setDpacBal((Long)value);
			}
			else{
				setDpacBal((BigDecimal)value);
			}
			break;
		case 1041501032:/* rcvAcno */
			setRcvAcno((String)value);
			break;
		case 1280416996:/* actPwnoUsgYn */
			setActPwnoUsgYn((String)value);
			break;
		case 1134290395:/* encyActPwno */
			setEncyActPwno((String)value);
			break;
		default:
			break;
		}
	}
	
}
