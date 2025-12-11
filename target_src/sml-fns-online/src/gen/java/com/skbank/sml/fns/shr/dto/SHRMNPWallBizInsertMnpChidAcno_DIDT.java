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
	"wdrAcno", "actPwnoUsgYn", "encyWdrActPwno", "cucd", "csno", "pdcd", "newAm", "ctrtmMcn", "synpbDscd", "actMngBrcd", "bchrCponNo", "encyDpsActPwno", "fncTrnAimCollDis", "nrsrCnfDocCollYn", "psnInfAgmdMngNo"
	, "smsdDscd", "advpeEno", "agnpeEncyRrno", "rppeEncyRrno", "agnpeFnm", "rppeFnm", "prdDesOupYn", "atsYn", "atsStaDt", "atsEndDt", "atsAm", "atsDd", "atsCycd", "insvAcldTsStaWkdDscd", "cusDntnAscnCd"
	, "cusDgnPrdNm", "aimFdNm", "dinsvGoalAm"
}, name="SHRMNPWallBizInsertMnpChidAcno_DIDT")
@XmlRootElement(name="SHRMNPWallBizInsertMnpChidAcno_DIDT")
@BxmCategory(logicalName="SHR 머니클립.자.계좌.등록.컴포넌트.입력.IO", description="") 
public class SHRMNPWallBizInsertMnpChidAcno_DIDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 1437012962L;
	
	
	
	/**
	 * 출금계좌번호
	 */
	@ApiModelProperty(
		name = "wdrAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("wdrAcno")
	@BxmOmm_Field(length=15, decimal=0, description="출금계좌번호", align="left", fill="")
	private String wdrAcno= "";
	
	
	/**
	 * 계좌비밀번호사용여부
	 */
	@ApiModelProperty(
		name = "actPwnoUsgYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("actPwnoUsgYn")
	@BxmOmm_Field(length=1, decimal=0, description="계좌비밀번호사용여부", align="left", fill="")
	private String actPwnoUsgYn= "";
	
	
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
	 * 통화코드
	 */
	@ApiModelProperty(
		name = "cucd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("cucd")
	@BxmOmm_Field(length=3, decimal=0, description="통화코드", align="left", fill="")
	private String cucd= "";
	
	
	/**
	 * 고객번호
	 */
	@ApiModelProperty(
		name = "csno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("csno")
	@BxmOmm_Field(length=9, decimal=0, description="고객번호", align="left", fill="")
	private String csno= "";
	
	
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
	 * 신규금액
	 */
	@ApiModelProperty(
		name = "newAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("newAm")
	@BxmOmm_Field(length=19, decimal=3, description="신규금액", align="right", fill="")
	private BigDecimal newAm= new BigDecimal("0");
	
	
	/**
	 * 계약기간월수
	 */
	@ApiModelProperty(
		name = "ctrtmMcn"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("ctrtmMcn")
	@BxmOmm_Field(length=3, decimal=0, description="계약기간월수", align="right", fill="")
	private Integer ctrtmMcn= 0;
	
	
	/**
	 * 종합통장구분코드
	 */
	@ApiModelProperty(
		name = "synpbDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("synpbDscd")
	@BxmOmm_Field(length=1, decimal=0, description="종합통장구분코드", align="left", fill="")
	private String synpbDscd= "";
	
	
	/**
	 * 계좌관리점코드
	 */
	@ApiModelProperty(
		name = "actMngBrcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("actMngBrcd")
	@BxmOmm_Field(length=6, decimal=0, description="계좌관리점코드", align="left", fill="")
	private String actMngBrcd= "";
	
	
	/**
	 * 바우처쿠폰번호
	 */
	@ApiModelProperty(
		name = "bchrCponNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("bchrCponNo")
	@BxmOmm_Field(length=8, decimal=0, description="바우처쿠폰번호", align="left", fill="")
	private String bchrCponNo= "";
	
	
	/**
	 * 암호화수신계좌비밀번호
	 */
	@ApiModelProperty(
		name = "encyDpsActPwno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("encyDpsActPwno")
	@BxmOmm_Field(length=32, decimal=0, description="암호화수신계좌비밀번호", align="left", fill="")
	private String encyDpsActPwno= "";
	
	
	/**
	 * 금융거래목적징구구분
	 */
	@ApiModelProperty(
		name = "fncTrnAimCollDis"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("fncTrnAimCollDis")
	@BxmOmm_Field(length=1, decimal=0, description="금융거래목적징구구분", align="left", fill="")
	private String fncTrnAimCollDis= "";
	
	
	/**
	 * 비거주자확인서류징구여부
	 */
	@ApiModelProperty(
		name = "nrsrCnfDocCollYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("nrsrCnfDocCollYn")
	@BxmOmm_Field(length=1, decimal=0, description="비거주자확인서류징구여부", align="left", fill="")
	private String nrsrCnfDocCollYn= "";
	
	
	/**
	 * 개인정보동의서관리번호
	 */
	@ApiModelProperty(
		name = "psnInfAgmdMngNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("psnInfAgmdMngNo")
	@BxmOmm_Field(length=19, decimal=0, description="개인정보동의서관리번호", align="left", fill="")
	private String psnInfAgmdMngNo= "";
	
	
	/**
	 * SMS발송구분코드
	 */
	@ApiModelProperty(
		name = "smsdDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("smsdDscd")
	@BxmOmm_Field(length=1, decimal=0, description="SMS발송구분코드", align="left", fill="")
	private String smsdDscd= "";
	
	
	/**
	 * 권유자직원번호
	 */
	@ApiModelProperty(
		name = "advpeEno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("advpeEno")
	@BxmOmm_Field(length=8, decimal=0, description="권유자직원번호", align="left", fill="")
	private String advpeEno= "";
	
	
	/**
	 * 대리인암호화주민등록번호
	 */
	@ApiModelProperty(
		name = "agnpeEncyRrno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("agnpeEncyRrno")
	@BxmOmm_Field(length=32, decimal=0, description="대리인암호화주민등록번호", align="left", fill="")
	private String agnpeEncyRrno= "";
	
	
	/**
	 * 대표자암호화주민등록번호
	 */
	@ApiModelProperty(
		name = "rppeEncyRrno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rppeEncyRrno")
	@BxmOmm_Field(length=32, decimal=0, description="대표자암호화주민등록번호", align="left", fill="")
	private String rppeEncyRrno= "";
	
	
	/**
	 * 대리인성명
	 */
	@ApiModelProperty(
		name = "agnpeFnm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("agnpeFnm")
	@BxmOmm_Field(length=30, decimal=0, description="대리인성명", align="left", fill="")
	private String agnpeFnm= "";
	
	
	/**
	 * 대표자성명
	 */
	@ApiModelProperty(
		name = "rppeFnm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rppeFnm")
	@BxmOmm_Field(length=30, decimal=0, description="대표자성명", align="left", fill="")
	private String rppeFnm= "";
	
	
	/**
	 * 상품설명출력여부
	 */
	@ApiModelProperty(
		name = "prdDesOupYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("prdDesOupYn")
	@BxmOmm_Field(length=1, decimal=0, description="상품설명출력여부", align="left", fill="")
	private String prdDesOupYn= "";
	
	
	/**
	 * 자동이체여부
	 */
	@ApiModelProperty(
		name = "atsYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atsYn")
	@BxmOmm_Field(length=1, decimal=0, description="자동이체여부", align="left", fill="")
	private String atsYn= "";
	
	
	/**
	 * 자동이체시작일자
	 */
	@ApiModelProperty(
		name = "atsStaDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atsStaDt")
	@BxmOmm_Field(length=8, decimal=0, description="자동이체시작일자", align="left", fill="")
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
	@BxmOmm_Field(length=8, decimal=0, description="자동이체종료일자", align="left", fill="")
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
	@BxmOmm_Field(length=19, decimal=3, description="자동이체금액", align="right", fill="0")
	private BigDecimal atsAm= new BigDecimal("0");
	
	
	/**
	 * 자동이체일
	 */
	@ApiModelProperty(
		name = "atsDd"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("atsDd")
	@BxmOmm_Field(length=2, decimal=0, description="자동이체일", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=N"})
	private Integer atsDd= 0;
	
	
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
	 * 적금적립이체시작요일구분코드
	 */
	@ApiModelProperty(
		name = "insvAcldTsStaWkdDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("insvAcldTsStaWkdDscd")
	@BxmOmm_Field(length=1, decimal=0, description="적금적립이체시작요일구분코드", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String insvAcldTsStaWkdDscd= "";
	
	
	/**
	 * 고객기부단체코드
	 */
	@ApiModelProperty(
		name = "cusDntnAscnCd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("cusDntnAscnCd")
	@BxmOmm_Field(length=3, decimal=0, description="고객기부단체코드", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String cusDntnAscnCd= "";
	
	
	/**
	 * 고객지정상품명
	 */
	@ApiModelProperty(
		name = "cusDgnPrdNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("cusDgnPrdNm")
	@BxmOmm_Field(length=50, decimal=0, description="고객지정상품명", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String cusDgnPrdNm= "";
	
	
	/**
	 * 목적자금명
	 */
	@ApiModelProperty(
		name = "aimFdNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("aimFdNm")
	@BxmOmm_Field(length=40, decimal=0, description="목적자금명", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String aimFdNm= "";
	
	
	/**
	 * 꿈적금목표금액
	 */
	@ApiModelProperty(
		name = "dinsvGoalAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("dinsvGoalAm")
	@BxmOmm_Field(length=19, decimal=3, description="꿈적금목표금액", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal dinsvGoalAm= new BigDecimal("0");
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_wdrAcno= false;
	protected final boolean isSet_wdrAcno(){
		return this.isSet_wdrAcno;
	}
	private void setIsSet_wdrAcno(boolean value){
		this.isSet_wdrAcno= value;
	}
	/**
	 * 출금계좌번호
	 */
	@XmlTransient
	public String getWdrAcno(){
		return this.wdrAcno;
	}
	
	/**
	 * 출금계좌번호
	 * 
	 * @param wdrAcno 출금계좌번호
	 */
	public void setWdrAcno(String wdrAcno){
		this.wdrAcno= wdrAcno;
		this.setIsSet_wdrAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_actPwnoUsgYn= false;
	protected final boolean isSet_actPwnoUsgYn(){
		return this.isSet_actPwnoUsgYn;
	}
	private void setIsSet_actPwnoUsgYn(boolean value){
		this.isSet_actPwnoUsgYn= value;
	}
	/**
	 * 계좌비밀번호사용여부
	 */
	@XmlTransient
	public String getActPwnoUsgYn(){
		return this.actPwnoUsgYn;
	}
	
	/**
	 * 계좌비밀번호사용여부
	 * 
	 * @param actPwnoUsgYn 계좌비밀번호사용여부
	 */
	public void setActPwnoUsgYn(String actPwnoUsgYn){
		this.actPwnoUsgYn= actPwnoUsgYn;
		this.setIsSet_actPwnoUsgYn(true);
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
	private boolean isSet_cucd= false;
	protected final boolean isSet_cucd(){
		return this.isSet_cucd;
	}
	private void setIsSet_cucd(boolean value){
		this.isSet_cucd= value;
	}
	/**
	 * 통화코드
	 */
	@XmlTransient
	public String getCucd(){
		return this.cucd;
	}
	
	/**
	 * 통화코드
	 * 
	 * @param cucd 통화코드
	 */
	public void setCucd(String cucd){
		this.cucd= cucd;
		this.setIsSet_cucd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_csno= false;
	protected final boolean isSet_csno(){
		return this.isSet_csno;
	}
	private void setIsSet_csno(boolean value){
		this.isSet_csno= value;
	}
	/**
	 * 고객번호
	 */
	@XmlTransient
	public String getCsno(){
		return this.csno;
	}
	
	/**
	 * 고객번호
	 * 
	 * @param csno 고객번호
	 */
	public void setCsno(String csno){
		this.csno= csno;
		this.setIsSet_csno(true);
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
	private boolean isSet_newAm= false;
	protected final boolean isSet_newAm(){
		return this.isSet_newAm;
	}
	private void setIsSet_newAm(boolean value){
		this.isSet_newAm= value;
	}
	/**
	 * 신규금액
	 * BigDecimal - Double value setter
	 *
	 * @Param newAm 신규금액
	 */
	public void setNewAm(double newAm) {
		setNewAm(BigDecimal.valueOf(newAm));
	}
	/**
	 * 신규금액
	 * BigDecimal - Long value setter
	 *
	 * @Param newAm 신규금액
	 */
	public void setNewAm(long newAm) {
		setNewAm(BigDecimal.valueOf(newAm));
	}
	/**
	 * 신규금액
	 * BigDecimal - String value setter
	 *
	 * @Param newAm 신규금액
	 */
	public void setNewAm(String newAm) {
		setNewAm(new BigDecimal(newAm));
	}
	/**
	 * 신규금액
	 */
	@XmlTransient
	public BigDecimal getNewAm(){
		return this.newAm;
	}
	
	/**
	 * 신규금액
	 * 
	 * @param newAm 신규금액
	 */
	@JsonSetter("newAm")
	public void setNewAm(BigDecimal newAm){
		this.newAm= newAm;
		this.setIsSet_newAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ctrtmMcn= false;
	protected final boolean isSet_ctrtmMcn(){
		return this.isSet_ctrtmMcn;
	}
	private void setIsSet_ctrtmMcn(boolean value){
		this.isSet_ctrtmMcn= value;
	}
	/**
	 * 계약기간월수
	 */
	@XmlTransient
	public Integer getCtrtmMcn(){
		return this.ctrtmMcn;
	}
	
	/**
	 * 계약기간월수
	 * 
	 * @param ctrtmMcn 계약기간월수
	 */
	public void setCtrtmMcn(Integer ctrtmMcn){
		this.ctrtmMcn= ctrtmMcn;
		this.setIsSet_ctrtmMcn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_synpbDscd= false;
	protected final boolean isSet_synpbDscd(){
		return this.isSet_synpbDscd;
	}
	private void setIsSet_synpbDscd(boolean value){
		this.isSet_synpbDscd= value;
	}
	/**
	 * 종합통장구분코드
	 */
	@XmlTransient
	public String getSynpbDscd(){
		return this.synpbDscd;
	}
	
	/**
	 * 종합통장구분코드
	 * 
	 * @param synpbDscd 종합통장구분코드
	 */
	public void setSynpbDscd(String synpbDscd){
		this.synpbDscd= synpbDscd;
		this.setIsSet_synpbDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_actMngBrcd= false;
	protected final boolean isSet_actMngBrcd(){
		return this.isSet_actMngBrcd;
	}
	private void setIsSet_actMngBrcd(boolean value){
		this.isSet_actMngBrcd= value;
	}
	/**
	 * 계좌관리점코드
	 */
	@XmlTransient
	public String getActMngBrcd(){
		return this.actMngBrcd;
	}
	
	/**
	 * 계좌관리점코드
	 * 
	 * @param actMngBrcd 계좌관리점코드
	 */
	public void setActMngBrcd(String actMngBrcd){
		this.actMngBrcd= actMngBrcd;
		this.setIsSet_actMngBrcd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_bchrCponNo= false;
	protected final boolean isSet_bchrCponNo(){
		return this.isSet_bchrCponNo;
	}
	private void setIsSet_bchrCponNo(boolean value){
		this.isSet_bchrCponNo= value;
	}
	/**
	 * 바우처쿠폰번호
	 */
	@XmlTransient
	public String getBchrCponNo(){
		return this.bchrCponNo;
	}
	
	/**
	 * 바우처쿠폰번호
	 * 
	 * @param bchrCponNo 바우처쿠폰번호
	 */
	public void setBchrCponNo(String bchrCponNo){
		this.bchrCponNo= bchrCponNo;
		this.setIsSet_bchrCponNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_encyDpsActPwno= false;
	protected final boolean isSet_encyDpsActPwno(){
		return this.isSet_encyDpsActPwno;
	}
	private void setIsSet_encyDpsActPwno(boolean value){
		this.isSet_encyDpsActPwno= value;
	}
	/**
	 * 암호화수신계좌비밀번호
	 */
	@XmlTransient
	public String getEncyDpsActPwno(){
		return this.encyDpsActPwno;
	}
	
	/**
	 * 암호화수신계좌비밀번호
	 * 
	 * @param encyDpsActPwno 암호화수신계좌비밀번호
	 */
	public void setEncyDpsActPwno(String encyDpsActPwno){
		this.encyDpsActPwno= encyDpsActPwno;
		this.setIsSet_encyDpsActPwno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_fncTrnAimCollDis= false;
	protected final boolean isSet_fncTrnAimCollDis(){
		return this.isSet_fncTrnAimCollDis;
	}
	private void setIsSet_fncTrnAimCollDis(boolean value){
		this.isSet_fncTrnAimCollDis= value;
	}
	/**
	 * 금융거래목적징구구분
	 */
	@XmlTransient
	public String getFncTrnAimCollDis(){
		return this.fncTrnAimCollDis;
	}
	
	/**
	 * 금융거래목적징구구분
	 * 
	 * @param fncTrnAimCollDis 금융거래목적징구구분
	 */
	public void setFncTrnAimCollDis(String fncTrnAimCollDis){
		this.fncTrnAimCollDis= fncTrnAimCollDis;
		this.setIsSet_fncTrnAimCollDis(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_nrsrCnfDocCollYn= false;
	protected final boolean isSet_nrsrCnfDocCollYn(){
		return this.isSet_nrsrCnfDocCollYn;
	}
	private void setIsSet_nrsrCnfDocCollYn(boolean value){
		this.isSet_nrsrCnfDocCollYn= value;
	}
	/**
	 * 비거주자확인서류징구여부
	 */
	@XmlTransient
	public String getNrsrCnfDocCollYn(){
		return this.nrsrCnfDocCollYn;
	}
	
	/**
	 * 비거주자확인서류징구여부
	 * 
	 * @param nrsrCnfDocCollYn 비거주자확인서류징구여부
	 */
	public void setNrsrCnfDocCollYn(String nrsrCnfDocCollYn){
		this.nrsrCnfDocCollYn= nrsrCnfDocCollYn;
		this.setIsSet_nrsrCnfDocCollYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_psnInfAgmdMngNo= false;
	protected final boolean isSet_psnInfAgmdMngNo(){
		return this.isSet_psnInfAgmdMngNo;
	}
	private void setIsSet_psnInfAgmdMngNo(boolean value){
		this.isSet_psnInfAgmdMngNo= value;
	}
	/**
	 * 개인정보동의서관리번호
	 */
	@XmlTransient
	public String getPsnInfAgmdMngNo(){
		return this.psnInfAgmdMngNo;
	}
	
	/**
	 * 개인정보동의서관리번호
	 * 
	 * @param psnInfAgmdMngNo 개인정보동의서관리번호
	 */
	public void setPsnInfAgmdMngNo(String psnInfAgmdMngNo){
		this.psnInfAgmdMngNo= psnInfAgmdMngNo;
		this.setIsSet_psnInfAgmdMngNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_smsdDscd= false;
	protected final boolean isSet_smsdDscd(){
		return this.isSet_smsdDscd;
	}
	private void setIsSet_smsdDscd(boolean value){
		this.isSet_smsdDscd= value;
	}
	/**
	 * SMS발송구분코드
	 */
	@XmlTransient
	public String getSmsdDscd(){
		return this.smsdDscd;
	}
	
	/**
	 * SMS발송구분코드
	 * 
	 * @param smsdDscd SMS발송구분코드
	 */
	public void setSmsdDscd(String smsdDscd){
		this.smsdDscd= smsdDscd;
		this.setIsSet_smsdDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_advpeEno= false;
	protected final boolean isSet_advpeEno(){
		return this.isSet_advpeEno;
	}
	private void setIsSet_advpeEno(boolean value){
		this.isSet_advpeEno= value;
	}
	/**
	 * 권유자직원번호
	 */
	@XmlTransient
	public String getAdvpeEno(){
		return this.advpeEno;
	}
	
	/**
	 * 권유자직원번호
	 * 
	 * @param advpeEno 권유자직원번호
	 */
	public void setAdvpeEno(String advpeEno){
		this.advpeEno= advpeEno;
		this.setIsSet_advpeEno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_agnpeEncyRrno= false;
	protected final boolean isSet_agnpeEncyRrno(){
		return this.isSet_agnpeEncyRrno;
	}
	private void setIsSet_agnpeEncyRrno(boolean value){
		this.isSet_agnpeEncyRrno= value;
	}
	/**
	 * 대리인암호화주민등록번호
	 */
	@XmlTransient
	public String getAgnpeEncyRrno(){
		return this.agnpeEncyRrno;
	}
	
	/**
	 * 대리인암호화주민등록번호
	 * 
	 * @param agnpeEncyRrno 대리인암호화주민등록번호
	 */
	public void setAgnpeEncyRrno(String agnpeEncyRrno){
		this.agnpeEncyRrno= agnpeEncyRrno;
		this.setIsSet_agnpeEncyRrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rppeEncyRrno= false;
	protected final boolean isSet_rppeEncyRrno(){
		return this.isSet_rppeEncyRrno;
	}
	private void setIsSet_rppeEncyRrno(boolean value){
		this.isSet_rppeEncyRrno= value;
	}
	/**
	 * 대표자암호화주민등록번호
	 */
	@XmlTransient
	public String getRppeEncyRrno(){
		return this.rppeEncyRrno;
	}
	
	/**
	 * 대표자암호화주민등록번호
	 * 
	 * @param rppeEncyRrno 대표자암호화주민등록번호
	 */
	public void setRppeEncyRrno(String rppeEncyRrno){
		this.rppeEncyRrno= rppeEncyRrno;
		this.setIsSet_rppeEncyRrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_agnpeFnm= false;
	protected final boolean isSet_agnpeFnm(){
		return this.isSet_agnpeFnm;
	}
	private void setIsSet_agnpeFnm(boolean value){
		this.isSet_agnpeFnm= value;
	}
	/**
	 * 대리인성명
	 */
	@XmlTransient
	public String getAgnpeFnm(){
		return this.agnpeFnm;
	}
	
	/**
	 * 대리인성명
	 * 
	 * @param agnpeFnm 대리인성명
	 */
	public void setAgnpeFnm(String agnpeFnm){
		this.agnpeFnm= agnpeFnm;
		this.setIsSet_agnpeFnm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rppeFnm= false;
	protected final boolean isSet_rppeFnm(){
		return this.isSet_rppeFnm;
	}
	private void setIsSet_rppeFnm(boolean value){
		this.isSet_rppeFnm= value;
	}
	/**
	 * 대표자성명
	 */
	@XmlTransient
	public String getRppeFnm(){
		return this.rppeFnm;
	}
	
	/**
	 * 대표자성명
	 * 
	 * @param rppeFnm 대표자성명
	 */
	public void setRppeFnm(String rppeFnm){
		this.rppeFnm= rppeFnm;
		this.setIsSet_rppeFnm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_prdDesOupYn= false;
	protected final boolean isSet_prdDesOupYn(){
		return this.isSet_prdDesOupYn;
	}
	private void setIsSet_prdDesOupYn(boolean value){
		this.isSet_prdDesOupYn= value;
	}
	/**
	 * 상품설명출력여부
	 */
	@XmlTransient
	public String getPrdDesOupYn(){
		return this.prdDesOupYn;
	}
	
	/**
	 * 상품설명출력여부
	 * 
	 * @param prdDesOupYn 상품설명출력여부
	 */
	public void setPrdDesOupYn(String prdDesOupYn){
		this.prdDesOupYn= prdDesOupYn;
		this.setIsSet_prdDesOupYn(true);
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
	private boolean isSet_insvAcldTsStaWkdDscd= false;
	protected final boolean isSet_insvAcldTsStaWkdDscd(){
		return this.isSet_insvAcldTsStaWkdDscd;
	}
	private void setIsSet_insvAcldTsStaWkdDscd(boolean value){
		this.isSet_insvAcldTsStaWkdDscd= value;
	}
	/**
	 * 적금적립이체시작요일구분코드
	 */
	@XmlTransient
	public String getInsvAcldTsStaWkdDscd(){
		return this.insvAcldTsStaWkdDscd;
	}
	
	/**
	 * 적금적립이체시작요일구분코드
	 * 
	 * @param insvAcldTsStaWkdDscd 적금적립이체시작요일구분코드
	 */
	public void setInsvAcldTsStaWkdDscd(String insvAcldTsStaWkdDscd){
		this.insvAcldTsStaWkdDscd= insvAcldTsStaWkdDscd;
		this.setIsSet_insvAcldTsStaWkdDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cusDntnAscnCd= false;
	protected final boolean isSet_cusDntnAscnCd(){
		return this.isSet_cusDntnAscnCd;
	}
	private void setIsSet_cusDntnAscnCd(boolean value){
		this.isSet_cusDntnAscnCd= value;
	}
	/**
	 * 고객기부단체코드
	 */
	@XmlTransient
	public String getCusDntnAscnCd(){
		return this.cusDntnAscnCd;
	}
	
	/**
	 * 고객기부단체코드
	 * 
	 * @param cusDntnAscnCd 고객기부단체코드
	 */
	public void setCusDntnAscnCd(String cusDntnAscnCd){
		this.cusDntnAscnCd= cusDntnAscnCd;
		this.setIsSet_cusDntnAscnCd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cusDgnPrdNm= false;
	protected final boolean isSet_cusDgnPrdNm(){
		return this.isSet_cusDgnPrdNm;
	}
	private void setIsSet_cusDgnPrdNm(boolean value){
		this.isSet_cusDgnPrdNm= value;
	}
	/**
	 * 고객지정상품명
	 */
	@XmlTransient
	public String getCusDgnPrdNm(){
		return this.cusDgnPrdNm;
	}
	
	/**
	 * 고객지정상품명
	 * 
	 * @param cusDgnPrdNm 고객지정상품명
	 */
	public void setCusDgnPrdNm(String cusDgnPrdNm){
		this.cusDgnPrdNm= cusDgnPrdNm;
		this.setIsSet_cusDgnPrdNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_aimFdNm= false;
	protected final boolean isSet_aimFdNm(){
		return this.isSet_aimFdNm;
	}
	private void setIsSet_aimFdNm(boolean value){
		this.isSet_aimFdNm= value;
	}
	/**
	 * 목적자금명
	 */
	@XmlTransient
	public String getAimFdNm(){
		return this.aimFdNm;
	}
	
	/**
	 * 목적자금명
	 * 
	 * @param aimFdNm 목적자금명
	 */
	public void setAimFdNm(String aimFdNm){
		this.aimFdNm= aimFdNm;
		this.setIsSet_aimFdNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dinsvGoalAm= false;
	protected final boolean isSet_dinsvGoalAm(){
		return this.isSet_dinsvGoalAm;
	}
	private void setIsSet_dinsvGoalAm(boolean value){
		this.isSet_dinsvGoalAm= value;
	}
	/**
	 * 꿈적금목표금액
	 * BigDecimal - Double value setter
	 *
	 * @Param dinsvGoalAm 꿈적금목표금액
	 */
	public void setDinsvGoalAm(double dinsvGoalAm) {
		setDinsvGoalAm(BigDecimal.valueOf(dinsvGoalAm));
	}
	/**
	 * 꿈적금목표금액
	 * BigDecimal - Long value setter
	 *
	 * @Param dinsvGoalAm 꿈적금목표금액
	 */
	public void setDinsvGoalAm(long dinsvGoalAm) {
		setDinsvGoalAm(BigDecimal.valueOf(dinsvGoalAm));
	}
	/**
	 * 꿈적금목표금액
	 * BigDecimal - String value setter
	 *
	 * @Param dinsvGoalAm 꿈적금목표금액
	 */
	public void setDinsvGoalAm(String dinsvGoalAm) {
		setDinsvGoalAm(new BigDecimal(dinsvGoalAm));
	}
	/**
	 * 꿈적금목표금액
	 */
	@XmlTransient
	public BigDecimal getDinsvGoalAm(){
		return this.dinsvGoalAm;
	}
	
	/**
	 * 꿈적금목표금액
	 * 
	 * @param dinsvGoalAm 꿈적금목표금액
	 */
	@JsonSetter("dinsvGoalAm")
	public void setDinsvGoalAm(BigDecimal dinsvGoalAm){
		this.dinsvGoalAm= dinsvGoalAm;
		this.setIsSet_dinsvGoalAm(true);
	}
				
	@Override
	public SHRMNPWallBizInsertMnpChidAcno_DIDT clone(){
		try{
			SHRMNPWallBizInsertMnpChidAcno_DIDT object= (SHRMNPWallBizInsertMnpChidAcno_DIDT)super.clone();
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
		
		result= prime * result + ((this.wdrAcno==null)?0:this.wdrAcno.hashCode());
		result= prime * result + ((this.actPwnoUsgYn==null)?0:this.actPwnoUsgYn.hashCode());
		result= prime * result + ((this.encyWdrActPwno==null)?0:this.encyWdrActPwno.hashCode());
		result= prime * result + ((this.cucd==null)?0:this.cucd.hashCode());
		result= prime * result + ((this.csno==null)?0:this.csno.hashCode());
		result= prime * result + ((this.pdcd==null)?0:this.pdcd.hashCode());
		result= prime * result + ((this.newAm==null)?0:this.newAm.hashCode());
		result= prime * result + ((this.ctrtmMcn==null)?0:this.ctrtmMcn.hashCode());
		result= prime * result + ((this.synpbDscd==null)?0:this.synpbDscd.hashCode());
		result= prime * result + ((this.actMngBrcd==null)?0:this.actMngBrcd.hashCode());
		result= prime * result + ((this.bchrCponNo==null)?0:this.bchrCponNo.hashCode());
		result= prime * result + ((this.encyDpsActPwno==null)?0:this.encyDpsActPwno.hashCode());
		result= prime * result + ((this.fncTrnAimCollDis==null)?0:this.fncTrnAimCollDis.hashCode());
		result= prime * result + ((this.nrsrCnfDocCollYn==null)?0:this.nrsrCnfDocCollYn.hashCode());
		result= prime * result + ((this.psnInfAgmdMngNo==null)?0:this.psnInfAgmdMngNo.hashCode());
		result= prime * result + ((this.smsdDscd==null)?0:this.smsdDscd.hashCode());
		result= prime * result + ((this.advpeEno==null)?0:this.advpeEno.hashCode());
		result= prime * result + ((this.agnpeEncyRrno==null)?0:this.agnpeEncyRrno.hashCode());
		result= prime * result + ((this.rppeEncyRrno==null)?0:this.rppeEncyRrno.hashCode());
		result= prime * result + ((this.agnpeFnm==null)?0:this.agnpeFnm.hashCode());
		result= prime * result + ((this.rppeFnm==null)?0:this.rppeFnm.hashCode());
		result= prime * result + ((this.prdDesOupYn==null)?0:this.prdDesOupYn.hashCode());
		result= prime * result + ((this.atsYn==null)?0:this.atsYn.hashCode());
		result= prime * result + ((this.atsStaDt==null)?0:this.atsStaDt.hashCode());
		result= prime * result + ((this.atsEndDt==null)?0:this.atsEndDt.hashCode());
		result= prime * result + ((this.atsAm==null)?0:this.atsAm.hashCode());
		result= prime * result + ((this.atsDd==null)?0:this.atsDd.hashCode());
		result= prime * result + ((this.atsCycd==null)?0:this.atsCycd.hashCode());
		result= prime * result + ((this.insvAcldTsStaWkdDscd==null)?0:this.insvAcldTsStaWkdDscd.hashCode());
		result= prime * result + ((this.cusDntnAscnCd==null)?0:this.cusDntnAscnCd.hashCode());
		result= prime * result + ((this.cusDgnPrdNm==null)?0:this.cusDgnPrdNm.hashCode());
		result= prime * result + ((this.aimFdNm==null)?0:this.aimFdNm.hashCode());
		result= prime * result + ((this.dinsvGoalAm==null)?0:this.dinsvGoalAm.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final SHRMNPWallBizInsertMnpChidAcno_DIDT other= (SHRMNPWallBizInsertMnpChidAcno_DIDT)obj;
		{
			Object _wdrAcno= getWdrAcno();
			Object __wdrAcno= other.getWdrAcno();
			if ( _wdrAcno== null ) { if ( __wdrAcno!= null ) return false; }
			else if ( !_wdrAcno.equals(__wdrAcno) ) return false;
		}
		{
			Object _actPwnoUsgYn= getActPwnoUsgYn();
			Object __actPwnoUsgYn= other.getActPwnoUsgYn();
			if ( _actPwnoUsgYn== null ) { if ( __actPwnoUsgYn!= null ) return false; }
			else if ( !_actPwnoUsgYn.equals(__actPwnoUsgYn) ) return false;
		}
		{
			Object _encyWdrActPwno= getEncyWdrActPwno();
			Object __encyWdrActPwno= other.getEncyWdrActPwno();
			if ( _encyWdrActPwno== null ) { if ( __encyWdrActPwno!= null ) return false; }
			else if ( !_encyWdrActPwno.equals(__encyWdrActPwno) ) return false;
		}
		{
			Object _cucd= getCucd();
			Object __cucd= other.getCucd();
			if ( _cucd== null ) { if ( __cucd!= null ) return false; }
			else if ( !_cucd.equals(__cucd) ) return false;
		}
		{
			Object _csno= getCsno();
			Object __csno= other.getCsno();
			if ( _csno== null ) { if ( __csno!= null ) return false; }
			else if ( !_csno.equals(__csno) ) return false;
		}
		{
			Object _pdcd= getPdcd();
			Object __pdcd= other.getPdcd();
			if ( _pdcd== null ) { if ( __pdcd!= null ) return false; }
			else if ( !_pdcd.equals(__pdcd) ) return false;
		}
		{
			Object _newAm= getNewAm();
			Object __newAm= other.getNewAm();
			if ( _newAm== null ) { if ( __newAm!= null ) return false; }
			else if ( !_newAm.equals(__newAm) ) return false;
		}
		{
			Object _ctrtmMcn= getCtrtmMcn();
			Object __ctrtmMcn= other.getCtrtmMcn();
			if ( _ctrtmMcn== null ) { if ( __ctrtmMcn!= null ) return false; }
			else if ( !_ctrtmMcn.equals(__ctrtmMcn) ) return false;
		}
		{
			Object _synpbDscd= getSynpbDscd();
			Object __synpbDscd= other.getSynpbDscd();
			if ( _synpbDscd== null ) { if ( __synpbDscd!= null ) return false; }
			else if ( !_synpbDscd.equals(__synpbDscd) ) return false;
		}
		{
			Object _actMngBrcd= getActMngBrcd();
			Object __actMngBrcd= other.getActMngBrcd();
			if ( _actMngBrcd== null ) { if ( __actMngBrcd!= null ) return false; }
			else if ( !_actMngBrcd.equals(__actMngBrcd) ) return false;
		}
		{
			Object _bchrCponNo= getBchrCponNo();
			Object __bchrCponNo= other.getBchrCponNo();
			if ( _bchrCponNo== null ) { if ( __bchrCponNo!= null ) return false; }
			else if ( !_bchrCponNo.equals(__bchrCponNo) ) return false;
		}
		{
			Object _encyDpsActPwno= getEncyDpsActPwno();
			Object __encyDpsActPwno= other.getEncyDpsActPwno();
			if ( _encyDpsActPwno== null ) { if ( __encyDpsActPwno!= null ) return false; }
			else if ( !_encyDpsActPwno.equals(__encyDpsActPwno) ) return false;
		}
		{
			Object _fncTrnAimCollDis= getFncTrnAimCollDis();
			Object __fncTrnAimCollDis= other.getFncTrnAimCollDis();
			if ( _fncTrnAimCollDis== null ) { if ( __fncTrnAimCollDis!= null ) return false; }
			else if ( !_fncTrnAimCollDis.equals(__fncTrnAimCollDis) ) return false;
		}
		{
			Object _nrsrCnfDocCollYn= getNrsrCnfDocCollYn();
			Object __nrsrCnfDocCollYn= other.getNrsrCnfDocCollYn();
			if ( _nrsrCnfDocCollYn== null ) { if ( __nrsrCnfDocCollYn!= null ) return false; }
			else if ( !_nrsrCnfDocCollYn.equals(__nrsrCnfDocCollYn) ) return false;
		}
		{
			Object _psnInfAgmdMngNo= getPsnInfAgmdMngNo();
			Object __psnInfAgmdMngNo= other.getPsnInfAgmdMngNo();
			if ( _psnInfAgmdMngNo== null ) { if ( __psnInfAgmdMngNo!= null ) return false; }
			else if ( !_psnInfAgmdMngNo.equals(__psnInfAgmdMngNo) ) return false;
		}
		{
			Object _smsdDscd= getSmsdDscd();
			Object __smsdDscd= other.getSmsdDscd();
			if ( _smsdDscd== null ) { if ( __smsdDscd!= null ) return false; }
			else if ( !_smsdDscd.equals(__smsdDscd) ) return false;
		}
		{
			Object _advpeEno= getAdvpeEno();
			Object __advpeEno= other.getAdvpeEno();
			if ( _advpeEno== null ) { if ( __advpeEno!= null ) return false; }
			else if ( !_advpeEno.equals(__advpeEno) ) return false;
		}
		{
			Object _agnpeEncyRrno= getAgnpeEncyRrno();
			Object __agnpeEncyRrno= other.getAgnpeEncyRrno();
			if ( _agnpeEncyRrno== null ) { if ( __agnpeEncyRrno!= null ) return false; }
			else if ( !_agnpeEncyRrno.equals(__agnpeEncyRrno) ) return false;
		}
		{
			Object _rppeEncyRrno= getRppeEncyRrno();
			Object __rppeEncyRrno= other.getRppeEncyRrno();
			if ( _rppeEncyRrno== null ) { if ( __rppeEncyRrno!= null ) return false; }
			else if ( !_rppeEncyRrno.equals(__rppeEncyRrno) ) return false;
		}
		{
			Object _agnpeFnm= getAgnpeFnm();
			Object __agnpeFnm= other.getAgnpeFnm();
			if ( _agnpeFnm== null ) { if ( __agnpeFnm!= null ) return false; }
			else if ( !_agnpeFnm.equals(__agnpeFnm) ) return false;
		}
		{
			Object _rppeFnm= getRppeFnm();
			Object __rppeFnm= other.getRppeFnm();
			if ( _rppeFnm== null ) { if ( __rppeFnm!= null ) return false; }
			else if ( !_rppeFnm.equals(__rppeFnm) ) return false;
		}
		{
			Object _prdDesOupYn= getPrdDesOupYn();
			Object __prdDesOupYn= other.getPrdDesOupYn();
			if ( _prdDesOupYn== null ) { if ( __prdDesOupYn!= null ) return false; }
			else if ( !_prdDesOupYn.equals(__prdDesOupYn) ) return false;
		}
		{
			Object _atsYn= getAtsYn();
			Object __atsYn= other.getAtsYn();
			if ( _atsYn== null ) { if ( __atsYn!= null ) return false; }
			else if ( !_atsYn.equals(__atsYn) ) return false;
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
			Object _atsDd= getAtsDd();
			Object __atsDd= other.getAtsDd();
			if ( _atsDd== null ) { if ( __atsDd!= null ) return false; }
			else if ( !_atsDd.equals(__atsDd) ) return false;
		}
		{
			Object _atsCycd= getAtsCycd();
			Object __atsCycd= other.getAtsCycd();
			if ( _atsCycd== null ) { if ( __atsCycd!= null ) return false; }
			else if ( !_atsCycd.equals(__atsCycd) ) return false;
		}
		{
			Object _insvAcldTsStaWkdDscd= getInsvAcldTsStaWkdDscd();
			Object __insvAcldTsStaWkdDscd= other.getInsvAcldTsStaWkdDscd();
			if ( _insvAcldTsStaWkdDscd== null ) { if ( __insvAcldTsStaWkdDscd!= null ) return false; }
			else if ( !_insvAcldTsStaWkdDscd.equals(__insvAcldTsStaWkdDscd) ) return false;
		}
		{
			Object _cusDntnAscnCd= getCusDntnAscnCd();
			Object __cusDntnAscnCd= other.getCusDntnAscnCd();
			if ( _cusDntnAscnCd== null ) { if ( __cusDntnAscnCd!= null ) return false; }
			else if ( !_cusDntnAscnCd.equals(__cusDntnAscnCd) ) return false;
		}
		{
			Object _cusDgnPrdNm= getCusDgnPrdNm();
			Object __cusDgnPrdNm= other.getCusDgnPrdNm();
			if ( _cusDgnPrdNm== null ) { if ( __cusDgnPrdNm!= null ) return false; }
			else if ( !_cusDgnPrdNm.equals(__cusDgnPrdNm) ) return false;
		}
		{
			Object _aimFdNm= getAimFdNm();
			Object __aimFdNm= other.getAimFdNm();
			if ( _aimFdNm== null ) { if ( __aimFdNm!= null ) return false; }
			else if ( !_aimFdNm.equals(__aimFdNm) ) return false;
		}
		{
			Object _dinsvGoalAm= getDinsvGoalAm();
			Object __dinsvGoalAm= other.getDinsvGoalAm();
			if ( _dinsvGoalAm== null ) { if ( __dinsvGoalAm!= null ) return false; }
			else if ( !_dinsvGoalAm.equals(__dinsvGoalAm) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(SHRMNPWallBizInsertMnpChidAcno_DIDT.class.getName()).append(":\n");
		sb.append("\twdrAcno: ");
		sb.append(wdrAcno==null?"null":getWdrAcno());
		sb.append("\n");
		sb.append("\tactPwnoUsgYn: ");
		sb.append(actPwnoUsgYn==null?"null":getActPwnoUsgYn());
		sb.append("\n");
		sb.append("\tencyWdrActPwno: ");
		sb.append(encyWdrActPwno==null?"null":getEncyWdrActPwno());
		sb.append("\n");
		sb.append("\tcucd: ");
		sb.append(cucd==null?"null":getCucd());
		sb.append("\n");
		sb.append("\tcsno: ");
		sb.append(csno==null?"null":getCsno());
		sb.append("\n");
		sb.append("\tpdcd: ");
		sb.append(pdcd==null?"null":getPdcd());
		sb.append("\n");
		sb.append("\tnewAm: ");
		sb.append(newAm==null?"null":getNewAm());
		sb.append("\n");
		sb.append("\tctrtmMcn: ");
		sb.append(ctrtmMcn==null?"null":getCtrtmMcn());
		sb.append("\n");
		sb.append("\tsynpbDscd: ");
		sb.append(synpbDscd==null?"null":getSynpbDscd());
		sb.append("\n");
		sb.append("\tactMngBrcd: ");
		sb.append(actMngBrcd==null?"null":getActMngBrcd());
		sb.append("\n");
		sb.append("\tbchrCponNo: ");
		sb.append(bchrCponNo==null?"null":getBchrCponNo());
		sb.append("\n");
		sb.append("\tencyDpsActPwno: ");
		sb.append(encyDpsActPwno==null?"null":getEncyDpsActPwno());
		sb.append("\n");
		sb.append("\tfncTrnAimCollDis: ");
		sb.append(fncTrnAimCollDis==null?"null":getFncTrnAimCollDis());
		sb.append("\n");
		sb.append("\tnrsrCnfDocCollYn: ");
		sb.append(nrsrCnfDocCollYn==null?"null":getNrsrCnfDocCollYn());
		sb.append("\n");
		sb.append("\tpsnInfAgmdMngNo: ");
		sb.append(psnInfAgmdMngNo==null?"null":getPsnInfAgmdMngNo());
		sb.append("\n");
		sb.append("\tsmsdDscd: ");
		sb.append(smsdDscd==null?"null":getSmsdDscd());
		sb.append("\n");
		sb.append("\tadvpeEno: ");
		sb.append(advpeEno==null?"null":getAdvpeEno());
		sb.append("\n");
		sb.append("\tagnpeEncyRrno: ");
		sb.append(agnpeEncyRrno==null?"null":getAgnpeEncyRrno());
		sb.append("\n");
		sb.append("\trppeEncyRrno: ");
		sb.append(rppeEncyRrno==null?"null":getRppeEncyRrno());
		sb.append("\n");
		sb.append("\tagnpeFnm: ");
		sb.append(agnpeFnm==null?"null":getAgnpeFnm());
		sb.append("\n");
		sb.append("\trppeFnm: ");
		sb.append(rppeFnm==null?"null":getRppeFnm());
		sb.append("\n");
		sb.append("\tprdDesOupYn: ");
		sb.append(prdDesOupYn==null?"null":getPrdDesOupYn());
		sb.append("\n");
		sb.append("\tatsYn: ");
		sb.append(atsYn==null?"null":getAtsYn());
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
		sb.append("\tatsDd: ");
		sb.append(atsDd==null?"null":getAtsDd());
		sb.append("\n");
		sb.append("\tatsCycd: ");
		sb.append(atsCycd==null?"null":getAtsCycd());
		sb.append("\n");
		sb.append("\tinsvAcldTsStaWkdDscd: ");
		sb.append(insvAcldTsStaWkdDscd==null?"null":getInsvAcldTsStaWkdDscd());
		sb.append("\n");
		sb.append("\tcusDntnAscnCd: ");
		sb.append(cusDntnAscnCd==null?"null":getCusDntnAscnCd());
		sb.append("\n");
		sb.append("\tcusDgnPrdNm: ");
		sb.append(cusDgnPrdNm==null?"null":getCusDgnPrdNm());
		sb.append("\n");
		sb.append("\taimFdNm: ");
		sb.append(aimFdNm==null?"null":getAimFdNm());
		sb.append("\n");
		sb.append("\tdinsvGoalAm: ");
		sb.append(dinsvGoalAm==null?"null":getDinsvGoalAm());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 15; /* wdrAcno */
		messageLen+= 1; /* actPwnoUsgYn */
		messageLen+= 32; /* encyWdrActPwno */
		messageLen+= 3; /* cucd */
		messageLen+= 9; /* csno */
		messageLen+= 13; /* pdcd */
		messageLen+= 19; /* newAm */
		messageLen+= 3; /* ctrtmMcn */
		messageLen+= 1; /* synpbDscd */
		messageLen+= 6; /* actMngBrcd */
		messageLen+= 8; /* bchrCponNo */
		messageLen+= 32; /* encyDpsActPwno */
		messageLen+= 1; /* fncTrnAimCollDis */
		messageLen+= 1; /* nrsrCnfDocCollYn */
		messageLen+= 19; /* psnInfAgmdMngNo */
		messageLen+= 1; /* smsdDscd */
		messageLen+= 8; /* advpeEno */
		messageLen+= 32; /* agnpeEncyRrno */
		messageLen+= 32; /* rppeEncyRrno */
		messageLen+= 30; /* agnpeFnm */
		messageLen+= 30; /* rppeFnm */
		messageLen+= 1; /* prdDesOupYn */
		messageLen+= 1; /* atsYn */
		messageLen+= 8; /* atsStaDt */
		messageLen+= 8; /* atsEndDt */
		messageLen+= 19; /* atsAm */
		messageLen+= 2; /* atsDd */
		messageLen+= 2; /* atsCycd */
		messageLen+= 1; /* insvAcldTsStaWkdDscd */
		messageLen+= 3; /* cusDntnAscnCd */
		messageLen+= 50; /* cusDgnPrdNm */
		messageLen+= 40; /* aimFdNm */
		messageLen+= 19; /* dinsvGoalAm */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("wdrAcno");
		list.add("actPwnoUsgYn");
		list.add("encyWdrActPwno");
		list.add("cucd");
		list.add("csno");
		list.add("pdcd");
		list.add("newAm");
		list.add("ctrtmMcn");
		list.add("synpbDscd");
		list.add("actMngBrcd");
		list.add("bchrCponNo");
		list.add("encyDpsActPwno");
		list.add("fncTrnAimCollDis");
		list.add("nrsrCnfDocCollYn");
		list.add("psnInfAgmdMngNo");
		list.add("smsdDscd");
		list.add("advpeEno");
		list.add("agnpeEncyRrno");
		list.add("rppeEncyRrno");
		list.add("agnpeFnm");
		list.add("rppeFnm");
		list.add("prdDesOupYn");
		list.add("atsYn");
		list.add("atsStaDt");
		list.add("atsEndDt");
		list.add("atsAm");
		list.add("atsDd");
		list.add("atsCycd");
		list.add("insvAcldTsStaWkdDscd");
		list.add("cusDntnAscnCd");
		list.add("cusDgnPrdNm");
		list.add("aimFdNm");
		list.add("dinsvGoalAm");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("wdrAcno", get("wdrAcno"));
		map.put("actPwnoUsgYn", get("actPwnoUsgYn"));
		map.put("encyWdrActPwno", get("encyWdrActPwno"));
		map.put("cucd", get("cucd"));
		map.put("csno", get("csno"));
		map.put("pdcd", get("pdcd"));
		map.put("newAm", get("newAm"));
		map.put("ctrtmMcn", get("ctrtmMcn"));
		map.put("synpbDscd", get("synpbDscd"));
		map.put("actMngBrcd", get("actMngBrcd"));
		map.put("bchrCponNo", get("bchrCponNo"));
		map.put("encyDpsActPwno", get("encyDpsActPwno"));
		map.put("fncTrnAimCollDis", get("fncTrnAimCollDis"));
		map.put("nrsrCnfDocCollYn", get("nrsrCnfDocCollYn"));
		map.put("psnInfAgmdMngNo", get("psnInfAgmdMngNo"));
		map.put("smsdDscd", get("smsdDscd"));
		map.put("advpeEno", get("advpeEno"));
		map.put("agnpeEncyRrno", get("agnpeEncyRrno"));
		map.put("rppeEncyRrno", get("rppeEncyRrno"));
		map.put("agnpeFnm", get("agnpeFnm"));
		map.put("rppeFnm", get("rppeFnm"));
		map.put("prdDesOupYn", get("prdDesOupYn"));
		map.put("atsYn", get("atsYn"));
		map.put("atsStaDt", get("atsStaDt"));
		map.put("atsEndDt", get("atsEndDt"));
		map.put("atsAm", get("atsAm"));
		map.put("atsDd", get("atsDd"));
		map.put("atsCycd", get("atsCycd"));
		map.put("insvAcldTsStaWkdDscd", get("insvAcldTsStaWkdDscd"));
		map.put("cusDntnAscnCd", get("cusDntnAscnCd"));
		map.put("cusDgnPrdNm", get("cusDgnPrdNm"));
		map.put("aimFdNm", get("aimFdNm"));
		map.put("dinsvGoalAm", get("dinsvGoalAm"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 1208987208:/* wdrAcno */
			return getWdrAcno();
		case 1280416996:/* actPwnoUsgYn */
			return getActPwnoUsgYn();
		case 1115501300:/* encyWdrActPwno */
			return getEncyWdrActPwno();
		case 3064915:/* cucd */
			return getCucd();
		case 3063345:/* csno */
			return getCsno();
		case 3435861:/* pdcd */
			return getPdcd();
		case 104712684:/* newAm */
			return getNewAm();
		case -310048034:/* ctrtmMcn */
			return getCtrtmMcn();
		case 868086538:/* synpbDscd */
			return getSynpbDscd();
		case -1559022651:/* actMngBrcd */
			return getActMngBrcd();
		case 357035736:/* bchrCponNo */
			return getBchrCponNo();
		case 2082483858:/* encyDpsActPwno */
			return getEncyDpsActPwno();
		case 753956338:/* fncTrnAimCollDis */
			return getFncTrnAimCollDis();
		case 1256177185:/* nrsrCnfDocCollYn */
			return getNrsrCnfDocCollYn();
		case 1781700756:/* psnInfAgmdMngNo */
			return getPsnInfAgmdMngNo();
		case -99777029:/* smsdDscd */
			return getSmsdDscd();
		case -705281570:/* advpeEno */
			return getAdvpeEno();
		case 1004767133:/* agnpeEncyRrno */
			return getAgnpeEncyRrno();
		case 1521062227:/* rppeEncyRrno */
			return getRppeEncyRrno();
		case 1728197224:/* agnpeFnm */
			return getAgnpeFnm();
		case 1409183474:/* rppeFnm */
			return getRppeFnm();
		case 384871375:/* prdDesOupYn */
			return getPrdDesOupYn();
		case 93150677:/* atsYn */
			return getAtsYn();
		case 497678352:/* atsStaDt */
			return getAtsStaDt();
		case 484573195:/* atsEndDt */
			return getAtsEndDt();
		case 93149932:/* atsAm */
			return getAtsAm();
		case 93150016:/* atsDd */
			return getAtsDd();
		case -677154281:/* atsCycd */
			return getAtsCycd();
		case 900720545:/* insvAcldTsStaWkdDscd */
			return getInsvAcldTsStaWkdDscd();
		case 2129011747:/* cusDntnAscnCd */
			return getCusDntnAscnCd();
		case 1971532759:/* cusDgnPrdNm */
			return getCusDgnPrdNm();
		case -997547518:/* aimFdNm */
			return getAimFdNm();
		case -1667932565:/* dinsvGoalAm */
			return getDinsvGoalAm();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 1208987208:/* wdrAcno */
			setWdrAcno((String)value);
			break;
		case 1280416996:/* actPwnoUsgYn */
			setActPwnoUsgYn((String)value);
			break;
		case 1115501300:/* encyWdrActPwno */
			setEncyWdrActPwno((String)value);
			break;
		case 3064915:/* cucd */
			setCucd((String)value);
			break;
		case 3063345:/* csno */
			setCsno((String)value);
			break;
		case 3435861:/* pdcd */
			setPdcd((String)value);
			break;
		case 104712684:/* newAm */
			if ( value instanceof String ){
				setNewAm((String)value);
			}
			else if ( value instanceof Double ){
				setNewAm((Double)value);
			}
			else if ( value instanceof Long ){
				setNewAm((Long)value);
			}
			else{
				setNewAm((BigDecimal)value);
			}
			break;
		case -310048034:/* ctrtmMcn */
			setCtrtmMcn((Integer)value);
			break;
		case 868086538:/* synpbDscd */
			setSynpbDscd((String)value);
			break;
		case -1559022651:/* actMngBrcd */
			setActMngBrcd((String)value);
			break;
		case 357035736:/* bchrCponNo */
			setBchrCponNo((String)value);
			break;
		case 2082483858:/* encyDpsActPwno */
			setEncyDpsActPwno((String)value);
			break;
		case 753956338:/* fncTrnAimCollDis */
			setFncTrnAimCollDis((String)value);
			break;
		case 1256177185:/* nrsrCnfDocCollYn */
			setNrsrCnfDocCollYn((String)value);
			break;
		case 1781700756:/* psnInfAgmdMngNo */
			setPsnInfAgmdMngNo((String)value);
			break;
		case -99777029:/* smsdDscd */
			setSmsdDscd((String)value);
			break;
		case -705281570:/* advpeEno */
			setAdvpeEno((String)value);
			break;
		case 1004767133:/* agnpeEncyRrno */
			setAgnpeEncyRrno((String)value);
			break;
		case 1521062227:/* rppeEncyRrno */
			setRppeEncyRrno((String)value);
			break;
		case 1728197224:/* agnpeFnm */
			setAgnpeFnm((String)value);
			break;
		case 1409183474:/* rppeFnm */
			setRppeFnm((String)value);
			break;
		case 384871375:/* prdDesOupYn */
			setPrdDesOupYn((String)value);
			break;
		case 93150677:/* atsYn */
			setAtsYn((String)value);
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
		case 93150016:/* atsDd */
			setAtsDd((Integer)value);
			break;
		case -677154281:/* atsCycd */
			setAtsCycd((String)value);
			break;
		case 900720545:/* insvAcldTsStaWkdDscd */
			setInsvAcldTsStaWkdDscd((String)value);
			break;
		case 2129011747:/* cusDntnAscnCd */
			setCusDntnAscnCd((String)value);
			break;
		case 1971532759:/* cusDgnPrdNm */
			setCusDgnPrdNm((String)value);
			break;
		case -997547518:/* aimFdNm */
			setAimFdNm((String)value);
			break;
		case -1667932565:/* dinsvGoalAm */
			if ( value instanceof String ){
				setDinsvGoalAm((String)value);
			}
			else if ( value instanceof Double ){
				setDinsvGoalAm((Double)value);
			}
			else if ( value instanceof Long ){
				setDinsvGoalAm((Long)value);
			}
			else{
				setDinsvGoalAm((BigDecimal)value);
			}
			break;
		default:
			break;
		}
	}
	
}
