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
	"wdrAcno", "actPwno", "trnAm", "rcvAcno", "ptnPbokPrngTxt", "wdrPbokPrngTxt"
}, name="MNPMnyPinSafMngUpdateSafAmRaw_IDT")
@XmlRootElement(name="MNPMnyPinSafMngUpdateSafAmRaw_IDT")
@BxmCategory(logicalName="머니클립금고금액입출금수정.컨트롤러.입력IO", description="") 
public class MNPMnyPinSafMngUpdateSafAmRaw_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -2005376202L;
	
	
	
	/**
	 * 출금계좌번호
	 */
	@ApiModelProperty(
		name = "wdrAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("wdrAcno")
	@BxmOmm_Field(length=15, decimal=0, description="출금계좌번호", align="left", fill="")
	private String wdrAcno= "";
	
	
	/**
	 * 계좌비밀번호
	 */
	@ApiModelProperty(
		name = "actPwno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("actPwno")
	@BxmOmm_Field(length=50, decimal=0, description="계좌비밀번호", align="left", fill="")
	private String actPwno= "";
	
	
	/**
	 * 거래금액
	 */
	@ApiModelProperty(
		name = "trnAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("trnAm")
	@BxmOmm_Field(length=13, decimal=0, description="거래금액", align="right", fill="0")
	private BigDecimal trnAm= new BigDecimal("0");
	
	
	/**
	 * 입금계좌번호
	 */
	@ApiModelProperty(
		name = "rcvAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rcvAcno")
	@BxmOmm_Field(length=15, decimal=0, description="입금계좌번호", align="left", fill="")
	private String rcvAcno= "";
	
	
	/**
	 * 상대통장인자내용
	 */
	@ApiModelProperty(
		name = "ptnPbokPrngTxt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ptnPbokPrngTxt")
	@BxmOmm_Field(length=22, decimal=0, description="상대통장인자내용", align="left", fill="")
	private String ptnPbokPrngTxt= "";
	
	
	/**
	 * 출금통장인자내용
	 */
	@ApiModelProperty(
		name = "wdrPbokPrngTxt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("wdrPbokPrngTxt")
	@BxmOmm_Field(length=22, decimal=0, description="출금통장인자내용", align="left", fill="")
	private String wdrPbokPrngTxt= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_wdrAcno= false;
	protected final boolean isSet_wdrAcno(){
		return this.isSet_wdrAcno;
	}
	private void setIsSet_wdrAcno(boolean value){
		this.isSet_wdrAcno= value;
	}
	/**
	 * 출금계좌번호
	 */
	@XmlTransient
	public String getWdrAcno(){
		return this.wdrAcno;
	}
	
	/**
	 * 출금계좌번호
	 * 
	 * @param wdrAcno 출금계좌번호
	 */
	public void setWdrAcno(String wdrAcno){
		this.wdrAcno= wdrAcno;
		this.setIsSet_wdrAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_actPwno= false;
	protected final boolean isSet_actPwno(){
		return this.isSet_actPwno;
	}
	private void setIsSet_actPwno(boolean value){
		this.isSet_actPwno= value;
	}
	/**
	 * 계좌비밀번호
	 */
	@XmlTransient
	public String getActPwno(){
		return this.actPwno;
	}
	
	/**
	 * 계좌비밀번호
	 * 
	 * @param actPwno 계좌비밀번호
	 */
	public void setActPwno(String actPwno){
		this.actPwno= actPwno;
		this.setIsSet_actPwno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_trnAm= false;
	protected final boolean isSet_trnAm(){
		return this.isSet_trnAm;
	}
	private void setIsSet_trnAm(boolean value){
		this.isSet_trnAm= value;
	}
	/**
	 * 거래금액
	 * BigDecimal - Double value setter
	 *
	 * @Param trnAm 거래금액
	 */
	public void setTrnAm(double trnAm) {
		setTrnAm(BigDecimal.valueOf(trnAm));
	}
	/**
	 * 거래금액
	 * BigDecimal - Long value setter
	 *
	 * @Param trnAm 거래금액
	 */
	public void setTrnAm(long trnAm) {
		setTrnAm(BigDecimal.valueOf(trnAm));
	}
	/**
	 * 거래금액
	 * BigDecimal - String value setter
	 *
	 * @Param trnAm 거래금액
	 */
	public void setTrnAm(String trnAm) {
		setTrnAm(new BigDecimal(trnAm));
	}
	/**
	 * 거래금액
	 */
	@XmlTransient
	public BigDecimal getTrnAm(){
		return this.trnAm;
	}
	
	/**
	 * 거래금액
	 * 
	 * @param trnAm 거래금액
	 */
	@JsonSetter("trnAm")
	public void setTrnAm(BigDecimal trnAm){
		this.trnAm= trnAm;
		this.setIsSet_trnAm(true);
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
	private boolean isSet_ptnPbokPrngTxt= false;
	protected final boolean isSet_ptnPbokPrngTxt(){
		return this.isSet_ptnPbokPrngTxt;
	}
	private void setIsSet_ptnPbokPrngTxt(boolean value){
		this.isSet_ptnPbokPrngTxt= value;
	}
	/**
	 * 상대통장인자내용
	 */
	@XmlTransient
	public String getPtnPbokPrngTxt(){
		return this.ptnPbokPrngTxt;
	}
	
	/**
	 * 상대통장인자내용
	 * 
	 * @param ptnPbokPrngTxt 상대통장인자내용
	 */
	public void setPtnPbokPrngTxt(String ptnPbokPrngTxt){
		this.ptnPbokPrngTxt= ptnPbokPrngTxt;
		this.setIsSet_ptnPbokPrngTxt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_wdrPbokPrngTxt= false;
	protected final boolean isSet_wdrPbokPrngTxt(){
		return this.isSet_wdrPbokPrngTxt;
	}
	private void setIsSet_wdrPbokPrngTxt(boolean value){
		this.isSet_wdrPbokPrngTxt= value;
	}
	/**
	 * 출금통장인자내용
	 */
	@XmlTransient
	public String getWdrPbokPrngTxt(){
		return this.wdrPbokPrngTxt;
	}
	
	/**
	 * 출금통장인자내용
	 * 
	 * @param wdrPbokPrngTxt 출금통장인자내용
	 */
	public void setWdrPbokPrngTxt(String wdrPbokPrngTxt){
		this.wdrPbokPrngTxt= wdrPbokPrngTxt;
		this.setIsSet_wdrPbokPrngTxt(true);
	}
				
	@Override
	public MNPMnyPinSafMngUpdateSafAmRaw_IDT clone(){
		try{
			MNPMnyPinSafMngUpdateSafAmRaw_IDT object= (MNPMnyPinSafMngUpdateSafAmRaw_IDT)super.clone();
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
		
		result= prime * result + ((this.wdrAcno==null)?0:this.wdrAcno.hashCode());
		result= prime * result + ((this.actPwno==null)?0:this.actPwno.hashCode());
		result= prime * result + ((this.trnAm==null)?0:this.trnAm.hashCode());
		result= prime * result + ((this.rcvAcno==null)?0:this.rcvAcno.hashCode());
		result= prime * result + ((this.ptnPbokPrngTxt==null)?0:this.ptnPbokPrngTxt.hashCode());
		result= prime * result + ((this.wdrPbokPrngTxt==null)?0:this.wdrPbokPrngTxt.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MNPMnyPinSafMngUpdateSafAmRaw_IDT other= (MNPMnyPinSafMngUpdateSafAmRaw_IDT)obj;
		{
			Object _wdrAcno= getWdrAcno();
			Object __wdrAcno= other.getWdrAcno();
			if ( _wdrAcno== null ) { if ( __wdrAcno!= null ) return false; }
			else if ( !_wdrAcno.equals(__wdrAcno) ) return false;
		}
		{
			Object _actPwno= getActPwno();
			Object __actPwno= other.getActPwno();
			if ( _actPwno== null ) { if ( __actPwno!= null ) return false; }
			else if ( !_actPwno.equals(__actPwno) ) return false;
		}
		{
			Object _trnAm= getTrnAm();
			Object __trnAm= other.getTrnAm();
			if ( _trnAm== null ) { if ( __trnAm!= null ) return false; }
			else if ( !_trnAm.equals(__trnAm) ) return false;
		}
		{
			Object _rcvAcno= getRcvAcno();
			Object __rcvAcno= other.getRcvAcno();
			if ( _rcvAcno== null ) { if ( __rcvAcno!= null ) return false; }
			else if ( !_rcvAcno.equals(__rcvAcno) ) return false;
		}
		{
			Object _ptnPbokPrngTxt= getPtnPbokPrngTxt();
			Object __ptnPbokPrngTxt= other.getPtnPbokPrngTxt();
			if ( _ptnPbokPrngTxt== null ) { if ( __ptnPbokPrngTxt!= null ) return false; }
			else if ( !_ptnPbokPrngTxt.equals(__ptnPbokPrngTxt) ) return false;
		}
		{
			Object _wdrPbokPrngTxt= getWdrPbokPrngTxt();
			Object __wdrPbokPrngTxt= other.getWdrPbokPrngTxt();
			if ( _wdrPbokPrngTxt== null ) { if ( __wdrPbokPrngTxt!= null ) return false; }
			else if ( !_wdrPbokPrngTxt.equals(__wdrPbokPrngTxt) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MNPMnyPinSafMngUpdateSafAmRaw_IDT.class.getName()).append(":\n");
		sb.append("\twdrAcno: ");
		sb.append(wdrAcno==null?"null":getWdrAcno());
		sb.append("\n");
		sb.append("\tactPwno: ");
		sb.append(actPwno==null?"null":getActPwno());
		sb.append("\n");
		sb.append("\ttrnAm: ");
		sb.append(trnAm==null?"null":getTrnAm());
		sb.append("\n");
		sb.append("\trcvAcno: ");
		sb.append(rcvAcno==null?"null":getRcvAcno());
		sb.append("\n");
		sb.append("\tptnPbokPrngTxt: ");
		sb.append(ptnPbokPrngTxt==null?"null":getPtnPbokPrngTxt());
		sb.append("\n");
		sb.append("\twdrPbokPrngTxt: ");
		sb.append(wdrPbokPrngTxt==null?"null":getWdrPbokPrngTxt());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 15; /* wdrAcno */
		messageLen+= 50; /* actPwno */
		messageLen+= 13; /* trnAm */
		messageLen+= 15; /* rcvAcno */
		messageLen+= 22; /* ptnPbokPrngTxt */
		messageLen+= 22; /* wdrPbokPrngTxt */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("wdrAcno");
		list.add("actPwno");
		list.add("trnAm");
		list.add("rcvAcno");
		list.add("ptnPbokPrngTxt");
		list.add("wdrPbokPrngTxt");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("wdrAcno", get("wdrAcno"));
		map.put("actPwno", get("actPwno"));
		map.put("trnAm", get("trnAm"));
		map.put("rcvAcno", get("rcvAcno"));
		map.put("ptnPbokPrngTxt", get("ptnPbokPrngTxt"));
		map.put("wdrPbokPrngTxt", get("wdrPbokPrngTxt"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 1208987208:/* wdrAcno */
			return getWdrAcno();
		case -1162540614:/* actPwno */
			return getActPwno();
		case 110632444:/* trnAm */
			return getTrnAm();
		case 1041501032:/* rcvAcno */
			return getRcvAcno();
		case 1137996989:/* ptnPbokPrngTxt */
			return getPtnPbokPrngTxt();
		case -1485101694:/* wdrPbokPrngTxt */
			return getWdrPbokPrngTxt();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 1208987208:/* wdrAcno */
			setWdrAcno((String)value);
			break;
		case -1162540614:/* actPwno */
			setActPwno((String)value);
			break;
		case 110632444:/* trnAm */
			if ( value instanceof String ){
				setTrnAm((String)value);
			}
			else if ( value instanceof Double ){
				setTrnAm((Double)value);
			}
			else if ( value instanceof Long ){
				setTrnAm((Long)value);
			}
			else{
				setTrnAm((BigDecimal)value);
			}
			break;
		case 1041501032:/* rcvAcno */
			setRcvAcno((String)value);
			break;
		case 1137996989:/* ptnPbokPrngTxt */
			setPtnPbokPrngTxt((String)value);
			break;
		case -1485101694:/* wdrPbokPrngTxt */
			setWdrPbokPrngTxt((String)value);
			break;
		default:
			break;
		}
	}
	
}
