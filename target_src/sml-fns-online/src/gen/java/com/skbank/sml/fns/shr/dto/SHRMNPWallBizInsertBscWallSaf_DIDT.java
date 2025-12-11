/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.shr.dto;

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
	"dpsInpAcno", "acnoTyp", "iconNo", "acnoNm", "atsYn", "atsCycd", "atsDd", "atsStaDt", "atsAm", "goalAm", "atsStaWkdDscd", "goalNm"
}, name="SHRMNPWallBizInsertBscWallSaf_DIDT")
@XmlRootElement(name="SHRMNPWallBizInsertBscWallSaf_DIDT")
@BxmCategory(logicalName="SHR 머니클립.기본.지갑.금고.등록.입력IO", description="") 
public class SHRMNPWallBizInsertBscWallSaf_DIDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 1188389208L;
	
	
	
	/**
	 * 수신입력계좌번호
	 */
	@ApiModelProperty(
		name = "dpsInpAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dpsInpAcno")
	@BxmOmm_Field(length=15, decimal=0, description="수신입력계좌번호", align="left", fill="")
	private String dpsInpAcno= "";
	
	
	/**
	 * 계좌타입
	 */
	@ApiModelProperty(
		name = "acnoTyp"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("acnoTyp")
	@BxmOmm_Field(length=1, decimal=0, description="계좌타입", align="left", fill="")
	private String acnoTyp= "";
	
	
	/**
	 * 아이콘번호
	 */
	@ApiModelProperty(
		name = "iconNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("iconNo")
	@BxmOmm_Field(length=2, decimal=0, description="아이콘번호", align="left", fill="")
	private String iconNo= "";
	
	
	/**
	 * 계좌명
	 */
	@ApiModelProperty(
		name = "acnoNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("acnoNm")
	@BxmOmm_Field(length=50, decimal=0, description="계좌명", align="left", fill="")
	private String acnoNm= "";
	
	
	/**
	 * 자동이체여부
	 */
	@ApiModelProperty(
		name = "atsYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atsYn")
	@BxmOmm_Field(length=1, decimal=0, description="자동이체여부", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String atsYn= "";
	
	
	/**
	 * 자동이체주기코드
	 */
	@ApiModelProperty(
		name = "atsCycd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atsCycd")
	@BxmOmm_Field(length=2, decimal=0, description="자동이체주기코드", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String atsCycd= "";
	
	
	/**
	 * 자동이체일
	 */
	@ApiModelProperty(
		name = "atsDd"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("atsDd")
	@BxmOmm_Field(length=2, decimal=0, description="자동이체일", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private Integer atsDd= 0;
	
	
	/**
	 * 자동이체시작일자
	 */
	@ApiModelProperty(
		name = "atsStaDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atsStaDt")
	@BxmOmm_Field(length=8, decimal=0, description="자동이체시작일자", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String atsStaDt= "";
	
	
	/**
	 * 자동이체금액
	 */
	@ApiModelProperty(
		name = "atsAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("atsAm")
	@BxmOmm_Field(length=19, decimal=3, description="자동이체금액", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal atsAm= new BigDecimal("0");
	
	
	/**
	 * 목표금액
	 */
	@ApiModelProperty(
		name = "goalAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("goalAm")
	@BxmOmm_Field(length=18, decimal=0, description="목표금액", align="right", fill="")
	private BigDecimal goalAm= new BigDecimal("0");
	
	
	/**
	 * 자동이체시작요일구분코드
	 */
	@ApiModelProperty(
		name = "atsStaWkdDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atsStaWkdDscd")
	@BxmOmm_Field(length=1, decimal=0, description="자동이체시작요일구분코드", align="left", fill="")
	private String atsStaWkdDscd= "";
	
	
	/**
	 * 목표명
	 */
	@ApiModelProperty(
		name = "goalNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("goalNm")
	@BxmOmm_Field(length=80, decimal=0, description="목표명", align="left", fill="")
	private String goalNm= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dpsInpAcno= false;
	protected final boolean isSet_dpsInpAcno(){
		return this.isSet_dpsInpAcno;
	}
	private void setIsSet_dpsInpAcno(boolean value){
		this.isSet_dpsInpAcno= value;
	}
	/**
	 * 수신입력계좌번호
	 */
	@XmlTransient
	public String getDpsInpAcno(){
		return this.dpsInpAcno;
	}
	
	/**
	 * 수신입력계좌번호
	 * 
	 * @param dpsInpAcno 수신입력계좌번호
	 */
	public void setDpsInpAcno(String dpsInpAcno){
		this.dpsInpAcno= dpsInpAcno;
		this.setIsSet_dpsInpAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_acnoTyp= false;
	protected final boolean isSet_acnoTyp(){
		return this.isSet_acnoTyp;
	}
	private void setIsSet_acnoTyp(boolean value){
		this.isSet_acnoTyp= value;
	}
	/**
	 * 계좌타입
	 */
	@XmlTransient
	public String getAcnoTyp(){
		return this.acnoTyp;
	}
	
	/**
	 * 계좌타입
	 * 
	 * @param acnoTyp 계좌타입
	 */
	public void setAcnoTyp(String acnoTyp){
		this.acnoTyp= acnoTyp;
		this.setIsSet_acnoTyp(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_iconNo= false;
	protected final boolean isSet_iconNo(){
		return this.isSet_iconNo;
	}
	private void setIsSet_iconNo(boolean value){
		this.isSet_iconNo= value;
	}
	/**
	 * 아이콘번호
	 */
	@XmlTransient
	public String getIconNo(){
		return this.iconNo;
	}
	
	/**
	 * 아이콘번호
	 * 
	 * @param iconNo 아이콘번호
	 */
	public void setIconNo(String iconNo){
		this.iconNo= iconNo;
		this.setIsSet_iconNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_acnoNm= false;
	protected final boolean isSet_acnoNm(){
		return this.isSet_acnoNm;
	}
	private void setIsSet_acnoNm(boolean value){
		this.isSet_acnoNm= value;
	}
	/**
	 * 계좌명
	 */
	@XmlTransient
	public String getAcnoNm(){
		return this.acnoNm;
	}
	
	/**
	 * 계좌명
	 * 
	 * @param acnoNm 계좌명
	 */
	public void setAcnoNm(String acnoNm){
		this.acnoNm= acnoNm;
		this.setIsSet_acnoNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atsYn= false;
	protected final boolean isSet_atsYn(){
		return this.isSet_atsYn;
	}
	private void setIsSet_atsYn(boolean value){
		this.isSet_atsYn= value;
	}
	/**
	 * 자동이체여부
	 */
	@XmlTransient
	public String getAtsYn(){
		return this.atsYn;
	}
	
	/**
	 * 자동이체여부
	 * 
	 * @param atsYn 자동이체여부
	 */
	public void setAtsYn(String atsYn){
		this.atsYn= atsYn;
		this.setIsSet_atsYn(true);
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
	public Integer getAtsDd(){
		return this.atsDd;
	}
	
	/**
	 * 자동이체일
	 * 
	 * @param atsDd 자동이체일
	 */
	public void setAtsDd(Integer atsDd){
		this.atsDd= atsDd;
		this.setIsSet_atsDd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atsStaDt= false;
	protected final boolean isSet_atsStaDt(){
		return this.isSet_atsStaDt;
	}
	private void setIsSet_atsStaDt(boolean value){
		this.isSet_atsStaDt= value;
	}
	/**
	 * 자동이체시작일자
	 */
	@XmlTransient
	public String getAtsStaDt(){
		return this.atsStaDt;
	}
	
	/**
	 * 자동이체시작일자
	 * 
	 * @param atsStaDt 자동이체시작일자
	 */
	public void setAtsStaDt(String atsStaDt){
		this.atsStaDt= atsStaDt;
		this.setIsSet_atsStaDt(true);
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
	private boolean isSet_goalAm= false;
	protected final boolean isSet_goalAm(){
		return this.isSet_goalAm;
	}
	private void setIsSet_goalAm(boolean value){
		this.isSet_goalAm= value;
	}
	/**
	 * 목표금액
	 * BigDecimal - Double value setter
	 *
	 * @Param goalAm 목표금액
	 */
	public void setGoalAm(double goalAm) {
		setGoalAm(BigDecimal.valueOf(goalAm));
	}
	/**
	 * 목표금액
	 * BigDecimal - Long value setter
	 *
	 * @Param goalAm 목표금액
	 */
	public void setGoalAm(long goalAm) {
		setGoalAm(BigDecimal.valueOf(goalAm));
	}
	/**
	 * 목표금액
	 * BigDecimal - String value setter
	 *
	 * @Param goalAm 목표금액
	 */
	public void setGoalAm(String goalAm) {
		setGoalAm(new BigDecimal(goalAm));
	}
	/**
	 * 목표금액
	 */
	@XmlTransient
	public BigDecimal getGoalAm(){
		return this.goalAm;
	}
	
	/**
	 * 목표금액
	 * 
	 * @param goalAm 목표금액
	 */
	@JsonSetter("goalAm")
	public void setGoalAm(BigDecimal goalAm){
		this.goalAm= goalAm;
		this.setIsSet_goalAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atsStaWkdDscd= false;
	protected final boolean isSet_atsStaWkdDscd(){
		return this.isSet_atsStaWkdDscd;
	}
	private void setIsSet_atsStaWkdDscd(boolean value){
		this.isSet_atsStaWkdDscd= value;
	}
	/**
	 * 자동이체시작요일구분코드
	 */
	@XmlTransient
	public String getAtsStaWkdDscd(){
		return this.atsStaWkdDscd;
	}
	
	/**
	 * 자동이체시작요일구분코드
	 * 
	 * @param atsStaWkdDscd 자동이체시작요일구분코드
	 */
	public void setAtsStaWkdDscd(String atsStaWkdDscd){
		this.atsStaWkdDscd= atsStaWkdDscd;
		this.setIsSet_atsStaWkdDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_goalNm= false;
	protected final boolean isSet_goalNm(){
		return this.isSet_goalNm;
	}
	private void setIsSet_goalNm(boolean value){
		this.isSet_goalNm= value;
	}
	/**
	 * 목표명
	 */
	@XmlTransient
	public String getGoalNm(){
		return this.goalNm;
	}
	
	/**
	 * 목표명
	 * 
	 * @param goalNm 목표명
	 */
	public void setGoalNm(String goalNm){
		this.goalNm= goalNm;
		this.setIsSet_goalNm(true);
	}
				
	@Override
	public SHRMNPWallBizInsertBscWallSaf_DIDT clone(){
		try{
			SHRMNPWallBizInsertBscWallSaf_DIDT object= (SHRMNPWallBizInsertBscWallSaf_DIDT)super.clone();
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
		
		result= prime * result + ((this.dpsInpAcno==null)?0:this.dpsInpAcno.hashCode());
		result= prime * result + ((this.acnoTyp==null)?0:this.acnoTyp.hashCode());
		result= prime * result + ((this.iconNo==null)?0:this.iconNo.hashCode());
		result= prime * result + ((this.acnoNm==null)?0:this.acnoNm.hashCode());
		result= prime * result + ((this.atsYn==null)?0:this.atsYn.hashCode());
		result= prime * result + ((this.atsCycd==null)?0:this.atsCycd.hashCode());
		result= prime * result + ((this.atsDd==null)?0:this.atsDd.hashCode());
		result= prime * result + ((this.atsStaDt==null)?0:this.atsStaDt.hashCode());
		result= prime * result + ((this.atsAm==null)?0:this.atsAm.hashCode());
		result= prime * result + ((this.goalAm==null)?0:this.goalAm.hashCode());
		result= prime * result + ((this.atsStaWkdDscd==null)?0:this.atsStaWkdDscd.hashCode());
		result= prime * result + ((this.goalNm==null)?0:this.goalNm.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final SHRMNPWallBizInsertBscWallSaf_DIDT other= (SHRMNPWallBizInsertBscWallSaf_DIDT)obj;
		{
			Object _dpsInpAcno= getDpsInpAcno();
			Object __dpsInpAcno= other.getDpsInpAcno();
			if ( _dpsInpAcno== null ) { if ( __dpsInpAcno!= null ) return false; }
			else if ( !_dpsInpAcno.equals(__dpsInpAcno) ) return false;
		}
		{
			Object _acnoTyp= getAcnoTyp();
			Object __acnoTyp= other.getAcnoTyp();
			if ( _acnoTyp== null ) { if ( __acnoTyp!= null ) return false; }
			else if ( !_acnoTyp.equals(__acnoTyp) ) return false;
		}
		{
			Object _iconNo= getIconNo();
			Object __iconNo= other.getIconNo();
			if ( _iconNo== null ) { if ( __iconNo!= null ) return false; }
			else if ( !_iconNo.equals(__iconNo) ) return false;
		}
		{
			Object _acnoNm= getAcnoNm();
			Object __acnoNm= other.getAcnoNm();
			if ( _acnoNm== null ) { if ( __acnoNm!= null ) return false; }
			else if ( !_acnoNm.equals(__acnoNm) ) return false;
		}
		{
			Object _atsYn= getAtsYn();
			Object __atsYn= other.getAtsYn();
			if ( _atsYn== null ) { if ( __atsYn!= null ) return false; }
			else if ( !_atsYn.equals(__atsYn) ) return false;
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
			Object _atsStaDt= getAtsStaDt();
			Object __atsStaDt= other.getAtsStaDt();
			if ( _atsStaDt== null ) { if ( __atsStaDt!= null ) return false; }
			else if ( !_atsStaDt.equals(__atsStaDt) ) return false;
		}
		{
			Object _atsAm= getAtsAm();
			Object __atsAm= other.getAtsAm();
			if ( _atsAm== null ) { if ( __atsAm!= null ) return false; }
			else if ( !_atsAm.equals(__atsAm) ) return false;
		}
		{
			Object _goalAm= getGoalAm();
			Object __goalAm= other.getGoalAm();
			if ( _goalAm== null ) { if ( __goalAm!= null ) return false; }
			else if ( !_goalAm.equals(__goalAm) ) return false;
		}
		{
			Object _atsStaWkdDscd= getAtsStaWkdDscd();
			Object __atsStaWkdDscd= other.getAtsStaWkdDscd();
			if ( _atsStaWkdDscd== null ) { if ( __atsStaWkdDscd!= null ) return false; }
			else if ( !_atsStaWkdDscd.equals(__atsStaWkdDscd) ) return false;
		}
		{
			Object _goalNm= getGoalNm();
			Object __goalNm= other.getGoalNm();
			if ( _goalNm== null ) { if ( __goalNm!= null ) return false; }
			else if ( !_goalNm.equals(__goalNm) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(SHRMNPWallBizInsertBscWallSaf_DIDT.class.getName()).append(":\n");
		sb.append("\tdpsInpAcno: ");
		sb.append(dpsInpAcno==null?"null":getDpsInpAcno());
		sb.append("\n");
		sb.append("\tacnoTyp: ");
		sb.append(acnoTyp==null?"null":getAcnoTyp());
		sb.append("\n");
		sb.append("\ticonNo: ");
		sb.append(iconNo==null?"null":getIconNo());
		sb.append("\n");
		sb.append("\tacnoNm: ");
		sb.append(acnoNm==null?"null":getAcnoNm());
		sb.append("\n");
		sb.append("\tatsYn: ");
		sb.append(atsYn==null?"null":getAtsYn());
		sb.append("\n");
		sb.append("\tatsCycd: ");
		sb.append(atsCycd==null?"null":getAtsCycd());
		sb.append("\n");
		sb.append("\tatsDd: ");
		sb.append(atsDd==null?"null":getAtsDd());
		sb.append("\n");
		sb.append("\tatsStaDt: ");
		sb.append(atsStaDt==null?"null":getAtsStaDt());
		sb.append("\n");
		sb.append("\tatsAm: ");
		sb.append(atsAm==null?"null":getAtsAm());
		sb.append("\n");
		sb.append("\tgoalAm: ");
		sb.append(goalAm==null?"null":getGoalAm());
		sb.append("\n");
		sb.append("\tatsStaWkdDscd: ");
		sb.append(atsStaWkdDscd==null?"null":getAtsStaWkdDscd());
		sb.append("\n");
		sb.append("\tgoalNm: ");
		sb.append(goalNm==null?"null":getGoalNm());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 15; /* dpsInpAcno */
		messageLen+= 1; /* acnoTyp */
		messageLen+= 2; /* iconNo */
		messageLen+= 50; /* acnoNm */
		messageLen+= 1; /* atsYn */
		messageLen+= 2; /* atsCycd */
		messageLen+= 2; /* atsDd */
		messageLen+= 8; /* atsStaDt */
		messageLen+= 19; /* atsAm */
		messageLen+= 18; /* goalAm */
		messageLen+= 1; /* atsStaWkdDscd */
		messageLen+= 80; /* goalNm */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("dpsInpAcno");
		list.add("acnoTyp");
		list.add("iconNo");
		list.add("acnoNm");
		list.add("atsYn");
		list.add("atsCycd");
		list.add("atsDd");
		list.add("atsStaDt");
		list.add("atsAm");
		list.add("goalAm");
		list.add("atsStaWkdDscd");
		list.add("goalNm");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("dpsInpAcno", get("dpsInpAcno"));
		map.put("acnoTyp", get("acnoTyp"));
		map.put("iconNo", get("iconNo"));
		map.put("acnoNm", get("acnoNm"));
		map.put("atsYn", get("atsYn"));
		map.put("atsCycd", get("atsCycd"));
		map.put("atsDd", get("atsDd"));
		map.put("atsStaDt", get("atsStaDt"));
		map.put("atsAm", get("atsAm"));
		map.put("goalAm", get("goalAm"));
		map.put("atsStaWkdDscd", get("atsStaWkdDscd"));
		map.put("goalNm", get("goalNm"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -865257337:/* dpsInpAcno */
			return getDpsInpAcno();
		case -1167191512:/* acnoTyp */
			return getAcnoTyp();
		case -1194062822:/* iconNo */
			return getIconNo();
		case -1423124862:/* acnoNm */
			return getAcnoNm();
		case 93150677:/* atsYn */
			return getAtsYn();
		case -677154281:/* atsCycd */
			return getAtsCycd();
		case 93150016:/* atsDd */
			return getAtsDd();
		case 497678352:/* atsStaDt */
			return getAtsStaDt();
		case 93149932:/* atsAm */
			return getAtsAm();
		case -1240658273:/* goalAm */
			return getGoalAm();
		case 880487904:/* atsStaWkdDscd */
			return getAtsStaWkdDscd();
		case -1240657870:/* goalNm */
			return getGoalNm();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -865257337:/* dpsInpAcno */
			setDpsInpAcno((String)value);
			break;
		case -1167191512:/* acnoTyp */
			setAcnoTyp((String)value);
			break;
		case -1194062822:/* iconNo */
			setIconNo((String)value);
			break;
		case -1423124862:/* acnoNm */
			setAcnoNm((String)value);
			break;
		case 93150677:/* atsYn */
			setAtsYn((String)value);
			break;
		case -677154281:/* atsCycd */
			setAtsCycd((String)value);
			break;
		case 93150016:/* atsDd */
			setAtsDd((Integer)value);
			break;
		case 497678352:/* atsStaDt */
			setAtsStaDt((String)value);
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
		case -1240658273:/* goalAm */
			if ( value instanceof String ){
				setGoalAm((String)value);
			}
			else if ( value instanceof Double ){
				setGoalAm((Double)value);
			}
			else if ( value instanceof Long ){
				setGoalAm((Long)value);
			}
			else{
				setGoalAm((BigDecimal)value);
			}
			break;
		case 880487904:/* atsStaWkdDscd */
			setAtsStaWkdDscd((String)value);
			break;
		case -1240657870:/* goalNm */
			setGoalNm((String)value);
			break;
		default:
			break;
		}
	}
	
}
