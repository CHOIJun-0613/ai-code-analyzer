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
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import option.WooriOmmOption;

/**
 * 
 */
@WooriOmmOption(dataMasking=true)
@XmlType(propOrder={
	"rgsRvkDscd", "metMngNo", "ebnkUtzpeNo", "metCtrStcd", "metPbokDscd", "metNm", "rcvBkwAcno", "rlfAcno", "mbpfPymDt", "mbpfPymCycd", "mbpfPmtgtAm", "agmdCollDt", "advpeEno", "asmnlApvCd", "rppeChgRgsYn"
	, "rppeChgRgsDt", "rppeChgVldYn", "metDscd", "metRgsDt", "rgsTm", "cusUsgBkwAcno", "metpbokrprschgreqgridDodt"
}, name="MetPbokRprsChgReq_DODT")
@XmlRootElement(name="MetPbokRprsChgReq_DODT")
@BxmCategory(logicalName="모임통장.대표.변경.요청.DBM.출력.IO", description="") 
public class MetPbokRprsChgReq_DODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -1586992925L;
	
	
	
	/**
	 * 등록해제구분코드
	 */
	@ApiModelProperty(
		name = "rgsRvkDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rgsRvkDscd")
	@BxmOmm_Field(length=1, decimal=0, description="등록해제구분코드", align="left", fill="")
	private String rgsRvkDscd= "";
	
	
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
	 * 모임계약상태코드
	 */
	@ApiModelProperty(
		name = "metCtrStcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metCtrStcd")
	@BxmOmm_Field(length=2, decimal=0, description="모임계약상태코드", align="left", fill="")
	private String metCtrStcd= "";
	
	
	/**
	 * 모임통장구분코드
	 */
	@ApiModelProperty(
		name = "metPbokDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metPbokDscd")
	@BxmOmm_Field(length=1, decimal=0, description="모임통장구분코드", align="left", fill="")
	private String metPbokDscd= "";
	
	
	/**
	 * 모임명
	 */
	@ApiModelProperty(
		name = "metNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metNm")
	@BxmOmm_Field(length=100, decimal=0, description="모임명", align="left", fill="")
	private String metNm= "";
	
	
	/**
	 * 입금전행계좌번호
	 */
	@ApiModelProperty(
		name = "rcvBkwAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rcvBkwAcno")
	@BxmOmm_Field(length=20, decimal=0, description="입금전행계좌번호", align="left", fill="", formatType="masking", format="M141")
	private String rcvBkwAcno= "";
	
	
	/**
	 * 안심계좌번호
	 */
	@ApiModelProperty(
		name = "rlfAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rlfAcno")
	@BxmOmm_Field(length=20, decimal=0, description="안심계좌번호", align="left", fill="", formatType="masking", format="M141")
	private String rlfAcno= "";
	
	
	/**
	 * 회비납부일자
	 */
	@ApiModelProperty(
		name = "mbpfPymDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("mbpfPymDt")
	@BxmOmm_Field(length=8, decimal=0, description="회비납부일자", align="left", fill="")
	private String mbpfPymDt= "";
	
	
	/**
	 * 회비납부주기코드
	 */
	@ApiModelProperty(
		name = "mbpfPymCycd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("mbpfPymCycd")
	@BxmOmm_Field(length=2, decimal=0, description="회비납부주기코드", align="left", fill="")
	private String mbpfPymCycd= "";
	
	
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
	 * 공동명의승인코드
	 */
	@ApiModelProperty(
		name = "asmnlApvCd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("asmnlApvCd")
	@BxmOmm_Field(length=1, decimal=0, description="공동명의승인코드", align="left", fill="")
	private String asmnlApvCd= "";
	
	
	/**
	 * 대표자변경등록여부
	 */
	@ApiModelProperty(
		name = "rppeChgRgsYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rppeChgRgsYn")
	@BxmOmm_Field(length=1, decimal=0, description="대표자변경등록여부", align="left", fill="")
	private String rppeChgRgsYn= "";
	
	
	/**
	 * 대표자변경등록일자
	 */
	@ApiModelProperty(
		name = "rppeChgRgsDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rppeChgRgsDt")
	@BxmOmm_Field(length=8, decimal=0, description="대표자변경등록일자", align="left", fill="")
	private String rppeChgRgsDt= "";
	
	
	/**
	 * 대표자변경유효일자
	 */
	@ApiModelProperty(
		name = "rppeChgVldYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rppeChgVldYn")
	@BxmOmm_Field(length=8, decimal=0, description="대표자변경유효일자", align="left", fill="")
	private String rppeChgVldYn= "";
	
	
	/**
	 * 모임구분코드
	 */
	@ApiModelProperty(
		name = "metDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metDscd")
	@BxmOmm_Field(length=2, decimal=0, description="모임구분코드", align="left", fill="")
	private String metDscd= "";
	
	
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
	 * 등록시각
	 */
	@ApiModelProperty(
		name = "rgsTm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rgsTm")
	@BxmOmm_Field(length=8, decimal=0, description="등록시각", align="left", fill="")
	private String rgsTm= "";
	
	
	/**
	 * 고객사용전행계좌번호
	 */
	@ApiModelProperty(
		name = "cusUsgBkwAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("cusUsgBkwAcno")
	@BxmOmm_Field(length=20, decimal=0, description="고객사용전행계좌번호", align="left", fill="", formatType="masking", format="M141")
	private String cusUsgBkwAcno= "";
	
	
	/**
	 * 
	 */
	@ApiModelProperty(
		name = "metpbokrprschgreqgridDodt"
		, dataType = "[Lcom.skbank.sml.fns.mpb.dto.MetPbokRprsChgReqGrid_DODT;"
		)
	@XmlElement(name="item")
	@XmlElementWrapper()
	@JsonProperty("metpbokrprschgreqgridDodt")
	@BxmOmm_Field(length=0, decimal=0, align="left", fill="", arrayReference="1")
	private List<MetPbokRprsChgReqGrid_DODT> metpbokrprschgreqgridDodt= new ArrayList<>();
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rgsRvkDscd= false;
	protected final boolean isSet_rgsRvkDscd(){
		return this.isSet_rgsRvkDscd;
	}
	private void setIsSet_rgsRvkDscd(boolean value){
		this.isSet_rgsRvkDscd= value;
	}
	/**
	 * 등록해제구분코드
	 */
	@XmlTransient
	public String getRgsRvkDscd(){
		return this.rgsRvkDscd;
	}
	
	/**
	 * 등록해제구분코드
	 * 
	 * @param rgsRvkDscd 등록해제구분코드
	 */
	public void setRgsRvkDscd(String rgsRvkDscd){
		this.rgsRvkDscd= rgsRvkDscd;
		this.setIsSet_rgsRvkDscd(true);
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
	private boolean isSet_metCtrStcd= false;
	protected final boolean isSet_metCtrStcd(){
		return this.isSet_metCtrStcd;
	}
	private void setIsSet_metCtrStcd(boolean value){
		this.isSet_metCtrStcd= value;
	}
	/**
	 * 모임계약상태코드
	 */
	@XmlTransient
	public String getMetCtrStcd(){
		return this.metCtrStcd;
	}
	
	/**
	 * 모임계약상태코드
	 * 
	 * @param metCtrStcd 모임계약상태코드
	 */
	public void setMetCtrStcd(String metCtrStcd){
		this.metCtrStcd= metCtrStcd;
		this.setIsSet_metCtrStcd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metPbokDscd= false;
	protected final boolean isSet_metPbokDscd(){
		return this.isSet_metPbokDscd;
	}
	private void setIsSet_metPbokDscd(boolean value){
		this.isSet_metPbokDscd= value;
	}
	/**
	 * 모임통장구분코드
	 */
	@XmlTransient
	public String getMetPbokDscd(){
		return this.metPbokDscd;
	}
	
	/**
	 * 모임통장구분코드
	 * 
	 * @param metPbokDscd 모임통장구분코드
	 */
	public void setMetPbokDscd(String metPbokDscd){
		this.metPbokDscd= metPbokDscd;
		this.setIsSet_metPbokDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metNm= false;
	protected final boolean isSet_metNm(){
		return this.isSet_metNm;
	}
	private void setIsSet_metNm(boolean value){
		this.isSet_metNm= value;
	}
	/**
	 * 모임명
	 */
	@XmlTransient
	public String getMetNm(){
		return this.metNm;
	}
	
	/**
	 * 모임명
	 * 
	 * @param metNm 모임명
	 */
	public void setMetNm(String metNm){
		this.metNm= metNm;
		this.setIsSet_metNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rcvBkwAcno= false;
	protected final boolean isSet_rcvBkwAcno(){
		return this.isSet_rcvBkwAcno;
	}
	private void setIsSet_rcvBkwAcno(boolean value){
		this.isSet_rcvBkwAcno= value;
	}
	/**
	 * 입금전행계좌번호
	 */
	@XmlTransient
	public String getRcvBkwAcno(){
		return this.rcvBkwAcno;
	}
	
	/**
	 * 입금전행계좌번호
	 * 
	 * @param rcvBkwAcno 입금전행계좌번호
	 */
	public void setRcvBkwAcno(String rcvBkwAcno){
		this.rcvBkwAcno= rcvBkwAcno;
		this.setIsSet_rcvBkwAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rlfAcno= false;
	protected final boolean isSet_rlfAcno(){
		return this.isSet_rlfAcno;
	}
	private void setIsSet_rlfAcno(boolean value){
		this.isSet_rlfAcno= value;
	}
	/**
	 * 안심계좌번호
	 */
	@XmlTransient
	public String getRlfAcno(){
		return this.rlfAcno;
	}
	
	/**
	 * 안심계좌번호
	 * 
	 * @param rlfAcno 안심계좌번호
	 */
	public void setRlfAcno(String rlfAcno){
		this.rlfAcno= rlfAcno;
		this.setIsSet_rlfAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mbpfPymDt= false;
	protected final boolean isSet_mbpfPymDt(){
		return this.isSet_mbpfPymDt;
	}
	private void setIsSet_mbpfPymDt(boolean value){
		this.isSet_mbpfPymDt= value;
	}
	/**
	 * 회비납부일자
	 */
	@XmlTransient
	public String getMbpfPymDt(){
		return this.mbpfPymDt;
	}
	
	/**
	 * 회비납부일자
	 * 
	 * @param mbpfPymDt 회비납부일자
	 */
	public void setMbpfPymDt(String mbpfPymDt){
		this.mbpfPymDt= mbpfPymDt;
		this.setIsSet_mbpfPymDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mbpfPymCycd= false;
	protected final boolean isSet_mbpfPymCycd(){
		return this.isSet_mbpfPymCycd;
	}
	private void setIsSet_mbpfPymCycd(boolean value){
		this.isSet_mbpfPymCycd= value;
	}
	/**
	 * 회비납부주기코드
	 */
	@XmlTransient
	public String getMbpfPymCycd(){
		return this.mbpfPymCycd;
	}
	
	/**
	 * 회비납부주기코드
	 * 
	 * @param mbpfPymCycd 회비납부주기코드
	 */
	public void setMbpfPymCycd(String mbpfPymCycd){
		this.mbpfPymCycd= mbpfPymCycd;
		this.setIsSet_mbpfPymCycd(true);
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
	private boolean isSet_asmnlApvCd= false;
	protected final boolean isSet_asmnlApvCd(){
		return this.isSet_asmnlApvCd;
	}
	private void setIsSet_asmnlApvCd(boolean value){
		this.isSet_asmnlApvCd= value;
	}
	/**
	 * 공동명의승인코드
	 */
	@XmlTransient
	public String getAsmnlApvCd(){
		return this.asmnlApvCd;
	}
	
	/**
	 * 공동명의승인코드
	 * 
	 * @param asmnlApvCd 공동명의승인코드
	 */
	public void setAsmnlApvCd(String asmnlApvCd){
		this.asmnlApvCd= asmnlApvCd;
		this.setIsSet_asmnlApvCd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rppeChgRgsYn= false;
	protected final boolean isSet_rppeChgRgsYn(){
		return this.isSet_rppeChgRgsYn;
	}
	private void setIsSet_rppeChgRgsYn(boolean value){
		this.isSet_rppeChgRgsYn= value;
	}
	/**
	 * 대표자변경등록여부
	 */
	@XmlTransient
	public String getRppeChgRgsYn(){
		return this.rppeChgRgsYn;
	}
	
	/**
	 * 대표자변경등록여부
	 * 
	 * @param rppeChgRgsYn 대표자변경등록여부
	 */
	public void setRppeChgRgsYn(String rppeChgRgsYn){
		this.rppeChgRgsYn= rppeChgRgsYn;
		this.setIsSet_rppeChgRgsYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rppeChgRgsDt= false;
	protected final boolean isSet_rppeChgRgsDt(){
		return this.isSet_rppeChgRgsDt;
	}
	private void setIsSet_rppeChgRgsDt(boolean value){
		this.isSet_rppeChgRgsDt= value;
	}
	/**
	 * 대표자변경등록일자
	 */
	@XmlTransient
	public String getRppeChgRgsDt(){
		return this.rppeChgRgsDt;
	}
	
	/**
	 * 대표자변경등록일자
	 * 
	 * @param rppeChgRgsDt 대표자변경등록일자
	 */
	public void setRppeChgRgsDt(String rppeChgRgsDt){
		this.rppeChgRgsDt= rppeChgRgsDt;
		this.setIsSet_rppeChgRgsDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rppeChgVldYn= false;
	protected final boolean isSet_rppeChgVldYn(){
		return this.isSet_rppeChgVldYn;
	}
	private void setIsSet_rppeChgVldYn(boolean value){
		this.isSet_rppeChgVldYn= value;
	}
	/**
	 * 대표자변경유효일자
	 */
	@XmlTransient
	public String getRppeChgVldYn(){
		return this.rppeChgVldYn;
	}
	
	/**
	 * 대표자변경유효일자
	 * 
	 * @param rppeChgVldYn 대표자변경유효일자
	 */
	public void setRppeChgVldYn(String rppeChgVldYn){
		this.rppeChgVldYn= rppeChgVldYn;
		this.setIsSet_rppeChgVldYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metDscd= false;
	protected final boolean isSet_metDscd(){
		return this.isSet_metDscd;
	}
	private void setIsSet_metDscd(boolean value){
		this.isSet_metDscd= value;
	}
	/**
	 * 모임구분코드
	 */
	@XmlTransient
	public String getMetDscd(){
		return this.metDscd;
	}
	
	/**
	 * 모임구분코드
	 * 
	 * @param metDscd 모임구분코드
	 */
	public void setMetDscd(String metDscd){
		this.metDscd= metDscd;
		this.setIsSet_metDscd(true);
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
	private boolean isSet_rgsTm= false;
	protected final boolean isSet_rgsTm(){
		return this.isSet_rgsTm;
	}
	private void setIsSet_rgsTm(boolean value){
		this.isSet_rgsTm= value;
	}
	/**
	 * 등록시각
	 */
	@XmlTransient
	public String getRgsTm(){
		return this.rgsTm;
	}
	
	/**
	 * 등록시각
	 * 
	 * @param rgsTm 등록시각
	 */
	public void setRgsTm(String rgsTm){
		this.rgsTm= rgsTm;
		this.setIsSet_rgsTm(true);
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
	private boolean isSet_metpbokrprschgreqgridDodt= false;
	protected final boolean isSet_metpbokrprschgreqgridDodt(){
		return this.isSet_metpbokrprschgreqgridDodt;
	}
	private void setIsSet_metpbokrprschgreqgridDodt(boolean value){
		this.isSet_metpbokrprschgreqgridDodt= value;
	}
	/**
	 * 
	 */
	@XmlTransient
	public List<MetPbokRprsChgReqGrid_DODT> getMetpbokrprschgreqgridDodt(){
		return metpbokrprschgreqgridDodt;
	}
	
	/**
	 * 
	 * 
	 * @param metpbokrprschgreqgridDodt 
	 */
	@JsonSetter("metpbokrprschgreqgridDodt")
	public void setMetpbokrprschgreqgridDodt(List<MetPbokRprsChgReqGrid_DODT> metpbokrprschgreqgridDodt){
		this.metpbokrprschgreqgridDodt= metpbokrprschgreqgridDodt;
		this.setIsSet_metpbokrprschgreqgridDodt(true);
	}
	
	public void setMetpbokrprschgreqgridDodt(MetPbokRprsChgReqGrid_DODT... items){
		List<MetPbokRprsChgReqGrid_DODT> _items= new ArrayList<>();
		if ( items!= null && items.length> 0){
			for( MetPbokRprsChgReqGrid_DODT item: items ){
				_items.add(item);
			}
		}
		this.setMetpbokrprschgreqgridDodt(_items);
	}
				
	@Override
	public MetPbokRprsChgReq_DODT clone(){
		try{
			MetPbokRprsChgReq_DODT object= (MetPbokRprsChgReq_DODT)super.clone();
			if ( this.metpbokrprschgreqgridDodt== null ) object.metpbokrprschgreqgridDodt= null;
			else{
				List<MetPbokRprsChgReqGrid_DODT> clonedList= new ArrayList<>(this.metpbokrprschgreqgridDodt.size());
				for( MetPbokRprsChgReqGrid_DODT item : metpbokrprschgreqgridDodt ){
					clonedList.add((MetPbokRprsChgReqGrid_DODT)item.clone());
				}
				object.metpbokrprschgreqgridDodt= clonedList;
			}
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
		
		result= prime * result + ((this.rgsRvkDscd==null)?0:this.rgsRvkDscd.hashCode());
		result= prime * result + ((this.metMngNo==null)?0:this.metMngNo.hashCode());
		result= prime * result + ((this.ebnkUtzpeNo==null)?0:this.ebnkUtzpeNo.hashCode());
		result= prime * result + ((this.metCtrStcd==null)?0:this.metCtrStcd.hashCode());
		result= prime * result + ((this.metPbokDscd==null)?0:this.metPbokDscd.hashCode());
		result= prime * result + ((this.metNm==null)?0:this.metNm.hashCode());
		result= prime * result + ((this.rcvBkwAcno==null)?0:this.rcvBkwAcno.hashCode());
		result= prime * result + ((this.rlfAcno==null)?0:this.rlfAcno.hashCode());
		result= prime * result + ((this.mbpfPymDt==null)?0:this.mbpfPymDt.hashCode());
		result= prime * result + ((this.mbpfPymCycd==null)?0:this.mbpfPymCycd.hashCode());
		result= prime * result + ((this.mbpfPmtgtAm==null)?0:this.mbpfPmtgtAm.hashCode());
		result= prime * result + ((this.agmdCollDt==null)?0:this.agmdCollDt.hashCode());
		result= prime * result + ((this.advpeEno==null)?0:this.advpeEno.hashCode());
		result= prime * result + ((this.asmnlApvCd==null)?0:this.asmnlApvCd.hashCode());
		result= prime * result + ((this.rppeChgRgsYn==null)?0:this.rppeChgRgsYn.hashCode());
		result= prime * result + ((this.rppeChgRgsDt==null)?0:this.rppeChgRgsDt.hashCode());
		result= prime * result + ((this.rppeChgVldYn==null)?0:this.rppeChgVldYn.hashCode());
		result= prime * result + ((this.metDscd==null)?0:this.metDscd.hashCode());
		result= prime * result + ((this.metRgsDt==null)?0:this.metRgsDt.hashCode());
		result= prime * result + ((this.rgsTm==null)?0:this.rgsTm.hashCode());
		result= prime * result + ((this.cusUsgBkwAcno==null)?0:this.cusUsgBkwAcno.hashCode());
		result= prime * result + ((this.metpbokrprschgreqgridDodt==null)?0:this.metpbokrprschgreqgridDodt.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MetPbokRprsChgReq_DODT other= (MetPbokRprsChgReq_DODT)obj;
		{
			Object _rgsRvkDscd= getRgsRvkDscd();
			Object __rgsRvkDscd= other.getRgsRvkDscd();
			if ( _rgsRvkDscd== null ) { if ( __rgsRvkDscd!= null ) return false; }
			else if ( !_rgsRvkDscd.equals(__rgsRvkDscd) ) return false;
		}
		{
			Object _metMngNo= getMetMngNo();
			Object __metMngNo= other.getMetMngNo();
			if ( _metMngNo== null ) { if ( __metMngNo!= null ) return false; }
			else if ( !_metMngNo.equals(__metMngNo) ) return false;
		}
		{
			Object _ebnkUtzpeNo= getEbnkUtzpeNo();
			Object __ebnkUtzpeNo= other.getEbnkUtzpeNo();
			if ( _ebnkUtzpeNo== null ) { if ( __ebnkUtzpeNo!= null ) return false; }
			else if ( !_ebnkUtzpeNo.equals(__ebnkUtzpeNo) ) return false;
		}
		{
			Object _metCtrStcd= getMetCtrStcd();
			Object __metCtrStcd= other.getMetCtrStcd();
			if ( _metCtrStcd== null ) { if ( __metCtrStcd!= null ) return false; }
			else if ( !_metCtrStcd.equals(__metCtrStcd) ) return false;
		}
		{
			Object _metPbokDscd= getMetPbokDscd();
			Object __metPbokDscd= other.getMetPbokDscd();
			if ( _metPbokDscd== null ) { if ( __metPbokDscd!= null ) return false; }
			else if ( !_metPbokDscd.equals(__metPbokDscd) ) return false;
		}
		{
			Object _metNm= getMetNm();
			Object __metNm= other.getMetNm();
			if ( _metNm== null ) { if ( __metNm!= null ) return false; }
			else if ( !_metNm.equals(__metNm) ) return false;
		}
		{
			Object _rcvBkwAcno= getRcvBkwAcno();
			Object __rcvBkwAcno= other.getRcvBkwAcno();
			if ( _rcvBkwAcno== null ) { if ( __rcvBkwAcno!= null ) return false; }
			else if ( !_rcvBkwAcno.equals(__rcvBkwAcno) ) return false;
		}
		{
			Object _rlfAcno= getRlfAcno();
			Object __rlfAcno= other.getRlfAcno();
			if ( _rlfAcno== null ) { if ( __rlfAcno!= null ) return false; }
			else if ( !_rlfAcno.equals(__rlfAcno) ) return false;
		}
		{
			Object _mbpfPymDt= getMbpfPymDt();
			Object __mbpfPymDt= other.getMbpfPymDt();
			if ( _mbpfPymDt== null ) { if ( __mbpfPymDt!= null ) return false; }
			else if ( !_mbpfPymDt.equals(__mbpfPymDt) ) return false;
		}
		{
			Object _mbpfPymCycd= getMbpfPymCycd();
			Object __mbpfPymCycd= other.getMbpfPymCycd();
			if ( _mbpfPymCycd== null ) { if ( __mbpfPymCycd!= null ) return false; }
			else if ( !_mbpfPymCycd.equals(__mbpfPymCycd) ) return false;
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
			Object _advpeEno= getAdvpeEno();
			Object __advpeEno= other.getAdvpeEno();
			if ( _advpeEno== null ) { if ( __advpeEno!= null ) return false; }
			else if ( !_advpeEno.equals(__advpeEno) ) return false;
		}
		{
			Object _asmnlApvCd= getAsmnlApvCd();
			Object __asmnlApvCd= other.getAsmnlApvCd();
			if ( _asmnlApvCd== null ) { if ( __asmnlApvCd!= null ) return false; }
			else if ( !_asmnlApvCd.equals(__asmnlApvCd) ) return false;
		}
		{
			Object _rppeChgRgsYn= getRppeChgRgsYn();
			Object __rppeChgRgsYn= other.getRppeChgRgsYn();
			if ( _rppeChgRgsYn== null ) { if ( __rppeChgRgsYn!= null ) return false; }
			else if ( !_rppeChgRgsYn.equals(__rppeChgRgsYn) ) return false;
		}
		{
			Object _rppeChgRgsDt= getRppeChgRgsDt();
			Object __rppeChgRgsDt= other.getRppeChgRgsDt();
			if ( _rppeChgRgsDt== null ) { if ( __rppeChgRgsDt!= null ) return false; }
			else if ( !_rppeChgRgsDt.equals(__rppeChgRgsDt) ) return false;
		}
		{
			Object _rppeChgVldYn= getRppeChgVldYn();
			Object __rppeChgVldYn= other.getRppeChgVldYn();
			if ( _rppeChgVldYn== null ) { if ( __rppeChgVldYn!= null ) return false; }
			else if ( !_rppeChgVldYn.equals(__rppeChgVldYn) ) return false;
		}
		{
			Object _metDscd= getMetDscd();
			Object __metDscd= other.getMetDscd();
			if ( _metDscd== null ) { if ( __metDscd!= null ) return false; }
			else if ( !_metDscd.equals(__metDscd) ) return false;
		}
		{
			Object _metRgsDt= getMetRgsDt();
			Object __metRgsDt= other.getMetRgsDt();
			if ( _metRgsDt== null ) { if ( __metRgsDt!= null ) return false; }
			else if ( !_metRgsDt.equals(__metRgsDt) ) return false;
		}
		{
			Object _rgsTm= getRgsTm();
			Object __rgsTm= other.getRgsTm();
			if ( _rgsTm== null ) { if ( __rgsTm!= null ) return false; }
			else if ( !_rgsTm.equals(__rgsTm) ) return false;
		}
		{
			Object _cusUsgBkwAcno= getCusUsgBkwAcno();
			Object __cusUsgBkwAcno= other.getCusUsgBkwAcno();
			if ( _cusUsgBkwAcno== null ) { if ( __cusUsgBkwAcno!= null ) return false; }
			else if ( !_cusUsgBkwAcno.equals(__cusUsgBkwAcno) ) return false;
		}
		{
			Object _metpbokrprschgreqgridDodt= getMetpbokrprschgreqgridDodt();
			Object __metpbokrprschgreqgridDodt= other.getMetpbokrprschgreqgridDodt();
			if ( _metpbokrprschgreqgridDodt== null ) { if ( __metpbokrprschgreqgridDodt!= null ) return false; }
			else if ( !_metpbokrprschgreqgridDodt.equals(__metpbokrprschgreqgridDodt) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MetPbokRprsChgReq_DODT.class.getName()).append(":\n");
		sb.append("\trgsRvkDscd: ");
		sb.append(rgsRvkDscd==null?"null":getRgsRvkDscd());
		sb.append("\n");
		sb.append("\tmetMngNo: ");
		sb.append(metMngNo==null?"null":getMetMngNo());
		sb.append("\n");
		sb.append("\tebnkUtzpeNo: ");
		sb.append(ebnkUtzpeNo==null?"null":getEbnkUtzpeNo().toString().replaceAll(".", "."));
		sb.append("\n");
		sb.append("\tmetCtrStcd: ");
		sb.append(metCtrStcd==null?"null":getMetCtrStcd());
		sb.append("\n");
		sb.append("\tmetPbokDscd: ");
		sb.append(metPbokDscd==null?"null":getMetPbokDscd());
		sb.append("\n");
		sb.append("\tmetNm: ");
		sb.append(metNm==null?"null":getMetNm());
		sb.append("\n");
		sb.append("\trcvBkwAcno: ");
		sb.append(rcvBkwAcno==null?"null":getRcvBkwAcno().toString().replaceAll(".", "."));
		sb.append("\n");
		sb.append("\trlfAcno: ");
		sb.append(rlfAcno==null?"null":getRlfAcno().toString().replaceAll(".", "."));
		sb.append("\n");
		sb.append("\tmbpfPymDt: ");
		sb.append(mbpfPymDt==null?"null":getMbpfPymDt());
		sb.append("\n");
		sb.append("\tmbpfPymCycd: ");
		sb.append(mbpfPymCycd==null?"null":getMbpfPymCycd());
		sb.append("\n");
		sb.append("\tmbpfPmtgtAm: ");
		sb.append(mbpfPmtgtAm==null?"null":getMbpfPmtgtAm());
		sb.append("\n");
		sb.append("\tagmdCollDt: ");
		sb.append(agmdCollDt==null?"null":getAgmdCollDt());
		sb.append("\n");
		sb.append("\tadvpeEno: ");
		sb.append(advpeEno==null?"null":getAdvpeEno());
		sb.append("\n");
		sb.append("\tasmnlApvCd: ");
		sb.append(asmnlApvCd==null?"null":getAsmnlApvCd());
		sb.append("\n");
		sb.append("\trppeChgRgsYn: ");
		sb.append(rppeChgRgsYn==null?"null":getRppeChgRgsYn());
		sb.append("\n");
		sb.append("\trppeChgRgsDt: ");
		sb.append(rppeChgRgsDt==null?"null":getRppeChgRgsDt());
		sb.append("\n");
		sb.append("\trppeChgVldYn: ");
		sb.append(rppeChgVldYn==null?"null":getRppeChgVldYn());
		sb.append("\n");
		sb.append("\tmetDscd: ");
		sb.append(metDscd==null?"null":getMetDscd());
		sb.append("\n");
		sb.append("\tmetRgsDt: ");
		sb.append(metRgsDt==null?"null":getMetRgsDt());
		sb.append("\n");
		sb.append("\trgsTm: ");
		sb.append(rgsTm==null?"null":getRgsTm());
		sb.append("\n");
		sb.append("\tcusUsgBkwAcno: ");
		sb.append(cusUsgBkwAcno==null?"null":getCusUsgBkwAcno().toString().replaceAll(".", "."));
		sb.append("\n");
		sb.append("\tmetpbokrprschgreqgridDodt: ");
		if ( metpbokrprschgreqgridDodt== null ) sb.append("null");
		else{
			sb.append("array count : ");
			sb.append(metpbokrprschgreqgridDodt.size());
			sb.append("(items)\n");
	
			int max= (10<metpbokrprschgreqgridDodt.size())?10:metpbokrprschgreqgridDodt.size();
	
			for ( int i= 0; i < max; ++i ){
				sb.append("\tmetpbokrprschgreqgridDodt[");
				sb.append(i);
				sb.append("] : ");
				sb.append(metpbokrprschgreqgridDodt.get(i));
				sb.append("\n");
			}
	
			if ( max < metpbokrprschgreqgridDodt.size() ){
				sb.append("\tmetpbokrprschgreqgridDodt[.] : ").append("more ").append((metpbokrprschgreqgridDodt.size()-max)).append(" items").append("\n");
			}
		}
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 1; /* rgsRvkDscd */
		messageLen+= 9; /* metMngNo */
		messageLen+= 13; /* ebnkUtzpeNo */
		messageLen+= 2; /* metCtrStcd */
		messageLen+= 1; /* metPbokDscd */
		messageLen+= 100; /* metNm */
		messageLen+= 20; /* rcvBkwAcno */
		messageLen+= 20; /* rlfAcno */
		messageLen+= 8; /* mbpfPymDt */
		messageLen+= 2; /* mbpfPymCycd */
		messageLen+= 18; /* mbpfPmtgtAm */
		messageLen+= 8; /* agmdCollDt */
		messageLen+= 8; /* advpeEno */
		messageLen+= 1; /* asmnlApvCd */
		messageLen+= 1; /* rppeChgRgsYn */
		messageLen+= 8; /* rppeChgRgsDt */
		messageLen+= 8; /* rppeChgVldYn */
		messageLen+= 2; /* metDscd */
		messageLen+= 8; /* metRgsDt */
		messageLen+= 8; /* rgsTm */
		messageLen+= 20; /* cusUsgBkwAcno */
		{/*metpbokrprschgreqgridDodt*/
			int size=1;
			int count= metpbokrprschgreqgridDodt == null ? 0 : metpbokrprschgreqgridDodt.size();
			int min= size > count?count:size;
			MetPbokRprsChgReqGrid_DODT emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					MetPbokRprsChgReqGrid_DODT element= metpbokrprschgreqgridDodt.get(i);
					if ( element != null && !(element instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= element==null?0:( (Predictable)element).predictMessageLength();
				}else{
					if ( emptyElement== null ) emptyElement= new com.skbank.sml.fns.mpb.dto.MetPbokRprsChgReqGrid_DODT();
					if ( !(emptyElement instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= ( (Predictable)emptyElement).predictMessageLength();
				}
			}
		}
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("rgsRvkDscd");
		list.add("metMngNo");
		list.add("ebnkUtzpeNo");
		list.add("metCtrStcd");
		list.add("metPbokDscd");
		list.add("metNm");
		list.add("rcvBkwAcno");
		list.add("rlfAcno");
		list.add("mbpfPymDt");
		list.add("mbpfPymCycd");
		list.add("mbpfPmtgtAm");
		list.add("agmdCollDt");
		list.add("advpeEno");
		list.add("asmnlApvCd");
		list.add("rppeChgRgsYn");
		list.add("rppeChgRgsDt");
		list.add("rppeChgVldYn");
		list.add("metDscd");
		list.add("metRgsDt");
		list.add("rgsTm");
		list.add("cusUsgBkwAcno");
		list.add("metpbokrprschgreqgridDodt");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("rgsRvkDscd", get("rgsRvkDscd"));
		map.put("metMngNo", get("metMngNo"));
		map.put("ebnkUtzpeNo", get("ebnkUtzpeNo"));
		map.put("metCtrStcd", get("metCtrStcd"));
		map.put("metPbokDscd", get("metPbokDscd"));
		map.put("metNm", get("metNm"));
		map.put("rcvBkwAcno", get("rcvBkwAcno"));
		map.put("rlfAcno", get("rlfAcno"));
		map.put("mbpfPymDt", get("mbpfPymDt"));
		map.put("mbpfPymCycd", get("mbpfPymCycd"));
		map.put("mbpfPmtgtAm", get("mbpfPmtgtAm"));
		map.put("agmdCollDt", get("agmdCollDt"));
		map.put("advpeEno", get("advpeEno"));
		map.put("asmnlApvCd", get("asmnlApvCd"));
		map.put("rppeChgRgsYn", get("rppeChgRgsYn"));
		map.put("rppeChgRgsDt", get("rppeChgRgsDt"));
		map.put("rppeChgVldYn", get("rppeChgVldYn"));
		map.put("metDscd", get("metDscd"));
		map.put("metRgsDt", get("metRgsDt"));
		map.put("rgsTm", get("rgsTm"));
		map.put("cusUsgBkwAcno", get("cusUsgBkwAcno"));
		map.put("metpbokrprschgreqgridDodt", get("metpbokrprschgreqgridDodt"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -612139591:/* rgsRvkDscd */
			return getRgsRvkDscd();
		case -468172085:/* metMngNo */
			return getMetMngNo();
		case -1070809513:/* ebnkUtzpeNo */
			return getEbnkUtzpeNo();
		case 955180743:/* metCtrStcd */
			return getMetCtrStcd();
		case 1867195290:/* metPbokDscd */
			return getMetPbokDscd();
		case 103786683:/* metNm */
			return getMetNm();
		case 1637074860:/* rcvBkwAcno */
			return getRcvBkwAcno();
		case 1284387055:/* rlfAcno */
			return getRlfAcno();
		case -1128355927:/* mbpfPymDt */
			return getMbpfPymDt();
		case -2018309072:/* mbpfPymCycd */
			return getMbpfPymCycd();
		case 1940639685:/* mbpfPmtgtAm */
			return getMbpfPmtgtAm();
		case -1798348999:/* agmdCollDt */
			return getAgmdCollDt();
		case -705281570:/* advpeEno */
			return getAdvpeEno();
		case -596421905:/* asmnlApvCd */
			return getAsmnlApvCd();
		case 1379479268:/* rppeChgRgsYn */
			return getRppeChgRgsYn();
		case 1379478623:/* rppeChgRgsDt */
			return getRppeChgRgsDt();
		case 1383307892:/* rppeChgVldYn */
			return getRppeChgVldYn();
		case 954465580:/* metDscd */
			return getMetDscd();
		case -463751790:/* metRgsDt */
			return getMetRgsDt();
		case 108463095:/* rgsTm */
			return getRgsTm();
		case -2031113431:/* cusUsgBkwAcno */
			return getCusUsgBkwAcno();
		case -1806380314:/* metpbokrprschgreqgridDodt */
			return getMetpbokrprschgreqgridDodt();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -612139591:/* rgsRvkDscd */
			setRgsRvkDscd((String)value);
			break;
		case -468172085:/* metMngNo */
			setMetMngNo((String)value);
			break;
		case -1070809513:/* ebnkUtzpeNo */
			setEbnkUtzpeNo((String)value);
			break;
		case 955180743:/* metCtrStcd */
			setMetCtrStcd((String)value);
			break;
		case 1867195290:/* metPbokDscd */
			setMetPbokDscd((String)value);
			break;
		case 103786683:/* metNm */
			setMetNm((String)value);
			break;
		case 1637074860:/* rcvBkwAcno */
			setRcvBkwAcno((String)value);
			break;
		case 1284387055:/* rlfAcno */
			setRlfAcno((String)value);
			break;
		case -1128355927:/* mbpfPymDt */
			setMbpfPymDt((String)value);
			break;
		case -2018309072:/* mbpfPymCycd */
			setMbpfPymCycd((String)value);
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
		case -705281570:/* advpeEno */
			setAdvpeEno((String)value);
			break;
		case -596421905:/* asmnlApvCd */
			setAsmnlApvCd((String)value);
			break;
		case 1379479268:/* rppeChgRgsYn */
			setRppeChgRgsYn((String)value);
			break;
		case 1379478623:/* rppeChgRgsDt */
			setRppeChgRgsDt((String)value);
			break;
		case 1383307892:/* rppeChgVldYn */
			setRppeChgVldYn((String)value);
			break;
		case 954465580:/* metDscd */
			setMetDscd((String)value);
			break;
		case -463751790:/* metRgsDt */
			setMetRgsDt((String)value);
			break;
		case 108463095:/* rgsTm */
			setRgsTm((String)value);
			break;
		case -2031113431:/* cusUsgBkwAcno */
			setCusUsgBkwAcno((String)value);
			break;
		case -1806380314:/* metpbokrprschgreqgridDodt */
			setMetpbokrprschgreqgridDodt((List<MetPbokRprsChgReqGrid_DODT>)value);
			break;
		default:
			break;
		}
	}
	
}
