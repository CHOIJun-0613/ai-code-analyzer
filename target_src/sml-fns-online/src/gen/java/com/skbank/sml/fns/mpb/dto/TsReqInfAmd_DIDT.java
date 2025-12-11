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
	"metMngNo", "tsReqDt", "tsReqMbhSrno", "tsReqSrno", "tsReqBkcd", "tsReqAcno", "tsReqAm", "tsCmplAm", "metTsReqStcd", "apvReqStcd", "tsReqTm", "metChifMbhSrno", "rvactOwacNm", "tsReqMemoTxt", "tsReqDelYn"
	, "metTsReqDscd", "trnSrno", "lstDbChgId", "lstDbChgDtm"
}, name="TsReqInfAmd_DIDT")
@XmlRootElement(name="TsReqInfAmd_DIDT")
@BxmCategory(logicalName="이체.요청.정보.수정.DBM.입력.IO", description="") 
public class TsReqInfAmd_DIDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -1392701364L;
	
	
	
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
	 * 이체요청일자
	 */
	@ApiModelProperty(
		name = "tsReqDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("tsReqDt")
	@BxmOmm_Field(length=8, decimal=0, description="이체요청일자", align="left", fill="")
	private String tsReqDt= "";
	
	
	/**
	 * 이체요청회원일련번호
	 */
	@ApiModelProperty(
		name = "tsReqMbhSrno"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("tsReqMbhSrno")
	@BxmOmm_Field(length=7, decimal=0, description="이체요청회원일련번호", align="right", fill="")
	private Integer tsReqMbhSrno= 0;
	
	
	/**
	 * 이체요청일련번호
	 */
	@ApiModelProperty(
		name = "tsReqSrno"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("tsReqSrno")
	@BxmOmm_Field(length=5, decimal=0, description="이체요청일련번호", align="right", fill="")
	private Integer tsReqSrno= 0;
	
	
	/**
	 * 이체요청은행코드
	 */
	@ApiModelProperty(
		name = "tsReqBkcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("tsReqBkcd")
	@BxmOmm_Field(length=3, decimal=0, description="이체요청은행코드", align="left", fill="")
	private String tsReqBkcd= "";
	
	
	/**
	 * 이체요청계좌번호
	 */
	@ApiModelProperty(
		name = "tsReqAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("tsReqAcno")
	@BxmOmm_Field(length=13, decimal=0, description="이체요청계좌번호", align="left", fill="")
	private String tsReqAcno= "";
	
	
	/**
	 * 이체요청금액
	 */
	@ApiModelProperty(
		name = "tsReqAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("tsReqAm")
	@BxmOmm_Field(length=18, decimal=3, description="이체요청금액", align="right", fill="")
	private BigDecimal tsReqAm= new BigDecimal("0");
	
	
	/**
	 * 이체완료금액
	 */
	@ApiModelProperty(
		name = "tsCmplAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("tsCmplAm")
	@BxmOmm_Field(length=18, decimal=3, description="이체완료금액", align="right", fill="")
	private BigDecimal tsCmplAm= new BigDecimal("0");
	
	
	/**
	 * 모임이체요청상태코드
	 */
	@ApiModelProperty(
		name = "metTsReqStcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metTsReqStcd")
	@BxmOmm_Field(length=1, decimal=0, description="모임이체요청상태코드", align="left", fill="")
	private String metTsReqStcd= "";
	
	
	/**
	 * 승인요청상태코드
	 */
	@ApiModelProperty(
		name = "apvReqStcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("apvReqStcd")
	@BxmOmm_Field(length=1, decimal=0, description="승인요청상태코드", align="left", fill="")
	private String apvReqStcd= "";
	
	
	/**
	 * 이체요청시각
	 */
	@ApiModelProperty(
		name = "tsReqTm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("tsReqTm")
	@BxmOmm_Field(length=6, decimal=0, description="이체요청시각", align="left", fill="")
	private String tsReqTm= "";
	
	
	/**
	 * 모임장회원일련번호
	 */
	@ApiModelProperty(
		name = "metChifMbhSrno"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("metChifMbhSrno")
	@BxmOmm_Field(length=7, decimal=0, description="모임장회원일련번호", align="right", fill="")
	private Integer metChifMbhSrno= 0;
	
	
	/**
	 * 입금계좌예금주명
	 */
	@ApiModelProperty(
		name = "rvactOwacNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rvactOwacNm")
	@BxmOmm_Field(length=60, decimal=0, description="입금계좌예금주명", align="left", fill="")
	private String rvactOwacNm= "";
	
	
	/**
	 * 이체요청메모내용
	 */
	@ApiModelProperty(
		name = "tsReqMemoTxt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("tsReqMemoTxt")
	@BxmOmm_Field(length=500, decimal=0, description="이체요청메모내용", align="left", fill="")
	private String tsReqMemoTxt= "";
	
	
	/**
	 * 이체요청삭제여부
	 */
	@ApiModelProperty(
		name = "tsReqDelYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("tsReqDelYn")
	@BxmOmm_Field(length=1, decimal=0, description="이체요청삭제여부", align="left", fill="")
	private String tsReqDelYn= "";
	
	
	/**
	 * 모임이체요청구분코드
	 */
	@ApiModelProperty(
		name = "metTsReqDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metTsReqDscd")
	@BxmOmm_Field(length=1, decimal=0, description="모임이체요청구분코드", align="left", fill="")
	private String metTsReqDscd= "";
	
	
	/**
	 * 거래일련번호
	 */
	@ApiModelProperty(
		name = "trnSrno"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("trnSrno")
	@BxmOmm_Field(length=8, decimal=0, description="거래일련번호", align="right", fill="")
	private Integer trnSrno= 0;
	
	
	/**
	 * 최종DB변경ID
	 */
	@ApiModelProperty(
		name = "lstDbChgId"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("lstDbChgId")
	@BxmOmm_Field(length=8, decimal=0, description="최종DB변경ID", align="left", fill="")
	private String lstDbChgId= "";
	
	
	/**
	 * 최종DB변경일시
	 */
	@ApiModelProperty(
		name = "lstDbChgDtm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("lstDbChgDtm")
	@BxmOmm_Field(length=20, decimal=0, description="최종DB변경일시", align="left", fill="")
	private String lstDbChgDtm= "";
	
	
	
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
	private boolean isSet_tsReqDt= false;
	protected final boolean isSet_tsReqDt(){
		return this.isSet_tsReqDt;
	}
	private void setIsSet_tsReqDt(boolean value){
		this.isSet_tsReqDt= value;
	}
	/**
	 * 이체요청일자
	 */
	@XmlTransient
	public String getTsReqDt(){
		return this.tsReqDt;
	}
	
	/**
	 * 이체요청일자
	 * 
	 * @param tsReqDt 이체요청일자
	 */
	public void setTsReqDt(String tsReqDt){
		this.tsReqDt= tsReqDt;
		this.setIsSet_tsReqDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_tsReqMbhSrno= false;
	protected final boolean isSet_tsReqMbhSrno(){
		return this.isSet_tsReqMbhSrno;
	}
	private void setIsSet_tsReqMbhSrno(boolean value){
		this.isSet_tsReqMbhSrno= value;
	}
	/**
	 * 이체요청회원일련번호
	 */
	@XmlTransient
	public Integer getTsReqMbhSrno(){
		return this.tsReqMbhSrno;
	}
	
	/**
	 * 이체요청회원일련번호
	 * 
	 * @param tsReqMbhSrno 이체요청회원일련번호
	 */
	public void setTsReqMbhSrno(Integer tsReqMbhSrno){
		this.tsReqMbhSrno= tsReqMbhSrno;
		this.setIsSet_tsReqMbhSrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_tsReqSrno= false;
	protected final boolean isSet_tsReqSrno(){
		return this.isSet_tsReqSrno;
	}
	private void setIsSet_tsReqSrno(boolean value){
		this.isSet_tsReqSrno= value;
	}
	/**
	 * 이체요청일련번호
	 */
	@XmlTransient
	public Integer getTsReqSrno(){
		return this.tsReqSrno;
	}
	
	/**
	 * 이체요청일련번호
	 * 
	 * @param tsReqSrno 이체요청일련번호
	 */
	public void setTsReqSrno(Integer tsReqSrno){
		this.tsReqSrno= tsReqSrno;
		this.setIsSet_tsReqSrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_tsReqBkcd= false;
	protected final boolean isSet_tsReqBkcd(){
		return this.isSet_tsReqBkcd;
	}
	private void setIsSet_tsReqBkcd(boolean value){
		this.isSet_tsReqBkcd= value;
	}
	/**
	 * 이체요청은행코드
	 */
	@XmlTransient
	public String getTsReqBkcd(){
		return this.tsReqBkcd;
	}
	
	/**
	 * 이체요청은행코드
	 * 
	 * @param tsReqBkcd 이체요청은행코드
	 */
	public void setTsReqBkcd(String tsReqBkcd){
		this.tsReqBkcd= tsReqBkcd;
		this.setIsSet_tsReqBkcd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_tsReqAcno= false;
	protected final boolean isSet_tsReqAcno(){
		return this.isSet_tsReqAcno;
	}
	private void setIsSet_tsReqAcno(boolean value){
		this.isSet_tsReqAcno= value;
	}
	/**
	 * 이체요청계좌번호
	 */
	@XmlTransient
	public String getTsReqAcno(){
		return this.tsReqAcno;
	}
	
	/**
	 * 이체요청계좌번호
	 * 
	 * @param tsReqAcno 이체요청계좌번호
	 */
	public void setTsReqAcno(String tsReqAcno){
		this.tsReqAcno= tsReqAcno;
		this.setIsSet_tsReqAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_tsReqAm= false;
	protected final boolean isSet_tsReqAm(){
		return this.isSet_tsReqAm;
	}
	private void setIsSet_tsReqAm(boolean value){
		this.isSet_tsReqAm= value;
	}
	/**
	 * 이체요청금액
	 * BigDecimal - Double value setter
	 *
	 * @Param tsReqAm 이체요청금액
	 */
	public void setTsReqAm(double tsReqAm) {
		setTsReqAm(BigDecimal.valueOf(tsReqAm));
	}
	/**
	 * 이체요청금액
	 * BigDecimal - Long value setter
	 *
	 * @Param tsReqAm 이체요청금액
	 */
	public void setTsReqAm(long tsReqAm) {
		setTsReqAm(BigDecimal.valueOf(tsReqAm));
	}
	/**
	 * 이체요청금액
	 * BigDecimal - String value setter
	 *
	 * @Param tsReqAm 이체요청금액
	 */
	public void setTsReqAm(String tsReqAm) {
		setTsReqAm(new BigDecimal(tsReqAm));
	}
	/**
	 * 이체요청금액
	 */
	@XmlTransient
	public BigDecimal getTsReqAm(){
		return this.tsReqAm;
	}
	
	/**
	 * 이체요청금액
	 * 
	 * @param tsReqAm 이체요청금액
	 */
	@JsonSetter("tsReqAm")
	public void setTsReqAm(BigDecimal tsReqAm){
		this.tsReqAm= tsReqAm;
		this.setIsSet_tsReqAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_tsCmplAm= false;
	protected final boolean isSet_tsCmplAm(){
		return this.isSet_tsCmplAm;
	}
	private void setIsSet_tsCmplAm(boolean value){
		this.isSet_tsCmplAm= value;
	}
	/**
	 * 이체완료금액
	 * BigDecimal - Double value setter
	 *
	 * @Param tsCmplAm 이체완료금액
	 */
	public void setTsCmplAm(double tsCmplAm) {
		setTsCmplAm(BigDecimal.valueOf(tsCmplAm));
	}
	/**
	 * 이체완료금액
	 * BigDecimal - Long value setter
	 *
	 * @Param tsCmplAm 이체완료금액
	 */
	public void setTsCmplAm(long tsCmplAm) {
		setTsCmplAm(BigDecimal.valueOf(tsCmplAm));
	}
	/**
	 * 이체완료금액
	 * BigDecimal - String value setter
	 *
	 * @Param tsCmplAm 이체완료금액
	 */
	public void setTsCmplAm(String tsCmplAm) {
		setTsCmplAm(new BigDecimal(tsCmplAm));
	}
	/**
	 * 이체완료금액
	 */
	@XmlTransient
	public BigDecimal getTsCmplAm(){
		return this.tsCmplAm;
	}
	
	/**
	 * 이체완료금액
	 * 
	 * @param tsCmplAm 이체완료금액
	 */
	@JsonSetter("tsCmplAm")
	public void setTsCmplAm(BigDecimal tsCmplAm){
		this.tsCmplAm= tsCmplAm;
		this.setIsSet_tsCmplAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metTsReqStcd= false;
	protected final boolean isSet_metTsReqStcd(){
		return this.isSet_metTsReqStcd;
	}
	private void setIsSet_metTsReqStcd(boolean value){
		this.isSet_metTsReqStcd= value;
	}
	/**
	 * 모임이체요청상태코드
	 */
	@XmlTransient
	public String getMetTsReqStcd(){
		return this.metTsReqStcd;
	}
	
	/**
	 * 모임이체요청상태코드
	 * 
	 * @param metTsReqStcd 모임이체요청상태코드
	 */
	public void setMetTsReqStcd(String metTsReqStcd){
		this.metTsReqStcd= metTsReqStcd;
		this.setIsSet_metTsReqStcd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_apvReqStcd= false;
	protected final boolean isSet_apvReqStcd(){
		return this.isSet_apvReqStcd;
	}
	private void setIsSet_apvReqStcd(boolean value){
		this.isSet_apvReqStcd= value;
	}
	/**
	 * 승인요청상태코드
	 */
	@XmlTransient
	public String getApvReqStcd(){
		return this.apvReqStcd;
	}
	
	/**
	 * 승인요청상태코드
	 * 
	 * @param apvReqStcd 승인요청상태코드
	 */
	public void setApvReqStcd(String apvReqStcd){
		this.apvReqStcd= apvReqStcd;
		this.setIsSet_apvReqStcd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_tsReqTm= false;
	protected final boolean isSet_tsReqTm(){
		return this.isSet_tsReqTm;
	}
	private void setIsSet_tsReqTm(boolean value){
		this.isSet_tsReqTm= value;
	}
	/**
	 * 이체요청시각
	 */
	@XmlTransient
	public String getTsReqTm(){
		return this.tsReqTm;
	}
	
	/**
	 * 이체요청시각
	 * 
	 * @param tsReqTm 이체요청시각
	 */
	public void setTsReqTm(String tsReqTm){
		this.tsReqTm= tsReqTm;
		this.setIsSet_tsReqTm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metChifMbhSrno= false;
	protected final boolean isSet_metChifMbhSrno(){
		return this.isSet_metChifMbhSrno;
	}
	private void setIsSet_metChifMbhSrno(boolean value){
		this.isSet_metChifMbhSrno= value;
	}
	/**
	 * 모임장회원일련번호
	 */
	@XmlTransient
	public Integer getMetChifMbhSrno(){
		return this.metChifMbhSrno;
	}
	
	/**
	 * 모임장회원일련번호
	 * 
	 * @param metChifMbhSrno 모임장회원일련번호
	 */
	public void setMetChifMbhSrno(Integer metChifMbhSrno){
		this.metChifMbhSrno= metChifMbhSrno;
		this.setIsSet_metChifMbhSrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rvactOwacNm= false;
	protected final boolean isSet_rvactOwacNm(){
		return this.isSet_rvactOwacNm;
	}
	private void setIsSet_rvactOwacNm(boolean value){
		this.isSet_rvactOwacNm= value;
	}
	/**
	 * 입금계좌예금주명
	 */
	@XmlTransient
	public String getRvactOwacNm(){
		return this.rvactOwacNm;
	}
	
	/**
	 * 입금계좌예금주명
	 * 
	 * @param rvactOwacNm 입금계좌예금주명
	 */
	public void setRvactOwacNm(String rvactOwacNm){
		this.rvactOwacNm= rvactOwacNm;
		this.setIsSet_rvactOwacNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_tsReqMemoTxt= false;
	protected final boolean isSet_tsReqMemoTxt(){
		return this.isSet_tsReqMemoTxt;
	}
	private void setIsSet_tsReqMemoTxt(boolean value){
		this.isSet_tsReqMemoTxt= value;
	}
	/**
	 * 이체요청메모내용
	 */
	@XmlTransient
	public String getTsReqMemoTxt(){
		return this.tsReqMemoTxt;
	}
	
	/**
	 * 이체요청메모내용
	 * 
	 * @param tsReqMemoTxt 이체요청메모내용
	 */
	public void setTsReqMemoTxt(String tsReqMemoTxt){
		this.tsReqMemoTxt= tsReqMemoTxt;
		this.setIsSet_tsReqMemoTxt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_tsReqDelYn= false;
	protected final boolean isSet_tsReqDelYn(){
		return this.isSet_tsReqDelYn;
	}
	private void setIsSet_tsReqDelYn(boolean value){
		this.isSet_tsReqDelYn= value;
	}
	/**
	 * 이체요청삭제여부
	 */
	@XmlTransient
	public String getTsReqDelYn(){
		return this.tsReqDelYn;
	}
	
	/**
	 * 이체요청삭제여부
	 * 
	 * @param tsReqDelYn 이체요청삭제여부
	 */
	public void setTsReqDelYn(String tsReqDelYn){
		this.tsReqDelYn= tsReqDelYn;
		this.setIsSet_tsReqDelYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metTsReqDscd= false;
	protected final boolean isSet_metTsReqDscd(){
		return this.isSet_metTsReqDscd;
	}
	private void setIsSet_metTsReqDscd(boolean value){
		this.isSet_metTsReqDscd= value;
	}
	/**
	 * 모임이체요청구분코드
	 */
	@XmlTransient
	public String getMetTsReqDscd(){
		return this.metTsReqDscd;
	}
	
	/**
	 * 모임이체요청구분코드
	 * 
	 * @param metTsReqDscd 모임이체요청구분코드
	 */
	public void setMetTsReqDscd(String metTsReqDscd){
		this.metTsReqDscd= metTsReqDscd;
		this.setIsSet_metTsReqDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_trnSrno= false;
	protected final boolean isSet_trnSrno(){
		return this.isSet_trnSrno;
	}
	private void setIsSet_trnSrno(boolean value){
		this.isSet_trnSrno= value;
	}
	/**
	 * 거래일련번호
	 */
	@XmlTransient
	public Integer getTrnSrno(){
		return this.trnSrno;
	}
	
	/**
	 * 거래일련번호
	 * 
	 * @param trnSrno 거래일련번호
	 */
	public void setTrnSrno(Integer trnSrno){
		this.trnSrno= trnSrno;
		this.setIsSet_trnSrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_lstDbChgId= false;
	protected final boolean isSet_lstDbChgId(){
		return this.isSet_lstDbChgId;
	}
	private void setIsSet_lstDbChgId(boolean value){
		this.isSet_lstDbChgId= value;
	}
	/**
	 * 최종DB변경ID
	 */
	@XmlTransient
	public String getLstDbChgId(){
		return this.lstDbChgId;
	}
	
	/**
	 * 최종DB변경ID
	 * 
	 * @param lstDbChgId 최종DB변경ID
	 */
	public void setLstDbChgId(String lstDbChgId){
		this.lstDbChgId= lstDbChgId;
		this.setIsSet_lstDbChgId(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_lstDbChgDtm= false;
	protected final boolean isSet_lstDbChgDtm(){
		return this.isSet_lstDbChgDtm;
	}
	private void setIsSet_lstDbChgDtm(boolean value){
		this.isSet_lstDbChgDtm= value;
	}
	/**
	 * 최종DB변경일시
	 */
	@XmlTransient
	public String getLstDbChgDtm(){
		return this.lstDbChgDtm;
	}
	
	/**
	 * 최종DB변경일시
	 * 
	 * @param lstDbChgDtm 최종DB변경일시
	 */
	public void setLstDbChgDtm(String lstDbChgDtm){
		this.lstDbChgDtm= lstDbChgDtm;
		this.setIsSet_lstDbChgDtm(true);
	}
				
	@Override
	public TsReqInfAmd_DIDT clone(){
		try{
			TsReqInfAmd_DIDT object= (TsReqInfAmd_DIDT)super.clone();
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
		
		result= prime * result + ((this.metMngNo==null)?0:this.metMngNo.hashCode());
		result= prime * result + ((this.tsReqDt==null)?0:this.tsReqDt.hashCode());
		result= prime * result + ((this.tsReqMbhSrno==null)?0:this.tsReqMbhSrno.hashCode());
		result= prime * result + ((this.tsReqSrno==null)?0:this.tsReqSrno.hashCode());
		result= prime * result + ((this.tsReqBkcd==null)?0:this.tsReqBkcd.hashCode());
		result= prime * result + ((this.tsReqAcno==null)?0:this.tsReqAcno.hashCode());
		result= prime * result + ((this.tsReqAm==null)?0:this.tsReqAm.hashCode());
		result= prime * result + ((this.tsCmplAm==null)?0:this.tsCmplAm.hashCode());
		result= prime * result + ((this.metTsReqStcd==null)?0:this.metTsReqStcd.hashCode());
		result= prime * result + ((this.apvReqStcd==null)?0:this.apvReqStcd.hashCode());
		result= prime * result + ((this.tsReqTm==null)?0:this.tsReqTm.hashCode());
		result= prime * result + ((this.metChifMbhSrno==null)?0:this.metChifMbhSrno.hashCode());
		result= prime * result + ((this.rvactOwacNm==null)?0:this.rvactOwacNm.hashCode());
		result= prime * result + ((this.tsReqMemoTxt==null)?0:this.tsReqMemoTxt.hashCode());
		result= prime * result + ((this.tsReqDelYn==null)?0:this.tsReqDelYn.hashCode());
		result= prime * result + ((this.metTsReqDscd==null)?0:this.metTsReqDscd.hashCode());
		result= prime * result + ((this.trnSrno==null)?0:this.trnSrno.hashCode());
		result= prime * result + ((this.lstDbChgId==null)?0:this.lstDbChgId.hashCode());
		result= prime * result + ((this.lstDbChgDtm==null)?0:this.lstDbChgDtm.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final TsReqInfAmd_DIDT other= (TsReqInfAmd_DIDT)obj;
		{
			Object _metMngNo= getMetMngNo();
			Object __metMngNo= other.getMetMngNo();
			if ( _metMngNo== null ) { if ( __metMngNo!= null ) return false; }
			else if ( !_metMngNo.equals(__metMngNo) ) return false;
		}
		{
			Object _tsReqDt= getTsReqDt();
			Object __tsReqDt= other.getTsReqDt();
			if ( _tsReqDt== null ) { if ( __tsReqDt!= null ) return false; }
			else if ( !_tsReqDt.equals(__tsReqDt) ) return false;
		}
		{
			Object _tsReqMbhSrno= getTsReqMbhSrno();
			Object __tsReqMbhSrno= other.getTsReqMbhSrno();
			if ( _tsReqMbhSrno== null ) { if ( __tsReqMbhSrno!= null ) return false; }
			else if ( !_tsReqMbhSrno.equals(__tsReqMbhSrno) ) return false;
		}
		{
			Object _tsReqSrno= getTsReqSrno();
			Object __tsReqSrno= other.getTsReqSrno();
			if ( _tsReqSrno== null ) { if ( __tsReqSrno!= null ) return false; }
			else if ( !_tsReqSrno.equals(__tsReqSrno) ) return false;
		}
		{
			Object _tsReqBkcd= getTsReqBkcd();
			Object __tsReqBkcd= other.getTsReqBkcd();
			if ( _tsReqBkcd== null ) { if ( __tsReqBkcd!= null ) return false; }
			else if ( !_tsReqBkcd.equals(__tsReqBkcd) ) return false;
		}
		{
			Object _tsReqAcno= getTsReqAcno();
			Object __tsReqAcno= other.getTsReqAcno();
			if ( _tsReqAcno== null ) { if ( __tsReqAcno!= null ) return false; }
			else if ( !_tsReqAcno.equals(__tsReqAcno) ) return false;
		}
		{
			Object _tsReqAm= getTsReqAm();
			Object __tsReqAm= other.getTsReqAm();
			if ( _tsReqAm== null ) { if ( __tsReqAm!= null ) return false; }
			else if ( !_tsReqAm.equals(__tsReqAm) ) return false;
		}
		{
			Object _tsCmplAm= getTsCmplAm();
			Object __tsCmplAm= other.getTsCmplAm();
			if ( _tsCmplAm== null ) { if ( __tsCmplAm!= null ) return false; }
			else if ( !_tsCmplAm.equals(__tsCmplAm) ) return false;
		}
		{
			Object _metTsReqStcd= getMetTsReqStcd();
			Object __metTsReqStcd= other.getMetTsReqStcd();
			if ( _metTsReqStcd== null ) { if ( __metTsReqStcd!= null ) return false; }
			else if ( !_metTsReqStcd.equals(__metTsReqStcd) ) return false;
		}
		{
			Object _apvReqStcd= getApvReqStcd();
			Object __apvReqStcd= other.getApvReqStcd();
			if ( _apvReqStcd== null ) { if ( __apvReqStcd!= null ) return false; }
			else if ( !_apvReqStcd.equals(__apvReqStcd) ) return false;
		}
		{
			Object _tsReqTm= getTsReqTm();
			Object __tsReqTm= other.getTsReqTm();
			if ( _tsReqTm== null ) { if ( __tsReqTm!= null ) return false; }
			else if ( !_tsReqTm.equals(__tsReqTm) ) return false;
		}
		{
			Object _metChifMbhSrno= getMetChifMbhSrno();
			Object __metChifMbhSrno= other.getMetChifMbhSrno();
			if ( _metChifMbhSrno== null ) { if ( __metChifMbhSrno!= null ) return false; }
			else if ( !_metChifMbhSrno.equals(__metChifMbhSrno) ) return false;
		}
		{
			Object _rvactOwacNm= getRvactOwacNm();
			Object __rvactOwacNm= other.getRvactOwacNm();
			if ( _rvactOwacNm== null ) { if ( __rvactOwacNm!= null ) return false; }
			else if ( !_rvactOwacNm.equals(__rvactOwacNm) ) return false;
		}
		{
			Object _tsReqMemoTxt= getTsReqMemoTxt();
			Object __tsReqMemoTxt= other.getTsReqMemoTxt();
			if ( _tsReqMemoTxt== null ) { if ( __tsReqMemoTxt!= null ) return false; }
			else if ( !_tsReqMemoTxt.equals(__tsReqMemoTxt) ) return false;
		}
		{
			Object _tsReqDelYn= getTsReqDelYn();
			Object __tsReqDelYn= other.getTsReqDelYn();
			if ( _tsReqDelYn== null ) { if ( __tsReqDelYn!= null ) return false; }
			else if ( !_tsReqDelYn.equals(__tsReqDelYn) ) return false;
		}
		{
			Object _metTsReqDscd= getMetTsReqDscd();
			Object __metTsReqDscd= other.getMetTsReqDscd();
			if ( _metTsReqDscd== null ) { if ( __metTsReqDscd!= null ) return false; }
			else if ( !_metTsReqDscd.equals(__metTsReqDscd) ) return false;
		}
		{
			Object _trnSrno= getTrnSrno();
			Object __trnSrno= other.getTrnSrno();
			if ( _trnSrno== null ) { if ( __trnSrno!= null ) return false; }
			else if ( !_trnSrno.equals(__trnSrno) ) return false;
		}
		{
			Object _lstDbChgId= getLstDbChgId();
			Object __lstDbChgId= other.getLstDbChgId();
			if ( _lstDbChgId== null ) { if ( __lstDbChgId!= null ) return false; }
			else if ( !_lstDbChgId.equals(__lstDbChgId) ) return false;
		}
		{
			Object _lstDbChgDtm= getLstDbChgDtm();
			Object __lstDbChgDtm= other.getLstDbChgDtm();
			if ( _lstDbChgDtm== null ) { if ( __lstDbChgDtm!= null ) return false; }
			else if ( !_lstDbChgDtm.equals(__lstDbChgDtm) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(TsReqInfAmd_DIDT.class.getName()).append(":\n");
		sb.append("\tmetMngNo: ");
		sb.append(metMngNo==null?"null":getMetMngNo());
		sb.append("\n");
		sb.append("\ttsReqDt: ");
		sb.append(tsReqDt==null?"null":getTsReqDt());
		sb.append("\n");
		sb.append("\ttsReqMbhSrno: ");
		sb.append(tsReqMbhSrno==null?"null":getTsReqMbhSrno());
		sb.append("\n");
		sb.append("\ttsReqSrno: ");
		sb.append(tsReqSrno==null?"null":getTsReqSrno());
		sb.append("\n");
		sb.append("\ttsReqBkcd: ");
		sb.append(tsReqBkcd==null?"null":getTsReqBkcd());
		sb.append("\n");
		sb.append("\ttsReqAcno: ");
		sb.append(tsReqAcno==null?"null":getTsReqAcno());
		sb.append("\n");
		sb.append("\ttsReqAm: ");
		sb.append(tsReqAm==null?"null":getTsReqAm());
		sb.append("\n");
		sb.append("\ttsCmplAm: ");
		sb.append(tsCmplAm==null?"null":getTsCmplAm());
		sb.append("\n");
		sb.append("\tmetTsReqStcd: ");
		sb.append(metTsReqStcd==null?"null":getMetTsReqStcd());
		sb.append("\n");
		sb.append("\tapvReqStcd: ");
		sb.append(apvReqStcd==null?"null":getApvReqStcd());
		sb.append("\n");
		sb.append("\ttsReqTm: ");
		sb.append(tsReqTm==null?"null":getTsReqTm());
		sb.append("\n");
		sb.append("\tmetChifMbhSrno: ");
		sb.append(metChifMbhSrno==null?"null":getMetChifMbhSrno());
		sb.append("\n");
		sb.append("\trvactOwacNm: ");
		sb.append(rvactOwacNm==null?"null":getRvactOwacNm());
		sb.append("\n");
		sb.append("\ttsReqMemoTxt: ");
		sb.append(tsReqMemoTxt==null?"null":getTsReqMemoTxt());
		sb.append("\n");
		sb.append("\ttsReqDelYn: ");
		sb.append(tsReqDelYn==null?"null":getTsReqDelYn());
		sb.append("\n");
		sb.append("\tmetTsReqDscd: ");
		sb.append(metTsReqDscd==null?"null":getMetTsReqDscd());
		sb.append("\n");
		sb.append("\ttrnSrno: ");
		sb.append(trnSrno==null?"null":getTrnSrno());
		sb.append("\n");
		sb.append("\tlstDbChgId: ");
		sb.append(lstDbChgId==null?"null":getLstDbChgId());
		sb.append("\n");
		sb.append("\tlstDbChgDtm: ");
		sb.append(lstDbChgDtm==null?"null":getLstDbChgDtm());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 9; /* metMngNo */
		messageLen+= 8; /* tsReqDt */
		messageLen+= 7; /* tsReqMbhSrno */
		messageLen+= 5; /* tsReqSrno */
		messageLen+= 3; /* tsReqBkcd */
		messageLen+= 13; /* tsReqAcno */
		messageLen+= 18; /* tsReqAm */
		messageLen+= 18; /* tsCmplAm */
		messageLen+= 1; /* metTsReqStcd */
		messageLen+= 1; /* apvReqStcd */
		messageLen+= 6; /* tsReqTm */
		messageLen+= 7; /* metChifMbhSrno */
		messageLen+= 60; /* rvactOwacNm */
		messageLen+= 500; /* tsReqMemoTxt */
		messageLen+= 1; /* tsReqDelYn */
		messageLen+= 1; /* metTsReqDscd */
		messageLen+= 8; /* trnSrno */
		messageLen+= 8; /* lstDbChgId */
		messageLen+= 20; /* lstDbChgDtm */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("metMngNo");
		list.add("tsReqDt");
		list.add("tsReqMbhSrno");
		list.add("tsReqSrno");
		list.add("tsReqBkcd");
		list.add("tsReqAcno");
		list.add("tsReqAm");
		list.add("tsCmplAm");
		list.add("metTsReqStcd");
		list.add("apvReqStcd");
		list.add("tsReqTm");
		list.add("metChifMbhSrno");
		list.add("rvactOwacNm");
		list.add("tsReqMemoTxt");
		list.add("tsReqDelYn");
		list.add("metTsReqDscd");
		list.add("trnSrno");
		list.add("lstDbChgId");
		list.add("lstDbChgDtm");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("metMngNo", get("metMngNo"));
		map.put("tsReqDt", get("tsReqDt"));
		map.put("tsReqMbhSrno", get("tsReqMbhSrno"));
		map.put("tsReqSrno", get("tsReqSrno"));
		map.put("tsReqBkcd", get("tsReqBkcd"));
		map.put("tsReqAcno", get("tsReqAcno"));
		map.put("tsReqAm", get("tsReqAm"));
		map.put("tsCmplAm", get("tsCmplAm"));
		map.put("metTsReqStcd", get("metTsReqStcd"));
		map.put("apvReqStcd", get("apvReqStcd"));
		map.put("tsReqTm", get("tsReqTm"));
		map.put("metChifMbhSrno", get("metChifMbhSrno"));
		map.put("rvactOwacNm", get("rvactOwacNm"));
		map.put("tsReqMemoTxt", get("tsReqMemoTxt"));
		map.put("tsReqDelYn", get("tsReqDelYn"));
		map.put("metTsReqDscd", get("metTsReqDscd"));
		map.put("trnSrno", get("trnSrno"));
		map.put("lstDbChgId", get("lstDbChgId"));
		map.put("lstDbChgDtm", get("lstDbChgDtm"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -468172085:/* metMngNo */
			return getMetMngNo();
		case -1052554609:/* tsReqDt */
			return getTsReqDt();
		case -1904094764:/* tsReqMbhSrno */
			return getTsReqMbhSrno();
		case 2107751071:/* tsReqSrno */
			return getTsReqSrno();
		case 2107237545:/* tsReqBkcd */
			return getTsReqBkcd();
		case 2107200418:/* tsReqAcno */
			return getTsReqAcno();
		case -1052554709:/* tsReqAm */
			return getTsReqAm();
		case 1308503569:/* tsCmplAm */
			return getTsCmplAm();
		case -1422323131:/* metTsReqStcd */
			return getMetTsReqStcd();
		case -200841191:/* apvReqStcd */
			return getApvReqStcd();
		case -1052554120:/* tsReqTm */
			return getTsReqTm();
		case -1049280939:/* metChifMbhSrno */
			return getMetChifMbhSrno();
		case -946840361:/* rvactOwacNm */
			return getRvactOwacNm();
		case -1812784073:/* tsReqMemoTxt */
			return getTsReqMemoTxt();
		case 901531169:/* tsReqDelYn */
			return getTsReqDelYn();
		case -1422770957:/* metTsReqDscd */
			return getMetTsReqDscd();
		case -1055859152:/* trnSrno */
			return getTrnSrno();
		case 1946521330:/* lstDbChgId */
			return getLstDbChgId();
		case 212614886:/* lstDbChgDtm */
			return getLstDbChgDtm();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -468172085:/* metMngNo */
			setMetMngNo((String)value);
			break;
		case -1052554609:/* tsReqDt */
			setTsReqDt((String)value);
			break;
		case -1904094764:/* tsReqMbhSrno */
			setTsReqMbhSrno((Integer)value);
			break;
		case 2107751071:/* tsReqSrno */
			setTsReqSrno((Integer)value);
			break;
		case 2107237545:/* tsReqBkcd */
			setTsReqBkcd((String)value);
			break;
		case 2107200418:/* tsReqAcno */
			setTsReqAcno((String)value);
			break;
		case -1052554709:/* tsReqAm */
			if ( value instanceof String ){
				setTsReqAm((String)value);
			}
			else if ( value instanceof Double ){
				setTsReqAm((Double)value);
			}
			else if ( value instanceof Long ){
				setTsReqAm((Long)value);
			}
			else{
				setTsReqAm((BigDecimal)value);
			}
			break;
		case 1308503569:/* tsCmplAm */
			if ( value instanceof String ){
				setTsCmplAm((String)value);
			}
			else if ( value instanceof Double ){
				setTsCmplAm((Double)value);
			}
			else if ( value instanceof Long ){
				setTsCmplAm((Long)value);
			}
			else{
				setTsCmplAm((BigDecimal)value);
			}
			break;
		case -1422323131:/* metTsReqStcd */
			setMetTsReqStcd((String)value);
			break;
		case -200841191:/* apvReqStcd */
			setApvReqStcd((String)value);
			break;
		case -1052554120:/* tsReqTm */
			setTsReqTm((String)value);
			break;
		case -1049280939:/* metChifMbhSrno */
			setMetChifMbhSrno((Integer)value);
			break;
		case -946840361:/* rvactOwacNm */
			setRvactOwacNm((String)value);
			break;
		case -1812784073:/* tsReqMemoTxt */
			setTsReqMemoTxt((String)value);
			break;
		case 901531169:/* tsReqDelYn */
			setTsReqDelYn((String)value);
			break;
		case -1422770957:/* metTsReqDscd */
			setMetTsReqDscd((String)value);
			break;
		case -1055859152:/* trnSrno */
			setTrnSrno((Integer)value);
			break;
		case 1946521330:/* lstDbChgId */
			setLstDbChgId((String)value);
			break;
		case 212614886:/* lstDbChgDtm */
			setLstDbChgDtm((String)value);
			break;
		default:
			break;
		}
	}
	
}
