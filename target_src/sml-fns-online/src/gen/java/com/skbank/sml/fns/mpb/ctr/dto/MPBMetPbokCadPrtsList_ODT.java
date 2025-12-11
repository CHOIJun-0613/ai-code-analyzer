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
	"metMngNo", "metMbhNm", "metMbhAlsNm", "trnDt", "trnTm", "bzBrcd", "bzbrNm", "trnStcd", "trnAm", "aftrBal", "metMbhSrno"
}, name="MPBMetPbokCadPrtsList_ODT")
@XmlRootElement(name="MPBMetPbokCadPrtsList_ODT")
@BxmCategory(logicalName="모임통장.카드내역.목록.컨트롤러.출력.IO", description="") 
public class MPBMetPbokCadPrtsList_ODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 1102522143L;
	
	
	
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
	 * 모임회원명
	 */
	@ApiModelProperty(
		name = "metMbhNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metMbhNm")
	@BxmOmm_Field(length=50, decimal=0, description="모임회원명", align="left", fill="")
	private String metMbhNm= "";
	
	
	/**
	 * 모임회원별칭명
	 */
	@ApiModelProperty(
		name = "metMbhAlsNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metMbhAlsNm")
	@BxmOmm_Field(length=40, decimal=0, description="모임회원별칭명", align="left", fill="")
	private String metMbhAlsNm= "";
	
	
	/**
	 * 거래일자
	 */
	@ApiModelProperty(
		name = "trnDt"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("trnDt")
	@BxmOmm_Field(length=8, decimal=0, description="거래일자", align="right", fill="")
	private Integer trnDt= 0;
	
	
	/**
	 * 거래시각
	 */
	@ApiModelProperty(
		name = "trnTm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("trnTm")
	@BxmOmm_Field(length=8, decimal=0, description="거래시각", align="left", fill="")
	private String trnTm= "";
	
	
	/**
	 * 영업점코드
	 */
	@ApiModelProperty(
		name = "bzBrcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("bzBrcd")
	@BxmOmm_Field(length=6, decimal=0, description="영업점코드", align="left", fill="")
	private String bzBrcd= "";
	
	
	/**
	 * 영업점명
	 */
	@ApiModelProperty(
		name = "bzbrNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("bzbrNm")
	@BxmOmm_Field(length=50, decimal=0, description="영업점명", align="left", fill="")
	private String bzbrNm= "";
	
	
	/**
	 * 거래상태코드
	 */
	@ApiModelProperty(
		name = "trnStcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("trnStcd")
	@BxmOmm_Field(length=2, decimal=0, description="거래상태코드", align="left", fill="")
	private String trnStcd= "";
	
	
	/**
	 * 거래금액
	 */
	@ApiModelProperty(
		name = "trnAm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("trnAm")
	@BxmOmm_Field(length=20, decimal=0, description="거래금액", align="left", fill="")
	private String trnAm= "";
	
	
	/**
	 * 거래후잔액
	 */
	@ApiModelProperty(
		name = "aftrBal"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("aftrBal")
	@BxmOmm_Field(length=19, decimal=3, description="거래후잔액", align="right", fill="")
	private BigDecimal aftrBal= new BigDecimal("0");
	
	
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
	private boolean isSet_metMbhNm= false;
	protected final boolean isSet_metMbhNm(){
		return this.isSet_metMbhNm;
	}
	private void setIsSet_metMbhNm(boolean value){
		this.isSet_metMbhNm= value;
	}
	/**
	 * 모임회원명
	 */
	@XmlTransient
	public String getMetMbhNm(){
		return this.metMbhNm;
	}
	
	/**
	 * 모임회원명
	 * 
	 * @param metMbhNm 모임회원명
	 */
	public void setMetMbhNm(String metMbhNm){
		this.metMbhNm= metMbhNm;
		this.setIsSet_metMbhNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metMbhAlsNm= false;
	protected final boolean isSet_metMbhAlsNm(){
		return this.isSet_metMbhAlsNm;
	}
	private void setIsSet_metMbhAlsNm(boolean value){
		this.isSet_metMbhAlsNm= value;
	}
	/**
	 * 모임회원별칭명
	 */
	@XmlTransient
	public String getMetMbhAlsNm(){
		return this.metMbhAlsNm;
	}
	
	/**
	 * 모임회원별칭명
	 * 
	 * @param metMbhAlsNm 모임회원별칭명
	 */
	public void setMetMbhAlsNm(String metMbhAlsNm){
		this.metMbhAlsNm= metMbhAlsNm;
		this.setIsSet_metMbhAlsNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_trnDt= false;
	protected final boolean isSet_trnDt(){
		return this.isSet_trnDt;
	}
	private void setIsSet_trnDt(boolean value){
		this.isSet_trnDt= value;
	}
	/**
	 * 거래일자
	 */
	@XmlTransient
	public Integer getTrnDt(){
		return this.trnDt;
	}
	
	/**
	 * 거래일자
	 * 
	 * @param trnDt 거래일자
	 */
	public void setTrnDt(Integer trnDt){
		this.trnDt= trnDt;
		this.setIsSet_trnDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_trnTm= false;
	protected final boolean isSet_trnTm(){
		return this.isSet_trnTm;
	}
	private void setIsSet_trnTm(boolean value){
		this.isSet_trnTm= value;
	}
	/**
	 * 거래시각
	 */
	@XmlTransient
	public String getTrnTm(){
		return this.trnTm;
	}
	
	/**
	 * 거래시각
	 * 
	 * @param trnTm 거래시각
	 */
	public void setTrnTm(String trnTm){
		this.trnTm= trnTm;
		this.setIsSet_trnTm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_bzBrcd= false;
	protected final boolean isSet_bzBrcd(){
		return this.isSet_bzBrcd;
	}
	private void setIsSet_bzBrcd(boolean value){
		this.isSet_bzBrcd= value;
	}
	/**
	 * 영업점코드
	 */
	@XmlTransient
	public String getBzBrcd(){
		return this.bzBrcd;
	}
	
	/**
	 * 영업점코드
	 * 
	 * @param bzBrcd 영업점코드
	 */
	public void setBzBrcd(String bzBrcd){
		this.bzBrcd= bzBrcd;
		this.setIsSet_bzBrcd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_bzbrNm= false;
	protected final boolean isSet_bzbrNm(){
		return this.isSet_bzbrNm;
	}
	private void setIsSet_bzbrNm(boolean value){
		this.isSet_bzbrNm= value;
	}
	/**
	 * 영업점명
	 */
	@XmlTransient
	public String getBzbrNm(){
		return this.bzbrNm;
	}
	
	/**
	 * 영업점명
	 * 
	 * @param bzbrNm 영업점명
	 */
	public void setBzbrNm(String bzbrNm){
		this.bzbrNm= bzbrNm;
		this.setIsSet_bzbrNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_trnStcd= false;
	protected final boolean isSet_trnStcd(){
		return this.isSet_trnStcd;
	}
	private void setIsSet_trnStcd(boolean value){
		this.isSet_trnStcd= value;
	}
	/**
	 * 거래상태코드
	 */
	@XmlTransient
	public String getTrnStcd(){
		return this.trnStcd;
	}
	
	/**
	 * 거래상태코드
	 * 
	 * @param trnStcd 거래상태코드
	 */
	public void setTrnStcd(String trnStcd){
		this.trnStcd= trnStcd;
		this.setIsSet_trnStcd(true);
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
	 */
	@XmlTransient
	public String getTrnAm(){
		return this.trnAm;
	}
	
	/**
	 * 거래금액
	 * 
	 * @param trnAm 거래금액
	 */
	public void setTrnAm(String trnAm){
		this.trnAm= trnAm;
		this.setIsSet_trnAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_aftrBal= false;
	protected final boolean isSet_aftrBal(){
		return this.isSet_aftrBal;
	}
	private void setIsSet_aftrBal(boolean value){
		this.isSet_aftrBal= value;
	}
	/**
	 * 거래후잔액
	 * BigDecimal - Double value setter
	 *
	 * @Param aftrBal 거래후잔액
	 */
	public void setAftrBal(double aftrBal) {
		setAftrBal(BigDecimal.valueOf(aftrBal));
	}
	/**
	 * 거래후잔액
	 * BigDecimal - Long value setter
	 *
	 * @Param aftrBal 거래후잔액
	 */
	public void setAftrBal(long aftrBal) {
		setAftrBal(BigDecimal.valueOf(aftrBal));
	}
	/**
	 * 거래후잔액
	 * BigDecimal - String value setter
	 *
	 * @Param aftrBal 거래후잔액
	 */
	public void setAftrBal(String aftrBal) {
		setAftrBal(new BigDecimal(aftrBal));
	}
	/**
	 * 거래후잔액
	 */
	@XmlTransient
	public BigDecimal getAftrBal(){
		return this.aftrBal;
	}
	
	/**
	 * 거래후잔액
	 * 
	 * @param aftrBal 거래후잔액
	 */
	@JsonSetter("aftrBal")
	public void setAftrBal(BigDecimal aftrBal){
		this.aftrBal= aftrBal;
		this.setIsSet_aftrBal(true);
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
				
	@Override
	public MPBMetPbokCadPrtsList_ODT clone(){
		try{
			MPBMetPbokCadPrtsList_ODT object= (MPBMetPbokCadPrtsList_ODT)super.clone();
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
		result= prime * result + ((this.metMbhNm==null)?0:this.metMbhNm.hashCode());
		result= prime * result + ((this.metMbhAlsNm==null)?0:this.metMbhAlsNm.hashCode());
		result= prime * result + ((this.trnDt==null)?0:this.trnDt.hashCode());
		result= prime * result + ((this.trnTm==null)?0:this.trnTm.hashCode());
		result= prime * result + ((this.bzBrcd==null)?0:this.bzBrcd.hashCode());
		result= prime * result + ((this.bzbrNm==null)?0:this.bzbrNm.hashCode());
		result= prime * result + ((this.trnStcd==null)?0:this.trnStcd.hashCode());
		result= prime * result + ((this.trnAm==null)?0:this.trnAm.hashCode());
		result= prime * result + ((this.aftrBal==null)?0:this.aftrBal.hashCode());
		result= prime * result + ((this.metMbhSrno==null)?0:this.metMbhSrno.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MPBMetPbokCadPrtsList_ODT other= (MPBMetPbokCadPrtsList_ODT)obj;
		{
			Object _metMngNo= getMetMngNo();
			Object __metMngNo= other.getMetMngNo();
			if ( _metMngNo== null ) { if ( __metMngNo!= null ) return false; }
			else if ( !_metMngNo.equals(__metMngNo) ) return false;
		}
		{
			Object _metMbhNm= getMetMbhNm();
			Object __metMbhNm= other.getMetMbhNm();
			if ( _metMbhNm== null ) { if ( __metMbhNm!= null ) return false; }
			else if ( !_metMbhNm.equals(__metMbhNm) ) return false;
		}
		{
			Object _metMbhAlsNm= getMetMbhAlsNm();
			Object __metMbhAlsNm= other.getMetMbhAlsNm();
			if ( _metMbhAlsNm== null ) { if ( __metMbhAlsNm!= null ) return false; }
			else if ( !_metMbhAlsNm.equals(__metMbhAlsNm) ) return false;
		}
		{
			Object _trnDt= getTrnDt();
			Object __trnDt= other.getTrnDt();
			if ( _trnDt== null ) { if ( __trnDt!= null ) return false; }
			else if ( !_trnDt.equals(__trnDt) ) return false;
		}
		{
			Object _trnTm= getTrnTm();
			Object __trnTm= other.getTrnTm();
			if ( _trnTm== null ) { if ( __trnTm!= null ) return false; }
			else if ( !_trnTm.equals(__trnTm) ) return false;
		}
		{
			Object _bzBrcd= getBzBrcd();
			Object __bzBrcd= other.getBzBrcd();
			if ( _bzBrcd== null ) { if ( __bzBrcd!= null ) return false; }
			else if ( !_bzBrcd.equals(__bzBrcd) ) return false;
		}
		{
			Object _bzbrNm= getBzbrNm();
			Object __bzbrNm= other.getBzbrNm();
			if ( _bzbrNm== null ) { if ( __bzbrNm!= null ) return false; }
			else if ( !_bzbrNm.equals(__bzbrNm) ) return false;
		}
		{
			Object _trnStcd= getTrnStcd();
			Object __trnStcd= other.getTrnStcd();
			if ( _trnStcd== null ) { if ( __trnStcd!= null ) return false; }
			else if ( !_trnStcd.equals(__trnStcd) ) return false;
		}
		{
			Object _trnAm= getTrnAm();
			Object __trnAm= other.getTrnAm();
			if ( _trnAm== null ) { if ( __trnAm!= null ) return false; }
			else if ( !_trnAm.equals(__trnAm) ) return false;
		}
		{
			Object _aftrBal= getAftrBal();
			Object __aftrBal= other.getAftrBal();
			if ( _aftrBal== null ) { if ( __aftrBal!= null ) return false; }
			else if ( !_aftrBal.equals(__aftrBal) ) return false;
		}
		{
			Object _metMbhSrno= getMetMbhSrno();
			Object __metMbhSrno= other.getMetMbhSrno();
			if ( _metMbhSrno== null ) { if ( __metMbhSrno!= null ) return false; }
			else if ( !_metMbhSrno.equals(__metMbhSrno) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MPBMetPbokCadPrtsList_ODT.class.getName()).append(":\n");
		sb.append("\tmetMngNo: ");
		sb.append(metMngNo==null?"null":getMetMngNo());
		sb.append("\n");
		sb.append("\tmetMbhNm: ");
		sb.append(metMbhNm==null?"null":getMetMbhNm());
		sb.append("\n");
		sb.append("\tmetMbhAlsNm: ");
		sb.append(metMbhAlsNm==null?"null":getMetMbhAlsNm());
		sb.append("\n");
		sb.append("\ttrnDt: ");
		sb.append(trnDt==null?"null":getTrnDt());
		sb.append("\n");
		sb.append("\ttrnTm: ");
		sb.append(trnTm==null?"null":getTrnTm());
		sb.append("\n");
		sb.append("\tbzBrcd: ");
		sb.append(bzBrcd==null?"null":getBzBrcd());
		sb.append("\n");
		sb.append("\tbzbrNm: ");
		sb.append(bzbrNm==null?"null":getBzbrNm());
		sb.append("\n");
		sb.append("\ttrnStcd: ");
		sb.append(trnStcd==null?"null":getTrnStcd());
		sb.append("\n");
		sb.append("\ttrnAm: ");
		sb.append(trnAm==null?"null":getTrnAm());
		sb.append("\n");
		sb.append("\taftrBal: ");
		sb.append(aftrBal==null?"null":getAftrBal());
		sb.append("\n");
		sb.append("\tmetMbhSrno: ");
		sb.append(metMbhSrno==null?"null":getMetMbhSrno());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 1; /* metMngNo */
		messageLen+= 50; /* metMbhNm */
		messageLen+= 40; /* metMbhAlsNm */
		messageLen+= 8; /* trnDt */
		messageLen+= 8; /* trnTm */
		messageLen+= 6; /* bzBrcd */
		messageLen+= 50; /* bzbrNm */
		messageLen+= 2; /* trnStcd */
		messageLen+= 20; /* trnAm */
		messageLen+= 19; /* aftrBal */
		messageLen+= 30; /* metMbhSrno */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("metMngNo");
		list.add("metMbhNm");
		list.add("metMbhAlsNm");
		list.add("trnDt");
		list.add("trnTm");
		list.add("bzBrcd");
		list.add("bzbrNm");
		list.add("trnStcd");
		list.add("trnAm");
		list.add("aftrBal");
		list.add("metMbhSrno");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("metMngNo", get("metMngNo"));
		map.put("metMbhNm", get("metMbhNm"));
		map.put("metMbhAlsNm", get("metMbhAlsNm"));
		map.put("trnDt", get("trnDt"));
		map.put("trnTm", get("trnTm"));
		map.put("bzBrcd", get("bzBrcd"));
		map.put("bzbrNm", get("bzbrNm"));
		map.put("trnStcd", get("trnStcd"));
		map.put("trnAm", get("trnAm"));
		map.put("aftrBal", get("aftrBal"));
		map.put("metMbhSrno", get("metMbhSrno"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -468172085:/* metMngNo */
			return getMetMngNo();
		case -468528618:/* metMbhNm */
			return getMetMbhNm();
		case 695730640:/* metMbhAlsNm */
			return getMetMbhAlsNm();
		case 110632544:/* trnDt */
			return getTrnDt();
		case 110633033:/* trnTm */
			return getTrnTm();
		case -1374562007:/* bzBrcd */
			return getBzBrcd();
		case -1373609337:/* bzbrNm */
			return getBzbrNm();
		case -1055857582:/* trnStcd */
			return getTrnStcd();
		case 110632444:/* trnAm */
			return getTrnAm();
		case -1075691606:/* aftrBal */
			return getAftrBal();
		case 715721463:/* metMbhSrno */
			return getMetMbhSrno();
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
		case -468528618:/* metMbhNm */
			setMetMbhNm((String)value);
			break;
		case 695730640:/* metMbhAlsNm */
			setMetMbhAlsNm((String)value);
			break;
		case 110632544:/* trnDt */
			setTrnDt((Integer)value);
			break;
		case 110633033:/* trnTm */
			setTrnTm((String)value);
			break;
		case -1374562007:/* bzBrcd */
			setBzBrcd((String)value);
			break;
		case -1373609337:/* bzbrNm */
			setBzbrNm((String)value);
			break;
		case -1055857582:/* trnStcd */
			setTrnStcd((String)value);
			break;
		case 110632444:/* trnAm */
			setTrnAm((String)value);
			break;
		case -1075691606:/* aftrBal */
			if ( value instanceof String ){
				setAftrBal((String)value);
			}
			else if ( value instanceof Double ){
				setAftrBal((Double)value);
			}
			else if ( value instanceof Long ){
				setAftrBal((Long)value);
			}
			else{
				setAftrBal((BigDecimal)value);
			}
			break;
		case 715721463:/* metMbhSrno */
			setMetMbhSrno((String)value);
			break;
		default:
			break;
		}
	}
	
}
