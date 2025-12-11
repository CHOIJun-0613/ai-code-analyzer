/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.mpb.dto;

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
	"itcsno", "encyRbno", "ebnkUtzpeNo", "userDis", "ebnkInqUserYn", "mdAgrYn", "tms1TsLmtAm", "d1TsLmtAm", "scrtMensKd", "scrtMensMissYn", "spltCerdUsgYn", "twochCrtfYn", "otpCoCd", "otpSrno", "tmHndpeDtOtpYn"
	, "wonCrtfUsgYn", "esnsBnkgUsgYn", "esnsTsRgsYn", "efLieAtntInfRgsCusYn", "cusHpNo", "fdtsTrnLimYn", "openBnkgJnngYn", "mydtCusYn", "dethAtntInfRgsCusYn"
}, name="MPBItcsnoInfInq_DTO")
@XmlRootElement(name="MPBItcsnoInfInq_DTO")
@BxmCategory(logicalName="통합고객번호.정보.조회", description="") 
public class MPBItcsnoInfInq_DTO implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -569430312L;
	
	
	
	/**
	 * 통합고객번호
	 */
	@ApiModelProperty(
		name = "itcsno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("itcsno")
	@BxmOmm_Field(length=11, decimal=0, description="통합고객번호", align="left", fill="")
	private String itcsno= "";
	
	
	/**
	 * 암호화주민사업자등록번호
	 */
	@ApiModelProperty(
		name = "encyRbno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("encyRbno")
	@BxmOmm_Field(length=32, decimal=0, description="암호화주민사업자등록번호", align="left", fill="")
	private String encyRbno= "";
	
	
	/**
	 * 전자뱅킹이용자번호
	 */
	@ApiModelProperty(
		name = "ebnkUtzpeNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ebnkUtzpeNo")
	@BxmOmm_Field(length=13, decimal=0, description="전자뱅킹이용자번호", align="left", fill="")
	private String ebnkUtzpeNo= "";
	
	
	/**
	 * 사용자구분
	 */
	@ApiModelProperty(
		name = "userDis"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("userDis")
	@BxmOmm_Field(length=1, decimal=0, description="사용자구분", align="left", fill="")
	private String userDis= "";
	
	
	/**
	 * 전자뱅킹조회사용자여부
	 */
	@ApiModelProperty(
		name = "ebnkInqUserYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ebnkInqUserYn")
	@BxmOmm_Field(length=1, decimal=0, description="전자뱅킹조회사용자여부", align="left", fill="")
	private String ebnkInqUserYn= "";
	
	
	/**
	 * 매체동의여부
	 */
	@ApiModelProperty(
		name = "mdAgrYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("mdAgrYn")
	@BxmOmm_Field(length=1, decimal=0, description="매체동의여부", align="left", fill="")
	private String mdAgrYn= "";
	
	
	/**
	 * 1회이체한도금액
	 */
	@ApiModelProperty(
		name = "tms1TsLmtAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("tms1TsLmtAm")
	@BxmOmm_Field(length=18, decimal=0, description="1회이체한도금액", align="right", fill="0")
	private BigDecimal tms1TsLmtAm= new BigDecimal("0");
	
	
	/**
	 * 1일이체한도금액
	 */
	@ApiModelProperty(
		name = "d1TsLmtAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("d1TsLmtAm")
	@BxmOmm_Field(length=18, decimal=0, description="1일이체한도금액", align="right", fill="0")
	private BigDecimal d1TsLmtAm= new BigDecimal("0");
	
	
	/**
	 * 보안수단종류
	 */
	@ApiModelProperty(
		name = "scrtMensKd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("scrtMensKd")
	@BxmOmm_Field(length=1, decimal=0, description="보안수단종류", align="left", fill="")
	private String scrtMensKd= "";
	
	
	/**
	 * 보안수단분실여부
	 */
	@ApiModelProperty(
		name = "scrtMensMissYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("scrtMensMissYn")
	@BxmOmm_Field(length=1, decimal=0, description="보안수단분실여부", align="left", fill="")
	private String scrtMensMissYn= "";
	
	
	/**
	 * 특수인증서사용여부
	 */
	@ApiModelProperty(
		name = "spltCerdUsgYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("spltCerdUsgYn")
	@BxmOmm_Field(length=1, decimal=0, description="특수인증서사용여부", align="left", fill="")
	private String spltCerdUsgYn= "";
	
	
	/**
	 * 2채널인증여부
	 */
	@ApiModelProperty(
		name = "twochCrtfYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("twochCrtfYn")
	@BxmOmm_Field(length=1, decimal=0, description="2채널인증여부", align="left", fill="")
	private String twochCrtfYn= "";
	
	
	/**
	 * OTP업체코드
	 */
	@ApiModelProperty(
		name = "otpCoCd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("otpCoCd")
	@BxmOmm_Field(length=3, decimal=0, description="OTP업체코드", align="left", fill="")
	private String otpCoCd= "";
	
	
	/**
	 * OTP일련번호
	 */
	@ApiModelProperty(
		name = "otpSrno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("otpSrno")
	@BxmOmm_Field(length=12, decimal=0, description="OTP일련번호", align="left", fill="")
	private String otpSrno= "";
	
	
	/**
	 * 시각장애인디지털OTP여부
	 */
	@ApiModelProperty(
		name = "tmHndpeDtOtpYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("tmHndpeDtOtpYn")
	@BxmOmm_Field(length=1, decimal=0, description="시각장애인디지털OTP여부", align="left", fill="")
	private String tmHndpeDtOtpYn= "";
	
	
	/**
	 * 원인증사용여부
	 */
	@ApiModelProperty(
		name = "wonCrtfUsgYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("wonCrtfUsgYn")
	@BxmOmm_Field(length=1, decimal=0, description="원인증사용여부", align="left", fill="")
	private String wonCrtfUsgYn= "";
	
	
	/**
	 * 간편뱅킹사용여부
	 */
	@ApiModelProperty(
		name = "esnsBnkgUsgYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("esnsBnkgUsgYn")
	@BxmOmm_Field(length=1, decimal=0, description="간편뱅킹사용여부", align="left", fill="")
	private String esnsBnkgUsgYn= "";
	
	
	/**
	 * 간편이체등록여부
	 */
	@ApiModelProperty(
		name = "esnsTsRgsYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("esnsTsRgsYn")
	@BxmOmm_Field(length=1, decimal=0, description="간편이체등록여부", align="left", fill="")
	private String esnsTsRgsYn= "";
	
	
	/**
	 * 전자금융사기주의정보등록고객여부
	 */
	@ApiModelProperty(
		name = "efLieAtntInfRgsCusYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("efLieAtntInfRgsCusYn")
	@BxmOmm_Field(length=1, decimal=0, description="전자금융사기주의정보등록고객여부", align="left", fill="")
	private String efLieAtntInfRgsCusYn= "";
	
	
	/**
	 * 고객핸드폰번호
	 */
	@ApiModelProperty(
		name = "cusHpNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("cusHpNo")
	@BxmOmm_Field(length=14, decimal=0, description="고객핸드폰번호", align="left", fill="")
	private String cusHpNo= "";
	
	
	/**
	 * 자금이체거래제한여부
	 */
	@ApiModelProperty(
		name = "fdtsTrnLimYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("fdtsTrnLimYn")
	@BxmOmm_Field(length=1, decimal=0, description="자금이체거래제한여부", align="left", fill="")
	private String fdtsTrnLimYn= "";
	
	
	/**
	 * 오픈뱅킹가입여부
	 */
	@ApiModelProperty(
		name = "openBnkgJnngYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("openBnkgJnngYn")
	@BxmOmm_Field(length=1, decimal=0, description="오픈뱅킹가입여부", align="left", fill="")
	private String openBnkgJnngYn= "";
	
	
	/**
	 * 마이데이터고객여부
	 */
	@ApiModelProperty(
		name = "mydtCusYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("mydtCusYn")
	@BxmOmm_Field(length=1, decimal=0, description="마이데이터고객여부", align="left", fill="")
	private String mydtCusYn= "";
	
	
	/**
	 * 사망주의정보등록고객여부
	 */
	@ApiModelProperty(
		name = "dethAtntInfRgsCusYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dethAtntInfRgsCusYn")
	@BxmOmm_Field(length=1, decimal=0, description="사망주의정보등록고객여부", align="left", fill="")
	private String dethAtntInfRgsCusYn= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_itcsno= false;
	protected final boolean isSet_itcsno(){
		return this.isSet_itcsno;
	}
	private void setIsSet_itcsno(boolean value){
		this.isSet_itcsno= value;
	}
	/**
	 * 통합고객번호
	 */
	@XmlTransient
	public String getItcsno(){
		return this.itcsno;
	}
	
	/**
	 * 통합고객번호
	 * 
	 * @param itcsno 통합고객번호
	 */
	public void setItcsno(String itcsno){
		this.itcsno= itcsno;
		this.setIsSet_itcsno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_encyRbno= false;
	protected final boolean isSet_encyRbno(){
		return this.isSet_encyRbno;
	}
	private void setIsSet_encyRbno(boolean value){
		this.isSet_encyRbno= value;
	}
	/**
	 * 암호화주민사업자등록번호
	 */
	@XmlTransient
	public String getEncyRbno(){
		return this.encyRbno;
	}
	
	/**
	 * 암호화주민사업자등록번호
	 * 
	 * @param encyRbno 암호화주민사업자등록번호
	 */
	public void setEncyRbno(String encyRbno){
		this.encyRbno= encyRbno;
		this.setIsSet_encyRbno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ebnkUtzpeNo= false;
	protected final boolean isSet_ebnkUtzpeNo(){
		return this.isSet_ebnkUtzpeNo;
	}
	private void setIsSet_ebnkUtzpeNo(boolean value){
		this.isSet_ebnkUtzpeNo= value;
	}
	/**
	 * 전자뱅킹이용자번호
	 */
	@XmlTransient
	public String getEbnkUtzpeNo(){
		return this.ebnkUtzpeNo;
	}
	
	/**
	 * 전자뱅킹이용자번호
	 * 
	 * @param ebnkUtzpeNo 전자뱅킹이용자번호
	 */
	public void setEbnkUtzpeNo(String ebnkUtzpeNo){
		this.ebnkUtzpeNo= ebnkUtzpeNo;
		this.setIsSet_ebnkUtzpeNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_userDis= false;
	protected final boolean isSet_userDis(){
		return this.isSet_userDis;
	}
	private void setIsSet_userDis(boolean value){
		this.isSet_userDis= value;
	}
	/**
	 * 사용자구분
	 */
	@XmlTransient
	public String getUserDis(){
		return this.userDis;
	}
	
	/**
	 * 사용자구분
	 * 
	 * @param userDis 사용자구분
	 */
	public void setUserDis(String userDis){
		this.userDis= userDis;
		this.setIsSet_userDis(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ebnkInqUserYn= false;
	protected final boolean isSet_ebnkInqUserYn(){
		return this.isSet_ebnkInqUserYn;
	}
	private void setIsSet_ebnkInqUserYn(boolean value){
		this.isSet_ebnkInqUserYn= value;
	}
	/**
	 * 전자뱅킹조회사용자여부
	 */
	@XmlTransient
	public String getEbnkInqUserYn(){
		return this.ebnkInqUserYn;
	}
	
	/**
	 * 전자뱅킹조회사용자여부
	 * 
	 * @param ebnkInqUserYn 전자뱅킹조회사용자여부
	 */
	public void setEbnkInqUserYn(String ebnkInqUserYn){
		this.ebnkInqUserYn= ebnkInqUserYn;
		this.setIsSet_ebnkInqUserYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mdAgrYn= false;
	protected final boolean isSet_mdAgrYn(){
		return this.isSet_mdAgrYn;
	}
	private void setIsSet_mdAgrYn(boolean value){
		this.isSet_mdAgrYn= value;
	}
	/**
	 * 매체동의여부
	 */
	@XmlTransient
	public String getMdAgrYn(){
		return this.mdAgrYn;
	}
	
	/**
	 * 매체동의여부
	 * 
	 * @param mdAgrYn 매체동의여부
	 */
	public void setMdAgrYn(String mdAgrYn){
		this.mdAgrYn= mdAgrYn;
		this.setIsSet_mdAgrYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_tms1TsLmtAm= false;
	protected final boolean isSet_tms1TsLmtAm(){
		return this.isSet_tms1TsLmtAm;
	}
	private void setIsSet_tms1TsLmtAm(boolean value){
		this.isSet_tms1TsLmtAm= value;
	}
	/**
	 * 1회이체한도금액
	 * BigDecimal - Double value setter
	 *
	 * @Param tms1TsLmtAm 1회이체한도금액
	 */
	public void setTms1TsLmtAm(double tms1TsLmtAm) {
		setTms1TsLmtAm(BigDecimal.valueOf(tms1TsLmtAm));
	}
	/**
	 * 1회이체한도금액
	 * BigDecimal - Long value setter
	 *
	 * @Param tms1TsLmtAm 1회이체한도금액
	 */
	public void setTms1TsLmtAm(long tms1TsLmtAm) {
		setTms1TsLmtAm(BigDecimal.valueOf(tms1TsLmtAm));
	}
	/**
	 * 1회이체한도금액
	 * BigDecimal - String value setter
	 *
	 * @Param tms1TsLmtAm 1회이체한도금액
	 */
	public void setTms1TsLmtAm(String tms1TsLmtAm) {
		setTms1TsLmtAm(new BigDecimal(tms1TsLmtAm));
	}
	/**
	 * 1회이체한도금액
	 */
	@XmlTransient
	public BigDecimal getTms1TsLmtAm(){
		return this.tms1TsLmtAm;
	}
	
	/**
	 * 1회이체한도금액
	 * 
	 * @param tms1TsLmtAm 1회이체한도금액
	 */
	@JsonSetter("tms1TsLmtAm")
	public void setTms1TsLmtAm(BigDecimal tms1TsLmtAm){
		this.tms1TsLmtAm= tms1TsLmtAm;
		this.setIsSet_tms1TsLmtAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_d1TsLmtAm= false;
	protected final boolean isSet_d1TsLmtAm(){
		return this.isSet_d1TsLmtAm;
	}
	private void setIsSet_d1TsLmtAm(boolean value){
		this.isSet_d1TsLmtAm= value;
	}
	/**
	 * 1일이체한도금액
	 * BigDecimal - Double value setter
	 *
	 * @Param d1TsLmtAm 1일이체한도금액
	 */
	public void setD1TsLmtAm(double d1TsLmtAm) {
		setD1TsLmtAm(BigDecimal.valueOf(d1TsLmtAm));
	}
	/**
	 * 1일이체한도금액
	 * BigDecimal - Long value setter
	 *
	 * @Param d1TsLmtAm 1일이체한도금액
	 */
	public void setD1TsLmtAm(long d1TsLmtAm) {
		setD1TsLmtAm(BigDecimal.valueOf(d1TsLmtAm));
	}
	/**
	 * 1일이체한도금액
	 * BigDecimal - String value setter
	 *
	 * @Param d1TsLmtAm 1일이체한도금액
	 */
	public void setD1TsLmtAm(String d1TsLmtAm) {
		setD1TsLmtAm(new BigDecimal(d1TsLmtAm));
	}
	/**
	 * 1일이체한도금액
	 */
	@XmlTransient
	public BigDecimal getD1TsLmtAm(){
		return this.d1TsLmtAm;
	}
	
	/**
	 * 1일이체한도금액
	 * 
	 * @param d1TsLmtAm 1일이체한도금액
	 */
	@JsonSetter("d1TsLmtAm")
	public void setD1TsLmtAm(BigDecimal d1TsLmtAm){
		this.d1TsLmtAm= d1TsLmtAm;
		this.setIsSet_d1TsLmtAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_scrtMensKd= false;
	protected final boolean isSet_scrtMensKd(){
		return this.isSet_scrtMensKd;
	}
	private void setIsSet_scrtMensKd(boolean value){
		this.isSet_scrtMensKd= value;
	}
	/**
	 * 보안수단종류
	 */
	@XmlTransient
	public String getScrtMensKd(){
		return this.scrtMensKd;
	}
	
	/**
	 * 보안수단종류
	 * 
	 * @param scrtMensKd 보안수단종류
	 */
	public void setScrtMensKd(String scrtMensKd){
		this.scrtMensKd= scrtMensKd;
		this.setIsSet_scrtMensKd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_scrtMensMissYn= false;
	protected final boolean isSet_scrtMensMissYn(){
		return this.isSet_scrtMensMissYn;
	}
	private void setIsSet_scrtMensMissYn(boolean value){
		this.isSet_scrtMensMissYn= value;
	}
	/**
	 * 보안수단분실여부
	 */
	@XmlTransient
	public String getScrtMensMissYn(){
		return this.scrtMensMissYn;
	}
	
	/**
	 * 보안수단분실여부
	 * 
	 * @param scrtMensMissYn 보안수단분실여부
	 */
	public void setScrtMensMissYn(String scrtMensMissYn){
		this.scrtMensMissYn= scrtMensMissYn;
		this.setIsSet_scrtMensMissYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_spltCerdUsgYn= false;
	protected final boolean isSet_spltCerdUsgYn(){
		return this.isSet_spltCerdUsgYn;
	}
	private void setIsSet_spltCerdUsgYn(boolean value){
		this.isSet_spltCerdUsgYn= value;
	}
	/**
	 * 특수인증서사용여부
	 */
	@XmlTransient
	public String getSpltCerdUsgYn(){
		return this.spltCerdUsgYn;
	}
	
	/**
	 * 특수인증서사용여부
	 * 
	 * @param spltCerdUsgYn 특수인증서사용여부
	 */
	public void setSpltCerdUsgYn(String spltCerdUsgYn){
		this.spltCerdUsgYn= spltCerdUsgYn;
		this.setIsSet_spltCerdUsgYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_twochCrtfYn= false;
	protected final boolean isSet_twochCrtfYn(){
		return this.isSet_twochCrtfYn;
	}
	private void setIsSet_twochCrtfYn(boolean value){
		this.isSet_twochCrtfYn= value;
	}
	/**
	 * 2채널인증여부
	 */
	@XmlTransient
	public String getTwochCrtfYn(){
		return this.twochCrtfYn;
	}
	
	/**
	 * 2채널인증여부
	 * 
	 * @param twochCrtfYn 2채널인증여부
	 */
	public void setTwochCrtfYn(String twochCrtfYn){
		this.twochCrtfYn= twochCrtfYn;
		this.setIsSet_twochCrtfYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_otpCoCd= false;
	protected final boolean isSet_otpCoCd(){
		return this.isSet_otpCoCd;
	}
	private void setIsSet_otpCoCd(boolean value){
		this.isSet_otpCoCd= value;
	}
	/**
	 * OTP업체코드
	 */
	@XmlTransient
	public String getOtpCoCd(){
		return this.otpCoCd;
	}
	
	/**
	 * OTP업체코드
	 * 
	 * @param otpCoCd OTP업체코드
	 */
	public void setOtpCoCd(String otpCoCd){
		this.otpCoCd= otpCoCd;
		this.setIsSet_otpCoCd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_otpSrno= false;
	protected final boolean isSet_otpSrno(){
		return this.isSet_otpSrno;
	}
	private void setIsSet_otpSrno(boolean value){
		this.isSet_otpSrno= value;
	}
	/**
	 * OTP일련번호
	 */
	@XmlTransient
	public String getOtpSrno(){
		return this.otpSrno;
	}
	
	/**
	 * OTP일련번호
	 * 
	 * @param otpSrno OTP일련번호
	 */
	public void setOtpSrno(String otpSrno){
		this.otpSrno= otpSrno;
		this.setIsSet_otpSrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_tmHndpeDtOtpYn= false;
	protected final boolean isSet_tmHndpeDtOtpYn(){
		return this.isSet_tmHndpeDtOtpYn;
	}
	private void setIsSet_tmHndpeDtOtpYn(boolean value){
		this.isSet_tmHndpeDtOtpYn= value;
	}
	/**
	 * 시각장애인디지털OTP여부
	 */
	@XmlTransient
	public String getTmHndpeDtOtpYn(){
		return this.tmHndpeDtOtpYn;
	}
	
	/**
	 * 시각장애인디지털OTP여부
	 * 
	 * @param tmHndpeDtOtpYn 시각장애인디지털OTP여부
	 */
	public void setTmHndpeDtOtpYn(String tmHndpeDtOtpYn){
		this.tmHndpeDtOtpYn= tmHndpeDtOtpYn;
		this.setIsSet_tmHndpeDtOtpYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_wonCrtfUsgYn= false;
	protected final boolean isSet_wonCrtfUsgYn(){
		return this.isSet_wonCrtfUsgYn;
	}
	private void setIsSet_wonCrtfUsgYn(boolean value){
		this.isSet_wonCrtfUsgYn= value;
	}
	/**
	 * 원인증사용여부
	 */
	@XmlTransient
	public String getWonCrtfUsgYn(){
		return this.wonCrtfUsgYn;
	}
	
	/**
	 * 원인증사용여부
	 * 
	 * @param wonCrtfUsgYn 원인증사용여부
	 */
	public void setWonCrtfUsgYn(String wonCrtfUsgYn){
		this.wonCrtfUsgYn= wonCrtfUsgYn;
		this.setIsSet_wonCrtfUsgYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_esnsBnkgUsgYn= false;
	protected final boolean isSet_esnsBnkgUsgYn(){
		return this.isSet_esnsBnkgUsgYn;
	}
	private void setIsSet_esnsBnkgUsgYn(boolean value){
		this.isSet_esnsBnkgUsgYn= value;
	}
	/**
	 * 간편뱅킹사용여부
	 */
	@XmlTransient
	public String getEsnsBnkgUsgYn(){
		return this.esnsBnkgUsgYn;
	}
	
	/**
	 * 간편뱅킹사용여부
	 * 
	 * @param esnsBnkgUsgYn 간편뱅킹사용여부
	 */
	public void setEsnsBnkgUsgYn(String esnsBnkgUsgYn){
		this.esnsBnkgUsgYn= esnsBnkgUsgYn;
		this.setIsSet_esnsBnkgUsgYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_esnsTsRgsYn= false;
	protected final boolean isSet_esnsTsRgsYn(){
		return this.isSet_esnsTsRgsYn;
	}
	private void setIsSet_esnsTsRgsYn(boolean value){
		this.isSet_esnsTsRgsYn= value;
	}
	/**
	 * 간편이체등록여부
	 */
	@XmlTransient
	public String getEsnsTsRgsYn(){
		return this.esnsTsRgsYn;
	}
	
	/**
	 * 간편이체등록여부
	 * 
	 * @param esnsTsRgsYn 간편이체등록여부
	 */
	public void setEsnsTsRgsYn(String esnsTsRgsYn){
		this.esnsTsRgsYn= esnsTsRgsYn;
		this.setIsSet_esnsTsRgsYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_efLieAtntInfRgsCusYn= false;
	protected final boolean isSet_efLieAtntInfRgsCusYn(){
		return this.isSet_efLieAtntInfRgsCusYn;
	}
	private void setIsSet_efLieAtntInfRgsCusYn(boolean value){
		this.isSet_efLieAtntInfRgsCusYn= value;
	}
	/**
	 * 전자금융사기주의정보등록고객여부
	 */
	@XmlTransient
	public String getEfLieAtntInfRgsCusYn(){
		return this.efLieAtntInfRgsCusYn;
	}
	
	/**
	 * 전자금융사기주의정보등록고객여부
	 * 
	 * @param efLieAtntInfRgsCusYn 전자금융사기주의정보등록고객여부
	 */
	public void setEfLieAtntInfRgsCusYn(String efLieAtntInfRgsCusYn){
		this.efLieAtntInfRgsCusYn= efLieAtntInfRgsCusYn;
		this.setIsSet_efLieAtntInfRgsCusYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cusHpNo= false;
	protected final boolean isSet_cusHpNo(){
		return this.isSet_cusHpNo;
	}
	private void setIsSet_cusHpNo(boolean value){
		this.isSet_cusHpNo= value;
	}
	/**
	 * 고객핸드폰번호
	 */
	@XmlTransient
	public String getCusHpNo(){
		return this.cusHpNo;
	}
	
	/**
	 * 고객핸드폰번호
	 * 
	 * @param cusHpNo 고객핸드폰번호
	 */
	public void setCusHpNo(String cusHpNo){
		this.cusHpNo= cusHpNo;
		this.setIsSet_cusHpNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_fdtsTrnLimYn= false;
	protected final boolean isSet_fdtsTrnLimYn(){
		return this.isSet_fdtsTrnLimYn;
	}
	private void setIsSet_fdtsTrnLimYn(boolean value){
		this.isSet_fdtsTrnLimYn= value;
	}
	/**
	 * 자금이체거래제한여부
	 */
	@XmlTransient
	public String getFdtsTrnLimYn(){
		return this.fdtsTrnLimYn;
	}
	
	/**
	 * 자금이체거래제한여부
	 * 
	 * @param fdtsTrnLimYn 자금이체거래제한여부
	 */
	public void setFdtsTrnLimYn(String fdtsTrnLimYn){
		this.fdtsTrnLimYn= fdtsTrnLimYn;
		this.setIsSet_fdtsTrnLimYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_openBnkgJnngYn= false;
	protected final boolean isSet_openBnkgJnngYn(){
		return this.isSet_openBnkgJnngYn;
	}
	private void setIsSet_openBnkgJnngYn(boolean value){
		this.isSet_openBnkgJnngYn= value;
	}
	/**
	 * 오픈뱅킹가입여부
	 */
	@XmlTransient
	public String getOpenBnkgJnngYn(){
		return this.openBnkgJnngYn;
	}
	
	/**
	 * 오픈뱅킹가입여부
	 * 
	 * @param openBnkgJnngYn 오픈뱅킹가입여부
	 */
	public void setOpenBnkgJnngYn(String openBnkgJnngYn){
		this.openBnkgJnngYn= openBnkgJnngYn;
		this.setIsSet_openBnkgJnngYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mydtCusYn= false;
	protected final boolean isSet_mydtCusYn(){
		return this.isSet_mydtCusYn;
	}
	private void setIsSet_mydtCusYn(boolean value){
		this.isSet_mydtCusYn= value;
	}
	/**
	 * 마이데이터고객여부
	 */
	@XmlTransient
	public String getMydtCusYn(){
		return this.mydtCusYn;
	}
	
	/**
	 * 마이데이터고객여부
	 * 
	 * @param mydtCusYn 마이데이터고객여부
	 */
	public void setMydtCusYn(String mydtCusYn){
		this.mydtCusYn= mydtCusYn;
		this.setIsSet_mydtCusYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dethAtntInfRgsCusYn= false;
	protected final boolean isSet_dethAtntInfRgsCusYn(){
		return this.isSet_dethAtntInfRgsCusYn;
	}
	private void setIsSet_dethAtntInfRgsCusYn(boolean value){
		this.isSet_dethAtntInfRgsCusYn= value;
	}
	/**
	 * 사망주의정보등록고객여부
	 */
	@XmlTransient
	public String getDethAtntInfRgsCusYn(){
		return this.dethAtntInfRgsCusYn;
	}
	
	/**
	 * 사망주의정보등록고객여부
	 * 
	 * @param dethAtntInfRgsCusYn 사망주의정보등록고객여부
	 */
	public void setDethAtntInfRgsCusYn(String dethAtntInfRgsCusYn){
		this.dethAtntInfRgsCusYn= dethAtntInfRgsCusYn;
		this.setIsSet_dethAtntInfRgsCusYn(true);
	}
				
	@Override
	public MPBItcsnoInfInq_DTO clone(){
		try{
			MPBItcsnoInfInq_DTO object= (MPBItcsnoInfInq_DTO)super.clone();
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
		
		result= prime * result + ((this.itcsno==null)?0:this.itcsno.hashCode());
		result= prime * result + ((this.encyRbno==null)?0:this.encyRbno.hashCode());
		result= prime * result + ((this.ebnkUtzpeNo==null)?0:this.ebnkUtzpeNo.hashCode());
		result= prime * result + ((this.userDis==null)?0:this.userDis.hashCode());
		result= prime * result + ((this.ebnkInqUserYn==null)?0:this.ebnkInqUserYn.hashCode());
		result= prime * result + ((this.mdAgrYn==null)?0:this.mdAgrYn.hashCode());
		result= prime * result + ((this.tms1TsLmtAm==null)?0:this.tms1TsLmtAm.hashCode());
		result= prime * result + ((this.d1TsLmtAm==null)?0:this.d1TsLmtAm.hashCode());
		result= prime * result + ((this.scrtMensKd==null)?0:this.scrtMensKd.hashCode());
		result= prime * result + ((this.scrtMensMissYn==null)?0:this.scrtMensMissYn.hashCode());
		result= prime * result + ((this.spltCerdUsgYn==null)?0:this.spltCerdUsgYn.hashCode());
		result= prime * result + ((this.twochCrtfYn==null)?0:this.twochCrtfYn.hashCode());
		result= prime * result + ((this.otpCoCd==null)?0:this.otpCoCd.hashCode());
		result= prime * result + ((this.otpSrno==null)?0:this.otpSrno.hashCode());
		result= prime * result + ((this.tmHndpeDtOtpYn==null)?0:this.tmHndpeDtOtpYn.hashCode());
		result= prime * result + ((this.wonCrtfUsgYn==null)?0:this.wonCrtfUsgYn.hashCode());
		result= prime * result + ((this.esnsBnkgUsgYn==null)?0:this.esnsBnkgUsgYn.hashCode());
		result= prime * result + ((this.esnsTsRgsYn==null)?0:this.esnsTsRgsYn.hashCode());
		result= prime * result + ((this.efLieAtntInfRgsCusYn==null)?0:this.efLieAtntInfRgsCusYn.hashCode());
		result= prime * result + ((this.cusHpNo==null)?0:this.cusHpNo.hashCode());
		result= prime * result + ((this.fdtsTrnLimYn==null)?0:this.fdtsTrnLimYn.hashCode());
		result= prime * result + ((this.openBnkgJnngYn==null)?0:this.openBnkgJnngYn.hashCode());
		result= prime * result + ((this.mydtCusYn==null)?0:this.mydtCusYn.hashCode());
		result= prime * result + ((this.dethAtntInfRgsCusYn==null)?0:this.dethAtntInfRgsCusYn.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MPBItcsnoInfInq_DTO other= (MPBItcsnoInfInq_DTO)obj;
		{
			Object _itcsno= getItcsno();
			Object __itcsno= other.getItcsno();
			if ( _itcsno== null ) { if ( __itcsno!= null ) return false; }
			else if ( !_itcsno.equals(__itcsno) ) return false;
		}
		{
			Object _encyRbno= getEncyRbno();
			Object __encyRbno= other.getEncyRbno();
			if ( _encyRbno== null ) { if ( __encyRbno!= null ) return false; }
			else if ( !_encyRbno.equals(__encyRbno) ) return false;
		}
		{
			Object _ebnkUtzpeNo= getEbnkUtzpeNo();
			Object __ebnkUtzpeNo= other.getEbnkUtzpeNo();
			if ( _ebnkUtzpeNo== null ) { if ( __ebnkUtzpeNo!= null ) return false; }
			else if ( !_ebnkUtzpeNo.equals(__ebnkUtzpeNo) ) return false;
		}
		{
			Object _userDis= getUserDis();
			Object __userDis= other.getUserDis();
			if ( _userDis== null ) { if ( __userDis!= null ) return false; }
			else if ( !_userDis.equals(__userDis) ) return false;
		}
		{
			Object _ebnkInqUserYn= getEbnkInqUserYn();
			Object __ebnkInqUserYn= other.getEbnkInqUserYn();
			if ( _ebnkInqUserYn== null ) { if ( __ebnkInqUserYn!= null ) return false; }
			else if ( !_ebnkInqUserYn.equals(__ebnkInqUserYn) ) return false;
		}
		{
			Object _mdAgrYn= getMdAgrYn();
			Object __mdAgrYn= other.getMdAgrYn();
			if ( _mdAgrYn== null ) { if ( __mdAgrYn!= null ) return false; }
			else if ( !_mdAgrYn.equals(__mdAgrYn) ) return false;
		}
		{
			Object _tms1TsLmtAm= getTms1TsLmtAm();
			Object __tms1TsLmtAm= other.getTms1TsLmtAm();
			if ( _tms1TsLmtAm== null ) { if ( __tms1TsLmtAm!= null ) return false; }
			else if ( !_tms1TsLmtAm.equals(__tms1TsLmtAm) ) return false;
		}
		{
			Object _d1TsLmtAm= getD1TsLmtAm();
			Object __d1TsLmtAm= other.getD1TsLmtAm();
			if ( _d1TsLmtAm== null ) { if ( __d1TsLmtAm!= null ) return false; }
			else if ( !_d1TsLmtAm.equals(__d1TsLmtAm) ) return false;
		}
		{
			Object _scrtMensKd= getScrtMensKd();
			Object __scrtMensKd= other.getScrtMensKd();
			if ( _scrtMensKd== null ) { if ( __scrtMensKd!= null ) return false; }
			else if ( !_scrtMensKd.equals(__scrtMensKd) ) return false;
		}
		{
			Object _scrtMensMissYn= getScrtMensMissYn();
			Object __scrtMensMissYn= other.getScrtMensMissYn();
			if ( _scrtMensMissYn== null ) { if ( __scrtMensMissYn!= null ) return false; }
			else if ( !_scrtMensMissYn.equals(__scrtMensMissYn) ) return false;
		}
		{
			Object _spltCerdUsgYn= getSpltCerdUsgYn();
			Object __spltCerdUsgYn= other.getSpltCerdUsgYn();
			if ( _spltCerdUsgYn== null ) { if ( __spltCerdUsgYn!= null ) return false; }
			else if ( !_spltCerdUsgYn.equals(__spltCerdUsgYn) ) return false;
		}
		{
			Object _twochCrtfYn= getTwochCrtfYn();
			Object __twochCrtfYn= other.getTwochCrtfYn();
			if ( _twochCrtfYn== null ) { if ( __twochCrtfYn!= null ) return false; }
			else if ( !_twochCrtfYn.equals(__twochCrtfYn) ) return false;
		}
		{
			Object _otpCoCd= getOtpCoCd();
			Object __otpCoCd= other.getOtpCoCd();
			if ( _otpCoCd== null ) { if ( __otpCoCd!= null ) return false; }
			else if ( !_otpCoCd.equals(__otpCoCd) ) return false;
		}
		{
			Object _otpSrno= getOtpSrno();
			Object __otpSrno= other.getOtpSrno();
			if ( _otpSrno== null ) { if ( __otpSrno!= null ) return false; }
			else if ( !_otpSrno.equals(__otpSrno) ) return false;
		}
		{
			Object _tmHndpeDtOtpYn= getTmHndpeDtOtpYn();
			Object __tmHndpeDtOtpYn= other.getTmHndpeDtOtpYn();
			if ( _tmHndpeDtOtpYn== null ) { if ( __tmHndpeDtOtpYn!= null ) return false; }
			else if ( !_tmHndpeDtOtpYn.equals(__tmHndpeDtOtpYn) ) return false;
		}
		{
			Object _wonCrtfUsgYn= getWonCrtfUsgYn();
			Object __wonCrtfUsgYn= other.getWonCrtfUsgYn();
			if ( _wonCrtfUsgYn== null ) { if ( __wonCrtfUsgYn!= null ) return false; }
			else if ( !_wonCrtfUsgYn.equals(__wonCrtfUsgYn) ) return false;
		}
		{
			Object _esnsBnkgUsgYn= getEsnsBnkgUsgYn();
			Object __esnsBnkgUsgYn= other.getEsnsBnkgUsgYn();
			if ( _esnsBnkgUsgYn== null ) { if ( __esnsBnkgUsgYn!= null ) return false; }
			else if ( !_esnsBnkgUsgYn.equals(__esnsBnkgUsgYn) ) return false;
		}
		{
			Object _esnsTsRgsYn= getEsnsTsRgsYn();
			Object __esnsTsRgsYn= other.getEsnsTsRgsYn();
			if ( _esnsTsRgsYn== null ) { if ( __esnsTsRgsYn!= null ) return false; }
			else if ( !_esnsTsRgsYn.equals(__esnsTsRgsYn) ) return false;
		}
		{
			Object _efLieAtntInfRgsCusYn= getEfLieAtntInfRgsCusYn();
			Object __efLieAtntInfRgsCusYn= other.getEfLieAtntInfRgsCusYn();
			if ( _efLieAtntInfRgsCusYn== null ) { if ( __efLieAtntInfRgsCusYn!= null ) return false; }
			else if ( !_efLieAtntInfRgsCusYn.equals(__efLieAtntInfRgsCusYn) ) return false;
		}
		{
			Object _cusHpNo= getCusHpNo();
			Object __cusHpNo= other.getCusHpNo();
			if ( _cusHpNo== null ) { if ( __cusHpNo!= null ) return false; }
			else if ( !_cusHpNo.equals(__cusHpNo) ) return false;
		}
		{
			Object _fdtsTrnLimYn= getFdtsTrnLimYn();
			Object __fdtsTrnLimYn= other.getFdtsTrnLimYn();
			if ( _fdtsTrnLimYn== null ) { if ( __fdtsTrnLimYn!= null ) return false; }
			else if ( !_fdtsTrnLimYn.equals(__fdtsTrnLimYn) ) return false;
		}
		{
			Object _openBnkgJnngYn= getOpenBnkgJnngYn();
			Object __openBnkgJnngYn= other.getOpenBnkgJnngYn();
			if ( _openBnkgJnngYn== null ) { if ( __openBnkgJnngYn!= null ) return false; }
			else if ( !_openBnkgJnngYn.equals(__openBnkgJnngYn) ) return false;
		}
		{
			Object _mydtCusYn= getMydtCusYn();
			Object __mydtCusYn= other.getMydtCusYn();
			if ( _mydtCusYn== null ) { if ( __mydtCusYn!= null ) return false; }
			else if ( !_mydtCusYn.equals(__mydtCusYn) ) return false;
		}
		{
			Object _dethAtntInfRgsCusYn= getDethAtntInfRgsCusYn();
			Object __dethAtntInfRgsCusYn= other.getDethAtntInfRgsCusYn();
			if ( _dethAtntInfRgsCusYn== null ) { if ( __dethAtntInfRgsCusYn!= null ) return false; }
			else if ( !_dethAtntInfRgsCusYn.equals(__dethAtntInfRgsCusYn) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MPBItcsnoInfInq_DTO.class.getName()).append(":\n");
		sb.append("\titcsno: ");
		sb.append(itcsno==null?"null":getItcsno());
		sb.append("\n");
		sb.append("\tencyRbno: ");
		sb.append(encyRbno==null?"null":getEncyRbno());
		sb.append("\n");
		sb.append("\tebnkUtzpeNo: ");
		sb.append(ebnkUtzpeNo==null?"null":getEbnkUtzpeNo());
		sb.append("\n");
		sb.append("\tuserDis: ");
		sb.append(userDis==null?"null":getUserDis());
		sb.append("\n");
		sb.append("\tebnkInqUserYn: ");
		sb.append(ebnkInqUserYn==null?"null":getEbnkInqUserYn());
		sb.append("\n");
		sb.append("\tmdAgrYn: ");
		sb.append(mdAgrYn==null?"null":getMdAgrYn());
		sb.append("\n");
		sb.append("\ttms1TsLmtAm: ");
		sb.append(tms1TsLmtAm==null?"null":getTms1TsLmtAm());
		sb.append("\n");
		sb.append("\td1TsLmtAm: ");
		sb.append(d1TsLmtAm==null?"null":getD1TsLmtAm());
		sb.append("\n");
		sb.append("\tscrtMensKd: ");
		sb.append(scrtMensKd==null?"null":getScrtMensKd());
		sb.append("\n");
		sb.append("\tscrtMensMissYn: ");
		sb.append(scrtMensMissYn==null?"null":getScrtMensMissYn());
		sb.append("\n");
		sb.append("\tspltCerdUsgYn: ");
		sb.append(spltCerdUsgYn==null?"null":getSpltCerdUsgYn());
		sb.append("\n");
		sb.append("\ttwochCrtfYn: ");
		sb.append(twochCrtfYn==null?"null":getTwochCrtfYn());
		sb.append("\n");
		sb.append("\totpCoCd: ");
		sb.append(otpCoCd==null?"null":getOtpCoCd());
		sb.append("\n");
		sb.append("\totpSrno: ");
		sb.append(otpSrno==null?"null":getOtpSrno());
		sb.append("\n");
		sb.append("\ttmHndpeDtOtpYn: ");
		sb.append(tmHndpeDtOtpYn==null?"null":getTmHndpeDtOtpYn());
		sb.append("\n");
		sb.append("\twonCrtfUsgYn: ");
		sb.append(wonCrtfUsgYn==null?"null":getWonCrtfUsgYn());
		sb.append("\n");
		sb.append("\tesnsBnkgUsgYn: ");
		sb.append(esnsBnkgUsgYn==null?"null":getEsnsBnkgUsgYn());
		sb.append("\n");
		sb.append("\tesnsTsRgsYn: ");
		sb.append(esnsTsRgsYn==null?"null":getEsnsTsRgsYn());
		sb.append("\n");
		sb.append("\tefLieAtntInfRgsCusYn: ");
		sb.append(efLieAtntInfRgsCusYn==null?"null":getEfLieAtntInfRgsCusYn());
		sb.append("\n");
		sb.append("\tcusHpNo: ");
		sb.append(cusHpNo==null?"null":getCusHpNo());
		sb.append("\n");
		sb.append("\tfdtsTrnLimYn: ");
		sb.append(fdtsTrnLimYn==null?"null":getFdtsTrnLimYn());
		sb.append("\n");
		sb.append("\topenBnkgJnngYn: ");
		sb.append(openBnkgJnngYn==null?"null":getOpenBnkgJnngYn());
		sb.append("\n");
		sb.append("\tmydtCusYn: ");
		sb.append(mydtCusYn==null?"null":getMydtCusYn());
		sb.append("\n");
		sb.append("\tdethAtntInfRgsCusYn: ");
		sb.append(dethAtntInfRgsCusYn==null?"null":getDethAtntInfRgsCusYn());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 11; /* itcsno */
		messageLen+= 32; /* encyRbno */
		messageLen+= 13; /* ebnkUtzpeNo */
		messageLen+= 1; /* userDis */
		messageLen+= 1; /* ebnkInqUserYn */
		messageLen+= 1; /* mdAgrYn */
		messageLen+= 18; /* tms1TsLmtAm */
		messageLen+= 18; /* d1TsLmtAm */
		messageLen+= 1; /* scrtMensKd */
		messageLen+= 1; /* scrtMensMissYn */
		messageLen+= 1; /* spltCerdUsgYn */
		messageLen+= 1; /* twochCrtfYn */
		messageLen+= 3; /* otpCoCd */
		messageLen+= 12; /* otpSrno */
		messageLen+= 1; /* tmHndpeDtOtpYn */
		messageLen+= 1; /* wonCrtfUsgYn */
		messageLen+= 1; /* esnsBnkgUsgYn */
		messageLen+= 1; /* esnsTsRgsYn */
		messageLen+= 1; /* efLieAtntInfRgsCusYn */
		messageLen+= 14; /* cusHpNo */
		messageLen+= 1; /* fdtsTrnLimYn */
		messageLen+= 1; /* openBnkgJnngYn */
		messageLen+= 1; /* mydtCusYn */
		messageLen+= 1; /* dethAtntInfRgsCusYn */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("itcsno");
		list.add("encyRbno");
		list.add("ebnkUtzpeNo");
		list.add("userDis");
		list.add("ebnkInqUserYn");
		list.add("mdAgrYn");
		list.add("tms1TsLmtAm");
		list.add("d1TsLmtAm");
		list.add("scrtMensKd");
		list.add("scrtMensMissYn");
		list.add("spltCerdUsgYn");
		list.add("twochCrtfYn");
		list.add("otpCoCd");
		list.add("otpSrno");
		list.add("tmHndpeDtOtpYn");
		list.add("wonCrtfUsgYn");
		list.add("esnsBnkgUsgYn");
		list.add("esnsTsRgsYn");
		list.add("efLieAtntInfRgsCusYn");
		list.add("cusHpNo");
		list.add("fdtsTrnLimYn");
		list.add("openBnkgJnngYn");
		list.add("mydtCusYn");
		list.add("dethAtntInfRgsCusYn");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("itcsno", get("itcsno"));
		map.put("encyRbno", get("encyRbno"));
		map.put("ebnkUtzpeNo", get("ebnkUtzpeNo"));
		map.put("userDis", get("userDis"));
		map.put("ebnkInqUserYn", get("ebnkInqUserYn"));
		map.put("mdAgrYn", get("mdAgrYn"));
		map.put("tms1TsLmtAm", get("tms1TsLmtAm"));
		map.put("d1TsLmtAm", get("d1TsLmtAm"));
		map.put("scrtMensKd", get("scrtMensKd"));
		map.put("scrtMensMissYn", get("scrtMensMissYn"));
		map.put("spltCerdUsgYn", get("spltCerdUsgYn"));
		map.put("twochCrtfYn", get("twochCrtfYn"));
		map.put("otpCoCd", get("otpCoCd"));
		map.put("otpSrno", get("otpSrno"));
		map.put("tmHndpeDtOtpYn", get("tmHndpeDtOtpYn"));
		map.put("wonCrtfUsgYn", get("wonCrtfUsgYn"));
		map.put("esnsBnkgUsgYn", get("esnsBnkgUsgYn"));
		map.put("esnsTsRgsYn", get("esnsTsRgsYn"));
		map.put("efLieAtntInfRgsCusYn", get("efLieAtntInfRgsCusYn"));
		map.put("cusHpNo", get("cusHpNo"));
		map.put("fdtsTrnLimYn", get("fdtsTrnLimYn"));
		map.put("openBnkgJnngYn", get("openBnkgJnngYn"));
		map.put("mydtCusYn", get("mydtCusYn"));
		map.put("dethAtntInfRgsCusYn", get("dethAtntInfRgsCusYn"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -1178714660:/* itcsno */
			return getItcsno();
		case 1719914352:/* encyRbno */
			return getEncyRbno();
		case -1070809513:/* ebnkUtzpeNo */
			return getEbnkUtzpeNo();
		case -147158845:/* userDis */
			return getUserDis();
		case -65066670:/* ebnkInqUserYn */
			return getEbnkInqUserYn();
		case 879778282:/* mdAgrYn */
			return getMdAgrYn();
		case 468230409:/* tms1TsLmtAm */
			return getTms1TsLmtAm();
		case -251660717:/* d1TsLmtAm */
			return getD1TsLmtAm();
		case -684344632:/* scrtMensKd */
			return getScrtMensKd();
		case -2135867616:/* scrtMensMissYn */
			return getScrtMensMissYn();
		case 203773349:/* spltCerdUsgYn */
			return getSpltCerdUsgYn();
		case 1910411559:/* twochCrtfYn */
			return getTwochCrtfYn();
		case -1139785800:/* otpCoCd */
			return getOtpCoCd();
		case -1139304917:/* otpSrno */
			return getOtpSrno();
		case 681932790:/* tmHndpeDtOtpYn */
			return getTmHndpeDtOtpYn();
		case -708849689:/* wonCrtfUsgYn */
			return getWonCrtfUsgYn();
		case -217518333:/* esnsBnkgUsgYn */
			return getEsnsBnkgUsgYn();
		case -12319007:/* esnsTsRgsYn */
			return getEsnsTsRgsYn();
		case -1120553511:/* efLieAtntInfRgsCusYn */
			return getEfLieAtntInfRgsCusYn();
		case 1126621898:/* cusHpNo */
			return getCusHpNo();
		case -358522670:/* fdtsTrnLimYn */
			return getFdtsTrnLimYn();
		case 880217252:/* openBnkgJnngYn */
			return getOpenBnkgJnngYn();
		case -1369843878:/* mydtCusYn */
			return getMydtCusYn();
		case 222861195:/* dethAtntInfRgsCusYn */
			return getDethAtntInfRgsCusYn();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -1178714660:/* itcsno */
			setItcsno((String)value);
			break;
		case 1719914352:/* encyRbno */
			setEncyRbno((String)value);
			break;
		case -1070809513:/* ebnkUtzpeNo */
			setEbnkUtzpeNo((String)value);
			break;
		case -147158845:/* userDis */
			setUserDis((String)value);
			break;
		case -65066670:/* ebnkInqUserYn */
			setEbnkInqUserYn((String)value);
			break;
		case 879778282:/* mdAgrYn */
			setMdAgrYn((String)value);
			break;
		case 468230409:/* tms1TsLmtAm */
			if ( value instanceof String ){
				setTms1TsLmtAm((String)value);
			}
			else if ( value instanceof Double ){
				setTms1TsLmtAm((Double)value);
			}
			else if ( value instanceof Long ){
				setTms1TsLmtAm((Long)value);
			}
			else{
				setTms1TsLmtAm((BigDecimal)value);
			}
			break;
		case -251660717:/* d1TsLmtAm */
			if ( value instanceof String ){
				setD1TsLmtAm((String)value);
			}
			else if ( value instanceof Double ){
				setD1TsLmtAm((Double)value);
			}
			else if ( value instanceof Long ){
				setD1TsLmtAm((Long)value);
			}
			else{
				setD1TsLmtAm((BigDecimal)value);
			}
			break;
		case -684344632:/* scrtMensKd */
			setScrtMensKd((String)value);
			break;
		case -2135867616:/* scrtMensMissYn */
			setScrtMensMissYn((String)value);
			break;
		case 203773349:/* spltCerdUsgYn */
			setSpltCerdUsgYn((String)value);
			break;
		case 1910411559:/* twochCrtfYn */
			setTwochCrtfYn((String)value);
			break;
		case -1139785800:/* otpCoCd */
			setOtpCoCd((String)value);
			break;
		case -1139304917:/* otpSrno */
			setOtpSrno((String)value);
			break;
		case 681932790:/* tmHndpeDtOtpYn */
			setTmHndpeDtOtpYn((String)value);
			break;
		case -708849689:/* wonCrtfUsgYn */
			setWonCrtfUsgYn((String)value);
			break;
		case -217518333:/* esnsBnkgUsgYn */
			setEsnsBnkgUsgYn((String)value);
			break;
		case -12319007:/* esnsTsRgsYn */
			setEsnsTsRgsYn((String)value);
			break;
		case -1120553511:/* efLieAtntInfRgsCusYn */
			setEfLieAtntInfRgsCusYn((String)value);
			break;
		case 1126621898:/* cusHpNo */
			setCusHpNo((String)value);
			break;
		case -358522670:/* fdtsTrnLimYn */
			setFdtsTrnLimYn((String)value);
			break;
		case 880217252:/* openBnkgJnngYn */
			setOpenBnkgJnngYn((String)value);
			break;
		case -1369843878:/* mydtCusYn */
			setMydtCusYn((String)value);
			break;
		case 222861195:/* dethAtntInfRgsCusYn */
			setDethAtntInfRgsCusYn((String)value);
			break;
		default:
			break;
		}
	}
	
}
