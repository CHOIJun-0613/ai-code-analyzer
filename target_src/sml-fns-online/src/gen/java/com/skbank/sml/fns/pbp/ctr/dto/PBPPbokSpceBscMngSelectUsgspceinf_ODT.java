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
	"spceIconNo", "spceSrno", "spceNm", "spceBal", "savGoalAm", "savGoalStaDt", "savGoalEndDt", "cnsmGoalAm", "cnsmAmBscd", "cnsmAmBscdNm"
}, name="PBPPbokSpceBscMngSelectUsgspceinf_ODT")
@XmlRootElement(name="PBPPbokSpceBscMngSelectUsgspceinf_ODT")
@BxmCategory(logicalName="사용.공간.정보.목록.컨트롤러.출력.IO", description="") 
public class PBPPbokSpceBscMngSelectUsgspceinf_ODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -861312872L;
	
	
	
	/**
	 * 공간아이콘번호
	 */
	@ApiModelProperty(
		name = "spceIconNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("spceIconNo")
	@BxmOmm_Field(length=3, decimal=0, description="공간아이콘번호", align="left", fill="")
	private String spceIconNo= "";
	
	
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
	 * 공간명
	 */
	@ApiModelProperty(
		name = "spceNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("spceNm")
	@BxmOmm_Field(length=50, decimal=0, description="공간명", align="left", fill="")
	private String spceNm= "";
	
	
	/**
	 * 공간잔액
	 */
	@ApiModelProperty(
		name = "spceBal"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("spceBal")
	@BxmOmm_Field(length=18, decimal=3, description="공간잔액", align="right", fill="")
	private BigDecimal spceBal= new BigDecimal("0");
	
	
	/**
	 * 저축목표금액
	 */
	@ApiModelProperty(
		name = "savGoalAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("savGoalAm")
	@BxmOmm_Field(length=18, decimal=3, description="저축목표금액", align="right", fill="")
	private BigDecimal savGoalAm= new BigDecimal("0");
	
	
	/**
	 * 저축목표시작일자
	 */
	@ApiModelProperty(
		name = "savGoalStaDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("savGoalStaDt")
	@BxmOmm_Field(length=8, decimal=0, description="저축목표시작일자", align="left", fill="")
	private String savGoalStaDt= "";
	
	
	/**
	 * 저축목표종료일자
	 */
	@ApiModelProperty(
		name = "savGoalEndDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("savGoalEndDt")
	@BxmOmm_Field(length=8, decimal=0, description="저축목표종료일자", align="left", fill="")
	private String savGoalEndDt= "";
	
	
	/**
	 * 소비목표금액
	 */
	@ApiModelProperty(
		name = "cnsmGoalAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("cnsmGoalAm")
	@BxmOmm_Field(length=18, decimal=3, description="소비목표금액", align="right", fill="")
	private BigDecimal cnsmGoalAm= new BigDecimal("0");
	
	
	/**
	 * 소비금액기준코드
	 */
	@ApiModelProperty(
		name = "cnsmAmBscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("cnsmAmBscd")
	@BxmOmm_Field(length=1, decimal=0, description="소비금액기준코드", align="left", fill="")
	private String cnsmAmBscd= "";
	
	
	/**
	 * 소비금액기준코드명
	 */
	@ApiModelProperty(
		name = "cnsmAmBscdNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("cnsmAmBscdNm")
	@BxmOmm_Field(length=40, decimal=0, description="소비금액기준코드명", align="left", fill="")
	private String cnsmAmBscdNm= "";
	
	
	
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
	public String getSpceIconNo(){
		return this.spceIconNo;
	}
	
	/**
	 * 공간아이콘번호
	 * 
	 * @param spceIconNo 공간아이콘번호
	 */
	public void setSpceIconNo(String spceIconNo){
		this.spceIconNo= spceIconNo;
		this.setIsSet_spceIconNo(true);
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
	private boolean isSet_spceNm= false;
	protected final boolean isSet_spceNm(){
		return this.isSet_spceNm;
	}
	private void setIsSet_spceNm(boolean value){
		this.isSet_spceNm= value;
	}
	/**
	 * 공간명
	 */
	@XmlTransient
	public String getSpceNm(){
		return this.spceNm;
	}
	
	/**
	 * 공간명
	 * 
	 * @param spceNm 공간명
	 */
	public void setSpceNm(String spceNm){
		this.spceNm= spceNm;
		this.setIsSet_spceNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_spceBal= false;
	protected final boolean isSet_spceBal(){
		return this.isSet_spceBal;
	}
	private void setIsSet_spceBal(boolean value){
		this.isSet_spceBal= value;
	}
	/**
	 * 공간잔액
	 * BigDecimal - Double value setter
	 *
	 * @Param spceBal 공간잔액
	 */
	public void setSpceBal(double spceBal) {
		setSpceBal(BigDecimal.valueOf(spceBal));
	}
	/**
	 * 공간잔액
	 * BigDecimal - Long value setter
	 *
	 * @Param spceBal 공간잔액
	 */
	public void setSpceBal(long spceBal) {
		setSpceBal(BigDecimal.valueOf(spceBal));
	}
	/**
	 * 공간잔액
	 * BigDecimal - String value setter
	 *
	 * @Param spceBal 공간잔액
	 */
	public void setSpceBal(String spceBal) {
		setSpceBal(new BigDecimal(spceBal));
	}
	/**
	 * 공간잔액
	 */
	@XmlTransient
	public BigDecimal getSpceBal(){
		return this.spceBal;
	}
	
	/**
	 * 공간잔액
	 * 
	 * @param spceBal 공간잔액
	 */
	@JsonSetter("spceBal")
	public void setSpceBal(BigDecimal spceBal){
		this.spceBal= spceBal;
		this.setIsSet_spceBal(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_savGoalAm= false;
	protected final boolean isSet_savGoalAm(){
		return this.isSet_savGoalAm;
	}
	private void setIsSet_savGoalAm(boolean value){
		this.isSet_savGoalAm= value;
	}
	/**
	 * 저축목표금액
	 * BigDecimal - Double value setter
	 *
	 * @Param savGoalAm 저축목표금액
	 */
	public void setSavGoalAm(double savGoalAm) {
		setSavGoalAm(BigDecimal.valueOf(savGoalAm));
	}
	/**
	 * 저축목표금액
	 * BigDecimal - Long value setter
	 *
	 * @Param savGoalAm 저축목표금액
	 */
	public void setSavGoalAm(long savGoalAm) {
		setSavGoalAm(BigDecimal.valueOf(savGoalAm));
	}
	/**
	 * 저축목표금액
	 * BigDecimal - String value setter
	 *
	 * @Param savGoalAm 저축목표금액
	 */
	public void setSavGoalAm(String savGoalAm) {
		setSavGoalAm(new BigDecimal(savGoalAm));
	}
	/**
	 * 저축목표금액
	 */
	@XmlTransient
	public BigDecimal getSavGoalAm(){
		return this.savGoalAm;
	}
	
	/**
	 * 저축목표금액
	 * 
	 * @param savGoalAm 저축목표금액
	 */
	@JsonSetter("savGoalAm")
	public void setSavGoalAm(BigDecimal savGoalAm){
		this.savGoalAm= savGoalAm;
		this.setIsSet_savGoalAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_savGoalStaDt= false;
	protected final boolean isSet_savGoalStaDt(){
		return this.isSet_savGoalStaDt;
	}
	private void setIsSet_savGoalStaDt(boolean value){
		this.isSet_savGoalStaDt= value;
	}
	/**
	 * 저축목표시작일자
	 */
	@XmlTransient
	public String getSavGoalStaDt(){
		return this.savGoalStaDt;
	}
	
	/**
	 * 저축목표시작일자
	 * 
	 * @param savGoalStaDt 저축목표시작일자
	 */
	public void setSavGoalStaDt(String savGoalStaDt){
		this.savGoalStaDt= savGoalStaDt;
		this.setIsSet_savGoalStaDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_savGoalEndDt= false;
	protected final boolean isSet_savGoalEndDt(){
		return this.isSet_savGoalEndDt;
	}
	private void setIsSet_savGoalEndDt(boolean value){
		this.isSet_savGoalEndDt= value;
	}
	/**
	 * 저축목표종료일자
	 */
	@XmlTransient
	public String getSavGoalEndDt(){
		return this.savGoalEndDt;
	}
	
	/**
	 * 저축목표종료일자
	 * 
	 * @param savGoalEndDt 저축목표종료일자
	 */
	public void setSavGoalEndDt(String savGoalEndDt){
		this.savGoalEndDt= savGoalEndDt;
		this.setIsSet_savGoalEndDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cnsmGoalAm= false;
	protected final boolean isSet_cnsmGoalAm(){
		return this.isSet_cnsmGoalAm;
	}
	private void setIsSet_cnsmGoalAm(boolean value){
		this.isSet_cnsmGoalAm= value;
	}
	/**
	 * 소비목표금액
	 * BigDecimal - Double value setter
	 *
	 * @Param cnsmGoalAm 소비목표금액
	 */
	public void setCnsmGoalAm(double cnsmGoalAm) {
		setCnsmGoalAm(BigDecimal.valueOf(cnsmGoalAm));
	}
	/**
	 * 소비목표금액
	 * BigDecimal - Long value setter
	 *
	 * @Param cnsmGoalAm 소비목표금액
	 */
	public void setCnsmGoalAm(long cnsmGoalAm) {
		setCnsmGoalAm(BigDecimal.valueOf(cnsmGoalAm));
	}
	/**
	 * 소비목표금액
	 * BigDecimal - String value setter
	 *
	 * @Param cnsmGoalAm 소비목표금액
	 */
	public void setCnsmGoalAm(String cnsmGoalAm) {
		setCnsmGoalAm(new BigDecimal(cnsmGoalAm));
	}
	/**
	 * 소비목표금액
	 */
	@XmlTransient
	public BigDecimal getCnsmGoalAm(){
		return this.cnsmGoalAm;
	}
	
	/**
	 * 소비목표금액
	 * 
	 * @param cnsmGoalAm 소비목표금액
	 */
	@JsonSetter("cnsmGoalAm")
	public void setCnsmGoalAm(BigDecimal cnsmGoalAm){
		this.cnsmGoalAm= cnsmGoalAm;
		this.setIsSet_cnsmGoalAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cnsmAmBscd= false;
	protected final boolean isSet_cnsmAmBscd(){
		return this.isSet_cnsmAmBscd;
	}
	private void setIsSet_cnsmAmBscd(boolean value){
		this.isSet_cnsmAmBscd= value;
	}
	/**
	 * 소비금액기준코드
	 */
	@XmlTransient
	public String getCnsmAmBscd(){
		return this.cnsmAmBscd;
	}
	
	/**
	 * 소비금액기준코드
	 * 
	 * @param cnsmAmBscd 소비금액기준코드
	 */
	public void setCnsmAmBscd(String cnsmAmBscd){
		this.cnsmAmBscd= cnsmAmBscd;
		this.setIsSet_cnsmAmBscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cnsmAmBscdNm= false;
	protected final boolean isSet_cnsmAmBscdNm(){
		return this.isSet_cnsmAmBscdNm;
	}
	private void setIsSet_cnsmAmBscdNm(boolean value){
		this.isSet_cnsmAmBscdNm= value;
	}
	/**
	 * 소비금액기준코드명
	 */
	@XmlTransient
	public String getCnsmAmBscdNm(){
		return this.cnsmAmBscdNm;
	}
	
	/**
	 * 소비금액기준코드명
	 * 
	 * @param cnsmAmBscdNm 소비금액기준코드명
	 */
	public void setCnsmAmBscdNm(String cnsmAmBscdNm){
		this.cnsmAmBscdNm= cnsmAmBscdNm;
		this.setIsSet_cnsmAmBscdNm(true);
	}
				
	@Override
	public PBPPbokSpceBscMngSelectUsgspceinf_ODT clone(){
		try{
			PBPPbokSpceBscMngSelectUsgspceinf_ODT object= (PBPPbokSpceBscMngSelectUsgspceinf_ODT)super.clone();
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
		result= prime * result + ((this.spceSrno==null)?0:this.spceSrno.hashCode());
		result= prime * result + ((this.spceNm==null)?0:this.spceNm.hashCode());
		result= prime * result + ((this.spceBal==null)?0:this.spceBal.hashCode());
		result= prime * result + ((this.savGoalAm==null)?0:this.savGoalAm.hashCode());
		result= prime * result + ((this.savGoalStaDt==null)?0:this.savGoalStaDt.hashCode());
		result= prime * result + ((this.savGoalEndDt==null)?0:this.savGoalEndDt.hashCode());
		result= prime * result + ((this.cnsmGoalAm==null)?0:this.cnsmGoalAm.hashCode());
		result= prime * result + ((this.cnsmAmBscd==null)?0:this.cnsmAmBscd.hashCode());
		result= prime * result + ((this.cnsmAmBscdNm==null)?0:this.cnsmAmBscdNm.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final PBPPbokSpceBscMngSelectUsgspceinf_ODT other= (PBPPbokSpceBscMngSelectUsgspceinf_ODT)obj;
		{
			Object _spceIconNo= getSpceIconNo();
			Object __spceIconNo= other.getSpceIconNo();
			if ( _spceIconNo== null ) { if ( __spceIconNo!= null ) return false; }
			else if ( !_spceIconNo.equals(__spceIconNo) ) return false;
		}
		{
			Object _spceSrno= getSpceSrno();
			Object __spceSrno= other.getSpceSrno();
			if ( _spceSrno== null ) { if ( __spceSrno!= null ) return false; }
			else if ( !_spceSrno.equals(__spceSrno) ) return false;
		}
		{
			Object _spceNm= getSpceNm();
			Object __spceNm= other.getSpceNm();
			if ( _spceNm== null ) { if ( __spceNm!= null ) return false; }
			else if ( !_spceNm.equals(__spceNm) ) return false;
		}
		{
			Object _spceBal= getSpceBal();
			Object __spceBal= other.getSpceBal();
			if ( _spceBal== null ) { if ( __spceBal!= null ) return false; }
			else if ( !_spceBal.equals(__spceBal) ) return false;
		}
		{
			Object _savGoalAm= getSavGoalAm();
			Object __savGoalAm= other.getSavGoalAm();
			if ( _savGoalAm== null ) { if ( __savGoalAm!= null ) return false; }
			else if ( !_savGoalAm.equals(__savGoalAm) ) return false;
		}
		{
			Object _savGoalStaDt= getSavGoalStaDt();
			Object __savGoalStaDt= other.getSavGoalStaDt();
			if ( _savGoalStaDt== null ) { if ( __savGoalStaDt!= null ) return false; }
			else if ( !_savGoalStaDt.equals(__savGoalStaDt) ) return false;
		}
		{
			Object _savGoalEndDt= getSavGoalEndDt();
			Object __savGoalEndDt= other.getSavGoalEndDt();
			if ( _savGoalEndDt== null ) { if ( __savGoalEndDt!= null ) return false; }
			else if ( !_savGoalEndDt.equals(__savGoalEndDt) ) return false;
		}
		{
			Object _cnsmGoalAm= getCnsmGoalAm();
			Object __cnsmGoalAm= other.getCnsmGoalAm();
			if ( _cnsmGoalAm== null ) { if ( __cnsmGoalAm!= null ) return false; }
			else if ( !_cnsmGoalAm.equals(__cnsmGoalAm) ) return false;
		}
		{
			Object _cnsmAmBscd= getCnsmAmBscd();
			Object __cnsmAmBscd= other.getCnsmAmBscd();
			if ( _cnsmAmBscd== null ) { if ( __cnsmAmBscd!= null ) return false; }
			else if ( !_cnsmAmBscd.equals(__cnsmAmBscd) ) return false;
		}
		{
			Object _cnsmAmBscdNm= getCnsmAmBscdNm();
			Object __cnsmAmBscdNm= other.getCnsmAmBscdNm();
			if ( _cnsmAmBscdNm== null ) { if ( __cnsmAmBscdNm!= null ) return false; }
			else if ( !_cnsmAmBscdNm.equals(__cnsmAmBscdNm) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(PBPPbokSpceBscMngSelectUsgspceinf_ODT.class.getName()).append(":\n");
		sb.append("\tspceIconNo: ");
		sb.append(spceIconNo==null?"null":getSpceIconNo());
		sb.append("\n");
		sb.append("\tspceSrno: ");
		sb.append(spceSrno==null?"null":getSpceSrno());
		sb.append("\n");
		sb.append("\tspceNm: ");
		sb.append(spceNm==null?"null":getSpceNm());
		sb.append("\n");
		sb.append("\tspceBal: ");
		sb.append(spceBal==null?"null":getSpceBal());
		sb.append("\n");
		sb.append("\tsavGoalAm: ");
		sb.append(savGoalAm==null?"null":getSavGoalAm());
		sb.append("\n");
		sb.append("\tsavGoalStaDt: ");
		sb.append(savGoalStaDt==null?"null":getSavGoalStaDt());
		sb.append("\n");
		sb.append("\tsavGoalEndDt: ");
		sb.append(savGoalEndDt==null?"null":getSavGoalEndDt());
		sb.append("\n");
		sb.append("\tcnsmGoalAm: ");
		sb.append(cnsmGoalAm==null?"null":getCnsmGoalAm());
		sb.append("\n");
		sb.append("\tcnsmAmBscd: ");
		sb.append(cnsmAmBscd==null?"null":getCnsmAmBscd());
		sb.append("\n");
		sb.append("\tcnsmAmBscdNm: ");
		sb.append(cnsmAmBscdNm==null?"null":getCnsmAmBscdNm());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 3; /* spceIconNo */
		messageLen+= 10; /* spceSrno */
		messageLen+= 50; /* spceNm */
		messageLen+= 18; /* spceBal */
		messageLen+= 18; /* savGoalAm */
		messageLen+= 8; /* savGoalStaDt */
		messageLen+= 8; /* savGoalEndDt */
		messageLen+= 18; /* cnsmGoalAm */
		messageLen+= 1; /* cnsmAmBscd */
		messageLen+= 40; /* cnsmAmBscdNm */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("spceIconNo");
		list.add("spceSrno");
		list.add("spceNm");
		list.add("spceBal");
		list.add("savGoalAm");
		list.add("savGoalStaDt");
		list.add("savGoalEndDt");
		list.add("cnsmGoalAm");
		list.add("cnsmAmBscd");
		list.add("cnsmAmBscdNm");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("spceIconNo", get("spceIconNo"));
		map.put("spceSrno", get("spceSrno"));
		map.put("spceNm", get("spceNm"));
		map.put("spceBal", get("spceBal"));
		map.put("savGoalAm", get("savGoalAm"));
		map.put("savGoalStaDt", get("savGoalStaDt"));
		map.put("savGoalEndDt", get("savGoalEndDt"));
		map.put("cnsmGoalAm", get("cnsmGoalAm"));
		map.put("cnsmAmBscd", get("cnsmAmBscd"));
		map.put("cnsmAmBscdNm", get("cnsmAmBscdNm"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 672207993:/* spceIconNo */
			return getSpceIconNo();
		case 2106037375:/* spceSrno */
			return getSpceSrno();
		case -896131682:/* spceNm */
			return getSpceNm();
		case -2010290162:/* spceBal */
			return getSpceBal();
		case -660526937:/* savGoalAm */
			return getSavGoalAm();
		case 1799097461:/* savGoalStaDt */
			return getSavGoalStaDt();
		case 1785992304:/* savGoalEndDt */
			return getSavGoalEndDt();
		case -579940604:/* cnsmGoalAm */
			return getCnsmGoalAm();
		case -754478301:/* cnsmAmBscd */
			return getCnsmAmBscd();
		case 795828290:/* cnsmAmBscdNm */
			return getCnsmAmBscdNm();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 672207993:/* spceIconNo */
			setSpceIconNo((String)value);
			break;
		case 2106037375:/* spceSrno */
			setSpceSrno((String)value);
			break;
		case -896131682:/* spceNm */
			setSpceNm((String)value);
			break;
		case -2010290162:/* spceBal */
			if ( value instanceof String ){
				setSpceBal((String)value);
			}
			else if ( value instanceof Double ){
				setSpceBal((Double)value);
			}
			else if ( value instanceof Long ){
				setSpceBal((Long)value);
			}
			else{
				setSpceBal((BigDecimal)value);
			}
			break;
		case -660526937:/* savGoalAm */
			if ( value instanceof String ){
				setSavGoalAm((String)value);
			}
			else if ( value instanceof Double ){
				setSavGoalAm((Double)value);
			}
			else if ( value instanceof Long ){
				setSavGoalAm((Long)value);
			}
			else{
				setSavGoalAm((BigDecimal)value);
			}
			break;
		case 1799097461:/* savGoalStaDt */
			setSavGoalStaDt((String)value);
			break;
		case 1785992304:/* savGoalEndDt */
			setSavGoalEndDt((String)value);
			break;
		case -579940604:/* cnsmGoalAm */
			if ( value instanceof String ){
				setCnsmGoalAm((String)value);
			}
			else if ( value instanceof Double ){
				setCnsmGoalAm((Double)value);
			}
			else if ( value instanceof Long ){
				setCnsmGoalAm((Long)value);
			}
			else{
				setCnsmGoalAm((BigDecimal)value);
			}
			break;
		case -754478301:/* cnsmAmBscd */
			setCnsmAmBscd((String)value);
			break;
		case 795828290:/* cnsmAmBscdNm */
			setCnsmAmBscdNm((String)value);
			break;
		default:
			break;
		}
	}
	
}
