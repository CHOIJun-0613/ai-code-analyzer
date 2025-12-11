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

/**
 * IBSMR0005771
 */
@XmlType(propOrder={
	"metMngNo", "ebnkUtzpeNo", "metCtrStcd", "metCtrStcdNm", "metPbokDscd", "metPbokDscdNm", "metNm", "rcvBkwAcno", "cusUsgBkwAcno", "itcsno", "cusKorlNm", "cusBkpnNm", "ctBal", "payAvlBal", "pdcd"
	, "pdcdKorlNm", "prdKorlAbrNm", "rlfAcno", "mbpfPymDt", "mbpfPymCycd", "mbpfPymCycdNm", "mbpfPmtgtAm", "agmdCollDt", "advpeEno", "asmnlApvCd", "asmnlApvCdNm", "rppeChgRgsYn", "rppeChgRgsDt", "rppeChgVldDt", "metDscd"
	, "metDscdNm", "metRgsDt", "rgsTm", "metBscImgUrlNm", "metMbhRgsCnt", "metMbhScssCnt", "metRprsAlsNm", "metRprsMbhNm", "metRprsImgUrlNm", "nxtMetMbhAlsNm", "gridCnt", "grid"
}, name="MetPbokMbhInfInq_DODT")
@XmlRootElement(name="MetPbokMbhInfInq_DODT")
@BxmCategory(logicalName="모임통장.회원.정보.조회.DBM.출력.IO", description="IBSMR0005771") 
public class MetPbokMbhInfInq_DODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 1438937752L;
	
	
	
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
	 * 고객한글명
	 */
	@ApiModelProperty(
		name = "cusKorlNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("cusKorlNm")
	@BxmOmm_Field(length=100, decimal=0, description="고객한글명", align="left", fill="")
	private String cusKorlNm= "";
	
	
	/**
	 * 고객부기명
	 */
	@ApiModelProperty(
		name = "cusBkpnNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("cusBkpnNm")
	@BxmOmm_Field(length=40, decimal=0, description="고객부기명", align="left", fill="")
	private String cusBkpnNm= "";
	
	
	/**
	 * 현재잔액
	 */
	@ApiModelProperty(
		name = "ctBal"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("ctBal")
	@BxmOmm_Field(length=19, decimal=3, description="현재잔액", align="right", fill="0")
	private BigDecimal ctBal= new BigDecimal("0");
	
	
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
	 * 상품코드
	 */
	@ApiModelProperty(
		name = "pdcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("pdcd")
	@BxmOmm_Field(length=9, decimal=0, description="상품코드", align="left", fill="")
	private String pdcd= "";
	
	
	/**
	 * 상품코드한글명
	 */
	@ApiModelProperty(
		name = "pdcdKorlNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("pdcdKorlNm")
	@BxmOmm_Field(length=100, decimal=0, description="상품코드한글명", align="left", fill="")
	private String pdcdKorlNm= "";
	
	
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
	 * 모임회원등록건수
	 */
	@ApiModelProperty(
		name = "metMbhRgsCnt"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("metMbhRgsCnt")
	@BxmOmm_Field(length=6, decimal=0, description="모임회원등록건수", align="right", fill="0")
	private Integer metMbhRgsCnt= 0;
	
	
	/**
	 * 모임회원탈퇴건수
	 */
	@ApiModelProperty(
		name = "metMbhScssCnt"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("metMbhScssCnt")
	@BxmOmm_Field(length=6, decimal=0, description="모임회원탈퇴건수", align="right", fill="0")
	private Integer metMbhScssCnt= 0;
	
	
	/**
	 * 모임대표별칭명
	 */
	@ApiModelProperty(
		name = "metRprsAlsNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metRprsAlsNm")
	@BxmOmm_Field(length=60, decimal=0, description="모임대표별칭명", align="left", fill="")
	private String metRprsAlsNm= "";
	
	
	/**
	 * 모임대표회원명
	 */
	@ApiModelProperty(
		name = "metRprsMbhNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metRprsMbhNm")
	@BxmOmm_Field(length=60, decimal=0, description="모임대표회원명", align="left", fill="")
	private String metRprsMbhNm= "";
	
	
	/**
	 * 모임대표이미지URL명
	 */
	@ApiModelProperty(
		name = "metRprsImgUrlNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metRprsImgUrlNm")
	@BxmOmm_Field(length=100, decimal=0, description="모임대표이미지URL명", align="left", fill="")
	private String metRprsImgUrlNm= "";
	
	
	/**
	 * 다음모임회원별칭명
	 */
	@ApiModelProperty(
		name = "nxtMetMbhAlsNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("nxtMetMbhAlsNm")
	@BxmOmm_Field(length=60, decimal=0, description="다음모임회원별칭명", align="left", fill="")
	private String nxtMetMbhAlsNm= "";
	
	
	/**
	 * 그리드건수
	 */
	@ApiModelProperty(
		name = "gridCnt"
		, dataType = "java.math.BigInteger"
		)
	@JsonProperty("gridCnt")
	@BxmOmm_Field(length=5, decimal=0, description="그리드건수", align="right", fill="0")
	private Integer gridCnt= 0;
	
	
	/**
	 * 모임통장.회원.정보.목록.조회.DBM.출력.IO
	 */
	@ApiModelProperty(
		name = "grid"
		, dataType = "[Lcom.skbank.sml.fns.mpb.dto.MetPbokMbhInfListInq_DODT;"
		)
	@XmlElement(name="item")
	@XmlElementWrapper()
	@JsonProperty("grid")
	@BxmOmm_Field(length=0, decimal=0, description="모임통장.회원.정보.목록.조회.DBM.출력.IO", align="left", fill="", arrayReference="gridCnt")
	private List<MetPbokMbhInfListInq_DODT> grid= new ArrayList<>();
	
	
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
	private boolean isSet_cusKorlNm= false;
	protected final boolean isSet_cusKorlNm(){
		return this.isSet_cusKorlNm;
	}
	private void setIsSet_cusKorlNm(boolean value){
		this.isSet_cusKorlNm= value;
	}
	/**
	 * 고객한글명
	 */
	@XmlTransient
	public String getCusKorlNm(){
		return this.cusKorlNm;
	}
	
	/**
	 * 고객한글명
	 * 
	 * @param cusKorlNm 고객한글명
	 */
	public void setCusKorlNm(String cusKorlNm){
		this.cusKorlNm= cusKorlNm;
		this.setIsSet_cusKorlNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cusBkpnNm= false;
	protected final boolean isSet_cusBkpnNm(){
		return this.isSet_cusBkpnNm;
	}
	private void setIsSet_cusBkpnNm(boolean value){
		this.isSet_cusBkpnNm= value;
	}
	/**
	 * 고객부기명
	 */
	@XmlTransient
	public String getCusBkpnNm(){
		return this.cusBkpnNm;
	}
	
	/**
	 * 고객부기명
	 * 
	 * @param cusBkpnNm 고객부기명
	 */
	public void setCusBkpnNm(String cusBkpnNm){
		this.cusBkpnNm= cusBkpnNm;
		this.setIsSet_cusBkpnNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ctBal= false;
	protected final boolean isSet_ctBal(){
		return this.isSet_ctBal;
	}
	private void setIsSet_ctBal(boolean value){
		this.isSet_ctBal= value;
	}
	/**
	 * 현재잔액
	 * BigDecimal - Double value setter
	 *
	 * @Param ctBal 현재잔액
	 */
	public void setCtBal(double ctBal) {
		setCtBal(BigDecimal.valueOf(ctBal));
	}
	/**
	 * 현재잔액
	 * BigDecimal - Long value setter
	 *
	 * @Param ctBal 현재잔액
	 */
	public void setCtBal(long ctBal) {
		setCtBal(BigDecimal.valueOf(ctBal));
	}
	/**
	 * 현재잔액
	 * BigDecimal - String value setter
	 *
	 * @Param ctBal 현재잔액
	 */
	public void setCtBal(String ctBal) {
		setCtBal(new BigDecimal(ctBal));
	}
	/**
	 * 현재잔액
	 */
	@XmlTransient
	public BigDecimal getCtBal(){
		return this.ctBal;
	}
	
	/**
	 * 현재잔액
	 * 
	 * @param ctBal 현재잔액
	 */
	@JsonSetter("ctBal")
	public void setCtBal(BigDecimal ctBal){
		this.ctBal= ctBal;
		this.setIsSet_ctBal(true);
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
	private boolean isSet_pdcdKorlNm= false;
	protected final boolean isSet_pdcdKorlNm(){
		return this.isSet_pdcdKorlNm;
	}
	private void setIsSet_pdcdKorlNm(boolean value){
		this.isSet_pdcdKorlNm= value;
	}
	/**
	 * 상품코드한글명
	 */
	@XmlTransient
	public String getPdcdKorlNm(){
		return this.pdcdKorlNm;
	}
	
	/**
	 * 상품코드한글명
	 * 
	 * @param pdcdKorlNm 상품코드한글명
	 */
	public void setPdcdKorlNm(String pdcdKorlNm){
		this.pdcdKorlNm= pdcdKorlNm;
		this.setIsSet_pdcdKorlNm(true);
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
	private boolean isSet_metMbhRgsCnt= false;
	protected final boolean isSet_metMbhRgsCnt(){
		return this.isSet_metMbhRgsCnt;
	}
	private void setIsSet_metMbhRgsCnt(boolean value){
		this.isSet_metMbhRgsCnt= value;
	}
	/**
	 * 모임회원등록건수
	 */
	@XmlTransient
	public Integer getMetMbhRgsCnt(){
		return this.metMbhRgsCnt;
	}
	
	/**
	 * 모임회원등록건수
	 * 
	 * @param metMbhRgsCnt 모임회원등록건수
	 */
	public void setMetMbhRgsCnt(Integer metMbhRgsCnt){
		this.metMbhRgsCnt= metMbhRgsCnt;
		this.setIsSet_metMbhRgsCnt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metMbhScssCnt= false;
	protected final boolean isSet_metMbhScssCnt(){
		return this.isSet_metMbhScssCnt;
	}
	private void setIsSet_metMbhScssCnt(boolean value){
		this.isSet_metMbhScssCnt= value;
	}
	/**
	 * 모임회원탈퇴건수
	 */
	@XmlTransient
	public Integer getMetMbhScssCnt(){
		return this.metMbhScssCnt;
	}
	
	/**
	 * 모임회원탈퇴건수
	 * 
	 * @param metMbhScssCnt 모임회원탈퇴건수
	 */
	public void setMetMbhScssCnt(Integer metMbhScssCnt){
		this.metMbhScssCnt= metMbhScssCnt;
		this.setIsSet_metMbhScssCnt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metRprsAlsNm= false;
	protected final boolean isSet_metRprsAlsNm(){
		return this.isSet_metRprsAlsNm;
	}
	private void setIsSet_metRprsAlsNm(boolean value){
		this.isSet_metRprsAlsNm= value;
	}
	/**
	 * 모임대표별칭명
	 */
	@XmlTransient
	public String getMetRprsAlsNm(){
		return this.metRprsAlsNm;
	}
	
	/**
	 * 모임대표별칭명
	 * 
	 * @param metRprsAlsNm 모임대표별칭명
	 */
	public void setMetRprsAlsNm(String metRprsAlsNm){
		this.metRprsAlsNm= metRprsAlsNm;
		this.setIsSet_metRprsAlsNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metRprsMbhNm= false;
	protected final boolean isSet_metRprsMbhNm(){
		return this.isSet_metRprsMbhNm;
	}
	private void setIsSet_metRprsMbhNm(boolean value){
		this.isSet_metRprsMbhNm= value;
	}
	/**
	 * 모임대표회원명
	 */
	@XmlTransient
	public String getMetRprsMbhNm(){
		return this.metRprsMbhNm;
	}
	
	/**
	 * 모임대표회원명
	 * 
	 * @param metRprsMbhNm 모임대표회원명
	 */
	public void setMetRprsMbhNm(String metRprsMbhNm){
		this.metRprsMbhNm= metRprsMbhNm;
		this.setIsSet_metRprsMbhNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metRprsImgUrlNm= false;
	protected final boolean isSet_metRprsImgUrlNm(){
		return this.isSet_metRprsImgUrlNm;
	}
	private void setIsSet_metRprsImgUrlNm(boolean value){
		this.isSet_metRprsImgUrlNm= value;
	}
	/**
	 * 모임대표이미지URL명
	 */
	@XmlTransient
	public String getMetRprsImgUrlNm(){
		return this.metRprsImgUrlNm;
	}
	
	/**
	 * 모임대표이미지URL명
	 * 
	 * @param metRprsImgUrlNm 모임대표이미지URL명
	 */
	public void setMetRprsImgUrlNm(String metRprsImgUrlNm){
		this.metRprsImgUrlNm= metRprsImgUrlNm;
		this.setIsSet_metRprsImgUrlNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_nxtMetMbhAlsNm= false;
	protected final boolean isSet_nxtMetMbhAlsNm(){
		return this.isSet_nxtMetMbhAlsNm;
	}
	private void setIsSet_nxtMetMbhAlsNm(boolean value){
		this.isSet_nxtMetMbhAlsNm= value;
	}
	/**
	 * 다음모임회원별칭명
	 */
	@XmlTransient
	public String getNxtMetMbhAlsNm(){
		return this.nxtMetMbhAlsNm;
	}
	
	/**
	 * 다음모임회원별칭명
	 * 
	 * @param nxtMetMbhAlsNm 다음모임회원별칭명
	 */
	public void setNxtMetMbhAlsNm(String nxtMetMbhAlsNm){
		this.nxtMetMbhAlsNm= nxtMetMbhAlsNm;
		this.setIsSet_nxtMetMbhAlsNm(true);
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
	 * 모임통장.회원.정보.목록.조회.DBM.출력.IO
	 */
	@XmlTransient
	public List<MetPbokMbhInfListInq_DODT> getGrid(){
		return grid;
	}
	
	/**
	 * 모임통장.회원.정보.목록.조회.DBM.출력.IO
	 * 
	 * @param grid 모임통장.회원.정보.목록.조회.DBM.출력.IO
	 */
	@JsonSetter("grid")
	public void setGrid(List<MetPbokMbhInfListInq_DODT> grid){
		this.grid= grid;
		this.setIsSet_grid(true);
	}
	
	public void setGrid(MetPbokMbhInfListInq_DODT... items){
		List<MetPbokMbhInfListInq_DODT> _items= new ArrayList<>();
		if ( items!= null && items.length> 0){
			for( MetPbokMbhInfListInq_DODT item: items ){
				_items.add(item);
			}
		}
		this.setGrid(_items);
	}
				
	@Override
	public MetPbokMbhInfInq_DODT clone(){
		try{
			MetPbokMbhInfInq_DODT object= (MetPbokMbhInfInq_DODT)super.clone();
			if ( this.grid== null ) object.grid= null;
			else{
				List<MetPbokMbhInfListInq_DODT> clonedList= new ArrayList<>(this.grid.size());
				for( MetPbokMbhInfListInq_DODT item : grid ){
					clonedList.add((MetPbokMbhInfListInq_DODT)item.clone());
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
		
		result= prime * result + ((this.metMngNo==null)?0:this.metMngNo.hashCode());
		result= prime * result + ((this.ebnkUtzpeNo==null)?0:this.ebnkUtzpeNo.hashCode());
		result= prime * result + ((this.metCtrStcd==null)?0:this.metCtrStcd.hashCode());
		result= prime * result + ((this.metCtrStcdNm==null)?0:this.metCtrStcdNm.hashCode());
		result= prime * result + ((this.metPbokDscd==null)?0:this.metPbokDscd.hashCode());
		result= prime * result + ((this.metPbokDscdNm==null)?0:this.metPbokDscdNm.hashCode());
		result= prime * result + ((this.metNm==null)?0:this.metNm.hashCode());
		result= prime * result + ((this.rcvBkwAcno==null)?0:this.rcvBkwAcno.hashCode());
		result= prime * result + ((this.cusUsgBkwAcno==null)?0:this.cusUsgBkwAcno.hashCode());
		result= prime * result + ((this.itcsno==null)?0:this.itcsno.hashCode());
		result= prime * result + ((this.cusKorlNm==null)?0:this.cusKorlNm.hashCode());
		result= prime * result + ((this.cusBkpnNm==null)?0:this.cusBkpnNm.hashCode());
		result= prime * result + ((this.ctBal==null)?0:this.ctBal.hashCode());
		result= prime * result + ((this.payAvlBal==null)?0:this.payAvlBal.hashCode());
		result= prime * result + ((this.pdcd==null)?0:this.pdcd.hashCode());
		result= prime * result + ((this.pdcdKorlNm==null)?0:this.pdcdKorlNm.hashCode());
		result= prime * result + ((this.prdKorlAbrNm==null)?0:this.prdKorlAbrNm.hashCode());
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
		result= prime * result + ((this.metBscImgUrlNm==null)?0:this.metBscImgUrlNm.hashCode());
		result= prime * result + ((this.metMbhRgsCnt==null)?0:this.metMbhRgsCnt.hashCode());
		result= prime * result + ((this.metMbhScssCnt==null)?0:this.metMbhScssCnt.hashCode());
		result= prime * result + ((this.metRprsAlsNm==null)?0:this.metRprsAlsNm.hashCode());
		result= prime * result + ((this.metRprsMbhNm==null)?0:this.metRprsMbhNm.hashCode());
		result= prime * result + ((this.metRprsImgUrlNm==null)?0:this.metRprsImgUrlNm.hashCode());
		result= prime * result + ((this.nxtMetMbhAlsNm==null)?0:this.nxtMetMbhAlsNm.hashCode());
		result= prime * result + ((this.gridCnt==null)?0:this.gridCnt.hashCode());
		result= prime * result + ((this.grid==null)?0:this.grid.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MetPbokMbhInfInq_DODT other= (MetPbokMbhInfInq_DODT)obj;
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
			Object _cusUsgBkwAcno= getCusUsgBkwAcno();
			Object __cusUsgBkwAcno= other.getCusUsgBkwAcno();
			if ( _cusUsgBkwAcno== null ) { if ( __cusUsgBkwAcno!= null ) return false; }
			else if ( !_cusUsgBkwAcno.equals(__cusUsgBkwAcno) ) return false;
		}
		{
			Object _itcsno= getItcsno();
			Object __itcsno= other.getItcsno();
			if ( _itcsno== null ) { if ( __itcsno!= null ) return false; }
			else if ( !_itcsno.equals(__itcsno) ) return false;
		}
		{
			Object _cusKorlNm= getCusKorlNm();
			Object __cusKorlNm= other.getCusKorlNm();
			if ( _cusKorlNm== null ) { if ( __cusKorlNm!= null ) return false; }
			else if ( !_cusKorlNm.equals(__cusKorlNm) ) return false;
		}
		{
			Object _cusBkpnNm= getCusBkpnNm();
			Object __cusBkpnNm= other.getCusBkpnNm();
			if ( _cusBkpnNm== null ) { if ( __cusBkpnNm!= null ) return false; }
			else if ( !_cusBkpnNm.equals(__cusBkpnNm) ) return false;
		}
		{
			Object _ctBal= getCtBal();
			Object __ctBal= other.getCtBal();
			if ( _ctBal== null ) { if ( __ctBal!= null ) return false; }
			else if ( !_ctBal.equals(__ctBal) ) return false;
		}
		{
			Object _payAvlBal= getPayAvlBal();
			Object __payAvlBal= other.getPayAvlBal();
			if ( _payAvlBal== null ) { if ( __payAvlBal!= null ) return false; }
			else if ( !_payAvlBal.equals(__payAvlBal) ) return false;
		}
		{
			Object _pdcd= getPdcd();
			Object __pdcd= other.getPdcd();
			if ( _pdcd== null ) { if ( __pdcd!= null ) return false; }
			else if ( !_pdcd.equals(__pdcd) ) return false;
		}
		{
			Object _pdcdKorlNm= getPdcdKorlNm();
			Object __pdcdKorlNm= other.getPdcdKorlNm();
			if ( _pdcdKorlNm== null ) { if ( __pdcdKorlNm!= null ) return false; }
			else if ( !_pdcdKorlNm.equals(__pdcdKorlNm) ) return false;
		}
		{
			Object _prdKorlAbrNm= getPrdKorlAbrNm();
			Object __prdKorlAbrNm= other.getPrdKorlAbrNm();
			if ( _prdKorlAbrNm== null ) { if ( __prdKorlAbrNm!= null ) return false; }
			else if ( !_prdKorlAbrNm.equals(__prdKorlAbrNm) ) return false;
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
			Object _metBscImgUrlNm= getMetBscImgUrlNm();
			Object __metBscImgUrlNm= other.getMetBscImgUrlNm();
			if ( _metBscImgUrlNm== null ) { if ( __metBscImgUrlNm!= null ) return false; }
			else if ( !_metBscImgUrlNm.equals(__metBscImgUrlNm) ) return false;
		}
		{
			Object _metMbhRgsCnt= getMetMbhRgsCnt();
			Object __metMbhRgsCnt= other.getMetMbhRgsCnt();
			if ( _metMbhRgsCnt== null ) { if ( __metMbhRgsCnt!= null ) return false; }
			else if ( !_metMbhRgsCnt.equals(__metMbhRgsCnt) ) return false;
		}
		{
			Object _metMbhScssCnt= getMetMbhScssCnt();
			Object __metMbhScssCnt= other.getMetMbhScssCnt();
			if ( _metMbhScssCnt== null ) { if ( __metMbhScssCnt!= null ) return false; }
			else if ( !_metMbhScssCnt.equals(__metMbhScssCnt) ) return false;
		}
		{
			Object _metRprsAlsNm= getMetRprsAlsNm();
			Object __metRprsAlsNm= other.getMetRprsAlsNm();
			if ( _metRprsAlsNm== null ) { if ( __metRprsAlsNm!= null ) return false; }
			else if ( !_metRprsAlsNm.equals(__metRprsAlsNm) ) return false;
		}
		{
			Object _metRprsMbhNm= getMetRprsMbhNm();
			Object __metRprsMbhNm= other.getMetRprsMbhNm();
			if ( _metRprsMbhNm== null ) { if ( __metRprsMbhNm!= null ) return false; }
			else if ( !_metRprsMbhNm.equals(__metRprsMbhNm) ) return false;
		}
		{
			Object _metRprsImgUrlNm= getMetRprsImgUrlNm();
			Object __metRprsImgUrlNm= other.getMetRprsImgUrlNm();
			if ( _metRprsImgUrlNm== null ) { if ( __metRprsImgUrlNm!= null ) return false; }
			else if ( !_metRprsImgUrlNm.equals(__metRprsImgUrlNm) ) return false;
		}
		{
			Object _nxtMetMbhAlsNm= getNxtMetMbhAlsNm();
			Object __nxtMetMbhAlsNm= other.getNxtMetMbhAlsNm();
			if ( _nxtMetMbhAlsNm== null ) { if ( __nxtMetMbhAlsNm!= null ) return false; }
			else if ( !_nxtMetMbhAlsNm.equals(__nxtMetMbhAlsNm) ) return false;
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
	
		sb.append("\n[").append(MetPbokMbhInfInq_DODT.class.getName()).append(":\n");
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
		sb.append("\tcusUsgBkwAcno: ");
		sb.append(cusUsgBkwAcno==null?"null":getCusUsgBkwAcno());
		sb.append("\n");
		sb.append("\titcsno: ");
		sb.append(itcsno==null?"null":getItcsno());
		sb.append("\n");
		sb.append("\tcusKorlNm: ");
		sb.append(cusKorlNm==null?"null":getCusKorlNm());
		sb.append("\n");
		sb.append("\tcusBkpnNm: ");
		sb.append(cusBkpnNm==null?"null":getCusBkpnNm());
		sb.append("\n");
		sb.append("\tctBal: ");
		sb.append(ctBal==null?"null":getCtBal());
		sb.append("\n");
		sb.append("\tpayAvlBal: ");
		sb.append(payAvlBal==null?"null":getPayAvlBal());
		sb.append("\n");
		sb.append("\tpdcd: ");
		sb.append(pdcd==null?"null":getPdcd());
		sb.append("\n");
		sb.append("\tpdcdKorlNm: ");
		sb.append(pdcdKorlNm==null?"null":getPdcdKorlNm());
		sb.append("\n");
		sb.append("\tprdKorlAbrNm: ");
		sb.append(prdKorlAbrNm==null?"null":getPrdKorlAbrNm());
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
		sb.append("\tmetBscImgUrlNm: ");
		sb.append(metBscImgUrlNm==null?"null":getMetBscImgUrlNm());
		sb.append("\n");
		sb.append("\tmetMbhRgsCnt: ");
		sb.append(metMbhRgsCnt==null?"null":getMetMbhRgsCnt());
		sb.append("\n");
		sb.append("\tmetMbhScssCnt: ");
		sb.append(metMbhScssCnt==null?"null":getMetMbhScssCnt());
		sb.append("\n");
		sb.append("\tmetRprsAlsNm: ");
		sb.append(metRprsAlsNm==null?"null":getMetRprsAlsNm());
		sb.append("\n");
		sb.append("\tmetRprsMbhNm: ");
		sb.append(metRprsMbhNm==null?"null":getMetRprsMbhNm());
		sb.append("\n");
		sb.append("\tmetRprsImgUrlNm: ");
		sb.append(metRprsImgUrlNm==null?"null":getMetRprsImgUrlNm());
		sb.append("\n");
		sb.append("\tnxtMetMbhAlsNm: ");
		sb.append(nxtMetMbhAlsNm==null?"null":getNxtMetMbhAlsNm());
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
		
		messageLen+= 9; /* metMngNo */
		messageLen+= 13; /* ebnkUtzpeNo */
		messageLen+= 2; /* metCtrStcd */
		messageLen+= 50; /* metCtrStcdNm */
		messageLen+= 1; /* metPbokDscd */
		messageLen+= 50; /* metPbokDscdNm */
		messageLen+= 100; /* metNm */
		messageLen+= 20; /* rcvBkwAcno */
		messageLen+= 20; /* cusUsgBkwAcno */
		messageLen+= 11; /* itcsno */
		messageLen+= 100; /* cusKorlNm */
		messageLen+= 40; /* cusBkpnNm */
		messageLen+= 19; /* ctBal */
		messageLen+= 19; /* payAvlBal */
		messageLen+= 9; /* pdcd */
		messageLen+= 100; /* pdcdKorlNm */
		messageLen+= 50; /* prdKorlAbrNm */
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
		messageLen+= 100; /* metBscImgUrlNm */
		messageLen+= 6; /* metMbhRgsCnt */
		messageLen+= 6; /* metMbhScssCnt */
		messageLen+= 60; /* metRprsAlsNm */
		messageLen+= 60; /* metRprsMbhNm */
		messageLen+= 100; /* metRprsImgUrlNm */
		messageLen+= 60; /* nxtMetMbhAlsNm */
		messageLen+= 5; /* gridCnt */
		{/*grid*/
			int size=getGridCnt();
			int count= grid == null ? 0 : grid.size();
			int min= size > count?count:size;
			MetPbokMbhInfListInq_DODT emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					MetPbokMbhInfListInq_DODT element= grid.get(i);
					if ( element != null && !(element instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= element==null?0:( (Predictable)element).predictMessageLength();
				}else{
					if ( emptyElement== null ) emptyElement= new com.skbank.sml.fns.mpb.dto.MetPbokMbhInfListInq_DODT();
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
	
		list.add("metMngNo");
		list.add("ebnkUtzpeNo");
		list.add("metCtrStcd");
		list.add("metCtrStcdNm");
		list.add("metPbokDscd");
		list.add("metPbokDscdNm");
		list.add("metNm");
		list.add("rcvBkwAcno");
		list.add("cusUsgBkwAcno");
		list.add("itcsno");
		list.add("cusKorlNm");
		list.add("cusBkpnNm");
		list.add("ctBal");
		list.add("payAvlBal");
		list.add("pdcd");
		list.add("pdcdKorlNm");
		list.add("prdKorlAbrNm");
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
		list.add("metBscImgUrlNm");
		list.add("metMbhRgsCnt");
		list.add("metMbhScssCnt");
		list.add("metRprsAlsNm");
		list.add("metRprsMbhNm");
		list.add("metRprsImgUrlNm");
		list.add("nxtMetMbhAlsNm");
		list.add("gridCnt");
		list.add("grid");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("metMngNo", get("metMngNo"));
		map.put("ebnkUtzpeNo", get("ebnkUtzpeNo"));
		map.put("metCtrStcd", get("metCtrStcd"));
		map.put("metCtrStcdNm", get("metCtrStcdNm"));
		map.put("metPbokDscd", get("metPbokDscd"));
		map.put("metPbokDscdNm", get("metPbokDscdNm"));
		map.put("metNm", get("metNm"));
		map.put("rcvBkwAcno", get("rcvBkwAcno"));
		map.put("cusUsgBkwAcno", get("cusUsgBkwAcno"));
		map.put("itcsno", get("itcsno"));
		map.put("cusKorlNm", get("cusKorlNm"));
		map.put("cusBkpnNm", get("cusBkpnNm"));
		map.put("ctBal", get("ctBal"));
		map.put("payAvlBal", get("payAvlBal"));
		map.put("pdcd", get("pdcd"));
		map.put("pdcdKorlNm", get("pdcdKorlNm"));
		map.put("prdKorlAbrNm", get("prdKorlAbrNm"));
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
		map.put("metBscImgUrlNm", get("metBscImgUrlNm"));
		map.put("metMbhRgsCnt", get("metMbhRgsCnt"));
		map.put("metMbhScssCnt", get("metMbhScssCnt"));
		map.put("metRprsAlsNm", get("metRprsAlsNm"));
		map.put("metRprsMbhNm", get("metRprsMbhNm"));
		map.put("metRprsImgUrlNm", get("metRprsImgUrlNm"));
		map.put("nxtMetMbhAlsNm", get("nxtMetMbhAlsNm"));
		map.put("gridCnt", get("gridCnt"));
		map.put("grid", get("grid"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
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
		case -2031113431:/* cusUsgBkwAcno */
			return getCusUsgBkwAcno();
		case -1178714660:/* itcsno */
			return getItcsno();
		case 437921438:/* cusKorlNm */
			return getCusKorlNm();
		case 176507335:/* cusBkpnNm */
			return getCusBkpnNm();
		case 94950876:/* ctBal */
			return getCtBal();
		case -1330609026:/* payAvlBal */
			return getPayAvlBal();
		case 3435861:/* pdcd */
			return getPdcd();
		case 657289906:/* pdcdKorlNm */
			return getPdcdKorlNm();
		case -578609776:/* prdKorlAbrNm */
			return getPrdKorlAbrNm();
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
		case 300784225:/* metBscImgUrlNm */
			return getMetBscImgUrlNm();
		case 574880898:/* metMbhRgsCnt */
			return getMetMbhRgsCnt();
		case 1415814306:/* metMbhScssCnt */
			return getMetMbhScssCnt();
		case -48308916:/* metRprsAlsNm */
			return getMetRprsAlsNm();
		case -37535145:/* metRprsMbhNm */
			return getMetRprsMbhNm();
		case 1251382182:/* metRprsImgUrlNm */
			return getMetRprsImgUrlNm();
		case -468170874:/* nxtMetMbhAlsNm */
			return getNxtMetMbhAlsNm();
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
		case -2031113431:/* cusUsgBkwAcno */
			setCusUsgBkwAcno((String)value);
			break;
		case -1178714660:/* itcsno */
			setItcsno((String)value);
			break;
		case 437921438:/* cusKorlNm */
			setCusKorlNm((String)value);
			break;
		case 176507335:/* cusBkpnNm */
			setCusBkpnNm((String)value);
			break;
		case 94950876:/* ctBal */
			if ( value instanceof String ){
				setCtBal((String)value);
			}
			else if ( value instanceof Double ){
				setCtBal((Double)value);
			}
			else if ( value instanceof Long ){
				setCtBal((Long)value);
			}
			else{
				setCtBal((BigDecimal)value);
			}
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
		case 3435861:/* pdcd */
			setPdcd((String)value);
			break;
		case 657289906:/* pdcdKorlNm */
			setPdcdKorlNm((String)value);
			break;
		case -578609776:/* prdKorlAbrNm */
			setPrdKorlAbrNm((String)value);
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
		case 300784225:/* metBscImgUrlNm */
			setMetBscImgUrlNm((String)value);
			break;
		case 574880898:/* metMbhRgsCnt */
			setMetMbhRgsCnt((Integer)value);
			break;
		case 1415814306:/* metMbhScssCnt */
			setMetMbhScssCnt((Integer)value);
			break;
		case -48308916:/* metRprsAlsNm */
			setMetRprsAlsNm((String)value);
			break;
		case -37535145:/* metRprsMbhNm */
			setMetRprsMbhNm((String)value);
			break;
		case 1251382182:/* metRprsImgUrlNm */
			setMetRprsImgUrlNm((String)value);
			break;
		case -468170874:/* nxtMetMbhAlsNm */
			setNxtMetMbhAlsNm((String)value);
			break;
		case 287338563:/* gridCnt */
			setGridCnt((Integer)value);
			break;
		case 3181382:/* grid */
			setGrid((List<MetPbokMbhInfListInq_DODT>)value);
			break;
		default:
			break;
		}
	}
	
}
