/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.mpb.ctr.dto;

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
	"tobkDscd", "openBnkgBkcd", "openBnkgAcno", "openBnkgActDscd", "openBnkgActPrdNm", "openBnkgByactNm", "openBnkgInqYn", "openBnkgWdrYn", "reqCusFnchUtzNo", "acnmCnfVrtgtYn", "indvSavBkcd", "indvSavBkNm", "dpacNo", "cusUsgBkwAcno", "dpacStcd"
	, "psklActYn", "dpacCtBal", "pdcd", "prdKorlNm", "prdKorlAbrNm", "ntrnnActYn", "wdrActYn", "wdrActUnitRcvDgnYn", "pwnoErrTcn", "synpbPdcd", "payAvlBal", "pbokSplitJnngYn", "pbokSplitSpceCn", "pbokSplitRgsDt", "pbokSplitJnngAvlYn"
	, "metPbokJnngYn", "metRgsDt", "metMngNo", "metPbokJnngAvlYn"
}, name="MPBMbhActInfGrid")
@XmlRootElement(name="MPBMbhActInfGrid")
@BxmCategory(logicalName="회원.계좌.정보.그리드.컨트롤러.출력.IO", description="") 
public class MPBMbhActInfGrid implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -24151196L;
	
	
	
	/**
	 * 당타행구분코드
	 */
	@ApiModelProperty(
		name = "tobkDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("tobkDscd")
	@BxmOmm_Field(length=1, decimal=0, description="당타행구분코드", align="left", fill="")
	private String tobkDscd= "";
	
	
	/**
	 * 오픈뱅킹은행코드
	 */
	@ApiModelProperty(
		name = "openBnkgBkcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("openBnkgBkcd")
	@BxmOmm_Field(length=3, decimal=0, description="오픈뱅킹은행코드", align="left", fill="")
	private String openBnkgBkcd= "";
	
	
	/**
	 * 오픈뱅킹계좌번호
	 */
	@ApiModelProperty(
		name = "openBnkgAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("openBnkgAcno")
	@BxmOmm_Field(length=20, decimal=0, description="오픈뱅킹계좌번호", align="left", fill="")
	private String openBnkgAcno= "";
	
	
	/**
	 * 오픈뱅킹계좌구분코드
	 */
	@ApiModelProperty(
		name = "openBnkgActDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("openBnkgActDscd")
	@BxmOmm_Field(length=1, decimal=0, description="오픈뱅킹계좌구분코드", align="left", fill="")
	private String openBnkgActDscd= "";
	
	
	/**
	 * 오픈뱅킹계좌상품명
	 */
	@ApiModelProperty(
		name = "openBnkgActPrdNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("openBnkgActPrdNm")
	@BxmOmm_Field(length=40, decimal=0, description="오픈뱅킹계좌상품명", align="left", fill="")
	private String openBnkgActPrdNm= "";
	
	
	/**
	 * 오픈뱅킹계좌별명
	 */
	@ApiModelProperty(
		name = "openBnkgByactNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("openBnkgByactNm")
	@BxmOmm_Field(length=20, decimal=0, description="오픈뱅킹계좌별명", align="left", fill="")
	private String openBnkgByactNm= "";
	
	
	/**
	 * 오픈뱅킹조회여부
	 */
	@ApiModelProperty(
		name = "openBnkgInqYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("openBnkgInqYn")
	@BxmOmm_Field(length=1, decimal=0, description="오픈뱅킹조회여부", align="left", fill="")
	private String openBnkgInqYn= "";
	
	
	/**
	 * 오픈뱅킹출금여부
	 */
	@ApiModelProperty(
		name = "openBnkgWdrYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("openBnkgWdrYn")
	@BxmOmm_Field(length=1, decimal=0, description="오픈뱅킹출금여부", align="left", fill="")
	private String openBnkgWdrYn= "";
	
	
	/**
	 * 요청고객핀테크이용번호
	 */
	@ApiModelProperty(
		name = "reqCusFnchUtzNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("reqCusFnchUtzNo")
	@BxmOmm_Field(length=24, decimal=0, description="요청고객핀테크이용번호", align="left", fill="")
	private String reqCusFnchUtzNo= "";
	
	
	/**
	 * 실명확인검증대상여부
	 */
	@ApiModelProperty(
		name = "acnmCnfVrtgtYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("acnmCnfVrtgtYn")
	@BxmOmm_Field(length=1, decimal=0, description="실명확인검증대상여부", align="left", fill="")
	private String acnmCnfVrtgtYn= "";
	
	
	/**
	 * 개별저축은행코드
	 */
	@ApiModelProperty(
		name = "indvSavBkcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("indvSavBkcd")
	@BxmOmm_Field(length=3, decimal=0, description="개별저축은행코드", align="left", fill="")
	private String indvSavBkcd= "";
	
	
	/**
	 * 개별저축은행명
	 */
	@ApiModelProperty(
		name = "indvSavBkNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("indvSavBkNm")
	@BxmOmm_Field(length=20, decimal=0, description="개별저축은행명", align="left", fill="")
	private String indvSavBkNm= "";
	
	
	/**
	 * 수신계좌번호
	 */
	@ApiModelProperty(
		name = "dpacNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dpacNo")
	@BxmOmm_Field(length=13, decimal=0, description="수신계좌번호", align="left", fill="")
	private String dpacNo= "";
	
	
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
	 * 수신계좌상태코드
	 */
	@ApiModelProperty(
		name = "dpacStcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dpacStcd")
	@BxmOmm_Field(length=2, decimal=0, description="수신계좌상태코드", align="left", fill="")
	private String dpacStcd= "";
	
	
	/**
	 * 통장대출계좌여부
	 */
	@ApiModelProperty(
		name = "psklActYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("psklActYn")
	@BxmOmm_Field(length=1, decimal=0, description="통장대출계좌여부", align="left", fill="")
	private String psklActYn= "";
	
	
	/**
	 * 수신계좌현재잔액
	 */
	@ApiModelProperty(
		name = "dpacCtBal"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("dpacCtBal")
	@BxmOmm_Field(length=19, decimal=3, description="수신계좌현재잔액", align="right", fill="0")
	private BigDecimal dpacCtBal= new BigDecimal("0");
	
	
	/**
	 * 상품코드
	 */
	@ApiModelProperty(
		name = "pdcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("pdcd")
	@BxmOmm_Field(length=13, decimal=0, description="상품코드", align="left", fill="")
	private String pdcd= "";
	
	
	/**
	 * 상품한글명
	 */
	@ApiModelProperty(
		name = "prdKorlNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("prdKorlNm")
	@BxmOmm_Field(length=100, decimal=0, description="상품한글명", align="left", fill="")
	private String prdKorlNm= "";
	
	
	/**
	 * 상품한글단축명
	 */
	@ApiModelProperty(
		name = "prdKorlAbrNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("prdKorlAbrNm")
	@BxmOmm_Field(length=50, decimal=0, description="상품한글단축명", align="left", fill="")
	private String prdKorlAbrNm= "";
	
	
	/**
	 * 무거래계좌여부
	 */
	@ApiModelProperty(
		name = "ntrnnActYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ntrnnActYn")
	@BxmOmm_Field(length=1, decimal=0, description="무거래계좌여부", align="left", fill="")
	private String ntrnnActYn= "";
	
	
	/**
	 * 출금계좌여부
	 */
	@ApiModelProperty(
		name = "wdrActYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("wdrActYn")
	@BxmOmm_Field(length=1, decimal=0, description="출금계좌여부", align="left", fill="")
	private String wdrActYn= "";
	
	
	/**
	 * 출금계좌단위입금지정여부
	 */
	@ApiModelProperty(
		name = "wdrActUnitRcvDgnYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("wdrActUnitRcvDgnYn")
	@BxmOmm_Field(length=1, decimal=0, description="출금계좌단위입금지정여부", align="left", fill="")
	private String wdrActUnitRcvDgnYn= "";
	
	
	/**
	 * 비밀번호오류횟수
	 */
	@ApiModelProperty(
		name = "pwnoErrTcn"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("pwnoErrTcn")
	@BxmOmm_Field(length=3, decimal=0, description="비밀번호오류횟수", align="right", fill="0")
	private Integer pwnoErrTcn= 0;
	
	
	/**
	 * 종합통장상품코드
	 */
	@ApiModelProperty(
		name = "synpbPdcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("synpbPdcd")
	@BxmOmm_Field(length=13, decimal=0, description="종합통장상품코드", align="left", fill="")
	private String synpbPdcd= "";
	
	
	/**
	 * 지급가능잔액
	 */
	@ApiModelProperty(
		name = "payAvlBal"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("payAvlBal")
	@BxmOmm_Field(length=19, decimal=3, description="지급가능잔액", align="right", fill="0")
	private BigDecimal payAvlBal= new BigDecimal("0");
	
	
	/**
	 * 통장쪼개기가입여부
	 */
	@ApiModelProperty(
		name = "pbokSplitJnngYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("pbokSplitJnngYn")
	@BxmOmm_Field(length=1, decimal=0, description="통장쪼개기가입여부", align="left", fill="")
	private String pbokSplitJnngYn= "";
	
	
	/**
	 * 통장쪼개기공간수
	 */
	@ApiModelProperty(
		name = "pbokSplitSpceCn"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("pbokSplitSpceCn")
	@BxmOmm_Field(length=3, decimal=0, description="통장쪼개기공간수", align="right", fill="0")
	private Integer pbokSplitSpceCn= 0;
	
	
	/**
	 * 통장쪼개기등록일자
	 */
	@ApiModelProperty(
		name = "pbokSplitRgsDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("pbokSplitRgsDt")
	@BxmOmm_Field(length=8, decimal=0, description="통장쪼개기등록일자", align="left", fill="")
	private String pbokSplitRgsDt= "";
	
	
	/**
	 * 통장쪼개기가입가능여부
	 */
	@ApiModelProperty(
		name = "pbokSplitJnngAvlYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("pbokSplitJnngAvlYn")
	@BxmOmm_Field(length=1, decimal=0, description="통장쪼개기가입가능여부", align="left", fill="")
	private String pbokSplitJnngAvlYn= "";
	
	
	/**
	 * 모임통장가입여부
	 */
	@ApiModelProperty(
		name = "metPbokJnngYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metPbokJnngYn")
	@BxmOmm_Field(length=1, decimal=0, description="모임통장가입여부", align="left", fill="")
	private String metPbokJnngYn= "";
	
	
	/**
	 * 모임등록일자
	 */
	@ApiModelProperty(
		name = "metRgsDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metRgsDt")
	@BxmOmm_Field(length=8, decimal=0, description="모임등록일자", align="left", fill="")
	private String metRgsDt= "";
	
	
	/**
	 * 모임관리번호
	 */
	@ApiModelProperty(
		name = "metMngNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metMngNo")
	@BxmOmm_Field(length=9, decimal=0, description="모임관리번호", align="left", fill="")
	private String metMngNo= "";
	
	
	/**
	 * 모임통장가입가능여부
	 */
	@ApiModelProperty(
		name = "metPbokJnngAvlYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metPbokJnngAvlYn")
	@BxmOmm_Field(length=1, decimal=0, description="모임통장가입가능여부", align="left", fill="")
	private String metPbokJnngAvlYn= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_tobkDscd= false;
	protected final boolean isSet_tobkDscd(){
		return this.isSet_tobkDscd;
	}
	private void setIsSet_tobkDscd(boolean value){
		this.isSet_tobkDscd= value;
	}
	/**
	 * 당타행구분코드
	 */
	@XmlTransient
	public String getTobkDscd(){
		return this.tobkDscd;
	}
	
	/**
	 * 당타행구분코드
	 * 
	 * @param tobkDscd 당타행구분코드
	 */
	public void setTobkDscd(String tobkDscd){
		this.tobkDscd= tobkDscd;
		this.setIsSet_tobkDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_openBnkgBkcd= false;
	protected final boolean isSet_openBnkgBkcd(){
		return this.isSet_openBnkgBkcd;
	}
	private void setIsSet_openBnkgBkcd(boolean value){
		this.isSet_openBnkgBkcd= value;
	}
	/**
	 * 오픈뱅킹은행코드
	 */
	@XmlTransient
	public String getOpenBnkgBkcd(){
		return this.openBnkgBkcd;
	}
	
	/**
	 * 오픈뱅킹은행코드
	 * 
	 * @param openBnkgBkcd 오픈뱅킹은행코드
	 */
	public void setOpenBnkgBkcd(String openBnkgBkcd){
		this.openBnkgBkcd= openBnkgBkcd;
		this.setIsSet_openBnkgBkcd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_openBnkgAcno= false;
	protected final boolean isSet_openBnkgAcno(){
		return this.isSet_openBnkgAcno;
	}
	private void setIsSet_openBnkgAcno(boolean value){
		this.isSet_openBnkgAcno= value;
	}
	/**
	 * 오픈뱅킹계좌번호
	 */
	@XmlTransient
	public String getOpenBnkgAcno(){
		return this.openBnkgAcno;
	}
	
	/**
	 * 오픈뱅킹계좌번호
	 * 
	 * @param openBnkgAcno 오픈뱅킹계좌번호
	 */
	public void setOpenBnkgAcno(String openBnkgAcno){
		this.openBnkgAcno= openBnkgAcno;
		this.setIsSet_openBnkgAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_openBnkgActDscd= false;
	protected final boolean isSet_openBnkgActDscd(){
		return this.isSet_openBnkgActDscd;
	}
	private void setIsSet_openBnkgActDscd(boolean value){
		this.isSet_openBnkgActDscd= value;
	}
	/**
	 * 오픈뱅킹계좌구분코드
	 */
	@XmlTransient
	public String getOpenBnkgActDscd(){
		return this.openBnkgActDscd;
	}
	
	/**
	 * 오픈뱅킹계좌구분코드
	 * 
	 * @param openBnkgActDscd 오픈뱅킹계좌구분코드
	 */
	public void setOpenBnkgActDscd(String openBnkgActDscd){
		this.openBnkgActDscd= openBnkgActDscd;
		this.setIsSet_openBnkgActDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_openBnkgActPrdNm= false;
	protected final boolean isSet_openBnkgActPrdNm(){
		return this.isSet_openBnkgActPrdNm;
	}
	private void setIsSet_openBnkgActPrdNm(boolean value){
		this.isSet_openBnkgActPrdNm= value;
	}
	/**
	 * 오픈뱅킹계좌상품명
	 */
	@XmlTransient
	public String getOpenBnkgActPrdNm(){
		return this.openBnkgActPrdNm;
	}
	
	/**
	 * 오픈뱅킹계좌상품명
	 * 
	 * @param openBnkgActPrdNm 오픈뱅킹계좌상품명
	 */
	public void setOpenBnkgActPrdNm(String openBnkgActPrdNm){
		this.openBnkgActPrdNm= openBnkgActPrdNm;
		this.setIsSet_openBnkgActPrdNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_openBnkgByactNm= false;
	protected final boolean isSet_openBnkgByactNm(){
		return this.isSet_openBnkgByactNm;
	}
	private void setIsSet_openBnkgByactNm(boolean value){
		this.isSet_openBnkgByactNm= value;
	}
	/**
	 * 오픈뱅킹계좌별명
	 */
	@XmlTransient
	public String getOpenBnkgByactNm(){
		return this.openBnkgByactNm;
	}
	
	/**
	 * 오픈뱅킹계좌별명
	 * 
	 * @param openBnkgByactNm 오픈뱅킹계좌별명
	 */
	public void setOpenBnkgByactNm(String openBnkgByactNm){
		this.openBnkgByactNm= openBnkgByactNm;
		this.setIsSet_openBnkgByactNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_openBnkgInqYn= false;
	protected final boolean isSet_openBnkgInqYn(){
		return this.isSet_openBnkgInqYn;
	}
	private void setIsSet_openBnkgInqYn(boolean value){
		this.isSet_openBnkgInqYn= value;
	}
	/**
	 * 오픈뱅킹조회여부
	 */
	@XmlTransient
	public String getOpenBnkgInqYn(){
		return this.openBnkgInqYn;
	}
	
	/**
	 * 오픈뱅킹조회여부
	 * 
	 * @param openBnkgInqYn 오픈뱅킹조회여부
	 */
	public void setOpenBnkgInqYn(String openBnkgInqYn){
		this.openBnkgInqYn= openBnkgInqYn;
		this.setIsSet_openBnkgInqYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_openBnkgWdrYn= false;
	protected final boolean isSet_openBnkgWdrYn(){
		return this.isSet_openBnkgWdrYn;
	}
	private void setIsSet_openBnkgWdrYn(boolean value){
		this.isSet_openBnkgWdrYn= value;
	}
	/**
	 * 오픈뱅킹출금여부
	 */
	@XmlTransient
	public String getOpenBnkgWdrYn(){
		return this.openBnkgWdrYn;
	}
	
	/**
	 * 오픈뱅킹출금여부
	 * 
	 * @param openBnkgWdrYn 오픈뱅킹출금여부
	 */
	public void setOpenBnkgWdrYn(String openBnkgWdrYn){
		this.openBnkgWdrYn= openBnkgWdrYn;
		this.setIsSet_openBnkgWdrYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_reqCusFnchUtzNo= false;
	protected final boolean isSet_reqCusFnchUtzNo(){
		return this.isSet_reqCusFnchUtzNo;
	}
	private void setIsSet_reqCusFnchUtzNo(boolean value){
		this.isSet_reqCusFnchUtzNo= value;
	}
	/**
	 * 요청고객핀테크이용번호
	 */
	@XmlTransient
	public String getReqCusFnchUtzNo(){
		return this.reqCusFnchUtzNo;
	}
	
	/**
	 * 요청고객핀테크이용번호
	 * 
	 * @param reqCusFnchUtzNo 요청고객핀테크이용번호
	 */
	public void setReqCusFnchUtzNo(String reqCusFnchUtzNo){
		this.reqCusFnchUtzNo= reqCusFnchUtzNo;
		this.setIsSet_reqCusFnchUtzNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_acnmCnfVrtgtYn= false;
	protected final boolean isSet_acnmCnfVrtgtYn(){
		return this.isSet_acnmCnfVrtgtYn;
	}
	private void setIsSet_acnmCnfVrtgtYn(boolean value){
		this.isSet_acnmCnfVrtgtYn= value;
	}
	/**
	 * 실명확인검증대상여부
	 */
	@XmlTransient
	public String getAcnmCnfVrtgtYn(){
		return this.acnmCnfVrtgtYn;
	}
	
	/**
	 * 실명확인검증대상여부
	 * 
	 * @param acnmCnfVrtgtYn 실명확인검증대상여부
	 */
	public void setAcnmCnfVrtgtYn(String acnmCnfVrtgtYn){
		this.acnmCnfVrtgtYn= acnmCnfVrtgtYn;
		this.setIsSet_acnmCnfVrtgtYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_indvSavBkcd= false;
	protected final boolean isSet_indvSavBkcd(){
		return this.isSet_indvSavBkcd;
	}
	private void setIsSet_indvSavBkcd(boolean value){
		this.isSet_indvSavBkcd= value;
	}
	/**
	 * 개별저축은행코드
	 */
	@XmlTransient
	public String getIndvSavBkcd(){
		return this.indvSavBkcd;
	}
	
	/**
	 * 개별저축은행코드
	 * 
	 * @param indvSavBkcd 개별저축은행코드
	 */
	public void setIndvSavBkcd(String indvSavBkcd){
		this.indvSavBkcd= indvSavBkcd;
		this.setIsSet_indvSavBkcd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_indvSavBkNm= false;
	protected final boolean isSet_indvSavBkNm(){
		return this.isSet_indvSavBkNm;
	}
	private void setIsSet_indvSavBkNm(boolean value){
		this.isSet_indvSavBkNm= value;
	}
	/**
	 * 개별저축은행명
	 */
	@XmlTransient
	public String getIndvSavBkNm(){
		return this.indvSavBkNm;
	}
	
	/**
	 * 개별저축은행명
	 * 
	 * @param indvSavBkNm 개별저축은행명
	 */
	public void setIndvSavBkNm(String indvSavBkNm){
		this.indvSavBkNm= indvSavBkNm;
		this.setIsSet_indvSavBkNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dpacNo= false;
	protected final boolean isSet_dpacNo(){
		return this.isSet_dpacNo;
	}
	private void setIsSet_dpacNo(boolean value){
		this.isSet_dpacNo= value;
	}
	/**
	 * 수신계좌번호
	 */
	@XmlTransient
	public String getDpacNo(){
		return this.dpacNo;
	}
	
	/**
	 * 수신계좌번호
	 * 
	 * @param dpacNo 수신계좌번호
	 */
	public void setDpacNo(String dpacNo){
		this.dpacNo= dpacNo;
		this.setIsSet_dpacNo(true);
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
	private boolean isSet_dpacStcd= false;
	protected final boolean isSet_dpacStcd(){
		return this.isSet_dpacStcd;
	}
	private void setIsSet_dpacStcd(boolean value){
		this.isSet_dpacStcd= value;
	}
	/**
	 * 수신계좌상태코드
	 */
	@XmlTransient
	public String getDpacStcd(){
		return this.dpacStcd;
	}
	
	/**
	 * 수신계좌상태코드
	 * 
	 * @param dpacStcd 수신계좌상태코드
	 */
	public void setDpacStcd(String dpacStcd){
		this.dpacStcd= dpacStcd;
		this.setIsSet_dpacStcd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_psklActYn= false;
	protected final boolean isSet_psklActYn(){
		return this.isSet_psklActYn;
	}
	private void setIsSet_psklActYn(boolean value){
		this.isSet_psklActYn= value;
	}
	/**
	 * 통장대출계좌여부
	 */
	@XmlTransient
	public String getPsklActYn(){
		return this.psklActYn;
	}
	
	/**
	 * 통장대출계좌여부
	 * 
	 * @param psklActYn 통장대출계좌여부
	 */
	public void setPsklActYn(String psklActYn){
		this.psklActYn= psklActYn;
		this.setIsSet_psklActYn(true);
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
	private boolean isSet_prdKorlNm= false;
	protected final boolean isSet_prdKorlNm(){
		return this.isSet_prdKorlNm;
	}
	private void setIsSet_prdKorlNm(boolean value){
		this.isSet_prdKorlNm= value;
	}
	/**
	 * 상품한글명
	 */
	@XmlTransient
	public String getPrdKorlNm(){
		return this.prdKorlNm;
	}
	
	/**
	 * 상품한글명
	 * 
	 * @param prdKorlNm 상품한글명
	 */
	public void setPrdKorlNm(String prdKorlNm){
		this.prdKorlNm= prdKorlNm;
		this.setIsSet_prdKorlNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_prdKorlAbrNm= false;
	protected final boolean isSet_prdKorlAbrNm(){
		return this.isSet_prdKorlAbrNm;
	}
	private void setIsSet_prdKorlAbrNm(boolean value){
		this.isSet_prdKorlAbrNm= value;
	}
	/**
	 * 상품한글단축명
	 */
	@XmlTransient
	public String getPrdKorlAbrNm(){
		return this.prdKorlAbrNm;
	}
	
	/**
	 * 상품한글단축명
	 * 
	 * @param prdKorlAbrNm 상품한글단축명
	 */
	public void setPrdKorlAbrNm(String prdKorlAbrNm){
		this.prdKorlAbrNm= prdKorlAbrNm;
		this.setIsSet_prdKorlAbrNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ntrnnActYn= false;
	protected final boolean isSet_ntrnnActYn(){
		return this.isSet_ntrnnActYn;
	}
	private void setIsSet_ntrnnActYn(boolean value){
		this.isSet_ntrnnActYn= value;
	}
	/**
	 * 무거래계좌여부
	 */
	@XmlTransient
	public String getNtrnnActYn(){
		return this.ntrnnActYn;
	}
	
	/**
	 * 무거래계좌여부
	 * 
	 * @param ntrnnActYn 무거래계좌여부
	 */
	public void setNtrnnActYn(String ntrnnActYn){
		this.ntrnnActYn= ntrnnActYn;
		this.setIsSet_ntrnnActYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_wdrActYn= false;
	protected final boolean isSet_wdrActYn(){
		return this.isSet_wdrActYn;
	}
	private void setIsSet_wdrActYn(boolean value){
		this.isSet_wdrActYn= value;
	}
	/**
	 * 출금계좌여부
	 */
	@XmlTransient
	public String getWdrActYn(){
		return this.wdrActYn;
	}
	
	/**
	 * 출금계좌여부
	 * 
	 * @param wdrActYn 출금계좌여부
	 */
	public void setWdrActYn(String wdrActYn){
		this.wdrActYn= wdrActYn;
		this.setIsSet_wdrActYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_wdrActUnitRcvDgnYn= false;
	protected final boolean isSet_wdrActUnitRcvDgnYn(){
		return this.isSet_wdrActUnitRcvDgnYn;
	}
	private void setIsSet_wdrActUnitRcvDgnYn(boolean value){
		this.isSet_wdrActUnitRcvDgnYn= value;
	}
	/**
	 * 출금계좌단위입금지정여부
	 */
	@XmlTransient
	public String getWdrActUnitRcvDgnYn(){
		return this.wdrActUnitRcvDgnYn;
	}
	
	/**
	 * 출금계좌단위입금지정여부
	 * 
	 * @param wdrActUnitRcvDgnYn 출금계좌단위입금지정여부
	 */
	public void setWdrActUnitRcvDgnYn(String wdrActUnitRcvDgnYn){
		this.wdrActUnitRcvDgnYn= wdrActUnitRcvDgnYn;
		this.setIsSet_wdrActUnitRcvDgnYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pwnoErrTcn= false;
	protected final boolean isSet_pwnoErrTcn(){
		return this.isSet_pwnoErrTcn;
	}
	private void setIsSet_pwnoErrTcn(boolean value){
		this.isSet_pwnoErrTcn= value;
	}
	/**
	 * 비밀번호오류횟수
	 */
	@XmlTransient
	public Integer getPwnoErrTcn(){
		return this.pwnoErrTcn;
	}
	
	/**
	 * 비밀번호오류횟수
	 * 
	 * @param pwnoErrTcn 비밀번호오류횟수
	 */
	public void setPwnoErrTcn(Integer pwnoErrTcn){
		this.pwnoErrTcn= pwnoErrTcn;
		this.setIsSet_pwnoErrTcn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_synpbPdcd= false;
	protected final boolean isSet_synpbPdcd(){
		return this.isSet_synpbPdcd;
	}
	private void setIsSet_synpbPdcd(boolean value){
		this.isSet_synpbPdcd= value;
	}
	/**
	 * 종합통장상품코드
	 */
	@XmlTransient
	public String getSynpbPdcd(){
		return this.synpbPdcd;
	}
	
	/**
	 * 종합통장상품코드
	 * 
	 * @param synpbPdcd 종합통장상품코드
	 */
	public void setSynpbPdcd(String synpbPdcd){
		this.synpbPdcd= synpbPdcd;
		this.setIsSet_synpbPdcd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_payAvlBal= false;
	protected final boolean isSet_payAvlBal(){
		return this.isSet_payAvlBal;
	}
	private void setIsSet_payAvlBal(boolean value){
		this.isSet_payAvlBal= value;
	}
	/**
	 * 지급가능잔액
	 * BigDecimal - Double value setter
	 *
	 * @Param payAvlBal 지급가능잔액
	 */
	public void setPayAvlBal(double payAvlBal) {
		setPayAvlBal(BigDecimal.valueOf(payAvlBal));
	}
	/**
	 * 지급가능잔액
	 * BigDecimal - Long value setter
	 *
	 * @Param payAvlBal 지급가능잔액
	 */
	public void setPayAvlBal(long payAvlBal) {
		setPayAvlBal(BigDecimal.valueOf(payAvlBal));
	}
	/**
	 * 지급가능잔액
	 * BigDecimal - String value setter
	 *
	 * @Param payAvlBal 지급가능잔액
	 */
	public void setPayAvlBal(String payAvlBal) {
		setPayAvlBal(new BigDecimal(payAvlBal));
	}
	/**
	 * 지급가능잔액
	 */
	@XmlTransient
	public BigDecimal getPayAvlBal(){
		return this.payAvlBal;
	}
	
	/**
	 * 지급가능잔액
	 * 
	 * @param payAvlBal 지급가능잔액
	 */
	@JsonSetter("payAvlBal")
	public void setPayAvlBal(BigDecimal payAvlBal){
		this.payAvlBal= payAvlBal;
		this.setIsSet_payAvlBal(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pbokSplitJnngYn= false;
	protected final boolean isSet_pbokSplitJnngYn(){
		return this.isSet_pbokSplitJnngYn;
	}
	private void setIsSet_pbokSplitJnngYn(boolean value){
		this.isSet_pbokSplitJnngYn= value;
	}
	/**
	 * 통장쪼개기가입여부
	 */
	@XmlTransient
	public String getPbokSplitJnngYn(){
		return this.pbokSplitJnngYn;
	}
	
	/**
	 * 통장쪼개기가입여부
	 * 
	 * @param pbokSplitJnngYn 통장쪼개기가입여부
	 */
	public void setPbokSplitJnngYn(String pbokSplitJnngYn){
		this.pbokSplitJnngYn= pbokSplitJnngYn;
		this.setIsSet_pbokSplitJnngYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pbokSplitSpceCn= false;
	protected final boolean isSet_pbokSplitSpceCn(){
		return this.isSet_pbokSplitSpceCn;
	}
	private void setIsSet_pbokSplitSpceCn(boolean value){
		this.isSet_pbokSplitSpceCn= value;
	}
	/**
	 * 통장쪼개기공간수
	 */
	@XmlTransient
	public Integer getPbokSplitSpceCn(){
		return this.pbokSplitSpceCn;
	}
	
	/**
	 * 통장쪼개기공간수
	 * 
	 * @param pbokSplitSpceCn 통장쪼개기공간수
	 */
	public void setPbokSplitSpceCn(Integer pbokSplitSpceCn){
		this.pbokSplitSpceCn= pbokSplitSpceCn;
		this.setIsSet_pbokSplitSpceCn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pbokSplitRgsDt= false;
	protected final boolean isSet_pbokSplitRgsDt(){
		return this.isSet_pbokSplitRgsDt;
	}
	private void setIsSet_pbokSplitRgsDt(boolean value){
		this.isSet_pbokSplitRgsDt= value;
	}
	/**
	 * 통장쪼개기등록일자
	 */
	@XmlTransient
	public String getPbokSplitRgsDt(){
		return this.pbokSplitRgsDt;
	}
	
	/**
	 * 통장쪼개기등록일자
	 * 
	 * @param pbokSplitRgsDt 통장쪼개기등록일자
	 */
	public void setPbokSplitRgsDt(String pbokSplitRgsDt){
		this.pbokSplitRgsDt= pbokSplitRgsDt;
		this.setIsSet_pbokSplitRgsDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pbokSplitJnngAvlYn= false;
	protected final boolean isSet_pbokSplitJnngAvlYn(){
		return this.isSet_pbokSplitJnngAvlYn;
	}
	private void setIsSet_pbokSplitJnngAvlYn(boolean value){
		this.isSet_pbokSplitJnngAvlYn= value;
	}
	/**
	 * 통장쪼개기가입가능여부
	 */
	@XmlTransient
	public String getPbokSplitJnngAvlYn(){
		return this.pbokSplitJnngAvlYn;
	}
	
	/**
	 * 통장쪼개기가입가능여부
	 * 
	 * @param pbokSplitJnngAvlYn 통장쪼개기가입가능여부
	 */
	public void setPbokSplitJnngAvlYn(String pbokSplitJnngAvlYn){
		this.pbokSplitJnngAvlYn= pbokSplitJnngAvlYn;
		this.setIsSet_pbokSplitJnngAvlYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metPbokJnngYn= false;
	protected final boolean isSet_metPbokJnngYn(){
		return this.isSet_metPbokJnngYn;
	}
	private void setIsSet_metPbokJnngYn(boolean value){
		this.isSet_metPbokJnngYn= value;
	}
	/**
	 * 모임통장가입여부
	 */
	@XmlTransient
	public String getMetPbokJnngYn(){
		return this.metPbokJnngYn;
	}
	
	/**
	 * 모임통장가입여부
	 * 
	 * @param metPbokJnngYn 모임통장가입여부
	 */
	public void setMetPbokJnngYn(String metPbokJnngYn){
		this.metPbokJnngYn= metPbokJnngYn;
		this.setIsSet_metPbokJnngYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metRgsDt= false;
	protected final boolean isSet_metRgsDt(){
		return this.isSet_metRgsDt;
	}
	private void setIsSet_metRgsDt(boolean value){
		this.isSet_metRgsDt= value;
	}
	/**
	 * 모임등록일자
	 */
	@XmlTransient
	public String getMetRgsDt(){
		return this.metRgsDt;
	}
	
	/**
	 * 모임등록일자
	 * 
	 * @param metRgsDt 모임등록일자
	 */
	public void setMetRgsDt(String metRgsDt){
		this.metRgsDt= metRgsDt;
		this.setIsSet_metRgsDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metMngNo= false;
	protected final boolean isSet_metMngNo(){
		return this.isSet_metMngNo;
	}
	private void setIsSet_metMngNo(boolean value){
		this.isSet_metMngNo= value;
	}
	/**
	 * 모임관리번호
	 */
	@XmlTransient
	public String getMetMngNo(){
		return this.metMngNo;
	}
	
	/**
	 * 모임관리번호
	 * 
	 * @param metMngNo 모임관리번호
	 */
	public void setMetMngNo(String metMngNo){
		this.metMngNo= metMngNo;
		this.setIsSet_metMngNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metPbokJnngAvlYn= false;
	protected final boolean isSet_metPbokJnngAvlYn(){
		return this.isSet_metPbokJnngAvlYn;
	}
	private void setIsSet_metPbokJnngAvlYn(boolean value){
		this.isSet_metPbokJnngAvlYn= value;
	}
	/**
	 * 모임통장가입가능여부
	 */
	@XmlTransient
	public String getMetPbokJnngAvlYn(){
		return this.metPbokJnngAvlYn;
	}
	
	/**
	 * 모임통장가입가능여부
	 * 
	 * @param metPbokJnngAvlYn 모임통장가입가능여부
	 */
	public void setMetPbokJnngAvlYn(String metPbokJnngAvlYn){
		this.metPbokJnngAvlYn= metPbokJnngAvlYn;
		this.setIsSet_metPbokJnngAvlYn(true);
	}
				
	@Override
	public MPBMbhActInfGrid clone(){
		try{
			MPBMbhActInfGrid object= (MPBMbhActInfGrid)super.clone();
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
		
		result= prime * result + ((this.tobkDscd==null)?0:this.tobkDscd.hashCode());
		result= prime * result + ((this.openBnkgBkcd==null)?0:this.openBnkgBkcd.hashCode());
		result= prime * result + ((this.openBnkgAcno==null)?0:this.openBnkgAcno.hashCode());
		result= prime * result + ((this.openBnkgActDscd==null)?0:this.openBnkgActDscd.hashCode());
		result= prime * result + ((this.openBnkgActPrdNm==null)?0:this.openBnkgActPrdNm.hashCode());
		result= prime * result + ((this.openBnkgByactNm==null)?0:this.openBnkgByactNm.hashCode());
		result= prime * result + ((this.openBnkgInqYn==null)?0:this.openBnkgInqYn.hashCode());
		result= prime * result + ((this.openBnkgWdrYn==null)?0:this.openBnkgWdrYn.hashCode());
		result= prime * result + ((this.reqCusFnchUtzNo==null)?0:this.reqCusFnchUtzNo.hashCode());
		result= prime * result + ((this.acnmCnfVrtgtYn==null)?0:this.acnmCnfVrtgtYn.hashCode());
		result= prime * result + ((this.indvSavBkcd==null)?0:this.indvSavBkcd.hashCode());
		result= prime * result + ((this.indvSavBkNm==null)?0:this.indvSavBkNm.hashCode());
		result= prime * result + ((this.dpacNo==null)?0:this.dpacNo.hashCode());
		result= prime * result + ((this.cusUsgBkwAcno==null)?0:this.cusUsgBkwAcno.hashCode());
		result= prime * result + ((this.dpacStcd==null)?0:this.dpacStcd.hashCode());
		result= prime * result + ((this.psklActYn==null)?0:this.psklActYn.hashCode());
		result= prime * result + ((this.dpacCtBal==null)?0:this.dpacCtBal.hashCode());
		result= prime * result + ((this.pdcd==null)?0:this.pdcd.hashCode());
		result= prime * result + ((this.prdKorlNm==null)?0:this.prdKorlNm.hashCode());
		result= prime * result + ((this.prdKorlAbrNm==null)?0:this.prdKorlAbrNm.hashCode());
		result= prime * result + ((this.ntrnnActYn==null)?0:this.ntrnnActYn.hashCode());
		result= prime * result + ((this.wdrActYn==null)?0:this.wdrActYn.hashCode());
		result= prime * result + ((this.wdrActUnitRcvDgnYn==null)?0:this.wdrActUnitRcvDgnYn.hashCode());
		result= prime * result + ((this.pwnoErrTcn==null)?0:this.pwnoErrTcn.hashCode());
		result= prime * result + ((this.synpbPdcd==null)?0:this.synpbPdcd.hashCode());
		result= prime * result + ((this.payAvlBal==null)?0:this.payAvlBal.hashCode());
		result= prime * result + ((this.pbokSplitJnngYn==null)?0:this.pbokSplitJnngYn.hashCode());
		result= prime * result + ((this.pbokSplitSpceCn==null)?0:this.pbokSplitSpceCn.hashCode());
		result= prime * result + ((this.pbokSplitRgsDt==null)?0:this.pbokSplitRgsDt.hashCode());
		result= prime * result + ((this.pbokSplitJnngAvlYn==null)?0:this.pbokSplitJnngAvlYn.hashCode());
		result= prime * result + ((this.metPbokJnngYn==null)?0:this.metPbokJnngYn.hashCode());
		result= prime * result + ((this.metRgsDt==null)?0:this.metRgsDt.hashCode());
		result= prime * result + ((this.metMngNo==null)?0:this.metMngNo.hashCode());
		result= prime * result + ((this.metPbokJnngAvlYn==null)?0:this.metPbokJnngAvlYn.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MPBMbhActInfGrid other= (MPBMbhActInfGrid)obj;
		{
			Object _tobkDscd= getTobkDscd();
			Object __tobkDscd= other.getTobkDscd();
			if ( _tobkDscd== null ) { if ( __tobkDscd!= null ) return false; }
			else if ( !_tobkDscd.equals(__tobkDscd) ) return false;
		}
		{
			Object _openBnkgBkcd= getOpenBnkgBkcd();
			Object __openBnkgBkcd= other.getOpenBnkgBkcd();
			if ( _openBnkgBkcd== null ) { if ( __openBnkgBkcd!= null ) return false; }
			else if ( !_openBnkgBkcd.equals(__openBnkgBkcd) ) return false;
		}
		{
			Object _openBnkgAcno= getOpenBnkgAcno();
			Object __openBnkgAcno= other.getOpenBnkgAcno();
			if ( _openBnkgAcno== null ) { if ( __openBnkgAcno!= null ) return false; }
			else if ( !_openBnkgAcno.equals(__openBnkgAcno) ) return false;
		}
		{
			Object _openBnkgActDscd= getOpenBnkgActDscd();
			Object __openBnkgActDscd= other.getOpenBnkgActDscd();
			if ( _openBnkgActDscd== null ) { if ( __openBnkgActDscd!= null ) return false; }
			else if ( !_openBnkgActDscd.equals(__openBnkgActDscd) ) return false;
		}
		{
			Object _openBnkgActPrdNm= getOpenBnkgActPrdNm();
			Object __openBnkgActPrdNm= other.getOpenBnkgActPrdNm();
			if ( _openBnkgActPrdNm== null ) { if ( __openBnkgActPrdNm!= null ) return false; }
			else if ( !_openBnkgActPrdNm.equals(__openBnkgActPrdNm) ) return false;
		}
		{
			Object _openBnkgByactNm= getOpenBnkgByactNm();
			Object __openBnkgByactNm= other.getOpenBnkgByactNm();
			if ( _openBnkgByactNm== null ) { if ( __openBnkgByactNm!= null ) return false; }
			else if ( !_openBnkgByactNm.equals(__openBnkgByactNm) ) return false;
		}
		{
			Object _openBnkgInqYn= getOpenBnkgInqYn();
			Object __openBnkgInqYn= other.getOpenBnkgInqYn();
			if ( _openBnkgInqYn== null ) { if ( __openBnkgInqYn!= null ) return false; }
			else if ( !_openBnkgInqYn.equals(__openBnkgInqYn) ) return false;
		}
		{
			Object _openBnkgWdrYn= getOpenBnkgWdrYn();
			Object __openBnkgWdrYn= other.getOpenBnkgWdrYn();
			if ( _openBnkgWdrYn== null ) { if ( __openBnkgWdrYn!= null ) return false; }
			else if ( !_openBnkgWdrYn.equals(__openBnkgWdrYn) ) return false;
		}
		{
			Object _reqCusFnchUtzNo= getReqCusFnchUtzNo();
			Object __reqCusFnchUtzNo= other.getReqCusFnchUtzNo();
			if ( _reqCusFnchUtzNo== null ) { if ( __reqCusFnchUtzNo!= null ) return false; }
			else if ( !_reqCusFnchUtzNo.equals(__reqCusFnchUtzNo) ) return false;
		}
		{
			Object _acnmCnfVrtgtYn= getAcnmCnfVrtgtYn();
			Object __acnmCnfVrtgtYn= other.getAcnmCnfVrtgtYn();
			if ( _acnmCnfVrtgtYn== null ) { if ( __acnmCnfVrtgtYn!= null ) return false; }
			else if ( !_acnmCnfVrtgtYn.equals(__acnmCnfVrtgtYn) ) return false;
		}
		{
			Object _indvSavBkcd= getIndvSavBkcd();
			Object __indvSavBkcd= other.getIndvSavBkcd();
			if ( _indvSavBkcd== null ) { if ( __indvSavBkcd!= null ) return false; }
			else if ( !_indvSavBkcd.equals(__indvSavBkcd) ) return false;
		}
		{
			Object _indvSavBkNm= getIndvSavBkNm();
			Object __indvSavBkNm= other.getIndvSavBkNm();
			if ( _indvSavBkNm== null ) { if ( __indvSavBkNm!= null ) return false; }
			else if ( !_indvSavBkNm.equals(__indvSavBkNm) ) return false;
		}
		{
			Object _dpacNo= getDpacNo();
			Object __dpacNo= other.getDpacNo();
			if ( _dpacNo== null ) { if ( __dpacNo!= null ) return false; }
			else if ( !_dpacNo.equals(__dpacNo) ) return false;
		}
		{
			Object _cusUsgBkwAcno= getCusUsgBkwAcno();
			Object __cusUsgBkwAcno= other.getCusUsgBkwAcno();
			if ( _cusUsgBkwAcno== null ) { if ( __cusUsgBkwAcno!= null ) return false; }
			else if ( !_cusUsgBkwAcno.equals(__cusUsgBkwAcno) ) return false;
		}
		{
			Object _dpacStcd= getDpacStcd();
			Object __dpacStcd= other.getDpacStcd();
			if ( _dpacStcd== null ) { if ( __dpacStcd!= null ) return false; }
			else if ( !_dpacStcd.equals(__dpacStcd) ) return false;
		}
		{
			Object _psklActYn= getPsklActYn();
			Object __psklActYn= other.getPsklActYn();
			if ( _psklActYn== null ) { if ( __psklActYn!= null ) return false; }
			else if ( !_psklActYn.equals(__psklActYn) ) return false;
		}
		{
			Object _dpacCtBal= getDpacCtBal();
			Object __dpacCtBal= other.getDpacCtBal();
			if ( _dpacCtBal== null ) { if ( __dpacCtBal!= null ) return false; }
			else if ( !_dpacCtBal.equals(__dpacCtBal) ) return false;
		}
		{
			Object _pdcd= getPdcd();
			Object __pdcd= other.getPdcd();
			if ( _pdcd== null ) { if ( __pdcd!= null ) return false; }
			else if ( !_pdcd.equals(__pdcd) ) return false;
		}
		{
			Object _prdKorlNm= getPrdKorlNm();
			Object __prdKorlNm= other.getPrdKorlNm();
			if ( _prdKorlNm== null ) { if ( __prdKorlNm!= null ) return false; }
			else if ( !_prdKorlNm.equals(__prdKorlNm) ) return false;
		}
		{
			Object _prdKorlAbrNm= getPrdKorlAbrNm();
			Object __prdKorlAbrNm= other.getPrdKorlAbrNm();
			if ( _prdKorlAbrNm== null ) { if ( __prdKorlAbrNm!= null ) return false; }
			else if ( !_prdKorlAbrNm.equals(__prdKorlAbrNm) ) return false;
		}
		{
			Object _ntrnnActYn= getNtrnnActYn();
			Object __ntrnnActYn= other.getNtrnnActYn();
			if ( _ntrnnActYn== null ) { if ( __ntrnnActYn!= null ) return false; }
			else if ( !_ntrnnActYn.equals(__ntrnnActYn) ) return false;
		}
		{
			Object _wdrActYn= getWdrActYn();
			Object __wdrActYn= other.getWdrActYn();
			if ( _wdrActYn== null ) { if ( __wdrActYn!= null ) return false; }
			else if ( !_wdrActYn.equals(__wdrActYn) ) return false;
		}
		{
			Object _wdrActUnitRcvDgnYn= getWdrActUnitRcvDgnYn();
			Object __wdrActUnitRcvDgnYn= other.getWdrActUnitRcvDgnYn();
			if ( _wdrActUnitRcvDgnYn== null ) { if ( __wdrActUnitRcvDgnYn!= null ) return false; }
			else if ( !_wdrActUnitRcvDgnYn.equals(__wdrActUnitRcvDgnYn) ) return false;
		}
		{
			Object _pwnoErrTcn= getPwnoErrTcn();
			Object __pwnoErrTcn= other.getPwnoErrTcn();
			if ( _pwnoErrTcn== null ) { if ( __pwnoErrTcn!= null ) return false; }
			else if ( !_pwnoErrTcn.equals(__pwnoErrTcn) ) return false;
		}
		{
			Object _synpbPdcd= getSynpbPdcd();
			Object __synpbPdcd= other.getSynpbPdcd();
			if ( _synpbPdcd== null ) { if ( __synpbPdcd!= null ) return false; }
			else if ( !_synpbPdcd.equals(__synpbPdcd) ) return false;
		}
		{
			Object _payAvlBal= getPayAvlBal();
			Object __payAvlBal= other.getPayAvlBal();
			if ( _payAvlBal== null ) { if ( __payAvlBal!= null ) return false; }
			else if ( !_payAvlBal.equals(__payAvlBal) ) return false;
		}
		{
			Object _pbokSplitJnngYn= getPbokSplitJnngYn();
			Object __pbokSplitJnngYn= other.getPbokSplitJnngYn();
			if ( _pbokSplitJnngYn== null ) { if ( __pbokSplitJnngYn!= null ) return false; }
			else if ( !_pbokSplitJnngYn.equals(__pbokSplitJnngYn) ) return false;
		}
		{
			Object _pbokSplitSpceCn= getPbokSplitSpceCn();
			Object __pbokSplitSpceCn= other.getPbokSplitSpceCn();
			if ( _pbokSplitSpceCn== null ) { if ( __pbokSplitSpceCn!= null ) return false; }
			else if ( !_pbokSplitSpceCn.equals(__pbokSplitSpceCn) ) return false;
		}
		{
			Object _pbokSplitRgsDt= getPbokSplitRgsDt();
			Object __pbokSplitRgsDt= other.getPbokSplitRgsDt();
			if ( _pbokSplitRgsDt== null ) { if ( __pbokSplitRgsDt!= null ) return false; }
			else if ( !_pbokSplitRgsDt.equals(__pbokSplitRgsDt) ) return false;
		}
		{
			Object _pbokSplitJnngAvlYn= getPbokSplitJnngAvlYn();
			Object __pbokSplitJnngAvlYn= other.getPbokSplitJnngAvlYn();
			if ( _pbokSplitJnngAvlYn== null ) { if ( __pbokSplitJnngAvlYn!= null ) return false; }
			else if ( !_pbokSplitJnngAvlYn.equals(__pbokSplitJnngAvlYn) ) return false;
		}
		{
			Object _metPbokJnngYn= getMetPbokJnngYn();
			Object __metPbokJnngYn= other.getMetPbokJnngYn();
			if ( _metPbokJnngYn== null ) { if ( __metPbokJnngYn!= null ) return false; }
			else if ( !_metPbokJnngYn.equals(__metPbokJnngYn) ) return false;
		}
		{
			Object _metRgsDt= getMetRgsDt();
			Object __metRgsDt= other.getMetRgsDt();
			if ( _metRgsDt== null ) { if ( __metRgsDt!= null ) return false; }
			else if ( !_metRgsDt.equals(__metRgsDt) ) return false;
		}
		{
			Object _metMngNo= getMetMngNo();
			Object __metMngNo= other.getMetMngNo();
			if ( _metMngNo== null ) { if ( __metMngNo!= null ) return false; }
			else if ( !_metMngNo.equals(__metMngNo) ) return false;
		}
		{
			Object _metPbokJnngAvlYn= getMetPbokJnngAvlYn();
			Object __metPbokJnngAvlYn= other.getMetPbokJnngAvlYn();
			if ( _metPbokJnngAvlYn== null ) { if ( __metPbokJnngAvlYn!= null ) return false; }
			else if ( !_metPbokJnngAvlYn.equals(__metPbokJnngAvlYn) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MPBMbhActInfGrid.class.getName()).append(":\n");
		sb.append("\ttobkDscd: ");
		sb.append(tobkDscd==null?"null":getTobkDscd());
		sb.append("\n");
		sb.append("\topenBnkgBkcd: ");
		sb.append(openBnkgBkcd==null?"null":getOpenBnkgBkcd());
		sb.append("\n");
		sb.append("\topenBnkgAcno: ");
		sb.append(openBnkgAcno==null?"null":getOpenBnkgAcno());
		sb.append("\n");
		sb.append("\topenBnkgActDscd: ");
		sb.append(openBnkgActDscd==null?"null":getOpenBnkgActDscd());
		sb.append("\n");
		sb.append("\topenBnkgActPrdNm: ");
		sb.append(openBnkgActPrdNm==null?"null":getOpenBnkgActPrdNm());
		sb.append("\n");
		sb.append("\topenBnkgByactNm: ");
		sb.append(openBnkgByactNm==null?"null":getOpenBnkgByactNm());
		sb.append("\n");
		sb.append("\topenBnkgInqYn: ");
		sb.append(openBnkgInqYn==null?"null":getOpenBnkgInqYn());
		sb.append("\n");
		sb.append("\topenBnkgWdrYn: ");
		sb.append(openBnkgWdrYn==null?"null":getOpenBnkgWdrYn());
		sb.append("\n");
		sb.append("\treqCusFnchUtzNo: ");
		sb.append(reqCusFnchUtzNo==null?"null":getReqCusFnchUtzNo());
		sb.append("\n");
		sb.append("\tacnmCnfVrtgtYn: ");
		sb.append(acnmCnfVrtgtYn==null?"null":getAcnmCnfVrtgtYn());
		sb.append("\n");
		sb.append("\tindvSavBkcd: ");
		sb.append(indvSavBkcd==null?"null":getIndvSavBkcd());
		sb.append("\n");
		sb.append("\tindvSavBkNm: ");
		sb.append(indvSavBkNm==null?"null":getIndvSavBkNm());
		sb.append("\n");
		sb.append("\tdpacNo: ");
		sb.append(dpacNo==null?"null":getDpacNo());
		sb.append("\n");
		sb.append("\tcusUsgBkwAcno: ");
		sb.append(cusUsgBkwAcno==null?"null":getCusUsgBkwAcno());
		sb.append("\n");
		sb.append("\tdpacStcd: ");
		sb.append(dpacStcd==null?"null":getDpacStcd());
		sb.append("\n");
		sb.append("\tpsklActYn: ");
		sb.append(psklActYn==null?"null":getPsklActYn());
		sb.append("\n");
		sb.append("\tdpacCtBal: ");
		sb.append(dpacCtBal==null?"null":getDpacCtBal());
		sb.append("\n");
		sb.append("\tpdcd: ");
		sb.append(pdcd==null?"null":getPdcd());
		sb.append("\n");
		sb.append("\tprdKorlNm: ");
		sb.append(prdKorlNm==null?"null":getPrdKorlNm());
		sb.append("\n");
		sb.append("\tprdKorlAbrNm: ");
		sb.append(prdKorlAbrNm==null?"null":getPrdKorlAbrNm());
		sb.append("\n");
		sb.append("\tntrnnActYn: ");
		sb.append(ntrnnActYn==null?"null":getNtrnnActYn());
		sb.append("\n");
		sb.append("\twdrActYn: ");
		sb.append(wdrActYn==null?"null":getWdrActYn());
		sb.append("\n");
		sb.append("\twdrActUnitRcvDgnYn: ");
		sb.append(wdrActUnitRcvDgnYn==null?"null":getWdrActUnitRcvDgnYn());
		sb.append("\n");
		sb.append("\tpwnoErrTcn: ");
		sb.append(pwnoErrTcn==null?"null":getPwnoErrTcn());
		sb.append("\n");
		sb.append("\tsynpbPdcd: ");
		sb.append(synpbPdcd==null?"null":getSynpbPdcd());
		sb.append("\n");
		sb.append("\tpayAvlBal: ");
		sb.append(payAvlBal==null?"null":getPayAvlBal());
		sb.append("\n");
		sb.append("\tpbokSplitJnngYn: ");
		sb.append(pbokSplitJnngYn==null?"null":getPbokSplitJnngYn());
		sb.append("\n");
		sb.append("\tpbokSplitSpceCn: ");
		sb.append(pbokSplitSpceCn==null?"null":getPbokSplitSpceCn());
		sb.append("\n");
		sb.append("\tpbokSplitRgsDt: ");
		sb.append(pbokSplitRgsDt==null?"null":getPbokSplitRgsDt());
		sb.append("\n");
		sb.append("\tpbokSplitJnngAvlYn: ");
		sb.append(pbokSplitJnngAvlYn==null?"null":getPbokSplitJnngAvlYn());
		sb.append("\n");
		sb.append("\tmetPbokJnngYn: ");
		sb.append(metPbokJnngYn==null?"null":getMetPbokJnngYn());
		sb.append("\n");
		sb.append("\tmetRgsDt: ");
		sb.append(metRgsDt==null?"null":getMetRgsDt());
		sb.append("\n");
		sb.append("\tmetMngNo: ");
		sb.append(metMngNo==null?"null":getMetMngNo());
		sb.append("\n");
		sb.append("\tmetPbokJnngAvlYn: ");
		sb.append(metPbokJnngAvlYn==null?"null":getMetPbokJnngAvlYn());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 1; /* tobkDscd */
		messageLen+= 3; /* openBnkgBkcd */
		messageLen+= 20; /* openBnkgAcno */
		messageLen+= 1; /* openBnkgActDscd */
		messageLen+= 40; /* openBnkgActPrdNm */
		messageLen+= 20; /* openBnkgByactNm */
		messageLen+= 1; /* openBnkgInqYn */
		messageLen+= 1; /* openBnkgWdrYn */
		messageLen+= 24; /* reqCusFnchUtzNo */
		messageLen+= 1; /* acnmCnfVrtgtYn */
		messageLen+= 3; /* indvSavBkcd */
		messageLen+= 20; /* indvSavBkNm */
		messageLen+= 13; /* dpacNo */
		messageLen+= 20; /* cusUsgBkwAcno */
		messageLen+= 2; /* dpacStcd */
		messageLen+= 1; /* psklActYn */
		messageLen+= 19; /* dpacCtBal */
		messageLen+= 13; /* pdcd */
		messageLen+= 100; /* prdKorlNm */
		messageLen+= 50; /* prdKorlAbrNm */
		messageLen+= 1; /* ntrnnActYn */
		messageLen+= 1; /* wdrActYn */
		messageLen+= 1; /* wdrActUnitRcvDgnYn */
		messageLen+= 3; /* pwnoErrTcn */
		messageLen+= 13; /* synpbPdcd */
		messageLen+= 19; /* payAvlBal */
		messageLen+= 1; /* pbokSplitJnngYn */
		messageLen+= 3; /* pbokSplitSpceCn */
		messageLen+= 8; /* pbokSplitRgsDt */
		messageLen+= 1; /* pbokSplitJnngAvlYn */
		messageLen+= 1; /* metPbokJnngYn */
		messageLen+= 8; /* metRgsDt */
		messageLen+= 9; /* metMngNo */
		messageLen+= 1; /* metPbokJnngAvlYn */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("tobkDscd");
		list.add("openBnkgBkcd");
		list.add("openBnkgAcno");
		list.add("openBnkgActDscd");
		list.add("openBnkgActPrdNm");
		list.add("openBnkgByactNm");
		list.add("openBnkgInqYn");
		list.add("openBnkgWdrYn");
		list.add("reqCusFnchUtzNo");
		list.add("acnmCnfVrtgtYn");
		list.add("indvSavBkcd");
		list.add("indvSavBkNm");
		list.add("dpacNo");
		list.add("cusUsgBkwAcno");
		list.add("dpacStcd");
		list.add("psklActYn");
		list.add("dpacCtBal");
		list.add("pdcd");
		list.add("prdKorlNm");
		list.add("prdKorlAbrNm");
		list.add("ntrnnActYn");
		list.add("wdrActYn");
		list.add("wdrActUnitRcvDgnYn");
		list.add("pwnoErrTcn");
		list.add("synpbPdcd");
		list.add("payAvlBal");
		list.add("pbokSplitJnngYn");
		list.add("pbokSplitSpceCn");
		list.add("pbokSplitRgsDt");
		list.add("pbokSplitJnngAvlYn");
		list.add("metPbokJnngYn");
		list.add("metRgsDt");
		list.add("metMngNo");
		list.add("metPbokJnngAvlYn");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("tobkDscd", get("tobkDscd"));
		map.put("openBnkgBkcd", get("openBnkgBkcd"));
		map.put("openBnkgAcno", get("openBnkgAcno"));
		map.put("openBnkgActDscd", get("openBnkgActDscd"));
		map.put("openBnkgActPrdNm", get("openBnkgActPrdNm"));
		map.put("openBnkgByactNm", get("openBnkgByactNm"));
		map.put("openBnkgInqYn", get("openBnkgInqYn"));
		map.put("openBnkgWdrYn", get("openBnkgWdrYn"));
		map.put("reqCusFnchUtzNo", get("reqCusFnchUtzNo"));
		map.put("acnmCnfVrtgtYn", get("acnmCnfVrtgtYn"));
		map.put("indvSavBkcd", get("indvSavBkcd"));
		map.put("indvSavBkNm", get("indvSavBkNm"));
		map.put("dpacNo", get("dpacNo"));
		map.put("cusUsgBkwAcno", get("cusUsgBkwAcno"));
		map.put("dpacStcd", get("dpacStcd"));
		map.put("psklActYn", get("psklActYn"));
		map.put("dpacCtBal", get("dpacCtBal"));
		map.put("pdcd", get("pdcd"));
		map.put("prdKorlNm", get("prdKorlNm"));
		map.put("prdKorlAbrNm", get("prdKorlAbrNm"));
		map.put("ntrnnActYn", get("ntrnnActYn"));
		map.put("wdrActYn", get("wdrActYn"));
		map.put("wdrActUnitRcvDgnYn", get("wdrActUnitRcvDgnYn"));
		map.put("pwnoErrTcn", get("pwnoErrTcn"));
		map.put("synpbPdcd", get("synpbPdcd"));
		map.put("payAvlBal", get("payAvlBal"));
		map.put("pbokSplitJnngYn", get("pbokSplitJnngYn"));
		map.put("pbokSplitSpceCn", get("pbokSplitSpceCn"));
		map.put("pbokSplitRgsDt", get("pbokSplitRgsDt"));
		map.put("pbokSplitJnngAvlYn", get("pbokSplitJnngAvlYn"));
		map.put("metPbokJnngYn", get("metPbokJnngYn"));
		map.put("metRgsDt", get("metRgsDt"));
		map.put("metMngNo", get("metMngNo"));
		map.put("metPbokJnngAvlYn", get("metPbokJnngAvlYn"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -1357157548:/* tobkDscd */
			return getTobkDscd();
		case -808263268:/* openBnkgBkcd */
			return getOpenBnkgBkcd();
		case -808300395:/* openBnkgAcno */
			return getOpenBnkgAcno();
		case 1808935024:/* openBnkgActDscd */
			return getOpenBnkgActDscd();
		case 253463745:/* openBnkgActPrdNm */
			return getOpenBnkgActPrdNm();
		case -985310328:/* openBnkgByactNm */
			return getOpenBnkgByactNm();
		case 720209711:/* openBnkgInqYn */
			return getOpenBnkgInqYn();
		case 732842056:/* openBnkgWdrYn */
			return getOpenBnkgWdrYn();
		case -1914015700:/* reqCusFnchUtzNo */
			return getReqCusFnchUtzNo();
		case 473290880:/* acnmCnfVrtgtYn */
			return getAcnmCnfVrtgtYn();
		case -1465141765:/* indvSavBkcd */
			return getIndvSavBkcd();
		case -1465142407:/* indvSavBkNm */
			return getIndvSavBkNm();
		case -1325630449:/* dpacNo */
			return getDpacNo();
		case -2031113431:/* cusUsgBkwAcno */
			return getCusUsgBkwAcno();
		case 1674582352:/* dpacStcd */
			return getDpacStcd();
		case 1616942851:/* psklActYn */
			return getPsklActYn();
		case 357637326:/* dpacCtBal */
			return getDpacCtBal();
		case 3435861:/* pdcd */
			return getPdcd();
		case 1349700159:/* prdKorlNm */
			return getPrdKorlNm();
		case -578609776:/* prdKorlAbrNm */
			return getPrdKorlAbrNm();
		case -482597765:/* ntrnnActYn */
			return getNtrnnActYn();
		case -1176097022:/* wdrActYn */
			return getWdrActYn();
		case 63949996:/* wdrActUnitRcvDgnYn */
			return getWdrActUnitRcvDgnYn();
		case -624950174:/* pwnoErrTcn */
			return getPwnoErrTcn();
		case 868429615:/* synpbPdcd */
			return getSynpbPdcd();
		case -1330609026:/* payAvlBal */
			return getPayAvlBal();
		case 877816190:/* pbokSplitJnngYn */
			return getPbokSplitJnngYn();
		case 1136995286:/* pbokSplitSpceCn */
			return getPbokSplitSpceCn();
		case 312594690:/* pbokSplitRgsDt */
			return getPbokSplitRgsDt();
		case -1055568573:/* pbokSplitJnngAvlYn */
			return getPbokSplitJnngAvlYn();
		case -754165284:/* metPbokJnngYn */
			return getMetPbokJnngYn();
		case -463751790:/* metRgsDt */
			return getMetRgsDt();
		case -468172085:/* metMngNo */
			return getMetMngNo();
		case -385869787:/* metPbokJnngAvlYn */
			return getMetPbokJnngAvlYn();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -1357157548:/* tobkDscd */
			setTobkDscd((String)value);
			break;
		case -808263268:/* openBnkgBkcd */
			setOpenBnkgBkcd((String)value);
			break;
		case -808300395:/* openBnkgAcno */
			setOpenBnkgAcno((String)value);
			break;
		case 1808935024:/* openBnkgActDscd */
			setOpenBnkgActDscd((String)value);
			break;
		case 253463745:/* openBnkgActPrdNm */
			setOpenBnkgActPrdNm((String)value);
			break;
		case -985310328:/* openBnkgByactNm */
			setOpenBnkgByactNm((String)value);
			break;
		case 720209711:/* openBnkgInqYn */
			setOpenBnkgInqYn((String)value);
			break;
		case 732842056:/* openBnkgWdrYn */
			setOpenBnkgWdrYn((String)value);
			break;
		case -1914015700:/* reqCusFnchUtzNo */
			setReqCusFnchUtzNo((String)value);
			break;
		case 473290880:/* acnmCnfVrtgtYn */
			setAcnmCnfVrtgtYn((String)value);
			break;
		case -1465141765:/* indvSavBkcd */
			setIndvSavBkcd((String)value);
			break;
		case -1465142407:/* indvSavBkNm */
			setIndvSavBkNm((String)value);
			break;
		case -1325630449:/* dpacNo */
			setDpacNo((String)value);
			break;
		case -2031113431:/* cusUsgBkwAcno */
			setCusUsgBkwAcno((String)value);
			break;
		case 1674582352:/* dpacStcd */
			setDpacStcd((String)value);
			break;
		case 1616942851:/* psklActYn */
			setPsklActYn((String)value);
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
		case 3435861:/* pdcd */
			setPdcd((String)value);
			break;
		case 1349700159:/* prdKorlNm */
			setPrdKorlNm((String)value);
			break;
		case -578609776:/* prdKorlAbrNm */
			setPrdKorlAbrNm((String)value);
			break;
		case -482597765:/* ntrnnActYn */
			setNtrnnActYn((String)value);
			break;
		case -1176097022:/* wdrActYn */
			setWdrActYn((String)value);
			break;
		case 63949996:/* wdrActUnitRcvDgnYn */
			setWdrActUnitRcvDgnYn((String)value);
			break;
		case -624950174:/* pwnoErrTcn */
			setPwnoErrTcn((Integer)value);
			break;
		case 868429615:/* synpbPdcd */
			setSynpbPdcd((String)value);
			break;
		case -1330609026:/* payAvlBal */
			if ( value instanceof String ){
				setPayAvlBal((String)value);
			}
			else if ( value instanceof Double ){
				setPayAvlBal((Double)value);
			}
			else if ( value instanceof Long ){
				setPayAvlBal((Long)value);
			}
			else{
				setPayAvlBal((BigDecimal)value);
			}
			break;
		case 877816190:/* pbokSplitJnngYn */
			setPbokSplitJnngYn((String)value);
			break;
		case 1136995286:/* pbokSplitSpceCn */
			setPbokSplitSpceCn((Integer)value);
			break;
		case 312594690:/* pbokSplitRgsDt */
			setPbokSplitRgsDt((String)value);
			break;
		case -1055568573:/* pbokSplitJnngAvlYn */
			setPbokSplitJnngAvlYn((String)value);
			break;
		case -754165284:/* metPbokJnngYn */
			setMetPbokJnngYn((String)value);
			break;
		case -463751790:/* metRgsDt */
			setMetRgsDt((String)value);
			break;
		case -468172085:/* metMngNo */
			setMetMngNo((String)value);
			break;
		case -385869787:/* metPbokJnngAvlYn */
			setMetPbokJnngAvlYn((String)value);
			break;
		default:
			break;
		}
	}
	
}
