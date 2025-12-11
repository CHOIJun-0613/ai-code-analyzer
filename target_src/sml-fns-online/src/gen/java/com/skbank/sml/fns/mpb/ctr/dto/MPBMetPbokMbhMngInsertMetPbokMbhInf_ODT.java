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
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 */
@XmlType(propOrder={
	"trnDis", "trnDisNm", "metMngNo", "ebnkUtzpeNo", "metCtrStcd", "metCtrStcdNm", "metPbokDscd", "metPbokDscdNm", "metNm", "rcvBkwAcno", "rlfAcno", "mbpfPymDt", "mbpfPymCycd", "mbpfPymCycdNm", "mbpfPmtgtAm"
	, "agmdCollDt", "advpeEno", "asmnlApvCd", "asmnlApvCdNm", "rppeChgRgsYn", "rppeChgRgsDt", "rppeChgVldDt", "metDscd", "metDscdNm", "metRgsDt", "rgsTm", "cusUsgBkwAcno", "metBscImgUrlNm", "gridCnt", "grid"
}, name="MPBMetPbokMbhMngInsertMetPbokMbhInf_ODT")
@XmlRootElement(name="MPBMetPbokMbhMngInsertMetPbokMbhInf_ODT")
@BxmCategory(logicalName="모임통장.회원.정보.등록.탈퇴.출력.IO", description="") 
public class MPBMetPbokMbhMngInsertMetPbokMbhInf_ODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -934060122L;
	
	
	
	/**
	 * 거래구분
	 */
	@ApiModelProperty(
		name = "trnDis"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("trnDis")
	@BxmOmm_Field(length=1, decimal=0, description="거래구분", align="left", fill="")
	private String trnDis= "";
	
	
	/**
	 * 거래구분명
	 */
	@ApiModelProperty(
		name = "trnDisNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("trnDisNm")
	@BxmOmm_Field(length=30, decimal=0, description="거래구분명", align="left", fill="")
	private String trnDisNm= "";
	
	
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
	@BxmOmm_Field(length=13, decimal=0, description="전자뱅킹이용자번호", align="left", fill="")
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
	 * 모임계약상태코드명
	 */
	@ApiModelProperty(
		name = "metCtrStcdNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metCtrStcdNm")
	@BxmOmm_Field(length=50, decimal=0, description="모임계약상태코드명", align="left", fill="")
	private String metCtrStcdNm= "";
	
	
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
	 * 모임통장구분코드명
	 */
	@ApiModelProperty(
		name = "metPbokDscdNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metPbokDscdNm")
	@BxmOmm_Field(length=50, decimal=0, description="모임통장구분코드명", align="left", fill="")
	private String metPbokDscdNm= "";
	
	
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
	@BxmOmm_Field(length=20, decimal=0, description="입금전행계좌번호", align="left", fill="")
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
	@BxmOmm_Field(length=11, decimal=0, description="안심계좌번호", align="left", fill="")
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
	 * 회비납부주기코드명
	 */
	@ApiModelProperty(
		name = "mbpfPymCycdNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("mbpfPymCycdNm")
	@BxmOmm_Field(length=50, decimal=0, description="회비납부주기코드명", align="left", fill="")
	private String mbpfPymCycdNm= "";
	
	
	/**
	 * 회비납부대상금액
	 */
	@ApiModelProperty(
		name = "mbpfPmtgtAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("mbpfPmtgtAm")
	@BxmOmm_Field(length=19, decimal=3, description="회비납부대상금액", align="right", fill="0")
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
	 * 공동명의승인코드명
	 */
	@ApiModelProperty(
		name = "asmnlApvCdNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("asmnlApvCdNm")
	@BxmOmm_Field(length=50, decimal=0, description="공동명의승인코드명", align="left", fill="")
	private String asmnlApvCdNm= "";
	
	
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
		name = "rppeChgVldDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rppeChgVldDt")
	@BxmOmm_Field(length=8, decimal=0, description="대표자변경유효일자", align="left", fill="")
	private String rppeChgVldDt= "";
	
	
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
	 * 모임구분코드명
	 */
	@ApiModelProperty(
		name = "metDscdNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metDscdNm")
	@BxmOmm_Field(length=50, decimal=0, description="모임구분코드명", align="left", fill="")
	private String metDscdNm= "";
	
	
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
	@BxmOmm_Field(length=6, decimal=0, description="등록시각", align="left", fill="")
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
	@BxmOmm_Field(length=20, decimal=0, description="고객사용전행계좌번호", align="left", fill="")
	private String cusUsgBkwAcno= "";
	
	
	/**
	 * 모임기본이미지URL명
	 */
	@ApiModelProperty(
		name = "metBscImgUrlNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metBscImgUrlNm")
	@BxmOmm_Field(length=100, decimal=0, description="모임기본이미지URL명", align="left", fill="")
	private String metBscImgUrlNm= "";
	
	
	/**
	 * 그리드건수
	 */
	@ApiModelProperty(
		name = "gridCnt"
		, dataType = "java.math.BigInteger"
		)
	@JsonProperty("gridCnt")
	@BxmOmm_Field(length=2, decimal=0, description="그리드건수", align="right", fill="0")
	private Integer gridCnt= 0;
	
	
	/**
	 * 
	 */
	@ApiModelProperty(
		name = "grid"
		, dataType = "[Lcom.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokMbhInfRgsScssGrid_ODT;"
		)
	@XmlElement(name="item")
	@XmlElementWrapper()
	@JsonProperty("grid")
	@BxmOmm_Field(length=0, decimal=0, align="left", fill="", arrayReference="gridCnt")
	private List<MPBMetPbokMbhInfRgsScssGrid_ODT> grid= new ArrayList<>();
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_trnDis= false;
	protected final boolean isSet_trnDis(){
		return this.isSet_trnDis;
	}
	private void setIsSet_trnDis(boolean value){
		this.isSet_trnDis= value;
	}
	/**
	 * 거래구분
	 */
	@XmlTransient
	public String getTrnDis(){
		return this.trnDis;
	}
	
	/**
	 * 거래구분
	 * 
	 * @param trnDis 거래구분
	 */
	public void setTrnDis(String trnDis){
		this.trnDis= trnDis;
		this.setIsSet_trnDis(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_trnDisNm= false;
	protected final boolean isSet_trnDisNm(){
		return this.isSet_trnDisNm;
	}
	private void setIsSet_trnDisNm(boolean value){
		this.isSet_trnDisNm= value;
	}
	/**
	 * 거래구분명
	 */
	@XmlTransient
	public String getTrnDisNm(){
		return this.trnDisNm;
	}
	
	/**
	 * 거래구분명
	 * 
	 * @param trnDisNm 거래구분명
	 */
	public void setTrnDisNm(String trnDisNm){
		this.trnDisNm= trnDisNm;
		this.setIsSet_trnDisNm(true);
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
	private boolean isSet_metCtrStcdNm= false;
	protected final boolean isSet_metCtrStcdNm(){
		return this.isSet_metCtrStcdNm;
	}
	private void setIsSet_metCtrStcdNm(boolean value){
		this.isSet_metCtrStcdNm= value;
	}
	/**
	 * 모임계약상태코드명
	 */
	@XmlTransient
	public String getMetCtrStcdNm(){
		return this.metCtrStcdNm;
	}
	
	/**
	 * 모임계약상태코드명
	 * 
	 * @param metCtrStcdNm 모임계약상태코드명
	 */
	public void setMetCtrStcdNm(String metCtrStcdNm){
		this.metCtrStcdNm= metCtrStcdNm;
		this.setIsSet_metCtrStcdNm(true);
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
	private boolean isSet_metPbokDscdNm= false;
	protected final boolean isSet_metPbokDscdNm(){
		return this.isSet_metPbokDscdNm;
	}
	private void setIsSet_metPbokDscdNm(boolean value){
		this.isSet_metPbokDscdNm= value;
	}
	/**
	 * 모임통장구분코드명
	 */
	@XmlTransient
	public String getMetPbokDscdNm(){
		return this.metPbokDscdNm;
	}
	
	/**
	 * 모임통장구분코드명
	 * 
	 * @param metPbokDscdNm 모임통장구분코드명
	 */
	public void setMetPbokDscdNm(String metPbokDscdNm){
		this.metPbokDscdNm= metPbokDscdNm;
		this.setIsSet_metPbokDscdNm(true);
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
	private boolean isSet_mbpfPymCycdNm= false;
	protected final boolean isSet_mbpfPymCycdNm(){
		return this.isSet_mbpfPymCycdNm;
	}
	private void setIsSet_mbpfPymCycdNm(boolean value){
		this.isSet_mbpfPymCycdNm= value;
	}
	/**
	 * 회비납부주기코드명
	 */
	@XmlTransient
	public String getMbpfPymCycdNm(){
		return this.mbpfPymCycdNm;
	}
	
	/**
	 * 회비납부주기코드명
	 * 
	 * @param mbpfPymCycdNm 회비납부주기코드명
	 */
	public void setMbpfPymCycdNm(String mbpfPymCycdNm){
		this.mbpfPymCycdNm= mbpfPymCycdNm;
		this.setIsSet_mbpfPymCycdNm(true);
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
	private boolean isSet_asmnlApvCdNm= false;
	protected final boolean isSet_asmnlApvCdNm(){
		return this.isSet_asmnlApvCdNm;
	}
	private void setIsSet_asmnlApvCdNm(boolean value){
		this.isSet_asmnlApvCdNm= value;
	}
	/**
	 * 공동명의승인코드명
	 */
	@XmlTransient
	public String getAsmnlApvCdNm(){
		return this.asmnlApvCdNm;
	}
	
	/**
	 * 공동명의승인코드명
	 * 
	 * @param asmnlApvCdNm 공동명의승인코드명
	 */
	public void setAsmnlApvCdNm(String asmnlApvCdNm){
		this.asmnlApvCdNm= asmnlApvCdNm;
		this.setIsSet_asmnlApvCdNm(true);
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
	private boolean isSet_rppeChgVldDt= false;
	protected final boolean isSet_rppeChgVldDt(){
		return this.isSet_rppeChgVldDt;
	}
	private void setIsSet_rppeChgVldDt(boolean value){
		this.isSet_rppeChgVldDt= value;
	}
	/**
	 * 대표자변경유효일자
	 */
	@XmlTransient
	public String getRppeChgVldDt(){
		return this.rppeChgVldDt;
	}
	
	/**
	 * 대표자변경유효일자
	 * 
	 * @param rppeChgVldDt 대표자변경유효일자
	 */
	public void setRppeChgVldDt(String rppeChgVldDt){
		this.rppeChgVldDt= rppeChgVldDt;
		this.setIsSet_rppeChgVldDt(true);
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
	private boolean isSet_metDscdNm= false;
	protected final boolean isSet_metDscdNm(){
		return this.isSet_metDscdNm;
	}
	private void setIsSet_metDscdNm(boolean value){
		this.isSet_metDscdNm= value;
	}
	/**
	 * 모임구분코드명
	 */
	@XmlTransient
	public String getMetDscdNm(){
		return this.metDscdNm;
	}
	
	/**
	 * 모임구분코드명
	 * 
	 * @param metDscdNm 모임구분코드명
	 */
	public void setMetDscdNm(String metDscdNm){
		this.metDscdNm= metDscdNm;
		this.setIsSet_metDscdNm(true);
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
	private boolean isSet_metBscImgUrlNm= false;
	protected final boolean isSet_metBscImgUrlNm(){
		return this.isSet_metBscImgUrlNm;
	}
	private void setIsSet_metBscImgUrlNm(boolean value){
		this.isSet_metBscImgUrlNm= value;
	}
	/**
	 * 모임기본이미지URL명
	 */
	@XmlTransient
	public String getMetBscImgUrlNm(){
		return this.metBscImgUrlNm;
	}
	
	/**
	 * 모임기본이미지URL명
	 * 
	 * @param metBscImgUrlNm 모임기본이미지URL명
	 */
	public void setMetBscImgUrlNm(String metBscImgUrlNm){
		this.metBscImgUrlNm= metBscImgUrlNm;
		this.setIsSet_metBscImgUrlNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_gridCnt= false;
	protected final boolean isSet_gridCnt(){
		return this.isSet_gridCnt;
	}
	private void setIsSet_gridCnt(boolean value){
		this.isSet_gridCnt= value;
	}
	/**
	 * 그리드건수
	 */
	@XmlElement
	public Integer getGridCnt(){
		if ( isSet_gridCnt )	return gridCnt;
		else{
			if ( grid == null || grid.size() == 0 ) return 0;
			else return grid.size();
		}
	}
	
	/**
	 * 그리드건수
	 * 
	 * @param gridCnt 그리드건수
	 */
	public void setGridCnt(Integer gridCnt){
		this.gridCnt= gridCnt;
		this.setIsSet_gridCnt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_grid= false;
	protected final boolean isSet_grid(){
		return this.isSet_grid;
	}
	private void setIsSet_grid(boolean value){
		this.isSet_grid= value;
	}
	/**
	 * 
	 */
	@XmlTransient
	public List<MPBMetPbokMbhInfRgsScssGrid_ODT> getGrid(){
		return grid;
	}
	
	/**
	 * 
	 * 
	 * @param grid 
	 */
	@JsonSetter("grid")
	public void setGrid(List<MPBMetPbokMbhInfRgsScssGrid_ODT> grid){
		this.grid= grid;
		this.setIsSet_grid(true);
	}
	
	public void setGrid(MPBMetPbokMbhInfRgsScssGrid_ODT... items){
		List<MPBMetPbokMbhInfRgsScssGrid_ODT> _items= new ArrayList<>();
		if ( items!= null && items.length> 0){
			for( MPBMetPbokMbhInfRgsScssGrid_ODT item: items ){
				_items.add(item);
			}
		}
		this.setGrid(_items);
	}
				
	@Override
	public MPBMetPbokMbhMngInsertMetPbokMbhInf_ODT clone(){
		try{
			MPBMetPbokMbhMngInsertMetPbokMbhInf_ODT object= (MPBMetPbokMbhMngInsertMetPbokMbhInf_ODT)super.clone();
			if ( this.grid== null ) object.grid= null;
			else{
				List<MPBMetPbokMbhInfRgsScssGrid_ODT> clonedList= new ArrayList<>(this.grid.size());
				for( MPBMetPbokMbhInfRgsScssGrid_ODT item : grid ){
					clonedList.add((MPBMetPbokMbhInfRgsScssGrid_ODT)item.clone());
				}
				object.grid= clonedList;
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
		
		result= prime * result + ((this.trnDis==null)?0:this.trnDis.hashCode());
		result= prime * result + ((this.trnDisNm==null)?0:this.trnDisNm.hashCode());
		result= prime * result + ((this.metMngNo==null)?0:this.metMngNo.hashCode());
		result= prime * result + ((this.ebnkUtzpeNo==null)?0:this.ebnkUtzpeNo.hashCode());
		result= prime * result + ((this.metCtrStcd==null)?0:this.metCtrStcd.hashCode());
		result= prime * result + ((this.metCtrStcdNm==null)?0:this.metCtrStcdNm.hashCode());
		result= prime * result + ((this.metPbokDscd==null)?0:this.metPbokDscd.hashCode());
		result= prime * result + ((this.metPbokDscdNm==null)?0:this.metPbokDscdNm.hashCode());
		result= prime * result + ((this.metNm==null)?0:this.metNm.hashCode());
		result= prime * result + ((this.rcvBkwAcno==null)?0:this.rcvBkwAcno.hashCode());
		result= prime * result + ((this.rlfAcno==null)?0:this.rlfAcno.hashCode());
		result= prime * result + ((this.mbpfPymDt==null)?0:this.mbpfPymDt.hashCode());
		result= prime * result + ((this.mbpfPymCycd==null)?0:this.mbpfPymCycd.hashCode());
		result= prime * result + ((this.mbpfPymCycdNm==null)?0:this.mbpfPymCycdNm.hashCode());
		result= prime * result + ((this.mbpfPmtgtAm==null)?0:this.mbpfPmtgtAm.hashCode());
		result= prime * result + ((this.agmdCollDt==null)?0:this.agmdCollDt.hashCode());
		result= prime * result + ((this.advpeEno==null)?0:this.advpeEno.hashCode());
		result= prime * result + ((this.asmnlApvCd==null)?0:this.asmnlApvCd.hashCode());
		result= prime * result + ((this.asmnlApvCdNm==null)?0:this.asmnlApvCdNm.hashCode());
		result= prime * result + ((this.rppeChgRgsYn==null)?0:this.rppeChgRgsYn.hashCode());
		result= prime * result + ((this.rppeChgRgsDt==null)?0:this.rppeChgRgsDt.hashCode());
		result= prime * result + ((this.rppeChgVldDt==null)?0:this.rppeChgVldDt.hashCode());
		result= prime * result + ((this.metDscd==null)?0:this.metDscd.hashCode());
		result= prime * result + ((this.metDscdNm==null)?0:this.metDscdNm.hashCode());
		result= prime * result + ((this.metRgsDt==null)?0:this.metRgsDt.hashCode());
		result= prime * result + ((this.rgsTm==null)?0:this.rgsTm.hashCode());
		result= prime * result + ((this.cusUsgBkwAcno==null)?0:this.cusUsgBkwAcno.hashCode());
		result= prime * result + ((this.metBscImgUrlNm==null)?0:this.metBscImgUrlNm.hashCode());
		result= prime * result + ((this.gridCnt==null)?0:this.gridCnt.hashCode());
		result= prime * result + ((this.grid==null)?0:this.grid.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MPBMetPbokMbhMngInsertMetPbokMbhInf_ODT other= (MPBMetPbokMbhMngInsertMetPbokMbhInf_ODT)obj;
		{
			Object _trnDis= getTrnDis();
			Object __trnDis= other.getTrnDis();
			if ( _trnDis== null ) { if ( __trnDis!= null ) return false; }
			else if ( !_trnDis.equals(__trnDis) ) return false;
		}
		{
			Object _trnDisNm= getTrnDisNm();
			Object __trnDisNm= other.getTrnDisNm();
			if ( _trnDisNm== null ) { if ( __trnDisNm!= null ) return false; }
			else if ( !_trnDisNm.equals(__trnDisNm) ) return false;
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
			Object _metCtrStcdNm= getMetCtrStcdNm();
			Object __metCtrStcdNm= other.getMetCtrStcdNm();
			if ( _metCtrStcdNm== null ) { if ( __metCtrStcdNm!= null ) return false; }
			else if ( !_metCtrStcdNm.equals(__metCtrStcdNm) ) return false;
		}
		{
			Object _metPbokDscd= getMetPbokDscd();
			Object __metPbokDscd= other.getMetPbokDscd();
			if ( _metPbokDscd== null ) { if ( __metPbokDscd!= null ) return false; }
			else if ( !_metPbokDscd.equals(__metPbokDscd) ) return false;
		}
		{
			Object _metPbokDscdNm= getMetPbokDscdNm();
			Object __metPbokDscdNm= other.getMetPbokDscdNm();
			if ( _metPbokDscdNm== null ) { if ( __metPbokDscdNm!= null ) return false; }
			else if ( !_metPbokDscdNm.equals(__metPbokDscdNm) ) return false;
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
			Object _mbpfPymCycdNm= getMbpfPymCycdNm();
			Object __mbpfPymCycdNm= other.getMbpfPymCycdNm();
			if ( _mbpfPymCycdNm== null ) { if ( __mbpfPymCycdNm!= null ) return false; }
			else if ( !_mbpfPymCycdNm.equals(__mbpfPymCycdNm) ) return false;
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
			Object _asmnlApvCdNm= getAsmnlApvCdNm();
			Object __asmnlApvCdNm= other.getAsmnlApvCdNm();
			if ( _asmnlApvCdNm== null ) { if ( __asmnlApvCdNm!= null ) return false; }
			else if ( !_asmnlApvCdNm.equals(__asmnlApvCdNm) ) return false;
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
			Object _rppeChgVldDt= getRppeChgVldDt();
			Object __rppeChgVldDt= other.getRppeChgVldDt();
			if ( _rppeChgVldDt== null ) { if ( __rppeChgVldDt!= null ) return false; }
			else if ( !_rppeChgVldDt.equals(__rppeChgVldDt) ) return false;
		}
		{
			Object _metDscd= getMetDscd();
			Object __metDscd= other.getMetDscd();
			if ( _metDscd== null ) { if ( __metDscd!= null ) return false; }
			else if ( !_metDscd.equals(__metDscd) ) return false;
		}
		{
			Object _metDscdNm= getMetDscdNm();
			Object __metDscdNm= other.getMetDscdNm();
			if ( _metDscdNm== null ) { if ( __metDscdNm!= null ) return false; }
			else if ( !_metDscdNm.equals(__metDscdNm) ) return false;
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
			Object _metBscImgUrlNm= getMetBscImgUrlNm();
			Object __metBscImgUrlNm= other.getMetBscImgUrlNm();
			if ( _metBscImgUrlNm== null ) { if ( __metBscImgUrlNm!= null ) return false; }
			else if ( !_metBscImgUrlNm.equals(__metBscImgUrlNm) ) return false;
		}
		{
			Object _gridCnt= getGridCnt();
			Object __gridCnt= other.getGridCnt();
			if ( _gridCnt== null ) { if ( __gridCnt!= null ) return false; }
			else if ( !_gridCnt.equals(__gridCnt) ) return false;
		}
		{
			Object _grid= getGrid();
			Object __grid= other.getGrid();
			if ( _grid== null ) { if ( __grid!= null ) return false; }
			else if ( !_grid.equals(__grid) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MPBMetPbokMbhMngInsertMetPbokMbhInf_ODT.class.getName()).append(":\n");
		sb.append("\ttrnDis: ");
		sb.append(trnDis==null?"null":getTrnDis());
		sb.append("\n");
		sb.append("\ttrnDisNm: ");
		sb.append(trnDisNm==null?"null":getTrnDisNm());
		sb.append("\n");
		sb.append("\tmetMngNo: ");
		sb.append(metMngNo==null?"null":getMetMngNo());
		sb.append("\n");
		sb.append("\tebnkUtzpeNo: ");
		sb.append(ebnkUtzpeNo==null?"null":getEbnkUtzpeNo());
		sb.append("\n");
		sb.append("\tmetCtrStcd: ");
		sb.append(metCtrStcd==null?"null":getMetCtrStcd());
		sb.append("\n");
		sb.append("\tmetCtrStcdNm: ");
		sb.append(metCtrStcdNm==null?"null":getMetCtrStcdNm());
		sb.append("\n");
		sb.append("\tmetPbokDscd: ");
		sb.append(metPbokDscd==null?"null":getMetPbokDscd());
		sb.append("\n");
		sb.append("\tmetPbokDscdNm: ");
		sb.append(metPbokDscdNm==null?"null":getMetPbokDscdNm());
		sb.append("\n");
		sb.append("\tmetNm: ");
		sb.append(metNm==null?"null":getMetNm());
		sb.append("\n");
		sb.append("\trcvBkwAcno: ");
		sb.append(rcvBkwAcno==null?"null":getRcvBkwAcno());
		sb.append("\n");
		sb.append("\trlfAcno: ");
		sb.append(rlfAcno==null?"null":getRlfAcno());
		sb.append("\n");
		sb.append("\tmbpfPymDt: ");
		sb.append(mbpfPymDt==null?"null":getMbpfPymDt());
		sb.append("\n");
		sb.append("\tmbpfPymCycd: ");
		sb.append(mbpfPymCycd==null?"null":getMbpfPymCycd());
		sb.append("\n");
		sb.append("\tmbpfPymCycdNm: ");
		sb.append(mbpfPymCycdNm==null?"null":getMbpfPymCycdNm());
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
		sb.append("\tasmnlApvCdNm: ");
		sb.append(asmnlApvCdNm==null?"null":getAsmnlApvCdNm());
		sb.append("\n");
		sb.append("\trppeChgRgsYn: ");
		sb.append(rppeChgRgsYn==null?"null":getRppeChgRgsYn());
		sb.append("\n");
		sb.append("\trppeChgRgsDt: ");
		sb.append(rppeChgRgsDt==null?"null":getRppeChgRgsDt());
		sb.append("\n");
		sb.append("\trppeChgVldDt: ");
		sb.append(rppeChgVldDt==null?"null":getRppeChgVldDt());
		sb.append("\n");
		sb.append("\tmetDscd: ");
		sb.append(metDscd==null?"null":getMetDscd());
		sb.append("\n");
		sb.append("\tmetDscdNm: ");
		sb.append(metDscdNm==null?"null":getMetDscdNm());
		sb.append("\n");
		sb.append("\tmetRgsDt: ");
		sb.append(metRgsDt==null?"null":getMetRgsDt());
		sb.append("\n");
		sb.append("\trgsTm: ");
		sb.append(rgsTm==null?"null":getRgsTm());
		sb.append("\n");
		sb.append("\tcusUsgBkwAcno: ");
		sb.append(cusUsgBkwAcno==null?"null":getCusUsgBkwAcno());
		sb.append("\n");
		sb.append("\tmetBscImgUrlNm: ");
		sb.append(metBscImgUrlNm==null?"null":getMetBscImgUrlNm());
		sb.append("\n");
		sb.append("\tgridCnt: ");
		sb.append(gridCnt==null?"null":getGridCnt());
		sb.append("\n");
		sb.append("\tgrid: ");
		if ( grid== null ) sb.append("null");
		else{
			sb.append("array count : ");
			sb.append(grid.size());
			sb.append("(items)\n");
	
			int max= (10<grid.size())?10:grid.size();
	
			for ( int i= 0; i < max; ++i ){
				sb.append("\tgrid[");
				sb.append(i);
				sb.append("] : ");
				sb.append(grid.get(i));
				sb.append("\n");
			}
	
			if ( max < grid.size() ){
				sb.append("\tgrid[.] : ").append("more ").append((grid.size()-max)).append(" items").append("\n");
			}
		}
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 1; /* trnDis */
		messageLen+= 30; /* trnDisNm */
		messageLen+= 9; /* metMngNo */
		messageLen+= 13; /* ebnkUtzpeNo */
		messageLen+= 2; /* metCtrStcd */
		messageLen+= 50; /* metCtrStcdNm */
		messageLen+= 1; /* metPbokDscd */
		messageLen+= 50; /* metPbokDscdNm */
		messageLen+= 100; /* metNm */
		messageLen+= 20; /* rcvBkwAcno */
		messageLen+= 11; /* rlfAcno */
		messageLen+= 8; /* mbpfPymDt */
		messageLen+= 2; /* mbpfPymCycd */
		messageLen+= 50; /* mbpfPymCycdNm */
		messageLen+= 19; /* mbpfPmtgtAm */
		messageLen+= 8; /* agmdCollDt */
		messageLen+= 8; /* advpeEno */
		messageLen+= 1; /* asmnlApvCd */
		messageLen+= 50; /* asmnlApvCdNm */
		messageLen+= 1; /* rppeChgRgsYn */
		messageLen+= 8; /* rppeChgRgsDt */
		messageLen+= 8; /* rppeChgVldDt */
		messageLen+= 2; /* metDscd */
		messageLen+= 50; /* metDscdNm */
		messageLen+= 8; /* metRgsDt */
		messageLen+= 6; /* rgsTm */
		messageLen+= 20; /* cusUsgBkwAcno */
		messageLen+= 100; /* metBscImgUrlNm */
		messageLen+= 2; /* gridCnt */
		{/*grid*/
			int size=getGridCnt();
			int count= grid == null ? 0 : grid.size();
			int min= size > count?count:size;
			MPBMetPbokMbhInfRgsScssGrid_ODT emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					MPBMetPbokMbhInfRgsScssGrid_ODT element= grid.get(i);
					if ( element != null && !(element instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= element==null?0:( (Predictable)element).predictMessageLength();
				}else{
					if ( emptyElement== null ) emptyElement= new com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokMbhInfRgsScssGrid_ODT();
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
	
		list.add("trnDis");
		list.add("trnDisNm");
		list.add("metMngNo");
		list.add("ebnkUtzpeNo");
		list.add("metCtrStcd");
		list.add("metCtrStcdNm");
		list.add("metPbokDscd");
		list.add("metPbokDscdNm");
		list.add("metNm");
		list.add("rcvBkwAcno");
		list.add("rlfAcno");
		list.add("mbpfPymDt");
		list.add("mbpfPymCycd");
		list.add("mbpfPymCycdNm");
		list.add("mbpfPmtgtAm");
		list.add("agmdCollDt");
		list.add("advpeEno");
		list.add("asmnlApvCd");
		list.add("asmnlApvCdNm");
		list.add("rppeChgRgsYn");
		list.add("rppeChgRgsDt");
		list.add("rppeChgVldDt");
		list.add("metDscd");
		list.add("metDscdNm");
		list.add("metRgsDt");
		list.add("rgsTm");
		list.add("cusUsgBkwAcno");
		list.add("metBscImgUrlNm");
		list.add("gridCnt");
		list.add("grid");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("trnDis", get("trnDis"));
		map.put("trnDisNm", get("trnDisNm"));
		map.put("metMngNo", get("metMngNo"));
		map.put("ebnkUtzpeNo", get("ebnkUtzpeNo"));
		map.put("metCtrStcd", get("metCtrStcd"));
		map.put("metCtrStcdNm", get("metCtrStcdNm"));
		map.put("metPbokDscd", get("metPbokDscd"));
		map.put("metPbokDscdNm", get("metPbokDscdNm"));
		map.put("metNm", get("metNm"));
		map.put("rcvBkwAcno", get("rcvBkwAcno"));
		map.put("rlfAcno", get("rlfAcno"));
		map.put("mbpfPymDt", get("mbpfPymDt"));
		map.put("mbpfPymCycd", get("mbpfPymCycd"));
		map.put("mbpfPymCycdNm", get("mbpfPymCycdNm"));
		map.put("mbpfPmtgtAm", get("mbpfPmtgtAm"));
		map.put("agmdCollDt", get("agmdCollDt"));
		map.put("advpeEno", get("advpeEno"));
		map.put("asmnlApvCd", get("asmnlApvCd"));
		map.put("asmnlApvCdNm", get("asmnlApvCdNm"));
		map.put("rppeChgRgsYn", get("rppeChgRgsYn"));
		map.put("rppeChgRgsDt", get("rppeChgRgsDt"));
		map.put("rppeChgVldDt", get("rppeChgVldDt"));
		map.put("metDscd", get("metDscd"));
		map.put("metDscdNm", get("metDscdNm"));
		map.put("metRgsDt", get("metRgsDt"));
		map.put("rgsTm", get("rgsTm"));
		map.put("cusUsgBkwAcno", get("cusUsgBkwAcno"));
		map.put("metBscImgUrlNm", get("metBscImgUrlNm"));
		map.put("gridCnt", get("gridCnt"));
		map.put("grid", get("grid"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -865358658:/* trnDis */
			return getTrnDis();
		case 1613987613:/* trnDisNm */
			return getTrnDisNm();
		case -468172085:/* metMngNo */
			return getMetMngNo();
		case -1070809513:/* ebnkUtzpeNo */
			return getEbnkUtzpeNo();
		case 955180743:/* metCtrStcd */
			return getMetCtrStcd();
		case -1194304794:/* metCtrStcdNm */
			return getMetCtrStcdNm();
		case 1867195290:/* metPbokDscd */
			return getMetPbokDscd();
		case -921653511:/* metPbokDscdNm */
			return getMetPbokDscdNm();
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
		case 1730202127:/* mbpfPymCycdNm */
			return getMbpfPymCycdNm();
		case 1940639685:/* mbpfPmtgtAm */
			return getMbpfPmtgtAm();
		case -1798348999:/* agmdCollDt */
			return getAgmdCollDt();
		case -705281570:/* advpeEno */
			return getAdvpeEno();
		case -596421905:/* asmnlApvCd */
			return getAsmnlApvCd();
		case -1930797810:/* asmnlApvCdNm */
			return getAsmnlApvCdNm();
		case 1379479268:/* rppeChgRgsYn */
			return getRppeChgRgsYn();
		case 1379478623:/* rppeChgRgsDt */
			return getRppeChgRgsDt();
		case 1383307247:/* rppeChgVldDt */
			return getRppeChgVldDt();
		case 954465580:/* metDscd */
			return getMetDscd();
		case -1881576437:/* metDscdNm */
			return getMetDscdNm();
		case -463751790:/* metRgsDt */
			return getMetRgsDt();
		case 108463095:/* rgsTm */
			return getRgsTm();
		case -2031113431:/* cusUsgBkwAcno */
			return getCusUsgBkwAcno();
		case 300784225:/* metBscImgUrlNm */
			return getMetBscImgUrlNm();
		case 287338563:/* gridCnt */
			return getGridCnt();
		case 3181382:/* grid */
			return getGrid();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -865358658:/* trnDis */
			setTrnDis((String)value);
			break;
		case 1613987613:/* trnDisNm */
			setTrnDisNm((String)value);
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
		case -1194304794:/* metCtrStcdNm */
			setMetCtrStcdNm((String)value);
			break;
		case 1867195290:/* metPbokDscd */
			setMetPbokDscd((String)value);
			break;
		case -921653511:/* metPbokDscdNm */
			setMetPbokDscdNm((String)value);
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
		case 1730202127:/* mbpfPymCycdNm */
			setMbpfPymCycdNm((String)value);
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
		case -1930797810:/* asmnlApvCdNm */
			setAsmnlApvCdNm((String)value);
			break;
		case 1379479268:/* rppeChgRgsYn */
			setRppeChgRgsYn((String)value);
			break;
		case 1379478623:/* rppeChgRgsDt */
			setRppeChgRgsDt((String)value);
			break;
		case 1383307247:/* rppeChgVldDt */
			setRppeChgVldDt((String)value);
			break;
		case 954465580:/* metDscd */
			setMetDscd((String)value);
			break;
		case -1881576437:/* metDscdNm */
			setMetDscdNm((String)value);
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
		case 300784225:/* metBscImgUrlNm */
			setMetBscImgUrlNm((String)value);
			break;
		case 287338563:/* gridCnt */
			setGridCnt((Integer)value);
			break;
		case 3181382:/* grid */
			setGrid((List<MPBMetPbokMbhInfRgsScssGrid_ODT>)value);
			break;
		default:
			break;
		}
	}
	
}
