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
	"trnDscd", "spceNo", "acno", "spceNm", "spceIconNo", "goalStaDt", "goalEndDt", "savGoalAm", "cnsmGoalCycd", "cnsmGoalAm"
}, name="PBPPbokSplitBscMngCudSubSpceMng_DIDT")
@XmlRootElement(name="PBPPbokSplitBscMngCudSubSpceMng_DIDT")
@BxmCategory(logicalName="통장.쪼개기.서브.공간.관리.DBM.입력.IO", description="") 
public class PBPPbokSplitBscMngCudSubSpceMng_DIDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 723038860L;
	
	
	
	/**
	 * 거래구분코드
	 */
	@ApiModelProperty(
		name = "trnDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("trnDscd")
	@BxmOmm_Field(length=1, decimal=0, description="거래구분코드", align="left", fill="")
	private String trnDscd= "";
	
	
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
	 * 계좌번호
	 */
	@ApiModelProperty(
		name = "acno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("acno")
	@BxmOmm_Field(length=13, decimal=0, description="계좌번호", align="left", fill="")
	private String acno= "";
	
	
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
	 * 공간아이콘명
	 */
	@ApiModelProperty(
		name = "spceIconNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("spceIconNo")
	@BxmOmm_Field(length=2, decimal=0, description="공간아이콘명", align="left", fill="")
	private String spceIconNo= "";
	
	
	/**
	 * 목표시작일자
	 */
	@ApiModelProperty(
		name = "goalStaDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("goalStaDt")
	@BxmOmm_Field(length=8, decimal=0, description="목표시작일자", align="left", fill="")
	private String goalStaDt= "";
	
	
	/**
	 * 목표종료일자
	 */
	@ApiModelProperty(
		name = "goalEndDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("goalEndDt")
	@BxmOmm_Field(length=8, decimal=0, description="목표종료일자", align="left", fill="")
	private String goalEndDt= "";
	
	
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
	 * 소비목표주기코드
	 */
	@ApiModelProperty(
		name = "cnsmGoalCycd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("cnsmGoalCycd")
	@BxmOmm_Field(length=2, decimal=0, description="소비목표주기코드", align="left", fill="")
	private String cnsmGoalCycd= "";
	
	
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
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_trnDscd= false;
	protected final boolean isSet_trnDscd(){
		return this.isSet_trnDscd;
	}
	private void setIsSet_trnDscd(boolean value){
		this.isSet_trnDscd= value;
	}
	/**
	 * 거래구분코드
	 */
	@XmlTransient
	public String getTrnDscd(){
		return this.trnDscd;
	}
	
	/**
	 * 거래구분코드
	 * 
	 * @param trnDscd 거래구분코드
	 */
	public void setTrnDscd(String trnDscd){
		this.trnDscd= trnDscd;
		this.setIsSet_trnDscd(true);
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
	private boolean isSet_spceIconNo= false;
	protected final boolean isSet_spceIconNo(){
		return this.isSet_spceIconNo;
	}
	private void setIsSet_spceIconNo(boolean value){
		this.isSet_spceIconNo= value;
	}
	/**
	 * 공간아이콘명
	 */
	@XmlTransient
	public String getSpceIconNo(){
		return this.spceIconNo;
	}
	
	/**
	 * 공간아이콘명
	 * 
	 * @param spceIconNo 공간아이콘명
	 */
	public void setSpceIconNo(String spceIconNo){
		this.spceIconNo= spceIconNo;
		this.setIsSet_spceIconNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_goalStaDt= false;
	protected final boolean isSet_goalStaDt(){
		return this.isSet_goalStaDt;
	}
	private void setIsSet_goalStaDt(boolean value){
		this.isSet_goalStaDt= value;
	}
	/**
	 * 목표시작일자
	 */
	@XmlTransient
	public String getGoalStaDt(){
		return this.goalStaDt;
	}
	
	/**
	 * 목표시작일자
	 * 
	 * @param goalStaDt 목표시작일자
	 */
	public void setGoalStaDt(String goalStaDt){
		this.goalStaDt= goalStaDt;
		this.setIsSet_goalStaDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_goalEndDt= false;
	protected final boolean isSet_goalEndDt(){
		return this.isSet_goalEndDt;
	}
	private void setIsSet_goalEndDt(boolean value){
		this.isSet_goalEndDt= value;
	}
	/**
	 * 목표종료일자
	 */
	@XmlTransient
	public String getGoalEndDt(){
		return this.goalEndDt;
	}
	
	/**
	 * 목표종료일자
	 * 
	 * @param goalEndDt 목표종료일자
	 */
	public void setGoalEndDt(String goalEndDt){
		this.goalEndDt= goalEndDt;
		this.setIsSet_goalEndDt(true);
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
	private boolean isSet_cnsmGoalCycd= false;
	protected final boolean isSet_cnsmGoalCycd(){
		return this.isSet_cnsmGoalCycd;
	}
	private void setIsSet_cnsmGoalCycd(boolean value){
		this.isSet_cnsmGoalCycd= value;
	}
	/**
	 * 소비목표주기코드
	 */
	@XmlTransient
	public String getCnsmGoalCycd(){
		return this.cnsmGoalCycd;
	}
	
	/**
	 * 소비목표주기코드
	 * 
	 * @param cnsmGoalCycd 소비목표주기코드
	 */
	public void setCnsmGoalCycd(String cnsmGoalCycd){
		this.cnsmGoalCycd= cnsmGoalCycd;
		this.setIsSet_cnsmGoalCycd(true);
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
				
	@Override
	public PBPPbokSplitBscMngCudSubSpceMng_DIDT clone(){
		try{
			PBPPbokSplitBscMngCudSubSpceMng_DIDT object= (PBPPbokSplitBscMngCudSubSpceMng_DIDT)super.clone();
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
		
		result= prime * result + ((this.trnDscd==null)?0:this.trnDscd.hashCode());
		result= prime * result + ((this.spceNo==null)?0:this.spceNo.hashCode());
		result= prime * result + ((this.acno==null)?0:this.acno.hashCode());
		result= prime * result + ((this.spceNm==null)?0:this.spceNm.hashCode());
		result= prime * result + ((this.spceIconNo==null)?0:this.spceIconNo.hashCode());
		result= prime * result + ((this.goalStaDt==null)?0:this.goalStaDt.hashCode());
		result= prime * result + ((this.goalEndDt==null)?0:this.goalEndDt.hashCode());
		result= prime * result + ((this.savGoalAm==null)?0:this.savGoalAm.hashCode());
		result= prime * result + ((this.cnsmGoalCycd==null)?0:this.cnsmGoalCycd.hashCode());
		result= prime * result + ((this.cnsmGoalAm==null)?0:this.cnsmGoalAm.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final PBPPbokSplitBscMngCudSubSpceMng_DIDT other= (PBPPbokSplitBscMngCudSubSpceMng_DIDT)obj;
		{
			Object _trnDscd= getTrnDscd();
			Object __trnDscd= other.getTrnDscd();
			if ( _trnDscd== null ) { if ( __trnDscd!= null ) return false; }
			else if ( !_trnDscd.equals(__trnDscd) ) return false;
		}
		{
			Object _spceNo= getSpceNo();
			Object __spceNo= other.getSpceNo();
			if ( _spceNo== null ) { if ( __spceNo!= null ) return false; }
			else if ( !_spceNo.equals(__spceNo) ) return false;
		}
		{
			Object _acno= getAcno();
			Object __acno= other.getAcno();
			if ( _acno== null ) { if ( __acno!= null ) return false; }
			else if ( !_acno.equals(__acno) ) return false;
		}
		{
			Object _spceNm= getSpceNm();
			Object __spceNm= other.getSpceNm();
			if ( _spceNm== null ) { if ( __spceNm!= null ) return false; }
			else if ( !_spceNm.equals(__spceNm) ) return false;
		}
		{
			Object _spceIconNo= getSpceIconNo();
			Object __spceIconNo= other.getSpceIconNo();
			if ( _spceIconNo== null ) { if ( __spceIconNo!= null ) return false; }
			else if ( !_spceIconNo.equals(__spceIconNo) ) return false;
		}
		{
			Object _goalStaDt= getGoalStaDt();
			Object __goalStaDt= other.getGoalStaDt();
			if ( _goalStaDt== null ) { if ( __goalStaDt!= null ) return false; }
			else if ( !_goalStaDt.equals(__goalStaDt) ) return false;
		}
		{
			Object _goalEndDt= getGoalEndDt();
			Object __goalEndDt= other.getGoalEndDt();
			if ( _goalEndDt== null ) { if ( __goalEndDt!= null ) return false; }
			else if ( !_goalEndDt.equals(__goalEndDt) ) return false;
		}
		{
			Object _savGoalAm= getSavGoalAm();
			Object __savGoalAm= other.getSavGoalAm();
			if ( _savGoalAm== null ) { if ( __savGoalAm!= null ) return false; }
			else if ( !_savGoalAm.equals(__savGoalAm) ) return false;
		}
		{
			Object _cnsmGoalCycd= getCnsmGoalCycd();
			Object __cnsmGoalCycd= other.getCnsmGoalCycd();
			if ( _cnsmGoalCycd== null ) { if ( __cnsmGoalCycd!= null ) return false; }
			else if ( !_cnsmGoalCycd.equals(__cnsmGoalCycd) ) return false;
		}
		{
			Object _cnsmGoalAm= getCnsmGoalAm();
			Object __cnsmGoalAm= other.getCnsmGoalAm();
			if ( _cnsmGoalAm== null ) { if ( __cnsmGoalAm!= null ) return false; }
			else if ( !_cnsmGoalAm.equals(__cnsmGoalAm) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(PBPPbokSplitBscMngCudSubSpceMng_DIDT.class.getName()).append(":\n");
		sb.append("\ttrnDscd: ");
		sb.append(trnDscd==null?"null":getTrnDscd());
		sb.append("\n");
		sb.append("\tspceNo: ");
		sb.append(spceNo==null?"null":getSpceNo());
		sb.append("\n");
		sb.append("\tacno: ");
		sb.append(acno==null?"null":getAcno());
		sb.append("\n");
		sb.append("\tspceNm: ");
		sb.append(spceNm==null?"null":getSpceNm());
		sb.append("\n");
		sb.append("\tspceIconNo: ");
		sb.append(spceIconNo==null?"null":getSpceIconNo());
		sb.append("\n");
		sb.append("\tgoalStaDt: ");
		sb.append(goalStaDt==null?"null":getGoalStaDt());
		sb.append("\n");
		sb.append("\tgoalEndDt: ");
		sb.append(goalEndDt==null?"null":getGoalEndDt());
		sb.append("\n");
		sb.append("\tsavGoalAm: ");
		sb.append(savGoalAm==null?"null":getSavGoalAm());
		sb.append("\n");
		sb.append("\tcnsmGoalCycd: ");
		sb.append(cnsmGoalCycd==null?"null":getCnsmGoalCycd());
		sb.append("\n");
		sb.append("\tcnsmGoalAm: ");
		sb.append(cnsmGoalAm==null?"null":getCnsmGoalAm());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 1; /* trnDscd */
		messageLen+= 6; /* spceNo */
		messageLen+= 13; /* acno */
		messageLen+= 50; /* spceNm */
		messageLen+= 2; /* spceIconNo */
		messageLen+= 8; /* goalStaDt */
		messageLen+= 8; /* goalEndDt */
		messageLen+= 18; /* savGoalAm */
		messageLen+= 2; /* cnsmGoalCycd */
		messageLen+= 18; /* cnsmGoalAm */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("trnDscd");
		list.add("spceNo");
		list.add("acno");
		list.add("spceNm");
		list.add("spceIconNo");
		list.add("goalStaDt");
		list.add("goalEndDt");
		list.add("savGoalAm");
		list.add("cnsmGoalCycd");
		list.add("cnsmGoalAm");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("trnDscd", get("trnDscd"));
		map.put("spceNo", get("spceNo"));
		map.put("acno", get("acno"));
		map.put("spceNm", get("spceNm"));
		map.put("spceIconNo", get("spceIconNo"));
		map.put("goalStaDt", get("goalStaDt"));
		map.put("goalEndDt", get("goalEndDt"));
		map.put("savGoalAm", get("savGoalAm"));
		map.put("cnsmGoalCycd", get("cnsmGoalCycd"));
		map.put("cnsmGoalAm", get("cnsmGoalAm"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -1056305408:/* trnDscd */
			return getTrnDscd();
		case -896131680:/* spceNo */
			return getSpceNo();
		case 2988387:/* acno */
			return getAcno();
		case -896131682:/* spceNm */
			return getSpceNm();
		case 672207993:/* spceIconNo */
			return getSpceIconNo();
		case 2054865789:/* goalStaDt */
			return getGoalStaDt();
		case 2041760632:/* goalEndDt */
			return getGoalEndDt();
		case -660526937:/* savGoalAm */
			return getSavGoalAm();
		case 1022902319:/* cnsmGoalCycd */
			return getCnsmGoalCycd();
		case -579940604:/* cnsmGoalAm */
			return getCnsmGoalAm();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -1056305408:/* trnDscd */
			setTrnDscd((String)value);
			break;
		case -896131680:/* spceNo */
			setSpceNo((String)value);
			break;
		case 2988387:/* acno */
			setAcno((String)value);
			break;
		case -896131682:/* spceNm */
			setSpceNm((String)value);
			break;
		case 672207993:/* spceIconNo */
			setSpceIconNo((String)value);
			break;
		case 2054865789:/* goalStaDt */
			setGoalStaDt((String)value);
			break;
		case 2041760632:/* goalEndDt */
			setGoalEndDt((String)value);
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
		case 1022902319:/* cnsmGoalCycd */
			setCnsmGoalCycd((String)value);
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
		default:
			break;
		}
	}
	
}
