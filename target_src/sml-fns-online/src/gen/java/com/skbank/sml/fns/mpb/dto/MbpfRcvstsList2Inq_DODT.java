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
	"trnDt", "trnSrno", "trnBkcd", "trbkCdNm", "ptnBkwAcno", "trnTm", "dpsRapDscd", "dpsRapDscdNm", "metTrnStcd", "metTrnStcdNm", "rcvMbhNm", "mbpfPymAm", "mbpfPmtgtAm", "metMbpfXmpAm", "inqOtlnTxt"
	, "pbokPrngOtlnTxt", "metTrnMemoTxt", "mdKdcd", "mdKdcdNm", "metmbWdrYn", "ortrDt", "ortrSrno"
}, name="MbpfRcvstsList2Inq_DODT")
@XmlRootElement(name="MbpfRcvstsList2Inq_DODT")
@BxmCategory(logicalName="회비.입금현황.목록2.조회.DBM.출력.IO", description="") 
public class MbpfRcvstsList2Inq_DODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -1463461604L;
	
	
	
	/**
	 * 거래일자
	 */
	@ApiModelProperty(
		name = "trnDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("trnDt")
	@BxmOmm_Field(length=8, decimal=0, description="거래일자", align="right", fill="0")
	private String trnDt= "";
	
	
	/**
	 * 거래일련번호
	 */
	@ApiModelProperty(
		name = "trnSrno"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("trnSrno")
	@BxmOmm_Field(length=8, decimal=0, description="거래일련번호", align="right", fill="0")
	private Integer trnSrno= 0;
	
	
	/**
	 * 거래은행코드
	 */
	@ApiModelProperty(
		name = "trnBkcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("trnBkcd")
	@BxmOmm_Field(length=3, decimal=0, description="거래은행코드", align="left", fill="")
	private String trnBkcd= "";
	
	
	/**
	 * 거래은행코드명
	 */
	@ApiModelProperty(
		name = "trbkCdNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("trbkCdNm")
	@BxmOmm_Field(length=50, decimal=0, description="거래은행코드명", align="left", fill="")
	private String trbkCdNm= "";
	
	
	/**
	 * 상대전행계좌번호
	 */
	@ApiModelProperty(
		name = "ptnBkwAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ptnBkwAcno")
	@BxmOmm_Field(length=20, decimal=0, description="상대전행계좌번호", align="left", fill="")
	private String ptnBkwAcno= "";
	
	
	/**
	 * 거래시각
	 */
	@ApiModelProperty(
		name = "trnTm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("trnTm")
	@BxmOmm_Field(length=6, decimal=0, description="거래시각", align="left", fill="")
	private String trnTm= "";
	
	
	/**
	 * 수신입지급구분코드
	 */
	@ApiModelProperty(
		name = "dpsRapDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dpsRapDscd")
	@BxmOmm_Field(length=1, decimal=0, description="수신입지급구분코드", align="left", fill="")
	private String dpsRapDscd= "";
	
	
	/**
	 * 수신입지급구분코드명
	 */
	@ApiModelProperty(
		name = "dpsRapDscdNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dpsRapDscdNm")
	@BxmOmm_Field(length=50, decimal=0, description="수신입지급구분코드명", align="left", fill="")
	private String dpsRapDscdNm= "";
	
	
	/**
	 * 모임거래상태코드
	 */
	@ApiModelProperty(
		name = "metTrnStcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metTrnStcd")
	@BxmOmm_Field(length=2, decimal=0, description="모임거래상태코드", align="left", fill="")
	private String metTrnStcd= "";
	
	
	/**
	 * 모임거래상태코드명
	 */
	@ApiModelProperty(
		name = "metTrnStcdNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metTrnStcdNm")
	@BxmOmm_Field(length=50, decimal=0, description="모임거래상태코드명", align="left", fill="")
	private String metTrnStcdNm= "";
	
	
	/**
	 * 입금회원명
	 */
	@ApiModelProperty(
		name = "rcvMbhNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rcvMbhNm")
	@BxmOmm_Field(length=60, decimal=0, description="입금회원명", align="left", fill="")
	private String rcvMbhNm= "";
	
	
	/**
	 * 회비납부금액
	 */
	@ApiModelProperty(
		name = "mbpfPymAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("mbpfPymAm")
	@BxmOmm_Field(length=19, decimal=3, description="회비납부금액", align="right", fill="0")
	private BigDecimal mbpfPymAm= new BigDecimal("0");
	
	
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
	 * 모임회비면제금액
	 */
	@ApiModelProperty(
		name = "metMbpfXmpAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("metMbpfXmpAm")
	@BxmOmm_Field(length=19, decimal=3, description="모임회비면제금액", align="right", fill="0")
	private BigDecimal metMbpfXmpAm= new BigDecimal("0");
	
	
	/**
	 * 조회적요내용
	 */
	@ApiModelProperty(
		name = "inqOtlnTxt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("inqOtlnTxt")
	@BxmOmm_Field(length=10, decimal=0, description="조회적요내용", align="left", fill="")
	private String inqOtlnTxt= "";
	
	
	/**
	 * 통장인자적요내용
	 */
	@ApiModelProperty(
		name = "pbokPrngOtlnTxt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("pbokPrngOtlnTxt")
	@BxmOmm_Field(length=100, decimal=0, description="통장인자적요내용", align="left", fill="")
	private String pbokPrngOtlnTxt= "";
	
	
	/**
	 * 모임거래메모내용
	 */
	@ApiModelProperty(
		name = "metTrnMemoTxt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metTrnMemoTxt")
	@BxmOmm_Field(length=40, decimal=0, description="모임거래메모내용", align="left", fill="")
	private String metTrnMemoTxt= "";
	
	
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
	 * 매체종류코드명
	 */
	@ApiModelProperty(
		name = "mdKdcdNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("mdKdcdNm")
	@BxmOmm_Field(length=60, decimal=0, description="매체종류코드명", align="left", fill="")
	private String mdKdcdNm= "";
	
	
	/**
	 * 모임원출금여부
	 */
	@ApiModelProperty(
		name = "metmbWdrYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metmbWdrYn")
	@BxmOmm_Field(length=1, decimal=0, description="모임원출금여부", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=C","EIMS_DATA_TYPE=S"})
	private String metmbWdrYn= "";
	
	
	/**
	 * 원거래일자
	 */
	@ApiModelProperty(
		name = "ortrDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ortrDt")
	@BxmOmm_Field(length=8, decimal=0, description="원거래일자", align="left", fill="")
	private String ortrDt= "";
	
	
	/**
	 * 원거래일련번호
	 */
	@ApiModelProperty(
		name = "ortrSrno"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("ortrSrno")
	@BxmOmm_Field(length=8, decimal=0, description="원거래일련번호", align="right", fill="0")
	private Integer ortrSrno= 0;
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_trnDt= false;
	protected final boolean isSet_trnDt(){
		return this.isSet_trnDt;
	}
	private void setIsSet_trnDt(boolean value){
		this.isSet_trnDt= value;
	}
	/**
	 * 거래일자
	 */
	@XmlTransient
	public String getTrnDt(){
		return this.trnDt;
	}
	
	/**
	 * 거래일자
	 * 
	 * @param trnDt 거래일자
	 */
	public void setTrnDt(String trnDt){
		this.trnDt= trnDt;
		this.setIsSet_trnDt(true);
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
	private boolean isSet_trnBkcd= false;
	protected final boolean isSet_trnBkcd(){
		return this.isSet_trnBkcd;
	}
	private void setIsSet_trnBkcd(boolean value){
		this.isSet_trnBkcd= value;
	}
	/**
	 * 거래은행코드
	 */
	@XmlTransient
	public String getTrnBkcd(){
		return this.trnBkcd;
	}
	
	/**
	 * 거래은행코드
	 * 
	 * @param trnBkcd 거래은행코드
	 */
	public void setTrnBkcd(String trnBkcd){
		this.trnBkcd= trnBkcd;
		this.setIsSet_trnBkcd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_trbkCdNm= false;
	protected final boolean isSet_trbkCdNm(){
		return this.isSet_trbkCdNm;
	}
	private void setIsSet_trbkCdNm(boolean value){
		this.isSet_trbkCdNm= value;
	}
	/**
	 * 거래은행코드명
	 */
	@XmlTransient
	public String getTrbkCdNm(){
		return this.trbkCdNm;
	}
	
	/**
	 * 거래은행코드명
	 * 
	 * @param trbkCdNm 거래은행코드명
	 */
	public void setTrbkCdNm(String trbkCdNm){
		this.trbkCdNm= trbkCdNm;
		this.setIsSet_trbkCdNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ptnBkwAcno= false;
	protected final boolean isSet_ptnBkwAcno(){
		return this.isSet_ptnBkwAcno;
	}
	private void setIsSet_ptnBkwAcno(boolean value){
		this.isSet_ptnBkwAcno= value;
	}
	/**
	 * 상대전행계좌번호
	 */
	@XmlTransient
	public String getPtnBkwAcno(){
		return this.ptnBkwAcno;
	}
	
	/**
	 * 상대전행계좌번호
	 * 
	 * @param ptnBkwAcno 상대전행계좌번호
	 */
	public void setPtnBkwAcno(String ptnBkwAcno){
		this.ptnBkwAcno= ptnBkwAcno;
		this.setIsSet_ptnBkwAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_trnTm= false;
	protected final boolean isSet_trnTm(){
		return this.isSet_trnTm;
	}
	private void setIsSet_trnTm(boolean value){
		this.isSet_trnTm= value;
	}
	/**
	 * 거래시각
	 */
	@XmlTransient
	public String getTrnTm(){
		return this.trnTm;
	}
	
	/**
	 * 거래시각
	 * 
	 * @param trnTm 거래시각
	 */
	public void setTrnTm(String trnTm){
		this.trnTm= trnTm;
		this.setIsSet_trnTm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dpsRapDscd= false;
	protected final boolean isSet_dpsRapDscd(){
		return this.isSet_dpsRapDscd;
	}
	private void setIsSet_dpsRapDscd(boolean value){
		this.isSet_dpsRapDscd= value;
	}
	/**
	 * 수신입지급구분코드
	 */
	@XmlTransient
	public String getDpsRapDscd(){
		return this.dpsRapDscd;
	}
	
	/**
	 * 수신입지급구분코드
	 * 
	 * @param dpsRapDscd 수신입지급구분코드
	 */
	public void setDpsRapDscd(String dpsRapDscd){
		this.dpsRapDscd= dpsRapDscd;
		this.setIsSet_dpsRapDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dpsRapDscdNm= false;
	protected final boolean isSet_dpsRapDscdNm(){
		return this.isSet_dpsRapDscdNm;
	}
	private void setIsSet_dpsRapDscdNm(boolean value){
		this.isSet_dpsRapDscdNm= value;
	}
	/**
	 * 수신입지급구분코드명
	 */
	@XmlTransient
	public String getDpsRapDscdNm(){
		return this.dpsRapDscdNm;
	}
	
	/**
	 * 수신입지급구분코드명
	 * 
	 * @param dpsRapDscdNm 수신입지급구분코드명
	 */
	public void setDpsRapDscdNm(String dpsRapDscdNm){
		this.dpsRapDscdNm= dpsRapDscdNm;
		this.setIsSet_dpsRapDscdNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metTrnStcd= false;
	protected final boolean isSet_metTrnStcd(){
		return this.isSet_metTrnStcd;
	}
	private void setIsSet_metTrnStcd(boolean value){
		this.isSet_metTrnStcd= value;
	}
	/**
	 * 모임거래상태코드
	 */
	@XmlTransient
	public String getMetTrnStcd(){
		return this.metTrnStcd;
	}
	
	/**
	 * 모임거래상태코드
	 * 
	 * @param metTrnStcd 모임거래상태코드
	 */
	public void setMetTrnStcd(String metTrnStcd){
		this.metTrnStcd= metTrnStcd;
		this.setIsSet_metTrnStcd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metTrnStcdNm= false;
	protected final boolean isSet_metTrnStcdNm(){
		return this.isSet_metTrnStcdNm;
	}
	private void setIsSet_metTrnStcdNm(boolean value){
		this.isSet_metTrnStcdNm= value;
	}
	/**
	 * 모임거래상태코드명
	 */
	@XmlTransient
	public String getMetTrnStcdNm(){
		return this.metTrnStcdNm;
	}
	
	/**
	 * 모임거래상태코드명
	 * 
	 * @param metTrnStcdNm 모임거래상태코드명
	 */
	public void setMetTrnStcdNm(String metTrnStcdNm){
		this.metTrnStcdNm= metTrnStcdNm;
		this.setIsSet_metTrnStcdNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rcvMbhNm= false;
	protected final boolean isSet_rcvMbhNm(){
		return this.isSet_rcvMbhNm;
	}
	private void setIsSet_rcvMbhNm(boolean value){
		this.isSet_rcvMbhNm= value;
	}
	/**
	 * 입금회원명
	 */
	@XmlTransient
	public String getRcvMbhNm(){
		return this.rcvMbhNm;
	}
	
	/**
	 * 입금회원명
	 * 
	 * @param rcvMbhNm 입금회원명
	 */
	public void setRcvMbhNm(String rcvMbhNm){
		this.rcvMbhNm= rcvMbhNm;
		this.setIsSet_rcvMbhNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mbpfPymAm= false;
	protected final boolean isSet_mbpfPymAm(){
		return this.isSet_mbpfPymAm;
	}
	private void setIsSet_mbpfPymAm(boolean value){
		this.isSet_mbpfPymAm= value;
	}
	/**
	 * 회비납부금액
	 * BigDecimal - Double value setter
	 *
	 * @Param mbpfPymAm 회비납부금액
	 */
	public void setMbpfPymAm(double mbpfPymAm) {
		setMbpfPymAm(BigDecimal.valueOf(mbpfPymAm));
	}
	/**
	 * 회비납부금액
	 * BigDecimal - Long value setter
	 *
	 * @Param mbpfPymAm 회비납부금액
	 */
	public void setMbpfPymAm(long mbpfPymAm) {
		setMbpfPymAm(BigDecimal.valueOf(mbpfPymAm));
	}
	/**
	 * 회비납부금액
	 * BigDecimal - String value setter
	 *
	 * @Param mbpfPymAm 회비납부금액
	 */
	public void setMbpfPymAm(String mbpfPymAm) {
		setMbpfPymAm(new BigDecimal(mbpfPymAm));
	}
	/**
	 * 회비납부금액
	 */
	@XmlTransient
	public BigDecimal getMbpfPymAm(){
		return this.mbpfPymAm;
	}
	
	/**
	 * 회비납부금액
	 * 
	 * @param mbpfPymAm 회비납부금액
	 */
	@JsonSetter("mbpfPymAm")
	public void setMbpfPymAm(BigDecimal mbpfPymAm){
		this.mbpfPymAm= mbpfPymAm;
		this.setIsSet_mbpfPymAm(true);
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
	private boolean isSet_metMbpfXmpAm= false;
	protected final boolean isSet_metMbpfXmpAm(){
		return this.isSet_metMbpfXmpAm;
	}
	private void setIsSet_metMbpfXmpAm(boolean value){
		this.isSet_metMbpfXmpAm= value;
	}
	/**
	 * 모임회비면제금액
	 * BigDecimal - Double value setter
	 *
	 * @Param metMbpfXmpAm 모임회비면제금액
	 */
	public void setMetMbpfXmpAm(double metMbpfXmpAm) {
		setMetMbpfXmpAm(BigDecimal.valueOf(metMbpfXmpAm));
	}
	/**
	 * 모임회비면제금액
	 * BigDecimal - Long value setter
	 *
	 * @Param metMbpfXmpAm 모임회비면제금액
	 */
	public void setMetMbpfXmpAm(long metMbpfXmpAm) {
		setMetMbpfXmpAm(BigDecimal.valueOf(metMbpfXmpAm));
	}
	/**
	 * 모임회비면제금액
	 * BigDecimal - String value setter
	 *
	 * @Param metMbpfXmpAm 모임회비면제금액
	 */
	public void setMetMbpfXmpAm(String metMbpfXmpAm) {
		setMetMbpfXmpAm(new BigDecimal(metMbpfXmpAm));
	}
	/**
	 * 모임회비면제금액
	 */
	@XmlTransient
	public BigDecimal getMetMbpfXmpAm(){
		return this.metMbpfXmpAm;
	}
	
	/**
	 * 모임회비면제금액
	 * 
	 * @param metMbpfXmpAm 모임회비면제금액
	 */
	@JsonSetter("metMbpfXmpAm")
	public void setMetMbpfXmpAm(BigDecimal metMbpfXmpAm){
		this.metMbpfXmpAm= metMbpfXmpAm;
		this.setIsSet_metMbpfXmpAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_inqOtlnTxt= false;
	protected final boolean isSet_inqOtlnTxt(){
		return this.isSet_inqOtlnTxt;
	}
	private void setIsSet_inqOtlnTxt(boolean value){
		this.isSet_inqOtlnTxt= value;
	}
	/**
	 * 조회적요내용
	 */
	@XmlTransient
	public String getInqOtlnTxt(){
		return this.inqOtlnTxt;
	}
	
	/**
	 * 조회적요내용
	 * 
	 * @param inqOtlnTxt 조회적요내용
	 */
	public void setInqOtlnTxt(String inqOtlnTxt){
		this.inqOtlnTxt= inqOtlnTxt;
		this.setIsSet_inqOtlnTxt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pbokPrngOtlnTxt= false;
	protected final boolean isSet_pbokPrngOtlnTxt(){
		return this.isSet_pbokPrngOtlnTxt;
	}
	private void setIsSet_pbokPrngOtlnTxt(boolean value){
		this.isSet_pbokPrngOtlnTxt= value;
	}
	/**
	 * 통장인자적요내용
	 */
	@XmlTransient
	public String getPbokPrngOtlnTxt(){
		return this.pbokPrngOtlnTxt;
	}
	
	/**
	 * 통장인자적요내용
	 * 
	 * @param pbokPrngOtlnTxt 통장인자적요내용
	 */
	public void setPbokPrngOtlnTxt(String pbokPrngOtlnTxt){
		this.pbokPrngOtlnTxt= pbokPrngOtlnTxt;
		this.setIsSet_pbokPrngOtlnTxt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metTrnMemoTxt= false;
	protected final boolean isSet_metTrnMemoTxt(){
		return this.isSet_metTrnMemoTxt;
	}
	private void setIsSet_metTrnMemoTxt(boolean value){
		this.isSet_metTrnMemoTxt= value;
	}
	/**
	 * 모임거래메모내용
	 */
	@XmlTransient
	public String getMetTrnMemoTxt(){
		return this.metTrnMemoTxt;
	}
	
	/**
	 * 모임거래메모내용
	 * 
	 * @param metTrnMemoTxt 모임거래메모내용
	 */
	public void setMetTrnMemoTxt(String metTrnMemoTxt){
		this.metTrnMemoTxt= metTrnMemoTxt;
		this.setIsSet_metTrnMemoTxt(true);
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
	private boolean isSet_mdKdcdNm= false;
	protected final boolean isSet_mdKdcdNm(){
		return this.isSet_mdKdcdNm;
	}
	private void setIsSet_mdKdcdNm(boolean value){
		this.isSet_mdKdcdNm= value;
	}
	/**
	 * 매체종류코드명
	 */
	@XmlTransient
	public String getMdKdcdNm(){
		return this.mdKdcdNm;
	}
	
	/**
	 * 매체종류코드명
	 * 
	 * @param mdKdcdNm 매체종류코드명
	 */
	public void setMdKdcdNm(String mdKdcdNm){
		this.mdKdcdNm= mdKdcdNm;
		this.setIsSet_mdKdcdNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metmbWdrYn= false;
	protected final boolean isSet_metmbWdrYn(){
		return this.isSet_metmbWdrYn;
	}
	private void setIsSet_metmbWdrYn(boolean value){
		this.isSet_metmbWdrYn= value;
	}
	/**
	 * 모임원출금여부
	 */
	@XmlTransient
	public String getMetmbWdrYn(){
		return this.metmbWdrYn;
	}
	
	/**
	 * 모임원출금여부
	 * 
	 * @param metmbWdrYn 모임원출금여부
	 */
	public void setMetmbWdrYn(String metmbWdrYn){
		this.metmbWdrYn= metmbWdrYn;
		this.setIsSet_metmbWdrYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ortrDt= false;
	protected final boolean isSet_ortrDt(){
		return this.isSet_ortrDt;
	}
	private void setIsSet_ortrDt(boolean value){
		this.isSet_ortrDt= value;
	}
	/**
	 * 원거래일자
	 */
	@XmlTransient
	public String getOrtrDt(){
		return this.ortrDt;
	}
	
	/**
	 * 원거래일자
	 * 
	 * @param ortrDt 원거래일자
	 */
	public void setOrtrDt(String ortrDt){
		this.ortrDt= ortrDt;
		this.setIsSet_ortrDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ortrSrno= false;
	protected final boolean isSet_ortrSrno(){
		return this.isSet_ortrSrno;
	}
	private void setIsSet_ortrSrno(boolean value){
		this.isSet_ortrSrno= value;
	}
	/**
	 * 원거래일련번호
	 */
	@XmlTransient
	public Integer getOrtrSrno(){
		return this.ortrSrno;
	}
	
	/**
	 * 원거래일련번호
	 * 
	 * @param ortrSrno 원거래일련번호
	 */
	public void setOrtrSrno(Integer ortrSrno){
		this.ortrSrno= ortrSrno;
		this.setIsSet_ortrSrno(true);
	}
				
	@Override
	public MbpfRcvstsList2Inq_DODT clone(){
		try{
			MbpfRcvstsList2Inq_DODT object= (MbpfRcvstsList2Inq_DODT)super.clone();
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
		
		result= prime * result + ((this.trnDt==null)?0:this.trnDt.hashCode());
		result= prime * result + ((this.trnSrno==null)?0:this.trnSrno.hashCode());
		result= prime * result + ((this.trnBkcd==null)?0:this.trnBkcd.hashCode());
		result= prime * result + ((this.trbkCdNm==null)?0:this.trbkCdNm.hashCode());
		result= prime * result + ((this.ptnBkwAcno==null)?0:this.ptnBkwAcno.hashCode());
		result= prime * result + ((this.trnTm==null)?0:this.trnTm.hashCode());
		result= prime * result + ((this.dpsRapDscd==null)?0:this.dpsRapDscd.hashCode());
		result= prime * result + ((this.dpsRapDscdNm==null)?0:this.dpsRapDscdNm.hashCode());
		result= prime * result + ((this.metTrnStcd==null)?0:this.metTrnStcd.hashCode());
		result= prime * result + ((this.metTrnStcdNm==null)?0:this.metTrnStcdNm.hashCode());
		result= prime * result + ((this.rcvMbhNm==null)?0:this.rcvMbhNm.hashCode());
		result= prime * result + ((this.mbpfPymAm==null)?0:this.mbpfPymAm.hashCode());
		result= prime * result + ((this.mbpfPmtgtAm==null)?0:this.mbpfPmtgtAm.hashCode());
		result= prime * result + ((this.metMbpfXmpAm==null)?0:this.metMbpfXmpAm.hashCode());
		result= prime * result + ((this.inqOtlnTxt==null)?0:this.inqOtlnTxt.hashCode());
		result= prime * result + ((this.pbokPrngOtlnTxt==null)?0:this.pbokPrngOtlnTxt.hashCode());
		result= prime * result + ((this.metTrnMemoTxt==null)?0:this.metTrnMemoTxt.hashCode());
		result= prime * result + ((this.mdKdcd==null)?0:this.mdKdcd.hashCode());
		result= prime * result + ((this.mdKdcdNm==null)?0:this.mdKdcdNm.hashCode());
		result= prime * result + ((this.metmbWdrYn==null)?0:this.metmbWdrYn.hashCode());
		result= prime * result + ((this.ortrDt==null)?0:this.ortrDt.hashCode());
		result= prime * result + ((this.ortrSrno==null)?0:this.ortrSrno.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MbpfRcvstsList2Inq_DODT other= (MbpfRcvstsList2Inq_DODT)obj;
		{
			Object _trnDt= getTrnDt();
			Object __trnDt= other.getTrnDt();
			if ( _trnDt== null ) { if ( __trnDt!= null ) return false; }
			else if ( !_trnDt.equals(__trnDt) ) return false;
		}
		{
			Object _trnSrno= getTrnSrno();
			Object __trnSrno= other.getTrnSrno();
			if ( _trnSrno== null ) { if ( __trnSrno!= null ) return false; }
			else if ( !_trnSrno.equals(__trnSrno) ) return false;
		}
		{
			Object _trnBkcd= getTrnBkcd();
			Object __trnBkcd= other.getTrnBkcd();
			if ( _trnBkcd== null ) { if ( __trnBkcd!= null ) return false; }
			else if ( !_trnBkcd.equals(__trnBkcd) ) return false;
		}
		{
			Object _trbkCdNm= getTrbkCdNm();
			Object __trbkCdNm= other.getTrbkCdNm();
			if ( _trbkCdNm== null ) { if ( __trbkCdNm!= null ) return false; }
			else if ( !_trbkCdNm.equals(__trbkCdNm) ) return false;
		}
		{
			Object _ptnBkwAcno= getPtnBkwAcno();
			Object __ptnBkwAcno= other.getPtnBkwAcno();
			if ( _ptnBkwAcno== null ) { if ( __ptnBkwAcno!= null ) return false; }
			else if ( !_ptnBkwAcno.equals(__ptnBkwAcno) ) return false;
		}
		{
			Object _trnTm= getTrnTm();
			Object __trnTm= other.getTrnTm();
			if ( _trnTm== null ) { if ( __trnTm!= null ) return false; }
			else if ( !_trnTm.equals(__trnTm) ) return false;
		}
		{
			Object _dpsRapDscd= getDpsRapDscd();
			Object __dpsRapDscd= other.getDpsRapDscd();
			if ( _dpsRapDscd== null ) { if ( __dpsRapDscd!= null ) return false; }
			else if ( !_dpsRapDscd.equals(__dpsRapDscd) ) return false;
		}
		{
			Object _dpsRapDscdNm= getDpsRapDscdNm();
			Object __dpsRapDscdNm= other.getDpsRapDscdNm();
			if ( _dpsRapDscdNm== null ) { if ( __dpsRapDscdNm!= null ) return false; }
			else if ( !_dpsRapDscdNm.equals(__dpsRapDscdNm) ) return false;
		}
		{
			Object _metTrnStcd= getMetTrnStcd();
			Object __metTrnStcd= other.getMetTrnStcd();
			if ( _metTrnStcd== null ) { if ( __metTrnStcd!= null ) return false; }
			else if ( !_metTrnStcd.equals(__metTrnStcd) ) return false;
		}
		{
			Object _metTrnStcdNm= getMetTrnStcdNm();
			Object __metTrnStcdNm= other.getMetTrnStcdNm();
			if ( _metTrnStcdNm== null ) { if ( __metTrnStcdNm!= null ) return false; }
			else if ( !_metTrnStcdNm.equals(__metTrnStcdNm) ) return false;
		}
		{
			Object _rcvMbhNm= getRcvMbhNm();
			Object __rcvMbhNm= other.getRcvMbhNm();
			if ( _rcvMbhNm== null ) { if ( __rcvMbhNm!= null ) return false; }
			else if ( !_rcvMbhNm.equals(__rcvMbhNm) ) return false;
		}
		{
			Object _mbpfPymAm= getMbpfPymAm();
			Object __mbpfPymAm= other.getMbpfPymAm();
			if ( _mbpfPymAm== null ) { if ( __mbpfPymAm!= null ) return false; }
			else if ( !_mbpfPymAm.equals(__mbpfPymAm) ) return false;
		}
		{
			Object _mbpfPmtgtAm= getMbpfPmtgtAm();
			Object __mbpfPmtgtAm= other.getMbpfPmtgtAm();
			if ( _mbpfPmtgtAm== null ) { if ( __mbpfPmtgtAm!= null ) return false; }
			else if ( !_mbpfPmtgtAm.equals(__mbpfPmtgtAm) ) return false;
		}
		{
			Object _metMbpfXmpAm= getMetMbpfXmpAm();
			Object __metMbpfXmpAm= other.getMetMbpfXmpAm();
			if ( _metMbpfXmpAm== null ) { if ( __metMbpfXmpAm!= null ) return false; }
			else if ( !_metMbpfXmpAm.equals(__metMbpfXmpAm) ) return false;
		}
		{
			Object _inqOtlnTxt= getInqOtlnTxt();
			Object __inqOtlnTxt= other.getInqOtlnTxt();
			if ( _inqOtlnTxt== null ) { if ( __inqOtlnTxt!= null ) return false; }
			else if ( !_inqOtlnTxt.equals(__inqOtlnTxt) ) return false;
		}
		{
			Object _pbokPrngOtlnTxt= getPbokPrngOtlnTxt();
			Object __pbokPrngOtlnTxt= other.getPbokPrngOtlnTxt();
			if ( _pbokPrngOtlnTxt== null ) { if ( __pbokPrngOtlnTxt!= null ) return false; }
			else if ( !_pbokPrngOtlnTxt.equals(__pbokPrngOtlnTxt) ) return false;
		}
		{
			Object _metTrnMemoTxt= getMetTrnMemoTxt();
			Object __metTrnMemoTxt= other.getMetTrnMemoTxt();
			if ( _metTrnMemoTxt== null ) { if ( __metTrnMemoTxt!= null ) return false; }
			else if ( !_metTrnMemoTxt.equals(__metTrnMemoTxt) ) return false;
		}
		{
			Object _mdKdcd= getMdKdcd();
			Object __mdKdcd= other.getMdKdcd();
			if ( _mdKdcd== null ) { if ( __mdKdcd!= null ) return false; }
			else if ( !_mdKdcd.equals(__mdKdcd) ) return false;
		}
		{
			Object _mdKdcdNm= getMdKdcdNm();
			Object __mdKdcdNm= other.getMdKdcdNm();
			if ( _mdKdcdNm== null ) { if ( __mdKdcdNm!= null ) return false; }
			else if ( !_mdKdcdNm.equals(__mdKdcdNm) ) return false;
		}
		{
			Object _metmbWdrYn= getMetmbWdrYn();
			Object __metmbWdrYn= other.getMetmbWdrYn();
			if ( _metmbWdrYn== null ) { if ( __metmbWdrYn!= null ) return false; }
			else if ( !_metmbWdrYn.equals(__metmbWdrYn) ) return false;
		}
		{
			Object _ortrDt= getOrtrDt();
			Object __ortrDt= other.getOrtrDt();
			if ( _ortrDt== null ) { if ( __ortrDt!= null ) return false; }
			else if ( !_ortrDt.equals(__ortrDt) ) return false;
		}
		{
			Object _ortrSrno= getOrtrSrno();
			Object __ortrSrno= other.getOrtrSrno();
			if ( _ortrSrno== null ) { if ( __ortrSrno!= null ) return false; }
			else if ( !_ortrSrno.equals(__ortrSrno) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MbpfRcvstsList2Inq_DODT.class.getName()).append(":\n");
		sb.append("\ttrnDt: ");
		sb.append(trnDt==null?"null":getTrnDt());
		sb.append("\n");
		sb.append("\ttrnSrno: ");
		sb.append(trnSrno==null?"null":getTrnSrno());
		sb.append("\n");
		sb.append("\ttrnBkcd: ");
		sb.append(trnBkcd==null?"null":getTrnBkcd());
		sb.append("\n");
		sb.append("\ttrbkCdNm: ");
		sb.append(trbkCdNm==null?"null":getTrbkCdNm());
		sb.append("\n");
		sb.append("\tptnBkwAcno: ");
		sb.append(ptnBkwAcno==null?"null":getPtnBkwAcno());
		sb.append("\n");
		sb.append("\ttrnTm: ");
		sb.append(trnTm==null?"null":getTrnTm());
		sb.append("\n");
		sb.append("\tdpsRapDscd: ");
		sb.append(dpsRapDscd==null?"null":getDpsRapDscd());
		sb.append("\n");
		sb.append("\tdpsRapDscdNm: ");
		sb.append(dpsRapDscdNm==null?"null":getDpsRapDscdNm());
		sb.append("\n");
		sb.append("\tmetTrnStcd: ");
		sb.append(metTrnStcd==null?"null":getMetTrnStcd());
		sb.append("\n");
		sb.append("\tmetTrnStcdNm: ");
		sb.append(metTrnStcdNm==null?"null":getMetTrnStcdNm());
		sb.append("\n");
		sb.append("\trcvMbhNm: ");
		sb.append(rcvMbhNm==null?"null":getRcvMbhNm());
		sb.append("\n");
		sb.append("\tmbpfPymAm: ");
		sb.append(mbpfPymAm==null?"null":getMbpfPymAm());
		sb.append("\n");
		sb.append("\tmbpfPmtgtAm: ");
		sb.append(mbpfPmtgtAm==null?"null":getMbpfPmtgtAm());
		sb.append("\n");
		sb.append("\tmetMbpfXmpAm: ");
		sb.append(metMbpfXmpAm==null?"null":getMetMbpfXmpAm());
		sb.append("\n");
		sb.append("\tinqOtlnTxt: ");
		sb.append(inqOtlnTxt==null?"null":getInqOtlnTxt());
		sb.append("\n");
		sb.append("\tpbokPrngOtlnTxt: ");
		sb.append(pbokPrngOtlnTxt==null?"null":getPbokPrngOtlnTxt());
		sb.append("\n");
		sb.append("\tmetTrnMemoTxt: ");
		sb.append(metTrnMemoTxt==null?"null":getMetTrnMemoTxt());
		sb.append("\n");
		sb.append("\tmdKdcd: ");
		sb.append(mdKdcd==null?"null":getMdKdcd());
		sb.append("\n");
		sb.append("\tmdKdcdNm: ");
		sb.append(mdKdcdNm==null?"null":getMdKdcdNm());
		sb.append("\n");
		sb.append("\tmetmbWdrYn: ");
		sb.append(metmbWdrYn==null?"null":getMetmbWdrYn());
		sb.append("\n");
		sb.append("\tortrDt: ");
		sb.append(ortrDt==null?"null":getOrtrDt());
		sb.append("\n");
		sb.append("\tortrSrno: ");
		sb.append(ortrSrno==null?"null":getOrtrSrno());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 8; /* trnDt */
		messageLen+= 8; /* trnSrno */
		messageLen+= 3; /* trnBkcd */
		messageLen+= 50; /* trbkCdNm */
		messageLen+= 20; /* ptnBkwAcno */
		messageLen+= 6; /* trnTm */
		messageLen+= 1; /* dpsRapDscd */
		messageLen+= 50; /* dpsRapDscdNm */
		messageLen+= 2; /* metTrnStcd */
		messageLen+= 50; /* metTrnStcdNm */
		messageLen+= 60; /* rcvMbhNm */
		messageLen+= 19; /* mbpfPymAm */
		messageLen+= 19; /* mbpfPmtgtAm */
		messageLen+= 19; /* metMbpfXmpAm */
		messageLen+= 10; /* inqOtlnTxt */
		messageLen+= 100; /* pbokPrngOtlnTxt */
		messageLen+= 40; /* metTrnMemoTxt */
		messageLen+= 8; /* mdKdcd */
		messageLen+= 60; /* mdKdcdNm */
		messageLen+= 1; /* metmbWdrYn */
		messageLen+= 8; /* ortrDt */
		messageLen+= 8; /* ortrSrno */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("trnDt");
		list.add("trnSrno");
		list.add("trnBkcd");
		list.add("trbkCdNm");
		list.add("ptnBkwAcno");
		list.add("trnTm");
		list.add("dpsRapDscd");
		list.add("dpsRapDscdNm");
		list.add("metTrnStcd");
		list.add("metTrnStcdNm");
		list.add("rcvMbhNm");
		list.add("mbpfPymAm");
		list.add("mbpfPmtgtAm");
		list.add("metMbpfXmpAm");
		list.add("inqOtlnTxt");
		list.add("pbokPrngOtlnTxt");
		list.add("metTrnMemoTxt");
		list.add("mdKdcd");
		list.add("mdKdcdNm");
		list.add("metmbWdrYn");
		list.add("ortrDt");
		list.add("ortrSrno");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("trnDt", get("trnDt"));
		map.put("trnSrno", get("trnSrno"));
		map.put("trnBkcd", get("trnBkcd"));
		map.put("trbkCdNm", get("trbkCdNm"));
		map.put("ptnBkwAcno", get("ptnBkwAcno"));
		map.put("trnTm", get("trnTm"));
		map.put("dpsRapDscd", get("dpsRapDscd"));
		map.put("dpsRapDscdNm", get("dpsRapDscdNm"));
		map.put("metTrnStcd", get("metTrnStcd"));
		map.put("metTrnStcdNm", get("metTrnStcdNm"));
		map.put("rcvMbhNm", get("rcvMbhNm"));
		map.put("mbpfPymAm", get("mbpfPymAm"));
		map.put("mbpfPmtgtAm", get("mbpfPmtgtAm"));
		map.put("metMbpfXmpAm", get("metMbpfXmpAm"));
		map.put("inqOtlnTxt", get("inqOtlnTxt"));
		map.put("pbokPrngOtlnTxt", get("pbokPrngOtlnTxt"));
		map.put("metTrnMemoTxt", get("metTrnMemoTxt"));
		map.put("mdKdcd", get("mdKdcd"));
		map.put("mdKdcdNm", get("mdKdcdNm"));
		map.put("metmbWdrYn", get("metmbWdrYn"));
		map.put("ortrDt", get("ortrDt"));
		map.put("ortrSrno", get("ortrSrno"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 110632544:/* trnDt */
			return getTrnDt();
		case -1055859152:/* trnSrno */
			return getTrnSrno();
		case -1056372678:/* trnBkcd */
			return getTrnBkcd();
		case 1305308647:/* trbkCdNm */
			return getTrbkCdNm();
		case 310566279:/* ptnBkwAcno */
			return getPtnBkwAcno();
		case 110633033:/* trnTm */
			return getTrnTm();
		case -1839733366:/* dpsRapDscd */
			return getDpsRapDscd();
		case 1542763753:/* dpsRapDscdNm */
			return getDpsRapDscdNm();
		case -1198078250:/* metTrnStcd */
			return getMetTrnStcd();
		case -301960395:/* metTrnStcdNm */
			return getMetTrnStcdNm();
		case -2062160595:/* rcvMbhNm */
			return getRcvMbhNm();
		case -1128356027:/* mbpfPymAm */
			return getMbpfPymAm();
		case 1940639685:/* mbpfPmtgtAm */
			return getMbpfPmtgtAm();
		case -356430944:/* metMbpfXmpAm */
			return getMetMbpfXmpAm();
		case -519074499:/* inqOtlnTxt */
			return getInqOtlnTxt();
		case 1497775840:/* pbokPrngOtlnTxt */
			return getPbokPrngOtlnTxt();
		case 2074206722:/* metTrnMemoTxt */
			return getMetTrnMemoTxt();
		case -1079704143:/* mdKdcd */
			return getMdKdcd();
		case 1786406736:/* mdKdcdNm */
			return getMdKdcdNm();
		case -964125879:/* metmbWdrYn */
			return getMetmbWdrYn();
		case -1008282607:/* ortrDt */
			return getOrtrDt();
		case 1703472033:/* ortrSrno */
			return getOrtrSrno();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 110632544:/* trnDt */
			setTrnDt((String)value);
			break;
		case -1055859152:/* trnSrno */
			setTrnSrno((Integer)value);
			break;
		case -1056372678:/* trnBkcd */
			setTrnBkcd((String)value);
			break;
		case 1305308647:/* trbkCdNm */
			setTrbkCdNm((String)value);
			break;
		case 310566279:/* ptnBkwAcno */
			setPtnBkwAcno((String)value);
			break;
		case 110633033:/* trnTm */
			setTrnTm((String)value);
			break;
		case -1839733366:/* dpsRapDscd */
			setDpsRapDscd((String)value);
			break;
		case 1542763753:/* dpsRapDscdNm */
			setDpsRapDscdNm((String)value);
			break;
		case -1198078250:/* metTrnStcd */
			setMetTrnStcd((String)value);
			break;
		case -301960395:/* metTrnStcdNm */
			setMetTrnStcdNm((String)value);
			break;
		case -2062160595:/* rcvMbhNm */
			setRcvMbhNm((String)value);
			break;
		case -1128356027:/* mbpfPymAm */
			if ( value instanceof String ){
				setMbpfPymAm((String)value);
			}
			else if ( value instanceof Double ){
				setMbpfPymAm((Double)value);
			}
			else if ( value instanceof Long ){
				setMbpfPymAm((Long)value);
			}
			else{
				setMbpfPymAm((BigDecimal)value);
			}
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
		case -356430944:/* metMbpfXmpAm */
			if ( value instanceof String ){
				setMetMbpfXmpAm((String)value);
			}
			else if ( value instanceof Double ){
				setMetMbpfXmpAm((Double)value);
			}
			else if ( value instanceof Long ){
				setMetMbpfXmpAm((Long)value);
			}
			else{
				setMetMbpfXmpAm((BigDecimal)value);
			}
			break;
		case -519074499:/* inqOtlnTxt */
			setInqOtlnTxt((String)value);
			break;
		case 1497775840:/* pbokPrngOtlnTxt */
			setPbokPrngOtlnTxt((String)value);
			break;
		case 2074206722:/* metTrnMemoTxt */
			setMetTrnMemoTxt((String)value);
			break;
		case -1079704143:/* mdKdcd */
			setMdKdcd((String)value);
			break;
		case 1786406736:/* mdKdcdNm */
			setMdKdcdNm((String)value);
			break;
		case -964125879:/* metmbWdrYn */
			setMetmbWdrYn((String)value);
			break;
		case -1008282607:/* ortrDt */
			setOrtrDt((String)value);
			break;
		case 1703472033:/* ortrSrno */
			setOrtrSrno((Integer)value);
			break;
		default:
			break;
		}
	}
	
}
