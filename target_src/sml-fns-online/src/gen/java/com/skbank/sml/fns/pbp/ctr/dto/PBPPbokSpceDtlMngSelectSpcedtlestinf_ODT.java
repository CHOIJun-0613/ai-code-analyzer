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
	"atsEstYn", "atsCycd", "atsExeDd", "atsAm", "atpmCnt", "wdrEstInf", "atsWkdDscd", "atsWkdDscdNm", "spceNo", "atsCycdNm", "atsBasDd"
}, name="PBPPbokSpceDtlMngSelectSpcedtlestinf_ODT")
@XmlRootElement(name="PBPPbokSpceDtlMngSelectSpcedtlestinf_ODT")
@BxmCategory(logicalName="공간.상세.설정.정보.컨트롤러.출력.IO", description="") 
public class PBPPbokSpceDtlMngSelectSpcedtlestinf_ODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 1730697635L;
	
	
	
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
	@BxmOmm_Field(length=2, decimal=0, description="자동이체주기코드", align="left", fill="")
	private String atsCycd= "";
	
	
	/**
	 * 자동이체실행일
	 */
	@ApiModelProperty(
		name = "atsExeDd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atsExeDd")
	@BxmOmm_Field(length=2, decimal=0, description="자동이체실행일", align="left", fill="")
	private String atsExeDd= "";
	
	
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
	 * 자동납부건수
	 */
	@ApiModelProperty(
		name = "atpmCnt"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("atpmCnt")
	@BxmOmm_Field(length=2, decimal=0, description="자동납부건수", align="right", fill="")
	private Integer atpmCnt= 0;
	
	
	/**
	 * 출금설정정보
	 */
	@ApiModelProperty(
		name = "wdrEstInf"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("wdrEstInf")
	@BxmOmm_Field(length=1, decimal=0, description="출금설정정보", align="left", fill="")
	private String wdrEstInf= "";
	
	
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
	private boolean isSet_atsExeDd= false;
	protected final boolean isSet_atsExeDd(){
		return this.isSet_atsExeDd;
	}
	private void setIsSet_atsExeDd(boolean value){
		this.isSet_atsExeDd= value;
	}
	/**
	 * 자동이체실행일
	 */
	@XmlTransient
	public String getAtsExeDd(){
		return this.atsExeDd;
	}
	
	/**
	 * 자동이체실행일
	 * 
	 * @param atsExeDd 자동이체실행일
	 */
	public void setAtsExeDd(String atsExeDd){
		this.atsExeDd= atsExeDd;
		this.setIsSet_atsExeDd(true);
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
	private boolean isSet_atpmCnt= false;
	protected final boolean isSet_atpmCnt(){
		return this.isSet_atpmCnt;
	}
	private void setIsSet_atpmCnt(boolean value){
		this.isSet_atpmCnt= value;
	}
	/**
	 * 자동납부건수
	 */
	@XmlTransient
	public Integer getAtpmCnt(){
		return this.atpmCnt;
	}
	
	/**
	 * 자동납부건수
	 * 
	 * @param atpmCnt 자동납부건수
	 */
	public void setAtpmCnt(Integer atpmCnt){
		this.atpmCnt= atpmCnt;
		this.setIsSet_atpmCnt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_wdrEstInf= false;
	protected final boolean isSet_wdrEstInf(){
		return this.isSet_wdrEstInf;
	}
	private void setIsSet_wdrEstInf(boolean value){
		this.isSet_wdrEstInf= value;
	}
	/**
	 * 출금설정정보
	 */
	@XmlTransient
	public String getWdrEstInf(){
		return this.wdrEstInf;
	}
	
	/**
	 * 출금설정정보
	 * 
	 * @param wdrEstInf 출금설정정보
	 */
	public void setWdrEstInf(String wdrEstInf){
		this.wdrEstInf= wdrEstInf;
		this.setIsSet_wdrEstInf(true);
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
				
	@Override
	public PBPPbokSpceDtlMngSelectSpcedtlestinf_ODT clone(){
		try{
			PBPPbokSpceDtlMngSelectSpcedtlestinf_ODT object= (PBPPbokSpceDtlMngSelectSpcedtlestinf_ODT)super.clone();
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
		
		result= prime * result + ((this.atsEstYn==null)?0:this.atsEstYn.hashCode());
		result= prime * result + ((this.atsCycd==null)?0:this.atsCycd.hashCode());
		result= prime * result + ((this.atsExeDd==null)?0:this.atsExeDd.hashCode());
		result= prime * result + ((this.atsAm==null)?0:this.atsAm.hashCode());
		result= prime * result + ((this.atpmCnt==null)?0:this.atpmCnt.hashCode());
		result= prime * result + ((this.wdrEstInf==null)?0:this.wdrEstInf.hashCode());
		result= prime * result + ((this.atsWkdDscd==null)?0:this.atsWkdDscd.hashCode());
		result= prime * result + ((this.atsWkdDscdNm==null)?0:this.atsWkdDscdNm.hashCode());
		result= prime * result + ((this.spceNo==null)?0:this.spceNo.hashCode());
		result= prime * result + ((this.atsCycdNm==null)?0:this.atsCycdNm.hashCode());
		result= prime * result + ((this.atsBasDd==null)?0:this.atsBasDd.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final PBPPbokSpceDtlMngSelectSpcedtlestinf_ODT other= (PBPPbokSpceDtlMngSelectSpcedtlestinf_ODT)obj;
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
			Object _atsExeDd= getAtsExeDd();
			Object __atsExeDd= other.getAtsExeDd();
			if ( _atsExeDd== null ) { if ( __atsExeDd!= null ) return false; }
			else if ( !_atsExeDd.equals(__atsExeDd) ) return false;
		}
		{
			Object _atsAm= getAtsAm();
			Object __atsAm= other.getAtsAm();
			if ( _atsAm== null ) { if ( __atsAm!= null ) return false; }
			else if ( !_atsAm.equals(__atsAm) ) return false;
		}
		{
			Object _atpmCnt= getAtpmCnt();
			Object __atpmCnt= other.getAtpmCnt();
			if ( _atpmCnt== null ) { if ( __atpmCnt!= null ) return false; }
			else if ( !_atpmCnt.equals(__atpmCnt) ) return false;
		}
		{
			Object _wdrEstInf= getWdrEstInf();
			Object __wdrEstInf= other.getWdrEstInf();
			if ( _wdrEstInf== null ) { if ( __wdrEstInf!= null ) return false; }
			else if ( !_wdrEstInf.equals(__wdrEstInf) ) return false;
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
		{
			Object _spceNo= getSpceNo();
			Object __spceNo= other.getSpceNo();
			if ( _spceNo== null ) { if ( __spceNo!= null ) return false; }
			else if ( !_spceNo.equals(__spceNo) ) return false;
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
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(PBPPbokSpceDtlMngSelectSpcedtlestinf_ODT.class.getName()).append(":\n");
		sb.append("\tatsEstYn: ");
		sb.append(atsEstYn==null?"null":getAtsEstYn());
		sb.append("\n");
		sb.append("\tatsCycd: ");
		sb.append(atsCycd==null?"null":getAtsCycd());
		sb.append("\n");
		sb.append("\tatsExeDd: ");
		sb.append(atsExeDd==null?"null":getAtsExeDd());
		sb.append("\n");
		sb.append("\tatsAm: ");
		sb.append(atsAm==null?"null":getAtsAm());
		sb.append("\n");
		sb.append("\tatpmCnt: ");
		sb.append(atpmCnt==null?"null":getAtpmCnt());
		sb.append("\n");
		sb.append("\twdrEstInf: ");
		sb.append(wdrEstInf==null?"null":getWdrEstInf());
		sb.append("\n");
		sb.append("\tatsWkdDscd: ");
		sb.append(atsWkdDscd==null?"null":getAtsWkdDscd());
		sb.append("\n");
		sb.append("\tatsWkdDscdNm: ");
		sb.append(atsWkdDscdNm==null?"null":getAtsWkdDscdNm());
		sb.append("\n");
		sb.append("\tspceNo: ");
		sb.append(spceNo==null?"null":getSpceNo());
		sb.append("\n");
		sb.append("\tatsCycdNm: ");
		sb.append(atsCycdNm==null?"null":getAtsCycdNm());
		sb.append("\n");
		sb.append("\tatsBasDd: ");
		sb.append(atsBasDd==null?"null":getAtsBasDd());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 1; /* atsEstYn */
		messageLen+= 2; /* atsCycd */
		messageLen+= 2; /* atsExeDd */
		messageLen+= 18; /* atsAm */
		messageLen+= 2; /* atpmCnt */
		messageLen+= 1; /* wdrEstInf */
		messageLen+= 1; /* atsWkdDscd */
		messageLen+= 40; /* atsWkdDscdNm */
		messageLen+= 6; /* spceNo */
		messageLen+= 40; /* atsCycdNm */
		messageLen+= 2; /* atsBasDd */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("atsEstYn");
		list.add("atsCycd");
		list.add("atsExeDd");
		list.add("atsAm");
		list.add("atpmCnt");
		list.add("wdrEstInf");
		list.add("atsWkdDscd");
		list.add("atsWkdDscdNm");
		list.add("spceNo");
		list.add("atsCycdNm");
		list.add("atsBasDd");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("atsEstYn", get("atsEstYn"));
		map.put("atsCycd", get("atsCycd"));
		map.put("atsExeDd", get("atsExeDd"));
		map.put("atsAm", get("atsAm"));
		map.put("atpmCnt", get("atpmCnt"));
		map.put("wdrEstInf", get("wdrEstInf"));
		map.put("atsWkdDscd", get("atsWkdDscd"));
		map.put("atsWkdDscdNm", get("atsWkdDscdNm"));
		map.put("spceNo", get("spceNo"));
		map.put("atsCycdNm", get("atsCycdNm"));
		map.put("atsBasDd", get("atsBasDd"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 484738171:/* atsEstYn */
			return getAtsEstYn();
		case -677154281:/* atsCycd */
			return getAtsCycd();
		case 484872050:/* atsExeDd */
			return getAtsExeDd();
		case 93149932:/* atsAm */
			return getAtsAm();
		case -678725159:/* atpmCnt */
			return getAtpmCnt();
		case -1969991648:/* wdrEstInf */
			return getWdrEstInf();
		case 527684256:/* atsWkdDscd */
			return getAtsWkdDscd();
		case 298431615:/* atsWkdDscdNm */
			return getAtsWkdDscdNm();
		case -896131680:/* spceNo */
			return getSpceNo();
		case 2089767478:/* atsCycdNm */
			return getAtsCycdNm();
		case 481429748:/* atsBasDd */
			return getAtsBasDd();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 484738171:/* atsEstYn */
			setAtsEstYn((String)value);
			break;
		case -677154281:/* atsCycd */
			setAtsCycd((String)value);
			break;
		case 484872050:/* atsExeDd */
			setAtsExeDd((String)value);
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
		case -678725159:/* atpmCnt */
			setAtpmCnt((Integer)value);
			break;
		case -1969991648:/* wdrEstInf */
			setWdrEstInf((String)value);
			break;
		case 527684256:/* atsWkdDscd */
			setAtsWkdDscd((String)value);
			break;
		case 298431615:/* atsWkdDscdNm */
			setAtsWkdDscdNm((String)value);
			break;
		case -896131680:/* spceNo */
			setSpceNo((String)value);
			break;
		case 2089767478:/* atsCycdNm */
			setAtsCycdNm((String)value);
			break;
		case 481429748:/* atsBasDd */
			setAtsBasDd((String)value);
			break;
		default:
			break;
		}
	}
	
}
