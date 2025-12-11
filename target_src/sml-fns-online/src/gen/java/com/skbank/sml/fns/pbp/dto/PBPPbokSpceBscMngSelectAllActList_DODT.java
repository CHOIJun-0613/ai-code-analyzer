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
	"acno", "cusUsgBkwAcno", "prdNm", "rawActBal", "spceSrvcJnngYn", "spceSvrcJnngDt", "spceCnt"
}, name="PBPPbokSpceBscMngSelectAllActList_DODT")
@XmlRootElement(name="PBPPbokSpceBscMngSelectAllActList_DODT")
@BxmCategory(logicalName="계좌.정보.목록.DBM.출력.IO", description="") 
public class PBPPbokSpceBscMngSelectAllActList_DODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -2045664065L;
	
	
	
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
	 * 고객사용전행계좌번호
	 */
	@ApiModelProperty(
		name = "cusUsgBkwAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("cusUsgBkwAcno")
	@BxmOmm_Field(length=20, decimal=0, description="고객사용전행계좌번호", align="left", fill="")
	private String cusUsgBkwAcno= "";
	
	
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
	
	
	/**
	 * 공간건수
	 */
	@ApiModelProperty(
		name = "spceCnt"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("spceCnt")
	@BxmOmm_Field(length=3, decimal=0, description="공간건수", align="right", fill="")
	private Integer spceCnt= 0;
	
	
	
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
	private boolean isSet_cusUsgBkwAcno= false;
	protected final boolean isSet_cusUsgBkwAcno(){
		return this.isSet_cusUsgBkwAcno;
	}
	private void setIsSet_cusUsgBkwAcno(boolean value){
		this.isSet_cusUsgBkwAcno= value;
	}
	/**
	 * 고객사용전행계좌번호
	 */
	@XmlTransient
	public String getCusUsgBkwAcno(){
		return this.cusUsgBkwAcno;
	}
	
	/**
	 * 고객사용전행계좌번호
	 * 
	 * @param cusUsgBkwAcno 고객사용전행계좌번호
	 */
	public void setCusUsgBkwAcno(String cusUsgBkwAcno){
		this.cusUsgBkwAcno= cusUsgBkwAcno;
		this.setIsSet_cusUsgBkwAcno(true);
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
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_spceCnt= false;
	protected final boolean isSet_spceCnt(){
		return this.isSet_spceCnt;
	}
	private void setIsSet_spceCnt(boolean value){
		this.isSet_spceCnt= value;
	}
	/**
	 * 공간건수
	 */
	@XmlTransient
	public Integer getSpceCnt(){
		return this.spceCnt;
	}
	
	/**
	 * 공간건수
	 * 
	 * @param spceCnt 공간건수
	 */
	public void setSpceCnt(Integer spceCnt){
		this.spceCnt= spceCnt;
		this.setIsSet_spceCnt(true);
	}
				
	@Override
	public PBPPbokSpceBscMngSelectAllActList_DODT clone(){
		try{
			PBPPbokSpceBscMngSelectAllActList_DODT object= (PBPPbokSpceBscMngSelectAllActList_DODT)super.clone();
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
		result= prime * result + ((this.cusUsgBkwAcno==null)?0:this.cusUsgBkwAcno.hashCode());
		result= prime * result + ((this.prdNm==null)?0:this.prdNm.hashCode());
		result= prime * result + ((this.rawActBal==null)?0:this.rawActBal.hashCode());
		result= prime * result + ((this.spceSrvcJnngYn==null)?0:this.spceSrvcJnngYn.hashCode());
		result= prime * result + ((this.spceSvrcJnngDt==null)?0:this.spceSvrcJnngDt.hashCode());
		result= prime * result + ((this.spceCnt==null)?0:this.spceCnt.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final PBPPbokSpceBscMngSelectAllActList_DODT other= (PBPPbokSpceBscMngSelectAllActList_DODT)obj;
		{
			Object _acno= getAcno();
			Object __acno= other.getAcno();
			if ( _acno== null ) { if ( __acno!= null ) return false; }
			else if ( !_acno.equals(__acno) ) return false;
		}
		{
			Object _cusUsgBkwAcno= getCusUsgBkwAcno();
			Object __cusUsgBkwAcno= other.getCusUsgBkwAcno();
			if ( _cusUsgBkwAcno== null ) { if ( __cusUsgBkwAcno!= null ) return false; }
			else if ( !_cusUsgBkwAcno.equals(__cusUsgBkwAcno) ) return false;
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
		{
			Object _spceCnt= getSpceCnt();
			Object __spceCnt= other.getSpceCnt();
			if ( _spceCnt== null ) { if ( __spceCnt!= null ) return false; }
			else if ( !_spceCnt.equals(__spceCnt) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(PBPPbokSpceBscMngSelectAllActList_DODT.class.getName()).append(":\n");
		sb.append("\tacno: ");
		sb.append(acno==null?"null":getAcno());
		sb.append("\n");
		sb.append("\tcusUsgBkwAcno: ");
		sb.append(cusUsgBkwAcno==null?"null":getCusUsgBkwAcno());
		sb.append("\n");
		sb.append("\tprdNm: ");
		sb.append(prdNm==null?"null":getPrdNm());
		sb.append("\n");
		sb.append("\trawActBal: ");
		sb.append(rawActBal==null?"null":getRawActBal());
		sb.append("\n");
		sb.append("\tspceSrvcJnngYn: ");
		sb.append(spceSrvcJnngYn==null?"null":getSpceSrvcJnngYn());
		sb.append("\n");
		sb.append("\tspceSvrcJnngDt: ");
		sb.append(spceSvrcJnngDt==null?"null":getSpceSvrcJnngDt());
		sb.append("\n");
		sb.append("\tspceCnt: ");
		sb.append(spceCnt==null?"null":getSpceCnt());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 20; /* acno */
		messageLen+= 20; /* cusUsgBkwAcno */
		messageLen+= 40; /* prdNm */
		messageLen+= 18; /* rawActBal */
		messageLen+= 1; /* spceSrvcJnngYn */
		messageLen+= 8; /* spceSvrcJnngDt */
		messageLen+= 3; /* spceCnt */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("acno");
		list.add("cusUsgBkwAcno");
		list.add("prdNm");
		list.add("rawActBal");
		list.add("spceSrvcJnngYn");
		list.add("spceSvrcJnngDt");
		list.add("spceCnt");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("acno", get("acno"));
		map.put("cusUsgBkwAcno", get("cusUsgBkwAcno"));
		map.put("prdNm", get("prdNm"));
		map.put("rawActBal", get("rawActBal"));
		map.put("spceSrvcJnngYn", get("spceSrvcJnngYn"));
		map.put("spceSvrcJnngDt", get("spceSvrcJnngDt"));
		map.put("spceCnt", get("spceCnt"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 2988387:/* acno */
			return getAcno();
		case -2031113431:/* cusUsgBkwAcno */
			return getCusUsgBkwAcno();
		case 106929153:/* prdNm */
			return getPrdNm();
		case 1852100707:/* rawActBal */
			return getRawActBal();
		case -1652105411:/* spceSrvcJnngYn */
			return getSpceSrvcJnngYn();
		case 1326703936:/* spceSvrcJnngDt */
			return getSpceSvrcJnngDt();
		case -2010288790:/* spceCnt */
			return getSpceCnt();
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
		case -2031113431:/* cusUsgBkwAcno */
			setCusUsgBkwAcno((String)value);
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
		case -1652105411:/* spceSrvcJnngYn */
			setSpceSrvcJnngYn((String)value);
			break;
		case 1326703936:/* spceSvrcJnngDt */
			setSpceSvrcJnngDt((String)value);
			break;
		case -2010288790:/* spceCnt */
			setSpceCnt((Integer)value);
			break;
		default:
			break;
		}
	}
	
}
