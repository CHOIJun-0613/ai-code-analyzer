/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.mnp.dto;

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
	"mnyClpChidAcno", "mnyClpChidActNm", "dpacCtBal", "mnyClpChidActDscd", "bscIntAm", "actAplIrt", "mnyClpChidActCreDt", "mnyClpIconNo", "mnyClpGoalAm", "pushAgrYn", "checked"
}, name="MNPMnyPinBscMngSelectMnpChidAcno_DTO")
@XmlRootElement(name="MNPMnyPinBscMngSelectMnpChidAcno_DTO")
@BxmCategory(logicalName="머니클립.자.계좌.조회.컴포넌트.공통.출력.IO", description="") 
public class MNPMnyPinBscMngSelectMnpChidAcno_DTO implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 724601076L;
	
	
	
	/**
	 * 머니클립자계좌번호
	 */
	@ApiModelProperty(
		name = "mnyClpChidAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("mnyClpChidAcno")
	@BxmOmm_Field(length=13, decimal=0, description="머니클립자계좌번호", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=C","EIMS_DATA_TYPE=S"})
	private String mnyClpChidAcno= "";
	
	
	/**
	 * 머니클립자계좌명
	 */
	@ApiModelProperty(
		name = "mnyClpChidActNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("mnyClpChidActNm")
	@BxmOmm_Field(length=100, decimal=0, description="머니클립자계좌명", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=C","EIMS_DATA_TYPE=S"})
	private String mnyClpChidActNm= "";
	
	
	/**
	 * 수신계좌현재잔액
	 */
	@ApiModelProperty(
		name = "dpacCtBal"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("dpacCtBal")
	@BxmOmm_Field(length=19, decimal=3, description="수신계좌현재잔액", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=C","EIMS_DATA_TYPE=D"})
	private BigDecimal dpacCtBal= new BigDecimal("0");
	
	
	/**
	 * 머니클립자계좌구분코드
	 */
	@ApiModelProperty(
		name = "mnyClpChidActDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("mnyClpChidActDscd")
	@BxmOmm_Field(length=1, decimal=0, description="머니클립자계좌구분코드", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=C","EIMS_DATA_TYPE=S"})
	private String mnyClpChidActDscd= "";
	
	
	/**
	 * 기본이자금액
	 */
	@ApiModelProperty(
		name = "bscIntAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("bscIntAm")
	@BxmOmm_Field(length=19, decimal=3, description="기본이자금액", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=C","EIMS_DATA_TYPE=D"})
	private BigDecimal bscIntAm= new BigDecimal("0");
	
	
	/**
	 * 계좌적용이율
	 */
	@ApiModelProperty(
		name = "actAplIrt"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("actAplIrt")
	@BxmOmm_Field(length=10, decimal=6, description="계좌적용이율", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=C","EIMS_DATA_TYPE=D"})
	private BigDecimal actAplIrt= new BigDecimal("0");
	
	
	/**
	 * 머니클립자계좌생성일자
	 */
	@ApiModelProperty(
		name = "mnyClpChidActCreDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("mnyClpChidActCreDt")
	@BxmOmm_Field(length=8, decimal=0, description="머니클립자계좌생성일자", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=C","EIMS_DATA_TYPE=S"})
	private String mnyClpChidActCreDt= "";
	
	
	/**
	 * 머니클립아이콘번호
	 */
	@ApiModelProperty(
		name = "mnyClpIconNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("mnyClpIconNo")
	@BxmOmm_Field(length=2, decimal=0, description="머니클립아이콘번호", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=C","EIMS_DATA_TYPE=S"})
	private String mnyClpIconNo= "";
	
	
	/**
	 * 머니클립목표금액
	 */
	@ApiModelProperty(
		name = "mnyClpGoalAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("mnyClpGoalAm")
	@BxmOmm_Field(length=19, decimal=3, description="머니클립목표금액", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=C","EIMS_DATA_TYPE=D"})
	private BigDecimal mnyClpGoalAm= new BigDecimal("0");
	
	
	/**
	 * PUSH동의여부
	 */
	@ApiModelProperty(
		name = "pushAgrYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("pushAgrYn")
	@BxmOmm_Field(length=1, decimal=0, description="PUSH동의여부", align="left", fill="")
	private String pushAgrYn= "";
	
	
	/**
	 * 체크여부
	 */
	@ApiModelProperty(
		name = "checked"
		, dataType = "java.lang.Boolean"
		)
	@XmlElement
	@JsonProperty("checked")
	@BxmOmm_Field(length=1, decimal=0, description="체크여부", align="left", fill="")
	private Boolean checked= false;
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mnyClpChidAcno= false;
	protected final boolean isSet_mnyClpChidAcno(){
		return this.isSet_mnyClpChidAcno;
	}
	private void setIsSet_mnyClpChidAcno(boolean value){
		this.isSet_mnyClpChidAcno= value;
	}
	/**
	 * 머니클립자계좌번호
	 */
	@XmlTransient
	public String getMnyClpChidAcno(){
		return this.mnyClpChidAcno;
	}
	
	/**
	 * 머니클립자계좌번호
	 * 
	 * @param mnyClpChidAcno 머니클립자계좌번호
	 */
	public void setMnyClpChidAcno(String mnyClpChidAcno){
		this.mnyClpChidAcno= mnyClpChidAcno;
		this.setIsSet_mnyClpChidAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mnyClpChidActNm= false;
	protected final boolean isSet_mnyClpChidActNm(){
		return this.isSet_mnyClpChidActNm;
	}
	private void setIsSet_mnyClpChidActNm(boolean value){
		this.isSet_mnyClpChidActNm= value;
	}
	/**
	 * 머니클립자계좌명
	 */
	@XmlTransient
	public String getMnyClpChidActNm(){
		return this.mnyClpChidActNm;
	}
	
	/**
	 * 머니클립자계좌명
	 * 
	 * @param mnyClpChidActNm 머니클립자계좌명
	 */
	public void setMnyClpChidActNm(String mnyClpChidActNm){
		this.mnyClpChidActNm= mnyClpChidActNm;
		this.setIsSet_mnyClpChidActNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dpacCtBal= false;
	protected final boolean isSet_dpacCtBal(){
		return this.isSet_dpacCtBal;
	}
	private void setIsSet_dpacCtBal(boolean value){
		this.isSet_dpacCtBal= value;
	}
	/**
	 * 수신계좌현재잔액
	 * BigDecimal - Double value setter
	 *
	 * @Param dpacCtBal 수신계좌현재잔액
	 */
	public void setDpacCtBal(double dpacCtBal) {
		setDpacCtBal(BigDecimal.valueOf(dpacCtBal));
	}
	/**
	 * 수신계좌현재잔액
	 * BigDecimal - Long value setter
	 *
	 * @Param dpacCtBal 수신계좌현재잔액
	 */
	public void setDpacCtBal(long dpacCtBal) {
		setDpacCtBal(BigDecimal.valueOf(dpacCtBal));
	}
	/**
	 * 수신계좌현재잔액
	 * BigDecimal - String value setter
	 *
	 * @Param dpacCtBal 수신계좌현재잔액
	 */
	public void setDpacCtBal(String dpacCtBal) {
		setDpacCtBal(new BigDecimal(dpacCtBal));
	}
	/**
	 * 수신계좌현재잔액
	 */
	@XmlTransient
	public BigDecimal getDpacCtBal(){
		return this.dpacCtBal;
	}
	
	/**
	 * 수신계좌현재잔액
	 * 
	 * @param dpacCtBal 수신계좌현재잔액
	 */
	@JsonSetter("dpacCtBal")
	public void setDpacCtBal(BigDecimal dpacCtBal){
		this.dpacCtBal= dpacCtBal;
		this.setIsSet_dpacCtBal(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mnyClpChidActDscd= false;
	protected final boolean isSet_mnyClpChidActDscd(){
		return this.isSet_mnyClpChidActDscd;
	}
	private void setIsSet_mnyClpChidActDscd(boolean value){
		this.isSet_mnyClpChidActDscd= value;
	}
	/**
	 * 머니클립자계좌구분코드
	 */
	@XmlTransient
	public String getMnyClpChidActDscd(){
		return this.mnyClpChidActDscd;
	}
	
	/**
	 * 머니클립자계좌구분코드
	 * 
	 * @param mnyClpChidActDscd 머니클립자계좌구분코드
	 */
	public void setMnyClpChidActDscd(String mnyClpChidActDscd){
		this.mnyClpChidActDscd= mnyClpChidActDscd;
		this.setIsSet_mnyClpChidActDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_bscIntAm= false;
	protected final boolean isSet_bscIntAm(){
		return this.isSet_bscIntAm;
	}
	private void setIsSet_bscIntAm(boolean value){
		this.isSet_bscIntAm= value;
	}
	/**
	 * 기본이자금액
	 * BigDecimal - Double value setter
	 *
	 * @Param bscIntAm 기본이자금액
	 */
	public void setBscIntAm(double bscIntAm) {
		setBscIntAm(BigDecimal.valueOf(bscIntAm));
	}
	/**
	 * 기본이자금액
	 * BigDecimal - Long value setter
	 *
	 * @Param bscIntAm 기본이자금액
	 */
	public void setBscIntAm(long bscIntAm) {
		setBscIntAm(BigDecimal.valueOf(bscIntAm));
	}
	/**
	 * 기본이자금액
	 * BigDecimal - String value setter
	 *
	 * @Param bscIntAm 기본이자금액
	 */
	public void setBscIntAm(String bscIntAm) {
		setBscIntAm(new BigDecimal(bscIntAm));
	}
	/**
	 * 기본이자금액
	 */
	@XmlTransient
	public BigDecimal getBscIntAm(){
		return this.bscIntAm;
	}
	
	/**
	 * 기본이자금액
	 * 
	 * @param bscIntAm 기본이자금액
	 */
	@JsonSetter("bscIntAm")
	public void setBscIntAm(BigDecimal bscIntAm){
		this.bscIntAm= bscIntAm;
		this.setIsSet_bscIntAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_actAplIrt= false;
	protected final boolean isSet_actAplIrt(){
		return this.isSet_actAplIrt;
	}
	private void setIsSet_actAplIrt(boolean value){
		this.isSet_actAplIrt= value;
	}
	/**
	 * 계좌적용이율
	 * BigDecimal - Double value setter
	 *
	 * @Param actAplIrt 계좌적용이율
	 */
	public void setActAplIrt(double actAplIrt) {
		setActAplIrt(BigDecimal.valueOf(actAplIrt));
	}
	/**
	 * 계좌적용이율
	 * BigDecimal - Long value setter
	 *
	 * @Param actAplIrt 계좌적용이율
	 */
	public void setActAplIrt(long actAplIrt) {
		setActAplIrt(BigDecimal.valueOf(actAplIrt));
	}
	/**
	 * 계좌적용이율
	 * BigDecimal - String value setter
	 *
	 * @Param actAplIrt 계좌적용이율
	 */
	public void setActAplIrt(String actAplIrt) {
		setActAplIrt(new BigDecimal(actAplIrt));
	}
	/**
	 * 계좌적용이율
	 */
	@XmlTransient
	public BigDecimal getActAplIrt(){
		return this.actAplIrt;
	}
	
	/**
	 * 계좌적용이율
	 * 
	 * @param actAplIrt 계좌적용이율
	 */
	@JsonSetter("actAplIrt")
	public void setActAplIrt(BigDecimal actAplIrt){
		this.actAplIrt= actAplIrt;
		this.setIsSet_actAplIrt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mnyClpChidActCreDt= false;
	protected final boolean isSet_mnyClpChidActCreDt(){
		return this.isSet_mnyClpChidActCreDt;
	}
	private void setIsSet_mnyClpChidActCreDt(boolean value){
		this.isSet_mnyClpChidActCreDt= value;
	}
	/**
	 * 머니클립자계좌생성일자
	 */
	@XmlTransient
	public String getMnyClpChidActCreDt(){
		return this.mnyClpChidActCreDt;
	}
	
	/**
	 * 머니클립자계좌생성일자
	 * 
	 * @param mnyClpChidActCreDt 머니클립자계좌생성일자
	 */
	public void setMnyClpChidActCreDt(String mnyClpChidActCreDt){
		this.mnyClpChidActCreDt= mnyClpChidActCreDt;
		this.setIsSet_mnyClpChidActCreDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mnyClpIconNo= false;
	protected final boolean isSet_mnyClpIconNo(){
		return this.isSet_mnyClpIconNo;
	}
	private void setIsSet_mnyClpIconNo(boolean value){
		this.isSet_mnyClpIconNo= value;
	}
	/**
	 * 머니클립아이콘번호
	 */
	@XmlTransient
	public String getMnyClpIconNo(){
		return this.mnyClpIconNo;
	}
	
	/**
	 * 머니클립아이콘번호
	 * 
	 * @param mnyClpIconNo 머니클립아이콘번호
	 */
	public void setMnyClpIconNo(String mnyClpIconNo){
		this.mnyClpIconNo= mnyClpIconNo;
		this.setIsSet_mnyClpIconNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mnyClpGoalAm= false;
	protected final boolean isSet_mnyClpGoalAm(){
		return this.isSet_mnyClpGoalAm;
	}
	private void setIsSet_mnyClpGoalAm(boolean value){
		this.isSet_mnyClpGoalAm= value;
	}
	/**
	 * 머니클립목표금액
	 * BigDecimal - Double value setter
	 *
	 * @Param mnyClpGoalAm 머니클립목표금액
	 */
	public void setMnyClpGoalAm(double mnyClpGoalAm) {
		setMnyClpGoalAm(BigDecimal.valueOf(mnyClpGoalAm));
	}
	/**
	 * 머니클립목표금액
	 * BigDecimal - Long value setter
	 *
	 * @Param mnyClpGoalAm 머니클립목표금액
	 */
	public void setMnyClpGoalAm(long mnyClpGoalAm) {
		setMnyClpGoalAm(BigDecimal.valueOf(mnyClpGoalAm));
	}
	/**
	 * 머니클립목표금액
	 * BigDecimal - String value setter
	 *
	 * @Param mnyClpGoalAm 머니클립목표금액
	 */
	public void setMnyClpGoalAm(String mnyClpGoalAm) {
		setMnyClpGoalAm(new BigDecimal(mnyClpGoalAm));
	}
	/**
	 * 머니클립목표금액
	 */
	@XmlTransient
	public BigDecimal getMnyClpGoalAm(){
		return this.mnyClpGoalAm;
	}
	
	/**
	 * 머니클립목표금액
	 * 
	 * @param mnyClpGoalAm 머니클립목표금액
	 */
	@JsonSetter("mnyClpGoalAm")
	public void setMnyClpGoalAm(BigDecimal mnyClpGoalAm){
		this.mnyClpGoalAm= mnyClpGoalAm;
		this.setIsSet_mnyClpGoalAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pushAgrYn= false;
	protected final boolean isSet_pushAgrYn(){
		return this.isSet_pushAgrYn;
	}
	private void setIsSet_pushAgrYn(boolean value){
		this.isSet_pushAgrYn= value;
	}
	/**
	 * PUSH동의여부
	 */
	@XmlTransient
	public String getPushAgrYn(){
		return this.pushAgrYn;
	}
	
	/**
	 * PUSH동의여부
	 * 
	 * @param pushAgrYn PUSH동의여부
	 */
	public void setPushAgrYn(String pushAgrYn){
		this.pushAgrYn= pushAgrYn;
		this.setIsSet_pushAgrYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_checked= false;
	protected final boolean isSet_checked(){
		return this.isSet_checked;
	}
	private void setIsSet_checked(boolean value){
		this.isSet_checked= value;
	}
	/**
	 * 체크여부
	 */
	@XmlTransient
	public Boolean isChecked(){
		return this.checked;
	}
	
	/**
	 * 체크여부
	 * 
	 * @param checked 체크여부
	 */
	public void setChecked(Boolean checked){
		this.checked= checked;
		this.setIsSet_checked(true);
	}
				
	@Override
	public MNPMnyPinBscMngSelectMnpChidAcno_DTO clone(){
		try{
			MNPMnyPinBscMngSelectMnpChidAcno_DTO object= (MNPMnyPinBscMngSelectMnpChidAcno_DTO)super.clone();
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
		
		result= prime * result + ((this.mnyClpChidAcno==null)?0:this.mnyClpChidAcno.hashCode());
		result= prime * result + ((this.mnyClpChidActNm==null)?0:this.mnyClpChidActNm.hashCode());
		result= prime * result + ((this.dpacCtBal==null)?0:this.dpacCtBal.hashCode());
		result= prime * result + ((this.mnyClpChidActDscd==null)?0:this.mnyClpChidActDscd.hashCode());
		result= prime * result + ((this.bscIntAm==null)?0:this.bscIntAm.hashCode());
		result= prime * result + ((this.actAplIrt==null)?0:this.actAplIrt.hashCode());
		result= prime * result + ((this.mnyClpChidActCreDt==null)?0:this.mnyClpChidActCreDt.hashCode());
		result= prime * result + ((this.mnyClpIconNo==null)?0:this.mnyClpIconNo.hashCode());
		result= prime * result + ((this.mnyClpGoalAm==null)?0:this.mnyClpGoalAm.hashCode());
		result= prime * result + ((this.pushAgrYn==null)?0:this.pushAgrYn.hashCode());
		result= prime * result + ((this.checked==null)?0:this.checked.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MNPMnyPinBscMngSelectMnpChidAcno_DTO other= (MNPMnyPinBscMngSelectMnpChidAcno_DTO)obj;
		{
			Object _mnyClpChidAcno= getMnyClpChidAcno();
			Object __mnyClpChidAcno= other.getMnyClpChidAcno();
			if ( _mnyClpChidAcno== null ) { if ( __mnyClpChidAcno!= null ) return false; }
			else if ( !_mnyClpChidAcno.equals(__mnyClpChidAcno) ) return false;
		}
		{
			Object _mnyClpChidActNm= getMnyClpChidActNm();
			Object __mnyClpChidActNm= other.getMnyClpChidActNm();
			if ( _mnyClpChidActNm== null ) { if ( __mnyClpChidActNm!= null ) return false; }
			else if ( !_mnyClpChidActNm.equals(__mnyClpChidActNm) ) return false;
		}
		{
			Object _dpacCtBal= getDpacCtBal();
			Object __dpacCtBal= other.getDpacCtBal();
			if ( _dpacCtBal== null ) { if ( __dpacCtBal!= null ) return false; }
			else if ( !_dpacCtBal.equals(__dpacCtBal) ) return false;
		}
		{
			Object _mnyClpChidActDscd= getMnyClpChidActDscd();
			Object __mnyClpChidActDscd= other.getMnyClpChidActDscd();
			if ( _mnyClpChidActDscd== null ) { if ( __mnyClpChidActDscd!= null ) return false; }
			else if ( !_mnyClpChidActDscd.equals(__mnyClpChidActDscd) ) return false;
		}
		{
			Object _bscIntAm= getBscIntAm();
			Object __bscIntAm= other.getBscIntAm();
			if ( _bscIntAm== null ) { if ( __bscIntAm!= null ) return false; }
			else if ( !_bscIntAm.equals(__bscIntAm) ) return false;
		}
		{
			Object _actAplIrt= getActAplIrt();
			Object __actAplIrt= other.getActAplIrt();
			if ( _actAplIrt== null ) { if ( __actAplIrt!= null ) return false; }
			else if ( !_actAplIrt.equals(__actAplIrt) ) return false;
		}
		{
			Object _mnyClpChidActCreDt= getMnyClpChidActCreDt();
			Object __mnyClpChidActCreDt= other.getMnyClpChidActCreDt();
			if ( _mnyClpChidActCreDt== null ) { if ( __mnyClpChidActCreDt!= null ) return false; }
			else if ( !_mnyClpChidActCreDt.equals(__mnyClpChidActCreDt) ) return false;
		}
		{
			Object _mnyClpIconNo= getMnyClpIconNo();
			Object __mnyClpIconNo= other.getMnyClpIconNo();
			if ( _mnyClpIconNo== null ) { if ( __mnyClpIconNo!= null ) return false; }
			else if ( !_mnyClpIconNo.equals(__mnyClpIconNo) ) return false;
		}
		{
			Object _mnyClpGoalAm= getMnyClpGoalAm();
			Object __mnyClpGoalAm= other.getMnyClpGoalAm();
			if ( _mnyClpGoalAm== null ) { if ( __mnyClpGoalAm!= null ) return false; }
			else if ( !_mnyClpGoalAm.equals(__mnyClpGoalAm) ) return false;
		}
		{
			Object _pushAgrYn= getPushAgrYn();
			Object __pushAgrYn= other.getPushAgrYn();
			if ( _pushAgrYn== null ) { if ( __pushAgrYn!= null ) return false; }
			else if ( !_pushAgrYn.equals(__pushAgrYn) ) return false;
		}
		{
			Object _checked= isChecked();
			Object __checked= other.isChecked();
			if ( _checked== null ) { if ( __checked!= null ) return false; }
			else if ( !_checked.equals(__checked) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MNPMnyPinBscMngSelectMnpChidAcno_DTO.class.getName()).append(":\n");
		sb.append("\tmnyClpChidAcno: ");
		sb.append(mnyClpChidAcno==null?"null":getMnyClpChidAcno());
		sb.append("\n");
		sb.append("\tmnyClpChidActNm: ");
		sb.append(mnyClpChidActNm==null?"null":getMnyClpChidActNm());
		sb.append("\n");
		sb.append("\tdpacCtBal: ");
		sb.append(dpacCtBal==null?"null":getDpacCtBal());
		sb.append("\n");
		sb.append("\tmnyClpChidActDscd: ");
		sb.append(mnyClpChidActDscd==null?"null":getMnyClpChidActDscd());
		sb.append("\n");
		sb.append("\tbscIntAm: ");
		sb.append(bscIntAm==null?"null":getBscIntAm());
		sb.append("\n");
		sb.append("\tactAplIrt: ");
		sb.append(actAplIrt==null?"null":getActAplIrt());
		sb.append("\n");
		sb.append("\tmnyClpChidActCreDt: ");
		sb.append(mnyClpChidActCreDt==null?"null":getMnyClpChidActCreDt());
		sb.append("\n");
		sb.append("\tmnyClpIconNo: ");
		sb.append(mnyClpIconNo==null?"null":getMnyClpIconNo());
		sb.append("\n");
		sb.append("\tmnyClpGoalAm: ");
		sb.append(mnyClpGoalAm==null?"null":getMnyClpGoalAm());
		sb.append("\n");
		sb.append("\tpushAgrYn: ");
		sb.append(pushAgrYn==null?"null":getPushAgrYn());
		sb.append("\n");
		sb.append("\tchecked: ");
		sb.append(checked==null?"null":isChecked());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 13; /* mnyClpChidAcno */
		messageLen+= 100; /* mnyClpChidActNm */
		messageLen+= 19; /* dpacCtBal */
		messageLen+= 1; /* mnyClpChidActDscd */
		messageLen+= 19; /* bscIntAm */
		messageLen+= 10; /* actAplIrt */
		messageLen+= 8; /* mnyClpChidActCreDt */
		messageLen+= 2; /* mnyClpIconNo */
		messageLen+= 19; /* mnyClpGoalAm */
		messageLen+= 1; /* pushAgrYn */
		messageLen+= 1; /* checked */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("mnyClpChidAcno");
		list.add("mnyClpChidActNm");
		list.add("dpacCtBal");
		list.add("mnyClpChidActDscd");
		list.add("bscIntAm");
		list.add("actAplIrt");
		list.add("mnyClpChidActCreDt");
		list.add("mnyClpIconNo");
		list.add("mnyClpGoalAm");
		list.add("pushAgrYn");
		list.add("checked");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("mnyClpChidAcno", get("mnyClpChidAcno"));
		map.put("mnyClpChidActNm", get("mnyClpChidActNm"));
		map.put("dpacCtBal", get("dpacCtBal"));
		map.put("mnyClpChidActDscd", get("mnyClpChidActDscd"));
		map.put("bscIntAm", get("bscIntAm"));
		map.put("actAplIrt", get("actAplIrt"));
		map.put("mnyClpChidActCreDt", get("mnyClpChidActCreDt"));
		map.put("mnyClpIconNo", get("mnyClpIconNo"));
		map.put("mnyClpGoalAm", get("mnyClpGoalAm"));
		map.put("pushAgrYn", get("pushAgrYn"));
		map.put("checked", get("checked"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -1782725134:/* mnyClpChidAcno */
			return getMnyClpChidAcno();
		case 570100546:/* mnyClpChidActNm */
			return getMnyClpChidActNm();
		case 357637326:/* dpacCtBal */
			return getDpacCtBal();
		case -1889478157:/* mnyClpChidActDscd */
			return getMnyClpChidActDscd();
		case 885522793:/* bscIntAm */
			return getBscIntAm();
		case -946027456:/* actAplIrt */
			return getActAplIrt();
		case 1554767011:/* mnyClpChidActCreDt */
			return getMnyClpChidActCreDt();
		case -8810487:/* mnyClpIconNo */
			return getMnyClpIconNo();
		case -55405938:/* mnyClpGoalAm */
			return getMnyClpGoalAm();
		case -796708281:/* pushAgrYn */
			return getPushAgrYn();
		case 742313895:/* checked */
			return isChecked();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -1782725134:/* mnyClpChidAcno */
			setMnyClpChidAcno((String)value);
			break;
		case 570100546:/* mnyClpChidActNm */
			setMnyClpChidActNm((String)value);
			break;
		case 357637326:/* dpacCtBal */
			if ( value instanceof String ){
				setDpacCtBal((String)value);
			}
			else if ( value instanceof Double ){
				setDpacCtBal((Double)value);
			}
			else if ( value instanceof Long ){
				setDpacCtBal((Long)value);
			}
			else{
				setDpacCtBal((BigDecimal)value);
			}
			break;
		case -1889478157:/* mnyClpChidActDscd */
			setMnyClpChidActDscd((String)value);
			break;
		case 885522793:/* bscIntAm */
			if ( value instanceof String ){
				setBscIntAm((String)value);
			}
			else if ( value instanceof Double ){
				setBscIntAm((Double)value);
			}
			else if ( value instanceof Long ){
				setBscIntAm((Long)value);
			}
			else{
				setBscIntAm((BigDecimal)value);
			}
			break;
		case -946027456:/* actAplIrt */
			if ( value instanceof String ){
				setActAplIrt((String)value);
			}
			else if ( value instanceof Double ){
				setActAplIrt((Double)value);
			}
			else if ( value instanceof Long ){
				setActAplIrt((Long)value);
			}
			else{
				setActAplIrt((BigDecimal)value);
			}
			break;
		case 1554767011:/* mnyClpChidActCreDt */
			setMnyClpChidActCreDt((String)value);
			break;
		case -8810487:/* mnyClpIconNo */
			setMnyClpIconNo((String)value);
			break;
		case -55405938:/* mnyClpGoalAm */
			if ( value instanceof String ){
				setMnyClpGoalAm((String)value);
			}
			else if ( value instanceof Double ){
				setMnyClpGoalAm((Double)value);
			}
			else if ( value instanceof Long ){
				setMnyClpGoalAm((Long)value);
			}
			else{
				setMnyClpGoalAm((BigDecimal)value);
			}
			break;
		case -796708281:/* pushAgrYn */
			setPushAgrYn((String)value);
			break;
		case 742313895:/* checked */
			setChecked((Boolean)value);
			break;
		default:
			break;
		}
	}
	
}
