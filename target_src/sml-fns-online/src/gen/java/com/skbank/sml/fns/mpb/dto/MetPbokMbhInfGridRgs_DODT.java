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
	"metMbhSrno", "metMbhCtrStcd", "metMbhDscd", "utzpeNoCfcd", "ebnkUtzpeNo", "esnsMbhNo", "itcsno", "metMbhNm", "metMbhAlsNm", "mbpfPmtgtAm", "agmdCollDt", "metPtcpDt", "metPtcpTm", "metScssDt", "metScssTm"
	, "ancSndDscd", "rppeChgApvCd", "rppeChgApvDt"
}, name="MetPbokMbhInfGridRgs_DODT")
@XmlRootElement(name="MetPbokMbhInfGridRgs_DODT")
@BxmCategory(logicalName="모임통장.회원.정보.그리드.등록.DBM.출력.IO", description="") 
public class MetPbokMbhInfGridRgs_DODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -1633129140L;
	
	
	
	/**
	 * 모임회원일련번호
	 */
	@ApiModelProperty(
		name = "metMbhSrno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metMbhSrno")
	@BxmOmm_Field(length=7, decimal=0, description="모임회원일련번호", align="left", fill="")
	private String metMbhSrno= "";
	
	
	/**
	 * 모임회원계약상태코드
	 */
	@ApiModelProperty(
		name = "metMbhCtrStcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metMbhCtrStcd")
	@BxmOmm_Field(length=2, decimal=0, description="모임회원계약상태코드", align="left", fill="")
	private String metMbhCtrStcd= "";
	
	
	/**
	 * 모임회원구분코드
	 */
	@ApiModelProperty(
		name = "metMbhDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metMbhDscd")
	@BxmOmm_Field(length=1, decimal=0, description="모임회원구분코드", align="left", fill="")
	private String metMbhDscd= "";
	
	
	/**
	 * 이용자번호분류코드
	 */
	@ApiModelProperty(
		name = "utzpeNoCfcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("utzpeNoCfcd")
	@BxmOmm_Field(length=2, decimal=0, description="이용자번호분류코드", align="left", fill="")
	private String utzpeNoCfcd= "";
	
	
	/**
	 * 전자뱅킹이용자번호
	 */
	@ApiModelProperty(
		name = "ebnkUtzpeNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ebnkUtzpeNo")
	@BxmOmm_Field(length=13, decimal=0, description="전자뱅킹이용자번호", align="left", fill="", formatType="masking", format="M191")
	private String ebnkUtzpeNo= "";
	
	
	/**
	 * 간편회원번호
	 */
	@ApiModelProperty(
		name = "esnsMbhNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("esnsMbhNo")
	@BxmOmm_Field(length=11, decimal=0, description="간편회원번호", align="left", fill="")
	private String esnsMbhNo= "";
	
	
	/**
	 * 통합고객번호
	 */
	@ApiModelProperty(
		name = "itcsno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("itcsno")
	@BxmOmm_Field(length=36, decimal=0, description="통합고객번호", align="left", fill="")
	private String itcsno= "";
	
	
	/**
	 * 모임회원명
	 */
	@ApiModelProperty(
		name = "metMbhNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metMbhNm")
	@BxmOmm_Field(length=50, decimal=0, description="모임회원명", align="left", fill="")
	private String metMbhNm= "";
	
	
	/**
	 * 모임회원별칭명
	 */
	@ApiModelProperty(
		name = "metMbhAlsNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metMbhAlsNm")
	@BxmOmm_Field(length=40, decimal=0, description="모임회원별칭명", align="left", fill="")
	private String metMbhAlsNm= "";
	
	
	/**
	 * 회비납부대상금액
	 */
	@ApiModelProperty(
		name = "mbpfPmtgtAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("mbpfPmtgtAm")
	@BxmOmm_Field(length=18, decimal=3, description="회비납부대상금액", align="right", fill="")
	private BigDecimal mbpfPmtgtAm= new BigDecimal("0");
	
	
	/**
	 * 동의서징구일자
	 */
	@ApiModelProperty(
		name = "agmdCollDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("agmdCollDt")
	@BxmOmm_Field(length=8, decimal=0, description="동의서징구일자", align="left", fill="")
	private String agmdCollDt= "";
	
	
	/**
	 * 모임참여일자
	 */
	@ApiModelProperty(
		name = "metPtcpDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metPtcpDt")
	@BxmOmm_Field(length=8, decimal=0, description="모임참여일자", align="left", fill="")
	private String metPtcpDt= "";
	
	
	/**
	 * 모임참여시각
	 */
	@ApiModelProperty(
		name = "metPtcpTm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metPtcpTm")
	@BxmOmm_Field(length=6, decimal=0, description="모임참여시각", align="left", fill="")
	private String metPtcpTm= "";
	
	
	/**
	 * 모임탈퇴일자
	 */
	@ApiModelProperty(
		name = "metScssDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metScssDt")
	@BxmOmm_Field(length=8, decimal=0, description="모임탈퇴일자", align="left", fill="")
	private String metScssDt= "";
	
	
	/**
	 * 모임탈퇴시각
	 */
	@ApiModelProperty(
		name = "metScssTm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metScssTm")
	@BxmOmm_Field(length=6, decimal=0, description="모임탈퇴시각", align="left", fill="")
	private String metScssTm= "";
	
	
	/**
	 * 공지발송구분코드
	 */
	@ApiModelProperty(
		name = "ancSndDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ancSndDscd")
	@BxmOmm_Field(length=1, decimal=0, description="공지발송구분코드", align="left", fill="")
	private String ancSndDscd= "";
	
	
	/**
	 * 대표자변경승인코드
	 */
	@ApiModelProperty(
		name = "rppeChgApvCd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rppeChgApvCd")
	@BxmOmm_Field(length=1, decimal=0, description="대표자변경승인코드", align="left", fill="")
	private String rppeChgApvCd= "";
	
	
	/**
	 * 대표자변경승인일자
	 */
	@ApiModelProperty(
		name = "rppeChgApvDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rppeChgApvDt")
	@BxmOmm_Field(length=8, decimal=0, description="대표자변경승인일자", align="left", fill="")
	private String rppeChgApvDt= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metMbhSrno= false;
	protected final boolean isSet_metMbhSrno(){
		return this.isSet_metMbhSrno;
	}
	private void setIsSet_metMbhSrno(boolean value){
		this.isSet_metMbhSrno= value;
	}
	/**
	 * 모임회원일련번호
	 */
	@XmlTransient
	public String getMetMbhSrno(){
		return this.metMbhSrno;
	}
	
	/**
	 * 모임회원일련번호
	 * 
	 * @param metMbhSrno 모임회원일련번호
	 */
	public void setMetMbhSrno(String metMbhSrno){
		this.metMbhSrno= metMbhSrno;
		this.setIsSet_metMbhSrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metMbhCtrStcd= false;
	protected final boolean isSet_metMbhCtrStcd(){
		return this.isSet_metMbhCtrStcd;
	}
	private void setIsSet_metMbhCtrStcd(boolean value){
		this.isSet_metMbhCtrStcd= value;
	}
	/**
	 * 모임회원계약상태코드
	 */
	@XmlTransient
	public String getMetMbhCtrStcd(){
		return this.metMbhCtrStcd;
	}
	
	/**
	 * 모임회원계약상태코드
	 * 
	 * @param metMbhCtrStcd 모임회원계약상태코드
	 */
	public void setMetMbhCtrStcd(String metMbhCtrStcd){
		this.metMbhCtrStcd= metMbhCtrStcd;
		this.setIsSet_metMbhCtrStcd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metMbhDscd= false;
	protected final boolean isSet_metMbhDscd(){
		return this.isSet_metMbhDscd;
	}
	private void setIsSet_metMbhDscd(boolean value){
		this.isSet_metMbhDscd= value;
	}
	/**
	 * 모임회원구분코드
	 */
	@XmlTransient
	public String getMetMbhDscd(){
		return this.metMbhDscd;
	}
	
	/**
	 * 모임회원구분코드
	 * 
	 * @param metMbhDscd 모임회원구분코드
	 */
	public void setMetMbhDscd(String metMbhDscd){
		this.metMbhDscd= metMbhDscd;
		this.setIsSet_metMbhDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_utzpeNoCfcd= false;
	protected final boolean isSet_utzpeNoCfcd(){
		return this.isSet_utzpeNoCfcd;
	}
	private void setIsSet_utzpeNoCfcd(boolean value){
		this.isSet_utzpeNoCfcd= value;
	}
	/**
	 * 이용자번호분류코드
	 */
	@XmlTransient
	public String getUtzpeNoCfcd(){
		return this.utzpeNoCfcd;
	}
	
	/**
	 * 이용자번호분류코드
	 * 
	 * @param utzpeNoCfcd 이용자번호분류코드
	 */
	public void setUtzpeNoCfcd(String utzpeNoCfcd){
		this.utzpeNoCfcd= utzpeNoCfcd;
		this.setIsSet_utzpeNoCfcd(true);
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
	private boolean isSet_esnsMbhNo= false;
	protected final boolean isSet_esnsMbhNo(){
		return this.isSet_esnsMbhNo;
	}
	private void setIsSet_esnsMbhNo(boolean value){
		this.isSet_esnsMbhNo= value;
	}
	/**
	 * 간편회원번호
	 */
	@XmlTransient
	public String getEsnsMbhNo(){
		return this.esnsMbhNo;
	}
	
	/**
	 * 간편회원번호
	 * 
	 * @param esnsMbhNo 간편회원번호
	 */
	public void setEsnsMbhNo(String esnsMbhNo){
		this.esnsMbhNo= esnsMbhNo;
		this.setIsSet_esnsMbhNo(true);
	}
	
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
	private boolean isSet_metMbhNm= false;
	protected final boolean isSet_metMbhNm(){
		return this.isSet_metMbhNm;
	}
	private void setIsSet_metMbhNm(boolean value){
		this.isSet_metMbhNm= value;
	}
	/**
	 * 모임회원명
	 */
	@XmlTransient
	public String getMetMbhNm(){
		return this.metMbhNm;
	}
	
	/**
	 * 모임회원명
	 * 
	 * @param metMbhNm 모임회원명
	 */
	public void setMetMbhNm(String metMbhNm){
		this.metMbhNm= metMbhNm;
		this.setIsSet_metMbhNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metMbhAlsNm= false;
	protected final boolean isSet_metMbhAlsNm(){
		return this.isSet_metMbhAlsNm;
	}
	private void setIsSet_metMbhAlsNm(boolean value){
		this.isSet_metMbhAlsNm= value;
	}
	/**
	 * 모임회원별칭명
	 */
	@XmlTransient
	public String getMetMbhAlsNm(){
		return this.metMbhAlsNm;
	}
	
	/**
	 * 모임회원별칭명
	 * 
	 * @param metMbhAlsNm 모임회원별칭명
	 */
	public void setMetMbhAlsNm(String metMbhAlsNm){
		this.metMbhAlsNm= metMbhAlsNm;
		this.setIsSet_metMbhAlsNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mbpfPmtgtAm= false;
	protected final boolean isSet_mbpfPmtgtAm(){
		return this.isSet_mbpfPmtgtAm;
	}
	private void setIsSet_mbpfPmtgtAm(boolean value){
		this.isSet_mbpfPmtgtAm= value;
	}
	/**
	 * 회비납부대상금액
	 * BigDecimal - Double value setter
	 *
	 * @Param mbpfPmtgtAm 회비납부대상금액
	 */
	public void setMbpfPmtgtAm(double mbpfPmtgtAm) {
		setMbpfPmtgtAm(BigDecimal.valueOf(mbpfPmtgtAm));
	}
	/**
	 * 회비납부대상금액
	 * BigDecimal - Long value setter
	 *
	 * @Param mbpfPmtgtAm 회비납부대상금액
	 */
	public void setMbpfPmtgtAm(long mbpfPmtgtAm) {
		setMbpfPmtgtAm(BigDecimal.valueOf(mbpfPmtgtAm));
	}
	/**
	 * 회비납부대상금액
	 * BigDecimal - String value setter
	 *
	 * @Param mbpfPmtgtAm 회비납부대상금액
	 */
	public void setMbpfPmtgtAm(String mbpfPmtgtAm) {
		setMbpfPmtgtAm(new BigDecimal(mbpfPmtgtAm));
	}
	/**
	 * 회비납부대상금액
	 */
	@XmlTransient
	public BigDecimal getMbpfPmtgtAm(){
		return this.mbpfPmtgtAm;
	}
	
	/**
	 * 회비납부대상금액
	 * 
	 * @param mbpfPmtgtAm 회비납부대상금액
	 */
	@JsonSetter("mbpfPmtgtAm")
	public void setMbpfPmtgtAm(BigDecimal mbpfPmtgtAm){
		this.mbpfPmtgtAm= mbpfPmtgtAm;
		this.setIsSet_mbpfPmtgtAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_agmdCollDt= false;
	protected final boolean isSet_agmdCollDt(){
		return this.isSet_agmdCollDt;
	}
	private void setIsSet_agmdCollDt(boolean value){
		this.isSet_agmdCollDt= value;
	}
	/**
	 * 동의서징구일자
	 */
	@XmlTransient
	public String getAgmdCollDt(){
		return this.agmdCollDt;
	}
	
	/**
	 * 동의서징구일자
	 * 
	 * @param agmdCollDt 동의서징구일자
	 */
	public void setAgmdCollDt(String agmdCollDt){
		this.agmdCollDt= agmdCollDt;
		this.setIsSet_agmdCollDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metPtcpDt= false;
	protected final boolean isSet_metPtcpDt(){
		return this.isSet_metPtcpDt;
	}
	private void setIsSet_metPtcpDt(boolean value){
		this.isSet_metPtcpDt= value;
	}
	/**
	 * 모임참여일자
	 */
	@XmlTransient
	public String getMetPtcpDt(){
		return this.metPtcpDt;
	}
	
	/**
	 * 모임참여일자
	 * 
	 * @param metPtcpDt 모임참여일자
	 */
	public void setMetPtcpDt(String metPtcpDt){
		this.metPtcpDt= metPtcpDt;
		this.setIsSet_metPtcpDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metPtcpTm= false;
	protected final boolean isSet_metPtcpTm(){
		return this.isSet_metPtcpTm;
	}
	private void setIsSet_metPtcpTm(boolean value){
		this.isSet_metPtcpTm= value;
	}
	/**
	 * 모임참여시각
	 */
	@XmlTransient
	public String getMetPtcpTm(){
		return this.metPtcpTm;
	}
	
	/**
	 * 모임참여시각
	 * 
	 * @param metPtcpTm 모임참여시각
	 */
	public void setMetPtcpTm(String metPtcpTm){
		this.metPtcpTm= metPtcpTm;
		this.setIsSet_metPtcpTm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metScssDt= false;
	protected final boolean isSet_metScssDt(){
		return this.isSet_metScssDt;
	}
	private void setIsSet_metScssDt(boolean value){
		this.isSet_metScssDt= value;
	}
	/**
	 * 모임탈퇴일자
	 */
	@XmlTransient
	public String getMetScssDt(){
		return this.metScssDt;
	}
	
	/**
	 * 모임탈퇴일자
	 * 
	 * @param metScssDt 모임탈퇴일자
	 */
	public void setMetScssDt(String metScssDt){
		this.metScssDt= metScssDt;
		this.setIsSet_metScssDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metScssTm= false;
	protected final boolean isSet_metScssTm(){
		return this.isSet_metScssTm;
	}
	private void setIsSet_metScssTm(boolean value){
		this.isSet_metScssTm= value;
	}
	/**
	 * 모임탈퇴시각
	 */
	@XmlTransient
	public String getMetScssTm(){
		return this.metScssTm;
	}
	
	/**
	 * 모임탈퇴시각
	 * 
	 * @param metScssTm 모임탈퇴시각
	 */
	public void setMetScssTm(String metScssTm){
		this.metScssTm= metScssTm;
		this.setIsSet_metScssTm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ancSndDscd= false;
	protected final boolean isSet_ancSndDscd(){
		return this.isSet_ancSndDscd;
	}
	private void setIsSet_ancSndDscd(boolean value){
		this.isSet_ancSndDscd= value;
	}
	/**
	 * 공지발송구분코드
	 */
	@XmlTransient
	public String getAncSndDscd(){
		return this.ancSndDscd;
	}
	
	/**
	 * 공지발송구분코드
	 * 
	 * @param ancSndDscd 공지발송구분코드
	 */
	public void setAncSndDscd(String ancSndDscd){
		this.ancSndDscd= ancSndDscd;
		this.setIsSet_ancSndDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rppeChgApvCd= false;
	protected final boolean isSet_rppeChgApvCd(){
		return this.isSet_rppeChgApvCd;
	}
	private void setIsSet_rppeChgApvCd(boolean value){
		this.isSet_rppeChgApvCd= value;
	}
	/**
	 * 대표자변경승인코드
	 */
	@XmlTransient
	public String getRppeChgApvCd(){
		return this.rppeChgApvCd;
	}
	
	/**
	 * 대표자변경승인코드
	 * 
	 * @param rppeChgApvCd 대표자변경승인코드
	 */
	public void setRppeChgApvCd(String rppeChgApvCd){
		this.rppeChgApvCd= rppeChgApvCd;
		this.setIsSet_rppeChgApvCd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rppeChgApvDt= false;
	protected final boolean isSet_rppeChgApvDt(){
		return this.isSet_rppeChgApvDt;
	}
	private void setIsSet_rppeChgApvDt(boolean value){
		this.isSet_rppeChgApvDt= value;
	}
	/**
	 * 대표자변경승인일자
	 */
	@XmlTransient
	public String getRppeChgApvDt(){
		return this.rppeChgApvDt;
	}
	
	/**
	 * 대표자변경승인일자
	 * 
	 * @param rppeChgApvDt 대표자변경승인일자
	 */
	public void setRppeChgApvDt(String rppeChgApvDt){
		this.rppeChgApvDt= rppeChgApvDt;
		this.setIsSet_rppeChgApvDt(true);
	}
				
	@Override
	public MetPbokMbhInfGridRgs_DODT clone(){
		try{
			MetPbokMbhInfGridRgs_DODT object= (MetPbokMbhInfGridRgs_DODT)super.clone();
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
		
		result= prime * result + ((this.metMbhSrno==null)?0:this.metMbhSrno.hashCode());
		result= prime * result + ((this.metMbhCtrStcd==null)?0:this.metMbhCtrStcd.hashCode());
		result= prime * result + ((this.metMbhDscd==null)?0:this.metMbhDscd.hashCode());
		result= prime * result + ((this.utzpeNoCfcd==null)?0:this.utzpeNoCfcd.hashCode());
		result= prime * result + ((this.ebnkUtzpeNo==null)?0:this.ebnkUtzpeNo.hashCode());
		result= prime * result + ((this.esnsMbhNo==null)?0:this.esnsMbhNo.hashCode());
		result= prime * result + ((this.itcsno==null)?0:this.itcsno.hashCode());
		result= prime * result + ((this.metMbhNm==null)?0:this.metMbhNm.hashCode());
		result= prime * result + ((this.metMbhAlsNm==null)?0:this.metMbhAlsNm.hashCode());
		result= prime * result + ((this.mbpfPmtgtAm==null)?0:this.mbpfPmtgtAm.hashCode());
		result= prime * result + ((this.agmdCollDt==null)?0:this.agmdCollDt.hashCode());
		result= prime * result + ((this.metPtcpDt==null)?0:this.metPtcpDt.hashCode());
		result= prime * result + ((this.metPtcpTm==null)?0:this.metPtcpTm.hashCode());
		result= prime * result + ((this.metScssDt==null)?0:this.metScssDt.hashCode());
		result= prime * result + ((this.metScssTm==null)?0:this.metScssTm.hashCode());
		result= prime * result + ((this.ancSndDscd==null)?0:this.ancSndDscd.hashCode());
		result= prime * result + ((this.rppeChgApvCd==null)?0:this.rppeChgApvCd.hashCode());
		result= prime * result + ((this.rppeChgApvDt==null)?0:this.rppeChgApvDt.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MetPbokMbhInfGridRgs_DODT other= (MetPbokMbhInfGridRgs_DODT)obj;
		{
			Object _metMbhSrno= getMetMbhSrno();
			Object __metMbhSrno= other.getMetMbhSrno();
			if ( _metMbhSrno== null ) { if ( __metMbhSrno!= null ) return false; }
			else if ( !_metMbhSrno.equals(__metMbhSrno) ) return false;
		}
		{
			Object _metMbhCtrStcd= getMetMbhCtrStcd();
			Object __metMbhCtrStcd= other.getMetMbhCtrStcd();
			if ( _metMbhCtrStcd== null ) { if ( __metMbhCtrStcd!= null ) return false; }
			else if ( !_metMbhCtrStcd.equals(__metMbhCtrStcd) ) return false;
		}
		{
			Object _metMbhDscd= getMetMbhDscd();
			Object __metMbhDscd= other.getMetMbhDscd();
			if ( _metMbhDscd== null ) { if ( __metMbhDscd!= null ) return false; }
			else if ( !_metMbhDscd.equals(__metMbhDscd) ) return false;
		}
		{
			Object _utzpeNoCfcd= getUtzpeNoCfcd();
			Object __utzpeNoCfcd= other.getUtzpeNoCfcd();
			if ( _utzpeNoCfcd== null ) { if ( __utzpeNoCfcd!= null ) return false; }
			else if ( !_utzpeNoCfcd.equals(__utzpeNoCfcd) ) return false;
		}
		{
			Object _ebnkUtzpeNo= getEbnkUtzpeNo();
			Object __ebnkUtzpeNo= other.getEbnkUtzpeNo();
			if ( _ebnkUtzpeNo== null ) { if ( __ebnkUtzpeNo!= null ) return false; }
			else if ( !_ebnkUtzpeNo.equals(__ebnkUtzpeNo) ) return false;
		}
		{
			Object _esnsMbhNo= getEsnsMbhNo();
			Object __esnsMbhNo= other.getEsnsMbhNo();
			if ( _esnsMbhNo== null ) { if ( __esnsMbhNo!= null ) return false; }
			else if ( !_esnsMbhNo.equals(__esnsMbhNo) ) return false;
		}
		{
			Object _itcsno= getItcsno();
			Object __itcsno= other.getItcsno();
			if ( _itcsno== null ) { if ( __itcsno!= null ) return false; }
			else if ( !_itcsno.equals(__itcsno) ) return false;
		}
		{
			Object _metMbhNm= getMetMbhNm();
			Object __metMbhNm= other.getMetMbhNm();
			if ( _metMbhNm== null ) { if ( __metMbhNm!= null ) return false; }
			else if ( !_metMbhNm.equals(__metMbhNm) ) return false;
		}
		{
			Object _metMbhAlsNm= getMetMbhAlsNm();
			Object __metMbhAlsNm= other.getMetMbhAlsNm();
			if ( _metMbhAlsNm== null ) { if ( __metMbhAlsNm!= null ) return false; }
			else if ( !_metMbhAlsNm.equals(__metMbhAlsNm) ) return false;
		}
		{
			Object _mbpfPmtgtAm= getMbpfPmtgtAm();
			Object __mbpfPmtgtAm= other.getMbpfPmtgtAm();
			if ( _mbpfPmtgtAm== null ) { if ( __mbpfPmtgtAm!= null ) return false; }
			else if ( !_mbpfPmtgtAm.equals(__mbpfPmtgtAm) ) return false;
		}
		{
			Object _agmdCollDt= getAgmdCollDt();
			Object __agmdCollDt= other.getAgmdCollDt();
			if ( _agmdCollDt== null ) { if ( __agmdCollDt!= null ) return false; }
			else if ( !_agmdCollDt.equals(__agmdCollDt) ) return false;
		}
		{
			Object _metPtcpDt= getMetPtcpDt();
			Object __metPtcpDt= other.getMetPtcpDt();
			if ( _metPtcpDt== null ) { if ( __metPtcpDt!= null ) return false; }
			else if ( !_metPtcpDt.equals(__metPtcpDt) ) return false;
		}
		{
			Object _metPtcpTm= getMetPtcpTm();
			Object __metPtcpTm= other.getMetPtcpTm();
			if ( _metPtcpTm== null ) { if ( __metPtcpTm!= null ) return false; }
			else if ( !_metPtcpTm.equals(__metPtcpTm) ) return false;
		}
		{
			Object _metScssDt= getMetScssDt();
			Object __metScssDt= other.getMetScssDt();
			if ( _metScssDt== null ) { if ( __metScssDt!= null ) return false; }
			else if ( !_metScssDt.equals(__metScssDt) ) return false;
		}
		{
			Object _metScssTm= getMetScssTm();
			Object __metScssTm= other.getMetScssTm();
			if ( _metScssTm== null ) { if ( __metScssTm!= null ) return false; }
			else if ( !_metScssTm.equals(__metScssTm) ) return false;
		}
		{
			Object _ancSndDscd= getAncSndDscd();
			Object __ancSndDscd= other.getAncSndDscd();
			if ( _ancSndDscd== null ) { if ( __ancSndDscd!= null ) return false; }
			else if ( !_ancSndDscd.equals(__ancSndDscd) ) return false;
		}
		{
			Object _rppeChgApvCd= getRppeChgApvCd();
			Object __rppeChgApvCd= other.getRppeChgApvCd();
			if ( _rppeChgApvCd== null ) { if ( __rppeChgApvCd!= null ) return false; }
			else if ( !_rppeChgApvCd.equals(__rppeChgApvCd) ) return false;
		}
		{
			Object _rppeChgApvDt= getRppeChgApvDt();
			Object __rppeChgApvDt= other.getRppeChgApvDt();
			if ( _rppeChgApvDt== null ) { if ( __rppeChgApvDt!= null ) return false; }
			else if ( !_rppeChgApvDt.equals(__rppeChgApvDt) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MetPbokMbhInfGridRgs_DODT.class.getName()).append(":\n");
		sb.append("\tmetMbhSrno: ");
		sb.append(metMbhSrno==null?"null":getMetMbhSrno());
		sb.append("\n");
		sb.append("\tmetMbhCtrStcd: ");
		sb.append(metMbhCtrStcd==null?"null":getMetMbhCtrStcd());
		sb.append("\n");
		sb.append("\tmetMbhDscd: ");
		sb.append(metMbhDscd==null?"null":getMetMbhDscd());
		sb.append("\n");
		sb.append("\tutzpeNoCfcd: ");
		sb.append(utzpeNoCfcd==null?"null":getUtzpeNoCfcd());
		sb.append("\n");
		sb.append("\tebnkUtzpeNo: ");
		sb.append(ebnkUtzpeNo==null?"null":getEbnkUtzpeNo().toString().replaceAll(".", "."));
		sb.append("\n");
		sb.append("\tesnsMbhNo: ");
		sb.append(esnsMbhNo==null?"null":getEsnsMbhNo());
		sb.append("\n");
		sb.append("\titcsno: ");
		sb.append(itcsno==null?"null":getItcsno());
		sb.append("\n");
		sb.append("\tmetMbhNm: ");
		sb.append(metMbhNm==null?"null":getMetMbhNm());
		sb.append("\n");
		sb.append("\tmetMbhAlsNm: ");
		sb.append(metMbhAlsNm==null?"null":getMetMbhAlsNm());
		sb.append("\n");
		sb.append("\tmbpfPmtgtAm: ");
		sb.append(mbpfPmtgtAm==null?"null":getMbpfPmtgtAm());
		sb.append("\n");
		sb.append("\tagmdCollDt: ");
		sb.append(agmdCollDt==null?"null":getAgmdCollDt());
		sb.append("\n");
		sb.append("\tmetPtcpDt: ");
		sb.append(metPtcpDt==null?"null":getMetPtcpDt());
		sb.append("\n");
		sb.append("\tmetPtcpTm: ");
		sb.append(metPtcpTm==null?"null":getMetPtcpTm());
		sb.append("\n");
		sb.append("\tmetScssDt: ");
		sb.append(metScssDt==null?"null":getMetScssDt());
		sb.append("\n");
		sb.append("\tmetScssTm: ");
		sb.append(metScssTm==null?"null":getMetScssTm());
		sb.append("\n");
		sb.append("\tancSndDscd: ");
		sb.append(ancSndDscd==null?"null":getAncSndDscd());
		sb.append("\n");
		sb.append("\trppeChgApvCd: ");
		sb.append(rppeChgApvCd==null?"null":getRppeChgApvCd());
		sb.append("\n");
		sb.append("\trppeChgApvDt: ");
		sb.append(rppeChgApvDt==null?"null":getRppeChgApvDt());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 7; /* metMbhSrno */
		messageLen+= 2; /* metMbhCtrStcd */
		messageLen+= 1; /* metMbhDscd */
		messageLen+= 2; /* utzpeNoCfcd */
		messageLen+= 13; /* ebnkUtzpeNo */
		messageLen+= 11; /* esnsMbhNo */
		messageLen+= 36; /* itcsno */
		messageLen+= 50; /* metMbhNm */
		messageLen+= 40; /* metMbhAlsNm */
		messageLen+= 18; /* mbpfPmtgtAm */
		messageLen+= 8; /* agmdCollDt */
		messageLen+= 8; /* metPtcpDt */
		messageLen+= 6; /* metPtcpTm */
		messageLen+= 8; /* metScssDt */
		messageLen+= 6; /* metScssTm */
		messageLen+= 1; /* ancSndDscd */
		messageLen+= 1; /* rppeChgApvCd */
		messageLen+= 8; /* rppeChgApvDt */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("metMbhSrno");
		list.add("metMbhCtrStcd");
		list.add("metMbhDscd");
		list.add("utzpeNoCfcd");
		list.add("ebnkUtzpeNo");
		list.add("esnsMbhNo");
		list.add("itcsno");
		list.add("metMbhNm");
		list.add("metMbhAlsNm");
		list.add("mbpfPmtgtAm");
		list.add("agmdCollDt");
		list.add("metPtcpDt");
		list.add("metPtcpTm");
		list.add("metScssDt");
		list.add("metScssTm");
		list.add("ancSndDscd");
		list.add("rppeChgApvCd");
		list.add("rppeChgApvDt");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("metMbhSrno", get("metMbhSrno"));
		map.put("metMbhCtrStcd", get("metMbhCtrStcd"));
		map.put("metMbhDscd", get("metMbhDscd"));
		map.put("utzpeNoCfcd", get("utzpeNoCfcd"));
		map.put("ebnkUtzpeNo", get("ebnkUtzpeNo"));
		map.put("esnsMbhNo", get("esnsMbhNo"));
		map.put("itcsno", get("itcsno"));
		map.put("metMbhNm", get("metMbhNm"));
		map.put("metMbhAlsNm", get("metMbhAlsNm"));
		map.put("mbpfPmtgtAm", get("mbpfPmtgtAm"));
		map.put("agmdCollDt", get("agmdCollDt"));
		map.put("metPtcpDt", get("metPtcpDt"));
		map.put("metPtcpTm", get("metPtcpTm"));
		map.put("metScssDt", get("metScssDt"));
		map.put("metScssTm", get("metScssTm"));
		map.put("ancSndDscd", get("ancSndDscd"));
		map.put("rppeChgApvCd", get("rppeChgApvCd"));
		map.put("rppeChgApvDt", get("rppeChgApvDt"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 715721463:/* metMbhSrno */
			return getMetMbhSrno();
		case 585522764:/* metMbhCtrStcd */
			return getMetMbhCtrStcd();
		case 715275207:/* metMbhDscd */
			return getMetMbhDscd();
		case 1125715573:/* utzpeNoCfcd */
			return getUtzpeNoCfcd();
		case -1070809513:/* ebnkUtzpeNo */
			return getEbnkUtzpeNo();
		case -1396906143:/* esnsMbhNo */
			return getEsnsMbhNo();
		case -1178714660:/* itcsno */
			return getItcsno();
		case -468528618:/* metMbhNm */
			return getMetMbhNm();
		case 695730640:/* metMbhAlsNm */
			return getMetMbhAlsNm();
		case 1940639685:/* mbpfPmtgtAm */
			return getMbpfPmtgtAm();
		case -1798348999:/* agmdCollDt */
			return getAgmdCollDt();
		case -1537091875:/* metPtcpDt */
			return getMetPtcpDt();
		case -1537091386:/* metPtcpTm */
			return getMetPtcpTm();
		case -1466424740:/* metScssDt */
			return getMetScssDt();
		case -1466424251:/* metScssTm */
			return getMetScssTm();
		case 1498154883:/* ancSndDscd */
			return getAncSndDscd();
		case 1364049721:/* rppeChgApvCd */
			return getRppeChgApvCd();
		case 1364049768:/* rppeChgApvDt */
			return getRppeChgApvDt();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 715721463:/* metMbhSrno */
			setMetMbhSrno((String)value);
			break;
		case 585522764:/* metMbhCtrStcd */
			setMetMbhCtrStcd((String)value);
			break;
		case 715275207:/* metMbhDscd */
			setMetMbhDscd((String)value);
			break;
		case 1125715573:/* utzpeNoCfcd */
			setUtzpeNoCfcd((String)value);
			break;
		case -1070809513:/* ebnkUtzpeNo */
			setEbnkUtzpeNo((String)value);
			break;
		case -1396906143:/* esnsMbhNo */
			setEsnsMbhNo((String)value);
			break;
		case -1178714660:/* itcsno */
			setItcsno((String)value);
			break;
		case -468528618:/* metMbhNm */
			setMetMbhNm((String)value);
			break;
		case 695730640:/* metMbhAlsNm */
			setMetMbhAlsNm((String)value);
			break;
		case 1940639685:/* mbpfPmtgtAm */
			if ( value instanceof String ){
				setMbpfPmtgtAm((String)value);
			}
			else if ( value instanceof Double ){
				setMbpfPmtgtAm((Double)value);
			}
			else if ( value instanceof Long ){
				setMbpfPmtgtAm((Long)value);
			}
			else{
				setMbpfPmtgtAm((BigDecimal)value);
			}
			break;
		case -1798348999:/* agmdCollDt */
			setAgmdCollDt((String)value);
			break;
		case -1537091875:/* metPtcpDt */
			setMetPtcpDt((String)value);
			break;
		case -1537091386:/* metPtcpTm */
			setMetPtcpTm((String)value);
			break;
		case -1466424740:/* metScssDt */
			setMetScssDt((String)value);
			break;
		case -1466424251:/* metScssTm */
			setMetScssTm((String)value);
			break;
		case 1498154883:/* ancSndDscd */
			setAncSndDscd((String)value);
			break;
		case 1364049721:/* rppeChgApvCd */
			setRppeChgApvCd((String)value);
			break;
		case 1364049768:/* rppeChgApvDt */
			setRppeChgApvDt((String)value);
			break;
		default:
			break;
		}
	}
	
}
