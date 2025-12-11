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
	"rprsAcno", "spceSrno", "atsEstYn", "atsCycd", "atsDd", "atsAm", "atsMngNo"
}, name="PBPPbokSpceDtlEstDeleteSpceAtsEst_DIDT")
@XmlRootElement(name="PBPPbokSpceDtlEstDeleteSpceAtsEst_DIDT")
@BxmCategory(logicalName="공간.상세.자동이체.설정.수정.DBM.입력.IO", description="") 
public class PBPPbokSpceDtlEstDeleteSpceAtsEst_DIDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 778213054L;
	
	
	
	/**
	 * 대표계좌번호
	 */
	@ApiModelProperty(
		name = "rprsAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rprsAcno")
	@BxmOmm_Field(length=13, decimal=0, description="대표계좌번호", align="left", fill="")
	private String rprsAcno= "";
	
	
	/**
	 * 공간일련번호
	 */
	@ApiModelProperty(
		name = "spceSrno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("spceSrno")
	@BxmOmm_Field(length=10, decimal=0, description="공간일련번호", align="left", fill="")
	private String spceSrno= "";
	
	
	/**
	 * 자동이체설정여부
	 */
	@ApiModelProperty(
		name = "atsEstYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atsEstYn")
	@BxmOmm_Field(length=1, decimal=0, description="자동이체설정여부", align="left", fill="")
	private String atsEstYn= "";
	
	
	/**
	 * 자동이체주기코드
	 */
	@ApiModelProperty(
		name = "atsCycd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atsCycd")
	@BxmOmm_Field(length=1, decimal=0, description="자동이체주기코드", align="left", fill="")
	private String atsCycd= "";
	
	
	/**
	 * 자동이체일
	 */
	@ApiModelProperty(
		name = "atsDd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atsDd")
	@BxmOmm_Field(length=8, decimal=0, description="자동이체일", align="left", fill="")
	private String atsDd= "";
	
	
	/**
	 * 자동이체금액
	 */
	@ApiModelProperty(
		name = "atsAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("atsAm")
	@BxmOmm_Field(length=18, decimal=3, description="자동이체금액", align="right", fill="")
	private BigDecimal atsAm= new BigDecimal("0");
	
	
	/**
	 * 자동이체관리번호
	 */
	@ApiModelProperty(
		name = "atsMngNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atsMngNo")
	@BxmOmm_Field(length=13, decimal=0, description="자동이체관리번호", align="left", fill="")
	private String atsMngNo= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rprsAcno= false;
	protected final boolean isSet_rprsAcno(){
		return this.isSet_rprsAcno;
	}
	private void setIsSet_rprsAcno(boolean value){
		this.isSet_rprsAcno= value;
	}
	/**
	 * 대표계좌번호
	 */
	@XmlTransient
	public String getRprsAcno(){
		return this.rprsAcno;
	}
	
	/**
	 * 대표계좌번호
	 * 
	 * @param rprsAcno 대표계좌번호
	 */
	public void setRprsAcno(String rprsAcno){
		this.rprsAcno= rprsAcno;
		this.setIsSet_rprsAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_spceSrno= false;
	protected final boolean isSet_spceSrno(){
		return this.isSet_spceSrno;
	}
	private void setIsSet_spceSrno(boolean value){
		this.isSet_spceSrno= value;
	}
	/**
	 * 공간일련번호
	 */
	@XmlTransient
	public String getSpceSrno(){
		return this.spceSrno;
	}
	
	/**
	 * 공간일련번호
	 * 
	 * @param spceSrno 공간일련번호
	 */
	public void setSpceSrno(String spceSrno){
		this.spceSrno= spceSrno;
		this.setIsSet_spceSrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atsEstYn= false;
	protected final boolean isSet_atsEstYn(){
		return this.isSet_atsEstYn;
	}
	private void setIsSet_atsEstYn(boolean value){
		this.isSet_atsEstYn= value;
	}
	/**
	 * 자동이체설정여부
	 */
	@XmlTransient
	public String getAtsEstYn(){
		return this.atsEstYn;
	}
	
	/**
	 * 자동이체설정여부
	 * 
	 * @param atsEstYn 자동이체설정여부
	 */
	public void setAtsEstYn(String atsEstYn){
		this.atsEstYn= atsEstYn;
		this.setIsSet_atsEstYn(true);
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
	private boolean isSet_atsDd= false;
	protected final boolean isSet_atsDd(){
		return this.isSet_atsDd;
	}
	private void setIsSet_atsDd(boolean value){
		this.isSet_atsDd= value;
	}
	/**
	 * 자동이체일
	 */
	@XmlTransient
	public String getAtsDd(){
		return this.atsDd;
	}
	
	/**
	 * 자동이체일
	 * 
	 * @param atsDd 자동이체일
	 */
	public void setAtsDd(String atsDd){
		this.atsDd= atsDd;
		this.setIsSet_atsDd(true);
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
	private boolean isSet_atsMngNo= false;
	protected final boolean isSet_atsMngNo(){
		return this.isSet_atsMngNo;
	}
	private void setIsSet_atsMngNo(boolean value){
		this.isSet_atsMngNo= value;
	}
	/**
	 * 자동이체관리번호
	 */
	@XmlTransient
	public String getAtsMngNo(){
		return this.atsMngNo;
	}
	
	/**
	 * 자동이체관리번호
	 * 
	 * @param atsMngNo 자동이체관리번호
	 */
	public void setAtsMngNo(String atsMngNo){
		this.atsMngNo= atsMngNo;
		this.setIsSet_atsMngNo(true);
	}
				
	@Override
	public PBPPbokSpceDtlEstDeleteSpceAtsEst_DIDT clone(){
		try{
			PBPPbokSpceDtlEstDeleteSpceAtsEst_DIDT object= (PBPPbokSpceDtlEstDeleteSpceAtsEst_DIDT)super.clone();
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
		
		result= prime * result + ((this.rprsAcno==null)?0:this.rprsAcno.hashCode());
		result= prime * result + ((this.spceSrno==null)?0:this.spceSrno.hashCode());
		result= prime * result + ((this.atsEstYn==null)?0:this.atsEstYn.hashCode());
		result= prime * result + ((this.atsCycd==null)?0:this.atsCycd.hashCode());
		result= prime * result + ((this.atsDd==null)?0:this.atsDd.hashCode());
		result= prime * result + ((this.atsAm==null)?0:this.atsAm.hashCode());
		result= prime * result + ((this.atsMngNo==null)?0:this.atsMngNo.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final PBPPbokSpceDtlEstDeleteSpceAtsEst_DIDT other= (PBPPbokSpceDtlEstDeleteSpceAtsEst_DIDT)obj;
		{
			Object _rprsAcno= getRprsAcno();
			Object __rprsAcno= other.getRprsAcno();
			if ( _rprsAcno== null ) { if ( __rprsAcno!= null ) return false; }
			else if ( !_rprsAcno.equals(__rprsAcno) ) return false;
		}
		{
			Object _spceSrno= getSpceSrno();
			Object __spceSrno= other.getSpceSrno();
			if ( _spceSrno== null ) { if ( __spceSrno!= null ) return false; }
			else if ( !_spceSrno.equals(__spceSrno) ) return false;
		}
		{
			Object _atsEstYn= getAtsEstYn();
			Object __atsEstYn= other.getAtsEstYn();
			if ( _atsEstYn== null ) { if ( __atsEstYn!= null ) return false; }
			else if ( !_atsEstYn.equals(__atsEstYn) ) return false;
		}
		{
			Object _atsCycd= getAtsCycd();
			Object __atsCycd= other.getAtsCycd();
			if ( _atsCycd== null ) { if ( __atsCycd!= null ) return false; }
			else if ( !_atsCycd.equals(__atsCycd) ) return false;
		}
		{
			Object _atsDd= getAtsDd();
			Object __atsDd= other.getAtsDd();
			if ( _atsDd== null ) { if ( __atsDd!= null ) return false; }
			else if ( !_atsDd.equals(__atsDd) ) return false;
		}
		{
			Object _atsAm= getAtsAm();
			Object __atsAm= other.getAtsAm();
			if ( _atsAm== null ) { if ( __atsAm!= null ) return false; }
			else if ( !_atsAm.equals(__atsAm) ) return false;
		}
		{
			Object _atsMngNo= getAtsMngNo();
			Object __atsMngNo= other.getAtsMngNo();
			if ( _atsMngNo== null ) { if ( __atsMngNo!= null ) return false; }
			else if ( !_atsMngNo.equals(__atsMngNo) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(PBPPbokSpceDtlEstDeleteSpceAtsEst_DIDT.class.getName()).append(":\n");
		sb.append("\trprsAcno: ");
		sb.append(rprsAcno==null?"null":getRprsAcno());
		sb.append("\n");
		sb.append("\tspceSrno: ");
		sb.append(spceSrno==null?"null":getSpceSrno());
		sb.append("\n");
		sb.append("\tatsEstYn: ");
		sb.append(atsEstYn==null?"null":getAtsEstYn());
		sb.append("\n");
		sb.append("\tatsCycd: ");
		sb.append(atsCycd==null?"null":getAtsCycd());
		sb.append("\n");
		sb.append("\tatsDd: ");
		sb.append(atsDd==null?"null":getAtsDd());
		sb.append("\n");
		sb.append("\tatsAm: ");
		sb.append(atsAm==null?"null":getAtsAm());
		sb.append("\n");
		sb.append("\tatsMngNo: ");
		sb.append(atsMngNo==null?"null":getAtsMngNo());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 13; /* rprsAcno */
		messageLen+= 10; /* spceSrno */
		messageLen+= 1; /* atsEstYn */
		messageLen+= 1; /* atsCycd */
		messageLen+= 8; /* atsDd */
		messageLen+= 18; /* atsAm */
		messageLen+= 13; /* atsMngNo */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("rprsAcno");
		list.add("spceSrno");
		list.add("atsEstYn");
		list.add("atsCycd");
		list.add("atsDd");
		list.add("atsAm");
		list.add("atsMngNo");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("rprsAcno", get("rprsAcno"));
		map.put("spceSrno", get("spceSrno"));
		map.put("atsEstYn", get("atsEstYn"));
		map.put("atsCycd", get("atsCycd"));
		map.put("atsDd", get("atsDd"));
		map.put("atsAm", get("atsAm"));
		map.put("atsMngNo", get("atsMngNo"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 805042946:/* rprsAcno */
			return getRprsAcno();
		case 2106037375:/* spceSrno */
			return getSpceSrno();
		case 484738171:/* atsEstYn */
			return getAtsEstYn();
		case -677154281:/* atsCycd */
			return getAtsCycd();
		case 93150016:/* atsDd */
			return getAtsDd();
		case 93149932:/* atsAm */
			return getAtsAm();
		case 491964551:/* atsMngNo */
			return getAtsMngNo();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 805042946:/* rprsAcno */
			setRprsAcno((String)value);
			break;
		case 2106037375:/* spceSrno */
			setSpceSrno((String)value);
			break;
		case 484738171:/* atsEstYn */
			setAtsEstYn((String)value);
			break;
		case -677154281:/* atsCycd */
			setAtsCycd((String)value);
			break;
		case 93150016:/* atsDd */
			setAtsDd((String)value);
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
		case 491964551:/* atsMngNo */
			setAtsMngNo((String)value);
			break;
		default:
			break;
		}
	}
	
}
