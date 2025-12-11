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
	"bkcd", "acno", "pdcd", "prdNm", "rawActBal", "actOpnd", "dmactYn", "spceSrvcJnngYn", "spceSvrcJnngDt"
}, name="ActInfList_DODT")
@XmlRootElement(name="ActInfList_DODT")
@BxmCategory(logicalName="계좌.정보.목록.DBM.출력.IO", description="") 
public class ActInfList_DODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 1558301726L;
	
	
	
	/**
	 * 은행코드
	 */
	@ApiModelProperty(
		name = "bkcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("bkcd")
	@BxmOmm_Field(length=10, decimal=0, description="은행코드", align="left", fill="")
	private String bkcd= "";
	
	
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
	 * 상품코드
	 */
	@ApiModelProperty(
		name = "pdcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("pdcd")
	@BxmOmm_Field(length=12, decimal=0, description="상품코드", align="left", fill="")
	private String pdcd= "";
	
	
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
	 * 휴면계좌여부
	 */
	@ApiModelProperty(
		name = "dmactYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dmactYn")
	@BxmOmm_Field(length=1, decimal=0, description="휴면계좌여부", align="left", fill="")
	private String dmactYn= "";
	
	
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
		name = "spceSvrcJnngDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("spceSvrcJnngDt")
	@BxmOmm_Field(length=8, decimal=0, description="공간서비스가입일자", align="left", fill="")
	private String spceSvrcJnngDt= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_bkcd= false;
	protected final boolean isSet_bkcd(){
		return this.isSet_bkcd;
	}
	private void setIsSet_bkcd(boolean value){
		this.isSet_bkcd= value;
	}
	/**
	 * 은행코드
	 */
	@XmlTransient
	public String getBkcd(){
		return this.bkcd;
	}
	
	/**
	 * 은행코드
	 * 
	 * @param bkcd 은행코드
	 */
	public void setBkcd(String bkcd){
		this.bkcd= bkcd;
		this.setIsSet_bkcd(true);
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
	private boolean isSet_pdcd= false;
	protected final boolean isSet_pdcd(){
		return this.isSet_pdcd;
	}
	private void setIsSet_pdcd(boolean value){
		this.isSet_pdcd= value;
	}
	/**
	 * 상품코드
	 */
	@XmlTransient
	public String getPdcd(){
		return this.pdcd;
	}
	
	/**
	 * 상품코드
	 * 
	 * @param pdcd 상품코드
	 */
	public void setPdcd(String pdcd){
		this.pdcd= pdcd;
		this.setIsSet_pdcd(true);
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
	private boolean isSet_dmactYn= false;
	protected final boolean isSet_dmactYn(){
		return this.isSet_dmactYn;
	}
	private void setIsSet_dmactYn(boolean value){
		this.isSet_dmactYn= value;
	}
	/**
	 * 휴면계좌여부
	 */
	@XmlTransient
	public String getDmactYn(){
		return this.dmactYn;
	}
	
	/**
	 * 휴면계좌여부
	 * 
	 * @param dmactYn 휴면계좌여부
	 */
	public void setDmactYn(String dmactYn){
		this.dmactYn= dmactYn;
		this.setIsSet_dmactYn(true);
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
	private boolean isSet_spceSvrcJnngDt= false;
	protected final boolean isSet_spceSvrcJnngDt(){
		return this.isSet_spceSvrcJnngDt;
	}
	private void setIsSet_spceSvrcJnngDt(boolean value){
		this.isSet_spceSvrcJnngDt= value;
	}
	/**
	 * 공간서비스가입일자
	 */
	@XmlTransient
	public String getSpceSvrcJnngDt(){
		return this.spceSvrcJnngDt;
	}
	
	/**
	 * 공간서비스가입일자
	 * 
	 * @param spceSvrcJnngDt 공간서비스가입일자
	 */
	public void setSpceSvrcJnngDt(String spceSvrcJnngDt){
		this.spceSvrcJnngDt= spceSvrcJnngDt;
		this.setIsSet_spceSvrcJnngDt(true);
	}
				
	@Override
	public ActInfList_DODT clone(){
		try{
			ActInfList_DODT object= (ActInfList_DODT)super.clone();
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
		
		result= prime * result + ((this.bkcd==null)?0:this.bkcd.hashCode());
		result= prime * result + ((this.acno==null)?0:this.acno.hashCode());
		result= prime * result + ((this.pdcd==null)?0:this.pdcd.hashCode());
		result= prime * result + ((this.prdNm==null)?0:this.prdNm.hashCode());
		result= prime * result + ((this.rawActBal==null)?0:this.rawActBal.hashCode());
		result= prime * result + ((this.actOpnd==null)?0:this.actOpnd.hashCode());
		result= prime * result + ((this.dmactYn==null)?0:this.dmactYn.hashCode());
		result= prime * result + ((this.spceSrvcJnngYn==null)?0:this.spceSrvcJnngYn.hashCode());
		result= prime * result + ((this.spceSvrcJnngDt==null)?0:this.spceSvrcJnngDt.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final ActInfList_DODT other= (ActInfList_DODT)obj;
		{
			Object _bkcd= getBkcd();
			Object __bkcd= other.getBkcd();
			if ( _bkcd== null ) { if ( __bkcd!= null ) return false; }
			else if ( !_bkcd.equals(__bkcd) ) return false;
		}
		{
			Object _acno= getAcno();
			Object __acno= other.getAcno();
			if ( _acno== null ) { if ( __acno!= null ) return false; }
			else if ( !_acno.equals(__acno) ) return false;
		}
		{
			Object _pdcd= getPdcd();
			Object __pdcd= other.getPdcd();
			if ( _pdcd== null ) { if ( __pdcd!= null ) return false; }
			else if ( !_pdcd.equals(__pdcd) ) return false;
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
			Object _dmactYn= getDmactYn();
			Object __dmactYn= other.getDmactYn();
			if ( _dmactYn== null ) { if ( __dmactYn!= null ) return false; }
			else if ( !_dmactYn.equals(__dmactYn) ) return false;
		}
		{
			Object _spceSrvcJnngYn= getSpceSrvcJnngYn();
			Object __spceSrvcJnngYn= other.getSpceSrvcJnngYn();
			if ( _spceSrvcJnngYn== null ) { if ( __spceSrvcJnngYn!= null ) return false; }
			else if ( !_spceSrvcJnngYn.equals(__spceSrvcJnngYn) ) return false;
		}
		{
			Object _spceSvrcJnngDt= getSpceSvrcJnngDt();
			Object __spceSvrcJnngDt= other.getSpceSvrcJnngDt();
			if ( _spceSvrcJnngDt== null ) { if ( __spceSvrcJnngDt!= null ) return false; }
			else if ( !_spceSvrcJnngDt.equals(__spceSvrcJnngDt) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(ActInfList_DODT.class.getName()).append(":\n");
		sb.append("\tbkcd: ");
		sb.append(bkcd==null?"null":getBkcd());
		sb.append("\n");
		sb.append("\tacno: ");
		sb.append(acno==null?"null":getAcno());
		sb.append("\n");
		sb.append("\tpdcd: ");
		sb.append(pdcd==null?"null":getPdcd());
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
		sb.append("\tdmactYn: ");
		sb.append(dmactYn==null?"null":getDmactYn());
		sb.append("\n");
		sb.append("\tspceSrvcJnngYn: ");
		sb.append(spceSrvcJnngYn==null?"null":getSpceSrvcJnngYn());
		sb.append("\n");
		sb.append("\tspceSvrcJnngDt: ");
		sb.append(spceSvrcJnngDt==null?"null":getSpceSvrcJnngDt());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 10; /* bkcd */
		messageLen+= 20; /* acno */
		messageLen+= 12; /* pdcd */
		messageLen+= 40; /* prdNm */
		messageLen+= 18; /* rawActBal */
		messageLen+= 8; /* actOpnd */
		messageLen+= 1; /* dmactYn */
		messageLen+= 1; /* spceSrvcJnngYn */
		messageLen+= 8; /* spceSvrcJnngDt */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("bkcd");
		list.add("acno");
		list.add("pdcd");
		list.add("prdNm");
		list.add("rawActBal");
		list.add("actOpnd");
		list.add("dmactYn");
		list.add("spceSrvcJnngYn");
		list.add("spceSvrcJnngDt");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("bkcd", get("bkcd"));
		map.put("acno", get("acno"));
		map.put("pdcd", get("pdcd"));
		map.put("prdNm", get("prdNm"));
		map.put("rawActBal", get("rawActBal"));
		map.put("actOpnd", get("actOpnd"));
		map.put("dmactYn", get("dmactYn"));
		map.put("spceSrvcJnngYn", get("spceSrvcJnngYn"));
		map.put("spceSvrcJnngDt", get("spceSvrcJnngDt"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 3025514:/* bkcd */
			return getBkcd();
		case 2988387:/* acno */
			return getAcno();
		case 3435861:/* pdcd */
			return getPdcd();
		case 106929153:/* prdNm */
			return getPrdNm();
		case 1852100707:/* rawActBal */
			return getRawActBal();
		case -1162577143:/* actOpnd */
			return getActOpnd();
		case 1769277534:/* dmactYn */
			return getDmactYn();
		case -1652105411:/* spceSrvcJnngYn */
			return getSpceSrvcJnngYn();
		case 1326703936:/* spceSvrcJnngDt */
			return getSpceSvrcJnngDt();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 3025514:/* bkcd */
			setBkcd((String)value);
			break;
		case 2988387:/* acno */
			setAcno((String)value);
			break;
		case 3435861:/* pdcd */
			setPdcd((String)value);
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
		case 1769277534:/* dmactYn */
			setDmactYn((String)value);
			break;
		case -1652105411:/* spceSrvcJnngYn */
			setSpceSrvcJnngYn((String)value);
			break;
		case 1326703936:/* spceSvrcJnngDt */
			setSpceSvrcJnngDt((String)value);
			break;
		default:
			break;
		}
	}
	
}
