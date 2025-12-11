/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.inb.dto;

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
 * PUSH 알림서비스 조회 IBSMR0001249
 */
@XmlType(propOrder={
	"encyAcnmNo", "itcsno", "tgtAcno", "ntcTgtTrnDscd", "ebnkSrvcStcd", "smsTmsLimAm", "balNtrsnYn", "tmsStaTm", "tmsEndTm", "atsSndLimYn", "hpComCd", "hpTlenNo", "hpSerNo", "prcSrno", "advpeEno"
	, "acnmCnfEno", "acnmCnfEmpNm", "dpstTrnRqdcChc", "appItllCmplYn", "appItllDisNm", "appItllCmplDt", "psnAppItllYn", "etcNtfcPsnAppYn", "smsCtrDt", "smsCancDt", "smsLstNtcDt", "smsRqSrno", "rgpe", "lstNtcCnt", "fstCtrDt"
	, "idcrDscd", "idcrFnm", "encyRrno", "idcrIsuDt", "idcrImgKey", "idcrCnfShap", "idcrRuseYn", "idcrAgnpeTrnYn"
}, name="IBSMR0001249_DIDT")
@XmlRootElement(name="IBSMR0001249_DIDT")
@BxmCategory(logicalName="PUSH 알림서비스 조회.DBM.입력.IO", description="PUSH 알림서비스 조회 IBSMR0001249") 
public class IBSMR0001249_DIDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -638858099L;
	
	
	
	/**
	 * 암호화실명번호
	 */
	@ApiModelProperty(
		name = "encyAcnmNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("encyAcnmNo")
	@BxmOmm_Field(length=32, decimal=0, description="암호화실명번호", align="left", fill="")
	private String encyAcnmNo= "";
	
	
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
	 * 대상계좌번호
	 */
	@ApiModelProperty(
		name = "tgtAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("tgtAcno")
	@BxmOmm_Field(length=20, decimal=0, description="대상계좌번호", align="left", fill="")
	private String tgtAcno= "";
	
	
	/**
	 * 통지대상거래구분코드
	 */
	@ApiModelProperty(
		name = "ntcTgtTrnDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ntcTgtTrnDscd")
	@BxmOmm_Field(length=1, decimal=0, description="통지대상거래구분코드", align="left", fill="")
	private String ntcTgtTrnDscd= "";
	
	
	/**
	 * 전자뱅킹서비스상태코드
	 */
	@ApiModelProperty(
		name = "ebnkSrvcStcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ebnkSrvcStcd")
	@BxmOmm_Field(length=2, decimal=0, description="전자뱅킹서비스상태코드", align="left", fill="")
	private String ebnkSrvcStcd= "";
	
	
	/**
	 * SMS전송제한금액
	 */
	@ApiModelProperty(
		name = "smsTmsLimAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("smsTmsLimAm")
	@BxmOmm_Field(length=18, decimal=0, description="SMS전송제한금액", align="right", fill="")
	private BigDecimal smsTmsLimAm= new BigDecimal("0");
	
	
	/**
	 * 잔액미전송여부
	 */
	@ApiModelProperty(
		name = "balNtrsnYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("balNtrsnYn")
	@BxmOmm_Field(length=1, decimal=0, description="잔액미전송여부", align="left", fill="")
	private String balNtrsnYn= "";
	
	
	/**
	 * 전송시작시각
	 */
	@ApiModelProperty(
		name = "tmsStaTm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("tmsStaTm")
	@BxmOmm_Field(length=2, decimal=0, description="전송시작시각", align="left", fill="")
	private String tmsStaTm= "";
	
	
	/**
	 * 전송종료시각
	 */
	@ApiModelProperty(
		name = "tmsEndTm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("tmsEndTm")
	@BxmOmm_Field(length=2, decimal=0, description="전송종료시각", align="left", fill="")
	private String tmsEndTm= "";
	
	
	/**
	 * 자동이체발송제한여부
	 */
	@ApiModelProperty(
		name = "atsSndLimYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atsSndLimYn")
	@BxmOmm_Field(length=1, decimal=0, description="자동이체발송제한여부", align="left", fill="")
	private String atsSndLimYn= "";
	
	
	/**
	 * 핸드폰회사코드
	 */
	@ApiModelProperty(
		name = "hpComCd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("hpComCd")
	@BxmOmm_Field(length=4, decimal=0, description="핸드폰회사코드", align="left", fill="")
	private String hpComCd= "";
	
	
	/**
	 * 핸드폰국번번호
	 */
	@ApiModelProperty(
		name = "hpTlenNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("hpTlenNo")
	@BxmOmm_Field(length=4, decimal=0, description="핸드폰국번번호", align="left", fill="")
	private String hpTlenNo= "";
	
	
	/**
	 * 핸드폰일련번호
	 */
	@ApiModelProperty(
		name = "hpSerNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("hpSerNo")
	@BxmOmm_Field(length=4, decimal=0, description="핸드폰일련번호", align="left", fill="")
	private String hpSerNo= "";
	
	
	/**
	 * 처리일련번호
	 */
	@ApiModelProperty(
		name = "prcSrno"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("prcSrno")
	@BxmOmm_Field(length=5, decimal=0, description="처리일련번호", align="right", fill="")
	private Integer prcSrno= 0;
	
	
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
	 * 실명확인직원번호
	 */
	@ApiModelProperty(
		name = "acnmCnfEno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("acnmCnfEno")
	@BxmOmm_Field(length=8, decimal=0, description="실명확인직원번호", align="left", fill="")
	private String acnmCnfEno= "";
	
	
	/**
	 * 실명확인직원명
	 */
	@ApiModelProperty(
		name = "acnmCnfEmpNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("acnmCnfEmpNm")
	@BxmOmm_Field(length=30, decimal=0, description="실명확인직원명", align="left", fill="")
	private String acnmCnfEmpNm= "";
	
	
	/**
	 * 예금거래신청서선택
	 */
	@ApiModelProperty(
		name = "dpstTrnRqdcChc"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dpstTrnRqdcChc")
	@BxmOmm_Field(length=1, decimal=0, description="예금거래신청서선택", align="left", fill="")
	private String dpstTrnRqdcChc= "";
	
	
	/**
	 * 앱설치완료여부
	 */
	@ApiModelProperty(
		name = "appItllCmplYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("appItllCmplYn")
	@BxmOmm_Field(length=1, decimal=0, description="앱설치완료여부", align="left", fill="")
	private String appItllCmplYn= "";
	
	
	/**
	 * 앱설치구분명
	 */
	@ApiModelProperty(
		name = "appItllDisNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("appItllDisNm")
	@BxmOmm_Field(length=30, decimal=0, description="앱설치구분명", align="left", fill="")
	private String appItllDisNm= "";
	
	
	/**
	 * 앱설치완료일자
	 */
	@ApiModelProperty(
		name = "appItllCmplDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("appItllCmplDt")
	@BxmOmm_Field(length=8, decimal=0, description="앱설치완료일자", align="left", fill="")
	private String appItllCmplDt= "";
	
	
	/**
	 * 개인앱설치여부
	 */
	@ApiModelProperty(
		name = "psnAppItllYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("psnAppItllYn")
	@BxmOmm_Field(length=1, decimal=0, description="개인앱설치여부", align="left", fill="")
	private String psnAppItllYn= "";
	
	
	/**
	 * 기타알림개인앱여부
	 */
	@ApiModelProperty(
		name = "etcNtfcPsnAppYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("etcNtfcPsnAppYn")
	@BxmOmm_Field(length=1, decimal=0, description="기타알림개인앱여부", align="left", fill="")
	private String etcNtfcPsnAppYn= "";
	
	
	/**
	 * SMS계약일자
	 */
	@ApiModelProperty(
		name = "smsCtrDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("smsCtrDt")
	@BxmOmm_Field(length=8, decimal=0, description="SMS계약일자", align="left", fill="")
	private String smsCtrDt= "";
	
	
	/**
	 * SMS해지일자
	 */
	@ApiModelProperty(
		name = "smsCancDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("smsCancDt")
	@BxmOmm_Field(length=8, decimal=0, description="SMS해지일자", align="left", fill="")
	private String smsCancDt= "";
	
	
	/**
	 * SMS최종통지일자
	 */
	@ApiModelProperty(
		name = "smsLstNtcDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("smsLstNtcDt")
	@BxmOmm_Field(length=8, decimal=0, description="SMS최종통지일자", align="left", fill="")
	private String smsLstNtcDt= "";
	
	
	/**
	 * SMS신청일련번호
	 */
	@ApiModelProperty(
		name = "smsRqSrno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("smsRqSrno")
	@BxmOmm_Field(length=20, decimal=0, description="SMS신청일련번호", align="left", fill="")
	private String smsRqSrno= "";
	
	
	/**
	 * 등록자
	 */
	@ApiModelProperty(
		name = "rgpe"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rgpe")
	@BxmOmm_Field(length=10, decimal=0, description="등록자", align="left", fill="")
	private String rgpe= "";
	
	
	/**
	 * 최종통지건수
	 */
	@ApiModelProperty(
		name = "lstNtcCnt"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("lstNtcCnt")
	@BxmOmm_Field(length=6, decimal=0, description="최종통지건수", align="right", fill="")
	private Integer lstNtcCnt= 0;
	
	
	/**
	 * 최초계약일자
	 */
	@ApiModelProperty(
		name = "fstCtrDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("fstCtrDt")
	@BxmOmm_Field(length=8, decimal=0, description="최초계약일자", align="left", fill="")
	private String fstCtrDt= "";
	
	
	/**
	 * 신분증구분코드
	 */
	@ApiModelProperty(
		name = "idcrDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("idcrDscd")
	@BxmOmm_Field(length=2, decimal=0, description="신분증구분코드", align="left", fill="")
	private String idcrDscd= "";
	
	
	/**
	 * 신분증성명
	 */
	@ApiModelProperty(
		name = "idcrFnm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("idcrFnm")
	@BxmOmm_Field(length=50, decimal=0, description="신분증성명", align="left", fill="")
	private String idcrFnm= "";
	
	
	/**
	 * 암호화주민등록번호
	 */
	@ApiModelProperty(
		name = "encyRrno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("encyRrno")
	@BxmOmm_Field(length=32, decimal=0, description="암호화주민등록번호", align="left", fill="")
	private String encyRrno= "";
	
	
	/**
	 * 신분증발급일자
	 */
	@ApiModelProperty(
		name = "idcrIsuDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("idcrIsuDt")
	@BxmOmm_Field(length=8, decimal=0, description="신분증발급일자", align="left", fill="")
	private String idcrIsuDt= "";
	
	
	/**
	 * 신분증이미지키
	 */
	@ApiModelProperty(
		name = "idcrImgKey"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("idcrImgKey")
	@BxmOmm_Field(length=13, decimal=0, description="신분증이미지키", align="left", fill="")
	private String idcrImgKey= "";
	
	
	/**
	 * 신분증확인형태
	 */
	@ApiModelProperty(
		name = "idcrCnfShap"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("idcrCnfShap")
	@BxmOmm_Field(length=1, decimal=0, description="신분증확인형태", align="left", fill="")
	private String idcrCnfShap= "";
	
	
	/**
	 * 신분증재사용여부
	 */
	@ApiModelProperty(
		name = "idcrRuseYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("idcrRuseYn")
	@BxmOmm_Field(length=1, decimal=0, description="신분증재사용여부", align="left", fill="")
	private String idcrRuseYn= "";
	
	
	/**
	 * 신분증대리인거래여부
	 */
	@ApiModelProperty(
		name = "idcrAgnpeTrnYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("idcrAgnpeTrnYn")
	@BxmOmm_Field(length=1, decimal=0, description="신분증대리인거래여부", align="left", fill="")
	private String idcrAgnpeTrnYn= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_encyAcnmNo= false;
	protected final boolean isSet_encyAcnmNo(){
		return this.isSet_encyAcnmNo;
	}
	private void setIsSet_encyAcnmNo(boolean value){
		this.isSet_encyAcnmNo= value;
	}
	/**
	 * 암호화실명번호
	 */
	@XmlTransient
	public String getEncyAcnmNo(){
		return this.encyAcnmNo;
	}
	
	/**
	 * 암호화실명번호
	 * 
	 * @param encyAcnmNo 암호화실명번호
	 */
	public void setEncyAcnmNo(String encyAcnmNo){
		this.encyAcnmNo= encyAcnmNo;
		this.setIsSet_encyAcnmNo(true);
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
	private boolean isSet_tgtAcno= false;
	protected final boolean isSet_tgtAcno(){
		return this.isSet_tgtAcno;
	}
	private void setIsSet_tgtAcno(boolean value){
		this.isSet_tgtAcno= value;
	}
	/**
	 * 대상계좌번호
	 */
	@XmlTransient
	public String getTgtAcno(){
		return this.tgtAcno;
	}
	
	/**
	 * 대상계좌번호
	 * 
	 * @param tgtAcno 대상계좌번호
	 */
	public void setTgtAcno(String tgtAcno){
		this.tgtAcno= tgtAcno;
		this.setIsSet_tgtAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ntcTgtTrnDscd= false;
	protected final boolean isSet_ntcTgtTrnDscd(){
		return this.isSet_ntcTgtTrnDscd;
	}
	private void setIsSet_ntcTgtTrnDscd(boolean value){
		this.isSet_ntcTgtTrnDscd= value;
	}
	/**
	 * 통지대상거래구분코드
	 */
	@XmlTransient
	public String getNtcTgtTrnDscd(){
		return this.ntcTgtTrnDscd;
	}
	
	/**
	 * 통지대상거래구분코드
	 * 
	 * @param ntcTgtTrnDscd 통지대상거래구분코드
	 */
	public void setNtcTgtTrnDscd(String ntcTgtTrnDscd){
		this.ntcTgtTrnDscd= ntcTgtTrnDscd;
		this.setIsSet_ntcTgtTrnDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ebnkSrvcStcd= false;
	protected final boolean isSet_ebnkSrvcStcd(){
		return this.isSet_ebnkSrvcStcd;
	}
	private void setIsSet_ebnkSrvcStcd(boolean value){
		this.isSet_ebnkSrvcStcd= value;
	}
	/**
	 * 전자뱅킹서비스상태코드
	 */
	@XmlTransient
	public String getEbnkSrvcStcd(){
		return this.ebnkSrvcStcd;
	}
	
	/**
	 * 전자뱅킹서비스상태코드
	 * 
	 * @param ebnkSrvcStcd 전자뱅킹서비스상태코드
	 */
	public void setEbnkSrvcStcd(String ebnkSrvcStcd){
		this.ebnkSrvcStcd= ebnkSrvcStcd;
		this.setIsSet_ebnkSrvcStcd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_smsTmsLimAm= false;
	protected final boolean isSet_smsTmsLimAm(){
		return this.isSet_smsTmsLimAm;
	}
	private void setIsSet_smsTmsLimAm(boolean value){
		this.isSet_smsTmsLimAm= value;
	}
	/**
	 * SMS전송제한금액
	 * BigDecimal - Double value setter
	 *
	 * @Param smsTmsLimAm SMS전송제한금액
	 */
	public void setSmsTmsLimAm(double smsTmsLimAm) {
		setSmsTmsLimAm(BigDecimal.valueOf(smsTmsLimAm));
	}
	/**
	 * SMS전송제한금액
	 * BigDecimal - Long value setter
	 *
	 * @Param smsTmsLimAm SMS전송제한금액
	 */
	public void setSmsTmsLimAm(long smsTmsLimAm) {
		setSmsTmsLimAm(BigDecimal.valueOf(smsTmsLimAm));
	}
	/**
	 * SMS전송제한금액
	 * BigDecimal - String value setter
	 *
	 * @Param smsTmsLimAm SMS전송제한금액
	 */
	public void setSmsTmsLimAm(String smsTmsLimAm) {
		setSmsTmsLimAm(new BigDecimal(smsTmsLimAm));
	}
	/**
	 * SMS전송제한금액
	 */
	@XmlTransient
	public BigDecimal getSmsTmsLimAm(){
		return this.smsTmsLimAm;
	}
	
	/**
	 * SMS전송제한금액
	 * 
	 * @param smsTmsLimAm SMS전송제한금액
	 */
	@JsonSetter("smsTmsLimAm")
	public void setSmsTmsLimAm(BigDecimal smsTmsLimAm){
		this.smsTmsLimAm= smsTmsLimAm;
		this.setIsSet_smsTmsLimAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_balNtrsnYn= false;
	protected final boolean isSet_balNtrsnYn(){
		return this.isSet_balNtrsnYn;
	}
	private void setIsSet_balNtrsnYn(boolean value){
		this.isSet_balNtrsnYn= value;
	}
	/**
	 * 잔액미전송여부
	 */
	@XmlTransient
	public String getBalNtrsnYn(){
		return this.balNtrsnYn;
	}
	
	/**
	 * 잔액미전송여부
	 * 
	 * @param balNtrsnYn 잔액미전송여부
	 */
	public void setBalNtrsnYn(String balNtrsnYn){
		this.balNtrsnYn= balNtrsnYn;
		this.setIsSet_balNtrsnYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_tmsStaTm= false;
	protected final boolean isSet_tmsStaTm(){
		return this.isSet_tmsStaTm;
	}
	private void setIsSet_tmsStaTm(boolean value){
		this.isSet_tmsStaTm= value;
	}
	/**
	 * 전송시작시각
	 */
	@XmlTransient
	public String getTmsStaTm(){
		return this.tmsStaTm;
	}
	
	/**
	 * 전송시작시각
	 * 
	 * @param tmsStaTm 전송시작시각
	 */
	public void setTmsStaTm(String tmsStaTm){
		this.tmsStaTm= tmsStaTm;
		this.setIsSet_tmsStaTm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_tmsEndTm= false;
	protected final boolean isSet_tmsEndTm(){
		return this.isSet_tmsEndTm;
	}
	private void setIsSet_tmsEndTm(boolean value){
		this.isSet_tmsEndTm= value;
	}
	/**
	 * 전송종료시각
	 */
	@XmlTransient
	public String getTmsEndTm(){
		return this.tmsEndTm;
	}
	
	/**
	 * 전송종료시각
	 * 
	 * @param tmsEndTm 전송종료시각
	 */
	public void setTmsEndTm(String tmsEndTm){
		this.tmsEndTm= tmsEndTm;
		this.setIsSet_tmsEndTm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atsSndLimYn= false;
	protected final boolean isSet_atsSndLimYn(){
		return this.isSet_atsSndLimYn;
	}
	private void setIsSet_atsSndLimYn(boolean value){
		this.isSet_atsSndLimYn= value;
	}
	/**
	 * 자동이체발송제한여부
	 */
	@XmlTransient
	public String getAtsSndLimYn(){
		return this.atsSndLimYn;
	}
	
	/**
	 * 자동이체발송제한여부
	 * 
	 * @param atsSndLimYn 자동이체발송제한여부
	 */
	public void setAtsSndLimYn(String atsSndLimYn){
		this.atsSndLimYn= atsSndLimYn;
		this.setIsSet_atsSndLimYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_hpComCd= false;
	protected final boolean isSet_hpComCd(){
		return this.isSet_hpComCd;
	}
	private void setIsSet_hpComCd(boolean value){
		this.isSet_hpComCd= value;
	}
	/**
	 * 핸드폰회사코드
	 */
	@XmlTransient
	public String getHpComCd(){
		return this.hpComCd;
	}
	
	/**
	 * 핸드폰회사코드
	 * 
	 * @param hpComCd 핸드폰회사코드
	 */
	public void setHpComCd(String hpComCd){
		this.hpComCd= hpComCd;
		this.setIsSet_hpComCd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_hpTlenNo= false;
	protected final boolean isSet_hpTlenNo(){
		return this.isSet_hpTlenNo;
	}
	private void setIsSet_hpTlenNo(boolean value){
		this.isSet_hpTlenNo= value;
	}
	/**
	 * 핸드폰국번번호
	 */
	@XmlTransient
	public String getHpTlenNo(){
		return this.hpTlenNo;
	}
	
	/**
	 * 핸드폰국번번호
	 * 
	 * @param hpTlenNo 핸드폰국번번호
	 */
	public void setHpTlenNo(String hpTlenNo){
		this.hpTlenNo= hpTlenNo;
		this.setIsSet_hpTlenNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_hpSerNo= false;
	protected final boolean isSet_hpSerNo(){
		return this.isSet_hpSerNo;
	}
	private void setIsSet_hpSerNo(boolean value){
		this.isSet_hpSerNo= value;
	}
	/**
	 * 핸드폰일련번호
	 */
	@XmlTransient
	public String getHpSerNo(){
		return this.hpSerNo;
	}
	
	/**
	 * 핸드폰일련번호
	 * 
	 * @param hpSerNo 핸드폰일련번호
	 */
	public void setHpSerNo(String hpSerNo){
		this.hpSerNo= hpSerNo;
		this.setIsSet_hpSerNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_prcSrno= false;
	protected final boolean isSet_prcSrno(){
		return this.isSet_prcSrno;
	}
	private void setIsSet_prcSrno(boolean value){
		this.isSet_prcSrno= value;
	}
	/**
	 * 처리일련번호
	 */
	@XmlTransient
	public Integer getPrcSrno(){
		return this.prcSrno;
	}
	
	/**
	 * 처리일련번호
	 * 
	 * @param prcSrno 처리일련번호
	 */
	public void setPrcSrno(Integer prcSrno){
		this.prcSrno= prcSrno;
		this.setIsSet_prcSrno(true);
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
	private boolean isSet_acnmCnfEno= false;
	protected final boolean isSet_acnmCnfEno(){
		return this.isSet_acnmCnfEno;
	}
	private void setIsSet_acnmCnfEno(boolean value){
		this.isSet_acnmCnfEno= value;
	}
	/**
	 * 실명확인직원번호
	 */
	@XmlTransient
	public String getAcnmCnfEno(){
		return this.acnmCnfEno;
	}
	
	/**
	 * 실명확인직원번호
	 * 
	 * @param acnmCnfEno 실명확인직원번호
	 */
	public void setAcnmCnfEno(String acnmCnfEno){
		this.acnmCnfEno= acnmCnfEno;
		this.setIsSet_acnmCnfEno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_acnmCnfEmpNm= false;
	protected final boolean isSet_acnmCnfEmpNm(){
		return this.isSet_acnmCnfEmpNm;
	}
	private void setIsSet_acnmCnfEmpNm(boolean value){
		this.isSet_acnmCnfEmpNm= value;
	}
	/**
	 * 실명확인직원명
	 */
	@XmlTransient
	public String getAcnmCnfEmpNm(){
		return this.acnmCnfEmpNm;
	}
	
	/**
	 * 실명확인직원명
	 * 
	 * @param acnmCnfEmpNm 실명확인직원명
	 */
	public void setAcnmCnfEmpNm(String acnmCnfEmpNm){
		this.acnmCnfEmpNm= acnmCnfEmpNm;
		this.setIsSet_acnmCnfEmpNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dpstTrnRqdcChc= false;
	protected final boolean isSet_dpstTrnRqdcChc(){
		return this.isSet_dpstTrnRqdcChc;
	}
	private void setIsSet_dpstTrnRqdcChc(boolean value){
		this.isSet_dpstTrnRqdcChc= value;
	}
	/**
	 * 예금거래신청서선택
	 */
	@XmlTransient
	public String getDpstTrnRqdcChc(){
		return this.dpstTrnRqdcChc;
	}
	
	/**
	 * 예금거래신청서선택
	 * 
	 * @param dpstTrnRqdcChc 예금거래신청서선택
	 */
	public void setDpstTrnRqdcChc(String dpstTrnRqdcChc){
		this.dpstTrnRqdcChc= dpstTrnRqdcChc;
		this.setIsSet_dpstTrnRqdcChc(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_appItllCmplYn= false;
	protected final boolean isSet_appItllCmplYn(){
		return this.isSet_appItllCmplYn;
	}
	private void setIsSet_appItllCmplYn(boolean value){
		this.isSet_appItllCmplYn= value;
	}
	/**
	 * 앱설치완료여부
	 */
	@XmlTransient
	public String getAppItllCmplYn(){
		return this.appItllCmplYn;
	}
	
	/**
	 * 앱설치완료여부
	 * 
	 * @param appItllCmplYn 앱설치완료여부
	 */
	public void setAppItllCmplYn(String appItllCmplYn){
		this.appItllCmplYn= appItllCmplYn;
		this.setIsSet_appItllCmplYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_appItllDisNm= false;
	protected final boolean isSet_appItllDisNm(){
		return this.isSet_appItllDisNm;
	}
	private void setIsSet_appItllDisNm(boolean value){
		this.isSet_appItllDisNm= value;
	}
	/**
	 * 앱설치구분명
	 */
	@XmlTransient
	public String getAppItllDisNm(){
		return this.appItllDisNm;
	}
	
	/**
	 * 앱설치구분명
	 * 
	 * @param appItllDisNm 앱설치구분명
	 */
	public void setAppItllDisNm(String appItllDisNm){
		this.appItllDisNm= appItllDisNm;
		this.setIsSet_appItllDisNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_appItllCmplDt= false;
	protected final boolean isSet_appItllCmplDt(){
		return this.isSet_appItllCmplDt;
	}
	private void setIsSet_appItllCmplDt(boolean value){
		this.isSet_appItllCmplDt= value;
	}
	/**
	 * 앱설치완료일자
	 */
	@XmlTransient
	public String getAppItllCmplDt(){
		return this.appItllCmplDt;
	}
	
	/**
	 * 앱설치완료일자
	 * 
	 * @param appItllCmplDt 앱설치완료일자
	 */
	public void setAppItllCmplDt(String appItllCmplDt){
		this.appItllCmplDt= appItllCmplDt;
		this.setIsSet_appItllCmplDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_psnAppItllYn= false;
	protected final boolean isSet_psnAppItllYn(){
		return this.isSet_psnAppItllYn;
	}
	private void setIsSet_psnAppItllYn(boolean value){
		this.isSet_psnAppItllYn= value;
	}
	/**
	 * 개인앱설치여부
	 */
	@XmlTransient
	public String getPsnAppItllYn(){
		return this.psnAppItllYn;
	}
	
	/**
	 * 개인앱설치여부
	 * 
	 * @param psnAppItllYn 개인앱설치여부
	 */
	public void setPsnAppItllYn(String psnAppItllYn){
		this.psnAppItllYn= psnAppItllYn;
		this.setIsSet_psnAppItllYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_etcNtfcPsnAppYn= false;
	protected final boolean isSet_etcNtfcPsnAppYn(){
		return this.isSet_etcNtfcPsnAppYn;
	}
	private void setIsSet_etcNtfcPsnAppYn(boolean value){
		this.isSet_etcNtfcPsnAppYn= value;
	}
	/**
	 * 기타알림개인앱여부
	 */
	@XmlTransient
	public String getEtcNtfcPsnAppYn(){
		return this.etcNtfcPsnAppYn;
	}
	
	/**
	 * 기타알림개인앱여부
	 * 
	 * @param etcNtfcPsnAppYn 기타알림개인앱여부
	 */
	public void setEtcNtfcPsnAppYn(String etcNtfcPsnAppYn){
		this.etcNtfcPsnAppYn= etcNtfcPsnAppYn;
		this.setIsSet_etcNtfcPsnAppYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_smsCtrDt= false;
	protected final boolean isSet_smsCtrDt(){
		return this.isSet_smsCtrDt;
	}
	private void setIsSet_smsCtrDt(boolean value){
		this.isSet_smsCtrDt= value;
	}
	/**
	 * SMS계약일자
	 */
	@XmlTransient
	public String getSmsCtrDt(){
		return this.smsCtrDt;
	}
	
	/**
	 * SMS계약일자
	 * 
	 * @param smsCtrDt SMS계약일자
	 */
	public void setSmsCtrDt(String smsCtrDt){
		this.smsCtrDt= smsCtrDt;
		this.setIsSet_smsCtrDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_smsCancDt= false;
	protected final boolean isSet_smsCancDt(){
		return this.isSet_smsCancDt;
	}
	private void setIsSet_smsCancDt(boolean value){
		this.isSet_smsCancDt= value;
	}
	/**
	 * SMS해지일자
	 */
	@XmlTransient
	public String getSmsCancDt(){
		return this.smsCancDt;
	}
	
	/**
	 * SMS해지일자
	 * 
	 * @param smsCancDt SMS해지일자
	 */
	public void setSmsCancDt(String smsCancDt){
		this.smsCancDt= smsCancDt;
		this.setIsSet_smsCancDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_smsLstNtcDt= false;
	protected final boolean isSet_smsLstNtcDt(){
		return this.isSet_smsLstNtcDt;
	}
	private void setIsSet_smsLstNtcDt(boolean value){
		this.isSet_smsLstNtcDt= value;
	}
	/**
	 * SMS최종통지일자
	 */
	@XmlTransient
	public String getSmsLstNtcDt(){
		return this.smsLstNtcDt;
	}
	
	/**
	 * SMS최종통지일자
	 * 
	 * @param smsLstNtcDt SMS최종통지일자
	 */
	public void setSmsLstNtcDt(String smsLstNtcDt){
		this.smsLstNtcDt= smsLstNtcDt;
		this.setIsSet_smsLstNtcDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_smsRqSrno= false;
	protected final boolean isSet_smsRqSrno(){
		return this.isSet_smsRqSrno;
	}
	private void setIsSet_smsRqSrno(boolean value){
		this.isSet_smsRqSrno= value;
	}
	/**
	 * SMS신청일련번호
	 */
	@XmlTransient
	public String getSmsRqSrno(){
		return this.smsRqSrno;
	}
	
	/**
	 * SMS신청일련번호
	 * 
	 * @param smsRqSrno SMS신청일련번호
	 */
	public void setSmsRqSrno(String smsRqSrno){
		this.smsRqSrno= smsRqSrno;
		this.setIsSet_smsRqSrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rgpe= false;
	protected final boolean isSet_rgpe(){
		return this.isSet_rgpe;
	}
	private void setIsSet_rgpe(boolean value){
		this.isSet_rgpe= value;
	}
	/**
	 * 등록자
	 */
	@XmlTransient
	public String getRgpe(){
		return this.rgpe;
	}
	
	/**
	 * 등록자
	 * 
	 * @param rgpe 등록자
	 */
	public void setRgpe(String rgpe){
		this.rgpe= rgpe;
		this.setIsSet_rgpe(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_lstNtcCnt= false;
	protected final boolean isSet_lstNtcCnt(){
		return this.isSet_lstNtcCnt;
	}
	private void setIsSet_lstNtcCnt(boolean value){
		this.isSet_lstNtcCnt= value;
	}
	/**
	 * 최종통지건수
	 */
	@XmlTransient
	public Integer getLstNtcCnt(){
		return this.lstNtcCnt;
	}
	
	/**
	 * 최종통지건수
	 * 
	 * @param lstNtcCnt 최종통지건수
	 */
	public void setLstNtcCnt(Integer lstNtcCnt){
		this.lstNtcCnt= lstNtcCnt;
		this.setIsSet_lstNtcCnt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_fstCtrDt= false;
	protected final boolean isSet_fstCtrDt(){
		return this.isSet_fstCtrDt;
	}
	private void setIsSet_fstCtrDt(boolean value){
		this.isSet_fstCtrDt= value;
	}
	/**
	 * 최초계약일자
	 */
	@XmlTransient
	public String getFstCtrDt(){
		return this.fstCtrDt;
	}
	
	/**
	 * 최초계약일자
	 * 
	 * @param fstCtrDt 최초계약일자
	 */
	public void setFstCtrDt(String fstCtrDt){
		this.fstCtrDt= fstCtrDt;
		this.setIsSet_fstCtrDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_idcrDscd= false;
	protected final boolean isSet_idcrDscd(){
		return this.isSet_idcrDscd;
	}
	private void setIsSet_idcrDscd(boolean value){
		this.isSet_idcrDscd= value;
	}
	/**
	 * 신분증구분코드
	 */
	@XmlTransient
	public String getIdcrDscd(){
		return this.idcrDscd;
	}
	
	/**
	 * 신분증구분코드
	 * 
	 * @param idcrDscd 신분증구분코드
	 */
	public void setIdcrDscd(String idcrDscd){
		this.idcrDscd= idcrDscd;
		this.setIsSet_idcrDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_idcrFnm= false;
	protected final boolean isSet_idcrFnm(){
		return this.isSet_idcrFnm;
	}
	private void setIsSet_idcrFnm(boolean value){
		this.isSet_idcrFnm= value;
	}
	/**
	 * 신분증성명
	 */
	@XmlTransient
	public String getIdcrFnm(){
		return this.idcrFnm;
	}
	
	/**
	 * 신분증성명
	 * 
	 * @param idcrFnm 신분증성명
	 */
	public void setIdcrFnm(String idcrFnm){
		this.idcrFnm= idcrFnm;
		this.setIsSet_idcrFnm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_encyRrno= false;
	protected final boolean isSet_encyRrno(){
		return this.isSet_encyRrno;
	}
	private void setIsSet_encyRrno(boolean value){
		this.isSet_encyRrno= value;
	}
	/**
	 * 암호화주민등록번호
	 */
	@XmlTransient
	public String getEncyRrno(){
		return this.encyRrno;
	}
	
	/**
	 * 암호화주민등록번호
	 * 
	 * @param encyRrno 암호화주민등록번호
	 */
	public void setEncyRrno(String encyRrno){
		this.encyRrno= encyRrno;
		this.setIsSet_encyRrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_idcrIsuDt= false;
	protected final boolean isSet_idcrIsuDt(){
		return this.isSet_idcrIsuDt;
	}
	private void setIsSet_idcrIsuDt(boolean value){
		this.isSet_idcrIsuDt= value;
	}
	/**
	 * 신분증발급일자
	 */
	@XmlTransient
	public String getIdcrIsuDt(){
		return this.idcrIsuDt;
	}
	
	/**
	 * 신분증발급일자
	 * 
	 * @param idcrIsuDt 신분증발급일자
	 */
	public void setIdcrIsuDt(String idcrIsuDt){
		this.idcrIsuDt= idcrIsuDt;
		this.setIsSet_idcrIsuDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_idcrImgKey= false;
	protected final boolean isSet_idcrImgKey(){
		return this.isSet_idcrImgKey;
	}
	private void setIsSet_idcrImgKey(boolean value){
		this.isSet_idcrImgKey= value;
	}
	/**
	 * 신분증이미지키
	 */
	@XmlTransient
	public String getIdcrImgKey(){
		return this.idcrImgKey;
	}
	
	/**
	 * 신분증이미지키
	 * 
	 * @param idcrImgKey 신분증이미지키
	 */
	public void setIdcrImgKey(String idcrImgKey){
		this.idcrImgKey= idcrImgKey;
		this.setIsSet_idcrImgKey(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_idcrCnfShap= false;
	protected final boolean isSet_idcrCnfShap(){
		return this.isSet_idcrCnfShap;
	}
	private void setIsSet_idcrCnfShap(boolean value){
		this.isSet_idcrCnfShap= value;
	}
	/**
	 * 신분증확인형태
	 */
	@XmlTransient
	public String getIdcrCnfShap(){
		return this.idcrCnfShap;
	}
	
	/**
	 * 신분증확인형태
	 * 
	 * @param idcrCnfShap 신분증확인형태
	 */
	public void setIdcrCnfShap(String idcrCnfShap){
		this.idcrCnfShap= idcrCnfShap;
		this.setIsSet_idcrCnfShap(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_idcrRuseYn= false;
	protected final boolean isSet_idcrRuseYn(){
		return this.isSet_idcrRuseYn;
	}
	private void setIsSet_idcrRuseYn(boolean value){
		this.isSet_idcrRuseYn= value;
	}
	/**
	 * 신분증재사용여부
	 */
	@XmlTransient
	public String getIdcrRuseYn(){
		return this.idcrRuseYn;
	}
	
	/**
	 * 신분증재사용여부
	 * 
	 * @param idcrRuseYn 신분증재사용여부
	 */
	public void setIdcrRuseYn(String idcrRuseYn){
		this.idcrRuseYn= idcrRuseYn;
		this.setIsSet_idcrRuseYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_idcrAgnpeTrnYn= false;
	protected final boolean isSet_idcrAgnpeTrnYn(){
		return this.isSet_idcrAgnpeTrnYn;
	}
	private void setIsSet_idcrAgnpeTrnYn(boolean value){
		this.isSet_idcrAgnpeTrnYn= value;
	}
	/**
	 * 신분증대리인거래여부
	 */
	@XmlTransient
	public String getIdcrAgnpeTrnYn(){
		return this.idcrAgnpeTrnYn;
	}
	
	/**
	 * 신분증대리인거래여부
	 * 
	 * @param idcrAgnpeTrnYn 신분증대리인거래여부
	 */
	public void setIdcrAgnpeTrnYn(String idcrAgnpeTrnYn){
		this.idcrAgnpeTrnYn= idcrAgnpeTrnYn;
		this.setIsSet_idcrAgnpeTrnYn(true);
	}
				
	@Override
	public IBSMR0001249_DIDT clone(){
		try{
			IBSMR0001249_DIDT object= (IBSMR0001249_DIDT)super.clone();
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
		
		result= prime * result + ((this.encyAcnmNo==null)?0:this.encyAcnmNo.hashCode());
		result= prime * result + ((this.itcsno==null)?0:this.itcsno.hashCode());
		result= prime * result + ((this.tgtAcno==null)?0:this.tgtAcno.hashCode());
		result= prime * result + ((this.ntcTgtTrnDscd==null)?0:this.ntcTgtTrnDscd.hashCode());
		result= prime * result + ((this.ebnkSrvcStcd==null)?0:this.ebnkSrvcStcd.hashCode());
		result= prime * result + ((this.smsTmsLimAm==null)?0:this.smsTmsLimAm.hashCode());
		result= prime * result + ((this.balNtrsnYn==null)?0:this.balNtrsnYn.hashCode());
		result= prime * result + ((this.tmsStaTm==null)?0:this.tmsStaTm.hashCode());
		result= prime * result + ((this.tmsEndTm==null)?0:this.tmsEndTm.hashCode());
		result= prime * result + ((this.atsSndLimYn==null)?0:this.atsSndLimYn.hashCode());
		result= prime * result + ((this.hpComCd==null)?0:this.hpComCd.hashCode());
		result= prime * result + ((this.hpTlenNo==null)?0:this.hpTlenNo.hashCode());
		result= prime * result + ((this.hpSerNo==null)?0:this.hpSerNo.hashCode());
		result= prime * result + ((this.prcSrno==null)?0:this.prcSrno.hashCode());
		result= prime * result + ((this.advpeEno==null)?0:this.advpeEno.hashCode());
		result= prime * result + ((this.acnmCnfEno==null)?0:this.acnmCnfEno.hashCode());
		result= prime * result + ((this.acnmCnfEmpNm==null)?0:this.acnmCnfEmpNm.hashCode());
		result= prime * result + ((this.dpstTrnRqdcChc==null)?0:this.dpstTrnRqdcChc.hashCode());
		result= prime * result + ((this.appItllCmplYn==null)?0:this.appItllCmplYn.hashCode());
		result= prime * result + ((this.appItllDisNm==null)?0:this.appItllDisNm.hashCode());
		result= prime * result + ((this.appItllCmplDt==null)?0:this.appItllCmplDt.hashCode());
		result= prime * result + ((this.psnAppItllYn==null)?0:this.psnAppItllYn.hashCode());
		result= prime * result + ((this.etcNtfcPsnAppYn==null)?0:this.etcNtfcPsnAppYn.hashCode());
		result= prime * result + ((this.smsCtrDt==null)?0:this.smsCtrDt.hashCode());
		result= prime * result + ((this.smsCancDt==null)?0:this.smsCancDt.hashCode());
		result= prime * result + ((this.smsLstNtcDt==null)?0:this.smsLstNtcDt.hashCode());
		result= prime * result + ((this.smsRqSrno==null)?0:this.smsRqSrno.hashCode());
		result= prime * result + ((this.rgpe==null)?0:this.rgpe.hashCode());
		result= prime * result + ((this.lstNtcCnt==null)?0:this.lstNtcCnt.hashCode());
		result= prime * result + ((this.fstCtrDt==null)?0:this.fstCtrDt.hashCode());
		result= prime * result + ((this.idcrDscd==null)?0:this.idcrDscd.hashCode());
		result= prime * result + ((this.idcrFnm==null)?0:this.idcrFnm.hashCode());
		result= prime * result + ((this.encyRrno==null)?0:this.encyRrno.hashCode());
		result= prime * result + ((this.idcrIsuDt==null)?0:this.idcrIsuDt.hashCode());
		result= prime * result + ((this.idcrImgKey==null)?0:this.idcrImgKey.hashCode());
		result= prime * result + ((this.idcrCnfShap==null)?0:this.idcrCnfShap.hashCode());
		result= prime * result + ((this.idcrRuseYn==null)?0:this.idcrRuseYn.hashCode());
		result= prime * result + ((this.idcrAgnpeTrnYn==null)?0:this.idcrAgnpeTrnYn.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final IBSMR0001249_DIDT other= (IBSMR0001249_DIDT)obj;
		{
			Object _encyAcnmNo= getEncyAcnmNo();
			Object __encyAcnmNo= other.getEncyAcnmNo();
			if ( _encyAcnmNo== null ) { if ( __encyAcnmNo!= null ) return false; }
			else if ( !_encyAcnmNo.equals(__encyAcnmNo) ) return false;
		}
		{
			Object _itcsno= getItcsno();
			Object __itcsno= other.getItcsno();
			if ( _itcsno== null ) { if ( __itcsno!= null ) return false; }
			else if ( !_itcsno.equals(__itcsno) ) return false;
		}
		{
			Object _tgtAcno= getTgtAcno();
			Object __tgtAcno= other.getTgtAcno();
			if ( _tgtAcno== null ) { if ( __tgtAcno!= null ) return false; }
			else if ( !_tgtAcno.equals(__tgtAcno) ) return false;
		}
		{
			Object _ntcTgtTrnDscd= getNtcTgtTrnDscd();
			Object __ntcTgtTrnDscd= other.getNtcTgtTrnDscd();
			if ( _ntcTgtTrnDscd== null ) { if ( __ntcTgtTrnDscd!= null ) return false; }
			else if ( !_ntcTgtTrnDscd.equals(__ntcTgtTrnDscd) ) return false;
		}
		{
			Object _ebnkSrvcStcd= getEbnkSrvcStcd();
			Object __ebnkSrvcStcd= other.getEbnkSrvcStcd();
			if ( _ebnkSrvcStcd== null ) { if ( __ebnkSrvcStcd!= null ) return false; }
			else if ( !_ebnkSrvcStcd.equals(__ebnkSrvcStcd) ) return false;
		}
		{
			Object _smsTmsLimAm= getSmsTmsLimAm();
			Object __smsTmsLimAm= other.getSmsTmsLimAm();
			if ( _smsTmsLimAm== null ) { if ( __smsTmsLimAm!= null ) return false; }
			else if ( !_smsTmsLimAm.equals(__smsTmsLimAm) ) return false;
		}
		{
			Object _balNtrsnYn= getBalNtrsnYn();
			Object __balNtrsnYn= other.getBalNtrsnYn();
			if ( _balNtrsnYn== null ) { if ( __balNtrsnYn!= null ) return false; }
			else if ( !_balNtrsnYn.equals(__balNtrsnYn) ) return false;
		}
		{
			Object _tmsStaTm= getTmsStaTm();
			Object __tmsStaTm= other.getTmsStaTm();
			if ( _tmsStaTm== null ) { if ( __tmsStaTm!= null ) return false; }
			else if ( !_tmsStaTm.equals(__tmsStaTm) ) return false;
		}
		{
			Object _tmsEndTm= getTmsEndTm();
			Object __tmsEndTm= other.getTmsEndTm();
			if ( _tmsEndTm== null ) { if ( __tmsEndTm!= null ) return false; }
			else if ( !_tmsEndTm.equals(__tmsEndTm) ) return false;
		}
		{
			Object _atsSndLimYn= getAtsSndLimYn();
			Object __atsSndLimYn= other.getAtsSndLimYn();
			if ( _atsSndLimYn== null ) { if ( __atsSndLimYn!= null ) return false; }
			else if ( !_atsSndLimYn.equals(__atsSndLimYn) ) return false;
		}
		{
			Object _hpComCd= getHpComCd();
			Object __hpComCd= other.getHpComCd();
			if ( _hpComCd== null ) { if ( __hpComCd!= null ) return false; }
			else if ( !_hpComCd.equals(__hpComCd) ) return false;
		}
		{
			Object _hpTlenNo= getHpTlenNo();
			Object __hpTlenNo= other.getHpTlenNo();
			if ( _hpTlenNo== null ) { if ( __hpTlenNo!= null ) return false; }
			else if ( !_hpTlenNo.equals(__hpTlenNo) ) return false;
		}
		{
			Object _hpSerNo= getHpSerNo();
			Object __hpSerNo= other.getHpSerNo();
			if ( _hpSerNo== null ) { if ( __hpSerNo!= null ) return false; }
			else if ( !_hpSerNo.equals(__hpSerNo) ) return false;
		}
		{
			Object _prcSrno= getPrcSrno();
			Object __prcSrno= other.getPrcSrno();
			if ( _prcSrno== null ) { if ( __prcSrno!= null ) return false; }
			else if ( !_prcSrno.equals(__prcSrno) ) return false;
		}
		{
			Object _advpeEno= getAdvpeEno();
			Object __advpeEno= other.getAdvpeEno();
			if ( _advpeEno== null ) { if ( __advpeEno!= null ) return false; }
			else if ( !_advpeEno.equals(__advpeEno) ) return false;
		}
		{
			Object _acnmCnfEno= getAcnmCnfEno();
			Object __acnmCnfEno= other.getAcnmCnfEno();
			if ( _acnmCnfEno== null ) { if ( __acnmCnfEno!= null ) return false; }
			else if ( !_acnmCnfEno.equals(__acnmCnfEno) ) return false;
		}
		{
			Object _acnmCnfEmpNm= getAcnmCnfEmpNm();
			Object __acnmCnfEmpNm= other.getAcnmCnfEmpNm();
			if ( _acnmCnfEmpNm== null ) { if ( __acnmCnfEmpNm!= null ) return false; }
			else if ( !_acnmCnfEmpNm.equals(__acnmCnfEmpNm) ) return false;
		}
		{
			Object _dpstTrnRqdcChc= getDpstTrnRqdcChc();
			Object __dpstTrnRqdcChc= other.getDpstTrnRqdcChc();
			if ( _dpstTrnRqdcChc== null ) { if ( __dpstTrnRqdcChc!= null ) return false; }
			else if ( !_dpstTrnRqdcChc.equals(__dpstTrnRqdcChc) ) return false;
		}
		{
			Object _appItllCmplYn= getAppItllCmplYn();
			Object __appItllCmplYn= other.getAppItllCmplYn();
			if ( _appItllCmplYn== null ) { if ( __appItllCmplYn!= null ) return false; }
			else if ( !_appItllCmplYn.equals(__appItllCmplYn) ) return false;
		}
		{
			Object _appItllDisNm= getAppItllDisNm();
			Object __appItllDisNm= other.getAppItllDisNm();
			if ( _appItllDisNm== null ) { if ( __appItllDisNm!= null ) return false; }
			else if ( !_appItllDisNm.equals(__appItllDisNm) ) return false;
		}
		{
			Object _appItllCmplDt= getAppItllCmplDt();
			Object __appItllCmplDt= other.getAppItllCmplDt();
			if ( _appItllCmplDt== null ) { if ( __appItllCmplDt!= null ) return false; }
			else if ( !_appItllCmplDt.equals(__appItllCmplDt) ) return false;
		}
		{
			Object _psnAppItllYn= getPsnAppItllYn();
			Object __psnAppItllYn= other.getPsnAppItllYn();
			if ( _psnAppItllYn== null ) { if ( __psnAppItllYn!= null ) return false; }
			else if ( !_psnAppItllYn.equals(__psnAppItllYn) ) return false;
		}
		{
			Object _etcNtfcPsnAppYn= getEtcNtfcPsnAppYn();
			Object __etcNtfcPsnAppYn= other.getEtcNtfcPsnAppYn();
			if ( _etcNtfcPsnAppYn== null ) { if ( __etcNtfcPsnAppYn!= null ) return false; }
			else if ( !_etcNtfcPsnAppYn.equals(__etcNtfcPsnAppYn) ) return false;
		}
		{
			Object _smsCtrDt= getSmsCtrDt();
			Object __smsCtrDt= other.getSmsCtrDt();
			if ( _smsCtrDt== null ) { if ( __smsCtrDt!= null ) return false; }
			else if ( !_smsCtrDt.equals(__smsCtrDt) ) return false;
		}
		{
			Object _smsCancDt= getSmsCancDt();
			Object __smsCancDt= other.getSmsCancDt();
			if ( _smsCancDt== null ) { if ( __smsCancDt!= null ) return false; }
			else if ( !_smsCancDt.equals(__smsCancDt) ) return false;
		}
		{
			Object _smsLstNtcDt= getSmsLstNtcDt();
			Object __smsLstNtcDt= other.getSmsLstNtcDt();
			if ( _smsLstNtcDt== null ) { if ( __smsLstNtcDt!= null ) return false; }
			else if ( !_smsLstNtcDt.equals(__smsLstNtcDt) ) return false;
		}
		{
			Object _smsRqSrno= getSmsRqSrno();
			Object __smsRqSrno= other.getSmsRqSrno();
			if ( _smsRqSrno== null ) { if ( __smsRqSrno!= null ) return false; }
			else if ( !_smsRqSrno.equals(__smsRqSrno) ) return false;
		}
		{
			Object _rgpe= getRgpe();
			Object __rgpe= other.getRgpe();
			if ( _rgpe== null ) { if ( __rgpe!= null ) return false; }
			else if ( !_rgpe.equals(__rgpe) ) return false;
		}
		{
			Object _lstNtcCnt= getLstNtcCnt();
			Object __lstNtcCnt= other.getLstNtcCnt();
			if ( _lstNtcCnt== null ) { if ( __lstNtcCnt!= null ) return false; }
			else if ( !_lstNtcCnt.equals(__lstNtcCnt) ) return false;
		}
		{
			Object _fstCtrDt= getFstCtrDt();
			Object __fstCtrDt= other.getFstCtrDt();
			if ( _fstCtrDt== null ) { if ( __fstCtrDt!= null ) return false; }
			else if ( !_fstCtrDt.equals(__fstCtrDt) ) return false;
		}
		{
			Object _idcrDscd= getIdcrDscd();
			Object __idcrDscd= other.getIdcrDscd();
			if ( _idcrDscd== null ) { if ( __idcrDscd!= null ) return false; }
			else if ( !_idcrDscd.equals(__idcrDscd) ) return false;
		}
		{
			Object _idcrFnm= getIdcrFnm();
			Object __idcrFnm= other.getIdcrFnm();
			if ( _idcrFnm== null ) { if ( __idcrFnm!= null ) return false; }
			else if ( !_idcrFnm.equals(__idcrFnm) ) return false;
		}
		{
			Object _encyRrno= getEncyRrno();
			Object __encyRrno= other.getEncyRrno();
			if ( _encyRrno== null ) { if ( __encyRrno!= null ) return false; }
			else if ( !_encyRrno.equals(__encyRrno) ) return false;
		}
		{
			Object _idcrIsuDt= getIdcrIsuDt();
			Object __idcrIsuDt= other.getIdcrIsuDt();
			if ( _idcrIsuDt== null ) { if ( __idcrIsuDt!= null ) return false; }
			else if ( !_idcrIsuDt.equals(__idcrIsuDt) ) return false;
		}
		{
			Object _idcrImgKey= getIdcrImgKey();
			Object __idcrImgKey= other.getIdcrImgKey();
			if ( _idcrImgKey== null ) { if ( __idcrImgKey!= null ) return false; }
			else if ( !_idcrImgKey.equals(__idcrImgKey) ) return false;
		}
		{
			Object _idcrCnfShap= getIdcrCnfShap();
			Object __idcrCnfShap= other.getIdcrCnfShap();
			if ( _idcrCnfShap== null ) { if ( __idcrCnfShap!= null ) return false; }
			else if ( !_idcrCnfShap.equals(__idcrCnfShap) ) return false;
		}
		{
			Object _idcrRuseYn= getIdcrRuseYn();
			Object __idcrRuseYn= other.getIdcrRuseYn();
			if ( _idcrRuseYn== null ) { if ( __idcrRuseYn!= null ) return false; }
			else if ( !_idcrRuseYn.equals(__idcrRuseYn) ) return false;
		}
		{
			Object _idcrAgnpeTrnYn= getIdcrAgnpeTrnYn();
			Object __idcrAgnpeTrnYn= other.getIdcrAgnpeTrnYn();
			if ( _idcrAgnpeTrnYn== null ) { if ( __idcrAgnpeTrnYn!= null ) return false; }
			else if ( !_idcrAgnpeTrnYn.equals(__idcrAgnpeTrnYn) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(IBSMR0001249_DIDT.class.getName()).append(":\n");
		sb.append("\tencyAcnmNo: ");
		sb.append(encyAcnmNo==null?"null":getEncyAcnmNo());
		sb.append("\n");
		sb.append("\titcsno: ");
		sb.append(itcsno==null?"null":getItcsno());
		sb.append("\n");
		sb.append("\ttgtAcno: ");
		sb.append(tgtAcno==null?"null":getTgtAcno());
		sb.append("\n");
		sb.append("\tntcTgtTrnDscd: ");
		sb.append(ntcTgtTrnDscd==null?"null":getNtcTgtTrnDscd());
		sb.append("\n");
		sb.append("\tebnkSrvcStcd: ");
		sb.append(ebnkSrvcStcd==null?"null":getEbnkSrvcStcd());
		sb.append("\n");
		sb.append("\tsmsTmsLimAm: ");
		sb.append(smsTmsLimAm==null?"null":getSmsTmsLimAm());
		sb.append("\n");
		sb.append("\tbalNtrsnYn: ");
		sb.append(balNtrsnYn==null?"null":getBalNtrsnYn());
		sb.append("\n");
		sb.append("\ttmsStaTm: ");
		sb.append(tmsStaTm==null?"null":getTmsStaTm());
		sb.append("\n");
		sb.append("\ttmsEndTm: ");
		sb.append(tmsEndTm==null?"null":getTmsEndTm());
		sb.append("\n");
		sb.append("\tatsSndLimYn: ");
		sb.append(atsSndLimYn==null?"null":getAtsSndLimYn());
		sb.append("\n");
		sb.append("\thpComCd: ");
		sb.append(hpComCd==null?"null":getHpComCd());
		sb.append("\n");
		sb.append("\thpTlenNo: ");
		sb.append(hpTlenNo==null?"null":getHpTlenNo());
		sb.append("\n");
		sb.append("\thpSerNo: ");
		sb.append(hpSerNo==null?"null":getHpSerNo());
		sb.append("\n");
		sb.append("\tprcSrno: ");
		sb.append(prcSrno==null?"null":getPrcSrno());
		sb.append("\n");
		sb.append("\tadvpeEno: ");
		sb.append(advpeEno==null?"null":getAdvpeEno());
		sb.append("\n");
		sb.append("\tacnmCnfEno: ");
		sb.append(acnmCnfEno==null?"null":getAcnmCnfEno());
		sb.append("\n");
		sb.append("\tacnmCnfEmpNm: ");
		sb.append(acnmCnfEmpNm==null?"null":getAcnmCnfEmpNm());
		sb.append("\n");
		sb.append("\tdpstTrnRqdcChc: ");
		sb.append(dpstTrnRqdcChc==null?"null":getDpstTrnRqdcChc());
		sb.append("\n");
		sb.append("\tappItllCmplYn: ");
		sb.append(appItllCmplYn==null?"null":getAppItllCmplYn());
		sb.append("\n");
		sb.append("\tappItllDisNm: ");
		sb.append(appItllDisNm==null?"null":getAppItllDisNm());
		sb.append("\n");
		sb.append("\tappItllCmplDt: ");
		sb.append(appItllCmplDt==null?"null":getAppItllCmplDt());
		sb.append("\n");
		sb.append("\tpsnAppItllYn: ");
		sb.append(psnAppItllYn==null?"null":getPsnAppItllYn());
		sb.append("\n");
		sb.append("\tetcNtfcPsnAppYn: ");
		sb.append(etcNtfcPsnAppYn==null?"null":getEtcNtfcPsnAppYn());
		sb.append("\n");
		sb.append("\tsmsCtrDt: ");
		sb.append(smsCtrDt==null?"null":getSmsCtrDt());
		sb.append("\n");
		sb.append("\tsmsCancDt: ");
		sb.append(smsCancDt==null?"null":getSmsCancDt());
		sb.append("\n");
		sb.append("\tsmsLstNtcDt: ");
		sb.append(smsLstNtcDt==null?"null":getSmsLstNtcDt());
		sb.append("\n");
		sb.append("\tsmsRqSrno: ");
		sb.append(smsRqSrno==null?"null":getSmsRqSrno());
		sb.append("\n");
		sb.append("\trgpe: ");
		sb.append(rgpe==null?"null":getRgpe());
		sb.append("\n");
		sb.append("\tlstNtcCnt: ");
		sb.append(lstNtcCnt==null?"null":getLstNtcCnt());
		sb.append("\n");
		sb.append("\tfstCtrDt: ");
		sb.append(fstCtrDt==null?"null":getFstCtrDt());
		sb.append("\n");
		sb.append("\tidcrDscd: ");
		sb.append(idcrDscd==null?"null":getIdcrDscd());
		sb.append("\n");
		sb.append("\tidcrFnm: ");
		sb.append(idcrFnm==null?"null":getIdcrFnm());
		sb.append("\n");
		sb.append("\tencyRrno: ");
		sb.append(encyRrno==null?"null":getEncyRrno());
		sb.append("\n");
		sb.append("\tidcrIsuDt: ");
		sb.append(idcrIsuDt==null?"null":getIdcrIsuDt());
		sb.append("\n");
		sb.append("\tidcrImgKey: ");
		sb.append(idcrImgKey==null?"null":getIdcrImgKey());
		sb.append("\n");
		sb.append("\tidcrCnfShap: ");
		sb.append(idcrCnfShap==null?"null":getIdcrCnfShap());
		sb.append("\n");
		sb.append("\tidcrRuseYn: ");
		sb.append(idcrRuseYn==null?"null":getIdcrRuseYn());
		sb.append("\n");
		sb.append("\tidcrAgnpeTrnYn: ");
		sb.append(idcrAgnpeTrnYn==null?"null":getIdcrAgnpeTrnYn());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 32; /* encyAcnmNo */
		messageLen+= 11; /* itcsno */
		messageLen+= 20; /* tgtAcno */
		messageLen+= 1; /* ntcTgtTrnDscd */
		messageLen+= 2; /* ebnkSrvcStcd */
		messageLen+= 18; /* smsTmsLimAm */
		messageLen+= 1; /* balNtrsnYn */
		messageLen+= 2; /* tmsStaTm */
		messageLen+= 2; /* tmsEndTm */
		messageLen+= 1; /* atsSndLimYn */
		messageLen+= 4; /* hpComCd */
		messageLen+= 4; /* hpTlenNo */
		messageLen+= 4; /* hpSerNo */
		messageLen+= 5; /* prcSrno */
		messageLen+= 8; /* advpeEno */
		messageLen+= 8; /* acnmCnfEno */
		messageLen+= 30; /* acnmCnfEmpNm */
		messageLen+= 1; /* dpstTrnRqdcChc */
		messageLen+= 1; /* appItllCmplYn */
		messageLen+= 30; /* appItllDisNm */
		messageLen+= 8; /* appItllCmplDt */
		messageLen+= 1; /* psnAppItllYn */
		messageLen+= 1; /* etcNtfcPsnAppYn */
		messageLen+= 8; /* smsCtrDt */
		messageLen+= 8; /* smsCancDt */
		messageLen+= 8; /* smsLstNtcDt */
		messageLen+= 20; /* smsRqSrno */
		messageLen+= 10; /* rgpe */
		messageLen+= 6; /* lstNtcCnt */
		messageLen+= 8; /* fstCtrDt */
		messageLen+= 2; /* idcrDscd */
		messageLen+= 50; /* idcrFnm */
		messageLen+= 32; /* encyRrno */
		messageLen+= 8; /* idcrIsuDt */
		messageLen+= 13; /* idcrImgKey */
		messageLen+= 1; /* idcrCnfShap */
		messageLen+= 1; /* idcrRuseYn */
		messageLen+= 1; /* idcrAgnpeTrnYn */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("encyAcnmNo");
		list.add("itcsno");
		list.add("tgtAcno");
		list.add("ntcTgtTrnDscd");
		list.add("ebnkSrvcStcd");
		list.add("smsTmsLimAm");
		list.add("balNtrsnYn");
		list.add("tmsStaTm");
		list.add("tmsEndTm");
		list.add("atsSndLimYn");
		list.add("hpComCd");
		list.add("hpTlenNo");
		list.add("hpSerNo");
		list.add("prcSrno");
		list.add("advpeEno");
		list.add("acnmCnfEno");
		list.add("acnmCnfEmpNm");
		list.add("dpstTrnRqdcChc");
		list.add("appItllCmplYn");
		list.add("appItllDisNm");
		list.add("appItllCmplDt");
		list.add("psnAppItllYn");
		list.add("etcNtfcPsnAppYn");
		list.add("smsCtrDt");
		list.add("smsCancDt");
		list.add("smsLstNtcDt");
		list.add("smsRqSrno");
		list.add("rgpe");
		list.add("lstNtcCnt");
		list.add("fstCtrDt");
		list.add("idcrDscd");
		list.add("idcrFnm");
		list.add("encyRrno");
		list.add("idcrIsuDt");
		list.add("idcrImgKey");
		list.add("idcrCnfShap");
		list.add("idcrRuseYn");
		list.add("idcrAgnpeTrnYn");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("encyAcnmNo", get("encyAcnmNo"));
		map.put("itcsno", get("itcsno"));
		map.put("tgtAcno", get("tgtAcno"));
		map.put("ntcTgtTrnDscd", get("ntcTgtTrnDscd"));
		map.put("ebnkSrvcStcd", get("ebnkSrvcStcd"));
		map.put("smsTmsLimAm", get("smsTmsLimAm"));
		map.put("balNtrsnYn", get("balNtrsnYn"));
		map.put("tmsStaTm", get("tmsStaTm"));
		map.put("tmsEndTm", get("tmsEndTm"));
		map.put("atsSndLimYn", get("atsSndLimYn"));
		map.put("hpComCd", get("hpComCd"));
		map.put("hpTlenNo", get("hpTlenNo"));
		map.put("hpSerNo", get("hpSerNo"));
		map.put("prcSrno", get("prcSrno"));
		map.put("advpeEno", get("advpeEno"));
		map.put("acnmCnfEno", get("acnmCnfEno"));
		map.put("acnmCnfEmpNm", get("acnmCnfEmpNm"));
		map.put("dpstTrnRqdcChc", get("dpstTrnRqdcChc"));
		map.put("appItllCmplYn", get("appItllCmplYn"));
		map.put("appItllDisNm", get("appItllDisNm"));
		map.put("appItllCmplDt", get("appItllCmplDt"));
		map.put("psnAppItllYn", get("psnAppItllYn"));
		map.put("etcNtfcPsnAppYn", get("etcNtfcPsnAppYn"));
		map.put("smsCtrDt", get("smsCtrDt"));
		map.put("smsCancDt", get("smsCancDt"));
		map.put("smsLstNtcDt", get("smsLstNtcDt"));
		map.put("smsRqSrno", get("smsRqSrno"));
		map.put("rgpe", get("rgpe"));
		map.put("lstNtcCnt", get("lstNtcCnt"));
		map.put("fstCtrDt", get("fstCtrDt"));
		map.put("idcrDscd", get("idcrDscd"));
		map.put("idcrFnm", get("idcrFnm"));
		map.put("encyRrno", get("encyRrno"));
		map.put("idcrIsuDt", get("idcrIsuDt"));
		map.put("idcrImgKey", get("idcrImgKey"));
		map.put("idcrCnfShap", get("idcrCnfShap"));
		map.put("idcrRuseYn", get("idcrRuseYn"));
		map.put("idcrAgnpeTrnYn", get("idcrAgnpeTrnYn"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -1210488127:/* encyAcnmNo */
			return getEncyAcnmNo();
		case -1178714660:/* itcsno */
			return getItcsno();
		case -1365789340:/* tgtAcno */
			return getTgtAcno();
		case -1825988964:/* ntcTgtTrnDscd */
			return getNtcTgtTrnDscd();
		case 71960360:/* ebnkSrvcStcd */
			return getEbnkSrvcStcd();
		case -448336293:/* smsTmsLimAm */
			return getSmsTmsLimAm();
		case 1872684911:/* balNtrsnYn */
			return getBalNtrsnYn();
		case 1628745663:/* tmsStaTm */
			return getTmsStaTm();
		case 1615640506:/* tmsEndTm */
			return getTmsEndTm();
		case -828320612:/* atsSndLimYn */
			return getAtsSndLimYn();
		case 1082856858:/* hpComCd */
			return getHpComCd();
		case -307448342:/* hpTlenNo */
			return getHpTlenNo();
		case 1097340441:/* hpSerNo */
			return getHpSerNo();
		case -321065311:/* prcSrno */
			return getPrcSrno();
		case -705281570:/* advpeEno */
			return getAdvpeEno();
		case -2019195316:/* acnmCnfEno */
			return getAcnmCnfEno();
		case 878492813:/* acnmCnfEmpNm */
			return getAcnmCnfEmpNm();
		case 167348413:/* dpstTrnRqdcChc */
			return getDpstTrnRqdcChc();
		case 1443413607:/* appItllCmplYn */
			return getAppItllCmplYn();
		case 1432841377:/* appItllDisNm */
			return getAppItllDisNm();
		case 1443412962:/* appItllCmplDt */
			return getAppItllCmplDt();
		case -137878698:/* psnAppItllYn */
			return getPsnAppItllYn();
		case 2105505506:/* etcNtfcPsnAppYn */
			return getEtcNtfcPsnAppYn();
		case -128825160:/* smsCtrDt */
			return getSmsCtrDt();
		case 283749692:/* smsCancDt */
			return getSmsCancDt();
		case -445067911:/* smsLstNtcDt */
			return getSmsLstNtcDt();
		case 727174648:/* smsRqSrno */
			return getSmsRqSrno();
		case 3498730:/* rgpe */
			return getRgpe();
		case -1157396743:/* lstNtcCnt */
			return getLstNtcCnt();
		case -251839094:/* fstCtrDt */
			return getFstCtrDt();
		case -190746854:/* idcrDscd */
			return getIdcrDscd();
		case 1656416635:/* idcrFnm */
			return getIdcrFnm();
		case 1719929728:/* encyRrno */
			return getEncyRrno();
		case -1613551151:/* idcrIsuDt */
			return getIdcrIsuDt();
		case 1513570054:/* idcrImgKey */
			return getIdcrImgKey();
		case -1326077163:/* idcrCnfShap */
			return getIdcrCnfShap();
		case 1779002676:/* idcrRuseYn */
			return getIdcrRuseYn();
		case 1032390738:/* idcrAgnpeTrnYn */
			return getIdcrAgnpeTrnYn();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -1210488127:/* encyAcnmNo */
			setEncyAcnmNo((String)value);
			break;
		case -1178714660:/* itcsno */
			setItcsno((String)value);
			break;
		case -1365789340:/* tgtAcno */
			setTgtAcno((String)value);
			break;
		case -1825988964:/* ntcTgtTrnDscd */
			setNtcTgtTrnDscd((String)value);
			break;
		case 71960360:/* ebnkSrvcStcd */
			setEbnkSrvcStcd((String)value);
			break;
		case -448336293:/* smsTmsLimAm */
			if ( value instanceof String ){
				setSmsTmsLimAm((String)value);
			}
			else if ( value instanceof Double ){
				setSmsTmsLimAm((Double)value);
			}
			else if ( value instanceof Long ){
				setSmsTmsLimAm((Long)value);
			}
			else{
				setSmsTmsLimAm((BigDecimal)value);
			}
			break;
		case 1872684911:/* balNtrsnYn */
			setBalNtrsnYn((String)value);
			break;
		case 1628745663:/* tmsStaTm */
			setTmsStaTm((String)value);
			break;
		case 1615640506:/* tmsEndTm */
			setTmsEndTm((String)value);
			break;
		case -828320612:/* atsSndLimYn */
			setAtsSndLimYn((String)value);
			break;
		case 1082856858:/* hpComCd */
			setHpComCd((String)value);
			break;
		case -307448342:/* hpTlenNo */
			setHpTlenNo((String)value);
			break;
		case 1097340441:/* hpSerNo */
			setHpSerNo((String)value);
			break;
		case -321065311:/* prcSrno */
			setPrcSrno((Integer)value);
			break;
		case -705281570:/* advpeEno */
			setAdvpeEno((String)value);
			break;
		case -2019195316:/* acnmCnfEno */
			setAcnmCnfEno((String)value);
			break;
		case 878492813:/* acnmCnfEmpNm */
			setAcnmCnfEmpNm((String)value);
			break;
		case 167348413:/* dpstTrnRqdcChc */
			setDpstTrnRqdcChc((String)value);
			break;
		case 1443413607:/* appItllCmplYn */
			setAppItllCmplYn((String)value);
			break;
		case 1432841377:/* appItllDisNm */
			setAppItllDisNm((String)value);
			break;
		case 1443412962:/* appItllCmplDt */
			setAppItllCmplDt((String)value);
			break;
		case -137878698:/* psnAppItllYn */
			setPsnAppItllYn((String)value);
			break;
		case 2105505506:/* etcNtfcPsnAppYn */
			setEtcNtfcPsnAppYn((String)value);
			break;
		case -128825160:/* smsCtrDt */
			setSmsCtrDt((String)value);
			break;
		case 283749692:/* smsCancDt */
			setSmsCancDt((String)value);
			break;
		case -445067911:/* smsLstNtcDt */
			setSmsLstNtcDt((String)value);
			break;
		case 727174648:/* smsRqSrno */
			setSmsRqSrno((String)value);
			break;
		case 3498730:/* rgpe */
			setRgpe((String)value);
			break;
		case -1157396743:/* lstNtcCnt */
			setLstNtcCnt((Integer)value);
			break;
		case -251839094:/* fstCtrDt */
			setFstCtrDt((String)value);
			break;
		case -190746854:/* idcrDscd */
			setIdcrDscd((String)value);
			break;
		case 1656416635:/* idcrFnm */
			setIdcrFnm((String)value);
			break;
		case 1719929728:/* encyRrno */
			setEncyRrno((String)value);
			break;
		case -1613551151:/* idcrIsuDt */
			setIdcrIsuDt((String)value);
			break;
		case 1513570054:/* idcrImgKey */
			setIdcrImgKey((String)value);
			break;
		case -1326077163:/* idcrCnfShap */
			setIdcrCnfShap((String)value);
			break;
		case 1779002676:/* idcrRuseYn */
			setIdcrRuseYn((String)value);
			break;
		case 1032390738:/* idcrAgnpeTrnYn */
			setIdcrAgnpeTrnYn((String)value);
			break;
		default:
			break;
		}
	}
	
}
