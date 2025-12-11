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
import option.WooriOmmOption;

/**
 * 
 */
@WooriOmmOption(propOption=true)
@XmlType(propOrder={
	"spceIconNo", "actKdNm", "acno", "actTotAm", "mmImAm", "mmExpdAm"
}, name="PBPPbokSpceBscMngSelectSpcebsci_ODT")
@XmlRootElement(name="PBPPbokSpceBscMngSelectSpcebsci_ODT")
@BxmCategory(logicalName="공간.기본정보.컨트롤러.출력.IO", description="") 
public class PBPPbokSpceBscMngSelectSpcebsci_ODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -339809291L;
	
	
	
	/**
	 * 공간아이콘번호
	 */
	@ApiModelProperty(
		name = "spceIconNo"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("spceIconNo")
	@BxmOmm_Field(length=2, decimal=0, description="공간아이콘번호", align="right", fill="")
	private Integer spceIconNo= 0;
	
	
	/**
	 * 계좌종류명
	 */
	@ApiModelProperty(
		name = "actKdNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("actKdNm")
	@BxmOmm_Field(length=20, decimal=0, description="계좌종류명", align="left", fill="")
	private String actKdNm= "";
	
	
	/**
	 * 계좌번호
	 */
	@ApiModelProperty(
		name = "acno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("acno")
	@BxmOmm_Field(length=20, decimal=0, description="계좌번호", align="left", fill="", etcProperties={"PROP_OPTION_DSCD=L999"})
	private String acno= "";
	
	
	/**
	 * 계좌총금액
	 */
	@ApiModelProperty(
		name = "actTotAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("actTotAm")
	@BxmOmm_Field(length=18, decimal=3, description="계좌총금액", align="right", fill="")
	private BigDecimal actTotAm= new BigDecimal("0");
	
	
	/**
	 * 월수입금액
	 */
	@ApiModelProperty(
		name = "mmImAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("mmImAm")
	@BxmOmm_Field(length=18, decimal=3, description="월수입금액", align="right", fill="")
	private BigDecimal mmImAm= new BigDecimal("0");
	
	
	/**
	 * 월지출금액
	 */
	@ApiModelProperty(
		name = "mmExpdAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("mmExpdAm")
	@BxmOmm_Field(length=18, decimal=3, description="월지출금액", align="right", fill="")
	private BigDecimal mmExpdAm= new BigDecimal("0");
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_spceIconNo= false;
	protected final boolean isSet_spceIconNo(){
		return this.isSet_spceIconNo;
	}
	private void setIsSet_spceIconNo(boolean value){
		this.isSet_spceIconNo= value;
	}
	/**
	 * 공간아이콘번호
	 */
	@XmlTransient
	public Integer getSpceIconNo(){
		return this.spceIconNo;
	}
	
	/**
	 * 공간아이콘번호
	 * 
	 * @param spceIconNo 공간아이콘번호
	 */
	public void setSpceIconNo(Integer spceIconNo){
		this.spceIconNo= spceIconNo;
		this.setIsSet_spceIconNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_actKdNm= false;
	protected final boolean isSet_actKdNm(){
		return this.isSet_actKdNm;
	}
	private void setIsSet_actKdNm(boolean value){
		this.isSet_actKdNm= value;
	}
	/**
	 * 계좌종류명
	 */
	@XmlTransient
	public String getActKdNm(){
		return this.actKdNm;
	}
	
	/**
	 * 계좌종류명
	 * 
	 * @param actKdNm 계좌종류명
	 */
	public void setActKdNm(String actKdNm){
		this.actKdNm= actKdNm;
		this.setIsSet_actKdNm(true);
	}
	
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
	private boolean isSet_actTotAm= false;
	protected final boolean isSet_actTotAm(){
		return this.isSet_actTotAm;
	}
	private void setIsSet_actTotAm(boolean value){
		this.isSet_actTotAm= value;
	}
	/**
	 * 계좌총금액
	 * BigDecimal - Double value setter
	 *
	 * @Param actTotAm 계좌총금액
	 */
	public void setActTotAm(double actTotAm) {
		setActTotAm(BigDecimal.valueOf(actTotAm));
	}
	/**
	 * 계좌총금액
	 * BigDecimal - Long value setter
	 *
	 * @Param actTotAm 계좌총금액
	 */
	public void setActTotAm(long actTotAm) {
		setActTotAm(BigDecimal.valueOf(actTotAm));
	}
	/**
	 * 계좌총금액
	 * BigDecimal - String value setter
	 *
	 * @Param actTotAm 계좌총금액
	 */
	public void setActTotAm(String actTotAm) {
		setActTotAm(new BigDecimal(actTotAm));
	}
	/**
	 * 계좌총금액
	 */
	@XmlTransient
	public BigDecimal getActTotAm(){
		return this.actTotAm;
	}
	
	/**
	 * 계좌총금액
	 * 
	 * @param actTotAm 계좌총금액
	 */
	@JsonSetter("actTotAm")
	public void setActTotAm(BigDecimal actTotAm){
		this.actTotAm= actTotAm;
		this.setIsSet_actTotAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mmImAm= false;
	protected final boolean isSet_mmImAm(){
		return this.isSet_mmImAm;
	}
	private void setIsSet_mmImAm(boolean value){
		this.isSet_mmImAm= value;
	}
	/**
	 * 월수입금액
	 * BigDecimal - Double value setter
	 *
	 * @Param mmImAm 월수입금액
	 */
	public void setMmImAm(double mmImAm) {
		setMmImAm(BigDecimal.valueOf(mmImAm));
	}
	/**
	 * 월수입금액
	 * BigDecimal - Long value setter
	 *
	 * @Param mmImAm 월수입금액
	 */
	public void setMmImAm(long mmImAm) {
		setMmImAm(BigDecimal.valueOf(mmImAm));
	}
	/**
	 * 월수입금액
	 * BigDecimal - String value setter
	 *
	 * @Param mmImAm 월수입금액
	 */
	public void setMmImAm(String mmImAm) {
		setMmImAm(new BigDecimal(mmImAm));
	}
	/**
	 * 월수입금액
	 */
	@XmlTransient
	public BigDecimal getMmImAm(){
		return this.mmImAm;
	}
	
	/**
	 * 월수입금액
	 * 
	 * @param mmImAm 월수입금액
	 */
	@JsonSetter("mmImAm")
	public void setMmImAm(BigDecimal mmImAm){
		this.mmImAm= mmImAm;
		this.setIsSet_mmImAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mmExpdAm= false;
	protected final boolean isSet_mmExpdAm(){
		return this.isSet_mmExpdAm;
	}
	private void setIsSet_mmExpdAm(boolean value){
		this.isSet_mmExpdAm= value;
	}
	/**
	 * 월지출금액
	 * BigDecimal - Double value setter
	 *
	 * @Param mmExpdAm 월지출금액
	 */
	public void setMmExpdAm(double mmExpdAm) {
		setMmExpdAm(BigDecimal.valueOf(mmExpdAm));
	}
	/**
	 * 월지출금액
	 * BigDecimal - Long value setter
	 *
	 * @Param mmExpdAm 월지출금액
	 */
	public void setMmExpdAm(long mmExpdAm) {
		setMmExpdAm(BigDecimal.valueOf(mmExpdAm));
	}
	/**
	 * 월지출금액
	 * BigDecimal - String value setter
	 *
	 * @Param mmExpdAm 월지출금액
	 */
	public void setMmExpdAm(String mmExpdAm) {
		setMmExpdAm(new BigDecimal(mmExpdAm));
	}
	/**
	 * 월지출금액
	 */
	@XmlTransient
	public BigDecimal getMmExpdAm(){
		return this.mmExpdAm;
	}
	
	/**
	 * 월지출금액
	 * 
	 * @param mmExpdAm 월지출금액
	 */
	@JsonSetter("mmExpdAm")
	public void setMmExpdAm(BigDecimal mmExpdAm){
		this.mmExpdAm= mmExpdAm;
		this.setIsSet_mmExpdAm(true);
	}
				
	@Override
	public PBPPbokSpceBscMngSelectSpcebsci_ODT clone(){
		try{
			PBPPbokSpceBscMngSelectSpcebsci_ODT object= (PBPPbokSpceBscMngSelectSpcebsci_ODT)super.clone();
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
		
		result= prime * result + ((this.spceIconNo==null)?0:this.spceIconNo.hashCode());
		result= prime * result + ((this.actKdNm==null)?0:this.actKdNm.hashCode());
		result= prime * result + ((this.acno==null)?0:this.acno.hashCode());
		result= prime * result + ((this.actTotAm==null)?0:this.actTotAm.hashCode());
		result= prime * result + ((this.mmImAm==null)?0:this.mmImAm.hashCode());
		result= prime * result + ((this.mmExpdAm==null)?0:this.mmExpdAm.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final PBPPbokSpceBscMngSelectSpcebsci_ODT other= (PBPPbokSpceBscMngSelectSpcebsci_ODT)obj;
		{
			Object _spceIconNo= getSpceIconNo();
			Object __spceIconNo= other.getSpceIconNo();
			if ( _spceIconNo== null ) { if ( __spceIconNo!= null ) return false; }
			else if ( !_spceIconNo.equals(__spceIconNo) ) return false;
		}
		{
			Object _actKdNm= getActKdNm();
			Object __actKdNm= other.getActKdNm();
			if ( _actKdNm== null ) { if ( __actKdNm!= null ) return false; }
			else if ( !_actKdNm.equals(__actKdNm) ) return false;
		}
		{
			Object _acno= getAcno();
			Object __acno= other.getAcno();
			if ( _acno== null ) { if ( __acno!= null ) return false; }
			else if ( !_acno.equals(__acno) ) return false;
		}
		{
			Object _actTotAm= getActTotAm();
			Object __actTotAm= other.getActTotAm();
			if ( _actTotAm== null ) { if ( __actTotAm!= null ) return false; }
			else if ( !_actTotAm.equals(__actTotAm) ) return false;
		}
		{
			Object _mmImAm= getMmImAm();
			Object __mmImAm= other.getMmImAm();
			if ( _mmImAm== null ) { if ( __mmImAm!= null ) return false; }
			else if ( !_mmImAm.equals(__mmImAm) ) return false;
		}
		{
			Object _mmExpdAm= getMmExpdAm();
			Object __mmExpdAm= other.getMmExpdAm();
			if ( _mmExpdAm== null ) { if ( __mmExpdAm!= null ) return false; }
			else if ( !_mmExpdAm.equals(__mmExpdAm) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(PBPPbokSpceBscMngSelectSpcebsci_ODT.class.getName()).append(":\n");
		sb.append("\tspceIconNo: ");
		sb.append(spceIconNo==null?"null":getSpceIconNo());
		sb.append("\n");
		sb.append("\tactKdNm: ");
		sb.append(actKdNm==null?"null":getActKdNm());
		sb.append("\n");
		sb.append("\tacno: ");
		sb.append(acno==null?"null":getAcno());
		sb.append("\n");
		sb.append("\tactTotAm: ");
		sb.append(actTotAm==null?"null":getActTotAm());
		sb.append("\n");
		sb.append("\tmmImAm: ");
		sb.append(mmImAm==null?"null":getMmImAm());
		sb.append("\n");
		sb.append("\tmmExpdAm: ");
		sb.append(mmExpdAm==null?"null":getMmExpdAm());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 2; /* spceIconNo */
		messageLen+= 20; /* actKdNm */
		messageLen+= 20; /* acno */
		messageLen+= 18; /* actTotAm */
		messageLen+= 18; /* mmImAm */
		messageLen+= 18; /* mmExpdAm */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("spceIconNo");
		list.add("actKdNm");
		list.add("acno");
		list.add("actTotAm");
		list.add("mmImAm");
		list.add("mmExpdAm");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("spceIconNo", get("spceIconNo"));
		map.put("actKdNm", get("actKdNm"));
		map.put("acno", get("acno"));
		map.put("actTotAm", get("actTotAm"));
		map.put("mmImAm", get("mmImAm"));
		map.put("mmExpdAm", get("mmExpdAm"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 672207993:/* spceIconNo */
			return getSpceIconNo();
		case -1162708822:/* actKdNm */
			return getActKdNm();
		case 2988387:/* acno */
			return getAcno();
		case -1675560461:/* actTotAm */
			return getActTotAm();
		case -1071444432:/* mmImAm */
			return getMmImAm();
		case 1031087667:/* mmExpdAm */
			return getMmExpdAm();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 672207993:/* spceIconNo */
			setSpceIconNo((Integer)value);
			break;
		case -1162708822:/* actKdNm */
			setActKdNm((String)value);
			break;
		case 2988387:/* acno */
			setAcno((String)value);
			break;
		case -1675560461:/* actTotAm */
			if ( value instanceof String ){
				setActTotAm((String)value);
			}
			else if ( value instanceof Double ){
				setActTotAm((Double)value);
			}
			else if ( value instanceof Long ){
				setActTotAm((Long)value);
			}
			else{
				setActTotAm((BigDecimal)value);
			}
			break;
		case -1071444432:/* mmImAm */
			if ( value instanceof String ){
				setMmImAm((String)value);
			}
			else if ( value instanceof Double ){
				setMmImAm((Double)value);
			}
			else if ( value instanceof Long ){
				setMmImAm((Long)value);
			}
			else{
				setMmImAm((BigDecimal)value);
			}
			break;
		case 1031087667:/* mmExpdAm */
			if ( value instanceof String ){
				setMmExpdAm((String)value);
			}
			else if ( value instanceof Double ){
				setMmExpdAm((Double)value);
			}
			else if ( value instanceof Long ){
				setMmExpdAm((Long)value);
			}
			else{
				setMmExpdAm((BigDecimal)value);
			}
			break;
		default:
			break;
		}
	}
	
}
