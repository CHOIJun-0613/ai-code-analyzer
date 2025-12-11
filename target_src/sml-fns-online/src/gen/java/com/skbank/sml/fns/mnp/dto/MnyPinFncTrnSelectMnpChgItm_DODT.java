/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.mnp.dto;

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
	"atsMngNo", "atsWdrBkwAcno", "cucd", "atsRcvBkcd", "rcvAcno", "atsBasDd", "atsCycd", "atsAm", "atsStaDt", "atsEndDt", "atsRqAdvpeEno", "rnpeNm", "rqspeNm", "atsTitl", "atsItcd"
	, "atsItmTxt", "atsHldyPrcBscd", "mnpChgItmDto"
}, name="MnyPinFncTrnSelectMnpChgItm_DODT")
@XmlRootElement(name="MnyPinFncTrnSelectMnpChgItm_DODT")
@BxmCategory(logicalName="머니클립변경항목조회.컴포넌트.출력.IO", description="") 
public class MnyPinFncTrnSelectMnpChgItm_DODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -135350025L;
	
	
	
	/**
	 * 자동이체관리번호
	 */
	@ApiModelProperty(
		name = "atsMngNo"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("atsMngNo")
	@BxmOmm_Field(length=13, decimal=0, description="자동이체관리번호", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=N"})
	private BigDecimal atsMngNo= new BigDecimal("0");
	
	
	/**
	 * 자동이체출금전행계좌번호
	 */
	@ApiModelProperty(
		name = "atsWdrBkwAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atsWdrBkwAcno")
	@BxmOmm_Field(length=20, decimal=0, description="자동이체출금전행계좌번호", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String atsWdrBkwAcno= "";
	
	
	/**
	 * 통화코드
	 */
	@ApiModelProperty(
		name = "cucd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("cucd")
	@BxmOmm_Field(length=3, decimal=0, description="통화코드", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String cucd= "";
	
	
	/**
	 * 자동이체입금은행코드
	 */
	@ApiModelProperty(
		name = "atsRcvBkcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atsRcvBkcd")
	@BxmOmm_Field(length=3, decimal=0, description="자동이체입금은행코드", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String atsRcvBkcd= "";
	
	
	/**
	 * 입금계좌번호
	 */
	@ApiModelProperty(
		name = "rcvAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rcvAcno")
	@BxmOmm_Field(length=15, decimal=0, description="입금계좌번호", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String rcvAcno= "";
	
	
	/**
	 * 자동이체기준일
	 */
	@ApiModelProperty(
		name = "atsBasDd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atsBasDd")
	@BxmOmm_Field(length=2, decimal=0, description="자동이체기준일", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String atsBasDd= "";
	
	
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
	 * 자동이체금액
	 */
	@ApiModelProperty(
		name = "atsAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("atsAm")
	@BxmOmm_Field(length=18, decimal=0, description="자동이체금액", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=N"})
	private BigDecimal atsAm= new BigDecimal("0");
	
	
	/**
	 * 자동이체시작일자
	 */
	@ApiModelProperty(
		name = "atsStaDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atsStaDt")
	@BxmOmm_Field(length=8, decimal=0, description="자동이체시작일자", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
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
	@BxmOmm_Field(length=8, decimal=0, description="자동이체종료일자", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String atsEndDt= "";
	
	
	/**
	 * 자동이체신청권유자직원번호
	 */
	@ApiModelProperty(
		name = "atsRqAdvpeEno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atsRqAdvpeEno")
	@BxmOmm_Field(length=8, decimal=0, description="자동이체신청권유자직원번호", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String atsRqAdvpeEno= "";
	
	
	/**
	 * 수취인명
	 */
	@ApiModelProperty(
		name = "rnpeNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rnpeNm")
	@BxmOmm_Field(length=40, decimal=0, description="수취인명", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String rnpeNm= "";
	
	
	/**
	 * 의뢰인명
	 */
	@ApiModelProperty(
		name = "rqspeNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rqspeNm")
	@BxmOmm_Field(length=16, decimal=0, description="의뢰인명", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String rqspeNm= "";
	
	
	/**
	 * 자동이체제목
	 */
	@ApiModelProperty(
		name = "atsTitl"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atsTitl")
	@BxmOmm_Field(length=30, decimal=0, description="자동이체제목", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String atsTitl= "";
	
	
	/**
	 * 자동이체항목코드
	 */
	@ApiModelProperty(
		name = "atsItcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atsItcd")
	@BxmOmm_Field(length=2, decimal=0, description="자동이체항목코드", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String atsItcd= "";
	
	
	/**
	 * 자동이체항목내용
	 */
	@ApiModelProperty(
		name = "atsItmTxt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atsItmTxt")
	@BxmOmm_Field(length=70, decimal=0, description="자동이체항목내용", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String atsItmTxt= "";
	
	
	/**
	 * 자동이체휴일처리기준코드
	 */
	@ApiModelProperty(
		name = "atsHldyPrcBscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atsHldyPrcBscd")
	@BxmOmm_Field(length=1, decimal=0, description="자동이체휴일처리기준코드", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String atsHldyPrcBscd= "";
	
	
	/**
	 * 머니클립모으기변경정보.공통.IO
	 */
	@ApiModelProperty(
		name = "mnpChgItmDto"
		, dataType = "com.skbank.sml.fns.mnp.dto.MNPMnyPinFncTrnSelectMnpChgItm_DTO"
		)
	@XmlElement
	@JsonProperty("mnpChgItmDto")
	@BxmOmm_Field(length=0, decimal=0, description="머니클립모으기변경정보.공통.IO", align="left", fill="")
	private MNPMnyPinFncTrnSelectMnpChgItm_DTO mnpChgItmDto= null;
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atsMngNo= false;
	protected final boolean isSet_atsMngNo(){
		return this.isSet_atsMngNo;
	}
	private void setIsSet_atsMngNo(boolean value){
		this.isSet_atsMngNo= value;
	}
	/**
	 * 자동이체관리번호
	 * BigDecimal - Double value setter
	 *
	 * @Param atsMngNo 자동이체관리번호
	 */
	public void setAtsMngNo(double atsMngNo) {
		setAtsMngNo(BigDecimal.valueOf(atsMngNo));
	}
	/**
	 * 자동이체관리번호
	 * BigDecimal - Long value setter
	 *
	 * @Param atsMngNo 자동이체관리번호
	 */
	public void setAtsMngNo(long atsMngNo) {
		setAtsMngNo(BigDecimal.valueOf(atsMngNo));
	}
	/**
	 * 자동이체관리번호
	 * BigDecimal - String value setter
	 *
	 * @Param atsMngNo 자동이체관리번호
	 */
	public void setAtsMngNo(String atsMngNo) {
		setAtsMngNo(new BigDecimal(atsMngNo));
	}
	/**
	 * 자동이체관리번호
	 */
	@XmlTransient
	public BigDecimal getAtsMngNo(){
		return this.atsMngNo;
	}
	
	/**
	 * 자동이체관리번호
	 * 
	 * @param atsMngNo 자동이체관리번호
	 */
	@JsonSetter("atsMngNo")
	public void setAtsMngNo(BigDecimal atsMngNo){
		this.atsMngNo= atsMngNo;
		this.setIsSet_atsMngNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atsWdrBkwAcno= false;
	protected final boolean isSet_atsWdrBkwAcno(){
		return this.isSet_atsWdrBkwAcno;
	}
	private void setIsSet_atsWdrBkwAcno(boolean value){
		this.isSet_atsWdrBkwAcno= value;
	}
	/**
	 * 자동이체출금전행계좌번호
	 */
	@XmlTransient
	public String getAtsWdrBkwAcno(){
		return this.atsWdrBkwAcno;
	}
	
	/**
	 * 자동이체출금전행계좌번호
	 * 
	 * @param atsWdrBkwAcno 자동이체출금전행계좌번호
	 */
	public void setAtsWdrBkwAcno(String atsWdrBkwAcno){
		this.atsWdrBkwAcno= atsWdrBkwAcno;
		this.setIsSet_atsWdrBkwAcno(true);
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
	private boolean isSet_atsRcvBkcd= false;
	protected final boolean isSet_atsRcvBkcd(){
		return this.isSet_atsRcvBkcd;
	}
	private void setIsSet_atsRcvBkcd(boolean value){
		this.isSet_atsRcvBkcd= value;
	}
	/**
	 * 자동이체입금은행코드
	 */
	@XmlTransient
	public String getAtsRcvBkcd(){
		return this.atsRcvBkcd;
	}
	
	/**
	 * 자동이체입금은행코드
	 * 
	 * @param atsRcvBkcd 자동이체입금은행코드
	 */
	public void setAtsRcvBkcd(String atsRcvBkcd){
		this.atsRcvBkcd= atsRcvBkcd;
		this.setIsSet_atsRcvBkcd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rcvAcno= false;
	protected final boolean isSet_rcvAcno(){
		return this.isSet_rcvAcno;
	}
	private void setIsSet_rcvAcno(boolean value){
		this.isSet_rcvAcno= value;
	}
	/**
	 * 입금계좌번호
	 */
	@XmlTransient
	public String getRcvAcno(){
		return this.rcvAcno;
	}
	
	/**
	 * 입금계좌번호
	 * 
	 * @param rcvAcno 입금계좌번호
	 */
	public void setRcvAcno(String rcvAcno){
		this.rcvAcno= rcvAcno;
		this.setIsSet_rcvAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atsBasDd= false;
	protected final boolean isSet_atsBasDd(){
		return this.isSet_atsBasDd;
	}
	private void setIsSet_atsBasDd(boolean value){
		this.isSet_atsBasDd= value;
	}
	/**
	 * 자동이체기준일
	 */
	@XmlTransient
	public String getAtsBasDd(){
		return this.atsBasDd;
	}
	
	/**
	 * 자동이체기준일
	 * 
	 * @param atsBasDd 자동이체기준일
	 */
	public void setAtsBasDd(String atsBasDd){
		this.atsBasDd= atsBasDd;
		this.setIsSet_atsBasDd(true);
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
	private boolean isSet_atsRqAdvpeEno= false;
	protected final boolean isSet_atsRqAdvpeEno(){
		return this.isSet_atsRqAdvpeEno;
	}
	private void setIsSet_atsRqAdvpeEno(boolean value){
		this.isSet_atsRqAdvpeEno= value;
	}
	/**
	 * 자동이체신청권유자직원번호
	 */
	@XmlTransient
	public String getAtsRqAdvpeEno(){
		return this.atsRqAdvpeEno;
	}
	
	/**
	 * 자동이체신청권유자직원번호
	 * 
	 * @param atsRqAdvpeEno 자동이체신청권유자직원번호
	 */
	public void setAtsRqAdvpeEno(String atsRqAdvpeEno){
		this.atsRqAdvpeEno= atsRqAdvpeEno;
		this.setIsSet_atsRqAdvpeEno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rnpeNm= false;
	protected final boolean isSet_rnpeNm(){
		return this.isSet_rnpeNm;
	}
	private void setIsSet_rnpeNm(boolean value){
		this.isSet_rnpeNm= value;
	}
	/**
	 * 수취인명
	 */
	@XmlTransient
	public String getRnpeNm(){
		return this.rnpeNm;
	}
	
	/**
	 * 수취인명
	 * 
	 * @param rnpeNm 수취인명
	 */
	public void setRnpeNm(String rnpeNm){
		this.rnpeNm= rnpeNm;
		this.setIsSet_rnpeNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rqspeNm= false;
	protected final boolean isSet_rqspeNm(){
		return this.isSet_rqspeNm;
	}
	private void setIsSet_rqspeNm(boolean value){
		this.isSet_rqspeNm= value;
	}
	/**
	 * 의뢰인명
	 */
	@XmlTransient
	public String getRqspeNm(){
		return this.rqspeNm;
	}
	
	/**
	 * 의뢰인명
	 * 
	 * @param rqspeNm 의뢰인명
	 */
	public void setRqspeNm(String rqspeNm){
		this.rqspeNm= rqspeNm;
		this.setIsSet_rqspeNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atsTitl= false;
	protected final boolean isSet_atsTitl(){
		return this.isSet_atsTitl;
	}
	private void setIsSet_atsTitl(boolean value){
		this.isSet_atsTitl= value;
	}
	/**
	 * 자동이체제목
	 */
	@XmlTransient
	public String getAtsTitl(){
		return this.atsTitl;
	}
	
	/**
	 * 자동이체제목
	 * 
	 * @param atsTitl 자동이체제목
	 */
	public void setAtsTitl(String atsTitl){
		this.atsTitl= atsTitl;
		this.setIsSet_atsTitl(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atsItcd= false;
	protected final boolean isSet_atsItcd(){
		return this.isSet_atsItcd;
	}
	private void setIsSet_atsItcd(boolean value){
		this.isSet_atsItcd= value;
	}
	/**
	 * 자동이체항목코드
	 */
	@XmlTransient
	public String getAtsItcd(){
		return this.atsItcd;
	}
	
	/**
	 * 자동이체항목코드
	 * 
	 * @param atsItcd 자동이체항목코드
	 */
	public void setAtsItcd(String atsItcd){
		this.atsItcd= atsItcd;
		this.setIsSet_atsItcd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atsItmTxt= false;
	protected final boolean isSet_atsItmTxt(){
		return this.isSet_atsItmTxt;
	}
	private void setIsSet_atsItmTxt(boolean value){
		this.isSet_atsItmTxt= value;
	}
	/**
	 * 자동이체항목내용
	 */
	@XmlTransient
	public String getAtsItmTxt(){
		return this.atsItmTxt;
	}
	
	/**
	 * 자동이체항목내용
	 * 
	 * @param atsItmTxt 자동이체항목내용
	 */
	public void setAtsItmTxt(String atsItmTxt){
		this.atsItmTxt= atsItmTxt;
		this.setIsSet_atsItmTxt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atsHldyPrcBscd= false;
	protected final boolean isSet_atsHldyPrcBscd(){
		return this.isSet_atsHldyPrcBscd;
	}
	private void setIsSet_atsHldyPrcBscd(boolean value){
		this.isSet_atsHldyPrcBscd= value;
	}
	/**
	 * 자동이체휴일처리기준코드
	 */
	@XmlTransient
	public String getAtsHldyPrcBscd(){
		return this.atsHldyPrcBscd;
	}
	
	/**
	 * 자동이체휴일처리기준코드
	 * 
	 * @param atsHldyPrcBscd 자동이체휴일처리기준코드
	 */
	public void setAtsHldyPrcBscd(String atsHldyPrcBscd){
		this.atsHldyPrcBscd= atsHldyPrcBscd;
		this.setIsSet_atsHldyPrcBscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mnpChgItmDto= false;
	protected final boolean isSet_mnpChgItmDto(){
		return this.isSet_mnpChgItmDto;
	}
	private void setIsSet_mnpChgItmDto(boolean value){
		this.isSet_mnpChgItmDto= value;
	}
	/**
	 * 머니클립모으기변경정보.공통.IO
	 */
	@XmlTransient
	public MNPMnyPinFncTrnSelectMnpChgItm_DTO getMnpChgItmDto(){
		return this.mnpChgItmDto;
	}
	
	/**
	 * 머니클립모으기변경정보.공통.IO
	 * 
	 * @param mnpChgItmDto 머니클립모으기변경정보.공통.IO
	 */
	public void setMnpChgItmDto(MNPMnyPinFncTrnSelectMnpChgItm_DTO mnpChgItmDto){
		this.mnpChgItmDto= mnpChgItmDto;
		this.setIsSet_mnpChgItmDto(true);
	}
				
	@Override
	public MnyPinFncTrnSelectMnpChgItm_DODT clone(){
		try{
			MnyPinFncTrnSelectMnpChgItm_DODT object= (MnyPinFncTrnSelectMnpChgItm_DODT)super.clone();
			if ( this.mnpChgItmDto== null ) object.mnpChgItmDto= null;
			else object.mnpChgItmDto= (MNPMnyPinFncTrnSelectMnpChgItm_DTO)this.mnpChgItmDto.clone();
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
		
		result= prime * result + ((this.atsMngNo==null)?0:this.atsMngNo.hashCode());
		result= prime * result + ((this.atsWdrBkwAcno==null)?0:this.atsWdrBkwAcno.hashCode());
		result= prime * result + ((this.cucd==null)?0:this.cucd.hashCode());
		result= prime * result + ((this.atsRcvBkcd==null)?0:this.atsRcvBkcd.hashCode());
		result= prime * result + ((this.rcvAcno==null)?0:this.rcvAcno.hashCode());
		result= prime * result + ((this.atsBasDd==null)?0:this.atsBasDd.hashCode());
		result= prime * result + ((this.atsCycd==null)?0:this.atsCycd.hashCode());
		result= prime * result + ((this.atsAm==null)?0:this.atsAm.hashCode());
		result= prime * result + ((this.atsStaDt==null)?0:this.atsStaDt.hashCode());
		result= prime * result + ((this.atsEndDt==null)?0:this.atsEndDt.hashCode());
		result= prime * result + ((this.atsRqAdvpeEno==null)?0:this.atsRqAdvpeEno.hashCode());
		result= prime * result + ((this.rnpeNm==null)?0:this.rnpeNm.hashCode());
		result= prime * result + ((this.rqspeNm==null)?0:this.rqspeNm.hashCode());
		result= prime * result + ((this.atsTitl==null)?0:this.atsTitl.hashCode());
		result= prime * result + ((this.atsItcd==null)?0:this.atsItcd.hashCode());
		result= prime * result + ((this.atsItmTxt==null)?0:this.atsItmTxt.hashCode());
		result= prime * result + ((this.atsHldyPrcBscd==null)?0:this.atsHldyPrcBscd.hashCode());
		result= prime * result + ((this.mnpChgItmDto==null)?0:this.mnpChgItmDto.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MnyPinFncTrnSelectMnpChgItm_DODT other= (MnyPinFncTrnSelectMnpChgItm_DODT)obj;
		{
			Object _atsMngNo= getAtsMngNo();
			Object __atsMngNo= other.getAtsMngNo();
			if ( _atsMngNo== null ) { if ( __atsMngNo!= null ) return false; }
			else if ( !_atsMngNo.equals(__atsMngNo) ) return false;
		}
		{
			Object _atsWdrBkwAcno= getAtsWdrBkwAcno();
			Object __atsWdrBkwAcno= other.getAtsWdrBkwAcno();
			if ( _atsWdrBkwAcno== null ) { if ( __atsWdrBkwAcno!= null ) return false; }
			else if ( !_atsWdrBkwAcno.equals(__atsWdrBkwAcno) ) return false;
		}
		{
			Object _cucd= getCucd();
			Object __cucd= other.getCucd();
			if ( _cucd== null ) { if ( __cucd!= null ) return false; }
			else if ( !_cucd.equals(__cucd) ) return false;
		}
		{
			Object _atsRcvBkcd= getAtsRcvBkcd();
			Object __atsRcvBkcd= other.getAtsRcvBkcd();
			if ( _atsRcvBkcd== null ) { if ( __atsRcvBkcd!= null ) return false; }
			else if ( !_atsRcvBkcd.equals(__atsRcvBkcd) ) return false;
		}
		{
			Object _rcvAcno= getRcvAcno();
			Object __rcvAcno= other.getRcvAcno();
			if ( _rcvAcno== null ) { if ( __rcvAcno!= null ) return false; }
			else if ( !_rcvAcno.equals(__rcvAcno) ) return false;
		}
		{
			Object _atsBasDd= getAtsBasDd();
			Object __atsBasDd= other.getAtsBasDd();
			if ( _atsBasDd== null ) { if ( __atsBasDd!= null ) return false; }
			else if ( !_atsBasDd.equals(__atsBasDd) ) return false;
		}
		{
			Object _atsCycd= getAtsCycd();
			Object __atsCycd= other.getAtsCycd();
			if ( _atsCycd== null ) { if ( __atsCycd!= null ) return false; }
			else if ( !_atsCycd.equals(__atsCycd) ) return false;
		}
		{
			Object _atsAm= getAtsAm();
			Object __atsAm= other.getAtsAm();
			if ( _atsAm== null ) { if ( __atsAm!= null ) return false; }
			else if ( !_atsAm.equals(__atsAm) ) return false;
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
			Object _atsRqAdvpeEno= getAtsRqAdvpeEno();
			Object __atsRqAdvpeEno= other.getAtsRqAdvpeEno();
			if ( _atsRqAdvpeEno== null ) { if ( __atsRqAdvpeEno!= null ) return false; }
			else if ( !_atsRqAdvpeEno.equals(__atsRqAdvpeEno) ) return false;
		}
		{
			Object _rnpeNm= getRnpeNm();
			Object __rnpeNm= other.getRnpeNm();
			if ( _rnpeNm== null ) { if ( __rnpeNm!= null ) return false; }
			else if ( !_rnpeNm.equals(__rnpeNm) ) return false;
		}
		{
			Object _rqspeNm= getRqspeNm();
			Object __rqspeNm= other.getRqspeNm();
			if ( _rqspeNm== null ) { if ( __rqspeNm!= null ) return false; }
			else if ( !_rqspeNm.equals(__rqspeNm) ) return false;
		}
		{
			Object _atsTitl= getAtsTitl();
			Object __atsTitl= other.getAtsTitl();
			if ( _atsTitl== null ) { if ( __atsTitl!= null ) return false; }
			else if ( !_atsTitl.equals(__atsTitl) ) return false;
		}
		{
			Object _atsItcd= getAtsItcd();
			Object __atsItcd= other.getAtsItcd();
			if ( _atsItcd== null ) { if ( __atsItcd!= null ) return false; }
			else if ( !_atsItcd.equals(__atsItcd) ) return false;
		}
		{
			Object _atsItmTxt= getAtsItmTxt();
			Object __atsItmTxt= other.getAtsItmTxt();
			if ( _atsItmTxt== null ) { if ( __atsItmTxt!= null ) return false; }
			else if ( !_atsItmTxt.equals(__atsItmTxt) ) return false;
		}
		{
			Object _atsHldyPrcBscd= getAtsHldyPrcBscd();
			Object __atsHldyPrcBscd= other.getAtsHldyPrcBscd();
			if ( _atsHldyPrcBscd== null ) { if ( __atsHldyPrcBscd!= null ) return false; }
			else if ( !_atsHldyPrcBscd.equals(__atsHldyPrcBscd) ) return false;
		}
		{
			Object _mnpChgItmDto= getMnpChgItmDto();
			Object __mnpChgItmDto= other.getMnpChgItmDto();
			if ( _mnpChgItmDto== null ) { if ( __mnpChgItmDto!= null ) return false; }
			else if ( !_mnpChgItmDto.equals(__mnpChgItmDto) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MnyPinFncTrnSelectMnpChgItm_DODT.class.getName()).append(":\n");
		sb.append("\tatsMngNo: ");
		sb.append(atsMngNo==null?"null":getAtsMngNo());
		sb.append("\n");
		sb.append("\tatsWdrBkwAcno: ");
		sb.append(atsWdrBkwAcno==null?"null":getAtsWdrBkwAcno());
		sb.append("\n");
		sb.append("\tcucd: ");
		sb.append(cucd==null?"null":getCucd());
		sb.append("\n");
		sb.append("\tatsRcvBkcd: ");
		sb.append(atsRcvBkcd==null?"null":getAtsRcvBkcd());
		sb.append("\n");
		sb.append("\trcvAcno: ");
		sb.append(rcvAcno==null?"null":getRcvAcno());
		sb.append("\n");
		sb.append("\tatsBasDd: ");
		sb.append(atsBasDd==null?"null":getAtsBasDd());
		sb.append("\n");
		sb.append("\tatsCycd: ");
		sb.append(atsCycd==null?"null":getAtsCycd());
		sb.append("\n");
		sb.append("\tatsAm: ");
		sb.append(atsAm==null?"null":getAtsAm());
		sb.append("\n");
		sb.append("\tatsStaDt: ");
		sb.append(atsStaDt==null?"null":getAtsStaDt());
		sb.append("\n");
		sb.append("\tatsEndDt: ");
		sb.append(atsEndDt==null?"null":getAtsEndDt());
		sb.append("\n");
		sb.append("\tatsRqAdvpeEno: ");
		sb.append(atsRqAdvpeEno==null?"null":getAtsRqAdvpeEno());
		sb.append("\n");
		sb.append("\trnpeNm: ");
		sb.append(rnpeNm==null?"null":getRnpeNm());
		sb.append("\n");
		sb.append("\trqspeNm: ");
		sb.append(rqspeNm==null?"null":getRqspeNm());
		sb.append("\n");
		sb.append("\tatsTitl: ");
		sb.append(atsTitl==null?"null":getAtsTitl());
		sb.append("\n");
		sb.append("\tatsItcd: ");
		sb.append(atsItcd==null?"null":getAtsItcd());
		sb.append("\n");
		sb.append("\tatsItmTxt: ");
		sb.append(atsItmTxt==null?"null":getAtsItmTxt());
		sb.append("\n");
		sb.append("\tatsHldyPrcBscd: ");
		sb.append(atsHldyPrcBscd==null?"null":getAtsHldyPrcBscd());
		sb.append("\n");
		sb.append("\tmnpChgItmDto: ");
		sb.append(mnpChgItmDto==null?"null":getMnpChgItmDto());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 13; /* atsMngNo */
		messageLen+= 20; /* atsWdrBkwAcno */
		messageLen+= 3; /* cucd */
		messageLen+= 3; /* atsRcvBkcd */
		messageLen+= 15; /* rcvAcno */
		messageLen+= 2; /* atsBasDd */
		messageLen+= 2; /* atsCycd */
		messageLen+= 18; /* atsAm */
		messageLen+= 8; /* atsStaDt */
		messageLen+= 8; /* atsEndDt */
		messageLen+= 8; /* atsRqAdvpeEno */
		messageLen+= 40; /* rnpeNm */
		messageLen+= 16; /* rqspeNm */
		messageLen+= 30; /* atsTitl */
		messageLen+= 2; /* atsItcd */
		messageLen+= 70; /* atsItmTxt */
		messageLen+= 1; /* atsHldyPrcBscd */
		if ( mnpChgItmDto != null && !(mnpChgItmDto instanceof Predictable) )
			throw new IllegalStateException( "Message length can not be predicted.");
		{
			MNPMnyPinFncTrnSelectMnpChgItm_DTO temp= mnpChgItmDto;
			if ( temp== null ) temp= new MNPMnyPinFncTrnSelectMnpChgItm_DTO();
			messageLen+= ( (Predictable)temp).predictMessageLength(); /* mnpChgItmDto */
		}
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("atsMngNo");
		list.add("atsWdrBkwAcno");
		list.add("cucd");
		list.add("atsRcvBkcd");
		list.add("rcvAcno");
		list.add("atsBasDd");
		list.add("atsCycd");
		list.add("atsAm");
		list.add("atsStaDt");
		list.add("atsEndDt");
		list.add("atsRqAdvpeEno");
		list.add("rnpeNm");
		list.add("rqspeNm");
		list.add("atsTitl");
		list.add("atsItcd");
		list.add("atsItmTxt");
		list.add("atsHldyPrcBscd");
		list.add("mnpChgItmDto");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("atsMngNo", get("atsMngNo"));
		map.put("atsWdrBkwAcno", get("atsWdrBkwAcno"));
		map.put("cucd", get("cucd"));
		map.put("atsRcvBkcd", get("atsRcvBkcd"));
		map.put("rcvAcno", get("rcvAcno"));
		map.put("atsBasDd", get("atsBasDd"));
		map.put("atsCycd", get("atsCycd"));
		map.put("atsAm", get("atsAm"));
		map.put("atsStaDt", get("atsStaDt"));
		map.put("atsEndDt", get("atsEndDt"));
		map.put("atsRqAdvpeEno", get("atsRqAdvpeEno"));
		map.put("rnpeNm", get("rnpeNm"));
		map.put("rqspeNm", get("rqspeNm"));
		map.put("atsTitl", get("atsTitl"));
		map.put("atsItcd", get("atsItcd"));
		map.put("atsItmTxt", get("atsItmTxt"));
		map.put("atsHldyPrcBscd", get("atsHldyPrcBscd"));
		map.put("mnpChgItmDto", get("mnpChgItmDto"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 491964551:/* atsMngNo */
			return getAtsMngNo();
		case 1366640524:/* atsWdrBkwAcno */
			return getAtsWdrBkwAcno();
		case 3064915:/* cucd */
			return getCucd();
		case 172656047:/* atsRcvBkcd */
			return getAtsRcvBkcd();
		case 1041501032:/* rcvAcno */
			return getRcvAcno();
		case 481429748:/* atsBasDd */
			return getAtsBasDd();
		case -677154281:/* atsCycd */
			return getAtsCycd();
		case 93149932:/* atsAm */
			return getAtsAm();
		case 497678352:/* atsStaDt */
			return getAtsStaDt();
		case 484573195:/* atsEndDt */
			return getAtsEndDt();
		case 1248629757:/* atsRqAdvpeEno */
			return getAtsRqAdvpeEno();
		case -926220592:/* rnpeNm */
			return getRnpeNm();
		case 1440939688:/* rqspeNm */
			return getRqspeNm();
		case -676662675:/* atsTitl */
			return getAtsTitl();
		case -676980340:/* atsItcd */
			return getAtsItcd();
		case -2037758674:/* atsItmTxt */
			return getAtsItmTxt();
		case 1622868250:/* atsHldyPrcBscd */
			return getAtsHldyPrcBscd();
		case -298460432:/* mnpChgItmDto */
			return getMnpChgItmDto();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 491964551:/* atsMngNo */
			if ( value instanceof String ){
				setAtsMngNo((String)value);
			}
			else if ( value instanceof Double ){
				setAtsMngNo((Double)value);
			}
			else if ( value instanceof Long ){
				setAtsMngNo((Long)value);
			}
			else{
				setAtsMngNo((BigDecimal)value);
			}
			break;
		case 1366640524:/* atsWdrBkwAcno */
			setAtsWdrBkwAcno((String)value);
			break;
		case 3064915:/* cucd */
			setCucd((String)value);
			break;
		case 172656047:/* atsRcvBkcd */
			setAtsRcvBkcd((String)value);
			break;
		case 1041501032:/* rcvAcno */
			setRcvAcno((String)value);
			break;
		case 481429748:/* atsBasDd */
			setAtsBasDd((String)value);
			break;
		case -677154281:/* atsCycd */
			setAtsCycd((String)value);
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
		case 497678352:/* atsStaDt */
			setAtsStaDt((String)value);
			break;
		case 484573195:/* atsEndDt */
			setAtsEndDt((String)value);
			break;
		case 1248629757:/* atsRqAdvpeEno */
			setAtsRqAdvpeEno((String)value);
			break;
		case -926220592:/* rnpeNm */
			setRnpeNm((String)value);
			break;
		case 1440939688:/* rqspeNm */
			setRqspeNm((String)value);
			break;
		case -676662675:/* atsTitl */
			setAtsTitl((String)value);
			break;
		case -676980340:/* atsItcd */
			setAtsItcd((String)value);
			break;
		case -2037758674:/* atsItmTxt */
			setAtsItmTxt((String)value);
			break;
		case 1622868250:/* atsHldyPrcBscd */
			setAtsHldyPrcBscd((String)value);
			break;
		case -298460432:/* mnpChgItmDto */
			setMnpChgItmDto((MNPMnyPinFncTrnSelectMnpChgItm_DTO)value);
			break;
		default:
			break;
		}
	}
	
}
