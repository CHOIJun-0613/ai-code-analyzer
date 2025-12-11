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
 * SMS입출금.거래내용.통지.GRID.DBM.출력.IO
 */
@XmlType(propOrder={
	"dpsAcno", "ebnkSrvcStcd", "hpNo1", "rgsCnt", "balNtrsnYn", "smsTmsLimAm", "tmsStaTm", "tmsEndTm", "ntcLimCnt", "smsLstNtcDt", "lstNtcCnt", "fstlNwolAcno", "smsFeeWdrDd", "feeLevyDt", "efFeeAplCd"
	, "fxmpXprDt", "smsCtrDt", "fstCtrDt", "mdKdcd", "smsRqSrno", "advpeEno", "smsCancDt", "feeDfpmLevyYn", "atsSndLimYn", "cusInfNlkgYn", "feeWdrGdncNoreYn", "lstFeeWdrDd", "lstFeePymCnt", "lstFeePymAm", "byImpnScdCnt"
	, "byImpnScdAm", "langDscd", "actNm"
}, name="INBSmsRawTrnTxtNtcGrid1_DTO")
@XmlRootElement(name="INBSmsRawTrnTxtNtcGrid1_DTO")
@BxmCategory(logicalName="SMS입출금.거래내용.통지.GRID1.공통.IO", description="SMS입출금.거래내용.통지.GRID.DBM.출력.IO") 
public class INBSmsRawTrnTxtNtcGrid1_DTO implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -30675446L;
	
	
	
	/**
	 * 수신계좌번호
	 */
	@ApiModelProperty(
		name = "dpsAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dpsAcno")
	@BxmOmm_Field(length=20, decimal=0, description="수신계좌번호", align="left", fill="")
	private String dpsAcno= "";
	
	
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
	 * 핸드폰번호_1
	 */
	@ApiModelProperty(
		name = "hpNo1"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("hpNo1")
	@BxmOmm_Field(length=14, decimal=0, description="핸드폰번호_1", align="left", fill="")
	private String hpNo1= "";
	
	
	/**
	 * 등록건수
	 */
	@ApiModelProperty(
		name = "rgsCnt"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("rgsCnt")
	@BxmOmm_Field(length=5, decimal=0, description="등록건수", align="right", fill="")
	private Integer rgsCnt= 0;
	
	
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
	 * 통지제한건수
	 */
	@ApiModelProperty(
		name = "ntcLimCnt"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("ntcLimCnt")
	@BxmOmm_Field(length=6, decimal=0, description="통지제한건수", align="right", fill="")
	private Integer ntcLimCnt= 0;
	
	
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
	 * 수수료결제신구계좌번호
	 */
	@ApiModelProperty(
		name = "fstlNwolAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("fstlNwolAcno")
	@BxmOmm_Field(length=15, decimal=0, description="수수료결제신구계좌번호", align="left", fill="")
	private String fstlNwolAcno= "";
	
	
	/**
	 * SMS수수료출금일
	 */
	@ApiModelProperty(
		name = "smsFeeWdrDd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("smsFeeWdrDd")
	@BxmOmm_Field(length=2, decimal=0, description="SMS수수료출금일", align="left", fill="")
	private String smsFeeWdrDd= "";
	
	
	/**
	 * 수수료징수일자
	 */
	@ApiModelProperty(
		name = "feeLevyDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("feeLevyDt")
	@BxmOmm_Field(length=8, decimal=0, description="수수료징수일자", align="left", fill="")
	private String feeLevyDt= "";
	
	
	/**
	 * 전자금융수수료적용코드
	 */
	@ApiModelProperty(
		name = "efFeeAplCd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("efFeeAplCd")
	@BxmOmm_Field(length=1, decimal=0, description="전자금융수수료적용코드", align="left", fill="")
	private String efFeeAplCd= "";
	
	
	/**
	 * 수수료면제만기일자
	 */
	@ApiModelProperty(
		name = "fxmpXprDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("fxmpXprDt")
	@BxmOmm_Field(length=8, decimal=0, description="수수료면제만기일자", align="left", fill="")
	private String fxmpXprDt= "";
	
	
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
	 * 매체종류코드
	 */
	@ApiModelProperty(
		name = "mdKdcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("mdKdcd")
	@BxmOmm_Field(length=8, decimal=0, description="매체종류코드", align="left", fill="")
	private String mdKdcd= "";
	
	
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
	 * 수수료후불징수여부
	 */
	@ApiModelProperty(
		name = "feeDfpmLevyYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("feeDfpmLevyYn")
	@BxmOmm_Field(length=1, decimal=0, description="수수료후불징수여부", align="left", fill="")
	private String feeDfpmLevyYn= "";
	
	
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
	 * 고객정보미연동여부
	 */
	@ApiModelProperty(
		name = "cusInfNlkgYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("cusInfNlkgYn")
	@BxmOmm_Field(length=1, decimal=0, description="고객정보미연동여부", align="left", fill="")
	private String cusInfNlkgYn= "";
	
	
	/**
	 * 수수료출금안내미수신여부
	 */
	@ApiModelProperty(
		name = "feeWdrGdncNoreYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("feeWdrGdncNoreYn")
	@BxmOmm_Field(length=1, decimal=0, description="수수료출금안내미수신여부", align="left", fill="")
	private String feeWdrGdncNoreYn= "";
	
	
	/**
	 * 최종수수료출금일
	 */
	@ApiModelProperty(
		name = "lstFeeWdrDd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("lstFeeWdrDd")
	@BxmOmm_Field(length=8, decimal=0, description="최종수수료출금일", align="left", fill="")
	private String lstFeeWdrDd= "";
	
	
	/**
	 * 최종수수료납부건수
	 */
	@ApiModelProperty(
		name = "lstFeePymCnt"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("lstFeePymCnt")
	@BxmOmm_Field(length=7, decimal=0, description="최종수수료납부건수", align="right", fill="")
	private Integer lstFeePymCnt= 0;
	
	
	/**
	 * 최종수수료납부금액
	 */
	@ApiModelProperty(
		name = "lstFeePymAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("lstFeePymAm")
	@BxmOmm_Field(length=18, decimal=0, description="최종수수료납부금액", align="right", fill="")
	private BigDecimal lstFeePymAm= new BigDecimal("0");
	
	
	/**
	 * 건별부과예정건수
	 */
	@ApiModelProperty(
		name = "byImpnScdCnt"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("byImpnScdCnt")
	@BxmOmm_Field(length=5, decimal=0, description="건별부과예정건수", align="right", fill="")
	private Integer byImpnScdCnt= 0;
	
	
	/**
	 * 건별부과예정금액
	 */
	@ApiModelProperty(
		name = "byImpnScdAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("byImpnScdAm")
	@BxmOmm_Field(length=18, decimal=0, description="건별부과예정금액", align="right", fill="")
	private BigDecimal byImpnScdAm= new BigDecimal("0");
	
	
	/**
	 * 언어구분코드
	 */
	@ApiModelProperty(
		name = "langDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("langDscd")
	@BxmOmm_Field(length=2, decimal=0, description="언어구분코드", align="left", fill="")
	private String langDscd= "";
	
	
	/**
	 * 계좌명
	 */
	@ApiModelProperty(
		name = "actNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("actNm")
	@BxmOmm_Field(length=100, decimal=0, description="계좌명", align="left", fill="")
	private String actNm= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dpsAcno= false;
	protected final boolean isSet_dpsAcno(){
		return this.isSet_dpsAcno;
	}
	private void setIsSet_dpsAcno(boolean value){
		this.isSet_dpsAcno= value;
	}
	/**
	 * 수신계좌번호
	 */
	@XmlTransient
	public String getDpsAcno(){
		return this.dpsAcno;
	}
	
	/**
	 * 수신계좌번호
	 * 
	 * @param dpsAcno 수신계좌번호
	 */
	public void setDpsAcno(String dpsAcno){
		this.dpsAcno= dpsAcno;
		this.setIsSet_dpsAcno(true);
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
	private boolean isSet_hpNo1= false;
	protected final boolean isSet_hpNo1(){
		return this.isSet_hpNo1;
	}
	private void setIsSet_hpNo1(boolean value){
		this.isSet_hpNo1= value;
	}
	/**
	 * 핸드폰번호_1
	 */
	@XmlTransient
	public String getHpNo1(){
		return this.hpNo1;
	}
	
	/**
	 * 핸드폰번호_1
	 * 
	 * @param hpNo1 핸드폰번호_1
	 */
	public void setHpNo1(String hpNo1){
		this.hpNo1= hpNo1;
		this.setIsSet_hpNo1(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rgsCnt= false;
	protected final boolean isSet_rgsCnt(){
		return this.isSet_rgsCnt;
	}
	private void setIsSet_rgsCnt(boolean value){
		this.isSet_rgsCnt= value;
	}
	/**
	 * 등록건수
	 */
	@XmlTransient
	public Integer getRgsCnt(){
		return this.rgsCnt;
	}
	
	/**
	 * 등록건수
	 * 
	 * @param rgsCnt 등록건수
	 */
	public void setRgsCnt(Integer rgsCnt){
		this.rgsCnt= rgsCnt;
		this.setIsSet_rgsCnt(true);
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
	private boolean isSet_ntcLimCnt= false;
	protected final boolean isSet_ntcLimCnt(){
		return this.isSet_ntcLimCnt;
	}
	private void setIsSet_ntcLimCnt(boolean value){
		this.isSet_ntcLimCnt= value;
	}
	/**
	 * 통지제한건수
	 */
	@XmlTransient
	public Integer getNtcLimCnt(){
		return this.ntcLimCnt;
	}
	
	/**
	 * 통지제한건수
	 * 
	 * @param ntcLimCnt 통지제한건수
	 */
	public void setNtcLimCnt(Integer ntcLimCnt){
		this.ntcLimCnt= ntcLimCnt;
		this.setIsSet_ntcLimCnt(true);
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
	private boolean isSet_fstlNwolAcno= false;
	protected final boolean isSet_fstlNwolAcno(){
		return this.isSet_fstlNwolAcno;
	}
	private void setIsSet_fstlNwolAcno(boolean value){
		this.isSet_fstlNwolAcno= value;
	}
	/**
	 * 수수료결제신구계좌번호
	 */
	@XmlTransient
	public String getFstlNwolAcno(){
		return this.fstlNwolAcno;
	}
	
	/**
	 * 수수료결제신구계좌번호
	 * 
	 * @param fstlNwolAcno 수수료결제신구계좌번호
	 */
	public void setFstlNwolAcno(String fstlNwolAcno){
		this.fstlNwolAcno= fstlNwolAcno;
		this.setIsSet_fstlNwolAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_smsFeeWdrDd= false;
	protected final boolean isSet_smsFeeWdrDd(){
		return this.isSet_smsFeeWdrDd;
	}
	private void setIsSet_smsFeeWdrDd(boolean value){
		this.isSet_smsFeeWdrDd= value;
	}
	/**
	 * SMS수수료출금일
	 */
	@XmlTransient
	public String getSmsFeeWdrDd(){
		return this.smsFeeWdrDd;
	}
	
	/**
	 * SMS수수료출금일
	 * 
	 * @param smsFeeWdrDd SMS수수료출금일
	 */
	public void setSmsFeeWdrDd(String smsFeeWdrDd){
		this.smsFeeWdrDd= smsFeeWdrDd;
		this.setIsSet_smsFeeWdrDd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_feeLevyDt= false;
	protected final boolean isSet_feeLevyDt(){
		return this.isSet_feeLevyDt;
	}
	private void setIsSet_feeLevyDt(boolean value){
		this.isSet_feeLevyDt= value;
	}
	/**
	 * 수수료징수일자
	 */
	@XmlTransient
	public String getFeeLevyDt(){
		return this.feeLevyDt;
	}
	
	/**
	 * 수수료징수일자
	 * 
	 * @param feeLevyDt 수수료징수일자
	 */
	public void setFeeLevyDt(String feeLevyDt){
		this.feeLevyDt= feeLevyDt;
		this.setIsSet_feeLevyDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_efFeeAplCd= false;
	protected final boolean isSet_efFeeAplCd(){
		return this.isSet_efFeeAplCd;
	}
	private void setIsSet_efFeeAplCd(boolean value){
		this.isSet_efFeeAplCd= value;
	}
	/**
	 * 전자금융수수료적용코드
	 */
	@XmlTransient
	public String getEfFeeAplCd(){
		return this.efFeeAplCd;
	}
	
	/**
	 * 전자금융수수료적용코드
	 * 
	 * @param efFeeAplCd 전자금융수수료적용코드
	 */
	public void setEfFeeAplCd(String efFeeAplCd){
		this.efFeeAplCd= efFeeAplCd;
		this.setIsSet_efFeeAplCd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_fxmpXprDt= false;
	protected final boolean isSet_fxmpXprDt(){
		return this.isSet_fxmpXprDt;
	}
	private void setIsSet_fxmpXprDt(boolean value){
		this.isSet_fxmpXprDt= value;
	}
	/**
	 * 수수료면제만기일자
	 */
	@XmlTransient
	public String getFxmpXprDt(){
		return this.fxmpXprDt;
	}
	
	/**
	 * 수수료면제만기일자
	 * 
	 * @param fxmpXprDt 수수료면제만기일자
	 */
	public void setFxmpXprDt(String fxmpXprDt){
		this.fxmpXprDt= fxmpXprDt;
		this.setIsSet_fxmpXprDt(true);
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
	private boolean isSet_mdKdcd= false;
	protected final boolean isSet_mdKdcd(){
		return this.isSet_mdKdcd;
	}
	private void setIsSet_mdKdcd(boolean value){
		this.isSet_mdKdcd= value;
	}
	/**
	 * 매체종류코드
	 */
	@XmlTransient
	public String getMdKdcd(){
		return this.mdKdcd;
	}
	
	/**
	 * 매체종류코드
	 * 
	 * @param mdKdcd 매체종류코드
	 */
	public void setMdKdcd(String mdKdcd){
		this.mdKdcd= mdKdcd;
		this.setIsSet_mdKdcd(true);
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
	private boolean isSet_feeDfpmLevyYn= false;
	protected final boolean isSet_feeDfpmLevyYn(){
		return this.isSet_feeDfpmLevyYn;
	}
	private void setIsSet_feeDfpmLevyYn(boolean value){
		this.isSet_feeDfpmLevyYn= value;
	}
	/**
	 * 수수료후불징수여부
	 */
	@XmlTransient
	public String getFeeDfpmLevyYn(){
		return this.feeDfpmLevyYn;
	}
	
	/**
	 * 수수료후불징수여부
	 * 
	 * @param feeDfpmLevyYn 수수료후불징수여부
	 */
	public void setFeeDfpmLevyYn(String feeDfpmLevyYn){
		this.feeDfpmLevyYn= feeDfpmLevyYn;
		this.setIsSet_feeDfpmLevyYn(true);
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
	private boolean isSet_cusInfNlkgYn= false;
	protected final boolean isSet_cusInfNlkgYn(){
		return this.isSet_cusInfNlkgYn;
	}
	private void setIsSet_cusInfNlkgYn(boolean value){
		this.isSet_cusInfNlkgYn= value;
	}
	/**
	 * 고객정보미연동여부
	 */
	@XmlTransient
	public String getCusInfNlkgYn(){
		return this.cusInfNlkgYn;
	}
	
	/**
	 * 고객정보미연동여부
	 * 
	 * @param cusInfNlkgYn 고객정보미연동여부
	 */
	public void setCusInfNlkgYn(String cusInfNlkgYn){
		this.cusInfNlkgYn= cusInfNlkgYn;
		this.setIsSet_cusInfNlkgYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_feeWdrGdncNoreYn= false;
	protected final boolean isSet_feeWdrGdncNoreYn(){
		return this.isSet_feeWdrGdncNoreYn;
	}
	private void setIsSet_feeWdrGdncNoreYn(boolean value){
		this.isSet_feeWdrGdncNoreYn= value;
	}
	/**
	 * 수수료출금안내미수신여부
	 */
	@XmlTransient
	public String getFeeWdrGdncNoreYn(){
		return this.feeWdrGdncNoreYn;
	}
	
	/**
	 * 수수료출금안내미수신여부
	 * 
	 * @param feeWdrGdncNoreYn 수수료출금안내미수신여부
	 */
	public void setFeeWdrGdncNoreYn(String feeWdrGdncNoreYn){
		this.feeWdrGdncNoreYn= feeWdrGdncNoreYn;
		this.setIsSet_feeWdrGdncNoreYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_lstFeeWdrDd= false;
	protected final boolean isSet_lstFeeWdrDd(){
		return this.isSet_lstFeeWdrDd;
	}
	private void setIsSet_lstFeeWdrDd(boolean value){
		this.isSet_lstFeeWdrDd= value;
	}
	/**
	 * 최종수수료출금일
	 */
	@XmlTransient
	public String getLstFeeWdrDd(){
		return this.lstFeeWdrDd;
	}
	
	/**
	 * 최종수수료출금일
	 * 
	 * @param lstFeeWdrDd 최종수수료출금일
	 */
	public void setLstFeeWdrDd(String lstFeeWdrDd){
		this.lstFeeWdrDd= lstFeeWdrDd;
		this.setIsSet_lstFeeWdrDd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_lstFeePymCnt= false;
	protected final boolean isSet_lstFeePymCnt(){
		return this.isSet_lstFeePymCnt;
	}
	private void setIsSet_lstFeePymCnt(boolean value){
		this.isSet_lstFeePymCnt= value;
	}
	/**
	 * 최종수수료납부건수
	 */
	@XmlTransient
	public Integer getLstFeePymCnt(){
		return this.lstFeePymCnt;
	}
	
	/**
	 * 최종수수료납부건수
	 * 
	 * @param lstFeePymCnt 최종수수료납부건수
	 */
	public void setLstFeePymCnt(Integer lstFeePymCnt){
		this.lstFeePymCnt= lstFeePymCnt;
		this.setIsSet_lstFeePymCnt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_lstFeePymAm= false;
	protected final boolean isSet_lstFeePymAm(){
		return this.isSet_lstFeePymAm;
	}
	private void setIsSet_lstFeePymAm(boolean value){
		this.isSet_lstFeePymAm= value;
	}
	/**
	 * 최종수수료납부금액
	 * BigDecimal - Double value setter
	 *
	 * @Param lstFeePymAm 최종수수료납부금액
	 */
	public void setLstFeePymAm(double lstFeePymAm) {
		setLstFeePymAm(BigDecimal.valueOf(lstFeePymAm));
	}
	/**
	 * 최종수수료납부금액
	 * BigDecimal - Long value setter
	 *
	 * @Param lstFeePymAm 최종수수료납부금액
	 */
	public void setLstFeePymAm(long lstFeePymAm) {
		setLstFeePymAm(BigDecimal.valueOf(lstFeePymAm));
	}
	/**
	 * 최종수수료납부금액
	 * BigDecimal - String value setter
	 *
	 * @Param lstFeePymAm 최종수수료납부금액
	 */
	public void setLstFeePymAm(String lstFeePymAm) {
		setLstFeePymAm(new BigDecimal(lstFeePymAm));
	}
	/**
	 * 최종수수료납부금액
	 */
	@XmlTransient
	public BigDecimal getLstFeePymAm(){
		return this.lstFeePymAm;
	}
	
	/**
	 * 최종수수료납부금액
	 * 
	 * @param lstFeePymAm 최종수수료납부금액
	 */
	@JsonSetter("lstFeePymAm")
	public void setLstFeePymAm(BigDecimal lstFeePymAm){
		this.lstFeePymAm= lstFeePymAm;
		this.setIsSet_lstFeePymAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_byImpnScdCnt= false;
	protected final boolean isSet_byImpnScdCnt(){
		return this.isSet_byImpnScdCnt;
	}
	private void setIsSet_byImpnScdCnt(boolean value){
		this.isSet_byImpnScdCnt= value;
	}
	/**
	 * 건별부과예정건수
	 */
	@XmlTransient
	public Integer getByImpnScdCnt(){
		return this.byImpnScdCnt;
	}
	
	/**
	 * 건별부과예정건수
	 * 
	 * @param byImpnScdCnt 건별부과예정건수
	 */
	public void setByImpnScdCnt(Integer byImpnScdCnt){
		this.byImpnScdCnt= byImpnScdCnt;
		this.setIsSet_byImpnScdCnt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_byImpnScdAm= false;
	protected final boolean isSet_byImpnScdAm(){
		return this.isSet_byImpnScdAm;
	}
	private void setIsSet_byImpnScdAm(boolean value){
		this.isSet_byImpnScdAm= value;
	}
	/**
	 * 건별부과예정금액
	 * BigDecimal - Double value setter
	 *
	 * @Param byImpnScdAm 건별부과예정금액
	 */
	public void setByImpnScdAm(double byImpnScdAm) {
		setByImpnScdAm(BigDecimal.valueOf(byImpnScdAm));
	}
	/**
	 * 건별부과예정금액
	 * BigDecimal - Long value setter
	 *
	 * @Param byImpnScdAm 건별부과예정금액
	 */
	public void setByImpnScdAm(long byImpnScdAm) {
		setByImpnScdAm(BigDecimal.valueOf(byImpnScdAm));
	}
	/**
	 * 건별부과예정금액
	 * BigDecimal - String value setter
	 *
	 * @Param byImpnScdAm 건별부과예정금액
	 */
	public void setByImpnScdAm(String byImpnScdAm) {
		setByImpnScdAm(new BigDecimal(byImpnScdAm));
	}
	/**
	 * 건별부과예정금액
	 */
	@XmlTransient
	public BigDecimal getByImpnScdAm(){
		return this.byImpnScdAm;
	}
	
	/**
	 * 건별부과예정금액
	 * 
	 * @param byImpnScdAm 건별부과예정금액
	 */
	@JsonSetter("byImpnScdAm")
	public void setByImpnScdAm(BigDecimal byImpnScdAm){
		this.byImpnScdAm= byImpnScdAm;
		this.setIsSet_byImpnScdAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_langDscd= false;
	protected final boolean isSet_langDscd(){
		return this.isSet_langDscd;
	}
	private void setIsSet_langDscd(boolean value){
		this.isSet_langDscd= value;
	}
	/**
	 * 언어구분코드
	 */
	@XmlTransient
	public String getLangDscd(){
		return this.langDscd;
	}
	
	/**
	 * 언어구분코드
	 * 
	 * @param langDscd 언어구분코드
	 */
	public void setLangDscd(String langDscd){
		this.langDscd= langDscd;
		this.setIsSet_langDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_actNm= false;
	protected final boolean isSet_actNm(){
		return this.isSet_actNm;
	}
	private void setIsSet_actNm(boolean value){
		this.isSet_actNm= value;
	}
	/**
	 * 계좌명
	 */
	@XmlTransient
	public String getActNm(){
		return this.actNm;
	}
	
	/**
	 * 계좌명
	 * 
	 * @param actNm 계좌명
	 */
	public void setActNm(String actNm){
		this.actNm= actNm;
		this.setIsSet_actNm(true);
	}
				
	@Override
	public INBSmsRawTrnTxtNtcGrid1_DTO clone(){
		try{
			INBSmsRawTrnTxtNtcGrid1_DTO object= (INBSmsRawTrnTxtNtcGrid1_DTO)super.clone();
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
		
		result= prime * result + ((this.dpsAcno==null)?0:this.dpsAcno.hashCode());
		result= prime * result + ((this.ebnkSrvcStcd==null)?0:this.ebnkSrvcStcd.hashCode());
		result= prime * result + ((this.hpNo1==null)?0:this.hpNo1.hashCode());
		result= prime * result + ((this.rgsCnt==null)?0:this.rgsCnt.hashCode());
		result= prime * result + ((this.balNtrsnYn==null)?0:this.balNtrsnYn.hashCode());
		result= prime * result + ((this.smsTmsLimAm==null)?0:this.smsTmsLimAm.hashCode());
		result= prime * result + ((this.tmsStaTm==null)?0:this.tmsStaTm.hashCode());
		result= prime * result + ((this.tmsEndTm==null)?0:this.tmsEndTm.hashCode());
		result= prime * result + ((this.ntcLimCnt==null)?0:this.ntcLimCnt.hashCode());
		result= prime * result + ((this.smsLstNtcDt==null)?0:this.smsLstNtcDt.hashCode());
		result= prime * result + ((this.lstNtcCnt==null)?0:this.lstNtcCnt.hashCode());
		result= prime * result + ((this.fstlNwolAcno==null)?0:this.fstlNwolAcno.hashCode());
		result= prime * result + ((this.smsFeeWdrDd==null)?0:this.smsFeeWdrDd.hashCode());
		result= prime * result + ((this.feeLevyDt==null)?0:this.feeLevyDt.hashCode());
		result= prime * result + ((this.efFeeAplCd==null)?0:this.efFeeAplCd.hashCode());
		result= prime * result + ((this.fxmpXprDt==null)?0:this.fxmpXprDt.hashCode());
		result= prime * result + ((this.smsCtrDt==null)?0:this.smsCtrDt.hashCode());
		result= prime * result + ((this.fstCtrDt==null)?0:this.fstCtrDt.hashCode());
		result= prime * result + ((this.mdKdcd==null)?0:this.mdKdcd.hashCode());
		result= prime * result + ((this.smsRqSrno==null)?0:this.smsRqSrno.hashCode());
		result= prime * result + ((this.advpeEno==null)?0:this.advpeEno.hashCode());
		result= prime * result + ((this.smsCancDt==null)?0:this.smsCancDt.hashCode());
		result= prime * result + ((this.feeDfpmLevyYn==null)?0:this.feeDfpmLevyYn.hashCode());
		result= prime * result + ((this.atsSndLimYn==null)?0:this.atsSndLimYn.hashCode());
		result= prime * result + ((this.cusInfNlkgYn==null)?0:this.cusInfNlkgYn.hashCode());
		result= prime * result + ((this.feeWdrGdncNoreYn==null)?0:this.feeWdrGdncNoreYn.hashCode());
		result= prime * result + ((this.lstFeeWdrDd==null)?0:this.lstFeeWdrDd.hashCode());
		result= prime * result + ((this.lstFeePymCnt==null)?0:this.lstFeePymCnt.hashCode());
		result= prime * result + ((this.lstFeePymAm==null)?0:this.lstFeePymAm.hashCode());
		result= prime * result + ((this.byImpnScdCnt==null)?0:this.byImpnScdCnt.hashCode());
		result= prime * result + ((this.byImpnScdAm==null)?0:this.byImpnScdAm.hashCode());
		result= prime * result + ((this.langDscd==null)?0:this.langDscd.hashCode());
		result= prime * result + ((this.actNm==null)?0:this.actNm.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final INBSmsRawTrnTxtNtcGrid1_DTO other= (INBSmsRawTrnTxtNtcGrid1_DTO)obj;
		{
			Object _dpsAcno= getDpsAcno();
			Object __dpsAcno= other.getDpsAcno();
			if ( _dpsAcno== null ) { if ( __dpsAcno!= null ) return false; }
			else if ( !_dpsAcno.equals(__dpsAcno) ) return false;
		}
		{
			Object _ebnkSrvcStcd= getEbnkSrvcStcd();
			Object __ebnkSrvcStcd= other.getEbnkSrvcStcd();
			if ( _ebnkSrvcStcd== null ) { if ( __ebnkSrvcStcd!= null ) return false; }
			else if ( !_ebnkSrvcStcd.equals(__ebnkSrvcStcd) ) return false;
		}
		{
			Object _hpNo1= getHpNo1();
			Object __hpNo1= other.getHpNo1();
			if ( _hpNo1== null ) { if ( __hpNo1!= null ) return false; }
			else if ( !_hpNo1.equals(__hpNo1) ) return false;
		}
		{
			Object _rgsCnt= getRgsCnt();
			Object __rgsCnt= other.getRgsCnt();
			if ( _rgsCnt== null ) { if ( __rgsCnt!= null ) return false; }
			else if ( !_rgsCnt.equals(__rgsCnt) ) return false;
		}
		{
			Object _balNtrsnYn= getBalNtrsnYn();
			Object __balNtrsnYn= other.getBalNtrsnYn();
			if ( _balNtrsnYn== null ) { if ( __balNtrsnYn!= null ) return false; }
			else if ( !_balNtrsnYn.equals(__balNtrsnYn) ) return false;
		}
		{
			Object _smsTmsLimAm= getSmsTmsLimAm();
			Object __smsTmsLimAm= other.getSmsTmsLimAm();
			if ( _smsTmsLimAm== null ) { if ( __smsTmsLimAm!= null ) return false; }
			else if ( !_smsTmsLimAm.equals(__smsTmsLimAm) ) return false;
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
			Object _ntcLimCnt= getNtcLimCnt();
			Object __ntcLimCnt= other.getNtcLimCnt();
			if ( _ntcLimCnt== null ) { if ( __ntcLimCnt!= null ) return false; }
			else if ( !_ntcLimCnt.equals(__ntcLimCnt) ) return false;
		}
		{
			Object _smsLstNtcDt= getSmsLstNtcDt();
			Object __smsLstNtcDt= other.getSmsLstNtcDt();
			if ( _smsLstNtcDt== null ) { if ( __smsLstNtcDt!= null ) return false; }
			else if ( !_smsLstNtcDt.equals(__smsLstNtcDt) ) return false;
		}
		{
			Object _lstNtcCnt= getLstNtcCnt();
			Object __lstNtcCnt= other.getLstNtcCnt();
			if ( _lstNtcCnt== null ) { if ( __lstNtcCnt!= null ) return false; }
			else if ( !_lstNtcCnt.equals(__lstNtcCnt) ) return false;
		}
		{
			Object _fstlNwolAcno= getFstlNwolAcno();
			Object __fstlNwolAcno= other.getFstlNwolAcno();
			if ( _fstlNwolAcno== null ) { if ( __fstlNwolAcno!= null ) return false; }
			else if ( !_fstlNwolAcno.equals(__fstlNwolAcno) ) return false;
		}
		{
			Object _smsFeeWdrDd= getSmsFeeWdrDd();
			Object __smsFeeWdrDd= other.getSmsFeeWdrDd();
			if ( _smsFeeWdrDd== null ) { if ( __smsFeeWdrDd!= null ) return false; }
			else if ( !_smsFeeWdrDd.equals(__smsFeeWdrDd) ) return false;
		}
		{
			Object _feeLevyDt= getFeeLevyDt();
			Object __feeLevyDt= other.getFeeLevyDt();
			if ( _feeLevyDt== null ) { if ( __feeLevyDt!= null ) return false; }
			else if ( !_feeLevyDt.equals(__feeLevyDt) ) return false;
		}
		{
			Object _efFeeAplCd= getEfFeeAplCd();
			Object __efFeeAplCd= other.getEfFeeAplCd();
			if ( _efFeeAplCd== null ) { if ( __efFeeAplCd!= null ) return false; }
			else if ( !_efFeeAplCd.equals(__efFeeAplCd) ) return false;
		}
		{
			Object _fxmpXprDt= getFxmpXprDt();
			Object __fxmpXprDt= other.getFxmpXprDt();
			if ( _fxmpXprDt== null ) { if ( __fxmpXprDt!= null ) return false; }
			else if ( !_fxmpXprDt.equals(__fxmpXprDt) ) return false;
		}
		{
			Object _smsCtrDt= getSmsCtrDt();
			Object __smsCtrDt= other.getSmsCtrDt();
			if ( _smsCtrDt== null ) { if ( __smsCtrDt!= null ) return false; }
			else if ( !_smsCtrDt.equals(__smsCtrDt) ) return false;
		}
		{
			Object _fstCtrDt= getFstCtrDt();
			Object __fstCtrDt= other.getFstCtrDt();
			if ( _fstCtrDt== null ) { if ( __fstCtrDt!= null ) return false; }
			else if ( !_fstCtrDt.equals(__fstCtrDt) ) return false;
		}
		{
			Object _mdKdcd= getMdKdcd();
			Object __mdKdcd= other.getMdKdcd();
			if ( _mdKdcd== null ) { if ( __mdKdcd!= null ) return false; }
			else if ( !_mdKdcd.equals(__mdKdcd) ) return false;
		}
		{
			Object _smsRqSrno= getSmsRqSrno();
			Object __smsRqSrno= other.getSmsRqSrno();
			if ( _smsRqSrno== null ) { if ( __smsRqSrno!= null ) return false; }
			else if ( !_smsRqSrno.equals(__smsRqSrno) ) return false;
		}
		{
			Object _advpeEno= getAdvpeEno();
			Object __advpeEno= other.getAdvpeEno();
			if ( _advpeEno== null ) { if ( __advpeEno!= null ) return false; }
			else if ( !_advpeEno.equals(__advpeEno) ) return false;
		}
		{
			Object _smsCancDt= getSmsCancDt();
			Object __smsCancDt= other.getSmsCancDt();
			if ( _smsCancDt== null ) { if ( __smsCancDt!= null ) return false; }
			else if ( !_smsCancDt.equals(__smsCancDt) ) return false;
		}
		{
			Object _feeDfpmLevyYn= getFeeDfpmLevyYn();
			Object __feeDfpmLevyYn= other.getFeeDfpmLevyYn();
			if ( _feeDfpmLevyYn== null ) { if ( __feeDfpmLevyYn!= null ) return false; }
			else if ( !_feeDfpmLevyYn.equals(__feeDfpmLevyYn) ) return false;
		}
		{
			Object _atsSndLimYn= getAtsSndLimYn();
			Object __atsSndLimYn= other.getAtsSndLimYn();
			if ( _atsSndLimYn== null ) { if ( __atsSndLimYn!= null ) return false; }
			else if ( !_atsSndLimYn.equals(__atsSndLimYn) ) return false;
		}
		{
			Object _cusInfNlkgYn= getCusInfNlkgYn();
			Object __cusInfNlkgYn= other.getCusInfNlkgYn();
			if ( _cusInfNlkgYn== null ) { if ( __cusInfNlkgYn!= null ) return false; }
			else if ( !_cusInfNlkgYn.equals(__cusInfNlkgYn) ) return false;
		}
		{
			Object _feeWdrGdncNoreYn= getFeeWdrGdncNoreYn();
			Object __feeWdrGdncNoreYn= other.getFeeWdrGdncNoreYn();
			if ( _feeWdrGdncNoreYn== null ) { if ( __feeWdrGdncNoreYn!= null ) return false; }
			else if ( !_feeWdrGdncNoreYn.equals(__feeWdrGdncNoreYn) ) return false;
		}
		{
			Object _lstFeeWdrDd= getLstFeeWdrDd();
			Object __lstFeeWdrDd= other.getLstFeeWdrDd();
			if ( _lstFeeWdrDd== null ) { if ( __lstFeeWdrDd!= null ) return false; }
			else if ( !_lstFeeWdrDd.equals(__lstFeeWdrDd) ) return false;
		}
		{
			Object _lstFeePymCnt= getLstFeePymCnt();
			Object __lstFeePymCnt= other.getLstFeePymCnt();
			if ( _lstFeePymCnt== null ) { if ( __lstFeePymCnt!= null ) return false; }
			else if ( !_lstFeePymCnt.equals(__lstFeePymCnt) ) return false;
		}
		{
			Object _lstFeePymAm= getLstFeePymAm();
			Object __lstFeePymAm= other.getLstFeePymAm();
			if ( _lstFeePymAm== null ) { if ( __lstFeePymAm!= null ) return false; }
			else if ( !_lstFeePymAm.equals(__lstFeePymAm) ) return false;
		}
		{
			Object _byImpnScdCnt= getByImpnScdCnt();
			Object __byImpnScdCnt= other.getByImpnScdCnt();
			if ( _byImpnScdCnt== null ) { if ( __byImpnScdCnt!= null ) return false; }
			else if ( !_byImpnScdCnt.equals(__byImpnScdCnt) ) return false;
		}
		{
			Object _byImpnScdAm= getByImpnScdAm();
			Object __byImpnScdAm= other.getByImpnScdAm();
			if ( _byImpnScdAm== null ) { if ( __byImpnScdAm!= null ) return false; }
			else if ( !_byImpnScdAm.equals(__byImpnScdAm) ) return false;
		}
		{
			Object _langDscd= getLangDscd();
			Object __langDscd= other.getLangDscd();
			if ( _langDscd== null ) { if ( __langDscd!= null ) return false; }
			else if ( !_langDscd.equals(__langDscd) ) return false;
		}
		{
			Object _actNm= getActNm();
			Object __actNm= other.getActNm();
			if ( _actNm== null ) { if ( __actNm!= null ) return false; }
			else if ( !_actNm.equals(__actNm) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(INBSmsRawTrnTxtNtcGrid1_DTO.class.getName()).append(":\n");
		sb.append("\tdpsAcno: ");
		sb.append(dpsAcno==null?"null":getDpsAcno());
		sb.append("\n");
		sb.append("\tebnkSrvcStcd: ");
		sb.append(ebnkSrvcStcd==null?"null":getEbnkSrvcStcd());
		sb.append("\n");
		sb.append("\thpNo1: ");
		sb.append(hpNo1==null?"null":getHpNo1());
		sb.append("\n");
		sb.append("\trgsCnt: ");
		sb.append(rgsCnt==null?"null":getRgsCnt());
		sb.append("\n");
		sb.append("\tbalNtrsnYn: ");
		sb.append(balNtrsnYn==null?"null":getBalNtrsnYn());
		sb.append("\n");
		sb.append("\tsmsTmsLimAm: ");
		sb.append(smsTmsLimAm==null?"null":getSmsTmsLimAm());
		sb.append("\n");
		sb.append("\ttmsStaTm: ");
		sb.append(tmsStaTm==null?"null":getTmsStaTm());
		sb.append("\n");
		sb.append("\ttmsEndTm: ");
		sb.append(tmsEndTm==null?"null":getTmsEndTm());
		sb.append("\n");
		sb.append("\tntcLimCnt: ");
		sb.append(ntcLimCnt==null?"null":getNtcLimCnt());
		sb.append("\n");
		sb.append("\tsmsLstNtcDt: ");
		sb.append(smsLstNtcDt==null?"null":getSmsLstNtcDt());
		sb.append("\n");
		sb.append("\tlstNtcCnt: ");
		sb.append(lstNtcCnt==null?"null":getLstNtcCnt());
		sb.append("\n");
		sb.append("\tfstlNwolAcno: ");
		sb.append(fstlNwolAcno==null?"null":getFstlNwolAcno());
		sb.append("\n");
		sb.append("\tsmsFeeWdrDd: ");
		sb.append(smsFeeWdrDd==null?"null":getSmsFeeWdrDd());
		sb.append("\n");
		sb.append("\tfeeLevyDt: ");
		sb.append(feeLevyDt==null?"null":getFeeLevyDt());
		sb.append("\n");
		sb.append("\tefFeeAplCd: ");
		sb.append(efFeeAplCd==null?"null":getEfFeeAplCd());
		sb.append("\n");
		sb.append("\tfxmpXprDt: ");
		sb.append(fxmpXprDt==null?"null":getFxmpXprDt());
		sb.append("\n");
		sb.append("\tsmsCtrDt: ");
		sb.append(smsCtrDt==null?"null":getSmsCtrDt());
		sb.append("\n");
		sb.append("\tfstCtrDt: ");
		sb.append(fstCtrDt==null?"null":getFstCtrDt());
		sb.append("\n");
		sb.append("\tmdKdcd: ");
		sb.append(mdKdcd==null?"null":getMdKdcd());
		sb.append("\n");
		sb.append("\tsmsRqSrno: ");
		sb.append(smsRqSrno==null?"null":getSmsRqSrno());
		sb.append("\n");
		sb.append("\tadvpeEno: ");
		sb.append(advpeEno==null?"null":getAdvpeEno());
		sb.append("\n");
		sb.append("\tsmsCancDt: ");
		sb.append(smsCancDt==null?"null":getSmsCancDt());
		sb.append("\n");
		sb.append("\tfeeDfpmLevyYn: ");
		sb.append(feeDfpmLevyYn==null?"null":getFeeDfpmLevyYn());
		sb.append("\n");
		sb.append("\tatsSndLimYn: ");
		sb.append(atsSndLimYn==null?"null":getAtsSndLimYn());
		sb.append("\n");
		sb.append("\tcusInfNlkgYn: ");
		sb.append(cusInfNlkgYn==null?"null":getCusInfNlkgYn());
		sb.append("\n");
		sb.append("\tfeeWdrGdncNoreYn: ");
		sb.append(feeWdrGdncNoreYn==null?"null":getFeeWdrGdncNoreYn());
		sb.append("\n");
		sb.append("\tlstFeeWdrDd: ");
		sb.append(lstFeeWdrDd==null?"null":getLstFeeWdrDd());
		sb.append("\n");
		sb.append("\tlstFeePymCnt: ");
		sb.append(lstFeePymCnt==null?"null":getLstFeePymCnt());
		sb.append("\n");
		sb.append("\tlstFeePymAm: ");
		sb.append(lstFeePymAm==null?"null":getLstFeePymAm());
		sb.append("\n");
		sb.append("\tbyImpnScdCnt: ");
		sb.append(byImpnScdCnt==null?"null":getByImpnScdCnt());
		sb.append("\n");
		sb.append("\tbyImpnScdAm: ");
		sb.append(byImpnScdAm==null?"null":getByImpnScdAm());
		sb.append("\n");
		sb.append("\tlangDscd: ");
		sb.append(langDscd==null?"null":getLangDscd());
		sb.append("\n");
		sb.append("\tactNm: ");
		sb.append(actNm==null?"null":getActNm());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 20; /* dpsAcno */
		messageLen+= 2; /* ebnkSrvcStcd */
		messageLen+= 14; /* hpNo1 */
		messageLen+= 5; /* rgsCnt */
		messageLen+= 1; /* balNtrsnYn */
		messageLen+= 18; /* smsTmsLimAm */
		messageLen+= 2; /* tmsStaTm */
		messageLen+= 2; /* tmsEndTm */
		messageLen+= 6; /* ntcLimCnt */
		messageLen+= 8; /* smsLstNtcDt */
		messageLen+= 6; /* lstNtcCnt */
		messageLen+= 15; /* fstlNwolAcno */
		messageLen+= 2; /* smsFeeWdrDd */
		messageLen+= 8; /* feeLevyDt */
		messageLen+= 1; /* efFeeAplCd */
		messageLen+= 8; /* fxmpXprDt */
		messageLen+= 8; /* smsCtrDt */
		messageLen+= 8; /* fstCtrDt */
		messageLen+= 8; /* mdKdcd */
		messageLen+= 20; /* smsRqSrno */
		messageLen+= 8; /* advpeEno */
		messageLen+= 8; /* smsCancDt */
		messageLen+= 1; /* feeDfpmLevyYn */
		messageLen+= 1; /* atsSndLimYn */
		messageLen+= 1; /* cusInfNlkgYn */
		messageLen+= 1; /* feeWdrGdncNoreYn */
		messageLen+= 8; /* lstFeeWdrDd */
		messageLen+= 7; /* lstFeePymCnt */
		messageLen+= 18; /* lstFeePymAm */
		messageLen+= 5; /* byImpnScdCnt */
		messageLen+= 18; /* byImpnScdAm */
		messageLen+= 2; /* langDscd */
		messageLen+= 100; /* actNm */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("dpsAcno");
		list.add("ebnkSrvcStcd");
		list.add("hpNo1");
		list.add("rgsCnt");
		list.add("balNtrsnYn");
		list.add("smsTmsLimAm");
		list.add("tmsStaTm");
		list.add("tmsEndTm");
		list.add("ntcLimCnt");
		list.add("smsLstNtcDt");
		list.add("lstNtcCnt");
		list.add("fstlNwolAcno");
		list.add("smsFeeWdrDd");
		list.add("feeLevyDt");
		list.add("efFeeAplCd");
		list.add("fxmpXprDt");
		list.add("smsCtrDt");
		list.add("fstCtrDt");
		list.add("mdKdcd");
		list.add("smsRqSrno");
		list.add("advpeEno");
		list.add("smsCancDt");
		list.add("feeDfpmLevyYn");
		list.add("atsSndLimYn");
		list.add("cusInfNlkgYn");
		list.add("feeWdrGdncNoreYn");
		list.add("lstFeeWdrDd");
		list.add("lstFeePymCnt");
		list.add("lstFeePymAm");
		list.add("byImpnScdCnt");
		list.add("byImpnScdAm");
		list.add("langDscd");
		list.add("actNm");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("dpsAcno", get("dpsAcno"));
		map.put("ebnkSrvcStcd", get("ebnkSrvcStcd"));
		map.put("hpNo1", get("hpNo1"));
		map.put("rgsCnt", get("rgsCnt"));
		map.put("balNtrsnYn", get("balNtrsnYn"));
		map.put("smsTmsLimAm", get("smsTmsLimAm"));
		map.put("tmsStaTm", get("tmsStaTm"));
		map.put("tmsEndTm", get("tmsEndTm"));
		map.put("ntcLimCnt", get("ntcLimCnt"));
		map.put("smsLstNtcDt", get("smsLstNtcDt"));
		map.put("lstNtcCnt", get("lstNtcCnt"));
		map.put("fstlNwolAcno", get("fstlNwolAcno"));
		map.put("smsFeeWdrDd", get("smsFeeWdrDd"));
		map.put("feeLevyDt", get("feeLevyDt"));
		map.put("efFeeAplCd", get("efFeeAplCd"));
		map.put("fxmpXprDt", get("fxmpXprDt"));
		map.put("smsCtrDt", get("smsCtrDt"));
		map.put("fstCtrDt", get("fstCtrDt"));
		map.put("mdKdcd", get("mdKdcd"));
		map.put("smsRqSrno", get("smsRqSrno"));
		map.put("advpeEno", get("advpeEno"));
		map.put("smsCancDt", get("smsCancDt"));
		map.put("feeDfpmLevyYn", get("feeDfpmLevyYn"));
		map.put("atsSndLimYn", get("atsSndLimYn"));
		map.put("cusInfNlkgYn", get("cusInfNlkgYn"));
		map.put("feeWdrGdncNoreYn", get("feeWdrGdncNoreYn"));
		map.put("lstFeeWdrDd", get("lstFeeWdrDd"));
		map.put("lstFeePymCnt", get("lstFeePymCnt"));
		map.put("lstFeePymAm", get("lstFeePymAm"));
		map.put("byImpnScdCnt", get("byImpnScdCnt"));
		map.put("byImpnScdAm", get("byImpnScdAm"));
		map.put("langDscd", get("langDscd"));
		map.put("actNm", get("actNm"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 1870759786:/* dpsAcno */
			return getDpsAcno();
		case 71960360:/* ebnkSrvcStcd */
			return getEbnkSrvcStcd();
		case 99461224:/* hpNo1 */
			return getHpNo1();
		case -932627541:/* rgsCnt */
			return getRgsCnt();
		case 1872684911:/* balNtrsnYn */
			return getBalNtrsnYn();
		case -448336293:/* smsTmsLimAm */
			return getSmsTmsLimAm();
		case 1628745663:/* tmsStaTm */
			return getTmsStaTm();
		case 1615640506:/* tmsEndTm */
			return getTmsEndTm();
		case -1004307850:/* ntcLimCnt */
			return getNtcLimCnt();
		case -445067911:/* smsLstNtcDt */
			return getSmsLstNtcDt();
		case -1157396743:/* lstNtcCnt */
			return getLstNtcCnt();
		case 851862286:/* fstlNwolAcno */
			return getFstlNwolAcno();
		case 2021234488:/* smsFeeWdrDd */
			return getSmsFeeWdrDd();
		case 1969706706:/* feeLevyDt */
			return getFeeLevyDt();
		case 1791457081:/* efFeeAplCd */
			return getEfFeeAplCd();
		case 251917749:/* fxmpXprDt */
			return getFxmpXprDt();
		case -128825160:/* smsCtrDt */
			return getSmsCtrDt();
		case -251839094:/* fstCtrDt */
			return getFstCtrDt();
		case -1079704143:/* mdKdcd */
			return getMdKdcd();
		case 727174648:/* smsRqSrno */
			return getSmsRqSrno();
		case -705281570:/* advpeEno */
			return getAdvpeEno();
		case 283749692:/* smsCancDt */
			return getSmsCancDt();
		case 1179486518:/* feeDfpmLevyYn */
			return getFeeDfpmLevyYn();
		case -828320612:/* atsSndLimYn */
			return getAtsSndLimYn();
		case 1282743887:/* cusInfNlkgYn */
			return getCusInfNlkgYn();
		case 474136346:/* feeWdrGdncNoreYn */
			return getFeeWdrGdncNoreYn();
		case -1271543380:/* lstFeeWdrDd */
			return getLstFeeWdrDd();
		case -944298722:/* lstFeePymCnt */
			return getLstFeePymCnt();
		case -1277387305:/* lstFeePymAm */
			return getLstFeePymAm();
		case -589088466:/* byImpnScdCnt */
			return getByImpnScdCnt();
		case -573192249:/* byImpnScdAm */
			return getByImpnScdAm();
		case -1615032258:/* langDscd */
			return getLangDscd();
		case 92644849:/* actNm */
			return getActNm();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 1870759786:/* dpsAcno */
			setDpsAcno((String)value);
			break;
		case 71960360:/* ebnkSrvcStcd */
			setEbnkSrvcStcd((String)value);
			break;
		case 99461224:/* hpNo1 */
			setHpNo1((String)value);
			break;
		case -932627541:/* rgsCnt */
			setRgsCnt((Integer)value);
			break;
		case 1872684911:/* balNtrsnYn */
			setBalNtrsnYn((String)value);
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
		case 1628745663:/* tmsStaTm */
			setTmsStaTm((String)value);
			break;
		case 1615640506:/* tmsEndTm */
			setTmsEndTm((String)value);
			break;
		case -1004307850:/* ntcLimCnt */
			setNtcLimCnt((Integer)value);
			break;
		case -445067911:/* smsLstNtcDt */
			setSmsLstNtcDt((String)value);
			break;
		case -1157396743:/* lstNtcCnt */
			setLstNtcCnt((Integer)value);
			break;
		case 851862286:/* fstlNwolAcno */
			setFstlNwolAcno((String)value);
			break;
		case 2021234488:/* smsFeeWdrDd */
			setSmsFeeWdrDd((String)value);
			break;
		case 1969706706:/* feeLevyDt */
			setFeeLevyDt((String)value);
			break;
		case 1791457081:/* efFeeAplCd */
			setEfFeeAplCd((String)value);
			break;
		case 251917749:/* fxmpXprDt */
			setFxmpXprDt((String)value);
			break;
		case -128825160:/* smsCtrDt */
			setSmsCtrDt((String)value);
			break;
		case -251839094:/* fstCtrDt */
			setFstCtrDt((String)value);
			break;
		case -1079704143:/* mdKdcd */
			setMdKdcd((String)value);
			break;
		case 727174648:/* smsRqSrno */
			setSmsRqSrno((String)value);
			break;
		case -705281570:/* advpeEno */
			setAdvpeEno((String)value);
			break;
		case 283749692:/* smsCancDt */
			setSmsCancDt((String)value);
			break;
		case 1179486518:/* feeDfpmLevyYn */
			setFeeDfpmLevyYn((String)value);
			break;
		case -828320612:/* atsSndLimYn */
			setAtsSndLimYn((String)value);
			break;
		case 1282743887:/* cusInfNlkgYn */
			setCusInfNlkgYn((String)value);
			break;
		case 474136346:/* feeWdrGdncNoreYn */
			setFeeWdrGdncNoreYn((String)value);
			break;
		case -1271543380:/* lstFeeWdrDd */
			setLstFeeWdrDd((String)value);
			break;
		case -944298722:/* lstFeePymCnt */
			setLstFeePymCnt((Integer)value);
			break;
		case -1277387305:/* lstFeePymAm */
			if ( value instanceof String ){
				setLstFeePymAm((String)value);
			}
			else if ( value instanceof Double ){
				setLstFeePymAm((Double)value);
			}
			else if ( value instanceof Long ){
				setLstFeePymAm((Long)value);
			}
			else{
				setLstFeePymAm((BigDecimal)value);
			}
			break;
		case -589088466:/* byImpnScdCnt */
			setByImpnScdCnt((Integer)value);
			break;
		case -573192249:/* byImpnScdAm */
			if ( value instanceof String ){
				setByImpnScdAm((String)value);
			}
			else if ( value instanceof Double ){
				setByImpnScdAm((Double)value);
			}
			else if ( value instanceof Long ){
				setByImpnScdAm((Long)value);
			}
			else{
				setByImpnScdAm((BigDecimal)value);
			}
			break;
		case -1615032258:/* langDscd */
			setLangDscd((String)value);
			break;
		case 92644849:/* actNm */
			setActNm((String)value);
			break;
		default:
			break;
		}
	}
	
}
