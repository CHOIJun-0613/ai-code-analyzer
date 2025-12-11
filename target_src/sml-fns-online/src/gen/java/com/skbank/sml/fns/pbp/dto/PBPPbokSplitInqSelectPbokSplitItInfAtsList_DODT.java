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
	"spceNo", "atsMngNo", "atpmTsRgsYn", "atsCycd", "atsCycdNm", "atsBasDd", "atsReqAm", "atsWkdDscd", "atsWkdDscdNm"
}, name="PBPPbokSplitInqSelectPbokSplitItInfAtsList_DODT")
@XmlRootElement(name="PBPPbokSplitInqSelectPbokSplitItInfAtsList_DODT")
@BxmCategory(logicalName="통장.쪼개기.통합.조회.자동이체.목록.DBM.출력.IO", description="") 
public class PBPPbokSplitInqSelectPbokSplitItInfAtsList_DODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -20529327L;
	
	
	
	/**
	 * 공간번호
	 */
	@ApiModelProperty(
		name = "spceNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("spceNo")
	@BxmOmm_Field(length=6, decimal=0, description="공간번호", align="left", fill="")
	private String spceNo= "";
	
	
	/**
	 * 자동납부관리번호
	 */
	@ApiModelProperty(
		name = "atsMngNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atsMngNo")
	@BxmOmm_Field(length=13, decimal=0, description="자동납부관리번호", align="left", fill="")
	private String atsMngNo= "";
	
	
	/**
	 * 자동납부이체등록여부
	 */
	@ApiModelProperty(
		name = "atpmTsRgsYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atpmTsRgsYn")
	@BxmOmm_Field(length=1, decimal=0, description="자동납부이체등록여부", align="left", fill="")
	private String atpmTsRgsYn= "";
	
	
	/**
	 * 자동이체주기코드
	 */
	@ApiModelProperty(
		name = "atsCycd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atsCycd")
	@BxmOmm_Field(length=2, decimal=0, description="자동이체주기코드", align="left", fill="")
	private String atsCycd= "";
	
	
	/**
	 * 자동이체주기코드명
	 */
	@ApiModelProperty(
		name = "atsCycdNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atsCycdNm")
	@BxmOmm_Field(length=40, decimal=0, description="자동이체주기코드명", align="left", fill="")
	private String atsCycdNm= "";
	
	
	/**
	 * 자동이체기준일
	 */
	@ApiModelProperty(
		name = "atsBasDd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atsBasDd")
	@BxmOmm_Field(length=2, decimal=0, description="자동이체기준일", align="left", fill="")
	private String atsBasDd= "";
	
	
	/**
	 * 자동이체요청금액
	 */
	@ApiModelProperty(
		name = "atsReqAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("atsReqAm")
	@BxmOmm_Field(length=19, decimal=3, description="자동이체요청금액", align="right", fill="0")
	private BigDecimal atsReqAm= new BigDecimal("0");
	
	
	/**
	 * 자동이체요일구분코드
	 */
	@ApiModelProperty(
		name = "atsWkdDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atsWkdDscd")
	@BxmOmm_Field(length=1, decimal=0, description="자동이체요일구분코드", align="left", fill="")
	private String atsWkdDscd= "";
	
	
	/**
	 * 자동이체요일구분코드명
	 */
	@ApiModelProperty(
		name = "atsWkdDscdNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atsWkdDscdNm")
	@BxmOmm_Field(length=40, decimal=0, description="자동이체요일구분코드명", align="left", fill="")
	private String atsWkdDscdNm= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_spceNo= false;
	protected final boolean isSet_spceNo(){
		return this.isSet_spceNo;
	}
	private void setIsSet_spceNo(boolean value){
		this.isSet_spceNo= value;
	}
	/**
	 * 공간번호
	 */
	@XmlTransient
	public String getSpceNo(){
		return this.spceNo;
	}
	
	/**
	 * 공간번호
	 * 
	 * @param spceNo 공간번호
	 */
	public void setSpceNo(String spceNo){
		this.spceNo= spceNo;
		this.setIsSet_spceNo(true);
	}
	
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
	 * 자동납부관리번호
	 */
	@XmlTransient
	public String getAtsMngNo(){
		return this.atsMngNo;
	}
	
	/**
	 * 자동납부관리번호
	 * 
	 * @param atsMngNo 자동납부관리번호
	 */
	public void setAtsMngNo(String atsMngNo){
		this.atsMngNo= atsMngNo;
		this.setIsSet_atsMngNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atpmTsRgsYn= false;
	protected final boolean isSet_atpmTsRgsYn(){
		return this.isSet_atpmTsRgsYn;
	}
	private void setIsSet_atpmTsRgsYn(boolean value){
		this.isSet_atpmTsRgsYn= value;
	}
	/**
	 * 자동납부이체등록여부
	 */
	@XmlTransient
	public String getAtpmTsRgsYn(){
		return this.atpmTsRgsYn;
	}
	
	/**
	 * 자동납부이체등록여부
	 * 
	 * @param atpmTsRgsYn 자동납부이체등록여부
	 */
	public void setAtpmTsRgsYn(String atpmTsRgsYn){
		this.atpmTsRgsYn= atpmTsRgsYn;
		this.setIsSet_atpmTsRgsYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atsCycd= false;
	protected final boolean isSet_atsCycd(){
		return this.isSet_atsCycd;
	}
	private void setIsSet_atsCycd(boolean value){
		this.isSet_atsCycd= value;
	}
	/**
	 * 자동이체주기코드
	 */
	@XmlTransient
	public String getAtsCycd(){
		return this.atsCycd;
	}
	
	/**
	 * 자동이체주기코드
	 * 
	 * @param atsCycd 자동이체주기코드
	 */
	public void setAtsCycd(String atsCycd){
		this.atsCycd= atsCycd;
		this.setIsSet_atsCycd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atsCycdNm= false;
	protected final boolean isSet_atsCycdNm(){
		return this.isSet_atsCycdNm;
	}
	private void setIsSet_atsCycdNm(boolean value){
		this.isSet_atsCycdNm= value;
	}
	/**
	 * 자동이체주기코드명
	 */
	@XmlTransient
	public String getAtsCycdNm(){
		return this.atsCycdNm;
	}
	
	/**
	 * 자동이체주기코드명
	 * 
	 * @param atsCycdNm 자동이체주기코드명
	 */
	public void setAtsCycdNm(String atsCycdNm){
		this.atsCycdNm= atsCycdNm;
		this.setIsSet_atsCycdNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atsBasDd= false;
	protected final boolean isSet_atsBasDd(){
		return this.isSet_atsBasDd;
	}
	private void setIsSet_atsBasDd(boolean value){
		this.isSet_atsBasDd= value;
	}
	/**
	 * 자동이체기준일
	 */
	@XmlTransient
	public String getAtsBasDd(){
		return this.atsBasDd;
	}
	
	/**
	 * 자동이체기준일
	 * 
	 * @param atsBasDd 자동이체기준일
	 */
	public void setAtsBasDd(String atsBasDd){
		this.atsBasDd= atsBasDd;
		this.setIsSet_atsBasDd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atsReqAm= false;
	protected final boolean isSet_atsReqAm(){
		return this.isSet_atsReqAm;
	}
	private void setIsSet_atsReqAm(boolean value){
		this.isSet_atsReqAm= value;
	}
	/**
	 * 자동이체요청금액
	 * BigDecimal - Double value setter
	 *
	 * @Param atsReqAm 자동이체요청금액
	 */
	public void setAtsReqAm(double atsReqAm) {
		setAtsReqAm(BigDecimal.valueOf(atsReqAm));
	}
	/**
	 * 자동이체요청금액
	 * BigDecimal - Long value setter
	 *
	 * @Param atsReqAm 자동이체요청금액
	 */
	public void setAtsReqAm(long atsReqAm) {
		setAtsReqAm(BigDecimal.valueOf(atsReqAm));
	}
	/**
	 * 자동이체요청금액
	 * BigDecimal - String value setter
	 *
	 * @Param atsReqAm 자동이체요청금액
	 */
	public void setAtsReqAm(String atsReqAm) {
		setAtsReqAm(new BigDecimal(atsReqAm));
	}
	/**
	 * 자동이체요청금액
	 */
	@XmlTransient
	public BigDecimal getAtsReqAm(){
		return this.atsReqAm;
	}
	
	/**
	 * 자동이체요청금액
	 * 
	 * @param atsReqAm 자동이체요청금액
	 */
	@JsonSetter("atsReqAm")
	public void setAtsReqAm(BigDecimal atsReqAm){
		this.atsReqAm= atsReqAm;
		this.setIsSet_atsReqAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atsWkdDscd= false;
	protected final boolean isSet_atsWkdDscd(){
		return this.isSet_atsWkdDscd;
	}
	private void setIsSet_atsWkdDscd(boolean value){
		this.isSet_atsWkdDscd= value;
	}
	/**
	 * 자동이체요일구분코드
	 */
	@XmlTransient
	public String getAtsWkdDscd(){
		return this.atsWkdDscd;
	}
	
	/**
	 * 자동이체요일구분코드
	 * 
	 * @param atsWkdDscd 자동이체요일구분코드
	 */
	public void setAtsWkdDscd(String atsWkdDscd){
		this.atsWkdDscd= atsWkdDscd;
		this.setIsSet_atsWkdDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atsWkdDscdNm= false;
	protected final boolean isSet_atsWkdDscdNm(){
		return this.isSet_atsWkdDscdNm;
	}
	private void setIsSet_atsWkdDscdNm(boolean value){
		this.isSet_atsWkdDscdNm= value;
	}
	/**
	 * 자동이체요일구분코드명
	 */
	@XmlTransient
	public String getAtsWkdDscdNm(){
		return this.atsWkdDscdNm;
	}
	
	/**
	 * 자동이체요일구분코드명
	 * 
	 * @param atsWkdDscdNm 자동이체요일구분코드명
	 */
	public void setAtsWkdDscdNm(String atsWkdDscdNm){
		this.atsWkdDscdNm= atsWkdDscdNm;
		this.setIsSet_atsWkdDscdNm(true);
	}
				
	@Override
	public PBPPbokSplitInqSelectPbokSplitItInfAtsList_DODT clone(){
		try{
			PBPPbokSplitInqSelectPbokSplitItInfAtsList_DODT object= (PBPPbokSplitInqSelectPbokSplitItInfAtsList_DODT)super.clone();
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
		
		result= prime * result + ((this.spceNo==null)?0:this.spceNo.hashCode());
		result= prime * result + ((this.atsMngNo==null)?0:this.atsMngNo.hashCode());
		result= prime * result + ((this.atpmTsRgsYn==null)?0:this.atpmTsRgsYn.hashCode());
		result= prime * result + ((this.atsCycd==null)?0:this.atsCycd.hashCode());
		result= prime * result + ((this.atsCycdNm==null)?0:this.atsCycdNm.hashCode());
		result= prime * result + ((this.atsBasDd==null)?0:this.atsBasDd.hashCode());
		result= prime * result + ((this.atsReqAm==null)?0:this.atsReqAm.hashCode());
		result= prime * result + ((this.atsWkdDscd==null)?0:this.atsWkdDscd.hashCode());
		result= prime * result + ((this.atsWkdDscdNm==null)?0:this.atsWkdDscdNm.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final PBPPbokSplitInqSelectPbokSplitItInfAtsList_DODT other= (PBPPbokSplitInqSelectPbokSplitItInfAtsList_DODT)obj;
		{
			Object _spceNo= getSpceNo();
			Object __spceNo= other.getSpceNo();
			if ( _spceNo== null ) { if ( __spceNo!= null ) return false; }
			else if ( !_spceNo.equals(__spceNo) ) return false;
		}
		{
			Object _atsMngNo= getAtsMngNo();
			Object __atsMngNo= other.getAtsMngNo();
			if ( _atsMngNo== null ) { if ( __atsMngNo!= null ) return false; }
			else if ( !_atsMngNo.equals(__atsMngNo) ) return false;
		}
		{
			Object _atpmTsRgsYn= getAtpmTsRgsYn();
			Object __atpmTsRgsYn= other.getAtpmTsRgsYn();
			if ( _atpmTsRgsYn== null ) { if ( __atpmTsRgsYn!= null ) return false; }
			else if ( !_atpmTsRgsYn.equals(__atpmTsRgsYn) ) return false;
		}
		{
			Object _atsCycd= getAtsCycd();
			Object __atsCycd= other.getAtsCycd();
			if ( _atsCycd== null ) { if ( __atsCycd!= null ) return false; }
			else if ( !_atsCycd.equals(__atsCycd) ) return false;
		}
		{
			Object _atsCycdNm= getAtsCycdNm();
			Object __atsCycdNm= other.getAtsCycdNm();
			if ( _atsCycdNm== null ) { if ( __atsCycdNm!= null ) return false; }
			else if ( !_atsCycdNm.equals(__atsCycdNm) ) return false;
		}
		{
			Object _atsBasDd= getAtsBasDd();
			Object __atsBasDd= other.getAtsBasDd();
			if ( _atsBasDd== null ) { if ( __atsBasDd!= null ) return false; }
			else if ( !_atsBasDd.equals(__atsBasDd) ) return false;
		}
		{
			Object _atsReqAm= getAtsReqAm();
			Object __atsReqAm= other.getAtsReqAm();
			if ( _atsReqAm== null ) { if ( __atsReqAm!= null ) return false; }
			else if ( !_atsReqAm.equals(__atsReqAm) ) return false;
		}
		{
			Object _atsWkdDscd= getAtsWkdDscd();
			Object __atsWkdDscd= other.getAtsWkdDscd();
			if ( _atsWkdDscd== null ) { if ( __atsWkdDscd!= null ) return false; }
			else if ( !_atsWkdDscd.equals(__atsWkdDscd) ) return false;
		}
		{
			Object _atsWkdDscdNm= getAtsWkdDscdNm();
			Object __atsWkdDscdNm= other.getAtsWkdDscdNm();
			if ( _atsWkdDscdNm== null ) { if ( __atsWkdDscdNm!= null ) return false; }
			else if ( !_atsWkdDscdNm.equals(__atsWkdDscdNm) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(PBPPbokSplitInqSelectPbokSplitItInfAtsList_DODT.class.getName()).append(":\n");
		sb.append("\tspceNo: ");
		sb.append(spceNo==null?"null":getSpceNo());
		sb.append("\n");
		sb.append("\tatsMngNo: ");
		sb.append(atsMngNo==null?"null":getAtsMngNo());
		sb.append("\n");
		sb.append("\tatpmTsRgsYn: ");
		sb.append(atpmTsRgsYn==null?"null":getAtpmTsRgsYn());
		sb.append("\n");
		sb.append("\tatsCycd: ");
		sb.append(atsCycd==null?"null":getAtsCycd());
		sb.append("\n");
		sb.append("\tatsCycdNm: ");
		sb.append(atsCycdNm==null?"null":getAtsCycdNm());
		sb.append("\n");
		sb.append("\tatsBasDd: ");
		sb.append(atsBasDd==null?"null":getAtsBasDd());
		sb.append("\n");
		sb.append("\tatsReqAm: ");
		sb.append(atsReqAm==null?"null":getAtsReqAm());
		sb.append("\n");
		sb.append("\tatsWkdDscd: ");
		sb.append(atsWkdDscd==null?"null":getAtsWkdDscd());
		sb.append("\n");
		sb.append("\tatsWkdDscdNm: ");
		sb.append(atsWkdDscdNm==null?"null":getAtsWkdDscdNm());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 6; /* spceNo */
		messageLen+= 13; /* atsMngNo */
		messageLen+= 1; /* atpmTsRgsYn */
		messageLen+= 2; /* atsCycd */
		messageLen+= 40; /* atsCycdNm */
		messageLen+= 2; /* atsBasDd */
		messageLen+= 19; /* atsReqAm */
		messageLen+= 1; /* atsWkdDscd */
		messageLen+= 40; /* atsWkdDscdNm */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("spceNo");
		list.add("atsMngNo");
		list.add("atpmTsRgsYn");
		list.add("atsCycd");
		list.add("atsCycdNm");
		list.add("atsBasDd");
		list.add("atsReqAm");
		list.add("atsWkdDscd");
		list.add("atsWkdDscdNm");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("spceNo", get("spceNo"));
		map.put("atsMngNo", get("atsMngNo"));
		map.put("atpmTsRgsYn", get("atpmTsRgsYn"));
		map.put("atsCycd", get("atsCycd"));
		map.put("atsCycdNm", get("atsCycdNm"));
		map.put("atsBasDd", get("atsBasDd"));
		map.put("atsReqAm", get("atsReqAm"));
		map.put("atsWkdDscd", get("atsWkdDscd"));
		map.put("atsWkdDscdNm", get("atsWkdDscdNm"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -896131680:/* spceNo */
			return getSpceNo();
		case 491964551:/* atsMngNo */
			return getAtsMngNo();
		case 1497136580:/* atpmTsRgsYn */
			return getAtpmTsRgsYn();
		case -677154281:/* atsCycd */
			return getAtsCycd();
		case 2089767478:/* atsCycdNm */
			return getAtsCycdNm();
		case 481429748:/* atsBasDd */
			return getAtsBasDd();
		case 496323242:/* atsReqAm */
			return getAtsReqAm();
		case 527684256:/* atsWkdDscd */
			return getAtsWkdDscd();
		case 298431615:/* atsWkdDscdNm */
			return getAtsWkdDscdNm();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -896131680:/* spceNo */
			setSpceNo((String)value);
			break;
		case 491964551:/* atsMngNo */
			setAtsMngNo((String)value);
			break;
		case 1497136580:/* atpmTsRgsYn */
			setAtpmTsRgsYn((String)value);
			break;
		case -677154281:/* atsCycd */
			setAtsCycd((String)value);
			break;
		case 2089767478:/* atsCycdNm */
			setAtsCycdNm((String)value);
			break;
		case 481429748:/* atsBasDd */
			setAtsBasDd((String)value);
			break;
		case 496323242:/* atsReqAm */
			if ( value instanceof String ){
				setAtsReqAm((String)value);
			}
			else if ( value instanceof Double ){
				setAtsReqAm((Double)value);
			}
			else if ( value instanceof Long ){
				setAtsReqAm((Long)value);
			}
			else{
				setAtsReqAm((BigDecimal)value);
			}
			break;
		case 527684256:/* atsWkdDscd */
			setAtsWkdDscd((String)value);
			break;
		case 298431615:/* atsWkdDscdNm */
			setAtsWkdDscdNm((String)value);
			break;
		default:
			break;
		}
	}
	
}
