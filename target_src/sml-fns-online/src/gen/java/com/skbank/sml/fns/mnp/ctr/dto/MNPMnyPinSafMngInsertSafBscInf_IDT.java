/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.mnp.ctr.dto;

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
	"dpsInpAcno", "encyWdrActPwno", "iconCd", "safAlsNm", "atsYn", "atsCycd", "atsBasDd", "atsStaDt", "atsEndDt", "atsAm", "goalAm", "goalNm"
}, name="MNPMnyPinSafMngInsertSafBscInf_IDT")
@XmlRootElement(name="MNPMnyPinSafMngInsertSafBscInf_IDT")
@BxmCategory(logicalName="머니클립.금고.기본.정보.등록.입력IO", description="") 
public class MNPMnyPinSafMngInsertSafBscInf_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 1900720057L;
	
	
	
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
	 * 암호화출금계좌비밀번호
	 */
	@ApiModelProperty(
		name = "encyWdrActPwno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("encyWdrActPwno")
	@BxmOmm_Field(length=32, decimal=0, description="암호화출금계좌비밀번호", align="left", fill="")
	private String encyWdrActPwno= "";
	
	
	/**
	 * 아이콘코드
	 */
	@ApiModelProperty(
		name = "iconCd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("iconCd")
	@BxmOmm_Field(length=3, decimal=0, description="아이콘코드", align="left", fill="")
	private String iconCd= "";
	
	
	/**
	 * 금고별칭명
	 */
	@ApiModelProperty(
		name = "safAlsNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("safAlsNm")
	@BxmOmm_Field(length=50, decimal=0, description="금고별칭명", align="left", fill="")
	private String safAlsNm= "";
	
	
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
	 * 자동이체기준일
	 */
	@ApiModelProperty(
		name = "atsBasDd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atsBasDd")
	@BxmOmm_Field(length=2, decimal=0, description="자동이체기준일", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String atsBasDd= "";
	
	
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
	 * 자동이체종료일자
	 */
	@ApiModelProperty(
		name = "atsEndDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atsEndDt")
	@BxmOmm_Field(length=8, decimal=0, description="자동이체종료일자", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String atsEndDt= "";
	
	
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
	private boolean isSet_encyWdrActPwno= false;
	protected final boolean isSet_encyWdrActPwno(){
		return this.isSet_encyWdrActPwno;
	}
	private void setIsSet_encyWdrActPwno(boolean value){
		this.isSet_encyWdrActPwno= value;
	}
	/**
	 * 암호화출금계좌비밀번호
	 */
	@XmlTransient
	public String getEncyWdrActPwno(){
		return this.encyWdrActPwno;
	}
	
	/**
	 * 암호화출금계좌비밀번호
	 * 
	 * @param encyWdrActPwno 암호화출금계좌비밀번호
	 */
	public void setEncyWdrActPwno(String encyWdrActPwno){
		this.encyWdrActPwno= encyWdrActPwno;
		this.setIsSet_encyWdrActPwno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_iconCd= false;
	protected final boolean isSet_iconCd(){
		return this.isSet_iconCd;
	}
	private void setIsSet_iconCd(boolean value){
		this.isSet_iconCd= value;
	}
	/**
	 * 아이콘코드
	 */
	@XmlTransient
	public String getIconCd(){
		return this.iconCd;
	}
	
	/**
	 * 아이콘코드
	 * 
	 * @param iconCd 아이콘코드
	 */
	public void setIconCd(String iconCd){
		this.iconCd= iconCd;
		this.setIsSet_iconCd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_safAlsNm= false;
	protected final boolean isSet_safAlsNm(){
		return this.isSet_safAlsNm;
	}
	private void setIsSet_safAlsNm(boolean value){
		this.isSet_safAlsNm= value;
	}
	/**
	 * 금고별칭명
	 */
	@XmlTransient
	public String getSafAlsNm(){
		return this.safAlsNm;
	}
	
	/**
	 * 금고별칭명
	 * 
	 * @param safAlsNm 금고별칭명
	 */
	public void setSafAlsNm(String safAlsNm){
		this.safAlsNm= safAlsNm;
		this.setIsSet_safAlsNm(true);
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
	private boolean isSet_atsEndDt= false;
	protected final boolean isSet_atsEndDt(){
		return this.isSet_atsEndDt;
	}
	private void setIsSet_atsEndDt(boolean value){
		this.isSet_atsEndDt= value;
	}
	/**
	 * 자동이체종료일자
	 */
	@XmlTransient
	public String getAtsEndDt(){
		return this.atsEndDt;
	}
	
	/**
	 * 자동이체종료일자
	 * 
	 * @param atsEndDt 자동이체종료일자
	 */
	public void setAtsEndDt(String atsEndDt){
		this.atsEndDt= atsEndDt;
		this.setIsSet_atsEndDt(true);
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
	public MNPMnyPinSafMngInsertSafBscInf_IDT clone(){
		try{
			MNPMnyPinSafMngInsertSafBscInf_IDT object= (MNPMnyPinSafMngInsertSafBscInf_IDT)super.clone();
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
		result= prime * result + ((this.encyWdrActPwno==null)?0:this.encyWdrActPwno.hashCode());
		result= prime * result + ((this.iconCd==null)?0:this.iconCd.hashCode());
		result= prime * result + ((this.safAlsNm==null)?0:this.safAlsNm.hashCode());
		result= prime * result + ((this.atsYn==null)?0:this.atsYn.hashCode());
		result= prime * result + ((this.atsCycd==null)?0:this.atsCycd.hashCode());
		result= prime * result + ((this.atsBasDd==null)?0:this.atsBasDd.hashCode());
		result= prime * result + ((this.atsStaDt==null)?0:this.atsStaDt.hashCode());
		result= prime * result + ((this.atsEndDt==null)?0:this.atsEndDt.hashCode());
		result= prime * result + ((this.atsAm==null)?0:this.atsAm.hashCode());
		result= prime * result + ((this.goalAm==null)?0:this.goalAm.hashCode());
		result= prime * result + ((this.goalNm==null)?0:this.goalNm.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MNPMnyPinSafMngInsertSafBscInf_IDT other= (MNPMnyPinSafMngInsertSafBscInf_IDT)obj;
		{
			Object _dpsInpAcno= getDpsInpAcno();
			Object __dpsInpAcno= other.getDpsInpAcno();
			if ( _dpsInpAcno== null ) { if ( __dpsInpAcno!= null ) return false; }
			else if ( !_dpsInpAcno.equals(__dpsInpAcno) ) return false;
		}
		{
			Object _encyWdrActPwno= getEncyWdrActPwno();
			Object __encyWdrActPwno= other.getEncyWdrActPwno();
			if ( _encyWdrActPwno== null ) { if ( __encyWdrActPwno!= null ) return false; }
			else if ( !_encyWdrActPwno.equals(__encyWdrActPwno) ) return false;
		}
		{
			Object _iconCd= getIconCd();
			Object __iconCd= other.getIconCd();
			if ( _iconCd== null ) { if ( __iconCd!= null ) return false; }
			else if ( !_iconCd.equals(__iconCd) ) return false;
		}
		{
			Object _safAlsNm= getSafAlsNm();
			Object __safAlsNm= other.getSafAlsNm();
			if ( _safAlsNm== null ) { if ( __safAlsNm!= null ) return false; }
			else if ( !_safAlsNm.equals(__safAlsNm) ) return false;
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
			Object _atsBasDd= getAtsBasDd();
			Object __atsBasDd= other.getAtsBasDd();
			if ( _atsBasDd== null ) { if ( __atsBasDd!= null ) return false; }
			else if ( !_atsBasDd.equals(__atsBasDd) ) return false;
		}
		{
			Object _atsStaDt= getAtsStaDt();
			Object __atsStaDt= other.getAtsStaDt();
			if ( _atsStaDt== null ) { if ( __atsStaDt!= null ) return false; }
			else if ( !_atsStaDt.equals(__atsStaDt) ) return false;
		}
		{
			Object _atsEndDt= getAtsEndDt();
			Object __atsEndDt= other.getAtsEndDt();
			if ( _atsEndDt== null ) { if ( __atsEndDt!= null ) return false; }
			else if ( !_atsEndDt.equals(__atsEndDt) ) return false;
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
	
		sb.append("\n[").append(MNPMnyPinSafMngInsertSafBscInf_IDT.class.getName()).append(":\n");
		sb.append("\tdpsInpAcno: ");
		sb.append(dpsInpAcno==null?"null":getDpsInpAcno());
		sb.append("\n");
		sb.append("\tencyWdrActPwno: ");
		sb.append(encyWdrActPwno==null?"null":getEncyWdrActPwno());
		sb.append("\n");
		sb.append("\ticonCd: ");
		sb.append(iconCd==null?"null":getIconCd());
		sb.append("\n");
		sb.append("\tsafAlsNm: ");
		sb.append(safAlsNm==null?"null":getSafAlsNm());
		sb.append("\n");
		sb.append("\tatsYn: ");
		sb.append(atsYn==null?"null":getAtsYn());
		sb.append("\n");
		sb.append("\tatsCycd: ");
		sb.append(atsCycd==null?"null":getAtsCycd());
		sb.append("\n");
		sb.append("\tatsBasDd: ");
		sb.append(atsBasDd==null?"null":getAtsBasDd());
		sb.append("\n");
		sb.append("\tatsStaDt: ");
		sb.append(atsStaDt==null?"null":getAtsStaDt());
		sb.append("\n");
		sb.append("\tatsEndDt: ");
		sb.append(atsEndDt==null?"null":getAtsEndDt());
		sb.append("\n");
		sb.append("\tatsAm: ");
		sb.append(atsAm==null?"null":getAtsAm());
		sb.append("\n");
		sb.append("\tgoalAm: ");
		sb.append(goalAm==null?"null":getGoalAm());
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
		messageLen+= 32; /* encyWdrActPwno */
		messageLen+= 3; /* iconCd */
		messageLen+= 50; /* safAlsNm */
		messageLen+= 1; /* atsYn */
		messageLen+= 2; /* atsCycd */
		messageLen+= 2; /* atsBasDd */
		messageLen+= 8; /* atsStaDt */
		messageLen+= 8; /* atsEndDt */
		messageLen+= 19; /* atsAm */
		messageLen+= 18; /* goalAm */
		messageLen+= 80; /* goalNm */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("dpsInpAcno");
		list.add("encyWdrActPwno");
		list.add("iconCd");
		list.add("safAlsNm");
		list.add("atsYn");
		list.add("atsCycd");
		list.add("atsBasDd");
		list.add("atsStaDt");
		list.add("atsEndDt");
		list.add("atsAm");
		list.add("goalAm");
		list.add("goalNm");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("dpsInpAcno", get("dpsInpAcno"));
		map.put("encyWdrActPwno", get("encyWdrActPwno"));
		map.put("iconCd", get("iconCd"));
		map.put("safAlsNm", get("safAlsNm"));
		map.put("atsYn", get("atsYn"));
		map.put("atsCycd", get("atsCycd"));
		map.put("atsBasDd", get("atsBasDd"));
		map.put("atsStaDt", get("atsStaDt"));
		map.put("atsEndDt", get("atsEndDt"));
		map.put("atsAm", get("atsAm"));
		map.put("goalAm", get("goalAm"));
		map.put("goalNm", get("goalNm"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -865257337:/* dpsInpAcno */
			return getDpsInpAcno();
		case 1115501300:/* encyWdrActPwno */
			return getEncyWdrActPwno();
		case -1194063174:/* iconCd */
			return getIconCd();
		case 1731769487:/* safAlsNm */
			return getSafAlsNm();
		case 93150677:/* atsYn */
			return getAtsYn();
		case -677154281:/* atsCycd */
			return getAtsCycd();
		case 481429748:/* atsBasDd */
			return getAtsBasDd();
		case 497678352:/* atsStaDt */
			return getAtsStaDt();
		case 484573195:/* atsEndDt */
			return getAtsEndDt();
		case 93149932:/* atsAm */
			return getAtsAm();
		case -1240658273:/* goalAm */
			return getGoalAm();
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
		case 1115501300:/* encyWdrActPwno */
			setEncyWdrActPwno((String)value);
			break;
		case -1194063174:/* iconCd */
			setIconCd((String)value);
			break;
		case 1731769487:/* safAlsNm */
			setSafAlsNm((String)value);
			break;
		case 93150677:/* atsYn */
			setAtsYn((String)value);
			break;
		case -677154281:/* atsCycd */
			setAtsCycd((String)value);
			break;
		case 481429748:/* atsBasDd */
			setAtsBasDd((String)value);
			break;
		case 497678352:/* atsStaDt */
			setAtsStaDt((String)value);
			break;
		case 484573195:/* atsEndDt */
			setAtsEndDt((String)value);
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
		case -1240657870:/* goalNm */
			setGoalNm((String)value);
			break;
		default:
			break;
		}
	}
	
}
